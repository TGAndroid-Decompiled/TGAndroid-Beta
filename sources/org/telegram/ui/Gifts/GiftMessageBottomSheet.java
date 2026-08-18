package org.telegram.ui.Gifts;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.HintsController;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceWrapped;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.chat.ChatInputViewsContainer;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.chat.WallpaperBitmapProvider;
import org.telegram.ui.Components.inset.WindowAnimatedInsetsProvider;
import org.telegram.ui.Components.inset.WindowInsetsStateHolder;
import org.telegram.ui.Stories.recorder.PreviewView;

public class GiftMessageBottomSheet extends BottomSheet {
    private final int captionLimit;
    private final AnimatedTextView captionLimitView;
    private final FrameLayout chatInputBubbleContainer;
    private final FrameLayout chatInputInAppContainer;
    private final ChatInputViewsContainer chatInputViewsContainer;
    private final ImageView closeButton;
    private int codepointCount;
    private final ChatActivityEnterView commentView;
    private final TL_stars.TL_starGiftUnique gift;
    private boolean hideMyName;
    private Callback mCallback;
    private boolean mLoading;
    private final BlurredBackgroundDrawableViewFactory navbarContentDrawableFactory;
    private final BlurredBackgroundSourceWrapped navbarContentSourceWallpaper;
    private final TextView previewInChatHeader;
    private final FrameLayout publicCheckboxButton;
    private final CheckBox2 publicCheckboxView;
    private final WindowAnimatedInsetsProvider rootAnimatedInsetsListener;
    private final SizeNotifierFrameLayout sizeNotifierFrameLayout;
    private final StarGiftUniqueActionView starGiftUniqueActionView;
    private final long toDialogId;
    private final WallpaperBitmapProvider wallpaperBitmapProvider;
    private final WindowInsetsStateHolder windowInsetsStateHolder;
    private ChatActivityEnterView.SendButton writeButton;

    public interface Callback {
        void performSend(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z);
    }

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    public GiftMessageBottomSheet(Context context, Theme.ResourcesProvider resourcesProvider, final TL_stars.TL_starGiftUnique tL_starGiftUnique, long j) {
        super(context, true, true, null);
        this.wallpaperBitmapProvider = new WallpaperBitmapProvider();
        WindowInsetsStateHolder windowInsetsStateHolder = new WindowInsetsStateHolder(new Runnable() {
            @Override
            public final void run() {
                this.f$0.checkInsets();
            }
        });
        this.windowInsetsStateHolder = windowInsetsStateHolder;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.gift = tL_starGiftUnique;
        this.toDialogId = j;
        this.captionLimit = MessagesController.getInstance(this.currentAccount).stargiftsMessageLengthMax;
        BlurredBackgroundSourceWrapped blurredBackgroundSourceWrapped = new BlurredBackgroundSourceWrapped();
        this.navbarContentSourceWallpaper = blurredBackgroundSourceWrapped;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceWrapped);
        this.navbarContentDrawableFactory = blurredBackgroundDrawableViewFactory;
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            @Override
            protected boolean isActionBarVisible() {
                return false;
            }

            @Override
            public boolean isStatusBarVisible() {
                return false;
            }

