package org.telegram.ui.Stories;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ReplacementSpan;
import android.text.style.URLSpan;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.gms.internal.mlkit_language_id_common.zzhp;
import com.google.android.gms.internal.mlkit_language_id_common.zzin;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileStreamLoadOperation;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.AccountFrozenAlert;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda14;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.ArticleViewer$21$$ExternalSyntheticOutline0;
import org.telegram.ui.ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.Business.BusinessIntroActivity;
import org.telegram.ui.CalendarActivity$$ExternalSyntheticOutline0;
import org.telegram.ui.Cells.ChatListCell$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.MentionCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Cells.UserCell2;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChooseSpeedLayout;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BitmapShaderTools;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertDocumentLayout;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.CustomPopupMenu;
import org.telegram.ui.Components.DotDividerSpan;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.GradientTools;
import org.telegram.ui.Components.HashtagActivity;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.InstantCameraView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.MediaActivity;
import org.telegram.ui.Components.MentionsContainerView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.PremiumStickersPreviewRecycler;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgress;
import org.telegram.ui.Components.Reactions.AnimatedEmojiEffect;
import org.telegram.ui.Components.Reactions.ReactionImageHolder;
import org.telegram.ui.Components.Reactions.ReactionsEffectOverlay;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.Reactions.ReactionsUtils;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SenderSelectView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SpeedIconDrawable;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Components.URLSpanMono;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.URLSpanReplacement;
import org.telegram.ui.Components.URLSpanUserMention;
import org.telegram.ui.Components.UndoView$$ExternalSyntheticLambda7;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.chat.layouts.ChatActivitySideControlsButtonsLayout;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.EmojiAnimationsOverlay;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda1;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.MessageStatisticActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.BalanceCloud$$ExternalSyntheticLambda1;
import org.telegram.ui.Stars.BotStarsActivity$$ExternalSyntheticLambda27;
import org.telegram.ui.Stars.GiftOfferSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda140;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda66;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stories.StoryViewer.VideoPlayerHolder;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.LivePlayerView;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.WrappedResourceProvider;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda2;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda3;
import org.telegram.ui.bots.BotSensors$1$$ExternalSyntheticLambda0;
import org.telegram.ui.bots.BotWebViewSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.community.CommunitySheet;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda20;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda46;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda48;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda53;
import org.telegram.ui.iv.RichMediaCell$$ExternalSyntheticLambda1;
import org.telegram.ui.recyclerview.ChatListItemAnimator;
import org.telegram.ui.web.AddressBarList$$ExternalSyntheticLambda1;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.WebBrowserSettings;
import org.webrtc.TextureViewRenderer;

public abstract class PeerStoriesView extends SizeNotifierFrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public boolean BIG_SCREEN;
    public ActionBarMenuSubItem albumItem;
    public boolean allowDrawSurface;
    public final AnonymousClass34 allowDrawSurfaceRunnable;
    public boolean allowRepost;
    public boolean allowShare;
    public boolean allowShareLink;
    public final float alpha;
    public boolean animateKeyboardOpening;
    public float animatingKeyboardHeight;
    public boolean areLiveCommentsDisabled;
    public boolean attachedToWindow;
    public final AvatarDrawable avatarDrawable;
    public final BitmapShaderTools bitmapShaderTools;
    public final BlurredBackgroundColorProviderThemed blurredBackgroundColorProvider;
    public final BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableFactory;
    public final BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNodeWithSaturation;
    public final BlurredBackgroundSource blurredBackgroundSourceWithSaturation;
    public TL_stories.TL_premium_boostsStatus boostsStatus;
    public final LinearLayout bottomActionsLinearLayout;
    public ChannelBoostsController.CanApplyBoost canApplyBoost;
    public ValueAnimator changeBoundAnimator;
    public AnonymousClass19 chatActivityEnterView;
    public AnonymousClass23 chatAttachAlert;
    public boolean checkBlackoutMode;
    public final int classGuid;
    public final Path clipPath;
    public CommentButton commentButton;
    public int count;
    public int currentAccount;
    public long currentImageTime;
    public final StoryItemHolder currentStory;
    public ArrayList day;
    public Delegate delegate;
    public boolean deletedPeer;
    public long dialogId;
    public final ArrayList documentsToPrepare;
    public boolean drawAnimatedEmojiAsMovingReaction;
    public boolean drawReactionEffect;
    public boolean editOpened;
    public ActionBarMenuSubItem editStoryItem;
    public boolean editedPrivacy;
    public final EmojiAnimationsOverlay emojiAnimationsOverlay;
    public final BlurredBackgroundDrawable emojiKeyboardBackground;
    public AnimatedEmojiEffect emojiReactionEffect;
    public int enterViewBottomOffset;
    public StoryFailView failView;
    public ViewPropertyAnimator failViewAnimator;
    public boolean forceUpdateOffsets;
    public final PeerHeaderView headerView;
    public HintView2 highlightMessageHintView;
    public boolean imageChanged;
    public final ChatMessageCell.AnonymousClass3 imageReceiver;
    public boolean inBlackoutMode;
    public final Paint inputBackgroundPaint;
    public final BlurredBackgroundDrawable inputFieldBackground;
    public InstantCameraView instantCameraView;
    public boolean isActive;
    public boolean isCaptionPartVisible;
    public boolean isChannel;
    public boolean isEditing;
    public boolean isFailed;
    public boolean isGroup;
    public boolean isLongPressed;
    public boolean isPremiumBlocked;
    public boolean isRecording;
    public boolean isSelf;
    public boolean isUploading;
    public boolean isVisible;
    public ValueAnimator keyboardAnimator;
    public boolean keyboardVisible;
    public float lastAnimatingKeyboardHeight;
    public long lastDrawTime;
    public int lastKeyboardHeight;
    public boolean lastNoThumb;
    public int lastOpenedKeyboardHeight;
    public final ImageReceiver leftPreloadImageReceiver;
    public final AnonymousClass7 likeButtonContainer;
    public ReactionsContainerLayout likesReactionLayout;
    public float likesReactionShowProgress;
    public boolean likesReactionShowing;
    public final AnimatedFloat linesAlpha;
    public int linesCount;
    public int linesPosition;
    public int listPosition;
    public final View liveCommentsShadowView;
    public final AnonymousClass10 liveCommentsView;
    public HintView mediaBanTooltip;
    public AnonymousClass21 mentionContainer;
    public boolean messageSent;
    public long messageStars;
    public boolean movingReaction;
    public int movingReactionFromSize;
    public int movingReactionFromX;
    public int movingReactionFromY;
    public float movingReactionProgress;
    public MuteButton muteButton;
    public final ActionBar.AnonymousClass8 muteIconContainer;
    public final RLottieImageView muteIconView;
    public float muteIconViewAlpha;
    public final ImageView noSoundIconView;
    public final AnimationNotificationsLocker notificationsLocker;
    public Runnable onImageReceiverThumbLoaded;
    public final ImageView optionsIconView;
    public ValueAnimator outAnimator;
    public float outT;
    public final RoundRectOutlineProvider outlineProvider;
    public boolean paused;
    public final PinchToZoomHelper pinchToZoomHelper;
    public final ImageView pipIconView;
    public final VideoPlayerSharedScope playerSharedScope;
    public AnonymousClass8 popupMenu;
    public final ArrayList preloadReactionHolders;
    public LinearLayout premiumBlockedText;
    public TextView premiumBlockedText1;
    public TextView premiumBlockedText2;
    public float prevToHideProgress;
    public final StoryPrivacyButton privacyButton;
    public HintView2 privacyHint;
    public float progressToDismiss;
    public final AnimatedFloat progressToHideInterface;
    public float progressToKeyboard;
    public final AnimatedFloat progressToRecording;
    public float progressToReply;
    public final AnimatedFloat progressToStickerExpanded;
    public final AnimatedFloat progressToTextA;
    public final ImageReceiver reactionEffectImageReceiver;
    public AnimatedEmojiDrawable reactionMoveDrawable;
    public final ImageReceiver reactionMoveImageReceiver;
    public int reactionsContainerIndex;
    public ReactionsContainerLayout reactionsContainerLayout;
    public AnimatedTextView.AnimatedTextDrawable reactionsCounter;
    public AnimatedFloat reactionsCounterProgress;
    public boolean reactionsCounterVisible;
    public HintView2 reactionsLongpressTooltip;
    public PeerStoriesView$$ExternalSyntheticLambda3 reactionsTooltipRunnable;
    public int realKeyboardHeight;
    public MentionCell.AnonymousClass1 replyDisabledTextView;
    public final AnonymousClass6 repostButtonContainer;
    public AnimatedTextView.AnimatedTextDrawable repostCounter;
    public AnimatedFloat repostCounterProgress;
    public boolean repostCounterVisible;
    public final DarkThemeResourceProvider resourcesProvider;
    public final ImageReceiver rightPreloadImageReceiver;
    public int selectedPosition;
    public AnonymousClass31 selfAvatarsContainer;
    public HwAvatarsImageView selfAvatarsView;
    public TextView selfStatusView;
    public TONIntroActivity.AnonymousClass2 selfView;
    public TLRPC.TL_channels_sendAsPeers sendAsPeersObj;
    public AnonymousClass27 shareAlert;
    public final ImageView shareButton;
    public final SharedResources sharedResources;
    public int shiftDp;
    public final PeerStoriesView$$ExternalSyntheticLambda7 showTapToSoundHint;
    public ChatActivitySideControlsButtonsLayout sideControlsButtonsLayout;
    public HintView2 soundTooltip;
    public ActionBarMenuSubItem speedItem;
    public ChooseSpeedLayout speedLayout;
    public PaidReactionButton starsButton;
    public PaidReactionButton.PaidReactionButtonEffectsView starsButtonEffectsView;
    public long starsPriceBlocked;
    public boolean stealthModeIsActive;
    public StoriesController storiesController;
    public StoriesLikeButton storiesLikeButton;
    public final AnonymousClass3 storyAreasView;
    public final AnonymousClass5 storyCaptionView;
    public final AnonymousClass4 storyContainer;
    public final ArrayList storyItems;
    public final StoryLinesDrawable storyLines;
    public StoryPositionView storyPositionView;
    public final StoryViewer storyViewer;
    public boolean switchEventSent;
    public long titleLastDialogId;
    public boolean titleLastLive;
    public final FrameLayout topBulletinContainer;
    public int totalStoriesCount;
    public boolean unsupported;
    public FrameLayout unsupportedContainer;
    public final PeerStoriesView$$ExternalSyntheticLambda7 updateStealthModeTimer;
    public final ArrayList uploadingStories;
    public final ArrayList uriesToPrepare;
    public boolean userCanSeeViews;
    public TL_stories.PeerStories userStories;
    public long videoDuration;
    public float viewsThumbAlpha;
    public SelfStoriesPreviewView.ImageHolder viewsThumbImageReceiver;
    public float viewsThumbScale;
    public boolean wasBigScreen;
    public int watchersCount;

    public final class AnonymousClass10 extends LiveCommentsView {
        public final StoriesViewPager.AnonymousClass2.AnonymousClass1 this$0;
        public final StoryViewer val$storyViewer;

        public AnonymousClass10(StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1, Context context, StoryViewer storyViewer, StoryViewer.AnonymousClass3 anonymousClass3, View view, FrameLayout frameLayout, StoryViewer storyViewer2) {
            super(context, storyViewer, anonymousClass3, view, frameLayout);
            this.this$0 = anonymousClass1;
            this.val$storyViewer = storyViewer2;
        }

        @Override
        public final TLRPC.Peer getDefaultSendAs() {
            LivePlayer livePlayer = this.val$storyViewer.livePlayer;
            if (livePlayer != null) {
                return livePlayer.getDefaultSendAs();
            }
            return null;
        }

        @Override
        public final void onCancelledStarReaction(long j) {
            PaidReactionButton.PaidReactionButtonEffectsView paidReactionButtonEffectsView = this.this$0.starsButtonEffectsView;
            if (paidReactionButtonEffectsView == null) {
                return;
            }
            int i = 0;
            while (true) {
                ArrayList arrayList = paidReactionButtonEffectsView.chips;
                if (i >= arrayList.size()) {
                    return;
                }
                if (((PaidReactionButton.PaidReactionButtonEffectsView.Chip) arrayList.get(i)).dialogId == j) {
                    ((PaidReactionButton.PaidReactionButtonEffectsView.Chip) arrayList.get(i)).isKilled = true;
                }
                i++;
            }
        }

        @Override
        public final void onStarsCountUpdated() {
            StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = this.this$0;
            anonymousClass1.starsButton.setCount((int) getStarsCount());
            anonymousClass1.starsButton.setFilled(this.starsBulletin != null);
        }

        @Override
        public final void setCollapsed(boolean z, boolean z2) {
            if (!z2 || this.collapsed != z) {
                this.collapsed = z;
                ValueAnimator valueAnimator = this.collapseAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.collapseAnimator = null;
                }
                LiveCommentsView.AnonymousClass1 anonymousClass1 = this.listView;
                anonymousClass1.invalidate();
                if (z2) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(anonymousClass1.getAlpha(), z ? 0.0f : 1.0f);
                    this.collapseAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new RichMediaCell$$ExternalSyntheticLambda1(this, 4));
                    this.collapseAnimator.addListener(new StoryViewer.AnonymousClass7(this, z, 9));
                    this.collapseAnimator.setDuration(420L);
                    this.collapseAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    this.collapseAnimator.start();
                } else {
                    this.shadowView.setAlpha(z ? 0.0f : 0.5f);
                    anonymousClass1.setAlpha(z ? 0.0f : 1.0f);
                }
                invalidate();
            }
            CommentButton commentButton = this.this$0.commentButton;
            if (commentButton != null) {
                commentButton.setCollapsed(z, z2);
            }
        }

        @Override
        public final void setVisibility(int i) {
            super.setVisibility(i);
            this.this$0.liveCommentsShadowView.setVisibility(i);
        }
    }

    public final class AnonymousClass14 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final PeerStoriesView this$0;
        public final boolean val$show;

        public AnonymousClass14(PeerStoriesView peerStoriesView, boolean z, int i) {
            this.$r8$classId = i;
            this.this$0 = peerStoriesView;
            this.val$show = z;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    if (!this.val$show) {
                        PeerStoriesView peerStoriesView = this.this$0;
                        peerStoriesView.likesReactionLayout.setVisibility(8);
                        peerStoriesView.likesReactionLayout.reset();
                    }
                    break;
                default:
                    float f = this.val$show ? 1.0f : 0.0f;
                    PeerStoriesView peerStoriesView2 = this.this$0;
                    peerStoriesView2.outT = f;
                    float f2 = (-AndroidUtilities.dp(8.0f)) * peerStoriesView2.outT;
                    PeerHeaderView peerHeaderView = peerStoriesView2.headerView;
                    peerHeaderView.setTranslationY(f2);
                    peerHeaderView.setAlpha(1.0f - peerStoriesView2.outT);
                    ImageView imageView = peerStoriesView2.optionsIconView;
                    imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * peerStoriesView2.outT);
                    imageView.setAlpha(1.0f - peerStoriesView2.outT);
                    ImageView imageView2 = peerStoriesView2.pipIconView;
                    imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * peerStoriesView2.outT);
                    imageView2.setAlpha(1.0f - peerStoriesView2.outT);
                    float f3 = (-AndroidUtilities.dp(8.0f)) * peerStoriesView2.outT;
                    ActionBar.AnonymousClass8 anonymousClass8 = peerStoriesView2.muteIconContainer;
                    anonymousClass8.setTranslationY(f3);
                    anonymousClass8.setAlpha((1.0f - peerStoriesView2.outT) * peerStoriesView2.muteIconViewAlpha);
                    TONIntroActivity.AnonymousClass2 anonymousClass2 = peerStoriesView2.selfView;
                    if (anonymousClass2 != null) {
                        anonymousClass2.setTranslationY(AndroidUtilities.dp(8.0f) * peerStoriesView2.outT);
                        peerStoriesView2.selfView.setAlpha(1.0f - peerStoriesView2.outT);
                    }
                    StoryPrivacyButton storyPrivacyButton = peerStoriesView2.privacyButton;
                    if (storyPrivacyButton != null) {
                        storyPrivacyButton.setTranslationY((-AndroidUtilities.dp(8.0f)) * peerStoriesView2.outT);
                        storyPrivacyButton.setAlpha(1.0f - peerStoriesView2.outT);
                    }
                    peerStoriesView2.storyCaptionView.setAlpha(1.0f - peerStoriesView2.outT);
                    Delegate delegate = peerStoriesView2.delegate;
                    float f4 = delegate != null ? StoryViewer.this.progressToDismiss : 0.0f;
                    float hideInterfaceAlpha = peerStoriesView2.getHideInterfaceAlpha();
                    AnonymousClass7 anonymousClass7 = peerStoriesView2.likeButtonContainer;
                    if (anonymousClass7 != null) {
                        anonymousClass7.setAlpha((1.0f - peerStoriesView2.outT) * (1.0f - f4) * hideInterfaceAlpha);
                    }
                    ImageView imageView3 = peerStoriesView2.shareButton;
                    if (imageView3 != null) {
                        imageView3.setAlpha((1.0f - peerStoriesView2.outT) * (1.0f - f4) * hideInterfaceAlpha);
                    }
                    AnonymousClass6 anonymousClass6 = peerStoriesView2.repostButtonContainer;
                    if (anonymousClass6 != null) {
                        anonymousClass6.setAlpha((1.0f - peerStoriesView2.outT) * (1.0f - f4) * hideInterfaceAlpha);
                    }
                    AnonymousClass19 anonymousClass19 = peerStoriesView2.chatActivityEnterView;
                    if (anonymousClass19 != null) {
                        anonymousClass19.setAlpha(1.0f - peerStoriesView2.outT);
                        peerStoriesView2.invalidate();
                    }
                    peerStoriesView2.storyContainer.invalidate();
                    break;
            }
        }
    }

    public final class AnonymousClass15 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final PeerStoriesView this$0;

        public AnonymousClass15(PeerStoriesView peerStoriesView, int i) {
            this.$r8$classId = i;
            this.this$0 = peerStoriesView;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            AnonymousClass21 anonymousClass21;
            switch (this.$r8$classId) {
                case 0:
                    PeerStoriesView peerStoriesView = this.this$0;
                    peerStoriesView.likesReactionShowProgress = 0.0f;
                    peerStoriesView.likesReactionLayout.setAlpha(1.0f);
                    peerStoriesView.likesReactionLayout.setVisibility(8);
                    peerStoriesView.likesReactionLayout.reset();
                    break;
                default:
                    super.onAnimationEnd(animator);
                    PeerStoriesView peerStoriesView2 = this.this$0;
                    peerStoriesView2.notificationsLocker.unlock();
                    peerStoriesView2.animatingKeyboardHeight = peerStoriesView2.lastKeyboardHeight;
                    AnonymousClass19 anonymousClass19 = peerStoriesView2.chatActivityEnterView;
                    if (anonymousClass19 != null) {
                        anonymousClass19.onOverrideAnimationEnd();
                    }
                    if (peerStoriesView2.isActive && !peerStoriesView2.keyboardVisible) {
                        StoryViewer storyViewer = StoryViewer.this;
                        if (storyViewer.keyboardVisible) {
                            storyViewer.keyboardVisible = false;
                            storyViewer.updatePlayingMode();
                        }
                    }
                    if (!peerStoriesView2.keyboardVisible && (anonymousClass21 = peerStoriesView2.mentionContainer) != null) {
                        anonymousClass21.setVisibility(8);
                    }
                    peerStoriesView2.forceUpdateOffsets = true;
                    peerStoriesView2.invalidate();
                    break;
            }
        }
    }

    public final class AnonymousClass16 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final View val$oldLikeButton;

        public AnonymousClass16(View view, int i) {
            this.$r8$classId = i;
            this.val$oldLikeButton = view;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    AndroidUtilities.removeFromParent(this.val$oldLikeButton);
                    break;
                default:
                    AndroidUtilities.removeFromParent(this.val$oldLikeButton);
                    break;
            }
        }
    }

    public final class AnonymousClass18 extends WrappedResourceProvider {
        public final int $r8$classId;

        public AnonymousClass18(Theme.ResourcesProvider resourcesProvider, int i) {
            super(resourcesProvider);
            this.$r8$classId = i;
        }

        @Override
        public final void appendColors() {
            switch (this.$r8$classId) {
                case 0:
                    this.sparseIntArray.put(Theme.key_chat_emojiPanelBackground, -1071635414);
                    break;
                case 1:
                    this.sparseIntArray.append(Theme.key_dialogBackground, -14737633);
                    this.sparseIntArray.append(Theme.key_windowBackgroundGray, -13421773);
                    break;
                case 2:
                    this.sparseIntArray.put(Theme.key_chat_emojiPanelBackground, ColorUtils.blendARGB(0.2f, -16777216, -1));
                    this.sparseIntArray.put(Theme.key_chat_messagePanelIcons, ColorUtils.blendARGB(0.5f, -16777216, -1));
                    break;
                case 3:
                    this.sparseIntArray.put(Theme.key_chat_emojiPanelBackground, ColorUtils.setAlphaComponent(-1, 30));
                    break;
                case 4:
                    this.sparseIntArray.put(Theme.key_chat_emojiPanelBackground, ColorUtils.setAlphaComponent(-1, 30));
                    break;
                case 5:
                    this.sparseIntArray.append(Theme.key_dialogBackground, -14803426);
                    this.sparseIntArray.append(Theme.key_windowBackgroundGray, -16777216);
                    break;
                case 6:
                    this.sparseIntArray.put(Theme.key_chat_emojiPanelBackground, ColorUtils.setAlphaComponent(-1, 30));
                    break;
                case 7:
                    this.sparseIntArray.append(Theme.key_dialogBackground, -14737633);
                    this.sparseIntArray.append(Theme.key_windowBackgroundGray, -13421773);
                    break;
                case 8:
                    this.sparseIntArray.append(Theme.key_dialogBackground, -14803426);
                    this.sparseIntArray.append(Theme.key_windowBackgroundGray, -16777216);
                    break;
                default:
                    this.sparseIntArray.append(Theme.key_dialogBackground, -14803426);
                    this.sparseIntArray.append(Theme.key_windowBackgroundGray, -16777216);
                    break;
            }
        }
    }

    public final class AnonymousClass19 extends ChatActivityEnterView {
        public int chatActivityEnterViewAnimateFromTop;
        public ValueAnimator messageEditTextAnimator;
        public int messageEditTextPredrawHeigth;
        public int messageEditTextPredrawScrollY;

        public AnonymousClass19(Activity activity, PeerStoriesView peerStoriesView, AnonymousClass18 anonymousClass18) {
            super(activity, peerStoriesView, null, true, anonymousClass18);
        }

        @Override
        public final boolean areLiveCommentsFree() {
            return PeerStoriesView.this.disabledPaidFeatures(true);
        }

        @Override
        public final void checkAnimation() {
            final int i = 1;
            int backgroundTop = getBackgroundTop();
            int i2 = this.chatActivityEnterViewAnimateFromTop;
            final int i3 = 0;
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            if (i2 != 0 && backgroundTop != i2) {
                int i4 = (this.animatedTop + i2) - backgroundTop;
                setAnimatedTop(i4);
                peerStoriesView.forceUpdateOffsets = true;
                ValueAnimator valueAnimator = peerStoriesView.changeBoundAnimator;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    peerStoriesView.changeBoundAnimator.cancel();
                }
                View view = this.topView;
                if (view != null && view.getVisibility() == 0) {
                    this.topView.setTranslationY(((1.0f - getTopViewEnterProgress()) * this.topView.getLayoutParams().height) + this.animatedTop);
                }
                peerStoriesView.invalidate();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i4, 0.0f);
                peerStoriesView.changeBoundAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final PeerStoriesView.AnonymousClass19 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (i3) {
                            case 0:
                                PeerStoriesView.AnonymousClass19 anonymousClass19 = this.f$0;
                                anonymousClass19.getClass();
                                anonymousClass19.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                                peerStoriesView2.forceUpdateOffsets = true;
                                peerStoriesView2.invalidate();
                                anonymousClass19.invalidate();
                                break;
                            default:
                                this.f$0.messageEditText.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                break;
                        }
                    }
                });
                peerStoriesView.changeBoundAnimator.addListener(new BaseChartView.AnonymousClass4(this, 21));
                peerStoriesView.changeBoundAnimator.setDuration(250L);
                peerStoriesView.changeBoundAnimator.setInterpolator(ChatListItemAnimator.DEFAULT_INTERPOLATOR);
                peerStoriesView.changeBoundAnimator.start();
                this.chatActivityEnterViewAnimateFromTop = 0;
            }
            if (this.shouldAnimateEditTextWithBounds) {
                float scrollY = (this.messageEditTextPredrawScrollY - this.messageEditText.getScrollY()) + (this.messageEditTextPredrawHeigth - this.messageEditText.getMeasuredHeight());
                EditTextCaption editTextCaption = this.messageEditText;
                editTextCaption.setOffsetY(editTextCaption.getOffsetY() - scrollY);
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.messageEditText.getOffsetY(), 0.0f);
                valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final PeerStoriesView.AnonymousClass19 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (i) {
                            case 0:
                                PeerStoriesView.AnonymousClass19 anonymousClass19 = this.f$0;
                                anonymousClass19.getClass();
                                anonymousClass19.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                                peerStoriesView2.forceUpdateOffsets = true;
                                peerStoriesView2.invalidate();
                                anonymousClass19.invalidate();
                                break;
                            default:
                                this.f$0.messageEditText.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                break;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = this.messageEditTextAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.messageEditTextAnimator = valueAnimatorOfFloat2;
                valueAnimatorOfFloat2.setDuration(250L);
                valueAnimatorOfFloat2.setInterpolator(ChatListItemAnimator.DEFAULT_INTERPOLATOR);
                valueAnimatorOfFloat2.start();
                this.shouldAnimateEditTextWithBounds = false;
                peerStoriesView.updateViewOffsets();
            }
            getMeasuredHeight();
        }

        public final void checkRecording() {
            FrameLayout frameLayout;
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            boolean z = peerStoriesView.isRecording;
            peerStoriesView.isRecording = peerStoriesView.chatActivityEnterView.isRecordingAudioVideo() || peerStoriesView.chatActivityEnterView.seekbarVisible() || ((frameLayout = this.recordedAudioPanel) != null && frameLayout.getVisibility() == 0);
            boolean z2 = peerStoriesView.isRecording;
            if (z != z2) {
                if (peerStoriesView.isActive) {
                    StoryViewer storyViewer = StoryViewer.this;
                    storyViewer.isRecording = z2;
                    storyViewer.updatePlayingMode();
                }
                invalidate();
                peerStoriesView.storyContainer.invalidate();
            }
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            TextView textView;
            TextView textView2;
            if (isEnabled()) {
                return super.dispatchTouchEvent(motionEvent);
            }
            RectF rectF = AndroidUtilities.rectTmp;
            float width = getWidth();
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            rectF.set(0.0f, 0.0f, width + (peerStoriesView.premiumBlockedText2 != null ? this.attachLayoutPaddingTranslationX * 1.5f : 0.0f), getHeight());
            boolean zContains = rectF.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                if (zContains && (textView2 = peerStoriesView.premiumBlockedText2) != null) {
                    textView2.setPressed(true);
                }
            } else if (motionEvent.getAction() == 1) {
                TextView textView3 = peerStoriesView.premiumBlockedText2;
                if (textView3 != null) {
                    if (zContains && textView3.isPressed()) {
                        peerStoriesView.showPremiumBlockedToast();
                    }
                    peerStoriesView.premiumBlockedText2.setPressed(false);
                }
            } else if (motionEvent.getAction() == 3 && (textView = peerStoriesView.premiumBlockedText2) != null) {
                textView.setPressed(false);
            }
            TextView textView4 = peerStoriesView.premiumBlockedText2;
            return textView4 != null && textView4.isPressed();
        }

        @Override
        public final void extendActionMode(Menu menu) {
            ChatActivity.fillActionModeMenu(menu, null, false, !PeerStoriesView.this.currentStory.isLive);
        }

        @Override
        public final int getMessagesCount() {
            if (PeerStoriesView.this.currentStory.isLive) {
                return 1;
            }
            return super.getMessagesCount();
        }

        @Override
        public final long getStarsPrice() {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            return peerStoriesView.currentStory.isLive ? Math.max(peerStoriesView.getMessageMinPrice(), peerStoriesView.messageStars) : super.getStarsPrice();
        }

        @Override
        public final void isRecordingStateChanged() {
            super.isRecordingStateChanged();
            checkRecording();
        }

        @Override
        public final void onLineCountChanged(int i, int i2) {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            if (peerStoriesView.chatActivityEnterView != null) {
                this.shouldAnimateEditTextWithBounds = true;
                this.messageEditTextPredrawHeigth = this.messageEditText.getMeasuredHeight();
                this.messageEditTextPredrawScrollY = this.messageEditText.getScrollY();
                invalidate();
                peerStoriesView.invalidate();
                this.chatActivityEnterViewAnimateFromTop = peerStoriesView.chatActivityEnterView.getBackgroundTop();
            }
        }

        @Override
        public final boolean sendMessage() {
            int length;
            if (this.sendButtonContainer.getAlpha() < 0.5f) {
                openKeyboard();
                return false;
            }
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            if (!peerStoriesView.currentStory.isLive) {
                return super.sendMessage();
            }
            long jMax = Math.max(peerStoriesView.messageStars, peerStoriesView.getMessageMinPrice());
            TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
            CharSequence textWithEntities2 = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
            int length2 = textWithEntities2.length();
            int[] iArr = MessagesController.getInstance(peerStoriesView.currentAccount).starsGroupcallMessageLimits;
            if (length2 > ((iArr == null || iArr.length <= 2) ? 400 : iArr[2])) {
                NumberTextView numberTextView = this.captionLimitView;
                if (numberTextView != null) {
                    AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                    try {
                        this.captionLimitView.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
            if (!peerStoriesView.disabledPaidFeatures(true)) {
                if (textWithEntities2 instanceof Spannable) {
                    Spannable spannable = (Spannable) textWithEntities2;
                    length = ((AnimatedEmojiSpan[]) spannable.getSpans(0, textWithEntities2.length(), AnimatedEmojiSpan.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, textWithEntities2.length(), Emoji.EmojiSpan.class)).length;
                } else {
                    length = 0;
                }
                int i = (int) jMax;
                if (length > HighlightMessageSheet.getTierOption(peerStoriesView.currentAccount, i, 2) || textWithEntities2.length() > HighlightMessageSheet.getTierOption(peerStoriesView.currentAccount, i, 1)) {
                    peerStoriesView.onHighlightLiveMessage();
                    return false;
                }
            }
            peerStoriesView.liveCommentsView.send(textWithEntities, jMax);
            this.messageEditText.setText("");
            AndroidUtilities.hideKeyboard(this);
            peerStoriesView.messageStars = 0L;
            peerStoriesView.checkStealthMode(true);
            checkSendButton(true);
            return true;
        }

        @Override
        public final boolean sendMessageInternal(boolean z, int i, int i2, long j, boolean z2) {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            if (!MessagesController.getInstance(peerStoriesView.currentAccount).isFrozen()) {
                return super.sendMessageInternal(z, i, i2, j, z2);
            }
            AccountFrozenAlert.show(peerStoriesView.currentAccount);
            return false;
        }

        @Override
        public final void setHorizontalPadding(float f, float f2, float f3, boolean z) {
            LinearLayout linearLayout = PeerStoriesView.this.premiumBlockedText;
            if (linearLayout != null) {
                linearLayout.setTranslationX((1.0f - f3) * f);
            }
            super.setHorizontalPadding(f, f2, f3, z);
        }

        @Override
        public final boolean showConfirmAlert(Runnable runnable) {
            PeerStoriesView.this.applyMessageToChat(runnable);
            return true;
        }

        @Override
        public final void updateRecordInterface(int i, boolean z) {
            super.updateRecordInterface(i, z);
            checkRecording();
        }

        @Override
        public final void updateSendAsButton(boolean z) {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            super.updateSendAsButton(peerStoriesView.isPremiumBlocked || peerStoriesView.areLiveCommentsDisabled, z);
        }
    }

    public final class AnonymousClass20 implements ChatActivityEnterView.ChatActivityEnterViewDelegate {
        public AnonymousClass20() {
        }

        @Override
        public final void bottomPanelTranslationYChanged(float f) {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$bottomPanelTranslationYChanged(this, f);
        }

        @Override
        public final boolean checkCanRemoveRestrictionsByBoosts() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$checkCanRemoveRestrictionsByBoosts(this);
        }

        @Override
        public final void didPressAttachButton() {
            PeerStoriesView.this.openAttachMenu();
        }

        @Override
        public final void didPressStreamingStop() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$didPressStreamingStop(this);
        }

        @Override
        public final void didPressSuggestionButton() {
            PeerStoriesView.this.onHighlightLiveMessage();
        }

        @Override
        public final int getContentViewHeight() {
            return PeerStoriesView.this.getHeight();
        }

        @Override
        public final TLRPC.Peer getDefaultSendAs() {
            LivePlayer livePlayer;
            StoryViewer storyViewer = PeerStoriesView.this.storyViewer;
            if (storyViewer == null || (livePlayer = storyViewer.livePlayer) == null) {
                return null;
            }
            TLRPC.GroupCall groupCall = livePlayer.call;
            if (groupCall == null ? false : !groupCall.messages_enabled) {
                return null;
            }
            return livePlayer.getDefaultSendAs();
        }

        @Override
        public final ChatActivity.ReplyQuote getReplyQuote() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$getReplyQuote(this);
        }

        @Override
        public final TL_stories.StoryItem getReplyToStory() {
            return PeerStoriesView.this.currentStory.storyItem;
        }

        @Override
        public final TLRPC.TL_channels_sendAsPeers getSendAsPeers() {
            LivePlayer livePlayer;
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            if (!peerStoriesView.currentStory.isLive) {
                return null;
            }
            StoryViewer storyViewer = peerStoriesView.storyViewer;
            if (storyViewer != null && (livePlayer = storyViewer.livePlayer) != null) {
                TLRPC.GroupCall groupCall = livePlayer.call;
                if (groupCall == null ? false : !groupCall.messages_enabled) {
                    return null;
                }
            }
            return peerStoriesView.sendAsPeersObj;
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
            InstantCameraView instantCameraView = PeerStoriesView.this.instantCameraView;
            return instantCameraView != null && instantCameraView.isPaused();
        }

        @Override
        public final int measureKeyboardHeight() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$measureKeyboardHeight(this);
        }

        @Override
        public final void needChangeVideoPreviewState(int i, float f) {
            InstantCameraView instantCameraView = PeerStoriesView.this.instantCameraView;
            if (instantCameraView != null) {
                instantCameraView.changeVideoPreviewState(i, f);
            }
        }

        @Override
        public final void needSendTyping() {
        }

        @Override
        public final void needShowMediaBanHint() {
            String firstName;
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            if (peerStoriesView.isGroup) {
                peerStoriesView.showPremiumBlockedToast();
                return;
            }
            if (peerStoriesView.mediaBanTooltip == null) {
                peerStoriesView.mediaBanTooltip = new HintView(peerStoriesView.getContext(), 9, peerStoriesView.resourcesProvider);
                peerStoriesView.mediaBanTooltip.setVisibility(8);
                peerStoriesView.addView(peerStoriesView.mediaBanTooltip, LayoutHelper.createFrame(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
            }
            if (peerStoriesView.dialogId >= 0) {
                firstName = UserObject.getFirstName(MessagesController.getInstance(peerStoriesView.currentAccount).getUser(Long.valueOf(peerStoriesView.dialogId)));
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(peerStoriesView.currentAccount).getChat(Long.valueOf(-peerStoriesView.dialogId));
                firstName = chat != null ? chat.title : "";
            }
            peerStoriesView.mediaBanTooltip.setText(AndroidUtilities.replaceTags(LocaleController.formatString(peerStoriesView.chatActivityEnterView.isInVideoMode() ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, firstName)));
            peerStoriesView.mediaBanTooltip.showForView(peerStoriesView.chatActivityEnterView.getAudioVideoButtonContainer(), true);
        }

        @Override
        public final void needStartRecordAudio(int i) {
        }

        @Override
        public final void needStartRecordVideo(int i, boolean z, int i2, int i3, int i4, long j, long j2) {
            final PeerStoriesView peerStoriesView = PeerStoriesView.this;
            if (peerStoriesView.instantCameraView == null && CameraView.isCameraAllowed()) {
                peerStoriesView.instantCameraView = new InstantCameraView(peerStoriesView.getContext(), new InstantCameraView.Delegate() {
                    @Override
                    public final int getClassGuid() {
                        return PeerStoriesView.this.classGuid;
                    }

                    @Override
                    public final long getDialogId() {
                        return PeerStoriesView.this.dialogId;
                    }

                    @Override
                    public final View getFragmentView() {
                        return PeerStoriesView.this;
                    }

                    @Override
                    public final Activity getParentActivity() {
                        return AndroidUtilities.findActivity(PeerStoriesView.this.getContext());
                    }

                    @Override
                    public final boolean isInScheduleMode() {
                        return InstantCameraView.Delegate.CC.$default$isInScheduleMode(this);
                    }

                    @Override
                    public final boolean isSecretChat() {
                        return InstantCameraView.Delegate.CC.$default$isSecretChat(this);
                    }

                    @Override
                    public final void sendMedia(MediaController.PhotoEntry photoEntry, VideoEditedInfo videoEditedInfo, boolean z2, int i5, int i6, boolean z3, long j3) {
                        if (photoEntry == null) {
                            return;
                        }
                        PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                        TL_stories.StoryItem storyItem = peerStoriesView2.currentStory.storyItem;
                        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
                            return;
                        }
                        storyItem.dialogId = peerStoriesView2.dialogId;
                        if (photoEntry.isVideo) {
                            if (videoEditedInfo != null) {
                                SendMessagesHelper.prepareSendingVideo(peerStoriesView2.getAccountInstance(), photoEntry.path, videoEditedInfo, null, null, peerStoriesView2.dialogId, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z2, i5, i6, z3, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j3);
                            } else {
                                SendMessagesHelper.prepareSendingVideo(peerStoriesView2.getAccountInstance(), photoEntry.path, null, null, null, peerStoriesView2.dialogId, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z2, i5, i6, z3, photoEntry.hasSpoiler, photoEntry.caption, null, 0L, j3);
                            }
                        } else if (photoEntry.imagePath != null) {
                            SendMessagesHelper.prepareSendingPhoto(peerStoriesView2.getAccountInstance(), photoEntry.imagePath, photoEntry.thumbPath, null, peerStoriesView2.dialogId, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z2, i5, i6, z3, photoEntry.caption, null, 0L, j3);
                        } else if (photoEntry.path != null) {
                            SendMessagesHelper.prepareSendingPhoto(peerStoriesView2.getAccountInstance(), photoEntry.path, photoEntry.thumbPath, null, peerStoriesView2.dialogId, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z2, i5, i6, z3, photoEntry.caption, null, 0L, j3);
                        }
                        peerStoriesView2.afterMessageSend(j3 <= 0);
                    }
                }, peerStoriesView.resourcesProvider, false);
                peerStoriesView.addView(peerStoriesView.instantCameraView, Math.min(peerStoriesView.indexOfChild(peerStoriesView.chatActivityEnterView.getRecordCircle()), peerStoriesView.indexOfChild(peerStoriesView.chatActivityEnterView.controlsView)), LayoutHelper.createFrame(-1, -1, 51));
            }
            InstantCameraView instantCameraView = peerStoriesView.instantCameraView;
            if (instantCameraView != null) {
                if (i == 0) {
                    instantCameraView.showCamera(false);
                    return;
                }
                if (i == 1 || i == 3 || i == 4) {
                    instantCameraView.send(i, z, i2, 0, i4, j, j2);
                } else if (i == 2 || i == 5) {
                    instantCameraView.cancel(i == 2);
                }
            }
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
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            if (peerStoriesView.isRecording) {
                AndroidUtilities.runOnUIThread(new RichEditor$$ExternalSyntheticLambda48(this, j, 13), 200L);
            } else {
                peerStoriesView.afterMessageSend(j <= 0);
            }
        }

        @Override
        public final void onPreAudioVideoRecord() {
        }

        @Override
        public final void onSendLongClick() {
        }

        @Override
        public final void onStickersExpandedChange() {
            PeerStoriesView.this.requestLayout();
        }

        @Override
        public final void onStickersTab(boolean z) {
        }

        @Override
        public final void onSwitchRecordMode(boolean z) {
        }

        @Override
        public final void onTextChanged(CharSequence charSequence, boolean z, boolean z2) {
            final PeerStoriesView peerStoriesView = PeerStoriesView.this;
            if (peerStoriesView.mentionContainer == null) {
                ?? r0 = new MentionsContainerView(peerStoriesView.getContext(), peerStoriesView.dialogId, peerStoriesView.storyViewer.fragment, peerStoriesView.resourcesProvider) {
                    @Override
                    public final void drawRoundRect(Canvas canvas, Rect rect, float f) {
                        PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                        peerStoriesView2.bitmapShaderTools.setBounds(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        rectF.offset(0.0f, 0.0f);
                        canvas.drawRoundRect(rectF, f, f, peerStoriesView2.bitmapShaderTools.paint);
                        canvas.drawRoundRect(rectF, f, f, peerStoriesView2.inputBackgroundPaint);
                        if (rectF.top < getMeasuredHeight() - 1) {
                            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, peerStoriesView2.resourcesProvider.getPaint("paintDivider"));
                        }
                    }

                    @Override
                    public final boolean isStories() {
                        return true;
                    }
                };
                peerStoriesView.mentionContainer = r0;
                r0.withDelegate(peerStoriesView.new AnonymousClass22());
                peerStoriesView.addView(peerStoriesView.mentionContainer, LayoutHelper.createFrame(-1, -1, 83));
            }
            if (peerStoriesView.mentionContainer.getAdapter() != null) {
                peerStoriesView.mentionContainer.setDialogId(peerStoriesView.dialogId);
                if (peerStoriesView.currentStory.isLive) {
                    MentionsAdapter adapter = peerStoriesView.mentionContainer.getAdapter();
                    if (adapter.channelReqId == 0 && adapter.contextQueryReqid == 0 && adapter.contextUsernameReqid == 0 && adapter.lastReqId == 0) {
                        adapter.foundContextBot = null;
                        adapter.hintHashtag = null;
                        ArrayList arrayList = adapter.stickers;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        ArrayList arrayList2 = adapter.searchResultBotContext;
                        if (arrayList2 != null) {
                            arrayList2.clear();
                        }
                        adapter.searchResultBotContextSwitch = null;
                        adapter.searchResultBotWebViewSwitch = null;
                        ArrayList arrayList3 = adapter.searchResultUsernames;
                        if (arrayList3 != null) {
                            arrayList3.clear();
                        }
                        ArrayList arrayList4 = adapter.searchResultHashtags;
                        if (arrayList4 != null) {
                            arrayList4.clear();
                        }
                        ArrayList arrayList5 = adapter.searchResultCommands;
                        if (arrayList5 != null) {
                            arrayList5.clear();
                        }
                        ArrayList arrayList6 = adapter.quickReplies;
                        if (arrayList6 != null) {
                            arrayList6.clear();
                        }
                        ArrayList arrayList7 = adapter.searchResultSuggestions;
                        if (arrayList7 != null) {
                            arrayList7.clear();
                        }
                        adapter.notifyDataSetChanged();
                    }
                } else {
                    MentionsAdapter adapter2 = peerStoriesView.mentionContainer.getAdapter();
                    MessagesController.getInstance(peerStoriesView.currentAccount).getUser(Long.valueOf(peerStoriesView.dialogId));
                    TLRPC.Chat chat = MessagesController.getInstance(peerStoriesView.currentAccount).getChat(Long.valueOf(-peerStoriesView.dialogId));
                    adapter2.getClass();
                    adapter2.chat = chat;
                    peerStoriesView.mentionContainer.getAdapter().searchUsernameOrHashtag(charSequence, peerStoriesView.chatActivityEnterView.getCursorPosition(), null, false, false);
                }
            }
            peerStoriesView.invalidate();
        }

        @Override
        public final void onTextSelectionChanged(int i, int i2) {
        }

        @Override
        public final void onTextSpansChanged(CharSequence charSequence) {
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
            TLRPC.User user;
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            return (peerStoriesView.dialogId < 0 || (user = MessagesController.getInstance(peerStoriesView.currentAccount).getUser(Long.valueOf(peerStoriesView.dialogId))) == null || UserObject.isUserSelf(user) || user.bot) ? false : true;
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
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            TL_stories.StoryItem storyItem = peerStoriesView.currentStory.storyItem;
            if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
                TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
                savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) peerStoriesView.currentStory.storyItem.media).call;
                savedefaultsendas.send_as = MessagesController.getInstance(peerStoriesView.currentAccount).getInputPeer(j2);
                ConnectionsManager.getInstance(peerStoriesView.currentAccount).sendRequest(savedefaultsendas, null);
                LivePlayer livePlayer = peerStoriesView.storyViewer.livePlayer;
                if (livePlayer != null) {
                    TLRPC.Peer peer = MessagesController.getInstance(peerStoriesView.currentAccount).getPeer(j2);
                    TLRPC.GroupCall groupCall = livePlayer.call;
                    if (groupCall != null) {
                        groupCall.flags = TLObject.setFlag(groupCall.flags, 2097152, peer != null);
                        livePlayer.call.default_send_as = peer;
                    }
                }
                peerStoriesView.checkStealthMode(true);
                peerStoriesView.chatActivityEnterView.updateSendAsButton(true);
                peerStoriesView.chatActivityEnterView.checkSendButton(true);
                peerStoriesView.updatePosition(false);
            }
            return true;
        }

        @Override
        public final void toggleVideoRecordingPause() {
            InstantCameraView instantCameraView = PeerStoriesView.this.instantCameraView;
            if (instantCameraView != null) {
                instantCameraView.togglePause();
            }
        }
    }

    public final class AnonymousClass22 implements MentionsContainerView.Delegate {
        public AnonymousClass22() {
        }

        @Override
        public final void addEmojiToRecent(String str) {
            PeerStoriesView.this.chatActivityEnterView.addEmojiToRecent(str);
        }

        @Override
        public final Paint.FontMetricsInt getFontMetrics() {
            return PeerStoriesView.this.chatActivityEnterView.getEditField().getPaint().getFontMetricsInt();
        }

        @Override
        public final void onStickerSelected(TLRPC.TL_document tL_document, String str, Object obj) {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            AlertsCreator.ensurePaidMessageConfirmation(peerStoriesView.currentAccount, peerStoriesView.dialogId, 1, new GiftSheet$$ExternalSyntheticLambda23(4, this, tL_document, str, obj));
        }

        @Override
        public final void replaceText(int i, int i2, CharSequence charSequence, boolean z) {
            PeerStoriesView.this.chatActivityEnterView.replaceWithText(i, i2, charSequence, z);
        }

        @Override
        public final void sendBotInlineResult(TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            AlertsCreator.ensurePaidMessageConfirmation(peerStoriesView.currentAccount, peerStoriesView.dialogId, 1, new PeerStoriesView$22$$ExternalSyntheticLambda0(this, botInlineResult, z, i, 0));
        }
    }

    public final class AnonymousClass23 extends ChatAttachAlert {
        public final int $r8$classId = 1;
        public final NotificationCenter.NotificationCenterDelegate this$0;

        public AnonymousClass23(BusinessIntroActivity businessIntroActivity, Activity activity, BusinessIntroActivity businessIntroActivity2, Theme.ResourcesProvider resourcesProvider) {
            super(activity, businessIntroActivity2, false, false, true, resourcesProvider);
            this.this$0 = businessIntroActivity;
        }

        @Override
        public void dismissInternal() {
            switch (this.$r8$classId) {
                case 1:
                    BusinessIntroActivity businessIntroActivity = (BusinessIntroActivity) this.this$0;
                    AnonymousClass23 anonymousClass23 = businessIntroActivity.chatAttachAlert;
                    if (anonymousClass23 != null && anonymousClass23.isShowing()) {
                        AndroidUtilities.requestAdjustResize(businessIntroActivity.getParentActivity(), ((BaseFragment) businessIntroActivity).classGuid);
                    }
                    super.dismissInternal();
                    break;
                default:
                    super.dismissInternal();
                    break;
            }
        }

        @Override
        public final void onDismissAnimationStart() {
            switch (this.$r8$classId) {
                case 0:
                    PeerStoriesView peerStoriesView = (PeerStoriesView) this.this$0;
                    AnonymousClass23 anonymousClass23 = peerStoriesView.chatAttachAlert;
                    if (anonymousClass23 != null) {
                        anonymousClass23.setFocusable(false);
                    }
                    AnonymousClass19 anonymousClass19 = peerStoriesView.chatActivityEnterView;
                    if (anonymousClass19 != null && anonymousClass19.getEditField() != null) {
                        peerStoriesView.chatActivityEnterView.getEditField().requestFocus();
                        break;
                    }
                    break;
                default:
                    BusinessIntroActivity businessIntroActivity = (BusinessIntroActivity) this.this$0;
                    AnonymousClass23 anonymousClass24 = businessIntroActivity.chatAttachAlert;
                    if (anonymousClass24 != null) {
                        anonymousClass24.setFocusable(false);
                    }
                    AnonymousClass23 anonymousClass25 = businessIntroActivity.chatAttachAlert;
                    if (anonymousClass25 != null && anonymousClass25.isShowing()) {
                        AndroidUtilities.requestAdjustResize(businessIntroActivity.getParentActivity(), ((BaseFragment) businessIntroActivity).classGuid);
                        break;
                    }
                    break;
            }
        }

        public AnonymousClass23(PeerStoriesView peerStoriesView, Context context, DarkThemeResourceProvider darkThemeResourceProvider) {
            super(context, null, false, false, true, darkThemeResourceProvider);
            this.this$0 = peerStoriesView;
        }
    }

    public final class AnonymousClass29 implements RequestDelegate {
        @Override
        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        }
    }

    public final class AnonymousClass3 extends StoryMediaAreasView {
        public final StoriesViewPager.AnonymousClass2.AnonymousClass1 this$0;
        public final StoryViewer val$storyViewer;

        public AnonymousClass3(StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1, Context context, AnonymousClass4 anonymousClass4, DarkThemeResourceProvider darkThemeResourceProvider, StoryViewer storyViewer) {
            super(context, anonymousClass4, darkThemeResourceProvider);
            this.this$0 = anonymousClass1;
            this.val$storyViewer = storyViewer;
        }

        @Override
        public final Bitmap getPlayingBitmap() {
            return this.this$0.getPlayingBitmap();
        }

        @Override
        public final void onHintVisible(boolean z) {
            Delegate delegate = ((PeerStoriesView) this.this$0).delegate;
            if (delegate != null) {
                StoryViewer storyViewer = StoryViewer.this;
                storyViewer.isHintVisible = z;
                storyViewer.updatePlayingMode();
            }
        }
    }

    public final class AnonymousClass34 implements Runnable {
        public final int $r8$classId;
        public final KeyEvent.Callback this$0;

        public AnonymousClass34(KeyEvent.Callback callback, int i) {
            this.$r8$classId = i;
            this.this$0 = callback;
        }

        @Override
        public final void run() {
            int childAdapterPosition;
            switch (this.$r8$classId) {
                case 0:
                    StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = (StoriesViewPager.AnonymousClass2.AnonymousClass1) this.this$0;
                    if (anonymousClass1.isActive && anonymousClass1.allowDrawSurface) {
                        StoryViewer storyViewer = StoryViewer.this;
                        storyViewer.isSwiping = false;
                        storyViewer.updatePlayingMode();
                        break;
                    }
                    break;
                case 1:
                    PremiumFeatureBottomSheet.AnonymousClass11 anonymousClass11 = (PremiumFeatureBottomSheet.AnonymousClass11) this.this$0;
                    if (anonymousClass11.autoPlayEnabled) {
                        if (!anonymousClass11.sortedView.isEmpty() && (childAdapterPosition = anonymousClass11.getChildAdapterPosition((PremiumStickersPreviewRecycler.StickerView) zzin.m(1, anonymousClass11.sortedView))) >= 0) {
                            View viewFindViewByPosition = anonymousClass11.layoutManager.findViewByPosition(childAdapterPosition + 1);
                            if (viewFindViewByPosition != null) {
                                anonymousClass11.haptic = false;
                                anonymousClass11.drawEffectForView(viewFindViewByPosition, true);
                                anonymousClass11.smoothScrollBy(0, viewFindViewByPosition.getTop() - ((anonymousClass11.getMeasuredHeight() - viewFindViewByPosition.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                            }
                        }
                        if (anonymousClass11.autoPlayEnabled) {
                            AnonymousClass34 anonymousClass34 = anonymousClass11.autoScrollRunnable;
                            AndroidUtilities.cancelRunOnUIThread(anonymousClass34);
                            AndroidUtilities.runOnUIThread(anonymousClass34, 2700L);
                            break;
                        }
                    }
                    break;
                case 2:
                    SelectorBottomSheet selectorBottomSheet = (SelectorBottomSheet) this.this$0;
                    String str = selectorBottomSheet.query;
                    if (str != null) {
                        selectorBottomSheet.loadData(selectorBottomSheet.type, str, false);
                    }
                    break;
                case 3:
                    UserSelectorBottomSheet userSelectorBottomSheet = (UserSelectorBottomSheet) this.this$0;
                    String str2 = userSelectorBottomSheet.query;
                    if (str2 != null) {
                        userSelectorBottomSheet.search$1(str2);
                    }
                    break;
                case 4:
                    ((HwStoriesViewPager) this.this$0).touchLocked = false;
                    break;
                default:
                    StoriesVolumeControl storiesVolumeControl = (StoriesVolumeControl) this.this$0;
                    storiesVolumeControl.isVisible = false;
                    storiesVolumeControl.invalidate();
                    break;
            }
        }
    }

    public final class AnonymousClass38 implements ReactionsContainerLayout.ReactionsContainerDelegate {
        public AnonymousClass38() {
        }

        @Override
        public final boolean allowLongPress() {
            return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$allowLongPress(this);
        }

        @Override
        public final boolean drawBackground() {
            return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$drawBackground(this);
        }

        @Override
        public final void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            float f4 = -f2;
            float f5 = -f3;
            peerStoriesView.bitmapShaderTools.setBounds(f4, f5, peerStoriesView.getMeasuredWidth() + f4, peerStoriesView.getMeasuredHeight() + f5);
            if (f > 0.0f) {
                canvas.drawRoundRect(rectF, f, f, peerStoriesView.bitmapShaderTools.paint);
                canvas.drawRoundRect(rectF, f, f, peerStoriesView.inputBackgroundPaint);
            } else {
                canvas.drawRect(rectF, peerStoriesView.bitmapShaderTools.paint);
                canvas.drawRect(rectF, peerStoriesView.inputBackgroundPaint);
            }
        }

        @Override
        public final void hideMenu() {
        }

        @Override
        public final boolean needEnterText() {
            return PeerStoriesView.this.needEnterText();
        }

        @Override
        public final void onEmojiWindowDismissed() {
            StoryViewer.access$3100(StoryViewer.this, false);
        }

        @Override
        public final void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            if (z) {
                AlertsCreator.ensurePaidMessageConfirmation(peerStoriesView.currentAccount, peerStoriesView.dialogId, 1, new PeerStoriesView$38$$ExternalSyntheticLambda1(this, z, visibleReaction, view));
            } else {
                peerStoriesView.applyMessageToChat(new Theme$$ExternalSyntheticLambda14(this, view, visibleReaction, z, z2));
            }
        }
    }

    public final class AnonymousClass4 extends HwFrameLayout {
        public boolean drawOverlayed;
        public final CellFlickerDrawable loadingDrawable;
        public final AnimatedFloat loadingDrawableAlpha;
        public final AnimatedFloat loadingDrawableAlpha2;
        public final AnimatedFloat progressToAudio;
        public final AnimatedFloat progressToFullBlackoutA;
        public boolean splitDrawing;
        public final StoriesViewPager.AnonymousClass2.AnonymousClass1 this$0;
        public final SharedResources val$sharedResources;
        public final StoryViewer val$storyViewer;

        public AnonymousClass4(StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1, Context context, SharedResources sharedResources, StoryViewer storyViewer) {
            super(context);
            this.this$0 = anonymousClass1;
            this.val$sharedResources = sharedResources;
            this.val$storyViewer = storyViewer;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
            this.progressToAudio = new AnimatedFloat(this, 150L, cubicBezierInterpolator);
            this.progressToFullBlackoutA = new AnimatedFloat(this, 150L, cubicBezierInterpolator);
            this.loadingDrawable = new CellFlickerDrawable(32, 102, 240);
            AnimatedFloat animatedFloat = new AnimatedFloat(this);
            this.loadingDrawableAlpha2 = animatedFloat;
            AnimatedFloat animatedFloat2 = new AnimatedFloat(this);
            this.loadingDrawableAlpha = animatedFloat2;
            animatedFloat.setDuration(500L);
            animatedFloat2.setDuration(100L);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            float f;
            float f2;
            SharedResources sharedResources;
            ?? r15;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            EmojiAnimationsOverlay emojiAnimationsOverlay;
            boolean z;
            SelfStoriesPreviewView.ImageHolder imageHolder;
            float f8;
            ImageReceiver imageReceiver;
            boolean z2;
            AspectRatioFrameLayout aspectRatioFrameLayout;
            boolean z3;
            AnimatedFloat animatedFloat;
            AnimatedFloat animatedFloat2;
            boolean zHasNotThumb;
            StoryViewer.VideoPlayerHolder videoPlayerHolder;
            float f9;
            float f10;
            LivePlayer livePlayer;
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode;
            StoryViewer.VideoPlayerHolder videoPlayerHolder2;
            Canvas canvas2 = canvas;
            StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = this.this$0;
            if (!anonymousClass1.isActive) {
                anonymousClass1.headerView.backupImageView.getImageReceiver().setVisible(true, true);
            }
            boolean z4 = anonymousClass1.unsupported;
            AnonymousClass3 anonymousClass3 = anonymousClass1.storyAreasView;
            StoryItemHolder storyItemHolder = anonymousClass1.currentStory;
            ChatMessageCell.AnonymousClass3 anonymousClass4 = anonymousClass1.imageReceiver;
            SharedResources sharedResources2 = this.val$sharedResources;
            if (z4) {
                f = 255.0f;
                f2 = 1.0f;
                canvas2.drawColor(ColorUtils.blendARGB(0.2f, -16777216, -1));
            } else {
                VideoPlayerSharedScope videoPlayerSharedScope = anonymousClass1.playerSharedScope;
                f = 255.0f;
                if (videoPlayerSharedScope.renderView == null) {
                    if (anonymousClass3 != null) {
                        StoryMediaAreasView.AreaView areaView = anonymousClass3.selectedArea;
                        f2 = 1.0f;
                        if ((areaView != null && (areaView.scaleOnTap || areaView.supportsBounds)) || anonymousClass3.parentHighlightScaleAlpha.isInProgress()) {
                        }
                    } else {
                        f2 = 1.0f;
                    }
                    canvas2.save();
                    anonymousClass1.pinchToZoomHelper.applyTransform(canvas2);
                    aspectRatioFrameLayout = videoPlayerSharedScope.renderView;
                    if (aspectRatioFrameLayout != null || (!videoPlayerSharedScope.firstFrameRendered && videoPlayerSharedScope.livePlayer == null)) {
                        if (aspectRatioFrameLayout != null) {
                            invalidate();
                        }
                        if (storyItemHolder.skipped) {
                            canvas2.drawColor(ColorUtils.blendARGB(0.2f, -16777216, -1));
                        } else {
                            if (!anonymousClass4.hasBitmapImage()) {
                                sharedResources2.imageBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                                sharedResources2.imageBackgroundDrawable.draw(canvas2);
                            }
                            anonymousClass4.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                            anonymousClass4.draw(canvas2);
                        }
                    } else {
                        if (!anonymousClass4.hasBitmapImage()) {
                            sharedResources2.imageBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                            sharedResources2.imageBackgroundDrawable.draw(canvas2);
                        }
                        anonymousClass4.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                        anonymousClass4.draw(canvas2);
                        if (anonymousClass1.isActive) {
                            StoryViewer storyViewer = this.val$storyViewer;
                            boolean z5 = storyViewer.USE_SURFACE_VIEW;
                            if (z5 && (videoPlayerHolder2 = videoPlayerSharedScope.player) != null && videoPlayerHolder2.paused && videoPlayerHolder2.playerStubBitmap != null && videoPlayerHolder2.stubAvailable) {
                                float measuredWidth = getMeasuredWidth() / videoPlayerSharedScope.player.playerStubBitmap.getWidth();
                                float measuredHeight = getMeasuredHeight() / videoPlayerSharedScope.player.playerStubBitmap.getHeight();
                                canvas2.save();
                                canvas2.scale(measuredWidth, measuredHeight);
                                StoryViewer.VideoPlayerHolder videoPlayerHolder3 = videoPlayerSharedScope.player;
                                canvas2.drawBitmap(videoPlayerHolder3.playerStubBitmap, 0.0f, 0.0f, videoPlayerHolder3.playerStubPaint);
                                canvas2.restore();
                            } else {
                                boolean z6 = Build.VERSION.SDK_INT >= 29 && (blurredBackgroundSourceRenderNode = anonymousClass1.blurredBackgroundSourceRenderNodeWithSaturation) != null && canvas2 == blurredBackgroundSourceRenderNode.recordingCanvas;
                                if (!z5 || (anonymousClass1.allowDrawSurface && !storyViewer.isClosed && !z6)) {
                                    videoPlayerSharedScope.renderView.draw(canvas2);
                                }
                            }
                        }
                    }
                    canvas2.restore();
                    z3 = anonymousClass1.imageChanged;
                    animatedFloat = this.loadingDrawableAlpha2;
                    animatedFloat2 = this.loadingDrawableAlpha;
                    if (z3) {
                        animatedFloat.set(0.0f, true);
                        animatedFloat2.set(0.0f, true);
                    }
                    if (storyItemHolder.isLive) {
                        livePlayer = videoPlayerSharedScope.livePlayer;
                        if (livePlayer != null || (!videoPlayerSharedScope.firstFrameRendered && (livePlayer.destroyed || !livePlayer.emptyStream))) {
                            zHasNotThumb = false;
                        } else {
                            zHasNotThumb = true;
                        }
                    } else if (!storyItemHolder.isVideo) {
                        zHasNotThumb = anonymousClass4.hasNotThumb();
                    } else if (videoPlayerSharedScope.renderView != null || (videoPlayerHolder = videoPlayerSharedScope.player) == null || !videoPlayerSharedScope.firstFrameRendered || (videoPlayerHolder.progress == 0.0f && videoPlayerHolder.isBuffering() && !videoPlayerSharedScope.player.paused)) {
                        zHasNotThumb = false;
                    } else {
                        zHasNotThumb = true;
                    }
                    if (anonymousClass1.isActive || zHasNotThumb || storyItemHolder.uploadingStory != null) {
                        f9 = 0.0f;
                    } else {
                        f9 = 1.0f;
                    }
                    animatedFloat.set(f9);
                    if (animatedFloat.get() == f2) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    animatedFloat2.set(f10);
                    if (animatedFloat2.get() > 0.0f) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        int i = (int) (animatedFloat2.get() * 255.0f);
                        CellFlickerDrawable cellFlickerDrawable = this.loadingDrawable;
                        cellFlickerDrawable.paint.setAlpha(i);
                        cellFlickerDrawable.paintOutline.setAlpha(i);
                        cellFlickerDrawable.parentWidth = getMeasuredWidth() * 2;
                        cellFlickerDrawable.animationSpeedScale = 1.3f;
                        cellFlickerDrawable.draw(this, canvas2, rectF, AndroidUtilities.dp(10.0f));
                    }
                    anonymousClass1.imageChanged = false;
                } else {
                    f2 = 1.0f;
                }
                invalidate();
                canvas2.save();
                anonymousClass1.pinchToZoomHelper.applyTransform(canvas2);
                aspectRatioFrameLayout = videoPlayerSharedScope.renderView;
                if (aspectRatioFrameLayout != null) {
                    if (aspectRatioFrameLayout != null) {
                        invalidate();
                    }
                    if (storyItemHolder.skipped) {
                        canvas2.drawColor(ColorUtils.blendARGB(0.2f, -16777216, -1));
                    } else {
                        if (!anonymousClass4.hasBitmapImage()) {
                            sharedResources2.imageBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                            sharedResources2.imageBackgroundDrawable.draw(canvas2);
                        }
                        anonymousClass4.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                        anonymousClass4.draw(canvas2);
                    }
                } else {
                    if (aspectRatioFrameLayout != null) {
                        invalidate();
                    }
                    if (storyItemHolder.skipped) {
                        canvas2.drawColor(ColorUtils.blendARGB(0.2f, -16777216, -1));
                    } else {
                        if (!anonymousClass4.hasBitmapImage()) {
                            sharedResources2.imageBackgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight() + 1);
                            sharedResources2.imageBackgroundDrawable.draw(canvas2);
                        }
                        anonymousClass4.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() + 1);
                        anonymousClass4.draw(canvas2);
                    }
                }
                canvas2.restore();
                z3 = anonymousClass1.imageChanged;
                animatedFloat = this.loadingDrawableAlpha2;
                animatedFloat2 = this.loadingDrawableAlpha;
                if (z3) {
                    animatedFloat.set(0.0f, true);
                    animatedFloat2.set(0.0f, true);
                }
                if (storyItemHolder.isLive) {
                    livePlayer = videoPlayerSharedScope.livePlayer;
                    if (livePlayer != null) {
                    }
                    zHasNotThumb = false;
                } else if (!storyItemHolder.isVideo) {
                    if (videoPlayerSharedScope.renderView != null) {
                    }
                    zHasNotThumb = false;
                } else {
                    zHasNotThumb = anonymousClass4.hasNotThumb();
                }
                if (anonymousClass1.isActive) {
                    f9 = 0.0f;
                } else {
                    f9 = 0.0f;
                }
                animatedFloat.set(f9);
                if (animatedFloat.get() == f2) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                animatedFloat2.set(f10);
                if (animatedFloat2.get() > 0.0f) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    int i2 = (int) (animatedFloat2.get() * 255.0f);
                    CellFlickerDrawable cellFlickerDrawable2 = this.loadingDrawable;
                    cellFlickerDrawable2.paint.setAlpha(i2);
                    cellFlickerDrawable2.paintOutline.setAlpha(i2);
                    cellFlickerDrawable2.parentWidth = getMeasuredWidth() * 2;
                    cellFlickerDrawable2.animationSpeedScale = 1.3f;
                    cellFlickerDrawable2.draw(this, canvas2, rectF2, AndroidUtilities.dp(10.0f));
                }
                anonymousClass1.imageChanged = false;
            }
            AnonymousClass5 anonymousClass5 = anonymousClass1.storyCaptionView;
            if (anonymousClass5.getAlpha() > 0.0f) {
                if (anonymousClass5.getAlpha() == f2) {
                    canvas2.save();
                    sharedResources = sharedResources2;
                    z2 = false;
                    f3 = 0.0f;
                } else {
                    f3 = 0.0f;
                    sharedResources = sharedResources2;
                    z2 = false;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, anonymousClass5.getMeasuredWidth(), anonymousClass5.getMeasuredHeight(), (int) (anonymousClass5.getAlpha() * f), 31);
                }
                anonymousClass3.draw(canvas2);
                canvas2.restore();
                r15 = z2;
            } else {
                sharedResources = sharedResources2;
                r15 = 0;
                f3 = 0.0f;
            }
            if (!anonymousClass1.lastNoThumb && anonymousClass4.hasNotThumb()) {
                anonymousClass1.lastNoThumb = true;
                anonymousClass1.invalidate();
            }
            float hideInterfaceAlpha = anonymousClass1.getHideInterfaceAlpha();
            sharedResources.topOverlayGradient.setAlpha(255);
            sharedResources.topOverlayGradient.draw(canvas2);
            if (anonymousClass1.isSelf || !anonymousClass1.BIG_SCREEN || anonymousClass5.getVisibility() == 0) {
                int visibility = anonymousClass5.getVisibility();
                Drawable drawable = sharedResources.bottomOverlayGradient;
                if (visibility == 0) {
                    int iDp = AndroidUtilities.dp(72.0f);
                    int top = anonymousClass5.getTop() + ((int) (anonymousClass5.getTextTop() - AndroidUtilities.dp(24.0f)));
                    int i3 = iDp + top;
                    float measuredHeight2 = getMeasuredHeight() * 0.65f;
                    f4 = 24.0f;
                    if ((measuredHeight2 - top) / AndroidUtilities.dp(60.0f) <= f3 || !anonymousClass5.touched || anonymousClass5.captionContainer.getBottom() - anonymousClass5.getMeasuredHeight() <= 0) {
                        if (anonymousClass1.checkBlackoutMode) {
                            anonymousClass1.checkBlackoutMode = r15;
                            if ((measuredHeight2 - (anonymousClass5.getTop() + ((int) (anonymousClass5.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > f3) {
                                anonymousClass1.inBlackoutMode = true;
                            }
                        } else if (anonymousClass5.getProgressToBlackout() == f3) {
                            anonymousClass1.inBlackoutMode = r15;
                        }
                    } else if ((measuredHeight2 - (anonymousClass5.getTop() + ((int) (anonymousClass5.getMaxTop() - AndroidUtilities.dp(24.0f))))) / AndroidUtilities.dp(60.0f) > f3) {
                        anonymousClass1.inBlackoutMode = true;
                    }
                    float f11 = this.progressToFullBlackoutA.set(anonymousClass1.inBlackoutMode ? 1.0f : 0.0f);
                    Paint paint = sharedResources.gradientBackgroundPaint;
                    if (f11 > f3) {
                        this.splitDrawing = true;
                        this.drawOverlayed = r15;
                        super.dispatchDraw(canvas);
                        this.splitDrawing = r15;
                        drawLines(canvas);
                        paint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (153.0f * f11 * hideInterfaceAlpha)));
                        canvas2.drawPaint(paint);
                    }
                    if (f11 < f2 && !storyItemHolder.isLive) {
                        canvas2.save();
                        float f12 = f2 - f11;
                        paint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) (129.03f * f12 * hideInterfaceAlpha)));
                        drawable.setAlpha((int) (f12 * f * hideInterfaceAlpha));
                        drawable.setBounds(r15, top, getMeasuredWidth(), i3);
                        drawable.draw(canvas2);
                        canvas2.drawRect(0.0f, i3, getMeasuredWidth(), getMeasuredHeight(), paint);
                        canvas.restore();
                    }
                    if (f11 <= f3 || anonymousClass5.getAlpha() <= f3) {
                        canvas2 = canvas;
                    } else {
                        if (anonymousClass5.disableDraw) {
                            anonymousClass5.disableDraw = r15;
                            anonymousClass5.invalidate();
                        }
                        if (anonymousClass5.getAlpha() != f2) {
                            canvas2 = canvas;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (anonymousClass5.getAlpha() * f), 31);
                        } else {
                            canvas2 = canvas;
                            canvas2.save();
                        }
                        canvas2.translate(anonymousClass5.getX(), anonymousClass5.getY() - anonymousClass5.getScrollY());
                        anonymousClass5.draw(canvas2);
                        canvas2.restore();
                    }
                    boolean z7 = f11 > f3;
                    if (anonymousClass5.disableDraw != z7) {
                        anonymousClass5.disableDraw = z7;
                        anonymousClass5.invalidate();
                    }
                    if (f11 > f3) {
                        this.splitDrawing = true;
                        this.drawOverlayed = true;
                        super.dispatchDraw(canvas);
                        this.splitDrawing = r15;
                    }
                    f5 = f11;
                } else {
                    f4 = 24.0f;
                    if (!storyItemHolder.isLive) {
                        int iDp2 = AndroidUtilities.dp(anonymousClass1.BIG_SCREEN ? 56.0f : 110.0f);
                        if ((anonymousClass1.isSelf || !anonymousClass1.BIG_SCREEN) && anonymousClass5.getVisibility() == 0) {
                            iDp2 = (int) (iDp2 * 2.5f);
                        }
                        AnonymousClass4 anonymousClass6 = anonymousClass1.storyContainer;
                        drawable.setBounds(r15, anonymousClass6.getMeasuredHeight() - iDp2, getMeasuredWidth(), anonymousClass6.getMeasuredHeight());
                        drawable.setAlpha((int) (hideInterfaceAlpha * f));
                        drawable.draw(canvas2);
                    }
                }
                f6 = anonymousClass1.viewsThumbAlpha;
                if (f6 != f3 && (imageHolder = anonymousClass1.viewsThumbImageReceiver) != null) {
                    f8 = anonymousClass1.viewsThumbScale;
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight() + 1;
                    imageReceiver = imageHolder.receiver;
                    float f13 = (float) r15;
                    imageReceiver.setImageCoords(f13, f13, measuredWidth2, measuredHeight3);
                    imageReceiver.setAlpha(f6);
                    imageReceiver.draw(canvas2);
                    imageReceiver.setAlpha(1.0f);
                    if (imageHolder.layout != null) {
                        int i4 = (int) (f6 * f);
                        imageHolder.paint.setAlpha(i4);
                        SelfStoriesPreviewView selfStoriesPreviewView = SelfStoriesPreviewView.this;
                        GradientDrawable gradientDrawable = selfStoriesPreviewView.gradientDrawable;
                        gradientDrawable.setAlpha(i4);
                        gradientDrawable.setBounds((int) imageReceiver.getImageX(), (int) (imageReceiver.getImageY2() - (AndroidUtilities.dp(f4) * f8)), (int) imageReceiver.getImageX2(), ((int) imageReceiver.getImageY2()) + 2);
                        gradientDrawable.draw(canvas2);
                        canvas2.save();
                        canvas2.scale(f8, f8, imageReceiver.getCenterX(), imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f8));
                        canvas2.translate(imageReceiver.getCenterX() - (selfStoriesPreviewView.textWidth / 2.0f), (imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f8)) - imageHolder.layout.getHeight());
                        imageHolder.layout.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (anonymousClass1.isRecording) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                this.progressToAudio.set(f7);
                if (anonymousClass1.isActive) {
                    if (anonymousClass5.getVisibility() == 0 || !(anonymousClass1.inBlackoutMode || anonymousClass5.touched)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    anonymousClass1.isCaptionPartVisible = anonymousClass5.getVisibility() != 0 && anonymousClass5.getProgressToBlackout() > f3;
                    StoryViewer storyViewer2 = StoryViewer.this;
                    storyViewer2.isCaption = z;
                    storyViewer2.updatePlayingMode();
                    StoryViewer.this.isCaptionPartVisible = anonymousClass1.isCaptionPartVisible;
                }
                if (f5 <= f3) {
                    super.dispatchDraw(canvas);
                    drawLines(canvas);
                }
                emojiAnimationsOverlay = anonymousClass1.emojiAnimationsOverlay;
                if (emojiAnimationsOverlay != null) {
                    emojiAnimationsOverlay.draw(canvas2);
                }
            }
            f4 = 24.0f;
            f5 = 0.0f;
            f6 = anonymousClass1.viewsThumbAlpha;
            if (f6 != f3) {
                f8 = anonymousClass1.viewsThumbScale;
                int measuredWidth3 = getMeasuredWidth();
                int measuredHeight4 = getMeasuredHeight() + 1;
                imageReceiver = imageHolder.receiver;
                float f14 = (float) r15;
                imageReceiver.setImageCoords(f14, f14, measuredWidth3, measuredHeight4);
                imageReceiver.setAlpha(f6);
                imageReceiver.draw(canvas2);
                imageReceiver.setAlpha(1.0f);
                if (imageHolder.layout != null) {
                    int i5 = (int) (f6 * f);
                    imageHolder.paint.setAlpha(i5);
                    SelfStoriesPreviewView selfStoriesPreviewView2 = SelfStoriesPreviewView.this;
                    GradientDrawable gradientDrawable2 = selfStoriesPreviewView2.gradientDrawable;
                    gradientDrawable2.setAlpha(i5);
                    gradientDrawable2.setBounds((int) imageReceiver.getImageX(), (int) (imageReceiver.getImageY2() - (AndroidUtilities.dp(f4) * f8)), (int) imageReceiver.getImageX2(), ((int) imageReceiver.getImageY2()) + 2);
                    gradientDrawable2.draw(canvas2);
                    canvas2.save();
                    canvas2.scale(f8, f8, imageReceiver.getCenterX(), imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f8));
                    canvas2.translate(imageReceiver.getCenterX() - (selfStoriesPreviewView2.textWidth / 2.0f), (imageReceiver.getImageY2() - (AndroidUtilities.dp(8.0f) * f8)) - imageHolder.layout.getHeight());
                    imageHolder.layout.draw(canvas2);
                    canvas2.restore();
                }
            }
            if (anonymousClass1.isRecording) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.progressToAudio.set(f7);
            if (anonymousClass1.isActive) {
                if (anonymousClass5.getVisibility() == 0) {
                    z = false;
                } else {
                    z = false;
                }
                anonymousClass1.isCaptionPartVisible = anonymousClass5.getVisibility() != 0 && anonymousClass5.getProgressToBlackout() > f3;
                StoryViewer storyViewer3 = StoryViewer.this;
                storyViewer3.isCaption = z;
                storyViewer3.updatePlayingMode();
                StoryViewer.this.isCaptionPartVisible = anonymousClass1.isCaptionPartVisible;
            }
            if (f5 <= f3) {
                super.dispatchDraw(canvas);
                drawLines(canvas);
            }
            emojiAnimationsOverlay = anonymousClass1.emojiAnimationsOverlay;
            if (emojiAnimationsOverlay != null) {
                emojiAnimationsOverlay.draw(canvas2);
            }
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            VideoPlayerSharedScope videoPlayerSharedScope;
            AspectRatioFrameLayout aspectRatioFrameLayout;
            LivePlayer livePlayer;
            StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = this.this$0;
            if (!anonymousClass1.isActive || anonymousClass1.unsupported || (aspectRatioFrameLayout = (videoPlayerSharedScope = anonymousClass1.playerSharedScope).renderView) == null || (livePlayer = videoPlayerSharedScope.livePlayer) == null || livePlayer.destroyed || !livePlayer.emptyStream || !aspectRatioFrameLayout.dispatchTouchEvent(motionEvent)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            return true;
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            if (view == this.this$0.storyAreasView) {
                return true;
            }
            if (!this.splitDrawing) {
                return super.drawChild(canvas, view, j);
            }
            if (Bulletin.getVisibleBulletin() == null || view != Bulletin.getVisibleBulletin().getLayout()) {
                return super.drawChild(canvas, view, j);
            }
            if (this.drawOverlayed) {
                return super.drawChild(canvas, view, j);
            }
            return true;
        }

        public final void drawLines(Canvas canvas) {
            TL_stories.StoryItem storyItem;
            StoriesController.StoriesList storiesList;
            TL_stories.StoryItem storyItem2;
            int i;
            TLRPC.UserFull userFull;
            float fClamp;
            float f;
            float f2;
            float f3;
            float f4;
            int iDp;
            int i2;
            float f5;
            int i3;
            float f6;
            Paint paint;
            int i4;
            StoryViewer.VideoPlayerHolder videoPlayerHolder;
            StoryViewer.VideoPlayerHolder videoPlayerHolder2;
            StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = this.this$0;
            ChatMessageCell.AnonymousClass3 anonymousClass3 = anonymousClass1.imageReceiver;
            boolean zHasNotThumb = anonymousClass3.hasNotThumb();
            VideoPlayerSharedScope videoPlayerSharedScope = anonymousClass1.playerSharedScope;
            StoryItemHolder storyItemHolder = anonymousClass1.currentStory;
            if (zHasNotThumb || ((storyItemHolder.isVideo && videoPlayerSharedScope.firstFrameRendered) || (storyItemHolder.isLive && videoPlayerSharedScope.firstFrameRendered))) {
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = storyItemHolder.this$0;
                TL_stories.PeerStories peerStories = anonymousClass2.userStories;
                if (peerStories == null) {
                    peerStories = (TL_stories.PeerStories) anonymousClass2.storiesController.allStoriesMap.get(anonymousClass2.dialogId);
                    if (peerStories == null && (userFull = MessagesController.getInstance(anonymousClass2.currentAccount).getUserFull(anonymousClass2.dialogId)) != null) {
                        peerStories = userFull.stories;
                    }
                }
                boolean z = anonymousClass2.isActive;
                StoryViewer storyViewer = anonymousClass2.storyViewer;
                if (z && (storyItem2 = storyItemHolder.storyItem) != null && peerStories != null) {
                    GradientTools[] gradientToolsArr = StoriesUtilities.storiesGradientTools;
                    if ((ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() <= storyItem2.expire_date + 86400 && ((i = storyItemHolder.storyItem.id) > peerStories.max_read_id || i > anonymousClass2.storiesController.dialogIdToMaxReadId.get(anonymousClass2.dialogId, 0))) || anonymousClass2.isSelf) {
                        TL_stories.PeerStories peerStories2 = storyViewer.overrideUserStories;
                        if (peerStories2 == null) {
                            StoriesController storiesController = anonymousClass2.storiesController;
                            long j = anonymousClass2.dialogId;
                            TL_stories.StoryItem storyItem3 = storyItemHolder.storyItem;
                            TL_stories.PeerStories storiesFromFullPeer = (TL_stories.PeerStories) storiesController.allStoriesMap.get(j);
                            if (storiesFromFullPeer == null) {
                                storiesFromFullPeer = storiesController.getStoriesFromFullPeer(j);
                            }
                            if (storiesController.markStoryAsRead(storiesFromFullPeer, storyItem3, false)) {
                                storyViewer.unreadStateChanged = true;
                            }
                        } else if (anonymousClass2.storiesController.markStoryAsRead(peerStories2, storyItemHolder.storyItem, true)) {
                            storyViewer.unreadStateChanged = true;
                        }
                    } else if (anonymousClass2.isActive) {
                        storyViewer.unreadStateChanged = true;
                    }
                } else if (anonymousClass2.isActive && (storyItem = storyItemHolder.storyItem) != null && (storiesList = storyViewer.storiesList) != null && storiesList.markAsRead(storyItem.id)) {
                    storyViewer.unreadStateChanged = true;
                }
            }
            float hideInterfaceAlpha = anonymousClass1.getHideInterfaceAlpha();
            boolean z2 = storyItemHolder.isVideo;
            AnonymousClass3 anonymousClass4 = anonymousClass1.storyAreasView;
            if (z2) {
                StoryViewer.VideoPlayerHolder videoPlayerHolder3 = videoPlayerSharedScope.player;
                if (videoPlayerHolder3 != null) {
                    fClamp = Utilities.clamp(videoPlayerHolder3.getPlaybackProgress(anonymousClass1.videoDuration), 1.0f, 0.0f);
                    if (videoPlayerSharedScope.firstFrameRendered && anonymousClass4 != null) {
                        anonymousClass4.shine();
                    }
                } else {
                    fClamp = 0.0f;
                }
                invalidate();
            } else if (((PeerStoriesView) anonymousClass1).paused || !anonymousClass1.isActive || anonymousClass1.isUploading || anonymousClass1.isEditing || anonymousClass1.isFailed || !anonymousClass3.hasNotThumb()) {
                fClamp = Utilities.clamp(anonymousClass1.currentImageTime / 10000.0f, 1.0f, 0.0f);
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j2 = anonymousClass1.lastDrawTime;
                if (j2 != 0 && !anonymousClass1.isCaptionPartVisible) {
                    if (anonymousClass1.currentImageTime <= 0 && jCurrentTimeMillis - j2 > 0 && anonymousClass4 != null) {
                        anonymousClass4.shine();
                    }
                    anonymousClass1.currentImageTime += jCurrentTimeMillis - anonymousClass1.lastDrawTime;
                }
                anonymousClass1.lastDrawTime = jCurrentTimeMillis;
                fClamp = Utilities.clamp(anonymousClass1.currentImageTime / 10000.0f, 1.0f, 0.0f);
                invalidate();
            }
            float f7 = fClamp;
            if (videoPlayerSharedScope == null || (videoPlayerHolder2 = videoPlayerSharedScope.player) == null) {
                f = f7;
            } else {
                float f8 = videoPlayerHolder2.currentSeek;
                if (f8 >= 0.0f) {
                    f = f8;
                } else {
                    f = f7;
                }
            }
            if (!anonymousClass1.switchEventSent && f7 == 1.0f && ((!storyItemHolder.isVideo || !anonymousClass1.isCaptionPartVisible) && !anonymousClass1.isLongPressed)) {
                anonymousClass1.switchEventSent = true;
                post(new BalanceCloud$$ExternalSyntheticLambda1(this, 25));
            }
            StoryViewer storyViewer2 = this.val$storyViewer;
            StoriesController.StoriesList storiesList2 = storyViewer2.storiesList;
            float f9 = anonymousClass1.alpha;
            if (storiesList2 == null || storiesList2.type == 3) {
                f2 = 1.0f;
                f3 = 8.0f;
                f4 = 4.0f;
            } else {
                if (anonymousClass1.storyPositionView == null) {
                    anonymousClass1.storyPositionView = new StoryPositionView();
                }
                StoryPositionView storyPositionView = anonymousClass1.storyPositionView;
                float f10 = hideInterfaceAlpha * f9 * (1.0f - anonymousClass1.outT);
                int i5 = anonymousClass1.listPosition;
                f2 = 1.0f;
                int count = storyViewer2.storiesList.getCount();
                f4 = 4.0f;
                int i6 = (count << 12) + i5;
                f3 = 8.0f;
                int i7 = storyPositionView.lastHash;
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = storyPositionView.textDrawable;
                if (i7 != i6) {
                    storyPositionView.lastHash = i6;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) String.valueOf(i5 + 1)).append((CharSequence) storyPositionView.leftSpace).append((CharSequence) "/").append((CharSequence) storyPositionView.rightSpace).append((CharSequence) String.valueOf(count));
                    animatedTextDrawable.setText(spannableStringBuilder, false);
                }
                canvas.save();
                PeerHeaderView peerHeaderView = anonymousClass1.headerView;
                float y = peerHeaderView.getY();
                UserCell2.AnonymousClass1 anonymousClass5 = peerHeaderView.titleView;
                float height = ((animatedTextDrawable.getHeight() / 2.0f) + (y + anonymousClass5.getTop())) - 1.0f;
                int currentWidth = (int) animatedTextDrawable.getCurrentWidth();
                anonymousClass5.setRightPadding(currentWidth);
                canvas.translate((anonymousClass5.getRightDrawableWidth() + (anonymousClass5.getTextWidth() + (anonymousClass5.getLeft() + (peerHeaderView.getLeft() + AndroidUtilities.dp(4.0f))))) - Utilities.clamp(((anonymousClass5.getRightDrawableWidth() + anonymousClass5.getTextWidth()) + currentWidth) - anonymousClass5.getWidth(), currentWidth, 0), height);
                float fDp = AndroidUtilities.dp(8.0f);
                float fDp2 = AndroidUtilities.dp(2.0f);
                AndroidUtilities.rectTmp.set(-fDp, -fDp2, animatedTextDrawable.getCurrentWidth() + fDp, animatedTextDrawable.getHeight() + fDp2);
                animatedTextDrawable.setAlpha((int) (f10 * 160.0f));
                animatedTextDrawable.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            canvas.translate(0.0f, AndroidUtilities.dp(f3) - (AndroidUtilities.dp(f3) * anonymousClass1.outT));
            boolean z3 = storyItemHolder.isVideo && (videoPlayerHolder = videoPlayerSharedScope.player) != null && videoPlayerHolder.isBuffering();
            boolean z4 = anonymousClass1.isLongPressed;
            boolean z5 = z4 && storyItemHolder != null && storyItemHolder.isVideo && storyViewer2.inSeekingMode;
            float f11 = anonymousClass1.linesAlpha.set(!z4 || z5);
            int measuredWidth = getMeasuredWidth();
            int i8 = anonymousClass1.linesPosition;
            int i9 = anonymousClass1.linesCount;
            float f12 = (f2 - anonymousClass1.outT) * f9;
            StoryLinesDrawable storyLinesDrawable = anonymousClass1.storyLines;
            storyLinesDrawable.getClass();
            if (i9 > 0) {
                boolean z6 = z3 && !z5;
                if (storyLinesDrawable.lastPosition != i8) {
                    storyLinesDrawable.bufferingProgress = 0.0f;
                    storyLinesDrawable.incrementBuffering = true;
                }
                storyLinesDrawable.lastPosition = i8;
                SharedResources sharedResources = storyLinesDrawable.sharedResources;
                Paint paint2 = sharedResources.barPaint;
                Paint paint3 = sharedResources.selectedBarPaint;
                if (i9 > 100) {
                    iDp = 1;
                } else {
                    iDp = i9 >= 50 ? AndroidUtilities.dp(f2) : AndroidUtilities.dp(2.0f);
                }
                float fDp3 = ((measuredWidth - AndroidUtilities.dp(10.0f)) - ((i9 - 1) * iDp)) / i9;
                AndroidUtilities.dp(5.0f);
                float fMin = Math.min(fDp3 / 2.0f, AndroidUtilities.dp(f2));
                float f13 = storyLinesDrawable.zoomT.set(z5);
                if (f13 > 0.0f) {
                    float fLerp = AndroidUtilities.lerp(f7, f, f13);
                    canvas.save();
                    TextPaint textPaint = storyLinesDrawable.zoomHintPaint;
                    textPaint.setAlpha((int) (f13 * 255.0f));
                    textPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(f2), Theme.multAlpha(f13, 805306368));
                    canvas.translate(((measuredWidth - storyLinesDrawable.zoomHintLayoutWidth) / 2.0f) - storyLinesDrawable.zoomHintLayoutLeft, AndroidUtilities.lerp(AndroidUtilities.dp(f4), AndroidUtilities.dp(16.0f), f13));
                    storyLinesDrawable.zoomHintLayout.draw(canvas);
                    canvas.restore();
                    f7 = fLerp;
                }
                int i10 = 0;
                while (i10 < i9) {
                    float fDp4 = AndroidUtilities.dp(5.0f) + (-0.0f) + (iDp * i10) + (i10 * fDp3);
                    if (fDp4 <= measuredWidth) {
                        float f14 = fDp4 + fDp3;
                        if (f14 < 0.0f) {
                            fMin = fMin;
                            storyLinesDrawable = storyLinesDrawable;
                            i2 = measuredWidth;
                            f5 = f7;
                        } else if (f12 <= 0.0f) {
                            fMin = fMin;
                            storyLinesDrawable = storyLinesDrawable;
                            i2 = measuredWidth;
                            f5 = f7;
                            i9 = i9;
                            i3 = 1;
                        } else {
                            float fLerp2 = AndroidUtilities.lerp(fMin, AndroidUtilities.dpf2(2.0f), f13);
                            if (i10 > i8 || i10 != i8) {
                                storyLinesDrawable = storyLinesDrawable;
                                i2 = measuredWidth;
                                f5 = f7;
                                f6 = 1.0f;
                            } else {
                                RectF rectF = AndroidUtilities.rectTmp;
                                i2 = measuredWidth;
                                f5 = f7;
                                rectF.set(fDp4, 0.0f, f14, AndroidUtilities.lerp(AndroidUtilities.dpf2(2.0f), AndroidUtilities.dpf2(5.0f), (i8 == i10 ? 1 : 0) * f13));
                                if (z6) {
                                    if (storyLinesDrawable.incrementBuffering) {
                                        float f15 = storyLinesDrawable.bufferingProgress + 0.026666667f;
                                        storyLinesDrawable.bufferingProgress = f15;
                                        if (f15 > 0.5f) {
                                            storyLinesDrawable.incrementBuffering = false;
                                        }
                                    } else {
                                        float f16 = storyLinesDrawable.bufferingProgress - 0.026666667f;
                                        storyLinesDrawable.bufferingProgress = f16;
                                        if (f16 < -0.5f) {
                                            storyLinesDrawable.incrementBuffering = true;
                                        }
                                    }
                                    i4 = (int) (storyLinesDrawable.bufferingProgress * 51.0f * f12 * f11);
                                } else {
                                    i4 = 0;
                                }
                                paint2.setAlpha(((int) (85.0f * f12 * f11)) + i4);
                                if (f13 > 0.0f) {
                                    int i11 = i10 - i8;
                                    rectF.left = Utilities.clamp(AndroidUtilities.lerp(rectF.left, AndroidUtilities.dp(5.0f) + (i11 * i2), f13), i2 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                                    rectF.right = Utilities.clamp(AndroidUtilities.lerp(rectF.right, ((i11 + 1) * i2) - AndroidUtilities.dp(5.0f), f13), i2 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                                }
                                canvas.drawRoundRect(rectF, r30, r30, paint2);
                                f6 = f5;
                            }
                            RectF rectF2 = AndroidUtilities.rectTmp;
                            rectF2.set(fDp4, 0.0f, f14, AndroidUtilities.lerp(AndroidUtilities.dpf2(2.0f), AndroidUtilities.dpf2(5.0f), (i8 == i10 ? 1 : 0) * f13));
                            if (f13 > 0.0f) {
                                int i12 = i10 - i8;
                                rectF2.left = Utilities.clamp(AndroidUtilities.lerp(rectF2.left, AndroidUtilities.dp(5.0f) + (i12 * i2), f13), i2 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                                rectF2.right = Utilities.clamp(AndroidUtilities.lerp(rectF2.right, ((i12 + 1) * i2) - AndroidUtilities.dp(5.0f), f13), i2 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
                            }
                            rectF2.right = AndroidUtilities.lerp(rectF2.left, rectF2.right, f6);
                            if (i10 <= i8) {
                                paint3.setAlpha((int) (f12 * 255.0f * f11));
                                paint = paint3;
                            } else {
                                paint2.setAlpha((int) (85 * f12 * f11));
                                paint = paint2;
                            }
                            canvas.drawRoundRect(rectF2, fLerp2, fLerp2, paint);
                        }
                        i3 = 1;
                    } else {
                        fMin = fMin;
                        storyLinesDrawable = storyLinesDrawable;
                        i2 = measuredWidth;
                        f5 = f7;
                        i3 = 1;
                    }
                    i10 += i3;
                    i9 = i9;
                    fMin = fMin;
                    measuredWidth = i2;
                    f7 = f5;
                    storyLinesDrawable = storyLinesDrawable;
                }
            }
            canvas.restore();
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.this$0.emojiAnimationsOverlay.onAttachedToWindow();
            Bulletin.addDelegate(this, new Bulletin.Delegate() {
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
                    return i == 1 || i == 2 || i == 3;
                }

                @Override
                public final int getBottomOffset(int i) {
                    if (AnonymousClass4.this.this$0.BIG_SCREEN) {
                        return 0;
                    }
                    return AndroidUtilities.dp(64.0f);
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
                    return AndroidUtilities.dp(58.0f);
                }

                @Override
                public final void onBottomOffsetChange(float f) {
                    Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
                }

                @Override
                public final void onHide(Bulletin bulletin) {
                    Delegate delegate;
                    if (bulletin == null || bulletin.tag != 2 || (delegate = ((PeerStoriesView) AnonymousClass4.this.this$0).delegate) == null) {
                        return;
                    }
                    StoryViewer storyViewer = StoryViewer.this;
                    storyViewer.isBulletinVisible = false;
                    storyViewer.updatePlayingMode();
                }

                @Override
                public final void onShow(Bulletin bulletin) {
                    Delegate delegate;
                    if (bulletin == null || bulletin.tag != 2 || (delegate = ((PeerStoriesView) AnonymousClass4.this.this$0).delegate) == null) {
                        return;
                    }
                    StoryViewer storyViewer = StoryViewer.this;
                    storyViewer.isBulletinVisible = true;
                    storyViewer.updatePlayingMode();
                }
            });
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = this.this$0;
            anonymousClass1.emojiAnimationsOverlay.onDetachedFromWindow();
            Bulletin.removeDelegate(this);
            Delegate delegate = ((PeerStoriesView) anonymousClass1).delegate;
            if (delegate != null) {
                StoryViewer storyViewer = StoryViewer.this;
                storyViewer.isBulletinVisible = false;
                storyViewer.updatePlayingMode();
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.this$0.muteIconContainer.getLayoutParams();
            layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
            layoutParams.topMargin = AndroidUtilities.dp(15.0f);
            super.onMeasure(i, i2);
        }
    }

    public final class AnonymousClass40 implements ReactionsContainerLayout.ReactionsContainerDelegate {
        public final StoriesViewPager.AnonymousClass2.AnonymousClass1 this$0;

        public final class AnonymousClass2 extends AnimatorListenerAdapter {
            public final int $r8$classId;
            public final Object this$1;
            public final Cloneable val$effectStarted;
            public final View val$storiesLikeButtonFinal;

            public AnonymousClass2(Object obj, Cloneable cloneable, View view, int i) {
                this.$r8$classId = i;
                this.this$1 = obj;
                this.val$effectStarted = cloneable;
                this.val$storiesLikeButtonFinal = view;
            }

            @Override
            public final void onAnimationEnd(Animator animator) {
                switch (this.$r8$classId) {
                    case 0:
                        StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = ((AnonymousClass40) this.this$1).this$0;
                        anonymousClass1.movingReaction = false;
                        anonymousClass1.movingReactionProgress = 1.0f;
                        anonymousClass1.invalidate();
                        boolean[] zArr = (boolean[]) this.val$effectStarted;
                        if (!zArr[0]) {
                            zArr[0] = true;
                            anonymousClass1.drawReactionEffect = true;
                            try {
                                anonymousClass1.performHapticFeedback(3);
                                break;
                            } catch (Exception unused) {
                            }
                        }
                        StoriesLikeButton storiesLikeButton = (StoriesLikeButton) this.val$storiesLikeButtonFinal;
                        storiesLikeButton.setAllowDrawReaction(true);
                        storiesLikeButton.drawAnimateImageReciever = true;
                        ImageReceiver imageReceiver = storiesLikeButton.animateReactionImageReceiver;
                        if (imageReceiver.getLottieAnimation() != null) {
                            imageReceiver.getLottieAnimation().setCurrentFrame(0, false, true);
                        }
                        AnimatedEmojiDrawable animatedEmojiDrawable = anonymousClass1.reactionMoveDrawable;
                        if (animatedEmojiDrawable != null) {
                            animatedEmojiDrawable.removeView(anonymousClass1);
                            anonymousClass1.reactionMoveDrawable = null;
                        }
                        break;
                    default:
                        ((ActionBarPopupWindow.ActionBarPopupWindowLayout) this.this$1).itemAnimators.remove((AnimatorSet) this.val$effectStarted);
                        View view = this.val$storiesLikeButtonFinal;
                        if (view instanceof ActionBarMenuSubItem) {
                            ((ActionBarMenuSubItem) view).onItemShown();
                        }
                        break;
                }
            }
        }

        public AnonymousClass40(StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1) {
            this.this$0 = anonymousClass1;
        }

        @Override
        public final boolean allowLongPress() {
            return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$allowLongPress(this);
        }

        @Override
        public final boolean drawBackground() {
            return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$drawBackground(this);
        }

        @Override
        public final void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
            ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$drawRoundRect(this, canvas, rectF, f, f2, f3, i, z);
        }

        @Override
        public final void hideMenu() {
            ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$hideMenu(this);
        }

        @Override
        public final boolean needEnterText() {
            StoryViewer.access$3100(StoryViewer.this, false);
            return false;
        }

        @Override
        public final void onEmojiWindowDismissed() {
            ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$onEmojiWindowDismissed(this);
        }

        @Override
        public final void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
            StarGiftSheet$$ExternalSyntheticLambda66 starGiftSheet$$ExternalSyntheticLambda66 = new StarGiftSheet$$ExternalSyntheticLambda66(this, visibleReaction, view, 26);
            if (z) {
                starGiftSheet$$ExternalSyntheticLambda66.run();
            } else {
                this.this$0.applyMessageToChat(starGiftSheet$$ExternalSyntheticLambda66);
            }
        }
    }

    public final class AnonymousClass5 extends StoryCaptionView {
        public final StoriesViewPager.AnonymousClass2.AnonymousClass1 this$0;
        public final DarkThemeResourceProvider val$resourcesProvider;
        public final StoryViewer val$storyViewer;

        public AnonymousClass5(StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1, Context context, DarkThemeResourceProvider darkThemeResourceProvider, StoryViewer storyViewer, DarkThemeResourceProvider darkThemeResourceProvider2) {
            super(context, darkThemeResourceProvider);
            this.this$0 = anonymousClass1;
            this.val$storyViewer = storyViewer;
            this.val$resourcesProvider = darkThemeResourceProvider2;
        }

        @Override
        public final void onEmojiClick(AnimatedEmojiSpan animatedEmojiSpan) {
            if (animatedEmojiSpan != null) {
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = this.this$0;
                if (((PeerStoriesView) anonymousClass1).delegate == null) {
                    return;
                }
                TLRPC.Document documentFindDocument = animatedEmojiSpan.document;
                if (documentFindDocument == null) {
                    documentFindDocument = AnimatedEmojiDrawable.findDocument(anonymousClass1.currentAccount, animatedEmojiSpan.documentId);
                }
                if (documentFindDocument == null) {
                    return;
                }
                DarkThemeResourceProvider darkThemeResourceProvider = this.val$resourcesProvider;
                Bulletin bulletinCreateContainsEmojiBulletin = BulletinFactory.of(anonymousClass1.storyContainer, darkThemeResourceProvider).createContainsEmojiBulletin(documentFindDocument, 2, new StarGiftSheet$$ExternalSyntheticLambda140(this, this.val$storyViewer, darkThemeResourceProvider, 4));
                if (bulletinCreateContainsEmojiBulletin == null) {
                    return;
                }
                bulletinCreateContainsEmojiBulletin.tag = 1;
                bulletinCreateContainsEmojiBulletin.show(true);
            }
        }

        @Override
        public final void onLinkClick(CharacterStyle characterStyle, View view) {
            boolean z = characterStyle instanceof URLSpanUserMention;
            StoryViewer storyViewer = this.val$storyViewer;
            StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = this.this$0;
            if (z) {
                TLRPC.User user = MessagesController.getInstance(anonymousClass1.currentAccount).getUser(Utilities.parseLong(((URLSpanUserMention) characterStyle).getURL()));
                if (user != null) {
                    MessagesController.getInstance(anonymousClass1.currentAccount).openChatOrProfileWith(user, null, storyViewer.fragment, 0, false);
                    return;
                }
                return;
            }
            if (!(characterStyle instanceof URLSpanNoUnderline)) {
                if (characterStyle instanceof URLSpan) {
                    processExternalUrl(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof URLSpanReplacement);
                    return;
                }
                if (characterStyle instanceof URLSpanMono) {
                    ((URLSpanMono) characterStyle).copyToClipboard();
                    ArticleViewer$21$$ExternalSyntheticOutline0.m(BulletinFactory.of(anonymousClass1.storyContainer, this.val$resourcesProvider), R.string.TextCopied);
                    return;
                } else {
                    if (characterStyle instanceof ClickableSpan) {
                        ((ClickableSpan) characterStyle).onClick(view);
                        return;
                    }
                    return;
                }
            }
            String url = ((URLSpanNoUnderline) characterStyle).getURL();
            if (url == null || !(url.startsWith("#") || url.startsWith("$"))) {
                String strExtractUsername = Browser.extractUsername(url);
                if (strExtractUsername == null) {
                    processExternalUrl(0, url, characterStyle, false);
                    return;
                }
                String lowerCase = strExtractUsername.toLowerCase();
                if (url.startsWith("@")) {
                    MessagesController.getInstance(anonymousClass1.currentAccount).openByUserName(lowerCase, storyViewer.fragment, 0, null);
                    return;
                } else {
                    processExternalUrl(0, url, characterStyle, false);
                    return;
                }
            }
            if (url.contains("@")) {
                if (storyViewer != null) {
                    storyViewer.presentFragment(new HashtagActivity(url));
                }
            } else {
                Bundle bundle = new Bundle();
                bundle.putInt("type", 3);
                bundle.putString("hashtag", url);
                if (storyViewer != null) {
                    storyViewer.presentFragment(new MediaActivity(bundle, null));
                }
            }
        }

        @Override
        public final void onLinkLongPress(final URLSpan uRLSpan, final View view, BotSensors$1$$ExternalSyntheticLambda0 botSensors$1$$ExternalSyntheticLambda0) {
            String strDecode;
            final String url = uRLSpan.getURL();
            String url2 = uRLSpan.getURL();
            try {
                try {
                    Uri uri = Uri.parse(url2);
                    url2 = Browser.replace(uri, null, null, Browser.IDN_toUnicode(uri.getHost()), null);
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                }
                strDecode = URLDecoder.decode(url2.replaceAll("\\+", "%2b"), "UTF-8");
            } catch (Exception e2) {
                FileLog.e(e2);
                strDecode = url2;
            }
            try {
                performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Context context = getContext();
            final DarkThemeResourceProvider darkThemeResourceProvider = this.val$resourcesProvider;
            BottomSheet bottomSheet = new BottomSheet(context, false, false, darkThemeResourceProvider);
            bottomSheet.fixNavigationBar();
            bottomSheet.title = strDecode;
            bottomSheet.bigTitle = false;
            bottomSheet.multipleLinesTitle = true;
            StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = this.this$0;
            StoryItemHolder storyItemHolder = anonymousClass1.currentStory;
            CharSequence[] charSequenceArr = (storyItemHolder == null || storyItemHolder.allowScreenshots()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    PeerStoriesView.AnonymousClass5 anonymousClass5 = this.f$0;
                    if (i == 0) {
                        anonymousClass5.onLinkClick(uRLSpan, view);
                        return;
                    }
                    anonymousClass5.getClass();
                    if (i == 1) {
                        AndroidUtilities.addToClipboard(url);
                        StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = anonymousClass5.this$0;
                        BulletinFactory.of(anonymousClass2.storyContainer, darkThemeResourceProvider).createCopyLinkBulletin().show();
                    }
                }
            };
            bottomSheet.items = charSequenceArr;
            bottomSheet.onClickListener = onClickListener;
            bottomSheet.setOnHideListener(new RichEditor$$ExternalSyntheticLambda46(botSensors$1$$ExternalSyntheticLambda0, 10));
            bottomSheet.fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, darkThemeResourceProvider));
            StoryViewer.this.showDialog(bottomSheet);
        }

        @Override
        public final void onReplyClick(StoryCaptionView.Panel panel) {
            if (panel == null) {
                return;
            }
            final TLRPC.Document document = panel.music;
            StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = this.this$0;
            final DarkThemeResourceProvider darkThemeResourceProvider = this.val$resourcesProvider;
            StoryViewer storyViewer = this.val$storyViewer;
            if (document != null) {
                final int i = 0;
                final int i2 = 1;
                ItemOptions.makeOptions(storyViewer.containerView, darkThemeResourceProvider, anonymousClass1.storyCaptionView).setGravity(3).translate(-AndroidUtilities.dp(8.0f), 0.0f).addIf(document instanceof TLRPC.TL_document, R.drawable.msg_saved, LocaleController.getString(R.string.StoryAudioAddToSavedMessages), new Runnable(this) {
                    public final PeerStoriesView.AnonymousClass5 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = this.f$0.this$0;
                                SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(anonymousClass2.currentAccount);
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                                long clientUserId = UserConfig.getInstance(anonymousClass2.currentAccount).getClientUserId();
                                PeerStoriesView.StoryItemHolder storyItemHolder = anonymousClass2.currentStory;
                                sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItemHolder != null ? storyItemHolder.storyItem : null, null, false));
                                BulletinFactory.of(anonymousClass2.storyContainer, darkThemeResourceProvider).createSimpleBulletin(R.raw.saved_messages, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new UndoView$$ExternalSyntheticLambda7(11))).show(true);
                                break;
                            default:
                                PeerStoriesView.AnonymousClass5 anonymousClass5 = this.f$0;
                                anonymousClass5.getClass();
                                TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                                tL_account_saveMusic.id = tL_inputDocument;
                                TLRPC.Document document2 = document;
                                tL_inputDocument.id = document2.id;
                                tL_inputDocument.access_hash = document2.access_hash;
                                tL_inputDocument.file_reference = document2.file_reference;
                                MessagesController.SavedMusicList savedMusicList = MediaController.getInstance().currentSavedMusicList;
                                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass3 = anonymousClass5.this$0;
                                if (savedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(anonymousClass3.currentAccount).getClientUserId()) {
                                    MediaController.getInstance().currentSavedMusicList.add(document2);
                                }
                                ConnectionsManager.getInstance(anonymousClass3.currentAccount).sendRequest(tL_account_saveMusic, null);
                                BulletinFactory.of(anonymousClass3.storyContainer, darkThemeResourceProvider).createSimpleBulletin(R.raw.ic_save_to_music, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).show(true);
                                break;
                        }
                    }
                }).add(R.drawable.msg_tone_add, LocaleController.getString(R.string.StoryAudioAddToProfile), new Runnable(this) {
                    public final PeerStoriesView.AnonymousClass5 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = this.f$0.this$0;
                                SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(anonymousClass2.currentAccount);
                                TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
                                long clientUserId = UserConfig.getInstance(anonymousClass2.currentAccount).getClientUserId();
                                PeerStoriesView.StoryItemHolder storyItemHolder = anonymousClass2.currentStory;
                                sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItemHolder != null ? storyItemHolder.storyItem : null, null, false));
                                BulletinFactory.of(anonymousClass2.storyContainer, darkThemeResourceProvider).createSimpleBulletin(R.raw.saved_messages, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new UndoView$$ExternalSyntheticLambda7(11))).show(true);
                                break;
                            default:
                                PeerStoriesView.AnonymousClass5 anonymousClass5 = this.f$0;
                                anonymousClass5.getClass();
                                TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                                tL_account_saveMusic.id = tL_inputDocument;
                                TLRPC.Document document2 = document;
                                tL_inputDocument.id = document2.id;
                                tL_inputDocument.access_hash = document2.access_hash;
                                tL_inputDocument.file_reference = document2.file_reference;
                                MessagesController.SavedMusicList savedMusicList = MediaController.getInstance().currentSavedMusicList;
                                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass3 = anonymousClass5.this$0;
                                if (savedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(anonymousClass3.currentAccount).getClientUserId()) {
                                    MediaController.getInstance().currentSavedMusicList.add(document2);
                                }
                                ConnectionsManager.getInstance(anonymousClass3.currentAccount).sendRequest(tL_account_saveMusic, null);
                                BulletinFactory.of(anonymousClass3.storyContainer, darkThemeResourceProvider).createSimpleBulletin(R.raw.ic_save_to_music, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).show(true);
                                break;
                        }
                    }
                }).show();
                return;
            }
            if (!panel.isRepostMessage || panel.peerId == null || panel.messageId == null) {
                if (panel.peerId == null || panel.storyId == null) {
                    BulletinFactory.of(anonymousClass1.storyContainer, darkThemeResourceProvider).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.StoryHidAccount)).setTag(3).show(true);
                    return;
                } else {
                    MessagesController.getInstance(anonymousClass1.currentAccount).getStoriesController().resolveStoryLink(panel.peerId.longValue(), panel.storyId.intValue(), new PeerStoriesView$5$$ExternalSyntheticLambda3(this, panel, storyViewer, darkThemeResourceProvider, 0));
                    return;
                }
            }
            Bundle bundle = new Bundle();
            if (panel.peerId.longValue() >= 0) {
                bundle.putLong("user_id", panel.peerId.longValue());
            } else {
                bundle.putLong("chat_id", -panel.peerId.longValue());
            }
            bundle.putInt("message_id", panel.messageId.intValue());
            storyViewer.presentFragment(new ChatActivity(bundle));
        }

        public final void processExternalUrl(int i, String str, CharacterStyle characterStyle, boolean z) {
            boolean z2;
            if (!z && !AndroidUtilities.shouldShowUrlInAlert(str)) {
                if (i == 0) {
                    Browser.openUrl(getContext(), Uri.parse(str), true, true, null);
                    return;
                } else if (i == 1) {
                    Browser.openUrl(getContext(), Uri.parse(str), false, false, null);
                    return;
                } else {
                    if (i == 2) {
                        Browser.openUrl(getContext(), Uri.parse(str), false, true, null);
                        return;
                    }
                    return;
                }
            }
            DarkThemeResourceProvider darkThemeResourceProvider = this.val$resourcesProvider;
            StoryViewer storyViewer = this.val$storyViewer;
            if (i != 0 && i != 2) {
                if (i == 1) {
                    AlertsCreator.showOpenUrlAlert(storyViewer.fragment, str, true, true, false, null, darkThemeResourceProvider);
                    return;
                }
                return;
            }
            if (characterStyle instanceof URLSpanReplacement) {
                URLSpanReplacement uRLSpanReplacement = (URLSpanReplacement) characterStyle;
                if (uRLSpanReplacement.getTextStyleRun() == null || (uRLSpanReplacement.getTextStyleRun().flags & 1024) == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            AlertsCreator.showOpenUrlAlert(storyViewer.fragment, str, true, true, true, z2, null, darkThemeResourceProvider);
        }
    }

    public final class AnonymousClass8 extends CustomPopupMenu {
        public boolean edit;
        public final StoriesViewPager.AnonymousClass2.AnonymousClass1 this$0;
        public final boolean val$canEditStory;
        public final Context val$context;
        public final boolean[] val$popupStillVisible;
        public final DarkThemeResourceProvider val$resourcesProvider;
        public final SharedResources val$sharedResources;
        public final boolean val$speedControl;
        public final StoryViewer val$storyViewer;
        public final boolean val$userCanEditStory;

        public final class AnonymousClass1 extends MessageStatisticActivity {
            @Override
            public final Theme.ResourcesProvider getResourceProvider() {
                return new DarkThemeResourceProvider();
            }

            @Override
            public final boolean isLightStatusBar() {
                return false;
            }
        }

        public AnonymousClass8(StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1, Context context, DarkThemeResourceProvider darkThemeResourceProvider, DarkThemeResourceProvider darkThemeResourceProvider2, StoryViewer storyViewer, boolean z, boolean z2, boolean z3, Context context2, SharedResources sharedResources, boolean[] zArr) {
            super(context, darkThemeResourceProvider, true);
            this.this$0 = anonymousClass1;
            this.val$resourcesProvider = darkThemeResourceProvider2;
            this.val$storyViewer = storyViewer;
            this.val$speedControl = z;
            this.val$canEditStory = z2;
            this.val$userCanEditStory = z3;
            this.val$context = context2;
            this.val$sharedResources = sharedResources;
            this.val$popupStillVisible = zArr;
        }

        public final void addSpeedLayout(final ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, boolean z) {
            StoryItemHolder storyItemHolder;
            StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = this.this$0;
            if (!this.val$speedControl || ((storyItemHolder = anonymousClass1.currentStory) != null && storyItemHolder.uploadingStory != null)) {
                anonymousClass1.speedLayout = null;
                anonymousClass1.speedItem = null;
                return;
            }
            ChooseSpeedLayout chooseSpeedLayout = new ChooseSpeedLayout(anonymousClass1.getContext(), actionBarPopupWindowLayout.getSwipeBack(), new ChooseSpeedLayout.Callback() {
                @Override
                public final void onSpeedSelected(float f, boolean z2, boolean z3) {
                    AnonymousClass8 anonymousClass8 = AnonymousClass8.this;
                    StoryViewer storyViewer = anonymousClass8.val$storyViewer;
                    if (storyViewer != null) {
                        StoryViewer.currentSpeed = f;
                        StoryViewer.VideoPlayerHolder videoPlayerHolder = storyViewer.playerHolder;
                        if (videoPlayerHolder != null) {
                            videoPlayerHolder.setSpeed(f);
                        }
                    }
                    PeerStoriesView.access$12300(anonymousClass8.this$0, z2);
                    if (z3) {
                        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = actionBarPopupWindowLayout;
                        if (actionBarPopupWindowLayout2.getSwipeBack() != null) {
                            actionBarPopupWindowLayout2.getSwipeBack().closeForeground();
                        }
                    }
                }
            });
            anonymousClass1.speedLayout = chooseSpeedLayout;
            chooseSpeedLayout.update(StoryViewer.currentSpeed, true);
            ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, anonymousClass1.getContext(), this.val$resourcesProvider, false, false);
            anonymousClass1.speedItem = actionBarMenuSubItem;
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.Speed), R.drawable.msg_speed, null);
            PeerStoriesView.access$12300(anonymousClass1, true);
            anonymousClass1.speedItem.setMinimumWidth(AndroidUtilities.dp(196.0f));
            anonymousClass1.speedItem.setRightIcon(R.drawable.msg_arrowright);
            actionBarPopupWindowLayout.addView(anonymousClass1.speedItem);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) anonymousClass1.speedItem.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams.gravity = 5;
            }
            layoutParams.width = -1;
            layoutParams.height = AndroidUtilities.dp(48.0f);
            anonymousClass1.speedItem.setLayoutParams(layoutParams);
            int iAddViewToSwipeBack = actionBarPopupWindowLayout.addViewToSwipeBack(anonymousClass1.speedLayout.speedSwipeBackLayout);
            ActionBarMenuSubItem actionBarMenuSubItem2 = anonymousClass1.speedItem;
            actionBarMenuSubItem2.openSwipeBackLayout = new PeerStoriesView$8$$ExternalSyntheticLambda31(actionBarPopupWindowLayout, iAddViewToSwipeBack, 0);
            actionBarMenuSubItem2.setOnClickListener(new PeerStoriesView$8$$ExternalSyntheticLambda1(this, 12));
            actionBarPopupWindowLayout.swipeBackGravityRight = true;
            if (z) {
                ActionBarPopupWindow.GapView gapView = new ActionBarPopupWindow.GapView(anonymousClass1.getContext(), this.val$resourcesProvider, Theme.key_actionBarDefaultSubmenuSeparator);
                gapView.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindowLayout.addView((View) gapView, LayoutHelper.createLinear(-1, 8));
            }
        }

        public final void addViewStatistics(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, TL_stories.StoryItem storyItem) {
            TLRPC.Chat chat;
            StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = this.this$0;
            if (!anonymousClass1.isChannel || storyItem == null || (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) || (chat = MessagesController.getInstance(anonymousClass1.currentAccount).getChat(Long.valueOf(-anonymousClass1.dialogId))) == null) {
                return;
            }
            TLRPC.ChatFull chatFull = MessagesController.getInstance(anonymousClass1.currentAccount).getChatFull(chat.id);
            if (chatFull == null) {
                chatFull = MessagesStorage.getInstance(anonymousClass1.currentAccount).loadChatInfo(chat.id, true, new CountDownLatch(1), false, false);
            }
            if (chatFull == null || !chatFull.can_view_stats) {
                return;
            }
            ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_stats, LocaleController.getString(R.string.ViewStatistics), false, this.val$resourcesProvider).setOnClickListener(new BotAdView$$ExternalSyntheticLambda3(3, this, storyItem, this.val$storyViewer, chat));
        }

        @Override
        public final void onCreate(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
            DarkThemeResourceProvider darkThemeResourceProvider;
            TL_stories.StoryItem storyItem;
            Integer num;
            boolean z;
            TL_stories.StoryItem storyItem2;
            TLRPC.Chat chat;
            boolean z2;
            TLRPC.TL_chatAdminRights tL_chatAdminRights;
            TLRPC.TL_chatAdminRights tL_chatAdminRights2;
            TLRPC.User user;
            LivePlayer livePlayer;
            TLRPC.GroupCall groupCall;
            LivePlayer livePlayer2;
            TLRPC.User user2;
            Integer num2;
            ArrayList arrayList;
            StoryEntry storyEntry;
            TL_stories.MediaArea mediaArea;
            TLRPC.InputStickerSet inputStickerSet;
            ArrayList<TLRPC.MessageEntity> arrayList2;
            TLRPC.InputStickerSet inputStickerSet2;
            TL_stories.StoryItem storyItem3;
            TLRPC.MessageMedia messageMedia;
            TLRPC.Photo photo;
            TLObject chat2;
            ?? r14;
            ?? r13;
            final StoryViewer storyViewer;
            boolean z3;
            boolean z4;
            final AnonymousClass8 anonymousClass8 = this;
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = actionBarPopupWindowLayout;
            Integer num3 = 1;
            StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = anonymousClass8.this$0;
            boolean z5 = anonymousClass8.val$canEditStory;
            Context context = anonymousClass8.val$context;
            final StoryViewer storyViewer2 = anonymousClass8.val$storyViewer;
            DarkThemeResourceProvider darkThemeResourceProvider2 = anonymousClass8.val$resourcesProvider;
            StoryItemHolder storyItemHolder = anonymousClass1.currentStory;
            if (z5 || storyItemHolder.uploadingStory != null) {
                darkThemeResourceProvider = darkThemeResourceProvider2;
                TL_stories.StoryItem storyItem4 = storyItemHolder.storyItem;
                if (storyItemHolder.uploadingStory != null) {
                    ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.msg_cancel, LocaleController.getString(R.string.Cancel), false, darkThemeResourceProvider).setOnClickListener(new PeerStoriesView$8$$ExternalSyntheticLambda1(anonymousClass8, 14));
                }
                if (storyItem4 == null) {
                    return;
                }
                if (!(anonymousClass1.isSelf || anonymousClass1.storiesController.canEditStories(anonymousClass1.dialogId)) || storyItemHolder.isLive || (storyItem = storyItemHolder.storyItem) == null) {
                    num = num3;
                } else {
                    HashSet hashSet = storyItem.albums != null ? new HashSet(storyItem.albums) : new HashSet();
                    ItemOptions itemOptionsSwipeback = ItemOptions.swipeback(actionBarPopupWindowLayout2, darkThemeResourceProvider);
                    itemOptionsSwipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new BalanceCloud$$ExternalSyntheticLambda1(actionBarPopupWindowLayout2, 26));
                    itemOptionsSwipeback.addGap();
                    StoriesController.StoriesCollections storyAlbumsList = anonymousClass1.getStoriesController().getStoryAlbumsList(anonymousClass1.dialogId, true);
                    StoriesController.StoriesCollections storyAlbumsList2 = anonymousClass1.storiesController.getStoryAlbumsList(anonymousClass1.dialogId, false);
                    anonymousClass8 = this;
                    ItemOptions.addAlbumsItemOptions(itemOptionsSwipeback, storyAlbumsList, hashSet, storyAlbumsList2 != null && storyAlbumsList2.canCreateNewAlbum(), new StarGiftSheet$$ExternalSyntheticLambda66(anonymousClass8, darkThemeResourceProvider, storyItem, 27), new GiftSheet$$ExternalSyntheticLambda23(5, this, hashSet, storyItem, darkThemeResourceProvider));
                    int iAddViewToSwipeBack = actionBarPopupWindowLayout2.addViewToSwipeBack(itemOptionsSwipeback.getLinearLayout());
                    ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, anonymousClass1.getContext(), anonymousClass8.val$resourcesProvider, false, false);
                    anonymousClass1.albumItem = actionBarMenuSubItem;
                    actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.StoriesAlbumAddToAlbum), R.drawable.menu_album_add, null);
                    ActionBarMenuSubItem actionBarMenuSubItem2 = anonymousClass1.albumItem;
                    actionBarMenuSubItem2.openSwipeBackLayout = new PeerStoriesView$8$$ExternalSyntheticLambda31(actionBarPopupWindowLayout2, iAddViewToSwipeBack, 1);
                    actionBarMenuSubItem2.setOnClickListener(new PeerStoriesView$8$$ExternalSyntheticLambda1(anonymousClass8, 13));
                    actionBarPopupWindowLayout2.addView(anonymousClass1.albumItem);
                    actionBarPopupWindowLayout2.swipeBackGravityRight = true;
                    ActionBarPopupWindow.GapView gapView = new ActionBarPopupWindow.GapView(anonymousClass1.getContext(), darkThemeResourceProvider, Theme.key_actionBarDefaultSubmenuSeparator);
                    num = num3;
                    gapView.setTag(R.id.fit_width_tag, num);
                    actionBarPopupWindowLayout2.addView((View) gapView, LayoutHelper.createLinear(-1, 8));
                }
                if (anonymousClass1.isSelf) {
                    StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy = storyItem4.privacy.isEmpty() ? new StoryPrivacyBottomSheet.StoryPrivacy(3, anonymousClass1.currentAccount, new ArrayList()) : new StoryPrivacyBottomSheet.StoryPrivacy(anonymousClass1.currentAccount, storyItem4.privacy);
                    z = false;
                    ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.msg_view_file, LocaleController.getString(R.string.WhoCanSee), false, darkThemeResourceProvider);
                    actionBarMenuSubItemAddItem.setSubtext(storyPrivacy.toString());
                    actionBarMenuSubItemAddItem.setOnClickListener(new GiftOfferSheet$$ExternalSyntheticLambda2(anonymousClass8, storyPrivacy, storyItem4, 14));
                    actionBarMenuSubItemAddItem.setItemHeight(56);
                } else {
                    z = false;
                }
                anonymousClass8.addSpeedLayout(actionBarPopupWindowLayout2, z);
                if (anonymousClass1.isSelf || anonymousClass8.val$speedControl) {
                    ActionBarPopupWindow.GapView gapView2 = new ActionBarPopupWindow.GapView(anonymousClass1.getContext(), darkThemeResourceProvider, Theme.key_actionBarDefaultSubmenuSeparator);
                    gapView2.setTag(R.id.fit_width_tag, num);
                    actionBarPopupWindowLayout2.addView((View) gapView2, LayoutHelper.createLinear(-1, 8));
                }
                if (!anonymousClass1.unsupported && !storyItemHolder.isLive && ((anonymousClass1.isBotsPreview() || MessagesController.getInstance(anonymousClass1.currentAccount).storiesEnabled()) && anonymousClass8.val$userCanEditStory)) {
                    ActionBarMenuSubItem actionBarMenuSubItemAddItem2 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.msg_edit, LocaleController.getString(anonymousClass1.isBotsPreview() ? R.string.EditBotPreview : R.string.EditStory), false, darkThemeResourceProvider);
                    anonymousClass1.editStoryItem = actionBarMenuSubItemAddItem2;
                    actionBarMenuSubItemAddItem2.setOnClickListener(new PeerStoriesView$$ExternalSyntheticLambda18(anonymousClass8, anonymousClass8.val$resourcesProvider, anonymousClass8.val$context, anonymousClass8.val$storyViewer, anonymousClass8.val$sharedResources));
                    if (anonymousClass1.storiesController.hasUploadingStories(anonymousClass1.dialogId) && storyItemHolder.isVideo && !SharedConfig.allowPreparingHevcPlayers()) {
                        anonymousClass1.editStoryItem.setAlpha(0.5f);
                    }
                }
                TL_stories.StoryItem storyItem5 = storyItemHolder.storyItem;
                if (storyItem5 == null || !storyItemHolder.isVideo || storyItemHolder.isLive || !(storyItem5.pinned || (anonymousClass1.isBotsPreview() && (user2 = MessagesController.getInstance(anonymousClass1.currentAccount).getUser(Long.valueOf(anonymousClass1.storyViewer.storiesList.dialogId))) != null && user2.bot && user2.bot_can_edit))) {
                    storyItem2 = storyItem4;
                } else {
                    storyItem2 = storyItem4;
                    ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.menu_cover_stories, LocaleController.getString(R.string.StoryEditCoverMenu), false, darkThemeResourceProvider).setOnClickListener(new PeerStoriesView$$ExternalSyntheticLambda18(anonymousClass8, anonymousClass8.val$context, storyItem4, anonymousClass8.val$storyViewer, anonymousClass8.val$sharedResources));
                }
                if ((anonymousClass1.isSelf || (anonymousClass1.isChannel && MessagesController.getInstance(anonymousClass1.currentAccount).getStoriesController().canEditStories(storyItem2.dialogId))) && !storyItemHolder.isLive) {
                    boolean z6 = storyItem2.pinned;
                    boolean z7 = !z6;
                    ActionBarMenuSubItem actionBarMenuSubItemAddItem3 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, !z6 ? R.drawable.msg_save_story : R.drawable.menu_unsave_story, anonymousClass1.isSelf ? LocaleController.getString(!z6 ? R.string.SaveToProfile : R.string.ArchiveStory) : LocaleController.getString(!z6 ? R.string.SaveToPosts : R.string.RemoveFromPosts), false, darkThemeResourceProvider);
                    anonymousClass8 = this;
                    actionBarMenuSubItemAddItem3.setOnClickListener(new PeerStoriesView$8$$ExternalSyntheticLambda8(anonymousClass8, storyItem2, z7, darkThemeResourceProvider, 0));
                } else {
                    anonymousClass8 = this;
                }
                anonymousClass8.addViewStatistics(actionBarPopupWindowLayout2, storyItem2);
                if (!anonymousClass1.unsupported && !storyItemHolder.isLive) {
                    ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.msg_gallery, LocaleController.getString(storyItemHolder.isVideo ? R.string.SaveVideo : R.string.SaveImage), false, darkThemeResourceProvider).setOnClickListener(new PeerStoriesView$8$$ExternalSyntheticLambda1(anonymousClass8, 15));
                }
                if (!MessagesController.getInstance(anonymousClass1.currentAccount).premiumFeaturesBlocked() && !storyItemHolder.isLive && !anonymousClass1.isChannel) {
                    anonymousClass1.createStealthModeItem(actionBarPopupWindowLayout2);
                }
                if (anonymousClass1.isChannel && anonymousClass1.allowShareLink) {
                    ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), false, darkThemeResourceProvider).setOnClickListener(new PeerStoriesView$8$$ExternalSyntheticLambda1(anonymousClass8, 1));
                }
                if (anonymousClass1.allowShareLink) {
                    ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.msg_shareout, LocaleController.getString(R.string.BotShare), false, darkThemeResourceProvider).setOnClickListener(new PeerStoriesView$8$$ExternalSyntheticLambda1(anonymousClass8, 2));
                }
                TL_stories.StoryItem storyItem6 = storyItemHolder.storyItem;
                if (storyItem6 != null) {
                    TLRPC.MessageMedia messageMedia2 = storyItem6.media;
                    if ((messageMedia2 instanceof TLRPC.TL_messageMediaVideoStream) && (livePlayer2 = LivePlayer.recording) != null && livePlayer2.equals(((TLRPC.TL_messageMediaVideoStream) messageMedia2).call)) {
                        LivePlayer livePlayer3 = LivePlayer.recording;
                        boolean z8 = livePlayer3 != null && livePlayer3.outgoing && livePlayer3.isMuted;
                        ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, z8 ? R.drawable.msg_voice_unmuted : R.drawable.msg_voice_muted, LocaleController.getString(z8 ? R.string.Unmute : R.string.Mute), false, darkThemeResourceProvider).setOnClickListener(new ChatListCell$$ExternalSyntheticLambda0(anonymousClass8, z8, 3));
                        ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.menu_camera_retake, LocaleController.getString(R.string.AccDescrSwitchCamera), false, darkThemeResourceProvider).setOnClickListener(new PeerStoriesView$8$$ExternalSyntheticLambda1(anonymousClass8, 3));
                    }
                }
                if (storyItemHolder.isLive) {
                    final int i = 0;
                    ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize), false, darkThemeResourceProvider).setOnClickListener(new View.OnClickListener(anonymousClass8) {
                        public final PeerStoriesView.AnonymousClass8 f$0;

                        {
                            this.f$0 = anonymousClass8;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i) {
                                case 0:
                                    PeerStoriesView.AnonymousClass8 anonymousClass9 = this.f$0.this$0.popupMenu;
                                    if (anonymousClass9 != null) {
                                        anonymousClass9.dismiss();
                                    }
                                    StoryViewer storyViewer3 = storyViewer2;
                                    if (storyViewer3 != null) {
                                        storyViewer3.switchToPip();
                                    }
                                    break;
                                default:
                                    PeerStoriesView.AnonymousClass8 anonymousClass10 = this.f$0.this$0.popupMenu;
                                    if (anonymousClass10 != null) {
                                        anonymousClass10.dismiss();
                                    }
                                    StoryViewer storyViewer4 = storyViewer2;
                                    if (storyViewer4 != null) {
                                        storyViewer4.switchToPip();
                                    }
                                    break;
                            }
                        }
                    });
                }
                if (storyItemHolder.isLive && (anonymousClass1.dialogId == UserConfig.getInstance(anonymousClass1.currentAccount).getClientUserId() || ChatObject.canManageCalls(MessagesController.getInstance(anonymousClass1.currentAccount).getChat(Long.valueOf(-anonymousClass1.dialogId))) || ((livePlayer = storyViewer2.livePlayer) != null && storyItemHolder.isThisCall(livePlayer.getCallId()) && (groupCall = storyViewer2.livePlayer.call) != null && groupCall.creator))) {
                    ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.msg_settings_old, LocaleController.getString(R.string.LiveStorySettings), false, darkThemeResourceProvider).setOnClickListener(new PeerStoriesView$8$$ExternalSyntheticLambda3(anonymousClass8, darkThemeResourceProvider, storyViewer2, 1));
                }
                if (storyItemHolder.isLive) {
                    ActionBarMenuSubItem actionBarMenuSubItemAddItem4 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.msg_remove, LocaleController.getString(R.string.LiveStoryEnd), false, darkThemeResourceProvider);
                    int i2 = Theme.key_text_RedBold;
                    actionBarMenuSubItemAddItem4.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(i2, darkThemeResourceProvider)));
                    actionBarMenuSubItemAddItem4.setColors(darkThemeResourceProvider.getColor(i2), darkThemeResourceProvider.getColor(i2));
                    actionBarMenuSubItemAddItem4.setOnClickListener(new PeerStoriesView$8$$ExternalSyntheticLambda3(anonymousClass8, darkThemeResourceProvider, storyViewer2, 2));
                }
                if (!storyItemHolder.isLive) {
                    if (anonymousClass1.isSelf) {
                        ActionBarMenuSubItem actionBarMenuSubItemAddItem5 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), false, darkThemeResourceProvider);
                        int i3 = Theme.key_text_RedBold;
                        actionBarMenuSubItemAddItem5.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(i3, darkThemeResourceProvider)));
                        actionBarMenuSubItemAddItem5.setColors(darkThemeResourceProvider.getColor(i3), darkThemeResourceProvider.getColor(i3));
                        actionBarMenuSubItemAddItem5.setOnClickListener(new PeerStoriesView$8$$ExternalSyntheticLambda1(anonymousClass8, 4));
                    } else {
                        StoriesController storiesController = MessagesController.getInstance(anonymousClass1.currentAccount).getStoriesController();
                        TL_stories.StoryItem storyItem7 = storyItemHolder.storyItem;
                        storiesController.getClass();
                        if (storyItem7 != null) {
                            long j = storyItem7.dialogId;
                            int i4 = storiesController.currentAccount;
                            if (j != UserConfig.getInstance(i4).getClientUserId() && ((storyItem7.dialogId > 0 && (user = MessagesController.getInstance(i4).getUser(Long.valueOf(storyItem7.dialogId))) != null && user.bot && user.bot_can_edit) || (storyItem7.dialogId < 0 && (chat = MessagesController.getInstance(i4).getChat(Long.valueOf(-storyItem7.dialogId))) != null && (chat.creator || (((z2 = storyItem7.out) && (tL_chatAdminRights2 = chat.admin_rights) != null && (tL_chatAdminRights2.post_stories || tL_chatAdminRights2.delete_stories)) || (!z2 && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.delete_stories)))))) {
                                ActionBarMenuSubItem actionBarMenuSubItemAddItem6 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), false, darkThemeResourceProvider);
                                int i5 = Theme.key_text_RedBold;
                                actionBarMenuSubItemAddItem6.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(i5, darkThemeResourceProvider)));
                                actionBarMenuSubItemAddItem6.setColors(darkThemeResourceProvider.getColor(i5), darkThemeResourceProvider.getColor(i5));
                                actionBarMenuSubItemAddItem6.setOnClickListener(new PeerStoriesView$8$$ExternalSyntheticLambda1(anonymousClass8, 4));
                            }
                        }
                    }
                }
            } else {
                anonymousClass8.addSpeedLayout(actionBarPopupWindowLayout2, true);
                final String sharedPrefKey = NotificationsController.getSharedPrefKey(anonymousClass1.dialogId, 0L);
                boolean zAreStoriesNotMuted = NotificationsCustomSettingsActivity.areStoriesNotMuted(anonymousClass1.currentAccount, anonymousClass1.dialogId);
                if (anonymousClass1.dialogId > 0) {
                    chat2 = MessagesController.getInstance(anonymousClass1.currentAccount).getUser(Long.valueOf(anonymousClass1.dialogId));
                    r13 = chat2;
                    r14 = 0;
                } else {
                    chat2 = MessagesController.getInstance(anonymousClass1.currentAccount).getChat(Long.valueOf(-anonymousClass1.dialogId));
                    r14 = chat2;
                    r13 = 0;
                }
                String strTrim = r13 == 0 ? r14 == 0 ? "" : r14.title : UserObject.getFirstName(r13).trim();
                int iIndexOf = strTrim.indexOf(" ");
                if (iIndexOf > 0) {
                    strTrim = strTrim.substring(0, iIndexOf);
                }
                if (UserObject.isService(anonymousClass1.dialogId) || anonymousClass1.isBotsPreview()) {
                    actionBarPopupWindowLayout2 = actionBarPopupWindowLayout;
                    storyViewer = storyViewer2;
                    darkThemeResourceProvider = darkThemeResourceProvider2;
                    num3 = num3;
                } else {
                    if (zAreStoriesNotMuted) {
                        actionBarPopupWindowLayout2 = actionBarPopupWindowLayout;
                        ActionBarMenuSubItem actionBarMenuSubItemAddItem7 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), false, darkThemeResourceProvider2);
                        final TLObject tLObject = chat2;
                        final DarkThemeResourceProvider darkThemeResourceProvider3 = anonymousClass8.val$resourcesProvider;
                        final int i6 = 0;
                        final String str = strTrim;
                        storyViewer = storyViewer2;
                        actionBarMenuSubItemAddItem7.setOnClickListener(new View.OnClickListener(anonymousClass8) {
                            public final PeerStoriesView.AnonymousClass8 f$0;

                            {
                                this.f$0 = anonymousClass8;
                            }

                            @Override
                            public final void onClick(View view) {
                                String str2 = str;
                                TLObject tLObject2 = tLObject;
                                DarkThemeResourceProvider darkThemeResourceProvider4 = darkThemeResourceProvider3;
                                String str3 = sharedPrefKey;
                                PeerStoriesView.AnonymousClass8 anonymousClass9 = this.f$0;
                                switch (i6) {
                                    case 0:
                                        StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = anonymousClass9.this$0;
                                        MessagesController.getNotificationsSettings(anonymousClass2.currentAccount).edit().putBoolean("stories_" + str3, false).apply();
                                        NotificationsController.getInstance(anonymousClass2.currentAccount).updateServerNotificationsSettings(anonymousClass2.dialogId, 0L);
                                        BulletinFactory.of(anonymousClass2.storyContainer, darkThemeResourceProvider4).createUsersBulletin(Arrays.asList(tLObject2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, str2))).setTag(2).show();
                                        PeerStoriesView.AnonymousClass8 anonymousClass10 = anonymousClass2.popupMenu;
                                        if (anonymousClass10 != null) {
                                            anonymousClass10.dismiss();
                                        }
                                        break;
                                    default:
                                        StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass3 = anonymousClass9.this$0;
                                        MessagesController.getNotificationsSettings(anonymousClass3.currentAccount).edit().putBoolean("stories_" + str3, true).apply();
                                        NotificationsController.getInstance(anonymousClass3.currentAccount).updateServerNotificationsSettings(anonymousClass3.dialogId, 0L);
                                        BulletinFactory.of(anonymousClass3.storyContainer, darkThemeResourceProvider4).createUsersBulletin(Arrays.asList(tLObject2), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, str2))).setTag(2).show();
                                        PeerStoriesView.AnonymousClass8 anonymousClass11 = anonymousClass3.popupMenu;
                                        if (anonymousClass11 != null) {
                                            anonymousClass11.dismiss();
                                        }
                                        break;
                                }
                            }
                        });
                        actionBarMenuSubItemAddItem7.setMultiline(false);
                        darkThemeResourceProvider = darkThemeResourceProvider2;
                    } else {
                        actionBarPopupWindowLayout2 = actionBarPopupWindowLayout;
                        final String str2 = strTrim;
                        storyViewer = storyViewer2;
                        final TLObject tLObject2 = chat2;
                        darkThemeResourceProvider = darkThemeResourceProvider2;
                        ActionBarMenuSubItem actionBarMenuSubItemAddItem8 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), false, darkThemeResourceProvider);
                        final DarkThemeResourceProvider darkThemeResourceProvider4 = anonymousClass8.val$resourcesProvider;
                        final int i7 = 1;
                        actionBarMenuSubItemAddItem8.setOnClickListener(new View.OnClickListener(anonymousClass8) {
                            public final PeerStoriesView.AnonymousClass8 f$0;

                            {
                                this.f$0 = anonymousClass8;
                            }

                            @Override
                            public final void onClick(View view) {
                                String str3 = str2;
                                TLObject tLObject3 = tLObject2;
                                DarkThemeResourceProvider darkThemeResourceProvider5 = darkThemeResourceProvider4;
                                String str4 = sharedPrefKey;
                                PeerStoriesView.AnonymousClass8 anonymousClass9 = this.f$0;
                                switch (i7) {
                                    case 0:
                                        StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = anonymousClass9.this$0;
                                        MessagesController.getNotificationsSettings(anonymousClass2.currentAccount).edit().putBoolean("stories_" + str4, false).apply();
                                        NotificationsController.getInstance(anonymousClass2.currentAccount).updateServerNotificationsSettings(anonymousClass2.dialogId, 0L);
                                        BulletinFactory.of(anonymousClass2.storyContainer, darkThemeResourceProvider5).createUsersBulletin(Arrays.asList(tLObject3), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, str3))).setTag(2).show();
                                        PeerStoriesView.AnonymousClass8 anonymousClass10 = anonymousClass2.popupMenu;
                                        if (anonymousClass10 != null) {
                                            anonymousClass10.dismiss();
                                        }
                                        break;
                                    default:
                                        StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass3 = anonymousClass9.this$0;
                                        MessagesController.getNotificationsSettings(anonymousClass3.currentAccount).edit().putBoolean("stories_" + str4, true).apply();
                                        NotificationsController.getInstance(anonymousClass3.currentAccount).updateServerNotificationsSettings(anonymousClass3.dialogId, 0L);
                                        BulletinFactory.of(anonymousClass3.storyContainer, darkThemeResourceProvider5).createUsersBulletin(Arrays.asList(tLObject3), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, str3))).setTag(2).show();
                                        PeerStoriesView.AnonymousClass8 anonymousClass11 = anonymousClass3.popupMenu;
                                        if (anonymousClass11 != null) {
                                            anonymousClass11.dismiss();
                                        }
                                        break;
                                }
                            }
                        });
                        actionBarMenuSubItemAddItem8.setMultiline(false);
                    }
                    MediaDataController.getInstance(anonymousClass1.currentAccount).loadHints(true);
                    boolean z9 = (r13 == 0 || r13.contact || !MediaDataController.getInstance(anonymousClass1.currentAccount).containsTopPeer(anonymousClass1.dialogId)) ? false : true;
                    if (anonymousClass1.dialogId > 0) {
                        z3 = r13 != 0 && r13.contact;
                        if (r13 == 0 || !r13.stories_hidden) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                    } else {
                        z3 = (r14 == 0 || ChatObject.isNotInChat(r14)) ? false : true;
                        if (r14 == 0 || !r14.stories_hidden) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                    }
                    if (z9) {
                        ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), false, darkThemeResourceProvider).setOnClickListener(new PeerStoriesView$8$$ExternalSyntheticLambda1(anonymousClass8, 5));
                    } else if (z3) {
                        if (z4) {
                            ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), false, darkThemeResourceProvider).setOnClickListener(new PeerStoriesView$8$$ExternalSyntheticLambda1(anonymousClass8, 7));
                        } else {
                            ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), false, darkThemeResourceProvider).setOnClickListener(new PeerStoriesView$8$$ExternalSyntheticLambda1(anonymousClass8, 6));
                        }
                    }
                }
                if (storyItemHolder.isLive) {
                    final int i8 = 1;
                    ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize), false, darkThemeResourceProvider).setOnClickListener(new View.OnClickListener(anonymousClass8) {
                        public final PeerStoriesView.AnonymousClass8 f$0;

                        {
                            this.f$0 = anonymousClass8;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i8) {
                                case 0:
                                    PeerStoriesView.AnonymousClass8 anonymousClass9 = this.f$0.this$0.popupMenu;
                                    if (anonymousClass9 != null) {
                                        anonymousClass9.dismiss();
                                    }
                                    StoryViewer storyViewer3 = storyViewer;
                                    if (storyViewer3 != null) {
                                        storyViewer3.switchToPip();
                                    }
                                    break;
                                default:
                                    PeerStoriesView.AnonymousClass8 anonymousClass10 = this.f$0.this$0.popupMenu;
                                    if (anonymousClass10 != null) {
                                        anonymousClass10.dismiss();
                                    }
                                    StoryViewer storyViewer4 = storyViewer;
                                    if (storyViewer4 != null) {
                                        storyViewer4.switchToPip();
                                    }
                                    break;
                            }
                        }
                    });
                }
                if (!MessagesController.getInstance(anonymousClass1.currentAccount).premiumFeaturesBlocked() && storyItemHolder.isVideo) {
                    boolean z10 = MessagesController.getInstance(anonymousClass1.currentAccount).storyQualityFull;
                    boolean zIsPremium = UserConfig.getInstance(anonymousClass1.currentAccount).isPremium();
                    DarkThemeResourceProvider darkThemeResourceProvider5 = anonymousClass1.resourcesProvider;
                    if (zIsPremium) {
                        ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, z10 ? R.drawable.menu_quality_sd : R.drawable.menu_quality_hd, LocaleController.getString(z10 ? R.string.StoryQualityDecrease : R.string.StoryQualityIncrease), false, darkThemeResourceProvider5).setOnClickListener(new ChatListCell$$ExternalSyntheticLambda0(anonymousClass1, z10, 2));
                    } else {
                        Drawable drawable = anonymousClass1.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                        drawable.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                        WebBrowserSettings.AnonymousClass1 anonymousClass2 = new WebBrowserSettings.AnonymousClass1(anonymousClass1.getContext().getDrawable(R.drawable.menu_quality_hd2), drawable, 2);
                        anonymousClass2.setIconSize(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                        anonymousClass2.setIconOffset(AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(2.0f));
                        ActionBarMenuSubItem actionBarMenuSubItemAddItem9 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.menu_quality_hd, LocaleController.getString(R.string.StoryQualityIncrease), false, darkThemeResourceProvider5);
                        actionBarMenuSubItemAddItem9.setOnClickListener(new PeerStoriesView$$ExternalSyntheticLambda8(anonymousClass1, 5));
                        actionBarMenuSubItemAddItem9.setIcon(anonymousClass2);
                    }
                }
                if (!anonymousClass1.unsupported && anonymousClass1.allowShare && !storyItemHolder.isLive) {
                    if (UserConfig.getInstance(anonymousClass1.currentAccount).isPremium()) {
                        ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery), false, darkThemeResourceProvider).setOnClickListener(new PeerStoriesView$8$$ExternalSyntheticLambda1(anonymousClass8, 8));
                    } else if (!MessagesController.getInstance(anonymousClass1.currentAccount).premiumFeaturesBlocked()) {
                        Drawable drawable2 = context.getDrawable(R.drawable.msg_gallery_locked2);
                        drawable2.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                        WebBrowserSettings.AnonymousClass1 anonymousClass3 = new WebBrowserSettings.AnonymousClass1(context.getDrawable(R.drawable.msg_gallery_locked1), drawable2, 3);
                        ActionBarMenuSubItem actionBarMenuSubItemAddItem10 = ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.msg_gallery, LocaleController.getString(R.string.SaveToGallery), false, darkThemeResourceProvider);
                        actionBarMenuSubItemAddItem10.setIcon(anonymousClass3);
                        actionBarMenuSubItemAddItem10.setOnClickListener(new GiftOfferSheet$$ExternalSyntheticLambda2(anonymousClass8, actionBarMenuSubItemAddItem10, storyViewer, 13));
                    }
                }
                if (!MessagesController.getInstance(anonymousClass1.currentAccount).premiumFeaturesBlocked() && !anonymousClass1.isChannel) {
                    anonymousClass1.createStealthModeItem(actionBarPopupWindowLayout2);
                }
                if (anonymousClass1.allowShareLink) {
                    ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), false, darkThemeResourceProvider).setOnClickListener(new PeerStoriesView$8$$ExternalSyntheticLambda1(anonymousClass8, 9));
                }
                if (anonymousClass1.allowShareLink) {
                    ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.msg_shareout, LocaleController.getString(R.string.BotShare), false, darkThemeResourceProvider).setOnClickListener(new PeerStoriesView$8$$ExternalSyntheticLambda1(anonymousClass8, 10));
                }
                TL_stories.StoryItem storyItem8 = storyItemHolder.storyItem;
                if (storyItem8 != null) {
                    if (storyItem8.translated && TextUtils.equals(storyItem8.translatedLng, TranslateAlert2.getToLanguage())) {
                        ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.msg_translate, LocaleController.getString(R.string.HideTranslation), false, darkThemeResourceProvider).setOnClickListener(new PeerStoriesView$8$$ExternalSyntheticLambda1(anonymousClass8, 0));
                    } else if (MessagesController.getInstance(anonymousClass1.currentAccount).getTranslateController().canTranslateStory(storyItemHolder.storyItem)) {
                        ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.msg_translate, LocaleController.getString(R.string.TranslateMessage), false, darkThemeResourceProvider).setOnClickListener(new PeerStoriesView$8$$ExternalSyntheticLambda1(anonymousClass8, 11));
                    }
                }
                anonymousClass8.addViewStatistics(actionBarPopupWindowLayout2, storyItemHolder.storyItem);
                if (!anonymousClass1.unsupported && !UserObject.isService(anonymousClass1.dialogId) && !anonymousClass1.isBotsPreview()) {
                    ActionBarMenuItem.addItem(actionBarPopupWindowLayout2, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat), false, darkThemeResourceProvider).setOnClickListener(new PeerStoriesView$8$$ExternalSyntheticLambda3(anonymousClass8, storyViewer, darkThemeResourceProvider));
                }
                num = num3;
            }
            boolean z11 = (storyItemHolder == null || (storyItem3 = storyItemHolder.storyItem) == null || (messageMedia = storyItem3.media) == null || (!MessageObject.isDocumentHasAttachedStickers(messageMedia.document) && ((photo = storyItemHolder.storyItem.media.photo) == null || !photo.has_stickers))) ? false : true;
            if (storyItemHolder != null) {
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                TL_stories.StoryItem storyItem9 = storyItemHolder.storyItem;
                if (storyItem9 != null && storyItem9.media_areas != null) {
                    for (int i9 = 0; i9 < storyItemHolder.storyItem.media_areas.size(); i9++) {
                        TL_stories.MediaArea mediaArea2 = storyItemHolder.storyItem.media_areas.get(i9);
                        if (mediaArea2 instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                            TLRPC.Reaction reaction = mediaArea2.reaction;
                            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                                TLRPC.Document documentFindDocument = AnimatedEmojiDrawable.findDocument(anonymousClass1.currentAccount, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                                if (documentFindDocument != null && (inputStickerSet2 = MessageObject.getInputStickerSet(documentFindDocument)) != null && !hashSet2.contains(Long.valueOf(inputStickerSet2.id))) {
                                    hashSet2.add(Long.valueOf(inputStickerSet2.id));
                                    arrayList3.add(inputStickerSet2);
                                }
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem10 = storyItemHolder.storyItem;
                if (storyItem10 == null || (arrayList2 = storyItem10.entities) == null || arrayList2.isEmpty()) {
                    num2 = num;
                    StoriesController.UploadingStory uploadingStory = storyItemHolder.uploadingStory;
                    if (uploadingStory != null && (storyEntry = uploadingStory.entry) != null) {
                        if (storyEntry.mediaEntities != null) {
                            for (int i10 = 0; i10 < storyItemHolder.uploadingStory.entry.mediaEntities.size(); i10++) {
                                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) storyItemHolder.uploadingStory.entry.mediaEntities.get(i10);
                                if (mediaEntity.type == 4 && (mediaArea = mediaEntity.mediaArea) != null) {
                                    TLRPC.Reaction reaction2 = mediaArea.reaction;
                                    if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                        TLRPC.Document documentFindDocument2 = AnimatedEmojiDrawable.findDocument(anonymousClass1.currentAccount, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id);
                                        if (documentFindDocument2 != null && (inputStickerSet = MessageObject.getInputStickerSet(documentFindDocument2)) != null && !hashSet2.contains(Long.valueOf(inputStickerSet.id))) {
                                            hashSet2.add(Long.valueOf(inputStickerSet.id));
                                            arrayList3.add(inputStickerSet);
                                        }
                                    }
                                }
                            }
                        }
                        CharSequence charSequence = storyItemHolder.uploadingStory.entry.caption;
                        if (charSequence instanceof Spanned) {
                            AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), AnimatedEmojiSpan.class);
                            if (animatedEmojiSpanArr != null) {
                                for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
                                    TLRPC.Document documentFindDocument3 = animatedEmojiSpan.document;
                                    if (documentFindDocument3 == null) {
                                        documentFindDocument3 = AnimatedEmojiDrawable.findDocument(anonymousClass1.currentAccount, animatedEmojiSpan.documentId);
                                    }
                                    if (documentFindDocument3 != null) {
                                        TLRPC.InputStickerSet inputStickerSet3 = MessageObject.getInputStickerSet(documentFindDocument3);
                                        if (!hashSet2.contains(Long.valueOf(inputStickerSet3.id))) {
                                            hashSet2.add(Long.valueOf(inputStickerSet3.id));
                                            arrayList3.add(inputStickerSet3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    arrayList = arrayList3;
                } else {
                    int i11 = 0;
                    while (i11 < storyItemHolder.storyItem.entities.size()) {
                        TLRPC.MessageEntity messageEntity = storyItemHolder.storyItem.entities.get(i11);
                        if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                            TLRPC.Document documentFindDocument4 = tL_messageEntityCustomEmoji.document;
                            if (documentFindDocument4 == null) {
                                documentFindDocument4 = AnimatedEmojiDrawable.findDocument(anonymousClass1.currentAccount, tL_messageEntityCustomEmoji.document_id);
                            }
                            if (documentFindDocument4 != null) {
                                TLRPC.InputStickerSet inputStickerSet4 = MessageObject.getInputStickerSet(documentFindDocument4);
                                if (!hashSet2.contains(Long.valueOf(inputStickerSet4.id))) {
                                    hashSet2.add(Long.valueOf(inputStickerSet4.id));
                                    arrayList3.add(inputStickerSet4);
                                }
                            }
                        } else {
                            num = num;
                        }
                        i11++;
                        num = num;
                    }
                    num2 = num;
                }
                arrayList = arrayList3;
            } else {
                num2 = num;
                arrayList = null;
            }
            boolean z12 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            if (z11 || z12) {
                ActionBarPopupWindow.GapView gapView3 = new ActionBarPopupWindow.GapView(context, darkThemeResourceProvider, Theme.key_actionBarDefaultSubmenuSeparator);
                int i12 = R.id.fit_width_tag;
                Integer num4 = num2;
                gapView3.setTag(i12, num4);
                actionBarPopupWindowLayout2.addView((View) gapView3, LayoutHelper.createLinear(-1, 8));
                TLRPC.MessageMedia messageMedia3 = storyItemHolder.storyItem.media;
                TLObject tLObject3 = messageMedia3.document;
                if (tLObject3 == null) {
                    tLObject3 = messageMedia3.photo;
                }
                StoryContainsEmojiButton storyContainsEmojiButton = new StoryContainsEmojiButton(anonymousClass8.val$context, anonymousClass1.currentAccount, tLObject3, storyItemHolder.storyItem, z11, arrayList, anonymousClass8.val$resourcesProvider);
                storyContainsEmojiButton.setOnClickListener(new RichEditor$$ExternalSyntheticLambda20(16, anonymousClass8, storyContainsEmojiButton));
                storyContainsEmojiButton.setTag(i12, num4);
                actionBarPopupWindowLayout2.addView((View) storyContainsEmojiButton, LayoutHelper.createLinear(-1, -2));
            }
        }

        @Override
        public final void onDismissed() {
            if (!this.edit && !this.val$popupStillVisible[0]) {
                AndroidUtilities.runOnUIThread(new PeerStoriesView$8$$ExternalSyntheticLambda28(this, 0));
            }
            StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = this.this$0;
            anonymousClass1.popupMenu = null;
            anonymousClass1.editStoryItem = null;
        }
    }

    public interface Delegate {
    }

    public final class PeerHeaderView extends FrameLayout {
        public final BotWebViewContainer.AnonymousClass1 backupImageView;
        public float progressToUploading;
        public RadialProgress radialProgress;
        public Paint radialProgressPaint;
        public final StoryItemHolder storyItemHolder;
        public ValueAnimator subtitleAnimator;
        public final TextView[] subtitleView;
        public final UserCell2.AnonymousClass1 titleView;
        public boolean uploadedTooFast;
        public boolean uploading;

        public PeerHeaderView(Context context, StoryItemHolder storyItemHolder) {
            super(context);
            this.subtitleView = new TextView[2];
            this.storyItemHolder = storyItemHolder;
            BotWebViewContainer.AnonymousClass1 anonymousClass1 = new BotWebViewContainer.AnonymousClass1(this, context, 2);
            this.backupImageView = anonymousClass1;
            anonymousClass1.setRoundRadius(AndroidUtilities.dp(16.0f));
            addView(anonymousClass1, LayoutHelper.createFrame(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
            setClipChildren(false);
            UserCell2.AnonymousClass1 anonymousClass2 = new UserCell2.AnonymousClass1(context, 4);
            this.titleView = anonymousClass2;
            anonymousClass2.setTextSize(14);
            anonymousClass2.setTypeface(AndroidUtilities.bold());
            anonymousClass2.setMaxLines(1);
            anonymousClass2.setEllipsizeByGradient(AndroidUtilities.dp(4.0f));
            anonymousClass2.setPivotX(0.0f);
            NotificationCenter.listenEmojiLoading(anonymousClass2);
            addView(anonymousClass2, LayoutHelper.createFrame(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
            for (int i = 0; i < 2; i++) {
                this.subtitleView[i] = new TextView(context);
                this.subtitleView[i].setTextSize(1, 12.0f);
                this.subtitleView[i].setMaxLines(1);
                this.subtitleView[i].setSingleLine(true);
                this.subtitleView[i].setEllipsize(TextUtils.TruncateAt.MIDDLE);
                this.subtitleView[i].setTextColor(-1);
                this.subtitleView[i].setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.0f));
                addView(this.subtitleView[i], LayoutHelper.createFrame(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
            }
            this.titleView.setTextColor(-1);
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (isEnabled()) {
                return super.dispatchTouchEvent(motionEvent);
            }
            return false;
        }

        public final void drawUploadingProgress(Canvas canvas, RectF rectF, float f, boolean z) {
            float f2;
            boolean z2;
            StoriesController.UploadingStory uploadingStory;
            StoryItemHolder storyItemHolder = this.storyItemHolder;
            if ((storyItemHolder == null || storyItemHolder.uploadingStory == null) && this.progressToUploading == 0.0f) {
                return;
            }
            if (storyItemHolder == null || (uploadingStory = storyItemHolder.uploadingStory) == null || uploadingStory.failed) {
                if (this.uploading) {
                    this.uploading = false;
                    this.uploadedTooFast = this.radialProgress.getAnimatedProgress() < 0.2f;
                }
                if (!this.uploadedTooFast) {
                    this.progressToUploading = Utilities.clamp(this.progressToUploading - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
                }
                f2 = 1.0f;
                z2 = true;
            } else {
                this.progressToUploading = 1.0f;
                f2 = uploadingStory.progress;
                if (!this.uploading) {
                    this.uploading = true;
                }
                z2 = false;
            }
            RadialProgress radialProgress = this.radialProgress;
            BotWebViewContainer.AnonymousClass1 anonymousClass1 = this.backupImageView;
            if (radialProgress == null) {
                RadialProgress radialProgress2 = new RadialProgress(anonymousClass1);
                this.radialProgress = radialProgress2;
                radialProgress2.setBackground(null, true, false);
            }
            this.radialProgress.setDiff(0);
            ImageReceiver imageReceiver = anonymousClass1.getImageReceiver();
            float fM = BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, this.progressToUploading, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
            this.radialProgress.setProgressRect((int) (rectF.left - fM), (int) (rectF.top - fM), (int) (rectF.right + fM), (int) (rectF.bottom + fM));
            this.radialProgress.setProgress(z2 ? 1.0f : Utilities.clamp(f2, 1.0f, 0.0f), true);
            if (this.uploadedTooFast && z2 && this.radialProgress.getAnimatedProgress() >= 0.9f) {
                this.progressToUploading = Utilities.clamp(this.progressToUploading - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
            }
            if (z) {
                if (f != 1.0f) {
                    Paint unreadCirclePaint = StoriesUtilities.getUnreadCirclePaint(imageReceiver, false);
                    unreadCirclePaint.setAlpha((int) (this.progressToUploading * 255.0f));
                    this.radialProgress.setPaint(unreadCirclePaint);
                    this.radialProgress.draw(canvas);
                }
                if (this.radialProgressPaint == null) {
                    Paint paint = new Paint(1);
                    this.radialProgressPaint = paint;
                    paint.setColor(-1);
                    this.radialProgressPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    this.radialProgressPaint.setStyle(Paint.Style.STROKE);
                    this.radialProgressPaint.setStrokeCap(Paint.Cap.ROUND);
                }
                this.radialProgressPaint.setAlpha((int) (255.0f * f * this.progressToUploading));
                this.radialProgress.setPaint(this.radialProgressPaint);
                this.radialProgress.draw(canvas);
            }
        }

        public void setOnSubtitleClick(View.OnClickListener onClickListener) {
            TextView[] textViewArr = this.subtitleView;
            textViewArr[0].setOnClickListener(onClickListener);
            textViewArr[0].setClickable(onClickListener != null);
            textViewArr[0].setBackground(onClickListener == null ? null : Theme.createSelectorDrawable(822083583, 7, -1));
        }

        public void setSubtitle(CharSequence charSequence) {
            setSubtitle(charSequence, false);
        }

        public final void setSubtitle(CharSequence charSequence, boolean z) {
            ValueAnimator valueAnimator = this.subtitleAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.subtitleAnimator = null;
            }
            TextView[] textViewArr = this.subtitleView;
            if (!z) {
                textViewArr[0].setVisibility(0);
                textViewArr[0].setAlpha(1.0f);
                textViewArr[0].setText(charSequence);
                textViewArr[1].setVisibility(8);
                textViewArr[1].setAlpha(0.0f);
                return;
            }
            textViewArr[1].setOnClickListener(null);
            textViewArr[1].setText(textViewArr[0].getText());
            textViewArr[1].setVisibility(0);
            textViewArr[1].setAlpha(1.0f);
            textViewArr[1].setTranslationY(0.0f);
            textViewArr[0].setText(charSequence);
            textViewArr[0].setVisibility(0);
            textViewArr[0].setAlpha(0.0f);
            textViewArr[0].setTranslationY(-AndroidUtilities.dp(4.0f));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.subtitleAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new RichMediaCell$$ExternalSyntheticLambda1(this, 10));
            this.subtitleAnimator.addListener(new BaseChartView.AnonymousClass4(this, 22));
            this.subtitleAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.subtitleAnimator.setDuration(340L);
            this.subtitleAnimator.start();
        }
    }

    public final class SharedResources {
        public final Paint barPaint;
        public final Drawable bottomOverlayGradient;
        public final Drawable deleteDrawable;
        public final Paint dimPaint;
        public final Paint gradientBackgroundPaint;
        public final ColorDrawable imageBackgroundDrawable;
        public final Drawable likeDrawable;
        public final Drawable likeDrawableFilled;
        public final RLottieDrawable muteDrawable;
        public final RLottieDrawable noSoundDrawable;
        public final Drawable optionsDrawable;
        public final Drawable pipDrawable;
        public final RectF popupRect;
        public final Drawable repostDrawable;
        public final Paint selectedBarPaint;
        public final Drawable shareDrawable;
        public final Drawable topOverlayGradient;
        public final BitmapShaderTools bitmapShaderTools = new BitmapShaderTools();
        public final RectF rect1 = new RectF();
        public final RectF rect2 = new RectF();
        public final RectF finalRect = new RectF();

        public SharedResources(Context context) {
            new RectF();
            this.popupRect = new RectF();
            this.dimPaint = new Paint();
            this.shareDrawable = context.getDrawable(R.drawable.media_share);
            this.likeDrawable = context.getDrawable(R.drawable.media_like);
            this.repostDrawable = context.getDrawable(R.drawable.media_repost);
            Drawable drawable = context.getDrawable(R.drawable.media_like_active);
            this.likeDrawableFilled = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
            this.optionsDrawable = context.getDrawable(R.drawable.media_more);
            this.pipDrawable = context.getDrawable(R.drawable.menu_stream_pip);
            this.deleteDrawable = context.getDrawable(R.drawable.msg_delete);
            int i = R.raw.media_mute_unmute;
            this.muteDrawable = new RLottieDrawable(i, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.noSoundDrawable = rLottieDrawable;
            rLottieDrawable.setCurrentFrame(20, false, true);
            rLottieDrawable.stop();
            Paint paint = new Paint(1);
            this.barPaint = paint;
            paint.setColor(1442840575);
            Paint paint2 = new Paint(1);
            this.selectedBarPaint = paint2;
            paint2.setColor(-1);
            int alphaComponent = ColorUtils.setAlphaComponent(-16777216, 102);
            this.topOverlayGradient = context.getDrawable(R.drawable.shadow_story_top);
            this.bottomOverlayGradient = context.getDrawable(R.drawable.shadow_story_bottom);
            Paint paint3 = new Paint();
            this.gradientBackgroundPaint = paint3;
            paint3.setColor(alphaComponent);
            this.imageBackgroundDrawable = new ColorDrawable(ColorUtils.blendARGB(0.1f, -16777216, -1));
        }

        public final void setIconMuted(boolean z, boolean z2) {
            RLottieDrawable rLottieDrawable = this.muteDrawable;
            if (!z2) {
                rLottieDrawable.setCurrentFrame(z ? 20 : 0, false);
                rLottieDrawable.setCustomEndFrame(z ? 20 : 0);
                return;
            }
            if (z) {
                if (rLottieDrawable.getCurrentFrame() > 20) {
                    rLottieDrawable.setCurrentFrame(0, false);
                }
                rLottieDrawable.setCustomEndFrame(20);
                rLottieDrawable.start();
                return;
            }
            if (rLottieDrawable.getCurrentFrame() == 0 || rLottieDrawable.getCurrentFrame() >= 43) {
                return;
            }
            rLottieDrawable.setCustomEndFrame(43);
            rLottieDrawable.start();
        }
    }

    public final class StoryItemHolder {
        public CharSequence caption;
        public boolean captionTranslated;
        public TL_stories.StoryItem editingSourceItem;
        public boolean isLive;
        public boolean isVideo;
        public StoryCaptionView.Panel musicPanel;
        public StoryCaptionView.Panel panel;
        public boolean skipped;
        public final StoriesViewPager.AnonymousClass2.AnonymousClass1 this$0;
        public TL_stories.StoryItem storyItem = null;
        public StoriesController.UploadingStory uploadingStory = null;

        public StoryItemHolder(StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1) {
            this.this$0 = anonymousClass1;
        }

        public static String access$9100(StoryItemHolder storyItemHolder) {
            TLRPC.MessageMedia messageMedia;
            TL_stories.StoryItem storyItem = storyItemHolder.storyItem;
            if (storyItem == null || (messageMedia = storyItem.media) == null) {
                if (storyItemHolder.uploadingStory == null) {
                    return "unknown";
                }
                return "uploading from " + storyItemHolder.uploadingStory.path;
            }
            if (messageMedia.photo != null) {
                StringBuilder sb = new StringBuilder("photo#");
                sb.append(storyItemHolder.storyItem.media.photo.id);
                sb.append("at");
                return Fragment$$ExternalSyntheticOutline0.m(storyItemHolder.storyItem.media.photo.dc_id, "dc", sb);
            }
            if (messageMedia.document == null) {
                return "unknown";
            }
            StringBuilder sb2 = new StringBuilder("doc#");
            sb2.append(storyItemHolder.storyItem.media.document.id);
            sb2.append("at");
            return Fragment$$ExternalSyntheticOutline0.m(storyItemHolder.storyItem.media.document.dc_id, "dc", sb2);
        }

        public final boolean allowScreenshots() {
            StoriesController.UploadingStory uploadingStory = this.uploadingStory;
            if (uploadingStory != null) {
                return uploadingStory.entry.allowScreenshots;
            }
            TL_stories.StoryItem storyItem = this.storyItem;
            if (storyItem == null) {
                return true;
            }
            if (storyItem.noforwards) {
                return false;
            }
            if (!storyItem.pinned) {
                return true;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.this$0.currentAccount).getChat(Long.valueOf(-storyItem.dialogId));
            return chat == null || !chat.noforwards;
        }

        public final String createLink() {
            StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = this.this$0;
            if (anonymousClass1.currentStory.storyItem == null) {
                return null;
            }
            if (anonymousClass1.dialogId > 0) {
                TLRPC.User user = MessagesController.getInstance(anonymousClass1.currentAccount).getUser(Long.valueOf(anonymousClass1.dialogId));
                if (UserObject.getPublicUsername(user) == null) {
                    return null;
                }
                return anonymousClass1.currentStory.isLive ? String.format(Locale.US, "https://t.me/%1$s/s/live", UserObject.getPublicUsername(user)) : String.format(Locale.US, "https://t.me/%1$s/s/%2$s", UserObject.getPublicUsername(user), Integer.valueOf(anonymousClass1.currentStory.storyItem.id));
            }
            TLRPC.Chat chat = MessagesController.getInstance(anonymousClass1.currentAccount).getChat(Long.valueOf(-anonymousClass1.dialogId));
            if (ChatObject.getPublicUsername(chat) == null) {
                return null;
            }
            return anonymousClass1.currentStory.isLive ? String.format(Locale.US, "https://t.me/%1$s/s/live", ChatObject.getPublicUsername(chat)) : String.format(Locale.US, "https://t.me/%1$s/s/%2$s", ChatObject.getPublicUsername(chat), Integer.valueOf(anonymousClass1.currentStory.storyItem.id));
        }

        public final String getLocalPath() {
            TL_stories.StoryItem storyItem = this.storyItem;
            if (storyItem != null) {
                return storyItem.attachPath;
            }
            return null;
        }

        public final StoryCaptionView.Panel getMusic() {
            TL_stories.StoryItem storyItem;
            StoryCaptionView.Panel panel;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
            if (this.musicPanel == null && (storyItem = this.storyItem) != null) {
                TLRPC.Document document = storyItem.music;
                if (document == null || (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) AndroidUtilities.find(document.attributes, TLRPC.TL_documentAttributeAudio.class)) == null) {
                    panel = null;
                } else {
                    String str = tL_documentAttributeAudio.title;
                    String str2 = tL_documentAttributeAudio.performer;
                    if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                        panel = null;
                    } else {
                        StoryCaptionView.Panel panel2 = new StoryCaptionView.Panel();
                        panel2.small = true;
                        panel2.music = document;
                        if (TextUtils.isEmpty(str)) {
                            panel2.title = new SpannableStringBuilder(StoryCaptionView.Panel.musicSpan()).append((CharSequence) " ").append((CharSequence) str2);
                        } else if (TextUtils.isEmpty(str2)) {
                            panel2.title = new SpannableStringBuilder(StoryCaptionView.Panel.musicSpan()).append((CharSequence) " ").append((CharSequence) str);
                        } else {
                            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(StoryCaptionView.Panel.musicSpan()).append((CharSequence) " ").append((CharSequence) str2);
                            panel2.title = spannableStringBuilderAppend;
                            int length = spannableStringBuilderAppend.length();
                            panel2.title.append((CharSequence) " ・ ");
                            panel2.title.setSpan(new StoryCaptionView.Panel.AnonymousClass1(), length, panel2.title.length(), 33);
                            panel2.title.append((CharSequence) str);
                        }
                        panel = panel2;
                    }
                }
                this.musicPanel = panel;
            }
            return this.musicPanel;
        }

        public final File getPath() {
            TLRPC.Photo photo;
            if (getLocalPath() != null) {
                return new File(getLocalPath());
            }
            TL_stories.StoryItem storyItem = this.storyItem;
            if (storyItem == null) {
                return null;
            }
            TLRPC.MessageMedia messageMedia = storyItem.media;
            StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = this.this$0;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                return FileLoader.getInstance(anonymousClass1.currentAccount).getPathToAttach(this.storyItem.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.storyItem.media;
            if (messageMedia2 == null || (photo = messageMedia2.photo) == null) {
                return null;
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, Integer.MAX_VALUE);
            File pathToAttach = FileLoader.getInstance(anonymousClass1.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true);
            return !pathToAttach.exists() ? FileLoader.getInstance(anonymousClass1.currentAccount).getPathToAttach(closestPhotoSizeWithSize, false) : pathToAttach;
        }

        public final StoryCaptionView.Panel getReply() {
            ArrayList arrayList;
            long peerDialogId;
            TLRPC.Chat chat;
            TLRPC.Chat chat2;
            if (this.panel == null) {
                TL_stories.StoryItem storyItem = this.storyItem;
                int id = 0;
                StoryCaptionView.Panel panel = null;
                if (storyItem != null) {
                    int i = this.this$0.currentAccount;
                    if (storyItem.fwd_from != null) {
                        panel = new StoryCaptionView.Panel();
                        panel.currentAccount = i;
                        TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                        TLRPC.Peer peer = storyFwdHeader.from;
                        if (peer != null) {
                            long peerDialogId2 = DialogObject.getPeerDialogId(peer);
                            panel.peerId = Long.valueOf(peerDialogId2);
                            if (peerDialogId2 >= 0) {
                                panel.title = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) UserObject.getUserName(MessagesController.getInstance(i).getUser(Long.valueOf(peerDialogId2))));
                            } else {
                                TLRPC.Chat chat3 = MessagesController.getInstance(i).getChat(Long.valueOf(-peerDialogId2));
                                panel.title = new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat3) ? MessageObject.channelSpan() : MessageObject.groupSpan()).append((CharSequence) " ").append((CharSequence) (chat3 != null ? chat3.title : ""));
                            }
                        } else if (storyFwdHeader.from_name != null) {
                            panel.title = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                        }
                        panel.small = true;
                        TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                        if ((storyFwdHeader2.flags & 4) != 0) {
                            panel.storyId = Integer.valueOf(storyFwdHeader2.story_id);
                        }
                        panel.load();
                    } else if (storyItem.media_areas != null) {
                        TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                        while (id < storyItem.media_areas.size()) {
                            if (storyItem.media_areas.get(id) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(id);
                            }
                            id++;
                        }
                        if (tL_mediaAreaChannelPost != null && (chat2 = MessagesController.getInstance(i).getChat(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                            panel = new StoryCaptionView.Panel();
                            panel.peerId = Long.valueOf(-chat2.id);
                            panel.isRepostMessage = true;
                            panel.currentAccount = i;
                            panel.small = true;
                            panel.messageId = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                            panel.title = new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat2) ? MessageObject.channelSpan() : MessageObject.groupSpan()).append((CharSequence) " ").append((CharSequence) chat2.title);
                        }
                    }
                    this.panel = panel;
                } else {
                    StoriesController.UploadingStory uploadingStory = this.uploadingStory;
                    if (uploadingStory != null) {
                        StoryEntry storyEntry = uploadingStory.entry;
                        if (storyEntry != null) {
                            if (storyEntry.isRepost) {
                                panel = new StoryCaptionView.Panel();
                                panel.title = storyEntry.repostPeerName;
                                String str = storyEntry.repostCaption;
                                panel.text = str;
                                panel.small = TextUtils.isEmpty(str);
                            } else if (storyEntry.isRepostMessage && (arrayList = storyEntry.messageObjects) != null && arrayList.size() > 0) {
                                MessageObject messageObject = (MessageObject) storyEntry.messageObjects.get(0);
                                Boolean boolUseForwardForRepost = StoryEntry.useForwardForRepost(messageObject);
                                if (boolUseForwardForRepost == null) {
                                    peerDialogId = 0;
                                } else {
                                    peerDialogId = boolUseForwardForRepost.booleanValue() ? DialogObject.getPeerDialogId(messageObject.messageOwner.fwd_from.from_id) : messageObject.getDialogId();
                                }
                                if (peerDialogId < 0 && (chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId))) != null) {
                                    panel = new StoryCaptionView.Panel();
                                    panel.peerId = Long.valueOf(peerDialogId);
                                    panel.isRepostMessage = true;
                                    panel.currentAccount = messageObject.currentAccount;
                                    panel.small = true;
                                    Boolean boolUseForwardForRepost2 = StoryEntry.useForwardForRepost(messageObject);
                                    if (boolUseForwardForRepost2 != null) {
                                        id = boolUseForwardForRepost2.booleanValue() ? messageObject.messageOwner.fwd_from.channel_post : messageObject.getId();
                                    }
                                    panel.messageId = Integer.valueOf(id);
                                    panel.title = new SpannableStringBuilder(ChatObject.isChannelAndNotMegaGroup(chat) ? MessageObject.channelSpan() : MessageObject.groupSpan()).append((CharSequence) " ").append((CharSequence) chat.title);
                                }
                            }
                        }
                        this.panel = panel;
                    }
                }
            }
            return this.panel;
        }

        public final boolean hasSound() {
            TLRPC.MessageMedia messageMedia;
            TLRPC.Document document;
            if (!this.isVideo) {
                return false;
            }
            TL_stories.StoryItem storyItem = this.storyItem;
            if (storyItem == null || (messageMedia = storyItem.media) == null || (document = messageMedia.getDocument()) == null) {
                StoriesController.UploadingStory uploadingStory = this.uploadingStory;
                if (uploadingStory != null) {
                    return !uploadingStory.entry.muted;
                }
                return true;
            }
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isThisCall(long j) {
            TL_stories.StoryItem storyItem = this.storyItem;
            if (storyItem == null) {
                return false;
            }
            TLRPC.MessageMedia messageMedia = storyItem.media;
            return (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.id;
        }

        public final boolean isVideo() {
            return this.isVideo;
        }

        public final boolean isVideoInternal() {
            String str;
            TLRPC.MessageMedia messageMedia;
            StoriesController.UploadingStory uploadingStory = this.uploadingStory;
            if (uploadingStory != null) {
                return uploadingStory.isVideo;
            }
            TL_stories.StoryItem storyItem = this.storyItem;
            if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
                TLRPC.Document document = this.storyItem.media.getDocument();
                return MessageObject.isVideoDocument(document) || "video/mp4".equals(document.mime_type);
            }
            TL_stories.StoryItem storyItem2 = this.storyItem;
            if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
                return false;
            }
            return str.toLowerCase().endsWith(".mp4");
        }

        public final void set(TL_stories.StoryItem storyItem) {
            TLRPC.MessageMedia messageMedia;
            this.storyItem = storyItem;
            this.panel = null;
            this.musicPanel = null;
            this.uploadingStory = null;
            this.skipped = storyItem instanceof TL_stories.TL_storyItemSkipped;
            this.isVideo = isVideoInternal();
            TL_stories.StoryItem storyItem2 = this.storyItem;
            this.isLive = (storyItem2 == null || (messageMedia = storyItem2.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
        }

        public final void updateCaption() {
            int i;
            this.captionTranslated = false;
            StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = this.this$0;
            StoryItemHolder storyItemHolder = anonymousClass1.currentStory;
            StoriesController.UploadingStory uploadingStory = storyItemHolder.uploadingStory;
            if (uploadingStory != null) {
                CharSequence charSequence = uploadingStory.entry.caption;
                this.caption = charSequence;
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequence, anonymousClass1.storyCaptionView.captionTextview.getPaint().getFontMetricsInt(), false);
                this.caption = charSequenceReplaceEmoji;
                SpannableStringBuilder spannableStringBuilder = charSequenceReplaceEmoji == null ? new SpannableStringBuilder() : SpannableStringBuilder.valueOf(charSequenceReplaceEmoji);
                TLRPC.User user = MessagesController.getInstance(anonymousClass1.currentAccount).getUser(Long.valueOf(anonymousClass1.dialogId));
                if (anonymousClass1.dialogId < 0 || MessagesController.getInstance(anonymousClass1.currentAccount).storyEntitiesAllowed(user)) {
                    MessageObject.addLinks(true, spannableStringBuilder);
                    return;
                }
                return;
            }
            TL_stories.StoryItem storyItem = storyItemHolder.storyItem;
            if (storyItem != null) {
                if (!storyItem.translated || storyItem.translatedText == null || !TextUtils.equals(storyItem.translatedLng, TranslateAlert2.getToLanguage())) {
                    String str = anonymousClass1.currentStory.storyItem.caption;
                    this.caption = str;
                    CharSequence charSequenceReplaceEmoji2 = Emoji.replaceEmoji(str, anonymousClass1.storyCaptionView.captionTextview.getPaint().getFontMetricsInt(), false);
                    this.caption = charSequenceReplaceEmoji2;
                    if (charSequenceReplaceEmoji2 == null || anonymousClass1.currentStory.storyItem.entities == null) {
                        return;
                    }
                    SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(anonymousClass1.currentStory.storyItem.caption), anonymousClass1.currentStory.storyItem.entities, anonymousClass1.storyCaptionView.captionTextview.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(Emoji.replaceEmoji(spannableStringBuilderValueOf, anonymousClass1.storyCaptionView.captionTextview.getPaint().getFontMetricsInt(), false));
                    i = (anonymousClass1.dialogId < 0 || MessagesController.getInstance(anonymousClass1.currentAccount).storyEntitiesAllowed(MessagesController.getInstance(anonymousClass1.currentAccount).getUser(Long.valueOf(anonymousClass1.dialogId)))) ? 1 : 0;
                    if (i != 0) {
                        MessageObject.addLinks(true, spannableStringBuilderValueOf);
                    }
                    MessageObject.addEntitiesToText(spannableStringBuilderValueOf, anonymousClass1.currentStory.storyItem.entities, false, true, true, false, i ^ 1);
                    this.caption = spannableStringBuilderValueOf;
                    return;
                }
                this.captionTranslated = true;
                TLRPC.TL_textWithEntities tL_textWithEntities = anonymousClass1.currentStory.storyItem.translatedText;
                String str2 = tL_textWithEntities.text;
                this.caption = str2;
                CharSequence charSequenceReplaceEmoji3 = Emoji.replaceEmoji(str2, anonymousClass1.storyCaptionView.captionTextview.getPaint().getFontMetricsInt(), false);
                this.caption = charSequenceReplaceEmoji3;
                if (charSequenceReplaceEmoji3 == null || tL_textWithEntities.entities == null) {
                    return;
                }
                SpannableStringBuilder spannableStringBuilderValueOf2 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, anonymousClass1.storyCaptionView.captionTextview.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(Emoji.replaceEmoji(spannableStringBuilderValueOf2, anonymousClass1.storyCaptionView.captionTextview.getPaint().getFontMetricsInt(), false));
                i = (anonymousClass1.dialogId < 0 || MessagesController.getInstance(anonymousClass1.currentAccount).storyEntitiesAllowed(MessagesController.getInstance(anonymousClass1.currentAccount).getUser(Long.valueOf(anonymousClass1.dialogId)))) ? 1 : 0;
                if (i != 0) {
                    MessageObject.addLinks(true, spannableStringBuilderValueOf2);
                }
                MessageObject.addEntitiesToText(spannableStringBuilderValueOf2, tL_textWithEntities.entities, false, true, true, false, i ^ 1);
                this.caption = spannableStringBuilderValueOf2;
            }
        }
    }

    public final class VideoPlayerSharedScope {
        public boolean firstFrameRendered;
        public LivePlayer livePlayer;
        public StoryViewer.VideoPlayerHolder player;
        public AspectRatioFrameLayout renderView;
        public SurfaceView surfaceView;
        public TextureView textureView;
        public final ArrayList viewsToInvalidate = new ArrayList();

        public final void invalidate() {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.viewsToInvalidate;
                if (i >= arrayList.size()) {
                    return;
                }
                ((View) arrayList.get(i)).invalidate();
                i++;
            }
        }
    }

    public PeerStoriesView(Context context, final StoryViewer storyViewer, SharedResources sharedResources, DarkThemeResourceProvider darkThemeResourceProvider) {
        super(context);
        this.allowDrawSurface = true;
        this.preloadReactionHolders = new ArrayList();
        this.shiftDp = -5;
        this.alpha = 1.0f;
        final StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = (StoriesViewPager.AnonymousClass2.AnonymousClass1) this;
        StoryItemHolder storyItemHolder = new StoryItemHolder(anonymousClass1);
        this.currentStory = storyItemHolder;
        this.progressToKeyboard = -1.0f;
        this.progressToDismiss = -1.0f;
        this.lastAnimatingKeyboardHeight = -1.0f;
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.progressToHideInterface = new AnimatedFloat(this);
        this.linesAlpha = new AnimatedFloat(this);
        PinchToZoomHelper pinchToZoomHelper = new PinchToZoomHelper();
        this.pinchToZoomHelper = pinchToZoomHelper;
        this.muteIconViewAlpha = 1.0f;
        final StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = (StoriesViewPager.AnonymousClass2.AnonymousClass1) this;
        int i = 0;
        this.updateStealthModeTimer = new PeerStoriesView$$ExternalSyntheticLambda7(anonymousClass2, i);
        this.showTapToSoundHint = new PeerStoriesView$$ExternalSyntheticLambda7(anonymousClass2, 1);
        this.uriesToPrepare = new ArrayList();
        this.documentsToPrepare = new ArrayList();
        this.allowDrawSurfaceRunnable = new AnonymousClass34(anonymousClass1, i);
        this.progressToRecording = new AnimatedFloat(this);
        this.progressToTextA = new AnimatedFloat(this);
        this.progressToStickerExpanded = new AnimatedFloat(this);
        this.clipPath = new Path();
        pinchToZoomHelper.setCallback(new PinchToZoomHelper.Callback() {
            @Override
            public final TextureView getCurrentTextureView() {
                return PinchToZoomHelper.Callback.CC.$default$getCurrentTextureView(this);
            }

            @Override
            public final void onZoomFinished(MessageObject messageObject) {
                ((StoryViewer.AnonymousClass5) ((PeerStoriesView) anonymousClass1).delegate).setIsInPinchToZoom(false);
            }

            @Override
            public final void onZoomStarted(MessageObject messageObject) {
                ((StoryViewer.AnonymousClass5) ((PeerStoriesView) anonymousClass1).delegate).setIsInPinchToZoom(true);
            }
        });
        this.playerSharedScope = new VideoPlayerSharedScope();
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.storyItems = new ArrayList();
        this.uploadingStories = new ArrayList();
        ChatMessageCell.AnonymousClass3 anonymousClass3 = new ChatMessageCell.AnonymousClass3(anonymousClass1);
        this.imageReceiver = anonymousClass3;
        anonymousClass3.setCrossfadeWithOldImage(false);
        anonymousClass3.setAllowLoadingOnAttachedOnly(true);
        anonymousClass3.ignoreNotifications = true;
        anonymousClass3.setFileLoadingPriority(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.reactionEffectImageReceiver = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
        imageReceiver.setFileLoadingPriority(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.reactionMoveImageReceiver = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.ignoreNotifications = true;
        imageReceiver2.setFileLoadingPriority(3);
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.leftPreloadImageReceiver = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.ignoreNotifications = true;
        imageReceiver3.setFileLoadingPriority(0);
        ImageReceiver imageReceiver4 = new ImageReceiver();
        this.rightPreloadImageReceiver = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.ignoreNotifications = true;
        imageReceiver4.setFileLoadingPriority(0);
        anonymousClass3.setPreloadingReceivers(Arrays.asList(imageReceiver3, imageReceiver4));
        this.avatarDrawable = new AvatarDrawable();
        this.storyViewer = storyViewer;
        this.sharedResources = sharedResources;
        this.bitmapShaderTools = sharedResources.bitmapShaderTools;
        this.storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        sharedResources.dimPaint.setColor(-16777216);
        this.inputBackgroundPaint = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.resourcesProvider = darkThemeResourceProvider;
        setClipChildren(false);
        AnonymousClass3 anonymousClass4 = new AnonymousClass3(anonymousClass1, context, this.storyContainer, darkThemeResourceProvider, storyViewer);
        this.storyAreasView = anonymousClass4;
        BlurredBackgroundColorProviderThemed blurredBackgroundColorProviderThemed = new BlurredBackgroundColorProviderThemed(darkThemeResourceProvider, Theme.key_chat_messagePanelBackground, 0.8f);
        this.blurredBackgroundColorProvider = blurredBackgroundColorProviderThemed;
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        blurredBackgroundSourceColor.paint.setColor(ColorUtils.blendARGB(0.2f, -16777216, -1));
        RenderEffect renderEffectCreateBlurEffect = null;
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.canBlurChat()) {
            this.blurredBackgroundSourceRenderNodeWithSaturation = null;
            this.blurredBackgroundSourceWithSaturation = blurredBackgroundSourceColor;
        } else {
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(blurredBackgroundSourceColor);
            this.blurredBackgroundSourceRenderNodeWithSaturation = blurredBackgroundSourceRenderNode;
            float fDp = AndroidUtilities.dp(8.0f);
            RenderNode renderNode = blurredBackgroundSourceRenderNode.renderNode;
            if (fDp > 0.0f) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(fDp, fDp, Shader.TileMode.CLAMP);
            }
            renderNode.setRenderEffect(renderEffectCreateBlurEffect);
            this.blurredBackgroundSourceWithSaturation = blurredBackgroundSourceRenderNode;
        }
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(new ViewPositionWatcher(this), anonymousClass2, this.blurredBackgroundSourceWithSaturation);
        this.blurredBackgroundDrawableFactory = blurredBackgroundDrawableViewFactory;
        this.inputFieldBackground = blurredBackgroundDrawableViewFactory.create(this, blurredBackgroundColorProviderThemed, false);
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(this, blurredBackgroundColorProviderThemed, false);
        this.emojiKeyboardBackground = blurredBackgroundDrawableCreate;
        blurredBackgroundDrawableCreate.boundProps.liquidThickness = AndroidUtilities.dp(32.0f);
        blurredBackgroundDrawableCreate.onBoundPropsChanged();
        AnonymousClass4 anonymousClass5 = new AnonymousClass4(anonymousClass1, context, sharedResources, storyViewer);
        this.storyContainer = anonymousClass5;
        anonymousClass5.setClipChildren(false);
        this.emojiAnimationsOverlay = new EmojiAnimationsOverlay(anonymousClass5, this.currentAccount);
        anonymousClass5.addView(anonymousClass4, LayoutHelper.createFrame(-1, -1.0f));
        AnonymousClass5 anonymousClass6 = new AnonymousClass5(anonymousClass1, getContext(), storyViewer.resourcesProvider, storyViewer, darkThemeResourceProvider);
        this.storyCaptionView = anonymousClass6;
        anonymousClass6.captionTextview.setOnClickListener(new PeerStoriesView$$ExternalSyntheticLambda8(anonymousClass2, 1));
        ImageView imageView = new ImageView(context);
        this.shareButton = imageView;
        imageView.setImageDrawable(sharedResources.shareDrawable);
        int iDp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(iDp, iDp, iDp, iDp);
        imageView.setOnClickListener(new PeerStoriesView$$ExternalSyntheticLambda8(anonymousClass2, 2));
        imageView.setContentDescription(LocaleController.getString(R.string.ShareFile));
        ScaleStateListAnimator.apply(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(sharedResources.repostDrawable);
        imageView2.setPadding(iDp, iDp, iDp, iDp);
        ?? r5 = new FrameLayout(getContext()) {
            @Override
            public final void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass7 = anonymousClass1;
                if (!anonymousClass7.isChannel || anonymousClass7.repostCounter == null) {
                    return;
                }
                canvas.save();
                canvas.translate((getMeasuredWidth() - anonymousClass7.repostCounter.getCurrentWidth()) - AndroidUtilities.dp(6.0f), 0.0f);
                float f = anonymousClass7.repostCounterProgress.set(anonymousClass7.repostCounterVisible ? 1.0f : 0.0f);
                canvas.scale(f, f, anonymousClass7.repostCounter.getCurrentWidth() / 2.0f, AndroidUtilities.dp(20.0f));
                anonymousClass7.repostCounter.setAlpha(255);
                anonymousClass7.repostCounter.draw(canvas);
                canvas.restore();
            }

            @Override
            public final boolean verifyDrawable(Drawable drawable) {
                return drawable == anonymousClass1.repostCounter || super.verifyDrawable(drawable);
            }
        };
        this.repostButtonContainer = r5;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.repostCounter;
        if (animatedTextDrawable != 0) {
            animatedTextDrawable.setCallback(r5);
        }
        r5.setWillNotDraw(false);
        r5.setOnClickListener(new PeerStoriesView$$ExternalSyntheticLambda8(anonymousClass2, 3));
        ?? r14 = new FrameLayout(getContext()) {
            @Override
            public final void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass7 = anonymousClass1;
                if (!anonymousClass7.isChannel || anonymousClass7.reactionsCounter == null) {
                    return;
                }
                canvas.save();
                canvas.translate((getMeasuredWidth() - anonymousClass7.reactionsCounter.getCurrentWidth()) - AndroidUtilities.dp(6.0f), 0.0f);
                float f = anonymousClass7.reactionsCounterProgress.set(anonymousClass7.reactionsCounterVisible ? 1.0f : 0.0f);
                canvas.scale(f, f, anonymousClass7.reactionsCounter.getCurrentWidth() / 2.0f, AndroidUtilities.dp(20.0f));
                anonymousClass7.reactionsCounter.setAlpha(255);
                anonymousClass7.reactionsCounter.draw(canvas);
                canvas.restore();
            }

            @Override
            public final boolean verifyDrawable(Drawable drawable) {
                return drawable == anonymousClass1.reactionsCounter || super.verifyDrawable(drawable);
            }
        };
        this.likeButtonContainer = r14;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.reactionsCounter;
        if (animatedTextDrawable2 != 0) {
            animatedTextDrawable2.setCallback(r14);
        }
        r14.setWillNotDraw(false);
        r14.setOnClickListener(new PeerStoriesView$$ExternalSyntheticLambda8(anonymousClass2, 4));
        r14.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass7 = anonymousClass2;
                PeerStoriesView$$ExternalSyntheticLambda3 peerStoriesView$$ExternalSyntheticLambda3 = anonymousClass7.reactionsTooltipRunnable;
                if (peerStoriesView$$ExternalSyntheticLambda3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(peerStoriesView$$ExternalSyntheticLambda3);
                    anonymousClass7.reactionsTooltipRunnable = null;
                }
                SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                HintView2 hintView2 = anonymousClass7.reactionsLongpressTooltip;
                if (hintView2 != null) {
                    hintView2.hide();
                }
                ReactionsContainerLayout reactionsContainerLayout = anonymousClass7.likesReactionLayout;
                if (reactionsContainerLayout == null) {
                    ReactionsContainerLayout reactionsContainerLayout2 = new ReactionsContainerLayout(2, LaunchActivity.getLastFragment(), anonymousClass7.getContext(), anonymousClass7.currentAccount, new PeerStoriesView.AnonymousClass18(anonymousClass7.resourcesProvider, 4));
                    anonymousClass7.likesReactionLayout = reactionsContainerLayout2;
                    reactionsContainerLayout2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
                    anonymousClass7.addView(anonymousClass7.likesReactionLayout, anonymousClass7.getChildCount() - 1, LayoutHelper.createFrame(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
                    anonymousClass7.likesReactionLayout.setVisibility(8);
                    anonymousClass7.likesReactionLayout.setDelegate(new PeerStoriesView.AnonymousClass40(anonymousClass7));
                    anonymousClass7.likesReactionLayout.setMessage(null, null, true);
                } else {
                    anonymousClass7.bringChildToFront(reactionsContainerLayout);
                    anonymousClass7.likesReactionLayout.reset();
                }
                anonymousClass7.likesReactionLayout.setFragment(LaunchActivity.getLastFragment());
                storyViewer.windowView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                anonymousClass7.showLikesReaction(true);
                return true;
            }
        });
        StoriesLikeButton storiesLikeButton = new StoriesLikeButton(context, sharedResources);
        this.storiesLikeButton = storiesLikeButton;
        storiesLikeButton.setPadding(iDp, iDp, iDp, iDp);
        r14.addView(this.storiesLikeButton, LayoutHelper.createFrame(40, 40, 3));
        r5.addView(imageView2, LayoutHelper.createFrame(40, 40, 3));
        ScaleStateListAnimator.apply(r14, 0.3f, 5.0f);
        ScaleStateListAnimator.apply(r5, 0.3f, 5.0f);
        final int i2 = 1;
        anonymousClass3.setAllowLoadingOnAttachedOnly(true);
        anonymousClass3.setParentView(anonymousClass5);
        RoundRectOutlineProvider roundRectOutlineProvider = new RoundRectOutlineProvider(10);
        this.outlineProvider = roundRectOutlineProvider;
        anonymousClass5.setOutlineProvider(roundRectOutlineProvider);
        anonymousClass5.setClipToOutline(true);
        addView(anonymousClass5);
        PeerHeaderView peerHeaderView = new PeerHeaderView(context, storyItemHolder);
        this.headerView = peerHeaderView;
        peerHeaderView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass7 = anonymousClass2;
                        if (!anonymousClass7.currentStory.hasSound()) {
                            anonymousClass7.showNoSoundHint(true);
                        } else {
                            storyViewer.toggleSilentMode();
                            if (!StoryViewer.isInSilentMode) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            anonymousClass7.muteIconContainer.setContentDescription(LocaleController.getString(!StoryViewer.isInSilentMode ? R.string.Mute : R.string.Unmute));
                        }
                        break;
                    default:
                        StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass8 = anonymousClass2;
                        long j = UserConfig.getInstance(anonymousClass8.currentAccount).clientUserId;
                        long j2 = anonymousClass8.dialogId;
                        StoryViewer storyViewer2 = storyViewer;
                        if (j == j2) {
                            Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(1, "type");
                            bundleM.putLong("dialog_id", anonymousClass8.dialogId);
                            storyViewer2.presentFragment(new MediaActivity(bundleM, null));
                        } else if (j2 <= 0) {
                            storyViewer2.presentFragment(ChatActivity.of(j2));
                        } else {
                            storyViewer2.presentFragment(ProfileActivity.of(j2));
                        }
                        break;
                }
            }
        });
        anonymousClass5.addView(peerHeaderView, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.topBulletinContainer = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.bottomActionsLinearLayout = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, LayoutHelper.createLinear(40, 40, 5));
        linearLayout.addView((View) r5, LayoutHelper.createLinear(40, 40, 5));
        linearLayout.addView((View) r14, LayoutHelper.createLinear(40, 40, 5));
        addView(linearLayout, LayoutHelper.createFrame(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.optionsIconView = imageView3;
        imageView3.setImageDrawable(sharedResources.optionsDrawable);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(Theme.createSelectorDrawable(-1, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        anonymousClass5.addView(imageView3, LayoutHelper.createFrame(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.pipIconView = imageView4;
        imageView4.setImageDrawable(sharedResources.pipDrawable);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(Theme.createSelectorDrawable(-1, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        anonymousClass5.addView(imageView4, LayoutHelper.createFrame(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(storyViewer, 15));
        imageView3.setOnClickListener(new PeerStoriesView$$ExternalSyntheticLambda18(anonymousClass2, darkThemeResourceProvider, storyViewer, context, sharedResources, 0));
        ActionBar.AnonymousClass8 anonymousClass8 = new ActionBar.AnonymousClass8(context, 8);
        this.muteIconContainer = anonymousClass8;
        anonymousClass5.addView(anonymousClass8, LayoutHelper.createFrame(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.muteIconView = rLottieImageView;
        rLottieImageView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        anonymousClass8.addView(rLottieImageView);
        ImageView imageView5 = new ImageView(context);
        this.noSoundIconView = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView5.setImageDrawable(sharedResources.noSoundDrawable);
        anonymousClass8.addView(imageView5);
        imageView5.setVisibility(8);
        StoryPrivacyButton storyPrivacyButton = new StoryPrivacyButton(context);
        this.privacyButton = storyPrivacyButton;
        storyPrivacyButton.setOnClickListener(new PeerStoriesView$$ExternalSyntheticLambda8(anonymousClass2, 0));
        anonymousClass5.addView(storyPrivacyButton, LayoutHelper.createFrame(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        final int i3 = 0;
        anonymousClass8.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass7 = anonymousClass2;
                        if (!anonymousClass7.currentStory.hasSound()) {
                            anonymousClass7.showNoSoundHint(true);
                        } else {
                            storyViewer.toggleSilentMode();
                            if (!StoryViewer.isInSilentMode) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            anonymousClass7.muteIconContainer.setContentDescription(LocaleController.getString(!StoryViewer.isInSilentMode ? R.string.Mute : R.string.Unmute));
                        }
                        break;
                    default:
                        StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass9 = anonymousClass2;
                        long j = UserConfig.getInstance(anonymousClass9.currentAccount).clientUserId;
                        long j2 = anonymousClass9.dialogId;
                        StoryViewer storyViewer2 = storyViewer;
                        if (j == j2) {
                            Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(1, "type");
                            bundleM.putLong("dialog_id", anonymousClass9.dialogId);
                            storyViewer2.presentFragment(new MediaActivity(bundleM, null));
                        } else if (j2 <= 0) {
                            storyViewer2.presentFragment(ChatActivity.of(j2));
                        } else {
                            storyViewer2.presentFragment(ProfileActivity.of(j2));
                        }
                        break;
                }
            }
        });
        this.storyLines = new StoryLinesDrawable(anonymousClass2, sharedResources);
        anonymousClass5.addView(anonymousClass6, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.liveCommentsShadowView = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        AnonymousClass10 anonymousClass10 = new AnonymousClass10(anonymousClass1, context, storyViewer, storyViewer.containerView, view, frameLayout, storyViewer);
        this.liveCommentsView = anonymousClass10;
        anonymousClass5.addView(view, LayoutHelper.createFrame(-1, 200, 87));
        anonymousClass5.addView(anonymousClass10, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        anonymousClass5.addView(frameLayout, LayoutHelper.createFrame(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int iDp2 = AndroidUtilities.dp(20.0f);
        int alphaComponent = ColorUtils.setAlphaComponent(-1, 100);
        anonymousClass8.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, 0, alphaComponent, alphaComponent));
        int iDp3 = AndroidUtilities.dp(20.0f);
        int alphaComponent2 = ColorUtils.setAlphaComponent(-1, 100);
        imageView3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp3, iDp3, iDp3, iDp3, 0, alphaComponent2, alphaComponent2));
        int iDp4 = AndroidUtilities.dp(20.0f);
        int alphaComponent3 = ColorUtils.setAlphaComponent(-1, 100);
        imageView4.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp4, iDp4, iDp4, iDp4, 0, alphaComponent3, alphaComponent3));
        int iDp5 = AndroidUtilities.dp(20.0f);
        int alphaComponent4 = ColorUtils.setAlphaComponent(-1, 100);
        imageView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp5, iDp5, iDp5, iDp5, 0, alphaComponent4, alphaComponent4));
        int iDp6 = AndroidUtilities.dp(20.0f);
        int alphaComponent5 = ColorUtils.setAlphaComponent(-1, 100);
        r14.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp6, iDp6, iDp6, iDp6, 0, alphaComponent5, alphaComponent5));
        int iDp7 = AndroidUtilities.dp(20.0f);
        int alphaComponent6 = ColorUtils.setAlphaComponent(-1, 100);
        r5.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp7, iDp7, iDp7, iDp7, 0, alphaComponent6, alphaComponent6));
        TextSelectionHelper.SimpleTextSelectionHelper simpleTextSelectionHelper = anonymousClass6.textSelectionHelper;
        View overlayView = simpleTextSelectionHelper.getOverlayView(context);
        if (overlayView != null) {
            AndroidUtilities.removeFromParent(overlayView);
            addView(overlayView);
        }
        simpleTextSelectionHelper.setCallback(new TextSelectionHelper.Callback() {
            @Override
            public final void onStateChanged(boolean z) {
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass7 = anonymousClass1;
                Delegate delegate = ((PeerStoriesView) anonymousClass7).delegate;
                boolean zIsInSelectionMode = anonymousClass7.storyCaptionView.textSelectionHelper.isInSelectionMode();
                StoryViewer storyViewer2 = StoryViewer.this;
                storyViewer2.isInTextSelectionMode = zIsInSelectionMode;
                storyViewer2.updatePlayingMode();
            }
        });
        simpleTextSelectionHelper.setParentView(this);
    }

    public static void access$12300(StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1, boolean z) {
        ActionBarMenuSubItem actionBarMenuSubItem = anonymousClass1.speedItem;
        if (actionBarMenuSubItem == null || anonymousClass1.speedLayout == null || actionBarMenuSubItem.getVisibility() != 0) {
            return;
        }
        if (z) {
            if (Math.abs(StoryViewer.currentSpeed - 0.2f) < 0.05f) {
                anonymousClass1.speedItem.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
            } else if (Math.abs(StoryViewer.currentSpeed - 0.5f) < 0.05f) {
                anonymousClass1.speedItem.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
            } else if (Math.abs(StoryViewer.currentSpeed - 1.0f) < 0.05f) {
                anonymousClass1.speedItem.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
            } else if (Math.abs(StoryViewer.currentSpeed - 1.5f) < 0.05f) {
                anonymousClass1.speedItem.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
            } else if (Math.abs(StoryViewer.currentSpeed - 2.0f) < 0.05f) {
                anonymousClass1.speedItem.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
            } else {
                anonymousClass1.speedItem.setSubtext(LocaleController.formatString(R.string.VideoSpeedCustom, SpeedIconDrawable.formatNumber(StoryViewer.currentSpeed) + "x"));
            }
        }
        anonymousClass1.speedLayout.update(StoryViewer.currentSpeed, z);
    }

    public static void access$8600(PeerStoriesView peerStoriesView) {
        if (peerStoriesView.currentStory.storyItem == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = peerStoriesView.currentStory.storyItem.id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(peerStoriesView.currentAccount).getInputPeer(peerStoriesView.dialogId);
        ConnectionsManager.getInstance(peerStoriesView.currentAccount).sendRequest(tL_stories_exportStoryLink, new AnonymousClass29());
    }

    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.currentAccount);
    }

    public float getHideInterfaceAlpha() {
        float f = 1.0f - this.progressToHideInterface.get();
        SelfStoryViewsView selfStoryViewsView = this.storyViewer.selfStoryViewsView;
        return (1.0f - (selfStoryViewsView == null ? 0.0f : selfStoryViewsView.progressToOpen)) * f;
    }

    public long getMessageMinPrice() {
        StoryViewer storyViewer;
        if (!this.currentStory.isLive || (storyViewer = this.storyViewer) == null || storyViewer.livePlayer == null || disabledPaidFeatures(true)) {
            return 0L;
        }
        return storyViewer.livePlayer.getSendPaidMessagesStars();
    }

    public final void afterMessageSend(boolean z) {
        PeerStoriesView currentPeerView;
        InstantCameraView instantCameraView = this.instantCameraView;
        if (instantCameraView != null) {
            instantCameraView.resetCameraFile();
            this.instantCameraView.cancel(false);
        }
        long j = this.dialogId;
        TL_stories.StoryItem storyItem = this.currentStory.storyItem;
        StoryViewer storyViewer = this.storyViewer;
        storyViewer.getClass();
        if (j != 0 && storyItem != null) {
            StoryViewer.replyDrafts.remove(j + (j >> 16) + (((long) storyItem.id) << 16));
        }
        this.messageSent = true;
        StoryViewer.AnonymousClass4 anonymousClass4 = storyViewer.storiesViewPager;
        if (anonymousClass4 != null && (currentPeerView = anonymousClass4.getCurrentPeerView()) != null) {
            currentPeerView.closeKeyboardOrEmoji();
        }
        if (z) {
            BulletinFactory bulletinFactoryOf = BulletinFactory.of(this.storyContainer, this.resourcesProvider);
            if (bulletinFactoryOf != null) {
                bulletinFactoryOf.createSimpleBulletin(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, new PeerStoriesView$$ExternalSyntheticLambda3(this, 8)).hideAfterBottomSheet(false).show(false);
            }
        }
        MessagesController.getInstance(this.currentAccount).ensureMessagesLoaded(this.dialogId, 0, null);
    }

    public final void animateLikeButton() {
        StoriesLikeButton storiesLikeButton = this.storiesLikeButton;
        storiesLikeButton.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new AnonymousClass16(storiesLikeButton, 0)).setDuration(150L).start();
        int iDp = AndroidUtilities.dp(8.0f);
        StoriesLikeButton storiesLikeButton2 = new StoriesLikeButton(getContext(), this.sharedResources);
        this.storiesLikeButton = storiesLikeButton2;
        storiesLikeButton2.setPadding(iDp, iDp, iDp, iDp);
        this.storiesLikeButton.setAlpha(0.0f);
        this.storiesLikeButton.setScaleX(0.8f);
        this.storiesLikeButton.setScaleY(0.8f);
        this.storiesLikeButton.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        addView(this.storiesLikeButton, LayoutHelper.createFrame(40, 40, 3));
        this.drawReactionEffect = false;
    }

    public final void animateOut(boolean z) {
        int i = 1;
        int i2 = 2;
        ValueAnimator valueAnimator = this.outAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.outT, z ? 1.0f : 0.0f);
        this.outAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new PeerStoriesView$$ExternalSyntheticLambda20(this, i2));
        this.outAnimator.addListener(new AnonymousClass14(this, z, i));
        this.outAnimator.setDuration(420L);
        this.outAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.outAnimator.start();
    }

    public final void applyMessageToChat(Runnable runnable) {
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            AccountFrozenAlert.show(this.currentAccount);
            return;
        }
        int i = SharedConfig.stealthModeSendMessageConfirm;
        if (i <= 0 || !this.stealthModeIsActive) {
            runnable.run();
            return;
        }
        int i2 = i - 1;
        SharedConfig.stealthModeSendMessageConfirm = i2;
        SharedConfig.updateStealthModeSendMessageConfirm(i2);
        AlertDialog alertDialog = new AlertDialog(getContext(), 0, this.resourcesProvider);
        alertDialog.setTitle(LocaleController.getString(R.string.StealthModeConfirmTitle));
        alertDialog.setMessage(LocaleController.getString(R.string.StealthModeConfirmMessage));
        String string = LocaleController.getString(R.string.Proceed);
        PeerStoriesView$$ExternalSyntheticLambda24 peerStoriesView$$ExternalSyntheticLambda24 = new PeerStoriesView$$ExternalSyntheticLambda24(0, runnable);
        alertDialog.positiveButtonText = string;
        alertDialog.positiveButtonListener = peerStoriesView$$ExternalSyntheticLambda24;
        String string2 = LocaleController.getString(R.string.Cancel);
        BotWebViewSheet$$ExternalSyntheticLambda2 botWebViewSheet$$ExternalSyntheticLambda2 = new BotWebViewSheet$$ExternalSyntheticLambda2(4);
        alertDialog.negativeButtonText = string2;
        alertDialog.negativeButtonListener = botWebViewSheet$$ExternalSyntheticLambda2;
        alertDialog.show();
    }

    public final void bindInternal(int i) {
        this.deletedPeer = false;
        this.forceUpdateOffsets = true;
        this.userCanSeeViews = false;
        this.isChannel = false;
        this.isGroup = false;
        long j = this.dialogId;
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        PeerHeaderView peerHeaderView = this.headerView;
        if (j >= 0) {
            this.isSelf = j == UserConfig.getInstance(this.currentAccount).getClientUserId();
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
            TL_account.RequirementToContact requirementToContactIsUserContactBlocked = MessagesController.getInstance(this.currentAccount).isUserContactBlocked(this.dialogId);
            this.isPremiumBlocked = !UserConfig.getInstance(this.currentAccount).isPremium() && DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked);
            this.starsPriceBlocked = DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked);
            avatarDrawable.setInfo(this.currentAccount, user);
            peerHeaderView.backupImageView.getImageReceiver().setForUserOrChat(user, avatarDrawable);
            setTitle(this.dialogId, true, false);
        } else {
            this.isSelf = false;
            this.isChannel = true;
            if (this.storiesController.canEditStories(j) || BuildVars.DEBUG_PRIVATE_VERSION) {
                this.userCanSeeViews = true;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
            boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            this.isGroup = !zIsChannelAndNotMegaGroup;
            if (!zIsChannelAndNotMegaGroup && MessagesController.getInstance(this.currentAccount).getChatFull(-this.dialogId) == null) {
                MessagesStorage.getInstance(this.currentAccount).loadChatInfo(-this.dialogId, true, new CountDownLatch(1), false, false);
            }
            this.isPremiumBlocked = this.isGroup && !ChatObject.canSendPlain(chat);
            this.starsPriceBlocked = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(this.dialogId);
            avatarDrawable.setInfo(this.currentAccount, chat);
            peerHeaderView.backupImageView.getImageReceiver().setForUserOrChat(chat, avatarDrawable);
            setTitle(this.dialogId, true, false);
        }
        if (this.isActive && (this.isSelf || this.isChannel)) {
            StoriesController storiesController = this.storiesController;
            long j2 = this.dialogId;
            ViewsForPeerStoriesRequester viewsForPeerStoriesRequester = (ViewsForPeerStoriesRequester) storiesController.pollingViewsForSelfStoriesRequester.get(j2);
            if (viewsForPeerStoriesRequester == null) {
                viewsForPeerStoriesRequester = new ViewsForPeerStoriesRequester(storiesController.currentAccount, j2, storiesController);
                storiesController.pollingViewsForSelfStoriesRequester.put(viewsForPeerStoriesRequester, j2);
            }
            viewsForPeerStoriesRequester.start(true);
        }
        updateStoryItems();
        this.selectedPosition = i;
        if (i < 0) {
            this.selectedPosition = 0;
        }
        this.currentImageTime = 0L;
        this.switchEventSent = false;
        this.boostsStatus = null;
        this.canApplyBoost = null;
        boolean z = this.isChannel;
        AnonymousClass4 anonymousClass4 = this.storyContainer;
        StoryViewer storyViewer = this.storyViewer;
        int i2 = 8;
        StoryItemHolder storyItemHolder = this.currentStory;
        if (z) {
            createSelfPeerView();
            if (this.chatActivityEnterView == null && (this.isGroup || storyItemHolder.isLive)) {
                createEnterView();
            }
            if (this.chatActivityEnterView != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
                AnonymousClass19 anonymousClass19 = this.chatActivityEnterView;
                if (storyItemHolder.isLive || (!isBotsPreview() && this.isGroup && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i2 = 0;
                }
                anonymousClass19.setVisibility(i2);
                this.chatActivityEnterView.setLiveComment(storyItemHolder.isLive, disabledPaidFeatures(true));
                this.chatActivityEnterView.setSuggestionButtonVisible(storyItemHolder.isLive && !disabledPaidFeatures(true) && (this.keyboardVisible || this.chatActivityEnterView.emojiViewVisible), true);
                EditTextCaption editField = this.chatActivityEnterView.getEditField();
                long j3 = this.dialogId;
                TL_stories.StoryItem storyItem = storyItemHolder.storyItem;
                storyViewer.getClass();
                editField.setText(StoryViewer.getDraft(j3, storyItem));
                this.chatActivityEnterView.setDialogId(this.dialogId, this.currentAccount);
                this.chatActivityEnterView.updateRecordButton(chat2, null);
            }
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.reactionsCounter;
            DarkThemeResourceProvider darkThemeResourceProvider = this.resourcesProvider;
            if (animatedTextDrawable == null) {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable();
                this.reactionsCounter = animatedTextDrawable2;
                AnonymousClass7 anonymousClass7 = this.likeButtonContainer;
                animatedTextDrawable2.setCallback(anonymousClass7);
                this.reactionsCounter.setTextColor(darkThemeResourceProvider.getColor(Theme.key_windowBackgroundWhiteBlackText));
                this.reactionsCounter.setTextSize(AndroidUtilities.dp(14.0f));
                this.reactionsCounterProgress = new AnimatedFloat(anonymousClass7);
            }
            AnonymousClass6 anonymousClass6 = this.repostButtonContainer;
            if (anonymousClass6 != null && this.repostCounter == null) {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable3 = new AnimatedTextView.AnimatedTextDrawable();
                this.repostCounter = animatedTextDrawable3;
                animatedTextDrawable3.setCallback(anonymousClass6);
                this.repostCounter.setTextColor(darkThemeResourceProvider.getColor(Theme.key_windowBackgroundWhiteBlackText));
                this.repostCounter.setTextSize(AndroidUtilities.dp(14.0f));
                this.repostCounterProgress = new AnimatedFloat(anonymousClass6);
            }
            if (i == -1) {
                updateSelectedPosition();
            }
            updatePosition(false);
            this.count = getStoriesCount();
            anonymousClass4.invalidate();
            invalidate();
        } else if (this.isSelf) {
            createSelfPeerView();
            if (storyItemHolder.isLive) {
                this.selfView.setVisibility(8);
                if (this.chatActivityEnterView == null) {
                    createEnterView();
                }
                this.chatActivityEnterView.setVisibility(0);
            } else {
                this.selfView.setVisibility(0);
                AnonymousClass19 anonymousClass110 = this.chatActivityEnterView;
                if (anonymousClass110 != null) {
                    anonymousClass110.setVisibility(8);
                }
            }
            AnonymousClass19 anonymousClass111 = this.chatActivityEnterView;
            if (anonymousClass111 != null) {
                anonymousClass111.setLiveComment(storyItemHolder.isLive, disabledPaidFeatures(true));
                this.chatActivityEnterView.setSuggestionButtonVisible(storyItemHolder.isLive && !disabledPaidFeatures(true) && (this.keyboardVisible || this.chatActivityEnterView.emojiViewVisible), true);
            }
            if (i == -1) {
                ArrayList arrayList = this.day;
                if (arrayList != null) {
                    int iIndexOf = arrayList.indexOf(Integer.valueOf(storyViewer.dayStoryId));
                    if (iIndexOf < 0 && !this.day.isEmpty()) {
                        if (storyViewer.dayStoryId > ((Integer) this.day.get(0)).intValue()) {
                            iIndexOf = 0;
                        } else if (storyViewer.dayStoryId < ((Integer) zzin.m(1, this.day)).intValue()) {
                            iIndexOf = this.day.size() - 1;
                        }
                    }
                    this.selectedPosition = Math.max(0, iIndexOf);
                } else {
                    boolean zIsEmpty = this.uploadingStories.isEmpty();
                    ArrayList arrayList2 = this.storyItems;
                    if (zIsEmpty) {
                        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i3)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i3)).id > this.storiesController.dialogIdToMaxReadId.get(this.dialogId)) {
                                this.selectedPosition = i3;
                                break;
                            }
                        }
                    } else {
                        this.selectedPosition = arrayList2.size();
                    }
                }
            }
            updatePosition(false);
            anonymousClass4.invalidate();
            invalidate();
        } else {
            if (this.chatActivityEnterView == null) {
                createEnterView();
            }
            if (this.isPremiumBlocked && this.premiumBlockedText == null) {
                createPremiumBlockedText();
            }
            if (this.premiumBlockedText != null) {
                if (this.isPremiumBlocked || this.areLiveCommentsDisabled) {
                    updatePremiumBlockedText();
                }
                this.premiumBlockedText.setVisibility(((!this.isPremiumBlocked || storyItemHolder.isLive) && !this.areLiveCommentsDisabled) ? 8 : 0);
            }
            StoryFailView storyFailView = this.failView;
            if (storyFailView != null) {
                storyFailView.setVisibility(8);
            }
            if (i == -1) {
                updateSelectedPosition();
            }
            updatePosition(false);
            AnonymousClass19 anonymousClass112 = this.chatActivityEnterView;
            if (anonymousClass112 != null) {
                anonymousClass112.setVisibility((isBotsPreview() || UserObject.isService(this.dialogId)) ? 8 : 0);
                this.chatActivityEnterView.setLiveComment(storyItemHolder.isLive, disabledPaidFeatures(true));
                this.chatActivityEnterView.setSuggestionButtonVisible(storyItemHolder.isLive && !disabledPaidFeatures(true) && (this.keyboardVisible || this.chatActivityEnterView.emojiViewVisible), true);
                EditTextCaption editField2 = this.chatActivityEnterView.getEditField();
                long j4 = this.dialogId;
                TL_stories.StoryItem storyItem2 = storyItemHolder.storyItem;
                storyViewer.getClass();
                editField2.setText(StoryViewer.getDraft(j4, storyItem2));
                this.chatActivityEnterView.setDialogId(this.dialogId, this.currentAccount);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(this.dialogId);
                if (userFull != null) {
                    this.chatActivityEnterView.updateRecordButton(null, userFull);
                } else {
                    MessagesController.getInstance(this.currentAccount).loadFullUser(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId)), this.classGuid, false);
                }
            }
            this.count = getStoriesCount();
            TONIntroActivity.AnonymousClass2 anonymousClass2 = this.selfView;
            if (anonymousClass2 != null) {
                anonymousClass2.setVisibility(8);
            }
            anonymousClass4.invalidate();
            invalidate();
        }
        checkStealthMode(false);
    }

    public final void checkStealthMode(boolean z) {
        if (this.chatActivityEnterView != null && this.isVisible && this.attachedToWindow) {
            PeerStoriesView$$ExternalSyntheticLambda7 peerStoriesView$$ExternalSyntheticLambda7 = this.updateStealthModeTimer;
            AndroidUtilities.cancelRunOnUIThread(peerStoriesView$$ExternalSyntheticLambda7);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.storiesController.stealthMode;
            this.chatActivityEnterView.checkSendButton(true);
            boolean z2 = this.isPremiumBlocked;
            StoryItemHolder storyItemHolder = this.currentStory;
            if ((z2 && !storyItemHolder.isLive) || this.areLiveCommentsDisabled) {
                this.stealthModeIsActive = false;
                this.chatActivityEnterView.setEnabled(false);
                this.chatActivityEnterView.setOverrideHint(" ", z);
                return;
            }
            if (this.starsPriceBlocked > 0) {
                this.stealthModeIsActive = false;
                this.chatActivityEnterView.setEnabled(true);
                this.chatActivityEnterView.setOverrideHint(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.starsPriceBlocked, ',')), 1.13f, (ColoredImageSpan[]) null), z);
                return;
            }
            if (!storyItemHolder.isLive && tL_storiesStealthMode != null) {
                int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                int i = tL_storiesStealthMode.active_until_date;
                if (currentTime < i) {
                    this.stealthModeIsActive = true;
                    int currentTime2 = i - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                    int i2 = currentTime2 / 60;
                    int i3 = currentTime2 % 60;
                    int i4 = R.string.StealthModeActiveHintShort;
                    Locale locale = Locale.US;
                    int iMeasureText = (int) this.chatActivityEnterView.getEditField().getPaint().measureText(LocaleController.formatString(i4, String.format(locale, "%02d:%02d", 99, 99)));
                    this.chatActivityEnterView.setEnabled(true);
                    if (iMeasureText * 1.2f >= this.chatActivityEnterView.getEditField().getMeasuredWidth()) {
                        this.chatActivityEnterView.setOverrideHint(LocaleController.formatString(i4, ""), String.format(locale, "%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i3)), z);
                    } else {
                        this.chatActivityEnterView.setOverrideHint(LocaleController.formatString(R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i3))), z);
                    }
                    AndroidUtilities.runOnUIThread(peerStoriesView$$ExternalSyntheticLambda7, 1000L);
                    return;
                }
            }
            this.stealthModeIsActive = false;
            this.chatActivityEnterView.setEnabled(true);
            if (!storyItemHolder.isLive) {
                this.chatActivityEnterView.setOverrideHint(LocaleController.getString(this.isGroup ? R.string.ReplyToGroupStory : R.string.ReplyPrivately), z);
                return;
            }
            long starsPrice = this.chatActivityEnterView.getStarsPrice();
            if (starsPrice <= 0) {
                this.chatActivityEnterView.setOverrideHint(LocaleController.getString(R.string.Comment), z);
                return;
            }
            this.chatActivityEnterView.setOverrideHint(StarsIntroActivity.replaceStars(false, LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) starsPrice, ',')), this.chatActivityEnterView.spans), z);
            ColoredImageSpan coloredImageSpan = this.chatActivityEnterView.spans[0];
            if (coloredImageSpan != null) {
                coloredImageSpan.spaceScaleX = 0.9f;
            }
        }
    }

    public final boolean closeKeyboardOrEmoji() {
        if (this.likesReactionShowing) {
            if (this.likesReactionLayout.getReactionsWindow() == null) {
                showLikesReaction(false);
                return true;
            }
            if (this.realKeyboardHeight > 0) {
                AndroidUtilities.hideKeyboard(this.likesReactionLayout.getReactionsWindow().windowView);
                return true;
            }
            this.likesReactionLayout.getReactionsWindow().dismiss();
            return true;
        }
        AnonymousClass3 anonymousClass3 = this.storyAreasView;
        if (anonymousClass3 != null) {
            HintView2 hintView2 = anonymousClass3.hintView;
            if (hintView2 != null) {
                hintView2.hide();
                anonymousClass3.hintView = null;
            }
            anonymousClass3.selectedArea = null;
            anonymousClass3.invalidate();
            anonymousClass3.onHintVisible(false);
        }
        AnonymousClass5 anonymousClass5 = this.storyCaptionView;
        if (anonymousClass5.textSelectionHelper.isInSelectionMode()) {
            anonymousClass5.textSelectionHelper.clear(false);
            return true;
        }
        HintView2 hintView3 = this.privacyHint;
        if (hintView3 != null) {
            hintView3.hide();
        }
        HintView2 hintView4 = this.soundTooltip;
        if (hintView4 != null) {
            hintView4.hide();
        }
        HintView hintView = this.mediaBanTooltip;
        if (hintView != null) {
            hintView.hide(true);
        }
        AnonymousClass8 anonymousClass8 = this.popupMenu;
        if (anonymousClass8 != null && anonymousClass8.isShowing()) {
            this.popupMenu.dismiss();
            return true;
        }
        AnonymousClass19 anonymousClass19 = this.chatActivityEnterView;
        if (anonymousClass19 != null && anonymousClass19.isRecordLocked()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
            if (this.chatActivityEnterView.isInVideoMode()) {
                builder.setTitle(LocaleController.getString(R.string.DiscardVideoMessageTitle));
                builder.setMessage(LocaleController.getString(R.string.DiscardVideoMessageDescription));
            } else {
                builder.setTitle(LocaleController.getString(R.string.DiscardVoiceMessageTitle));
                builder.setMessage(LocaleController.getString(R.string.DiscardVoiceMessageDescription));
            }
            builder.setPositiveButton(LocaleController.getString(R.string.DiscardVoiceMessageAction), new PeerStoriesView$$ExternalSyntheticLambda6(this, 0));
            builder.setNegativeButton(LocaleController.getString(R.string.Continue), null);
            Delegate delegate = this.delegate;
            StoryViewer.this.showDialog(builder.create());
            return true;
        }
        ReactionsContainerLayout reactionsContainerLayout = this.reactionsContainerLayout;
        if (reactionsContainerLayout != null && reactionsContainerLayout.getReactionsWindow() != null && !this.reactionsContainerLayout.getReactionsWindow().dismissed) {
            this.reactionsContainerLayout.getReactionsWindow().dismiss();
            return true;
        }
        AnonymousClass19 anonymousClass110 = this.chatActivityEnterView;
        if (anonymousClass110 != null && anonymousClass110.isPopupShowing()) {
            if (this.realKeyboardHeight > 0) {
                AndroidUtilities.hideKeyboard(this.chatActivityEnterView.getEmojiView());
                return true;
            }
            this.chatActivityEnterView.hidePopup(true, false);
            return true;
        }
        if (getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            if (anonymousClass5.getVisibility() != 0 || anonymousClass5.getProgressToBlackout() <= 0.0f) {
                return false;
            }
            anonymousClass5.collapse();
            this.inBlackoutMode = false;
            this.storyContainer.invalidate();
            return true;
        }
        AnonymousClass19 anonymousClass111 = this.chatActivityEnterView;
        if (anonymousClass111 != null) {
            long j = this.dialogId;
            TL_stories.StoryItem storyItem = this.currentStory.storyItem;
            Editable editText = anonymousClass111.getEditText();
            this.storyViewer.getClass();
            StoryViewer.saveDraft(j, storyItem, editText);
        }
        AndroidUtilities.hideKeyboard(this.chatActivityEnterView);
        return true;
    }

    public final void createChatAttachView$1() {
        if (this.chatAttachAlert == null) {
            AnonymousClass23 anonymousClass23 = new AnonymousClass23(this, getContext(), this.resourcesProvider);
            this.chatAttachAlert = anonymousClass23;
            anonymousClass23.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() {
                @Override
                public final void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
                    TL_stories.StoryItem storyItem;
                    String str;
                    PeerStoriesView peerStoriesView = PeerStoriesView.this;
                    if (!peerStoriesView.storyViewer.isShowing || (storyItem = peerStoriesView.currentStory.storyItem) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
                        return;
                    }
                    if (i != 8 && i != 7 && (i != 4 || peerStoriesView.chatAttachAlert.getPhotoLayout().getSelectedPhotos().isEmpty())) {
                        AnonymousClass23 anonymousClass24 = peerStoriesView.chatAttachAlert;
                        if (anonymousClass24 != null) {
                            anonymousClass24.dismissWithButtonClick(i);
                            return;
                        }
                        return;
                    }
                    if (i != 8) {
                        peerStoriesView.chatAttachAlert.dismiss(true);
                    }
                    HashMap<Object, Object> selectedPhotos = peerStoriesView.chatAttachAlert.getPhotoLayout().getSelectedPhotos();
                    ArrayList<Object> selectedPhotosOrder = peerStoriesView.chatAttachAlert.getPhotoLayout().getSelectedPhotosOrder();
                    if (selectedPhotos.isEmpty()) {
                        return;
                    }
                    int i4 = 0;
                    int i5 = 0;
                    while (i5 < Math.ceil(selectedPhotos.size() / 10.0f)) {
                        int i6 = i5 * 10;
                        int iMin = Math.min(10, selectedPhotos.size() - i6);
                        ArrayList arrayList = new ArrayList();
                        for (int i7 = 0; i7 < iMin; i7++) {
                            int i8 = i6 + i7;
                            if (i8 < selectedPhotosOrder.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i8));
                                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                                boolean z5 = photoEntry.isVideo;
                                if (z5 || (str = photoEntry.imagePath) == null) {
                                    String str2 = photoEntry.path;
                                    if (str2 != null) {
                                        sendingMediaInfo.path = str2;
                                    }
                                } else {
                                    sendingMediaInfo.path = str;
                                }
                                sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                                sendingMediaInfo.coverPath = photoEntry.coverPath;
                                sendingMediaInfo.isVideo = z5;
                                CharSequence charSequence = photoEntry.caption;
                                sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                                sendingMediaInfo.entities = photoEntry.entities;
                                sendingMediaInfo.masks = photoEntry.stickers;
                                sendingMediaInfo.ttl = photoEntry.ttl;
                                sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                                sendingMediaInfo.canDeleteAfter = photoEntry.canDeleteAfter;
                                sendingMediaInfo.updateStickersOrder = SendMessagesHelper.checkUpdateStickersOrder(photoEntry.caption);
                                sendingMediaInfo.hasMediaSpoilers = photoEntry.hasSpoiler;
                                arrayList.add(sendingMediaInfo);
                                photoEntry.reset();
                            }
                        }
                        HashMap<Object, Object> map = selectedPhotos;
                        ArrayList<Object> arrayList2 = selectedPhotosOrder;
                        SendMessagesHelper.prepareSendingMedia(peerStoriesView.getAccountInstance(), arrayList, peerStoriesView.dialogId, null, null, storyItem, null, i == 4 || z4, z, null, z2, i2, i3, 0, i5 == 0 ? ((SendMessagesHelper.SendingMediaInfo) arrayList.get(i4)).updateStickersOrder : false, null, null, 0L, false, 0L, peerStoriesView.chatActivityEnterView.getSendMonoForumPeerId(), peerStoriesView.chatActivityEnterView.getSendMessageSuggestionParams());
                        i5++;
                        selectedPhotos = map;
                        selectedPhotosOrder = arrayList2;
                        i4 = 0;
                    }
                    peerStoriesView.chatActivityEnterView.setFieldText("");
                    peerStoriesView.afterMessageSend(j2 <= 0);
                }

                @Override
                public final void didSelectBot(TLRPC.User user) {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$didSelectBot(this, user);
                }

                @Override
                public final void doOnIdle(Runnable runnable) {
                    NotificationCenter.getInstance(PeerStoriesView.this.currentAccount).doOnIdle(runnable);
                }

                @Override
                public final View getRevealView() {
                    return PeerStoriesView.this.chatActivityEnterView.getAttachButton();
                }

                @Override
                public final boolean needEnterComment() {
                    return PeerStoriesView.this.needEnterText();
                }

                @Override
                public final void onCameraOpened() {
                    PeerStoriesView.this.chatActivityEnterView.closeKeyboard();
                }

                @Override
                public final void onWallpaperSelected(Object obj) {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onWallpaperSelected(this, obj);
                }

                @Override
                public final void openAvatarsSearch() {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$openAvatarsSearch(this);
                }

                @Override
                public final boolean selectItemOnClicking() {
                    return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$selectItemOnClicking(this);
                }

                @Override
                public final void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
                    PeerStoriesView peerStoriesView = PeerStoriesView.this;
                    TL_stories.StoryItem storyItem = peerStoriesView.currentStory.storyItem;
                    if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
                        return;
                    }
                    SendMessagesHelper.prepareSendingAudioDocuments(peerStoriesView.getAccountInstance(), arrayList, charSequence != null ? charSequence : null, peerStoriesView.dialogId, null, null, storyItem, z, i, i2, null, null, j, z2, j2);
                    peerStoriesView.afterMessageSend(j2 <= 0);
                }
            });
            this.chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
            this.chatAttachAlert.setAllowEnterCaption(true);
            this.chatAttachAlert.init();
            this.chatAttachAlert.setDocumentsDelegate(new ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate() {
                @Override
                public final void didSelectFiles(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, int i2, long j, boolean z2, long j2) {
                    PeerStoriesView peerStoriesView = PeerStoriesView.this;
                    TL_stories.StoryItem storyItem = peerStoriesView.currentStory.storyItem;
                    if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
                        return;
                    }
                    SendMessagesHelper.prepareSendingDocuments(peerStoriesView.getAccountInstance(), (ArrayList<String>) arrayList, (ArrayList<String>) arrayList, (ArrayList<Uri>) null, str, (String) null, peerStoriesView.dialogId, (MessageObject) null, (MessageObject) null, storyItem, (ChatActivity.ReplyQuote) null, (MessageObject) null, z, i, (InputContentInfoCompat) null, (SendMessageChatArguments) null, 0L, false, j2);
                    peerStoriesView.afterMessageSend(j2 <= 0);
                }

                @Override
                public final void didSelectPhotos(ArrayList arrayList, boolean z, int i, int i2, long j) {
                    ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate.CC.$default$didSelectPhotos(this, arrayList, z, i, i2, j);
                }

                @Override
                public final void startDocumentSelectActivity() {
                    try {
                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                        intent.setType("*/*");
                        StoryViewer storyViewer = PeerStoriesView.this.storyViewer;
                        if (storyViewer.fragment.getParentActivity() == null) {
                            return;
                        }
                        storyViewer.fragment.getParentActivity().startActivityForResult(intent, 21);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }

                @Override
                public final void startMusicSelectActivity() {
                    ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate.CC.$default$startMusicSelectActivity(this);
                }
            });
            this.chatAttachAlert.getCommentView().setText(this.chatActivityEnterView.getFieldText());
        }
    }

    public final void createCommentButton() {
        if (this.commentButton != null || getContext() == null) {
            return;
        }
        CommentButton commentButton = new CommentButton(getContext(), this.blurredBackgroundColorProvider);
        this.commentButton = commentButton;
        commentButton.setOnClickListener(new PeerStoriesView$$ExternalSyntheticLambda21(this, 1));
        addView(this.commentButton, LayoutHelper.createFrame(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void createEnterView() {
        DarkThemeResourceProvider darkThemeResourceProvider = this.resourcesProvider;
        AnonymousClass19 anonymousClass19 = new AnonymousClass19(AndroidUtilities.findActivity(getContext()), this, new AnonymousClass18(darkThemeResourceProvider, 0));
        this.chatActivityEnterView = anonymousClass19;
        anonymousClass19.getEditField().useAnimatedTextDrawable();
        this.chatActivityEnterView.getEditField().setScaleX(0.0f);
        this.chatActivityEnterView.setOverrideKeyboardAnimation(true);
        this.chatActivityEnterView.setClipChildren(false);
        this.chatActivityEnterView.setDelegate(new AnonymousClass20());
        setDelegate(this.chatActivityEnterView);
        AnonymousClass19 anonymousClass110 = this.chatActivityEnterView;
        anonymousClass110.shouldDrawBackground = false;
        anonymousClass110.shouldDrawRecordedAudioPanelInParent = true;
        if (this.currentStory.isLive) {
            anonymousClass110.setAllowStickersAndGifs(true, false, false);
        } else {
            anonymousClass110.setAllowStickersAndGifs(true, true, true);
        }
        this.chatActivityEnterView.updateColors();
        AnonymousClass19 anonymousClass111 = this.chatActivityEnterView;
        anonymousClass111.isStories = true;
        addView(anonymousClass111, LayoutHelper.createFrame(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.sendAsPeersObj != null) {
            this.chatActivityEnterView.updateSendAsButton(false);
        }
        this.chatActivityEnterView.recordingGuid = this.classGuid;
        VideoPlayerSharedScope videoPlayerSharedScope = this.playerSharedScope;
        videoPlayerSharedScope.viewsToInvalidate.add(this.storyContainer);
        videoPlayerSharedScope.viewsToInvalidate.add(this);
        if (this.attachedToWindow) {
            this.chatActivityEnterView.onResume();
        }
        checkStealthMode(false);
        if (isBotsPreview()) {
            this.chatActivityEnterView.setVisibility(8);
        }
        ChatActivitySideControlsButtonsLayout chatActivitySideControlsButtonsLayout = new ChatActivitySideControlsButtonsLayout(getContext(), darkThemeResourceProvider, this.blurredBackgroundDrawableFactory, this.blurredBackgroundColorProvider);
        this.sideControlsButtonsLayout = chatActivitySideControlsButtonsLayout;
        chatActivitySideControlsButtonsLayout.setOnClickListener(new PeerStoriesView$$ExternalSyntheticLambda6(this, 1));
        addView(this.sideControlsButtonsLayout, LayoutHelper.createFrame(57, 300, 85));
        this.sideControlsButtonsLayout.setVisibility(8);
        this.chatActivityEnterView.setSideButtonsForAttach(this.sideControlsButtonsLayout);
        this.reactionsContainerIndex = getChildCount();
    }

    public final void createFailView() {
        if (this.failView != null) {
            return;
        }
        StoryFailView storyFailView = new StoryFailView(getContext(), this.resourcesProvider);
        this.failView = storyFailView;
        storyFailView.setOnClickListener(new PeerStoriesView$$ExternalSyntheticLambda21(this, 3));
        this.failView.setAlpha(0.0f);
        this.failView.setVisibility(8);
        addView(this.failView, LayoutHelper.createFrame(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void createMuteButton() {
        if (this.muteButton != null || getContext() == null) {
            return;
        }
        MuteButton muteButton = new MuteButton(getContext(), this.blurredBackgroundColorProvider);
        this.muteButton = muteButton;
        muteButton.setOnClickListener(new PeerStoriesView$$ExternalSyntheticLambda21(this, 4));
        MuteButton muteButton2 = this.muteButton;
        LivePlayer livePlayer = LivePlayer.recording;
        boolean z = true;
        muteButton2.setMuted(livePlayer != null && livePlayer.outgoing && livePlayer.isMuted, false);
        MuteButton muteButton3 = this.muteButton;
        LivePlayer livePlayer2 = LivePlayer.recording;
        if (livePlayer2 != null && !livePlayer2.isConnected()) {
            z = false;
        }
        muteButton3.setConnected(z, false);
        addView(this.muteButton, LayoutHelper.createFrame(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public final void createPaidReactionsButton() {
        if (this.starsButton != null || getContext() == null) {
            return;
        }
        this.starsButtonEffectsView = new PaidReactionButton.PaidReactionButtonEffectsView(getContext(), this.currentAccount);
        PaidReactionButton paidReactionButton = new PaidReactionButton(getContext(), this.starsButtonEffectsView, this.blurredBackgroundColorProvider);
        this.starsButton = paidReactionButton;
        paidReactionButton.setOnClickListener(new PeerStoriesView$$ExternalSyntheticLambda21(this, 5));
        this.starsButton.setOnLongClickListener(new PeerStoriesView$$ExternalSyntheticLambda2(this, 1));
        addView(this.starsButton, LayoutHelper.createFrame(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        addView(this.starsButtonEffectsView, LayoutHelper.createFrame(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void createPremiumBlockedText() {
        if (this.premiumBlockedText != null) {
            return;
        }
        if (this.chatActivityEnterView == null) {
            createEnterView();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.premiumBlockedText = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(R.drawable.mini_switch_lock);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.premiumBlockedText1 = textView;
        textView.setTextColor(-8026747);
        this.premiumBlockedText1.setTextSize(1, 16.0f);
        this.premiumBlockedText1.setText(LocaleController.getString(this.isGroup ? R.string.StoryGroupRepliesLocked : R.string.StoryRepliesLocked));
        TextView textView2 = new TextView(getContext());
        this.premiumBlockedText2 = textView2;
        textView2.setTextColor(-1);
        this.premiumBlockedText2.setTextSize(1, 12.0f);
        TextView textView3 = this.premiumBlockedText2;
        int iDp = AndroidUtilities.dp(40.0f);
        textView3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 452984831, 855638015, 855638015));
        this.premiumBlockedText2.setGravity(17);
        ScaleStateListAnimator.apply(this.premiumBlockedText2);
        this.premiumBlockedText2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.premiumBlockedText2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.premiumBlockedText.addView(imageView, LayoutHelper.createLinear(22, 22, 16, 12, 1, 4, 0));
        this.premiumBlockedText.addView(this.premiumBlockedText1, LayoutHelper.createLinear(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.premiumBlockedText.addView(this.premiumBlockedText2, LayoutHelper.createLinear(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.chatActivityEnterView.addView(this.premiumBlockedText, LayoutHelper.createFrame(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }

    public final void createReplyDisabledView() {
        if (this.replyDisabledTextView != null) {
            return;
        }
        MentionCell.AnonymousClass1 anonymousClass1 = new MentionCell.AnonymousClass1(getContext(), 6);
        this.replyDisabledTextView = anonymousClass1;
        anonymousClass1.setTextSize(1, 14.0f);
        this.replyDisabledTextView.setTextColor(ColorUtils.blendARGB(0.5f, -16777216, -1));
        this.replyDisabledTextView.setGravity(19);
        this.replyDisabledTextView.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.replyDisabledTextView, LayoutHelper.createFrame(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void createSelfPeerView() {
        if (this.selfView != null) {
            return;
        }
        TONIntroActivity.AnonymousClass2 anonymousClass2 = new TONIntroActivity.AnonymousClass2(this, getContext(), 13);
        this.selfView = anonymousClass2;
        anonymousClass2.setClickable(true);
        addView(this.selfView, LayoutHelper.createFrame(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        ?? r0 = new View(getContext()) {
            public final LoadingDrawable loadingDrawable = new LoadingDrawable();
            public final AnimatedFloat animatedFloat = new AnimatedFloat(250, CubicBezierInterpolator.DEFAULT);

            @Override
            public final void onDraw(Canvas canvas) {
                Canvas canvas2;
                super.onDraw(canvas);
                AnimatedFloat animatedFloat = this.animatedFloat;
                animatedFloat.setParent(this);
                PeerStoriesView.this.getClass();
                animatedFloat.set(0.0f, false);
                if (animatedFloat.get() != 0.0f) {
                    if (animatedFloat.get() != 1.0f) {
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (animatedFloat.get() * 255.0f), 31);
                    } else {
                        canvas2 = canvas;
                        canvas2.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    LoadingDrawable loadingDrawable = this.loadingDrawable;
                    loadingDrawable.setBounds(rectF);
                    loadingDrawable.setRadiiDp(24.0f);
                    loadingDrawable.setColors(ColorUtils.setAlphaComponent(-1, 20), ColorUtils.setAlphaComponent(-1, 50), ColorUtils.setAlphaComponent(-1, 50), ColorUtils.setAlphaComponent(-1, 70));
                    loadingDrawable.draw(canvas2);
                    invalidate();
                    canvas2.restore();
                }
            }
        };
        this.selfAvatarsContainer = r0;
        r0.setOnClickListener(new PeerStoriesView$$ExternalSyntheticLambda21(this, 0));
        this.selfView.addView(this.selfAvatarsContainer, LayoutHelper.createFrame(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        HwAvatarsImageView hwAvatarsImageView = new HwAvatarsImageView(getContext(), 0, false);
        this.selfAvatarsView = hwAvatarsImageView;
        hwAvatarsImageView.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.selfView.addView(this.selfAvatarsView, LayoutHelper.createFrame(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.selfStatusView = textView;
        textView.setTextSize(1, 14.0f);
        this.selfStatusView.setTextColor(-1);
        this.selfView.addView(this.selfStatusView, LayoutHelper.createFrame(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.sharedResources.deleteDrawable);
        AnonymousClass31 anonymousClass31 = this.selfAvatarsContainer;
        int iDp = AndroidUtilities.dp(15.0f);
        int alphaComponent = ColorUtils.setAlphaComponent(-1, 120);
        anonymousClass31.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, alphaComponent, alphaComponent));
        imageView.setBackground(Theme.createCircleSelectorDrawable(ColorUtils.setAlphaComponent(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
    }

    public final void createStealthModeItem(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        if (isBotsPreview() || this.currentStory.isLive) {
            return;
        }
        boolean zIsPremium = UserConfig.getInstance(this.currentAccount).isPremium();
        DarkThemeResourceProvider darkThemeResourceProvider = this.resourcesProvider;
        if (zIsPremium) {
            ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, darkThemeResourceProvider).setOnClickListener(new PeerStoriesView$$ExternalSyntheticLambda21(this, 6));
            return;
        }
        Drawable drawable = getContext().getDrawable(R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
        WebBrowserSettings.AnonymousClass1 anonymousClass1 = new WebBrowserSettings.AnonymousClass1(getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 1);
        ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, darkThemeResourceProvider);
        actionBarMenuSubItemAddItem.setOnClickListener(new PeerStoriesView$$ExternalSyntheticLambda21(this, 7));
        actionBarMenuSubItemAddItem.setIcon(anonymousClass1);
    }

    public final void createUnsupportedContainer() {
        if (this.unsupportedContainer != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.StoryUnsupported));
        int i = Theme.key_windowBackgroundWhiteBlackText;
        DarkThemeResourceProvider darkThemeResourceProvider = this.resourcesProvider;
        textView.setTextColor(Theme.getColor(i, darkThemeResourceProvider));
        TextView textView2 = new TextView(getContext());
        ScaleStateListAnimator.apply(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i2 = Theme.key_featuredStickers_buttonText;
        textView2.setTextColor(Theme.getColor(i2, darkThemeResourceProvider));
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        int iDp = AndroidUtilities.dp(8.0f);
        int color = Theme.getColor(Theme.key_featuredStickers_addButton, darkThemeResourceProvider);
        int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(i2, darkThemeResourceProvider), 30);
        textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, alphaComponent, alphaComponent));
        textView2.setOnClickListener(new PeerStoriesView$$ExternalSyntheticLambda21(this, 2));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 0.0f, 24.0f, 0.0f, 0.0f));
        frameLayout.addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.storyContainer.addView(frameLayout);
        this.unsupportedContainer = frameLayout;
    }

    public final void deleteStory() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
        builder.setTitle(LocaleController.getString(isBotsPreview() ? R.string.DeleteBotPreviewTitle : R.string.DeleteStoryTitle));
        builder.setMessage(LocaleController.getString(isBotsPreview() ? R.string.DeleteBotPreviewSubtitle : R.string.DeleteStorySubtitle));
        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new PeerStoriesView$$ExternalSyntheticLambda6(this, 2));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new BotWebViewSheet$$ExternalSyntheticLambda2(5));
        AlertDialog alertDialogCreate = builder.create();
        StoryViewer.this.showDialog(alertDialogCreate);
        alertDialogCreate.redPositive();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        LivePlayer livePlayer;
        LivePlayer livePlayer2;
        int i3 = NotificationCenter.storiesUpdated;
        StoryViewer storyViewer = this.storyViewer;
        boolean z = false;
        if (i == i3 || (i == NotificationCenter.storiesListUpdated && storyViewer.storiesList == objArr[0])) {
            Delegate delegate = this.delegate;
            if (delegate == null || !StoryViewer.this.isClosed) {
                if (this.isActive) {
                    updateStoryItems();
                    if (this.count == 0) {
                        if (this.deletedPeer) {
                            return;
                        }
                        this.deletedPeer = true;
                        ((StoryViewer.AnonymousClass5) this.delegate).switchToNextAndRemoveCurrentPeer();
                        return;
                    }
                    int i4 = this.selectedPosition;
                    ArrayList arrayList = this.storyItems;
                    int size = arrayList.size();
                    ArrayList arrayList2 = this.uploadingStories;
                    if (i4 >= arrayList2.size() + size) {
                        this.selectedPosition = (arrayList2.size() + arrayList.size()) - 1;
                    }
                    updatePosition(false);
                    if (this.isSelf || this.isChannel) {
                        updateUserViews(true);
                    }
                }
                TL_stories.PeerStories peerStories = storyViewer.overrideUserStories;
                if (peerStories != null) {
                    this.storiesController.loadSkippedStories(peerStories, true);
                } else {
                    long j = this.dialogId;
                    if (j != 0) {
                        StoriesController storiesController = this.storiesController;
                        TL_stories.PeerStories storiesFromFullPeer = (TL_stories.PeerStories) storiesController.allStoriesMap.get(j);
                        if (storiesFromFullPeer == null) {
                            storiesFromFullPeer = storiesController.getStoriesFromFullPeer(j);
                            z = true;
                        }
                        storiesController.loadSkippedStories(storiesFromFullPeer, z);
                    }
                }
                ActionBarMenuSubItem actionBarMenuSubItem = this.editStoryItem;
                if (actionBarMenuSubItem != null) {
                    actionBarMenuSubItem.animate().alpha((this.storiesController.hasUploadingStories(this.dialogId) && this.currentStory.isVideo && !SharedConfig.allowPreparingHevcPlayers()) ? 0.5f : 1.0f).start();
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.storyQualityUpdate) {
            updatePosition(false);
            return;
        }
        if (i == NotificationCenter.emojiLoaded) {
            this.storyCaptionView.captionTextview.invalidate();
            return;
        }
        if (i == NotificationCenter.stealthModeChanged) {
            checkStealthMode(true);
            return;
        }
        if (i == NotificationCenter.storiesLimitUpdate) {
            StoriesController.StoryLimit storyLimitCheckStoryLimit = MessagesController.getInstance(this.currentAccount).getStoriesController().checkStoryLimit();
            if (storyLimitCheckStoryLimit == null || !storyLimitCheckStoryLimit.active(this.currentAccount, 1) || this.delegate == null) {
                return;
            }
            SendGiftSheet.AnonymousClass8 anonymousClass8 = new SendGiftSheet.AnonymousClass8(this, 4);
            Context contextFindActivity = AndroidUtilities.findActivity(getContext());
            if (contextFindActivity == null) {
                contextFindActivity = LaunchActivity.instance;
            }
            StoryViewer.this.showDialog(new LimitReachedBottomSheet(storyLimitCheckStoryLimit.getLimitReachedType(), anonymousClass8, contextFindActivity, this.currentAccount, null));
            return;
        }
        if (i == NotificationCenter.userIsPremiumBlockedUpadted) {
            TL_account.RequirementToContact requirementToContactIsUserContactBlocked = MessagesController.getInstance(this.currentAccount).isUserContactBlocked(this.dialogId);
            boolean z2 = this.dialogId >= 0 && !UserConfig.getInstance(this.currentAccount).isPremium() && DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked);
            if (this.isPremiumBlocked == z2 && this.starsPriceBlocked == DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked)) {
                return;
            }
            this.isPremiumBlocked = z2;
            this.starsPriceBlocked = DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked);
            updatePosition(false);
            checkStealthMode(true);
            return;
        }
        if (i == NotificationCenter.chatInfoDidLoad) {
            Object obj = objArr[0];
            if ((obj instanceof TLRPC.ChatFull) && this.dialogId == (-((TLRPC.ChatFull) obj).id)) {
                updatePosition(false);
                return;
            }
            return;
        }
        if (i != NotificationCenter.liveStoryUpdated) {
            if (i == NotificationCenter.didLoadSendAsPeers && ((Boolean) objArr[2]).booleanValue() && this.sendAsPeersObj == null) {
                if (storyViewer != null && (livePlayer = storyViewer.livePlayer) != null) {
                    TLRPC.GroupCall groupCall = livePlayer.call;
                    if (groupCall != null ? !groupCall.messages_enabled : false) {
                        return;
                    }
                }
                TLRPC.TL_channels_sendAsPeers sendAsPeers = MessagesController.getInstance(this.currentAccount).getSendAsPeers(this.dialogId, true);
                this.sendAsPeersObj = sendAsPeers;
                AnonymousClass19 anonymousClass19 = this.chatActivityEnterView;
                if (anonymousClass19 == null || sendAsPeers == null) {
                    return;
                }
                anonymousClass19.updateSendAsButton(true);
                return;
            }
            return;
        }
        long jLongValue = ((Long) objArr[0]).longValue();
        if (storyViewer == null || (livePlayer2 = storyViewer.livePlayer) == null || livePlayer2.getCallId() != jLongValue) {
            return;
        }
        updatePosition(false);
        AnonymousClass19 anonymousClass110 = this.chatActivityEnterView;
        if (anonymousClass110 != null) {
            anonymousClass110.checkSendButton(true);
            this.chatActivityEnterView.updateSendAsButton(true);
            checkStealthMode(true);
        }
        AnonymousClass10 anonymousClass10 = this.liveCommentsView;
        if (anonymousClass10 != null) {
            LivePlayer livePlayer3 = anonymousClass10.livePlayer;
            if (anonymousClass10.lastMinStars != (livePlayer3 != null ? livePlayer3.getSendPaidMessagesStars() : 0L)) {
                anonymousClass10.adapter.update(true);
            }
        }
    }

    public final boolean disabledPaidFeatures(boolean z) {
        LivePlayer livePlayer;
        TLRPC.Peer defaultSendAs;
        LivePlayer livePlayer2;
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        long j = this.dialogId;
        StoryViewer storyViewer = this.storyViewer;
        if (j >= 0 || (livePlayer2 = storyViewer.livePlayer) == null) {
            if (j < 0 || storyViewer == null || (livePlayer = storyViewer.livePlayer) == null || !livePlayer.isAdmin()) {
                return false;
            }
            return !z || (defaultSendAs = storyViewer.livePlayer.getDefaultSendAs()) == null || this.dialogId == DialogObject.getPeerDialogId(defaultSendAs) || DialogObject.getPeerDialogId(defaultSendAs) == clientUserId || this.dialogId == clientUserId;
        }
        if (!z) {
            return false;
        }
        TLRPC.Peer defaultSendAs2 = livePlayer2.getDefaultSendAs();
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
        if (storyViewer.livePlayer.isAdmin() || ChatObject.canManageCalls(chat)) {
            return defaultSendAs2 == null || this.dialogId == DialogObject.getPeerDialogId(defaultSendAs2) || DialogObject.getPeerDialogId(defaultSendAs2) == UserConfig.getInstance(this.currentAccount).getClientUserId();
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2;
        updateViewOffsets();
        if (this.isChannel && (animatedTextDrawable2 = this.reactionsCounter) != null) {
            animatedTextDrawable2.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        if (this.isChannel && (animatedTextDrawable = this.repostCounter) != null) {
            animatedTextDrawable.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z = this.movingReaction;
        LinearLayout linearLayout = this.bottomActionsLinearLayout;
        AnonymousClass7 anonymousClass7 = this.likeButtonContainer;
        if (z) {
            float measuredWidth = (anonymousClass7.getMeasuredWidth() / 2.0f) + anonymousClass7.getX() + linearLayout.getX();
            float measuredHeight = (anonymousClass7.getMeasuredHeight() / 2.0f) + anonymousClass7.getY() + linearLayout.getY();
            int iDp = AndroidUtilities.dp(24.0f);
            float f = iDp / 2.0f;
            float fLerp = AndroidUtilities.lerp(this.movingReactionFromX, measuredWidth - f, CubicBezierInterpolator.EASE_OUT.getInterpolation(this.movingReactionProgress));
            float fLerp2 = AndroidUtilities.lerp(this.movingReactionFromY, measuredHeight - f, this.movingReactionProgress);
            int iLerp = AndroidUtilities.lerp(this.movingReactionFromSize, iDp, this.movingReactionProgress);
            if (this.drawAnimatedEmojiAsMovingReaction) {
                AnimatedEmojiDrawable animatedEmojiDrawable = this.reactionMoveDrawable;
                if (animatedEmojiDrawable != null) {
                    float f2 = iLerp;
                    animatedEmojiDrawable.setBounds((int) fLerp, (int) fLerp2, (int) (fLerp + f2), (int) (fLerp2 + f2));
                    this.reactionMoveDrawable.draw(canvas);
                }
            } else {
                ImageReceiver imageReceiver = this.reactionMoveImageReceiver;
                float f3 = iLerp;
                imageReceiver.setImageCoords(fLerp, fLerp2, f3, f3);
                imageReceiver.draw(canvas);
            }
        }
        if (this.drawReactionEffect) {
            float measuredWidth2 = (anonymousClass7.getMeasuredWidth() / 2.0f) + anonymousClass7.getX() + linearLayout.getX();
            float measuredHeight2 = (anonymousClass7.getMeasuredHeight() / 2.0f) + anonymousClass7.getY() + linearLayout.getY();
            int iDp2 = AndroidUtilities.dp(120.0f);
            if (this.drawAnimatedEmojiAsMovingReaction) {
                AnimatedEmojiEffect animatedEmojiEffect = this.emojiReactionEffect;
                if (animatedEmojiEffect != null) {
                    float f4 = iDp2 / 2.0f;
                    int i = (int) (measuredWidth2 - f4);
                    int i2 = (int) (measuredHeight2 - f4);
                    int i3 = (int) (measuredWidth2 + f4);
                    int i4 = (int) (measuredHeight2 + f4);
                    Rect rect = animatedEmojiEffect.bounds;
                    rect.set(i, i2, i3, i4);
                    ImageReceiver imageReceiver2 = animatedEmojiEffect.effectImageReceiver;
                    if (imageReceiver2 != null) {
                        imageReceiver2.setImageCoords(rect);
                    }
                    this.emojiReactionEffect.draw(canvas);
                    AnimatedEmojiEffect animatedEmojiEffect2 = this.emojiReactionEffect;
                    animatedEmojiEffect2.getClass();
                    if (System.currentTimeMillis() - animatedEmojiEffect2.startTime > 2500) {
                        this.emojiReactionEffect.removeView(this);
                        this.emojiReactionEffect = null;
                        this.drawReactionEffect = false;
                    }
                } else {
                    this.drawReactionEffect = false;
                }
            } else {
                ImageReceiver imageReceiver3 = this.reactionEffectImageReceiver;
                float f5 = iDp2;
                float f6 = f5 / 2.0f;
                imageReceiver3.setImageCoords(measuredWidth2 - f6, measuredHeight2 - f6, f5, f5);
                imageReceiver3.draw(canvas);
                if (imageReceiver3.getLottieAnimation() != null && imageReceiver3.getLottieAnimation().isLastFrame()) {
                    this.drawReactionEffect = false;
                }
            }
        }
        AnonymousClass19 anonymousClass19 = this.chatActivityEnterView;
        if (anonymousClass19 != null) {
            anonymousClass19.drawRecordedPannel(canvas);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode;
        float fDp;
        if (view == this.mentionContainer) {
            canvas.save();
            canvas.clipRect(0.0f, getY(), getMeasuredWidth(), getY() + getMeasuredHeight());
            boolean zDrawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return zDrawChild;
        }
        AnonymousClass19 anonymousClass19 = this.chatActivityEnterView;
        Paint paint = this.inputBackgroundPaint;
        AnonymousClass7 anonymousClass7 = this.likeButtonContainer;
        SharedResources sharedResources = this.sharedResources;
        if (view == anonymousClass19) {
            float f = this.progressToKeyboard;
            StoryItemHolder storyItemHolder = this.currentStory;
            if (f > 0.0f && !storyItemHolder.isLive) {
                sharedResources.dimPaint.setAlpha((int) (f * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), sharedResources.dimPaint);
            }
            sharedResources.rect1.set(this.chatActivityEnterView.getX(), this.chatActivityEnterView.getY() + this.chatActivityEnterView.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.chatActivityEnterView.getX() + this.chatActivityEnterView.getMeasuredWidth(), this.chatActivityEnterView.getY() + this.chatActivityEnterView.getMeasuredHeight());
            float fDp2 = AndroidUtilities.dp(40.0f);
            if (storyItemHolder.isLive) {
                fDp = AndroidUtilities.dp(46.0f);
                fDp2 = AndroidUtilities.dp(46.0f);
                MuteButton muteButton = this.muteButton;
                if (muteButton != null && muteButton.getVisibility() == 0) {
                    fDp2 += AndroidUtilities.dp(46.0f);
                }
            } else {
                if (this.allowShare) {
                    fDp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.allowRepost && this.isChannel) {
                    fDp2 += AndroidUtilities.dp(46.0f);
                }
                if (anonymousClass7 != null && anonymousClass7.getVisibility() == 0) {
                    fDp2 = (fDp2 - AndroidUtilities.dp(40.0f)) + anonymousClass7.getLayoutParams().width;
                }
                fDp = 0.0f;
            }
            RectF rectF = sharedResources.rect2;
            rectF.set(AndroidUtilities.dp(10.0f) + fDp, ((this.chatActivityEnterView.getY() + this.chatActivityEnterView.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - fDp2, (this.chatActivityEnterView.getY() + this.chatActivityEnterView.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.chatActivityEnterView.setTranslationX((1.0f - this.progressToKeyboard) * fDp);
            this.chatActivityEnterView.getEditField().setTranslationY(DiffUtil.m(1.0f, this.progressToKeyboard, -AndroidUtilities.dp(2.0f), this.chatActivityEnterView.getMeasuredHeight() > AndroidUtilities.dp(50.0f) ? 0.0f + ((1.0f - this.progressToKeyboard) * (this.chatActivityEnterView.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) : 0.0f));
            float fDp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            RectF rectF2 = sharedResources.rect1;
            float f2 = this.progressToKeyboard;
            RectF rectF3 = sharedResources.finalRect;
            AndroidUtilities.lerp(rectF, rectF2, f2, rectF3);
            BlurredBackgroundDrawable blurredBackgroundDrawable = this.inputFieldBackground;
            if (blurredBackgroundDrawable != null) {
                blurredBackgroundDrawable.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                blurredBackgroundDrawable.setRadius(fDp3);
                blurredBackgroundDrawable.setAlpha((int) ((1.0f - this.outT) * (1.0f - this.progressToDismiss) * 255.0f * getHideInterfaceAlpha()));
                blurredBackgroundDrawable.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, fDp3, fDp3, paint);
            }
            if (this.progressToKeyboard < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean zDrawChild2 = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild2;
            }
        } else {
            if (anonymousClass19 != null && anonymousClass19.isPopupView(view)) {
                float fDp4 = AndroidUtilities.dp(30.0f);
                sharedResources.popupRect.set(0.0f, view.getY() + AndroidUtilities.dp(1.0f), getWidth(), AndroidUtilities.dp(20.0f) + getHeight());
                Path path = this.clipPath;
                path.rewind();
                RectF rectF4 = sharedResources.popupRect;
                path.addRoundRect(rectF4, fDp4, fDp4, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                BlurredBackgroundDrawable blurredBackgroundDrawable2 = this.emojiKeyboardBackground;
                if (blurredBackgroundDrawable2 != null) {
                    blurredBackgroundDrawable2.setBounds((int) rectF4.left, (int) rectF4.top, (int) rectF4.right, (int) rectF4.bottom);
                    blurredBackgroundDrawable2.setRadius(fDp4, fDp4, fDp4, fDp4);
                    blurredBackgroundDrawable2.setAlpha(255);
                    blurredBackgroundDrawable2.draw(canvas);
                } else {
                    canvas.drawRoundRect(rectF4, fDp4, fDp4, paint);
                }
                boolean zDrawChild3 = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild3;
            }
            ReactionsContainerLayout reactionsContainerLayout = this.reactionsContainerLayout;
            if (view != reactionsContainerLayout || this.chatActivityEnterView == null) {
                ReactionsContainerLayout reactionsContainerLayout2 = this.likesReactionLayout;
                if (view == reactionsContainerLayout2) {
                    view.setTranslationY((this.bottomActionsLinearLayout.getY() + (anonymousClass7.getY() + (-(reactionsContainerLayout2.getMeasuredHeight() - this.likesReactionLayout.getPaddingBottom())))) - AndroidUtilities.dp(18.0f));
                } else {
                    AnonymousClass4 anonymousClass4 = this.storyContainer;
                    if (view == anonymousClass4 && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (blurredBackgroundSourceRenderNode = this.blurredBackgroundSourceRenderNodeWithSaturation) != null && !blurredBackgroundSourceRenderNode.inRecording) {
                        RecordingCanvas recordingCanvasBeginRecording = blurredBackgroundSourceRenderNode.beginRecording(getMeasuredWidth(), getMeasuredHeight());
                        recordingCanvasBeginRecording.drawColor(ColorUtils.blendARGB(0.2f, -16777216, -1));
                        recordingCanvasBeginRecording.translate(anonymousClass4.getX(), anonymousClass4.getY());
                        view.draw(recordingCanvasBeginRecording);
                        blurredBackgroundSourceRenderNode.endRecording();
                    }
                }
            } else {
                view.setTranslationY(((this.chatActivityEnterView.getY() + this.chatActivityEnterView.getAnimatedTop()) + (-reactionsContainerLayout.getMeasuredHeight())) - AndroidUtilities.dp(18.0f));
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public final void drawPlayingBitmap(Canvas canvas, int i, int i2) {
        TextureView textureView;
        VideoPlayerSharedScope videoPlayerSharedScope = this.playerSharedScope;
        AspectRatioFrameLayout aspectRatioFrameLayout = videoPlayerSharedScope.renderView;
        if (aspectRatioFrameLayout != null && videoPlayerSharedScope.surfaceView != null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface(videoPlayerSharedScope.surfaceView, bitmapCreateBitmap);
            }
            if (bitmapCreateBitmap != null) {
                canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        if (aspectRatioFrameLayout != null && (textureView = videoPlayerSharedScope.textureView) != null) {
            Bitmap bitmap = textureView.getBitmap(i, i2);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        canvas.save();
        AnonymousClass4 anonymousClass4 = this.storyContainer;
        canvas.scale(i / anonymousClass4.getMeasuredWidth(), i2 / anonymousClass4.getMeasuredHeight());
        this.imageReceiver.draw(canvas);
        canvas.restore();
    }

    public final void editPrivacy(StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, TL_stories.StoryItem storyItem) {
        Delegate delegate = this.delegate;
        StoryPrivacyBottomSheet storyPrivacyBottomSheet = new StoryPrivacyBottomSheet(getContext(), storyItem.pinned ? Integer.MAX_VALUE : storyItem.expire_date - storyItem.date, this.resourcesProvider);
        storyPrivacyBottomSheet.setValue(storyPrivacy);
        CommunitySheet.AnonymousClass9 anonymousClass9 = storyPrivacyBottomSheet.viewPager;
        if (anonymousClass9 != null) {
            for (View view : anonymousClass9.getViewPages()) {
                if (view instanceof StoryPrivacyBottomSheet.Page) {
                    ((StoryPrivacyBottomSheet.Page) view).updateButton(false);
                }
            }
        }
        storyPrivacyBottomSheet.isEdit(true);
        storyPrivacyBottomSheet.onDone = new RateCallLayout$$ExternalSyntheticLambda1(19, this, storyItem);
        StoryViewer.this.showDialog(storyPrivacyBottomSheet);
    }

    public final boolean findClickableView(ViewGroup viewGroup, float f, float f2, boolean z) {
        HintView2 hintView2;
        AnonymousClass19 anonymousClass19;
        VideoPlayerSharedScope videoPlayerSharedScope;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        if (viewGroup != null) {
            HintView2 hintView3 = this.privacyHint;
            if ((hintView3 == null || !hintView3.shown()) && ((hintView2 = this.soundTooltip) == null || !hintView2.shown())) {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        AnonymousClass5 anonymousClass5 = this.storyCaptionView;
                        if (childAt == anonymousClass5) {
                            Rect rect = AndroidUtilities.rectTmp2;
                            childAt.getHitRect(rect);
                            if (rect.contains((int) f, (int) f2)) {
                                float top = f2 - childAt.getTop();
                                if (anonymousClass5.captionTextview.progressToExpand == 1.0f && !anonymousClass5.disableTouches) {
                                    if (top > anonymousClass5.captionTextview.getTranslationY() + (anonymousClass5.captionContainer.getTop() - anonymousClass5.getScrollY())) {
                                    }
                                }
                            }
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        childAt.getHitRect(rect2);
                        if ((childAt != this.storyContainer || (videoPlayerSharedScope = this.playerSharedScope) == null || (aspectRatioFrameLayout = videoPlayerSharedScope.renderView) == null || !findClickableView(aspectRatioFrameLayout, f - childAt.getX(), f2 - childAt.getY(), z)) && (!childAt.isClickable() || !rect2.contains((int) f, (int) f2))) {
                            AnonymousClass3 anonymousClass3 = this.storyAreasView;
                            if (childAt == anonymousClass3 && anonymousClass3.selectedArea == null && (f < AndroidUtilities.dp(60.0f) || f > viewGroup.getMeasuredWidth() - AndroidUtilities.dp(60.0f))) {
                                for (int i2 = 0; i2 < anonymousClass3.getChildCount(); i2++) {
                                    View childAt2 = anonymousClass3.getChildAt(i2);
                                    if (childAt2 != anonymousClass3.hintsContainer && (childAt2 instanceof StoryReactionWidgetView)) {
                                        Matrix matrix = childAt2.getMatrix();
                                        Matrix matrix2 = anonymousClass3.matrix;
                                        matrix.invert(matrix2);
                                        float[] fArr = anonymousClass3.point;
                                        fArr[0] = f;
                                        fArr[1] = f2;
                                        matrix2.mapPoints(fArr);
                                        if (fArr[0] < childAt2.getLeft() || fArr[0] > childAt2.getRight() || fArr[1] < childAt2.getTop() || fArr[1] > childAt2.getBottom()) {
                                        }
                                    }
                                }
                            } else {
                                AnonymousClass10 anonymousClass10 = this.liveCommentsView;
                                if (childAt == anonymousClass10) {
                                    anonymousClass10.topListView.getHitRect(rect2);
                                    float x = f - anonymousClass10.getX();
                                    LiveCommentsView.AnonymousClass4 anonymousClass4 = anonymousClass10.topListView;
                                    if (!rect2.contains((int) (x - anonymousClass4.getX()), (int) ((f2 - anonymousClass10.getY()) - anonymousClass4.getY()))) {
                                        if (anonymousClass10.collapsed) {
                                            continue;
                                        } else if (!this.keyboardVisible) {
                                            if (f2 <= anonymousClass10.top() + anonymousClass10.getY()) {
                                                float y = f2 - anonymousClass10.getY();
                                                LiveCommentsView.AnonymousClass1 anonymousClass1 = anonymousClass10.listView;
                                                if (anonymousClass1.findChildViewUnder(f, y - anonymousClass1.getY()) != null) {
                                                }
                                            }
                                        }
                                    }
                                } else if ((!this.keyboardVisible || childAt != this.chatActivityEnterView || f2 <= rect2.top) && ((z || !rect2.contains((int) f, (int) f2) || (((!childAt.isClickable() && childAt != this.reactionsContainerLayout) || !childAt.isEnabled()) && ((anonymousClass19 = this.chatActivityEnterView) == null || childAt != anonymousClass19.getRecordCircle()))) && (!childAt.isEnabled() || !(childAt instanceof ViewGroup) || !findClickableView((ViewGroup) childAt, f - childAt.getX(), f2 - childAt.getY(), z)))) {
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.day;
    }

    public long getCurrentPeer() {
        return this.dialogId;
    }

    public int getListPosition() {
        return this.listPosition;
    }

    public Bitmap getPlayingBitmap() {
        AnonymousClass4 anonymousClass4 = this.storyContainer;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(anonymousClass4.getWidth(), anonymousClass4.getHeight(), Bitmap.Config.ARGB_8888);
        drawPlayingBitmap(new Canvas(bitmapCreateBitmap), bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
        return bitmapCreateBitmap;
    }

    public int getSelectedPosition() {
        return this.selectedPosition;
    }

    public StoriesController getStoriesController() {
        return MessagesController.getInstance(this.currentAccount).getStoriesController();
    }

    public int getStoriesCount() {
        return Math.max(this.totalStoriesCount, this.storyItems.size()) + this.uploadingStories.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.storyItems;
    }

    public final boolean hitButton(View view, MotionEvent motionEvent) {
        float x = getX();
        AnonymousClass4 anonymousClass4 = this.storyContainer;
        float x2 = view.getX() + anonymousClass4.getX() + x;
        float y = view.getY() + anonymousClass4.getY() + getY();
        return motionEvent.getX() >= x2 && motionEvent.getX() <= x2 + ((float) view.getWidth()) && motionEvent.getY() >= y && motionEvent.getY() <= y + ((float) view.getHeight());
    }

    public final boolean isBotsPreview() {
        StoriesController.StoriesList storiesList;
        StoryViewer storyViewer = this.storyViewer;
        return (storyViewer == null || (storiesList = storyViewer.storiesList) == null || storiesList.type != 4) ? false : true;
    }

    public abstract boolean isSelectedPeer();

    public final void lambda$animateOut$59(ValueAnimator valueAnimator) {
        this.outT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = (-AndroidUtilities.dp(8.0f)) * this.outT;
        PeerHeaderView peerHeaderView = this.headerView;
        peerHeaderView.setTranslationY(f);
        peerHeaderView.setAlpha(1.0f - this.outT);
        ImageView imageView = this.optionsIconView;
        imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * this.outT);
        imageView.setAlpha(1.0f - this.outT);
        ImageView imageView2 = this.pipIconView;
        imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * this.outT);
        imageView2.setAlpha(1.0f - this.outT);
        float f2 = (-AndroidUtilities.dp(8.0f)) * this.outT;
        ActionBar.AnonymousClass8 anonymousClass8 = this.muteIconContainer;
        anonymousClass8.setTranslationY(f2);
        anonymousClass8.setAlpha((1.0f - this.outT) * this.muteIconViewAlpha);
        TONIntroActivity.AnonymousClass2 anonymousClass2 = this.selfView;
        if (anonymousClass2 != null) {
            anonymousClass2.setTranslationY(AndroidUtilities.dp(8.0f) * this.outT);
            this.selfView.setAlpha(1.0f - this.outT);
        }
        StoryPrivacyButton storyPrivacyButton = this.privacyButton;
        if (storyPrivacyButton != null) {
            storyPrivacyButton.setTranslationY((-AndroidUtilities.dp(8.0f)) * this.outT);
            storyPrivacyButton.setAlpha(1.0f - this.outT);
        }
        this.storyCaptionView.setAlpha(1.0f - this.outT);
        Delegate delegate = this.delegate;
        float f3 = delegate == null ? 0.0f : StoryViewer.this.progressToDismiss;
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        AnonymousClass7 anonymousClass7 = this.likeButtonContainer;
        if (anonymousClass7 != null) {
            anonymousClass7.setAlpha((1.0f - this.outT) * (1.0f - f3) * hideInterfaceAlpha);
        }
        ImageView imageView3 = this.shareButton;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - this.outT) * (1.0f - f3) * hideInterfaceAlpha);
        }
        AnonymousClass6 anonymousClass6 = this.repostButtonContainer;
        if (anonymousClass6 != null) {
            anonymousClass6.setAlpha((1.0f - this.outT) * (1.0f - f3) * hideInterfaceAlpha);
        }
        AnonymousClass19 anonymousClass19 = this.chatActivityEnterView;
        if (anonymousClass19 != null) {
            anonymousClass19.setAlpha(1.0f - this.outT);
            invalidate();
        }
        this.storyContainer.invalidate();
    }

    public final void likeStory(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        boolean z;
        TLRPC.Reaction reaction;
        StoryItemHolder storyItemHolder = this.currentStory;
        TL_stories.StoryItem storyItem = storyItemHolder.storyItem;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        boolean z2 = reaction2 != null;
        if (reaction2 != null && visibleReaction == null) {
            animateLikeButton();
            this.storiesController.setStoryReaction(this.dialogId, storyItemHolder.storyItem, null);
        } else if (visibleReaction == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.currentAccount).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.drawAnimatedEmojiAsMovingReaction = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String filterForAroundAnimation = ReactionsEffectOverlay.getFilterForAroundAnimation();
                ImageReceiver imageReceiver = this.reactionEffectImageReceiver;
                imageReceiver.setImage(ImageLocation.getForDocument(document), filterForAroundAnimation, null, null, null, 0);
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().setCurrentFrame(0, false, true);
                }
                this.drawReactionEffect = true;
                ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = new ReactionsLayoutInBubble.VisibleReaction();
                String str = tL_availableReaction.reaction;
                visibleReaction2.emojicon = str;
                visibleReaction2.hash = str.hashCode();
                this.storiesController.setStoryReaction(this.dialogId, storyItemHolder.storyItem, visibleReaction2);
            }
        } else {
            animateLikeButton();
            this.storiesController.setStoryReaction(this.dialogId, storyItemHolder.storyItem, visibleReaction);
        }
        TL_stories.StoryItem storyItem2 = storyItemHolder.storyItem;
        AnonymousClass7 anonymousClass7 = this.likeButtonContainer;
        if (storyItem2 == null || (reaction = storyItem2.sent_reaction) == null) {
            this.storiesLikeButton.setReaction(null);
            anonymousClass7.setContentDescription(LocaleController.getString(R.string.AccDescrLike));
            z = false;
        } else {
            z2 = !z2;
            this.storiesLikeButton.setReaction(ReactionsLayoutInBubble.VisibleReaction.fromTL(reaction));
            anonymousClass7.setContentDescription(LocaleController.getString(R.string.AccDescrLiked));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z = true;
        }
        if (this.isChannel && z2) {
            TL_stories.StoryItem storyItem3 = storyItemHolder.storyItem;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = storyItemHolder.storyItem.views;
            int i = storyViews.reactions_count + (z ? 1 : -1);
            storyViews.reactions_count = i;
            if (i < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = storyItemHolder.storyItem;
        ReactionsUtils.applyForStoryViews(reaction2, storyItem4.sent_reaction, storyItem4.views);
        updateUserViews(true);
    }

    public final boolean needEnterText() {
        AnonymousClass19 anonymousClass19 = this.chatActivityEnterView;
        if (anonymousClass19 == null) {
            return false;
        }
        boolean zIsKeyboardVisible = anonymousClass19.isKeyboardVisible();
        if (zIsKeyboardVisible) {
            this.chatActivityEnterView.showEmojiView();
        }
        AndroidUtilities.runOnUIThread(new PeerStoriesView$$ExternalSyntheticLambda3(this, 1), 300L);
        return zIsKeyboardVisible;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        this.imageReceiver.onAttachedToWindow();
        this.rightPreloadImageReceiver.onAttachedToWindow();
        this.leftPreloadImageReceiver.onAttachedToWindow();
        this.reactionEffectImageReceiver.onAttachedToWindow();
        this.reactionMoveImageReceiver.onAttachedToWindow();
        AnonymousClass19 anonymousClass19 = this.chatActivityEnterView;
        if (anonymousClass19 != null) {
            anonymousClass19.onResume();
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.preloadReactionHolders;
            if (i >= arrayList.size()) {
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
            ((ReactionImageHolder) arrayList.get(i)).onAttachedToWindow(true);
            i++;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        this.imageReceiver.onDetachedFromWindow();
        this.rightPreloadImageReceiver.onDetachedFromWindow();
        this.leftPreloadImageReceiver.onDetachedFromWindow();
        this.reactionEffectImageReceiver.onDetachedFromWindow();
        this.reactionMoveImageReceiver.onDetachedFromWindow();
        AnonymousClass19 anonymousClass19 = this.chatActivityEnterView;
        if (anonymousClass19 != null) {
            anonymousClass19.onPause();
        }
        AnimatedEmojiDrawable animatedEmojiDrawable = this.reactionMoveDrawable;
        if (animatedEmojiDrawable != null) {
            animatedEmojiDrawable.removeView(this);
            this.reactionMoveDrawable = null;
        }
        AnimatedEmojiEffect animatedEmojiEffect = this.emojiReactionEffect;
        if (animatedEmojiEffect != null) {
            animatedEmojiEffect.removeView(this);
            this.emojiReactionEffect = null;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.preloadReactionHolders;
            if (i >= arrayList.size()) {
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
            ((ReactionImageHolder) arrayList.get(i)).onAttachedToWindow(false);
            i++;
        }
    }

    public final void onHighlightLiveMessage() {
        CharSequence charSequence;
        int length;
        long[] jArr;
        MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.chatActivityEnterView.getTextWithEntities();
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        TLRPC.Peer defaultSendAs = this.storyViewer.livePlayer.getDefaultSendAs();
        if (defaultSendAs != null) {
            clientUserId = DialogObject.getPeerDialogId(defaultSendAs);
        }
        final Context context = getContext();
        final int i = this.currentAccount;
        String shortName = DialogObject.getShortName(i, this.dialogId);
        long messageMinPrice = getMessageMinPrice();
        long j = this.messageStars;
        RichEditor$$ExternalSyntheticLambda53 richEditor$$ExternalSyntheticLambda53 = new RichEditor$$ExternalSyntheticLambda53(this, 4);
        final DarkThemeResourceProvider darkThemeResourceProvider = new DarkThemeResourceProvider();
        BottomSheet bottomSheet = new BottomSheet(context, false, false, darkThemeResourceProvider);
        bottomSheet.fixNavigationBar();
        bottomSheet.applyBottomPadding = false;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        bottomSheet.customView = linearLayout;
        int[] iArr = MessagesController.getInstance(i).starsGroupcallMessageLimits;
        CharSequence textWithEntities2 = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        if (textWithEntities2 instanceof Spannable) {
            Spannable spannable = (Spannable) textWithEntities2;
            charSequence = textWithEntities2;
            length = ((AnimatedEmojiSpan[]) spannable.getSpans(0, charSequence.length(), AnimatedEmojiSpan.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)).length;
        } else {
            charSequence = textWithEntities2;
            length = 0;
        }
        int iMax = (int) Math.max(messageMinPrice, j <= 0 ? 100L : j);
        int length2 = (iArr.length / 7) - 1;
        while (length2 >= 0) {
            int i2 = length2 * 7;
            int i3 = iArr[i2];
            int[] iArr2 = iArr;
            int i4 = iArr2[i2 + 2];
            if (length <= iArr2[i2 + 3] && charSequence.length() <= i4) {
                iMax = Math.max(iMax, i3);
                break;
            } else {
                length2--;
                iArr = iArr2;
            }
        }
        final long[] jArr2 = {iMax};
        final ColoredImageSpan[] coloredImageSpanArr = new ColoredImageSpan[1];
        final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, null);
        final LiveCommentsView.Message message = new LiveCommentsView.Message();
        message.dialogId = clientUserId;
        message.text = textWithEntities;
        message.stars = jArr2[0];
        final LiveCommentsView.LiveCommentView liveCommentView = new LiveCommentsView.LiveCommentView(context, i, true);
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(0, context);
        final TONIntroActivity.AnonymousClass2 anonymousClass2 = new TONIntroActivity.AnonymousClass2(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), darkThemeResourceProvider);
        linearLayoutM.addView(anonymousClass2, LayoutHelper.createLinear(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        final TONIntroActivity.AnonymousClass2 anonymousClass3 = new TONIntroActivity.AnonymousClass2(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), darkThemeResourceProvider);
        linearLayoutM.addView(anonymousClass3, LayoutHelper.createLinear(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        final TONIntroActivity.AnonymousClass2 anonymousClass4 = new TONIntroActivity.AnonymousClass2(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), darkThemeResourceProvider);
        linearLayoutM.addView(anonymousClass4, LayoutHelper.createLinear(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        final ?? r4 = new StarsReactionsSheet.StarsSlider(context, darkThemeResourceProvider) {
            @Override
            public final void onValueChanged(int i5) {
                callbackArr[0].run(Integer.valueOf(i5));
            }
        };
        final boolean[] zArr = {true};
        final Utilities.Callback[] callbackArr = {new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Integer num = (Integer) obj;
                long jIntValue = num.intValue();
                long[] jArr3 = jArr2;
                jArr3[0] = jIntValue;
                buttonWithCounterView.setText(StarsIntroActivity.replaceStars(false, LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(jIntValue, ',')), coloredImageSpanArr), true);
                long j2 = jArr3[0];
                LiveCommentsView.Message message2 = message;
                message2.stars = j2;
                liveCommentView.set(message2);
                int iIntValue = num.intValue();
                int i5 = i;
                int tierOption = HighlightMessageSheet.getTierOption(i5, iIntValue, 0);
                int tierOption2 = HighlightMessageSheet.getTierOption(i5, num.intValue(), 1);
                int tierOption3 = HighlightMessageSheet.getTierOption(i5, num.intValue(), 2);
                ((AnimatedTextView) anonymousClass2.this$0).setText(tierOption >= 60 ? LocaleController.formatString(R.string.SlowmodeMinutes, Integer.valueOf(tierOption / 60)) : LocaleController.formatString(R.string.SlowmodeSeconds, Integer.valueOf(tierOption)), true);
                ((AnimatedTextView) anonymousClass3.this$0).setText(LocaleController.formatNumber(tierOption2, ','), true);
                ((AnimatedTextView) anonymousClass4.this$0).setText(LocaleController.formatNumber(tierOption3, ','), true);
                int tierOption4 = HighlightMessageSheet.getTierOption(i5, num.intValue(), 3);
                int tierOption5 = HighlightMessageSheet.getTierOption(i5, num.intValue(), 4);
                boolean[] zArr2 = zArr;
                setColor(tierOption4, tierOption5, true ^ zArr2[0]);
                zArr2[0] = false;
            }
        }};
        liveCommentView.set(message);
        int i5 = 9;
        int[] iArr3 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int i6 = MessagesController.getInstance(i).starsGroupcallMessageAmountMax;
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            if (i7 >= i5) {
                jArr = jArr2;
                break;
            }
            jArr = jArr2;
            if (iArr3[i7] >= messageMinPrice) {
                if (i7 > 0 && arrayList.isEmpty() && iArr3[i7] > messageMinPrice) {
                    arrayList.add(Integer.valueOf((int) messageMinPrice));
                }
                int i8 = iArr3[i7];
                if (i8 > i6) {
                    arrayList.add(Integer.valueOf(i6));
                    break;
                } else {
                    arrayList.add(Integer.valueOf(i8));
                    if (iArr3[i7] == i6) {
                        break;
                    }
                }
            }
            i7++;
            jArr2 = jArr;
            i5 = 9;
        }
        if (arrayList.isEmpty() || ((Integer) Fragment$$ExternalSyntheticOutline0.m(1, arrayList)).intValue() < i6) {
            arrayList.add(Integer.valueOf(i6));
        }
        int[] iArr4 = new int[arrayList.size()];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            iArr4[i9] = ((Integer) arrayList.get(i9)).intValue();
        }
        r4.stops = iArr4;
        r4.setValue((int) jArr[0]);
        linearLayout.addView((View) r4, LayoutHelper.createLinear(-1, -2, 0.0f, -52.0f, 0.0f, -42.0f));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(linearLayoutM, LayoutHelper.createLinear(-1, 56, 16.0f, 0.0f, 16.0f, 0.0f));
        int i10 = Theme.key_dialogTextBlack;
        TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, i10, true, darkThemeResourceProvider);
        textViewMakeTextView.setGravity(17);
        textViewMakeTextView.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 42.0f, 18.0f, 42.0f, 9.0f));
        TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, i10, false, darkThemeResourceProvider);
        textViewMakeTextView2.setGravity(17);
        ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0.m(R.string.LiveStoryHighlightText, new Object[]{shortName}, textViewMakeTextView2);
        linearLayout.addView(textViewMakeTextView2, LayoutHelper.createLinear(-1, -2, 42.0f, 0.0f, 42.0f, 0.0f));
        linearLayout.addView(liveCommentView, LayoutHelper.createLinear(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 16.0f, 0.0f, 16.0f, 12.0f));
        bottomSheet.show();
        buttonWithCounterView.setOnClickListener(new GiftOfferSheet$$ExternalSyntheticLambda2(richEditor$$ExternalSyntheticLambda53, jArr, bottomSheet, 12));
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.sharedResources.topOverlayGradient.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(72.0f));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        char c;
        ReactionsContainerLayout reactionsContainerLayout;
        AnonymousClass21 anonymousClass21;
        int i3 = 3;
        int i4 = 1;
        int i5 = 0;
        StoryViewer storyViewer = this.storyViewer;
        if (storyViewer.ATTACH_TO_FRAGMENT) {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        }
        if (this.isActive && this.shareAlert == null) {
            this.realKeyboardHeight = StoryViewer.this.realKeyboardHeight;
        } else {
            this.realKeyboardHeight = 0;
        }
        int size = storyViewer.ATTACH_TO_FRAGMENT ? View.MeasureSpec.getSize(i2) : View.MeasureSpec.getSize(i2) + this.realKeyboardHeight;
        int size2 = (int) ((View.MeasureSpec.getSize(i) * 16.0f) / 9.0f);
        if (size <= size2 || size2 > size) {
            size2 = size;
        }
        if (this.realKeyboardHeight < AndroidUtilities.dp(20.0f)) {
            this.realKeyboardHeight = 0;
        }
        int visibleEmojiPadding = this.realKeyboardHeight;
        ReactionsContainerLayout reactionsContainerLayout2 = this.likesReactionLayout;
        if (reactionsContainerLayout2 == null || reactionsContainerLayout2.getReactionsWindow() == null || this.likesReactionLayout.getReactionsWindow().dismissed) {
            AnonymousClass19 anonymousClass19 = this.chatActivityEnterView;
            if (anonymousClass19 != null && (anonymousClass19.isPopupShowing() || this.chatActivityEnterView.isWaitingForKeyboard())) {
                if (this.chatActivityEnterView.getEmojiView().getMeasuredHeight() == 0) {
                    visibleEmojiPadding = this.chatActivityEnterView.getEmojiPadding();
                } else if (this.chatActivityEnterView.isStickersExpanded()) {
                    this.chatActivityEnterView.checkStickresExpandHeight();
                    visibleEmojiPadding = this.chatActivityEnterView.getStickersExpandedHeight();
                } else {
                    visibleEmojiPadding = this.chatActivityEnterView.getVisibleEmojiPadding();
                }
            }
        } else {
            this.likesReactionLayout.getReactionsWindow().windowView.animate().translationY(-this.realKeyboardHeight).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).start();
            visibleEmojiPadding = 0;
        }
        boolean z = this.keyboardVisible;
        int i6 = this.lastKeyboardHeight;
        PeerHeaderView peerHeaderView = this.headerView;
        if (i6 != visibleEmojiPadding) {
            this.keyboardVisible = false;
            StoryItemHolder storyItemHolder = this.currentStory;
            if (visibleEmojiPadding <= 0 || !this.isActive) {
                f = 8.0f;
                AnonymousClass19 anonymousClass110 = this.chatActivityEnterView;
                if (anonymousClass110 != null) {
                    StoryViewer.saveDraft(this.dialogId, storyItemHolder.storyItem, anonymousClass110.getEditText());
                }
            } else {
                this.keyboardVisible = true;
                this.messageSent = false;
                this.lastOpenedKeyboardHeight = visibleEmojiPadding;
                if (this.reactionsContainerLayout == null) {
                    f = 8.0f;
                    ReactionsContainerLayout reactionsContainerLayout3 = new ReactionsContainerLayout(1, LaunchActivity.getLastFragment(), getContext(), this.currentAccount, new AnonymousClass18(this.resourcesProvider, i3));
                    this.reactionsContainerLayout = reactionsContainerLayout3;
                    reactionsContainerLayout3.setHint(LocaleController.getString(this.isGroup ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                    ReactionsContainerLayout reactionsContainerLayout4 = this.reactionsContainerLayout;
                    reactionsContainerLayout4.skipEnterAnimation = true;
                    addView(reactionsContainerLayout4, this.reactionsContainerIndex, LayoutHelper.createFrame(-2, 72.0f, 49, 0.0f, 0.0f, 0.0f, 64.0f));
                    this.reactionsContainerLayout.setDelegate(new AnonymousClass38());
                    this.reactionsContainerLayout.setMessage(null, null, true);
                } else {
                    f = 8.0f;
                }
                this.reactionsContainerLayout.setFragment(LaunchActivity.getLastFragment());
                this.reactionsContainerLayout.setHint(LocaleController.getString(this.isGroup ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
                ReactionsEffectOverlay reactionsEffectOverlay = ReactionsEffectOverlay.currentOverlay;
                if (reactionsEffectOverlay != null) {
                    reactionsEffectOverlay.dismissed = true;
                }
                ReactionsEffectOverlay reactionsEffectOverlay2 = ReactionsEffectOverlay.currentShortOverlay;
                if (reactionsEffectOverlay2 != null) {
                    reactionsEffectOverlay2.dismissed = true;
                }
            }
            AnonymousClass19 anonymousClass111 = this.chatActivityEnterView;
            if (anonymousClass111 != null) {
                anonymousClass111.setSuggestionButtonVisible(storyItemHolder.isLive && !disabledPaidFeatures(true) && this.keyboardVisible, true);
            }
            if (this.keyboardVisible && (anonymousClass21 = this.mentionContainer) != null) {
                anonymousClass21.setVisibility(0);
            }
            if (!this.keyboardVisible && (reactionsContainerLayout = this.reactionsContainerLayout) != null) {
                reactionsContainerLayout.reset();
            }
            peerHeaderView.setEnabled(!this.keyboardVisible);
            AnonymousClass19 anonymousClass112 = this.chatActivityEnterView;
            if (anonymousClass112 != null) {
                anonymousClass112.checkReactionsButton(!this.keyboardVisible);
            }
            if (this.isActive && this.keyboardVisible) {
                StoryViewer storyViewer2 = StoryViewer.this;
                if (!storyViewer2.keyboardVisible) {
                    storyViewer2.keyboardVisible = true;
                    storyViewer2.updatePlayingMode();
                }
            }
            this.lastKeyboardHeight = visibleEmojiPadding;
            ValueAnimator valueAnimator = this.keyboardAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.notificationsLocker.lock();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.animatingKeyboardHeight, visibleEmojiPadding);
            this.keyboardAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new PeerStoriesView$$ExternalSyntheticLambda20(this, i5));
            this.keyboardAnimator.addListener(new AnonymousClass15(this, i4));
            if (this.keyboardVisible) {
                this.keyboardAnimator.setDuration(250L);
                this.keyboardAnimator.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                storyViewer.cancelSwipeToReply();
            } else {
                this.keyboardAnimator.setDuration(500L);
                this.keyboardAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            }
            this.keyboardAnimator.start();
            boolean z2 = this.keyboardVisible;
            if (z2 != z) {
                if (z2) {
                    BitmapShaderTools bitmapShaderTools = this.bitmapShaderTools;
                    Canvas canvas = bitmapShaderTools.getCanvas();
                    Bitmap bitmap = bitmapShaderTools.getBitmap();
                    drawPlayingBitmap(canvas, bitmap.getWidth(), bitmap.getHeight());
                    if (AndroidUtilities.computePerceivedBrightness(AndroidUtilities.getDominantColor(bitmap)) < 0.15f) {
                        canvas.drawColor(ColorUtils.setAlphaComponent(-1, 102));
                    }
                    Utilities.blurBitmap(bitmap, 3);
                    Utilities.blurBitmap(bitmap, 3);
                    if (storyItemHolder.isLive) {
                        HintView2 hintView2 = this.highlightMessageHintView;
                        if (hintView2 == null) {
                            if (!disabledPaidFeatures(true) && MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) < 3) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) + 1).apply();
                                HintView2 hintView3 = new HintView2(getContext(), 3);
                                this.highlightMessageHintView = hintView3;
                                hintView3.setText(LocaleController.getString(R.string.LiveStoryHighlightHint));
                                this.highlightMessageHintView.setPadding(AndroidUtilities.dp(f), 0, AndroidUtilities.dp(f), 0);
                                this.highlightMessageHintView.setTextAlign(Layout.Alignment.ALIGN_OPPOSITE);
                                this.highlightMessageHintView.setOnHiddenListener(new LivePlayer$$ExternalSyntheticLambda17(23, this, hintView3));
                                addView(this.highlightMessageHintView, LayoutHelper.createFrame(-1, 100, 87));
                                this.highlightMessageHintView.show();
                                updateViewOffsets();
                            }
                        } else if (!hintView2.shown()) {
                            removeView(this.highlightMessageHintView);
                            if (!disabledPaidFeatures(true)) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) + 1).apply();
                                HintView2 hintView4 = new HintView2(getContext(), 3);
                                this.highlightMessageHintView = hintView4;
                                hintView4.setText(LocaleController.getString(R.string.LiveStoryHighlightHint));
                                this.highlightMessageHintView.setPadding(AndroidUtilities.dp(f), 0, AndroidUtilities.dp(f), 0);
                                this.highlightMessageHintView.setTextAlign(Layout.Alignment.ALIGN_OPPOSITE);
                                this.highlightMessageHintView.setOnHiddenListener(new LivePlayer$$ExternalSyntheticLambda17(23, this, hintView4));
                                addView(this.highlightMessageHintView, LayoutHelper.createFrame(-1, 100, 87));
                                this.highlightMessageHintView.show();
                                updateViewOffsets();
                            }
                        }
                    }
                } else {
                    AnonymousClass19 anonymousClass113 = this.chatActivityEnterView;
                    if (anonymousClass113 != null) {
                        anonymousClass113.getEditField().clearFocus();
                    }
                    HintView2 hintView5 = this.highlightMessageHintView;
                    if (hintView5 != null) {
                        hintView5.hide();
                    }
                }
                this.animateKeyboardOpening = true;
            } else {
                this.animateKeyboardOpening = false;
            }
        } else {
            f = 8.0f;
        }
        AnonymousClass19 anonymousClass114 = this.chatActivityEnterView;
        if (anonymousClass114 != null && anonymousClass114.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) this.chatActivityEnterView.getEmojiView().getLayoutParams()).gravity = 80;
        }
        AnonymousClass4 anonymousClass4 = this.storyContainer;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) anonymousClass4.getLayoutParams();
        layoutParams.height = size2;
        boolean z3 = size - size2 > AndroidUtilities.dp(64.0f);
        this.BIG_SCREEN = z3;
        int iDp = (size - ((z3 ? AndroidUtilities.dp(64.0f) : 0) + size2)) >> 1;
        layoutParams.topMargin = iDp;
        if (this.BIG_SCREEN) {
            this.enterViewBottomOffset = (((-iDp) + size) - size2) - AndroidUtilities.dp(64.0f);
        } else {
            this.enterViewBottomOffset = ((-iDp) + size) - size2;
        }
        if (this.BIG_SCREEN != this.wasBigScreen) {
            anonymousClass4.setLayoutParams(layoutParams);
        }
        TONIntroActivity.AnonymousClass2 anonymousClass2 = this.selfView;
        if (anonymousClass2 != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) anonymousClass2.getLayoutParams();
            if (this.BIG_SCREEN) {
                layoutParams2.topMargin = AndroidUtilities.dp(f) + iDp + size2;
            } else {
                layoutParams2.topMargin = (iDp + size2) - AndroidUtilities.dp(48.0f);
            }
        }
        MentionCell.AnonymousClass1 anonymousClass1 = this.replyDisabledTextView;
        if (anonymousClass1 != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) anonymousClass1.getLayoutParams();
            if (this.BIG_SCREEN) {
                c = 0;
                this.replyDisabledTextView.setTextColor(ColorUtils.blendARGB(0.5f, -16777216, -1));
                layoutParams3.topMargin = AndroidUtilities.dp(12.0f) + iDp + size2;
            } else {
                this.replyDisabledTextView.setTextColor(ColorUtils.setAlphaComponent(-1, 191));
                layoutParams3.topMargin = ((iDp + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
                c = 0;
            }
        } else {
            c = 0;
        }
        InstantCameraView instantCameraView = this.instantCameraView;
        if (instantCameraView != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) instantCameraView.getLayoutParams();
            if (visibleEmojiPadding == 0) {
                layoutParams4.bottomMargin = size - ((iDp + size2) - AndroidUtilities.dp(64.0f));
            } else {
                layoutParams4.bottomMargin = AndroidUtilities.dp(64.0f) + visibleEmojiPadding;
            }
        }
        boolean z4 = this.BIG_SCREEN;
        LinearLayout linearLayout = this.bottomActionsLinearLayout;
        AnonymousClass5 anonymousClass5 = this.storyCaptionView;
        if (z4) {
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f) + iDp + size2;
            ((FrameLayout.LayoutParams) anonymousClass5.getLayoutParams()).bottomMargin = AndroidUtilities.dp(f);
            if (this.wasBigScreen != this.BIG_SCREEN) {
                anonymousClass5.setLayoutParams((FrameLayout.LayoutParams) anonymousClass5.getLayoutParams());
            }
            anonymousClass5.blackoutBottomOffset = AndroidUtilities.dp(f);
        } else {
            ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).topMargin = ((iDp + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
            int iDp2 = this.isSelf ? AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(56.0f);
            ((FrameLayout.LayoutParams) anonymousClass5.getLayoutParams()).bottomMargin = iDp2;
            if (this.wasBigScreen != this.BIG_SCREEN) {
                anonymousClass5.setLayoutParams((FrameLayout.LayoutParams) anonymousClass5.getLayoutParams());
            }
            anonymousClass5.blackoutBottomOffset = iDp2;
        }
        this.forceUpdateOffsets = true;
        float fDp = AndroidUtilities.dp(48.0f);
        if (this.privacyButton.getVisibility() == 0) {
            fDp += AndroidUtilities.dp(60.0f);
        }
        if (this.muteIconContainer.getVisibility() == 0) {
            fDp += AndroidUtilities.dp(40.0f);
        }
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) peerHeaderView.titleView.getLayoutParams();
        if (layoutParams5.rightMargin != fDp) {
            int i7 = (int) fDp;
            layoutParams5.rightMargin = i7;
            TextView[] textViewArr = peerHeaderView.subtitleView;
            ((FrameLayout.LayoutParams) textViewArr[c].getLayoutParams()).rightMargin = i7;
            ((FrameLayout.LayoutParams) textViewArr[1].getLayoutParams()).rightMargin = i7;
            peerHeaderView.forceLayout();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        this.wasBigScreen = this.BIG_SCREEN;
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.progressToKeyboard = -1.0f;
        this.forceUpdateOffsets = true;
        invalidate();
    }

    public final void openAttachMenu() {
        if (this.chatActivityEnterView == null) {
            return;
        }
        createChatAttachView$1();
        this.chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
        int i = Build.VERSION.SDK_INT;
        if (i == 21 || i == 22) {
            this.chatActivityEnterView.closeKeyboard();
        }
        this.chatAttachAlert.setMaxSelectedPhotos(-1, true);
        this.chatAttachAlert.setDialogId(this.dialogId);
        this.chatAttachAlert.init();
        this.chatAttachAlert.getCommentView().setText(this.chatActivityEnterView.getFieldText());
        Delegate delegate = this.delegate;
        StoryViewer.this.showDialog(this.chatAttachAlert);
    }

    public final void openChat() {
        Bundle bundle = new Bundle();
        long j = this.dialogId;
        if (j < 0) {
            bundle.putLong("chat_id", -j);
        } else {
            bundle.putLong("user_id", j);
        }
        TLRPC.Dialog dialog = MessagesController.getInstance(this.currentAccount).getDialog(this.dialogId);
        if (dialog != null) {
            bundle.putInt("message_id", dialog.top_message);
        }
        this.storyViewer.presentFragment(new ChatActivity(bundle));
    }

    public final void requestVideoPlayer(long j) {
        TLRPC.Document document;
        Uri uri;
        TLRPC.Document document2;
        StoryViewer storyViewer;
        LivePlayer livePlayer;
        boolean z = this.isActive;
        VideoPlayerSharedScope videoPlayerSharedScope = this.playerSharedScope;
        if (!z) {
            videoPlayerSharedScope.renderView = null;
            return;
        }
        StoryItemHolder storyItemHolder = this.currentStory;
        boolean z2 = storyItemHolder.isLive;
        AnonymousClass4 anonymousClass4 = this.storyContainer;
        if (!z2) {
            if (!storyItemHolder.isVideo) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j + "): null, not a video");
                ((StoryViewer.AnonymousClass5) this.delegate).requestPlayer(null, null, 0L, this.playerSharedScope);
                videoPlayerSharedScope.renderView = null;
                videoPlayerSharedScope.firstFrameRendered = false;
                return;
            }
            if (storyItemHolder.getLocalPath() == null || !new File(storyItemHolder.getLocalPath()).exists()) {
                TL_stories.StoryItem storyItem = storyItemHolder.storyItem;
                if (storyItem != null) {
                    storyItem.dialogId = this.dialogId;
                    try {
                        document2 = storyItem.media.getDocument();
                        try {
                            TL_stories.StoryItem storyItem2 = storyItemHolder.storyItem;
                            if (storyItem2.fileReference == 0) {
                                storyItem2.fileReference = FileLoader.getInstance(this.currentAccount).getFileReference(storyItemHolder.storyItem);
                            }
                            StringBuilder sb = new StringBuilder("?account=");
                            sb.append(this.currentAccount);
                            sb.append("&id=");
                            sb.append(document2.id);
                            sb.append("&hash=");
                            sb.append(document2.access_hash);
                            sb.append("&dc=");
                            sb.append(document2.dc_id);
                            sb.append("&size=");
                            sb.append(document2.size);
                            sb.append("&mime=");
                            sb.append(URLEncoder.encode(document2.mime_type, "UTF-8"));
                            sb.append("&rid=");
                            sb.append(storyItemHolder.storyItem.fileReference);
                            sb.append("&name=");
                            sb.append(URLEncoder.encode(FileLoader.getDocumentFileName(document2), "UTF-8"));
                            sb.append("&reference=");
                            byte[] bArr = document2.file_reference;
                            if (bArr == null) {
                                bArr = new byte[0];
                            }
                            sb.append(Utilities.bytesToHex(bArr));
                            sb.append("&sid=");
                            sb.append(storyItemHolder.storyItem.id);
                            sb.append("&did=");
                            sb.append(storyItemHolder.storyItem.dialogId);
                            Uri uri2 = Uri.parse("tg://" + FileLoader.getAttachFileName(document2) + sb.toString());
                            FileLog.d("StoryViewer requestVideoPlayer(" + j + "): playing from " + uri2);
                            this.videoDuration = (long) (MessageObject.getDocumentDuration(document2) * 1000.0d);
                            uri = uri2;
                            document = document2;
                        } catch (Exception unused) {
                            document = document2;
                            uri = null;
                        }
                    } catch (Exception unused2) {
                        document2 = null;
                    }
                } else {
                    document = null;
                    uri = null;
                }
            } else {
                Uri uriFromFile = Uri.fromFile(new File(storyItemHolder.getLocalPath()));
                FileLog.d("StoryViewer requestVideoPlayer(" + j + "): playing from attachPath " + uriFromFile);
                this.videoDuration = 0L;
                uri = uriFromFile;
                document = null;
            }
            if (uri == null) {
                FileLog.d("PeerStoriesView.requestVideoPlayer(" + j + "): playing from null?");
            }
            ((StoryViewer.AnonymousClass5) this.delegate).requestPlayer(document, uri, j, this.playerSharedScope);
            anonymousClass4.invalidate();
            return;
        }
        Delegate delegate = this.delegate;
        TL_stories.StoryItem storyItem3 = storyItemHolder.storyItem;
        long j2 = this.dialogId;
        int i = storyItem3.id;
        TLRPC.TL_messageMediaVideoStream tL_messageMediaVideoStream = (TLRPC.TL_messageMediaVideoStream) storyItem3.media;
        boolean z3 = tL_messageMediaVideoStream.rtmp_stream;
        TLRPC.InputGroupCall inputGroupCall = tL_messageMediaVideoStream.call;
        StoryViewer.AnonymousClass5 anonymousClass5 = (StoryViewer.AnonymousClass5) delegate;
        anonymousClass5.switchToLive(true, true);
        StoryViewer storyViewer2 = StoryViewer.this;
        LivePlayer livePlayer2 = storyViewer2.livePlayer;
        if (livePlayer2 == null || livePlayer2.dialogId != j2 || !livePlayer2.equals(inputGroupCall)) {
            LivePlayerView livePlayerView = storyViewer2.liveView;
            if (livePlayerView != null) {
                livePlayerView.setScope(j2, null);
                LivePlayerView livePlayerView2 = storyViewer2.liveView;
                livePlayerView2.getClass();
                TextureViewRenderer textureViewRenderer = livePlayerView2.textureView;
                if (textureViewRenderer != null) {
                    textureViewRenderer.clearImage();
                }
                livePlayerView2.firstFrameRendered = false;
                livePlayerView2.setTextureVisible(false, false);
            }
            LiveStoryPipOverlay liveStoryPipOverlay = LiveStoryPipOverlay.instance;
            if (liveStoryPipOverlay.isVisible && (livePlayer = liveStoryPipOverlay.livePlayer) != null && livePlayer.equals(inputGroupCall)) {
                LivePlayer livePlayer3 = liveStoryPipOverlay.livePlayer;
                liveStoryPipOverlay.livePlayer = null;
                storyViewer2.livePlayer = livePlayer3;
                liveStoryPipOverlay.dismissInternal(false);
            } else {
                LivePlayer livePlayer4 = storyViewer2.livePlayer;
                if (livePlayer4 != null) {
                    if (!livePlayer4.outgoing && (!liveStoryPipOverlay.isVisible || liveStoryPipOverlay.livePlayer != livePlayer4)) {
                        livePlayer4.destroy();
                    } else if (livePlayer4.displaySink != storyViewer2.liveView.getSink()) {
                        storyViewer2.livePlayer.setDisplaySink(null);
                    }
                    storyViewer2.livePlayer = null;
                }
            }
            if (liveStoryPipOverlay.isVisible) {
                liveStoryPipOverlay.dismissInternal(true);
            }
            StoryViewer.VideoPlayerHolder videoPlayerHolder = storyViewer2.playerHolder;
            if (videoPlayerHolder != null) {
                videoPlayerHolder.release(null);
                storyViewer2.playerHolder = null;
            }
            VideoPlayerSharedScope videoPlayerSharedScope2 = storyViewer2.currentPlayerScope;
            if (videoPlayerSharedScope2 != null) {
                videoPlayerSharedScope2.player = null;
                videoPlayerSharedScope2.livePlayer = null;
                videoPlayerSharedScope2.firstFrameRendered = false;
                videoPlayerSharedScope2.renderView = null;
                videoPlayerSharedScope2.textureView = null;
                videoPlayerSharedScope2.surfaceView = null;
                videoPlayerSharedScope2.invalidate();
                storyViewer2.currentPlayerScope = null;
            }
            if (storyViewer2.livePlayer != null) {
                storyViewer = storyViewer2;
            } else {
                LivePlayer livePlayer5 = LivePlayer.recording;
                if (livePlayer5 == null || !livePlayer5.equals(inputGroupCall)) {
                    int i2 = storyViewer2.currentAccount;
                    Context context = anonymousClass5.val$context;
                    storyViewer = storyViewer2;
                    storyViewer.livePlayer = new LivePlayer(context, i2, storyItem3, j2, i, z3, inputGroupCall, false, false);
                } else {
                    storyViewer2.livePlayer = LivePlayer.recording;
                    storyViewer = storyViewer2;
                }
            }
            LivePlayerView livePlayerView3 = storyViewer.pipLiveView;
            if (livePlayerView3 != null) {
                storyViewer.livePlayer.setDisplaySink(livePlayerView3.getSink());
            } else {
                storyViewer.livePlayer.setDisplaySink(storyViewer.liveView.getSink());
            }
            storyViewer.currentPlayerScope = videoPlayerSharedScope;
            videoPlayerSharedScope.firstFrameRendered = false;
            videoPlayerSharedScope.renderView = storyViewer.aspectRatioFrameLayout;
            LivePlayerView livePlayerView4 = storyViewer.liveView;
            videoPlayerSharedScope.textureView = livePlayerView4.textureView;
            videoPlayerSharedScope.surfaceView = null;
            videoPlayerSharedScope.livePlayer = storyViewer.livePlayer;
            livePlayerView4.setScope(j2, videoPlayerSharedScope);
            storyViewer.currentPlayerScope.invalidate();
        }
        anonymousClass4.invalidate();
    }

    public final void saveToGallery() {
        StoryItemHolder storyItemHolder = this.currentStory;
        TL_stories.StoryItem storyItem = storyItemHolder.storyItem;
        if ((storyItem == null && storyItemHolder.uploadingStory == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File path = storyItemHolder.getPath();
        boolean z = storyItemHolder.isVideo;
        if (path == null || !path.exists()) {
            showDownloadAlert();
            return;
        }
        MediaController.saveFile(path.toString(), getContext(), z ? 1 : 0, null, null, new AddressBarList$$ExternalSyntheticLambda1(this, z, 2));
    }

    public final void sendUriAsDocument(Uri uri) {
        TL_stories.StoryItem storyItem;
        Uri uri2;
        String str;
        String str2;
        boolean z;
        if (uri == null || (storyItem = this.currentStory.storyItem) == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        String string = uri.toString();
        if (string.contains("com.google.android.apps.photos.contentprovider")) {
            try {
                String str3 = string.split("/1/")[1];
                int iIndexOf = str3.indexOf("/ACTUAL");
                if (iIndexOf != -1) {
                    uri2 = Uri.parse(URLDecoder.decode(str3.substring(0, iIndexOf), "UTF-8"));
                } else {
                    uri2 = uri;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            uri2 = uri;
        }
        String path = AndroidUtilities.getPath(uri2);
        if (BuildVars.NO_SCOPED_STORAGE) {
            if (path == null) {
                String string2 = uri2.toString();
                String strCopyFileToCache = MediaController.copyFileToCache(uri2, "file");
                if (strCopyFileToCache == null) {
                    AnonymousClass4 anonymousClass4 = this.storyContainer;
                    DarkThemeResourceProvider darkThemeResourceProvider = this.resourcesProvider;
                    BulletinFactory.of(anonymousClass4, darkThemeResourceProvider).createErrorBulletin(LocaleController.getString(R.string.UnsupportedAttachment), darkThemeResourceProvider).show();
                    return;
                }
                str2 = string2;
                str = strCopyFileToCache;
            } else {
                str = path;
                str2 = str;
            }
            z = false;
        } else {
            str = path;
            str2 = str;
            z = true;
        }
        if (z) {
            SendMessagesHelper.prepareSendingDocument(getAccountInstance(), null, null, uri2, null, null, this.dialogId, null, null, storyItem, null, null, true, 0, null, null, false);
        } else {
            SendMessagesHelper.prepareSendingDocument(getAccountInstance(), str, str2, null, null, null, this.dialogId, null, null, storyItem, null, null, true, 0, null, null, false);
        }
    }

    public void setAccount(int i) {
        this.currentAccount = i;
        this.storiesController = MessagesController.getInstance(i).storiesController;
        this.emojiAnimationsOverlay.setAccount(i);
        ReactionsContainerLayout reactionsContainerLayout = this.reactionsContainerLayout;
        if (reactionsContainerLayout != null) {
            reactionsContainerLayout.setCurrentAccount(i);
            this.reactionsContainerLayout.setMessage(null, null, true);
        }
        ReactionsContainerLayout reactionsContainerLayout2 = this.likesReactionLayout;
        if (reactionsContainerLayout2 != null) {
            reactionsContainerLayout2.setCurrentAccount(i);
        }
    }

    public void setActive(boolean z) {
        setActive(0L, z);
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public final void setDialogId(long j, int i) {
        if (this.dialogId != j) {
            StoryItemHolder storyItemHolder = this.currentStory;
            storyItemHolder.uploadingStory = null;
            storyItemHolder.storyItem = null;
        }
        this.dialogId = j;
        this.day = null;
        bindInternal(i);
        TL_stories.PeerStories peerStories = this.storyViewer.overrideUserStories;
        boolean z = true;
        if (peerStories != null) {
            this.storiesController.loadSkippedStories(peerStories, true);
            return;
        }
        StoriesController storiesController = this.storiesController;
        TL_stories.PeerStories storiesFromFullPeer = (TL_stories.PeerStories) storiesController.allStoriesMap.get(j);
        if (storiesFromFullPeer == null) {
            storiesFromFullPeer = storiesController.getStoriesFromFullPeer(j);
        } else {
            z = false;
        }
        storiesController.loadSkippedStories(storiesFromFullPeer, z);
    }

    public void setIsVisible(boolean z) {
        if (this.isVisible == z) {
            return;
        }
        this.isVisible = z;
        if (z) {
            this.imageReceiver.setCurrentAlpha(1.0f);
            checkStealthMode(false);
        }
    }

    public void setLongpressed(boolean z) {
        if (this.isActive) {
            this.isLongPressed = z;
            invalidate();
        }
    }

    public void setOffset(float f) {
        boolean z = f == 0.0f;
        if (this.allowDrawSurface != z) {
            this.allowDrawSurface = z;
            this.storyContainer.invalidate();
            if (this.isActive && this.storyViewer.USE_SURFACE_VIEW && Build.VERSION.SDK_INT < 33) {
                AnonymousClass34 anonymousClass34 = this.allowDrawSurfaceRunnable;
                if (z) {
                    AndroidUtilities.cancelRunOnUIThread(anonymousClass34);
                    AndroidUtilities.runOnUIThread(anonymousClass34, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(anonymousClass34);
                    StoryViewer storyViewer = StoryViewer.this;
                    storyViewer.isSwiping = true;
                    storyViewer.updatePlayingMode();
                }
            }
        }
    }

    public void setPaused(boolean z) {
        if (this.paused != z) {
            this.paused = z;
            ChatMessageCell.AnonymousClass3 anonymousClass3 = this.imageReceiver;
            if (z) {
                anonymousClass3.stopAnimation();
                anonymousClass3.setAllowStartAnimation(false);
            } else {
                anonymousClass3.startAnimation();
                anonymousClass3.setAllowStartAnimation(true);
            }
            this.lastDrawTime = 0L;
            this.storyContainer.invalidate();
        }
    }

    public final void setTitle(long j, boolean z, boolean z2) {
        if (!z && j == this.titleLastDialogId && this.titleLastLive == z2) {
            return;
        }
        this.titleLastDialogId = j;
        this.titleLastLive = z2;
        PeerHeaderView peerHeaderView = this.headerView;
        if (j < 0) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
            peerHeaderView.titleView.setText(AndroidUtilities.removeDiacritics(chat == null ? "" : chat.title));
            UserCell2.AnonymousClass1 anonymousClass1 = peerHeaderView.titleView;
            if (chat == null || !chat.verified) {
                anonymousClass1.setRightDrawable((Drawable) null);
                return;
            }
            Drawable drawableMutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
            drawableMutate.setAlpha(255);
            CombinedDrawable combinedDrawable = new CombinedDrawable(drawableMutate, null);
            combinedDrawable.setFullsize(true);
            combinedDrawable.setCustomSize(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            anonymousClass1.setRightDrawable(combinedDrawable);
            return;
        }
        if (this.isSelf && !z2) {
            peerHeaderView.titleView.setText(LocaleController.getString(R.string.SelfStoryTitle));
            peerHeaderView.titleView.setRightDrawable((Drawable) null);
            return;
        }
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
        if (user == null || !user.verified) {
            peerHeaderView.titleView.setRightDrawable((Drawable) null);
        } else {
            Drawable drawableMutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            drawableMutate2.setAlpha(255);
            CombinedDrawable combinedDrawable2 = new CombinedDrawable(drawableMutate2, null);
            combinedDrawable2.setFullsize(true);
            combinedDrawable2.setCustomSize(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            peerHeaderView.titleView.setRightDrawable(combinedDrawable2);
        }
        if (user != null) {
            peerHeaderView.titleView.setText(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), peerHeaderView.titleView.getPaint().getFontMetricsInt(), false));
        } else {
            peerHeaderView.titleView.setText(null);
        }
    }

    public final void shareStory(boolean z) {
        StoryItemHolder storyItemHolder = this.currentStory;
        if (storyItemHolder.storyItem != null) {
            StoryViewer storyViewer = this.storyViewer;
            if (storyViewer.fragment != null) {
                String strCreateLink = storyItemHolder.createLink();
                if (!z) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", strCreateLink);
                    LaunchActivity.instance.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
                    return;
                }
                ?? r3 = new ShareAlert(storyViewer.fragment.getContext(), strCreateLink, strCreateLink, MessagesController.getInstance(this.currentAccount).storiesEnabled() && (!(this.isChannel || UserObject.isService(this.dialogId)) || ChatObject.isPublic(this.isChannel ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId)) : null)), new AnonymousClass18(this.resourcesProvider, 2)) {
                    @Override
                    public final void dismissInternal() {
                        super.dismissInternal();
                        PeerStoriesView.this.shareAlert = null;
                    }

                    @Override
                    public final void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z2) {
                        if (z2) {
                            super.onSend(longSparseArray, i, tL_forumTopic, z2);
                            PeerStoriesView peerStoriesView = PeerStoriesView.this;
                            BulletinFactory bulletinFactoryOf = BulletinFactory.of(peerStoriesView.storyContainer, this.resourcesProvider);
                            if (bulletinFactoryOf != null) {
                                if (longSparseArray.size() == 1) {
                                    long jKeyAt = longSparseArray.keyAt(0);
                                    if (jKeyAt == UserConfig.getInstance(this.currentAccount).clientUserId) {
                                        bulletinFactoryOf.createSimpleBulletin(R.raw.saved_messages, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedToSavedMessages, new Object[0])), 5000).hideAfterBottomSheet(false).show();
                                    } else if (jKeyAt < 0) {
                                        bulletinFactoryOf.createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedTo, tL_forumTopic != null ? tL_forumTopic.title : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-jKeyAt)).title)), 5000).hideAfterBottomSheet(false).show();
                                    } else {
                                        bulletinFactoryOf.createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(jKeyAt)).first_name)), 5000).hideAfterBottomSheet(false).show();
                                    }
                                } else {
                                    bulletinFactoryOf.createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StorySharedToManyChats", longSparseArray.size(), Integer.valueOf(longSparseArray.size())))).hideAfterBottomSheet(false).show();
                                }
                                try {
                                    peerStoriesView.performHapticFeedback(3);
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }

                    @Override
                    public final void onShareStory(View view) {
                        PeerStoriesView.this.tryToOpenRepostStory();
                    }
                };
                this.shareAlert = r3;
                r3.forceDarkThemeForHint = true;
                TL_stories.StoryItem storyItem = storyItemHolder.storyItem;
                storyItem.dialogId = this.dialogId;
                r3.setStoryToShare(storyItem);
                setDelegate(new ShareAlert.ShareAlertDelegate() {
                    @Override
                    public final boolean didCopy() {
                        PeerStoriesView.access$8600(PeerStoriesView.this);
                        return true;
                    }

                    @Override
                    public final void didShare() {
                        ShareAlert.ShareAlertDelegate.CC.$default$didShare(this);
                    }
                });
                StoryViewer.this.showDialog(this.shareAlert);
            }
        }
    }

    public final void showDownloadAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.AppName));
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        builder.setMessage(LocaleController.getString(R.string.PleaseDownload));
        Delegate delegate = this.delegate;
        StoryViewer.this.showDialog(builder.create());
    }

    public final void showLikesReaction(boolean z) {
        int i = 1;
        int i2 = 0;
        if (this.likesReactionShowing != z) {
            StoryItemHolder storyItemHolder = this.currentStory;
            if (storyItemHolder.storyItem == null) {
                return;
            }
            this.likesReactionShowing = z;
            if (z) {
                this.likesReactionLayout.setVisibility(0);
            }
            this.likesReactionLayout.setStoryItem(storyItemHolder.storyItem);
            StoryViewer storyViewer = StoryViewer.this;
            storyViewer.isLikesReactions = z;
            storyViewer.updatePlayingMode();
            if (!z) {
                if (this.likesReactionLayout.getReactionsWindow() != null) {
                    this.likesReactionLayout.getReactionsWindow().dismissWithAlpha();
                }
                this.likesReactionLayout.animate().alpha(0.0f).setDuration(150L).setListener(new AnonymousClass15(this, i2)).start();
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.likesReactionShowProgress, z ? 1.0f : 0.0f);
            this.likesReactionLayout.setTransitionProgress(this.likesReactionShowProgress);
            valueAnimatorOfFloat.addUpdateListener(new PeerStoriesView$$ExternalSyntheticLambda20(this, i));
            valueAnimatorOfFloat.addListener(new AnonymousClass14(this, z, i2));
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            valueAnimatorOfFloat.start();
        }
    }

    public final void showNoSoundHint(boolean z) {
        if (this.soundTooltip == null) {
            HintView2 joint = new HintView2(getContext(), 1).setJoint(1.0f, -56.0f);
            this.soundTooltip = joint;
            joint.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.storyContainer.addView(this.soundTooltip, LayoutHelper.createFrame(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        this.soundTooltip.setText(LocaleController.getString(z ? R.string.StoryNoSound : R.string.StoryTapToSound));
        this.soundTooltip.show();
    }

    public final void showPremiumBlockedToast() {
        int i = 0;
        if (this.areLiveCommentsDisabled) {
            return;
        }
        if (this.isGroup) {
            if (this.boostsStatus != null && this.canApplyBoost != null) {
                LimitReachedBottomSheet.openBoostsForRemoveRestrictions(new SendGiftSheet.AnonymousClass8(this, 4), this.boostsStatus, this.canApplyBoost, this.dialogId, true);
                return;
            }
            StoryViewer storyViewer = this.storyViewer;
            if (storyViewer != null) {
                storyViewer.isOverlayVisible = true;
                storyViewer.updatePlayingMode();
            }
            MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(this.dialogId, new PeerStoriesView$$ExternalSyntheticLambda27(this, i));
            return;
        }
        AnonymousClass19 anonymousClass19 = this.chatActivityEnterView;
        int i2 = -this.shiftDp;
        this.shiftDp = i2;
        AndroidUtilities.shakeViewSpring(anonymousClass19, i2);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = this.dialogId >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId))) : "";
        boolean zPremiumFeaturesBlocked = MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked();
        DarkThemeResourceProvider darkThemeResourceProvider = this.resourcesProvider;
        AnonymousClass4 anonymousClass4 = this.storyContainer;
        (zPremiumFeaturesBlocked ? BulletinFactory.of(anonymousClass4, darkThemeResourceProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName))) : BulletinFactory.of(anonymousClass4, darkThemeResourceProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new PeerStoriesView$$ExternalSyntheticLambda3(this, 2))).show();
    }

    public final boolean switchToNext(boolean z) {
        if (this.storyViewer.reversed) {
            z = !z;
        }
        if (!z) {
            int i = this.selectedPosition;
            if (i > 0) {
                this.selectedPosition = i - 1;
                updatePosition(false);
                return true;
            }
        } else if (this.selectedPosition < getStoriesCount() - 1) {
            this.selectedPosition++;
            updatePosition(false);
            return true;
        }
        return false;
    }

    public final void toggleArchiveForStory(long j) {
        String str;
        boolean z;
        TLObject tLObject;
        if (j > 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
            str = user.first_name;
            z = user.stories_hidden;
            tLObject = user;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
            str = chat.title;
            z = chat.stories_hidden;
            tLObject = chat;
        }
        AndroidUtilities.runOnUIThread(new BotStarsActivity$$ExternalSyntheticLambda27(this, MessagesController.getInstance(this.currentAccount), j, !z, str, tLObject), 200L);
    }

    public final void tryToOpenRepostStory() {
        if (MessagesController.getInstance(this.currentAccount).storiesEnabled()) {
            File path = this.currentStory.getPath();
            if (path == null || !path.exists()) {
                showDownloadAlert();
                return;
            }
            AnonymousClass27 anonymousClass27 = this.shareAlert;
            if (anonymousClass27 != null) {
                anonymousClass27.lambda$showGiftOfferSheet$15();
            }
            AndroidUtilities.runOnUIThread(new PeerStoriesView$$ExternalSyntheticLambda3(this, 5), 120L);
        }
    }

    public final void updatePosition(boolean z) {
        TL_stories.StoryItem storyItem;
        StoriesController.UploadingStory uploadingStory;
        boolean z2;
        boolean z3;
        StoryViewer storyViewer;
        ChatMessageCell.AnonymousClass3 anonymousClass3;
        StoryViewer.TransitionViewHolder transitionViewHolder;
        ImageReceiver imageReceiver;
        TL_stories.StoryItem storyItem2;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TL_stories.StoryItem storyItem3;
        TLRPC.MessageMedia messageMedia;
        boolean z4;
        StoryEntry storyEntry;
        StoryEntry storyEntry2;
        boolean z5;
        boolean z6;
        boolean z7;
        TL_stories.StoryItem storyItem4;
        boolean z8;
        boolean z9;
        boolean z10;
        AnonymousClass4 anonymousClass4;
        StoriesController.UploadingStory uploadingStory2;
        AnonymousClass5 anonymousClass5;
        CharSequence string;
        TL_stories.StoryItem storyItem5;
        CharSequence charSequence;
        int i;
        CharSequence charSequence2;
        CharSequence string2;
        TLRPC.MessageMedia messageMedia2;
        boolean z11;
        CharSequence charSequence3;
        TL_stories.StoryItem storyItem6;
        CharSequence spannableStringBuilder;
        Delegate delegate;
        AnonymousClass19 anonymousClass19;
        int i2;
        AnonymousClass19 anonymousClass110;
        int i3;
        TLRPC.User user;
        TLRPC.Reaction reaction;
        TL_stories.StoryItem storyItem7;
        TL_stories.StoryItem storyItem8;
        boolean z12;
        LivePlayer livePlayer;
        LivePlayer livePlayer2;
        String str;
        BitmapDrawable bitmapDrawable;
        ChatMessageCell.AnonymousClass3 anonymousClass6;
        AnonymousClass3 anonymousClass7;
        StoryViewer storyViewer2;
        TLRPC.MessageMedia messageMedia3;
        StoriesController.StoriesList storiesList;
        ArrayList arrayList2 = this.storyItems;
        boolean zIsEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.uploadingStories;
        if (zIsEmpty && arrayList3.isEmpty()) {
            return;
        }
        this.forceUpdateOffsets = true;
        StoryItemHolder storyItemHolder = this.currentStory;
        TL_stories.StoryItem storyItem9 = storyItemHolder.storyItem;
        StoriesController.UploadingStory uploadingStory3 = storyItemHolder.uploadingStory;
        GradientTools[] gradientToolsArr = StoriesUtilities.storiesGradientTools;
        int iMax = (int) (Math.max(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y) / AndroidUtilities.density);
        String strM = DiffUtil.m(iMax, iMax, "_");
        this.lastNoThumb = false;
        this.unsupported = false;
        int i4 = this.selectedPosition;
        boolean z13 = this.isUploading;
        boolean z14 = this.isEditing;
        boolean z15 = this.isFailed;
        StoryViewer storyViewer3 = this.storyViewer;
        if (storyViewer3 == null || (storiesList = storyViewer3.storiesList) == null || storiesList.type != 4) {
            TL_stories.StoryItem storyItem10 = (i4 < 0 || i4 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(i4);
            int size = i4 - arrayList2.size();
            if (size < 0 || size >= arrayList3.size()) {
                storyItem = storyItem10;
                uploadingStory = null;
            } else {
                StoriesController.UploadingStory uploadingStory4 = (StoriesController.UploadingStory) arrayList3.get(size);
                storyItem = storyItem10;
                uploadingStory = uploadingStory4;
            }
        } else {
            uploadingStory = (i4 < 0 || i4 >= arrayList3.size()) ? null : (StoriesController.UploadingStory) arrayList3.get(i4);
            int size2 = i4 - arrayList3.size();
            storyItem = (size2 < 0 || size2 >= arrayList2.size()) ? null : (TL_stories.StoryItem) arrayList2.get(size2);
        }
        storyItemHolder.editingSourceItem = null;
        EmojiAnimationsOverlay emojiAnimationsOverlay = this.emojiAnimationsOverlay;
        AnonymousClass3 anonymousClass8 = this.storyAreasView;
        ChatMessageCell.AnonymousClass3 anonymousClass9 = this.imageReceiver;
        if (uploadingStory != null) {
            this.isEditing = false;
            boolean z16 = uploadingStory.failed;
            this.isFailed = z16;
            this.isUploading = !z16;
            anonymousClass9.setCrossfadeWithOldImage(false);
            anonymousClass9.setCrossfadeDuration(150);
            StoryEntry storyEntry3 = uploadingStory.entry;
            Bitmap bitmap = storyEntry3.thumbBitmap;
            if (bitmap != null) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap);
                Utilities.blurBitmap(bitmapCreateBitmap, 3);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            } else {
                bitmapDrawable = null;
            }
            if (uploadingStory.isVideo || uploadingStory.hadFailed) {
                z2 = z14;
                anonymousClass6 = anonymousClass9;
                anonymousClass7 = anonymousClass8;
                storyViewer2 = storyViewer3;
                this.imageReceiver.setImage(null, null, ImageLocation.getForPath(uploadingStory.firstFramePath), strM, null, null, bitmapDrawable, 0L, null, null, 0);
            } else {
                z2 = z14;
                storyViewer2 = storyViewer3;
                anonymousClass7 = anonymousClass8;
                anonymousClass6 = anonymousClass9;
                this.imageReceiver.setImage(null, null, ImageLocation.getForPath(uploadingStory.path), strM, null, null, bitmapDrawable, 0L, null, null, 0);
            }
            storyItemHolder.uploadingStory = uploadingStory;
            storyItemHolder.panel = null;
            storyItemHolder.musicPanel = null;
            storyItemHolder.storyItem = null;
            storyItemHolder.skipped = false;
            storyItemHolder.isVideo = storyItemHolder.isVideoInternal();
            TL_stories.StoryItem storyItem11 = storyItemHolder.storyItem;
            storyItemHolder.isLive = (storyItem11 == null || (messageMedia3 = storyItem11.media) == null || !(messageMedia3 instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
            anonymousClass7.set(null, StoryMediaAreasView.getMediaAreasFor(storyEntry3), emojiAnimationsOverlay);
            this.allowShareLink = false;
            this.allowRepost = false;
            this.allowShare = false;
            anonymousClass3 = anonymousClass6;
            z3 = z15;
            z13 = z13;
            storyViewer = storyViewer2;
        } else {
            i4 = i4;
            z2 = z14;
            z3 = z15;
            this.isUploading = false;
            this.isEditing = false;
            this.isFailed = false;
            if (storyItem == null) {
                if (storyViewer3 != null) {
                    storyViewer3.close(true);
                    return;
                }
                return;
            }
            HashMap map = (HashMap) this.storiesController.editingStories.get(this.dialogId);
            StoriesController.UploadingStory uploadingStory5 = (map == null || map.isEmpty()) ? null : (StoriesController.UploadingStory) map.get(Integer.valueOf(storyItem.id));
            if (uploadingStory5 != null) {
                this.isEditing = true;
                anonymousClass9.setCrossfadeWithOldImage(false);
                anonymousClass9.setCrossfadeDuration(this.onImageReceiverThumbLoaded != null ? 0 : 150);
                boolean z17 = uploadingStory5.isVideo;
                String str2 = uploadingStory5.firstFramePath;
                if (z17) {
                    storyViewer = storyViewer3;
                    this.imageReceiver.setImage(null, null, ImageLocation.getForPath(str2), strM, null, 0L, null, null, 0);
                } else {
                    storyViewer = storyViewer3;
                    this.imageReceiver.setImage(null, null, ImageLocation.getForPath(str2), strM, null, 0L, null, null, 0);
                }
                storyItemHolder.uploadingStory = uploadingStory5;
                storyItemHolder.panel = null;
                storyItemHolder.musicPanel = null;
                storyItemHolder.storyItem = null;
                storyItemHolder.skipped = false;
                storyItemHolder.isVideo = storyItemHolder.isVideoInternal();
                TL_stories.StoryItem storyItem12 = storyItemHolder.storyItem;
                storyItemHolder.isLive = (storyItem12 == null || (messageMedia = storyItem12.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
                anonymousClass8.set(null, StoryMediaAreasView.getMediaAreasFor(uploadingStory5.entry), emojiAnimationsOverlay);
                storyItemHolder.editingSourceItem = storyItem;
                this.allowShareLink = false;
                this.allowRepost = false;
                this.allowShare = false;
                anonymousClass3 = anonymousClass9;
            } else {
                z3 = z3;
                z13 = z13;
                storyViewer = storyViewer3;
                TLRPC.MessageMedia messageMedia4 = storyItem.media;
                boolean zEndsWith = messageMedia4 != null && MessageObject.isVideoDocument(messageMedia4.getDocument());
                storyItem.dialogId = this.dialogId;
                anonymousClass9.setCrossfadeWithOldImage(z2);
                anonymousClass9.setCrossfadeDuration(150);
                TLRPC.MessageMedia messageMedia5 = storyItem.media;
                if (messageMedia5 instanceof TLRPC.TL_messageMediaUnsupported) {
                    this.unsupported = true;
                    MessagesController.getInstance(this.currentAccount).getStoriesController().checkUnsupportedStory(storyItem.id, this.dialogId);
                    storyItem2 = storyItem;
                    anonymousClass3 = anonymousClass9;
                } else {
                    String str3 = storyItem.attachPath;
                    if (str3 != null) {
                        if (messageMedia5 == null) {
                            zEndsWith = str3.toLowerCase().endsWith(".mp4");
                        }
                        if (zEndsWith) {
                            TLRPC.MessageMedia messageMedia6 = storyItem.media;
                            Drawable drawableCreateStripedBitmap = messageMedia6 != null ? ImageLoader.createStripedBitmap(messageMedia6.getDocument().thumbs) : null;
                            if (storyItem.firstFramePath != null) {
                                ImageLoader imageLoader = ImageLoader.getInstance();
                                StringBuilder sb = new StringBuilder();
                                anonymousClass3 = anonymousClass9;
                                sb.append(ImageLocation.getForPath(storyItem.firstFramePath).getKey(null, null, false));
                                sb.append("@");
                                sb.append(strM);
                                if (imageLoader.isInMemCache(sb.toString(), false)) {
                                    this.imageReceiver.setImage(null, null, ImageLocation.getForPath(storyItem.firstFramePath), strM, null, null, drawableCreateStripedBitmap, 0L, null, null, 0);
                                }
                            } else {
                                anonymousClass3 = anonymousClass9;
                            }
                            this.imageReceiver.setImage(null, null, ImageLocation.getForPath(storyItem.attachPath), zzhp.m(strM, "_pframe"), null, null, drawableCreateStripedBitmap, 0L, null, null, 0);
                        } else {
                            anonymousClass3 = anonymousClass9;
                            TLRPC.MessageMedia messageMedia7 = storyItem.media;
                            TLRPC.Photo photo = messageMedia7 != null ? messageMedia7.photo : null;
                            Drawable drawableCreateStripedBitmap2 = photo != null ? ImageLoader.createStripedBitmap(photo.sizes) : null;
                            if (z2) {
                                this.imageReceiver.setImage(ImageLocation.getForPath(storyItem.attachPath), strM, ImageLocation.getForPath(storyItem.firstFramePath), strM, drawableCreateStripedBitmap2, 0L, null, null, 0);
                            } else {
                                this.imageReceiver.setImage(ImageLocation.getForPath(storyItem.attachPath), strM, null, null, drawableCreateStripedBitmap2, 0L, null, null, 0);
                            }
                        }
                        storyItem2 = storyItem;
                    } else {
                        anonymousClass3 = anonymousClass9;
                        Drawable drawable = ((storyViewer.storiesList != null || storyViewer.isSingleStory) && (transitionViewHolder = storyViewer.transitionViewHolder) != null && (imageReceiver = transitionViewHolder.storyImage) != null && transitionViewHolder.storyId == storyItem.id) ? imageReceiver.getDrawable() : null;
                        storyItem.dialogId = this.dialogId;
                        if (zEndsWith) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(storyItem.media.getDocument().thumbs, 1000);
                            if (drawable == null) {
                                drawable = ImageLoader.createStripedBitmap(storyItem.media.getDocument().thumbs);
                            }
                            TL_stories.StoryItem storyItem13 = storyItem;
                            this.imageReceiver.setImage(null, null, ImageLocation.getForDocument(storyItem.media.getDocument()), zzhp.m(strM, "_pframe"), ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.getDocument()), strM, drawable, 0L, null, storyItem13, 0);
                            storyItem2 = storyItem13;
                        } else {
                            storyItem2 = storyItem;
                            TLRPC.MessageMedia messageMedia8 = storyItem2.media;
                            TLRPC.Photo photo2 = messageMedia8 != null ? messageMedia8.photo : null;
                            if (photo2 == null || (arrayList = photo2.sizes) == null) {
                                anonymousClass3.clearImage();
                            } else {
                                if (drawable == null) {
                                    drawable = ImageLoader.createStripedBitmap(arrayList);
                                }
                                Drawable drawable2 = drawable;
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, Integer.MAX_VALUE);
                                FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 800);
                                this.imageReceiver.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo2), strM, null, null, drawable2, 0L, null, storyItem2, 0);
                            }
                        }
                    }
                }
                storyItem2.dialogId = this.dialogId;
                anonymousClass8.set(z ? null : storyItem2, emojiAnimationsOverlay);
                storyItemHolder.set(storyItem2);
                boolean z18 = (this.unsupported || (storyItem3 = storyItemHolder.storyItem) == null || (storyItem3 instanceof TL_stories.TL_storyItemDeleted) || (storyItem3 instanceof TL_stories.TL_storyItemSkipped)) ? false : true;
                this.allowShareLink = z18;
                this.allowShare = z18;
                if (z18) {
                    this.allowShare = storyItemHolder.allowScreenshots() && storyItemHolder.storyItem.isPublic;
                }
                if (this.allowShare) {
                    TL_stories.StoryItem storyItem14 = storyItemHolder.storyItem;
                    this.allowShare = storyItem14.pinned || !StoriesUtilities.isExpired(this.currentAccount, storyItem14);
                }
                boolean z19 = this.allowShare;
                this.allowRepost = z19;
                if (z19 && this.isChannel) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
                    this.allowRepost = chat != null && ChatObject.isPublic(chat);
                }
                if (this.allowShareLink) {
                    if (this.isChannel) {
                        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
                        this.allowShareLink = (chat2 == null || ChatObject.getPublicUsername(chat2) == null) ? false : true;
                    } else {
                        TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
                        this.allowShareLink = (user2 == null || UserObject.getPublicUsername(user2) == null || !storyItemHolder.storyItem.isPublic) ? false : true;
                    }
                }
                NotificationsController.getInstance(this.currentAccount).processReadStories(this.dialogId, storyItem2.id);
            }
        }
        TL_stories.StoryItem storyItem15 = storyItemHolder.storyItem;
        if (storyItem15 != null && !z) {
            storyViewer.dayStoryId = storyItem15.id;
        }
        StoryViewer.AnonymousClass4 anonymousClass10 = storyViewer.storiesViewPager;
        int i5 = 0;
        while (true) {
            if (i5 >= anonymousClass10.getChildCount()) {
                z4 = true;
                break;
            }
            StoriesViewPager.PageLayout pageLayout = (StoriesViewPager.PageLayout) anonymousClass10.getChildAt(i5);
            if (pageLayout.isVisible && !pageLayout.peerStoryView.currentStory.allowScreenshots()) {
                z4 = false;
                break;
            }
            i5++;
        }
        anonymousClass10.storyViewer.allowScreenshots(z4);
        this.imageChanged = true;
        if (this.isSelf || this.isChannel) {
            updateUserViews(false);
        }
        TL_stories.StoryItem storyItem16 = storyItemHolder.storyItem;
        StoriesController.UploadingStory uploadingStory6 = storyItemHolder.uploadingStory;
        boolean z20 = (storyItem16 != null ? storyItem16.id : (uploadingStory6 == null || (storyEntry = uploadingStory6.entry) == null) ? 0 : storyEntry.editStoryId) == (storyItem9 != null ? storyItem9.id : (uploadingStory3 == null || (storyEntry2 = uploadingStory3.entry) == null) ? 0 : storyEntry2.editStoryId) || !(uploadingStory3 == null || storyItem16 == null || !TextUtils.equals(uploadingStory3.path, storyItem16.attachPath));
        boolean z21 = z20 && !(this.isEditing == z2 && this.isUploading == z13 && this.isFailed == z3);
        LivePlayer livePlayer3 = storyViewer.livePlayer;
        if (livePlayer3 != null) {
            int i6 = this.watchersCount;
            TLRPC.GroupCall groupCall = livePlayer3.call;
            if (i6 != Math.max(1, groupCall == null ? 0 : groupCall.participants_count)) {
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
        }
        AnonymousClass4 anonymousClass11 = this.storyContainer;
        AnonymousClass5 anonymousClass12 = this.storyCaptionView;
        PeerHeaderView peerHeaderView = this.headerView;
        if ((uploadingStory3 == null || (str = uploadingStory3.path) == null || !str.equals(storyItemHolder.getLocalPath())) && (storyItem9 == null || (storyItem4 = storyItemHolder.storyItem) == null || storyItem9.id != storyItem4.id)) {
            AnonymousClass19 anonymousClass111 = this.chatActivityEnterView;
            if (anonymousClass111 != null) {
                if (storyItem9 != null && !TextUtils.isEmpty(anonymousClass111.getEditField().getText())) {
                    StoryViewer.saveDraft(storyItem9.dialogId, storyItem9, this.chatActivityEnterView.getEditField().getText());
                }
                this.chatActivityEnterView.getEditField().setText(StoryViewer.getDraft(this.dialogId, storyItemHolder.storyItem));
                if (storyItemHolder.isLive) {
                    this.chatActivityEnterView.setAllowStickersAndGifs(true, false, false);
                } else {
                    this.chatActivityEnterView.setAllowStickersAndGifs(true, true, true);
                }
            }
            if (storyItemHolder.isLive && this.sendAsPeersObj == null) {
                LivePlayer livePlayer4 = storyViewer.livePlayer;
                if (livePlayer4 != null) {
                    TLRPC.GroupCall groupCall2 = livePlayer4.call;
                    if (groupCall2 == null) {
                        z7 = false;
                        z6 = true;
                    } else {
                        z6 = true;
                        z7 = !groupCall2.messages_enabled;
                    }
                    if (!z7) {
                    }
                } else {
                    z6 = true;
                }
                TLRPC.TL_channels_sendAsPeers sendAsPeers = MessagesController.getInstance(this.currentAccount).getSendAsPeers(this.dialogId, z6);
                this.sendAsPeersObj = sendAsPeers;
                AnonymousClass19 anonymousClass112 = this.chatActivityEnterView;
                if (anonymousClass112 != null && sendAsPeers != null) {
                    anonymousClass112.updateSendAsButton(z6);
                }
            }
            emojiAnimationsOverlay.clear();
            this.currentImageTime = 0L;
            this.switchEventSent = false;
            StoriesController.UploadingStory uploadingStory7 = storyItemHolder.uploadingStory;
            if (uploadingStory7 != null) {
                RadialProgress radialProgress = peerHeaderView.radialProgress;
                if (radialProgress != null) {
                    radialProgress.setProgress(uploadingStory7.progress, false);
                }
                peerHeaderView.backupImageView.invalidate();
            } else if (!z21) {
                peerHeaderView.progressToUploading = 0.0f;
            }
            Bulletin.hideVisible(anonymousClass11);
            anonymousClass12.reset();
            if (this.isActive) {
                StoryViewer storyViewer4 = StoryViewer.this;
                storyViewer4.getClass();
                storyViewer4.updatePlayingMode();
            }
            z5 = true;
        }
        if (z5 || (uploadingStory3 != null && storyItemHolder.uploadingStory == null)) {
            peerHeaderView.setOnSubtitleClick(null);
            this.watchersCount = 0;
            setTitle(this.dialogId, false, storyItemHolder.isLive);
            StoriesController.UploadingStory uploadingStory8 = storyItemHolder.uploadingStory;
            TextView[] textViewArr = peerHeaderView.subtitleView;
            if (uploadingStory8 != null) {
                z8 = z20;
                z10 = z5;
                anonymousClass4 = anonymousClass11;
                string = uploadingStory8.failed ? LocaleController.getString(R.string.FailedToUploadStory) : StoriesUtilities.getUploadingStr(textViewArr[0], this.isEditing);
                uploadingStory2 = uploadingStory3;
                anonymousClass5 = anonymousClass12;
            } else if (isBotsPreview()) {
                TL_stories.StoryItem storyItem17 = storyItemHolder.storyItem;
                if (storyItem17 == null || (messageMedia2 = storyItem17.media) == null) {
                    z8 = z20;
                    z9 = z21;
                } else {
                    TLRPC.Document document = messageMedia2.document;
                    if (document != null) {
                        z8 = z20;
                        z9 = z21;
                        string2 = LocaleController.formatStoryDate(document.date);
                    } else {
                        z8 = z20;
                        z9 = z21;
                        TLRPC.Photo photo3 = messageMedia2.photo;
                        if (photo3 != null) {
                            string2 = LocaleController.formatStoryDate(photo3.date);
                        }
                        z21 = z9;
                        string = charSequence2;
                    }
                    z10 = z5;
                    anonymousClass4 = anonymousClass11;
                    uploadingStory2 = uploadingStory3;
                    anonymousClass5 = anonymousClass12;
                    charSequence2 = string2;
                    z21 = z9;
                    string = charSequence2;
                }
                z10 = z5;
                anonymousClass4 = anonymousClass11;
                uploadingStory2 = uploadingStory3;
                anonymousClass5 = anonymousClass12;
                charSequence2 = "";
                z21 = z9;
                string = charSequence2;
            } else {
                z8 = z20;
                z9 = z21;
                TL_stories.StoryItem storyItem18 = storyItemHolder.storyItem;
                if (storyItem18 != null) {
                    if (storyItem18.media instanceof TLRPC.TL_messageMediaVideoStream) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.LiveStoryBadge));
                        spannableStringBuilder2.setSpan(new ReplacementSpan() {
                            public final RectF rect = new RectF();
                            public final Paint bg = new Paint(1);
                            public final Text text = new Text(LocaleController.getString(R.string.LiveStoryBadge), 9.0f, AndroidUtilities.bold());

                            @Override
                            public final void draw(Canvas canvas, CharSequence charSequence4, int i7, int i8, float f, int i9, int i10, int i11, Paint paint) {
                                float fDp = ((i9 + i11) / 2.0f) + AndroidUtilities.dp(1.33f);
                                RectF rectF = this.rect;
                                rectF.set(f, fDp - AndroidUtilities.dp(7.0f), this.text.getWidth() + f + AndroidUtilities.dp(12.0f), AndroidUtilities.dp(7.0f) + fDp);
                                Paint paint2 = this.bg;
                                paint2.setColor(-572850);
                                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
                                this.text.draw(canvas, AndroidUtilities.dp(6.0f) + f, fDp, -1, 1.0f);
                            }

                            @Override
                            public final int getSize(Paint paint, CharSequence charSequence4, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
                                return (int) (this.text.getWidth() + AndroidUtilities.dp(12.0f));
                            }
                        }, 0, spannableStringBuilder2.length(), 33);
                        spannableStringBuilder2.append((CharSequence) "  ");
                        LivePlayer livePlayer5 = storyViewer.livePlayer;
                        if (livePlayer5 != null) {
                            TLRPC.GroupCall groupCall3 = livePlayer5.call;
                            i = 1;
                            this.watchersCount = Math.max(1, groupCall3 == null ? 0 : groupCall3.participants_count);
                        } else {
                            i = 1;
                        }
                        spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralStringComma("LiveStoryWatching", Math.max(i, this.watchersCount)));
                        string2 = spannableStringBuilder2;
                    } else if (storyItem18.date == -1) {
                        string2 = LocaleController.getString(R.string.CachedStory);
                    } else {
                        if (storyItemHolder.getReply() != null) {
                            StoryCaptionView.Panel reply = storyItemHolder.getReply();
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            z10 = z5;
                            SpannableString spannableString = new SpannableString("r");
                            anonymousClass4 = anonymousClass11;
                            anonymousClass5 = anonymousClass12;
                            spannableString.setSpan(new ColoredImageSpan(R.drawable.mini_repost_story), 0, spannableString.length(), 33);
                            spannableStringBuilder3.append((CharSequence) spannableString).append((CharSequence) " ");
                            if (reply.peerId != null) {
                                AvatarSpan avatarSpan = new AvatarSpan(textViewArr[0], this.currentAccount, 15.0f);
                                SpannableString spannableString2 = new SpannableString("a");
                                spannableString2.setSpan(avatarSpan, 0, 1, 33);
                                spannableStringBuilder3.append((CharSequence) spannableString2).append((CharSequence) " ");
                                if (reply.peerId.longValue() > 0) {
                                    TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(reply.peerId);
                                    avatarSpan.setUser(user3);
                                    spannableStringBuilder3.append((CharSequence) UserObject.getUserName(user3));
                                } else {
                                    TLRPC.Chat chat3 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-reply.peerId.longValue()));
                                    avatarSpan.setChat(chat3);
                                    if (chat3 != null) {
                                        spannableStringBuilder3.append((CharSequence) chat3.title);
                                    }
                                }
                            } else {
                                String str4 = storyItemHolder.storyItem.fwd_from.from_name;
                                if (str4 != null) {
                                    spannableStringBuilder3.append((CharSequence) str4);
                                }
                            }
                            peerHeaderView.setOnSubtitleClick(new RichEditor$$ExternalSyntheticLambda20(14, this, reply));
                            SpannableString spannableString3 = new SpannableString(".");
                            DotDividerSpan dotDividerSpan = new DotDividerSpan();
                            dotDividerSpan.setTopPadding(AndroidUtilities.dp(1.5f));
                            dotDividerSpan.setSize(5.0f);
                            spannableString3.setSpan(dotDividerSpan, 0, spannableString3.length(), 33);
                            spannableStringBuilder3.append((CharSequence) " ").append((CharSequence) spannableString3).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(storyItemHolder.storyItem.date));
                            uploadingStory2 = uploadingStory3;
                            charSequence = spannableStringBuilder3;
                        } else {
                            z10 = z5;
                            anonymousClass4 = anonymousClass11;
                            anonymousClass5 = anonymousClass12;
                            if (!this.isGroup || (storyItem5 = storyItemHolder.storyItem) == null || storyItem5.from_id == null) {
                                uploadingStory2 = uploadingStory3;
                                CharSequence storyDate = LocaleController.formatStoryDate(storyItemHolder.storyItem.date);
                                charSequence2 = storyDate;
                                if (storyItemHolder.storyItem.edited) {
                                    SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(storyDate);
                                    DotDividerSpan dotDividerSpan2 = new DotDividerSpan();
                                    dotDividerSpan2.setTopPadding(AndroidUtilities.dp(1.5f));
                                    dotDividerSpan2.setSize(5.0f);
                                    spannableStringBuilderValueOf.append((CharSequence) " . ").setSpan(dotDividerSpan2, spannableStringBuilderValueOf.length() - 2, spannableStringBuilderValueOf.length() - 1, 0);
                                    spannableStringBuilderValueOf.append((CharSequence) LocaleController.getString(R.string.EditedMessage));
                                    charSequence2 = spannableStringBuilderValueOf;
                                }
                                z21 = z9;
                                string = charSequence2;
                            } else {
                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                AvatarSpan avatarSpan2 = new AvatarSpan(textViewArr[0], this.currentAccount, 15.0f);
                                SpannableString spannableString4 = new SpannableString("a");
                                spannableString4.setSpan(avatarSpan2, 0, 1, 33);
                                spannableStringBuilder4.append((CharSequence) spannableString4).append((CharSequence) " ");
                                long peerDialogId = DialogObject.getPeerDialogId(storyItemHolder.storyItem.from_id);
                                if (peerDialogId > 0) {
                                    TLRPC.User user4 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                                    avatarSpan2.setUser(user4);
                                    spannableStringBuilder4.append((CharSequence) UserObject.getUserName(user4));
                                    uploadingStory2 = uploadingStory3;
                                } else {
                                    uploadingStory2 = uploadingStory3;
                                    TLRPC.Chat chat4 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerDialogId));
                                    avatarSpan2.setChat(chat4);
                                    if (chat4 != null) {
                                        spannableStringBuilder4.append((CharSequence) chat4.title);
                                    }
                                }
                                peerHeaderView.setOnSubtitleClick(new GiftSheet$$ExternalSyntheticLambda1(this, peerDialogId, 3));
                                SpannableString spannableString5 = new SpannableString(".");
                                DotDividerSpan dotDividerSpan3 = new DotDividerSpan();
                                dotDividerSpan3.setTopPadding(AndroidUtilities.dp(1.5f));
                                dotDividerSpan3.setSize(5.0f);
                                spannableString5.setSpan(dotDividerSpan3, 0, spannableString5.length(), 33);
                                spannableStringBuilder4.append((CharSequence) " ").append((CharSequence) spannableString5).append((CharSequence) " ").append((CharSequence) LocaleController.formatShortDate(storyItemHolder.storyItem.date));
                                charSequence = spannableStringBuilder4;
                            }
                        }
                        z21 = false;
                        string = charSequence;
                    }
                    z10 = z5;
                    anonymousClass4 = anonymousClass11;
                    uploadingStory2 = uploadingStory3;
                    anonymousClass5 = anonymousClass12;
                    charSequence2 = string2;
                    z21 = z9;
                    string = charSequence2;
                } else {
                    z10 = z5;
                    anonymousClass4 = anonymousClass11;
                    uploadingStory2 = uploadingStory3;
                    anonymousClass5 = anonymousClass12;
                    z21 = z9;
                    string = null;
                }
            }
            if (string != null) {
                StoriesController.StoriesList storiesList2 = storyViewer.storiesList;
                if (storiesList2 == null || (storyItem6 = storyItemHolder.storyItem) == null || !storiesList2.isPinned(storyItem6.id)) {
                    z11 = false;
                    charSequence3 = string;
                } else {
                    if (!(string instanceof SpannableStringBuilder)) {
                        spannableStringBuilder = string;
                        spannableStringBuilder = new SpannableStringBuilder(string);
                    }
                    spannableStringBuilder = string;
                    SpannableString spannableString6 = new SpannableString("p ");
                    z11 = false;
                    spannableString6.setSpan(new ColoredImageSpan(R.drawable.msg_pin_mini), 0, 1, 33);
                    ((SpannableStringBuilder) spannableStringBuilder).insert(0, (CharSequence) spannableString6);
                    charSequence3 = spannableStringBuilder;
                }
                peerHeaderView.setSubtitle(charSequence3, z21);
            } else {
                z11 = false;
            }
            HintView2 hintView2 = this.privacyHint;
            if (hintView2 != null) {
                hintView2.hide(z11);
            }
            HintView2 hintView3 = this.soundTooltip;
            if (hintView3 != null) {
                hintView3.hide(z11);
            }
        } else {
            z8 = z20;
            z10 = z5;
            anonymousClass4 = anonymousClass11;
            uploadingStory2 = uploadingStory3;
            anonymousClass5 = anonymousClass12;
        }
        TL_stories.StoryItem storyItem19 = storyItemHolder.storyItem;
        if (storyItem9 != storyItem19 || uploadingStory2 != storyItemHolder.uploadingStory) {
            storyItemHolder.updateCaption();
        } else if (storyItemHolder.captionTranslated != (storyItem19 != null && storyItem19.translated && storyItem19.translatedText != null && TextUtils.equals(storyItem19.translatedLng, TranslateAlert2.getToLanguage()))) {
            storyItemHolder.updateCaption();
        }
        if ((storyItemHolder.captionTranslated || storyItem9 != storyItemHolder.storyItem) && (delegate = this.delegate) != null) {
            ((StoryViewer.AnonymousClass5) delegate).setTranslating();
        }
        boolean z22 = storyItemHolder.isLive && (livePlayer2 = storyViewer.livePlayer) != null && storyItemHolder.isThisCall(livePlayer2.getCallId()) && storyViewer.livePlayer.commentsDisabled();
        if (z22 != this.areLiveCommentsDisabled) {
            this.areLiveCommentsDisabled = z22;
            if (z22) {
                createPremiumBlockedText();
            }
            if (this.premiumBlockedText != null && (this.isPremiumBlocked || this.areLiveCommentsDisabled)) {
                updatePremiumBlockedText();
            }
            AnonymousClass19 anonymousClass113 = this.chatActivityEnterView;
            if (anonymousClass113 != null) {
                anonymousClass113.setEnabled((!this.isPremiumBlocked || storyItemHolder.isLive) && !this.areLiveCommentsDisabled);
                this.chatActivityEnterView.updateSendAsButton();
            }
            checkStealthMode(true);
        }
        LinearLayout linearLayout = this.premiumBlockedText;
        int i7 = 8;
        if (linearLayout != null) {
            linearLayout.setVisibility(((!this.isPremiumBlocked || storyItemHolder.isLive) && !this.areLiveCommentsDisabled) ? 8 : 0);
        }
        boolean z23 = this.unsupported;
        LinearLayout linearLayout2 = this.bottomActionsLinearLayout;
        if (z23) {
            createUnsupportedContainer();
            createReplyDisabledView();
            this.unsupportedContainer.setVisibility(0);
            this.replyDisabledTextView.setVisibility(0);
            this.allowShareLink = false;
            this.allowRepost = false;
            this.allowShare = false;
            AnonymousClass19 anonymousClass114 = this.chatActivityEnterView;
            if (anonymousClass114 != null) {
                anonymousClass114.setVisibility(8);
            }
            TONIntroActivity.AnonymousClass2 anonymousClass2 = this.selfView;
            if (anonymousClass2 != null) {
                anonymousClass2.setVisibility(8);
            }
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
        } else {
            TLRPC.Chat chat5 = this.dialogId < 0 ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId)) : null;
            if (storyItemHolder.isLive) {
                if (this.chatActivityEnterView == null) {
                    createEnterView();
                }
                createCommentButton();
                createPaidReactionsButton();
                createMuteButton();
                i2 = 0;
                this.chatActivityEnterView.setVisibility(0);
            } else {
                if ((UserObject.isService(this.dialogId) || isBotsPreview()) && (anonymousClass19 = this.chatActivityEnterView) != null) {
                    anonymousClass19.setVisibility(8);
                } else if (!this.isSelf && ((!this.isChannel || (this.isGroup && (ChatObject.canSendPlain(chat5) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat5)))) && (anonymousClass110 = this.chatActivityEnterView) != null)) {
                    i2 = 0;
                    anonymousClass110.setVisibility(0);
                }
                i2 = 0;
            }
            AnonymousClass19 anonymousClass115 = this.chatActivityEnterView;
            if (anonymousClass115 != null) {
                anonymousClass115.setOnSendButtonLongClick(storyItemHolder.isLive ? new PeerStoriesView$$ExternalSyntheticLambda2(this, i2) : null);
                this.chatActivityEnterView.setLiveComment(storyItemHolder.isLive, disabledPaidFeatures(true));
                this.chatActivityEnterView.setSuggestionButtonVisible(storyItemHolder.isLive && !disabledPaidFeatures(true) && (this.keyboardVisible || this.chatActivityEnterView.emojiViewVisible), true);
            }
            if (this.isPremiumBlocked && this.premiumBlockedText == null) {
                createPremiumBlockedText();
            }
            if (this.premiumBlockedText != null) {
                if (this.isPremiumBlocked || this.areLiveCommentsDisabled) {
                    updatePremiumBlockedText();
                }
                this.premiumBlockedText.setVisibility(((!this.isPremiumBlocked || storyItemHolder.isLive) && !this.areLiveCommentsDisabled) ? 8 : 0);
            }
            AnonymousClass19 anonymousClass116 = this.chatActivityEnterView;
            if (anonymousClass116 != null) {
                anonymousClass116.setEnabled((!this.isPremiumBlocked || storyItemHolder.isLive) && !this.areLiveCommentsDisabled);
            }
            TONIntroActivity.AnonymousClass2 anonymousClass13 = this.selfView;
            if (anonymousClass13 != null) {
                anonymousClass13.setVisibility((!this.isSelf || storyItemHolder.isLive) ? 8 : 0);
            }
            FrameLayout frameLayout = this.unsupportedContainer;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            if (UserObject.isService(this.dialogId)) {
                createReplyDisabledView();
                this.replyDisabledTextView.setVisibility(0);
            } else {
                MentionCell.AnonymousClass1 anonymousClass1 = this.replyDisabledTextView;
                if (anonymousClass1 != null) {
                    anonymousClass1.setVisibility(8);
                }
            }
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(isBotsPreview() ? 8 : 0);
            }
        }
        ChatActivitySideControlsButtonsLayout chatActivitySideControlsButtonsLayout = this.sideControlsButtonsLayout;
        if (chatActivitySideControlsButtonsLayout != null) {
            AnonymousClass19 anonymousClass117 = this.chatActivityEnterView;
            chatActivitySideControlsButtonsLayout.setVisibility((anonymousClass117 == null || anonymousClass117.getVisibility() != 0 || storyItemHolder.isLive) ? 8 : 0);
        }
        CommentButton commentButton = this.commentButton;
        AnonymousClass10 anonymousClass14 = this.liveCommentsView;
        if (commentButton != null) {
            commentButton.setVisibility((this.unsupported || !storyItemHolder.isLive) ? 8 : 0);
            this.commentButton.setCollapsed(anonymousClass14.isCollapsed(), false);
            this.commentButton.setCount(anonymousClass14.getUnreadMessagesCount());
        }
        MuteButton muteButton = this.muteButton;
        if (muteButton != null) {
            muteButton.setVisibility((this.unsupported || !storyItemHolder.isLive || (livePlayer = LivePlayer.recording) == null || !storyItemHolder.isThisCall(livePlayer.getCallId())) ? 8 : 0);
            MuteButton muteButton2 = this.muteButton;
            LivePlayer livePlayer6 = LivePlayer.recording;
            if (livePlayer6 == null) {
                z12 = false;
            } else if (livePlayer6.outgoing && livePlayer6.isMuted) {
                z12 = true;
            } else {
                z12 = false;
            }
            muteButton2.setMuted(z12, true);
            MuteButton muteButton3 = this.muteButton;
            LivePlayer livePlayer7 = LivePlayer.recording;
            muteButton3.setConnected(livePlayer7 == null || livePlayer7.isConnected(), true);
        }
        if (this.starsButton != null) {
            this.starsButtonEffectsView.setVisibility((this.unsupported || !storyItemHolder.isLive) ? 8 : 0);
            this.starsButton.setVisibility((this.unsupported || !storyItemHolder.isLive) ? 8 : 0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.starsButton.getLayoutParams();
            MuteButton muteButton4 = this.muteButton;
            int iDp = AndroidUtilities.dp((muteButton4 == null || muteButton4.getVisibility() != 0) ? 7.0f : 54.0f);
            if (layoutParams.rightMargin != iDp) {
                layoutParams.rightMargin = iDp;
                this.starsButton.setLayoutParams(layoutParams);
            }
        }
        if (storyItemHolder.isLive || ((storyItemHolder.caption == null && storyItemHolder.getReply() == null && storyItemHolder.getMusic() == null) || this.unsupported)) {
            AnonymousClass5 anonymousClass15 = anonymousClass5;
            if (this.isActive) {
                StoryViewer storyViewer5 = StoryViewer.this;
                storyViewer5.isCaption = false;
                storyViewer5.updatePlayingMode();
                Delegate delegate2 = this.delegate;
                this.isCaptionPartVisible = false;
                ((StoryViewer.AnonymousClass5) delegate2).setIsCaptionPartVisible();
            }
            anonymousClass15.setVisibility(8);
        } else {
            AnonymousClass5 anonymousClass16 = anonymousClass5;
            anonymousClass16.captionTextview.setText(storyItemHolder.caption, storyItemHolder.getReply(), storyItemHolder.getMusic(), storyViewer.isTranslating && !storyItemHolder.captionTranslated && (storyItem8 = storyItemHolder.storyItem) != null && storyItem8.translated, storyItem9 == storyItemHolder.storyItem);
            anonymousClass16.setVisibility(0);
        }
        TL_stories.StoryItem storyItem20 = storyItemHolder.storyItem;
        if (storyItem20 != null) {
            TLRPC.MessageMedia messageMedia9 = storyItem20.media;
            if (messageMedia9 instanceof TLRPC.TL_messageMediaVideoStream) {
                if (anonymousClass14.setup(this.dialogId, ((TLRPC.TL_messageMediaVideoStream) messageMedia9).call)) {
                    anonymousClass14.setCollapsed(false, false);
                    this.messageStars = 0L;
                    AnonymousClass19 anonymousClass118 = this.chatActivityEnterView;
                    if (anonymousClass118 != null) {
                        anonymousClass118.checkSendButton(true);
                        this.chatActivityEnterView.updateSendButtonPaid();
                        checkStealthMode(true);
                    }
                }
                anonymousClass14.setVisibility(0);
            } else {
                anonymousClass14.setup(this.dialogId, null);
                anonymousClass14.setVisibility(8);
            }
        } else {
            anonymousClass14.setup(this.dialogId, null);
            anonymousClass14.setVisibility(8);
        }
        anonymousClass4.invalidate();
        if (this.delegate != null && isSelectedPeer()) {
            Delegate delegate3 = this.delegate;
            long j = this.dialogId;
            int i8 = this.selectedPosition;
            StoryViewer storyViewer6 = StoryViewer.this;
            if (storyViewer6.lastPosition != i8 || storyViewer6.lastDialogId != j) {
                storyViewer6.lastDialogId = j;
                storyViewer6.lastPosition = i8;
            }
        }
        boolean z24 = this.isChannel;
        AnonymousClass6 anonymousClass17 = this.repostButtonContainer;
        ImageView imageView = this.shareButton;
        AnonymousClass7 anonymousClass18 = this.likeButtonContainer;
        if (z24) {
            imageView.setVisibility((!this.allowShare || storyItemHolder.isLive) ? 4 : 0);
            if (anonymousClass17 != null) {
                anonymousClass17.setVisibility((!this.allowRepost || storyItemHolder.isLive) ? 8 : 0);
            }
            anonymousClass18.setVisibility((this.isFailed || storyItemHolder.isLive) ? 8 : 0);
        } else {
            imageView.setVisibility((!this.allowShare || storyItemHolder.isLive) ? 4 : 0);
            if (anonymousClass17 != null) {
                anonymousClass17.setVisibility(8);
            }
            anonymousClass18.setVisibility((this.isSelf || storyItemHolder.isLive) ? 8 : 0);
            anonymousClass18.getLayoutParams().width = AndroidUtilities.dp(40.0f);
        }
        anonymousClass18.requestLayout();
        storyViewer.savedPositions.append(this.dialogId, i4);
        if (this.isActive) {
            requestVideoPlayer(0L);
            updatePreloadImages();
            anonymousClass3.bumpPriority();
        }
        anonymousClass14.setLivePlayer(storyViewer.livePlayer);
        this.listPosition = 0;
        if (storyViewer.storiesList != null && (storyItem7 = storyItemHolder.storyItem) != null) {
            int i9 = storyItem7.id;
            for (int i10 = 0; i10 < storyViewer.storiesList.messageObjects.size(); i10++) {
                MessageObject messageObject = (MessageObject) storyViewer.storiesList.messageObjects.get(i10);
                if (messageObject != null && messageObject.getId() == i9) {
                    this.listPosition = i10;
                    break;
                }
            }
        }
        int i11 = this.selectedPosition;
        this.linesPosition = i11;
        int i12 = this.count;
        this.linesCount = i12;
        if (storyViewer.reversed) {
            this.linesPosition = (i12 - 1) - i11;
        }
        boolean zIsVideo = storyItemHolder.isVideo();
        ActionBar.AnonymousClass8 anonymousClass20 = this.muteIconContainer;
        if (zIsVideo) {
            anonymousClass20.setVisibility(0);
            this.muteIconViewAlpha = storyItemHolder.hasSound() ? 1.0f : 0.5f;
            boolean zHasSound = storyItemHolder.hasSound();
            ImageView imageView2 = this.noSoundIconView;
            RLottieImageView rLottieImageView = this.muteIconView;
            if (zHasSound) {
                rLottieImageView.setVisibility(0);
                imageView2.setVisibility(8);
                anonymousClass20.setContentDescription(LocaleController.getString(!StoryViewer.isInSilentMode ? R.string.Mute : R.string.Unmute));
            } else {
                rLottieImageView.setVisibility(8);
                imageView2.setVisibility(0);
                anonymousClass20.setContentDescription(LocaleController.getString(R.string.NoSound));
            }
            anonymousClass20.setAlpha((1.0f - this.outT) * this.muteIconViewAlpha);
        } else {
            anonymousClass20.setVisibility(8);
        }
        StoriesController.UploadingStory uploadingStory9 = storyItemHolder.uploadingStory;
        StoryPrivacyButton storyPrivacyButton = this.privacyButton;
        if (uploadingStory9 != null) {
            storyPrivacyButton.set(this.isSelf, uploadingStory9, z8 && this.editedPrivacy);
        } else {
            TL_stories.StoryItem storyItem21 = storyItemHolder.storyItem;
            if (storyItem21 != null) {
                storyPrivacyButton.set(this.isSelf, storyItem21, z8 && this.editedPrivacy);
            } else {
                storyPrivacyButton.set(this.isSelf, (TL_stories.StoryItem) null, z8 && this.editedPrivacy);
            }
        }
        this.editedPrivacy = false;
        storyPrivacyButton.setTranslationX(anonymousClass20.getVisibility() == 0 ? -AndroidUtilities.dp(44.0f) : 0.0f);
        if (z10) {
            this.drawReactionEffect = false;
            TL_stories.StoryItem storyItem22 = storyItemHolder.storyItem;
            if (storyItem22 == null || (reaction = storyItem22.sent_reaction) == null) {
                this.storiesLikeButton.setReaction(null);
            } else {
                this.storiesLikeButton.setReaction(ReactionsLayoutInBubble.VisibleReaction.fromTL(reaction));
            }
        }
        StoriesController.UploadingStory uploadingStory10 = storyItemHolder.uploadingStory;
        if (uploadingStory10 != null && uploadingStory10.failed) {
            createFailView();
            this.failView.set(storyItemHolder.uploadingStory.entry.error);
            this.failView.setVisibility(0);
            ViewPropertyAnimator viewPropertyAnimator = this.failViewAnimator;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                this.failViewAnimator = null;
            }
            if (z8) {
                ViewPropertyAnimator interpolator = this.failView.animate().alpha(1.0f).setDuration(180L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.failViewAnimator = interpolator;
                interpolator.start();
            } else {
                this.failView.setAlpha(1.0f);
            }
        } else if (this.failView != null) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.failViewAnimator;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                this.failViewAnimator = null;
            }
            if (z8 && this.failView.getVisibility() == 0) {
                ViewPropertyAnimator viewPropertyAnimatorWithEndAction = this.failView.animate().alpha(0.0f).setDuration(180L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new PeerStoriesView$$ExternalSyntheticLambda3(this, 0));
                this.failViewAnimator = viewPropertyAnimatorWithEndAction;
                viewPropertyAnimatorWithEndAction.start();
            } else {
                this.failView.setAlpha(0.0f);
                this.failView.setVisibility(8);
            }
        }
        this.sharedResources.setIconMuted(StoryViewer.isInSilentMode, false);
        if (this.isActive && storyItemHolder.storyItem != null) {
            FileLog.d("StoryViewer displayed story dialogId=" + this.dialogId + " storyId=" + storyItemHolder.storyItem.id + " " + StoryItemHolder.access$9100(storyItemHolder));
        }
        if (this.isSelf) {
            SelfStoryViewsPage.preload(this.currentAccount, this.dialogId, storyItemHolder.storyItem);
        }
        UserCell2.AnonymousClass1 anonymousClass21 = peerHeaderView.titleView;
        StoriesController.StoriesList storiesList3 = storyViewer.storiesList;
        anonymousClass21.setPadding(0, 0, (storiesList3 == null || storiesList3.getCount() == this.linesCount) ? 0 : AndroidUtilities.dp(56.0f), 0);
        MessagesController.getInstance(this.currentAccount).getTranslateController().detectStoryLanguage(storyItemHolder.storyItem);
        if (!z && !this.isSelf && this.reactionsTooltipRunnable == null && !SharedConfig.storyReactionsLongPressHint && SharedConfig.storiesIntroShown) {
            PeerStoriesView$$ExternalSyntheticLambda3 peerStoriesView$$ExternalSyntheticLambda3 = new PeerStoriesView$$ExternalSyntheticLambda3(this, 6);
            this.reactionsTooltipRunnable = peerStoriesView$$ExternalSyntheticLambda3;
            AndroidUtilities.runOnUIThread(peerStoriesView$$ExternalSyntheticLambda3, 500L);
        }
        HintView2 hintView4 = this.soundTooltip;
        if ((hintView4 == null || !hintView4.shown()) && storyItemHolder.hasSound() && StoryViewer.isInSilentMode) {
            if (MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) < 2) {
                PeerStoriesView$$ExternalSyntheticLambda7 peerStoriesView$$ExternalSyntheticLambda7 = this.showTapToSoundHint;
                AndroidUtilities.cancelRunOnUIThread(peerStoriesView$$ExternalSyntheticLambda7);
                AndroidUtilities.runOnUIThread(peerStoriesView$$ExternalSyntheticLambda7, 250L);
            }
        }
        ImageView imageView3 = this.optionsIconView;
        if (imageView3 != null) {
            if (!isBotsPreview()) {
                i3 = 0;
            } else if ((isBotsPreview() && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(storyViewer.storiesList.dialogId))) != null && user.bot && user.bot_can_edit) || storyItemHolder.isVideo) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            imageView3.setVisibility(i3);
        }
        ImageView imageView4 = this.pipIconView;
        if (imageView4 != null) {
            if (storyItemHolder.isLive && !storyPrivacyButton.draw) {
                i7 = 0;
            }
            imageView4.setVisibility(i7);
        }
    }

    public final void updatePreloadImages() {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        ImageReceiver imageReceiver;
        boolean zIsEmpty;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i2;
        ImageReceiver imageReceiver2;
        int size;
        TL_stories.StoryItem storyItem;
        HashMap map;
        StoriesController.UploadingStory uploadingStory;
        TL_stories.StoryItem storyItem2;
        TLRPC.MessageMedia messageMedia;
        boolean zEndsWith;
        String str;
        TL_stories.StoryItem storyItem3;
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList7;
        String str2;
        TLRPC.MessageMedia messageMedia2;
        boolean z;
        ArrayList arrayList8;
        ArrayList arrayList9;
        int i3;
        ArrayList arrayList10;
        byte[] bArr;
        ArrayList arrayList11;
        int iMax = (int) (Math.max(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y) / AndroidUtilities.density);
        String strM = DiffUtil.m(iMax, iMax, "_");
        ArrayList arrayList12 = this.uriesToPrepare;
        arrayList12.clear();
        ArrayList arrayList13 = this.documentsToPrepare;
        arrayList13.clear();
        int i4 = 0;
        while (true) {
            arrayList = this.preloadReactionHolders;
            if (i4 >= arrayList.size()) {
                break;
            }
            ((ReactionImageHolder) arrayList.get(i4)).onAttachedToWindow(false);
            i4++;
        }
        arrayList.clear();
        int i5 = 0;
        while (true) {
            if (i5 >= 2) {
                break;
            }
            int i6 = this.selectedPosition;
            if (i5 == 0) {
                i = i6 - 1;
                imageReceiver = this.leftPreloadImageReceiver;
                if (i < 0) {
                    imageReceiver.clearImage();
                    ArrayList arrayList14 = arrayList13;
                    arrayList8 = arrayList12;
                    arrayList9 = arrayList14;
                    arrayList11 = arrayList;
                    i2 = i5;
                } else {
                    ArrayList arrayList15 = this.uploadingStories;
                    zIsEmpty = arrayList15.isEmpty();
                    arrayList3 = this.storyItems;
                    if (!zIsEmpty || i < arrayList3.size()) {
                        arrayList4 = arrayList12;
                        arrayList5 = arrayList13;
                        arrayList6 = arrayList;
                        i2 = i5;
                        imageReceiver2 = imageReceiver;
                        if (arrayList3.isEmpty()) {
                            if (i < 0) {
                                size = 0;
                            } else {
                                size = i;
                            }
                            if (size >= arrayList3.size()) {
                                size = arrayList3.size() - 1;
                            }
                            storyItem = (TL_stories.StoryItem) arrayList3.get(size);
                            long j = this.dialogId;
                            storyItem.dialogId = j;
                            map = (HashMap) this.storiesController.editingStories.get(j);
                            if (map != null || map.isEmpty()) {
                                uploadingStory = null;
                            } else {
                                uploadingStory = (StoriesController.UploadingStory) map.get(Integer.valueOf(storyItem.id));
                            }
                            if (uploadingStory == null) {
                                storyItem2 = storyItem;
                                messageMedia = storyItem2.media;
                                if (messageMedia == null && MessageObject.isVideoDocument(messageMedia.getDocument())) {
                                    zEndsWith = true;
                                } else {
                                    zEndsWith = false;
                                }
                                str = storyItem2.attachPath;
                                if (str != null) {
                                    if (storyItem2.media == null) {
                                        zEndsWith = str.toLowerCase().endsWith(".mp4");
                                    }
                                    if (zEndsWith) {
                                        imageReceiver2.setImage(ImageLocation.getForPath(storyItem2.attachPath), zzhp.m(strM, "_pframe"), ImageLocation.getForPath(storyItem2.firstFramePath), strM, null, null, null, 0L, null, null, 0);
                                        storyItem3 = storyItem2;
                                    } else {
                                        str2 = strM;
                                        imageReceiver2.setImage(ImageLocation.getForPath(storyItem2.attachPath), str2, null, null, null, 0L, null, null, 0);
                                        storyItem3 = storyItem2;
                                        strM = str2;
                                    }
                                } else if (zEndsWith) {
                                    storyItem3 = storyItem2;
                                    imageReceiver2.setImage(ImageLocation.getForDocument(storyItem2.media.getDocument()), zzhp.m(strM, "_pframe"), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem2.media.getDocument().thumbs, 1000), storyItem2.media.getDocument()), strM, null, null, null, 0L, null, storyItem3, 0);
                                } else {
                                    storyItem3 = storyItem2;
                                    TLRPC.MessageMedia messageMedia3 = storyItem3.media;
                                    photo = messageMedia3 != null ? messageMedia3.photo : null;
                                    if (photo != null || (arrayList7 = photo.sizes) == null) {
                                        imageReceiver2.clearImage();
                                    } else {
                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList7, Integer.MAX_VALUE);
                                        FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 800);
                                        imageReceiver2.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), strM, null, null, null, 0L, null, storyItem3, 0);
                                    }
                                }
                            } else if (uploadingStory.isVideo) {
                                storyItem2 = storyItem;
                                imageReceiver2.setImage(null, null, ImageLocation.getForPath(uploadingStory.firstFramePath), strM, null, null, null, 0L, null, null, 0);
                                storyItem3 = storyItem2;
                            } else {
                                storyItem2 = storyItem;
                                str2 = strM;
                                imageReceiver2.setImage(ImageLocation.getForPath(uploadingStory.path), str2, null, null, null, 0L, null, null, 0);
                                storyItem3 = storyItem2;
                                strM = str2;
                            }
                            messageMedia2 = storyItem3.media;
                            if (messageMedia2 == null && MessageObject.isVideoDocument(messageMedia2.getDocument())) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                TLRPC.Document document = storyItem3.media.getDocument();
                                if (storyItem3.fileReference == 0) {
                                    storyItem3.fileReference = FileLoader.getInstance(this.currentAccount).getFileReference(storyItem3);
                                }
                                try {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("?account=");
                                    sb.append(this.currentAccount);
                                    sb.append("&id=");
                                    sb.append(document.id);
                                    sb.append("&hash=");
                                    sb.append(document.access_hash);
                                    sb.append("&dc=");
                                    sb.append(document.dc_id);
                                    sb.append("&size=");
                                    sb.append(document.size);
                                    sb.append("&mime=");
                                    sb.append(URLEncoder.encode(document.mime_type, "UTF-8"));
                                    sb.append("&rid=");
                                    sb.append(storyItem3.fileReference);
                                    sb.append("&name=");
                                    sb.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
                                    sb.append("&reference=");
                                    bArr = document.file_reference;
                                    if (bArr == null) {
                                        bArr = new byte[0];
                                    }
                                    sb.append(Utilities.bytesToHex(bArr));
                                    sb.append("&sid=");
                                    sb.append(storyItem3.id);
                                    sb.append("&did=");
                                    sb.append(storyItem3.dialogId);
                                    arrayList8 = arrayList4;
                                    try {
                                        arrayList8.add(Uri.parse("tg://" + FileLoader.getAttachFileName(document) + sb.toString()));
                                        arrayList9 = arrayList5;
                                        try {
                                            arrayList9.add(document);
                                        } catch (UnsupportedEncodingException e) {
                                            e = e;
                                            e.printStackTrace();
                                        }
                                    } catch (UnsupportedEncodingException e2) {
                                        e = e2;
                                        arrayList9 = arrayList5;
                                        e.printStackTrace();
                                        if (storyItem3.media_areas != null) {
                                            i3 = 0;
                                            while (i3 < storyItem3.media_areas.size()) {
                                                if (storyItem3.media_areas.get(i3) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                                                    TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = (TL_stories.TL_mediaAreaSuggestedReaction) storyItem3.media_areas.get(i3);
                                                    ReactionImageHolder reactionImageHolder = new ReactionImageHolder(this);
                                                    reactionImageHolder.setVisibleReaction(ReactionsLayoutInBubble.VisibleReaction.fromTL(tL_mediaAreaSuggestedReaction.reaction));
                                                    reactionImageHolder.onAttachedToWindow(this.attachedToWindow);
                                                    arrayList10 = arrayList6;
                                                    arrayList10.add(reactionImageHolder);
                                                } else {
                                                    arrayList10 = arrayList6;
                                                }
                                                i3++;
                                                arrayList6 = arrayList10;
                                            }
                                        }
                                        arrayList11 = arrayList6;
                                        i5 = i2 + 1;
                                        ArrayList arrayList16 = arrayList8;
                                        arrayList13 = arrayList9;
                                        arrayList12 = arrayList16;
                                        arrayList = arrayList11;
                                    }
                                } catch (UnsupportedEncodingException e3) {
                                    e = e3;
                                    arrayList8 = arrayList4;
                                }
                            } else {
                                arrayList8 = arrayList4;
                                arrayList9 = arrayList5;
                            }
                            if (storyItem3.media_areas != null) {
                                i3 = 0;
                                while (i3 < storyItem3.media_areas.size()) {
                                    if (storyItem3.media_areas.get(i3) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                                        TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction2 = (TL_stories.TL_mediaAreaSuggestedReaction) storyItem3.media_areas.get(i3);
                                        ReactionImageHolder reactionImageHolder2 = new ReactionImageHolder(this);
                                        reactionImageHolder2.setVisibleReaction(ReactionsLayoutInBubble.VisibleReaction.fromTL(tL_mediaAreaSuggestedReaction2.reaction));
                                        reactionImageHolder2.onAttachedToWindow(this.attachedToWindow);
                                        arrayList10 = arrayList6;
                                        arrayList10.add(reactionImageHolder2);
                                    } else {
                                        arrayList10 = arrayList6;
                                    }
                                    i3++;
                                    arrayList6 = arrayList10;
                                }
                            }
                        }
                        arrayList11 = arrayList6;
                    } else {
                        StoriesController.UploadingStory uploadingStory2 = (StoriesController.UploadingStory) arrayList15.get(i - arrayList3.size());
                        if (uploadingStory2.isVideo) {
                            arrayList4 = arrayList12;
                            arrayList6 = arrayList;
                            arrayList5 = arrayList13;
                            i2 = i5;
                            imageReceiver.setImage(null, null, ImageLocation.getForPath(uploadingStory2.firstFramePath), strM, null, null, null, 0L, null, null, 0);
                        } else {
                            arrayList4 = arrayList12;
                            arrayList5 = arrayList13;
                            arrayList6 = arrayList;
                            i2 = i5;
                            String str3 = strM;
                            imageReceiver.setImage(ImageLocation.getForPath(uploadingStory2.path), str3, null, null, null, 0L, null, null, 0);
                            strM = str3;
                        }
                    }
                    arrayList8 = arrayList4;
                    arrayList9 = arrayList5;
                    arrayList11 = arrayList6;
                }
            } else {
                i = i6 + 1;
                int storiesCount = getStoriesCount();
                ImageReceiver imageReceiver3 = this.rightPreloadImageReceiver;
                if (i >= storiesCount) {
                    imageReceiver3.clearImage();
                    ArrayList arrayList17 = arrayList13;
                    arrayList8 = arrayList12;
                    arrayList9 = arrayList17;
                    arrayList11 = arrayList;
                    i2 = i5;
                } else {
                    imageReceiver = imageReceiver3;
                    ArrayList arrayList18 = this.uploadingStories;
                    zIsEmpty = arrayList18.isEmpty();
                    arrayList3 = this.storyItems;
                    if (zIsEmpty) {
                        arrayList4 = arrayList12;
                        arrayList5 = arrayList13;
                        arrayList6 = arrayList;
                        i2 = i5;
                        imageReceiver2 = imageReceiver;
                        if (arrayList3.isEmpty()) {
                            if (i < 0) {
                                size = 0;
                            } else {
                                size = i;
                            }
                            if (size >= arrayList3.size()) {
                                size = arrayList3.size() - 1;
                            }
                            storyItem = (TL_stories.StoryItem) arrayList3.get(size);
                            long j2 = this.dialogId;
                            storyItem.dialogId = j2;
                            map = (HashMap) this.storiesController.editingStories.get(j2);
                            if (map != null) {
                                uploadingStory = null;
                            } else {
                                uploadingStory = null;
                            }
                            if (uploadingStory == null) {
                                storyItem2 = storyItem;
                                messageMedia = storyItem2.media;
                                if (messageMedia == null) {
                                    zEndsWith = false;
                                } else {
                                    zEndsWith = false;
                                }
                                str = storyItem2.attachPath;
                                if (str != null) {
                                    if (storyItem2.media == null) {
                                        zEndsWith = str.toLowerCase().endsWith(".mp4");
                                    }
                                    if (zEndsWith) {
                                        imageReceiver2.setImage(ImageLocation.getForPath(storyItem2.attachPath), zzhp.m(strM, "_pframe"), ImageLocation.getForPath(storyItem2.firstFramePath), strM, null, null, null, 0L, null, null, 0);
                                        storyItem3 = storyItem2;
                                    } else {
                                        str2 = strM;
                                        imageReceiver2.setImage(ImageLocation.getForPath(storyItem2.attachPath), str2, null, null, null, 0L, null, null, 0);
                                        storyItem3 = storyItem2;
                                        strM = str2;
                                    }
                                } else if (zEndsWith) {
                                    storyItem3 = storyItem2;
                                    imageReceiver2.setImage(ImageLocation.getForDocument(storyItem2.media.getDocument()), zzhp.m(strM, "_pframe"), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem2.media.getDocument().thumbs, 1000), storyItem2.media.getDocument()), strM, null, null, null, 0L, null, storyItem3, 0);
                                } else {
                                    storyItem3 = storyItem2;
                                    TLRPC.MessageMedia messageMedia4 = storyItem3.media;
                                    if (messageMedia4 != null) {
                                    }
                                    if (photo != null) {
                                        imageReceiver2.clearImage();
                                    } else {
                                        imageReceiver2.clearImage();
                                    }
                                }
                            } else if (uploadingStory.isVideo) {
                                storyItem2 = storyItem;
                                imageReceiver2.setImage(null, null, ImageLocation.getForPath(uploadingStory.firstFramePath), strM, null, null, null, 0L, null, null, 0);
                                storyItem3 = storyItem2;
                            } else {
                                storyItem2 = storyItem;
                                str2 = strM;
                                imageReceiver2.setImage(ImageLocation.getForPath(uploadingStory.path), str2, null, null, null, 0L, null, null, 0);
                                storyItem3 = storyItem2;
                                strM = str2;
                            }
                            messageMedia2 = storyItem3.media;
                            if (messageMedia2 == null) {
                                z = false;
                            } else {
                                z = false;
                            }
                            if (z) {
                                TLRPC.Document document2 = storyItem3.media.getDocument();
                                if (storyItem3.fileReference == 0) {
                                    storyItem3.fileReference = FileLoader.getInstance(this.currentAccount).getFileReference(storyItem3);
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("?account=");
                                sb2.append(this.currentAccount);
                                sb2.append("&id=");
                                sb2.append(document2.id);
                                sb2.append("&hash=");
                                sb2.append(document2.access_hash);
                                sb2.append("&dc=");
                                sb2.append(document2.dc_id);
                                sb2.append("&size=");
                                sb2.append(document2.size);
                                sb2.append("&mime=");
                                sb2.append(URLEncoder.encode(document2.mime_type, "UTF-8"));
                                sb2.append("&rid=");
                                sb2.append(storyItem3.fileReference);
                                sb2.append("&name=");
                                sb2.append(URLEncoder.encode(FileLoader.getDocumentFileName(document2), "UTF-8"));
                                sb2.append("&reference=");
                                bArr = document2.file_reference;
                                if (bArr == null) {
                                    bArr = new byte[0];
                                }
                                sb2.append(Utilities.bytesToHex(bArr));
                                sb2.append("&sid=");
                                sb2.append(storyItem3.id);
                                sb2.append("&did=");
                                sb2.append(storyItem3.dialogId);
                                arrayList8 = arrayList4;
                                arrayList8.add(Uri.parse("tg://" + FileLoader.getAttachFileName(document2) + sb2.toString()));
                                arrayList9 = arrayList5;
                                arrayList9.add(document2);
                            } else {
                                arrayList8 = arrayList4;
                                arrayList9 = arrayList5;
                            }
                            if (storyItem3.media_areas != null) {
                                i3 = 0;
                                while (i3 < storyItem3.media_areas.size()) {
                                    if (storyItem3.media_areas.get(i3) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                                        TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction3 = (TL_stories.TL_mediaAreaSuggestedReaction) storyItem3.media_areas.get(i3);
                                        ReactionImageHolder reactionImageHolder3 = new ReactionImageHolder(this);
                                        reactionImageHolder3.setVisibleReaction(ReactionsLayoutInBubble.VisibleReaction.fromTL(tL_mediaAreaSuggestedReaction3.reaction));
                                        reactionImageHolder3.onAttachedToWindow(this.attachedToWindow);
                                        arrayList10 = arrayList6;
                                        arrayList10.add(reactionImageHolder3);
                                    } else {
                                        arrayList10 = arrayList6;
                                    }
                                    i3++;
                                    arrayList6 = arrayList10;
                                }
                            }
                        } else {
                            arrayList8 = arrayList4;
                            arrayList9 = arrayList5;
                        }
                    } else {
                        arrayList4 = arrayList12;
                        arrayList5 = arrayList13;
                        arrayList6 = arrayList;
                        i2 = i5;
                        imageReceiver2 = imageReceiver;
                        if (arrayList3.isEmpty()) {
                            arrayList8 = arrayList4;
                            arrayList9 = arrayList5;
                        } else {
                            if (i < 0) {
                                size = 0;
                            } else {
                                size = i;
                            }
                            if (size >= arrayList3.size()) {
                                size = arrayList3.size() - 1;
                            }
                            storyItem = (TL_stories.StoryItem) arrayList3.get(size);
                            long j3 = this.dialogId;
                            storyItem.dialogId = j3;
                            map = (HashMap) this.storiesController.editingStories.get(j3);
                            if (map != null) {
                                uploadingStory = null;
                            } else {
                                uploadingStory = null;
                            }
                            if (uploadingStory == null) {
                                storyItem2 = storyItem;
                                messageMedia = storyItem2.media;
                                if (messageMedia == null) {
                                    zEndsWith = false;
                                } else {
                                    zEndsWith = false;
                                }
                                str = storyItem2.attachPath;
                                if (str != null) {
                                    if (storyItem2.media == null) {
                                        zEndsWith = str.toLowerCase().endsWith(".mp4");
                                    }
                                    if (zEndsWith) {
                                        imageReceiver2.setImage(ImageLocation.getForPath(storyItem2.attachPath), zzhp.m(strM, "_pframe"), ImageLocation.getForPath(storyItem2.firstFramePath), strM, null, null, null, 0L, null, null, 0);
                                        storyItem3 = storyItem2;
                                    } else {
                                        str2 = strM;
                                        imageReceiver2.setImage(ImageLocation.getForPath(storyItem2.attachPath), str2, null, null, null, 0L, null, null, 0);
                                        storyItem3 = storyItem2;
                                        strM = str2;
                                    }
                                } else if (zEndsWith) {
                                    storyItem3 = storyItem2;
                                    imageReceiver2.setImage(ImageLocation.getForDocument(storyItem2.media.getDocument()), zzhp.m(strM, "_pframe"), ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(storyItem2.media.getDocument().thumbs, 1000), storyItem2.media.getDocument()), strM, null, null, null, 0L, null, storyItem3, 0);
                                } else {
                                    storyItem3 = storyItem2;
                                    TLRPC.MessageMedia messageMedia5 = storyItem3.media;
                                    if (messageMedia5 != null) {
                                    }
                                    if (photo != null) {
                                        imageReceiver2.clearImage();
                                    } else {
                                        imageReceiver2.clearImage();
                                    }
                                }
                            } else if (uploadingStory.isVideo) {
                                storyItem2 = storyItem;
                                imageReceiver2.setImage(null, null, ImageLocation.getForPath(uploadingStory.firstFramePath), strM, null, null, null, 0L, null, null, 0);
                                storyItem3 = storyItem2;
                            } else {
                                storyItem2 = storyItem;
                                str2 = strM;
                                imageReceiver2.setImage(ImageLocation.getForPath(uploadingStory.path), str2, null, null, null, 0L, null, null, 0);
                                storyItem3 = storyItem2;
                                strM = str2;
                            }
                            messageMedia2 = storyItem3.media;
                            if (messageMedia2 == null) {
                                z = false;
                            } else {
                                z = false;
                            }
                            if (z) {
                                TLRPC.Document document3 = storyItem3.media.getDocument();
                                if (storyItem3.fileReference == 0) {
                                    storyItem3.fileReference = FileLoader.getInstance(this.currentAccount).getFileReference(storyItem3);
                                }
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("?account=");
                                sb3.append(this.currentAccount);
                                sb3.append("&id=");
                                sb3.append(document3.id);
                                sb3.append("&hash=");
                                sb3.append(document3.access_hash);
                                sb3.append("&dc=");
                                sb3.append(document3.dc_id);
                                sb3.append("&size=");
                                sb3.append(document3.size);
                                sb3.append("&mime=");
                                sb3.append(URLEncoder.encode(document3.mime_type, "UTF-8"));
                                sb3.append("&rid=");
                                sb3.append(storyItem3.fileReference);
                                sb3.append("&name=");
                                sb3.append(URLEncoder.encode(FileLoader.getDocumentFileName(document3), "UTF-8"));
                                sb3.append("&reference=");
                                bArr = document3.file_reference;
                                if (bArr == null) {
                                    bArr = new byte[0];
                                }
                                sb3.append(Utilities.bytesToHex(bArr));
                                sb3.append("&sid=");
                                sb3.append(storyItem3.id);
                                sb3.append("&did=");
                                sb3.append(storyItem3.dialogId);
                                arrayList8 = arrayList4;
                                arrayList8.add(Uri.parse("tg://" + FileLoader.getAttachFileName(document3) + sb3.toString()));
                                arrayList9 = arrayList5;
                                arrayList9.add(document3);
                            } else {
                                arrayList8 = arrayList4;
                                arrayList9 = arrayList5;
                            }
                            if (storyItem3.media_areas != null) {
                                i3 = 0;
                                while (i3 < storyItem3.media_areas.size()) {
                                    if (storyItem3.media_areas.get(i3) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                                        TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction4 = (TL_stories.TL_mediaAreaSuggestedReaction) storyItem3.media_areas.get(i3);
                                        ReactionImageHolder reactionImageHolder4 = new ReactionImageHolder(this);
                                        reactionImageHolder4.setVisibleReaction(ReactionsLayoutInBubble.VisibleReaction.fromTL(tL_mediaAreaSuggestedReaction4.reaction));
                                        reactionImageHolder4.onAttachedToWindow(this.attachedToWindow);
                                        arrayList10 = arrayList6;
                                        arrayList10.add(reactionImageHolder4);
                                    } else {
                                        arrayList10 = arrayList6;
                                    }
                                    i3++;
                                    arrayList6 = arrayList10;
                                }
                            }
                        }
                    }
                    arrayList11 = arrayList6;
                }
            }
            i5 = i2 + 1;
            ArrayList arrayList19 = arrayList8;
            arrayList13 = arrayList9;
            arrayList12 = arrayList19;
            arrayList = arrayList11;
        }
        ArrayList arrayList20 = arrayList13;
        ArrayList arrayList21 = arrayList12;
        StoryViewer.AnonymousClass5 anonymousClass5 = (StoryViewer.AnonymousClass5) this.delegate;
        anonymousClass5.getClass();
        if (SharedConfig.deviceIsHigh() && SharedConfig.allowPreparingHevcPlayers()) {
            StoryViewer storyViewer = StoryViewer.this;
            if (storyViewer.isClosed) {
                return;
            }
            int i7 = 0;
            while (true) {
                arrayList2 = storyViewer.preparedPlayers;
                if (i7 >= arrayList2.size()) {
                    break;
                }
                for (int i8 = 0; i8 < arrayList21.size(); i8++) {
                    if (((Uri) arrayList21.get(i8)).equals(((StoryViewer.VideoPlayerHolder) arrayList2.get(i7)).uri)) {
                        arrayList21.remove(i8);
                    }
                }
                i7++;
            }
            for (int i9 = 0; i9 < arrayList21.size(); i9++) {
                Uri uri = (Uri) arrayList21.get(i9);
                StoryViewer.VideoPlayerHolder videoPlayerHolder = storyViewer.new VideoPlayerHolder(storyViewer.surfaceView, storyViewer.textureView);
                videoPlayerHolder.setOnSeekUpdate(new StoryViewer$5$$ExternalSyntheticLambda0(0, anonymousClass5, videoPlayerHolder));
                videoPlayerHolder.uri = uri;
                TLRPC.Document document4 = (TLRPC.Document) arrayList20.get(i9);
                videoPlayerHolder.document = document4;
                FileStreamLoadOperation.setPriorityForDocument(document4, 0);
                videoPlayerHolder.preparePlayer(uri, StoryViewer.isInSilentMode, StoryViewer.currentSpeed);
                arrayList2.add(videoPlayerHolder);
                if (arrayList2.size() > 2) {
                    ((StoryViewer.VideoPlayerHolder) arrayList2.remove(0)).release(null);
                }
            }
        }
    }

    public final void updatePremiumBlockedText() {
        if (this.areLiveCommentsDisabled) {
            TextView textView = this.premiumBlockedText1;
            if (textView != null) {
                textView.setText(LocaleController.getString(R.string.LiveStoryCommentsDisabled));
            }
            TextView textView2 = this.premiumBlockedText2;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.premiumBlockedText1;
        if (textView3 != null) {
            textView3.setText(LocaleController.getString(this.isGroup ? R.string.StoryGroupRepliesLocked : R.string.StoryRepliesLocked));
        }
        TextView textView4 = this.premiumBlockedText2;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.premiumBlockedText2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        }
    }

    public final void updateSelectedPosition() {
        TL_stories.PeerStories peerStories;
        int size;
        ArrayList arrayList = this.day;
        StoryViewer storyViewer = this.storyViewer;
        if (arrayList != null) {
            ArrayList arrayList2 = this.uploadingStories;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                size = 0;
            } else {
                size = arrayList2.size();
                for (int i = 0; i < arrayList2.size(); i++) {
                    long j = ((StoriesController.UploadingStory) arrayList2.get(i)).random_id;
                    if (((int) (j ^ (j >>> 32))) == storyViewer.dayStoryId) {
                        this.selectedPosition = i;
                        return;
                    }
                }
            }
            int iIndexOf = this.day.indexOf(Integer.valueOf(storyViewer.dayStoryId));
            if (iIndexOf < 0 && !this.day.isEmpty()) {
                if (storyViewer.dayStoryId > ((Integer) this.day.get(0)).intValue()) {
                    iIndexOf = 0;
                } else if (storyViewer.dayStoryId < ((Integer) zzin.m(1, this.day)).intValue()) {
                    iIndexOf = this.day.size() - 1;
                }
            }
            this.selectedPosition = size + iIndexOf;
        } else {
            int i2 = storyViewer.savedPositions.get(this.dialogId, -1);
            this.selectedPosition = i2;
            if (i2 == -1 && !storyViewer.isSingleStory && (peerStories = this.userStories) != null && peerStories.max_read_id > 0) {
                int i3 = 0;
                while (true) {
                    ArrayList arrayList3 = this.storyItems;
                    if (i3 >= arrayList3.size()) {
                        break;
                    }
                    if (((TL_stories.StoryItem) arrayList3.get(i3)).id > this.userStories.max_read_id) {
                        this.selectedPosition = i3;
                        break;
                    }
                    i3++;
                }
            }
        }
        if (this.selectedPosition == -1) {
            this.selectedPosition = 0;
        }
    }

    public final void updateStoryItems() {
        StoriesController.StoriesList storiesList;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.storyItems;
        arrayList.clear();
        StoryViewer storyViewer = this.storyViewer;
        if (!storyViewer.isSingleStory) {
            ArrayList arrayList2 = this.day;
            ArrayList arrayList3 = this.uploadingStories;
            int i = 0;
            if (arrayList2 != null && (storiesList = storyViewer.storiesList) != null) {
                if (storiesList instanceof StoriesController.BotPreviewsList) {
                    arrayList3.clear();
                    ArrayList arrayList4 = (ArrayList) MessagesController.getInstance(this.currentAccount).getStoriesController().uploadingStoriesByDialogId.get(this.dialogId);
                    String str = ((StoriesController.BotPreviewsList) storyViewer.storiesList).lang_code;
                    if (arrayList4 != null) {
                        for (int i2 = 0; i2 < arrayList4.size(); i2++) {
                            StoriesController.UploadingStory uploadingStory = (StoriesController.UploadingStory) arrayList4.get(i2);
                            StoryEntry storyEntry = uploadingStory.entry;
                            if (storyEntry != null && !storyEntry.isEdit && TextUtils.equals(storyEntry.botLang, str)) {
                                arrayList3.add(uploadingStory);
                            }
                        }
                    }
                }
                ArrayList arrayList5 = this.day;
                int size = arrayList5.size();
                while (i < size) {
                    Object obj = arrayList5.get(i);
                    i++;
                    MessageObject messageObjectFindMessageObject = storyViewer.storiesList.findMessageObject(((Integer) obj).intValue());
                    if (messageObjectFindMessageObject != null && (storyItem = messageObjectFindMessageObject.storyItem) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (storyViewer.storiesList != null) {
                while (i < storyViewer.storiesList.messageObjects.size()) {
                    arrayList.add(((MessageObject) storyViewer.storiesList.messageObjects.get(i)).storyItem);
                    i++;
                }
            } else {
                TL_stories.PeerStories peerStories = storyViewer.overrideUserStories;
                if (peerStories == null || DialogObject.getPeerDialogId(peerStories.peer) != this.dialogId) {
                    TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) this.storiesController.allStoriesMap.get(this.dialogId);
                    this.userStories = peerStories2;
                    if (peerStories2 == null) {
                        this.userStories = this.storiesController.getStoriesFromFullPeer(this.dialogId);
                    }
                } else {
                    this.userStories = storyViewer.overrideUserStories;
                }
                this.totalStoriesCount = 0;
                TL_stories.PeerStories peerStories3 = this.userStories;
                if (peerStories3 != null) {
                    this.totalStoriesCount = peerStories3.stories.size();
                    arrayList.addAll(this.userStories.stories);
                }
                arrayList3.clear();
                ArrayList arrayList6 = (ArrayList) this.storiesController.uploadingStoriesByDialogId.get(this.dialogId);
                if (arrayList6 != null) {
                    arrayList3.addAll(arrayList6);
                }
            }
        } else if (!storyViewer.singleStoryDeleted) {
            arrayList.add(storyViewer.singleStory);
        }
        this.count = getStoriesCount();
    }

    public final void updateUserViews(boolean z) {
        int i;
        StoryItemHolder storyItemHolder = this.currentStory;
        TL_stories.StoryItem storyItem = storyItemHolder.storyItem;
        if (storyItem == null) {
            storyItem = storyItemHolder.editingSourceItem;
        }
        boolean z2 = this.isChannel;
        if (z2 || this.isSelf) {
            if (storyItem == null) {
                this.selfStatusView.setText("");
                setVisibility(8);
                this.selfAvatarsView.setVisibility(8);
                return;
            }
            StoryViewer storyViewer = this.storyViewer;
            AnonymousClass7 anonymousClass7 = this.likeButtonContainer;
            if (!z2) {
                TL_stories.StoryViews storyViews = storyItem.views;
                if (storyViews == null || storyViews.views_count <= 0) {
                    this.selfStatusView.setText(LocaleController.getString(storyViewer.storiesList == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                    this.selfStatusView.setTranslationX(AndroidUtilities.dp(16.0f));
                    this.selfAvatarsView.setVisibility(8);
                    setVisibility(8);
                } else {
                    int i2 = 0;
                    for (int i3 = 0; i3 < storyItem.views.recent_viewers.size(); i3++) {
                        TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(storyItem.views.recent_viewers.get(i3).longValue());
                        if (userOrChat != null) {
                            this.selfAvatarsView.setObject(i2, this.currentAccount, userOrChat);
                            i2++;
                        }
                        if (i2 >= 3) {
                            break;
                        }
                    }
                    for (int i4 = i2; i4 < 3; i4++) {
                        this.selfAvatarsView.setObject(i4, this.currentAccount, null);
                    }
                    this.selfAvatarsView.commitTransition(false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatPluralStringComma("Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_views_likes);
                        coloredImageSpan.setOverrideColor(-53704);
                        coloredImageSpan.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(coloredImageSpan, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder.append((CharSequence) "  d ");
                        ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.mini_repost_story);
                        coloredImageSpan2.setOverrideColor(-14161823);
                        coloredImageSpan2.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder.setSpan(coloredImageSpan2, spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 0);
                        spannableStringBuilder.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.selfStatusView.setText(spannableStringBuilder);
                    if (i2 == 0) {
                        this.selfAvatarsView.setVisibility(8);
                        this.selfStatusView.setTranslationX(AndroidUtilities.dp(16.0f));
                    } else {
                        this.selfAvatarsView.setVisibility(0);
                        this.selfStatusView.setTranslationX(AndroidUtilities.dp(10.0f) + CalendarActivity$$ExternalSyntheticOutline0.m(i2, 1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(13.0f)));
                    }
                    setVisibility(0);
                }
                anonymousClass7.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                this.bottomActionsLinearLayout.requestLayout();
                return;
            }
            if (storyItem.views == null) {
                storyItem.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews2 = storyItem.views;
            if (storyViews2.views_count <= 0) {
                storyViews2.views_count = 1;
            }
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.repostCounter;
            if (animatedTextDrawable == null || (i = storyViews2.forwards_count) <= 0) {
                this.repostCounterVisible = false;
            } else {
                animatedTextDrawable.setText(Integer.toString(i), z && this.repostCounterVisible);
                this.repostCounterVisible = true;
            }
            int i5 = storyItem.views.reactions_count;
            if (i5 > 0) {
                this.reactionsCounter.setText(Integer.toString(i5), z && this.reactionsCounterVisible);
                this.reactionsCounterVisible = true;
            } else {
                this.reactionsCounterVisible = false;
            }
            if (!z) {
                this.reactionsCounterProgress.set(this.reactionsCounterVisible ? 1.0f : 0.0f, true);
                AnimatedFloat animatedFloat = this.repostCounterProgress;
                if (animatedFloat != null) {
                    animatedFloat.set(this.repostCounterVisible ? 1.0f : 0.0f, true);
                }
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
            if (!(this.isGroup && (ChatObject.canSendPlain(chat) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat))) && storyItem.views.views_count > 0) {
                this.selfStatusView.setText(LocaleController.getString(storyViewer.storiesList == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                this.selfStatusView.setTranslationX(AndroidUtilities.dp(16.0f));
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d  ");
                spannableStringBuilder2.setSpan(new ColoredImageSpan(R.drawable.filled_views), spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
                spannableStringBuilder2.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                this.selfStatusView.setText(spannableStringBuilder2);
            } else {
                this.selfStatusView.setText("");
            }
            anonymousClass7.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.reactionsCounterVisible ? this.reactionsCounter.getAnimateToWidth() + AndroidUtilities.dp(4.0f) : 0.0f));
            ((ViewGroup.MarginLayoutParams) this.selfView.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + anonymousClass7.getLayoutParams().width;
            AnonymousClass6 anonymousClass6 = this.repostButtonContainer;
            if (anonymousClass6 != null) {
                anonymousClass6.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.repostCounterVisible ? this.repostCounter.getAnimateToWidth() + AndroidUtilities.dp(4.0f) : 0.0f));
                ((ViewGroup.MarginLayoutParams) this.selfView.getLayoutParams()).rightMargin += anonymousClass6.getLayoutParams().width;
                anonymousClass6.requestLayout();
            }
            this.selfView.requestLayout();
            anonymousClass7.requestLayout();
            this.selfAvatarsView.setVisibility(8);
            setVisibility(8);
            TL_stories.StoryItem storyItem2 = storyItemHolder.storyItem;
            AnonymousClass3 anonymousClass3 = this.storyAreasView;
            if (storyItem2 == null) {
                anonymousClass3.getClass();
                return;
            }
            for (int i6 = 0; i6 < anonymousClass3.getChildCount(); i6++) {
                if (anonymousClass3.getChildAt(i6) instanceof StoryReactionWidgetView) {
                    ((StoryReactionWidgetView) anonymousClass3.getChildAt(i6)).setViews(storyItem2.views, z);
                }
            }
        }
    }

    public final void updateViewOffsets() {
        float f;
        float f2;
        float f3;
        AnonymousClass6 anonymousClass6;
        ImageView imageView;
        AnonymousClass5 anonymousClass5;
        AnonymousClass7 anonymousClass7;
        ReactionsContainerLayout reactionsContainerLayout;
        float f4;
        float f5 = StoryViewer.this.progressToDismiss;
        float f6 = this.isLongPressed ? 1.0f : 0.0f;
        AnimatedFloat animatedFloat = this.progressToHideInterface;
        animatedFloat.set(f6);
        int i = this.lastOpenedKeyboardHeight;
        float fClamp = (i == 0 || !this.animateKeyboardOpening) ? this.keyboardVisible ? 1.0f : 0.0f : MathUtils.clamp(this.animatingKeyboardHeight / i, 0.0f, 1.0f);
        AnimatedFloat animatedFloat2 = this.progressToRecording;
        float f7 = animatedFloat2.get();
        AnimatedFloat animatedFloat3 = this.progressToTextA;
        float f8 = animatedFloat3.get();
        AnimatedFloat animatedFloat4 = this.progressToStickerExpanded;
        float f9 = animatedFloat4.get();
        animatedFloat2.set(this.isRecording ? 1.0f : 0.0f);
        if (!this.messageSent) {
            AnonymousClass19 anonymousClass19 = this.chatActivityEnterView;
            animatedFloat3.set((anonymousClass19 == null || TextUtils.isEmpty(anonymousClass19.getFieldText())) ? 0.0f : 1.0f);
        }
        AnonymousClass19 anonymousClass110 = this.chatActivityEnterView;
        animatedFloat4.set((anonymousClass110 == null || !anonymousClass110.isStickersExpanded()) ? 0.0f : 1.0f);
        AnonymousClass19 anonymousClass111 = this.chatActivityEnterView;
        if (anonymousClass111 != null) {
            anonymousClass111.checkAnimation();
        }
        AnonymousClass19 anonymousClass112 = this.chatActivityEnterView;
        boolean z = anonymousClass112 != null && anonymousClass112.isPopupShowing();
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        boolean z2 = this.BIG_SCREEN;
        Paint paint = this.inputBackgroundPaint;
        if (z2) {
            paint.setColor(ColorUtils.blendARGB(this.progressToKeyboard, -14933463, Theme.multAlpha(0.44f, -16777216)));
            paint.setAlpha((int) ((1.0f - this.outT) * ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, this.progressToDismiss, paint.getAlpha(), hideInterfaceAlpha)));
        } else {
            paint.setColor(ColorUtils.setAlphaComponent(-16777216, (int) ((1.0f - this.outT) * 137.70001f * hideInterfaceAlpha)));
        }
        boolean z3 = this.forceUpdateOffsets;
        StoryViewer storyViewer = this.storyViewer;
        if (!z3 && this.progressToReply == storyViewer.swipeToReplyProgress && animatedFloat.get() == this.prevToHideProgress && this.lastAnimatingKeyboardHeight == this.animatingKeyboardHeight && fClamp == this.progressToKeyboard && f5 == this.progressToDismiss && f7 == animatedFloat2.get() && !z && f9 == animatedFloat4.get() && f8 == animatedFloat3.get()) {
            return;
        }
        this.forceUpdateOffsets = false;
        this.lastAnimatingKeyboardHeight = this.animatingKeyboardHeight;
        float f10 = animatedFloat.get();
        float f11 = this.prevToHideProgress;
        AnonymousClass4 anonymousClass4 = this.storyContainer;
        if (f10 != f11) {
            anonymousClass4.invalidate();
        }
        if (f5 != 0.0f) {
            anonymousClass4.setLayerType(2, null);
        } else {
            anonymousClass4.setLayerType(0, null);
        }
        this.prevToHideProgress = animatedFloat.get();
        this.progressToDismiss = f5;
        this.progressToKeyboard = fClamp;
        this.progressToReply = storyViewer.swipeToReplyProgress;
        float height = this.animatingKeyboardHeight - (getHeight() - anonymousClass4.getBottom());
        AnonymousClass19 anonymousClass113 = this.chatActivityEnterView;
        float fMax = Math.max(0.0f, height + (anonymousClass113 == null ? 0.0f : anonymousClass113.getHeightWithTopView() * fClamp));
        float height2 = this.lastKeyboardHeight - (getHeight() - anonymousClass4.getBottom());
        AnonymousClass19 anonymousClass114 = this.chatActivityEnterView;
        float fMax2 = Math.max(0.0f, height2 + (anonymousClass114 == null ? 0.0f : anonymousClass114.getHeightWithTopView() * (this.keyboardVisible ? 1.0f : 0.0f)));
        AnonymousClass19 anonymousClass115 = this.chatActivityEnterView;
        if (anonymousClass115 != null) {
            if (this.highlightMessageHintView != null) {
                ImageView suggestButton = anonymousClass115.getSuggestButton();
                if (suggestButton != null) {
                    this.highlightMessageHintView.setJointPx(1.0f, -(AndroidUtilities.dp(74.0f) - suggestButton.getTranslationX()));
                }
                this.highlightMessageHintView.setTranslationY(-((getHeight() - this.chatActivityEnterView.getY()) + AndroidUtilities.dp(6.0f)));
            }
            EditTextCaption editField = this.chatActivityEnterView.getEditField();
            SenderSelectView senderSelectView = this.chatActivityEnterView.getSenderSelectView();
            if (editField != null) {
                f4 = 1.0f;
                f = 6.0f;
                float fLerp = AndroidUtilities.lerp(0.88f, 1.0f, fClamp);
                editField.setScaleX(fLerp);
                editField.setScaleY(fLerp);
            } else {
                f4 = 1.0f;
                f = 6.0f;
            }
            if (senderSelectView != null) {
                float fLerp2 = AndroidUtilities.lerp(0.8f, f4, fClamp);
                senderSelectView.setScaleX(fLerp2);
                senderSelectView.setScaleY(fLerp2);
                senderSelectView.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(2.0f), 0, fClamp));
            }
        } else {
            f = 6.0f;
        }
        float fMax3 = Math.max(0.0f, (this.BIG_SCREEN ? 0.0f : AndroidUtilities.dp(58.0f) * (1.0f - fClamp)) + fMax);
        float fMax4 = Math.max(0.0f, fMax2 + ((this.BIG_SCREEN || this.keyboardVisible) ? 0 : AndroidUtilities.dp(58.0f)));
        float fDp = (AndroidUtilities.dp(f) * fClamp) + fMax3;
        AnonymousClass10 anonymousClass10 = this.liveCommentsView;
        anonymousClass10.keyboardOffset = fDp;
        if (Math.abs(anonymousClass10.keyboardFinalOffset - fMax4) > 0.1f) {
            anonymousClass10.keyboardFinalOffset = fMax4;
            int iDp = AndroidUtilities.dp(8.0f);
            int iDp2 = AndroidUtilities.dp(7.5f);
            f3 = 0.8f;
            LiveCommentsView.AnonymousClass1 anonymousClass1 = anonymousClass10.listView;
            f2 = 8.0f;
            anonymousClass1.setPadding(iDp, Math.max(0, ((int) fMax4) - anonymousClass1.getTop()) + iDp2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
            if (!anonymousClass1.canScrollVertically(1)) {
                anonymousClass10.layoutManager.scrollToPositionWithOffset(0, AndroidUtilities.dp(100.0f));
            }
        } else {
            f2 = 8.0f;
            f3 = 0.8f;
        }
        anonymousClass10.setTranslationY(-anonymousClass10.keyboardOffset);
        anonymousClass10.invalidate();
        LivePlayerView livePlayerView = storyViewer.liveView;
        if (livePlayerView != null) {
            livePlayerView.setKeyboardOffset(fMax);
        }
        ReactionsContainerLayout reactionsContainerLayout2 = this.reactionsContainerLayout;
        StoryItemHolder storyItemHolder = this.currentStory;
        if (reactionsContainerLayout2 != null) {
            reactionsContainerLayout2.setVisibility((this.progressToKeyboard <= 0.0f || (storyItemHolder != null && storyItemHolder.isLive)) ? 8 : 0);
        }
        int i2 = 0;
        while (true) {
            int childCount = getChildCount();
            anonymousClass6 = this.repostButtonContainer;
            imageView = this.shareButton;
            anonymousClass5 = this.storyCaptionView;
            anonymousClass7 = this.likeButtonContainer;
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 0 || childAt == this.selfView || childAt.getTag(R.id.parent_tag) != null || childAt == anonymousClass5.textSelectionHelper.getOverlayView(getContext())) {
                if (childAt == this.selfView) {
                    if (this.BIG_SCREEN) {
                        childAt.setAlpha((1.0f - this.outT) * (1.0f - this.progressToDismiss) * hideInterfaceAlpha);
                    } else {
                        childAt.setAlpha((1.0f - this.outT) * hideInterfaceAlpha);
                    }
                }
                i2++;
            } else {
                AnonymousClass19 anonymousClass116 = this.chatActivityEnterView;
                if (anonymousClass116 != null && childAt == anonymousClass116.getEmojiView()) {
                    childAt.setTranslationY(this.chatActivityEnterView.getEmojiView().getMeasuredHeight() - this.animatingKeyboardHeight);
                } else if (childAt instanceof HintView) {
                    ((HintView) childAt).updatePosition();
                } else if (childAt != this.instantCameraView && childAt != anonymousClass4 && childAt != imageView && childAt != this.bottomActionsLinearLayout && childAt != anonymousClass6 && childAt != this.mediaBanTooltip && childAt != this.highlightMessageHintView && childAt != anonymousClass7 && ((reactionsContainerLayout = this.likesReactionLayout) == null || reactionsContainerLayout.getReactionsWindow() == null || childAt != this.likesReactionLayout.getReactionsWindow().windowView)) {
                    float f12 = this.progressToKeyboard;
                    if (childAt == this.commentButton || childAt == this.starsButton || childAt == this.muteButton || childAt == this.starsButtonEffectsView) {
                        f12 = 0.0f;
                    }
                    float f13 = 1.0f - f12;
                    float fDp2 = (((((-this.enterViewBottomOffset) * f13) - (AndroidUtilities.dp(7.0f) * f12)) - this.animatingKeyboardHeight) - (AndroidUtilities.dp(f2) * f13)) - (AndroidUtilities.dp(20.0f) * storyViewer.swipeToReplyProgress);
                    if (childAt == this.commentButton || childAt == this.starsButton || childAt == this.muteButton || childAt == this.starsButtonEffectsView) {
                        fDp2 += this.animatingKeyboardHeight;
                    }
                    float f14 = this.BIG_SCREEN ? (1.0f - this.progressToDismiss) * hideInterfaceAlpha : hideInterfaceAlpha * 1.0f;
                    if (childAt == this.replyDisabledTextView) {
                        fDp2 = storyViewer.swipeToReplyProgress * (-AndroidUtilities.dp(20.0f));
                    }
                    if (childAt == this.mentionContainer) {
                        fDp2 -= this.chatActivityEnterView.getMeasuredHeight() - this.chatActivityEnterView.getAnimatedTop();
                        f14 = this.progressToKeyboard;
                        childAt.invalidate();
                    }
                    if (childAt == this.sideControlsButtonsLayout) {
                        fDp2 -= this.chatActivityEnterView.getMeasuredHeight() - this.chatActivityEnterView.getAnimatedTop();
                        f14 *= this.progressToKeyboard;
                    }
                    if (childAt == this.reactionsContainerLayout) {
                        float f15 = (1.0f - animatedFloat3.get()) * (1.0f - f9) * (1.0f - animatedFloat2.get()) * this.progressToKeyboard;
                        float f16 = f14 * f15 * 1.0f;
                        if (childAt.getAlpha() != 0.0f && f16 == 0.0f) {
                            this.reactionsContainerLayout.reset();
                        }
                        childAt.setAlpha(f16);
                        float f17 = (f15 * 0.2f) + f3;
                        childAt.setScaleX(f17);
                        childAt.setScaleY(f17);
                    } else {
                        childAt.setTranslationY(fDp2);
                        AnonymousClass19 anonymousClass117 = this.chatActivityEnterView;
                        if (anonymousClass117 == null || childAt != anonymousClass117.controlsView) {
                            childAt.setAlpha(f14);
                        }
                    }
                }
            }
            i2++;
        }
        float f18 = 0.0f;
        float f19 = (1.0f - f5) * hideInterfaceAlpha;
        imageView.setAlpha((1.0f - this.outT) * f19);
        anonymousClass7.setAlpha((1.0f - this.outT) * f19);
        if (anonymousClass6 != null) {
            anonymousClass6.setAlpha((1.0f - this.outT) * f19);
        }
        for (int i3 = 0; i3 < anonymousClass4.getChildCount(); i3++) {
            View childAt2 = anonymousClass4.getChildAt(i3);
            if (childAt2 != null && childAt2 != this.liveCommentsShadowView) {
                PeerHeaderView peerHeaderView = this.headerView;
                ActionBar.AnonymousClass8 anonymousClass8 = this.muteIconContainer;
                if (childAt2 == peerHeaderView || childAt2 == this.optionsIconView || childAt2 == this.pipIconView || childAt2 == anonymousClass8 || childAt2 == this.selfView || childAt2 == anonymousClass5 || childAt2 == this.privacyButton) {
                    float f20 = childAt2 == anonymousClass8 ? this.muteIconViewAlpha : 1.0f;
                    if (childAt2 == anonymousClass5) {
                        childAt2.setAlpha((1.0f - this.outT) * f20 * hideInterfaceAlpha);
                    } else {
                        childAt2.setAlpha((1.0f - this.outT) * f20 * hideInterfaceAlpha);
                    }
                } else {
                    childAt2.setAlpha(hideInterfaceAlpha);
                }
            }
        }
        if (this.chatActivityEnterView != null) {
            float fDp3 = AndroidUtilities.dp(40.0f);
            if (storyItemHolder.isLive) {
                float fDp4 = AndroidUtilities.dp(46.0f);
                fDp3 = AndroidUtilities.dp(46.0f);
                MuteButton muteButton = this.muteButton;
                if (muteButton != null && muteButton.getVisibility() == 0) {
                    fDp3 += AndroidUtilities.dp(46.0f);
                }
                f18 = fDp4;
            } else {
                if (this.allowShare) {
                    fDp3 += AndroidUtilities.dp(46.0f);
                }
                if (this.allowRepost && this.isChannel) {
                    fDp3 += AndroidUtilities.dp(46.0f);
                }
                if (anonymousClass7.getVisibility() == 0) {
                    fDp3 = (fDp3 - AndroidUtilities.dp(40.0f)) + anonymousClass7.getLayoutParams().width;
                }
            }
            this.chatActivityEnterView.setHorizontalPadding(-AndroidUtilities.dp(10.0f), -(AndroidUtilities.dp(10.0f) + fDp3 + f18), this.progressToKeyboard, (this.allowShare || this.isGroup) && !storyItemHolder.isLive);
            if (this.chatActivityEnterView.getEmojiView() != null) {
                this.chatActivityEnterView.getEmojiView().setAlpha(this.progressToKeyboard);
            }
        }
    }

    public final void setActive(long j, boolean z) {
        if (this.isActive != z) {
            this.isActive = z;
            RLottieImageView rLottieImageView = this.muteIconView;
            if (z) {
                if (this.storyViewer.USE_SURFACE_VIEW && Build.VERSION.SDK_INT < 33) {
                    StoryViewer storyViewer = StoryViewer.this;
                    storyViewer.isSwiping = true;
                    storyViewer.updatePlayingMode();
                    AnonymousClass34 anonymousClass34 = this.allowDrawSurfaceRunnable;
                    AndroidUtilities.cancelRunOnUIThread(anonymousClass34);
                    AndroidUtilities.runOnUIThread(anonymousClass34, 100L);
                }
                requestVideoPlayer(j);
                updatePreloadImages();
                rLottieImageView.setAnimation(this.sharedResources.muteDrawable);
                this.isActive = true;
                this.headerView.backupImageView.getImageReceiver().setVisible(true, true);
                StoryItemHolder storyItemHolder = this.currentStory;
                if (storyItemHolder.storyItem != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.dialogId + " storyId=" + storyItemHolder.storyItem.id + " " + StoryItemHolder.access$9100(storyItemHolder));
                }
            } else {
                AnonymousClass5 anonymousClass5 = this.storyCaptionView;
                if (anonymousClass5.textSelectionHelper.isInSelectionMode()) {
                    anonymousClass5.textSelectionHelper.clear();
                }
                rLottieImageView.clearAnimationDrawable();
                this.viewsThumbImageReceiver = null;
                this.isLongPressed = false;
                this.progressToHideInterface.set(0.0f, true);
                this.storyContainer.invalidate();
                invalidate();
                if (this.isActive) {
                    StoryViewer storyViewer2 = StoryViewer.this;
                    storyViewer2.getClass();
                    storyViewer2.updatePlayingMode();
                }
                StoryViewer storyViewer3 = StoryViewer.this;
                storyViewer3.isRecording = false;
                storyViewer3.updatePlayingMode();
            }
            this.imageReceiver.setFileLoadingPriority(this.isActive ? 3 : 2);
            this.leftPreloadImageReceiver.setFileLoadingPriority(this.isActive ? 2 : 0);
            this.rightPreloadImageReceiver.setFileLoadingPriority(this.isActive ? 2 : 0);
            if (this.isSelf || this.isChannel) {
                StoriesController storiesController = this.storiesController;
                long j2 = this.dialogId;
                boolean z2 = this.isActive;
                ViewsForPeerStoriesRequester viewsForPeerStoriesRequester = (ViewsForPeerStoriesRequester) storiesController.pollingViewsForSelfStoriesRequester.get(j2);
                if (viewsForPeerStoriesRequester == null) {
                    viewsForPeerStoriesRequester = new ViewsForPeerStoriesRequester(storiesController.currentAccount, j2, storiesController);
                    storiesController.pollingViewsForSelfStoriesRequester.put(viewsForPeerStoriesRequester, j2);
                }
                viewsForPeerStoriesRequester.start(z2);
            }
        }
    }
}
