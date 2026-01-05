package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.collection.LongSparseArray;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScrollerCustom;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AuthTokensHelper;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
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
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Business.OpeningHoursActivity;
import org.telegram.ui.Business.ProfileHoursCell;
import org.telegram.ui.Business.ProfileLocationCell;
import org.telegram.ui.Cells.AboutLinkCell;
import org.telegram.ui.Cells.AnimatedStatusView;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.DividerCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.NotificationsCheckCell;
import org.telegram.ui.Cells.ProfileChannelCell;
import org.telegram.ui.Cells.SettingsSearchCell;
import org.telegram.ui.Cells.SettingsSuggestionCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextDetailCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatRightsEditActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.AudioPlayerAlert;
import org.telegram.ui.Components.AutoDeletePopupWrapper;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackButtonMenu;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CanvasButton;
import org.telegram.ui.Components.ChatActivityInterface;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.ChatNotificationsPopupWrapper;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiPacksAlert;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugController;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.InstantCameraView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.JoinGroupAlert;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.MediaActivity;
import org.telegram.ui.Components.MessagePrivateSeenView;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.Premium.ProfilePremiumCell;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.ProfileActionsView;
import org.telegram.ui.Components.ProfileGalleryBlurView;
import org.telegram.ui.Components.ProfileGalleryView;
import org.telegram.ui.Components.ProfileGooeyView;
import org.telegram.ui.Components.ProfileMusicView;
import org.telegram.ui.Components.ProfileSuggestionView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.ScamDrawable;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.StarRatingView;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.TimerDrawable;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.VectorAvatarThumbDrawable;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.ContactAddActivity;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.FilterCreateActivity;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.GroupCreateActivity;
import org.telegram.ui.MainTabsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProfileBirthdayEffect;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stars.ProfileGiftsView;
import org.telegram.ui.Stars.StarGiftPatterns;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.DualCameraView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.BotBiometry;
import org.telegram.ui.bots.BotDownloads;
import org.telegram.ui.bots.BotLocation;
import org.telegram.ui.bots.BotWebViewAttachedSheet;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;
import org.telegram.ui.bots.SetupEmojiStatusSheet;

public class ProfileActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, DialogsActivity.DialogsActivityDelegate, SharedMediaLayout.SharedMediaPreloaderDelegate, ImageUpdater.ImageUpdaterDelegate, SharedMediaLayout.Delegate, MainTabsActivity.TabFragmentDelegate {
    private Property ACTIONBAR_HEADER_PROGRESS;
    private final Property HEADER_SHADOW;
    private AboutLinkCell aboutLinkCell;
    private int actionBarAnimationColorFrom;
    private int actionBarBackgroundColor;
    private Paint actionBarBackgroundPaint;
    private ProfileActionsView actionsView;
    private final SparseIntArray adaptedColors;
    private int addMemberRow;
    private int addToContactsRow;
    private int addToGroupButtonRow;
    private int addToGroupInfoRow;
    private int additionFloatingButtonOffset;
    private int additionNavigationBarHeight;
    private int administratorsRow;
    private int affiliateRow;
    private boolean allowProfileAnimation;
    private boolean allowPullingDown;
    private AnimatedStatusView animatedStatusView;
    private ActionBarMenuItem animatingItem;
    private Runnable applyBulletin;
    private ActionBarMenuSubItem autoDeleteItem;
    TimerDrawable autoDeleteItemDrawable;
    AutoDeletePopupWrapper autoDeletePopupWrapper;
    private TLRPC.FileLocation avatar;
    private AnimatorSet avatarAnimation;
    private float avatarAnimationProgress;
    private TLRPC.FileLocation avatarBig;
    private int avatarColor;
    private FrameLayout avatarContainer;
    private FrameLayout avatarContainer2;
    private AvatarDrawable avatarDrawable;
    private ProfileGooeyView avatarGooey;
    private AvatarImageView avatarImage;
    private RadialProgressView avatarProgressView;
    private float avatarScale;
    int avatarUploadingRequest;
    private float avatarX;
    private float avatarY;
    private ProfileGalleryBlurView avatarsBlurView;
    private ProfileGalleryView avatarsViewPager;
    private PagerIndicatorView avatarsViewPagerIndicatorView;
    private float[] backwardInitialValues;
    private float backwardTransitionFromExtraHeight;
    private int balanceDividerRow;
    private long banFromGroup;
    private int bioRow;
    private ProfileBirthdayEffect birthdayEffect;
    public ProfileBirthdayEffect.BirthdayEffectFetcher birthdayFetcher;
    public int birthdayRow;
    private int bizHoursRow;
    private int bizLocationRow;
    private int blockedUsersRow;
    private View blurredView;
    private int botAppRow;
    private BotBiometry botBiometry;
    private TL_bots.BotInfo botInfo;
    private BotLocation botLocation;
    private int botPermissionBiometry;
    private int botPermissionEmojiStatus;
    private int botPermissionEmojiStatusReqId;
    private int botPermissionLocation;
    private int botPermissionsDivider;
    private int botPermissionsHeader;
    private int botStarsBalanceRow;
    private int botTonBalanceRow;
    private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[] botVerificationDrawable;
    private ButtonWithCounterView[] bottomButton;
    private ButtonWithCounterView bottomButton2;
    private FrameLayout bottomButton2Container;
    private FrameLayout[] bottomButtonContainer;
    private SpannableStringBuilder bottomButtonPostText;
    private SpannableStringBuilder bottomButtonPostTextAlbum;
    private FrameLayout bottomButtonsContainer;
    private int bottomPaddingRow;
    private int businessRow;
    private ActionBarMenuItem callItem;
    private boolean callItemVisible;
    private ImageView callToActionItem;
    private RLottieDrawable cameraDrawable;
    private boolean canSearchMembers;
    private RLottieDrawable cellCameraDrawable;
    private int channelBalanceRow;
    private int channelBalanceSectionRow;
    private int channelDividerRow;
    private int channelInfoRow;
    private int channelRow;
    private long chatId;
    private TLRPC.ChatFull chatInfo;
    private int chatRow;
    private int clearLogsRow;
    private HintView2 collectibleHint;
    private int collectibleHintBackgroundColor;
    private Boolean collectibleHintVisible;
    private TLRPC.TL_emojiStatusCollectible collectibleStatus;
    private NestedFrameLayout contentView;
    public boolean createdBirthdayFetcher;
    private boolean creatingChat;
    private CharSequence currentBio;
    private TLRPC.ChannelParticipant currentChannelParticipant;
    private TLRPC.Chat currentChat;
    private TLRPC.EncryptedChat currentEncryptedChat;
    private float currentExpanAnimatorFracture;
    private float currentExpandAnimatorValue;
    private TL_account.TL_password currentPassword;
    private float customAvatarProgress;
    private float customPhotoOffset;
    private int dataRow;
    private int debugHeaderRow;
    private int devicesRow;
    private int devicesSectionRow;
    private long dialogId;
    private boolean disableProfileAnimation;
    private boolean doNotSetForeground;
    private ActionBarMenuSubItem editColorItem;
    private ActionBarMenuItem editItem;
    private boolean editItemVisible;
    private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[] emojiStatusDrawable;
    private Long emojiStatusGiftId;
    private int emptyRow;
    private StickerEmptyView emptyView;
    private ValueAnimator expandAnimator;
    private float[] expandAnimatorValues;
    float expandNameYStartedFrom;
    float expandOnlineYStartedFrom;
    private boolean expandPhoto;
    private float expandProgress;
    private float extraHeight;
    private ImageReceiver fallbackImage;
    private int faqRow;
    private int filtersRow;
    private boolean firstLayout;
    private FlagSecureReason flagSecure;
    private boolean fragmentOpened;
    private boolean fragmentViewAttached;
    private boolean fullyVisible;
    private HintView fwdRestrictedHint;
    public ProfileGiftsView giftsView;
    private int graceSuggestionRow;
    private int graceSuggestionSectionRow;
    private boolean hasCustomPhoto;
    private boolean hasFallbackPhoto;
    private boolean hasMainTabs;
    private boolean hasVoiceChatItem;
    private AnimatorSet headerAnimatorSet;
    protected float headerShadowAlpha;
    private AnimatorSet headerShadowAnimatorSet;
    private int helpHeaderRow;
    private int helpSectionCell;
    private boolean hoursExpanded;
    private boolean hoursShownMine;
    private IBlur3Capture iBlur3Capture;
    private boolean iBlur3Invalidated;
    private final RectF iBlur3PositionActionBar;
    private final RectF iBlur3PositionMainTabs;
    private final ArrayList iBlur3Positions;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlass;
    private boolean ignoreScrollOnFullExpand;
    private ImageUpdater imageUpdater;
    private int infoAffiliateRow;
    private int infoEndRow;
    private int infoEndRowEmpty;
    private int infoHeaderRow;
    private int infoHeaderRowEmpty;
    private int infoSectionRow;
    private int infoStartRow;
    private float initialAnimationExtraHeight;
    public int initialStoryAlbum;
    private boolean invalidateScroll;
    private boolean isBot;
    private boolean isCallAvailable;
    public boolean isFragmentOpened;
    private boolean isFragmentPhoneNumber;
    private boolean isInLandscapeMode;
    private boolean[] isOnline;
    private boolean isPulledDown;
    private boolean isStarRatingVisible1;
    private boolean isTopic;
    private int joinRow;
    private boolean justFullyExpanded;
    private int languageRow;
    private float lastEmojiStatusProgress;
    private int lastMeasuredContentHeight;
    private int lastMeasuredContentWidth;
    private float lastOnlineTextViewX;
    private float lastOnlineTextViewY;
    private float lastRatingViewTranslationXOffset;
    private float lastRatingViewTranslationYOffset;
    private int lastSectionRow;
    private boolean lastStoriesIsInAlbum;
    private int lastStoriesSelectedCount;
    private LinearLayoutManager layoutManager;
    private ActionBarMenuSubItem linkItem;
    private ListAdapter listAdapter;
    private int listContentHeight;
    private RecyclerListView listView;
    private float listViewVelocityY;
    private int liteModeRow;
    private CharacterStyle loadingSpan;
    private boolean loadingUsers;
    private int locationRow;
    private Drawable lockIconDrawable;
    private AudioPlayerAlert.ClippingTextViewSwitcher mediaCounterTextView;
    private float mediaHeaderAnimationProgress;
    private boolean mediaHeaderVisible;
    private int membersEndRow;
    private int membersHeaderRow;
    private int membersSectionRow;
    private int membersStartRow;
    private long mergeDialogId;
    private int musicRow;
    private ProfileMusicView musicView;
    public boolean myProfile;
    private SimpleTextView[] nameTextView;
    private String nameTextViewRightDrawable2ContentDescription;
    private String nameTextViewRightDrawableContentDescription;
    private float nameX;
    private float nameY;
    private int navigationBarAnimationColorFrom;
    private int navigationBarHeight;
    private boolean needSendMessage;
    private boolean needStarImage;
    private boolean needTimerImage;
    private int noteRow;
    private int notificationRow;
    private int notificationsDividerRow;
    HashSet notificationsExceptionTopics;
    private int notificationsRow;
    private int notificationsSimpleRow;
    private int numberRow;
    private int numberSectionRow;
    private int onlineCount;
    private SimpleTextView[] onlineTextView;
    private float onlineX;
    private float onlineY;
    private boolean openAnimationInProgress;
    public boolean openCommonChats;
    public boolean openGifts;
    public int openGiftsCollection;
    public boolean openGiftsUpgradable;
    private boolean openSimilar;
    private boolean openedGifts;
    private boolean openingAvatar;
    private ActionBarMenuItem otherItem;
    private int overlayCountVisible;
    private OverlaysView overlaysView;
    private LongSparseArray participantsMap;
    public boolean passkeySuggestion;
    private int passwordSuggestionRow;
    private int passwordSuggestionSectionRow;
    private MessagesController.PeerColor peerColor;
    private int phoneRow;
    private int phoneSuggestionRow;
    private int phoneSuggestionSectionRow;
    float photoDescriptionProgress;
    PinchToZoomHelper pinchToZoomHelper;
    private int playProfileAnimation;
    private int policyRow;
    private HashMap positionToOffset;
    private boolean preloadedChannelEmojiStatuses;
    private final CrossfadeDrawable[] premiumCrossfadeDrawable;
    private int premiumGiftingRow;
    private int premiumRow;
    private int premiumSectionsRow;
    private final Drawable[] premiumStarDrawable;
    private ImageLocation prevLoadedImageLocation;
    ChatActivityInterface previousTransitionFragment;
    BaseFragment previousTransitionMainFragment;
    private int privacyRow;
    public ProfileChannelCell.ChannelMessageFetcher profileChannelMessageFetcher;
    boolean profileTransitionInProgress;
    private PhotoViewer.PhotoViewerProvider provider;
    private float pullUpProgress;
    private int questionRow;
    private StarRatingView ratingView;
    private boolean recreateMenuAfterAnimation;
    private Rect rect;
    private int reportDividerRow;
    private long reportReactionFromDialogId;
    private int reportReactionMessageId;
    private int reportReactionRow;
    private int reportRow;
    private boolean reportSpam;
    private Animator.AnimatorListener resetListener;
    private Theme.ResourcesProvider resourcesProvider;
    private int rowCount;
    public boolean saved;
    private MessagesController.SavedMusicList savedMusicList;
    int savedScrollOffset;
    int savedScrollPosition;
    boolean savedScrollToSharedMedia;
    private ScamDrawable scamDrawable;
    private AnimatorSet scrimAnimatorSet;
    private Paint scrimPaint;
    private View scrimView;
    private final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    private boolean scrolling;
    private SearchAdapter searchAdapter;
    private ActionBarMenuItem searchItem;
    private RecyclerListView searchListView;
    private boolean searchMode;
    private int searchTransitionOffset;
    private float searchTransitionProgress;
    private Animator searchViewTransition;
    private int secretSettingsSectionRow;
    private SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialog;
    private long selectedUser;
    private int sendLastLogsRow;
    private int sendLogsRow;
    private int sendMessageRow;
    private TextCell setAvatarCell;
    private int setAvatarRow;
    private int setAvatarSectionRow;
    private ActionBarMenuSubItem setUsernameItem;
    private int setUsernameRow;
    private int settingsKeyRow;
    private int settingsRow;
    private int settingsSectionRow;
    private int settingsSectionRow2;
    private int settingsTimerRow;
    public SharedMediaLayout sharedMediaLayout;
    private boolean sharedMediaLayoutAttached;
    private SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader;
    private int sharedMediaRow;
    private boolean showAddToContacts;
    private ShowDrawable showStatusButton;
    private ArrayList sortedUsers;
    private ImageView starBgItem;
    private ImageView starFgItem;
    private int starsRow;
    private int stickersRow;
    private ProfileStoriesView storyView;
    private int subscribersRequestsRow;
    private int subscribersRow;
    private ProfileSuggestionView suggestionView;
    private int switchBackendRow;
    private ImageView timeItem;
    private TimerDrawable timerDrawable;
    private float titleAnimationsYDiff;
    private int tonRow;
    private TopView topView;
    private long topicId;
    private boolean transitionAnimationInProress;
    private int transitionIndex;
    private View transitionOnlineText;
    private ImageView ttlIconView;
    private int unblockRow;
    private UndoView undoView;
    private ImageLocation uploadingImageLocation;
    private boolean userBlocked;
    private long userId;
    private TLRPC.UserFull userInfo;
    private int userInfoRow;
    private int usernameRow;
    private boolean usersEndReached;
    private int usersForceShowingIn;
    private String vcardFirstName;
    private String vcardLastName;
    private String vcardPhone;
    private final Drawable[] verifiedCheckDrawable;
    private final CrossfadeDrawable[] verifiedCrossfadeDrawable;
    private final Drawable[] verifiedDrawable;
    private int versionRow;
    private ActionBarMenuItem videoCallItem;
    private boolean videoCallItemVisible;
    private final ArrayList visibleChatParticipants;
    private final ArrayList visibleSortedUsers;
    private Paint whitePaint;
    private RLottieImageView writeButton;
    private AnimatorSet writeButtonAnimation;

    private int dontApplyPeerColor(int i, boolean z, Boolean bool) {
        return i;
    }

    public static void lambda$checkCanSendStoryForPosting$45(Boolean bool) {
    }

    public static void lambda$createView$21(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    @Override
    public boolean canFinishFragment() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$canFinishFragment(this);
    }

    @Override
    public boolean canSelectStories() {
        return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity);
    }

    @Override
    public void didUploadFailed() {
        ImageUpdater.ImageUpdaterDelegate.CC.$default$didUploadFailed(this);
    }

    @Override
    public PhotoViewer.PlaceProviderObject getCloseIntoObject() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$getCloseIntoObject(this);
    }

    @Override
    public String getInitialSearchString() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$getInitialSearchString(this);
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean supportsBulletin() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$supportsBulletin(this);
    }

    static int access$11312(ProfileActivity profileActivity, int i) {
        int i2 = profileActivity.listContentHeight + i;
        profileActivity.listContentHeight = i2;
        return i2;
    }

    public static void access$40400(ProfileActivity profileActivity, View view) {
        profileActivity.onTextDetailCellImageClicked(view);
    }

    public static ProfileActivity of(long j) {
        Bundle bundle = new Bundle();
        if (j >= 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        return new ProfileActivity(bundle);
    }

    public long getTopicId() {
        return this.topicId;
    }

    public static class AvatarImageView extends BackupImageView implements SizeNotifierFrameLayout.IViewWithInvalidateCallback {
        public static Property CROSSFADE_PROGRESS = new AnimationProperties.FloatProperty("crossfadeProgress") {
            @Override
            public void setValue(AvatarImageView avatarImageView, float f) {
                avatarImageView.setCrossfadeProgress(f);
            }

            @Override
            public Float get(AvatarImageView avatarImageView) {
                return Float.valueOf(avatarImageView.crossfadeProgress);
            }
        };
        private int actionsSize;
        private ImageReceiver animateFromImageReceiver;
        private float avatarScale;
        ProfileGalleryView avatarsViewPager;
        private boolean blurEnabled;
        private float blurSizeFraction;
        public float bounceScale;
        public final Path clipPath;
        private float crossfadeProgress;
        public boolean drawAvatar;
        public boolean drawForeground;
        private ImageReceiver.BitmapHolder drawableHolder;
        public float foregroundAlpha;
        public ImageReceiver foregroundImageReceiver;
        public boolean hasStories;
        private Runnable invalidateCallback;
        public boolean isMetaballWorking;
        private boolean isPulledDown;
        private final Paint placeholderPaint;
        float progressToExpand;
        private float progressToInsets;
        private final RectF rect;
        public int roundRadiusCollapse;
        private int roundRadiusExpand;

        public ChatActivityInterface getPrevFragment() {
            return null;
        }

        public void setAvatarsViewPager(ProfileGalleryView profileGalleryView) {
            this.avatarsViewPager = profileGalleryView;
        }

        public void createBlurEffect(int i) {
            this.actionsSize = i;
            this.blurEnabled = true;
        }

        public AvatarImageView(Context context) {
            super(context);
            this.isMetaballWorking = false;
            this.roundRadiusCollapse = 0;
            this.roundRadiusExpand = 0;
            this.actionsSize = 0;
            this.clipPath = new Path();
            this.rect = new RectF();
            this.drawAvatar = true;
            this.bounceScale = 1.0f;
            this.drawForeground = true;
            this.progressToInsets = 1.0f;
            this.invalidateCallback = null;
            setLayerType(2, null);
            this.foregroundImageReceiver = new ImageReceiver(this);
            Paint paint = new Paint(1);
            this.placeholderPaint = paint;
            paint.setColor(-16777216);
        }

        public void setAnimateFromImageReceiver(ImageReceiver imageReceiver) {
            this.animateFromImageReceiver = imageReceiver;
        }

        public void setCrossfadeProgress(float f) {
            this.crossfadeProgress = f;
            invalidate();
        }

        public void setForegroundImage(ImageLocation imageLocation, String str, Drawable drawable) {
            this.foregroundImageReceiver.setImage(imageLocation, str, drawable, 0L, (String) null, (Object) null, 0);
            ImageReceiver.BitmapHolder bitmapHolder = this.drawableHolder;
            if (bitmapHolder != null) {
                bitmapHolder.release();
                this.drawableHolder = null;
            }
        }

        public void setForegroundImageDrawable(ImageReceiver.BitmapHolder bitmapHolder) {
            if (bitmapHolder != null) {
                this.foregroundImageReceiver.setImageBitmap(bitmapHolder.drawable);
            }
            ImageReceiver.BitmapHolder bitmapHolder2 = this.drawableHolder;
            if (bitmapHolder2 != null) {
                bitmapHolder2.release();
                this.drawableHolder = null;
            }
            this.drawableHolder = bitmapHolder;
        }

        public float getForegroundAlpha() {
            return this.foregroundAlpha;
        }

        public void setForegroundAlpha(float f) {
            this.foregroundAlpha = f;
            invalidate();
        }

        public void clearForeground() {
            AnimatedFileDrawable animation = this.foregroundImageReceiver.getAnimation();
            if (animation != null) {
                animation.removeSecondParentView(this);
            }
            this.foregroundImageReceiver.clearImage();
            ImageReceiver.BitmapHolder bitmapHolder = this.drawableHolder;
            if (bitmapHolder != null) {
                bitmapHolder.release();
                this.drawableHolder = null;
            }
            this.foregroundAlpha = 0.0f;
            invalidate();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.foregroundImageReceiver.onDetachedFromWindow();
            ImageReceiver.BitmapHolder bitmapHolder = this.drawableHolder;
            if (bitmapHolder != null) {
                bitmapHolder.release();
                this.drawableHolder = null;
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.foregroundImageReceiver.onAttachedToWindow();
        }

        public int getRoundRadiusForExpand() {
            if (!this.blurEnabled) {
                return getRoundRadius()[0];
            }
            return this.roundRadiusExpand;
        }

        public void setRoundRadiusForExpand(int i) {
            if (!this.blurEnabled) {
                setRoundRadius(i);
            } else {
                this.roundRadiusExpand = i;
                setRoundRadius(i);
            }
        }

        public void setBlurRadiusProgressForExpand(float f, float f2, boolean z) {
            this.blurSizeFraction = f;
            this.avatarScale = f2;
            this.isPulledDown = z;
        }

        public void setRoundRadiusCollapse(int i) {
            this.isMetaballWorking = true;
            int i2 = this.roundRadiusCollapse;
            this.roundRadiusCollapse = i;
            if (i2 != i) {
                super.invalidate();
            }
        }

        @Override
        public void setRoundRadius(int i) {
            super.setRoundRadius(i);
            this.foregroundImageReceiver.setRoundRadius(i);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            ProfileGalleryBlurView blurDrawer;
            ProfileGalleryBlurView profileGalleryBlurView;
            float f;
            float f2;
            float f3;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            ProfileGalleryView profileGalleryView = this.avatarsViewPager;
            boolean z = true;
            boolean z2 = profileGalleryView != null && profileGalleryView.getVisibility() == 0 && this.blurEnabled && this.blurSizeFraction > 0.0f;
            if (z2) {
                blurDrawer = this.avatarsViewPager.getBlurDrawer();
                if (blurDrawer == null) {
                    z = false;
                }
            } else {
                z = z2;
                blurDrawer = null;
            }
            float fDpf2 = (this.hasStories ? (int) AndroidUtilities.dpf2(3.5f) : 0.0f) * (1.0f - this.progressToExpand) * this.progressToInsets * (1.0f - this.foregroundAlpha);
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            ImageReceiver imageReceiver = animatedEmojiDrawable != null ? animatedEmojiDrawable.getImageReceiver() : this.imageReceiver;
            int i = this.roundRadiusExpand;
            if (i > 0) {
                this.clipPath.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(fDpf2, fDpf2, measuredWidth - fDpf2, measuredHeight - fDpf2);
                float f4 = i;
                this.clipPath.addRoundRect(rectF, f4, f4, Path.Direction.CW);
                canvas.clipPath(this.clipPath);
            }
            canvas.save();
            float f5 = this.bounceScale;
            float f6 = measuredWidth;
            float f7 = measuredHeight;
            canvas.scale(f5, f5, f6 / 2.0f, f7 / 2.0f);
            if (z) {
                if (this.isPulledDown) {
                    measuredHeight = Math.min(measuredHeight, measuredWidth);
                } else {
                    measuredHeight = (int) (f7 - AndroidUtilities.lerp(0.0f, this.actionsSize / this.avatarScale, this.blurSizeFraction));
                }
            }
            ImageReceiver imageReceiver2 = this.animateFromImageReceiver;
            if (imageReceiver2 != null) {
                float f8 = this.crossfadeProgress;
                float f9 = (1.0f - f8) * 1.0f;
                if (f8 > 0.0f) {
                    float imageX = imageReceiver2.getImageX();
                    float imageY = this.animateFromImageReceiver.getImageY();
                    float imageWidth = this.animateFromImageReceiver.getImageWidth();
                    float imageHeight = this.animateFromImageReceiver.getImageHeight();
                    float alpha = this.animateFromImageReceiver.getAlpha();
                    f = f9;
                    float f10 = fDpf2 * 2.0f;
                    profileGalleryBlurView = blurDrawer;
                    this.animateFromImageReceiver.setImageCoords(fDpf2, fDpf2, f6 - f10, measuredHeight - f10);
                    this.animateFromImageReceiver.setAlpha(f8);
                    this.animateFromImageReceiver.draw(canvas);
                    this.animateFromImageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
                    this.animateFromImageReceiver.setAlpha(alpha);
                } else {
                    profileGalleryBlurView = blurDrawer;
                    f = f9;
                }
            } else {
                profileGalleryBlurView = blurDrawer;
                f = 1.0f;
            }
            if (imageReceiver != null && f > 0.0f && (this.foregroundAlpha < 1.0f || !this.drawForeground)) {
                float f11 = fDpf2 * 2.0f;
                imageReceiver.setImageCoords(fDpf2, fDpf2, f6 - f11, measuredHeight - f11);
                float alpha2 = imageReceiver.getAlpha();
                imageReceiver.setAlpha(alpha2 * f);
                if (this.drawAvatar) {
                    int i2 = imageReceiver.getRoundRadius()[0];
                    if (z) {
                        imageReceiver.setRoundRadius(0);
                    }
                    imageReceiver.draw(canvas);
                    if (z) {
                        imageReceiver.setRoundRadius(i2);
                    }
                }
                imageReceiver.setAlpha(alpha2);
            }
            if (this.foregroundAlpha > 0.0f && this.drawForeground && f > 0.0f) {
                if (this.foregroundImageReceiver.getDrawable() != null) {
                    float f12 = fDpf2 * 2.0f;
                    this.foregroundImageReceiver.setImageCoords(fDpf2, fDpf2, f6 - f12, measuredHeight - f12);
                    this.foregroundImageReceiver.setAlpha(this.foregroundAlpha * f);
                    this.foregroundImageReceiver.draw(canvas);
                } else {
                    this.rect.set(0.0f, 0.0f, f6, measuredHeight);
                    this.placeholderPaint.setAlpha((int) (this.foregroundAlpha * f * 255.0f));
                    float f13 = this.foregroundImageReceiver.getRoundRadius()[0];
                    canvas.drawRoundRect(this.rect, f13, f13, this.placeholderPaint);
                }
            }
            if (z) {
                float f14 = measuredHeight;
                canvas.translate(fDpf2, fDpf2 + f14);
                if (this.isPulledDown || profileGalleryBlurView.isUsingRenderNode() || this.avatarsViewPager.getRealPosition() == 0) {
                    f2 = 1.0f - this.blurSizeFraction;
                    f3 = 2.0f;
                } else {
                    f3 = 2.0f;
                    f2 = 1.0f;
                }
                float f15 = fDpf2 * f3;
                profileGalleryBlurView.draw(canvas, this, f6 - f15, f14 - f15, true, f2, f);
            }
            canvas.restore();
        }

        public void setProgressToStoriesInsets(float f) {
            if (f == this.progressToInsets) {
                return;
            }
            this.progressToInsets = f;
            invalidate();
        }

        public void drawForeground(boolean z) {
            this.drawForeground = z;
        }

        public void setHasStories(boolean z) {
            if (this.hasStories == z) {
                return;
            }
            this.hasStories = z;
            invalidate();
        }

        public void setProgressToExpand(float f) {
            if (this.progressToExpand == f) {
                return;
            }
            this.progressToExpand = f;
            invalidate();
        }

        @Override
        public void listenInvalidate(Runnable runnable) {
            this.invalidateCallback = runnable;
        }

        @Override
        public void invalidate() {
            super.invalidate();
            ProfileGalleryView profileGalleryView = this.avatarsViewPager;
            if (profileGalleryView != null) {
                profileGalleryView.invalidate();
            }
            Runnable runnable = this.invalidateCallback;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override
        public void invalidate(Rect rect) {
            super.invalidate(rect);
            Runnable runnable = this.invalidateCallback;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override
        public void invalidate(int i, int i2, int i3, int i4) {
            super.invalidate(i, i2, i3, i4);
            Runnable runnable = this.invalidateCallback;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private class TopView extends FrameLayout {
        public RadialGradient backgroundGradient;
        private int backgroundGradientColor1;
        private int backgroundGradientColor2;
        public final Matrix backgroundGradientMatrix;
        public float backgroundGradientRadius;
        private int backgroundGradientX;
        public float backgroundGradientY;
        private final Paint backgroundPaint;
        private Rect blurBounds;
        private int btnColor;
        public int color1;
        private final AnimatedColor color1Animated;
        public int color2;
        private final AnimatedColor color2Animated;
        private int currentColor;
        private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emoji;
        private int emojiColor;
        public final AnimatedFloat emojiFullT;
        private boolean emojiIsCollectible;
        private boolean emojiLoaded;
        public final AnimatedFloat emojiLoadedT;
        private final AnimatedFloat hasColorAnimated;
        private boolean hasColorById;
        public boolean hasEmoji;
        private Paint paint;

        public TopView(Context context) {
            super(context);
            this.paint = new Paint();
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.hasColorAnimated = new AnimatedFloat(this, 350L, cubicBezierInterpolator);
            this.color1Animated = new AnimatedColor(this, 350L, cubicBezierInterpolator);
            this.color2Animated = new AnimatedColor(this, 350L, cubicBezierInterpolator);
            this.backgroundGradientMatrix = new Matrix();
            this.backgroundPaint = new Paint(1);
            this.emoji = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, false, AndroidUtilities.dp(20.0f), 13);
            this.emojiLoadedT = new AnimatedFloat(this, 0L, 440L, cubicBezierInterpolator);
            this.emojiFullT = new AnimatedFloat(this, 0L, 440L, cubicBezierInterpolator);
            this.blurBounds = new Rect();
            setWillNotDraw(false);
        }

        @Override
        public void setBackgroundColor(int i) {
            if (i != this.currentColor) {
                this.currentColor = i;
                this.paint.setColor(i);
                invalidate();
                if (this.hasColorById) {
                    return;
                }
                ProfileActivity.this.actionBarBackgroundColor = this.currentColor;
            }
        }

        public void setBackgroundColorId(MessagesController.PeerColor peerColor, boolean z) {
            if (peerColor != null) {
                this.hasColorById = true;
                this.color1 = peerColor.getBgColor1(Theme.isCurrentThemeDark());
                int bgColor2 = peerColor.getBgColor2(Theme.isCurrentThemeDark());
                this.color2 = bgColor2;
                ProfileActivity.this.actionBarBackgroundColor = ColorUtils.blendARGB(this.color1, bgColor2, 0.25f);
                int i = peerColor.patternColor;
                if (i != 0) {
                    this.emojiColor = i;
                    this.btnColor = Theme.multAlpha(i, 0.45f);
                } else {
                    this.emojiColor = PeerColorActivity.adaptProfileEmojiColor(this.color1);
                    this.btnColor = Theme.multAlpha(PeerColorActivity.adaptProfileEmojiColor(this.color1), 0.15f);
                }
            } else {
                ProfileActivity.this.actionBarBackgroundColor = this.currentColor;
                this.hasColorById = false;
                ProfileActivity profileActivity = ProfileActivity.this;
                int i2 = Theme.key_actionBarDefault;
                if (AndroidUtilities.computePerceivedBrightness(profileActivity.getThemedColor(i2)) > 0.8f) {
                    this.emojiColor = -1;
                    this.btnColor = -1;
                } else if (AndroidUtilities.computePerceivedBrightness(ProfileActivity.this.getThemedColor(i2)) < 0.2f) {
                    this.emojiColor = Theme.multAlpha(Theme.adaptHSV(ProfileActivity.this.getThemedColor(i2), 0.02f, 0.25f), 0.5f);
                    this.btnColor = Theme.multAlpha(Theme.adaptHSV(ProfileActivity.this.getThemedColor(i2), 0.02f, 0.25f), 0.35f);
                } else {
                    this.emojiColor = PeerColorActivity.adaptProfileEmojiColor(ProfileActivity.this.getThemedColor(i2));
                    this.btnColor = Theme.multAlpha(PeerColorActivity.adaptProfileEmojiColor(ProfileActivity.this.getThemedColor(i2)), 0.15f);
                }
            }
            if (!z) {
                this.color1Animated.set(this.color1, true);
                this.color2Animated.set(this.color2, true);
            }
            invalidate();
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.emoji.attach();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.emoji.detach();
        }

        public void setBackgroundEmojiId(long j, boolean z, boolean z2) {
            this.emoji.set(j, z2);
            this.emoji.setColor(Integer.valueOf(this.emojiColor));
            this.emojiIsCollectible = z;
            if (!z2) {
                this.emojiFullT.force(z);
            }
            this.hasEmoji = this.hasEmoji || !(j == 0 || j == -1);
            invalidate();
        }

        private boolean isEmojiLoaded() {
            if (this.emojiLoaded) {
                return true;
            }
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
            if (swapAnimatedEmojiDrawable == null || !(swapAnimatedEmojiDrawable.getDrawable() instanceof AnimatedEmojiDrawable)) {
                return false;
            }
            AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) this.emoji.getDrawable();
            if (animatedEmojiDrawable.getImageReceiver() == null || !animatedEmojiDrawable.getImageReceiver().hasImageLoaded()) {
                return false;
            }
            this.emojiLoaded = true;
            return true;
        }

        private void updateBackgroundPaint() {
            int i = this.color1Animated.set(this.color1);
            int i2 = this.color2Animated.set(this.color2);
            if (ProfileActivity.this.actionsView != null) {
                ProfileActivity.this.actionsView.setActionsColor(this.btnColor, this.hasColorById);
            }
            int width = getWidth() / 2;
            if (this.backgroundGradient != null && this.backgroundGradientColor1 == i && this.backgroundGradientColor2 == i2 && this.backgroundGradientX == width) {
                return;
            }
            this.backgroundGradientRadius = AndroidUtilities.dp(96.0f) * 2;
            this.backgroundGradientY = (((((BaseFragment) ProfileActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + ActionBar.getCurrentActionBarHeight()) - (AndroidUtilities.density * 21.0f)) + ((BaseFragment) ProfileActivity.this).actionBar.getTranslationY();
            this.backgroundGradientX = width;
            float f = width;
            float f2 = this.backgroundGradientY;
            float f3 = this.backgroundGradientRadius;
            this.backgroundGradientColor2 = i2;
            this.backgroundGradientColor1 = i;
            RadialGradient radialGradient = new RadialGradient(f, f2 + (f3 / 2.0f), f3, new int[]{i2, i}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.backgroundGradient = radialGradient;
            radialGradient.setLocalMatrix(this.backgroundGradientMatrix);
            this.backgroundPaint.setShader(this.backgroundGradient);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            ActionBar actionBar;
            ActionBarMenu actionBarMenu;
            float currentActionBarHeight = ProfileActivity.this.extraHeight + ActionBar.getCurrentActionBarHeight() + (((BaseFragment) ProfileActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + ProfileActivity.this.searchTransitionOffset;
            int i = (int) ((1.0f - ProfileActivity.this.mediaHeaderAnimationProgress) * currentActionBarHeight);
            if (i != 0) {
                ChatActivityInterface chatActivityInterface = ProfileActivity.this.previousTransitionFragment;
                if (chatActivityInterface != null && chatActivityInterface.getContentView() != null) {
                    this.blurBounds.set(0, 0, getMeasuredWidth(), i);
                    if (ProfileActivity.this.previousTransitionFragment.getActionBar() != null && !ProfileActivity.this.previousTransitionFragment.getContentView().blurWasDrawn() && ProfileActivity.this.previousTransitionFragment.getActionBar().getBackground() == null) {
                        this.paint.setColor(Theme.getColor(Theme.key_actionBarDefault, ProfileActivity.this.previousTransitionFragment.getResourceProvider()));
                        canvas.drawRect(this.blurBounds, this.paint);
                    } else {
                        BaseFragment baseFragment = ProfileActivity.this.previousTransitionMainFragment;
                        if (baseFragment != null && (baseFragment instanceof DialogsActivity) && (baseFragment.getFragmentView() instanceof SizeNotifierFrameLayout)) {
                            ProfileActivity.this.previousTransitionMainFragment.getActionBar().blurScrimPaint.setColor(Theme.getColor(Theme.key_actionBarDefault, ProfileActivity.this.previousTransitionMainFragment.getResourceProvider()));
                            ((SizeNotifierFrameLayout) ProfileActivity.this.previousTransitionMainFragment.getFragmentView()).drawBlurRect(canvas, getY(), this.blurBounds, ProfileActivity.this.previousTransitionMainFragment.getActionBar().blurScrimPaint, true);
                        } else {
                            ProfileActivity.this.previousTransitionFragment.getContentView().drawBlurRect(canvas, getY(), this.blurBounds, ProfileActivity.this.previousTransitionFragment.getActionBar().blurScrimPaint, true);
                        }
                    }
                }
                this.paint.setColor(this.currentColor);
                updateBackgroundPaint();
                float f = (ProfileActivity.this.playProfileAnimation == 0 ? 1.0f : ProfileActivity.this.avatarAnimationProgress) * this.hasColorAnimated.set(this.hasColorById);
                if (f < 1.0f) {
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i, this.paint);
                }
                if (f > 0.0f) {
                    this.backgroundPaint.setAlpha((int) (f * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i, this.backgroundPaint);
                }
                if (this.hasEmoji) {
                    float f2 = this.emojiLoadedT.set(isEmojiLoaded());
                    if ((!ProfileActivity.this.openAnimationInProgress || ProfileActivity.this.playProfileAnimation != 2) && f2 > 0.0f && ProfileActivity.this.avatarContainer != null) {
                        canvas.save();
                        canvas.clipRect(0, 0, getMeasuredWidth(), i);
                        float f3 = ((BaseFragment) ProfileActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0.0f;
                        StarGiftPatterns.drawProfileAnimatedPattern(canvas, this.emoji, getMeasuredWidth(), ProfileActivity.this.getHeaderOnlyExtraHeight() + f3 + ((((BaseFragment) ProfileActivity.this).actionBar.getHeight() - f3) / 2.0f), ProfileActivity.this.calculateHeaderExtraDiff(), ProfileActivity.this.avatarContainer, 1.0f);
                        canvas.restore();
                    }
                }
                ChatActivityInterface chatActivityInterface2 = ProfileActivity.this.previousTransitionFragment;
                if (chatActivityInterface2 != null && (actionBarMenu = (actionBar = chatActivityInterface2.getActionBar()).menu) != null) {
                    int iSave = canvas.save();
                    canvas.translate(actionBar.getX() + actionBarMenu.getX(), actionBar.getY() + actionBarMenu.getY());
                    canvas.saveLayerAlpha(0.0f, 0.0f, actionBarMenu.getMeasuredWidth(), actionBarMenu.getMeasuredHeight(), (int) ((1.0f - ProfileActivity.this.avatarAnimationProgress) * 255.0f), 31);
                    actionBarMenu.draw(canvas);
                    canvas.restoreToCount(iSave);
                }
            }
            if (i != currentActionBarHeight) {
                this.paint.setColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                this.blurBounds.set(0, i, getMeasuredWidth(), (int) currentActionBarHeight);
                ProfileActivity.this.contentView.drawBlurRect(canvas, getY(), this.blurBounds, this.paint, true);
            }
            if (((BaseFragment) ProfileActivity.this).parentLayout != null) {
                ((BaseFragment) ProfileActivity.this).parentLayout.drawHeaderShadow(canvas, (int) (ProfileActivity.this.headerShadowAlpha * 255.0f), (int) currentActionBarHeight);
            }
        }
    }

    class OverlaysView extends View implements ProfileGalleryView.Callback {
        private float alpha;
        private float[] alphas;
        private final ValueAnimator animator;
        private final float[] animatorValues;
        private final Paint backgroundPaint;
        private final Paint barPaint;
        private final GradientDrawable bottomOverlayGradient;
        private final Rect bottomOverlayRect;
        private float currentAnimationValue;
        private int currentLoadingAnimationDirection;
        private float currentLoadingAnimationProgress;
        private float currentProgress;
        private boolean isOverlaysVisible;
        private long lastTime;
        private final float[] pressedOverlayAlpha;
        private final GradientDrawable[] pressedOverlayGradient;
        private final boolean[] pressedOverlayVisible;
        private int previousSelectedPotision;
        private float previousSelectedProgress;
        private final RectF rect;
        private final Paint selectedBarPaint;
        private int selectedPosition;
        private final int statusBarHeight;
        private final GradientDrawable topOverlayGradient;
        private final Rect topOverlayRect;

        public OverlaysView(Context context) {
            super(context);
            this.statusBarHeight = (!((BaseFragment) ProfileActivity.this).actionBar.getOccupyStatusBar() || ((BaseFragment) ProfileActivity.this).inBubbleMode) ? 0 : AndroidUtilities.statusBarHeight;
            this.topOverlayRect = new Rect();
            this.bottomOverlayRect = new Rect();
            this.rect = new RectF();
            this.animatorValues = new float[]{0.0f, 1.0f};
            this.pressedOverlayGradient = new GradientDrawable[2];
            this.pressedOverlayVisible = new boolean[2];
            this.pressedOverlayAlpha = new float[2];
            this.alpha = 0.0f;
            this.alphas = null;
            this.previousSelectedPotision = -1;
            this.currentLoadingAnimationDirection = 1;
            setVisibility(8);
            Paint paint = new Paint(1);
            this.barPaint = paint;
            paint.setColor(1442840575);
            Paint paint2 = new Paint(1);
            this.selectedBarPaint = paint2;
            paint2.setColor(-1);
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1107296256, 0});
            this.topOverlayGradient = gradientDrawable;
            gradientDrawable.setShape(0);
            GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1107296256, 0});
            this.bottomOverlayGradient = gradientDrawable2;
            gradientDrawable2.setShape(0);
            int i = 0;
            while (i < 2) {
                this.pressedOverlayGradient[i] = new GradientDrawable(i == 0 ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
                this.pressedOverlayGradient[i].setShape(0);
                i++;
            }
            Paint paint3 = new Paint(1);
            this.backgroundPaint = paint3;
            paint3.setColor(-16777216);
            paint3.setAlpha(66);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.animator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$new$0(valueAnimator);
                }
            });
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (OverlaysView.this.isOverlaysVisible) {
                        return;
                    }
                    OverlaysView.this.setVisibility(8);
                }

                @Override
                public void onAnimationStart(Animator animator) {
                    OverlaysView.this.setVisibility(0);
                }
            });
        }

        public void lambda$new$0(ValueAnimator valueAnimator) {
            float[] fArr = this.animatorValues;
            float animatedFraction = valueAnimator.getAnimatedFraction();
            this.currentAnimationValue = animatedFraction;
            setAlphaValue(AndroidUtilities.lerp(fArr, animatedFraction), true);
        }

        public void saveCurrentPageProgress() {
            this.previousSelectedProgress = this.currentProgress;
            this.previousSelectedPotision = this.selectedPosition;
            this.currentLoadingAnimationProgress = 0.0f;
            this.currentLoadingAnimationDirection = 1;
        }

        public void setAlphaValue(float f, boolean z) {
            int i = (int) (255.0f * f);
            this.topOverlayGradient.setAlpha(i);
            this.bottomOverlayGradient.setAlpha(i);
            this.backgroundPaint.setAlpha((int) (66.0f * f));
            this.barPaint.setAlpha((int) (85.0f * f));
            this.selectedBarPaint.setAlpha(i);
            this.alpha = f;
            if (!z) {
                this.currentAnimationValue = f;
            }
            invalidate();
        }

        public boolean isOverlaysVisible() {
            return this.isOverlaysVisible;
        }

        public void setOverlaysVisible() {
            this.isOverlaysVisible = true;
            setVisibility(0);
        }

        public void setOverlaysVisible(boolean z, float f) {
            if (z != this.isOverlaysVisible) {
                this.isOverlaysVisible = z;
                this.animator.cancel();
                float fLerp = AndroidUtilities.lerp(this.animatorValues, this.currentAnimationValue);
                if (z) {
                    this.animator.setDuration((long) (((1.0f - fLerp) * 250.0f) / f));
                } else {
                    this.animator.setDuration((long) ((250.0f * fLerp) / f));
                }
                float[] fArr = this.animatorValues;
                fArr[0] = fLerp;
                fArr[1] = z ? 1.0f : 0.0f;
                this.animator.start();
            }
        }

        @Override
        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            int currentActionBarHeight = this.statusBarHeight + ActionBar.getCurrentActionBarHeight();
            this.topOverlayRect.set(0, 0, i, (int) (currentActionBarHeight * 0.5f));
            this.bottomOverlayRect.set(0, (int) (i2 - (AndroidUtilities.dp(72.0f) * 0.5f)), i, i2);
            this.topOverlayGradient.setBounds(0, this.topOverlayRect.bottom, i, currentActionBarHeight + AndroidUtilities.dp(16.0f));
            this.bottomOverlayGradient.setBounds(0, ((i2 - ProfileActivity.this.getActionsExtraHeight()) - AndroidUtilities.dp(72.0f)) - AndroidUtilities.dp(24.0f), i, this.bottomOverlayRect.top);
            int i5 = i / 5;
            this.pressedOverlayGradient[0].setBounds(0, 0, i5, i2);
            this.pressedOverlayGradient[1].setBounds(i - i5, 0, i, i2);
        }

        @Override
        protected void onDraw(android.graphics.Canvas r23) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.OverlaysView.onDraw(android.graphics.Canvas):void");
        }

        @Override
        public void onDown(boolean z) {
            this.pressedOverlayVisible[!z ? 1 : 0] = true;
            postInvalidateOnAnimation();
        }

        @Override
        public void onRelease() {
            Arrays.fill(this.pressedOverlayVisible, false);
            postInvalidateOnAnimation();
        }

        @Override
        public void onPhotosLoaded() {
            ProfileActivity.this.updateProfileData(false);
        }

        @Override
        public void onVideoSet() {
            invalidate();
        }
    }

    class NestedFrameLayout extends SizeNotifierFrameLayout implements NestedScrollingParent3 {
        private NestedScrollingParentHelper nestedScrollingParentHelper;

        @Override
        public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        }

        @Override
        public void onStopNestedScroll(View view) {
        }

        public NestedFrameLayout(Context context) {
            super(context);
            this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        }

        @Override
        public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            try {
                if (view == ProfileActivity.this.listView && ProfileActivity.this.sharedMediaLayoutAttached) {
                    RecyclerListView currentListView = ProfileActivity.this.sharedMediaLayout.getCurrentListView();
                    if (ProfileActivity.this.sharedMediaLayout.getTop() == 0) {
                        iArr[1] = i4;
                        currentListView.scrollBy(0, i4);
                    }
                }
            } catch (Throwable th) {
                FileLog.e(th);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onNestedScroll$0();
                    }
                });
            }
        }

        public void lambda$onNestedScroll$0() {
            try {
                RecyclerListView currentListView = ProfileActivity.this.sharedMediaLayout.getCurrentListView();
                if (currentListView == null || currentListView.getAdapter() == null) {
                    return;
                }
                currentListView.getAdapter().notifyDataSetChanged();
            } catch (Throwable unused) {
            }
        }

        @Override
        public boolean onNestedPreFling(View view, float f, float f2) {
            return super.onNestedPreFling(view, f, f2);
        }

        @Override
        public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            RecyclerListView currentListView;
            int iFindFirstVisibleItemPosition;
            if (view == ProfileActivity.this.listView) {
                if (ProfileActivity.this.sharedMediaRow == -1 || !ProfileActivity.this.sharedMediaLayoutAttached) {
                    return;
                }
                boolean zIsSearchFieldVisible = ((BaseFragment) ProfileActivity.this).actionBar.isSearchFieldVisible();
                int top = ProfileActivity.this.sharedMediaLayout.getTop();
                boolean z = false;
                if (i2 >= 0) {
                    if (zIsSearchFieldVisible) {
                        RecyclerListView currentListView2 = ProfileActivity.this.sharedMediaLayout.getCurrentListView();
                        iArr[1] = i2;
                        if (top > 0) {
                            iArr[1] = 0;
                        }
                        if (currentListView2 == null || (i4 = iArr[1]) <= 0) {
                            return;
                        }
                        currentListView2.scrollBy(0, i4);
                        return;
                    }
                    return;
                }
                if (top <= 0 && (currentListView = ProfileActivity.this.sharedMediaLayout.getCurrentListView()) != null && (iFindFirstVisibleItemPosition = ((LinearLayoutManager) currentListView.getLayoutManager()).findFirstVisibleItemPosition()) != -1) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = currentListView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                    int top2 = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView.getTop() : -1;
                    int paddingTop = currentListView.getPaddingTop();
                    if (top2 != paddingTop || iFindFirstVisibleItemPosition != 0) {
                        iArr[1] = iFindFirstVisibleItemPosition != 0 ? i2 : Math.max(i2, top2 - paddingTop);
                        currentListView.scrollBy(0, i2);
                        z = true;
                    }
                }
                if (zIsSearchFieldVisible) {
                    if (!z && top < 0) {
                        iArr[1] = i2 - Math.max(top, i2);
                    } else {
                        iArr[1] = i2;
                    }
                }
            }
        }

        @Override
        public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
            return ProfileActivity.this.sharedMediaRow != -1 && i == 2;
        }

        @Override
        public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
            this.nestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i);
        }

        @Override
        public void onStopNestedScroll(View view, int i) {
            this.nestedScrollingParentHelper.onStopNestedScroll(view);
        }

        @Override
        protected void drawList(Canvas canvas, boolean z, ArrayList arrayList) {
            super.drawList(canvas, z, arrayList);
            canvas.save();
            canvas.translate(0.0f, ProfileActivity.this.listView.getY());
            ProfileActivity.this.sharedMediaLayout.drawListForBlur(canvas, arrayList);
            canvas.restore();
        }
    }

    class PagerIndicatorView extends View {
        private final PagerAdapter adapter;
        private final ValueAnimator animator;
        private final float[] animatorValues;
        private final Paint backgroundPaint;
        private final RectF indicatorRect;
        private boolean isIndicatorVisible;
        private final TextPaint textPaint;

        public PagerIndicatorView(Context context) {
            super(context);
            this.indicatorRect = new RectF();
            this.animatorValues = new float[]{0.0f, 1.0f};
            PagerAdapter adapter = ProfileActivity.this.avatarsViewPager.getAdapter();
            this.adapter = adapter;
            setVisibility(8);
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            textPaint.setColor(-1);
            textPaint.setTypeface(Typeface.SANS_SERIF);
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
            Paint paint = new Paint(1);
            this.backgroundPaint = paint;
            paint.setColor(637534208);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.animator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$new$0(valueAnimator);
                }
            });
            final boolean z = ProfileActivity.this.expandPhoto;
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (PagerIndicatorView.this.isIndicatorVisible) {
                        if (ProfileActivity.this.searchItem != null) {
                            ProfileActivity.this.searchItem.setClickable(false);
                        }
                        if (ProfileActivity.this.editItemVisible) {
                            ProfileActivity.this.editItem.setVisibility(8);
                        }
                        if (ProfileActivity.this.callItemVisible) {
                            ProfileActivity.this.callItem.setVisibility(8);
                        }
                        if (ProfileActivity.this.videoCallItemVisible) {
                            ProfileActivity.this.videoCallItem.setVisibility(8);
                        }
                    } else {
                        PagerIndicatorView.this.setVisibility(8);
                    }
                    ProfileActivity.this.updateStoriesViewBounds(false);
                }

                @Override
                public void onAnimationStart(Animator animator) {
                    if (ProfileActivity.this.searchItem != null && !z) {
                        ProfileActivity.this.searchItem.setClickable(true);
                    }
                    if (ProfileActivity.this.editItemVisible) {
                        ProfileActivity.this.editItem.setVisibility(0);
                    }
                    if (ProfileActivity.this.callItemVisible) {
                        ProfileActivity.this.callItem.setVisibility(0);
                    }
                    if (ProfileActivity.this.videoCallItemVisible) {
                        ProfileActivity.this.videoCallItem.setVisibility(0);
                    }
                    PagerIndicatorView.this.setVisibility(0);
                    ProfileActivity.this.updateStoriesViewBounds(false);
                }
            });
            ProfileActivity.this.avatarsViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                private int prevPage;

                @Override
                public void onPageScrollStateChanged(int i) {
                }

                @Override
                public void onPageScrolled(int i, float f, int i2) {
                }

                @Override
                public void onPageSelected(int i) {
                    int realPosition = ProfileActivity.this.avatarsViewPager.getRealPosition(i);
                    PagerIndicatorView.this.invalidateIndicatorRect(this.prevPage != realPosition);
                    this.prevPage = realPosition;
                    PagerIndicatorView.this.updateAvatarItems();
                }
            });
            adapter.registerDataSetObserver(new DataSetObserver() {
                @Override
                public void onChanged() {
                    int realCount = ProfileActivity.this.avatarsViewPager.getRealCount();
                    if (ProfileActivity.this.overlayCountVisible == 0 && realCount > 1 && realCount <= 20 && ProfileActivity.this.overlaysView.isOverlaysVisible()) {
                        ProfileActivity.this.overlayCountVisible = 1;
                    }
                    PagerIndicatorView.this.invalidateIndicatorRect(false);
                    PagerIndicatorView.this.refreshVisibility(1.0f);
                    PagerIndicatorView.this.updateAvatarItems();
                }
            });
        }

        public void lambda$new$0(ValueAnimator valueAnimator) {
            float fLerp = AndroidUtilities.lerp(this.animatorValues, valueAnimator.getAnimatedFraction());
            if (ProfileActivity.this.searchItem != null && !ProfileActivity.this.isPulledDown) {
                float f = 1.0f - fLerp;
                ProfileActivity.this.searchItem.setScaleX(f);
                ProfileActivity.this.searchItem.setScaleY(f);
                ProfileActivity.this.searchItem.setAlpha(f);
            }
            if (ProfileActivity.this.editItemVisible) {
                float f2 = 1.0f - fLerp;
                ProfileActivity.this.editItem.setScaleX(f2);
                ProfileActivity.this.editItem.setScaleY(f2);
                ProfileActivity.this.editItem.setAlpha(f2);
            }
            if (ProfileActivity.this.callItemVisible) {
                float f3 = 1.0f - fLerp;
                ProfileActivity.this.callItem.setScaleX(f3);
                ProfileActivity.this.callItem.setScaleY(f3);
                ProfileActivity.this.callItem.setAlpha(f3);
            }
            if (ProfileActivity.this.videoCallItemVisible) {
                float f4 = 1.0f - fLerp;
                ProfileActivity.this.videoCallItem.setScaleX(f4);
                ProfileActivity.this.videoCallItem.setScaleY(f4);
                ProfileActivity.this.videoCallItem.setAlpha(f4);
            }
            setScaleX(fLerp);
            setScaleY(fLerp);
            setAlpha(fLerp);
        }

        public void updateAvatarItemsInternal() {
            if (ProfileActivity.this.otherItem == null || ProfileActivity.this.avatarsViewPager == null || !ProfileActivity.this.isPulledDown) {
                return;
            }
            if (ProfileActivity.this.avatarsViewPager.getRealPosition() == 0) {
                ProfileActivity.this.otherItem.hideSubItem(33);
                ProfileActivity.this.otherItem.showSubItem(36);
            } else {
                ProfileActivity.this.otherItem.showSubItem(33);
                ProfileActivity.this.otherItem.hideSubItem(36);
            }
        }

        public void updateAvatarItems() {
            if (ProfileActivity.this.imageUpdater == null) {
                return;
            }
            if (ProfileActivity.this.otherItem.isSubMenuShowing()) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.updateAvatarItemsInternal();
                    }
                }, 500L);
            } else {
                updateAvatarItemsInternal();
            }
        }

        public boolean isIndicatorFullyVisible() {
            return this.isIndicatorVisible && !this.animator.isRunning();
        }

        public void setIndicatorVisible(boolean z, float f) {
            if (z != this.isIndicatorVisible) {
                this.isIndicatorVisible = z;
                this.animator.cancel();
                float fLerp = AndroidUtilities.lerp(this.animatorValues, this.animator.getAnimatedFraction());
                if (f <= 0.0f) {
                    this.animator.setDuration(0L);
                } else if (z) {
                    this.animator.setDuration((long) (((1.0f - fLerp) * 250.0f) / f));
                } else {
                    this.animator.setDuration((long) ((250.0f * fLerp) / f));
                }
                float[] fArr = this.animatorValues;
                fArr[0] = fLerp;
                fArr[1] = z ? 1.0f : 0.0f;
                this.animator.start();
            }
        }

        public void refreshVisibility(float f) {
            setIndicatorVisible(ProfileActivity.this.isPulledDown && ProfileActivity.this.avatarsViewPager.getRealCount() > 20, f);
        }

        @Override
        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            invalidateIndicatorRect(false);
        }

        public void invalidateIndicatorRect(boolean z) {
            if (z) {
                ProfileActivity.this.overlaysView.saveCurrentPageProgress();
            }
            ProfileActivity.this.overlaysView.invalidate();
            float fMeasureText = this.textPaint.measureText(getCurrentTitle());
            this.indicatorRect.right = getMeasuredWidth() - AndroidUtilities.dp(54.0f);
            RectF rectF = this.indicatorRect;
            rectF.left = rectF.right - (fMeasureText + AndroidUtilities.dpf2(16.0f));
            this.indicatorRect.top = ((((BaseFragment) ProfileActivity.this).actionBar == null || !((BaseFragment) ProfileActivity.this).actionBar.getOccupyStatusBar()) ? 0 : AndroidUtilities.statusBarHeight) + AndroidUtilities.dp(15.0f);
            RectF rectF2 = this.indicatorRect;
            rectF2.bottom = rectF2.top + AndroidUtilities.dp(26.0f);
            setPivotX(this.indicatorRect.centerX());
            setPivotY(this.indicatorRect.centerY());
            invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            float fDpf2 = AndroidUtilities.dpf2(12.0f);
            canvas.drawRoundRect(this.indicatorRect, fDpf2, fDpf2, this.backgroundPaint);
            canvas.drawText(getCurrentTitle(), this.indicatorRect.centerX(), this.indicatorRect.top + AndroidUtilities.dpf2(18.5f), this.textPaint);
        }

        private String getCurrentTitle() {
            return this.adapter.getPageTitle(ProfileActivity.this.avatarsViewPager.getCurrentItem()).toString();
        }

        public ActionBarMenuItem getSecondaryMenuItem() {
            if (ProfileActivity.this.callItemVisible) {
                return ProfileActivity.this.callItem;
            }
            if (ProfileActivity.this.editItemVisible) {
                return ProfileActivity.this.editItem;
            }
            if (ProfileActivity.this.searchItem != null) {
                return ProfileActivity.this.searchItem;
            }
            return null;
        }
    }

    public ProfileActivity(Bundle bundle) {
        this(bundle, null);
    }

    public ProfileActivity(Bundle bundle, SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader) {
        super(bundle);
        this.nameTextView = new SimpleTextView[2];
        this.nameTextViewRightDrawableContentDescription = null;
        this.nameTextViewRightDrawable2ContentDescription = null;
        this.onlineTextView = new SimpleTextView[4];
        this.verifiedDrawable = new Drawable[2];
        this.premiumStarDrawable = new Drawable[2];
        this.emojiStatusDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[2];
        this.botVerificationDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[2];
        this.verifiedCheckDrawable = new Drawable[2];
        this.verifiedCrossfadeDrawable = new CrossfadeDrawable[2];
        this.premiumCrossfadeDrawable = new CrossfadeDrawable[2];
        this.scrimView = null;
        this.scrimPaint = new Paint(1) {
            @Override
            public void setAlpha(int i) {
                super.setAlpha(i);
                ProfileActivity.this.fragmentView.invalidate();
            }
        };
        this.actionBarBackgroundPaint = new Paint(1);
        this.isOnline = new boolean[1];
        this.headerShadowAlpha = 1.0f;
        this.participantsMap = new LongSparseArray();
        this.allowProfileAnimation = true;
        this.disableProfileAnimation = false;
        this.justFullyExpanded = false;
        this.ignoreScrollOnFullExpand = false;
        this.positionToOffset = new HashMap();
        this.expandAnimatorValues = new float[]{0.0f, 1.0f};
        this.whitePaint = new Paint();
        this.onlineCount = -1;
        this.rect = new Rect();
        this.visibleChatParticipants = new ArrayList();
        this.visibleSortedUsers = new ArrayList();
        this.usersForceShowingIn = 0;
        this.firstLayout = true;
        this.invalidateScroll = true;
        this.actionBarAnimationColorFrom = 0;
        this.navigationBarAnimationColorFrom = 0;
        this.reportReactionMessageId = 0;
        this.reportReactionFromDialogId = 0L;
        this.notificationsExceptionTopics = new HashSet();
        this.HEADER_SHADOW = new AnimationProperties.FloatProperty("headerShadow") {
            @Override
            public void setValue(ProfileActivity profileActivity, float f) {
                ProfileActivity profileActivity2 = ProfileActivity.this;
                profileActivity2.headerShadowAlpha = f;
                profileActivity2.topView.invalidate();
            }

            @Override
            public Float get(ProfileActivity profileActivity) {
                return Float.valueOf(ProfileActivity.this.headerShadowAlpha);
            }
        };
        this.provider = new PhotoViewer.EmptyPhotoViewerProvider() {
            @Override
            public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
                TLRPC.Chat chat;
                TLRPC.ChatPhoto chatPhoto;
                TLRPC.FileLocation fileLocation2;
                TLRPC.User user;
                TLRPC.UserProfilePhoto userProfilePhoto;
                if (fileLocation == null) {
                    return null;
                }
                if (ProfileActivity.this.avatarContainer.getScaleX() > 0.96f && z2) {
                    return null;
                }
                if (ProfileActivity.this.userId == 0 ? ProfileActivity.this.chatId == 0 || (chat = ProfileActivity.this.getMessagesController().getChat(Long.valueOf(ProfileActivity.this.chatId))) == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null : (user = ProfileActivity.this.getMessagesController().getUser(Long.valueOf(ProfileActivity.this.userId))) == null || (userProfilePhoto = user.photo) == null || (fileLocation2 = userProfilePhoto.photo_big) == null) {
                    fileLocation2 = null;
                }
                if (fileLocation2 == null || fileLocation2.local_id != fileLocation.local_id || fileLocation2.volume_id != fileLocation.volume_id || fileLocation2.dc_id != fileLocation.dc_id) {
                    return null;
                }
                int[] iArr = new int[2];
                ProfileActivity.this.avatarImage.getLocationInWindow(iArr);
                PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                placeProviderObject.viewX = iArr[0];
                placeProviderObject.viewY = iArr[1];
                placeProviderObject.parentView = ProfileActivity.this.avatarImage;
                placeProviderObject.imageReceiver = ProfileActivity.this.avatarImage.getImageReceiver();
                if (ProfileActivity.this.userId != 0) {
                    placeProviderObject.dialogId = ProfileActivity.this.userId;
                } else if (ProfileActivity.this.chatId != 0) {
                    placeProviderObject.dialogId = -ProfileActivity.this.chatId;
                }
                ImageReceiver.BitmapHolder bitmapSafe = placeProviderObject.imageReceiver.getBitmapSafe();
                placeProviderObject.thumb = bitmapSafe;
                if (bitmapSafe == null) {
                    return null;
                }
                placeProviderObject.size = -1L;
                placeProviderObject.radius = ProfileActivity.this.avatarImage.getImageReceiver().getRoundRadius(true);
                placeProviderObject.scale = ProfileActivity.this.avatarContainer.getScaleX();
                placeProviderObject.canEdit = ProfileActivity.this.userId == ProfileActivity.this.getUserConfig().clientUserId;
                placeProviderObject.fadeIn = ProfileActivity.this.avatarContainer.getScaleX() > 0.96f;
                return placeProviderObject;
            }

            @Override
            public void willHidePhotoViewer() {
                ProfileActivity.this.avatarImage.getImageReceiver().setVisible(true, true);
            }

            @Override
            public void openPhotoForEdit(String str, String str2, boolean z) {
                ProfileActivity.this.imageUpdater.openPhotoForEdit(str, str2, 0, z);
            }
        };
        this.ACTIONBAR_HEADER_PROGRESS = new AnimationProperties.FloatProperty("avatarAnimationProgress") {
            @Override
            public void setValue(ActionBar actionBar, float f) {
                int themedColor;
                int themedColor2;
                ProfileActivity.this.mediaHeaderAnimationProgress = f;
                if (ProfileActivity.this.storyView != null) {
                    ProfileActivity.this.storyView.setActionBarActionMode(f);
                }
                ProfileGiftsView profileGiftsView = ProfileActivity.this.giftsView;
                if (profileGiftsView != null) {
                    profileGiftsView.setActionBarActionMode(f);
                }
                ProfileActivity.this.topView.invalidate();
                int iDontApplyPeerColor = -1;
                int themedColor3 = ProfileActivity.this.peerColor != null ? -1 : ProfileActivity.this.getThemedColor(Theme.key_profile_title);
                ProfileActivity profileActivity = ProfileActivity.this;
                int i = Theme.key_player_actionBarTitle;
                int themedColor4 = profileActivity.getThemedColor(i);
                int offsetColor = AndroidUtilities.getOffsetColor(themedColor3, themedColor4, f, 1.0f);
                ProfileActivity.this.nameTextView[1].setTextColor(offsetColor);
                if (ProfileActivity.this.lockIconDrawable != null) {
                    ProfileActivity.this.lockIconDrawable.setColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY);
                }
                if (ProfileActivity.this.scamDrawable != null) {
                    ProfileActivity.this.scamDrawable.setColor(AndroidUtilities.getOffsetColor(ProfileActivity.this.getThemedColor(Theme.key_avatar_subtitleInProfileBlue), themedColor4, f, 1.0f));
                }
                ((BaseFragment) ProfileActivity.this).actionBar.setItemsColor(AndroidUtilities.getOffsetColor(ProfileActivity.this.peerColor != null ? -1 : ProfileActivity.this.getThemedColor(Theme.key_actionBarDefaultIcon), ProfileActivity.this.getThemedColor(Theme.key_actionBarActionModeDefaultIcon), f, 1.0f), false);
                if (ProfileActivity.this.peerColor != null) {
                    themedColor = 1090519039;
                } else {
                    themedColor = ProfileActivity.this.peerColor != null ? 553648127 : ProfileActivity.this.getThemedColor(Theme.key_avatar_actionBarSelectorBlue);
                }
                ((BaseFragment) ProfileActivity.this).actionBar.setItemsBackgroundColor(AndroidUtilities.getOffsetColor(themedColor, ProfileActivity.this.getThemedColor(Theme.key_actionBarActionModeDefaultSelector), f, 1.0f), false);
                ProfileActivity.this.topView.invalidate();
                ProfileActivity.this.otherItem.setIconColor(ProfileActivity.this.peerColor != null ? -1 : ProfileActivity.this.getThemedColor(Theme.key_actionBarDefaultIcon));
                ProfileActivity.this.callItem.setIconColor(ProfileActivity.this.peerColor != null ? -1 : ProfileActivity.this.getThemedColor(Theme.key_actionBarDefaultIcon));
                ProfileActivity.this.videoCallItem.setIconColor(ProfileActivity.this.peerColor != null ? -1 : ProfileActivity.this.getThemedColor(Theme.key_actionBarDefaultIcon));
                ProfileActivity.this.editItem.setIconColor(ProfileActivity.this.peerColor != null ? -1 : ProfileActivity.this.getThemedColor(Theme.key_actionBarDefaultIcon));
                ImageView unused = ProfileActivity.this.callToActionItem;
                if (ProfileActivity.this.verifiedDrawable[0] != null) {
                    ProfileActivity.this.verifiedDrawable[0].setColorFilter(AndroidUtilities.getOffsetColor(ProfileActivity.this.getThemedColor(Theme.key_profile_verifiedBackground), ProfileActivity.this.getThemedColor(i), f, 1.0f), PorterDuff.Mode.MULTIPLY);
                }
                if (ProfileActivity.this.verifiedDrawable[1] != null) {
                    if (ProfileActivity.this.peerColor != null) {
                        themedColor2 = Theme.adaptHSV(ColorUtils.blendARGB(ProfileActivity.this.peerColor.getColor2(), ProfileActivity.this.peerColor.hasColor6(Theme.isCurrentThemeDark()) ? ProfileActivity.this.peerColor.getColor5() : ProfileActivity.this.peerColor.getColor3(), 0.4f), 0.1f, Theme.isCurrentThemeDark() ? -0.1f : -0.08f);
                    } else {
                        themedColor2 = ProfileActivity.this.getThemedColor(Theme.key_profile_verifiedBackground);
                    }
                    ProfileActivity.this.verifiedDrawable[1].setColorFilter(AndroidUtilities.getOffsetColor(themedColor2, ProfileActivity.this.getThemedColor(i), f, 1.0f), PorterDuff.Mode.MULTIPLY);
                }
                if (ProfileActivity.this.verifiedCheckDrawable[0] != null) {
                    ProfileActivity.this.verifiedCheckDrawable[0].setColorFilter(AndroidUtilities.getOffsetColor(ProfileActivity.this.getThemedColor(Theme.key_profile_verifiedCheck), ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite), f, 1.0f), PorterDuff.Mode.MULTIPLY);
                }
                if (ProfileActivity.this.verifiedCheckDrawable[1] != null) {
                    if (ProfileActivity.this.peerColor == null) {
                        ProfileActivity profileActivity2 = ProfileActivity.this;
                        iDontApplyPeerColor = profileActivity2.dontApplyPeerColor(profileActivity2.getThemedColor(Theme.key_profile_verifiedCheck));
                    }
                    ProfileActivity.this.verifiedCheckDrawable[1].setColorFilter(AndroidUtilities.getOffsetColor(iDontApplyPeerColor, ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite), f, 1.0f), PorterDuff.Mode.MULTIPLY);
                }
                if (ProfileActivity.this.premiumStarDrawable[0] != null) {
                    ProfileActivity.this.premiumStarDrawable[0].setColorFilter(AndroidUtilities.getOffsetColor(ProfileActivity.this.getThemedColor(Theme.key_profile_verifiedBackground), ProfileActivity.this.getThemedColor(i), f, 1.0f), PorterDuff.Mode.MULTIPLY);
                }
                if (ProfileActivity.this.premiumStarDrawable[1] != null) {
                    ProfileActivity profileActivity3 = ProfileActivity.this;
                    int iDontApplyPeerColor2 = profileActivity3.dontApplyPeerColor(profileActivity3.getThemedColor(Theme.key_profile_verifiedBackground));
                    ProfileActivity profileActivity4 = ProfileActivity.this;
                    ProfileActivity.this.premiumStarDrawable[1].setColorFilter(AndroidUtilities.getOffsetColor(iDontApplyPeerColor2, profileActivity4.dontApplyPeerColor(profileActivity4.getThemedColor(i)), f, 1.0f), PorterDuff.Mode.MULTIPLY);
                }
                ProfileActivity.this.updateEmojiStatusDrawableColor();
                if (ProfileActivity.this.avatarsViewPagerIndicatorView.getSecondaryMenuItem() != null) {
                    if (ProfileActivity.this.videoCallItemVisible || ProfileActivity.this.editItemVisible || ProfileActivity.this.callItemVisible) {
                        ProfileActivity profileActivity5 = ProfileActivity.this;
                        profileActivity5.needLayoutText(profileActivity5.calculateHeaderExtraDiff());
                    }
                }
            }

            @Override
            public Float get(ActionBar actionBar) {
                return Float.valueOf(ProfileActivity.this.mediaHeaderAnimationProgress);
            }
        };
        this.resetListener = new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                ProfileActivity.this.needLayout(true);
            }
        };
        this.backwardInitialValues = null;
        this.adaptedColors = new SparseIntArray();
        this.scrimAnimatorSet = null;
        this.savedScrollPosition = -1;
        this.photoDescriptionProgress = -1.0f;
        ArrayList arrayList = new ArrayList();
        this.iBlur3Positions = arrayList;
        this.iBlur3PositionActionBar = new RectF();
        RectF rectF = new RectF();
        this.iBlur3PositionMainTabs = rectF;
        arrayList.add(rectF);
        this.sharedMediaPreloader = sharedMediaPreloader;
        if (Build.VERSION.SDK_INT >= 31) {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor();
            this.iBlur3SourceGlass = new BlurredBackgroundSourceRenderNode(null);
        } else {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlass = null;
        }
    }

    @Override
    public boolean onFragmentCreate() throws InterruptedException {
        this.userId = this.arguments.getLong("user_id", 0L);
        this.chatId = this.arguments.getLong("chat_id", 0L);
        this.topicId = this.arguments.getLong("topic_id", 0L);
        this.saved = this.arguments.getBoolean("saved", false);
        this.openSimilar = this.arguments.getBoolean("similar", false);
        this.isTopic = this.topicId != 0;
        this.banFromGroup = this.arguments.getLong("ban_chat_id", 0L);
        this.reportReactionMessageId = this.arguments.getInt("report_reaction_message_id", 0);
        this.reportReactionFromDialogId = this.arguments.getLong("report_reaction_from_dialog_id", 0L);
        this.showAddToContacts = this.arguments.getBoolean("show_add_to_contacts", true);
        this.vcardPhone = PhoneFormat.stripExceptNumbers(this.arguments.getString("vcard_phone"));
        this.vcardFirstName = this.arguments.getString("vcard_first_name");
        this.vcardLastName = this.arguments.getString("vcard_last_name");
        this.reportSpam = this.arguments.getBoolean("reportSpam", false);
        this.myProfile = this.arguments.getBoolean("my_profile", false);
        this.openGifts = this.arguments.getBoolean("open_gifts", false);
        this.openGiftsUpgradable = this.arguments.getBoolean("open_gifts_upgradable", false);
        this.openGiftsCollection = this.arguments.getInt("open_gifts_collection", 0);
        this.openCommonChats = this.arguments.getBoolean("open_common", false);
        this.initialStoryAlbum = this.arguments.getInt("open_story_album_id", -1);
        this.hasMainTabs = this.arguments.getBoolean("hasMainTabs", false);
        if (!this.expandPhoto) {
            boolean z = this.arguments.getBoolean("expandPhoto", false);
            this.expandPhoto = z;
            if (z) {
                this.currentExpandAnimatorValue = 1.0f;
                this.needSendMessage = true;
            }
        }
        if (this.userId != 0) {
            long j = this.arguments.getLong("dialog_id", 0L);
            this.dialogId = j;
            if (j != 0) {
                this.currentEncryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(this.dialogId)));
            }
            FlagSecureReason flagSecureReason = this.flagSecure;
            if (flagSecureReason != null) {
                flagSecureReason.invalidate();
            }
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.userId));
            if (user == null) {
                return false;
            }
            getNotificationCenter().addObserver(this, NotificationCenter.contactsDidLoad);
            getNotificationCenter().addObserver(this, NotificationCenter.newSuggestionsAvailable);
            getNotificationCenter().addObserver(this, NotificationCenter.encryptedChatCreated);
            getNotificationCenter().addObserver(this, NotificationCenter.encryptedChatUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.blockedUsersDidLoad);
            getNotificationCenter().addObserver(this, NotificationCenter.botInfoDidLoad);
            getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
            getNotificationCenter().addObserver(this, NotificationCenter.privacyRulesUpdated);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.reloadInterface);
            this.userBlocked = getMessagesController().blockePeers.indexOfKey(this.userId) >= 0;
            if (user.bot) {
                this.isBot = true;
                MediaDataController mediaDataController = getMediaDataController();
                long j2 = user.id;
                mediaDataController.loadBotInfo(j2, j2, true, this.classGuid);
            }
            this.userInfo = getMessagesController().getUserFull(this.userId);
            getMessagesController().loadFullUser(getMessagesController().getUser(Long.valueOf(this.userId)), this.classGuid, true);
            this.participantsMap = null;
            if (UserObject.isUserSelf(user)) {
                ImageUpdater imageUpdater = new ImageUpdater(true, 0, true);
                this.imageUpdater = imageUpdater;
                imageUpdater.setOpenWithFrontfaceCamera(true);
                ImageUpdater imageUpdater2 = this.imageUpdater;
                imageUpdater2.parentFragment = this;
                imageUpdater2.setDelegate(this);
                getMediaDataController().checkFeaturedStickers();
                getMessagesController().loadSuggestedFilters();
                getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, this.classGuid);
            }
            this.actionBarAnimationColorFrom = this.arguments.getInt("actionBarColor", 0);
        } else {
            if (this.chatId == 0) {
                return false;
            }
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
            this.currentChat = chat;
            if (chat == null) {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onFragmentCreate$0(countDownLatch);
                    }
                });
                try {
                    countDownLatch.await();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (this.currentChat == null) {
                    return false;
                }
                getMessagesController().putChat(this.currentChat, true);
            }
            FlagSecureReason flagSecureReason2 = this.flagSecure;
            if (flagSecureReason2 != null) {
                flagSecureReason2.invalidate();
            }
            if (this.currentChat.megagroup) {
                getChannelParticipants(true);
            } else {
                this.participantsMap = null;
            }
            getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().addObserver(this, NotificationCenter.chatOnlineCountDidLoad);
            getNotificationCenter().addObserver(this, NotificationCenter.groupCallUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.channelRightsUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.chatWasBoostedByUser);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.uploadStoryEnd);
            this.sortedUsers = new ArrayList();
            updateOnlineCount(true);
            if (this.chatInfo == null) {
                this.chatInfo = getMessagesController().getChatFull(this.chatId);
            }
            if (ChatObject.isChannel(this.currentChat)) {
                getMessagesController().loadFullChat(this.chatId, this.classGuid, true);
            } else if (this.chatInfo == null) {
                this.chatInfo = getMessagesStorage().loadChatInfo(this.chatId, false, null, false, false);
            }
            updateExceptions();
        }
        long clientUserId = getUserConfig().getClientUserId();
        if ((this.userId == clientUserId || this.dialogId == clientUserId) && !this.myProfile) {
            this.myProfile = true;
        }
        SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader = this.sharedMediaPreloader;
        if (sharedMediaPreloader != null && sharedMediaPreloader.getTopicId() != this.topicId) {
            this.sharedMediaPreloader.onDestroy(this);
            this.sharedMediaPreloader = null;
        }
        if (this.sharedMediaPreloader == null) {
            this.sharedMediaPreloader = new SharedMediaLayout.SharedMediaPreloader(this);
        }
        this.sharedMediaPreloader.addDelegate(this);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().addObserver(this, NotificationCenter.closeChats);
        getNotificationCenter().addObserver(this, NotificationCenter.closeProfileActivity);
        getNotificationCenter().addObserver(this, NotificationCenter.topicsDidLoaded);
        getNotificationCenter().addObserver(this, NotificationCenter.updateSearchSettings);
        getNotificationCenter().addObserver(this, NotificationCenter.reloadDialogPhotos);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesReadUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.botStarsUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.channelRecommendationsLoaded);
        getNotificationCenter().addObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().addObserver(this, NotificationCenter.profileMusicUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        updateRowsIds();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        if (this.arguments.containsKey("preload_messages")) {
            getMessagesController().ensureMessagesLoaded(this.userId, 0, null);
        }
        if (this.userId != 0 && UserObject.isUserSelf(getMessagesController().getUser(Long.valueOf(this.userId)))) {
            getConnectionsManager().sendRequest(new TL_account.getPassword(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$onFragmentCreate$1(tLObject, tL_error);
                }
            });
        }
        Bulletin.addDelegate(this, new Bulletin.Delegate() {
            @Override
            public boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public boolean clipWithGradient(int i) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
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
                Bulletin.Delegate.CC.$default$onShow(this, bulletin);
            }

            @Override
            public int getTopOffset(int i) {
                return AndroidUtilities.statusBarHeight;
            }

            @Override
            public int getBottomOffset(int i) {
                if (ProfileActivity.this.bottomButtonsContainer == null) {
                    return ProfileActivity.this.navigationBarHeight + ProfileActivity.this.additionFloatingButtonOffset;
                }
                return ProfileActivity.this.navigationBarHeight + ProfileActivity.this.additionFloatingButtonOffset + ((int) (((AndroidUtilities.dp(52.0f) - ProfileActivity.this.bottomButtonsContainer.getTranslationY()) - (ProfileActivity.this.sharedMediaLayout.getTabVisibility(9, false) * ProfileActivity.this.bottomButtonContainer[1].getTranslationY())) - (ProfileActivity.this.sharedMediaLayout.getTabVisibility(8, true) * ProfileActivity.this.bottomButtonContainer[0].getTranslationY())));
            }

            @Override
            public boolean bottomOffsetAnimated() {
                return ProfileActivity.this.bottomButtonsContainer == null;
            }
        });
        if (this.userId != 0 && UserObject.isUserSelf(getMessagesController().getUser(Long.valueOf(this.userId))) && !this.myProfile) {
            getMessagesController().getContentSettings(null);
        }
        setActionsMode();
        this.additionNavigationBarHeight = this.hasMainTabs ? AndroidUtilities.dp(72.0f) : 0;
        this.additionFloatingButtonOffset = this.hasMainTabs ? AndroidUtilities.dp(64.0f) : 0;
        return true;
    }

    public void lambda$onFragmentCreate$0(CountDownLatch countDownLatch) {
        this.currentChat = getMessagesStorage().getChat(this.chatId);
        countDownLatch.countDown();
    }

    public void lambda$onFragmentCreate$1(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_account.TL_password) {
            this.currentPassword = (TL_account.TL_password) tLObject;
        }
    }

    private void setActionsMode() {
        ProfileActionsView profileActionsView = this.actionsView;
        if (profileActionsView == null) {
            return;
        }
        if (this.myProfile) {
            profileActionsView.mode = 6;
            return;
        }
        if (this.isTopic) {
            profileActionsView.mode = 5;
            return;
        }
        if (this.isBot) {
            profileActionsView.mode = 2;
            return;
        }
        if (this.userId != 0) {
            profileActionsView.mode = 0;
            return;
        }
        if (this.chatId != 0) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
            if (ChatObject.isChannel(chat)) {
                if (ChatObject.isMegagroup(chat)) {
                    this.actionsView.mode = 3;
                    return;
                } else if (ChatObject.isForum(chat)) {
                    this.actionsView.mode = 4;
                    return;
                } else {
                    this.actionsView.mode = 1;
                    return;
                }
            }
            this.actionsView.mode = 3;
        }
    }

    public void updateExceptions() {
        if (this.isTopic || !ChatObject.isForum(this.currentChat)) {
            return;
        }
        getNotificationsController().loadTopicsNotificationsExceptions(-this.chatId, new Consumer() {
            @Override
            public final void p(Object obj) {
                this.f$0.lambda$updateExceptions$2((HashSet) obj);
            }

            public Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public void lambda$updateExceptions$2(HashSet hashSet) {
        ArrayList arrayList = new ArrayList(hashSet);
        int i = 0;
        while (i < arrayList.size()) {
            if (getMessagesController().getTopicsController().findTopic(this.chatId, ((Integer) arrayList.get(i)).intValue()) == null) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        this.notificationsExceptionTopics.clear();
        this.notificationsExceptionTopics.addAll(arrayList);
        updateNotifications(true);
    }

    @Override
    public boolean isActionBarCrossfadeEnabled() {
        return !this.isPulledDown;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout != null) {
            sharedMediaLayout.onDestroy();
        }
        SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader = this.sharedMediaPreloader;
        if (sharedMediaPreloader != null) {
            sharedMediaPreloader.onDestroy(this);
        }
        SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader2 = this.sharedMediaPreloader;
        if (sharedMediaPreloader2 != null) {
            sharedMediaPreloader2.removeDelegate(this);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.closeChats);
        getNotificationCenter().removeObserver(this, NotificationCenter.closeProfileActivity);
        getNotificationCenter().removeObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().removeObserver(this, NotificationCenter.topicsDidLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateSearchSettings);
        getNotificationCenter().removeObserver(this, NotificationCenter.reloadDialogPhotos);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesReadUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.botStarsUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.channelRecommendationsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.profileMusicUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        ProfileGalleryView profileGalleryView = this.avatarsViewPager;
        if (profileGalleryView != null) {
            profileGalleryView.onDestroy();
        }
        ProfileGalleryBlurView profileGalleryBlurView = this.avatarsBlurView;
        if (profileGalleryBlurView != null) {
            profileGalleryBlurView.destroy();
        }
        this.backwardInitialValues = null;
        if (this.userId != 0) {
            getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
            getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatCreated);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.blockedUsersDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.botInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.privacyRulesUpdated);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.reloadInterface);
            getMessagesController().cancelLoadFullUser(this.userId);
        } else if (this.chatId != 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.uploadStoryEnd);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatOnlineCountDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
        }
        AvatarImageView avatarImageView = this.avatarImage;
        if (avatarImageView != null) {
            avatarImageView.setImageDrawable(null);
        }
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.clear();
        }
        PinchToZoomHelper pinchToZoomHelper = this.pinchToZoomHelper;
        if (pinchToZoomHelper != null) {
            pinchToZoomHelper.clear();
        }
        ProfileBirthdayEffect.BirthdayEffectFetcher birthdayEffectFetcher = this.birthdayFetcher;
        if (birthdayEffectFetcher != null && this.createdBirthdayFetcher) {
            birthdayEffectFetcher.detach(true);
            this.birthdayFetcher = null;
        }
        Runnable runnable = this.applyBulletin;
        if (runnable != null) {
            this.applyBulletin = null;
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    @Override
    public ActionBar createActionBar(Context context) {
        ChatActivity chatActivity;
        ChatActivity.ThemeDelegate themeDelegate;
        BaseFragment lastFragment = this.parentLayout.getLastFragment();
        if ((lastFragment instanceof ChatActivity) && (themeDelegate = (chatActivity = (ChatActivity) lastFragment).themeDelegate) != null && themeDelegate.getCurrentTheme() != null && !chatActivity.themeDelegate.isGiftTheme()) {
            this.resourcesProvider = lastFragment.getResourceProvider();
        }
        ActionBar actionBar = new ActionBar(context, this.resourcesProvider) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                ProfileActivity.this.avatarContainer.getHitRect(ProfileActivity.this.rect);
                if (ProfileActivity.this.rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            }

            @Override
            public void setItemsColor(int i, boolean z) {
                ImageView imageView;
                super.setItemsColor(i, z);
                if (!z && ProfileActivity.this.ttlIconView != null) {
                    ProfileActivity.this.ttlIconView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                }
                if (!ProfileActivity.this.hasMainTabs || (imageView = this.backButtonImageView) == null) {
                    return;
                }
                imageView.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            }

            @Override
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                ProfileActivity.this.updateStoriesViewBounds(false);
            }
        };
        boolean z = true;
        actionBar.setForceSkipTouches(true);
        actionBar.setBackgroundColor(0);
        actionBar.setItemsBackgroundColor(this.peerColor != null ? 553648127 : getThemedColor(Theme.key_avatar_actionBarSelectorBlue), false);
        int i = Theme.key_actionBarDefaultIcon;
        actionBar.setItemsColor(getThemedColor(i), false);
        actionBar.setItemsColor(getThemedColor(i), true);
        actionBar.setCastShadows(false);
        actionBar.setAddToContainer(false);
        actionBar.setClipContent(true);
        if (!this.hasMainTabs && (AndroidUtilities.isTablet() || this.inBubbleMode)) {
            z = false;
        }
        actionBar.setOccupyStatusBar(z);
        if (this.hasMainTabs) {
            actionBar.setBackButtonDrawable(new BackDrawable(false));
            actionBar.backButtonImageView.setImageResource(R.drawable.outline_header_qr_24);
            actionBar.backButtonImageView.setColorFilter(getThemedColor(i), PorterDuff.Mode.SRC_IN);
            actionBar.backButtonImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$createActionBar$3(view);
                }
            });
        } else {
            actionBar.setBackButtonDrawable(new BackDrawable(false));
            final ImageView backButton = actionBar.getBackButton();
            backButton.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public final boolean onLongClick(View view) {
                    return this.f$0.lambda$createActionBar$5(backButton, view);
                }
            });
        }
        return actionBar;
    }

    public void lambda$createActionBar$3(View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        bundle.putLong("user_id", this.userId);
        presentFragment(new QrActivity(bundle));
    }

    public boolean lambda$createActionBar$5(ImageView imageView, View view) {
        ActionBarPopupWindow actionBarPopupWindowShow = BackButtonMenu.show(this, imageView, getDialogId(), getTopicId(), this.resourcesProvider);
        if (actionBarPopupWindowShow == null) {
            return false;
        }
        actionBarPopupWindowShow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public final void onDismiss() {
                this.f$0.lambda$createActionBar$4();
            }
        });
        dimBehindView(imageView, 0.3f);
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(true, 1);
        }
        return true;
    }

    public void lambda$createActionBar$4() {
        dimBehindView(false);
    }

    @Override
    public void setParentLayout(INavigationLayout iNavigationLayout) {
        super.setParentLayout(iNavigationLayout);
        FlagSecureReason flagSecureReason = this.flagSecure;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
            this.flagSecure = null;
        }
        if (iNavigationLayout == null || iNavigationLayout.getParentActivity() == null) {
            return;
        }
        this.flagSecure = new FlagSecureReason(iNavigationLayout.getParentActivity().getWindow(), new FlagSecureReason.FlagSecureCondition() {
            @Override
            public final boolean run() {
                return this.f$0.lambda$setParentLayout$6();
            }
        });
    }

    public boolean lambda$setParentLayout$6() {
        return this.currentEncryptedChat != null || getMessagesController().isChatNoForwards(this.currentChat);
    }

    @Override
    public View createView(final Context context) {
        int i;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        final Context context2;
        ?? r10;
        ?? r8;
        int i2;
        Object tag;
        float f;
        boolean z;
        int i3;
        int i4;
        float f2;
        int i5;
        int i6;
        ChatAvatarContainer avatarContainer;
        TLRPC.UserFull userFull2;
        TLRPC.ChatParticipants chatParticipants;
        ChatActivity chatActivity;
        ChatActivity.ThemeDelegate themeDelegate;
        float f3 = 16.0f;
        Theme.createProfileResources(context);
        ?? r5 = 0;
        Theme.createChatResources(context, false);
        BaseFragment lastFragment = this.parentLayout.getLastFragment();
        if ((lastFragment instanceof ChatActivity) && (themeDelegate = (chatActivity = (ChatActivity) lastFragment).themeDelegate) != null && themeDelegate.getCurrentTheme() != null && !chatActivity.themeDelegate.isGiftTheme()) {
            this.resourcesProvider = lastFragment.getResourceProvider();
        }
        this.searchTransitionOffset = 0;
        this.searchTransitionProgress = 1.0f;
        this.searchMode = false;
        this.hasOwnBackground = true;
        this.extraHeight = getHeaderExtraHeight();
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass6());
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout != null) {
            sharedMediaLayout.onDestroy();
        }
        long j = this.dialogId;
        if (j == 0) {
            j = this.userId;
            if (j == 0) {
                j = -this.chatId;
            }
        }
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(context);
        this.fragmentView = anonymousClass7;
        if (this.myProfile) {
            this.bottomButtonsContainer = new FrameLayout(context);
            this.bottomButtonContainer = new FrameLayout[2];
            this.bottomButton = new ButtonWithCounterView[2];
            final int i7 = 0;
            for (int i8 = 2; i7 < i8; i8 = 2) {
                BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
                int i9 = Theme.key_windowBackgroundWhite;
                blurredBackgroundSourceColor.setColor(getThemedColor(i9));
                BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
                Button2 button2 = new Button2(context);
                BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(button2, new BlurredBackgroundColorProviderThemed(this.resourcesProvider, i9));
                blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(8.0f));
                blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(22.0f));
                button2.setBackground(blurredBackgroundDrawableCreate);
                this.bottomButtonContainer[i7] = new FrameLayout(context);
                this.bottomButton[i7] = new ButtonWithCounterView(context, this.resourcesProvider);
                this.bottomButton[i7].setRoundRadius(AndroidUtilities.dp(19.0f));
                this.bottomButton[i7].setUseWrapContent(true);
                this.bottomButton[i7].setPadding(AndroidUtilities.dp(f3), r5, AndroidUtilities.dp(f3), r5);
                if (i7 == 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                    this.bottomButtonPostText = spannableStringBuilder;
                    spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.filled_premium_camera), r5, 1, 33);
                    this.bottomButtonPostText.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
                    this.bottomButtonPostTextAlbum = spannableStringBuilder2;
                    spannableStringBuilder2.setSpan(new ColoredImageSpan(R.drawable.filled_add_album), r5, 1, 33);
                    this.bottomButtonPostTextAlbum.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAlbumBottomButtonAddStories));
                    this.bottomButton[i7].setText(this.bottomButtonPostText, r5);
                } else {
                    this.bottomButton[i7].setText(LocaleController.getString(R.string.StorySave), r5);
                }
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) throws Resources.NotFoundException, IOException {
                        this.f$0.lambda$createView$11(i7, view);
                    }
                });
                ScaleStateListAnimator.apply(button2, 0.02f, 1.2f);
                this.bottomButton[i7].setStateListAnimator(null);
                button2.addView(this.bottomButton[i7], LayoutHelper.createFrame(-2, -1, 17));
                this.bottomButtonContainer[i7].addView(button2, LayoutHelper.createFrame(-2, 60, 1));
                this.bottomButtonsContainer.addView(this.bottomButtonContainer[i7], LayoutHelper.createFrame(-1, -1, 87));
                if (i7 == 1 || !getMessagesController().storiesEnabled()) {
                    this.bottomButtonContainer[i7].setTranslationY(AndroidUtilities.dp(72.0f));
                }
                i7++;
                f3 = 16.0f;
                r5 = 0;
            }
        }
        TLRPC.ChatFull chatFull2 = this.chatInfo;
        ArrayList arrayList = (chatFull2 == null || (chatParticipants = chatFull2.participants) == null || chatParticipants.participants.size() <= 5) ? null : this.sortedUsers;
        if (this.openCommonChats) {
            i = 6;
        } else if (this.openGifts && (((userFull = this.userInfo) != null && userFull.stargifts_count > 0) || ((chatFull = this.chatInfo) != null && chatFull.stargifts_count > 0))) {
            this.openedGifts = true;
            i = 14;
        } else {
            i = this.openSimilar ? 10 : arrayList != null ? 7 : -1;
        }
        SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader = this.sharedMediaPreloader;
        TLRPC.UserFull userFull3 = this.userInfo;
        final long j2 = j;
        AnonymousClass9 anonymousClass9 = new AnonymousClass9(context, j, sharedMediaPreloader, userFull3 != null ? userFull3.common_chats_count : 0, this.sortedUsers, this.chatInfo, userFull3, i, this.initialStoryAlbum, this, this, 1, this.resourcesProvider);
        this.sharedMediaLayout = anonymousClass9;
        anonymousClass9.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        this.sharedMediaLayout.initBlurCapture((ViewGroup) this.fragmentView);
        if (this.userId == 0 || this.imageUpdater == null || this.myProfile) {
            context2 = context;
            this.actionsView = new ProfileActionsView(context2, getActionsExtraHeight());
            setActionsMode();
            r10 = 0;
            updateNotifications(false);
            this.actionsView.setOnActionClickListener(new ProfileActionsView.OnActionClickListener() {
                @Override
                public final void onClick(int i10, float f4, float f5) throws Resources.NotFoundException, IOException {
                    this.f$0.lambda$createView$15(i10, f4, f5);
                }
            });
        } else {
            context2 = context;
            r10 = 0;
        }
        if ((this.userId != 0 && this.imageUpdater != null) || this.myProfile) {
            this.passkeySuggestion = r10;
            ProfileSuggestionView profileSuggestionView = new ProfileSuggestionView(context2, this.resourcesProvider);
            this.suggestionView = profileSuggestionView;
            profileSuggestionView.setVisibility(this.passkeySuggestion ? 0 : 8);
            this.suggestionView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$createView$16(context2, view);
                }
            });
            this.suggestionView.closeView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$createView$17(view);
                }
            });
            ProfileGalleryBlurView profileGalleryBlurView = this.avatarsBlurView;
            if (profileGalleryBlurView != null) {
                profileGalleryBlurView.setSize(getActionsExtraHeight());
            }
        }
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        if (this.userId == getUserConfig().clientUserId && !this.myProfile && ContactsController.getInstance(this.currentAccount).getPrivacyRules(7) == null) {
            ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        }
        if (this.imageUpdater == null || this.myProfile) {
            r8 = 1;
        } else {
            r8 = 1;
            r8 = 1;
            ActionBarMenuItem actionBarMenuItemSearchListener = actionBarMenuCreateMenu.addItem(32, R.drawable.ic_ab_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
                @Override
                public Animator getCustomToggleTransition() {
                    ProfileActivity.this.searchMode = !r0.searchMode;
                    if (!ProfileActivity.this.searchMode) {
                        ProfileActivity.this.searchItem.clearFocusOnSearchView();
                    }
                    if (ProfileActivity.this.searchMode) {
                        ProfileActivity.this.searchItem.getSearchField().setText("");
                    }
                    ProfileActivity profileActivity = ProfileActivity.this;
                    return profileActivity.searchExpandTransition(profileActivity.searchMode);
                }

                @Override
                public void onTextChanged(EditText editText) {
                    ProfileActivity.this.searchAdapter.search(editText.getText().toString().toLowerCase());
                }
            });
            this.searchItem = actionBarMenuItemSearchListener;
            int i10 = R.string.SearchInSettings;
            actionBarMenuItemSearchListener.setContentDescription(LocaleController.getString(i10));
            this.searchItem.setSearchFieldHint(LocaleController.getString(i10));
            this.sharedMediaLayout.getSearchItem().setVisibility(8);
            if (this.sharedMediaLayout.getSearchOptionsItem() != null) {
                this.sharedMediaLayout.getSearchOptionsItem().setVisibility(8);
            }
            if (this.sharedMediaLayout.getSaveItem() != null) {
                this.sharedMediaLayout.getSaveItem().setVisibility(8);
            }
            if (this.expandPhoto) {
                this.searchItem.setVisibility(8);
            }
        }
        ActionBarMenuItem actionBarMenuItemAddItem = actionBarMenuCreateMenu.addItem(16, R.drawable.profile_video);
        this.videoCallItem = actionBarMenuItemAddItem;
        actionBarMenuItemAddItem.setContentDescription(LocaleController.getString(R.string.VideoCall));
        if (this.chatId != 0) {
            this.callItem = actionBarMenuCreateMenu.addItem(15, R.drawable.msg_voicechat2);
            if (ChatObject.isChannelOrGiga(this.currentChat)) {
                this.callItem.setContentDescription(LocaleController.getString(R.string.VoipChannelVoiceChat));
            } else {
                this.callItem.setContentDescription(LocaleController.getString(R.string.VoipGroupVoiceChat));
            }
        } else {
            ActionBarMenuItem actionBarMenuItemAddItem2 = actionBarMenuCreateMenu.addItem(15, R.drawable.ic_call);
            this.callItem = actionBarMenuItemAddItem2;
            actionBarMenuItemAddItem2.setContentDescription(LocaleController.getString(R.string.Call));
        }
        if (this.myProfile) {
            ActionBarMenuItem actionBarMenuItemAddItem3 = actionBarMenuCreateMenu.addItem(41, R.drawable.group_edit_profile);
            this.editItem = actionBarMenuItemAddItem3;
            actionBarMenuItemAddItem3.setContentDescription(LocaleController.getString(R.string.Edit));
        } else {
            ActionBarMenuItem actionBarMenuItemAddItem4 = actionBarMenuCreateMenu.addItem(12, R.drawable.group_edit_profile);
            this.editItem = actionBarMenuItemAddItem4;
            actionBarMenuItemAddItem4.setContentDescription(LocaleController.getString(R.string.Edit));
        }
        this.otherItem = actionBarMenuCreateMenu.addItem(10, R.drawable.ic_ab_other, this.resourcesProvider);
        ImageView imageView = new ImageView(context2);
        this.ttlIconView = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarDefaultIcon), PorterDuff.Mode.MULTIPLY));
        AndroidUtilities.updateViewVisibilityAnimated(this.ttlIconView, r10, 0.8f, r10);
        this.ttlIconView.setImageResource(R.drawable.msg_mini_autodelete_timer);
        this.otherItem.addView(this.ttlIconView, LayoutHelper.createFrame(12, 12.0f, 19, 8.0f, 2.0f, 0.0f, 0.0f));
        this.otherItem.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        if (this.listView == null || this.imageUpdater == null) {
            i2 = -1;
            tag = null;
        } else {
            int iFindFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
            View viewFindViewByPosition = this.layoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
            if (viewFindViewByPosition != null) {
                viewFindViewByPosition.getTop();
                this.listView.getPaddingTop();
            } else {
                iFindFirstVisibleItemPosition = -1;
            }
            i2 = iFindFirstVisibleItemPosition;
            tag = this.writeButton.getTag();
        }
        createActionBarMenu(r10);
        this.listAdapter = new ListAdapter(context2);
        this.searchAdapter = new SearchAdapter(this, context2);
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        this.avatarDrawable = avatarDrawable;
        avatarDrawable.setScaleSize(2.3809524f);
        this.avatarDrawable.setProfile(r8);
        this.fragmentView.setWillNotDraw(r10);
        NestedFrameLayout nestedFrameLayout = (NestedFrameLayout) this.fragmentView;
        this.contentView = nestedFrameLayout;
        nestedFrameLayout.needBlur = r8;
        ClippedListView clippedListView = new ClippedListView(context2) {
            private VelocityTracker velocityTracker;

            @Override
            public boolean hasOverlappingRendering() {
                return false;
            }

            @Override
            protected void requestChildOnScreen(View view, View view2) {
            }

            @Override
            protected boolean canHighlightChildAt(View view, float f4, float f5) {
                return !(view instanceof AboutLinkCell);
            }

            @Override
            protected boolean allowSelectChildAtPosition(View view) {
                return view != ProfileActivity.this.sharedMediaLayout;
            }

            @Override
            public void invalidate() {
                super.invalidate();
                View view = ProfileActivity.this.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                SharedMediaLayout sharedMediaLayout2 = ProfileActivity.this.sharedMediaLayout;
                if (sharedMediaLayout2 != null) {
                    if (sharedMediaLayout2.canEditStories() && ProfileActivity.this.sharedMediaLayout.isActionModeShown() && ProfileActivity.this.sharedMediaLayout.getClosestTab() == 13) {
                        return false;
                    }
                    if (ProfileActivity.this.sharedMediaLayout.canEditStories() && ProfileActivity.this.sharedMediaLayout.isActionModeShown() && (ProfileActivity.this.sharedMediaLayout.getClosestTab() == 8 || SharedMediaLayout.isStoryAlbumPageType(ProfileActivity.this.sharedMediaLayout.getClosestTab()))) {
                        return false;
                    }
                    ProfileGiftsContainer profileGiftsContainer = ProfileActivity.this.sharedMediaLayout.giftsContainer;
                    if (profileGiftsContainer != null && profileGiftsContainer.isReordering()) {
                        return false;
                    }
                    ProfileStoriesCollectionTabs profileStoriesCollectionTabs = ProfileActivity.this.sharedMediaLayout.storiesContainer;
                    if (profileStoriesCollectionTabs != null && profileStoriesCollectionTabs.isReordering()) {
                        return false;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                VelocityTracker velocityTracker;
                View viewFindViewByPosition2;
                int action = motionEvent.getAction();
                if (action == 0) {
                    VelocityTracker velocityTracker2 = this.velocityTracker;
                    if (velocityTracker2 == null) {
                        this.velocityTracker = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.velocityTracker.addMovement(motionEvent);
                } else if (action == 2) {
                    VelocityTracker velocityTracker3 = this.velocityTracker;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                        this.velocityTracker.computeCurrentVelocity(1000);
                        ProfileActivity.this.listViewVelocityY = this.velocityTracker.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
                    }
                } else if ((action == 1 || action == 3) && (velocityTracker = this.velocityTracker) != null) {
                    if (action == 1) {
                        velocityTracker.addMovement(motionEvent);
                        this.velocityTracker.computeCurrentVelocity(1000);
                        ProfileActivity.this.listViewVelocityY = this.velocityTracker.getYVelocity(motionEvent.getPointerId(motionEvent.getActionIndex()));
                    }
                    this.velocityTracker.recycle();
                    this.velocityTracker = null;
                }
                boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
                if (action == 2) {
                    if (ProfileActivity.this.extraHeight >= ((!ProfileActivity.this.isInLandscapeMode || ProfileActivity.this.hasMainTabs) ? ProfileActivity.this.listView.getMeasuredWidth() + ProfileActivity.this.getActionsExtraHeight() : ProfileActivity.this.getHeaderExtraHeight() + (ActionBar.getCurrentActionBarHeight() + (((BaseFragment) ProfileActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0))) - 1.0f) {
                        ProfileActivity.this.openAvatar(true);
                        zOnTouchEvent = false;
                    }
                }
                if ((action == 1 || action == 3) && (viewFindViewByPosition2 = ProfileActivity.this.layoutManager.findViewByPosition(0)) != null) {
                    if (ProfileActivity.this.justFullyExpanded) {
                        ProfileActivity.this.justFullyExpanded = false;
                        ProfileActivity.this.listView.canStopFlinger = true;
                    }
                    if (ProfileActivity.this.allowPullingDown) {
                        if (ProfileActivity.this.isPulledDown) {
                            ProfileActivity.this.listView.smoothScrollBy(0, ((viewFindViewByPosition2.getTop() - ProfileActivity.this.listView.getMeasuredWidth()) - ProfileActivity.this.getActionsExtraHeight()) + ActionBar.getCurrentActionBarHeight() + (((BaseFragment) ProfileActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0), CubicBezierInterpolator.EASE_OUT_QUINT);
                        } else {
                            ProfileActivity.this.listView.smoothScrollBy(0, viewFindViewByPosition2.getTop() - ProfileActivity.this.getHeaderExtraHeight(), CubicBezierInterpolator.EASE_OUT_QUINT);
                        }
                    } else {
                        boolean z2 = ProfileActivity.this.getActionsExtraHeight() > 0;
                        if (z2 && ProfileActivity.this.extraHeight > 0.0f && ((ProfileActivity.this.extraHeight < ProfileActivity.this.getHeaderExtraHeight() * 0.6f || ProfileActivity.this.listViewVelocityY < -1000.0f) && ProfileActivity.this.extraHeight > ProfileActivity.this.getActionsExtraHeight() * 0.6f)) {
                            ProfileActivity.this.listView.smoothScrollBy(0, (int) (ProfileActivity.this.extraHeight - ProfileActivity.this.getActionsExtraHeight()), CubicBezierInterpolator.EASE_OUT_QUINT);
                        } else if (z2 && ProfileActivity.this.extraHeight > 0.0f && ProfileActivity.this.extraHeight < ProfileActivity.this.getActionsExtraHeight() * 0.6f) {
                            ProfileActivity.this.listView.smoothScrollBy(0, (int) (ProfileActivity.this.getActionsExtraHeight() - ProfileActivity.this.extraHeight), CubicBezierInterpolator.EASE_OUT_QUINT);
                        } else if (!z2 && ProfileActivity.this.extraHeight > 0.0f && ProfileActivity.this.listViewVelocityY < -1000.0f) {
                            ProfileActivity.this.listView.smoothScrollBy(0, (int) ProfileActivity.this.extraHeight, CubicBezierInterpolator.EASE_OUT_QUINT);
                        } else if (ProfileActivity.this.extraHeight > 0.0f) {
                            ProfileActivity.this.listView.smoothScrollBy(0, viewFindViewByPosition2.getTop() - ProfileActivity.this.getHeaderExtraHeight(), CubicBezierInterpolator.EASE_OUT_QUINT);
                        }
                    }
                }
                return zOnTouchEvent;
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j3) {
                if (getItemAnimator().isRunning() && view.getBackground() == null && view.getTranslationY() != 0.0f) {
                    boolean z2 = ProfileActivity.this.listView.getChildAdapterPosition(view) == ProfileActivity.this.sharedMediaRow && view.getAlpha() != 1.0f;
                    if (z2) {
                        ProfileActivity.this.whitePaint.setAlpha((int) (ProfileActivity.this.listView.getAlpha() * 255.0f * view.getAlpha()));
                    }
                    canvas.drawRect(ProfileActivity.this.listView.getX(), view.getY(), ProfileActivity.this.listView.getX() + ProfileActivity.this.listView.getMeasuredWidth(), view.getY() + view.getHeight(), ProfileActivity.this.whitePaint);
                    if (z2) {
                        ProfileActivity.this.whitePaint.setAlpha((int) (ProfileActivity.this.listView.getAlpha() * 255.0f));
                    }
                }
                return super.drawChild(canvas, view, j3);
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (ProfileActivity.this.bizHoursRow >= 0 && ProfileActivity.this.infoStartRow >= 0 && ProfileActivity.this.infoEndRow >= 0) {
                    drawSectionBackground(canvas, ProfileActivity.this.infoStartRow, ProfileActivity.this.infoEndRow, getThemedColor(Theme.key_windowBackgroundWhite));
                }
                super.dispatchDraw(canvas);
            }

            @Override
            protected void onLayout(boolean z2, int i11, int i12, int i13, int i14) {
                super.onLayout(z2, i11, i12, i13, i14);
                ProfileActivity.this.updateBottomButtonY();
            }
        };
        this.listView = clippedListView;
        clippedListView.setVerticalScrollBarEnabled(r10);
        final ViewGroupPartRenderer viewGroupPartRenderer = new ViewGroupPartRenderer(this.listView, (ViewGroup) this.fragmentView, new ViewGroupPartRenderer.DrawChildMethod() {
            @Override
            public final boolean drawChild(Canvas canvas, View view, long j3) {
                return this.f$0.lambda$createView$18(canvas, view, j3);
            }
        });
        AnonymousClass12 anonymousClass12 = new AnonymousClass12();
        this.listView.setItemAnimator(anonymousClass12);
        anonymousClass12.setMoveDelay(0L);
        anonymousClass12.setMoveDuration(320L);
        anonymousClass12.setRemoveDuration(320L);
        anonymousClass12.setAddDuration(320L);
        anonymousClass12.setSupportsChangeAnimations(r10);
        anonymousClass12.setDelayAnimations(r10);
        anonymousClass12.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.listView.setClipToPadding(r10);
        this.listView.setHideIfEmpty(r10);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context2) {
            @Override
            public boolean supportsPredictiveItemAnimations() {
                return ProfileActivity.this.imageUpdater != null;
            }

            @Override
            public int scrollVerticallyBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
                View viewFindViewByPosition2 = ProfileActivity.this.layoutManager.findViewByPosition(0);
                if (viewFindViewByPosition2 != null && !ProfileActivity.this.openingAvatar) {
                    int top = viewFindViewByPosition2.getTop() - ProfileActivity.this.getHeaderExtraHeight();
                    if (ProfileActivity.this.allowPullingDown || top <= i11) {
                        if (ProfileActivity.this.allowPullingDown) {
                            if (i11 >= top) {
                                ProfileActivity.this.allowPullingDown = false;
                            } else if (ProfileActivity.this.listView.getScrollState() == 1 && !ProfileActivity.this.isPulledDown) {
                                i11 /= 2;
                            }
                        }
                    } else if (ProfileActivity.this.avatarsViewPager.hasImages() && ProfileActivity.this.avatarImage.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled() && ((!ProfileActivity.this.isInLandscapeMode && !AndroidUtilities.isTablet()) || ProfileActivity.this.hasMainTabs)) {
                        ProfileActivity profileActivity = ProfileActivity.this;
                        profileActivity.allowPullingDown = profileActivity.avatarBig == null;
                    }
                    i11 = top;
                }
                if (!ProfileActivity.this.justFullyExpanded || ProfileActivity.this.listView.isFlingerWorking()) {
                    return super.scrollVerticallyBy(i11, recycler, state);
                }
                return 0;
            }
        };
        this.layoutManager = linearLayoutManager;
        linearLayoutManager.setOrientation(r8);
        LinearLayoutManager linearLayoutManager2 = this.layoutManager;
        linearLayoutManager2.mIgnoreTopPadding = r10;
        this.listView.setLayoutManager(linearLayoutManager2);
        this.listView.setGlowColor(r10);
        this.listView.setAdapter(this.listAdapter);
        anonymousClass7.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public boolean hasDoubleTap(View view, int i11) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i11);
            }

            @Override
            public void onDoubleTap(View view, int i11, float f4, float f5) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i11, f4, f5);
            }

            @Override
            public final void onItemClick(View view, int i11, float f4, float f5) {
                this.f$0.lambda$createView$28(context2, j2, view, i11, f4, f5);
            }
        });
        this.listView.setOnItemLongClickListener(new AnonymousClass14(context2));
        if (this.openSimilar || this.openGifts || this.openCommonChats) {
            updateRowsIds();
            scrollToSharedMedia();
            this.savedScrollToSharedMedia = r8;
            this.savedScrollPosition = this.sharedMediaRow;
            this.savedScrollOffset = r10;
        }
        if (this.searchItem != null) {
            RecyclerListView recyclerListView = new RecyclerListView(context2);
            this.searchListView = recyclerListView;
            recyclerListView.setVerticalScrollBarEnabled(r10);
            this.searchListView.setLayoutManager(new LinearLayoutManager(context2, r8, r10));
            this.searchListView.setGlowColor(getThemedColor(Theme.key_avatar_backgroundActionBarBlue));
            this.searchListView.setAdapter(this.searchAdapter);
            this.searchListView.setItemAnimator(null);
            this.searchListView.setVisibility(8);
            this.searchListView.setLayoutAnimation(null);
            this.searchListView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
            anonymousClass7.addView(this.searchListView, LayoutHelper.createFrame(-1, -1, 51));
            this.searchListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view, int i11) {
                    this.f$0.lambda$createView$29(view, i11);
                }
            });
            this.searchListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
                @Override
                public final boolean onItemClick(View view, int i11) {
                    return this.f$0.lambda$createView$31(view, i11);
                }
            });
            this.searchListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
                    if (i11 == 1) {
                        AndroidUtilities.hideKeyboard(ProfileActivity.this.getParentActivity().getCurrentFocus());
                    }
                }
            });
            this.searchListView.setAnimateEmptyView(r8, r8);
            StickerEmptyView stickerEmptyView = new StickerEmptyView(context2, null, r8);
            this.emptyView = stickerEmptyView;
            stickerEmptyView.setAnimateLayoutChange(r8);
            this.emptyView.subtitle.setVisibility(8);
            this.emptyView.setVisibility(8);
            anonymousClass7.addView(this.emptyView);
            this.searchAdapter.loadFaqWebPage();
        }
        if (this.banFromGroup != 0) {
            final TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.banFromGroup));
            if (this.currentChannelParticipant == null) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                tL_channels_getParticipant.channel = MessagesController.getInputChannel(chat);
                tL_channels_getParticipant.participant = getMessagesController().getInputPeer(this.userId);
                getConnectionsManager().sendRequest(tL_channels_getParticipant, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$createView$33(tLObject, tL_error);
                    }
                });
            }
            FrameLayout frameLayout = new FrameLayout(context2) {
                @Override
                protected void onDraw(Canvas canvas) {
                    int intrinsicHeight = Theme.chat_composeShadowDrawable.getIntrinsicHeight();
                    Theme.chat_composeShadowDrawable.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                    Theme.chat_composeShadowDrawable.draw(canvas);
                    canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), Theme.chat_composeBackgroundPaint);
                }
            };
            frameLayout.setWillNotDraw(r10);
            anonymousClass7.addView(frameLayout, LayoutHelper.createFrame(-1, 51, 83));
            frameLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$createView$34(chat, view);
                }
            });
            TextView textView = new TextView(context2);
            textView.setTextColor(getThemedColor(Theme.key_text_RedRegular));
            textView.setTextSize(r8, 15.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(R.string.BanFromTheGroup));
            frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 1.0f, 0.0f, 0.0f));
            this.listView.setPadding(r10, getHeaderExtraHeight(), r10, AndroidUtilities.dp(48.0f));
            this.listView.setBottomGlowOffset(AndroidUtilities.dp(48.0f));
        } else {
            this.listView.setPadding(r10, getHeaderExtraHeight(), r10, r10);
        }
        TopView topView = new TopView(context2);
        this.topView = topView;
        topView.setBackgroundColorId(this.peerColor, r10);
        this.topView.setBackgroundColor(getThemedColor(Theme.key_avatar_backgroundActionBarBlue));
        anonymousClass7.addView(this.topView);
        this.contentView.blurBehindViews.add(this.topView);
        AnimatedStatusView animatedStatusView = new AnimatedStatusView(context2, 20, 60);
        this.animatedStatusView = animatedStatusView;
        animatedStatusView.setPivotX(AndroidUtilities.dp(30.0f));
        this.animatedStatusView.setPivotY(AndroidUtilities.dp(30.0f));
        this.avatarContainer = new FrameLayout(context2) {
            @Override
            public void setScaleX(float f4) {
                super.setScaleX(f4);
                ProfileActivity.this.updateGooey();
            }

            @Override
            protected void onMeasure(int i11, int i12) {
                super.onMeasure(i11, i12);
                ProfileActivity.this.updateGooey();
            }

            @Override
            public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
                super.setLayoutParams(layoutParams);
            }

            @Override
            protected void onLayout(boolean z2, int i11, int i12, int i13, int i14) {
                super.onLayout(z2, i11, i12, i13, i14);
            }
        };
        this.avatarContainer2 = new AnonymousClass19(context2);
        ImageReceiver imageReceiver = new ImageReceiver(this.avatarContainer2);
        this.fallbackImage = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(11.0f));
        AndroidUtilities.updateViewVisibilityAnimated(this.avatarContainer2, r8, 1.0f, r10);
        anonymousClass7.addView(this.avatarContainer2, LayoutHelper.createFrame(-1, -1.0f, 8388611, 0.0f, 0.0f, 0.0f, 0.0f));
        this.avatarContainer.setPivotX(0.0f);
        this.avatarContainer.setPivotY(0.0f);
        ProfileGooeyView profileGooeyView = new ProfileGooeyView(context2);
        this.avatarGooey = profileGooeyView;
        profileGooeyView.addView(this.avatarContainer, LayoutHelper.createFrame(100, 100.0f, 51, 64.0f, 0.0f, 0.0f, 0.0f));
        this.avatarContainer2.addView(this.avatarGooey, LayoutHelper.createFrame(-1, -1.0f));
        AvatarImageView avatarImageView = new AvatarImageView(context2) {
            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (getImageReceiver().hasNotThumb()) {
                    accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrProfilePicture));
                    accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.Open)));
                    accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString(R.string.AccDescrOpenInPhotoViewer)));
                    return;
                }
                accessibilityNodeInfo.setVisibleToUser(false);
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
                if (animatedEmojiDrawable == null || animatedEmojiDrawable.getImageReceiver() == null) {
                    return;
                }
                this.animatedEmojiDrawable.getImageReceiver().startAnimation();
            }
        };
        this.avatarImage = avatarImageView;
        avatarImageView.createBlurEffect(getActionsExtraHeight());
        this.avatarImage.getImageReceiver().setAllowDecodeSingleFrame(r8);
        this.avatarImage.setRoundRadiusForExpand(getSmallAvatarRoundRadius());
        this.avatarImage.setPivotX(0.0f);
        this.avatarImage.setPivotY(0.0f);
        this.avatarContainer.addView(this.avatarImage, LayoutHelper.createFrame(-1, -1.0f));
        this.avatarImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createView$36(view);
            }
        });
        this.avatarImage.setHasStories(needInsetForStories());
        this.avatarImage.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                return this.f$0.lambda$createView$37(view);
            }
        });
        RadialProgressView radialProgressView = new RadialProgressView(context2) {
            private Paint paint;

            {
                Paint paint = new Paint(1);
                this.paint = paint;
                paint.setColor(1426063360);
            }

            @Override
            protected void onDraw(Canvas canvas) {
                if (ProfileActivity.this.avatarImage != null && ProfileActivity.this.avatarImage.getImageReceiver().hasNotThumb()) {
                    this.paint.setAlpha((int) (ProfileActivity.this.avatarImage.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, this.paint);
                }
                super.onDraw(canvas);
            }
        };
        this.avatarProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(26.0f));
        this.avatarProgressView.setProgressColor(-1);
        this.avatarProgressView.setNoProgress(r10);
        this.avatarContainer.addView(this.avatarProgressView, LayoutHelper.createFrame(-1, -1.0f));
        ImageView imageView2 = new ImageView(context2);
        this.timeItem = imageView2;
        imageView2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
        this.timeItem.setScaleType(ImageView.ScaleType.CENTER);
        this.timeItem.setAlpha(0.0f);
        ImageView imageView3 = this.timeItem;
        TimerDrawable timerDrawable = new TimerDrawable(context2, null);
        this.timerDrawable = timerDrawable;
        imageView3.setImageDrawable(timerDrawable);
        this.timeItem.setTranslationY(-1.0f);
        anonymousClass7.addView(this.timeItem, LayoutHelper.createFrame(34, 34, 51));
        ImageView imageView4 = new ImageView(context2);
        this.starBgItem = imageView4;
        imageView4.setImageResource(R.drawable.star_small_outline);
        this.starBgItem.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarDefault), PorterDuff.Mode.SRC_IN));
        this.starBgItem.setAlpha(0.0f);
        this.starBgItem.setScaleY(0.0f);
        this.starBgItem.setScaleX(0.0f);
        anonymousClass7.addView(this.starBgItem, LayoutHelper.createFrame(20, 20, 51));
        ImageView imageView5 = new ImageView(context2);
        this.starFgItem = imageView5;
        imageView5.setImageResource(R.drawable.star_small_inner);
        this.starFgItem.setAlpha(0.0f);
        this.starFgItem.setScaleY(0.0f);
        this.starFgItem.setScaleX(0.0f);
        anonymousClass7.addView(this.starFgItem, LayoutHelper.createFrame(20, 20, 51));
        showAvatarProgress(r10, r10);
        ProfileGalleryView profileGalleryView = this.avatarsViewPager;
        if (profileGalleryView != null) {
            profileGalleryView.onDestroy();
        }
        ProfileGalleryBlurView profileGalleryBlurView2 = this.avatarsBlurView;
        if (profileGalleryBlurView2 != null) {
            profileGalleryBlurView2.destroy();
        }
        this.overlaysView = new OverlaysView(context2);
        ProfileGalleryBlurView profileGalleryBlurView3 = new ProfileGalleryBlurView(context2);
        this.avatarsBlurView = profileGalleryBlurView3;
        profileGalleryBlurView3.setSize(getActionsExtraHeight());
        long j3 = this.userId;
        if (j3 == 0) {
            j3 = -this.chatId;
        }
        int i11 = i2;
        this.avatarsViewPager = new ProfileGalleryView(context, j3, this.actionBar, this.listView, this.avatarImage, getClassGuid(), this.overlaysView, this.avatarsBlurView) {
            @Override
            protected void setCustomAvatarProgress(float f4) {
                ProfileActivity.this.customAvatarProgress = f4;
                ProfileActivity.this.checkPhotoDescriptionAlpha();
            }
        };
        if (this.userId != getUserConfig().clientUserId && (userFull2 = this.userInfo) != null) {
            this.customAvatarProgress = userFull2.profile_photo == null ? 0.0f : 1.0f;
        }
        if (!this.isTopic) {
            this.avatarsViewPager.setChatInfo(this.chatInfo);
        }
        this.avatarContainer2.addView(this.avatarsViewPager);
        this.avatarContainer2.addView(this.avatarsBlurView, LayoutHelper.createFrame(-1, r1.actionSize + r1.size));
        this.avatarContainer2.addView(this.overlaysView);
        ProfileActionsView profileActionsView = this.actionsView;
        if (profileActionsView != null) {
            this.avatarsBlurView.setActionsView(profileActionsView);
            f = -1.0f;
            this.avatarContainer2.addView(this.actionsView, LayoutHelper.createFrame(-1, -1.0f));
        } else {
            f = -1.0f;
        }
        ProfileSuggestionView profileSuggestionView2 = this.suggestionView;
        if (profileSuggestionView2 != null) {
            this.avatarsBlurView.setSuggestionView(profileSuggestionView2);
            this.avatarContainer2.addView(this.suggestionView, LayoutHelper.createFrame(-1, -2.0f));
        }
        ProfileMusicView profileMusicView = this.musicView;
        if (profileMusicView != null) {
            this.avatarsBlurView.setMusicView(profileMusicView);
        }
        this.avatarImage.setAvatarsViewPager(this.avatarsViewPager);
        PagerIndicatorView pagerIndicatorView = new PagerIndicatorView(context2);
        this.avatarsViewPagerIndicatorView = pagerIndicatorView;
        this.avatarContainer2.addView(pagerIndicatorView, LayoutHelper.createFrame(-1, f));
        anonymousClass7.addView(this.actionBar);
        float width = 54 + ((!this.callItemVisible || this.userId == 0) ? 0 : 54);
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout == null || !(iNavigationLayout.getLastFragment() instanceof ChatActivity) || (avatarContainer = ((ChatActivity) this.parentLayout.getLastFragment()).getAvatarContainer()) == null) {
            z = false;
        } else {
            boolean z2 = avatarContainer.getTitleTextView().getPaddingRight() != 0;
            if (avatarContainer.getLayoutParams() != null && avatarContainer.getTitleTextView() != null) {
                width = (((ViewGroup.MarginLayoutParams) avatarContainer.getLayoutParams()).rightMargin + (avatarContainer.getWidth() - avatarContainer.getTitleTextView().getRight())) / AndroidUtilities.density;
            }
            z = z2;
        }
        int i12 = 0;
        while (true) {
            SimpleTextView[] simpleTextViewArr = this.nameTextView;
            i3 = 3;
            if (i12 >= simpleTextViewArr.length) {
                break;
            }
            if (this.playProfileAnimation == 0 && i12 == 0) {
                i6 = 1;
            } else {
                simpleTextViewArr[i12] = new SimpleTextView(context2) {
                    @Override
                    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                        if (isFocusable()) {
                            if (ProfileActivity.this.nameTextViewRightDrawableContentDescription == null && ProfileActivity.this.nameTextViewRightDrawable2ContentDescription == null) {
                                return;
                            }
                            StringBuilder sb = new StringBuilder(getText());
                            if (ProfileActivity.this.nameTextViewRightDrawable2ContentDescription != null) {
                                if (sb.length() > 0) {
                                    sb.append(", ");
                                }
                                sb.append(ProfileActivity.this.nameTextViewRightDrawable2ContentDescription);
                            }
                            if (ProfileActivity.this.nameTextViewRightDrawableContentDescription != null) {
                                if (sb.length() > 0) {
                                    sb.append(", ");
                                }
                                sb.append(ProfileActivity.this.nameTextViewRightDrawableContentDescription);
                            }
                            accessibilityNodeInfo.setText(sb);
                        }
                    }

                    @Override
                    protected void onDraw(Canvas canvas) {
                        int rightDrawableX = getRightDrawableX();
                        super.onDraw(canvas);
                        if (rightDrawableX != getRightDrawableX()) {
                            ProfileActivity.this.updateCollectibleHint();
                        }
                    }

                    @Override
                    public void setTextSize(int i13) {
                        super.setTextSize(i13);
                    }

                    @Override
                    public void setScaleX(float f4) {
                        super.setScaleX(f4);
                    }
                };
                i6 = 1;
                if (i12 == 1) {
                    this.nameTextView[i12].setTextColor(getThemedColor(Theme.key_profile_title));
                } else {
                    this.nameTextView[i12].setTextColor(getThemedColor(Theme.key_actionBarDefaultTitle));
                }
                this.nameTextView[i12].setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(i12 == 0 ? 12.0f : 4.0f));
                this.nameTextView[i12].setTextSize(18);
                this.nameTextView[i12].setGravity(3);
                this.nameTextView[i12].setTypeface(AndroidUtilities.bold());
                this.nameTextView[i12].setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
                this.nameTextView[i12].setPivotX(0.0f);
                this.nameTextView[i12].setPivotY(0.0f);
                this.nameTextView[i12].setAlpha(i12 == 0 ? 0.0f : 1.0f);
                if (i12 == 1) {
                    this.nameTextView[i12].setScrollNonFitText(true);
                    this.nameTextView[i12].setImportantForAccessibility(2);
                }
                this.nameTextView[i12].setFocusable(i12 == 0);
                this.nameTextView[i12].setEllipsizeByGradient(true);
                this.nameTextView[i12].setRightDrawableOutside(i12 == 0);
                this.avatarContainer2.addView(this.nameTextView[i12], LayoutHelper.createFrame(-2, -2.0f, 51, 118.0f, -6.0f, i12 == 0 ? width - (z ? 10 : 0) : 0.0f, 0.0f));
            }
            i12 += i6;
        }
        int i13 = 0;
        while (true) {
            SimpleTextView[] simpleTextViewArr2 = this.onlineTextView;
            if (i13 >= simpleTextViewArr2.length) {
                break;
            }
            if (i13 == 1) {
                simpleTextViewArr2[i13] = new LinkSpanDrawable.ClickableSmallTextView(context2) {
                    @Override
                    public void setAlpha(float f4) {
                        super.setAlpha(f4);
                        ProfileActivity.this.checkPhotoDescriptionAlpha();
                    }

                    @Override
                    public void setTranslationY(float f4) {
                        super.setTranslationY(f4);
                        ProfileActivity profileActivity = ProfileActivity.this;
                        profileActivity.lastRatingViewTranslationYOffset = profileActivity.getRatingViewTranslationYOffset();
                        ProfileActivity.this.onlineTextView[2].setTranslationY(f4);
                        ProfileActivity.this.onlineTextView[3].setTranslationY(f4);
                        if (ProfileActivity.this.ratingView != null) {
                            ProfileActivity.this.ratingView.setTranslationY(f4 - AndroidUtilities.dp(5.0f));
                        }
                    }

                    @Override
                    public void setTranslationX(float f4) {
                        super.setTranslationX(f4);
                        ProfileActivity profileActivity = ProfileActivity.this;
                        profileActivity.lastRatingViewTranslationXOffset = profileActivity.getRatingViewTranslationXOffset();
                        ProfileActivity.this.onlineTextView[2].setTranslationX(f4);
                        ProfileActivity.this.onlineTextView[3].setTranslationX(f4);
                        if (ProfileActivity.this.ratingView != null) {
                            ProfileActivity.this.ratingView.setTranslationX(f4 - ProfileActivity.this.getRatingViewTranslationXOffset());
                        }
                    }

                    @Override
                    public void setTextColor(int i14) {
                        super.setTextColor(i14);
                        if (ProfileActivity.this.onlineTextView[2] != null) {
                            ProfileActivity.this.onlineTextView[2].setTextColor(i14);
                            ProfileActivity.this.onlineTextView[3].setTextColor(i14);
                        }
                        if (ProfileActivity.this.showStatusButton != null) {
                            ProfileActivity.this.showStatusButton.setTextColor(Theme.multAlpha(Theme.adaptHSV(i14, -0.02f, 0.15f), 1.4f));
                        }
                    }

                    @Override
                    public boolean setText(CharSequence charSequence) {
                        return super.setText(charSequence);
                    }
                };
            } else {
                simpleTextViewArr2[i13] = new LinkSpanDrawable.ClickableSmallTextView(context2);
            }
            this.onlineTextView[i13].setEllipsizeByGradient(true);
            this.onlineTextView[i13].setTextColor(applyPeerColor(getThemedColor(Theme.key_avatar_subtitleInProfileBlue), true, null));
            this.onlineTextView[i13].setTextSize(14);
            this.onlineTextView[i13].setGravity(i3);
            this.onlineTextView[i13].setAlpha(i13 == 0 ? 0.0f : 1.0f);
            this.onlineTextView[i13].setPivotX(AndroidUtilities.dp(8.0f));
            this.onlineTextView[i13].setPivotY(AndroidUtilities.dp(8.0f));
            if (i13 == 1 || i13 == 2 || i13 == i3) {
                this.onlineTextView[i13].setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            }
            if (i13 > 0) {
                this.onlineTextView[i13].setImportantForAccessibility(2);
            }
            this.onlineTextView[i13].setFocusable(i13 == 0);
            this.avatarContainer2.addView(this.onlineTextView[i13], LayoutHelper.createFrame(-2, -2.0f, 51, 118 - ((i13 == 1 || i13 == 2 || i13 == i3) ? 4 : 0), (i13 == 1 || i13 == 2 || i13 == i3) ? -2 : 0, (i13 == 0 ? width - (z ? 10 : 0) : 8.0f) - ((i13 == 1 || i13 == 2 || i13 == i3) ? 4 : 0), 0.0f));
            i13++;
            i3 = 3;
        }
        checkPhotoDescriptionAlpha();
        this.avatarContainer2.addView(this.animatedStatusView);
        StarRatingView starRatingView = new StarRatingView(context2);
        this.ratingView = starRatingView;
        starRatingView.setLayoutParams(LayoutHelper.createFrame(32, 32.0f, 3, 112.0f, -2.0f, 0.0f, 0.0f));
        this.ratingView.setResourcesProvider(this.resourcesProvider);
        checkStarRatingVisible();
        this.ratingView.setDelegate(new StarRatingView.Delegate() {
            @Override
            public final void onUpdateState(float f4) {
                this.f$0.lambda$createView$38(f4);
            }
        });
        this.ratingView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.showStarRatingBottomSheet(view);
            }
        });
        TLRPC.UserFull userFull4 = this.userInfo;
        if (userFull4 != null) {
            this.ratingView.set(userFull4.stars_rating);
        }
        this.avatarContainer2.addView(this.ratingView);
        AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher = new AudioPlayerAlert.ClippingTextViewSwitcher(context2) {
            @Override
            protected TextView createTextView() {
                TextView textView2 = new TextView(context2);
                textView2.setTextColor(ProfileActivity.this.getThemedColor(Theme.key_player_actionBarSubtitle));
                textView2.setTextSize(0, AndroidUtilities.dp(14.0f));
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity(3);
                return textView2;
            }
        };
        this.mediaCounterTextView = clippingTextViewSwitcher;
        clippingTextViewSwitcher.setAlpha(0.0f);
        this.avatarContainer2.addView(this.mediaCounterTextView, LayoutHelper.createFrame(-2, -2.0f, 51, 118.33f, -2.0f, 8.0f, 0.0f));
        this.storyView = new ProfileStoriesView(context, this.currentAccount, getDialogId(), this.isTopic, this.avatarContainer, this.avatarImage, this.resourcesProvider) {
            @Override
            protected void onTap(StoryViewer.PlaceProvider placeProvider) {
                long dialogId = ProfileActivity.this.getDialogId();
                StoriesController storiesController = ProfileActivity.this.getMessagesController().getStoriesController();
                if (!storiesController.hasStories(dialogId) && !storiesController.hasUploadingStories(dialogId) && !storiesController.isLastUploadingFailed(dialogId)) {
                    if (ProfileActivity.this.userInfo == null || ProfileActivity.this.userInfo.stories == null || ProfileActivity.this.userInfo.stories.stories.isEmpty() || ProfileActivity.this.userId == ProfileActivity.this.getUserConfig().clientUserId) {
                        if (ProfileActivity.this.chatInfo == null || ProfileActivity.this.chatInfo.stories == null || ProfileActivity.this.chatInfo.stories.stories.isEmpty()) {
                            ProfileActivity.this.expandAvatar();
                            return;
                        } else {
                            ProfileActivity.this.getOrCreateStoryViewer().open(context, ProfileActivity.this.chatInfo.stories, placeProvider);
                            return;
                        }
                    }
                    ProfileActivity.this.getOrCreateStoryViewer().open(context, ProfileActivity.this.userInfo.stories, placeProvider);
                    return;
                }
                ProfileActivity.this.getOrCreateStoryViewer().open(context, dialogId, placeProvider);
            }

            @Override
            protected void lambda$new$4() {
                ProfileActivity.this.openAvatar(false);
            }
        };
        updateStoriesViewBounds(false);
        TLRPC.UserFull userFull5 = this.userInfo;
        if (userFull5 != null) {
            this.storyView.setStories(userFull5.stories);
        } else {
            TLRPC.ChatFull chatFull3 = this.chatInfo;
            if (chatFull3 != null) {
                this.storyView.setStories(chatFull3.stories);
            }
        }
        AvatarImageView avatarImageView2 = this.avatarImage;
        if (avatarImageView2 != null) {
            avatarImageView2.setHasStories(needInsetForStories());
        }
        this.avatarContainer2.addView(this.storyView, LayoutHelper.createFrame(-1, -1.0f));
        ProfileGiftsView profileGiftsView = new ProfileGiftsView(context, this.currentAccount, getDialogId(), this.avatarContainer, this.avatarImage, this.resourcesProvider);
        this.giftsView = profileGiftsView;
        this.avatarContainer2.addView(profileGiftsView, 0, LayoutHelper.createFrame(-1, -1.0f));
        updateProfileData(true);
        RLottieImageView rLottieImageView = new RLottieImageView(context2);
        this.writeButton = rLottieImageView;
        if (this.actionsView != null) {
            i4 = 8;
            rLottieImageView.setVisibility(8);
        } else {
            i4 = 8;
        }
        writeButtonSetBackground();
        if (this.userId != 0) {
            if (this.imageUpdater != null) {
                int i14 = R.raw.camera_outline;
                this.cameraDrawable = new RLottieDrawable(i14, String.valueOf(i14), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
                this.cellCameraDrawable = new RLottieDrawable(i14, i14 + "_cell", AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), false, null);
                ProfileActionsView profileActionsView2 = this.actionsView;
                if (profileActionsView2 != null) {
                    profileActionsView2.beginApplyingActions();
                    this.actionsView.addCameraAction();
                    this.actionsView.addEditInfo();
                    this.actionsView.addSettings();
                    this.actionsView.commitActions();
                } else {
                    this.writeButton.setAnimation(this.cameraDrawable);
                    this.writeButton.setContentDescription(LocaleController.getString(R.string.AccDescrChangeProfilePicture));
                    this.writeButton.setPadding(AndroidUtilities.dp(2.0f), 0, 0, AndroidUtilities.dp(2.0f));
                }
            } else {
                ProfileActionsView profileActionsView3 = this.actionsView;
                if (profileActionsView3 != null) {
                    profileActionsView3.set(0, true);
                }
                this.writeButton.setImageResource(R.drawable.profile_newmsg);
                this.writeButton.setContentDescription(LocaleController.getString(R.string.AccDescrOpenChat));
            }
        } else {
            this.writeButton.setImageResource(R.drawable.profile_discuss);
            this.writeButton.setContentDescription(LocaleController.getString(R.string.ViewDiscussion));
        }
        RLottieImageView rLottieImageView2 = this.writeButton;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        rLottieImageView2.setScaleType(scaleType);
        anonymousClass7.addView(this.writeButton, LayoutHelper.createFrame(60, 60.0f, 53, 0.0f, 0.0f, 16.0f, 0.0f));
        this.writeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createView$39(view);
            }
        });
        needLayout(false);
        if (i11 == -1 || tag == null) {
            f2 = 0.0f;
        } else {
            this.writeButton.setTag(0);
            this.writeButton.setScaleX(0.2f);
            this.writeButton.setScaleY(0.2f);
            f2 = 0.0f;
            this.writeButton.setAlpha(0.0f);
        }
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i15) {
                if (i15 == 1) {
                    AndroidUtilities.hideKeyboard(ProfileActivity.this.getParentActivity().getCurrentFocus());
                }
                if (ProfileActivity.this.openingAvatar && i15 != 2) {
                    ProfileActivity.this.openingAvatar = false;
                }
                if (ProfileActivity.this.searchItem != null) {
                    ProfileActivity.this.scrolling = i15 != 0;
                    ProfileActivity.this.searchItem.setEnabled((ProfileActivity.this.scrolling || ProfileActivity.this.isPulledDown) ? false : true);
                }
                ProfileActivity profileActivity = ProfileActivity.this;
                profileActivity.sharedMediaLayout.scrollingByUser = profileActivity.listView.scrollingByUser;
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i15, int i16) {
                if (ProfileActivity.this.fwdRestrictedHint != null) {
                    ProfileActivity.this.fwdRestrictedHint.hide();
                }
                ProfileActivity.this.checkListViewScroll();
                if (ProfileActivity.this.participantsMap != null && !ProfileActivity.this.usersEndReached && ProfileActivity.this.layoutManager.findLastVisibleItemPosition() > ProfileActivity.this.membersEndRow - 8) {
                    ProfileActivity.this.getChannelParticipants(false);
                }
                SharedMediaLayout sharedMediaLayout2 = ProfileActivity.this.sharedMediaLayout;
                sharedMediaLayout2.setPinnedToTop(sharedMediaLayout2.getY() <= 0.0f);
                ProfileActivity.this.updateBottomButtonY();
            }
        });
        UndoView undoView = new UndoView(context2, null, false, this.resourcesProvider);
        this.undoView = undoView;
        anonymousClass7.addView(undoView, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.expandAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$createView$40(valueAnimator);
            }
        });
        this.expandAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.expandAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Animator animator) {
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                int themedColor;
                ActionBar actionBar = ((BaseFragment) ProfileActivity.this).actionBar;
                if (ProfileActivity.this.isPulledDown) {
                    themedColor = 1090519039;
                } else {
                    themedColor = ProfileActivity.this.peerColor != null ? 553648127 : ProfileActivity.this.getThemedColor(Theme.key_avatar_actionBarSelectorBlue);
                }
                actionBar.setItemsBackgroundColor(themedColor, false);
                ProfileActivity.this.avatarImage.clearForeground();
                ProfileActivity.this.doNotSetForeground = false;
                ProfileActivity.this.updateStoriesViewBounds(false);
            }
        });
        updateRowsIds();
        updateSelectedMediaTabText();
        HintView hintView = new HintView(getParentActivity(), 9);
        this.fwdRestrictedHint = hintView;
        hintView.setAlpha(f2);
        anonymousClass7.addView(this.fwdRestrictedHint, LayoutHelper.createFrame(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
        this.sharedMediaLayout.setForwardRestrictedHint(this.fwdRestrictedHint);
        PinchToZoomHelper pinchToZoomHelper = new PinchToZoomHelper((ViewGroup) getParentActivity().getWindow().getDecorView(), anonymousClass7) {
            @Override
            protected void invalidateViews() {
                super.invalidateViews();
                ProfileActivity.this.fragmentView.invalidate();
                for (int i15 = 0; i15 < ProfileActivity.this.avatarsViewPager.getChildCount(); i15++) {
                    ProfileActivity.this.avatarsViewPager.getChildAt(i15).invalidate();
                }
                if (ProfileActivity.this.writeButton != null) {
                    ProfileActivity.this.writeButton.invalidate();
                }
            }

            @Override
            protected void drawOverlays(Canvas canvas, float f4, float f5, float f6, float f7, float f8) {
                if (f4 > 0.0f) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, ProfileActivity.this.avatarsViewPager.getMeasuredWidth(), ProfileActivity.this.avatarsViewPager.getMeasuredHeight() + AndroidUtilities.dp(30.0f));
                    canvas.saveLayerAlpha(rectF, (int) (255.0f * f4), 31);
                    ProfileActivity.this.avatarContainer2.draw(canvas);
                    ((BaseFragment) ProfileActivity.this).actionBar.getOccupyStatusBar();
                    canvas.save();
                    canvas.translate(((BaseFragment) ProfileActivity.this).actionBar.getX(), ((BaseFragment) ProfileActivity.this).actionBar.getY());
                    ((BaseFragment) ProfileActivity.this).actionBar.draw(canvas);
                    canvas.restore();
                    if (ProfileActivity.this.writeButton != null && ProfileActivity.this.writeButton.getVisibility() == 0 && ProfileActivity.this.writeButton.getAlpha() > 0.0f) {
                        canvas.save();
                        float f9 = (f4 * 0.5f) + 0.5f;
                        canvas.scale(f9, f9, ProfileActivity.this.writeButton.getX() + (ProfileActivity.this.writeButton.getMeasuredWidth() / 2.0f), ProfileActivity.this.writeButton.getY() + (ProfileActivity.this.writeButton.getMeasuredHeight() / 2.0f));
                        canvas.translate(ProfileActivity.this.writeButton.getX(), ProfileActivity.this.writeButton.getY());
                        ProfileActivity.this.writeButton.draw(canvas);
                        canvas.restore();
                    }
                    canvas.restore();
                }
            }

            @Override
            protected boolean zoomEnabled(View view, ImageReceiver imageReceiver2) {
                return super.zoomEnabled(view, imageReceiver2) && ProfileActivity.this.listView.getScrollState() != 1;
            }
        };
        this.pinchToZoomHelper = pinchToZoomHelper;
        pinchToZoomHelper.setCallback(new PinchToZoomHelper.Callback() {
            @Override
            public TextureView getCurrentTextureView() {
                return PinchToZoomHelper.Callback.CC.$default$getCurrentTextureView(this);
            }

            @Override
            public void onZoomStarted(MessageObject messageObject) {
                ProfileActivity.this.listView.cancelClickRunnables(true);
                SharedMediaLayout sharedMediaLayout2 = ProfileActivity.this.sharedMediaLayout;
                if (sharedMediaLayout2 != null && sharedMediaLayout2.getCurrentListView() != null) {
                    ProfileActivity.this.sharedMediaLayout.getCurrentListView().cancelClickRunnables(true);
                }
                TopView topView2 = ProfileActivity.this.topView;
                ProfileActivity profileActivity = ProfileActivity.this;
                topView2.setBackgroundColor(ColorUtils.blendARGB(profileActivity.getAverageColor(profileActivity.pinchToZoomHelper.getPhotoImage()), ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite), 0.1f));
            }

            @Override
            public void onZoomFinished(MessageObject messageObject) {
                if (ProfileActivity.this.avatarsBlurView != null) {
                    ProfileActivity.this.avatarsBlurView.restartAlpha();
                }
            }
        });
        this.avatarsViewPager.setPinchToZoomHelper(this.pinchToZoomHelper);
        this.scrimPaint.setAlpha(0);
        this.actionBarBackgroundPaint.setColor(getThemedColor(Theme.key_listSelector));
        this.contentView.blurBehindViews.add(this.sharedMediaLayout);
        updateTtlIcon();
        View view = new View(context2) {
            @Override
            public void setAlpha(float f4) {
                super.setAlpha(f4);
                View view2 = ProfileActivity.this.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                }
            }
        };
        this.blurredView = view;
        if (Build.VERSION.SDK_INT >= 23) {
            view.setForeground(new ColorDrawable(ColorUtils.setAlphaComponent(getThemedColor(Theme.key_windowBackgroundWhite), 100)));
        }
        this.blurredView.setFocusable(false);
        this.blurredView.setImportantForAccessibility(2);
        this.blurredView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$createView$41(view2);
            }
        });
        this.blurredView.setVisibility(i4);
        this.blurredView.setFitsSystemWindows(true);
        this.contentView.addView(this.blurredView, LayoutHelper.createFrame(-1, -1.0f));
        createBirthdayEffect();
        if (this.myProfile) {
            i5 = 87;
            this.contentView.addView(this.bottomButtonsContainer, LayoutHelper.createFrame(-1, 60, 87));
        } else {
            i5 = 87;
        }
        ProfileActionsView profileActionsView4 = this.actionsView;
        if (profileActionsView4 != null && profileActionsView4.hasCall()) {
            ImageView imageView6 = new ImageView(context2);
            this.callToActionItem = imageView6;
            imageView6.setScaleType(scaleType);
            this.callToActionItem.setImageResource(R.drawable.ic_call);
            this.callToActionItem.setVisibility(i4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AndroidUtilities.dp(48.0f), ActionBar.getCurrentActionBarHeight());
            layoutParams.topMargin = this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
            layoutParams.setMarginEnd(layoutParams.width);
            layoutParams.gravity = 8388613;
            anonymousClass7.addView(this.callToActionItem, layoutParams);
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.bottomButton2Container = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
        View view2 = new View(context2);
        view2.setBackgroundColor(getThemedColor(Theme.key_divider));
        this.bottomButton2Container.addView(view2, LayoutHelper.createFrame(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context2, this.resourcesProvider);
        this.bottomButton2 = buttonWithCounterView;
        buttonWithCounterView.setText(LocaleController.getString(R.string.Save), false);
        this.bottomButton2Container.addView(this.bottomButton2, LayoutHelper.createFrame(-1, 48.0f, 119, 10.0f, (1.0f / AndroidUtilities.density) + 10.0f, 10.0f, 10.0f));
        this.bottomButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                this.f$0.lambda$createView$42(view3);
            }
        });
        this.bottomButton2Container.setVisibility(i4);
        this.bottomButton2Container.setTranslationY(AndroidUtilities.dp(69.0f));
        this.contentView.addView(this.bottomButton2Container, LayoutHelper.createFrame(-1, -2, i5));
        this.iBlur3Capture = new IBlur3Capture() {
            @Override
            public final void capture(Canvas canvas, RectF rectF) {
                this.f$0.lambda$createView$43(viewGroupPartRenderer, canvas, rectF);
            }
        };
        ViewCompat.setOnApplyWindowInsetsListener(this.fragmentView, new OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsetsCompat onApplyWindowInsets(View view3, WindowInsetsCompat windowInsetsCompat) {
                return this.f$0.onApplyWindowInsets(view3, windowInsetsCompat);
            }
        });
        return this.fragmentView;
    }

    class AnonymousClass6 extends ActionBar.ActionBarMenuOnItemClick {
        AnonymousClass6() {
        }

        @Override
        public void onItemClick(int i) {
            long jMakeEncryptedDialogId;
            SharedMediaLayout.ScrollSlidingTextTabStripInner scrollSlidingTextTabStripInner;
            if (ProfileActivity.this.getParentActivity() == null) {
                return;
            }
            if (i == -1) {
                SharedMediaLayout sharedMediaLayout = ProfileActivity.this.sharedMediaLayout;
                if (sharedMediaLayout != null && (scrollSlidingTextTabStripInner = sharedMediaLayout.scrollSlidingTextTabStrip) != null && scrollSlidingTextTabStripInner.isReordering()) {
                    ProfileActivity.this.stopTabsReorder();
                    return;
                } else {
                    ProfileActivity.this.finishFragment();
                    return;
                }
            }
            if (i == 2) {
                ProfileActivity.this.onBlockContactClicked(false);
                return;
            }
            if (i == 1) {
                TLRPC.User user = ProfileActivity.this.getMessagesController().getUser(Long.valueOf(ProfileActivity.this.userId));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                bundle.putBoolean("addContact", true);
                ProfileActivity.this.openAddToContact(user, bundle);
                return;
            }
            if (i == 3) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlySelect", true);
                bundle2.putInt("dialogsType", 3);
                bundle2.putString("selectAlertString", LocaleController.getString(R.string.SendContactToText));
                bundle2.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendContactToGroupText));
                DialogsActivity dialogsActivity = new DialogsActivity(bundle2);
                dialogsActivity.setDelegate(ProfileActivity.this);
                ProfileActivity.this.presentFragment(dialogsActivity);
                return;
            }
            if (i == 4) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", ProfileActivity.this.userId);
                ProfileActivity profileActivity = ProfileActivity.this;
                profileActivity.presentFragment(new ContactAddActivity(bundle3, profileActivity.resourcesProvider));
                return;
            }
            String absolutePath = null;
            if (i == 5) {
                final TLRPC.User user2 = ProfileActivity.this.getMessagesController().getUser(Long.valueOf(ProfileActivity.this.userId));
                if (user2 == null || ProfileActivity.this.getParentActivity() == null) {
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this.getParentActivity(), ProfileActivity.this.resourcesProvider);
                builder.setTitle(LocaleController.getString(R.string.DeleteContact));
                builder.setMessage(LocaleController.getString(R.string.AreYouSureDeleteContact));
                builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        this.f$0.lambda$onItemClick$0(user2, alertDialog, i2);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                AlertDialog alertDialogCreate = builder.create();
                ProfileActivity.this.showDialog(alertDialogCreate);
                TextView textView = (TextView) alertDialogCreate.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(ProfileActivity.this.getThemedColor(Theme.key_text_RedBold));
                    return;
                }
                return;
            }
            if (i == 7) {
                ProfileActivity.this.leaveChatPressed();
                return;
            }
            if (i == 23) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(ProfileActivity.this.getContext());
                builder2.setTitle(LocaleController.getPluralString("DeleteTopics", 1));
                TLRPC.TL_forumTopic tL_forumTopicFindTopic = MessagesController.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).getTopicsController().findTopic(ProfileActivity.this.chatId, ProfileActivity.this.topicId);
                builder2.setMessage(LocaleController.formatString("DeleteSelectedTopic", R.string.DeleteSelectedTopic, tL_forumTopicFindTopic == null ? "topic" : tL_forumTopicFindTopic.title));
                builder2.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        this.f$0.lambda$onItemClick$1(alertDialog, i2);
                    }
                });
                builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        alertDialog.dismiss();
                    }
                });
                AlertDialog alertDialogCreate2 = builder2.create();
                alertDialogCreate2.show();
                TextView textView2 = (TextView) alertDialogCreate2.getButton(-1);
                if (textView2 != null) {
                    textView2.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                    return;
                }
                return;
            }
            if (i == 24) {
                ProfileActivity profileActivity2 = ProfileActivity.this;
                ReportBottomSheet.openChat(profileActivity2, profileActivity2.getDialogId());
                return;
            }
            if (i == 12) {
                if (ProfileActivity.this.isTopic) {
                    new Bundle().putLong("chat_id", ProfileActivity.this.chatId);
                    ProfileActivity.this.presentFragment(TopicCreateFragment.create(ProfileActivity.this.chatId, ProfileActivity.this.topicId));
                    return;
                }
                Bundle bundle4 = new Bundle();
                if (ProfileActivity.this.chatId != 0) {
                    bundle4.putLong("chat_id", ProfileActivity.this.chatId);
                } else if (ProfileActivity.this.isBot) {
                    bundle4.putLong("user_id", ProfileActivity.this.userId);
                }
                ChatEditActivity chatEditActivity = new ChatEditActivity(bundle4);
                if (ProfileActivity.this.chatInfo != null) {
                    chatEditActivity.setInfo(ProfileActivity.this.chatInfo);
                } else {
                    chatEditActivity.setInfo(ProfileActivity.this.userInfo);
                }
                ProfileActivity.this.presentFragment(chatEditActivity);
                return;
            }
            if (i == 41) {
                ProfileActivity.this.presentFragment(new UserInfoActivity());
                return;
            }
            if (i == 9) {
                final TLRPC.User user3 = ProfileActivity.this.getMessagesController().getUser(Long.valueOf(ProfileActivity.this.userId));
                if (user3 == null) {
                    return;
                }
                Bundle bundle5 = new Bundle();
                bundle5.putBoolean("onlySelect", true);
                bundle5.putInt("dialogsType", 2);
                bundle5.putBoolean("resetDelegate", false);
                bundle5.putBoolean("closeFragment", false);
                final DialogsActivity dialogsActivity2 = new DialogsActivity(bundle5);
                dialogsActivity2.setDelegate(new DialogsActivity.DialogsActivityDelegate() {
                    @Override
                    public boolean canSelectStories() {
                        return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
                    }

                    @Override
                    public final boolean didSelectDialogs(DialogsActivity dialogsActivity3, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i2, int i3, TopicsFragment topicsFragment) {
                        return this.f$0.lambda$onItemClick$6(user3, dialogsActivity2, dialogsActivity3, arrayList, charSequence, z, z2, i2, i3, topicsFragment);
                    }

                    @Override
                    public boolean didSelectStories(DialogsActivity dialogsActivity3) {
                        return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity3);
                    }
                });
                ProfileActivity.this.presentFragment(dialogsActivity2);
                return;
            }
            if (i == 10) {
                ProfileActivity.this.onShareClicked();
                return;
            }
            if (i == 14) {
                try {
                    if (ProfileActivity.this.currentEncryptedChat != null) {
                        jMakeEncryptedDialogId = DialogObject.makeEncryptedDialogId(ProfileActivity.this.currentEncryptedChat.id);
                    } else if (ProfileActivity.this.userId != 0) {
                        jMakeEncryptedDialogId = ProfileActivity.this.userId;
                    } else if (ProfileActivity.this.chatId == 0) {
                        return;
                    } else {
                        jMakeEncryptedDialogId = -ProfileActivity.this.chatId;
                    }
                    ProfileActivity.this.getMediaDataController().installShortcut(jMakeEncryptedDialogId, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            if (i == 15 || i == 16) {
                ProfileActivity.this.onCallClicked(i == 16);
                return;
            }
            if (i == 17) {
                Bundle bundle6 = new Bundle();
                bundle6.putLong("chat_id", ProfileActivity.this.chatId);
                bundle6.putInt("type", 2);
                bundle6.putBoolean("open_search", true);
                ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle6);
                chatUsersActivity.setInfo(ProfileActivity.this.chatInfo);
                ProfileActivity.this.presentFragment(chatUsersActivity);
                return;
            }
            if (i == 18) {
                ProfileActivity.this.openAddMember();
                return;
            }
            if (i == 19) {
                ProfileActivity.this.presentFragment(StatisticActivity.create(ProfileActivity.this.getMessagesController().getChat(Long.valueOf(ProfileActivity.this.chatId)), false));
                return;
            }
            if (i == 22) {
                ProfileActivity.this.openDiscussion();
                return;
            }
            if (i == 38) {
                ProfileActivity.this.onGiftPermiumClicked();
                return;
            }
            if (i == 39) {
                Bundle bundle7 = new Bundle();
                bundle7.putInt("type", 2);
                bundle7.putLong("dialog_id", -ProfileActivity.this.chatId);
                MediaActivity mediaActivity = new MediaActivity(bundle7, null);
                mediaActivity.setChatInfo(ProfileActivity.this.chatInfo);
                ProfileActivity.this.presentFragment(mediaActivity);
                return;
            }
            if (i == 20) {
                AlertDialog.Builder builder3 = new AlertDialog.Builder(ProfileActivity.this.getParentActivity(), ProfileActivity.this.resourcesProvider);
                builder3.setTitle(LocaleController.getString(R.string.AreYouSureSecretChatTitle));
                builder3.setMessage(LocaleController.getString(R.string.AreYouSureSecretChat));
                builder3.setPositiveButton(LocaleController.getString(R.string.Start), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        this.f$0.lambda$onItemClick$7(alertDialog, i2);
                    }
                });
                builder3.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                ProfileActivity.this.showDialog(builder3.create());
                return;
            }
            if (i == 44) {
                BotWebViewAttachedSheet.openPrivacy(((BaseFragment) ProfileActivity.this).currentAccount, ProfileActivity.this.userId);
                return;
            }
            if (i == 21) {
                if (ProfileActivity.this.getParentActivity() == null) {
                    return;
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 23 || ((i2 > 28 && !BuildVars.NO_SCOPED_STORAGE) || ProfileActivity.this.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0)) {
                    ImageLocation imageLocation = ProfileActivity.this.avatarsViewPager.getImageLocation(ProfileActivity.this.avatarsViewPager.getRealPosition());
                    if (imageLocation == null) {
                        return;
                    }
                    final boolean z = imageLocation.imageType == 2;
                    File pathToAttach = FileLoader.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).getPathToAttach(imageLocation.location, z ? "mp4" : null, true);
                    if (z && !pathToAttach.exists()) {
                        pathToAttach = new File(FileLoader.getDirectory(0), FileLoader.getAttachFileName(imageLocation.location, "mp4"));
                    }
                    if (pathToAttach.exists()) {
                        MediaController.saveFile(pathToAttach.toString(), ProfileActivity.this.getParentActivity(), 0, null, null, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                this.f$0.lambda$onItemClick$8(z, (Uri) obj);
                            }
                        });
                        return;
                    }
                    return;
                }
                ProfileActivity.this.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            if (i == 30) {
                ProfileActivity.this.presentFragment(new UserInfoActivity());
                return;
            }
            if (i == 40) {
                ProfileActivity.this.presentFragment(new PeerColorActivity(0L).startOnProfile().setOnApplied(ProfileActivity.this));
                return;
            }
            if (i == 42) {
                AndroidUtilities.addToClipboard(ProfileActivity.this.getMessagesController().linkPrefix + "/" + UserObject.getPublicUsername(ProfileActivity.this.getMessagesController().getUser(Long.valueOf(ProfileActivity.this.userId))));
                return;
            }
            if (i == 43) {
                ProfileActivity.this.presentFragment(new ChangeUsernameActivity());
                return;
            }
            if (i == 31) {
                ProfileActivity.this.presentFragment(new LogoutActivity());
                return;
            }
            if (i == 33) {
                int realPosition = ProfileActivity.this.avatarsViewPager.getRealPosition();
                final TLRPC.Photo photo = ProfileActivity.this.avatarsViewPager.getPhoto(realPosition);
                if (photo == null) {
                    return;
                }
                ProfileActivity.this.avatarsViewPager.startMovePhotoToBegin(realPosition);
                TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_photos_updateProfilePhoto.id = tL_inputPhoto;
                tL_inputPhoto.id = photo.id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                final UserConfig userConfig = ProfileActivity.this.getUserConfig();
                ProfileActivity.this.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$onItemClick$10(userConfig, photo, tLObject, tL_error);
                    }
                });
                ProfileActivity.this.undoView.showWithAction(ProfileActivity.this.userId, 22, photo.video_sizes.isEmpty() ? null : 1);
                TLRPC.User user4 = ProfileActivity.this.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 800);
                if (user4 != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 90);
                    TLRPC.UserProfilePhoto userProfilePhoto = user4.photo;
                    userProfilePhoto.photo_id = photo.id;
                    userProfilePhoto.photo_small = closestPhotoSizeWithSize2.location;
                    userProfilePhoto.photo_big = closestPhotoSizeWithSize.location;
                    userConfig.setCurrentUser(user4);
                    userConfig.saveConfig(true);
                    NotificationCenter.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                    ProfileActivity.this.updateProfileData(true);
                }
                ProfileActivity.this.avatarsViewPager.commitMoveToBegin();
                return;
            }
            if (i == 34) {
                if (MessagesController.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).isFrozen()) {
                    AccountFrozenAlert.show(((BaseFragment) ProfileActivity.this).currentAccount);
                    return;
                }
                int realPosition2 = ProfileActivity.this.avatarsViewPager.getRealPosition();
                ImageLocation imageLocation2 = ProfileActivity.this.avatarsViewPager.getImageLocation(realPosition2);
                if (imageLocation2 == null) {
                    return;
                }
                File pathToAttach2 = FileLoader.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).getPathToAttach(PhotoViewer.getFileLocation(imageLocation2), PhotoViewer.getFileLocationExt(imageLocation2), true);
                boolean z2 = imageLocation2.imageType == 2;
                if (z2) {
                    ImageLocation realImageLocation = ProfileActivity.this.avatarsViewPager.getRealImageLocation(realPosition2);
                    absolutePath = FileLoader.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).getPathToAttach(PhotoViewer.getFileLocation(realImageLocation), PhotoViewer.getFileLocationExt(realImageLocation), true).getAbsolutePath();
                }
                ProfileActivity.this.imageUpdater.openPhotoForEdit(pathToAttach2.getAbsolutePath(), absolutePath, 0, z2);
                return;
            }
            if (i != 35) {
                if (i == 36) {
                    ProfileActivity.this.onWriteButtonClick();
                    return;
                }
                return;
            }
            AlertDialog.Builder builder4 = new AlertDialog.Builder(ProfileActivity.this.getParentActivity(), ProfileActivity.this.resourcesProvider);
            ImageLocation imageLocation3 = ProfileActivity.this.avatarsViewPager.getImageLocation(ProfileActivity.this.avatarsViewPager.getRealPosition());
            if (imageLocation3 == null) {
                return;
            }
            if (imageLocation3.imageType == 2) {
                builder4.setTitle(LocaleController.getString(R.string.AreYouSureDeleteVideoTitle));
                builder4.setMessage(LocaleController.getString(R.string.AreYouSureDeleteVideo));
            } else {
                builder4.setTitle(LocaleController.getString(R.string.AreYouSureDeletePhotoTitle));
                builder4.setMessage(LocaleController.getString(R.string.AreYouSureDeletePhoto));
            }
            builder4.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i3) {
                    this.f$0.lambda$onItemClick$11(alertDialog, i3);
                }
            });
            builder4.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialogCreate3 = builder4.create();
            ProfileActivity.this.showDialog(alertDialogCreate3);
            TextView textView3 = (TextView) alertDialogCreate3.getButton(-1);
            if (textView3 != null) {
                textView3.setTextColor(ProfileActivity.this.getThemedColor(Theme.key_text_RedBold));
            }
        }

        public void lambda$onItemClick$0(TLRPC.User user, AlertDialog alertDialog, int i) {
            ArrayList<TLRPC.User> arrayList = new ArrayList<>();
            arrayList.add(user);
            ProfileActivity.this.getContactsController().deleteContact(arrayList, true);
            if (user != null) {
                user.contact = false;
                ProfileActivity.this.updateListAnimated(false);
            }
        }

        public void lambda$onItemClick$1(AlertDialog alertDialog, int i) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(Integer.valueOf((int) ProfileActivity.this.topicId));
            ProfileActivity.this.getMessagesController().getTopicsController().deleteTopics(ProfileActivity.this.chatId, arrayList);
            ProfileActivity.this.playProfileAnimation = 0;
            if (((BaseFragment) ProfileActivity.this).parentLayout != null && ((BaseFragment) ProfileActivity.this).parentLayout.getFragmentStack() != null) {
                for (int i2 = 0; i2 < ((BaseFragment) ProfileActivity.this).parentLayout.getFragmentStack().size(); i2++) {
                    BaseFragment baseFragment = (BaseFragment) ((BaseFragment) ProfileActivity.this).parentLayout.getFragmentStack().get(i2);
                    if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).getTopicId() == ProfileActivity.this.topicId) {
                        baseFragment.removeSelfFromStack();
                    }
                }
            }
            ProfileActivity.this.finishFragment();
            Context context = ProfileActivity.this.getContext();
            if (context != null) {
                BulletinFactory.of(Bulletin.BulletinWindow.make(context), ProfileActivity.this.resourcesProvider).createSimpleBulletin(R.raw.ic_delete, LocaleController.getPluralString("TopicsDeleted", 1)).show();
            }
            alertDialog.dismiss();
        }

        public boolean lambda$onItemClick$6(final TLRPC.User user, final DialogsActivity dialogsActivity, final DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
            TLRPC.TL_chatAdminRights tL_chatAdminRights;
            final long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            TLRPC.Chat chat = MessagesController.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).getChat(Long.valueOf(-j));
            if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
                ProfileActivity.this.getMessagesController().checkIsInChat(false, chat, user, new MessagesController.IsInChatCheckedCallback() {
                    @Override
                    public final void run(boolean z3, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str) {
                        this.f$0.lambda$onItemClick$4(j, dialogsActivity, z3, tL_chatAdminRights2, str);
                    }
                });
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this.getParentActivity(), ProfileActivity.this.resourcesProvider);
                int i3 = R.string.AddBot;
                builder.setTitle(LocaleController.getString(i3));
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), chat == null ? "" : chat.title)));
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                builder.setPositiveButton(LocaleController.getString(i3), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i4) {
                        this.f$0.lambda$onItemClick$5(j, dialogsActivity2, user, alertDialog, i4);
                    }
                });
                ProfileActivity.this.showDialog(builder.create());
            }
            return true;
        }

        public void lambda$onItemClick$4(final long j, final DialogsActivity dialogsActivity, final boolean z, final TLRPC.TL_chatAdminRights tL_chatAdminRights, final String str) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onItemClick$3(j, tL_chatAdminRights, str, z, dialogsActivity);
                }
            });
        }

        public void lambda$onItemClick$3(long j, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str, boolean z, final DialogsActivity dialogsActivity) {
            ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(ProfileActivity.this.userId, -j, tL_chatAdminRights, null, null, str, 2, true, !z, null);
            chatRightsEditActivity.setDelegate(new ChatRightsEditActivity.ChatRightsEditActivityDelegate() {
                @Override
                public void didChangeOwner(TLRPC.User user) {
                }

                @Override
                public void didSetRights(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights2, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str2) {
                    ProfileActivity.this.disableProfileAnimation = true;
                    dialogsActivity.removeSelfFromStack();
                    NotificationCenter notificationCenter = ProfileActivity.this.getNotificationCenter();
                    ProfileActivity profileActivity = ProfileActivity.this;
                    int i2 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i2);
                    ProfileActivity.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i2, new Object[0]);
                }
            });
            ProfileActivity.this.presentFragment(chatRightsEditActivity);
        }

        public void lambda$onItemClick$5(long j, DialogsActivity dialogsActivity, TLRPC.User user, AlertDialog alertDialog, int i) {
            ProfileActivity.this.disableProfileAnimation = true;
            Bundle bundle = new Bundle();
            bundle.putBoolean("scrollToTopOnResume", true);
            long j2 = -j;
            bundle.putLong("chat_id", j2);
            if (ProfileActivity.this.getMessagesController().checkCanOpenChat(bundle, dialogsActivity)) {
                ChatActivity chatActivity = new ChatActivity(bundle);
                NotificationCenter notificationCenter = ProfileActivity.this.getNotificationCenter();
                ProfileActivity profileActivity = ProfileActivity.this;
                int i2 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i2);
                ProfileActivity.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i2, new Object[0]);
                ProfileActivity.this.getMessagesController().addUserToChat(j2, user, 0, null, chatActivity, true, null, null);
                ProfileActivity.this.presentFragment(chatActivity, true);
            }
        }

        public void lambda$onItemClick$7(AlertDialog alertDialog, int i) {
            if (MessagesController.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).isFrozen()) {
                AccountFrozenAlert.show(((BaseFragment) ProfileActivity.this).currentAccount);
            } else {
                ProfileActivity.this.creatingChat = true;
                ProfileActivity.this.getSecretChatHelper().startSecretChat(ProfileActivity.this.getParentActivity(), ProfileActivity.this.getMessagesController().getUser(Long.valueOf(ProfileActivity.this.userId)));
            }
        }

        public void lambda$onItemClick$8(boolean z, Uri uri) {
            if (ProfileActivity.this.getParentActivity() == null) {
                return;
            }
            BulletinFactory.createSaveToGalleryBulletin(ProfileActivity.this, z, (Theme.ResourcesProvider) null).show();
        }

        public void lambda$onItemClick$10(final UserConfig userConfig, final TLRPC.Photo photo, final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onItemClick$9(tLObject, userConfig, photo);
                }
            });
        }

        public void lambda$onItemClick$9(TLObject tLObject, UserConfig userConfig, TLRPC.Photo photo) {
            ProfileActivity.this.avatarsViewPager.finishSettingMainPhoto();
            if (tLObject instanceof TLRPC.TL_photos_photo) {
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                ProfileActivity.this.getMessagesController().putUsers(tL_photos_photo.users, false);
                TLRPC.User user = ProfileActivity.this.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                    ProfileActivity.this.avatarsViewPager.replaceFirstPhoto(photo, tL_photos_photo.photo);
                    if (user != null) {
                        user.photo.photo_id = tL_photos_photo.photo.id;
                        userConfig.setCurrentUser(user);
                        userConfig.saveConfig(true);
                    }
                }
            }
        }

        public void lambda$onItemClick$11(AlertDialog alertDialog, int i) {
            TLRPC.Photo photo;
            int realPosition = ProfileActivity.this.avatarsViewPager.getRealPosition();
            TLRPC.Photo photo2 = ProfileActivity.this.avatarsViewPager.getPhoto(realPosition);
            TLRPC.UserFull userInfo = ProfileActivity.this.getUserInfo();
            if (ProfileActivity.this.avatar == null || realPosition != 0) {
                if (ProfileActivity.this.hasFallbackPhoto && photo2 != null && userInfo != null && (photo = userInfo.fallback_photo) != null && photo.id == photo2.id) {
                    userInfo.fallback_photo = null;
                    userInfo.flags &= -4194305;
                    ProfileActivity.this.getMessagesStorage().updateUserInfo(userInfo, true);
                    ProfileActivity.this.updateProfileData(false);
                }
                if (ProfileActivity.this.avatarsViewPager.getRealCount() == 1) {
                    ProfileActivity.this.setForegroundImage(true);
                }
                if (photo2 == null || ProfileActivity.this.avatarsViewPager.getRealPosition() == 0) {
                    TLRPC.Photo photo3 = ProfileActivity.this.avatarsViewPager.getPhoto(1);
                    if (photo3 != null) {
                        ProfileActivity.this.getUserConfig().getCurrentUser().photo = new TLRPC.TL_userProfilePhoto();
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo3.sizes, 90);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo3.sizes, 1000);
                        if (closestPhotoSizeWithSize != null && closestPhotoSizeWithSize2 != null) {
                            ProfileActivity.this.getUserConfig().getCurrentUser().photo.photo_small = closestPhotoSizeWithSize.location;
                            ProfileActivity.this.getUserConfig().getCurrentUser().photo.photo_big = closestPhotoSizeWithSize2.location;
                        }
                    } else {
                        ProfileActivity.this.getUserConfig().getCurrentUser().photo = new TLRPC.TL_userProfilePhotoEmpty();
                    }
                    ProfileActivity.this.getMessagesController().deleteUserPhoto(null);
                } else {
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    tL_inputPhoto.id = photo2.id;
                    tL_inputPhoto.access_hash = photo2.access_hash;
                    byte[] bArr = photo2.file_reference;
                    tL_inputPhoto.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputPhoto.file_reference = new byte[0];
                    }
                    ProfileActivity.this.getMessagesController().deleteUserPhoto(tL_inputPhoto);
                    ProfileActivity.this.getMessagesStorage().clearUserPhoto(ProfileActivity.this.userId, photo2.id);
                }
                if (ProfileActivity.this.avatarsViewPager.removePhotoAtIndex(realPosition) || ProfileActivity.this.avatarsViewPager.getRealCount() <= 0) {
                    ProfileActivity.this.avatarsViewPager.setVisibility(8);
                    ProfileActivity.this.avatarImage.setForegroundAlpha(1.0f);
                    ProfileActivity.this.avatarContainer.setVisibility(0);
                    ProfileActivity.this.doNotSetForeground = true;
                    View viewFindViewByPosition = ProfileActivity.this.layoutManager.findViewByPosition(0);
                    if (viewFindViewByPosition != null) {
                        ProfileActivity.this.listView.smoothScrollBy(0, viewFindViewByPosition.getTop() - ProfileActivity.this.getHeaderExtraHeight(), CubicBezierInterpolator.EASE_OUT_QUINT);
                        return;
                    }
                    return;
                }
                return;
            }
            ProfileActivity.this.imageUpdater.cancel();
            ProfileActivity profileActivity = ProfileActivity.this;
            if (profileActivity.avatarUploadingRequest != 0) {
                profileActivity.getConnectionsManager().cancelRequest(ProfileActivity.this.avatarUploadingRequest, true);
            }
            ProfileActivity.this.allowPullingDown = (AndroidUtilities.isTablet() || ProfileActivity.this.isInLandscapeMode || !ProfileActivity.this.avatarImage.getImageReceiver().hasNotThumb() || AndroidUtilities.isAccessibilityScreenReaderEnabled()) ? false : true;
            ProfileActivity.this.avatar = null;
            ProfileActivity.this.avatarBig = null;
            ProfileActivity.this.avatarsViewPager.scrolledByUser = true;
            ProfileActivity.this.avatarsViewPager.removeUploadingImage(ProfileActivity.this.uploadingImageLocation);
            ProfileActivity.this.avatarsViewPager.setCreateThumbFromParent(false);
            ProfileActivity.this.updateProfileData(true);
            ProfileActivity.this.showAvatarProgress(false, true);
            ProfileActivity.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
            ProfileActivity.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            ProfileActivity.this.getUserConfig().saveConfig(true);
        }
    }

    class AnonymousClass7 extends NestedFrameLayout {
        private Paint grayPaint;
        private boolean ignoreLayout;
        private final ArrayList sortedChildren;
        private final Comparator viewComparator;
        private boolean wasPortrait;

        @Override
        public boolean hasOverlappingRendering() {
            return false;
        }

        AnonymousClass7(Context context) {
            super(context);
            this.grayPaint = new Paint();
            this.sortedChildren = new ArrayList();
            this.viewComparator = new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return ProfileActivity.AnonymousClass7.lambda$$1((View) obj, (View) obj2);
                }
            };
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (ProfileActivity.this.pinchToZoomHelper.isInOverlayMode()) {
                return ProfileActivity.this.pinchToZoomHelper.onTouchEvent(motionEvent);
            }
            SharedMediaLayout sharedMediaLayout = ProfileActivity.this.sharedMediaLayout;
            if (sharedMediaLayout != null && sharedMediaLayout.isInFastScroll() && ProfileActivity.this.sharedMediaLayout.isPinnedToTop()) {
                return ProfileActivity.this.sharedMediaLayout.dispatchFastScrollEvent(motionEvent);
            }
            SharedMediaLayout sharedMediaLayout2 = ProfileActivity.this.sharedMediaLayout;
            if (sharedMediaLayout2 == null || !sharedMediaLayout2.checkPinchToZoom(motionEvent)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            return true;
        }

        @Override
        protected void onMeasure(int r18, int r19) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.AnonymousClass7.onMeasure(int, int):void");
        }

        public void lambda$onMeasure$0() {
            if (ProfileActivity.this.selectAnimatedEmojiDialog != null) {
                ProfileActivity.this.selectAnimatedEmojiDialog.dismiss();
                ProfileActivity.this.selectAnimatedEmojiDialog = null;
            }
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ProfileActivity profileActivity = ProfileActivity.this;
            profileActivity.savedScrollPosition = -1;
            profileActivity.firstLayout = false;
            ProfileActivity.this.invalidateScroll = false;
            ProfileActivity.this.checkListViewScroll();
        }

        @Override
        public void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        public static int lambda$$1(View view, View view2) {
            return (int) (view.getY() - view2.getY());
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            FragmentContextView fragmentContextView;
            boolean z;
            int i;
            if (Build.VERSION.SDK_INT >= 31 && ProfileActivity.this.scrollableViewNoiseSuppressor != null) {
                ProfileActivity.this.blur3_InvalidateBlur();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                if (ProfileActivity.this.iBlur3SourceGlass != null && !ProfileActivity.this.iBlur3SourceGlass.inRecording()) {
                    RecordingCanvas recordingCanvasBeginRecording = ProfileActivity.this.iBlur3SourceGlass.beginRecording(measuredWidth, measuredHeight);
                    recordingCanvasBeginRecording.drawColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    if (SharedConfig.chatBlurEnabled()) {
                        ProfileActivity.this.scrollableViewNoiseSuppressor.draw(recordingCanvasBeginRecording, -2);
                    }
                    ProfileActivity.this.iBlur3SourceGlass.endRecording();
                }
                ProfileActivity.this.iBlur3Invalidated = false;
            }
            ProfileActivity.this.whitePaint.setColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
            if (ProfileActivity.this.listView.getVisibility() != 0) {
                canvas.drawRect(0.0f, ProfileActivity.this.searchTransitionOffset + ProfileActivity.this.searchListView.getTop() + ProfileActivity.this.extraHeight, getMeasuredWidth(), r1 + getMeasuredHeight(), ProfileActivity.this.whitePaint);
            } else {
                this.grayPaint.setColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundGray));
                if (ProfileActivity.this.transitionAnimationInProress) {
                    ProfileActivity.this.whitePaint.setAlpha((int) (ProfileActivity.this.listView.getAlpha() * 255.0f));
                }
                if (ProfileActivity.this.transitionAnimationInProress) {
                    this.grayPaint.setAlpha((int) (ProfileActivity.this.listView.getAlpha() * 255.0f));
                }
                int childCount = ProfileActivity.this.listView.getChildCount();
                this.sortedChildren.clear();
                boolean z2 = false;
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (ProfileActivity.this.listView.getChildAdapterPosition(ProfileActivity.this.listView.getChildAt(i2)) != -1) {
                        this.sortedChildren.add(ProfileActivity.this.listView.getChildAt(i2));
                    } else {
                        z2 = true;
                    }
                }
                Collections.sort(this.sortedChildren, this.viewComparator);
                float y = ProfileActivity.this.listView.getY();
                int size = this.sortedChildren.size();
                if (!ProfileActivity.this.openAnimationInProgress && size > 0 && !z2) {
                    y += ((View) this.sortedChildren.get(0)).getY();
                }
                float f = y;
                boolean z3 = false;
                float alpha = 1.0f;
                for (int i3 = 0; i3 < size; i3++) {
                    View view = (View) this.sortedChildren.get(i3);
                    boolean z4 = view.getBackground() != null;
                    int y2 = (int) (ProfileActivity.this.listView.getY() + view.getY());
                    if (z3 != z4) {
                        if (z3) {
                            z = z4;
                            canvas.drawRect(ProfileActivity.this.listView.getX(), f, ProfileActivity.this.listView.getX() + ProfileActivity.this.listView.getMeasuredWidth(), y2, this.grayPaint);
                            i = y2;
                        } else {
                            z = z4;
                            if (alpha != 1.0f) {
                                float f2 = y2;
                                i = y2;
                                canvas.drawRect(ProfileActivity.this.listView.getX(), f, ProfileActivity.this.listView.getX() + ProfileActivity.this.listView.getMeasuredWidth(), f2, this.grayPaint);
                                ProfileActivity.this.whitePaint.setAlpha((int) (alpha * 255.0f));
                                canvas.drawRect(ProfileActivity.this.listView.getX(), f, ProfileActivity.this.listView.getX() + ProfileActivity.this.listView.getMeasuredWidth(), f2, ProfileActivity.this.whitePaint);
                                ProfileActivity.this.whitePaint.setAlpha(255);
                            } else {
                                i = y2;
                                canvas.drawRect(ProfileActivity.this.listView.getX(), f, ProfileActivity.this.listView.getX() + ProfileActivity.this.listView.getMeasuredWidth(), i, ProfileActivity.this.whitePaint);
                            }
                        }
                        f = i;
                        alpha = view.getAlpha();
                        z3 = z;
                    } else if (view.getAlpha() == 1.0f) {
                        alpha = 1.0f;
                    }
                }
                if (z3) {
                    canvas.drawRect(ProfileActivity.this.listView.getX(), f, ProfileActivity.this.listView.getX() + ProfileActivity.this.listView.getMeasuredWidth(), ProfileActivity.this.listView.getBottom(), this.grayPaint);
                } else if (alpha != 1.0f) {
                    canvas.drawRect(ProfileActivity.this.listView.getX(), f, ProfileActivity.this.listView.getX() + ProfileActivity.this.listView.getMeasuredWidth(), ProfileActivity.this.listView.getBottom(), this.grayPaint);
                    ProfileActivity.this.whitePaint.setAlpha((int) (alpha * 255.0f));
                    canvas.drawRect(ProfileActivity.this.listView.getX(), f, ProfileActivity.this.listView.getX() + ProfileActivity.this.listView.getMeasuredWidth(), ProfileActivity.this.listView.getBottom(), ProfileActivity.this.whitePaint);
                    ProfileActivity.this.whitePaint.setAlpha(255);
                } else {
                    canvas.drawRect(ProfileActivity.this.listView.getX(), f, ProfileActivity.this.listView.getX() + ProfileActivity.this.listView.getMeasuredWidth(), ProfileActivity.this.listView.getBottom(), ProfileActivity.this.whitePaint);
                }
            }
            super.dispatchDraw(canvas);
            ProfileActivity profileActivity = ProfileActivity.this;
            if (profileActivity.profileTransitionInProgress && ((BaseFragment) profileActivity).parentLayout.getFragmentStack().size() > 1) {
                BaseFragment baseFragment = (BaseFragment) ((BaseFragment) ProfileActivity.this).parentLayout.getFragmentStack().get(((BaseFragment) ProfileActivity.this).parentLayout.getFragmentStack().size() - 2);
                if ((baseFragment instanceof ChatActivity) && (fragmentContextView = ((ChatActivity) baseFragment).getFragmentContextView()) != null && fragmentContextView.isCallStyle()) {
                    float fDpf2 = ProfileActivity.this.extraHeight / AndroidUtilities.dpf2(fragmentContextView.getStyleHeight());
                    if (fDpf2 > 1.0f) {
                        fDpf2 = 1.0f;
                    }
                    canvas.save();
                    canvas.translate(fragmentContextView.getX(), fragmentContextView.getY());
                    fragmentContextView.setDrawOverlay(true);
                    fragmentContextView.setCollapseTransition(true, ProfileActivity.this.extraHeight, fDpf2);
                    fragmentContextView.draw(canvas);
                    fragmentContextView.setCollapseTransition(false, ProfileActivity.this.extraHeight, fDpf2);
                    fragmentContextView.setDrawOverlay(false);
                    canvas.restore();
                }
            }
            if (ProfileActivity.this.scrimPaint.getAlpha() > 0) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ProfileActivity.this.scrimPaint);
            }
            if (ProfileActivity.this.scrimView != null) {
                int iSave = canvas.save();
                canvas.translate(ProfileActivity.this.scrimView.getLeft(), ProfileActivity.this.scrimView.getTop());
                if (ProfileActivity.this.scrimView == ((BaseFragment) ProfileActivity.this).actionBar.getBackButton()) {
                    int iMax = Math.max(ProfileActivity.this.scrimView.getMeasuredWidth(), ProfileActivity.this.scrimView.getMeasuredHeight()) / 2;
                    int alpha2 = ProfileActivity.this.actionBarBackgroundPaint.getAlpha();
                    ProfileActivity.this.actionBarBackgroundPaint.setAlpha((int) ((alpha2 * (ProfileActivity.this.scrimPaint.getAlpha() / 255.0f)) / 0.3f));
                    float f3 = iMax;
                    canvas.drawCircle(f3, f3, 0.7f * f3, ProfileActivity.this.actionBarBackgroundPaint);
                    ProfileActivity.this.actionBarBackgroundPaint.setAlpha(alpha2);
                }
                ProfileActivity.this.scrimView.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (ProfileActivity.this.blurredView != null && ProfileActivity.this.blurredView.getVisibility() == 0) {
                if (ProfileActivity.this.blurredView.getAlpha() == 1.0f) {
                    ProfileActivity.this.blurredView.draw(canvas);
                } else if (ProfileActivity.this.blurredView.getAlpha() != 0.0f) {
                    canvas.saveLayerAlpha(ProfileActivity.this.blurredView.getLeft(), ProfileActivity.this.blurredView.getTop(), ProfileActivity.this.blurredView.getRight(), ProfileActivity.this.blurredView.getBottom(), (int) (ProfileActivity.this.blurredView.getAlpha() * 255.0f), 31);
                    canvas.translate(ProfileActivity.this.blurredView.getLeft(), ProfileActivity.this.blurredView.getTop());
                    ProfileActivity.this.blurredView.draw(canvas);
                    canvas.restore();
                }
            }
            if (ProfileActivity.this.hasMainTabs) {
                return;
            }
            canvas.save();
            canvas.translate(ProfileActivity.this.getInternalTranslationX(), 0.0f);
            AndroidUtilities.drawNavigationBarProtection(canvas, this, ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite), ProfileActivity.this.navigationBarHeight, ProfileActivity.this.getInternalVisibility());
            canvas.restore();
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if ((ProfileActivity.this.pinchToZoomHelper.isInOverlayMode() && (view == ProfileActivity.this.avatarContainer2 || view == ((BaseFragment) ProfileActivity.this).actionBar || view == ProfileActivity.this.writeButton)) || view == ProfileActivity.this.blurredView) {
                return true;
            }
            return super.drawChild(canvas, view, j);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            ProfileActivity.this.fragmentViewAttached = true;
            for (int i = 0; i < ProfileActivity.this.emojiStatusDrawable.length; i++) {
                if (ProfileActivity.this.emojiStatusDrawable[i] != null) {
                    ProfileActivity.this.emojiStatusDrawable[i].attach();
                }
            }
            for (int i2 = 0; i2 < ProfileActivity.this.botVerificationDrawable.length; i2++) {
                if (ProfileActivity.this.botVerificationDrawable[i2] != null) {
                    ProfileActivity.this.botVerificationDrawable[i2].attach();
                }
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            ProfileActivity.this.fragmentViewAttached = false;
            for (int i = 0; i < ProfileActivity.this.emojiStatusDrawable.length; i++) {
                if (ProfileActivity.this.emojiStatusDrawable[i] != null) {
                    ProfileActivity.this.emojiStatusDrawable[i].detach();
                }
            }
            for (int i2 = 0; i2 < ProfileActivity.this.botVerificationDrawable.length; i2++) {
                if (ProfileActivity.this.botVerificationDrawable[i2] != null) {
                    ProfileActivity.this.botVerificationDrawable[i2].detach();
                }
            }
        }
    }

    public void lambda$createView$11(int i, View view) throws Resources.NotFoundException, IOException {
        int i2;
        Bulletin bulletinShow;
        if (i == 0 && !this.sharedMediaLayout.isActionModeShown()) {
            if (SharedMediaLayout.isStoryAlbumPageType(this.sharedMediaLayout.getClosestTab())) {
                SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
                this.sharedMediaLayout.openAddStoriesToAlbumSheet(this, getDialogId(), sharedMediaLayout.storyAlbums_getAlbumIdByTabType(sharedMediaLayout.getClosestTab()));
                return;
            } else if (!getMessagesController().storiesEnabled()) {
                showDialog(new PremiumFeatureBottomSheet(this, 14, true));
                return;
            } else {
                getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                StoryRecorder.getInstance(getParentActivity(), getCurrentAccount()).closeToWhenSent(new StoryRecorder.ClosingViewProvider() {
                    @Override
                    public void preLayout(long j, Runnable runnable) {
                        ProfileActivity.this.avatarImage.setHasStories(ProfileActivity.this.needInsetForStories());
                        if (j == ProfileActivity.this.getDialogId()) {
                            ProfileActivity.this.collapseAvatarInstant();
                        }
                        AndroidUtilities.runOnUIThread(runnable, 30L);
                    }

                    @Override
                    public StoryRecorder.SourceView getView(long j) {
                        if (j != ProfileActivity.this.getDialogId()) {
                            return null;
                        }
                        ProfileActivity.this.updateAvatarRoundRadius();
                        return StoryRecorder.SourceView.fromAvatarImage(ProfileActivity.this.avatarImage, ChatObject.isForum(ProfileActivity.this.currentChat));
                    }
                }).open(null);
                return;
            }
        }
        if (SharedMediaLayout.isStoryAlbumPageType(this.sharedMediaLayout.getClosestTab())) {
            final long dialogId = getDialogId();
            SharedMediaLayout sharedMediaLayout2 = this.sharedMediaLayout;
            final int iStoryAlbums_getAlbumIdByTabType = sharedMediaLayout2.storyAlbums_getAlbumIdByTabType(sharedMediaLayout2.getClosestTab());
            String albumName = getMessagesController().getStoriesController().getAlbumName(dialogId, iStoryAlbums_getAlbumIdByTabType);
            Runnable runnable = this.applyBulletin;
            if (runnable != null) {
                runnable.run();
                this.applyBulletin = null;
            }
            Bulletin.hideVisible();
            final ArrayList arrayList = new ArrayList();
            SparseArray<MessageObject> actionModeSelected = this.sharedMediaLayout.getActionModeSelected();
            if (actionModeSelected != null) {
                for (int i3 = 0; i3 < actionModeSelected.size(); i3++) {
                    TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i3).storyItem;
                    if (storyItem != null) {
                        arrayList.add(storyItem);
                    }
                }
            }
            this.sharedMediaLayout.closeActionMode(false);
            if (arrayList.isEmpty()) {
                return;
            }
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createView$7(dialogId, iStoryAlbums_getAlbumIdByTabType, arrayList);
                }
            };
            getMessagesController().getStoriesController().removeStoriesFromAlbum(dialogId, iStoryAlbums_getAlbumIdByTabType, arrayList);
            BulletinFactory.of(this).createSimpleBulletin(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList.size(), albumName)), LocaleController.getString(R.string.Undo), runnable2).show();
            return;
        }
        final long clientUserId = getUserConfig().getClientUserId();
        Runnable runnable3 = this.applyBulletin;
        if (runnable3 != null) {
            runnable3.run();
            this.applyBulletin = null;
        }
        Bulletin.hideVisible();
        boolean z = this.sharedMediaLayout.getClosestTab() == 9;
        final ArrayList arrayList2 = new ArrayList();
        SparseArray<MessageObject> actionModeSelected2 = this.sharedMediaLayout.getActionModeSelected();
        if (actionModeSelected2 != null) {
            int i4 = 0;
            for (int i5 = 0; i5 < actionModeSelected2.size(); i5++) {
                TL_stories.StoryItem storyItem2 = actionModeSelected2.valueAt(i5).storyItem;
                if (storyItem2 != null) {
                    arrayList2.add(storyItem2);
                    i4++;
                }
            }
            i2 = i4;
        } else {
            i2 = 0;
        }
        this.sharedMediaLayout.closeActionMode(false);
        if (z) {
            this.sharedMediaLayout.scrollToPage(8);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        final boolean[] zArr = new boolean[arrayList2.size()];
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            TL_stories.StoryItem storyItem3 = (TL_stories.StoryItem) arrayList2.get(i6);
            zArr[i6] = storyItem3.pinned;
            storyItem3.pinned = z;
        }
        getMessagesController().getStoriesController().updateStoriesInLists(clientUserId, arrayList2);
        final boolean[] zArr2 = {false};
        final boolean z2 = z;
        this.applyBulletin = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$8(clientUserId, arrayList2, z2);
            }
        };
        Runnable runnable4 = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$9(zArr2, arrayList2, zArr, clientUserId);
            }
        };
        if (z) {
            bulletinShow = BulletinFactory.of(this).createSimpleBulletin(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i2, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.Undo), runnable4).show();
        } else {
            bulletinShow = BulletinFactory.of(this).createSimpleBulletin(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i2, new Object[0]), LocaleController.getString(R.string.Undo), 5000, runnable4).show();
        }
        bulletinShow.setOnHideListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$10(zArr2);
            }
        });
    }

    public void lambda$createView$7(long j, int i, ArrayList arrayList) {
        getMessagesController().getStoriesController().addStoriesToAlbum(j, i, arrayList);
    }

    public void lambda$createView$8(long j, ArrayList arrayList, boolean z) {
        getMessagesController().getStoriesController().updateStoriesPinned(j, arrayList, z, null);
    }

    public void lambda$createView$9(boolean[] zArr, ArrayList arrayList, boolean[] zArr2, long j) {
        zArr[0] = true;
        AndroidUtilities.cancelRunOnUIThread(this.applyBulletin);
        for (int i = 0; i < arrayList.size(); i++) {
            ((TL_stories.StoryItem) arrayList.get(i)).pinned = zArr2[i];
        }
        getMessagesController().getStoriesController().updateStoriesInLists(j, arrayList);
    }

    public void lambda$createView$10(boolean[] zArr) {
        Runnable runnable;
        if (!zArr[0] && (runnable = this.applyBulletin) != null) {
            runnable.run();
        }
        this.applyBulletin = null;
    }

    class AnonymousClass9 extends SharedMediaLayout {
        private boolean openedGiftsCollection;

        @Override
        protected int getInitialTab() {
            return 8;
        }

        AnonymousClass9(Context context, long j, SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader, int i, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i2, int i3, BaseFragment baseFragment, SharedMediaLayout.Delegate delegate, int i4, Theme.ResourcesProvider resourcesProvider) {
            super(context, j, sharedMediaPreloader, i, arrayList, chatFull, userFull, i2, i3, baseFragment, delegate, i4, resourcesProvider);
        }

        @Override
        protected int processColor(int i) {
            return ProfileActivity.this.dontApplyPeerColor(i, false);
        }

        @Override
        protected void onSelectedTabChanged() {
            ProfileActivity.this.updateSelectedMediaTabText();
        }

        @Override
        protected boolean includeSavedDialogs() {
            return ProfileActivity.this.dialogId == ProfileActivity.this.getUserConfig().getClientUserId() && !ProfileActivity.this.saved;
        }

        @Override
        protected boolean isSelf() {
            return ProfileActivity.this.myProfile;
        }

        @Override
        protected boolean isStoriesView() {
            return ProfileActivity.this.myProfile;
        }

        @Override
        protected void onSearchStateChanged(boolean z) {
            AndroidUtilities.removeAdjustResize(ProfileActivity.this.getParentActivity(), ((BaseFragment) ProfileActivity.this).classGuid);
            ProfileActivity.this.listView.stopScroll();
            ProfileActivity.this.avatarContainer2.setPivotY(ProfileActivity.this.avatarContainer.getPivotY() + (ProfileActivity.this.avatarContainer.getMeasuredHeight() / 2.0f));
            ProfileActivity.this.avatarContainer2.setPivotX(ProfileActivity.this.avatarContainer2.getMeasuredWidth() / 2.0f);
            AndroidUtilities.updateViewVisibilityAnimated(ProfileActivity.this.avatarContainer2, !z, 0.95f, true);
            ProfileActivity.this.callItem.setVisibility((z || !ProfileActivity.this.callItemVisible) ? 8 : 4);
            ProfileActivity.this.videoCallItem.setVisibility((z || !ProfileActivity.this.videoCallItemVisible) ? 8 : 4);
            ProfileActivity.this.editItem.setVisibility((z || !ProfileActivity.this.editItemVisible) ? 8 : 4);
            ProfileActivity.this.otherItem.setVisibility(z ? 8 : 4);
            ProfileActivity.this.updateStoriesViewBounds(false);
        }

        @Override
        protected boolean onMemberClick(TLRPC.ChatParticipant chatParticipant, boolean z, View view) {
            return ProfileActivity.this.onMemberClick(chatParticipant, z, view);
        }

        @Override
        protected void drawBackgroundWithBlur(Canvas canvas, float f, Rect rect, Paint paint) {
            ProfileActivity.this.contentView.drawBlurRect(canvas, ProfileActivity.this.listView.getY() + getY() + f, rect, paint, true);
        }

        @Override
        protected void invalidateBlur() {
            if (ProfileActivity.this.contentView != null) {
                ProfileActivity.this.contentView.invalidateBlur();
            }
        }

        @Override
        protected void showActionMode(boolean z) {
            super.showActionMode(z);
            if (ProfileActivity.this.myProfile) {
                disableScroll(z);
                int selectedTab = getSelectedTab() - 8;
                if (selectedTab < 0 || selectedTab > 1) {
                    return;
                }
                ProfileActivity.this.bottomButtonContainer[selectedTab].animate().translationY((z || (selectedTab == 0 && MessagesController.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).storiesEnabled())) ? 0.0f : AndroidUtilities.dp(72.0f)).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f$0.lambda$showActionMode$0(valueAnimator);
                    }
                }).start();
            }
        }

        public void lambda$showActionMode$0(ValueAnimator valueAnimator) {
            ProfileActivity.this.updateBottomButtonY();
        }

        @Override
        protected void onTabProgress(float f) {
            super.onTabProgress(f);
            ProfileActivity profileActivity = ProfileActivity.this;
            if (profileActivity.sharedMediaLayout != null && profileActivity.myProfile) {
                if (profileActivity.bottomButtonContainer[0] != null) {
                    ProfileActivity.this.bottomButtonContainer[0].setTranslationX(ProfileActivity.this.sharedMediaLayout.getTabTranslationX(8, true));
                }
                if (ProfileActivity.this.bottomButtonContainer[1] != null) {
                    ProfileActivity.this.bottomButtonContainer[1].setTranslationX(ProfileActivity.this.sharedMediaLayout.getTabTranslationX(9, false));
                }
                ProfileActivity profileActivity2 = ProfileActivity.this;
                profileActivity2.checkStoriesButtonText(profileActivity2.lastStoriesSelectedCount, true);
                ProfileActivity.this.updateBottomButtonY();
            }
        }

        @Override
        protected void onBottomButtonVisibilityChange() {
            super.onBottomButtonVisibilityChange();
            ProfileActivity profileActivity = ProfileActivity.this;
            if (!profileActivity.myProfile || profileActivity.bottomButtonContainer[0] == null) {
                return;
            }
            ProfileActivity profileActivity2 = ProfileActivity.this;
            if (profileActivity2.sharedMediaLayout != null) {
                profileActivity2.bottomButtonContainer[0].setTranslationY(AndroidUtilities.dp(72.0f) * (1.0f - ProfileActivity.this.sharedMediaLayout.getBottomButtonStoriesVisibility()));
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onAttachedToWindow$1();
                }
            });
        }

        public void lambda$onAttachedToWindow$1() {
            onTabProgress(getTabProgress());
        }

        @Override
        protected void onActionModeSelectedUpdate(SparseArray sparseArray) {
            super.onActionModeSelectedUpdate(sparseArray);
            if (ProfileActivity.this.myProfile) {
                int size = sparseArray.size();
                int selectedTab = getSelectedTab();
                char c = (SharedMediaLayout.isStoryAlbumPageType(selectedTab) || selectedTab == 8) ? (char) 0 : selectedTab == 9 ? (char) 1 : (char) 65535;
                if (c < 0 || c > 1) {
                    return;
                }
                if (c == 0) {
                    ProfileActivity.this.checkStoriesButtonText(size, true);
                }
                ProfileActivity.this.bottomButton[c].setCount(size, true);
            }
        }

        @Override
        public void openStoryRecorder() throws Resources.NotFoundException, IOException {
            StoryRecorder.getInstance(ProfileActivity.this.getParentActivity(), ((BaseFragment) ProfileActivity.this).currentAccount).selectedPeerId(ProfileActivity.this.getDialogId()).canChangePeer(false).closeToWhenSent(new StoryRecorder.ClosingViewProvider() {
                @Override
                public void preLayout(long j, Runnable runnable) {
                    ProfileActivity.this.avatarImage.setHasStories(ProfileActivity.this.needInsetForStories());
                    if (j == ProfileActivity.this.getDialogId()) {
                        ProfileActivity.this.collapseAvatarInstant();
                    }
                    AndroidUtilities.runOnUIThread(runnable, 30L);
                }

                @Override
                public StoryRecorder.SourceView getView(long j) {
                    if (j != ProfileActivity.this.getDialogId()) {
                        return null;
                    }
                    ProfileActivity.this.updateAvatarRoundRadius();
                    return StoryRecorder.SourceView.fromAvatarImage(ProfileActivity.this.avatarImage, ChatObject.isForum(ProfileActivity.this.currentChat));
                }
            }).open(null, true);
        }

        @Override
        public void updateTabs(boolean z) {
            int i;
            ProfileGiftsContainer profileGiftsContainer;
            int i2;
            ProfileGiftsContainer profileGiftsContainer2;
            super.updateTabs(z);
            ProfileActivity profileActivity = ProfileActivity.this;
            if (profileActivity.openGifts && !profileActivity.openedGifts && this.scrollSlidingTextTabStrip.hasTab(14)) {
                if (!this.openedGiftsCollection && (i2 = ProfileActivity.this.openGiftsCollection) > 0 && (profileGiftsContainer2 = this.giftsContainer) != null) {
                    this.openedGiftsCollection = true;
                    profileGiftsContainer2.scrollToCollectionId(i2);
                }
                ProfileActivity.this.openedGifts = true;
                scrollToPage(14);
                return;
            }
            ProfileActivity profileActivity2 = ProfileActivity.this;
            if (!profileActivity2.openGifts || !profileActivity2.openedGifts || this.openedGiftsCollection || (i = ProfileActivity.this.openGiftsCollection) <= 0 || (profileGiftsContainer = this.giftsContainer) == null) {
                return;
            }
            this.openedGiftsCollection = true;
            profileGiftsContainer.scrollToCollectionId(i);
        }
    }

    public void lambda$createView$12() {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        bundle.putLong("user_id", this.userId);
        presentFragment(new QrActivity(bundle));
    }

    public static void lambda$createView$13(TLRPC.User user) {
        AndroidUtilities.addToClipboard("@" + UserObject.getPublicUsername(user));
    }

    public void lambda$createView$14() {
        presentFragment(new ChangeUsernameActivity());
    }

    public void lambda$createView$15(int i, float f, float f2) throws Resources.NotFoundException, IOException {
        switch (i) {
            case 0:
                if (!this.isTopic) {
                    if (this.userId == 0) {
                        if (this.chatId != 0) {
                            if (ChatObject.isForum(getMessagesController().getChat(Long.valueOf(this.chatId)))) {
                                openForum();
                                break;
                            } else {
                                openGroup();
                                break;
                            }
                        }
                    } else {
                        openChat();
                        break;
                    }
                } else {
                    openTopic();
                    break;
                }
                break;
            case 1:
                onNotificationsClicked(true, f, f2, this.actionsView);
                break;
            case 2:
                openDiscussion();
                break;
            case 3:
                onGiftPermiumClicked();
                break;
            case 4:
                onShareClicked();
                break;
            case 5:
            case 10:
            case 11:
                onCallClicked(false);
                break;
            case 6:
                onCallClicked(true);
                break;
            case 7:
                onJoinClicked(true);
                break;
            case 8:
                ReportBottomSheet.openChat(this, getDialogId());
                break;
            case 9:
                leaveChatPressed();
                break;
            case 12:
                getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                StoryRecorder.getInstance(getParentActivity(), getCurrentAccount()).open(null);
                break;
            case 13:
                onBlockContactClicked(true);
                break;
            case 14:
                onWriteButtonClick();
                break;
            case 15:
                final TLRPC.User currentUser = getUserConfig().getCurrentUser();
                if (currentUser != null) {
                    ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.contentView, this.resourcesProvider, this.actionsView);
                    itemOptionsMakeOptions.setGravity(3);
                    itemOptionsMakeOptions.add(R.drawable.msg_qrcode, LocaleController.getString(R.string.QrCode), new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$createView$12();
                        }
                    });
                    itemOptionsMakeOptions.add(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new Runnable() {
                        @Override
                        public final void run() {
                            ProfileActivity.lambda$createView$13(currentUser);
                        }
                    });
                    itemOptionsMakeOptions.add(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$createView$14();
                        }
                    });
                    itemOptionsMakeOptions.forceBottom(true);
                    itemOptionsMakeOptions.translate(f - AndroidUtilities.dp(8.0f), this.actionsView.getMeasuredHeight() - AndroidUtilities.dp(16.0f));
                    itemOptionsMakeOptions.show();
                    break;
                }
                break;
            case 16:
                presentFragment(new UserInfoActivity());
                break;
            case 17:
                presentFragment(new SettingsActivity());
                break;
        }
    }

    public void lambda$createView$16(Context context, View view) {
        PasskeysActivity.showLearnSheet(context, this.currentAccount, this.resourcesProvider, true);
    }

    public void lambda$createView$17(View view) {
        this.passkeySuggestion = false;
        finishFragment();
    }

    public boolean lambda$createView$18(Canvas canvas, View view, long j) {
        if (view == this.sharedMediaLayout) {
            return true;
        }
        return this.listView.drawChild(canvas, view, j);
    }

    class AnonymousClass12 extends DefaultItemAnimator {
        int animationIndex = -1;

        @Override
        protected long getAddAnimationDelay(long j, long j2, long j3) {
            return 0L;
        }

        AnonymousClass12() {
        }

        @Override
        protected void onAllAnimationsDone() {
            super.onAllAnimationsDone();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onAllAnimationsDone$0();
                }
            });
        }

        public void lambda$onAllAnimationsDone$0() {
            ProfileActivity.this.getNotificationCenter().onAnimationFinish(this.animationIndex);
        }

        @Override
        public void runPendingAnimations() {
            boolean zIsEmpty = this.mPendingRemovals.isEmpty();
            boolean zIsEmpty2 = this.mPendingMoves.isEmpty();
            boolean zIsEmpty3 = this.mPendingChanges.isEmpty();
            boolean zIsEmpty4 = this.mPendingAdditions.isEmpty();
            if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f$0.lambda$runPendingAnimations$1(valueAnimator);
                    }
                });
                valueAnimatorOfFloat.setDuration(getMoveDuration());
                valueAnimatorOfFloat.start();
                this.animationIndex = ProfileActivity.this.getNotificationCenter().setAnimationInProgress(this.animationIndex, null);
            }
            super.runPendingAnimations();
        }

        public void lambda$runPendingAnimations$1(ValueAnimator valueAnimator) {
            ProfileActivity.this.listView.invalidate();
        }

        @Override
        protected void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
            super.onMoveAnimationUpdate(viewHolder);
            ProfileActivity.this.updateBottomButtonY();
        }
    }

    public void lambda$createView$28(final Context context, long j, final View view, int i, float f, float f2) {
        TLRPC.Document document;
        TLRPC.ChatParticipant chatParticipant;
        ListAdapter listAdapter;
        if (getParentActivity() == null) {
            return;
        }
        this.listView.stopScroll();
        if (i == this.affiliateRow) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.userId));
            TLRPC.UserFull userFull = this.userInfo;
            if (userFull != null && userFull.starref_program != null) {
                final long clientUserId = getUserConfig().getClientUserId();
                BotStarsController.getInstance(this.currentAccount).getConnectedBot(getContext(), clientUserId, this.userId, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$createView$19(context, clientUserId, (TL_payments.connectedBotStarRef) obj);
                    }
                });
                return;
            } else {
                if (user == null || !user.bot_can_edit) {
                    return;
                }
                presentFragment(new AffiliateProgramFragment(this.userId));
                return;
            }
        }
        boolean z = true;
        if (i == this.notificationsSimpleRow) {
            boolean z2 = !getMessagesController().isDialogMuted(j, this.topicId);
            getNotificationsController().muteDialog(j, this.topicId, z2);
            BulletinFactory.createMuteBulletin(this, z2, null).show();
            updateExceptions();
            int i2 = this.notificationsSimpleRow;
            if (i2 < 0 || (listAdapter = this.listAdapter) == null) {
                return;
            }
            listAdapter.notifyItemChanged(i2);
            return;
        }
        if (i == this.addToContactsRow) {
            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(this.userId));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user2.id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", this.vcardPhone);
            bundle.putString("first_name_card", this.vcardFirstName);
            bundle.putString("last_name_card", this.vcardLastName);
            openAddToContact(user2, bundle);
            return;
        }
        if (i == this.reportReactionRow) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), this.resourcesProvider);
            builder.setTitle(LocaleController.getString(R.string.ReportReaction));
            builder.setMessage(LocaleController.getString(R.string.ReportAlertReaction));
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.reportReactionFromDialogId));
            final CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[1];
            if (chat != null && ChatObject.canBlockUsers(chat)) {
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(1);
                CheckBoxCell checkBoxCell = new CheckBoxCell(getParentActivity(), 1, this.resourcesProvider);
                checkBoxCellArr[0] = checkBoxCell;
                checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                checkBoxCellArr[0].setText(LocaleController.getString(R.string.BanUser), "", true, false);
                checkBoxCellArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                linearLayout.addView(checkBoxCellArr[0], LayoutHelper.createLinear(-1, -2));
                checkBoxCellArr[0].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ProfileActivity.lambda$createView$20(checkBoxCellArr, view2);
                    }
                });
                builder.setView(linearLayout);
            }
            builder.setPositiveButton(LocaleController.getString(R.string.ReportChat), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i3) {
                    this.f$0.lambda$createView$22(checkBoxCellArr, alertDialog, i3);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i3) {
                    alertDialog.dismiss();
                }
            });
            TextView textView = (TextView) builder.show().getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                return;
            }
            return;
        }
        if (i == this.settingsKeyRow) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("chat_id", DialogObject.getEncryptedChatId(this.dialogId));
            presentFragment(new IdenticonActivity(bundle2));
            return;
        }
        if (i == this.settingsTimerRow) {
            showDialog(AlertsCreator.createTTLAlert(getParentActivity(), this.currentEncryptedChat, this.resourcesProvider).create());
            return;
        }
        if (i == this.notificationsRow) {
            onNotificationsClicked(false, f, f2, view);
            return;
        }
        if (i == this.unblockRow) {
            getMessagesController().unblockPeer(this.userId);
            if (BulletinFactory.canShowBulletin(this)) {
                BulletinFactory.createBanBulletin(this, false).show();
                return;
            }
            return;
        }
        if (i == this.addToGroupButtonRow) {
            try {
                this.actionBar.getActionBarMenuOnItemClick().onItemClick(9);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (i == this.sendMessageRow) {
            onWriteButtonClick();
            return;
        }
        if (i == this.reportRow) {
            ReportBottomSheet.openChat(this, getDialogId());
            return;
        }
        if (i >= this.membersStartRow && i < this.membersEndRow) {
            if (!this.sortedUsers.isEmpty()) {
                chatParticipant = this.chatInfo.participants.participants.get(((Integer) this.sortedUsers.get(i - this.membersStartRow)).intValue());
            } else {
                chatParticipant = this.chatInfo.participants.participants.get(i - this.membersStartRow);
            }
            onMemberClick(chatParticipant, false, view);
            return;
        }
        if (i == this.addMemberRow) {
            openAddMember();
            return;
        }
        if (i == this.usernameRow) {
            processOnClickOrPress(i, view, f, f2);
            return;
        }
        if (i == this.locationRow) {
            if (this.chatInfo.location instanceof TLRPC.TL_channelLocation) {
                LocationActivity locationActivity = new LocationActivity(5);
                locationActivity.setChatLocation(this.chatId, (TLRPC.TL_channelLocation) this.chatInfo.location);
                presentFragment(locationActivity);
                return;
            }
            return;
        }
        if (i == this.joinRow) {
            onJoinClicked(false);
            return;
        }
        if (i == this.subscribersRow) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("chat_id", this.chatId);
            bundle3.putInt("type", 2);
            ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle3);
            chatUsersActivity.setInfo(this.chatInfo);
            presentFragment(chatUsersActivity);
            return;
        }
        if (i == this.subscribersRequestsRow) {
            presentFragment(new MemberRequestsActivity(this.chatId));
            return;
        }
        if (i == this.administratorsRow) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", this.chatId);
            bundle4.putInt("type", 1);
            ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle4);
            chatUsersActivity2.setInfo(this.chatInfo);
            presentFragment(chatUsersActivity2);
            return;
        }
        if (i == this.settingsRow) {
            this.editItem.performClick();
            return;
        }
        if (i == this.botStarsBalanceRow) {
            presentFragment(new BotStarsActivity(0, this.userId));
            return;
        }
        if (i == this.botTonBalanceRow) {
            presentFragment(new BotStarsActivity(1, this.userId));
            return;
        }
        if (i == this.channelBalanceRow) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", this.chatId);
            bundle5.putBoolean("start_from_monetization", true);
            presentFragment(new StatisticActivity(bundle5));
            return;
        }
        if (i == this.blockedUsersRow) {
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", this.chatId);
            bundle6.putInt("type", 0);
            ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle6);
            chatUsersActivity3.setInfo(this.chatInfo);
            presentFragment(chatUsersActivity3);
            return;
        }
        if (i == this.notificationRow) {
            presentFragment(new NotificationsSettingsActivity());
            return;
        }
        if (i == this.privacyRow) {
            presentFragment(new PrivacySettingsActivity().setCurrentPassword(this.currentPassword));
            return;
        }
        if (i == this.dataRow) {
            presentFragment(new DataSettingsActivity());
            return;
        }
        if (i == this.chatRow) {
            presentFragment(new ThemeActivity(0));
            return;
        }
        if (i == this.filtersRow) {
            presentFragment(new FiltersSetupActivity());
            return;
        }
        if (i == this.stickersRow) {
            presentFragment(new StickersActivity(0, null));
            return;
        }
        if (i == this.liteModeRow) {
            presentFragment(new LiteModeSettingsActivity());
            return;
        }
        if (i == this.devicesRow) {
            presentFragment(new SessionsActivity(0));
            return;
        }
        if (i == this.questionRow) {
            showDialog(AlertsCreator.createSupportAlert(this, this.resourcesProvider));
            return;
        }
        if (i == this.faqRow) {
            Browser.openUrl(getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
            return;
        }
        if (i == this.policyRow) {
            Browser.openUrl(getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
            return;
        }
        if (i == this.sendLogsRow) {
            sendLogs(getParentActivity(), false);
            return;
        }
        if (i == this.sendLastLogsRow) {
            sendLogs(getParentActivity(), true);
            return;
        }
        if (i == this.clearLogsRow) {
            FileLog.cleanupLogs();
            return;
        }
        if (i == this.switchBackendRow) {
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity(), this.resourcesProvider);
            builder2.setMessage(LocaleController.getString(R.string.AreYouSure));
            builder2.setTitle(LocaleController.getString(R.string.AppName));
            builder2.setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i3) {
                    this.f$0.lambda$createView$24(alertDialog, i3);
                }
            });
            builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            showDialog(builder2.create());
            return;
        }
        if (i == this.languageRow) {
            presentFragment(new LanguageSelectActivity());
            return;
        }
        if (i == this.setUsernameRow) {
            presentFragment(new ChangeUsernameActivity());
            return;
        }
        if (i == this.bioRow) {
            presentFragment(new UserInfoActivity());
            return;
        }
        if (i == this.numberRow) {
            presentFragment(new ActionIntroActivity(3));
            return;
        }
        if (i == this.setAvatarRow) {
            onWriteButtonClick();
            return;
        }
        if (i == this.premiumRow) {
            presentFragment(new PremiumPreviewFragment("settings"));
            return;
        }
        if (i == this.starsRow) {
            presentFragment(new StarsIntroActivity());
            return;
        }
        if (i == this.tonRow) {
            presentFragment(new TONIntroActivity());
            return;
        }
        if (i == this.businessRow) {
            presentFragment(new PremiumPreviewFragment(1, "settings"));
            return;
        }
        if (i == this.premiumGiftingRow) {
            UserSelectorBottomSheet.open(0L, BirthdayController.getInstance(this.currentAccount).getState());
            return;
        }
        if (i == this.botPermissionLocation) {
            BotLocation botLocation = this.botLocation;
            if (botLocation != null) {
                botLocation.setGranted(!botLocation.granted(), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$createView$25(view);
                    }
                });
                return;
            }
            return;
        }
        if (i == this.botPermissionBiometry) {
            BotBiometry botBiometry = this.botBiometry;
            if (botBiometry != null) {
                botBiometry.setGranted(!botBiometry.granted());
                ((TextCell) view).setChecked(this.botBiometry.granted());
                return;
            }
            return;
        }
        if (i == this.botPermissionEmojiStatus) {
            TextCell textCell = (TextCell) view;
            textCell.setChecked(!textCell.isChecked());
            if (this.botPermissionEmojiStatusReqId > 0) {
                getConnectionsManager().cancelRequest(this.botPermissionEmojiStatusReqId, true);
            }
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = getMessagesController().getInputUser(this.userId);
            boolean zIsChecked = textCell.isChecked();
            toggleuseremojistatuspermission.enabled = zIsChecked;
            TLRPC.UserFull userFull2 = this.userInfo;
            if (userFull2 != null) {
                userFull2.bot_can_manage_emoji_status = zIsChecked;
            }
            int iSendRequest = getConnectionsManager().sendRequest(toggleuseremojistatuspermission, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$createView$27(iArr, tLObject, tL_error);
                }
            });
            this.botPermissionEmojiStatusReqId = iSendRequest;
            final int[] iArr = {iSendRequest};
            return;
        }
        if (i == this.bizHoursRow) {
            this.hoursExpanded = !this.hoursExpanded;
            saveScrollPosition();
            view.requestLayout();
            this.listAdapter.notifyItemChanged(this.bizHoursRow);
            int i3 = this.savedScrollPosition;
            if (i3 >= 0) {
                this.layoutManager.scrollToPositionWithOffset(i3, this.savedScrollOffset - this.listView.getPaddingTop());
                return;
            }
            return;
        }
        if (i == this.bizLocationRow) {
            openLocation(false);
            return;
        }
        if (i == this.channelRow) {
            if (this.userInfo == null) {
                return;
            }
            Bundle bundle7 = new Bundle();
            bundle7.putLong("chat_id", this.userInfo.personal_channel_id);
            presentFragment(new ChatActivity(bundle7));
            return;
        }
        if (i == this.birthdayRow) {
            ProfileBirthdayEffect profileBirthdayEffect = this.birthdayEffect;
            if ((profileBirthdayEffect == null || !profileBirthdayEffect.lambda$onDraw$0()) && !editRow(view, i)) {
                TextDetailCell textDetailCell = (TextDetailCell) view;
                if (textDetailCell.hasImage()) {
                    onTextDetailCellImageClicked(textDetailCell.getImageView());
                    return;
                }
                return;
            }
            return;
        }
        if (i == this.musicRow) {
            if (this.savedMusicList == null) {
                if (MediaController.getInstance().currentSavedMusicList != null && MediaController.getInstance().currentSavedMusicList.currentAccount == this.currentAccount && MediaController.getInstance().currentSavedMusicList.dialogId == getDialogId()) {
                    this.savedMusicList = MediaController.getInstance().currentSavedMusicList;
                } else {
                    MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(this.currentAccount, getDialogId());
                    this.savedMusicList = savedMusicList;
                    TLRPC.UserFull userFull3 = this.userInfo;
                    if (userFull3 != null && (document = userFull3.saved_music) != null) {
                        savedMusicList.setup(document);
                    }
                }
            }
            if (this.savedMusicList.list.isEmpty()) {
                return;
            }
            if (MediaController.getInstance().currentSavedMusicList != this.savedMusicList || !MediaController.getInstance().isPlayingMessage(this.savedMusicList.list.get(0))) {
                MediaController.getInstance().cleanup();
                z = false;
            }
            MediaController.getInstance().currentSavedMusicList = this.savedMusicList;
            MediaController.getInstance().getPlaylist().clear();
            MediaController.getInstance().getPlaylist().addAll(this.savedMusicList.list);
            if (!z) {
                MediaController.getInstance().playMessage(this.savedMusicList.list.get(0));
            }
            showDialog(new AudioPlayerAlert(getContext(), getResourceProvider()));
            return;
        }
        if (i == this.noteRow) {
            editNotes(view, i);
        } else {
            processOnClickOrPress(i, view, f, f2);
        }
    }

    public void lambda$createView$19(Context context, long j, TL_payments.connectedBotStarRef connectedbotstarref) {
        if (connectedbotstarref == null) {
            ChannelAffiliateProgramsFragment.showConnectAffiliateAlert(context, this.currentAccount, this.userInfo.starref_program, getUserConfig().getClientUserId(), this.resourcesProvider, false);
        } else {
            ChannelAffiliateProgramsFragment.showShareAffiliateAlert(context, this.currentAccount, connectedbotstarref, j, this.resourcesProvider);
        }
    }

    public static void lambda$createView$20(CheckBoxCell[] checkBoxCellArr, View view) {
        checkBoxCellArr[0].setChecked(!r1.isChecked(), true);
    }

    public void lambda$createView$22(CheckBoxCell[] checkBoxCellArr, AlertDialog alertDialog, int i) {
        TLRPC.TL_messages_reportReaction tL_messages_reportReaction = new TLRPC.TL_messages_reportReaction();
        tL_messages_reportReaction.user_id = getMessagesController().getInputUser(this.userId);
        tL_messages_reportReaction.peer = getMessagesController().getInputPeer(this.reportReactionFromDialogId);
        tL_messages_reportReaction.id = this.reportReactionMessageId;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reportReaction, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ProfileActivity.lambda$createView$21(tLObject, tL_error);
            }
        });
        CheckBoxCell checkBoxCell = checkBoxCellArr[0];
        if (checkBoxCell != null && checkBoxCell.isChecked()) {
            getMessagesController().deleteParticipantFromChat(-this.reportReactionFromDialogId, getMessagesController().getUser(Long.valueOf(this.userId)));
        }
        this.reportReactionMessageId = 0;
        updateListAnimated(false);
        BulletinFactory.of(this).createReportSent(this.resourcesProvider).show();
    }

    public void lambda$createView$24(AlertDialog alertDialog, int i) {
        SharedConfig.pushAuthKey = null;
        SharedConfig.pushAuthKeyId = null;
        SharedConfig.saveConfig();
        getConnectionsManager().switchBackend(true);
    }

    public void lambda$createView$25(View view) {
        ((TextCell) view).setChecked(this.botLocation.granted());
    }

    public void lambda$createView$27(final int[] iArr, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$26(tLObject, tL_error, iArr);
            }
        });
    }

    public void lambda$createView$26(TLObject tLObject, TLRPC.TL_error tL_error, int[] iArr) {
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            BulletinFactory.of(this).showForError(tL_error);
        }
        if (this.botPermissionEmojiStatusReqId == iArr[0]) {
            this.botPermissionEmojiStatusReqId = 0;
        }
    }

    class AnonymousClass14 implements RecyclerListView.OnItemLongClickListener {
        private int pressCount = 0;
        final Context val$context;

        AnonymousClass14(Context context) {
            this.val$context = context;
        }

        @Override
        public boolean onItemClick(View view, int i) {
            int i2;
            String str;
            String string;
            int i3;
            String str2;
            String string2;
            String string3;
            String str3;
            String str4;
            if (i != ProfileActivity.this.versionRow) {
                if (i >= ProfileActivity.this.membersStartRow && i < ProfileActivity.this.membersEndRow) {
                    return ProfileActivity.this.onMemberClick(!ProfileActivity.this.sortedUsers.isEmpty() ? (TLRPC.ChatParticipant) ProfileActivity.this.visibleChatParticipants.get(((Integer) ProfileActivity.this.sortedUsers.get(i - ProfileActivity.this.membersStartRow)).intValue()) : (TLRPC.ChatParticipant) ProfileActivity.this.visibleChatParticipants.get(i - ProfileActivity.this.membersStartRow), true, view);
                }
                ProfileActivity profileActivity = ProfileActivity.this;
                if (i == profileActivity.birthdayRow) {
                    if (profileActivity.editRow(view, i)) {
                        return true;
                    }
                    if (ProfileActivity.this.userInfo == null) {
                        return false;
                    }
                    try {
                        AndroidUtilities.addToClipboard(UserInfoActivity.birthdayString(ProfileActivity.this.userInfo.birthday));
                        BulletinFactory.of(ProfileActivity.this).createCopyBulletin(LocaleController.getString(R.string.BirthdayCopied)).show();
                        return true;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return true;
                    }
                }
                if (i == profileActivity.noteRow) {
                    ProfileActivity.this.editNotes(view, i);
                    return true;
                }
                if (ProfileActivity.this.editRow(view, i)) {
                    return true;
                }
                return ProfileActivity.this.processOnClickOrPress(i, view, view.getWidth() / 2.0f, (int) (view.getHeight() * 0.75f));
            }
            int i4 = this.pressCount + 1;
            this.pressCount = i4;
            if (i4 >= 2 || BuildVars.DEBUG_PRIVATE_VERSION) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this.getParentActivity(), ProfileActivity.this.resourcesProvider);
                builder.setTitle(LocaleController.getString(R.string.DebugMenu));
                String string4 = LocaleController.getString(R.string.DebugMenuImportContacts);
                String string5 = LocaleController.getString(R.string.DebugMenuReloadContacts);
                String string6 = LocaleController.getString(R.string.DebugMenuResetContacts);
                String string7 = LocaleController.getString(R.string.DebugMenuResetDialogs);
                if (BuildVars.DEBUG_VERSION) {
                    string = null;
                } else {
                    if (BuildVars.LOGS_ENABLED) {
                        i2 = R.string.DebugMenuDisableLogs;
                        str = "DebugMenuDisableLogs";
                    } else {
                        i2 = R.string.DebugMenuEnableLogs;
                        str = "DebugMenuEnableLogs";
                    }
                    string = LocaleController.getString(str, i2);
                }
                if (SharedConfig.inappCamera) {
                    i3 = R.string.DebugMenuDisableCamera;
                    str2 = "DebugMenuDisableCamera";
                } else {
                    i3 = R.string.DebugMenuEnableCamera;
                    str2 = "DebugMenuEnableCamera";
                }
                String string8 = LocaleController.getString(str2, i3);
                String string9 = LocaleController.getString("DebugMenuClearMediaCache", R.string.DebugMenuClearMediaCache);
                String string10 = LocaleController.getString(R.string.DebugMenuCallSettings);
                String string11 = (BuildVars.DEBUG_PRIVATE_VERSION || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isBetaBuild()) ? LocaleController.getString("DebugMenuCheckAppUpdate", R.string.DebugMenuCheckAppUpdate) : null;
                String string12 = LocaleController.getString("DebugMenuReadAllDialogs", R.string.DebugMenuReadAllDialogs);
                String str5 = BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.disableVoiceAudioEffects ? "Enable voip audio effects" : "Disable voip audio effects" : null;
                boolean z = BuildVars.DEBUG_PRIVATE_VERSION;
                String str6 = z ? "Clean app update" : null;
                String str7 = z ? "Reset suggestions" : null;
                String string13 = z ? LocaleController.getString(R.string.DebugMenuClearWebViewCache) : null;
                String string14 = LocaleController.getString(R.string.DebugMenuClearWebViewCookies);
                String string15 = LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuDisableWebViewDebug : R.string.DebugMenuEnableWebViewDebug);
                String str8 = (AndroidUtilities.isTabletInternal() && BuildVars.DEBUG_PRIVATE_VERSION) ? SharedConfig.forceDisableTabletMode ? "Enable tablet mode" : "Disable tablet mode" : null;
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    string2 = LocaleController.getString(SharedConfig.isFloatingDebugActive ? R.string.FloatingDebugDisable : R.string.FloatingDebugEnable);
                } else {
                    string2 = null;
                }
                boolean z2 = BuildVars.DEBUG_PRIVATE_VERSION;
                String str9 = z2 ? "Force remove premium suggestions" : null;
                String str10 = z2 ? "Share device info" : null;
                String str11 = z2 ? "Force performance class" : null;
                String str12 = (!z2 || InstantCameraView.allowBigSizeCameraDebug()) ? null : !SharedConfig.bigCameraForRound ? "Force big camera for round" : "Disable big camera for round";
                String string16 = LocaleController.getString(DualCameraView.dualAvailableStatic(ProfileActivity.this.getContext()) ? "DebugMenuDualOff" : "DebugMenuDualOn");
                String str13 = BuildVars.DEBUG_VERSION ? SharedConfig.useSurfaceInStories ? "back to TextureView in stories" : "use SurfaceView in stories" : null;
                String str14 = BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.photoViewerBlur ? "do not blur in photoviewer" : "blur in photoviewer" : null;
                String str15 = !SharedConfig.payByInvoice ? "Enable Invoice Payment" : "Disable Invoice Payment";
                String str16 = BuildVars.DEBUG_PRIVATE_VERSION ? "Update Attach Bots" : null;
                String str17 = !SharedConfig.isUsingCamera2(((BaseFragment) ProfileActivity.this).currentAccount) ? "Use Camera 2 API" : "Use old Camera 1 API";
                String str18 = BuildVars.DEBUG_VERSION ? "Clear Mini Apps Permissions and Files" : null;
                String str19 = BuildVars.DEBUG_PRIVATE_VERSION ? "Clear all login tokens" : null;
                String str20 = (!SharedConfig.canBlurChat() || Build.VERSION.SDK_INT < 31) ? null : SharedConfig.useNewBlur ? "back to cpu blur" : "use new gpu blur";
                String str21 = SharedConfig.adaptableColorInBrowser ? "Disabled adaptive browser colors" : "Enable adaptive browser colors";
                String str22 = SharedConfig.debugVideoQualities ? "Disable video qualities debug" : "Enable video qualities debug";
                if (Build.VERSION.SDK_INT >= 28) {
                    string3 = LocaleController.getString(SharedConfig.useSystemBoldFont ? R.string.DebugMenuDontUseSystemBoldFont : R.string.DebugMenuUseSystemBoldFont);
                } else {
                    string3 = null;
                }
                String str23 = !SharedConfig.forceForumTabs ? "Force Forum Tabs" : "Do Not Force Forum Tabs";
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    str4 = SharedConfig.fastWallpaperDisabled ? "enable wallpaper shader" : "disable wallpaper shader";
                    str3 = str23;
                } else {
                    str3 = str23;
                    str4 = null;
                }
                CharSequence[] charSequenceArr = {string4, string5, string6, string7, string, string8, string9, string10, null, string11, string12, str5, str6, str7, string13, string14, string15, str8, string2, str9, str10, str11, str12, string16, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, string3, "Reload app config", str3, "Make Memory Dump", str4};
                final Context context = this.val$context;
                builder.setItems(charSequenceArr, new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        this.f$0.lambda$onItemClick$3(context, dialogInterface, i5);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                ProfileActivity.this.showDialog(builder.create());
                return true;
            }
            try {
                Toast.makeText(ProfileActivity.this.getParentActivity(), LocaleController.getString("DebugMenuLongPress", R.string.DebugMenuLongPress), 0).show();
                return true;
            } catch (Exception e2) {
                FileLog.e(e2);
                return true;
            }
        }

        public void lambda$onItemClick$3(Context context, DialogInterface dialogInterface, int i) {
            int i2;
            int i3;
            int i4 = 0;
            if (i == 0) {
                ProfileActivity.this.getUserConfig().syncContacts = true;
                ProfileActivity.this.getUserConfig().saveConfig(false);
                ProfileActivity.this.getContactsController().forceImportContacts();
                return;
            }
            if (i == 1) {
                ProfileActivity.this.getContactsController().loadContacts(false, 0L);
                return;
            }
            if (i == 2) {
                ProfileActivity.this.getContactsController().resetImportedContacts();
                return;
            }
            if (i == 3) {
                ProfileActivity.this.getMessagesController().forceResetDialogs();
                return;
            }
            if (i == 4) {
                BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                ProfileActivity.this.updateRowsIds();
                ProfileActivity.this.listAdapter.notifyDataSetChanged();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("app start time = " + ApplicationLoader.startTime);
                    try {
                        FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            }
            if (i == 5) {
                SharedConfig.toggleInappCamera();
                return;
            }
            if (i == 6) {
                ProfileActivity.this.getMessagesStorage().clearSentMedia();
                SharedConfig.setNoSoundHintShowed(false);
                MessagesController.getGlobalMainSettings().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l").remove("searchpostsnew").remove("speedhint").remove("gifhint").remove("reminderhint").remove("soundHint").remove("themehint").remove("bganimationhint").remove("filterhint").remove("n_0").remove("storyprvhint").remove("storyhint").remove("storyhint2").remove("storydualhint").remove("storysvddualhint").remove("stories_camera").remove("dualcam").remove("dualmatrix").remove("dual_available").remove("archivehint").remove("askNotificationsAfter").remove("askNotificationsDuration").remove("viewoncehint").remove("voicepausehint").remove("taptostorysoundhint").remove("nothanos").remove("voiceoncehint").remove("savedhint").remove("savedsearchhint").remove("savedsearchtaghint").remove("groupEmojiPackHintShown").remove("newppsms").remove("monetizationadshint").remove("seekSpeedHintShowed").remove("unsupport_video/av01").remove("channelgifthint").remove("statusgiftpage").remove("multistorieshint").remove("channelsuggesthint").remove("trimvoicehint").remove("taptostoryhighlighthint").apply();
                MessagesController.getEmojiSettings(((BaseFragment) ProfileActivity.this).currentAccount).edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
                SharedConfig.textSelectionHintShows = 0;
                SharedConfig.lockRecordAudioVideoHint = 0;
                SharedConfig.stickersReorderingHintUsed = false;
                SharedConfig.forwardingOptionsHintShown = false;
                SharedConfig.replyingOptionsHintShown = false;
                SharedConfig.messageSeenHintCount = 3;
                SharedConfig.emojiInteractionsHintCount = 3;
                SharedConfig.dayNightThemeSwitchHintCount = 3;
                SharedConfig.fastScrollHintCount = 3;
                SharedConfig.stealthModeSendMessageConfirm = 2;
                SharedConfig.updateStealthModeSendMessageConfirm(2);
                SharedConfig.setStoriesReactionsLongPressHintUsed(false);
                SharedConfig.setStoriesIntroShown(false);
                SharedConfig.setMultipleReactionsPromoShowed(false);
                ChatThemeController.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).clearCache();
                ProfileActivity.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
                RestrictedLanguagesSelectActivity.cleanup();
                PersistColorPalette.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).cleanup();
                SharedPreferences mainSettings = ProfileActivity.this.getMessagesController().getMainSettings();
                SharedPreferences.Editor editorEdit = mainSettings.edit();
                editorEdit.remove("peerColors").remove("profilePeerColors").remove("boostingappearance").remove("bizbothint").remove("movecaptionhint");
                for (String str : mainSettings.getAll().keySet()) {
                    if (str.contains("show_gift_for_") || str.contains("bdayhint_") || str.contains("bdayanim_") || str.startsWith("ask_paid_message_") || str.startsWith("topicssidetabs")) {
                        editorEdit.remove(str);
                    }
                }
                editorEdit.apply();
                SharedPreferences.Editor editorEdit2 = MessagesController.getNotificationsSettings(((BaseFragment) ProfileActivity.this).currentAccount).edit();
                for (String str2 : MessagesController.getNotificationsSettings(((BaseFragment) ProfileActivity.this).currentAccount).getAll().keySet()) {
                    if (str2.startsWith("dialog_bar_botver")) {
                        editorEdit2.remove(str2);
                    }
                }
                editorEdit2.apply();
                return;
            }
            if (i == 7) {
                VoIPHelper.showCallDebugSettings(ProfileActivity.this.getParentActivity());
                return;
            }
            if (i == 8) {
                SharedConfig.toggleRoundCamera16to9();
                return;
            }
            if (i == 9) {
                ((LaunchActivity) ProfileActivity.this.getParentActivity()).checkAppUpdate(true, null);
                return;
            }
            if (i == 10) {
                ProfileActivity.this.getMessagesStorage().readAllDialogs(-1);
                return;
            }
            if (i == 11) {
                SharedConfig.toggleDisableVoiceAudioEffects();
                return;
            }
            if (i == 12) {
                SharedConfig.pendingAppUpdate = null;
                SharedConfig.saveConfig();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
                return;
            }
            if (i == 13) {
                Set<String> set = ProfileActivity.this.getMessagesController().pendingSuggestions;
                set.add("VALIDATE_PHONE_NUMBER");
                set.add("VALIDATE_PASSWORD");
                ProfileActivity.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
                return;
            }
            try {
                if (i == 14) {
                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                    WebStorage.getInstance().deleteAllData();
                    WebView webView = new WebView(ApplicationLoader.applicationContext);
                    webView.clearHistory();
                    webView.destroy();
                    return;
                }
                if (i == 15) {
                    CookieManager cookieManager = CookieManager.getInstance();
                    cookieManager.removeAllCookies(null);
                    cookieManager.flush();
                    return;
                }
                if (i == 16) {
                    SharedConfig.toggleDebugWebView();
                    Toast.makeText(ProfileActivity.this.getParentActivity(), LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuWebViewDebugEnabled : R.string.DebugMenuWebViewDebugDisabled), 0).show();
                    return;
                }
                if (i == 17) {
                    SharedConfig.toggleForceDisableTabletMode();
                    Activity activityFindActivity = AndroidUtilities.findActivity(context);
                    Intent launchIntentForPackage = activityFindActivity.getPackageManager().getLaunchIntentForPackage(activityFindActivity.getPackageName());
                    activityFindActivity.finishAffinity();
                    activityFindActivity.startActivity(launchIntentForPackage);
                    System.exit(0);
                    return;
                }
                if (i == 18) {
                    FloatingDebugController.setActive((LaunchActivity) ProfileActivity.this.getParentActivity(), !FloatingDebugController.isActive());
                    return;
                }
                if (i == 19) {
                    ProfileActivity.this.getMessagesController().loadAppConfig();
                    TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                    tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                    tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                    ProfileActivity.this.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            this.f$0.lambda$onItemClick$1(tLObject, tL_error);
                        }
                    });
                    return;
                }
                if (i != 20) {
                    if (i == 21) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this.getParentActivity(), ProfileActivity.this.resourcesProvider);
                        builder.setTitle("Force performance class");
                        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                        final int iMeasureDevicePerformanceClass = SharedConfig.measureDevicePerformanceClass();
                        StringBuilder sb = new StringBuilder();
                        sb.append(devicePerformanceClass == 2 ? "**HIGH**" : "HIGH");
                        sb.append(iMeasureDevicePerformanceClass == 2 ? " (measured)" : "");
                        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(sb.toString());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(devicePerformanceClass == 1 ? "**AVERAGE**" : "AVERAGE");
                        sb2.append(iMeasureDevicePerformanceClass == 1 ? " (measured)" : "");
                        SpannableStringBuilder spannableStringBuilderReplaceTags2 = AndroidUtilities.replaceTags(sb2.toString());
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(devicePerformanceClass == 0 ? "**LOW**" : "LOW");
                        sb3.append(iMeasureDevicePerformanceClass == 0 ? " (measured)" : "");
                        builder.setItems(new CharSequence[]{spannableStringBuilderReplaceTags, spannableStringBuilderReplaceTags2, AndroidUtilities.replaceTags(sb3.toString())}, new DialogInterface.OnClickListener() {
                            @Override
                            public final void onClick(DialogInterface dialogInterface2, int i5) {
                                ProfileActivity.AnonymousClass14.lambda$onItemClick$2(iMeasureDevicePerformanceClass, dialogInterface2, i5);
                            }
                        });
                        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                        builder.show();
                        return;
                    }
                    if (i == 22) {
                        SharedConfig.toggleRoundCamera();
                        return;
                    }
                    if (i == 23) {
                        boolean zDualAvailableStatic = DualCameraView.dualAvailableStatic(ProfileActivity.this.getContext());
                        MessagesController.getGlobalMainSettings().edit().putBoolean("dual_available", true ^ zDualAvailableStatic).apply();
                        Toast.makeText(ProfileActivity.this.getParentActivity(), LocaleController.getString(!zDualAvailableStatic ? R.string.DebugMenuDualOnToast : R.string.DebugMenuDualOffToast), 0).show();
                        return;
                    }
                    if (i == 24) {
                        SharedConfig.toggleSurfaceInStories();
                        while (i4 < ProfileActivity.this.getParentLayout().getFragmentStack().size()) {
                            ((BaseFragment) ProfileActivity.this.getParentLayout().getFragmentStack().get(i4)).clearSheets();
                            i4++;
                        }
                        return;
                    }
                    if (i == 25) {
                        SharedConfig.togglePhotoViewerBlur();
                        return;
                    }
                    if (i == 26) {
                        SharedConfig.togglePaymentByInvoice();
                        return;
                    }
                    if (i == 27) {
                        ProfileActivity.this.getMediaDataController().loadAttachMenuBots(false, true);
                        return;
                    }
                    if (i == 28) {
                        SharedConfig.toggleUseCamera2(((BaseFragment) ProfileActivity.this).currentAccount);
                        return;
                    }
                    if (i == 29) {
                        BotBiometry.clear();
                        BotLocation.clear();
                        BotDownloads.clear();
                        SetupEmojiStatusSheet.clear();
                        return;
                    }
                    if (i == 30) {
                        AuthTokensHelper.clearLogInTokens();
                        return;
                    }
                    if (i == 31) {
                        SharedConfig.toggleUseNewBlur();
                        return;
                    }
                    if (i == 32) {
                        SharedConfig.toggleBrowserAdaptableColors();
                        return;
                    }
                    if (i == 33) {
                        SharedConfig.toggleDebugVideoQualities();
                        return;
                    }
                    if (i == 34) {
                        SharedConfig.toggleUseSystemBoldFont();
                        return;
                    }
                    if (i == 35) {
                        MessagesController.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).loadAppConfig(true);
                        return;
                    }
                    if (i == 36) {
                        SharedConfig.toggleForceForumTabs();
                        return;
                    } else if (i == 37) {
                        FileLog.getInstance().dumpMemory(true);
                        return;
                    } else {
                        if (i == 38) {
                            SharedConfig.toggleFastWallpaperDisabled();
                            return;
                        }
                        return;
                    }
                }
                int i5 = ConnectionsManager.CPU_COUNT;
                int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
                StringBuilder sb4 = new StringBuilder();
                long j = 0;
                long jLongValue = 0;
                long j2 = 0;
                long jLongValue2 = 0;
                long j3 = 0;
                long jLongValue3 = 0;
                long j4 = 0;
                long jLongValue4 = 0;
                while (i4 < i5) {
                    Long sysInfoLong = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i4 + "/cpufreq/cpuinfo_min_freq");
                    Long sysInfoLong2 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i4 + "/cpufreq/cpuinfo_cur_freq");
                    Long sysInfoLong3 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i4 + "/cpufreq/cpuinfo_max_freq");
                    Long sysInfoLong4 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i4 + "/cpu_capacity");
                    sb4.append("#");
                    sb4.append(i4);
                    sb4.append(" ");
                    if (sysInfoLong != null) {
                        sb4.append("min=");
                        i2 = i5;
                        i3 = memoryClass;
                        sb4.append(sysInfoLong.longValue() / 1000);
                        sb4.append(" ");
                        jLongValue += sysInfoLong.longValue() / 1000;
                        j++;
                    } else {
                        i2 = i5;
                        i3 = memoryClass;
                    }
                    if (sysInfoLong2 != null) {
                        sb4.append("cur=");
                        sb4.append(sysInfoLong2.longValue() / 1000);
                        sb4.append(" ");
                        jLongValue2 += sysInfoLong2.longValue() / 1000;
                        j2++;
                    }
                    if (sysInfoLong3 != null) {
                        sb4.append("max=");
                        sb4.append(sysInfoLong3.longValue() / 1000);
                        sb4.append(" ");
                        jLongValue3 += sysInfoLong3.longValue() / 1000;
                        j3++;
                    }
                    if (sysInfoLong4 != null) {
                        sb4.append("cpc=");
                        sb4.append(sysInfoLong4);
                        sb4.append(" ");
                        jLongValue4 += sysInfoLong4.longValue();
                        j4++;
                    }
                    sb4.append("\n");
                    i4++;
                    i5 = i2;
                    memoryClass = i3;
                }
                int i6 = i5;
                int i7 = memoryClass;
                StringBuilder sb5 = new StringBuilder();
                sb5.append(Build.MANUFACTURER);
                sb5.append(", ");
                sb5.append(Build.MODEL);
                sb5.append(" (");
                sb5.append(Build.PRODUCT);
                sb5.append(", ");
                sb5.append(Build.DEVICE);
                sb5.append(") ");
                sb5.append(" (android ");
                int i8 = Build.VERSION.SDK_INT;
                sb5.append(i8);
                sb5.append(")\n");
                if (i8 >= 31) {
                    sb5.append("SoC: ");
                    sb5.append(Build.SOC_MANUFACTURER);
                    sb5.append(", ");
                    sb5.append(Build.SOC_MODEL);
                    sb5.append("\n");
                }
                String sysInfoString = AndroidUtilities.getSysInfoString("/sys/kernel/gpu/gpu_model");
                if (sysInfoString != null) {
                    sb5.append("GPU: ");
                    sb5.append(sysInfoString);
                    Long sysInfoLong5 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_min_clock");
                    Long sysInfoLong6 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_mm_min_clock");
                    Long sysInfoLong7 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_max_clock");
                    if (sysInfoLong5 != null) {
                        sb5.append(", min=");
                        sb5.append(sysInfoLong5.longValue() / 1000);
                    }
                    if (sysInfoLong6 != null) {
                        sb5.append(", mmin=");
                        sb5.append(sysInfoLong6.longValue() / 1000);
                    }
                    if (sysInfoLong7 != null) {
                        sb5.append(", max=");
                        sb5.append(sysInfoLong7.longValue() / 1000);
                    }
                    sb5.append("\n");
                }
                ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getDeviceConfigurationInfo();
                sb5.append("GLES Version: ");
                sb5.append(deviceConfigurationInfo.getGlEsVersion());
                sb5.append("\n");
                sb5.append("Memory: class=");
                sb5.append(AndroidUtilities.formatFileSize(i7 * 1048576));
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryInfo(memoryInfo);
                sb5.append(", total=");
                sb5.append(AndroidUtilities.formatFileSize(memoryInfo.totalMem));
                sb5.append(", avail=");
                sb5.append(AndroidUtilities.formatFileSize(memoryInfo.availMem));
                sb5.append(", low?=");
                sb5.append(memoryInfo.lowMemory);
                sb5.append(" (threshold=");
                sb5.append(AndroidUtilities.formatFileSize(memoryInfo.threshold));
                sb5.append(")");
                sb5.append("\n");
                sb5.append("Current class: ");
                sb5.append(SharedConfig.performanceClassName(SharedConfig.getDevicePerformanceClass()));
                sb5.append(", measured: ");
                sb5.append(SharedConfig.performanceClassName(SharedConfig.measureDevicePerformanceClass()));
                if (i8 >= 31) {
                    sb5.append(", suggest=");
                    sb5.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
                }
                sb5.append("\n");
                sb5.append(i6);
                sb5.append(" CPUs");
                if (j > 0) {
                    sb5.append(", avgMinFreq=");
                    sb5.append(jLongValue / j);
                }
                if (j2 > 0) {
                    sb5.append(", avgCurFreq=");
                    sb5.append(jLongValue2 / j2);
                }
                if (j3 > 0) {
                    sb5.append(", avgMaxFreq=");
                    sb5.append(jLongValue3 / j3);
                }
                if (j4 > 0) {
                    sb5.append(", avgCapacity=");
                    sb5.append(jLongValue4 / j4);
                }
                sb5.append("\n");
                sb5.append((CharSequence) sb4);
                ProfileActivity.this.listCodecs("video/avc", sb5);
                ProfileActivity.this.listCodecs("video/hevc", sb5);
                ProfileActivity.this.listCodecs("video/x-vnd.on2.vp8", sb5);
                ProfileActivity.this.listCodecs("video/x-vnd.on2.vp9", sb5);
                ProfileActivity.this.showDialog(new AnonymousClass1(ProfileActivity.this.getParentActivity(), null, sb5.toString(), false, null, false));
            } catch (Exception unused) {
            }
        }

        public void lambda$onItemClick$1(TLObject tLObject, TLRPC.TL_error tL_error) {
            TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
            tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
            tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
            ProfileActivity.this.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                    this.f$0.lambda$onItemClick$0(tLObject2, tL_error2);
                }
            });
        }

        public void lambda$onItemClick$0(TLObject tLObject, TLRPC.TL_error tL_error) {
            ProfileActivity.this.getMessagesController().loadAppConfig();
        }

        class AnonymousClass1 extends ShareAlert {
            AnonymousClass1(Context context, ArrayList arrayList, String str, boolean z, String str2, boolean z2) {
                super(context, arrayList, str, z, str2, z2);
            }

            @Override
            protected void onSend(final LongSparseArray longSparseArray, final int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
                if (z) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onSend$0(longSparseArray, i);
                        }
                    }, 250L);
                }
            }

            public void lambda$onSend$0(LongSparseArray longSparseArray, int i) {
                BulletinFactory.createInviteSentBulletin(ProfileActivity.this.getParentActivity(), ProfileActivity.this.contentView, longSparseArray.size(), longSparseArray.size() == 1 ? ((TLRPC.Dialog) longSparseArray.valueAt(0)).id : 0L, i, getThemedColor(Theme.key_undo_background), getThemedColor(Theme.key_undo_infoColor)).show();
            }
        }

        public static void lambda$onItemClick$2(int i, DialogInterface dialogInterface, int i2) {
            int i3 = 2 - i2;
            if (i3 == i) {
                SharedConfig.overrideDevicePerformanceClass(-1);
            } else {
                SharedConfig.overrideDevicePerformanceClass(i3);
            }
        }
    }

    public void lambda$createView$29(android.view.View r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.lambda$createView$29(android.view.View, int):void");
    }

    public boolean lambda$createView$31(View view, int i) {
        if (this.searchAdapter.isSearchWas() || this.searchAdapter.recentSearches.isEmpty()) {
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), this.resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.ClearSearchAlertTitle));
        builder.setMessage(LocaleController.getString(R.string.ClearSearchAlert));
        builder.setPositiveButton(LocaleController.getString(R.string.ClearButton), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                this.f$0.lambda$createView$30(alertDialog, i2);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        showDialog(alertDialogCreate);
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView == null) {
            return true;
        }
        textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        return true;
    }

    public void lambda$createView$30(AlertDialog alertDialog, int i) {
        this.searchAdapter.clearRecent();
    }

    public void lambda$createView$32(TLObject tLObject) {
        this.currentChannelParticipant = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
    }

    public void lambda$createView$33(final TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createView$32(tLObject);
                }
            });
        }
    }

    class AnonymousClass17 implements ChatRightsEditActivity.ChatRightsEditActivityDelegate {
        final TLRPC.Chat val$chat;
        final ChatRightsEditActivity val$fragment;

        AnonymousClass17(TLRPC.Chat chat, ChatRightsEditActivity chatRightsEditActivity) {
            this.val$chat = chat;
            this.val$fragment = chatRightsEditActivity;
        }

        @Override
        public void didSetRights(int i, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
            ChatRightsEditActivity chatRightsEditActivity;
            ProfileActivity.this.removeSelfFromStack();
            final TLRPC.User user = ProfileActivity.this.getMessagesController().getUser(Long.valueOf(ProfileActivity.this.userId));
            if (user == null || this.val$chat == null || ProfileActivity.this.userId == 0 || (chatRightsEditActivity = this.val$fragment) == null || !chatRightsEditActivity.banning || chatRightsEditActivity.getParentLayout() == null) {
                return;
            }
            for (final BaseFragment baseFragment : this.val$fragment.getParentLayout().getFragmentStack()) {
                if (baseFragment instanceof ChannelAdminLogActivity) {
                    ((ChannelAdminLogActivity) baseFragment).lambda$processSelectedOption$20();
                    final TLRPC.Chat chat = this.val$chat;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            ProfileActivity.AnonymousClass17.lambda$didSetRights$0(baseFragment, user, chat);
                        }
                    });
                    return;
                }
            }
        }

        public static void lambda$didSetRights$0(BaseFragment baseFragment, TLRPC.User user, TLRPC.Chat chat) {
            BulletinFactory.createRemoveFromChatBulletin(baseFragment, user, chat.title).show();
        }

        @Override
        public void didChangeOwner(TLRPC.User user) {
            ProfileActivity.this.undoView.showWithAction(-ProfileActivity.this.chatId, ProfileActivity.this.currentChat.megagroup ? 10 : 9, user);
        }
    }

    public void lambda$createView$34(TLRPC.Chat chat, View view) {
        long j = this.userId;
        long j2 = this.banFromGroup;
        TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
        TLRPC.ChannelParticipant channelParticipant = this.currentChannelParticipant;
        ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(j, j2, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
        chatRightsEditActivity.setDelegate(new AnonymousClass17(chat, chatRightsEditActivity));
        presentFragment(chatRightsEditActivity);
    }

    class AnonymousClass19 extends FrameLayout {
        CanvasButton canvasButton;

        AnonymousClass19(Context context) {
            super(context);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (ProfileActivity.this.transitionOnlineText != null) {
                canvas.save();
                canvas.translate(ProfileActivity.this.onlineTextView[0].getX(), ProfileActivity.this.onlineTextView[0].getY());
                canvas.saveLayerAlpha(0.0f, 0.0f, ProfileActivity.this.transitionOnlineText.getMeasuredWidth(), ProfileActivity.this.transitionOnlineText.getMeasuredHeight(), (int) ((1.0f - ProfileActivity.this.avatarAnimationProgress) * 255.0f), 31);
                ProfileActivity.this.transitionOnlineText.draw(canvas);
                canvas.restore();
                canvas.restore();
                invalidate();
            }
            if (ProfileActivity.this.hasFallbackPhoto) {
                ProfileActivity profileActivity = ProfileActivity.this;
                if (profileActivity.photoDescriptionProgress == 0.0f || profileActivity.customAvatarProgress == 1.0f) {
                    return;
                }
                float y = ProfileActivity.this.onlineTextView[1].getY() + (ProfileActivity.this.onlineTextView[1].getMeasuredHeight() / 2.0f);
                float fDp = AndroidUtilities.dp(22.0f);
                float fDp2 = (((AndroidUtilities.dp(28.0f) - ProfileActivity.this.customPhotoOffset) + ProfileActivity.this.onlineTextView[1].getX()) - fDp) - ProfileActivity.this.getRatingViewTranslationXOffset();
                ProfileActivity.this.fallbackImage.setImageCoords(fDp2, y - (fDp / 2.0f), fDp, fDp);
                ProfileActivity.this.fallbackImage.setAlpha(ProfileActivity.this.photoDescriptionProgress);
                canvas.save();
                ProfileActivity profileActivity2 = ProfileActivity.this;
                float f = profileActivity2.photoDescriptionProgress;
                canvas.scale(f, f, profileActivity2.fallbackImage.getCenterX(), ProfileActivity.this.fallbackImage.getCenterY());
                ProfileActivity.this.fallbackImage.draw(canvas);
                canvas.restore();
                if (ProfileActivity.this.customAvatarProgress == 0.0f) {
                    if (this.canvasButton == null) {
                        CanvasButton canvasButton = new CanvasButton(this);
                        this.canvasButton = canvasButton;
                        canvasButton.setDelegate(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$dispatchDraw$0();
                            }
                        });
                    }
                    float fDp3 = AndroidUtilities.dp(28.0f) * (1.0f - ProfileActivity.this.customAvatarProgress);
                    float textWidth = ProfileActivity.this.onlineTextView[2].getTextWidth();
                    float fMax = fDp3 + Math.max(textWidth, ProfileActivity.this.ratingView != null ? (AndroidUtilities.dp(24.0f) + textWidth + AndroidUtilities.dp(4.0f)) * ProfileActivity.this.ratingView.getVisibilityFactor() : 0.0f);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(fDp2 - AndroidUtilities.dp(4.0f), y - AndroidUtilities.dp(14.0f), fDp2 + fMax + AndroidUtilities.dp(4.0f), y + AndroidUtilities.dp(14.0f));
                    this.canvasButton.setRect(rectF);
                    this.canvasButton.setRounded(true);
                    this.canvasButton.setColor(0, ColorUtils.setAlphaComponent(-1, 50));
                    this.canvasButton.draw(canvas);
                    return;
                }
                CanvasButton canvasButton2 = this.canvasButton;
                if (canvasButton2 != null) {
                    canvasButton2.cancelRipple();
                }
            }
        }

        public void lambda$dispatchDraw$0() {
            if (ProfileActivity.this.customAvatarProgress != 1.0f) {
                ProfileActivity.this.avatarsViewPager.scrollToLastItem();
            }
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            CanvasButton canvasButton;
            return (ProfileActivity.this.customAvatarProgress == 0.0f && (canvasButton = this.canvasButton) != null && canvasButton.checkTouchEvent(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            CanvasButton canvasButton;
            return (ProfileActivity.this.customAvatarProgress == 0.0f && (canvasButton = this.canvasButton) != null && canvasButton.checkTouchEvent(motionEvent)) || super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            ProfileActivity.this.fallbackImage.onAttachedToWindow();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            ProfileActivity.this.fallbackImage.onDetachedFromWindow();
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ProfileActivity.this.updateCollectibleHint();
        }
    }

    public void lambda$createView$36(View view) {
        TLRPC.Document documentFindDocument;
        Bulletin bulletinCreateContainsEmojiBulletin;
        if (this.avatarBig != null) {
            return;
        }
        if (this.isTopic && !getMessagesController().premiumFeaturesBlocked()) {
            ArrayList<TLRPC.TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(this.chatId);
            if (topics != null) {
                TLRPC.TL_forumTopic tL_forumTopic = null;
                for (int i = 0; tL_forumTopic == null && i < topics.size(); i++) {
                    TLRPC.TL_forumTopic tL_forumTopic2 = topics.get(i);
                    if (tL_forumTopic2 != null && tL_forumTopic2.id == this.topicId) {
                        tL_forumTopic = tL_forumTopic2;
                    }
                }
                if (tL_forumTopic != null) {
                    long j = tL_forumTopic.icon_emoji_id;
                    if (j == 0 || (documentFindDocument = AnimatedEmojiDrawable.findDocument(this.currentAccount, j)) == null || (bulletinCreateContainsEmojiBulletin = BulletinFactory.of(this).createContainsEmojiBulletin(documentFindDocument, 1, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            this.f$0.lambda$createView$35((TLRPC.InputStickerSet) obj);
                        }
                    })) == null) {
                        return;
                    }
                    bulletinCreateContainsEmojiBulletin.show();
                    return;
                }
                return;
            }
            return;
        }
        if (expandAvatar()) {
            return;
        }
        openAvatar();
    }

    public void lambda$createView$35(TLRPC.InputStickerSet inputStickerSet) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(inputStickerSet);
        showDialog(new EmojiPacksAlert(this, getParentActivity(), this.resourcesProvider, arrayList));
    }

    public boolean lambda$createView$37(View view) {
        if (this.avatarBig == null && !this.isTopic) {
            openAvatar();
        }
        return false;
    }

    public void lambda$createView$38(float f) {
        this.onlineTextView[1].setTranslationX(getOnlineTextViewTranslationXWithOffsets(this.lastOnlineTextViewX));
        this.onlineTextView[1].setTranslationY(getOnlineTextViewTranslationYWithOffsets(this.lastOnlineTextViewY));
    }

    public void lambda$createView$39(View view) {
        if (this.writeButton.getTag() != null) {
            return;
        }
        onWriteButtonClick();
    }

    public void lambda$createView$40(ValueAnimator valueAnimator) {
        setAvatarExpandProgress(valueAnimator.getAnimatedFraction());
    }

    public void lambda$createView$41(View view) {
        finishPreviewFragment();
    }

    public void lambda$createView$42(View view) {
        stopTabsReorder();
    }

    public void lambda$createView$43(IBlur3Capture iBlur3Capture, Canvas canvas, RectF rectF) {
        iBlur3Capture.capture(canvas, rectF);
        IBlur3Capture iBlur3Capture2 = this.sharedMediaLayout.iBlur3Capture;
        if (iBlur3Capture2 != null) {
            iBlur3Capture2.capture(canvas, rectF);
        }
    }

    public void stopTabsReorder() {
        this.sharedMediaLayout.scrollSlidingTextTabStrip.setReordering(false);
        this.sharedMediaLayout.sendTabsOrder();
        this.sharedMediaLayout.updateTabs(true);
        this.bottomButton2Container.animate().translationY(AndroidUtilities.dp(69.0f)).setDuration(180L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$stopTabsReorder$44();
            }
        }).start();
        BulletinFactory.of(this).createSimpleBulletin(R.raw.contact_check, "Tab order changed.").show();
    }

    public void lambda$stopTabsReorder$44() {
        this.bottomButton2Container.setVisibility(8);
    }

    public void updateGooey() {
        float fMin = Math.min(this.pullUpProgress, 0.25f) / 0.25f;
        if (this.isTopic) {
            this.avatarGooey.setAlpha(1.0f - fMin);
            this.avatarGooey.setBlurIntensity(0.0f);
            this.avatarGooey.setGooeyEnabled(false);
        } else {
            this.avatarGooey.setPullProgress(this.pullUpProgress);
            this.avatarGooey.setBlurIntensity(Math.min((MathUtils.clamp(this.pullUpProgress, 0.2f, 0.7f) - 0.2f) / 0.5f, 0.75f));
            ProfileGooeyView profileGooeyView = this.avatarGooey;
            float f = this.pullUpProgress;
            profileGooeyView.setGooeyEnabled(f > 0.0f && f < 1.0f);
        }
        ProfileStoriesView profileStoriesView = this.storyView;
        if (profileStoriesView != null && this.playProfileAnimation != 2) {
            float f2 = this.pullUpProgress;
            profileStoriesView.setAlpha(f2 > 0.0f ? AndroidUtilities.lerp(1.0f, 0.0f, AndroidUtilities.ilerp(f2, 0.0f, 0.5f)) : 1.0f);
        }
        this.avatarGooey.setVisibility(this.pullUpProgress >= 1.0f ? 8 : 0);
    }

    public int getHeaderOnlyExtraHeight() {
        if (getActionsExtraHeight() == 0) {
            return AndroidUtilities.dp(168.0f);
        }
        return AndroidUtilities.dp(152.0f);
    }

    public int getActionsExtraHeight() {
        if (this.userId == 0 || this.imageUpdater == null || this.myProfile) {
            return AndroidUtilities.dp(74.0f);
        }
        return 0;
    }

    public int getHeaderExtraHeight() {
        return getHeaderOnlyExtraHeight() + getActionsExtraHeight();
    }

    public void updateBottomButtonY() {
        float fDp;
        if (this.bottomButtonsContainer == null) {
            return;
        }
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout != null && sharedMediaLayout.isAttachedToWindow()) {
            fDp = Math.max(0.0f, AndroidUtilities.dp(184.0f) - (this.listView.getMeasuredHeight() - this.sharedMediaLayout.getY()));
        } else {
            fDp = AndroidUtilities.dp(72.0f);
        }
        this.bottomButtonsContainer.setTranslationY(Math.min(fDp, AndroidUtilities.dp(64.0f)));
        Bulletin visibleBulletin = Bulletin.getVisibleBulletin();
        if (visibleBulletin != null) {
            visibleBulletin.updatePosition();
        }
    }

    private void checkCanSendStoryForPosting() {
        if (ChatObject.isBoostSupported(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chatId)))) {
            getMessagesController().getStoriesController().canSendStoryFor(getDialogId(), new com.google.android.exoplayer2.util.Consumer() {
                @Override
                public final void accept(Object obj) {
                    ProfileActivity.lambda$checkCanSendStoryForPosting$45((Boolean) obj);
                }
            }, false, this.resourcesProvider);
        }
    }

    public void updateAvatarRoundRadius() {
        this.avatarImage.setRoundRadiusForExpand((int) AndroidUtilities.lerp(getSmallAvatarRoundRadius(), 0.0f, this.currentExpandAnimatorValue));
    }

    public void onGiftPermiumClicked() {
        TLRPC.UserFull userFull = this.userInfo;
        if (userFull != null && UserObject.areGiftsDisabled(userFull)) {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(getDialogId())))).show();
                return;
            }
            return;
        }
        if (this.currentChat != null) {
            MessagesController.getGlobalMainSettings().edit().putInt("channelgifthint", 3).apply();
        }
        showDialog(new GiftSheet(getContext(), this.currentAccount, getDialogId(), null, null));
    }

    public void onCallClicked(boolean z) {
        if (this.userId != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.userId));
            if (user != null) {
                TLRPC.UserFull userFull = this.userInfo;
                VoIPHelper.startCall(user, z, userFull != null && userFull.video_calls_available, getParentActivity(), this.userInfo, getAccountInstance());
                return;
            }
            return;
        }
        if (this.chatId != 0) {
            if (getMessagesController().getGroupCall(this.chatId, false) == null) {
                VoIPHelper.showGroupCallAlert(this, this.currentChat, null, false, getAccountInstance());
            } else {
                VoIPHelper.startCall(this.currentChat, null, null, false, getParentActivity(), this, getAccountInstance());
            }
        }
    }

    public void onBlockContactClicked(boolean z) {
        final TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.userId));
        if (user == null) {
            return;
        }
        if (!this.isBot || MessagesController.isSupportUser(user)) {
            if (this.userBlocked) {
                getMessagesController().unblockPeer(this.userId);
                if (BulletinFactory.canShowBulletin(this)) {
                    BulletinFactory.createBanBulletin(this, false).show();
                    return;
                }
                return;
            }
            if (this.reportSpam) {
                AlertsCreator.showBlockReportSpamAlert(this, this.userId, user, null, this.currentEncryptedChat, false, null, new MessagesStorage.IntCallback() {
                    @Override
                    public final void run(int i) {
                        this.f$0.lambda$onBlockContactClicked$46(i);
                    }
                }, this.resourcesProvider);
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), this.resourcesProvider);
            builder.setTitle(LocaleController.getString(R.string.BlockUser));
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name))));
            builder.setPositiveButton(LocaleController.getString(R.string.BlockContact), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    this.f$0.lambda$onBlockContactClicked$47(alertDialog, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialogCreate = builder.create();
            showDialog(alertDialogCreate);
            TextView textView = (TextView) alertDialogCreate.getButton(-1);
            if (textView != null) {
                textView.setTextColor(getThemedColor(Theme.key_text_RedBold));
                return;
            }
            return;
        }
        if (!this.userBlocked || z) {
            AlertsCreator.createClearOrDeleteDialogAlert(this, false, this.currentChat, user, this.currentEncryptedChat != null, true, true, new MessagesStorage.BooleanCallback() {
                @Override
                public final void run(boolean z2) {
                    this.f$0.lambda$onBlockContactClicked$48(user, z2);
                }
            }, getResourceProvider());
        } else {
            getMessagesController().unblockPeer(this.userId, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onBlockContactClicked$49();
                }
            });
            finishFragment();
        }
    }

    public void lambda$onBlockContactClicked$46(int i) {
        if (i == 1) {
            NotificationCenter notificationCenter = getNotificationCenter();
            int i2 = NotificationCenter.closeChats;
            notificationCenter.removeObserver(this, i2);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i2, new Object[0]);
            this.playProfileAnimation = 0;
            finishFragment();
            return;
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(this.userId));
    }

    public void lambda$onBlockContactClicked$47(AlertDialog alertDialog, int i) {
        getMessagesController().blockPeer(this.userId);
        if (BulletinFactory.canShowBulletin(this)) {
            BulletinFactory.createBanBulletin(this, true).show();
        }
    }

    public void lambda$onBlockContactClicked$48(TLRPC.User user, boolean z) {
        if (getParentLayout() != null) {
            List fragmentStack = getParentLayout().getFragmentStack();
            if (((fragmentStack == null || fragmentStack.size() < 2) ? null : (BaseFragment) fragmentStack.get(fragmentStack.size() - 2)) instanceof ChatActivity) {
                getParentLayout().removeFragmentFromStack(fragmentStack.size() - 2);
            }
        }
        this.disableProfileAnimation = true;
        finishFragment();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(this.dialogId), user, this.currentChat, Boolean.valueOf(z));
    }

    public void lambda$onBlockContactClicked$49() {
        getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", this.userId, null, null, null, false, null, null, null, true, 0, 0, null, false));
    }

    public void onShareClicked() {
        String str;
        TLRPC.UserFull userFull;
        try {
            if (this.userId != 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.userId));
                if (user == null) {
                    return;
                }
                if (this.botInfo != null && (userFull = this.userInfo) != null && !TextUtils.isEmpty(userFull.about)) {
                    str = String.format("%s https://" + getMessagesController().linkPrefix + "/%s", this.userInfo.about, UserObject.getPublicUsername(user));
                } else {
                    str = String.format("https://" + getMessagesController().linkPrefix + "/%s", UserObject.getPublicUsername(user));
                }
            } else if (this.chatId != 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
                if (chat == null) {
                    return;
                }
                TLRPC.ChatFull chatFull = this.chatInfo;
                if (chatFull != null && !TextUtils.isEmpty(chatFull.about)) {
                    str = String.format("%s\nhttps://" + getMessagesController().linkPrefix + "/%s", this.chatInfo.about, ChatObject.getPublicUsername(chat));
                } else {
                    str = String.format("https://" + getMessagesController().linkPrefix + "/%s", ChatObject.getPublicUsername(chat));
                }
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", str);
            startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.BotShare)), 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void collapseAvatarInstant() {
        if (!this.allowPullingDown || this.currentExpandAnimatorValue <= 0.0f) {
            return;
        }
        this.layoutManager.scrollToPositionWithOffset(0, getHeaderExtraHeight() - this.listView.getPaddingTop());
        this.listView.post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$collapseAvatarInstant$50();
            }
        });
    }

    public void lambda$collapseAvatarInstant$50() {
        needLayout(true);
        if (this.expandAnimator.isRunning()) {
            this.expandAnimator.cancel();
        }
        setAvatarExpandProgress(1.0f);
    }

    public boolean expandAvatar() {
        View childAt;
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder;
        Integer num;
        if ((this.hasMainTabs || (!AndroidUtilities.isTablet() && !this.isInLandscapeMode)) && this.avatarImage.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            this.openingAvatar = true;
            this.allowPullingDown = true;
            int i = 0;
            while (true) {
                if (i >= this.listView.getChildCount()) {
                    childAt = null;
                    break;
                }
                RecyclerListView recyclerListView = this.listView;
                if (recyclerListView.getChildAdapterPosition(recyclerListView.getChildAt(i)) == 0) {
                    childAt = this.listView.getChildAt(i);
                    break;
                }
                i++;
            }
            if (childAt != null && (viewHolderFindContainingViewHolder = this.listView.findContainingViewHolder(childAt)) != null && (num = (Integer) this.positionToOffset.get(Integer.valueOf(viewHolderFindContainingViewHolder.getAdapterPosition()))) != null) {
                this.ignoreScrollOnFullExpand = true;
                this.listView.smoothScrollBy(0, -(num.intValue() + ((this.listView.getPaddingTop() - childAt.getTop()) - this.actionBar.getMeasuredHeight())), CubicBezierInterpolator.EASE_OUT_QUINT);
                return true;
            }
        }
        return false;
    }

    private void setAvatarExpandProgress(float r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.setAvatarExpandProgress(float):void");
    }

    public float calculateHeaderExtraDiff() {
        return Utilities.clamp01((this.extraHeight - getActionsExtraHeight()) / getHeaderOnlyExtraHeight());
    }

    private void fixAvatarImageInCenter() {
        if (this.listView == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.avatarContainer.getLayoutParams();
        float measuredWidth = (this.listView.getMeasuredWidth() / 2.0f) - (layoutParams.leftMargin + ((layoutParams.width * this.avatarScale) * 0.5f));
        this.avatarX = measuredWidth;
        if (this.openAnimationInProgress) {
            this.avatarX = AndroidUtilities.lerp(0.0f, measuredWidth, this.avatarAnimationProgress);
        }
        this.avatarContainer.setTranslationX(this.avatarX);
    }

    private int getSmallAvatarRoundRadius() {
        if (this.chatId == 0 || !ChatObject.isForum(getMessagesController().getChat(Long.valueOf(this.chatId)))) {
            return AndroidUtilities.dp(50.0f);
        }
        return AndroidUtilities.dp(needInsetForStories() ? 24.0f : 38.0f);
    }

    private void updateTtlIcon() {
        TLRPC.UserFull userFull;
        if (this.ttlIconView == null) {
            return;
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.ttlIconView, this.currentEncryptedChat == null && (((userFull = this.userInfo) != null && userFull.ttl_period > 0) || (this.chatInfo != null && ChatObject.canUserDoAdminAction(this.currentChat, 13) && this.chatInfo.ttl_period > 0)), 0.8f, this.fragmentOpened);
    }

    public long getDialogId() {
        long j = this.dialogId;
        if (j != 0) {
            return j;
        }
        long j2 = this.userId;
        return j2 != 0 ? j2 : -this.chatId;
    }

    public void getEmojiStatusLocation(Rect rect) {
        SimpleTextView simpleTextView = this.nameTextView[1];
        if (simpleTextView == null) {
            return;
        }
        if (simpleTextView.getRightDrawable() == null) {
            rect.set(this.nameTextView[1].getWidth() - 1, (this.nameTextView[1].getHeight() / 2) - 1, this.nameTextView[1].getWidth() + 1, (this.nameTextView[1].getHeight() / 2) + 1);
            return;
        }
        rect.set(this.nameTextView[1].getRightDrawable().getBounds());
        rect.offset((int) (rect.centerX() * (this.nameTextView[1].getScaleX() - 1.0f)), 0);
        rect.offset((int) this.nameTextView[1].getX(), (int) this.nameTextView[1].getY());
    }

    private void onNotificationsClicked(boolean z, float f, float f2, View view) {
        float f3;
        float height;
        long j;
        long j2 = this.dialogId;
        if (j2 == 0) {
            j2 = this.userId;
            if (j2 == 0) {
                j2 = -this.chatId;
            }
        }
        final long j3 = j2;
        if (z && this.isTopic) {
            boolean zIsDialogMuted = getMessagesController().isDialogMuted(j3, this.topicId);
            boolean z2 = !zIsDialogMuted;
            getNotificationsController().muteDialog(j3, this.topicId, z2);
            BulletinFactory.createMuteBulletin(this, z2, null).show();
            updateExceptions();
            this.actionsView.setNotifications(zIsDialogMuted);
            return;
        }
        if ((!z && LocaleController.isRTL && f <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
            NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) view;
            boolean zIsChecked = notificationsCheckCell.isChecked();
            boolean z3 = !zIsChecked;
            boolean zIsGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(j3, false, false);
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, this.topicId);
            if (!zIsChecked) {
                SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
                if (zIsGlobalNotificationsEnabled) {
                    editorEdit.remove("notify2_" + sharedPrefKey);
                } else {
                    editorEdit.putInt("notify2_" + sharedPrefKey, 0);
                }
                if (this.topicId == 0) {
                    getMessagesStorage().setDialogFlags(j3, 0L);
                    TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.get(j3);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
                editorEdit.apply();
            } else {
                SharedPreferences.Editor editorEdit2 = MessagesController.getNotificationsSettings(this.currentAccount).edit();
                if (!zIsGlobalNotificationsEnabled) {
                    editorEdit2.remove("notify2_" + sharedPrefKey);
                    j = 0L;
                } else {
                    editorEdit2.putInt("notify2_" + sharedPrefKey, 2);
                    j = 1;
                }
                getNotificationsController().removeNotificationsForDialog(j3);
                if (this.topicId == 0) {
                    getMessagesStorage().setDialogFlags(j3, j);
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) getMessagesController().dialogs_dict.get(j3);
                    if (dialog2 != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog2.notify_settings = tL_peerNotifySettings;
                        if (zIsGlobalNotificationsEnabled) {
                            tL_peerNotifySettings.mute_until = Integer.MAX_VALUE;
                        }
                    }
                }
                editorEdit2.apply();
            }
            updateExceptions();
            getNotificationsController().updateServerNotificationsSettings(j3, this.topicId);
            notificationsCheckCell.setChecked(z3);
            updateNotifications(true);
            return;
        }
        ChatNotificationsPopupWrapper chatNotificationsPopupWrapper = new ChatNotificationsPopupWrapper(getContext(), this.currentAccount, null, true, true, new ChatNotificationsPopupWrapper.Callback() {
            @Override
            public void dismiss() {
                ChatNotificationsPopupWrapper.Callback.CC.$default$dismiss(this);
            }

            @Override
            public void toggleSound() {
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((BaseFragment) ProfileActivity.this).currentAccount);
                boolean z4 = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(j3, ProfileActivity.this.topicId), true);
                boolean z5 = !z4;
                notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(j3, ProfileActivity.this.topicId), z5).apply();
                if (BulletinFactory.canShowBulletin(ProfileActivity.this)) {
                    ProfileActivity profileActivity = ProfileActivity.this;
                    BulletinFactory.createSoundEnabledBulletin(profileActivity, z4 ? 1 : 0, profileActivity.getResourceProvider()).show();
                }
            }

            @Override
            public void muteFor(int i) {
                if (i == 0) {
                    if (ProfileActivity.this.getMessagesController().isDialogMuted(j3, ProfileActivity.this.topicId)) {
                        toggleMute();
                    }
                    if (BulletinFactory.canShowBulletin(ProfileActivity.this)) {
                        ProfileActivity profileActivity = ProfileActivity.this;
                        BulletinFactory.createMuteBulletin(profileActivity, 4, i, profileActivity.getResourceProvider()).show();
                        return;
                    }
                    return;
                }
                ProfileActivity.this.getNotificationsController().muteUntil(j3, ProfileActivity.this.topicId, i);
                if (BulletinFactory.canShowBulletin(ProfileActivity.this)) {
                    ProfileActivity profileActivity2 = ProfileActivity.this;
                    BulletinFactory.createMuteBulletin(profileActivity2, 5, i, profileActivity2.getResourceProvider()).show();
                }
                ProfileActivity.this.updateExceptions();
                ProfileActivity.this.updateNotifications(true);
            }

            @Override
            public void showCustomize() {
                if (j3 != 0) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", j3);
                    bundle.putLong("topic_id", ProfileActivity.this.topicId);
                    ProfileActivity profileActivity = ProfileActivity.this;
                    profileActivity.presentFragment(new ProfileNotificationsActivity(bundle, profileActivity.resourcesProvider));
                }
            }

            @Override
            public void toggleMute() {
                boolean z4 = !ProfileActivity.this.getMessagesController().isDialogMuted(j3, ProfileActivity.this.topicId);
                ProfileActivity.this.getNotificationsController().muteDialog(j3, ProfileActivity.this.topicId, z4);
                ProfileActivity profileActivity = ProfileActivity.this;
                if (profileActivity.fragmentView != null) {
                    BulletinFactory.createMuteBulletin(profileActivity, z4, null).show();
                }
                ProfileActivity.this.updateExceptions();
                ProfileActivity.this.updateNotifications(true);
            }

            @Override
            public void openExceptions() {
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", j3);
                TopicsNotifySettingsFragments topicsNotifySettingsFragments = new TopicsNotifySettingsFragments(bundle);
                topicsNotifySettingsFragments.setExceptions(ProfileActivity.this.notificationsExceptionTopics);
                ProfileActivity.this.presentFragment(topicsNotifySettingsFragments);
            }
        }, getResourceProvider());
        chatNotificationsPopupWrapper.lambda$update$11(j3, this.topicId, this.notificationsExceptionTopics);
        if (AndroidUtilities.isTablet()) {
            ViewGroup view2 = this.parentLayout.getView();
            float x = f + view2.getX() + view2.getPaddingLeft();
            height = f2 + view2.getY() + view2.getPaddingTop();
            f3 = x;
        } else {
            f3 = f;
            height = f2;
        }
        if (z) {
            height += this.actionsView.getHeight() - AndroidUtilities.dp(12.0f);
        }
        chatNotificationsPopupWrapper.showAsOptions(this, view, f3, height, z);
    }

    public void updateNotifications(boolean z) {
        int i;
        ListAdapter listAdapter;
        if (z && (i = this.notificationsRow) >= 0 && (listAdapter = this.listAdapter) != null) {
            listAdapter.notifyItemChanged(i);
        }
        ProfileActionsView profileActionsView = this.actionsView;
        if (profileActionsView == null || this.myProfile) {
            return;
        }
        profileActionsView.setNotifications(isNotificationsEnabled());
    }

    private boolean isNotificationsEnabled() {
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
        long j = this.dialogId;
        if (j == 0) {
            j = this.userId;
            if (j == 0) {
                j = -this.chatId;
            }
        }
        String sharedPrefKey = NotificationsController.getSharedPrefKey(j, this.topicId);
        boolean zContains = notificationsSettings.contains("notify2_" + sharedPrefKey);
        int i = notificationsSettings.getInt("notify2_" + sharedPrefKey, 0);
        int i2 = notificationsSettings.getInt("notifyuntil_" + sharedPrefKey, 0);
        if (i != 3 || i2 == Integer.MAX_VALUE) {
            if (i == 0) {
                if (!zContains) {
                    return getNotificationsController().isGlobalNotificationsEnabled(j, false, false);
                }
            } else if (i != 1) {
                return false;
            }
        } else if (i2 - getConnectionsManager().getCurrentTime() > 0) {
            return false;
        }
        return true;
    }

    public void goToForum() {
        if (getParentLayout() != null && getParentLayout().getFragmentStack() != null) {
            int i = 0;
            while (i < getParentLayout().getFragmentStack().size()) {
                BaseFragment baseFragment = (BaseFragment) getParentLayout().getFragmentStack().get(i);
                if (baseFragment instanceof DialogsActivity) {
                    DialogsActivity dialogsActivity = (DialogsActivity) baseFragment;
                    RightSlidingDialogContainer rightSlidingDialogContainer = dialogsActivity.rightSlidingDialogContainer;
                    if (rightSlidingDialogContainer != null) {
                        BaseFragment fragment = rightSlidingDialogContainer.getFragment();
                        if ((fragment instanceof TopicsFragment) && ((TopicsFragment) fragment).getDialogId() == getDialogId()) {
                            dialogsActivity.rightSlidingDialogContainer.lambda$presentFragment$1();
                        }
                    }
                } else if (baseFragment instanceof ChatActivity) {
                    if (((ChatActivity) baseFragment).getDialogId() == getDialogId()) {
                        getParentLayout().removeFragmentFromStack(baseFragment);
                        i--;
                    }
                } else if (baseFragment instanceof TopicsFragment) {
                    if (((TopicsFragment) baseFragment).getDialogId() == getDialogId()) {
                        getParentLayout().removeFragmentFromStack(baseFragment);
                        i--;
                    }
                } else if ((baseFragment instanceof ProfileActivity) && baseFragment != this) {
                    ProfileActivity profileActivity = (ProfileActivity) baseFragment;
                    if (profileActivity.getDialogId() == getDialogId() && profileActivity.isTopic) {
                        getParentLayout().removeFragmentFromStack(baseFragment);
                        i--;
                    }
                }
                i++;
            }
        }
        this.playProfileAnimation = 0;
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        presentFragment(TopicsFragment.getTopicsOrChat(this, bundle));
    }

    public void showStatusSelect() {
        if (this.selectAnimatedEmojiDialog != null) {
            return;
        }
        final SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[] selectAnimatedEmojiDialogWindowArr = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[1];
        Rect rect = AndroidUtilities.rectTmp2;
        getEmojiStatusLocation(rect);
        int i = this.nameTextView[1].getScaleX() < 1.5f ? 16 : 32;
        int iDp = (-(this.avatarContainer2.getHeight() - rect.centerY())) - AndroidUtilities.dp(i);
        int iMin = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
        int iCenterX = rect.centerX();
        int iClamp = MathUtils.clamp(iCenterX - (iMin / 2), 0, AndroidUtilities.displaySize.x - iMin);
        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = new SelectAnimatedEmojiDialog(this, getContext(), true, Integer.valueOf(Math.max(0, iCenterX - iClamp)), this.currentChat == null ? 0 : 9, true, this.resourcesProvider, i) {
            @Override
            protected boolean willApplyEmoji(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
                return tL_starGiftUnique == null || StarsController.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).findUserStarGift(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
            }

            @Override
            public long getDialogId() {
                return ProfileActivity.this.getDialogId();
            }

            @Override
            protected void onEmojiSelected(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
                TLRPC.EmojiStatus tL_emojiStatusEmpty;
                if (tL_starGiftUnique != null) {
                    TL_stars.SavedStarGift savedStarGiftFindUserStarGift = StarsController.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).findUserStarGift(tL_starGiftUnique.id);
                    if (savedStarGiftFindUserStarGift != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                        MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                        new StarGiftSheet(getContext(), ((BaseFragment) ProfileActivity.this).currentAccount, UserConfig.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).getClientUserId(), ProfileActivity.this.resourcesProvider).set(savedStarGiftFindUserStarGift, (StarsController.IGiftsList) null).setupWearPage().show();
                        if (selectAnimatedEmojiDialogWindowArr[0] != null) {
                            ProfileActivity.this.selectAnimatedEmojiDialog = null;
                            selectAnimatedEmojiDialogWindowArr[0].dismiss();
                            return;
                        }
                        return;
                    }
                    TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                    tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.id;
                    tL_emojiStatusEmpty = tL_inputEmojiStatusCollectible;
                    if (num != null) {
                        tL_inputEmojiStatusCollectible.flags |= 1;
                        tL_inputEmojiStatusCollectible.until = num.intValue();
                        tL_emojiStatusEmpty = tL_inputEmojiStatusCollectible;
                    }
                } else if (l == null) {
                    tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
                } else {
                    TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                    tL_emojiStatus.document_id = l.longValue();
                    tL_emojiStatusEmpty = tL_emojiStatus;
                    if (num != null) {
                        tL_emojiStatus.flags |= 1;
                        tL_emojiStatus.until = num.intValue();
                        tL_emojiStatusEmpty = tL_emojiStatus;
                    }
                }
                ProfileActivity.this.emojiStatusGiftId = tL_starGiftUnique != null ? Long.valueOf(tL_starGiftUnique.id) : null;
                ProfileActivity.this.getMessagesController().updateEmojiStatus(ProfileActivity.this.currentChat == null ? 0L : -ProfileActivity.this.currentChat.id, tL_emojiStatusEmpty, tL_starGiftUnique);
                for (int i2 = 0; i2 < 2; i2++) {
                    if (ProfileActivity.this.emojiStatusDrawable[i2] != null) {
                        if (l == null && ProfileActivity.this.currentChat == null) {
                            ProfileActivity.this.emojiStatusDrawable[i2].set(ProfileActivity.this.getPremiumCrossfadeDrawable(i2), true);
                        } else if (l != null) {
                            ProfileActivity.this.emojiStatusDrawable[i2].set(l.longValue(), true);
                        } else {
                            ProfileActivity.this.emojiStatusDrawable[i2].set((Drawable) null, true);
                        }
                        ProfileActivity.this.emojiStatusDrawable[i2].setParticles(tL_starGiftUnique != null, true);
                    }
                }
                if (l != null) {
                    ProfileActivity.this.animatedStatusView.animateChange(ReactionsLayoutInBubble.VisibleReaction.fromCustomEmoji(l));
                }
                ProfileActivity.this.updateEmojiStatusDrawableColor();
                ProfileActivity.this.updateEmojiStatusEffectPosition();
                if (selectAnimatedEmojiDialogWindowArr[0] != null) {
                    ProfileActivity.this.selectAnimatedEmojiDialog = null;
                    selectAnimatedEmojiDialogWindowArr[0].dismiss();
                }
            }
        };
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.userId));
        if (user != null) {
            selectAnimatedEmojiDialog.setExpireDateHint(DialogObject.getEmojiStatusUntil(user.emoji_status));
        }
        Long l = this.emojiStatusGiftId;
        if (l != null) {
            selectAnimatedEmojiDialog.setSelected(l);
        } else {
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiStatusDrawable[1];
            selectAnimatedEmojiDialog.setSelected((swapAnimatedEmojiDrawable == null || !(swapAnimatedEmojiDrawable.getDrawable() instanceof AnimatedEmojiDrawable)) ? null : Long.valueOf(((AnimatedEmojiDrawable) this.emojiStatusDrawable[1].getDrawable()).getDocumentId()));
        }
        selectAnimatedEmojiDialog.setSaveState(3);
        selectAnimatedEmojiDialog.setScrimDrawable(this.emojiStatusDrawable[1], this.nameTextView[1]);
        int i2 = -2;
        SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow(selectAnimatedEmojiDialog, i2, i2) {
            @Override
            public void dismiss() {
                super.dismiss();
                ProfileActivity.this.selectAnimatedEmojiDialog = null;
            }
        };
        this.selectAnimatedEmojiDialog = selectAnimatedEmojiDialogWindow;
        selectAnimatedEmojiDialogWindowArr[0] = selectAnimatedEmojiDialogWindow;
        int[] iArr = new int[2];
        SimpleTextView simpleTextView = this.nameTextView[1];
        if (simpleTextView != null) {
            simpleTextView.getLocationOnScreen(iArr);
        }
        selectAnimatedEmojiDialogWindowArr[0].showAsDropDown(this.fragmentView, iClamp, iDp, 51);
        selectAnimatedEmojiDialogWindowArr[0].dimBehind();
    }

    @Override
    public TLRPC.Chat getCurrentChat() {
        return this.currentChat;
    }

    public TLRPC.UserFull getUserInfo() {
        return this.userInfo;
    }

    @Override
    public boolean isFragmentOpened() {
        return this.isFragmentOpened;
    }

    private void openAvatar() {
        openAvatar(false);
    }

    public void openAvatar(boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.openAvatar(boolean):void");
    }

    private void onJoinClicked(final boolean z) {
        final BaseFragment lastFragment = this.parentLayout.getLastFragment();
        final boolean[] zArr = {true};
        getMessagesController().addUserToChat(this.currentChat.id, getUserConfig().getCurrentUser(), 0, null, this, true, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onJoinClicked$51(z, zArr);
            }
        }, new MessagesController.ErrorDelegate() {
            @Override
            public final boolean run(TLRPC.TL_error tL_error) {
                return this.f$0.lambda$onJoinClicked$52(zArr, z, lastFragment, tL_error);
            }
        });
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
    }

    public void lambda$onJoinClicked$51(boolean z, boolean[] zArr) {
        if (!z || this.joinRow != -1) {
            updateRowsIds();
            ListAdapter listAdapter = this.listAdapter;
            if (listAdapter != null) {
                listAdapter.notifyDataSetChanged();
                return;
            }
            return;
        }
        ProfileActionsView profileActionsView = this.actionsView;
        if (profileActionsView != null) {
            profileActionsView.stopLoading(7);
            if (zArr[0]) {
                this.actionsView.beginApplyingActions();
                this.actionsView.set(7, false);
                this.actionsView.set(9, true);
                this.actionsView.commitActions();
            }
        }
    }

    public boolean lambda$onJoinClicked$52(boolean[] zArr, boolean z, BaseFragment baseFragment, TLRPC.TL_error tL_error) {
        zArr[0] = false;
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        MessagesController.getNotificationsSettings(this.currentAccount).edit().putLong("dialog_join_requested_time_" + this.dialogId, System.currentTimeMillis()).commit();
        JoinGroupAlert.showBulletin(getContext(), this, ChatObject.isChannel(this.currentChat) && !this.currentChat.megagroup);
        if (!z || this.joinRow != -1) {
            updateRowsIds();
            ListAdapter listAdapter = this.listAdapter;
            if (listAdapter != null) {
                listAdapter.notifyDataSetChanged();
            }
        }
        if (baseFragment instanceof ChatActivity) {
            ((ChatActivity) baseFragment).showBottomOverlayProgress(false, true);
        }
        return false;
    }

    public void onWriteButtonClick() {
        if (this.userId != 0) {
            if (this.imageUpdater != null) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
                if (user == null) {
                    user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                }
                if (user == null) {
                    return;
                }
                ImageUpdater imageUpdater = this.imageUpdater;
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                imageUpdater.openMenu((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onWriteButtonClick$53();
                    }
                }, new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        this.f$0.lambda$onWriteButtonClick$54(dialogInterface);
                    }
                }, 0);
                this.cameraDrawable.setCurrentFrame(0);
                this.cameraDrawable.setCustomEndFrame(43);
                this.cellCameraDrawable.setCurrentFrame(0);
                this.cellCameraDrawable.setCustomEndFrame(43);
                ProfileActionsView profileActionsView = this.actionsView;
                if (profileActionsView != null) {
                    profileActionsView.startCameraAnimation();
                } else {
                    this.writeButton.playAnimation();
                }
                TextCell textCell = this.setAvatarCell;
                if (textCell != null) {
                    textCell.getImageView().playAnimation();
                    return;
                }
                return;
            }
            openChat();
            return;
        }
        openDiscussion();
    }

    public void lambda$onWriteButtonClick$53() {
        MessagesController.getInstance(this.currentAccount).deleteUserPhoto(null);
        this.cameraDrawable.setCurrentFrame(0);
        this.cellCameraDrawable.setCurrentFrame(0);
    }

    public void lambda$onWriteButtonClick$54(DialogInterface dialogInterface) {
        if (!this.imageUpdater.isUploadingImage()) {
            this.cameraDrawable.setCustomEndFrame(86);
            this.cellCameraDrawable.setCustomEndFrame(86);
            ProfileActionsView profileActionsView = this.actionsView;
            if (profileActionsView != null) {
                profileActionsView.startCameraAnimation();
            } else {
                this.writeButton.playAnimation();
            }
            TextCell textCell = this.setAvatarCell;
            if (textCell != null) {
                textCell.getImageView().playAnimation();
                return;
            }
            return;
        }
        this.cameraDrawable.setCurrentFrame(0, false);
        this.cellCameraDrawable.setCurrentFrame(0, false);
    }

    private void openChat() {
        INavigationLayout iNavigationLayout;
        if (this.userId != 0) {
            if (this.playProfileAnimation != 0 && (iNavigationLayout = this.parentLayout) != null && iNavigationLayout.getFragmentStack() != null && this.parentLayout.getFragmentStack().size() >= 2 && (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof ChatActivity)) {
                finishFragment();
                return;
            }
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.userId));
            if (user == null || (user instanceof TLRPC.TL_userEmpty)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.userId);
            if (getMessagesController().checkCanOpenChat(bundle, this)) {
                boolean z = this.arguments.getBoolean("removeFragmentOnChatOpen", true);
                if (!AndroidUtilities.isTablet() && z) {
                    NotificationCenter notificationCenter = getNotificationCenter();
                    int i = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(this, i);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i, new Object[0]);
                }
                int i2 = getArguments().getInt("nearby_distance", -1);
                if (i2 >= 0) {
                    bundle.putInt("nearby_distance", i2);
                }
                ChatActivity chatActivity = new ChatActivity(bundle);
                chatActivity.setPreloadedSticker(getMediaDataController().getGreetingsSticker(), false);
                presentFragment(chatActivity, z);
                if (!AndroidUtilities.isTablet() || this.hasMainTabs) {
                    return;
                }
                finishFragment();
            }
        }
    }

    private void openTopic() {
        INavigationLayout iNavigationLayout;
        if (!this.isTopic || this.playProfileAnimation == 0 || (iNavigationLayout = this.parentLayout) == null || iNavigationLayout.getFragmentStack() == null || this.parentLayout.getFragmentStack().size() < 2 || !(this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof ChatActivity)) {
            return;
        }
        finishFragment();
    }

    private void openGroup() {
        INavigationLayout iNavigationLayout;
        if (this.playProfileAnimation != 0 && (iNavigationLayout = this.parentLayout) != null && iNavigationLayout.getFragmentStack() != null && this.parentLayout.getFragmentStack().size() >= 2 && (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof ChatActivity)) {
            finishFragment();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        if (getMessagesController().checkCanOpenChat(bundle, this)) {
            presentFragment(new ChatActivity(bundle), false);
        }
    }

    private void openForum() {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        if (getMessagesController().checkCanOpenChat(bundle, this)) {
            presentFragment(new ChatActivity(bundle), false);
        }
    }

    public void openDiscussion() {
        TLRPC.ChatFull chatFull = this.chatInfo;
        if (chatFull == null || chatFull.linked_chat_id == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatInfo.linked_chat_id);
        if (getMessagesController().checkCanOpenChat(bundle, this)) {
            presentFragment(new ChatActivity(bundle));
        }
    }

    public boolean onMemberClick(TLRPC.ChatParticipant chatParticipant, boolean z, View view) {
        return onMemberClick(chatParticipant, z, false, view);
    }

    @Override
    public boolean onMemberClick(final TLRPC.ChatParticipant chatParticipant, boolean z, boolean z2, View view) {
        boolean z3;
        TLRPC.ChannelParticipant channelParticipant;
        boolean z4;
        boolean z5;
        boolean z6;
        if (getParentActivity() == null) {
            return false;
        }
        if (z) {
            final TLRPC.User user = getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
            if (user != null && chatParticipant.user_id != getUserConfig().getClientUserId()) {
                this.selectedUser = chatParticipant.user_id;
                if (ChatObject.isChannel(this.currentChat)) {
                    TLRPC.ChannelParticipant channelParticipant2 = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                    getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                    boolean zCanAddAdmins = ChatObject.canAddAdmins(this.currentChat);
                    if (zCanAddAdmins && ((channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) || ((channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) && !channelParticipant2.can_edit))) {
                        zCanAddAdmins = false;
                    }
                    boolean z7 = ChatObject.canBlockUsers(this.currentChat) && (!((channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant2.can_edit);
                    z3 = channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin;
                    channelParticipant = channelParticipant2;
                    z4 = zCanAddAdmins;
                    z6 = z7;
                    z5 = this.currentChat.gigagroup ? false : z7;
                } else {
                    TLRPC.Chat chat = this.currentChat;
                    boolean z8 = chat.creator || ((chatParticipant instanceof TLRPC.TL_chatParticipant) && (ChatObject.canBlockUsers(chat) || chatParticipant.inviter_id == getUserConfig().getClientUserId()));
                    z3 = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                    channelParticipant = null;
                    z4 = this.currentChat.creator;
                    z5 = z4;
                    z6 = z8;
                }
                final boolean z9 = z3;
                z = z4 || z5 || z6;
                if (!z2 && z) {
                    final TLRPC.ChannelParticipant channelParticipant3 = channelParticipant;
                    final Utilities.Callback callback = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            this.f$0.lambda$onMemberClick$55(channelParticipant3, user, chatParticipant, z9, (Integer) obj);
                        }
                    };
                    final TLRPC.ChannelParticipant channelParticipant4 = channelParticipant;
                    ItemOptions.makeOptions(this, view).setScrimViewBackground(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundWhite))).addIf(z4, R.drawable.msg_admins, LocaleController.getString(z9 ? R.string.EditAdminRights : R.string.SetAsAdmin), new Runnable() {
                        @Override
                        public final void run() {
                            ProfileActivity.lambda$onMemberClick$56(callback);
                        }
                    }).addIf(z5, R.drawable.msg_permissions, LocaleController.getString(R.string.ChangePermissions), new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onMemberClick$58(channelParticipant4, chatParticipant, user, callback);
                        }
                    }).addIf(z6, R.drawable.msg_remove, (CharSequence) LocaleController.getString(R.string.KickFromGroup), true, new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onMemberClick$59(chatParticipant);
                        }
                    }).setMinWidth(190).show();
                }
            }
            return z;
        }
        if (chatParticipant.user_id == getUserConfig().getClientUserId()) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", chatParticipant.user_id);
        bundle.putBoolean("preload_messages", true);
        presentFragment(new ProfileActivity(bundle));
        return true;
    }

    public void lambda$onMemberClick$55(TLRPC.ChannelParticipant channelParticipant, TLRPC.User user, TLRPC.ChatParticipant chatParticipant, boolean z, Integer num) {
        if (channelParticipant != null) {
            openRightsEdit(num.intValue(), user, chatParticipant, channelParticipant.admin_rights, channelParticipant.banned_rights, channelParticipant.rank, z);
        } else {
            openRightsEdit(num.intValue(), user, chatParticipant, null, null, "", z);
        }
    }

    public static void lambda$onMemberClick$56(Utilities.Callback callback) {
        callback.run(0);
    }

    public void lambda$onMemberClick$58(TLRPC.ChannelParticipant channelParticipant, TLRPC.ChatParticipant chatParticipant, TLRPC.User user, final Utilities.Callback callback) {
        if ((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
            showDialog(new AlertDialog.Builder(getParentActivity(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.AppName)).setMessage(LocaleController.formatString("AdminWillBeRemoved", R.string.AdminWillBeRemoved, ContactsController.formatName(user.first_name, user.last_name))).setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    ProfileActivity.lambda$onMemberClick$57(callback, alertDialog, i);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create());
        } else {
            callback.run(1);
        }
    }

    public static void lambda$onMemberClick$57(Utilities.Callback callback, AlertDialog alertDialog, int i) {
        callback.run(1);
    }

    public void lambda$onMemberClick$59(TLRPC.ChatParticipant chatParticipant) {
        kickUser(this.selectedUser, chatParticipant);
    }

    private void openRightsEdit(final int i, final TLRPC.User user, final TLRPC.ChatParticipant chatParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, final boolean z) {
        final boolean[] zArr = new boolean[1];
        ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(user.id, this.chatId, tL_chatAdminRights, this.currentChat.default_banned_rights, tL_chatBannedRights, str, i, true, false, null) {
            @Override
            public void onTransitionAnimationEnd(boolean z2, boolean z3) {
                if (!z2 && z3 && zArr[0] && BulletinFactory.canShowBulletin(ProfileActivity.this)) {
                    BulletinFactory.createPromoteToAdminBulletin(ProfileActivity.this, user.first_name).show();
                }
            }
        };
        chatRightsEditActivity.setDelegate(new ChatRightsEditActivity.ChatRightsEditActivityDelegate() {
            @Override
            public void didSetRights(int i2, TLRPC.TL_chatAdminRights tL_chatAdminRights2, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str2) {
                boolean z2;
                TLRPC.ChatParticipant tL_chatParticipant;
                int i3 = i;
                int i4 = 0;
                if (i3 != 0) {
                    if (i3 == 1 && i2 == 0 && ProfileActivity.this.currentChat.megagroup && ProfileActivity.this.chatInfo != null && ProfileActivity.this.chatInfo.participants != null) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= ProfileActivity.this.chatInfo.participants.participants.size()) {
                                z2 = false;
                                break;
                            } else {
                                if (MessageObject.getPeerId(((TLRPC.TL_chatChannelParticipant) ProfileActivity.this.chatInfo.participants.participants.get(i5)).channelParticipant.peer) == chatParticipant.user_id) {
                                    ProfileActivity.this.chatInfo.participants_count--;
                                    ProfileActivity.this.chatInfo.participants.participants.remove(i5);
                                    z2 = true;
                                    break;
                                }
                                i5++;
                            }
                        }
                        if (ProfileActivity.this.chatInfo != null && ProfileActivity.this.chatInfo.participants != null) {
                            while (true) {
                                if (i4 >= ProfileActivity.this.chatInfo.participants.participants.size()) {
                                    break;
                                }
                                if (ProfileActivity.this.chatInfo.participants.participants.get(i4).user_id == chatParticipant.user_id) {
                                    ProfileActivity.this.chatInfo.participants.participants.remove(i4);
                                    z2 = true;
                                    break;
                                }
                                i4++;
                            }
                        }
                        if (z2) {
                            ProfileActivity.this.updateOnlineCount(true);
                            ProfileActivity.this.updateRowsIds();
                            ProfileActivity.this.listAdapter.notifyDataSetChanged();
                            return;
                        }
                        return;
                    }
                    return;
                }
                TLRPC.ChatParticipant chatParticipant2 = chatParticipant;
                if (chatParticipant2 instanceof TLRPC.TL_chatChannelParticipant) {
                    TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = (TLRPC.TL_chatChannelParticipant) chatParticipant2;
                    if (i2 == 1) {
                        TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                        tL_chatChannelParticipant.channelParticipant = tL_channelParticipantAdmin;
                        tL_channelParticipantAdmin.flags |= 4;
                    } else {
                        tL_chatChannelParticipant.channelParticipant = new TLRPC.TL_channelParticipant();
                    }
                    tL_chatChannelParticipant.channelParticipant.inviter_id = ProfileActivity.this.getUserConfig().getClientUserId();
                    tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                    TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                    TLRPC.Peer peer = channelParticipant.peer;
                    TLRPC.ChatParticipant chatParticipant3 = chatParticipant;
                    peer.user_id = chatParticipant3.user_id;
                    channelParticipant.date = chatParticipant3.date;
                    channelParticipant.banned_rights = tL_chatBannedRights2;
                    channelParticipant.admin_rights = tL_chatAdminRights2;
                    channelParticipant.rank = str2;
                } else if (chatParticipant2 != null) {
                    if (i2 == 1) {
                        tL_chatParticipant = new TLRPC.TL_chatParticipantAdmin();
                    } else {
                        tL_chatParticipant = new TLRPC.TL_chatParticipant();
                    }
                    TLRPC.ChatParticipant chatParticipant4 = chatParticipant;
                    tL_chatParticipant.user_id = chatParticipant4.user_id;
                    tL_chatParticipant.date = chatParticipant4.date;
                    tL_chatParticipant.inviter_id = chatParticipant4.inviter_id;
                    int iIndexOf = ProfileActivity.this.chatInfo.participants.participants.indexOf(chatParticipant);
                    if (iIndexOf >= 0) {
                        ProfileActivity.this.chatInfo.participants.participants.set(iIndexOf, tL_chatParticipant);
                    }
                }
                if (i2 != 1 || z) {
                    return;
                }
                zArr[0] = true;
            }

            @Override
            public void didChangeOwner(TLRPC.User user2) {
                ProfileActivity.this.undoView.showWithAction(-ProfileActivity.this.chatId, ProfileActivity.this.currentChat.megagroup ? 10 : 9, user2);
            }
        });
        presentFragment(chatRightsEditActivity);
    }

    public boolean processOnClickOrPress(final int r21, final android.view.View r22, final float r23, final float r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.processOnClickOrPress(int, android.view.View, float, float):boolean");
    }

    class AnonymousClass37 extends ShareAlert {
        AnonymousClass37(Context context, ArrayList arrayList, String str, boolean z, String str2, boolean z2) {
            super(context, arrayList, str, z, str2, z2);
        }

        @Override
        protected void onSend(final LongSparseArray longSparseArray, final int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
            if (z) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onSend$0(longSparseArray, i);
                    }
                }, 250L);
            }
        }

        public void lambda$onSend$0(LongSparseArray longSparseArray, int i) {
            BulletinFactory.createInviteSentBulletin(ProfileActivity.this.getParentActivity(), ProfileActivity.this.contentView, longSparseArray.size(), longSparseArray.size() == 1 ? ((TLRPC.Dialog) longSparseArray.valueAt(0)).id : 0L, i, getThemedColor(Theme.key_undo_background), getThemedColor(Theme.key_undo_infoColor)).show();
        }
    }

    public void lambda$processOnClickOrPress$63(final TLRPC.TL_username tL_username, final ShareAlert shareAlert, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processOnClickOrPress$62(tLObject, tL_username, shareAlert, tL_error);
            }
        });
    }

    public void lambda$processOnClickOrPress$62(TLObject tLObject, TLRPC.TL_username tL_username, ShareAlert shareAlert, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TL_fragment.TL_collectibleInfo) {
            final TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) tLObject;
            if (this.userId != 0) {
                getMessagesController().getUser(Long.valueOf(this.userId));
            } else {
                getMessagesController().getChat(Long.valueOf(this.chatId));
            }
            String str2 = "@" + tL_username.username;
            String str3 = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_collectibleInfo.purchase_date * 1000));
            String currency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
            String currency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
            BulletinFactory bulletinFactoryOf = BulletinFactory.of(shareAlert.bulletinContainer2, this.resourcesProvider);
            int i = R.drawable.filled_username;
            int i2 = R.string.FragmentChannelUsername;
            if (TextUtils.isEmpty(currency2)) {
                str = "";
            } else {
                str = "(" + currency2 + ")";
            }
            bulletinFactoryOf.createImageBulletin(i, AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.formatString(i2, str2, str3, currency, str)), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$processOnClickOrPress$60(tL_collectibleInfo);
                }
            })).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$processOnClickOrPress$61(tL_collectibleInfo, view);
                }
            }).show(false);
            return;
        }
        BulletinFactory.showError(tL_error);
    }

    public void lambda$processOnClickOrPress$60(TL_fragment.TL_collectibleInfo tL_collectibleInfo) {
        Bulletin.hideVisible();
        Browser.openUrl(getContext(), tL_collectibleInfo.url);
    }

    public void lambda$processOnClickOrPress$61(TL_fragment.TL_collectibleInfo tL_collectibleInfo, View view) {
        Bulletin.hideVisible();
        Browser.openUrl(getContext(), tL_collectibleInfo.url);
    }

    public void lambda$processOnClickOrPress$65(final TLRPC.TL_username tL_username, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processOnClickOrPress$64(tLObject, tL_username, tL_error);
            }
        });
    }

    public void lambda$processOnClickOrPress$64(TLObject tLObject, TLRPC.TL_username tL_username, TLRPC.TL_error tL_error) {
        TLObject chat;
        if (tLObject instanceof TL_fragment.TL_collectibleInfo) {
            if (this.userId != 0) {
                chat = getMessagesController().getUser(Long.valueOf(this.userId));
            } else {
                chat = getMessagesController().getChat(Long.valueOf(this.chatId));
            }
            FragmentUsernameBottomSheet.open(getContext(), 0, tL_username.username, chat, (TL_fragment.TL_collectibleInfo) tLObject, getResourceProvider());
            return;
        }
        BulletinFactory.showError(tL_error);
    }

    public void lambda$processOnClickOrPress$67(final String str, final TLRPC.User user, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processOnClickOrPress$66(tLObject, str, user, tL_error);
            }
        });
    }

    public void lambda$processOnClickOrPress$66(TLObject tLObject, String str, TLRPC.User user, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_fragment.TL_collectibleInfo) {
            FragmentUsernameBottomSheet.open(getContext(), 1, str, user, (TL_fragment.TL_collectibleInfo) tLObject, getResourceProvider());
        } else {
            BulletinFactory.showError(tL_error);
        }
    }

    public void lambda$processOnClickOrPress$68(AtomicReference atomicReference, int i, TLRPC.User user, View view) {
        ((ActionBarPopupWindow) atomicReference.get()).dismiss();
        if (i == 0) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:+" + user.phone));
                intent.addFlags(268435456);
                getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (i == 1) {
            try {
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "+" + user.phone));
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    BulletinFactory.of(this).createCopyBulletin(LocaleController.getString(R.string.PhoneCopied)).show();
                    return;
                }
                return;
            } catch (Exception e2) {
                FileLog.e(e2);
                return;
            }
        }
        if ((i == 2 || i == 3) && getParentActivity() != null) {
            boolean z = i == 3;
            TLRPC.UserFull userFull = this.userInfo;
            VoIPHelper.startCall(user, z, userFull != null && userFull.video_calls_available, getParentActivity(), this.userInfo, getAccountInstance());
        }
    }

    public static void lambda$processOnClickOrPress$69(View view) {
        try {
            view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
        } catch (ActivityNotFoundException e) {
            FileLog.e(e);
        }
    }

    public void lambda$processOnClickOrPress$72(boolean[] zArr, final String str, final int i, final String[] strArr, final String str2, float f, float f2, View view) {
        ViewGroup view2;
        if (getParentActivity() == null) {
            return;
        }
        boolean z = false;
        CharSequence[] charSequenceArr = zArr[0] ? new CharSequence[]{LocaleController.getString(R.string.Copy), LocaleController.getString(R.string.TranslateMessage)} : new CharSequence[]{LocaleController.getString(R.string.Copy)};
        int[] iArr = zArr[0] ? new int[]{R.drawable.msg_copy, R.drawable.msg_translate} : new int[]{R.drawable.msg_copy};
        final AtomicReference atomicReference = new AtomicReference();
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(getContext(), R.drawable.popup_fixed_alert, this.resourcesProvider) {
            Path path = new Path();

            @Override
            protected boolean drawChild(Canvas canvas, View view3, long j) {
                canvas.save();
                this.path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                this.path.addRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
                canvas.clipPath(this.path);
                boolean zDrawChild = super.drawChild(canvas, view3, j);
                canvas.restore();
                return zDrawChild;
            }
        };
        actionBarPopupWindowLayout.setFitItems(true);
        int i2 = 0;
        while (i2 < iArr.length) {
            final int i3 = i2;
            ActionBarMenuItem.addItem(actionBarPopupWindowLayout, iArr[i2], charSequenceArr[i2], z, this.resourcesProvider).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    this.f$0.lambda$processOnClickOrPress$71(atomicReference, i3, str, i, strArr, str2, view3);
                }
            });
            i2++;
            z = false;
        }
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout, -2, -2);
        actionBarPopupWindow.setPauseNotifications(true);
        actionBarPopupWindow.setDismissAnimationDuration(220);
        actionBarPopupWindow.setOutsideTouchable(true);
        actionBarPopupWindow.setClippingEnabled(true);
        actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
        actionBarPopupWindow.setFocusable(true);
        actionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        actionBarPopupWindow.setInputMethodMode(2);
        actionBarPopupWindow.getContentView().setFocusableInTouchMode(true);
        atomicReference.set(actionBarPopupWindow);
        float x = f;
        float y = f2;
        for (View view3 = view; view3 != null && view3 != getFragmentView(); view3 = (View) view3.getParent()) {
            x += view3.getX();
            y += view3.getY();
        }
        if (AndroidUtilities.isTablet() && (view2 = this.parentLayout.getView()) != null) {
            x += view2.getX() + view2.getPaddingLeft();
            y += view2.getY() + view2.getPaddingTop();
        }
        actionBarPopupWindow.showAtLocation(getFragmentView(), 0, (int) (x - (actionBarPopupWindowLayout.getMeasuredWidth() / 2.0f)), (int) y);
        actionBarPopupWindow.dimBehind();
    }

    public void lambda$processOnClickOrPress$71(AtomicReference atomicReference, int i, String str, int i2, String[] strArr, String str2, View view) {
        ((ActionBarPopupWindow) atomicReference.get()).dismiss();
        try {
            if (i == 0) {
                AndroidUtilities.addToClipboard(str);
                if (i2 == this.bioRow) {
                    BulletinFactory.of(this).createCopyBulletin(LocaleController.getString(R.string.BioCopied)).show();
                } else {
                    BulletinFactory.of(this).createCopyBulletin(LocaleController.getString(R.string.TextCopied)).show();
                }
            } else if (i != 1) {
            } else {
                TranslateAlert2.showAlert(this.fragmentView.getContext(), this, this.currentAccount, strArr[0], str2, str, null, false, new Utilities.CallbackReturn() {
                    @Override
                    public final Object run(Object obj) {
                        return this.f$0.lambda$processOnClickOrPress$70((URLSpan) obj);
                    }
                }, null);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public Boolean lambda$processOnClickOrPress$70(URLSpan uRLSpan) {
        if (uRLSpan != null) {
            openUrl(uRLSpan.getURL(), null);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public void lambda$processOnClickOrPress$73(String[] strArr, boolean[] zArr, String str, boolean z, Runnable runnable, String str2) {
        TLRPC.Chat chat;
        strArr[0] = str2;
        zArr[0] = str2 != null && (!str2.equals(str) || str2.equals("und")) && ((z && !RestrictedLanguagesSelectActivity.getRestrictedLanguages().contains(str2)) || ((chat = this.currentChat) != null && ((chat.has_link || ChatObject.isPublic(chat)) && ("uk".equals(str2) || "ru".equals(str2)))));
        runnable.run();
    }

    public static void lambda$processOnClickOrPress$74(Runnable runnable, Exception exc) {
        FileLog.e("mlkit: failed to detect language in selection", exc);
        runnable.run();
    }

    public void lambda$processOnClickOrPress$75(AtomicReference atomicReference, String str, int i, View view) {
        ((ActionBarPopupWindow) atomicReference.get()).dismiss();
        try {
            AndroidUtilities.addToClipboard(str);
            if (i == this.bizHoursRow) {
                BulletinFactory.of(this).createCopyBulletin(LocaleController.getString(R.string.BusinessHoursCopied)).show();
            } else {
                BulletinFactory.of(this).createCopyBulletin(LocaleController.getString(R.string.BusinessLocationCopied)).show();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void leaveChatPressed() {
        boolean zIsForum = ChatObject.isForum(this.currentChat);
        AlertsCreator.createClearOrDeleteDialogAlert(this, false, this.currentChat, null, false, zIsForum, !zIsForum, new MessagesStorage.BooleanCallback() {
            @Override
            public final void run(boolean z) {
                this.f$0.lambda$leaveChatPressed$76(z);
            }
        }, this.resourcesProvider);
    }

    public void lambda$leaveChatPressed$76(boolean z) {
        this.playProfileAnimation = 0;
        NotificationCenter notificationCenter = getNotificationCenter();
        int i = NotificationCenter.closeChats;
        notificationCenter.removeObserver(this, i);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i, new Object[0]);
        finishFragment();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-this.currentChat.id), null, this.currentChat, Boolean.valueOf(z));
    }

    public void getChannelParticipants(boolean z) {
        LongSparseArray longSparseArray;
        if (this.loadingUsers || (longSparseArray = this.participantsMap) == null || this.chatInfo == null) {
            return;
        }
        this.loadingUsers = true;
        final int i = (longSparseArray.size() == 0 || !z) ? 0 : 300;
        final TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.chatId);
        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
        tL_channels_getParticipants.offset = z ? 0 : this.participantsMap.size();
        tL_channels_getParticipants.limit = 200;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_channels_getParticipants, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$getChannelParticipants$79(tL_channels_getParticipants, i, tLObject, tL_error);
            }
        }), this.classGuid);
    }

    public void lambda$getChannelParticipants$78(final TLRPC.TL_error tL_error, final TLObject tLObject, final TLRPC.TL_channels_getParticipants tL_channels_getParticipants) {
        getNotificationCenter().doOnIdle(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getChannelParticipants$77(tL_error, tLObject, tL_channels_getParticipants);
            }
        });
    }

    public void lambda$getChannelParticipants$79(final TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$getChannelParticipants$78(tL_error, tLObject, tL_channels_getParticipants);
            }
        }, i);
    }

    public void lambda$getChannelParticipants$77(TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_channels_getParticipants tL_channels_getParticipants) {
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            getMessagesController().putUsers(tL_channels_channelParticipants.users, false);
            getMessagesController().putChats(tL_channels_channelParticipants.chats, false);
            if (tL_channels_channelParticipants.users.size() < 200) {
                this.usersEndReached = true;
            }
            if (tL_channels_getParticipants.offset == 0) {
                this.participantsMap.clear();
                this.chatInfo.participants = new TLRPC.TL_chatParticipants();
                getMessagesStorage().putUsersAndChats(tL_channels_channelParticipants.users, tL_channels_channelParticipants.chats, true, true);
                getMessagesStorage().updateChannelUsers(this.chatId, tL_channels_channelParticipants.participants);
            }
            for (int i = 0; i < tL_channels_channelParticipants.participants.size(); i++) {
                TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i);
                tL_chatChannelParticipant.channelParticipant = channelParticipant;
                tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
                long peerId = MessageObject.getPeerId(channelParticipant.peer);
                tL_chatChannelParticipant.user_id = peerId;
                tL_chatChannelParticipant.date = tL_chatChannelParticipant.channelParticipant.date;
                if (this.participantsMap.indexOfKey(peerId) < 0) {
                    TLRPC.ChatFull chatFull = this.chatInfo;
                    if (chatFull.participants == null) {
                        chatFull.participants = new TLRPC.TL_chatParticipants();
                    }
                    this.chatInfo.participants.participants.add(tL_chatChannelParticipant);
                    this.participantsMap.put(tL_chatChannelParticipant.user_id, tL_chatChannelParticipant);
                }
            }
        }
        this.loadingUsers = false;
        saveScrollPosition();
        updateListAnimated(true);
    }

    private void setMediaHeaderVisible(boolean z) {
        if (this.mediaHeaderVisible == z) {
            return;
        }
        this.mediaHeaderVisible = z;
        AnimatorSet animatorSet = this.headerAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.headerShadowAnimatorSet;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        final ActionBarMenuItem searchItem = this.sharedMediaLayout.getSearchItem();
        RLottieImageView searchOptionsItem = this.sharedMediaLayout.getSearchOptionsItem();
        TextView saveItem = this.sharedMediaLayout.getSaveItem();
        if (!this.mediaHeaderVisible) {
            if (this.callItemVisible) {
                this.callItem.setVisibility(0);
            }
            if (this.videoCallItemVisible) {
                this.videoCallItem.setVisibility(0);
            }
            if (this.editItemVisible) {
                this.editItem.setVisibility(0);
            }
            this.otherItem.setVisibility(0);
            if (searchOptionsItem != null) {
                searchOptionsItem.setVisibility(8);
            }
            if (saveItem != null) {
                saveItem.setVisibility(8);
            }
        } else {
            if (this.sharedMediaLayout.isSearchItemVisible()) {
                searchItem.setVisibility(0);
            }
            if (searchOptionsItem != null) {
                searchOptionsItem.setVisibility(0);
            }
            if (this.sharedMediaLayout.isOptionsItemVisible()) {
                this.sharedMediaLayout.photoVideoOptionsItem.setVisibility(0);
                this.sharedMediaLayout.animateSearchToOptions(true, false);
            } else {
                this.sharedMediaLayout.photoVideoOptionsItem.setVisibility(4);
                this.sharedMediaLayout.animateSearchToOptions(false, false);
            }
        }
        updateStoriesViewBounds(false);
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.createMenu().requestLayout();
        }
        ArrayList arrayList = new ArrayList();
        ActionBarMenuItem actionBarMenuItem = this.callItem;
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem, (Property<ActionBarMenuItem, Float>) property, z ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.videoCallItem, (Property<ActionBarMenuItem, Float>) property, z ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.otherItem, (Property<ActionBarMenuItem, Float>) property, z ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.editItem, (Property<ActionBarMenuItem, Float>) property, z ? 0.0f : 1.0f));
        ActionBarMenuItem actionBarMenuItem2 = this.callItem;
        Property property2 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem2, (Property<ActionBarMenuItem, Float>) property2, z ? -AndroidUtilities.dp(10.0f) : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.videoCallItem, (Property<ActionBarMenuItem, Float>) property2, z ? -AndroidUtilities.dp(10.0f) : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.otherItem, (Property<ActionBarMenuItem, Float>) property2, z ? -AndroidUtilities.dp(10.0f) : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.editItem, (Property<ActionBarMenuItem, Float>) property2, z ? -AndroidUtilities.dp(10.0f) : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(searchItem, (Property<ActionBarMenuItem, Float>) property, z ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(searchItem, (Property<ActionBarMenuItem, Float>) property2, z ? 0.0f : AndroidUtilities.dp(10.0f)));
        arrayList.add(ObjectAnimator.ofFloat(this.sharedMediaLayout.photoVideoOptionsItem, (Property<ImageView, Float>) property, z ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.sharedMediaLayout.photoVideoOptionsItem, (Property<ImageView, Float>) property2, z ? 0.0f : AndroidUtilities.dp(10.0f)));
        arrayList.add(ObjectAnimator.ofFloat(this.actionBar, (Property<ActionBar, Float>) this.ACTIONBAR_HEADER_PROGRESS, z ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.onlineTextView[1], (Property<SimpleTextView, Float>) property, z ? 0.0f : 1.0f));
        if (this.myProfile) {
            arrayList.add(ObjectAnimator.ofFloat(this.onlineTextView[3], (Property<SimpleTextView, Float>) property, z ? 0.0f : 1.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.mediaCounterTextView, (Property<AudioPlayerAlert.ClippingTextViewSwitcher, Float>) property, z ? 1.0f : 0.0f));
        if (z) {
            arrayList.add(ObjectAnimator.ofFloat(this, (Property<ProfileActivity, Float>) this.HEADER_SHADOW, 0.0f));
        }
        if (this.storyView != null || this.giftsView != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$setMediaHeaderVisible$80(valueAnimator);
                }
            });
            arrayList.add(valueAnimatorOfFloat);
        }
        checkStarRatingVisible();
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.headerAnimatorSet = animatorSet3;
        animatorSet3.playTogether(arrayList);
        this.headerAnimatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.headerAnimatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (ProfileActivity.this.headerAnimatorSet != null) {
                    if (ProfileActivity.this.mediaHeaderVisible) {
                        if (ProfileActivity.this.callItemVisible) {
                            ProfileActivity.this.callItem.setVisibility(8);
                        }
                        if (ProfileActivity.this.videoCallItemVisible) {
                            ProfileActivity.this.videoCallItem.setVisibility(8);
                        }
                        if (ProfileActivity.this.editItemVisible) {
                            ProfileActivity.this.editItem.setVisibility(8);
                        }
                        ProfileActivity.this.otherItem.setVisibility(8);
                    } else {
                        if (ProfileActivity.this.sharedMediaLayout.isSearchItemVisible()) {
                            searchItem.setVisibility(0);
                        }
                        ProfileActivity.this.sharedMediaLayout.photoVideoOptionsItem.setVisibility(4);
                        ProfileActivity.this.headerShadowAnimatorSet = new AnimatorSet();
                        AnimatorSet animatorSet4 = ProfileActivity.this.headerShadowAnimatorSet;
                        ProfileActivity profileActivity = ProfileActivity.this;
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(profileActivity, (Property<ProfileActivity, Float>) profileActivity.HEADER_SHADOW, 1.0f));
                        ProfileActivity.this.headerShadowAnimatorSet.setDuration(100L);
                        ProfileActivity.this.headerShadowAnimatorSet.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator2) {
                                ProfileActivity.this.headerShadowAnimatorSet = null;
                            }
                        });
                        ProfileActivity.this.headerShadowAnimatorSet.start();
                    }
                }
                ProfileActivity.this.updateStoriesViewBounds(false);
                ProfileActivity.this.headerAnimatorSet = null;
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                ProfileActivity.this.headerAnimatorSet = null;
            }
        });
        this.headerAnimatorSet.setDuration(150L);
        this.headerAnimatorSet.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    public void lambda$setMediaHeaderVisible$80(ValueAnimator valueAnimator) {
        updateStoriesViewBounds(true);
    }

    public void openAddMember() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("addToGroup", true);
        bundle.putLong("chatId", this.currentChat.id);
        GroupCreateActivity groupCreateActivity = new GroupCreateActivity(bundle);
        groupCreateActivity.setInfo(this.chatInfo);
        TLRPC.ChatFull chatFull = this.chatInfo;
        if (chatFull != null && chatFull.participants != null) {
            LongSparseArray longSparseArray = new LongSparseArray();
            for (int i = 0; i < this.chatInfo.participants.participants.size(); i++) {
                longSparseArray.put(this.chatInfo.participants.participants.get(i).user_id, null);
            }
            groupCreateActivity.setIgnoreUsers(longSparseArray);
        }
        groupCreateActivity.setDelegate2(new GroupCreateActivity.ContactsAddActivityDelegate() {
            @Override
            public final void didSelectUsers(ArrayList arrayList, int i2) {
                this.f$0.lambda$openAddMember$84(arrayList, i2);
            }

            @Override
            public void needAddBot(TLRPC.User user) {
                GroupCreateActivity.ContactsAddActivityDelegate.CC.$default$needAddBot(this, user);
            }
        });
        presentFragment(groupCreateActivity);
    }

    public void lambda$openAddMember$84(ArrayList arrayList, int i) {
        TLRPC.ChatParticipants chatParticipants;
        final HashSet hashSet = new HashSet();
        final ArrayList arrayList2 = new ArrayList();
        TLRPC.ChatFull chatFull = this.chatInfo;
        if (chatFull != null && (chatParticipants = chatFull.participants) != null && chatParticipants.participants != null) {
            for (int i2 = 0; i2 < this.chatInfo.participants.participants.size(); i2++) {
                hashSet.add(Long.valueOf(this.chatInfo.participants.participants.get(i2).user_id));
            }
        }
        getMessagesController().addUsersToChat(this.currentChat, this, arrayList, i, new androidx.core.util.Consumer() {
            @Override
            public final void accept(Object obj) {
                arrayList2.add((TLRPC.User) obj);
            }
        }, new androidx.core.util.Consumer() {
            @Override
            public final void accept(Object obj) {
                this.f$0.lambda$openAddMember$82((TLRPC.User) obj);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openAddMember$83(arrayList2, hashSet);
            }
        });
    }

    public void lambda$openAddMember$82(TLRPC.User user) {
        for (int i = 0; i < this.chatInfo.participants.participants.size(); i++) {
            if (this.chatInfo.participants.participants.get(i).user_id == user.id) {
                this.chatInfo.participants.participants.remove(i);
                updateListAnimated(true);
                return;
            }
        }
    }

    public void lambda$openAddMember$83(ArrayList arrayList, HashSet hashSet) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i);
            if (!hashSet.contains(Long.valueOf(user.id))) {
                TLRPC.ChatFull chatFull = this.chatInfo;
                if (chatFull.participants == null) {
                    chatFull.participants = new TLRPC.TL_chatParticipants();
                }
                if (ChatObject.isChannel(this.currentChat)) {
                    TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                    TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                    tL_chatChannelParticipant.channelParticipant = tL_channelParticipant;
                    tL_channelParticipant.inviter_id = getUserConfig().getClientUserId();
                    tL_chatChannelParticipant.channelParticipant.peer = new TLRPC.TL_peerUser();
                    TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
                    channelParticipant.peer.user_id = user.id;
                    channelParticipant.date = getConnectionsManager().getCurrentTime();
                    tL_chatChannelParticipant.user_id = user.id;
                    this.chatInfo.participants.participants.add(tL_chatChannelParticipant);
                } else {
                    TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                    tL_chatParticipant.user_id = user.id;
                    tL_chatParticipant.inviter_id = getAccountInstance().getUserConfig().clientUserId;
                    this.chatInfo.participants.participants.add(tL_chatParticipant);
                }
                this.chatInfo.participants_count++;
                getMessagesController().putUser(user, false);
            }
        }
        updateListAnimated(true);
    }

    public void checkListViewScroll() {
        View childAt;
        if (this.listView.getVisibility() != 0) {
            return;
        }
        if (this.sharedMediaLayoutAttached) {
            this.sharedMediaLayout.setVisibleHeight(this.listView.getMeasuredHeight() - this.sharedMediaLayout.getTop());
        }
        if (this.listView.getChildCount() <= 0 || this.openAnimationInProgress) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.listView.getChildCount()) {
                childAt = null;
                break;
            }
            RecyclerListView recyclerListView = this.listView;
            if (recyclerListView.getChildAdapterPosition(recyclerListView.getChildAt(i)) == 0) {
                childAt = this.listView.getChildAt(i);
                break;
            }
            i++;
        }
        RecyclerListView.Holder holder = childAt != null ? (RecyclerListView.Holder) this.listView.findContainingViewHolder(childAt) : null;
        int top = childAt == null ? 0 : childAt.getTop();
        int adapterPosition = holder != null ? holder.getAdapterPosition() : -1;
        if (top < 0 || adapterPosition != 0) {
            top = 0;
        }
        boolean z = this.imageUpdater == null && this.actionBar.isSearchFieldVisible();
        int i2 = this.sharedMediaRow;
        if (i2 != -1 && !z) {
            RecyclerListView.Holder holder2 = (RecyclerListView.Holder) this.listView.findViewHolderForAdapterPosition(i2);
            z = holder2 != null && holder2.itemView.getTop() <= 0;
        }
        setMediaHeaderVisible(z);
        float f = top;
        if (this.extraHeight == f || this.transitionAnimationInProress) {
            return;
        }
        this.extraHeight = f;
        this.topView.invalidate();
        if (this.playProfileAnimation != 0) {
            this.allowProfileAnimation = this.extraHeight > ((float) getActionsExtraHeight());
        }
        needLayout(true);
    }

    @Override
    public void updateSelectedMediaTabText() {
        int i;
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout == null || this.mediaCounterTextView == null) {
            return;
        }
        int closestTab = sharedMediaLayout.getClosestTab();
        int[] lastMediaCount = this.sharedMediaPreloader.getLastMediaCount();
        if (closestTab == 0) {
            if (lastMediaCount[7] <= 0 && lastMediaCount[6] <= 0) {
                int i2 = lastMediaCount[0];
                if (i2 <= 0) {
                    this.mediaCounterTextView.setText(LocaleController.getString(R.string.SharedMedia));
                    return;
                } else {
                    this.mediaCounterTextView.setText(LocaleController.formatPluralString("Media", i2, new Object[0]));
                    return;
                }
            }
            if (this.sharedMediaLayout.getPhotosVideosTypeFilter() == 1 || lastMediaCount[7] <= 0) {
                this.mediaCounterTextView.setText(LocaleController.formatPluralString("Photos", lastMediaCount[6], new Object[0]));
                return;
            } else if (this.sharedMediaLayout.getPhotosVideosTypeFilter() == 2 || (i = lastMediaCount[6]) <= 0) {
                this.mediaCounterTextView.setText(LocaleController.formatPluralString("Videos", lastMediaCount[7], new Object[0]));
                return;
            } else {
                this.mediaCounterTextView.setText(String.format("%s, %s", LocaleController.formatPluralString("Photos", i, new Object[0]), LocaleController.formatPluralString("Videos", lastMediaCount[7], new Object[0])));
                return;
            }
        }
        if (closestTab == 1) {
            int i3 = lastMediaCount[1];
            if (i3 <= 0) {
                this.mediaCounterTextView.setText(LocaleController.getString(R.string.Files));
                return;
            } else {
                this.mediaCounterTextView.setText(LocaleController.formatPluralString("Files", i3, new Object[0]));
                return;
            }
        }
        if (closestTab == 2) {
            int i4 = lastMediaCount[2];
            if (i4 <= 0) {
                this.mediaCounterTextView.setText(LocaleController.getString(R.string.Voice));
                return;
            } else {
                this.mediaCounterTextView.setText(LocaleController.formatPluralString("Voice", i4, new Object[0]));
                return;
            }
        }
        if (closestTab == 3) {
            int i5 = lastMediaCount[3];
            if (i5 <= 0) {
                this.mediaCounterTextView.setText(LocaleController.getString(R.string.SharedLinks));
                return;
            } else {
                this.mediaCounterTextView.setText(LocaleController.formatPluralString("Links", i5, new Object[0]));
                return;
            }
        }
        if (closestTab == 4) {
            int i6 = lastMediaCount[4];
            if (i6 <= 0) {
                this.mediaCounterTextView.setText(LocaleController.getString(R.string.Music));
                return;
            } else {
                this.mediaCounterTextView.setText(LocaleController.formatPluralString("MusicFiles", i6, new Object[0]));
                return;
            }
        }
        if (closestTab == 5) {
            int i7 = lastMediaCount[5];
            if (i7 <= 0) {
                this.mediaCounterTextView.setText(LocaleController.getString(R.string.AccDescrGIFs));
                return;
            } else {
                this.mediaCounterTextView.setText(LocaleController.formatPluralString("GIFs", i7, new Object[0]));
                return;
            }
        }
        if (closestTab == 6) {
            this.mediaCounterTextView.setText(LocaleController.formatPluralString("CommonGroups", this.userInfo.common_chats_count, new Object[0]));
            return;
        }
        if (closestTab == 7) {
            this.mediaCounterTextView.setText(this.onlineTextView[1].getText());
            return;
        }
        if (closestTab == 8 || SharedMediaLayout.isStoryAlbumPageType(closestTab)) {
            if (this.isBot) {
                this.mediaCounterTextView.setText(this.sharedMediaLayout.getBotPreviewsSubtitle(false));
                return;
            } else if (this.sharedMediaLayout.getStoriesCount(closestTab) > 0) {
                this.mediaCounterTextView.setText(LocaleController.formatPluralString("ProfileStoriesCount", this.sharedMediaLayout.getStoriesCount(closestTab), new Object[0]));
                return;
            } else {
                this.mediaCounterTextView.setText(LocaleController.getString(R.string.ProfileStoriesCountZero));
                return;
            }
        }
        if (closestTab == 13) {
            this.mediaCounterTextView.setText(this.sharedMediaLayout.getBotPreviewsSubtitle(true));
            return;
        }
        if (closestTab == 9) {
            this.mediaCounterTextView.setText(LocaleController.formatPluralString("ProfileStoriesArchiveCount", this.sharedMediaLayout.getStoriesCount(closestTab), new Object[0]));
            return;
        }
        if (closestTab == 10) {
            MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(getDialogId());
            this.mediaCounterTextView.setText(LocaleController.formatPluralString(this.isBot ? "Bots" : "Channels", channelRecommendations == null ? 0 : channelRecommendations.chats.size() + channelRecommendations.more, new Object[0]));
        } else if (closestTab == 12) {
            this.mediaCounterTextView.setText(LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, getMessagesController().getSavedMessagesController().getMessagesCount(getDialogId())), new Object[0]));
        } else if (closestTab == 14) {
            AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher = this.mediaCounterTextView;
            ProfileGiftsContainer profileGiftsContainer = this.sharedMediaLayout.giftsContainer;
            clippingTextViewSwitcher.setText(LocaleController.formatPluralStringComma("ProfileGiftsCount", profileGiftsContainer != null ? profileGiftsContainer.getGiftsCount() : 0));
        }
    }

    private void checkStarRatingVisible() {
        StarRatingView starRatingView = this.ratingView;
        if (starRatingView != null) {
            starRatingView.setVisibility(!this.mediaHeaderVisible && this.isStarRatingVisible1);
        }
    }

    private void captureBackwardInitialValues() {
        if (this.backwardInitialValues == null) {
            this.backwardInitialValues = new float[16];
        }
        this.backwardTransitionFromExtraHeight = this.extraHeight;
        int i = 0;
        this.backwardInitialValues[0] = this.avatarContainer.getScaleX();
        this.backwardInitialValues[1] = this.avatarContainer.getTranslationX();
        this.backwardInitialValues[2] = this.avatarContainer.getTranslationY();
        ProfileActionsView profileActionsView = this.actionsView;
        if (profileActionsView != null) {
            this.backwardInitialValues[3] = profileActionsView.getTranslationY();
        }
        ProfileGiftsView profileGiftsView = this.giftsView;
        if (profileGiftsView != null) {
            float[] fArr = this.backwardInitialValues;
            fArr[4] = profileGiftsView.expandProgress;
            fArr[5] = profileGiftsView.collapseProgress;
        }
        if (this.showStatusButton != null) {
            this.backwardInitialValues[6] = r0.getAlpha();
        }
        this.backwardInitialValues[7] = this.nameTextView[1].getScaleX();
        this.backwardInitialValues[8] = this.nameTextView[1].getTranslationY();
        this.backwardInitialValues[9] = this.onlineTextView[1].getTranslationY();
        this.backwardInitialValues[10] = this.nameTextView[1].getLayoutParams().width;
        this.backwardInitialValues[11] = this.pullUpProgress;
        while (true) {
            SimpleTextView[] simpleTextViewArr = this.nameTextView;
            if (i >= simpleTextViewArr.length) {
                return;
            }
            SimpleTextView simpleTextView = simpleTextViewArr[i];
            if (simpleTextView != null) {
                int i2 = i * 2;
                this.backwardInitialValues[i2 + 12] = simpleTextView.getTranslationX();
                this.backwardInitialValues[i2 + 13] = this.onlineTextView[i].getTranslationX();
            }
            i++;
        }
    }

    private void backwardAnimationLayout() {
        if (this.backwardInitialValues == null) {
            return;
        }
        ValueAnimator valueAnimator = this.expandAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.expandAnimator.cancel();
        }
        float fClamp01 = Utilities.clamp01(this.extraHeight / this.backwardTransitionFromExtraHeight);
        if (fClamp01 <= 0.0f) {
            return;
        }
        float f = (fClamp01 - 0.5f) / 0.5f;
        float currentActionBarHeight = (((this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + (ActionBar.getCurrentActionBarHeight() / 2.0f)) - AndroidUtilities.dp(21.0f)) + this.actionBar.getTranslationY();
        this.avatarScale = AndroidUtilities.lerp(0.42f, this.backwardInitialValues[0], fClamp01);
        this.avatarX = AndroidUtilities.lerp(0.0f, this.backwardInitialValues[1], fClamp01);
        this.avatarY = AndroidUtilities.lerp(currentActionBarHeight, this.backwardInitialValues[2], fClamp01);
        this.pullUpProgress = AndroidUtilities.lerp(this.backwardInitialValues[11], 0.0f, fClamp01);
        this.avatarContainer.setScaleX(this.avatarScale);
        this.avatarContainer.setScaleY(this.avatarScale);
        this.avatarContainer.setTranslationX(this.avatarX);
        this.avatarContainer.setTranslationY(this.avatarY);
        StarRatingView starRatingView = this.ratingView;
        if (starRatingView != null) {
            starRatingView.setAlpha(fClamp01);
        }
        this.avatarImage.setAlpha(1.0f);
        this.avatarContainer.setAlpha(1.0f);
        ProfileStoriesView profileStoriesView = this.storyView;
        if (profileStoriesView != null) {
            profileStoriesView.invalidate();
        }
        ProfileGiftsView profileGiftsView = this.giftsView;
        if (profileGiftsView != null) {
            profileGiftsView.expandProgress = AndroidUtilities.lerp(0.0f, this.backwardInitialValues[4], f);
            this.giftsView.collapseProgress = AndroidUtilities.lerp(0.0f, this.backwardInitialValues[5], fClamp01);
            ProfileGiftsView profileGiftsView2 = this.giftsView;
            profileGiftsView2.isOpening = true;
            profileGiftsView2.invalidate();
        }
        ShowDrawable showDrawable = this.showStatusButton;
        if (showDrawable != null) {
            showDrawable.setAlpha((int) AndroidUtilities.lerp(0.0f, this.backwardInitialValues[6], fClamp01));
        }
        float fDp = (AndroidUtilities.dp(42.0f) * ((this.avatarScale * 100.0f) / 42.0f)) - AndroidUtilities.dp(42.0f);
        this.timeItem.setTranslationX(this.avatarContainer.getX() + AndroidUtilities.dp(16.0f) + fDp);
        this.timeItem.setTranslationY(this.avatarContainer.getY() + AndroidUtilities.dp(15.0f) + fDp);
        this.starBgItem.setTranslationX(this.avatarContainer.getX() + AndroidUtilities.dp(28.0f) + fDp);
        this.starBgItem.setTranslationY(this.avatarContainer.getY() + AndroidUtilities.dp(24.0f) + fDp);
        this.starFgItem.setTranslationX(this.avatarContainer.getX() + AndroidUtilities.dp(28.0f) + fDp);
        this.starFgItem.setTranslationY(this.avatarContainer.getY() + AndroidUtilities.dp(24.0f) + fDp);
        float fLerp = AndroidUtilities.lerp(1.0f, this.backwardInitialValues[7], fClamp01);
        float fFloor = ((float) Math.floor((((this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + (ActionBar.getCurrentActionBarHeight() / 2.0f)) - (AndroidUtilities.density * 21.0f)) + this.actionBar.getTranslationY())) + AndroidUtilities.dp(1.3f);
        float fDpf2 = AndroidUtilities.dpf2(22.7f) + fFloor;
        this.nameY = AndroidUtilities.lerp(fFloor, this.backwardInitialValues[8], fClamp01);
        this.onlineY = AndroidUtilities.lerp(fDpf2, this.backwardInitialValues[9], fClamp01);
        int i = 0;
        while (true) {
            SimpleTextView[] simpleTextViewArr = this.nameTextView;
            if (i >= simpleTextViewArr.length) {
                break;
            }
            if (simpleTextViewArr[i] != null) {
                int i2 = i * 2;
                float fLerp2 = AndroidUtilities.lerp(0.0f, this.backwardInitialValues[i2 + 12], fClamp01);
                float fLerp3 = AndroidUtilities.lerp(0.0f, this.backwardInitialValues[i2 + 13], fClamp01);
                this.nameTextView[i].setTranslationX(fLerp2);
                this.nameTextView[i].setTranslationY(this.nameY);
                this.onlineTextView[i].setTranslationX(this.customPhotoOffset + fLerp3);
                this.onlineTextView[i].setTranslationY(this.onlineY);
                if (i == 1) {
                    this.nameX = fLerp2;
                    this.onlineX = fLerp3;
                    this.mediaCounterTextView.setTranslationX(fLerp3);
                    this.mediaCounterTextView.setTranslationY(this.onlineY);
                }
                this.nameTextView[i].setScaleX(fLerp);
                this.nameTextView[i].setScaleY(fLerp);
            }
            i++;
        }
        updateCollectibleHint();
        updateExtraViews((this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + ActionBar.getCurrentActionBarHeight());
        needLayoutText(fClamp01, (int) this.backwardInitialValues[10], true);
        ProfileActionsView profileActionsView = this.actionsView;
        if (profileActionsView != null) {
            profileActionsView.setAlpha(AndroidUtilities.lerp(0.0f, this.backwardInitialValues[3], f));
        }
    }

    private void updateWriteButtonLayout(boolean z) {
        boolean z2;
        TLRPC.ChatFull chatFull;
        float fCalculateHeaderExtraDiff = calculateHeaderExtraDiff();
        this.isStarRatingVisible1 = fCalculateHeaderExtraDiff > 0.2f && !this.searchMode && (this.imageUpdater == null || this.setAvatarRow == -1);
        checkStarRatingVisible();
        RLottieImageView rLottieImageView = this.writeButton;
        if (rLottieImageView == null || rLottieImageView.getVisibility() == 8) {
            z2 = false;
        } else {
            this.writeButton.setTranslationY(((((this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + ActionBar.getCurrentActionBarHeight()) + this.extraHeight) + this.searchTransitionOffset) - AndroidUtilities.dp(29.5f));
            z2 = fCalculateHeaderExtraDiff > 0.2f && !this.searchMode && !this.myProfile && (this.imageUpdater == null || this.setAvatarRow == -1);
            if (z2 && this.chatId != 0) {
                z2 = (!ChatObject.isChannel(this.currentChat) || this.currentChat.megagroup || (chatFull = this.chatInfo) == null || chatFull.linked_chat_id == 0 || (this.infoHeaderRow == -1 && this.infoHeaderRowEmpty == -1)) ? false : true;
            }
            if (!this.openAnimationInProgress) {
                if (z2 != (this.writeButton.getTag() == null)) {
                    if (z2) {
                        this.writeButton.setTag(null);
                    } else {
                        this.writeButton.setTag(0);
                    }
                    AnimatorSet animatorSet = this.writeButtonAnimation;
                    if (animatorSet != null) {
                        this.writeButtonAnimation = null;
                        animatorSet.cancel();
                    }
                    if (z) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.writeButtonAnimation = animatorSet2;
                        if (z2) {
                            animatorSet2.setInterpolator(new DecelerateInterpolator());
                            this.writeButtonAnimation.playTogether(ObjectAnimator.ofFloat(this.writeButton, (Property<RLottieImageView, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.writeButton, (Property<RLottieImageView, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.writeButton, (Property<RLottieImageView, Float>) View.ALPHA, 1.0f));
                        } else {
                            animatorSet2.setInterpolator(new AccelerateInterpolator());
                            this.writeButtonAnimation.playTogether(ObjectAnimator.ofFloat(this.writeButton, (Property<RLottieImageView, Float>) View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.writeButton, (Property<RLottieImageView, Float>) View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.writeButton, (Property<RLottieImageView, Float>) View.ALPHA, 0.0f));
                        }
                        this.writeButtonAnimation.setDuration(150L);
                        this.writeButtonAnimation.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (ProfileActivity.this.writeButtonAnimation == null || !ProfileActivity.this.writeButtonAnimation.equals(animator)) {
                                    return;
                                }
                                ProfileActivity.this.writeButtonAnimation = null;
                            }
                        });
                        this.writeButtonAnimation.start();
                    } else {
                        this.writeButton.setScaleX(z2 ? 1.0f : 0.2f);
                        this.writeButton.setScaleY(z2 ? 1.0f : 0.2f);
                        this.writeButton.setAlpha(z2 ? 1.0f : 0.0f);
                    }
                }
            }
        }
        ProfileStoriesView profileStoriesView = this.storyView;
        if (profileStoriesView != null) {
            profileStoriesView.setExpandCoords(this.avatarContainer2.getMeasuredWidth() - AndroidUtilities.dp(40.0f), z2, (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + (ActionBar.getCurrentActionBarHeight() / 2.0f));
        }
        ProfileGiftsView profileGiftsView = this.giftsView;
        if (profileGiftsView != null) {
            profileGiftsView.setExpandCoords((this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + ActionBar.getCurrentActionBarHeight() + this.extraHeight + this.searchTransitionOffset);
        }
    }

    public void needLayout(boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.needLayout(boolean):void");
    }

    private void updateExtraViews(float f) {
        OverlaysView overlaysView;
        if (this.isPulledDown || ((overlaysView = this.overlaysView) != null && overlaysView.animator != null && this.overlaysView.animator.isRunning())) {
            ViewGroup.LayoutParams layoutParams = this.overlaysView.getLayoutParams();
            layoutParams.width = this.listView.getMeasuredWidth();
            layoutParams.height = (int) (this.extraHeight + f);
            this.overlaysView.requestLayout();
        }
        TopView topView = this.topView;
        if (topView != null) {
            topView.backgroundGradientMatrix.setTranslate(0.0f, this.avatarY - topView.backgroundGradientY);
            TopView topView2 = this.topView;
            RadialGradient radialGradient = topView2.backgroundGradient;
            if (radialGradient != null) {
                radialGradient.setLocalMatrix(topView2.backgroundGradientMatrix);
            }
            this.topView.invalidate();
        }
        updateEmojiStatusEffectPosition();
        updateActionsPosition();
        updateSuggestionsPosition();
    }

    public void calculatePositionsOnFirstLoad() {
        int i = 0;
        this.avatarY = (((this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(21.0f)) + this.actionBar.getTranslationY();
        this.avatarScale = 1.38f;
        this.pullUpProgress = 0.0f;
        fixAvatarImageInCenter();
        refreshNameAndOnlineY();
        needLayoutText(1.0f);
        while (true) {
            SimpleTextView[] simpleTextViewArr = this.nameTextView;
            if (i >= simpleTextViewArr.length) {
                break;
            }
            if (simpleTextViewArr[i] != null) {
                float measuredWidth = (this.listView.getMeasuredWidth() / 2.0f) - (((FrameLayout.LayoutParams) r2.getLayoutParams()).leftMargin + ((this.nameTextView[i].getExactWidth() * 1.12f) * 0.5f));
                float measuredWidth2 = (this.listView.getMeasuredWidth() / 2.0f) - (((FrameLayout.LayoutParams) this.onlineTextView[i].getLayoutParams()).leftMargin + (this.onlineTextView[i].getExactWidth() * 0.5f));
                if (i == 1) {
                    this.nameX = measuredWidth;
                    this.onlineX = measuredWidth2;
                }
            }
            i++;
        }
        if (this.playProfileAnimation != 2) {
            this.storyView.setAlpha(1.0f);
        }
        this.avatarContainer.setAlpha(1.0f);
        this.avatarImage.setAlpha(1.0f);
    }

    public void setForegroundImage(boolean z) {
        Drawable drawable = this.avatarImage.getImageReceiver().getDrawable();
        String str = null;
        if (drawable instanceof VectorAvatarThumbDrawable) {
            this.avatarImage.setForegroundImage(null, null, drawable);
            return;
        }
        if (drawable instanceof AnimatedFileDrawable) {
            AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) drawable;
            this.avatarImage.setForegroundImage(null, null, animatedFileDrawable);
            if (z) {
                animatedFileDrawable.addSecondParentView(this.avatarImage);
                return;
            }
            return;
        }
        ImageLocation imageLocation = this.avatarsViewPager.getImageLocation(0);
        if (imageLocation != null && imageLocation.imageType == 2) {
            str = "avatar";
        }
        this.avatarImage.setForegroundImage(imageLocation, str, drawable);
    }

    private void refreshNameAndOnlineY() {
        ValueAnimator valueAnimator;
        if (this.isPulledDown && (valueAnimator = this.expandAnimator) != null && valueAnimator.isRunning()) {
            this.nameY = this.expandNameYStartedFrom;
            this.onlineY = this.expandOnlineYStartedFrom;
        } else {
            refreshNameAndOnlineYBasedOnExpand(calculateHeaderExtraDiff(), ActionBar.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0));
        }
    }

    private void refreshNameAndOnlineYBasedOnExpand(float f, float f2) {
        float fMax = Math.max(0.0f, Math.min(1.0f, (this.extraHeight - getHeaderExtraHeight()) / ((this.listView.getMeasuredWidth() - f2) - getHeaderOnlyExtraHeight())));
        float fFloor = ((float) Math.floor((((this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + ((ActionBar.getCurrentActionBarHeight() / 2.0f) * (1.0f + f))) - (AndroidUtilities.density * 21.0f)) + this.actionBar.getTranslationY())) + (((AndroidUtilities.dp(42.0f) * ((this.extraHeight >= ((float) getHeaderExtraHeight()) || fMax >= 0.33f) ? AndroidUtilities.lerp(2.2857144f, 3.2857144f, Math.min(1.0f, fMax * 3.0f)) : ((72.0f * f) + 24.0f) / 42.0f)) + AndroidUtilities.dpf2(8.0f)) * f);
        this.nameY = AndroidUtilities.dp(1.3f) + fFloor + (AndroidUtilities.dp(7.0f) * f);
        this.onlineY = fFloor + AndroidUtilities.dp(24.0f) + (((float) Math.floor(AndroidUtilities.density * 11.0f)) * f);
    }

    @Override
    public RecyclerListView getListView() {
        return this.listView;
    }

    public void needLayoutText(float f) {
        needLayoutText(f, 0, true);
    }

    private void updateTextLayoutBasedOnTranslation() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.nameTextView[1].getLayoutParams();
        int i = layoutParams.width;
        int iMin = Math.min(layoutParams.width, (int) ((((AndroidUtilities.isTablet() ? AndroidUtilities.dp(490.0f) : AndroidUtilities.displaySize.x) - AndroidUtilities.dp(18.0f)) / this.nameTextView[1].getScaleX()) - (layoutParams.leftMargin + this.nameTextView[1].getTranslationX())));
        layoutParams.width = iMin;
        if (iMin != i) {
            this.nameTextView[1].requestLayout();
        }
    }

    private void needLayoutText(float r12, int r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.needLayoutText(float, int, boolean):void");
    }

    private void fixLayout() {
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public boolean onPreDraw() {
                ProfileActivity profileActivity = ProfileActivity.this;
                if (profileActivity.fragmentView != null) {
                    profileActivity.checkListViewScroll();
                    ProfileActivity.this.needLayout(true);
                    ProfileActivity.this.fragmentView.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return true;
            }
        });
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        View viewFindViewByPosition;
        ProfileMusicView profileMusicView;
        ProfileSuggestionView profileSuggestionView;
        ProfileActionsView profileActionsView;
        super.onConfigurationChanged(configuration);
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout != null) {
            sharedMediaLayout.onConfigurationChanged(configuration);
        }
        invalidateIsInLandscapeMode();
        if (this.isInLandscapeMode && (profileActionsView = this.actionsView) != null) {
            profileActionsView.drawingBlur(false);
        }
        if (this.isInLandscapeMode && (profileSuggestionView = this.suggestionView) != null) {
            profileSuggestionView.drawingBlur(false);
        }
        if (this.isInLandscapeMode && (profileMusicView = this.musicView) != null) {
            profileMusicView.drawingBlur(false);
        }
        if (this.isInLandscapeMode && this.isPulledDown && (viewFindViewByPosition = this.layoutManager.findViewByPosition(0)) != null) {
            this.listView.scrollBy(0, viewFindViewByPosition.getTop() - getHeaderExtraHeight());
        }
        fixLayout();
    }

    private void invalidateIsInLandscapeMode() {
        Point point = new Point();
        getParentActivity().getWindowManager().getDefaultDisplay().getSize(point);
        this.isInLandscapeMode = point.x > point.y;
    }

    @Override
    public void didReceivedNotification(int i, int i2, final Object... objArr) {
        ListAdapter listAdapter;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.Chat chat;
        RecyclerListView recyclerListView;
        RecyclerListView recyclerListView2;
        RecyclerListView.Holder holder;
        if (i == NotificationCenter.uploadStoryEnd || i == NotificationCenter.chatWasBoostedByUser) {
            checkCanSendStoryForPosting();
            return;
        }
        int i3 = 0;
        if (i == NotificationCenter.updateInterfaces) {
            int iIntValue = ((Integer) objArr[0]).intValue();
            boolean z = ((MessagesController.UPDATE_MASK_AVATAR & iIntValue) == 0 && (MessagesController.UPDATE_MASK_NAME & iIntValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & iIntValue) == 0 && (MessagesController.UPDATE_MASK_EMOJI_STATUS & iIntValue) == 0) ? false : true;
            if (this.userId != 0) {
                if (z) {
                    updateProfileData(true);
                }
                if ((iIntValue & MessagesController.UPDATE_MASK_PHONE) == 0 || (recyclerListView2 = this.listView) == null || (holder = (RecyclerListView.Holder) recyclerListView2.findViewHolderForPosition(this.phoneRow)) == null) {
                    return;
                }
                this.listAdapter.onBindViewHolder(holder, this.phoneRow);
                return;
            }
            if (this.chatId != 0) {
                if ((MessagesController.UPDATE_MASK_CHAT & iIntValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & iIntValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & iIntValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_MEMBERS & iIntValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & iIntValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & iIntValue) != 0) {
                    if ((MessagesController.UPDATE_MASK_CHAT & iIntValue) != 0) {
                        updateListAnimated(true);
                    } else {
                        updateOnlineCount(true);
                    }
                    updateProfileData(true);
                }
                if (!z || (recyclerListView = this.listView) == null) {
                    return;
                }
                int childCount = recyclerListView.getChildCount();
                while (i3 < childCount) {
                    View childAt = this.listView.getChildAt(i3);
                    if (childAt instanceof UserCell) {
                        ((UserCell) childAt).update(iIntValue);
                    }
                    i3++;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.chatOnlineCountDidLoad) {
            Long l = (Long) objArr[0];
            if (this.chatInfo == null || (chat = this.currentChat) == null || chat.id != l.longValue()) {
                return;
            }
            this.chatInfo.online_count = ((Integer) objArr[1]).intValue();
            updateOnlineCount(true);
            updateProfileData(false);
            return;
        }
        if (i == NotificationCenter.contactsDidLoad || i == NotificationCenter.channelRightsUpdated) {
            createActionBarMenu(true);
            return;
        }
        if (i == NotificationCenter.encryptedChatCreated) {
            if (this.creatingChat) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$didReceivedNotification$85(objArr);
                    }
                });
                return;
            }
            return;
        }
        if (i == NotificationCenter.encryptedChatUpdated) {
            TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
            TLRPC.EncryptedChat encryptedChat2 = this.currentEncryptedChat;
            if (encryptedChat2 == null || encryptedChat.id != encryptedChat2.id) {
                return;
            }
            this.currentEncryptedChat = encryptedChat;
            updateListAnimated(false);
            FlagSecureReason flagSecureReason = this.flagSecure;
            if (flagSecureReason != null) {
                flagSecureReason.invalidate();
                return;
            }
            return;
        }
        if (i == NotificationCenter.blockedUsersDidLoad) {
            boolean z2 = this.userBlocked;
            boolean z3 = getMessagesController().blockePeers.indexOfKey(this.userId) >= 0;
            this.userBlocked = z3;
            if (z2 != z3) {
                createActionBarMenu(true);
                updateListAnimated(false);
                return;
            }
            return;
        }
        if (i == NotificationCenter.groupCallUpdated) {
            Long l2 = (Long) objArr[0];
            if (this.currentChat != null) {
                long jLongValue = l2.longValue();
                TLRPC.Chat chat2 = this.currentChat;
                if (jLongValue == chat2.id && ChatObject.canManageCalls(chat2)) {
                    TLRPC.ChatFull chatFull4 = MessagesController.getInstance(this.currentAccount).getChatFull(l2.longValue());
                    if (chatFull4 != null) {
                        TLRPC.ChatFull chatFull5 = this.chatInfo;
                        if (chatFull5 != null) {
                            chatFull4.participants = chatFull5.participants;
                        }
                        this.chatInfo = chatFull4;
                    }
                    SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
                    if (sharedMediaLayout != null) {
                        sharedMediaLayout.setChatInfo(this.chatInfo);
                    }
                    TLRPC.ChatFull chatFull6 = this.chatInfo;
                    if (chatFull6 != null && (((inputGroupCall = chatFull6.call) == null && !this.hasVoiceChatItem) || (inputGroupCall != null && this.hasVoiceChatItem))) {
                        createActionBarMenu(false);
                    }
                    ProfileStoriesView profileStoriesView = this.storyView;
                    if (profileStoriesView != null && (chatFull3 = this.chatInfo) != null) {
                        profileStoriesView.setStories(chatFull3.stories);
                    }
                    ProfileGiftsView profileGiftsView = this.giftsView;
                    if (profileGiftsView != null) {
                        profileGiftsView.update();
                    }
                    AvatarImageView avatarImageView = this.avatarImage;
                    if (avatarImageView != null) {
                        avatarImageView.setHasStories(needInsetForStories());
                    }
                    if (l2.longValue() != 0) {
                        boolean z4 = (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked() || (chatFull2 = this.chatInfo) == null || !chatFull2.stargifts_available) ? false : true;
                        this.otherItem.setSubItemShown(38, z4);
                        ProfileActionsView profileActionsView = this.actionsView;
                        if (profileActionsView != null) {
                            profileActionsView.set(3, z4);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull7 = (TLRPC.ChatFull) objArr[0];
            if (chatFull7.id == this.chatId) {
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                TLRPC.ChatFull chatFull8 = this.chatInfo;
                if ((chatFull8 instanceof TLRPC.TL_channelFull) && chatFull7.participants == null) {
                    chatFull7.participants = chatFull8.participants;
                }
                if (chatFull8 == null && (chatFull7 instanceof TLRPC.TL_channelFull)) {
                    i3 = 1;
                }
                this.chatInfo = chatFull7;
                if (this.mergeDialogId == 0) {
                    long j = chatFull7.migrated_from_chat_id;
                    if (j != 0) {
                        this.mergeDialogId = -j;
                        getMediaDataController().getMediaCount(this.mergeDialogId, this.topicId, 0, this.classGuid, true);
                    }
                }
                fetchUsersFromChannelInfo();
                ProfileGalleryView profileGalleryView = this.avatarsViewPager;
                if (profileGalleryView != null && !this.isTopic) {
                    profileGalleryView.setChatInfo(this.chatInfo);
                }
                updateListAnimated(true);
                TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(this.chatId));
                if (chat3 != null) {
                    this.currentChat = chat3;
                    createActionBarMenu(true);
                }
                FlagSecureReason flagSecureReason2 = this.flagSecure;
                if (flagSecureReason2 != null) {
                    flagSecureReason2.invalidate();
                }
                if (this.currentChat.megagroup && (i3 != 0 || !zBooleanValue)) {
                    getChannelParticipants(true);
                }
                updateAutoDeleteItem();
                updateTtlIcon();
                ProfileStoriesView profileStoriesView2 = this.storyView;
                if (profileStoriesView2 != null && (chatFull = this.chatInfo) != null) {
                    profileStoriesView2.setStories(chatFull.stories);
                }
                ProfileGiftsView profileGiftsView2 = this.giftsView;
                if (profileGiftsView2 != null) {
                    profileGiftsView2.update();
                }
                AvatarImageView avatarImageView2 = this.avatarImage;
                if (avatarImageView2 != null) {
                    avatarImageView2.setHasStories(needInsetForStories());
                }
                SharedMediaLayout sharedMediaLayout2 = this.sharedMediaLayout;
                if (sharedMediaLayout2 != null) {
                    sharedMediaLayout2.setChatInfo(this.chatInfo);
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
            return;
        }
        if (i == NotificationCenter.closeProfileActivity) {
            long jLongValue2 = ((Long) objArr[0]).longValue();
            boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
            if (jLongValue2 == getDialogId()) {
                if (zBooleanValue2 || this.parentLayout.getLastFragment() != this) {
                    if (this.parentLayout.getLastFragment() == this) {
                        finishFragment();
                        return;
                    } else {
                        removeSelfFromStack(true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.botInfoDidLoad) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) objArr[0];
            if (botInfo.user_id == this.userId) {
                this.botInfo = botInfo;
                updateListAnimated(false);
                return;
            }
            return;
        }
        if (i == NotificationCenter.userInfoDidLoad) {
            if (((Long) objArr[0]).longValue() == this.userId) {
                TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
                this.userInfo = userFull;
                StarRatingView starRatingView = this.ratingView;
                if (starRatingView != null) {
                    starRatingView.set(userFull.stars_rating);
                }
                ProfileStoriesView profileStoriesView3 = this.storyView;
                if (profileStoriesView3 != null) {
                    profileStoriesView3.setStories(this.userInfo.stories);
                }
                ProfileGiftsView profileGiftsView3 = this.giftsView;
                if (profileGiftsView3 != null) {
                    profileGiftsView3.update();
                }
                AvatarImageView avatarImageView3 = this.avatarImage;
                if (avatarImageView3 != null) {
                    avatarImageView3.setHasStories(needInsetForStories());
                }
                SharedMediaLayout sharedMediaLayout3 = this.sharedMediaLayout;
                if (sharedMediaLayout3 != null) {
                    sharedMediaLayout3.setUserInfo(this.userInfo);
                }
                if (this.imageUpdater != null) {
                    if (this.listAdapter != null && !TextUtils.equals(this.userInfo.about, this.currentBio)) {
                        this.listAdapter.notifyItemChanged(this.bioRow);
                    }
                } else {
                    if (!this.openAnimationInProgress && !this.isCallAvailable) {
                        createActionBarMenu(true);
                    } else {
                        this.recreateMenuAfterAnimation = true;
                    }
                    updateListAnimated(false);
                    SharedMediaLayout sharedMediaLayout4 = this.sharedMediaLayout;
                    if (sharedMediaLayout4 != null) {
                        sharedMediaLayout4.setCommonGroupsCount(this.userInfo.common_chats_count);
                        updateSelectedMediaTabText();
                        SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader = this.sharedMediaPreloader;
                        if (sharedMediaPreloader == null || sharedMediaPreloader.isMediaWasLoaded()) {
                            resumeDelayedFragmentAnimation();
                            needLayout(true);
                        }
                    }
                }
                updateAutoDeleteItem();
                updateTtlIcon();
                if (this.profileChannelMessageFetcher == null && !isSettings()) {
                    ProfileChannelCell.ChannelMessageFetcher channelMessageFetcher = new ProfileChannelCell.ChannelMessageFetcher(this.currentAccount);
                    this.profileChannelMessageFetcher = channelMessageFetcher;
                    channelMessageFetcher.subscribe(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$didReceivedNotification$86();
                        }
                    });
                    this.profileChannelMessageFetcher.fetch(this.userInfo);
                }
                if (!isSettings()) {
                    ProfileBirthdayEffect.BirthdayEffectFetcher birthdayEffectFetcher = this.birthdayFetcher;
                    ProfileBirthdayEffect.BirthdayEffectFetcher birthdayEffectFetcherOf = ProfileBirthdayEffect.BirthdayEffectFetcher.of(this.currentAccount, this.userInfo, birthdayEffectFetcher);
                    this.birthdayFetcher = birthdayEffectFetcherOf;
                    this.createdBirthdayFetcher = birthdayEffectFetcherOf != birthdayEffectFetcher;
                    if (birthdayEffectFetcherOf != null) {
                        birthdayEffectFetcherOf.subscribe(new ProfileActivity$$ExternalSyntheticLambda2(this));
                    }
                }
                if (this.otherItem != null) {
                    if (hasPrivacyCommand()) {
                        this.otherItem.showSubItem(44);
                        return;
                    } else {
                        this.otherItem.hideSubItem(44);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.privacyRulesUpdated) {
            return;
        }
        if (i == NotificationCenter.didReceiveNewMessages) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            long dialogId = getDialogId();
            if (dialogId == ((Long) objArr[0]).longValue()) {
                DialogObject.isEncryptedDialog(dialogId);
                ArrayList arrayList = (ArrayList) objArr[1];
                while (i3 < arrayList.size()) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i3);
                    if (this.currentEncryptedChat != null) {
                        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                        if ((messageAction instanceof TLRPC.TL_messageEncryptedAction) && (messageAction.encryptedAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) && (listAdapter = this.listAdapter) != null) {
                            listAdapter.notifyDataSetChanged();
                        }
                    }
                    i3++;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.emojiLoaded) {
            RecyclerListView recyclerListView3 = this.listView;
            if (recyclerListView3 != null) {
                recyclerListView3.invalidateViews();
                return;
            }
            return;
        }
        if (i == NotificationCenter.reloadInterface) {
            updateListAnimated(false);
            return;
        }
        if (i == NotificationCenter.newSuggestionsAvailable) {
            int i4 = this.passwordSuggestionRow;
            int i5 = this.phoneSuggestionRow;
            int i6 = this.graceSuggestionRow;
            updateRowsIds();
            if (i4 != this.passwordSuggestionRow || i5 != this.phoneSuggestionRow || i6 != this.graceSuggestionRow) {
                this.listAdapter.notifyDataSetChanged();
            }
            if (this.passkeySuggestion) {
                this.passkeySuggestion = false;
                finishFragment();
                return;
            }
            return;
        }
        if (i == NotificationCenter.topicsDidLoaded) {
            if (this.isTopic) {
                updateProfileData(false);
                return;
            }
            return;
        }
        if (i == NotificationCenter.updateSearchSettings) {
            SearchAdapter searchAdapter = this.searchAdapter;
            if (searchAdapter != null) {
                searchAdapter.searchArray = SearchAdapter.onCreateSearchArray(this);
                this.searchAdapter.recentSearches.clear();
                this.searchAdapter.updateSearchArray();
                SearchAdapter searchAdapter2 = this.searchAdapter;
                searchAdapter2.search(searchAdapter2.lastSearchString);
                return;
            }
            return;
        }
        if (i == NotificationCenter.reloadDialogPhotos) {
            updateProfileData(false);
            return;
        }
        if (i == NotificationCenter.storiesUpdated || i == NotificationCenter.storiesReadUpdated) {
            AvatarImageView avatarImageView4 = this.avatarImage;
            if (avatarImageView4 != null) {
                avatarImageView4.setHasStories(needInsetForStories());
                updateAvatarRoundRadius();
            }
            ProfileStoriesView profileStoriesView4 = this.storyView;
            if (profileStoriesView4 != null) {
                TLRPC.UserFull userFull2 = this.userInfo;
                if (userFull2 != null) {
                    profileStoriesView4.setStories(userFull2.stories);
                    return;
                }
                TLRPC.ChatFull chatFull9 = this.chatInfo;
                if (chatFull9 != null) {
                    profileStoriesView4.setStories(chatFull9.stories);
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.userIsPremiumBlockedUpadted) {
            ActionBarMenuItem actionBarMenuItem = this.otherItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setSubItemShown(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.userId)));
            }
            updateEditColorIcon();
            return;
        }
        if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            updateEditColorIcon();
            return;
        }
        if (i == NotificationCenter.starBalanceUpdated) {
            updateListAnimated(false);
            return;
        }
        if (i == NotificationCenter.botStarsUpdated) {
            updateListAnimated(false);
            return;
        }
        if (i == NotificationCenter.botStarsTransactionsLoaded) {
            updateListAnimated(false);
            return;
        }
        if (i == NotificationCenter.dialogDeleted) {
            if (getDialogId() == ((Long) objArr[0]).longValue()) {
                INavigationLayout iNavigationLayout = this.parentLayout;
                if (iNavigationLayout != null && iNavigationLayout.getLastFragment() == this) {
                    finishFragment();
                    return;
                } else {
                    removeSelfFromStack();
                    return;
                }
            }
            return;
        }
        if (i == NotificationCenter.channelRecommendationsLoaded) {
            long jLongValue3 = ((Long) objArr[0]).longValue();
            if (this.sharedMediaRow >= 0 || jLongValue3 != getDialogId()) {
                return;
            }
            updateRowsIds();
            updateSelectedMediaTabText();
            ListAdapter listAdapter2 = this.listAdapter;
            if (listAdapter2 != null) {
                listAdapter2.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (i == NotificationCenter.starUserGiftsLoaded) {
            if (((Long) objArr[0]).longValue() != getDialogId() || isSettings()) {
                return;
            }
            if (this.sharedMediaRow < 0) {
                updateRowsIds();
                updateSelectedMediaTabText();
                ListAdapter listAdapter3 = this.listAdapter;
                if (listAdapter3 != null) {
                    listAdapter3.notifyDataSetChanged();
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$didReceivedNotification$87();
                    }
                });
                return;
            }
            SharedMediaLayout sharedMediaLayout5 = this.sharedMediaLayout;
            if (sharedMediaLayout5 != null) {
                sharedMediaLayout5.updateTabs(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.profileMusicUpdated && ((Long) objArr[0]).longValue() == getDialogId() && this.userId > 0) {
            TLRPC.UserFull userFull3 = getMessagesController().getUserFull(this.userId);
            if (userFull3 != null) {
                this.userInfo = userFull3;
            }
            updateRowsIds();
            updateSelectedMediaTabText();
            RecyclerListView recyclerListView4 = this.listView;
            if (recyclerListView4 != null && recyclerListView4.isComputingLayout()) {
                this.listView.post(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$didReceivedNotification$88();
                    }
                });
                return;
            }
            ListAdapter listAdapter4 = this.listAdapter;
            if (listAdapter4 != null) {
                listAdapter4.notifyDataSetChanged();
            }
        }
    }

    public void lambda$didReceivedNotification$85(Object[] objArr) {
        NotificationCenter notificationCenter = getNotificationCenter();
        int i = NotificationCenter.closeChats;
        notificationCenter.removeObserver(this, i);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i, new Object[0]);
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr[0];
        Bundle bundle = new Bundle();
        bundle.putInt("enc_id", encryptedChat.id);
        presentFragment(new ChatActivity(bundle), true);
    }

    public void lambda$didReceivedNotification$86() {
        updateListAnimated(false);
    }

    public void lambda$didReceivedNotification$87() {
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout != null) {
            sharedMediaLayout.updateTabs(true);
            this.sharedMediaLayout.updateAdapters();
        }
    }

    public void lambda$didReceivedNotification$88() {
        ListAdapter listAdapter;
        if (this.listView.isComputingLayout() || (listAdapter = this.listAdapter) == null) {
            return;
        }
        listAdapter.notifyDataSetChanged();
    }

    private void updateAutoDeleteItem() {
        int i;
        if (this.autoDeleteItem == null || this.autoDeletePopupWrapper == null) {
            return;
        }
        TLRPC.UserFull userFull = this.userInfo;
        if (userFull == null && this.chatInfo == null) {
            i = 0;
        } else {
            i = userFull != null ? userFull.ttl_period : this.chatInfo.ttl_period;
        }
        this.autoDeleteItemDrawable.setTime(i);
        this.autoDeletePopupWrapper.lambda$updateItems$7(i);
    }

    private void updateTimeItem() {
        if (this.timerDrawable == null) {
            return;
        }
        ChatActivityInterface chatActivityInterface = this.previousTransitionFragment;
        if ((chatActivityInterface instanceof ChatActivity) && ChatObject.isMonoForum(((ChatActivity) chatActivityInterface).getCurrentChat())) {
            this.timeItem.setTag(null);
            this.timeItem.setVisibility(8);
            return;
        }
        TLRPC.EncryptedChat encryptedChat = this.currentEncryptedChat;
        if (encryptedChat != null) {
            this.timerDrawable.setTime(encryptedChat.ttl);
            this.timeItem.setTag(1);
            this.timeItem.setVisibility(0);
            return;
        }
        TLRPC.UserFull userFull = this.userInfo;
        if (userFull != null) {
            this.timerDrawable.setTime(userFull.ttl_period);
            if (this.needTimerImage && this.userInfo.ttl_period != 0) {
                this.timeItem.setTag(1);
                this.timeItem.setVisibility(0);
                return;
            } else {
                this.timeItem.setTag(null);
                this.timeItem.setVisibility(8);
                return;
            }
        }
        TLRPC.ChatFull chatFull = this.chatInfo;
        if (chatFull != null) {
            this.timerDrawable.setTime(chatFull.ttl_period);
            if (this.needTimerImage && this.chatInfo.ttl_period != 0) {
                this.timeItem.setTag(1);
                this.timeItem.setVisibility(0);
                return;
            } else {
                this.timeItem.setTag(null);
                this.timeItem.setVisibility(8);
                return;
            }
        }
        this.timeItem.setTag(null);
        this.timeItem.setVisibility(8);
    }

    private void updateStar() {
        ImageView imageView;
        TLRPC.Chat chat;
        if (this.starBgItem == null || (imageView = this.starFgItem) == null) {
            return;
        }
        if (this.needStarImage && (chat = this.currentChat) != null && (chat.flags2 & 2048) != 0) {
            imageView.setTag(1);
            this.starFgItem.setVisibility(0);
            this.starBgItem.setTag(1);
            this.starBgItem.setVisibility(0);
            return;
        }
        imageView.setTag(null);
        this.starFgItem.setVisibility(8);
        this.starBgItem.setTag(null);
        this.starBgItem.setVisibility(8);
    }

    @Override
    public boolean needDelayOpenAnimation() {
        return this.playProfileAnimation == 0;
    }

    @Override
    public void mediaCountUpdated() {
        SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader;
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout != null && (sharedMediaPreloader = this.sharedMediaPreloader) != null) {
            sharedMediaLayout.setNewMediaCounts(sharedMediaPreloader.getLastMediaCount());
        }
        updateSharedMediaRows();
        updateSelectedMediaTabText();
        if (this.userInfo != null) {
            resumeDelayedFragmentAnimation();
        }
    }

    @Override
    public void onResume() {
        TLRPC.User user;
        View view;
        super.onResume();
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout != null) {
            sharedMediaLayout.onResume();
        }
        invalidateIsInLandscapeMode();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            this.firstLayout = true;
            listAdapter.notifyDataSetChanged();
        }
        if (!this.parentLayout.isInPreviewMode() && (view = this.blurredView) != null && view.getVisibility() == 0) {
            this.blurredView.setVisibility(8);
            this.blurredView.setBackground(null);
        }
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.onResume();
            setParentActivityTitle(LocaleController.getString(R.string.Settings));
        }
        updateProfileData(true);
        fixLayout();
        SimpleTextView simpleTextView = this.nameTextView[1];
        if (simpleTextView != null) {
            setParentActivityTitle(simpleTextView.getText());
        }
        if (this.userId != 0 && (user = getMessagesController().getUser(Long.valueOf(this.userId))) != null && user.photo == null && this.extraHeight >= getHeaderExtraHeight()) {
            this.expandAnimator.cancel();
            float[] fArr = this.expandAnimatorValues;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            setAvatarExpandProgress(1.0f);
            this.avatarsViewPager.setVisibility(8);
            this.extraHeight = getHeaderExtraHeight();
            this.allowPullingDown = false;
            this.layoutManager.scrollToPositionWithOffset(0, getHeaderExtraHeight() - this.listView.getPaddingTop());
        }
        FlagSecureReason flagSecureReason = this.flagSecure;
        if (flagSecureReason != null) {
            flagSecureReason.attach();
        }
        updateItemsUsername();
    }

    @Override
    public void onPause() {
        super.onPause();
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(true, 0);
        }
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.onPause();
        }
        FlagSecureReason flagSecureReason = this.flagSecure;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout != null) {
            sharedMediaLayout.onPause();
        }
    }

    @Override
    public boolean canParentTabsSlide(MotionEvent motionEvent, boolean z) {
        return isSwipeBackEnabled(motionEvent);
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        SharedMediaLayout sharedMediaLayout;
        ProfileGalleryView profileGalleryView = this.avatarsViewPager;
        if (profileGalleryView != null && profileGalleryView.getVisibility() == 0 && this.avatarsViewPager.getRealCount() > 1) {
            this.avatarsViewPager.getHitRect(this.rect);
            if (motionEvent != null && this.rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight())) {
                return false;
            }
        }
        if (this.sharedMediaRow == -1 || (sharedMediaLayout = this.sharedMediaLayout) == null) {
            return true;
        }
        if (!sharedMediaLayout.isSwipeBackEnabled()) {
            return false;
        }
        this.sharedMediaLayout.getHitRect(this.rect);
        if (motionEvent == null || this.rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight())) {
            return this.sharedMediaLayout.isCurrentTabFirst();
        }
        return true;
    }

    @Override
    public boolean canBeginSlide() {
        if (this.sharedMediaLayout.isSwipeBackEnabled()) {
            return super.canBeginSlide();
        }
        return false;
    }

    public UndoView getUndoView() {
        return this.undoView;
    }

    public boolean isSettings() {
        return (this.imageUpdater == null || this.myProfile) ? false : true;
    }

    @Override
    public void onBecomeFullyHidden() {
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(true, 0);
        }
        super.onBecomeFullyHidden();
        this.fullyVisible = false;
    }

    public void setPlayProfileAnimation(int i) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (AndroidUtilities.isTablet()) {
            return;
        }
        this.needTimerImage = i != 0;
        this.needStarImage = i != 0;
        if (globalMainSettings.getBoolean("view_animations", true)) {
            this.playProfileAnimation = i;
        } else if (i == 2) {
            this.expandPhoto = true;
        }
    }

    private void updateSharedMediaRows() {
        if (this.listAdapter == null) {
            return;
        }
        updateListAnimated(false);
    }

    @Override
    public void onTransitionAnimationStart(boolean z, boolean z2) {
        ImageView imageView;
        ProfileActionsView profileActionsView;
        super.onTransitionAnimationStart(z, z2);
        this.isFragmentOpened = z;
        if (z && (profileActionsView = this.actionsView) != null) {
            profileActionsView.startAnimatedActions();
        }
        if (!z && (imageView = this.callToActionItem) != null && imageView.getTag() != null && (this.callToActionItem.getTag() instanceof ActionBarMenuItem)) {
            ((ActionBarMenuItem) this.callToActionItem.getTag()).setAlpha(1.0f);
        }
        if (((!z && z2) || (z && !z2)) && this.playProfileAnimation != 0 && this.allowProfileAnimation && !this.isPulledDown) {
            this.openAnimationInProgress = true;
            if (!z) {
                captureBackwardInitialValues();
                HintView2 hintView2 = this.collectibleHint;
                if (hintView2 != null) {
                    hintView2.hide(true);
                }
            }
        }
        if (z) {
            if (this.imageUpdater != null) {
                this.transitionIndex = getNotificationCenter().setAnimationInProgress(this.transitionIndex, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaCountsDidLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.needCheckSystemBarColors});
            } else {
                this.transitionIndex = getNotificationCenter().setAnimationInProgress(this.transitionIndex, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaCountsDidLoad, NotificationCenter.needCheckSystemBarColors});
            }
            if (!z2 && getParentActivity() != null) {
                this.navigationBarAnimationColorFrom = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.transitionAnimationInProress = true;
        checkPhotoDescriptionAlpha();
    }

    public float getInternalTranslationX() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            return recyclerListView.getTranslationX();
        }
        return 0.0f;
    }

    public float getInternalVisibility() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            return recyclerListView.getAlpha();
        }
        return 0.0f;
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            if (!z2) {
                int i = this.playProfileAnimation;
                if (i != 0 && this.allowProfileAnimation) {
                    if (i == 1) {
                        this.currentExpandAnimatorValue = 0.0f;
                        StarRatingView starRatingView = this.ratingView;
                        if (starRatingView != null) {
                            starRatingView.setParentExpanded(0.0f);
                        }
                        ProfileActionsView profileActionsView = this.actionsView;
                        if (profileActionsView != null) {
                            profileActionsView.setParentExpanded(0.0f);
                        }
                        ProfileMusicView profileMusicView = this.musicView;
                        if (profileMusicView != null) {
                            profileMusicView.setParentExpanded(0.0f);
                        }
                    }
                    this.openAnimationInProgress = false;
                    checkListViewScroll();
                    if (this.recreateMenuAfterAnimation) {
                        createActionBarMenu(true);
                    }
                }
                if (!this.fragmentOpened) {
                    this.fragmentOpened = true;
                    this.invalidateScroll = true;
                    this.fragmentView.requestLayout();
                }
            }
            getNotificationCenter().onAnimationFinish(this.transitionIndex);
            View view = this.blurredView;
            if (view != null && view.getVisibility() == 0) {
                this.blurredView.setVisibility(8);
                this.blurredView.setBackground(null);
            }
        }
        this.transitionAnimationInProress = false;
        checkPhotoDescriptionAlpha();
    }

    public void setAvatarAnimationProgress(float f) {
        int profileBackColorForId;
        int profileTextColorForId;
        this.currentExpandAnimatorValue = f;
        this.avatarAnimationProgress = f;
        checkPhotoDescriptionAlpha();
        if (this.playProfileAnimation == 2) {
            this.avatarImage.setProgressToExpand(f);
            ProfileActionsView profileActionsView = this.actionsView;
            if (profileActionsView != null) {
                profileActionsView.setParentExpanded(f);
            }
            ProfileMusicView profileMusicView = this.musicView;
            if (profileMusicView != null) {
                profileMusicView.setParentExpanded(f);
            }
            StarRatingView starRatingView = this.ratingView;
            if (starRatingView != null) {
                starRatingView.setParentExpanded(f);
            }
            updateActionsPosition();
            updateSuggestionsPosition();
        }
        this.listView.setAlpha(f);
        this.listView.setTranslationX(AndroidUtilities.dp(48.0f) - (AndroidUtilities.dp(48.0f) * f));
        long j = 5;
        if (this.playProfileAnimation != 2 || (profileBackColorForId = this.avatarColor) == 0) {
            profileBackColorForId = AvatarDrawable.getProfileBackColorForId((this.userId != 0 || (ChatObject.isChannel(this.chatId, this.currentAccount) && !this.currentChat.megagroup)) ? 5L : this.chatId, this.resourcesProvider);
        }
        int themedColor = this.actionBarAnimationColorFrom;
        if (themedColor == 0) {
            themedColor = getThemedColor(Theme.key_actionBarDefault);
        }
        this.topView.setBackgroundColor(ColorUtils.blendARGB(SharedConfig.chatBlurEnabled() ? ColorUtils.setAlphaComponent(themedColor, 0) : themedColor, profileBackColorForId, f));
        this.timerDrawable.setBackgroundColor(ColorUtils.blendARGB(themedColor, profileBackColorForId, f));
        this.actionBar.setItemsColor(ColorUtils.blendARGB(getThemedColor(Theme.key_actionBarDefaultIcon), this.peerColor != null ? -1 : AvatarDrawable.getIconColorForId((this.userId != 0 || (ChatObject.isChannel(this.chatId, this.currentAccount) && !this.currentChat.megagroup)) ? 5L : this.chatId, this.resourcesProvider), this.avatarAnimationProgress), false);
        int themedColor2 = this.peerColor == null ? getThemedColor(Theme.key_profile_title) : -1;
        int themedColor3 = getThemedColor(Theme.key_actionBarDefaultTitle);
        for (int i = 0; i < 2; i++) {
            SimpleTextView simpleTextView = this.nameTextView[i];
            if (simpleTextView != null && (i != 1 || this.playProfileAnimation != 2)) {
                simpleTextView.setTextColor(ColorUtils.blendARGB(themedColor3, themedColor2, f));
            }
        }
        if (this.isOnline[0]) {
            profileTextColorForId = getThemedColor(Theme.key_profile_status);
        } else {
            if (this.userId == 0 && (!ChatObject.isChannel(this.chatId, this.currentAccount) || this.currentChat.megagroup)) {
                j = this.chatId;
            }
            profileTextColorForId = AvatarDrawable.getProfileTextColorForId(j, this.resourcesProvider);
        }
        int themedColor4 = getThemedColor(this.isOnline[0] ? Theme.key_chat_status : Theme.key_actionBarDefaultSubtitle);
        int i2 = 0;
        while (i2 < 3) {
            SimpleTextView simpleTextView2 = this.onlineTextView[i2];
            if (simpleTextView2 != null && i2 != 1 && (i2 != 2 || this.playProfileAnimation != 2)) {
                simpleTextView2.setTextColor(ColorUtils.blendARGB(i2 == 0 ? themedColor4 : applyPeerColor(themedColor4, true, Boolean.valueOf(this.isOnline[0])), i2 == 0 ? profileTextColorForId : applyPeerColor(profileTextColorForId, true, Boolean.valueOf(this.isOnline[0])), f));
            }
            i2++;
        }
        this.extraHeight = this.initialAnimationExtraHeight * f;
        long j2 = this.userId;
        if (j2 == 0) {
            j2 = this.chatId;
        }
        int profileColorForId = AvatarDrawable.getProfileColorForId(j2, this.resourcesProvider);
        long j3 = this.userId;
        if (j3 == 0) {
            j3 = this.chatId;
        }
        int colorForId = AvatarDrawable.getColorForId(j3);
        if (profileColorForId != colorForId) {
            this.avatarDrawable.setColor(ColorUtils.blendARGB(colorForId, profileColorForId, f));
            this.avatarImage.invalidate();
        }
        int i3 = this.navigationBarAnimationColorFrom;
        if (i3 != 0) {
            setNavigationBarColor(ColorUtils.blendARGB(i3, getNavigationBarColor(), f));
        }
        this.topView.invalidate();
        needLayout(true);
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        AboutLinkCell aboutLinkCell = this.aboutLinkCell;
        if (aboutLinkCell != null) {
            aboutLinkCell.invalidate();
        }
        if (getDialogId() > 0) {
            AvatarImageView avatarImageView = this.avatarImage;
            if (avatarImageView != null) {
                avatarImageView.setProgressToStoriesInsets(this.avatarAnimationProgress);
            }
            ProfileStoriesView profileStoriesView = this.storyView;
            if (profileStoriesView != null) {
                profileStoriesView.setProgressToStoriesInsets(this.avatarAnimationProgress);
            }
            ProfileGiftsView profileGiftsView = this.giftsView;
            if (profileGiftsView != null) {
                profileGiftsView.setProgressToStoriesInsets(this.avatarAnimationProgress);
            }
        }
    }

    @Override
    public android.animation.AnimatorSet onCustomTransitionAnimation(boolean r19, final java.lang.Runnable r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onCustomTransitionAnimation(boolean, java.lang.Runnable):android.animation.AnimatorSet");
    }

    public void lambda$onCustomTransitionAnimation$89(ValueAnimator valueAnimator) {
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        updateStoriesViewBounds(true);
    }

    public int getAverageColor(ImageReceiver imageReceiver) {
        if (imageReceiver.getDrawable() instanceof VectorAvatarThumbDrawable) {
            return ((VectorAvatarThumbDrawable) imageReceiver.getDrawable()).gradientTools.getAverageColor();
        }
        return AndroidUtilities.calcBitmapColor(this.avatarImage.getImageReceiver().getBitmap());
    }

    public void updateOnlineCount(boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.updateOnlineCount(boolean):void");
    }

    public static int lambda$updateOnlineCount$90(ArrayList arrayList, Object obj) {
        return ((Integer) arrayList.get(((Integer) obj).intValue())).intValue();
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        this.chatInfo = chatFull;
        if (chatFull != null) {
            long j = chatFull.migrated_from_chat_id;
            if (j != 0 && this.mergeDialogId == 0) {
                this.mergeDialogId = -j;
                getMediaDataController().getMediaCounts(this.mergeDialogId, this.topicId, this.classGuid);
            }
        }
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout != null) {
            sharedMediaLayout.setChatInfo(this.chatInfo);
        }
        ProfileGalleryView profileGalleryView = this.avatarsViewPager;
        if (profileGalleryView != null && !this.isTopic) {
            profileGalleryView.setChatInfo(this.chatInfo);
        }
        ProfileStoriesView profileStoriesView = this.storyView;
        if (profileStoriesView != null && (chatFull3 = this.chatInfo) != null) {
            profileStoriesView.setStories(chatFull3.stories);
        }
        ProfileGiftsView profileGiftsView = this.giftsView;
        if (profileGiftsView != null) {
            profileGiftsView.update();
        }
        AvatarImageView avatarImageView = this.avatarImage;
        if (avatarImageView != null) {
            avatarImageView.setHasStories(needInsetForStories());
        }
        fetchUsersFromChannelInfo();
        if (this.chatId != 0) {
            boolean z = (BuildVars.IS_BILLING_UNAVAILABLE || getMessagesController().premiumPurchaseBlocked() || (chatFull2 = this.chatInfo) == null || !chatFull2.stargifts_available) ? false : true;
            this.otherItem.setSubItemShown(38, z);
            ProfileActionsView profileActionsView = this.actionsView;
            if (profileActionsView != null) {
                profileActionsView.set(3, z);
            }
        }
    }

    public boolean needInsetForStories() {
        return getMessagesController().getStoriesController().hasStories(getDialogId()) && !this.isTopic;
    }

    public void setUserInfo(TLRPC.UserFull userFull, ProfileChannelCell.ChannelMessageFetcher channelMessageFetcher, ProfileBirthdayEffect.BirthdayEffectFetcher birthdayEffectFetcher) {
        this.userInfo = userFull;
        StarRatingView starRatingView = this.ratingView;
        if (starRatingView != null) {
            starRatingView.set(userFull.stars_rating);
        }
        ProfileStoriesView profileStoriesView = this.storyView;
        if (profileStoriesView != null) {
            profileStoriesView.setStories(this.userInfo.stories);
        }
        ProfileGiftsView profileGiftsView = this.giftsView;
        if (profileGiftsView != null) {
            profileGiftsView.update();
        }
        AvatarImageView avatarImageView = this.avatarImage;
        if (avatarImageView != null) {
            avatarImageView.setHasStories(needInsetForStories());
        }
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout != null) {
            sharedMediaLayout.setUserInfo(this.userInfo);
        }
        if (this.profileChannelMessageFetcher == null) {
            this.profileChannelMessageFetcher = channelMessageFetcher;
        }
        if (this.profileChannelMessageFetcher == null) {
            this.profileChannelMessageFetcher = new ProfileChannelCell.ChannelMessageFetcher(this.currentAccount);
        }
        this.profileChannelMessageFetcher.subscribe(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setUserInfo$91();
            }
        });
        this.profileChannelMessageFetcher.fetch(this.userInfo);
        if (this.birthdayFetcher == null) {
            this.birthdayFetcher = birthdayEffectFetcher;
        }
        ProfileBirthdayEffect.BirthdayEffectFetcher birthdayEffectFetcher2 = this.birthdayFetcher;
        if (birthdayEffectFetcher2 == null) {
            ProfileBirthdayEffect.BirthdayEffectFetcher birthdayEffectFetcherOf = ProfileBirthdayEffect.BirthdayEffectFetcher.of(this.currentAccount, this.userInfo, birthdayEffectFetcher2);
            this.birthdayFetcher = birthdayEffectFetcherOf;
            this.createdBirthdayFetcher = birthdayEffectFetcherOf != null;
        }
        ProfileBirthdayEffect.BirthdayEffectFetcher birthdayEffectFetcher3 = this.birthdayFetcher;
        if (birthdayEffectFetcher3 != null) {
            birthdayEffectFetcher3.subscribe(new ProfileActivity$$ExternalSyntheticLambda2(this));
        }
        ActionBarMenuItem actionBarMenuItem = this.otherItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setSubItemShown(20, DialogObject.isEmpty(getMessagesController().isUserContactBlocked(this.userId)));
            if (hasPrivacyCommand()) {
                this.otherItem.showSubItem(44);
            } else {
                this.otherItem.hideSubItem(44);
            }
        }
    }

    public void lambda$setUserInfo$91() {
        updateListAnimated(false);
    }

    @Override
    public boolean canSearchMembers() {
        return this.canSearchMembers;
    }

    private void fetchUsersFromChannelInfo() {
        TLRPC.Chat chat = this.currentChat;
        if (chat == null || !chat.megagroup) {
            return;
        }
        TLRPC.ChatFull chatFull = this.chatInfo;
        if (!(chatFull instanceof TLRPC.TL_channelFull) || chatFull.participants == null) {
            return;
        }
        for (int i = 0; i < this.chatInfo.participants.participants.size(); i++) {
            TLRPC.ChatParticipant chatParticipant = this.chatInfo.participants.participants.get(i);
            this.participantsMap.put(chatParticipant.user_id, chatParticipant);
        }
    }

    private void kickUser(long j, TLRPC.ChatParticipant chatParticipant) {
        if (j != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j));
            getMessagesController().deleteParticipantFromChat(this.chatId, user);
            if (this.currentChat != null && user != null && BulletinFactory.canShowBulletin(this)) {
                BulletinFactory.createRemoveFromChatBulletin(this, user, this.currentChat.title).show();
            }
            if (this.chatInfo.participants.participants.remove(chatParticipant)) {
                updateListAnimated(true);
                return;
            }
            return;
        }
        NotificationCenter notificationCenter = getNotificationCenter();
        int i = NotificationCenter.closeChats;
        notificationCenter.removeObserver(this, i);
        if (AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i, Long.valueOf(-this.chatId));
        } else {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i, new Object[0]);
        }
        getMessagesController().deleteParticipantFromChat(this.chatId, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())));
        this.playProfileAnimation = 0;
        finishFragment();
    }

    public boolean isChat() {
        return this.chatId != 0;
    }

    public void updateRowsIds() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.updateRowsIds():void");
    }

    private Drawable getScamDrawable(int i) {
        if (this.scamDrawable == null) {
            ScamDrawable scamDrawable = new ScamDrawable(11, i);
            this.scamDrawable = scamDrawable;
            scamDrawable.setColor(getThemedColor(Theme.key_avatar_subtitleInProfileBlue));
        }
        return this.scamDrawable;
    }

    private Drawable getLockIconDrawable() {
        if (this.lockIconDrawable == null) {
            this.lockIconDrawable = Theme.chat_lockIconDrawable.getConstantState().newDrawable().mutate();
        }
        return this.lockIconDrawable;
    }

    private Drawable getVerifiedCrossfadeDrawable(int i) {
        MessagesController.PeerColor peerColor;
        if (this.verifiedCrossfadeDrawable[i] == null) {
            this.verifiedDrawable[i] = Theme.profile_verifiedDrawable.getConstantState().newDrawable().mutate();
            this.verifiedCheckDrawable[i] = Theme.profile_verifiedCheckDrawable.getConstantState().newDrawable().mutate();
            if (i == 1 && (peerColor = this.peerColor) != null) {
                int iAdaptHSV = Theme.adaptHSV(peerColor.hasColor6(Theme.isCurrentThemeDark()) ? this.peerColor.getColor5() : this.peerColor.getColor3(), 0.1f, Theme.isCurrentThemeDark() ? -0.1f : -0.08f);
                Drawable drawable = this.verifiedDrawable[1];
                int offsetColor = AndroidUtilities.getOffsetColor(iAdaptHSV, getThemedColor(Theme.key_player_actionBarTitle), this.mediaHeaderAnimationProgress, 1.0f);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(offsetColor, mode);
                this.verifiedCheckDrawable[1].setColorFilter(AndroidUtilities.getOffsetColor(-1, getThemedColor(Theme.key_windowBackgroundWhite), this.mediaHeaderAnimationProgress, 1.0f), mode);
            }
            this.verifiedCrossfadeDrawable[i] = new CrossfadeDrawable(new CombinedDrawable(this.verifiedDrawable[i], this.verifiedCheckDrawable[i]), ContextCompat.getDrawable(getParentActivity(), R.drawable.verified_profile));
        }
        return this.verifiedCrossfadeDrawable[i];
    }

    public Drawable getPremiumCrossfadeDrawable(int i) {
        if (this.premiumCrossfadeDrawable[i] == null) {
            this.premiumStarDrawable[i] = ContextCompat.getDrawable(getParentActivity(), R.drawable.msg_premium_liststar).mutate();
            int themedColor = getThemedColor(Theme.key_profile_verifiedBackground);
            if (i == 1) {
                themedColor = dontApplyPeerColor(themedColor);
            }
            this.premiumStarDrawable[i].setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
            this.premiumCrossfadeDrawable[i] = new CrossfadeDrawable(this.premiumStarDrawable[i], ContextCompat.getDrawable(getParentActivity(), R.drawable.msg_premium_prolfilestar).mutate());
        }
        return this.premiumCrossfadeDrawable[i];
    }

    private Drawable getBotVerificationDrawable(long j, boolean z, int i) {
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[] swapAnimatedEmojiDrawableArr = this.botVerificationDrawable;
        if (swapAnimatedEmojiDrawableArr[i] == null) {
            swapAnimatedEmojiDrawableArr[i] = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this.nameTextView[i], AndroidUtilities.dp(17.0f), i == 0 ? 7 : 2);
            this.botVerificationDrawable[i].offset(0, AndroidUtilities.dp(1.0f));
            if (this.fragmentViewAttached) {
                this.botVerificationDrawable[i].attach();
            }
        }
        if (j != 0) {
            this.botVerificationDrawable[i].set(j, z);
        } else {
            this.botVerificationDrawable[i].set((Drawable) null, z);
        }
        updateEmojiStatusDrawableColor();
        return this.botVerificationDrawable[i];
    }

    private Drawable getEmojiStatusDrawable(TLRPC.EmojiStatus emojiStatus, boolean z, boolean z2, int i) {
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[] swapAnimatedEmojiDrawableArr = this.emojiStatusDrawable;
        if (swapAnimatedEmojiDrawableArr[i] == null) {
            swapAnimatedEmojiDrawableArr[i] = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this.nameTextView[i], AndroidUtilities.dp(24.0f), i == 0 ? 7 : 2);
            if (this.fragmentViewAttached) {
                this.emojiStatusDrawable[i].attach();
            }
        }
        if (i == 1) {
            this.emojiStatusGiftId = null;
        }
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            TLRPC.TL_emojiStatus tL_emojiStatus = (TLRPC.TL_emojiStatus) emojiStatus;
            if ((1 & tL_emojiStatus.flags) == 0 || tL_emojiStatus.until > ((int) (System.currentTimeMillis() / 1000))) {
                this.emojiStatusDrawable[i].set(tL_emojiStatus.document_id, z2);
                this.emojiStatusDrawable[i].setParticles(false, z2);
            } else {
                this.emojiStatusDrawable[i].set(getPremiumCrossfadeDrawable(i), z2);
                this.emojiStatusDrawable[i].setParticles(false, z2);
            }
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if ((tL_emojiStatusCollectible.flags & 1) == 0 || tL_emojiStatusCollectible.until > ((int) (System.currentTimeMillis() / 1000))) {
                if (i == 1) {
                    this.emojiStatusGiftId = Long.valueOf(tL_emojiStatusCollectible.collectible_id);
                }
                this.emojiStatusDrawable[i].set(tL_emojiStatusCollectible.document_id, z2);
                this.emojiStatusDrawable[i].setParticles(true, z2);
            } else {
                this.emojiStatusDrawable[i].set(getPremiumCrossfadeDrawable(i), z2);
                this.emojiStatusDrawable[i].setParticles(false, z2);
            }
        } else {
            this.emojiStatusDrawable[i].set(getPremiumCrossfadeDrawable(i), z2);
            this.emojiStatusDrawable[i].setParticles(false, z2);
        }
        updateEmojiStatusDrawableColor();
        return this.emojiStatusDrawable[i];
    }

    public void updateEmojiStatusDrawableColor() {
        updateEmojiStatusDrawableColor(this.lastEmojiStatusProgress);
    }

    public void updateEmojiStatusDrawableColor(float f) {
        int offsetColor;
        for (int i = 0; i < 2; i++) {
            MessagesController.PeerColor peerColor = this.peerColor;
            if (peerColor != null && i == 1) {
                offsetColor = ColorUtils.blendARGB(peerColor.getStoryColor1(Theme.isCurrentThemeDark()), -1, 0.25f);
            } else {
                offsetColor = AndroidUtilities.getOffsetColor(getThemedColor(Theme.key_profile_verifiedBackground), getThemedColor(Theme.key_player_actionBarTitle), this.mediaHeaderAnimationProgress, 1.0f);
            }
            int iBlendARGB = ColorUtils.blendARGB(offsetColor, -1, f);
            int i2 = Theme.key_player_actionBarTitle;
            int iBlendARGB2 = ColorUtils.blendARGB(iBlendARGB, getThemedColor(i2), this.mediaHeaderAnimationProgress);
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiStatusDrawable[i];
            if (swapAnimatedEmojiDrawable != null) {
                swapAnimatedEmojiDrawable.setColor(Integer.valueOf(iBlendARGB2));
            }
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.botVerificationDrawable[i];
            if (swapAnimatedEmojiDrawable2 != null) {
                swapAnimatedEmojiDrawable2.setColor(Integer.valueOf(ColorUtils.blendARGB(ColorUtils.blendARGB(offsetColor, -1711276033, f), getThemedColor(i2), this.mediaHeaderAnimationProgress)));
            }
            if (i == 1) {
                this.animatedStatusView.setColor(iBlendARGB2);
            }
        }
        this.lastEmojiStatusProgress = f;
    }

    public void updateEmojiStatusEffectPosition() {
        this.animatedStatusView.setScaleX(this.nameTextView[1].getScaleX());
        this.animatedStatusView.setScaleY(this.nameTextView[1].getScaleY());
        this.animatedStatusView.translate(this.nameTextView[1].getX() + (this.nameTextView[1].getRightDrawableX() * this.nameTextView[1].getScaleX()), this.nameTextView[1].getY() + (this.nameTextView[1].getHeight() - ((this.nameTextView[1].getHeight() - this.nameTextView[1].getRightDrawableY()) * this.nameTextView[1].getScaleY())));
    }

    private void updateSuggestionsPosition() {
        FrameLayout frameLayout;
        if (this.suggestionView == null || this.onlineTextView[1] == null) {
            return;
        }
        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        ProfileSuggestionView profileSuggestionView = this.suggestionView;
        boolean z = this.openAnimationInProgress;
        profileSuggestionView.isOpeningLayout = z;
        if (z && this.playProfileAnimation == 2 && (frameLayout = this.avatarContainer) != null) {
            this.suggestionView.clipHeight = this.avatarContainer.getY() + (frameLayout.getHeight() * this.avatarContainer.getScaleY());
            this.suggestionView.setAlpha(this.avatarAnimationProgress);
            this.suggestionView.updatePosition(this.listView.getMeasuredWidth(), getActionsExtraHeight());
            ProfileSuggestionView profileSuggestionView2 = this.suggestionView;
            if (profileSuggestionView2 != null) {
                profileSuggestionView2.updatePosition(this.listView.getMeasuredWidth(), getActionsExtraHeight());
                return;
            }
            return;
        }
        profileSuggestionView.clipHeight = -1.0f;
        float f = currentActionBarHeight;
        float f2 = this.extraHeight + f;
        float fMin = Math.min(getActionsExtraHeight(), f2 - f);
        this.suggestionView.updatePosition(f2 - fMin, fMin);
    }

    private void updateActionsPosition() {
        float headerExtraHeight;
        float fClamp01;
        FrameLayout frameLayout;
        if (this.actionsView == null || this.onlineTextView[1] == null) {
            return;
        }
        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        ProfileActionsView profileActionsView = this.actionsView;
        boolean z = this.openAnimationInProgress;
        profileActionsView.isOpeningLayout = z;
        if (z && this.playProfileAnimation == 2 && (frameLayout = this.avatarContainer) != null) {
            this.actionsView.clipHeight = this.avatarContainer.getY() + (frameLayout.getHeight() * this.avatarContainer.getScaleY());
            this.actionsView.setAlpha(this.avatarAnimationProgress);
            this.actionsView.updatePosition(this.listView.getMeasuredWidth(), getActionsExtraHeight());
            ProfileSuggestionView profileSuggestionView = this.suggestionView;
            if (profileSuggestionView != null) {
                profileSuggestionView.updatePosition(this.listView.getMeasuredWidth(), getActionsExtraHeight());
            }
        } else {
            profileActionsView.clipHeight = -1.0f;
            float f = currentActionBarHeight;
            float f2 = this.extraHeight + f;
            float fMin = Math.min(getActionsExtraHeight(), f2 - f);
            this.actionsView.updatePosition(f2 - fMin, fMin);
        }
        ImageView imageView = this.callToActionItem;
        if (imageView == null || imageView.getTag() == null) {
            return;
        }
        ProfileActionsView profileActionsView2 = this.actionsView;
        boolean z2 = this.openAnimationInProgress;
        profileActionsView2.isAnimatingCallAction = z2;
        if (z2) {
            if (this.playProfileAnimation == 2) {
                headerExtraHeight = this.listView.getMeasuredWidth() + getActionsExtraHeight();
                fClamp01 = Utilities.clamp01(this.extraHeight / (headerExtraHeight - currentActionBarHeight));
            } else {
                float fClamp012 = Utilities.clamp01(this.extraHeight / getHeaderExtraHeight());
                headerExtraHeight = currentActionBarHeight + getHeaderExtraHeight();
                fClamp01 = fClamp012;
            }
            this.actionsView.applyCallTransition(this.callToActionItem, this.isFragmentOpened, headerExtraHeight, fClamp01);
            return;
        }
        if (this.callToActionItem.getVisibility() == 0) {
            this.callToActionItem.setVisibility(8);
        }
        if (this.callToActionItem.getTag() instanceof ActionBarMenuItem) {
            ((ActionBarMenuItem) this.callToActionItem.getTag()).setAlpha(1.0f);
        }
    }

    public void updateProfileData(boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.updateProfileData(boolean):void");
    }

    public void lambda$updateProfileData$93(View view) {
        MessagePrivateSeenView.showSheet(getContext(), this.currentAccount, getDialogId(), true, null, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateProfileData$92();
            }
        }, this.resourcesProvider);
    }

    public void lambda$updateProfileData$92() {
        getMessagesController().reloadUser(getDialogId());
    }

    public void lambda$updateProfileData$94(View view) {
        showStatusSelect();
    }

    public void lambda$updateProfileData$95(TLRPC.User user, SimpleTextView simpleTextView, View view) {
        ImageLocation forDocument;
        TLRPC.EmojiStatus emojiStatus = user.emoji_status;
        if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            if (tL_emojiStatusCollectible != null) {
                Browser.openUrl(getContext(), "https://" + getMessagesController().linkPrefix + "/nft/" + tL_emojiStatusCollectible.slug);
                return;
            }
            return;
        }
        PremiumPreviewBottomSheet premiumPreviewBottomSheet = new PremiumPreviewBottomSheet(this, this.currentAccount, user, this.resourcesProvider);
        simpleTextView.getLocationOnScreen(new int[2]);
        premiumPreviewBottomSheet.startEnterFromX = simpleTextView.rightDrawableX;
        premiumPreviewBottomSheet.startEnterFromY = simpleTextView.rightDrawableY;
        premiumPreviewBottomSheet.startEnterFromScale = simpleTextView.getScaleX();
        premiumPreviewBottomSheet.startEnterFromX1 = simpleTextView.getLeft();
        premiumPreviewBottomSheet.startEnterFromY1 = simpleTextView.getTop();
        premiumPreviewBottomSheet.startEnterFromView = simpleTextView;
        Drawable rightDrawable = simpleTextView.getRightDrawable();
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiStatusDrawable[1];
        if (rightDrawable == swapAnimatedEmojiDrawable && swapAnimatedEmojiDrawable != null && (swapAnimatedEmojiDrawable.getDrawable() instanceof AnimatedEmojiDrawable)) {
            premiumPreviewBottomSheet.startEnterFromScale *= 0.98f;
            TLRPC.Document document = ((AnimatedEmojiDrawable) this.emojiStatusDrawable[1].getDrawable()).getDocument();
            if (document != null) {
                BackupImageView backupImageView = new BackupImageView(getContext());
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f);
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                String str = "160_160";
                if ("video/webm".equals(document.mime_type)) {
                    forDocument = ImageLocation.getForDocument(document);
                    str = "160_160_g";
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                } else {
                    if (svgThumb != null && MessageObject.isAnimatedStickerDocument(document, false)) {
                        svgThumb.overrideWidthAndHeight(512, 512);
                    }
                    forDocument = ImageLocation.getForDocument(document);
                }
                String str2 = str;
                backupImageView.setLayerNum(7);
                backupImageView.setRoundRadius(AndroidUtilities.dp(4.0f));
                backupImageView.setImage(forDocument, str2, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                if (((AnimatedEmojiDrawable) this.emojiStatusDrawable[1].getDrawable()).canOverrideColor()) {
                    backupImageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_windowBackgroundWhiteBlueIcon), PorterDuff.Mode.SRC_IN));
                    premiumPreviewBottomSheet.statusStickerSet = MessageObject.getInputStickerSet(document);
                } else {
                    premiumPreviewBottomSheet.statusStickerSet = MessageObject.getInputStickerSet(document);
                }
                premiumPreviewBottomSheet.overrideTitleIcon = backupImageView;
                premiumPreviewBottomSheet.isEmojiStatus = true;
            }
        }
        showDialog(premiumPreviewBottomSheet);
    }

    public void lambda$updateProfileData$96(View view) {
        showStatusSelect();
    }

    public void lambda$updateProfileData$97(String str, View view) {
        Browser.openUrl(getContext(), "https://" + getMessagesController().linkPrefix + "/nft/" + str);
    }

    public void lambda$updateProfileData$98(View view) {
        goToForum();
    }

    @Override
    public void clearViews() {
        this.peerColor = null;
        super.clearViews();
    }

    private void updatedPeerColor() {
        ProfileGiftsContainer profileGiftsContainer;
        SharedMediaLayout.ScrollSlidingTextTabStripInner scrollSlidingTextTabStripInner;
        TextView textView;
        int themedColor;
        int themedColor2;
        this.adaptedColors.clear();
        TopView topView = this.topView;
        if (topView != null) {
            topView.setBackgroundColorId(this.peerColor, true);
        }
        SimpleTextView simpleTextView = this.onlineTextView[1];
        if (simpleTextView != null) {
            if (simpleTextView.getTag() instanceof Integer) {
                themedColor2 = getThemedColor(((Integer) this.onlineTextView[1].getTag()).intValue());
            } else {
                themedColor2 = getThemedColor(Theme.key_avatar_subtitleInProfileBlue);
            }
            this.onlineTextView[1].setTextColor(ColorUtils.blendARGB(applyPeerColor(themedColor2, true, Boolean.valueOf(this.isOnline[0])), -1275068417, this.currentExpandAnimatorValue));
        }
        ShowDrawable showDrawable = this.showStatusButton;
        if (showDrawable != null) {
            showDrawable.setBackgroundColor(ColorUtils.blendARGB(Theme.multAlpha(Theme.adaptHSV(this.actionBarBackgroundColor, 0.18f, -0.1f), 0.5f), 603979775, this.currentExpandAnimatorValue));
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setItemsColor(ColorUtils.blendARGB(this.peerColor != null ? -1 : getThemedColor(Theme.key_actionBarDefaultIcon), getThemedColor(Theme.key_actionBarActionModeDefaultIcon), this.mediaHeaderAnimationProgress), false);
            ActionBar actionBar2 = this.actionBar;
            MessagesController.PeerColor peerColor = this.peerColor;
            actionBar2.setItemsBackgroundColor(ColorUtils.blendARGB(peerColor != null ? 1090519039 : peerColor != null ? 553648127 : getThemedColor(Theme.key_avatar_actionBarSelectorBlue), getThemedColor(Theme.key_actionBarActionModeDefaultSelector), this.mediaHeaderAnimationProgress), false);
        }
        if (this.verifiedDrawable[1] != null) {
            MessagesController.PeerColor peerColor2 = this.peerColor;
            if (peerColor2 != null) {
                themedColor = Theme.adaptHSV(ColorUtils.blendARGB(peerColor2.getColor2(), this.peerColor.hasColor6(Theme.isCurrentThemeDark()) ? this.peerColor.getColor5() : this.peerColor.getColor3(), 0.4f), 0.1f, Theme.isCurrentThemeDark() ? -0.1f : -0.08f);
            } else {
                themedColor = getThemedColor(Theme.key_profile_verifiedBackground);
            }
            this.verifiedDrawable[1].setColorFilter(AndroidUtilities.getOffsetColor(themedColor, getThemedColor(Theme.key_player_actionBarTitle), this.mediaHeaderAnimationProgress, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (this.verifiedCheckDrawable[1] != null) {
            this.verifiedCheckDrawable[1].setColorFilter(AndroidUtilities.getOffsetColor(this.peerColor != null ? -1 : dontApplyPeerColor(getThemedColor(Theme.key_profile_verifiedCheck)), getThemedColor(Theme.key_windowBackgroundWhite), this.mediaHeaderAnimationProgress, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        SimpleTextView simpleTextView2 = this.nameTextView[1];
        if (simpleTextView2 != null) {
            simpleTextView2.setTextColor(ColorUtils.blendARGB(ColorUtils.blendARGB(this.peerColor != null ? -1 : getThemedColor(Theme.key_profile_title), getThemedColor(Theme.key_player_actionBarTitle), this.mediaHeaderAnimationProgress), -1, this.currentExpandAnimatorValue));
        }
        AutoDeletePopupWrapper autoDeletePopupWrapper = this.autoDeletePopupWrapper;
        if (autoDeletePopupWrapper != null && (textView = autoDeletePopupWrapper.textView) != null) {
            textView.invalidate();
        }
        AndroidUtilities.forEachViews((RecyclerView) this.listView, new com.google.android.exoplayer2.util.Consumer() {
            @Override
            public final void accept(Object obj) {
                this.f$0.lambda$updatedPeerColor$99((View) obj);
            }
        });
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout != null && (scrollSlidingTextTabStripInner = sharedMediaLayout.scrollSlidingTextTabStrip) != null) {
            scrollSlidingTextTabStripInner.updateColors();
        }
        SharedMediaLayout sharedMediaLayout2 = this.sharedMediaLayout;
        if (sharedMediaLayout2 != null && (profileGiftsContainer = sharedMediaLayout2.giftsContainer) != null) {
            profileGiftsContainer.updateColors();
        }
        writeButtonSetBackground();
        updateEmojiStatusDrawableColor();
        ProfileStoriesView profileStoriesView = this.storyView;
        if (profileStoriesView != null) {
            profileStoriesView.update();
        }
        ProfileGiftsView profileGiftsView = this.giftsView;
        if (profileGiftsView != null) {
            profileGiftsView.update();
        }
    }

    public void lambda$updatedPeerColor$99(View view) {
        if (view instanceof HeaderCell) {
            ((HeaderCell) view).setTextColor(dontApplyPeerColor(getThemedColor(Theme.key_windowBackgroundWhiteBlueHeader), false));
        } else if (view instanceof TextDetailCell) {
            ((TextDetailCell) view).updateColors();
        } else if (view instanceof TextCell) {
            ((TextCell) view).updateColors();
        } else if (view instanceof AboutLinkCell) {
            ((AboutLinkCell) view).updateColors();
        } else if (view instanceof NotificationsCheckCell) {
            ((NotificationsCheckCell) view).getCheckBox().invalidate();
        } else if (view instanceof ProfileHoursCell) {
            ((ProfileHoursCell) view).updateColors();
        } else if (view instanceof ProfileChannelCell) {
            ((ProfileChannelCell) view).updateColors();
        } else if (view instanceof ProfileMusicView) {
            ((ProfileMusicView) view).setColor(this.peerColor);
        }
        this.listAdapter.setBackground(view, this.listAdapter.getItemViewType(this.listView.getChildAdapterPosition(view)));
    }

    public int dontApplyPeerColor(int i) {
        return dontApplyPeerColor(i, true, null);
    }

    public int dontApplyPeerColor(int i, boolean z) {
        return dontApplyPeerColor(i, z, null);
    }

    private int applyPeerColor(int i, boolean z, Boolean bool) {
        if ((!z && isSettings()) || this.peerColor == null) {
            return i;
        }
        if (!z) {
            int iIndexOfKey = this.adaptedColors.indexOfKey(i);
            if (iIndexOfKey < 0) {
                int iAdapt = OKLCH.adapt(i, Theme.adaptHSV(this.peerColor.getBgColor1(Theme.isCurrentThemeDark()), Theme.isCurrentThemeDark() ? 0.0f : 0.05f, Theme.isCurrentThemeDark() ? -0.1f : -0.04f));
                this.adaptedColors.put(i, iAdapt);
                return iAdapt;
            }
            return this.adaptedColors.valueAt(iIndexOfKey);
        }
        int themedColor = getThemedColor(z ? Theme.key_actionBarDefault : Theme.key_windowBackgroundWhiteBlueIcon);
        int iBlendARGB = ColorUtils.blendARGB(this.peerColor.getStoryColor1(Theme.isCurrentThemeDark()), this.peerColor.getStoryColor2(Theme.isCurrentThemeDark()), 0.5f);
        int bgColor1 = z ? iBlendARGB : this.peerColor.getBgColor1(Theme.isCurrentThemeDark());
        if (!Theme.hasHue(themedColor)) {
            return (bool == null || bool.booleanValue()) ? iBlendARGB : Theme.adaptHSV(Theme.multAlpha(iBlendARGB, 0.7f), -0.2f, 0.2f);
        }
        boolean zIsCurrentThemeDark = Theme.isCurrentThemeDark();
        if (bool != null && !bool.booleanValue()) {
            iBlendARGB = Theme.multAlpha(iBlendARGB, 0.7f);
        }
        return Theme.changeColorAccent(themedColor, bgColor1, i, zIsCurrentThemeDark, iBlendARGB);
    }

    private int applyPeerColor2(int i) {
        MessagesController.PeerColor peerColor = this.peerColor;
        if (peerColor == null) {
            return i;
        }
        int bgColor2 = peerColor.getBgColor2(Theme.isCurrentThemeDark());
        return Theme.changeColorAccent(getThemedColor(Theme.key_windowBackgroundWhiteBlueIcon), bgColor2, i, Theme.isCurrentThemeDark(), bgColor2);
    }

    private void createActionBarMenu(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createActionBarMenu(boolean):void");
    }

    private void createAutoDeleteItem(Context context) {
        int i;
        this.autoDeletePopupWrapper = new AutoDeletePopupWrapper(context, this.otherItem.getPopupLayout().getSwipeBack(), new AutoDeletePopupWrapper.Callback() {
            @Override
            public void dismiss() {
                ProfileActivity.this.otherItem.toggleSubMenu();
            }

            @Override
            public void setAutoDeleteHistory(int i2, int i3) {
                ProfileActivity.this.setAutoDeleteHistory(i2, i3);
            }

            @Override
            public void showGlobalAutoDeleteScreen() {
                ProfileActivity.this.presentFragment(new AutoDeleteMessagesActivity());
                dismiss();
            }
        }, false, 0, this.resourcesProvider);
        if (this.dialogId > 0 || this.userId > 0) {
            this.autoDeletePopupWrapper.allowExtendedHint(dontApplyPeerColor(getThemedColor(Theme.key_windowBackgroundWhiteBlueText), false));
        }
        TLRPC.UserFull userFull = this.userInfo;
        if (userFull == null && this.chatInfo == null) {
            i = 0;
        } else {
            i = userFull != null ? userFull.ttl_period : this.chatInfo.ttl_period;
        }
        TimerDrawable ttlIcon = TimerDrawable.getTtlIcon(i);
        this.autoDeleteItemDrawable = ttlIcon;
        this.autoDeleteItem = this.otherItem.addSwipeBackItem(0, ttlIcon, LocaleController.getString(R.string.AutoDeletePopupTitle), this.autoDeletePopupWrapper.windowLayout);
        this.otherItem.addColoredGap();
        updateAutoDeleteItem();
    }

    @Override
    public Theme.ResourcesProvider getResourceProvider() {
        return this.resourcesProvider;
    }

    @Override
    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    @Override
    public Drawable getThemedDrawable(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Drawable drawable = resourcesProvider != null ? resourcesProvider.getDrawable(str) : null;
        return drawable != null ? drawable : super.getThemedDrawable(str);
    }

    public void setAutoDeleteHistory(int i, int i2) {
        long dialogId = getDialogId();
        getMessagesController().setDialogHistoryTTL(dialogId, i);
        if (this.userInfo == null && this.chatInfo == null) {
            return;
        }
        UndoView undoView = this.undoView;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(dialogId));
        TLRPC.UserFull userFull = this.userInfo;
        undoView.showWithAction(dialogId, i2, user, Integer.valueOf(userFull != null ? userFull.ttl_period : this.chatInfo.ttl_period), (Runnable) null, (Runnable) null);
    }

    @Override
    protected void onDialogDismiss(Dialog dialog) {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            recyclerListView.invalidateViews();
        }
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(j));
        } else if (DialogObject.isUserDialog(j)) {
            bundle.putLong("user_id", j);
        } else if (DialogObject.isChatDialog(j)) {
            bundle.putLong("chat_id", -j);
        }
        if (!getMessagesController().checkCanOpenChat(bundle, dialogsActivity)) {
            return false;
        }
        NotificationCenter notificationCenter = getNotificationCenter();
        int i3 = NotificationCenter.closeChats;
        notificationCenter.removeObserver(this, i3);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i3, new Object[0]);
        presentFragment(new ChatActivity(bundle), true);
        removeSelfFromStack();
        getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(getMessagesController().getUser(Long.valueOf(this.userId)), j, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z2, i, i2));
        if (!TextUtils.isEmpty(charSequence)) {
            SendMessagesHelper.prepareSendingText(AccountInstance.getInstance(this.currentAccount), charSequence.toString(), j, z2, i, i2, 0L);
        }
        return true;
    }

    @Override
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        boolean z;
        boolean z2;
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.onRequestPermissionsResultFragment(i, strArr, iArr);
        }
        if (i == 101 || i == 102) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.userId));
            if (user == null) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= iArr.length) {
                    z = true;
                    break;
                } else {
                    if (iArr[i2] != 0) {
                        z = false;
                        break;
                    }
                    i2++;
                }
            }
            if (iArr.length > 0 && z) {
                boolean z3 = i == 102;
                TLRPC.UserFull userFull = this.userInfo;
                VoIPHelper.startCall(user, z3, userFull != null && userFull.video_calls_available, getParentActivity(), this.userInfo, getAccountInstance());
                return;
            }
            VoIPHelper.permissionDenied(getParentActivity(), null, i);
            return;
        }
        if (i != 103 || this.currentChat == null) {
            return;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= iArr.length) {
                z2 = true;
                break;
            } else {
                if (iArr[i3] != 0) {
                    z2 = false;
                    break;
                }
                i3++;
            }
        }
        if (iArr.length > 0 && z2) {
            VoIPHelper.startCall(this.currentChat, null, null, getMessagesController().getGroupCall(this.chatId, false) == null, getParentActivity(), this, getAccountInstance());
        } else {
            VoIPHelper.permissionDenied(getParentActivity(), null, i);
        }
    }

    @Override
    public void dismissCurrentDialog() {
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater == null || !imageUpdater.dismissCurrentDialog(this.visibleDialog)) {
            super.dismissCurrentDialog();
        }
    }

    @Override
    public boolean dismissDialogOnPause(Dialog dialog) {
        ImageUpdater imageUpdater = this.imageUpdater;
        return (imageUpdater == null || imageUpdater.dismissDialogOnPause(dialog)) && super.dismissDialogOnPause(dialog);
    }

    public Animator searchExpandTransition(final boolean z) {
        if (z) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
            AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        }
        Animator animator = this.searchViewTransition;
        if (animator != null) {
            animator.removeAllListeners();
            this.searchViewTransition.cancel();
        }
        ProfileGiftsView profileGiftsView = this.giftsView;
        if (profileGiftsView != null) {
            profileGiftsView.setActive(!z);
        }
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.searchTransitionProgress, z ? 0.0f : 1.0f);
        final float f = this.extraHeight;
        this.searchListView.setTranslationY(f);
        this.searchListView.setVisibility(0);
        this.searchItem.setVisibility(0);
        this.listView.setVisibility(0);
        needLayout(true);
        this.avatarContainer.setVisibility(0);
        this.nameTextView[1].setVisibility(0);
        this.onlineTextView[1].setVisibility(0);
        this.onlineTextView[3].setVisibility(0);
        this.actionBar.onSearchFieldVisibilityChanged(this.searchTransitionProgress > 0.5f);
        int i = this.searchTransitionProgress > 0.5f ? 0 : 8;
        ActionBarMenuItem actionBarMenuItem = this.otherItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setVisibility(i);
        }
        this.searchItem.setVisibility(i);
        this.searchItem.getSearchContainer().setVisibility(this.searchTransitionProgress <= 0.5f ? 0 : 8);
        this.searchListView.setEmptyView(this.emptyView);
        this.avatarContainer.setClickable(false);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$searchExpandTransition$100(valueAnimatorOfFloat, f, z, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator2) {
                ProfileActivity.this.updateSearchViewState(z);
                ProfileActivity.this.avatarContainer.setClickable(true);
                if (z) {
                    ProfileActivity.this.searchItem.requestFocusOnSearchView();
                }
                ProfileActivity.this.needLayout(true);
                ProfileActivity.this.searchViewTransition = null;
                ProfileActivity.this.fragmentView.invalidate();
                if (z) {
                    ProfileActivity.this.invalidateScroll = true;
                    ProfileActivity.this.saveScrollPosition();
                    AndroidUtilities.requestAdjustResize(ProfileActivity.this.getParentActivity(), ((BaseFragment) ProfileActivity.this).classGuid);
                    ProfileActivity.this.emptyView.setPreventMoving(false);
                }
            }
        });
        if (!z) {
            this.invalidateScroll = true;
            saveScrollPosition();
            AndroidUtilities.requestAdjustNothing(getParentActivity(), this.classGuid);
            this.emptyView.setPreventMoving(true);
        }
        valueAnimatorOfFloat.setDuration(220L);
        valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.searchViewTransition = valueAnimatorOfFloat;
        return valueAnimatorOfFloat;
    }

    public void lambda$searchExpandTransition$100(ValueAnimator valueAnimator, float f, boolean z, ValueAnimator valueAnimator2) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.searchTransitionProgress = fFloatValue;
        float f2 = (fFloatValue - 0.5f) / 0.5f;
        float f3 = (0.5f - fFloatValue) / 0.5f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        float f4 = -f;
        this.searchTransitionOffset = (int) ((1.0f - fFloatValue) * f4);
        this.searchListView.setTranslationY(fFloatValue * f);
        this.emptyView.setTranslationY(f * this.searchTransitionProgress);
        this.listView.setTranslationY(f4 * (1.0f - this.searchTransitionProgress));
        this.listView.setScaleX(1.0f - ((1.0f - this.searchTransitionProgress) * 0.01f));
        this.listView.setScaleY(1.0f - ((1.0f - this.searchTransitionProgress) * 0.01f));
        this.listView.setAlpha(this.searchTransitionProgress);
        needLayout(true);
        this.listView.setAlpha(f2);
        this.searchListView.setAlpha(1.0f - this.searchTransitionProgress);
        this.searchListView.setScaleX((this.searchTransitionProgress * 0.05f) + 1.0f);
        this.searchListView.setScaleY((this.searchTransitionProgress * 0.05f) + 1.0f);
        this.emptyView.setAlpha(1.0f - f2);
        this.avatarContainer.setAlpha(f2);
        this.avatarImage.setAlpha(f2);
        ProfileStoriesView profileStoriesView = this.storyView;
        if (profileStoriesView != null) {
            profileStoriesView.setAlpha(f2);
        }
        this.nameTextView[1].setAlpha(f2);
        this.onlineTextView[1].setAlpha(f2);
        this.onlineTextView[3].setAlpha(f2);
        this.searchItem.getSearchField().setAlpha(f3);
        if (z && this.searchTransitionProgress < 0.7f) {
            this.searchItem.requestFocusOnSearchView();
        }
        this.searchItem.getSearchContainer().setVisibility(this.searchTransitionProgress < 0.5f ? 0 : 8);
        int i = this.searchTransitionProgress > 0.5f ? 0 : 8;
        ActionBarMenuItem actionBarMenuItem = this.otherItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setVisibility(i);
            this.otherItem.setAlpha(f2);
        }
        this.searchItem.setVisibility(i);
        this.actionBar.onSearchFieldVisibilityChanged(this.searchTransitionProgress < 0.5f);
        ActionBarMenuItem actionBarMenuItem2 = this.otherItem;
        if (actionBarMenuItem2 != null) {
            actionBarMenuItem2.setAlpha(f2);
        }
        this.searchItem.setAlpha(f2);
        this.topView.invalidate();
        this.fragmentView.invalidate();
    }

    public void updateSearchViewState(boolean z) {
        int i = z ? 8 : 0;
        this.listView.setVisibility(i);
        this.searchListView.setVisibility(z ? 0 : 8);
        this.searchItem.getSearchContainer().setVisibility(z ? 0 : 8);
        ProfileGiftsView profileGiftsView = this.giftsView;
        if (profileGiftsView != null) {
            profileGiftsView.setActive(!z);
        }
        this.actionBar.onSearchFieldVisibilityChanged(z);
        this.avatarContainer.setVisibility(i);
        ProfileStoriesView profileStoriesView = this.storyView;
        if (profileStoriesView != null) {
            profileStoriesView.setVisibility(i);
        }
        this.nameTextView[1].setVisibility(i);
        this.onlineTextView[1].setVisibility(i);
        this.onlineTextView[3].setVisibility(i);
        ActionBarMenuItem actionBarMenuItem = this.otherItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setAlpha(1.0f);
            this.otherItem.setVisibility(i);
        }
        this.searchItem.setVisibility(i);
        this.avatarImage.setAlpha(1.0f);
        this.avatarContainer.setAlpha(1.0f);
        ProfileStoriesView profileStoriesView2 = this.storyView;
        if (profileStoriesView2 != null) {
            profileStoriesView2.setAlpha(1.0f);
        }
        ProfileGiftsView profileGiftsView2 = this.giftsView;
        if (profileGiftsView2 != null) {
            profileGiftsView2.setAlpha(1.0f);
        }
        this.nameTextView[1].setAlpha(1.0f);
        this.onlineTextView[1].setAlpha(1.0f);
        this.searchItem.setAlpha(1.0f);
        this.listView.setAlpha(1.0f);
        this.searchListView.setAlpha(1.0f);
        this.emptyView.setAlpha(1.0f);
        if (z) {
            this.searchListView.setEmptyView(this.emptyView);
        } else {
            this.emptyView.setVisibility(8);
        }
    }

    @Override
    public void onUploadProgressChanged(float f) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f);
        this.avatarsViewPager.setUploadProgress(this.uploadingImageLocation, f);
    }

    @Override
    public void didStartUpload(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public void didUploadPhoto(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$didUploadPhoto$103(inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize);
            }
        });
    }

    public void lambda$didUploadPhoto$102(final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$didUploadPhoto$101(tL_error, tLObject, str);
            }
        });
    }

    public void lambda$didUploadPhoto$101(TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        if (tL_error == null) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId()));
            if (user == null) {
                user = getUserConfig().getCurrentUser();
                if (user == null) {
                    return;
                } else {
                    getMessagesController().putUser(user, false);
                }
            } else {
                getUserConfig().setCurrentUser(user);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 150);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 800);
            TLRPC.VideoSize closestVideoSizeWithSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : FileLoader.getClosestVideoSizeWithSize(tL_photos_photo.photo.video_sizes, 1000);
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            user.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (closestPhotoSizeWithSize != null) {
                tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
            }
            if (closestPhotoSizeWithSize != null && this.avatar != null) {
                FileLoader.getInstance(this.currentAccount).getPathToAttach(this.avatar, true).renameTo(FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                ImageLoader.getInstance().replaceImageInCache(this.avatar.volume_id + "_" + this.avatar.local_id + "@50_50", closestPhotoSizeWithSize.location.volume_id + "_" + closestPhotoSizeWithSize.location.local_id + "@50_50", ImageLocation.getForUserOrChat(user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(this.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && this.avatarBig != null) {
                FileLoader.getInstance(this.currentAccount).getPathToAttach(this.avatarBig, true).renameTo(FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.userId);
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
        this.allowPullingDown = (AndroidUtilities.isTablet() || this.isInLandscapeMode || !this.avatarImage.getImageReceiver().hasNotThumb() || AndroidUtilities.isAccessibilityScreenReaderEnabled()) ? false : true;
        this.avatar = null;
        this.avatarBig = null;
        ProfileGalleryView profileGalleryView = this.avatarsViewPager;
        profileGalleryView.scrolledByUser = true;
        profileGalleryView.removeUploadingImage(this.uploadingImageLocation);
        this.avatarsViewPager.setCreateThumbFromParent(false);
        updateProfileData(true);
        showAvatarProgress(false, true);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        getUserConfig().saveConfig(true);
    }

    public void lambda$didUploadPhoto$103(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, final String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile != null || inputFile2 != null || videoSize != null) {
            if (this.avatar == null) {
                return;
            }
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            this.avatarUploadingRequest = getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$didUploadPhoto$102(str, tLObject, tL_error);
                }
            });
        } else {
            TLRPC.FileLocation fileLocation = photoSize.location;
            this.avatar = fileLocation;
            this.avatarBig = photoSize2.location;
            this.avatarImage.setImage(ImageLocation.getForLocal(fileLocation), "50_50", this.avatarDrawable, (Object) null);
            if (this.setAvatarRow != -1) {
                updateRowsIds();
                ListAdapter listAdapter = this.listAdapter;
                if (listAdapter != null) {
                    listAdapter.notifyDataSetChanged();
                }
                needLayout(true);
            }
            ProfileGalleryView profileGalleryView = this.avatarsViewPager;
            ImageLocation forLocal = ImageLocation.getForLocal(this.avatarBig);
            this.uploadingImageLocation = forLocal;
            profileGalleryView.addUploadingImage(forLocal, ImageLocation.getForLocal(this.avatar));
            showAvatarProgress(true, false);
        }
        this.actionBar.createMenu().requestLayout();
    }

    public void showAvatarProgress(final boolean z, boolean z2) {
        if (this.avatarProgressView == null) {
            return;
        }
        AnimatorSet animatorSet = this.avatarAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.avatarAnimation = null;
        }
        if (!z2) {
            if (z) {
                this.avatarProgressView.setAlpha(1.0f);
                this.avatarProgressView.setVisibility(0);
                return;
            } else {
                this.avatarProgressView.setAlpha(0.0f);
                this.avatarProgressView.setVisibility(4);
                return;
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.avatarAnimation = animatorSet2;
        if (z) {
            this.avatarProgressView.setVisibility(0);
            this.avatarAnimation.playTogether(ObjectAnimator.ofFloat(this.avatarProgressView, (Property<RadialProgressView, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.avatarProgressView, (Property<RadialProgressView, Float>) View.ALPHA, 0.0f));
        }
        this.avatarAnimation.setDuration(180L);
        this.avatarAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (ProfileActivity.this.avatarAnimation == null || ProfileActivity.this.avatarProgressView == null) {
                    return;
                }
                if (!z) {
                    ProfileActivity.this.avatarProgressView.setVisibility(4);
                }
                ProfileActivity.this.avatarAnimation = null;
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                ProfileActivity.this.avatarAnimation = null;
            }
        });
        this.avatarAnimation.start();
    }

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.onActivityResult(i, i2, intent);
        }
    }

    @Override
    public void saveSelfArgs(Bundle bundle) {
        String str;
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater == null || (str = imageUpdater.currentPicturePath) == null) {
            return;
        }
        bundle.putString("path", str);
    }

    @Override
    public void restoreSelfArgs(Bundle bundle) {
        ImageUpdater imageUpdater = this.imageUpdater;
        if (imageUpdater != null) {
            imageUpdater.currentPicturePath = bundle.getString("path");
        }
    }

    public static void sendLogs(final Activity activity, final boolean z) {
        if (activity == null) {
            return;
        }
        final AlertDialog alertDialog = new AlertDialog(activity, 3);
        alertDialog.setCanCancel(false);
        alertDialog.show();
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws Throwable {
                ProfileActivity.lambda$sendLogs$105(alertDialog, z, activity);
            }
        });
    }

    public static void lambda$sendLogs$105(final org.telegram.ui.ActionBar.AlertDialog r19, boolean r20, final android.app.Activity r21) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.lambda$sendLogs$105(org.telegram.ui.ActionBar.AlertDialog, boolean, android.app.Activity):void");
    }

    public static void lambda$sendLogs$104(AlertDialog alertDialog, boolean[] zArr, Activity activity, File file) {
        Uri uriFromFile;
        try {
            alertDialog.dismiss();
        } catch (Exception unused) {
        }
        if (!zArr[0]) {
            if (activity != null) {
                Toast.makeText(activity, LocaleController.getString(R.string.ErrorOccurred), 0).show();
                return;
            }
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            uriFromFile = FileProvider.getUriForFile(activity, ApplicationLoader.getApplicationId() + ".provider", file);
        } else {
            uriFromFile = Uri.fromFile(file);
        }
        Intent intent = new Intent("android.intent.action.SEND");
        if (i >= 24) {
            intent.addFlags(1);
        }
        intent.setType("message/rfc822");
        intent.putExtra("android.intent.extra.EMAIL", "");
        intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + LocaleController.getInstance().getFormatterStats().format(System.currentTimeMillis()));
        intent.putExtra("android.intent.extra.STREAM", uriFromFile);
        if (activity != null) {
            try {
                activity.startActivityForResult(Intent.createChooser(intent, "Select email application."), 500);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;
        private final HashMap usernameSpans = new HashMap();

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shadowSectionCell;
            switch (i) {
                case 1:
                    View headerCell = new HeaderCell(this.mContext, 23, ProfileActivity.this.resourcesProvider);
                    headerCell.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    shadowSectionCell = headerCell;
                    break;
                case 2:
                case 19:
                case 30:
                    TextDetailCell textDetailCell = new TextDetailCell(this.mContext, ProfileActivity.this.resourcesProvider, i == 30, i == 19) {
                        @Override
                        protected int processColor(int i2) {
                            return ProfileActivity.this.dontApplyPeerColor(i2, false);
                        }
                    };
                    textDetailCell.setContentDescriptionValueFirst(true);
                    textDetailCell.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    shadowSectionCell = textDetailCell;
                    break;
                case 3:
                    ProfileActivity profileActivity = ProfileActivity.this;
                    Context context = this.mContext;
                    ProfileActivity profileActivity2 = ProfileActivity.this;
                    View view = profileActivity.aboutLinkCell = new AboutLinkCell(context, profileActivity2, profileActivity2.resourcesProvider) {
                        @Override
                        protected void didPressUrl(String str, Browser.Progress progress) {
                            ProfileActivity.this.openUrl(str, progress);
                        }

                        @Override
                        protected void didResizeEnd() {
                            ProfileActivity.this.layoutManager.mIgnoreTopPadding = false;
                        }

                        @Override
                        protected void didResizeStart() {
                            ProfileActivity.this.layoutManager.mIgnoreTopPadding = true;
                        }

                        @Override
                        protected int processColor(int i2) {
                            return ProfileActivity.this.dontApplyPeerColor(i2, false);
                        }
                    };
                    view.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    shadowSectionCell = view;
                    break;
                case 4:
                    View view2 = new TextCell(this.mContext, ProfileActivity.this.resourcesProvider) {
                        @Override
                        protected int processColor(int i2) {
                            return ProfileActivity.this.dontApplyPeerColor(i2, false);
                        }
                    };
                    view2.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    shadowSectionCell = view2;
                    break;
                case 5:
                    View dividerCell = new DividerCell(this.mContext, ProfileActivity.this.resourcesProvider);
                    dividerCell.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    dividerCell.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                    shadowSectionCell = dividerCell;
                    break;
                case 6:
                    View view3 = new NotificationsCheckCell(this.mContext, 23, 70, false, ProfileActivity.this.resourcesProvider) {
                        @Override
                        protected int processColor(int i2) {
                            return ProfileActivity.this.dontApplyPeerColor(i2, false);
                        }
                    };
                    view3.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    shadowSectionCell = view3;
                    break;
                case 7:
                    shadowSectionCell = new ShadowSectionCell(this.mContext, ProfileActivity.this.resourcesProvider);
                    break;
                case 8:
                    View userCell = new UserCell(this.mContext, ProfileActivity.this.addMemberRow == -1 ? 9 : 6, 0, true, ProfileActivity.this.resourcesProvider);
                    userCell.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    shadowSectionCell = userCell;
                    break;
                case 9:
                case 10:
                case 14:
                case 16:
                default:
                    TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(this.mContext, 10, ProfileActivity.this.resourcesProvider);
                    textInfoPrivacyCell.getTextView().setGravity(1);
                    textInfoPrivacyCell.getTextView().setTextColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText3));
                    textInfoPrivacyCell.getTextView().setMovementMethod(null);
                    textInfoPrivacyCell.setText(AndroidUtilities.getBuildVersionInfo());
                    textInfoPrivacyCell.getTextView().setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
                    textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, R.drawable.greydivider_bottom, ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundGrayShadow)));
                    shadowSectionCell = textInfoPrivacyCell;
                    break;
                case 11:
                    shadowSectionCell = new View(this.mContext) {
                        @Override
                        protected void onMeasure(int i2, int i3) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                        }
                    };
                    break;
                case 12:
                    View view4 = new View(this.mContext) {
                        private int lastPaddingHeight = 0;
                        private int lastListViewHeight = 0;

                        @Override
                        protected void onMeasure(int i2, int i3) {
                            if (this.lastListViewHeight != ProfileActivity.this.listView.getMeasuredHeight()) {
                                this.lastPaddingHeight = 0;
                            }
                            this.lastListViewHeight = ProfileActivity.this.listView.getMeasuredHeight();
                            int childCount = ProfileActivity.this.listView.getChildCount();
                            if (childCount != ProfileActivity.this.listAdapter.getItemCount()) {
                                setMeasuredDimension(ProfileActivity.this.listView.getMeasuredWidth(), this.lastPaddingHeight);
                                return;
                            }
                            int measuredHeight = 0;
                            for (int i4 = 0; i4 < childCount; i4++) {
                                int childAdapterPosition = ProfileActivity.this.listView.getChildAdapterPosition(ProfileActivity.this.listView.getChildAt(i4));
                                if (childAdapterPosition >= 0 && childAdapterPosition != ProfileActivity.this.bottomPaddingRow) {
                                    measuredHeight += ProfileActivity.this.listView.getChildAt(i4).getMeasuredHeight();
                                }
                            }
                            View view5 = ProfileActivity.this.fragmentView;
                            int measuredHeight2 = (((view5 == null ? 0 : view5.getMeasuredHeight()) - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - measuredHeight;
                            if (measuredHeight2 > ProfileActivity.this.getHeaderExtraHeight()) {
                                measuredHeight2 = 0;
                            }
                            int i5 = measuredHeight2 > 0 ? measuredHeight2 : 0;
                            int measuredWidth = ProfileActivity.this.listView.getMeasuredWidth();
                            this.lastPaddingHeight = i5;
                            setMeasuredDimension(measuredWidth, i5);
                        }
                    };
                    view4.setBackground(new ColorDrawable(0));
                    shadowSectionCell = view4;
                    break;
                case 13:
                    if (ProfileActivity.this.sharedMediaLayout.getParent() != null) {
                        ((ViewGroup) ProfileActivity.this.sharedMediaLayout.getParent()).removeView(ProfileActivity.this.sharedMediaLayout);
                    }
                    shadowSectionCell = ProfileActivity.this.sharedMediaLayout;
                    break;
                case 15:
                    shadowSectionCell = new AnonymousClass9(this.mContext, ProfileActivity.this.resourcesProvider);
                    break;
                case 17:
                    View textInfoPrivacyCell2 = new TextInfoPrivacyCell(this.mContext, ProfileActivity.this.resourcesProvider);
                    textInfoPrivacyCell2.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    shadowSectionCell = textInfoPrivacyCell2;
                    break;
                case 18:
                case 24:
                    View profilePremiumCell = new ProfilePremiumCell(this.mContext, i == 18 ? 0 : 1, ProfileActivity.this.resourcesProvider);
                    profilePremiumCell.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    shadowSectionCell = profilePremiumCell;
                    break;
                case 20:
                    View textCheckCell = new TextCheckCell(this.mContext, ProfileActivity.this.resourcesProvider);
                    textCheckCell.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    shadowSectionCell = textCheckCell;
                    break;
                case 21:
                    View profileLocationCell = new ProfileLocationCell(this.mContext, ProfileActivity.this.resourcesProvider);
                    profileLocationCell.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    shadowSectionCell = profileLocationCell;
                    break;
                case 22:
                    View view5 = new ProfileHoursCell(this.mContext, ProfileActivity.this.resourcesProvider) {
                        @Override
                        protected int processColor(int i2) {
                            return ProfileActivity.this.dontApplyPeerColor(i2, false);
                        }
                    };
                    view5.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    shadowSectionCell = view5;
                    break;
                case 23:
                    View view6 = new ProfileChannelCell(ProfileActivity.this) {
                        @Override
                        public int processColor(int i2) {
                            return ProfileActivity.this.dontApplyPeerColor(i2, false);
                        }
                    };
                    view6.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    shadowSectionCell = view6;
                    break;
                case 25:
                    FrameLayout frameLayout = new FrameLayout(this.mContext);
                    ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(this.mContext, ProfileActivity.this.resourcesProvider);
                    buttonWithCounterView.setRound();
                    buttonWithCounterView.setText(LocaleController.getString(R.string.ProfileBotOpenApp), false);
                    buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view7) {
                            this.f$0.lambda$onCreateViewHolder$0(view7);
                        }
                    });
                    frameLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                    frameLayout.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    shadowSectionCell = frameLayout;
                    break;
                case 26:
                    shadowSectionCell = new TextInfoPrivacyCell(this.mContext, ProfileActivity.this.resourcesProvider);
                    break;
                case 27:
                    View colorfulTextCell = new AffiliateProgramFragment.ColorfulTextCell(this.mContext, ProfileActivity.this.resourcesProvider);
                    colorfulTextCell.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    shadowSectionCell = colorfulTextCell;
                    break;
                case 28:
                    View view7 = new View(this.mContext) {
                        @Override
                        protected void onMeasure(int i2, int i3) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(7.33f), 1073741824));
                        }
                    };
                    view7.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    shadowSectionCell = view7;
                    break;
                case 29:
                    ProfileMusicView profileMusicView = new ProfileMusicView(this.mContext, ProfileActivity.this.resourcesProvider);
                    ProfileActivity.this.musicView = profileMusicView;
                    if (ProfileActivity.this.avatarsBlurView != null) {
                        ProfileActivity.this.avatarsBlurView.setMusicView(ProfileActivity.this.musicView);
                    }
                    profileMusicView.setColor(ProfileActivity.this.peerColor);
                    shadowSectionCell = profileMusicView;
                    if (ProfileActivity.this.userInfo != null) {
                        shadowSectionCell = profileMusicView;
                        if (ProfileActivity.this.userInfo.saved_music != null) {
                            profileMusicView.setMusicDocument(ProfileActivity.this.userInfo.saved_music);
                            shadowSectionCell = profileMusicView;
                            break;
                        }
                    }
                    break;
            }
            if (i != 13) {
                shadowSectionCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            }
            return new RecyclerListView.Holder(shadowSectionCell);
        }

        class AnonymousClass9 extends SettingsSuggestionCell {
            AnonymousClass9(Context context, Theme.ResourcesProvider resourcesProvider) {
                super(context, resourcesProvider);
            }

            @Override
            protected void onYesClick(final int i) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onYesClick$0(i);
                    }
                });
            }

            public void lambda$onYesClick$0(int i) {
                NotificationCenter notificationCenter = ProfileActivity.this.getNotificationCenter();
                ProfileActivity profileActivity = ProfileActivity.this;
                int i2 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity, i2);
                if (i == 2) {
                    ProfileActivity.this.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    Browser.openUrl(getContext(), ProfileActivity.this.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    ProfileActivity.this.getMessagesController().removeSuggestion(0L, i == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                ProfileActivity.this.getNotificationCenter().addObserver(ProfileActivity.this, i2);
                ProfileActivity.this.updateListAnimated(false);
            }

            @Override
            protected void onNoClick(int i) {
                if (i == 0) {
                    ProfileActivity.this.presentFragment(new ActionIntroActivity(3));
                } else {
                    ProfileActivity.this.presentFragment(new TwoStepVerificationSetupActivity(8, null));
                }
            }
        }

        public void lambda$onCreateViewHolder$0(View view) {
            TLRPC.User user = ProfileActivity.this.getMessagesController().getUser(Long.valueOf(ProfileActivity.this.userId));
            MessagesController messagesController = ProfileActivity.this.getMessagesController();
            ProfileActivity profileActivity = ProfileActivity.this;
            messagesController.openApp(profileActivity, user, null, profileActivity.getClassGuid(), null);
        }

        public void setBackground(View view, int i) {
            if (i != 8) {
                if (i == 14) {
                    view.setBackground(Theme.getThemedDrawable(ProfileActivity.this.getContext(), R.drawable.greydivider_bottom, ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundGrayShadow)));
                    return;
                } else if (i != 30 && i != 27 && i != 28) {
                    switch (i) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            break;
                        default:
                            switch (i) {
                            }
                    }
                }
            }
            view.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            ProfileActivity profileActivity = ProfileActivity.this;
            if (view == profileActivity.sharedMediaLayout) {
                profileActivity.sharedMediaLayoutAttached = true;
            }
            View view2 = viewHolder.itemView;
            if (view2 instanceof TextDetailCell) {
                ((TextDetailCell) view2).textView.setLoading(ProfileActivity.this.loadingSpan);
                ((TextDetailCell) viewHolder.itemView).valueTextView.setLoading(ProfileActivity.this.loadingSpan);
            }
        }

        @Override
        public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            ProfileActivity profileActivity = ProfileActivity.this;
            if (view == profileActivity.sharedMediaLayout) {
                profileActivity.sharedMediaLayoutAttached = false;
            }
        }

        @Override
        public void onBindViewHolder(final androidx.recyclerview.widget.RecyclerView.ViewHolder r30, final int r31) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.ListAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        public void lambda$onBindViewHolder$1(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getAdapterPosition() == i && ProfileActivity.this.birthdayRow == i && viewHolder.getItemViewType() == 2) {
                onBindViewHolder(viewHolder, i);
            }
        }

        public void lambda$onBindViewHolder$4(boolean z) {
            Browser.openUrl(ProfileActivity.this.getContext(), LocaleController.getString(z ? R.string.ProfileBotOpenAppInfoOwnerLink : R.string.ProfileBotOpenAppInfoLink));
        }

        public void lambda$onBindViewHolder$5(View view) {
            ProfileActivity.this.hoursShownMine = !r0.hoursShownMine;
            if (!ProfileActivity.this.hoursExpanded) {
                ProfileActivity.this.hoursExpanded = true;
            }
            ProfileActivity.this.saveScrollPosition();
            view.requestLayout();
            ProfileActivity.this.listAdapter.notifyItemChanged(ProfileActivity.this.bizHoursRow);
            ProfileActivity profileActivity = ProfileActivity.this;
            if (profileActivity.savedScrollPosition >= 0) {
                LinearLayoutManager linearLayoutManager = profileActivity.layoutManager;
                ProfileActivity profileActivity2 = ProfileActivity.this;
                linearLayoutManager.scrollToPositionWithOffset(profileActivity2.savedScrollPosition, profileActivity2.savedScrollOffset - profileActivity2.listView.getPaddingTop());
            }
        }

        private CharSequence alsoUsernamesString(String str, ArrayList arrayList, CharSequence charSequence) {
            if (arrayList == null) {
                return charSequence;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            int i = 0;
            while (i < arrayList2.size()) {
                if (!((TLRPC.TL_username) arrayList2.get(i)).active || (str != null && str.equals(((TLRPC.TL_username) arrayList2.get(i)).username))) {
                    arrayList2.remove(i);
                    i--;
                }
                i++;
            }
            CharSequence charSequence2 = charSequence;
            if (arrayList2.size() > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList2.get(i2);
                    SpannableString spannableString = new SpannableString("@" + tL_username.username);
                    spannableString.setSpan(makeUsernameLinkSpan(tL_username), 0, spannableString.length(), 33);
                    ProfileActivity profileActivity = ProfileActivity.this;
                    spannableString.setSpan(new ForegroundColorSpan(profileActivity.dontApplyPeerColor(profileActivity.getThemedColor(Theme.key_chat_messageLinkIn), false)), 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    if (i2 < arrayList2.size() - 1) {
                        spannableStringBuilder.append((CharSequence) ", ");
                    }
                }
                String string = LocaleController.getString(R.string.UsernameAlso);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string);
                int iIndexOf = string.indexOf("%1$s");
                charSequence2 = spannableStringBuilder2;
                if (iIndexOf >= 0) {
                    spannableStringBuilder2.replace(iIndexOf, iIndexOf + 4, (CharSequence) spannableStringBuilder);
                    charSequence2 = spannableStringBuilder2;
                }
            }
            return charSequence2;
        }

        public ClickableSpan makeUsernameLinkSpan(TLRPC.TL_username tL_username) {
            ClickableSpan clickableSpan = (ClickableSpan) this.usernameSpans.get(tL_username);
            if (clickableSpan != null) {
                return clickableSpan;
            }
            AnonymousClass12 anonymousClass12 = new AnonymousClass12(tL_username, tL_username.username);
            this.usernameSpans.put(tL_username, anonymousClass12);
            return anonymousClass12;
        }

        class AnonymousClass12 extends ClickableSpan {
            final TLRPC.TL_username val$usernameObj;
            final String val$usernameRaw;

            AnonymousClass12(TLRPC.TL_username tL_username, String str) {
                this.val$usernameObj = tL_username;
                this.val$usernameRaw = str;
            }

            @Override
            public void onClick(View view) {
                if (!this.val$usernameObj.editable) {
                    if (ProfileActivity.this.loadingSpan == this) {
                        return;
                    }
                    ProfileActivity.this.setLoadingSpan(this);
                    TL_fragment.TL_getCollectibleInfo tL_getCollectibleInfo = new TL_fragment.TL_getCollectibleInfo();
                    TL_fragment.TL_inputCollectibleUsername tL_inputCollectibleUsername = new TL_fragment.TL_inputCollectibleUsername();
                    tL_inputCollectibleUsername.username = this.val$usernameObj.username;
                    tL_getCollectibleInfo.collectible = tL_inputCollectibleUsername;
                    ConnectionsManager connectionsManager = ProfileActivity.this.getConnectionsManager();
                    final TLRPC.TL_username tL_username = this.val$usernameObj;
                    ProfileActivity.this.getConnectionsManager().bindRequestToGuid(connectionsManager.sendRequest(tL_getCollectibleInfo, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            this.f$0.lambda$onClick$1(tL_username, tLObject, tL_error);
                        }
                    }), ProfileActivity.this.getClassGuid());
                    return;
                }
                ProfileActivity.this.setLoadingSpan(null);
                String str = ProfileActivity.this.getMessagesController().linkPrefix + "/" + this.val$usernameRaw;
                if (ProfileActivity.this.currentChat == null || !ProfileActivity.this.currentChat.noforwards) {
                    AndroidUtilities.addToClipboard(str);
                    ProfileActivity.this.undoView.showWithAction(0L, 56, (Runnable) null);
                }
            }

            public void lambda$onClick$1(final TLRPC.TL_username tL_username, final TLObject tLObject, final TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onClick$0(tLObject, tL_username, tL_error);
                    }
                });
            }

            public void lambda$onClick$0(TLObject tLObject, TLRPC.TL_username tL_username, TLRPC.TL_error tL_error) {
                ProfileActivity.this.setLoadingSpan(null);
                if (tLObject instanceof TL_fragment.TL_collectibleInfo) {
                    TLObject user = ProfileActivity.this.userId != 0 ? ProfileActivity.this.getMessagesController().getUser(Long.valueOf(ProfileActivity.this.userId)) : ProfileActivity.this.getMessagesController().getChat(Long.valueOf(ProfileActivity.this.chatId));
                    if (ProfileActivity.this.getContext() == null) {
                        return;
                    }
                    FragmentUsernameBottomSheet.open(ProfileActivity.this.getContext(), 0, tL_username.username, user, (TL_fragment.TL_collectibleInfo) tLObject, ProfileActivity.this.getResourceProvider());
                    return;
                }
                BulletinFactory.showError(tL_error);
            }

            @Override
            public void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
                textPaint.setColor(textPaint.linkColor);
            }
        }

        @Override
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getAdapterPosition() == ProfileActivity.this.setAvatarRow) {
                ProfileActivity.this.setAvatarCell = null;
            }
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            if (ProfileActivity.this.notificationRow != -1) {
                int adapterPosition = viewHolder.getAdapterPosition();
                if (adapterPosition == ProfileActivity.this.notificationRow || adapterPosition == ProfileActivity.this.numberRow || adapterPosition == ProfileActivity.this.privacyRow || adapterPosition == ProfileActivity.this.languageRow || adapterPosition == ProfileActivity.this.setUsernameRow || adapterPosition == ProfileActivity.this.bioRow || adapterPosition == ProfileActivity.this.versionRow || adapterPosition == ProfileActivity.this.dataRow || adapterPosition == ProfileActivity.this.chatRow || adapterPosition == ProfileActivity.this.questionRow || adapterPosition == ProfileActivity.this.devicesRow || adapterPosition == ProfileActivity.this.filtersRow || adapterPosition == ProfileActivity.this.stickersRow || adapterPosition == ProfileActivity.this.faqRow || adapterPosition == ProfileActivity.this.policyRow || adapterPosition == ProfileActivity.this.sendLogsRow || adapterPosition == ProfileActivity.this.sendLastLogsRow || adapterPosition == ProfileActivity.this.clearLogsRow || adapterPosition == ProfileActivity.this.switchBackendRow || adapterPosition == ProfileActivity.this.setAvatarRow || adapterPosition == ProfileActivity.this.addToGroupButtonRow || adapterPosition == ProfileActivity.this.premiumRow || adapterPosition == ProfileActivity.this.premiumGiftingRow || adapterPosition == ProfileActivity.this.businessRow || adapterPosition == ProfileActivity.this.liteModeRow) {
                    return true;
                }
                ProfileActivity profileActivity = ProfileActivity.this;
                return adapterPosition == profileActivity.birthdayRow || adapterPosition == profileActivity.channelRow || adapterPosition == ProfileActivity.this.starsRow || adapterPosition == ProfileActivity.this.tonRow || adapterPosition == ProfileActivity.this.musicRow;
            }
            View view = viewHolder.itemView;
            if (view instanceof UserCell) {
                Object currentObject = ((UserCell) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && UserObject.isUserSelf((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int itemViewType = viewHolder.getItemViewType();
            return (itemViewType == 1 || itemViewType == 5 || itemViewType == 7 || itemViewType == 11 || itemViewType == 28 || itemViewType == 12 || itemViewType == 13 || itemViewType == 9 || itemViewType == 10 || itemViewType == 25) ? false : true;
        }

        @Override
        public int getItemCount() {
            return ProfileActivity.this.rowCount;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == ProfileActivity.this.infoHeaderRow || i == ProfileActivity.this.membersHeaderRow || i == ProfileActivity.this.settingsSectionRow2 || i == ProfileActivity.this.numberSectionRow || i == ProfileActivity.this.helpHeaderRow || i == ProfileActivity.this.debugHeaderRow || i == ProfileActivity.this.botPermissionsHeader) {
                return 1;
            }
            if (i == ProfileActivity.this.phoneRow || i == ProfileActivity.this.locationRow || i == ProfileActivity.this.numberRow) {
                return 2;
            }
            ProfileActivity profileActivity = ProfileActivity.this;
            if (i == profileActivity.birthdayRow) {
                return 2;
            }
            if (i == profileActivity.usernameRow || i == ProfileActivity.this.setUsernameRow) {
                return 19;
            }
            if (i == ProfileActivity.this.noteRow) {
                return 30;
            }
            if (i == ProfileActivity.this.userInfoRow || i == ProfileActivity.this.channelInfoRow || i == ProfileActivity.this.bioRow) {
                return 3;
            }
            if (i == ProfileActivity.this.settingsTimerRow || i == ProfileActivity.this.settingsKeyRow || i == ProfileActivity.this.reportRow || i == ProfileActivity.this.reportReactionRow || i == ProfileActivity.this.subscribersRow || i == ProfileActivity.this.subscribersRequestsRow || i == ProfileActivity.this.administratorsRow || i == ProfileActivity.this.settingsRow || i == ProfileActivity.this.blockedUsersRow || i == ProfileActivity.this.addMemberRow || i == ProfileActivity.this.joinRow || i == ProfileActivity.this.unblockRow || i == ProfileActivity.this.sendMessageRow || i == ProfileActivity.this.notificationRow || i == ProfileActivity.this.privacyRow || i == ProfileActivity.this.languageRow || i == ProfileActivity.this.dataRow || i == ProfileActivity.this.chatRow || i == ProfileActivity.this.questionRow || i == ProfileActivity.this.devicesRow || i == ProfileActivity.this.filtersRow || i == ProfileActivity.this.stickersRow || i == ProfileActivity.this.faqRow || i == ProfileActivity.this.policyRow || i == ProfileActivity.this.sendLogsRow || i == ProfileActivity.this.sendLastLogsRow || i == ProfileActivity.this.clearLogsRow || i == ProfileActivity.this.switchBackendRow || i == ProfileActivity.this.setAvatarRow || i == ProfileActivity.this.addToGroupButtonRow || i == ProfileActivity.this.addToContactsRow || i == ProfileActivity.this.liteModeRow || i == ProfileActivity.this.premiumGiftingRow || i == ProfileActivity.this.businessRow || i == ProfileActivity.this.botStarsBalanceRow || i == ProfileActivity.this.botTonBalanceRow || i == ProfileActivity.this.channelBalanceRow || i == ProfileActivity.this.botPermissionLocation || i == ProfileActivity.this.botPermissionBiometry || i == ProfileActivity.this.botPermissionEmojiStatus || i == ProfileActivity.this.tonRow) {
                return 4;
            }
            if (i == ProfileActivity.this.notificationsDividerRow) {
                return 5;
            }
            if (i == ProfileActivity.this.notificationsRow) {
                return 6;
            }
            if (i == ProfileActivity.this.notificationsSimpleRow) {
                return 20;
            }
            if (i == ProfileActivity.this.lastSectionRow || i == ProfileActivity.this.membersSectionRow || i == ProfileActivity.this.secretSettingsSectionRow || i == ProfileActivity.this.settingsSectionRow || i == ProfileActivity.this.devicesSectionRow || i == ProfileActivity.this.helpSectionCell || i == ProfileActivity.this.setAvatarSectionRow || i == ProfileActivity.this.passwordSuggestionSectionRow || i == ProfileActivity.this.phoneSuggestionSectionRow || i == ProfileActivity.this.premiumSectionsRow || i == ProfileActivity.this.reportDividerRow || i == ProfileActivity.this.channelDividerRow || i == ProfileActivity.this.graceSuggestionSectionRow || i == ProfileActivity.this.balanceDividerRow || i == ProfileActivity.this.botPermissionsDivider || i == ProfileActivity.this.channelBalanceSectionRow) {
                return 7;
            }
            if (i >= ProfileActivity.this.membersStartRow && i < ProfileActivity.this.membersEndRow) {
                return 8;
            }
            if (i == ProfileActivity.this.emptyRow) {
                return 11;
            }
            if (i == ProfileActivity.this.bottomPaddingRow) {
                return 12;
            }
            if (i == ProfileActivity.this.sharedMediaRow) {
                return 13;
            }
            if (i == ProfileActivity.this.versionRow) {
                return 14;
            }
            if (i == ProfileActivity.this.passwordSuggestionRow || i == ProfileActivity.this.phoneSuggestionRow || i == ProfileActivity.this.graceSuggestionRow) {
                return 15;
            }
            if (i == ProfileActivity.this.addToGroupInfoRow) {
                return 17;
            }
            if (i == ProfileActivity.this.premiumRow) {
                return 18;
            }
            if (i == ProfileActivity.this.starsRow) {
                return 24;
            }
            if (i == ProfileActivity.this.bizLocationRow) {
                return 21;
            }
            if (i == ProfileActivity.this.bizHoursRow) {
                return 22;
            }
            if (i == ProfileActivity.this.channelRow) {
                return 23;
            }
            if (i == ProfileActivity.this.botAppRow) {
                return 25;
            }
            if (i == ProfileActivity.this.infoSectionRow || i == ProfileActivity.this.infoAffiliateRow) {
                return 26;
            }
            if (i == ProfileActivity.this.affiliateRow) {
                return 27;
            }
            if (i == ProfileActivity.this.infoHeaderRowEmpty || i == ProfileActivity.this.infoEndRowEmpty) {
                return 28;
            }
            return i == ProfileActivity.this.musicRow ? 29 : 0;
        }
    }

    public static class SearchAdapter extends RecyclerListView.SelectionAdapter {
        private final int currentAccount;
        public TLRPC.WebPage faqWebPage;
        private final BaseFragment fragment;
        private String lastSearchString;
        private boolean loadingFaqPage;
        private final Context mContext;
        private SearchResult[] searchArray;
        private Runnable searchRunnable;
        private boolean searchWas;
        private ArrayList faqSearchArray = new ArrayList();
        private ArrayList resultNames = new ArrayList();
        private ArrayList searchResults = new ArrayList();
        private ArrayList faqSearchResults = new ArrayList();
        private ArrayList recentSearches = new ArrayList();

        public static class SearchResult {
            public int guid;
            public int iconResId;
            public int num;
            public Runnable openRunnable;
            public String[] path;
            public String rowName;
            public String searchTitle;

            public SearchResult(int i, String str, int i2, Runnable runnable) {
                this(i, str, null, null, null, i2, runnable);
            }

            public SearchResult(int i, String str, String str2, int i2, Runnable runnable) {
                this(i, str, null, str2, null, i2, runnable);
            }

            public SearchResult(int i, String str, String str2, String str3, int i2, Runnable runnable) {
                this(i, str, str2, str3, null, i2, runnable);
            }

            public SearchResult(int i, String str, String str2, String str3, String str4, int i2, Runnable runnable) {
                this.guid = i;
                this.searchTitle = str;
                this.rowName = str2;
                this.openRunnable = runnable;
                this.iconResId = i2;
                if (str3 != null && str4 != null) {
                    this.path = new String[]{str3, str4};
                } else if (str3 != null) {
                    this.path = new String[]{str3};
                }
            }

            public boolean equals(Object obj) {
                return (obj instanceof SearchResult) && this.guid == ((SearchResult) obj).guid;
            }

            public String toString() {
                SerializedData serializedData = new SerializedData();
                serializedData.writeInt32(this.num);
                serializedData.writeInt32(1);
                serializedData.writeInt32(this.guid);
                return Utilities.bytesToHex(serializedData.toByteArray());
            }

            public void open(INavigationLayout iNavigationLayout) {
                this.openRunnable.run();
                AndroidUtilities.scrollToFragmentRow(iNavigationLayout, this.rowName);
            }
        }

        public SearchAdapter(BaseFragment baseFragment, Context context) {
            this.fragment = baseFragment;
            this.currentAccount = baseFragment.getCurrentAccount();
            this.mContext = context;
            this.searchArray = onCreateSearchArray(baseFragment);
            updateSearchArray();
        }

        public void updateSearchArray() {
            String[] strArr;
            SearchResult searchResult;
            HashMap map = new HashMap();
            int i = 0;
            while (true) {
                SearchResult[] searchResultArr = this.searchArray;
                if (i >= searchResultArr.length) {
                    break;
                }
                SearchResult searchResult2 = searchResultArr[i];
                if (searchResult2 != null) {
                    map.put(Integer.valueOf(searchResult2.guid), this.searchArray[i]);
                }
                i++;
            }
            Set<String> stringSet = MessagesController.getGlobalMainSettings().getStringSet("settingsSearchRecent2", null);
            if (stringSet != null) {
                Iterator<String> it = stringSet.iterator();
                while (it.hasNext()) {
                    try {
                        SerializedData serializedData = new SerializedData(Utilities.hexToBytes(it.next()));
                        int int32 = serializedData.readInt32(false);
                        int int322 = serializedData.readInt32(false);
                        if (int322 == 0) {
                            String string = serializedData.readString(false);
                            int int323 = serializedData.readInt32(false);
                            if (int323 > 0) {
                                strArr = new String[int323];
                                for (int i2 = 0; i2 < int323; i2++) {
                                    strArr[i2] = serializedData.readString(false);
                                }
                            } else {
                                strArr = null;
                            }
                            MessagesController.FaqSearchResult faqSearchResult = new MessagesController.FaqSearchResult(string, strArr, serializedData.readString(false));
                            faqSearchResult.num = int32;
                            this.recentSearches.add(faqSearchResult);
                        } else if (int322 == 1 && (searchResult = (SearchResult) map.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                            searchResult.num = int32;
                            this.recentSearches.add(searchResult);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            Collections.sort(this.recentSearches, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return this.f$0.lambda$updateSearchArray$0(obj, obj2);
                }
            });
        }

        public int lambda$updateSearchArray$0(Object obj, Object obj2) {
            int num = getNum(obj);
            int num2 = getNum(obj2);
            if (num < num2) {
                return -1;
            }
            return num > num2 ? 1 : 0;
        }

        public static SearchResult[] onCreateSearchArray(final BaseFragment baseFragment) {
            SearchResult searchResult;
            SearchResult searchResult2;
            SearchResult searchResult3;
            SearchResult searchResult4;
            SearchResult searchResult5;
            SearchResult searchResult6;
            SearchResult searchResult7;
            SearchResult searchResult8;
            SearchResult searchResult9;
            SearchResult searchResult10;
            SearchResult searchResult11;
            SearchResult searchResult12;
            SearchResult searchResult13;
            SearchResult searchResult14;
            SearchResult searchResult15;
            SearchResult searchResult16;
            SearchResult searchResult17;
            SearchResult searchResult18;
            SearchResult searchResult19;
            SearchResult searchResult20;
            SearchResult searchResult21;
            SearchResult searchResult22;
            SearchResult searchResult23;
            SearchResult searchResult24;
            SearchResult searchResult25;
            SearchResult searchResult26;
            SearchResult searchResult27;
            final int currentAccount = baseFragment.getCurrentAccount();
            final Theme.ResourcesProvider resourceProvider = baseFragment.getResourceProvider();
            SearchResult searchResult28 = new SearchResult(500, LocaleController.getString(R.string.EditName), 0, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$1(baseFragment, resourceProvider);
                }
            });
            SearchResult searchResult29 = new SearchResult(501, LocaleController.getString(R.string.ChangePhoneNumber), 0, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$2(baseFragment);
                }
            });
            SearchResult searchResult30 = new SearchResult(502, LocaleController.getString(R.string.AddAnotherAccount), 0, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$3(baseFragment);
                }
            });
            int i = R.string.NotificationsAndSounds;
            String string = LocaleController.getString(i);
            int i2 = R.drawable.msg_notifications;
            SearchResult searchResult31 = new SearchResult(1, string, i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$4(baseFragment);
                }
            });
            SearchResult searchResult32 = new SearchResult(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(i), i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$5(baseFragment);
                }
            });
            SearchResult searchResult33 = new SearchResult(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(i), i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$6(baseFragment);
                }
            });
            SearchResult searchResult34 = new SearchResult(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(i), i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$7(baseFragment);
                }
            });
            SearchResult searchResult35 = new SearchResult(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(i), i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$8(baseFragment);
                }
            });
            SearchResult searchResult36 = new SearchResult(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(i), i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$9(baseFragment);
                }
            });
            SearchResult searchResult37 = new SearchResult(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(i), i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$10(baseFragment);
                }
            });
            SearchResult searchResult38 = new SearchResult(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(i), i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$11(baseFragment);
                }
            });
            SearchResult searchResult39 = new SearchResult(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(i), i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$12(baseFragment);
                }
            });
            SearchResult searchResult40 = new SearchResult(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(i), i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$13(baseFragment);
                }
            });
            SearchResult searchResult41 = new SearchResult(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(i), i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$14(baseFragment);
                }
            });
            SearchResult searchResult42 = new SearchResult(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(i), i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$15(baseFragment);
                }
            });
            SearchResult searchResult43 = new SearchResult(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(i), i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$16(baseFragment);
                }
            });
            int i3 = R.string.PrivacySettings;
            String string2 = LocaleController.getString(i3);
            int i4 = R.drawable.msg_secret;
            SearchResult searchResult44 = new SearchResult(100, string2, i4, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$17(baseFragment);
                }
            });
            String string3 = LocaleController.getString(R.string.TwoStepVerification);
            String string4 = LocaleController.getString(i3);
            int i5 = R.drawable.msg2_secret;
            SearchResult searchResult45 = new SearchResult(109, string3, string4, i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$18(baseFragment);
                }
            });
            SearchResult searchResult46 = new SearchResult(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(i3), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$19(currentAccount, baseFragment);
                }
            });
            SearchResult searchResult47 = new SearchResult(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(i3), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$20(baseFragment);
                }
            });
            if (SharedConfig.hasEmailLogin) {
                searchResult = searchResult47;
                searchResult2 = new SearchResult(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(i3), i5, new Runnable() {
                    @Override
                    public final void run() {
                        ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$21(baseFragment);
                    }
                });
            } else {
                searchResult = searchResult47;
                searchResult2 = null;
            }
            SearchResult searchResult48 = searchResult2;
            SearchResult searchResult49 = new SearchResult(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(i3), i4, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$22(baseFragment);
                }
            });
            SearchResult searchResult50 = new SearchResult(110, LocaleController.getString(R.string.SessionsTitle), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$23(baseFragment);
                }
            });
            SearchResult searchResult51 = new SearchResult(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(i3), i4, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$24(baseFragment);
                }
            });
            SearchResult searchResult52 = new SearchResult(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(i3), i4, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$25(baseFragment);
                }
            });
            SearchResult searchResult53 = new SearchResult(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(i3), i4, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$26(baseFragment);
                }
            });
            SearchResult searchResult54 = new SearchResult(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(i3), i4, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$27(baseFragment);
                }
            });
            SearchResult searchResult55 = new SearchResult(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(i3), i4, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$28(baseFragment);
                }
            });
            int i6 = R.string.Calls;
            SearchResult searchResult56 = new SearchResult(106, LocaleController.getString(i6), LocaleController.getString(i3), i4, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$29(baseFragment);
                }
            });
            SearchResult searchResult57 = new SearchResult(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(i3), i4, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$30(baseFragment);
                }
            });
            SearchResult searchResult58 = new SearchResult(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(i3), i4, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$31(currentAccount, baseFragment);
                }
            });
            SearchResult searchResult59 = MessagesController.getInstance(currentAccount).autoarchiveAvailable ? new SearchResult(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(i3), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$32(baseFragment);
                }
            }) : null;
            SearchResult searchResult60 = new SearchResult(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(i3), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$33(baseFragment);
                }
            });
            SearchResult searchResult61 = new SearchResult(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(i3), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$34(baseFragment);
                }
            });
            SearchResult searchResult62 = new SearchResult(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(i3), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$35(baseFragment);
                }
            });
            SearchResult searchResult63 = new SearchResult(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(i3), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$36(baseFragment);
                }
            });
            SearchResult searchResult64 = new SearchResult(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(i3), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$37(baseFragment);
                }
            });
            SearchResult searchResult65 = new SearchResult(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(i3), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$38(baseFragment);
                }
            });
            SearchResult searchResult66 = new SearchResult(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(i3), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$39(baseFragment);
                }
            });
            SearchResult searchResult67 = new SearchResult(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(i3), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$40(baseFragment);
                }
            });
            int i7 = R.string.Devices;
            String string5 = LocaleController.getString(i7);
            int i8 = R.drawable.msg2_devices;
            SearchResult searchResult68 = new SearchResult(120, string5, i8, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$41(baseFragment);
                }
            });
            SearchResult searchResult69 = new SearchResult(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(i7), i8, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$42(baseFragment);
                }
            });
            SearchResult searchResult70 = new SearchResult(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(i7), i8, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$43(baseFragment);
                }
            });
            int i9 = R.string.DataSettings;
            String string6 = LocaleController.getString(i9);
            int i10 = R.drawable.msg2_data;
            SearchResult searchResult71 = new SearchResult(200, string6, i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$44(baseFragment);
                }
            });
            SearchResult searchResult72 = new SearchResult(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$45(baseFragment);
                }
            });
            int i11 = R.string.StorageUsage;
            SearchResult searchResult73 = new SearchResult(202, LocaleController.getString(i11), LocaleController.getString(i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$46(baseFragment);
                }
            });
            SearchResult searchResult74 = new SearchResult(203, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(i9), LocaleController.getString(i11), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$47(baseFragment);
                }
            });
            SearchResult searchResult75 = new SearchResult(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(i9), LocaleController.getString(i11), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$48(baseFragment);
                }
            });
            SearchResult searchResult76 = new SearchResult(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(i9), LocaleController.getString(i11), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$49(baseFragment);
                }
            });
            SearchResult searchResult77 = new SearchResult(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$50(baseFragment);
                }
            });
            SearchResult searchResult78 = new SearchResult(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$51(baseFragment);
                }
            });
            SearchResult searchResult79 = new SearchResult(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$52(baseFragment);
                }
            });
            SearchResult searchResult80 = new SearchResult(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$53(baseFragment);
                }
            });
            SearchResult searchResult81 = new SearchResult(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$54(baseFragment);
                }
            });
            SearchResult searchResult82 = new SearchResult(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$55(baseFragment);
                }
            });
            SearchResult searchResult83 = new SearchResult(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$56(baseFragment);
                }
            });
            SearchResult searchResult84 = new SearchResult(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$57(baseFragment);
                }
            });
            SearchResult searchResult85 = new SearchResult(217, LocaleController.getString(i6), "callsSectionRow", LocaleController.getString(i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$58(baseFragment);
                }
            });
            SearchResult searchResult86 = new SearchResult(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$59(baseFragment);
                }
            });
            SearchResult searchResult87 = new SearchResult(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$60(baseFragment);
                }
            });
            int i12 = R.string.ProxySettings;
            SearchResult searchResult88 = new SearchResult(220, LocaleController.getString(i12), LocaleController.getString(i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$61(baseFragment);
                }
            });
            SearchResult searchResult89 = new SearchResult(221, LocaleController.getString(R.string.UseProxyForCalls), "callsRow", LocaleController.getString(i9), LocaleController.getString(i12), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$62(baseFragment);
                }
            });
            SearchResult searchResult90 = new SearchResult(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$63(baseFragment);
                }
            });
            int i13 = R.string.SaveToGallery;
            SearchResult searchResult91 = new SearchResult(222, LocaleController.getString(i13), "saveToGallerySectionRow", LocaleController.getString(i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$64(baseFragment);
                }
            });
            SearchResult searchResult92 = new SearchResult(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(i9), LocaleController.getString(i13), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$65(baseFragment);
                }
            });
            SearchResult searchResult93 = new SearchResult(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(i9), LocaleController.getString(i13), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$66(baseFragment);
                }
            });
            SearchResult searchResult94 = new SearchResult(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(i9), LocaleController.getString(i13), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$67(baseFragment);
                }
            });
            int i14 = R.string.ChatSettings;
            String string7 = LocaleController.getString(i14);
            int i15 = R.drawable.msg2_discussion;
            SearchResult searchResult95 = new SearchResult(300, string7, i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$68(baseFragment);
                }
            });
            SearchResult searchResult96 = new SearchResult(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$69(baseFragment);
                }
            });
            SearchResult searchResult97 = new SearchResult(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$70(baseFragment);
                }
            });
            String string8 = LocaleController.getString(R.string.SetColor);
            String string9 = LocaleController.getString(i14);
            int i16 = R.string.ChatBackground;
            SearchResult searchResult98 = new SearchResult(303, string8, null, string9, LocaleController.getString(i16), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$71(baseFragment);
                }
            });
            SearchResult searchResult99 = new SearchResult(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(i14), LocaleController.getString(i16), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$72(baseFragment);
                }
            });
            SearchResult searchResult100 = new SearchResult(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$73(baseFragment);
                }
            });
            int i17 = R.string.BrowseThemes;
            SearchResult searchResult101 = new SearchResult(319, LocaleController.getString(i17), null, LocaleController.getString(i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$74(baseFragment);
                }
            });
            SearchResult searchResult102 = new SearchResult(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(i14), LocaleController.getString(i17), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$75(baseFragment);
                }
            });
            SearchResult searchResult103 = new SearchResult(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$76(baseFragment);
                }
            });
            SearchResult searchResult104 = new SearchResult(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$77(baseFragment);
                }
            });
            SearchResult searchResult105 = new SearchResult(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$78(baseFragment);
                }
            });
            SearchResult searchResult106 = new SearchResult(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$79(baseFragment);
                }
            });
            SearchResult searchResult107 = new SearchResult(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$80(baseFragment);
                }
            });
            SearchResult searchResult108 = new SearchResult(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$81(baseFragment);
                }
            });
            SearchResult searchResult109 = new SearchResult(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$82(baseFragment);
                }
            });
            SearchResult searchResult110 = new SearchResult(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$83(baseFragment);
                }
            });
            SearchResult searchResult111 = new SearchResult(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$84(baseFragment);
                }
            });
            SearchResult searchResult112 = new SearchResult(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$85(baseFragment);
                }
            });
            SearchResult searchResult113 = new SearchResult(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$86(baseFragment);
                }
            });
            SearchResult searchResult114 = new SearchResult(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$87(baseFragment);
                }
            });
            SearchResult searchResult115 = new SearchResult(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$88(baseFragment);
                }
            });
            int i18 = R.string.StickersName;
            String string10 = LocaleController.getString(i18);
            int i19 = R.drawable.msg2_sticker;
            SearchResult searchResult116 = new SearchResult(600, string10, i19, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$89(baseFragment);
                }
            });
            SearchResult searchResult117 = new SearchResult(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(i18), i19, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$90(baseFragment);
                }
            });
            SearchResult searchResult118 = new SearchResult(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(i18), i19, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$91(baseFragment);
                }
            });
            SearchResult searchResult119 = new SearchResult(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(i18), i19, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$92(baseFragment);
                }
            });
            SearchResult searchResult120 = new SearchResult(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(i18), i19, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$93(baseFragment);
                }
            });
            SearchResult searchResult121 = new SearchResult(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(i18), i19, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$94(baseFragment);
                }
            });
            SearchResult searchResult122 = new SearchResult(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(i18), i19, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$95(baseFragment);
                }
            });
            SearchResult searchResult123 = new SearchResult(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(i18), i19, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$96(baseFragment);
                }
            });
            int i20 = R.string.Emoji;
            String string11 = LocaleController.getString(i20);
            String string12 = LocaleController.getString(i18);
            int i21 = R.drawable.input_smile;
            SearchResult searchResult124 = new SearchResult(608, string11, null, string12, i21, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$97(baseFragment);
                }
            });
            SearchResult searchResult125 = new SearchResult(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(i18), LocaleController.getString(i20), i21, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$98(baseFragment);
                }
            });
            SearchResult searchResult126 = new SearchResult(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(i18), LocaleController.getString(i20), i21, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$99(baseFragment);
                }
            });
            SearchResult searchResult127 = new SearchResult(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(i18), i19, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$100(baseFragment);
                }
            });
            int i22 = R.string.Filters;
            String string13 = LocaleController.getString(i22);
            int i23 = R.drawable.msg2_folder;
            SearchResult searchResult128 = new SearchResult(700, string13, null, i23, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$101(baseFragment);
                }
            });
            SearchResult searchResult129 = new SearchResult(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(i22), i23, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$102(baseFragment);
                }
            });
            if (isPremiumFeatureAvailable(currentAccount, -1)) {
                searchResult5 = searchResult129;
                searchResult6 = searchResult128;
                searchResult4 = searchResult126;
                searchResult3 = searchResult117;
                searchResult7 = new SearchResult(800, LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                    @Override
                    public final void run() {
                        ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$103(baseFragment);
                    }
                });
            } else {
                searchResult3 = searchResult117;
                searchResult4 = searchResult126;
                searchResult5 = searchResult129;
                searchResult6 = searchResult128;
                searchResult7 = null;
            }
            SearchResult searchResult130 = isPremiumFeatureAvailable(currentAccount, 0) ? new SearchResult(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$104(baseFragment);
                }
            }) : null;
            SearchResult searchResult131 = isPremiumFeatureAvailable(currentAccount, 11) ? new SearchResult(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$105(baseFragment);
                }
            }) : null;
            SearchResult searchResult132 = isPremiumFeatureAvailable(currentAccount, 1) ? new SearchResult(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$106(baseFragment);
                }
            }) : null;
            if (isPremiumFeatureAvailable(currentAccount, 2)) {
                searchResult8 = searchResult132;
                searchResult9 = new SearchResult(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                    @Override
                    public final void run() {
                        ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$107(baseFragment);
                    }
                });
            } else {
                searchResult8 = searchResult132;
                searchResult9 = null;
            }
            if (isPremiumFeatureAvailable(currentAccount, 8)) {
                searchResult10 = searchResult9;
                searchResult11 = new SearchResult(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                    @Override
                    public final void run() {
                        ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$108(baseFragment);
                    }
                });
            } else {
                searchResult10 = searchResult9;
                searchResult11 = null;
            }
            if (isPremiumFeatureAvailable(currentAccount, 3)) {
                searchResult12 = searchResult11;
                searchResult13 = new SearchResult(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                    @Override
                    public final void run() {
                        ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$109(baseFragment);
                    }
                });
            } else {
                searchResult12 = searchResult11;
                searchResult13 = null;
            }
            if (isPremiumFeatureAvailable(currentAccount, 4)) {
                searchResult14 = searchResult13;
                searchResult15 = new SearchResult(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                    @Override
                    public final void run() {
                        ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$110(baseFragment);
                    }
                });
            } else {
                searchResult14 = searchResult13;
                searchResult15 = null;
            }
            if (isPremiumFeatureAvailable(currentAccount, 5)) {
                searchResult16 = searchResult15;
                searchResult17 = new SearchResult(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                    @Override
                    public final void run() {
                        ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$111(baseFragment);
                    }
                });
            } else {
                searchResult16 = searchResult15;
                searchResult17 = null;
            }
            if (isPremiumFeatureAvailable(currentAccount, 9)) {
                searchResult18 = searchResult17;
                searchResult19 = new SearchResult(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                    @Override
                    public final void run() {
                        ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$112(baseFragment);
                    }
                });
            } else {
                searchResult18 = searchResult17;
                searchResult19 = null;
            }
            if (isPremiumFeatureAvailable(currentAccount, 6)) {
                searchResult20 = searchResult19;
                searchResult21 = new SearchResult(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                    @Override
                    public final void run() {
                        ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$113(baseFragment);
                    }
                });
            } else {
                searchResult20 = searchResult19;
                searchResult21 = null;
            }
            if (isPremiumFeatureAvailable(currentAccount, 7)) {
                searchResult22 = searchResult21;
                searchResult23 = new SearchResult(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                    @Override
                    public final void run() {
                        ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$114(baseFragment);
                    }
                });
            } else {
                searchResult22 = searchResult21;
                searchResult23 = null;
            }
            if (isPremiumFeatureAvailable(currentAccount, 10)) {
                searchResult24 = searchResult23;
                searchResult25 = new SearchResult(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                    @Override
                    public final void run() {
                        ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$115(baseFragment);
                    }
                });
            } else {
                searchResult24 = searchResult23;
                searchResult25 = null;
            }
            if (isPremiumFeatureAvailable(currentAccount, 12)) {
                searchResult26 = searchResult25;
                searchResult27 = new SearchResult(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                    @Override
                    public final void run() {
                        ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$116(baseFragment);
                    }
                });
            } else {
                searchResult26 = searchResult25;
                searchResult27 = null;
            }
            int i24 = R.string.PowerUsage;
            String string14 = LocaleController.getString(i24);
            int i25 = R.drawable.msg2_battery;
            SearchResult searchResult133 = searchResult27;
            SearchResult searchResult134 = new SearchResult(900, string14, null, i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$117(baseFragment);
                }
            });
            int i26 = R.string.LiteOptionsStickers;
            SearchResult searchResult135 = new SearchResult(901, LocaleController.getString(i26), LocaleController.getString(i24), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$118(baseFragment);
                }
            });
            int i27 = R.string.LiteOptionsAutoplayKeyboard;
            SearchResult searchResult136 = new SearchResult(902, LocaleController.getString(i27), null, LocaleController.getString(i24), LocaleController.getString(i26), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$119(baseFragment);
                }
            });
            int i28 = R.string.LiteOptionsAutoplayChat;
            SearchResult searchResult137 = new SearchResult(903, LocaleController.getString(i28), null, LocaleController.getString(i24), LocaleController.getString(i26), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$120(baseFragment);
                }
            });
            int i29 = R.string.LiteOptionsEmoji;
            SearchResult searchResult138 = new SearchResult(904, LocaleController.getString(i29), LocaleController.getString(i24), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$121(baseFragment);
                }
            });
            SearchResult searchResult139 = new SearchResult(905, LocaleController.getString(i27), null, LocaleController.getString(i24), LocaleController.getString(i29), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$122(baseFragment);
                }
            });
            SearchResult searchResult140 = new SearchResult(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(i24), LocaleController.getString(i29), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$123(baseFragment);
                }
            });
            SearchResult searchResult141 = new SearchResult(907, LocaleController.getString(i28), null, LocaleController.getString(i24), LocaleController.getString(i29), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$124(baseFragment);
                }
            });
            int i30 = R.string.LiteOptionsChat;
            SearchResult searchResult142 = new SearchResult(908, LocaleController.getString(i30), LocaleController.getString(i24), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$125(baseFragment);
                }
            });
            SearchResult searchResult143 = new SearchResult(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(i24), LocaleController.getString(i30), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$126(baseFragment);
                }
            });
            SearchResult searchResult144 = new SearchResult(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(i24), LocaleController.getString(i30), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$127(baseFragment);
                }
            });
            SearchResult searchResult145 = new SearchResult(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(i24), LocaleController.getString(i30), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$128(baseFragment);
                }
            });
            SearchResult searchResult146 = SharedConfig.getDevicePerformanceClass() >= 1 ? new SearchResult(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(i24), LocaleController.getString(i30), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$129(baseFragment);
                }
            }) : null;
            String string15 = LocaleController.getString(R.string.LiteOptionsScale);
            String string16 = LocaleController.getString(i24);
            String string17 = LocaleController.getString(i30);
            SearchResult searchResult147 = searchResult146;
            SearchResult searchResult148 = new SearchResult(912, string15, null, string16, string17, i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$130(baseFragment);
                }
            });
            SearchResult searchResult149 = new SearchResult(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(i24), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$131(baseFragment);
                }
            });
            SearchResult searchResult150 = new SearchResult(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(i24), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$132(baseFragment);
                }
            });
            SearchResult searchResult151 = new SearchResult(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(i24), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$133(baseFragment);
                }
            });
            SearchResult searchResult152 = new SearchResult(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(i24), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$134(baseFragment);
                }
            });
            int i31 = R.string.Language;
            String string18 = LocaleController.getString(i31);
            SearchResult searchResult153 = searchResult131;
            int i32 = R.drawable.msg2_language;
            SearchResult searchResult154 = searchResult130;
            SearchResult searchResult155 = searchResult7;
            SearchResult searchResult156 = new SearchResult(400, string18, i32, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$135(baseFragment);
                }
            });
            SearchResult searchResult157 = new SearchResult(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(i31), i32, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$136(baseFragment);
                }
            });
            SearchResult searchResult158 = MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled() ? new SearchResult(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(i31), i32, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$137(baseFragment);
                }
            }) : null;
            String string19 = LocaleController.getString(R.string.AskAQuestion);
            int i33 = R.string.SettingsHelp;
            String string20 = LocaleController.getString(i33);
            int i34 = R.drawable.msg2_help;
            return new SearchResult[]{searchResult28, searchResult29, searchResult30, searchResult31, searchResult32, searchResult33, searchResult34, searchResult35, searchResult36, searchResult37, searchResult38, searchResult39, searchResult40, searchResult41, searchResult42, searchResult43, searchResult44, searchResult45, searchResult46, searchResult, searchResult48, searchResult49, searchResult50, searchResult51, searchResult52, searchResult53, searchResult54, searchResult55, searchResult56, searchResult57, searchResult58, searchResult59, searchResult60, searchResult61, searchResult62, searchResult63, searchResult64, searchResult65, searchResult66, searchResult67, searchResult68, searchResult69, searchResult70, searchResult71, searchResult72, searchResult73, searchResult74, searchResult75, searchResult76, searchResult77, searchResult78, searchResult79, searchResult80, searchResult81, searchResult82, searchResult83, searchResult84, searchResult85, searchResult86, searchResult87, searchResult88, searchResult89, searchResult90, searchResult91, searchResult92, searchResult93, searchResult94, searchResult95, searchResult96, searchResult97, searchResult98, searchResult99, searchResult100, searchResult101, searchResult102, searchResult103, searchResult104, searchResult105, searchResult106, searchResult107, searchResult108, searchResult109, searchResult110, searchResult111, searchResult112, searchResult113, searchResult114, searchResult115, searchResult116, searchResult3, searchResult118, searchResult119, searchResult120, searchResult121, searchResult122, searchResult123, searchResult124, searchResult125, searchResult4, searchResult127, searchResult6, searchResult5, searchResult155, searchResult154, searchResult153, searchResult8, searchResult10, searchResult12, searchResult14, searchResult16, searchResult18, searchResult20, searchResult22, searchResult24, searchResult26, searchResult133, searchResult134, searchResult135, searchResult136, searchResult137, searchResult138, searchResult139, searchResult140, searchResult141, searchResult142, searchResult143, searchResult144, searchResult145, searchResult147, searchResult148, searchResult149, searchResult150, searchResult151, searchResult152, searchResult156, searchResult157, searchResult158, new SearchResult(402, string19, string20, i34, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$138(baseFragment);
                }
            }), new SearchResult(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(i33), i34, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$139(baseFragment);
                }
            }), new SearchResult(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(i33), i34, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.lambda$onCreateSearchArray$140(baseFragment);
                }
            })};
        }

        public static void lambda$onCreateSearchArray$1(BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
            baseFragment.presentFragment(new ChangeNameActivity(resourcesProvider));
        }

        public static void lambda$onCreateSearchArray$2(BaseFragment baseFragment) {
            baseFragment.presentFragment(new ActionIntroActivity(3));
        }

        public static void lambda$onCreateSearchArray$3(BaseFragment baseFragment) {
            int i = 0;
            while (true) {
                if (i >= 4) {
                    i = -1;
                    break;
                } else if (!UserConfig.getInstance(i).isClientActivated()) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                baseFragment.presentFragment(new LoginActivity(i));
            }
        }

        public static void lambda$onCreateSearchArray$4(BaseFragment baseFragment) {
            baseFragment.presentFragment(new NotificationsSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$5(BaseFragment baseFragment) {
            baseFragment.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
        }

        public static void lambda$onCreateSearchArray$6(BaseFragment baseFragment) {
            baseFragment.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
        }

        public static void lambda$onCreateSearchArray$7(BaseFragment baseFragment) {
            baseFragment.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
        }

        public static void lambda$onCreateSearchArray$8(BaseFragment baseFragment) {
            baseFragment.presentFragment(new NotificationsSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$9(BaseFragment baseFragment) {
            baseFragment.presentFragment(new NotificationsSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$10(BaseFragment baseFragment) {
            baseFragment.presentFragment(new NotificationsSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$11(BaseFragment baseFragment) {
            baseFragment.presentFragment(new NotificationsSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$12(BaseFragment baseFragment) {
            baseFragment.presentFragment(new NotificationsSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$13(BaseFragment baseFragment) {
            baseFragment.presentFragment(new NotificationsSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$14(BaseFragment baseFragment) {
            baseFragment.presentFragment(new NotificationsSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$15(BaseFragment baseFragment) {
            baseFragment.presentFragment(new NotificationsSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$16(BaseFragment baseFragment) {
            baseFragment.presentFragment(new NotificationsSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$17(BaseFragment baseFragment) {
            baseFragment.presentFragment(new PrivacySettingsActivity());
        }

        public static void lambda$onCreateSearchArray$18(BaseFragment baseFragment) {
            baseFragment.presentFragment(new TwoStepVerificationActivity());
        }

        public static void lambda$onCreateSearchArray$19(int i, BaseFragment baseFragment) {
            if (UserConfig.getInstance(i).getGlobalTTl() >= 0) {
                baseFragment.presentFragment(new AutoDeleteMessagesActivity());
            }
        }

        public static void lambda$onCreateSearchArray$20(BaseFragment baseFragment) {
            baseFragment.presentFragment(PasscodeActivity.determineOpenFragment());
        }

        public static void lambda$onCreateSearchArray$21(BaseFragment baseFragment) {
            baseFragment.presentFragment(new PrivacySettingsActivity());
        }

        public static void lambda$onCreateSearchArray$22(BaseFragment baseFragment) {
            baseFragment.presentFragment(new PrivacyUsersActivity().loadBlocked());
        }

        public static void lambda$onCreateSearchArray$23(BaseFragment baseFragment) {
            baseFragment.presentFragment(new SessionsActivity(0));
        }

        public static void lambda$onCreateSearchArray$24(BaseFragment baseFragment) {
            baseFragment.presentFragment(new PrivacyControlActivity(6, true));
        }

        public static void lambda$onCreateSearchArray$25(BaseFragment baseFragment) {
            baseFragment.presentFragment(new PrivacyControlActivity(0, true));
        }

        public static void lambda$onCreateSearchArray$26(BaseFragment baseFragment) {
            baseFragment.presentFragment(new PrivacyControlActivity(4, true));
        }

        public static void lambda$onCreateSearchArray$27(BaseFragment baseFragment) {
            baseFragment.presentFragment(new PrivacyControlActivity(5, true));
        }

        public static void lambda$onCreateSearchArray$28(BaseFragment baseFragment) {
            baseFragment.presentFragment(new PrivacyControlActivity(3, true));
        }

        public static void lambda$onCreateSearchArray$29(BaseFragment baseFragment) {
            baseFragment.presentFragment(new PrivacyControlActivity(2, true));
        }

        public static void lambda$onCreateSearchArray$30(BaseFragment baseFragment) {
            baseFragment.presentFragment(new PrivacyControlActivity(1, true));
        }

        public static void lambda$onCreateSearchArray$31(int i, BaseFragment baseFragment) {
            if (!UserConfig.getInstance(i).isPremium()) {
                BulletinFactory.of(baseFragment).createRestrictVoiceMessagesPremiumBulletin().show();
            } else {
                baseFragment.presentFragment(new PrivacyControlActivity(8, true));
            }
        }

        public static void lambda$onCreateSearchArray$32(BaseFragment baseFragment) {
            baseFragment.presentFragment(new PrivacySettingsActivity());
        }

        public static void lambda$onCreateSearchArray$33(BaseFragment baseFragment) {
            baseFragment.presentFragment(new PrivacySettingsActivity());
        }

        public static void lambda$onCreateSearchArray$34(BaseFragment baseFragment) {
            baseFragment.presentFragment(new PrivacySettingsActivity());
        }

        public static void lambda$onCreateSearchArray$35(BaseFragment baseFragment) {
            baseFragment.presentFragment(new SessionsActivity(1));
        }

        public static void lambda$onCreateSearchArray$36(BaseFragment baseFragment) {
            baseFragment.presentFragment(new PrivacySettingsActivity());
        }

        public static void lambda$onCreateSearchArray$37(BaseFragment baseFragment) {
            baseFragment.presentFragment(new PrivacySettingsActivity());
        }

        public static void lambda$onCreateSearchArray$38(BaseFragment baseFragment) {
            baseFragment.presentFragment(new PrivacySettingsActivity());
        }

        public static void lambda$onCreateSearchArray$39(BaseFragment baseFragment) {
            baseFragment.presentFragment(new PrivacySettingsActivity());
        }

        public static void lambda$onCreateSearchArray$40(BaseFragment baseFragment) {
            baseFragment.presentFragment(new PrivacySettingsActivity());
        }

        public static void lambda$onCreateSearchArray$41(BaseFragment baseFragment) {
            baseFragment.presentFragment(new SessionsActivity(0));
        }

        public static void lambda$onCreateSearchArray$42(BaseFragment baseFragment) {
            baseFragment.presentFragment(new SessionsActivity(0));
        }

        public static void lambda$onCreateSearchArray$43(BaseFragment baseFragment) {
            baseFragment.presentFragment(new SessionsActivity(0).setHighlightLinkDesktopDevice());
        }

        public static void lambda$onCreateSearchArray$44(BaseFragment baseFragment) {
            baseFragment.presentFragment(new DataSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$45(BaseFragment baseFragment) {
            baseFragment.presentFragment(new DataSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$46(BaseFragment baseFragment) {
            baseFragment.presentFragment(new CacheControlActivity());
        }

        public static void lambda$onCreateSearchArray$47(BaseFragment baseFragment) {
            baseFragment.presentFragment(new CacheControlActivity());
        }

        public static void lambda$onCreateSearchArray$48(BaseFragment baseFragment) {
            baseFragment.presentFragment(new CacheControlActivity());
        }

        public static void lambda$onCreateSearchArray$49(BaseFragment baseFragment) {
            baseFragment.presentFragment(new CacheControlActivity());
        }

        public static void lambda$onCreateSearchArray$50(BaseFragment baseFragment) {
            baseFragment.presentFragment(new DataUsage2Activity());
        }

        public static void lambda$onCreateSearchArray$51(BaseFragment baseFragment) {
            baseFragment.presentFragment(new DataSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$52(BaseFragment baseFragment) {
            baseFragment.presentFragment(new DataAutoDownloadActivity(0));
        }

        public static void lambda$onCreateSearchArray$53(BaseFragment baseFragment) {
            baseFragment.presentFragment(new DataAutoDownloadActivity(1));
        }

        public static void lambda$onCreateSearchArray$54(BaseFragment baseFragment) {
            baseFragment.presentFragment(new DataAutoDownloadActivity(2));
        }

        public static void lambda$onCreateSearchArray$55(BaseFragment baseFragment) {
            baseFragment.presentFragment(new DataSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$56(BaseFragment baseFragment) {
            baseFragment.presentFragment(new DataSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$57(BaseFragment baseFragment) {
            baseFragment.presentFragment(new DataSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$58(BaseFragment baseFragment) {
            baseFragment.presentFragment(new DataSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$59(BaseFragment baseFragment) {
            baseFragment.presentFragment(new DataSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$60(BaseFragment baseFragment) {
            baseFragment.presentFragment(new DataSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$61(BaseFragment baseFragment) {
            baseFragment.presentFragment(new ProxyListActivity());
        }

        public static void lambda$onCreateSearchArray$62(BaseFragment baseFragment) {
            baseFragment.presentFragment(new ProxyListActivity());
        }

        public static void lambda$onCreateSearchArray$63(BaseFragment baseFragment) {
            baseFragment.presentFragment(new DataSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$64(BaseFragment baseFragment) {
            baseFragment.presentFragment(new DataSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$65(BaseFragment baseFragment) {
            baseFragment.presentFragment(new DataSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$66(BaseFragment baseFragment) {
            baseFragment.presentFragment(new DataSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$67(BaseFragment baseFragment) {
            baseFragment.presentFragment(new DataSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$68(BaseFragment baseFragment) {
            baseFragment.presentFragment(new ThemeActivity(0));
        }

        public static void lambda$onCreateSearchArray$69(BaseFragment baseFragment) {
            baseFragment.presentFragment(new ThemeActivity(0));
        }

        public static void lambda$onCreateSearchArray$70(BaseFragment baseFragment) {
            baseFragment.presentFragment(new WallpapersListActivity(0));
        }

        public static void lambda$onCreateSearchArray$71(BaseFragment baseFragment) {
            baseFragment.presentFragment(new WallpapersListActivity(1));
        }

        public static void lambda$onCreateSearchArray$72(BaseFragment baseFragment) {
            baseFragment.presentFragment(new WallpapersListActivity(0));
        }

        public static void lambda$onCreateSearchArray$73(BaseFragment baseFragment) {
            baseFragment.presentFragment(new ThemeActivity(0));
        }

        public static void lambda$onCreateSearchArray$74(BaseFragment baseFragment) {
            baseFragment.presentFragment(new ThemeActivity(3));
        }

        public static void lambda$onCreateSearchArray$75(BaseFragment baseFragment) {
            baseFragment.presentFragment(new ThemeActivity(3));
        }

        public static void lambda$onCreateSearchArray$76(BaseFragment baseFragment) {
            baseFragment.presentFragment(new ThemeActivity(0));
        }

        public static void lambda$onCreateSearchArray$77(BaseFragment baseFragment) {
            baseFragment.presentFragment(new ThemeActivity(0));
        }

        public static void lambda$onCreateSearchArray$78(BaseFragment baseFragment) {
            baseFragment.presentFragment(new ThemeActivity(0));
        }

        public static void lambda$onCreateSearchArray$79(BaseFragment baseFragment) {
            baseFragment.presentFragment(new ThemeActivity(0));
        }

        public static void lambda$onCreateSearchArray$80(BaseFragment baseFragment) {
            baseFragment.presentFragment(new ThemeActivity(1));
        }

        public static void lambda$onCreateSearchArray$81(BaseFragment baseFragment) {
            baseFragment.presentFragment(new ThemeActivity(0));
        }

        public static void lambda$onCreateSearchArray$82(BaseFragment baseFragment) {
            baseFragment.presentFragment(new ThemeActivity(0));
        }

        public static void lambda$onCreateSearchArray$83(BaseFragment baseFragment) {
            baseFragment.presentFragment(new ThemeActivity(0));
        }

        public static void lambda$onCreateSearchArray$84(BaseFragment baseFragment) {
            baseFragment.presentFragment(new ThemeActivity(0));
        }

        public static void lambda$onCreateSearchArray$85(BaseFragment baseFragment) {
            baseFragment.presentFragment(new ThemeActivity(0));
        }

        public static void lambda$onCreateSearchArray$86(BaseFragment baseFragment) {
            baseFragment.presentFragment(new ThemeActivity(0));
        }

        public static void lambda$onCreateSearchArray$87(BaseFragment baseFragment) {
            baseFragment.presentFragment(new ThemeActivity(0));
        }

        public static void lambda$onCreateSearchArray$88(BaseFragment baseFragment) {
            baseFragment.presentFragment(new ThemeActivity(0));
        }

        public static void lambda$onCreateSearchArray$89(BaseFragment baseFragment) {
            baseFragment.presentFragment(new StickersActivity(0, null));
        }

        public static void lambda$onCreateSearchArray$90(BaseFragment baseFragment) {
            baseFragment.presentFragment(new StickersActivity(0, null));
        }

        public static void lambda$onCreateSearchArray$91(BaseFragment baseFragment) {
            baseFragment.presentFragment(new StickersActivity(0, null));
        }

        public static void lambda$onCreateSearchArray$92(BaseFragment baseFragment) {
            baseFragment.presentFragment(new StickersActivity(1, null));
        }

        public static void lambda$onCreateSearchArray$93(BaseFragment baseFragment) {
            baseFragment.presentFragment(new ArchivedStickersActivity(0));
        }

        public static void lambda$onCreateSearchArray$94(BaseFragment baseFragment) {
            baseFragment.presentFragment(new ArchivedStickersActivity(1));
        }

        public static void lambda$onCreateSearchArray$95(BaseFragment baseFragment) {
            baseFragment.presentFragment(new StickersActivity(0, null));
        }

        public static void lambda$onCreateSearchArray$96(BaseFragment baseFragment) {
            baseFragment.presentFragment(new StickersActivity(0, null));
        }

        public static void lambda$onCreateSearchArray$97(BaseFragment baseFragment) {
            baseFragment.presentFragment(new StickersActivity(5, null));
        }

        public static void lambda$onCreateSearchArray$98(BaseFragment baseFragment) {
            baseFragment.presentFragment(new StickersActivity(5, null));
        }

        public static void lambda$onCreateSearchArray$99(BaseFragment baseFragment) {
            baseFragment.presentFragment(new StickersActivity(5, null));
        }

        public static void lambda$onCreateSearchArray$100(BaseFragment baseFragment) {
            baseFragment.presentFragment(new ReactionsDoubleTapManageActivity());
        }

        public static void lambda$onCreateSearchArray$101(BaseFragment baseFragment) {
            baseFragment.presentFragment(new FiltersSetupActivity());
        }

        public static void lambda$onCreateSearchArray$102(BaseFragment baseFragment) {
            baseFragment.presentFragment(new FiltersSetupActivity());
        }

        public static void lambda$onCreateSearchArray$103(BaseFragment baseFragment) {
            baseFragment.presentFragment(new PremiumPreviewFragment("settings"));
        }

        public static void lambda$onCreateSearchArray$104(BaseFragment baseFragment) {
            baseFragment.showDialog(new PremiumFeatureBottomSheet(baseFragment, 0, false).setForceAbout());
        }

        public static void lambda$onCreateSearchArray$105(BaseFragment baseFragment) {
            baseFragment.showDialog(new PremiumFeatureBottomSheet(baseFragment, 11, false).setForceAbout());
        }

        public static void lambda$onCreateSearchArray$106(BaseFragment baseFragment) {
            baseFragment.showDialog(new PremiumFeatureBottomSheet(baseFragment, 1, false).setForceAbout());
        }

        public static void lambda$onCreateSearchArray$107(BaseFragment baseFragment) {
            baseFragment.showDialog(new PremiumFeatureBottomSheet(baseFragment, 2, false).setForceAbout());
        }

        public static void lambda$onCreateSearchArray$108(BaseFragment baseFragment) {
            baseFragment.showDialog(new PremiumFeatureBottomSheet(baseFragment, 8, false).setForceAbout());
        }

        public static void lambda$onCreateSearchArray$109(BaseFragment baseFragment) {
            baseFragment.showDialog(new PremiumFeatureBottomSheet(baseFragment, 3, false).setForceAbout());
        }

        public static void lambda$onCreateSearchArray$110(BaseFragment baseFragment) {
            baseFragment.showDialog(new PremiumFeatureBottomSheet(baseFragment, 4, false).setForceAbout());
        }

        public static void lambda$onCreateSearchArray$111(BaseFragment baseFragment) {
            baseFragment.showDialog(new PremiumFeatureBottomSheet(baseFragment, 5, false).setForceAbout());
        }

        public static void lambda$onCreateSearchArray$112(BaseFragment baseFragment) {
            baseFragment.showDialog(new PremiumFeatureBottomSheet(baseFragment, 9, false).setForceAbout());
        }

        public static void lambda$onCreateSearchArray$113(BaseFragment baseFragment) {
            baseFragment.showDialog(new PremiumFeatureBottomSheet(baseFragment, 6, false).setForceAbout());
        }

        public static void lambda$onCreateSearchArray$114(BaseFragment baseFragment) {
            baseFragment.showDialog(new PremiumFeatureBottomSheet(baseFragment, 7, false).setForceAbout());
        }

        public static void lambda$onCreateSearchArray$115(BaseFragment baseFragment) {
            baseFragment.showDialog(new PremiumFeatureBottomSheet(baseFragment, 10, false).setForceAbout());
        }

        public static void lambda$onCreateSearchArray$116(BaseFragment baseFragment) {
            baseFragment.showDialog(new PremiumFeatureBottomSheet(baseFragment, 12, false).setForceAbout());
        }

        public static void lambda$onCreateSearchArray$117(BaseFragment baseFragment) {
            baseFragment.presentFragment(new LiteModeSettingsActivity());
        }

        public static void lambda$onCreateSearchArray$118(BaseFragment baseFragment) {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            baseFragment.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.scrollToFlags(3);
        }

        public static void lambda$onCreateSearchArray$119(BaseFragment baseFragment) {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            baseFragment.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.setExpanded(3, true);
            liteModeSettingsActivity.scrollToFlags(1);
        }

        public static void lambda$onCreateSearchArray$120(BaseFragment baseFragment) {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            baseFragment.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.setExpanded(3, true);
            liteModeSettingsActivity.scrollToFlags(2);
        }

        public static void lambda$onCreateSearchArray$121(BaseFragment baseFragment) {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            baseFragment.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.scrollToFlags(28700);
        }

        public static void lambda$onCreateSearchArray$122(BaseFragment baseFragment) {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            baseFragment.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.setExpanded(28700, true);
            liteModeSettingsActivity.scrollToFlags(16388);
        }

        public static void lambda$onCreateSearchArray$123(BaseFragment baseFragment) {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            baseFragment.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.setExpanded(28700, true);
            liteModeSettingsActivity.scrollToFlags(8200);
        }

        public static void lambda$onCreateSearchArray$124(BaseFragment baseFragment) {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            baseFragment.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.setExpanded(28700, true);
            liteModeSettingsActivity.scrollToFlags(4112);
        }

        public static void lambda$onCreateSearchArray$125(BaseFragment baseFragment) {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            baseFragment.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.scrollToFlags(360928);
        }

        public static void lambda$onCreateSearchArray$126(BaseFragment baseFragment) {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            baseFragment.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.setExpanded(360928, true);
            liteModeSettingsActivity.scrollToFlags(32);
        }

        public static void lambda$onCreateSearchArray$127(BaseFragment baseFragment) {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            baseFragment.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.setExpanded(360928, true);
            liteModeSettingsActivity.scrollToFlags(64);
        }

        public static void lambda$onCreateSearchArray$128(BaseFragment baseFragment) {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            baseFragment.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.setExpanded(360928, true);
            liteModeSettingsActivity.scrollToFlags(128);
        }

        public static void lambda$onCreateSearchArray$129(BaseFragment baseFragment) {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            baseFragment.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.setExpanded(360928, true);
            liteModeSettingsActivity.scrollToFlags(256);
        }

        public static void lambda$onCreateSearchArray$130(BaseFragment baseFragment) {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            baseFragment.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.setExpanded(360928, true);
            liteModeSettingsActivity.scrollToFlags(32768);
        }

        public static void lambda$onCreateSearchArray$131(BaseFragment baseFragment) {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            baseFragment.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.scrollToFlags(512);
        }

        public static void lambda$onCreateSearchArray$132(BaseFragment baseFragment) {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            baseFragment.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.scrollToFlags(1024);
        }

        public static void lambda$onCreateSearchArray$133(BaseFragment baseFragment) {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            baseFragment.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.scrollToFlags(2048);
        }

        public static void lambda$onCreateSearchArray$134(BaseFragment baseFragment) {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            baseFragment.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.scrollToType(1);
        }

        public static void lambda$onCreateSearchArray$135(BaseFragment baseFragment) {
            baseFragment.presentFragment(new LanguageSelectActivity());
        }

        public static void lambda$onCreateSearchArray$136(BaseFragment baseFragment) {
            baseFragment.presentFragment(new LanguageSelectActivity());
        }

        public static void lambda$onCreateSearchArray$137(BaseFragment baseFragment) {
            baseFragment.presentFragment(new LanguageSelectActivity());
        }

        public static void lambda$onCreateSearchArray$138(BaseFragment baseFragment) {
            baseFragment.showDialog(AlertsCreator.createSupportAlert(baseFragment, null));
        }

        public static void lambda$onCreateSearchArray$139(BaseFragment baseFragment) {
            Browser.openUrl(baseFragment.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
        }

        public static void lambda$onCreateSearchArray$140(BaseFragment baseFragment) {
            Browser.openUrl(baseFragment.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
        }

        private static boolean isPremiumFeatureAvailable(int i, int i2) {
            if (!MessagesController.getInstance(i).premiumFeaturesBlocked() || UserConfig.getInstance(i).isPremium()) {
                return i2 == -1 || MessagesController.getInstance(i).premiumFeaturesTypesToPosition.get(i2, -1) != -1;
            }
            return false;
        }

        public void loadFaqWebPage() {
            TLRPC.WebPage webPage = MessagesController.getInstance(this.currentAccount).faqWebPage;
            this.faqWebPage = webPage;
            if (webPage != null) {
                this.faqSearchArray.addAll(MessagesController.getInstance(this.currentAccount).faqSearchArray);
            }
            if (this.faqWebPage != null || this.loadingFaqPage) {
                return;
            }
            this.loadingFaqPage = true;
            TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
            tL_messages_getWebPage.url = LocaleController.getString(R.string.TelegramFaqUrl);
            tL_messages_getWebPage.hash = 0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getWebPage, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$loadFaqWebPage$142(tLObject, tL_error);
                }
            });
        }

        public void lambda$loadFaqWebPage$142(org.telegram.tgnet.TLObject r13, org.telegram.tgnet.TLRPC.TL_error r14) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.SearchAdapter.lambda$loadFaqWebPage$142(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
        }

        public void lambda$loadFaqWebPage$141(ArrayList arrayList) {
            this.faqSearchArray.addAll(arrayList);
            MessagesController.getInstance(this.currentAccount).faqSearchArray = arrayList;
            MessagesController.getInstance(this.currentAccount).faqWebPage = this.faqWebPage;
            if (this.searchWas) {
                return;
            }
            notifyDataSetChanged();
        }

        @Override
        public int getItemCount() {
            if (this.searchWas) {
                return this.searchResults.size() + (this.faqSearchResults.isEmpty() ? 0 : this.faqSearchResults.size() + 1);
            }
            return (this.recentSearches.isEmpty() ? 0 : this.recentSearches.size() + 1) + (this.faqSearchArray.isEmpty() ? 0 : this.faqSearchArray.size() + 1);
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    ((GraySectionCell) viewHolder.itemView).setText(LocaleController.getString(R.string.SettingsFaqSearchTitle));
                    return;
                } else {
                    if (itemViewType != 2) {
                        return;
                    }
                    ((HeaderCell) viewHolder.itemView).setText(LocaleController.getString(R.string.SettingsRecent));
                    return;
                }
            }
            SettingsSearchCell settingsSearchCell = (SettingsSearchCell) viewHolder.itemView;
            if (this.searchWas) {
                if (i < this.searchResults.size()) {
                    SearchResult searchResult = (SearchResult) this.searchResults.get(i);
                    SearchResult searchResult2 = i > 0 ? (SearchResult) this.searchResults.get(i - 1) : null;
                    settingsSearchCell.setTextAndValueAndIcon((CharSequence) this.resultNames.get(i), searchResult.path, (searchResult2 == null || searchResult2.iconResId != searchResult.iconResId) ? searchResult.iconResId : 0, i < this.searchResults.size() - 1);
                    return;
                } else {
                    int size = i - (this.searchResults.size() + 1);
                    settingsSearchCell.setTextAndValue((CharSequence) this.resultNames.get(this.searchResults.size() + size), ((MessagesController.FaqSearchResult) this.faqSearchResults.get(size)).path, true, size < this.searchResults.size() - 1);
                    return;
                }
            }
            if (!this.recentSearches.isEmpty()) {
                i--;
            }
            if (i < this.recentSearches.size()) {
                Object obj = this.recentSearches.get(i);
                if (obj instanceof SearchResult) {
                    SearchResult searchResult3 = (SearchResult) obj;
                    settingsSearchCell.setTextAndValue(searchResult3.searchTitle, searchResult3.path, false, i < this.recentSearches.size() - 1);
                    return;
                } else {
                    if (obj instanceof MessagesController.FaqSearchResult) {
                        MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj;
                        settingsSearchCell.setTextAndValue(faqSearchResult.title, faqSearchResult.path, true, i < this.recentSearches.size() - 1);
                        return;
                    }
                    return;
                }
            }
            int size2 = i - (this.recentSearches.size() + 1);
            MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) this.faqSearchArray.get(size2);
            settingsSearchCell.setTextAndValue(faqSearchResult2.title, faqSearchResult2.path, true, size2 < this.recentSearches.size() - 1);
        }

        public void fillItems(ArrayList arrayList) {
            if (this.searchWas) {
                Iterator it = this.searchResults.iterator();
                int i = 0;
                while (it.hasNext()) {
                    arrayList.add(SettingsSearchCell.Factory.of((CharSequence) this.resultNames.get(i), (SearchResult) it.next()));
                    i++;
                }
                if (this.faqSearchResults.isEmpty()) {
                    return;
                }
                arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
                Iterator it2 = this.faqSearchResults.iterator();
                while (it2.hasNext()) {
                    arrayList.add(SettingsSearchCell.Factory.of((CharSequence) this.resultNames.get(i), (MessagesController.FaqSearchResult) it2.next()));
                    i++;
                }
                return;
            }
            if (!this.recentSearches.isEmpty()) {
                arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SettingsRecent)));
                Iterator it3 = this.recentSearches.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (next instanceof SearchResult) {
                        SearchResult searchResult = (SearchResult) next;
                        arrayList.add(SettingsSearchCell.Factory.of(searchResult.searchTitle, searchResult));
                    } else if (next instanceof MessagesController.FaqSearchResult) {
                        MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) next;
                        arrayList.add(SettingsSearchCell.Factory.of(faqSearchResult.title, faqSearchResult));
                    }
                }
            }
            if (this.faqSearchArray.isEmpty()) {
                return;
            }
            arrayList.add(UItem.asGraySection(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
            Iterator it4 = this.faqSearchArray.iterator();
            while (it4.hasNext()) {
                MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) it4.next();
                arrayList.add(SettingsSearchCell.Factory.of(faqSearchResult2.title, faqSearchResult2));
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View settingsSearchCell;
            if (i == 0) {
                settingsSearchCell = new SettingsSearchCell(this.mContext);
            } else if (i == 1) {
                settingsSearchCell = new GraySectionCell(this.mContext);
            } else {
                settingsSearchCell = new HeaderCell(this.mContext, 16);
            }
            settingsSearchCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(settingsSearchCell);
        }

        @Override
        public int getItemViewType(int i) {
            if (this.searchWas) {
                if (i >= this.searchResults.size() && i == this.searchResults.size()) {
                    return 1;
                }
            } else {
                if (i == 0) {
                    return !this.recentSearches.isEmpty() ? 2 : 1;
                }
                if (!this.recentSearches.isEmpty() && i == this.recentSearches.size() + 1) {
                    return 1;
                }
            }
            return 0;
        }

        public void addRecent(Object obj) {
            int iIndexOf = this.recentSearches.indexOf(obj);
            if (iIndexOf >= 0) {
                this.recentSearches.remove(iIndexOf);
            }
            this.recentSearches.add(0, obj);
            if (!this.searchWas) {
                notifyDataSetChanged();
            }
            if (this.recentSearches.size() > 20) {
                this.recentSearches.remove(r5.size() - 1);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = this.recentSearches.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = this.recentSearches.get(i);
                if (obj2 instanceof SearchResult) {
                    ((SearchResult) obj2).num = i;
                } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                    ((MessagesController.FaqSearchResult) obj2).num = i;
                }
                linkedHashSet.add(obj2.toString());
            }
            MessagesController.getGlobalMainSettings().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
        }

        public void clearRecent() {
            this.recentSearches.clear();
            MessagesController.getGlobalMainSettings().edit().remove("settingsSearchRecent2").commit();
            notifyDataSetChanged();
        }

        private int getNum(Object obj) {
            if (obj instanceof SearchResult) {
                return ((SearchResult) obj).num;
            }
            if (obj instanceof MessagesController.FaqSearchResult) {
                return ((MessagesController.FaqSearchResult) obj).num;
            }
            return 0;
        }

        public void search(final String str) {
            this.lastSearchString = str;
            if (this.searchRunnable != null) {
                Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                this.searchRunnable = null;
            }
            if (TextUtils.isEmpty(str)) {
                this.searchWas = false;
                this.searchResults.clear();
                this.faqSearchResults.clear();
                this.resultNames.clear();
                BaseFragment baseFragment = this.fragment;
                if (baseFragment instanceof ProfileActivity) {
                    ((ProfileActivity) baseFragment).emptyView.stickerView.getImageReceiver().startAnimation();
                    ((ProfileActivity) this.fragment).emptyView.title.setText(LocaleController.getString(R.string.SettingsNoRecent));
                }
                notifyDataSetChanged();
                return;
            }
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$search$144(str);
                }
            };
            this.searchRunnable = runnable;
            dispatchQueue.postRunnable(runnable, 300L);
        }

        public void lambda$search$144(final java.lang.String r19) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.SearchAdapter.lambda$search$144(java.lang.String):void");
        }

        public void lambda$search$143(String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
            if (str.equals(this.lastSearchString)) {
                if (!this.searchWas) {
                    BaseFragment baseFragment = this.fragment;
                    if (baseFragment instanceof ProfileActivity) {
                        ((ProfileActivity) baseFragment).emptyView.stickerView.getImageReceiver().startAnimation();
                        ((ProfileActivity) this.fragment).emptyView.title.setText(LocaleController.getString(R.string.SettingsNoResults));
                    }
                }
                this.searchWas = true;
                this.searchResults = arrayList;
                this.faqSearchResults = arrayList2;
                this.resultNames = arrayList3;
                notifyDataSetChanged();
                BaseFragment baseFragment2 = this.fragment;
                if (baseFragment2 instanceof ProfileActivity) {
                    ((ProfileActivity) baseFragment2).emptyView.stickerView.getImageReceiver().startAnimation();
                }
            }
        }

        public boolean isSearchWas() {
            return this.searchWas;
        }
    }

    public void openUrl(String str, Browser.Progress progress) {
        if (str.startsWith("@")) {
            getMessagesController().openByUserName(str.substring(1), this, 0, progress);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            DialogsActivity dialogsActivity = new DialogsActivity(null);
            dialogsActivity.setSearchString(str);
            presentFragment(dialogsActivity);
        } else {
            if (!str.startsWith("/") || this.parentLayout.getFragmentStack().size() <= 1) {
                return;
            }
            BaseFragment baseFragment = (BaseFragment) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            if (baseFragment instanceof ChatActivity) {
                finishFragment();
                ((ChatActivity) baseFragment).chatActivityEnterView.setCommand(null, str, false, false);
            }
        }
    }

    private void dimBehindView(View view, float f) {
        this.scrimView = view;
        dimBehindView(f);
    }

    private void dimBehindView(boolean z) {
        dimBehindView(z ? 0.2f : 0.0f);
    }

    private void dimBehindView(float f) {
        ValueAnimator valueAnimatorOfFloat;
        boolean z = f > 0.0f;
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.scrimAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.scrimAnimatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f);
            arrayList.add(valueAnimatorOfFloat);
        } else {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(this.scrimPaint.getAlpha() / 255.0f, 0.0f);
            arrayList.add(valueAnimatorOfFloat);
        }
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$dimBehindView$106(valueAnimator);
            }
        });
        this.scrimAnimatorSet.playTogether(arrayList);
        this.scrimAnimatorSet.setDuration(z ? 150L : 220L);
        if (!z) {
            this.scrimAnimatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    ProfileActivity.this.scrimView = null;
                    ProfileActivity.this.fragmentView.invalidate();
                }
            });
        }
        this.scrimAnimatorSet.start();
    }

    public void lambda$dimBehindView$106(ValueAnimator valueAnimator) {
        this.scrimPaint.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
    }

    @Override
    public ArrayList getThemeDescriptions() {
        if (this.resourcesProvider != null) {
            return null;
        }
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                this.f$0.lambda$getThemeDescriptions$107();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        ArrayList arrayList = new ArrayList();
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout != null) {
            arrayList.addAll(sharedMediaLayout.getThemeDescriptions());
        }
        RecyclerListView recyclerListView = this.listView;
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(recyclerListView, 0, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.searchListView, 0, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_actionBarSelectorBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_chat_lockIcon));
        int i2 = Theme.key_avatar_subtitleInProfileBlue;
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, i2));
        int i3 = Theme.key_avatar_backgroundActionBarBlue;
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, i3));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_profile_title));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_profile_status));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, i2));
        if (this.mediaCounterTextView != null) {
            TextView textView = this.mediaCounterTextView.getTextView();
            int i4 = ThemeDescription.FLAG_TEXTCOLOR;
            int i5 = Theme.key_player_actionBarSubtitle;
            arrayList.add(new ThemeDescription(textView, i4, null, null, null, themeDescriptionDelegate, i5));
            arrayList.add(new ThemeDescription(this.mediaCounterTextView.getNextTextView(), ThemeDescription.FLAG_TEXTCOLOR, null, null, null, themeDescriptionDelegate, i5));
        }
        arrayList.add(new ThemeDescription(this.topView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        AvatarImageView avatarImageView = this.avatarImage;
        Drawable[] drawableArr = Theme.avatarDrawables;
        int i6 = Theme.key_avatar_text;
        arrayList.add(new ThemeDescription(avatarImageView, 0, null, null, drawableArr, null, i6));
        arrayList.add(new ThemeDescription(this.avatarImage, 0, null, null, new Drawable[]{this.avatarDrawable}, null, Theme.key_avatar_backgroundInProfileBlue));
        arrayList.add(new ThemeDescription(this.writeButton, ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, Theme.key_profile_actionIcon));
        arrayList.add(new ThemeDescription(this.writeButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_profile_actionBackground));
        arrayList.add(new ThemeDescription(this.writeButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, Theme.key_profile_actionPressedBackground));
        int i7 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i7));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGreenText2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_text_RedRegular));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueText2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueButton));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteValueText));
        int i8 = Theme.key_windowBackgroundWhiteGrayIcon;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i8));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueIcon));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextDetailCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i7));
        int i9 = Theme.key_windowBackgroundWhiteGrayText2;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextDetailCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i9));
        int i10 = Theme.key_windowBackgroundWhiteBlueHeader;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i10));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SettingsSuggestionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i10));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SettingsSuggestionCell.class}, new String[]{"detailTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i9));
        int i11 = Theme.key_windowBackgroundWhiteLinkText;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LINKCOLOR, new Class[]{SettingsSuggestionCell.class}, new String[]{"detailTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i11));
        int i12 = Theme.key_featuredStickers_buttonText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SettingsSuggestionCell.class}, new String[]{"yesButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i12));
        int i13 = Theme.key_featuredStickers_addButton;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE, new Class[]{SettingsSuggestionCell.class}, new String[]{"yesButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i13));
        int i14 = Theme.key_featuredStickers_addButtonPressed;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, new Class[]{SettingsSuggestionCell.class}, new String[]{"yesButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i14));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SettingsSuggestionCell.class}, new String[]{"noButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i12));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE, new Class[]{SettingsSuggestionCell.class}, new String[]{"noButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i13));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, new Class[]{SettingsSuggestionCell.class}, new String[]{"noButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i14));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i7));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i9));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrack));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrackChecked));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{UserCell.class}, new String[]{"adminTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_profile_creatorIcon));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i8));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"statusColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"statusOnlineColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, null, Theme.avatarDrawables, null, i6));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.undoView, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_undo_background));
        int i15 = Theme.key_undo_cancelColor;
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i15));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i15));
        int i16 = Theme.key_undo_infoColor;
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i16));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i16));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i16));
        arrayList.add(new ThemeDescription(this.undoView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{UndoView.class}, new String[]{"leftImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i16));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{AboutLinkCell.class}, Theme.profile_aboutTextPaint, null, null, i7));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LINKCOLOR, new Class[]{AboutLinkCell.class}, Theme.profile_aboutTextPaint, null, null, i11));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{AboutLinkCell.class}, Theme.linkSelectionPaint, null, null, Theme.key_windowBackgroundWhiteLinkSelection));
        int i17 = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, i17));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i17));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.searchListView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i10));
        arrayList.add(new ThemeDescription(this.searchListView, 0, new Class[]{GraySectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_graySectionText));
        arrayList.add(new ThemeDescription(this.searchListView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{GraySectionCell.class}, null, null, null, Theme.key_graySection));
        arrayList.add(new ThemeDescription(this.searchListView, 0, new Class[]{SettingsSearchCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i7));
        arrayList.add(new ThemeDescription(this.searchListView, 0, new Class[]{SettingsSearchCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i9));
        arrayList.add(new ThemeDescription(this.searchListView, 0, new Class[]{SettingsSearchCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i8));
        if (this.mediaHeaderVisible) {
            arrayList.add(new ThemeDescription(this.nameTextView[1], 0, null, null, this.verifiedCheckDrawable, null, Theme.key_player_actionBarTitle));
            arrayList.add(new ThemeDescription(this.nameTextView[1], 0, null, null, this.verifiedDrawable, null, i));
        } else {
            arrayList.add(new ThemeDescription(this.nameTextView[1], 0, null, null, this.verifiedCheckDrawable, null, Theme.key_profile_verifiedCheck));
            arrayList.add(new ThemeDescription(this.nameTextView[1], 0, null, null, this.verifiedDrawable, null, Theme.key_profile_verifiedBackground));
        }
        return arrayList;
    }

    public void lambda$getThemeDescriptions$107() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof UserCell) {
                    ((UserCell) childAt).update(0);
                }
            }
        }
        if (!this.isPulledDown) {
            SimpleTextView simpleTextView = this.onlineTextView[1];
            if (simpleTextView != null) {
                Object tag = simpleTextView.getTag();
                for (int i2 = 0; i2 < 2; i2++) {
                    if (tag instanceof Integer) {
                        this.onlineTextView[i2 + 1].setTextColor(applyPeerColor(getThemedColor(((Integer) tag).intValue()), true, Boolean.valueOf(this.isOnline[0])));
                    } else {
                        this.onlineTextView[i2 + 1].setTextColor(applyPeerColor(getThemedColor(Theme.key_avatar_subtitleInProfileBlue), true, Boolean.TRUE));
                    }
                }
            }
            Drawable drawable = this.lockIconDrawable;
            if (drawable != null) {
                drawable.setColorFilter(getThemedColor(Theme.key_chat_lockIcon), PorterDuff.Mode.MULTIPLY);
            }
            ScamDrawable scamDrawable = this.scamDrawable;
            if (scamDrawable != null) {
                scamDrawable.setColor(getThemedColor(Theme.key_avatar_subtitleInProfileBlue));
            }
            SimpleTextView simpleTextView2 = this.nameTextView[1];
            if (simpleTextView2 != null) {
                simpleTextView2.setTextColor(getThemedColor(Theme.key_profile_title));
            }
            ActionBar actionBar = this.actionBar;
            if (actionBar != null) {
                actionBar.setItemsColor(this.peerColor != null ? -1 : getThemedColor(Theme.key_actionBarDefaultIcon), false);
                this.actionBar.setItemsBackgroundColor(this.peerColor != null ? 553648127 : getThemedColor(Theme.key_avatar_actionBarSelectorBlue), false);
            }
        }
        updateEmojiStatusDrawableColor();
        updatedPeerColor();
    }

    public void updateListAnimated(boolean z) {
        updateListAnimated(z, false);
    }

    private void updateListAnimated(final boolean z, boolean z2) {
        if (this.listAdapter == null) {
            if (z) {
                updateOnlineCount(false);
            }
            updateRowsIds();
            return;
        }
        if (!z2 && this.listView.isInLayout()) {
            if (this.listView.isAttachedToWindow()) {
                this.listView.post(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$updateListAnimated$108(z);
                    }
                });
                return;
            }
            return;
        }
        DiffCallback diffCallback = new DiffCallback();
        diffCallback.oldRowCount = this.rowCount;
        diffCallback.fillPositions(diffCallback.oldPositionToItem);
        diffCallback.oldChatParticipant.clear();
        diffCallback.oldChatParticipantSorted.clear();
        diffCallback.oldChatParticipant.addAll(this.visibleChatParticipants);
        diffCallback.oldChatParticipantSorted.addAll(this.visibleSortedUsers);
        diffCallback.oldMembersStartRow = this.membersStartRow;
        diffCallback.oldMembersEndRow = this.membersEndRow;
        if (z) {
            updateOnlineCount(false);
        }
        saveScrollPosition();
        updateRowsIds();
        diffCallback.fillPositions(diffCallback.newPositionToItem);
        try {
            DiffUtil.calculateDiff(diffCallback).dispatchUpdatesTo(this.listAdapter);
        } catch (Exception e) {
            FileLog.e(e);
            this.listAdapter.notifyDataSetChanged();
        }
        int i = this.savedScrollPosition;
        if (i >= 0) {
            this.layoutManager.scrollToPositionWithOffset(i, this.savedScrollOffset - this.listView.getPaddingTop());
        }
        AndroidUtilities.updateVisibleRows(this.listView);
    }

    public void lambda$updateListAnimated$108(boolean z) {
        updateListAnimated(z, true);
    }

    public void saveScrollPosition() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView == null || this.layoutManager == null || recyclerListView.getChildCount() <= 0 || this.savedScrollToSharedMedia) {
            return;
        }
        View view = null;
        int top = Integer.MAX_VALUE;
        int i = -1;
        for (int i2 = 0; i2 < this.listView.getChildCount(); i2++) {
            RecyclerListView recyclerListView2 = this.listView;
            int childAdapterPosition = recyclerListView2.getChildAdapterPosition(recyclerListView2.getChildAt(i2));
            View childAt = this.listView.getChildAt(i2);
            if (childAdapterPosition != -1 && childAt.getTop() < top) {
                top = childAt.getTop();
                i = childAdapterPosition;
                view = childAt;
            }
        }
        if (view != null) {
            this.savedScrollPosition = i;
            int top2 = view.getTop();
            this.savedScrollOffset = top2;
            if (this.savedScrollPosition == 0 && !this.allowPullingDown && top2 > getHeaderExtraHeight()) {
                this.savedScrollOffset = getHeaderExtraHeight();
            }
            this.layoutManager.scrollToPositionWithOffset(i, view.getTop() - this.listView.getPaddingTop());
        }
    }

    @Override
    public void scrollToSharedMedia() {
        scrollToSharedMedia(false);
    }

    public void scrollToSharedMedia(boolean z) {
        int i = this.sharedMediaRow;
        if (i >= 0) {
            if (z) {
                LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(getContext(), 2, 0.6f);
                linearSmoothScrollerCustom.setTargetPosition(this.sharedMediaRow);
                linearSmoothScrollerCustom.setOffset(-this.listView.getPaddingTop());
                this.layoutManager.startSmoothScroll(linearSmoothScrollerCustom);
                return;
            }
            this.layoutManager.scrollToPositionWithOffset(i, -this.listView.getPaddingTop());
        }
    }

    public void onTextDetailCellImageClicked(View view) {
        View view2 = (View) view.getParent();
        if (view2.getTag() != null && ((Integer) view2.getTag()).intValue() == this.usernameRow) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", this.chatId);
            bundle.putLong("user_id", this.userId);
            presentFragment(new QrActivity(bundle));
            return;
        }
        if (view2.getTag() == null || ((Integer) view2.getTag()).intValue() != this.birthdayRow) {
            return;
        }
        if (this.userId == getUserConfig().getClientUserId()) {
            presentFragment(new PremiumPreviewFragment("my_profile_gift"));
        } else if (UserObject.areGiftsDisabled(this.userInfo)) {
            BulletinFactory.of(this).createSimpleBulletin(R.raw.error, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.userId)))).show();
        } else {
            showDialog(new GiftSheet(getContext(), this.currentAccount, this.userId, null, null));
        }
    }

    @Override
    public void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        writeButtonSetBackground();
        this.fullyVisible = true;
        createBirthdayEffect();
    }

    private void writeButtonSetBackground() {
        if (this.writeButton == null) {
            return;
        }
        try {
            Drawable drawableMutate = this.fragmentView.getContext().getResources().getDrawable(R.drawable.floating_shadow_profile).mutate();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
            int themedColor = getThemedColor(Theme.key_profile_actionBackground);
            int themedColor2 = getThemedColor(Theme.key_profile_actionPressedBackground);
            int themedColor3 = getThemedColor(Theme.key_profile_actionIcon);
            if (this.peerColor != null && Theme.hasHue(themedColor)) {
                themedColor = Theme.adaptHSV(this.peerColor.getBgColor1(false), 0.05f, -0.04f);
                themedColor2 = applyPeerColor2(themedColor2);
                themedColor3 = -1;
            }
            CombinedDrawable combinedDrawable = new CombinedDrawable(drawableMutate, Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(56.0f), themedColor, themedColor2), 0, 0);
            combinedDrawable.setIconSize(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
            this.writeButton.setBackground(combinedDrawable);
            this.writeButton.setColorFilter(new PorterDuffColorFilter(themedColor3, mode));
        } catch (Exception unused) {
        }
    }

    public void openAddToContact(final TLRPC.User user, Bundle bundle) {
        ContactAddActivity contactAddActivity = new ContactAddActivity(bundle, this.resourcesProvider);
        contactAddActivity.setDelegate(new ContactAddActivity.ContactAddActivityDelegate() {
            @Override
            public final void didAddToContacts() {
                this.f$0.lambda$openAddToContact$109(user);
            }
        });
        presentFragment(contactAddActivity);
    }

    public void lambda$openAddToContact$109(TLRPC.User user) {
        if (this.addToContactsRow >= 0) {
            if (this.sharedMediaRow == -1) {
                updateRowsIds();
                this.listAdapter.notifyDataSetChanged();
            } else {
                updateListAnimated(false);
            }
        }
        if (this.sharedMediaRow == -1) {
            if (this.isInLandscapeMode || AndroidUtilities.isTablet()) {
                this.listView.setPadding(0, getHeaderExtraHeight(), 0, 0);
                this.expandAnimator.cancel();
                float[] fArr = this.expandAnimatorValues;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                setAvatarExpandProgress(1.0f);
                this.extraHeight = getHeaderExtraHeight();
            } else {
                int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.listView.getMeasuredWidth(), 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.listView.getMeasuredHeight(), 0);
                int measuredHeight = 0;
                for (int i = 0; i < this.listAdapter.getItemCount(); i++) {
                    ListAdapter listAdapter = this.listAdapter;
                    RecyclerView.ViewHolder viewHolderCreateViewHolder = listAdapter.createViewHolder(null, listAdapter.getItemViewType(i));
                    this.listAdapter.onBindViewHolder(viewHolderCreateViewHolder, i);
                    viewHolderCreateViewHolder.itemView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredHeight += viewHolderCreateViewHolder.itemView.getMeasuredHeight();
                }
                int iMax = Math.max(0, this.fragmentView.getMeasuredHeight() - ((measuredHeight + getHeaderExtraHeight()) + currentActionBarHeight));
                RecyclerListView recyclerListView = this.listView;
                recyclerListView.setPadding(0, recyclerListView.getPaddingTop(), 0, iMax);
            }
        }
        this.undoView.showWithAction(this.dialogId, 8, user);
    }

    private class DiffCallback extends DiffUtil.Callback {
        SparseIntArray newPositionToItem;
        ArrayList oldChatParticipant;
        ArrayList oldChatParticipantSorted;
        int oldMembersEndRow;
        int oldMembersStartRow;
        SparseIntArray oldPositionToItem;
        int oldRowCount;

        private DiffCallback() {
            this.oldPositionToItem = new SparseIntArray();
            this.newPositionToItem = new SparseIntArray();
            this.oldChatParticipant = new ArrayList();
            this.oldChatParticipantSorted = new ArrayList();
        }

        @Override
        public int getOldListSize() {
            return this.oldRowCount;
        }

        @Override
        public int getNewListSize() {
            return ProfileActivity.this.rowCount;
        }

        @Override
        public boolean areItemsTheSame(int i, int i2) {
            TLRPC.ChatParticipant chatParticipant;
            if (i2 >= ProfileActivity.this.membersStartRow && i2 < ProfileActivity.this.membersEndRow && i >= this.oldMembersStartRow && i < this.oldMembersEndRow) {
                if (!this.oldChatParticipantSorted.isEmpty()) {
                    chatParticipant = (TLRPC.ChatParticipant) this.oldChatParticipant.get(((Integer) this.oldChatParticipantSorted.get(i - this.oldMembersStartRow)).intValue());
                } else {
                    chatParticipant = (TLRPC.ChatParticipant) this.oldChatParticipant.get(i - this.oldMembersStartRow);
                }
                return chatParticipant.user_id == (!ProfileActivity.this.sortedUsers.isEmpty() ? (TLRPC.ChatParticipant) ProfileActivity.this.visibleChatParticipants.get(((Integer) ProfileActivity.this.visibleSortedUsers.get(i2 - ProfileActivity.this.membersStartRow)).intValue()) : (TLRPC.ChatParticipant) ProfileActivity.this.visibleChatParticipants.get(i2 - ProfileActivity.this.membersStartRow)).user_id;
            }
            int i3 = this.oldPositionToItem.get(i, -1);
            return i3 == this.newPositionToItem.get(i2, -1) && i3 >= 0;
        }

        @Override
        public boolean areContentsTheSame(int i, int i2) {
            return areItemsTheSame(i, i2);
        }

        public void fillPositions(SparseIntArray sparseIntArray) {
            sparseIntArray.clear();
            put(1, ProfileActivity.this.setAvatarRow, sparseIntArray);
            put(2, ProfileActivity.this.setAvatarSectionRow, sparseIntArray);
            put(3, ProfileActivity.this.numberSectionRow, sparseIntArray);
            put(4, ProfileActivity.this.numberRow, sparseIntArray);
            put(5, ProfileActivity.this.setUsernameRow, sparseIntArray);
            put(6, ProfileActivity.this.bioRow, sparseIntArray);
            put(7, ProfileActivity.this.phoneSuggestionRow, sparseIntArray);
            put(8, ProfileActivity.this.phoneSuggestionSectionRow, sparseIntArray);
            put(9, ProfileActivity.this.passwordSuggestionRow, sparseIntArray);
            put(10, ProfileActivity.this.passwordSuggestionSectionRow, sparseIntArray);
            put(11, ProfileActivity.this.graceSuggestionRow, sparseIntArray);
            put(12, ProfileActivity.this.graceSuggestionSectionRow, sparseIntArray);
            put(13, ProfileActivity.this.settingsSectionRow, sparseIntArray);
            put(14, ProfileActivity.this.settingsSectionRow2, sparseIntArray);
            put(15, ProfileActivity.this.notificationRow, sparseIntArray);
            put(16, ProfileActivity.this.languageRow, sparseIntArray);
            put(17, ProfileActivity.this.premiumRow, sparseIntArray);
            put(18, ProfileActivity.this.starsRow, sparseIntArray);
            put(19, ProfileActivity.this.businessRow, sparseIntArray);
            put(20, ProfileActivity.this.premiumSectionsRow, sparseIntArray);
            put(21, ProfileActivity.this.premiumGiftingRow, sparseIntArray);
            put(22, ProfileActivity.this.privacyRow, sparseIntArray);
            put(23, ProfileActivity.this.dataRow, sparseIntArray);
            put(24, ProfileActivity.this.liteModeRow, sparseIntArray);
            put(25, ProfileActivity.this.chatRow, sparseIntArray);
            put(26, ProfileActivity.this.filtersRow, sparseIntArray);
            put(27, ProfileActivity.this.stickersRow, sparseIntArray);
            put(28, ProfileActivity.this.devicesRow, sparseIntArray);
            put(29, ProfileActivity.this.devicesSectionRow, sparseIntArray);
            put(30, ProfileActivity.this.helpHeaderRow, sparseIntArray);
            put(31, ProfileActivity.this.questionRow, sparseIntArray);
            put(32, ProfileActivity.this.faqRow, sparseIntArray);
            put(33, ProfileActivity.this.policyRow, sparseIntArray);
            put(34, ProfileActivity.this.helpSectionCell, sparseIntArray);
            put(35, ProfileActivity.this.debugHeaderRow, sparseIntArray);
            put(36, ProfileActivity.this.sendLogsRow, sparseIntArray);
            put(37, ProfileActivity.this.sendLastLogsRow, sparseIntArray);
            put(38, ProfileActivity.this.clearLogsRow, sparseIntArray);
            put(39, ProfileActivity.this.switchBackendRow, sparseIntArray);
            put(40, ProfileActivity.this.versionRow, sparseIntArray);
            put(41, ProfileActivity.this.emptyRow, sparseIntArray);
            put(42, ProfileActivity.this.bottomPaddingRow, sparseIntArray);
            put(43, ProfileActivity.this.infoHeaderRow, sparseIntArray);
            put(44, ProfileActivity.this.infoHeaderRowEmpty, sparseIntArray);
            put(45, ProfileActivity.this.infoEndRowEmpty, sparseIntArray);
            put(46, ProfileActivity.this.phoneRow, sparseIntArray);
            put(47, ProfileActivity.this.noteRow, sparseIntArray);
            put(48, ProfileActivity.this.locationRow, sparseIntArray);
            put(49, ProfileActivity.this.userInfoRow, sparseIntArray);
            put(50, ProfileActivity.this.channelInfoRow, sparseIntArray);
            put(51, ProfileActivity.this.usernameRow, sparseIntArray);
            put(52, ProfileActivity.this.notificationsDividerRow, sparseIntArray);
            put(53, ProfileActivity.this.reportDividerRow, sparseIntArray);
            put(54, ProfileActivity.this.notificationsRow, sparseIntArray);
            put(55, ProfileActivity.this.infoSectionRow, sparseIntArray);
            put(56, ProfileActivity.this.affiliateRow, sparseIntArray);
            put(57, ProfileActivity.this.infoAffiliateRow, sparseIntArray);
            put(58, ProfileActivity.this.sendMessageRow, sparseIntArray);
            put(59, ProfileActivity.this.reportRow, sparseIntArray);
            put(60, ProfileActivity.this.reportReactionRow, sparseIntArray);
            put(61, ProfileActivity.this.addToContactsRow, sparseIntArray);
            put(62, ProfileActivity.this.settingsTimerRow, sparseIntArray);
            put(63, ProfileActivity.this.settingsKeyRow, sparseIntArray);
            put(64, ProfileActivity.this.secretSettingsSectionRow, sparseIntArray);
            put(65, ProfileActivity.this.membersHeaderRow, sparseIntArray);
            put(66, ProfileActivity.this.addMemberRow, sparseIntArray);
            put(67, ProfileActivity.this.subscribersRow, sparseIntArray);
            put(68, ProfileActivity.this.subscribersRequestsRow, sparseIntArray);
            put(69, ProfileActivity.this.administratorsRow, sparseIntArray);
            put(70, ProfileActivity.this.settingsRow, sparseIntArray);
            put(71, ProfileActivity.this.blockedUsersRow, sparseIntArray);
            put(72, ProfileActivity.this.membersSectionRow, sparseIntArray);
            put(73, ProfileActivity.this.channelBalanceSectionRow, sparseIntArray);
            put(74, ProfileActivity.this.sharedMediaRow, sparseIntArray);
            put(75, ProfileActivity.this.unblockRow, sparseIntArray);
            put(76, ProfileActivity.this.addToGroupButtonRow, sparseIntArray);
            put(77, ProfileActivity.this.addToGroupInfoRow, sparseIntArray);
            put(78, ProfileActivity.this.joinRow, sparseIntArray);
            put(79, ProfileActivity.this.lastSectionRow, sparseIntArray);
            put(80, ProfileActivity.this.notificationsSimpleRow, sparseIntArray);
            put(81, ProfileActivity.this.bizHoursRow, sparseIntArray);
            put(82, ProfileActivity.this.bizLocationRow, sparseIntArray);
            put(83, ProfileActivity.this.birthdayRow, sparseIntArray);
            put(84, ProfileActivity.this.channelRow, sparseIntArray);
            put(85, ProfileActivity.this.botStarsBalanceRow, sparseIntArray);
            put(86, ProfileActivity.this.botTonBalanceRow, sparseIntArray);
            put(87, ProfileActivity.this.channelBalanceRow, sparseIntArray);
            put(88, ProfileActivity.this.balanceDividerRow, sparseIntArray);
            put(89, ProfileActivity.this.botAppRow, sparseIntArray);
            put(90, ProfileActivity.this.botPermissionsHeader, sparseIntArray);
            put(91, ProfileActivity.this.botPermissionLocation, sparseIntArray);
            put(92, ProfileActivity.this.botPermissionEmojiStatus, sparseIntArray);
            put(93, ProfileActivity.this.botPermissionBiometry, sparseIntArray);
            put(94, ProfileActivity.this.botPermissionsDivider, sparseIntArray);
            put(95, ProfileActivity.this.channelDividerRow, sparseIntArray);
            put(96, ProfileActivity.this.musicRow, sparseIntArray);
        }

        private void put(int i, int i2, SparseIntArray sparseIntArray) {
            if (i2 >= 0) {
                sparseIntArray.put(i2, i);
            }
        }
    }

    @Override
    public boolean isLightStatusBar() {
        int themedColor;
        if (this.isPulledDown) {
            return false;
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null && actionBar.isActionModeShowed()) {
            themedColor = getThemedColor(Theme.key_actionBarActionModeDefault);
        } else if (this.mediaHeaderVisible) {
            themedColor = getThemedColor(Theme.key_windowBackgroundWhite);
        } else {
            MessagesController.PeerColor peerColor = this.peerColor;
            if (peerColor != null) {
                themedColor = peerColor.getBgColor2(Theme.isCurrentThemeDark());
            } else {
                themedColor = getThemedColor(Theme.key_actionBarDefault);
            }
        }
        return ColorUtils.calculateLuminance(themedColor) > 0.699999988079071d;
    }

    public void checkPhotoDescriptionAlpha() {
        int i = this.playProfileAnimation;
        if (i == 1 && (!this.fragmentOpened || this.openAnimationInProgress)) {
            this.photoDescriptionProgress = 0.0f;
        } else if (i == 2 && (!this.fragmentOpened || this.openAnimationInProgress)) {
            SimpleTextView simpleTextView = this.onlineTextView[1];
            this.photoDescriptionProgress = simpleTextView == null ? 0.0f : simpleTextView.getAlpha();
        } else if (this.userId == UserConfig.getInstance(this.currentAccount).clientUserId) {
            this.photoDescriptionProgress = this.currentExpandAnimatorValue * (1.0f - this.customAvatarProgress);
        } else {
            this.photoDescriptionProgress = this.currentExpandAnimatorValue * this.customAvatarProgress;
        }
        if (this.userId == UserConfig.getInstance(this.currentAccount).clientUserId) {
            if (this.hasFallbackPhoto) {
                this.customPhotoOffset = AndroidUtilities.dp(28.0f) * this.photoDescriptionProgress;
                SimpleTextView simpleTextView2 = this.onlineTextView[2];
                if (simpleTextView2 != null) {
                    simpleTextView2.setAlpha(this.currentExpandAnimatorValue);
                    this.onlineTextView[3].setAlpha(1.0f - this.currentExpandAnimatorValue);
                    this.onlineTextView[1].setTranslationX(getOnlineTextViewTranslationXWithOffsets(this.lastOnlineTextViewX));
                    this.avatarContainer2.invalidate();
                    ShowDrawable showDrawable = this.showStatusButton;
                    if (showDrawable != null) {
                        showDrawable.setAlpha2(1.0f - this.currentExpandAnimatorValue);
                        return;
                    }
                    return;
                }
                return;
            }
            SimpleTextView simpleTextView3 = this.onlineTextView[2];
            if (simpleTextView3 != null) {
                simpleTextView3.setAlpha(0.0f);
                this.onlineTextView[3].setAlpha(0.0f);
            }
            ShowDrawable showDrawable2 = this.showStatusButton;
            if (showDrawable2 != null) {
                showDrawable2.setAlpha2(1.0f);
                return;
            }
            return;
        }
        if (this.hasCustomPhoto) {
            SimpleTextView simpleTextView4 = this.onlineTextView[2];
            if (simpleTextView4 != null) {
                simpleTextView4.setAlpha(this.photoDescriptionProgress);
            }
            ShowDrawable showDrawable3 = this.showStatusButton;
            if (showDrawable3 != null) {
                showDrawable3.setAlpha2(1.0f - this.photoDescriptionProgress);
                return;
            }
            return;
        }
        SimpleTextView simpleTextView5 = this.onlineTextView[2];
        if (simpleTextView5 != null) {
            simpleTextView5.setAlpha(0.0f);
        }
        ShowDrawable showDrawable4 = this.showStatusButton;
        if (showDrawable4 != null) {
            showDrawable4.setAlpha2(1.0f);
        }
    }

    private float getOnlineTextViewTranslationXWithOffsets(float f) {
        this.lastOnlineTextViewX = f;
        int i = this.playProfileAnimation;
        return f + Math.max(0.0f, (this.customPhotoOffset + getRatingViewTranslationXOffset()) * Utilities.clamp01(i != 2 ? (this.avatarAnimationProgress >= 1.0f || i == 0) ? this.currentExpandAnimatorValue : 0.0f : 1.0f));
    }

    private float getOnlineTextViewTranslationYWithOffsets(float f) {
        this.lastOnlineTextViewY = f;
        int i = this.playProfileAnimation;
        return f + (getRatingViewTranslationYOffset() * (1.0f - Utilities.clamp01(i == 2 ? 1.0f : (this.avatarAnimationProgress >= 1.0f || i == 0) ? this.currentExpandAnimatorValue : 0.0f)));
    }

    public float getRatingViewTranslationXOffset() {
        if (this.ratingView != null) {
            return AndroidUtilities.dp(22.0f) * this.ratingView.getVisibilityFactor();
        }
        return 0.0f;
    }

    public float getRatingViewTranslationYOffset() {
        if (this.ratingView != null) {
            return AndroidUtilities.dp(3.0f) * this.ratingView.getVisibilityFactor();
        }
        return 0.0f;
    }

    public void updateStoriesViewBounds(boolean z) {
        ActionBar actionBar;
        if ((this.storyView == null && this.giftsView == null) || (actionBar = this.actionBar) == null) {
            return;
        }
        float f = actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0.0f;
        float width = this.actionBar.getWidth();
        float fMax = this.actionBar.getBackButton() != null ? Math.max(0.0f, this.actionBar.getBackButton().getRight()) : 0.0f;
        if (this.actionBar.menu != null) {
            for (int i = 0; i < this.actionBar.menu.getChildCount(); i++) {
                View childAt = this.actionBar.menu.getChildAt(i);
                if (childAt.getAlpha() > 0.0f && childAt.getVisibility() == 0) {
                    float left = this.actionBar.menu.getLeft() + ((int) childAt.getX());
                    if (left < width) {
                        width = AndroidUtilities.lerp(width, left, childAt.getAlpha());
                    }
                }
            }
        }
        float f2 = width;
        ProfileStoriesView profileStoriesView = this.storyView;
        if (profileStoriesView != null) {
            profileStoriesView.setBounds(fMax, f2, ((this.actionBar.getHeight() - f) / 2.0f) + f, !z);
        }
        ProfileGiftsView profileGiftsView = this.giftsView;
        if (profileGiftsView != null) {
            profileGiftsView.setBounds(fMax, f2, f + ((this.actionBar.getHeight() - f) / 2.0f), !z, getHeaderOnlyExtraHeight());
        }
    }

    private class ClippedListView extends RecyclerListView implements StoriesListPlaceProvider.ClippedView {
        public ClippedListView(Context context) {
            super(context);
        }

        @Override
        public void updateClip(int[] iArr) {
            iArr[0] = ((BaseFragment) ProfileActivity.this).actionBar.getMeasuredHeight();
            iArr[1] = getMeasuredHeight() - getPaddingBottom();
        }
    }

    public void listCodecs(String str, StringBuilder sb) {
        String[] supportedTypes;
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        try {
            int codecCount = MediaCodecList.getCodecCount();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < codecCount; i++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt != null && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= supportedTypes.length) {
                            break;
                        } else if (supportedTypes[i2].equals(str)) {
                            (codecInfoAt.isEncoder() ? arrayList2 : arrayList).add(Integer.valueOf(i));
                        } else {
                            i2++;
                        }
                    }
                }
            }
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                return;
            }
            sb.append("\n");
            sb.append(arrayList.size());
            sb.append("+");
            sb.append(arrayList2.size());
            sb.append(" ");
            sb.append(str.substring(6));
            sb.append(" codecs:\n");
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (i3 > 0) {
                    sb.append("\n");
                }
                MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(((Integer) arrayList.get(i3)).intValue());
                sb.append("{d} ");
                sb.append(codecInfoAt2.getName());
                sb.append(" (");
                if (Build.VERSION.SDK_INT >= 29) {
                    if (codecInfoAt2.isHardwareAccelerated()) {
                        sb.append("gpu");
                    }
                    if (codecInfoAt2.isSoftwareOnly()) {
                        sb.append("cpu");
                    }
                    if (codecInfoAt2.isVendor()) {
                        sb.append(", v");
                    }
                }
                MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt2.getCapabilitiesForType(str);
                sb.append("; mi=");
                sb.append(capabilitiesForType.getMaxSupportedInstances());
                sb.append(")");
            }
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                if (i4 > 0 || !arrayList.isEmpty()) {
                    sb.append("\n");
                }
                MediaCodecInfo codecInfoAt3 = MediaCodecList.getCodecInfoAt(((Integer) arrayList2.get(i4)).intValue());
                sb.append("{e} ");
                sb.append(codecInfoAt3.getName());
                sb.append(" (");
                if (Build.VERSION.SDK_INT >= 29) {
                    if (codecInfoAt3.isHardwareAccelerated()) {
                        sb.append("gpu");
                    }
                    if (codecInfoAt3.isSoftwareOnly()) {
                        sb.append("cpu");
                    }
                    if (codecInfoAt3.isVendor()) {
                        sb.append(", v");
                    }
                }
                MediaCodecInfo.CodecCapabilities capabilitiesForType2 = codecInfoAt3.getCapabilitiesForType(str);
                sb.append("; mi=");
                sb.append(capabilitiesForType2.getMaxSupportedInstances());
                sb.append(")");
            }
            sb.append("\n");
        } catch (Exception unused) {
        }
    }

    @Override
    public void onTransitionAnimationProgress(boolean z, float f) {
        super.onTransitionAnimationProgress(z, f);
        View view = this.blurredView;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        if (z) {
            this.blurredView.setAlpha(1.0f - f);
        } else {
            this.blurredView.setAlpha(f);
        }
    }

    public void prepareBlurBitmap() {
        if (this.blurredView == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        this.blurredView.setBackground(new BitmapDrawable(bitmapCreateBitmap));
        this.blurredView.setAlpha(0.0f);
        this.blurredView.setVisibility(0);
    }

    public ShowDrawable getShowStatusButton() {
        if (this.showStatusButton == null) {
            ShowDrawable showDrawable = new ShowDrawable(LocaleController.getString(R.string.StatusHiddenShow));
            this.showStatusButton = showDrawable;
            showDrawable.setAlpha((int) (Math.min(1.0f, this.extraHeight / getHeaderExtraHeight()) * 255.0f));
            this.showStatusButton.setBackgroundColor(ColorUtils.blendARGB(Theme.multAlpha(Theme.adaptHSV(this.actionBarBackgroundColor, 0.18f, -0.1f), 0.5f), 603979775, this.currentExpandAnimatorValue));
        }
        return this.showStatusButton;
    }

    public static class ShowDrawable extends Drawable implements SimpleTextView.PressableDrawable {
        private float alpha;
        private float alpha2;
        public final Paint backgroundPaint;
        private final ButtonBounce bounce;
        private boolean pressed;
        private int textColor;
        public final AnimatedTextView.AnimatedTextDrawable textDrawable;
        private View view;

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public ShowDrawable(String str) {
            Paint paint = new Paint(1);
            this.backgroundPaint = paint;
            this.alpha = 1.0f;
            this.alpha2 = 1.0f;
            this.bounce = new ButtonBounce(null) {
                @Override
                public void invalidate() {
                    ShowDrawable.this.invalidateSelf();
                }
            };
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable();
            this.textDrawable = animatedTextDrawable;
            animatedTextDrawable.setCallback(new Drawable.Callback() {
                @Override
                public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                }

                @Override
                public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                }

                @Override
                public void invalidateDrawable(Drawable drawable) {
                    if (ShowDrawable.this.view != null) {
                        ShowDrawable.this.view.invalidate();
                    }
                }
            });
            animatedTextDrawable.setText(str);
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(11.0f));
            animatedTextDrawable.setGravity(17);
            paint.setColor(520093696);
        }

        public void setBackgroundColor(int i) {
            if (this.backgroundPaint.getColor() != i) {
                this.backgroundPaint.setColor(i);
                invalidateSelf();
            }
        }

        public void setTextColor(int i) {
            if (this.textColor != i) {
                this.textColor = i;
                invalidateSelf();
            }
        }

        @Override
        public void draw(Canvas canvas) {
            float f = this.alpha * this.alpha2;
            if (f <= 0.0f) {
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getBounds());
            canvas.save();
            float scale = this.bounce.getScale(0.1f);
            canvas.scale(scale, scale, rectF.centerX(), rectF.centerY());
            int alpha = this.backgroundPaint.getAlpha();
            this.backgroundPaint.setAlpha((int) (alpha * f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), this.backgroundPaint);
            this.backgroundPaint.setAlpha(alpha);
            this.textDrawable.setTextColor(this.textColor);
            this.textDrawable.setAlpha((int) (f * 255.0f));
            this.textDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.textDrawable.draw(canvas);
            canvas.restore();
        }

        @Override
        public int getAlpha() {
            return (int) (this.alpha * 255.0f);
        }

        @Override
        public void setAlpha(int i) {
            this.alpha = i / 255.0f;
            invalidateSelf();
        }

        public void setAlpha2(float f) {
            this.alpha2 = f;
            invalidateSelf();
        }

        @Override
        public int getIntrinsicWidth() {
            return (int) (this.textDrawable.getAnimateToWidth() + AndroidUtilities.dp(11.0f));
        }

        @Override
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(17.33f);
        }

        @Override
        public void setPressed(boolean z) {
            this.bounce.setPressed(z);
            this.pressed = z;
        }

        public void setView(View view) {
            this.view = view;
        }
    }

    public void setLoadingSpan(CharacterStyle characterStyle) {
        if (this.loadingSpan == characterStyle) {
            return;
        }
        this.loadingSpan = characterStyle;
        AndroidUtilities.forEachViews((RecyclerView) this.listView, new com.google.android.exoplayer2.util.Consumer() {
            @Override
            public final void accept(Object obj) {
                this.f$0.lambda$setLoadingSpan$110((View) obj);
            }
        });
    }

    public void lambda$setLoadingSpan$110(View view) {
        if (view instanceof TextDetailCell) {
            TextDetailCell textDetailCell = (TextDetailCell) view;
            textDetailCell.textView.setLoading(this.loadingSpan);
            textDetailCell.valueTextView.setLoading(this.loadingSpan);
        }
    }

    public void createBirthdayEffect() {
        if (this.fragmentView == null || !this.fullyVisible || this.birthdayFetcher == null || getContext() == null) {
            return;
        }
        ProfileBirthdayEffect profileBirthdayEffect = this.birthdayEffect;
        if (profileBirthdayEffect != null) {
            profileBirthdayEffect.updateFetcher(this.birthdayFetcher);
            this.birthdayEffect.invalidate();
        } else {
            ProfileBirthdayEffect profileBirthdayEffect2 = new ProfileBirthdayEffect(this, this.birthdayFetcher);
            this.birthdayEffect = profileBirthdayEffect2;
            ((FrameLayout) this.fragmentView).addView(profileBirthdayEffect2, LayoutHelper.createFrame(-1, -1, 55));
        }
    }

    private void openLocation(boolean z) {
        TLRPC.TL_businessLocation tL_businessLocation;
        String str;
        TLRPC.UserFull userFull = this.userInfo;
        if (userFull == null || (tL_businessLocation = userFull.business_location) == null) {
            return;
        }
        if (tL_businessLocation.geo_point != null && !z) {
            LocationActivity locationActivity = new LocationActivity(3) {
                @Override
                protected boolean disablePermissionCheck() {
                    return true;
                }
            };
            locationActivity.setResourceProvider(this.resourcesProvider);
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.local_id = -1;
            tL_message.peer_id = getMessagesController().getPeer(getDialogId());
            TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
            TLRPC.TL_businessLocation tL_businessLocation2 = this.userInfo.business_location;
            tL_messageMediaGeo.geo = tL_businessLocation2.geo_point;
            tL_messageMediaGeo.address = tL_businessLocation2.address;
            tL_message.media = tL_messageMediaGeo;
            locationActivity.setSharingAllowed(false);
            locationActivity.setMessageObject(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
            presentFragment(locationActivity);
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            str = "mapapp://navigation";
        } else {
            str = "http://maps.google.com/maps";
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str + "?q=" + this.userInfo.business_location.address, new Object[0]))));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public boolean editNotes(View view, final int i) {
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.contentView, this.resourcesProvider, view);
        itemOptionsMakeOptions.addIf(this.userInfo != null, R.drawable.msg_copy, LocaleController.getString(R.string.Copy), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$editNotes$111();
            }
        });
        itemOptionsMakeOptions.add(R.drawable.msg_edit, LocaleController.getString(R.string.Edit), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$editNotes$112();
            }
        });
        itemOptionsMakeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.Remove), true, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$editNotes$114(i);
            }
        });
        itemOptionsMakeOptions.show();
        return true;
    }

    public void lambda$editNotes$111() {
        TLRPC.UserFull userFull = this.userInfo;
        if (userFull == null) {
            return;
        }
        AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(userFull.note, false));
        BulletinFactory.of(this).createCopyBulletin(LocaleController.getString(R.string.TextCopied)).show();
    }

    public void lambda$editNotes$112() {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.userId);
        bundle.putBoolean("focus_notes", true);
        presentFragment(new ContactAddActivity(bundle, this.resourcesProvider));
    }

    public void lambda$editNotes$114(final int i) {
        new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.ProfileNotesRemoveTitle)).setMessage(LocaleController.getString(R.string.ProfileNotesRemoveText)).setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                this.f$0.lambda$editNotes$113(i, alertDialog, i2);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).makeRed(-1).show();
    }

    public void lambda$editNotes$113(int i, AlertDialog alertDialog, int i2) {
        TLRPC.UserFull userFull = getMessagesController().getUserFull(this.userId);
        if (userFull != null) {
            userFull.flags2 &= -4194305;
            userFull.note = null;
            getMessagesStorage().updateUserInfo(userFull, true);
        }
        TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
        tL_updateContactNote.id = getMessagesController().getInputUser(this.userId);
        tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
        getConnectionsManager().sendRequest(tL_updateContactNote, null);
        updateRowsIds();
        this.listAdapter.notifyItemRemoved(i);
    }

    public boolean editRow(View view, final int i) {
        final String strBirthdayString;
        TLRPC.TL_businessLocation tL_businessLocation;
        if (!this.myProfile) {
            return false;
        }
        if (view instanceof ProfileChannelCell) {
            view = ((ProfileChannelCell) view).dialogCell;
        }
        TLRPC.User currentUser = getUserConfig().getCurrentUser();
        if (currentUser == null) {
            return false;
        }
        final TLRPC.UserFull userFull = this.userInfo;
        if (userFull == null) {
            userFull = getMessagesController().getUserFull(currentUser.id);
        }
        if (userFull == null) {
            return false;
        }
        String string = LocaleController.getString(R.string.Copy);
        if (i == this.channelInfoRow || i == this.userInfoRow || i == this.bioRow) {
            strBirthdayString = userFull.about;
        } else if (i == this.bizHoursRow) {
            strBirthdayString = OpeningHoursActivity.toString(this.currentAccount, currentUser, userFull.business_work_hours);
            string = LocaleController.getString(R.string.ProfileHoursCopy);
        } else if (i == this.bizLocationRow) {
            strBirthdayString = userFull.business_location.address;
            string = LocaleController.getString(R.string.ProfileLocationCopy);
        } else if (i == this.usernameRow) {
            strBirthdayString = UserObject.getPublicUsername(currentUser);
            if (strBirthdayString != null) {
                strBirthdayString = "@" + strBirthdayString;
            }
            string = LocaleController.getString(R.string.ProfileCopyUsername);
        } else if (i == this.phoneRow) {
            strBirthdayString = currentUser.phone;
        } else {
            strBirthdayString = i == this.birthdayRow ? UserInfoActivity.birthdayString(this.userInfo.birthday) : null;
        }
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.contentView, this.resourcesProvider, view);
        itemOptionsMakeOptions.setGravity(3);
        if (i == this.bizLocationRow && (tL_businessLocation = userFull.business_location) != null) {
            if (tL_businessLocation.geo_point != null) {
                itemOptionsMakeOptions.add(R.drawable.msg_view_file, LocaleController.getString(R.string.ProfileLocationView), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$editRow$115();
                    }
                });
            }
            itemOptionsMakeOptions.add(R.drawable.msg_map, LocaleController.getString(R.string.ProfileLocationMaps), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$editRow$116();
                }
            });
        }
        if (strBirthdayString != null) {
            itemOptionsMakeOptions.add(R.drawable.msg_copy, string, new Runnable() {
                @Override
                public final void run() {
                    AndroidUtilities.addToClipboard(strBirthdayString);
                }
            });
        }
        if (i == this.bizHoursRow) {
            itemOptionsMakeOptions.add(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileHoursEdit), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$editRow$118();
                }
            });
            itemOptionsMakeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.ProfileHoursRemove), true, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$editRow$122(userFull, i);
                }
            });
        } else if (i == this.bizLocationRow) {
            itemOptionsMakeOptions.add(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileLocationEdit), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$editRow$123();
                }
            });
            itemOptionsMakeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.ProfileLocationRemove), true, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$editRow$127(userFull, i);
                }
            });
        } else if (i == this.usernameRow) {
            itemOptionsMakeOptions.add(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$editRow$128();
                }
            });
        } else if (i == this.channelInfoRow || i == this.userInfoRow || i == this.bioRow) {
            itemOptionsMakeOptions.add(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileEditBio), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$editRow$129();
                }
            });
        } else if (i == this.phoneRow) {
            itemOptionsMakeOptions.add(R.drawable.menu_storage_path, LocaleController.getString(R.string.ProfilePhoneEdit), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$editRow$130();
                }
            });
        } else if (i == this.birthdayRow) {
            itemOptionsMakeOptions.add(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileBirthdayChange), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$editRow$135(userFull);
                }
            });
            itemOptionsMakeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.Remove), true, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$editRow$139(userFull);
                }
            });
        } else if (i == this.channelRow) {
            final TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(userFull.personal_channel_id));
            if (chat != null && ChatObject.getPublicUsername(chat) != null) {
                itemOptionsMakeOptions.add(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileChannelCopy), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$editRow$140(chat);
                    }
                });
            }
            itemOptionsMakeOptions.add(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileChannelChange), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$editRow$141();
                }
            });
            itemOptionsMakeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.Remove), true, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$editRow$145(userFull);
                }
            });
        }
        if (itemOptionsMakeOptions.getItemsCount() <= 0) {
            return false;
        }
        itemOptionsMakeOptions.show();
        return true;
    }

    public void lambda$editRow$115() {
        openLocation(false);
    }

    public void lambda$editRow$116() {
        openLocation(true);
    }

    public void lambda$editRow$118() {
        presentFragment(new OpeningHoursActivity());
    }

    public void lambda$editRow$122(final TLRPC.UserFull userFull, final int i) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.BusinessHoursClearTitle));
        builder.setMessage(LocaleController.getString(R.string.BusinessHoursClearMessage));
        builder.setPositiveButton(LocaleController.getString(R.string.Remove), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                this.f$0.lambda$editRow$121(userFull, i, alertDialog, i2);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(builder.create());
    }

    public void lambda$editRow$121(TLRPC.UserFull userFull, int i, AlertDialog alertDialog, int i2) {
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        if (userFull != null) {
            userFull.business_work_hours = null;
            userFull.flags2 &= -2;
        }
        getConnectionsManager().sendRequest(updatebusinessworkhours, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$editRow$120(tLObject, tL_error);
            }
        });
        updateRowsIds();
        this.listAdapter.notifyItemRemoved(i);
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public void lambda$editRow$120(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$editRow$119(tL_error, tLObject);
            }
        });
    }

    public void lambda$editRow$119(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            BulletinFactory.showError(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show();
        }
    }

    public void lambda$editRow$123() {
        presentFragment(new org.telegram.ui.Business.LocationActivity());
    }

    public void lambda$editRow$127(final TLRPC.UserFull userFull, final int i) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.BusinessLocationClearTitle));
        builder.setMessage(LocaleController.getString(R.string.BusinessLocationClearMessage));
        builder.setPositiveButton(LocaleController.getString(R.string.Remove), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                this.f$0.lambda$editRow$126(userFull, i, alertDialog, i2);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(builder.create());
    }

    public void lambda$editRow$126(TLRPC.UserFull userFull, int i, AlertDialog alertDialog, int i2) {
        TL_account.updateBusinessLocation updatebusinesslocation = new TL_account.updateBusinessLocation();
        if (userFull != null) {
            userFull.business_location = null;
            userFull.flags2 &= -3;
        }
        getConnectionsManager().sendRequest(updatebusinesslocation, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$editRow$125(tLObject, tL_error);
            }
        });
        updateRowsIds();
        this.listAdapter.notifyItemRemoved(i);
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public void lambda$editRow$125(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$editRow$124(tL_error, tLObject);
            }
        });
    }

    public void lambda$editRow$124(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            BulletinFactory.showError(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show();
        }
    }

    public void lambda$editRow$128() {
        presentFragment(new ChangeUsernameActivity());
    }

    public void lambda$editRow$129() {
        presentFragment(new UserInfoActivity());
    }

    public void lambda$editRow$130() {
        presentFragment(new ActionIntroActivity(3));
    }

    public void lambda$editRow$135(final TLRPC.UserFull userFull) {
        showDialog(AlertsCreator.createBirthdayPickerDialog(getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), userFull.birthday, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$editRow$133(userFull, (TL_account.TL_birthday) obj);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$editRow$134();
            }
        }, false, false, getResourceProvider()).create());
    }

    public void lambda$editRow$133(final TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        final TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        getMessagesController().invalidateContentSettings();
        getConnectionsManager().sendRequest(updatebirthday, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$editRow$132(userFull, tL_birthday2, tLObject, tL_error);
            }
        }, 1024);
    }

    public void lambda$editRow$132(final TLRPC.UserFull userFull, final TL_account.TL_birthday tL_birthday, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$editRow$131(tLObject, userFull, tL_birthday, tL_error);
            }
        });
    }

    public void lambda$editRow$131(TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            BulletinFactory.of(this).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.PrivacyBirthdaySetDone)).setDuration(5000).show();
            return;
        }
        if (userFull != null) {
            if (tL_birthday == null) {
                userFull.flags2 &= -33;
            } else {
                userFull.flags2 |= 32;
            }
            userFull.birthday = tL_birthday;
            getMessagesStorage().updateUserInfo(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (getContext() != null) {
                showDialog(new AlertDialog.Builder(getContext(), this.resourceProvider).setTitle(LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle)).setMessage(LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage)).setPositiveButton(LocaleController.getString(R.string.OK), null).create());
                return;
            }
            return;
        }
        BulletinFactory.of(this).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.UnknownError)).show();
    }

    public void lambda$editRow$134() {
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        showAsSheet(new PrivacyControlActivity(11), bottomSheetParams);
    }

    public void lambda$editRow$139(final TLRPC.UserFull userFull) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.BirthdayClearTitle));
        builder.setMessage(LocaleController.getString(R.string.BirthdayClearMessage));
        builder.setPositiveButton(LocaleController.getString(R.string.Remove), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$editRow$138(userFull, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(builder.create());
    }

    public void lambda$editRow$138(TLRPC.UserFull userFull, AlertDialog alertDialog, int i) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        if (userFull != null) {
            userFull.birthday = null;
            userFull.flags2 &= -33;
        }
        getMessagesController().invalidateContentSettings();
        getConnectionsManager().sendRequest(updatebirthday, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$editRow$137(tLObject, tL_error);
            }
        });
        updateListAnimated(false);
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public void lambda$editRow$137(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$editRow$136(tL_error, tLObject);
            }
        });
    }

    public void lambda$editRow$136(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            BulletinFactory.showError(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show();
        }
    }

    public void lambda$editRow$140(TLRPC.Chat chat) {
        AndroidUtilities.addToClipboard("https://" + getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(chat));
    }

    public void lambda$editRow$141() {
        presentFragment(new UserInfoActivity());
    }

    public void lambda$editRow$145(final TLRPC.UserFull userFull) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.ProfileChannelClearTitle));
        builder.setMessage(LocaleController.getString(R.string.ProfileChannelClearMessage));
        builder.setPositiveButton(LocaleController.getString(R.string.Remove), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$editRow$144(userFull, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(builder.create());
    }

    public void lambda$editRow$144(TLRPC.UserFull userFull, AlertDialog alertDialog, int i) {
        TL_account.updatePersonalChannel updatepersonalchannel = new TL_account.updatePersonalChannel();
        updatepersonalchannel.channel = new TLRPC.TL_inputChannelEmpty();
        if (userFull != null) {
            userFull.personal_channel_id = 0L;
            userFull.personal_channel_message = 0;
            userFull.flags2 &= -65;
        }
        getConnectionsManager().sendRequest(updatepersonalchannel, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$editRow$143(tLObject, tL_error);
            }
        });
        updateListAnimated(false);
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    public void lambda$editRow$143(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$editRow$142(tL_error, tLObject);
            }
        });
    }

    public void lambda$editRow$142(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            BulletinFactory.showError(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show();
        }
    }

    private void updateItemsUsername() {
        TLRPC.User user;
        if (!this.myProfile || this.setUsernameItem == null || this.linkItem == null || (user = getMessagesController().getUser(Long.valueOf(this.userId))) == null) {
            return;
        }
        boolean z = UserObject.getPublicUsername(user) != null;
        this.setUsernameItem.setIcon(z ? R.drawable.menu_username_change : R.drawable.menu_username_set);
        this.setUsernameItem.setText(LocaleController.getString(z ? R.string.ProfileUsernameEdit : R.string.ProfileUsernameSet));
        this.linkItem.setVisibility(UserObject.getPublicUsername(user) == null ? 8 : 0);
    }

    private void updateEditColorIcon() {
        if (getContext() == null || this.editColorItem == null) {
            return;
        }
        if (getUserConfig().isPremium()) {
            this.editColorItem.setIcon(R.drawable.menu_profile_colors);
            return;
        }
        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.menu_profile_colors_locked);
        drawable.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarDefaultSubmenuItemIcon), PorterDuff.Mode.SRC_IN));
        Drawable drawable2 = ContextCompat.getDrawable(getContext(), R.drawable.msg_gallery_locked2);
        drawable2.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(-1, -16777216, 0.5f), PorterDuff.Mode.MULTIPLY));
        this.editColorItem.setIcon(new CombinedDrawable(drawable, drawable2, AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f)) {
            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }
        });
    }

    public boolean hasPrivacyCommand() {
        TLRPC.UserFull userFull;
        TL_bots.BotInfo botInfo;
        if (!this.isBot || (userFull = this.userInfo) == null || (botInfo = userFull.bot_info) == null) {
            return false;
        }
        if (botInfo.privacy_policy_url != null) {
            return true;
        }
        Iterator<TLRPC.TL_botCommand> it = botInfo.commands.iterator();
        while (it.hasNext() && !"privacy".equals(it.next().command)) {
        }
        return true;
    }

    public void setCollectibleGiftStatus(TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2;
        if (this.avatarContainer2 == null || (tL_emojiStatusCollectible2 = this.collectibleStatus) == tL_emojiStatusCollectible) {
            return;
        }
        if (tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible == null || tL_emojiStatusCollectible2.collectible_id != tL_emojiStatusCollectible.collectible_id) {
            this.collectibleStatus = tL_emojiStatusCollectible;
            HintView2 hintView2 = this.collectibleHint;
            if (hintView2 != null) {
                hintView2.hide();
            }
            if (tL_emojiStatusCollectible == null || TextUtils.isEmpty(tL_emojiStatusCollectible.slug)) {
                return;
            }
            this.collectibleHintVisible = null;
            this.collectibleHint = new HintView2(getContext(), 3);
            this.collectibleHintBackgroundColor = Theme.blendOver(tL_emojiStatusCollectible.center_color | (-16777216), Theme.multAlpha(tL_emojiStatusCollectible.pattern_color | (-16777216), 0.5f));
            this.collectibleHint.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f));
            this.collectibleHint.setFlicker(0.66f, Theme.multAlpha((-16777216) | tL_emojiStatusCollectible.text_color, 0.5f));
            this.avatarContainer2.addView(this.collectibleHint, LayoutHelper.createFrame(-1, 24.0f));
            this.collectibleHint.setTextSize(9.33f);
            this.collectibleHint.setTextTypeface(AndroidUtilities.bold());
            this.collectibleHint.setText(tL_emojiStatusCollectible.title);
            this.collectibleHint.setDuration(-1L);
            this.collectibleHint.setInnerPadding(5.66f, 2.66f, 5.66f, 2.66f);
            this.collectibleHint.setArrowSize(4.0f, 2.66f);
            this.collectibleHint.setRoundingWithCornerEffect(false);
            this.collectibleHint.setRounding(16.0f);
            this.collectibleHint.show();
            final String str = tL_emojiStatusCollectible.slug;
            this.collectibleHint.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$setCollectibleGiftStatus$146(str, view);
                }
            });
            if (this.extraHeight < AndroidUtilities.dp(82.0f)) {
                this.collectibleHintVisible = Boolean.FALSE;
                this.collectibleHint.setAlpha(0.0f);
            }
            updateCollectibleHint();
            HintView2 hintView22 = this.collectibleHint;
            Objects.requireNonNull(hintView22);
            AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda56(hintView22), 6000L);
        }
    }

    public void lambda$setCollectibleGiftStatus$146(String str, View view) {
        Browser.openUrl(getContext(), "https://" + getMessagesController().linkPrefix + "/nft/" + str);
    }

    public void updateCollectibleHint() {
        HintView2 hintView2 = this.collectibleHint;
        if (hintView2 == null) {
            return;
        }
        hintView2.setJointPx(0.0f, (-hintView2.getPaddingLeft()) + this.nameTextView[1].getX() + ((this.nameTextView[1].getRightDrawableX() - (this.nameTextView[1].getRightDrawableWidth() * AndroidUtilities.lerp(0.45f, 0.25f, this.currentExpandAnimatorValue))) * this.nameTextView[1].getScaleX()));
        float fLerp = AndroidUtilities.lerp(this.expandAnimatorValues, this.currentExpanAnimatorFracture);
        this.collectibleHint.setTranslationY((((-r1.getPaddingBottom()) + this.nameTextView[1].getY()) - AndroidUtilities.dp(24.0f)) + AndroidUtilities.lerp(AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(12.0f), fLerp));
        this.collectibleHint.setBgColor(ColorUtils.blendARGB(this.collectibleHintBackgroundColor, 1342177280, fLerp));
        boolean z = this.extraHeight >= ((float) AndroidUtilities.dp(82.0f));
        Boolean bool = this.collectibleHintVisible;
        if (bool == null || bool.booleanValue() != z) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = this.collectibleHint.animate();
            this.collectibleHintVisible = Boolean.valueOf(z);
            viewPropertyAnimatorAnimate.alpha(z ? 1.0f : 0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT).setDuration(200L).start();
        }
    }

    public void checkStoriesButtonText(int i, boolean z) {
        boolean zIsStoryAlbumPageType = SharedMediaLayout.isStoryAlbumPageType(this.sharedMediaLayout.getClosestTab());
        if (i == this.lastStoriesSelectedCount && zIsStoryAlbumPageType == this.lastStoriesIsInAlbum) {
            return;
        }
        this.lastStoriesSelectedCount = i;
        this.lastStoriesIsInAlbum = zIsStoryAlbumPageType;
        if (zIsStoryAlbumPageType) {
            if (i > 0) {
                this.bottomButton[0].setText(LocaleController.formatPluralString("HideStoriesFromAlbum", i, new Object[0]), z);
                return;
            } else {
                this.bottomButton[0].setText(this.bottomButtonPostTextAlbum, z);
                return;
            }
        }
        if (i > 0 || !MessagesController.getInstance(this.currentAccount).storiesEnabled()) {
            this.bottomButton[0].setText(LocaleController.formatPluralString("ArchiveStories", i, new Object[0]), z);
        } else {
            this.bottomButton[0].setText(this.bottomButtonPostText, z);
        }
    }

    public void showStarRatingBottomSheet(View view) {
        Context context;
        BottomSheet.Builder builder;
        int i;
        float f;
        char c;
        Context context2 = getContext();
        final TLRPC.UserFull userInfo = getUserInfo();
        if (userInfo == null || userInfo.stars_rating == null) {
            return;
        }
        BottomSheet.Builder builder2 = new BottomSheet.Builder(getContext());
        final Runnable dismissRunnable = builder2.getDismissRunnable();
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        final LimitPreviewView limitPreviewView = new LimitPreviewView(getContext(), R.drawable.filled_rating_crown, 0, 0, this.resourcesProvider);
        limitPreviewView.setHideNegativeValues(getDialogId() != UserConfig.getInstance(this.currentAccount).getClientUserId());
        limitPreviewView.setStarRating(userInfo.stars_rating);
        limitPreviewView.setTranslationY(-AndroidUtilities.dp(14.0f));
        linearLayout.addView(limitPreviewView, LayoutHelper.createLinear(-1, -2, 17, 0, 20, 0, 10));
        int i2 = 17;
        if (userInfo.stars_my_pending_rating != null) {
            FrameLayout frameLayout = new FrameLayout(context2);
            linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 17, 40, -12, 40, 20));
            final LinkSpanDrawable.LinksTextView[] linksTextViewArr = new LinkSpanDrawable.LinksTextView[2];
            int i3 = 0;
            while (i3 < 2) {
                LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context2) {
                    @Override
                    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                        if (getAlpha() < 0.9f) {
                            return false;
                        }
                        return super.dispatchTouchEvent(motionEvent);
                    }
                };
                linksTextViewArr[i3] = linksTextView;
                linksTextView.setGravity(i2);
                linksTextViewArr[i3].setTextSize(1, 12.0f);
                linksTextViewArr[i3].setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText));
                linksTextViewArr[i3].setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn));
                frameLayout.addView(linksTextViewArr[i3], LayoutHelper.createFrame(-1, -1, 119));
                linksTextViewArr[i3].setAlpha(i3 == 0 ? 1.0f : 0.0f);
                linksTextViewArr[i3].setScaleX(i3 == 0 ? 1.0f : 0.8f);
                linksTextViewArr[i3].setScaleY(i3 == 0 ? 1.0f : 0.8f);
                i3++;
                i2 = 17;
            }
            final Utilities.Callback callback = new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    ProfileActivity.lambda$showStarRatingBottomSheet$147(linksTextViewArr, (Boolean) obj);
                }
            };
            boolean z = getDialogId() == UserConfig.getInstance(this.currentAccount).getClientUserId();
            long j = userInfo.stars_rating.stars;
            TL_stars.Tl_starsRating tl_starsRating = userInfo.stars_my_pending_rating;
            long j2 = (-j) - (tl_starsRating != null ? tl_starsRating.stars - j : 0L);
            int iMax = Math.max(1, (userInfo.stars_my_pending_rating_date - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) / 86400);
            context = context2;
            long j3 = userInfo.stars_my_pending_rating.stars;
            long j4 = userInfo.stars_rating.stars;
            long j5 = j3 - j4;
            if ((j4 < 0 && !z) || (z && j2 > 0)) {
                linksTextViewArr[0].setTextColor(Theme.getColor(Theme.key_text_RedBold));
                if (z) {
                    c = 0;
                    linksTextViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarRatingLevelNegativeYou", (int) j2)));
                    builder = builder2;
                } else {
                    builder = builder2;
                    linksTextViewArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarRatingLevelNegativeOther, DialogObject.getName(getDialogId()))));
                    c = 0;
                }
            } else {
                builder = builder2;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(TextUtils.concat(LocaleController.formatPluralStringComma("StarRatingFuture", iMax), "\n", LocaleController.formatPluralStringComma("StarRatingFuturePendingPoints", (int) j5)));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.StarRatingFuturePendingPointsPreview), new Runnable() {
                    @Override
                    public final void run() {
                        ProfileActivity.lambda$showStarRatingBottomSheet$148(limitPreviewView, userInfo, callback);
                    }
                }), true));
                c = 0;
                linksTextViewArr[0].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ProfileActivity.lambda$showStarRatingBottomSheet$149(limitPreviewView, userInfo, callback, view2);
                    }
                });
                linksTextViewArr[0].setText(spannableStringBuilder);
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            String pluralStringComma = LocaleController.formatPluralStringComma("StarRatingFuturePreview1", iMax);
            String pluralStringComma2 = LocaleController.formatPluralStringComma("StarRatingFuturePreview2", (int) j5);
            CharSequence[] charSequenceArr = new CharSequence[3];
            charSequenceArr[c] = pluralStringComma;
            charSequenceArr[1] = "\n";
            charSequenceArr[2] = pluralStringComma2;
            spannableStringBuilder2.append(TextUtils.concat(charSequenceArr));
            spannableStringBuilder2.append((CharSequence) " ");
            spannableStringBuilder2.append(AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.StarRatingFuturePendingPointsPreviewBack), new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.lambda$showStarRatingBottomSheet$150(limitPreviewView, userInfo, callback);
                }
            }), true));
            linksTextViewArr[1].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ProfileActivity.lambda$showStarRatingBottomSheet$151(limitPreviewView, userInfo, callback, view2);
                }
            });
            linksTextViewArr[1].setText(spannableStringBuilder2);
        } else {
            context = context2;
            builder = builder2;
        }
        Context context3 = context;
        TextView textView = new TextView(context3);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.StarRatingTitle));
        textView.setTextSize(1, 20.0f);
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i4, this.resourcesProvider));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 6));
        TextView textView2 = new TextView(context3);
        textView2.setGravity(17);
        if (userInfo.id == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.StarRatingSelfDescription)));
            f = 14.0f;
            i = 1;
        } else {
            i = 1;
            textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarRatingDescription, DialogObject.getName(getDialogId()))));
            f = 14.0f;
        }
        textView2.setTextSize(i, f);
        textView2.setTextColor(Theme.getColor(i4, this.resourcesProvider));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 12));
        PremiumFeatureCell premiumFeatureCell = new PremiumFeatureCell(context3, this.resourcesProvider);
        premiumFeatureCell.title.setText(LocaleController.getString(R.string.StarRatingTitle1));
        TextView textView3 = premiumFeatureCell.description;
        int i5 = R.string.StarRatingDescription1;
        int i6 = R.string.StarRatingAdded;
        String string = LocaleController.getString(i6);
        int i7 = Theme.key_featuredStickers_addButton;
        textView3.setText(LocaleController.formatSpannable(i5, createNewSpan(string, Theme.getColor(i7, this.resourcesProvider))));
        premiumFeatureCell.nextIcon.setVisibility(8);
        premiumFeatureCell.imageView.setImageResource(R.drawable.menu_gift);
        premiumFeatureCell.imageView.setColorFilter(Theme.getColor(i4, this.resourcesProvider));
        linearLayout.addView(premiumFeatureCell, LayoutHelper.createLinear(-1, -2, 6.0f, 0.0f, 6.0f, -2.0f));
        PremiumFeatureCell premiumFeatureCell2 = new PremiumFeatureCell(context3, this.resourcesProvider);
        premiumFeatureCell2.title.setText(LocaleController.getString(R.string.StarRatingTitle2));
        premiumFeatureCell2.description.setText(LocaleController.formatSpannable(R.string.StarRatingDescription2, createNewSpan(LocaleController.getString(i6), Theme.getColor(i7, this.resourcesProvider))));
        premiumFeatureCell2.nextIcon.setVisibility(8);
        premiumFeatureCell2.imageView.setImageResource(R.drawable.menu_stars_gift);
        premiumFeatureCell2.imageView.setColorFilter(Theme.getColor(i4, this.resourcesProvider));
        linearLayout.addView(premiumFeatureCell2, LayoutHelper.createLinear(-1, -2, 6.0f, 0.0f, 6.0f, -2.0f));
        PremiumFeatureCell premiumFeatureCell3 = new PremiumFeatureCell(context3, this.resourcesProvider);
        premiumFeatureCell3.title.setText(LocaleController.getString(R.string.StarRatingTitle3));
        premiumFeatureCell3.description.setText(LocaleController.formatSpannable(R.string.StarRatingDescription3, createNewSpan(LocaleController.getString(R.string.StarRatingDeduces), Theme.isCurrentThemeDark() ? ColorUtils.blendARGB(Theme.getColor(Theme.key_windowBackgroundWhiteGrayIcon, this.resourcesProvider), -16777216, 0.25f) : Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, this.resourcesProvider))));
        premiumFeatureCell3.nextIcon.setVisibility(8);
        premiumFeatureCell3.imageView.setImageResource(R.drawable.menu_refund);
        premiumFeatureCell3.imageView.setColorFilter(Theme.getColor(i4, this.resourcesProvider));
        linearLayout.addView(premiumFeatureCell3, LayoutHelper.createLinear(-1, -2, 6.0f, 0.0f, 6.0f, 8.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context3, this.resourcesProvider);
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                dismissRunnable.run();
            }
        });
        buttonWithCounterView.setText(StarGiftSheet.replaceUnderstood(LocaleController.getString(R.string.Understood)), false);
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 16.0f, 10.0f, 16.0f, 8.0f));
        BottomSheet.Builder builder3 = builder;
        builder3.setCustomView(linearLayout);
        builder3.show();
    }

    public static void lambda$showStarRatingBottomSheet$147(LinkSpanDrawable.LinksTextView[] linksTextViewArr, Boolean bool) {
        ViewPropertyAnimator viewPropertyAnimatorScaleY = linksTextViewArr[0].animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).scaleX(bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 0.8f : 1.0f);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        viewPropertyAnimatorScaleY.setInterpolator(cubicBezierInterpolator).setDuration(600L).start();
        linksTextViewArr[1].animate().alpha(bool.booleanValue() ? 1.0f : 0.0f).scaleX(!bool.booleanValue() ? 0.8f : 1.0f).scaleY(bool.booleanValue() ? 1.0f : 0.8f).setInterpolator(cubicBezierInterpolator).setDuration(600L).start();
    }

    public static void lambda$showStarRatingBottomSheet$148(LimitPreviewView limitPreviewView, TLRPC.UserFull userFull, Utilities.Callback callback) {
        limitPreviewView.animateStarRating(userFull.stars_rating, userFull.stars_my_pending_rating);
        callback.run(Boolean.TRUE);
    }

    public static void lambda$showStarRatingBottomSheet$149(LimitPreviewView limitPreviewView, TLRPC.UserFull userFull, Utilities.Callback callback, View view) {
        limitPreviewView.animateStarRating(userFull.stars_rating, userFull.stars_my_pending_rating);
        callback.run(Boolean.TRUE);
    }

    public static void lambda$showStarRatingBottomSheet$150(LimitPreviewView limitPreviewView, TLRPC.UserFull userFull, Utilities.Callback callback) {
        limitPreviewView.animateStarRating(userFull.stars_my_pending_rating, userFull.stars_rating);
        callback.run(Boolean.FALSE);
    }

    public static void lambda$showStarRatingBottomSheet$151(LimitPreviewView limitPreviewView, TLRPC.UserFull userFull, Utilities.Callback callback, View view) {
        limitPreviewView.animateStarRating(userFull.stars_my_pending_rating, userFull.stars_rating);
        callback.run(Boolean.FALSE);
    }

    private static CharSequence createNewSpan(String str, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        FilterCreateActivity.NewSpan newSpan = new FilterCreateActivity.NewSpan(false, 9) {
            @Override
            public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(2.0f), 0.0f);
                super.draw(canvas, charSequence, i2, i3, f, i4, i5, i6, paint);
                canvas.restore();
            }
        };
        newSpan.setText(str);
        newSpan.setColor(i);
        spannableStringBuilder.setSpan(newSpan, 0, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.navigationBarHeight = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).bottom;
        FrameLayout frameLayout = this.bottomButtonsContainer;
        if (frameLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
            int i = this.navigationBarHeight + this.additionFloatingButtonOffset;
            if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i) {
                marginLayoutParams.bottomMargin = i;
                this.bottomButtonsContainer.setLayoutParams(marginLayoutParams);
            }
        }
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout != null) {
            sharedMediaLayout.setPagesPaddingBottom(this.navigationBarHeight + this.additionNavigationBarHeight);
            ProfileGiftsContainer profileGiftsContainer = this.sharedMediaLayout.giftsContainer;
            if (profileGiftsContainer != null) {
                profileGiftsContainer.setButtonOffset(this.navigationBarHeight + this.additionFloatingButtonOffset);
            }
        }
        return WindowInsetsCompat.CONSUMED;
    }

    public static class Button2 extends FrameLayout {
        public Button2(Context context) {
            super(context);
            setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(11.0f));
        }
    }

    public void blur3_InvalidateBlur() {
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.navigationBarHeight) - AndroidUtilities.dp(8.0f);
        int iDp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.iBlur3PositionActionBar.set(0.0f, -iDp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + iDp);
        this.iBlur3PositionMainTabs.set(0.0f, iDp2, this.fragmentView.getMeasuredWidth(), measuredHeight);
        this.iBlur3PositionMainTabs.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        this.scrollableViewNoiseSuppressor.setupRenderNodes(this.iBlur3Positions, this.hasMainTabs ? 1 : 0);
        this.scrollableViewNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override
    public BlurredBackgroundSourceRenderNode getGlassSource() {
        return this.iBlur3SourceGlass;
    }

    @Override
    public void onParentScrollToTop() {
        this.listView.smoothScrollToPosition(0);
    }
}
