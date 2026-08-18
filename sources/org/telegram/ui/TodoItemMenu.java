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
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MessagePreviewView;
import org.telegram.ui.Components.MessagePrivateSeenView;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScrimOptions;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.Components.chat.ViewPositionWatcher;

public class TodoItemMenu extends Dialog {
    private Bitmap blurBitmap;
    private Paint blurBitmapPaint;
    private BitmapShader blurBitmapShader;
    private Matrix blurMatrix;
    private ChatMessageCell cell;
    private float clipBottom;
    private float clipTop;
    private FrameLayout containerView;
    public final Context context;
    private Runnable dismissListener;
    private boolean dismissing;
    private boolean dismissingWithAlpha;
    private float dtx1;
    private float dtx2;
    private float dty1;
    private float dty2;
    private boolean hasDestTranslation;
    private boolean hasTranslation;
    private float heightdiff;
    private TextView hintTextView;
    private final BlurredBackgroundDrawableViewFactory iBlur3Factory;
    private final BlurredBackgroundSourceBitmap iBlur3SourceBitmap;
    private Insets insets;
    private boolean isOut;
    private FrameLayout menuContainer;
    private MessageObject messageObject;
    private View messageOptionsView;
    private float messageOptionsViewMaxWidth;
    private ChatMessageCell myCell;
    private ChatMessageCell myTaskCell;
    private boolean open;
    private ValueAnimator open2Animator;
    private ValueAnimator openAnimator;
    private float openProgress;
    private float openProgress2;
    private ReactionsContainerLayout reactionsView;
    public final Theme.ResourcesProvider resourcesProvider;
    private boolean setCellInvisible;
    private boolean setTaskInvisible;
    private MessagePreviewView.TabsView tabsView;
    private int taskId;
    private View taskOptionsView;
    private float taskOptionsViewMaxWidth;
    private float tx;
    private float ty;
    private ViewPagerFixed viewPager;
    private FrameLayout windowView;

