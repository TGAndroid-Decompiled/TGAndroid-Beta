package org.telegram.ui.Gifts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda48;
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
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceWrapped;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.chat.ChatInputViewsContainer;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.chat.WallpaperBitmapProvider;
import org.telegram.ui.Components.inset.WindowAnimatedInsetsProvider;
import org.telegram.ui.Components.inset.WindowInsetsStateHolder;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda182;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.PreviewView;

public final class GiftMessageBottomSheet extends BottomSheet {
    public final Drawable backgroundDrawable;
    public final int captionLimit;
    public final AnimatedTextView captionLimitView;
    public final ChatInputViewsContainer chatInputViewsContainer;
    public final ImageView closeButton;
    public int codepointCount;
    public final AnonymousClass2 commentView;
    public final TL_stars.TL_starGiftUnique gift;
    public boolean hideMyName;
    public ChatActivity$$ExternalSyntheticLambda48 mCallback;
    public boolean mLoading;
    public final BlurredBackgroundDrawableViewFactory navbarContentDrawableFactory;
    public final BlurredBackgroundSourceWrapped navbarContentSourceWallpaper;
    public final TextView previewInChatHeader;
    public final FrameLayout publicCheckboxButton;
    public final CheckBox2 publicCheckboxView;
    public final StarGiftUniqueActionView starGiftUniqueActionView;
    public final long toDialogId;
    public final WallpaperBitmapProvider wallpaperBitmapProvider;
    public final WindowInsetsStateHolder windowInsetsStateHolder;
    public final AnonymousClass4 writeButton;

    public final class AnonymousClass3 implements ChatActivityEnterView.ChatActivityEnterViewDelegate {
        public final TL_stars.TL_starGiftUnique val$gift;

        public AnonymousClass3(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
            this.val$gift = tL_starGiftUnique;
        }

        @Override
        public final void bottomPanelTranslationYChanged(float f) {
        }

        @Override
        public final boolean checkCanRemoveRestrictionsByBoosts() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$checkCanRemoveRestrictionsByBoosts(this);
        }

        @Override
        public final void didPressAttachButton() {
        }

