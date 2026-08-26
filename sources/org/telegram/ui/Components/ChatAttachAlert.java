package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import com.stripe.android.Stripe;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import me.vkryl.android.animator.ListAnimator;
import me.vkryl.android.animator.ReplaceAnimator;
import me.vkryl.core.BitwiseUtils;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline2;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.utils.EphemeralMessagesHelper;
import org.telegram.messenger.utils.FBool;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda21;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda54;
import org.telegram.ui.BoostsActivity$$ExternalSyntheticLambda0;
import org.telegram.ui.Business.BusinessIntroActivity;
import org.telegram.ui.Business.ChatAttachAlertQuickRepliesLayout;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.CallLogActivity;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.PhotoAttachPhotoCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda147;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda211;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda248;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda335;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda470;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda62;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda9;
import org.telegram.ui.Components.ChatAttachAlert.AnonymousClass11;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.BlurredBackgroundWithFadeDrawable;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.chat.layouts.ChatActivityFadeView;
import org.telegram.ui.Components.glass.GlassTabView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.GradientClip;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda121;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda63;
import org.telegram.ui.LinkEditActivity$$ExternalSyntheticLambda5;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda17;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.MessageSendPreview;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda11;
import org.telegram.ui.PassportActivity;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda89;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda12;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda14;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda105;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda73;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.recorder.CaptionContainerView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.WebAppDisclaimerAlert;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda2;
import org.telegram.ui.bots.BotSensors;
import org.telegram.ui.bots.BotWebViewMenuContainer$ActionBarColorsAnimating;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.iv.ChatAttachAlertRichLayout;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda3;
import org.telegram.ui.web.BotWebViewContainer;

public class ChatAttachAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate, BottomSheet.BottomSheetDelegateInterface, FactorAnimator.Target {
    public static final int $r8$clinit = 0;
    public final AnonymousClass2 ATTACH_ALERT_LAYOUT_TRANSLATION;
    public final AnonymousClass2 ATTACH_ALERT_PROGRESS;
    public final AnonymousClass7 actionBar;
    public AnimatorSet actionBarAnimation;
    public final ImageView aiButton;
    public final AiButtonDrawable aiButtonIcon;
    public boolean allowDrawContent;
    public boolean allowEnterCaption;
    public boolean allowLivePhotos;
    public boolean allowOrder;
    public boolean allowPassConfirmationAlert;
    public final BoolAnimator animatorActionBarVisible;
    public final BoolAnimator animatorCaptionAbove;
    public final BoolAnimator animatorCaptionNotEmpty;
    public final BoolAnimator animatorCaptionVisible;
    public final ReplaceAnimator animatorCurrentVisibleLayout;
    public final BoolAnimator animatorEphemeralMessageVisibility;
    public final BoolAnimator animatorToggleCaptionSupported;
    public SpringAnimation appearSpringAnimation;
    public int attachItemSize;
    public ChatAttachAlertAudioLayout audioLayout;
    public ChatAttachAlertAudioLayout.AudioSelectDelegate audioSelectDelegate;
    public int avatarPicker;
    public StarGiftSheet$$ExternalSyntheticLambda105 avatarWithBulletin;
    public final BaseFragment baseFragment;
    public float baseSelectedTextViewTranslationY;
    public final LongSparseArray botAttachLayouts;
    public boolean botButtonProgressWasVisible;
    public boolean botButtonWasVisible;
    public float botMainButtonOffsetY;
    public final AnimatedTextView botMainButtonTextView;
    public final RadialProgressView botProgressView;
    public final BlurredBackgroundWithFadeDrawable bottomFadeDrawable;
    public final AnonymousClass16 bottomFadeView;
    public float bottomPannelTranslation;
    public boolean buttonPressed;
    public final ButtonsAdapter buttonsAdapter;
    public AnimatorSet buttonsAnimation;
    public final LinearLayoutManager buttonsLayoutManager;
    public final AnonymousClass15 buttonsRecyclerView;
    public final AnonymousClass14 buttonsRecyclerViewWrapper;
    public boolean canOpenPreview;
    public boolean captionAbove;
    public final AnonymousClass18 captionContainer;
    public final BlurredBackgroundDrawable captionContainerBg;
    public float captionEditTextTopOffset;
    public boolean captionLimitBulletinShown;
    public final AnimatedTextView captionLimitView;
    public float chatActivityEnterViewAnimateFromTop;
    public int codepointCount;
    public ChatAttachAlertColorsLayout colorsLayout;
    public final AnonymousClass19 commentTextView;
    public final int[] commentTextViewLocation;
    public AnimatorSet commentsAnimator;
    public boolean confirmationAlertShown;
    public ChatAttachAlertContactsLayout contactsLayout;
    public final int currentAccount;
    public AttachAlertLayout currentAttachLayout;
    public int currentLimit;
    public float currentPanTranslationY;
    public CallLogActivity$$ExternalSyntheticLambda3 customStickerHandler;
    public ChatAttachViewDelegate delegate;
    public boolean destroyed;
    public long dialogId;
    public ChatAttachAlertDocumentLayout documentLayout;
    public ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate documentsDelegate;
    public boolean documentsEnabled;
    public final IntroActivity.AnonymousClass4 doneItem;
    public float doneItemAlphaByEnabled;
    public float doneItemAlphaByLayout;
    public int editType;
    public MessageObject editingMessageObject;
    public long effectId;
    public ChatAttachAlertEmojiLayout emojiLayout;
    public final BlurredBackgroundDrawable emojiViewChildBg;
    public ChatAttachAlertPollLayout.AnonymousClass16 emojiViewDelegate;
    public boolean enterCommentEventSent;
    public final ArrayList exclusionRects;
    public final Rect exclustionRect;
    public final ChatActivityFadeView fadeView;
    public final boolean forceDarkTheme;
    public final AnonymousClass17 frameLayout2;
    public float fromScrollY;
    public boolean hasOverridenWebviewBackgroundColor;
    public final AnonymousClass12 headerView;
    public final EmojiView$$ExternalSyntheticLambda18 iBlur3Capture;
    public final BlurredBackgroundDrawableViewFactory iBlur3FactoryFrostedLiquidGlass;
    public final BlurredBackgroundDrawableViewFactory iBlur3FactoryLiquidGlass;
    public final RectF iBlur3PositionActionBar;
    public final RectF iBlur3PositionFastScroll;
    public final RectF iBlur3PositionMainTabs;
    public final ArrayList iBlur3Positions;
    public final ArrayList iBlur3PositionsMerged;
    public final BlurredBackgroundSourceColor iBlur3SourceColor;
    public final BlurredBackgroundSourceRenderNode iBlur3SourceGlass;
    public final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    public final boolean inBubbleMode;
    public boolean isLocationPicker;
    public boolean isPhotoPicker;
    public boolean isPollAttach;
    public boolean isSoundPicker;
    public boolean isStickerMode;
    public boolean isStoryLocationPicker;
    public final AttachAlertLayout[] layouts;
    public ChatAttachAlertLocationLayout.LocationActivityDelegate locationActivityDelegate;
    public ChatAttachAlertLocationLayout locationLayout;
    public int maxSelectedPhotos;
    public final TextView mediaPreviewTextView;
    public final LinearLayout mediaPreviewView;
    public AnonymousClass36 mentionContainer;
    public AnimatorSet menuAnimator;
    public boolean menuShowed;
    public AnonymousClass25 messageSendPreview;
    public HintView2 motionHint;
    public final MotionPhotoDrawable motionIcon;
    public final ActionBarMenuItem motionItem;
    public final ImageView moveCaptionButton;
    public boolean musicEnabled;
    public AttachAlertLayout nextAttachLayout;
    public boolean openTransitionFinished;
    public boolean openWithFrontFaceCamera;
    public final ActionBarMenuItem optionsItem;
    public boolean overrideBackgroundColor;
    public int overridenWebviewBackgroundColor;
    public final Paint paint;
    public ImageUpdater parentImageUpdater;
    public ChatActivity.ThemeDelegate parentThemeDelegate;
    public final PasscodeView passcodeView;
    public boolean paused;
    public final ChatAttachAlertPhotoLayout photoLayout;
    public ChatAttachAlertPhotoLayoutPreview photoPreviewLayout;
    public boolean photosEnabled;
    public boolean pinnedToTop;
    public boolean plainTextEnabled;
    public int pollAllowedLayouts;
    public ChatAttachAlertPollLayout pollLayout;
    public boolean pollsEnabled;
    public int previousScrollOffsetY;
    public ChatAttachAlertQuickRepliesLayout quickRepliesLayout;
    public final RectF rect;
    public boolean restrictEphemeralMessageTypes;
    public ChatAttachRestrictedLayout restrictedLayout;
    public ChatAttachAlertRichLayout richLayout;
    public final int[] scrollOffsetY;
    public final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    public final ActionBarMenuItem searchItem;
    public final ImageView selectedArrowImageView;
    public long selectedId;
    public final ActionBarMenuItem selectedMenuItem;
    public final TextView selectedTextView;
    public final LinearLayout selectedView;
    public boolean sendButtonEnabled;
    public final float sendButtonEnabledProgress;
    public boolean sent;
    public ImageUpdater.AvatarFor setAvatarFor;
    public boolean shownAiButton;
    public final AnonymousClass5 sizeNotifierFrameLayout;
    public ChatAttachAlertEmojiLayout stickersLayout;
    public boolean storyLocationPickerFileIsVideo;
    public double[] storyLocationPickerLatLong;
    public File storyLocationPickerPhotoFile;
    public boolean storyMediaPicker;
    public final TextPaint textPaint;
    public float toScrollY;
    public boolean todoEnabled;
    public ChatAttachAlertPollLayout todoLayout;
    public final ImageView topAiButton;
    public final AiButtonDrawable topAiButtonIcon;
    public ValueAnimator topBackgroundAnimator;
    public final AnimatedTextView topCaptionLimitView;
    public final IntroActivity.AnonymousClass1 topCommentContainer;
    public final AnonymousClass21 topCommentTextView;
    public float translationProgress;
    public boolean typeButtonsAvailable;
    public boolean typeButtonsHidden;
    public boolean videosEnabled;
    public Object viewChangeAnimator;
    public final AnonymousClass24 writeButton;
    public final ChatActivity.AnonymousClass60 writeButtonContainer;

    public final class AnonymousClass1 implements BotWebViewContainer.Delegate {
        public ValueAnimator botButtonAnimator;
        public final long val$id;
        public final String val$startCommand;
        public final ChatAttachAlertBotWebViewLayout val$webViewLayout;

        public AnonymousClass1(ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout, String str, long j) {
            this.val$webViewLayout = chatAttachAlertBotWebViewLayout;
            this.val$startCommand = str;
            this.val$id = j;
        }

        @Override
        public final BotSensors getBotSensors() {
            return null;
        }

        @Override
        public final boolean isClipboardAvailable() {
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            MediaDataController mediaDataController = MediaDataController.getInstance(chatAttachAlert.currentAccount);
            long j = this.val$id;
            return mediaDataController.botInAttachMenu(j) || MessagesController.getInstance(chatAttachAlert.currentAccount).whitelistedBots.contains(Long.valueOf(j));
        }

        @Override
        public final void onCloseRequested() {
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            if (chatAttachAlert.currentAttachLayout != this.val$webViewLayout) {
                return;
            }
            chatAttachAlert.setFocusable(false);
            chatAttachAlert.getWindow().setSoftInputMode(48);
            chatAttachAlert.lambda$showGiftOfferSheet$15();
            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda470(17), 150L);
        }

        @Override
        public final void onCloseToTabs() {
            onCloseRequested();
        }

        @Override
        public final void onEmojiStatusGranted() {
        }

        @Override
        public final void onEmojiStatusSet(TLRPC.Document document) {
        }

        @Override
        public final String onFullscreenRequested(boolean z, boolean z2) {
            return "UNSUPPORTED";
        }

        @Override
        public final void onInstantClose() {
            onCloseRequested();
        }

        @Override
        public final void onLocationGranted(boolean z) {
        }

        @Override
        public final void onOpenBackFromTabs() {
        }

        @Override
        public final void onOrientationLockChanged(boolean z) {
        }

        @Override
        public final void onSendWebViewData(String str) {
        }

        @Override
        public final void onSetBackButtonVisible(boolean z) {
            AndroidUtilities.updateImageViewImageAnimated(ChatAttachAlert.this.actionBar.getBackButton(), z ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
        }

        @Override
        public final void onSetSettingsButtonVisible(boolean z) {
            ActionBarMenuSubItem actionBarMenuSubItem = this.val$webViewLayout.settingsItem;
            if (actionBarMenuSubItem != null) {
                actionBarMenuSubItem.setVisibility(z ? 0 : 8);
            }
        }

        @Override
        public final void onSetupMainButton(final boolean z, boolean z2, String str, long j, int i, int i2, final boolean z3, boolean z4) {
            final int i3 = 1;
            final int i4 = 0;
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            AttachAlertLayout attachAlertLayout = chatAttachAlert.currentAttachLayout;
            ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = this.val$webViewLayout;
            if (attachAlertLayout == chatAttachAlertBotWebViewLayout) {
                if (chatAttachAlertBotWebViewLayout.isBotButtonAvailable || this.val$startCommand != null) {
                    AnimatedTextView animatedTextView = chatAttachAlert.botMainButtonTextView;
                    animatedTextView.setClickable(z2);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (j != 0) {
                        spannableStringBuilder.append((CharSequence) "* ");
                        spannableStringBuilder.append((CharSequence) str);
                        spannableStringBuilder.setSpan(new AnimatedEmojiSpan(j, 1.4f, animatedTextView.getPaint().getFontMetricsInt()), 0, 1, 33);
                        animatedTextView.setText(spannableStringBuilder);
                    } else {
                        animatedTextView.setText(str);
                    }
                    animatedTextView.setTextColor(i2);
                    animatedTextView.setEmojiColor(i2);
                    int i5 = BotWebViewContainer.tags;
                    animatedTextView.setBackground(Theme.createSelectorWithBackgroundDrawable(i, ColorUtils.calculateLuminance(i) >= 0.30000001192092896d ? 301989888 : 385875967));
                    if (chatAttachAlert.botButtonWasVisible != z) {
                        chatAttachAlert.botButtonWasVisible = z;
                        ValueAnimator valueAnimator = this.botButtonAnimator;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator duration = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f).setDuration(250L);
                        this.botButtonAnimator = duration;
                        duration.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 27));
                        this.botButtonAnimator.addListener(new AnimatorListenerAdapter(this) {
                            public final AnonymousClass1 this$1;

                            {
                                this.this$1 = this;
                            }

                            @Override
                            public final void onAnimationEnd(Animator animator) {
                                switch (i4) {
                                    case 0:
                                        AnonymousClass1 anonymousClass1 = this.this$1;
                                        boolean z5 = z;
                                        if (z5) {
                                            ChatAttachAlert.this.buttonsRecyclerViewWrapper.setVisibility(8);
                                        } else {
                                            ChatAttachAlert.this.botMainButtonTextView.setVisibility(8);
                                        }
                                        int iDp = z5 ? AndroidUtilities.dp(36.0f) : 0;
                                        for (int i6 = 0; i6 < ChatAttachAlert.this.botAttachLayouts.size(); i6++) {
                                            ((ChatAttachAlertBotWebViewLayout) ChatAttachAlert.this.botAttachLayouts.valueAt(i6)).setMeasureOffsetY(iDp);
                                        }
                                        if (anonymousClass1.botButtonAnimator == animator) {
                                            anonymousClass1.botButtonAnimator = null;
                                        }
                                        break;
                                    default:
                                        ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                                        boolean z6 = z;
                                        chatAttachAlert2.botButtonProgressWasVisible = z6;
                                        if (!z6) {
                                            chatAttachAlert2.botProgressView.setVisibility(8);
                                        }
                                        break;
                                }
                            }

                            @Override
                            public void onAnimationStart(Animator animator) {
                                switch (i4) {
                                    case 0:
                                        boolean z5 = z;
                                        AnonymousClass1 anonymousClass1 = this.this$1;
                                        if (z5) {
                                            ChatAttachAlert.this.botMainButtonTextView.setAlpha(0.0f);
                                            ChatAttachAlert.this.botMainButtonTextView.setVisibility(0);
                                            int iDp = AndroidUtilities.dp(36.0f);
                                            for (int i6 = 0; i6 < ChatAttachAlert.this.botAttachLayouts.size(); i6++) {
                                                ((ChatAttachAlertBotWebViewLayout) ChatAttachAlert.this.botAttachLayouts.valueAt(i6)).setMeasureOffsetY(iDp);
                                            }
                                        } else {
                                            ChatAttachAlert.this.buttonsRecyclerViewWrapper.setAlpha(0.0f);
                                            ChatAttachAlert.this.buttonsRecyclerViewWrapper.setVisibility(0);
                                        }
                                        break;
                                    default:
                                        super.onAnimationStart(animator);
                                        break;
                                }
                            }
                        });
                        this.botButtonAnimator.start();
                    }
                    RadialProgressView radialProgressView = chatAttachAlert.botProgressView;
                    radialProgressView.setProgressColor(i2);
                    if (chatAttachAlert.botButtonProgressWasVisible != z3) {
                        radialProgressView.animate().cancel();
                        if (z3) {
                            radialProgressView.setAlpha(0.0f);
                            radialProgressView.setVisibility(0);
                        }
                        radialProgressView.animate().alpha(z3 ? 1.0f : 0.0f).scaleX(z3 ? 1.0f : 0.1f).scaleY(z3 ? 1.0f : 0.1f).setDuration(250L).setListener(new AnimatorListenerAdapter(this) {
                            public final AnonymousClass1 this$1;

                            {
                                this.this$1 = this;
                            }

                            @Override
                            public final void onAnimationEnd(Animator animator) {
                                switch (i3) {
                                    case 0:
                                        AnonymousClass1 anonymousClass1 = this.this$1;
                                        boolean z5 = z3;
                                        if (z5) {
                                            ChatAttachAlert.this.buttonsRecyclerViewWrapper.setVisibility(8);
                                        } else {
                                            ChatAttachAlert.this.botMainButtonTextView.setVisibility(8);
                                        }
                                        int iDp = z5 ? AndroidUtilities.dp(36.0f) : 0;
                                        for (int i6 = 0; i6 < ChatAttachAlert.this.botAttachLayouts.size(); i6++) {
                                            ((ChatAttachAlertBotWebViewLayout) ChatAttachAlert.this.botAttachLayouts.valueAt(i6)).setMeasureOffsetY(iDp);
                                        }
                                        if (anonymousClass1.botButtonAnimator == animator) {
                                            anonymousClass1.botButtonAnimator = null;
                                        }
                                        break;
                                    default:
                                        ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                                        boolean z6 = z3;
                                        chatAttachAlert2.botButtonProgressWasVisible = z6;
                                        if (!z6) {
                                            chatAttachAlert2.botProgressView.setVisibility(8);
                                        }
                                        break;
                                }
                            }

                            @Override
                            public void onAnimationStart(Animator animator) {
                                switch (i3) {
                                    case 0:
                                        boolean z5 = z3;
                                        AnonymousClass1 anonymousClass1 = this.this$1;
                                        if (z5) {
                                            ChatAttachAlert.this.botMainButtonTextView.setAlpha(0.0f);
                                            ChatAttachAlert.this.botMainButtonTextView.setVisibility(0);
                                            int iDp = AndroidUtilities.dp(36.0f);
                                            for (int i6 = 0; i6 < ChatAttachAlert.this.botAttachLayouts.size(); i6++) {
                                                ((ChatAttachAlertBotWebViewLayout) ChatAttachAlert.this.botAttachLayouts.valueAt(i6)).setMeasureOffsetY(iDp);
                                            }
                                        } else {
                                            ChatAttachAlert.this.buttonsRecyclerViewWrapper.setAlpha(0.0f);
                                            ChatAttachAlert.this.buttonsRecyclerViewWrapper.setVisibility(0);
                                        }
                                        break;
                                    default:
                                        super.onAnimationStart(animator);
                                        break;
                                }
                            }
                        }).start();
                    }
                }
            }
        }

        @Override
        public final void onSetupSecondaryButton(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4, String str2) {
        }

        @Override
        public final void onSharedTo(ArrayList arrayList) {
        }

        @Override
        public final void onWebAppBackgroundChanged(int i, boolean z) {
        }

        @Override
        public final void onWebAppExpand() {
            AttachAlertLayout attachAlertLayout = ChatAttachAlert.this.currentAttachLayout;
            ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = this.val$webViewLayout;
            if (attachAlertLayout == chatAttachAlertBotWebViewLayout && !chatAttachAlertBotWebViewLayout.swipeContainer.isScrolling) {
                chatAttachAlertBotWebViewLayout.scrollToTop();
            }
        }

        @Override
        public final void onWebAppOpenInvoice(TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, String str, TLObject tLObject) {
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            BaseFragment baseFragment = chatAttachAlert.baseFragment;
            boolean z = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
            ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = this.val$webViewLayout;
            int i = chatAttachAlert.currentAccount;
            PaymentFormActivity paymentFormActivity = null;
            if (z) {
                AlertDialog alertDialog = new AlertDialog(chatAttachAlert.getContext(), 3, null);
                AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 150L);
                StarsController.getInstance(i, false).openPaymentForm(new StarGiftSheet$$ExternalSyntheticLambda73(alertDialog, 2), null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject, new ArticleViewer$$ExternalSyntheticLambda21(23, chatAttachAlertBotWebViewLayout, str));
                AndroidUtilities.hideKeyboard(chatAttachAlertBotWebViewLayout);
                return;
            }
            if (tLObject instanceof TLRPC.PaymentForm) {
                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                MessagesController.getInstance(i).putUsers(paymentForm.users, false);
                paymentFormActivity = new PaymentFormActivity(paymentForm, null, str, baseFragment);
            } else if (tLObject instanceof TLRPC.PaymentReceipt) {
                paymentFormActivity = new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject);
            }
            if (paymentFormActivity != null) {
                chatAttachAlertBotWebViewLayout.scrollToTop();
                AndroidUtilities.hideKeyboard(chatAttachAlertBotWebViewLayout);
                Activity parentActivity = baseFragment.getParentActivity();
                ((BottomSheet) chatAttachAlert).resourcesProvider;
                OverlayActionBarLayoutDialog overlayActionBarLayoutDialog = new OverlayActionBarLayoutDialog(parentActivity);
                overlayActionBarLayoutDialog.show();
                paymentFormActivity.paymentFormCallback = new ChatActivity$$ExternalSyntheticLambda248(overlayActionBarLayoutDialog, chatAttachAlertBotWebViewLayout, str, 26);
                paymentFormActivity.resourcesProvider = ((BottomSheet) chatAttachAlert).resourcesProvider;
                overlayActionBarLayoutDialog.addFragment(paymentFormActivity);
            }
        }

        @Override
        public final void onWebAppSetActionBarColor(int i, final int i2, boolean z) {
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            final int color = chatAttachAlert.iBlur3SourceColor.paint.getColor();
            final BotWebViewMenuContainer$ActionBarColorsAnimating botWebViewMenuContainer$ActionBarColorsAnimating = new BotWebViewMenuContainer$ActionBarColorsAnimating();
            botWebViewMenuContainer$ActionBarColorsAnimating.updateColors(botWebViewMenuContainer$ActionBarColorsAnimating.fromColors, chatAttachAlert.overrideBackgroundColor ? color : 0, ((BottomSheet) chatAttachAlert).resourcesProvider);
            chatAttachAlert.overrideBackgroundColor = z;
            botWebViewMenuContainer$ActionBarColorsAnimating.updateColors(botWebViewMenuContainer$ActionBarColorsAnimating.toColors, z ? i2 : 0, ((BottomSheet) chatAttachAlert).resourcesProvider);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            final ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = this.val$webViewLayout;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ChatAttachAlert.AnonymousClass1 anonymousClass1 = this.f$0;
                    anonymousClass1.getClass();
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int iBlendARGB = ColorUtils.blendARGB(fFloatValue, color, i2);
                    ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                    chatAttachAlert2.overridenWebviewBackgroundColor = iBlendARGB;
                    chatAttachAlert2.hasOverridenWebviewBackgroundColor = true;
                    ChatAttachAlert.AnonymousClass7 anonymousClass7 = chatAttachAlert2.actionBar;
                    if (anonymousClass7 != null) {
                        anonymousClass7.updateColors$1();
                        anonymousClass7.invalidate();
                    }
                    chatAttachAlert2.iBlur3SourceColor.paint.setColor(iBlendARGB);
                    ChatActivityFadeView chatActivityFadeView = chatAttachAlert2.fadeView;
                    if (chatActivityFadeView != null) {
                        chatActivityFadeView.invalidate();
                    }
                    chatAttachAlertBotWebViewLayout.setCustomActionBarBackground(iBlendARGB);
                    chatAttachAlert2.currentAttachLayout.invalidate();
                    chatAttachAlert2.sizeNotifierFrameLayout.invalidate();
                    botWebViewMenuContainer$ActionBarColorsAnimating.updateActionBar(anonymousClass7, fFloatValue);
                }
            });
            duration.start();
        }

        @Override
        public final void onWebAppSetBackgroundColor(int i) {
            this.val$webViewLayout.setCustomBackground(i);
        }

        @Override
        public final void onWebAppSetNavigationBarColor(int i) {
        }

        @Override
        public final void onWebAppSetupClosingBehavior(boolean z) {
            this.val$webViewLayout.setNeedCloseConfirmation(z);
        }

        @Override
        public final void onWebAppSwipingBehavior(boolean z) {
            this.val$webViewLayout.setAllowSwipes(z);
        }

        @Override
        public final void onWebAppSwitchInlineQuery(TLRPC.User user, String str, ArrayList arrayList) {
            boolean zIsEmpty = arrayList.isEmpty();
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            if (zIsEmpty) {
                BaseFragment baseFragment = chatAttachAlert.baseFragment;
                if (baseFragment instanceof ChatActivity) {
                    ((ChatActivity) baseFragment).chatActivityEnterView.setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
                }
                chatAttachAlert.dismiss(true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("dialogsType", 14);
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("allowGroups", arrayList.contains("groups"));
            bundle.putBoolean("allowLegacyGroups", arrayList.contains("groups"));
            bundle.putBoolean("allowMegagroups", arrayList.contains("groups"));
            bundle.putBoolean("allowUsers", arrayList.contains("users"));
            bundle.putBoolean("allowChannels", arrayList.contains("channels"));
            bundle.putBoolean("allowBots", arrayList.contains("bots"));
            DialogsActivity dialogsActivity = new DialogsActivity(bundle);
            Context context = chatAttachAlert.getContext();
            ((BottomSheet) chatAttachAlert).resourcesProvider;
            OverlayActionBarLayoutDialog overlayActionBarLayoutDialog = new OverlayActionBarLayoutDialog(context);
            dialogsActivity.delegate = new ArticleViewer$$ExternalSyntheticLambda54((Object) this, (Object) user, str, (Object) overlayActionBarLayoutDialog, 6);
            overlayActionBarLayoutDialog.show();
            overlayActionBarLayoutDialog.addFragment(dialogsActivity);
        }
    }

    public final class AnonymousClass11 extends PhotoViewer.EmptyPhotoViewerProvider {
        public final MediaController.PhotoEntry val$entry;

        public AnonymousClass11(MediaController.PhotoEntry photoEntry) {
            this.val$entry = photoEntry;
        }

        @Override
        public final void sendButtonPressed(int i, VideoEditedInfo videoEditedInfo, final boolean z, final int i2, int i3, final boolean z2) {
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            chatAttachAlert.sent = true;
            if (chatAttachAlert.delegate == null) {
                return;
            }
            final MediaController.PhotoEntry photoEntry = this.val$entry;
            photoEntry.editedInfo = videoEditedInfo;
            AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, 0L, chatAttachAlert.getAdditionalMessagesCount() + 1, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    ChatAttachAlert.AnonymousClass11 anonymousClass11 = this.f$0;
                    anonymousClass11.getClass();
                    ArrayList arrayList = ChatAttachAlertPhotoLayout.selectedPhotosOrder;
                    arrayList.clear();
                    HashMap map = ChatAttachAlertPhotoLayout.selectedPhotos;
                    map.clear();
                    arrayList.add(0);
                    map.put(0, photoEntry);
                    ChatAttachAlert.ChatAttachViewDelegate chatAttachViewDelegate = ChatAttachAlert.this.delegate;
                    long jLongValue = ((Long) obj).longValue();
                    chatAttachViewDelegate.didPressedButton(7, true, z, i2, 0, 0L, false, z2, jLongValue);
                }
            }, 0L);
        }
    }

    public final class AnonymousClass12 extends FrameLayout {
        public AnonymousClass12(Context context) {
            super(context);
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (ChatAttachAlert.this.headerView.getVisibility() != 0) {
                return false;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (ChatAttachAlert.this.headerView.getVisibility() != 0) {
                return false;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        public final void setAlpha(float f) {
            super.setAlpha(f);
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            chatAttachAlert.updateSelectedPosition(0);
            ((BottomSheet) chatAttachAlert).containerView.invalidate();
        }
    }

    public final class AnonymousClass14 extends FrameLayout {
        public AnonymousClass14(Context context) {
            super(context);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            if (!chatAttachAlert.isPollAttach || chatAttachAlert.pollAllowedLayouts == 0) {
                super.onMeasure(i, i2);
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), AndroidUtilities.dp(36.0f) + (AndroidUtilities.dp(80.0f) * Integer.bitCount(chatAttachAlert.pollAllowedLayouts))), 1073741824), i2);
        }

        @Override
        public final void setTranslationY(float f) {
            super.setTranslationY(f);
            ChatAttachAlert.this.currentAttachLayout.onButtonsTranslationYUpdated();
        }
    }

    public final class AnonymousClass15 extends RecyclerListView {
        public final int $r8$classId;
        public final Object hasFadeLeft;
        public final Object hasFadeRight;
        public boolean mHasFadeLeft;
        public boolean mHasFadeRight;
        public final Paint paintLeft;
        public final Paint paintRight;

        public AnonymousClass15(Context context, int i) {
            super(context, null);
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    super(context, null);
                    Paint paint = new Paint(1);
                    this.paintLeft = paint;
                    Paint paint2 = new Paint(1);
                    this.paintRight = paint2;
                    this.hasFadeLeft = new AnimatedFloat(this);
                    this.hasFadeRight = new AnimatedFloat(this);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode));
                    paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode));
                    break;
                default:
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                    this.hasFadeLeft = new BoolAnimator(320L, this, cubicBezierInterpolator);
                    this.hasFadeRight = new BoolAnimator(320L, this, cubicBezierInterpolator);
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{0, -16777216}, (float[]) null, tileMode2);
                    LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(8.0f), 0.0f, new int[]{-16777216, 0}, (float[]) null, tileMode2);
                    Paint paint3 = new Paint(1);
                    this.paintLeft = paint3;
                    Paint paint4 = new Paint(1);
                    this.paintRight = paint4;
                    paint3.setShader(linearGradient);
                    PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                    paint3.setXfermode(new PorterDuffXfermode(mode));
                    paint4.setShader(linearGradient2);
                    paint4.setXfermode(new PorterDuffXfermode(mode));
                    break;
            }
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    this.mHasFadeRight = false;
                    this.mHasFadeLeft = false;
                    super.dispatchDraw(canvas);
                    ((BoolAnimator) this.hasFadeLeft).setValue(this.mHasFadeLeft, true);
                    ((BoolAnimator) this.hasFadeRight).setValue(this.mHasFadeRight, true);
                    break;
                default:
                    super.dispatchDraw(canvas);
                    float f = ((AnimatedFloat) this.hasFadeLeft).set(this.mHasFadeLeft ? 1.0f : 0.0f, false);
                    Paint paint = this.paintLeft;
                    paint.setAlpha((int) (f * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f), paint);
                    float f2 = ((AnimatedFloat) this.hasFadeRight).set(this.mHasFadeRight ? 1.0f : 0.0f, false);
                    Paint paint2 = this.paintRight;
                    paint2.setAlpha((int) (f2 * 255.0f));
                    canvas.save();
                    canvas.translate(0.0f, getHeight() - AndroidUtilities.dp(8.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f), paint2);
                    canvas.restore();
                    break;
            }
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            switch (this.$r8$classId) {
                case 0:
                    float x = view.getX();
                    float width = view.getWidth() + x;
                    boolean z = true;
                    boolean z2 = x < ((float) AndroidUtilities.dp(10.0f));
                    boolean z3 = width > ((float) (getMeasuredWidth() - AndroidUtilities.dp(10.0f)));
                    if (!z2 && !z3) {
                        z = false;
                    }
                    this.mHasFadeLeft |= z2;
                    this.mHasFadeRight |= z3;
                    canvas.save();
                    if (z) {
                        canvas.clipRect(AndroidUtilities.dp(19.0f), 0, getMeasuredWidth() - AndroidUtilities.dp(19.0f), getMeasuredHeight());
                    }
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    if (z2) {
                        float fDp = AndroidUtilities.dp(11.0f);
                        canvas.saveLayer(fDp, getPaddingTop(), AndroidUtilities.dp(19.0f), getMeasuredHeight() - getPaddingBottom(), null);
                        super.drawChild(canvas, view, j);
                        canvas.save();
                        canvas.translate(BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, ((BoolAnimator) this.hasFadeLeft).floatValue, AndroidUtilities.dp(8.0f), fDp), 0.0f);
                        canvas.drawPaint(this.paintLeft);
                        canvas.restore();
                        canvas.restore();
                    }
                    if (z3) {
                        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(19.0f);
                        canvas.saveLayer(measuredWidth, getPaddingTop(), getMeasuredWidth() - AndroidUtilities.dp(11.0f), getMeasuredHeight() - getPaddingBottom(), null);
                        super.drawChild(canvas, view, j);
                        canvas.save();
                        canvas.translate(DiffUtil.m(1.0f, ((BoolAnimator) this.hasFadeRight).floatValue, AndroidUtilities.dp(8.0f), measuredWidth), 0.0f);
                        canvas.drawPaint(this.paintRight);
                        canvas.restore();
                        canvas.restore();
                    }
                    return zDrawChild;
                default:
                    return super.drawChild(canvas, view, j);
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    int childCount = getChildCount();
                    int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
                    float fMeasureAttachTabWidth = 0.0f;
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = getChildAt(i3);
                        if (childAt instanceof AttachButtonBase) {
                            fMeasureAttachTabWidth = ((AttachButtonBase) childAt).glassTabView.measureAttachTabWidth() + fMeasureAttachTabWidth;
                        }
                    }
                    float f = size;
                    int iFloor = (f <= fMeasureAttachTabWidth || childCount <= 0) ? 0 : (int) Math.floor((f - fMeasureAttachTabWidth) / childCount);
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt2 = getChildAt(i4);
                        if (childAt2 instanceof AttachButtonBase) {
                            ((AttachButtonBase) childAt2).glassTabView.setAdditionalWidth(iFloor);
                        }
                    }
                    super.onMeasure(i, i2);
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public void onScrolled(int i, int i2) {
            switch (this.$r8$classId) {
                case 1:
                    boolean zCanScrollVertically = canScrollVertically(-1);
                    boolean zCanScrollVertically2 = canScrollVertically(1);
                    if (zCanScrollVertically != this.mHasFadeLeft || zCanScrollVertically2 != this.mHasFadeRight) {
                        this.mHasFadeLeft = zCanScrollVertically;
                        this.mHasFadeRight = zCanScrollVertically2;
                        invalidate();
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass17 extends FrameLayout {
        public AnonymousClass17(Context context) {
            super(context);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            canvas.save();
            canvas.clipRect(0.0f, ChatAttachAlert.this.captionEditTextTopOffset, getMeasuredWidth(), getMeasuredHeight());
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            if (chatAttachAlert.captionContainer.getAlpha() <= 0.0f) {
                return;
            }
            float f = chatAttachAlert.chatActivityEnterViewAnimateFromTop;
            if (f != 0.0f) {
                AnonymousClass17 anonymousClass17 = chatAttachAlert.frameLayout2;
                if (f != anonymousClass17.getTop() + chatAttachAlert.chatActivityEnterViewAnimateFromTop) {
                    ValueAnimator valueAnimator = chatAttachAlert.topBackgroundAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float top = chatAttachAlert.chatActivityEnterViewAnimateFromTop - (anonymousClass17.getTop() + chatAttachAlert.captionEditTextTopOffset);
                    chatAttachAlert.captionEditTextTopOffset = top;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(top, 0.0f);
                    chatAttachAlert.topBackgroundAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 28));
                    chatAttachAlert.topBackgroundAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    chatAttachAlert.topBackgroundAnimator.setDuration(200L);
                    chatAttachAlert.topBackgroundAnimator.start();
                    chatAttachAlert.chatActivityEnterViewAnimateFromTop = 0.0f;
                }
            }
        }

        @Override
        public final void setAlpha(float f) {
            super.setAlpha(f);
            invalidate();
        }
    }

    public final class AnonymousClass19 extends EditTextEmoji {
        public ValueAnimator messageEditTextAnimator;
        public int messageEditTextPredrawHeigth;
        public int messageEditTextPredrawScrollY;
        public boolean shouldAnimateEditTextWithBounds;

        public AnonymousClass19(Context context, AnonymousClass5 anonymousClass5, Theme.ResourcesProvider resourcesProvider) {
            super(context, anonymousClass5, null, 1, true, resourcesProvider);
        }

        @Override
        public final void bottomPanelTranslationY(float f) {
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            chatAttachAlert.bottomPannelTranslation = f;
            chatAttachAlert.frameLayout2.setTranslationY(f);
            chatAttachAlert.frameLayout2.invalidate();
            chatAttachAlert.checkUi_writeButtonContainerY();
            chatAttachAlert.updateLayout(chatAttachAlert.currentAttachLayout, true, 0);
        }

        @Override
        public final void closeParent() {
            ChatAttachAlert.super.lambda$showGiftOfferSheet$15();
        }

        @Override
        public final void createEmojiView() {
            super.createEmojiView();
            EmojiView emojiView = getEmojiView();
            if (emojiView != null) {
                emojiView.shouldLightenBackground = false;
                emojiView.fixBottomTabContainerTranslation = false;
                emojiView.setShouldDrawBackground(false);
                emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
            }
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            if (this.shouldAnimateEditTextWithBounds) {
                EditTextCaption editText = ChatAttachAlert.this.commentTextView.getEditText();
                editText.setOffsetY(editText.getOffsetY() - ((this.messageEditTextPredrawScrollY - editText.getScrollY()) + (this.messageEditTextPredrawHeigth - editText.getMeasuredHeight())));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
                valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda14(11, this, editText));
                ValueAnimator valueAnimator = this.messageEditTextAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.messageEditTextAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.setDuration(200L);
                valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                valueAnimatorOfFloat.start();
                this.shouldAnimateEditTextWithBounds = false;
            }
            super.dispatchDraw(canvas);
        }

        @Override
        public final void extendActionMode(Menu menu) {
            BaseFragment baseFragment = ChatAttachAlert.this.baseFragment;
            if (baseFragment instanceof ChatActivity) {
                ChatActivity.fillActionModeMenu(menu, ((ChatActivity) baseFragment).currentEncryptedChat, true, true, true, true);
            }
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            if (!chatAttachAlert.enterCommentEventSent) {
                float x = motionEvent.getX();
                AnonymousClass19 anonymousClass19 = chatAttachAlert.commentTextView;
                if (x <= anonymousClass19.getEditText().getLeft() || motionEvent.getX() >= anonymousClass19.getEditText().getRight() || motionEvent.getY() <= anonymousClass19.getEditText().getTop() || motionEvent.getY() >= anonymousClass19.getEditText().getBottom()) {
                    chatAttachAlert.makeFocusable(anonymousClass19.getEditText(), false);
                } else {
                    chatAttachAlert.makeFocusable(anonymousClass19.getEditText(), true);
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ChatAttachAlert.this.updateCommentTextViewPosition();
        }

        @Override
        public final void onLineCountChanged(int i, int i2) {
            boolean z = false;
            if (TextUtils.isEmpty(getEditText().getText())) {
                getEditText().animate().cancel();
                getEditText().setOffsetY(0.0f);
                this.shouldAnimateEditTextWithBounds = false;
            } else {
                this.shouldAnimateEditTextWithBounds = true;
                this.messageEditTextPredrawHeigth = getEditText().getMeasuredHeight();
                this.messageEditTextPredrawScrollY = getEditText().getScrollY();
                invalidate();
            }
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            if (!chatAttachAlert.captionAbove) {
                if (i2 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                    z = true;
                }
                chatAttachAlert.showAiButton$1(z);
            }
            chatAttachAlert.chatActivityEnterViewAnimateFromTop = chatAttachAlert.frameLayout2.getTop() + chatAttachAlert.captionEditTextTopOffset;
            chatAttachAlert.frameLayout2.invalidate();
            chatAttachAlert.updateCommentTextViewPosition();
        }
    }

    public final class AnonymousClass2 extends AnimationProperties.IntProperty {
        public final int $r8$classId;
        public final ChatAttachAlert this$0;

        public AnonymousClass2(ChatAttachAlert chatAttachAlert, int i) {
            super("translation", 1);
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    this.this$0 = chatAttachAlert;
                    super("openProgress", 1);
                    break;
                default:
                    this.this$0 = chatAttachAlert;
                    break;
            }
        }

        @Override
        public final Object get(Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    return Float.valueOf(this.this$0.translationProgress);
                default:
                    return Float.valueOf(0.0f);
            }
        }

        @Override
        public final void setValue(Object obj, float f) {
            float interpolation;
            switch (this.$r8$classId) {
                case 0:
                    ChatAttachAlert chatAttachAlert = this.this$0;
                    chatAttachAlert.translationProgress = f;
                    AttachAlertLayout attachAlertLayout = chatAttachAlert.nextAttachLayout;
                    if (attachAlertLayout != null) {
                        if ((attachAlertLayout instanceof ChatAttachAlertPhotoLayoutPreview) || (chatAttachAlert.currentAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview)) {
                            int iMax = Math.max(attachAlertLayout.getWidth(), chatAttachAlert.currentAttachLayout.getWidth());
                            if (chatAttachAlert.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview) {
                                chatAttachAlert.currentAttachLayout.setTranslationX((-iMax) * f);
                                chatAttachAlert.nextAttachLayout.setTranslationX((1.0f - f) * iMax);
                            } else {
                                chatAttachAlert.currentAttachLayout.setTranslationX(iMax * f);
                                chatAttachAlert.nextAttachLayout.setTranslationX((1.0f - f) * (-iMax));
                            }
                        } else {
                            attachAlertLayout.setAlpha(f);
                            chatAttachAlert.nextAttachLayout.onHideShowProgress(f);
                            AttachAlertLayout attachAlertLayout2 = chatAttachAlert.nextAttachLayout;
                            ChatAttachAlertPollLayout chatAttachAlertPollLayout = chatAttachAlert.pollLayout;
                            if (attachAlertLayout2 == chatAttachAlertPollLayout || chatAttachAlert.currentAttachLayout == chatAttachAlertPollLayout) {
                                chatAttachAlert.updateSelectedPosition(attachAlertLayout2 == chatAttachAlertPollLayout ? 1 : 0);
                            }
                            AttachAlertLayout attachAlertLayout3 = chatAttachAlert.nextAttachLayout;
                            ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = chatAttachAlert.todoLayout;
                            if (attachAlertLayout3 == chatAttachAlertPollLayout2 || chatAttachAlert.currentAttachLayout == chatAttachAlertPollLayout2) {
                                chatAttachAlert.updateSelectedPosition(attachAlertLayout3 == chatAttachAlertPollLayout2 ? 1 : 0);
                            }
                            chatAttachAlert.nextAttachLayout.setTranslationY(AndroidUtilities.dp(78.0f) * f);
                            chatAttachAlert.currentAttachLayout.onHideShowProgress(1.0f - Math.min(1.0f, f / 0.7f));
                            chatAttachAlert.currentAttachLayout.onContainerTranslationUpdated(chatAttachAlert.currentPanTranslationY);
                        }
                        if (chatAttachAlert.viewChangeAnimator != null) {
                            chatAttachAlert.updateSelectedPosition(1);
                        }
                        chatAttachAlert.blur3_InvalidateBlur$1();
                        ((BottomSheet) chatAttachAlert).containerView.invalidate();
                        break;
                    }
                    break;
                default:
                    ChatAttachAlert chatAttachAlert2 = this.this$0;
                    int childCount = chatAttachAlert2.buttonsRecyclerView.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        float f2 = (3 - i) * 32.0f;
                        View childAt = chatAttachAlert2.buttonsRecyclerView.getChildAt(i);
                        if (f > f2) {
                            float f3 = f - f2;
                            if (f3 <= 200.0f) {
                                float f4 = f3 / 200.0f;
                                interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(f4) * 1.1f;
                                childAt.setAlpha(CubicBezierInterpolator.EASE_BOTH.getInterpolation(f4));
                            } else {
                                childAt.setAlpha(1.0f);
                                float f5 = f3 - 200.0f;
                                interpolation = f5 <= 100.0f ? 1.1f - (CubicBezierInterpolator.EASE_IN.getInterpolation(f5 / 100.0f) * 0.1f) : 1.0f;
                            }
                        } else {
                            interpolation = 0.0f;
                        }
                        if (childAt instanceof AttachButtonBase) {
                            ((AttachButtonBase) childAt).glassTabView.setAttachScale(interpolation);
                        }
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass20 implements TextWatcher {
        public boolean processChange;
        public boolean wasEmpty;

        public AnonymousClass20() {
        }

        @Override
        public final void afterTextChanged(Editable editable) {
            boolean z;
            int i;
            boolean z2 = this.wasEmpty;
            boolean zIsEmpty = TextUtils.isEmpty(editable);
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            if (z2 != zIsEmpty) {
                AttachAlertLayout attachAlertLayout = chatAttachAlert.currentAttachLayout;
                if (attachAlertLayout != null) {
                    attachAlertLayout.onSelectedItemsCountChanged(attachAlertLayout.getSelectedItemsCount());
                }
                this.wasEmpty = !this.wasEmpty;
            }
            boolean z3 = this.processChange;
            AnonymousClass19 anonymousClass19 = chatAttachAlert.commentTextView;
            boolean z4 = false;
            if (z3) {
                for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                    editable.removeSpan(imageSpan);
                }
                Emoji.replaceEmoji(editable, anonymousClass19.getEditText().getPaint().getFontMetricsInt(), false);
                this.processChange = false;
            }
            int iCodePointCount = Character.codePointCount(editable, 0, editable.length());
            chatAttachAlert.codepointCount = iCodePointCount;
            chatAttachAlert.animatorCaptionNotEmpty.setValue(iCodePointCount > 0, true);
            int i2 = chatAttachAlert.currentLimit;
            AnimatedTextView animatedTextView = chatAttachAlert.captionLimitView;
            AnimatedTextView animatedTextView2 = chatAttachAlert.topCaptionLimitView;
            if (i2 <= 0 || (i = i2 - chatAttachAlert.codepointCount) > 100) {
                animatedTextView.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new CheckBox.AnonymousClass1(this, 13));
                animatedTextView2.setAlpha(0.0f);
                z = true;
            } else {
                if (i < -9999) {
                    i = -9999;
                }
                long j = i;
                animatedTextView.setText(LocaleController.formatNumber(j, ','), animatedTextView.getVisibility() == 0, true);
                if (animatedTextView.getVisibility() != 0) {
                    animatedTextView.setVisibility(0);
                    animatedTextView.setAlpha(0.0f);
                    animatedTextView.setScaleX(0.5f);
                    animatedTextView.setScaleY(0.5f);
                }
                animatedTextView.animate().setListener(null).cancel();
                animatedTextView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                if (i < 0) {
                    animatedTextView.setTextColor(chatAttachAlert.getThemedColor(Theme.key_text_RedRegular));
                    z = false;
                } else {
                    animatedTextView.setTextColor(chatAttachAlert.getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
                    z = true;
                }
                animatedTextView2.setText(LocaleController.formatNumber(j, ','), false, true);
                animatedTextView2.setAlpha(1.0f);
            }
            if (chatAttachAlert.sendButtonEnabled != z) {
                chatAttachAlert.sendButtonEnabled = z;
                chatAttachAlert.writeButton.invalidate();
            }
            if (!chatAttachAlert.captionAbove) {
                if (anonymousClass19.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(anonymousClass19.getText().toString().trim())) {
                    z4 = true;
                }
                chatAttachAlert.showAiButton$1(z4);
            }
            chatAttachAlert.checkIsEphemeralMessage$1(true);
        }

        @Override
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (i3 - i2 >= 1) {
                this.processChange = true;
            }
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            if (chatAttachAlert.mentionContainer == null) {
                ChatAttachAlert.access$13500(chatAttachAlert);
            }
            if (chatAttachAlert.mentionContainer.getAdapter() != null) {
                chatAttachAlert.mentionContainer.setReversed(false);
                chatAttachAlert.mentionContainer.getAdapter().searchUsernameOrHashtag(charSequence, chatAttachAlert.commentTextView.getEditText().getSelectionStart(), null, false, false);
                chatAttachAlert.updateCommentTextViewPosition();
            }
        }
    }

    public final class AnonymousClass22 implements TextWatcher {
        public boolean processChange;
        public final BaseFragment val$parentFragment;
        public boolean wasEmpty;

        public AnonymousClass22(BaseFragment baseFragment) {
            this.val$parentFragment = baseFragment;
        }

        @Override
        public final void afterTextChanged(Editable editable) {
            boolean z;
            int i;
            boolean z2 = this.wasEmpty;
            boolean zIsEmpty = TextUtils.isEmpty(editable);
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            if (z2 != zIsEmpty) {
                AttachAlertLayout attachAlertLayout = chatAttachAlert.currentAttachLayout;
                if (attachAlertLayout != null) {
                    attachAlertLayout.onSelectedItemsCountChanged(attachAlertLayout.getSelectedItemsCount());
                }
                this.wasEmpty = !this.wasEmpty;
            }
            boolean z3 = this.processChange;
            AnonymousClass21 anonymousClass21 = chatAttachAlert.topCommentTextView;
            boolean z4 = false;
            if (z3) {
                for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                    editable.removeSpan(imageSpan);
                }
                Emoji.replaceEmoji(editable, anonymousClass21.getEditText().getPaint().getFontMetricsInt(), false);
                this.processChange = false;
            }
            int iCodePointCount = Character.codePointCount(editable, 0, editable.length());
            chatAttachAlert.codepointCount = iCodePointCount;
            chatAttachAlert.animatorCaptionNotEmpty.setValue(iCodePointCount > 0, true);
            int i2 = chatAttachAlert.currentLimit;
            AnimatedTextView animatedTextView = chatAttachAlert.topCaptionLimitView;
            AnimatedTextView animatedTextView2 = chatAttachAlert.captionLimitView;
            if (i2 <= 0 || (i = i2 - chatAttachAlert.codepointCount) > 100) {
                animatedTextView.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new CheckBox.AnonymousClass1(this, 14));
                animatedTextView2.setAlpha(0.0f);
                z = true;
            } else {
                if (i < -9999) {
                    i = -9999;
                }
                long j = i;
                animatedTextView.setText(LocaleController.formatNumber(j, ','), animatedTextView.getVisibility() == 0, true);
                if (animatedTextView.getVisibility() != 0) {
                    animatedTextView.setVisibility(0);
                    animatedTextView.setAlpha(0.0f);
                    animatedTextView.setScaleX(0.5f);
                    animatedTextView.setScaleY(0.5f);
                }
                animatedTextView.animate().setListener(null).cancel();
                animatedTextView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                if (i < 0) {
                    animatedTextView.setTextColor(chatAttachAlert.getThemedColor(Theme.key_text_RedRegular));
                    z = false;
                } else {
                    animatedTextView.setTextColor(chatAttachAlert.getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
                    z = true;
                }
                animatedTextView2.setText(LocaleController.formatNumber(j, ','), false, true);
                animatedTextView2.setAlpha(1.0f);
            }
            if (chatAttachAlert.sendButtonEnabled != z) {
                chatAttachAlert.sendButtonEnabled = z;
                chatAttachAlert.writeButton.invalidate();
            }
            if (!chatAttachAlert.captionLimitBulletinShown) {
                int i3 = chatAttachAlert.currentAccount;
                if (!MessagesController.getInstance(i3).premiumFeaturesBlocked() && !UserConfig.getInstance(i3).isPremium() && chatAttachAlert.codepointCount > MessagesController.getInstance(i3).captionLengthLimitDefault && chatAttachAlert.codepointCount < MessagesController.getInstance(i3).captionLengthLimitPremium) {
                    chatAttachAlert.captionLimitBulletinShown = true;
                    chatAttachAlert.showCaptionLimitBulletin(this.val$parentFragment);
                }
            }
            if (chatAttachAlert.captionAbove) {
                if (anonymousClass21.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(anonymousClass21.getText().toString().trim())) {
                    z4 = true;
                }
                chatAttachAlert.showAiButton$1(z4);
            }
            chatAttachAlert.checkIsEphemeralMessage$1(true);
        }

        @Override
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (i3 - i2 >= 1) {
                this.processChange = true;
            }
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            if (chatAttachAlert.mentionContainer == null) {
                ChatAttachAlert.access$13500(chatAttachAlert);
            }
            if (chatAttachAlert.mentionContainer.getAdapter() != null) {
                chatAttachAlert.mentionContainer.setReversed(true);
                chatAttachAlert.mentionContainer.getAdapter().searchUsernameOrHashtag(charSequence, chatAttachAlert.topCommentTextView.getEditText().getSelectionStart(), null, false, false);
                chatAttachAlert.updateCommentTextViewPosition();
            }
        }
    }

    public final class AnonymousClass25 extends MessageSendPreview {
        public final int $r8$classId = 0;
        public final Object this$0;

        public AnonymousClass25(Context context, Theme.ResourcesProvider resourcesProvider, ChatAttachAlert chatAttachAlert) {
            super(context, resourcesProvider);
            this.this$0 = chatAttachAlert;
        }

        @Override
        public final void onEffectChange(long j) {
            switch (this.$r8$classId) {
                case 0:
                    ChatAttachAlert chatAttachAlert = (ChatAttachAlert) this.this$0;
                    AnonymousClass24 anonymousClass24 = chatAttachAlert.writeButton;
                    chatAttachAlert.effectId = j;
                    anonymousClass24.setEffect(j);
                    break;
                default:
                    ((ChatActivityEnterView) this.this$0).setEffectId(j);
                    break;
            }
        }

        public AnonymousClass25(ChatActivityEnterView chatActivityEnterView, Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            this.this$0 = chatActivityEnterView;
        }
    }

    public final class AnonymousClass36 extends MentionsContainerView {
        public final int $r8$classId;
        public final KeyEvent.Callback this$0;

        public AnonymousClass36(KeyEvent.Callback callback, Context context, long j, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, int i) {
            super(context, j, 0L, baseFragment, resourcesProvider);
            this.$r8$classId = i;
            this.this$0 = callback;
        }

        @Override
        public void drawRoundRect(Canvas canvas, Rect rect, float f) {
            switch (this.$r8$classId) {
                case 1:
                    CaptionContainerView captionContainerView = (CaptionContainerView) this.this$0;
                    RectF rectF = captionContainerView.rectF;
                    rectF.set(rect);
                    if (!captionContainerView.customBlur()) {
                        Paint paint$1 = captionContainerView.mentionBackgroundBlur.getPaint$1(1.0f);
                        Paint paint = captionContainerView.backgroundPaint;
                        if (paint$1 != null) {
                            canvas.drawRoundRect(rectF, f, f, paint$1);
                            paint.setAlpha(80);
                            canvas.drawRoundRect(rectF, f, f, paint);
                        } else {
                            paint.setAlpha(128);
                            canvas.drawRoundRect(rectF, f, f, paint);
                        }
                    } else {
                        captionContainerView.drawBlur(captionContainerView.mentionBackgroundBlur, canvas, rectF, f, false, -captionContainerView.mentionContainer.getX(), -captionContainerView.mentionContainer.getY(), false);
                    }
                    break;
                default:
                    super.drawRoundRect(canvas, rect, f);
                    break;
            }
        }

        @Override
        public boolean isStories() {
            switch (this.$r8$classId) {
                case 1:
                    return true;
                default:
                    return super.isStories();
            }
        }

        @Override
        public void onAnimationScroll() {
            switch (this.$r8$classId) {
                case 0:
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ChatAttachAlert) this.this$0).photoLayout;
                    if (chatAttachAlertPhotoLayout != null) {
                        chatAttachAlertPhotoLayout.checkCameraViewPosition();
                    }
                    break;
            }
        }

        @Override
        public void onScrolled(boolean z) {
            switch (this.$r8$classId) {
                case 0:
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((ChatAttachAlert) this.this$0).photoLayout;
                    if (chatAttachAlertPhotoLayout != null) {
                        chatAttachAlertPhotoLayout.checkCameraViewPosition();
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass5 extends SizeNotifierFrameLayout {
        public final AnonymousClass2 adjustPanLayoutHelper;
        public boolean ignoreLayout;
        public float initialTranslationY;
        public int lastNotifyWidth;
        public final RectF rect;

        public AnonymousClass5(Context context) {
            super(context, null);
            this.rect = new RectF();
            this.adjustPanLayoutHelper = new AdjustPanLayoutHelper(this) {
                @Override
                public final boolean heightAnimationEnabled() {
                    EmojiView emojiView;
                    AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                    if (ChatAttachAlert.this.isDismissed()) {
                        return false;
                    }
                    ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                    if (!chatAttachAlert.openTransitionFinished) {
                        return false;
                    }
                    AttachAlertLayout attachAlertLayout = chatAttachAlert.currentAttachLayout;
                    if (attachAlertLayout != chatAttachAlert.pollLayout && attachAlertLayout != chatAttachAlert.todoLayout && !chatAttachAlert.getCommentView().isPopupVisible()) {
                        return true;
                    }
                    AttachAlertLayout attachAlertLayout2 = chatAttachAlert.currentAttachLayout;
                    ChatAttachAlertPollLayout chatAttachAlertPollLayout = chatAttachAlert.pollLayout;
                    if (attachAlertLayout2 == chatAttachAlertPollLayout && ((emojiView = chatAttachAlertPollLayout.emojiView) == null || emojiView.getVisibility() != 0)) {
                        return true;
                    }
                    AttachAlertLayout attachAlertLayout3 = chatAttachAlert.currentAttachLayout;
                    ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = chatAttachAlert.todoLayout;
                    if (attachAlertLayout3 != chatAttachAlertPollLayout2) {
                        return false;
                    }
                    EmojiView emojiView2 = chatAttachAlertPollLayout2.emojiView;
                    return emojiView2 == null || emojiView2.getVisibility() != 0;
                }

                @Override
                public final void onPanTranslationUpdate(float f, float f2, boolean z) {
                    AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                    ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                    chatAttachAlert.currentPanTranslationY = f;
                    float f3 = chatAttachAlert.fromScrollY;
                    if (f3 > 0.0f) {
                        chatAttachAlert.currentPanTranslationY = DiffUtil.m(1.0f, f2, f3 - chatAttachAlert.toScrollY, f);
                    }
                    chatAttachAlert.actionBar.setTranslationY(chatAttachAlert.currentPanTranslationY);
                    ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                    chatAttachAlert2.selectedMenuItem.setTranslationY(chatAttachAlert2.currentPanTranslationY);
                    ChatAttachAlert chatAttachAlert3 = ChatAttachAlert.this;
                    ActionBarMenuItem actionBarMenuItem = chatAttachAlert3.searchItem;
                    if (actionBarMenuItem != null) {
                        actionBarMenuItem.setTranslationY(chatAttachAlert3.currentPanTranslationY);
                    }
                    ChatAttachAlert chatAttachAlert4 = ChatAttachAlert.this;
                    ActionBarMenuItem actionBarMenuItem2 = chatAttachAlert4.motionItem;
                    if (actionBarMenuItem2 != null) {
                        actionBarMenuItem2.setTranslationY(chatAttachAlert4.selectedMenuItem.getTranslationY());
                    }
                    ChatAttachAlert chatAttachAlert5 = ChatAttachAlert.this;
                    HintView2 hintView2 = chatAttachAlert5.motionHint;
                    if (hintView2 != null) {
                        hintView2.setTranslationY(chatAttachAlert5.selectedMenuItem.getTranslationY());
                    }
                    ChatAttachAlert chatAttachAlert6 = ChatAttachAlert.this;
                    chatAttachAlert6.doneItem.setTranslationY(chatAttachAlert6.currentPanTranslationY);
                    ChatAttachAlert.this.updateSelectedPosition(0);
                    ChatAttachAlert chatAttachAlert7 = ChatAttachAlert.this;
                    chatAttachAlert7.setCurrentPanTranslationY(chatAttachAlert7.currentPanTranslationY);
                    anonymousClass5.invalidate();
                    ChatAttachAlert.this.frameLayout2.invalidate();
                    ChatAttachAlert.this.updateCommentTextViewPosition();
                    ChatAttachAlert chatAttachAlert8 = ChatAttachAlert.this;
                    AttachAlertLayout attachAlertLayout = chatAttachAlert8.currentAttachLayout;
                    if (attachAlertLayout != null) {
                        attachAlertLayout.onContainerTranslationUpdated(chatAttachAlert8.currentPanTranslationY);
                    }
                }

                @Override
                public final void onTransitionEnd() {
                    AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                    ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                    chatAttachAlert.updateLayout(chatAttachAlert.currentAttachLayout, false, 0);
                    ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                    chatAttachAlert2.previousScrollOffsetY = chatAttachAlert2.scrollOffsetY[0];
                    chatAttachAlert2.currentAttachLayout.onPanTransitionEnd();
                    if (!(chatAttachAlert2.currentAttachLayout instanceof ChatAttachAlertBotWebViewLayout) || chatAttachAlert2.botButtonWasVisible) {
                        return;
                    }
                    int iDp = ((BottomSheet) chatAttachAlert2).keyboardVisible ? AndroidUtilities.dp(84.0f) : 0;
                    for (int i = 0; i < chatAttachAlert2.botAttachLayouts.size(); i++) {
                        ((ChatAttachAlertBotWebViewLayout) chatAttachAlert2.botAttachLayouts.valueAt(i)).setMeasureOffsetY(iDp);
                    }
                }

                @Override
                public final void onTransitionStart(int i, boolean z) {
                    int i2;
                    AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                    ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                    int i3 = chatAttachAlert.previousScrollOffsetY;
                    if (i3 <= 0 || i3 == (i2 = chatAttachAlert.scrollOffsetY[0]) || !z) {
                        chatAttachAlert.fromScrollY = -1.0f;
                    } else {
                        chatAttachAlert.fromScrollY = i3;
                        chatAttachAlert.toScrollY = i2;
                    }
                    anonymousClass5.invalidate();
                    ChatAttachAlert chatAttachAlert2 = ChatAttachAlert.this;
                    if ((chatAttachAlert2.currentAttachLayout instanceof ChatAttachAlertBotWebViewLayout) && !chatAttachAlert2.botButtonWasVisible) {
                        AnonymousClass14 anonymousClass14 = chatAttachAlert2.buttonsRecyclerViewWrapper;
                        if (z) {
                            anonymousClass14.setVisibility(8);
                        } else {
                            anonymousClass14.setVisibility(0);
                        }
                    }
                    chatAttachAlert2.currentAttachLayout.onPanTransitionStart(i, z);
                }
            };
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            float f;
            int iDp;
            float f2;
            float fMax;
            float f3;
            int themedColor;
            float alpha;
            AttachAlertLayout attachAlertLayout;
            int i = Build.VERSION.SDK_INT;
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            if (i >= 31 && chatAttachAlert.scrollableViewNoiseSuppressor != null) {
                chatAttachAlert.blur3_InvalidateBlur$1();
                BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = chatAttachAlert.iBlur3SourceGlassFrosted;
                if (blurredBackgroundSourceRenderNode != null) {
                    blurredBackgroundSourceRenderNode.setSize(((BottomSheet) chatAttachAlert).containerView.getMeasuredWidth(), ((BottomSheet) chatAttachAlert).containerView.getMeasuredHeight());
                    blurredBackgroundSourceRenderNode.renderNodeWithHash.updateDisplayListIfNeeded();
                }
                BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode2 = chatAttachAlert.iBlur3SourceGlass;
                if (blurredBackgroundSourceRenderNode2 != null) {
                    blurredBackgroundSourceRenderNode2.setSize(((BottomSheet) chatAttachAlert).containerView.getMeasuredWidth(), ((BottomSheet) chatAttachAlert).containerView.getMeasuredHeight());
                    blurredBackgroundSourceRenderNode2.renderNodeWithHash.updateDisplayListIfNeeded();
                }
            }
            canvas.save();
            AttachAlertLayout attachAlertLayout2 = chatAttachAlert.currentAttachLayout;
            ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = chatAttachAlert.photoPreviewLayout;
            if ((attachAlertLayout2 == chatAttachAlertPhotoLayoutPreview || (attachAlertLayout = chatAttachAlert.nextAttachLayout) == chatAttachAlertPhotoLayoutPreview || (attachAlertLayout2 == chatAttachAlert.photoLayout && attachAlertLayout == null)) && attachAlertLayout2 != null) {
                canvas.save();
                canvas.translate(0.0f, chatAttachAlert.currentPanTranslationY);
                int alpha2 = (int) (attachAlertLayout2.getAlpha() * 255.0f);
                int iNeedsActionBar = attachAlertLayout2.needsActionBar();
                int iDp2 = AndroidUtilities.dp(13.0f);
                AnonymousClass12 anonymousClass12 = chatAttachAlert.headerView;
                int alpha3 = iDp2 + ((int) ((anonymousClass12 != null ? anonymousClass12.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f)));
                IntroActivity.AnonymousClass1 anonymousClass1 = chatAttachAlert.topCommentContainer;
                int alpha4 = alpha3 + ((int) (anonymousClass1 != null ? anonymousClass1.getAlpha() * anonymousClass1.getMeasuredHeight() : 0.0f));
                int scrollOffsetY = (chatAttachAlert.getScrollOffsetY(0) - ((BottomSheet) chatAttachAlert).backgroundPaddingTop) - alpha4;
                if (((BottomSheet) chatAttachAlert).currentSheetAnimationType == 1 || chatAttachAlert.viewChangeAnimator != null) {
                    scrollOffsetY = (int) (attachAlertLayout2.getTranslationY() + scrollOffsetY);
                }
                int iDp3 = AndroidUtilities.dp(20.0f) + scrollOffsetY;
                getMeasuredHeight();
                AndroidUtilities.dp(45.0f);
                int currentActionBarHeight = iNeedsActionBar != 0 ? ActionBar.getCurrentActionBarHeight() : ((BottomSheet) chatAttachAlert).backgroundPaddingTop;
                float f4 = 1.0f;
                if (iNeedsActionBar == 2) {
                    fMax = scrollOffsetY < currentActionBarHeight ? Math.max(0.0f, 1.0f - ((currentActionBarHeight - scrollOffsetY) / ((BottomSheet) chatAttachAlert).backgroundPaddingTop)) : 1.0f;
                    f = 0.0f;
                } else {
                    float f5 = alpha4;
                    f = 0.0f;
                    if (attachAlertLayout2 == chatAttachAlert.locationLayout) {
                        iDp = AndroidUtilities.dp(11.0f);
                    } else if (attachAlertLayout2 == chatAttachAlert.pollLayout || attachAlertLayout2 == chatAttachAlert.todoLayout) {
                        int iDp4 = AndroidUtilities.dp(3.0f);
                        f2 = f5 - iDp4;
                        float alpha5 = chatAttachAlert.actionBar.getAlpha();
                        int i2 = (int) (((currentActionBarHeight - f2) + AndroidUtilities.statusBarHeight) * alpha5);
                        scrollOffsetY -= i2;
                        iDp3 -= i2;
                        fMax = 1.0f - alpha5;
                    } else {
                        iDp = AndroidUtilities.dp(4.0f);
                    }
                    f2 = f5 + iDp;
                    float alpha6 = chatAttachAlert.actionBar.getAlpha();
                    int i3 = (int) (((currentActionBarHeight - f2) + AndroidUtilities.statusBarHeight) * alpha6);
                    scrollOffsetY -= i3;
                    iDp3 -= i3;
                    fMax = 1.0f - alpha6;
                }
                boolean z = chatAttachAlert.inBubbleMode;
                if (!z) {
                    int i4 = AndroidUtilities.statusBarHeight;
                    scrollOffsetY += i4;
                    iDp3 += i4;
                }
                int customBackground = chatAttachAlert.currentAttachLayout.hasCustomBackground() ? chatAttachAlert.currentAttachLayout.getCustomBackground() : chatAttachAlert.getShadowDrawableColor(true);
                ((BottomSheet) chatAttachAlert).shadowDrawable.setAlpha(alpha2);
                ((BottomSheet) chatAttachAlert).shadowDrawable.setBounds(0, scrollOffsetY, getMeasuredWidth(), ((BottomSheet) chatAttachAlert).backgroundPaddingTop + AndroidUtilities.dp(45.0f) + getMeasuredHeight());
                ((BottomSheet) chatAttachAlert).shadowDrawable.draw(canvas);
                RectF rectF = this.rect;
                if (iNeedsActionBar == 2) {
                    Theme.dialogs_onlineCirclePaint.setColor(customBackground);
                    Theme.dialogs_onlineCirclePaint.setAlpha(alpha2);
                    f3 = 24.0f;
                    rectF.set(((BottomSheet) chatAttachAlert).backgroundPaddingLeft, ((BottomSheet) chatAttachAlert).backgroundPaddingTop + scrollOffsetY, getMeasuredWidth() - ((BottomSheet) chatAttachAlert).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((BottomSheet) chatAttachAlert).backgroundPaddingTop + scrollOffsetY);
                } else {
                    f3 = 24.0f;
                }
                if ((fMax != 1.0f && iNeedsActionBar != 2) || chatAttachAlert.currentAttachLayout.hasCustomActionBarBackground()) {
                    Paint paint = Theme.dialogs_onlineCirclePaint;
                    if (chatAttachAlert.currentAttachLayout.hasCustomActionBarBackground()) {
                        customBackground = chatAttachAlert.currentAttachLayout.getCustomActionBarBackground();
                    }
                    paint.setColor(customBackground);
                    Theme.dialogs_onlineCirclePaint.setAlpha(alpha2);
                    rectF.set(((BottomSheet) chatAttachAlert).backgroundPaddingLeft, ((BottomSheet) chatAttachAlert).backgroundPaddingTop + scrollOffsetY, getMeasuredWidth() - ((BottomSheet) chatAttachAlert).backgroundPaddingLeft, AndroidUtilities.dp(f3) + ((BottomSheet) chatAttachAlert).backgroundPaddingTop + scrollOffsetY);
                }
                if (chatAttachAlert.currentAttachLayout.hasCustomActionBarBackground()) {
                    Theme.dialogs_onlineCirclePaint.setColor(chatAttachAlert.currentAttachLayout.getCustomActionBarBackground());
                    Theme.dialogs_onlineCirclePaint.setAlpha(alpha2);
                    int scrollOffsetY2 = chatAttachAlert.getScrollOffsetY(0);
                    if (!z) {
                        scrollOffsetY2 += AndroidUtilities.statusBarHeight;
                    }
                    rectF.set(((BottomSheet) chatAttachAlert).backgroundPaddingLeft, (AndroidUtilities.dp(12.0f) + ((BottomSheet) chatAttachAlert).backgroundPaddingTop + scrollOffsetY) * fMax, getMeasuredWidth() - ((BottomSheet) chatAttachAlert).backgroundPaddingLeft, AndroidUtilities.dp(12.0f) + scrollOffsetY2);
                    canvas.save();
                    canvas.drawRect(rectF, Theme.dialogs_onlineCirclePaint);
                    canvas.restore();
                }
                if ((anonymousClass12 == null || anonymousClass12.getAlpha() != 1.0f) && fMax != f) {
                    int iDp5 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - iDp5) / 2, iDp3, (getMeasuredWidth() + iDp5) / 2, AndroidUtilities.dp(4.0f) + iDp3);
                    if (iNeedsActionBar == 2) {
                        themedColor = 536870912;
                        f4 = fMax;
                    } else if (chatAttachAlert.currentAttachLayout.hasCustomActionBarBackground()) {
                        int customActionBarBackground = chatAttachAlert.currentAttachLayout.getCustomActionBarBackground();
                        themedColor = ColorUtils.blendARGB(0.5f, customActionBarBackground, ColorUtils.calculateLuminance(customActionBarBackground) < 0.5d ? -1 : -16777216);
                        if (anonymousClass12 != null) {
                            alpha = anonymousClass12.getAlpha();
                            f4 = 1.0f - alpha;
                        }
                    } else {
                        themedColor = chatAttachAlert.getThemedColor(Theme.key_sheet_scrollUp);
                        if (anonymousClass12 != null) {
                            alpha = anonymousClass12.getAlpha();
                            f4 = 1.0f - alpha;
                        }
                    }
                    int iAlpha = Color.alpha(themedColor);
                    Theme.dialogs_onlineCirclePaint.setColor(themedColor);
                    Theme.dialogs_onlineCirclePaint.setAlpha((int) (attachAlertLayout2.getAlpha() * iAlpha * f4 * fMax));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                }
                canvas.restore();
            }
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        @Override
        public final void drawBlurRect(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            BlurredBackgroundDrawable blurredBackgroundDrawable;
            float f;
            int iDp;
            float f2;
            float f3;
            int iDp2;
            float f4;
            float fMax;
            boolean zDrawChild;
            int themedColor;
            float alpha;
            AttachAlertLayout attachAlertLayout;
            boolean z = view instanceof AttachAlertLayout;
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            boolean z2 = chatAttachAlert.inBubbleMode;
            IntroActivity.AnonymousClass1 anonymousClass1 = chatAttachAlert.topCommentContainer;
            AnonymousClass12 anonymousClass12 = chatAttachAlert.headerView;
            if (!z || view.getAlpha() <= 0.0f) {
                AnonymousClass7 anonymousClass7 = chatAttachAlert.actionBar;
                if (view != anonymousClass7) {
                    if (!(view instanceof EmojiView) || (blurredBackgroundDrawable = chatAttachAlert.emojiViewChildBg) == null) {
                        return super.drawChild(canvas, view, j);
                    }
                    canvas.save();
                    blurredBackgroundDrawable.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                    canvas.clipPath(blurredBackgroundDrawable.boundProps.path);
                    blurredBackgroundDrawable.draw(canvas);
                    boolean zDrawChild2 = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild2;
                }
                float alpha2 = anonymousClass7.getAlpha();
                if (alpha2 <= 0.0f) {
                    return false;
                }
                if (alpha2 >= 1.0f) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                float x = anonymousClass7.getX();
                AttachAlertLayout attachAlertLayout2 = chatAttachAlert.currentAttachLayout;
                if (attachAlertLayout2 != null) {
                    int iNeedsActionBar = attachAlertLayout2.needsActionBar();
                    int iDp3 = AndroidUtilities.dp(13.0f) + ((int) ((anonymousClass12 != null ? anonymousClass12.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f))) + ((int) (anonymousClass1 != null ? anonymousClass1.getAlpha() * anonymousClass1.getMeasuredHeight() : 0.0f));
                    int scrollOffsetY = (chatAttachAlert.getScrollOffsetY(0) - ((BottomSheet) chatAttachAlert).backgroundPaddingTop) - iDp3;
                    if (((BottomSheet) chatAttachAlert).currentSheetAnimationType == 1 || chatAttachAlert.viewChangeAnimator != null) {
                        scrollOffsetY = (int) (attachAlertLayout2.getTranslationY() + scrollOffsetY);
                    }
                    int iDp4 = AndroidUtilities.dp(20.0f) + scrollOffsetY;
                    int currentActionBarHeight = iNeedsActionBar != 0 ? ActionBar.getCurrentActionBarHeight() : ((BottomSheet) chatAttachAlert).backgroundPaddingTop;
                    if (iNeedsActionBar != 2 && ((BottomSheet) chatAttachAlert).backgroundPaddingTop + scrollOffsetY < currentActionBarHeight) {
                        float f5 = iDp3;
                        if (attachAlertLayout2 == chatAttachAlert.locationLayout) {
                            iDp = AndroidUtilities.dp(11.0f);
                        } else if (attachAlertLayout2 == chatAttachAlert.pollLayout || attachAlertLayout2 == chatAttachAlert.todoLayout) {
                            int iDp5 = AndroidUtilities.dp(3.0f);
                            f2 = f5 - iDp5;
                            iDp4 -= (int) (anonymousClass7.getAlpha() * ((currentActionBarHeight - f2) + AndroidUtilities.statusBarHeight));
                        } else {
                            iDp = AndroidUtilities.dp(4.0f);
                        }
                        f2 = f5 + iDp;
                        iDp4 -= (int) (anonymousClass7.getAlpha() * ((currentActionBarHeight - f2) + AndroidUtilities.statusBarHeight));
                    }
                    if (!z2) {
                        iDp4 += AndroidUtilities.statusBarHeight;
                    }
                    f = iDp4;
                } else {
                    f = 0.0f;
                }
                canvas.clipRect(x, f, anonymousClass7.getX() + anonymousClass7.getWidth(), anonymousClass7.getY() + anonymousClass7.getHeight());
                boolean zDrawChild3 = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild3;
            }
            canvas.save();
            canvas.translate(0.0f, chatAttachAlert.currentPanTranslationY);
            int alpha3 = (int) (view.getAlpha() * 255.0f);
            AttachAlertLayout attachAlertLayout3 = (AttachAlertLayout) view;
            int iNeedsActionBar2 = attachAlertLayout3.needsActionBar();
            int iDp6 = AndroidUtilities.dp(13.0f) + (anonymousClass12 != null ? AndroidUtilities.dp(anonymousClass12.getAlpha() * 26.0f) : 0) + ((int) (anonymousClass1 != null ? anonymousClass1.getAlpha() * anonymousClass1.getMeasuredHeight() : 0.0f));
            int scrollOffsetY2 = (chatAttachAlert.getScrollOffsetY(attachAlertLayout3 == chatAttachAlert.currentAttachLayout ? 0 : 1) - ((BottomSheet) chatAttachAlert).backgroundPaddingTop) - iDp6;
            if (((BottomSheet) chatAttachAlert).currentSheetAnimationType == 1 || chatAttachAlert.viewChangeAnimator != null) {
                scrollOffsetY2 = (int) (view.getTranslationY() + scrollOffsetY2);
            }
            int iDp7 = AndroidUtilities.dp(20.0f) + scrollOffsetY2;
            int iDp8 = ((BottomSheet) chatAttachAlert).backgroundPaddingTop + AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            int currentActionBarHeight2 = iNeedsActionBar2 != 0 ? ActionBar.getCurrentActionBarHeight() : ((BottomSheet) chatAttachAlert).backgroundPaddingTop;
            if (iNeedsActionBar2 != 2) {
                f3 = 0.0f;
                if (((BottomSheet) chatAttachAlert).backgroundPaddingTop + scrollOffsetY2 < currentActionBarHeight2) {
                    float f6 = iDp6;
                    if (attachAlertLayout3 == chatAttachAlert.locationLayout) {
                        iDp2 = AndroidUtilities.dp(11.0f);
                    } else if (attachAlertLayout3 == chatAttachAlert.pollLayout || attachAlertLayout3 == chatAttachAlert.todoLayout) {
                        int iDp9 = AndroidUtilities.dp(3.0f);
                        f4 = f6 - iDp9;
                        float fMin = Math.min(1.0f, ((currentActionBarHeight2 - scrollOffsetY2) - ((BottomSheet) chatAttachAlert).backgroundPaddingTop) / f4);
                        int i = (int) ((currentActionBarHeight2 - f4) * fMin);
                        scrollOffsetY2 -= i;
                        iDp7 -= i;
                        iDp8 += i;
                        fMax = 1.0f - fMin;
                    } else {
                        iDp2 = AndroidUtilities.dp(4.0f);
                    }
                    f4 = f6 + iDp2;
                    float fMin2 = Math.min(1.0f, ((currentActionBarHeight2 - scrollOffsetY2) - ((BottomSheet) chatAttachAlert).backgroundPaddingTop) / f4);
                    int i2 = (int) ((currentActionBarHeight2 - f4) * fMin2);
                    scrollOffsetY2 -= i2;
                    iDp7 -= i2;
                    iDp8 += i2;
                    fMax = 1.0f - fMin2;
                } else {
                    fMax = 1.0f;
                }
            } else if (scrollOffsetY2 < currentActionBarHeight2) {
                fMax = Math.max(0.0f, 1.0f - ((currentActionBarHeight2 - scrollOffsetY2) / ((BottomSheet) chatAttachAlert).backgroundPaddingTop));
                f3 = 0.0f;
            } else {
                f3 = 0.0f;
                fMax = 1.0f;
            }
            if (!z2) {
                int i3 = AndroidUtilities.statusBarHeight;
                scrollOffsetY2 += i3;
                iDp7 += i3;
                iDp8 -= i3;
            }
            int i4 = iDp8;
            int customBackground = chatAttachAlert.currentAttachLayout.hasCustomBackground() ? chatAttachAlert.currentAttachLayout.getCustomBackground() : chatAttachAlert.getShadowDrawableColor(true);
            AttachAlertLayout attachAlertLayout4 = chatAttachAlert.currentAttachLayout;
            ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = chatAttachAlert.photoPreviewLayout;
            boolean z3 = (attachAlertLayout4 == chatAttachAlertPhotoLayoutPreview || (attachAlertLayout = chatAttachAlert.nextAttachLayout) == chatAttachAlertPhotoLayoutPreview || (attachAlertLayout4 == chatAttachAlert.photoLayout && attachAlertLayout == null)) ? false : true;
            RectF rectF = this.rect;
            if (z3) {
                ((BottomSheet) chatAttachAlert).shadowDrawable.setAlpha(alpha3);
                ((BottomSheet) chatAttachAlert).shadowDrawable.setBounds(0, scrollOffsetY2, getMeasuredWidth(), i4);
                ((BottomSheet) chatAttachAlert).shadowDrawable.draw(canvas);
                if (iNeedsActionBar2 == 2) {
                    Theme.dialogs_onlineCirclePaint.setColor(customBackground);
                    Theme.dialogs_onlineCirclePaint.setAlpha(alpha3);
                    rectF.set(((BottomSheet) chatAttachAlert).backgroundPaddingLeft, ((BottomSheet) chatAttachAlert).backgroundPaddingTop + scrollOffsetY2, getMeasuredWidth() - ((BottomSheet) chatAttachAlert).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((BottomSheet) chatAttachAlert).backgroundPaddingTop + scrollOffsetY2);
                }
            }
            if (view == chatAttachAlert.contactsLayout || view == chatAttachAlert.quickRepliesLayout || view == chatAttachAlert.audioLayout) {
                zDrawChild = super.drawChild(canvas, view, j);
            } else {
                canvas.save();
                zDrawChild = super.drawChild(canvas, view, j);
                canvas.restore();
            }
            if (z3) {
                if (fMax != 1.0f && iNeedsActionBar2 != 2) {
                    Theme.dialogs_onlineCirclePaint.setColor(customBackground);
                    Theme.dialogs_onlineCirclePaint.setAlpha(alpha3);
                    rectF.set(((BottomSheet) chatAttachAlert).backgroundPaddingLeft, ((BottomSheet) chatAttachAlert).backgroundPaddingTop + scrollOffsetY2, getMeasuredWidth() - ((BottomSheet) chatAttachAlert).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((BottomSheet) chatAttachAlert).backgroundPaddingTop + scrollOffsetY2);
                }
                if ((anonymousClass12 == null || anonymousClass12.getAlpha() != 1.0f) && fMax != f3) {
                    int iDp10 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - iDp10) / 2, iDp7, (getMeasuredWidth() + iDp10) / 2, AndroidUtilities.dp(4.0f) + iDp7);
                    if (iNeedsActionBar2 == 2) {
                        themedColor = 536870912;
                        alpha = fMax;
                    } else {
                        themedColor = chatAttachAlert.getThemedColor(Theme.key_sheet_scrollUp);
                        alpha = anonymousClass12 == null ? 1.0f : 1.0f - anonymousClass12.getAlpha();
                    }
                    int iAlpha = Color.alpha(themedColor);
                    Theme.dialogs_onlineCirclePaint.setColor(themedColor);
                    Theme.dialogs_onlineCirclePaint.setAlpha((int) (view.getAlpha() * iAlpha * alpha * fMax));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                }
            }
            canvas.restore();
            return zDrawChild;
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            AnonymousClass2 anonymousClass2 = this.adjustPanLayoutHelper;
            anonymousClass2.resizableViewToSet = this;
            anonymousClass2.onAttach();
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            chatAttachAlert.commentTextView.setAdjustPanLayoutHelper(anonymousClass2);
            chatAttachAlert.topCommentTextView.setAdjustPanLayoutHelper(anonymousClass2);
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            onDetach();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            boolean z = ChatAttachAlert.this.inBubbleMode;
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            if (chatAttachAlert.currentAttachLayout.onContainerViewTouchEvent(motionEvent)) {
                return true;
            }
            if (motionEvent.getAction() == 0) {
                int[] iArr = chatAttachAlert.scrollOffsetY;
                if (iArr[0] != 0) {
                    float y = motionEvent.getY();
                    int i = iArr[0] - (((BottomSheet) chatAttachAlert).backgroundPaddingTop * 2);
                    int iDp = AndroidUtilities.dp(13.0f);
                    AnonymousClass12 anonymousClass12 = chatAttachAlert.headerView;
                    int iDp2 = i - (iDp + (anonymousClass12 != null ? AndroidUtilities.dp(anonymousClass12.getAlpha() * 26.0f) : 0));
                    IntroActivity.AnonymousClass1 anonymousClass1 = chatAttachAlert.topCommentContainer;
                    int iDp3 = AndroidUtilities.dp(20.0f) + (iDp2 - ((int) (anonymousClass1 != null ? anonymousClass1.getAlpha() * anonymousClass1.getMeasuredHeight() : 0.0f)));
                    if (!chatAttachAlert.inBubbleMode) {
                        iDp3 += AndroidUtilities.statusBarHeight;
                    }
                    if (y < iDp3 && chatAttachAlert.actionBar.getAlpha() == 0.0f) {
                        chatAttachAlert.onDismissWithTouchOutside();
                        return true;
                    }
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            ChatAttachAlertPhotoLayout.AnonymousClass3 anonymousClass3;
            int alpha;
            int paddingRight;
            int i5;
            int paddingLeft;
            int i6;
            int i7;
            int i8;
            AnonymousClass19 anonymousClass19;
            AnonymousClass21 anonymousClass21;
            ChatAttachAlertPollLayout chatAttachAlertPollLayout;
            ChatAttachAlertPollLayout chatAttachAlertPollLayout2;
            int i9;
            int iMax;
            int measuredHeight;
            int measuredHeight2;
            int emojiPadding;
            AnonymousClass5 anonymousClass5 = this;
            int i10 = anonymousClass5.lastNotifyWidth;
            int i11 = i3 - i;
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            if (i10 != i11) {
                anonymousClass5.lastNotifyWidth = i11;
                AnonymousClass25 anonymousClass25 = chatAttachAlert.messageSendPreview;
                if (anonymousClass25 != null && !anonymousClass25.dismissing) {
                    anonymousClass25.dismiss();
                }
            }
            int childCount = anonymousClass5.getChildCount();
            if (Build.VERSION.SDK_INT >= 29) {
                chatAttachAlert.exclustionRect.set(i, i2, i3, i4);
                anonymousClass5.setSystemGestureExclusionRects(chatAttachAlert.exclusionRects);
            }
            WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(anonymousClass5);
            int i12 = 8;
            int i13 = rootWindowInsets != null ? rootWindowInsets.mImpl.getInsets(8).bottom : 0;
            int paddingBottom = anonymousClass5.getPaddingBottom();
            if (!((BottomSheet) chatAttachAlert).keyboardVisible) {
                ChatAttachAlertPollLayout chatAttachAlertPollLayout3 = chatAttachAlert.pollLayout;
                if (chatAttachAlertPollLayout3 == null || chatAttachAlert.currentAttachLayout != chatAttachAlertPollLayout3 || chatAttachAlertPollLayout3.emojiView == null) {
                    ChatAttachAlertPollLayout chatAttachAlertPollLayout4 = chatAttachAlert.todoLayout;
                    if (chatAttachAlertPollLayout4 == null || chatAttachAlert.currentAttachLayout != chatAttachAlertPollLayout4 || chatAttachAlertPollLayout4.emojiView == null) {
                        if (i13 > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                            emojiPadding = 0;
                        } else {
                            emojiPadding = chatAttachAlert.getCommentView().getEmojiPadding();
                        }
                    } else if (i13 > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                        emojiPadding = 0;
                    } else {
                        emojiPadding = chatAttachAlert.todoLayout.getEmojiPadding();
                    }
                } else if (i13 > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = chatAttachAlert.pollLayout.getEmojiPadding();
                }
                if (emojiPadding > 0) {
                    paddingBottom += emojiPadding;
                }
            }
            anonymousClass5.setBottomClip(paddingBottom);
            int i14 = 0;
            while (i14 < childCount) {
                View childAt = anonymousClass5.getChildAt(i14);
                if (childAt.getVisibility() != i12) {
                    int i15 = AndroidUtilities.statusBarHeight;
                    int iMax2 = i13 == 0 ? Math.max(AndroidUtilities.navigationBarHeight, paddingBottom) : 0;
                    if (childAt instanceof AttachAlertLayout) {
                        AttachAlertLayout attachAlertLayout = (AttachAlertLayout) childAt;
                        if (attachAlertLayout.occupyStatusBar) {
                            i15 = 0;
                        }
                        if (attachAlertLayout.occupyNavigationBar) {
                            iMax2 = 0;
                        }
                    }
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    int i16 = layoutParams.gravity;
                    if (i16 == -1) {
                        i16 = 51;
                    }
                    int i17 = i16 & 112;
                    int i18 = i16 & 7;
                    if (i18 != 1) {
                        if (i18 != 5) {
                            paddingLeft = getPaddingLeft() + layoutParams.leftMargin;
                        } else {
                            paddingRight = ((i11 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                            i5 = ((BottomSheet) chatAttachAlert).backgroundPaddingLeft;
                        }
                        if (i17 != 16) {
                            if (i17 != 48) {
                                i8 = layoutParams.topMargin + i15;
                            } else if (i17 != 80) {
                                i8 = layoutParams.topMargin;
                            } else {
                                i6 = ((i4 - iMax2) - i2) - measuredHeight3;
                                i7 = layoutParams.bottomMargin;
                            }
                            if (childAt != chatAttachAlert.actionBar || childAt == chatAttachAlert.fadeView) {
                                i8 = 0;
                            }
                            anonymousClass19 = chatAttachAlert.commentTextView;
                            if ((anonymousClass19 == null && anonymousClass19.isPopupView(childAt)) || (((anonymousClass21 = chatAttachAlert.topCommentTextView) != null && anonymousClass21.isPopupView(childAt)) || (((chatAttachAlertPollLayout = chatAttachAlert.pollLayout) != null && childAt == chatAttachAlertPollLayout.emojiView) || ((chatAttachAlertPollLayout2 = chatAttachAlert.todoLayout) != null && childAt == chatAttachAlertPollLayout2.emojiView)))) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight = getMeasuredHeight();
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                } else {
                                    measuredHeight = getMeasuredHeight() + i13;
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                }
                                i8 = measuredHeight - measuredHeight2;
                            } else if (childAt == chatAttachAlert.mentionContainer) {
                                if (chatAttachAlert.captionAbove) {
                                    i9 = AndroidUtilities.statusBarHeight;
                                    iMax = ActionBar.getCurrentActionBarHeight();
                                    i8 = i9 + iMax;
                                }
                            } else if (childAt == chatAttachAlert.bottomFadeView) {
                                i9 = i8 + AndroidUtilities.navigationBarHeight;
                                iMax = Math.max(i13, chatAttachAlert.getEmojiPadding$1());
                                i8 = i9 + iMax;
                            }
                            childAt.layout(paddingLeft, i8, measuredWidth + paddingLeft, i8 + measuredHeight3);
                        } else {
                            i6 = ((((i4 - iMax2) - i2) - measuredHeight3) / 2) + layoutParams.topMargin;
                            i7 = layoutParams.bottomMargin;
                        }
                        i8 = i6 - i7;
                        if (childAt != chatAttachAlert.actionBar) {
                            i8 = 0;
                        } else {
                            i8 = 0;
                        }
                        anonymousClass19 = chatAttachAlert.commentTextView;
                        if (anonymousClass19 == null) {
                            if (childAt == chatAttachAlert.mentionContainer) {
                                if (chatAttachAlert.captionAbove) {
                                    i9 = AndroidUtilities.statusBarHeight;
                                    iMax = ActionBar.getCurrentActionBarHeight();
                                    i8 = i9 + iMax;
                                }
                            } else if (childAt == chatAttachAlert.bottomFadeView) {
                                i9 = i8 + AndroidUtilities.navigationBarHeight;
                                iMax = Math.max(i13, chatAttachAlert.getEmojiPadding$1());
                                i8 = i9 + iMax;
                            }
                        } else if (childAt == chatAttachAlert.mentionContainer) {
                            if (chatAttachAlert.captionAbove) {
                                i9 = AndroidUtilities.statusBarHeight;
                                iMax = ActionBar.getCurrentActionBarHeight();
                                i8 = i9 + iMax;
                            }
                        } else if (childAt == chatAttachAlert.bottomFadeView) {
                            i9 = i8 + AndroidUtilities.navigationBarHeight;
                            iMax = Math.max(i13, chatAttachAlert.getEmojiPadding$1());
                            i8 = i9 + iMax;
                        }
                        childAt.layout(paddingLeft, i8, measuredWidth + paddingLeft, i8 + measuredHeight3);
                    } else {
                        paddingRight = ((i11 - measuredWidth) / 2) + layoutParams.leftMargin;
                        i5 = layoutParams.rightMargin;
                    }
                    paddingLeft = paddingRight - i5;
                    if (i17 != 16) {
                        if (i17 != 48) {
                            i8 = layoutParams.topMargin + i15;
                        } else if (i17 != 80) {
                            i8 = layoutParams.topMargin;
                        } else {
                            i6 = ((i4 - iMax2) - i2) - measuredHeight3;
                            i7 = layoutParams.bottomMargin;
                        }
                        if (childAt != chatAttachAlert.actionBar) {
                            i8 = 0;
                        } else {
                            i8 = 0;
                        }
                        anonymousClass19 = chatAttachAlert.commentTextView;
                        if (anonymousClass19 == null) {
                            if (childAt == chatAttachAlert.mentionContainer) {
                                if (chatAttachAlert.captionAbove) {
                                    i9 = AndroidUtilities.statusBarHeight;
                                    iMax = ActionBar.getCurrentActionBarHeight();
                                    i8 = i9 + iMax;
                                }
                            } else if (childAt == chatAttachAlert.bottomFadeView) {
                                i9 = i8 + AndroidUtilities.navigationBarHeight;
                                iMax = Math.max(i13, chatAttachAlert.getEmojiPadding$1());
                                i8 = i9 + iMax;
                            }
                        } else if (childAt == chatAttachAlert.mentionContainer) {
                            if (chatAttachAlert.captionAbove) {
                                i9 = AndroidUtilities.statusBarHeight;
                                iMax = ActionBar.getCurrentActionBarHeight();
                                i8 = i9 + iMax;
                            }
                        } else if (childAt == chatAttachAlert.bottomFadeView) {
                            i9 = i8 + AndroidUtilities.navigationBarHeight;
                            iMax = Math.max(i13, chatAttachAlert.getEmojiPadding$1());
                            i8 = i9 + iMax;
                        }
                        childAt.layout(paddingLeft, i8, measuredWidth + paddingLeft, i8 + measuredHeight3);
                    } else {
                        i6 = ((((i4 - iMax2) - i2) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i7 = layoutParams.bottomMargin;
                    }
                    i8 = i6 - i7;
                    if (childAt != chatAttachAlert.actionBar) {
                        i8 = 0;
                    } else {
                        i8 = 0;
                    }
                    anonymousClass19 = chatAttachAlert.commentTextView;
                    if (anonymousClass19 == null) {
                        if (childAt == chatAttachAlert.mentionContainer) {
                            if (chatAttachAlert.captionAbove) {
                                i9 = AndroidUtilities.statusBarHeight;
                                iMax = ActionBar.getCurrentActionBarHeight();
                                i8 = i9 + iMax;
                            }
                        } else if (childAt == chatAttachAlert.bottomFadeView) {
                            i9 = i8 + AndroidUtilities.navigationBarHeight;
                            iMax = Math.max(i13, chatAttachAlert.getEmojiPadding$1());
                            i8 = i9 + iMax;
                        }
                    } else if (childAt == chatAttachAlert.mentionContainer) {
                        if (chatAttachAlert.captionAbove) {
                            i9 = AndroidUtilities.statusBarHeight;
                            iMax = ActionBar.getCurrentActionBarHeight();
                            i8 = i9 + iMax;
                        }
                    } else if (childAt == chatAttachAlert.bottomFadeView) {
                        i9 = i8 + AndroidUtilities.navigationBarHeight;
                        iMax = Math.max(i13, chatAttachAlert.getEmojiPadding$1());
                        i8 = i9 + iMax;
                    }
                    childAt.layout(paddingLeft, i8, measuredWidth + paddingLeft, i8 + measuredHeight3);
                }
                i14++;
                i12 = 8;
                anonymousClass5 = this;
            }
            notifyHeightChanged();
            chatAttachAlert.updateLayout(chatAttachAlert.currentAttachLayout, false, 0);
            chatAttachAlert.updateLayout(chatAttachAlert.nextAttachLayout, false, 0);
            if (chatAttachAlert.captionAbove) {
                chatAttachAlert.updateCommentTextViewPosition();
            }
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = chatAttachAlert.photoLayout;
            if (chatAttachAlertPhotoLayout == null || (anonymousClass3 = chatAttachAlertPhotoLayout.gridView) == null || anonymousClass3.getFastScroll() == null) {
                return;
            }
            RecyclerListView.FastScroll fastScroll = chatAttachAlertPhotoLayout.gridView.getFastScroll();
            int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.listAdditionalH;
            if (chatAttachAlert.captionAbove) {
                IntroActivity.AnonymousClass1 anonymousClass1 = chatAttachAlert.topCommentContainer;
                alpha = (int) (anonymousClass1.getAlpha() * anonymousClass1.getMeasuredHeight());
            } else {
                alpha = 0;
            }
            fastScroll.topOffset = currentActionBarHeight + alpha;
            chatAttachAlertPhotoLayout.gridView.getFastScroll().invalidate();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int i3;
            ChatAttachAlertPollLayout chatAttachAlertPollLayout;
            ChatAttachAlertPollLayout chatAttachAlertPollLayout2;
            int emojiPadding$1;
            AnonymousClass5 anonymousClass5 = this;
            int size = anonymousClass5.getLayoutParams().height > 0 ? anonymousClass5.getLayoutParams().height : View.MeasureSpec.getSize(i2);
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            boolean z = chatAttachAlert.inBubbleMode;
            if (!z) {
                anonymousClass5.ignoreLayout = true;
                anonymousClass5.setPadding(((BottomSheet) chatAttachAlert).backgroundPaddingLeft, 0, ((BottomSheet) chatAttachAlert).backgroundPaddingLeft, 0);
                anonymousClass5.ignoreLayout = false;
            }
            int size2 = View.MeasureSpec.getSize(i) - (((BottomSheet) chatAttachAlert).backgroundPaddingLeft * 2);
            boolean zIsTablet = AndroidUtilities.isTablet();
            ActionBarMenuItem actionBarMenuItem = chatAttachAlert.selectedMenuItem;
            if (zIsTablet) {
                actionBarMenuItem.setAdditionalYOffset(-AndroidUtilities.dp(3.0f));
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    actionBarMenuItem.setAdditionalYOffset(0);
                } else {
                    actionBarMenuItem.setAdditionalYOffset(-AndroidUtilities.dp(3.0f));
                }
            }
            ((FrameLayout.LayoutParams) chatAttachAlert.doneItem.getLayoutParams()).height = ActionBar.getCurrentActionBarHeight();
            anonymousClass5.ignoreLayout = true;
            int iMin = (int) (size2 / Math.min(4.5f, chatAttachAlert.buttonsAdapter.getItemCount()));
            if (chatAttachAlert.attachItemSize != iMin) {
                chatAttachAlert.attachItemSize = iMin;
                AndroidUtilities.runOnUIThread(new Bulletin$2$$ExternalSyntheticLambda1(anonymousClass5, 13));
            }
            anonymousClass5.ignoreLayout = false;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            int size3 = View.MeasureSpec.getSize(i);
            int size4 = View.MeasureSpec.getSize(iMakeMeasureSpec);
            anonymousClass5.setMeasuredDimension(size3, size4);
            int i4 = size3 - (((BottomSheet) chatAttachAlert).backgroundPaddingLeft * 2);
            AnonymousClass19 anonymousClass19 = chatAttachAlert.commentTextView;
            if (!anonymousClass19.waitingForKeyboardOpen && AndroidUtilities.dp(20.0f) >= 0 && !anonymousClass19.emojiViewVisible && !anonymousClass19.isAnimatePopupClosing) {
                anonymousClass5.ignoreLayout = true;
                anonymousClass19.hideEmojiView();
                anonymousClass5.ignoreLayout = false;
            }
            AnonymousClass21 anonymousClass21 = chatAttachAlert.topCommentTextView;
            if (!anonymousClass21.waitingForKeyboardOpen && AndroidUtilities.dp(20.0f) >= 0 && !anonymousClass21.emojiViewVisible && !anonymousClass21.isAnimatePopupClosing) {
                anonymousClass5.ignoreLayout = true;
                anonymousClass21.hideEmojiView();
                anonymousClass5.ignoreLayout = false;
            }
            if (chatAttachAlert.pollLayout != null && AndroidUtilities.dp(20.0f) >= 0) {
                ChatAttachAlertPollLayout chatAttachAlertPollLayout3 = chatAttachAlert.pollLayout;
                if (!chatAttachAlertPollLayout3.waitingForKeyboardOpen && !chatAttachAlertPollLayout3.emojiViewVisible && !chatAttachAlertPollLayout3.isAnimatePopupClosing && !chatAttachAlertPollLayout3.isEmojiSearchOpened) {
                    anonymousClass5.ignoreLayout = true;
                    chatAttachAlertPollLayout3.hideEmojiView();
                    anonymousClass5.ignoreLayout = false;
                }
            }
            if (chatAttachAlert.todoLayout != null && AndroidUtilities.dp(20.0f) >= 0) {
                ChatAttachAlertPollLayout chatAttachAlertPollLayout4 = chatAttachAlert.todoLayout;
                if (!chatAttachAlertPollLayout4.waitingForKeyboardOpen && !chatAttachAlertPollLayout4.emojiViewVisible && !chatAttachAlertPollLayout4.isAnimatePopupClosing && !chatAttachAlertPollLayout4.isEmojiSearchOpened) {
                    anonymousClass5.ignoreLayout = true;
                    chatAttachAlertPollLayout4.hideEmojiView();
                    anonymousClass5.ignoreLayout = false;
                }
            }
            if (AndroidUtilities.dp(20.0f) >= 0) {
                if (((BottomSheet) chatAttachAlert).keyboardVisible) {
                    AttachAlertLayout attachAlertLayout = chatAttachAlert.currentAttachLayout;
                    ChatAttachAlertPollLayout chatAttachAlertPollLayout5 = chatAttachAlert.pollLayout;
                    if (attachAlertLayout == chatAttachAlertPollLayout5 && chatAttachAlertPollLayout5.emojiView != null && chatAttachAlertPollLayout5.isEmojiSearchOpened) {
                        emojiPadding$1 = AndroidUtilities.dp(120.0f);
                    } else {
                        ChatAttachAlertPollLayout chatAttachAlertPollLayout6 = chatAttachAlert.todoLayout;
                        emojiPadding$1 = (attachAlertLayout == chatAttachAlertPollLayout6 && chatAttachAlertPollLayout6.emojiView != null && chatAttachAlertPollLayout6.isEmojiSearchOpened) ? AndroidUtilities.dp(120.0f) : 0;
                    }
                } else {
                    emojiPadding$1 = chatAttachAlert.getEmojiPadding$1();
                }
                WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(anonymousClass5);
                int i5 = rootWindowInsets != null ? rootWindowInsets.mImpl.getInsets(8).bottom : 0;
                WindowInsetsCompat rootWindowInsets2 = ViewCompat.getRootWindowInsets(anonymousClass5);
                Math.max(rootWindowInsets2 != null ? rootWindowInsets2.mImpl.getInsets(527).bottom : 0, emojiPadding$1);
                int iMax = Math.max(i5 > 0 ? 0 : AndroidUtilities.navigationBarHeight, emojiPadding$1);
                anonymousClass5.ignoreLayout = true;
                AttachAlertLayout attachAlertLayout2 = chatAttachAlert.currentAttachLayout;
                if (attachAlertLayout2.occupyNavigationBar) {
                    attachAlertLayout2.listPaddingBottom = AndroidUtilities.dp(62.0f) + iMax;
                    chatAttachAlert.currentAttachLayout.onPreMeasure(i4, size4);
                } else {
                    attachAlertLayout2.listPaddingBottom = AndroidUtilities.navigationBarHeight;
                    attachAlertLayout2.onPreMeasure(i4, size4 - emojiPadding$1);
                }
                AttachAlertLayout attachAlertLayout3 = chatAttachAlert.nextAttachLayout;
                if (attachAlertLayout3 != null) {
                    if (attachAlertLayout3.occupyNavigationBar) {
                        attachAlertLayout3.listPaddingBottom = AndroidUtilities.dp(62.0f) + iMax;
                        chatAttachAlert.nextAttachLayout.onPreMeasure(i4, size4);
                    } else {
                        attachAlertLayout3.listPaddingBottom = AndroidUtilities.navigationBarHeight;
                        attachAlertLayout3.onPreMeasure(i4, size4 - emojiPadding$1);
                    }
                }
                anonymousClass5.ignoreLayout = false;
            }
            int childCount = anonymousClass5.getChildCount();
            int i6 = 0;
            while (i6 < childCount) {
                int i7 = i6;
                View childAt = anonymousClass5.getChildAt(i7);
                if (childAt == null || childAt.getVisibility() == 8) {
                    i3 = i7;
                } else if (childAt == chatAttachAlert.fadeView) {
                    i3 = i7;
                    anonymousClass5.measureChildWithMargins(childAt, i, 0, iMakeMeasureSpec, 0);
                } else {
                    i3 = i7;
                    int i8 = AndroidUtilities.statusBarHeight;
                    int i9 = AndroidUtilities.navigationBarHeight;
                    if (childAt instanceof AttachAlertLayout) {
                        AttachAlertLayout attachAlertLayout4 = (AttachAlertLayout) childAt;
                        if (attachAlertLayout4.occupyStatusBar) {
                            i8 = 0;
                        }
                        if (attachAlertLayout4.occupyNavigationBar) {
                            i9 = 0;
                        }
                    }
                    if ((anonymousClass19 == null || !anonymousClass19.isPopupView(childAt)) && ((anonymousClass21 == null || !anonymousClass21.isPopupView(childAt)) && (((chatAttachAlertPollLayout = chatAttachAlert.pollLayout) == null || childAt != chatAttachAlertPollLayout.emojiView) && ((chatAttachAlertPollLayout2 = chatAttachAlert.todoLayout) == null || childAt != chatAttachAlertPollLayout2.emojiView)))) {
                        measureChildWithMargins(childAt, i, 0, iMakeMeasureSpec, i8 + i9);
                    } else if (z) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + size4, 1073741824));
                    } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (size4 - AndroidUtilities.statusBarHeight)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size4 - AndroidUtilities.statusBarHeight), 1073741824));
                    }
                }
                i6 = i3 + 1;
                anonymousClass5 = this;
            }
        }

        @Override
        public final void onSizeChanged(int i, int i2, int i3, int i4) {
            int radius;
            WindowInsets rootWindowInsets;
            super.onSizeChanged(i, i2, i3, i4);
            int i5 = 0;
            if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
                radius = 0;
            } else {
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                int radius2 = roundedCorner == null ? 0 : roundedCorner.getRadius();
                if (roundedCorner2 == null) {
                    i5 = radius2;
                    radius = 0;
                } else {
                    radius = roundedCorner2.getRadius();
                    i5 = radius2;
                }
            }
            BlurredBackgroundDrawable blurredBackgroundDrawable = ChatAttachAlert.this.emojiViewChildBg;
            if (blurredBackgroundDrawable != null) {
                blurredBackgroundDrawable.setRadius$1(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), radius, i5);
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            if (chatAttachAlert.currentAttachLayout.onContainerViewTouchEvent(motionEvent)) {
                return true;
            }
            return !chatAttachAlert.isDismissed() && super.onTouchEvent(motionEvent);
        }

        @Override
        public final void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        @Override
        public final void setTranslationY(float f) {
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            float f2 = f + chatAttachAlert.currentPanTranslationY;
            if (((BottomSheet) chatAttachAlert).currentSheetAnimationType == 0) {
                this.initialTranslationY = f2;
            }
            if (((BottomSheet) chatAttachAlert).currentSheetAnimationType == 1) {
                AnonymousClass14 anonymousClass14 = chatAttachAlert.buttonsRecyclerViewWrapper;
                if (f2 < 0.0f) {
                    chatAttachAlert.currentAttachLayout.setTranslationY(f2);
                    if (chatAttachAlert.avatarPicker != 0 || chatAttachAlert.storyMediaPicker) {
                        chatAttachAlert.headerView.setTranslationY((chatAttachAlert.baseSelectedTextViewTranslationY + f2) - chatAttachAlert.currentPanTranslationY);
                    }
                    anonymousClass14.setTranslationY(0.0f);
                    f2 = 0.0f;
                } else {
                    chatAttachAlert.currentAttachLayout.setTranslationY(0.0f);
                    anonymousClass14.setTranslationY(((f2 / this.initialTranslationY) * anonymousClass14.getMeasuredHeight()) + (-f2));
                }
                ((BottomSheet) chatAttachAlert).containerView.invalidate();
            }
            super.setTranslationY(f2 - chatAttachAlert.currentPanTranslationY);
            if (((BottomSheet) chatAttachAlert).currentSheetAnimationType != 1) {
                chatAttachAlert.currentAttachLayout.onContainerTranslationUpdated(chatAttachAlert.currentPanTranslationY);
            }
        }
    }

    public final class AnonymousClass7 extends ActionBar {
        public final ChatAttachAlert this$0;

        public AnonymousClass7(Context context, Theme.ResourcesProvider resourcesProvider, ChatAttachAlert chatAttachAlert) {
            super(context, resourcesProvider);
            this.this$0 = chatAttachAlert;
        }

        @Override
        public final void setAlpha(float f) {
            AnonymousClass14 anonymousClass14;
            float alpha = getAlpha();
            super.setAlpha(f);
            if (alpha != f) {
                ChatAttachAlert chatAttachAlert = this.this$0;
                TextView textView = chatAttachAlert.selectedTextView;
                if (textView != null) {
                    float f2 = 1.0f - f;
                    textView.setAlpha(f2);
                    textView.setVisibility(f2 > 0.0f ? 0 : 8);
                }
                ChatAttachAlert.access$11800(chatAttachAlert);
                ((BottomSheet) chatAttachAlert).containerView.invalidate();
                AnonymousClass17 anonymousClass17 = chatAttachAlert.frameLayout2;
                if (anonymousClass17 == null || (anonymousClass14 = chatAttachAlert.buttonsRecyclerViewWrapper) == null) {
                    return;
                }
                if (anonymousClass17.getTag() == null) {
                    AttachAlertLayout attachAlertLayout = chatAttachAlert.currentAttachLayout;
                    if (attachAlertLayout == null || attachAlertLayout.shouldHideBottomButtons()) {
                        anonymousClass14.setAlpha(1.0f - f);
                        anonymousClass14.setTranslationY(AndroidUtilities.dp(44.0f) * f);
                    }
                    anonymousClass17.setTranslationY(AndroidUtilities.dp(48.0f) * f);
                    return;
                }
                if (chatAttachAlert.currentAttachLayout == null) {
                    float f3 = f == 0.0f ? 1.0f : 0.0f;
                    if (anonymousClass14.getAlpha() != f3) {
                        anonymousClass14.setAlpha(f3);
                    }
                }
            }
        }

        @Override
        public final void setVisibility(int i) {
            super.setVisibility(i);
            ChatAttachAlert.access$11800(this.this$0);
        }
    }

    public abstract class AttachAlertLayout extends FrameLayout {
        public RecyclerListView iBlur3Capture;
        public RecyclerListView iBlur3CaptureView;
        public int listPaddingBottom;
        public boolean occupyNavigationBar;
        public boolean occupyStatusBar;
        public final ChatAttachAlert parentAlert;
        public final Theme.ResourcesProvider resourcesProvider;

        public AttachAlertLayout(Context context, Theme.ResourcesProvider resourcesProvider, ChatAttachAlert chatAttachAlert) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            this.parentAlert = chatAttachAlert;
        }

        public void applyCaption(Editable editable) {
        }

        public boolean canDismissWithTouchOutside() {
            return true;
        }

        public boolean canScheduleMessages() {
            return true;
        }

        public void checkColors() {
        }

        public int getButtonsHideOffset() {
            return AndroidUtilities.dp(needsActionBar() != 0 ? 12.0f : 17.0f);
        }

        public int getCurrentItemTop() {
            return 0;
        }

        public int getCustomActionBarBackground() {
            return 0;
        }

        public int getCustomBackground() {
            return 0;
        }

        public int getFirstOffset() {
            return 0;
        }

        public IBlur3Capture getIBlur3Capture() {
            return null;
        }

        public int getListTopPadding() {
            return 0;
        }

        public int getSelectedItemsCount() {
            return 0;
        }

        public ArrayList<ThemeDescription> getThemeDescriptions() {
            return null;
        }

        public boolean hasCustomActionBarBackground() {
            return false;
        }

        public boolean hasCustomBackground() {
            return false;
        }

        public boolean isDoneItemEnabled() {
            return false;
        }

        public int needsActionBar() {
            return 0;
        }

        public boolean onBackPressed() {
            return false;
        }

        public void onButtonsTranslationYUpdated() {
        }

        public void onContainerTranslationUpdated(float f) {
        }

        public boolean onContainerViewTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public void onDestroy() {
        }

        public boolean onDismiss() {
            return false;
        }

        public void onDismissWithButtonClick(int i) {
        }

        public boolean onDismissWithTouchOutside() {
            return true;
        }

        public void onHidden() {
        }

        public void onHide() {
        }

        public void onHideShowProgress(float f) {
        }

        public void onMenuItemClick(int i) {
        }

        public void onOpenAnimationEnd() {
        }

        public void onPanTransitionEnd() {
        }

        public void onPanTransitionStart(int i, boolean z) {
        }

        public void onPause() {
        }

        public abstract void onPreMeasure(int i, int i2);

        public void onResume() {
        }

        public void onSelectedItemsCountChanged(int i) {
        }

        public boolean onSheetKeyDown(int i) {
            return false;
        }

        public void onShow(AttachAlertLayout attachAlertLayout) {
        }

        public void onShown() {
        }

        public void scrollToTop() {
        }

        public boolean sendSelectedItems(int i, boolean z, int i2, boolean z2, long j) {
            return false;
        }

        public boolean shouldHideBottomButtons() {
            return !(this instanceof ChatAttachAlertBotWebViewLayout);
        }
    }

    public final class AttachBotButton extends AttachButtonBase {
        public TLRPC.TL_attachMenuBot attachMenuBot;
        public TLRPC.User currentUser;

        public AttachBotButton(Context context) {
            super(context);
            setWillNotDraw(false);
            setFocusable(true);
            setFocusableInTouchMode(true);
            Theme.ResourcesProvider resourcesProvider = ((BottomSheet) ChatAttachAlert.this).resourcesProvider;
            GlassTabView glassTabView = new GlassTabView(context);
            glassTabView.resourcesProvider = resourcesProvider;
            glassTabView.selfMeasure = true;
            TextView textView = glassTabView.textView;
            textView.setTextSize(1, 11.0f);
            textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            glassTabView.imageView.setVisibility(8);
            glassTabView.checkPlayAnimation(false);
            BackupImageView backupImageView = new BackupImageView(context);
            glassTabView.backupImageView = backupImageView;
            glassTabView.addView(backupImageView, LayoutHelper.createFrame(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
            glassTabView.colorDefault = Theme.getColor(Theme.key_glass_tabUnselected, resourcesProvider);
            glassTabView.colorSelected = Theme.getColor(Theme.key_glass_tabSelected, resourcesProvider);
            glassTabView.colorSelectedText = Theme.getColor(Theme.key_glass_tabSelectedText, resourcesProvider);
            glassTabView.updateColors$11();
            this.glassTabView = glassTabView;
            glassTabView.getBackupImageView().imageReceiver.setDelegate(new EmojiView$$ExternalSyntheticLambda21(25));
            addView(this.glassTabView, LayoutHelper.createFrame(-1.0f, -1));
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            updateCheckedState(false);
        }

        public final void updateCheckedState(boolean z) {
            boolean z2 = this.attachMenuBot != null && (-this.currentUser.id) == ChatAttachAlert.this.selectedId;
            this.glassTabView.setSelected(z2, z);
            RLottieDrawable lottieAnimation = this.glassTabView.getBackupImageView().getImageReceiver().getLottieAnimation();
            if (!z) {
                if (lottieAnimation != null) {
                    lottieAnimation.isRunning = false;
                    lottieAnimation.checkChoreographer$1();
                    lottieAnimation.setProgress(0.0f, false);
                    return;
                }
                return;
            }
            if (!z2 || lottieAnimation == null) {
                return;
            }
            lottieAnimation.setAutoRepeat(0);
            lottieAnimation.setCustomEndFrame(-1);
            lottieAnimation.setProgress(0.0f, false);
            lottieAnimation.start();
        }
    }

    public final class AttachButton extends AttachButtonBase {
        public int currentId;

        public AttachButton(Context context) {
            super(context);
            setWillNotDraw(false);
            setFocusable(true);
            Theme.ResourcesProvider resourcesProvider = ((BottomSheet) ChatAttachAlert.this).resourcesProvider;
            GlassTabView glassTabView = new GlassTabView(context);
            glassTabView.resourcesProvider = resourcesProvider;
            glassTabView.selfMeasure = true;
            TextView textView = glassTabView.textView;
            textView.setTextSize(1, 11.0f);
            textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            glassTabView.checkPlayAnimation(false);
            glassTabView.imageView.setLayoutParams(LayoutHelper.createFrame(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
            glassTabView.colorDefault = Theme.getColor(Theme.key_glass_tabUnselected, resourcesProvider);
            glassTabView.colorSelected = Theme.getColor(Theme.key_glass_tabSelected, resourcesProvider);
            glassTabView.colorSelectedText = Theme.getColor(Theme.key_glass_tabSelectedText, resourcesProvider);
            glassTabView.updateColors$11();
            this.glassTabView = glassTabView;
            addView(glassTabView, LayoutHelper.createFrame(-1.0f, -1));
        }

        @Override
        public final boolean hasOverlappingRendering() {
            return false;
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.glassTabView.setSelected(((long) this.currentId) == ChatAttachAlert.this.selectedId, false);
        }

        public final void setTextAndIcon(int i, String str, GlassTabView.TabAnimation tabAnimation) {
            this.glassTabView.setText(str);
            this.glassTabView.setTabAnimation(tabAnimation);
            this.currentId = i;
        }
    }

    public abstract class AttachButtonBase extends FrameLayout {
        public GlassTabView glassTabView;
    }

    public final class AttachSearchField extends FragmentSearchField {
        public final ChatAttachAlert parentAlert;

        public AttachSearchField(Context context, Theme.ResourcesProvider resourcesProvider, ChatAttachAlert chatAttachAlert) {
            super(context, resourcesProvider);
            this.parentAlert = chatAttachAlert;
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.parentAlert.makeFocusable(this.editText, true);
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public final class ButtonsAdapter extends RecyclerListView.SelectionAdapter {
        public int attachBotsEndRow;
        public int attachBotsStartRow;
        public final ArrayList attachMenuBots = new ArrayList();
        public int buttonsCount;
        public int contactButton;
        public int documentButton;
        public int emojiButton;
        public int galleryButton;
        public int linksButton;
        public int locationButton;
        public final Context mContext;
        public int musicButton;
        public int pollButton;
        public int quickRepliesButton;
        public int richButton;
        public int stickerButton;
        public int todoButton;

        public ButtonsAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            int i = this.buttonsCount;
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            return (chatAttachAlert.editingMessageObject == null && (chatAttachAlert.baseFragment instanceof ChatActivity) && !chatAttachAlert.isPollAttach) ? MediaDataController.getInstance(chatAttachAlert.currentAccount).inlineBots.size() + i : i;
        }

        @Override
        public final int getItemViewType(int i) {
            if (i < this.buttonsCount) {
                return (i < this.attachBotsStartRow || i >= this.attachBotsEndRow) ? 0 : 1;
            }
            return 1;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public final void notifyDataSetChanged() {
            int i = 0;
            this.buttonsCount = 0;
            this.galleryButton = -1;
            this.documentButton = -1;
            this.musicButton = -1;
            this.pollButton = -1;
            this.todoButton = -1;
            this.contactButton = -1;
            this.quickRepliesButton = -1;
            this.locationButton = -1;
            this.stickerButton = -1;
            this.linksButton = -1;
            this.richButton = -1;
            this.emojiButton = -1;
            this.attachBotsStartRow = -1;
            this.attachBotsEndRow = -1;
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            if (chatAttachAlert.isPollAttach) {
                this.buttonsCount = 1;
                this.galleryButton = 0;
                int i2 = chatAttachAlert.pollAllowedLayouts;
                if (i2 == 0 || BitwiseUtils.hasFlag(i2, 16)) {
                    int i3 = this.buttonsCount;
                    this.buttonsCount = i3 + 1;
                    this.documentButton = i3;
                }
                int i4 = chatAttachAlert.pollAllowedLayouts;
                if (i4 == 0 || BitwiseUtils.hasFlag(i4, 8192)) {
                    int i5 = this.buttonsCount;
                    this.buttonsCount = i5 + 1;
                    this.stickerButton = i5;
                }
                int i6 = chatAttachAlert.pollAllowedLayouts;
                if (i6 == 0 || BitwiseUtils.hasFlag(i6, 16384)) {
                    int i7 = this.buttonsCount;
                    this.buttonsCount = i7 + 1;
                    this.emojiButton = i7;
                }
                int i8 = chatAttachAlert.pollAllowedLayouts;
                if (i8 == 0 || BitwiseUtils.hasFlag(i8, 8)) {
                    int i9 = this.buttonsCount;
                    this.buttonsCount = i9 + 1;
                    this.musicButton = i9;
                }
                int i10 = chatAttachAlert.pollAllowedLayouts;
                if (i10 == 0 || BitwiseUtils.hasFlag(i10, 64)) {
                    int i11 = this.buttonsCount;
                    this.buttonsCount = i11 + 1;
                    this.locationButton = i11;
                }
                int i12 = chatAttachAlert.pollAllowedLayouts;
                if (i12 == 0 || BitwiseUtils.hasFlag(i12, 32768)) {
                    int i13 = this.buttonsCount;
                    this.buttonsCount = i13 + 1;
                    this.linksButton = i13;
                }
            } else {
                BaseFragment baseFragment = chatAttachAlert.baseFragment;
                if (!(baseFragment instanceof ChatActivity)) {
                    this.galleryButton = 0;
                    this.buttonsCount = 2;
                    this.documentButton = 1;
                    if (chatAttachAlert.allowEnterCaption) {
                        this.buttonsCount = 3;
                        this.musicButton = 2;
                    }
                } else if (chatAttachAlert.editingMessageObject != null) {
                    int i14 = chatAttachAlert.editType;
                    if (i14 == -1) {
                        this.galleryButton = 0;
                        this.documentButton = 1;
                        this.buttonsCount = 3;
                        this.musicButton = 2;
                    } else {
                        if (i14 == 0) {
                            this.buttonsCount = 1;
                            this.galleryButton = 0;
                        }
                        if (i14 == 1) {
                            int i15 = this.buttonsCount;
                            this.buttonsCount = i15 + 1;
                            this.documentButton = i15;
                        }
                        if (i14 == 2) {
                            int i16 = this.buttonsCount;
                            this.buttonsCount = i16 + 1;
                            this.musicButton = i16;
                        }
                    }
                } else {
                    TLRPC.User currentUser = baseFragment != null ? ((ChatActivity) baseFragment).getCurrentUser() : null;
                    TLRPC.Chat chat = baseFragment instanceof ChatActivity ? ((ChatActivity) baseFragment).currentChat : null;
                    boolean z = currentUser != null && ((ChatActivity) baseFragment).getMessagesController().getSendPaidMessagesStars(currentUser.id) > 0;
                    int i17 = this.buttonsCount;
                    this.buttonsCount = i17 + 1;
                    this.galleryButton = i17;
                    boolean z2 = chatAttachAlert.photosEnabled;
                    int i18 = chatAttachAlert.currentAccount;
                    if ((z2 || chatAttachAlert.videosEnabled) && !z && ((chat == null || !ChatObject.isMonoForum(chat)) && (baseFragment instanceof ChatActivity) && !((ChatActivity) baseFragment).isInScheduleMode() && !((ChatActivity) baseFragment).isSecretChat())) {
                        ChatActivity chatActivity = (ChatActivity) baseFragment;
                        if (chatActivity.chatMode != 5) {
                            this.attachBotsStartRow = this.buttonsCount;
                            ArrayList arrayList = this.attachMenuBots;
                            arrayList.clear();
                            ArrayList<TLRPC.TL_attachMenuBot> arrayList2 = MediaDataController.getInstance(i18).getAttachMenuBots().bots;
                            int size = arrayList2.size();
                            while (i < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList2.get(i);
                                i++;
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                                if (tL_attachMenuBot2.show_in_attach_menu) {
                                    TLObject currentUser2 = chatActivity.currentChat;
                                    if (currentUser2 == null) {
                                        currentUser2 = chatActivity.getCurrentUser();
                                    }
                                    if (MediaDataController.canShowAttachMenuBot(tL_attachMenuBot2, currentUser2)) {
                                        arrayList.add(tL_attachMenuBot2);
                                    }
                                }
                            }
                            int size2 = arrayList.size() + this.buttonsCount;
                            this.buttonsCount = size2;
                            this.attachBotsEndRow = size2;
                        }
                    }
                    int i19 = this.buttonsCount;
                    int i20 = i19 + 1;
                    this.buttonsCount = i20;
                    this.documentButton = i19;
                    boolean z3 = chatAttachAlert.plainTextEnabled;
                    if (z3) {
                        this.buttonsCount = i19 + 2;
                        this.locationButton = i20;
                    }
                    if (z3 && MessagesController.getInstance(i18).richEditorAvailable()) {
                        int i21 = this.buttonsCount;
                        this.buttonsCount = i21 + 1;
                        this.richButton = i21;
                    }
                    if (chatAttachAlert.pollsEnabled) {
                        int i22 = this.buttonsCount;
                        this.buttonsCount = i22 + 1;
                        this.pollButton = i22;
                    }
                    if (chatAttachAlert.todoEnabled) {
                        int i23 = this.buttonsCount;
                        this.buttonsCount = i23 + 1;
                        this.todoButton = i23;
                    }
                    if (chatAttachAlert.plainTextEnabled) {
                        int i24 = this.buttonsCount;
                        this.buttonsCount = i24 + 1;
                        this.contactButton = i24;
                    }
                    if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).chatMode == 0 && currentUser != null && !z && !currentUser.bot && !QuickRepliesController.getInstance(i18).replies.isEmpty()) {
                        int i25 = this.buttonsCount;
                        this.buttonsCount = i25 + 1;
                        this.quickRepliesButton = i25;
                    }
                    int i26 = this.buttonsCount;
                    this.buttonsCount = i26 + 1;
                    this.musicButton = i26;
                }
            }
            this.mObservable.notifyChanged();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            boolean z2;
            boolean z3;
            int i2 = viewHolder.mItemViewType;
            int i3 = ChatAttachAlert.this.currentAccount;
            View view = viewHolder.itemView;
            if (i2 != 0) {
                if (i2 != 1) {
                    return;
                }
                AttachBotButton attachBotButton = (AttachBotButton) view;
                attachBotButton.glassTabView.getClass();
                int i4 = this.attachBotsStartRow;
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                if (i >= i4 && i < this.attachBotsEndRow) {
                    int i5 = i - i4;
                    attachBotButton.setTag(Integer.valueOf(i5));
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.attachMenuBots.get(i5);
                    TLRPC.User user = MessagesController.getInstance(i3).getUser(Long.valueOf(tL_attachMenuBot.bot_id));
                    if (user != null) {
                        GlassTabView glassTabView = attachBotButton.glassTabView;
                        glassTabView.getClass();
                        glassTabView.tabAnimation = null;
                        glassTabView.tabAnimationBot = tL_attachMenuBot;
                        glassTabView.lastIconAnimationRaw = 0;
                        glassTabView.lastBotIconId = 0L;
                        glassTabView.textView.setText(tL_attachMenuBot.short_name);
                        glassTabView.backupImageView.setRoundRadius(0);
                        BackupImageView backupImageView = glassTabView.backupImageView;
                        int iDp = AndroidUtilities.dp(24.0f);
                        int iDp2 = AndroidUtilities.dp(24.0f);
                        backupImageView.width = iDp;
                        backupImageView.height = iDp2;
                        backupImageView.invalidate();
                        glassTabView.backupImageView.setLayoutParams(LayoutHelper.createFrame(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
                        glassTabView.needUpdateBackupViewColor = true;
                        glassTabView.checkPlayAnimation(false);
                        glassTabView.updateColors$11();
                        glassTabView.invalidate();
                        attachBotButton.currentUser = user;
                        attachBotButton.attachMenuBot = tL_attachMenuBot;
                        attachBotButton.glassTabView.setSelected(false, false);
                        attachBotButton.invalidate();
                        return;
                    }
                    return;
                }
                int i6 = i - this.buttonsCount;
                attachBotButton.setTag(Integer.valueOf(i6));
                TLRPC.User user2 = MessagesController.getInstance(i3).getUser(Long.valueOf(MediaDataController.getInstance(i3).inlineBots.get(i6).peer.user_id));
                if (user2 == null) {
                    return;
                }
                GlassTabView glassTabView2 = attachBotButton.glassTabView;
                glassTabView2.tabAnimation = null;
                glassTabView2.tabAnimationBot = null;
                glassTabView2.lastIconAnimationRaw = 0;
                glassTabView2.lastBotIconId = 0L;
                glassTabView2.textView.setText(ContactsController.formatName(user2.first_name, user2.last_name));
                if (glassTabView2.avatarDrawable == null) {
                    glassTabView2.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
                }
                glassTabView2.avatarDrawable.setInfo(chatAttachAlert.currentAccount, user2);
                BackupImageView backupImageView2 = glassTabView2.backupImageView;
                backupImageView2.imageReceiver.setForUserOrChat(user2, glassTabView2.avatarDrawable);
                backupImageView2.onNewImageSet();
                BackupImageView backupImageView3 = glassTabView2.backupImageView;
                backupImageView3.width = -1;
                backupImageView3.height = -1;
                backupImageView3.invalidate();
                glassTabView2.backupImageView.setRoundRadius(AndroidUtilities.dp(11.33f));
                glassTabView2.backupImageView.setLayoutParams(LayoutHelper.createFrame(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
                glassTabView2.backupImageView.setColorFilter(null);
                glassTabView2.needUpdateBackupViewColor = false;
                glassTabView2.invalidate();
                attachBotButton.currentUser = user2;
                attachBotButton.attachMenuBot = null;
                attachBotButton.glassTabView.setSelected(false, false);
                attachBotButton.invalidate();
                return;
            }
            AttachButton attachButton = (AttachButton) view;
            attachButton.glassTabView.getClass();
            int i7 = this.galleryButton;
            Context context = this.mContext;
            if (i == i7) {
                attachButton.setTextAndIcon(1, LocaleController.getString(R.string.ChatGallery), GlassTabView.TabAnimation.GALLERY);
                attachButton.setTag(1);
                int i8 = Build.VERSION.SDK_INT;
                if (i8 < 33 ? i8 < 23 || ContextCompat.checkSelfPermission(context, "android.permission.READ_EXTERNAL_STORAGE") == 0 : ContextCompat.checkSelfPermission(context, "android.permission.READ_MEDIA_IMAGES") == 0 && ContextCompat.checkSelfPermission(context, "android.permission.READ_MEDIA_VIDEO") == 0 && ContextCompat.checkSelfPermission(context, "android.permission.CAMERA") == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z2 = !z3;
                z = false;
            } else if (i == this.documentButton) {
                attachButton.setTextAndIcon(4, LocaleController.getString(R.string.ChatDocument), GlassTabView.TabAnimation.FILES);
                attachButton.setTag(4);
                int i9 = Build.VERSION.SDK_INT;
                if (i9 < 33 ? i9 < 23 || ContextCompat.checkSelfPermission(context, "android.permission.READ_EXTERNAL_STORAGE") == 0 : ContextCompat.checkSelfPermission(context, "android.permission.READ_MEDIA_IMAGES") == 0 && ContextCompat.checkSelfPermission(context, "android.permission.READ_MEDIA_VIDEO") == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z2 = !z3;
                z = false;
            } else {
                if (i == this.locationButton) {
                    attachButton.setTextAndIcon(6, LocaleController.getString(R.string.ChatLocation), GlassTabView.TabAnimation.LOCATION);
                    attachButton.setTag(6);
                } else if (i == this.musicButton) {
                    attachButton.setTextAndIcon(3, LocaleController.getString(R.string.AttachMusic), GlassTabView.TabAnimation.MUSIC);
                    attachButton.setTag(3);
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 23) {
                        if (ContextCompat.checkSelfPermission(context, i10 >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                            z3 = false;
                        }
                        z2 = !z3;
                        z = false;
                    }
                    z3 = true;
                    z2 = !z3;
                    z = false;
                } else if (i == this.pollButton) {
                    attachButton.setTextAndIcon(9, LocaleController.getString(R.string.Poll), GlassTabView.TabAnimation.POLL);
                    attachButton.setTag(9);
                } else if (i == this.contactButton) {
                    attachButton.setTextAndIcon(5, LocaleController.getString(R.string.AttachContact), GlassTabView.TabAnimation.CONTACTS);
                    attachButton.setTag(5);
                    if (Build.VERSION.SDK_INT < 23 || ContextCompat.checkSelfPermission(context, "android.permission.READ_CONTACTS") == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z2 = !z3;
                    z = false;
                } else {
                    if (i == this.quickRepliesButton) {
                        attachButton.setTextAndIcon(11, LocaleController.getString(R.string.AttachQuickReplies), GlassTabView.TabAnimation.REPLIES);
                        attachButton.setTag(11);
                    } else if (i == this.todoButton) {
                        attachButton.setTextAndIcon(12, LocaleController.getString(R.string.Todo), GlassTabView.TabAnimation.CHECKLIST);
                        attachButton.setTag(12);
                    } else if (i == this.stickerButton) {
                        attachButton.setTextAndIcon(13, LocaleController.getString(R.string.ChatSticker), GlassTabView.TabAnimation.STICKER);
                        attachButton.setTag(13);
                    } else if (i == this.linksButton) {
                        attachButton.setTextAndIcon(15, LocaleController.getString(R.string.ChatLink), GlassTabView.TabAnimation.LINK);
                        attachButton.setTag(15);
                    } else if (i == this.emojiButton) {
                        attachButton.setTextAndIcon(14, LocaleController.getString(R.string.ChatEmoji), GlassTabView.TabAnimation.EMOJI);
                        attachButton.setTag(14);
                    } else if (i == this.richButton) {
                        attachButton.setTextAndIcon(16, LocaleController.getString(R.string.AttachArticle), GlassTabView.TabAnimation.ARTICLE);
                        attachButton.setTag(16);
                        z = !MessagesController.getInstance(i3).storyEntitiesAllowed();
                        z2 = false;
                    }
                    z2 = false;
                    z = true;
                }
                z2 = false;
                z = false;
            }
            attachButton.glassTabView.setCounter(z2 ? "!" : null, z2, false);
            attachButton.glassTabView.setPremiumBadge(z && !UserConfig.getInstance(i3).isPremium());
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
            Context context = this.mContext;
            View attachBotButton = i != 0 ? chatAttachAlert.new AttachBotButton(context) : chatAttachAlert.new AttachButton(context);
            attachBotButton.setImportantForAccessibility(1);
            attachBotButton.setFocusable(true);
            attachBotButton.setLayoutParams(new RecyclerView.LayoutParams(-2, -1));
            return new RecyclerListView.Holder(attachBotButton);
        }

        @Override
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof AttachButton) {
                return;
            }
            boolean z = view instanceof AttachBotButton;
        }
    }

    public interface ChatAttachViewDelegate {
        void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2);

        void didSelectBot(TLRPC.User user);

        void doOnIdle(ChatAttachAlert$$ExternalSyntheticLambda7 chatAttachAlert$$ExternalSyntheticLambda7);

        boolean needEnterComment();

        void onCameraOpened();

        void onWallpaperSelected(Object obj);

        void openAvatarsSearch();

        boolean selectItemOnClicking();

        void sendAudio(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2);
    }

    public ChatAttachAlert(Context context, BaseFragment baseFragment, boolean z, boolean z2, boolean z3, final Theme.ResourcesProvider resourcesProvider) {
        ActionBarMenuItem actionBarMenuItem;
        int i;
        IntroActivity.AnonymousClass4 anonymousClass4;
        float f;
        super(context, resourcesProvider, false, false);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorCaptionAbove = new BoolAnimator(0, this, cubicBezierInterpolator, 380L, false);
        this.animatorCaptionVisible = new BoolAnimator(1, this, cubicBezierInterpolator, 380L, false);
        this.animatorActionBarVisible = new BoolAnimator(2, this, cubicBezierInterpolator, 380L, false);
        this.animatorCaptionNotEmpty = new BoolAnimator(3, this, cubicBezierInterpolator, 380L, false);
        this.animatorToggleCaptionSupported = new BoolAnimator(4, this, cubicBezierInterpolator, 380L, true);
        this.animatorEphemeralMessageVisibility = new BoolAnimator(5, this, cubicBezierInterpolator, 320L, false);
        ReplaceAnimator replaceAnimator = new ReplaceAnimator(new ChatAttachAlert$$ExternalSyntheticLambda1(this, 1), cubicBezierInterpolator, 380L);
        this.animatorCurrentVisibleLayout = replaceAnimator;
        this.canOpenPreview = false;
        this.isSoundPicker = false;
        this.isStoryLocationPicker = false;
        this.isLocationPicker = false;
        this.translationProgress = 0.0f;
        this.ATTACH_ALERT_LAYOUT_TRANSLATION = new AnonymousClass2(this, 0);
        this.allowLivePhotos = false;
        AttachAlertLayout[] attachAlertLayoutArr = new AttachAlertLayout[11];
        this.layouts = attachAlertLayoutArr;
        this.botAttachLayouts = new LongSparseArray();
        this.commentTextViewLocation = new int[2];
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        this.rect = new RectF();
        this.paint = new Paint(1);
        this.sendButtonEnabled = true;
        this.sendButtonEnabledProgress = 1.0f;
        this.botButtonProgressWasVisible = false;
        this.botButtonWasVisible = false;
        int i2 = UserConfig.selectedAccount;
        this.currentAccount = i2;
        this.documentsEnabled = true;
        this.photosEnabled = true;
        this.videosEnabled = true;
        this.musicEnabled = true;
        this.pollsEnabled = true;
        this.todoEnabled = true;
        this.plainTextEnabled = true;
        this.maxSelectedPhotos = -1;
        this.allowOrder = true;
        this.attachItemSize = AndroidUtilities.dp(85.0f);
        new DecelerateInterpolator();
        this.scrollOffsetY = new int[2];
        new Paint(1);
        this.captionLimitBulletinShown = false;
        ArrayList arrayList = new ArrayList();
        this.exclusionRects = arrayList;
        Rect rect = new Rect();
        this.exclustionRect = rect;
        this.ATTACH_ALERT_PROGRESS = new AnonymousClass2(this, 1);
        this.allowDrawContent = true;
        this.sent = false;
        this.confirmationAlertShown = false;
        this.allowPassConfirmationAlert = false;
        ArrayList arrayList2 = new ArrayList();
        this.iBlur3Positions = arrayList2;
        RectF rectF = new RectF();
        this.iBlur3PositionActionBar = rectF;
        RectF rectF2 = new RectF();
        this.iBlur3PositionMainTabs = rectF2;
        RectF rectF3 = new RectF();
        this.iBlur3PositionFastScroll = rectF3;
        arrayList2.add(rectF);
        arrayList2.add(rectF2);
        arrayList2.add(rectF3);
        this.iBlur3PositionsMerged = new ArrayList();
        this.occupyNavigationBarWithoutKeyboard = true;
        boolean z4 = baseFragment instanceof ChatActivity;
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        this.iBlur3SourceColor = blurredBackgroundSourceColor;
        blurredBackgroundSourceColor.paint.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
        if (Build.VERSION.SDK_INT >= 31) {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor(false);
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlass = blurredBackgroundSourceRenderNode;
            blurredBackgroundSourceRenderNode.setupRenderer(new Stripe(this, 21));
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode2 = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlassFrosted = blurredBackgroundSourceRenderNode2;
            blurredBackgroundSourceRenderNode2.setupRenderer(new PhotoViewer.AnonymousClass18(this, 14));
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
            this.iBlur3FactoryLiquidGlass = blurredBackgroundDrawableViewFactory;
            blurredBackgroundDrawableViewFactory.isLiquidGlassEffectAllowed = LiteMode.isEnabled(262144);
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory2 = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode2);
            this.iBlur3FactoryFrostedLiquidGlass = blurredBackgroundDrawableViewFactory2;
            blurredBackgroundDrawableViewFactory2.isLiquidGlassEffectAllowed = LiteMode.isEnabled(262144);
        } else {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlassFrosted = null;
            this.iBlur3SourceGlass = null;
            this.iBlur3FactoryLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
            this.iBlur3FactoryFrostedLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        }
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory3 = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        this.iBlur3Capture = new EmojiView$$ExternalSyntheticLambda18(this, 2);
        this.forceDarkTheme = z;
        this.inBubbleMode = z4 && baseFragment.isInBubbleMode();
        this.openInterpolator = new OvershootInterpolator(0.7f);
        this.baseFragment = baseFragment;
        this.useSmoothKeyboard = true;
        setDelegate(this);
        NotificationCenter.getInstance(i2).addObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i2).addObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i2).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i2).addObserver(this, NotificationCenter.quickRepliesUpdated);
        arrayList.add(rect);
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(context);
        this.sizeNotifierFrameLayout = anonymousClass5;
        anonymousClass5.setDelegate(new SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate() {
            @Override
            public final void onSizeChanged(int i3, boolean z5) {
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                AttachAlertLayout attachAlertLayout = chatAttachAlert.currentAttachLayout;
                if (attachAlertLayout == chatAttachAlert.photoPreviewLayout) {
                    attachAlertLayout.invalidate();
                }
            }
        });
        this.containerView = anonymousClass5;
        anonymousClass5.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        this.containerView.setClipToPadding(false);
        ViewGroup viewGroup = this.containerView;
        int i3 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i3, 0, i3, 0);
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(context, resourcesProvider, this);
        this.actionBar = anonymousClass7;
        anonymousClass7.mAlwaysApplyColorFilterToBackButton = true;
        anonymousClass7.setForcedMenuWidth(AndroidUtilities.dp(46.0f));
        anonymousClass7.setBackButtonDrawable(new BackDrawable(false));
        int i4 = Theme.key_dialogTextBlack;
        anonymousClass7.setItemsColor(getThemedColor(i4), false);
        int i5 = Theme.key_dialogButtonSelector;
        anonymousClass7.setItemsBackgroundColor(getThemedColor(i5), false);
        anonymousClass7.setTitleColor(getThemedColor(i4));
        anonymousClass7.setOccupyStatusBar(true);
        anonymousClass7.setAlpha(0.0f);
        anonymousClass7.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, 29));
        ActionBarMenuItem actionBarMenuItem2 = new ActionBarMenuItem(context, null, 0, getThemedColor(i4), false, resourcesProvider);
        this.selectedMenuItem = actionBarMenuItem2;
        actionBarMenuItem2.setLongClickEnabled(false);
        int i6 = R.drawable.ic_ab_other;
        actionBarMenuItem2.setIcon(i6);
        int i7 = R.string.AccDescrMoreOptions;
        actionBarMenuItem2.setContentDescription(LocaleController.getString(i7));
        actionBarMenuItem2.setVisibility(4);
        actionBarMenuItem2.setAlpha(0.0f);
        actionBarMenuItem2.setScaleX(0.6f);
        actionBarMenuItem2.setScaleY(0.6f);
        actionBarMenuItem2.setSubMenuOpenSide(2);
        actionBarMenuItem2.setDelegate(new ChatAttachAlert$$ExternalSyntheticLambda1(this, 8));
        actionBarMenuItem2.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        actionBarMenuItem2.setTranslationX(AndroidUtilities.dp(1.0f));
        actionBarMenuItem2.setBackground(Theme.createSelectorDrawable(getThemedColor(i5), 6, -1));
        final int i8 = 4;
        actionBarMenuItem2.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout;
                switch (i8) {
                    case 0:
                        ChatAttachAlert chatAttachAlert = this.f$0;
                        long j = chatAttachAlert.selectedId;
                        if (j < 0 && (chatAttachAlertBotWebViewLayout = (ChatAttachAlertBotWebViewLayout) chatAttachAlert.botAttachLayouts.get(-j)) != null) {
                            BotWebViewContainer webViewContainer = chatAttachAlertBotWebViewLayout.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.lastClickMs = System.currentTimeMillis();
                            webViewContainer.notifyEvent("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ChatAttachAlert chatAttachAlert2 = this.f$0;
                        boolean z5 = chatAttachAlert2.captionAbove;
                        if (!z5) {
                            chatAttachAlert2.setCaptionAbove(!z5, true);
                        }
                        break;
                    case 2:
                        ChatAttachAlert chatAttachAlert3 = this.f$0;
                        boolean z6 = chatAttachAlert3.captionAbove;
                        if (z6) {
                            chatAttachAlert3.setCaptionAbove(!z6, true);
                        }
                        break;
                    case 3:
                        this.f$0.onWriteButtonPressed();
                        break;
                    case 4:
                        this.f$0.selectedMenuItem.toggleSubMenu(null, null);
                        break;
                    case 5:
                        this.f$0.lambda$new$3$6();
                        break;
                    case 6:
                        ChatAttachAlert.AttachAlertLayout attachAlertLayout = this.f$0.currentAttachLayout;
                        if (attachAlertLayout != null) {
                            attachAlertLayout.onMenuItemClick(40);
                        }
                        break;
                    case 7:
                        this.f$0.optionsItem.toggleSubMenu(null, null);
                        break;
                    default:
                        ChatAttachAlert chatAttachAlert4 = this.f$0;
                        chatAttachAlert4.updatePhotoPreview(chatAttachAlert4.currentAttachLayout != chatAttachAlert4.photoPreviewLayout);
                        break;
                }
            }
        });
        ActionBarMenuItem actionBarMenuItem3 = new ActionBarMenuItem(context, null, 0, getThemedColor(i4), false, resourcesProvider);
        this.motionItem = actionBarMenuItem3;
        actionBarMenuItem3.setLongClickEnabled(false);
        MotionPhotoDrawable motionPhotoDrawable = new MotionPhotoDrawable();
        this.motionIcon = motionPhotoDrawable;
        actionBarMenuItem3.setIcon(motionPhotoDrawable);
        actionBarMenuItem3.setContentDescription(LocaleController.getString(i7));
        actionBarMenuItem3.setVisibility(8);
        actionBarMenuItem3.setAlpha(0.0f);
        actionBarMenuItem3.setScaleX(0.6f);
        actionBarMenuItem3.setScaleY(0.6f);
        actionBarMenuItem3.setAdditionalYOffset(AndroidUtilities.dp(72.0f));
        actionBarMenuItem3.setTranslationX(-AndroidUtilities.dp(3.0f));
        actionBarMenuItem3.setBackground(Theme.createSelectorDrawable(getThemedColor(i5), 6, -1));
        final int i9 = 5;
        actionBarMenuItem3.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout;
                switch (i9) {
                    case 0:
                        ChatAttachAlert chatAttachAlert = this.f$0;
                        long j = chatAttachAlert.selectedId;
                        if (j < 0 && (chatAttachAlertBotWebViewLayout = (ChatAttachAlertBotWebViewLayout) chatAttachAlert.botAttachLayouts.get(-j)) != null) {
                            BotWebViewContainer webViewContainer = chatAttachAlertBotWebViewLayout.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.lastClickMs = System.currentTimeMillis();
                            webViewContainer.notifyEvent("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ChatAttachAlert chatAttachAlert2 = this.f$0;
                        boolean z5 = chatAttachAlert2.captionAbove;
                        if (!z5) {
                            chatAttachAlert2.setCaptionAbove(!z5, true);
                        }
                        break;
                    case 2:
                        ChatAttachAlert chatAttachAlert3 = this.f$0;
                        boolean z6 = chatAttachAlert3.captionAbove;
                        if (z6) {
                            chatAttachAlert3.setCaptionAbove(!z6, true);
                        }
                        break;
                    case 3:
                        this.f$0.onWriteButtonPressed();
                        break;
                    case 4:
                        this.f$0.selectedMenuItem.toggleSubMenu(null, null);
                        break;
                    case 5:
                        this.f$0.lambda$new$3$6();
                        break;
                    case 6:
                        ChatAttachAlert.AttachAlertLayout attachAlertLayout = this.f$0.currentAttachLayout;
                        if (attachAlertLayout != null) {
                            attachAlertLayout.onMenuItemClick(40);
                        }
                        break;
                    case 7:
                        this.f$0.optionsItem.toggleSubMenu(null, null);
                        break;
                    default:
                        ChatAttachAlert chatAttachAlert4 = this.f$0;
                        chatAttachAlert4.updatePhotoPreview(chatAttachAlert4.currentAttachLayout != chatAttachAlert4.photoPreviewLayout);
                        break;
                }
            }
        });
        IntroActivity.AnonymousClass4 anonymousClass6 = new IntroActivity.AnonymousClass4(this, context);
        anonymousClass6.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
        anonymousClass6.setText(LocaleController.getString(R.string.Create));
        anonymousClass6.setTypeface(AndroidUtilities.bold());
        anonymousClass6.setTextSize(1, 14.0f);
        anonymousClass6.setVisibility(4);
        anonymousClass6.setAlpha(0.0f);
        anonymousClass6.setGravity(17);
        anonymousClass6.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        anonymousClass6.setTranslationX(-AndroidUtilities.dp(12.0f));
        final int i10 = 6;
        anonymousClass6.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout;
                switch (i10) {
                    case 0:
                        ChatAttachAlert chatAttachAlert = this.f$0;
                        long j = chatAttachAlert.selectedId;
                        if (j < 0 && (chatAttachAlertBotWebViewLayout = (ChatAttachAlertBotWebViewLayout) chatAttachAlert.botAttachLayouts.get(-j)) != null) {
                            BotWebViewContainer webViewContainer = chatAttachAlertBotWebViewLayout.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.lastClickMs = System.currentTimeMillis();
                            webViewContainer.notifyEvent("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ChatAttachAlert chatAttachAlert2 = this.f$0;
                        boolean z5 = chatAttachAlert2.captionAbove;
                        if (!z5) {
                            chatAttachAlert2.setCaptionAbove(!z5, true);
                        }
                        break;
                    case 2:
                        ChatAttachAlert chatAttachAlert3 = this.f$0;
                        boolean z6 = chatAttachAlert3.captionAbove;
                        if (z6) {
                            chatAttachAlert3.setCaptionAbove(!z6, true);
                        }
                        break;
                    case 3:
                        this.f$0.onWriteButtonPressed();
                        break;
                    case 4:
                        this.f$0.selectedMenuItem.toggleSubMenu(null, null);
                        break;
                    case 5:
                        this.f$0.lambda$new$3$6();
                        break;
                    case 6:
                        ChatAttachAlert.AttachAlertLayout attachAlertLayout = this.f$0.currentAttachLayout;
                        if (attachAlertLayout != null) {
                            attachAlertLayout.onMenuItemClick(40);
                        }
                        break;
                    case 7:
                        this.f$0.optionsItem.toggleSubMenu(null, null);
                        break;
                    default:
                        ChatAttachAlert chatAttachAlert4 = this.f$0;
                        chatAttachAlert4.updatePhotoPreview(chatAttachAlert4.currentAttachLayout != chatAttachAlert4.photoPreviewLayout);
                        break;
                }
            }
        });
        ScaleStateListAnimator.apply(anonymousClass6, 0.1f, 1.5f);
        this.doneItem = anonymousClass6;
        updateDoneItemEnabled();
        if (baseFragment != null) {
            actionBarMenuItem = actionBarMenuItem3;
            anonymousClass4 = anonymousClass6;
            f = 14.0f;
            ActionBarMenuItem actionBarMenuItem4 = new ActionBarMenuItem(context, null, 0, getThemedColor(i4), false, resourcesProvider);
            this.searchItem = actionBarMenuItem4;
            actionBarMenuItem4.setLongClickEnabled(false);
            actionBarMenuItem4.setIcon(R.drawable.outline_header_search);
            actionBarMenuItem4.setContentDescription(LocaleController.getString(R.string.Search));
            actionBarMenuItem4.setVisibility(4);
            actionBarMenuItem4.setAlpha(0.0f);
            actionBarMenuItem4.setTranslationX(-AndroidUtilities.dp(42.0f));
            i = i5;
            actionBarMenuItem4.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(i), 6, -1));
            actionBarMenuItem4.setOnClickListener(new LinkEditActivity$$ExternalSyntheticLambda5(3, this, z2));
        } else {
            actionBarMenuItem = actionBarMenuItem3;
            i = i5;
            anonymousClass4 = anonymousClass6;
            f = 14.0f;
        }
        ActionBarMenuItem actionBarMenuItem5 = new ActionBarMenuItem(context, null, 0, getThemedColor(i4), false, resourcesProvider);
        this.optionsItem = actionBarMenuItem5;
        actionBarMenuItem5.setLongClickEnabled(false);
        actionBarMenuItem5.setIcon(i6);
        actionBarMenuItem5.setContentDescription(LocaleController.getString(i7));
        actionBarMenuItem5.setVisibility(8);
        actionBarMenuItem5.setBackground(Theme.createSelectorDrawable(getThemedColor(i), 3, -1));
        final int i11 = 2;
        actionBarMenuItem5.addSubItem(1, R.drawable.msg_addbot, LocaleController.getString(R.string.StickerCreateEmpty)).setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        final ChatAttachAlert chatAttachAlert = this.f$0;
                        ChatAttachAlert.AnonymousClass19 anonymousClass19 = chatAttachAlert.commentTextView;
                        if (anonymousClass19 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            AIEditorAlert aIEditorAlert = new AIEditorAlert(chatAttachAlert.getContext(), resourcesProvider);
                            aIEditorAlert.setText(anonymousClass19.getText());
                            final int i12 = 0;
                            aIEditorAlert.onUseListener = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i12) {
                                        case 0:
                                            ChatAttachAlert.AnonymousClass19 anonymousClass110 = chatAttachAlert.commentTextView;
                                            anonymousClass110.setText(charSequence);
                                            anonymousClass110.editText.setSelection(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ChatAttachAlert.AnonymousClass21 anonymousClass21 = chatAttachAlert.topCommentTextView;
                                            anonymousClass21.setText(charSequence);
                                            anonymousClass21.editText.setSelection(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j = chatAttachAlert.dialogId;
                            boolean z5 = chatAttachAlert.editingMessageObject != null;
                            ChatAttachAlert$$ExternalSyntheticLambda45 chatAttachAlert$$ExternalSyntheticLambda45 = new ChatAttachAlert$$ExternalSyntheticLambda45(chatAttachAlert, 0);
                            aIEditorAlert.dialogId = j;
                            aIEditorAlert.editing = z5;
                            aIEditorAlert.onSendListener = chatAttachAlert$$ExternalSyntheticLambda45;
                            aIEditorAlert.show();
                            break;
                        }
                        break;
                    case 1:
                        final ChatAttachAlert chatAttachAlert2 = this.f$0;
                        ChatAttachAlert.AnonymousClass21 anonymousClass21 = chatAttachAlert2.topCommentTextView;
                        if (anonymousClass21 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            AIEditorAlert aIEditorAlert2 = new AIEditorAlert(chatAttachAlert2.getContext(), resourcesProvider);
                            aIEditorAlert2.setText(anonymousClass21.getText());
                            final int i13 = 1;
                            aIEditorAlert2.onUseListener = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i13) {
                                        case 0:
                                            ChatAttachAlert.AnonymousClass19 anonymousClass110 = chatAttachAlert2.commentTextView;
                                            anonymousClass110.setText(charSequence);
                                            anonymousClass110.editText.setSelection(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ChatAttachAlert.AnonymousClass21 anonymousClass22 = chatAttachAlert2.topCommentTextView;
                                            anonymousClass22.setText(charSequence);
                                            anonymousClass22.editText.setSelection(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j2 = chatAttachAlert2.dialogId;
                            boolean z6 = chatAttachAlert2.editingMessageObject != null;
                            ChatAttachAlert$$ExternalSyntheticLambda45 chatAttachAlert$$ExternalSyntheticLambda46 = new ChatAttachAlert$$ExternalSyntheticLambda45(chatAttachAlert2, 1);
                            aIEditorAlert2.dialogId = j2;
                            aIEditorAlert2.editing = z6;
                            aIEditorAlert2.onSendListener = chatAttachAlert$$ExternalSyntheticLambda46;
                            aIEditorAlert2.show();
                            break;
                        }
                        break;
                    default:
                        ChatAttachAlert chatAttachAlert3 = this.f$0;
                        chatAttachAlert3.optionsItem.toggleSubMenu(null, null);
                        PhotoViewer photoViewer = PhotoViewer.getInstance();
                        Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                        BaseFragment baseFragment2 = chatAttachAlert3.baseFragment;
                        photoViewer.setParentActivity(null, baseFragment2, resourcesProvider2);
                        PhotoViewer.getInstance().setParentAlert(chatAttachAlert3);
                        PhotoViewer photoViewer2 = PhotoViewer.getInstance();
                        int i14 = chatAttachAlert3.maxSelectedPhotos;
                        boolean z7 = chatAttachAlert3.allowOrder;
                        photoViewer2.maxSelectedPhotos = i14;
                        photoViewer2.allowOrder = z7;
                        if (!chatAttachAlert3.delegate.needEnterComment()) {
                            AndroidUtilities.hideKeyboard(baseFragment2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(chatAttachAlert3.getContainer().findFocus());
                        }
                        File fileMakeCacheFile = StoryEntry.makeCacheFile(chatAttachAlert3.currentAccount, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i15 = point.x;
                        int i16 = point.y;
                        if (i15 > 1080 || i16 > 1080) {
                            float fMin = Math.min(i15, i16) / 1080.0f;
                            i15 = (int) (i15 * fMin);
                            i16 = (int) (i16 * fMin);
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i15, i16, Bitmap.Config.ARGB_8888);
                        try {
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(fileMakeCacheFile));
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                        bitmapCreateBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, fileMakeCacheFile.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.getInstance().openPhotoForSelect(arrayList3, 0, 11, false, chatAttachAlert3.new AnonymousClass11(photoEntry), baseFragment2 instanceof ChatActivity ? (ChatActivity) baseFragment2 : null);
                        if (chatAttachAlert3.isStickerMode) {
                            PhotoViewer.getInstance().enableStickerMode(null, null, true, chatAttachAlert3.customStickerHandler);
                        }
                        break;
                }
            }
        });
        actionBarMenuItem5.setMenuYOffset(AndroidUtilities.dp(-12.0f));
        actionBarMenuItem5.setAdditionalXOffset(AndroidUtilities.dp(12.0f));
        final int i12 = 7;
        actionBarMenuItem5.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout;
                switch (i12) {
                    case 0:
                        ChatAttachAlert chatAttachAlert = this.f$0;
                        long j = chatAttachAlert.selectedId;
                        if (j < 0 && (chatAttachAlertBotWebViewLayout = (ChatAttachAlertBotWebViewLayout) chatAttachAlert.botAttachLayouts.get(-j)) != null) {
                            BotWebViewContainer webViewContainer = chatAttachAlertBotWebViewLayout.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.lastClickMs = System.currentTimeMillis();
                            webViewContainer.notifyEvent("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ChatAttachAlert chatAttachAlert2 = this.f$0;
                        boolean z5 = chatAttachAlert2.captionAbove;
                        if (!z5) {
                            chatAttachAlert2.setCaptionAbove(!z5, true);
                        }
                        break;
                    case 2:
                        ChatAttachAlert chatAttachAlert3 = this.f$0;
                        boolean z6 = chatAttachAlert3.captionAbove;
                        if (z6) {
                            chatAttachAlert3.setCaptionAbove(!z6, true);
                        }
                        break;
                    case 3:
                        this.f$0.onWriteButtonPressed();
                        break;
                    case 4:
                        this.f$0.selectedMenuItem.toggleSubMenu(null, null);
                        break;
                    case 5:
                        this.f$0.lambda$new$3$6();
                        break;
                    case 6:
                        ChatAttachAlert.AttachAlertLayout attachAlertLayout = this.f$0.currentAttachLayout;
                        if (attachAlertLayout != null) {
                            attachAlertLayout.onMenuItemClick(40);
                        }
                        break;
                    case 7:
                        this.f$0.optionsItem.toggleSubMenu(null, null);
                        break;
                    default:
                        ChatAttachAlert chatAttachAlert4 = this.f$0;
                        chatAttachAlert4.updatePhotoPreview(chatAttachAlert4.currentAttachLayout != chatAttachAlert4.photoPreviewLayout);
                        break;
                }
            }
        });
        AnonymousClass12 anonymousClass12 = new AnonymousClass12(context);
        this.headerView = anonymousClass12;
        final int i13 = 8;
        anonymousClass12.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout;
                switch (i13) {
                    case 0:
                        ChatAttachAlert chatAttachAlert = this.f$0;
                        long j = chatAttachAlert.selectedId;
                        if (j < 0 && (chatAttachAlertBotWebViewLayout = (ChatAttachAlertBotWebViewLayout) chatAttachAlert.botAttachLayouts.get(-j)) != null) {
                            BotWebViewContainer webViewContainer = chatAttachAlertBotWebViewLayout.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.lastClickMs = System.currentTimeMillis();
                            webViewContainer.notifyEvent("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ChatAttachAlert chatAttachAlert2 = this.f$0;
                        boolean z5 = chatAttachAlert2.captionAbove;
                        if (!z5) {
                            chatAttachAlert2.setCaptionAbove(!z5, true);
                        }
                        break;
                    case 2:
                        ChatAttachAlert chatAttachAlert3 = this.f$0;
                        boolean z6 = chatAttachAlert3.captionAbove;
                        if (z6) {
                            chatAttachAlert3.setCaptionAbove(!z6, true);
                        }
                        break;
                    case 3:
                        this.f$0.onWriteButtonPressed();
                        break;
                    case 4:
                        this.f$0.selectedMenuItem.toggleSubMenu(null, null);
                        break;
                    case 5:
                        this.f$0.lambda$new$3$6();
                        break;
                    case 6:
                        ChatAttachAlert.AttachAlertLayout attachAlertLayout = this.f$0.currentAttachLayout;
                        if (attachAlertLayout != null) {
                            attachAlertLayout.onMenuItemClick(40);
                        }
                        break;
                    case 7:
                        this.f$0.optionsItem.toggleSubMenu(null, null);
                        break;
                    default:
                        ChatAttachAlert chatAttachAlert4 = this.f$0;
                        chatAttachAlert4.updatePhotoPreview(chatAttachAlert4.currentAttachLayout != chatAttachAlert4.photoPreviewLayout);
                        break;
                }
            }
        });
        anonymousClass12.setAlpha(0.0f);
        anonymousClass12.setVisibility(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.selectedView = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        TextView textView = new TextView(context);
        this.selectedTextView = textView;
        textView.setTextColor(getThemedColor(i4));
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 16));
        ImageView imageView = new ImageView(context);
        this.selectedArrowImageView = imageView;
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
        int themedColor = getThemedColor(i4);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        imageView.setImageDrawable(drawableMutate);
        imageView.setVisibility(8);
        linearLayout.addView(imageView, LayoutHelper.createLinear(-2, -2, 16, 4, 1, 0, 0));
        linearLayout.setAlpha(1.0f);
        anonymousClass12.addView(linearLayout, LayoutHelper.createFrame(-1.0f, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.mediaPreviewView = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        ImageView imageView2 = new ImageView(context);
        Drawable drawableMutate2 = getContext().getResources().getDrawable(R.drawable.attach_arrow_left).mutate();
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i4), mode));
        imageView2.setImageDrawable(drawableMutate2);
        linearLayout2.addView(imageView2, LayoutHelper.createLinear(-2, -2, 16, 0, 1, 4, 0));
        TextView textView2 = new TextView(context);
        this.mediaPreviewTextView = textView2;
        textView2.setTextColor(getThemedColor(i4));
        textView2.setTextSize(1, 16.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setGravity(19);
        textView2.setText(LocaleController.getString("AttachMediaPreview", R.string.AttachMediaPreview));
        linearLayout2.setAlpha(0.0f);
        linearLayout2.addView(textView2, LayoutHelper.createLinear(-2, -2, 16));
        anonymousClass12.addView(linearLayout2, LayoutHelper.createFrame(-1.0f, -2));
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = new ChatAttachAlertPhotoLayout(this, context, z, z3, resourcesProvider);
        this.photoLayout = chatAttachAlertPhotoLayout;
        attachAlertLayoutArr[0] = chatAttachAlertPhotoLayout;
        chatAttachAlertPhotoLayout.setTranslationX(0.0f);
        this.currentAttachLayout = chatAttachAlertPhotoLayout;
        this.selectedId = 1L;
        this.containerView.addView(chatAttachAlertPhotoLayout, LayoutHelper.createFrame(-1.0f, -1));
        ChatActivityFadeView chatActivityFadeView = new ChatActivityFadeView(context);
        this.fadeView = chatActivityFadeView;
        chatActivityFadeView.setup(blurredBackgroundDrawableViewFactory3);
        chatActivityFadeView.setFadeTopAlpha(0);
        chatActivityFadeView.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        chatActivityFadeView.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
        chatActivityFadeView.setFadeZoneTop(AndroidUtilities.dp(5.0f) + ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        this.containerView.addView(chatActivityFadeView, LayoutHelper.createFrame(-1.0f, -1));
        this.containerView.addView(anonymousClass12, LayoutHelper.createFrame(-1, -2.0f, 51, 23.0f, 0.0f, 21.0f, 0.0f));
        IntroActivity.AnonymousClass1 anonymousClass1 = new IntroActivity.AnonymousClass1(context, 7);
        this.topCommentContainer = anonymousClass1;
        this.containerView.addView(anonymousClass1, LayoutHelper.createFrame(-1, -2, 55));
        this.containerView.addView(anonymousClass7, LayoutHelper.createFrame(-2.0f, -1));
        this.containerView.addView(actionBarMenuItem2, LayoutHelper.createFrame(48, 48, 53));
        this.containerView.addView(actionBarMenuItem, LayoutHelper.createFrame(48, 48.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        ActionBarMenuItem actionBarMenuItem6 = this.searchItem;
        if (actionBarMenuItem6 != null) {
            this.containerView.addView(actionBarMenuItem6, LayoutHelper.createFrame(48, 48, 53));
        }
        anonymousClass12.addView(actionBarMenuItem5, LayoutHelper.createFrame(32, 32.0f, 21, 0.0f, 0.0f, 0.0f, 8.0f));
        this.containerView.addView(anonymousClass4, LayoutHelper.createFrame(-2, 48, 53));
        AnonymousClass14 anonymousClass14 = new AnonymousClass14(context);
        this.buttonsRecyclerViewWrapper = anonymousClass14;
        AnonymousClass15 anonymousClass15 = new AnonymousClass15(context, 0);
        this.buttonsRecyclerView = anonymousClass15;
        anonymousClass15.setClipChildren(true);
        anonymousClass15.setClipToPadding(false);
        ButtonsAdapter buttonsAdapter = new ButtonsAdapter(context);
        this.buttonsAdapter = buttonsAdapter;
        anonymousClass15.setAdapter(buttonsAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.buttonsLayoutManager = linearLayoutManager;
        anonymousClass15.setLayoutManager(linearLayoutManager);
        anonymousClass15.setVerticalScrollBarEnabled(false);
        anonymousClass15.setHorizontalScrollBarEnabled(false);
        anonymousClass15.setItemAnimator(null);
        anonymousClass15.setLayoutAnimation(null);
        anonymousClass15.setGlowColor(getThemedColor(Theme.key_dialogScrollGlow));
        anonymousClass15.adaptiveOverScroll = true;
        anonymousClass15.setOverScrollMode(2);
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory4 = this.iBlur3FactoryLiquidGlass;
        ViewPositionWatcher viewPositionWatcher = new ViewPositionWatcher(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        blurredBackgroundDrawableViewFactory4.viewPositionWatcher = viewPositionWatcher;
        blurredBackgroundDrawableViewFactory4.parent = viewGroup2;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory5 = this.iBlur3FactoryFrostedLiquidGlass;
        ViewPositionWatcher viewPositionWatcher2 = new ViewPositionWatcher(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        blurredBackgroundDrawableViewFactory5.viewPositionWatcher = viewPositionWatcher2;
        blurredBackgroundDrawableViewFactory5.parent = viewGroup3;
        ViewPositionWatcher viewPositionWatcher3 = new ViewPositionWatcher(this.containerView);
        ViewGroup viewGroup4 = this.containerView;
        blurredBackgroundDrawableViewFactory3.viewPositionWatcher = viewPositionWatcher3;
        blurredBackgroundDrawableViewFactory3.parent = viewGroup4;
        final int i14 = 0;
        ?? r9 = new View(this, context) {
            public final ChatAttachAlert this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void draw(Canvas canvas) {
                switch (i14) {
                    case 0:
                        super.draw(canvas);
                        this.this$0.bottomFadeDrawable.draw(canvas);
                        break;
                    default:
                        super.draw(canvas);
                        break;
                }
            }

            @Override
            public void onDraw(Canvas canvas) {
                switch (i14) {
                    case 1:
                        ChatAttachAlert chatAttachAlert = this.this$0;
                        String str = String.format("%d", Integer.valueOf(Math.max(1, chatAttachAlert.currentAttachLayout.getSelectedItemsCount())));
                        int iCeil = (int) Math.ceil(chatAttachAlert.textPaint.measureText(str));
                        int iMax = Math.max(AndroidUtilities.dp(16.0f) + iCeil, AndroidUtilities.dp(24.0f));
                        int measuredWidth = getMeasuredWidth() / 2;
                        int themedColor2 = chatAttachAlert.getThemedColor(Theme.key_dialogRoundCheckBoxCheck);
                        chatAttachAlert.textPaint.setColor(ColorUtils.setAlphaComponent(themedColor2, (int) (((((double) chatAttachAlert.sendButtonEnabledProgress) * 0.42d) + 0.58d) * ((double) Color.alpha(themedColor2)))));
                        chatAttachAlert.paint.setColor(chatAttachAlert.getThemedColor(Theme.key_dialogBackground));
                        int i15 = iMax / 2;
                        int i16 = measuredWidth - i15;
                        int i17 = i15 + measuredWidth;
                        chatAttachAlert.rect.set(i16, 0.0f, i17, getMeasuredHeight());
                        canvas.drawRoundRect(chatAttachAlert.rect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), chatAttachAlert.paint);
                        chatAttachAlert.paint.setColor(chatAttachAlert.getThemedColor(Theme.key_chat_attachCheckBoxBackground));
                        chatAttachAlert.rect.set(AndroidUtilities.dp(2.0f) + i16, AndroidUtilities.dp(2.0f), i17 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                        canvas.drawRoundRect(chatAttachAlert.rect, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), chatAttachAlert.paint);
                        canvas.drawText(str, measuredWidth - (iCeil / 2), AndroidUtilities.dp(16.2f), chatAttachAlert.textPaint);
                        break;
                    default:
                        super.onDraw(canvas);
                        break;
                }
            }

            @Override
            public void onSizeChanged(int i15, int i16, int i17, int i18) {
                switch (i14) {
                    case 0:
                        super.onSizeChanged(i15, i16, i17, i18);
                        this.this$0.bottomFadeDrawable.setBounds(0, (i16 - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(48.0f), i15, i16);
                        break;
                    default:
                        super.onSizeChanged(i15, i16, i17, i18);
                        break;
                }
            }
        };
        this.bottomFadeView = r9;
        BlurredBackgroundWithFadeDrawable blurredBackgroundWithFadeDrawable = new BlurredBackgroundWithFadeDrawable(blurredBackgroundDrawableViewFactory3.create(r9, null, false));
        this.bottomFadeDrawable = blurredBackgroundWithFadeDrawable;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        blurredBackgroundWithFadeDrawable.setFadeHeight(AndroidUtilities.dp(72.0f), true);
        this.containerView.addView((View) r9, LayoutHelper.createFrame(-1.0f, -1));
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = this.iBlur3FactoryLiquidGlass.create(anonymousClass14, BlurredBackgroundProviderImpl.mainTabs(resourcesProvider), false);
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(28.0f));
        blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(7.0f));
        anonymousClass14.setBackground(blurredBackgroundDrawableCreate);
        anonymousClass15.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        anonymousClass15.setClipToOutline(true);
        int iDp = AndroidUtilities.dp(11.0f);
        float fDp = AndroidUtilities.dp(28.0f);
        RichEditor.AnonymousClass5 anonymousClass8 = ViewOutlineProviderImpl.BOUNDS_OVAL;
        anonymousClass15.setOutlineProvider(new ViewOutlineProviderImpl.AnonymousClass5(iDp, fDp));
        anonymousClass15.setImportantForAccessibility(1);
        anonymousClass14.addView(anonymousClass15, LayoutHelper.createFrame(-1.0f, -1));
        this.containerView.addView(anonymousClass14, LayoutHelper.createFrame(-1, 70, 81));
        anonymousClass15.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda0(6, this, resourcesProvider));
        anonymousClass15.setOnItemLongClickListener(new ChatAttachAlert$$ExternalSyntheticLambda1(this, 2));
        final int i15 = 0;
        AnimatedTextView animatedTextView = new AnimatedTextView(context, true, false, true);
        this.botMainButtonTextView = animatedTextView;
        animatedTextView.setVisibility(8);
        animatedTextView.setAlpha(0.0f);
        animatedTextView.setGravity(17);
        animatedTextView.setTypeface(AndroidUtilities.bold());
        int iDp2 = AndroidUtilities.dp(16.0f);
        animatedTextView.setPadding(iDp2, 0, iDp2, 0);
        animatedTextView.setTextSize(AndroidUtilities.dp(f));
        animatedTextView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout;
                switch (i15) {
                    case 0:
                        ChatAttachAlert chatAttachAlert = this.f$0;
                        long j = chatAttachAlert.selectedId;
                        if (j < 0 && (chatAttachAlertBotWebViewLayout = (ChatAttachAlertBotWebViewLayout) chatAttachAlert.botAttachLayouts.get(-j)) != null) {
                            BotWebViewContainer webViewContainer = chatAttachAlertBotWebViewLayout.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.lastClickMs = System.currentTimeMillis();
                            webViewContainer.notifyEvent("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ChatAttachAlert chatAttachAlert2 = this.f$0;
                        boolean z5 = chatAttachAlert2.captionAbove;
                        if (!z5) {
                            chatAttachAlert2.setCaptionAbove(!z5, true);
                        }
                        break;
                    case 2:
                        ChatAttachAlert chatAttachAlert3 = this.f$0;
                        boolean z6 = chatAttachAlert3.captionAbove;
                        if (z6) {
                            chatAttachAlert3.setCaptionAbove(!z6, true);
                        }
                        break;
                    case 3:
                        this.f$0.onWriteButtonPressed();
                        break;
                    case 4:
                        this.f$0.selectedMenuItem.toggleSubMenu(null, null);
                        break;
                    case 5:
                        this.f$0.lambda$new$3$6();
                        break;
                    case 6:
                        ChatAttachAlert.AttachAlertLayout attachAlertLayout = this.f$0.currentAttachLayout;
                        if (attachAlertLayout != null) {
                            attachAlertLayout.onMenuItemClick(40);
                        }
                        break;
                    case 7:
                        this.f$0.optionsItem.toggleSubMenu(null, null);
                        break;
                    default:
                        ChatAttachAlert chatAttachAlert4 = this.f$0;
                        chatAttachAlert4.updatePhotoPreview(chatAttachAlert4.currentAttachLayout != chatAttachAlert4.photoPreviewLayout);
                        break;
                }
            }
        });
        this.containerView.addView(animatedTextView, LayoutHelper.createFrame(-1, 48, 83));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.botProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        this.containerView.addView(radialProgressView, LayoutHelper.createFrame(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        ImageView imageView3 = new ImageView(context);
        this.moveCaptionButton = imageView3;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        int themedColor2 = getThemedColor(Theme.key_windowBackgroundWhiteGrayText2);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(themedColor2, mode2));
        imageView3.setImageResource(R.drawable.menu_link_above);
        imageView3.setVisibility(8);
        final int i16 = 1;
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout;
                switch (i16) {
                    case 0:
                        ChatAttachAlert chatAttachAlert = this.f$0;
                        long j = chatAttachAlert.selectedId;
                        if (j < 0 && (chatAttachAlertBotWebViewLayout = (ChatAttachAlertBotWebViewLayout) chatAttachAlert.botAttachLayouts.get(-j)) != null) {
                            BotWebViewContainer webViewContainer = chatAttachAlertBotWebViewLayout.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.lastClickMs = System.currentTimeMillis();
                            webViewContainer.notifyEvent("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ChatAttachAlert chatAttachAlert2 = this.f$0;
                        boolean z5 = chatAttachAlert2.captionAbove;
                        if (!z5) {
                            chatAttachAlert2.setCaptionAbove(!z5, true);
                        }
                        break;
                    case 2:
                        ChatAttachAlert chatAttachAlert3 = this.f$0;
                        boolean z6 = chatAttachAlert3.captionAbove;
                        if (z6) {
                            chatAttachAlert3.setCaptionAbove(!z6, true);
                        }
                        break;
                    case 3:
                        this.f$0.onWriteButtonPressed();
                        break;
                    case 4:
                        this.f$0.selectedMenuItem.toggleSubMenu(null, null);
                        break;
                    case 5:
                        this.f$0.lambda$new$3$6();
                        break;
                    case 6:
                        ChatAttachAlert.AttachAlertLayout attachAlertLayout = this.f$0.currentAttachLayout;
                        if (attachAlertLayout != null) {
                            attachAlertLayout.onMenuItemClick(40);
                        }
                        break;
                    case 7:
                        this.f$0.optionsItem.toggleSubMenu(null, null);
                        break;
                    default:
                        ChatAttachAlert chatAttachAlert4 = this.f$0;
                        chatAttachAlert4.updatePhotoPreview(chatAttachAlert4.currentAttachLayout != chatAttachAlert4.photoPreviewLayout);
                        break;
                }
            }
        });
        AnonymousClass17 anonymousClass17 = new AnonymousClass17(context);
        this.frameLayout2 = anonymousClass17;
        AnonymousClass18 anonymousClass18 = new AnonymousClass18(this, context);
        this.captionContainer = anonymousClass18;
        anonymousClass17.addView(anonymousClass18, LayoutHelper.createFrame(-1, -1, 119));
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate2 = this.iBlur3FactoryFrostedLiquidGlass.create(anonymousClass5, BlurredBackgroundProviderImpl.topPanel(resourcesProvider), false);
        this.emojiViewChildBg = blurredBackgroundDrawableCreate2;
        blurredBackgroundDrawableCreate2.inAppKeyboardOptimization = true;
        blurredBackgroundDrawableCreate2.setRadius(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        int iDp3 = AndroidUtilities.dp(32.0f);
        BlurredBackgroundDrawable.Props props = blurredBackgroundDrawableCreate2.boundProps;
        props.liquidThickness = iDp3;
        blurredBackgroundDrawableCreate2.onBoundPropsChanged();
        props.liquidIntensity = 0.4f;
        blurredBackgroundDrawableCreate2.onBoundPropsChanged();
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate3 = this.iBlur3FactoryLiquidGlass.create(anonymousClass18, BlurredBackgroundProviderImpl.topPanel(resourcesProvider), false);
        this.captionContainerBg = blurredBackgroundDrawableCreate3;
        blurredBackgroundDrawableCreate3.setRadius(AndroidUtilities.dp(22.0f));
        blurredBackgroundDrawableCreate3.setPadding(AndroidUtilities.dp(7.0f));
        anonymousClass18.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(5.0f));
        anonymousClass17.setWillNotDraw(false);
        anonymousClass17.setVisibility(4);
        anonymousClass17.setAlpha(0.0f);
        this.containerView.addView(anonymousClass17, LayoutHelper.createFrame(-1, -2, 83));
        anonymousClass17.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(12));
        AnimatedTextView animatedTextView2 = new AnimatedTextView(context, false, false, false);
        this.captionLimitView = animatedTextView2;
        animatedTextView2.setAllowCancel(true);
        animatedTextView2.setScaleProperty(0.6f);
        animatedTextView2.setVisibility(8);
        animatedTextView2.setTextSize(AndroidUtilities.dp(15.0f));
        int i17 = Theme.key_windowBackgroundWhiteGrayText;
        animatedTextView2.setTextColor(getThemedColor(i17));
        animatedTextView2.setTypeface(AndroidUtilities.bold());
        animatedTextView2.setGravity(17);
        anonymousClass18.addView(animatedTextView2, LayoutHelper.createFrame(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 50.0f));
        ImageView imageView4 = new ImageView(context);
        this.aiButton = imageView4;
        AiButtonDrawable aiButtonDrawable = new AiButtonDrawable(context);
        this.aiButtonIcon = aiButtonDrawable;
        imageView4.setImageDrawable(aiButtonDrawable);
        imageView4.setScaleType(scaleType);
        int i18 = Theme.key_glass_defaultIcon;
        imageView4.setColorFilter(new PorterDuffColorFilter(getThemedColor(i18), mode));
        int i19 = Theme.key_listSelector;
        imageView4.setBackground(Theme.createSelectorDrawable(getThemedColor(i19), 1, AndroidUtilities.dp(16.0f)));
        anonymousClass18.addView(imageView4, LayoutHelper.createFrame(44, 44.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        int i20 = R.string.AIEditor;
        imageView4.setContentDescription(LocaleController.getString(i20));
        ScaleStateListAnimator.apply(imageView4, 0.1f, 1.5f);
        final int i21 = 0;
        imageView4.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i21) {
                    case 0:
                        final ChatAttachAlert chatAttachAlert = this.f$0;
                        ChatAttachAlert.AnonymousClass19 anonymousClass19 = chatAttachAlert.commentTextView;
                        if (anonymousClass19 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            AIEditorAlert aIEditorAlert = new AIEditorAlert(chatAttachAlert.getContext(), resourcesProvider);
                            aIEditorAlert.setText(anonymousClass19.getText());
                            final int i110 = 0;
                            aIEditorAlert.onUseListener = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i110) {
                                        case 0:
                                            ChatAttachAlert.AnonymousClass19 anonymousClass110 = chatAttachAlert.commentTextView;
                                            anonymousClass110.setText(charSequence);
                                            anonymousClass110.editText.setSelection(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ChatAttachAlert.AnonymousClass21 anonymousClass22 = chatAttachAlert.topCommentTextView;
                                            anonymousClass22.setText(charSequence);
                                            anonymousClass22.editText.setSelection(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j = chatAttachAlert.dialogId;
                            boolean z5 = chatAttachAlert.editingMessageObject != null;
                            ChatAttachAlert$$ExternalSyntheticLambda45 chatAttachAlert$$ExternalSyntheticLambda45 = new ChatAttachAlert$$ExternalSyntheticLambda45(chatAttachAlert, 0);
                            aIEditorAlert.dialogId = j;
                            aIEditorAlert.editing = z5;
                            aIEditorAlert.onSendListener = chatAttachAlert$$ExternalSyntheticLambda45;
                            aIEditorAlert.show();
                            break;
                        }
                        break;
                    case 1:
                        final ChatAttachAlert chatAttachAlert2 = this.f$0;
                        ChatAttachAlert.AnonymousClass21 anonymousClass21 = chatAttachAlert2.topCommentTextView;
                        if (anonymousClass21 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            AIEditorAlert aIEditorAlert2 = new AIEditorAlert(chatAttachAlert2.getContext(), resourcesProvider);
                            aIEditorAlert2.setText(anonymousClass21.getText());
                            final int i111 = 1;
                            aIEditorAlert2.onUseListener = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i111) {
                                        case 0:
                                            ChatAttachAlert.AnonymousClass19 anonymousClass110 = chatAttachAlert2.commentTextView;
                                            anonymousClass110.setText(charSequence);
                                            anonymousClass110.editText.setSelection(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ChatAttachAlert.AnonymousClass21 anonymousClass22 = chatAttachAlert2.topCommentTextView;
                                            anonymousClass22.setText(charSequence);
                                            anonymousClass22.editText.setSelection(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j2 = chatAttachAlert2.dialogId;
                            boolean z6 = chatAttachAlert2.editingMessageObject != null;
                            ChatAttachAlert$$ExternalSyntheticLambda45 chatAttachAlert$$ExternalSyntheticLambda46 = new ChatAttachAlert$$ExternalSyntheticLambda45(chatAttachAlert2, 1);
                            aIEditorAlert2.dialogId = j2;
                            aIEditorAlert2.editing = z6;
                            aIEditorAlert2.onSendListener = chatAttachAlert$$ExternalSyntheticLambda46;
                            aIEditorAlert2.show();
                            break;
                        }
                        break;
                    default:
                        ChatAttachAlert chatAttachAlert3 = this.f$0;
                        chatAttachAlert3.optionsItem.toggleSubMenu(null, null);
                        PhotoViewer photoViewer = PhotoViewer.getInstance();
                        Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                        BaseFragment baseFragment2 = chatAttachAlert3.baseFragment;
                        photoViewer.setParentActivity(null, baseFragment2, resourcesProvider2);
                        PhotoViewer.getInstance().setParentAlert(chatAttachAlert3);
                        PhotoViewer photoViewer2 = PhotoViewer.getInstance();
                        int i112 = chatAttachAlert3.maxSelectedPhotos;
                        boolean z7 = chatAttachAlert3.allowOrder;
                        photoViewer2.maxSelectedPhotos = i112;
                        photoViewer2.allowOrder = z7;
                        if (!chatAttachAlert3.delegate.needEnterComment()) {
                            AndroidUtilities.hideKeyboard(baseFragment2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(chatAttachAlert3.getContainer().findFocus());
                        }
                        File fileMakeCacheFile = StoryEntry.makeCacheFile(chatAttachAlert3.currentAccount, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i113 = point.x;
                        int i114 = point.y;
                        if (i113 > 1080 || i114 > 1080) {
                            float fMin = Math.min(i113, i114) / 1080.0f;
                            i113 = (int) (i113 * fMin);
                            i114 = (int) (i114 * fMin);
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i113, i114, Bitmap.Config.ARGB_8888);
                        try {
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(fileMakeCacheFile));
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                        bitmapCreateBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, fileMakeCacheFile.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.getInstance().openPhotoForSelect(arrayList3, 0, 11, false, chatAttachAlert3.new AnonymousClass11(photoEntry), baseFragment2 instanceof ChatActivity ? (ChatActivity) baseFragment2 : null);
                        if (chatAttachAlert3.isStickerMode) {
                            PhotoViewer.getInstance().enableStickerMode(null, null, true, chatAttachAlert3.customStickerHandler);
                        }
                        break;
                }
            }
        });
        imageView4.setVisibility(8);
        imageView4.setAlpha(0.0f);
        imageView4.setScaleX(0.6f);
        imageView4.setScaleY(0.6f);
        this.currentLimit = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
        AnonymousClass19 anonymousClass19 = new AnonymousClass19(context, anonymousClass5, resourcesProvider);
        this.commentTextView = anonymousClass19;
        anonymousClass19.includeNavigationBar = true;
        int i22 = R.string.AddCaption;
        anonymousClass19.setHint(LocaleController.getString("AddCaption", i22));
        anonymousClass19.onResume();
        anonymousClass19.getEditText().setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 19, 48.0f, 0.0f, 36.0f, 0.0f));
        anonymousClass19.getEditText().addTextChangedListener(new AnonymousClass20());
        anonymousClass18.addView(anonymousClass19, LayoutHelper.createFrame(-1, -2.0f, 83, 0.0f, 0.0f, 84.0f, 0.0f));
        anonymousClass18.setClipChildren(false);
        anonymousClass17.setClipChildren(false);
        anonymousClass19.setClipChildren(false);
        anonymousClass1.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        anonymousClass1.setWillNotDraw(false);
        ?? r6 = new EditTextEmoji(context, anonymousClass5, resourcesProvider) {
            @Override
            public final void createEmojiView() {
                super.createEmojiView();
                EmojiView emojiView = getEmojiView();
                if (emojiView != null) {
                    emojiView.shouldLightenBackground = false;
                    emojiView.fixBottomTabContainerTranslation = false;
                    emojiView.setShouldDrawBackground(false);
                    emojiView.setBottomInset(AndroidUtilities.navigationBarHeight);
                }
            }

            @Override
            public final void extendActionMode(Menu menu) {
                BaseFragment baseFragment2 = ChatAttachAlert.this.baseFragment;
                if (baseFragment2 instanceof ChatActivity) {
                    ChatActivity.fillActionModeMenu(menu, ((ChatActivity) baseFragment2).currentEncryptedChat, true, true, true, true);
                }
            }

            @Override
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                if (!chatAttachAlert.enterCommentEventSent) {
                    float x = motionEvent.getX();
                    AnonymousClass21 anonymousClass21 = chatAttachAlert.topCommentTextView;
                    if (x <= anonymousClass21.getEditText().getLeft() || motionEvent.getX() >= anonymousClass21.getEditText().getRight() || motionEvent.getY() <= anonymousClass21.getEditText().getTop() || motionEvent.getY() >= anonymousClass21.getEditText().getBottom()) {
                        chatAttachAlert.makeFocusable(anonymousClass21.getEditText(), false);
                    } else {
                        chatAttachAlert.makeFocusable(anonymousClass21.getEditText(), true);
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public final void onLayout(boolean z5, int i23, int i24, int i25, int i26) {
                super.onLayout(z5, i23, i24, i25, i26);
                ChatAttachAlert.this.updatedTopCaptionHeight();
            }

            @Override
            public final void onLineCountChanged(int i23, int i24) {
                ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                chatAttachAlert.updatedTopCaptionHeight();
                if (chatAttachAlert.captionAbove) {
                    chatAttachAlert.showAiButton$1(i24 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
                }
            }
        };
        this.topCommentTextView = r6;
        r6.includeNavigationBar = true;
        r6.getEditText().addTextChangedListener(new AnonymousClass22(baseFragment));
        r6.getEditText().setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
        r6.getEditText().setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 19, 48.0f, 0.0f, 96.0f, 0.0f));
        r6.getEditText().setTextSize(1, 17.0f);
        r6.getEmojiButton().setLayoutParams(LayoutHelper.createFrame(40, 40.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        r6.setHint(LocaleController.getString("AddCaption", i22));
        anonymousClass1.addView((View) r6, LayoutHelper.createFrame(-1, -2, 119));
        anonymousClass1.setAlpha(0.0f);
        anonymousClass1.setVisibility(8);
        anonymousClass19.addView(imageView3, LayoutHelper.createFrame(40, 40.0f, 85, 0.0f, 0.0f, 0.0f, 4.0f));
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate4 = this.iBlur3FactoryLiquidGlass.create(anonymousClass1, BlurredBackgroundProviderImpl.topPanel(resourcesProvider), false);
        blurredBackgroundDrawableCreate4.setRadius(AndroidUtilities.dp(22.0f));
        blurredBackgroundDrawableCreate4.setPadding(AndroidUtilities.dp(7.0f));
        anonymousClass1.setBackground(blurredBackgroundDrawableCreate4);
        anonymousClass1.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(9.0f));
        AnimatedTextView animatedTextView3 = new AnimatedTextView(context, false, false, false);
        this.topCaptionLimitView = animatedTextView3;
        animatedTextView3.setScaleProperty(0.6f);
        animatedTextView3.setVisibility(8);
        animatedTextView3.setTextSize(AndroidUtilities.dp(15.0f));
        animatedTextView3.setTextColor(getThemedColor(i17));
        animatedTextView3.setTypeface(AndroidUtilities.bold());
        animatedTextView3.setGravity(17);
        animatedTextView3.setAllowCancel(true);
        anonymousClass1.addView(animatedTextView3, LayoutHelper.createFrame(56, 20.0f, 53, 3.0f, 45.0f, 3.0f, 0.0f));
        ImageView imageView5 = new ImageView(context);
        imageView5.setScaleType(scaleType);
        imageView5.setImageResource(R.drawable.menu_link_below);
        imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_messagePanelIcons), mode2));
        r6.addView(imageView5, LayoutHelper.createFrame(40, 40.0f, 85, 0.0f, 0.0f, 60.0f, 0.0f));
        final int i23 = 2;
        imageView5.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout;
                switch (i23) {
                    case 0:
                        ChatAttachAlert chatAttachAlert = this.f$0;
                        long j = chatAttachAlert.selectedId;
                        if (j < 0 && (chatAttachAlertBotWebViewLayout = (ChatAttachAlertBotWebViewLayout) chatAttachAlert.botAttachLayouts.get(-j)) != null) {
                            BotWebViewContainer webViewContainer = chatAttachAlertBotWebViewLayout.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.lastClickMs = System.currentTimeMillis();
                            webViewContainer.notifyEvent("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ChatAttachAlert chatAttachAlert2 = this.f$0;
                        boolean z5 = chatAttachAlert2.captionAbove;
                        if (!z5) {
                            chatAttachAlert2.setCaptionAbove(!z5, true);
                        }
                        break;
                    case 2:
                        ChatAttachAlert chatAttachAlert3 = this.f$0;
                        boolean z6 = chatAttachAlert3.captionAbove;
                        if (z6) {
                            chatAttachAlert3.setCaptionAbove(!z6, true);
                        }
                        break;
                    case 3:
                        this.f$0.onWriteButtonPressed();
                        break;
                    case 4:
                        this.f$0.selectedMenuItem.toggleSubMenu(null, null);
                        break;
                    case 5:
                        this.f$0.lambda$new$3$6();
                        break;
                    case 6:
                        ChatAttachAlert.AttachAlertLayout attachAlertLayout = this.f$0.currentAttachLayout;
                        if (attachAlertLayout != null) {
                            attachAlertLayout.onMenuItemClick(40);
                        }
                        break;
                    case 7:
                        this.f$0.optionsItem.toggleSubMenu(null, null);
                        break;
                    default:
                        ChatAttachAlert chatAttachAlert4 = this.f$0;
                        chatAttachAlert4.updatePhotoPreview(chatAttachAlert4.currentAttachLayout != chatAttachAlert4.photoPreviewLayout);
                        break;
                }
            }
        });
        ImageView imageView6 = new ImageView(context);
        this.topAiButton = imageView6;
        AiButtonDrawable aiButtonDrawable2 = new AiButtonDrawable(context);
        this.topAiButtonIcon = aiButtonDrawable2;
        imageView6.setImageDrawable(aiButtonDrawable2);
        imageView6.setScaleType(scaleType);
        imageView6.setColorFilter(new PorterDuffColorFilter(getThemedColor(i18), mode));
        imageView6.setBackground(Theme.createSelectorDrawable(getThemedColor(i19), 1, AndroidUtilities.dp(16.0f)));
        anonymousClass1.addView(imageView6, LayoutHelper.createFrame(44, 44.0f, 85, 0.0f, 1.0f, 0.0f, 0.0f));
        imageView6.setContentDescription(LocaleController.getString(i20));
        ScaleStateListAnimator.apply(imageView6, 0.1f, 1.5f);
        final int i24 = 1;
        imageView6.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i24) {
                    case 0:
                        final ChatAttachAlert chatAttachAlert = this.f$0;
                        ChatAttachAlert.AnonymousClass19 anonymousClass110 = chatAttachAlert.commentTextView;
                        if (anonymousClass110 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            AIEditorAlert aIEditorAlert = new AIEditorAlert(chatAttachAlert.getContext(), resourcesProvider);
                            aIEditorAlert.setText(anonymousClass110.getText());
                            final int i110 = 0;
                            aIEditorAlert.onUseListener = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i110) {
                                        case 0:
                                            ChatAttachAlert.AnonymousClass19 anonymousClass111 = chatAttachAlert.commentTextView;
                                            anonymousClass111.setText(charSequence);
                                            anonymousClass111.editText.setSelection(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ChatAttachAlert.AnonymousClass21 anonymousClass22 = chatAttachAlert.topCommentTextView;
                                            anonymousClass22.setText(charSequence);
                                            anonymousClass22.editText.setSelection(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j = chatAttachAlert.dialogId;
                            boolean z5 = chatAttachAlert.editingMessageObject != null;
                            ChatAttachAlert$$ExternalSyntheticLambda45 chatAttachAlert$$ExternalSyntheticLambda45 = new ChatAttachAlert$$ExternalSyntheticLambda45(chatAttachAlert, 0);
                            aIEditorAlert.dialogId = j;
                            aIEditorAlert.editing = z5;
                            aIEditorAlert.onSendListener = chatAttachAlert$$ExternalSyntheticLambda45;
                            aIEditorAlert.show();
                            break;
                        }
                        break;
                    case 1:
                        final ChatAttachAlert chatAttachAlert2 = this.f$0;
                        ChatAttachAlert.AnonymousClass21 anonymousClass21 = chatAttachAlert2.topCommentTextView;
                        if (anonymousClass21 != null) {
                            MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
                            AIEditorAlert aIEditorAlert2 = new AIEditorAlert(chatAttachAlert2.getContext(), resourcesProvider);
                            aIEditorAlert2.setText(anonymousClass21.getText());
                            final int i111 = 1;
                            aIEditorAlert2.onUseListener = new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    CharSequence charSequence = (CharSequence) obj;
                                    switch (i111) {
                                        case 0:
                                            ChatAttachAlert.AnonymousClass19 anonymousClass111 = chatAttachAlert2.commentTextView;
                                            anonymousClass111.setText(charSequence);
                                            anonymousClass111.editText.setSelection(charSequence.length(), charSequence.length());
                                            break;
                                        default:
                                            ChatAttachAlert.AnonymousClass21 anonymousClass22 = chatAttachAlert2.topCommentTextView;
                                            anonymousClass22.setText(charSequence);
                                            anonymousClass22.editText.setSelection(charSequence.length(), charSequence.length());
                                            break;
                                    }
                                }
                            };
                            long j2 = chatAttachAlert2.dialogId;
                            boolean z6 = chatAttachAlert2.editingMessageObject != null;
                            ChatAttachAlert$$ExternalSyntheticLambda45 chatAttachAlert$$ExternalSyntheticLambda46 = new ChatAttachAlert$$ExternalSyntheticLambda45(chatAttachAlert2, 1);
                            aIEditorAlert2.dialogId = j2;
                            aIEditorAlert2.editing = z6;
                            aIEditorAlert2.onSendListener = chatAttachAlert$$ExternalSyntheticLambda46;
                            aIEditorAlert2.show();
                            break;
                        }
                        break;
                    default:
                        ChatAttachAlert chatAttachAlert3 = this.f$0;
                        chatAttachAlert3.optionsItem.toggleSubMenu(null, null);
                        PhotoViewer photoViewer = PhotoViewer.getInstance();
                        Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                        BaseFragment baseFragment2 = chatAttachAlert3.baseFragment;
                        photoViewer.setParentActivity(null, baseFragment2, resourcesProvider2);
                        PhotoViewer.getInstance().setParentAlert(chatAttachAlert3);
                        PhotoViewer photoViewer2 = PhotoViewer.getInstance();
                        int i112 = chatAttachAlert3.maxSelectedPhotos;
                        boolean z7 = chatAttachAlert3.allowOrder;
                        photoViewer2.maxSelectedPhotos = i112;
                        photoViewer2.allowOrder = z7;
                        if (!chatAttachAlert3.delegate.needEnterComment()) {
                            AndroidUtilities.hideKeyboard(baseFragment2.getFragmentView().findFocus());
                            AndroidUtilities.hideKeyboard(chatAttachAlert3.getContainer().findFocus());
                        }
                        File fileMakeCacheFile = StoryEntry.makeCacheFile(chatAttachAlert3.currentAccount, "webp");
                        Point point = AndroidUtilities.displaySize;
                        int i113 = point.x;
                        int i114 = point.y;
                        if (i113 > 1080 || i114 > 1080) {
                            float fMin = Math.min(i113, i114) / 1080.0f;
                            i113 = (int) (i113 * fMin);
                            i114 = (int) (i114 * fMin);
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i113, i114, Bitmap.Config.ARGB_8888);
                        try {
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(fileMakeCacheFile));
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                        bitmapCreateBitmap.recycle();
                        ArrayList arrayList3 = new ArrayList();
                        MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, fileMakeCacheFile.getAbsolutePath(), 0, false, 0, 0, 0L);
                        arrayList3.add(photoEntry);
                        PhotoViewer.getInstance().openPhotoForSelect(arrayList3, 0, 11, false, chatAttachAlert3.new AnonymousClass11(photoEntry), baseFragment2 instanceof ChatActivity ? (ChatActivity) baseFragment2 : null);
                        if (chatAttachAlert3.isStickerMode) {
                            PhotoViewer.getInstance().enableStickerMode(null, null, true, chatAttachAlert3.customStickerHandler);
                        }
                        break;
                }
            }
        });
        imageView6.setVisibility(8);
        imageView6.setAlpha(0.0f);
        imageView6.setScaleX(0.6f);
        imageView6.setScaleY(0.6f);
        ChatActivity.AnonymousClass60 anonymousClass60 = new ChatActivity.AnonymousClass60(this, context, 8);
        this.writeButtonContainer = anonymousClass60;
        anonymousClass60.setFocusable(true);
        anonymousClass60.setFocusableInTouchMode(true);
        anonymousClass60.setVisibility(4);
        anonymousClass60.setScaleX(0.2f);
        anonymousClass60.setScaleY(0.2f);
        anonymousClass60.setAlpha(0.0f);
        anonymousClass60.setClipChildren(false);
        anonymousClass60.setClipToPadding(false);
        this.containerView.addView(anonymousClass60, LayoutHelper.createFrame(110, 50, 85));
        ?? r7 = new ChatActivityEnterView.SendButton(R.drawable.send_plane_24, context, resourcesProvider) {
            @Override
            public final int getFillColor() {
                return this.getThemedColor(Theme.key_dialogFloatingButton);
            }

            @Override
            public final boolean isInactive() {
                return !this.sendButtonEnabled;
            }

            @Override
            public final boolean isOpen() {
                return true;
            }
        };
        this.writeButton = r7;
        r7.setImportantForAccessibility(2);
        anonymousClass60.addView((View) r7, LayoutHelper.createFrame(-1, -1, 119));
        r7.setTranslationX(this.backgroundPaddingLeft);
        int iDp4 = AndroidUtilities.dp(52.0f);
        int iDp5 = AndroidUtilities.dp(38.0f);
        r7.circleWidth = iDp4;
        r7.circleHeight = iDp5;
        float fDp2 = AndroidUtilities.dp(7.0f);
        float fDp3 = AndroidUtilities.dp(6.0f);
        r7.circlePadX = fDp2;
        r7.circlePadY = fDp3;
        r7.newCounterPos = true;
        final int i25 = 3;
        r7.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout;
                switch (i25) {
                    case 0:
                        ChatAttachAlert chatAttachAlert = this.f$0;
                        long j = chatAttachAlert.selectedId;
                        if (j < 0 && (chatAttachAlertBotWebViewLayout = (ChatAttachAlertBotWebViewLayout) chatAttachAlert.botAttachLayouts.get(-j)) != null) {
                            BotWebViewContainer webViewContainer = chatAttachAlertBotWebViewLayout.getWebViewContainer();
                            webViewContainer.getClass();
                            webViewContainer.lastClickMs = System.currentTimeMillis();
                            webViewContainer.notifyEvent("main_button_pressed", null);
                            break;
                        }
                        break;
                    case 1:
                        ChatAttachAlert chatAttachAlert2 = this.f$0;
                        boolean z5 = chatAttachAlert2.captionAbove;
                        if (!z5) {
                            chatAttachAlert2.setCaptionAbove(!z5, true);
                        }
                        break;
                    case 2:
                        ChatAttachAlert chatAttachAlert3 = this.f$0;
                        boolean z6 = chatAttachAlert3.captionAbove;
                        if (z6) {
                            chatAttachAlert3.setCaptionAbove(!z6, true);
                        }
                        break;
                    case 3:
                        this.f$0.onWriteButtonPressed();
                        break;
                    case 4:
                        this.f$0.selectedMenuItem.toggleSubMenu(null, null);
                        break;
                    case 5:
                        this.f$0.lambda$new$3$6();
                        break;
                    case 6:
                        ChatAttachAlert.AttachAlertLayout attachAlertLayout = this.f$0.currentAttachLayout;
                        if (attachAlertLayout != null) {
                            attachAlertLayout.onMenuItemClick(40);
                        }
                        break;
                    case 7:
                        this.f$0.optionsItem.toggleSubMenu(null, null);
                        break;
                    default:
                        ChatAttachAlert chatAttachAlert4 = this.f$0;
                        chatAttachAlert4.updatePhotoPreview(chatAttachAlert4.currentAttachLayout != chatAttachAlert4.photoPreviewLayout);
                        break;
                }
            }
        });
        r7.setOnLongClickListener(new ChatActivity$$ExternalSyntheticLambda147(this, context, resourcesProvider, baseFragment, 1));
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        final int i26 = 1;
        View view = new View(this, context) {
            public final ChatAttachAlert this$0;

            {
                this.this$0 = this;
            }

            @Override
            public void draw(Canvas canvas) {
                switch (i26) {
                    case 0:
                        super.draw(canvas);
                        this.this$0.bottomFadeDrawable.draw(canvas);
                        break;
                    default:
                        super.draw(canvas);
                        break;
                }
            }

            @Override
            public void onDraw(Canvas canvas) {
                switch (i26) {
                    case 1:
                        ChatAttachAlert chatAttachAlert = this.this$0;
                        String str = String.format("%d", Integer.valueOf(Math.max(1, chatAttachAlert.currentAttachLayout.getSelectedItemsCount())));
                        int iCeil = (int) Math.ceil(chatAttachAlert.textPaint.measureText(str));
                        int iMax = Math.max(AndroidUtilities.dp(16.0f) + iCeil, AndroidUtilities.dp(24.0f));
                        int measuredWidth = getMeasuredWidth() / 2;
                        int themedColor3 = chatAttachAlert.getThemedColor(Theme.key_dialogRoundCheckBoxCheck);
                        chatAttachAlert.textPaint.setColor(ColorUtils.setAlphaComponent(themedColor3, (int) (((((double) chatAttachAlert.sendButtonEnabledProgress) * 0.42d) + 0.58d) * ((double) Color.alpha(themedColor3)))));
                        chatAttachAlert.paint.setColor(chatAttachAlert.getThemedColor(Theme.key_dialogBackground));
                        int i110 = iMax / 2;
                        int i111 = measuredWidth - i110;
                        int i112 = i110 + measuredWidth;
                        chatAttachAlert.rect.set(i111, 0.0f, i112, getMeasuredHeight());
                        canvas.drawRoundRect(chatAttachAlert.rect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), chatAttachAlert.paint);
                        chatAttachAlert.paint.setColor(chatAttachAlert.getThemedColor(Theme.key_chat_attachCheckBoxBackground));
                        chatAttachAlert.rect.set(AndroidUtilities.dp(2.0f) + i111, AndroidUtilities.dp(2.0f), i112 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                        canvas.drawRoundRect(chatAttachAlert.rect, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), chatAttachAlert.paint);
                        canvas.drawText(str, measuredWidth - (iCeil / 2), AndroidUtilities.dp(16.2f), chatAttachAlert.textPaint);
                        break;
                    default:
                        super.onDraw(canvas);
                        break;
                }
            }

            @Override
            public void onSizeChanged(int i110, int i111, int i112, int i113) {
                switch (i26) {
                    case 0:
                        super.onSizeChanged(i110, i111, i112, i113);
                        this.this$0.bottomFadeDrawable.setBounds(0, (i111 - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(48.0f), i110, i111);
                        break;
                    default:
                        super.onSizeChanged(i110, i111, i112, i113);
                        break;
                }
            }
        };
        view.setAlpha(0.0f);
        view.setScaleX(0.2f);
        view.setScaleY(0.2f);
        if (z) {
            checkColors();
            this.navBarColorKey = -1;
        }
        RecyclerListView.FastScroll fastScroll = chatAttachAlertPhotoLayout.gridView.getFastScroll();
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory6 = this.iBlur3FactoryLiquidGlass;
        BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder = BlurredBackgroundProviderImpl.topPanel(resourcesProvider);
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate5 = blurredBackgroundDrawableViewFactory6.create(RecyclerListView.this.fastScroll, blurredBackgroundProviderBuilder, false);
        fastScroll.blurredCircleDrawable = blurredBackgroundDrawableCreate5;
        blurredBackgroundDrawableCreate5.setPadding(AndroidUtilities.dp(4.0f));
        fastScroll.blurredCircleDrawable.setRadius(AndroidUtilities.dp(24.0f));
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate6 = blurredBackgroundDrawableViewFactory6.create(RecyclerListView.this.fastScroll, blurredBackgroundProviderBuilder, false);
        fastScroll.blurredTagDrawable = blurredBackgroundDrawableCreate6;
        blurredBackgroundDrawableCreate6.setPadding(AndroidUtilities.dp(6.0f));
        BlurredBackgroundDrawable blurredBackgroundDrawable = fastScroll.blurredTagDrawable;
        blurredBackgroundDrawable.boundProps.liquidThickness = AndroidUtilities.dp(4.0f);
        blurredBackgroundDrawable.onBoundPropsChanged();
        fastScroll.blurredTagDrawable.setRadius(AndroidUtilities.dp(f));
        PasscodeView passcodeView = new PasscodeView(context);
        this.passcodeView = passcodeView;
        this.containerView.addView(passcodeView, LayoutHelper.createFrame(-1.0f, -1));
        BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder2 = new BlurredBackgroundProviderBuilder(resourcesProvider);
        blurredBackgroundProviderBuilder2.backgroundColor = new ChatAttachAlert$$ExternalSyntheticLambda1(this, 4);
        blurredBackgroundProviderBuilder2.strokeColorTop = new ChatAttachAlert$$ExternalSyntheticLambda1(this, 5);
        blurredBackgroundProviderBuilder2.strokeColorBottom = new ChatAttachAlert$$ExternalSyntheticLambda1(this, 6);
        blurredBackgroundProviderBuilder2.shadowColor = new ChatAttachAlert$$ExternalSyntheticLambda1(this, 7);
        float fDpf2 = AndroidUtilities.dpf2(3.3333333f);
        float fDpf3 = AndroidUtilities.dpf2(0.6666667f);
        blurredBackgroundProviderBuilder2.shadowRadius = fDpf2;
        blurredBackgroundProviderBuilder2.shadowDy = fDpf3;
        float fDpf4 = AndroidUtilities.dpf2(1.0f);
        float fDpf5 = AndroidUtilities.dpf2(0.6666667f);
        blurredBackgroundProviderBuilder2.strokeWidthTop = fDpf4;
        blurredBackgroundProviderBuilder2.strokeWidthBottom = fDpf5;
        anonymousClass7.setupGlass(this.iBlur3FactoryLiquidGlass, blurredBackgroundProviderBuilder2, false);
        replaceAnimator.replace(1L, false);
    }

    public static void access$11800(ChatAttachAlert chatAttachAlert) {
        AnonymousClass7 anonymousClass7;
        int alpha;
        ChatActivityFadeView chatActivityFadeView = chatAttachAlert.fadeView;
        if (chatActivityFadeView == null || (anonymousClass7 = chatAttachAlert.actionBar) == null) {
            return;
        }
        Theme.ResourcesProvider resourcesProvider = chatAttachAlert.resourcesProvider;
        boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
        if (anonymousClass7.getVisibility() == 0) {
            alpha = (int) (anonymousClass7.getAlpha() * (zIsDark ? 255 : 160));
        } else {
            alpha = 0;
        }
        chatActivityFadeView.setFadeTopAlpha(alpha);
    }

    public static void access$13500(ChatAttachAlert chatAttachAlert) {
        AnonymousClass36 anonymousClass36 = new AnonymousClass36(chatAttachAlert, chatAttachAlert.getContext(), chatAttachAlert.dialogId, LaunchActivity.getLastFragment(), chatAttachAlert.resourcesProvider, 0);
        chatAttachAlert.mentionContainer = anonymousClass36;
        anonymousClass36.withDelegate(new Stripe.AnonymousClass1(chatAttachAlert, 25));
        ViewGroup viewGroup = chatAttachAlert.containerView;
        viewGroup.addView(chatAttachAlert.mentionContainer, viewGroup.indexOfChild(chatAttachAlert.frameLayout2), LayoutHelper.createFrame(-1, -1, 83));
        AnonymousClass36 anonymousClass37 = chatAttachAlert.mentionContainer;
        anonymousClass37.getAdapter().allowStickers = false;
        anonymousClass37.getAdapter().allowBots = false;
        anonymousClass37.getAdapter().allowChats = false;
        BaseFragment baseFragment = chatAttachAlert.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            anonymousClass37.getAdapter().searchInDialogs = false;
            ChatActivity chatActivity = (ChatActivity) baseFragment;
            MentionsAdapter adapter = anonymousClass37.getAdapter();
            chatActivity.getCurrentUser();
            TLRPC.Chat chat = chatActivity.currentChat;
            adapter.getClass();
            adapter.chat = chat;
            anonymousClass37.getAdapter().setChatInfo(chatActivity.chatInfo);
            anonymousClass37.getAdapter().needUsernames = chatActivity.currentChat != null;
        } else {
            anonymousClass37.getAdapter().searchInDialogs = true;
            anonymousClass37.getAdapter().setChatInfo(null);
            anonymousClass37.getAdapter().needUsernames = false;
        }
        anonymousClass37.getAdapter().needBotContext = false;
        chatAttachAlert.updateCommentTextViewPosition();
    }

    public final void applyCaption() {
        if (getCommentView().editText.length() <= 0) {
            return;
        }
        this.currentAttachLayout.applyCaption(getCommentView().getText());
    }

    public final void blur3_InvalidateBlur$1() {
        DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
        boolean z;
        if (Build.VERSION.SDK_INT < 31 || (downscaleScrollableNoiseSuppressor = this.scrollableViewNoiseSuppressor) == null) {
            return;
        }
        ViewGroup viewGroup = this.containerView;
        RectF rectF = this.iBlur3PositionMainTabs;
        ViewPositionWatcher.computeRectInParent(this.buttonsRecyclerViewWrapper, viewGroup, rectF);
        RectF rectF2 = this.iBlur3PositionActionBar;
        rectF2.set(0.0f, 0.0f, this.containerView.getMeasuredWidth(), this.actionBar.getMeasuredHeight());
        rectF2.inset(0.0f, -AndroidUtilities.dp(48.0f));
        rectF.set(0.0f, this.containerView.getMeasuredHeight() - (AndroidUtilities.dp(180.0f) + Math.max(AndroidUtilities.navigationBarHeight, getEmojiPadding$1())), this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (attachAlertLayout != chatAttachAlertPhotoLayout || chatAttachAlertPhotoLayout == null) {
            z = false;
        } else {
            ChatAttachAlertPhotoLayout.AnonymousClass3 anonymousClass3 = chatAttachAlertPhotoLayout.gridView;
            if (anonymousClass3.getFastScroll() != null) {
                RecyclerListView.FastScroll fastScroll = anonymousClass3.getFastScroll();
                RectF rectF3 = this.iBlur3PositionFastScroll;
                if (fastScroll.blurredCircleDrawable != null || fastScroll.blurredTagDrawable != null) {
                    rectF3.set(fastScroll.blurredTagDrawable.getBounds());
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.set(fastScroll.blurredCircleDrawable.getBounds());
                    rectF3.union(rectF4);
                }
                RecyclerListView.FastScroll fastScroll2 = anonymousClass3.getFastScroll();
                ViewGroup viewGroup2 = this.containerView;
                RectF rectF5 = AndroidUtilities.rectTmp;
                ViewPositionWatcher.computeRectInParent(fastScroll2, viewGroup2, rectF5);
                rectF3.offset(rectF5.left, rectF5.top);
                rectF3.inset(-AndroidUtilities.dp(48.0f), -AndroidUtilities.dp(48.0f));
                rectF3.left = Math.max(0.0f, rectF3.left);
                rectF3.right = Math.min(this.containerView.getMeasuredWidth(), rectF3.right);
                z = true;
            } else {
                z = false;
            }
        }
        ArrayList arrayList = this.iBlur3Positions;
        int i = z ? 3 : 2;
        ArrayList arrayList2 = this.iBlur3PositionsMerged;
        downscaleScrollableNoiseSuppressor.setupRenderNodes(FBool.mergeOverlapping(arrayList, i, arrayList2), arrayList2);
        downscaleScrollableNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
    }

    @Override
    public final boolean canDismiss() {
        return true;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return this.currentAttachLayout.canDismissWithTouchOutside();
    }

    @Override
    public final void cancelSheetAnimation() {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            SpringAnimation springAnimation = this.appearSpringAnimation;
            if (springAnimation != null) {
                springAnimation.cancel();
            }
            AnimatorSet animatorSet2 = this.buttonsAnimation;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.currentSheetAnimation = null;
            this.currentSheetAnimationType = 0;
        }
    }

    public final boolean checkCanRemoveRestrictionsByBoosts() {
        BaseFragment baseFragment = this.baseFragment;
        return (baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).checkCanRemoveRestrictionsByBoosts();
    }

    public final void checkColors() {
        AnonymousClass15 anonymousClass15 = this.buttonsRecyclerView;
        if (anonymousClass15 == null) {
            return;
        }
        int childCount = anonymousClass15.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = anonymousClass15.getChildAt(i);
            if (!(childAt instanceof AttachButton)) {
                boolean z = childAt instanceof AttachBotButton;
            }
        }
        boolean z2 = this.forceDarkTheme;
        this.selectedTextView.setTextColor(getThemedColor(z2 ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack));
        this.mediaPreviewTextView.setTextColor(getThemedColor(z2 ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack));
        this.doneItem.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
        int themedColor = getThemedColor(z2 ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack);
        ActionBarMenuItem actionBarMenuItem = this.selectedMenuItem;
        actionBarMenuItem.setIconColor(themedColor);
        Theme.setDrawableColor(getThemedColor(z2 ? Theme.key_voipgroup_actionBarItemsSelector : Theme.key_dialogButtonSelector), actionBarMenuItem.getBackground());
        int i2 = Theme.key_actionBarDefaultSubmenuItem;
        actionBarMenuItem.setPopupItemsColor(getThemedColor(i2), false);
        actionBarMenuItem.setPopupItemsColor(getThemedColor(i2), true);
        actionBarMenuItem.redrawPopup(getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
        ActionBarMenuItem actionBarMenuItem2 = this.motionItem;
        if (actionBarMenuItem2 != null) {
            actionBarMenuItem2.setIconColor(getThemedColor(z2 ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack));
        }
        ActionBarMenuItem actionBarMenuItem3 = this.searchItem;
        if (actionBarMenuItem3 != null) {
            actionBarMenuItem3.setIconColor(getThemedColor(z2 ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack));
            Theme.setDrawableColor(getThemedColor(z2 ? Theme.key_voipgroup_actionBarItemsSelector : Theme.key_dialogButtonSelector), actionBarMenuItem3.getBackground());
        }
        AnonymousClass19 anonymousClass19 = this.commentTextView;
        int i3 = anonymousClass19.currentStyle;
        Theme.ResourcesProvider resourcesProvider = anonymousClass19.resourcesProvider;
        EditTextEmoji.AnonymousClass2 anonymousClass2 = anonymousClass19.editText;
        if (i3 == 0) {
            anonymousClass2.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText, resourcesProvider));
            int i4 = Theme.key_windowBackgroundWhiteBlackText;
            anonymousClass2.setCursorColor(Theme.getColor(i4, resourcesProvider));
            anonymousClass2.setTextColor(Theme.getColor(i4, resourcesProvider));
        } else if (i3 == 2 || i3 == 3) {
            anonymousClass2.setHintTextColor(-1929379841);
            anonymousClass2.setTextColor(-1);
            anonymousClass2.setCursorColor(-1);
            anonymousClass2.setHandlesColor(-1);
            anonymousClass2.setHighlightColor(822083583);
            anonymousClass2.quoteColor = -1;
        } else {
            anonymousClass2.setHintTextColor(Theme.getColor(Theme.key_dialogTextHint, resourcesProvider));
            anonymousClass2.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        }
        anonymousClass19.emojiIconDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_messagePanelIcons, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        EditTextEmoji.AnonymousClass6 anonymousClass6 = anonymousClass19.emojiView;
        if (anonymousClass6 != null) {
            anonymousClass6.updateColors$1();
        }
        anonymousClass15.setGlowColor(getThemedColor(Theme.key_dialogScrollGlow));
        int themedColor2 = getThemedColor(z2 ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack);
        AnonymousClass7 anonymousClass7 = this.actionBar;
        anonymousClass7.setItemsColor(themedColor2, false);
        anonymousClass7.setItemsBackgroundColor(getThemedColor(z2 ? Theme.key_voipgroup_actionBarItemsSelector : Theme.key_dialogButtonSelector), false);
        anonymousClass7.setTitleColor(getThemedColor(z2 ? Theme.key_voipgroup_actionBarItems : Theme.key_dialogTextBlack));
        int shadowDrawableColor = getShadowDrawableColor(false);
        Theme.setDrawableColor(shadowDrawableColor, this.shadowDrawable);
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = this.iBlur3SourceColor;
        if (blurredBackgroundSourceColor.paint.getColor() != shadowDrawableColor) {
            blurredBackgroundSourceColor.paint.setColor(shadowDrawableColor);
            ChatActivityFadeView chatActivityFadeView = this.fadeView;
            if (chatActivityFadeView != null) {
                chatActivityFadeView.invalidate();
            }
            AnonymousClass16 anonymousClass16 = this.bottomFadeView;
            if (anonymousClass16 != null) {
                anonymousClass16.invalidate();
            }
        }
        this.containerView.invalidate();
        int i5 = 0;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i5 >= attachAlertLayoutArr.length) {
                break;
            }
            AttachAlertLayout attachAlertLayout = attachAlertLayoutArr[i5];
            if (attachAlertLayout != null) {
                attachAlertLayout.checkColors();
            }
            i5++;
        }
        if (Build.VERSION.SDK_INT < 30) {
            fixNavigationBar(getThemedColor(Theme.key_dialogBackground));
            return;
        }
        this.navBarColorKey = -1;
        this.navBarColor = getThemedColor(Theme.key_dialogBackgroundGray);
        AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(Theme.key_dialogBackground), false);
        AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
    }

    public final void checkIsEphemeralMessage$1(boolean z) {
        boolean z2;
        MessageObject messageObject;
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment == null || !(baseFragment instanceof ChatActivity)) {
            return;
        }
        ChatActivity chatActivity = (ChatActivity) baseFragment;
        EditTextEmoji editTextEmoji = this.captionAbove ? this.topCommentTextView : this.commentTextView;
        String string = editTextEmoji != null ? editTextEmoji.getText().toString() : null;
        if (this.editingMessageObject == null) {
            AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
            z2 = true;
            if ((attachAlertLayout != null && attachAlertLayout.getSelectedItemsCount() > 1) || (EphemeralMessagesHelper.getInstance(this.currentAccount).getEphemeralCommandBotId(string, chatActivity.botInfo) <= 0 && ((messageObject = chatActivity.replyingMessageObject) == null || !messageObject.isEphemeral()))) {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        this.animatorEphemeralMessageVisibility.setValue(z2, z);
        if (z2 && isCaptionAbove()) {
            setCaptionAbove(false, z);
        }
    }

    public final void checkUi_bottomFade() {
        float f = this.animatorCaptionVisible.floatValue;
        setTranslationY(AndroidUtilities.dp(48.0f) * Math.min(Math.min(1.0f, 1.0f - ((1.0f - f) * (1.0f - this.animatorActionBarVisible.floatValue))), 1.0f - ((1.0f - this.animatorCaptionAbove.floatValue) * f)));
    }

    public final void checkUi_moveCaptionButtonVisibility() {
        FragmentFloatingButton.setAnimatedVisibility(this.moveCaptionButton, MediaController$$ExternalSyntheticOutline0.m(this.animatorCaptionNotEmpty.floatValue, this.animatorToggleCaptionSupported.floatValue, FBool.not(this.animatorEphemeralMessageVisibility.floatValue), this.restrictEphemeralMessageTypes ? 0.0f : 1.0f));
    }

    public final void checkUi_writeButtonContainerY() {
        AnonymousClass24 anonymousClass24 = this.writeButton;
        ChatActivity.AnonymousClass60 anonymousClass60 = this.writeButtonContainer;
        IntroActivity.AnonymousClass1 anonymousClass1 = this.topCommentContainer;
        if (anonymousClass1 == null || anonymousClass1.getVisibility() != 0 || anonymousClass1.getAlpha() == 0.0f) {
            anonymousClass60.setTranslationY(this.bottomPannelTranslation);
            anonymousClass24.setAlpha(1.0f);
            return;
        }
        float f = this.animatorCaptionAbove.floatValue;
        float fAbs = Math.abs(AndroidUtilities.lerp(-1.0f, 1.0f, f));
        anonymousClass24.setAlpha(MediaController$$ExternalSyntheticOutline0.m(fAbs, fAbs, fAbs, fAbs));
        anonymousClass60.setTranslationY(AndroidUtilities.lerp(this.bottomPannelTranslation, ((anonymousClass1.getTranslationY() + anonymousClass1.getTop()) - anonymousClass60.getTop()) + AndroidUtilities.dp(8.0f), CubicBezierInterpolator.EASE_BOTH.getInterpolation(f)));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.reloadInlineHints && i != NotificationCenter.attachMenuBotsDidLoad && i != NotificationCenter.quickRepliesUpdated) {
            if (i == NotificationCenter.currentUserPremiumStatusChanged) {
                this.currentLimit = MessagesController.getInstance(UserConfig.selectedAccount).getCaptionMaxLengthLimit();
            }
        } else {
            ButtonsAdapter buttonsAdapter = this.buttonsAdapter;
            if (buttonsAdapter != null) {
                buttonsAdapter.notifyDataSetChanged();
            }
        }
    }

    @Override
    public final void dismiss(boolean z) {
        if (z) {
            this.allowPassConfirmationAlert = z;
        }
        lambda$showGiftOfferSheet$15();
    }

    @Override
    public void dismissInternal() {
        ChatAttachViewDelegate chatAttachViewDelegate = this.delegate;
        if (chatAttachViewDelegate != null) {
            chatAttachViewDelegate.doOnIdle(new ChatAttachAlert$$ExternalSyntheticLambda7(this, 0));
        } else {
            removeFromRoot();
        }
    }

    @Override
    public final void dismissWithButtonClick(int i) {
        super.dismissWithButtonClick(i);
        this.currentAttachLayout.onDismissWithButtonClick(i);
    }

    public final void enablePollAttachMode(int i) {
        this.typeButtonsAvailable = true;
        this.buttonsRecyclerViewWrapper.setVisibility(0);
        this.isPollAttach = true;
        this.pollAllowedLayouts = i;
        this.avatarPicker = 0;
        this.isPhotoPicker = false;
        this.isStickerMode = false;
        this.customStickerHandler = null;
        ActionBarMenuItem actionBarMenuItem = this.optionsItem;
        if (actionBarMenuItem != null) {
            this.selectedTextView.setTranslationY(0.0f);
            actionBarMenuItem.setVisibility(8);
        }
    }

    public final void enableStickerMode(CallLogActivity$$ExternalSyntheticLambda3 callLogActivity$$ExternalSyntheticLambda3) {
        String string = LocaleController.getString(R.string.ChoosePhotoForSticker);
        TextView textView = this.selectedTextView;
        textView.setText(string);
        this.typeButtonsAvailable = false;
        this.buttonsRecyclerViewWrapper.setVisibility(8);
        this.avatarPicker = 1;
        this.isPhotoPicker = true;
        this.isStickerMode = true;
        this.allowLivePhotos = false;
        this.customStickerHandler = callLogActivity$$ExternalSyntheticLambda3;
        ActionBarMenuItem actionBarMenuItem = this.optionsItem;
        if (actionBarMenuItem != null) {
            textView.setTranslationY(-AndroidUtilities.dp(8.0f));
            actionBarMenuItem.setVisibility(0);
            actionBarMenuItem.setClickable(true);
            actionBarMenuItem.setAlpha(1.0f);
            actionBarMenuItem.setScaleX(1.0f);
            actionBarMenuItem.setScaleY(1.0f);
        }
    }

    public final int getAdditionalMessagesCount() {
        MessagePreviewParams messagePreviewParams;
        BaseFragment baseFragment = this.baseFragment;
        if (!(baseFragment instanceof ChatActivity) || (messagePreviewParams = ((ChatActivity) baseFragment).messagePreviewParams) == null) {
            return 0;
        }
        return messagePreviewParams.getForwardedMessagesCount();
    }

    public final TLRPC.Chat getChat() {
        BaseFragment baseFragment = this.baseFragment;
        return baseFragment instanceof ChatActivity ? ((ChatActivity) baseFragment).currentChat : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
    }

    public final float getClipLayoutBottom() {
        AnonymousClass17 anonymousClass17 = this.frameLayout2;
        return anonymousClass17.getMeasuredHeight() - ((1.0f - anonymousClass17.getAlpha()) * (anonymousClass17.getMeasuredHeight() - AndroidUtilities.dp(84.0f)));
    }

    public final EditTextEmoji getCommentView() {
        AttachAlertLayout attachAlertLayout;
        return (this.captionAbove && ((attachAlertLayout = this.currentAttachLayout) == this.photoLayout || attachAlertLayout == this.photoPreviewLayout)) ? this.topCommentTextView : this.commentTextView;
    }

    public final long getDialogId() {
        BaseFragment baseFragment = this.baseFragment;
        return baseFragment instanceof ChatActivity ? ((ChatActivity) baseFragment).getDialogId() : this.dialogId;
    }

    public final int getEmojiPadding$1() {
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        ChatAttachAlertPollLayout chatAttachAlertPollLayout = this.pollLayout;
        if (attachAlertLayout == chatAttachAlertPollLayout && chatAttachAlertPollLayout.emojiView != null) {
            return chatAttachAlertPollLayout.getEmojiPadding();
        }
        ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = this.todoLayout;
        if (attachAlertLayout != chatAttachAlertPollLayout2 || chatAttachAlertPollLayout2.emojiView == null) {
            return this.captionAbove ? getEmojiPadding() : this.commentTextView.getEmojiPadding();
        }
        return chatAttachAlertPollLayout2.getEmojiPadding();
    }

    public final int getScrollOffsetY(int i) {
        AttachAlertLayout attachAlertLayout = this.nextAttachLayout;
        int[] iArr = this.scrollOffsetY;
        return (attachAlertLayout == null || !((this.currentAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview) || (attachAlertLayout instanceof ChatAttachAlertPhotoLayoutPreview))) ? iArr[i] : AndroidUtilities.lerp(iArr[0], iArr[1], this.translationProgress);
    }

    public final int getShadowDrawableColor(boolean z) {
        AnonymousClass7 anonymousClass7;
        if (this.forceDarkTheme) {
            return getThemedColor(Theme.key_voipgroup_listViewBackground);
        }
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
        ArrayList arrayList = this.animatorCurrentVisibleLayout.list.entries;
        int size = arrayList.size();
        int i = 0;
        float visibility = 0.0f;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAnimator.Entry entry = (ListAnimator.Entry) obj;
            long jLongValue = ((Long) entry.item).longValue();
            if (jLongValue == 1 || jLongValue == 3 || jLongValue == 4 || jLongValue == 5 || jLongValue == 6 || jLongValue == 9 || jLongValue == 11 || jLongValue == 12) {
                visibility += entry.getVisibility();
            }
        }
        float fClamp = MathUtils.clamp(visibility, 0.0f, 1.0f);
        if (z && (anonymousClass7 = this.actionBar) != null && anonymousClass7.getVisibility() == 0) {
            fClamp *= 1.0f - anonymousClass7.getAlpha();
        }
        return ColorUtils.blendARGB(fClamp, getThemedColor(Theme.key_dialogBackground), getThemedColor(zIsDark ? Theme.key_windowBackgroundGray : Theme.key_dialogBackgroundGray));
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList<ThemeDescription> themeDescriptions;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i >= attachAlertLayoutArr.length) {
                arrayList.add(new ThemeDescription(this.container, 0, null, null, null, null, Theme.key_dialogBackgroundGray));
                return arrayList;
            }
            AttachAlertLayout attachAlertLayout = attachAlertLayoutArr[i];
            if (attachAlertLayout != null && (themeDescriptions = attachAlertLayout.getThemeDescriptions()) != null) {
                arrayList.addAll(themeDescriptions);
            }
            i++;
        }
    }

    public final void init() {
        TLRPC.User user;
        TLRPC.Chat chat;
        AttachAlertLayout attachAlertLayout;
        this.effectId = 0L;
        setEffect(0L);
        int i = 0;
        this.botButtonWasVisible = false;
        this.botButtonProgressWasVisible = false;
        this.botMainButtonOffsetY = 0.0f;
        this.botMainButtonTextView.setVisibility(8);
        RadialProgressView radialProgressView = this.botProgressView;
        radialProgressView.setAlpha(0.0f);
        radialProgressView.setScaleX(0.1f);
        radialProgressView.setScaleY(0.1f);
        radialProgressView.setVisibility(8);
        AnonymousClass14 anonymousClass14 = this.buttonsRecyclerViewWrapper;
        anonymousClass14.setAlpha(1.0f);
        anonymousClass14.setTranslationY(0.0f);
        int i2 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.botAttachLayouts;
            if (i2 >= longSparseArray.size()) {
                break;
            }
            ((ChatAttachAlertBotWebViewLayout) longSparseArray.valueAt(i2)).setMeasureOffsetY(0);
            i2++;
        }
        int i3 = this.avatarPicker;
        BaseFragment baseFragment = this.baseFragment;
        if (i3 == 2) {
            user = null;
            chat = null;
        } else if (baseFragment instanceof ChatActivity) {
            ChatActivity chatActivity = (ChatActivity) baseFragment;
            chat = chatActivity.currentChat;
            user = chatActivity.getCurrentUser();
        } else {
            long j = this.dialogId;
            int i4 = this.currentAccount;
            if (j >= 0) {
                user = MessagesController.getInstance(i4).getUser(Long.valueOf(this.dialogId));
                chat = null;
            } else if (j < 0) {
                chat = MessagesController.getInstance(i4).getChat(Long.valueOf(-this.dialogId));
                user = null;
            } else {
                user = null;
                chat = null;
            }
        }
        boolean z = baseFragment instanceof ChatActivity;
        if ((z && this.avatarPicker != 2) || chat != null || user != null) {
            if (chat != null) {
                this.photosEnabled = ChatObject.canSendPhoto(chat);
                this.videosEnabled = ChatObject.canSendVideo(chat);
                this.musicEnabled = ChatObject.canSendMusic(chat);
                this.pollsEnabled = ChatObject.canSendPolls(chat);
                this.todoEnabled = !ChatObject.isChannelAndNotMegaGroup(chat) && ChatObject.canSendPolls(chat);
                this.plainTextEnabled = ChatObject.canSendPlain(chat);
                this.documentsEnabled = ChatObject.canSendDocument(chat);
            } else {
                this.pollsEnabled = UserObject.isBot(user) || UserObject.isUserSelf(user);
                this.todoEnabled = !z || ((ChatActivity) baseFragment).currentEncryptedChat == null;
            }
        }
        if (this.restrictEphemeralMessageTypes) {
            this.pollsEnabled = false;
            this.todoEnabled = false;
        }
        AnonymousClass19 anonymousClass19 = this.commentTextView;
        if (!z || this.avatarPicker == 2) {
            anonymousClass19.setVisibility(this.allowEnterCaption ? 0 : 4);
        }
        boolean z2 = this.videosEnabled;
        boolean z3 = this.photosEnabled;
        boolean z4 = this.documentsEnabled;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        chatAttachAlertPhotoLayout.getClass();
        boolean z5 = z2 || z3;
        chatAttachAlertPhotoLayout.mediaEnabled = z5;
        chatAttachAlertPhotoLayout.videoEnabled = z2;
        chatAttachAlertPhotoLayout.photoEnabled = z3;
        chatAttachAlertPhotoLayout.documentsEnabled = z4;
        ChatAttachAlertPhotoLayout.CameraViewInternal cameraViewInternal = chatAttachAlertPhotoLayout.cameraView;
        if (cameraViewInternal != null) {
            cameraViewInternal.setAlpha(z5 ? 1.0f : 0.2f);
            chatAttachAlertPhotoLayout.cameraView.setEnabled(chatAttachAlertPhotoLayout.mediaEnabled);
        }
        ChatAttachAlert chatAttachAlert = chatAttachAlertPhotoLayout.parentAlert;
        boolean z6 = chatAttachAlert.baseFragment instanceof ChatActivity;
        EmptyTextProgressView emptyTextProgressView = chatAttachAlertPhotoLayout.progressView;
        if ((z6 || chatAttachAlert.getChat() != null) && chatAttachAlert.avatarPicker == 0) {
            chatAttachAlertPhotoLayout.galleryAlbumEntry = MediaController.allMediaAlbumEntry;
            if (chatAttachAlertPhotoLayout.mediaEnabled) {
                emptyTextProgressView.setText(LocaleController.getString(R.string.NoPhotos));
                emptyTextProgressView.setLottie(0, 0, 0);
            } else {
                TLRPC.Chat chat2 = chatAttachAlert.getChat();
                emptyTextProgressView.setLottie(R.raw.media_forbidden, 150, 150);
                if (ChatObject.isActionBannedByDefault(chat2, 7)) {
                    emptyTextProgressView.setText(LocaleController.getString(R.string.GlobalAttachMediaRestricted));
                } else if (AndroidUtilities.isBannedForever(chat2.banned_rights)) {
                    emptyTextProgressView.setText(LocaleController.formatString("AttachMediaRestrictedForever", R.string.AttachMediaRestrictedForever, new Object[0]));
                } else {
                    emptyTextProgressView.setText(LocaleController.formatString("AttachMediaRestricted", R.string.AttachMediaRestricted, LocaleController.formatDateForBan(chat2.banned_rights.until_date)));
                }
            }
        } else if (chatAttachAlertPhotoLayout.shouldLoadAllMedia()) {
            chatAttachAlertPhotoLayout.galleryAlbumEntry = MediaController.allMediaAlbumEntry;
        } else {
            chatAttachAlertPhotoLayout.galleryAlbumEntry = MediaController.allPhotosAlbumEntry;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            chatAttachAlertPhotoLayout.noGalleryPermissions = chatAttachAlertPhotoLayout.isNoGalleryPermissions();
        }
        if (chatAttachAlertPhotoLayout.galleryAlbumEntry != null) {
            for (int i5 = 0; i5 < Math.min(100, chatAttachAlertPhotoLayout.galleryAlbumEntry.photos.size()); i5++) {
                chatAttachAlertPhotoLayout.galleryAlbumEntry.photos.get(i5).reset();
            }
        }
        chatAttachAlertPhotoLayout.clearSelectedPhotos();
        chatAttachAlertPhotoLayout.updatePhotosCounter(false);
        PhotoViewer.AnonymousClass36 anonymousClass36 = chatAttachAlertPhotoLayout.cameraPhotoLayoutManager;
        anonymousClass36.scrollToPositionWithOffset(0, 1000000, anonymousClass36.mShouldReverseLayout);
        StickersAlert.AnonymousClass7 anonymousClass7 = chatAttachAlertPhotoLayout.layoutManager;
        anonymousClass7.scrollToPositionWithOffset(0, 1000000, anonymousClass7.mShouldReverseLayout);
        chatAttachAlertPhotoLayout.dropDown.setText(LocaleController.getString(R.string.ChatGallery));
        MediaController.AlbumEntry albumEntry = chatAttachAlertPhotoLayout.galleryAlbumEntry;
        chatAttachAlertPhotoLayout.selectedAlbumEntry = albumEntry;
        if (albumEntry != null) {
            chatAttachAlertPhotoLayout.loading = false;
            if (emptyTextProgressView != null) {
                emptyTextProgressView.showTextView();
            }
        }
        chatAttachAlertPhotoLayout.updateAlbumsDropDown();
        anonymousClass19.hidePopup(true);
        hidePopup(true);
        this.enterCommentEventSent = false;
        setFocusable(false);
        if (this.isStoryLocationPicker || this.isLocationPicker) {
            if (this.locationLayout == null) {
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = new ChatAttachAlertLocationLayout(this, getContext(), this.resourcesProvider, (this.isPollAttach || this.isLocationPicker || this.restrictEphemeralMessageTypes) ? false : true);
                this.locationLayout = chatAttachAlertLocationLayout;
                this.layouts[5] = chatAttachAlertLocationLayout;
                ChatAttachAlertLocationLayout.LocationActivityDelegate locationActivityDelegate = this.locationActivityDelegate;
                if (locationActivityDelegate != null) {
                    chatAttachAlertLocationLayout.setDelegate(locationActivityDelegate);
                } else {
                    chatAttachAlertLocationLayout.setDelegate(new ChatAttachAlert$$ExternalSyntheticLambda1(this, i));
                }
            }
            this.selectedId = 5L;
            attachAlertLayout = this.locationLayout;
        } else if (this.isSoundPicker) {
            openDocumentsLayout(false);
            attachAlertLayout = this.documentLayout;
            this.selectedId = 4L;
        } else {
            MessageObject messageObject = this.editingMessageObject;
            if (messageObject != null) {
                int i6 = this.editType;
                if (i6 == -1) {
                    this.typeButtonsAvailable = true;
                    if (messageObject.isMusic()) {
                        openAudioLayout(false);
                        attachAlertLayout = this.audioLayout;
                        this.selectedId = 3L;
                    } else if (this.editingMessageObject.isDocument()) {
                        openDocumentsLayout(false);
                        attachAlertLayout = this.documentLayout;
                        this.selectedId = 4L;
                    } else {
                        this.selectedId = 1L;
                    }
                } else {
                    if (i6 == 2) {
                        openAudioLayout(false);
                        ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = this.audioLayout;
                        this.selectedId = 3L;
                        attachAlertLayout = chatAttachAlertAudioLayout;
                    } else if (i6 == 1) {
                        openDocumentsLayout(false);
                        ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = this.documentLayout;
                        this.selectedId = 4L;
                        attachAlertLayout = chatAttachAlertDocumentLayout;
                    } else {
                        this.selectedId = 1L;
                        attachAlertLayout = chatAttachAlertPhotoLayout;
                    }
                    this.typeButtonsAvailable = false;
                }
            } else {
                this.typeButtonsAvailable = this.avatarPicker == 0 && !this.storyMediaPicker;
                this.selectedId = 1L;
            }
            attachAlertLayout = chatAttachAlertPhotoLayout;
        }
        anonymousClass14.setVisibility(this.typeButtonsAvailable ? 0 : 8);
        if (this.currentAttachLayout != attachAlertLayout) {
            AnonymousClass7 anonymousClass8 = this.actionBar;
            if (anonymousClass8.isSearchFieldVisible) {
                anonymousClass8.closeSearchField(true);
            }
            this.containerView.removeView(this.currentAttachLayout);
            this.currentAttachLayout.onHide();
            this.currentAttachLayout.setVisibility(8);
            this.currentAttachLayout.onHidden();
            this.currentAttachLayout = attachAlertLayout;
            this.allowNestedScroll = true;
            if (attachAlertLayout.getParent() == null) {
                this.containerView.addView(this.currentAttachLayout, 0, LayoutHelper.createFrame(-1.0f, -1));
            }
            attachAlertLayout.setAlpha(1.0f);
            attachAlertLayout.setVisibility(0);
            attachAlertLayout.onShow(null);
            attachAlertLayout.onShown();
            anonymousClass8.setVisibility(attachAlertLayout.needsActionBar() != 0 ? 0 : 4);
            setCaptionAbove(this.captionAbove, false);
            updateDoneItemEnabled();
        }
        if (this.currentAttachLayout != chatAttachAlertPhotoLayout) {
            chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
        }
        updateCountButton(0);
        this.buttonsAdapter.notifyDataSetChanged();
        getCommentView().setText("");
        LinearLayoutManager linearLayoutManager = this.buttonsLayoutManager;
        linearLayoutManager.scrollToPositionWithOffset(0, 1000000, linearLayoutManager.mShouldReverseLayout);
    }

    public final boolean isCaptionAbove() {
        if (!this.captionAbove) {
            return false;
        }
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        return attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout;
    }

    public final void lambda$dismiss$70() {
        SpringAnimation springAnimation = this.appearSpringAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        SpringAnimation springAnimation2 = new SpringAnimation(this.containerView, DynamicAnimation.TRANSLATION_Y, 0.0f);
        this.appearSpringAnimation = springAnimation2;
        springAnimation2.mSpring.setDampingRatio(1.5f);
        this.appearSpringAnimation.mSpring.setStiffness(1500.0f);
        this.appearSpringAnimation.start();
    }

    public final void lambda$dismiss$72(int i) {
        this.navBarColorKey = -1;
        this.navBarColor = i;
        this.containerView.invalidate();
    }

    public final void lambda$new$14(Theme.ResourcesProvider resourcesProvider, View view) {
        ChatAttachAlert chatAttachAlert = this;
        BaseFragment baseFragment = chatAttachAlert.baseFragment;
        BaseFragment lastFragment = baseFragment == null ? LaunchActivity.getLastFragment() : baseFragment;
        if (lastFragment == null || lastFragment.getParentActivity() == null) {
            return;
        }
        if (view instanceof AttachButton) {
            Activity parentActivity = lastFragment.getParentActivity();
            int iIntValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : -1;
            if (iIntValue == 1) {
                if (!chatAttachAlert.photosEnabled && !chatAttachAlert.videosEnabled && chatAttachAlert.checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                if (!chatAttachAlert.photosEnabled && !chatAttachAlert.videosEnabled) {
                    ChatAttachRestrictedLayout chatAttachRestrictedLayout = new ChatAttachRestrictedLayout(1, chatAttachAlert.getContext(), resourcesProvider, chatAttachAlert);
                    chatAttachAlert.restrictedLayout = chatAttachRestrictedLayout;
                    chatAttachAlert.showLayout(chatAttachRestrictedLayout);
                }
                chatAttachAlert.showLayout(chatAttachAlert.photoLayout);
            } else if (iIntValue == 3) {
                if (!chatAttachAlert.musicEnabled && chatAttachAlert.checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                        return;
                    }
                } else if (i >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(chatAttachAlert.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                chatAttachAlert.openAudioLayout(true);
            } else if (iIntValue == 4) {
                if (!chatAttachAlert.documentsEnabled && chatAttachAlert.checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                        return;
                    }
                } else if (i2 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    AndroidUtilities.findActivity(chatAttachAlert.getContext()).requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                chatAttachAlert.openDocumentsLayout(true);
            } else if (iIntValue != 5) {
                AttachAlertLayout[] attachAlertLayoutArr = chatAttachAlert.layouts;
                if (iIntValue == 6) {
                    if ((!chatAttachAlert.plainTextEnabled && chatAttachAlert.checkCanRemoveRestrictionsByBoosts()) || !AndroidUtilities.isMapsInstalled(baseFragment)) {
                        return;
                    }
                    if (chatAttachAlert.plainTextEnabled) {
                        if (chatAttachAlert.locationLayout == null) {
                            ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = new ChatAttachAlertLocationLayout(chatAttachAlert, chatAttachAlert.getContext(), resourcesProvider, (chatAttachAlert.isPollAttach || chatAttachAlert.restrictEphemeralMessageTypes) ? false : true);
                            chatAttachAlert.locationLayout = chatAttachAlertLocationLayout;
                            attachAlertLayoutArr[5] = chatAttachAlertLocationLayout;
                            ChatAttachAlertLocationLayout.LocationActivityDelegate locationActivityDelegate = chatAttachAlert.locationActivityDelegate;
                            if (locationActivityDelegate != null) {
                                chatAttachAlertLocationLayout.setDelegate(locationActivityDelegate);
                            } else {
                                chatAttachAlertLocationLayout.setDelegate(new ChatAttachAlert$$ExternalSyntheticLambda1(chatAttachAlert, 9));
                            }
                        }
                        chatAttachAlert.showLayout(chatAttachAlert.locationLayout);
                    } else {
                        ChatAttachRestrictedLayout chatAttachRestrictedLayout2 = new ChatAttachRestrictedLayout(6, chatAttachAlert.getContext(), resourcesProvider, chatAttachAlert);
                        chatAttachAlert.restrictedLayout = chatAttachRestrictedLayout2;
                        chatAttachAlert.showLayout(chatAttachRestrictedLayout2);
                    }
                } else if (iIntValue == 9) {
                    if (!chatAttachAlert.pollsEnabled && chatAttachAlert.checkCanRemoveRestrictionsByBoosts()) {
                        return;
                    }
                    if (chatAttachAlert.pollsEnabled) {
                        chatAttachAlert.showPollLayout(true, null);
                    } else {
                        ChatAttachRestrictedLayout chatAttachRestrictedLayout3 = new ChatAttachRestrictedLayout(9, chatAttachAlert.getContext(), resourcesProvider, chatAttachAlert);
                        chatAttachAlert.restrictedLayout = chatAttachRestrictedLayout3;
                        chatAttachAlert.showLayout(chatAttachRestrictedLayout3);
                    }
                } else if (iIntValue == 11) {
                    if (chatAttachAlert.quickRepliesLayout == null) {
                        ChatAttachAlertQuickRepliesLayout chatAttachAlertQuickRepliesLayout = new ChatAttachAlertQuickRepliesLayout(chatAttachAlert.getContext(), chatAttachAlert.resourcesProvider, chatAttachAlert);
                        chatAttachAlert.quickRepliesLayout = chatAttachAlertQuickRepliesLayout;
                        attachAlertLayoutArr[7] = chatAttachAlertQuickRepliesLayout;
                        chatAttachAlertQuickRepliesLayout.setupBlurredSearchField(chatAttachAlert.iBlur3FactoryLiquidGlass);
                    }
                    chatAttachAlert.showLayout(chatAttachAlert.quickRepliesLayout);
                } else if (iIntValue == 12) {
                    if (!chatAttachAlert.todoEnabled && chatAttachAlert.checkCanRemoveRestrictionsByBoosts()) {
                        return;
                    }
                    if (chatAttachAlert.todoEnabled) {
                        if (chatAttachAlert.todoLayout == null) {
                            ChatAttachAlertPollLayout chatAttachAlertPollLayout = new ChatAttachAlertPollLayout(this, getContext(), true, resourcesProvider, null);
                            chatAttachAlert = this;
                            chatAttachAlert.todoLayout = chatAttachAlertPollLayout;
                            attachAlertLayoutArr[1] = chatAttachAlertPollLayout;
                            chatAttachAlertPollLayout.setDelegate(new ChatAttachAlert$$ExternalSyntheticLambda1(chatAttachAlert, 10));
                        }
                        chatAttachAlert.showLayout(chatAttachAlert.todoLayout);
                    } else {
                        ChatAttachRestrictedLayout chatAttachRestrictedLayout4 = new ChatAttachRestrictedLayout(9, chatAttachAlert.getContext(), resourcesProvider, chatAttachAlert);
                        chatAttachAlert.restrictedLayout = chatAttachRestrictedLayout4;
                        chatAttachAlert.showLayout(chatAttachRestrictedLayout4);
                    }
                } else if (iIntValue == 13) {
                    if (chatAttachAlert.stickersLayout == null) {
                        ChatAttachAlertEmojiLayout chatAttachAlertEmojiLayout = new ChatAttachAlertEmojiLayout(chatAttachAlert, chatAttachAlert.getContext(), resourcesProvider, true);
                        chatAttachAlert.stickersLayout = chatAttachAlertEmojiLayout;
                        attachAlertLayoutArr[8] = chatAttachAlertEmojiLayout;
                        chatAttachAlertEmojiLayout.setDelegate(chatAttachAlert.emojiViewDelegate);
                    }
                    chatAttachAlert.showLayout(chatAttachAlert.stickersLayout);
                } else if (iIntValue == 14) {
                    if (chatAttachAlert.emojiLayout == null) {
                        ChatAttachAlertEmojiLayout chatAttachAlertEmojiLayout2 = new ChatAttachAlertEmojiLayout(chatAttachAlert, chatAttachAlert.getContext(), resourcesProvider, false);
                        chatAttachAlert.emojiLayout = chatAttachAlertEmojiLayout2;
                        attachAlertLayoutArr[9] = chatAttachAlertEmojiLayout2;
                        chatAttachAlertEmojiLayout2.setDelegate(chatAttachAlert.emojiViewDelegate);
                    }
                    chatAttachAlert.showLayout(chatAttachAlert.emojiLayout);
                } else if (iIntValue == 16) {
                    if (chatAttachAlert.richLayout == null) {
                        ChatAttachAlertRichLayout chatAttachAlertRichLayout = new ChatAttachAlertRichLayout(chatAttachAlert.currentAccount, chatAttachAlert.getContext(), resourcesProvider, chatAttachAlert);
                        chatAttachAlert.richLayout = chatAttachAlertRichLayout;
                        attachAlertLayoutArr[10] = chatAttachAlertRichLayout;
                    }
                    chatAttachAlert.showLayout(chatAttachAlert.richLayout);
                } else if (view.getTag() instanceof Integer) {
                    chatAttachAlert.delegate.didPressedButton(((Integer) view.getTag()).intValue(), true, true, 0, 0, 0L, chatAttachAlert.isCaptionAbove(), false, 0L);
                }
            } else {
                if (!chatAttachAlert.plainTextEnabled && chatAttachAlert.checkCanRemoveRestrictionsByBoosts()) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 23 && chatAttachAlert.plainTextEnabled && chatAttachAlert.getContext().checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
                    AndroidUtilities.findActivity(chatAttachAlert.getContext()).requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 5);
                    return;
                }
                chatAttachAlert.openContactsLayout();
            }
        } else if (view instanceof AttachBotButton) {
            AttachBotButton attachBotButton = (AttachBotButton) view;
            TLRPC.TL_attachMenuBot tL_attachMenuBot = attachBotButton.attachMenuBot;
            if (tL_attachMenuBot == null) {
                chatAttachAlert.delegate.didSelectBot(attachBotButton.currentUser);
                chatAttachAlert.lambda$showGiftOfferSheet$15();
            } else if (tL_attachMenuBot.inactive) {
                WebAppDisclaimerAlert.show(chatAttachAlert.getContext(), new ChatActivity$$ExternalSyntheticLambda335(4, chatAttachAlert, attachBotButton), null);
            } else {
                chatAttachAlert.showBotLayout(tL_attachMenuBot.bot_id, null, false, true);
            }
        }
        int left = view.getLeft();
        int right = view.getRight();
        int iDp = AndroidUtilities.dp(70.0f);
        int i3 = left - iDp;
        AnonymousClass15 anonymousClass15 = chatAttachAlert.buttonsRecyclerView;
        if (i3 < 0) {
            anonymousClass15.smoothScrollBy(i3, 0, null);
            return;
        }
        int i4 = right + iDp;
        if (i4 > anonymousClass15.getMeasuredWidth()) {
            anonymousClass15.smoothScrollBy(i4 - anonymousClass15.getMeasuredWidth(), 0, null);
        }
    }

    public final void lambda$new$3$6() {
        if (this.photoLayout == null) {
            return;
        }
        boolean zAreLivePhotosEnabled = ChatAttachAlertPhotoLayout.areLivePhotosEnabled();
        boolean z = !zAreLivePhotosEnabled;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        chatAttachAlertPhotoLayout.getClass();
        HashMap map = ChatAttachAlertPhotoLayout.selectedPhotos;
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) entry.getValue();
                    if (photoEntry.isLivePhoto()) {
                        photoEntry.discardLivePhoto = Boolean.valueOf(zAreLivePhotosEnabled);
                        for (int i = 0; i < chatAttachAlertPhotoLayout.gridView.getChildCount(); i++) {
                            View childAt = chatAttachAlertPhotoLayout.gridView.getChildAt(i);
                            if (childAt instanceof PhotoAttachPhotoCell) {
                                PhotoAttachPhotoCell photoAttachPhotoCell = (PhotoAttachPhotoCell) childAt;
                                if (photoAttachPhotoCell.getPhotoEntry() == photoEntry) {
                                    photoAttachPhotoCell.getImageView().invalidate();
                                }
                            }
                        }
                    }
                }
            }
            SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
            SharedConfig.photoLiveDefault = z;
            editorEdit.putBoolean("photoLiveDefault", z).apply();
            if (chatAttachAlertPhotoLayout.gridView != null) {
                for (int i2 = 0; i2 < chatAttachAlertPhotoLayout.gridView.getChildCount(); i2++) {
                    View childAt2 = chatAttachAlertPhotoLayout.gridView.getChildAt(i2);
                    if (childAt2 instanceof PhotoAttachPhotoCell) {
                        ((PhotoAttachPhotoCell) childAt2).imageView.invalidate();
                    }
                }
            }
        }
        updateMotionItem(true);
        HintView2 hintView2 = this.motionHint;
        if (hintView2 != null) {
            hintView2.hide(true);
        }
        HintView2 hintView3 = new HintView2(getContext(), 1);
        this.motionHint = hintView3;
        hintView3.setText(AndroidUtilities.replaceTags(LocaleController.getString(!zAreLivePhotosEnabled ? R.string.LivePhotosOn : R.string.LivePhotosOff)));
        this.motionHint.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        HintView2 hintView4 = this.motionHint;
        float width = this.containerView.getWidth();
        ActionBarMenuItem actionBarMenuItem = this.motionItem;
        hintView4.setJointPx(1.0f, -((width - ((actionBarMenuItem.getWidth() / 2.0f) + actionBarMenuItem.getX())) - AndroidUtilities.dp(14.0f)));
        this.motionHint.setTranslationY(this.selectedMenuItem.getTranslationY());
        HintView2 hintView5 = this.motionHint;
        hintView5.onHidden = new ChatLinkActivity$$ExternalSyntheticLambda9(25, this, hintView3);
        this.containerView.addView(hintView5, LayoutHelper.createFrame(-1, 60.0f, 48, 0.0f, 46.0f, 0.0f, 0.0f));
        this.motionHint.show();
    }

    public final boolean lambda$new$37(Context context, Theme.ResourcesProvider resourcesProvider, BaseFragment baseFragment, View view) throws Throwable {
        TLRPC.User user;
        MessageObject messageObject;
        MessageObject messageObject2;
        ChatActivity chatActivity;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        ChatActivity chatActivity2;
        TLRPC.User user2;
        MessageObject messageObject3;
        boolean z;
        boolean z2;
        long j;
        CharSequence charSequence;
        String string;
        MessageObject messageObject4;
        TLRPC.TL_messageReplyHeader tL_messageReplyHeader;
        Throwable th;
        MediaMetadataRetriever mediaMetadataRetriever;
        ParcelFileDescriptor parcelFileDescriptor;
        MediaMetadataRetriever mediaMetadataRetriever2;
        ParcelFileDescriptor parcelFileDescriptor2;
        String str;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2;
        TLRPC.ChatFull chatFull;
        boolean z3;
        String strSubstring;
        boolean z4;
        boolean z5;
        int i;
        boolean z6;
        long dialogId = this.dialogId;
        BaseFragment baseFragment2 = this.baseFragment;
        if ((dialogId == 0 && !(baseFragment2 instanceof ChatActivity)) || this.currentLimit - this.codepointCount < 0 || this.animatorEphemeralMessageVisibility.value) {
            return false;
        }
        boolean z7 = baseFragment2 instanceof ChatActivity;
        int i2 = this.currentAccount;
        if (z7) {
            ChatActivity chatActivity3 = (ChatActivity) baseFragment2;
            chatActivity3.getClass();
            TLRPC.User currentUser = chatActivity3.getCurrentUser();
            MessageObject messageObject5 = chatActivity3.replyingMessageObject;
            MessageObject messageObject6 = chatActivity3.replyingTopMessage;
            if (chatActivity3.isInScheduleMode() || chatActivity3.chatMode == 5) {
                return false;
            }
            messageObject2 = messageObject6;
            chatActivity = chatActivity3;
            user = currentUser;
            messageObject = messageObject5;
            dialogId = chatActivity3.getDialogId();
        } else {
            user = MessagesController.getInstance(i2).getUser(Long.valueOf(dialogId));
            messageObject = null;
            messageObject2 = null;
            chatActivity = null;
        }
        AnonymousClass25 anonymousClass25 = this.messageSendPreview;
        if (anonymousClass25 != null) {
            anonymousClass25.dismiss();
        }
        AnonymousClass25 anonymousClass26 = new AnonymousClass25(context, resourcesProvider, this);
        this.messageSendPreview = anonymousClass26;
        ChatActivity$$ExternalSyntheticLambda62 chatActivity$$ExternalSyntheticLambda62 = new ChatActivity$$ExternalSyntheticLambda62(this, baseFragment, resourcesProvider, 17);
        AnonymousClass24 anonymousClass24 = this.writeButton;
        anonymousClass26.setSendButton(anonymousClass24, false, chatActivity$$ExternalSyntheticLambda62);
        ArrayList arrayList = new ArrayList();
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        String str2 = "";
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = this.photoLayout;
        MessageObject messageObject7 = messageObject2;
        if (attachAlertLayout == chatAttachAlertPhotoLayout3 || attachAlertLayout == this.photoPreviewLayout) {
            chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
            chatActivity2 = chatActivity;
            user2 = user;
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            if (selectedPhotos.isEmpty()) {
                dialogId = dialogId;
                messageObject3 = null;
                z = false;
                z2 = false;
            } else {
                int iCeil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
                messageObject3 = null;
                boolean z8 = false;
                int i3 = 0;
                int i4 = 0;
                z = false;
                while (i3 < iCeil) {
                    String str3 = str2;
                    int i5 = i3 * 10;
                    MessageObject messageObject8 = messageObject3;
                    int i6 = iCeil;
                    int iMin = Math.min(10, selectedPhotos.size() - i5);
                    boolean z9 = z8;
                    int i7 = i3;
                    long jNextLong = Utilities.random.nextLong();
                    int i8 = 0;
                    while (i8 < iMin) {
                        int i9 = i5 + i8;
                        int i10 = i8;
                        if (i9 >= selectedPhotosOrder.size()) {
                            j = dialogId;
                        } else {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i9));
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            int i11 = i4 + 1;
                            tL_message.id = i4;
                            tL_message.out = true;
                            tL_message.from_id = MessagesController.getInstance(i2).getPeer(UserConfig.getInstance(i2).getClientUserId());
                            tL_message.peer_id = MessagesController.getInstance(i2).getPeer(dialogId);
                            boolean z10 = photoEntry.isVideo;
                            if (z10 || (str = photoEntry.imagePath) == null) {
                                String str4 = photoEntry.path;
                                if (str4 != null) {
                                    tL_message.attachPath = str4;
                                }
                            } else {
                                tL_message.attachPath = str;
                            }
                            if (iMin > 0) {
                                tL_message.grouped_id = jNextLong;
                            }
                            int i12 = photoEntry.width;
                            int i13 = photoEntry.height;
                            int i14 = photoEntry.orientation;
                            if (z10) {
                                if (photoEntry.videoOrientation == -1) {
                                    try {
                                        MediaMetadataRetriever mediaMetadataRetriever3 = new MediaMetadataRetriever();
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (photoEntry.isLivePhoto()) {
                                                                    j = dialogId;
                                                                    try {
                                                                        if (photoEntry.livePhotoVideoOffset > r13) {
                                                                            File file = new File(photoEntry.path);
                                                                            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
                                                                            try {
                                                                                parcelFileDescriptor2 = parcelFileDescriptorOpen;
                                                                                try {
                                                                                    mediaMetadataRetriever3.setDataSource(parcelFileDescriptorOpen.getFileDescriptor(), photoEntry.livePhotoVideoOffset, file.length() - photoEntry.livePhotoVideoOffset);
                                                                                    mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                                                } catch (Exception e) {
                                                                                    e = e;
                                                                                    mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                                                    photoEntry.videoOrientation = 0;
                                                                                    FileLog.e(e);
                                                                                    if (mediaMetadataRetriever2 != null) {
                                                                                        try {
                                                                                            mediaMetadataRetriever2.release();
                                                                                        } catch (IOException e2) {
                                                                                            FileLog.e(e2);
                                                                                        }
                                                                                    }
                                                                                    if (parcelFileDescriptor2 != null) {
                                                                                        parcelFileDescriptor2.close();
                                                                                    }
                                                                                    i14 = photoEntry.videoOrientation;
                                                                                    if ((i14 / 90) % 2 == 0) {
                                                                                        i13 = i12;
                                                                                        i12 = i13;
                                                                                    }
                                                                                    if (photoEntry.isLivePhoto()) {
                                                                                        TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
                                                                                        tL_message.media = tL_messageMediaPhoto;
                                                                                        tL_messageMediaPhoto.live_photo = true;
                                                                                        tL_messageMediaPhoto.photo = new TLRPC.TL_photo();
                                                                                        TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                                                                                        tL_photoSize.w = i13;
                                                                                        tL_photoSize.h = i12;
                                                                                        tL_photoSize.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                                                                        tL_message.media.photo.sizes.add(tL_photoSize);
                                                                                        tL_message.media.document = new TLRPC.TL_document();
                                                                                        tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                                                                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                                                                        tL_documentAttributeVideo.w = i13;
                                                                                        tL_documentAttributeVideo.h = i12;
                                                                                        tL_documentAttributeVideo.duration = photoEntry.duration;
                                                                                        tL_message.media.document.attributes.add(tL_documentAttributeVideo);
                                                                                    } else if (photoEntry.isVideo) {
                                                                                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                                                                        tL_message.media = tL_messageMediaDocument;
                                                                                        tL_messageMediaDocument.document = new TLRPC.TL_document();
                                                                                        tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                                                                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo2 = new TLRPC.TL_documentAttributeVideo();
                                                                                        tL_documentAttributeVideo2.w = i13;
                                                                                        tL_documentAttributeVideo2.h = i12;
                                                                                        tL_documentAttributeVideo2.duration = photoEntry.duration;
                                                                                        tL_message.media.document.attributes.add(tL_documentAttributeVideo2);
                                                                                    } else {
                                                                                        TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto2 = new TLRPC.TL_messageMediaPhoto();
                                                                                        tL_message.media = tL_messageMediaPhoto2;
                                                                                        tL_messageMediaPhoto2.photo = new TLRPC.TL_photo();
                                                                                        TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                                                                                        tL_photoSize2.w = i13;
                                                                                        tL_photoSize2.h = i12;
                                                                                        tL_photoSize2.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                                                                        tL_message.media.photo.sizes.add(tL_photoSize2);
                                                                                    }
                                                                                    tL_message.media.spoiler = photoEntry.hasSpoiler;
                                                                                    charSequence = photoEntry.caption;
                                                                                    if (charSequence == null) {
                                                                                        string = str3;
                                                                                    } else {
                                                                                        string = charSequence.toString();
                                                                                    }
                                                                                    tL_message.message = string;
                                                                                    if (TextUtils.isEmpty(string)) {
                                                                                        CharSequence[] charSequenceArr = {getCommentView().getText()};
                                                                                        MessageObject.addLinks(true, charSequenceArr[0]);
                                                                                        tL_message.entities = MediaDataController.getInstance(i2).getEntities(charSequenceArr, true);
                                                                                        tL_message.message = charSequenceArr[0].toString();
                                                                                    }
                                                                                    if (i7 == 0) {
                                                                                        tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                                                                        if (messageObject7 != null) {
                                                                                            tL_messageReplyHeader.flags |= 2;
                                                                                            tL_messageReplyHeader.reply_to_top_id = messageObject7.getId();
                                                                                        }
                                                                                        tL_messageReplyHeader.flags |= 16;
                                                                                        tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                                                                        tL_message.reply_to = tL_messageReplyHeader;
                                                                                    }
                                                                                    messageObject4 = new MessageObject(i2, tL_message, true, false);
                                                                                    if (i7 == 0) {
                                                                                        messageObject4.replyMessageObject = messageObject;
                                                                                    }
                                                                                    messageObject4.sendPreviewEntry = photoEntry;
                                                                                    messageObject4.sendPreview = true;
                                                                                    messageObject4.notime = true;
                                                                                    messageObject4.isOutOwnerCached = Boolean.TRUE;
                                                                                    arrayList.add(messageObject4);
                                                                                    if (messageObject8 == null) {
                                                                                        messageObject8 = messageObject4;
                                                                                    }
                                                                                    i4 = i11;
                                                                                    z = true;
                                                                                    z9 = true;
                                                                                    i8 = i10 + 1;
                                                                                    selectedPhotos = selectedPhotos;
                                                                                    selectedPhotosOrder = selectedPhotosOrder;
                                                                                    dialogId = j;
                                                                                } catch (Throwable th2) {
                                                                                    th = th2;
                                                                                    mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                                                    th = th;
                                                                                    parcelFileDescriptor = parcelFileDescriptor2;
                                                                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                                                                    if (mediaMetadataRetriever != null) {
                                                                                        try {
                                                                                            mediaMetadataRetriever.release();
                                                                                        } catch (IOException e3) {
                                                                                            FileLog.e(e3);
                                                                                        }
                                                                                    }
                                                                                    if (parcelFileDescriptor == null) {
                                                                                        throw th;
                                                                                    }
                                                                                    try {
                                                                                        parcelFileDescriptor.close();
                                                                                        throw th;
                                                                                    } catch (IOException e4) {
                                                                                        FileLog.e(e4);
                                                                                        throw th;
                                                                                    }
                                                                                }
                                                                            } catch (Exception e5) {
                                                                                e = e5;
                                                                                parcelFileDescriptor2 = parcelFileDescriptorOpen;
                                                                            } catch (Throwable th3) {
                                                                                th = th3;
                                                                                parcelFileDescriptor2 = parcelFileDescriptorOpen;
                                                                            }
                                                                        }
                                                                        photoEntry.videoOrientation = Integer.parseInt(mediaMetadataRetriever2.extractMetadata(24));
                                                                        mediaMetadataRetriever2.release();
                                                                        if (parcelFileDescriptor2 != null) {
                                                                            try {
                                                                                parcelFileDescriptor2.close();
                                                                            } catch (IOException e6) {
                                                                                FileLog.e(e6);
                                                                            }
                                                                        }
                                                                    } catch (Exception e7) {
                                                                        e = e7;
                                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                                        parcelFileDescriptor2 = null;
                                                                        photoEntry.videoOrientation = 0;
                                                                        FileLog.e(e);
                                                                        if (mediaMetadataRetriever2 != null) {
                                                                            mediaMetadataRetriever2.release();
                                                                        }
                                                                        if (parcelFileDescriptor2 != null) {
                                                                            parcelFileDescriptor2.close();
                                                                        }
                                                                        i14 = photoEntry.videoOrientation;
                                                                        if ((i14 / 90) % 2 == 0) {
                                                                            i13 = i12;
                                                                            i12 = i13;
                                                                        }
                                                                        if (photoEntry.isLivePhoto()) {
                                                                            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto3 = new TLRPC.TL_messageMediaPhoto();
                                                                            tL_message.media = tL_messageMediaPhoto3;
                                                                            tL_messageMediaPhoto3.live_photo = true;
                                                                            tL_messageMediaPhoto3.photo = new TLRPC.TL_photo();
                                                                            TLRPC.TL_photoSize tL_photoSize3 = new TLRPC.TL_photoSize();
                                                                            tL_photoSize3.w = i13;
                                                                            tL_photoSize3.h = i12;
                                                                            tL_photoSize3.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                                                            tL_message.media.photo.sizes.add(tL_photoSize3);
                                                                            tL_message.media.document = new TLRPC.TL_document();
                                                                            tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                                                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo3 = new TLRPC.TL_documentAttributeVideo();
                                                                            tL_documentAttributeVideo3.w = i13;
                                                                            tL_documentAttributeVideo3.h = i12;
                                                                            tL_documentAttributeVideo3.duration = photoEntry.duration;
                                                                            tL_message.media.document.attributes.add(tL_documentAttributeVideo3);
                                                                        } else if (photoEntry.isVideo) {
                                                                            TLRPC.TL_messageMediaDocument tL_messageMediaDocument2 = new TLRPC.TL_messageMediaDocument();
                                                                            tL_message.media = tL_messageMediaDocument2;
                                                                            tL_messageMediaDocument2.document = new TLRPC.TL_document();
                                                                            tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                                                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo4 = new TLRPC.TL_documentAttributeVideo();
                                                                            tL_documentAttributeVideo4.w = i13;
                                                                            tL_documentAttributeVideo4.h = i12;
                                                                            tL_documentAttributeVideo4.duration = photoEntry.duration;
                                                                            tL_message.media.document.attributes.add(tL_documentAttributeVideo4);
                                                                        } else {
                                                                            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto4 = new TLRPC.TL_messageMediaPhoto();
                                                                            tL_message.media = tL_messageMediaPhoto4;
                                                                            tL_messageMediaPhoto4.photo = new TLRPC.TL_photo();
                                                                            TLRPC.TL_photoSize tL_photoSize4 = new TLRPC.TL_photoSize();
                                                                            tL_photoSize4.w = i13;
                                                                            tL_photoSize4.h = i12;
                                                                            tL_photoSize4.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                                                            tL_message.media.photo.sizes.add(tL_photoSize4);
                                                                        }
                                                                        tL_message.media.spoiler = photoEntry.hasSpoiler;
                                                                        charSequence = photoEntry.caption;
                                                                        if (charSequence == null) {
                                                                            string = str3;
                                                                        } else {
                                                                            string = charSequence.toString();
                                                                        }
                                                                        tL_message.message = string;
                                                                        if (TextUtils.isEmpty(string)) {
                                                                            CharSequence[] charSequenceArr2 = {getCommentView().getText()};
                                                                            MessageObject.addLinks(true, charSequenceArr2[0]);
                                                                            tL_message.entities = MediaDataController.getInstance(i2).getEntities(charSequenceArr2, true);
                                                                            tL_message.message = charSequenceArr2[0].toString();
                                                                        }
                                                                        if (i7 == 0) {
                                                                            tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                                                            if (messageObject7 != null) {
                                                                                tL_messageReplyHeader.flags |= 2;
                                                                                tL_messageReplyHeader.reply_to_top_id = messageObject7.getId();
                                                                            }
                                                                            tL_messageReplyHeader.flags |= 16;
                                                                            tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                                                            tL_message.reply_to = tL_messageReplyHeader;
                                                                        }
                                                                        messageObject4 = new MessageObject(i2, tL_message, true, false);
                                                                        if (i7 == 0) {
                                                                            messageObject4.replyMessageObject = messageObject;
                                                                        }
                                                                        messageObject4.sendPreviewEntry = photoEntry;
                                                                        messageObject4.sendPreview = true;
                                                                        messageObject4.notime = true;
                                                                        messageObject4.isOutOwnerCached = Boolean.TRUE;
                                                                        arrayList.add(messageObject4);
                                                                        if (messageObject8 == null) {
                                                                            messageObject8 = messageObject4;
                                                                        }
                                                                        i4 = i11;
                                                                        z = true;
                                                                        z9 = true;
                                                                        i8 = i10 + 1;
                                                                        selectedPhotos = selectedPhotos;
                                                                        selectedPhotosOrder = selectedPhotosOrder;
                                                                        dialogId = j;
                                                                    }
                                                                } else {
                                                                    j = dialogId;
                                                                }
                                                                mediaMetadataRetriever2.release();
                                                            } catch (IOException e8) {
                                                                FileLog.e(e8);
                                                            }
                                                            photoEntry.videoOrientation = Integer.parseInt(mediaMetadataRetriever2.extractMetadata(24));
                                                            if (parcelFileDescriptor2 != null) {
                                                                parcelFileDescriptor2.close();
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            th = th;
                                                            parcelFileDescriptor = parcelFileDescriptor2;
                                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                                            if (mediaMetadataRetriever != null) {
                                                                mediaMetadataRetriever.release();
                                                            }
                                                            if (parcelFileDescriptor == null) {
                                                                throw th;
                                                            }
                                                            parcelFileDescriptor.close();
                                                            throw th;
                                                        }
                                                    } catch (Exception e9) {
                                                        e = e9;
                                                        photoEntry.videoOrientation = 0;
                                                        FileLog.e(e);
                                                        if (mediaMetadataRetriever2 != null) {
                                                            mediaMetadataRetriever2.release();
                                                        }
                                                        if (parcelFileDescriptor2 != null) {
                                                            parcelFileDescriptor2.close();
                                                        }
                                                    }
                                                    mediaMetadataRetriever2.setDataSource(photoEntry.path);
                                                    parcelFileDescriptor2 = null;
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    parcelFileDescriptor2 = null;
                                                    photoEntry.videoOrientation = 0;
                                                    FileLog.e(e);
                                                    if (mediaMetadataRetriever2 != null) {
                                                        mediaMetadataRetriever2.release();
                                                    }
                                                    if (parcelFileDescriptor2 != null) {
                                                        parcelFileDescriptor2.close();
                                                    }
                                                    i14 = photoEntry.videoOrientation;
                                                    if ((i14 / 90) % 2 == 0) {
                                                        i13 = i12;
                                                        i12 = i13;
                                                    }
                                                    if (photoEntry.isLivePhoto()) {
                                                        TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto5 = new TLRPC.TL_messageMediaPhoto();
                                                        tL_message.media = tL_messageMediaPhoto5;
                                                        tL_messageMediaPhoto5.live_photo = true;
                                                        tL_messageMediaPhoto5.photo = new TLRPC.TL_photo();
                                                        TLRPC.TL_photoSize tL_photoSize5 = new TLRPC.TL_photoSize();
                                                        tL_photoSize5.w = i13;
                                                        tL_photoSize5.h = i12;
                                                        tL_photoSize5.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                                        tL_message.media.photo.sizes.add(tL_photoSize5);
                                                        tL_message.media.document = new TLRPC.TL_document();
                                                        tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo5 = new TLRPC.TL_documentAttributeVideo();
                                                        tL_documentAttributeVideo5.w = i13;
                                                        tL_documentAttributeVideo5.h = i12;
                                                        tL_documentAttributeVideo5.duration = photoEntry.duration;
                                                        tL_message.media.document.attributes.add(tL_documentAttributeVideo5);
                                                    } else if (photoEntry.isVideo) {
                                                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument3 = new TLRPC.TL_messageMediaDocument();
                                                        tL_message.media = tL_messageMediaDocument3;
                                                        tL_messageMediaDocument3.document = new TLRPC.TL_document();
                                                        tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo6 = new TLRPC.TL_documentAttributeVideo();
                                                        tL_documentAttributeVideo6.w = i13;
                                                        tL_documentAttributeVideo6.h = i12;
                                                        tL_documentAttributeVideo6.duration = photoEntry.duration;
                                                        tL_message.media.document.attributes.add(tL_documentAttributeVideo6);
                                                    } else {
                                                        TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto6 = new TLRPC.TL_messageMediaPhoto();
                                                        tL_message.media = tL_messageMediaPhoto6;
                                                        tL_messageMediaPhoto6.photo = new TLRPC.TL_photo();
                                                        TLRPC.TL_photoSize tL_photoSize6 = new TLRPC.TL_photoSize();
                                                        tL_photoSize6.w = i13;
                                                        tL_photoSize6.h = i12;
                                                        tL_photoSize6.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                                        tL_message.media.photo.sizes.add(tL_photoSize6);
                                                    }
                                                    tL_message.media.spoiler = photoEntry.hasSpoiler;
                                                    charSequence = photoEntry.caption;
                                                    if (charSequence == null) {
                                                        string = str3;
                                                    } else {
                                                        string = charSequence.toString();
                                                    }
                                                    tL_message.message = string;
                                                    if (TextUtils.isEmpty(string)) {
                                                        CharSequence[] charSequenceArr3 = {getCommentView().getText()};
                                                        MessageObject.addLinks(true, charSequenceArr3[0]);
                                                        tL_message.entities = MediaDataController.getInstance(i2).getEntities(charSequenceArr3, true);
                                                        tL_message.message = charSequenceArr3[0].toString();
                                                    }
                                                    if (i7 == 0) {
                                                        tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                                        if (messageObject7 != null) {
                                                            tL_messageReplyHeader.flags |= 2;
                                                            tL_messageReplyHeader.reply_to_top_id = messageObject7.getId();
                                                        }
                                                        tL_messageReplyHeader.flags |= 16;
                                                        tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                                        tL_message.reply_to = tL_messageReplyHeader;
                                                    }
                                                    messageObject4 = new MessageObject(i2, tL_message, true, false);
                                                    if (i7 == 0) {
                                                        messageObject4.replyMessageObject = messageObject;
                                                    }
                                                    messageObject4.sendPreviewEntry = photoEntry;
                                                    messageObject4.sendPreview = true;
                                                    messageObject4.notime = true;
                                                    messageObject4.isOutOwnerCached = Boolean.TRUE;
                                                    arrayList.add(messageObject4);
                                                    if (messageObject8 == null) {
                                                        messageObject8 = messageObject4;
                                                    }
                                                    i4 = i11;
                                                    z = true;
                                                    z9 = true;
                                                    i8 = i10 + 1;
                                                    selectedPhotos = selectedPhotos;
                                                    selectedPhotosOrder = selectedPhotosOrder;
                                                    dialogId = j;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    parcelFileDescriptor2 = null;
                                                    th = th;
                                                    parcelFileDescriptor = parcelFileDescriptor2;
                                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                                    if (mediaMetadataRetriever != null) {
                                                        mediaMetadataRetriever.release();
                                                    }
                                                    if (parcelFileDescriptor == null) {
                                                        throw th;
                                                    }
                                                    parcelFileDescriptor.close();
                                                    throw th;
                                                }
                                                mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                            } catch (Exception e11) {
                                                e = e11;
                                                j = dialogId;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        j = dialogId;
                                        mediaMetadataRetriever2 = null;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        mediaMetadataRetriever = null;
                                        parcelFileDescriptor = null;
                                    }
                                } else {
                                    j = dialogId;
                                }
                                i14 = photoEntry.videoOrientation;
                            } else {
                                j = dialogId;
                            }
                            if ((i14 / 90) % 2 == 0) {
                                i13 = i12;
                                i12 = i13;
                            }
                            if (photoEntry.isLivePhoto()) {
                                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto7 = new TLRPC.TL_messageMediaPhoto();
                                tL_message.media = tL_messageMediaPhoto7;
                                tL_messageMediaPhoto7.live_photo = true;
                                tL_messageMediaPhoto7.photo = new TLRPC.TL_photo();
                                TLRPC.TL_photoSize tL_photoSize7 = new TLRPC.TL_photoSize();
                                tL_photoSize7.w = i13;
                                tL_photoSize7.h = i12;
                                tL_photoSize7.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                tL_message.media.photo.sizes.add(tL_photoSize7);
                                tL_message.media.document = new TLRPC.TL_document();
                                tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo7 = new TLRPC.TL_documentAttributeVideo();
                                tL_documentAttributeVideo7.w = i13;
                                tL_documentAttributeVideo7.h = i12;
                                tL_documentAttributeVideo7.duration = photoEntry.duration;
                                tL_message.media.document.attributes.add(tL_documentAttributeVideo7);
                            } else if (photoEntry.isVideo) {
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument4 = new TLRPC.TL_messageMediaDocument();
                                tL_message.media = tL_messageMediaDocument4;
                                tL_messageMediaDocument4.document = new TLRPC.TL_document();
                                tL_message.media.document.mime_type = MimeTypeMap.getSingleton().getExtensionFromMimeType(tL_message.attachPath);
                                TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo8 = new TLRPC.TL_documentAttributeVideo();
                                tL_documentAttributeVideo8.w = i13;
                                tL_documentAttributeVideo8.h = i12;
                                tL_documentAttributeVideo8.duration = photoEntry.duration;
                                tL_message.media.document.attributes.add(tL_documentAttributeVideo8);
                            } else {
                                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto8 = new TLRPC.TL_messageMediaPhoto();
                                tL_message.media = tL_messageMediaPhoto8;
                                tL_messageMediaPhoto8.photo = new TLRPC.TL_photo();
                                TLRPC.TL_photoSize tL_photoSize8 = new TLRPC.TL_photoSize();
                                tL_photoSize8.w = i13;
                                tL_photoSize8.h = i12;
                                tL_photoSize8.location = new TLRPC.TL_fileLocationToBeDeprecated();
                                tL_message.media.photo.sizes.add(tL_photoSize8);
                            }
                            tL_message.media.spoiler = photoEntry.hasSpoiler;
                            charSequence = photoEntry.caption;
                            if (charSequence == null) {
                                string = str3;
                            } else {
                                string = charSequence.toString();
                            }
                            tL_message.message = string;
                            if (TextUtils.isEmpty(string) && i7 == 0 && i10 == 0) {
                                CharSequence[] charSequenceArr4 = {getCommentView().getText()};
                                MessageObject.addLinks(true, charSequenceArr4[0]);
                                tL_message.entities = MediaDataController.getInstance(i2).getEntities(charSequenceArr4, true);
                                tL_message.message = charSequenceArr4[0].toString();
                            }
                            if (i7 == 0 && messageObject != null && !messageObject.isTopicMainMessage) {
                                tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                if (messageObject7 != null) {
                                    tL_messageReplyHeader.flags |= 2;
                                    tL_messageReplyHeader.reply_to_top_id = messageObject7.getId();
                                }
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            messageObject4 = new MessageObject(i2, tL_message, true, false);
                            if (i7 == 0 && messageObject != null && !messageObject.isTopicMainMessage) {
                                messageObject4.replyMessageObject = messageObject;
                            }
                            messageObject4.sendPreviewEntry = photoEntry;
                            messageObject4.sendPreview = true;
                            messageObject4.notime = true;
                            messageObject4.isOutOwnerCached = Boolean.TRUE;
                            arrayList.add(messageObject4);
                            if (messageObject8 == null && !TextUtils.isEmpty(tL_message.message)) {
                                messageObject8 = messageObject4;
                            }
                            i4 = i11;
                            z = true;
                            z9 = true;
                        }
                        i8 = i10 + 1;
                        selectedPhotos = selectedPhotos;
                        selectedPhotosOrder = selectedPhotosOrder;
                        dialogId = j;
                    }
                    i3 = i7 + 1;
                    iCeil = i6;
                    str2 = str3;
                    messageObject3 = messageObject8;
                    z8 = z9;
                }
                dialogId = dialogId;
                z2 = z8;
            }
        } else {
            if (attachAlertLayout == this.contactsLayout) {
                if (TextUtils.isEmpty(getCommentView().getText())) {
                    i = 0;
                    z6 = false;
                } else {
                    TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                    tL_message2.id = 0;
                    tL_message2.out = true;
                    tL_message2.from_id = MessagesController.getInstance(i2).getPeer(UserConfig.getInstance(i2).getClientUserId());
                    tL_message2.peer_id = MessagesController.getInstance(i2).getPeer(dialogId);
                    CharSequence[] charSequenceArr5 = {getCommentView().getText()};
                    MessageObject.addLinks(true, charSequenceArr5[0]);
                    tL_message2.entities = MediaDataController.getInstance(i2).getEntities(charSequenceArr5, true);
                    tL_message2.message = charSequenceArr5[0].toString();
                    MessageObject messageObject9 = new MessageObject(i2, tL_message2, true, false);
                    messageObject9.sendPreview = true;
                    messageObject9.notime = true;
                    messageObject9.isOutOwnerCached = Boolean.TRUE;
                    arrayList.add(messageObject9);
                    i = 1;
                    z6 = true;
                }
                ArrayList<TLRPC.User> selected = this.contactsLayout.getSelected();
                boolean z11 = z6;
                int i15 = 0;
                while (i15 < selected.size()) {
                    TLRPC.User user3 = selected.get(i15);
                    ArrayList<TLRPC.User> arrayList2 = selected;
                    TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                    int i16 = i15;
                    int i17 = i + 1;
                    tL_message3.id = i;
                    tL_message3.out = true;
                    TLRPC.User user4 = user;
                    tL_message3.from_id = MessagesController.getInstance(i2).getPeer(UserConfig.getInstance(i2).getClientUserId());
                    tL_message3.peer_id = MessagesController.getInstance(i2).getPeer(dialogId);
                    TLRPC.TL_messageMediaContact tL_messageMediaContact = new TLRPC.TL_messageMediaContact();
                    tL_message3.media = tL_messageMediaContact;
                    tL_messageMediaContact.phone_number = user3.phone;
                    tL_messageMediaContact.first_name = user3.first_name;
                    tL_messageMediaContact.last_name = user3.last_name;
                    if (user3.restriction_reason.isEmpty() || !user3.restriction_reason.get(0).text.startsWith("BEGIN:VCARD")) {
                        tL_message3.media.vcard = "";
                    } else {
                        tL_message3.media.vcard = user3.restriction_reason.get(0).text;
                    }
                    tL_message3.media.user_id = user3.id;
                    MessageObject messageObject10 = new MessageObject(i2, tL_message3, true, false);
                    messageObject10.sendPreview = true;
                    messageObject10.notime = true;
                    messageObject10.isOutOwnerCached = Boolean.TRUE;
                    arrayList.add(messageObject10);
                    i15 = i16 + 1;
                    i = i17;
                    selected = arrayList2;
                    user = user4;
                    z11 = true;
                }
                user2 = user;
                chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
                chatActivity2 = chatActivity;
                z2 = z11;
                messageObject3 = null;
            } else {
                user2 = user;
                if (attachAlertLayout == this.documentLayout) {
                    messageObject3 = null;
                    boolean z12 = false;
                    int i18 = 0;
                    int i19 = 0;
                    while (i18 < this.documentLayout.selectedFilesOrder.size()) {
                        String str5 = (String) this.documentLayout.selectedFilesOrder.get(i18);
                        if (str5 != null) {
                            int iLastIndexOf = str5.lastIndexOf(File.separator);
                            if (iLastIndexOf < 0) {
                                strSubstring = str5;
                                z3 = true;
                            } else {
                                z3 = true;
                                strSubstring = str5.substring(iLastIndexOf + 1);
                            }
                            if (!TextUtils.isEmpty(strSubstring)) {
                                TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                                int i20 = i19 + 1;
                                tL_message4.id = i19;
                                tL_message4.out = z3;
                                tL_message4.from_id = MessagesController.getInstance(i2).getPeer(UserConfig.getInstance(i2).getClientUserId());
                                tL_message4.peer_id = MessagesController.getInstance(i2).getPeer(dialogId);
                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument5 = new TLRPC.TL_messageMediaDocument();
                                tL_message4.media = tL_messageMediaDocument5;
                                tL_message4.attachPath = str5;
                                tL_messageMediaDocument5.document = new TLRPC.TL_document();
                                TLRPC.Document document = tL_message4.media.document;
                                document.file_name = strSubstring;
                                document.size = new File(str5).length();
                                if (TextUtils.isEmpty(tL_message4.message) && i18 == 0) {
                                    z5 = true;
                                    z4 = false;
                                    CharSequence[] charSequenceArr6 = {getCommentView().getText()};
                                    tL_message4.entities = MediaDataController.getInstance(i2).getEntities(charSequenceArr6, true);
                                    tL_message4.message = charSequenceArr6[0].toString();
                                } else {
                                    z4 = false;
                                    z5 = true;
                                }
                                MessageObject messageObject11 = new MessageObject(i2, tL_message4, z5, z4);
                                messageObject11.attachPathExists = z5;
                                messageObject11.sendPreview = z5;
                                messageObject11.notime = z5;
                                messageObject11.isOutOwnerCached = Boolean.TRUE;
                                arrayList.add(messageObject11);
                                if (i18 == 0 && messageObject3 == null && !TextUtils.isEmpty(tL_message4.message)) {
                                    messageObject3 = messageObject11;
                                }
                                i19 = i20;
                                z12 = true;
                            }
                            i18++;
                            chatActivity = chatActivity;
                            chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout3;
                        }
                        i18++;
                        chatActivity = chatActivity;
                        chatAttachAlertPhotoLayout3 = chatAttachAlertPhotoLayout3;
                    }
                    chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
                    chatActivity2 = chatActivity;
                    z2 = z12;
                } else {
                    chatAttachAlertPhotoLayout = chatAttachAlertPhotoLayout3;
                    chatActivity2 = chatActivity;
                    ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = this.audioLayout;
                    if (attachAlertLayout == chatAttachAlertAudioLayout) {
                        arrayList.addAll(chatAttachAlertAudioLayout.getSelected());
                        if (arrayList.isEmpty()) {
                            messageObject3 = null;
                        } else {
                            messageObject3 = (MessageObject) arrayList.get(0);
                            CharSequence[] charSequenceArr7 = {getCommentView().getText()};
                            MessageObject.addLinks(true, charSequenceArr7[0]);
                            messageObject3.messageOwner.entities = MediaDataController.getInstance(i2).getEntities(charSequenceArr7, true);
                            messageObject3.messageOwner.message = charSequenceArr7[0].toString();
                            if (TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                                messageObject3 = null;
                            } else {
                                messageObject3.generateCaption();
                            }
                        }
                        if (arrayList.size() > 1) {
                            for (int i21 = 0; i21 < Math.ceil(arrayList.size() / 10.0f); i21++) {
                                int i22 = i21 * 10;
                                int iMin2 = Math.min(10, arrayList.size() - i22);
                                long jNextLong2 = Utilities.random.nextLong();
                                for (int i23 = 0; i23 < iMin2; i23++) {
                                    int i24 = i22 + i23;
                                    if (i24 < arrayList.size()) {
                                        ((MessageObject) arrayList.get(i24)).messageOwner.grouped_id = jNextLong2;
                                    }
                                }
                            }
                        }
                        dialogId = dialogId;
                        z = false;
                        z2 = true;
                    } else {
                        dialogId = dialogId;
                        messageObject3 = null;
                        z = false;
                        z2 = false;
                    }
                }
            }
            z = false;
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.containerView, resourcesProvider, anonymousClass24);
        if (messageObject3 != null) {
            AttachAlertLayout attachAlertLayout2 = this.currentAttachLayout;
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
            if (attachAlertLayout2 == chatAttachAlertPhotoLayout2 || attachAlertLayout2 == this.photoPreviewLayout) {
                MessagePreviewView.ToggleButton toggleButton = new MessagePreviewView.ToggleButton(context, R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), resourcesProvider);
                TLRPC.Message message = messageObject3.messageOwner;
                boolean z13 = this.captionAbove;
                message.invert_media = z13;
                toggleButton.setState(!z13, false);
                toggleButton.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda62(this, messageObject3, toggleButton, 18));
                itemOptionsMakeOptions.addView(toggleButton);
                if (this.editingMessageObject == null) {
                    itemOptionsMakeOptions.addGap();
                }
            }
        } else {
            chatAttachAlertPhotoLayout2 = chatAttachAlertPhotoLayout;
        }
        boolean zIsUserSelf = UserObject.isUserSelf(user2);
        ChatActivity chatActivity4 = chatActivity2;
        if (this.editingMessageObject == null && ((chatActivity2 == null || !ChatObject.isMonoForum(chatActivity4.currentChat)) && ((chatActivity4 != null && chatActivity4.canScheduleMessage()) || this.currentAttachLayout.canScheduleMessages()))) {
            itemOptionsMakeOptions.add(R.drawable.msg_calendar2, LocaleController.getString(zIsUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new PollItemMenu$$ExternalSyntheticLambda12(this, dialogId, resourcesProvider, 11), false);
        }
        AttachAlertLayout attachAlertLayout3 = this.currentAttachLayout;
        if ((attachAlertLayout3 == chatAttachAlertPhotoLayout2 || attachAlertLayout3 == this.photoPreviewLayout) && attachAlertLayout3.getSelectedItemsCount() == 1 && chatActivity4 != null && ChatObject.isMonoForum(chatActivity4.currentChat)) {
            itemOptionsMakeOptions.add(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.PostSuggestionsSendWithOffer), new LaunchActivity$$ExternalSyntheticLambda121(this, dialogId, chatActivity4, resourcesProvider, 25), false);
        }
        if (this.editingMessageObject == null && !zIsUserSelf) {
            itemOptionsMakeOptions.add(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ChatAttachAlert$$ExternalSyntheticLambda7(this, 2), false);
        }
        if (this.editingMessageObject == null && z && chatActivity4 != null && ChatObject.isChannelAndNotMegaGroup(chatActivity4.currentChat) && (chatFull = chatActivity4.chatInfo) != null && chatFull.paid_media_allowed) {
            int i25 = R.drawable.menu_feature_paid;
            int i26 = R.string.PaidMediaButton;
            itemOptionsMakeOptions.add(i25, LocaleController.getString(i26), null, false);
            ActionBarMenuSubItem last = itemOptionsMakeOptions.getLast();
            last.setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(this, context, last, resourcesProvider, 9));
            long starsPrice = chatAttachAlertPhotoLayout2.getStarsPrice();
            if (starsPrice > 0) {
                last.setText(LocaleController.getString(R.string.PaidMediaPriceButton));
                last.setSubtext(LocaleController.formatPluralString("Stars", (int) starsPrice, new Object[0]));
            } else {
                last.setText(LocaleController.getString(i26));
                last.setSubtext(null);
            }
            this.messageSendPreview.setStars(starsPrice);
        }
        itemOptionsMakeOptions.setupSelectors();
        this.messageSendPreview.setItemOptions(itemOptionsMakeOptions);
        this.messageSendPreview.setMessageObjects(arrayList);
        if (this.editingMessageObject == null && dialogId >= r13 && z2) {
            this.messageSendPreview.allowEffectSelector(baseFragment);
            this.messageSendPreview.setEffectId(this.effectId);
        }
        this.messageSendPreview.show();
        try {
            view.performHapticFeedback(3, 2);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    public final void lambda$onCustomOpenAnimation$57(ValueAnimator valueAnimator) {
        this.navigationBarAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BottomSheet.ContainerView containerView = this.container;
        if (containerView != null) {
            containerView.invalidate();
        }
    }

    public final void lambda$onCustomOpenAnimation$58(AnimationNotificationsLocker animationNotificationsLocker, BottomSheet.BottomSheetDelegateInterface bottomSheetDelegateInterface) {
        this.currentSheetAnimation = null;
        this.appearSpringAnimation = null;
        animationNotificationsLocker.unlock();
        this.currentSheetAnimationType = 0;
        if (bottomSheetDelegateInterface != null) {
            bottomSheetDelegateInterface.onOpenAnimationEnd();
        }
        if (this.useHardwareLayer) {
            this.container.setLayerType(0, null);
        }
        if (this.isFullscreen) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags &= -1025;
            getWindow().setAttributes(attributes);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
    }

    public final void lambda$onCustomOpenAnimation$59(FilterGLThread$$ExternalSyntheticLambda1 filterGLThread$$ExternalSyntheticLambda1) {
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet == null || animatorSet.isRunning()) {
            return;
        }
        filterGLThread$$ExternalSyntheticLambda1.run();
    }

    public final void lambda$onCustomOpenAnimation$60(ValueAnimator valueAnimator) {
        int alphaComponent = ColorUtils.setAlphaComponent(getThemedColor(Theme.key_windowBackgroundGray), Math.min(255, Math.max(0, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f))));
        this.navBarColor = alphaComponent;
        AndroidUtilities.setNavigationBarColor((Dialog) this, alphaComponent, false);
        AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        getContainer().invalidate();
    }

    public final void lambda$showLayout$50() {
        AttachAlertLayout attachAlertLayout;
        ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview;
        this.viewChangeAnimator = null;
        AttachAlertLayout attachAlertLayout2 = this.currentAttachLayout;
        if (attachAlertLayout2 != this.photoLayout && (attachAlertLayout = this.nextAttachLayout) != (chatAttachAlertPhotoLayoutPreview = this.photoPreviewLayout) && attachAlertLayout2 != attachAlertLayout && attachAlertLayout2 != chatAttachAlertPhotoLayoutPreview) {
            this.containerView.removeView(attachAlertLayout2);
        }
        this.currentAttachLayout.setVisibility(8);
        this.currentAttachLayout.onHidden();
        this.nextAttachLayout.onShown();
        this.currentAttachLayout = this.nextAttachLayout;
        this.nextAttachLayout = null;
        int[] iArr = this.scrollOffsetY;
        iArr[0] = iArr[1];
        setCaptionAbove(this.captionAbove, false);
        updateDoneItemEnabled();
    }

    public final void lambda$showLayout$52(boolean z, ChatAttachAlert$$ExternalSyntheticLambda7 chatAttachAlert$$ExternalSyntheticLambda7) {
        this.currentAttachLayout.onHideShowProgress(1.0f);
        this.nextAttachLayout.onHideShowProgress(1.0f);
        this.currentAttachLayout.onContainerTranslationUpdated(this.currentPanTranslationY);
        this.nextAttachLayout.onContainerTranslationUpdated(this.currentPanTranslationY);
        this.containerView.invalidate();
        this.actionBar.setTag(z ? 1 : null);
        chatAttachAlert$$ExternalSyntheticLambda7.run();
    }

    public final void lambda$showMotionHint$64(HintView2 hintView2) {
        this.containerView.removeView(hintView2);
    }

    public final void makeFocusable(EditTextBoldCursor editTextBoldCursor, boolean z) {
        ChatAttachViewDelegate chatAttachViewDelegate = this.delegate;
        if (chatAttachViewDelegate == null || this.enterCommentEventSent) {
            return;
        }
        boolean zNeedEnterComment = chatAttachViewDelegate.needEnterComment();
        this.enterCommentEventSent = true;
        AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda89(this, editTextBoldCursor, z, 13), zNeedEnterComment ? 200L : 0L);
    }

    @Override
    public final void lambda$openCrafting$8() {
        if (this.passcodeView.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
                return;
            }
            return;
        }
        AnonymousClass7 anonymousClass7 = this.actionBar;
        if (anonymousClass7.isSearchFieldVisible) {
            anonymousClass7.closeSearchField(true);
            return;
        }
        if (this.currentAttachLayout.onBackPressed()) {
            return;
        }
        if (getCommentView() == null || !getCommentView().emojiViewVisible) {
            super.lambda$openCrafting$8();
        } else {
            getCommentView().hidePopup(true);
        }
    }

    @Override
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        return this.currentAttachLayout.onContainerViewTouchEvent(motionEvent);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment != null) {
            AndroidUtilities.setLightStatusBar(this, baseFragment.isLightStatusBar());
        }
    }

    public final void onCurrentLayoutAnimatorChanged$1() {
        if (this.shadowDrawable == null || this.containerView == null) {
            return;
        }
        int shadowDrawableColor = getShadowDrawableColor(false);
        Theme.setDrawableColor(shadowDrawableColor, this.shadowDrawable);
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = this.iBlur3SourceColor;
        if (blurredBackgroundSourceColor.paint.getColor() != shadowDrawableColor) {
            blurredBackgroundSourceColor.paint.setColor(shadowDrawableColor);
            ChatActivityFadeView chatActivityFadeView = this.fadeView;
            if (chatActivityFadeView != null) {
                chatActivityFadeView.invalidate();
            }
            AnonymousClass16 anonymousClass16 = this.bottomFadeView;
            if (anonymousClass16 != null) {
                anonymousClass16.invalidate();
            }
        }
        updateDoneItemEnabled();
        this.containerView.invalidate();
    }

    @Override
    public final boolean onCustomLayout(View view, int i, int i2, int i3, int i4) {
        int iDp;
        int measuredWidth;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        chatAttachAlertPhotoLayout.getClass();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        boolean z = i5 < i6;
        int i7 = AndroidUtilities.navigationBarHeight;
        ChatActivity.AnonymousClass60 anonymousClass60 = chatAttachAlertPhotoLayout.cameraPanel;
        ChatAttachAlertPhotoLayout.AnonymousClass3 anonymousClass3 = chatAttachAlertPhotoLayout.cameraPhotoRecyclerView;
        if (view != anonymousClass60) {
            ZoomControlView zoomControlView = chatAttachAlertPhotoLayout.zoomControlView;
            if (view != zoomControlView) {
                TextView textView = chatAttachAlertPhotoLayout.counterTextView;
                if (view == textView) {
                    if (z) {
                        iDp = (i5 - textView.getMeasuredWidth()) / 2;
                        int iDp2 = i4 - AndroidUtilities.dp(167.0f);
                        textView.setRotation(0.0f);
                        if (anonymousClass3.getVisibility() == 0) {
                            iDp2 -= AndroidUtilities.dp(96.0f);
                        }
                        measuredWidth = iDp2 - i7;
                    } else {
                        iDp = i3 - AndroidUtilities.dp(167.0f);
                        measuredWidth = (textView.getMeasuredWidth() / 2) + (i6 / 2);
                        textView.setRotation(-90.0f);
                        if (anonymousClass3.getVisibility() == 0) {
                            iDp -= AndroidUtilities.dp(96.0f);
                        }
                    }
                    textView.layout(iDp, measuredWidth, textView.getMeasuredWidth() + iDp, textView.getMeasuredHeight() + measuredWidth);
                } else {
                    if (view != anonymousClass3) {
                        return false;
                    }
                    if (z) {
                        int iM = RichMessageLayout$$ExternalSyntheticOutline2.m(i6, 88.0f, i7);
                        view.layout(0, iM, view.getMeasuredWidth(), view.getMeasuredHeight() + iM);
                    } else {
                        int iDp3 = (i + i5) - AndroidUtilities.dp(88.0f);
                        view.layout(iDp3, 0, view.getMeasuredWidth() + iDp3, view.getMeasuredHeight());
                    }
                }
            } else if (z) {
                if (anonymousClass3.getVisibility() == 0) {
                    zoomControlView.layout(0, RichMessageLayout$$ExternalSyntheticOutline2.m(i4, 310.0f, i7), i5, RichMessageLayout$$ExternalSyntheticOutline2.m(i4, 260.0f, i7));
                } else {
                    zoomControlView.layout(0, RichMessageLayout$$ExternalSyntheticOutline2.m(i4, 176.0f, i7), i5, RichMessageLayout$$ExternalSyntheticOutline2.m(i4, 126.0f, i7));
                }
            } else if (anonymousClass3.getVisibility() == 0) {
                zoomControlView.layout(RichMessageLayout$$ExternalSyntheticOutline2.m(i3, 310.0f, i7), 0, i3 - AndroidUtilities.dp(260.0f), i6 - i7);
            } else {
                zoomControlView.layout(RichMessageLayout$$ExternalSyntheticOutline2.m(i3, 176.0f, i7), 0, i3 - AndroidUtilities.dp(126.0f), i6 - i7);
            }
        } else if (z) {
            if (anonymousClass3.getVisibility() == 0) {
                anonymousClass60.layout(0, RichMessageLayout$$ExternalSyntheticOutline2.m(i4, 222.0f, i7), i5, RichMessageLayout$$ExternalSyntheticOutline2.m(i4, 96.0f, i7));
            } else {
                anonymousClass60.layout(0, RichMessageLayout$$ExternalSyntheticOutline2.m(i4, 126.0f, i7), i5, i4 - i7);
            }
        } else if (anonymousClass3.getVisibility() == 0) {
            anonymousClass60.layout(RichMessageLayout$$ExternalSyntheticOutline2.m(i3, 222.0f, i7), 0, i3 - AndroidUtilities.dp(96.0f), i6 - i7);
        } else {
            anonymousClass60.layout(RichMessageLayout$$ExternalSyntheticOutline2.m(i3, 126.0f, i7), 0, i3, i6 - i7);
        }
        return true;
    }

    @Override
    public final boolean onCustomMeasure(View view, int i, int i2) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        chatAttachAlertPhotoLayout.getClass();
        boolean z = i < i2;
        ChatAttachAlertPhotoLayout.CameraViewInternal cameraViewInternal = chatAttachAlertPhotoLayout.cameraView;
        if (view != cameraViewInternal) {
            ChatActivity.AnonymousClass60 anonymousClass60 = chatAttachAlertPhotoLayout.cameraPanel;
            if (view == anonymousClass60) {
                if (z) {
                    anonymousClass60.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824));
                    return true;
                }
                anonymousClass60.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(126.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
                return true;
            }
            ZoomControlView zoomControlView = chatAttachAlertPhotoLayout.zoomControlView;
            if (view == zoomControlView) {
                if (z) {
                    zoomControlView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                    return true;
                }
                zoomControlView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
                return true;
            }
            ChatAttachAlertPhotoLayout.AnonymousClass3 anonymousClass3 = chatAttachAlertPhotoLayout.cameraPhotoRecyclerView;
            if (view == anonymousClass3) {
                chatAttachAlertPhotoLayout.cameraPhotoRecyclerViewIgnoreLayout = true;
                ChatAttachAlertPhotoLayout.PhotoAttachAdapter photoAttachAdapter = chatAttachAlertPhotoLayout.cameraAttachAdapter;
                PhotoViewer.AnonymousClass36 anonymousClass36 = chatAttachAlertPhotoLayout.cameraPhotoLayoutManager;
                if (z) {
                    anonymousClass3.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
                    if (anonymousClass36.mOrientation != 0) {
                        anonymousClass3.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                        anonymousClass36.setOrientation(0);
                        photoAttachAdapter.notifyDataSetChanged();
                    }
                } else {
                    anonymousClass3.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
                    if (anonymousClass36.mOrientation != 1) {
                        anonymousClass3.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        anonymousClass36.setOrientation(1);
                        photoAttachAdapter.notifyDataSetChanged();
                    }
                }
                chatAttachAlertPhotoLayout.cameraPhotoRecyclerViewIgnoreLayout = false;
                return true;
            }
        } else if (chatAttachAlertPhotoLayout.cameraOpened && !chatAttachAlertPhotoLayout.cameraAnimationInProgress) {
            cameraViewInternal.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
            return true;
        }
        return false;
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        this.photoLayout.setTranslationX(0.0f);
        this.mediaPreviewView.setAlpha(0.0f);
        this.selectedView.setAlpha(1.0f);
        this.containerView.setTranslationY(this.containerView.getMeasuredHeight());
        AnimatorSet animatorSet = new AnimatorSet();
        this.buttonsAnimation = animatorSet;
        int i = 2;
        AnonymousClass2 anonymousClass2 = this.ATTACH_ALERT_PROGRESS;
        boolean z = false;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, anonymousClass2, 0.0f, 400.0f));
        this.buttonsAnimation.setDuration(400L);
        this.buttonsAnimation.setStartDelay(20L);
        anonymousClass2.getClass();
        anonymousClass2.setValue(this, 0.0f);
        this.buttonsAnimation.start();
        ValueAnimator valueAnimator = this.navigationBarAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.navigationBarAlpha, 1.0f);
        this.navigationBarAnimation = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ChatAttachAlert$$ExternalSyntheticLambda8(this, 3));
        SpringAnimation springAnimation = this.appearSpringAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        SpringAnimation springAnimation2 = new SpringAnimation(this.containerView, DynamicAnimation.TRANSLATION_Y, 0.0f);
        this.appearSpringAnimation = springAnimation2;
        if (this.editingMessageObject != null) {
            springAnimation2.mSpring.setDampingRatio(0.75f);
            this.appearSpringAnimation.mSpring.setStiffness(350.0f);
        } else {
            springAnimation2.mSpring.setDampingRatio(0.75f);
            this.appearSpringAnimation.mSpring.setStiffness(350.0f);
        }
        this.appearSpringAnimation.start();
        if (this.useHardwareLayer) {
            this.container.setLayerType(2, null);
        }
        this.currentSheetAnimationType = 1;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofInt(this.backDrawable, AnimationProperties.COLOR_DRAWABLE_ALPHA, this.dimBehind ? this.dimBehindAlpha : 0));
        this.currentSheetAnimation.setDuration(400L);
        this.currentSheetAnimation.setStartDelay(20L);
        this.currentSheetAnimation.setInterpolator(this.openInterpolator);
        AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
        FilterGLThread$$ExternalSyntheticLambda1 filterGLThread$$ExternalSyntheticLambda1 = new FilterGLThread$$ExternalSyntheticLambda1(this, animationNotificationsLocker, super.delegate, 6);
        this.appearSpringAnimation.addEndListener(new PasscodeView$$ExternalSyntheticLambda15(i, this, filterGLThread$$ExternalSyntheticLambda1));
        this.currentSheetAnimation.addListener(new ChatActivity.AnonymousClass74(this, filterGLThread$$ExternalSyntheticLambda1, z, 15));
        animationNotificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        int alphaComponent = ColorUtils.setAlphaComponent(getThemedColor(Theme.key_windowBackgroundGray), Math.min(255, Math.max(0, (int) 0.0f)));
        this.navBarColor = alphaComponent;
        AndroidUtilities.setNavigationBarColor((Dialog) this, alphaComponent, false);
        AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        getContainer().invalidate();
        valueAnimatorOfFloat2.addUpdateListener(new ChatAttachAlert$$ExternalSyntheticLambda8(this, 4));
        valueAnimatorOfFloat2.setStartDelay(25L);
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.setInterpolator(CubicBezierInterpolator.DEFAULT);
        valueAnimatorOfFloat2.start();
        return true;
    }

    public final void onDestroy() {
        int i = 0;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i >= attachAlertLayoutArr.length) {
                break;
            }
            AttachAlertLayout attachAlertLayout = attachAlertLayoutArr[i];
            if (attachAlertLayout != null) {
                attachAlertLayout.onDestroy();
            }
            i++;
        }
        int i2 = this.currentAccount;
        NotificationCenter.getInstance(i2).removeObserver(this, NotificationCenter.reloadInlineHints);
        NotificationCenter.getInstance(i2).removeObserver(this, NotificationCenter.attachMenuBotsDidLoad);
        NotificationCenter.getInstance(i2).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        NotificationCenter.getInstance(i2).removeObserver(this, NotificationCenter.quickRepliesUpdated);
        this.destroyed = true;
        AnonymousClass19 anonymousClass19 = this.commentTextView;
        if (anonymousClass19 != null) {
            anonymousClass19.onDestroy();
        }
        AnonymousClass21 anonymousClass21 = this.topCommentTextView;
        if (anonymousClass21 != null) {
            anonymousClass21.onDestroy();
        }
    }

    @Override
    public final void onDismissWithTouchOutside() {
        if (this.currentAttachLayout.onDismissWithTouchOutside()) {
            lambda$showGiftOfferSheet$15();
        }
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        AttachAlertLayout attachAlertLayout;
        if (i == 0) {
            checkUi_writeButtonContainerY();
            checkUi_bottomFade();
            return;
        }
        if (i == 2) {
            checkUi_bottomFade();
            ChatAttachAlertPollLayout chatAttachAlertPollLayout = this.pollLayout;
            if (chatAttachAlertPollLayout != null && ((attachAlertLayout = this.nextAttachLayout) == chatAttachAlertPollLayout || this.currentAttachLayout == chatAttachAlertPollLayout)) {
                updateSelectedPosition(attachAlertLayout == chatAttachAlertPollLayout ? 1 : 0);
            }
            ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = this.todoLayout;
            if (chatAttachAlertPollLayout2 != null) {
                AttachAlertLayout attachAlertLayout2 = this.nextAttachLayout;
                if (attachAlertLayout2 == chatAttachAlertPollLayout2 || this.currentAttachLayout == chatAttachAlertPollLayout2) {
                    updateSelectedPosition(attachAlertLayout2 != chatAttachAlertPollLayout2 ? 0 : 1);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 1) {
            checkUi_bottomFade();
            return;
        }
        if (i == 3) {
            checkUi_moveCaptionButtonVisibility();
            return;
        }
        if (i == 4) {
            checkUi_moveCaptionButtonVisibility();
            return;
        }
        if (i == 5) {
            checkUi_moveCaptionButtonVisibility();
            AnonymousClass24 anonymousClass24 = this.writeButton;
            if (anonymousClass24 != null) {
                anonymousClass24.setEphemeralFactor(f);
                anonymousClass24.setSameWidthFactor(f);
            }
        }
    }

    @Override
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.currentAttachLayout.onSheetKeyDown(i)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void onLongClickBotButton(TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        String userName = tL_attachMenuBot != null ? tL_attachMenuBot.short_name : UserObject.getUserName(user);
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.currentAccount).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i);
            i++;
            if (tL_attachMenuBot2.bot_id == user.id) {
                break;
            }
        }
        String string = LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, userName);
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, null);
        String string2 = LocaleController.getString(R.string.BotRemoveFromMenuTitle);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string2;
        if (tL_attachMenuBot == null) {
            string = LocaleController.formatString("BotRemoveInlineFromMenu", R.string.BotRemoveInlineFromMenu, userName);
        }
        alertDialog.message = AndroidUtilities.replaceTags(string);
        builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), new ChatActivity$$ExternalSyntheticLambda248(this, tL_attachMenuBot, user, 25));
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        builder.show();
    }

    @Override
    public final void onOpenAnimationEnd() {
        if (this.baseFragment instanceof ChatActivity) {
            int i = MediaController.VIDEO_BITRATE_1080;
        } else {
            int i2 = MediaController.VIDEO_BITRATE_1080;
        }
        this.currentAttachLayout.onOpenAnimationEnd();
        AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString("AccDescrAttachButton", R.string.AccDescrAttachButton));
        this.openTransitionFinished = true;
        if (this.videosEnabled || this.photosEnabled) {
            return;
        }
        checkCanRemoveRestrictionsByBoosts();
    }

    public final void onPause() {
        int i = 0;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i >= attachAlertLayoutArr.length) {
                this.paused = true;
                return;
            }
            AttachAlertLayout attachAlertLayout = attachAlertLayoutArr[i];
            if (attachAlertLayout != null) {
                attachAlertLayout.onPause();
            }
            i++;
        }
    }

    public final void onResume() {
        int i = 0;
        this.paused = false;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i >= attachAlertLayoutArr.length) {
                break;
            }
            AttachAlertLayout attachAlertLayout = attachAlertLayoutArr[i];
            if (attachAlertLayout != null) {
                attachAlertLayout.onResume();
            }
            i++;
        }
        if (isShowing()) {
            this.delegate.needEnterComment();
        }
        ButtonsAdapter buttonsAdapter = this.buttonsAdapter;
        if (buttonsAdapter != null) {
            buttonsAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).overlayPasscodeViews.add(this.passcodeView);
        }
    }

    @Override
    public final void onStop() {
        super.onStop();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).overlayPasscodeViews.remove(this.passcodeView);
        }
    }

    public final void onWriteButtonPressed() {
        MessageObject messageObject = this.editingMessageObject;
        BaseFragment baseFragment = this.baseFragment;
        int i = this.currentAccount;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(i, this.editingMessageObject.getDialogId()) && (baseFragment instanceof ChatActivity)) {
            ChatActivity chatActivity = (ChatActivity) baseFragment;
            MessageSuggestionParams messageSuggestionParamsOf = chatActivity.messageSuggestionParams;
            if (messageSuggestionParamsOf == null) {
                messageSuggestionParamsOf = MessageSuggestionParams.of(this.editingMessageObject.messageOwner.suggested_post);
            }
            if (!StarsController.isEnoughAmount(i, messageSuggestionParamsOf.amount)) {
                chatActivity.showSuggestionOfferForEditMessage(messageSuggestionParamsOf);
                return;
            }
        }
        if (this.currentLimit - this.codepointCount < 0) {
            AndroidUtilities.shakeView(this.captionLimitView);
            AndroidUtilities.shakeView(this.topCaptionLimitView);
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (MessagesController.getInstance(i).premiumFeaturesBlocked() || MessagesController.getInstance(i).captionLengthLimitPremium <= this.codepointCount) {
                return;
            }
            showCaptionLimitBulletin(baseFragment);
            return;
        }
        if (this.editingMessageObject == null && (baseFragment instanceof ChatActivity)) {
            ChatActivity chatActivity2 = (ChatActivity) baseFragment;
            if (chatActivity2.isInScheduleMode()) {
                AlertsCreator.createScheduleDatePickerDialog(getContext(), chatActivity2.getDialogId(), -1L, 0, new ChatAttachAlert$$ExternalSyntheticLambda1(this, 11), null, this.resourcesProvider);
                return;
            }
        }
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        if (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout) {
            sendPressed(0, true, 0, isCaptionAbove(), this.effectId);
            return;
        }
        if (attachAlertLayout.sendSelectedItems(0, true, 0, isCaptionAbove(), this.effectId)) {
            return;
        }
        this.allowPassConfirmationAlert = true;
        lambda$showGiftOfferSheet$15();
    }

    public final void openAttachLayoutForType(int i) {
        BaseFragment baseFragment = this.baseFragment;
        if (i != 3) {
            if (i == 6 && AndroidUtilities.isMapsInstalled(baseFragment)) {
                if (this.locationLayout == null) {
                    ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = new ChatAttachAlertLocationLayout(this, getContext(), this.resourcesProvider, (this.isPollAttach || this.restrictEphemeralMessageTypes) ? false : true);
                    this.locationLayout = chatAttachAlertLocationLayout;
                    this.layouts[5] = chatAttachAlertLocationLayout;
                    ChatAttachAlertLocationLayout.LocationActivityDelegate locationActivityDelegate = this.locationActivityDelegate;
                    if (locationActivityDelegate != null) {
                        chatAttachAlertLocationLayout.setDelegate(locationActivityDelegate);
                    } else if (baseFragment instanceof ChatActivity) {
                        chatAttachAlertLocationLayout.setDelegate(new ChatAttachAlert$$ExternalSyntheticLambda1(this, 16));
                    }
                }
                showLayout(this.locationLayout);
                return;
            }
            return;
        }
        if (this.musicEnabled || !checkCanRemoveRestrictionsByBoosts()) {
            Activity parentActivity = baseFragment != null ? baseFragment.getParentActivity() : null;
            if (parentActivity != null) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                        parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 4);
                        return;
                    }
                } else if (i2 >= 23 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
            }
            openAudioLayout(true);
        }
    }

    public final void openAudioLayout(boolean z) {
        if (!this.musicEnabled && z) {
            ChatAttachRestrictedLayout chatAttachRestrictedLayout = new ChatAttachRestrictedLayout(3, getContext(), this.resourcesProvider, this);
            this.restrictedLayout = chatAttachRestrictedLayout;
            showLayout(chatAttachRestrictedLayout);
        }
        int i = 1;
        if (this.audioLayout == null) {
            ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = new ChatAttachAlertAudioLayout(getContext(), this.resourcesProvider, this);
            this.audioLayout = chatAttachAlertAudioLayout;
            this.layouts[3] = chatAttachAlertAudioLayout;
            chatAttachAlertAudioLayout.setupBlurredSearchField(this.iBlur3FactoryLiquidGlass);
            this.audioLayout.setDelegate(new ChatAttachAlert$$ExternalSyntheticLambda1(this, 13));
            if (this.isPollAttach) {
                this.audioLayout.setMaxSelectedFiles(1);
            }
        }
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            TLRPC.Chat chat = ((ChatActivity) baseFragment).currentChat;
            ChatAttachAlertAudioLayout chatAttachAlertAudioLayout2 = this.audioLayout;
            if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.editingMessageObject == null) {
                i = -1;
            }
            chatAttachAlertAudioLayout2.setMaxSelectedFiles(i);
        }
        if (z) {
            showLayout(this.audioLayout);
        }
    }

    public final void openColorsLayout() {
        if (this.colorsLayout == null) {
            ChatAttachAlertColorsLayout chatAttachAlertColorsLayout = new ChatAttachAlertColorsLayout(getContext(), this.resourcesProvider, this);
            this.colorsLayout = chatAttachAlertColorsLayout;
            chatAttachAlertColorsLayout.setDelegate(new ChatActivity$$ExternalSyntheticLambda211(this, 5));
        }
        showLayout(this.colorsLayout);
    }

    public final void openContactsLayout() {
        if (!this.plainTextEnabled) {
            ChatAttachRestrictedLayout chatAttachRestrictedLayout = new ChatAttachRestrictedLayout(5, getContext(), this.resourcesProvider, this);
            this.restrictedLayout = chatAttachRestrictedLayout;
            showLayout(chatAttachRestrictedLayout);
        }
        if (this.contactsLayout == null) {
            ChatAttachAlertContactsLayout chatAttachAlertContactsLayout = new ChatAttachAlertContactsLayout(getContext(), this.resourcesProvider, this);
            this.contactsLayout = chatAttachAlertContactsLayout;
            this.layouts[2] = chatAttachAlertContactsLayout;
            chatAttachAlertContactsLayout.setupBlurredSearchField(this.iBlur3FactoryLiquidGlass);
            this.contactsLayout.setDelegate(new ChatAttachAlertContactsLayout.PhonebookShareAlertDelegate() {
                @Override
                public final void didSelectContact(TLRPC.TL_userContact_old2 tL_userContact_old2, boolean z, int i, long j) {
                    ChatActivity chatActivity = (ChatActivity) ChatAttachAlert.this.baseFragment;
                    if (chatActivity.checkSlowModeAlert()) {
                        SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(tL_userContact_old2, chatActivity.dialog_id, chatActivity.replyingMessageObject, chatActivity.threadMessageObject, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z, i, 0);
                        sendMessageParamsOf.sendMessageChatArguments = chatActivity.getMessageChatSendParams();
                        sendMessageParamsOf.effect_id = 0L;
                        sendMessageParamsOf.invert_media = false;
                        sendMessageParamsOf.payStars = j;
                        sendMessageParamsOf.monoForumPeer = chatActivity.getSendMonoForumPeerId();
                        sendMessageParamsOf.suggestionParams = chatActivity.messageSuggestionParams;
                        chatActivity.getSendMessagesHelper().sendMessage(sendMessageParamsOf);
                        chatActivity.afterMessageSend();
                    }
                }

                @Override
                public final void didSelectContacts(ArrayList arrayList, String str, boolean z, int i, long j, boolean z2) {
                    ((ChatActivity) ChatAttachAlert.this.baseFragment).sendContacts(arrayList, str, z, i, j, z2);
                }
            });
        }
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            TLRPC.Chat chat = ((ChatActivity) baseFragment).currentChat;
            this.contactsLayout.setMultipleSelectionAllowed(chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled);
        }
        showLayout(this.contactsLayout);
    }

    public final void openDocumentsLayout(boolean z) {
        if (!this.documentsEnabled && z) {
            ChatAttachRestrictedLayout chatAttachRestrictedLayout = new ChatAttachRestrictedLayout(4, getContext(), this.resourcesProvider, this);
            this.restrictedLayout = chatAttachRestrictedLayout;
            showLayout(chatAttachRestrictedLayout);
        }
        boolean z2 = false;
        if (this.documentLayout == null) {
            ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = new ChatAttachAlertDocumentLayout(this.isSoundPicker ? 2 : 0, getContext(), this.resourcesProvider, this);
            this.documentLayout = chatAttachAlertDocumentLayout;
            this.layouts[4] = chatAttachAlertDocumentLayout;
            chatAttachAlertDocumentLayout.setDelegate(new ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate() {
                @Override
                public final void didSelectFiles(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z3, int i, long j, boolean z4, long j2) {
                    ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                    ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate documentSelectActivityDelegate = chatAttachAlert.documentsDelegate;
                    if (documentSelectActivityDelegate != null) {
                        documentSelectActivityDelegate.didSelectFiles(arrayList, str, arrayList2, arrayList3, z3, i, j, z4, j2);
                        return;
                    }
                    Object obj = chatAttachAlert.baseFragment;
                    if (obj instanceof ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate) {
                        ((ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate) obj).didSelectFiles(arrayList, str, arrayList2, arrayList3, z3, i, j, z4, j2);
                        return;
                    }
                    if (obj instanceof PassportActivity) {
                        PassportActivity passportActivity = (PassportActivity) obj;
                        passportActivity.getClass();
                        ArrayList arrayList4 = new ArrayList();
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                            sendingMediaInfo.path = (String) arrayList.get(i2);
                            arrayList4.add(sendingMediaInfo);
                        }
                        passportActivity.processSelectedFiles(arrayList4);
                    }
                }

                @Override
                public final void didSelectPhotos(long j, ArrayList arrayList, boolean z3, int i) {
                    ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                    ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate documentSelectActivityDelegate = chatAttachAlert.documentsDelegate;
                    if (documentSelectActivityDelegate != null) {
                        documentSelectActivityDelegate.didSelectPhotos(j, arrayList, z3, i);
                        return;
                    }
                    BaseFragment baseFragment = chatAttachAlert.baseFragment;
                    if (baseFragment instanceof ChatActivity) {
                        ((ChatActivity) baseFragment).didSelectPhotos(j, arrayList, z3, i);
                    } else if (baseFragment instanceof PassportActivity) {
                        ((PassportActivity) baseFragment).processSelectedFiles(arrayList);
                    }
                }

                @Override
                public final void startDocumentSelectActivity() {
                    ChatAttachAlert chatAttachAlert = ChatAttachAlert.this;
                    ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate documentSelectActivityDelegate = chatAttachAlert.documentsDelegate;
                    if (documentSelectActivityDelegate != null) {
                        documentSelectActivityDelegate.startDocumentSelectActivity();
                        return;
                    }
                    Object obj = chatAttachAlert.baseFragment;
                    if (obj instanceof ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate) {
                        ((ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate) obj).startDocumentSelectActivity();
                        return;
                    }
                    if (obj instanceof PassportActivity) {
                        PassportActivity passportActivity = (PassportActivity) obj;
                        passportActivity.getClass();
                        try {
                            Intent intent = new Intent("android.intent.action.GET_CONTENT");
                            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                            intent.setType("*/*");
                            passportActivity.startActivityForResult(intent, 21);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                }

                @Override
                public final void startMusicSelectActivity() {
                    ChatAttachAlert.this.openAudioLayout(true);
                }
            });
        }
        int i = 1;
        if (this.isPollAttach) {
            this.documentLayout.setMaxSelectedFiles(1);
        } else {
            BaseFragment baseFragment = this.baseFragment;
            if (baseFragment instanceof ChatActivity) {
                TLRPC.Chat chat = ((ChatActivity) baseFragment).currentChat;
                ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout2 = this.documentLayout;
                if ((chat == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) && this.editingMessageObject == null) {
                    i = -1;
                }
                chatAttachAlertDocumentLayout2.setMaxSelectedFiles(i);
            } else {
                this.documentLayout.setMaxSelectedFiles(this.maxSelectedPhotos);
                ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout3 = this.documentLayout;
                if (!this.isSoundPicker && !this.allowEnterCaption) {
                    z2 = true;
                }
                chatAttachAlertDocumentLayout3.setCanSelectOnlyImageFiles(z2);
            }
        }
        ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout4 = this.documentLayout;
        chatAttachAlertDocumentLayout4.isSoundPicker = this.isSoundPicker;
        if (z) {
            showLayout(chatAttachAlertDocumentLayout4);
        }
    }

    public final void removeFromRoot() {
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        AnonymousClass7 anonymousClass7 = this.actionBar;
        int i = 1;
        if (anonymousClass7.isSearchFieldVisible) {
            anonymousClass7.closeSearchField(true);
        }
        this.contactsLayout = null;
        this.quickRepliesLayout = null;
        this.audioLayout = null;
        this.pollLayout = null;
        this.todoLayout = null;
        this.locationLayout = null;
        this.documentLayout = null;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i >= attachAlertLayoutArr.length) {
                updateActionBarVisibility(false, false);
                super.dismissInternal();
                return;
            }
            AttachAlertLayout attachAlertLayout = attachAlertLayoutArr[i];
            if (attachAlertLayout != null) {
                attachAlertLayout.onDestroy();
                this.containerView.removeView(attachAlertLayoutArr[i]);
                attachAlertLayoutArr[i] = null;
            }
            i++;
        }
    }

    public final boolean sendPressed(final int i, final boolean z, final int i2, final boolean z2, final long j) {
        if (this.buttonPressed) {
            return false;
        }
        BaseFragment baseFragment = this.baseFragment;
        boolean z3 = baseFragment instanceof ChatActivity;
        int i3 = this.currentAccount;
        if (z3) {
            ChatActivity chatActivity = (ChatActivity) baseFragment;
            TLRPC.Chat chat = chatActivity.currentChat;
            if (chatActivity.getCurrentUser() != null || ((ChatObject.isChannel(chat) && chat.megagroup) || !ChatObject.isChannel(chat))) {
                MessagesController.getNotificationsSettings(i3).edit().putBoolean("silent_" + chatActivity.getDialogId(), !z).commit();
            }
        }
        if (z3 ? ChatActivityEnterView.checkPremiumAnimatedEmoji(i3, ((ChatActivity) baseFragment).getDialogId(), baseFragment, getCommentView().getText()) : false) {
            return true;
        }
        applyCaption();
        if (this.animatorEphemeralMessageVisibility.value) {
            this.buttonPressed = true;
            this.delegate.didPressedButton(7, true, z, i, i2, j, z2, false, 0L);
            return true;
        }
        long dialogId = getDialogId();
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        return AlertsCreator.ensurePaidMessageConfirmation(this.currentAccount, dialogId, getAdditionalMessagesCount() + (attachAlertLayout != null ? attachAlertLayout.getSelectedItemsCount() : 1), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ChatAttachAlert chatAttachAlert = this.f$0;
                chatAttachAlert.buttonPressed = true;
                ChatAttachAlert.ChatAttachViewDelegate chatAttachViewDelegate = chatAttachAlert.delegate;
                long jLongValue = ((Long) obj).longValue();
                chatAttachViewDelegate.didPressedButton(7, true, z, i, i2, j, z2, false, jLongValue);
            }
        }, 0L);
    }

    @Override
    public final void setAllowNestedScroll(boolean z) {
        this.allowNestedScroll = z;
    }

    public final void setCaptionAbove(boolean z, boolean z2) {
        this.animatorCaptionAbove.setValue(z, z2);
        EditTextEmoji commentView = getCommentView();
        this.captionAbove = z;
        EditTextEmoji commentView2 = getCommentView();
        final boolean z3 = this.frameLayout2.getTag() != null;
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        final boolean z4 = this.captionAbove && (attachAlertLayout == this.photoLayout || attachAlertLayout == this.photoPreviewLayout);
        IntroActivity.AnonymousClass1 anonymousClass1 = this.topCommentContainer;
        AnonymousClass18 anonymousClass18 = this.captionContainer;
        if (z2) {
            anonymousClass1.setVisibility(z3 ? 0 : 8);
            ViewPropertyAnimator duration = anonymousClass1.animate().alpha((z4 && z3) ? 1.0f : 0.0f).setDuration(320L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            final int i = 0;
            duration.setInterpolator(cubicBezierInterpolator).setUpdateListener(new ChatAttachAlert$$ExternalSyntheticLambda8(this, 1)).withEndAction(new Runnable(this) {
                public final ChatAttachAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i) {
                        case 0:
                            ChatAttachAlert chatAttachAlert = this.f$0;
                            chatAttachAlert.getClass();
                            if (!z4 || !z3) {
                                chatAttachAlert.topCommentContainer.setVisibility(8);
                            }
                            chatAttachAlert.updatedTopCaptionHeight();
                            break;
                        default:
                            ChatAttachAlert chatAttachAlert2 = this.f$0;
                            chatAttachAlert2.getClass();
                            if (z4 || !z3) {
                                chatAttachAlert2.captionContainer.setVisibility(8);
                            }
                            break;
                    }
                }
            }).start();
            anonymousClass18.setVisibility(0);
            ViewPropertyAnimator updateListener = anonymousClass18.animate().translationY((z4 || !z3) ? anonymousClass18.getMeasuredHeight() : 0.0f).alpha((z4 || !z3) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator).setUpdateListener(new ChatAttachAlert$$ExternalSyntheticLambda8(this, 2));
            final int i2 = 1;
            updateListener.withEndAction(new Runnable(this) {
                public final ChatAttachAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i2) {
                        case 0:
                            ChatAttachAlert chatAttachAlert = this.f$0;
                            chatAttachAlert.getClass();
                            if (!z4 || !z3) {
                                chatAttachAlert.topCommentContainer.setVisibility(8);
                            }
                            chatAttachAlert.updatedTopCaptionHeight();
                            break;
                        default:
                            ChatAttachAlert chatAttachAlert2 = this.f$0;
                            chatAttachAlert2.getClass();
                            if (z4 || !z3) {
                                chatAttachAlert2.captionContainer.setVisibility(8);
                            }
                            break;
                    }
                }
            }).start();
        } else {
            anonymousClass1.setVisibility((z4 && z3) ? 0 : 8);
            anonymousClass1.setAlpha((z4 && z3) ? 1.0f : 0.0f);
            updatedTopCaptionHeight();
            anonymousClass18.setAlpha((z4 || !z3) ? 0.0f : 1.0f);
            anonymousClass18.setTranslationY((z4 || !z3) ? anonymousClass18.getMeasuredHeight() : 0.0f);
            anonymousClass18.setVisibility((z4 || !z3) ? 8 : 0);
        }
        if (commentView != commentView2) {
            commentView.hidePopup(true);
            commentView2.setText(AnimatedEmojiSpan.cloneSpans(commentView.getText()));
            commentView2.getEditText().setAllowTextEntitiesIntersection(commentView.getEditText().getAllowTextEntitiesIntersection());
            if (commentView.getEditText().isFocused()) {
                commentView2.getEditText().requestFocus();
                commentView2.getEditText().setSelection(commentView.getEditText().getSelectionStart(), commentView.getEditText().getSelectionEnd());
            }
        }
        AndroidUtilities.runOnUIThread(new ChatAttachAlert$$ExternalSyntheticLambda7(this, 1));
    }

    public final void setEditingMessageObject(MessageObject messageObject, int i) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        if (messageObject != null && (chatAttachAlertPhotoLayout = this.photoLayout) != null) {
            chatAttachAlertPhotoLayout.clearSelectedPhotos();
        }
        if (this.editingMessageObject == messageObject && this.editType == i) {
            return;
        }
        this.editingMessageObject = messageObject;
        if (messageObject != null && messageObject.hasValidGroupId()) {
            if (this.editingMessageObject.isMusic()) {
                i = 2;
            } else {
                i = this.editingMessageObject.isDocument() ? 1 : 0;
            }
        }
        this.editType = i;
        if (this.editingMessageObject != null) {
            this.maxSelectedPhotos = 1;
            this.allowOrder = false;
        } else {
            this.maxSelectedPhotos = -1;
            this.allowOrder = true;
        }
        this.buttonsAdapter.notifyDataSetChanged();
        updateCountButton(0);
    }

    public final void setMaxSelectedPhotos(int i, boolean z) {
        if (this.editingMessageObject != null) {
            return;
        }
        this.maxSelectedPhotos = i;
        this.allowOrder = z;
    }

    public final void setupPhotoPicker(String str) {
        this.avatarPicker = 1;
        this.isPhotoPicker = true;
        this.typeButtonsAvailable = false;
        this.videosEnabled = false;
        this.buttonsRecyclerViewWrapper.setVisibility(8);
        this.selectedTextView.setText(str);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout != null) {
            ChatAttachAlert chatAttachAlert = chatAttachAlertPhotoLayout.parentAlert;
            chatAttachAlertPhotoLayout.showAvatarConstructor = (chatAttachAlert.avatarPicker == 0 || chatAttachAlert.isPhotoPicker) ? false : true;
        }
    }

    @Override
    public final boolean shouldOverlayCameraViewOverNavBar() {
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        return attachAlertLayout == chatAttachAlertPhotoLayout && chatAttachAlertPhotoLayout.cameraExpanded;
    }

    @Override
    public final void show() {
        super.show();
        this.buttonPressed = false;
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment instanceof ChatActivity) {
            this.calcMandatoryInsets = ((ChatActivity) baseFragment).isKeyboardVisible();
        }
        updateDoneItemEnabled();
        this.openTransitionFinished = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int alphaComponent = ColorUtils.setAlphaComponent(getThemedColor(Theme.key_windowBackgroundGray), 0);
            this.navBarColor = alphaComponent;
            AndroidUtilities.setNavigationBarColor((Dialog) this, alphaComponent, false);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        }
        if (this.hasOverridenWebviewBackgroundColor) {
            this.hasOverridenWebviewBackgroundColor = false;
            AnonymousClass7 anonymousClass7 = this.actionBar;
            anonymousClass7.updateColors$1();
            anonymousClass7.invalidate();
            onCurrentLayoutAnimatorChanged$1();
        }
    }

    public final void showAiButton$1(boolean z) {
        boolean z2;
        if (z) {
            BaseFragment baseFragment = this.baseFragment;
            if (!(baseFragment instanceof ChatActivity) || ((ChatActivity) baseFragment).isSecretChat()) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (this.shownAiButton == z2) {
            return;
        }
        if (z2) {
            MessagesController.getInstance(this.currentAccount).getTonesController().load();
        }
        this.shownAiButton = z2;
        ImageView imageView = this.aiButton;
        imageView.setVisibility(0);
        ImageView imageView2 = this.topAiButton;
        imageView2.setVisibility(0);
        ViewPropertyAnimator viewPropertyAnimatorScaleY = imageView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        viewPropertyAnimatorScaleY.setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new ChatAttachAlert$$ExternalSyntheticLambda6(this, z2, 1)).start();
        imageView2.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f).setInterpolator(cubicBezierInterpolator).setDuration(420L).withEndAction(new ChatAttachAlert$$ExternalSyntheticLambda6(this, z2, 2)).start();
        if (z2) {
            AiButtonDrawable aiButtonDrawable = this.aiButtonIcon;
            Objects.requireNonNull(aiButtonDrawable);
            imageView.postDelayed(new AiButtonDrawable$$ExternalSyntheticLambda0(aiButtonDrawable, 1), 220L);
            AiButtonDrawable aiButtonDrawable2 = this.topAiButtonIcon;
            Objects.requireNonNull(aiButtonDrawable2);
            imageView2.postDelayed(new AiButtonDrawable$$ExternalSyntheticLambda0(aiButtonDrawable2, 1), 220L);
        }
    }

    public final void showBotLayout(long j, String str, boolean z, boolean z2) {
        BaseFragment baseFragment;
        MessageObject replyingMessageObject;
        long dialogId;
        int i;
        long sendMonoForumPeerId;
        int i2;
        ActionBarMenuSubItem actionBarMenuSubItem;
        TLRPC.TL_messages_requestWebView tL_messages_requestWebView;
        JSONObject jSONObjectMakeThemeParams;
        TLRPC.InputReplyTo inputReplyToCreateReplyInput;
        TLRPC.ChatFull chatFull;
        TLRPC.Peer peer;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        String string;
        LongSparseArray longSparseArray = this.botAttachLayouts;
        if (longSparseArray.get(j) == null || !Objects.equals(str, ((ChatAttachAlertBotWebViewLayout) longSparseArray.get(j)).getStartCommand())) {
            baseFragment = this.baseFragment;
            if (baseFragment instanceof ChatActivity) {
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout = new ChatAttachAlertBotWebViewLayout(getContext(), this.resourcesProvider, this);
                longSparseArray.put(j, chatAttachAlertBotWebViewLayout);
                ((ChatAttachAlertBotWebViewLayout) longSparseArray.get(j)).setDelegate(new AnonymousClass1(chatAttachAlertBotWebViewLayout, str, j));
                ChatActivity chatActivity = (ChatActivity) baseFragment;
                replyingMessageObject = chatActivity.chatActivityEnterView.getReplyingMessageObject();
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout2 = (ChatAttachAlertBotWebViewLayout) longSparseArray.get(j);
                dialogId = chatActivity.getDialogId();
                if (replyingMessageObject != null) {
                    i = replyingMessageObject.messageOwner.id;
                } else {
                    i = 0;
                }
                sendMonoForumPeerId = chatActivity.getSendMonoForumPeerId();
                i2 = this.currentAccount;
                chatAttachAlertBotWebViewLayout2.currentAccount = i2;
                chatAttachAlertBotWebViewLayout2.peerId = dialogId;
                chatAttachAlertBotWebViewLayout2.botId = j;
                chatAttachAlertBotWebViewLayout2.replyToMsgId = i;
                chatAttachAlertBotWebViewLayout2.monoforumTopicId = sendMonoForumPeerId;
                chatAttachAlertBotWebViewLayout2.startCommand = str;
                actionBarMenuSubItem = chatAttachAlertBotWebViewLayout2.addToHomeScreenItem;
                if (actionBarMenuSubItem != null) {
                    if (MediaDataController.getInstance(i2).canCreateAttachedMenuBotShortcut(j)) {
                        actionBarMenuSubItem.setVisibility(0);
                    } else {
                        actionBarMenuSubItem.setVisibility(8);
                    }
                }
                TLRPC.User user = MessagesController.getInstance(i2).getUser(Long.valueOf(j));
                ChatAttachAlertBotWebViewLayout.AnonymousClass1 anonymousClass1 = chatAttachAlertBotWebViewLayout2.webViewContainer;
                anonymousClass1.setBotUser(user);
                anonymousClass1.loadFlickerAndSettingsItem(i2, j);
                tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                tL_messages_requestWebView.peer = MessagesController.getInstance(i2).getInputPeer(dialogId);
                tL_messages_requestWebView.bot = MessagesController.getInstance(i2).getInputUser(j);
                tL_messages_requestWebView.silent = false;
                tL_messages_requestWebView.platform = "android";
                if (dialogId < 0 && (chatFull = MessagesController.getInstance(i2).getChatFull(-dialogId)) != null && (peer = chatFull.default_send_as) != null) {
                    tL_messages_requestWebView.send_as = MessagesController.getInstance(i2).getInputPeer(peer);
                    tL_messages_requestWebView.flags |= 8192;
                }
                if (str != null) {
                    tL_messages_requestWebView.start_param = str;
                    tL_messages_requestWebView.flags |= 8;
                }
                if (i != 0) {
                    inputReplyToCreateReplyInput = SendMessagesHelper.getInstance(i2).createReplyInput(i);
                    tL_messages_requestWebView.reply_to = inputReplyToCreateReplyInput;
                    if (sendMonoForumPeerId != 0) {
                        inputReplyToCreateReplyInput.monoforum_peer_id = MessagesController.getInstance(i2).getInputPeer(sendMonoForumPeerId);
                        tL_messages_requestWebView.reply_to.flags |= 32;
                    }
                    tL_messages_requestWebView.flags |= 1;
                } else if (sendMonoForumPeerId != 0) {
                    TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                    tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                    tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(i2).getInputPeer(sendMonoForumPeerId);
                    tL_messages_requestWebView.flags |= 1;
                }
                jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(chatAttachAlertBotWebViewLayout2.resourcesProvider, false);
                if (jSONObjectMakeThemeParams != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_messages_requestWebView.theme_params = tL_dataJSON;
                    tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
                    tL_messages_requestWebView.flags |= 4;
                }
                ConnectionsManager.getInstance(i2).sendRequest(tL_messages_requestWebView, new LaunchActivity$$ExternalSyntheticLambda63(chatAttachAlertBotWebViewLayout2, i2, 9));
                NotificationCenter.getInstance(i2).addObserver(chatAttachAlertBotWebViewLayout2, NotificationCenter.webViewResultSent);
            }
        } else {
            ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout3 = (ChatAttachAlertBotWebViewLayout) longSparseArray.get(j);
            if (chatAttachAlertBotWebViewLayout3.needReload) {
                chatAttachAlertBotWebViewLayout3.needReload = false;
                baseFragment = this.baseFragment;
                if (baseFragment instanceof ChatActivity) {
                    ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout4 = new ChatAttachAlertBotWebViewLayout(getContext(), this.resourcesProvider, this);
                    longSparseArray.put(j, chatAttachAlertBotWebViewLayout4);
                    ((ChatAttachAlertBotWebViewLayout) longSparseArray.get(j)).setDelegate(new AnonymousClass1(chatAttachAlertBotWebViewLayout4, str, j));
                    ChatActivity chatActivity2 = (ChatActivity) baseFragment;
                    replyingMessageObject = chatActivity2.chatActivityEnterView.getReplyingMessageObject();
                    ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout5 = (ChatAttachAlertBotWebViewLayout) longSparseArray.get(j);
                    dialogId = chatActivity2.getDialogId();
                    if (replyingMessageObject != null) {
                        i = replyingMessageObject.messageOwner.id;
                    } else {
                        i = 0;
                    }
                    sendMonoForumPeerId = chatActivity2.getSendMonoForumPeerId();
                    i2 = this.currentAccount;
                    chatAttachAlertBotWebViewLayout5.currentAccount = i2;
                    chatAttachAlertBotWebViewLayout5.peerId = dialogId;
                    chatAttachAlertBotWebViewLayout5.botId = j;
                    chatAttachAlertBotWebViewLayout5.replyToMsgId = i;
                    chatAttachAlertBotWebViewLayout5.monoforumTopicId = sendMonoForumPeerId;
                    chatAttachAlertBotWebViewLayout5.startCommand = str;
                    actionBarMenuSubItem = chatAttachAlertBotWebViewLayout5.addToHomeScreenItem;
                    if (actionBarMenuSubItem != null) {
                        if (MediaDataController.getInstance(i2).canCreateAttachedMenuBotShortcut(j)) {
                            actionBarMenuSubItem.setVisibility(0);
                        } else {
                            actionBarMenuSubItem.setVisibility(8);
                        }
                    }
                    TLRPC.User user2 = MessagesController.getInstance(i2).getUser(Long.valueOf(j));
                    ChatAttachAlertBotWebViewLayout.AnonymousClass1 anonymousClass2 = chatAttachAlertBotWebViewLayout5.webViewContainer;
                    anonymousClass2.setBotUser(user2);
                    anonymousClass2.loadFlickerAndSettingsItem(i2, j);
                    tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
                    tL_messages_requestWebView.peer = MessagesController.getInstance(i2).getInputPeer(dialogId);
                    tL_messages_requestWebView.bot = MessagesController.getInstance(i2).getInputUser(j);
                    tL_messages_requestWebView.silent = false;
                    tL_messages_requestWebView.platform = "android";
                    if (dialogId < 0) {
                        tL_messages_requestWebView.send_as = MessagesController.getInstance(i2).getInputPeer(peer);
                        tL_messages_requestWebView.flags |= 8192;
                    }
                    if (str != null) {
                        tL_messages_requestWebView.start_param = str;
                        tL_messages_requestWebView.flags |= 8;
                    }
                    if (i != 0) {
                        inputReplyToCreateReplyInput = SendMessagesHelper.getInstance(i2).createReplyInput(i);
                        tL_messages_requestWebView.reply_to = inputReplyToCreateReplyInput;
                        if (sendMonoForumPeerId != 0) {
                            inputReplyToCreateReplyInput.monoforum_peer_id = MessagesController.getInstance(i2).getInputPeer(sendMonoForumPeerId);
                            tL_messages_requestWebView.reply_to.flags |= 32;
                        }
                        tL_messages_requestWebView.flags |= 1;
                    } else if (sendMonoForumPeerId != 0) {
                        TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum2 = new TLRPC.TL_inputReplyToMonoForum();
                        tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum2;
                        tL_inputReplyToMonoForum2.monoforum_peer_id = MessagesController.getInstance(i2).getInputPeer(sendMonoForumPeerId);
                        tL_messages_requestWebView.flags |= 1;
                    }
                    jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(chatAttachAlertBotWebViewLayout5.resourcesProvider, false);
                    if (jSONObjectMakeThemeParams != null) {
                        TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                        tL_messages_requestWebView.theme_params = tL_dataJSON2;
                        tL_dataJSON2.data = jSONObjectMakeThemeParams.toString();
                        tL_messages_requestWebView.flags |= 4;
                    }
                    ConnectionsManager.getInstance(i2).sendRequest(tL_messages_requestWebView, new LaunchActivity$$ExternalSyntheticLambda63(chatAttachAlertBotWebViewLayout5, i2, 9));
                    NotificationCenter.getInstance(i2).addObserver(chatAttachAlertBotWebViewLayout5, NotificationCenter.webViewResultSent);
                }
            }
        }
        if (longSparseArray.get(j) != null) {
            ((ChatAttachAlertBotWebViewLayout) longSparseArray.get(j)).swipeContainer.setSwipeOffsetAnimationDisallowed(true);
            showLayout((AttachAlertLayout) longSparseArray.get(j), -j, z2);
            if (z) {
                ChatAttachAlertBotWebViewLayout chatAttachAlertBotWebViewLayout6 = (ChatAttachAlertBotWebViewLayout) longSparseArray.get(j);
                TLRPC.User user3 = MessagesController.getInstance(chatAttachAlertBotWebViewLayout6.currentAccount).getUser(Long.valueOf(chatAttachAlertBotWebViewLayout6.botId));
                ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(chatAttachAlertBotWebViewLayout6.currentAccount).getAttachMenuBots().bots;
                int size = arrayList.size();
                int i3 = 0;
                do {
                    if (i3 >= size) {
                        tL_attachMenuBot = null;
                        break;
                    } else {
                        TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i3);
                        i3++;
                        tL_attachMenuBot = tL_attachMenuBot2;
                    }
                } while (tL_attachMenuBot.bot_id != chatAttachAlertBotWebViewLayout6.botId);
                if (tL_attachMenuBot == null) {
                    return;
                }
                boolean z3 = tL_attachMenuBot.show_in_side_menu;
                if (z3 && tL_attachMenuBot.show_in_attach_menu) {
                    string = LocaleController.formatString("BotAttachMenuShortcatAddedAttachAndSide", R.string.BotAttachMenuShortcatAddedAttachAndSide, user3.first_name);
                } else {
                    string = z3 ? LocaleController.formatString("BotAttachMenuShortcatAddedSide", R.string.BotAttachMenuShortcatAddedSide, user3.first_name) : LocaleController.formatString("BotAttachMenuShortcatAddedAttach", R.string.BotAttachMenuShortcatAddedAttach, user3.first_name);
                }
                AndroidUtilities.runOnUIThread(new RichTableCell$$ExternalSyntheticLambda3(7, chatAttachAlertBotWebViewLayout6, string), 200L);
            }
        }
    }

    public final void showCaptionLimitBulletin(BaseFragment baseFragment) {
        if ((baseFragment instanceof ChatActivity) && ChatObject.isChannelAndNotMegaGroup(((ChatActivity) baseFragment).currentChat)) {
            new BulletinFactory(this.sizeNotifierFrameLayout, this.resourcesProvider).createCaptionLimitBulletin(MessagesController.getInstance(this.currentAccount).captionLengthLimitPremium, new ChatLinkActivity$$ExternalSyntheticLambda9(26, this, baseFragment)).show();
        }
    }

    public final boolean showCommentTextView(boolean z, boolean z2) {
        int iMax;
        AttachAlertLayout attachAlertLayout;
        int i;
        this.animatorCaptionVisible.setValue(z, true);
        AnonymousClass17 anonymousClass17 = this.frameLayout2;
        if (z == (anonymousClass17.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.commentsAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        anonymousClass17.setTag(z ? 1 : null);
        AnonymousClass19 anonymousClass19 = this.commentTextView;
        if (anonymousClass19.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(anonymousClass19.getEditText());
        }
        anonymousClass19.hidePopup(true);
        hidePopup(true);
        AnonymousClass14 anonymousClass14 = this.buttonsRecyclerViewWrapper;
        ChatActivity.AnonymousClass60 anonymousClass60 = this.writeButtonContainer;
        if (z) {
            if (!this.isSoundPicker) {
                anonymousClass17.setVisibility(0);
            }
            anonymousClass60.setVisibility(0);
        } else if (this.typeButtonsAvailable) {
            anonymousClass14.setVisibility(0);
        }
        AttachAlertLayout attachAlertLayout2 = this.currentAttachLayout;
        boolean z3 = (attachAlertLayout2 == this.photoLayout || attachAlertLayout2 == this.photoPreviewLayout) && this.captionAbove;
        AnonymousClass7 anonymousClass7 = this.actionBar;
        IntroActivity.AnonymousClass1 anonymousClass1 = this.topCommentContainer;
        AnonymousClass18 anonymousClass18 = this.captionContainer;
        AnonymousClass24 anonymousClass24 = this.writeButton;
        if (z2) {
            this.commentsAnimator = new AnimatorSet();
            if (z3) {
                anonymousClass1.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass17, (Property<AnonymousClass17, Float>) property, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass18, (Property<AnonymousClass18, Float>) property, (!z || z3) ? 0.0f : 1.0f));
            if (z && !z3) {
                anonymousClass18.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass18, (Property<AnonymousClass18, Float>) View.TRANSLATION_Y, 0.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass1, (Property<IntroActivity.AnonymousClass1, Float>) property, (z && z3) ? 1.0f : 0.0f));
            Property property2 = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass60, (Property<ChatActivity.AnonymousClass60, Float>) property2, z ? 1.0f : 0.2f));
            Property property3 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass60, (Property<ChatActivity.AnonymousClass60, Float>) property3, z ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass60, (Property<ChatActivity.AnonymousClass60, Float>) property, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass24, (Property<AnonymousClass24, Float>) property2, z ? 1.0f : 0.2f));
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass24, (Property<AnonymousClass24, Float>) property3, z ? 1.0f : 0.2f));
            if (anonymousClass7.getTag() != null) {
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass17, (Property<AnonymousClass17, Float>) View.TRANSLATION_Y, z ? 0.0f : AndroidUtilities.dp(48.0f)));
            } else {
                if (this.typeButtonsAvailable) {
                    i = 0;
                    arrayList.add(ObjectAnimator.ofFloat(anonymousClass14, (Property<AnonymousClass14, Float>) View.TRANSLATION_Y, z ? AndroidUtilities.dp(36.0f) : 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(anonymousClass14, (Property<AnonymousClass14, Float>) property, z ? 0.0f : 1.0f));
                }
                if (z3) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new ChatAttachAlert$$ExternalSyntheticLambda8(this, i));
                    arrayList.add(valueAnimatorOfFloat);
                }
                this.commentsAnimator.playTogether(arrayList);
                this.commentsAnimator.setInterpolator(new DecelerateInterpolator());
                this.commentsAnimator.setDuration(180L);
                this.commentsAnimator.addListener(new LoginActivity.AnonymousClass8(this, z, z3, 4));
                this.commentsAnimator.start();
                iMax = 0;
            }
            i = 0;
            if (z3) {
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat2.addUpdateListener(new ChatAttachAlert$$ExternalSyntheticLambda8(this, i));
                arrayList.add(valueAnimatorOfFloat2);
            }
            this.commentsAnimator.playTogether(arrayList);
            this.commentsAnimator.setInterpolator(new DecelerateInterpolator());
            this.commentsAnimator.setDuration(180L);
            this.commentsAnimator.addListener(new LoginActivity.AnonymousClass8(this, z, z3, 4));
            this.commentsAnimator.start();
            iMax = 0;
        } else {
            anonymousClass17.setAlpha(z ? 1.0f : 0.0f);
            anonymousClass18.setAlpha((z && z3) ? 1.0f : 0.0f);
            if (!z || z3) {
                iMax = 0;
            } else {
                iMax = 0;
                anonymousClass18.setVisibility(0);
                anonymousClass18.setTranslationY(0.0f);
            }
            anonymousClass60.setScaleX(z ? 1.0f : 0.2f);
            anonymousClass60.setScaleY(z ? 1.0f : 0.2f);
            anonymousClass60.setAlpha(z ? 1.0f : 0.0f);
            anonymousClass1.setVisibility((z && z3) ? 0 : 8);
            anonymousClass1.setAlpha((z && z3) ? 1.0f : 0.0f);
            anonymousClass24.setScaleX(z ? 1.0f : 0.2f);
            anonymousClass24.setScaleY(z ? 1.0f : 0.2f);
            if (anonymousClass7.getTag() != null) {
                anonymousClass17.setTranslationY(z ? 0.0f : AndroidUtilities.dp(48.0f));
            } else if (this.typeButtonsAvailable && ((attachAlertLayout = this.currentAttachLayout) == null || attachAlertLayout.shouldHideBottomButtons())) {
                anonymousClass14.setTranslationY(z ? AndroidUtilities.dp(84.0f) : 0.0f);
            }
            if (!z) {
                anonymousClass17.setVisibility(4);
                anonymousClass60.setVisibility(4);
            }
            if (z3) {
                updatedTopCaptionHeight();
            }
        }
        if (z) {
            iMax = Math.max(1, this.currentAttachLayout.getSelectedItemsCount());
        }
        anonymousClass24.setCount(iMax, z2);
        anonymousClass24.setStarsPrice(getAdditionalMessagesCount() + this.currentAttachLayout.getSelectedItemsCount(), this.editingMessageObject != null ? 0L : MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(getDialogId()), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) anonymousClass19.getLayoutParams();
        int iDp = AndroidUtilities.dp(48.0f);
        anonymousClass24.getMeasuredHeight();
        int iMax2 = Math.max(iDp, anonymousClass24.width$1());
        if (marginLayoutParams.rightMargin != iMax2) {
            marginLayoutParams.rightMargin = iMax2;
            anonymousClass19.setLayoutParams(marginLayoutParams);
        }
        return true;
    }

    public final void showLayout(AttachAlertLayout attachAlertLayout) {
        long j = this.selectedId;
        ChatAttachRestrictedLayout chatAttachRestrictedLayout = this.restrictedLayout;
        if (attachAlertLayout == chatAttachRestrictedLayout) {
            j = chatAttachRestrictedLayout.id;
        } else if (attachAlertLayout == this.photoLayout) {
            j = 1;
        } else if (attachAlertLayout == this.audioLayout) {
            j = 3;
        } else if (attachAlertLayout == this.documentLayout) {
            j = 4;
        } else if (attachAlertLayout == this.contactsLayout) {
            j = 5;
        } else if (attachAlertLayout == this.locationLayout) {
            j = 6;
        } else if (attachAlertLayout == this.pollLayout) {
            j = 9;
        } else if (attachAlertLayout == this.colorsLayout) {
            j = 10;
        } else if (attachAlertLayout == this.quickRepliesLayout) {
            j = 11;
        } else if (attachAlertLayout == this.todoLayout) {
            j = 12;
        } else if (attachAlertLayout == this.emojiLayout) {
            j = 14;
        } else if (attachAlertLayout == this.stickersLayout) {
            j = 13;
        } else if (attachAlertLayout == this.richLayout) {
            j = 16;
        }
        showLayout(attachAlertLayout, j, true);
    }

    public final void showPollLayout(boolean z, Boolean bool) {
        ChatAttachAlert chatAttachAlert;
        if (this.pollLayout == null) {
            chatAttachAlert = this;
            ChatAttachAlertPollLayout chatAttachAlertPollLayout = new ChatAttachAlertPollLayout(chatAttachAlert, getContext(), false, this.resourcesProvider, bool);
            chatAttachAlert.pollLayout = chatAttachAlertPollLayout;
            chatAttachAlert.layouts[1] = chatAttachAlertPollLayout;
            chatAttachAlertPollLayout.setDelegate(new ChatAttachAlert$$ExternalSyntheticLambda1(this, 15));
        } else {
            chatAttachAlert = this;
        }
        showLayout(chatAttachAlert.pollLayout, 9L, z);
    }

    public final void updateActionBarVisibility(boolean z, boolean z2) {
        AttachAlertLayout attachAlertLayout;
        this.animatorActionBarVisible.setValue(z, z2);
        AnonymousClass7 anonymousClass7 = this.actionBar;
        if (!(z && anonymousClass7.getTag() == null) && (z || anonymousClass7.getTag() == null)) {
            return;
        }
        anonymousClass7.setTag(z ? 1 : null);
        AnimatorSet animatorSet = this.actionBarAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.actionBarAnimation = null;
        }
        boolean z3 = (this.isPhotoPicker || this.storyMediaPicker || (this.avatarPicker == 0 && this.menuShowed) || this.currentAttachLayout != this.photoLayout || (!this.photosEnabled && !this.videosEnabled)) ? false : true;
        if (this.currentAttachLayout == this.restrictedLayout) {
            z3 = false;
        }
        ActionBarMenuItem actionBarMenuItem = this.selectedMenuItem;
        AnonymousClass14 anonymousClass14 = this.buttonsRecyclerViewWrapper;
        if (z) {
            if (z3) {
                actionBarMenuItem.setVisibility(0);
                actionBarMenuItem.setClickable(true);
            }
        } else if (this.typeButtonsAvailable && this.frameLayout2.getTag() == null) {
            anonymousClass14.setVisibility(0);
        }
        BaseFragment baseFragment = this.baseFragment;
        if (baseFragment != null) {
            if (z) {
                AndroidUtilities.setLightStatusBar(this, ColorUtils.calculateLuminance(getThemedColor(this.forceDarkTheme ? Theme.key_voipgroup_listViewBackground : Theme.key_dialogBackground)) > 0.699999988079071d);
            } else {
                AndroidUtilities.setLightStatusBar(this, baseFragment.isLightStatusBar());
            }
        }
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.actionBarAnimation = animatorSet2;
            animatorSet2.setDuration((long) (Math.abs((z ? 1.0f : 0.0f) - anonymousClass7.getAlpha()) * 180.0f));
            ArrayList arrayList = new ArrayList();
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass7, (Property<AnonymousClass7, Float>) property, z ? 1.0f : 0.0f));
            if (z3) {
                arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem, (Property<ActionBarMenuItem, Float>) property, z ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem, (Property<ActionBarMenuItem, Float>) View.SCALE_X, z ? 1.0f : 0.6f));
                arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem, (Property<ActionBarMenuItem, Float>) View.SCALE_Y, z ? 1.0f : 0.6f));
            }
            this.actionBarAnimation.playTogether(arrayList);
            this.actionBarAnimation.addListener(new ChatActivity.AnonymousClass77(15, this, z));
            this.actionBarAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.actionBarAnimation.setDuration(380L);
            this.actionBarAnimation.start();
            return;
        }
        if (z && this.typeButtonsAvailable && ((attachAlertLayout = this.currentAttachLayout) == null || attachAlertLayout.shouldHideBottomButtons())) {
            anonymousClass14.setVisibility(4);
        }
        anonymousClass7.setAlpha(z ? 1.0f : 0.0f);
        if (z3) {
            actionBarMenuItem.setAlpha(z ? 1.0f : 0.0f);
            actionBarMenuItem.setScaleX(z ? 1.0f : 0.6f);
            actionBarMenuItem.setScaleY(z ? 1.0f : 0.6f);
        }
        if (z) {
            return;
        }
        ActionBarMenuItem actionBarMenuItem2 = this.searchItem;
        if (actionBarMenuItem2 != null) {
            actionBarMenuItem2.setVisibility(4);
        }
        if (this.avatarPicker == 0 && this.menuShowed) {
            return;
        }
        actionBarMenuItem.setVisibility(4);
    }

    public final void updateCommentTextViewPosition() {
        float alpha;
        int[] iArr = this.commentTextViewLocation;
        AnonymousClass19 anonymousClass19 = this.commentTextView;
        anonymousClass19.getLocationOnScreen(iArr);
        if (this.mentionContainer != null) {
            AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
            if ((attachAlertLayout == chatAttachAlertPhotoLayout || attachAlertLayout == this.photoPreviewLayout) && this.captionAbove) {
                IntroActivity.AnonymousClass1 anonymousClass1 = this.topCommentContainer;
                alpha = (anonymousClass1.getAlpha() * anonymousClass1.getMeasuredHeight()) + (anonymousClass1.getY() - this.mentionContainer.getTop());
            } else {
                alpha = -anonymousClass19.getHeight();
            }
            if (Math.abs(this.mentionContainer.getTranslationY() - alpha) > 0.5f) {
                this.mentionContainer.setTranslationY(alpha);
                this.mentionContainer.invalidate();
                if (chatAttachAlertPhotoLayout != null) {
                    chatAttachAlertPhotoLayout.checkCameraViewPosition();
                }
            }
        }
        checkUi_writeButtonContainerY();
    }

    public final void updateCountButton(int i) {
        BaseFragment baseFragment;
        boolean z;
        boolean z2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        if (this.viewChangeAnimator != null) {
            return;
        }
        int selectedItemsCount = this.currentAttachLayout.getSelectedItemsCount();
        AnonymousClass24 anonymousClass24 = this.writeButton;
        if (selectedItemsCount == 0) {
            anonymousClass24.setCount(0, i != 0);
            showCommentTextView(false, i != 0);
        } else {
            if (showCommentTextView(true, i != 0) || i == 0) {
                anonymousClass24.setCount(selectedItemsCount, i != 0);
                anonymousClass24.bounceCount();
            } else {
                anonymousClass24.setCount(selectedItemsCount, true);
                anonymousClass24.bounceCount();
            }
        }
        this.currentAttachLayout.onSelectedItemsCountChanged(selectedItemsCount);
        checkIsEphemeralMessage$1(i != 0);
        if (this.currentAttachLayout == this.photoLayout && ((((z = (baseFragment = this.baseFragment) instanceof ChatActivity)) || this.avatarPicker != 0 || this.storyMediaPicker) && ((selectedItemsCount == 0 && this.menuShowed) || ((selectedItemsCount != 0 || this.avatarPicker != 0 || this.storyMediaPicker) && !this.menuShowed)))) {
            this.menuShowed = (selectedItemsCount == 0 && this.avatarPicker == 0 && !this.storyMediaPicker) ? false : true;
            AnimatorSet animatorSet = this.menuAnimator;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.menuAnimator = null;
            }
            int i2 = this.avatarPicker;
            ActionBarMenuItem actionBarMenuItem = this.searchItem;
            AnonymousClass7 anonymousClass7 = this.actionBar;
            if (i2 == 0 || actionBarMenuItem == null || anonymousClass7.getTag() == null || !z) {
                z2 = false;
            } else {
                ChatActivity chatActivity = (ChatActivity) baseFragment;
                if (ChatObject.isChannel(chatActivity.currentChat) && (tL_chatBannedRights = chatActivity.currentChat.banned_rights) != null && tL_chatBannedRights.send_gifs) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            boolean z3 = this.menuShowed;
            ActionBarMenuItem actionBarMenuItem2 = this.selectedMenuItem;
            AnonymousClass12 anonymousClass12 = this.headerView;
            if (z3) {
                if (this.avatarPicker == 0 && !this.storyMediaPicker) {
                    actionBarMenuItem2.setVisibility(0);
                    actionBarMenuItem2.setClickable(true);
                }
                anonymousClass12.setVisibility(0);
            } else if (anonymousClass7.getTag() != null && actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(0);
            }
            if (i == 0) {
                if (anonymousClass7.getTag() == null && this.avatarPicker == 0 && !this.storyMediaPicker) {
                    actionBarMenuItem2.setAlpha(this.menuShowed ? 1.0f : 0.0f);
                    actionBarMenuItem2.setScaleX(this.menuShowed ? 1.0f : 0.6f);
                    actionBarMenuItem2.setScaleY(this.menuShowed ? 1.0f : 0.6f);
                }
                anonymousClass12.setAlpha(this.menuShowed ? 1.0f : 0.0f);
                if (z2) {
                    actionBarMenuItem.setAlpha(this.menuShowed ? 0.0f : 1.0f);
                }
                if (this.menuShowed && actionBarMenuItem != null) {
                    actionBarMenuItem.setVisibility(4);
                }
            } else {
                this.menuAnimator = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                if (anonymousClass7.getTag() == null && this.avatarPicker == 0 && !this.storyMediaPicker) {
                    arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem2, (Property<ActionBarMenuItem, Float>) View.ALPHA, this.menuShowed ? 1.0f : 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem2, (Property<ActionBarMenuItem, Float>) View.SCALE_X, this.menuShowed ? 1.0f : 0.6f));
                    arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem2, (Property<ActionBarMenuItem, Float>) View.SCALE_Y, this.menuShowed ? 1.0f : 0.6f));
                }
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass12, (Property<AnonymousClass12, Float>) property, this.menuShowed ? 1.0f : 0.0f));
                if (z2) {
                    arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem, (Property<ActionBarMenuItem, Float>) property, this.menuShowed ? 0.0f : 1.0f));
                }
                this.menuAnimator.playTogether(arrayList);
                this.menuAnimator.addListener(new CheckBox.AnonymousClass1(this, 15));
                this.menuAnimator.setDuration(180L);
                this.menuAnimator.start();
            }
        }
        updateMotionItem(i != 0);
        MessageObject messageObject = this.editingMessageObject;
        long sendPaidMessagesStars = (messageObject == null || messageObject.needResendWhenEdit()) ? MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(getDialogId()) : 0L;
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        anonymousClass24.setStarsPrice(getAdditionalMessagesCount() + (attachAlertLayout != null ? attachAlertLayout.getSelectedItemsCount() : 0), sendPaidMessagesStars, true);
        AnonymousClass19 anonymousClass19 = this.commentTextView;
        if (anonymousClass19 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) anonymousClass19.getLayoutParams();
            int iDp = AndroidUtilities.dp(48.0f);
            anonymousClass24.getMeasuredHeight();
            int iMax = Math.max(iDp, anonymousClass24.width$1());
            if (marginLayoutParams.rightMargin != iMax) {
                marginLayoutParams.rightMargin = iMax;
                anonymousClass19.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public final void updateDoneItemEnabled() {
        float fM;
        AttachAlertLayout attachAlertLayout = this.currentAttachLayout;
        boolean zIsDoneItemEnabled = attachAlertLayout == null ? false : attachAlertLayout.isDoneItemEnabled();
        IntroActivity.AnonymousClass4 anonymousClass4 = this.doneItem;
        anonymousClass4.setEnabled(zIsDoneItemEnabled);
        AttachAlertLayout attachAlertLayout2 = this.currentAttachLayout;
        if (attachAlertLayout2 != null) {
            fM = ((attachAlertLayout2.isDoneItemEnabled() ? 1.0f : 0.5f) * (this.nextAttachLayout == null ? 1.0f : this.translationProgress)) + 0.0f;
        } else {
            fM = 0.0f;
        }
        AttachAlertLayout attachAlertLayout3 = this.nextAttachLayout;
        if (attachAlertLayout3 != null) {
            fM = DiffUtil.m(1.0f, this.translationProgress, attachAlertLayout3.isDoneItemEnabled() ? 1.0f : 0.5f, fM);
        }
        this.doneItemAlphaByEnabled = fM;
        float f = fM * this.doneItemAlphaByLayout;
        anonymousClass4.setAlpha(f);
        anonymousClass4.setVisibility(f <= 0.0f ? 4 : 0);
    }

    public final void updateLayout(AttachAlertLayout attachAlertLayout, boolean z, int i) {
        if (attachAlertLayout == null) {
            return;
        }
        DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor = this.scrollableViewNoiseSuppressor;
        if (downscaleScrollableNoiseSuppressor != null && Build.VERSION.SDK_INT >= 31) {
            downscaleScrollableNoiseSuppressor.onScrolled(0.0f, i);
            blur3_InvalidateBlur$1();
        }
        int currentItemTop = attachAlertLayout.getCurrentItemTop();
        if (currentItemTop == Integer.MAX_VALUE) {
            return;
        }
        boolean z2 = false;
        boolean z3 = attachAlertLayout == this.currentAttachLayout && currentItemTop <= attachAlertLayout.getButtonsHideOffset();
        this.pinnedToTop = z3;
        AttachAlertLayout attachAlertLayout2 = this.currentAttachLayout;
        if (attachAlertLayout2 != this.photoPreviewLayout && this.keyboardVisible && z) {
            boolean z4 = attachAlertLayout2 instanceof ChatAttachAlertBotWebViewLayout;
        }
        if (attachAlertLayout == attachAlertLayout2) {
            updateActionBarVisibility(z3, true);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) attachAlertLayout.getLayoutParams();
        int iM = zzlb.m(layoutParams == null ? 0 : layoutParams.topMargin, 11.0f, currentItemTop);
        AttachAlertLayout attachAlertLayout3 = this.currentAttachLayout;
        int i2 = attachAlertLayout3 == attachAlertLayout ? 0 : 1;
        if ((attachAlertLayout3 instanceof ChatAttachAlertPhotoLayoutPreview) || (this.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview)) {
            Object obj = this.viewChangeAnimator;
            if ((obj instanceof SpringAnimation) && ((SpringAnimation) obj).mRunning) {
                z2 = true;
            }
        }
        int[] iArr = this.scrollOffsetY;
        int i3 = iArr[i2];
        if (i3 == iM && !z2) {
            if (i != 0) {
                this.previousScrollOffsetY = i3;
            }
        } else {
            this.previousScrollOffsetY = i3;
            iArr[i2] = iM;
            updateSelectedPosition(i2);
            this.containerView.invalidate();
        }
    }

    public final void updateMotionItem(boolean z) {
        MotionPhotoDrawable motionPhotoDrawable;
        boolean z2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout == null || (motionPhotoDrawable = this.motionIcon) == null) {
            return;
        }
        if (!this.menuShowed || !this.allowLivePhotos || this.currentAttachLayout != chatAttachAlertPhotoLayout) {
            z2 = false;
            break;
        }
        HashMap map = ChatAttachAlertPhotoLayout.selectedPhotos;
        if (!map.isEmpty()) {
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if ((entry.getValue() instanceof MediaController.PhotoEntry) && ((MediaController.PhotoEntry) entry.getValue()).isLivePhoto()) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        boolean z3 = !ChatAttachAlertPhotoLayout.areLivePhotosEnabled();
        motionPhotoDrawable.disabled = z3;
        if (!z) {
            ((AnimatedFloat) motionPhotoDrawable.animatedDisabled).force(z3);
        }
        motionPhotoDrawable.invalidateSelf();
        ActionBarMenuItem actionBarMenuItem = this.motionItem;
        if (z && this.menuShowed) {
            actionBarMenuItem.setVisibility(0);
            actionBarMenuItem.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new ChatAttachAlert$$ExternalSyntheticLambda6(this, z2, 0)).start();
        } else {
            actionBarMenuItem.setVisibility(z2 ? 0 : 8);
            actionBarMenuItem.setAlpha(z2 ? 1.0f : 0.0f);
            actionBarMenuItem.setScaleX(z2 ? 1.0f : 0.6f);
            actionBarMenuItem.setScaleY(z2 ? 1.0f : 0.6f);
        }
    }

    public final void updatePhotoPreview(boolean z) {
        AttachAlertLayout attachAlertLayout = this.photoLayout;
        if (!z) {
            showLayout(attachAlertLayout);
            return;
        }
        if (this.canOpenPreview) {
            if (this.photoPreviewLayout == null) {
                Context context = getContext();
                Theme.ResourcesProvider resourcesProvider = this.parentThemeDelegate;
                if (resourcesProvider == null) {
                    resourcesProvider = this.resourcesProvider;
                }
                ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = new ChatAttachAlertPhotoLayoutPreview(context, resourcesProvider, this);
                this.photoPreviewLayout = chatAttachAlertPhotoLayoutPreview;
                chatAttachAlertPhotoLayoutPreview.bringToFront();
            }
            AttachAlertLayout attachAlertLayout2 = this.currentAttachLayout;
            ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview2 = this.photoPreviewLayout;
            if (attachAlertLayout2 != chatAttachAlertPhotoLayoutPreview2) {
                attachAlertLayout = chatAttachAlertPhotoLayoutPreview2;
            }
            showLayout(attachAlertLayout);
        }
    }

    public final void updateSelectedPosition(int i) {
        int i2;
        float translationY;
        float f;
        float translationY2;
        float translationY3;
        float fMax;
        int i3;
        float f2 = this.animatorActionBarVisible.floatValue;
        AttachAlertLayout attachAlertLayout = i == 0 ? this.currentAttachLayout : this.nextAttachLayout;
        if (attachAlertLayout == null || attachAlertLayout.getVisibility() != 0) {
            return;
        }
        int scrollOffsetY = getScrollOffsetY(i);
        if (attachAlertLayout == this.pollLayout || attachAlertLayout == this.todoLayout) {
            AndroidUtilities.dp(13.0f);
            AndroidUtilities.dp(11.0f);
        } else {
            AndroidUtilities.dp(39.0f);
            AndroidUtilities.dp(43.0f);
        }
        ActionBar.getCurrentActionBarHeight();
        float f3 = 1.0f;
        float f4 = 1.0f - f2;
        if (AndroidUtilities.isTablet()) {
            i2 = 16;
        } else {
            Point point = AndroidUtilities.displaySize;
            i2 = point.x > point.y ? 6 : 12;
        }
        float alpha = this.actionBar.getAlpha();
        AnonymousClass12 anonymousClass12 = this.headerView;
        float fDp = alpha != 0.0f ? 0.0f : AndroidUtilities.dp((1.0f - anonymousClass12.getAlpha()) * 26.0f);
        boolean z = this.menuShowed;
        ActionBarMenuItem actionBarMenuItem = this.selectedMenuItem;
        IntroActivity.AnonymousClass1 anonymousClass1 = this.topCommentContainer;
        if (z && this.avatarPicker == 0 && !this.storyMediaPicker) {
            actionBarMenuItem.setTranslationY(Math.max((ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i2 + 37), ((scrollOffsetY - AndroidUtilities.dp((i2 * f2) + 37.0f)) + fDp) - (anonymousClass1.getAlpha() * anonymousClass1.getMeasuredHeight())) + this.currentPanTranslationY);
        } else {
            actionBarMenuItem.setTranslationY(((ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(3.0f)) - AndroidUtilities.dp(i2 + 37)) + this.currentPanTranslationY);
        }
        ActionBarMenuItem actionBarMenuItem2 = this.motionItem;
        if (actionBarMenuItem2 != null) {
            actionBarMenuItem2.setTranslationY(actionBarMenuItem.getTranslationY());
        }
        HintView2 hintView2 = this.motionHint;
        if (hintView2 != null) {
            hintView2.setTranslationY(actionBarMenuItem.getTranslationY());
        }
        if (this.isPhotoPicker && this.openTransitionFinished) {
            AttachAlertLayout attachAlertLayout2 = this.nextAttachLayout;
            if (attachAlertLayout2 != null && this.currentAttachLayout != null) {
                translationY = Math.min(attachAlertLayout2.getTranslationY(), this.currentAttachLayout.getTranslationY());
            } else if (attachAlertLayout2 != null) {
                translationY = attachAlertLayout2.getTranslationY();
            } else {
                translationY = 0.0f;
            }
        } else {
            translationY = 0.0f;
        }
        ActionBarMenuItem actionBarMenuItem3 = this.searchItem;
        if (actionBarMenuItem3 != null) {
            actionBarMenuItem3.setTranslationY(((ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(i2 + 37)) + this.currentPanTranslationY);
        }
        float fDp2 = ((((scrollOffsetY - AndroidUtilities.dp((i2 * f2) + 25.0f)) + fDp) + this.currentPanTranslationY) + translationY) - (anonymousClass1.getAlpha() * anonymousClass1.getMeasuredHeight());
        this.baseSelectedTextViewTranslationY = fDp2;
        anonymousClass12.setTranslationY(Math.max(this.currentPanTranslationY, fDp2));
        anonymousClass1.setTranslationY(Math.max(ActionBar.getCurrentActionBarHeight() + this.currentPanTranslationY, (anonymousClass12.getAlpha() * AndroidUtilities.dp(26.0f)) + this.baseSelectedTextViewTranslationY + AndroidUtilities.dp(8.0f)));
        if (this.captionAbove) {
            updateCommentTextViewPosition();
        }
        checkUi_writeButtonContainerY();
        int i4 = 59;
        if (this.pollLayout == null) {
            f = 0.0f;
            translationY2 = 0.0f;
        } else {
            if (AndroidUtilities.isTablet()) {
                i3 = 63;
            } else {
                Point point2 = AndroidUtilities.displaySize;
                i3 = point2.x > point2.y ? 53 : 59;
            }
            ChatAttachAlertPollLayout chatAttachAlertPollLayout = this.pollLayout;
            if (chatAttachAlertPollLayout == this.nextAttachLayout) {
                translationY2 = (chatAttachAlertPollLayout.getTranslationY() + getScrollOffsetY(1)) - AndroidUtilities.dp(((i3 * f2) + 7.0f) - (f4 * 12.0f));
                f = this.translationProgress;
            } else if (chatAttachAlertPollLayout == this.currentAttachLayout) {
                translationY2 = (chatAttachAlertPollLayout.getTranslationY() + getScrollOffsetY(0)) - AndroidUtilities.dp(((i3 * f2) + 7.0f) - (f4 * 12.0f));
                f = this.nextAttachLayout == null ? 1.0f : 1.0f - this.translationProgress;
            } else {
                f = 0.0f;
                translationY2 = 0.0f;
            }
        }
        if (this.todoLayout == null) {
            translationY3 = 0.0f;
            f3 = 0.0f;
        } else {
            if (AndroidUtilities.isTablet()) {
                i4 = 63;
            } else {
                Point point3 = AndroidUtilities.displaySize;
                if (point3.x > point3.y) {
                    i4 = 53;
                }
            }
            ChatAttachAlertPollLayout chatAttachAlertPollLayout2 = this.todoLayout;
            if (chatAttachAlertPollLayout2 == this.nextAttachLayout) {
                float translationY4 = (chatAttachAlertPollLayout2.getTranslationY() + getScrollOffsetY(1)) - AndroidUtilities.dp(((i4 * f2) + 7.0f) - (f4 * 12.0f));
                f3 = this.translationProgress;
                translationY3 = translationY4;
            } else if (chatAttachAlertPollLayout2 == this.currentAttachLayout) {
                translationY3 = (chatAttachAlertPollLayout2.getTranslationY() + getScrollOffsetY(0)) - AndroidUtilities.dp(((i4 * f2) + 7.0f) - (f4 * 12.0f));
                if (this.nextAttachLayout != null) {
                    f3 = 1.0f - this.translationProgress;
                }
            } else {
                translationY3 = 0.0f;
                f3 = 0.0f;
            }
        }
        IntroActivity.AnonymousClass4 anonymousClass4 = this.doneItem;
        if (anonymousClass4 != null) {
            int measuredWidth = LocaleController.isRTL ? (this.containerView.getMeasuredWidth() - anonymousClass4.getMeasuredWidth()) - AndroidUtilities.dp(62.0f) : 0;
            if (f <= 0.0f || f3 <= 0.0f) {
                if (f <= 0.0f) {
                    translationY2 = 0.0f;
                }
                if (f3 <= 0.0f) {
                    translationY3 = 0.0f;
                }
                fMax = Math.max(translationY2, translationY3);
            } else {
                fMax = AndroidUtilities.lerp(translationY2, translationY3, f3);
            }
            anonymousClass4.setTranslationY(Math.max(0.0f, fMax) + this.currentPanTranslationY);
            anonymousClass4.setTranslationX(-((measuredWidth * f4) + AndroidUtilities.dp((7.0f * f4) + 12.0f)));
        }
        float fMax2 = Math.max(f3, f);
        this.doneItemAlphaByLayout = fMax2;
        if (anonymousClass4 != null) {
            float f5 = this.doneItemAlphaByEnabled * fMax2;
            anonymousClass4.setAlpha(f5);
            anonymousClass4.setVisibility(f5 <= 0.0f ? 4 : 0);
        }
    }

    public final void updatedTopCaptionHeight() {
        int alpha = 0;
        updateSelectedPosition(0);
        this.sizeNotifierFrameLayout.invalidate();
        IntroActivity.AnonymousClass1 anonymousClass1 = this.topCommentContainer;
        anonymousClass1.invalidate();
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.checkCameraViewPosition();
            ChatAttachAlertPhotoLayout.AnonymousClass3 anonymousClass3 = chatAttachAlertPhotoLayout.gridView;
            if (anonymousClass3 != null && anonymousClass3.getFastScroll() != null) {
                RecyclerListView.FastScroll fastScroll = chatAttachAlertPhotoLayout.gridView.getFastScroll();
                int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.listAdditionalH;
                if (this.captionAbove) {
                    alpha = (int) (anonymousClass1.getAlpha() * anonymousClass1.getMeasuredHeight());
                }
                fastScroll.topOffset = currentActionBarHeight + alpha;
                chatAttachAlertPhotoLayout.gridView.getFastScroll().invalidate();
            }
        }
        updateCommentTextViewPosition();
        checkUi_writeButtonContainerY();
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        if (this.currentAttachLayout.onDismiss() || isDismissed()) {
            return;
        }
        AnonymousClass19 anonymousClass19 = this.commentTextView;
        if (anonymousClass19 != null) {
            AndroidUtilities.hideKeyboard(anonymousClass19.getEditText());
        }
        AnonymousClass21 anonymousClass21 = this.topCommentTextView;
        if (anonymousClass21 != null) {
            AndroidUtilities.hideKeyboard(anonymousClass21.getEditText());
        }
        this.botAttachLayouts.clear();
        BaseFragment lastFragment = this.baseFragment;
        if (lastFragment == null) {
            lastFragment = LaunchActivity.getLastFragment();
        }
        if (!this.allowPassConfirmationAlert && lastFragment != null && this.currentAttachLayout.getSelectedItemsCount() > 0 && !this.isPhotoPicker) {
            if (this.confirmationAlertShown) {
                return;
            }
            this.confirmationAlertShown = true;
            AlertDialog.Builder builder = new AlertDialog.Builder(lastFragment.getParentActivity(), 0, this.resourcesProvider);
            String string = LocaleController.getString(R.string.DiscardSelectionAlertTitle);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString(R.string.DiscardSelectionAlertMessage);
            builder.setPositiveButton(LocaleController.getString(R.string.Discard), new ChatAttachAlert$$ExternalSyntheticLambda1(this, 3));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            alertDialog.setOnCancelListener(new LinkManager$$ExternalSyntheticLambda17(this, 4));
            alertDialog.onDismissListener = new OAuthSheet$$ExternalSyntheticLambda11(this, 13);
            alertDialog.show();
            TextView textView = (TextView) alertDialog.getButton(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(Theme.key_text_RedBold));
                return;
            }
            return;
        }
        int i = 0;
        while (true) {
            AttachAlertLayout[] attachAlertLayoutArr = this.layouts;
            if (i >= attachAlertLayoutArr.length) {
                break;
            }
            AttachAlertLayout attachAlertLayout = attachAlertLayoutArr[i];
            if (attachAlertLayout != null && this.currentAttachLayout != attachAlertLayout) {
                attachAlertLayout.onDismiss();
            }
            i++;
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, ColorUtils.setAlphaComponent(getThemedColor(Theme.key_windowBackgroundGray), 0), true, (AndroidUtilities.IntColorCallback) new ChatAttachAlert$$ExternalSyntheticLambda1(this, 12));
        if (lastFragment != null) {
            AndroidUtilities.setLightStatusBar(this, lastFragment.isLightStatusBar());
        }
        this.captionLimitBulletinShown = false;
        super.lambda$showGiftOfferSheet$15();
        this.allowPassConfirmationAlert = false;
    }

    public final class AnonymousClass18 extends FrameLayout {
        public final int $r8$classId = 1;
        public final Object clip;
        public int lastHeight;
        public final Object path;
        public final NotificationCenter.NotificationCenterDelegate this$0;

        public AnonymousClass18(BusinessIntroActivity businessIntroActivity, Context context) {
            super(context);
            this.this$0 = businessIntroActivity;
            this.lastHeight = -1;
            this.path = new Rect();
            this.clip = new AnimatedFloat(220L, this, CubicBezierInterpolator.EASE_OUT_QUINT);
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    ChatAttachAlert chatAttachAlert = (ChatAttachAlert) this.this$0;
                    BlurredBackgroundDrawable blurredBackgroundDrawable = chatAttachAlert.captionContainerBg;
                    if (blurredBackgroundDrawable != null) {
                        blurredBackgroundDrawable.setBounds(0, (int) chatAttachAlert.captionEditTextTopOffset, getMeasuredWidth(), getMeasuredHeight());
                        chatAttachAlert.captionContainerBg.draw(canvas);
                    }
                    float fDp = AndroidUtilities.dp(20.0f);
                    int iDp = AndroidUtilities.dp(7.0f);
                    int iDp2 = AndroidUtilities.dp(7.0f);
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f = iDp;
                    rectF.set(getPaddingLeft(), f, getWidth() - getPaddingRight(), getHeight() - iDp2);
                    Path path = (Path) this.path;
                    path.rewind();
                    path.addRoundRect(rectF, fDp, fDp, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    canvas.saveLayerAlpha(rectF, 255, 31);
                    super.dispatchDraw(canvas);
                    rectF.set(getPaddingLeft(), f, getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + iDp);
                    GradientClip gradientClip = (GradientClip) this.clip;
                    gradientClip.draw(canvas, rectF, 1, 1.0f);
                    rectF.set(getPaddingLeft(), (getHeight() - iDp2) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - iDp2);
                    gradientClip.draw(canvas, rectF, 3, 1.0f);
                    canvas.restore();
                    canvas.restore();
                    break;
                default:
                    super.dispatchDraw(canvas);
                    break;
            }
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            switch (this.$r8$classId) {
                case 1:
                    float width = getWidth() / 2.0f;
                    BusinessIntroActivity businessIntroActivity = (BusinessIntroActivity) this.this$0;
                    float f = ((AnimatedFloat) this.clip).set(businessIntroActivity.greetingsView.getWidth(), false) / 2.0f;
                    int scaleX = (int) (width - (businessIntroActivity.greetingsView.getScaleX() * f));
                    int scaleY = (int) (((1.0f - businessIntroActivity.greetingsView.getScaleY()) * businessIntroActivity.greetingsView.getHeight()) + businessIntroActivity.greetingsView.getY());
                    int scaleX2 = (int) ((businessIntroActivity.greetingsView.getScaleX() * f) + width);
                    int y = (int) (businessIntroActivity.greetingsView.getY() + businessIntroActivity.greetingsView.getHeight());
                    Rect rect = (Rect) this.path;
                    rect.set(scaleX, scaleY, scaleX2, y);
                    businessIntroActivity.greetingsViewBackground.setBounds(rect);
                    businessIntroActivity.greetingsViewBackground.draw(canvas);
                    return super.drawChild(canvas, view, j);
                default:
                    return super.drawChild(canvas, view, j);
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 0:
                    int i5 = this.lastHeight;
                    ChatAttachAlert chatAttachAlert = (ChatAttachAlert) this.this$0;
                    int top = i5 - chatAttachAlert.aiButton.getTop();
                    super.onLayout(z, i, i2, i3, i4);
                    this.lastHeight = getHeight();
                    if (chatAttachAlert.aiButton.getVisibility() == 0 && getHeight() - chatAttachAlert.aiButton.getTop() != top) {
                        chatAttachAlert.aiButton.setTranslationY(chatAttachAlert.aiButton.getTranslationY() + ((getHeight() - chatAttachAlert.aiButton.getTop()) - top));
                        chatAttachAlert.aiButton.animate().translationY(0.0f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                        break;
                    }
                    break;
                default:
                    super.onLayout(z, i, i2, i3, i4);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 1:
                    BusinessIntroActivity businessIntroActivity = (BusinessIntroActivity) this.this$0;
                    businessIntroActivity.greetingsView.measure(i, i2);
                    invalidate();
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(this.lastHeight, AndroidUtilities.dp(36.0f) + businessIntroActivity.greetingsView.getMeasuredHeight()), 1073741824));
                    if (this.lastHeight < 0) {
                        this.lastHeight = getMeasuredHeight();
                    }
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        public AnonymousClass18(ChatAttachAlert chatAttachAlert, Context context) {
            super(context);
            this.this$0 = chatAttachAlert;
            this.path = new Path();
            this.clip = new GradientClip();
        }
    }

    public final void showLayout(AttachAlertLayout attachAlertLayout, long j, boolean z) {
        ChatAttachAlertPhotoLayout.CameraViewInternal cameraViewInternal;
        ChatAttachAlertPhotoLayout.CameraViewInternal cameraViewInternal2;
        int iDp;
        AnonymousClass15 anonymousClass15;
        int i = 1;
        if (this.viewChangeAnimator == null && this.commentsAnimator == null) {
            AttachAlertLayout attachAlertLayout2 = this.currentAttachLayout;
            if (attachAlertLayout2 == attachAlertLayout) {
                attachAlertLayout2.scrollToTop();
                return;
            }
            if (attachAlertLayout == this.todoLayout && !UserConfig.getInstance(this.currentAccount).isPremium()) {
                new PremiumFeatureBottomSheet(this.baseFragment, 39, false).show();
                return;
            }
            this.animatorToggleCaptionSupported.setValue(j == 1, z);
            this.animatorCurrentVisibleLayout.replace(Long.valueOf(j), z);
            this.botButtonWasVisible = false;
            this.botButtonProgressWasVisible = false;
            this.botMainButtonOffsetY = 0.0f;
            this.botMainButtonTextView.setVisibility(8);
            RadialProgressView radialProgressView = this.botProgressView;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.1f);
            radialProgressView.setScaleY(0.1f);
            radialProgressView.setVisibility(8);
            AnonymousClass14 anonymousClass14 = this.buttonsRecyclerViewWrapper;
            anonymousClass14.setAlpha(1.0f);
            anonymousClass14.setTranslationY(this.botMainButtonOffsetY);
            int i2 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.botAttachLayouts;
                if (i2 >= longSparseArray.size()) {
                    break;
                }
                ((ChatAttachAlertBotWebViewLayout) longSparseArray.valueAt(i2)).setMeasureOffsetY(0);
                i2++;
            }
            this.selectedId = j;
            AnonymousClass15 anonymousClass16 = this.buttonsRecyclerView;
            int childCount = anonymousClass16.getChildCount();
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = anonymousClass16.getChildAt(i3);
                if (childAt instanceof AttachButton) {
                    AttachButton attachButton = (AttachButton) childAt;
                    anonymousClass15 = anonymousClass16;
                    attachButton.glassTabView.setSelected(((long) attachButton.currentId) == ChatAttachAlert.this.selectedId, true);
                } else {
                    anonymousClass15 = anonymousClass16;
                    if (childAt instanceof AttachBotButton) {
                        ((AttachBotButton) childAt).updateCheckedState(true);
                    }
                }
                i3++;
                anonymousClass16 = anonymousClass15;
            }
            int firstOffset = (this.currentAttachLayout.getFirstOffset() - AndroidUtilities.dp(11.0f)) - this.scrollOffsetY[0];
            this.nextAttachLayout = attachAlertLayout;
            attachAlertLayout.getClass();
            boolean z2 = attachAlertLayout instanceof ChatAttachAlertRichLayout;
            ChatActivityFadeView chatActivityFadeView = this.fadeView;
            if (chatActivityFadeView != null) {
                chatActivityFadeView.setFadeHeightBottom(z2 ? 0 : AndroidUtilities.dp(48.0f));
            }
            AnonymousClass16 anonymousClass17 = this.bottomFadeView;
            if (anonymousClass17 != null) {
                anonymousClass17.setVisibility(z2 ? 4 : 0);
            }
            int i4 = this.nextAttachLayout.needsActionBar() != 0 ? 0 : 4;
            AnonymousClass7 anonymousClass7 = this.actionBar;
            anonymousClass7.setVisibility(i4);
            if (anonymousClass7.isSearchFieldVisible) {
                anonymousClass7.closeSearchField(true);
            }
            this.currentAttachLayout.onHide();
            AttachAlertLayout attachAlertLayout3 = this.nextAttachLayout;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.photoLayout;
            if (attachAlertLayout3 == chatAttachAlertPhotoLayout) {
                chatAttachAlertPhotoLayout.setCheckCameraWhenShown(true);
            }
            this.nextAttachLayout.onShow(this.currentAttachLayout);
            this.nextAttachLayout.setVisibility(0);
            if (attachAlertLayout.getParent() != null) {
                this.containerView.removeView(this.nextAttachLayout);
            }
            int iIndexOfChild = this.containerView.indexOfChild(this.currentAttachLayout);
            ViewParent parent = this.nextAttachLayout.getParent();
            ViewGroup viewGroup = this.containerView;
            if (parent != viewGroup) {
                AttachAlertLayout attachAlertLayout4 = this.nextAttachLayout;
                if (attachAlertLayout4 != this.locationLayout) {
                    iIndexOfChild++;
                }
                viewGroup.addView(attachAlertLayout4, iIndexOfChild, LayoutHelper.createFrame(-1.0f, -1));
            }
            ChatAttachAlert$$ExternalSyntheticLambda7 chatAttachAlert$$ExternalSyntheticLambda7 = new ChatAttachAlert$$ExternalSyntheticLambda7(this, 3);
            AttachAlertLayout attachAlertLayout5 = this.currentAttachLayout;
            boolean z3 = attachAlertLayout5 instanceof ChatAttachAlertPhotoLayoutPreview;
            AnonymousClass2 anonymousClass2 = this.ATTACH_ALERT_LAYOUT_TRANSLATION;
            if (z3 || (this.nextAttachLayout instanceof ChatAttachAlertPhotoLayoutPreview)) {
                int iMax = Math.max(this.nextAttachLayout.getWidth(), this.currentAttachLayout.getWidth());
                AttachAlertLayout attachAlertLayout6 = this.nextAttachLayout;
                if (attachAlertLayout6 instanceof ChatAttachAlertPhotoLayoutPreview) {
                    attachAlertLayout6.setTranslationX(iMax);
                    AttachAlertLayout attachAlertLayout7 = this.currentAttachLayout;
                    if ((attachAlertLayout7 instanceof ChatAttachAlertPhotoLayout) && (cameraViewInternal2 = ((ChatAttachAlertPhotoLayout) attachAlertLayout7).cameraView) != null) {
                        cameraViewInternal2.setVisibility(4);
                    }
                } else {
                    this.currentAttachLayout.setTranslationX(-iMax);
                    AttachAlertLayout attachAlertLayout8 = this.nextAttachLayout;
                    if (attachAlertLayout8 == chatAttachAlertPhotoLayout && (cameraViewInternal = ((ChatAttachAlertPhotoLayout) attachAlertLayout8).cameraView) != null) {
                        cameraViewInternal.setVisibility(0);
                    }
                }
                this.nextAttachLayout.setAlpha(1.0f);
                this.currentAttachLayout.setAlpha(1.0f);
                if (z) {
                    AttachAlertLayout attachAlertLayout9 = this.currentAttachLayout;
                    anonymousClass2.getClass();
                    anonymousClass2.setValue(attachAlertLayout9, 0.0f);
                    AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda1(this, attachAlertLayout, chatAttachAlert$$ExternalSyntheticLambda7, 5));
                } else {
                    boolean z4 = this.nextAttachLayout.getCurrentItemTop() <= attachAlertLayout.getButtonsHideOffset();
                    this.currentAttachLayout.onHideShowProgress(1.0f);
                    this.nextAttachLayout.onHideShowProgress(1.0f);
                    this.currentAttachLayout.onContainerTranslationUpdated(this.currentPanTranslationY);
                    this.nextAttachLayout.onContainerTranslationUpdated(this.currentPanTranslationY);
                    this.containerView.invalidate();
                    AttachAlertLayout attachAlertLayout10 = this.currentAttachLayout;
                    anonymousClass2.getClass();
                    anonymousClass2.setValue(attachAlertLayout10, 1.0f);
                    anonymousClass7.setTag(z4 ? 1 : null);
                    chatAttachAlert$$ExternalSyntheticLambda7.run();
                }
            } else if (z) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.nextAttachLayout.setAlpha(0.0f);
                this.nextAttachLayout.setTranslationY(AndroidUtilities.dp(78.0f));
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.currentAttachLayout, (Property<AttachAlertLayout, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(78.0f) + firstOffset), ObjectAnimator.ofFloat(this.currentAttachLayout, anonymousClass2, 0.0f, 1.0f), ObjectAnimator.ofFloat(anonymousClass7, (Property<AnonymousClass7, Float>) View.ALPHA, anonymousClass7.getAlpha(), 0.0f));
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                animatorSet.addListener(new StarGiftSheet.AnonymousClass13(this, firstOffset, chatAttachAlert$$ExternalSyntheticLambda7, i));
                this.viewChangeAnimator = animatorSet;
                AttachAlertLayout attachAlertLayout11 = this.currentAttachLayout;
                anonymousClass2.getClass();
                anonymousClass2.setValue(attachAlertLayout11, 0.0f);
                animatorSet.start();
            } else {
                attachAlertLayout5.setAlpha(0.0f);
                chatAttachAlert$$ExternalSyntheticLambda7.run();
                updateSelectedPosition(0);
                this.containerView.invalidate();
            }
            if (this.hasOverridenWebviewBackgroundColor && !(attachAlertLayout instanceof ChatAttachAlertBotWebViewLayout)) {
                this.hasOverridenWebviewBackgroundColor = false;
                anonymousClass7.updateColors$1();
                anonymousClass7.invalidate();
                onCurrentLayoutAnimatorChanged$1();
            }
            if (j != 1 && j != 6 && !(attachAlertLayout instanceof ChatAttachAlertBotWebViewLayout)) {
                iDp = j == 4 ? AndroidUtilities.dp(84.0f) : 0;
            } else {
                iDp = AndroidUtilities.dp(46.0f);
            }
            anonymousClass7.setForcedMenuWidth(iDp);
        }
    }
}
