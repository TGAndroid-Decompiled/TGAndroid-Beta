package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.view.KeyEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.collection.LongSparseArray;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.ChatListItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManagerFixed;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.Emoji;
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
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$KeyboardButton;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageExtendedMedia;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$ReactionCount;
import org.telegram.tgnet.TLRPC$TL_availableEffect;
import org.telegram.tgnet.TLRPC$TL_message;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.spoilers.SpoilerEffect2;
import org.telegram.ui.EmojiAnimationsOverlay;
import org.telegram.ui.MessageSendPreview;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;
public class MessageSendPreview extends Dialog implements NotificationCenter.NotificationCenterDelegate {
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
    private ChatMessageCell destCell;
    private float destClipBottom;
    private float destClipTop;
    private boolean dismissing;
    private Utilities.Callback2<Canvas, Utilities.Callback0Return<Boolean>> drawEditText;
    private Utilities.Callback<Canvas> drawEditTextBackground;
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
    private final LongSparseArray<MessageObject.GroupedMessages> groupedMessagesMap;
    private final Rect insets;
    private boolean keyboardVisible;
    private boolean layoutDone;
    private ChatMessageCell mainMessageCell;
    private int mainMessageCellId;
    private final ArrayList<MessageObject> messageObjects;
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
        this.insets = new Rect();
        this.messageObjects = new ArrayList<>();
        this.groupedMessagesMap = new LongSparseArray<>();
        this.editTextBackgroundPaint = new Paint(1);
        this.sendButtonInitialPosition = new int[2];
        this.dismissing = false;
        this.cellDelta = new Rect();
        this.context = context;
        this.resourcesProvider = resourcesProvider;
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            protected void dispatchDraw(Canvas canvas) {
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
        };
        this.windowView = frameLayout;
        this.spoilerEffect2 = SpoilerEffect2.getInstance(1, frameLayout, frameLayout);
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                MessageSendPreview.this.lambda$new$0(view);
            }
        });
        frameLayout.getViewTreeObserver().addOnGlobalFocusChangeListener(new AnonymousClass2());
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(context, resourcesProvider);
        this.containerView = anonymousClass3;
        anonymousClass3.setClipToPadding(false);
        frameLayout.addView(anonymousClass3, LayoutHelper.createFrame(-1, -1, 119));
        if (Build.VERSION.SDK_INT >= 21) {
            frameLayout.setFitsSystemWindows(true);
            frameLayout.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                @Override
                public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 < 30) {
                        MessageSendPreview.this.insets.set(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                    } else {
                        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.displayCutout() | WindowInsetsCompat.Type.systemBars());
                        MessageSendPreview.this.insets.set(insets.left, insets.top, insets.right, insets.bottom);
                    }
                    MessageSendPreview.this.containerView.setPadding(MessageSendPreview.this.insets.left, MessageSendPreview.this.insets.top, MessageSendPreview.this.insets.right, MessageSendPreview.this.insets.bottom);
                    MessageSendPreview.this.windowView.requestLayout();
                    if (i2 >= 30) {
                        return WindowInsets.CONSUMED;
                    }
                    return windowInsets.consumeSystemWindowInsets();
                }
            });
        }
        RecyclerListView recyclerListView = new RecyclerListView(context, resourcesProvider) {
            private final AnimatedFloat bottom;
            private final GradientClip clip;
            private final ArrayList<MessageObject.GroupedMessages> drawingGroups = new ArrayList<>(10);
            private final AnimatedFloat top;

            {
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                this.top = new AnimatedFloat(this, 0L, 360L, cubicBezierInterpolator);
                this.bottom = new AnimatedFloat(this, 0L, 360L, cubicBezierInterpolator);
                this.clip = new GradientClip();
            }

            @Override
            public void onMeasure(int i2, int i3) {
                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(Math.max(0, ((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(MessageSendPreview.this.messageObjects.isEmpty() ? -6.0f : 48.0f) + (MessageSendPreview.this.optionsView == null ? 0 : MessageSendPreview.this.optionsView.getMeasuredHeight()))) - AndroidUtilities.dp(8.0f)) - MessageSendPreview.this.insets.top), Integer.MIN_VALUE));
                int max = Math.max(MessageSendPreview.this.sendButtonWidth, -((MessageSendPreview.this.sendButtonInitialPosition[0] + AndroidUtilities.dp(7.0f)) - getMeasuredWidth()));
                float max2 = Math.max(1, getMeasuredWidth() - max) / Math.max(1, ((getMeasuredWidth() - max) - AndroidUtilities.dp(8.0f)) + Math.max(0, MessageSendPreview.this.messageObjectsWidth - ((getMeasuredWidth() - max) - AndroidUtilities.dp((MessageSendPreview.this.groupedMessagesMap.isEmpty() ? 0 : 40) + 8))));
                setPivotX(getMeasuredWidth());
                setPivotY(getMeasuredHeight());
                setScaleX(max2);
                setScaleY(max2);
            }

            @Override
            public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
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
            public void dispatchDraw(Canvas canvas) {
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
                if (view instanceof ChatMessageCell) {
                    ChatMessageCell chatMessageCell = (ChatMessageCell) view;
                    chatMessageCell.setInvalidatesParent(true);
                    chatMessageCell.drawCheckBox(canvas);
                    canvas.save();
                    canvas.translate(chatMessageCell.getX(), chatMessageCell.getY());
                    canvas.scale(chatMessageCell.getScaleX(), chatMessageCell.getScaleY(), chatMessageCell.getPivotX(), chatMessageCell.getPivotY());
                    if (chatMessageCell.drawBackgroundInParent() && chatMessageCell.getCurrentPosition() == null) {
                        chatMessageCell.drawBackgroundInternal(canvas, true);
                    }
                    canvas.restore();
                    boolean drawChild = super.drawChild(canvas, view, j);
                    canvas.save();
                    canvas.translate(chatMessageCell.getX(), chatMessageCell.getY());
                    canvas.scale(chatMessageCell.getScaleX(), chatMessageCell.getScaleY(), chatMessageCell.getPivotX(), chatMessageCell.getPivotY());
                    if (chatMessageCell.getCurrentPosition() != null && (((chatMessageCell.getCurrentPosition().flags & chatMessageCell.captionFlag()) != 0 && (chatMessageCell.getCurrentPosition().flags & 1) != 0) || (chatMessageCell.getCurrentMessagesGroup() != null && chatMessageCell.getCurrentMessagesGroup().isDocuments))) {
                        chatMessageCell.drawCaptionLayout(canvas, false, chatMessageCell.getAlpha());
                    }
                    if (chatMessageCell.getCurrentPosition() != null && (((chatMessageCell.getCurrentPosition().flags & 8) != 0 && (chatMessageCell.getCurrentPosition().flags & 1) != 0) || (chatMessageCell.getCurrentMessagesGroup() != null && chatMessageCell.getCurrentMessagesGroup().isDocuments))) {
                        chatMessageCell.drawReactionsLayout(canvas, chatMessageCell.getAlpha(), null);
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
                    return drawChild;
                }
                return true;
            }

            private void drawChatBackgroundElements(Canvas canvas) {
                boolean z;
                int i2;
                MessageObject.GroupedMessages currentMessagesGroup;
                MessageObject.GroupedMessages currentMessagesGroup2;
                int childCount = getChildCount();
                ?? r3 = 0;
                MessageObject.GroupedMessages groupedMessages = null;
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if ((childAt instanceof ChatMessageCell) && ((currentMessagesGroup2 = ((ChatMessageCell) childAt).getCurrentMessagesGroup()) == null || currentMessagesGroup2 != groupedMessages)) {
                        groupedMessages = currentMessagesGroup2;
                    }
                }
                int i4 = 0;
                while (i4 < 3) {
                    this.drawingGroups.clear();
                    if (i4 != 2 || MessageSendPreview.this.chatListView.isFastScrollAnimationRunning()) {
                        int i5 = 0;
                        while (true) {
                            z = true;
                            if (i5 >= childCount) {
                                break;
                            }
                            View childAt2 = MessageSendPreview.this.chatListView.getChildAt(i5);
                            if (childAt2 instanceof ChatMessageCell) {
                                ChatMessageCell chatMessageCell = (ChatMessageCell) childAt2;
                                if (childAt2.getY() <= MessageSendPreview.this.chatListView.getHeight() && childAt2.getY() + childAt2.getHeight() >= 0.0f && (currentMessagesGroup = chatMessageCell.getCurrentMessagesGroup()) != null && ((i4 != 0 || currentMessagesGroup.messages.size() != 1) && ((i4 != 1 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i4 != 0 || !chatMessageCell.getMessageObject().deleted) && ((i4 != 1 || chatMessageCell.getMessageObject().deleted) && ((i4 != 2 || chatMessageCell.willRemovedAfterAnimation()) && (i4 == 2 || !chatMessageCell.willRemovedAfterAnimation()))))))) {
                                    if (!this.drawingGroups.contains(currentMessagesGroup)) {
                                        MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                        transitionParams.left = r3;
                                        transitionParams.top = r3;
                                        transitionParams.right = r3;
                                        transitionParams.bottom = r3;
                                        transitionParams.pinnedBotton = r3;
                                        transitionParams.pinnedTop = r3;
                                        transitionParams.cell = chatMessageCell;
                                        this.drawingGroups.add(currentMessagesGroup);
                                    }
                                    currentMessagesGroup.transitionParams.pinnedTop = chatMessageCell.isPinnedTop();
                                    currentMessagesGroup.transitionParams.pinnedBotton = chatMessageCell.isPinnedBottom();
                                    int x = (int) (chatMessageCell.getX() + chatMessageCell.getBackgroundDrawableLeft());
                                    int x2 = (int) (chatMessageCell.getX() + chatMessageCell.getBackgroundDrawableRight());
                                    int y = (int) (chatMessageCell.getY() + chatMessageCell.getBackgroundDrawableTop());
                                    int y2 = (int) (chatMessageCell.getY() + chatMessageCell.getBackgroundDrawableBottom());
                                    if ((chatMessageCell.getCurrentPosition().flags & 4) == 0) {
                                        y -= AndroidUtilities.dp(10.0f);
                                    }
                                    if ((chatMessageCell.getCurrentPosition().flags & 8) == 0) {
                                        y2 += AndroidUtilities.dp(10.0f);
                                    }
                                    if (chatMessageCell.willRemovedAfterAnimation()) {
                                        currentMessagesGroup.transitionParams.cell = chatMessageCell;
                                    }
                                    MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                                    int i6 = transitionParams2.top;
                                    if (i6 == 0 || y < i6) {
                                        transitionParams2.top = y;
                                    }
                                    int i7 = transitionParams2.bottom;
                                    if (i7 == 0 || y2 > i7) {
                                        transitionParams2.bottom = y2;
                                    }
                                    int i8 = transitionParams2.left;
                                    if (i8 == 0 || x < i8) {
                                        transitionParams2.left = x;
                                    }
                                    int i9 = transitionParams2.right;
                                    if (i9 == 0 || x2 > i9) {
                                        transitionParams2.right = x2;
                                    }
                                }
                            }
                            i5++;
                        }
                        int i10 = 0;
                        while (i10 < this.drawingGroups.size()) {
                            MessageObject.GroupedMessages groupedMessages2 = this.drawingGroups.get(i10);
                            if (groupedMessages2 == null) {
                                i2 = i4;
                            } else {
                                float nonAnimationTranslationX = groupedMessages2.transitionParams.cell.getNonAnimationTranslationX(z);
                                MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                                float f = transitionParams3.left + nonAnimationTranslationX + transitionParams3.offsetLeft;
                                float f2 = transitionParams3.top + transitionParams3.offsetTop;
                                float f3 = transitionParams3.right + nonAnimationTranslationX + transitionParams3.offsetRight;
                                float f4 = transitionParams3.bottom + transitionParams3.offsetBottom;
                                if (f2 < (-AndroidUtilities.dp(20.0f))) {
                                    f2 = -AndroidUtilities.dp(20.0f);
                                }
                                if (f4 > MessageSendPreview.this.chatListView.getMeasuredHeight() + AndroidUtilities.dp(20.0f)) {
                                    f4 = MessageSendPreview.this.chatListView.getMeasuredHeight() + AndroidUtilities.dp(20.0f);
                                }
                                boolean z2 = (groupedMessages2.transitionParams.cell.getScaleX() == 1.0f && groupedMessages2.transitionParams.cell.getScaleY() == 1.0f) ? false : true;
                                if (z2) {
                                    canvas.save();
                                    canvas.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), f + ((f3 - f) / 2.0f), f2 + ((f4 - f2) / 2.0f));
                                }
                                MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                                i2 = i4;
                                transitionParams4.cell.drawBackground(canvas, (int) f, (int) f2, (int) f3, (int) f4, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                                MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages2.transitionParams;
                                transitionParams5.cell = null;
                                transitionParams5.drawCaptionLayout = groupedMessages2.hasCaption;
                                if (z2) {
                                    canvas.restore();
                                    for (int i11 = 0; i11 < childCount; i11++) {
                                        View childAt3 = MessageSendPreview.this.chatListView.getChildAt(i11);
                                        if (childAt3 instanceof ChatMessageCell) {
                                            ChatMessageCell chatMessageCell2 = (ChatMessageCell) childAt3;
                                            if (chatMessageCell2.getCurrentMessagesGroup() == groupedMessages2) {
                                                int left = chatMessageCell2.getLeft();
                                                int top = chatMessageCell2.getTop();
                                                childAt3.setPivotX((f - left) + ((f3 - f) / 2.0f));
                                                childAt3.setPivotY((f2 - top) + ((f4 - f2) / 2.0f));
                                            }
                                        }
                                    }
                                }
                            }
                            i10++;
                            i4 = i2;
                            z = true;
                        }
                    }
                    i4++;
                    r3 = 0;
                }
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
                                    int y = (int) (chatMessageCell2.getY() + chatMessageCell2.getBackgroundDrawableTop());
                                    int y2 = (int) (chatMessageCell2.getY() + chatMessageCell2.getBackgroundDrawableBottom());
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
                            MessageObject.GroupedMessages groupedMessages2 = this.drawingGroups.get(i9);
                            float nonAnimationTranslationX = groupedMessages2.transitionParams.cell.getNonAnimationTranslationX(true);
                            MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                            float f = transitionParams3.left + nonAnimationTranslationX + transitionParams3.offsetLeft;
                            float f2 = transitionParams3.top + transitionParams3.offsetTop;
                            float f3 = transitionParams3.right + nonAnimationTranslationX + transitionParams3.offsetRight;
                            float f4 = transitionParams3.bottom + transitionParams3.offsetBottom;
                            if (f2 < (-AndroidUtilities.dp(20.0f))) {
                                f2 = -AndroidUtilities.dp(20.0f);
                            }
                            float f5 = f2;
                            if (f4 > MessageSendPreview.this.chatListView.getMeasuredHeight() + AndroidUtilities.dp(20.0f)) {
                                f4 = MessageSendPreview.this.chatListView.getMeasuredHeight() + AndroidUtilities.dp(20.0f);
                            }
                            MessageSendPreview.this.drawStarsPrice(canvas, f, f5, f3, f4);
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
                MessageSendPreview.this.lambda$new$1(view);
            }
        });
        recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                MessageSendPreview.this.lambda$new$2(view, i2);
            }
        });
        recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                MessageSendPreview.this.chatListView.invalidate();
            }
        });
        recyclerListView.setItemAnimator(new AnonymousClass7(this, null, recyclerListView, resourcesProvider));
        GridLayoutManagerFixed gridLayoutManagerFixed = new GridLayoutManagerFixed(context, 1000, 1, true) {
            @Override
            public boolean supportsPredictiveItemAnimations() {
                return true;
            }

            @Override
            public int computeVerticalScrollExtent(RecyclerView.State state) {
                return super.computeVerticalScrollExtent(state);
            }

            @Override
            public int computeVerticalScrollOffset(RecyclerView.State state) {
                return super.computeVerticalScrollOffset(state);
            }

            @Override
            public int computeVerticalScrollRange(RecyclerView.State state) {
                return super.computeVerticalScrollRange(state);
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
        recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration(this) {
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
                float max = Math.max(point.x, point.y) * 0.5f;
                int extraInsetHeight = chatMessageCell.getExtraInsetHeight();
                int i3 = 0;
                while (true) {
                    float[] fArr = currentPosition.siblingHeights;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    extraInsetHeight += (int) Math.ceil(fArr[i3] * max);
                    i3++;
                }
                int round = extraInsetHeight + ((currentPosition.maxY - currentPosition.minY) * Math.round(AndroidUtilities.density * 7.0f));
                int size = currentMessagesGroup.posArray.size();
                while (true) {
                    if (i2 < size) {
                        MessageObject.GroupedMessagePosition groupedMessagePosition = currentMessagesGroup.posArray.get(i2);
                        byte b = groupedMessagePosition.minY;
                        byte b2 = currentPosition.minY;
                        if (b == b2 && ((groupedMessagePosition.minX != currentPosition.minX || groupedMessagePosition.maxX != currentPosition.maxX || b != b2 || groupedMessagePosition.maxY != currentPosition.maxY) && b == b2)) {
                            round -= ((int) Math.ceil(max * groupedMessagePosition.ph)) - AndroidUtilities.dp(4.0f);
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
                rect.bottom = -round;
            }
        });
        RecyclerView.Adapter adapter = new RecyclerView.Adapter() {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
                MessageSendPreview messageSendPreview = MessageSendPreview.this;
                MessageCell messageCell = new MessageCell(context, messageSendPreview.currentAccount, true, null, resourcesProvider);
                messageCell.setDelegate(new ChatMessageCell.ChatMessageCellDelegate(this) {
                    @Override
                    public boolean canDrawOutboundsContent() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canDrawOutboundsContent(this);
                    }

                    @Override
                    public boolean canPerformActions() {
                        return false;
                    }

                    @Override
                    public void didLongPress(ChatMessageCell chatMessageCell, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPress(this, chatMessageCell, f, f2);
                    }

                    @Override
                    public void didLongPressBotButton(ChatMessageCell chatMessageCell, TLRPC$KeyboardButton tLRPC$KeyboardButton) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressBotButton(this, chatMessageCell, tLRPC$KeyboardButton);
                    }

                    @Override
                    public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC$Chat tLRPC$Chat, int i3, float f, float f2) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressChannelAvatar(this, chatMessageCell, tLRPC$Chat, i3, f, f2);
                    }

                    @Override
                    public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC$User tLRPC$User, float f, float f2) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressUserAvatar(this, chatMessageCell, tLRPC$User, f, f2);
                    }

                    @Override
                    public void didPressAboutRevenueSharingAds() {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAboutRevenueSharingAds(this);
                    }

                    @Override
                    public boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell, AnimatedEmojiSpan animatedEmojiSpan) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAnimatedEmoji(this, chatMessageCell, animatedEmojiSpan);
                    }

                    @Override
                    public void didPressBoostCounter(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBoostCounter(this, chatMessageCell);
                    }

                    @Override
                    public void didPressBotButton(ChatMessageCell chatMessageCell, TLRPC$KeyboardButton tLRPC$KeyboardButton) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBotButton(this, chatMessageCell, tLRPC$KeyboardButton);
                    }

                    @Override
                    public void didPressCancelSendButton(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCancelSendButton(this, chatMessageCell);
                    }

                    @Override
                    public void didPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC$Chat tLRPC$Chat, int i3, float f, float f2, boolean z) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelAvatar(this, chatMessageCell, tLRPC$Chat, i3, f, f2, z);
                    }

                    @Override
                    public void didPressChannelRecommendation(ChatMessageCell chatMessageCell, TLRPC$Chat tLRPC$Chat, boolean z) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelRecommendation(this, chatMessageCell, tLRPC$Chat, z);
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
                    public void didPressDialogButton(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressDialogButton(this, chatMessageCell);
                    }

                    @Override
                    public void didPressEffect(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressEffect(this, chatMessageCell);
                    }

                    @Override
                    public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell, TLRPC$KeyboardButton tLRPC$KeyboardButton) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressExtendedMediaPreview(this, chatMessageCell, tLRPC$KeyboardButton);
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
                    public void didPressGroupImage(ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, TLRPC$MessageExtendedMedia tLRPC$MessageExtendedMedia, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressGroupImage(this, chatMessageCell, imageReceiver, tLRPC$MessageExtendedMedia, f, f2);
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
                    public void didPressImage(ChatMessageCell chatMessageCell, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressImage(this, chatMessageCell, f, f2);
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
                    public void didPressReaction(ChatMessageCell chatMessageCell, TLRPC$ReactionCount tLRPC$ReactionCount, boolean z, float f, float f2) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReaction(this, chatMessageCell, tLRPC$ReactionCount, z, f, f2);
                    }

                    @Override
                    public void didPressReplyMessage(ChatMessageCell chatMessageCell, int i3) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReplyMessage(this, chatMessageCell, i3);
                    }

                    @Override
                    public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressRevealSensitiveContent(this, chatMessageCell);
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
                    public void didPressTime(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressTime(this, chatMessageCell);
                    }

                    @Override
                    public void didPressTopicButton(ChatMessageCell chatMessageCell) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressTopicButton(this, chatMessageCell);
                    }

                    @Override
                    public void didPressUrl(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUrl(this, chatMessageCell, characterStyle, z);
                    }

                    @Override
                    public void didPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC$User tLRPC$User, float f, float f2, boolean z) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserAvatar(this, chatMessageCell, tLRPC$User, f, f2, z);
                    }

                    @Override
                    public void didPressUserStatus(ChatMessageCell chatMessageCell, TLRPC$User tLRPC$User, TLRPC$Document tLRPC$Document) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserStatus(this, chatMessageCell, tLRPC$User, tLRPC$Document);
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
                    public void didPressWebPage(ChatMessageCell chatMessageCell, TLRPC$WebPage tLRPC$WebPage, String str, boolean z) {
                        Browser.openUrl(chatMessageCell.getContext(), str);
                    }

                    @Override
                    public void didStartVideoStream(MessageObject messageObject) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$didStartVideoStream(this, messageObject);
                    }

                    @Override
                    public boolean doNotShowLoadingReply(MessageObject messageObject) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$doNotShowLoadingReply(this, messageObject);
                    }

                    @Override
                    public void forceUpdate(ChatMessageCell chatMessageCell, boolean z) {
                        ChatMessageCell.ChatMessageCellDelegate.CC.$default$forceUpdate(this, chatMessageCell, z);
                    }

                    @Override
                    public String getAdminRank(long j) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getAdminRank(this, j);
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
                    public boolean isLandscape() {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isLandscape(this);
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
                    public boolean shouldShowDialogButton(ChatMessageCell chatMessageCell) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldShowDialogButton(this, chatMessageCell);
                    }

                    @Override
                    public boolean shouldShowTopicButton(ChatMessageCell chatMessageCell) {
                        return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldShowTopicButton(this, chatMessageCell);
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
                chatMessageCell.setMessageObject(messageObject, validGroupedMessage, false, false);
                if (i2 != MessageSendPreview.this.getMainMessageCellPosition() || messageObject.needDrawForwarded()) {
                    return;
                }
                MessageSendPreview.this.mainMessageCell = chatMessageCell;
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
        anonymousClass3.addView(recyclerListView, LayoutHelper.createFrame(-1, -2.0f));
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

    public class AnonymousClass2 implements ViewTreeObserver.OnGlobalFocusChangeListener {
        AnonymousClass2() {
        }

        @Override
        public void onGlobalFocusChanged(View view, final View view2) {
            if (MessageSendPreview.this.focusable || !(view2 instanceof EditText)) {
                return;
            }
            AndroidUtilities.hideKeyboard(MessageSendPreview.this.editText);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessageSendPreview.AnonymousClass2.this.lambda$onGlobalFocusChanged$1(view2);
                }
            }, 200L);
        }

        public void lambda$onGlobalFocusChanged$1(final View view) {
            MessageSendPreview.this.makeFocusable();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MessageSendPreview.AnonymousClass2.this.lambda$onGlobalFocusChanged$0(view);
                }
            }, 100L);
        }

        public void lambda$onGlobalFocusChanged$0(View view) {
            AndroidUtilities.showKeyboard(view);
            if (MessageSendPreview.this.anchorSendButton != null) {
                MessageSendPreview.this.anchorSendButton.getLocationOnScreen(MessageSendPreview.this.sendButtonInitialPosition);
            }
        }
    }

    public class AnonymousClass3 extends SizeNotifierFrameLayout {
        private Paint backgroundPaint;
        int chatListViewTy;
        private GradientClip clip;
        final int[] destCellPos;
        final int[] pos;
        final int[] pos2;
        final Theme.ResourcesProvider val$resourcesProvider;

        AnonymousClass3(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.val$resourcesProvider = resourcesProvider;
            this.pos = new int[2];
            this.pos2 = new int[2];
            this.chatListViewTy = 0;
            this.destCellPos = new int[2];
            this.clip = new GradientClip();
            new AnimatedFloat(0L, 100L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.backgroundPaint = new Paint(1);
        }

        @Override
        public void dispatchDraw(final android.graphics.Canvas r30) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.MessageSendPreview.AnonymousClass3.dispatchDraw(android.graphics.Canvas):void");
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

    public void lambda$new$1(View view) {
        onBackPressed();
    }

    public void lambda$new$2(View view, int i) {
        onBackPressed();
    }

    public class AnonymousClass7 extends ChatListItemAnimator {
        Runnable finishRunnable;

        @Override
        public void checkIsRunning() {
        }

        AnonymousClass7(MessageSendPreview messageSendPreview, ChatActivity chatActivity, RecyclerListView recyclerListView, Theme.ResourcesProvider resourcesProvider) {
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
        public void onAllAnimationsDone() {
            super.onAllAnimationsDone();
            Runnable runnable = this.finishRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.finishRunnable = null;
            }
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    MessageSendPreview.AnonymousClass7.this.lambda$onAllAnimationsDone$0();
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
                    MessageSendPreview.AnonymousClass7.this.lambda$endAnimations$1();
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
            return;
        }
        this.sentEffect = true;
        super.onBackPressed();
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
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
        attributes.flags = i;
        attributes.softInputMode = 16;
        int i2 = i | 131072;
        attributes.flags = i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            attributes.flags = i2 | (-1946091264);
        }
        int i4 = attributes.flags | 1024;
        attributes.flags = i4;
        attributes.flags = i4 | 128;
        if (i3 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        this.windowView.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(this.windowView, !Theme.isCurrentThemeDark());
    }

    public void setMessageObjects(ArrayList<MessageObject> arrayList) {
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= arrayList.size()) {
                break;
            }
            MessageObject messageObject = arrayList.get(i);
            if (messageObject.hasValidGroupId()) {
                MessageObject.GroupedMessages groupedMessages = this.groupedMessagesMap.get(messageObject.getGroupIdForUse());
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
                        if (i2 >= groupedMessages.messages.size()) {
                            z = false;
                            break;
                        } else if (groupedMessages.messages.get(i2).getId() == messageObject.getId()) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z) {
                        groupedMessages.messages.add(messageObject);
                    }
                }
            } else if (messageObject.getGroupIdForUse() != 0) {
                messageObject.messageOwner.grouped_id = 0L;
                messageObject.localSentGroupId = 0L;
            }
            i++;
        }
        for (int i3 = 0; i3 < this.groupedMessagesMap.size(); i3++) {
            this.groupedMessagesMap.valueAt(i3).calculate();
        }
        this.messageObjects.addAll(arrayList);
        for (int i4 = 0; i4 < this.messageObjects.size(); i4++) {
            this.messageObjectsWidth = Math.max(this.messageObjectsWidth, getWidthForMessage(this.messageObjects.get(i4)));
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
        this.cameraRect.set(iArr[0], iArr[1], iArr[0] + textureView.getWidth(), iArr[1] + textureView.getHeight());
    }

    public void setEditText(EditTextCaption editTextCaption, Utilities.Callback2<Canvas, Utilities.Callback0Return<Boolean>> callback2, Utilities.Callback<Canvas> callback) {
        this.editText = editTextCaption;
        this.drawEditText = callback2;
        this.drawEditTextBackground = callback;
    }

    public void setSendButton(final ChatActivityEnterView.SendButton sendButton, final boolean z, View.OnClickListener onClickListener) {
        this.anchorSendButton = sendButton;
        sendButton.getLocationOnScreen(this.sendButtonInitialPosition);
        this.sendButtonWidth = this.anchorSendButton.getWidth();
        ChatActivityEnterView.SendButton sendButton2 = new ChatActivityEnterView.SendButton(getContext(), sendButton.resId, this.resourcesProvider) {
            @Override
            public boolean isInScheduleMode() {
                return sendButton.isInScheduleMode();
            }

            @Override
            public boolean isOpen() {
                return (z && MessageSendPreview.this.dismissing) ? false : true;
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
        this.anchorSendButton.copyCountTo(sendButton2);
        this.anchorSendButton.copyEmojiTo(this.sendButton);
        ChatActivityEnterView.SendButton sendButton3 = this.sendButton;
        sendButton3.center = sendButton.center;
        sendButton3.open.set(sendButton.open.get(), true);
        this.sendButton.setOnClickListener(onClickListener);
        this.containerView.addView(this.sendButton, new ViewGroup.LayoutParams(sendButton.getWidth(), sendButton.getHeight()));
    }

    public void setItemOptions(ItemOptions itemOptions) {
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
        ReactionsContainerLayout reactionsContainerLayout = new ReactionsContainerLayout(this, 5, null, getContext(), this.currentAccount, this.resourcesProvider) {
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
        this.effectSelector.setDelegate(new AnonymousClass16(baseFragment));
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
                MessageSendPreview.this.lambda$allowEffectSelector$3((Integer) obj);
            }
        });
    }

    public class AnonymousClass16 implements ReactionsContainerLayout.ReactionsContainerDelegate {
        final BaseFragment val$fragment;

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

        AnonymousClass16(BaseFragment baseFragment) {
            this.val$fragment = baseFragment;
        }

        @Override
        public void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
            boolean z3;
            boolean z4;
            if (visibleReaction == null || MessageSendPreview.this.effectSelector == null) {
                return;
            }
            boolean z5 = !UserConfig.getInstance(MessageSendPreview.this.currentAccount).isPremium() && visibleReaction.premium;
            if (MessageSendPreview.this.mainMessageCell != null) {
                MessageObject messageObject = MessageSendPreview.this.mainMessageCell.getMessageObject();
                if (messageObject == null) {
                    return;
                }
                TLRPC$Message tLRPC$Message = messageObject.messageOwner;
                long j = tLRPC$Message.effect;
                long j2 = visibleReaction.effectId;
                if (j2 == j) {
                    tLRPC$Message.flags2 &= -5;
                    tLRPC$Message.effect = 0L;
                    z4 = true;
                } else {
                    tLRPC$Message.flags2 |= 4;
                    tLRPC$Message.effect = j2;
                    z4 = false;
                }
                if (!z5) {
                    MessageSendPreview.this.mainMessageCell.setMessageObject(messageObject, MessageSendPreview.this.getValidGroupedMessage(messageObject), MessageSendPreview.this.messageObjects.size() > 1, false);
                    MessageSendPreview.this.effectSelector.setSelectedReactionAnimated(z4 ? null : visibleReaction);
                    if (MessageSendPreview.this.effectSelector.getReactionsWindow() != null && MessageSendPreview.this.effectSelector.getReactionsWindow().getSelectAnimatedEmojiDialog() != null) {
                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = MessageSendPreview.this.effectSelector.getReactionsWindow().getSelectAnimatedEmojiDialog();
                        if (z4) {
                            visibleReaction = null;
                        }
                        selectAnimatedEmojiDialog.setSelectedReaction(visibleReaction);
                        MessageSendPreview.this.effectSelector.getReactionsWindow().containerView.invalidate();
                    }
                }
                MessageSendPreview.this.effectOverlay.clear();
                if (!z4) {
                    MessageSendPreview.this.effectOverlay.showAnimationForCell(MessageSendPreview.this.mainMessageCell, 0, false, false);
                }
                if (z5) {
                    TLRPC$Message tLRPC$Message2 = messageObject.messageOwner;
                    tLRPC$Message2.effect = j;
                    if (j == 0) {
                        tLRPC$Message2.flags2 &= -5;
                    }
                }
                if (MessageSendPreview.this.sendButton != null) {
                    MessageSendPreview.this.sendButton.setEffect(messageObject.messageOwner.effect);
                }
                MessageSendPreview.this.onEffectChange(messageObject.messageOwner.effect);
            } else if (MessageSendPreview.this.cameraRect != null) {
                if (visibleReaction.effectId == MessageSendPreview.this.effectId) {
                    MessageSendPreview.this.effectId = 0L;
                    z3 = true;
                } else {
                    MessageSendPreview.this.effectId = visibleReaction.effectId;
                    z3 = false;
                }
                if (MessageSendPreview.this.sendButton != null) {
                    MessageSendPreview.this.sendButton.setEffect(MessageSendPreview.this.effectId);
                }
                MessageSendPreview messageSendPreview = MessageSendPreview.this;
                messageSendPreview.onEffectChange(messageSendPreview.effectId);
                if (!z5) {
                    TLRPC$TL_availableEffect effect = MessageSendPreview.this.effectId == 0 ? null : MessagesController.getInstance(MessageSendPreview.this.currentAccount).getEffect(MessageSendPreview.this.effectId);
                    if (MessageSendPreview.this.effectDrawable != null) {
                        if (MessageSendPreview.this.effectId == 0 || effect == null) {
                            MessageSendPreview.this.effectDrawable.set((Drawable) null, true);
                        } else {
                            MessageSendPreview.this.effectDrawable.set((Drawable) Emoji.getEmojiDrawable(effect.emoticon), true);
                        }
                    }
                    MessageSendPreview.this.effectSelector.setSelectedReactionAnimated(z3 ? null : visibleReaction);
                    if (MessageSendPreview.this.effectSelector.getReactionsWindow() != null && MessageSendPreview.this.effectSelector.getReactionsWindow().getSelectAnimatedEmojiDialog() != null) {
                        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog2 = MessageSendPreview.this.effectSelector.getReactionsWindow().getSelectAnimatedEmojiDialog();
                        if (z3) {
                            visibleReaction = null;
                        }
                        selectAnimatedEmojiDialog2.setSelectedReaction(visibleReaction);
                        MessageSendPreview.this.effectSelector.getReactionsWindow().containerView.invalidate();
                    }
                }
                MessageSendPreview.this.effectOverlay.clear();
                if (!z3) {
                    TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
                    tLRPC$TL_message.effect = MessageSendPreview.this.effectId;
                    if (MessageSendPreview.this.effectId != 0) {
                        tLRPC$TL_message.flags2 |= 4;
                    }
                    MessageSendPreview.this.effectOverlay.createDrawingObject(null, 0, null, new MessageObject(MessageSendPreview.this.currentAccount, tLRPC$TL_message, false, false), 0, false, false, 0.0f, 0.0f, true);
                }
            }
            if (z5 && this.val$fragment != null) {
                BulletinFactory of = BulletinFactory.of(MessageSendPreview.this.containerView, MessageSendPreview.this.resourcesProvider);
                int i = R.raw.star_premium_2;
                String string = LocaleController.getString(R.string.AnimatedEffectPremium);
                final BaseFragment baseFragment = this.val$fragment;
                of.createSimpleBulletin(i, AndroidUtilities.premiumText(string, new Runnable() {
                    @Override
                    public final void run() {
                        MessageSendPreview.AnonymousClass16.lambda$onReactionClicked$0(BaseFragment.this);
                    }
                })).show();
            }
            MessageSendPreview.this.effectsView.invalidate();
        }

        public static void lambda$onReactionClicked$0(BaseFragment baseFragment) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            baseFragment.showAsSheet(new PremiumPreviewFragment("effect"), bottomSheetParams);
        }
    }

    public void lambda$allowEffectSelector$3(Integer num) {
        boolean z = num.intValue() - this.insets.bottom > AndroidUtilities.dp(20.0f);
        this.keyboardVisible = z;
        this.effectSelectorContainer.animate().translationY((z ? Math.min(this.effectSelectorContainerY, (this.windowView.getHeight() - num.intValue()) - this.effectSelectorContainer.getMeasuredHeight()) : this.effectSelectorContainerY) - this.effectSelectorContainer.getTop()).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).start();
    }

    public void setEffectId(long j) {
        TLRPC$TL_availableEffect effect;
        this.effectId = j;
        int mainMessageCellPosition = getMainMessageCellPosition();
        MessageObject messageObject = (mainMessageCellPosition < 0 || mainMessageCellPosition >= this.messageObjects.size()) ? null : this.messageObjects.get(mainMessageCellPosition);
        if (messageObject != null) {
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            tLRPC$Message.flags2 |= 4;
            tLRPC$Message.effect = j;
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
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            if ((tLRPC$Message.flags2 & 4) == 0) {
                return 0L;
            }
            this.sentEffect = true;
            return tLRPC$Message.effect;
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
        int[] iArr2 = this.sendButtonInitialPosition;
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        int measuredHeight = (this.chatListView.getMeasuredHeight() - this.sendButton.getWidth()) + (this.effectSelector != null ? AndroidUtilities.dp(320.0f) : 0);
        int dp = this.insets.top + AndroidUtilities.dp(8.0f);
        int dp2 = AndroidUtilities.dp(this.messageObjects.isEmpty() ? -6.0f : 48.0f);
        View view = this.optionsView;
        int measuredHeight2 = dp2 + (view == null ? 0 : view.getMeasuredHeight());
        int measuredHeight3 = (this.containerView.getMeasuredHeight() - AndroidUtilities.dp(8.0f)) - this.insets.bottom;
        if (iArr[1] + measuredHeight2 > measuredHeight3) {
            iArr[1] = measuredHeight3 - measuredHeight2;
        }
        if (iArr[1] - measuredHeight < dp) {
            iArr[1] = dp + measuredHeight;
        }
        if (iArr[1] + measuredHeight2 > measuredHeight3) {
            iArr[1] = measuredHeight3 - measuredHeight2;
        }
        this.sendButton.setX(iArr[0]);
        this.sendButton.setY(iArr[1]);
        this.chatListView.setX((iArr[0] + AndroidUtilities.dp(7.0f)) - this.chatListView.getMeasuredWidth());
        if (this.layoutDone) {
            this.chatListView.animate().translationY(((iArr[1] + this.sendButton.getWidth()) - this.chatListView.getMeasuredHeight()) - this.chatListView.getTop()).setInterpolator(ChatListItemAnimator.DEFAULT_INTERPOLATOR).setDuration(250L).start();
        } else {
            this.chatListView.setY((iArr[1] + this.sendButton.getWidth()) - this.chatListView.getMeasuredHeight());
        }
        View view2 = this.optionsView;
        if (view2 != null) {
            view2.setX((iArr[0] + AndroidUtilities.dp(7.0f)) - this.optionsView.getMeasuredWidth());
            this.optionsView.setY(iArr[1] + (this.messageObjects.isEmpty() ? -AndroidUtilities.dp(6.0f) : this.sendButton.getHeight()));
        }
        FrameLayout frameLayout = this.effectSelectorContainer;
        if (frameLayout != null) {
            frameLayout.setX(Math.max(0, ((iArr[0] + this.sendButton.getWidth()) - this.effectSelectorContainer.getMeasuredWidth()) - AndroidUtilities.dp(6.0f)));
            RectF rectF = this.cameraRect;
            if (rectF != null) {
                FrameLayout frameLayout2 = this.effectSelectorContainer;
                float max = Math.max(this.insets.top, rectF.top - frameLayout2.getMeasuredWidth());
                this.effectSelectorContainerY = max;
                frameLayout2.setY(max);
                ReactionsContainerLayout reactionsContainerLayout = this.effectSelector;
                if (reactionsContainerLayout != null) {
                    reactionsContainerLayout.setY(Math.max(this.insets.top, (this.cameraRect.top - AndroidUtilities.dp(24.0f)) - this.effectSelector.getMeasuredHeight()));
                    return;
                }
                return;
            }
            float width = (iArr[1] + this.sendButton.getWidth()) - this.chatListView.getMeasuredHeight();
            FrameLayout frameLayout3 = this.effectSelectorContainer;
            float max2 = Math.max(this.insets.top, width - frameLayout3.getMeasuredHeight()) + AndroidUtilities.dp(24.0f);
            this.effectSelectorContainerY = max2;
            frameLayout3.setY(max2);
            ReactionsContainerLayout reactionsContainerLayout2 = this.effectSelector;
            if (reactionsContainerLayout2 != null) {
                reactionsContainerLayout2.setY(Math.max(0.0f, (width - reactionsContainerLayout2.getMeasuredHeight()) - this.effectSelectorContainerY));
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

    public static class VisiblePart {
        private VisiblePart() {
        }

        public static VisiblePart of(ChatMessageCell chatMessageCell) {
            VisiblePart visiblePart = new VisiblePart();
            int i = chatMessageCell.childPosition;
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
            chatMessageCell2.setMessageObject(chatMessageCell.getMessageObject(), null, chatMessageCell.isPinnedBottom(), chatMessageCell.isPinnedTop());
            ChatMessageCell.TransitionParams transitionParams = this.mainMessageCell.getTransitionParams();
            transitionParams.animateChange = this.mainMessageCell.getTransitionParams().animateChange();
            transitionParams.animateChangeProgress = 0.0f;
            if ((this.mainMessageCell.getTransitionParams().lastDrawingBackgroundRect.left != this.mainMessageCell.getBackgroundDrawableLeft()) || transitionParams.lastDrawingBackgroundRect.top != this.mainMessageCell.getBackgroundDrawableTop() || transitionParams.lastDrawingBackgroundRect.bottom != this.mainMessageCell.getBackgroundDrawableBottom()) {
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
            }
            VisiblePart.of(this.mainMessageCell);
        }
        animateOpenTo(false, new Runnable() {
            @Override
            public final void run() {
                MessageSendPreview.this.lambda$dismissInto$5();
            }
        });
        this.windowView.invalidate();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.availableEffectsUpdate);
    }

    public void lambda$dismissInto$5() {
        SpoilerEffect2.pause(0, false);
        SpoilerEffect2 spoilerEffect2 = this.spoilerEffect2;
        if (spoilerEffect2 != null) {
            spoilerEffect2.detach(this.windowView);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessageSendPreview.this.lambda$dismissInto$4();
            }
        });
    }

    public void lambda$dismissInto$4() {
        super.dismiss();
    }

    public void dismiss(boolean z) {
        this.sent = z;
        dismiss();
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
                MessageSendPreview.this.lambda$dismiss$7();
            }
        });
        this.windowView.invalidate();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.availableEffectsUpdate);
    }

    public void lambda$dismiss$7() {
        SpoilerEffect2.pause(0, false);
        SpoilerEffect2 spoilerEffect2 = this.spoilerEffect2;
        if (spoilerEffect2 != null) {
            spoilerEffect2.detach(this.windowView);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                MessageSendPreview.this.lambda$dismiss$6();
            }
        });
    }

    public void lambda$dismiss$6() {
        super.dismiss();
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
        this.closing = !z;
        this.chatListView.invalidate();
        this.firstOpenFrame = true;
        this.firstOpenFrame2 = true;
        float[] fArr = new float[2];
        fArr[0] = this.openProgress;
        fArr[1] = z ? 1.0f : 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        this.openAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                MessageSendPreview.this.lambda$animateOpenTo$8(z2, valueAnimator2);
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

    public void lambda$animateOpenTo$8(boolean z, ValueAnimator valueAnimator) {
        View view;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.openProgress = floatValue;
        this.effectsView.setAlpha(floatValue);
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
        AndroidUtilities.makeGlobalBlurBitmap(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                MessageSendPreview.this.lambda$prepareBlur$9(view, (Bitmap) obj);
            }
        }, 14.0f);
    }

    public void lambda$prepareBlur$9(View view, Bitmap bitmap) {
        if (view != null) {
            view.setVisibility(0);
        }
        this.blurBitmap = bitmap;
        Paint paint = new Paint(1);
        this.blurBitmapPaint = paint;
        Bitmap bitmap2 = this.blurBitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
        this.blurBitmapShader = bitmapShader;
        paint.setShader(bitmapShader);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? 0.08f : 0.25f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? -0.02f : -0.07f);
        this.blurBitmapPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.blurMatrix = new Matrix();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.availableEffectsUpdate && MessagesController.getInstance(this.currentAccount).hasAvailableEffects()) {
            showEffectSelector();
        }
    }

    public MessageObject.GroupedMessages getValidGroupedMessage(MessageObject messageObject) {
        if (messageObject.getGroupId() != 0) {
            MessageObject.GroupedMessages groupedMessages = this.groupedMessagesMap.get(messageObject.getGroupId());
            if (groupedMessages == null || (groupedMessages.messages.size() > 1 && groupedMessages.getPosition(messageObject) != null)) {
                return groupedMessages;
            }
            return null;
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
        if (this.chatListView == null) {
            return;
        }
        ChatMessageCell chatMessageCell = null;
        int i = 0;
        while (true) {
            if (i >= this.chatListView.getChildCount()) {
                break;
            }
            View childAt = this.chatListView.getChildAt(i);
            if (childAt instanceof ChatMessageCell) {
                ChatMessageCell chatMessageCell2 = (ChatMessageCell) childAt;
                if (chatMessageCell2.getMessageObject() == messageObject) {
                    chatMessageCell = chatMessageCell2;
                    break;
                }
            }
            i++;
        }
        int i2 = -1;
        for (int i3 = 0; i3 < this.messageObjects.size(); i3++) {
            if (this.messageObjects.get(i3) == messageObject) {
                i2 = (this.messageObjects.size() - 1) - i3;
            }
        }
        if (chatMessageCell == null) {
            this.chatListView.getAdapter().notifyItemChanged(i2);
            return;
        }
        messageObject.forceUpdate = true;
        chatMessageCell.setMessageObject(messageObject, chatMessageCell.getCurrentMessagesGroup(), chatMessageCell.isPinnedBottom(), chatMessageCell.isPinnedTop());
        this.chatListView.getAdapter().notifyItemChanged(i2);
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
        return chatMessageCell.computeWidth(messageObject, this.groupedMessagesMap.get(messageObject.getGroupId()));
    }

    public void setStars(long j) {
        TLRPC$Message tLRPC$Message;
        TLRPC$MessageMedia tLRPC$MessageMedia;
        this.buttonText = j <= 0 ? null : new Text(StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatPluralStringComma("UnlockPaidContent", (int) j), 0.7f), 14.0f, AndroidUtilities.bold());
        if (this.buttonBgPaint == null) {
            Paint paint = new Paint(1);
            this.buttonBgPaint = paint;
            paint.setColor(1073741824);
        }
        this.chatListView.invalidate();
        for (int i = 0; i < this.messageObjects.size(); i++) {
            MessageObject messageObject = this.messageObjects.get(i);
            if (messageObject != null && (tLRPC$Message = messageObject.messageOwner) != null && (tLRPC$MessageMedia = tLRPC$Message.media) != null) {
                tLRPC$MessageMedia.spoiler = j > 0;
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
        float dp = AndroidUtilities.dp(28.0f) + this.buttonText.getCurrentWidth();
        RectF rectF = AndroidUtilities.rectTmp;
        float f7 = dp / 2.0f;
        float f8 = f5 - f7;
        float dp2 = AndroidUtilities.dp(32.0f) / 2.0f;
        rectF.set(f8, f6 - dp2, f5 + f7, f6 + dp2);
        canvas.save();
        canvas.drawRoundRect(rectF, dp2, dp2, this.buttonBgPaint);
        this.buttonText.draw(canvas, f8 + AndroidUtilities.dp(14.0f), f6, -1, 1.0f);
        canvas.restore();
    }
}