        @Override
        public final void didPressStreamingStop() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$didPressStreamingStop(this);
        }

        @Override
        public final void didPressSuggestionButton() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$didPressSuggestionButton(this);
        }

        @Override
        public final int getContentViewHeight() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$getContentViewHeight(this);
        }

        @Override
        public final TLRPC.Peer getDefaultSendAs() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$getDefaultSendAs(this);
        }

        @Override
        public final ChatActivity.ReplyQuote getReplyQuote() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$getReplyQuote(this);
        }

        @Override
        public final TL_stories.StoryItem getReplyToStory() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$getReplyToStory(this);
        }

        @Override
        public final TLRPC.TL_channels_sendAsPeers getSendAsPeers() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$getSendAsPeers(this);
        }

        @Override
        public final boolean hasForwardingMessages() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$hasForwardingMessages(this);
        }

        @Override
        public final boolean hasScheduledMessages() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$hasScheduledMessages(this);
        }

        @Override
        public final boolean isVideoRecordingPaused() {
            return false;
        }

        @Override
        public final int measureKeyboardHeight() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$measureKeyboardHeight(this);
        }

        @Override
        public final void needChangeVideoPreviewState(int i, float f) {
        }

        @Override
        public final void needSendTyping() {
        }

        @Override
        public final void needShowMediaBanHint() {
        }

        @Override
        public final void needStartRecordAudio(int i) {
        }

        @Override
        public final void needStartRecordVideo(int i, boolean z, int i2, int i3, int i4, long j, long j2) {
        }

        @Override
        public final void onAttachButtonHidden() {
        }

        @Override
        public final void onAttachButtonShow() {
        }

        @Override
        public final void onAudioVideoInterfaceUpdated() {
        }

        @Override
        public final void onContextMenuClose() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onContextMenuClose(this);
        }

        @Override
        public final void onContextMenuOpen() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onContextMenuOpen(this);
        }

        @Override
        public final void onEditTextScroll() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onEditTextScroll(this);
        }

        @Override
        public final void onEmojiViewTabChanged() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onEmojiViewTabChanged(this);
        }

        @Override
        public final void onKeyboardRequested() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onKeyboardRequested(this);
        }

        @Override
        public final void onMessageEditEnd(boolean z) {
        }

        @Override
        public final void onMessageSend(CharSequence charSequence, boolean z, int i, int i2, long j) {
        }

        @Override
        public final void onPreAudioVideoRecord() {
        }

        @Override
        public final void onSendLongClick() {
        }

        @Override
        public final void onStickersExpandedChange() {
        }

        @Override
        public final void onStickersTab(boolean z) {
        }

        @Override
        public final void onSwitchRecordMode(boolean z) {
        }

        @Override
        public final void onTextChanged(CharSequence charSequence, boolean z, boolean z2) {
            onTextChangedInternal(charSequence);
        }

        public final void onTextChangedInternal(CharSequence charSequence) {
            int i;
            GiftMessageBottomSheet giftMessageBottomSheet = GiftMessageBottomSheet.this;
            giftMessageBottomSheet.starGiftUniqueActionView.set(this.val$gift, UserConfig.getInstance(((BottomSheet) giftMessageBottomSheet).currentAccount).getClientUserId(), giftMessageBottomSheet.commentView.getTextWithEntities(), LocaleController.getString(R.string.GiftMessageSendNow), true);
            int iCodePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
            giftMessageBottomSheet.codepointCount = iCodePointCount;
            AnimatedTextView animatedTextView = giftMessageBottomSheet.captionLimitView;
            int i2 = giftMessageBottomSheet.captionLimit;
            if (i2 <= 0 || (i = i2 - iCodePointCount) > 15) {
                animatedTextView.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new BaseChartView.AnonymousClass4(this, 15));
                return;
            }
            if (i < -9999) {
                i = -9999;
            }
            animatedTextView.setText(LocaleController.formatNumber(i, ','), animatedTextView.getVisibility() == 0);
            if (animatedTextView.getVisibility() != 0) {
                animatedTextView.setVisibility(0);
                animatedTextView.setAlpha(0.0f);
                animatedTextView.setScaleX(0.5f);
                animatedTextView.setScaleY(0.5f);
            }
            animatedTextView.animate().setListener(null).cancel();
            animatedTextView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            if (i < 0) {
                animatedTextView.setTextColor(giftMessageBottomSheet.getThemedColor(Theme.key_text_RedRegular));
            } else {
                animatedTextView.setTextColor(giftMessageBottomSheet.getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
            }
        }

        @Override
        public final void onTextSelectionChanged(int i, int i2) {
        }

        @Override
        public final void onTextSpansChanged(CharSequence charSequence) {
            onTextChangedInternal(charSequence);
        }

        @Override
        public final void onTrendingStickersShowed(boolean z) {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onTrendingStickersShowed(this, z);
        }

        @Override
        public final void onUpdateSlowModeButton(View view, boolean z, CharSequence charSequence) {
        }

        @Override
        public final void onWindowSizeChanged(int i) {
        }

        @Override
        public final boolean onceVoiceAvailable() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onceVoiceAvailable(this);
        }

        @Override
        public final void openScheduledMessages() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$openScheduledMessages(this);
        }

        @Override
        public final void prepareMessageSending() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$prepareMessageSending(this);
        }

        @Override
        public final void scrollToSendingMessage() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$scrollToSendingMessage(this);
        }

        @Override
        public final boolean setDefaultSendAs(long j, long j2) {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$setDefaultSendAs(this, j, j2);
        }

        @Override
        public final void toggleVideoRecordingPause() {
        }
    }

    public final class AnonymousClass4 extends ChatActivityEnterView.SendButton {
        @Override
        public final boolean isInactive() {
            return false;
        }

        @Override
        public final boolean isOpen() {
            return true;
        }

        @Override
        public final boolean shouldDrawBackground() {
            return true;
        }
    }

    public GiftMessageBottomSheet(Context context, Theme.ResourcesProvider resourcesProvider, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j) {
        super(context, true, true, null);
        final int i = 0;
        final int i2 = 1;
        this.wallpaperBitmapProvider = new WallpaperBitmapProvider();
        WindowInsetsStateHolder windowInsetsStateHolder = new WindowInsetsStateHolder(new StarGiftSheet$$ExternalSyntheticLambda182(this, 1));
        this.windowInsetsStateHolder = windowInsetsStateHolder;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.gift = tL_starGiftUnique;
        this.toDialogId = j;
        this.captionLimit = MessagesController.getInstance(this.currentAccount).stargiftsMessageLengthMax;
        BlurredBackgroundSourceWrapped blurredBackgroundSourceWrapped = new BlurredBackgroundSourceWrapped();
        this.navbarContentSourceWallpaper = blurredBackgroundSourceWrapped;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceWrapped);
        this.navbarContentDrawableFactory = blurredBackgroundDrawableViewFactory;
        ?? r3 = new SizeNotifierFrameLayout(context) {
            @Override
            public final boolean drawChild(Canvas canvas, View view, long j2) {
                if (view != this.backgroundView) {
                    return super.drawChild(canvas, view, j2);
                }
                GiftMessageBottomSheet giftMessageBottomSheet = GiftMessageBottomSheet.this;
                BlurredBackgroundSource blurredBackgroundSource = giftMessageBottomSheet.navbarContentSourceWallpaper.sourceInternal;
                if (blurredBackgroundSource instanceof BlurredBackgroundSourceBitmap) {
                    BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = (BlurredBackgroundSourceBitmap) blurredBackgroundSource;
                    int width = getWidth();
                    int height = getHeight();
                    if (blurredBackgroundSourceBitmap.parentWidth != width || blurredBackgroundSourceBitmap.parentHeight != height) {
                        blurredBackgroundSourceBitmap.parentWidth = width;
                        blurredBackgroundSourceBitmap.parentHeight = height;
                        blurredBackgroundSourceBitmap.updateMatrix();
                    }
                }
                BlurredBackgroundSourceWrapped blurredBackgroundSourceWrapped2 = giftMessageBottomSheet.navbarContentSourceWallpaper;
                float width2 = getWidth();
                float height2 = getHeight();
                BlurredBackgroundSource blurredBackgroundSource2 = blurredBackgroundSourceWrapped2.sourceInternal;
                if (blurredBackgroundSource2 == null) {
                    return false;
                }
                blurredBackgroundSource2.draw(canvas, 0.0f, 0.0f, width2, height2);
                return false;
            }

            @Override
            public final Drawable getNewDrawable() {
                Drawable drawable = GiftMessageBottomSheet.this.backgroundDrawable;
                return drawable != null ? drawable : super.getNewDrawable();
            }

            @Override
            public final boolean isActionBarVisible() {
                return false;
            }

            @Override
            public final boolean isStatusBarVisible() {
                return false;
            }

            @Override
            public final void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                super.onLayout(z, i3, i4, i5, i6);
                GiftMessageBottomSheet.this.checkUi_GiftLayoutPosition();
            }

            @Override
            public final void onUpdateBackgroundDrawable(Drawable drawable) {
                super.onUpdateBackgroundDrawable(drawable);
                if (drawable instanceof MotionBackgroundDrawable) {
                    ((MotionBackgroundDrawable) drawable).setFastRenderAllowed();
                }
                GiftMessageBottomSheet giftMessageBottomSheet = GiftMessageBottomSheet.this;
                giftMessageBottomSheet.navbarContentSourceWallpaper.sourceInternal = giftMessageBottomSheet.wallpaperBitmapProvider.updateSourceFromBackgroundViewDrawable(drawable);
            }
        };
        this.containerView = r3;
        int i3 = this.backgroundPaddingLeft;
        r3.setPadding(i3, 0, i3, 0);
        ViewPositionWatcher viewPositionWatcher = new ViewPositionWatcher(this.containerView);
        ViewGroup viewGroup = this.containerView;
        blurredBackgroundDrawableViewFactory.viewPositionWatcher = viewPositionWatcher;
        blurredBackgroundDrawableViewFactory.parent = viewGroup;
        WindowAnimatedInsetsProvider windowAnimatedInsetsProvider = new WindowAnimatedInsetsProvider(this.container);
        ViewGroup viewGroup2 = this.containerView;
        windowInsetsStateHolder.animatedInsetsProvider = windowAnimatedInsetsProvider;
        windowInsetsStateHolder.animatedInsetsProviderTarget = viewGroup2;
        windowAnimatedInsetsProvider.listeners.add(windowInsetsStateHolder);
        Drawable backgroundDrawable = PreviewView.getBackgroundDrawable((Drawable) null, this.currentAccount, j, Theme.currentTheme.isDark());
        this.backgroundDrawable = backgroundDrawable;
        r3.setBackgroundImage(backgroundDrawable, false);
        StarGiftUniqueActionView starGiftUniqueActionView = new StarGiftUniqueActionView(context, this.currentAccount, resourcesProvider);
        this.starGiftUniqueActionView = starGiftUniqueActionView;
        starGiftUniqueActionView.set(tL_starGiftUnique, UserConfig.getInstance(this.currentAccount).getClientUserId(), null, LocaleController.getString(R.string.GiftMessageSendNow), false);
        starGiftUniqueActionView.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        int iDp = AndroidUtilities.dp(18.0f);
        ViewGroup viewGroup3 = this.containerView;
        Theme.ResourcesProvider resourcesProvider2 = this.resourcesProvider;
        Paint paint = resourcesProvider2 != null ? resourcesProvider2.getPaint("paintChatActionBackground") : null;
        starGiftUniqueActionView.setLayoutBackground(new Theme.AnonymousClass7(starGiftUniqueActionView, viewGroup3, iDp, paint == null ? Theme.getThemePaint("paintChatActionBackground") : paint));
        r3.addView(starGiftUniqueActionView, LayoutHelper.createFrame(-2, -2, 48));
        ChatInputViewsContainer chatInputViewsContainer = new ChatInputViewsContainer(context);
        this.chatInputViewsContainer = chatInputViewsContainer;
        chatInputViewsContainer.setClipChildren(false);
        chatInputViewsContainer.setWindowInsetsProvider(windowInsetsStateHolder);
        chatInputViewsContainer.setInputIslandBubbleDrawable(blurredBackgroundDrawableViewFactory.create(chatInputViewsContainer, BlurredBackgroundProviderImpl.bottomPanelChatActivity(resourcesProvider), false));
        chatInputViewsContainer.setUnderKeyboardBackgroundDrawable(blurredBackgroundDrawableViewFactory.create(chatInputViewsContainer, BlurredBackgroundProviderImpl.bottomPanelChatActivity(resourcesProvider), false));
        FrameLayout inputIslandBubbleContainer = chatInputViewsContainer.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = chatInputViewsContainer.getInAppKeyboardBubbleContainer();
        ?? r15 = new ChatActivityEnterView(AndroidUtilities.getActivity(), r3) {
            @Override
            public final void extendActionMode(Menu menu) {
                ChatActivity.fillActionModeMenu(menu, null, false, false, false, false);
            }

            @Override
            public final void onChangedIslandTotalHeight(float f) {
                GiftMessageBottomSheet giftMessageBottomSheet = GiftMessageBottomSheet.this;
                giftMessageBottomSheet.chatInputViewsContainer.setInputBubbleHeight(f);
                giftMessageBottomSheet.checkUi_GiftLayoutPosition();
            }
        };
        this.commentView = r15;
        r15.setInAppInsetsController(windowInsetsStateHolder);
        r15.setOverrideHint(LocaleController.getString(R.string.GiftMessageAddHint));
        r15.shouldDrawBackground = false;
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        r15.allowBlur = false;
        r15.forceSmoothKeyboard(true);
        r15.setAllowStickersAndGifs(true, false, false);
        r15.setForceShowSendButton(true, false);
        r15.textFieldContainer.setPadding(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(20.0f), 0);
        r15.getSendButton().setAlpha(0.0f);
        r15.getEditField().setMaxLines(3);
        r15.setCustomWindowView(this.container);
        r15.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView((View) r15, LayoutHelper.createFrame(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.containerView.addView(chatInputViewsContainer.getFadeView(), LayoutHelper.createFrame(-1, -1.0f));
        this.containerView.addView(chatInputViewsContainer, LayoutHelper.createFrame(-1, -1.0f));
        r15.setDelegate(new AnonymousClass3(tL_starGiftUnique));
        ChatActivityEnterView.disableNewLines(r15.messageEditText);
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
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(context, R.drawable.send_plane_24, resourcesProvider);
        this.writeButton = anonymousClass4;
        anonymousClass4.setCircleSize(AndroidUtilities.dp(38.0f), AndroidUtilities.dp(38.0f));
        anonymousClass4.setCirclePadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(8.0f));
        anonymousClass4.newCounterPos = true;
        this.containerView.addView(anonymousClass4, LayoutHelper.createFrame(110, 50, 85));
        anonymousClass4.setScrimViewBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
        anonymousClass4.setOnClickListener(new View.OnClickListener(this) {
            public final GiftMessageBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        GiftMessageBottomSheet giftMessageBottomSheet = this.f$0;
                        if (giftMessageBottomSheet.captionLimit - giftMessageBottomSheet.codepointCount >= 0) {
                            ChatActivity$$ExternalSyntheticLambda48 chatActivity$$ExternalSyntheticLambda48 = giftMessageBottomSheet.mCallback;
                            if (chatActivity$$ExternalSyntheticLambda48 != null) {
                                TLRPC.TL_textWithEntities textWithEntities = giftMessageBottomSheet.commentView.getTextWithEntities();
                                boolean z = giftMessageBottomSheet.hideMyName;
                                StarGiftSheet starGiftSheet = (StarGiftSheet) chatActivity$$ExternalSyntheticLambda48.f$0;
                                starGiftSheet.getClass();
                                GiftMessageBottomSheet giftMessageBottomSheet2 = (GiftMessageBottomSheet) chatActivity$$ExternalSyntheticLambda48.f$1;
                                if (!giftMessageBottomSheet2.mLoading) {
                                    starGiftSheet.performBuyPressed(giftMessageBottomSheet2, (TL_stars.TL_starGiftUnique) chatActivity$$ExternalSyntheticLambda48.f$2, chatActivity$$ExternalSyntheticLambda48.f$4, (AmountUtils$Currency) chatActivity$$ExternalSyntheticLambda48.f$3, textWithEntities, z);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(giftMessageBottomSheet.captionLimitView);
                            break;
                        }
                        break;
                    case 1:
                        GiftMessageBottomSheet giftMessageBottomSheet3 = this.f$0;
                        boolean z2 = giftMessageBottomSheet3.hideMyName;
                        giftMessageBottomSheet3.hideMyName = !z2;
                        giftMessageBottomSheet3.publicCheckboxView.setChecked(z2, true);
                        break;
                    default:
                        this.f$0.lambda$new$3$5(view);
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.previewInChatHeader = textView;
        int i4 = Theme.key_chat_serviceText;
        textView.setTextColor(getThemedColor(i4));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.GiftMessagePreviewInChat));
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        int iDp2 = AndroidUtilities.dp(23.0f) / 2;
        ViewGroup viewGroup4 = this.containerView;
        Theme.ResourcesProvider resourcesProvider3 = this.resourcesProvider;
        Paint paint2 = resourcesProvider3 != null ? resourcesProvider3.getPaint("paintChatActionBackground") : null;
        textView.setBackground(new Theme.AnonymousClass7(textView, viewGroup4, iDp2, paint2 == null ? Theme.getThemePaint("paintChatActionBackground") : paint2));
        this.containerView.addView(textView, LayoutHelper.createFrame(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.publicCheckboxButton = frameLayout;
        TextView textView2 = new TextView(context);
        textView2.setTextColor(getThemedColor(i4));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.GiftMessageMakeMessagePublic));
        frameLayout.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        CheckBox2 checkBox2 = new CheckBox2(context, 18, resourcesProvider);
        this.publicCheckboxView = checkBox2;
        checkBox2.getCheckBoxBase().setCuttingCheck(true);
        checkBox2.getCheckBoxBase().checkScale = 0.9f;
        checkBox2.setColor(i4, i4, Theme.key_checkboxCheck);
        checkBox2.setDrawUnchecked(true);
        checkBox2.setChecked(!this.hideMyName, false);
        starGiftUniqueActionView.getLayout().onButtonClick = new StarGiftSheet$$ExternalSyntheticLambda182(this, 2);
        checkBox2.setDrawBackgroundAsArc(10);
        frameLayout.addView(checkBox2, LayoutHelper.createFrame(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        int iDp3 = AndroidUtilities.dp(16.0f);
        ViewGroup viewGroup5 = this.containerView;
        Theme.ResourcesProvider resourcesProvider4 = this.resourcesProvider;
        Paint paint3 = resourcesProvider4 != null ? resourcesProvider4.getPaint("paintChatActionBackground") : null;
        frameLayout.setBackground(new Theme.AnonymousClass7(frameLayout, viewGroup5, iDp3, paint3 == null ? Theme.getThemePaint("paintChatActionBackground") : paint3));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final GiftMessageBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        GiftMessageBottomSheet giftMessageBottomSheet = this.f$0;
                        if (giftMessageBottomSheet.captionLimit - giftMessageBottomSheet.codepointCount >= 0) {
                            ChatActivity$$ExternalSyntheticLambda48 chatActivity$$ExternalSyntheticLambda48 = giftMessageBottomSheet.mCallback;
                            if (chatActivity$$ExternalSyntheticLambda48 != null) {
                                TLRPC.TL_textWithEntities textWithEntities = giftMessageBottomSheet.commentView.getTextWithEntities();
                                boolean z = giftMessageBottomSheet.hideMyName;
                                StarGiftSheet starGiftSheet = (StarGiftSheet) chatActivity$$ExternalSyntheticLambda48.f$0;
                                starGiftSheet.getClass();
                                GiftMessageBottomSheet giftMessageBottomSheet2 = (GiftMessageBottomSheet) chatActivity$$ExternalSyntheticLambda48.f$1;
                                if (!giftMessageBottomSheet2.mLoading) {
                                    starGiftSheet.performBuyPressed(giftMessageBottomSheet2, (TL_stars.TL_starGiftUnique) chatActivity$$ExternalSyntheticLambda48.f$2, chatActivity$$ExternalSyntheticLambda48.f$4, (AmountUtils$Currency) chatActivity$$ExternalSyntheticLambda48.f$3, textWithEntities, z);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(giftMessageBottomSheet.captionLimitView);
                            break;
                        }
                        break;
                    case 1:
                        GiftMessageBottomSheet giftMessageBottomSheet3 = this.f$0;
                        boolean z2 = giftMessageBottomSheet3.hideMyName;
                        giftMessageBottomSheet3.hideMyName = !z2;
                        giftMessageBottomSheet3.publicCheckboxView.setChecked(z2, true);
                        break;
                    default:
                        this.f$0.lambda$new$3$5(view);
                        break;
                }
            }
        });
        this.containerView.addView(frameLayout, LayoutHelper.createFrame(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.closeButton = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int iDp4 = AndroidUtilities.dp(16.0f);
        ViewGroup viewGroup6 = this.containerView;
        Theme.ResourcesProvider resourcesProvider5 = this.resourcesProvider;
        Paint paint4 = resourcesProvider5 != null ? resourcesProvider5.getPaint("paintChatActionBackground") : null;
        Theme.AnonymousClass7 anonymousClass7 = new Theme.AnonymousClass7(imageView, viewGroup6, iDp4, paint4 == null ? Theme.getThemePaint("paintChatActionBackground") : paint4);
        int iDp5 = AndroidUtilities.dp(32.0f);
        int iDp6 = AndroidUtilities.dp(32.0f);
        Matrix matrix = Blur3Utils.matrixTmp;
        imageView.setBackground(new Theme.AnonymousClass6(anonymousClass7, iDp5, iDp6));
        final int i5 = 2;
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final GiftMessageBottomSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        GiftMessageBottomSheet giftMessageBottomSheet = this.f$0;
                        if (giftMessageBottomSheet.captionLimit - giftMessageBottomSheet.codepointCount >= 0) {
                            ChatActivity$$ExternalSyntheticLambda48 chatActivity$$ExternalSyntheticLambda48 = giftMessageBottomSheet.mCallback;
                            if (chatActivity$$ExternalSyntheticLambda48 != null) {
                                TLRPC.TL_textWithEntities textWithEntities = giftMessageBottomSheet.commentView.getTextWithEntities();
                                boolean z = giftMessageBottomSheet.hideMyName;
                                StarGiftSheet starGiftSheet = (StarGiftSheet) chatActivity$$ExternalSyntheticLambda48.f$0;
                                starGiftSheet.getClass();
                                GiftMessageBottomSheet giftMessageBottomSheet2 = (GiftMessageBottomSheet) chatActivity$$ExternalSyntheticLambda48.f$1;
                                if (!giftMessageBottomSheet2.mLoading) {
                                    starGiftSheet.performBuyPressed(giftMessageBottomSheet2, (TL_stars.TL_starGiftUnique) chatActivity$$ExternalSyntheticLambda48.f$2, chatActivity$$ExternalSyntheticLambda48.f$4, (AmountUtils$Currency) chatActivity$$ExternalSyntheticLambda48.f$3, textWithEntities, z);
                                    break;
                                }
                            }
                        } else {
                            AndroidUtilities.shakeView(giftMessageBottomSheet.captionLimitView);
                            break;
                        }
                        break;
                    case 1:
                        GiftMessageBottomSheet giftMessageBottomSheet3 = this.f$0;
                        boolean z2 = giftMessageBottomSheet3.hideMyName;
                        giftMessageBottomSheet3.hideMyName = !z2;
                        giftMessageBottomSheet3.publicCheckboxView.setChecked(z2, true);
                        break;
                    default:
                        this.f$0.lambda$new$3$5(view);
                        break;
                }
            }
        });
        this.containerView.addView(imageView, LayoutHelper.createFrame(56, 56, 53));
        ScaleStateListAnimator.apply(frameLayout, 0.05f, 1.2f);
        ScaleStateListAnimator.apply(imageView);
        ViewGroup viewGroup7 = this.containerView;
        GiftSheet$$ExternalSyntheticLambda6 giftSheet$$ExternalSyntheticLambda6 = new GiftSheet$$ExternalSyntheticLambda6(this, 14);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(viewGroup7, giftSheet$$ExternalSyntheticLambda6);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void checkUi_GiftLayoutPosition() {
        WindowInsetsStateHolder windowInsetsStateHolder = this.windowInsetsStateHolder;
        WindowInsetsCompat windowInsetsCompat = windowInsetsStateHolder.lastInsets;
        int i = (windowInsetsCompat != null ? windowInsetsCompat.mImpl.getInsets(647) : Insets.NONE).top;
        float fDp = AndroidUtilities.dp(36.0f) + i;
        float inputBubbleHeight = this.chatInputViewsContainer.getInputBubbleHeight() + windowInsetsStateHolder.getAnimatedMaxBottomInset() + AndroidUtilities.dp(9.0f);
        int height = this.containerView.getHeight();
        StarGiftUniqueActionView starGiftUniqueActionView = this.starGiftUniqueActionView;
        float fDp2 = ((fDp - (AndroidUtilities.dp(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - starGiftUniqueActionView.getHeight()) / 2.0f);
        float height2 = (this.containerView.getHeight() - inputBubbleHeight) - AndroidUtilities.dp(14.0f);
        FrameLayout frameLayout = this.publicCheckboxButton;
        starGiftUniqueActionView.setTranslationY(Math.min(fDp2, ((height2 - frameLayout.getHeight()) - AndroidUtilities.dp(10.0f)) - starGiftUniqueActionView.getHeight()));
        starGiftUniqueActionView.invalidate();
        TextView textView = this.previewInChatHeader;
        textView.setTranslationY(starGiftUniqueActionView.getY() - AndroidUtilities.dp(33.0f));
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + AndroidUtilities.dp(14.0f)));
        frameLayout.invalidate();
        ImageView imageView = this.closeButton;
        imageView.setTranslationY(i);
        imageView.invalidate();
    }

    @Override
    public final void lambda$openCrafting$8() {
        AnonymousClass2 anonymousClass2 = this.commentView;
        if (anonymousClass2 == null || !anonymousClass2.isPopupShowing()) {
            super.lambda$openCrafting$8();
        } else {
            anonymousClass2.hidePopup(true);
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        setAllowNestedScroll(false);
        Bulletin.addDelegate(this.container, new Bulletin.Delegate() {
            @Override
            public final boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public final boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public final boolean clipWithGradient(int i) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
            }

            @Override
            public final int getBottomOffset(int i) {
                return Bulletin.Delegate.CC.$default$getBottomOffset(this, i);
            }

            @Override
            public final int getLeftPadding() {
                return Bulletin.Delegate.CC.$default$getLeftPadding(this);
            }

            @Override
            public final int getRightPadding() {
                return Bulletin.Delegate.CC.$default$getRightPadding(this);
            }

            @Override
            public final int getTopOffset(int i) {
                return AndroidUtilities.statusBarHeight;
            }

            @Override
            public final void onBottomOffsetChange(float f) {
                Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
            }

            @Override
            public final void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public final void onShow(Bulletin bulletin) {
                Bulletin.Layout layout = bulletin.getLayout();
                GiftMessageBottomSheet giftMessageBottomSheet = GiftMessageBottomSheet.this;
                BlurredBackgroundDrawable blurredBackgroundDrawableCreate = giftMessageBottomSheet.navbarContentDrawableFactory.create(bulletin.getLayout(), null, true);
                BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder = new BlurredBackgroundProviderBuilder(((BottomSheet) giftMessageBottomSheet).resourcesProvider);
                blurredBackgroundProviderBuilder.backgroundColor = new LivePlayer$$ExternalSyntheticLambda1(13);
                float fDpf2 = AndroidUtilities.dpf2(0.5f);
                float fDpf3 = AndroidUtilities.dpf2(0.5f);
                blurredBackgroundProviderBuilder.strokeWidthTop = fDpf2;
                blurredBackgroundProviderBuilder.strokeWidthBottom = fDpf3;
                blurredBackgroundDrawableCreate.setColorProvider(blurredBackgroundProviderBuilder);
                blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(16.0f));
                layout.setCustomBackground(blurredBackgroundDrawableCreate);
            }
        });
        HintsController.Hint hint = HintsController.Hint.GiftMessageHint;
        if (hint.show()) {
            hint.increment();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(this.toDialogId);
            StringBuilder sb = new StringBuilder();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.gift;
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            BulletinFactory.of(this.container, this.resourcesProvider).createUsersBulletin(userOrChat, LocaleController.getString(R.string.GiftMessageAddTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftMessageAddDescription, DialogObject.getShortName(userOrChat), BillingController$$ExternalSyntheticOutline0.m(tL_starGiftUnique.num, ',', sb)))).show(true);
        }
    }
}