            @Override
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                GiftMessageBottomSheet.this.checkUi_GiftLayoutPosition();
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j2) {
                if (view == this.backgroundView) {
                    if (GiftMessageBottomSheet.this.navbarContentSourceWallpaper.getSource() instanceof BlurredBackgroundSourceBitmap) {
                        ((BlurredBackgroundSourceBitmap) GiftMessageBottomSheet.this.navbarContentSourceWallpaper.getSource()).setParentSize(getWidth(), getHeight(), 0);
                    }
                    GiftMessageBottomSheet.this.navbarContentSourceWallpaper.draw(canvas, 0.0f, 0.0f, getWidth(), getHeight());
                    return false;
                }
                return super.drawChild(canvas, view, j2);
            }

            @Override
            public void onUpdateBackgroundDrawable(Drawable drawable) {
                super.onUpdateBackgroundDrawable(drawable);
                if (drawable instanceof MotionBackgroundDrawable) {
                    ((MotionBackgroundDrawable) drawable).setFastRenderAllowed();
                }
                GiftMessageBottomSheet.this.navbarContentSourceWallpaper.setSource(GiftMessageBottomSheet.this.wallpaperBitmapProvider.updateSourceFromBackgroundViewDrawable(drawable));
            }
        };
        this.sizeNotifierFrameLayout = sizeNotifierFrameLayout;
        this.containerView = sizeNotifierFrameLayout;
        int i = this.backgroundPaddingLeft;
        sizeNotifierFrameLayout.setPadding(i, 0, i, 0);
        blurredBackgroundDrawableViewFactory.setSourceRootView(new ViewPositionWatcher(this.containerView), this.containerView);
        WindowAnimatedInsetsProvider windowAnimatedInsetsProvider = new WindowAnimatedInsetsProvider(this.container);
        this.rootAnimatedInsetsListener = windowAnimatedInsetsProvider;
        windowInsetsStateHolder.setupAnimatedInsetsProvider(windowAnimatedInsetsProvider, this.containerView);
        sizeNotifierFrameLayout.setBackgroundImage(PreviewView.getBackgroundDrawable((Drawable) null, this.currentAccount, j, Theme.isCurrentThemeDark()), false);
        StarGiftUniqueActionView starGiftUniqueActionView = new StarGiftUniqueActionView(context, this.currentAccount, resourcesProvider);
        this.starGiftUniqueActionView = starGiftUniqueActionView;
        starGiftUniqueActionView.set(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        starGiftUniqueActionView.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        starGiftUniqueActionView.setLayoutBackground(Theme.createServiceDrawable(AndroidUtilities.dp(18.0f), starGiftUniqueActionView, this.containerView, getThemedPaint("paintChatActionBackground")));
        sizeNotifierFrameLayout.addView(starGiftUniqueActionView, LayoutHelper.createFrame(-2, -2, 17));
        ChatInputViewsContainer chatInputViewsContainer = new ChatInputViewsContainer(context);
        this.chatInputViewsContainer = chatInputViewsContainer;
        chatInputViewsContainer.setClipChildren(false);
        chatInputViewsContainer.setWindowInsetsProvider(windowInsetsStateHolder);
        chatInputViewsContainer.setInputIslandBubbleDrawable(blurredBackgroundDrawableViewFactory.create(chatInputViewsContainer, BlurredBackgroundProviderImpl.bottomPanelChatActivity(resourcesProvider)));
        chatInputViewsContainer.setUnderKeyboardBackgroundDrawable(blurredBackgroundDrawableViewFactory.create(chatInputViewsContainer, BlurredBackgroundProviderImpl.bottomPanelChatActivity(resourcesProvider)));
        FrameLayout inputIslandBubbleContainer = chatInputViewsContainer.getInputIslandBubbleContainer();
        this.chatInputBubbleContainer = inputIslandBubbleContainer;
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = chatInputViewsContainer.getInAppKeyboardBubbleContainer();
        this.chatInputInAppContainer = inAppKeyboardBubbleContainer;
        ChatActivityEnterView chatActivityEnterView = new ChatActivityEnterView(AndroidUtilities.getActivity(), sizeNotifierFrameLayout, null, false) {
            @Override
            protected void onChangedIslandTotalHeight(float f) {
                GiftMessageBottomSheet.this.chatInputViewsContainer.setInputBubbleHeight(f);
                GiftMessageBottomSheet.this.checkUi_GiftLayoutPosition();
            }

            @Override
            public void extendActionMode(Menu menu) {
                ChatActivity.fillActionModeMenu(menu, null, false, false, false, false);
            }
        };
        this.commentView = chatActivityEnterView;
        chatActivityEnterView.setInAppInsetsController(windowInsetsStateHolder);
        chatActivityEnterView.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        chatActivityEnterView.shouldDrawBackground = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        chatActivityEnterView.allowBlur = false;
        chatActivityEnterView.forceSmoothKeyboard(true);
        chatActivityEnterView.setAllowStickersAndGifs(true, false, false);
        chatActivityEnterView.setForceShowSendButton(true, false);
        chatActivityEnterView.textFieldContainer.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        chatActivityEnterView.getSendButton().setAlpha(0.0f);
        chatActivityEnterView.getEditField().setMaxLines(3);
        chatActivityEnterView.setCustomWindowView(this.container);
        chatActivityEnterView.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(chatActivityEnterView, LayoutHelper.createFrame(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.containerView.addView(chatInputViewsContainer.getFadeView(), LayoutHelper.createFrame(-1, -1.0f));
        this.containerView.addView(chatInputViewsContainer, LayoutHelper.createFrame(-1, -1.0f));
        chatActivityEnterView.setDelegate(new ChatActivityEnterView.ChatActivityEnterViewDelegate() {
            @Override
            public void bottomPanelTranslationYChanged(float f) {
            }

            @Override
            public boolean checkCanRemoveRestrictionsByBoosts() {
                return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$checkCanRemoveRestrictionsByBoosts(this);
            }

            @Override
            public void didPressAttachButton() {
            }

            @Override
            public void didPressStreamingStop() {
                ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$didPressStreamingStop(this);
            }

            @Override
            public void didPressSuggestionButton() {
                ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$didPressSuggestionButton(this);
            }

            @Override
            public int getContentViewHeight() {
                return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$getContentViewHeight(this);
            }

            @Override
            public TLRPC.Peer getDefaultSendAs() {
                return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$getDefaultSendAs(this);
            }

            @Override
            public ChatActivity.ReplyQuote getReplyQuote() {
                return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$getReplyQuote(this);
            }

            @Override
            public TL_stories.StoryItem getReplyToStory() {
                return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$getReplyToStory(this);
            }

            @Override
            public TLRPC.TL_channels_sendAsPeers getSendAsPeers() {
                return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$getSendAsPeers(this);
            }

            @Override
            public boolean hasForwardingMessages() {
                return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$hasForwardingMessages(this);
            }

            @Override
            public boolean hasScheduledMessages() {
                return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$hasScheduledMessages(this);
            }

            @Override
            public boolean isVideoRecordingPaused() {
                return false;
            }

            @Override
            public int measureKeyboardHeight() {
                return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$measureKeyboardHeight(this);
            }

            @Override
            public void needChangeVideoPreviewState(int i2, float f) {
            }

            @Override
            public void needSendTyping() {
            }

            @Override
            public void needShowMediaBanHint() {
            }

            @Override
            public void needStartRecordAudio(int i2) {
            }

            @Override
            public void needStartRecordVideo(int i2, boolean z, int i3, int i4, int i5, long j2, long j3) {
            }

            @Override
            public void onAttachButtonHidden() {
            }

            @Override
            public void onAttachButtonShow() {
            }

            @Override
            public void onAudioVideoInterfaceUpdated() {
            }

            @Override
            public void onContextMenuClose() {
                ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onContextMenuClose(this);
            }

            @Override
            public void onContextMenuOpen() {
                ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onContextMenuOpen(this);
            }

            @Override
            public void onEditTextScroll() {
                ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onEditTextScroll(this);
            }

            @Override
            public void onEmojiViewTabChanged() {
                ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onEmojiViewTabChanged(this);
            }

            @Override
            public void onKeyboardRequested() {
                ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onKeyboardRequested(this);
            }

            @Override
            public void onMessageEditEnd(boolean z) {
            }

            @Override
            public void onMessageSend(CharSequence charSequence, boolean z, int i2, int i3, long j2) {
            }

            @Override
            public void onPreAudioVideoRecord() {
            }

            @Override
            public void onSendLongClick() {
            }

            @Override
            public void onStickersExpandedChange() {
            }

            @Override
            public void onStickersTab(boolean z) {
            }

            @Override
            public void onSwitchRecordMode(boolean z) {
            }

            @Override
            public void onTextSelectionChanged(int i2, int i3) {
            }

            @Override
            public void onTextSpansChanged(CharSequence charSequence) {
            }

            @Override
            public void onTrendingStickersShowed(boolean z) {
                ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onTrendingStickersShowed(this, z);
            }

            @Override
            public void onUpdateSlowModeButton(View view, boolean z, CharSequence charSequence) {
            }

            @Override
            public void onWindowSizeChanged(int i2) {
            }

            @Override
            public boolean onceVoiceAvailable() {
                return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onceVoiceAvailable(this);
            }

            @Override
            public void openScheduledMessages() {
                ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$openScheduledMessages(this);
            }

            @Override
            public void prepareMessageSending() {
                ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$prepareMessageSending(this);
            }

            @Override
            public void scrollToSendingMessage() {
                ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$scrollToSendingMessage(this);
            }

            @Override
            public boolean setDefaultSendAs(long j2, long j3) {
                return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$setDefaultSendAs(this, j2, j3);
            }

            @Override
            public void toggleVideoRecordingPause() {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, boolean z, boolean z2) {
                int i2;
                GiftMessageBottomSheet.this.starGiftUniqueActionView.set(tL_starGiftUnique, UserConfig.getInstance(((BottomSheet) GiftMessageBottomSheet.this).currentAccount).getClientUserId(), GiftMessageBottomSheet.this.commentView.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
                GiftMessageBottomSheet.this.codepointCount = Character.codePointCount(charSequence, 0, charSequence.length());
                if (GiftMessageBottomSheet.this.captionLimit <= 0 || (i2 = GiftMessageBottomSheet.this.captionLimit - GiftMessageBottomSheet.this.codepointCount) > 15) {
                    GiftMessageBottomSheet.this.captionLimitView.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            GiftMessageBottomSheet.this.captionLimitView.setVisibility(8);
                        }
                    });
                    return;
                }
                if (i2 < -9999) {
                    i2 = -9999;
                }
                GiftMessageBottomSheet.this.captionLimitView.setText(LocaleController.formatNumber(i2, ','), GiftMessageBottomSheet.this.captionLimitView.getVisibility() == 0);
                if (GiftMessageBottomSheet.this.captionLimitView.getVisibility() != 0) {
                    GiftMessageBottomSheet.this.captionLimitView.setVisibility(0);
                    GiftMessageBottomSheet.this.captionLimitView.setAlpha(0.0f);
                    GiftMessageBottomSheet.this.captionLimitView.setScaleX(0.5f);
                    GiftMessageBottomSheet.this.captionLimitView.setScaleY(0.5f);
                }
                GiftMessageBottomSheet.this.captionLimitView.animate().setListener(null).cancel();
                GiftMessageBottomSheet.this.captionLimitView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                if (i2 < 0) {
                    GiftMessageBottomSheet.this.captionLimitView.setTextColor(GiftMessageBottomSheet.this.getThemedColor(Theme.key_text_RedRegular));
                } else {
                    GiftMessageBottomSheet.this.captionLimitView.setTextColor(GiftMessageBottomSheet.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
                }
            }
        });
        ChatActivityEnterView.disableNewLines(chatActivityEnterView.messageEditText);
        AnimatedTextView animatedTextView = new AnimatedTextView(context);
        this.captionLimitView = animatedTextView;
        animatedTextView.setAllowCancel(true);
        animatedTextView.setScaleProperty(0.6f);
        animatedTextView.setVisibility(8);
        animatedTextView.setTextSize(AndroidUtilities.dp(15.0f));
        animatedTextView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
        animatedTextView.setTypeface(AndroidUtilities.bold());
        animatedTextView.setGravity(17);
        this.containerView.addView(animatedTextView, LayoutHelper.createFrame(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        ChatActivityEnterView.SendButton sendButton = new ChatActivityEnterView.SendButton(context, R.drawable.send_plane_24, resourcesProvider) {
            @Override
            public boolean isInactive() {
                return false;
            }

            @Override
            public boolean isOpen() {
                return true;
            }

            @Override
            public boolean shouldDrawBackground() {
                return true;
            }

            @Override
            public boolean isInScheduleMode() {
                return super.isInScheduleMode();
            }
        };
        this.writeButton = sendButton;
        sendButton.setCircleSize(AndroidUtilities.dp(38.0f), AndroidUtilities.dp(38.0f));
        this.writeButton.setCirclePadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(8.0f));
        ChatActivityEnterView.SendButton sendButton2 = this.writeButton;
        sendButton2.newCounterPos = true;
        this.containerView.addView(sendButton2, LayoutHelper.createFrame(110, 50, 85));
        this.writeButton.setScrimViewBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
        this.writeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$0(view);
            }
        });
        TextView textView = new TextView(context);
        this.previewInChatHeader = textView;
        int i2 = Theme.key_chat_serviceText;
        textView.setTextColor(getThemedColor(i2));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.GiftMessagePreviewInChat));
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setBackground(Theme.createServiceDrawable(AndroidUtilities.dp(23.0f) / 2, textView, this.containerView, getThemedPaint("paintChatActionBackground")));
        this.containerView.addView(textView, LayoutHelper.createFrame(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.publicCheckboxButton = frameLayout;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(getThemedColor(i2));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        CheckBox2 checkBox2 = new CheckBox2(context, 18, resourcesProvider);
        this.publicCheckboxView = checkBox2;
        checkBox2.getCheckBoxBase().setCuttingCheck(true);
        checkBox2.getCheckBoxBase().checkScale = 0.9f;
        checkBox2.setColor(i2, i2, Theme.key_checkboxCheck);
        checkBox2.setDrawUnchecked(true);
        checkBox2.setChecked(!this.hideMyName, false);
        starGiftUniqueActionView.getLayout().setOnButtonClickListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$1();
            }
        });
        checkBox2.setDrawBackgroundAsArc(10);
        frameLayout.addView(checkBox2, LayoutHelper.createFrame(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(Theme.createServiceDrawable(AndroidUtilities.dp(16.0f), frameLayout, this.containerView, getThemedPaint("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$2(view);
            }
        });
        this.containerView.addView(frameLayout, LayoutHelper.createFrame(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.closeButton = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        imageView.setBackground(Blur3Utils.wrapCenteredDrawable(Theme.createServiceDrawable(AndroidUtilities.dp(16.0f), imageView, this.containerView, getThemedPaint("paintChatActionBackground")), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f)));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$3(view);
            }
        });
        this.containerView.addView(imageView, LayoutHelper.createFrame(56, 56, 53));
        ScaleStateListAnimator.apply(frameLayout, 0.05f, 1.2f);
        ScaleStateListAnimator.apply(imageView);
        ViewCompat.setOnApplyWindowInsetsListener(this.containerView, new OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return this.f$0.onApplyWindowInsets(view, windowInsetsCompat);
            }
        });
    }

    public void lambda$new$0(View view) {
        if (this.captionLimit - this.codepointCount < 0) {
            AndroidUtilities.shakeView(this.captionLimitView);
            return;
        }
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.performSend(this.commentView.getTextWithEntities(), this.hideMyName);
        }
    }

    public void lambda$new$1() {
        this.writeButton.performClick();
    }

    public void lambda$new$2(View view) {
        boolean z = this.hideMyName;
        this.hideMyName = !z;
        this.publicCheckboxView.setChecked(z, true);
    }

    public void lambda$new$3(View view) {
        lambda$new$0();
    }

    protected Paint getThemedPaint(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Paint paint = resourcesProvider != null ? resourcesProvider.getPaint(str) : null;
        return paint != null ? paint : Theme.getThemePaint(str);
    }

    @Override
    public void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        setAllowNestedScroll(false);
        Bulletin.addDelegate(this.container, new Bulletin.Delegate() {
            @Override
            public boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public boolean clipWithGradient(int i) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
            }

            @Override
            public int getBottomOffset(int i) {
                return Bulletin.Delegate.CC.$default$getBottomOffset(this, i);
            }

            @Override
            public void onBottomOffsetChange(float f) {
                Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
            }

            @Override
            public void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public void onShow(Bulletin bulletin) {
                bulletin.getLayout().setCustomBackground(GiftMessageBottomSheet.this.navbarContentDrawableFactory.create((View) bulletin.getLayout(), true).setColorProvider(BlurredBackgroundProviderImpl.bulletin(((BottomSheet) GiftMessageBottomSheet.this).resourcesProvider)).setRadius(AndroidUtilities.dp(16.0f)));
            }

            @Override
            public int getTopOffset(int i) {
                return AndroidUtilities.statusBarHeight;
            }
        });
        HintsController.Hint hint = HintsController.Hint.GiftMessageHint;
        if (hint.show()) {
            hint.increment();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.toDialogId);
            BulletinFactory.of(this.container, this.resourcesProvider).createUsersBulletin(userOrChat, LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), this.gift.title + " #" + LocaleController.formatNumber(this.gift.num, ',')))).show(true);
        }
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.windowInsetsStateHolder.setInsets(windowInsetsCompat);
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public void lambda$openCrafting$8() {
        ChatActivityEnterView chatActivityEnterView = this.commentView;
        if (chatActivityEnterView != null && chatActivityEnterView.isPopupShowing()) {
            this.commentView.hidePopup(true);
        } else {
            super.lambda$openCrafting$8();
        }
    }

    public void checkInsets() {
        ChatInputViewsContainer chatInputViewsContainer = this.chatInputViewsContainer;
        if (chatInputViewsContainer != null) {
            chatInputViewsContainer.checkInsets();
        }
        ChatActivityEnterView.SendButton sendButton = this.writeButton;
        if (sendButton != null) {
            sendButton.setTranslationY(-this.windowInsetsStateHolder.getAnimatedMaxBottomInset());
        }
        AnimatedTextView animatedTextView = this.captionLimitView;
        if (animatedTextView != null) {
            animatedTextView.setTranslationY(-this.windowInsetsStateHolder.getAnimatedMaxBottomInset());
        }
        checkUi_GiftLayoutPosition();
    }

    public void checkUi_GiftLayoutPosition() {
        int i = this.windowInsetsStateHolder.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout()).top;
        float fDp = AndroidUtilities.dp(36.0f) + i;
        float animatedMaxBottomInset = this.windowInsetsStateHolder.getAnimatedMaxBottomInset() + AndroidUtilities.dp(9.0f) + this.chatInputViewsContainer.getInputBubbleHeight();
        this.starGiftUniqueActionView.setTranslationY((fDp - (AndroidUtilities.dp(46.0f) + animatedMaxBottomInset)) / 2.0f);
        this.starGiftUniqueActionView.invalidate();
        this.previewInChatHeader.setTranslationY(this.starGiftUniqueActionView.getY() - AndroidUtilities.dp(33.0f));
        this.previewInChatHeader.invalidate();
        this.publicCheckboxButton.setTranslationY(-(animatedMaxBottomInset + AndroidUtilities.dp(14.0f)));
        this.publicCheckboxButton.invalidate();
        this.closeButton.setTranslationY(i);
        this.closeButton.invalidate();
    }

    public void setLoading(boolean z) {
        if (this.mLoading != z) {
            this.mLoading = z;
            this.writeButton.setLoading(z, -3.0f);
        }
    }

    public boolean isLoading() {
        return this.mLoading;
    }

    public void setCallback(Callback callback) {
        this.mCallback = callback;
    }
}
