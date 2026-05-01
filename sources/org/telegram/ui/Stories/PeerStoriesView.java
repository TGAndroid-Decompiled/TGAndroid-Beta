package org.telegram.ui.Stories;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
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
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import androidx.recyclerview.widget.ChatListItemAnimator;
import com.google.android.exoplayer2.util.Consumer;
import com.google.firebase.sessions.SessionDetails$$ExternalSyntheticBackport0;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
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
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChooseSpeedLayout;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.AvatarsImageView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BitmapShaderTools;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.BulletinFactory$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertDocumentLayout;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.CustomPopupMenu;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.EmojiPacksAlert;
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
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SpeedIconDrawable;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Components.URLSpanMono;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.URLSpanReplacement;
import org.telegram.ui.Components.URLSpanUserMention;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.chat.layouts.ButtonOnClickListener;
import org.telegram.ui.Components.chat.layouts.ChatActivitySideControlsButtonsLayout;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.EmojiAnimationsOverlay;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.MessageStatisticActivity;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ReportBottomSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.PaidReactionButton;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.SelfStoriesPreviewView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoryCaptionView;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.CaptionContainerView;
import org.telegram.ui.Stories.recorder.DraftsController;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.WrappedResourceProvider;

public abstract class PeerStoriesView extends SizeNotifierFrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static boolean DISABLE_STORY_REPOSTING = false;
    private static int activeCount;
    private boolean BIG_SCREEN;
    private ActionBarMenuSubItem albumItem;
    private ViewGroup albumLayout;
    private boolean allowDrawSurface;
    Runnable allowDrawSurfaceRunnable;
    private boolean allowRepost;
    private boolean allowShare;
    private boolean allowShareLink;
    private float alpha;
    boolean animateKeyboardOpening;
    private float animatingKeyboardHeight;
    boolean areLiveCommentsDisabled;
    private boolean attachedToWindow;
    private final AvatarDrawable avatarDrawable;
    private final BitmapShaderTools bitmapShaderTools;
    private BlurredBackgroundColorProviderThemed blurredBackgroundColorProvider;
    private BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableFactory;
    private final BlurredBackgroundSourceColor blurredBackgroundSourceFallback;
    private final BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNodeWithSaturation;
    private final BlurredBackgroundSource blurredBackgroundSourceWithSaturation;
    private TL_stories.TL_premium_boostsStatus boostsStatus;
    private final LinearLayout bottomActionsLinearLayout;
    private ChannelBoostsController.CanApplyBoost canApplyBoost;
    private Runnable cancellableViews;
    private ValueAnimator changeBoundAnimator;
    ChatActivityEnterView chatActivityEnterView;
    private ChatAttachAlert chatAttachAlert;
    boolean checkBlackoutMode;
    private int classGuid;
    private final Path clipPath;
    private CommentButton commentButton;
    int count;
    private int currentAccount;
    private long currentImageTime;
    public final StoryItemHolder currentStory;
    ArrayList day;
    Delegate delegate;
    private boolean deletedPeer;
    private long dialogId;
    ArrayList documentsToPrepare;
    private boolean drawAnimatedEmojiAsMovingReaction;
    private boolean drawReactionEffect;
    public boolean editOpened;
    ActionBarMenuSubItem editStoryItem;
    private boolean editedPrivacy;
    private EmojiAnimationsOverlay emojiAnimationsOverlay;
    BlurredBackgroundDrawable emojiKeyboardBackground;
    private AnimatedEmojiEffect emojiReactionEffect;
    private int enterViewBottomOffset;
    private StoryFailView failView;
    private ViewPropertyAnimator failViewAnimator;
    public boolean forceUpdateOffsets;
    PeerHeaderView headerView;
    HintView2 highlightMessageHintView;
    private boolean imageChanged;
    private final ImageReceiver imageReceiver;
    boolean inBlackoutMode;
    Paint inputBackgroundPaint;
    Paint inputBottomBorderPaint;
    BlurredBackgroundDrawable inputFieldBackground;
    Paint inputTopBorderPaint;
    private InstantCameraView instantCameraView;
    boolean isActive;
    private boolean isCaptionPartVisible;
    boolean isChannel;
    private boolean isEditing;
    private boolean isFailed;
    boolean isGroup;
    private boolean isLongPressed;
    boolean isPremiumBlocked;
    private boolean isRecording;
    boolean isSelf;
    private boolean isUploading;
    private boolean isVisible;
    ValueAnimator keyboardAnimator;
    public boolean keyboardVisible;
    float lastAnimatingKeyboardHeight;
    private long lastDrawTime;
    int lastKeyboardHeight;
    private boolean lastNoThumb;
    int lastOpenedKeyboardHeight;
    private final ImageReceiver leftPreloadImageReceiver;
    private final FrameLayout likeButtonContainer;
    private ReactionsContainerLayout likesReactionLayout;
    private float likesReactionShowProgress;
    private boolean likesReactionShowing;
    private AnimatedFloat linesAlpha;
    private int linesCount;
    private int linesPosition;
    private int listPosition;
    public final View liveCommentsShadowView;
    public final LiveCommentsView liveCommentsView;
    private HintView mediaBanTooltip;
    private MentionsContainerView mentionContainer;
    private boolean messageSent;
    private long messageStars;
    private boolean movingReaction;
    private int movingReactionFromSize;
    private int movingReactionFromX;
    private int movingReactionFromY;
    private float movingReactionProgress;
    private MuteButton muteButton;
    private final FrameLayout muteIconContainer;
    private final RLottieImageView muteIconView;
    private float muteIconViewAlpha;
    private final ImageView noSoundIconView;
    final AnimationNotificationsLocker notificationsLocker;
    private Runnable onImageReceiverThumbLoaded;
    private final ImageView optionsIconView;
    private ValueAnimator outAnimator;
    private float outT;
    RoundRectOutlineProvider outlineProvider;
    private boolean paused;
    public PinchToZoomHelper pinchToZoomHelper;
    private final ImageView pipIconView;
    final VideoPlayerSharedScope playerSharedScope;
    CustomPopupMenu popupMenu;
    private final ArrayList preloadReactionHolders;
    private LinearLayout premiumBlockedText;
    private TextView premiumBlockedText1;
    private TextView premiumBlockedText2;
    private float prevToHideProgress;
    private int previousSelectedPotision;
    private final StoryPrivacyButton privacyButton;
    private HintView2 privacyHint;
    float progressToDismiss;
    private AnimatedFloat progressToHideInterface;
    float progressToKeyboard;
    AnimatedFloat progressToRecording;
    float progressToReply;
    AnimatedFloat progressToStickerExpanded;
    AnimatedFloat progressToTextA;
    private ImageReceiver reactionEffectImageReceiver;
    private AnimatedEmojiDrawable reactionMoveDrawable;
    private ImageReceiver reactionMoveImageReceiver;
    private int reactionsContainerIndex;
    ReactionsContainerLayout reactionsContainerLayout;
    private AnimatedTextView.AnimatedTextDrawable reactionsCounter;
    private AnimatedFloat reactionsCounterProgress;
    private boolean reactionsCounterVisible;
    private HintView2 reactionsLongpressTooltip;
    private Runnable reactionsTooltipRunnable;
    private int realKeyboardHeight;
    private TextView replyDisabledTextView;
    private ImageView repostButton;
    private FrameLayout repostButtonContainer;
    private AnimatedTextView.AnimatedTextDrawable repostCounter;
    private AnimatedFloat repostCounterProgress;
    private boolean repostCounterVisible;
    private final Theme.ResourcesProvider resourcesProvider;
    private final ImageReceiver rightPreloadImageReceiver;
    private int selectedPosition;
    private View selfAvatarsContainer;
    private AvatarsImageView selfAvatarsView;
    private TextView selfStatusView;
    private FrameLayout selfView;
    private TLRPC.TL_channels_sendAsPeers sendAsPeersObj;
    public ShareAlert shareAlert;
    private final ImageView shareButton;
    final SharedResources sharedResources;
    private int shiftDp;
    private final Runnable showTapToSoundHint;
    boolean showViewsProgress;
    ChatActivitySideControlsButtonsLayout sideControlsButtonsLayout;
    private HintView2 soundTooltip;
    private ActionBarMenuSubItem speedItem;
    private ChooseSpeedLayout speedLayout;
    private PaidReactionButton starsButton;
    private PaidReactionButton.PaidReactionButtonEffectsView starsButtonEffectsView;
    long starsPriceBlocked;
    private boolean stealthModeIsActive;
    StoriesController storiesController;
    private StoriesLikeButton storiesLikeButton;
    private StoryMediaAreasView storyAreasView;
    private final StoryCaptionView storyCaptionView;
    public FrameLayout storyContainer;
    private CaptionContainerView storyEditCaptionView;
    final ArrayList storyItems;
    private final StoryLinesDrawable storyLines;
    private StoryPositionView storyPositionView;
    private final StoryViewer storyViewer;
    private boolean switchEventSent;
    private long titleLastDialogId;
    private boolean titleLastLive;
    public FrameLayout topBulletinContainer;
    private int totalStoriesCount;
    public boolean unsupported;
    private FrameLayout unsupportedContainer;
    Runnable updateStealthModeTimer;
    final ArrayList uploadingStories;
    ArrayList uriesToPrepare;
    private boolean userCanSeeViews;
    TL_stories.PeerStories userStories;
    public long videoDuration;
    private float viewsThumbAlpha;
    private SelfStoriesPreviewView.ImageHolder viewsThumbImageReceiver;
    private float viewsThumbPivotY;
    private float viewsThumbScale;
    private boolean wasBigScreen;
    private int watchersCount;

    public interface Delegate {
        int getKeyboardHeight();

        float getProgressToDismiss();

        boolean isClosed();

        void onPeerSelected(long j, int i);

        void preparePlayer(ArrayList arrayList, ArrayList arrayList2);

        boolean releasePlayer(Runnable runnable);

        void requestAdjust(boolean z);

        void requestPlayer(TLRPC.Document document, Uri uri, long j, VideoPlayerSharedScope videoPlayerSharedScope);

        void requestPlayer(TL_stories.StoryItem storyItem, long j, int i, boolean z, TLRPC.InputGroupCall inputGroupCall, VideoPlayerSharedScope videoPlayerSharedScope);

        void setAllowTouchesByViewPager(boolean z);

        void setBulletinIsVisible(boolean z);

        void setHideEnterViewProgress(float f);

        void setIsCaption(boolean z);

        void setIsCaptionPartVisible(boolean z);

        void setIsHintVisible(boolean z);

        void setIsInPinchToZoom(boolean z);

        void setIsInSelectionMode(boolean z);

        void setIsLikesReaction(boolean z);

        void setIsRecording(boolean z);

        void setIsSwiping(boolean z);

        void setIsWaiting(boolean z);

        void setKeyboardVisible(boolean z);

        void setPopupIsVisible(boolean z);

        void setTranslating(boolean z);

        void shouldSwitchToNext();

        void showDialog(Dialog dialog);

        void switchToNextAndRemoveCurrentPeer();
    }

    public boolean drawLinesAsCounter() {
        return false;
    }

    public boolean hideCaptionWithInterface() {
        return true;
    }

    public abstract boolean isSelectedPeer();

    static long access$2914(PeerStoriesView peerStoriesView, long j) {
        long j2 = peerStoriesView.currentImageTime + j;
        peerStoriesView.currentImageTime = j2;
        return j2;
    }

    public PeerStoriesView(final Context context, final StoryViewer storyViewer, final SharedResources sharedResources, final Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.allowDrawSurface = true;
        this.preloadReactionHolders = new ArrayList();
        this.shiftDp = -5;
        this.alpha = 1.0f;
        this.previousSelectedPotision = -1;
        StoryItemHolder storyItemHolder = new StoryItemHolder();
        this.currentStory = storyItemHolder;
        this.progressToKeyboard = -1.0f;
        this.progressToDismiss = -1.0f;
        this.lastAnimatingKeyboardHeight = -1.0f;
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.progressToHideInterface = new AnimatedFloat(this);
        this.linesAlpha = new AnimatedFloat(this);
        this.pinchToZoomHelper = new PinchToZoomHelper();
        this.muteIconViewAlpha = 1.0f;
        this.updateStealthModeTimer = new Runnable() {
            @Override
            public final void run() throws Resources.NotFoundException {
                this.f$0.lambda$new$43();
            }
        };
        this.showTapToSoundHint = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$51();
            }
        };
        this.uriesToPrepare = new ArrayList();
        this.documentsToPrepare = new ArrayList();
        this.allowDrawSurfaceRunnable = new Runnable() {
            @Override
            public void run() {
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                if (peerStoriesView.isActive && peerStoriesView.allowDrawSurface) {
                    PeerStoriesView.this.delegate.setIsSwiping(false);
                }
            }
        };
        this.progressToRecording = new AnimatedFloat(this);
        this.progressToTextA = new AnimatedFloat(this);
        this.progressToStickerExpanded = new AnimatedFloat(this);
        this.clipPath = new Path();
        this.pinchToZoomHelper.setCallback(new PinchToZoomHelper.Callback() {
            @Override
            public TextureView getCurrentTextureView() {
                return PinchToZoomHelper.Callback.CC.$default$getCurrentTextureView(this);
            }

            @Override
            public void onZoomStarted(MessageObject messageObject) {
                PeerStoriesView.this.delegate.setIsInPinchToZoom(true);
            }

            @Override
            public void onZoomFinished(MessageObject messageObject) {
                PeerStoriesView.this.delegate.setIsInPinchToZoom(false);
            }
        });
        this.playerSharedScope = new VideoPlayerSharedScope();
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.storyItems = new ArrayList();
        this.uploadingStories = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver() {
            @Override
            protected boolean setImageBitmapByKey(Drawable drawable, String str, int i, boolean z, int i2) {
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i, z, i2);
                if (i == 1 && PeerStoriesView.this.onImageReceiverThumbLoaded != null) {
                    PeerStoriesView.this.onImageReceiverThumbLoaded.run();
                    PeerStoriesView.this.onImageReceiverThumbLoaded = null;
                }
                return imageBitmapByKey;
            }
        };
        this.imageReceiver = imageReceiver;
        imageReceiver.setCrossfadeWithOldImage(false);
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
        imageReceiver.setFileLoadingPriority(0);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.reactionEffectImageReceiver = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        ImageReceiver imageReceiver3 = this.reactionEffectImageReceiver;
        imageReceiver3.ignoreNotifications = true;
        imageReceiver3.setFileLoadingPriority(3);
        ImageReceiver imageReceiver4 = new ImageReceiver(this);
        this.reactionMoveImageReceiver = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        ImageReceiver imageReceiver5 = this.reactionMoveImageReceiver;
        imageReceiver5.ignoreNotifications = true;
        imageReceiver5.setFileLoadingPriority(3);
        ImageReceiver imageReceiver6 = new ImageReceiver();
        this.leftPreloadImageReceiver = imageReceiver6;
        imageReceiver6.setAllowLoadingOnAttachedOnly(true);
        imageReceiver6.ignoreNotifications = true;
        imageReceiver6.setFileLoadingPriority(0);
        ImageReceiver imageReceiver7 = new ImageReceiver();
        this.rightPreloadImageReceiver = imageReceiver7;
        imageReceiver7.setAllowLoadingOnAttachedOnly(true);
        imageReceiver7.ignoreNotifications = true;
        imageReceiver7.setFileLoadingPriority(0);
        imageReceiver.setPreloadingReceivers(Arrays.asList(imageReceiver6, imageReceiver7));
        this.avatarDrawable = new AvatarDrawable();
        this.storyViewer = storyViewer;
        this.sharedResources = sharedResources;
        this.bitmapShaderTools = sharedResources.bitmapShaderTools;
        this.storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        sharedResources.dimPaint.setColor(-16777216);
        this.inputBackgroundPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.inputTopBorderPaint = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.inputTopBorderPaint.setColor(687865855);
        Paint paint2 = new Paint(1);
        this.inputBottomBorderPaint = paint2;
        paint2.setStyle(style);
        this.inputBottomBorderPaint.setColor(352321535);
        this.resourcesProvider = resourcesProvider;
        setClipChildren(false);
        this.storyAreasView = new StoryMediaAreasView(context, this.storyContainer, resourcesProvider) {
            @Override
            protected void onHintVisible(boolean z) {
                Delegate delegate = PeerStoriesView.this.delegate;
                if (delegate != null) {
                    delegate.setIsHintVisible(z);
                }
            }

            @Override
            protected void presentFragment(BaseFragment baseFragment) {
                StoryViewer storyViewer2 = storyViewer;
                if (storyViewer2 != null) {
                    storyViewer2.presentFragment(baseFragment);
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return super.onTouchEvent(motionEvent);
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public void showEffect(StoryReactionWidgetView storyReactionWidgetView) {
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                if (!peerStoriesView.isSelf && peerStoriesView.currentStory.storyItem != null) {
                    ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(storyReactionWidgetView.mediaArea.reaction);
                    if (!Objects.equals(visibleReactionFromTL, ReactionsLayoutInBubble.VisibleReaction.fromTL(PeerStoriesView.this.currentStory.storyItem.sent_reaction))) {
                        PeerStoriesView.this.likeStory(visibleReactionFromTL);
                    }
                }
                storyReactionWidgetView.performHapticFeedback(3);
                storyReactionWidgetView.playAnimation();
                PeerStoriesView.this.emojiAnimationsOverlay.showAnimationForWidget(storyReactionWidgetView);
            }

            @Override
            protected Bitmap getPlayingBitmap() {
                return PeerStoriesView.this.getPlayingBitmap();
            }
        };
        this.blurredBackgroundColorProvider = new BlurredBackgroundColorProviderThemed(resourcesProvider, Theme.key_chat_messagePanelBackground, 0.8f);
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        this.blurredBackgroundSourceFallback = blurredBackgroundSourceColor;
        blurredBackgroundSourceColor.setColor(ColorUtils.blendARGB(-16777216, -1, 0.2f));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.canBlurChat()) {
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(blurredBackgroundSourceColor);
            this.blurredBackgroundSourceRenderNodeWithSaturation = blurredBackgroundSourceRenderNode;
            blurredBackgroundSourceRenderNode.setBlur(AndroidUtilities.dp(8.0f));
            this.blurredBackgroundSourceWithSaturation = blurredBackgroundSourceRenderNode;
        } else {
            this.blurredBackgroundSourceRenderNodeWithSaturation = null;
            this.blurredBackgroundSourceWithSaturation = blurredBackgroundSourceColor;
        }
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(new ViewPositionWatcher(this), this, this.blurredBackgroundSourceWithSaturation);
        this.blurredBackgroundDrawableFactory = blurredBackgroundDrawableViewFactory;
        this.inputFieldBackground = blurredBackgroundDrawableViewFactory.create(this, this.blurredBackgroundColorProvider);
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = this.blurredBackgroundDrawableFactory.create(this, this.blurredBackgroundColorProvider);
        this.emojiKeyboardBackground = blurredBackgroundDrawableCreate;
        blurredBackgroundDrawableCreate.setThickness(AndroidUtilities.dp(32.0f));
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(context, sharedResources, storyViewer);
        this.storyContainer = anonymousClass4;
        anonymousClass4.setClipChildren(false);
        this.emojiAnimationsOverlay = new EmojiAnimationsOverlay(this.storyContainer, this.currentAccount);
        this.storyContainer.addView(this.storyAreasView, LayoutHelper.createFrame(-1, -1.0f));
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(getContext(), storyViewer.resourcesProvider, storyViewer, resourcesProvider);
        this.storyCaptionView = anonymousClass5;
        anonymousClass5.captionTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$0(view);
            }
        });
        ImageView imageView = new ImageView(context);
        this.shareButton = imageView;
        imageView.setImageDrawable(sharedResources.shareDrawable);
        int iDp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(iDp, iDp, iDp, iDp);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$1(view);
            }
        });
        ScaleStateListAnimator.apply(imageView);
        if (!DISABLE_STORY_REPOSTING) {
            ImageView imageView2 = new ImageView(context);
            this.repostButton = imageView2;
            imageView2.setImageDrawable(sharedResources.repostDrawable);
            this.repostButton.setPadding(iDp, iDp, iDp, iDp);
            FrameLayout frameLayout = new FrameLayout(getContext()) {
                @Override
                protected void dispatchDraw(Canvas canvas) {
                    super.dispatchDraw(canvas);
                    PeerStoriesView peerStoriesView = PeerStoriesView.this;
                    if (!peerStoriesView.isChannel || peerStoriesView.repostCounter == null) {
                        return;
                    }
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - PeerStoriesView.this.repostCounter.getCurrentWidth()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float f = PeerStoriesView.this.repostCounterProgress.set(PeerStoriesView.this.repostCounterVisible ? 1.0f : 0.0f);
                    canvas.scale(f, f, PeerStoriesView.this.repostCounter.getCurrentWidth() / 2.0f, AndroidUtilities.dp(20.0f));
                    PeerStoriesView.this.repostCounter.setAlpha(255);
                    PeerStoriesView.this.repostCounter.draw(canvas);
                    canvas.restore();
                }

                @Override
                protected boolean verifyDrawable(Drawable drawable) {
                    return drawable == PeerStoriesView.this.repostCounter || super.verifyDrawable(drawable);
                }
            };
            this.repostButtonContainer = frameLayout;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.repostCounter;
            if (animatedTextDrawable != null) {
                animatedTextDrawable.setCallback(frameLayout);
            }
            this.repostButtonContainer.setWillNotDraw(false);
            this.repostButtonContainer.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$2(view);
                }
            });
        }
        FrameLayout frameLayout2 = new FrameLayout(getContext()) {
            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                if (!peerStoriesView.isChannel || peerStoriesView.reactionsCounter == null) {
                    return;
                }
                canvas.save();
                canvas.translate((getMeasuredWidth() - PeerStoriesView.this.reactionsCounter.getCurrentWidth()) - AndroidUtilities.dp(6.0f), 0.0f);
                float f = PeerStoriesView.this.reactionsCounterProgress.set(PeerStoriesView.this.reactionsCounterVisible ? 1.0f : 0.0f);
                canvas.scale(f, f, PeerStoriesView.this.reactionsCounter.getCurrentWidth() / 2.0f, AndroidUtilities.dp(20.0f));
                PeerStoriesView.this.reactionsCounter.setAlpha(255);
                PeerStoriesView.this.reactionsCounter.draw(canvas);
                canvas.restore();
            }

            @Override
            protected boolean verifyDrawable(Drawable drawable) {
                return drawable == PeerStoriesView.this.reactionsCounter || super.verifyDrawable(drawable);
            }
        };
        this.likeButtonContainer = frameLayout2;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.reactionsCounter;
        if (animatedTextDrawable2 != null) {
            animatedTextDrawable2.setCallback(frameLayout2);
        }
        frameLayout2.setWillNotDraw(false);
        frameLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$4(view);
            }
        });
        frameLayout2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                return this.f$0.lambda$new$5(storyViewer, view);
            }
        });
        StoriesLikeButton storiesLikeButton = new StoriesLikeButton(context, sharedResources);
        this.storiesLikeButton = storiesLikeButton;
        storiesLikeButton.setPadding(iDp, iDp, iDp, iDp);
        frameLayout2.addView(this.storiesLikeButton, LayoutHelper.createFrame(40, 40, 3));
        FrameLayout frameLayout3 = this.repostButtonContainer;
        if (frameLayout3 != null) {
            frameLayout3.addView(this.repostButton, LayoutHelper.createFrame(40, 40, 3));
        }
        ScaleStateListAnimator.apply(frameLayout2, 0.3f, 5.0f);
        FrameLayout frameLayout4 = this.repostButtonContainer;
        if (frameLayout4 != null) {
            ScaleStateListAnimator.apply(frameLayout4, 0.3f, 5.0f);
        }
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.setParentView(this.storyContainer);
        RoundRectOutlineProvider roundRectOutlineProvider = new RoundRectOutlineProvider(10);
        this.outlineProvider = roundRectOutlineProvider;
        this.storyContainer.setOutlineProvider(roundRectOutlineProvider);
        this.storyContainer.setClipToOutline(true);
        addView(this.storyContainer);
        PeerHeaderView peerHeaderView = new PeerHeaderView(context, storyItemHolder);
        this.headerView = peerHeaderView;
        peerHeaderView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$6(storyViewer, view);
            }
        });
        this.storyContainer.addView(this.headerView, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        this.topBulletinContainer = new FrameLayout(context);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.bottomActionsLinearLayout = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, LayoutHelper.createLinear(40, 40, 5));
        FrameLayout frameLayout5 = this.repostButtonContainer;
        if (frameLayout5 != null) {
            linearLayout.addView(frameLayout5, LayoutHelper.createLinear(40, 40, 5));
        }
        linearLayout.addView(frameLayout2, LayoutHelper.createLinear(40, 40, 5));
        addView(linearLayout, LayoutHelper.createFrame(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.optionsIconView = imageView3;
        imageView3.setImageDrawable(sharedResources.optionsDrawable);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(Theme.createSelectorDrawable(-1));
        this.storyContainer.addView(imageView3, LayoutHelper.createFrame(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.pipIconView = imageView4;
        imageView4.setImageDrawable(sharedResources.pipDrawable);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(Theme.createSelectorDrawable(-1));
        this.storyContainer.addView(imageView4, LayoutHelper.createFrame(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PeerStoriesView.lambda$new$7(storyViewer, view);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$8(resourcesProvider, storyViewer, context, sharedResources, view);
            }
        });
        FrameLayout frameLayout6 = new FrameLayout(context) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return super.onTouchEvent(motionEvent);
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        this.muteIconContainer = frameLayout6;
        this.storyContainer.addView(frameLayout6, LayoutHelper.createFrame(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.muteIconView = rLottieImageView;
        rLottieImageView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        frameLayout6.addView(rLottieImageView);
        ImageView imageView5 = new ImageView(context);
        this.noSoundIconView = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView5.setImageDrawable(sharedResources.noSoundDrawable);
        frameLayout6.addView(imageView5);
        imageView5.setVisibility(8);
        StoryPrivacyButton storyPrivacyButton = new StoryPrivacyButton(context);
        this.privacyButton = storyPrivacyButton;
        storyPrivacyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$10(view);
            }
        });
        this.storyContainer.addView(storyPrivacyButton, LayoutHelper.createFrame(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        frameLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$11(storyViewer, view);
            }
        });
        this.storyLines = new StoryLinesDrawable(this, sharedResources);
        this.storyContainer.addView(anonymousClass5, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.liveCommentsShadowView = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        LiveCommentsView liveCommentsView = new LiveCommentsView(context, storyViewer, storyViewer.containerView, view, this.topBulletinContainer) {
            @Override
            public void setVisibility(int i) {
                super.setVisibility(i);
                PeerStoriesView.this.liveCommentsShadowView.setVisibility(i);
            }

            @Override
            protected TLRPC.Peer getDefaultSendAs() {
                LivePlayer livePlayer = storyViewer.livePlayer;
                if (livePlayer != null) {
                    return livePlayer.getDefaultSendAs();
                }
                return null;
            }

            @Override
            protected boolean isMe(long j) {
                if (j == UserConfig.getInstance(PeerStoriesView.this.currentAccount).getClientUserId()) {
                    return true;
                }
                LivePlayer livePlayer = storyViewer.livePlayer;
                if (livePlayer != null && j == DialogObject.getPeerDialogId(livePlayer.getDefaultSendAs())) {
                    return true;
                }
                if (PeerStoriesView.this.sendAsPeersObj != null) {
                    for (int i = 0; i < PeerStoriesView.this.sendAsPeersObj.peers.size(); i++) {
                        if (j == DialogObject.getPeerDialogId(PeerStoriesView.this.sendAsPeersObj.peers.get(i).peer)) {
                            return true;
                        }
                    }
                }
                return false;
            }

            @Override
            public void setCollapsed(boolean z, boolean z2) {
                super.setCollapsed(z, z2);
                if (PeerStoriesView.this.commentButton != null) {
                    PeerStoriesView.this.commentButton.setCollapsed(z, z2);
                }
            }

            @Override
            protected void onMessagesCountUpdated() {
                if (PeerStoriesView.this.commentButton != null) {
                    PeerStoriesView.this.commentButton.setCount(getUnreadMessagesCount());
                }
            }

            @Override
            protected void onStarsCountUpdated() {
                PeerStoriesView.this.starsButton.setCount((int) getStarsCount());
                PeerStoriesView.this.starsButton.setFilled(areSendingStars());
            }

            @Override
            protected void onStarsButtonPressed(long j, boolean z) {
                if (z) {
                    PeerStoriesView.this.starsButton.playEffect(j);
                } else {
                    PeerStoriesView.this.starsButton.stopEffects();
                }
            }

            @Override
            protected void onStarReaction(long j, int i, int i2) {
                if (PeerStoriesView.this.starsButtonEffectsView == null) {
                    return;
                }
                PeerStoriesView.this.starsButtonEffectsView.pushChip(j, i, i2);
            }

            @Override
            protected void onCancelledStarReaction(long j) {
                if (PeerStoriesView.this.starsButtonEffectsView == null) {
                    return;
                }
                PeerStoriesView.this.starsButtonEffectsView.removeChipsFrom(j);
            }

            @Override
            protected void onStarsButtonCancelled() {
                PeerStoriesView.this.starsButton.stopEffects();
            }
        };
        this.liveCommentsView = liveCommentsView;
        this.storyContainer.addView(view, LayoutHelper.createFrame(-1, 200, 87));
        this.storyContainer.addView(liveCommentsView, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        this.storyContainer.addView(this.topBulletinContainer, LayoutHelper.createFrame(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        frameLayout6.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(20.0f), 0, ColorUtils.setAlphaComponent(-1, 100)));
        imageView3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(20.0f), 0, ColorUtils.setAlphaComponent(-1, 100)));
        imageView4.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(20.0f), 0, ColorUtils.setAlphaComponent(-1, 100)));
        imageView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(20.0f), 0, ColorUtils.setAlphaComponent(-1, 100)));
        frameLayout2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(20.0f), 0, ColorUtils.setAlphaComponent(-1, 100)));
        FrameLayout frameLayout7 = this.repostButtonContainer;
        if (frameLayout7 != null) {
            frameLayout7.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(20.0f), 0, ColorUtils.setAlphaComponent(-1, 100)));
        }
        View overlayView = anonymousClass5.textSelectionHelper.getOverlayView(context);
        if (overlayView != null) {
            AndroidUtilities.removeFromParent(overlayView);
            addView(overlayView);
        }
        anonymousClass5.textSelectionHelper.setCallback(new TextSelectionHelper.Callback() {
            @Override
            public void onStateChanged(boolean z) {
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                peerStoriesView.delegate.setIsInSelectionMode(peerStoriesView.storyCaptionView.textSelectionHelper.isInSelectionMode());
            }
        });
        anonymousClass5.textSelectionHelper.setParentView(this);
    }

    class AnonymousClass4 extends HwFrameLayout {
        boolean drawOverlayed;
        final CellFlickerDrawable loadingDrawable;
        final AnimatedFloat loadingDrawableAlpha;
        final AnimatedFloat loadingDrawableAlpha2;
        final AnimatedFloat progressToAudio;
        final AnimatedFloat progressToFullBlackoutA;
        boolean splitDrawing;
        final SharedResources val$sharedResources;
        final StoryViewer val$storyViewer;

        AnonymousClass4(Context context, SharedResources sharedResources, StoryViewer storyViewer) {
            super(context);
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
        protected void dispatchDraw(android.graphics.Canvas r17) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.PeerStoriesView.AnonymousClass4.dispatchDraw(android.graphics.Canvas):void");
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view == PeerStoriesView.this.storyAreasView) {
                return true;
            }
            if (this.splitDrawing) {
                if (Bulletin.getVisibleBulletin() != null && view == Bulletin.getVisibleBulletin().getLayout()) {
                    if (this.drawOverlayed) {
                        return super.drawChild(canvas, view, j);
                    }
                    return true;
                }
                return super.drawChild(canvas, view, j);
            }
            return super.drawChild(canvas, view, j);
        }

        private void drawLines(android.graphics.Canvas r22) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.PeerStoriesView.AnonymousClass4.drawLines(android.graphics.Canvas):void");
        }

        public void lambda$drawLines$0() {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            if (peerStoriesView.delegate != null) {
                if (peerStoriesView.isUploading || PeerStoriesView.this.isEditing || PeerStoriesView.this.isFailed) {
                    if (!PeerStoriesView.this.currentStory.isVideo()) {
                        PeerStoriesView.this.currentImageTime = 0L;
                        return;
                    } else {
                        PeerStoriesView.this.playerSharedScope.player.loopBack();
                        return;
                    }
                }
                PeerStoriesView.this.delegate.shouldSwitchToNext();
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            PeerStoriesView.this.emojiAnimationsOverlay.onAttachedToWindow();
            Bulletin.addDelegate(this, new Bulletin.Delegate() {
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
                    return i == 1 || i == 2 || i == 3;
                }

                @Override
                public void onBottomOffsetChange(float f) {
                    Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
                }

                @Override
                public int getTopOffset(int i) {
                    return AndroidUtilities.dp(58.0f);
                }

                @Override
                public void onShow(Bulletin bulletin) {
                    Delegate delegate;
                    if (bulletin == null || bulletin.tag != 2 || (delegate = PeerStoriesView.this.delegate) == null) {
                        return;
                    }
                    delegate.setBulletinIsVisible(true);
                }

                @Override
                public void onHide(Bulletin bulletin) {
                    Delegate delegate;
                    if (bulletin == null || bulletin.tag != 2 || (delegate = PeerStoriesView.this.delegate) == null) {
                        return;
                    }
                    delegate.setBulletinIsVisible(false);
                }

                @Override
                public int getBottomOffset(int i) {
                    if (PeerStoriesView.this.BIG_SCREEN) {
                        return 0;
                    }
                    return AndroidUtilities.dp(64.0f);
                }
            });
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            PeerStoriesView.this.emojiAnimationsOverlay.onDetachedFromWindow();
            Bulletin.removeDelegate(this);
            Delegate delegate = PeerStoriesView.this.delegate;
            if (delegate != null) {
                delegate.setBulletinIsVisible(false);
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) PeerStoriesView.this.muteIconContainer.getLayoutParams();
            if (PeerStoriesView.this.drawLinesAsCounter()) {
                layoutParams.rightMargin = AndroidUtilities.dp(2.0f);
                layoutParams.topMargin = AndroidUtilities.dp(55.0f);
            } else {
                layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
                layoutParams.topMargin = AndroidUtilities.dp(15.0f);
            }
            super.onMeasure(i, i2);
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            LivePlayer livePlayer;
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            if (peerStoriesView.isActive && !peerStoriesView.unsupported) {
                VideoPlayerSharedScope videoPlayerSharedScope = peerStoriesView.playerSharedScope;
                if (videoPlayerSharedScope.renderView != null && (livePlayer = videoPlayerSharedScope.livePlayer) != null && livePlayer.isEmptyStream() && PeerStoriesView.this.playerSharedScope.renderView.dispatchTouchEvent(motionEvent)) {
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    class AnonymousClass5 extends StoryCaptionView {
        final Theme.ResourcesProvider val$resourcesProvider;
        final StoryViewer val$storyViewer;

        AnonymousClass5(Context context, Theme.ResourcesProvider resourcesProvider, StoryViewer storyViewer, Theme.ResourcesProvider resourcesProvider2) {
            super(context, resourcesProvider);
            this.val$storyViewer = storyViewer;
            this.val$resourcesProvider = resourcesProvider2;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        public void onLinkClick(CharacterStyle characterStyle, View view) {
            if (characterStyle instanceof URLSpanUserMention) {
                TLRPC.User user = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getUser(Utilities.parseLong(((URLSpanUserMention) characterStyle).getURL()));
                if (user != null) {
                    MessagesController.getInstance(PeerStoriesView.this.currentAccount).openChatOrProfileWith(user, null, this.val$storyViewer.fragment, 0, false);
                    return;
                }
                return;
            }
            if (characterStyle instanceof URLSpanNoUnderline) {
                String url = ((URLSpanNoUnderline) characterStyle).getURL();
                if (url != null && (url.startsWith("#") || url.startsWith("$"))) {
                    if (url.contains("@")) {
                        StoryViewer storyViewer = this.val$storyViewer;
                        if (storyViewer != null) {
                            storyViewer.presentFragment(new HashtagActivity(url));
                            return;
                        }
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("type", 3);
                    bundle.putString("hashtag", url);
                    StoryViewer storyViewer2 = this.val$storyViewer;
                    if (storyViewer2 != null) {
                        storyViewer2.presentFragment(new MediaActivity(bundle, null));
                        return;
                    }
                    return;
                }
                String strExtractUsername = Browser.extractUsername(url);
                if (strExtractUsername != null) {
                    String lowerCase = strExtractUsername.toLowerCase();
                    if (url.startsWith("@")) {
                        MessagesController.getInstance(PeerStoriesView.this.currentAccount).openByUserName(lowerCase, this.val$storyViewer.fragment, 0, null);
                        return;
                    } else {
                        processExternalUrl(0, url, characterStyle, false);
                        return;
                    }
                }
                processExternalUrl(0, url, characterStyle, false);
                return;
            }
            if (characterStyle instanceof URLSpan) {
                processExternalUrl(2, ((URLSpan) characterStyle).getURL(), characterStyle, characterStyle instanceof URLSpanReplacement);
                return;
            }
            if (characterStyle instanceof URLSpanMono) {
                ((URLSpanMono) characterStyle).copyToClipboard();
                BulletinFactory.of(PeerStoriesView.this.storyContainer, this.val$resourcesProvider).createCopyBulletin(LocaleController.getString(R.string.TextCopied)).show();
            } else if (characterStyle instanceof ClickableSpan) {
                ((ClickableSpan) characterStyle).onClick(view);
            }
        }

        private void processExternalUrl(int r12, java.lang.String r13, android.text.style.CharacterStyle r14, boolean r15) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.PeerStoriesView.AnonymousClass5.processExternalUrl(int, java.lang.String, android.text.style.CharacterStyle, boolean):void");
        }

        @Override
        public void onLinkLongPress(final URLSpan uRLSpan, final View view, final Runnable runnable) throws UnsupportedEncodingException {
            final String url = uRLSpan.getURL();
            String url2 = uRLSpan.getURL();
            try {
                try {
                    Uri uri = Uri.parse(url2);
                    url2 = Browser.replaceHostname(uri, Browser.IDN_toUnicode(uri.getHost()), null);
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                }
                url2 = URLDecoder.decode(url2.replaceAll("\\+", "%2b"), "UTF-8");
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            try {
                performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            BottomSheet.Builder builder = new BottomSheet.Builder(getContext(), false, this.val$resourcesProvider);
            builder.setTitle(url2);
            builder.setTitleMultipleLines(true);
            StoryItemHolder storyItemHolder = PeerStoriesView.this.currentStory;
            CharSequence[] charSequenceArr = (storyItemHolder == null || storyItemHolder.allowScreenshots()) ? new CharSequence[]{LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)} : new CharSequence[]{LocaleController.getString(R.string.Open)};
            final Theme.ResourcesProvider resourcesProvider = this.val$resourcesProvider;
            builder.setItems(charSequenceArr, new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f$0.lambda$onLinkLongPress$0(uRLSpan, view, url, resourcesProvider, dialogInterface, i);
                }
            });
            builder.setOnPreDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    runnable.run();
                }
            });
            BottomSheet bottomSheetCreate = builder.create();
            bottomSheetCreate.fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, this.val$resourcesProvider));
            PeerStoriesView.this.delegate.showDialog(bottomSheetCreate);
        }

        public void lambda$onLinkLongPress$0(URLSpan uRLSpan, View view, String str, Theme.ResourcesProvider resourcesProvider, DialogInterface dialogInterface, int i) {
            if (i == 0) {
                onLinkClick(uRLSpan, view);
            } else if (i == 1) {
                AndroidUtilities.addToClipboard(str);
                BulletinFactory.of(PeerStoriesView.this.storyContainer, resourcesProvider).createCopyLinkBulletin().show();
            }
        }

        @Override
        public void onReplyClick(View view, final StoryCaptionView.Panel panel) {
            if (panel == null) {
                return;
            }
            final TLRPC.Document document = panel.music;
            if (document != null) {
                int i = R.drawable.msg_saved;
                String string = LocaleController.getString(R.string.StoryAudioAddToSavedMessages);
                final Theme.ResourcesProvider resourcesProvider = this.val$resourcesProvider;
                ItemOptions itemOptionsAddIf = ItemOptions.makeOptions(this.val$storyViewer.containerView, this.val$resourcesProvider, PeerStoriesView.this.storyCaptionView).setGravity(3).translate(-AndroidUtilities.dp(8.0f), 0.0f).addIf(document instanceof TLRPC.TL_document, i, string, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onReplyClick$2(document, resourcesProvider);
                    }
                });
                int i2 = R.drawable.msg_tone_add;
                String string2 = LocaleController.getString(R.string.StoryAudioAddToProfile);
                final Theme.ResourcesProvider resourcesProvider2 = this.val$resourcesProvider;
                itemOptionsAddIf.add(i2, string2, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onReplyClick$3(document, resourcesProvider2);
                    }
                }).show();
                return;
            }
            if (panel.isRepostMessage && panel.peerId != null && panel.messageId != null) {
                Bundle bundle = new Bundle();
                if (panel.peerId.longValue() >= 0) {
                    bundle.putLong("user_id", panel.peerId.longValue());
                } else {
                    bundle.putLong("chat_id", -panel.peerId.longValue());
                }
                bundle.putInt("message_id", panel.messageId.intValue());
                this.val$storyViewer.presentFragment(new ChatActivity(bundle));
                return;
            }
            if (panel.peerId != null && panel.storyId != null) {
                StoriesController storiesController = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getStoriesController();
                long jLongValue = panel.peerId.longValue();
                int iIntValue = panel.storyId.intValue();
                final StoryViewer storyViewer = this.val$storyViewer;
                final Theme.ResourcesProvider resourcesProvider3 = this.val$resourcesProvider;
                storiesController.resolveStoryLink(jLongValue, iIntValue, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        this.f$0.lambda$onReplyClick$5(panel, storyViewer, resourcesProvider3, (TL_stories.StoryItem) obj);
                    }
                });
                return;
            }
            BulletinFactory.of(PeerStoriesView.this.storyContainer, this.val$resourcesProvider).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.StoryHidAccount)).setTag(3).show(true);
        }

        public void lambda$onReplyClick$2(TLRPC.Document document, Theme.ResourcesProvider resourcesProvider) {
            SendMessagesHelper sendMessagesHelper = SendMessagesHelper.getInstance(PeerStoriesView.this.currentAccount);
            TLRPC.TL_document tL_document = (TLRPC.TL_document) document;
            long clientUserId = UserConfig.getInstance(PeerStoriesView.this.currentAccount).getClientUserId();
            StoryItemHolder storyItemHolder = PeerStoriesView.this.currentStory;
            sendMessagesHelper.sendMessage(SendMessagesHelper.SendMessageParams.of(tL_document, null, null, clientUserId, null, null, null, null, null, null, false, 0, 0, 0, storyItemHolder != null ? storyItemHolder.storyItem : null, null, false));
            BulletinFactory.of(PeerStoriesView.this.storyContainer, resourcesProvider).createSimpleBulletin(R.raw.saved_messages, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryAudioAddToSavedMessagesToast), -1, 2, new BulletinFactory$$ExternalSyntheticLambda0())).show(true);
        }

        public void lambda$onReplyClick$3(TLRPC.Document document, Theme.ResourcesProvider resourcesProvider) {
            TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_account_saveMusic.id = tL_inputDocument;
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.dialogId == UserConfig.getInstance(PeerStoriesView.this.currentAccount).getClientUserId()) {
                MediaController.getInstance().currentSavedMusicList.add(document);
            }
            ConnectionsManager.getInstance(PeerStoriesView.this.currentAccount).sendRequest(tL_account_saveMusic, null);
            BulletinFactory.of(PeerStoriesView.this.storyContainer, resourcesProvider).createSimpleBulletin(R.raw.ic_save_to_music, LocaleController.getString(R.string.StoryAudioAddToProfileToast)).show(true);
        }

        public void lambda$onReplyClick$5(StoryCaptionView.Panel panel, final StoryViewer storyViewer, Theme.ResourcesProvider resourcesProvider, TL_stories.StoryItem storyItem) {
            if (storyItem != null) {
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                if (lastFragment == null) {
                    return;
                }
                storyItem.dialogId = panel.peerId.longValue();
                StoryViewer storyViewerCreateOverlayStoryViewer = lastFragment.createOverlayStoryViewer();
                storyViewerCreateOverlayStoryViewer.open(getContext(), storyItem, (StoryViewer.PlaceProvider) null);
                storyViewerCreateOverlayStoryViewer.setOnCloseListener(new Runnable() {
                    @Override
                    public final void run() {
                        storyViewer.updatePlayingMode();
                    }
                });
                storyViewer.updatePlayingMode();
                return;
            }
            BulletinFactory.of(PeerStoriesView.this.storyContainer, resourcesProvider).createSimpleBulletin(R.raw.story_bomb2, LocaleController.getString(R.string.StoryNotFound)).setTag(3).show(true);
        }

        @Override
        public void onEmojiClick(AnimatedEmojiSpan animatedEmojiSpan) {
            if (animatedEmojiSpan != null) {
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                if (peerStoriesView.delegate == null) {
                    return;
                }
                TLRPC.Document documentFindDocument = animatedEmojiSpan.document;
                if (documentFindDocument == null) {
                    documentFindDocument = AnimatedEmojiDrawable.findDocument(peerStoriesView.currentAccount, animatedEmojiSpan.documentId);
                }
                if (documentFindDocument == null) {
                    return;
                }
                BulletinFactory bulletinFactoryOf = BulletinFactory.of(PeerStoriesView.this.storyContainer, this.val$resourcesProvider);
                final StoryViewer storyViewer = this.val$storyViewer;
                final Theme.ResourcesProvider resourcesProvider = this.val$resourcesProvider;
                Bulletin bulletinCreateContainsEmojiBulletin = bulletinFactoryOf.createContainsEmojiBulletin(documentFindDocument, 2, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$onEmojiClick$6(storyViewer, resourcesProvider, (TLRPC.InputStickerSet) obj);
                    }
                });
                if (bulletinCreateContainsEmojiBulletin == null) {
                    return;
                }
                bulletinCreateContainsEmojiBulletin.tag = 1;
                bulletinCreateContainsEmojiBulletin.show(true);
            }
        }

        public void lambda$onEmojiClick$6(StoryViewer storyViewer, Theme.ResourcesProvider resourcesProvider, TLRPC.InputStickerSet inputStickerSet) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(inputStickerSet);
            EmojiPacksAlert emojiPacksAlert = new EmojiPacksAlert(storyViewer.fragment, getContext(), resourcesProvider, arrayList);
            Delegate delegate = PeerStoriesView.this.delegate;
            if (delegate != null) {
                delegate.showDialog(emojiPacksAlert);
            }
        }
    }

    public void lambda$new$0(View view) {
        StoryCaptionView storyCaptionView = this.storyCaptionView;
        if (storyCaptionView.expanded) {
            if (!storyCaptionView.textSelectionHelper.isInSelectionMode()) {
                this.storyCaptionView.collapse();
                return;
            } else {
                this.storyCaptionView.checkCancelTextSelection();
                return;
            }
        }
        this.checkBlackoutMode = true;
        storyCaptionView.expand();
    }

    public void lambda$new$1(View view) {
        shareStory(true);
    }

    public void lambda$new$2(View view) {
        tryToOpenRepostStory();
    }

    public void lambda$new$4(View view) {
        TL_stories.StoryItem storyItem = this.currentStory.storyItem;
        if (storyItem != null && storyItem.sent_reaction == null) {
            applyMessageToChat(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$3();
                }
            });
        } else {
            likeStory(null);
        }
    }

    public void lambda$new$3() {
        likeStory(null);
    }

    public boolean lambda$new$5(StoryViewer storyViewer, View view) {
        Runnable runnable = this.reactionsTooltipRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.reactionsTooltipRunnable = null;
        }
        SharedConfig.setStoriesReactionsLongPressHintUsed(true);
        HintView2 hintView2 = this.reactionsLongpressTooltip;
        if (hintView2 != null) {
            hintView2.hide();
        }
        checkReactionsLayoutForLike();
        storyViewer.windowView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
        showLikesReaction(true);
        return true;
    }

    public void lambda$new$6(StoryViewer storyViewer, View view) {
        long j = UserConfig.getInstance(this.currentAccount).clientUserId;
        long j2 = this.dialogId;
        if (j == j2) {
            Bundle bundle = new Bundle();
            bundle.putInt("type", 1);
            bundle.putLong("dialog_id", this.dialogId);
            storyViewer.presentFragment(new MediaActivity(bundle, null));
            return;
        }
        if (j2 > 0) {
            storyViewer.presentFragment(ProfileActivity.of(j2));
        } else {
            storyViewer.presentFragment(ChatActivity.of(j2));
        }
    }

    public static void lambda$new$7(StoryViewer storyViewer, View view) {
        if (storyViewer != null) {
            storyViewer.switchToPip();
        }
    }

    public void lambda$new$8(Theme.ResourcesProvider resourcesProvider, StoryViewer storyViewer, Context context, SharedResources sharedResources, View view) {
        this.delegate.setPopupIsVisible(true);
        this.editStoryItem = null;
        boolean[] zArr = {false};
        if (this.isSelf) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().loadBlocklistAtFirst();
            MessagesController.getInstance(this.currentAccount).getStoriesController().loadSendAs();
            MessagesController.getInstance(this.currentAccount).getStoriesController().getDraftsController().load();
        }
        boolean z = this.isSelf || MessagesController.getInstance(this.currentAccount).getStoriesController().canEditStory(this.currentStory.storyItem);
        AnonymousClass8 anonymousClass8 = new AnonymousClass8(getContext(), resourcesProvider, true, resourcesProvider, storyViewer, this.currentStory.isVideo, this.isSelf || ((this.isChannel || isBotsPreview()) && z), z, context, sharedResources, zArr);
        this.popupMenu = anonymousClass8;
        anonymousClass8.show(this.optionsIconView, 0, (-ActionBar.getCurrentActionBarHeight()) + AndroidUtilities.dp(6.0f));
    }

    class AnonymousClass8 extends CustomPopupMenu {
        private boolean edit;
        final boolean val$canEditStory;
        final Context val$context;
        final boolean[] val$popupStillVisible;
        final Theme.ResourcesProvider val$resourcesProvider;
        final SharedResources val$sharedResources;
        final boolean val$speedControl;
        final StoryViewer val$storyViewer;
        final boolean val$userCanEditStory;

        AnonymousClass8(Context context, Theme.ResourcesProvider resourcesProvider, boolean z, Theme.ResourcesProvider resourcesProvider2, StoryViewer storyViewer, boolean z2, boolean z3, boolean z4, Context context2, SharedResources sharedResources, boolean[] zArr) {
            super(context, resourcesProvider, z);
            this.val$resourcesProvider = resourcesProvider2;
            this.val$storyViewer = storyViewer;
            this.val$speedControl = z2;
            this.val$canEditStory = z3;
            this.val$userCanEditStory = z4;
            this.val$context = context2;
            this.val$sharedResources = sharedResources;
            this.val$popupStillVisible = zArr;
        }

        private void addViewStatistics(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, final TL_stories.StoryItem storyItem) {
            final TLRPC.Chat chat;
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            if (!peerStoriesView.isChannel || storyItem == null || (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) || (chat = MessagesController.getInstance(peerStoriesView.currentAccount).getChat(Long.valueOf(-PeerStoriesView.this.dialogId))) == null) {
                return;
            }
            TLRPC.ChatFull chatFull = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getChatFull(chat.id);
            if (chatFull == null) {
                chatFull = MessagesStorage.getInstance(PeerStoriesView.this.currentAccount).loadChatInfo(chat.id, true, new CountDownLatch(1), false, false);
            }
            if (chatFull == null || !chatFull.can_view_stats) {
                return;
            }
            ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_stats, LocaleController.getString(R.string.ViewStatistics), false, this.val$resourcesProvider);
            final StoryViewer storyViewer = this.val$storyViewer;
            actionBarMenuSubItemAddItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$addViewStatistics$0(storyItem, storyViewer, chat, view);
                }
            });
        }

        public void lambda$addViewStatistics$0(TL_stories.StoryItem storyItem, StoryViewer storyViewer, TLRPC.Chat chat, View view) {
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
            storyItem.dialogId = PeerStoriesView.this.dialogId;
            storyItem.messageId = storyItem.id;
            MessageObject messageObject = new MessageObject(PeerStoriesView.this.currentAccount, storyItem);
            messageObject.generateThumbs(false);
            storyViewer.presentFragment(new MessageStatisticActivity(messageObject, chat.id, false) {
                @Override
                public boolean isLightStatusBar() {
                    return false;
                }

                @Override
                public Theme.ResourcesProvider getResourceProvider() {
                    return new DarkThemeResourceProvider();
                }
            });
        }

        private void addSpeedLayout(final ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, boolean z) {
            PeerStoriesView peerStoriesView;
            StoryItemHolder storyItemHolder;
            if (!this.val$speedControl || ((storyItemHolder = (peerStoriesView = PeerStoriesView.this).currentStory) != null && storyItemHolder.uploadingStory != null)) {
                PeerStoriesView.this.speedLayout = null;
                PeerStoriesView.this.speedItem = null;
                return;
            }
            peerStoriesView.speedLayout = new ChooseSpeedLayout(peerStoriesView.getContext(), actionBarPopupWindowLayout.getSwipeBack(), new ChooseSpeedLayout.Callback() {
                @Override
                public void onSpeedSelected(float f, boolean z2, boolean z3) {
                    StoryViewer storyViewer = AnonymousClass8.this.val$storyViewer;
                    if (storyViewer != null) {
                        storyViewer.setSpeed(f);
                    }
                    PeerStoriesView.this.updateSpeedItem(z2);
                    if (!z3 || actionBarPopupWindowLayout.getSwipeBack() == null) {
                        return;
                    }
                    actionBarPopupWindowLayout.getSwipeBack().closeForeground();
                }
            });
            PeerStoriesView.this.speedLayout.update(StoryViewer.currentSpeed, true);
            PeerStoriesView.this.speedItem = new ActionBarMenuSubItem(PeerStoriesView.this.getContext(), false, false, false, this.val$resourcesProvider);
            PeerStoriesView.this.speedItem.setTextAndIcon(LocaleController.getString(R.string.Speed), R.drawable.msg_speed, null);
            PeerStoriesView.this.updateSpeedItem(true);
            PeerStoriesView.this.speedItem.setMinimumWidth(AndroidUtilities.dp(196.0f));
            PeerStoriesView.this.speedItem.setRightIcon(R.drawable.msg_arrowright);
            actionBarPopupWindowLayout.addView(PeerStoriesView.this.speedItem);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) PeerStoriesView.this.speedItem.getLayoutParams();
            if (LocaleController.isRTL) {
                layoutParams.gravity = 5;
            }
            layoutParams.width = -1;
            layoutParams.height = AndroidUtilities.dp(48.0f);
            PeerStoriesView.this.speedItem.setLayoutParams(layoutParams);
            final int iAddViewToSwipeBack = actionBarPopupWindowLayout.addViewToSwipeBack(PeerStoriesView.this.speedLayout.speedSwipeBackLayout);
            PeerStoriesView.this.speedItem.openSwipeBackLayout = new Runnable() {
                @Override
                public final void run() {
                    PeerStoriesView.AnonymousClass8.lambda$addSpeedLayout$1(actionBarPopupWindowLayout, iAddViewToSwipeBack);
                }
            };
            PeerStoriesView.this.speedItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$addSpeedLayout$2(view);
                }
            });
            actionBarPopupWindowLayout.swipeBackGravityRight = true;
            if (z) {
                ActionBarPopupWindow.GapView gapView = new ActionBarPopupWindow.GapView(PeerStoriesView.this.getContext(), this.val$resourcesProvider, Theme.key_actionBarDefaultSubmenuSeparator);
                gapView.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindowLayout.addView((View) gapView, LayoutHelper.createLinear(-1, 8));
            }
        }

        public static void lambda$addSpeedLayout$1(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, int i) {
            if (actionBarPopupWindowLayout.getSwipeBack() != null) {
                actionBarPopupWindowLayout.getSwipeBack().openForeground(i);
            }
        }

        public void lambda$addSpeedLayout$2(View view) {
            PeerStoriesView.this.speedItem.openSwipeBack();
        }

        private void addAlbumsLayout(final ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, boolean z) {
            HashSet hashSet;
            final TL_stories.StoryItem storyItem = PeerStoriesView.this.currentStory.storyItem;
            if (storyItem == null) {
                return;
            }
            if (storyItem.albums != null) {
                hashSet = new HashSet(storyItem.albums);
            } else {
                hashSet = new HashSet();
            }
            final HashSet hashSet2 = hashSet;
            ItemOptions itemOptionsSwipeback = ItemOptions.swipeback(actionBarPopupWindowLayout, this.val$resourcesProvider);
            itemOptionsSwipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new Runnable() {
                @Override
                public final void run() {
                    PeerStoriesView.AnonymousClass8.lambda$addAlbumsLayout$3(actionBarPopupWindowLayout);
                }
            });
            itemOptionsSwipeback.addGap();
            StoriesController.StoriesCollections storyAlbumsList = PeerStoriesView.this.getStoriesController().getStoryAlbumsList(PeerStoriesView.this.dialogId);
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            boolean zCanCreateNewAlbum = peerStoriesView.storiesController.canCreateNewAlbum(peerStoriesView.dialogId);
            final Theme.ResourcesProvider resourcesProvider = this.val$resourcesProvider;
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$addAlbumsLayout$6(resourcesProvider, storyItem);
                }
            };
            final Theme.ResourcesProvider resourcesProvider2 = this.val$resourcesProvider;
            ItemOptions.addAlbumsItemOptions(itemOptionsSwipeback, storyAlbumsList, hashSet2, zCanCreateNewAlbum, runnable, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$addAlbumsLayout$7(hashSet2, storyItem, resourcesProvider2, (StoriesController.StoryAlbum) obj);
                }
            });
            PeerStoriesView.this.albumLayout = itemOptionsSwipeback.getLinearLayout();
            final int iAddViewToSwipeBack = actionBarPopupWindowLayout.addViewToSwipeBack(PeerStoriesView.this.albumLayout);
            PeerStoriesView.this.albumItem = new ActionBarMenuSubItem(PeerStoriesView.this.getContext(), false, false, false, this.val$resourcesProvider);
            PeerStoriesView.this.albumItem.setTextAndIcon(LocaleController.getString(R.string.StoriesAlbumAddToAlbum), R.drawable.menu_album_add, null);
            PeerStoriesView.this.albumItem.openSwipeBackLayout = new Runnable() {
                @Override
                public final void run() {
                    PeerStoriesView.AnonymousClass8.lambda$addAlbumsLayout$8(actionBarPopupWindowLayout, iAddViewToSwipeBack);
                }
            };
            PeerStoriesView.this.albumItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$addAlbumsLayout$9(view);
                }
            });
            actionBarPopupWindowLayout.addView(PeerStoriesView.this.albumItem);
            actionBarPopupWindowLayout.swipeBackGravityRight = true;
            if (z) {
                ActionBarPopupWindow.GapView gapView = new ActionBarPopupWindow.GapView(PeerStoriesView.this.getContext(), this.val$resourcesProvider, Theme.key_actionBarDefaultSubmenuSeparator);
                gapView.setTag(R.id.fit_width_tag, 1);
                actionBarPopupWindowLayout.addView((View) gapView, LayoutHelper.createLinear(-1, 8));
            }
        }

        public static void lambda$addAlbumsLayout$3(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
            if (actionBarPopupWindowLayout.getSwipeBack() != null) {
                actionBarPopupWindowLayout.getSwipeBack().closeForeground();
            }
        }

        public void lambda$addAlbumsLayout$6(final Theme.ResourcesProvider resourcesProvider, final TL_stories.StoryItem storyItem) {
            AlertsCreator.createStoriesAlbumEnterNameForCreate(PeerStoriesView.this.getContext(), null, resourcesProvider, new MessagesStorage.StringCallback() {
                @Override
                public final void run(String str) {
                    this.f$0.lambda$addAlbumsLayout$5(storyItem, resourcesProvider, str);
                }
            });
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        public void lambda$addAlbumsLayout$5(final TL_stories.StoryItem storyItem, final Theme.ResourcesProvider resourcesProvider, String str) {
            PeerStoriesView.this.getStoriesController().createAlbum(PeerStoriesView.this.dialogId, str, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$addAlbumsLayout$4(storyItem, resourcesProvider, (StoriesController.StoryAlbum) obj);
                }
            });
        }

        public void lambda$addAlbumsLayout$4(TL_stories.StoryItem storyItem, Theme.ResourcesProvider resourcesProvider, StoriesController.StoryAlbum storyAlbum) {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            peerStoriesView.storiesController.addStoryToAlbum(peerStoriesView.dialogId, storyAlbum.album_id, storyItem);
            BulletinFactory.of(PeerStoriesView.this.storyContainer, resourcesProvider).createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryAddedToAlbumX, storyAlbum.title))).show();
        }

        public void lambda$addAlbumsLayout$7(HashSet hashSet, TL_stories.StoryItem storyItem, Theme.ResourcesProvider resourcesProvider, StoriesController.StoryAlbum storyAlbum) {
            String string;
            if (hashSet.contains(Integer.valueOf(storyAlbum.album_id))) {
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                peerStoriesView.storiesController.addStoryToAlbum(peerStoriesView.dialogId, storyAlbum.album_id, storyItem);
                string = LocaleController.formatString(R.string.StoryAddedToAlbumX, storyAlbum.title);
            } else {
                PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                peerStoriesView2.storiesController.removeStoryFromAlbum(peerStoriesView2.dialogId, storyAlbum.album_id, storyItem);
                string = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, storyAlbum.title);
            }
            BulletinFactory.of(PeerStoriesView.this.storyContainer, resourcesProvider).createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(string)).show();
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        public static void lambda$addAlbumsLayout$8(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, int i) {
            if (actionBarPopupWindowLayout.getSwipeBack() != null) {
                actionBarPopupWindowLayout.getSwipeBack().openForeground(i);
            }
        }

        public void lambda$addAlbumsLayout$9(View view) {
            PeerStoriesView.this.albumItem.openSwipeBack();
        }

        @Override
        protected void onCreate(org.telegram.ui.ActionBar.ActionBarPopupWindow.ActionBarPopupWindowLayout r29) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.PeerStoriesView.AnonymousClass8.onCreate(org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout):void");
        }

        public void lambda$onCreate$10(View view) {
            StoriesController.UploadingStory uploadingStory = PeerStoriesView.this.currentStory.uploadingStory;
            if (uploadingStory != null) {
                uploadingStory.cancel();
                PeerStoriesView.this.updateStoryItems();
            }
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        public void lambda$onCreate$11(StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, TL_stories.StoryItem storyItem, View view) {
            PeerStoriesView.this.editPrivacy(storyPrivacy, storyItem);
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        public void lambda$onCreate$17(Theme.ResourcesProvider resourcesProvider, Context context, final StoryViewer storyViewer, final SharedResources sharedResources, View view) {
            if (view.getAlpha() < 1.0f) {
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                AndroidUtilities.shakeViewSpring(view, peerStoriesView.shiftDp = -peerStoriesView.shiftDp);
                BulletinFactory.of(PeerStoriesView.this.storyContainer, resourcesProvider).createErrorBulletin("Wait until current upload is complete").show();
                return;
            }
            final Activity activityFindActivity = AndroidUtilities.findActivity(context);
            if (activityFindActivity == null) {
                return;
            }
            this.edit = true;
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
            Runnable runnable = new Runnable() {
                @Override
                public final void run() throws IOException {
                    this.f$0.lambda$onCreate$16(activityFindActivity, storyViewer, sharedResources);
                }
            };
            if (PeerStoriesView.this.delegate.releasePlayer(runnable)) {
                return;
            }
            runnable.run();
        }

        public void lambda$onCreate$16(Activity activity, StoryViewer storyViewer, final SharedResources sharedResources) throws IOException {
            File file;
            StoryViewer.VideoPlayerHolder videoPlayerHolder;
            StoryRecorder storyRecorder = StoryRecorder.getInstance(activity, PeerStoriesView.this.currentAccount);
            VideoPlayerSharedScope videoPlayerSharedScope = PeerStoriesView.this.playerSharedScope;
            long j = (videoPlayerSharedScope == null || (videoPlayerHolder = videoPlayerSharedScope.player) == null) ? 0L : videoPlayerHolder.currentPosition;
            DraftsController draftsController = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getStoriesController().getDraftsController();
            TL_stories.StoryItem storyItem = PeerStoriesView.this.currentStory.storyItem;
            StoryEntry forEdit = draftsController.getForEdit(storyItem.dialogId, storyItem);
            if (forEdit == null || forEdit.isRepostMessage || (file = forEdit.file) == null || !file.exists()) {
                forEdit = StoryEntry.fromStoryItem(PeerStoriesView.this.currentStory.getPath(), PeerStoriesView.this.currentStory.storyItem);
                forEdit.editStoryPeerId = PeerStoriesView.this.dialogId;
            }
            StoryEntry storyEntryCopy = forEdit.copy();
            if (PeerStoriesView.this.isBotsPreview()) {
                storyEntryCopy.botId = PeerStoriesView.this.dialogId;
                storyEntryCopy.editingBotPreview = MessagesController.toInputMedia(PeerStoriesView.this.currentStory.storyItem.media);
                StoriesController.StoriesList storiesList = storyViewer.storiesList;
                if (storiesList instanceof StoriesController.BotPreviewsList) {
                    storyEntryCopy.botLang = ((StoriesController.BotPreviewsList) storiesList).lang_code;
                }
            }
            storyRecorder.openEdit(StoryRecorder.SourceView.fromStoryViewer(storyViewer), storyEntryCopy, j, true);
            storyRecorder.setOnFullyOpenListener(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onCreate$12();
                }
            });
            storyRecorder.setOnPrepareCloseListener(new Utilities.Callback4() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                    this.f$0.lambda$onCreate$15(sharedResources, (Long) obj, (Runnable) obj2, (Boolean) obj3, (Long) obj4);
                }
            });
        }

        public void lambda$onCreate$12() {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            peerStoriesView.editOpened = true;
            peerStoriesView.setActive(false);
        }

        public void lambda$onCreate$15(SharedResources sharedResources, Long l, final Runnable runnable, Boolean bool, Long l2) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            VideoPlayerSharedScope videoPlayerSharedScope = peerStoriesView.playerSharedScope;
            StoryViewer.VideoPlayerHolder videoPlayerHolder = videoPlayerSharedScope.player;
            if (videoPlayerHolder == null) {
                peerStoriesView.delegate.setPopupIsVisible(false);
                PeerStoriesView.this.setActive(true);
                PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                peerStoriesView2.editOpened = false;
                peerStoriesView2.onImageReceiverThumbLoaded = new Runnable() {
                    @Override
                    public final void run() {
                        PeerStoriesView.AnonymousClass8.lambda$onCreate$13(runnable);
                    }
                };
                if (bool.booleanValue()) {
                    PeerStoriesView.this.updatePosition();
                }
                AndroidUtilities.runOnUIThread(runnable, 400L);
                return;
            }
            videoPlayerHolder.firstFrameRendered = false;
            videoPlayerSharedScope.firstFrameRendered = false;
            videoPlayerHolder.setOnReadyListener(new Runnable() {
                @Override
                public final void run() {
                    PeerStoriesView.AnonymousClass8.lambda$onCreate$14(runnable, jCurrentTimeMillis);
                }
            });
            PeerStoriesView.this.delegate.setPopupIsVisible(false);
            if (PeerStoriesView.this.muteIconView != null) {
                PeerStoriesView.this.muteIconView.setAnimation(sharedResources.muteDrawable);
            }
            PeerStoriesView.this.setActive(((PeerStoriesView.this.videoDuration <= 0 || l.longValue() <= PeerStoriesView.this.videoDuration - 1400) ? l : 0L).longValue(), true);
            PeerStoriesView.this.editOpened = false;
            AndroidUtilities.runOnUIThread(runnable, 400L);
            if (bool.booleanValue()) {
                PeerStoriesView.this.updatePosition();
            }
        }

        public static void lambda$onCreate$13(Runnable runnable) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(runnable);
        }

        public static void lambda$onCreate$14(Runnable runnable, long j) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - j)));
        }

        public void lambda$onCreate$27(Context context, final TL_stories.StoryItem storyItem, final StoryViewer storyViewer, final SharedResources sharedResources, View view) {
            File path = PeerStoriesView.this.currentStory.getPath();
            if (path == null || !path.exists()) {
                PeerStoriesView.this.showDownloadAlert();
                return;
            }
            final Activity activityFindActivity = AndroidUtilities.findActivity(context);
            if (activityFindActivity == null) {
                return;
            }
            this.edit = true;
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
            Runnable runnable = new Runnable() {
                @Override
                public final void run() throws IOException {
                    this.f$0.lambda$onCreate$26(activityFindActivity, storyItem, storyViewer, sharedResources);
                }
            };
            if (PeerStoriesView.this.delegate.releasePlayer(runnable)) {
                return;
            }
            runnable.run();
        }

        public void lambda$onCreate$26(Activity activity, final TL_stories.StoryItem storyItem, StoryViewer storyViewer, final SharedResources sharedResources) throws IOException {
            StoryViewer.VideoPlayerHolder videoPlayerHolder;
            StoryRecorder storyRecorder = StoryRecorder.getInstance(activity, PeerStoriesView.this.currentAccount);
            VideoPlayerSharedScope videoPlayerSharedScope = PeerStoriesView.this.playerSharedScope;
            long j = (videoPlayerSharedScope == null || (videoPlayerHolder = videoPlayerSharedScope.player) == null) ? 0L : videoPlayerHolder.currentPosition;
            StoryEntry storyEntryFromStoryItem = StoryEntry.fromStoryItem(PeerStoriesView.this.currentStory.getPath(), PeerStoriesView.this.currentStory.storyItem);
            storyEntryFromStoryItem.editStoryPeerId = PeerStoriesView.this.dialogId;
            storyEntryFromStoryItem.cover = StoryEntry.getCoverTime(PeerStoriesView.this.currentStory.storyItem);
            StoryEntry storyEntryCopy = storyEntryFromStoryItem.copy();
            storyEntryCopy.isEditingCover = true;
            final TL_stories.StoryItem storyItem2 = PeerStoriesView.this.currentStory.storyItem;
            storyEntryCopy.editingCoverDocument = storyItem2.media.document;
            storyEntryCopy.updateDocumentRef = new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$onCreate$21(storyItem2, storyItem, (Utilities.Callback) obj);
                }
            };
            if (PeerStoriesView.this.isBotsPreview()) {
                storyEntryCopy.botId = PeerStoriesView.this.dialogId;
                storyEntryCopy.editingBotPreview = MessagesController.toInputMedia(PeerStoriesView.this.currentStory.storyItem.media);
                StoriesController.StoriesList storiesList = storyViewer.storiesList;
                if (storiesList instanceof StoriesController.BotPreviewsList) {
                    storyEntryCopy.botLang = ((StoriesController.BotPreviewsList) storiesList).lang_code;
                }
            }
            storyRecorder.openEdit(StoryRecorder.SourceView.fromStoryViewer(storyViewer), storyEntryCopy, j, true);
            storyRecorder.setOnFullyOpenListener(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onCreate$22();
                }
            });
            storyRecorder.setOnPrepareCloseListener(new Utilities.Callback4() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                    this.f$0.lambda$onCreate$25(sharedResources, (Long) obj, (Runnable) obj2, (Boolean) obj3, (Long) obj4);
                }
            });
        }

        public void lambda$onCreate$21(final TL_stories.StoryItem storyItem, final TL_stories.StoryItem storyItem2, final Utilities.Callback callback) {
            final StoriesController.BotPreviewsList botPreviewsList;
            if ((storyItem instanceof StoriesController.BotPreview) && (botPreviewsList = ((StoriesController.BotPreview) storyItem).list) != null) {
                botPreviewsList.reload(new Runnable() {
                    @Override
                    public final void run() {
                        PeerStoriesView.AnonymousClass8.lambda$onCreate$18(botPreviewsList, storyItem2, callback);
                    }
                });
                return;
            }
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getInputPeer(storyItem.dialogId);
            tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem.id));
            ConnectionsManager.getInstance(PeerStoriesView.this.currentAccount).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$onCreate$20(storyItem, callback, tLObject, tL_error);
                }
            });
        }

        public static void lambda$onCreate$18(StoriesController.BotPreviewsList botPreviewsList, TL_stories.StoryItem storyItem, Utilities.Callback callback) {
            TL_stories.StoryItem storyItem2;
            TLRPC.MessageMedia messageMedia;
            TLRPC.Document document;
            TLRPC.Document document2;
            for (int i = 0; i < botPreviewsList.messageObjects.size(); i++) {
                MessageObject messageObject = (MessageObject) botPreviewsList.messageObjects.get(i);
                if (messageObject != null && (storyItem2 = messageObject.storyItem) != null && (messageMedia = storyItem2.media) != null && (document = storyItem.media.document) != null && (document2 = messageMedia.document) != null && document2.id == document.id) {
                    callback.run(document2);
                    return;
                }
            }
            callback.run(null);
        }

        public void lambda$onCreate$20(final TL_stories.StoryItem storyItem, final Utilities.Callback callback, final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onCreate$19(tLObject, storyItem, callback);
                }
            });
        }

        public void lambda$onCreate$19(TLObject tLObject, TL_stories.StoryItem storyItem, Utilities.Callback callback) {
            if (tLObject instanceof TL_stories.TL_stories_stories) {
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                MessagesController.getInstance(PeerStoriesView.this.currentAccount).putUsers(tL_stories_stories.users, false);
                MessagesController.getInstance(PeerStoriesView.this.currentAccount).putChats(tL_stories_stories.chats, false);
                for (int i = 0; i < tL_stories_stories.stories.size(); i++) {
                    if (tL_stories_stories.stories.get(i).id == storyItem.id) {
                        callback.run(tL_stories_stories.stories.get(i).media.document);
                        return;
                    }
                }
            }
            callback.run(null);
        }

        public void lambda$onCreate$22() {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            peerStoriesView.editOpened = true;
            peerStoriesView.setActive(false);
        }

        public void lambda$onCreate$25(SharedResources sharedResources, Long l, final Runnable runnable, Boolean bool, Long l2) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            VideoPlayerSharedScope videoPlayerSharedScope = peerStoriesView.playerSharedScope;
            StoryViewer.VideoPlayerHolder videoPlayerHolder = videoPlayerSharedScope.player;
            if (videoPlayerHolder == null) {
                peerStoriesView.delegate.setPopupIsVisible(false);
                PeerStoriesView.this.setActive(true);
                PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                peerStoriesView2.editOpened = false;
                peerStoriesView2.onImageReceiverThumbLoaded = new Runnable() {
                    @Override
                    public final void run() {
                        PeerStoriesView.AnonymousClass8.lambda$onCreate$23(runnable);
                    }
                };
                if (bool.booleanValue()) {
                    PeerStoriesView.this.updatePosition();
                }
                AndroidUtilities.runOnUIThread(runnable, 400L);
                return;
            }
            videoPlayerHolder.firstFrameRendered = false;
            videoPlayerSharedScope.firstFrameRendered = false;
            videoPlayerHolder.setOnReadyListener(new Runnable() {
                @Override
                public final void run() {
                    PeerStoriesView.AnonymousClass8.lambda$onCreate$24(runnable, jCurrentTimeMillis);
                }
            });
            PeerStoriesView.this.delegate.setPopupIsVisible(false);
            if (PeerStoriesView.this.muteIconView != null) {
                PeerStoriesView.this.muteIconView.setAnimation(sharedResources.muteDrawable);
            }
            PeerStoriesView.this.setActive(((PeerStoriesView.this.videoDuration <= 0 || l.longValue() <= PeerStoriesView.this.videoDuration - 1400) ? l : 0L).longValue(), true);
            PeerStoriesView.this.editOpened = false;
            AndroidUtilities.runOnUIThread(runnable, 400L);
            if (bool.booleanValue()) {
                PeerStoriesView.this.updatePosition();
            }
        }

        public static void lambda$onCreate$23(Runnable runnable) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(runnable);
        }

        public static void lambda$onCreate$24(Runnable runnable, long j) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - j)));
        }

        public void lambda$onCreate$29(final TL_stories.StoryItem storyItem, final boolean z, final Theme.ResourcesProvider resourcesProvider, View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(storyItem);
            MessagesController.getInstance(PeerStoriesView.this.currentAccount).getStoriesController().updateStoriesPinned(PeerStoriesView.this.dialogId, arrayList, z, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$onCreate$28(storyItem, z, resourcesProvider, (Boolean) obj);
                }
            });
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        public void lambda$onCreate$28(TL_stories.StoryItem storyItem, boolean z, Theme.ResourcesProvider resourcesProvider, Boolean bool) {
            if (bool.booleanValue()) {
                storyItem.pinned = z;
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                if (peerStoriesView.isSelf) {
                    BulletinFactory.of(peerStoriesView.storyContainer, resourcesProvider).createSimpleBulletin(z ? R.raw.contact_check : R.raw.chats_archived, LocaleController.getString(z ? R.string.StoryPinnedToProfile : R.string.StoryArchivedFromProfile)).show();
                    return;
                } else if (z) {
                    BulletinFactory.of(peerStoriesView.storyContainer, resourcesProvider).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.StoryPinnedToPosts), LocaleController.getString(R.string.StoryPinnedToPostsDescription)).show();
                    return;
                } else {
                    BulletinFactory.of(peerStoriesView.storyContainer, resourcesProvider).createSimpleBulletin(R.raw.chats_archived, LocaleController.getString(R.string.StoryUnpinnedFromPosts)).show();
                    return;
                }
            }
            BulletinFactory.of(PeerStoriesView.this.storyContainer, resourcesProvider).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.UnknownError)).show();
        }

        public void lambda$onCreate$30(View view) {
            PeerStoriesView.this.saveToGallery();
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        public void lambda$onCreate$31(View view) {
            AndroidUtilities.addToClipboard(PeerStoriesView.this.currentStory.createLink());
            PeerStoriesView.this.onLinkCopied();
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        public void lambda$onCreate$32(View view) {
            PeerStoriesView.this.shareStory(false);
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        public void lambda$onCreate$33(boolean z, View view) {
            LivePlayer livePlayer = LivePlayer.recording;
            if (livePlayer != null) {
                livePlayer.setMuted(!z);
            }
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        public void lambda$onCreate$34(View view) {
            LivePlayer livePlayer = LivePlayer.recording;
            if (livePlayer != null) {
                livePlayer.switchCamera();
            }
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        public void lambda$onCreate$35(StoryViewer storyViewer, View view) {
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
            if (storyViewer != null) {
                storyViewer.switchToPip();
            }
        }

        public void lambda$onCreate$39(Theme.ResourcesProvider resourcesProvider, StoryViewer storyViewer, View view) {
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
            StoryPrivacyBottomSheet storyPrivacyBottomSheetIsEdit = new StoryPrivacyBottomSheet(PeerStoriesView.this.getContext(), 86400, resourcesProvider).setLive(true).setPeer(MessagesController.getInstance(PeerStoriesView.this.currentAccount).getInputPeer(PeerStoriesView.this.dialogId)).setLiveSettings(true).allowCover(false).setCount(1).isEdit(false);
            LivePlayer livePlayer = storyViewer.livePlayer;
            boolean z = livePlayer != null && livePlayer.areMessagesEnabled();
            boolean zAllowScreenshots = PeerStoriesView.this.currentStory.allowScreenshots();
            TL_stories.StoryItem storyItem = PeerStoriesView.this.currentStory.storyItem;
            boolean z2 = storyItem != null && storyItem.pinned;
            LivePlayer livePlayer2 = storyViewer.livePlayer;
            final StoryPrivacyBottomSheet storyPrivacyBottomSheet = storyPrivacyBottomSheetIsEdit.set(z, zAllowScreenshots, z2, livePlayer2 == null ? 0 : (int) livePlayer2.getSendPaidMessagesStars());
            storyPrivacyBottomSheet.whenSelectedRules(new StoryPrivacyBottomSheet.DoneCallback() {
                @Override
                public final void done(StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, boolean z3, boolean z4, boolean z5, boolean z6, TLRPC.InputPeer inputPeer, int i, Runnable runnable, Runnable runnable2) {
                    this.f$0.lambda$onCreate$38(storyPrivacyBottomSheet, storyPrivacy, z3, z4, z5, z6, inputPeer, i, runnable, runnable2);
                }
            }, false);
            storyPrivacyBottomSheet.show();
        }

        public void lambda$onCreate$38(final StoryPrivacyBottomSheet storyPrivacyBottomSheet, StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, boolean z, boolean z2, boolean z3, boolean z4, TLRPC.InputPeer inputPeer, int i, Runnable runnable, Runnable runnable2) {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            TL_stories.StoryItem storyItem = peerStoriesView.currentStory.storyItem;
            if ((storyItem != null && storyItem.pinned) != z3) {
                MessagesController.getInstance(peerStoriesView.currentAccount).getStoriesController().updateStoriesPinned(PeerStoriesView.this.dialogId, PeerStoriesView.this.storyItems, z3, null);
            }
            TL_stories.StoryItem storyItem2 = PeerStoriesView.this.currentStory.storyItem;
            if (storyItem2 != null) {
                TLRPC.MessageMedia messageMedia = storyItem2.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                    TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                    TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                    togglegroupcallsettings.call = inputGroupCall;
                    togglegroupcallsettings.messages_enabled = Boolean.valueOf(z);
                    togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i);
                    ConnectionsManager.getInstance(PeerStoriesView.this.currentAccount).sendRequest(togglegroupcallsettings, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            this.f$0.lambda$onCreate$37(storyPrivacyBottomSheet, tLObject, tL_error);
                        }
                    });
                }
            }
        }

        public void lambda$onCreate$37(final StoryPrivacyBottomSheet storyPrivacyBottomSheet, TLObject tLObject, TLRPC.TL_error tL_error) {
            if (tLObject instanceof TLRPC.Updates) {
                MessagesController.getInstance(PeerStoriesView.this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    storyPrivacyBottomSheet.dismiss();
                }
            });
        }

        public void lambda$onCreate$41(Theme.ResourcesProvider resourcesProvider, final StoryViewer storyViewer, View view) {
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
            new AlertDialog.Builder(PeerStoriesView.this.getContext(), resourcesProvider).setTitle(LocaleController.getString(R.string.LiveStoryEndAlertTitle)).setMessage(LocaleController.getString(R.string.LiveStoryEndAlertText)).setPositiveButton(LocaleController.getString(R.string.LiveStoryEndAlertButton), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    this.f$0.lambda$onCreate$40(storyViewer, alertDialog, i);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).makeRed(-1).show();
        }

        public void lambda$onCreate$40(StoryViewer storyViewer, AlertDialog alertDialog, int i) {
            LivePlayer livePlayer = storyViewer.livePlayer;
            if (livePlayer == null) {
                PeerStoriesView.this.deleteStory();
            } else {
                livePlayer.end();
            }
        }

        public void lambda$onCreate$42(View view) {
            PeerStoriesView.this.deleteStory();
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        public void lambda$onCreate$43(String str, Theme.ResourcesProvider resourcesProvider, TLObject tLObject, String str2, View view) {
            MessagesController.getNotificationsSettings(PeerStoriesView.this.currentAccount).edit().putBoolean("stories_" + str, false).apply();
            NotificationsController.getInstance(PeerStoriesView.this.currentAccount).updateServerNotificationsSettings(PeerStoriesView.this.dialogId, 0L);
            BulletinFactory.of(PeerStoriesView.this.storyContainer, resourcesProvider).createUsersBulletin(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, str2))).setTag(2).show();
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        public void lambda$onCreate$44(String str, Theme.ResourcesProvider resourcesProvider, TLObject tLObject, String str2, View view) {
            MessagesController.getNotificationsSettings(PeerStoriesView.this.currentAccount).edit().putBoolean("stories_" + str, true).apply();
            NotificationsController.getInstance(PeerStoriesView.this.currentAccount).updateServerNotificationsSettings(PeerStoriesView.this.dialogId, 0L);
            BulletinFactory.of(PeerStoriesView.this.storyContainer, resourcesProvider).createUsersBulletin(Arrays.asList(tLObject), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, str2))).setTag(2).show();
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        public void lambda$onCreate$45(View view) {
            MediaDataController.getInstance(PeerStoriesView.this.currentAccount).removePeer(PeerStoriesView.this.dialogId);
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            peerStoriesView.storiesController.toggleHidden(peerStoriesView.dialogId, true, false, true);
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        public void lambda$onCreate$46(View view) {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            peerStoriesView.toggleArchiveForStory(peerStoriesView.dialogId);
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        public void lambda$onCreate$47(View view) {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            peerStoriesView.toggleArchiveForStory(peerStoriesView.dialogId);
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        public void lambda$onCreate$48(StoryViewer storyViewer, View view) {
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
            if (storyViewer != null) {
                storyViewer.switchToPip();
            }
        }

        public void lambda$onCreate$49(View view) {
            PeerStoriesView.this.saveToGallery();
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        public void lambda$onCreate$51(ActionBarMenuSubItem actionBarMenuSubItem, final StoryViewer storyViewer, View view) {
            actionBarMenuSubItem.performHapticFeedback(3);
            BulletinFactory bulletinFactoryGlobal = BulletinFactory.global();
            if (bulletinFactoryGlobal != null) {
                bulletinFactoryGlobal.createSimpleBulletin(R.raw.ic_save_to_gallery, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SaveStoryToGalleryPremiumHint), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onCreate$50(storyViewer);
                    }
                })).show();
            }
        }

        public void lambda$onCreate$50(StoryViewer storyViewer) {
            PeerStoriesView.this.delegate.showDialog(new PremiumFeatureBottomSheet(storyViewer.fragment, 14, false));
        }

        public void lambda$onCreate$52(View view) {
            AndroidUtilities.addToClipboard(PeerStoriesView.this.currentStory.createLink());
            PeerStoriesView.this.onLinkCopied();
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        public void lambda$onCreate$53(View view) {
            PeerStoriesView.this.shareStory(false);
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        public void lambda$onCreate$54(View view) {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            peerStoriesView.currentStory.storyItem.translated = false;
            StoriesStorage storiesStorage = MessagesController.getInstance(peerStoriesView.currentAccount).getStoriesController().getStoriesStorage();
            TL_stories.StoryItem storyItem = PeerStoriesView.this.currentStory.storyItem;
            storiesStorage.updateStoryItem(storyItem.dialogId, storyItem);
            PeerStoriesView.this.cancelTextSelection();
            PeerStoriesView.this.updatePosition();
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        public void lambda$onCreate$57(View view) {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            peerStoriesView.currentStory.storyItem.translated = true;
            peerStoriesView.cancelTextSelection();
            Delegate delegate = PeerStoriesView.this.delegate;
            if (delegate != null) {
                delegate.setTranslating(true);
            }
            StoriesStorage storiesStorage = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getStoriesController().getStoriesStorage();
            TL_stories.StoryItem storyItem = PeerStoriesView.this.currentStory.storyItem;
            storiesStorage.updateStoryItem(storyItem.dialogId, storyItem);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onCreate$55();
                }
            };
            MessagesController.getInstance(PeerStoriesView.this.currentAccount).getTranslateController().translateStory(PeerStoriesView.this.currentStory.storyItem, new Runnable() {
                @Override
                public final void run() {
                    PeerStoriesView.AnonymousClass8.lambda$onCreate$56(runnable, jCurrentTimeMillis);
                }
            });
            PeerStoriesView.this.updatePosition();
            PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
            peerStoriesView2.checkBlackoutMode = true;
            peerStoriesView2.storyCaptionView.expand(true);
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        public void lambda$onCreate$55() {
            Delegate delegate = PeerStoriesView.this.delegate;
            if (delegate != null) {
                delegate.setTranslating(false);
            }
            PeerStoriesView.this.updatePosition();
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            peerStoriesView.checkBlackoutMode = true;
            peerStoriesView.storyCaptionView.expand(true);
        }

        public static void lambda$onCreate$56(Runnable runnable, long j) {
            AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 500 - (System.currentTimeMillis() - j)));
        }

        public void lambda$onCreate$59(final StoryViewer storyViewer, Theme.ResourcesProvider resourcesProvider, View view) {
            if (storyViewer != null) {
                storyViewer.setOverlayVisible(true);
            }
            int i = PeerStoriesView.this.currentAccount;
            Context context = PeerStoriesView.this.getContext();
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            ReportBottomSheet.openStory(i, context, peerStoriesView.currentStory.storyItem, BulletinFactory.of(peerStoriesView.storyContainer, resourcesProvider), resourcesProvider, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    PeerStoriesView.AnonymousClass8.lambda$onCreate$58(storyViewer, (Boolean) obj);
                }
            });
            CustomPopupMenu customPopupMenu = PeerStoriesView.this.popupMenu;
            if (customPopupMenu != null) {
                customPopupMenu.dismiss();
            }
        }

        public static void lambda$onCreate$58(StoryViewer storyViewer, Boolean bool) {
            if (storyViewer != null) {
                storyViewer.setOverlayVisible(false);
            }
        }

        public void lambda$onCreate$60(StoryContainsEmojiButton storyContainsEmojiButton, View view) {
            Delegate delegate;
            EmojiPacksAlert alert = storyContainsEmojiButton.getAlert();
            if (alert == null || (delegate = PeerStoriesView.this.delegate) == null) {
                return;
            }
            delegate.showDialog(alert);
            PeerStoriesView.this.popupMenu.dismiss();
        }

        @Override
        protected void onDismissed() {
            if (!this.edit && !this.val$popupStillVisible[0]) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onDismissed$61();
                    }
                });
            }
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            peerStoriesView.popupMenu = null;
            peerStoriesView.editStoryItem = null;
        }

        public void lambda$onDismissed$61() {
            PeerStoriesView.this.delegate.setPopupIsVisible(false);
        }
    }

    public void lambda$new$10(android.view.View r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.PeerStoriesView.lambda$new$10(android.view.View):void");
    }

    public void lambda$new$9() {
        this.delegate.setIsHintVisible(false);
    }

    public void lambda$new$11(StoryViewer storyViewer, View view) {
        if (this.currentStory.hasSound()) {
            storyViewer.toggleSilentMode();
            if (storyViewer.soundEnabled()) {
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                return;
            }
            return;
        }
        showNoSoundHint(true);
    }

    public void createStealthModeItem(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        if (isBotsPreview() || this.currentStory.isLive) {
            return;
        }
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, this.resourcesProvider).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$createStealthModeItem$12(view);
                }
            });
            return;
        }
        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(-1, -16777216, 0.5f), PorterDuff.Mode.MULTIPLY));
        CombinedDrawable combinedDrawable = new CombinedDrawable(ContextCompat.getDrawable(getContext(), R.drawable.msg_stealth_locked), drawable) {
            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }
        };
        ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, this.resourcesProvider);
        actionBarMenuSubItemAddItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createStealthModeItem$13(view);
            }
        });
        actionBarMenuSubItemAddItem.setIcon(combinedDrawable);
    }

    public void lambda$createStealthModeItem$12(View view) {
        if (this.stealthModeIsActive) {
            StealthModeAlert.showStealthModeEnabledBulletin();
        } else {
            this.delegate.showDialog(new StealthModeAlert(getContext(), getY() + this.storyContainer.getY(), 0, this.resourcesProvider));
        }
        CustomPopupMenu customPopupMenu = this.popupMenu;
        if (customPopupMenu != null) {
            customPopupMenu.dismiss();
        }
    }

    public void lambda$createStealthModeItem$13(View view) {
        this.delegate.showDialog(new StealthModeAlert(getContext(), getY() + this.storyContainer.getY(), 0, this.resourcesProvider));
        CustomPopupMenu customPopupMenu = this.popupMenu;
        if (customPopupMenu != null) {
            customPopupMenu.dismiss();
        }
    }

    public void createQualityItem(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        final boolean z = MessagesController.getInstance(this.currentAccount).storyQualityFull;
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            ActionBarMenuItem.addItem(actionBarPopupWindowLayout, z ? R.drawable.menu_quality_sd : R.drawable.menu_quality_hd, LocaleController.getString(z ? R.string.StoryQualityDecrease : R.string.StoryQualityIncrease), false, this.resourcesProvider).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$createQualityItem$14(z, view);
                }
            });
            return;
        }
        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.msg_gallery_locked2);
        drawable.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(-1, -16777216, 0.5f), PorterDuff.Mode.MULTIPLY));
        CombinedDrawable combinedDrawable = new CombinedDrawable(ContextCompat.getDrawable(getContext(), R.drawable.menu_quality_hd2), drawable) {
            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }
        };
        combinedDrawable.setIconSize(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        combinedDrawable.setIconOffset(AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(2.0f));
        ActionBarMenuSubItem actionBarMenuSubItemAddItem = ActionBarMenuItem.addItem(actionBarPopupWindowLayout, R.drawable.menu_quality_hd, LocaleController.getString(R.string.StoryQualityIncrease), false, this.resourcesProvider);
        actionBarMenuSubItemAddItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createQualityItem$16(view);
            }
        });
        actionBarMenuSubItemAddItem.setIcon(combinedDrawable);
    }

    public void lambda$createQualityItem$14(boolean z, View view) {
        MessagesController.getInstance(this.currentAccount).setStoryQuality(!z);
        BulletinFactory.of(this.storyContainer, this.resourcesProvider).createSimpleBulletin(R.raw.chats_infotip, LocaleController.getString(!z ? R.string.StoryQualityIncreasedTitle : R.string.StoryQualityDecreasedTitle), LocaleController.getString(!z ? R.string.StoryQualityIncreasedMessage : R.string.StoryQualityDecreasedMessage)).show();
        CustomPopupMenu customPopupMenu = this.popupMenu;
        if (customPopupMenu != null) {
            customPopupMenu.dismiss();
        }
    }

    public void lambda$createQualityItem$16(View view) {
        final BottomSheet bottomSheet = new BottomSheet(getContext(), false, this.resourcesProvider);
        bottomSheet.fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        BackupImageView backupImageView = new BackupImageView(getContext());
        backupImageView.getImageReceiver().setAutoRepeat(1);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(backupImageView, "tg_superplaceholders_android_2", "😎", "150_150");
        linearLayout.addView(backupImageView, LayoutHelper.createLinear(150, 150, 1, 0, 16, 0, 16));
        TextView textView = new TextView(getContext());
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourcesProvider));
        textView.setTextSize(1, 20.0f);
        textView.setText(LocaleController.getString(R.string.StoryQualityPremium));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(getContext());
        textView2.setGravity(17);
        textView2.setTextColor(Theme.getColor(Theme.key_dialogTextGray3, this.resourcesProvider));
        textView2.setTextSize(1, 14.0f);
        textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.StoryQualityPremiumText)));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 32, 9, 32, 19));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), this.resourcesProvider);
        buttonWithCounterView.setText(LocaleController.getString(R.string.StoryQualityIncrease), false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_switch_lock);
        coloredImageSpan.setTopOffset(1);
        spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
        buttonWithCounterView.setSubText(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) LocaleController.getString(R.string.OptionPremiumRequiredTitle)), false);
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 1));
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$createQualityItem$15(bottomSheet, view2);
            }
        });
        bottomSheet.setCustomView(linearLayout);
        this.delegate.showDialog(bottomSheet);
        CustomPopupMenu customPopupMenu = this.popupMenu;
        if (customPopupMenu != null) {
            customPopupMenu.dismiss();
        }
    }

    public void lambda$createQualityItem$15(BottomSheet bottomSheet, View view) {
        this.delegate.showDialog(new PremiumFeatureBottomSheet(this.storyViewer.fragment, 14, false));
        bottomSheet.dismiss();
    }

    public void showLikesReaction(final boolean z) {
        if (this.likesReactionShowing == z || this.currentStory.storyItem == null) {
            return;
        }
        this.likesReactionShowing = z;
        if (z) {
            this.likesReactionLayout.setVisibility(0);
        }
        this.likesReactionLayout.setStoryItem(this.currentStory.storyItem);
        this.delegate.setIsLikesReaction(z);
        if (z) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.likesReactionShowProgress, z ? 1.0f : 0.0f);
            this.likesReactionLayout.setTransitionProgress(this.likesReactionShowProgress);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$showLikesReaction$17(valueAnimator);
                }
            });
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (z) {
                        return;
                    }
                    PeerStoriesView.this.likesReactionLayout.setVisibility(8);
                    PeerStoriesView.this.likesReactionLayout.reset();
                }
            });
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            valueAnimatorOfFloat.start();
            return;
        }
        if (this.likesReactionLayout.getReactionsWindow() != null) {
            this.likesReactionLayout.getReactionsWindow().dismissWithAlpha();
        }
        this.likesReactionLayout.animate().alpha(0.0f).setDuration(150L).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PeerStoriesView.this.likesReactionShowProgress = 0.0f;
                PeerStoriesView.this.likesReactionLayout.setAlpha(1.0f);
                PeerStoriesView.this.likesReactionLayout.setVisibility(8);
                PeerStoriesView.this.likesReactionLayout.reset();
            }
        }).start();
    }

    public void lambda$showLikesReaction$17(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.likesReactionShowProgress = fFloatValue;
        this.likesReactionLayout.setTransitionProgress(fFloatValue);
    }

    public void likeStory(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
        boolean z;
        TLRPC.Reaction reaction;
        TL_stories.StoryItem storyItem = this.currentStory.storyItem;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        boolean z2 = reaction2 != null;
        if (reaction2 != null && visibleReaction == null) {
            animateLikeButton();
            this.storiesController.setStoryReaction(this.dialogId, this.currentStory.storyItem, null);
        } else if (visibleReaction == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.currentAccount).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.drawAnimatedEmojiAsMovingReaction = false;
                this.reactionEffectImageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), ReactionsEffectOverlay.getFilterForAroundAnimation(), null, null, null, 0);
                if (this.reactionEffectImageReceiver.getLottieAnimation() != null) {
                    this.reactionEffectImageReceiver.getLottieAnimation().setCurrentFrame(0, false, true);
                }
                this.drawReactionEffect = true;
                this.storiesController.setStoryReaction(this.dialogId, this.currentStory.storyItem, ReactionsLayoutInBubble.VisibleReaction.fromEmojicon(tL_availableReaction));
            }
        } else {
            animateLikeButton();
            this.storiesController.setStoryReaction(this.dialogId, this.currentStory.storyItem, visibleReaction);
        }
        TL_stories.StoryItem storyItem2 = this.currentStory.storyItem;
        if (storyItem2 == null || (reaction = storyItem2.sent_reaction) == null) {
            this.storiesLikeButton.setReaction(null);
            z = false;
        } else {
            z2 = !z2;
            this.storiesLikeButton.setReaction(ReactionsLayoutInBubble.VisibleReaction.fromTL(reaction));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z = true;
        }
        if (this.isChannel && z2) {
            TL_stories.StoryItem storyItem3 = this.currentStory.storyItem;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = this.currentStory.storyItem.views;
            int i = storyViews.reactions_count + (z ? 1 : -1);
            storyViews.reactions_count = i;
            if (i < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = this.currentStory.storyItem;
        ReactionsUtils.applyForStoryViews(reaction2, storyItem4.sent_reaction, storyItem4.views);
        updateUserViews(true);
    }

    private void animateLikeButton() {
        final StoriesLikeButton storiesLikeButton = this.storiesLikeButton;
        storiesLikeButton.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                AndroidUtilities.removeFromParent(storiesLikeButton);
            }
        }).setDuration(150L).start();
        int iDp = AndroidUtilities.dp(8.0f);
        StoriesLikeButton storiesLikeButton2 = new StoriesLikeButton(getContext(), this.sharedResources);
        this.storiesLikeButton = storiesLikeButton2;
        storiesLikeButton2.setPadding(iDp, iDp, iDp, iDp);
        this.storiesLikeButton.setAlpha(0.0f);
        this.storiesLikeButton.setScaleX(0.8f);
        this.storiesLikeButton.setScaleY(0.8f);
        this.storiesLikeButton.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.likeButtonContainer.addView(this.storiesLikeButton, LayoutHelper.createFrame(40, 40, 3));
        this.drawReactionEffect = false;
    }

    public ArrayList getAnimatedEmojiSets(StoryItemHolder storyItemHolder) {
        StoryEntry storyEntry;
        AnimatedEmojiSpan[] animatedEmojiSpanArr;
        TL_stories.MediaArea mediaArea;
        TLRPC.InputStickerSet inputStickerSet;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.InputStickerSet inputStickerSet2;
        if (storyItemHolder == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        TL_stories.StoryItem storyItem = storyItemHolder.storyItem;
        int i = 0;
        if (storyItem != null && storyItem.media_areas != null) {
            for (int i2 = 0; i2 < storyItemHolder.storyItem.media_areas.size(); i2++) {
                TL_stories.MediaArea mediaArea2 = storyItemHolder.storyItem.media_areas.get(i2);
                if (mediaArea2 instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                    TLRPC.Reaction reaction = mediaArea2.reaction;
                    if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                        TLRPC.Document documentFindDocument = AnimatedEmojiDrawable.findDocument(this.currentAccount, ((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
                        if (documentFindDocument != null && (inputStickerSet2 = MessageObject.getInputStickerSet(documentFindDocument)) != null && !hashSet.contains(Long.valueOf(inputStickerSet2.id))) {
                            hashSet.add(Long.valueOf(inputStickerSet2.id));
                            arrayList2.add(inputStickerSet2);
                        }
                    }
                }
            }
        }
        TL_stories.StoryItem storyItem2 = storyItemHolder.storyItem;
        if (storyItem2 != null && (arrayList = storyItem2.entities) != null && !arrayList.isEmpty()) {
            while (i < storyItemHolder.storyItem.entities.size()) {
                TLRPC.MessageEntity messageEntity = storyItemHolder.storyItem.entities.get(i);
                if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                    TLRPC.Document documentFindDocument2 = tL_messageEntityCustomEmoji.document;
                    if (documentFindDocument2 == null) {
                        documentFindDocument2 = AnimatedEmojiDrawable.findDocument(this.currentAccount, tL_messageEntityCustomEmoji.document_id);
                    }
                    if (documentFindDocument2 != null) {
                        TLRPC.InputStickerSet inputStickerSet3 = MessageObject.getInputStickerSet(documentFindDocument2);
                        if (!hashSet.contains(Long.valueOf(inputStickerSet3.id))) {
                            hashSet.add(Long.valueOf(inputStickerSet3.id));
                            arrayList2.add(inputStickerSet3);
                        }
                    }
                }
                i++;
            }
        } else {
            StoriesController.UploadingStory uploadingStory = storyItemHolder.uploadingStory;
            if (uploadingStory != null && (storyEntry = uploadingStory.entry) != null) {
                if (storyEntry.mediaEntities != null) {
                    for (int i3 = 0; i3 < storyItemHolder.uploadingStory.entry.mediaEntities.size(); i3++) {
                        VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) storyItemHolder.uploadingStory.entry.mediaEntities.get(i3);
                        if (mediaEntity.type == 4 && (mediaArea = mediaEntity.mediaArea) != null) {
                            TLRPC.Reaction reaction2 = mediaArea.reaction;
                            if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                TLRPC.Document documentFindDocument3 = AnimatedEmojiDrawable.findDocument(this.currentAccount, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id);
                                if (documentFindDocument3 != null && (inputStickerSet = MessageObject.getInputStickerSet(documentFindDocument3)) != null && !hashSet.contains(Long.valueOf(inputStickerSet.id))) {
                                    hashSet.add(Long.valueOf(inputStickerSet.id));
                                    arrayList2.add(inputStickerSet);
                                }
                            }
                        }
                    }
                }
                CharSequence charSequence = storyItemHolder.uploadingStory.entry.caption;
                if (!(charSequence instanceof Spanned) || (animatedEmojiSpanArr = (AnimatedEmojiSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), AnimatedEmojiSpan.class)) == null) {
                    return arrayList2;
                }
                while (i < animatedEmojiSpanArr.length) {
                    AnimatedEmojiSpan animatedEmojiSpan = animatedEmojiSpanArr[i];
                    TLRPC.Document documentFindDocument4 = animatedEmojiSpan.document;
                    if (documentFindDocument4 == null) {
                        documentFindDocument4 = AnimatedEmojiDrawable.findDocument(this.currentAccount, animatedEmojiSpan.documentId);
                    }
                    if (documentFindDocument4 != null) {
                        TLRPC.InputStickerSet inputStickerSet4 = MessageObject.getInputStickerSet(documentFindDocument4);
                        if (!hashSet.contains(Long.valueOf(inputStickerSet4.id))) {
                            hashSet.add(Long.valueOf(inputStickerSet4.id));
                            arrayList2.add(inputStickerSet4);
                        }
                    }
                    i++;
                }
            }
        }
        return arrayList2;
    }

    public void toggleArchiveForStory(final long j) {
        String str;
        boolean z;
        TLRPC.Chat chat;
        if (j > 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
            str = user.first_name;
            z = user.stories_hidden;
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
            str = chat2.title;
            z = chat2.stories_hidden;
            chat = chat2;
        }
        final TLRPC.Chat chat3 = chat;
        final String str2 = str;
        final boolean z2 = !z;
        final MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$toggleArchiveForStory$20(messagesController, j, z2, str2, chat3);
            }
        }, 200L);
    }

    public void lambda$toggleArchiveForStory$20(final MessagesController messagesController, final long j, final boolean z, String str, TLObject tLObject) {
        messagesController.getStoriesController().toggleHidden(j, z, false, true);
        BulletinFactory.UndoObject undoObject = new BulletinFactory.UndoObject();
        undoObject.onUndo = new Runnable() {
            @Override
            public final void run() {
                PeerStoriesView.lambda$toggleArchiveForStory$18(messagesController, j, z);
            }
        };
        undoObject.onAction = new Runnable() {
            @Override
            public final void run() {
                PeerStoriesView.lambda$toggleArchiveForStory$19(messagesController, j, z);
            }
        };
        BulletinFactory.of(this.topBulletinContainer, this.resourcesProvider).createUsersBulletin(Arrays.asList(tLObject), !z ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToDialogs, ContactsController.formatName(str, null, 10))) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesMovedToContacts, ContactsController.formatName(str, null, 10))), null, undoObject).setTag(2).show(true);
    }

    public static void lambda$toggleArchiveForStory$18(MessagesController messagesController, long j, boolean z) {
        messagesController.getStoriesController().toggleHidden(j, !z, false, true);
    }

    public static void lambda$toggleArchiveForStory$19(MessagesController messagesController, long j, boolean z) {
        messagesController.getStoriesController().toggleHidden(j, z, true, true);
    }

    private void createFailView() {
        if (this.failView != null) {
            return;
        }
        StoryFailView storyFailView = new StoryFailView(getContext(), this.resourcesProvider);
        this.failView = storyFailView;
        storyFailView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createFailView$21(view);
            }
        });
        this.failView.setAlpha(0.0f);
        this.failView.setVisibility(8);
        addView(this.failView, LayoutHelper.createFrame(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void lambda$createFailView$21(View view) {
        StoriesController.UploadingStory uploadingStory;
        StoryItemHolder storyItemHolder = this.currentStory;
        if (storyItemHolder == null || (uploadingStory = storyItemHolder.uploadingStory) == null) {
            return;
        }
        uploadingStory.tryAgain();
        updatePosition();
    }

    private void createPremiumBlockedText() throws Resources.NotFoundException {
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
        this.premiumBlockedText2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(40.0f), 452984831, 855638015));
        this.premiumBlockedText2.setGravity(17);
        ScaleStateListAnimator.apply(this.premiumBlockedText2);
        this.premiumBlockedText2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.premiumBlockedText2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.premiumBlockedText.addView(imageView, LayoutHelper.createLinear(22, 22, 16, 12, 1, 4, 0));
        this.premiumBlockedText.addView(this.premiumBlockedText1, LayoutHelper.createLinear(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.premiumBlockedText.addView(this.premiumBlockedText2, LayoutHelper.createLinear(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.chatActivityEnterView.addView(this.premiumBlockedText, LayoutHelper.createFrame(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }

    private void updatePremiumBlockedText() {
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

    public Activity findActivity() {
        Activity activityFindActivity;
        StoryViewer storyViewer = this.storyViewer;
        if (storyViewer == null || (activityFindActivity = storyViewer.parentActivity) == null) {
            activityFindActivity = AndroidUtilities.findActivity(getContext());
        }
        return activityFindActivity == null ? LaunchActivity.instance : activityFindActivity;
    }

    private BaseFragment fragmentForLimit() {
        return new BaseFragment() {
            @Override
            public boolean isLightStatusBar() {
                return false;
            }

            @Override
            public Activity getParentActivity() {
                return PeerStoriesView.this.findActivity();
            }

            @Override
            public Theme.ResourcesProvider getResourceProvider() {
                return new WrappedResourceProvider(PeerStoriesView.this.resourcesProvider) {
                    @Override
                    public void appendColors() {
                        this.sparseIntArray.append(Theme.key_dialogBackground, -14737633);
                        this.sparseIntArray.append(Theme.key_windowBackgroundGray, -13421773);
                    }
                };
            }

            @Override
            public boolean presentFragment(BaseFragment baseFragment) {
                if (PeerStoriesView.this.storyViewer == null) {
                    return true;
                }
                PeerStoriesView.this.storyViewer.presentFragment(baseFragment);
                return true;
            }

            @Override
            public Dialog showDialog(Dialog dialog) {
                if (PeerStoriesView.this.storyViewer != null) {
                    PeerStoriesView.this.storyViewer.showDialog(dialog);
                } else if (dialog != null) {
                    dialog.show();
                }
                return dialog;
            }
        };
    }

    public void showPremiumBlockedToast() {
        String userName;
        Bulletin bulletinCreateSimpleBulletin;
        if (this.areLiveCommentsDisabled) {
            return;
        }
        if (this.isGroup) {
            if (this.boostsStatus != null && this.canApplyBoost != null) {
                LimitReachedBottomSheet.openBoostsForRemoveRestrictions(fragmentForLimit(), this.boostsStatus, this.canApplyBoost, this.dialogId, true);
                return;
            }
            StoryViewer storyViewer = this.storyViewer;
            if (storyViewer != null) {
                storyViewer.setOverlayVisible(true);
            }
            MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(this.dialogId, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    this.f$0.lambda$showPremiumBlockedToast$23((TL_stories.TL_premium_boostsStatus) obj);
                }
            });
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        int i = -this.shiftDp;
        this.shiftDp = i;
        AndroidUtilities.shakeViewSpring(chatActivityEnterView, i);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (this.dialogId < 0) {
            userName = "";
        } else {
            userName = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId)));
        }
        if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            bulletinCreateSimpleBulletin = BulletinFactory.of(this.storyContainer, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName)));
        } else {
            bulletinCreateSimpleBulletin = BulletinFactory.of(this.storyContainer, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showPremiumBlockedToast$24();
                }
            });
        }
        bulletinCreateSimpleBulletin.show();
    }

    public void lambda$showPremiumBlockedToast$23(final TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus == null) {
            StoryViewer storyViewer = this.storyViewer;
            if (storyViewer != null) {
                storyViewer.setOverlayVisible(false);
                return;
            }
            return;
        }
        this.boostsStatus = tL_premium_boostsStatus;
        MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.dialogId, tL_premium_boostsStatus, new Consumer() {
            @Override
            public final void accept(Object obj) {
                this.f$0.lambda$showPremiumBlockedToast$22(tL_premium_boostsStatus, (ChannelBoostsController.CanApplyBoost) obj);
            }
        });
    }

    public void lambda$showPremiumBlockedToast$22(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        this.canApplyBoost = canApplyBoost;
        LimitReachedBottomSheet.openBoostsForRemoveRestrictions(fragmentForLimit(), tL_premium_boostsStatus, canApplyBoost, this.dialogId, true);
        StoryViewer storyViewer = this.storyViewer;
        if (storyViewer != null) {
            storyViewer.setOverlayVisible(false);
        }
    }

    public void lambda$showPremiumBlockedToast$24() {
        StoryViewer storyViewer = this.storyViewer;
        if (storyViewer != null) {
            storyViewer.presentFragment(new PremiumPreviewFragment("noncontacts"));
        }
    }

    public void updateSpeedItem(boolean z) {
        ActionBarMenuSubItem actionBarMenuSubItem = this.speedItem;
        if (actionBarMenuSubItem == null || this.speedLayout == null || actionBarMenuSubItem.getVisibility() != 0) {
            return;
        }
        if (z) {
            if (Math.abs(StoryViewer.currentSpeed - 0.2f) < 0.05f) {
                this.speedItem.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
            } else if (Math.abs(StoryViewer.currentSpeed - 0.5f) < 0.05f) {
                this.speedItem.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
            } else if (Math.abs(StoryViewer.currentSpeed - 1.0f) < 0.05f) {
                this.speedItem.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
            } else if (Math.abs(StoryViewer.currentSpeed - 1.5f) < 0.05f) {
                this.speedItem.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
            } else if (Math.abs(StoryViewer.currentSpeed - 2.0f) < 0.05f) {
                this.speedItem.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
            } else {
                this.speedItem.setSubtext(LocaleController.formatString(R.string.VideoSpeedCustom, SpeedIconDrawable.formatNumber(StoryViewer.currentSpeed) + "x"));
            }
        }
        this.speedLayout.update(StoryViewer.currentSpeed, z);
    }

    private void createCommentButton() {
        if (this.commentButton != null || getContext() == null) {
            return;
        }
        CommentButton commentButton = new CommentButton(getContext(), this.blurredBackgroundColorProvider);
        this.commentButton = commentButton;
        commentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createCommentButton$25(view);
            }
        });
        addView(this.commentButton, LayoutHelper.createFrame(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public void lambda$createCommentButton$25(View view) {
        this.liveCommentsView.setCollapsed(!r3.isCollapsed(), true);
    }

    private void createPaidReactionsButton() {
        if (this.starsButton != null || getContext() == null) {
            return;
        }
        this.starsButtonEffectsView = new PaidReactionButton.PaidReactionButtonEffectsView(getContext(), this.currentAccount);
        PaidReactionButton paidReactionButton = new PaidReactionButton(getContext(), this.starsButtonEffectsView, this.blurredBackgroundColorProvider);
        this.starsButton = paidReactionButton;
        paidReactionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createPaidReactionsButton$26(view);
            }
        });
        this.starsButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                return this.f$0.lambda$createPaidReactionsButton$27(view);
            }
        });
        addView(this.starsButton, LayoutHelper.createFrame(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        addView(this.starsButtonEffectsView, LayoutHelper.createFrame(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public void lambda$createPaidReactionsButton$26(View view) {
        if (disabledPaidFeatures(false)) {
            this.liveCommentsView.openStarsSheet(disabledPaidFeatures(false));
            return;
        }
        StarsController starsController = StarsController.getInstance(this.currentAccount);
        if (starsController.balanceAvailable() && starsController.balance.amount <= 0) {
            this.liveCommentsView.openStarsSheet(disabledPaidFeatures(false));
        } else {
            this.liveCommentsView.sendStars(1L, true);
        }
    }

    public boolean lambda$createPaidReactionsButton$27(View view) {
        this.liveCommentsView.openStarsSheet(disabledPaidFeatures(false));
        return true;
    }

    private void createMuteButton() {
        if (this.muteButton != null || getContext() == null) {
            return;
        }
        MuteButton muteButton = new MuteButton(getContext(), this.blurredBackgroundColorProvider);
        this.muteButton = muteButton;
        muteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createMuteButton$28(view);
            }
        });
        MuteButton muteButton2 = this.muteButton;
        LivePlayer livePlayer = LivePlayer.recording;
        boolean z = true;
        muteButton2.setMuted(livePlayer != null && livePlayer.isMuted(), false);
        MuteButton muteButton3 = this.muteButton;
        LivePlayer livePlayer2 = LivePlayer.recording;
        if (livePlayer2 != null && !livePlayer2.isConnected()) {
            z = false;
        }
        muteButton3.setConnected(z, false);
        addView(this.muteButton, LayoutHelper.createFrame(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
    }

    public void lambda$createMuteButton$28(View view) {
        LivePlayer livePlayer = LivePlayer.recording;
        if (livePlayer == null) {
            return;
        }
        boolean z = !livePlayer.isMuted();
        LivePlayer.recording.setMuted(z);
        this.muteButton.setMuted(z, true);
    }

    public boolean disabledPaidFeatures(boolean z) {
        StoryViewer storyViewer;
        LivePlayer livePlayer;
        TLRPC.Peer defaultSendAs;
        LivePlayer livePlayer2;
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        long j = this.dialogId;
        if (j >= 0 || (livePlayer2 = this.storyViewer.livePlayer) == null) {
            return j >= 0 && (storyViewer = this.storyViewer) != null && (livePlayer = storyViewer.livePlayer) != null && livePlayer.isAdmin() && (!z || (defaultSendAs = this.storyViewer.livePlayer.getDefaultSendAs()) == null || this.dialogId == DialogObject.getPeerDialogId(defaultSendAs) || DialogObject.getPeerDialogId(defaultSendAs) == clientUserId || this.dialogId == clientUserId);
        }
        if (!z) {
            return false;
        }
        TLRPC.Peer defaultSendAs2 = livePlayer2.getDefaultSendAs();
        return (this.storyViewer.livePlayer.isAdmin() || ChatObject.canManageCalls(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId)))) && (defaultSendAs2 == null || this.dialogId == DialogObject.getPeerDialogId(defaultSendAs2) || DialogObject.getPeerDialogId(defaultSendAs2) == UserConfig.getInstance(this.currentAccount).getClientUserId());
    }

    private void showPaidMessageHint() {
        HintView2 hintView2 = this.highlightMessageHintView;
        if (hintView2 != null) {
            if (hintView2.shown()) {
                return;
            } else {
                removeView(this.highlightMessageHintView);
            }
        }
        if (!disabledPaidFeatures(true) && MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) < 3) {
            MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", MessagesController.getGlobalMainSettings().getInt("taptostoryhighlighthint", 0) + 1).apply();
            final HintView2 hintView22 = new HintView2(getContext(), 3);
            this.highlightMessageHintView = hintView22;
            hintView22.setText(LocaleController.getString(R.string.LiveStoryHighlightHint));
            this.highlightMessageHintView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.highlightMessageHintView.setTextAlign(Layout.Alignment.ALIGN_OPPOSITE);
            this.highlightMessageHintView.setOnHiddenListener(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showPaidMessageHint$29(hintView22);
                }
            });
            addView(this.highlightMessageHintView, LayoutHelper.createFrame(-1, 100, 87));
            this.highlightMessageHintView.show();
            updateViewOffsets();
        }
    }

    public void lambda$showPaidMessageHint$29(HintView2 hintView2) {
        removeView(hintView2);
        if (this.highlightMessageHintView == hintView2) {
            this.highlightMessageHintView = null;
        }
    }

    private void createEnterView() throws Resources.NotFoundException {
        AnonymousClass19 anonymousClass19 = new AnonymousClass19(AndroidUtilities.findActivity(getContext()), this, null, true, new WrappedResourceProvider(this.resourcesProvider) {
            @Override
            public void appendColors() {
                this.sparseIntArray.put(Theme.key_chat_emojiPanelBackground, -1071635414);
            }
        });
        this.chatActivityEnterView = anonymousClass19;
        anonymousClass19.getEditField().useAnimatedTextDrawable();
        this.chatActivityEnterView.getEditField().setScaleX(0.0f);
        this.chatActivityEnterView.setOverrideKeyboardAnimation(true);
        this.chatActivityEnterView.setClipChildren(false);
        this.chatActivityEnterView.setDelegate(new AnonymousClass20());
        setDelegate(this.chatActivityEnterView);
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        chatActivityEnterView.shouldDrawBackground = false;
        chatActivityEnterView.shouldDrawRecordedAudioPanelInParent = true;
        if (this.currentStory.isLive) {
            this.chatActivityEnterView.setAllowStickersAndGifs(true, false, false);
        } else {
            this.chatActivityEnterView.setAllowStickersAndGifs(true, true, true);
        }
        this.chatActivityEnterView.updateColors();
        ChatActivityEnterView chatActivityEnterView2 = this.chatActivityEnterView;
        chatActivityEnterView2.isStories = true;
        addView(chatActivityEnterView2, LayoutHelper.createFrame(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.sendAsPeersObj != null) {
            this.chatActivityEnterView.updateSendAsButton(false);
        }
        this.chatActivityEnterView.recordingGuid = this.classGuid;
        this.playerSharedScope.viewsToInvalidate.add(this.storyContainer);
        this.playerSharedScope.viewsToInvalidate.add(this);
        if (this.attachedToWindow) {
            this.chatActivityEnterView.onResume();
        }
        checkStealthMode(false);
        if (isBotsPreview()) {
            this.chatActivityEnterView.setVisibility(8);
        }
        ChatActivitySideControlsButtonsLayout chatActivitySideControlsButtonsLayout = new ChatActivitySideControlsButtonsLayout(getContext(), this.resourcesProvider, this.blurredBackgroundColorProvider, this.blurredBackgroundDrawableFactory);
        this.sideControlsButtonsLayout = chatActivitySideControlsButtonsLayout;
        chatActivitySideControlsButtonsLayout.setOnClickListener(new ButtonOnClickListener() {
            @Override
            public final void onClick(int i, View view) {
                this.f$0.onSideControlButtonOnClick(i, view);
            }
        });
        addView(this.sideControlsButtonsLayout, LayoutHelper.createFrame(57, 300, 85));
        this.sideControlsButtonsLayout.setVisibility(8);
        this.chatActivityEnterView.setSideButtonsForAttach(this.sideControlsButtonsLayout);
        this.reactionsContainerIndex = getChildCount();
    }

    class AnonymousClass19 extends ChatActivityEnterView {
        private int chatActivityEnterViewAnimateFromTop;
        int lastContentViewHeight;
        private Animator messageEditTextAnimator;
        int messageEditTextPredrawHeigth;
        int messageEditTextPredrawScrollY;

        AnonymousClass19(Activity activity, SizeNotifierFrameLayout sizeNotifierFrameLayout, ChatActivity chatActivity, boolean z, Theme.ResourcesProvider resourcesProvider) {
            super(activity, sizeNotifierFrameLayout, chatActivity, z, resourcesProvider);
        }

        @Override
        public void updateSendAsButton(boolean z) {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            super.updateSendAsButton(peerStoriesView.isPremiumBlocked || peerStoriesView.areLiveCommentsDisabled, z);
        }

        @Override
        public boolean sendMessage() throws Resources.NotFoundException {
            int length;
            if (this.sendButtonContainer.getAlpha() < 0.5f) {
                openKeyboard();
                return false;
            }
            if (PeerStoriesView.this.currentStory.isLive) {
                long jMax = Math.max(PeerStoriesView.this.messageStars, PeerStoriesView.this.getMessageMinPrice());
                TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
                CharSequence textWithEntities2 = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
                if (textWithEntities2.length() <= HighlightMessageSheet.getMaxLength(PeerStoriesView.this.currentAccount)) {
                    if (!PeerStoriesView.this.disabledPaidFeatures(true)) {
                        if (textWithEntities2 instanceof Spannable) {
                            Spannable spannable = (Spannable) textWithEntities2;
                            length = ((AnimatedEmojiSpan[]) spannable.getSpans(0, textWithEntities2.length(), AnimatedEmojiSpan.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, textWithEntities2.length(), Emoji.EmojiSpan.class)).length;
                        } else {
                            length = 0;
                        }
                        int i = (int) jMax;
                        if (length > HighlightMessageSheet.getTierOption(PeerStoriesView.this.currentAccount, i, HighlightMessageSheet.TIER_EMOJIS) || textWithEntities2.length() > HighlightMessageSheet.getTierOption(PeerStoriesView.this.currentAccount, i, HighlightMessageSheet.TIER_LENGTH)) {
                            PeerStoriesView.this.lambda$updatePosition$46();
                            return false;
                        }
                    }
                    PeerStoriesView.this.liveCommentsView.send(textWithEntities, jMax);
                    this.messageEditText.setText("");
                    AndroidUtilities.hideKeyboard(this);
                    PeerStoriesView.this.messageStars = 0L;
                    PeerStoriesView.this.checkStealthMode(true);
                    checkSendButton(true);
                    return true;
                }
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
            return super.sendMessage();
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (!isEnabled()) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth() + (PeerStoriesView.this.premiumBlockedText2 != null ? this.attachLayoutPaddingTranslationX * 1.5f : 0.0f), getHeight());
                boolean zContains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0) {
                    if (zContains && PeerStoriesView.this.premiumBlockedText2 != null) {
                        PeerStoriesView.this.premiumBlockedText2.setPressed(true);
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (PeerStoriesView.this.premiumBlockedText2 != null) {
                        if (zContains && PeerStoriesView.this.premiumBlockedText2.isPressed()) {
                            PeerStoriesView.this.showPremiumBlockedToast();
                        }
                        PeerStoriesView.this.premiumBlockedText2.setPressed(false);
                    }
                } else if (motionEvent.getAction() == 3 && PeerStoriesView.this.premiumBlockedText2 != null) {
                    PeerStoriesView.this.premiumBlockedText2.setPressed(false);
                }
                return PeerStoriesView.this.premiumBlockedText2 != null && PeerStoriesView.this.premiumBlockedText2.isPressed();
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        public void setHorizontalPadding(float f, float f2, float f3, boolean z) {
            if (PeerStoriesView.this.premiumBlockedText != null) {
                PeerStoriesView.this.premiumBlockedText.setTranslationX((1.0f - f3) * f);
            }
            super.setHorizontalPadding(f, f2, f3, z);
        }

        @Override
        protected boolean showConfirmAlert(Runnable runnable) {
            return PeerStoriesView.this.applyMessageToChat(runnable);
        }

        @Override
        public void checkAnimation() {
            int backgroundTop = getBackgroundTop();
            int i = this.chatActivityEnterViewAnimateFromTop;
            if (i != 0 && backgroundTop != i) {
                int i2 = (this.animatedTop + i) - backgroundTop;
                setAnimatedTop(i2);
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                peerStoriesView.forceUpdateOffsets = true;
                if (peerStoriesView.changeBoundAnimator != null) {
                    PeerStoriesView.this.changeBoundAnimator.removeAllListeners();
                    PeerStoriesView.this.changeBoundAnimator.cancel();
                }
                View view = this.topView;
                if (view != null && view.getVisibility() == 0) {
                    this.topView.setTranslationY(this.animatedTop + ((1.0f - getTopViewEnterProgress()) * this.topView.getLayoutParams().height));
                }
                PeerStoriesView.this.invalidate();
                PeerStoriesView.this.changeBoundAnimator = ValueAnimator.ofFloat(i2, 0.0f);
                PeerStoriesView.this.changeBoundAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f$0.lambda$checkAnimation$0(valueAnimator);
                    }
                });
                PeerStoriesView.this.changeBoundAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PeerStoriesView.this.invalidate();
                        AnonymousClass19.this.setAnimatedTop(0);
                        AnonymousClass19 anonymousClass19 = AnonymousClass19.this;
                        PeerStoriesView.this.forceUpdateOffsets = true;
                        if (((ChatActivityEnterView) anonymousClass19).topView != null && ((ChatActivityEnterView) AnonymousClass19.this).topView.getVisibility() == 0) {
                            ((ChatActivityEnterView) AnonymousClass19.this).topView.setTranslationY(((ChatActivityEnterView) AnonymousClass19.this).animatedTop + ((1.0f - AnonymousClass19.this.getTopViewEnterProgress()) * ((ChatActivityEnterView) AnonymousClass19.this).topView.getLayoutParams().height));
                        }
                        PeerStoriesView.this.changeBoundAnimator = null;
                    }
                });
                PeerStoriesView.this.changeBoundAnimator.setDuration(250L);
                PeerStoriesView.this.changeBoundAnimator.setInterpolator(ChatListItemAnimator.DEFAULT_INTERPOLATOR);
                PeerStoriesView.this.changeBoundAnimator.start();
                this.chatActivityEnterViewAnimateFromTop = 0;
            }
            if (this.shouldAnimateEditTextWithBounds) {
                float measuredHeight = (this.messageEditTextPredrawHeigth - this.messageEditText.getMeasuredHeight()) + (this.messageEditTextPredrawScrollY - this.messageEditText.getScrollY());
                EditTextCaption editTextCaption = this.messageEditText;
                editTextCaption.setOffsetY(editTextCaption.getOffsetY() - measuredHeight);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.messageEditText.getOffsetY(), 0.0f);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f$0.lambda$checkAnimation$1(valueAnimator);
                    }
                });
                Animator animator = this.messageEditTextAnimator;
                if (animator != null) {
                    animator.cancel();
                }
                this.messageEditTextAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.setDuration(250L);
                valueAnimatorOfFloat.setInterpolator(ChatListItemAnimator.DEFAULT_INTERPOLATOR);
                valueAnimatorOfFloat.start();
                this.shouldAnimateEditTextWithBounds = false;
                PeerStoriesView.this.updateViewOffsets();
            }
            this.lastContentViewHeight = getMeasuredHeight();
        }

        public void lambda$checkAnimation$0(ValueAnimator valueAnimator) {
            setAnimatedTop((int) ((Float) valueAnimator.getAnimatedValue()).floatValue());
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            peerStoriesView.forceUpdateOffsets = true;
            peerStoriesView.invalidate();
            invalidate();
        }

        public void lambda$checkAnimation$1(ValueAnimator valueAnimator) {
            this.messageEditText.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        @Override
        protected void onLineCountChanged(int i, int i2) {
            if (PeerStoriesView.this.chatActivityEnterView != null) {
                this.shouldAnimateEditTextWithBounds = true;
                this.messageEditTextPredrawHeigth = this.messageEditText.getMeasuredHeight();
                this.messageEditTextPredrawScrollY = this.messageEditText.getScrollY();
                invalidate();
                PeerStoriesView.this.invalidate();
                this.chatActivityEnterViewAnimateFromTop = PeerStoriesView.this.chatActivityEnterView.getBackgroundTop();
            }
        }

        @Override
        protected void updateRecordInterface(int i, boolean z) {
            super.updateRecordInterface(i, z);
            checkRecording();
        }

        @Override
        protected void isRecordingStateChanged() {
            super.isRecordingStateChanged();
            checkRecording();
        }

        private void checkRecording() {
            FrameLayout frameLayout;
            boolean z = PeerStoriesView.this.isRecording;
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            peerStoriesView.isRecording = peerStoriesView.chatActivityEnterView.isRecordingAudioVideo() || PeerStoriesView.this.chatActivityEnterView.seekbarVisible() || ((frameLayout = this.recordedAudioPanel) != null && frameLayout.getVisibility() == 0);
            if (z != PeerStoriesView.this.isRecording) {
                PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                if (peerStoriesView2.isActive) {
                    peerStoriesView2.delegate.setIsRecording(peerStoriesView2.isRecording);
                }
                invalidate();
                PeerStoriesView.this.storyContainer.invalidate();
            }
        }

        @Override
        public void extendActionMode(Menu menu) {
            ChatActivity.fillActionModeMenu(menu, null, false, !PeerStoriesView.this.currentStory.isLive());
        }

        @Override
        protected boolean sendMessageInternal(boolean z, int i, int i2, long j, boolean z2) {
            if (MessagesController.getInstance(PeerStoriesView.this.currentAccount).isFrozen()) {
                AccountFrozenAlert.show(PeerStoriesView.this.currentAccount);
                return false;
            }
            return super.sendMessageInternal(z, i, i2, j, z2);
        }

        @Override
        public int getMessagesCount() {
            if (PeerStoriesView.this.currentStory.isLive) {
                return 1;
            }
            return super.getMessagesCount();
        }

        @Override
        public long getStarsPrice() {
            if (PeerStoriesView.this.currentStory.isLive) {
                return Math.max(PeerStoriesView.this.getMessageMinPrice(), PeerStoriesView.this.messageStars);
            }
            return super.getStarsPrice();
        }

        @Override
        public boolean areLiveCommentsFree() {
            return PeerStoriesView.this.disabledPaidFeatures(true);
        }
    }

    class AnonymousClass20 implements ChatActivityEnterView.ChatActivityEnterViewDelegate {
        @Override
        public void bottomPanelTranslationYChanged(float f) {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$bottomPanelTranslationYChanged(this, f);
        }

        @Override
        public boolean checkCanRemoveRestrictionsByBoosts() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$checkCanRemoveRestrictionsByBoosts(this);
        }

        @Override
        public ChatActivity.ReplyQuote getReplyQuote() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$getReplyQuote(this);
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
        public int measureKeyboardHeight() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$measureKeyboardHeight(this);
        }

        @Override
        public void needSendTyping() {
        }

        @Override
        public void needStartRecordAudio(int i) {
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
        public void onPreAudioVideoRecord() {
        }

        @Override
        public void onSendLongClick() {
        }

        @Override
        public void onStickersTab(boolean z) {
        }

        @Override
        public void onSwitchRecordMode(boolean z) {
        }

        @Override
        public void onTextSelectionChanged(int i, int i2) {
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
        public void onWindowSizeChanged(int i) {
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

        AnonymousClass20() {
        }

        @Override
        public TLRPC.TL_channels_sendAsPeers getSendAsPeers() {
            if (!PeerStoriesView.this.currentStory.isLive) {
                return null;
            }
            if (PeerStoriesView.this.storyViewer == null || PeerStoriesView.this.storyViewer.livePlayer == null || !PeerStoriesView.this.storyViewer.livePlayer.sendAsDisabled()) {
                return PeerStoriesView.this.sendAsPeersObj;
            }
            return null;
        }

        @Override
        public TLRPC.Peer getDefaultSendAs() {
            if (PeerStoriesView.this.storyViewer == null || PeerStoriesView.this.storyViewer.livePlayer == null || PeerStoriesView.this.storyViewer.livePlayer.sendAsDisabled()) {
                return null;
            }
            return PeerStoriesView.this.storyViewer.livePlayer.getDefaultSendAs();
        }

        @Override
        public boolean setDefaultSendAs(long j, long j2) throws Resources.NotFoundException {
            TL_stories.StoryItem storyItem = PeerStoriesView.this.currentStory.storyItem;
            if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
                TL_phone.saveDefaultSendAs savedefaultsendas = new TL_phone.saveDefaultSendAs();
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                savedefaultsendas.call = ((TLRPC.TL_messageMediaVideoStream) peerStoriesView.currentStory.storyItem.media).call;
                savedefaultsendas.send_as = MessagesController.getInstance(peerStoriesView.currentAccount).getInputPeer(j2);
                ConnectionsManager.getInstance(PeerStoriesView.this.currentAccount).sendRequest(savedefaultsendas, null);
                if (PeerStoriesView.this.storyViewer.livePlayer != null) {
                    PeerStoriesView.this.storyViewer.livePlayer.setDefaultSendAs(MessagesController.getInstance(PeerStoriesView.this.currentAccount).getPeer(j2));
                }
                PeerStoriesView.this.checkStealthMode(true);
                PeerStoriesView.this.chatActivityEnterView.updateSendAsButton(true);
                PeerStoriesView.this.chatActivityEnterView.checkSendButton(true);
                PeerStoriesView.this.updatePosition();
            }
            return true;
        }

        @Override
        public int getContentViewHeight() {
            return PeerStoriesView.this.getHeight();
        }

        @Override
        public void onMessageSend(CharSequence charSequence, boolean z, int i, int i2, final long j) {
            if (!PeerStoriesView.this.isRecording) {
                PeerStoriesView.this.afterMessageSend(j <= 0);
            } else {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onMessageSend$0(j);
                    }
                }, 200L);
            }
        }

        public void lambda$onMessageSend$0(long j) {
            PeerStoriesView.this.afterMessageSend(j <= 0);
        }

        @Override
        public void onTextChanged(CharSequence charSequence, boolean z, boolean z2) {
            if (PeerStoriesView.this.mentionContainer == null) {
                PeerStoriesView.this.createMentionsContainer();
            }
            if (PeerStoriesView.this.mentionContainer.getAdapter() != null) {
                PeerStoriesView.this.mentionContainer.setDialogId(PeerStoriesView.this.dialogId);
                if (PeerStoriesView.this.currentStory.isLive) {
                    PeerStoriesView.this.mentionContainer.getAdapter().clear(true);
                } else {
                    PeerStoriesView.this.mentionContainer.getAdapter().setUserOrChat(MessagesController.getInstance(PeerStoriesView.this.currentAccount).getUser(Long.valueOf(PeerStoriesView.this.dialogId)), MessagesController.getInstance(PeerStoriesView.this.currentAccount).getChat(Long.valueOf(-PeerStoriesView.this.dialogId)));
                    PeerStoriesView.this.mentionContainer.getAdapter().lambda$searchUsernameOrHashtag$8(charSequence, PeerStoriesView.this.chatActivityEnterView.getCursorPosition(), null, false, false);
                }
            }
            PeerStoriesView.this.invalidate();
        }

        @Override
        public void didPressAttachButton() {
            PeerStoriesView.this.openAttachMenu();
        }

        @Override
        public void didPressSuggestionButton() {
            PeerStoriesView.this.lambda$updatePosition$46();
        }

        @Override
        public void needStartRecordVideo(int i, boolean z, int i2, int i3, int i4, long j, long j2) {
            PeerStoriesView.this.checkInstantCameraView();
            if (PeerStoriesView.this.instantCameraView != null) {
                if (i == 0) {
                    PeerStoriesView.this.instantCameraView.showCamera(false);
                    return;
                }
                if (i == 1 || i == 3 || i == 4) {
                    PeerStoriesView.this.instantCameraView.send(i, z, i2, 0, i4, j, j2);
                } else if (i == 2 || i == 5) {
                    PeerStoriesView.this.instantCameraView.cancel(i == 2);
                }
            }
        }

        @Override
        public void toggleVideoRecordingPause() {
            if (PeerStoriesView.this.instantCameraView != null) {
                PeerStoriesView.this.instantCameraView.togglePause();
            }
        }

        @Override
        public boolean isVideoRecordingPaused() {
            return PeerStoriesView.this.instantCameraView != null && PeerStoriesView.this.instantCameraView.isPaused();
        }

        @Override
        public void needChangeVideoPreviewState(int i, float f) {
            if (PeerStoriesView.this.instantCameraView != null) {
                PeerStoriesView.this.instantCameraView.changeVideoPreviewState(i, f);
            }
        }

        @Override
        public void needShowMediaBanHint() {
            String firstName;
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            if (peerStoriesView.isGroup) {
                peerStoriesView.showPremiumBlockedToast();
                return;
            }
            if (peerStoriesView.mediaBanTooltip == null) {
                PeerStoriesView.this.mediaBanTooltip = new HintView(PeerStoriesView.this.getContext(), 9, PeerStoriesView.this.resourcesProvider);
                PeerStoriesView.this.mediaBanTooltip.setVisibility(8);
                PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                peerStoriesView2.addView(peerStoriesView2.mediaBanTooltip, LayoutHelper.createFrame(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
            }
            if (PeerStoriesView.this.dialogId >= 0) {
                firstName = UserObject.getFirstName(MessagesController.getInstance(PeerStoriesView.this.currentAccount).getUser(Long.valueOf(PeerStoriesView.this.dialogId)));
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getChat(Long.valueOf(-PeerStoriesView.this.dialogId));
                firstName = chat != null ? chat.title : "";
            }
            PeerStoriesView.this.mediaBanTooltip.setText(AndroidUtilities.replaceTags(LocaleController.formatString(PeerStoriesView.this.chatActivityEnterView.isInVideoMode() ? R.string.VideoMessagesRestrictedByPrivacy : R.string.VoiceMessagesRestrictedByPrivacy, firstName)));
            PeerStoriesView.this.mediaBanTooltip.showForView(PeerStoriesView.this.chatActivityEnterView.getAudioVideoButtonContainer(), true);
        }

        @Override
        public void onStickersExpandedChange() {
            PeerStoriesView.this.requestLayout();
        }

        @Override
        public TL_stories.StoryItem getReplyToStory() {
            return PeerStoriesView.this.currentStory.storyItem;
        }

        @Override
        public boolean onceVoiceAvailable() {
            TLRPC.User user;
            return (PeerStoriesView.this.dialogId < 0 || (user = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getUser(Long.valueOf(PeerStoriesView.this.dialogId))) == null || UserObject.isUserSelf(user) || user.bot) ? false : true;
        }
    }

    public void onSideControlButtonOnClick(int i, View view) {
        if (i == 0) {
            openAttachMenu();
        }
    }

    public void createMentionsContainer() {
        MentionsContainerView mentionsContainerView = new MentionsContainerView(getContext(), this.dialogId, 0L, this.storyViewer.fragment, this.resourcesProvider) {
            @Override
            protected boolean isStories() {
                return true;
            }

            @Override
            public void drawRoundRect(Canvas canvas, Rect rect, float f) {
                PeerStoriesView.this.bitmapShaderTools.setBounds(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(rect);
                rectF.offset(0.0f, 0.0f);
                canvas.drawRoundRect(rectF, f, f, PeerStoriesView.this.bitmapShaderTools.paint);
                canvas.drawRoundRect(rectF, f, f, PeerStoriesView.this.inputBackgroundPaint);
                if (rectF.top < getMeasuredHeight() - 1) {
                    canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, PeerStoriesView.this.resourcesProvider.getPaint("paintDivider"));
                }
            }
        };
        this.mentionContainer = mentionsContainerView;
        mentionsContainerView.withDelegate(new AnonymousClass22());
        addView(this.mentionContainer, LayoutHelper.createFrame(-1, -1, 83));
    }

    class AnonymousClass22 implements MentionsContainerView.Delegate {
        AnonymousClass22() {
        }

        @Override
        public void onStickerSelected(final TLRPC.TL_document tL_document, final String str, final Object obj) {
            AlertsCreator.ensurePaidMessageConfirmation(PeerStoriesView.this.currentAccount, PeerStoriesView.this.dialogId, 1, new Utilities.Callback() {
                @Override
                public final void run(Object obj2) {
                    this.f$0.lambda$onStickerSelected$0(tL_document, str, obj, (Long) obj2);
                }
            });
        }

        public void lambda$onStickerSelected$0(TLRPC.TL_document tL_document, String str, Object obj, Long l) {
            SendMessagesHelper.getInstance(PeerStoriesView.this.currentAccount).sendSticker(tL_document, str, PeerStoriesView.this.dialogId, null, null, PeerStoriesView.this.currentStory.storyItem, null, null, true, 0, 0, false, obj, null, 0, l.longValue(), PeerStoriesView.this.chatActivityEnterView.getSendMonoForumPeerId(), PeerStoriesView.this.chatActivityEnterView.getSendMessageSuggestionParams());
            PeerStoriesView.this.chatActivityEnterView.addStickerToRecent(tL_document);
            PeerStoriesView.this.chatActivityEnterView.setFieldText("");
            PeerStoriesView.this.afterMessageSend(l.longValue() <= 0);
        }

        @Override
        public void replaceText(int i, int i2, CharSequence charSequence, boolean z) {
            PeerStoriesView.this.chatActivityEnterView.replaceWithText(i, i2, charSequence, z);
        }

        @Override
        public Paint.FontMetricsInt getFontMetrics() {
            return PeerStoriesView.this.chatActivityEnterView.getEditField().getPaint().getFontMetricsInt();
        }

        @Override
        public void addEmojiToRecent(String str) {
            PeerStoriesView.this.chatActivityEnterView.addEmojiToRecent(str);
        }

        @Override
        public void sendBotInlineResult(final TLRPC.BotInlineResult botInlineResult, final boolean z, final int i) {
            AlertsCreator.ensurePaidMessageConfirmation(PeerStoriesView.this.currentAccount, PeerStoriesView.this.dialogId, 1, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$sendBotInlineResult$1(botInlineResult, z, i, (Long) obj);
                }
            });
        }

        public void lambda$sendBotInlineResult$1(TLRPC.BotInlineResult botInlineResult, boolean z, int i, Long l) {
            long contextBotId = PeerStoriesView.this.mentionContainer.getAdapter().getContextBotId();
            HashMap map = new HashMap();
            map.put("id", botInlineResult.id);
            map.put("query_id", "" + botInlineResult.query_id);
            map.put("bot", "" + contextBotId);
            map.put("bot_name", PeerStoriesView.this.mentionContainer.getAdapter().getContextBotName());
            SendMessagesHelper.prepareSendingBotContextResult(PeerStoriesView.this.storyViewer.fragment, PeerStoriesView.this.getAccountInstance(), botInlineResult, map, PeerStoriesView.this.dialogId, null, null, PeerStoriesView.this.currentStory.storyItem, null, z, i, 0, null, 0, l.longValue());
            PeerStoriesView.this.chatActivityEnterView.setFieldText("");
            PeerStoriesView.this.afterMessageSend(l.longValue() <= 0);
            MediaDataController.getInstance(PeerStoriesView.this.currentAccount).increaseInlineRating(contextBotId);
        }
    }

    public boolean applyMessageToChat(final Runnable runnable) {
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            AccountFrozenAlert.show(this.currentAccount);
            return true;
        }
        int i = SharedConfig.stealthModeSendMessageConfirm;
        if (i > 0 && this.stealthModeIsActive) {
            int i2 = i - 1;
            SharedConfig.stealthModeSendMessageConfirm = i2;
            SharedConfig.updateStealthModeSendMessageConfirm(i2);
            AlertDialog alertDialog = new AlertDialog(getContext(), 0, this.resourcesProvider);
            alertDialog.setTitle(LocaleController.getString(R.string.StealthModeConfirmTitle));
            alertDialog.setMessage(LocaleController.getString(R.string.StealthModeConfirmMessage));
            alertDialog.setPositiveButton(LocaleController.getString(R.string.Proceed), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog2, int i3) {
                    runnable.run();
                }
            });
            alertDialog.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog2, int i3) {
                    alertDialog2.dismiss();
                }
            });
            alertDialog.show();
        } else {
            runnable.run();
        }
        return true;
    }

    public void saveToGallery() {
        StoryItemHolder storyItemHolder = this.currentStory;
        TL_stories.StoryItem storyItem = storyItemHolder.storyItem;
        if ((storyItem == null && storyItemHolder.uploadingStory == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File path = storyItemHolder.getPath();
        final boolean zIsVideo = this.currentStory.isVideo();
        if (path != null && path.exists()) {
            MediaController.saveFile(path.toString(), getContext(), zIsVideo ? 1 : 0, null, null, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$saveToGallery$32(zIsVideo, (Uri) obj);
                }
            });
            return;
        }
        showDownloadAlert();
    }

    public void lambda$saveToGallery$32(boolean z, Uri uri) {
        BulletinFactory.createSaveToGalleryBulletin(this.storyContainer, z, this.resourcesProvider).show();
    }

    public void showDownloadAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.AppName));
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        builder.setMessage(LocaleController.getString(R.string.PleaseDownload));
        this.delegate.showDialog(builder.create());
    }

    public long getMessageMinPrice() {
        StoryViewer storyViewer;
        if (!this.currentStory.isLive || (storyViewer = this.storyViewer) == null || storyViewer.livePlayer == null || disabledPaidFeatures(true)) {
            return 0L;
        }
        return this.storyViewer.livePlayer.getSendPaidMessagesStars();
    }

    public void openAttachMenu() {
        if (this.chatActivityEnterView == null) {
            return;
        }
        createChatAttachView();
        this.chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
        int i = Build.VERSION.SDK_INT;
        if (i == 21 || i == 22) {
            this.chatActivityEnterView.closeKeyboard();
        }
        this.chatAttachAlert.setMaxSelectedPhotos(-1, true);
        this.chatAttachAlert.setDialogId(this.dialogId);
        this.chatAttachAlert.init();
        this.chatAttachAlert.getCommentView().setText(this.chatActivityEnterView.getFieldText());
        this.delegate.showDialog(this.chatAttachAlert);
    }

    private void createChatAttachView() {
        if (this.chatAttachAlert == null) {
            BaseFragment baseFragment = null;
            boolean z = false;
            ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getContext(), baseFragment, z, false, true, this.resourcesProvider) {
                @Override
                public void onDismissAnimationStart() {
                    if (PeerStoriesView.this.chatAttachAlert != null) {
                        PeerStoriesView.this.chatAttachAlert.setFocusable(false);
                    }
                    ChatActivityEnterView chatActivityEnterView = PeerStoriesView.this.chatActivityEnterView;
                    if (chatActivityEnterView == null || chatActivityEnterView.getEditField() == null) {
                        return;
                    }
                    PeerStoriesView.this.chatActivityEnterView.getEditField().requestFocus();
                }
            };
            this.chatAttachAlert = chatAttachAlert;
            chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() {
                @Override
                public void didSelectBot(TLRPC.User user) {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$didSelectBot(this, user);
                }

                @Override
                public void onWallpaperSelected(Object obj) {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onWallpaperSelected(this, obj);
                }

                @Override
                public void openAvatarsSearch() {
                    ChatAttachAlert.ChatAttachViewDelegate.CC.$default$openAvatarsSearch(this);
                }

                @Override
                public boolean selectItemOnClicking() {
                    return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$selectItemOnClicking(this);
                }

                @Override
                public void didPressedButton(int i, boolean z2, boolean z3, int i2, int i3, long j, boolean z4, boolean z5, long j2) {
                    String str;
                    if (PeerStoriesView.this.storyViewer.isShowing) {
                        PeerStoriesView peerStoriesView = PeerStoriesView.this;
                        TL_stories.StoryItem storyItem = peerStoriesView.currentStory.storyItem;
                        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
                            return;
                        }
                        int i4 = 4;
                        if (i == 8 || i == 7 || (i == 4 && !peerStoriesView.chatAttachAlert.getPhotoLayout().getSelectedPhotos().isEmpty())) {
                            if (i != 8) {
                                PeerStoriesView.this.chatAttachAlert.dismiss(true);
                            }
                            HashMap<Object, Object> selectedPhotos = PeerStoriesView.this.chatAttachAlert.getPhotoLayout().getSelectedPhotos();
                            ArrayList<Object> selectedPhotosOrder = PeerStoriesView.this.chatAttachAlert.getPhotoLayout().getSelectedPhotosOrder();
                            if (selectedPhotos.isEmpty()) {
                                return;
                            }
                            int i5 = 0;
                            int i6 = 0;
                            while (i6 < Math.ceil(selectedPhotos.size() / 10.0f)) {
                                int i7 = i6 * 10;
                                int iMin = Math.min(10, selectedPhotos.size() - i7);
                                ArrayList arrayList = new ArrayList();
                                for (int i8 = 0; i8 < iMin; i8++) {
                                    int i9 = i7 + i8;
                                    if (i9 < selectedPhotosOrder.size()) {
                                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i9));
                                        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                                        boolean z6 = photoEntry.isVideo;
                                        if (!z6 && (str = photoEntry.imagePath) != null) {
                                            sendingMediaInfo.path = str;
                                        } else {
                                            String str2 = photoEntry.path;
                                            if (str2 != null) {
                                                sendingMediaInfo.path = str2;
                                            }
                                        }
                                        sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                                        sendingMediaInfo.coverPath = photoEntry.coverPath;
                                        sendingMediaInfo.isVideo = z6;
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
                                SendMessagesHelper.prepareSendingMedia(PeerStoriesView.this.getAccountInstance(), arrayList, PeerStoriesView.this.dialogId, null, null, storyItem, null, i == i4 || z5, z2, null, z3, i2, i3, 0, i6 == 0 ? ((SendMessagesHelper.SendingMediaInfo) arrayList.get(i5)).updateStickersOrder : false, null, null, 0, 0L, false, 0L, PeerStoriesView.this.chatActivityEnterView.getSendMonoForumPeerId(), PeerStoriesView.this.chatActivityEnterView.getSendMessageSuggestionParams());
                                i6++;
                                selectedPhotos = selectedPhotos;
                                selectedPhotosOrder = selectedPhotosOrder;
                                i5 = 0;
                                i4 = 4;
                            }
                            PeerStoriesView.this.chatActivityEnterView.setFieldText("");
                            PeerStoriesView.this.afterMessageSend(j2 <= 0);
                            return;
                        }
                        if (PeerStoriesView.this.chatAttachAlert != null) {
                            PeerStoriesView.this.chatAttachAlert.dismissWithButtonClick(i);
                        }
                    }
                }

                @Override
                public void onCameraOpened() {
                    PeerStoriesView.this.chatActivityEnterView.closeKeyboard();
                }

                @Override
                public void doOnIdle(Runnable runnable) {
                    NotificationCenter.getInstance(PeerStoriesView.this.currentAccount).doOnIdle(runnable);
                }

                @Override
                public void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z2, int i, int i2, long j, boolean z3, long j2) {
                    PeerStoriesView peerStoriesView = PeerStoriesView.this;
                    TL_stories.StoryItem storyItem = peerStoriesView.currentStory.storyItem;
                    if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
                        return;
                    }
                    SendMessagesHelper.prepareSendingAudioDocuments(peerStoriesView.getAccountInstance(), arrayList, charSequence != null ? charSequence : null, PeerStoriesView.this.dialogId, null, null, storyItem, z2, i, i2, null, null, 0, j, z3, j2);
                    PeerStoriesView.this.afterMessageSend(j2 <= 0);
                }

                @Override
                public boolean needEnterComment() {
                    return PeerStoriesView.this.needEnterText();
                }
            });
            this.chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
            this.chatAttachAlert.setAllowEnterCaption(true);
            this.chatAttachAlert.init();
            this.chatAttachAlert.setDocumentsDelegate(new ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate() {
                @Override
                public void didSelectPhotos(ArrayList arrayList, boolean z2, int i, int i2, long j) {
                    ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate.CC.$default$didSelectPhotos(this, arrayList, z2, i, i2, j);
                }

                @Override
                public void startMusicSelectActivity() {
                    ChatAttachAlertDocumentLayout.DocumentSelectActivityDelegate.CC.$default$startMusicSelectActivity(this);
                }

                @Override
                public void didSelectFiles(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z2, int i, int i2, long j, boolean z3, long j2) {
                    PeerStoriesView peerStoriesView = PeerStoriesView.this;
                    TL_stories.StoryItem storyItem = peerStoriesView.currentStory.storyItem;
                    if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
                        return;
                    }
                    SendMessagesHelper.prepareSendingDocuments(peerStoriesView.getAccountInstance(), (ArrayList<String>) arrayList, (ArrayList<String>) arrayList, (ArrayList<Uri>) null, str, (String) null, PeerStoriesView.this.dialogId, (MessageObject) null, (MessageObject) null, storyItem, (ChatActivity.ReplyQuote) null, (MessageObject) null, z2, i, (InputContentInfoCompat) null, (String) null, 0, 0L, false, j2);
                    PeerStoriesView.this.afterMessageSend(j2 <= 0);
                }

                @Override
                public void startDocumentSelectActivity() {
                    try {
                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                        intent.setType("*/*");
                        PeerStoriesView.this.storyViewer.startActivityForResult(intent, 21);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            });
            this.chatAttachAlert.getCommentView().setText(this.chatActivityEnterView.getFieldText());
        }
    }

    public void tryToOpenRepostStory() {
        if (MessagesController.getInstance(this.currentAccount).storiesEnabled()) {
            File path = this.currentStory.getPath();
            if (path != null && path.exists()) {
                ShareAlert shareAlert = this.shareAlert;
                if (shareAlert != null) {
                    shareAlert.dismiss();
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.openRepostStory();
                    }
                }, 120L);
                return;
            }
            showDownloadAlert();
        }
    }

    public void shareStory(boolean z) {
        StoryItemHolder storyItemHolder = this.currentStory;
        if (storyItemHolder.storyItem == null || this.storyViewer.fragment == null) {
            return;
        }
        String strCreateLink = storyItemHolder.createLink();
        if (z) {
            ShareAlert shareAlert = new ShareAlert(this.storyViewer.fragment.getContext(), null, null, strCreateLink, null, false, strCreateLink, null, false, false, !DISABLE_STORY_REPOSTING && MessagesController.getInstance(this.currentAccount).storiesEnabled() && (!(this.isChannel || UserObject.isService(this.dialogId)) || ChatObject.isPublic(this.isChannel ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId)) : null)), null, new WrappedResourceProvider(this.resourcesProvider) {
                @Override
                public void appendColors() {
                    this.sparseIntArray.put(Theme.key_chat_emojiPanelBackground, ColorUtils.blendARGB(-16777216, -1, 0.2f));
                    this.sparseIntArray.put(Theme.key_chat_messagePanelIcons, ColorUtils.blendARGB(-16777216, -1, 0.5f));
                }
            }) {
                @Override
                public void dismissInternal() {
                    super.dismissInternal();
                    PeerStoriesView.this.shareAlert = null;
                }

                @Override
                protected void onShareStory(View view) {
                    PeerStoriesView.this.tryToOpenRepostStory();
                }

                @Override
                protected void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z2) {
                    if (z2) {
                        super.onSend(longSparseArray, i, tL_forumTopic, z2);
                        BulletinFactory bulletinFactoryOf = BulletinFactory.of(PeerStoriesView.this.storyContainer, this.resourcesProvider);
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
                                PeerStoriesView.this.performHapticFeedback(3);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            };
            this.shareAlert = shareAlert;
            shareAlert.forceDarkThemeForHint = true;
            TL_stories.StoryItem storyItem = this.currentStory.storyItem;
            storyItem.dialogId = this.dialogId;
            shareAlert.setStoryToShare(storyItem);
            this.shareAlert.setDelegate(new ShareAlert.ShareAlertDelegate() {
                @Override
                public void didShare() {
                    ShareAlert.ShareAlertDelegate.CC.$default$didShare(this);
                }

                @Override
                public boolean didCopy() {
                    PeerStoriesView.this.onLinkCopied();
                    return true;
                }
            });
            this.delegate.showDialog(this.shareAlert);
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", strCreateLink);
        LaunchActivity.instance.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
    }

    public void openRepostStory() {
        final Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
        if (activityFindActivity == null) {
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() throws IOException {
                this.f$0.lambda$openRepostStory$38(activityFindActivity);
            }
        };
        if (this.delegate.releasePlayer(runnable)) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable, 80L);
    }

    public void lambda$openRepostStory$38(Activity activity) throws IOException {
        StoryViewer.VideoPlayerHolder videoPlayerHolder;
        final StoryRecorder storyRecorder = StoryRecorder.getInstance(activity, this.currentAccount);
        VideoPlayerSharedScope videoPlayerSharedScope = this.playerSharedScope;
        storyRecorder.openForward(StoryRecorder.SourceView.fromStoryViewer(this.storyViewer), StoryEntry.repostStoryItem(this.currentStory.getPath(), this.currentStory.storyItem), (videoPlayerSharedScope == null || (videoPlayerHolder = videoPlayerSharedScope.player) == null) ? 0L : videoPlayerHolder.currentPosition, true);
        storyRecorder.setOnFullyOpenListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openRepostStory$33();
            }
        });
        storyRecorder.setOnPrepareCloseListener(new Utilities.Callback4() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                this.f$0.lambda$openRepostStory$37(storyRecorder, (Long) obj, (Runnable) obj2, (Boolean) obj3, (Long) obj4);
            }
        });
    }

    public void lambda$openRepostStory$33() {
        this.editOpened = true;
        setActive(false);
    }

    public void lambda$openRepostStory$37(final StoryRecorder storyRecorder, Long l, final Runnable runnable, Boolean bool, final Long l2) {
        DialogStoriesCell dialogStoriesCell;
        INavigationLayout parentLayout;
        if (bool.booleanValue()) {
            BaseFragment baseFragment = this.storyViewer.fragment;
            if (baseFragment == null || (parentLayout = baseFragment.getParentLayout()) == null) {
                dialogStoriesCell = null;
            } else {
                List fragmentStack = parentLayout.getFragmentStack();
                ArrayList arrayList = new ArrayList();
                for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                    BaseFragment baseFragment2 = (BaseFragment) fragmentStack.get(size);
                    if (baseFragment2 instanceof DialogsActivity) {
                        DialogsActivity dialogsActivity = (DialogsActivity) baseFragment2;
                        dialogsActivity.closeSearching();
                        DialogStoriesCell dialogStoriesCell2 = dialogsActivity.dialogStoriesCell;
                        storyCellFindStoryCell = dialogStoriesCell2 != null ? dialogStoriesCell2.findStoryCell(l2.longValue()) : null;
                        for (int i = 0; i < arrayList.size(); i++) {
                            parentLayout.removeFragmentFromStack((BaseFragment) arrayList.get(i));
                        }
                        dialogStoriesCell = dialogStoriesCell2;
                    } else {
                        arrayList.add(baseFragment2);
                    }
                }
                dialogStoriesCell = null;
            }
            BaseFragment baseFragment3 = this.storyViewer.fragment;
            if (baseFragment3 != null) {
                baseFragment3.clearSheets();
            }
            this.storyViewer.instantClose();
            this.editOpened = false;
            if (dialogStoriesCell != null && dialogStoriesCell.scrollTo(l2.longValue())) {
                final DialogStoriesCell.StoryCell storyCell = storyCellFindStoryCell;
                final DialogStoriesCell dialogStoriesCell3 = dialogStoriesCell;
                dialogStoriesCell.afterNextLayout(new Runnable() {
                    @Override
                    public final void run() {
                        PeerStoriesView.lambda$openRepostStory$34(storyCell, dialogStoriesCell3, l2, storyRecorder, runnable);
                    }
                });
                return;
            } else {
                storyRecorder.replaceSourceView(StoryRecorder.SourceView.fromStoryCell(storyCellFindStoryCell));
                AndroidUtilities.runOnUIThread(runnable, 400L);
                return;
            }
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        VideoPlayerSharedScope videoPlayerSharedScope = this.playerSharedScope;
        if (videoPlayerSharedScope != null && videoPlayerSharedScope.player == null) {
            this.delegate.setPopupIsVisible(false);
            setActive(true);
            this.editOpened = false;
            this.onImageReceiverThumbLoaded = new Runnable() {
                @Override
                public final void run() {
                    PeerStoriesView.lambda$openRepostStory$35(runnable);
                }
            };
            if (bool.booleanValue()) {
                updatePosition();
            }
            AndroidUtilities.runOnUIThread(runnable, 400L);
            return;
        }
        StoryViewer.VideoPlayerHolder videoPlayerHolder = videoPlayerSharedScope.player;
        videoPlayerHolder.firstFrameRendered = false;
        videoPlayerSharedScope.firstFrameRendered = false;
        videoPlayerHolder.setOnReadyListener(new Runnable() {
            @Override
            public final void run() {
                PeerStoriesView.lambda$openRepostStory$36(runnable, jCurrentTimeMillis);
            }
        });
        this.delegate.setPopupIsVisible(false);
        RLottieImageView rLottieImageView = this.muteIconView;
        if (rLottieImageView != null) {
            rLottieImageView.setAnimation(this.sharedResources.muteDrawable);
        }
        setActive(((this.videoDuration <= 0 || l.longValue() <= this.videoDuration - 1400) ? l : 0L).longValue(), true);
        this.editOpened = false;
        AndroidUtilities.runOnUIThread(runnable, 400L);
        if (bool.booleanValue()) {
            updatePosition();
        }
    }

    public static void lambda$openRepostStory$34(DialogStoriesCell.StoryCell storyCell, DialogStoriesCell dialogStoriesCell, Long l, StoryRecorder storyRecorder, Runnable runnable) {
        if (storyCell == null) {
            storyCell = dialogStoriesCell.findStoryCell(l.longValue());
        }
        storyRecorder.replaceSourceView(StoryRecorder.SourceView.fromStoryCell(storyCell));
        runnable.run();
    }

    public static void lambda$openRepostStory$35(Runnable runnable) {
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable);
    }

    public static void lambda$openRepostStory$36(Runnable runnable, long j) {
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - j)));
    }

    public void onLinkCopied() {
        if (this.currentStory.storyItem == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.id = this.currentStory.storyItem.id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_exportStoryLink, new RequestDelegate() {
            @Override
            public void run(TLObject tLObject, TLRPC.TL_error tL_error) {
            }
        });
    }

    public void setDay(long j, ArrayList arrayList, int i) throws Resources.NotFoundException {
        this.dialogId = j;
        this.day = arrayList;
        bindInternal(i);
    }

    public void setDialogId(long j, int i) throws Resources.NotFoundException {
        if (this.dialogId != j) {
            this.currentStory.clear();
        }
        this.dialogId = j;
        this.day = null;
        bindInternal(i);
        TL_stories.PeerStories peerStories = this.storyViewer.overrideUserStories;
        if (peerStories != null) {
            this.storiesController.loadSkippedStories(peerStories, true);
        } else {
            this.storiesController.loadSkippedStories(j);
        }
    }

    private void setTitle(boolean z, long j, boolean z2) {
        if (!z && j == this.titleLastDialogId && this.titleLastLive == z2) {
            return;
        }
        this.titleLastDialogId = j;
        this.titleLastLive = z2;
        if (j >= 0) {
            if (this.isSelf && !z2) {
                this.headerView.titleView.setText(LocaleController.getString(R.string.SelfStoryTitle));
                this.headerView.titleView.setRightDrawable((Drawable) null);
                return;
            }
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
            if (user != null && user.verified) {
                Drawable drawableMutate = ContextCompat.getDrawable(getContext(), R.drawable.verified_profile).mutate();
                drawableMutate.setAlpha(255);
                CombinedDrawable combinedDrawable = new CombinedDrawable(drawableMutate, null);
                combinedDrawable.setFullsize(true);
                combinedDrawable.setCustomSize(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                this.headerView.titleView.setRightDrawable(combinedDrawable);
            } else {
                this.headerView.titleView.setRightDrawable((Drawable) null);
            }
            if (user != null) {
                this.headerView.titleView.setText(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), this.headerView.titleView.getPaint().getFontMetricsInt(), false));
                return;
            } else {
                this.headerView.titleView.setText(null);
                return;
            }
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
        this.headerView.titleView.setText(AndroidUtilities.removeDiacritics(chat == null ? "" : chat.title));
        if (chat != null && chat.verified) {
            Drawable drawableMutate2 = ContextCompat.getDrawable(getContext(), R.drawable.verified_profile).mutate();
            drawableMutate2.setAlpha(255);
            CombinedDrawable combinedDrawable2 = new CombinedDrawable(drawableMutate2, null);
            combinedDrawable2.setFullsize(true);
            combinedDrawable2.setCustomSize(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.headerView.titleView.setRightDrawable(combinedDrawable2);
            return;
        }
        this.headerView.titleView.setRightDrawable((Drawable) null);
    }

    private void bindInternal(int i) throws Resources.NotFoundException {
        this.deletedPeer = false;
        this.forceUpdateOffsets = true;
        this.userCanSeeViews = false;
        this.isChannel = false;
        this.isGroup = false;
        long j = this.dialogId;
        if (j >= 0) {
            this.isSelf = j == UserConfig.getInstance(this.currentAccount).getClientUserId();
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
            TL_account.RequirementToContact requirementToContactIsUserContactBlocked = MessagesController.getInstance(this.currentAccount).isUserContactBlocked(this.dialogId);
            this.isPremiumBlocked = !UserConfig.getInstance(this.currentAccount).isPremium() && DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked);
            this.starsPriceBlocked = DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked);
            this.avatarDrawable.setInfo(this.currentAccount, user);
            this.headerView.backupImageView.getImageReceiver().setForUserOrChat(user, this.avatarDrawable);
            setTitle(true, this.dialogId, false);
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
            this.avatarDrawable.setInfo(this.currentAccount, chat);
            this.headerView.backupImageView.getImageReceiver().setForUserOrChat(chat, this.avatarDrawable);
            setTitle(true, this.dialogId, false);
        }
        if (this.isActive && (this.isSelf || this.isChannel)) {
            this.storiesController.pollViewsForSelfStories(this.dialogId, true);
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
        int i2 = 8;
        if (this.isChannel) {
            createSelfPeerView();
            if (this.chatActivityEnterView == null && (this.isGroup || this.currentStory.isLive)) {
                createEnterView();
            }
            if (this.chatActivityEnterView != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
                ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
                if (this.currentStory.isLive || (!isBotsPreview() && this.isGroup && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i2 = 0;
                }
                chatActivityEnterView.setVisibility(i2);
                this.chatActivityEnterView.setLiveComment(this.currentStory.isLive, disabledPaidFeatures(true));
                this.chatActivityEnterView.setSuggestionButtonVisible(this.currentStory.isLive && !disabledPaidFeatures(true) && (this.keyboardVisible || this.chatActivityEnterView.emojiViewVisible), true);
                this.chatActivityEnterView.getEditField().setText(this.storyViewer.getDraft(this.dialogId, this.currentStory.storyItem));
                this.chatActivityEnterView.setDialogId(this.dialogId, this.currentAccount);
                this.chatActivityEnterView.updateRecordButton(chat2, null);
            }
            if (this.reactionsCounter == null) {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable();
                this.reactionsCounter = animatedTextDrawable;
                animatedTextDrawable.setCallback(this.likeButtonContainer);
                this.reactionsCounter.setTextColor(this.resourcesProvider.getColor(Theme.key_windowBackgroundWhiteBlackText));
                this.reactionsCounter.setTextSize(AndroidUtilities.dp(14.0f));
                this.reactionsCounterProgress = new AnimatedFloat(this.likeButtonContainer);
            }
            if (this.repostButtonContainer != null && this.repostCounter == null) {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable();
                this.repostCounter = animatedTextDrawable2;
                animatedTextDrawable2.setCallback(this.repostButtonContainer);
                this.repostCounter.setTextColor(this.resourcesProvider.getColor(Theme.key_windowBackgroundWhiteBlackText));
                this.repostCounter.setTextSize(AndroidUtilities.dp(14.0f));
                this.repostCounterProgress = new AnimatedFloat(this.repostButtonContainer);
            }
            if (i == -1) {
                updateSelectedPosition();
            }
            updatePosition();
            this.count = getStoriesCount();
            this.storyContainer.invalidate();
            invalidate();
        } else if (this.isSelf) {
            createSelfPeerView();
            if (this.currentStory.isLive) {
                this.selfView.setVisibility(8);
                if (this.chatActivityEnterView == null) {
                    createEnterView();
                }
                this.chatActivityEnterView.setVisibility(0);
            } else {
                this.selfView.setVisibility(0);
                ChatActivityEnterView chatActivityEnterView2 = this.chatActivityEnterView;
                if (chatActivityEnterView2 != null) {
                    chatActivityEnterView2.setVisibility(8);
                }
            }
            ChatActivityEnterView chatActivityEnterView3 = this.chatActivityEnterView;
            if (chatActivityEnterView3 != null) {
                chatActivityEnterView3.setLiveComment(this.currentStory.isLive, disabledPaidFeatures(true));
                this.chatActivityEnterView.setSuggestionButtonVisible(this.currentStory.isLive && !disabledPaidFeatures(true) && (this.keyboardVisible || this.chatActivityEnterView.emojiViewVisible), true);
            }
            if (i == -1) {
                ArrayList arrayList = this.day;
                if (arrayList != null) {
                    int iIndexOf = arrayList.indexOf(Integer.valueOf(this.storyViewer.dayStoryId));
                    if (iIndexOf < 0 && !this.day.isEmpty()) {
                        if (this.storyViewer.dayStoryId > ((Integer) this.day.get(0)).intValue()) {
                            iIndexOf = 0;
                        } else {
                            int i3 = this.storyViewer.dayStoryId;
                            ArrayList arrayList2 = this.day;
                            if (i3 < ((Integer) arrayList2.get(arrayList2.size() - 1)).intValue()) {
                                iIndexOf = this.day.size() - 1;
                            }
                        }
                    }
                    this.selectedPosition = Math.max(0, iIndexOf);
                } else if (!this.uploadingStories.isEmpty()) {
                    this.selectedPosition = this.storyItems.size();
                } else {
                    for (int i4 = 0; i4 < this.storyItems.size(); i4++) {
                        if (((TL_stories.StoryItem) this.storyItems.get(i4)).justUploaded || ((TL_stories.StoryItem) this.storyItems.get(i4)).id > this.storiesController.dialogIdToMaxReadId.get(this.dialogId)) {
                            this.selectedPosition = i4;
                            break;
                        }
                    }
                }
            }
            updatePosition();
            this.storyContainer.invalidate();
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
                this.premiumBlockedText.setVisibility(((!this.isPremiumBlocked || this.currentStory.isLive) && !this.areLiveCommentsDisabled) ? 8 : 0);
            }
            StoryFailView storyFailView = this.failView;
            if (storyFailView != null) {
                storyFailView.setVisibility(8);
            }
            if (i == -1) {
                updateSelectedPosition();
            }
            updatePosition();
            ChatActivityEnterView chatActivityEnterView4 = this.chatActivityEnterView;
            if (chatActivityEnterView4 != null) {
                chatActivityEnterView4.setVisibility((isBotsPreview() || UserObject.isService(this.dialogId)) ? 8 : 0);
                this.chatActivityEnterView.setLiveComment(this.currentStory.isLive, disabledPaidFeatures(true));
                this.chatActivityEnterView.setSuggestionButtonVisible(this.currentStory.isLive && !disabledPaidFeatures(true) && (this.keyboardVisible || this.chatActivityEnterView.emojiViewVisible), true);
                this.chatActivityEnterView.getEditField().setText(this.storyViewer.getDraft(this.dialogId, this.currentStory.storyItem));
                this.chatActivityEnterView.setDialogId(this.dialogId, this.currentAccount);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(this.dialogId);
                if (userFull != null) {
                    this.chatActivityEnterView.updateRecordButton(null, userFull);
                } else {
                    MessagesController.getInstance(this.currentAccount).loadFullUser(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId)), this.classGuid, false);
                }
            }
            this.count = getStoriesCount();
            FrameLayout frameLayout = this.selfView;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            this.storyContainer.invalidate();
            invalidate();
        }
        checkStealthMode(false);
    }

    private void createUnsupportedContainer() {
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
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        TextView textView2 = new TextView(getContext());
        ScaleStateListAnimator.apply(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i = Theme.key_featuredStickers_buttonText;
        textView2.setTextColor(Theme.getColor(i, this.resourcesProvider));
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), ColorUtils.setAlphaComponent(Theme.getColor(i, this.resourcesProvider), 30)));
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createUnsupportedContainer$39(view);
            }
        });
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 0.0f, 24.0f, 0.0f, 0.0f));
        frameLayout.addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.storyContainer.addView(frameLayout);
        this.unsupportedContainer = frameLayout;
    }

    public void lambda$createUnsupportedContainer$39(View view) {
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.instance;
            if (launchActivity != null) {
                launchActivity.checkAppUpdate(true, null);
                return;
            }
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            Browser.openUrl(getContext(), BuildVars.HUAWEI_STORE_URL);
        } else {
            Browser.openUrl(getContext(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    public void preloadMainImage(long j) throws Resources.NotFoundException {
        if (this.dialogId == j && this.day == null) {
            return;
        }
        this.dialogId = j;
        updateStoryItems();
        updateSelectedPosition();
        updatePosition(true);
        TL_stories.PeerStories peerStories = this.storyViewer.overrideUserStories;
        if (peerStories != null) {
            this.storiesController.loadSkippedStories(peerStories, true);
        } else {
            this.storiesController.loadSkippedStories(j);
        }
    }

    private void updateSelectedPosition() {
        TL_stories.PeerStories peerStories;
        int size;
        if (this.day != null) {
            ArrayList arrayList = this.uploadingStories;
            if (arrayList == null || arrayList.isEmpty()) {
                size = 0;
            } else {
                size = this.uploadingStories.size();
                for (int i = 0; i < this.uploadingStories.size(); i++) {
                    if (SessionDetails$$ExternalSyntheticBackport0.m(((StoriesController.UploadingStory) this.uploadingStories.get(i)).random_id) == this.storyViewer.dayStoryId) {
                        this.selectedPosition = i;
                        return;
                    }
                }
            }
            int iIndexOf = this.day.indexOf(Integer.valueOf(this.storyViewer.dayStoryId));
            if (iIndexOf < 0 && !this.day.isEmpty()) {
                if (this.storyViewer.dayStoryId > ((Integer) this.day.get(0)).intValue()) {
                    iIndexOf = 0;
                } else {
                    if (this.storyViewer.dayStoryId < ((Integer) this.day.get(r5.size() - 1)).intValue()) {
                        iIndexOf = this.day.size() - 1;
                    }
                }
            }
            this.selectedPosition = size + iIndexOf;
        } else {
            int i2 = this.storyViewer.savedPositions.get(this.dialogId, -1);
            this.selectedPosition = i2;
            if (i2 == -1 && !this.storyViewer.isSingleStory && (peerStories = this.userStories) != null && peerStories.max_read_id > 0) {
                int i3 = 0;
                while (true) {
                    if (i3 >= this.storyItems.size()) {
                        break;
                    }
                    if (((TL_stories.StoryItem) this.storyItems.get(i3)).id > this.userStories.max_read_id) {
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

    public void updateStoryItems() {
        StoriesController.StoriesList storiesList;
        TL_stories.StoryItem storyItem;
        this.storyItems.clear();
        StoryViewer storyViewer = this.storyViewer;
        if (storyViewer.isSingleStory) {
            if (!storyViewer.singleStoryDeleted) {
                this.storyItems.add(storyViewer.singleStory);
            }
        } else {
            int i = 0;
            if (this.day != null && (storiesList = storyViewer.storiesList) != null) {
                if (storiesList instanceof StoriesController.BotPreviewsList) {
                    this.uploadingStories.clear();
                    ArrayList uploadingStories = MessagesController.getInstance(this.currentAccount).getStoriesController().getUploadingStories(this.dialogId);
                    String str = ((StoriesController.BotPreviewsList) this.storyViewer.storiesList).lang_code;
                    if (uploadingStories != null) {
                        while (i < uploadingStories.size()) {
                            StoriesController.UploadingStory uploadingStory = (StoriesController.UploadingStory) uploadingStories.get(i);
                            StoryEntry storyEntry = uploadingStory.entry;
                            if (storyEntry != null && !storyEntry.isEdit && TextUtils.equals(storyEntry.botLang, str)) {
                                this.uploadingStories.add(uploadingStory);
                            }
                            i++;
                        }
                    }
                }
                Iterator it = this.day.iterator();
                while (it.hasNext()) {
                    MessageObject messageObjectFindMessageObject = this.storyViewer.storiesList.findMessageObject(((Integer) it.next()).intValue());
                    if (messageObjectFindMessageObject != null && (storyItem = messageObjectFindMessageObject.storyItem) != null) {
                        this.storyItems.add(storyItem);
                    }
                }
            } else if (storyViewer.storiesList != null) {
                while (i < this.storyViewer.storiesList.messageObjects.size()) {
                    this.storyItems.add(((MessageObject) this.storyViewer.storiesList.messageObjects.get(i)).storyItem);
                    i++;
                }
            } else {
                TL_stories.PeerStories peerStories = storyViewer.overrideUserStories;
                if (peerStories != null && DialogObject.getPeerDialogId(peerStories.peer) == this.dialogId) {
                    this.userStories = this.storyViewer.overrideUserStories;
                } else {
                    TL_stories.PeerStories stories = this.storiesController.getStories(this.dialogId);
                    this.userStories = stories;
                    if (stories == null) {
                        this.userStories = this.storiesController.getStoriesFromFullPeer(this.dialogId);
                    }
                }
                this.totalStoriesCount = 0;
                TL_stories.PeerStories peerStories2 = this.userStories;
                if (peerStories2 != null) {
                    this.totalStoriesCount = peerStories2.stories.size();
                    this.storyItems.addAll(this.userStories.stories);
                }
                this.uploadingStories.clear();
                ArrayList uploadingStories2 = this.storiesController.getUploadingStories(this.dialogId);
                if (uploadingStories2 != null) {
                    this.uploadingStories.addAll(uploadingStories2);
                }
            }
        }
        this.count = getStoriesCount();
    }

    private void createSelfPeerView() {
        if (this.selfView != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext()) {
            @Override
            protected void dispatchDraw(Canvas canvas) {
                int x;
                if (PeerStoriesView.this.selfAvatarsContainer.getVisibility() == 0 && PeerStoriesView.this.selfAvatarsContainer.getLayoutParams().width != (x = (int) (((PeerStoriesView.this.selfStatusView.getX() + PeerStoriesView.this.selfStatusView.getMeasuredWidth()) - PeerStoriesView.this.selfAvatarsContainer.getX()) + AndroidUtilities.dp(10.0f)))) {
                    PeerStoriesView.this.selfAvatarsContainer.getLayoutParams().width = x;
                    PeerStoriesView.this.selfAvatarsContainer.invalidate();
                    PeerStoriesView.this.selfAvatarsContainer.requestLayout();
                }
                super.dispatchDraw(canvas);
            }
        };
        this.selfView = frameLayout;
        frameLayout.setClickable(true);
        addView(this.selfView, LayoutHelper.createFrame(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        View view = new View(getContext()) {
            LoadingDrawable loadingDrawable = new LoadingDrawable();
            AnimatedFloat animatedFloat = new AnimatedFloat(250, CubicBezierInterpolator.DEFAULT);

            @Override
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                this.animatedFloat.setParent(this);
                this.animatedFloat.set(PeerStoriesView.this.showViewsProgress ? 1.0f : 0.0f, false);
                if (this.animatedFloat.get() != 0.0f) {
                    if (this.animatedFloat.get() != 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight(), (int) (this.animatedFloat.get() * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getLayoutParams().width, getMeasuredHeight());
                    this.loadingDrawable.setBounds(rectF);
                    this.loadingDrawable.setRadiiDp(24.0f);
                    this.loadingDrawable.setColors(ColorUtils.setAlphaComponent(-1, 20), ColorUtils.setAlphaComponent(-1, 50), ColorUtils.setAlphaComponent(-1, 50), ColorUtils.setAlphaComponent(-1, 70));
                    this.loadingDrawable.draw(canvas);
                    invalidate();
                    canvas.restore();
                }
            }
        };
        this.selfAvatarsContainer = view;
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$createSelfPeerView$40(view2);
            }
        });
        this.selfView.addView(this.selfAvatarsContainer, LayoutHelper.createFrame(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        HwAvatarsImageView hwAvatarsImageView = new HwAvatarsImageView(getContext(), false);
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
        this.selfAvatarsContainer.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(15.0f), 0, ColorUtils.setAlphaComponent(-1, 120)));
        imageView.setBackground(Theme.createCircleSelectorDrawable(ColorUtils.setAlphaComponent(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
    }

    public void lambda$createSelfPeerView$40(View view) {
        showUserViewsDialog();
    }

    public void deleteStory() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
        builder.setTitle(LocaleController.getString(isBotsPreview() ? R.string.DeleteBotPreviewTitle : R.string.DeleteStoryTitle));
        builder.setMessage(LocaleController.getString(isBotsPreview() ? R.string.DeleteBotPreviewSubtitle : R.string.DeleteStorySubtitle));
        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$deleteStory$41(alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                alertDialog.dismiss();
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        this.delegate.showDialog(alertDialogCreate);
        alertDialogCreate.redPositive();
    }

    public void lambda$deleteStory$41(AlertDialog alertDialog, int i) {
        TL_stories.StoryItem storyItem;
        if (this.currentStory.isLive && (storyItem = this.currentStory.storyItem) != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                LivePlayer livePlayer = LivePlayer.recording;
                if (livePlayer != null && livePlayer.equals(inputGroupCall)) {
                    LivePlayer.recording.destroy();
                    if (LivePlayer.recording != null) {
                        LivePlayer.recording = null;
                        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(LivePlayer.recording.getCallId()));
                    }
                }
            }
        }
        this.currentStory.cancelOrDelete();
        updateStoryItems();
        if (this.isActive && this.count == 0) {
            this.delegate.switchToNextAndRemoveCurrentPeer();
            return;
        }
        int i2 = this.selectedPosition;
        int i3 = this.count;
        if (i2 >= i3) {
            this.selectedPosition = i3 - 1;
        } else if (i2 < 0) {
            this.selectedPosition = 0;
        }
        updatePosition();
        StoryViewer storyViewer = this.storyViewer;
        if (storyViewer != null) {
            storyViewer.checkSelfStoriesView();
        }
    }

    private void showUserViewsDialog() {
        this.storyViewer.openViews();
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.sharedResources.topOverlayGradient.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(72.0f));
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
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
        if (this.movingReaction) {
            float x = this.bottomActionsLinearLayout.getX() + this.likeButtonContainer.getX() + (this.likeButtonContainer.getMeasuredWidth() / 2.0f);
            float y = this.bottomActionsLinearLayout.getY() + this.likeButtonContainer.getY() + (this.likeButtonContainer.getMeasuredHeight() / 2.0f);
            int iDp = AndroidUtilities.dp(24.0f);
            float f = iDp / 2.0f;
            float fLerp = AndroidUtilities.lerp(this.movingReactionFromX, x - f, CubicBezierInterpolator.EASE_OUT.getInterpolation(this.movingReactionProgress));
            float fLerp2 = AndroidUtilities.lerp(this.movingReactionFromY, y - f, this.movingReactionProgress);
            int iLerp = AndroidUtilities.lerp(this.movingReactionFromSize, iDp, this.movingReactionProgress);
            if (this.drawAnimatedEmojiAsMovingReaction) {
                AnimatedEmojiDrawable animatedEmojiDrawable = this.reactionMoveDrawable;
                if (animatedEmojiDrawable != null) {
                    float f2 = iLerp;
                    animatedEmojiDrawable.setBounds((int) fLerp, (int) fLerp2, (int) (fLerp + f2), (int) (fLerp2 + f2));
                    this.reactionMoveDrawable.draw(canvas);
                }
            } else {
                float f3 = iLerp;
                this.reactionMoveImageReceiver.setImageCoords(fLerp, fLerp2, f3, f3);
                this.reactionMoveImageReceiver.draw(canvas);
            }
        }
        if (this.drawReactionEffect) {
            float x2 = this.bottomActionsLinearLayout.getX() + this.likeButtonContainer.getX() + (this.likeButtonContainer.getMeasuredWidth() / 2.0f);
            float y2 = this.bottomActionsLinearLayout.getY() + this.likeButtonContainer.getY() + (this.likeButtonContainer.getMeasuredHeight() / 2.0f);
            int iDp2 = AndroidUtilities.dp(120.0f);
            if (!this.drawAnimatedEmojiAsMovingReaction) {
                float f4 = iDp2;
                float f5 = f4 / 2.0f;
                this.reactionEffectImageReceiver.setImageCoords(x2 - f5, y2 - f5, f4, f4);
                this.reactionEffectImageReceiver.draw(canvas);
                if (this.reactionEffectImageReceiver.getLottieAnimation() != null && this.reactionEffectImageReceiver.getLottieAnimation().isLastFrame()) {
                    this.drawReactionEffect = false;
                }
            } else {
                AnimatedEmojiEffect animatedEmojiEffect = this.emojiReactionEffect;
                if (animatedEmojiEffect != null) {
                    float f6 = iDp2 / 2.0f;
                    animatedEmojiEffect.setBounds((int) (x2 - f6), (int) (y2 - f6), (int) (x2 + f6), (int) (y2 + f6));
                    this.emojiReactionEffect.draw(canvas);
                    if (this.emojiReactionEffect.isDone()) {
                        this.emojiReactionEffect.removeView(this);
                        this.emojiReactionEffect = null;
                        this.drawReactionEffect = false;
                    }
                } else {
                    this.drawReactionEffect = false;
                }
            }
        }
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.drawRecordedPannel(canvas);
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        this.imageReceiver.onAttachedToWindow();
        this.rightPreloadImageReceiver.onAttachedToWindow();
        this.leftPreloadImageReceiver.onAttachedToWindow();
        this.reactionEffectImageReceiver.onAttachedToWindow();
        this.reactionMoveImageReceiver.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.onResume();
        }
        for (int i = 0; i < this.preloadReactionHolders.size(); i++) {
            ((ReactionImageHolder) this.preloadReactionHolders.get(i)).onAttachedToWindow(true);
        }
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
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        this.imageReceiver.onDetachedFromWindow();
        this.rightPreloadImageReceiver.onDetachedFromWindow();
        this.leftPreloadImageReceiver.onDetachedFromWindow();
        this.reactionEffectImageReceiver.onDetachedFromWindow();
        this.reactionMoveImageReceiver.onDetachedFromWindow();
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.onPause();
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
        for (int i = 0; i < this.preloadReactionHolders.size(); i++) {
            ((ReactionImageHolder) this.preloadReactionHolders.get(i)).onAttachedToWindow(false);
        }
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
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) throws Resources.NotFoundException {
        LivePlayer livePlayer;
        if (i != NotificationCenter.storiesUpdated) {
            boolean z = false;
            if (i != NotificationCenter.storiesListUpdated || this.storyViewer.storiesList != objArr[0]) {
                if (i == NotificationCenter.storyQualityUpdate) {
                    updatePosition();
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
                    if (storyLimitCheckStoryLimit == null || !storyLimitCheckStoryLimit.active(this.currentAccount) || this.delegate == null) {
                        return;
                    }
                    this.delegate.showDialog(new LimitReachedBottomSheet(fragmentForLimit(), findActivity(), storyLimitCheckStoryLimit.getLimitReachedType(), this.currentAccount, null));
                    return;
                }
                if (i == NotificationCenter.userIsPremiumBlockedUpadted) {
                    TL_account.RequirementToContact requirementToContactIsUserContactBlocked = MessagesController.getInstance(this.currentAccount).isUserContactBlocked(this.dialogId);
                    if (this.dialogId >= 0 && !UserConfig.getInstance(this.currentAccount).isPremium() && DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked)) {
                        z = true;
                    }
                    if (this.isPremiumBlocked == z && this.starsPriceBlocked == DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked)) {
                        return;
                    }
                    this.isPremiumBlocked = z;
                    this.starsPriceBlocked = DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked);
                    updatePosition();
                    checkStealthMode(true);
                    return;
                }
                if (i == NotificationCenter.chatInfoDidLoad) {
                    Object obj = objArr[0];
                    if ((obj instanceof TLRPC.ChatFull) && this.dialogId == (-((TLRPC.ChatFull) obj).id)) {
                        updatePosition();
                        return;
                    }
                    return;
                }
                if (i == NotificationCenter.liveStoryUpdated) {
                    long jLongValue = ((Long) objArr[0]).longValue();
                    StoryViewer storyViewer = this.storyViewer;
                    if (storyViewer == null || (livePlayer = storyViewer.livePlayer) == null || livePlayer.getCallId() != jLongValue) {
                        return;
                    }
                    updatePosition();
                    ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
                    if (chatActivityEnterView != null) {
                        chatActivityEnterView.checkSendButton(true);
                        this.chatActivityEnterView.updateSendAsButton(true);
                        checkStealthMode(true);
                    }
                    LiveCommentsView liveCommentsView = this.liveCommentsView;
                    if (liveCommentsView != null) {
                        liveCommentsView.updatedMinStars();
                        return;
                    }
                    return;
                }
                if (i == NotificationCenter.didLoadSendAsPeers && ((Boolean) objArr[2]).booleanValue()) {
                    loadSendAsPeers(true);
                    return;
                }
                return;
            }
        }
        Delegate delegate = this.delegate;
        if (delegate == null || !delegate.isClosed()) {
            if (this.isActive) {
                updateStoryItems();
                if (this.count == 0) {
                    if (this.deletedPeer) {
                        return;
                    }
                    this.deletedPeer = true;
                    this.delegate.switchToNextAndRemoveCurrentPeer();
                    return;
                }
                if (this.selectedPosition >= this.storyItems.size() + this.uploadingStories.size()) {
                    this.selectedPosition = (this.storyItems.size() + this.uploadingStories.size()) - 1;
                }
                updatePosition();
                if (this.isSelf || this.isChannel) {
                    updateUserViews(true);
                }
            }
            TL_stories.PeerStories peerStories = this.storyViewer.overrideUserStories;
            if (peerStories != null) {
                this.storiesController.loadSkippedStories(peerStories, true);
            } else {
                long j = this.dialogId;
                if (j != 0) {
                    this.storiesController.loadSkippedStories(j);
                }
            }
            ActionBarMenuSubItem actionBarMenuSubItem = this.editStoryItem;
            if (actionBarMenuSubItem != null) {
                actionBarMenuSubItem.animate().alpha((this.storiesController.hasUploadingStories(this.dialogId) && this.currentStory.isVideo && !SharedConfig.allowPreparingHevcPlayers()) ? 0.5f : 1.0f).start();
            }
        }
    }

    private void loadSendAsPeers(boolean z) {
        LivePlayer livePlayer;
        if (this.sendAsPeersObj != null) {
            return;
        }
        StoryViewer storyViewer = this.storyViewer;
        if (storyViewer == null || (livePlayer = storyViewer.livePlayer) == null || !livePlayer.sendAsDisabled()) {
            TLRPC.TL_channels_sendAsPeers sendAsPeers = MessagesController.getInstance(this.currentAccount).getSendAsPeers(this.dialogId, true);
            this.sendAsPeersObj = sendAsPeers;
            ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
            if (chatActivityEnterView == null || sendAsPeers == null) {
                return;
            }
            chatActivityEnterView.updateSendAsButton(z);
        }
    }

    public void lambda$new$43() throws Resources.NotFoundException {
        checkStealthMode(true);
    }

    public void checkStealthMode(boolean z) throws Resources.NotFoundException {
        if (this.chatActivityEnterView != null && this.isVisible && this.attachedToWindow) {
            AndroidUtilities.cancelRunOnUIThread(this.updateStealthModeTimer);
            TL_stories.TL_storiesStealthMode stealthMode = this.storiesController.getStealthMode();
            this.chatActivityEnterView.checkSendButton(true);
            if ((this.isPremiumBlocked && !this.currentStory.isLive) || this.areLiveCommentsDisabled) {
                this.stealthModeIsActive = false;
                this.chatActivityEnterView.setEnabled(false);
                this.chatActivityEnterView.setOverrideHint(" ", z);
                return;
            }
            if (this.starsPriceBlocked > 0) {
                this.stealthModeIsActive = false;
                this.chatActivityEnterView.setEnabled(true);
                this.chatActivityEnterView.setOverrideHint(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.starsPriceBlocked, ','))), z);
                return;
            }
            if (!this.currentStory.isLive && stealthMode != null) {
                int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                int i = stealthMode.active_until_date;
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
                    AndroidUtilities.runOnUIThread(this.updateStealthModeTimer, 1000L);
                    return;
                }
            }
            this.stealthModeIsActive = false;
            this.chatActivityEnterView.setEnabled(true);
            if (this.currentStory.isLive) {
                if (this.chatActivityEnterView.getStarsPrice() > 0) {
                    this.chatActivityEnterView.setOverrideHint(StarsIntroActivity.replaceStars(LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) r3, ',')), this.chatActivityEnterView.spans), z);
                    ColoredImageSpan coloredImageSpan = this.chatActivityEnterView.spans[0];
                    if (coloredImageSpan != null) {
                        coloredImageSpan.spaceScaleX = 0.9f;
                        return;
                    }
                    return;
                }
                this.chatActivityEnterView.setOverrideHint(LocaleController.getString(R.string.Comment), z);
                return;
            }
            this.chatActivityEnterView.setOverrideHint(LocaleController.getString(this.isGroup ? R.string.ReplyToGroupStory : R.string.ReplyPrivately), z);
        }
    }

    public void updatePosition() {
        updatePosition(false);
    }

    private void updatePosition(boolean r45) throws android.content.res.Resources.NotFoundException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.PeerStoriesView.updatePosition(boolean):void");
    }

    public void lambda$updatePosition$44(StoryCaptionView.Panel panel, View view) {
        Integer num;
        if (panel.peerId != null) {
            Bundle bundle = new Bundle();
            if (panel.peerId.longValue() >= 0) {
                bundle.putLong("user_id", panel.peerId.longValue());
            } else {
                bundle.putLong("chat_id", -panel.peerId.longValue());
            }
            if (panel.isRepostMessage && (num = panel.messageId) != null) {
                bundle.putInt("message_id", num.intValue());
                this.storyViewer.presentFragment(new ChatActivity(bundle));
                return;
            } else {
                this.storyViewer.presentFragment(new ProfileActivity(bundle));
                return;
            }
        }
        BulletinFactory.of(this.storyContainer, this.resourcesProvider).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.StoryHidAccount)).setTag(3).show(true);
    }

    public void lambda$updatePosition$45(long j, View view) {
        Bundle bundle = new Bundle();
        if (j >= 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        this.storyViewer.presentFragment(new ProfileActivity(bundle));
    }

    public boolean lambda$updatePosition$48(View view) {
        if (disabledPaidFeatures(true)) {
            return false;
        }
        ItemOptions.makeOptions(this.storyViewer.containerView, this.resourcesProvider, view).add(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updatePosition$46();
            }
        }).addIf(this.messageStars > 0, R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new Runnable() {
            @Override
            public final void run() throws Resources.NotFoundException {
                this.f$0.lambda$updatePosition$47();
            }
        }).setGravity(5).forceTop(true).show();
        return true;
    }

    public void lambda$updatePosition$47() throws Resources.NotFoundException {
        this.messageStars = 0L;
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.checkSendButton(true);
            this.chatActivityEnterView.updateSendButtonPaid();
            checkStealthMode(true);
        }
    }

    public void lambda$updatePosition$49() {
        this.failView.setVisibility(8);
    }

    public void lambda$updatePosition$50() {
        if (this.storyViewer.isShown()) {
            this.reactionsTooltipRunnable = null;
            if (this.reactionsLongpressTooltip == null) {
                HintView2 joint = new HintView2(getContext(), 3).setJoint(1.0f, -22.0f);
                this.reactionsLongpressTooltip = joint;
                joint.setBgColor(ColorUtils.setAlphaComponent(ColorUtils.blendARGB(-16777216, -1, 0.13f), 240));
                this.reactionsLongpressTooltip.setBounce(false);
                this.reactionsLongpressTooltip.setText(LocaleController.getString(R.string.ReactionLongTapHint));
                this.reactionsLongpressTooltip.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                this.storyContainer.addView(this.reactionsLongpressTooltip, LayoutHelper.createFrame(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, this.BIG_SCREEN ? 0.0f : 56.0f));
            }
            this.reactionsLongpressTooltip.show();
            SharedConfig.setStoriesReactionsLongPressHintUsed(true);
        }
    }

    public boolean isEditBotsPreview() {
        TLRPC.User user;
        return isBotsPreview() && (user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.storyViewer.storiesList.dialogId))) != null && user.bot && user.bot_can_edit;
    }

    public boolean isBotsPreview() {
        StoriesController.StoriesList storiesList;
        StoryViewer storyViewer = this.storyViewer;
        return (storyViewer == null || (storiesList = storyViewer.storiesList) == null || storiesList.type != 4) ? false : true;
    }

    public void lambda$new$51() {
        showNoSoundHint(false);
        MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
    }

    public void lambda$updatePosition$46() {
        MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.chatActivityEnterView.getTextWithEntities();
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        TLRPC.Peer defaultSendAs = this.storyViewer.livePlayer.getDefaultSendAs();
        if (defaultSendAs != null) {
            clientUserId = DialogObject.getPeerDialogId(defaultSendAs);
        }
        Context context = getContext();
        int i = this.currentAccount;
        HighlightMessageSheet.open(context, i, clientUserId, DialogObject.getShortName(i, this.dialogId), textWithEntities, getMessageMinPrice(), this.messageStars, new Utilities.Callback() {
            @Override
            public final void run(Object obj) throws Resources.NotFoundException {
                this.f$0.lambda$onHighlightLiveMessage$52((Long) obj);
            }
        }, new DarkThemeResourceProvider());
    }

    public void lambda$onHighlightLiveMessage$52(Long l) throws Resources.NotFoundException {
        this.messageStars = l.longValue();
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.checkSendButton(true);
            this.chatActivityEnterView.updateSendButtonPaid();
        }
        checkStealthMode(true);
    }

    private void createReplyDisabledView() {
        if (this.replyDisabledTextView != null) {
            return;
        }
        TextView textView = new TextView(getContext()) {
            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
            }
        };
        this.replyDisabledTextView = textView;
        textView.setTextSize(1, 14.0f);
        this.replyDisabledTextView.setTextColor(ColorUtils.blendARGB(-16777216, -1, 0.5f));
        this.replyDisabledTextView.setGravity(19);
        this.replyDisabledTextView.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.replyDisabledTextView, LayoutHelper.createFrame(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    private void updatePreloadImages() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.PeerStoriesView.updatePreloadImages():void");
    }

    private void setStoryImage(TL_stories.StoryItem storyItem, ImageReceiver imageReceiver, String str) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        StoriesController.UploadingStory uploadingStoryFindEditingStory = this.storiesController.findEditingStory(this.dialogId, storyItem);
        if (uploadingStoryFindEditingStory != null) {
            setStoryImage(uploadingStoryFindEditingStory, imageReceiver, str);
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        boolean zEndsWith = messageMedia != null && MessageObject.isVideoDocument(messageMedia.getDocument());
        String str2 = storyItem.attachPath;
        if (str2 != null) {
            if (storyItem.media == null) {
                zEndsWith = str2.toLowerCase().endsWith(".mp4");
            }
            if (zEndsWith) {
                imageReceiver.setImage(ImageLocation.getForPath(storyItem.attachPath), str + "_pframe", ImageLocation.getForPath(storyItem.firstFramePath), str, null, null, null, 0L, null, null, 0);
                return;
            }
            imageReceiver.setImage(ImageLocation.getForPath(storyItem.attachPath), str, null, null, null, 0L, null, null, 0);
            return;
        }
        if (zEndsWith) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(storyItem.media.getDocument().thumbs, 1000);
            imageReceiver.setImage(ImageLocation.getForDocument(storyItem.media.getDocument()), str + "_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.getDocument()), str, null, null, null, 0L, null, storyItem, 0);
            return;
        }
        TLRPC.MessageMedia messageMedia2 = storyItem.media;
        TLRPC.Photo photo = messageMedia2 != null ? messageMedia2.photo : null;
        if (photo != null && (arrayList = photo.sizes) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, Integer.MAX_VALUE);
            FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 800);
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, photo), str, null, null, null, 0L, null, storyItem, 0);
            return;
        }
        imageReceiver.clearImage();
    }

    private void setStoryImage(StoriesController.UploadingStory uploadingStory, ImageReceiver imageReceiver, String str) {
        if (uploadingStory.isVideo) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(uploadingStory.firstFramePath), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(uploadingStory.path), str, null, null, null, 0L, null, null, 0);
        }
    }

    private void cancelWaiting() {
        Runnable runnable = this.cancellableViews;
        if (runnable != null) {
            runnable.run();
            this.cancellableViews = null;
        }
        this.showViewsProgress = false;
        if (this.isActive) {
            this.delegate.setIsWaiting(false);
        }
    }

    public void updateUserViews(boolean z) {
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
                this.selfAvatarsContainer.setVisibility(8);
                this.selfAvatarsView.setVisibility(8);
                return;
            }
            if (z2) {
                if (storyItem.views == null) {
                    storyItem.views = new TL_stories.TL_storyViews();
                }
                TL_stories.StoryViews storyViews = storyItem.views;
                if (storyViews.views_count <= 0) {
                    storyViews.views_count = 1;
                }
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.repostCounter;
                if (animatedTextDrawable != null && (i = storyViews.forwards_count) > 0) {
                    animatedTextDrawable.setText(Integer.toString(i), z && this.repostCounterVisible);
                    this.repostCounterVisible = true;
                } else {
                    this.repostCounterVisible = false;
                }
                int i2 = storyItem.views.reactions_count;
                if (i2 > 0) {
                    this.reactionsCounter.setText(Integer.toString(i2), z && this.reactionsCounterVisible);
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
                if ((!this.isGroup || (!ChatObject.canSendPlain(chat) && !ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat))) && storyItem.views.views_count > 0) {
                    this.selfStatusView.setText(LocaleController.getString(this.storyViewer.storiesList == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                    this.selfStatusView.setTranslationX(AndroidUtilities.dp(16.0f));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "d  ");
                    spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.filled_views), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 0);
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                    this.selfStatusView.setText(spannableStringBuilder);
                } else {
                    this.selfStatusView.setText("");
                }
                this.likeButtonContainer.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.reactionsCounterVisible ? this.reactionsCounter.getAnimateToWidth() + AndroidUtilities.dp(4.0f) : 0.0f));
                ((ViewGroup.MarginLayoutParams) this.selfView.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + this.likeButtonContainer.getLayoutParams().width;
                FrameLayout frameLayout = this.repostButtonContainer;
                if (frameLayout != null) {
                    frameLayout.getLayoutParams().width = (int) (AndroidUtilities.dp(40.0f) + (this.repostCounterVisible ? this.repostCounter.getAnimateToWidth() + AndroidUtilities.dp(4.0f) : 0.0f));
                    ((ViewGroup.MarginLayoutParams) this.selfView.getLayoutParams()).rightMargin += this.repostButtonContainer.getLayoutParams().width;
                    this.repostButtonContainer.requestLayout();
                }
                this.selfView.requestLayout();
                this.likeButtonContainer.requestLayout();
                this.selfAvatarsView.setVisibility(8);
                this.selfAvatarsContainer.setVisibility(8);
                this.storyAreasView.onStoryItemUpdated(this.currentStory.storyItem, z);
                return;
            }
            TL_stories.StoryViews storyViews2 = storyItem.views;
            if (storyViews2 != null && storyViews2.views_count > 0) {
                int i3 = 0;
                for (int i4 = 0; i4 < storyItem.views.recent_viewers.size(); i4++) {
                    TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(storyItem.views.recent_viewers.get(i4).longValue());
                    if (userOrChat != null) {
                        this.selfAvatarsView.setObject(i3, this.currentAccount, userOrChat);
                        i3++;
                    }
                    if (i3 >= 3) {
                        break;
                    }
                }
                for (int i5 = i3; i5 < 3; i5++) {
                    this.selfAvatarsView.setObject(i5, this.currentAccount, null);
                }
                this.selfAvatarsView.commitTransition(false);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.formatPluralStringComma("Views", storyItem.views.views_count));
                if (storyItem.views.reactions_count > 0) {
                    spannableStringBuilder2.append((CharSequence) "  d ");
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_views_likes);
                    coloredImageSpan.setOverrideColor(-53704);
                    coloredImageSpan.setTopOffset(AndroidUtilities.dp(0.2f));
                    spannableStringBuilder2.setSpan(coloredImageSpan, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                    spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                }
                if (storyItem.views.forwards_count > 0) {
                    spannableStringBuilder2.append((CharSequence) "  d ");
                    ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.mini_repost_story);
                    coloredImageSpan2.setOverrideColor(-14161823);
                    coloredImageSpan2.setTopOffset(AndroidUtilities.dp(0.2f));
                    spannableStringBuilder2.setSpan(coloredImageSpan2, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                    spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                }
                this.selfStatusView.setText(spannableStringBuilder2);
                if (i3 == 0) {
                    this.selfAvatarsView.setVisibility(8);
                    this.selfStatusView.setTranslationX(AndroidUtilities.dp(16.0f));
                } else {
                    this.selfAvatarsView.setVisibility(0);
                    this.selfStatusView.setTranslationX(AndroidUtilities.dp(13.0f) + AndroidUtilities.dp(24.0f) + (AndroidUtilities.dp(20.0f) * (i3 - 1)) + AndroidUtilities.dp(10.0f));
                }
                this.selfAvatarsContainer.setVisibility(0);
            } else {
                this.selfStatusView.setText(LocaleController.getString(this.storyViewer.storiesList == null ? R.string.NobodyViews : R.string.NobodyViewsArchived));
                this.selfStatusView.setTranslationX(AndroidUtilities.dp(16.0f));
                this.selfAvatarsView.setVisibility(8);
                this.selfAvatarsContainer.setVisibility(8);
            }
            this.likeButtonContainer.getLayoutParams().width = AndroidUtilities.dp(40.0f);
            this.bottomActionsLinearLayout.requestLayout();
        }
    }

    private void requestVideoPlayer(long r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.PeerStoriesView.requestVideoPlayer(long):void");
    }

    public boolean switchToNext(boolean z) {
        if (this.storyViewer.reversed) {
            z = !z;
        }
        if (z) {
            if (this.selectedPosition >= getStoriesCount() - 1) {
                return false;
            }
            this.selectedPosition++;
            updatePosition();
            return true;
        }
        int i = this.selectedPosition;
        if (i <= 0) {
            return false;
        }
        this.selectedPosition = i - 1;
        updatePosition();
        return true;
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public void drawPlayingBitmap(int i, int i2, Canvas canvas) {
        TextureView textureView;
        VideoPlayerSharedScope videoPlayerSharedScope = this.playerSharedScope;
        View view = videoPlayerSharedScope.renderView;
        if (view != null && videoPlayerSharedScope.surfaceView != null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface(this.playerSharedScope.surfaceView, bitmapCreateBitmap);
            }
            if (bitmapCreateBitmap != null) {
                canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        if (view != null && (textureView = videoPlayerSharedScope.textureView) != null) {
            Bitmap bitmap = textureView.getBitmap(i, i2);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                return;
            }
            return;
        }
        canvas.save();
        canvas.scale(i / this.storyContainer.getMeasuredWidth(), i2 / this.storyContainer.getMeasuredHeight());
        this.imageReceiver.draw(canvas);
        canvas.restore();
    }

    public Bitmap getPlayingBitmap() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.storyContainer.getWidth(), this.storyContainer.getHeight(), Bitmap.Config.ARGB_8888);
        drawPlayingBitmap(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public void createBlurredBitmap(Canvas canvas, Bitmap bitmap) {
        drawPlayingBitmap(bitmap.getWidth(), bitmap.getHeight(), canvas);
        if (AndroidUtilities.computePerceivedBrightness(AndroidUtilities.getDominantColor(bitmap)) < 0.15f) {
            canvas.drawColor(ColorUtils.setAlphaComponent(-1, 102));
        }
        Utilities.blurBitmap(bitmap, 3, 1, bitmap.getWidth(), bitmap.getHeight(), bitmap.getRowBytes());
        Utilities.blurBitmap(bitmap, 3, 1, bitmap.getWidth(), bitmap.getHeight(), bitmap.getRowBytes());
    }

    public void stopPlaying(boolean z) {
        if (z) {
            this.imageReceiver.stopAnimation();
            this.imageReceiver.setAllowStartAnimation(false);
        } else {
            this.imageReceiver.startAnimation();
            this.imageReceiver.setAllowStartAnimation(true);
        }
    }

    public long getCurrentPeer() {
        return this.dialogId;
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.day;
    }

    public void setPaused(boolean z) {
        if (this.paused != z) {
            this.paused = z;
            stopPlaying(z);
            this.lastDrawTime = 0L;
            this.storyContainer.invalidate();
        }
    }

    public int getSelectedPosition() {
        return this.selectedPosition;
    }

    public boolean closeKeyboardOrEmoji() throws Resources.NotFoundException {
        if (this.likesReactionShowing) {
            if (this.likesReactionLayout.getReactionsWindow() != null) {
                if (this.realKeyboardHeight > 0) {
                    AndroidUtilities.hideKeyboard(this.likesReactionLayout.getReactionsWindow().windowView);
                } else {
                    this.likesReactionLayout.getReactionsWindow().dismiss();
                }
                return true;
            }
            showLikesReaction(false);
            return true;
        }
        StoryMediaAreasView storyMediaAreasView = this.storyAreasView;
        if (storyMediaAreasView != null) {
            storyMediaAreasView.closeHint();
        }
        if (this.storyCaptionView.textSelectionHelper.isInSelectionMode()) {
            this.storyCaptionView.textSelectionHelper.clear(false);
            return true;
        }
        HintView2 hintView2 = this.privacyHint;
        if (hintView2 != null) {
            hintView2.hide();
        }
        HintView2 hintView22 = this.soundTooltip;
        if (hintView22 != null) {
            hintView22.hide();
        }
        HintView hintView = this.mediaBanTooltip;
        if (hintView != null) {
            hintView.hide(true);
        }
        CaptionContainerView captionContainerView = this.storyEditCaptionView;
        if (captionContainerView != null && captionContainerView.onBackPressed()) {
            return true;
        }
        CustomPopupMenu customPopupMenu = this.popupMenu;
        if (customPopupMenu != null && customPopupMenu.isShowing()) {
            this.popupMenu.dismiss();
            return true;
        }
        if (checkRecordLocked(false)) {
            return true;
        }
        ReactionsContainerLayout reactionsContainerLayout = this.reactionsContainerLayout;
        if (reactionsContainerLayout != null && reactionsContainerLayout.getReactionsWindow() != null && this.reactionsContainerLayout.getReactionsWindow().isShowing()) {
            this.reactionsContainerLayout.getReactionsWindow().dismiss();
            return true;
        }
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView != null && chatActivityEnterView.isPopupShowing()) {
            if (this.realKeyboardHeight > 0) {
                AndroidUtilities.hideKeyboard(this.chatActivityEnterView.getEmojiView());
            } else {
                this.chatActivityEnterView.hidePopup(true, false);
            }
            return true;
        }
        if (getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            ChatActivityEnterView chatActivityEnterView2 = this.chatActivityEnterView;
            if (chatActivityEnterView2 != null) {
                this.storyViewer.saveDraft(this.dialogId, this.currentStory.storyItem, chatActivityEnterView2.getEditText());
            }
            AndroidUtilities.hideKeyboard(this.chatActivityEnterView);
            return true;
        }
        if (this.storyCaptionView.getVisibility() != 0 || this.storyCaptionView.getProgressToBlackout() <= 0.0f) {
            return false;
        }
        this.storyCaptionView.collapse();
        this.inBlackoutMode = false;
        this.storyContainer.invalidate();
        return true;
    }

    public boolean findClickableView(ViewGroup viewGroup, float f, float f2, boolean z) {
        ChatActivityEnterView chatActivityEnterView;
        VideoPlayerSharedScope videoPlayerSharedScope;
        if (viewGroup == null) {
            return false;
        }
        HintView2 hintView2 = this.privacyHint;
        if (hintView2 != null && hintView2.shown()) {
            return true;
        }
        HintView2 hintView22 = this.soundTooltip;
        if (hintView22 != null && hintView22.shown()) {
            return true;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                if (childAt == this.storyCaptionView) {
                    Rect rect = AndroidUtilities.rectTmp2;
                    childAt.getHitRect(rect);
                    if (rect.contains((int) f, (int) f2) && this.storyCaptionView.allowInterceptTouchEvent(f, f2 - childAt.getTop())) {
                        return true;
                    }
                }
                Rect rect2 = AndroidUtilities.rectTmp2;
                childAt.getHitRect(rect2);
                if (childAt == this.storyContainer && (videoPlayerSharedScope = this.playerSharedScope) != null) {
                    View view = videoPlayerSharedScope.renderView;
                    if ((view instanceof ViewGroup) && findClickableView((ViewGroup) view, f - childAt.getX(), f2 - childAt.getY(), z)) {
                        return true;
                    }
                }
                if (childAt.isClickable() && rect2.contains((int) f, (int) f2)) {
                    return true;
                }
                StoryMediaAreasView storyMediaAreasView = this.storyAreasView;
                if (childAt == storyMediaAreasView && !storyMediaAreasView.hasSelected() && (f < AndroidUtilities.dp(60.0f) || f > viewGroup.getMeasuredWidth() - AndroidUtilities.dp(60.0f))) {
                    if (this.storyAreasView.hasClickableViews(f, f2)) {
                        return true;
                    }
                } else {
                    LiveCommentsView liveCommentsView = this.liveCommentsView;
                    if (childAt == liveCommentsView) {
                        liveCommentsView.topListView.getHitRect(rect2);
                        if (rect2.contains((int) ((f - this.liveCommentsView.getX()) - this.liveCommentsView.topListView.getX()), (int) ((f2 - this.liveCommentsView.getY()) - this.liveCommentsView.topListView.getY()))) {
                            return true;
                        }
                        if (!this.liveCommentsView.isCollapsed()) {
                            if (!this.keyboardVisible && f2 <= this.liveCommentsView.getY() + this.liveCommentsView.top()) {
                                LiveCommentsView liveCommentsView2 = this.liveCommentsView;
                                if (liveCommentsView2.listView.findChildViewUnder(f, (f2 - liveCommentsView2.getY()) - this.liveCommentsView.listView.getY()) != null) {
                                }
                            }
                            return true;
                        }
                        continue;
                    } else {
                        if (this.keyboardVisible && childAt == this.chatActivityEnterView && f2 > rect2.top) {
                            return true;
                        }
                        if (!z && rect2.contains((int) f, (int) f2) && (((childAt.isClickable() || childAt == this.reactionsContainerLayout) && childAt.isEnabled()) || ((chatActivityEnterView = this.chatActivityEnterView) != null && childAt == chatActivityEnterView.getRecordCircle()))) {
                            return true;
                        }
                        if (childAt.isEnabled() && (childAt instanceof ViewGroup) && findClickableView((ViewGroup) childAt, f - childAt.getX(), f2 - childAt.getY(), z)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
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

    public void setActive(long j, boolean z) {
        if (this.isActive != z) {
            activeCount += z ? 1 : -1;
            this.isActive = z;
            if (z) {
                if (useSurfaceInViewPagerWorkAround()) {
                    this.delegate.setIsSwiping(true);
                    AndroidUtilities.cancelRunOnUIThread(this.allowDrawSurfaceRunnable);
                    AndroidUtilities.runOnUIThread(this.allowDrawSurfaceRunnable, 100L);
                }
                requestVideoPlayer(j);
                updatePreloadImages();
                this.muteIconView.setAnimation(this.sharedResources.muteDrawable);
                this.isActive = true;
                this.headerView.backupImageView.getImageReceiver().setVisible(true, true);
                if (this.currentStory.storyItem != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.dialogId + " storyId=" + this.currentStory.storyItem.id + " " + this.currentStory.getMediaDebugString());
                }
            } else {
                cancelTextSelection();
                this.muteIconView.clearAnimationDrawable();
                this.viewsThumbImageReceiver = null;
                this.isLongPressed = false;
                this.progressToHideInterface.set(0.0f, true);
                this.storyContainer.invalidate();
                invalidate();
                cancelWaiting();
                this.delegate.setIsRecording(false);
            }
            this.imageReceiver.setFileLoadingPriority(this.isActive ? 3 : 2);
            this.leftPreloadImageReceiver.setFileLoadingPriority(this.isActive ? 2 : 0);
            this.rightPreloadImageReceiver.setFileLoadingPriority(this.isActive ? 2 : 0);
            if (this.isSelf || this.isChannel) {
                this.storiesController.pollViewsForSelfStories(this.dialogId, this.isActive);
            }
        }
    }

    public void progressToDismissUpdated() {
        if (this.BIG_SCREEN) {
            invalidate();
        }
    }

    public void reset() throws Resources.NotFoundException {
        this.headerView.backupImageView.getImageReceiver().setVisible(true, true);
        if (this.changeBoundAnimator != null) {
            this.chatActivityEnterView.reset();
            this.chatActivityEnterView.setAlpha(1.0f - this.outT);
        }
        ReactionsContainerLayout reactionsContainerLayout = this.reactionsContainerLayout;
        if (reactionsContainerLayout != null) {
            reactionsContainerLayout.reset();
        }
        ReactionsContainerLayout reactionsContainerLayout2 = this.likesReactionLayout;
        if (reactionsContainerLayout2 != null) {
            reactionsContainerLayout2.reset();
        }
        InstantCameraView instantCameraView = this.instantCameraView;
        if (instantCameraView != null) {
            AndroidUtilities.removeFromParent(instantCameraView);
            this.instantCameraView.hideCamera(true);
            this.instantCameraView = null;
        }
        setActive(false);
        setIsVisible(false);
        this.isLongPressed = false;
        this.progressToHideInterface.set(0.0f, false);
        this.viewsThumbImageReceiver = null;
        this.messageSent = false;
        cancelTextSelection();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 0 || i == 2) {
                createChatAttachView();
                ChatAttachAlert chatAttachAlert = this.chatAttachAlert;
                if (chatAttachAlert != null) {
                    chatAttachAlert.getPhotoLayout().onActivityResultFragment(i, intent, null);
                    return;
                }
                return;
            }
            if (i == 21) {
                if (intent == null) {
                    showAttachmentError();
                    return;
                }
                if (intent.getData() != null) {
                    sendUriAsDocument(intent.getData());
                } else if (intent.getClipData() != null) {
                    ClipData clipData = intent.getClipData();
                    for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                        sendUriAsDocument(clipData.getItemAt(i3).getUri());
                    }
                } else {
                    showAttachmentError();
                }
                ChatAttachAlert chatAttachAlert2 = this.chatAttachAlert;
                if (chatAttachAlert2 != null) {
                    chatAttachAlert2.dismiss();
                }
                afterMessageSend(true);
            }
        }
    }

    private void sendUriAsDocument(android.net.Uri r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.PeerStoriesView.sendUriAsDocument(android.net.Uri):void");
    }

    private void showAttachmentError() {
        BulletinFactory.of(this.storyContainer, this.resourcesProvider).createErrorBulletin(LocaleController.getString(R.string.UnsupportedAttachment), this.resourcesProvider).show();
    }

    public void setLongpressed(boolean z) {
        if (this.isActive) {
            this.isLongPressed = z;
            invalidate();
        }
    }

    public boolean showKeyboard() {
        TextView textView;
        EditTextCaption editField;
        if (this.chatActivityEnterView == null || (((textView = this.replyDisabledTextView) != null && textView.getVisibility() == 0) || (editField = this.chatActivityEnterView.getEditField()) == null)) {
            return false;
        }
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        return true;
    }

    public void checkPinchToZoom(MotionEvent motionEvent) {
        this.pinchToZoomHelper.checkPinchToZoom(motionEvent, this.storyContainer, null, null, null, null);
    }

    public void setIsVisible(boolean z) throws Resources.NotFoundException {
        if (this.isVisible == z) {
            return;
        }
        this.isVisible = z;
        if (z) {
            this.imageReceiver.setCurrentAlpha(1.0f);
            checkStealthMode(false);
        }
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.storyItems;
    }

    public void selectPosition(int i) {
        if (this.selectedPosition != i) {
            this.selectedPosition = i;
            updatePosition();
        }
    }

    public void cancelTouch() {
        this.storyCaptionView.cancelTouch();
    }

    public void onActionDown(MotionEvent motionEvent) {
        HintView2 hintView2 = this.privacyHint;
        if (hintView2 != null && hintView2.shown() && this.privacyButton != null && !this.privacyHint.containsTouch(motionEvent, getX() + this.storyContainer.getX() + this.privacyHint.getX(), getY() + this.storyContainer.getY() + this.privacyHint.getY()) && !hitButton(this.privacyButton, motionEvent)) {
            this.privacyHint.hide();
        }
        HintView2 hintView22 = this.soundTooltip;
        if (hintView22 == null || !hintView22.shown() || this.muteIconContainer == null || this.soundTooltip.containsTouch(motionEvent, getX() + this.storyContainer.getX() + this.soundTooltip.getX(), getY() + this.storyContainer.getY() + this.soundTooltip.getY()) || hitButton(this.muteIconContainer, motionEvent)) {
            return;
        }
        this.soundTooltip.hide();
    }

    private boolean hitButton(View view, MotionEvent motionEvent) {
        float x = getX() + this.storyContainer.getX() + view.getX();
        float y = getY() + this.storyContainer.getY() + view.getY();
        return motionEvent.getX() >= x && motionEvent.getX() <= x + ((float) view.getWidth()) && motionEvent.getY() >= y && motionEvent.getY() <= y + ((float) view.getHeight());
    }

    public void setOffset(float f) {
        boolean z = f == 0.0f;
        if (this.allowDrawSurface != z) {
            this.allowDrawSurface = z;
            this.storyContainer.invalidate();
            if (this.isActive && useSurfaceInViewPagerWorkAround()) {
                if (z) {
                    AndroidUtilities.cancelRunOnUIThread(this.allowDrawSurfaceRunnable);
                    AndroidUtilities.runOnUIThread(this.allowDrawSurfaceRunnable, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(this.allowDrawSurfaceRunnable);
                    this.delegate.setIsSwiping(true);
                }
            }
        }
    }

    public boolean useSurfaceInViewPagerWorkAround() {
        return this.storyViewer.USE_SURFACE_VIEW && Build.VERSION.SDK_INT < 33;
    }

    public void showNoSoundHint(boolean z) {
        if (this.soundTooltip == null) {
            HintView2 joint = new HintView2(getContext(), 1).setJoint(1.0f, -56.0f);
            this.soundTooltip = joint;
            joint.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.storyContainer.addView(this.soundTooltip, LayoutHelper.createFrame(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        this.soundTooltip.setText(LocaleController.getString(z ? R.string.StoryNoSound : R.string.StoryTapToSound));
        this.soundTooltip.show();
    }

    public boolean checkTextSelectionEvent(MotionEvent motionEvent) {
        if (!this.storyCaptionView.textSelectionHelper.isInSelectionMode()) {
            return false;
        }
        float x = getX();
        float y = getY() + ((View) getParent()).getY();
        motionEvent.offsetLocation(-x, -y);
        if (this.storyCaptionView.textSelectionHelper.getOverlayView(getContext()).onTouchEvent(motionEvent)) {
            return true;
        }
        motionEvent.offsetLocation(x, y);
        return false;
    }

    public void cancelTextSelection() {
        if (this.storyCaptionView.textSelectionHelper.isInSelectionMode()) {
            this.storyCaptionView.textSelectionHelper.clear();
        }
    }

    public boolean checkReactionEvent(MotionEvent motionEvent) {
        ReactionsContainerLayout reactionsContainerLayout = this.likesReactionLayout;
        if (reactionsContainerLayout == null) {
            return false;
        }
        float y = 0.0f;
        float x = 0.0f;
        for (View view = this; view != null && (view.getParent() instanceof View); view = (View) view.getParent()) {
            x += view.getX();
            y += view.getY();
        }
        if (this.likesReactionLayout.getReactionsWindow() != null && this.likesReactionLayout.getReactionsWindow().windowView != null) {
            motionEvent.offsetLocation(-x, (-y) - this.likesReactionLayout.getReactionsWindow().windowView.getTranslationY());
            this.likesReactionLayout.getReactionsWindow().windowView.dispatchTouchEvent(motionEvent);
            return true;
        }
        Rect rect = AndroidUtilities.rectTmp2;
        reactionsContainerLayout.getHitRect(rect);
        rect.offset((int) x, (int) y);
        if (motionEvent.getAction() == 0 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            showLikesReaction(false);
            return true;
        }
        motionEvent.offsetLocation(-rect.left, -rect.top);
        reactionsContainerLayout.dispatchTouchEvent(motionEvent);
        return true;
    }

    public boolean viewsAllowed() {
        if (this.currentStory.isLive) {
            return false;
        }
        return this.isSelf || (this.isChannel && this.userCanSeeViews);
    }

    public static class PeerHeaderView extends FrameLayout {
        public BackupImageView backupImageView;
        private float progressToUploading;
        RadialProgress radialProgress;
        Paint radialProgressPaint;
        StoryItemHolder storyItemHolder;
        private ValueAnimator subtitleAnimator;
        private TextView[] subtitleView;
        public SimpleTextView titleView;
        private boolean uploadedTooFast;
        private boolean uploading;

        public PeerHeaderView(Context context, StoryItemHolder storyItemHolder) {
            super(context);
            this.subtitleView = new TextView[2];
            this.storyItemHolder = storyItemHolder;
            BackupImageView backupImageView = new BackupImageView(context) {
                @Override
                protected void onDraw(Canvas canvas) {
                    if (this.imageReceiver.getVisible()) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                        PeerHeaderView.this.drawUploadingProgress(canvas, rectF, true, 1.0f);
                    }
                    super.onDraw(canvas);
                }
            };
            this.backupImageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(16.0f));
            addView(this.backupImageView, LayoutHelper.createFrame(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
            setClipChildren(false);
            SimpleTextView simpleTextView = new SimpleTextView(context) {
                @Override
                protected void onMeasure(int i, int i2) {
                    super.onMeasure(i, i2);
                    setPivotY(getMeasuredHeight() / 2.0f);
                }
            };
            this.titleView = simpleTextView;
            simpleTextView.setTextSize(14);
            this.titleView.setTypeface(AndroidUtilities.bold());
            this.titleView.setMaxLines(1);
            this.titleView.setEllipsizeByGradient(AndroidUtilities.dp(4.0f));
            this.titleView.setPivotX(0.0f);
            NotificationCenter.listenEmojiLoading(this.titleView);
            addView(this.titleView, LayoutHelper.createFrame(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
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

        public void setSubtitle(CharSequence charSequence) {
            setSubtitle(charSequence, false);
        }

        public void setOnSubtitleClick(View.OnClickListener onClickListener) {
            this.subtitleView[0].setOnClickListener(onClickListener);
            this.subtitleView[0].setClickable(onClickListener != null);
            this.subtitleView[0].setBackground(onClickListener == null ? null : Theme.createSelectorDrawable(822083583, 7));
        }

        public void setSubtitle(CharSequence charSequence, boolean z) {
            ValueAnimator valueAnimator = this.subtitleAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.subtitleAnimator = null;
            }
            if (z) {
                this.subtitleView[1].setOnClickListener(null);
                TextView[] textViewArr = this.subtitleView;
                textViewArr[1].setText(textViewArr[0].getText());
                this.subtitleView[1].setVisibility(0);
                this.subtitleView[1].setAlpha(1.0f);
                this.subtitleView[1].setTranslationY(0.0f);
                this.subtitleView[0].setText(charSequence);
                this.subtitleView[0].setVisibility(0);
                this.subtitleView[0].setAlpha(0.0f);
                this.subtitleView[0].setTranslationY(-AndroidUtilities.dp(4.0f));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.subtitleAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        this.f$0.lambda$setSubtitle$0(valueAnimator2);
                    }
                });
                this.subtitleAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PeerHeaderView.this.subtitleView[1].setVisibility(8);
                        PeerHeaderView.this.subtitleView[0].setAlpha(1.0f);
                        PeerHeaderView.this.subtitleView[0].setTranslationY(0.0f);
                    }
                });
                this.subtitleAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.subtitleAnimator.setDuration(340L);
                this.subtitleAnimator.start();
                return;
            }
            this.subtitleView[0].setVisibility(0);
            this.subtitleView[0].setAlpha(1.0f);
            this.subtitleView[0].setText(charSequence);
            this.subtitleView[1].setVisibility(8);
            this.subtitleView[1].setAlpha(0.0f);
        }

        public void lambda$setSubtitle$0(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.subtitleView[0].setAlpha(fFloatValue);
            float f = 1.0f - fFloatValue;
            this.subtitleView[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f);
            this.subtitleView[1].setAlpha(f);
            this.subtitleView[1].setTranslationY(fFloatValue * AndroidUtilities.dp(4.0f));
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (isEnabled()) {
                return super.dispatchTouchEvent(motionEvent);
            }
            return false;
        }

        public void drawUploadingProgress(Canvas canvas, RectF rectF, boolean z, float f) {
            float f2;
            boolean z2;
            StoriesController.UploadingStory uploadingStory;
            StoryItemHolder storyItemHolder = this.storyItemHolder;
            if ((storyItemHolder == null || storyItemHolder.uploadingStory == null) && this.progressToUploading == 0.0f) {
                return;
            }
            if (storyItemHolder != null && (uploadingStory = storyItemHolder.uploadingStory) != null && !uploadingStory.failed) {
                this.progressToUploading = 1.0f;
                f2 = uploadingStory.progress;
                if (!this.uploading) {
                    this.uploading = true;
                }
                z2 = false;
            } else {
                if (this.uploading) {
                    this.uploading = false;
                    this.uploadedTooFast = this.radialProgress.getAnimatedProgress() < 0.2f;
                }
                if (!this.uploadedTooFast) {
                    this.progressToUploading = Utilities.clamp(this.progressToUploading - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
                }
                f2 = 1.0f;
                z2 = true;
            }
            if (this.radialProgress == null) {
                RadialProgress radialProgress = new RadialProgress(this.backupImageView);
                this.radialProgress = radialProgress;
                radialProgress.setBackground(null, true, false);
            }
            this.radialProgress.setDiff(0);
            ImageReceiver imageReceiver = this.backupImageView.getImageReceiver();
            float fDp = AndroidUtilities.dp(3.0f) - (AndroidUtilities.dp(6.0f) * (1.0f - this.progressToUploading));
            this.radialProgress.setProgressRect((int) (rectF.left - fDp), (int) (rectF.top - fDp), (int) (rectF.right + fDp), (int) (rectF.bottom + fDp));
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
    }

    public int getStoriesCount() {
        return this.uploadingStories.size() + Math.max(this.totalStoriesCount, this.storyItems.size());
    }

    public class StoryItemHolder {
        public CharSequence caption;
        public boolean captionTranslated;
        public TL_stories.StoryItem editingSourceItem;
        private boolean isLive;
        private boolean isVideo;
        private StoryCaptionView.Panel musicPanel;
        private StoryCaptionView.Panel panel;
        boolean skipped;
        public TL_stories.StoryItem storyItem = null;
        public StoriesController.UploadingStory uploadingStory = null;

        public StoryItemHolder() {
        }

        boolean isLive() {
            return this.isLive;
        }

        boolean isThisCall(long j) {
            TL_stories.StoryItem storyItem = this.storyItem;
            if (storyItem != null) {
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if ((messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.id) {
                    return true;
                }
            }
            return false;
        }

        public String getMediaDebugString() {
            TLRPC.MessageMedia messageMedia;
            TL_stories.StoryItem storyItem = this.storyItem;
            if (storyItem != null && (messageMedia = storyItem.media) != null) {
                if (messageMedia.photo != null) {
                    return "photo#" + this.storyItem.media.photo.id + "at" + this.storyItem.media.photo.dc_id + "dc";
                }
                if (messageMedia.document != null) {
                    return "doc#" + this.storyItem.media.document.id + "at" + this.storyItem.media.document.dc_id + "dc";
                }
                return "unknown";
            }
            if (this.uploadingStory != null) {
                return "uploading from " + this.uploadingStory.path;
            }
            return "unknown";
        }

        public StoryCaptionView.Panel getMusic() {
            TL_stories.StoryItem storyItem;
            if (this.musicPanel == null && (storyItem = this.storyItem) != null) {
                this.musicPanel = StoryCaptionView.Panel.from(storyItem.music);
            }
            return this.musicPanel;
        }

        public StoryCaptionView.Panel getReply() {
            if (this.panel == null) {
                if (this.storyItem != null) {
                    this.panel = StoryCaptionView.Panel.from(PeerStoriesView.this.currentAccount, this.storyItem);
                } else {
                    StoriesController.UploadingStory uploadingStory = this.uploadingStory;
                    if (uploadingStory != null) {
                        this.panel = StoryCaptionView.Panel.from(uploadingStory);
                    }
                }
            }
            return this.panel;
        }

        public void updateCaption() {
            int i;
            this.captionTranslated = false;
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            StoryItemHolder storyItemHolder = peerStoriesView.currentStory;
            StoriesController.UploadingStory uploadingStory = storyItemHolder.uploadingStory;
            if (uploadingStory != null) {
                CharSequence charSequence = uploadingStory.entry.caption;
                this.caption = charSequence;
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequence, peerStoriesView.storyCaptionView.captionTextview.getPaint().getFontMetricsInt(), false);
                this.caption = charSequenceReplaceEmoji;
                SpannableStringBuilder spannableStringBuilder = charSequenceReplaceEmoji == null ? new SpannableStringBuilder() : SpannableStringBuilder.valueOf(charSequenceReplaceEmoji);
                TLRPC.User user = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getUser(Long.valueOf(PeerStoriesView.this.dialogId));
                if (PeerStoriesView.this.dialogId < 0 || MessagesController.getInstance(PeerStoriesView.this.currentAccount).storyEntitiesAllowed(user)) {
                    MessageObject.addLinks(true, spannableStringBuilder);
                    return;
                }
                return;
            }
            TL_stories.StoryItem storyItem = storyItemHolder.storyItem;
            if (storyItem != null) {
                if (storyItem.translated && storyItem.translatedText != null && TextUtils.equals(storyItem.translatedLng, TranslateAlert2.getToLanguage())) {
                    this.captionTranslated = true;
                    PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                    TLRPC.TL_textWithEntities tL_textWithEntities = peerStoriesView2.currentStory.storyItem.translatedText;
                    String str = tL_textWithEntities.text;
                    this.caption = str;
                    CharSequence charSequenceReplaceEmoji2 = Emoji.replaceEmoji(str, peerStoriesView2.storyCaptionView.captionTextview.getPaint().getFontMetricsInt(), false);
                    this.caption = charSequenceReplaceEmoji2;
                    if (charSequenceReplaceEmoji2 == null || tL_textWithEntities.entities == null) {
                        return;
                    }
                    SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, PeerStoriesView.this.storyCaptionView.captionTextview.getPaint().getFontMetricsInt(), false));
                    SpannableStringBuilder.valueOf(Emoji.replaceEmoji(spannableStringBuilderValueOf, PeerStoriesView.this.storyCaptionView.captionTextview.getPaint().getFontMetricsInt(), false));
                    i = (PeerStoriesView.this.dialogId < 0 || MessagesController.getInstance(PeerStoriesView.this.currentAccount).storyEntitiesAllowed(MessagesController.getInstance(PeerStoriesView.this.currentAccount).getUser(Long.valueOf(PeerStoriesView.this.dialogId)))) ? 1 : 0;
                    if (i != 0) {
                        MessageObject.addLinks(true, spannableStringBuilderValueOf);
                    }
                    MessageObject.addEntitiesToText(spannableStringBuilderValueOf, tL_textWithEntities.entities, false, true, true, false, i ^ 1);
                    this.caption = spannableStringBuilderValueOf;
                    return;
                }
                PeerStoriesView peerStoriesView3 = PeerStoriesView.this;
                String str2 = peerStoriesView3.currentStory.storyItem.caption;
                this.caption = str2;
                CharSequence charSequenceReplaceEmoji3 = Emoji.replaceEmoji(str2, peerStoriesView3.storyCaptionView.captionTextview.getPaint().getFontMetricsInt(), false);
                this.caption = charSequenceReplaceEmoji3;
                if (charSequenceReplaceEmoji3 == null || PeerStoriesView.this.currentStory.storyItem.entities == null) {
                    return;
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(PeerStoriesView.this.currentStory.storyItem.caption);
                PeerStoriesView peerStoriesView4 = PeerStoriesView.this;
                SpannableStringBuilder spannableStringBuilderValueOf2 = SpannableStringBuilder.valueOf(MessageObject.replaceAnimatedEmoji(spannableStringBuilder2, peerStoriesView4.currentStory.storyItem.entities, peerStoriesView4.storyCaptionView.captionTextview.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(Emoji.replaceEmoji(spannableStringBuilderValueOf2, PeerStoriesView.this.storyCaptionView.captionTextview.getPaint().getFontMetricsInt(), false));
                i = (PeerStoriesView.this.dialogId < 0 || MessagesController.getInstance(PeerStoriesView.this.currentAccount).storyEntitiesAllowed(MessagesController.getInstance(PeerStoriesView.this.currentAccount).getUser(Long.valueOf(PeerStoriesView.this.dialogId)))) ? 1 : 0;
                if (i != 0) {
                    MessageObject.addLinks(true, spannableStringBuilderValueOf2);
                }
                MessageObject.addEntitiesToText(spannableStringBuilderValueOf2, PeerStoriesView.this.currentStory.storyItem.entities, false, true, true, false, i ^ 1);
                this.caption = spannableStringBuilderValueOf2;
            }
        }

        void set(TL_stories.StoryItem storyItem) {
            this.storyItem = storyItem;
            this.panel = null;
            this.musicPanel = null;
            this.uploadingStory = null;
            this.skipped = storyItem instanceof TL_stories.TL_storyItemSkipped;
            this.isVideo = isVideoInternal();
            this.isLive = isLiveInternal();
        }

        private boolean isLiveInternal() {
            TLRPC.MessageMedia messageMedia;
            TL_stories.StoryItem storyItem = this.storyItem;
            return (storyItem == null || (messageMedia = storyItem.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
        }

        private boolean isVideoInternal() {
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

        void set(StoriesController.UploadingStory uploadingStory) {
            this.uploadingStory = uploadingStory;
            this.panel = null;
            this.musicPanel = null;
            this.storyItem = null;
            this.skipped = false;
            this.isVideo = isVideoInternal();
            this.isLive = isLiveInternal();
        }

        public void clear() {
            this.uploadingStory = null;
            this.storyItem = null;
        }

        void cancelOrDelete() {
            TL_stories.StoryItem storyItem = this.storyItem;
            if (storyItem instanceof StoriesController.BotPreview) {
                ((StoriesController.BotPreview) storyItem).list.delete(storyItem.media);
                return;
            }
            if (storyItem != null) {
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                peerStoriesView.storiesController.deleteStory(peerStoriesView.dialogId, this.storyItem);
            } else {
                StoriesController.UploadingStory uploadingStory = this.uploadingStory;
                if (uploadingStory != null) {
                    uploadingStory.cancel();
                }
            }
        }

        public void checkSendView() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.PeerStoriesView.StoryItemHolder.checkSendView():void");
        }

        public String getLocalPath() {
            TL_stories.StoryItem storyItem = this.storyItem;
            if (storyItem != null) {
                return storyItem.attachPath;
            }
            return null;
        }

        boolean isVideo() {
            return this.isVideo;
        }

        boolean hasSound() {
            TLRPC.MessageMedia messageMedia;
            TLRPC.Document document;
            if (!this.isVideo) {
                return false;
            }
            TL_stories.StoryItem storyItem = this.storyItem;
            if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.getDocument()) != null) {
                for (int i = 0; i < document.attributes.size(); i++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                        return false;
                    }
                }
                return true;
            }
            if (this.uploadingStory != null) {
                return !r0.entry.muted;
            }
            return true;
        }

        public String createLink() {
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            if (peerStoriesView.currentStory.storyItem == null) {
                return null;
            }
            if (peerStoriesView.dialogId > 0) {
                TLRPC.User user = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getUser(Long.valueOf(PeerStoriesView.this.dialogId));
                if (UserObject.getPublicUsername(user) == null) {
                    return null;
                }
                return PeerStoriesView.this.currentStory.isLive ? String.format(Locale.US, "https://t.me/%1$s/s/live", UserObject.getPublicUsername(user)) : String.format(Locale.US, "https://t.me/%1$s/s/%2$s", UserObject.getPublicUsername(user), Integer.valueOf(PeerStoriesView.this.currentStory.storyItem.id));
            }
            TLRPC.Chat chat = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getChat(Long.valueOf(-PeerStoriesView.this.dialogId));
            if (ChatObject.getPublicUsername(chat) == null) {
                return null;
            }
            return PeerStoriesView.this.currentStory.isLive ? String.format(Locale.US, "https://t.me/%1$s/s/live", ChatObject.getPublicUsername(chat)) : String.format(Locale.US, "https://t.me/%1$s/s/%2$s", ChatObject.getPublicUsername(chat), Integer.valueOf(PeerStoriesView.this.currentStory.storyItem.id));
        }

        public File getPath() {
            TLRPC.Photo photo;
            if (getLocalPath() != null) {
                return new File(getLocalPath());
            }
            TL_stories.StoryItem storyItem = this.storyItem;
            if (storyItem == null) {
                return null;
            }
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                return FileLoader.getInstance(PeerStoriesView.this.currentAccount).getPathToAttach(this.storyItem.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.storyItem.media;
            if (messageMedia2 == null || (photo = messageMedia2.photo) == null) {
                return null;
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, Integer.MAX_VALUE);
            File pathToAttach = FileLoader.getInstance(PeerStoriesView.this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true);
            return !pathToAttach.exists() ? FileLoader.getInstance(PeerStoriesView.this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, false) : pathToAttach;
        }

        public boolean allowScreenshots() {
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
            TLRPC.Chat chat = MessagesController.getInstance(PeerStoriesView.this.currentAccount).getChat(Long.valueOf(-storyItem.dialogId));
            return chat == null || !chat.noforwards;
        }
    }

    public static int getStoryId(TL_stories.StoryItem storyItem, StoriesController.UploadingStory uploadingStory) {
        StoryEntry storyEntry;
        if (storyItem != null) {
            return storyItem.id;
        }
        if (uploadingStory == null || (storyEntry = uploadingStory.entry) == null) {
            return 0;
        }
        return storyEntry.editStoryId;
    }

    @Override
    protected void onMeasure(int i, int i2) throws Resources.NotFoundException {
        int size;
        ReactionsContainerLayout reactionsContainerLayout;
        MentionsContainerView mentionsContainerView;
        if (this.storyViewer.ATTACH_TO_FRAGMENT) {
            ((FrameLayout.LayoutParams) getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        }
        if (this.isActive && this.shareAlert == null) {
            this.realKeyboardHeight = this.delegate.getKeyboardHeight();
        } else {
            this.realKeyboardHeight = 0;
        }
        if (this.storyViewer.ATTACH_TO_FRAGMENT) {
            size = View.MeasureSpec.getSize(i2);
        } else {
            size = View.MeasureSpec.getSize(i2) + this.realKeyboardHeight;
        }
        int size2 = (int) ((View.MeasureSpec.getSize(i) * 16.0f) / 9.0f);
        if (size <= size2 || size2 > size) {
            size2 = size;
        }
        if (this.realKeyboardHeight < AndroidUtilities.dp(20.0f)) {
            this.realKeyboardHeight = 0;
        }
        int visibleEmojiPadding = this.realKeyboardHeight;
        ReactionsContainerLayout reactionsContainerLayout2 = this.likesReactionLayout;
        if (reactionsContainerLayout2 != null && reactionsContainerLayout2.getReactionsWindow() != null && this.likesReactionLayout.getReactionsWindow().isShowing()) {
            this.likesReactionLayout.getReactionsWindow().windowView.animate().translationY(-this.realKeyboardHeight).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).start();
            visibleEmojiPadding = 0;
        } else {
            ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
            if (chatActivityEnterView != null && (chatActivityEnterView.isPopupShowing() || this.chatActivityEnterView.isWaitingForKeyboard())) {
                if (this.chatActivityEnterView.getEmojiView().getMeasuredHeight() == 0) {
                    visibleEmojiPadding = this.chatActivityEnterView.getEmojiPadding();
                } else if (this.chatActivityEnterView.isStickersExpanded()) {
                    this.chatActivityEnterView.checkStickresExpandHeight();
                    visibleEmojiPadding = this.chatActivityEnterView.getStickersExpandedHeight();
                } else {
                    visibleEmojiPadding = this.chatActivityEnterView.getVisibleEmojiPadding();
                }
            }
        }
        boolean z = this.keyboardVisible;
        if (this.lastKeyboardHeight != visibleEmojiPadding) {
            this.keyboardVisible = false;
            if (visibleEmojiPadding > 0 && this.isActive) {
                this.keyboardVisible = true;
                this.messageSent = false;
                this.lastOpenedKeyboardHeight = visibleEmojiPadding;
                checkReactionsLayout();
                ReactionsEffectOverlay.dismissAll();
            } else {
                ChatActivityEnterView chatActivityEnterView2 = this.chatActivityEnterView;
                if (chatActivityEnterView2 != null) {
                    this.storyViewer.saveDraft(this.dialogId, this.currentStory.storyItem, chatActivityEnterView2.getEditText());
                }
            }
            ChatActivityEnterView chatActivityEnterView3 = this.chatActivityEnterView;
            if (chatActivityEnterView3 != null) {
                chatActivityEnterView3.setSuggestionButtonVisible(this.currentStory.isLive && !disabledPaidFeatures(true) && this.keyboardVisible, true);
            }
            if (this.keyboardVisible && (mentionsContainerView = this.mentionContainer) != null) {
                mentionsContainerView.setVisibility(0);
            }
            if (!this.keyboardVisible && (reactionsContainerLayout = this.reactionsContainerLayout) != null) {
                reactionsContainerLayout.reset();
            }
            this.headerView.setEnabled(!this.keyboardVisible);
            ChatActivityEnterView chatActivityEnterView4 = this.chatActivityEnterView;
            if (chatActivityEnterView4 != null) {
                chatActivityEnterView4.checkReactionsButton(!this.keyboardVisible);
            }
            if (this.isActive && this.keyboardVisible) {
                this.delegate.setKeyboardVisible(true);
            }
            this.lastKeyboardHeight = visibleEmojiPadding;
            ValueAnimator valueAnimator = this.keyboardAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.notificationsLocker.lock();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.animatingKeyboardHeight, visibleEmojiPadding);
            this.keyboardAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f$0.lambda$onMeasure$53(valueAnimator2);
                }
            });
            this.keyboardAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    PeerStoriesView.this.notificationsLocker.unlock();
                    PeerStoriesView.this.animatingKeyboardHeight = r2.lastKeyboardHeight;
                    ChatActivityEnterView chatActivityEnterView5 = PeerStoriesView.this.chatActivityEnterView;
                    if (chatActivityEnterView5 != null) {
                        chatActivityEnterView5.onOverrideAnimationEnd();
                    }
                    PeerStoriesView peerStoriesView = PeerStoriesView.this;
                    if (peerStoriesView.isActive && !peerStoriesView.keyboardVisible) {
                        peerStoriesView.delegate.setKeyboardVisible(false);
                    }
                    PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                    if (!peerStoriesView2.keyboardVisible && peerStoriesView2.mentionContainer != null) {
                        PeerStoriesView.this.mentionContainer.setVisibility(8);
                    }
                    PeerStoriesView peerStoriesView3 = PeerStoriesView.this;
                    peerStoriesView3.forceUpdateOffsets = true;
                    peerStoriesView3.invalidate();
                }
            });
            if (this.keyboardVisible) {
                this.keyboardAnimator.setDuration(250L);
                this.keyboardAnimator.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                this.storyViewer.cancelSwipeToReply();
            } else {
                this.keyboardAnimator.setDuration(500L);
                this.keyboardAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            }
            this.keyboardAnimator.start();
            boolean z2 = this.keyboardVisible;
            if (z2 != z) {
                if (z2) {
                    createBlurredBitmap(this.bitmapShaderTools.getCanvas(), this.bitmapShaderTools.getBitmap());
                    if (this.currentStory.isLive) {
                        showPaidMessageHint();
                    }
                } else {
                    ChatActivityEnterView chatActivityEnterView5 = this.chatActivityEnterView;
                    if (chatActivityEnterView5 != null) {
                        chatActivityEnterView5.getEditField().clearFocus();
                    }
                    HintView2 hintView2 = this.highlightMessageHintView;
                    if (hintView2 != null) {
                        hintView2.hide();
                    }
                }
                this.animateKeyboardOpening = true;
            } else {
                this.animateKeyboardOpening = false;
            }
        }
        ChatActivityEnterView chatActivityEnterView6 = this.chatActivityEnterView;
        if (chatActivityEnterView6 != null && chatActivityEnterView6.getEmojiView() != null) {
            ((FrameLayout.LayoutParams) this.chatActivityEnterView.getEmojiView().getLayoutParams()).gravity = 80;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.storyContainer.getLayoutParams();
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
            this.storyContainer.setLayoutParams(layoutParams);
        }
        FrameLayout frameLayout = this.selfView;
        if (frameLayout != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (this.BIG_SCREEN) {
                layoutParams2.topMargin = iDp + size2 + AndroidUtilities.dp(8.0f);
            } else {
                layoutParams2.topMargin = (iDp + size2) - AndroidUtilities.dp(48.0f);
            }
        }
        TextView textView = this.replyDisabledTextView;
        if (textView != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) textView.getLayoutParams();
            if (!this.BIG_SCREEN) {
                this.replyDisabledTextView.setTextColor(ColorUtils.setAlphaComponent(-1, 191));
                layoutParams3.topMargin = ((iDp + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
            } else {
                this.replyDisabledTextView.setTextColor(ColorUtils.blendARGB(-16777216, -1, 0.5f));
                layoutParams3.topMargin = iDp + size2 + AndroidUtilities.dp(12.0f);
            }
        }
        InstantCameraView instantCameraView = this.instantCameraView;
        if (instantCameraView != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) instantCameraView.getLayoutParams();
            if (visibleEmojiPadding == 0) {
                layoutParams4.bottomMargin = size - ((iDp + size2) - AndroidUtilities.dp(64.0f));
            } else {
                layoutParams4.bottomMargin = visibleEmojiPadding + AndroidUtilities.dp(64.0f);
            }
        }
        if (!this.BIG_SCREEN) {
            ((FrameLayout.LayoutParams) this.bottomActionsLinearLayout.getLayoutParams()).topMargin = ((iDp + size2) - AndroidUtilities.dp(12.0f)) - AndroidUtilities.dp(40.0f);
            int iDp2 = this.isSelf ? AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(56.0f);
            ((FrameLayout.LayoutParams) this.storyCaptionView.getLayoutParams()).bottomMargin = iDp2;
            if (this.wasBigScreen != this.BIG_SCREEN) {
                StoryCaptionView storyCaptionView = this.storyCaptionView;
                storyCaptionView.setLayoutParams((FrameLayout.LayoutParams) storyCaptionView.getLayoutParams());
            }
            this.storyCaptionView.blackoutBottomOffset = iDp2;
        } else {
            ((FrameLayout.LayoutParams) this.bottomActionsLinearLayout.getLayoutParams()).topMargin = iDp + size2 + AndroidUtilities.dp(12.0f);
            ((FrameLayout.LayoutParams) this.storyCaptionView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
            if (this.wasBigScreen != this.BIG_SCREEN) {
                StoryCaptionView storyCaptionView2 = this.storyCaptionView;
                storyCaptionView2.setLayoutParams((FrameLayout.LayoutParams) storyCaptionView2.getLayoutParams());
            }
            this.storyCaptionView.blackoutBottomOffset = AndroidUtilities.dp(8.0f);
        }
        this.forceUpdateOffsets = true;
        float fDp = AndroidUtilities.dp(48.0f);
        if (this.privacyButton.getVisibility() == 0) {
            fDp += AndroidUtilities.dp(60.0f);
        }
        if (this.muteIconContainer.getVisibility() == 0) {
            fDp += AndroidUtilities.dp(40.0f);
        }
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.headerView.titleView.getLayoutParams();
        if (layoutParams5.rightMargin != fDp) {
            int i3 = (int) fDp;
            layoutParams5.rightMargin = i3;
            ((FrameLayout.LayoutParams) this.headerView.subtitleView[0].getLayoutParams()).rightMargin = i3;
            ((FrameLayout.LayoutParams) this.headerView.subtitleView[1].getLayoutParams()).rightMargin = i3;
            this.headerView.forceLayout();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        this.wasBigScreen = this.BIG_SCREEN;
    }

    public void lambda$onMeasure$53(ValueAnimator valueAnimator) {
        this.animatingKeyboardHeight = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.progressToKeyboard = -1.0f;
        this.forceUpdateOffsets = true;
        invalidate();
    }

    public void updateViewOffsets() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.PeerStoriesView.updateViewOffsets():void");
    }

    public float getHideInterfaceAlpha() {
        return (1.0f - this.progressToHideInterface.get()) * (1.0f - this.storyViewer.getProgressToSelfViews());
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode;
        float fDp;
        if (view == this.mentionContainer) {
            canvas.save();
            canvas.clipRect(0.0f, this.mentionContainer.getY(), getMeasuredWidth(), this.mentionContainer.getY() + this.mentionContainer.getMeasuredHeight());
            boolean zDrawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return zDrawChild;
        }
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (view == chatActivityEnterView) {
            if (this.progressToKeyboard > 0.0f && !this.currentStory.isLive) {
                this.sharedResources.dimPaint.setAlpha((int) (this.progressToKeyboard * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.sharedResources.dimPaint);
            }
            this.sharedResources.rect1.set(this.chatActivityEnterView.getX(), this.chatActivityEnterView.getY() + this.chatActivityEnterView.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.chatActivityEnterView.getX() + this.chatActivityEnterView.getMeasuredWidth(), this.chatActivityEnterView.getY() + this.chatActivityEnterView.getMeasuredHeight());
            float fDp2 = AndroidUtilities.dp(40.0f);
            if (!this.currentStory.isLive) {
                if (this.allowShare) {
                    fDp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.allowRepost && this.isChannel) {
                    fDp2 += AndroidUtilities.dp(46.0f);
                }
                FrameLayout frameLayout = this.likeButtonContainer;
                if (frameLayout != null && frameLayout.getVisibility() == 0) {
                    fDp2 = (fDp2 - AndroidUtilities.dp(40.0f)) + this.likeButtonContainer.getLayoutParams().width;
                }
                fDp = 0.0f;
            } else {
                fDp = AndroidUtilities.dp(46.0f);
                fDp2 = AndroidUtilities.dp(46.0f);
                MuteButton muteButton = this.muteButton;
                if (muteButton != null && muteButton.getVisibility() == 0) {
                    fDp2 += AndroidUtilities.dp(46.0f);
                }
            }
            this.sharedResources.rect2.set(AndroidUtilities.dp(10.0f) + fDp, ((this.chatActivityEnterView.getY() + this.chatActivityEnterView.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - fDp2, (this.chatActivityEnterView.getY() + this.chatActivityEnterView.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.chatActivityEnterView.setTranslationX(fDp * (1.0f - this.progressToKeyboard));
            this.chatActivityEnterView.getEditField().setTranslationY((this.chatActivityEnterView.getMeasuredHeight() > AndroidUtilities.dp(50.0f) ? 0.0f + ((1.0f - this.progressToKeyboard) * (this.chatActivityEnterView.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) : 0.0f) + ((-AndroidUtilities.dp(2.0f)) * (1.0f - this.progressToKeyboard)));
            float fDp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(this.sharedResources.rect2, this.sharedResources.rect1, this.progressToKeyboard, this.sharedResources.finalRect);
            BlurredBackgroundDrawable blurredBackgroundDrawable = this.inputFieldBackground;
            if (blurredBackgroundDrawable != null) {
                blurredBackgroundDrawable.setBounds((int) this.sharedResources.finalRect.left, (int) this.sharedResources.finalRect.top, (int) this.sharedResources.finalRect.right, (int) this.sharedResources.finalRect.bottom);
                this.inputFieldBackground.setRadius(fDp3);
                this.inputFieldBackground.setAlpha((int) ((1.0f - this.progressToDismiss) * 255.0f * getHideInterfaceAlpha() * (1.0f - this.outT)));
                this.inputFieldBackground.draw(canvas);
            } else {
                canvas.drawRoundRect(this.sharedResources.finalRect, fDp3, fDp3, this.inputBackgroundPaint);
            }
            if (this.progressToKeyboard < 0.5f) {
                canvas.save();
                canvas.clipRect(this.sharedResources.finalRect);
                boolean zDrawChild2 = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild2;
            }
        } else {
            if (chatActivityEnterView != null && chatActivityEnterView.isPopupView(view)) {
                float fDp4 = AndroidUtilities.dp(30.0f);
                this.sharedResources.popupRect.set(0.0f, view.getY() + AndroidUtilities.dp(1.0f), getWidth(), getHeight() + AndroidUtilities.dp(20.0f));
                this.clipPath.rewind();
                this.clipPath.addRoundRect(this.sharedResources.popupRect, fDp4, fDp4, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(this.clipPath);
                BlurredBackgroundDrawable blurredBackgroundDrawable2 = this.emojiKeyboardBackground;
                if (blurredBackgroundDrawable2 != null) {
                    blurredBackgroundDrawable2.setBounds((int) this.sharedResources.popupRect.left, (int) this.sharedResources.popupRect.top, (int) this.sharedResources.popupRect.right, (int) this.sharedResources.popupRect.bottom);
                    this.emojiKeyboardBackground.setRadius(fDp4, fDp4, fDp4, fDp4);
                    this.emojiKeyboardBackground.setAlpha(255);
                    this.emojiKeyboardBackground.draw(canvas);
                } else {
                    canvas.drawRoundRect(this.sharedResources.popupRect, fDp4, fDp4, this.inputBackgroundPaint);
                }
                boolean zDrawChild3 = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild3;
            }
            if (view == this.reactionsContainerLayout && this.chatActivityEnterView != null) {
                view.setTranslationY(((-r0.getMeasuredHeight()) + (this.chatActivityEnterView.getY() + this.chatActivityEnterView.getAnimatedTop())) - AndroidUtilities.dp(18.0f));
            } else {
                if (view == this.likesReactionLayout) {
                    view.setTranslationY((((-(r0.getMeasuredHeight() - this.likesReactionLayout.getPaddingBottom())) + this.likeButtonContainer.getY()) + this.bottomActionsLinearLayout.getY()) - AndroidUtilities.dp(18.0f));
                } else if (view == this.storyContainer && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (blurredBackgroundSourceRenderNode = this.blurredBackgroundSourceRenderNodeWithSaturation) != null && !blurredBackgroundSourceRenderNode.inRecording()) {
                    RecordingCanvas recordingCanvasBeginRecording = this.blurredBackgroundSourceRenderNodeWithSaturation.beginRecording(getMeasuredWidth(), getMeasuredHeight());
                    recordingCanvasBeginRecording.drawColor(ColorUtils.blendARGB(-16777216, -1, 0.2f));
                    recordingCanvasBeginRecording.translate(this.storyContainer.getX(), this.storyContainer.getY());
                    view.draw(recordingCanvasBeginRecording);
                    this.blurredBackgroundSourceRenderNodeWithSaturation.endRecording();
                }
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public void checkInstantCameraView() {
        if (this.instantCameraView == null && CameraView.isCameraAllowed()) {
            this.instantCameraView = new InstantCameraView(getContext(), new InstantCameraView.Delegate() {
                @Override
                public boolean isInScheduleMode() {
                    return InstantCameraView.Delegate.CC.$default$isInScheduleMode(this);
                }

                @Override
                public boolean isSecretChat() {
                    return InstantCameraView.Delegate.CC.$default$isSecretChat(this);
                }

                @Override
                public View getFragmentView() {
                    return PeerStoriesView.this;
                }

                @Override
                public void sendMedia(MediaController.PhotoEntry photoEntry, VideoEditedInfo videoEditedInfo, boolean z, int i, int i2, boolean z2, long j) {
                    if (photoEntry == null) {
                        return;
                    }
                    PeerStoriesView peerStoriesView = PeerStoriesView.this;
                    TL_stories.StoryItem storyItem = peerStoriesView.currentStory.storyItem;
                    if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
                        return;
                    }
                    storyItem.dialogId = peerStoriesView.dialogId;
                    if (photoEntry.isVideo) {
                        if (videoEditedInfo != null) {
                            SendMessagesHelper.prepareSendingVideo(PeerStoriesView.this.getAccountInstance(), photoEntry.path, videoEditedInfo, null, null, PeerStoriesView.this.dialogId, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z, i, i2, z2, photoEntry.hasSpoiler, photoEntry.caption, null, 0, 0L, j);
                        } else {
                            SendMessagesHelper.prepareSendingVideo(PeerStoriesView.this.getAccountInstance(), photoEntry.path, null, null, null, PeerStoriesView.this.dialogId, null, null, storyItem, null, photoEntry.entities, photoEntry.ttl, null, z, i, i2, z2, photoEntry.hasSpoiler, photoEntry.caption, null, 0, 0L, j);
                        }
                    } else if (photoEntry.imagePath != null) {
                        SendMessagesHelper.prepareSendingPhoto(PeerStoriesView.this.getAccountInstance(), photoEntry.imagePath, photoEntry.thumbPath, null, PeerStoriesView.this.dialogId, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z, i, i2, z2, photoEntry.caption, null, 0, 0L, j);
                    } else if (photoEntry.path != null) {
                        SendMessagesHelper.prepareSendingPhoto(PeerStoriesView.this.getAccountInstance(), photoEntry.path, photoEntry.thumbPath, null, PeerStoriesView.this.dialogId, null, null, storyItem, null, photoEntry.entities, photoEntry.stickers, null, photoEntry.ttl, null, videoEditedInfo, z, i, i2, z2, photoEntry.caption, null, 0, 0L, j);
                    }
                    PeerStoriesView.this.afterMessageSend(j <= 0);
                }

                @Override
                public Activity getParentActivity() {
                    return AndroidUtilities.findActivity(PeerStoriesView.this.getContext());
                }

                @Override
                public int getClassGuid() {
                    return PeerStoriesView.this.classGuid;
                }

                @Override
                public long getDialogId() {
                    return PeerStoriesView.this.dialogId;
                }
            }, this.resourcesProvider, false);
            addView(this.instantCameraView, Math.min(indexOfChild(this.chatActivityEnterView.getRecordCircle()), indexOfChild(this.chatActivityEnterView.controlsView)), LayoutHelper.createFrame(-1, -1, 51));
        }
    }

    public void afterMessageSend(boolean z) {
        BulletinFactory bulletinFactoryOf;
        InstantCameraView instantCameraView = this.instantCameraView;
        if (instantCameraView != null) {
            instantCameraView.resetCameraFile();
            this.instantCameraView.cancel(false);
        }
        this.storyViewer.clearDraft(this.dialogId, this.currentStory.storyItem);
        this.messageSent = true;
        this.storyViewer.closeKeyboardOrEmoji();
        if (z && (bulletinFactoryOf = BulletinFactory.of(this.storyContainer, this.resourcesProvider)) != null) {
            bulletinFactoryOf.createSimpleBulletin(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.openChat();
                }
            }).hideAfterBottomSheet(false).show(false);
        }
        MessagesController.getInstance(this.currentAccount).ensureMessagesLoaded(this.dialogId, 0, null);
    }

    public void openChat() {
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

    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.currentAccount);
    }

    public static class VideoPlayerSharedScope {
        public boolean firstFrameRendered;
        public LivePlayer livePlayer;
        public StoryViewer.VideoPlayerHolder player;
        public View renderView;
        public SurfaceView surfaceView;
        public TextureView textureView;
        public ArrayList viewsToInvalidate = new ArrayList();

        public void invalidate() {
            for (int i = 0; i < this.viewsToInvalidate.size(); i++) {
                ((View) this.viewsToInvalidate.get(i)).invalidate();
            }
        }

        public boolean isBuffering() {
            StoryViewer.VideoPlayerHolder videoPlayerHolder = this.player;
            return videoPlayerHolder != null && videoPlayerHolder.isBuffering();
        }
    }

    void checkReactionsLayout() {
        if (this.reactionsContainerLayout == null) {
            ReactionsContainerLayout reactionsContainerLayout = new ReactionsContainerLayout(1, LaunchActivity.getLastFragment(), getContext(), this.currentAccount, new WrappedResourceProvider(this.resourcesProvider) {
                @Override
                public void appendColors() {
                    this.sparseIntArray.put(Theme.key_chat_emojiPanelBackground, ColorUtils.setAlphaComponent(-1, 30));
                }
            });
            this.reactionsContainerLayout = reactionsContainerLayout;
            reactionsContainerLayout.setHint(LocaleController.getString(this.isGroup ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
            ReactionsContainerLayout reactionsContainerLayout2 = this.reactionsContainerLayout;
            reactionsContainerLayout2.skipEnterAnimation = true;
            addView(reactionsContainerLayout2, this.reactionsContainerIndex, LayoutHelper.createFrame(-2, 72.0f, 49, 0.0f, 0.0f, 0.0f, 64.0f));
            this.reactionsContainerLayout.setDelegate(new AnonymousClass38());
            this.reactionsContainerLayout.setMessage(null, null, true);
        }
        this.reactionsContainerLayout.setFragment(LaunchActivity.getLastFragment());
        this.reactionsContainerLayout.setHint(LocaleController.getString(this.isGroup ? R.string.StoryGroupReactionsHint : R.string.StoryReactionsHint));
    }

    class AnonymousClass38 implements ReactionsContainerLayout.ReactionsContainerDelegate {
        @Override
        public boolean allowLongPress() {
            return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$allowLongPress(this);
        }

        @Override
        public boolean drawBackground() {
            return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$drawBackground(this);
        }

        AnonymousClass38() {
        }

        @Override
        public void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
            onReactionClickedInternal(view, visibleReaction, z, z2, !z);
        }

        void onReactionClickedInternal(final View view, final ReactionsLayoutInBubble.VisibleReaction visibleReaction, final boolean z, final boolean z2, boolean z3) {
            if (z3 && PeerStoriesView.this.applyMessageToChat(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onReactionClickedInternal$0(view, visibleReaction, z, z2);
                }
            })) {
                return;
            }
            AlertsCreator.ensurePaidMessageConfirmation(PeerStoriesView.this.currentAccount, PeerStoriesView.this.dialogId, 1, new Utilities.Callback() {
                @Override
                public final void run(Object obj) throws Resources.NotFoundException {
                    this.f$0.lambda$onReactionClickedInternal$2(z, visibleReaction, view, (Long) obj);
                }
            });
        }

        public void lambda$onReactionClickedInternal$0(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
            onReactionClickedInternal(view, visibleReaction, z, z2, false);
        }

        public void lambda$onReactionClickedInternal$2(boolean z, ReactionsLayoutInBubble.VisibleReaction visibleReaction, View view, Long l) throws Resources.NotFoundException {
            ReactionsEffectOverlay reactionsEffectOverlay;
            TLRPC.Document documentFindDocument;
            if (z && visibleReaction.emojicon != null) {
                try {
                    PeerStoriesView.this.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                reactionsEffectOverlay = new ReactionsEffectOverlay(view.getContext(), null, PeerStoriesView.this.reactionsContainerLayout, null, view, r3.getMeasuredWidth() / 2.0f, PeerStoriesView.this.getMeasuredHeight() / 2.0f, visibleReaction, PeerStoriesView.this.currentAccount, 0, true);
            } else {
                reactionsEffectOverlay = new ReactionsEffectOverlay(view.getContext(), null, PeerStoriesView.this.reactionsContainerLayout, null, view, r3.getMeasuredWidth() / 2.0f, PeerStoriesView.this.getMeasuredHeight() / 2.0f, visibleReaction, PeerStoriesView.this.currentAccount, 2, true);
            }
            ReactionsEffectOverlay.currentOverlay = reactionsEffectOverlay;
            reactionsEffectOverlay.windowView.setTag(R.id.parent_tag, 1);
            PeerStoriesView.this.addView(reactionsEffectOverlay.windowView);
            reactionsEffectOverlay.started = true;
            reactionsEffectOverlay.startTime = System.currentTimeMillis();
            if (visibleReaction.emojicon != null) {
                documentFindDocument = MediaDataController.getInstance(PeerStoriesView.this.currentAccount).getEmojiAnimatedSticker(visibleReaction.emojicon);
                SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(visibleReaction.emojicon, PeerStoriesView.this.dialogId);
                sendMessageParamsOf.replyToStoryItem = PeerStoriesView.this.currentStory.storyItem;
                sendMessageParamsOf.payStars = l.longValue();
                SendMessagesHelper.getInstance(PeerStoriesView.this.currentAccount).sendMessage(sendMessageParamsOf);
            } else {
                documentFindDocument = AnimatedEmojiDrawable.findDocument(PeerStoriesView.this.currentAccount, visibleReaction.documentId);
                String strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(documentFindDocument, null);
                if (strFindAnimatedEmojiEmoticon != null) {
                    SendMessagesHelper.SendMessageParams sendMessageParamsOf2 = SendMessagesHelper.SendMessageParams.of(strFindAnimatedEmojiEmoticon, PeerStoriesView.this.dialogId);
                    sendMessageParamsOf2.entities = new ArrayList<>();
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.document_id = visibleReaction.documentId;
                    tL_messageEntityCustomEmoji.offset = 0;
                    tL_messageEntityCustomEmoji.length = strFindAnimatedEmojiEmoticon.length();
                    sendMessageParamsOf2.entities.add(tL_messageEntityCustomEmoji);
                    sendMessageParamsOf2.replyToStoryItem = PeerStoriesView.this.currentStory.storyItem;
                    sendMessageParamsOf2.payStars = l.longValue();
                    SendMessagesHelper.getInstance(PeerStoriesView.this.currentAccount).sendMessage(sendMessageParamsOf2);
                } else {
                    if (PeerStoriesView.this.reactionsContainerLayout.getReactionsWindow() != null) {
                        PeerStoriesView.this.reactionsContainerLayout.getReactionsWindow().dismissWithAlpha();
                    }
                    PeerStoriesView.this.closeKeyboardOrEmoji();
                    return;
                }
            }
            if (l.longValue() <= 0) {
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                BulletinFactory.of(peerStoriesView.storyContainer, peerStoriesView.resourcesProvider).createEmojiBulletin(documentFindDocument, LocaleController.getString(R.string.ReactionSent), LocaleController.getString(R.string.ViewInChat), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onReactionClickedInternal$1();
                    }
                }).setDuration(5000).show();
            }
            if (PeerStoriesView.this.reactionsContainerLayout.getReactionsWindow() != null) {
                PeerStoriesView.this.reactionsContainerLayout.getReactionsWindow().dismissWithAlpha();
            }
            PeerStoriesView.this.closeKeyboardOrEmoji();
        }

        public void lambda$onReactionClickedInternal$1() {
            PeerStoriesView.this.openChat();
        }

        @Override
        public void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
            float f4 = -f2;
            float f5 = -f3;
            PeerStoriesView.this.bitmapShaderTools.setBounds(f4, f5, PeerStoriesView.this.getMeasuredWidth() + f4, PeerStoriesView.this.getMeasuredHeight() + f5);
            if (f > 0.0f) {
                canvas.drawRoundRect(rectF, f, f, PeerStoriesView.this.bitmapShaderTools.paint);
                canvas.drawRoundRect(rectF, f, f, PeerStoriesView.this.inputBackgroundPaint);
            } else {
                canvas.drawRect(rectF, PeerStoriesView.this.bitmapShaderTools.paint);
                canvas.drawRect(rectF, PeerStoriesView.this.inputBackgroundPaint);
            }
        }

        @Override
        public boolean needEnterText() {
            return PeerStoriesView.this.needEnterText();
        }

        @Override
        public void onEmojiWindowDismissed() {
            PeerStoriesView.this.delegate.requestAdjust(false);
        }
    }

    void checkReactionsLayoutForLike() {
        ReactionsContainerLayout reactionsContainerLayout = this.likesReactionLayout;
        if (reactionsContainerLayout == null) {
            ReactionsContainerLayout reactionsContainerLayout2 = new ReactionsContainerLayout(2, LaunchActivity.getLastFragment(), getContext(), this.currentAccount, new WrappedResourceProvider(this.resourcesProvider) {
                @Override
                public void appendColors() {
                    this.sparseIntArray.put(Theme.key_chat_emojiPanelBackground, ColorUtils.setAlphaComponent(-1, 30));
                }
            });
            this.likesReactionLayout = reactionsContainerLayout2;
            reactionsContainerLayout2.setPadding(0, 0, 0, AndroidUtilities.dp(22.0f));
            addView(this.likesReactionLayout, getChildCount() - 1, LayoutHelper.createFrame(-2, 74.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
            this.likesReactionLayout.setVisibility(8);
            this.likesReactionLayout.setDelegate(new AnonymousClass40());
            this.likesReactionLayout.setMessage(null, null, true);
        } else {
            bringChildToFront(reactionsContainerLayout);
            this.likesReactionLayout.reset();
        }
        this.likesReactionLayout.setFragment(LaunchActivity.getLastFragment());
    }

    class AnonymousClass40 implements ReactionsContainerLayout.ReactionsContainerDelegate {
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
        public void onEmojiWindowDismissed() {
            ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$onEmojiWindowDismissed(this);
        }

        AnonymousClass40() {
        }

        @Override
        public void onReactionClicked(final View view, final ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onReactionClicked$1(visibleReaction, view);
                }
            };
            if (!z) {
                PeerStoriesView.this.applyMessageToChat(runnable);
            } else {
                runnable.run();
            }
        }

        public void lambda$onReactionClicked$1(ReactionsLayoutInBubble.VisibleReaction visibleReaction, View view) {
            TLRPC.TL_availableReaction tL_availableReaction;
            PeerStoriesView.this.movingReaction = true;
            final boolean[] zArr = {false};
            final StoriesLikeButton storiesLikeButton = PeerStoriesView.this.storiesLikeButton;
            storiesLikeButton.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    AndroidUtilities.removeFromParent(storiesLikeButton);
                }
            }).setDuration(150L).start();
            int iDp = AndroidUtilities.dp(8.0f);
            PeerStoriesView.this.storiesLikeButton = new StoriesLikeButton(PeerStoriesView.this.getContext(), PeerStoriesView.this.sharedResources);
            PeerStoriesView.this.storiesLikeButton.setPadding(iDp, iDp, iDp, iDp);
            PeerStoriesView.this.likeButtonContainer.addView(PeerStoriesView.this.storiesLikeButton, LayoutHelper.createFrame(40, 40, 3));
            if (PeerStoriesView.this.reactionMoveDrawable != null) {
                PeerStoriesView.this.reactionMoveDrawable.removeView(PeerStoriesView.this);
                PeerStoriesView.this.reactionMoveDrawable = null;
            }
            if (PeerStoriesView.this.emojiReactionEffect != null) {
                PeerStoriesView.this.emojiReactionEffect.removeView(PeerStoriesView.this);
                PeerStoriesView.this.emojiReactionEffect = null;
            }
            PeerStoriesView.this.drawAnimatedEmojiAsMovingReaction = false;
            if (visibleReaction.documentId != 0) {
                PeerStoriesView.this.drawAnimatedEmojiAsMovingReaction = true;
                PeerStoriesView.this.reactionMoveDrawable = new AnimatedEmojiDrawable(2, PeerStoriesView.this.currentAccount, visibleReaction.documentId);
                PeerStoriesView.this.reactionMoveDrawable.addView(PeerStoriesView.this);
            } else if (visibleReaction.emojicon != null && (tL_availableReaction = MediaDataController.getInstance(PeerStoriesView.this.currentAccount).getReactionsMap().get(visibleReaction.emojicon)) != null) {
                PeerStoriesView.this.reactionMoveImageReceiver.setImage(null, null, ImageLocation.getForDocument(tL_availableReaction.select_animation), "60_60", null, null, null, 0L, null, null, 0);
                PeerStoriesView.this.reactionEffectImageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.around_animation), ReactionsEffectOverlay.getFilterForAroundAnimation(), null, null, null, 0);
                if (PeerStoriesView.this.reactionEffectImageReceiver.getLottieAnimation() != null) {
                    PeerStoriesView.this.reactionEffectImageReceiver.getLottieAnimation().setCurrentFrame(0, false, true);
                }
            }
            PeerStoriesView.this.storiesLikeButton.setReaction(visibleReaction);
            PeerStoriesView peerStoriesView = PeerStoriesView.this;
            if (peerStoriesView.isChannel) {
                TL_stories.StoryItem storyItem = peerStoriesView.currentStory.storyItem;
                if (storyItem.sent_reaction == null) {
                    if (storyItem.views == null) {
                        storyItem.views = new TL_stories.TL_storyViews();
                    }
                    TL_stories.StoryItem storyItem2 = PeerStoriesView.this.currentStory.storyItem;
                    TL_stories.StoryViews storyViews = storyItem2.views;
                    storyViews.reactions_count++;
                    ReactionsUtils.applyForStoryViews(null, storyItem2.sent_reaction, storyViews);
                    PeerStoriesView.this.updateUserViews(true);
                }
            }
            if (visibleReaction.documentId != 0 && PeerStoriesView.this.storiesLikeButton.emojiDrawable != null) {
                PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                peerStoriesView2.emojiReactionEffect = AnimatedEmojiEffect.createFrom(peerStoriesView2.storiesLikeButton.emojiDrawable, false, true);
                PeerStoriesView.this.emojiReactionEffect.setView(PeerStoriesView.this);
            }
            PeerStoriesView peerStoriesView3 = PeerStoriesView.this;
            peerStoriesView3.storiesController.setStoryReaction(peerStoriesView3.dialogId, PeerStoriesView.this.currentStory.storyItem, visibleReaction);
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            PeerStoriesView.this.getLocationInWindow(iArr2);
            PeerStoriesView.this.movingReactionFromX = iArr[0] - iArr2[0];
            PeerStoriesView.this.movingReactionFromY = iArr[1] - iArr2[1];
            PeerStoriesView.this.movingReactionFromSize = view.getMeasuredHeight();
            final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            PeerStoriesView.this.movingReactionProgress = 0.0f;
            PeerStoriesView.this.invalidate();
            final StoriesLikeButton storiesLikeButton2 = PeerStoriesView.this.storiesLikeButton;
            storiesLikeButton2.setAllowDrawReaction(false);
            storiesLikeButton2.prepareAnimateReaction(visibleReaction);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$onReactionClicked$0(valueAnimatorOfFloat, zArr, valueAnimator);
                }
            });
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    PeerStoriesView.this.movingReaction = false;
                    PeerStoriesView.this.movingReactionProgress = 1.0f;
                    PeerStoriesView.this.invalidate();
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        PeerStoriesView.this.drawReactionEffect = true;
                        try {
                            PeerStoriesView.this.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    storiesLikeButton2.setAllowDrawReaction(true);
                    storiesLikeButton2.animateVisibleReaction();
                    if (PeerStoriesView.this.reactionMoveDrawable != null) {
                        PeerStoriesView.this.reactionMoveDrawable.removeView(PeerStoriesView.this);
                        PeerStoriesView.this.reactionMoveDrawable = null;
                    }
                }
            });
            valueAnimatorOfFloat.setDuration(220L);
            valueAnimatorOfFloat.start();
            PeerStoriesView.this.showLikesReaction(false);
        }

        public void lambda$onReactionClicked$0(ValueAnimator valueAnimator, boolean[] zArr, ValueAnimator valueAnimator2) {
            PeerStoriesView.this.movingReactionProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            PeerStoriesView.this.invalidate();
            if (PeerStoriesView.this.movingReactionProgress <= 0.8f || zArr[0]) {
                return;
            }
            zArr[0] = true;
            PeerStoriesView.this.drawReactionEffect = true;
            try {
                PeerStoriesView.this.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }

        @Override
        public boolean needEnterText() {
            PeerStoriesView.this.delegate.requestAdjust(false);
            return false;
        }
    }

    public boolean needEnterText() throws Resources.NotFoundException {
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView == null) {
            return false;
        }
        boolean zIsKeyboardVisible = chatActivityEnterView.isKeyboardVisible();
        if (zIsKeyboardVisible) {
            this.chatActivityEnterView.showEmojiView();
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$needEnterText$54();
            }
        }, 300L);
        return zIsKeyboardVisible;
    }

    public void lambda$needEnterText$54() {
        this.delegate.requestAdjust(true);
    }

    public void setViewsThumbImageReceiver(float f, float f2, float f3, SelfStoriesPreviewView.ImageHolder imageHolder) {
        this.viewsThumbAlpha = f;
        this.viewsThumbScale = 1.0f / f2;
        this.viewsThumbPivotY = f3;
        if (this.viewsThumbImageReceiver == imageHolder) {
            return;
        }
        this.viewsThumbImageReceiver = imageHolder;
        if (imageHolder == null || imageHolder.receiver.getBitmap() == null) {
            return;
        }
        this.imageReceiver.updateStaticDrawableThump(imageHolder.receiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
    }

    public static class SharedResources {
        public final Paint barPaint;
        private final Drawable bottomOverlayGradient;
        public Drawable deleteDrawable;
        private final Paint gradientBackgroundPaint;
        public final Drawable imageBackgroundDrawable;
        public Drawable likeDrawable;
        public Drawable likeDrawableFilled;
        public RLottieDrawable muteDrawable;
        public RLottieDrawable noSoundDrawable;
        public Drawable optionsDrawable;
        public Drawable pipDrawable;
        public Drawable repostDrawable;
        public final Paint selectedBarPaint;
        public Drawable shareDrawable;
        private final Drawable topOverlayGradient;
        public final BitmapShaderTools bitmapShaderTools = new BitmapShaderTools();
        private final RectF rect1 = new RectF();
        private final RectF rect2 = new RectF();
        private final RectF finalRect = new RectF();
        private final RectF borderRect = new RectF();
        private final RectF popupRect = new RectF();
        private final Paint dimPaint = new Paint();

        SharedResources(Context context) {
            this.shareDrawable = ContextCompat.getDrawable(context, R.drawable.media_share);
            this.likeDrawable = ContextCompat.getDrawable(context, R.drawable.media_like);
            this.repostDrawable = ContextCompat.getDrawable(context, R.drawable.media_repost);
            Drawable drawable = ContextCompat.getDrawable(context, R.drawable.media_like_active);
            this.likeDrawableFilled = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
            this.optionsDrawable = ContextCompat.getDrawable(context, R.drawable.media_more);
            this.pipDrawable = ContextCompat.getDrawable(context, R.drawable.menu_stream_pip);
            this.deleteDrawable = ContextCompat.getDrawable(context, R.drawable.msg_delete);
            int i = R.raw.media_mute_unmute;
            this.muteDrawable = new RLottieDrawable(i, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.noSoundDrawable = rLottieDrawable;
            rLottieDrawable.setCurrentFrame(20, false, true);
            this.noSoundDrawable.stop();
            Paint paint = new Paint(1);
            this.barPaint = paint;
            paint.setColor(1442840575);
            Paint paint2 = new Paint(1);
            this.selectedBarPaint = paint2;
            paint2.setColor(-1);
            int alphaComponent = ColorUtils.setAlphaComponent(-16777216, 102);
            this.topOverlayGradient = ContextCompat.getDrawable(context, R.drawable.shadow_story_top);
            this.bottomOverlayGradient = ContextCompat.getDrawable(context, R.drawable.shadow_story_bottom);
            Paint paint3 = new Paint();
            this.gradientBackgroundPaint = paint3;
            paint3.setColor(alphaComponent);
            this.imageBackgroundDrawable = new ColorDrawable(ColorUtils.blendARGB(-16777216, -1, 0.1f));
        }

        public void setIconMuted(boolean z, boolean z2) {
            if (!z2) {
                this.muteDrawable.setCurrentFrame(z ? 20 : 0, false);
                this.muteDrawable.setCustomEndFrame(z ? 20 : 0);
                return;
            }
            if (z) {
                if (this.muteDrawable.getCurrentFrame() > 20) {
                    this.muteDrawable.setCurrentFrame(0, false);
                }
                this.muteDrawable.setCustomEndFrame(20);
                this.muteDrawable.start();
                return;
            }
            if (this.muteDrawable.getCurrentFrame() == 0 || this.muteDrawable.getCurrentFrame() >= 43) {
                return;
            }
            this.muteDrawable.setCustomEndFrame(43);
            this.muteDrawable.start();
        }
    }

    public void editPrivacy(StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, final TL_stories.StoryItem storyItem) {
        this.delegate.showDialog(new StoryPrivacyBottomSheet(getContext(), storyItem.pinned ? Integer.MAX_VALUE : storyItem.expire_date - storyItem.date, this.resourcesProvider).setValue(storyPrivacy).enableSharing(false).isEdit(true).whenSelectedRules(new StoryPrivacyBottomSheet.DoneCallback() {
            @Override
            public final void done(StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy2, boolean z, boolean z2, boolean z3, boolean z4, TLRPC.InputPeer inputPeer, int i, Runnable runnable, Runnable runnable2) {
                this.f$0.lambda$editPrivacy$57(storyItem, storyPrivacy2, z, z2, z3, z4, inputPeer, i, runnable, runnable2);
            }
        }, false));
    }

    public void lambda$editPrivacy$57(final TL_stories.StoryItem storyItem, final StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, boolean z, boolean z2, boolean z3, boolean z4, TLRPC.InputPeer inputPeer, int i, final Runnable runnable, Runnable runnable2) {
        TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
        tL_stories_editStory.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(storyItem.dialogId);
        tL_stories_editStory.id = storyItem.id;
        tL_stories_editStory.flags |= 4;
        tL_stories_editStory.privacy_rules = storyPrivacy.rules;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_editStory, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$editPrivacy$56(runnable, storyItem, storyPrivacy, tLObject, tL_error);
            }
        });
    }

    public void lambda$editPrivacy$56(final Runnable runnable, final TL_stories.StoryItem storyItem, final StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$editPrivacy$55(runnable, tL_error, storyItem, storyPrivacy);
            }
        });
    }

    public void lambda$editPrivacy$55(Runnable runnable, TLRPC.TL_error tL_error, TL_stories.StoryItem storyItem, StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy) {
        if (runnable != null) {
            runnable.run();
        }
        if (tL_error == null || "STORY_NOT_MODIFIED".equals(tL_error.text)) {
            storyItem.parsedPrivacy = storyPrivacy;
            storyItem.privacy = storyPrivacy.toValue();
            int i = storyPrivacy.type;
            storyItem.close_friends = i == 1;
            storyItem.contacts = i == 2;
            storyItem.selected_contacts = i == 3;
            MessagesController.getInstance(this.currentAccount).getStoriesController().updateStoryItem(storyItem.dialogId, storyItem, true, true);
            this.editedPrivacy = true;
            int i2 = storyPrivacy.type;
            if (i2 == 4) {
                BulletinFactory.of(this.storyContainer, this.resourcesProvider).createSimpleBulletin(R.raw.contact_check, LocaleController.getString("StorySharedToEveryone")).show();
            } else if (i2 == 1) {
                BulletinFactory.of(this.storyContainer, this.resourcesProvider).createSimpleBulletin(R.raw.contact_check, LocaleController.getString("StorySharedToCloseFriends")).show();
            } else if (i2 == 2) {
                if (storyPrivacy.selectedUserIds.isEmpty()) {
                    BulletinFactory.of(this.storyContainer, this.resourcesProvider).createSimpleBulletin(R.raw.contact_check, LocaleController.getString("StorySharedToAllContacts")).show();
                } else {
                    BulletinFactory.of(this.storyContainer, this.resourcesProvider).createSimpleBulletin(R.raw.contact_check, LocaleController.formatPluralString("StorySharedToAllContactsExcluded", storyPrivacy.selectedUserIds.size(), new Object[0])).show();
                }
            } else if (i2 == 3) {
                HashSet hashSet = new HashSet();
                hashSet.addAll(storyPrivacy.selectedUserIds);
                Iterator it = storyPrivacy.selectedUserIdsByGroup.values().iterator();
                while (it.hasNext()) {
                    hashSet.addAll((ArrayList) it.next());
                }
                BulletinFactory.of(this.storyContainer, this.resourcesProvider).createSimpleBulletin(R.raw.contact_check, LocaleController.formatPluralString("StorySharedToContacts", hashSet.size(), new Object[0])).show();
            }
        } else {
            BulletinFactory.of(this.storyContainer, this.resourcesProvider).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.UnknownError)).show();
        }
        updatePosition();
    }

    public boolean checkRecordLocked(final boolean z) {
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView == null || !chatActivityEnterView.isRecordLocked()) {
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
        if (this.chatActivityEnterView.isInVideoMode()) {
            builder.setTitle(LocaleController.getString(R.string.DiscardVideoMessageTitle));
            builder.setMessage(LocaleController.getString(R.string.DiscardVideoMessageDescription));
        } else {
            builder.setTitle(LocaleController.getString(R.string.DiscardVoiceMessageTitle));
            builder.setMessage(LocaleController.getString(R.string.DiscardVoiceMessageDescription));
        }
        builder.setPositiveButton(LocaleController.getString(R.string.DiscardVoiceMessageAction), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$checkRecordLocked$58(z, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Continue), null);
        this.delegate.showDialog(builder.create());
        return true;
    }

    public void lambda$checkRecordLocked$58(boolean z, AlertDialog alertDialog, int i) {
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView != null) {
            if (z) {
                this.storyViewer.close(true);
            } else {
                chatActivityEnterView.cancelRecordingAudioVideo();
            }
        }
    }

    public void animateOut(final boolean z) {
        ValueAnimator valueAnimator = this.outAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.outT, z ? 1.0f : 0.0f);
        this.outAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f$0.lambda$animateOut$59(valueAnimator2);
            }
        });
        this.outAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PeerStoriesView.this.outT = z ? 1.0f : 0.0f;
                PeerStoriesView.this.headerView.setTranslationY((-AndroidUtilities.dp(8.0f)) * PeerStoriesView.this.outT);
                PeerStoriesView peerStoriesView = PeerStoriesView.this;
                peerStoriesView.headerView.setAlpha(1.0f - peerStoriesView.outT);
                PeerStoriesView.this.optionsIconView.setTranslationY((-AndroidUtilities.dp(8.0f)) * PeerStoriesView.this.outT);
                PeerStoriesView.this.optionsIconView.setAlpha(1.0f - PeerStoriesView.this.outT);
                PeerStoriesView.this.pipIconView.setTranslationY((-AndroidUtilities.dp(8.0f)) * PeerStoriesView.this.outT);
                PeerStoriesView.this.pipIconView.setAlpha(1.0f - PeerStoriesView.this.outT);
                PeerStoriesView.this.muteIconContainer.setTranslationY((-AndroidUtilities.dp(8.0f)) * PeerStoriesView.this.outT);
                PeerStoriesView.this.muteIconContainer.setAlpha(PeerStoriesView.this.muteIconViewAlpha * (1.0f - PeerStoriesView.this.outT));
                if (PeerStoriesView.this.selfView != null) {
                    PeerStoriesView.this.selfView.setTranslationY(AndroidUtilities.dp(8.0f) * PeerStoriesView.this.outT);
                    PeerStoriesView.this.selfView.setAlpha(1.0f - PeerStoriesView.this.outT);
                }
                if (PeerStoriesView.this.privacyButton != null) {
                    PeerStoriesView.this.privacyButton.setTranslationY((-AndroidUtilities.dp(8.0f)) * PeerStoriesView.this.outT);
                    PeerStoriesView.this.privacyButton.setAlpha(1.0f - PeerStoriesView.this.outT);
                }
                PeerStoriesView.this.storyCaptionView.setAlpha(1.0f - PeerStoriesView.this.outT);
                Delegate delegate = PeerStoriesView.this.delegate;
                float progressToDismiss = delegate != null ? delegate.getProgressToDismiss() : 0.0f;
                float hideInterfaceAlpha = PeerStoriesView.this.getHideInterfaceAlpha();
                if (PeerStoriesView.this.likeButtonContainer != null) {
                    PeerStoriesView.this.likeButtonContainer.setAlpha((1.0f - progressToDismiss) * hideInterfaceAlpha * (1.0f - PeerStoriesView.this.outT));
                }
                if (PeerStoriesView.this.shareButton != null) {
                    PeerStoriesView.this.shareButton.setAlpha((1.0f - progressToDismiss) * hideInterfaceAlpha * (1.0f - PeerStoriesView.this.outT));
                }
                if (PeerStoriesView.this.repostButtonContainer != null) {
                    PeerStoriesView.this.repostButtonContainer.setAlpha(hideInterfaceAlpha * (1.0f - progressToDismiss) * (1.0f - PeerStoriesView.this.outT));
                }
                PeerStoriesView peerStoriesView2 = PeerStoriesView.this;
                ChatActivityEnterView chatActivityEnterView = peerStoriesView2.chatActivityEnterView;
                if (chatActivityEnterView != null) {
                    chatActivityEnterView.setAlpha(1.0f - peerStoriesView2.outT);
                    PeerStoriesView.this.invalidate();
                }
                PeerStoriesView.this.storyContainer.invalidate();
            }
        });
        this.outAnimator.setDuration(420L);
        this.outAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.outAnimator.start();
    }

    public void lambda$animateOut$59(ValueAnimator valueAnimator) {
        this.outT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.headerView.setTranslationY((-AndroidUtilities.dp(8.0f)) * this.outT);
        this.headerView.setAlpha(1.0f - this.outT);
        this.optionsIconView.setTranslationY((-AndroidUtilities.dp(8.0f)) * this.outT);
        this.optionsIconView.setAlpha(1.0f - this.outT);
        this.pipIconView.setTranslationY((-AndroidUtilities.dp(8.0f)) * this.outT);
        this.pipIconView.setAlpha(1.0f - this.outT);
        this.muteIconContainer.setTranslationY((-AndroidUtilities.dp(8.0f)) * this.outT);
        this.muteIconContainer.setAlpha(this.muteIconViewAlpha * (1.0f - this.outT));
        FrameLayout frameLayout = this.selfView;
        if (frameLayout != null) {
            frameLayout.setTranslationY(AndroidUtilities.dp(8.0f) * this.outT);
            this.selfView.setAlpha(1.0f - this.outT);
        }
        StoryPrivacyButton storyPrivacyButton = this.privacyButton;
        if (storyPrivacyButton != null) {
            storyPrivacyButton.setTranslationY((-AndroidUtilities.dp(8.0f)) * this.outT);
            this.privacyButton.setAlpha(1.0f - this.outT);
        }
        this.storyCaptionView.setAlpha(1.0f - this.outT);
        Delegate delegate = this.delegate;
        float progressToDismiss = delegate == null ? 0.0f : delegate.getProgressToDismiss();
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        FrameLayout frameLayout2 = this.likeButtonContainer;
        if (frameLayout2 != null) {
            frameLayout2.setAlpha((1.0f - progressToDismiss) * hideInterfaceAlpha * (1.0f - this.outT));
        }
        ImageView imageView = this.shareButton;
        if (imageView != null) {
            imageView.setAlpha((1.0f - progressToDismiss) * hideInterfaceAlpha * (1.0f - this.outT));
        }
        FrameLayout frameLayout3 = this.repostButtonContainer;
        if (frameLayout3 != null) {
            frameLayout3.setAlpha(hideInterfaceAlpha * (1.0f - progressToDismiss) * (1.0f - this.outT));
        }
        ChatActivityEnterView chatActivityEnterView = this.chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.setAlpha(1.0f - this.outT);
            invalidate();
        }
        this.storyContainer.invalidate();
    }

    public int getListPosition() {
        return this.listPosition;
    }

    public StoriesController getStoriesController() {
        return MessagesController.getInstance(this.currentAccount).getStoriesController();
    }
}
