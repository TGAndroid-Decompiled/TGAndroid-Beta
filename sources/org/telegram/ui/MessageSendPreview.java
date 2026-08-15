package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.view.KeyEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManagerFixed;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.WindowVisibilityManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScrimOptions;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.spoilers.SpoilerEffect2;
import org.telegram.ui.EmojiAnimationsOverlay;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;
import org.telegram.ui.recyclerview.ChatListItemAnimator;

public class MessageSendPreview extends Dialog implements NotificationCenter.NotificationCenterDelegate {
    private WindowVisibilityManager.Controller activityVisibilityController;
    private final RecyclerView.Adapter adapter;
    public boolean allowRelayout;
    private ChatActivityEnterView.SendButton anchorSendButton;
    private Bitmap blurBitmap;
    private Paint blurBitmapPaint;
    private BitmapShader blurBitmapShader;
    private Matrix blurMatrix;
    private Paint buttonBgPaint;
    private Text buttonText;
    private RectF cameraRect;
    private Rect cellDelta;
    private final GridLayoutManagerFixed chatLayoutManager;
    private final RecyclerListView chatListView;
    private boolean closing;
    private final FrameLayout containerView;
    public final Context context;
    public final int currentAccount;
    private boolean customSendButtonWidth;
    private ChatMessageCell destCell;
    private float destClipBottom;
    private float destClipTop;
    private boolean dismissing;
    private Utilities.Callback2 drawEditText;
    private Utilities.Callback drawEditTextBackground;
    private ChatMessageCell dummyMessageCell;
    private EditTextCaption editText;
    private Paint editTextBackgroundPaint;
    private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable effectDrawable;
    private long effectId;
    private EmojiAnimationsOverlay effectOverlay;
    private ReactionsContainerLayout effectSelector;
    private FrameLayout effectSelectorContainer;
    private float effectSelectorContainerY;
    private boolean effectSelectorShown;
    private final FrameLayout effectsView;
    private boolean firstOpenFrame;
    private boolean firstOpenFrame2;
    private boolean focusable;
    private VisiblePart fromPart;
    private final LongSparseArray groupedMessagesMap;
    private final BlurredBackgroundDrawableViewFactory iBlur3Factory;
    private final BlurredBackgroundSourceBitmap iBlur3SourceBitmap;
    private Insets insets;
    private boolean keyboardVisible;
    private boolean layoutDone;
    private ChatMessageCell mainMessageCell;
    private int mainMessageCellId;
    private final ArrayList messageObjects;
    private int messageObjectsWidth;
    private ValueAnimator openAnimator;
    private boolean openInProgress;
    private float openProgress;
    private boolean opening;
    private View optionsView;
    public final Theme.ResourcesProvider resourcesProvider;
    private boolean scrolledToLast;
    private ChatActivityEnterView.SendButton sendButton;
    private final int[] sendButtonInitialPosition;
    private int sendButtonWidth;
    private boolean sent;
    private boolean sentEffect;
    private SpoilerEffect2 spoilerEffect2;
    private final FrameLayout windowView;

    protected void onEffectChange(long j) {
    }

    public void updateColors() {
    }

    public int getMainMessageCellPosition() {
        if (this.groupedMessagesMap.isEmpty() || this.messageObjects.size() < 10) {
            return 0;
        }
        return this.messageObjects.size() % 10;
    }

    public MessageSendPreview(final Context context, final Theme.ResourcesProvider resourcesProvider) {
        super(context, R.style.TransparentDialog);
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.insets = Insets.NONE;
        this.messageObjects = new ArrayList();
        this.groupedMessagesMap = new LongSparseArray();
        this.editTextBackgroundPaint = new Paint(1);
        this.sendButtonInitialPosition = new int[2];
        this.dismissing = false;
        this.cellDelta = new Rect();
        this.context = context;
        this.resourcesProvider = resourcesProvider;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.activityVisibilityController = LaunchActivity.obtainActivityVisibilityController();
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (MessageSendPreview.this.activityVisibilityController != null) {
                    MessageSendPreview.this.activityVisibilityController.setHidden(MessageSendPreview.this.openProgress == 1.0f && MessageSendPreview.this.blurBitmapPaint != null);
                }
                if (MessageSendPreview.this.openProgress > 0.0f && MessageSendPreview.this.blurBitmapPaint != null) {
                    MessageSendPreview.this.blurMatrix.reset();
                    float width = getWidth() / MessageSendPreview.this.blurBitmap.getWidth();
                    MessageSendPreview.this.blurMatrix.postScale(width, width);
                    MessageSendPreview.this.blurBitmapShader.setLocalMatrix(MessageSendPreview.this.blurMatrix);
                    MessageSendPreview.this.blurBitmapPaint.setAlpha((int) (MessageSendPreview.this.openProgress * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), MessageSendPreview.this.blurBitmapPaint);
                }
                super.dispatchDraw(canvas);
            }