    public TodoItemMenu(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, R.style.TransparentDialog);
        this.insets = Insets.NONE;
        this.clipTop = 0.0f;
        this.clipBottom = 0.0f;
        this.taskOptionsViewMaxWidth = -1.0f;
        this.messageOptionsViewMaxWidth = -1.0f;
        this.dismissing = false;
        this.context = context;
        this.resourcesProvider = resourcesProvider;
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (TodoItemMenu.this.openProgress > 0.0f && TodoItemMenu.this.blurBitmapPaint != null) {
                    TodoItemMenu.this.blurMatrix.reset();
                    float width = getWidth() / TodoItemMenu.this.blurBitmap.getWidth();
                    TodoItemMenu.this.blurMatrix.postScale(width, width);
                    TodoItemMenu.this.blurBitmapShader.setLocalMatrix(TodoItemMenu.this.blurMatrix);
                    TodoItemMenu.this.blurBitmapPaint.setAlpha((int) (TodoItemMenu.this.openProgress * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), TodoItemMenu.this.blurBitmapPaint);
                }
                if (TodoItemMenu.this.setCellInvisible && TodoItemMenu.this.cell != null) {
                    TodoItemMenu.this.cell.setVisibility(4);
                    TodoItemMenu.this.setCellInvisible = false;
                }
                if (TodoItemMenu.this.setTaskInvisible && TodoItemMenu.this.cell != null) {
                    TodoItemMenu.this.cell.doNotDrawTaskId = TodoItemMenu.this.taskId;
                    TodoItemMenu.this.cell.invalidate();
                    TodoItemMenu.this.setTaskInvisible = false;
                }
                super.dispatchDraw(canvas);
            }

            @Override
            public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    TodoItemMenu.this.dismiss();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            }

            @Override
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                TodoItemMenu.this.setupTranslation();
            }

            @Override
            protected void onSizeChanged(int i, int i2, int i3, int i4) {
                super.onSizeChanged(i, i2, i3, i4);
                TodoItemMenu.this.checkBitmapMatrix();
            }
        };
        this.windowView = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$0(view);
            }
        });
        BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = new BlurredBackgroundSourceBitmap();
        this.iBlur3SourceBitmap = blurredBackgroundSourceBitmap;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceBitmap);
        this.iBlur3Factory = blurredBackgroundDrawableViewFactory;
        blurredBackgroundDrawableViewFactory.setSourceRootView(new ViewPositionWatcher(this.windowView), this.windowView);
        FrameLayout frameLayout2 = new FrameLayout(context) {
            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if (view == TodoItemMenu.this.myCell || view == TodoItemMenu.this.myTaskCell) {
                    canvas.save();
                    canvas.clipRect(0.0f, AndroidUtilities.lerp(TodoItemMenu.this.clipTop, 0.0f, TodoItemMenu.this.openProgress), getWidth(), AndroidUtilities.lerp(TodoItemMenu.this.clipBottom, getHeight(), TodoItemMenu.this.openProgress));
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild;
                }
                return super.drawChild(canvas, view, j);
            }
        };
        this.containerView = frameLayout2;
        frameLayout2.setClipToPadding(false);
        this.windowView.addView(this.containerView, LayoutHelper.createFrame(-1, -1, 119));
        ViewPagerFixed viewPagerFixed = new ViewPagerFixed(context) {
            @Override
            public void onTabAnimationUpdate(boolean z) {
                TodoItemMenu.this.updateTranslation();
            }
        };
        this.viewPager = viewPagerFixed;
        viewPagerFixed.setAdapter(new AnonymousClass4(context));
        this.containerView.addView(this.viewPager, LayoutHelper.createFrame(-1, -1, 119));
        FrameLayout frameLayout3 = new FrameLayout(context) {
            @Override
            protected void onMeasure(int i, int i2) {
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                TodoItemMenu.this.updateTranslation();
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt != TodoItemMenu.this.messageOptionsView || TodoItemMenu.this.messageOptionsViewMaxWidth <= 0.0f) {
                        if (childAt != TodoItemMenu.this.taskOptionsView || TodoItemMenu.this.taskOptionsViewMaxWidth <= 0.0f) {
                            if (childAt == TodoItemMenu.this.reactionsView) {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(TodoItemMenu.this.reactionsView.getTotalWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                            }
                        } else {
                            TodoItemMenu.this.taskOptionsView.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) TodoItemMenu.this.taskOptionsViewMaxWidth), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        }
                    } else {
                        TodoItemMenu.this.messageOptionsView.measure(View.MeasureSpec.makeMeasureSpec(Math.min(size, (int) TodoItemMenu.this.messageOptionsViewMaxWidth), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                    }
                }
                setMeasuredDimension(size, size2);
            }
        };
        this.menuContainer = frameLayout3;
        this.containerView.addView(frameLayout3, LayoutHelper.createFrame(-1, -1, 119));
        MessagePreviewView.TabsView tabsView = new MessagePreviewView.TabsView(context, resourcesProvider);
        this.tabsView = tabsView;
        tabsView.addTab(0, LocaleController.getString(R.string.TodoMenuTabTask));
        this.tabsView.addTab(1, LocaleController.getString(R.string.TodoMenuTabList));
        this.containerView.addView(this.tabsView, LayoutHelper.createFrame(-1, 66, 80));
        MessagePreviewView.TabsView tabsView2 = this.tabsView;
        ViewPagerFixed viewPagerFixed2 = this.viewPager;
        Objects.requireNonNull(viewPagerFixed2);
        tabsView2.setOnTabClick(new PollItemMenu$$ExternalSyntheticLambda14(viewPagerFixed2));
        MessagePreviewView.TabsView tabsView3 = this.tabsView;
        tabsView3.setBackground(blurredBackgroundDrawableViewFactory.create(tabsView3).setColorProvider(BlurredBackgroundProviderImpl.scrimMenuBackground(resourcesProvider)).setHasPadding(true).setPadding(AndroidUtilities.dp(8.0f)).setRadius(AndroidUtilities.dp(16.0f)));
        TextView textView = new TextView(context);
        this.hintTextView = textView;
        textView.setTextSize(1, 13.0f);
        this.hintTextView.setTextColor(this.tabsView.getColor());
        this.hintTextView.setText(LocaleController.getString(R.string.TodoMenuHint));
        this.hintTextView.setGravity(17);
        this.containerView.addView(this.hintTextView, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 66.0f));
        ViewCompat.setOnApplyWindowInsetsListener(this.windowView, new OnApplyWindowInsetsListener() {
            @Override
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                TodoItemMenu.this.insets = windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
                TodoItemMenu.this.containerView.setPadding(TodoItemMenu.this.insets.left, TodoItemMenu.this.insets.top, TodoItemMenu.this.insets.right, TodoItemMenu.this.insets.bottom);
                TodoItemMenu.this.windowView.requestLayout();
                return WindowInsetsCompat.CONSUMED;
            }
        });
    }

    public void lambda$new$0(View view) {
        dismiss();
    }

    class AnonymousClass4 extends ViewPagerFixed.Adapter {
        final Context val$context;

        @Override
        public void bindView(View view, int i, int i2) {
        }

        @Override
        public int getItemCount() {
            return 2;
        }

        AnonymousClass4(Context context) {
            this.val$context = context;
        }

        @Override
        public View createView(int i) {
            FrameLayout frameLayout = new FrameLayout(this.val$context);
            frameLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$createView$0(view);
                }
            });
            return frameLayout;
        }

        public void lambda$createView$0(View view) {
            TodoItemMenu.this.dismiss(true);
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
        attributes.softInputMode = 48;
        attributes.flags = i | (-1945959040);
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        this.windowView.setSystemUiVisibility(1284);
        AndroidUtilities.setLightNavigationBar(this.windowView, !Theme.isCurrentThemeDark());
    }

    public void checkBitmapMatrix() {
        Blur3Utils.checkBitmapSourceMatrixScale(this.iBlur3SourceBitmap, this.windowView);
        this.iBlur3Factory.invalidateAllLinkedViews();
    }

    public void setCell(final ChatActivity chatActivity, ChatMessageCell chatMessageCell, final int i) {
        int i2;
        final TLRPC.TodoItem todoItem;
        this.cell = chatMessageCell;
        this.taskId = i;
        MessageObject messageObject = chatMessageCell != null ? chatMessageCell.getMessageObject() : null;
        this.messageObject = messageObject;
        this.isOut = messageObject != null && messageObject.isOutOwner();
        if (this.cell != null) {
            this.clipTop = chatActivity.getChatListViewPadding() - AndroidUtilities.dp(4.0f);
            this.clipBottom = chatMessageCell.parentBoundsBottom;
            if (chatMessageCell.getParent() instanceof View) {
                View view = (View) chatMessageCell.getParent();
                this.clipTop += view.getY();
                this.clipBottom += view.getY();
            }
            final int width = this.cell.getWidth();
            final int height = this.cell.getHeight();
            this.heightdiff = height - this.cell.getHeight();
            i2 = 51;
            ChatMessageCell chatMessageCell2 = new ChatMessageCell(getContext(), UserConfig.selectedAccount, false, null, this.cell.getResourcesProvider()) {
                private final Path clipPath = new Path();
                private final Paint shadowPaint = new Paint(1);

                @Override
                public void setPressed(boolean z) {
                }

                @Override
                protected void onDraw(Canvas canvas) {
                    canvas.save();
                    int todoIndex = getTodoIndex(i);
                    float pollButtonTop = getPollButtonTop(todoIndex);
                    float pollButtonBottom = getPollButtonBottom(todoIndex);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(getPollButtonsLeft(), pollButtonTop, getPollButtonsRight(), pollButtonBottom);
                    this.clipPath.rewind();
                    this.clipPath.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                    this.shadowPaint.setColor(0);
                    this.shadowPaint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(0.66f), Theme.multAlpha(-16777216, TodoItemMenu.this.openProgress * 0.2f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.shadowPaint);
                    canvas.clipPath(this.clipPath);
                    super.onDraw(canvas);
                    canvas.restore();
                }

                @Override
                protected void onMeasure(int i3, int i4) {
                    setMeasuredDimension(width, height);
                }

                @Override
                public void drawOverlays(Canvas canvas) {
                    this.firstVisiblePollButton = 0;
                    this.lastVisiblePollButton = this.pollButtons.size() - 1;
                    super.drawOverlays(canvas);
                }
            };
            this.myTaskCell = chatMessageCell2;
            this.cell.copyParamsTo(chatMessageCell2);
            this.myTaskCell.copySpoilerEffect2AttachIndexFrom(this.cell);
            this.myTaskCell.setDelegate(new ChatMessageCell.ChatMessageCellDelegate() {
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
                public boolean canSaveRichDocument(ChatMessageCell chatMessageCell3) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canSaveRichDocument(this, chatMessageCell3);
                }

                @Override
                public boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell3) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canToggleRichMessageCheckbox(this, chatMessageCell3);
                }

                @Override
                public void didLongPress(ChatMessageCell chatMessageCell3, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPress(this, chatMessageCell3, f, f2);
                }

                @Override
                public void didLongPressBotButton(ChatMessageCell chatMessageCell3, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressBotButton(this, chatMessageCell3, keyboardButtonProto);
                }

                @Override
                public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell3, TLRPC.Chat chat, int i3, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressChannelAvatar(this, chatMessageCell3, chat, i3, f, f2);
                }

                @Override
                public void didLongPressCustomBotButton(ChatMessageCell chatMessageCell3, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressCustomBotButton(this, chatMessageCell3, buttonCustom);
                }

                @Override
                public boolean didLongPressPollOption(ChatMessageCell chatMessageCell3, TLRPC.PollAnswer pollAnswer) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressPollOption(this, chatMessageCell3, pollAnswer);
                }

                @Override
                public boolean didLongPressToDoButton(ChatMessageCell chatMessageCell3, TLRPC.TodoItem todoItem2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressToDoButton(this, chatMessageCell3, todoItem2);
                }

                @Override
                public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell3, TLRPC.User user, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressUserAvatar(this, chatMessageCell3, user, f, f2);
                }

                @Override
                public void didPressAboutRevenueSharingAds() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAboutRevenueSharingAds(this);
                }

                @Override
                public void didPressAddPollOptionButton(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAddPollOptionButton(this, chatMessageCell3);
                }

                @Override
                public void didPressAdmin(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAdmin(this, chatMessageCell3);
                }

                @Override
                public boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell3, AnimatedEmojiSpan animatedEmojiSpan) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAnimatedEmoji(this, chatMessageCell3, animatedEmojiSpan);
                }

                @Override
                public void didPressAppUpdateButton() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAppUpdateButton(this);
                }

                @Override
                public void didPressBoostCounter(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBoostCounter(this, chatMessageCell3);
                }

                @Override
                public void didPressBotButton(ChatMessageCell chatMessageCell3, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBotButton(this, chatMessageCell3, keyboardButtonProto);
                }

                @Override
                public void didPressCancelSendButton(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCancelSendButton(this, chatMessageCell3);
                }

                @Override
                public void didPressChannelAvatar(ChatMessageCell chatMessageCell3, TLRPC.Chat chat, int i3, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelAvatar(this, chatMessageCell3, chat, i3, f, f2, z);
                }

                @Override
                public void didPressChannelRecommendation(ChatMessageCell chatMessageCell3, TLObject tLObject, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelRecommendation(this, chatMessageCell3, tLObject, z);
                }

                @Override
                public void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelRecommendationsClose(this, chatMessageCell3);
                }

                @Override
                public void didPressCodeCopy(ChatMessageCell chatMessageCell3, MessageObject.TextLayoutBlock textLayoutBlock) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCodeCopy(this, chatMessageCell3, textLayoutBlock);
                }

                @Override
                public void didPressCommentButton(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCommentButton(this, chatMessageCell3);
                }

                @Override
                public void didPressCustomBotButton(ChatMessageCell chatMessageCell3, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCustomBotButton(this, chatMessageCell3, buttonCustom);
                }

                @Override
                public void didPressEffect(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressEffect(this, chatMessageCell3);
                }

                @Override
                public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell3, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressExtendedMediaPreview(this, chatMessageCell3, keyboardInlineButton);
                }

                @Override
                public void didPressFactCheck(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressFactCheck(this, chatMessageCell3);
                }

                @Override
                public void didPressFactCheckWhat(ChatMessageCell chatMessageCell3, int i3, int i4) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressFactCheckWhat(this, chatMessageCell3, i3, i4);
                }

                @Override
                public void didPressGiveawayChatButton(ChatMessageCell chatMessageCell3, int i3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressGiveawayChatButton(this, chatMessageCell3, i3);
                }

                @Override
                public void didPressGroupImage(ChatMessageCell chatMessageCell3, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressGroupImage(this, chatMessageCell3, imageReceiver, messageExtendedMedia, f, f2);
                }

                @Override
                public void didPressHiddenForward(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHiddenForward(this, chatMessageCell3);
                }

                @Override
                public void didPressHint(ChatMessageCell chatMessageCell3, int i3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHint(this, chatMessageCell3, i3);
                }

                @Override
                public void didPressImage(ChatMessageCell chatMessageCell3, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressImage(this, chatMessageCell3, f, f2, z);
                }

                @Override
                public void didPressInstantButton(ChatMessageCell chatMessageCell3, int i3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressInstantButton(this, chatMessageCell3, i3);
                }

                @Override
                public void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressMoreChannelRecommendations(this, chatMessageCell3);
                }

                @Override
                public void didPressOther(ChatMessageCell chatMessageCell3, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressOther(this, chatMessageCell3, f, f2);
                }

                @Override
                public void didPressPollMedia(ChatMessageCell chatMessageCell3, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressPollMedia(this, chatMessageCell3, imageReceiver, pollAnswer, messageMedia, f, f2, i3);
                }

                @Override
                public void didPressReaction(ChatMessageCell chatMessageCell3, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReaction(this, chatMessageCell3, reactionCount, z, f, f2);
                }

                @Override
                public void didPressReplyMessage(ChatMessageCell chatMessageCell3, int i3, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReplyMessage(this, chatMessageCell3, i3, f, f2, z);
                }

                @Override
                public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressRevealSensitiveContent(this, chatMessageCell3);
                }

                @Override
                public void didPressRichDocumentOptions(ChatMessageCell chatMessageCell3, TLRPC.Document document, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressRichDocumentOptions(this, chatMessageCell3, document, f, f2);
                }

                @Override
                public void didPressShowMore(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressShowMore(this, chatMessageCell3);
                }

                @Override
                public void didPressSideButton(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSideButton(this, chatMessageCell3);
                }

                @Override
                public void didPressSponsoredClose(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSponsoredClose(this, chatMessageCell3);
                }

                @Override
                public void didPressSponsoredInfo(ChatMessageCell chatMessageCell3, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSponsoredInfo(this, chatMessageCell3, f, f2);
                }

                @Override
                public void didPressSummarize(ChatMessageCell chatMessageCell3, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSummarize(this, chatMessageCell3, z);
                }

                @Override
                public void didPressTime(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressTime(this, chatMessageCell3);
                }

                @Override
                public void didPressUrl(ChatMessageCell chatMessageCell3, CharacterStyle characterStyle, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUrl(this, chatMessageCell3, characterStyle, z);
                }

                @Override
                public void didPressUserAvatar(ChatMessageCell chatMessageCell3, TLRPC.User user, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserAvatar(this, chatMessageCell3, user, f, f2, z);
                }

                @Override
                public void didPressUserStatus(ChatMessageCell chatMessageCell3, TLRPC.User user, TLRPC.Document document, String str) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserStatus(this, chatMessageCell3, user, document, str);
                }

                @Override
                public void didPressViaBot(ChatMessageCell chatMessageCell3, String str) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBot(this, chatMessageCell3, str);
                }

                @Override
                public void didPressViaBotNotInline(ChatMessageCell chatMessageCell3, long j) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBotNotInline(this, chatMessageCell3, j);
                }

                @Override
                public void didPressVoteButtons(ChatMessageCell chatMessageCell3, ArrayList arrayList, int i3, int i4, int i5) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressVoteButtons(this, chatMessageCell3, arrayList, i3, i4, i5);
                }

                @Override
                public void didPressWebPage(ChatMessageCell chatMessageCell3, TLRPC.WebPage webPage, String str, boolean z) {
                    Browser.openUrl(chatMessageCell3.getContext(), str);
                }

                @Override
                public void didQuickShareEnd(ChatMessageCell chatMessageCell3, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareEnd(this, chatMessageCell3, f, f2);
                }

                @Override
                public void didQuickShareMove(ChatMessageCell chatMessageCell3, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareMove(this, chatMessageCell3, f, f2);
                }

                @Override
                public void didQuickShareStart(ChatMessageCell chatMessageCell3, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareStart(this, chatMessageCell3, f, f2);
                }

                @Override
                public void didStartVideoStream(MessageObject messageObject2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didStartVideoStream(this, messageObject2);
                }

                @Override
                public void didTogglePollPreview(ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didTogglePollPreview(this, chatMessageCell3);
                }

                @Override
                public void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell3, boolean z, Runnable runnable) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didToggleRichMessageCheckbox(this, chatMessageCell3, z, runnable);
                }

                @Override
                public boolean doNotShowLoadingReply(MessageObject messageObject2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$doNotShowLoadingReply(this, messageObject2);
                }

                @Override
                public void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$drawPollMode(this, canvas, chatMessageCell3);
                }

                @Override
                public void forceUpdate(ChatMessageCell chatMessageCell3, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$forceUpdate(this, chatMessageCell3, z);
                }

                @Override
                public void forceUpdate(ChatMessageCell chatMessageCell3, boolean z, boolean z2) {
                    forceUpdate(chatMessageCell3, z);
                }

                @Override
                public void forceUpdateNoAnimation(ChatMessageCell chatMessageCell3, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$forceUpdateNoAnimation(this, chatMessageCell3, z);
                }

                @Override
                public int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell3) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getAddPollOptionInputFieldHeight(this, chatMessageCell3);
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
                public String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell3) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getProgressLoadingBotButtonUrl(this, chatMessageCell3);
                }

                @Override
                public CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell3) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getProgressLoadingLink(this, chatMessageCell3);
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
                public boolean isProgressLoading(ChatMessageCell chatMessageCell3, int i3) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isProgressLoading(this, chatMessageCell3, i3);
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
                public void needOpenWebView(MessageObject messageObject2, String str, String str2, String str3, String str4, int i3, int i4) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$needOpenWebView(this, messageObject2, str, str2, str3, str4, i3, i4);
                }

                @Override
                public boolean needPlayMessage(ChatMessageCell chatMessageCell3, MessageObject messageObject2, boolean z) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$needPlayMessage(this, chatMessageCell3, messageObject2, z);
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
                public boolean openArticlePhoto(ChatMessageCell chatMessageCell3, TL_iv.PageBlock pageBlock) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$openArticlePhoto(this, chatMessageCell3, pageBlock);
                }

                @Override
                public void setShouldNotRepeatSticker(MessageObject messageObject2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$setShouldNotRepeatSticker(this, messageObject2);
                }

                @Override
                public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell3, boolean z) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldDrawThreadProgress(this, chatMessageCell3, z);
                }

                @Override
                public boolean shouldRepeatSticker(MessageObject messageObject2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldRepeatSticker(this, messageObject2);
                }

                @Override
                public void videoTimerReached() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$videoTimerReached(this);
                }

                @Override
                public boolean didPressToDoButton(ChatMessageCell chatMessageCell3, TLRPC.TodoItem todoItem2, boolean z) {
                    if (TodoItemMenu.this.cell.getDelegate() != null) {
                        return TodoItemMenu.this.cell.getDelegate().didPressToDoButton(TodoItemMenu.this.cell, todoItem2, z);
                    }
                    return false;
                }
            });
            ChatMessageCell chatMessageCell3 = this.myTaskCell;
            MessageObject messageObject2 = this.messageObject;
            MessageObject.GroupedMessages currentMessagesGroup = this.cell.getCurrentMessagesGroup();
            ChatMessageCell chatMessageCell4 = this.cell;
            chatMessageCell3.setMessageObject(messageObject2, currentMessagesGroup, chatMessageCell4.pinnedBottom, chatMessageCell4.pinnedTop, chatMessageCell4.firstInChat);
            this.containerView.addView(this.myTaskCell, new FrameLayout.LayoutParams(this.cell.getWidth(), height, 51));
            ChatMessageCell chatMessageCell5 = new ChatMessageCell(getContext(), UserConfig.selectedAccount, false, null, this.cell.getResourcesProvider()) {
                @Override
                public void setPressed(boolean z) {
                }

                @Override
                protected void onMeasure(int i3, int i4) {
                    setMeasuredDimension(width, height);
                }

                @Override
                public void drawOverlays(Canvas canvas) {
                    this.firstVisiblePollButton = 0;
                    this.lastVisiblePollButton = this.pollButtons.size() - 1;
                    super.drawOverlays(canvas);
                }
            };
            this.myCell = chatMessageCell5;
            this.cell.copyVisiblePartTo(chatMessageCell5);
            this.cell.copyParamsTo(this.myCell);
            this.myCell.copySpoilerEffect2AttachIndexFrom(this.cell);
            this.myCell.setDelegate(new ChatMessageCell.ChatMessageCellDelegate() {
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
                public boolean canSaveRichDocument(ChatMessageCell chatMessageCell6) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canSaveRichDocument(this, chatMessageCell6);
                }

                @Override
                public boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell6) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$canToggleRichMessageCheckbox(this, chatMessageCell6);
                }

                @Override
                public void didLongPress(ChatMessageCell chatMessageCell6, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPress(this, chatMessageCell6, f, f2);
                }

                @Override
                public void didLongPressBotButton(ChatMessageCell chatMessageCell6, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressBotButton(this, chatMessageCell6, keyboardButtonProto);
                }

                @Override
                public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell6, TLRPC.Chat chat, int i3, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressChannelAvatar(this, chatMessageCell6, chat, i3, f, f2);
                }

                @Override
                public void didLongPressCustomBotButton(ChatMessageCell chatMessageCell6, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressCustomBotButton(this, chatMessageCell6, buttonCustom);
                }

                @Override
                public boolean didLongPressPollOption(ChatMessageCell chatMessageCell6, TLRPC.PollAnswer pollAnswer) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressPollOption(this, chatMessageCell6, pollAnswer);
                }

                @Override
                public boolean didLongPressToDoButton(ChatMessageCell chatMessageCell6, TLRPC.TodoItem todoItem2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressToDoButton(this, chatMessageCell6, todoItem2);
                }

                @Override
                public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell6, TLRPC.User user, float f, float f2) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didLongPressUserAvatar(this, chatMessageCell6, user, f, f2);
                }

                @Override
                public void didPressAboutRevenueSharingAds() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAboutRevenueSharingAds(this);
                }

                @Override
                public void didPressAddPollOptionButton(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAddPollOptionButton(this, chatMessageCell6);
                }

                @Override
                public void didPressAdmin(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAdmin(this, chatMessageCell6);
                }

                @Override
                public boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell6, AnimatedEmojiSpan animatedEmojiSpan) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAnimatedEmoji(this, chatMessageCell6, animatedEmojiSpan);
                }

                @Override
                public void didPressAppUpdateButton() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressAppUpdateButton(this);
                }

                @Override
                public void didPressBoostCounter(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBoostCounter(this, chatMessageCell6);
                }

                @Override
                public void didPressBotButton(ChatMessageCell chatMessageCell6, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressBotButton(this, chatMessageCell6, keyboardButtonProto);
                }

                @Override
                public void didPressCancelSendButton(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCancelSendButton(this, chatMessageCell6);
                }

                @Override
                public void didPressChannelAvatar(ChatMessageCell chatMessageCell6, TLRPC.Chat chat, int i3, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelAvatar(this, chatMessageCell6, chat, i3, f, f2, z);
                }

                @Override
                public void didPressChannelRecommendation(ChatMessageCell chatMessageCell6, TLObject tLObject, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelRecommendation(this, chatMessageCell6, tLObject, z);
                }

                @Override
                public void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressChannelRecommendationsClose(this, chatMessageCell6);
                }

                @Override
                public void didPressCodeCopy(ChatMessageCell chatMessageCell6, MessageObject.TextLayoutBlock textLayoutBlock) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCodeCopy(this, chatMessageCell6, textLayoutBlock);
                }

                @Override
                public void didPressCommentButton(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCommentButton(this, chatMessageCell6);
                }

                @Override
                public void didPressCustomBotButton(ChatMessageCell chatMessageCell6, BotInlineKeyboard.ButtonCustom buttonCustom) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressCustomBotButton(this, chatMessageCell6, buttonCustom);
                }

                @Override
                public void didPressEffect(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressEffect(this, chatMessageCell6);
                }

                @Override
                public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell6, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressExtendedMediaPreview(this, chatMessageCell6, keyboardInlineButton);
                }

                @Override
                public void didPressFactCheck(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressFactCheck(this, chatMessageCell6);
                }

                @Override
                public void didPressFactCheckWhat(ChatMessageCell chatMessageCell6, int i3, int i4) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressFactCheckWhat(this, chatMessageCell6, i3, i4);
                }

                @Override
                public void didPressGiveawayChatButton(ChatMessageCell chatMessageCell6, int i3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressGiveawayChatButton(this, chatMessageCell6, i3);
                }

                @Override
                public void didPressGroupImage(ChatMessageCell chatMessageCell6, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressGroupImage(this, chatMessageCell6, imageReceiver, messageExtendedMedia, f, f2);
                }

                @Override
                public void didPressHiddenForward(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHiddenForward(this, chatMessageCell6);
                }

                @Override
                public void didPressHint(ChatMessageCell chatMessageCell6, int i3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressHint(this, chatMessageCell6, i3);
                }

                @Override
                public void didPressImage(ChatMessageCell chatMessageCell6, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressImage(this, chatMessageCell6, f, f2, z);
                }

                @Override
                public void didPressInstantButton(ChatMessageCell chatMessageCell6, int i3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressInstantButton(this, chatMessageCell6, i3);
                }

                @Override
                public void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressMoreChannelRecommendations(this, chatMessageCell6);
                }

                @Override
                public void didPressOther(ChatMessageCell chatMessageCell6, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressOther(this, chatMessageCell6, f, f2);
                }

                @Override
                public void didPressPollMedia(ChatMessageCell chatMessageCell6, ImageReceiver imageReceiver, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressPollMedia(this, chatMessageCell6, imageReceiver, pollAnswer, messageMedia, f, f2, i3);
                }

                @Override
                public void didPressReaction(ChatMessageCell chatMessageCell6, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReaction(this, chatMessageCell6, reactionCount, z, f, f2);
                }

                @Override
                public void didPressReplyMessage(ChatMessageCell chatMessageCell6, int i3, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressReplyMessage(this, chatMessageCell6, i3, f, f2, z);
                }

                @Override
                public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressRevealSensitiveContent(this, chatMessageCell6);
                }

                @Override
                public void didPressRichDocumentOptions(ChatMessageCell chatMessageCell6, TLRPC.Document document, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressRichDocumentOptions(this, chatMessageCell6, document, f, f2);
                }

                @Override
                public void didPressShowMore(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressShowMore(this, chatMessageCell6);
                }

                @Override
                public void didPressSideButton(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSideButton(this, chatMessageCell6);
                }

                @Override
                public void didPressSponsoredClose(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSponsoredClose(this, chatMessageCell6);
                }

                @Override
                public void didPressSponsoredInfo(ChatMessageCell chatMessageCell6, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSponsoredInfo(this, chatMessageCell6, f, f2);
                }

                @Override
                public void didPressSummarize(ChatMessageCell chatMessageCell6, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressSummarize(this, chatMessageCell6, z);
                }

                @Override
                public void didPressTime(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressTime(this, chatMessageCell6);
                }

                @Override
                public boolean didPressToDoButton(ChatMessageCell chatMessageCell6, TLRPC.TodoItem todoItem2, boolean z) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressToDoButton(this, chatMessageCell6, todoItem2, z);
                }

                @Override
                public void didPressUrl(ChatMessageCell chatMessageCell6, CharacterStyle characterStyle, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUrl(this, chatMessageCell6, characterStyle, z);
                }

                @Override
                public void didPressUserAvatar(ChatMessageCell chatMessageCell6, TLRPC.User user, float f, float f2, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserAvatar(this, chatMessageCell6, user, f, f2, z);
                }

                @Override
                public void didPressUserStatus(ChatMessageCell chatMessageCell6, TLRPC.User user, TLRPC.Document document, String str) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressUserStatus(this, chatMessageCell6, user, document, str);
                }

                @Override
                public void didPressViaBot(ChatMessageCell chatMessageCell6, String str) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBot(this, chatMessageCell6, str);
                }

                @Override
                public void didPressViaBotNotInline(ChatMessageCell chatMessageCell6, long j) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressViaBotNotInline(this, chatMessageCell6, j);
                }

                @Override
                public void didPressVoteButtons(ChatMessageCell chatMessageCell6, ArrayList arrayList, int i3, int i4, int i5) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didPressVoteButtons(this, chatMessageCell6, arrayList, i3, i4, i5);
                }

                @Override
                public void didPressWebPage(ChatMessageCell chatMessageCell6, TLRPC.WebPage webPage, String str, boolean z) {
                    Browser.openUrl(chatMessageCell6.getContext(), str);
                }

                @Override
                public void didQuickShareEnd(ChatMessageCell chatMessageCell6, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareEnd(this, chatMessageCell6, f, f2);
                }

                @Override
                public void didQuickShareMove(ChatMessageCell chatMessageCell6, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareMove(this, chatMessageCell6, f, f2);
                }

                @Override
                public void didQuickShareStart(ChatMessageCell chatMessageCell6, float f, float f2) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didQuickShareStart(this, chatMessageCell6, f, f2);
                }

                @Override
                public void didStartVideoStream(MessageObject messageObject3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didStartVideoStream(this, messageObject3);
                }

                @Override
                public void didTogglePollPreview(ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didTogglePollPreview(this, chatMessageCell6);
                }

                @Override
                public void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell6, boolean z, Runnable runnable) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$didToggleRichMessageCheckbox(this, chatMessageCell6, z, runnable);
                }

                @Override
                public boolean doNotShowLoadingReply(MessageObject messageObject3) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$doNotShowLoadingReply(this, messageObject3);
                }

                @Override
                public void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell6) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$drawPollMode(this, canvas, chatMessageCell6);
                }

                @Override
                public void forceUpdate(ChatMessageCell chatMessageCell6, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$forceUpdate(this, chatMessageCell6, z);
                }

                @Override
                public void forceUpdate(ChatMessageCell chatMessageCell6, boolean z, boolean z2) {
                    forceUpdate(chatMessageCell6, z);
                }

                @Override
                public void forceUpdateNoAnimation(ChatMessageCell chatMessageCell6, boolean z) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$forceUpdateNoAnimation(this, chatMessageCell6, z);
                }

                @Override
                public int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell6) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getAddPollOptionInputFieldHeight(this, chatMessageCell6);
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
                public String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell6) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getProgressLoadingBotButtonUrl(this, chatMessageCell6);
                }

                @Override
                public CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell6) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$getProgressLoadingLink(this, chatMessageCell6);
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
                public boolean isProgressLoading(ChatMessageCell chatMessageCell6, int i3) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$isProgressLoading(this, chatMessageCell6, i3);
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
                public void needOpenWebView(MessageObject messageObject3, String str, String str2, String str3, String str4, int i3, int i4) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$needOpenWebView(this, messageObject3, str, str2, str3, str4, i3, i4);
                }

                @Override
                public boolean needPlayMessage(ChatMessageCell chatMessageCell6, MessageObject messageObject3, boolean z) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$needPlayMessage(this, chatMessageCell6, messageObject3, z);
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
                public boolean openArticlePhoto(ChatMessageCell chatMessageCell6, TL_iv.PageBlock pageBlock) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$openArticlePhoto(this, chatMessageCell6, pageBlock);
                }

                @Override
                public void setShouldNotRepeatSticker(MessageObject messageObject3) {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$setShouldNotRepeatSticker(this, messageObject3);
                }

                @Override
                public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell6, boolean z) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldDrawThreadProgress(this, chatMessageCell6, z);
                }

                @Override
                public boolean shouldRepeatSticker(MessageObject messageObject3) {
                    return ChatMessageCell.ChatMessageCellDelegate.CC.$default$shouldRepeatSticker(this, messageObject3);
                }

                @Override
                public void videoTimerReached() {
                    ChatMessageCell.ChatMessageCellDelegate.CC.$default$videoTimerReached(this);
                }
            });
            ChatMessageCell chatMessageCell6 = this.myCell;
            MessageObject messageObject3 = this.messageObject;
            MessageObject.GroupedMessages currentMessagesGroup2 = this.cell.getCurrentMessagesGroup();
            ChatMessageCell chatMessageCell7 = this.cell;
            chatMessageCell6.setMessageObject(messageObject3, currentMessagesGroup2, chatMessageCell7.pinnedBottom, chatMessageCell7.pinnedTop, chatMessageCell7.firstInChat);
            this.containerView.addView(this.myCell, new FrameLayout.LayoutParams(this.cell.getWidth(), height, 51));
        } else {
            i2 = 51;
        }
        this.viewPager.bringToFront();
        this.menuContainer.bringToFront();
        this.tabsView.bringToFront();
        this.viewPager.onTabAnimationUpdate(false);
        TLRPC.TodoCompletion todoCompletion = null;
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.containerView, this.resourcesProvider, (View) null);
        final TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) MessageObject.getMedia(this.messageObject);
        final int i3 = 0;
        while (true) {
            if (i3 >= tL_messageMediaToDo.todo.list.size()) {
                i3 = -1;
                todoItem = null;
                break;
            } else {
                if (tL_messageMediaToDo.todo.list.get(i3).id == i) {
                    todoItem = tL_messageMediaToDo.todo.list.get(i3);
                    break;
                }
                i3++;
            }
        }
        for (int i4 = 0; i4 < tL_messageMediaToDo.completions.size(); i4++) {
            if (tL_messageMediaToDo.completions.get(i4).id == i) {
                todoCompletion = tL_messageMediaToDo.completions.get(i4);
                break;
            }
        }
        if (this.messageObject.canCompleteTodo()) {
            if (todoCompletion != null) {
                itemOptionsMakeOptions.addText(LocaleController.formatTodoCompletedDate(todoCompletion.date), 14);
                itemOptionsMakeOptions.addGap();
                itemOptionsMakeOptions.add(R.drawable.msg_cancel, LocaleController.getString(R.string.TodoUncheck), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$setCell$1(chatActivity, i);
                    }
                });
            } else {
                itemOptionsMakeOptions.add(R.drawable.msg_select, LocaleController.getString(R.string.TodoCheck), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$setCell$2(chatActivity, i);
                    }
                });
            }
        }
        if (todoItem != null) {
            if (chatActivity != null) {
                itemOptionsMakeOptions.add(R.drawable.menu_reply, LocaleController.getString(R.string.TodoItemQuote), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$setCell$3(chatActivity, todoItem);
                    }
                });
            }
            if (this.messageObject.getDialogId() < 0) {
                MessagesController messagesController = MessagesController.getInstance(this.messageObject.currentAccount);
                String publicUsername = DialogObject.getPublicUsername(messagesController.getUserOrChat(this.messageObject.getDialogId()));
                StringBuilder sb = new StringBuilder();
                sb.append("https://");
                sb.append(messagesController.linkPrefix);
                sb.append("/");
                if (TextUtils.isEmpty(publicUsername)) {
                    publicUsername = "c/" + (-this.messageObject.getDialogId());
                }
                sb.append(publicUsername);
                sb.append("/");
                sb.append(this.messageObject.getId());
                sb.append("?task=");
                sb.append(todoItem.id);
                final String string = sb.toString();
                itemOptionsMakeOptions.add(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$setCell$4(string);
                    }
                });
            }
            itemOptionsMakeOptions.add(R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setCell$5(todoItem);
                }
            });
        }
        if (this.messageObject.canEditMessage(chatActivity.currentChat)) {
            itemOptionsMakeOptions.add(R.drawable.msg_edit, LocaleController.getString(R.string.TodoEditItem), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setCell$7(chatActivity, i3);
                }
            });
            if (tL_messageMediaToDo.todo.list.size() > 1) {
                itemOptionsMakeOptions.add(R.drawable.msg_delete, LocaleController.getString(R.string.TodoDeleteItem), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$setCell$8(tL_messageMediaToDo, i, chatActivity);
                    }
                });
            }
        }
        itemOptionsMakeOptions.setGapBackgroundColor(Theme.multAlpha(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider), 0.06f));
        itemOptionsMakeOptions.setBlurBackground(this.iBlur3Factory, BlurredBackgroundProviderImpl.scrimMenuBackground(this.resourcesProvider), false);
        itemOptionsMakeOptions.setupSelectors();
        ViewGroup layout = itemOptionsMakeOptions.getLayout();
        this.taskOptionsView = layout;
        layout.setPivotX(0.0f);
        this.taskOptionsView.setPivotY(0.0f);
        this.menuContainer.addView(this.taskOptionsView, LayoutHelper.createFrame(-2, -2, i2));
    }

    public void lambda$setCell$1(ChatActivity chatActivity, int i) {
        if (chatActivity.isInScheduleMode()) {
            Toast.makeText(getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
        } else {
            ChatMessageCell chatMessageCell = this.myTaskCell;
            chatMessageCell.toggleTodoCheck(chatMessageCell.getTodoIndex(i), false);
        }
        dismiss(true);
    }

    public void lambda$setCell$2(ChatActivity chatActivity, int i) {
        if (chatActivity.isInScheduleMode()) {
            Toast.makeText(getContext(), LocaleController.getString(R.string.MessageScheduledTodo), 1).show();
        } else {
            ChatMessageCell chatMessageCell = this.myTaskCell;
            chatMessageCell.toggleTodoCheck(chatMessageCell.getTodoIndex(i), false);
        }
        dismiss(true);
    }

    public void lambda$setCell$3(ChatActivity chatActivity, TLRPC.TodoItem todoItem) {
        MessageObject messageObject = this.messageObject;
        chatActivity.showFieldPanelForReplyQuote(messageObject, ChatActivity.ReplyQuote.from(messageObject, todoItem.id));
        dismiss(false);
    }

    public void lambda$setCell$4(String str) {
        AndroidUtilities.addToClipboard(str);
        dismiss(true);
    }

    public void lambda$setCell$5(TLRPC.TodoItem todoItem) {
        AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(todoItem.title, false));
        dismiss(true);
    }

    public void lambda$setCell$7(final ChatActivity chatActivity, int i) {
        PollCreateActivity pollCreateActivity = new PollCreateActivity(chatActivity, true, Boolean.FALSE);
        pollCreateActivity.setEditing(MessageObject.getMedia(this.messageObject), false, i);
        pollCreateActivity.setDelegate(new PollCreateActivity.PollCreateActivityDelegate() {
            @Override
            public final void sendPoll(TLRPC.MessageMedia messageMedia, ArrayList arrayList, boolean z, int i2) {
                this.f$0.lambda$setCell$6(chatActivity, messageMedia, arrayList, z, i2);
            }
        });
        chatActivity.presentFragment(pollCreateActivity);
        dismiss(false);
    }

    public void lambda$setCell$6(ChatActivity chatActivity, TLRPC.MessageMedia messageMedia, ArrayList arrayList, boolean z, int i) {
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.MessageMedia messageMedia2 = this.messageObject.messageOwner.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                ((TLRPC.TL_messageMediaToDo) messageMedia).completions = ((TLRPC.TL_messageMediaToDo) messageMedia2).completions;
            }
        }
        this.messageObject.messageOwner.media = messageMedia;
        chatActivity.getSendMessagesHelper().editMessage(this.messageObject, null, null, null, null, null, null, false, false, null);
    }

    public void lambda$setCell$8(TLRPC.TL_messageMediaToDo tL_messageMediaToDo, int i, ChatActivity chatActivity) {
        int i2 = 0;
        while (i2 < tL_messageMediaToDo.todo.list.size()) {
            if (tL_messageMediaToDo.todo.list.get(i2).id == i) {
                tL_messageMediaToDo.todo.list.remove(i2);
                i2--;
            }
            i2++;
        }
        int i3 = 0;
        while (i3 < tL_messageMediaToDo.completions.size()) {
            if (tL_messageMediaToDo.completions.get(i3).id == i) {
                tL_messageMediaToDo.completions.remove(i3);
                if (tL_messageMediaToDo.completions.isEmpty()) {
                    tL_messageMediaToDo.flags &= -2;
                }
                i3--;
            }
            i3++;
        }
        this.messageObject.messageOwner.media = tL_messageMediaToDo;
        chatActivity.getSendMessagesHelper().editMessage(this.messageObject, null, null, null, null, null, null, false, false, null);
        chatActivity.updateVisibleRows();
        dismiss(false);
    }

    public void setupMessageOptions(final ChatActivity chatActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, final Utilities.Callback callback) {
        TLRPC.ChatFull chatFull;
        boolean z;
        MessageObject messageObject;
        boolean z2;
        int i;
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        MessageObject messageObject2 = this.messageObject;
        List<TLRPC.TL_availableReaction> enabledReactionsList = chatActivity.getMediaDataController().getEnabledReactionsList();
        boolean z3 = (chatActivity.isSecretChat() || chatActivity.isInScheduleMode() || chatActivity.currentUser != null || !messageObject2.hasReactions() || (ChatObject.isChannel(chatActivity.currentChat) && !chatActivity.currentChat.megagroup) || ChatObject.isMonoForum(chatActivity.currentChat) || enabledReactionsList.isEmpty() || !messageObject2.messageOwner.reactions.can_see_list || messageObject2.isSecretMedia()) ? false : true;
        boolean z4 = !messageObject2.isForwardedChannelPost() ? messageObject2.isSecretMedia() || chatActivity.getChatMode() == 5 || chatActivity.isSecretChat() || chatActivity.isInScheduleMode() || !messageObject2.isReactionsAvailable() || ((((chatFull = chatActivity.chatInfo) == null || ((chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull.paid_reactions_available)) && ((chatFull != null || ChatObject.isChannel(chatActivity.currentChat)) && chatActivity.currentUser == null && !ChatObject.isMonoForum(chatActivity.currentChat))) || enabledReactionsList.isEmpty()) : (chatFull3 = chatActivity.getMessagesController().getChatFull(-messageObject2.getFromChatId())) != null && (chatActivity.isSecretChat() || chatActivity.getChatMode() == 5 || chatActivity.isInScheduleMode() || !messageObject2.isReactionsAvailable() || (((chatFull3.available_reactions instanceof TLRPC.TL_chatReactionsNone) && !chatFull3.paid_reactions_available) || enabledReactionsList.isEmpty()));
        boolean z5 = (z3 || chatActivity.isInScheduleMode() || chatActivity.currentChat == null || !messageObject2.isOutOwner() || !messageObject2.isSent() || messageObject2.isEditing() || messageObject2.isSending() || messageObject2.isSendError() || messageObject2.isContentUnread() || messageObject2.isUnread() || ConnectionsManager.getInstance(chatActivity.getCurrentAccount()).getCurrentTime() - messageObject2.messageOwner.date >= chatActivity.getMessagesController().chatReadMarkExpirePeriod || (!ChatObject.isMegagroup(chatActivity.currentChat) && ChatObject.isChannel(chatActivity.currentChat)) || (chatFull2 = chatActivity.chatInfo) == null || chatFull2.participants_count > chatActivity.getMessagesController().chatReadMarkSizeThreshold || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest) || chatActivity.getChatMode() == 3 || !messageObject2.canSetReaction() || ChatObject.isMonoForum(chatActivity.currentChat)) ? false : true;
        if (chatActivity.currentChat != null && !messageObject2.isOut() && ChatObject.isMonoForum(chatActivity.currentChat) && ChatObject.canManageMonoForum(chatActivity.getCurrentAccount(), chatActivity.currentChat)) {
            long j = chatActivity.currentChat.linked_monoforum_id;
            messageObject2.getFromChatId();
        }
        if (z3 || chatActivity.currentChat != null || chatActivity.currentEncryptedChat != null || (user = chatActivity.currentUser) == null || UserObject.isUserSelf(user) || UserObject.isReplyUser(chatActivity.currentUser) || UserObject.isAnonymous(chatActivity.currentUser)) {
            z = false;
        } else {
            TLRPC.User user2 = chatActivity.currentUser;
            if (user2.bot || UserObject.isService(user2.id) || (((userFull = chatActivity.userInfo) != null && userFull.read_dates_private) || chatActivity.isInScheduleMode() || !messageObject2.isOutOwner() || !messageObject2.isSent() || messageObject2.isEditing() || messageObject2.isSending() || messageObject2.isSendError() || messageObject2.isContentUnread() || messageObject2.isUnread() || chatActivity.getConnectionsManager().getCurrentTime() - messageObject2.messageOwner.date >= chatActivity.getMessagesController().pmReadDateExpirePeriod || (messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
                z = false;
            } else {
                z = true;
            }
        }
        TLRPC.User user3 = chatActivity.currentUser;
        boolean z6 = (user3 == null || !(UserObject.isReplyUser(user3) || UserObject.isAnonymous(chatActivity.currentUser))) && !chatActivity.isInScheduleMode() && messageObject2.isEdited() && !(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionChatJoinedByRequest);
        final ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.containerView, chatActivity.getResourceProvider(), (View) null, z3 || z5);
        if (z5) {
            final MessageSeenView messageSeenView = new MessageSeenView(getContext(), chatActivity.getCurrentAccount(), messageObject2, chatActivity.currentChat);
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.addView(messageSeenView, LayoutHelper.createFrame(-1, 36.0f));
            final ItemOptions itemOptionsMakeSwipeback = itemOptionsMakeOptions.makeSwipeback();
            ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(getContext(), true, false, this.resourcesProvider);
            actionBarMenuSubItem.setItemHeight(44);
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back);
            actionBarMenuSubItem.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            final LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, this.resourcesProvider));
            linearLayout.setOrientation(1);
            final RecyclerListView recyclerListViewCreateListView = messageSeenView.createListView();
            frameLayout2.addView(actionBarMenuSubItem);
            linearLayout.addView(frameLayout2);
            linearLayout.addView(new ActionBarPopupWindow.GapView(getContext(), this.resourcesProvider), LayoutHelper.createLinear(-1, 8));
            frameLayout2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Bulletin.hideVisible();
                    itemOptionsMakeOptions.closeSwipeback();
                }
            });
            z2 = z4;
            messageObject = messageObject2;
            i = -2;
            messageSeenView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (messageSeenView.users.isEmpty()) {
                        return;
                    }
                    if (messageSeenView.users.size() == 1 && (messageSeenView.dates.size() <= 0 || ((Integer) messageSeenView.dates.get(0)).intValue() <= 0)) {
                        TLObject tLObject = (TLObject) messageSeenView.users.get(0);
                        if (tLObject == null) {
                            return;
                        }
                        Bundle bundle = new Bundle();
                        if (tLObject instanceof TLRPC.User) {
                            bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
                        } else if (tLObject instanceof TLRPC.Chat) {
                            bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                        }
                        chatActivity.presentFragment(new ProfileActivity(bundle));
                        TodoItemMenu.this.dismiss(false);
                        return;
                    }
                    if (SharedConfig.messageSeenHintCount > 0 && chatActivity.contentView.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                        chatActivity.messageSeenPrivacyBulletin = BulletinFactory.of(Bulletin.BulletinWindow.make(TodoItemMenu.this.getContext()), TodoItemMenu.this.resourcesProvider).createErrorBulletin(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)));
                        chatActivity.messageSeenPrivacyBulletin.setDuration(4000);
                        chatActivity.messageSeenPrivacyBulletin.show();
                        SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
                    }
                    recyclerListViewCreateListView.requestLayout();
                    linearLayout.requestLayout();
                    recyclerListViewCreateListView.getAdapter().notifyDataSetChanged();
                    itemOptionsMakeOptions.openSwipeback(itemOptionsMakeSwipeback);
                }
            });
            linearLayout.addView(recyclerListViewCreateListView, LayoutHelper.createLinear(-1, -2));
            itemOptionsMakeSwipeback.addView(linearLayout);
            itemOptionsMakeOptions.addView(frameLayout);
            itemOptionsMakeOptions.addGap();
        } else {
            messageObject = messageObject2;
            z2 = z4;
            i = -2;
            if (z) {
                itemOptionsMakeOptions.addView(new MessagePrivateSeenView(getContext(), 0, messageObject, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$setupMessageOptions$9();
                    }
                }, this.resourcesProvider), LayoutHelper.createLinear(-1, 36));
                itemOptionsMakeOptions.addGap();
            } else if (z6) {
                itemOptionsMakeOptions.addView(new MessagePrivateSeenView(getContext(), 1, messageObject, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$setupMessageOptions$10();
                    }
                }, this.resourcesProvider), LayoutHelper.createLinear(-1, 36));
                itemOptionsMakeOptions.addGap();
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            final int iIntValue = ((Integer) arrayList3.get(i2)).intValue();
            itemOptionsMakeOptions.add(((Integer) arrayList.get(i2)).intValue(), (CharSequence) arrayList2.get(i2), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setupMessageOptions$11(callback, iIntValue);
                }
            });
        }
        itemOptionsMakeOptions.setGapBackgroundColor(Theme.multAlpha(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider), 0.06f));
        itemOptionsMakeOptions.setBlurBackground(this.iBlur3Factory, BlurredBackgroundProviderImpl.scrimMenuBackground(this.resourcesProvider), false);
        itemOptionsMakeOptions.setupSelectors();
        ViewGroup layout = itemOptionsMakeOptions.getLayout();
        this.messageOptionsView = layout;
        layout.setPivotX(0.0f);
        this.messageOptionsView.setPivotY(0.0f);
        this.menuContainer.addView(this.messageOptionsView, LayoutHelper.createFrame(i, i, 51));
        View view = this.messageOptionsView;
        if (view instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
            ((ActionBarPopupWindow.ActionBarPopupWindowLayout) view).setOnSizeChangedListener(new ActionBarPopupWindow.onSizeChangedListener() {
                @Override
                public final void onSizeChanged() {
                    this.f$0.updateTranslation();
                }
            });
            this.messageOptionsView.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return this.f$0.lambda$setupMessageOptions$12(view2, motionEvent);
                }
            });
        }
        if (z2) {
            final ReactionsContainerLayout reactionsContainerLayout = new ReactionsContainerLayout((chatActivity.getUserConfig().getClientUserId() > chatActivity.getDialogId() ? 1 : (chatActivity.getUserConfig().getClientUserId() == chatActivity.getDialogId() ? 0 : -1)) == 0 ? 3 : 0, chatActivity, getContext(), chatActivity.getCurrentAccount(), this.resourcesProvider);
            reactionsContainerLayout.forceAttachToParent = true;
            float f = 22;
            reactionsContainerLayout.setPadding(AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 0 : 24), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + (LocaleController.isRTL ? 24 : 0), AndroidUtilities.dp(f));
            final MessageObject messageObject3 = messageObject;
            reactionsContainerLayout.setDelegate(new ReactionsContainerLayout.ReactionsContainerDelegate() {
                @Override
                public boolean allowLongPress() {
                    return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$allowLongPress(this);
                }

                @Override
                public boolean drawBackground() {
                    return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$drawBackground(this);
                }

                @Override
                public void drawRoundRect(Canvas canvas, RectF rectF, float f2, float f3, float f4, int i3, boolean z7) {
                    ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$drawRoundRect(this, canvas, rectF, f2, f3, f4, i3, z7);
                }

                @Override
                public boolean needEnterText() {
                    return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$needEnterText(this);
                }

                @Override
                public void onEmojiWindowDismissed() {
                    ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$onEmojiWindowDismissed(this);
                }

                @Override
                public void onReactionClicked(View view2, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z7, boolean z8) {
                    float f2;
                    float f3;
                    int i3;
                    float f4;
                    BaseCell baseCellFindMessageCell = chatActivity.findMessageCell(messageObject3.getId(), true);
                    if (baseCellFindMessageCell instanceof ChatMessageCell) {
                        ChatMessageCell chatMessageCell = (ChatMessageCell) baseCellFindMessageCell;
                        ReactionsLayoutInBubble.ReactionButton reactionButton = chatMessageCell.reactionsLayoutInBubble.getReactionButton(visibleReaction);
                        if (reactionButton != null) {
                            ReactionsLayoutInBubble reactionsLayoutInBubble = chatMessageCell.reactionsLayoutInBubble;
                            f2 = reactionsLayoutInBubble.x + reactionButton.x + (reactionButton.width / 2.0f);
                            f3 = reactionsLayoutInBubble.y + reactionButton.y;
                            i3 = reactionButton.height;
                            f4 = f3 + (i3 / 2.0f);
                        } else {
                            f2 = 0.0f;
                            f4 = 0.0f;
                        }
                    } else {
                        if (baseCellFindMessageCell instanceof ChatActionCell) {
                            ChatActionCell chatActionCell = (ChatActionCell) baseCellFindMessageCell;
                            ReactionsLayoutInBubble.ReactionButton reactionButton2 = chatActionCell.reactionsLayoutInBubble.getReactionButton(visibleReaction);
                            if (reactionButton2 != null) {
                                ReactionsLayoutInBubble reactionsLayoutInBubble2 = chatActionCell.reactionsLayoutInBubble;
                                f2 = reactionsLayoutInBubble2.x + reactionButton2.x + (reactionButton2.width / 2.0f);
                                f3 = reactionsLayoutInBubble2.y + reactionButton2.y;
                                i3 = reactionButton2.height;
                                f4 = f3 + (i3 / 2.0f);
                            }
                        }
                        f2 = 0.0f;
                        f4 = 0.0f;
                    }
                    chatActivity.selectReaction(baseCellFindMessageCell, messageObject3, reactionsContainerLayout, view2, f2, f4, visibleReaction, false, (visibleReaction == null || !visibleReaction.isStar) ? z7 : true, z8, false);
                    TodoItemMenu.this.dismiss(false);
                }
            });
            FrameLayout frameLayout3 = this.menuContainer;
            this.reactionsView = reactionsContainerLayout;
            frameLayout3.addView(reactionsContainerLayout, LayoutHelper.createFrame(i, (int) ((reactionsContainerLayout.getTopOffset() / AndroidUtilities.density) + 52.0f + f), 51));
            reactionsContainerLayout.setMessage(messageObject3, chatActivity.chatInfo, true);
            this.reactionsView.setTransitionProgress(1.0f);
        }
        updateTranslation();
    }

    public void lambda$setupMessageOptions$9() {
        dismiss(false);
    }

    public void lambda$setupMessageOptions$10() {
        dismiss(false);
    }

    public void lambda$setupMessageOptions$11(Utilities.Callback callback, int i) {
        callback.run(Integer.valueOf(i));
        boolean z = true;
        if (i != 1 && i != 13) {
            z = false;
        }
        dismiss(z);
    }

    public boolean lambda$setupMessageOptions$12(View view, MotionEvent motionEvent) {
        if (this.messageOptionsView == null || motionEvent.getAction() != 0) {
            return false;
        }
        Drawable backgroundDrawable = ((ActionBarPopupWindow.ActionBarPopupWindowLayout) this.messageOptionsView).getBackgroundDrawable();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(backgroundDrawable.getBounds());
        rectF.offset(this.messageOptionsView.getX(), this.messageOptionsView.getY());
        if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        dismiss(true);
        return true;
    }

    public void setupTranslation() {
        if (this.hasTranslation || this.windowView.getWidth() <= 0) {
            return;
        }
        ChatMessageCell chatMessageCell = this.cell;
        if (chatMessageCell != null) {
            int[] iArr = new int[2];
            chatMessageCell.getLocationOnScreen(iArr);
            int i = iArr[0];
            Insets insets = this.insets;
            this.tx = i - insets.left;
            float f = iArr[1] - insets.top;
            this.ty = f;
            if (!this.hasDestTranslation) {
                this.hasDestTranslation = true;
                this.dtx1 = 0.0f;
                this.dty1 = f;
                if (this.messageOptionsView != null) {
                    float height = f + this.cell.getHeight() + this.messageOptionsView.getHeight();
                    int height2 = this.windowView.getHeight();
                    Insets insets2 = this.insets;
                    if (height > ((height2 - insets2.top) - insets2.bottom) - AndroidUtilities.dp(66.0f)) {
                        int height3 = this.windowView.getHeight();
                        Insets insets3 = this.insets;
                        this.dty1 = ((((height3 - insets3.top) - insets3.bottom) - AndroidUtilities.dp(66.0f)) - this.cell.getHeight()) - this.messageOptionsView.getHeight();
                    }
                }
                int todoIndex = this.myTaskCell.getTodoIndex(this.taskId);
                this.myTaskCell.getPollButtonTop(todoIndex);
                float pollButtonBottom = this.myTaskCell.getPollButtonBottom(todoIndex);
                this.dtx2 = 0.0f;
                float f2 = this.ty;
                this.dty2 = f2;
                int i2 = (int) pollButtonBottom;
                float f3 = i2;
                float f4 = f2 + f3;
                int height4 = this.windowView.getHeight();
                Insets insets4 = this.insets;
                if (f4 > (((height4 - insets4.top) - insets4.bottom) - AndroidUtilities.dp(78.0f)) - this.hintTextView.getHeight()) {
                    int height5 = this.windowView.getHeight();
                    Insets insets5 = this.insets;
                    this.dty2 = ((((height5 - insets5.top) - insets5.bottom) - AndroidUtilities.dp(78.0f)) - this.hintTextView.getHeight()) - i2;
                }
                View view = this.taskOptionsView;
                if (view != null) {
                    float height6 = this.dty2 + f3 + view.getHeight();
                    int height7 = this.windowView.getHeight();
                    Insets insets6 = this.insets;
                    if (height6 > (((height7 - insets6.top) - insets6.bottom) - AndroidUtilities.dp(78.0f)) - this.hintTextView.getHeight()) {
                        int height8 = this.windowView.getHeight();
                        Insets insets7 = this.insets;
                        this.dty2 = (((((height8 - insets7.top) - insets7.bottom) - AndroidUtilities.dp(78.0f)) - this.hintTextView.getHeight()) - i2) - this.taskOptionsView.getHeight();
                    }
                }
            }
            updateTranslation();
        } else {
            this.ty = 0.0f;
            this.tx = 0.0f;
        }
        this.hasTranslation = true;
    }

    public void updateTranslation() {
        float positionAnimated = this.viewPager.getPositionAnimated();
        float fLerp = AndroidUtilities.lerp(0, -this.viewPager.getWidth(), positionAnimated);
        float fLerp2 = AndroidUtilities.lerp(this.viewPager.getWidth(), 0, positionAnimated);
        if (this.hasTranslation) {
            View view = this.messageOptionsView;
            if (view instanceof ActionBarPopupWindow.ActionBarPopupWindowLayout) {
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = (ActionBarPopupWindow.ActionBarPopupWindowLayout) view;
                this.dtx1 = 0.0f;
                float f = this.ty;
                this.dty1 = f;
                if (view != null) {
                    float height = f + this.cell.getHeight() + actionBarPopupWindowLayout.getVisibleHeight();
                    int height2 = this.windowView.getHeight();
                    Insets insets = this.insets;
                    if (height > ((height2 - insets.top) - insets.bottom) - AndroidUtilities.dp(66.0f)) {
                        int height3 = this.windowView.getHeight();
                        Insets insets2 = this.insets;
                        this.dty1 = ((((height3 - insets2.top) - insets2.bottom) - AndroidUtilities.dp(66.0f)) - this.cell.getHeight()) - actionBarPopupWindowLayout.getVisibleHeight();
                    }
                }
            }
        }
        this.myCell.setTranslationX(AndroidUtilities.lerp(this.tx, this.dtx1, this.dismissingWithAlpha ? 1.0f : this.openProgress) + fLerp2);
        this.myCell.setTranslationY(AndroidUtilities.lerp(this.ty, this.dty1, this.dismissingWithAlpha ? 1.0f : this.openProgress));
        View view2 = this.messageOptionsView;
        if (view2 != null) {
            if (this.isOut) {
                view2.setTranslationX(((((this.dtx1 + fLerp2) + this.myCell.getLeft()) + this.myCell.getPollButtonsLeft()) - AndroidUtilities.dp(8.0f)) - this.messageOptionsView.getLeft());
            } else {
                view2.setTranslationX((((this.dtx1 + fLerp2) + (this.myCell.needDrawAvatar() ? AndroidUtilities.dp(48.0f) : 0)) + this.myCell.getLeft()) - this.messageOptionsView.getLeft());
            }
            this.messageOptionsViewMaxWidth = this.menuContainer.getMeasuredWidth() - (this.messageOptionsView.getX() - fLerp2);
            this.messageOptionsView.setTranslationY(((this.myCell.getY() + this.myCell.getHeight()) - this.messageOptionsView.getTop()) - this.menuContainer.getTop());
            this.messageOptionsView.setAlpha(this.openProgress);
            float fLerp3 = AndroidUtilities.lerp(0.75f, 1.0f, this.openProgress);
            this.messageOptionsView.setScaleX(fLerp3);
            this.messageOptionsView.setScaleY(fLerp3);
        }
        this.myTaskCell.setTranslationX(AndroidUtilities.lerp(this.tx, this.dtx2, this.dismissingWithAlpha ? 1.0f : this.openProgress) + fLerp);
        this.myTaskCell.setTranslationY(AndroidUtilities.lerp(this.ty, this.dty2, this.dismissingWithAlpha ? 1.0f : this.openProgress));
        if (this.taskOptionsView != null) {
            int todoIndex = this.myTaskCell.getTodoIndex(this.taskId);
            this.myTaskCell.getPollButtonTop(todoIndex);
            float pollButtonBottom = this.myTaskCell.getPollButtonBottom(todoIndex);
            if (this.isOut) {
                this.taskOptionsView.setTranslationX(((((this.dtx2 + fLerp) + this.myTaskCell.getLeft()) + this.myTaskCell.getPollButtonsLeft()) - AndroidUtilities.dp(8.0f)) - this.taskOptionsView.getLeft());
            } else {
                this.taskOptionsView.setTranslationX((((this.dtx2 + fLerp) + (this.myTaskCell.needDrawAvatar() ? AndroidUtilities.dp(48.0f) : 0)) + this.myTaskCell.getLeft()) - this.taskOptionsView.getLeft());
            }
            this.taskOptionsViewMaxWidth = this.menuContainer.getMeasuredWidth() - (this.taskOptionsView.getX() - fLerp2);
            this.taskOptionsView.setTranslationY(((this.myTaskCell.getY() + ((int) pollButtonBottom)) - this.taskOptionsView.getTop()) - this.menuContainer.getTop());
            this.taskOptionsView.setAlpha(this.openProgress);
            float fLerp4 = AndroidUtilities.lerp(0.75f, 1.0f, this.openProgress);
            this.taskOptionsView.setScaleX(fLerp4);
            this.taskOptionsView.setScaleY(fLerp4);
        }
        if (this.dismissingWithAlpha) {
            this.myCell.setAlpha(this.openProgress);
            this.myTaskCell.setAlpha(this.openProgress);
        }
        if (this.reactionsView != null) {
            float fMax = fLerp2 + Math.max(0.0f, ((this.myCell.getBoundsRight() + this.myCell.getBoundsLeft()) / 2.0f) - (this.reactionsView.getWidth() * 0.8f));
            this.reactionsView.setTranslationX(fMax);
            this.reactionsView.setTranslationY(Math.max(0.0f, ((this.myCell.getY() - this.reactionsView.getHeight()) + AndroidUtilities.dp(22.0f)) - this.menuContainer.getTop()));
            this.reactionsView.setAlpha(this.openProgress);
            View windowView = this.reactionsView.getWindowView();
            if (windowView != null) {
                windowView.setTranslationX(fMax);
                windowView.setAlpha(this.openProgress);
            }
        }
        this.hintTextView.setTranslationX(fLerp);
        this.hintTextView.setAlpha(this.openProgress);
        this.tabsView.setSelectedTab(positionAnimated);
        this.tabsView.setAlpha(this.openProgress);
    }

    private void prepareBlur(final View view) {
        if (view != null) {
            view.setVisibility(4);
        }
        ScrimOptions.makeGlobalBlurBitmaps(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$prepareBlur$13(view, (Bitmap) obj, (Bitmap) obj2);
            }
        });
    }

    public void lambda$prepareBlur$13(View view, Bitmap bitmap, Bitmap bitmap2) {
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
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? 0.05f : 0.25f);
        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, Theme.isCurrentThemeDark() ? -0.02f : -0.04f);
        this.blurBitmapPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.blurMatrix = new Matrix();
        this.iBlur3SourceBitmap.setBitmap(bitmap2);
        checkBitmapMatrix();
    }

    @Override
    public void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            prepareBlur(null);
            this.setTaskInvisible = true;
            this.open = true;
            animateOpenTo(true, null);
        }
    }

    @Override
    public void dismiss() {
        dismiss(true);
    }

    public void dismiss(boolean z) {
        ChatMessageCell chatMessageCell;
        ReactionsContainerLayout reactionsContainerLayout;
        if (z && (reactionsContainerLayout = this.reactionsView) != null && reactionsContainerLayout.getReactionsWindow() != null && this.reactionsView.getReactionsWindow().isShowing()) {
            this.reactionsView.dismissWindow();
            return;
        }
        if (this.dismissing) {
            return;
        }
        this.dismissing = true;
        this.hasTranslation = false;
        this.viewPager.cancelTouches();
        final boolean z2 = this.viewPager.getCurrentPosition() == 1;
        if (z && z2) {
            ChatMessageCell chatMessageCell2 = this.cell;
            if (chatMessageCell2 != null) {
                chatMessageCell2.setVisibility(4);
                this.cell.invalidate();
            }
        } else if (!z && (chatMessageCell = this.cell) != null) {
            chatMessageCell.setVisibility(0);
            ChatMessageCell chatMessageCell3 = this.cell;
            chatMessageCell3.doNotDrawTaskId = -1;
            chatMessageCell3.invalidate();
        }
        this.dismissingWithAlpha = !z;
        setupTranslation();
        this.open = false;
        animateOpenTo(false, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$dismiss$15(z2);
            }
        });
        this.windowView.invalidate();
    }

    public void lambda$dismiss$14() {
        super.dismiss();
    }

    public void lambda$dismiss$15(boolean z) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$dismiss$14();
            }
        });
        ChatMessageCell chatMessageCell = this.cell;
        if (chatMessageCell != null) {
            chatMessageCell.setVisibility(0);
            if (!z) {
                ChatMessageCell chatMessageCell2 = this.cell;
                chatMessageCell2.syncTodoCheck(chatMessageCell2.getTodoIndex(this.taskId), this.myTaskCell);
            }
            ChatMessageCell chatMessageCell3 = this.cell;
            chatMessageCell3.doNotDrawTaskId = -1;
            chatMessageCell3.invalidate();
        }
        Runnable runnable = this.dismissListener;
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
            this.dismissListener = null;
        }
    }

    public void setOnDismissListener(Runnable runnable) {
        this.dismissListener = runnable;
    }

    private void animateOpenTo(final boolean z, final Runnable runnable) {
        ValueAnimator valueAnimator = this.openAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.open2Animator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        setupTranslation();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.openProgress, z ? 1.0f : 0.0f);
        this.openAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                this.f$0.lambda$animateOpenTo$16(valueAnimator3);
            }
        });
        this.openAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                TodoItemMenu.this.openProgress = z ? 1.0f : 0.0f;
                TodoItemMenu.this.windowView.invalidate();
                TodoItemMenu.this.containerView.invalidate();
                TodoItemMenu.this.updateTranslation();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        long j = !z ? 330L : 520L;
        ValueAnimator valueAnimator3 = this.openAnimator;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        valueAnimator3.setInterpolator(cubicBezierInterpolator);
        this.openAnimator.setDuration(j);
        this.openAnimator.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.openProgress2, z ? 1.0f : 0.0f);
        this.open2Animator = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                this.f$0.lambda$animateOpenTo$17(valueAnimator4);
            }
        });
        this.open2Animator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                TodoItemMenu.this.openProgress2 = z ? 1.0f : 0.0f;
            }
        });
        this.open2Animator.setDuration((long) (j * 1.5f));
        this.open2Animator.setInterpolator(cubicBezierInterpolator);
        this.open2Animator.start();
    }

    public void lambda$animateOpenTo$16(ValueAnimator valueAnimator) {
        this.openProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.windowView.invalidate();
        this.containerView.invalidate();
        updateTranslation();
    }

    public void lambda$animateOpenTo$17(ValueAnimator valueAnimator) {
        this.openProgress2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