            @Override
            public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    MessageSendPreview.this.onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            }

            @Override
            protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                super.onLayout(z, i2, i3, i4, i5);
                if (!MessageSendPreview.this.layoutDone || MessageSendPreview.this.allowRelayout) {
                    MessageSendPreview.this.layout();
                    MessageSendPreview.this.layoutDone = true;
                }
            }

            @Override
            protected void onSizeChanged(int i2, int i3, int i4, int i5) {
                super.onSizeChanged(i2, i3, i4, i5);
                MessageSendPreview.this.checkBitmapMatrix();
            }
        };
        this.windowView = frameLayout;
        this.spoilerEffect2 = SpoilerEffect2.getInstance(1, frameLayout, frameLayout);
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$0(view);
            }
        });
        frameLayout.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() {
            @Override
            public final void onGlobalFocusChanged(View view, View view2) {
                this.f$0.lambda$new$3(view, view2);
            }
        });
        BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = new BlurredBackgroundSourceBitmap();
        this.iBlur3SourceBitmap = blurredBackgroundSourceBitmap;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceBitmap);
        this.iBlur3Factory = blurredBackgroundDrawableViewFactory;
        blurredBackgroundDrawableViewFactory.setSourceRootView(new ViewPositionWatcher(frameLayout), frameLayout);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(context, resourcesProvider);
        this.containerView = anonymousClass2;
        anonymousClass2.setClipToPadding(false);
        frameLayout.addView(anonymousClass2, LayoutHelper.createFrame(-1, -1, 119));
        ViewCompat.setOnApplyWindowInsetsListener(frameLayout, new OnApplyWindowInsetsListener() {
            @Override
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                MessageSendPreview.this.insets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
                MessageSendPreview.this.containerView.setPadding(MessageSendPreview.this.insets.left, MessageSendPreview.this.insets.top, MessageSendPreview.this.insets.right, MessageSendPreview.this.insets.bottom);
                MessageSendPreview.this.windowView.requestLayout();
                return WindowInsetsCompat.CONSUMED;
            }
        });
        RecyclerListView recyclerListView = new RecyclerListView(context, resourcesProvider) {
            private final AnimatedFloat bottom;
            private final GradientClip clip;
            private final ArrayList drawingGroups = new ArrayList(10);
            private final AnimatedFloat top;

            {
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                this.top = new AnimatedFloat(this, 0L, 360L, cubicBezierInterpolator);
                this.bottom = new AnimatedFloat(this, 0L, 360L, cubicBezierInterpolator);
                this.clip = new GradientClip();
            }

            @Override
            protected void onMeasure(int i2, int i3) {
                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(MessageSendPreview.this.messageObjects.isEmpty() ? -6.0f : 48.0f) + (MessageSendPreview.this.optionsView == null ? 0 : MessageSendPreview.this.optionsView.getMeasuredHeight()))) - AndroidUtilities.dp(8.0f)) - MessageSendPreview.this.insets.top), Integer.MIN_VALUE));
                int iMax = Math.max(MessageSendPreview.this.getSendButtonWidth() + AndroidUtilities.dp(12.0f), -((MessageSendPreview.this.sendButtonInitialPosition[0] + AndroidUtilities.dp(7.0f)) - getMeasuredWidth()));
                float fMax = Math.max(1, getMeasuredWidth() - iMax) / Math.max(1, ((getMeasuredWidth() - iMax) - AndroidUtilities.dp(8.0f)) + Math.max(0, MessageSendPreview.this.messageObjectsWidth - ((getMeasuredWidth() - iMax) - AndroidUtilities.dp((MessageSendPreview.this.groupedMessagesMap.isEmpty() ? 0 : 40) + 8))));
                setPivotX(getMeasuredWidth());
                setPivotY(getMeasuredHeight());
                setScaleX(fMax);
                setScaleY(fMax);
            }

            @Override
            protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt.getTop() != 0 && (childAt instanceof MessageCell)) {
                        MessageCell messageCell = (MessageCell) childAt;
                        messageCell.top = childAt.getTop();
                        messageCell.bottom = childAt.getBottom();
                        messageCell.pastId = messageCell.getMessageObject().getId();
                    }
                }
                super.onLayout(z, i2, i3, i4, i5);
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                MessageSendPreview.this.updateMessagesVisiblePart();
                canvas.saveLayerAlpha(0.0f, getScrollY() + 1, getWidth(), (getScrollY() + getHeight()) - 1, 255, 31);
                canvas.save();
                drawChatBackgroundElements(canvas);
                super.dispatchDraw(canvas);
                drawChatForegroundElements(canvas);
                canvas.save();
                float f = this.top.set(canScrollVertically(-1));
                float f2 = this.bottom.set(canScrollVertically(1));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, getScrollY(), getWidth(), getScrollY() + AndroidUtilities.dp(14.0f));
                this.clip.draw(canvas, rectF, true, f);
                rectF.set(0.0f, (getScrollY() + getHeight()) - AndroidUtilities.dp(14.0f), getWidth(), getScrollY() + getHeight());
                this.clip.draw(canvas, rectF, false, f2);
                canvas.restore();
                canvas.restore();
                canvas.restore();
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                if (MessageSendPreview.this.openInProgress && ((view == MessageSendPreview.this.mainMessageCell && MessageSendPreview.this.mainMessageCell != null && MessageSendPreview.this.mainMessageCell.getCurrentPosition() == null) || view == MessageSendPreview.this.sendButton)) {
                    return false;
                }
                if (!(view instanceof ChatMessageCell)) {
                    return true;
                }
                ChatMessageCell chatMessageCell = (ChatMessageCell) view;
                chatMessageCell.setInvalidatesParent(true);
                chatMessageCell.drawCheckBox(canvas);
                canvas.save();
                canvas.translate(chatMessageCell.getX(), chatMessageCell.getY());
                canvas.scale(chatMessageCell.getScaleX(), chatMessageCell.getScaleY(), chatMessageCell.getPivotX(), chatMessageCell.getPivotY());
                if (chatMessageCell.drawBackgroundInParent() && chatMessageCell.getCurrentPosition() == null) {
                    canvas.save();
                    canvas.translate(0.0f, chatMessageCell.getPaddingTop());
                    chatMessageCell.drawBackgroundInternal(canvas, true);
                    canvas.restore();
                }
                canvas.restore();
                boolean zDrawChild = super.drawChild(canvas, view, j);
                canvas.save();
                canvas.translate(chatMessageCell.getX(), chatMessageCell.getY() + chatMessageCell.getPaddingTop());
                canvas.scale(chatMessageCell.getScaleX(), chatMessageCell.getScaleY(), chatMessageCell.getPivotX(), chatMessageCell.getPivotY());
                if (chatMessageCell.getCurrentPosition() != null && (((chatMessageCell.getCurrentPosition().flags & chatMessageCell.captionFlag()) != 0 && (chatMessageCell.getCurrentPosition().flags & 1) != 0) || (chatMessageCell.getCurrentMessagesGroup() != null && chatMessageCell.getCurrentMessagesGroup().isDocuments))) {
                    chatMessageCell.drawCaptionLayout(canvas, false, chatMessageCell.getAlpha());
                }
                if (chatMessageCell.getCurrentPosition() != null && (((chatMessageCell.getCurrentPosition().flags & 8) != 0 && (chatMessageCell.getCurrentPosition().flags & 1) != 0) || (chatMessageCell.getCurrentMessagesGroup() != null && chatMessageCell.getCurrentMessagesGroup().isDocuments))) {
                    chatMessageCell.drawReactionsLayout(canvas, chatMessageCell.getAlpha(), null);
                    chatMessageCell.drawCommentLayout(canvas, chatMessageCell.getAlpha());
                }
                if (chatMessageCell.getCurrentPosition() != null) {
                    chatMessageCell.drawNamesLayout(canvas, chatMessageCell.getAlpha());
                }
                if (chatMessageCell.getCurrentPosition() == null || chatMessageCell.getCurrentPosition().last) {
                    chatMessageCell.drawTime(canvas, chatMessageCell.getAlpha(), true);
                }
                chatMessageCell.drawOutboundsContent(canvas);
                chatMessageCell.getTransitionParams().recordDrawingStatePreview();
                canvas.restore();
                chatMessageCell.setInvalidatesParent(false);
                return zDrawChild;
            }

            private void drawChatBackgroundElements(android.graphics.Canvas r29) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.MessageSendPreview.AnonymousClass4.drawChatBackgroundElements(android.graphics.Canvas):void");
            }

            private void drawChatForegroundElements(Canvas canvas) {
                MessageObject.GroupedMessages currentMessagesGroup;
                ChatMessageCell chatMessageCell;
                MessageObject.GroupedMessages currentMessagesGroup2;
                int childCount = getChildCount();
                MessageObject.GroupedMessages groupedMessages = null;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof ChatMessageCell) && ((currentMessagesGroup2 = (chatMessageCell = (ChatMessageCell) childAt).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != groupedMessages)) {
                        if (currentMessagesGroup2 == null) {
                            MessageSendPreview.this.drawStarsPrice(canvas, chatMessageCell.getBoundsLeft(), chatMessageCell.getY(), chatMessageCell.getBoundsRight(), chatMessageCell.getY() + chatMessageCell.getHeight());
                        }
                        groupedMessages = currentMessagesGroup2;
                    }
                }
                for (int i3 = 0; i3 < 3; i3++) {
                    this.drawingGroups.clear();
                    if (i3 != 2 || MessageSendPreview.this.chatListView.isFastScrollAnimationRunning()) {
                        for (int i4 = 0; i4 < childCount; i4++) {
                            View childAt2 = MessageSendPreview.this.chatListView.getChildAt(i4);
                            if (childAt2 instanceof ChatMessageCell) {
                                ChatMessageCell chatMessageCell2 = (ChatMessageCell) childAt2;
                                if (childAt2.getY() <= MessageSendPreview.this.chatListView.getHeight() && childAt2.getY() + childAt2.getHeight() >= 0.0f && (currentMessagesGroup = chatMessageCell2.getCurrentMessagesGroup()) != null && ((i3 != 0 || currentMessagesGroup.messages.size() != 1) && ((i3 != 1 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i3 != 0 || !chatMessageCell2.getMessageObject().deleted) && ((i3 != 1 || chatMessageCell2.getMessageObject().deleted) && ((i3 != 2 || chatMessageCell2.willRemovedAfterAnimation()) && (i3 == 2 || !chatMessageCell2.willRemovedAfterAnimation()))))))) {
                                    if (!this.drawingGroups.contains(currentMessagesGroup)) {
                                        MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                        transitionParams.left = 0;
                                        transitionParams.top = 0;
                                        transitionParams.right = 0;
                                        transitionParams.bottom = 0;
                                        transitionParams.pinnedBotton = false;
                                        transitionParams.pinnedTop = false;
                                        transitionParams.cell = chatMessageCell2;
                                        this.drawingGroups.add(currentMessagesGroup);
                                    }
                                    currentMessagesGroup.transitionParams.pinnedTop = chatMessageCell2.isPinnedTop();
                                    currentMessagesGroup.transitionParams.pinnedBotton = chatMessageCell2.isPinnedBottom();
                                    int x = (int) (chatMessageCell2.getX() + chatMessageCell2.getBackgroundDrawableLeft());
                                    int x2 = (int) (chatMessageCell2.getX() + chatMessageCell2.getBackgroundDrawableRight());
                                    int y = (int) (chatMessageCell2.getY() + chatMessageCell2.getPaddingTop() + chatMessageCell2.getBackgroundDrawableTop());
                                    int y2 = (int) (chatMessageCell2.getY() + chatMessageCell2.getPaddingTop() + chatMessageCell2.getBackgroundDrawableBottom());
                                    if ((chatMessageCell2.getCurrentPosition().flags & 4) == 0) {
                                        y -= AndroidUtilities.dp(10.0f);
                                    }
                                    if ((chatMessageCell2.getCurrentPosition().flags & 8) == 0) {
                                        y2 += AndroidUtilities.dp(10.0f);
                                    }
                                    if (chatMessageCell2.willRemovedAfterAnimation()) {
                                        currentMessagesGroup.transitionParams.cell = chatMessageCell2;
                                    }
                                    MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                                    int i5 = transitionParams2.top;
                                    if (i5 == 0 || y < i5) {
                                        transitionParams2.top = y;
                                    }
                                    int i6 = transitionParams2.bottom;
                                    if (i6 == 0 || y2 > i6) {
                                        transitionParams2.bottom = y2;
                                    }
                                    int i7 = transitionParams2.left;
                                    if (i7 == 0 || x < i7) {
                                        transitionParams2.left = x;
                                    }
                                    int i8 = transitionParams2.right;
                                    if (i8 == 0 || x2 > i8) {
                                        transitionParams2.right = x2;
                                    }
                                }
                            }
                        }
                        for (int i9 = 0; i9 < this.drawingGroups.size(); i9++) {
                            MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) this.drawingGroups.get(i9);
                            float nonAnimationTranslationX = groupedMessages2.transitionParams.cell.getNonAnimationTranslationX(true);
                            MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                            float f = transitionParams3.left + nonAnimationTranslationX + transitionParams3.offsetLeft;
                            float f2 = transitionParams3.top + transitionParams3.offsetTop;
                            float f3 = transitionParams3.right + nonAnimationTranslationX + transitionParams3.offsetRight;
                            float measuredHeight = transitionParams3.bottom + transitionParams3.offsetBottom;
                            if (f2 < (-AndroidUtilities.dp(20.0f))) {
                                f2 = -AndroidUtilities.dp(20.0f);
                            }
                            float f4 = f2;
                            if (measuredHeight > MessageSendPreview.this.chatListView.getMeasuredHeight() + AndroidUtilities.dp(20.0f)) {
                                measuredHeight = MessageSendPreview.this.chatListView.getMeasuredHeight() + AndroidUtilities.dp(20.0f);
                            }
                            MessageSendPreview.this.drawStarsPrice(canvas, f, f4, f3, measuredHeight);
                            groupedMessages2.transitionParams.cell = null;
                        }
                    }
                }
            }
        };
        this.chatListView = recyclerListView;
        recyclerListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$4(view);
            }
        });
        recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                this.f$0.lambda$new$5(view, i2);
            }
        });
        recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                MessageSendPreview.this.chatListView.invalidate();
            }
        });
        recyclerListView.setItemAnimator(new AnonymousClass6(null, recyclerListView, resourcesProvider));
        GridLayoutManagerFixed gridLayoutManagerFixed = new GridLayoutManagerFixed(context, 1000, 1, true) {
            boolean computingScroll;

            @Override
            public boolean supportsPredictiveItemAnimations() {
                return true;
            }

            @Override
            public int computeVerticalScrollExtent(RecyclerView.State state) {
                this.computingScroll = true;
                int iComputeVerticalScrollExtent = super.computeVerticalScrollExtent(state);
                this.computingScroll = false;
                return iComputeVerticalScrollExtent;
            }

            @Override
            public int computeVerticalScrollOffset(RecyclerView.State state) {
                this.computingScroll = true;
                int iComputeVerticalScrollOffset = super.computeVerticalScrollOffset(state);
                this.computingScroll = false;
                return iComputeVerticalScrollOffset;
            }

            @Override
            public int computeVerticalScrollRange(RecyclerView.State state) {
                this.computingScroll = true;
                int iComputeVerticalScrollRange = super.computeVerticalScrollRange(state);
                this.computingScroll = false;
                return iComputeVerticalScrollRange;
            }

            @Override
            public boolean shouldLayoutChildFromOpositeSide(View view) {
                if (view instanceof ChatMessageCell) {
                    return !((ChatMessageCell) view).getMessageObject().isOutOwner();
                }
                return false;
            }

            @Override
            protected boolean hasSiblingChild(int i2) {
                byte b;
                MessageObject messageObject = (MessageObject) MessageSendPreview.this.messageObjects.get((getItemCount() - 1) - i2);
                MessageObject.GroupedMessages validGroupedMessage = MessageSendPreview.this.getValidGroupedMessage(messageObject);
                if (validGroupedMessage != null) {
                    MessageObject.GroupedMessagePosition position = validGroupedMessage.getPosition(messageObject);
                    if (position.minX != position.maxX && (b = position.minY) == position.maxY && b != 0) {
                        int size = validGroupedMessage.posArray.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            MessageObject.GroupedMessagePosition groupedMessagePosition = validGroupedMessage.posArray.get(i3);
                            if (groupedMessagePosition != position) {
                                byte b2 = groupedMessagePosition.minY;
                                byte b3 = position.minY;
                                if (b2 <= b3 && groupedMessagePosition.maxY >= b3) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }
        };
        this.chatLayoutManager = gridLayoutManagerFixed;
        gridLayoutManagerFixed.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i2) {
                MessageObject messageObject = (MessageObject) MessageSendPreview.this.messageObjects.get((MessageSendPreview.this.messageObjects.size() - 1) - i2);
                MessageObject.GroupedMessages validGroupedMessage = MessageSendPreview.this.getValidGroupedMessage(messageObject);
                if (validGroupedMessage != null) {
                    return validGroupedMessage.getPosition(messageObject).spanSize;
                }
                return 1000;
            }
        });
        recyclerListView.setLayoutManager(gridLayoutManagerFixed);
        recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                ChatMessageCell chatMessageCell;
                MessageObject.GroupedMessages currentMessagesGroup;
                MessageObject.GroupedMessagePosition currentPosition;
                int i2 = 0;
                rect.bottom = 0;
                if (!(view instanceof ChatMessageCell) || (currentMessagesGroup = (chatMessageCell = (ChatMessageCell) view).getCurrentMessagesGroup()) == null || (currentPosition = chatMessageCell.getCurrentPosition()) == null || currentPosition.siblingHeights == null) {
                    return;
                }
                Point point = AndroidUtilities.displaySize;
                float fMax = Math.max(point.x, point.y) * 0.5f;
                int extraInsetHeight = chatMessageCell.getExtraInsetHeight();
                int i3 = 0;
                while (true) {
                    if (i3 >= currentPosition.siblingHeights.length) {
                        break;
                    }
                    extraInsetHeight += (int) Math.ceil(r3[i3] * fMax);
                    i3++;
                }
                int iRound = extraInsetHeight + ((currentPosition.maxY - currentPosition.minY) * Math.round(AndroidUtilities.density * 7.0f));
                int size = currentMessagesGroup.posArray.size();
                while (true) {
                    if (i2 < size) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition = currentMessagesGroup.posArray.get(i2);
                        byte b = groupedMessagePosition.minY;
                        byte b2 = currentPosition.minY;
                        if (b == b2 && ((groupedMessagePosition.minX != currentPosition.minX || groupedMessagePosition.maxX != currentPosition.maxX || b != b2 || groupedMessagePosition.maxY != currentPosition.maxY) && b == b2)) {
                            iRound -= ((int) Math.ceil(fMax * groupedMessagePosition.ph)) - AndroidUtilities.dp(4.0f);
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
                rect.bottom = -iRound;
            }
        });
        RecyclerView.Adapter adapter = new RecyclerView.Adapter() {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
                MessageSendPreview messageSendPreview = MessageSendPreview.this;
                MessageCell messageCell = messageSendPreview.new MessageCell(context, messageSendPreview.currentAccount, true, null, resourcesProvider);
                messageCell.setDelegate(new ChatMessageCell.ChatMessageCellDelegate() {
                    @Override
                    public boolean allowAddPollOptions() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$allowAddPollOptions(this);
                    }

                    @Override
                    public boolean canDrawOutboundsContent() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canDrawOutboundsContent(this);
                    }

                    @Override
                    public boolean canPerformActions() {
                        return false;
                    }

                    @Override
                    public boolean canPerformReply() {
                        return canPerformActions();
                    }

                    @Override
                    public boolean canSaveRichDocument(ChatMessageCell chatMessageCell) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canSaveRichDocument(this, chatMessageCell);
                    }

                    @Override
                    public boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canToggleRichMessageCheckbox(this, chatMessageCell);
                    }

                    @Override
                    public void didLongPress(ChatMessageCell chatMessageCell, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPress(this, chatMessageCell, f, f2);
                    }

                    @Override
                    public void didLongPressBotButton(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressBotButton(this, chatMessageCell, keyboardButtonProto);
                    }

                    @Override
                    public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i3, float f, float f2) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressChannelAvatar(this, chatMessageCell, chat, i3, f, f2);
                    }

                    @Override
                    public void didLongPressCustomBotButton(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressCustomBotButton(this, chatMessageCell, buttonCustom);
                    }

                    @Override
                    public boolean didLongPressPollOption(ChatMessageCell chatMessageCell, TLRPC.PollAnswer pollAnswer) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressPollOption(this, chatMessageCell, pollAnswer);
                    }

                    @Override
                    public boolean didLongPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressToDoButton(this, chatMessageCell, todoItem);
                    }

                    @Override
                    public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressUserAvatar(this, chatMessageCell, user, f, f2);
                    }

                    @Override
                    public void didPressAboutRevenueSharingAds() {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAboutRevenueSharingAds(this);
                    }

                    @Override
                    public void didPressAddPollOptionButton(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAddPollOptionButton(this, chatMessageCell);
                    }

                    @Override
                    public void didPressAdmin(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAdmin(this, chatMessageCell);
                    }

                    @Override
                    public boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell, AnimatedEmojiSpan animatedEmojiSpan) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAnimatedEmoji(this, chatMessageCell, animatedEmojiSpan);
                    }

                    @Override
                    public void didPressAppUpdateButton() {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAppUpdateButton(this);
                    }

                    @Override
                    public void didPressBoostCounter(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBoostCounter(this, chatMessageCell);
                    }

                    @Override
                    public void didPressBotButton(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBotButton(this, chatMessageCell, keyboardButtonProto);
                    }

                    @Override
                    public void didPressCancelSendButton(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCancelSendButton(this, chatMessageCell);
                    }

                    @Override
                    public void didPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i3, float f, float f2, boolean z) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelAvatar(this, chatMessageCell, chat, i3, f, f2, z);
                    }

                    @Override
                    public void didPressChannelRecommendation(ChatMessageCell chatMessageCell, TLObject tLObject, boolean z) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelRecommendation(this, chatMessageCell, tLObject, z);
                    }

                    @Override
                    public void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelRecommendationsClose(this, chatMessageCell);
                    }

                    @Override
                    public void didPressCodeCopy(ChatMessageCell chatMessageCell, MessageObject.TextLayoutBlock textLayoutBlock) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCodeCopy(this, chatMessageCell, textLayoutBlock);
                    }

                    @Override
                    public void didPressCommentButton(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCommentButton(this, chatMessageCell);
                    }

                    @Override
                    public void didPressCustomBotButton(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCustomBotButton(this, chatMessageCell, buttonCustom);
                    }

                    @Override
                    public void didPressEffect(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressEffect(this, chatMessageCell);
                    }

                    @Override
                    public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressExtendedMediaPreview(this, chatMessageCell, keyboardInlineButton);
                    }

                    @Override
                    public void didPressFactCheck(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressFactCheck(this, chatMessageCell);
                    }

                    @Override
                    public void didPressFactCheckWhat(ChatMessageCell chatMessageCell, int i3, int i4) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressFactCheckWhat(this, chatMessageCell, i3, i4);
                    }

                    @Override
                    public void didPressGiveawayChatButton(ChatMessageCell chatMessageCell, int i3) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressGiveawayChatButton(this, chatMessageCell, i3);
                    }

                    @Override
                    public void didPressGroupImage(ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressGroupImage(this, chatMessageCell, imageReceiver, messageExtendedMedia, f, f2);
                    }

                    @Override
                    public void didPressHiddenForward(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHiddenForward(this, chatMessageCell);
                    }

                    @Override
                    public void didPressHint(ChatMessageCell chatMessageCell, int i3) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHint(this, chatMessageCell, i3);
                    }

                    @Override
                    public void didPressImage(ChatMessageCell chatMessageCell, float f, float f2, boolean z) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressImage(this, chatMessageCell, f, f2, z);
                    }

                    @Override
                    public void didPressInstantButton(ChatMessageCell chatMessageCell, int i3) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressInstantButton(this, chatMessageCell, i3);
                    }

                    @Override
                    public void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressMoreChannelRecommendations(this, chatMessageCell);
                    }

                    @Override
                    public void didPressOther(ChatMessageCell chatMessageCell, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressOther(this, chatMessageCell, f, f2);
                    }

                    @Override
                    public void didPressPollMedia(ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i3) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressPollMedia(this, chatMessageCell, imageReceiver, pollAnswer, messageMedia, f, f2, i3);
                    }

                    @Override
                    public void didPressReaction(ChatMessageCell chatMessageCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReaction(this, chatMessageCell, reactionCount, z, f, f2);
                    }

                    @Override
                    public void didPressReplyMessage(ChatMessageCell chatMessageCell, int i3, float f, float f2, boolean z) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReplyMessage(this, chatMessageCell, i3, f, f2, z);
                    }

                    @Override
                    public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressRevealSensitiveContent(this, chatMessageCell);
                    }

                    @Override
                    public void didPressRichDocumentOptions(ChatMessageCell chatMessageCell, TLRPC.Document document, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressRichDocumentOptions(this, chatMessageCell, document, f, f2);
                    }

                    @Override
                    public void didPressShowMore(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressShowMore(this, chatMessageCell);
                    }

                    @Override
                    public void didPressSideButton(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSideButton(this, chatMessageCell);
                    }

                    @Override
                    public void didPressSponsoredClose(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSponsoredClose(this, chatMessageCell);
                    }

                    @Override
                    public void didPressSponsoredInfo(ChatMessageCell chatMessageCell, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSponsoredInfo(this, chatMessageCell, f, f2);
                    }

                    @Override
                    public void didPressSummarize(ChatMessageCell chatMessageCell, boolean z) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSummarize(this, chatMessageCell, z);
                    }

                    @Override
                    public void didPressTime(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressTime(this, chatMessageCell);
                    }

                    @Override
                    public boolean didPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem, boolean z) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressToDoButton(this, chatMessageCell, todoItem, z);
                    }

                    @Override
                    public void didPressUrl(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUrl(this, chatMessageCell, characterStyle, z);
                    }

                    @Override
                    public void didPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2, boolean z) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserAvatar(this, chatMessageCell, user, f, f2, z);
                    }

                    @Override
                    public void didPressUserStatus(ChatMessageCell chatMessageCell, TLRPC.User user, TLRPC.Document document, String str) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserStatus(this, chatMessageCell, user, document, str);
                    }

                    @Override
                    public void didPressViaBot(ChatMessageCell chatMessageCell, String str) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBot(this, chatMessageCell, str);
                    }

                    @Override
                    public void didPressViaBotNotInline(ChatMessageCell chatMessageCell, long j) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBotNotInline(this, chatMessageCell, j);
                    }

                    @Override
                    public void didPressVoteButtons(ChatMessageCell chatMessageCell, ArrayList arrayList, int i3, int i4, int i5) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressVoteButtons(this, chatMessageCell, arrayList, i3, i4, i5);
                    }

                    @Override
                    public void didPressWebPage(ChatMessageCell chatMessageCell, TLRPC.WebPage webPage, String str, boolean z) {
                        Browser.openUrl(chatMessageCell.getContext(), str);
                    }

                    @Override
                    public void didQuickShareEnd(ChatMessageCell chatMessageCell, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareEnd(this, chatMessageCell, f, f2);
                    }

                    @Override
                    public void didQuickShareMove(ChatMessageCell chatMessageCell, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareMove(this, chatMessageCell, f, f2);
                    }

                    @Override
                    public void didQuickShareStart(ChatMessageCell chatMessageCell, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareStart(this, chatMessageCell, f, f2);
                    }

                    @Override
                    public void didStartVideoStream(MessageObject messageObject) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didStartVideoStream(this, messageObject);
                    }

                    @Override
                    public void didTogglePollPreview(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didTogglePollPreview(this, chatMessageCell);
                    }

                    @Override
                    public void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell, boolean z, Runnable runnable) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didToggleRichMessageCheckbox(this, chatMessageCell, z, runnable);
                    }

                    @Override
                    public boolean doNotShowLoadingReply(MessageObject messageObject) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$doNotShowLoadingReply(this, messageObject);
                    }

                    @Override
                    public void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$drawPollMode(this, canvas, chatMessageCell);
                    }

                    @Override
                    public void forceUpdate(ChatMessageCell chatMessageCell, boolean z) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$forceUpdate(this, chatMessageCell, z);
                    }

                    @Override
                    public void forceUpdate(ChatMessageCell chatMessageCell, boolean z, boolean z2) {
                        forceUpdate(chatMessageCell, z);
                    }

                    @Override
                    public void forceUpdateNoAnimation(ChatMessageCell chatMessageCell, boolean z) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$forceUpdateNoAnimation(this, chatMessageCell, z);
                    }

                    @Override
                    public int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getAddPollOptionInputFieldHeight(this, chatMessageCell);
                    }

                    @Override
                    public String getAdminRank(long j) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getAdminRank(this, j);
                    }

                    @Override
                    public int getChatMode() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getChatMode(this);
                    }

                    @Override
                    public ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getDraftMessageMeasureController(this);
                    }

                    @Override
                    public PinchToZoomHelper getPinchToZoomHelper() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getPinchToZoomHelper(this);
                    }

                    @Override
                    public String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getProgressLoadingBotButtonUrl(this, chatMessageCell);
                    }

                    @Override
                    public CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getProgressLoadingLink(this, chatMessageCell);
                    }

                    @Override
                    public TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getTextSelectionHelper(this);
                    }

                    @Override
                    public boolean hasSelectedMessages() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$hasSelectedMessages(this);
                    }

                    @Override
                    public void invalidateBlur() {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$invalidateBlur(this);
                    }

                    @Override
                    public boolean isAdmin(long j) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isAdmin(this, j);
                    }

                    @Override
                    public boolean isLandscape() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isLandscape(this);
                    }

                    @Override
                    public boolean isOwner(long j) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isOwner(this, j);
                    }

                    @Override
                    public boolean isProgressLoading(ChatMessageCell chatMessageCell, int i3) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isProgressLoading(this, chatMessageCell, i3);
                    }

                    @Override
                    public boolean isReplyOrSelf() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isReplyOrSelf(this);
                    }

                    @Override
                    public boolean keyboardIsOpened() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$keyboardIsOpened(this);
                    }

                    @Override
                    public void needOpenWebView(MessageObject messageObject, String str, String str2, String str3, String str4, int i3, int i4) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$needOpenWebView(this, messageObject, str, str2, str3, str4, i3, i4);
                    }

                    @Override
                    public boolean needPlayMessage(ChatMessageCell chatMessageCell, MessageObject messageObject, boolean z) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$needPlayMessage(this, chatMessageCell, messageObject, z);
                    }

                    @Override
                    public void needReloadPolls() {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$needReloadPolls(this);
                    }

                    @Override
                    public void needShowPremiumBulletin(int i3) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$needShowPremiumBulletin(this, i3);
                    }

                    @Override
                    public boolean onAccessibilityAction(int i3, Bundle bundle) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$onAccessibilityAction(this, i3, bundle);
                    }

                    @Override
                    public void onDiceFinished() {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$onDiceFinished(this);
                    }

                    @Override
                    public boolean openArticlePhoto(ChatMessageCell chatMessageCell, TL_iv.PageBlock pageBlock) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$openArticlePhoto(this, chatMessageCell, pageBlock);
                    }

                    @Override
                    public void setShouldNotRepeatSticker(MessageObject messageObject) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$setShouldNotRepeatSticker(this, messageObject);
                    }

                    @Override
                    public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell, boolean z) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldDrawThreadProgress(this, chatMessageCell, z);
                    }

                    @Override
                    public boolean shouldRepeatSticker(MessageObject messageObject) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldRepeatSticker(this, messageObject);
                    }

                    @Override
                    public void videoTimerReached() {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$videoTimerReached(this);
                    }
                });
                return new RecyclerListView.Holder(messageCell);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                MessageObject messageObject = (MessageObject) MessageSendPreview.this.messageObjects.get((getItemCount() - 1) - i2);
                ChatMessageCell chatMessageCell = (ChatMessageCell) viewHolder.itemView;
                MessageObject.GroupedMessages validGroupedMessage = MessageSendPreview.this.getValidGroupedMessage(messageObject);
                chatMessageCell.setInvalidatesParent(validGroupedMessage != null);
                chatMessageCell.setMessageObject(messageObject, validGroupedMessage, false, false, false);
                if (i2 != MessageSendPreview.this.getMainMessageCellPosition() || messageObject.needDrawForwarded()) {
                    return;
                }
                MessageSendPreview.this.mainMessageCell = chatMessageCell;
                ChatMessageCell chatMessageCell2 = MessageSendPreview.this.mainMessageCell;
                Point point = AndroidUtilities.displaySize;
                chatMessageCell2.setParentViewSize(point.x, point.y);
                MessageSendPreview.this.mainMessageCellId = messageObject.getId();
            }

            @Override
            public int getItemCount() {
                return MessageSendPreview.this.messageObjects.size();
            }
        };
        this.adapter = adapter;
        recyclerListView.setAdapter(adapter);
        recyclerListView.setVerticalScrollBarEnabled(false);
        recyclerListView.setOverScrollMode(2);
        anonymousClass2.addView(recyclerListView, LayoutHelper.createFrame(-1, -2.0f));
        FrameLayout frameLayout2 = new FrameLayout(context) {
            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                MessageSendPreview.this.effectOverlay.draw(canvas);
                float progress = MessageSendPreview.this.effectOverlay.getProgress();
                if (progress != -2.0f) {
                    MessageSendPreview.this.sendButton.setLoading(progress >= 0.0f && progress < 1.0f, -3.0f);
                }
                if (MessageSendPreview.this.effectOverlay.isIdle()) {
                    return;
                }
                invalidate();
            }
        };
        this.effectsView = frameLayout2;
        frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, -1.0f));
        this.effectOverlay = new EmojiAnimationsOverlay(frameLayout2, i) {
            int[] messagePos = new int[2];

            @Override
            protected void layoutObject(EmojiAnimationsOverlay.DrawingObject drawingObject) {
                if (drawingObject == null) {
                    return;
                }
                if (MessageSendPreview.this.cameraRect == null) {
                    if (MessageSendPreview.this.mainMessageCell == null || !MessageSendPreview.this.mainMessageCell.isAttachedToWindow() || MessageSendPreview.this.mainMessageCell.getMessageObject() == null || MessageSendPreview.this.mainMessageCell.getMessageObject().getId() != MessageSendPreview.this.mainMessageCellId) {
                        return;
                    }
                    MessageSendPreview.this.mainMessageCell.getLocationOnScreen(this.messagePos);
                    drawingObject.viewFound = true;
                    float filterWidth = (EmojiAnimationsOverlay.getFilterWidth() * AndroidUtilities.density) / 1.3f;
                    float f = filterWidth / 3.0f;
                    drawingObject.lastW = f;
                    drawingObject.lastH = f;
                    float f2 = filterWidth / 2.0f;
                    drawingObject.lastX = Utilities.clamp((this.messagePos[0] + (MessageSendPreview.this.mainMessageCell.getTimeX() * MessageSendPreview.this.chatListView.getScaleX())) - f2, AndroidUtilities.displaySize.x - filterWidth, 0.0f);
                    drawingObject.lastY = (this.messagePos[1] + (MessageSendPreview.this.mainMessageCell.getTimeY() * MessageSendPreview.this.chatListView.getScaleY())) - f2;
                    return;
                }
                drawingObject.viewFound = true;
                float filterWidth2 = (EmojiAnimationsOverlay.getFilterWidth() * AndroidUtilities.density) / 1.3f;
                float f3 = filterWidth2 / 3.0f;
                drawingObject.lastW = f3;
                drawingObject.lastH = f3;
                drawingObject.lastX = Utilities.clamp(MessageSendPreview.this.cameraRect.right - (0.75f * filterWidth2), AndroidUtilities.displaySize.x - filterWidth2, 0.0f);
                drawingObject.lastY = MessageSendPreview.this.cameraRect.bottom - (filterWidth2 / 2.0f);
            }
        };
    }

    public void lambda$new$0(View view) {
        onBackPressed();
    }

    public void lambda$new$3(View view, final View view2) {
        if (this.focusable || !(view2 instanceof EditText)) {
            return;
        }
        AndroidUtilities.hideKeyboard(this.editText);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$2(view2);
            }
        }, 200L);
    }

    public void lambda$new$2(final View view) {
        makeFocusable();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$1(view);
            }
        }, 100L);
    }

    public void lambda$new$1(View view) {
        AndroidUtilities.showKeyboard(view);
        ChatActivityEnterView.SendButton sendButton = this.anchorSendButton;
        if (sendButton != null) {
            sendButton.getLocationOnScreen(this.sendButtonInitialPosition);
            int[] iArr = this.sendButtonInitialPosition;
            int i = iArr[0];
            int width = this.anchorSendButton.getWidth();
            ChatActivityEnterView.SendButton sendButton2 = this.anchorSendButton;
            iArr[0] = i + ((width - sendButton2.width(sendButton2.getHeight())) - AndroidUtilities.dp(6.0f));
            this.sendButton.setScaleX(this.anchorSendButton.getScaleX());
            this.sendButton.setScaleY(this.anchorSendButton.getScaleY());
        }
    }

    class AnonymousClass2 extends SizeNotifierFrameLayout {
        private Paint backgroundPaint;
        int chatListViewTy;
        private GradientClip clip;
        final int[] destCellPos;
        private AnimatedFloat destCellY;
        final int[] pos;
        final int[] pos2;
        final Theme.ResourcesProvider val$resourcesProvider;

        AnonymousClass2(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.val$resourcesProvider = resourcesProvider;
            this.pos = new int[2];
            this.pos2 = new int[2];
            this.chatListViewTy = 0;
            this.destCellPos = new int[2];
            this.clip = new GradientClip();
            this.destCellY = new AnimatedFloat(0L, 100L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.backgroundPaint = new Paint(1);
        }

        @Override
        protected void dispatchDraw(final android.graphics.Canvas r30) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.MessageSendPreview.AnonymousClass2.dispatchDraw(android.graphics.Canvas):void");
        }

        public Boolean lambda$dispatchDraw$0(Canvas canvas, float f) {
            canvas.save();
            canvas.translate(MessageSendPreview.this.editText.getX(), MessageSendPreview.this.editText.getY() - MessageSendPreview.this.editText.getScrollY());
            float textSize = f / MessageSendPreview.this.editText.getTextSize();
            canvas.scale(textSize, textSize, MessageSendPreview.this.editText.getPaddingLeft(), MessageSendPreview.this.editText.getPaddingTop());
            MessageSendPreview.this.editText.draw(canvas);
            canvas.restore();
            return Boolean.TRUE;
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (MessageSendPreview.this.openInProgress) {
                if (view == MessageSendPreview.this.sendButton) {
                    return false;
                }
                if (view == MessageSendPreview.this.mainMessageCell && MessageSendPreview.this.mainMessageCell != null && MessageSendPreview.this.mainMessageCell.getCurrentPosition() == null) {
                    return false;
                }
            }
            return super.drawChild(canvas, view, j);
        }
    }

    public void lambda$new$4(View view) {
        onBackPressed();
    }

    public void lambda$new$5(View view, int i) {
        onBackPressed();
    }

    class AnonymousClass6 extends ChatListItemAnimator {
        Runnable finishRunnable;

        @Override
        public void checkIsRunning() {
        }

        AnonymousClass6(ChatActivity chatActivity, RecyclerListView recyclerListView, Theme.ResourcesProvider resourcesProvider) {
            super(chatActivity, recyclerListView, resourcesProvider);
        }

        @Override
        public void onAnimationStart() {
            Runnable runnable = this.finishRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.finishRunnable = null;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("chatItemAnimator disable notifications");
            }
        }

        @Override
        protected void onAllAnimationsDone() {
            super.onAllAnimationsDone();
            Runnable runnable = this.finishRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.finishRunnable = null;
            }
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onAllAnimationsDone$0();
                }
            };
            this.finishRunnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2);
        }

        public void lambda$onAllAnimationsDone$0() {
            this.finishRunnable = null;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("chatItemAnimator enable notifications");
            }
        }

        @Override
        public void endAnimations() {
            super.endAnimations();
            Runnable runnable = this.finishRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$endAnimations$1();
                }
            };
            this.finishRunnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2);
        }

        public void lambda$endAnimations$1() {
            this.finishRunnable = null;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("chatItemAnimator enable notifications");
            }
        }
    }

    public void updateMessagesVisiblePart() {
        int measuredHeight = this.containerView.getMeasuredHeight();
        int childCount = this.chatListView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.chatListView.getChildAt(i);
            if (childAt instanceof ChatMessageCell) {
                float fComputeYCoordinateInParent = ViewPositionWatcher.computeYCoordinateInParent(childAt, this.containerView);
                ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                int i2 = (int) fComputeYCoordinateInParent;
                childAt.getMeasuredHeight();
                int i3 = i2 >= 0 ? 0 : -i2;
                int measuredHeight2 = childAt.getMeasuredHeight();
                if (measuredHeight2 > measuredHeight) {
                    measuredHeight2 = i3 + measuredHeight;
                }
                chatMessageCell.setVisiblePart(i3, measuredHeight2 - i3, measuredHeight, fComputeYCoordinateInParent, fComputeYCoordinateInParent, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight(), 0, 0, 0);
            }
        }
    }

    @Override
    public void onBackPressed() {
        if (this.keyboardVisible) {
            AndroidUtilities.hideKeyboard(getCurrentFocus());
            this.keyboardVisible = false;
            return;
        }
        ReactionsContainerLayout reactionsContainerLayout = this.effectSelector;
        if (reactionsContainerLayout != null && reactionsContainerLayout.getReactionsWindow() != null) {
            if (this.effectSelector.getReactionsWindow().transition) {
                return;
            }
            this.effectSelector.getReactionsWindow().dismiss();
        } else {
            this.sentEffect = true;
            super.onBackPressed();
        }
    }

    private class MessageCell extends ChatMessageCell {
        public int bottom;
        private int pastId;
        public int top;

        @Override
        public boolean isPressed() {
            return false;
        }

        public MessageCell(Context context, int i, boolean z, ChatMessageSharedResources chatMessageSharedResources, Theme.ResourcesProvider resourcesProvider) {
            super(context, i, z, chatMessageSharedResources, resourcesProvider);
            this.top = Integer.MAX_VALUE;
            this.bottom = Integer.MAX_VALUE;
            this.pastId = -1;
        }

        @Override
        protected SpoilerEffect2 makeSpoilerEffect() {
            return SpoilerEffect2.getInstance(1, this, MessageSendPreview.this.windowView);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (!this.transitionParams.animateBackgroundBoundsInner || i2 == 0 || this.top == Integer.MAX_VALUE || i4 == 0 || this.bottom == Integer.MAX_VALUE) {
                return;
            }
            if (this.pastId == (getMessageObject() == null ? 0 : getMessageObject().getId())) {
                if (!MessageSendPreview.this.scrolledToLast) {
                    setTranslationY(-(i2 - this.top));
                    animate().translationY(0.0f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                }
                this.top = getTop();
                this.bottom = getBottom();
                this.pastId = getMessageObject() != null ? getMessageObject().getId() : 0;
            }
        }
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.windowView, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i | (-1945959040);
        window.setAttributes(attributes);
        this.windowView.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(this.windowView, !Theme.isCurrentThemeDark());
    }

    public void setMessageObjects(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i);
            if (messageObject.hasValidGroupId()) {
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.groupedMessagesMap.get(messageObject.getGroupIdForUse());
                if (groupedMessages == null) {
                    groupedMessages = new MessageObject.GroupedMessages();
                    groupedMessages.reversed = false;
                    long groupId = messageObject.getGroupId();
                    groupedMessages.groupId = groupId;
                    this.groupedMessagesMap.put(groupId, groupedMessages);
                }
                if (groupedMessages.getPosition(messageObject) == null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < groupedMessages.messages.size()) {
                            if (groupedMessages.messages.get(i2).getId() == messageObject.getId()) {
                                break;
                            } else {
                                i2++;
                            }
                        } else {
                            groupedMessages.messages.add(messageObject);
                            break;
                        }
                    }
                }
            } else if (messageObject.getGroupIdForUse() != 0) {
                messageObject.messageOwner.grouped_id = 0L;
                messageObject.localSentGroupId = 0L;
            }
        }
        for (int i3 = 0; i3 < this.groupedMessagesMap.size(); i3++) {
            ((MessageObject.GroupedMessages) this.groupedMessagesMap.valueAt(i3)).calculate();
        }
        this.messageObjects.addAll(arrayList);
        for (int i4 = 0; i4 < this.messageObjects.size(); i4++) {
            this.messageObjectsWidth = Math.max(this.messageObjectsWidth, getWidthForMessage((MessageObject) this.messageObjects.get(i4)));
        }
        this.chatListView.getAdapter().notifyDataSetChanged();
        int itemCount = this.chatListView.getAdapter().getItemCount();
        this.chatLayoutManager.scrollToPositionWithOffset(itemCount > 10 ? itemCount % 10 : 0, AndroidUtilities.dp(12.0f), true);
    }

    public void setCameraTexture(TextureView textureView) {
        if (textureView == null) {
            return;
        }
        this.cameraRect = new RectF();
        int[] iArr = new int[2];
        textureView.getLocationOnScreen(iArr);
        this.cameraRect.set(iArr[0], iArr[1], r2 + textureView.getWidth(), iArr[1] + textureView.getHeight());
    }

    public void setEditText(EditTextCaption editTextCaption, Utilities.Callback2 callback2, Utilities.Callback callback) {
        this.editText = editTextCaption;
        this.drawEditText = callback2;
        this.drawEditTextBackground = callback;
    }

    public ChatActivityEnterView.SendButton setSendButton(final ChatActivityEnterView.SendButton sendButton, final boolean z, View.OnClickListener onClickListener) {
        this.anchorSendButton = sendButton;
        sendButton.getLocationOnScreen(this.sendButtonInitialPosition);
        ChatActivityEnterView.SendButton sendButton2 = new ChatActivityEnterView.SendButton(getContext(), sendButton.resId, this.resourcesProvider) {
            @Override
            public boolean isInScheduleMode() {
                return sendButton.isInScheduleMode();
            }

            @Override
            public boolean isOpen() {
                return (z && MessageSendPreview.this.dismissing && !super.isOpen()) ? false : true;
            }

            @Override
            public boolean isInactive() {
                return sendButton.isInactive();
            }

            @Override
            public boolean shouldDrawBackground() {
                return sendButton.shouldDrawBackground();
            }

            @Override
            public int getFillColor() {
                return sendButton.getFillColor();
            }
        };
        this.sendButton = sendButton2;
        sendButton2.setScaleX(this.anchorSendButton.getScaleX());
        this.sendButton.setScaleY(this.anchorSendButton.getScaleY());
        this.anchorSendButton.copyTo(this.sendButton);
        this.sendButton.open.set(sendButton.open.get(), true);
        this.sendButton.setOnClickListener(onClickListener);
        this.containerView.addView(this.sendButton, new ViewGroup.LayoutParams(sendButton.getWidth(), sendButton.getHeight()));
        this.sendButtonWidth = this.anchorSendButton.width(sendButton.getHeight());
        int[] iArr = this.sendButtonInitialPosition;
        iArr[0] = iArr[0] + ((this.anchorSendButton.getWidth() - this.anchorSendButton.width(sendButton.getHeight())) - AndroidUtilities.dp(6.0f));
        return this.sendButton;
    }

    public void setSendButtonWidth(int i) {
        this.customSendButtonWidth = true;
        this.sendButtonWidth = i;
    }

    public int getSendButtonWidth() {
        return this.customSendButtonWidth ? this.sendButtonWidth : this.anchorSendButton.width();
    }

    public void setItemOptions(ItemOptions itemOptions) {
        itemOptions.setGapBackgroundColor(Theme.multAlpha(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider), 0.06f));
        itemOptions.setBlurBackground(this.iBlur3Factory, BlurredBackgroundProviderImpl.scrimMenuBackground(this.resourcesProvider), false);
        ViewGroup layout = itemOptions.getLayout();
        this.optionsView = layout;
        this.containerView.addView(layout, LayoutHelper.createFrame(-2, -2.0f));
    }

    public void allowEffectSelector(BaseFragment baseFragment) {
        if (this.effectSelector != null || baseFragment == null) {
            return;
        }
        MessagesController.getInstance(this.currentAccount).getAvailableEffects();
        FrameLayout frameLayout = new FrameLayout(this.context);
        this.effectSelectorContainer = frameLayout;
        frameLayout.setClipChildren(false);
        this.effectSelectorContainer.setClipToPadding(false);
        this.effectSelectorContainer.setPadding(0, 0, 0, AndroidUtilities.dp(24.0f));
        ReactionsContainerLayout reactionsContainerLayout = new ReactionsContainerLayout(5, null, getContext(), this.currentAccount, this.resourcesProvider) {
            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                setPivotX(getMeasuredWidth());
                setPivotY(getMeasuredHeight());
            }
        };
        this.effectSelector = reactionsContainerLayout;
        reactionsContainerLayout.setClipChildren(false);
        this.effectSelector.setClipToPadding(false);
        this.effectSelector.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(22.0f));
        this.effectSelector.setDelegate(new AnonymousClass15(baseFragment));
        this.effectSelector.setTop(false);
        this.effectSelector.setClipChildren(false);
        this.effectSelector.setClipToPadding(false);
        this.effectSelector.setVisibility(0);
        this.effectSelector.setHint(LocaleController.getString(R.string.AddEffectMessageHint));
        this.effectSelector.setBubbleOffset(AndroidUtilities.dp(-25.0f));
        this.effectSelector.setMiniBubblesOffset(AndroidUtilities.dp(2.0f));
        this.containerView.addView(this.effectSelectorContainer, LayoutHelper.createFrame(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.effectSelectorContainer.addView(this.effectSelector, LayoutHelper.createFrame(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        this.effectSelector.setScaleY(0.4f);
        this.effectSelector.setScaleX(0.4f);
        this.effectSelector.setAlpha(0.0f);
        if (MessagesController.getInstance(this.currentAccount).hasAvailableEffects()) {
            showEffectSelector();
        } else {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.availableEffectsUpdate);
        }
        ReactionsContainerLayout reactionsContainerLayout2 = this.effectSelector;
        if (reactionsContainerLayout2 != null) {
            reactionsContainerLayout2.setPaused(true, true);
        }
        new KeyboardNotifier(this.windowView, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$allowEffectSelector$6((Integer) obj);
            }
        });
    }

    class AnonymousClass15 implements ReactionsContainerLayout.ReactionsContainerDelegate {
        final BaseFragment val$fragment;

        @Override
        public boolean allowLongPress() {
            return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$allowLongPress(this);
        }

        @Override
        public boolean drawBackground() {
            return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$drawBackground(this);
        }

        @Override
        public void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
            ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$drawRoundRect(this, canvas, rectF, f, f2, f3, i, z);
        }

        @Override
        public boolean needEnterText() {
            return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$needEnterText(this);
        }

        @Override
        public void onEmojiWindowDismissed() {
            ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$onEmojiWindowDismissed(this);
        }

        AnonymousClass15(BaseFragment baseFragment) {
            this.val$fragment = baseFragment;
        }

        @Override
        public void onReactionClicked(android.view.View r18, org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble.VisibleReaction r19, boolean r20, boolean r21) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.MessageSendPreview.AnonymousClass15.onReactionClicked(android.view.View, org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble$VisibleReaction, boolean, boolean):void");
        }

        public static void lambda$onReactionClicked$0(BaseFragment baseFragment) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            baseFragment.showAsSheet(new PremiumPreviewFragment("effect"), bottomSheetParams);
        }
    }

    public void lambda$allowEffectSelector$6(Integer num) {
        boolean z = num.intValue() - this.insets.bottom > AndroidUtilities.dp(20.0f);
        this.keyboardVisible = z;
        this.effectSelectorContainer.animate().translationY((z ? Math.min(this.effectSelectorContainerY, (this.windowView.getHeight() - num.intValue()) - this.effectSelectorContainer.getMeasuredHeight()) : this.effectSelectorContainerY) - this.effectSelectorContainer.getTop()).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).start();
    }

    public void setEffectId(long j) {
        TLRPC.TL_availableEffect effect;
        this.effectId = j;
        int mainMessageCellPosition = getMainMessageCellPosition();
        MessageObject messageObject = (mainMessageCellPosition < 0 || mainMessageCellPosition >= this.messageObjects.size()) ? null : (MessageObject) this.messageObjects.get(mainMessageCellPosition);
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            message.flags2 |= 4;
            message.effect = j;
        }
        if (this.effectSelector == null || (effect = MessagesController.getInstance(this.currentAccount).getEffect(j)) == null) {
            return;
        }
        this.effectSelector.setSelectedReactionAnimated(ReactionsLayoutInBubble.VisibleReaction.fromTL(effect));
    }

    public void showEffectSelector() {
        if (this.effectSelectorShown) {
            return;
        }
        this.layoutDone = false;
        this.effectSelectorShown = true;
        this.effectSelector.setMessage(null, null, true);
        this.effectSelector.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
        this.effectSelector.startEnterAnimation(false);
    }

    public long getSelectedEffect() {
        MessageObject messageObject;
        if (!this.sentEffect && this.effectSelector != null) {
            if (this.cameraRect != null) {
                this.sentEffect = true;
                return this.effectId;
            }
            ChatMessageCell chatMessageCell = this.mainMessageCell;
            if (chatMessageCell == null || (messageObject = chatMessageCell.getMessageObject()) == null) {
                return 0L;
            }
            TLRPC.Message message = messageObject.messageOwner;
            if ((message.flags2 & 4) == 0) {
                return 0L;
            }
            this.sentEffect = true;
            return message.effect;
        }
        return 0L;
    }

    public void hideEffectSelector() {
        ReactionsContainerLayout reactionsContainerLayout = this.effectSelector;
        if (reactionsContainerLayout != null && this.effectSelectorShown) {
            reactionsContainerLayout.dismissWindow();
            if (this.effectSelector.getReactionsWindow() != null && this.effectSelector.getReactionsWindow().containerView != null) {
                this.effectSelector.getReactionsWindow().containerView.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.effectSelector.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
    }

    public void layout() {
        if (this.windowView.getWidth() <= 0) {
            return;
        }
        int[] iArr = new int[2];
        this.anchorSendButton.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + ((this.anchorSendButton.getWidth() - this.anchorSendButton.width()) - AndroidUtilities.dp(6.0f));
        this.sendButton.setScaleX(this.anchorSendButton.getScaleX());
        this.sendButton.setScaleY(this.anchorSendButton.getScaleY());
        int[] iArr2 = this.sendButtonInitialPosition;
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        int measuredHeight = (this.chatListView.getMeasuredHeight() - this.sendButton.getHeight()) + (this.effectSelector != null ? AndroidUtilities.dp(320.0f) : 0);
        int iDp = this.insets.top + AndroidUtilities.dp(8.0f);
        int iDp2 = AndroidUtilities.dp(this.messageObjects.isEmpty() ? -6.0f : 48.0f);
        View view = this.optionsView;
        int measuredHeight2 = iDp2 + (view == null ? 0 : view.getMeasuredHeight());
        int measuredHeight3 = (this.containerView.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - this.insets.bottom;
        if (iArr[1] + measuredHeight2 > measuredHeight3) {
            iArr[1] = measuredHeight3 - measuredHeight2;
        }
        if (iArr[1] - measuredHeight < iDp) {
            iArr[1] = iDp + measuredHeight;
        }
        if (iArr[1] + this.anchorSendButton.getHeight() + measuredHeight2 > measuredHeight3) {
            iArr[1] = (measuredHeight3 - measuredHeight2) - this.anchorSendButton.getHeight();
        }
        this.sendButton.setX((iArr[0] - (r2.getWidth() - this.sendButton.width())) + AndroidUtilities.dp(6.0f));
        this.sendButton.setY(iArr[1]);
        if (this.customSendButtonWidth) {
            iArr[0] = iArr[0] - (this.sendButtonWidth - this.anchorSendButton.width());
        }
        this.chatListView.setX((iArr[0] + AndroidUtilities.dp(7.0f)) - this.chatListView.getMeasuredWidth());
        if (this.layoutDone) {
            this.chatListView.animate().translationY(((iArr[1] + this.sendButton.getHeight()) - this.chatListView.getMeasuredHeight()) - this.chatListView.getTop()).setInterpolator(ChatListItemAnimator.DEFAULT_INTERPOLATOR).setDuration(250L).start();
        } else {
            this.chatListView.setY((iArr[1] + this.sendButton.getHeight()) - this.chatListView.getMeasuredHeight());
        }
        View view2 = this.optionsView;
        if (view2 != null) {
            view2.setX((iArr[0] + AndroidUtilities.dp(7.0f)) - this.optionsView.getMeasuredWidth());
            this.optionsView.setY(iArr[1] + (this.messageObjects.isEmpty() ? -AndroidUtilities.dp(6.0f) : this.sendButton.getHeight()));
        }
        FrameLayout frameLayout = this.effectSelectorContainer;
        if (frameLayout != null) {
            frameLayout.setX(Math.max(0, ((iArr[0] + this.sendButton.width()) - this.effectSelectorContainer.getMeasuredWidth()) - AndroidUtilities.dp(6.0f)));
            RectF rectF = this.cameraRect;
            if (rectF != null) {
                FrameLayout frameLayout2 = this.effectSelectorContainer;
                float fMax = Math.max(this.insets.top, rectF.top - frameLayout2.getMeasuredWidth());
                this.effectSelectorContainerY = fMax;
                frameLayout2.setY(fMax);
                ReactionsContainerLayout reactionsContainerLayout = this.effectSelector;
                if (reactionsContainerLayout != null) {
                    reactionsContainerLayout.setY(Math.max(this.insets.top, (this.cameraRect.top - AndroidUtilities.dp(24.0f)) - this.effectSelector.getMeasuredHeight()));
                    return;
                }
                return;
            }
            float height = (iArr[1] + this.sendButton.getHeight()) - this.chatListView.getMeasuredHeight();
            FrameLayout frameLayout3 = this.effectSelectorContainer;
            float fMax2 = Math.max(this.insets.top, height - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
            this.effectSelectorContainerY = fMax2;
            frameLayout3.setY(fMax2);
            ReactionsContainerLayout reactionsContainerLayout2 = this.effectSelector;
            if (reactionsContainerLayout2 != null) {
                reactionsContainerLayout2.setY(Math.max(0.0f, (height - reactionsContainerLayout2.getMeasuredHeight()) - this.effectSelectorContainerY));
            }
        }
    }

    public void makeFocusable() {
        if (this.focusable) {
            return;
        }
        try {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.flags &= -131073;
            window.setAttributes(attributes);
            this.focusable = true;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public boolean isShowing() {
        return !this.dismissing;
    }

    @Override
    public void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            SpoilerEffect2.pause(0, true);
            super.show();
            prepareBlur(null);
            FrameLayout frameLayout = this.effectsView;
            if (frameLayout != null) {
                frameLayout.bringToFront();
            }
            animateOpenTo(true, null);
        }
    }

    private static class VisiblePart {
        private int blurredViewBottomOffset;
        private int blurredViewTopOffset;
        private int childPosition;
        public int parentHeight;
        public int parentWidth;
        private int visibleHeight;
        private int visibleParent;
        private float visibleParentOffset;
        private float visibleTop;

        private VisiblePart() {
        }

        public static VisiblePart of(ChatMessageCell chatMessageCell) {
            VisiblePart visiblePart = new VisiblePart();
            visiblePart.childPosition = chatMessageCell.childPosition;
            visiblePart.visibleHeight = chatMessageCell.visibleHeight;
            visiblePart.visibleParent = chatMessageCell.visibleParent;
            visiblePart.parentWidth = chatMessageCell.parentWidth;
            visiblePart.parentHeight = chatMessageCell.parentHeight;
            visiblePart.visibleTop = chatMessageCell.visibleTop;
            visiblePart.visibleParentOffset = chatMessageCell.visibleParentOffset;
            visiblePart.blurredViewTopOffset = chatMessageCell.blurredViewTopOffset;
            visiblePart.blurredViewBottomOffset = chatMessageCell.blurredViewBottomOffset;
            return visiblePart;
        }
    }

    public void dismissInto(ChatMessageCell chatMessageCell, float f, float f2) {
        if (this.dismissing) {
            return;
        }
        this.sent = true;
        this.dismissing = true;
        ChatActivityEnterView.SendButton sendButton = this.sendButton;
        if (sendButton != null) {
            sendButton.invalidate();
        }
        ChatActivityEnterView.SendButton sendButton2 = this.anchorSendButton;
        if (sendButton2 != null) {
            sendButton2.invalidate();
        }
        if (this.mainMessageCell != null && chatMessageCell != null) {
            this.destCell = chatMessageCell;
            chatMessageCell.setVisibility(4);
            this.destClipTop = f;
            this.destClipBottom = f2;
            ChatMessageCell chatMessageCell2 = this.mainMessageCell;
            ChatMessageCell chatMessageCell3 = this.destCell;
            chatMessageCell2.isChat = chatMessageCell3.isChat;
            chatMessageCell2.isThreadChat = chatMessageCell3.isThreadChat;
            chatMessageCell2.isSavedChat = chatMessageCell3.isSavedChat;
            chatMessageCell2.isBot = chatMessageCell3.isBot;
            chatMessageCell2.isForum = chatMessageCell3.isForum;
            chatMessageCell2.isForumGeneral = chatMessageCell3.isForumGeneral;
            chatMessageCell2.setMessageObject(chatMessageCell.getMessageObject(), null, chatMessageCell.isPinnedBottom(), chatMessageCell.isPinnedTop(), chatMessageCell.isFirstInChat());
            ChatMessageCell.TransitionParams transitionParams = this.mainMessageCell.getTransitionParams();
            transitionParams.animateChange = this.mainMessageCell.getTransitionParams().animateChange();
            transitionParams.animateChangeProgress = 0.0f;
            boolean z = this.mainMessageCell.getTransitionParams().lastDrawingBackgroundRect.left != this.mainMessageCell.getBackgroundDrawableLeft();
            if (z || transitionParams.lastDrawingBackgroundRect.top != this.mainMessageCell.getBackgroundDrawableTop() || transitionParams.lastDrawingBackgroundRect.bottom != this.mainMessageCell.getBackgroundDrawableBottom()) {
                this.cellDelta.bottom = -(this.mainMessageCell.getBackgroundDrawableBottom() - transitionParams.lastDrawingBackgroundRect.bottom);
                this.cellDelta.top = -(this.mainMessageCell.getBackgroundDrawableTop() - transitionParams.lastDrawingBackgroundRect.top);
                if (chatMessageCell.getMessageObject().isOutOwner()) {
                    this.cellDelta.left = -(this.mainMessageCell.getBackgroundDrawableLeft() - transitionParams.lastDrawingBackgroundRect.left);
                    this.cellDelta.right = 0;
                } else {
                    Rect rect = this.cellDelta;
                    rect.left = 0;
                    rect.right = this.mainMessageCell.getBackgroundDrawableRight() - transitionParams.lastDrawingBackgroundRect.right;
                }
                transitionParams.animateBackgroundBoundsInner = true;
                transitionParams.animateBackgroundWidth = z;
            }
            this.fromPart = VisiblePart.of(this.mainMessageCell);
        }
        animateOpenTo(false, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$dismissInto$8();
            }
        });
        this.windowView.invalidate();
        afterDismiss();
    }

    public void lambda$dismissInto$8() {
        SpoilerEffect2.pause(0, false);
        SpoilerEffect2 spoilerEffect2 = this.spoilerEffect2;
        if (spoilerEffect2 != null) {
            spoilerEffect2.detach(this.windowView);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$dismissInto$7();
            }
        });
    }

    public void lambda$dismissInto$7() {
        super.dismiss();
    }

    public void dismiss(boolean z) {
        this.sent = z;
        dismiss();
    }

    public void dismissInstant() {
        if (this.dismissing) {
            return;
        }
        this.dismissing = true;
        SpoilerEffect2.pause(0, false);
        SpoilerEffect2 spoilerEffect2 = this.spoilerEffect2;
        if (spoilerEffect2 != null) {
            spoilerEffect2.detach(this.windowView);
        }
        super.dismiss();
        afterDismiss();
    }

    @Override
    public void dismiss() {
        if (this.dismissing) {
            return;
        }
        this.dismissing = true;
        ChatActivityEnterView.SendButton sendButton = this.sendButton;
        if (sendButton != null) {
            sendButton.invalidate();
        }
        ChatActivityEnterView.SendButton sendButton2 = this.anchorSendButton;
        if (sendButton2 != null) {
            sendButton2.invalidate();
        }
        animateOpenTo(false, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$dismiss$10();
            }
        });
        this.windowView.invalidate();
        afterDismiss();
    }

    public void lambda$dismiss$10() {
        SpoilerEffect2.pause(0, false);
        SpoilerEffect2 spoilerEffect2 = this.spoilerEffect2;
        if (spoilerEffect2 != null) {
            spoilerEffect2.detach(this.windowView);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$dismiss$9();
            }
        });
    }

    public void lambda$dismiss$9() {
        super.dismiss();
    }

    private void afterDismiss() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.availableEffectsUpdate);
        WindowVisibilityManager.Controller controller = this.activityVisibilityController;
        if (controller != null) {
            controller.destroy();
            this.activityVisibilityController = null;
        }
    }

    private void animateOpenTo(final boolean z, final Runnable runnable) {
        View view;
        ValueAnimator valueAnimator = this.openAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean z2 = z && (view = this.optionsView) != null && (view instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout);
        if (z2) {
            ActionBarPopupWindow.startAnimation((ActionBarPopupWindow.ActionBarPopupWindowLayout) this.optionsView);
        }
        if (!z) {
            hideEffectSelector();
        }
        this.openInProgress = true;
        this.opening = z;
        this.closing = !z;
        this.chatListView.invalidate();
        this.firstOpenFrame = true;
        this.firstOpenFrame2 = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.openProgress, z ? 1.0f : 0.0f);
        this.openAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f$0.lambda$animateOpenTo$11(z2, valueAnimator2);
            }
        });
        this.openAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                MessageSendPreview.this.openProgress = z ? 1.0f : 0.0f;
                MessageSendPreview.this.firstOpenFrame = false;
                MessageSendPreview.this.firstOpenFrame2 = false;
                MessageSendPreview.this.effectsView.setAlpha(MessageSendPreview.this.openProgress);
                if (z) {
                    MessageSendPreview.this.openInProgress = false;
                    MessageSendPreview.this.opening = false;
                    MessageSendPreview.this.closing = false;
                }
                if (MessageSendPreview.this.editText != null) {
                    MessageSendPreview.this.editText.setAlpha(1.0f);
                }
                if (MessageSendPreview.this.destCell != null) {
                    MessageSendPreview.this.destCell.setVisibility(0);
                }
                if (MessageSendPreview.this.anchorSendButton != null && !MessageSendPreview.this.sent) {
                    MessageSendPreview.this.anchorSendButton.setAlpha(1.0f);
                }
                if (!z && MessageSendPreview.this.sendButton != null) {
                    MessageSendPreview.this.sendButton.setAlpha(0.0f);
                }
                if (!z2 && MessageSendPreview.this.optionsView != null) {
                    MessageSendPreview.this.optionsView.setAlpha(MessageSendPreview.this.openProgress);
                }
                MessageSendPreview.this.chatListView.invalidate();
                MessageSendPreview.this.chatListView.setAlpha(MessageSendPreview.this.openProgress);
                MessageSendPreview.this.windowView.invalidate();
                MessageSendPreview.this.containerView.invalidate();
                if (runnable != null) {
                    if (!z && MessageSendPreview.this.destCell != null && MessageSendPreview.this.destCell.isAttachedToWindow()) {
                        MessageSendPreview.this.destCell.post(runnable);
                    } else if (!z && MessageSendPreview.this.editText != null && MessageSendPreview.this.editText.isAttachedToWindow()) {
                        MessageSendPreview.this.editText.post(runnable);
                    } else {
                        AndroidUtilities.runOnUIThread(runnable);
                    }
                }
            }
        });
        this.openAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.openAnimator.setDuration(350L);
        this.openAnimator.start();
    }

    public void lambda$animateOpenTo$11(boolean z, ValueAnimator valueAnimator) {
        View view;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.openProgress = fFloatValue;
        this.effectsView.setAlpha(fFloatValue);
        this.chatListView.setAlpha(this.openProgress);
        if (!z && (view = this.optionsView) != null) {
            view.setAlpha(this.openProgress);
        }
        this.windowView.invalidate();
        this.containerView.invalidate();
    }

    private void prepareBlur(final View view) {
        if (view != null) {
            view.setVisibility(4);
        }
        final float alpha = this.anchorSendButton.getAlpha();
        ChatActivityEnterView.SendButton sendButton = this.anchorSendButton;
        if (sendButton != null) {
            sendButton.setAlpha(0.0f);
        }
        ScrimOptions.makeGlobalBlurBitmaps(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$prepareBlur$12(alpha, view, (Bitmap) obj, (Bitmap) obj2);
            }
        });
    }

    public void lambda$prepareBlur$12(float f, View view, Bitmap bitmap, Bitmap bitmap2) {
        ChatActivityEnterView.SendButton sendButton = this.anchorSendButton;
        if (sendButton != null) {
            sendButton.setAlpha(f);
        }
        if (view != null) {
            view.setVisibility(0);
        }
        this.blurBitmap = bitmap;
        Paint paint = new Paint(1);
        this.blurBitmapPaint = paint;
        Bitmap bitmap3 = this.blurBitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
        this.blurBitmapShader = bitmapShader;
        paint.setShader(bitmapShader);
        this.blurMatrix = new Matrix();
        this.iBlur3SourceBitmap.setBitmap(bitmap2);
        checkBitmapMatrix();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.currentAccount).hasAvailableEffects()) {
            showEffectSelector();
        }
    }

    public MessageObject.GroupedMessages getValidGroupedMessage(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.groupedMessagesMap.get(messageObject.getGroupId());
        if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
            return groupedMessages;
        }
        return null;
    }

    public void scrollTo(boolean z) {
        int i;
        RecyclerListView recyclerListView = this.chatListView;
        if (recyclerListView == null || recyclerListView.getAdapter() == null || this.chatLayoutManager == null) {
            return;
        }
        int itemCount = this.chatListView.getAdapter().getItemCount();
        if (z) {
            i = itemCount > 10 ? itemCount % 10 : 0;
        } else {
            i = itemCount - 1;
        }
        this.chatLayoutManager.scrollToPositionWithOffset(i, AndroidUtilities.dp(12.0f), z);
        this.scrolledToLast = z;
    }

    public void changeMessage(MessageObject messageObject) {
        MessageObject.GroupedMessages validGroupedMessage = getValidGroupedMessage(messageObject);
        if (validGroupedMessage != null) {
            validGroupedMessage.calculate();
            Iterator<MessageObject> it = validGroupedMessage.messages.iterator();
            while (it.hasNext()) {
                changeMessageInternal(it.next());
            }
            return;
        }
        changeMessageInternal(messageObject);
    }

    public void changeMessageInternal(MessageObject messageObject) {
        ChatMessageCell chatMessageCell;
        if (this.chatListView == null) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.chatListView.getChildCount()) {
                chatMessageCell = null;
                break;
            }
            View childAt = this.chatListView.getChildAt(i);
            if (childAt instanceof ChatMessageCell) {
                chatMessageCell = (ChatMessageCell) childAt;
                if (chatMessageCell.getMessageObject() == messageObject) {
                    break;
                }
            }
            i++;
        }
        ChatMessageCell chatMessageCell2 = chatMessageCell;
        int size = -1;
        for (int i2 = 0; i2 < this.messageObjects.size(); i2++) {
            if (this.messageObjects.get(i2) == messageObject) {
                size = (this.messageObjects.size() - 1) - i2;
            }
        }
        if (chatMessageCell2 == null) {
            this.chatListView.getAdapter().notifyItemChanged(size);
            return;
        }
        messageObject.forceUpdate = true;
        chatMessageCell2.setMessageObject(messageObject, chatMessageCell2.getCurrentMessagesGroup(), chatMessageCell2.isPinnedBottom(), chatMessageCell2.isPinnedTop(), chatMessageCell2.isFirstInChat());
        this.chatListView.getAdapter().notifyItemChanged(size);
    }

    private int getWidthForMessage(MessageObject messageObject) {
        if (getContext() == null) {
            return 0;
        }
        if (this.dummyMessageCell == null) {
            this.dummyMessageCell = new ChatMessageCell(getContext(), this.currentAccount, true, null, this.resourcesProvider);
        }
        ChatMessageCell chatMessageCell = this.dummyMessageCell;
        chatMessageCell.isChat = false;
        chatMessageCell.isSavedChat = false;
        chatMessageCell.isSavedPreviewChat = false;
        chatMessageCell.isBot = false;
        chatMessageCell.isMegagroup = false;
        return chatMessageCell.computeWidth(messageObject, (MessageObject.GroupedMessages) this.groupedMessagesMap.get(messageObject.getGroupId()));
    }

    public void setStars(long j) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.buttonText = j <= 0 ? null : new Text(StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j), 0.7f), 14.0f, AndroidUtilities.bold());
        if (this.buttonBgPaint == null) {
            Paint paint = new Paint(1);
            this.buttonBgPaint = paint;
            paint.setColor(1073741824);
        }
        this.chatListView.invalidate();
        for (int i = 0; i < this.messageObjects.size(); i++) {
            MessageObject messageObject = (MessageObject) this.messageObjects.get(i);
            if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
                messageMedia.spoiler = j > 0;
            }
        }
        this.adapter.notifyDataSetChanged();
    }

    public void drawStarsPrice(Canvas canvas, float f, float f2, float f3, float f4) {
        if (this.buttonText == null || this.buttonBgPaint == null) {
            return;
        }
        float f5 = (f + f3) / 2.0f;
        float f6 = (f2 + f4) / 2.0f;
        float fDp = AndroidUtilities.dp(28.0f) + this.buttonText.getCurrentWidth();
        float fDp2 = AndroidUtilities.dp(32.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        float f7 = fDp / 2.0f;
        float f8 = f5 - f7;
        float f9 = fDp2 / 2.0f;
        rectF.set(f8, f6 - f9, f5 + f7, f6 + f9);
        canvas.save();
        canvas.drawRoundRect(rectF, f9, f9, this.buttonBgPaint);
        this.buttonText.draw(canvas, f8 + AndroidUtilities.dp(14.0f), f6, -1, 1.0f);
        canvas.restore();
    }

    public void checkBitmapMatrix() {
        Blur3Utils.checkBitmapSourceMatrixScale(this.iBlur3SourceBitmap, this.windowView);
        View view = this.optionsView;
        if (view != null) {
            view.invalidate();
        }
    }
}
