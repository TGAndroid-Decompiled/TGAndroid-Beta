package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
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
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.webkit.WebStorage;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Keep;
import androidx.collection.LongSparseArray;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import j$.util.function.Consumer;
import j$.util.function.ToIntFunction;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AuthTokensHelper;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BillingController$$ExternalSyntheticLambda9;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
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
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$BotInfo;
import org.telegram.tgnet.TLRPC$ChannelLocation;
import org.telegram.tgnet.TLRPC$ChannelParticipant;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$ChatParticipant;
import org.telegram.tgnet.TLRPC$ChatParticipants;
import org.telegram.tgnet.TLRPC$ChatPhoto;
import org.telegram.tgnet.TLRPC$DecryptedMessageAction;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$EmojiStatus;
import org.telegram.tgnet.TLRPC$EncryptedChat;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$InputFile;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$MessageAction;
import org.telegram.tgnet.TLRPC$Page;
import org.telegram.tgnet.TLRPC$PageBlock;
import org.telegram.tgnet.TLRPC$PageListItem;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$ReplyMarkup;
import org.telegram.tgnet.TLRPC$TL_account_getPassword;
import org.telegram.tgnet.TLRPC$TL_account_password;
import org.telegram.tgnet.TLRPC$TL_account_updateBirthday;
import org.telegram.tgnet.TLRPC$TL_account_updateBusinessLocation;
import org.telegram.tgnet.TLRPC$TL_account_updateBusinessWorkHours;
import org.telegram.tgnet.TLRPC$TL_account_updateEmojiStatus;
import org.telegram.tgnet.TLRPC$TL_account_updatePersonalChannel;
import org.telegram.tgnet.TLRPC$TL_birthday;
import org.telegram.tgnet.TLRPC$TL_boolFalse;
import org.telegram.tgnet.TLRPC$TL_boolTrue;
import org.telegram.tgnet.TLRPC$TL_businessLocation;
import org.telegram.tgnet.TLRPC$TL_businessWorkHours;
import org.telegram.tgnet.TLRPC$TL_channelFull;
import org.telegram.tgnet.TLRPC$TL_channelLocation;
import org.telegram.tgnet.TLRPC$TL_channelParticipant;
import org.telegram.tgnet.TLRPC$TL_channelParticipantAdmin;
import org.telegram.tgnet.TLRPC$TL_channelParticipantCreator;
import org.telegram.tgnet.TLRPC$TL_channelParticipantsRecent;
import org.telegram.tgnet.TLRPC$TL_channels_channelParticipant;
import org.telegram.tgnet.TLRPC$TL_channels_channelParticipants;
import org.telegram.tgnet.TLRPC$TL_channels_getParticipant;
import org.telegram.tgnet.TLRPC$TL_channels_getParticipants;
import org.telegram.tgnet.TLRPC$TL_channels_updateEmojiStatus;
import org.telegram.tgnet.TLRPC$TL_chatAdminRights;
import org.telegram.tgnet.TLRPC$TL_chatBannedRights;
import org.telegram.tgnet.TLRPC$TL_chatChannelParticipant;
import org.telegram.tgnet.TLRPC$TL_chatFull;
import org.telegram.tgnet.TLRPC$TL_chatParticipant;
import org.telegram.tgnet.TLRPC$TL_chatParticipantAdmin;
import org.telegram.tgnet.TLRPC$TL_chatParticipants;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionSetMessageTTL;
import org.telegram.tgnet.TLRPC$TL_emojiStatus;
import org.telegram.tgnet.TLRPC$TL_emojiStatusEmpty;
import org.telegram.tgnet.TLRPC$TL_emojiStatusUntil;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_forumTopic;
import org.telegram.tgnet.TLRPC$TL_help_dismissSuggestion;
import org.telegram.tgnet.TLRPC$TL_inputGroupCall;
import org.telegram.tgnet.TLRPC$TL_inputPeerEmpty;
import org.telegram.tgnet.TLRPC$TL_inputPhoto;
import org.telegram.tgnet.TLRPC$TL_message;
import org.telegram.tgnet.TLRPC$TL_messageEncryptedAction;
import org.telegram.tgnet.TLRPC$TL_messageMediaGeo;
import org.telegram.tgnet.TLRPC$TL_messages_getWebPage;
import org.telegram.tgnet.TLRPC$TL_messages_reportReaction;
import org.telegram.tgnet.TLRPC$TL_messages_webPage;
import org.telegram.tgnet.TLRPC$TL_pageBlockAnchor;
import org.telegram.tgnet.TLRPC$TL_pageBlockList;
import org.telegram.tgnet.TLRPC$TL_pageBlockParagraph;
import org.telegram.tgnet.TLRPC$TL_pageListItemText;
import org.telegram.tgnet.TLRPC$TL_peerNotifySettings;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$TL_photo;
import org.telegram.tgnet.TLRPC$TL_photos_photo;
import org.telegram.tgnet.TLRPC$TL_photos_updateProfilePhoto;
import org.telegram.tgnet.TLRPC$TL_photos_uploadProfilePhoto;
import org.telegram.tgnet.TLRPC$TL_premiumGiftCodeOption;
import org.telegram.tgnet.TLRPC$TL_userEmpty;
import org.telegram.tgnet.TLRPC$TL_userProfilePhoto;
import org.telegram.tgnet.TLRPC$TL_userProfilePhotoEmpty;
import org.telegram.tgnet.TLRPC$TL_username;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;
import org.telegram.tgnet.TLRPC$UserProfilePhoto;
import org.telegram.tgnet.TLRPC$UserStatus;
import org.telegram.tgnet.TLRPC$VideoSize;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.tgnet.tl.TL_fragment$TL_collectibleInfo;
import org.telegram.tgnet.tl.TL_fragment$TL_getCollectibleInfo;
import org.telegram.tgnet.tl.TL_fragment$TL_inputCollectiblePhone;
import org.telegram.tgnet.tl.TL_fragment$TL_inputCollectibleUsername;
import org.telegram.tgnet.tl.TL_stories$StoryItem;
import org.telegram.tgnet.tl.TL_stories$TL_premium_boostsStatus;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Business.OpeningHoursActivity;
import org.telegram.ui.Business.ProfileHoursCell;
import org.telegram.ui.Business.ProfileLocationCell;
import org.telegram.ui.Cells.AboutLinkCell;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.DividerCell;
import org.telegram.ui.Cells.DrawerProfileCell;
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
import org.telegram.ui.Components.Premium.GiftPremiumBottomSheet;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.PremiumPreviewBottomSheet;
import org.telegram.ui.Components.Premium.ProfilePremiumCell;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.Premium.boosts.PremiumPreviewGiftToUsersBottomSheet;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.ProfileGalleryView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScamDrawable;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.TimerDrawable;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.VectorAvatarThumbDrawable;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.ContactAddActivity;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.GroupCreateActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProfileBirthdayEffect;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.DualCameraView;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.bots.BotBiometry;

public class ProfileActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, DialogsActivity.DialogsActivityDelegate, SharedMediaLayout.SharedMediaPreloaderDelegate, ImageUpdater.ImageUpdaterDelegate, SharedMediaLayout.Delegate {
    private Property<ActionBar, Float> ACTIONBAR_HEADER_PROGRESS;
    private final Property<ProfileActivity, Float> HEADER_SHADOW;
    private AboutLinkCell aboutLinkCell;
    private int actionBarAnimationColorFrom;
    private int actionBarBackgroundColor;
    private Paint actionBarBackgroundPaint;
    private final SparseIntArray adaptedColors;
    private int addMemberRow;
    private int addToContactsRow;
    private int addToGroupButtonRow;
    private int addToGroupInfoRow;
    private int administratorsRow;
    private boolean allowProfileAnimation;
    private boolean allowPullingDown;
    private DrawerProfileCell.AnimatedStatusView animatedStatusView;
    private ActionBarMenuItem animatingItem;
    private Runnable applyBulletin;
    private ActionBarMenuSubItem autoDeleteItem;
    TimerDrawable autoDeleteItemDrawable;
    AutoDeletePopupWrapper autoDeletePopupWrapper;
    private TLRPC$FileLocation avatar;
    private AnimatorSet avatarAnimation;
    private float avatarAnimationProgress;
    private TLRPC$FileLocation avatarBig;
    private int avatarColor;
    private FrameLayout avatarContainer;
    private FrameLayout avatarContainer2;
    private AvatarDrawable avatarDrawable;
    private AvatarImageView avatarImage;
    private RadialProgressView avatarProgressView;
    private float avatarScale;
    int avatarUploadingRequest;
    private float avatarX;
    private float avatarY;
    private ProfileGalleryView avatarsViewPager;
    private PagerIndicatorView avatarsViewPagerIndicatorView;
    private long banFromGroup;
    private int bioRow;
    private ProfileBirthdayEffect birthdayEffect;
    public ProfileBirthdayEffect.BirthdayEffectFetcher birthdayFetcher;
    public int birthdayRow;
    private int bizHoursRow;
    private int bizLocationRow;
    private int blockedUsersRow;
    private View blurredView;
    private TLRPC$BotInfo botInfo;
    private ButtonWithCounterView[] bottomButton;
    private FrameLayout[] bottomButtonContainer;
    private SpannableStringBuilder bottomButtonPostText;
    private FrameLayout bottomButtonsContainer;
    private int bottomPaddingRow;
    private int businessRow;
    private ActionBarMenuItem callItem;
    private boolean callItemVisible;
    private RLottieDrawable cameraDrawable;
    private boolean canSearchMembers;
    private RLottieDrawable cellCameraDrawable;
    private int channelDividerRow;
    private int channelInfoRow;
    private int channelRow;
    private long chatId;
    private TLRPC$ChatFull chatInfo;
    private int chatRow;
    private int clearLogsRow;
    private NestedFrameLayout contentView;
    public boolean createdBirthdayFetcher;
    private boolean creatingChat;
    private CharSequence currentBio;
    private TLRPC$ChannelParticipant currentChannelParticipant;
    private TLRPC$Chat currentChat;
    private TLRPC$EncryptedChat currentEncryptedChat;
    private float currentExpanAnimatorFracture;
    private float currentExpandAnimatorValue;
    private TLRPC$TL_account_password currentPassword;
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
    private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[] emojiStatusDrawable;
    private int emptyRow;
    private StickerEmptyView emptyView;
    private ValueAnimator expandAnimator;
    private float[] expandAnimatorValues;
    private boolean expandPhoto;
    private float expandProgress;
    private float extraHeight;
    private ImageReceiver fallbackImage;
    private int faqRow;
    private int filtersRow;
    private boolean firstLayout;
    private FlagSecureReason flagSecure;
    RLottieImageView floatingButton;
    FrameLayout floatingButtonContainer;
    float floatingButtonHideProgress;
    boolean floatingHidden;
    private final AccelerateDecelerateInterpolator floatingInterpolator;
    private boolean fragmentOpened;
    private boolean fragmentViewAttached;
    private boolean fullyVisible;
    private HintView fwdRestrictedHint;
    private int graceSuggestionRow;
    private int graceSuggestionSectionRow;
    private boolean hasCustomPhoto;
    private boolean hasFallbackPhoto;
    private boolean hasVoiceChatItem;
    private AnimatorSet headerAnimatorSet;
    protected float headerShadowAlpha;
    private AnimatorSet headerShadowAnimatorSet;
    private int helpHeaderRow;
    private int helpSectionCell;
    private boolean hoursExpanded;
    private boolean hoursShownMine;
    private ImageUpdater imageUpdater;
    private int infoEndRow;
    private int infoHeaderRow;
    private int infoSectionRow;
    private int infoStartRow;
    private float initialAnimationExtraHeight;
    private boolean invalidateScroll;
    private boolean isBot;
    public boolean isFragmentOpened;
    private boolean isFragmentPhoneNumber;
    private boolean isInLandscapeMode;
    private boolean[] isOnline;
    private boolean isPulledDown;
    private boolean isQrItemVisible;
    private boolean isTopic;
    private int joinRow;
    private int languageRow;
    private float lastEmojiStatusProgress;
    private int lastMeasuredContentHeight;
    private int lastMeasuredContentWidth;
    private int lastSectionRow;
    private LinearLayoutManager layoutManager;
    private ActionBarMenuSubItem linkItem;
    private ListAdapter listAdapter;
    private int listContentHeight;
    private RecyclerListView listView;
    private float listViewVelocityY;
    private int liteModeRow;
    private boolean loadingBoostsStats;
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
    public boolean myProfile;
    private SimpleTextView[] nameTextView;
    private String nameTextViewRightDrawable2ContentDescription;
    private String nameTextViewRightDrawableContentDescription;
    private float nameX;
    private float nameY;
    private int navigationBarAnimationColorFrom;
    private boolean needSendMessage;
    private boolean needTimerImage;
    private int notificationRow;
    private int notificationsDividerRow;
    HashSet<Integer> notificationsExceptionTopics;
    private int notificationsRow;
    private int notificationsSimpleRow;
    private int numberRow;
    private int numberSectionRow;
    private int onlineCount;
    private SimpleTextView[] onlineTextView;
    private float onlineX;
    private float onlineY;
    private boolean openAnimationInProgress;
    private boolean openSimilar;
    private boolean openingAvatar;
    private ActionBarMenuItem otherItem;
    private int overlayCountVisible;
    private OverlaysView overlaysView;
    private LongSparseArray<TLRPC$ChatParticipant> participantsMap;
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
    private HashMap<Integer, Integer> positionToOffset;
    private boolean preloadedChannelEmojiStatuses;
    private final CrossfadeDrawable[] premiumCrossfadeDrawable;
    private int premiumGiftingRow;
    private int premiumRow;
    private int premiumSectionsRow;
    private final Drawable[] premiumStarDrawable;
    private ImageLocation prevLoadedImageLocation;
    ChatActivityInterface previousTransitionFragment;
    private int privacyRow;
    public ProfileChannelCell.ChannelMessageFetcher profileChannelMessageFetcher;
    boolean profileTransitionInProgress;
    private PhotoViewer.PhotoViewerProvider provider;
    private ActionBarMenuItem qrItem;
    private AnimatorSet qrItemAnimation;
    private int questionRow;
    private boolean recreateMenuAfterAnimation;
    private Rect rect;
    private int reportDividerRow;
    private long reportReactionFromDialogId;
    private int reportReactionMessageId;
    private int reportReactionRow;
    private int reportRow;
    private boolean reportSpam;
    private Theme.ResourcesProvider resourcesProvider;
    private int rowCount;
    public boolean saved;
    int savedScrollOffset;
    int savedScrollPosition;
    boolean savedScrollToSharedMedia;
    private ScamDrawable scamDrawable;
    private AnimatorSet scrimAnimatorSet;
    private Paint scrimPaint;
    private View scrimView;
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
    private SharedMediaLayout sharedMediaLayout;
    private boolean sharedMediaLayoutAttached;
    private SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader;
    private int sharedMediaRow;
    private boolean showAddToContacts;
    boolean showBoostsAlert;
    private ShowDrawable showStatusButton;
    private ArrayList<Integer> sortedUsers;
    private int starsRow;
    private int stickersRow;
    private ProfileStoriesView storyView;
    private int subscribersRequestsRow;
    private int subscribersRow;
    private int switchBackendRow;
    private ImageView timeItem;
    private TimerDrawable timerDrawable;
    private float titleAnimationsYDiff;
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
    private TLRPC$UserFull userInfo;
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
    private final ArrayList<TLRPC$ChatParticipant> visibleChatParticipants;
    private final ArrayList<Integer> visibleSortedUsers;
    private boolean waitCanSendStoryRequest;
    private Paint whitePaint;
    private RLottieImageView writeButton;
    private AnimatorSet writeButtonAnimation;

    private boolean isQrNeedVisible() {
        return true;
    }

    @Override
    public boolean canFinishFragment() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$canFinishFragment(this);
    }

    @Override
    public void didUploadFailed() {
        ImageUpdater.ImageUpdaterDelegate.CC.$default$didUploadFailed(this);
    }

    @Override
    public String getInitialSearchString() {
        return ImageUpdater.ImageUpdaterDelegate.CC.$default$getInitialSearchString(this);
    }

    public static void access$34000(ProfileActivity profileActivity, View view) {
        profileActivity.onTextDetailCellImageClicked(view);
    }

    public static void access$7600(ProfileActivity profileActivity) {
        profileActivity.onWriteButtonClick();
    }

    static int access$9712(ProfileActivity profileActivity, int i) {
        int i2 = profileActivity.listContentHeight + i;
        profileActivity.listContentHeight = i2;
        return i2;
    }

    public class AnonymousClass1 extends Paint {
        AnonymousClass1(int i) {
            super(i);
        }

        @Override
        public void setAlpha(int i) {
            super.setAlpha(i);
            ProfileActivity.this.fragmentView.invalidate();
        }
    }

    public class AnonymousClass2 extends AnimationProperties.FloatProperty<ProfileActivity> {
        AnonymousClass2(String str) {
            super(str);
        }

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
    }

    public class AnonymousClass3 extends PhotoViewer.EmptyPhotoViewerProvider {
        AnonymousClass3() {
        }

        @Override
        public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC$FileLocation tLRPC$FileLocation, int i, boolean z) {
            TLRPC$Chat chat;
            TLRPC$ChatPhoto tLRPC$ChatPhoto;
            TLRPC$FileLocation tLRPC$FileLocation2;
            TLRPC$User user;
            TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto;
            if (tLRPC$FileLocation == null) {
                return null;
            }
            if (ProfileActivity.this.userId == 0 ? ProfileActivity.this.chatId == 0 || (chat = ProfileActivity.this.getMessagesController().getChat(Long.valueOf(ProfileActivity.this.chatId))) == null || (tLRPC$ChatPhoto = chat.photo) == null || (tLRPC$FileLocation2 = tLRPC$ChatPhoto.photo_big) == null : (user = ProfileActivity.this.getMessagesController().getUser(Long.valueOf(ProfileActivity.this.userId))) == null || (tLRPC$UserProfilePhoto = user.photo) == null || (tLRPC$FileLocation2 = tLRPC$UserProfilePhoto.photo_big) == null) {
                tLRPC$FileLocation2 = null;
            }
            if (tLRPC$FileLocation2 == null || tLRPC$FileLocation2.local_id != tLRPC$FileLocation.local_id || tLRPC$FileLocation2.volume_id != tLRPC$FileLocation.volume_id || tLRPC$FileLocation2.dc_id != tLRPC$FileLocation.dc_id) {
                return null;
            }
            int[] iArr = new int[2];
            ProfileActivity.this.avatarImage.getLocationInWindow(iArr);
            PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
            placeProviderObject.viewX = iArr[0];
            placeProviderObject.viewY = iArr[1] - (Build.VERSION.SDK_INT >= 21 ? 0 : AndroidUtilities.statusBarHeight);
            placeProviderObject.parentView = ProfileActivity.this.avatarImage;
            placeProviderObject.imageReceiver = ProfileActivity.this.avatarImage.getImageReceiver();
            if (ProfileActivity.this.userId != 0) {
                placeProviderObject.dialogId = ProfileActivity.this.userId;
            } else if (ProfileActivity.this.chatId != 0) {
                placeProviderObject.dialogId = -ProfileActivity.this.chatId;
            }
            placeProviderObject.thumb = placeProviderObject.imageReceiver.getBitmapSafe();
            placeProviderObject.size = -1L;
            placeProviderObject.radius = ProfileActivity.this.avatarImage.getImageReceiver().getRoundRadius(true);
            placeProviderObject.scale = ProfileActivity.this.avatarContainer.getScaleX();
            placeProviderObject.canEdit = ProfileActivity.this.userId == ProfileActivity.this.getUserConfig().clientUserId;
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

    public static class AvatarImageView extends BackupImageView {
        ProfileGalleryView avatarsViewPager;
        public float bounceScale;
        public boolean drawAvatar;
        boolean drawForeground;
        private ImageReceiver.BitmapHolder drawableHolder;
        private float foregroundAlpha;
        private ImageReceiver foregroundImageReceiver;
        private boolean hasStories;
        private final Paint placeholderPaint;
        float progressToExpand;
        private float progressToInsets;
        private final RectF rect;

        public ChatActivityInterface getPrevFragment() {
            return null;
        }

        public void setAvatarsViewPager(ProfileGalleryView profileGalleryView) {
            this.avatarsViewPager = profileGalleryView;
        }

        public AvatarImageView(Context context) {
            super(context);
            this.rect = new RectF();
            this.drawAvatar = true;
            this.bounceScale = 1.0f;
            this.drawForeground = true;
            this.progressToInsets = 1.0f;
            this.foregroundImageReceiver = new ImageReceiver(this);
            Paint paint = new Paint(1);
            this.placeholderPaint = paint;
            paint.setColor(-16777216);
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
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.foregroundImageReceiver.onDetachedFromWindow();
            ImageReceiver.BitmapHolder bitmapHolder = this.drawableHolder;
            if (bitmapHolder != null) {
                bitmapHolder.release();
                this.drawableHolder = null;
            }
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.foregroundImageReceiver.onAttachedToWindow();
        }

        @Override
        public void setRoundRadius(int i) {
            super.setRoundRadius(i);
            this.foregroundImageReceiver.setRoundRadius(i);
        }

        @Override
        public void onDraw(Canvas canvas) {
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            ImageReceiver imageReceiver = animatedEmojiDrawable != null ? animatedEmojiDrawable.getImageReceiver() : this.imageReceiver;
            canvas.save();
            float f = this.bounceScale;
            canvas.scale(f, f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            float dpf2 = (this.hasStories ? (int) AndroidUtilities.dpf2(3.5f) : 0.0f) * (1.0f - this.progressToExpand);
            float f2 = this.progressToInsets;
            float f3 = this.foregroundAlpha;
            float f4 = dpf2 * f2 * (1.0f - f3);
            if (imageReceiver != null && (f3 < 1.0f || !this.drawForeground)) {
                float f5 = f4 * 2.0f;
                imageReceiver.setImageCoords(f4, f4, getMeasuredWidth() - f5, getMeasuredHeight() - f5);
                if (this.drawAvatar) {
                    imageReceiver.draw(canvas);
                }
            }
            if (this.foregroundAlpha > 0.0f && this.drawForeground) {
                if (this.foregroundImageReceiver.getDrawable() != null) {
                    float f6 = 2.0f * f4;
                    this.foregroundImageReceiver.setImageCoords(f4, f4, getMeasuredWidth() - f6, getMeasuredHeight() - f6);
                    this.foregroundImageReceiver.setAlpha(this.foregroundAlpha);
                    this.foregroundImageReceiver.draw(canvas);
                } else {
                    this.rect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    this.placeholderPaint.setAlpha((int) (this.foregroundAlpha * 255.0f));
                    float f7 = this.foregroundImageReceiver.getRoundRadius()[0];
                    canvas.drawRoundRect(this.rect, f7, f7, this.placeholderPaint);
                }
            }
            canvas.restore();
        }

        @Override
        public void invalidate() {
            super.invalidate();
            ProfileGalleryView profileGalleryView = this.avatarsViewPager;
            if (profileGalleryView != null) {
                profileGalleryView.invalidate();
            }
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
    }

    public class TopView extends View {
        private LinearGradient backgroundGradient;
        private int backgroundGradientColor1;
        private int backgroundGradientColor2;
        private int backgroundGradientHeight;
        private final Paint backgroundPaint;
        private Rect blurBounds;
        public int color1;
        private final AnimatedColor color1Animated;
        public int color2;
        private final AnimatedColor color2Animated;
        private int currentColor;
        private final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emoji;
        private int emojiColor;
        private boolean emojiLoaded;
        public final AnimatedFloat emojiLoadedT;
        private final AnimatedFloat hasColorAnimated;
        private boolean hasColorById;
        private boolean hasEmoji;
        private Paint paint;

        public TopView(Context context) {
            super(context);
            this.paint = new Paint();
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.hasColorAnimated = new AnimatedFloat(this, 350L, cubicBezierInterpolator);
            this.color1Animated = new AnimatedColor(this, 350L, cubicBezierInterpolator);
            this.color2Animated = new AnimatedColor(this, 350L, cubicBezierInterpolator);
            this.backgroundPaint = new Paint(1);
            this.emoji = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, false, AndroidUtilities.dp(20.0f), 13);
            this.emojiLoadedT = new AnimatedFloat(this, 0L, 440L, cubicBezierInterpolator);
            this.blurBounds = new Rect();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i) + AndroidUtilities.dp(3.0f));
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
                this.emojiColor = PeerColorActivity.adaptProfileEmojiColor(this.color1);
            } else {
                ProfileActivity.this.actionBarBackgroundColor = this.currentColor;
                this.hasColorById = false;
                ProfileActivity profileActivity = ProfileActivity.this;
                int i = Theme.key_actionBarDefault;
                if (AndroidUtilities.computePerceivedBrightness(profileActivity.getThemedColor(i)) > 0.8f) {
                    this.emojiColor = ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlueText);
                } else if (AndroidUtilities.computePerceivedBrightness(ProfileActivity.this.getThemedColor(i)) < 0.2f) {
                    this.emojiColor = Theme.multAlpha(ProfileActivity.this.getThemedColor(Theme.key_actionBarDefaultTitle), 0.5f);
                } else {
                    this.emojiColor = PeerColorActivity.adaptProfileEmojiColor(ProfileActivity.this.getThemedColor(i));
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

        public void setBackgroundEmojiId(long j, boolean z) {
            this.emoji.set(j, z);
            this.emoji.setColor(Integer.valueOf(this.emojiColor));
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

        @Override
        protected void onDraw(final Canvas canvas) {
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
                        ProfileActivity.this.previousTransitionFragment.getContentView().drawBlurRect(canvas, getY(), this.blurBounds, ProfileActivity.this.previousTransitionFragment.getActionBar().blurScrimPaint, true);
                    }
                }
                this.paint.setColor(this.currentColor);
                int i2 = this.color1Animated.set(this.color1);
                int i3 = this.color2Animated.set(this.color2);
                int dp = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(144.0f);
                if (this.backgroundGradient == null || this.backgroundGradientColor1 != i2 || this.backgroundGradientColor2 != i3 || this.backgroundGradientHeight != dp) {
                    this.backgroundGradientHeight = dp;
                    this.backgroundGradientColor2 = i3;
                    this.backgroundGradientColor1 = i2;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, dp, new int[]{i3, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.backgroundGradient = linearGradient;
                    this.backgroundPaint.setShader(linearGradient);
                }
                float f = (ProfileActivity.this.playProfileAnimation == 0 ? 1.0f : ProfileActivity.this.avatarAnimationProgress) * this.hasColorAnimated.set(this.hasColorById);
                if (f < 1.0f) {
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i, this.paint);
                }
                if (f > 0.0f) {
                    this.backgroundPaint.setAlpha((int) (f * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), i, this.backgroundPaint);
                }
                if (this.hasEmoji && this.emojiLoadedT.set(isEmojiLoaded()) > 0.0f) {
                    canvas.save();
                    canvas.clipRect(0, 0, getMeasuredWidth(), i);
                    PeerColorActivity.drawProfileIconPattern(getMeasuredWidth() - AndroidUtilities.dp(46.0f), ((((BaseFragment) ProfileActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + AndroidUtilities.dp(144.0f)) - ((1.0f - (ProfileActivity.this.extraHeight / AndroidUtilities.dp(88.0f))) * AndroidUtilities.dp(33.0f)), (((ProfileActivity.this.extraHeight / AndroidUtilities.dp(88.0f)) - 1.0f) * 0.2f) + 1.0f, new Utilities.Callback4() {
                        @Override
                        public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                            ProfileActivity.TopView.this.lambda$onDraw$0(canvas, (Float) obj, (Float) obj2, (Float) obj3, (Float) obj4);
                        }
                    });
                    canvas.restore();
                }
                ChatActivityInterface chatActivityInterface2 = ProfileActivity.this.previousTransitionFragment;
                if (chatActivityInterface2 != null) {
                    ActionBar actionBar = chatActivityInterface2.getActionBar();
                    ActionBarMenu actionBarMenu = actionBar.menu;
                    int save = canvas.save();
                    canvas.translate(actionBar.getX() + actionBarMenu.getX(), actionBar.getY() + actionBarMenu.getY());
                    canvas.saveLayerAlpha(0.0f, 0.0f, actionBarMenu.getMeasuredWidth(), actionBarMenu.getMeasuredHeight(), (int) ((1.0f - ProfileActivity.this.avatarAnimationProgress) * 255.0f), 31);
                    actionBarMenu.draw(canvas);
                    canvas.restoreToCount(save);
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

        public void lambda$onDraw$0(Canvas canvas, Float f, Float f2, Float f3, Float f4) {
            this.emoji.setAlpha((int) (f4.floatValue() * 255.0f * Math.min(1.0f, ProfileActivity.this.extraHeight / AndroidUtilities.dp(88.0f))));
            this.emoji.setBounds((int) (f.floatValue() - (f3.floatValue() * 0.45f)), (int) (f2.floatValue() - (f3.floatValue() * 0.45f)), (int) (f.floatValue() + (f3.floatValue() * 0.45f)), (int) (f2.floatValue() + (f3.floatValue() * 0.45f)));
            this.emoji.draw(canvas);
        }
    }

    public class OverlaysView extends View implements ProfileGalleryView.Callback {
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
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.animator = ofFloat;
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ProfileActivity.OverlaysView.this.lambda$new$0(valueAnimator);
                }
            });
            ofFloat.addListener(new AnimatorListenerAdapter(ProfileActivity.this) {
                AnonymousClass1(ProfileActivity profileActivity) {
                }

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

        public class AnonymousClass1 extends AnimatorListenerAdapter {
            AnonymousClass1(ProfileActivity profileActivity) {
            }

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
        }

        public void saveCurrentPageProgress() {
            this.previousSelectedProgress = this.currentProgress;
            this.previousSelectedPotision = this.selectedPosition;
            this.currentLoadingAnimationProgress = 0.0f;
            this.currentLoadingAnimationDirection = 1;
        }

        public void setAlphaValue(float f, boolean z) {
            if (Build.VERSION.SDK_INT > 18) {
                int i = (int) (255.0f * f);
                this.topOverlayGradient.setAlpha(i);
                this.bottomOverlayGradient.setAlpha(i);
                this.backgroundPaint.setAlpha((int) (66.0f * f));
                this.barPaint.setAlpha((int) (85.0f * f));
                this.selectedBarPaint.setAlpha(i);
                this.alpha = f;
            } else {
                setAlpha(f);
            }
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
                float lerp = AndroidUtilities.lerp(this.animatorValues, this.currentAnimationValue);
                if (z) {
                    this.animator.setDuration(((1.0f - lerp) * 250.0f) / f);
                } else {
                    this.animator.setDuration((250.0f * lerp) / f);
                }
                float[] fArr = this.animatorValues;
                fArr[0] = lerp;
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
            this.bottomOverlayGradient.setBounds(0, (i2 - AndroidUtilities.dp(72.0f)) - AndroidUtilities.dp(24.0f), i, this.bottomOverlayRect.top);
            int i5 = i / 5;
            this.pressedOverlayGradient[0].setBounds(0, 0, i5, i2);
            this.pressedOverlayGradient[1].setBounds(i - i5, 0, i, i2);
        }

        @Override
        protected void onDraw(android.graphics.Canvas r22) {
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

    public class NestedFrameLayout extends SizeNotifierFrameLayout implements NestedScrollingParent3 {
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
                boolean z = true;
                if (view == ProfileActivity.this.listView && ProfileActivity.this.sharedMediaLayoutAttached) {
                    RecyclerListView currentListView = ProfileActivity.this.sharedMediaLayout.getCurrentListView();
                    if (ProfileActivity.this.sharedMediaLayout.getTop() == 0) {
                        iArr[1] = i4;
                        currentListView.scrollBy(0, i4);
                    }
                }
                if (i2 == 0 || i5 != 0) {
                    return;
                }
                ProfileActivity profileActivity = ProfileActivity.this;
                if (i2 <= 0) {
                    z = false;
                }
                profileActivity.hideFloatingButton(z);
            } catch (Throwable th) {
                FileLog.e(th);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ProfileActivity.NestedFrameLayout.this.lambda$onNestedScroll$0();
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
            RecyclerListView currentListView;
            int findFirstVisibleItemPosition;
            if (view == ProfileActivity.this.listView) {
                if (ProfileActivity.this.sharedMediaRow == -1 || !ProfileActivity.this.sharedMediaLayoutAttached) {
                    return;
                }
                boolean isSearchFieldVisible = ((BaseFragment) ProfileActivity.this).actionBar.isSearchFieldVisible();
                int top = ProfileActivity.this.sharedMediaLayout.getTop();
                boolean z = false;
                if (i2 >= 0) {
                    if (isSearchFieldVisible) {
                        RecyclerListView currentListView2 = ProfileActivity.this.sharedMediaLayout.getCurrentListView();
                        iArr[1] = i2;
                        if (top > 0) {
                            iArr[1] = iArr[1] - i2;
                        }
                        if (currentListView2 == null || iArr[1] <= 0) {
                            return;
                        }
                        currentListView2.scrollBy(0, iArr[1]);
                        return;
                    }
                    return;
                }
                if (top <= 0 && (currentListView = ProfileActivity.this.sharedMediaLayout.getCurrentListView()) != null && (findFirstVisibleItemPosition = ((LinearLayoutManager) currentListView.getLayoutManager()).findFirstVisibleItemPosition()) != -1) {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = currentListView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition);
                    int top2 = findViewHolderForAdapterPosition != null ? findViewHolderForAdapterPosition.itemView.getTop() : -1;
                    int paddingTop = currentListView.getPaddingTop();
                    if (top2 != paddingTop || findFirstVisibleItemPosition != 0) {
                        iArr[1] = findFirstVisibleItemPosition != 0 ? i2 : Math.max(i2, top2 - paddingTop);
                        currentListView.scrollBy(0, i2);
                        z = true;
                    }
                }
                if (isSearchFieldVisible) {
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
        public void drawList(Canvas canvas, boolean z, ArrayList<SizeNotifierFrameLayout.IViewWithInvalidateCallback> arrayList) {
            super.drawList(canvas, z, arrayList);
            canvas.save();
            canvas.translate(0.0f, ProfileActivity.this.listView.getY());
            ProfileActivity.this.sharedMediaLayout.drawListForBlur(canvas, arrayList);
            canvas.restore();
        }
    }

    public class PagerIndicatorView extends View {
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
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.animator = ofFloat;
            ofFloat.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ProfileActivity.PagerIndicatorView.this.lambda$new$0(valueAnimator);
                }
            });
            ofFloat.addListener(new AnimatorListenerAdapter(ProfileActivity.this, ProfileActivity.this.expandPhoto) {
                final boolean val$expanded;

                AnonymousClass1(ProfileActivity profileActivity, boolean z) {
                    this.val$expanded = z;
                }

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
                    if (ProfileActivity.this.searchItem != null && !this.val$expanded) {
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
            ProfileActivity.this.avatarsViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener(ProfileActivity.this) {
                private int prevPage;

                @Override
                public void onPageScrollStateChanged(int i) {
                }

                @Override
                public void onPageScrolled(int i, float f, int i2) {
                }

                AnonymousClass2(ProfileActivity profileActivity) {
                }

                @Override
                public void onPageSelected(int i) {
                    int realPosition = ProfileActivity.this.avatarsViewPager.getRealPosition(i);
                    PagerIndicatorView.this.invalidateIndicatorRect(this.prevPage != realPosition);
                    this.prevPage = realPosition;
                    PagerIndicatorView.this.updateAvatarItems();
                }
            });
            adapter.registerDataSetObserver(new DataSetObserver(ProfileActivity.this) {
                AnonymousClass3(ProfileActivity profileActivity) {
                }

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
            float lerp = AndroidUtilities.lerp(this.animatorValues, valueAnimator.getAnimatedFraction());
            if (ProfileActivity.this.searchItem != null && !ProfileActivity.this.isPulledDown) {
                float f = 1.0f - lerp;
                ProfileActivity.this.searchItem.setScaleX(f);
                ProfileActivity.this.searchItem.setScaleY(f);
                ProfileActivity.this.searchItem.setAlpha(f);
            }
            if (ProfileActivity.this.editItemVisible) {
                float f2 = 1.0f - lerp;
                ProfileActivity.this.editItem.setScaleX(f2);
                ProfileActivity.this.editItem.setScaleY(f2);
                ProfileActivity.this.editItem.setAlpha(f2);
            }
            if (ProfileActivity.this.callItemVisible) {
                float f3 = 1.0f - lerp;
                ProfileActivity.this.callItem.setScaleX(f3);
                ProfileActivity.this.callItem.setScaleY(f3);
                ProfileActivity.this.callItem.setAlpha(f3);
            }
            if (ProfileActivity.this.videoCallItemVisible) {
                float f4 = 1.0f - lerp;
                ProfileActivity.this.videoCallItem.setScaleX(f4);
                ProfileActivity.this.videoCallItem.setScaleY(f4);
                ProfileActivity.this.videoCallItem.setAlpha(f4);
            }
            setScaleX(lerp);
            setScaleY(lerp);
            setAlpha(lerp);
        }

        public class AnonymousClass1 extends AnimatorListenerAdapter {
            final boolean val$expanded;

            AnonymousClass1(ProfileActivity profileActivity, boolean z) {
                this.val$expanded = z;
            }

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
                if (ProfileActivity.this.searchItem != null && !this.val$expanded) {
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
        }

        public class AnonymousClass2 implements ViewPager.OnPageChangeListener {
            private int prevPage;

            @Override
            public void onPageScrollStateChanged(int i) {
            }

            @Override
            public void onPageScrolled(int i, float f, int i2) {
            }

            AnonymousClass2(ProfileActivity profileActivity) {
            }

            @Override
            public void onPageSelected(int i) {
                int realPosition = ProfileActivity.this.avatarsViewPager.getRealPosition(i);
                PagerIndicatorView.this.invalidateIndicatorRect(this.prevPage != realPosition);
                this.prevPage = realPosition;
                PagerIndicatorView.this.updateAvatarItems();
            }
        }

        public class AnonymousClass3 extends DataSetObserver {
            AnonymousClass3(ProfileActivity profileActivity) {
            }

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
                        ProfileActivity.PagerIndicatorView.this.updateAvatarItemsInternal();
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
                float lerp = AndroidUtilities.lerp(this.animatorValues, this.animator.getAnimatedFraction());
                if (f <= 0.0f) {
                    this.animator.setDuration(0L);
                } else if (z) {
                    this.animator.setDuration(((1.0f - lerp) * 250.0f) / f);
                } else {
                    this.animator.setDuration((250.0f * lerp) / f);
                }
                float[] fArr = this.animatorValues;
                fArr[0] = lerp;
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
            float measureText = this.textPaint.measureText(getCurrentTitle());
            this.indicatorRect.right = (getMeasuredWidth() - AndroidUtilities.dp(54.0f)) - (ProfileActivity.this.qrItem != null ? AndroidUtilities.dp(48.0f) : 0);
            RectF rectF = this.indicatorRect;
            rectF.left = rectF.right - (measureText + AndroidUtilities.dpf2(16.0f));
            this.indicatorRect.top = (((BaseFragment) ProfileActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + AndroidUtilities.dp(15.0f);
            RectF rectF2 = this.indicatorRect;
            rectF2.bottom = rectF2.top + AndroidUtilities.dp(26.0f);
            setPivotX(this.indicatorRect.centerX());
            setPivotY(this.indicatorRect.centerY());
            invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            float dpf2 = AndroidUtilities.dpf2(12.0f);
            canvas.drawRoundRect(this.indicatorRect, dpf2, dpf2, this.backgroundPaint);
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
        this.verifiedCheckDrawable = new Drawable[2];
        this.verifiedCrossfadeDrawable = new CrossfadeDrawable[2];
        this.premiumCrossfadeDrawable = new CrossfadeDrawable[2];
        this.scrimView = null;
        this.scrimPaint = new Paint(1) {
            AnonymousClass1(int i) {
                super(i);
            }

            @Override
            public void setAlpha(int i) {
                super.setAlpha(i);
                ProfileActivity.this.fragmentView.invalidate();
            }
        };
        this.actionBarBackgroundPaint = new Paint(1);
        this.isOnline = new boolean[1];
        this.headerShadowAlpha = 1.0f;
        this.participantsMap = new LongSparseArray<>();
        this.allowProfileAnimation = true;
        this.disableProfileAnimation = false;
        this.positionToOffset = new HashMap<>();
        this.expandAnimatorValues = new float[]{0.0f, 1.0f};
        this.whitePaint = new Paint();
        this.onlineCount = -1;
        this.rect = new Rect();
        this.visibleChatParticipants = new ArrayList<>();
        this.visibleSortedUsers = new ArrayList<>();
        this.usersForceShowingIn = 0;
        this.firstLayout = true;
        this.invalidateScroll = true;
        this.isQrItemVisible = true;
        this.actionBarAnimationColorFrom = 0;
        this.navigationBarAnimationColorFrom = 0;
        this.reportReactionMessageId = 0;
        this.reportReactionFromDialogId = 0L;
        this.notificationsExceptionTopics = new HashSet<>();
        this.HEADER_SHADOW = new AnimationProperties.FloatProperty<ProfileActivity>("headerShadow") {
            AnonymousClass2(String str) {
                super(str);
            }

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
            AnonymousClass3() {
            }

            @Override
            public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC$FileLocation tLRPC$FileLocation, int i, boolean z) {
                TLRPC$Chat chat;
                TLRPC$ChatPhoto tLRPC$ChatPhoto;
                TLRPC$FileLocation tLRPC$FileLocation2;
                TLRPC$User user;
                TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto;
                if (tLRPC$FileLocation == null) {
                    return null;
                }
                if (ProfileActivity.this.userId == 0 ? ProfileActivity.this.chatId == 0 || (chat = ProfileActivity.this.getMessagesController().getChat(Long.valueOf(ProfileActivity.this.chatId))) == null || (tLRPC$ChatPhoto = chat.photo) == null || (tLRPC$FileLocation2 = tLRPC$ChatPhoto.photo_big) == null : (user = ProfileActivity.this.getMessagesController().getUser(Long.valueOf(ProfileActivity.this.userId))) == null || (tLRPC$UserProfilePhoto = user.photo) == null || (tLRPC$FileLocation2 = tLRPC$UserProfilePhoto.photo_big) == null) {
                    tLRPC$FileLocation2 = null;
                }
                if (tLRPC$FileLocation2 == null || tLRPC$FileLocation2.local_id != tLRPC$FileLocation.local_id || tLRPC$FileLocation2.volume_id != tLRPC$FileLocation.volume_id || tLRPC$FileLocation2.dc_id != tLRPC$FileLocation.dc_id) {
                    return null;
                }
                int[] iArr = new int[2];
                ProfileActivity.this.avatarImage.getLocationInWindow(iArr);
                PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                placeProviderObject.viewX = iArr[0];
                placeProviderObject.viewY = iArr[1] - (Build.VERSION.SDK_INT >= 21 ? 0 : AndroidUtilities.statusBarHeight);
                placeProviderObject.parentView = ProfileActivity.this.avatarImage;
                placeProviderObject.imageReceiver = ProfileActivity.this.avatarImage.getImageReceiver();
                if (ProfileActivity.this.userId != 0) {
                    placeProviderObject.dialogId = ProfileActivity.this.userId;
                } else if (ProfileActivity.this.chatId != 0) {
                    placeProviderObject.dialogId = -ProfileActivity.this.chatId;
                }
                placeProviderObject.thumb = placeProviderObject.imageReceiver.getBitmapSafe();
                placeProviderObject.size = -1L;
                placeProviderObject.radius = ProfileActivity.this.avatarImage.getImageReceiver().getRoundRadius(true);
                placeProviderObject.scale = ProfileActivity.this.avatarContainer.getScaleX();
                placeProviderObject.canEdit = ProfileActivity.this.userId == ProfileActivity.this.getUserConfig().clientUserId;
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
        this.floatingInterpolator = new AccelerateDecelerateInterpolator();
        this.ACTIONBAR_HEADER_PROGRESS = new AnimationProperties.FloatProperty<ActionBar>("avatarAnimationProgress") {
            AnonymousClass44(String str) {
                super(str);
            }

            @Override
            public void setValue(ActionBar actionBar, float f) {
                int themedColor;
                int themedColor2;
                ProfileActivity.this.mediaHeaderAnimationProgress = f;
                if (ProfileActivity.this.storyView != null) {
                    ProfileActivity.this.storyView.setActionBarActionMode(f);
                }
                ProfileActivity.this.topView.invalidate();
                int themedColor3 = ProfileActivity.this.getThemedColor(Theme.key_profile_title);
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
                int i2 = -1;
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
                        i2 = profileActivity2.applyPeerColor(profileActivity2.getThemedColor(Theme.key_profile_verifiedCheck));
                    }
                    ProfileActivity.this.verifiedCheckDrawable[1].setColorFilter(AndroidUtilities.getOffsetColor(i2, ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite), f, 1.0f), PorterDuff.Mode.MULTIPLY);
                }
                if (ProfileActivity.this.premiumStarDrawable[0] != null) {
                    ProfileActivity.this.premiumStarDrawable[0].setColorFilter(AndroidUtilities.getOffsetColor(ProfileActivity.this.getThemedColor(Theme.key_profile_verifiedBackground), ProfileActivity.this.getThemedColor(i), f, 1.0f), PorterDuff.Mode.MULTIPLY);
                }
                if (ProfileActivity.this.premiumStarDrawable[1] != null) {
                    ProfileActivity profileActivity3 = ProfileActivity.this;
                    int applyPeerColor = profileActivity3.applyPeerColor(profileActivity3.getThemedColor(Theme.key_profile_verifiedBackground));
                    ProfileActivity profileActivity4 = ProfileActivity.this;
                    ProfileActivity.this.premiumStarDrawable[1].setColorFilter(AndroidUtilities.getOffsetColor(applyPeerColor, profileActivity4.applyPeerColor(profileActivity4.getThemedColor(i)), f, 1.0f), PorterDuff.Mode.MULTIPLY);
                }
                ProfileActivity.this.updateEmojiStatusDrawableColor();
                if (ProfileActivity.this.avatarsViewPagerIndicatorView.getSecondaryMenuItem() != null) {
                    if (ProfileActivity.this.videoCallItemVisible || ProfileActivity.this.editItemVisible || ProfileActivity.this.callItemVisible) {
                        ProfileActivity profileActivity5 = ProfileActivity.this;
                        profileActivity5.needLayoutText(Math.min(1.0f, profileActivity5.extraHeight / AndroidUtilities.dp(88.0f)));
                    }
                }
            }

            @Override
            public Float get(ActionBar actionBar) {
                return Float.valueOf(ProfileActivity.this.mediaHeaderAnimationProgress);
            }
        };
        this.adaptedColors = new SparseIntArray();
        this.scrimAnimatorSet = null;
        this.savedScrollPosition = -1;
        this.photoDescriptionProgress = -1.0f;
        this.sharedMediaPreloader = sharedMediaPreloader;
    }

    @Override
    public boolean onFragmentCreate() {
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
            TLRPC$User user = getMessagesController().getUser(Long.valueOf(this.userId));
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
            TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
            this.currentChat = chat;
            if (chat == null) {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        ProfileActivity.this.lambda$onFragmentCreate$0(countDownLatch);
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
            this.sortedUsers = new ArrayList<>();
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
        if (this.sharedMediaPreloader == null) {
            this.sharedMediaPreloader = new SharedMediaLayout.SharedMediaPreloader(this);
        }
        this.sharedMediaPreloader.addDelegate(this);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().addObserver(this, NotificationCenter.closeChats);
        getNotificationCenter().addObserver(this, NotificationCenter.topicsDidLoaded);
        getNotificationCenter().addObserver(this, NotificationCenter.updateSearchSettings);
        getNotificationCenter().addObserver(this, NotificationCenter.reloadDialogPhotos);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.storiesReadUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.starBalanceUpdated);
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
            getConnectionsManager().sendRequest(new TLRPC$TL_account_getPassword(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ProfileActivity.this.lambda$onFragmentCreate$1(tLObject, tLRPC$TL_error);
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

            AnonymousClass4() {
            }

            @Override
            public int getTopOffset(int i) {
                return AndroidUtilities.statusBarHeight;
            }

            @Override
            public int getBottomOffset(int i) {
                if (ProfileActivity.this.bottomButtonsContainer == null) {
                    return 0;
                }
                return (int) (((AndroidUtilities.dp(72.0f) - ProfileActivity.this.bottomButtonsContainer.getTranslationY()) - (Math.min(1.0f, 1.0f - Math.abs(ProfileActivity.this.sharedMediaLayout.getTabProgress() - 9.0f)) * ProfileActivity.this.bottomButtonContainer[1].getTranslationY())) - (Math.min(1.0f, 1.0f - Math.abs(ProfileActivity.this.sharedMediaLayout.getTabProgress() - 8.0f)) * ProfileActivity.this.bottomButtonContainer[0].getTranslationY()));
            }

            @Override
            public boolean bottomOffsetAnimated() {
                return ProfileActivity.this.bottomButtonsContainer == null;
            }
        });
        return true;
    }

    public void lambda$onFragmentCreate$0(CountDownLatch countDownLatch) {
        this.currentChat = getMessagesStorage().getChat(this.chatId);
        countDownLatch.countDown();
    }

    public void lambda$onFragmentCreate$1(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_account_password) {
            this.currentPassword = (TLRPC$TL_account_password) tLObject;
        }
    }

    class AnonymousClass4 implements Bulletin.Delegate {
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

        AnonymousClass4() {
        }

        @Override
        public int getTopOffset(int i) {
            return AndroidUtilities.statusBarHeight;
        }

        @Override
        public int getBottomOffset(int i) {
            if (ProfileActivity.this.bottomButtonsContainer == null) {
                return 0;
            }
            return (int) (((AndroidUtilities.dp(72.0f) - ProfileActivity.this.bottomButtonsContainer.getTranslationY()) - (Math.min(1.0f, 1.0f - Math.abs(ProfileActivity.this.sharedMediaLayout.getTabProgress() - 9.0f)) * ProfileActivity.this.bottomButtonContainer[1].getTranslationY())) - (Math.min(1.0f, 1.0f - Math.abs(ProfileActivity.this.sharedMediaLayout.getTabProgress() - 8.0f)) * ProfileActivity.this.bottomButtonContainer[0].getTranslationY()));
        }

        @Override
        public boolean bottomOffsetAnimated() {
            return ProfileActivity.this.bottomButtonsContainer == null;
        }
    }

    public void updateExceptions() {
        if (this.isTopic || !ChatObject.isForum(this.currentChat)) {
            return;
        }
        getNotificationsController().loadTopicsNotificationsExceptions(-this.chatId, new Consumer() {
            @Override
            public final void accept(Object obj) {
                ProfileActivity.this.lambda$updateExceptions$2((HashSet) obj);
            }

            @Override
            public Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    public void lambda$updateExceptions$2(HashSet hashSet) {
        ListAdapter listAdapter;
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
        int i2 = this.notificationsRow;
        if (i2 < 0 || (listAdapter = this.listAdapter) == null) {
            return;
        }
        listAdapter.notifyItemChanged(i2);
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
        getNotificationCenter().removeObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().removeObserver(this, NotificationCenter.topicsDidLoaded);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateSearchSettings);
        getNotificationCenter().removeObserver(this, NotificationCenter.reloadDialogPhotos);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.storiesReadUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        ProfileGalleryView profileGalleryView = this.avatarsViewPager;
        if (profileGalleryView != null) {
            profileGalleryView.onDestroy();
        }
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
        ChatActivity.ThemeDelegate themeDelegate;
        BaseFragment lastFragment = this.parentLayout.getLastFragment();
        if ((lastFragment instanceof ChatActivity) && (themeDelegate = ((ChatActivity) lastFragment).themeDelegate) != null && themeDelegate.getCurrentTheme() != null) {
            this.resourcesProvider = lastFragment.getResourceProvider();
        }
        AnonymousClass5 anonymousClass5 = new ActionBar(context, this.resourcesProvider) {
            AnonymousClass5(Context context2, Theme.ResourcesProvider resourcesProvider) {
                super(context2, resourcesProvider);
            }

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
                super.setItemsColor(i, z);
                if (z || ProfileActivity.this.ttlIconView == null) {
                    return;
                }
                ProfileActivity.this.ttlIconView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
            }

            @Override
            public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                ProfileActivity.this.updateStoriesViewBounds(false);
            }
        };
        anonymousClass5.setForceSkipTouches(true);
        anonymousClass5.setBackgroundColor(0);
        anonymousClass5.setItemsBackgroundColor(this.peerColor != null ? 553648127 : getThemedColor(Theme.key_avatar_actionBarSelectorBlue), false);
        int i = Theme.key_actionBarDefaultIcon;
        anonymousClass5.setItemsColor(getThemedColor(i), false);
        anonymousClass5.setItemsColor(getThemedColor(i), true);
        anonymousClass5.setBackButtonDrawable(new BackDrawable(false));
        anonymousClass5.setCastShadows(false);
        anonymousClass5.setAddToContainer(false);
        anonymousClass5.setClipContent(true);
        anonymousClass5.setOccupyStatusBar((Build.VERSION.SDK_INT < 21 || AndroidUtilities.isTablet() || this.inBubbleMode) ? false : true);
        final ImageView backButton = anonymousClass5.getBackButton();
        backButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                boolean lambda$createActionBar$4;
                lambda$createActionBar$4 = ProfileActivity.this.lambda$createActionBar$4(backButton, view);
                return lambda$createActionBar$4;
            }
        });
        return anonymousClass5;
    }

    class AnonymousClass5 extends ActionBar {
        AnonymousClass5(Context context2, Theme.ResourcesProvider resourcesProvider) {
            super(context2, resourcesProvider);
        }

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
            super.setItemsColor(i, z);
            if (z || ProfileActivity.this.ttlIconView == null) {
                return;
            }
            ProfileActivity.this.ttlIconView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ProfileActivity.this.updateStoriesViewBounds(false);
        }
    }

    public boolean lambda$createActionBar$4(ImageView imageView, View view) {
        ActionBarPopupWindow show = BackButtonMenu.show(this, imageView, getDialogId(), getTopicId(), this.resourcesProvider);
        if (show == null) {
            return false;
        }
        show.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public final void onDismiss() {
                ProfileActivity.this.lambda$createActionBar$3();
            }
        });
        dimBehindView(imageView, 0.3f);
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(true, 1);
        }
        return true;
    }

    public void lambda$createActionBar$3() {
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
                boolean lambda$setParentLayout$5;
                lambda$setParentLayout$5 = ProfileActivity.this.lambda$setParentLayout$5();
                return lambda$setParentLayout$5;
            }
        });
    }

    public boolean lambda$setParentLayout$5() {
        return this.currentEncryptedChat != null || getMessagesController().isChatNoForwards(this.currentChat);
    }

    @Override
    public View createView(final Context context) {
        ?? r12;
        ?? r14;
        int i;
        Object obj;
        FrameLayout frameLayout;
        Theme.ResourcesProvider resourcesProvider;
        boolean z;
        float f;
        float f2;
        ChatAvatarContainer avatarContainer;
        TLRPC$UserFull tLRPC$UserFull;
        TLRPC$ChatParticipants tLRPC$ChatParticipants;
        ChatActivity.ThemeDelegate themeDelegate;
        Theme.createProfileResources(context);
        Theme.createChatResources(context, false);
        final BaseFragment lastFragment = this.parentLayout.getLastFragment();
        if ((lastFragment instanceof ChatActivity) && (themeDelegate = ((ChatActivity) lastFragment).themeDelegate) != null && themeDelegate.getCurrentTheme() != null) {
            this.resourcesProvider = lastFragment.getResourceProvider();
        }
        this.searchTransitionOffset = 0;
        this.searchTransitionProgress = 1.0f;
        this.searchMode = false;
        this.hasOwnBackground = true;
        this.extraHeight = AndroidUtilities.dp(88.0f);
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
        final long j2 = j;
        this.fragmentView = new AnonymousClass7(context);
        TLRPC$ChatFull tLRPC$ChatFull = this.chatInfo;
        ArrayList<Integer> arrayList = (tLRPC$ChatFull == null || (tLRPC$ChatParticipants = tLRPC$ChatFull.participants) == null || tLRPC$ChatParticipants.participants.size() <= 5) ? null : this.sortedUsers;
        SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader = this.sharedMediaPreloader;
        TLRPC$UserFull tLRPC$UserFull2 = this.userInfo;
        AnonymousClass8 anonymousClass8 = new AnonymousClass8(context, j2, sharedMediaPreloader, tLRPC$UserFull2 != null ? tLRPC$UserFull2.common_chats_count : 0, this.sortedUsers, this.chatInfo, tLRPC$UserFull2, this.openSimilar ? 10 : arrayList != null ? 7 : -1, this, this, 1, this.resourcesProvider);
        this.sharedMediaLayout = anonymousClass8;
        anonymousClass8.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
        ActionBarMenu createMenu = this.actionBar.createMenu();
        if (this.userId != getUserConfig().clientUserId || this.myProfile) {
            r12 = 0;
        } else {
            ActionBarMenuItem addItem = createMenu.addItem(37, R.drawable.msg_qr_mini, getResourceProvider());
            this.qrItem = addItem;
            addItem.setContentDescription(LocaleController.getString("GetQRCode", R.string.GetQRCode));
            r12 = 0;
            r12 = 0;
            updateQrItemVisibility(false);
            if (ContactsController.getInstance(this.currentAccount).getPrivacyRules(7) == null) {
                ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
            }
        }
        if (this.imageUpdater == null || this.myProfile) {
            r14 = 1;
        } else {
            r14 = 1;
            r14 = 1;
            ActionBarMenuItem actionBarMenuItemSearchListener = createMenu.addItem(32, R.drawable.ic_ab_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
                AnonymousClass9() {
                }

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
            int i2 = R.string.SearchInSettings;
            actionBarMenuItemSearchListener.setContentDescription(LocaleController.getString("SearchInSettings", i2));
            this.searchItem.setSearchFieldHint(LocaleController.getString("SearchInSettings", i2));
            this.sharedMediaLayout.getSearchItem().setVisibility(8);
            if (this.sharedMediaLayout.getSearchOptionsItem() != null) {
                this.sharedMediaLayout.getSearchOptionsItem().setVisibility(8);
            }
            if (this.expandPhoto) {
                this.searchItem.setVisibility(8);
            }
        }
        ActionBarMenuItem addItem2 = createMenu.addItem(16, R.drawable.profile_video);
        this.videoCallItem = addItem2;
        addItem2.setContentDescription(LocaleController.getString("VideoCall", R.string.VideoCall));
        if (this.chatId != 0) {
            this.callItem = createMenu.addItem(15, R.drawable.msg_voicechat2);
            if (ChatObject.isChannelOrGiga(this.currentChat)) {
                this.callItem.setContentDescription(LocaleController.getString("VoipChannelVoiceChat", R.string.VoipChannelVoiceChat));
            } else {
                this.callItem.setContentDescription(LocaleController.getString("VoipGroupVoiceChat", R.string.VoipGroupVoiceChat));
            }
        } else {
            ActionBarMenuItem addItem3 = createMenu.addItem(15, R.drawable.ic_call);
            this.callItem = addItem3;
            addItem3.setContentDescription(LocaleController.getString("Call", R.string.Call));
        }
        if (this.myProfile) {
            ActionBarMenuItem addItem4 = createMenu.addItem(41, R.drawable.group_edit_profile);
            this.editItem = addItem4;
            addItem4.setContentDescription(LocaleController.getString("Edit", R.string.Edit));
        } else {
            ActionBarMenuItem addItem5 = createMenu.addItem(12, R.drawable.group_edit_profile);
            this.editItem = addItem5;
            addItem5.setContentDescription(LocaleController.getString("Edit", R.string.Edit));
        }
        this.otherItem = createMenu.addItem(10, R.drawable.ic_ab_other, this.resourcesProvider);
        ImageView imageView = new ImageView(context);
        this.ttlIconView = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarDefaultIcon), PorterDuff.Mode.MULTIPLY));
        AndroidUtilities.updateViewVisibilityAnimated(this.ttlIconView, r12, 0.8f, r12);
        this.ttlIconView.setImageResource(R.drawable.msg_mini_autodelete_timer);
        this.otherItem.addView(this.ttlIconView, LayoutHelper.createFrame(12, 12.0f, 19, 8.0f, 2.0f, 0.0f, 0.0f));
        this.otherItem.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        if (this.listView == null || this.imageUpdater == null) {
            i = -1;
            obj = null;
        } else {
            int findFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
            View findViewByPosition = this.layoutManager.findViewByPosition(findFirstVisibleItemPosition);
            if (findViewByPosition != null) {
                findViewByPosition.getTop();
                this.listView.getPaddingTop();
            } else {
                findFirstVisibleItemPosition = -1;
            }
            i = findFirstVisibleItemPosition;
            obj = this.writeButton.getTag();
        }
        createActionBarMenu(r12);
        this.listAdapter = new ListAdapter(context);
        this.searchAdapter = new SearchAdapter(context);
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        this.avatarDrawable = avatarDrawable;
        avatarDrawable.setProfile(r14);
        this.fragmentView.setWillNotDraw(r12);
        View view = this.fragmentView;
        NestedFrameLayout nestedFrameLayout = (NestedFrameLayout) view;
        this.contentView = nestedFrameLayout;
        nestedFrameLayout.needBlur = r14;
        FrameLayout frameLayout2 = (FrameLayout) view;
        AnonymousClass10 anonymousClass10 = new ClippedListView(context) {
            private VelocityTracker velocityTracker;

            @Override
            public boolean hasOverlappingRendering() {
                return false;
            }

            @Override
            public void requestChildOnScreen(View view2, View view3) {
            }

            AnonymousClass10(final Context context2) {
                super(context2);
            }

            @Override
            public boolean canHighlightChildAt(View view2, float f3, float f4) {
                return !(view2 instanceof AboutLinkCell);
            }

            @Override
            public boolean allowSelectChildAtPosition(View view2) {
                return view2 != ProfileActivity.this.sharedMediaLayout;
            }

            @Override
            public void invalidate() {
                super.invalidate();
                View view2 = ProfileActivity.this.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                }
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (ProfileActivity.this.sharedMediaLayout.canEditStories() && ProfileActivity.this.sharedMediaLayout != null && ProfileActivity.this.sharedMediaLayout.isActionModeShown() && ProfileActivity.this.sharedMediaLayout.getClosestTab() == 8) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                VelocityTracker velocityTracker;
                View findViewByPosition2;
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
                    velocityTracker.recycle();
                    this.velocityTracker = null;
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && ProfileActivity.this.allowPullingDown && (findViewByPosition2 = ProfileActivity.this.layoutManager.findViewByPosition(0)) != null) {
                    if (ProfileActivity.this.isPulledDown) {
                        ProfileActivity.this.listView.smoothScrollBy(0, (findViewByPosition2.getTop() - ProfileActivity.this.listView.getMeasuredWidth()) + ActionBar.getCurrentActionBarHeight() + (((BaseFragment) ProfileActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0), CubicBezierInterpolator.EASE_OUT_QUINT);
                    } else {
                        ProfileActivity.this.listView.smoothScrollBy(0, findViewByPosition2.getTop() - AndroidUtilities.dp(88.0f), CubicBezierInterpolator.EASE_OUT_QUINT);
                    }
                }
                return onTouchEvent;
            }

            @Override
            public boolean drawChild(Canvas canvas, View view2, long j3) {
                if (getItemAnimator().isRunning() && view2.getBackground() == null && view2.getTranslationY() != 0.0f) {
                    boolean z2 = ProfileActivity.this.listView.getChildAdapterPosition(view2) == ProfileActivity.this.sharedMediaRow && view2.getAlpha() != 1.0f;
                    if (z2) {
                        ProfileActivity.this.whitePaint.setAlpha((int) (ProfileActivity.this.listView.getAlpha() * 255.0f * view2.getAlpha()));
                    }
                    canvas.drawRect(ProfileActivity.this.listView.getX(), view2.getY(), ProfileActivity.this.listView.getX() + ProfileActivity.this.listView.getMeasuredWidth(), view2.getY() + view2.getHeight(), ProfileActivity.this.whitePaint);
                    if (z2) {
                        ProfileActivity.this.whitePaint.setAlpha((int) (ProfileActivity.this.listView.getAlpha() * 255.0f));
                    }
                }
                return super.drawChild(canvas, view2, j3);
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                if (ProfileActivity.this.bizHoursRow >= 0 && ProfileActivity.this.infoStartRow >= 0 && ProfileActivity.this.infoEndRow >= 0) {
                    drawSectionBackground(canvas, ProfileActivity.this.infoStartRow, ProfileActivity.this.infoEndRow, getThemedColor(Theme.key_windowBackgroundWhite));
                }
                super.dispatchDraw(canvas);
            }

            @Override
            public void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
                super.onLayout(z2, i3, i4, i5, i6);
                ProfileActivity.this.updateBottomButtonY();
            }
        };
        this.listView = anonymousClass10;
        anonymousClass10.setVerticalScrollBarEnabled(r12);
        AnonymousClass11 anonymousClass11 = new AnonymousClass11();
        this.listView.setItemAnimator(anonymousClass11);
        anonymousClass11.setMoveDelay(0L);
        anonymousClass11.setMoveDuration(320L);
        anonymousClass11.setRemoveDuration(320L);
        anonymousClass11.setAddDuration(320L);
        anonymousClass11.setSupportsChangeAnimations(r12);
        anonymousClass11.setDelayAnimations(r12);
        anonymousClass11.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.listView.setClipToPadding(r12);
        this.listView.setHideIfEmpty(r12);
        AnonymousClass12 anonymousClass12 = new LinearLayoutManager(context2) {
            AnonymousClass12(final Context context2) {
                super(context2);
            }

            @Override
            public boolean supportsPredictiveItemAnimations() {
                return ProfileActivity.this.imageUpdater != null;
            }

            @Override
            public int scrollVerticallyBy(int i3, RecyclerView.Recycler recycler, RecyclerView.State state) {
                View findViewByPosition2 = ProfileActivity.this.layoutManager.findViewByPosition(0);
                if (findViewByPosition2 != null && !ProfileActivity.this.openingAvatar) {
                    int top = findViewByPosition2.getTop() - AndroidUtilities.dp(88.0f);
                    if (ProfileActivity.this.allowPullingDown || top <= i3) {
                        if (ProfileActivity.this.allowPullingDown) {
                            if (i3 >= top) {
                                ProfileActivity.this.allowPullingDown = false;
                            } else if (ProfileActivity.this.listView.getScrollState() == 1 && !ProfileActivity.this.isPulledDown) {
                                i3 /= 2;
                            }
                        }
                    } else if (ProfileActivity.this.avatarsViewPager.hasImages() && ProfileActivity.this.avatarImage.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled() && !ProfileActivity.this.isInLandscapeMode && !AndroidUtilities.isTablet()) {
                        ProfileActivity profileActivity = ProfileActivity.this;
                        profileActivity.allowPullingDown = profileActivity.avatarBig == null;
                    }
                    i3 = top;
                }
                return super.scrollVerticallyBy(i3, recycler, state);
            }
        };
        this.layoutManager = anonymousClass12;
        anonymousClass12.setOrientation(r14);
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        linearLayoutManager.mIgnoreTopPadding = r12;
        this.listView.setLayoutManager(linearLayoutManager);
        this.listView.setGlowColor(r12);
        this.listView.setAdapter(this.listAdapter);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public boolean hasDoubleTap(View view2, int i3) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view2, i3);
            }

            @Override
            public void onDoubleTap(View view2, int i3, float f3, float f4) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view2, i3, f3, f4);
            }

            @Override
            public final void onItemClick(View view2, int i3, float f3, float f4) {
                ProfileActivity.this.lambda$createView$10(j2, context2, lastFragment, view2, i3, f3, f4);
            }
        });
        this.listView.setOnItemLongClickListener(new AnonymousClass16(context2));
        if (this.openSimilar) {
            updateRowsIds();
            scrollToSharedMedia();
            this.savedScrollToSharedMedia = r14;
            this.savedScrollPosition = this.sharedMediaRow;
            this.savedScrollOffset = r12;
        }
        if (this.searchItem != null) {
            RecyclerListView recyclerListView = new RecyclerListView(context2);
            this.searchListView = recyclerListView;
            recyclerListView.setVerticalScrollBarEnabled(r12);
            this.searchListView.setLayoutManager(new LinearLayoutManager(context2, r14, r12));
            this.searchListView.setGlowColor(getThemedColor(Theme.key_avatar_backgroundActionBarBlue));
            this.searchListView.setAdapter(this.searchAdapter);
            resourcesProvider = null;
            this.searchListView.setItemAnimator(null);
            this.searchListView.setVisibility(8);
            this.searchListView.setLayoutAnimation(null);
            this.searchListView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
            FrameLayout frameLayout3 = frameLayout2;
            frameLayout3.addView(this.searchListView, LayoutHelper.createFrame(-1, -1, 51));
            this.searchListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view2, int i3) {
                    ProfileActivity.this.lambda$createView$11(view2, i3);
                }
            });
            this.searchListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
                @Override
                public final boolean onItemClick(View view2, int i3) {
                    boolean lambda$createView$13;
                    lambda$createView$13 = ProfileActivity.this.lambda$createView$13(view2, i3);
                    return lambda$createView$13;
                }
            });
            this.searchListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                AnonymousClass17() {
                }

                @Override
                public void onScrollStateChanged(RecyclerView recyclerView, int i3) {
                    if (i3 == 1) {
                        AndroidUtilities.hideKeyboard(ProfileActivity.this.getParentActivity().getCurrentFocus());
                    }
                }
            });
            this.searchListView.setAnimateEmptyView(r14, r14);
            StickerEmptyView stickerEmptyView = new StickerEmptyView(context2, null, r14);
            this.emptyView = stickerEmptyView;
            stickerEmptyView.setAnimateLayoutChange(r14);
            this.emptyView.subtitle.setVisibility(8);
            this.emptyView.setVisibility(8);
            frameLayout3.addView(this.emptyView);
            this.searchAdapter.loadFaqWebPage();
            frameLayout = frameLayout3;
        } else {
            frameLayout = frameLayout2;
            resourcesProvider = null;
        }
        if (this.banFromGroup != 0) {
            final TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(this.banFromGroup));
            if (this.currentChannelParticipant == null) {
                TLRPC$TL_channels_getParticipant tLRPC$TL_channels_getParticipant = new TLRPC$TL_channels_getParticipant();
                tLRPC$TL_channels_getParticipant.channel = MessagesController.getInputChannel(chat);
                tLRPC$TL_channels_getParticipant.participant = getMessagesController().getInputPeer(this.userId);
                getConnectionsManager().sendRequest(tLRPC$TL_channels_getParticipant, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        ProfileActivity.this.lambda$createView$15(tLObject, tLRPC$TL_error);
                    }
                });
            }
            AnonymousClass18 anonymousClass18 = new FrameLayout(this, context2) {
                AnonymousClass18(ProfileActivity this, final Context context2) {
                    super(context2);
                }

                @Override
                protected void onDraw(Canvas canvas) {
                    int intrinsicHeight = Theme.chat_composeShadowDrawable.getIntrinsicHeight();
                    Theme.chat_composeShadowDrawable.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
                    Theme.chat_composeShadowDrawable.draw(canvas);
                    canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), Theme.chat_composeBackgroundPaint);
                }
            };
            anonymousClass18.setWillNotDraw(r12);
            frameLayout.addView(anonymousClass18, LayoutHelper.createFrame(-1, 51, 83));
            anonymousClass18.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ProfileActivity.this.lambda$createView$16(chat, view2);
                }
            });
            TextView textView = new TextView(context2);
            textView.setTextColor(getThemedColor(Theme.key_text_RedRegular));
            textView.setTextSize(r14, 15.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString("BanFromTheGroup", R.string.BanFromTheGroup));
            anonymousClass18.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 1.0f, 0.0f, 0.0f));
            this.listView.setPadding(r12, AndroidUtilities.dp(88.0f), r12, AndroidUtilities.dp(48.0f));
            this.listView.setBottomGlowOffset(AndroidUtilities.dp(48.0f));
        } else {
            this.listView.setPadding(r12, AndroidUtilities.dp(88.0f), r12, r12);
        }
        TopView topView = new TopView(context2);
        this.topView = topView;
        topView.setBackgroundColorId(this.peerColor, r12);
        this.topView.setBackgroundColor(getThemedColor(Theme.key_avatar_backgroundActionBarBlue));
        frameLayout.addView(this.topView);
        this.contentView.blurBehindViews.add(this.topView);
        DrawerProfileCell.AnimatedStatusView animatedStatusView = new DrawerProfileCell.AnimatedStatusView(context2, 20, 60);
        this.animatedStatusView = animatedStatusView;
        animatedStatusView.setPivotX(AndroidUtilities.dp(30.0f));
        this.animatedStatusView.setPivotY(AndroidUtilities.dp(30.0f));
        this.avatarContainer = new FrameLayout(context2);
        this.avatarContainer2 = new AnonymousClass20(context2);
        ImageReceiver imageReceiver = new ImageReceiver(this.avatarContainer2);
        this.fallbackImage = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(11.0f));
        AndroidUtilities.updateViewVisibilityAnimated(this.avatarContainer2, r14, 1.0f, r12);
        frameLayout.addView(this.avatarContainer2, LayoutHelper.createFrame(-1, -1.0f, 8388611, 0.0f, 0.0f, 0.0f, 0.0f));
        this.avatarContainer.setPivotX(0.0f);
        this.avatarContainer.setPivotY(0.0f);
        this.avatarContainer2.addView(this.avatarContainer, LayoutHelper.createFrame(42, 42.0f, 51, 64.0f, 0.0f, 0.0f, 0.0f));
        AnonymousClass21 anonymousClass21 = new AvatarImageView(this, context2) {
            AnonymousClass21(ProfileActivity this, final Context context2) {
                super(context2);
            }

            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (getImageReceiver().hasNotThumb()) {
                    accessibilityNodeInfo.setText(LocaleController.getString("AccDescrProfilePicture", R.string.AccDescrProfilePicture));
                    if (Build.VERSION.SDK_INT >= 21) {
                        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString("Open", R.string.Open)));
                        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString("AccDescrOpenInPhotoViewer", R.string.AccDescrOpenInPhotoViewer)));
                        return;
                    }
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
        this.avatarImage = anonymousClass21;
        anonymousClass21.getImageReceiver().setAllowDecodeSingleFrame(r14);
        this.avatarImage.setRoundRadius(getSmallAvatarRoundRadius());
        this.avatarImage.setPivotX(0.0f);
        this.avatarImage.setPivotY(0.0f);
        this.avatarContainer.addView(this.avatarImage, LayoutHelper.createFrame(-1, -1.0f));
        this.avatarImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ProfileActivity.this.lambda$createView$18(view2);
            }
        });
        this.avatarImage.setHasStories(needInsetForStories());
        this.avatarImage.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view2) {
                boolean lambda$createView$19;
                lambda$createView$19 = ProfileActivity.this.lambda$createView$19(view2);
                return lambda$createView$19;
            }
        });
        AnonymousClass22 anonymousClass22 = new RadialProgressView(context2) {
            private Paint paint;

            AnonymousClass22(final Context context2) {
                super(context2);
                Paint paint = new Paint(1);
                this.paint = paint;
                paint.setColor(1426063360);
            }

            @Override
            public void onDraw(Canvas canvas) {
                if (ProfileActivity.this.avatarImage != null && ProfileActivity.this.avatarImage.getImageReceiver().hasNotThumb()) {
                    this.paint.setAlpha((int) (ProfileActivity.this.avatarImage.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, this.paint);
                }
                super.onDraw(canvas);
            }
        };
        this.avatarProgressView = anonymousClass22;
        anonymousClass22.setSize(AndroidUtilities.dp(26.0f));
        this.avatarProgressView.setProgressColor(-1);
        this.avatarProgressView.setNoProgress(r12);
        this.avatarContainer.addView(this.avatarProgressView, LayoutHelper.createFrame(-1, -1.0f));
        ImageView imageView2 = new ImageView(context2);
        this.timeItem = imageView2;
        imageView2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
        this.timeItem.setScaleType(ImageView.ScaleType.CENTER);
        this.timeItem.setAlpha(0.0f);
        ImageView imageView3 = this.timeItem;
        TimerDrawable timerDrawable = new TimerDrawable(context2, resourcesProvider);
        this.timerDrawable = timerDrawable;
        imageView3.setImageDrawable(timerDrawable);
        this.timeItem.setTranslationY(-1.0f);
        frameLayout.addView(this.timeItem, LayoutHelper.createFrame(34, 34, 51));
        showAvatarProgress(r12, r12);
        ProfileGalleryView profileGalleryView = this.avatarsViewPager;
        if (profileGalleryView != null) {
            profileGalleryView.onDestroy();
        }
        this.overlaysView = new OverlaysView(context2);
        long j3 = this.userId;
        if (j3 == 0) {
            j3 = -this.chatId;
        }
        int i3 = i;
        FrameLayout frameLayout4 = frameLayout;
        this.avatarsViewPager = new ProfileGalleryView(context2, j3, this.actionBar, this.listView, this.avatarImage, getClassGuid(), this.overlaysView) {
            AnonymousClass23(final Context context2, long j32, ActionBar actionBar, RecyclerListView recyclerListView2, AvatarImageView avatarImageView, int i4, ProfileGalleryView.Callback callback) {
                super(context2, j32, actionBar, recyclerListView2, avatarImageView, i4, callback);
            }

            @Override
            protected void setCustomAvatarProgress(float f3) {
                ProfileActivity.this.customAvatarProgress = f3;
                ProfileActivity.this.checkPhotoDescriptionAlpha();
            }
        };
        if (this.userId != getUserConfig().clientUserId && (tLRPC$UserFull = this.userInfo) != null) {
            this.customAvatarProgress = tLRPC$UserFull.profile_photo == null ? 0.0f : 1.0f;
        }
        if (!this.isTopic) {
            this.avatarsViewPager.setChatInfo(this.chatInfo);
        }
        this.avatarContainer2.addView(this.avatarsViewPager);
        this.avatarContainer2.addView(this.overlaysView);
        this.avatarImage.setAvatarsViewPager(this.avatarsViewPager);
        PagerIndicatorView pagerIndicatorView = new PagerIndicatorView(context2);
        this.avatarsViewPagerIndicatorView = pagerIndicatorView;
        this.avatarContainer2.addView(pagerIndicatorView, LayoutHelper.createFrame(-1, -1.0f));
        frameLayout4.addView(this.actionBar);
        float f3 = 54 + ((!this.callItemVisible || this.userId == 0) ? 0 : 54);
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout == null || !(iNavigationLayout.getLastFragment() instanceof ChatActivity) || (avatarContainer = ((ChatActivity) this.parentLayout.getLastFragment()).getAvatarContainer()) == null) {
            z = false;
        } else {
            z = avatarContainer.getTitleTextView().getPaddingRight() != 0;
            if (avatarContainer.getLayoutParams() != null && avatarContainer.getTitleTextView() != null) {
                f3 = (((ViewGroup.MarginLayoutParams) avatarContainer.getLayoutParams()).rightMargin + (avatarContainer.getWidth() - avatarContainer.getTitleTextView().getRight())) / AndroidUtilities.density;
            }
        }
        int i4 = 0;
        while (true) {
            SimpleTextView[] simpleTextViewArr = this.nameTextView;
            if (i4 >= simpleTextViewArr.length) {
                break;
            }
            if (this.playProfileAnimation != 0 || i4 != 0) {
                simpleTextViewArr[i4] = new SimpleTextView(context2) {
                    AnonymousClass24(final Context context2) {
                        super(context2);
                    }

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
                };
                if (i4 == 1) {
                    this.nameTextView[i4].setTextColor(getThemedColor(Theme.key_profile_title));
                } else {
                    this.nameTextView[i4].setTextColor(getThemedColor(Theme.key_actionBarDefaultTitle));
                }
                this.nameTextView[i4].setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(i4 == 0 ? 12.0f : 4.0f));
                this.nameTextView[i4].setTextSize(18);
                this.nameTextView[i4].setGravity(3);
                this.nameTextView[i4].setTypeface(AndroidUtilities.bold());
                this.nameTextView[i4].setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
                this.nameTextView[i4].setPivotX(0.0f);
                this.nameTextView[i4].setPivotY(0.0f);
                this.nameTextView[i4].setAlpha(i4 == 0 ? 0.0f : 1.0f);
                if (i4 == 1) {
                    this.nameTextView[i4].setScrollNonFitText(true);
                    this.nameTextView[i4].setImportantForAccessibility(2);
                }
                this.nameTextView[i4].setFocusable(i4 == 0);
                this.nameTextView[i4].setEllipsizeByGradient(true);
                this.nameTextView[i4].setRightDrawableOutside(i4 == 0);
                this.avatarContainer2.addView(this.nameTextView[i4], LayoutHelper.createFrame(-2, -2.0f, 51, 118.0f, -6.0f, i4 == 0 ? f3 - (z ? 10 : 0) : 0.0f, 0.0f));
            }
            i4++;
        }
        int i5 = 0;
        while (true) {
            SimpleTextView[] simpleTextViewArr2 = this.onlineTextView;
            if (i5 >= simpleTextViewArr2.length) {
                break;
            }
            if (i5 == 1) {
                simpleTextViewArr2[i5] = new LinkSpanDrawable.ClickableSmallTextView(context2) {
                    AnonymousClass25(final Context context2) {
                        super(context2);
                    }

                    @Override
                    public void setAlpha(float f4) {
                        super.setAlpha(f4);
                        ProfileActivity.this.checkPhotoDescriptionAlpha();
                    }

                    @Override
                    public void setTranslationY(float f4) {
                        super.setTranslationY(f4);
                        ProfileActivity.this.onlineTextView[2].setTranslationY(f4);
                        ProfileActivity.this.onlineTextView[3].setTranslationY(f4);
                    }

                    @Override
                    public void setTranslationX(float f4) {
                        super.setTranslationX(f4);
                        ProfileActivity.this.onlineTextView[2].setTranslationX(f4);
                        ProfileActivity.this.onlineTextView[3].setTranslationX(f4);
                    }

                    @Override
                    public void setTextColor(int i6) {
                        super.setTextColor(i6);
                        if (ProfileActivity.this.onlineTextView[2] != null) {
                            ProfileActivity.this.onlineTextView[2].setTextColor(i6);
                            ProfileActivity.this.onlineTextView[3].setTextColor(i6);
                        }
                        if (ProfileActivity.this.showStatusButton != null) {
                            ProfileActivity.this.showStatusButton.setTextColor(Theme.multAlpha(Theme.adaptHSV(i6, -0.02f, 0.15f), 1.4f));
                        }
                    }
                };
            } else {
                simpleTextViewArr2[i5] = new LinkSpanDrawable.ClickableSmallTextView(context2);
            }
            this.onlineTextView[i5].setEllipsizeByGradient(true);
            this.onlineTextView[i5].setTextColor(applyPeerColor(getThemedColor(Theme.key_avatar_subtitleInProfileBlue), true));
            this.onlineTextView[i5].setTextSize(14);
            this.onlineTextView[i5].setGravity(3);
            this.onlineTextView[i5].setAlpha(i5 == 0 ? 0.0f : 1.0f);
            if (i5 == 1 || i5 == 2 || i5 == 3) {
                this.onlineTextView[i5].setPadding(AndroidUtilities.dp(f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(f), AndroidUtilities.dp(2.0f));
            }
            if (i5 > 0) {
                this.onlineTextView[i5].setImportantForAccessibility(2);
            }
            this.onlineTextView[i5].setFocusable(i5 == 0);
            this.avatarContainer2.addView(this.onlineTextView[i5], LayoutHelper.createFrame(-2, -2.0f, 51, 118 - ((i5 == 1 || i5 == 2 || i5 == 3) ? 4 : 0), (i5 == 1 || i5 == 2 || i5 == 3) ? -2 : 0, (i5 == 0 ? f3 - (z ? 10 : 0) : 8.0f) - ((i5 == 1 || i5 == 2 || i5 == 3) ? 4 : 0), 0.0f));
            i5++;
            f = 4.0f;
        }
        checkPhotoDescriptionAlpha();
        this.avatarContainer2.addView(this.animatedStatusView);
        AnonymousClass26 anonymousClass26 = new AudioPlayerAlert.ClippingTextViewSwitcher(context2) {
            final Context val$context;

            AnonymousClass26(final Context context2, final Context context22) {
                super(context22);
                r3 = context22;
            }

            @Override
            protected TextView createTextView() {
                TextView textView2 = new TextView(r3);
                textView2.setTextColor(ProfileActivity.this.getThemedColor(Theme.key_player_actionBarSubtitle));
                textView2.setTextSize(0, AndroidUtilities.dp(14.0f));
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity(3);
                return textView2;
            }
        };
        this.mediaCounterTextView = anonymousClass26;
        anonymousClass26.setAlpha(0.0f);
        this.avatarContainer2.addView(this.mediaCounterTextView, LayoutHelper.createFrame(-2, -2.0f, 51, 118.33f, -2.0f, 8.0f, 0.0f));
        this.storyView = new ProfileStoriesView(context22, this.currentAccount, getDialogId(), this.isTopic, this.avatarContainer, this.avatarImage, this.resourcesProvider) {
            final Context val$context;

            AnonymousClass27(final Context context22, int i6, long j4, boolean z2, View view2, AvatarImageView avatarImageView, Theme.ResourcesProvider resourcesProvider2, final Context context222) {
                super(context222, i6, j4, z2, view2, avatarImageView, resourcesProvider2);
                r20 = context222;
            }

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
                            ProfileActivity.this.getOrCreateStoryViewer().open(r20, ProfileActivity.this.chatInfo.stories, placeProvider);
                            return;
                        }
                    }
                    ProfileActivity.this.getOrCreateStoryViewer().open(r20, ProfileActivity.this.userInfo.stories, placeProvider);
                    return;
                }
                ProfileActivity.this.getOrCreateStoryViewer().open(r20, dialogId, placeProvider);
            }

            @Override
            public void lambda$new$4() {
                ProfileActivity.this.openAvatar();
            }
        };
        updateStoriesViewBounds(false);
        TLRPC$UserFull tLRPC$UserFull3 = this.userInfo;
        if (tLRPC$UserFull3 != null) {
            this.storyView.setStories(tLRPC$UserFull3.stories);
        } else {
            TLRPC$ChatFull tLRPC$ChatFull2 = this.chatInfo;
            if (tLRPC$ChatFull2 != null) {
                this.storyView.setStories(tLRPC$ChatFull2.stories);
            }
        }
        AvatarImageView avatarImageView = this.avatarImage;
        if (avatarImageView != null) {
            avatarImageView.setHasStories(needInsetForStories());
        }
        this.avatarContainer2.addView(this.storyView, LayoutHelper.createFrame(-1, -1.0f));
        updateProfileData(true);
        this.writeButton = new RLottieImageView(context222);
        writeButtonSetBackground();
        if (this.userId != 0) {
            if (this.imageUpdater != null) {
                int i6 = R.raw.camera_outline;
                this.cameraDrawable = new RLottieDrawable(i6, String.valueOf(i6), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
                this.cellCameraDrawable = new RLottieDrawable(i6, i6 + "_cell", AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), false, null);
                this.writeButton.setAnimation(this.cameraDrawable);
                this.writeButton.setContentDescription(LocaleController.getString("AccDescrChangeProfilePicture", R.string.AccDescrChangeProfilePicture));
                this.writeButton.setPadding(AndroidUtilities.dp(2.0f), 0, 0, AndroidUtilities.dp(2.0f));
            } else {
                this.writeButton.setImageResource(R.drawable.profile_newmsg);
                this.writeButton.setContentDescription(LocaleController.getString("AccDescrOpenChat", R.string.AccDescrOpenChat));
            }
        } else {
            this.writeButton.setImageResource(R.drawable.profile_discuss);
            this.writeButton.setContentDescription(LocaleController.getString("ViewDiscussion", R.string.ViewDiscussion));
        }
        this.writeButton.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout4.addView(this.writeButton, LayoutHelper.createFrame(60, 60.0f, 53, 0.0f, 0.0f, 16.0f, 0.0f));
        this.writeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ProfileActivity.this.lambda$createView$20(view2);
            }
        });
        needLayout(false);
        if (i3 == -1 || obj == null) {
            f2 = 0.0f;
        } else {
            this.writeButton.setTag(0);
            this.writeButton.setScaleX(0.2f);
            this.writeButton.setScaleY(0.2f);
            f2 = 0.0f;
            this.writeButton.setAlpha(0.0f);
        }
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            AnonymousClass28() {
            }

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i7) {
                if (i7 == 1) {
                    AndroidUtilities.hideKeyboard(ProfileActivity.this.getParentActivity().getCurrentFocus());
                }
                if (ProfileActivity.this.openingAvatar && i7 != 2) {
                    ProfileActivity.this.openingAvatar = false;
                }
                if (ProfileActivity.this.searchItem != null) {
                    ProfileActivity.this.scrolling = i7 != 0;
                    ProfileActivity.this.searchItem.setEnabled((ProfileActivity.this.scrolling || ProfileActivity.this.isPulledDown) ? false : true);
                }
                ProfileActivity.this.sharedMediaLayout.scrollingByUser = ProfileActivity.this.listView.scrollingByUser;
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i7, int i8) {
                if (ProfileActivity.this.fwdRestrictedHint != null) {
                    ProfileActivity.this.fwdRestrictedHint.hide();
                }
                ProfileActivity.this.checkListViewScroll();
                if (ProfileActivity.this.participantsMap != null && !ProfileActivity.this.usersEndReached && ProfileActivity.this.layoutManager.findLastVisibleItemPosition() > ProfileActivity.this.membersEndRow - 8) {
                    ProfileActivity.this.getChannelParticipants(false);
                }
                ProfileActivity.this.sharedMediaLayout.setPinnedToTop(ProfileActivity.this.sharedMediaLayout.getY() <= 0.0f);
                ProfileActivity.this.updateBottomButtonY();
            }
        });
        UndoView undoView = new UndoView(context222, null, false, this.resourcesProvider);
        this.undoView = undoView;
        frameLayout4.addView(undoView, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.expandAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ProfileActivity.this.lambda$createView$21(valueAnimator);
            }
        });
        this.expandAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.expandAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Animator animator) {
            }

            AnonymousClass29() {
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
        frameLayout4.addView(this.fwdRestrictedHint, LayoutHelper.createFrame(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
        this.sharedMediaLayout.setForwardRestrictedHint(this.fwdRestrictedHint);
        int i7 = Build.VERSION.SDK_INT;
        AnonymousClass30 anonymousClass30 = new PinchToZoomHelper(i7 >= 21 ? (ViewGroup) getParentActivity().getWindow().getDecorView() : frameLayout4, frameLayout4) {
            AnonymousClass30(ViewGroup viewGroup, ViewGroup frameLayout42) {
                super(viewGroup, frameLayout42);
            }

            @Override
            public void invalidateViews() {
                super.invalidateViews();
                ProfileActivity.this.fragmentView.invalidate();
                for (int i8 = 0; i8 < ProfileActivity.this.avatarsViewPager.getChildCount(); i8++) {
                    ProfileActivity.this.avatarsViewPager.getChildAt(i8).invalidate();
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
            public boolean zoomEnabled(View view2, ImageReceiver imageReceiver2) {
                return super.zoomEnabled(view2, imageReceiver2) && ProfileActivity.this.listView.getScrollState() != 1;
            }
        };
        this.pinchToZoomHelper = anonymousClass30;
        anonymousClass30.setCallback(new PinchToZoomHelper.Callback() {
            @Override
            public TextureView getCurrentTextureView() {
                return PinchToZoomHelper.Callback.CC.$default$getCurrentTextureView(this);
            }

            @Override
            public void onZoomFinished(MessageObject messageObject) {
                PinchToZoomHelper.Callback.CC.$default$onZoomFinished(this, messageObject);
            }

            AnonymousClass31() {
            }

            @Override
            public void onZoomStarted(MessageObject messageObject) {
                ProfileActivity.this.listView.cancelClickRunnables(true);
                if (ProfileActivity.this.sharedMediaLayout != null && ProfileActivity.this.sharedMediaLayout.getCurrentListView() != null) {
                    ProfileActivity.this.sharedMediaLayout.getCurrentListView().cancelClickRunnables(true);
                }
                TopView topView2 = ProfileActivity.this.topView;
                ProfileActivity profileActivity = ProfileActivity.this;
                topView2.setBackgroundColor(ColorUtils.blendARGB(profileActivity.getAverageColor(profileActivity.pinchToZoomHelper.getPhotoImage()), ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite), 0.1f));
            }
        });
        this.avatarsViewPager.setPinchToZoomHelper(this.pinchToZoomHelper);
        this.scrimPaint.setAlpha(0);
        this.actionBarBackgroundPaint.setColor(getThemedColor(Theme.key_listSelector));
        this.contentView.blurBehindViews.add(this.sharedMediaLayout);
        updateTtlIcon();
        AnonymousClass32 anonymousClass32 = new View(context222) {
            AnonymousClass32(final Context context222) {
                super(context222);
            }

            @Override
            public void setAlpha(float f4) {
                super.setAlpha(f4);
                View view2 = ProfileActivity.this.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                }
            }
        };
        this.blurredView = anonymousClass32;
        if (i7 >= 23) {
            anonymousClass32.setForeground(new ColorDrawable(ColorUtils.setAlphaComponent(getThemedColor(Theme.key_windowBackgroundWhite), 100)));
        }
        this.blurredView.setFocusable(false);
        this.blurredView.setImportantForAccessibility(2);
        this.blurredView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ProfileActivity.this.lambda$createView$22(view2);
            }
        });
        this.blurredView.setVisibility(8);
        this.blurredView.setFitsSystemWindows(true);
        this.contentView.addView(this.blurredView, LayoutHelper.createFrame(-1, -1.0f));
        createBirthdayEffect();
        createFloatingActionButton(getContext());
        if (this.myProfile) {
            FrameLayout frameLayout5 = new FrameLayout(context222);
            this.bottomButtonsContainer = frameLayout5;
            this.contentView.addView(frameLayout5, LayoutHelper.createFrame(-1.0f, (1.0f / AndroidUtilities.density) + 72.0f, 87));
            this.bottomButtonContainer = new FrameLayout[2];
            this.bottomButton = new ButtonWithCounterView[2];
            for (final int i8 = 0; i8 < 2; i8++) {
                this.bottomButtonContainer[i8] = new FrameLayout(context222);
                this.bottomButtonContainer[i8].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                View view2 = new View(context222);
                view2.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
                this.bottomButtonContainer[i8].addView(view2, LayoutHelper.createFrame(-1.0f, 1.0f / AndroidUtilities.density, 55));
                this.bottomButton[i8] = new ButtonWithCounterView(context222, this.resourcesProvider);
                if (i8 == 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
                    this.bottomButtonPostText = spannableStringBuilder;
                    spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.filled_premium_camera), 0, 1, 33);
                    this.bottomButtonPostText.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
                    this.bottomButton[i8].setText(this.bottomButtonPostText, false);
                } else {
                    this.bottomButton[i8].setText(LocaleController.getString(R.string.StorySave), false);
                }
                this.bottomButton[i8].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        ProfileActivity.this.lambda$createView$26(i8, view3);
                    }
                });
                this.bottomButtonContainer[i8].addView(this.bottomButton[i8], LayoutHelper.createFrame(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
                this.bottomButtonsContainer.addView(this.bottomButtonContainer[i8], LayoutHelper.createFrame(-1, -1, 87));
                if (i8 == 1 || !getMessagesController().storiesEnabled()) {
                    this.bottomButtonContainer[i8].setTranslationY(AndroidUtilities.dp(72.0f));
                }
            }
        }
        return this.fragmentView;
    }

    public class AnonymousClass6 extends ActionBar.ActionBarMenuOnItemClick {
        AnonymousClass6() {
        }

        @Override
        public void onItemClick(int i) {
            String format;
            long j;
            if (ProfileActivity.this.getParentActivity() == null) {
                return;
            }
            if (i == -1) {
                ProfileActivity.this.lambda$onBackPressed$305();
                return;
            }
            String str = null;
            String str2 = null;
            if (i == 2) {
                final TLRPC$User user = ProfileActivity.this.getMessagesController().getUser(Long.valueOf(ProfileActivity.this.userId));
                if (user == null) {
                    return;
                }
                if (!ProfileActivity.this.isBot || MessagesController.isSupportUser(user)) {
                    if (ProfileActivity.this.userBlocked) {
                        ProfileActivity.this.getMessagesController().unblockPeer(ProfileActivity.this.userId);
                        if (BulletinFactory.canShowBulletin(ProfileActivity.this)) {
                            BulletinFactory.createBanBulletin(ProfileActivity.this, false).show();
                            return;
                        }
                        return;
                    }
                    if (ProfileActivity.this.reportSpam) {
                        ProfileActivity profileActivity = ProfileActivity.this;
                        AlertsCreator.showBlockReportSpamAlert(profileActivity, profileActivity.userId, user, null, ProfileActivity.this.currentEncryptedChat, false, null, new MessagesStorage.IntCallback() {
                            @Override
                            public final void run(int i2) {
                                ProfileActivity.AnonymousClass6.this.lambda$onItemClick$0(i2);
                            }
                        }, ProfileActivity.this.resourcesProvider);
                        return;
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this.getParentActivity(), ProfileActivity.this.resourcesProvider);
                    builder.setTitle(LocaleController.getString("BlockUser", R.string.BlockUser));
                    builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name))));
                    builder.setPositiveButton(LocaleController.getString("BlockContact", R.string.BlockContact), new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            ProfileActivity.AnonymousClass6.this.lambda$onItemClick$1(dialogInterface, i2);
                        }
                    });
                    builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                    AlertDialog create = builder.create();
                    ProfileActivity.this.showDialog(create);
                    TextView textView = (TextView) create.getButton(-1);
                    if (textView != null) {
                        textView.setTextColor(ProfileActivity.this.getThemedColor(Theme.key_text_RedBold));
                        return;
                    }
                    return;
                }
                if (ProfileActivity.this.userBlocked) {
                    ProfileActivity.this.getMessagesController().unblockPeer(ProfileActivity.this.userId, new Runnable() {
                        @Override
                        public final void run() {
                            ProfileActivity.AnonymousClass6.this.lambda$onItemClick$3();
                        }
                    });
                    ProfileActivity.this.lambda$onBackPressed$305();
                    return;
                } else {
                    ProfileActivity profileActivity2 = ProfileActivity.this;
                    AlertsCreator.createClearOrDeleteDialogAlert(profileActivity2, false, profileActivity2.currentChat, user, ProfileActivity.this.currentEncryptedChat != null, true, true, new MessagesStorage.BooleanCallback() {
                        @Override
                        public final void run(boolean z) {
                            ProfileActivity.AnonymousClass6.this.lambda$onItemClick$2(user, z);
                        }
                    }, ProfileActivity.this.getResourceProvider());
                    return;
                }
            }
            if (i == 1) {
                TLRPC$User user2 = ProfileActivity.this.getMessagesController().getUser(Long.valueOf(ProfileActivity.this.userId));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user2.id);
                bundle.putBoolean("addContact", true);
                ProfileActivity.this.openAddToContact(user2, bundle);
                return;
            }
            if (i == 3) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("onlySelect", true);
                bundle2.putInt("dialogsType", 3);
                bundle2.putString("selectAlertString", LocaleController.getString("SendContactToText", R.string.SendContactToText));
                bundle2.putString("selectAlertStringGroup", LocaleController.getString("SendContactToGroupText", R.string.SendContactToGroupText));
                DialogsActivity dialogsActivity = new DialogsActivity(bundle2);
                dialogsActivity.setDelegate(ProfileActivity.this);
                ProfileActivity.this.presentFragment(dialogsActivity);
                return;
            }
            if (i == 4) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("user_id", ProfileActivity.this.userId);
                ProfileActivity profileActivity3 = ProfileActivity.this;
                profileActivity3.presentFragment(new ContactAddActivity(bundle3, profileActivity3.resourcesProvider));
                return;
            }
            if (i == 5) {
                final TLRPC$User user3 = ProfileActivity.this.getMessagesController().getUser(Long.valueOf(ProfileActivity.this.userId));
                if (user3 == null || ProfileActivity.this.getParentActivity() == null) {
                    return;
                }
                AlertDialog.Builder builder2 = new AlertDialog.Builder(ProfileActivity.this.getParentActivity(), ProfileActivity.this.resourcesProvider);
                builder2.setTitle(LocaleController.getString("DeleteContact", R.string.DeleteContact));
                builder2.setMessage(LocaleController.getString("AreYouSureDeleteContact", R.string.AreYouSureDeleteContact));
                builder2.setPositiveButton(LocaleController.getString("Delete", R.string.Delete), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        ProfileActivity.AnonymousClass6.this.lambda$onItemClick$4(user3, dialogInterface, i2);
                    }
                });
                builder2.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                AlertDialog create2 = builder2.create();
                ProfileActivity.this.showDialog(create2);
                TextView textView2 = (TextView) create2.getButton(-1);
                if (textView2 != null) {
                    textView2.setTextColor(ProfileActivity.this.getThemedColor(Theme.key_text_RedBold));
                    return;
                }
                return;
            }
            if (i == 7) {
                ProfileActivity.this.leaveChatPressed();
                return;
            }
            if (i == 23) {
                AlertDialog.Builder builder3 = new AlertDialog.Builder(ProfileActivity.this.getContext());
                builder3.setTitle(LocaleController.getPluralString("DeleteTopics", 1));
                TLRPC$TL_forumTopic findTopic = MessagesController.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).getTopicsController().findTopic(ProfileActivity.this.chatId, ProfileActivity.this.topicId);
                int i2 = R.string.DeleteSelectedTopic;
                Object[] objArr = new Object[1];
                objArr[0] = findTopic == null ? "topic" : findTopic.title;
                builder3.setMessage(LocaleController.formatString("DeleteSelectedTopic", i2, objArr));
                builder3.setPositiveButton(LocaleController.getString("Delete", R.string.Delete), new DialogInterface.OnClickListener() {
                    AnonymousClass1() {
                    }

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i3) {
                        ArrayList<Integer> arrayList = new ArrayList<>();
                        arrayList.add(Integer.valueOf((int) ProfileActivity.this.topicId));
                        ProfileActivity.this.getMessagesController().getTopicsController().deleteTopics(ProfileActivity.this.chatId, arrayList);
                        ProfileActivity.this.playProfileAnimation = 0;
                        if (((BaseFragment) ProfileActivity.this).parentLayout != null && ((BaseFragment) ProfileActivity.this).parentLayout.getFragmentStack() != null) {
                            for (int i4 = 0; i4 < ((BaseFragment) ProfileActivity.this).parentLayout.getFragmentStack().size(); i4++) {
                                BaseFragment baseFragment = ((BaseFragment) ProfileActivity.this).parentLayout.getFragmentStack().get(i4);
                                if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).getTopicId() == ProfileActivity.this.topicId) {
                                    baseFragment.removeSelfFromStack();
                                }
                            }
                        }
                        ProfileActivity.this.lambda$onBackPressed$305();
                        Context context = ProfileActivity.this.getContext();
                        if (context != null) {
                            BulletinFactory.of(Bulletin.BulletinWindow.make(context), ProfileActivity.this.resourcesProvider).createSimpleBulletin(R.raw.ic_delete, LocaleController.getPluralString("TopicsDeleted", 1)).show();
                        }
                        dialogInterface.dismiss();
                    }
                });
                builder3.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new DialogInterface.OnClickListener(this) {
                    AnonymousClass2(AnonymousClass6 this) {
                    }

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i3) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog create3 = builder3.create();
                create3.show();
                TextView textView3 = (TextView) create3.getButton(-1);
                if (textView3 != null) {
                    textView3.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                    return;
                }
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
                final TLRPC$User user4 = ProfileActivity.this.getMessagesController().getUser(Long.valueOf(ProfileActivity.this.userId));
                if (user4 == null) {
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
                    public final boolean didSelectDialogs(DialogsActivity dialogsActivity3, ArrayList arrayList, CharSequence charSequence, boolean z, TopicsFragment topicsFragment) {
                        boolean lambda$onItemClick$8;
                        lambda$onItemClick$8 = ProfileActivity.AnonymousClass6.this.lambda$onItemClick$8(user4, dialogsActivity2, dialogsActivity3, arrayList, charSequence, z, topicsFragment);
                        return lambda$onItemClick$8;
                    }
                });
                ProfileActivity.this.presentFragment(dialogsActivity2);
                return;
            }
            if (i == 10) {
                try {
                    if (ProfileActivity.this.userId != 0) {
                        TLRPC$User user5 = ProfileActivity.this.getMessagesController().getUser(Long.valueOf(ProfileActivity.this.userId));
                        if (user5 == null) {
                            return;
                        }
                        if (ProfileActivity.this.botInfo != null && ProfileActivity.this.userInfo != null && !TextUtils.isEmpty(ProfileActivity.this.userInfo.about)) {
                            format = String.format("%s https://" + ProfileActivity.this.getMessagesController().linkPrefix + "/%s", ProfileActivity.this.userInfo.about, UserObject.getPublicUsername(user5));
                        } else {
                            format = String.format("https://" + ProfileActivity.this.getMessagesController().linkPrefix + "/%s", UserObject.getPublicUsername(user5));
                        }
                        str = format;
                    } else if (ProfileActivity.this.chatId != 0) {
                        TLRPC$Chat chat = ProfileActivity.this.getMessagesController().getChat(Long.valueOf(ProfileActivity.this.chatId));
                        if (chat == null) {
                            return;
                        }
                        if (ProfileActivity.this.chatInfo != null && !TextUtils.isEmpty(ProfileActivity.this.chatInfo.about)) {
                            str = String.format("%s\nhttps://" + ProfileActivity.this.getMessagesController().linkPrefix + "/%s", ProfileActivity.this.chatInfo.about, ChatObject.getPublicUsername(chat));
                        } else {
                            str = String.format("https://" + ProfileActivity.this.getMessagesController().linkPrefix + "/%s", ChatObject.getPublicUsername(chat));
                        }
                    }
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", str);
                    ProfileActivity.this.startActivityForResult(Intent.createChooser(intent, LocaleController.getString("BotShare", R.string.BotShare)), 500);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            if (i == 14) {
                try {
                    if (ProfileActivity.this.currentEncryptedChat != null) {
                        j = DialogObject.makeEncryptedDialogId(ProfileActivity.this.currentEncryptedChat.id);
                    } else if (ProfileActivity.this.userId != 0) {
                        j = ProfileActivity.this.userId;
                    } else if (ProfileActivity.this.chatId == 0) {
                        return;
                    } else {
                        j = -ProfileActivity.this.chatId;
                    }
                    ProfileActivity.this.getMediaDataController().installShortcut(j, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                    return;
                } catch (Exception e2) {
                    FileLog.e(e2);
                    return;
                }
            }
            if (i == 15 || i == 16) {
                if (ProfileActivity.this.userId != 0) {
                    TLRPC$User user6 = ProfileActivity.this.getMessagesController().getUser(Long.valueOf(ProfileActivity.this.userId));
                    if (user6 != null) {
                        VoIPHelper.startCall(user6, i == 16, ProfileActivity.this.userInfo != null && ProfileActivity.this.userInfo.video_calls_available, ProfileActivity.this.getParentActivity(), ProfileActivity.this.userInfo, ProfileActivity.this.getAccountInstance());
                        return;
                    }
                    return;
                }
                if (ProfileActivity.this.chatId != 0) {
                    if (ProfileActivity.this.getMessagesController().getGroupCall(ProfileActivity.this.chatId, false) != null) {
                        TLRPC$Chat tLRPC$Chat = ProfileActivity.this.currentChat;
                        Activity parentActivity = ProfileActivity.this.getParentActivity();
                        ProfileActivity profileActivity4 = ProfileActivity.this;
                        VoIPHelper.startCall(tLRPC$Chat, null, null, false, parentActivity, profileActivity4, profileActivity4.getAccountInstance());
                        return;
                    }
                    ProfileActivity profileActivity5 = ProfileActivity.this;
                    VoIPHelper.showGroupCallAlert(profileActivity5, profileActivity5.currentChat, null, false, ProfileActivity.this.getAccountInstance());
                    return;
                }
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
                ProfileActivity profileActivity6 = ProfileActivity.this;
                ProfileActivity profileActivity7 = ProfileActivity.this;
                profileActivity6.showDialog(new GiftPremiumBottomSheet(profileActivity7, profileActivity7.getMessagesController().getUser(Long.valueOf(ProfileActivity.this.userId))));
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
                AlertDialog.Builder builder4 = new AlertDialog.Builder(ProfileActivity.this.getParentActivity(), ProfileActivity.this.resourcesProvider);
                builder4.setTitle(LocaleController.getString("AreYouSureSecretChatTitle", R.string.AreYouSureSecretChatTitle));
                builder4.setMessage(LocaleController.getString("AreYouSureSecretChat", R.string.AreYouSureSecretChat));
                builder4.setPositiveButton(LocaleController.getString("Start", R.string.Start), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        ProfileActivity.AnonymousClass6.this.lambda$onItemClick$9(dialogInterface, i3);
                    }
                });
                builder4.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                ProfileActivity.this.showDialog(builder4.create());
                return;
            }
            if (i == 21) {
                if (ProfileActivity.this.getParentActivity() == null) {
                    return;
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 23 || ((i3 > 28 && !BuildVars.NO_SCOPED_STORAGE) || ProfileActivity.this.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0)) {
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
                                ProfileActivity.AnonymousClass6.this.lambda$onItemClick$10(z, (Uri) obj);
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
                if (!ProfileActivity.this.getUserConfig().isPremium()) {
                    ProfileActivity.this.showDialog(new PremiumFeatureBottomSheet(ProfileActivity.this, 23, true));
                    return;
                } else {
                    ProfileActivity.this.presentFragment(new PeerColorActivity(0L).startOnProfile().setOnApplied(ProfileActivity.this));
                    return;
                }
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
                final TLRPC$Photo photo = ProfileActivity.this.avatarsViewPager.getPhoto(realPosition);
                if (photo == null) {
                    return;
                }
                ProfileActivity.this.avatarsViewPager.startMovePhotoToBegin(realPosition);
                TLRPC$TL_photos_updateProfilePhoto tLRPC$TL_photos_updateProfilePhoto = new TLRPC$TL_photos_updateProfilePhoto();
                TLRPC$TL_inputPhoto tLRPC$TL_inputPhoto = new TLRPC$TL_inputPhoto();
                tLRPC$TL_photos_updateProfilePhoto.id = tLRPC$TL_inputPhoto;
                tLRPC$TL_inputPhoto.id = photo.id;
                tLRPC$TL_inputPhoto.access_hash = photo.access_hash;
                tLRPC$TL_inputPhoto.file_reference = photo.file_reference;
                final UserConfig userConfig = ProfileActivity.this.getUserConfig();
                ProfileActivity.this.getConnectionsManager().sendRequest(tLRPC$TL_photos_updateProfilePhoto, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        ProfileActivity.AnonymousClass6.this.lambda$onItemClick$12(userConfig, photo, tLObject, tLRPC$TL_error);
                    }
                });
                ProfileActivity.this.undoView.showWithAction(ProfileActivity.this.userId, 22, photo.video_sizes.isEmpty() ? null : 1);
                TLRPC$User user7 = ProfileActivity.this.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 800);
                if (user7 != null) {
                    TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 90);
                    TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto = user7.photo;
                    tLRPC$UserProfilePhoto.photo_id = photo.id;
                    tLRPC$UserProfilePhoto.photo_small = closestPhotoSizeWithSize2.location;
                    tLRPC$UserProfilePhoto.photo_big = closestPhotoSizeWithSize.location;
                    userConfig.setCurrentUser(user7);
                    userConfig.saveConfig(true);
                    NotificationCenter.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                    ProfileActivity.this.updateProfileData(true);
                }
                ProfileActivity.this.avatarsViewPager.commitMoveToBegin();
                return;
            }
            if (i == 34) {
                int realPosition2 = ProfileActivity.this.avatarsViewPager.getRealPosition();
                ImageLocation imageLocation2 = ProfileActivity.this.avatarsViewPager.getImageLocation(realPosition2);
                if (imageLocation2 == null) {
                    return;
                }
                File pathToAttach2 = FileLoader.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).getPathToAttach(PhotoViewer.getFileLocation(imageLocation2), PhotoViewer.getFileLocationExt(imageLocation2), true);
                boolean z2 = imageLocation2.imageType == 2;
                if (z2) {
                    ImageLocation realImageLocation = ProfileActivity.this.avatarsViewPager.getRealImageLocation(realPosition2);
                    str2 = FileLoader.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).getPathToAttach(PhotoViewer.getFileLocation(realImageLocation), PhotoViewer.getFileLocationExt(realImageLocation), true).getAbsolutePath();
                }
                ProfileActivity.this.imageUpdater.openPhotoForEdit(pathToAttach2.getAbsolutePath(), str2, 0, z2);
                return;
            }
            if (i != 35) {
                if (i == 36) {
                    ProfileActivity.this.onWriteButtonClick();
                    return;
                }
                if (i != 37 || ProfileActivity.this.qrItem == null || ProfileActivity.this.qrItem.getAlpha() <= 0.0f) {
                    return;
                }
                Bundle bundle8 = new Bundle();
                bundle8.putLong("chat_id", ProfileActivity.this.chatId);
                bundle8.putLong("user_id", ProfileActivity.this.userId);
                ProfileActivity.this.presentFragment(new QrActivity(bundle8));
                return;
            }
            AlertDialog.Builder builder5 = new AlertDialog.Builder(ProfileActivity.this.getParentActivity(), ProfileActivity.this.resourcesProvider);
            ImageLocation imageLocation3 = ProfileActivity.this.avatarsViewPager.getImageLocation(ProfileActivity.this.avatarsViewPager.getRealPosition());
            if (imageLocation3 == null) {
                return;
            }
            if (imageLocation3.imageType == 2) {
                builder5.setTitle(LocaleController.getString("AreYouSureDeleteVideoTitle", R.string.AreYouSureDeleteVideoTitle));
                builder5.setMessage(LocaleController.formatString("AreYouSureDeleteVideo", R.string.AreYouSureDeleteVideo, new Object[0]));
            } else {
                builder5.setTitle(LocaleController.getString("AreYouSureDeletePhotoTitle", R.string.AreYouSureDeletePhotoTitle));
                builder5.setMessage(LocaleController.formatString("AreYouSureDeletePhoto", R.string.AreYouSureDeletePhoto, new Object[0]));
            }
            builder5.setPositiveButton(LocaleController.getString("Delete", R.string.Delete), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    ProfileActivity.AnonymousClass6.this.lambda$onItemClick$13(dialogInterface, i4);
                }
            });
            builder5.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            AlertDialog create4 = builder5.create();
            ProfileActivity.this.showDialog(create4);
            TextView textView4 = (TextView) create4.getButton(-1);
            if (textView4 != null) {
                textView4.setTextColor(ProfileActivity.this.getThemedColor(Theme.key_text_RedBold));
            }
        }

        public void lambda$onItemClick$0(int i) {
            if (i == 1) {
                NotificationCenter notificationCenter = ProfileActivity.this.getNotificationCenter();
                ProfileActivity profileActivity = ProfileActivity.this;
                int i2 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i2);
                ProfileActivity.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i2, new Object[0]);
                ProfileActivity.this.playProfileAnimation = 0;
                ProfileActivity.this.lambda$onBackPressed$305();
                return;
            }
            ProfileActivity.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(ProfileActivity.this.userId));
        }

        public void lambda$onItemClick$1(DialogInterface dialogInterface, int i) {
            ProfileActivity.this.getMessagesController().blockPeer(ProfileActivity.this.userId);
            if (BulletinFactory.canShowBulletin(ProfileActivity.this)) {
                BulletinFactory.createBanBulletin(ProfileActivity.this, true).show();
            }
        }

        public void lambda$onItemClick$2(TLRPC$User tLRPC$User, boolean z) {
            if (ProfileActivity.this.getParentLayout() != null) {
                List<BaseFragment> fragmentStack = ProfileActivity.this.getParentLayout().getFragmentStack();
                if (((fragmentStack == null || fragmentStack.size() < 2) ? null : fragmentStack.get(fragmentStack.size() - 2)) instanceof ChatActivity) {
                    ProfileActivity.this.getParentLayout().removeFragmentFromStack(fragmentStack.size() - 2);
                }
            }
            ProfileActivity.this.lambda$onBackPressed$305();
            ProfileActivity.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(ProfileActivity.this.dialogId), tLRPC$User, ProfileActivity.this.currentChat, Boolean.valueOf(z));
        }

        public void lambda$onItemClick$3() {
            ProfileActivity.this.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", ProfileActivity.this.userId, null, null, null, false, null, null, null, true, 0, null, false));
        }

        public void lambda$onItemClick$4(TLRPC$User tLRPC$User, DialogInterface dialogInterface, int i) {
            ArrayList<TLRPC$User> arrayList = new ArrayList<>();
            arrayList.add(tLRPC$User);
            ProfileActivity.this.getContactsController().deleteContact(arrayList, true);
            if (tLRPC$User != null) {
                tLRPC$User.contact = false;
                ProfileActivity.this.updateListAnimated(false);
            }
        }

        class AnonymousClass1 implements DialogInterface.OnClickListener {
            AnonymousClass1() {
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i3) {
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(Integer.valueOf((int) ProfileActivity.this.topicId));
                ProfileActivity.this.getMessagesController().getTopicsController().deleteTopics(ProfileActivity.this.chatId, arrayList);
                ProfileActivity.this.playProfileAnimation = 0;
                if (((BaseFragment) ProfileActivity.this).parentLayout != null && ((BaseFragment) ProfileActivity.this).parentLayout.getFragmentStack() != null) {
                    for (int i4 = 0; i4 < ((BaseFragment) ProfileActivity.this).parentLayout.getFragmentStack().size(); i4++) {
                        BaseFragment baseFragment = ((BaseFragment) ProfileActivity.this).parentLayout.getFragmentStack().get(i4);
                        if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).getTopicId() == ProfileActivity.this.topicId) {
                            baseFragment.removeSelfFromStack();
                        }
                    }
                }
                ProfileActivity.this.lambda$onBackPressed$305();
                Context context = ProfileActivity.this.getContext();
                if (context != null) {
                    BulletinFactory.of(Bulletin.BulletinWindow.make(context), ProfileActivity.this.resourcesProvider).createSimpleBulletin(R.raw.ic_delete, LocaleController.getPluralString("TopicsDeleted", 1)).show();
                }
                dialogInterface.dismiss();
            }
        }

        class AnonymousClass2 implements DialogInterface.OnClickListener {
            AnonymousClass2(AnonymousClass6 this) {
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i3) {
                dialogInterface.dismiss();
            }
        }

        public boolean lambda$onItemClick$8(final TLRPC$User tLRPC$User, final DialogsActivity dialogsActivity, final DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, TopicsFragment topicsFragment) {
            TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights;
            final long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            TLRPC$Chat chat = MessagesController.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).getChat(Long.valueOf(-j));
            if (chat != null && (chat.creator || ((tLRPC$TL_chatAdminRights = chat.admin_rights) != null && tLRPC$TL_chatAdminRights.add_admins))) {
                ProfileActivity.this.getMessagesController().checkIsInChat(false, chat, tLRPC$User, new MessagesController.IsInChatCheckedCallback() {
                    @Override
                    public final void run(boolean z2, TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights2, String str) {
                        ProfileActivity.AnonymousClass6.this.lambda$onItemClick$6(j, dialogsActivity, z2, tLRPC$TL_chatAdminRights2, str);
                    }
                });
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this.getParentActivity(), ProfileActivity.this.resourcesProvider);
                int i = R.string.AddBot;
                builder.setTitle(LocaleController.getString("AddBot", i));
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(tLRPC$User), chat == null ? "" : chat.title)));
                builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                builder.setPositiveButton(LocaleController.getString("AddBot", i), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        ProfileActivity.AnonymousClass6.this.lambda$onItemClick$7(j, dialogsActivity2, tLRPC$User, dialogInterface, i2);
                    }
                });
                ProfileActivity.this.showDialog(builder.create());
            }
            return true;
        }

        public void lambda$onItemClick$6(final long j, final DialogsActivity dialogsActivity, final boolean z, final TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights, final String str) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.AnonymousClass6.this.lambda$onItemClick$5(j, tLRPC$TL_chatAdminRights, str, z, dialogsActivity);
                }
            });
        }

        public class AnonymousClass3 implements ChatRightsEditActivity.ChatRightsEditActivityDelegate {
            final DialogsActivity val$fragment;

            @Override
            public void didChangeOwner(TLRPC$User tLRPC$User) {
            }

            AnonymousClass3(DialogsActivity dialogsActivity) {
                r2 = dialogsActivity;
            }

            @Override
            public void didSetRights(int i, TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights, TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights, String str) {
                ProfileActivity.this.disableProfileAnimation = true;
                r2.removeSelfFromStack();
                NotificationCenter notificationCenter = ProfileActivity.this.getNotificationCenter();
                ProfileActivity profileActivity = ProfileActivity.this;
                int i2 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i2);
                ProfileActivity.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i2, new Object[0]);
            }
        }

        public void lambda$onItemClick$5(long j, TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights, String str, boolean z, DialogsActivity dialogsActivity) {
            ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(ProfileActivity.this.userId, -j, tLRPC$TL_chatAdminRights, null, null, str, 2, true, !z, null);
            chatRightsEditActivity.setDelegate(new ChatRightsEditActivity.ChatRightsEditActivityDelegate() {
                final DialogsActivity val$fragment;

                @Override
                public void didChangeOwner(TLRPC$User tLRPC$User) {
                }

                AnonymousClass3(DialogsActivity dialogsActivity2) {
                    r2 = dialogsActivity2;
                }

                @Override
                public void didSetRights(int i, TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights2, TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights, String str2) {
                    ProfileActivity.this.disableProfileAnimation = true;
                    r2.removeSelfFromStack();
                    NotificationCenter notificationCenter = ProfileActivity.this.getNotificationCenter();
                    ProfileActivity profileActivity = ProfileActivity.this;
                    int i2 = NotificationCenter.closeChats;
                    notificationCenter.removeObserver(profileActivity, i2);
                    ProfileActivity.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i2, new Object[0]);
                }
            });
            ProfileActivity.this.presentFragment(chatRightsEditActivity);
        }

        public void lambda$onItemClick$7(long j, DialogsActivity dialogsActivity, TLRPC$User tLRPC$User, DialogInterface dialogInterface, int i) {
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
                ProfileActivity.this.getMessagesController().addUserToChat(j2, tLRPC$User, 0, null, chatActivity, true, null, null);
                ProfileActivity.this.presentFragment(chatActivity, true);
            }
        }

        public void lambda$onItemClick$9(DialogInterface dialogInterface, int i) {
            ProfileActivity.this.creatingChat = true;
            ProfileActivity.this.getSecretChatHelper().startSecretChat(ProfileActivity.this.getParentActivity(), ProfileActivity.this.getMessagesController().getUser(Long.valueOf(ProfileActivity.this.userId)));
        }

        public void lambda$onItemClick$10(boolean z, Uri uri) {
            if (ProfileActivity.this.getParentActivity() == null) {
                return;
            }
            BulletinFactory.createSaveToGalleryBulletin(ProfileActivity.this, z, (Theme.ResourcesProvider) null).show();
        }

        public void lambda$onItemClick$12(final UserConfig userConfig, final TLRPC$Photo tLRPC$Photo, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.AnonymousClass6.this.lambda$onItemClick$11(tLObject, userConfig, tLRPC$Photo);
                }
            });
        }

        public void lambda$onItemClick$11(TLObject tLObject, UserConfig userConfig, TLRPC$Photo tLRPC$Photo) {
            ProfileActivity.this.avatarsViewPager.finishSettingMainPhoto();
            if (tLObject instanceof TLRPC$TL_photos_photo) {
                TLRPC$TL_photos_photo tLRPC$TL_photos_photo = (TLRPC$TL_photos_photo) tLObject;
                ProfileActivity.this.getMessagesController().putUsers(tLRPC$TL_photos_photo.users, false);
                TLRPC$User user = ProfileActivity.this.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                if (tLRPC$TL_photos_photo.photo instanceof TLRPC$TL_photo) {
                    ProfileActivity.this.avatarsViewPager.replaceFirstPhoto(tLRPC$Photo, tLRPC$TL_photos_photo.photo);
                    if (user != null) {
                        user.photo.photo_id = tLRPC$TL_photos_photo.photo.id;
                        userConfig.setCurrentUser(user);
                        userConfig.saveConfig(true);
                    }
                }
            }
        }

        public void lambda$onItemClick$13(DialogInterface dialogInterface, int i) {
            TLRPC$Photo tLRPC$Photo;
            int realPosition = ProfileActivity.this.avatarsViewPager.getRealPosition();
            TLRPC$Photo photo = ProfileActivity.this.avatarsViewPager.getPhoto(realPosition);
            TLRPC$UserFull userInfo = ProfileActivity.this.getUserInfo();
            if (ProfileActivity.this.avatar == null || realPosition != 0) {
                if (ProfileActivity.this.hasFallbackPhoto && photo != null && userInfo != null && (tLRPC$Photo = userInfo.fallback_photo) != null && tLRPC$Photo.id == photo.id) {
                    userInfo.fallback_photo = null;
                    userInfo.flags &= -4194305;
                    ProfileActivity.this.getMessagesStorage().updateUserInfo(userInfo, true);
                    ProfileActivity.this.updateProfileData(false);
                }
                if (ProfileActivity.this.avatarsViewPager.getRealCount() == 1) {
                    ProfileActivity.this.setForegroundImage(true);
                }
                if (photo == null || ProfileActivity.this.avatarsViewPager.getRealPosition() == 0) {
                    TLRPC$Photo photo2 = ProfileActivity.this.avatarsViewPager.getPhoto(1);
                    if (photo2 != null) {
                        ProfileActivity.this.getUserConfig().getCurrentUser().photo = new TLRPC$TL_userProfilePhoto();
                        TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 90);
                        TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo2.sizes, 1000);
                        if (closestPhotoSizeWithSize != null && closestPhotoSizeWithSize2 != null) {
                            ProfileActivity.this.getUserConfig().getCurrentUser().photo.photo_small = closestPhotoSizeWithSize.location;
                            ProfileActivity.this.getUserConfig().getCurrentUser().photo.photo_big = closestPhotoSizeWithSize2.location;
                        }
                    } else {
                        ProfileActivity.this.getUserConfig().getCurrentUser().photo = new TLRPC$TL_userProfilePhotoEmpty();
                    }
                    ProfileActivity.this.getMessagesController().deleteUserPhoto(null);
                } else {
                    TLRPC$TL_inputPhoto tLRPC$TL_inputPhoto = new TLRPC$TL_inputPhoto();
                    tLRPC$TL_inputPhoto.id = photo.id;
                    tLRPC$TL_inputPhoto.access_hash = photo.access_hash;
                    byte[] bArr = photo.file_reference;
                    tLRPC$TL_inputPhoto.file_reference = bArr;
                    if (bArr == null) {
                        tLRPC$TL_inputPhoto.file_reference = new byte[0];
                    }
                    ProfileActivity.this.getMessagesController().deleteUserPhoto(tLRPC$TL_inputPhoto);
                    ProfileActivity.this.getMessagesStorage().clearUserPhoto(ProfileActivity.this.userId, photo.id);
                }
                if (ProfileActivity.this.avatarsViewPager.removePhotoAtIndex(realPosition) || ProfileActivity.this.avatarsViewPager.getRealCount() <= 0) {
                    ProfileActivity.this.avatarsViewPager.setVisibility(8);
                    ProfileActivity.this.avatarImage.setForegroundAlpha(1.0f);
                    ProfileActivity.this.avatarContainer.setVisibility(0);
                    ProfileActivity.this.doNotSetForeground = true;
                    View findViewByPosition = ProfileActivity.this.layoutManager.findViewByPosition(0);
                    if (findViewByPosition != null) {
                        ProfileActivity.this.listView.smoothScrollBy(0, findViewByPosition.getTop() - AndroidUtilities.dp(88.0f), CubicBezierInterpolator.EASE_OUT_QUINT);
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

    public class AnonymousClass7 extends NestedFrameLayout {
        private Paint grayPaint;
        private boolean ignoreLayout;
        private final ArrayList<View> sortedChildren;
        private final Comparator<View> viewComparator;
        private boolean wasPortrait;

        @Override
        public boolean hasOverlappingRendering() {
            return false;
        }

        AnonymousClass7(Context context) {
            super(context);
            this.grayPaint = new Paint();
            this.sortedChildren = new ArrayList<>();
            this.viewComparator = new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int lambda$$1;
                    lambda$$1 = ProfileActivity.AnonymousClass7.lambda$$1((View) obj, (View) obj2);
                    return lambda$$1;
                }
            };
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (!ProfileActivity.this.pinchToZoomHelper.isInOverlayMode()) {
                if (ProfileActivity.this.sharedMediaLayout == null || !ProfileActivity.this.sharedMediaLayout.isInFastScroll() || !ProfileActivity.this.sharedMediaLayout.isPinnedToTop()) {
                    if (ProfileActivity.this.sharedMediaLayout == null || !ProfileActivity.this.sharedMediaLayout.checkPinchToZoom(motionEvent)) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    return true;
                }
                return ProfileActivity.this.sharedMediaLayout.dispatchFastScrollEvent(motionEvent);
            }
            return ProfileActivity.this.pinchToZoomHelper.onTouchEvent(motionEvent);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            boolean z;
            int dp;
            int i3;
            View view;
            int i4;
            boolean z2;
            int measuredWidth;
            int max;
            int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + (((BaseFragment) ProfileActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
            if (ProfileActivity.this.listView != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ProfileActivity.this.listView.getLayoutParams();
                if (layoutParams.topMargin != currentActionBarHeight) {
                    layoutParams.topMargin = currentActionBarHeight;
                }
            }
            if (ProfileActivity.this.searchListView != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ProfileActivity.this.searchListView.getLayoutParams();
                if (layoutParams2.topMargin != currentActionBarHeight) {
                    layoutParams2.topMargin = currentActionBarHeight;
                }
            }
            int size = View.MeasureSpec.getSize(i2);
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            if (ProfileActivity.this.lastMeasuredContentWidth == getMeasuredWidth() && ProfileActivity.this.lastMeasuredContentHeight == getMeasuredHeight()) {
                z = false;
            } else {
                z = (ProfileActivity.this.lastMeasuredContentWidth == 0 || ProfileActivity.this.lastMeasuredContentWidth == getMeasuredWidth()) ? false : true;
                ProfileActivity.this.listContentHeight = 0;
                int itemCount = ProfileActivity.this.listAdapter.getItemCount();
                ProfileActivity.this.lastMeasuredContentWidth = getMeasuredWidth();
                ProfileActivity.this.lastMeasuredContentHeight = getMeasuredHeight();
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(ProfileActivity.this.listView.getMeasuredHeight(), 0);
                ProfileActivity.this.positionToOffset.clear();
                for (int i5 = 0; i5 < itemCount; i5++) {
                    int itemViewType = ProfileActivity.this.listAdapter.getItemViewType(i5);
                    ProfileActivity.this.positionToOffset.put(Integer.valueOf(i5), Integer.valueOf(ProfileActivity.this.listContentHeight));
                    if (itemViewType != 13) {
                        RecyclerView.ViewHolder createViewHolder = ProfileActivity.this.listAdapter.createViewHolder(null, itemViewType);
                        ProfileActivity.this.listAdapter.onBindViewHolder(createViewHolder, i5);
                        createViewHolder.itemView.measure(makeMeasureSpec, makeMeasureSpec2);
                        ProfileActivity.access$9712(ProfileActivity.this, createViewHolder.itemView.getMeasuredHeight());
                    } else {
                        ProfileActivity profileActivity = ProfileActivity.this;
                        ProfileActivity.access$9712(profileActivity, profileActivity.listView.getMeasuredHeight());
                    }
                }
                if (ProfileActivity.this.emptyView != null) {
                    ((FrameLayout.LayoutParams) ProfileActivity.this.emptyView.getLayoutParams()).topMargin = AndroidUtilities.dp(88.0f) + AndroidUtilities.statusBarHeight;
                }
            }
            ProfileActivity profileActivity2 = ProfileActivity.this;
            if (profileActivity2.previousTransitionFragment != null) {
                profileActivity2.nameTextView[0].setRightPadding(ProfileActivity.this.nameTextView[0].getMeasuredWidth() - ProfileActivity.this.previousTransitionFragment.getAvatarContainer().getTitleTextView().getMeasuredWidth());
            }
            if (ProfileActivity.this.fragmentOpened || (!ProfileActivity.this.expandPhoto && (!ProfileActivity.this.openAnimationInProgress || ProfileActivity.this.playProfileAnimation != 2))) {
                if (ProfileActivity.this.fragmentOpened && !ProfileActivity.this.openAnimationInProgress && !ProfileActivity.this.firstLayout) {
                    boolean z3 = true;
                    this.ignoreLayout = true;
                    if (!ProfileActivity.this.isInLandscapeMode && !AndroidUtilities.isTablet()) {
                        dp = ProfileActivity.this.listView.getMeasuredWidth();
                        i3 = Math.max(0, getMeasuredHeight() - ((ProfileActivity.this.listContentHeight + AndroidUtilities.dp(88.0f)) + currentActionBarHeight));
                    } else {
                        dp = AndroidUtilities.dp(88.0f);
                        i3 = 0;
                    }
                    if (ProfileActivity.this.banFromGroup == 0) {
                        ProfileActivity.this.listView.setBottomGlowOffset(0);
                    } else {
                        i3 += AndroidUtilities.dp(48.0f);
                        ProfileActivity.this.listView.setBottomGlowOffset(AndroidUtilities.dp(48.0f));
                    }
                    int paddingTop = ProfileActivity.this.listView.getPaddingTop();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= ProfileActivity.this.listView.getChildCount()) {
                            view = null;
                            i4 = -1;
                            break;
                        }
                        int childAdapterPosition = ProfileActivity.this.listView.getChildAdapterPosition(ProfileActivity.this.listView.getChildAt(i6));
                        if (childAdapterPosition != -1) {
                            View childAt = ProfileActivity.this.listView.getChildAt(i6);
                            i4 = childAdapterPosition;
                            view = childAt;
                            break;
                        }
                        i6++;
                    }
                    if (view == null && (view = ProfileActivity.this.listView.getChildAt(0)) != null) {
                        RecyclerView.ViewHolder findContainingViewHolder = ProfileActivity.this.listView.findContainingViewHolder(view);
                        int adapterPosition = findContainingViewHolder.getAdapterPosition();
                        i4 = adapterPosition == -1 ? findContainingViewHolder.getPosition() : adapterPosition;
                    }
                    int top = view != null ? view.getTop() : dp;
                    if ((((BaseFragment) ProfileActivity.this).actionBar.isSearchFieldVisible() || ProfileActivity.this.openSimilar) && ProfileActivity.this.sharedMediaRow >= 0) {
                        ProfileActivity.this.layoutManager.scrollToPositionWithOffset(ProfileActivity.this.sharedMediaRow, -dp);
                    } else {
                        if (ProfileActivity.this.invalidateScroll || paddingTop != dp) {
                            ProfileActivity profileActivity3 = ProfileActivity.this;
                            if (profileActivity3.savedScrollPosition >= 0) {
                                LinearLayoutManager linearLayoutManager = profileActivity3.layoutManager;
                                ProfileActivity profileActivity4 = ProfileActivity.this;
                                linearLayoutManager.scrollToPositionWithOffset(profileActivity4.savedScrollPosition, profileActivity4.savedScrollOffset - dp);
                            } else if ((!z || !profileActivity3.allowPullingDown) && view != null) {
                                if (i4 == 0 && !ProfileActivity.this.allowPullingDown && top > AndroidUtilities.dp(88.0f)) {
                                    top = AndroidUtilities.dp(88.0f);
                                }
                                ProfileActivity.this.layoutManager.scrollToPositionWithOffset(i4, top - dp);
                                z3 = true;
                            } else {
                                ProfileActivity.this.layoutManager.scrollToPositionWithOffset(0, AndroidUtilities.dp(88.0f) - dp);
                            }
                        }
                        z3 = false;
                    }
                    if (paddingTop == dp && ProfileActivity.this.listView.getPaddingBottom() == i3) {
                        z2 = z3;
                    } else {
                        ProfileActivity.this.listView.setPadding(0, dp, 0, i3);
                        z2 = true;
                    }
                    if (z2) {
                        measureChildWithMargins(ProfileActivity.this.listView, i, 0, i2, 0);
                        try {
                            ProfileActivity.this.listView.layout(0, currentActionBarHeight, ProfileActivity.this.listView.getMeasuredWidth(), ProfileActivity.this.listView.getMeasuredHeight() + currentActionBarHeight);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    this.ignoreLayout = false;
                }
            } else {
                this.ignoreLayout = true;
                if (ProfileActivity.this.expandPhoto) {
                    if (ProfileActivity.this.searchItem != null) {
                        ProfileActivity.this.searchItem.setAlpha(0.0f);
                        ProfileActivity.this.searchItem.setEnabled(false);
                        ProfileActivity.this.searchItem.setVisibility(8);
                    }
                    ProfileActivity.this.nameTextView[1].setTextColor(-1);
                    ProfileActivity.this.nameTextView[1].setPivotY(ProfileActivity.this.nameTextView[1].getMeasuredHeight());
                    ProfileActivity.this.nameTextView[1].setScaleX(1.67f);
                    ProfileActivity.this.nameTextView[1].setScaleY(1.67f);
                    if (ProfileActivity.this.scamDrawable != null) {
                        ProfileActivity.this.scamDrawable.setColor(Color.argb(179, 255, 255, 255));
                    }
                    if (ProfileActivity.this.lockIconDrawable != null) {
                        ProfileActivity.this.lockIconDrawable.setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
                    }
                    if (ProfileActivity.this.verifiedCrossfadeDrawable[0] != null) {
                        ProfileActivity.this.verifiedCrossfadeDrawable[0].setProgress(1.0f);
                    }
                    if (ProfileActivity.this.verifiedCrossfadeDrawable[1] != null) {
                        ProfileActivity.this.verifiedCrossfadeDrawable[1].setProgress(1.0f);
                    }
                    if (ProfileActivity.this.premiumCrossfadeDrawable[0] != null) {
                        ProfileActivity.this.premiumCrossfadeDrawable[0].setProgress(1.0f);
                    }
                    if (ProfileActivity.this.premiumCrossfadeDrawable[1] != null) {
                        ProfileActivity.this.premiumCrossfadeDrawable[1].setProgress(1.0f);
                    }
                    ProfileActivity.this.updateEmojiStatusDrawableColor(1.0f);
                    ProfileActivity.this.onlineTextView[1].setTextColor(-1275068417);
                    ((BaseFragment) ProfileActivity.this).actionBar.setItemsBackgroundColor(1090519039, false);
                    ((BaseFragment) ProfileActivity.this).actionBar.setItemsColor(-1, false);
                    ProfileActivity.this.overlaysView.setOverlaysVisible();
                    ProfileActivity.this.overlaysView.setAlphaValue(1.0f, false);
                    ProfileActivity.this.avatarImage.setForegroundAlpha(1.0f);
                    ProfileActivity.this.avatarContainer.setVisibility(8);
                    ProfileActivity.this.avatarsViewPager.resetCurrentItem();
                    ProfileActivity.this.avatarsViewPager.setVisibility(0);
                    if (ProfileActivity.this.showStatusButton != null) {
                        ProfileActivity.this.showStatusButton.setBackgroundColor(603979775);
                    }
                    if (ProfileActivity.this.storyView != null) {
                        ProfileActivity.this.storyView.setExpandProgress(1.0f);
                    }
                    ProfileActivity.this.expandPhoto = false;
                }
                ProfileActivity.this.allowPullingDown = true;
                ProfileActivity.this.isPulledDown = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                if (ProfileActivity.this.otherItem != null) {
                    if (!ProfileActivity.this.getMessagesController().isChatNoForwards(ProfileActivity.this.currentChat)) {
                        ProfileActivity.this.otherItem.showSubItem(21);
                    } else {
                        ProfileActivity.this.otherItem.hideSubItem(21);
                    }
                    if (ProfileActivity.this.imageUpdater != null) {
                        ProfileActivity.this.otherItem.showSubItem(34);
                        ProfileActivity.this.otherItem.showSubItem(35);
                        ProfileActivity.this.otherItem.hideSubItem(31);
                    }
                }
                ProfileActivity.this.currentExpanAnimatorFracture = 1.0f;
                if (!ProfileActivity.this.isInLandscapeMode) {
                    measuredWidth = ProfileActivity.this.listView.getMeasuredWidth();
                    max = Math.max(0, getMeasuredHeight() - ((ProfileActivity.this.listContentHeight + AndroidUtilities.dp(88.0f)) + currentActionBarHeight));
                } else {
                    measuredWidth = AndroidUtilities.dp(88.0f);
                    max = 0;
                }
                if (ProfileActivity.this.banFromGroup == 0) {
                    ProfileActivity.this.listView.setBottomGlowOffset(0);
                } else {
                    max += AndroidUtilities.dp(48.0f);
                    ProfileActivity.this.listView.setBottomGlowOffset(AndroidUtilities.dp(48.0f));
                }
                ProfileActivity.this.initialAnimationExtraHeight = measuredWidth - currentActionBarHeight;
                if (ProfileActivity.this.playProfileAnimation == 0) {
                    ProfileActivity profileActivity5 = ProfileActivity.this;
                    profileActivity5.extraHeight = profileActivity5.initialAnimationExtraHeight;
                }
                ProfileActivity.this.layoutManager.scrollToPositionWithOffset(0, -currentActionBarHeight);
                ProfileActivity.this.listView.setPadding(0, measuredWidth, 0, max);
                measureChildWithMargins(ProfileActivity.this.listView, i, 0, i2, 0);
                ProfileActivity.this.listView.layout(0, currentActionBarHeight, ProfileActivity.this.listView.getMeasuredWidth(), ProfileActivity.this.listView.getMeasuredHeight() + currentActionBarHeight);
                this.ignoreLayout = false;
            }
            boolean z4 = size > View.MeasureSpec.getSize(i);
            if (z4 != this.wasPortrait) {
                post(new Runnable() {
                    @Override
                    public final void run() {
                        ProfileActivity.AnonymousClass7.this.lambda$onMeasure$0();
                    }
                });
                this.wasPortrait = z4;
            }
            if (ProfileActivity.this.searchItem == null || ProfileActivity.this.qrItem == null) {
                return;
            }
            AndroidUtilities.dp(48.0f);
            float unused = ProfileActivity.this.currentExpandAnimatorValue;
        }

        public void lambda$onMeasure$0() {
            if (ProfileActivity.this.selectAnimatedEmojiDialog != null) {
                ProfileActivity.this.selectAnimatedEmojiDialog.dismiss();
                ProfileActivity.this.selectAnimatedEmojiDialog = null;
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
        public void dispatchDraw(Canvas canvas) {
            FragmentContextView fragmentContextView;
            boolean z;
            int i;
            ProfileActivity.this.whitePaint.setColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
            if (ProfileActivity.this.listView.getVisibility() != 0) {
                canvas.drawRect(0.0f, ProfileActivity.this.searchListView.getTop() + ProfileActivity.this.extraHeight + ProfileActivity.this.searchTransitionOffset, getMeasuredWidth(), r1 + getMeasuredHeight(), ProfileActivity.this.whitePaint);
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
                    y += this.sortedChildren.get(0).getY();
                }
                float f = y;
                boolean z3 = false;
                float f2 = 1.0f;
                for (int i3 = 0; i3 < size; i3++) {
                    View view = this.sortedChildren.get(i3);
                    boolean z4 = view.getBackground() != null;
                    int y2 = (int) (ProfileActivity.this.listView.getY() + view.getY());
                    if (z3 != z4) {
                        if (z3) {
                            z = z4;
                            canvas.drawRect(ProfileActivity.this.listView.getX(), f, ProfileActivity.this.listView.getX() + ProfileActivity.this.listView.getMeasuredWidth(), y2, this.grayPaint);
                            i = y2;
                        } else {
                            z = z4;
                            if (f2 != 1.0f) {
                                float f3 = y2;
                                i = y2;
                                canvas.drawRect(ProfileActivity.this.listView.getX(), f, ProfileActivity.this.listView.getX() + ProfileActivity.this.listView.getMeasuredWidth(), f3, this.grayPaint);
                                ProfileActivity.this.whitePaint.setAlpha((int) (f2 * 255.0f));
                                canvas.drawRect(ProfileActivity.this.listView.getX(), f, ProfileActivity.this.listView.getX() + ProfileActivity.this.listView.getMeasuredWidth(), f3, ProfileActivity.this.whitePaint);
                                ProfileActivity.this.whitePaint.setAlpha(255);
                            } else {
                                i = y2;
                                canvas.drawRect(ProfileActivity.this.listView.getX(), f, ProfileActivity.this.listView.getX() + ProfileActivity.this.listView.getMeasuredWidth(), i, ProfileActivity.this.whitePaint);
                            }
                        }
                        f = i;
                        f2 = view.getAlpha();
                        z3 = z;
                    } else if (view.getAlpha() == 1.0f) {
                        f2 = 1.0f;
                    }
                }
                if (z3) {
                    canvas.drawRect(ProfileActivity.this.listView.getX(), f, ProfileActivity.this.listView.getX() + ProfileActivity.this.listView.getMeasuredWidth(), ProfileActivity.this.listView.getBottom(), this.grayPaint);
                } else if (f2 != 1.0f) {
                    canvas.drawRect(ProfileActivity.this.listView.getX(), f, ProfileActivity.this.listView.getX() + ProfileActivity.this.listView.getMeasuredWidth(), ProfileActivity.this.listView.getBottom(), this.grayPaint);
                    ProfileActivity.this.whitePaint.setAlpha((int) (f2 * 255.0f));
                    canvas.drawRect(ProfileActivity.this.listView.getX(), f, ProfileActivity.this.listView.getX() + ProfileActivity.this.listView.getMeasuredWidth(), ProfileActivity.this.listView.getBottom(), ProfileActivity.this.whitePaint);
                    ProfileActivity.this.whitePaint.setAlpha(255);
                } else {
                    canvas.drawRect(ProfileActivity.this.listView.getX(), f, ProfileActivity.this.listView.getX() + ProfileActivity.this.listView.getMeasuredWidth(), ProfileActivity.this.listView.getBottom(), ProfileActivity.this.whitePaint);
                }
            }
            super.dispatchDraw(canvas);
            ProfileActivity profileActivity = ProfileActivity.this;
            if (profileActivity.profileTransitionInProgress && ((BaseFragment) profileActivity).parentLayout.getFragmentStack().size() > 1) {
                BaseFragment baseFragment = ((BaseFragment) ProfileActivity.this).parentLayout.getFragmentStack().get(((BaseFragment) ProfileActivity.this).parentLayout.getFragmentStack().size() - 2);
                if ((baseFragment instanceof ChatActivity) && (fragmentContextView = ((ChatActivity) baseFragment).getFragmentContextView()) != null && fragmentContextView.isCallStyle()) {
                    float dpf2 = ProfileActivity.this.extraHeight / AndroidUtilities.dpf2(fragmentContextView.getStyleHeight());
                    if (dpf2 > 1.0f) {
                        dpf2 = 1.0f;
                    }
                    canvas.save();
                    canvas.translate(fragmentContextView.getX(), fragmentContextView.getY());
                    fragmentContextView.setDrawOverlay(true);
                    fragmentContextView.setCollapseTransition(true, ProfileActivity.this.extraHeight, dpf2);
                    fragmentContextView.draw(canvas);
                    fragmentContextView.setCollapseTransition(false, ProfileActivity.this.extraHeight, dpf2);
                    fragmentContextView.setDrawOverlay(false);
                    canvas.restore();
                }
            }
            if (ProfileActivity.this.scrimPaint.getAlpha() > 0) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ProfileActivity.this.scrimPaint);
            }
            if (ProfileActivity.this.scrimView != null) {
                int save = canvas.save();
                canvas.translate(ProfileActivity.this.scrimView.getLeft(), ProfileActivity.this.scrimView.getTop());
                if (ProfileActivity.this.scrimView == ((BaseFragment) ProfileActivity.this).actionBar.getBackButton()) {
                    int max = Math.max(ProfileActivity.this.scrimView.getMeasuredWidth(), ProfileActivity.this.scrimView.getMeasuredHeight()) / 2;
                    int alpha = ProfileActivity.this.actionBarBackgroundPaint.getAlpha();
                    ProfileActivity.this.actionBarBackgroundPaint.setAlpha((int) ((alpha * (ProfileActivity.this.scrimPaint.getAlpha() / 255.0f)) / 0.3f));
                    float f4 = max;
                    canvas.drawCircle(f4, f4, 0.7f * f4, ProfileActivity.this.actionBarBackgroundPaint);
                    ProfileActivity.this.actionBarBackgroundPaint.setAlpha(alpha);
                }
                ProfileActivity.this.scrimView.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (ProfileActivity.this.blurredView == null || ProfileActivity.this.blurredView.getVisibility() != 0) {
                return;
            }
            if (ProfileActivity.this.blurredView.getAlpha() == 1.0f) {
                ProfileActivity.this.blurredView.draw(canvas);
            } else if (ProfileActivity.this.blurredView.getAlpha() != 0.0f) {
                canvas.saveLayerAlpha(ProfileActivity.this.blurredView.getLeft(), ProfileActivity.this.blurredView.getTop(), ProfileActivity.this.blurredView.getRight(), ProfileActivity.this.blurredView.getBottom(), (int) (ProfileActivity.this.blurredView.getAlpha() * 255.0f), 31);
                canvas.translate(ProfileActivity.this.blurredView.getLeft(), ProfileActivity.this.blurredView.getTop());
                ProfileActivity.this.blurredView.draw(canvas);
                canvas.restore();
            }
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if ((ProfileActivity.this.pinchToZoomHelper.isInOverlayMode() && (view == ProfileActivity.this.avatarContainer2 || view == ((BaseFragment) ProfileActivity.this).actionBar || view == ProfileActivity.this.writeButton)) || view == ProfileActivity.this.blurredView) {
                return true;
            }
            return super.drawChild(canvas, view, j);
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            ProfileActivity.this.fragmentViewAttached = true;
            for (int i = 0; i < ProfileActivity.this.emojiStatusDrawable.length; i++) {
                if (ProfileActivity.this.emojiStatusDrawable[i] != null) {
                    ProfileActivity.this.emojiStatusDrawable[i].attach();
                }
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            ProfileActivity.this.fragmentViewAttached = false;
            for (int i = 0; i < ProfileActivity.this.emojiStatusDrawable.length; i++) {
                if (ProfileActivity.this.emojiStatusDrawable[i] != null) {
                    ProfileActivity.this.emojiStatusDrawable[i].detach();
                }
            }
        }
    }

    public class AnonymousClass8 extends SharedMediaLayout {
        @Override
        protected int getInitialTab() {
            return 8;
        }

        AnonymousClass8(Context context, long j, SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader, int i, ArrayList arrayList, TLRPC$ChatFull tLRPC$ChatFull, TLRPC$UserFull tLRPC$UserFull, int i2, BaseFragment baseFragment, SharedMediaLayout.Delegate delegate, int i3, Theme.ResourcesProvider resourcesProvider) {
            super(context, j, sharedMediaPreloader, i, arrayList, tLRPC$ChatFull, tLRPC$UserFull, i2, baseFragment, delegate, i3, resourcesProvider);
        }

        @Override
        protected int processColor(int i) {
            return ProfileActivity.this.applyPeerColor(i, false);
        }

        @Override
        public void onSelectedTabChanged() {
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
            if (ProfileActivity.this.qrItem != null) {
                ProfileActivity.this.qrItem.setVisibility(z ? 8 : 4);
            }
            ProfileActivity.this.updateStoriesViewBounds(false);
        }

        @Override
        protected boolean onMemberClick(TLRPC$ChatParticipant tLRPC$ChatParticipant, boolean z, View view) {
            return ProfileActivity.this.onMemberClick(tLRPC$ChatParticipant, z, view);
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
        public void showActionMode(boolean z) {
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
                        ProfileActivity.AnonymousClass8.this.lambda$showActionMode$0(valueAnimator);
                    }
                }).start();
            }
        }

        public void lambda$showActionMode$0(ValueAnimator valueAnimator) {
            ProfileActivity.this.updateBottomButtonY();
        }

        @Override
        public void onTabProgress(float f) {
            super.onTabProgress(f);
            ProfileActivity profileActivity = ProfileActivity.this;
            if (profileActivity.myProfile) {
                profileActivity.bottomButtonContainer[0].setTranslationX((8.0f - f) * ProfileActivity.this.sharedMediaLayout.getMeasuredWidth());
                ProfileActivity.this.bottomButtonContainer[1].setTranslationX((9.0f - f) * ProfileActivity.this.sharedMediaLayout.getMeasuredWidth());
                ProfileActivity.this.updateBottomButtonY();
            }
        }

        @Override
        public void onActionModeSelectedUpdate(SparseArray<MessageObject> sparseArray) {
            super.onActionModeSelectedUpdate(sparseArray);
            if (ProfileActivity.this.myProfile) {
                int size = sparseArray.size();
                int selectedTab = getSelectedTab() - 8;
                if (selectedTab < 0 || selectedTab > 1) {
                    return;
                }
                if (selectedTab == 0) {
                    ProfileActivity.this.bottomButton[selectedTab].setText((size > 0 || !MessagesController.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).storiesEnabled()) ? LocaleController.formatPluralString("ArchiveStories", size, new Object[0]) : ProfileActivity.this.bottomButtonPostText, true);
                }
                ProfileActivity.this.bottomButton[selectedTab].setCount(size, true);
            }
        }

        @Override
        public void openStoryRecorder() {
            StoryRecorder.getInstance(ProfileActivity.this.getParentActivity(), ((BaseFragment) ProfileActivity.this).currentAccount).selectedPeerId(ProfileActivity.this.getDialogId()).canChangePeer(false).closeToWhenSent(new StoryRecorder.ClosingViewProvider() {
                AnonymousClass1() {
                }

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
            }).open(StoryRecorder.SourceView.fromFloatingButton(ProfileActivity.this.floatingButtonContainer), true);
        }

        class AnonymousClass1 implements StoryRecorder.ClosingViewProvider {
            AnonymousClass1() {
            }

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
        }
    }

    class AnonymousClass9 extends ActionBarMenuItem.ActionBarMenuItemSearchListener {
        AnonymousClass9() {
        }

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
    }

    class AnonymousClass10 extends ClippedListView {
        private VelocityTracker velocityTracker;

        @Override
        public boolean hasOverlappingRendering() {
            return false;
        }

        @Override
        public void requestChildOnScreen(View view2, View view3) {
        }

        AnonymousClass10(final Context context222) {
            super(context222);
        }

        @Override
        public boolean canHighlightChildAt(View view2, float f3, float f4) {
            return !(view2 instanceof AboutLinkCell);
        }

        @Override
        public boolean allowSelectChildAtPosition(View view2) {
            return view2 != ProfileActivity.this.sharedMediaLayout;
        }

        @Override
        public void invalidate() {
            super.invalidate();
            View view2 = ProfileActivity.this.fragmentView;
            if (view2 != null) {
                view2.invalidate();
            }
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (ProfileActivity.this.sharedMediaLayout.canEditStories() && ProfileActivity.this.sharedMediaLayout != null && ProfileActivity.this.sharedMediaLayout.isActionModeShown() && ProfileActivity.this.sharedMediaLayout.getClosestTab() == 8) {
                return false;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            VelocityTracker velocityTracker;
            View findViewByPosition2;
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
                velocityTracker.recycle();
                this.velocityTracker = null;
            }
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if ((action == 1 || action == 3) && ProfileActivity.this.allowPullingDown && (findViewByPosition2 = ProfileActivity.this.layoutManager.findViewByPosition(0)) != null) {
                if (ProfileActivity.this.isPulledDown) {
                    ProfileActivity.this.listView.smoothScrollBy(0, (findViewByPosition2.getTop() - ProfileActivity.this.listView.getMeasuredWidth()) + ActionBar.getCurrentActionBarHeight() + (((BaseFragment) ProfileActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0), CubicBezierInterpolator.EASE_OUT_QUINT);
                } else {
                    ProfileActivity.this.listView.smoothScrollBy(0, findViewByPosition2.getTop() - AndroidUtilities.dp(88.0f), CubicBezierInterpolator.EASE_OUT_QUINT);
                }
            }
            return onTouchEvent;
        }

        @Override
        public boolean drawChild(Canvas canvas, View view2, long j3) {
            if (getItemAnimator().isRunning() && view2.getBackground() == null && view2.getTranslationY() != 0.0f) {
                boolean z2 = ProfileActivity.this.listView.getChildAdapterPosition(view2) == ProfileActivity.this.sharedMediaRow && view2.getAlpha() != 1.0f;
                if (z2) {
                    ProfileActivity.this.whitePaint.setAlpha((int) (ProfileActivity.this.listView.getAlpha() * 255.0f * view2.getAlpha()));
                }
                canvas.drawRect(ProfileActivity.this.listView.getX(), view2.getY(), ProfileActivity.this.listView.getX() + ProfileActivity.this.listView.getMeasuredWidth(), view2.getY() + view2.getHeight(), ProfileActivity.this.whitePaint);
                if (z2) {
                    ProfileActivity.this.whitePaint.setAlpha((int) (ProfileActivity.this.listView.getAlpha() * 255.0f));
                }
            }
            return super.drawChild(canvas, view2, j3);
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            if (ProfileActivity.this.bizHoursRow >= 0 && ProfileActivity.this.infoStartRow >= 0 && ProfileActivity.this.infoEndRow >= 0) {
                drawSectionBackground(canvas, ProfileActivity.this.infoStartRow, ProfileActivity.this.infoEndRow, getThemedColor(Theme.key_windowBackgroundWhite));
            }
            super.dispatchDraw(canvas);
        }

        @Override
        public void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
            super.onLayout(z2, i3, i4, i5, i6);
            ProfileActivity.this.updateBottomButtonY();
        }
    }

    public class AnonymousClass11 extends DefaultItemAnimator {
        int animationIndex = -1;

        @Override
        protected long getAddAnimationDelay(long j, long j2, long j3) {
            return 0L;
        }

        AnonymousClass11() {
        }

        @Override
        public void onAllAnimationsDone() {
            super.onAllAnimationsDone();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.AnonymousClass11.this.lambda$onAllAnimationsDone$0();
                }
            });
        }

        public void lambda$onAllAnimationsDone$0() {
            ProfileActivity.this.getNotificationCenter().onAnimationFinish(this.animationIndex);
        }

        @Override
        public void runPendingAnimations() {
            boolean z = !this.mPendingRemovals.isEmpty();
            boolean z2 = !this.mPendingMoves.isEmpty();
            boolean z3 = !this.mPendingChanges.isEmpty();
            boolean z4 = !this.mPendingAdditions.isEmpty();
            if (z || z2 || z4 || z3) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ProfileActivity.AnonymousClass11.this.lambda$runPendingAnimations$1(valueAnimator);
                    }
                });
                ofFloat.setDuration(getMoveDuration());
                ofFloat.start();
                this.animationIndex = ProfileActivity.this.getNotificationCenter().setAnimationInProgress(this.animationIndex, null);
            }
            super.runPendingAnimations();
        }

        public void lambda$runPendingAnimations$1(ValueAnimator valueAnimator) {
            ProfileActivity.this.listView.invalidate();
        }

        @Override
        public void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
            super.onMoveAnimationUpdate(viewHolder);
            ProfileActivity.this.updateBottomButtonY();
        }
    }

    class AnonymousClass12 extends LinearLayoutManager {
        AnonymousClass12(final Context context222) {
            super(context222);
        }

        @Override
        public boolean supportsPredictiveItemAnimations() {
            return ProfileActivity.this.imageUpdater != null;
        }

        @Override
        public int scrollVerticallyBy(int i3, RecyclerView.Recycler recycler, RecyclerView.State state) {
            View findViewByPosition2 = ProfileActivity.this.layoutManager.findViewByPosition(0);
            if (findViewByPosition2 != null && !ProfileActivity.this.openingAvatar) {
                int top = findViewByPosition2.getTop() - AndroidUtilities.dp(88.0f);
                if (ProfileActivity.this.allowPullingDown || top <= i3) {
                    if (ProfileActivity.this.allowPullingDown) {
                        if (i3 >= top) {
                            ProfileActivity.this.allowPullingDown = false;
                        } else if (ProfileActivity.this.listView.getScrollState() == 1 && !ProfileActivity.this.isPulledDown) {
                            i3 /= 2;
                        }
                    }
                } else if (ProfileActivity.this.avatarsViewPager.hasImages() && ProfileActivity.this.avatarImage.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled() && !ProfileActivity.this.isInLandscapeMode && !AndroidUtilities.isTablet()) {
                    ProfileActivity profileActivity = ProfileActivity.this;
                    profileActivity.allowPullingDown = profileActivity.avatarBig == null;
                }
                i3 = top;
            }
            return super.scrollVerticallyBy(i3, recycler, state);
        }
    }

    public void lambda$createView$10(long j, final Context context, final BaseFragment baseFragment, View view, int i, float f, float f2) {
        TLRPC$ChatParticipant tLRPC$ChatParticipant;
        long j2;
        ListAdapter listAdapter;
        float f3 = f;
        float f4 = f2;
        if (getParentActivity() == null) {
            return;
        }
        this.listView.stopScroll();
        if (i == this.notificationsSimpleRow) {
            boolean isDialogMuted = getMessagesController().isDialogMuted(j, this.topicId);
            getNotificationsController().muteDialog(j, this.topicId, !isDialogMuted);
            BulletinFactory.createMuteBulletin(this, !isDialogMuted, null).show();
            updateExceptions();
            int i2 = this.notificationsSimpleRow;
            if (i2 < 0 || (listAdapter = this.listAdapter) == null) {
                return;
            }
            listAdapter.notifyItemChanged(i2);
            return;
        }
        if (i == this.addToContactsRow) {
            TLRPC$User user = getMessagesController().getUser(Long.valueOf(this.userId));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            bundle.putBoolean("addContact", true);
            bundle.putString("phone", this.vcardPhone);
            bundle.putString("first_name_card", this.vcardFirstName);
            bundle.putString("last_name_card", this.vcardLastName);
            openAddToContact(user, bundle);
            return;
        }
        if (i == this.reportReactionRow) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), this.resourcesProvider);
            builder.setTitle(LocaleController.getString("ReportReaction", R.string.ReportReaction));
            builder.setMessage(LocaleController.getString("ReportAlertReaction", R.string.ReportAlertReaction));
            TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(-this.reportReactionFromDialogId));
            final CheckBoxCell[] checkBoxCellArr = new CheckBoxCell[1];
            if (chat != null && ChatObject.canBlockUsers(chat)) {
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(1);
                checkBoxCellArr[0] = new CheckBoxCell(getParentActivity(), 1, this.resourcesProvider);
                checkBoxCellArr[0].setBackgroundDrawable(Theme.getSelectorDrawable(false));
                checkBoxCellArr[0].setText(LocaleController.getString("BanUser", R.string.BanUser), "", true, false);
                checkBoxCellArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                linearLayout.addView(checkBoxCellArr[0], LayoutHelper.createLinear(-1, -2));
                checkBoxCellArr[0].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        ProfileActivity.lambda$createView$6(checkBoxCellArr, view2);
                    }
                });
                builder.setView(linearLayout);
            }
            builder.setPositiveButton(LocaleController.getString("ReportChat", R.string.ReportChat), new AnonymousClass13(checkBoxCellArr));
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new DialogInterface.OnClickListener(this) {
                AnonymousClass14(ProfileActivity this) {
                }

                @Override
                public void onClick(DialogInterface dialogInterface, int i3) {
                    dialogInterface.dismiss();
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
            if ((LocaleController.isRTL && f3 <= AndroidUtilities.dp(76.0f)) || (!LocaleController.isRTL && f3 >= view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) {
                NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) view;
                boolean z = !notificationsCheckCell.isChecked();
                boolean isGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(j, false, false);
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j, this.topicId);
                if (z) {
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
                    if (isGlobalNotificationsEnabled) {
                        edit.remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
                    } else {
                        edit.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey, 0);
                    }
                    if (this.topicId == 0) {
                        getMessagesStorage().setDialogFlags(j, 0L);
                        TLRPC$Dialog tLRPC$Dialog = getMessagesController().dialogs_dict.get(j);
                        if (tLRPC$Dialog != null) {
                            tLRPC$Dialog.notify_settings = new TLRPC$TL_peerNotifySettings();
                        }
                    }
                    edit.apply();
                } else {
                    SharedPreferences.Editor edit2 = MessagesController.getNotificationsSettings(this.currentAccount).edit();
                    if (!isGlobalNotificationsEnabled) {
                        edit2.remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
                        j2 = 0L;
                    } else {
                        edit2.putInt(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey, 2);
                        j2 = 1;
                    }
                    getNotificationsController().removeNotificationsForDialog(j);
                    if (this.topicId == 0) {
                        getMessagesStorage().setDialogFlags(j, j2);
                        TLRPC$Dialog tLRPC$Dialog2 = getMessagesController().dialogs_dict.get(j);
                        if (tLRPC$Dialog2 != null) {
                            TLRPC$TL_peerNotifySettings tLRPC$TL_peerNotifySettings = new TLRPC$TL_peerNotifySettings();
                            tLRPC$Dialog2.notify_settings = tLRPC$TL_peerNotifySettings;
                            if (isGlobalNotificationsEnabled) {
                                tLRPC$TL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                            }
                        }
                    }
                    edit2.apply();
                }
                updateExceptions();
                getNotificationsController().updateServerNotificationsSettings(j, this.topicId);
                notificationsCheckCell.setChecked(z);
                RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findViewHolderForPosition(this.notificationsRow);
                if (holder != null) {
                    this.listAdapter.onBindViewHolder(holder, this.notificationsRow);
                    return;
                }
                return;
            }
            ChatNotificationsPopupWrapper chatNotificationsPopupWrapper = new ChatNotificationsPopupWrapper(context, this.currentAccount, null, true, true, new ChatNotificationsPopupWrapper.Callback() {
                final long val$did;

                @Override
                public void dismiss() {
                    ChatNotificationsPopupWrapper.Callback.CC.$default$dismiss(this);
                }

                AnonymousClass15(long j3) {
                    r2 = j3;
                }

                @Override
                public void toggleSound() {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((BaseFragment) ProfileActivity.this).currentAccount);
                    boolean z2 = !notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(r2, ProfileActivity.this.topicId), true);
                    notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(r2, ProfileActivity.this.topicId), z2).apply();
                    if (BulletinFactory.canShowBulletin(ProfileActivity.this)) {
                        ProfileActivity profileActivity = ProfileActivity.this;
                        BulletinFactory.createSoundEnabledBulletin(profileActivity, !z2 ? 1 : 0, profileActivity.getResourceProvider()).show();
                    }
                }

                @Override
                public void muteFor(int i3) {
                    if (i3 == 0) {
                        if (ProfileActivity.this.getMessagesController().isDialogMuted(r2, ProfileActivity.this.topicId)) {
                            toggleMute();
                        }
                        if (BulletinFactory.canShowBulletin(ProfileActivity.this)) {
                            ProfileActivity profileActivity = ProfileActivity.this;
                            BulletinFactory.createMuteBulletin(profileActivity, 4, i3, profileActivity.getResourceProvider()).show();
                            return;
                        }
                        return;
                    }
                    ProfileActivity.this.getNotificationsController().muteUntil(r2, ProfileActivity.this.topicId, i3);
                    if (BulletinFactory.canShowBulletin(ProfileActivity.this)) {
                        ProfileActivity profileActivity2 = ProfileActivity.this;
                        BulletinFactory.createMuteBulletin(profileActivity2, 5, i3, profileActivity2.getResourceProvider()).show();
                    }
                    ProfileActivity.this.updateExceptions();
                    if (ProfileActivity.this.notificationsRow < 0 || ProfileActivity.this.listAdapter == null) {
                        return;
                    }
                    ProfileActivity.this.listAdapter.notifyItemChanged(ProfileActivity.this.notificationsRow);
                }

                @Override
                public void showCustomize() {
                    if (r2 != 0) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("dialog_id", r2);
                        bundle3.putLong("topic_id", ProfileActivity.this.topicId);
                        ProfileActivity profileActivity = ProfileActivity.this;
                        profileActivity.presentFragment(new ProfileNotificationsActivity(bundle3, profileActivity.resourcesProvider));
                    }
                }

                @Override
                public void toggleMute() {
                    boolean isDialogMuted2 = ProfileActivity.this.getMessagesController().isDialogMuted(r2, ProfileActivity.this.topicId);
                    ProfileActivity.this.getNotificationsController().muteDialog(r2, ProfileActivity.this.topicId, !isDialogMuted2);
                    ProfileActivity profileActivity = ProfileActivity.this;
                    if (profileActivity.fragmentView != null) {
                        BulletinFactory.createMuteBulletin(profileActivity, !isDialogMuted2, null).show();
                    }
                    ProfileActivity.this.updateExceptions();
                    if (ProfileActivity.this.notificationsRow < 0 || ProfileActivity.this.listAdapter == null) {
                        return;
                    }
                    ProfileActivity.this.listAdapter.notifyItemChanged(ProfileActivity.this.notificationsRow);
                }

                @Override
                public void openExceptions() {
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("dialog_id", r2);
                    TopicsNotifySettingsFragments topicsNotifySettingsFragments = new TopicsNotifySettingsFragments(bundle3);
                    topicsNotifySettingsFragments.setExceptions(ProfileActivity.this.notificationsExceptionTopics);
                    ProfileActivity.this.presentFragment(topicsNotifySettingsFragments);
                }
            }, getResourceProvider());
            chatNotificationsPopupWrapper.lambda$update$11(j3, this.topicId, this.notificationsExceptionTopics);
            if (AndroidUtilities.isTablet()) {
                ViewGroup view2 = this.parentLayout.getView();
                float x = view2.getX() + view2.getPaddingLeft() + f3;
                f4 += view2.getY() + view2.getPaddingTop();
                f3 = x;
            }
            chatNotificationsPopupWrapper.showAsOptions(this, view, f3, f4);
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
            AlertsCreator.createReportAlert(getParentActivity(), getDialogId(), 0, 0, this, this.resourcesProvider, null);
            return;
        }
        if (i >= this.membersStartRow && i < this.membersEndRow) {
            if (!this.sortedUsers.isEmpty()) {
                tLRPC$ChatParticipant = this.chatInfo.participants.participants.get(this.sortedUsers.get(i - this.membersStartRow).intValue());
            } else {
                tLRPC$ChatParticipant = this.chatInfo.participants.participants.get(i - this.membersStartRow);
            }
            onMemberClick(tLRPC$ChatParticipant, false, view);
            return;
        }
        if (i == this.addMemberRow) {
            openAddMember();
            return;
        }
        if (i == this.usernameRow) {
            processOnClickOrPress(i, view, f3, f4);
            return;
        }
        if (i == this.locationRow) {
            if (this.chatInfo.location instanceof TLRPC$TL_channelLocation) {
                LocationActivity locationActivity = new LocationActivity(5);
                locationActivity.setChatLocation(this.chatId, (TLRPC$TL_channelLocation) this.chatInfo.location);
                presentFragment(locationActivity);
                return;
            }
            return;
        }
        if (i == this.joinRow) {
            getMessagesController().addUserToChat(this.currentChat.id, getUserConfig().getCurrentUser(), 0, null, this, true, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.this.lambda$createView$7();
                }
            }, new MessagesController.ErrorDelegate() {
                @Override
                public final boolean run(TLRPC$TL_error tLRPC$TL_error) {
                    boolean lambda$createView$8;
                    lambda$createView$8 = ProfileActivity.this.lambda$createView$8(context, baseFragment, tLRPC$TL_error);
                    return lambda$createView$8;
                }
            });
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
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
        if (i == this.blockedUsersRow) {
            Bundle bundle5 = new Bundle();
            bundle5.putLong("chat_id", this.chatId);
            bundle5.putInt("type", 0);
            ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle5);
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
            Browser.openUrl(getParentActivity(), LocaleController.getString("TelegramFaqUrl", R.string.TelegramFaqUrl));
            return;
        }
        if (i == this.policyRow) {
            Browser.openUrl(getParentActivity(), LocaleController.getString("PrivacyPolicyUrl", R.string.PrivacyPolicyUrl));
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
            builder2.setMessage(LocaleController.getString("AreYouSure", R.string.AreYouSure));
            builder2.setTitle(LocaleController.getString("AppName", R.string.AppName));
            builder2.setPositiveButton(LocaleController.getString("OK", R.string.OK), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    ProfileActivity.this.lambda$createView$9(dialogInterface, i3);
                }
            });
            builder2.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
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
        if (i == this.businessRow) {
            presentFragment(new PremiumPreviewFragment(1, "settings"));
            return;
        }
        if (i == this.premiumGiftingRow) {
            UserSelectorBottomSheet.open(0L, BirthdayController.getInstance(this.currentAccount).getState());
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
            Bundle bundle6 = new Bundle();
            bundle6.putLong("chat_id", this.userInfo.personal_channel_id);
            presentFragment(new ChatActivity(bundle6));
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
        processOnClickOrPress(i, view, f3, f4);
    }

    public static void lambda$createView$6(CheckBoxCell[] checkBoxCellArr, View view) {
        checkBoxCellArr[0].setChecked(!checkBoxCellArr[0].isChecked(), true);
    }

    public class AnonymousClass13 implements DialogInterface.OnClickListener {
        final CheckBoxCell[] val$cells;

        public static void lambda$onClick$0(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        }

        AnonymousClass13(CheckBoxCell[] checkBoxCellArr) {
            this.val$cells = checkBoxCellArr;
        }

        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            TLRPC$TL_messages_reportReaction tLRPC$TL_messages_reportReaction = new TLRPC$TL_messages_reportReaction();
            tLRPC$TL_messages_reportReaction.user_id = ProfileActivity.this.getMessagesController().getInputUser(ProfileActivity.this.userId);
            tLRPC$TL_messages_reportReaction.peer = ProfileActivity.this.getMessagesController().getInputPeer(ProfileActivity.this.reportReactionFromDialogId);
            tLRPC$TL_messages_reportReaction.id = ProfileActivity.this.reportReactionMessageId;
            ConnectionsManager.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).sendRequest(tLRPC$TL_messages_reportReaction, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ProfileActivity.AnonymousClass13.lambda$onClick$0(tLObject, tLRPC$TL_error);
                }
            });
            CheckBoxCell[] checkBoxCellArr = this.val$cells;
            if (checkBoxCellArr[0] != null && checkBoxCellArr[0].isChecked()) {
                ProfileActivity.this.getMessagesController().deleteParticipantFromChat(-ProfileActivity.this.reportReactionFromDialogId, ProfileActivity.this.getMessagesController().getUser(Long.valueOf(ProfileActivity.this.userId)));
            }
            ProfileActivity.this.reportReactionMessageId = 0;
            ProfileActivity.this.updateListAnimated(false);
            BulletinFactory.of(ProfileActivity.this).createReportSent(ProfileActivity.this.resourcesProvider).show();
        }
    }

    public class AnonymousClass14 implements DialogInterface.OnClickListener {
        AnonymousClass14(ProfileActivity this) {
        }

        @Override
        public void onClick(DialogInterface dialogInterface, int i3) {
            dialogInterface.dismiss();
        }
    }

    public class AnonymousClass15 implements ChatNotificationsPopupWrapper.Callback {
        final long val$did;

        @Override
        public void dismiss() {
            ChatNotificationsPopupWrapper.Callback.CC.$default$dismiss(this);
        }

        AnonymousClass15(long j3) {
            r2 = j3;
        }

        @Override
        public void toggleSound() {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((BaseFragment) ProfileActivity.this).currentAccount);
            boolean z2 = !notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(r2, ProfileActivity.this.topicId), true);
            notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(r2, ProfileActivity.this.topicId), z2).apply();
            if (BulletinFactory.canShowBulletin(ProfileActivity.this)) {
                ProfileActivity profileActivity = ProfileActivity.this;
                BulletinFactory.createSoundEnabledBulletin(profileActivity, !z2 ? 1 : 0, profileActivity.getResourceProvider()).show();
            }
        }

        @Override
        public void muteFor(int i3) {
            if (i3 == 0) {
                if (ProfileActivity.this.getMessagesController().isDialogMuted(r2, ProfileActivity.this.topicId)) {
                    toggleMute();
                }
                if (BulletinFactory.canShowBulletin(ProfileActivity.this)) {
                    ProfileActivity profileActivity = ProfileActivity.this;
                    BulletinFactory.createMuteBulletin(profileActivity, 4, i3, profileActivity.getResourceProvider()).show();
                    return;
                }
                return;
            }
            ProfileActivity.this.getNotificationsController().muteUntil(r2, ProfileActivity.this.topicId, i3);
            if (BulletinFactory.canShowBulletin(ProfileActivity.this)) {
                ProfileActivity profileActivity2 = ProfileActivity.this;
                BulletinFactory.createMuteBulletin(profileActivity2, 5, i3, profileActivity2.getResourceProvider()).show();
            }
            ProfileActivity.this.updateExceptions();
            if (ProfileActivity.this.notificationsRow < 0 || ProfileActivity.this.listAdapter == null) {
                return;
            }
            ProfileActivity.this.listAdapter.notifyItemChanged(ProfileActivity.this.notificationsRow);
        }

        @Override
        public void showCustomize() {
            if (r2 != 0) {
                Bundle bundle3 = new Bundle();
                bundle3.putLong("dialog_id", r2);
                bundle3.putLong("topic_id", ProfileActivity.this.topicId);
                ProfileActivity profileActivity = ProfileActivity.this;
                profileActivity.presentFragment(new ProfileNotificationsActivity(bundle3, profileActivity.resourcesProvider));
            }
        }

        @Override
        public void toggleMute() {
            boolean isDialogMuted2 = ProfileActivity.this.getMessagesController().isDialogMuted(r2, ProfileActivity.this.topicId);
            ProfileActivity.this.getNotificationsController().muteDialog(r2, ProfileActivity.this.topicId, !isDialogMuted2);
            ProfileActivity profileActivity = ProfileActivity.this;
            if (profileActivity.fragmentView != null) {
                BulletinFactory.createMuteBulletin(profileActivity, !isDialogMuted2, null).show();
            }
            ProfileActivity.this.updateExceptions();
            if (ProfileActivity.this.notificationsRow < 0 || ProfileActivity.this.listAdapter == null) {
                return;
            }
            ProfileActivity.this.listAdapter.notifyItemChanged(ProfileActivity.this.notificationsRow);
        }

        @Override
        public void openExceptions() {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("dialog_id", r2);
            TopicsNotifySettingsFragments topicsNotifySettingsFragments = new TopicsNotifySettingsFragments(bundle3);
            topicsNotifySettingsFragments.setExceptions(ProfileActivity.this.notificationsExceptionTopics);
            ProfileActivity.this.presentFragment(topicsNotifySettingsFragments);
        }
    }

    public void lambda$createView$7() {
        updateRowsIds();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    public boolean lambda$createView$8(Context context, BaseFragment baseFragment, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null || !"INVITE_REQUEST_SENT".equals(tLRPC$TL_error.text)) {
            return true;
        }
        MessagesController.getNotificationsSettings(this.currentAccount).edit().putLong("dialog_join_requested_time_" + this.dialogId, System.currentTimeMillis()).commit();
        JoinGroupAlert.showBulletin(context, this, ChatObject.isChannel(this.currentChat) && !this.currentChat.megagroup);
        updateRowsIds();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        if (baseFragment instanceof ChatActivity) {
            ((ChatActivity) baseFragment).showBottomOverlayProgress(false, true);
        }
        return false;
    }

    public void lambda$createView$9(DialogInterface dialogInterface, int i) {
        SharedConfig.pushAuthKey = null;
        SharedConfig.pushAuthKeyId = null;
        SharedConfig.saveConfig();
        getConnectionsManager().switchBackend(true);
    }

    public class AnonymousClass16 implements RecyclerListView.OnItemLongClickListener {
        private int pressCount = 0;
        final Context val$context;

        AnonymousClass16(Context context) {
            this.val$context = context;
        }

        @Override
        public boolean onItemClick(View view, int i) {
            int i2;
            String str;
            String string;
            int i3;
            String str2;
            String str3;
            String str4;
            String str5;
            if (i != ProfileActivity.this.versionRow) {
                if (i >= ProfileActivity.this.membersStartRow && i < ProfileActivity.this.membersEndRow) {
                    return ProfileActivity.this.onMemberClick(!ProfileActivity.this.sortedUsers.isEmpty() ? (TLRPC$ChatParticipant) ProfileActivity.this.visibleChatParticipants.get(((Integer) ProfileActivity.this.sortedUsers.get(i - ProfileActivity.this.membersStartRow)).intValue()) : (TLRPC$ChatParticipant) ProfileActivity.this.visibleChatParticipants.get(i - ProfileActivity.this.membersStartRow), true, view);
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
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    return true;
                }
                if (profileActivity.editRow(view, i)) {
                    return true;
                }
                return ProfileActivity.this.processOnClickOrPress(i, view, view.getWidth() / 2.0f, (int) (view.getHeight() * 0.75f));
            }
            int i4 = this.pressCount + 1;
            this.pressCount = i4;
            if (i4 >= 2 || BuildVars.DEBUG_PRIVATE_VERSION) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this.getParentActivity(), ProfileActivity.this.resourcesProvider);
                builder.setTitle(LocaleController.getString("DebugMenu", R.string.DebugMenu));
                CharSequence[] charSequenceArr = new CharSequence[32];
                charSequenceArr[0] = LocaleController.getString("DebugMenuImportContacts", R.string.DebugMenuImportContacts);
                charSequenceArr[1] = LocaleController.getString("DebugMenuReloadContacts", R.string.DebugMenuReloadContacts);
                charSequenceArr[2] = LocaleController.getString("DebugMenuResetContacts", R.string.DebugMenuResetContacts);
                charSequenceArr[3] = LocaleController.getString("DebugMenuResetDialogs", R.string.DebugMenuResetDialogs);
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
                charSequenceArr[4] = string;
                if (SharedConfig.inappCamera) {
                    i3 = R.string.DebugMenuDisableCamera;
                    str2 = "DebugMenuDisableCamera";
                } else {
                    i3 = R.string.DebugMenuEnableCamera;
                    str2 = "DebugMenuEnableCamera";
                }
                charSequenceArr[5] = LocaleController.getString(str2, i3);
                charSequenceArr[6] = LocaleController.getString("DebugMenuClearMediaCache", R.string.DebugMenuClearMediaCache);
                charSequenceArr[7] = LocaleController.getString("DebugMenuCallSettings", R.string.DebugMenuCallSettings);
                charSequenceArr[8] = null;
                charSequenceArr[9] = (BuildVars.DEBUG_PRIVATE_VERSION || ApplicationLoader.isStandaloneBuild()) ? LocaleController.getString("DebugMenuCheckAppUpdate", R.string.DebugMenuCheckAppUpdate) : null;
                charSequenceArr[10] = LocaleController.getString("DebugMenuReadAllDialogs", R.string.DebugMenuReadAllDialogs);
                charSequenceArr[11] = BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.disableVoiceAudioEffects ? "Enable voip audio effects" : "Disable voip audio effects" : null;
                boolean z = BuildVars.DEBUG_PRIVATE_VERSION;
                charSequenceArr[12] = z ? "Clean app update" : null;
                charSequenceArr[13] = z ? "Reset suggestions" : null;
                charSequenceArr[14] = z ? LocaleController.getString(R.string.DebugMenuClearWebViewCache) : null;
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 19) {
                    str3 = LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuDisableWebViewDebug : R.string.DebugMenuEnableWebViewDebug);
                } else {
                    str3 = null;
                }
                charSequenceArr[15] = str3;
                charSequenceArr[16] = (AndroidUtilities.isTabletInternal() && BuildVars.DEBUG_PRIVATE_VERSION) ? SharedConfig.forceDisableTabletMode ? "Enable tablet mode" : "Disable tablet mode" : null;
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    str4 = LocaleController.getString(SharedConfig.isFloatingDebugActive ? R.string.FloatingDebugDisable : R.string.FloatingDebugEnable);
                } else {
                    str4 = null;
                }
                charSequenceArr[17] = str4;
                boolean z2 = BuildVars.DEBUG_PRIVATE_VERSION;
                charSequenceArr[18] = z2 ? "Force remove premium suggestions" : null;
                charSequenceArr[19] = z2 ? "Share device info" : null;
                charSequenceArr[20] = z2 ? "Force performance class" : null;
                charSequenceArr[21] = (!z2 || InstantCameraView.allowBigSizeCameraDebug()) ? null : !SharedConfig.bigCameraForRound ? "Force big camera for round" : "Disable big camera for round";
                charSequenceArr[22] = LocaleController.getString(DualCameraView.dualAvailableStatic(ProfileActivity.this.getContext()) ? "DebugMenuDualOff" : "DebugMenuDualOn");
                charSequenceArr[23] = BuildVars.DEBUG_VERSION ? SharedConfig.useSurfaceInStories ? "back to TextureView in stories" : "use SurfaceView in stories" : null;
                charSequenceArr[24] = BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.photoViewerBlur ? "do not blur in photoviewer" : "blur in photoviewer" : null;
                charSequenceArr[25] = !SharedConfig.payByInvoice ? "Enable Invoice Payment" : "Disable Invoice Payment";
                charSequenceArr[26] = BuildVars.DEBUG_PRIVATE_VERSION ? "Update Attach Bots" : null;
                if (i5 >= 21) {
                    str5 = !SharedConfig.isUsingCamera2(((BaseFragment) ProfileActivity.this).currentAccount) ? "Use Camera 2 API" : "Use old Camera 1 API";
                } else {
                    str5 = null;
                }
                charSequenceArr[27] = str5;
                charSequenceArr[28] = BuildVars.DEBUG_VERSION ? "Clear bot biometry data" : null;
                charSequenceArr[29] = BuildVars.DEBUG_PRIVATE_VERSION ? "Clear all login tokens" : null;
                charSequenceArr[30] = (!SharedConfig.canBlurChat() || i5 < 31) ? null : SharedConfig.useNewBlur ? "back to cpu blur" : "use new gpu blur";
                charSequenceArr[31] = BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.botTabs3DEffect ? "disable tabs 3d effect" : "enable tabs 3d effect" : null;
                final Context context = this.val$context;
                builder.setItems(charSequenceArr, new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i6) {
                        ProfileActivity.AnonymousClass16.this.lambda$onItemClick$3(context, dialogInterface, i6);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                ProfileActivity.this.showDialog(builder.create());
            } else {
                try {
                    Toast.makeText(ProfileActivity.this.getParentActivity(), LocaleController.getString("DebugMenuLongPress", R.string.DebugMenuLongPress), 0).show();
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
            return true;
        }

        public void lambda$onItemClick$3(Context context, DialogInterface dialogInterface, int i) {
            long j;
            int i2;
            int i3 = 0;
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
                MessagesController.getGlobalMainSettings().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l").remove("speedhint").remove("gifhint").remove("reminderhint").remove("soundHint").remove("themehint").remove("bganimationhint").remove("filterhint").remove("n_0").remove("storyprvhint").remove("storyhint").remove("storyhint2").remove("storydualhint").remove("storysvddualhint").remove("stories_camera").remove("dualcam").remove("dualmatrix").remove("dual_available").remove("archivehint").remove("askNotificationsAfter").remove("askNotificationsDuration").remove("viewoncehint").remove("taptostorysoundhint").remove("nothanos").remove("voiceoncehint").remove("savedhint").remove("savedsearchhint").remove("savedsearchtaghint").remove("groupEmojiPackHintShown").remove("newppsms").remove("monetizationadshint").apply();
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
                SharedPreferences.Editor edit = mainSettings.edit();
                edit.remove("peerColors").remove("profilePeerColors").remove("boostingappearance").remove("bizbothint");
                for (String str : mainSettings.getAll().keySet()) {
                    if (str.contains("show_gift_for_") || str.contains("bdayhint_") || str.contains("bdayanim_")) {
                        edit.remove(str);
                    }
                }
                edit.commit();
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
            if (i == 14) {
                ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                WebStorage.getInstance().deleteAllData();
                return;
            }
            if (i == 15) {
                SharedConfig.toggleDebugWebView();
                Toast.makeText(ProfileActivity.this.getParentActivity(), LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuWebViewDebugEnabled : R.string.DebugMenuWebViewDebugDisabled), 0).show();
                return;
            }
            if (i == 16) {
                SharedConfig.toggleForceDisableTabletMode();
                Activity findActivity = AndroidUtilities.findActivity(context);
                Intent launchIntentForPackage = findActivity.getPackageManager().getLaunchIntentForPackage(findActivity.getPackageName());
                findActivity.finishAffinity();
                findActivity.startActivity(launchIntentForPackage);
                System.exit(0);
                return;
            }
            if (i == 17) {
                FloatingDebugController.setActive((LaunchActivity) ProfileActivity.this.getParentActivity(), true ^ FloatingDebugController.isActive());
                return;
            }
            if (i == 18) {
                ProfileActivity.this.getMessagesController().loadAppConfig();
                TLRPC$TL_help_dismissSuggestion tLRPC$TL_help_dismissSuggestion = new TLRPC$TL_help_dismissSuggestion();
                tLRPC$TL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                tLRPC$TL_help_dismissSuggestion.peer = new TLRPC$TL_inputPeerEmpty();
                ProfileActivity.this.getConnectionsManager().sendRequest(tLRPC$TL_help_dismissSuggestion, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        ProfileActivity.AnonymousClass16.this.lambda$onItemClick$1(tLObject, tLRPC$TL_error);
                    }
                });
                return;
            }
            if (i != 19) {
                if (i == 20) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(ProfileActivity.this.getParentActivity(), ProfileActivity.this.resourcesProvider);
                    builder.setTitle("Force performance class");
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    final int measureDevicePerformanceClass = SharedConfig.measureDevicePerformanceClass();
                    CharSequence[] charSequenceArr = new CharSequence[3];
                    StringBuilder sb = new StringBuilder();
                    sb.append(devicePerformanceClass == 2 ? "**HIGH**" : "HIGH");
                    sb.append(measureDevicePerformanceClass == 2 ? " (measured)" : "");
                    charSequenceArr[0] = AndroidUtilities.replaceTags(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(devicePerformanceClass == 1 ? "**AVERAGE**" : "AVERAGE");
                    sb2.append(measureDevicePerformanceClass == 1 ? " (measured)" : "");
                    charSequenceArr[1] = AndroidUtilities.replaceTags(sb2.toString());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(devicePerformanceClass == 0 ? "**LOW**" : "LOW");
                    sb3.append(measureDevicePerformanceClass != 0 ? "" : " (measured)");
                    charSequenceArr[2] = AndroidUtilities.replaceTags(sb3.toString());
                    builder.setItems(charSequenceArr, new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface2, int i4) {
                            ProfileActivity.AnonymousClass16.lambda$onItemClick$2(measureDevicePerformanceClass, dialogInterface2, i4);
                        }
                    });
                    builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                    builder.show();
                    return;
                }
                if (i == 21) {
                    SharedConfig.toggleRoundCamera();
                    return;
                }
                if (i == 22) {
                    boolean dualAvailableStatic = DualCameraView.dualAvailableStatic(ProfileActivity.this.getContext());
                    MessagesController.getGlobalMainSettings().edit().putBoolean("dual_available", !dualAvailableStatic).apply();
                    try {
                        Toast.makeText(ProfileActivity.this.getParentActivity(), LocaleController.getString(!dualAvailableStatic ? R.string.DebugMenuDualOnToast : R.string.DebugMenuDualOffToast), 0).show();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                if (i == 23) {
                    SharedConfig.toggleSurfaceInStories();
                    while (i3 < ProfileActivity.this.getParentLayout().getFragmentStack().size()) {
                        ProfileActivity.this.getParentLayout().getFragmentStack().get(i3).clearSheets();
                        i3++;
                    }
                    return;
                }
                if (i == 24) {
                    SharedConfig.togglePhotoViewerBlur();
                    return;
                }
                if (i == 25) {
                    SharedConfig.togglePaymentByInvoice();
                    return;
                }
                if (i == 26) {
                    ProfileActivity.this.getMediaDataController().loadAttachMenuBots(false, true);
                    return;
                }
                if (i == 27) {
                    SharedConfig.toggleUseCamera2(((BaseFragment) ProfileActivity.this).currentAccount);
                    return;
                }
                if (i == 28) {
                    BotBiometry.clear();
                    return;
                }
                if (i == 29) {
                    AuthTokensHelper.clearLogInTokens();
                    return;
                } else if (i == 30) {
                    SharedConfig.toggleUseNewBlur();
                    return;
                } else {
                    if (i == 31) {
                        SharedConfig.setBotTabs3DEffect(!SharedConfig.botTabs3DEffect);
                        return;
                    }
                    return;
                }
            }
            int i4 = ConnectionsManager.CPU_COUNT;
            int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
            StringBuilder sb4 = new StringBuilder();
            long j2 = 0;
            long j3 = 0;
            long j4 = 0;
            long j5 = 0;
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            while (i3 < i4) {
                Long sysInfoLong = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i3 + "/cpufreq/cpuinfo_min_freq");
                Long sysInfoLong2 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i3 + "/cpufreq/cpuinfo_cur_freq");
                StringBuilder sb5 = new StringBuilder();
                sb5.append("/sys/devices/system/cpu/cpu");
                sb5.append(i3);
                int i5 = i4;
                sb5.append("/cpufreq/cpuinfo_max_freq");
                Long sysInfoLong3 = AndroidUtilities.getSysInfoLong(sb5.toString());
                Long sysInfoLong4 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i3 + "/cpu_capacity");
                sb4.append("#");
                sb4.append(i3);
                sb4.append(" ");
                int i6 = memoryClass;
                if (sysInfoLong != null) {
                    sb4.append("min=");
                    i2 = i3;
                    sb4.append(sysInfoLong.longValue() / 1000);
                    sb4.append(" ");
                    j2 += sysInfoLong.longValue() / 1000;
                    j3++;
                } else {
                    i2 = i3;
                }
                if (sysInfoLong2 != null) {
                    sb4.append("cur=");
                    sb4.append(sysInfoLong2.longValue() / 1000);
                    sb4.append(" ");
                    j4 += sysInfoLong2.longValue() / 1000;
                    j5++;
                }
                if (sysInfoLong3 != null) {
                    sb4.append("max=");
                    sb4.append(sysInfoLong3.longValue() / 1000);
                    sb4.append(" ");
                    j6 += sysInfoLong3.longValue() / 1000;
                    j7++;
                }
                if (sysInfoLong4 != null) {
                    sb4.append("cpc=");
                    sb4.append(sysInfoLong4);
                    sb4.append(" ");
                    j8 += sysInfoLong4.longValue();
                    j9++;
                }
                sb4.append("\n");
                i3 = i2 + 1;
                i4 = i5;
                memoryClass = i6;
            }
            int i7 = i4;
            int i8 = memoryClass;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(Build.MANUFACTURER);
            sb6.append(", ");
            sb6.append(Build.MODEL);
            sb6.append(" (");
            sb6.append(Build.PRODUCT);
            sb6.append(", ");
            sb6.append(Build.DEVICE);
            sb6.append(") ");
            sb6.append(" (android ");
            int i9 = Build.VERSION.SDK_INT;
            sb6.append(i9);
            sb6.append(")\n");
            if (i9 >= 31) {
                sb6.append("SoC: ");
                sb6.append(Build.SOC_MANUFACTURER);
                sb6.append(", ");
                sb6.append(Build.SOC_MODEL);
                sb6.append("\n");
            }
            String sysInfoString = AndroidUtilities.getSysInfoString("/sys/kernel/gpu/gpu_model");
            if (sysInfoString != null) {
                sb6.append("GPU: ");
                sb6.append(sysInfoString);
                Long sysInfoLong5 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_min_clock");
                Long sysInfoLong6 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_mm_min_clock");
                Long sysInfoLong7 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_max_clock");
                if (sysInfoLong5 != null) {
                    sb6.append(", min=");
                    j = j4;
                    sb6.append(sysInfoLong5.longValue() / 1000);
                } else {
                    j = j4;
                }
                if (sysInfoLong6 != null) {
                    sb6.append(", mmin=");
                    sb6.append(sysInfoLong6.longValue() / 1000);
                }
                if (sysInfoLong7 != null) {
                    sb6.append(", max=");
                    sb6.append(sysInfoLong7.longValue() / 1000);
                }
                sb6.append("\n");
            } else {
                j = j4;
            }
            ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getDeviceConfigurationInfo();
            sb6.append("GLES Version: ");
            sb6.append(deviceConfigurationInfo.getGlEsVersion());
            sb6.append("\n");
            sb6.append("Memory: class=");
            sb6.append(AndroidUtilities.formatFileSize(i8 * 1024 * 1024));
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryInfo(memoryInfo);
            sb6.append(", total=");
            sb6.append(AndroidUtilities.formatFileSize(memoryInfo.totalMem));
            sb6.append(", avail=");
            sb6.append(AndroidUtilities.formatFileSize(memoryInfo.availMem));
            sb6.append(", low?=");
            sb6.append(memoryInfo.lowMemory);
            sb6.append(" (threshold=");
            sb6.append(AndroidUtilities.formatFileSize(memoryInfo.threshold));
            sb6.append(")");
            sb6.append("\n");
            sb6.append("Current class: ");
            sb6.append(SharedConfig.performanceClassName(SharedConfig.getDevicePerformanceClass()));
            sb6.append(", measured: ");
            sb6.append(SharedConfig.performanceClassName(SharedConfig.measureDevicePerformanceClass()));
            if (i9 >= 31) {
                sb6.append(", suggest=");
                sb6.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
            }
            sb6.append("\n");
            sb6.append(i7);
            sb6.append(" CPUs");
            if (j3 > 0) {
                sb6.append(", avgMinFreq=");
                sb6.append(j2 / j3);
            }
            if (j5 > 0) {
                sb6.append(", avgCurFreq=");
                sb6.append(j / j5);
            }
            if (j7 > 0) {
                sb6.append(", avgMaxFreq=");
                sb6.append(j6 / j7);
            }
            if (j9 > 0) {
                sb6.append(", avgCapacity=");
                sb6.append(j8 / j9);
            }
            sb6.append("\n");
            sb6.append((CharSequence) sb4);
            ProfileActivity.this.listCodecs(MediaController.VIDEO_MIME_TYPE, sb6);
            ProfileActivity.this.listCodecs("video/hevc", sb6);
            ProfileActivity.this.listCodecs("video/x-vnd.on2.vp8", sb6);
            ProfileActivity.this.listCodecs("video/x-vnd.on2.vp9", sb6);
            ProfileActivity.this.showDialog(new AnonymousClass1(ProfileActivity.this.getParentActivity(), null, sb6.toString(), false, null, false));
        }

        public void lambda$onItemClick$1(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            TLRPC$TL_help_dismissSuggestion tLRPC$TL_help_dismissSuggestion = new TLRPC$TL_help_dismissSuggestion();
            tLRPC$TL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
            tLRPC$TL_help_dismissSuggestion.peer = new TLRPC$TL_inputPeerEmpty();
            ProfileActivity.this.getConnectionsManager().sendRequest(tLRPC$TL_help_dismissSuggestion, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error2) {
                    ProfileActivity.AnonymousClass16.this.lambda$onItemClick$0(tLObject2, tLRPC$TL_error2);
                }
            });
        }

        public void lambda$onItemClick$0(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            ProfileActivity.this.getMessagesController().loadAppConfig();
        }

        public class AnonymousClass1 extends ShareAlert {
            AnonymousClass1(Context context, ArrayList arrayList, String str, boolean z, String str2, boolean z2) {
                super(context, arrayList, str, z, str2, z2);
            }

            @Override
            public void onSend(final LongSparseArray<TLRPC$Dialog> longSparseArray, final int i, TLRPC$TL_forumTopic tLRPC$TL_forumTopic) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ProfileActivity.AnonymousClass16.AnonymousClass1.this.lambda$onSend$0(longSparseArray, i);
                    }
                }, 250L);
            }

            public void lambda$onSend$0(LongSparseArray longSparseArray, int i) {
                BulletinFactory.createInviteSentBulletin(ProfileActivity.this.getParentActivity(), ProfileActivity.this.contentView, longSparseArray.size(), longSparseArray.size() == 1 ? ((TLRPC$Dialog) longSparseArray.valueAt(0)).id : 0L, i, getThemedColor(Theme.key_undo_background), getThemedColor(Theme.key_undo_infoColor)).show();
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

    public void lambda$createView$11(android.view.View r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.lambda$createView$11(android.view.View, int):void");
    }

    public boolean lambda$createView$13(View view, int i) {
        if (this.searchAdapter.isSearchWas() || this.searchAdapter.recentSearches.isEmpty()) {
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), this.resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.ClearSearchAlertTitle));
        builder.setMessage(LocaleController.getString(R.string.ClearSearchAlert));
        builder.setPositiveButton(LocaleController.getString("ClearButton", R.string.ClearButton), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ProfileActivity.this.lambda$createView$12(dialogInterface, i2);
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        AlertDialog create = builder.create();
        showDialog(create);
        TextView textView = (TextView) create.getButton(-1);
        if (textView == null) {
            return true;
        }
        textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        return true;
    }

    public void lambda$createView$12(DialogInterface dialogInterface, int i) {
        this.searchAdapter.clearRecent();
    }

    class AnonymousClass17 extends RecyclerView.OnScrollListener {
        AnonymousClass17() {
        }

        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int i3) {
            if (i3 == 1) {
                AndroidUtilities.hideKeyboard(ProfileActivity.this.getParentActivity().getCurrentFocus());
            }
        }
    }

    public void lambda$createView$14(TLObject tLObject) {
        this.currentChannelParticipant = ((TLRPC$TL_channels_channelParticipant) tLObject).participant;
    }

    public void lambda$createView$15(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.this.lambda$createView$14(tLObject);
                }
            });
        }
    }

    class AnonymousClass18 extends FrameLayout {
        AnonymousClass18(ProfileActivity this, final Context context222) {
            super(context222);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int intrinsicHeight = Theme.chat_composeShadowDrawable.getIntrinsicHeight();
            Theme.chat_composeShadowDrawable.setBounds(0, 0, getMeasuredWidth(), intrinsicHeight);
            Theme.chat_composeShadowDrawable.draw(canvas);
            canvas.drawRect(0.0f, intrinsicHeight, getMeasuredWidth(), getMeasuredHeight(), Theme.chat_composeBackgroundPaint);
        }
    }

    public class AnonymousClass19 implements ChatRightsEditActivity.ChatRightsEditActivityDelegate {
        final TLRPC$Chat val$chat;
        final ChatRightsEditActivity val$fragment;

        AnonymousClass19(TLRPC$Chat tLRPC$Chat, ChatRightsEditActivity chatRightsEditActivity) {
            this.val$chat = tLRPC$Chat;
            this.val$fragment = chatRightsEditActivity;
        }

        @Override
        public void didSetRights(int i, TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights, TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights, String str) {
            ChatRightsEditActivity chatRightsEditActivity;
            ProfileActivity.this.removeSelfFromStack();
            final TLRPC$User user = ProfileActivity.this.getMessagesController().getUser(Long.valueOf(ProfileActivity.this.userId));
            if (user == null || this.val$chat == null || ProfileActivity.this.userId == 0 || (chatRightsEditActivity = this.val$fragment) == null || !chatRightsEditActivity.banning || chatRightsEditActivity.getParentLayout() == null) {
                return;
            }
            for (final BaseFragment baseFragment : this.val$fragment.getParentLayout().getFragmentStack()) {
                if (baseFragment instanceof ChannelAdminLogActivity) {
                    ((ChannelAdminLogActivity) baseFragment).lambda$processSelectedOption$20();
                    final TLRPC$Chat tLRPC$Chat = this.val$chat;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            ProfileActivity.AnonymousClass19.lambda$didSetRights$0(BaseFragment.this, user, tLRPC$Chat);
                        }
                    });
                    return;
                }
            }
        }

        public static void lambda$didSetRights$0(BaseFragment baseFragment, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat) {
            BulletinFactory.createRemoveFromChatBulletin(baseFragment, tLRPC$User, tLRPC$Chat.title).show();
        }

        @Override
        public void didChangeOwner(TLRPC$User tLRPC$User) {
            ProfileActivity.this.undoView.showWithAction(-ProfileActivity.this.chatId, ProfileActivity.this.currentChat.megagroup ? 10 : 9, tLRPC$User);
        }
    }

    public void lambda$createView$16(TLRPC$Chat tLRPC$Chat, View view) {
        long j = this.userId;
        long j2 = this.banFromGroup;
        TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights = tLRPC$Chat.default_banned_rights;
        TLRPC$ChannelParticipant tLRPC$ChannelParticipant = this.currentChannelParticipant;
        ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(j, j2, null, tLRPC$TL_chatBannedRights, tLRPC$ChannelParticipant != null ? tLRPC$ChannelParticipant.banned_rights : null, "", 1, true, false, null);
        chatRightsEditActivity.setDelegate(new AnonymousClass19(tLRPC$Chat, chatRightsEditActivity));
        presentFragment(chatRightsEditActivity);
    }

    public class AnonymousClass20 extends FrameLayout {
        CanvasButton canvasButton;

        AnonymousClass20(Context context) {
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
                float dp = AndroidUtilities.dp(22.0f);
                float dp2 = ((AndroidUtilities.dp(28.0f) - ProfileActivity.this.customPhotoOffset) + ProfileActivity.this.onlineTextView[1].getX()) - dp;
                ProfileActivity.this.fallbackImage.setImageCoords(dp2, y - (dp / 2.0f), dp, dp);
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
                                ProfileActivity.AnonymousClass20.this.lambda$dispatchDraw$0();
                            }
                        });
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(dp2 - AndroidUtilities.dp(4.0f), y - AndroidUtilities.dp(14.0f), dp2 + ProfileActivity.this.onlineTextView[2].getTextWidth() + (AndroidUtilities.dp(28.0f) * (1.0f - ProfileActivity.this.customAvatarProgress)) + AndroidUtilities.dp(4.0f), y + AndroidUtilities.dp(14.0f));
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
            CanvasButton canvasButton = this.canvasButton;
            return (canvasButton != null && canvasButton.checkTouchEvent(motionEvent)) || super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            CanvasButton canvasButton = this.canvasButton;
            return (canvasButton != null && canvasButton.checkTouchEvent(motionEvent)) || super.onTouchEvent(motionEvent);
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
    }

    class AnonymousClass21 extends AvatarImageView {
        AnonymousClass21(ProfileActivity this, final Context context222) {
            super(context222);
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (getImageReceiver().hasNotThumb()) {
                accessibilityNodeInfo.setText(LocaleController.getString("AccDescrProfilePicture", R.string.AccDescrProfilePicture));
                if (Build.VERSION.SDK_INT >= 21) {
                    accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString("Open", R.string.Open)));
                    accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, LocaleController.getString("AccDescrOpenInPhotoViewer", R.string.AccDescrOpenInPhotoViewer)));
                    return;
                }
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
    }

    public void lambda$createView$18(View view) {
        TLRPC$Document findDocument;
        Bulletin createContainsEmojiBulletin;
        if (this.avatarBig != null) {
            return;
        }
        if (this.isTopic && !getMessagesController().premiumFeaturesBlocked()) {
            ArrayList<TLRPC$TL_forumTopic> topics = getMessagesController().getTopicsController().getTopics(this.chatId);
            if (topics != null) {
                TLRPC$TL_forumTopic tLRPC$TL_forumTopic = null;
                for (int i = 0; tLRPC$TL_forumTopic == null && i < topics.size(); i++) {
                    TLRPC$TL_forumTopic tLRPC$TL_forumTopic2 = topics.get(i);
                    if (tLRPC$TL_forumTopic2 != null && tLRPC$TL_forumTopic2.id == this.topicId) {
                        tLRPC$TL_forumTopic = tLRPC$TL_forumTopic2;
                    }
                }
                if (tLRPC$TL_forumTopic != null) {
                    long j = tLRPC$TL_forumTopic.icon_emoji_id;
                    if (j == 0 || (findDocument = AnimatedEmojiDrawable.findDocument(this.currentAccount, j)) == null || (createContainsEmojiBulletin = BulletinFactory.of(this).createContainsEmojiBulletin(findDocument, 1, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            ProfileActivity.this.lambda$createView$17((TLRPC$InputStickerSet) obj);
                        }
                    })) == null) {
                        return;
                    }
                    createContainsEmojiBulletin.show();
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

    public void lambda$createView$17(TLRPC$InputStickerSet tLRPC$InputStickerSet) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(tLRPC$InputStickerSet);
        showDialog(new EmojiPacksAlert(this, getParentActivity(), this.resourcesProvider, arrayList));
    }

    public boolean lambda$createView$19(View view) {
        if (this.avatarBig == null && !this.isTopic) {
            openAvatar();
        }
        return false;
    }

    class AnonymousClass22 extends RadialProgressView {
        private Paint paint;

        AnonymousClass22(final Context context222) {
            super(context222);
            Paint paint = new Paint(1);
            this.paint = paint;
            paint.setColor(1426063360);
        }

        @Override
        public void onDraw(Canvas canvas) {
            if (ProfileActivity.this.avatarImage != null && ProfileActivity.this.avatarImage.getImageReceiver().hasNotThumb()) {
                this.paint.setAlpha((int) (ProfileActivity.this.avatarImage.getImageReceiver().getCurrentAlpha() * 85.0f));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, this.paint);
            }
            super.onDraw(canvas);
        }
    }

    class AnonymousClass23 extends ProfileGalleryView {
        AnonymousClass23(final Context context222, long j32, ActionBar actionBar, RecyclerListView recyclerListView2, AvatarImageView avatarImageView, int i4, ProfileGalleryView.Callback callback) {
            super(context222, j32, actionBar, recyclerListView2, avatarImageView, i4, callback);
        }

        @Override
        protected void setCustomAvatarProgress(float f3) {
            ProfileActivity.this.customAvatarProgress = f3;
            ProfileActivity.this.checkPhotoDescriptionAlpha();
        }
    }

    class AnonymousClass24 extends SimpleTextView {
        AnonymousClass24(final Context context222) {
            super(context222);
        }

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
    }

    class AnonymousClass25 extends LinkSpanDrawable.ClickableSmallTextView {
        AnonymousClass25(final Context context222) {
            super(context222);
        }

        @Override
        public void setAlpha(float f4) {
            super.setAlpha(f4);
            ProfileActivity.this.checkPhotoDescriptionAlpha();
        }

        @Override
        public void setTranslationY(float f4) {
            super.setTranslationY(f4);
            ProfileActivity.this.onlineTextView[2].setTranslationY(f4);
            ProfileActivity.this.onlineTextView[3].setTranslationY(f4);
        }

        @Override
        public void setTranslationX(float f4) {
            super.setTranslationX(f4);
            ProfileActivity.this.onlineTextView[2].setTranslationX(f4);
            ProfileActivity.this.onlineTextView[3].setTranslationX(f4);
        }

        @Override
        public void setTextColor(int i6) {
            super.setTextColor(i6);
            if (ProfileActivity.this.onlineTextView[2] != null) {
                ProfileActivity.this.onlineTextView[2].setTextColor(i6);
                ProfileActivity.this.onlineTextView[3].setTextColor(i6);
            }
            if (ProfileActivity.this.showStatusButton != null) {
                ProfileActivity.this.showStatusButton.setTextColor(Theme.multAlpha(Theme.adaptHSV(i6, -0.02f, 0.15f), 1.4f));
            }
        }
    }

    class AnonymousClass26 extends AudioPlayerAlert.ClippingTextViewSwitcher {
        final Context val$context;

        AnonymousClass26(final Context context222, final Context context2222) {
            super(context2222);
            r3 = context2222;
        }

        @Override
        protected TextView createTextView() {
            TextView textView2 = new TextView(r3);
            textView2.setTextColor(ProfileActivity.this.getThemedColor(Theme.key_player_actionBarSubtitle));
            textView2.setTextSize(0, AndroidUtilities.dp(14.0f));
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(3);
            return textView2;
        }
    }

    class AnonymousClass27 extends ProfileStoriesView {
        final Context val$context;

        AnonymousClass27(final Context context2222, int i6, long j4, boolean z2, View view2, AvatarImageView avatarImageView, Theme.ResourcesProvider resourcesProvider2, final Context context22222) {
            super(context22222, i6, j4, z2, view2, avatarImageView, resourcesProvider2);
            r20 = context22222;
        }

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
                        ProfileActivity.this.getOrCreateStoryViewer().open(r20, ProfileActivity.this.chatInfo.stories, placeProvider);
                        return;
                    }
                }
                ProfileActivity.this.getOrCreateStoryViewer().open(r20, ProfileActivity.this.userInfo.stories, placeProvider);
                return;
            }
            ProfileActivity.this.getOrCreateStoryViewer().open(r20, dialogId, placeProvider);
        }

        @Override
        public void lambda$new$4() {
            ProfileActivity.this.openAvatar();
        }
    }

    public void lambda$createView$20(View view) {
        if (this.writeButton.getTag() != null) {
            return;
        }
        onWriteButtonClick();
    }

    class AnonymousClass28 extends RecyclerView.OnScrollListener {
        AnonymousClass28() {
        }

        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            if (i7 == 1) {
                AndroidUtilities.hideKeyboard(ProfileActivity.this.getParentActivity().getCurrentFocus());
            }
            if (ProfileActivity.this.openingAvatar && i7 != 2) {
                ProfileActivity.this.openingAvatar = false;
            }
            if (ProfileActivity.this.searchItem != null) {
                ProfileActivity.this.scrolling = i7 != 0;
                ProfileActivity.this.searchItem.setEnabled((ProfileActivity.this.scrolling || ProfileActivity.this.isPulledDown) ? false : true);
            }
            ProfileActivity.this.sharedMediaLayout.scrollingByUser = ProfileActivity.this.listView.scrollingByUser;
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            if (ProfileActivity.this.fwdRestrictedHint != null) {
                ProfileActivity.this.fwdRestrictedHint.hide();
            }
            ProfileActivity.this.checkListViewScroll();
            if (ProfileActivity.this.participantsMap != null && !ProfileActivity.this.usersEndReached && ProfileActivity.this.layoutManager.findLastVisibleItemPosition() > ProfileActivity.this.membersEndRow - 8) {
                ProfileActivity.this.getChannelParticipants(false);
            }
            ProfileActivity.this.sharedMediaLayout.setPinnedToTop(ProfileActivity.this.sharedMediaLayout.getY() <= 0.0f);
            ProfileActivity.this.updateBottomButtonY();
        }
    }

    public void lambda$createView$21(ValueAnimator valueAnimator) {
        setAvatarExpandProgress(valueAnimator.getAnimatedFraction());
    }

    class AnonymousClass29 extends AnimatorListenerAdapter {
        @Override
        public void onAnimationStart(Animator animator) {
        }

        AnonymousClass29() {
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
    }

    class AnonymousClass30 extends PinchToZoomHelper {
        AnonymousClass30(ViewGroup viewGroup, ViewGroup frameLayout42) {
            super(viewGroup, frameLayout42);
        }

        @Override
        public void invalidateViews() {
            super.invalidateViews();
            ProfileActivity.this.fragmentView.invalidate();
            for (int i8 = 0; i8 < ProfileActivity.this.avatarsViewPager.getChildCount(); i8++) {
                ProfileActivity.this.avatarsViewPager.getChildAt(i8).invalidate();
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
        public boolean zoomEnabled(View view2, ImageReceiver imageReceiver2) {
            return super.zoomEnabled(view2, imageReceiver2) && ProfileActivity.this.listView.getScrollState() != 1;
        }
    }

    class AnonymousClass31 implements PinchToZoomHelper.Callback {
        @Override
        public TextureView getCurrentTextureView() {
            return PinchToZoomHelper.Callback.CC.$default$getCurrentTextureView(this);
        }

        @Override
        public void onZoomFinished(MessageObject messageObject) {
            PinchToZoomHelper.Callback.CC.$default$onZoomFinished(this, messageObject);
        }

        AnonymousClass31() {
        }

        @Override
        public void onZoomStarted(MessageObject messageObject) {
            ProfileActivity.this.listView.cancelClickRunnables(true);
            if (ProfileActivity.this.sharedMediaLayout != null && ProfileActivity.this.sharedMediaLayout.getCurrentListView() != null) {
                ProfileActivity.this.sharedMediaLayout.getCurrentListView().cancelClickRunnables(true);
            }
            TopView topView2 = ProfileActivity.this.topView;
            ProfileActivity profileActivity = ProfileActivity.this;
            topView2.setBackgroundColor(ColorUtils.blendARGB(profileActivity.getAverageColor(profileActivity.pinchToZoomHelper.getPhotoImage()), ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite), 0.1f));
        }
    }

    class AnonymousClass32 extends View {
        AnonymousClass32(final Context context22222) {
            super(context22222);
        }

        @Override
        public void setAlpha(float f4) {
            super.setAlpha(f4);
            View view2 = ProfileActivity.this.fragmentView;
            if (view2 != null) {
                view2.invalidate();
            }
        }
    }

    public void lambda$createView$22(View view) {
        finishPreviewFragment();
    }

    public void lambda$createView$26(int i, View view) {
        int i2;
        Bulletin show;
        if (i == 0 && !this.sharedMediaLayout.isActionModeShown()) {
            if (!getMessagesController().storiesEnabled()) {
                showDialog(new PremiumFeatureBottomSheet(this, 14, true));
                return;
            } else {
                getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                StoryRecorder.getInstance(getParentActivity(), getCurrentAccount()).closeToWhenSent(new StoryRecorder.ClosingViewProvider() {
                    AnonymousClass33() {
                    }

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
        final long clientUserId = getUserConfig().getClientUserId();
        Runnable runnable = this.applyBulletin;
        if (runnable != null) {
            runnable.run();
            this.applyBulletin = null;
        }
        Bulletin.hideVisible();
        boolean z = this.sharedMediaLayout.getClosestTab() == 9;
        final ArrayList arrayList = new ArrayList();
        SparseArray<MessageObject> actionModeSelected = this.sharedMediaLayout.getActionModeSelected();
        if (actionModeSelected != null) {
            int i3 = 0;
            for (int i4 = 0; i4 < actionModeSelected.size(); i4++) {
                TL_stories$StoryItem tL_stories$StoryItem = actionModeSelected.valueAt(i4).storyItem;
                if (tL_stories$StoryItem != null) {
                    arrayList.add(tL_stories$StoryItem);
                    i3++;
                }
            }
            i2 = i3;
        } else {
            i2 = 0;
        }
        this.sharedMediaLayout.closeActionMode(false);
        if (z) {
            this.sharedMediaLayout.scrollToPage(8);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        final boolean[] zArr = new boolean[arrayList.size()];
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            TL_stories$StoryItem tL_stories$StoryItem2 = (TL_stories$StoryItem) arrayList.get(i5);
            zArr[i5] = tL_stories$StoryItem2.pinned;
            tL_stories$StoryItem2.pinned = z;
        }
        getMessagesController().getStoriesController().updateStoriesInLists(clientUserId, arrayList);
        final boolean[] zArr2 = {false};
        final boolean z2 = z;
        this.applyBulletin = new Runnable() {
            @Override
            public final void run() {
                ProfileActivity.this.lambda$createView$23(clientUserId, arrayList, z2);
            }
        };
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                ProfileActivity.this.lambda$createView$24(zArr2, arrayList, zArr, clientUserId);
            }
        };
        if (z) {
            show = BulletinFactory.of(this).createSimpleBulletin(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i2, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.Undo), runnable2).show();
        } else {
            show = BulletinFactory.of(this).createSimpleBulletin(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i2, new Object[0]), LocaleController.getString(R.string.Undo), 5000, runnable2).show();
        }
        show.setOnHideListener(new Runnable() {
            @Override
            public final void run() {
                ProfileActivity.this.lambda$createView$25(zArr2);
            }
        });
    }

    public class AnonymousClass33 implements StoryRecorder.ClosingViewProvider {
        AnonymousClass33() {
        }

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
    }

    public void lambda$createView$23(long j, ArrayList arrayList, boolean z) {
        getMessagesController().getStoriesController().updateStoriesPinned(j, arrayList, z, null);
    }

    public void lambda$createView$24(boolean[] zArr, ArrayList arrayList, boolean[] zArr2, long j) {
        zArr[0] = true;
        AndroidUtilities.cancelRunOnUIThread(this.applyBulletin);
        for (int i = 0; i < arrayList.size(); i++) {
            ((TL_stories$StoryItem) arrayList.get(i)).pinned = zArr2[i];
        }
        getMessagesController().getStoriesController().updateStoriesInLists(j, arrayList);
    }

    public void lambda$createView$25(boolean[] zArr) {
        Runnable runnable;
        if (!zArr[0] && (runnable = this.applyBulletin) != null) {
            runnable.run();
        }
        this.applyBulletin = null;
    }

    public void updateBottomButtonY() {
        FrameLayout frameLayout = this.bottomButtonsContainer;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setTranslationY(this.sharedMediaLayout.isAttachedToWindow() ? Math.max(0.0f, AndroidUtilities.dp(184.0f) - (this.listView.getMeasuredHeight() - this.sharedMediaLayout.getY())) : AndroidUtilities.dp(72.0f));
        Bulletin visibleBulletin = Bulletin.getVisibleBulletin();
        if (visibleBulletin != null) {
            visibleBulletin.updatePosition();
        }
    }

    private void checkCanSendStoryForPosting() {
        if (ChatObject.isBoostSupported(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chatId)))) {
            StoriesController storiesController = getMessagesController().getStoriesController();
            this.waitCanSendStoryRequest = true;
            storiesController.canSendStoryFor(getDialogId(), new com.google.android.exoplayer2.util.Consumer() {
                @Override
                public final void accept(Object obj) {
                    ProfileActivity.this.lambda$checkCanSendStoryForPosting$27((Boolean) obj);
                }
            }, false, this.resourcesProvider);
        }
    }

    public void lambda$checkCanSendStoryForPosting$27(Boolean bool) {
        this.waitCanSendStoryRequest = false;
        this.showBoostsAlert = !bool.booleanValue();
        hideFloatingButton(false);
    }

    public void updateAvatarRoundRadius() {
        this.avatarImage.setRoundRadius((int) AndroidUtilities.lerp(getSmallAvatarRoundRadius(), 0.0f, this.currentExpandAnimatorValue));
    }

    private void createFloatingActionButton(Context context) {
        if (getMessagesController().storiesEnabled() && getDialogId() <= 0) {
            final TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.chatId));
            if (ChatObject.isBoostSupported(chat) && getMessagesController().getStoriesController().canPostStories(getDialogId())) {
                checkCanSendStoryForPosting();
                final long dialogId = getDialogId();
                FrameLayout frameLayout = new FrameLayout(context);
                this.floatingButtonContainer = frameLayout;
                frameLayout.setVisibility(0);
                NestedFrameLayout nestedFrameLayout = this.contentView;
                FrameLayout frameLayout2 = this.floatingButtonContainer;
                int i = Build.VERSION.SDK_INT;
                int i2 = i >= 21 ? 56 : 60;
                float f = i >= 21 ? 56 : 60;
                boolean z = LocaleController.isRTL;
                nestedFrameLayout.addView(frameLayout2, LayoutHelper.createFrame(i2, f, (z ? 3 : 5) | 80, z ? 14.0f : 0.0f, 0.0f, z ? 0.0f : 14.0f, 14.0f));
                this.floatingButtonContainer.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        ProfileActivity.this.lambda$createFloatingActionButton$31(dialogId, chat, view);
                    }
                });
                RLottieImageView rLottieImageView = new RLottieImageView(context);
                this.floatingButton = rLottieImageView;
                rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
                this.floatingButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chats_actionIcon), PorterDuff.Mode.MULTIPLY));
                if (i >= 21) {
                    StateListAnimator stateListAnimator = new StateListAnimator();
                    int[] iArr = {android.R.attr.state_pressed};
                    FrameLayout frameLayout3 = this.floatingButtonContainer;
                    Property property = View.TRANSLATION_Z;
                    stateListAnimator.addState(iArr, ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f)).setDuration(200L));
                    stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this.floatingButtonContainer, (Property<FrameLayout, Float>) property, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f)).setDuration(200L));
                    this.floatingButtonContainer.setStateListAnimator(stateListAnimator);
                    this.floatingButtonContainer.setOutlineProvider(new ViewOutlineProvider(this) {
                        AnonymousClass35(ProfileActivity this) {
                        }

                        @Override
                        @SuppressLint({"NewApi"})
                        public void getOutline(View view, Outline outline) {
                            outline.setOval(0, 0, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                        }
                    });
                }
                this.floatingButtonContainer.addView(this.floatingButton, LayoutHelper.createFrame(-1, -1.0f));
                this.floatingButton.setAnimation(R.raw.write_contacts_fab_icon_camera, 56, 56);
                this.floatingButtonContainer.setContentDescription(LocaleController.getString("AccDescrCaptureStory", R.string.AccDescrCaptureStory));
                updateFloatingButtonColor();
            }
        }
    }

    public void lambda$createFloatingActionButton$31(final long j, TLRPC$Chat tLRPC$Chat, View view) {
        if (this.showBoostsAlert) {
            if (this.loadingBoostsStats) {
                return;
            }
            final MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            this.loadingBoostsStats = true;
            messagesController.getBoostsController().getBoostsStats(j, new com.google.android.exoplayer2.util.Consumer() {
                @Override
                public final void accept(Object obj) {
                    ProfileActivity.this.lambda$createFloatingActionButton$30(messagesController, j, (TL_stories$TL_premium_boostsStatus) obj);
                }
            });
            return;
        }
        StoryRecorder.getInstance(getParentActivity(), this.currentAccount).selectedPeerId(getDialogId()).canChangePeer(false).closeToWhenSent(new StoryRecorder.ClosingViewProvider() {
            final TLRPC$Chat val$currentChat;

            AnonymousClass34(TLRPC$Chat tLRPC$Chat2) {
                r2 = tLRPC$Chat2;
            }

            @Override
            public void preLayout(long j2, Runnable runnable) {
                ProfileActivity.this.avatarImage.setHasStories(ProfileActivity.this.needInsetForStories());
                if (j2 == ProfileActivity.this.getDialogId()) {
                    ProfileActivity.this.collapseAvatarInstant();
                }
                AndroidUtilities.runOnUIThread(runnable, 30L);
            }

            @Override
            public StoryRecorder.SourceView getView(long j2) {
                if (j2 != ProfileActivity.this.getDialogId()) {
                    return null;
                }
                ProfileActivity.this.updateAvatarRoundRadius();
                return StoryRecorder.SourceView.fromAvatarImage(ProfileActivity.this.avatarImage, ChatObject.isForum(r2));
            }
        }).open(StoryRecorder.SourceView.fromFloatingButton(this.floatingButtonContainer), true);
    }

    public void lambda$createFloatingActionButton$30(MessagesController messagesController, final long j, final TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus) {
        this.loadingBoostsStats = false;
        if (tL_stories$TL_premium_boostsStatus == null) {
            return;
        }
        messagesController.getBoostsController().userCanBoostChannel(j, tL_stories$TL_premium_boostsStatus, new com.google.android.exoplayer2.util.Consumer() {
            @Override
            public final void accept(Object obj) {
                ProfileActivity.this.lambda$createFloatingActionButton$29(j, tL_stories$TL_premium_boostsStatus, (ChannelBoostsController.CanApplyBoost) obj);
            }
        });
    }

    public void lambda$createFloatingActionButton$29(long j, TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost == null) {
            return;
        }
        LimitReachedBottomSheet.openBoostsForPostingStories(LaunchActivity.getLastFragment(), j, canApplyBoost, tL_stories$TL_premium_boostsStatus, new Runnable() {
            @Override
            public final void run() {
                ProfileActivity.this.lambda$createFloatingActionButton$28();
            }
        });
    }

    public void lambda$createFloatingActionButton$28() {
        presentFragment(StatisticActivity.create(getMessagesController().getChat(Long.valueOf(this.chatId))));
    }

    public class AnonymousClass34 implements StoryRecorder.ClosingViewProvider {
        final TLRPC$Chat val$currentChat;

        AnonymousClass34(TLRPC$Chat tLRPC$Chat2) {
            r2 = tLRPC$Chat2;
        }

        @Override
        public void preLayout(long j2, Runnable runnable) {
            ProfileActivity.this.avatarImage.setHasStories(ProfileActivity.this.needInsetForStories());
            if (j2 == ProfileActivity.this.getDialogId()) {
                ProfileActivity.this.collapseAvatarInstant();
            }
            AndroidUtilities.runOnUIThread(runnable, 30L);
        }

        @Override
        public StoryRecorder.SourceView getView(long j2) {
            if (j2 != ProfileActivity.this.getDialogId()) {
                return null;
            }
            ProfileActivity.this.updateAvatarRoundRadius();
            return StoryRecorder.SourceView.fromAvatarImage(ProfileActivity.this.avatarImage, ChatObject.isForum(r2));
        }
    }

    public class AnonymousClass35 extends ViewOutlineProvider {
        AnonymousClass35(ProfileActivity this) {
        }

        @Override
        @SuppressLint({"NewApi"})
        public void getOutline(View view, Outline outline) {
            outline.setOval(0, 0, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
        }
    }

    public void collapseAvatarInstant() {
        if (!this.allowPullingDown || this.currentExpandAnimatorValue <= 0.0f) {
            return;
        }
        this.layoutManager.scrollToPositionWithOffset(0, AndroidUtilities.dp(88.0f) - this.listView.getPaddingTop());
        this.listView.post(new Runnable() {
            @Override
            public final void run() {
                ProfileActivity.this.lambda$collapseAvatarInstant$32();
            }
        });
    }

    public void lambda$collapseAvatarInstant$32() {
        needLayout(true);
        if (this.expandAnimator.isRunning()) {
            this.expandAnimator.cancel();
        }
        setAvatarExpandProgress(1.0f);
    }

    private void updateFloatingButtonColor() {
        if (getParentActivity() == null || this.floatingButtonContainer == null) {
            return;
        }
        Drawable createSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(56.0f), applyPeerColor(Theme.getColor(Theme.key_chats_actionBackground), false), applyPeerColor(Theme.getColor(Theme.key_chats_actionPressedBackground), false));
        if (Build.VERSION.SDK_INT < 21) {
            Drawable mutate = ContextCompat.getDrawable(getParentActivity(), R.drawable.floating_shadow).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable = new CombinedDrawable(mutate, createSimpleSelectorCircleDrawable, 0, 0);
            combinedDrawable.setIconSize(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
            createSimpleSelectorCircleDrawable = combinedDrawable;
        }
        this.floatingButtonContainer.setBackground(createSimpleSelectorCircleDrawable);
    }

    public void hideFloatingButton(boolean z) {
        if (this.floatingHidden == z || this.floatingButtonContainer == null || this.waitCanSendStoryRequest) {
            return;
        }
        this.floatingHidden = z;
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = new float[2];
        fArr[0] = this.floatingButtonHideProgress;
        fArr[1] = this.floatingHidden ? 1.0f : 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ProfileActivity.this.lambda$hideFloatingButton$33(valueAnimator);
            }
        });
        animatorSet.playTogether(ofFloat);
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(this.floatingInterpolator);
        this.floatingButtonContainer.setClickable(!z);
        animatorSet.start();
    }

    public void lambda$hideFloatingButton$33(ValueAnimator valueAnimator) {
        this.floatingButtonHideProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        updateFloatingButtonOffset();
    }

    private void updateFloatingButtonOffset() {
        FrameLayout frameLayout = this.floatingButtonContainer;
        if (frameLayout != null) {
            frameLayout.setTranslationY(AndroidUtilities.dp(100.0f) * this.floatingButtonHideProgress);
        }
    }

    public boolean expandAvatar() {
        RecyclerView.ViewHolder findContainingViewHolder;
        Integer num;
        if (!AndroidUtilities.isTablet() && !this.isInLandscapeMode && this.avatarImage.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            this.openingAvatar = true;
            this.allowPullingDown = true;
            View view = null;
            int i = 0;
            while (true) {
                if (i >= this.listView.getChildCount()) {
                    break;
                }
                RecyclerListView recyclerListView = this.listView;
                if (recyclerListView.getChildAdapterPosition(recyclerListView.getChildAt(i)) == 0) {
                    view = this.listView.getChildAt(i);
                    break;
                }
                i++;
            }
            if (view != null && (findContainingViewHolder = this.listView.findContainingViewHolder(view)) != null && (num = this.positionToOffset.get(Integer.valueOf(findContainingViewHolder.getAdapterPosition()))) != null) {
                this.listView.smoothScrollBy(0, -(num.intValue() + ((this.listView.getPaddingTop() - view.getTop()) - this.actionBar.getMeasuredHeight())), CubicBezierInterpolator.EASE_OUT_QUINT);
                return true;
            }
        }
        return false;
    }

    private void setAvatarExpandProgress(float r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.setAvatarExpandProgress(float):void");
    }

    private int getSmallAvatarRoundRadius() {
        if (this.chatId == 0 || !ChatObject.isForum(getMessagesController().getChat(Long.valueOf(this.chatId)))) {
            return AndroidUtilities.dp(21.0f);
        }
        return AndroidUtilities.dp(needInsetForStories() ? 11.0f : 16.0f);
    }

    private void updateTtlIcon() {
        TLRPC$UserFull tLRPC$UserFull;
        if (this.ttlIconView == null) {
            return;
        }
        boolean z = false;
        if (this.currentEncryptedChat == null && (((tLRPC$UserFull = this.userInfo) != null && tLRPC$UserFull.ttl_period > 0) || (this.chatInfo != null && ChatObject.canUserDoAdminAction(this.currentChat, 13) && this.chatInfo.ttl_period > 0))) {
            z = true;
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.ttlIconView, z, 0.8f, this.fragmentOpened);
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
        SimpleTextView[] simpleTextViewArr = this.nameTextView;
        if (simpleTextViewArr[1] == null) {
            return;
        }
        if (simpleTextViewArr[1].getRightDrawable() == null) {
            rect.set(this.nameTextView[1].getWidth() - 1, (this.nameTextView[1].getHeight() / 2) - 1, this.nameTextView[1].getWidth() + 1, (this.nameTextView[1].getHeight() / 2) + 1);
            return;
        }
        rect.set(this.nameTextView[1].getRightDrawable().getBounds());
        rect.offset((int) (rect.centerX() * (this.nameTextView[1].getScaleX() - 1.0f)), 0);
        rect.offset((int) this.nameTextView[1].getX(), (int) this.nameTextView[1].getY());
    }

    public void goToForum() {
        if (getParentLayout() != null && getParentLayout().getFragmentStack() != null) {
            int i = 0;
            while (i < getParentLayout().getFragmentStack().size()) {
                BaseFragment baseFragment = getParentLayout().getFragmentStack().get(i);
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
        SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[] selectAnimatedEmojiDialogWindowArr = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[1];
        Rect rect = AndroidUtilities.rectTmp2;
        getEmojiStatusLocation(rect);
        int i = this.nameTextView[1].getScaleX() < 1.5f ? 16 : 32;
        int dp = (-(this.avatarContainer2.getHeight() - rect.centerY())) - AndroidUtilities.dp(i);
        int min = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
        int centerX = rect.centerX();
        int clamp = MathUtils.clamp(centerX - (min / 2), 0, AndroidUtilities.displaySize.x - min);
        int i2 = centerX - clamp;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[] swapAnimatedEmojiDrawableArr = this.emojiStatusDrawable;
        if (swapAnimatedEmojiDrawableArr[1] != null) {
            boolean z = swapAnimatedEmojiDrawableArr[1].getDrawable() instanceof AnimatedEmojiDrawable;
        }
        AnonymousClass36 anonymousClass36 = new SelectAnimatedEmojiDialog(this, getContext(), true, Integer.valueOf(Math.max(0, i2)), this.currentChat == null ? 0 : 9, true, this.resourcesProvider, i) {
            final SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[] val$popup;

            AnonymousClass36(BaseFragment this, Context context, boolean z2, Integer num, int i3, boolean z3, Theme.ResourcesProvider resourcesProvider, int i4, SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[] selectAnimatedEmojiDialogWindowArr2) {
                super(this, context, z2, num, i3, z3, resourcesProvider, i4);
                r20 = selectAnimatedEmojiDialogWindowArr2;
            }

            @Override
            protected void onEmojiSelected(View view, Long l, TLRPC$Document tLRPC$Document, Integer num) {
                TLRPC$TL_channels_updateEmojiStatus tLRPC$TL_channels_updateEmojiStatus;
                if (ProfileActivity.this.currentChat == null) {
                    TLRPC$TL_account_updateEmojiStatus tLRPC$TL_account_updateEmojiStatus = new TLRPC$TL_account_updateEmojiStatus();
                    if (l == null) {
                        tLRPC$TL_account_updateEmojiStatus.emoji_status = new TLRPC$TL_emojiStatusEmpty();
                    } else if (num != null) {
                        TLRPC$TL_emojiStatusUntil tLRPC$TL_emojiStatusUntil = new TLRPC$TL_emojiStatusUntil();
                        tLRPC$TL_account_updateEmojiStatus.emoji_status = tLRPC$TL_emojiStatusUntil;
                        tLRPC$TL_emojiStatusUntil.document_id = l.longValue();
                        ((TLRPC$TL_emojiStatusUntil) tLRPC$TL_account_updateEmojiStatus.emoji_status).until = num.intValue();
                    } else {
                        TLRPC$TL_emojiStatus tLRPC$TL_emojiStatus = new TLRPC$TL_emojiStatus();
                        tLRPC$TL_account_updateEmojiStatus.emoji_status = tLRPC$TL_emojiStatus;
                        tLRPC$TL_emojiStatus.document_id = l.longValue();
                    }
                    TLRPC$User user = MessagesController.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).getUser(Long.valueOf(UserConfig.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).getClientUserId()));
                    tLRPC$TL_channels_updateEmojiStatus = tLRPC$TL_account_updateEmojiStatus;
                    if (user != null) {
                        user.emoji_status = tLRPC$TL_account_updateEmojiStatus.emoji_status;
                        MessagesController.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).updateEmojiStatusUntilUpdate(user.id, user.emoji_status);
                        NotificationCenter.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userEmojiStatusUpdated, user);
                        tLRPC$TL_channels_updateEmojiStatus = tLRPC$TL_account_updateEmojiStatus;
                    }
                } else {
                    TLRPC$TL_channels_updateEmojiStatus tLRPC$TL_channels_updateEmojiStatus2 = new TLRPC$TL_channels_updateEmojiStatus();
                    tLRPC$TL_channels_updateEmojiStatus2.channel = MessagesController.getInputChannel(ProfileActivity.this.currentChat);
                    if (l == null) {
                        tLRPC$TL_channels_updateEmojiStatus2.emoji_status = new TLRPC$TL_emojiStatusEmpty();
                    } else if (num != null) {
                        TLRPC$TL_emojiStatusUntil tLRPC$TL_emojiStatusUntil2 = new TLRPC$TL_emojiStatusUntil();
                        tLRPC$TL_channels_updateEmojiStatus2.emoji_status = tLRPC$TL_emojiStatusUntil2;
                        tLRPC$TL_emojiStatusUntil2.document_id = l.longValue();
                        ((TLRPC$TL_emojiStatusUntil) tLRPC$TL_channels_updateEmojiStatus2.emoji_status).until = num.intValue();
                    } else {
                        TLRPC$TL_emojiStatus tLRPC$TL_emojiStatus2 = new TLRPC$TL_emojiStatus();
                        tLRPC$TL_channels_updateEmojiStatus2.emoji_status = tLRPC$TL_emojiStatus2;
                        tLRPC$TL_emojiStatus2.document_id = l.longValue();
                    }
                    tLRPC$TL_channels_updateEmojiStatus = tLRPC$TL_channels_updateEmojiStatus2;
                    if (ProfileActivity.this.currentChat != null) {
                        ProfileActivity.this.currentChat.emoji_status = tLRPC$TL_channels_updateEmojiStatus2.emoji_status;
                        MessagesController.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).updateEmojiStatusUntilUpdate(-ProfileActivity.this.currentChat.id, ProfileActivity.this.currentChat.emoji_status);
                        NotificationCenter.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_EMOJI_STATUS));
                        tLRPC$TL_channels_updateEmojiStatus = tLRPC$TL_channels_updateEmojiStatus2;
                    }
                }
                for (int i3 = 0; i3 < 2; i3++) {
                    if (ProfileActivity.this.emojiStatusDrawable[i3] != null) {
                        if (l == null && ProfileActivity.this.currentChat == null) {
                            ProfileActivity.this.emojiStatusDrawable[i3].set(ProfileActivity.this.getPremiumCrossfadeDrawable(i3), true);
                        } else if (l != null) {
                            ProfileActivity.this.emojiStatusDrawable[i3].set(l.longValue(), true);
                        } else {
                            ProfileActivity.this.emojiStatusDrawable[i3].set((Drawable) null, true);
                        }
                    }
                }
                if (l != null) {
                    ProfileActivity.this.animatedStatusView.animateChange(ReactionsLayoutInBubble.VisibleReaction.fromCustomEmoji(l));
                }
                ProfileActivity.this.updateEmojiStatusDrawableColor();
                ProfileActivity.this.updateEmojiStatusEffectPosition();
                ConnectionsManager.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).sendRequest(tLRPC$TL_channels_updateEmojiStatus, null);
                if (r20[0] != null) {
                    ProfileActivity.this.selectAnimatedEmojiDialog = null;
                    r20[0].dismiss();
                }
            }
        };
        TLRPC$User user = getMessagesController().getUser(Long.valueOf(this.userId));
        if (user != null) {
            anonymousClass36.setExpireDateHint(DialogObject.getEmojiStatusUntil(user.emoji_status));
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[] swapAnimatedEmojiDrawableArr2 = this.emojiStatusDrawable;
        anonymousClass36.setSelected((swapAnimatedEmojiDrawableArr2[1] == null || !(swapAnimatedEmojiDrawableArr2[1].getDrawable() instanceof AnimatedEmojiDrawable)) ? null : Long.valueOf(((AnimatedEmojiDrawable) this.emojiStatusDrawable[1].getDrawable()).getDocumentId()));
        anonymousClass36.setSaveState(3);
        anonymousClass36.setScrimDrawable(this.emojiStatusDrawable[1], this.nameTextView[1]);
        AnonymousClass37 anonymousClass37 = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow(anonymousClass36, -2, -2) {
            AnonymousClass37(View anonymousClass362, int i3, int i4) {
                super(anonymousClass362, i3, i4);
            }

            @Override
            public void dismiss() {
                super.dismiss();
                ProfileActivity.this.selectAnimatedEmojiDialog = null;
            }
        };
        this.selectAnimatedEmojiDialog = anonymousClass37;
        selectAnimatedEmojiDialogWindowArr2[0] = anonymousClass37;
        int[] iArr = new int[2];
        SimpleTextView[] simpleTextViewArr = this.nameTextView;
        if (simpleTextViewArr[1] != null) {
            simpleTextViewArr[1].getLocationOnScreen(iArr);
        }
        selectAnimatedEmojiDialogWindowArr2[0].showAsDropDown(this.fragmentView, clamp, dp, 51);
        selectAnimatedEmojiDialogWindowArr2[0].dimBehind();
    }

    public class AnonymousClass36 extends SelectAnimatedEmojiDialog {
        final SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[] val$popup;

        AnonymousClass36(ProfileActivity this, Context context, boolean z2, Integer num, int i3, boolean z3, Theme.ResourcesProvider resourcesProvider, int i4, SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[] selectAnimatedEmojiDialogWindowArr2) {
            super(this, context, z2, num, i3, z3, resourcesProvider, i4);
            r20 = selectAnimatedEmojiDialogWindowArr2;
        }

        @Override
        protected void onEmojiSelected(View view, Long l, TLRPC$Document tLRPC$Document, Integer num) {
            TLRPC$TL_channels_updateEmojiStatus tLRPC$TL_channels_updateEmojiStatus;
            if (ProfileActivity.this.currentChat == null) {
                TLRPC$TL_account_updateEmojiStatus tLRPC$TL_account_updateEmojiStatus = new TLRPC$TL_account_updateEmojiStatus();
                if (l == null) {
                    tLRPC$TL_account_updateEmojiStatus.emoji_status = new TLRPC$TL_emojiStatusEmpty();
                } else if (num != null) {
                    TLRPC$TL_emojiStatusUntil tLRPC$TL_emojiStatusUntil = new TLRPC$TL_emojiStatusUntil();
                    tLRPC$TL_account_updateEmojiStatus.emoji_status = tLRPC$TL_emojiStatusUntil;
                    tLRPC$TL_emojiStatusUntil.document_id = l.longValue();
                    ((TLRPC$TL_emojiStatusUntil) tLRPC$TL_account_updateEmojiStatus.emoji_status).until = num.intValue();
                } else {
                    TLRPC$TL_emojiStatus tLRPC$TL_emojiStatus = new TLRPC$TL_emojiStatus();
                    tLRPC$TL_account_updateEmojiStatus.emoji_status = tLRPC$TL_emojiStatus;
                    tLRPC$TL_emojiStatus.document_id = l.longValue();
                }
                TLRPC$User user = MessagesController.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).getUser(Long.valueOf(UserConfig.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).getClientUserId()));
                tLRPC$TL_channels_updateEmojiStatus = tLRPC$TL_account_updateEmojiStatus;
                if (user != null) {
                    user.emoji_status = tLRPC$TL_account_updateEmojiStatus.emoji_status;
                    MessagesController.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).updateEmojiStatusUntilUpdate(user.id, user.emoji_status);
                    NotificationCenter.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userEmojiStatusUpdated, user);
                    tLRPC$TL_channels_updateEmojiStatus = tLRPC$TL_account_updateEmojiStatus;
                }
            } else {
                TLRPC$TL_channels_updateEmojiStatus tLRPC$TL_channels_updateEmojiStatus2 = new TLRPC$TL_channels_updateEmojiStatus();
                tLRPC$TL_channels_updateEmojiStatus2.channel = MessagesController.getInputChannel(ProfileActivity.this.currentChat);
                if (l == null) {
                    tLRPC$TL_channels_updateEmojiStatus2.emoji_status = new TLRPC$TL_emojiStatusEmpty();
                } else if (num != null) {
                    TLRPC$TL_emojiStatusUntil tLRPC$TL_emojiStatusUntil2 = new TLRPC$TL_emojiStatusUntil();
                    tLRPC$TL_channels_updateEmojiStatus2.emoji_status = tLRPC$TL_emojiStatusUntil2;
                    tLRPC$TL_emojiStatusUntil2.document_id = l.longValue();
                    ((TLRPC$TL_emojiStatusUntil) tLRPC$TL_channels_updateEmojiStatus2.emoji_status).until = num.intValue();
                } else {
                    TLRPC$TL_emojiStatus tLRPC$TL_emojiStatus2 = new TLRPC$TL_emojiStatus();
                    tLRPC$TL_channels_updateEmojiStatus2.emoji_status = tLRPC$TL_emojiStatus2;
                    tLRPC$TL_emojiStatus2.document_id = l.longValue();
                }
                tLRPC$TL_channels_updateEmojiStatus = tLRPC$TL_channels_updateEmojiStatus2;
                if (ProfileActivity.this.currentChat != null) {
                    ProfileActivity.this.currentChat.emoji_status = tLRPC$TL_channels_updateEmojiStatus2.emoji_status;
                    MessagesController.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).updateEmojiStatusUntilUpdate(-ProfileActivity.this.currentChat.id, ProfileActivity.this.currentChat.emoji_status);
                    NotificationCenter.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_EMOJI_STATUS));
                    tLRPC$TL_channels_updateEmojiStatus = tLRPC$TL_channels_updateEmojiStatus2;
                }
            }
            for (int i3 = 0; i3 < 2; i3++) {
                if (ProfileActivity.this.emojiStatusDrawable[i3] != null) {
                    if (l == null && ProfileActivity.this.currentChat == null) {
                        ProfileActivity.this.emojiStatusDrawable[i3].set(ProfileActivity.this.getPremiumCrossfadeDrawable(i3), true);
                    } else if (l != null) {
                        ProfileActivity.this.emojiStatusDrawable[i3].set(l.longValue(), true);
                    } else {
                        ProfileActivity.this.emojiStatusDrawable[i3].set((Drawable) null, true);
                    }
                }
            }
            if (l != null) {
                ProfileActivity.this.animatedStatusView.animateChange(ReactionsLayoutInBubble.VisibleReaction.fromCustomEmoji(l));
            }
            ProfileActivity.this.updateEmojiStatusDrawableColor();
            ProfileActivity.this.updateEmojiStatusEffectPosition();
            ConnectionsManager.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).sendRequest(tLRPC$TL_channels_updateEmojiStatus, null);
            if (r20[0] != null) {
                ProfileActivity.this.selectAnimatedEmojiDialog = null;
                r20[0].dismiss();
            }
        }
    }

    public class AnonymousClass37 extends SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow {
        AnonymousClass37(View anonymousClass362, int i3, int i4) {
            super(anonymousClass362, i3, i4);
        }

        @Override
        public void dismiss() {
            super.dismiss();
            ProfileActivity.this.selectAnimatedEmojiDialog = null;
        }
    }

    @Override
    public TLRPC$Chat getCurrentChat() {
        return this.currentChat;
    }

    public TLRPC$UserFull getUserInfo() {
        return this.userInfo;
    }

    @Override
    public boolean isFragmentOpened() {
        return this.isFragmentOpened;
    }

    public void openAvatar() {
        TLRPC$Chat chat;
        TLRPC$ChatPhoto tLRPC$ChatPhoto;
        ImageLocation imageLocation;
        if (this.listView.getScrollState() == 1) {
            return;
        }
        if (this.userId != 0) {
            TLRPC$User user = getMessagesController().getUser(Long.valueOf(this.userId));
            TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto = user.photo;
            if (tLRPC$UserProfilePhoto == null || tLRPC$UserProfilePhoto.photo_big == null) {
                return;
            }
            PhotoViewer.getInstance().setParentActivity(this);
            TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto2 = user.photo;
            int i = tLRPC$UserProfilePhoto2.dc_id;
            if (i != 0) {
                tLRPC$UserProfilePhoto2.photo_big.dc_id = i;
            }
            PhotoViewer.getInstance().openPhoto(user.photo.photo_big, this.provider);
            return;
        }
        if (this.chatId == 0 || (tLRPC$ChatPhoto = (chat = getMessagesController().getChat(Long.valueOf(this.chatId))).photo) == null || tLRPC$ChatPhoto.photo_big == null) {
            return;
        }
        PhotoViewer.getInstance().setParentActivity(this);
        TLRPC$ChatPhoto tLRPC$ChatPhoto2 = chat.photo;
        int i2 = tLRPC$ChatPhoto2.dc_id;
        if (i2 != 0) {
            tLRPC$ChatPhoto2.photo_big.dc_id = i2;
        }
        TLRPC$ChatFull tLRPC$ChatFull = this.chatInfo;
        if (tLRPC$ChatFull != null) {
            TLRPC$Photo tLRPC$Photo = tLRPC$ChatFull.chat_photo;
            if ((tLRPC$Photo instanceof TLRPC$TL_photo) && !tLRPC$Photo.video_sizes.isEmpty()) {
                imageLocation = ImageLocation.getForPhoto(this.chatInfo.chat_photo.video_sizes.get(0), this.chatInfo.chat_photo);
                PhotoViewer.getInstance().openPhotoWithVideo(chat.photo.photo_big, imageLocation, this.provider);
            }
        }
        imageLocation = null;
        PhotoViewer.getInstance().openPhotoWithVideo(chat.photo.photo_big, imageLocation, this.provider);
    }

    public void onWriteButtonClick() {
        INavigationLayout iNavigationLayout;
        if (this.userId != 0) {
            if (this.imageUpdater != null) {
                TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
                if (user == null) {
                    user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                }
                if (user == null) {
                    return;
                }
                ImageUpdater imageUpdater = this.imageUpdater;
                TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto = user.photo;
                imageUpdater.openMenu((tLRPC$UserProfilePhoto == null || tLRPC$UserProfilePhoto.photo_big == null || (tLRPC$UserProfilePhoto instanceof TLRPC$TL_userProfilePhotoEmpty)) ? false : true, new Runnable() {
                    @Override
                    public final void run() {
                        ProfileActivity.this.lambda$onWriteButtonClick$34();
                    }
                }, new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        ProfileActivity.this.lambda$onWriteButtonClick$35(dialogInterface);
                    }
                }, 0);
                this.cameraDrawable.setCurrentFrame(0);
                this.cameraDrawable.setCustomEndFrame(43);
                this.cellCameraDrawable.setCurrentFrame(0);
                this.cellCameraDrawable.setCustomEndFrame(43);
                this.writeButton.playAnimation();
                TextCell textCell = this.setAvatarCell;
                if (textCell != null) {
                    textCell.getImageView().playAnimation();
                    return;
                }
                return;
            }
            if (this.playProfileAnimation != 0 && (iNavigationLayout = this.parentLayout) != null && iNavigationLayout.getFragmentStack() != null && this.parentLayout.getFragmentStack().size() >= 2 && (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2) instanceof ChatActivity)) {
                lambda$onBackPressed$305();
                return;
            }
            TLRPC$User user2 = getMessagesController().getUser(Long.valueOf(this.userId));
            if (user2 == null || (user2 instanceof TLRPC$TL_userEmpty)) {
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
                if (AndroidUtilities.isTablet()) {
                    lambda$onBackPressed$305();
                    return;
                }
                return;
            }
            return;
        }
        openDiscussion();
    }

    public void lambda$onWriteButtonClick$34() {
        MessagesController.getInstance(this.currentAccount).deleteUserPhoto(null);
        this.cameraDrawable.setCurrentFrame(0);
        this.cellCameraDrawable.setCurrentFrame(0);
    }

    public void lambda$onWriteButtonClick$35(DialogInterface dialogInterface) {
        if (!this.imageUpdater.isUploadingImage()) {
            this.cameraDrawable.setCustomEndFrame(86);
            this.cellCameraDrawable.setCustomEndFrame(86);
            this.writeButton.playAnimation();
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

    public void openDiscussion() {
        TLRPC$ChatFull tLRPC$ChatFull = this.chatInfo;
        if (tLRPC$ChatFull == null || tLRPC$ChatFull.linked_chat_id == 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatInfo.linked_chat_id);
        if (getMessagesController().checkCanOpenChat(bundle, this)) {
            presentFragment(new ChatActivity(bundle));
        }
    }

    public boolean onMemberClick(TLRPC$ChatParticipant tLRPC$ChatParticipant, boolean z, View view) {
        return onMemberClick(tLRPC$ChatParticipant, z, false, view);
    }

    @Override
    public boolean onMemberClick(final TLRPC$ChatParticipant tLRPC$ChatParticipant, boolean z, boolean z2, View view) {
        boolean z3;
        TLRPC$ChannelParticipant tLRPC$ChannelParticipant;
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        String str;
        if (getParentActivity() == null) {
            return false;
        }
        if (z) {
            final TLRPC$User user = getMessagesController().getUser(Long.valueOf(tLRPC$ChatParticipant.user_id));
            if (user != null && tLRPC$ChatParticipant.user_id != getUserConfig().getClientUserId()) {
                this.selectedUser = tLRPC$ChatParticipant.user_id;
                if (ChatObject.isChannel(this.currentChat)) {
                    TLRPC$ChannelParticipant tLRPC$ChannelParticipant2 = ((TLRPC$TL_chatChannelParticipant) tLRPC$ChatParticipant).channelParticipant;
                    getMessagesController().getUser(Long.valueOf(tLRPC$ChatParticipant.user_id));
                    boolean canAddAdmins = ChatObject.canAddAdmins(this.currentChat);
                    if (canAddAdmins && ((tLRPC$ChannelParticipant2 instanceof TLRPC$TL_channelParticipantCreator) || ((tLRPC$ChannelParticipant2 instanceof TLRPC$TL_channelParticipantAdmin) && !tLRPC$ChannelParticipant2.can_edit))) {
                        canAddAdmins = false;
                    }
                    boolean z7 = ChatObject.canBlockUsers(this.currentChat) && (!((tLRPC$ChannelParticipant2 instanceof TLRPC$TL_channelParticipantAdmin) || (tLRPC$ChannelParticipant2 instanceof TLRPC$TL_channelParticipantCreator)) || tLRPC$ChannelParticipant2.can_edit);
                    z3 = tLRPC$ChannelParticipant2 instanceof TLRPC$TL_channelParticipantAdmin;
                    tLRPC$ChannelParticipant = tLRPC$ChannelParticipant2;
                    z4 = canAddAdmins;
                    z6 = z7;
                    z5 = this.currentChat.gigagroup ? false : z7;
                } else {
                    TLRPC$Chat tLRPC$Chat = this.currentChat;
                    boolean z8 = tLRPC$Chat.creator || ((tLRPC$ChatParticipant instanceof TLRPC$TL_chatParticipant) && (ChatObject.canBlockUsers(tLRPC$Chat) || tLRPC$ChatParticipant.inviter_id == getUserConfig().getClientUserId()));
                    z3 = tLRPC$ChatParticipant instanceof TLRPC$TL_chatParticipantAdmin;
                    tLRPC$ChannelParticipant = null;
                    z4 = this.currentChat.creator;
                    z5 = z4;
                    z6 = z8;
                }
                final boolean z9 = z3;
                r1 = z4 || z5 || z6;
                if (!z2 && r1) {
                    final TLRPC$ChannelParticipant tLRPC$ChannelParticipant3 = tLRPC$ChannelParticipant;
                    final Utilities.Callback callback = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            ProfileActivity.this.lambda$onMemberClick$36(tLRPC$ChannelParticipant3, user, tLRPC$ChatParticipant, z9, (Integer) obj);
                        }
                    };
                    ItemOptions scrimViewBackground = ItemOptions.makeOptions(this, view).setScrimViewBackground(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundWhite)));
                    int i2 = R.drawable.msg_admins;
                    if (z9) {
                        i = R.string.EditAdminRights;
                        str = "EditAdminRights";
                    } else {
                        i = R.string.SetAsAdmin;
                        str = "SetAsAdmin";
                    }
                    final TLRPC$ChannelParticipant tLRPC$ChannelParticipant4 = tLRPC$ChannelParticipant;
                    scrimViewBackground.addIf(z4, i2, LocaleController.getString(str, i), new Runnable() {
                        @Override
                        public final void run() {
                            ProfileActivity.lambda$onMemberClick$37(Utilities.Callback.this);
                        }
                    }).addIf(z5, R.drawable.msg_permissions, LocaleController.getString("ChangePermissions", R.string.ChangePermissions), new Runnable() {
                        @Override
                        public final void run() {
                            ProfileActivity.this.lambda$onMemberClick$39(tLRPC$ChannelParticipant4, tLRPC$ChatParticipant, user, callback);
                        }
                    }).addIf(z6, R.drawable.msg_remove, (CharSequence) LocaleController.getString("KickFromGroup", R.string.KickFromGroup), true, new Runnable() {
                        @Override
                        public final void run() {
                            ProfileActivity.this.lambda$onMemberClick$40(tLRPC$ChatParticipant);
                        }
                    }).setMinWidth(190).show();
                }
            }
            return r1;
        }
        if (tLRPC$ChatParticipant.user_id == getUserConfig().getClientUserId()) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", tLRPC$ChatParticipant.user_id);
        bundle.putBoolean("preload_messages", true);
        presentFragment(new ProfileActivity(bundle));
        return true;
    }

    public void lambda$onMemberClick$36(TLRPC$ChannelParticipant tLRPC$ChannelParticipant, TLRPC$User tLRPC$User, TLRPC$ChatParticipant tLRPC$ChatParticipant, boolean z, Integer num) {
        if (tLRPC$ChannelParticipant != null) {
            openRightsEdit(num.intValue(), tLRPC$User, tLRPC$ChatParticipant, tLRPC$ChannelParticipant.admin_rights, tLRPC$ChannelParticipant.banned_rights, tLRPC$ChannelParticipant.rank, z);
        } else {
            openRightsEdit(num.intValue(), tLRPC$User, tLRPC$ChatParticipant, null, null, "", z);
        }
    }

    public static void lambda$onMemberClick$37(Utilities.Callback callback) {
        callback.run(0);
    }

    public void lambda$onMemberClick$39(TLRPC$ChannelParticipant tLRPC$ChannelParticipant, TLRPC$ChatParticipant tLRPC$ChatParticipant, TLRPC$User tLRPC$User, final Utilities.Callback callback) {
        if ((tLRPC$ChannelParticipant instanceof TLRPC$TL_channelParticipantAdmin) || (tLRPC$ChatParticipant instanceof TLRPC$TL_chatParticipantAdmin)) {
            showDialog(new AlertDialog.Builder(getParentActivity(), this.resourcesProvider).setTitle(LocaleController.getString("AppName", R.string.AppName)).setMessage(LocaleController.formatString("AdminWillBeRemoved", R.string.AdminWillBeRemoved, ContactsController.formatName(tLRPC$User.first_name, tLRPC$User.last_name))).setPositiveButton(LocaleController.getString("OK", R.string.OK), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ProfileActivity.lambda$onMemberClick$38(Utilities.Callback.this, dialogInterface, i);
                }
            }).setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null).create());
        } else {
            callback.run(1);
        }
    }

    public static void lambda$onMemberClick$38(Utilities.Callback callback, DialogInterface dialogInterface, int i) {
        callback.run(1);
    }

    public void lambda$onMemberClick$40(TLRPC$ChatParticipant tLRPC$ChatParticipant) {
        kickUser(this.selectedUser, tLRPC$ChatParticipant);
    }

    public class AnonymousClass38 extends ChatRightsEditActivity {
        final boolean[] val$needShowBulletin;
        final TLRPC$User val$user;

        AnonymousClass38(long j, long j2, TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights, TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights, TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights2, String str, int i, boolean z, boolean z2, String str2, boolean[] zArr, TLRPC$User tLRPC$User) {
            super(j, j2, tLRPC$TL_chatAdminRights, tLRPC$TL_chatBannedRights, tLRPC$TL_chatBannedRights2, str, i, z, z2, str2);
            r28 = zArr;
            r29 = tLRPC$User;
        }

        @Override
        public void onTransitionAnimationEnd(boolean z, boolean z2) {
            if (!z && z2 && r28[0] && BulletinFactory.canShowBulletin(ProfileActivity.this)) {
                BulletinFactory.createPromoteToAdminBulletin(ProfileActivity.this, r29.first_name).show();
            }
        }
    }

    private void openRightsEdit(int i, TLRPC$User tLRPC$User, TLRPC$ChatParticipant tLRPC$ChatParticipant, TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights, TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights, String str, boolean z) {
        boolean[] zArr = new boolean[1];
        AnonymousClass38 anonymousClass38 = new ChatRightsEditActivity(tLRPC$User.id, this.chatId, tLRPC$TL_chatAdminRights, this.currentChat.default_banned_rights, tLRPC$TL_chatBannedRights, str, i, true, false, null) {
            final boolean[] val$needShowBulletin;
            final TLRPC$User val$user;

            AnonymousClass38(long j, long j2, TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights2, TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights2, TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights3, String str2, int i2, boolean z2, boolean z22, String str22, boolean[] zArr2, TLRPC$User tLRPC$User2) {
                super(j, j2, tLRPC$TL_chatAdminRights2, tLRPC$TL_chatBannedRights2, tLRPC$TL_chatBannedRights3, str2, i2, z2, z22, str22);
                r28 = zArr2;
                r29 = tLRPC$User2;
            }

            @Override
            public void onTransitionAnimationEnd(boolean z2, boolean z22) {
                if (!z2 && z22 && r28[0] && BulletinFactory.canShowBulletin(ProfileActivity.this)) {
                    BulletinFactory.createPromoteToAdminBulletin(ProfileActivity.this, r29.first_name).show();
                }
            }
        };
        anonymousClass38.setDelegate(new ChatRightsEditActivity.ChatRightsEditActivityDelegate() {
            final int val$action;
            final boolean val$editingAdmin;
            final boolean[] val$needShowBulletin;
            final TLRPC$ChatParticipant val$participant;

            AnonymousClass39(int i2, TLRPC$ChatParticipant tLRPC$ChatParticipant2, boolean z2, boolean[] zArr2) {
                r2 = i2;
                r3 = tLRPC$ChatParticipant2;
                r4 = z2;
                r5 = zArr2;
            }

            @Override
            public void didSetRights(int i2, TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights2, TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights2, String str2) {
                boolean z2;
                TLRPC$ChatParticipant tLRPC$TL_chatParticipant;
                int i3 = r2;
                int i4 = 0;
                if (i3 != 0) {
                    if (i3 == 1 && i2 == 0 && ProfileActivity.this.currentChat.megagroup && ProfileActivity.this.chatInfo != null && ProfileActivity.this.chatInfo.participants != null) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= ProfileActivity.this.chatInfo.participants.participants.size()) {
                                z2 = false;
                                break;
                            } else {
                                if (MessageObject.getPeerId(((TLRPC$TL_chatChannelParticipant) ProfileActivity.this.chatInfo.participants.participants.get(i5)).channelParticipant.peer) == r3.user_id) {
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
                                if (ProfileActivity.this.chatInfo.participants.participants.get(i4).user_id == r3.user_id) {
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
                TLRPC$ChatParticipant tLRPC$ChatParticipant2 = r3;
                if (tLRPC$ChatParticipant2 instanceof TLRPC$TL_chatChannelParticipant) {
                    TLRPC$TL_chatChannelParticipant tLRPC$TL_chatChannelParticipant = (TLRPC$TL_chatChannelParticipant) tLRPC$ChatParticipant2;
                    if (i2 == 1) {
                        TLRPC$TL_channelParticipantAdmin tLRPC$TL_channelParticipantAdmin = new TLRPC$TL_channelParticipantAdmin();
                        tLRPC$TL_chatChannelParticipant.channelParticipant = tLRPC$TL_channelParticipantAdmin;
                        tLRPC$TL_channelParticipantAdmin.flags |= 4;
                    } else {
                        tLRPC$TL_chatChannelParticipant.channelParticipant = new TLRPC$TL_channelParticipant();
                    }
                    tLRPC$TL_chatChannelParticipant.channelParticipant.inviter_id = ProfileActivity.this.getUserConfig().getClientUserId();
                    tLRPC$TL_chatChannelParticipant.channelParticipant.peer = new TLRPC$TL_peerUser();
                    TLRPC$ChannelParticipant tLRPC$ChannelParticipant = tLRPC$TL_chatChannelParticipant.channelParticipant;
                    TLRPC$Peer tLRPC$Peer = tLRPC$ChannelParticipant.peer;
                    TLRPC$ChatParticipant tLRPC$ChatParticipant3 = r3;
                    tLRPC$Peer.user_id = tLRPC$ChatParticipant3.user_id;
                    tLRPC$ChannelParticipant.date = tLRPC$ChatParticipant3.date;
                    tLRPC$ChannelParticipant.banned_rights = tLRPC$TL_chatBannedRights2;
                    tLRPC$ChannelParticipant.admin_rights = tLRPC$TL_chatAdminRights2;
                    tLRPC$ChannelParticipant.rank = str2;
                } else if (tLRPC$ChatParticipant2 != null) {
                    if (i2 == 1) {
                        tLRPC$TL_chatParticipant = new TLRPC$TL_chatParticipantAdmin();
                    } else {
                        tLRPC$TL_chatParticipant = new TLRPC$TL_chatParticipant();
                    }
                    TLRPC$ChatParticipant tLRPC$ChatParticipant4 = r3;
                    tLRPC$TL_chatParticipant.user_id = tLRPC$ChatParticipant4.user_id;
                    tLRPC$TL_chatParticipant.date = tLRPC$ChatParticipant4.date;
                    tLRPC$TL_chatParticipant.inviter_id = tLRPC$ChatParticipant4.inviter_id;
                    int indexOf = ProfileActivity.this.chatInfo.participants.participants.indexOf(r3);
                    if (indexOf >= 0) {
                        ProfileActivity.this.chatInfo.participants.participants.set(indexOf, tLRPC$TL_chatParticipant);
                    }
                }
                if (i2 != 1 || r4) {
                    return;
                }
                r5[0] = true;
            }

            @Override
            public void didChangeOwner(TLRPC$User tLRPC$User2) {
                ProfileActivity.this.undoView.showWithAction(-ProfileActivity.this.chatId, ProfileActivity.this.currentChat.megagroup ? 10 : 9, tLRPC$User2);
            }
        });
        presentFragment(anonymousClass38);
    }

    public class AnonymousClass39 implements ChatRightsEditActivity.ChatRightsEditActivityDelegate {
        final int val$action;
        final boolean val$editingAdmin;
        final boolean[] val$needShowBulletin;
        final TLRPC$ChatParticipant val$participant;

        AnonymousClass39(int i2, TLRPC$ChatParticipant tLRPC$ChatParticipant2, boolean z2, boolean[] zArr2) {
            r2 = i2;
            r3 = tLRPC$ChatParticipant2;
            r4 = z2;
            r5 = zArr2;
        }

        @Override
        public void didSetRights(int i2, TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights2, TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights2, String str2) {
            boolean z2;
            TLRPC$ChatParticipant tLRPC$TL_chatParticipant;
            int i3 = r2;
            int i4 = 0;
            if (i3 != 0) {
                if (i3 == 1 && i2 == 0 && ProfileActivity.this.currentChat.megagroup && ProfileActivity.this.chatInfo != null && ProfileActivity.this.chatInfo.participants != null) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= ProfileActivity.this.chatInfo.participants.participants.size()) {
                            z2 = false;
                            break;
                        } else {
                            if (MessageObject.getPeerId(((TLRPC$TL_chatChannelParticipant) ProfileActivity.this.chatInfo.participants.participants.get(i5)).channelParticipant.peer) == r3.user_id) {
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
                            if (ProfileActivity.this.chatInfo.participants.participants.get(i4).user_id == r3.user_id) {
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
            TLRPC$ChatParticipant tLRPC$ChatParticipant2 = r3;
            if (tLRPC$ChatParticipant2 instanceof TLRPC$TL_chatChannelParticipant) {
                TLRPC$TL_chatChannelParticipant tLRPC$TL_chatChannelParticipant = (TLRPC$TL_chatChannelParticipant) tLRPC$ChatParticipant2;
                if (i2 == 1) {
                    TLRPC$TL_channelParticipantAdmin tLRPC$TL_channelParticipantAdmin = new TLRPC$TL_channelParticipantAdmin();
                    tLRPC$TL_chatChannelParticipant.channelParticipant = tLRPC$TL_channelParticipantAdmin;
                    tLRPC$TL_channelParticipantAdmin.flags |= 4;
                } else {
                    tLRPC$TL_chatChannelParticipant.channelParticipant = new TLRPC$TL_channelParticipant();
                }
                tLRPC$TL_chatChannelParticipant.channelParticipant.inviter_id = ProfileActivity.this.getUserConfig().getClientUserId();
                tLRPC$TL_chatChannelParticipant.channelParticipant.peer = new TLRPC$TL_peerUser();
                TLRPC$ChannelParticipant tLRPC$ChannelParticipant = tLRPC$TL_chatChannelParticipant.channelParticipant;
                TLRPC$Peer tLRPC$Peer = tLRPC$ChannelParticipant.peer;
                TLRPC$ChatParticipant tLRPC$ChatParticipant3 = r3;
                tLRPC$Peer.user_id = tLRPC$ChatParticipant3.user_id;
                tLRPC$ChannelParticipant.date = tLRPC$ChatParticipant3.date;
                tLRPC$ChannelParticipant.banned_rights = tLRPC$TL_chatBannedRights2;
                tLRPC$ChannelParticipant.admin_rights = tLRPC$TL_chatAdminRights2;
                tLRPC$ChannelParticipant.rank = str2;
            } else if (tLRPC$ChatParticipant2 != null) {
                if (i2 == 1) {
                    tLRPC$TL_chatParticipant = new TLRPC$TL_chatParticipantAdmin();
                } else {
                    tLRPC$TL_chatParticipant = new TLRPC$TL_chatParticipant();
                }
                TLRPC$ChatParticipant tLRPC$ChatParticipant4 = r3;
                tLRPC$TL_chatParticipant.user_id = tLRPC$ChatParticipant4.user_id;
                tLRPC$TL_chatParticipant.date = tLRPC$ChatParticipant4.date;
                tLRPC$TL_chatParticipant.inviter_id = tLRPC$ChatParticipant4.inviter_id;
                int indexOf = ProfileActivity.this.chatInfo.participants.participants.indexOf(r3);
                if (indexOf >= 0) {
                    ProfileActivity.this.chatInfo.participants.participants.set(indexOf, tLRPC$TL_chatParticipant);
                }
            }
            if (i2 != 1 || r4) {
                return;
            }
            r5[0] = true;
        }

        @Override
        public void didChangeOwner(TLRPC$User tLRPC$User2) {
            ProfileActivity.this.undoView.showWithAction(-ProfileActivity.this.chatId, ProfileActivity.this.currentChat.megagroup ? 10 : 9, tLRPC$User2);
        }
    }

    public boolean processOnClickOrPress(final int i, final View view, final float f, final float f2) {
        TLRPC$Chat chat;
        String publicUsername;
        TLRPC$TL_username findUsername;
        String sb;
        String str;
        int i2;
        TLRPC$UserFull tLRPC$UserFull;
        TLRPC$UserFull tLRPC$UserFull2;
        final String str2;
        View view2 = view;
        if (i == this.usernameRow || i == this.setUsernameRow) {
            if (this.userId != 0) {
                TLRPC$User user = getMessagesController().getUser(Long.valueOf(this.userId));
                publicUsername = UserObject.getPublicUsername(user);
                if (user == null || publicUsername == null) {
                    return false;
                }
                findUsername = DialogObject.findUsername(publicUsername, user);
            } else {
                if (this.chatId == 0 || (chat = getMessagesController().getChat(Long.valueOf(this.chatId))) == null || (this.topicId == 0 && !ChatObject.isPublic(chat))) {
                    return false;
                }
                publicUsername = ChatObject.getPublicUsername(chat);
                findUsername = DialogObject.findUsername(publicUsername, chat);
            }
            final TLRPC$TL_username tLRPC$TL_username = findUsername;
            if (this.userId == 0) {
                TLRPC$Chat chat2 = getMessagesController().getChat(Long.valueOf(this.chatId));
                if (ChatObject.isPublic(chat2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("https://");
                    sb2.append(getMessagesController().linkPrefix);
                    sb2.append("/");
                    sb2.append(ChatObject.getPublicUsername(chat2));
                    sb2.append(this.topicId != 0 ? "/" + this.topicId : "");
                    sb = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("https://");
                    sb3.append(getMessagesController().linkPrefix);
                    sb3.append("/c/");
                    sb3.append(chat2.id);
                    sb3.append(this.topicId != 0 ? "/" + this.topicId : "");
                    sb = sb3.toString();
                }
                String str3 = sb;
                final AnonymousClass40 anonymousClass40 = new AnonymousClass40(getParentActivity(), null, str3, false, str3, false);
                showDialog(anonymousClass40);
                if (tLRPC$TL_username == null || tLRPC$TL_username.editable) {
                    return true;
                }
                TL_fragment$TL_getCollectibleInfo tL_fragment$TL_getCollectibleInfo = new TL_fragment$TL_getCollectibleInfo();
                TL_fragment$TL_inputCollectibleUsername tL_fragment$TL_inputCollectibleUsername = new TL_fragment$TL_inputCollectibleUsername();
                tL_fragment$TL_inputCollectibleUsername.username = tLRPC$TL_username.username;
                tL_fragment$TL_getCollectibleInfo.collectible = tL_fragment$TL_inputCollectibleUsername;
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_fragment$TL_getCollectibleInfo, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        ProfileActivity.this.lambda$processOnClickOrPress$44(tLRPC$TL_username, anonymousClass40, tLObject, tLRPC$TL_error);
                    }
                }), getClassGuid());
                return true;
            }
            if (editRow(view2, i)) {
                return true;
            }
            if (tLRPC$TL_username != null && !tLRPC$TL_username.editable) {
                TL_fragment$TL_getCollectibleInfo tL_fragment$TL_getCollectibleInfo2 = new TL_fragment$TL_getCollectibleInfo();
                TL_fragment$TL_inputCollectibleUsername tL_fragment$TL_inputCollectibleUsername2 = new TL_fragment$TL_inputCollectibleUsername();
                tL_fragment$TL_inputCollectibleUsername2.username = tLRPC$TL_username.username;
                tL_fragment$TL_getCollectibleInfo2.collectible = tL_fragment$TL_inputCollectibleUsername2;
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_fragment$TL_getCollectibleInfo2, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        ProfileActivity.this.lambda$processOnClickOrPress$46(tLRPC$TL_username, tLObject, tLRPC$TL_error);
                    }
                }), getClassGuid());
                return true;
            }
            try {
                BulletinFactory.of(this).createCopyBulletin(LocaleController.getString("UsernameCopied", R.string.UsernameCopied), this.resourcesProvider).show();
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "@" + publicUsername));
                return true;
            } catch (Exception e) {
                FileLog.e(e);
                return true;
            }
        }
        if (i == this.phoneRow || i == this.numberRow) {
            if (editRow(view2, i)) {
                return true;
            }
            final TLRPC$User user2 = getMessagesController().getUser(Long.valueOf(this.userId));
            if (user2 == null || (str = user2.phone) == null || str.length() == 0 || getParentActivity() == null) {
                return false;
            }
            if (i == this.phoneRow && user2.phone.startsWith("888")) {
                TL_fragment$TL_inputCollectiblePhone tL_fragment$TL_inputCollectiblePhone = new TL_fragment$TL_inputCollectiblePhone();
                final String str4 = user2.phone;
                tL_fragment$TL_inputCollectiblePhone.phone = str4;
                TL_fragment$TL_getCollectibleInfo tL_fragment$TL_getCollectibleInfo3 = new TL_fragment$TL_getCollectibleInfo();
                tL_fragment$TL_getCollectibleInfo3.collectible = tL_fragment$TL_inputCollectiblePhone;
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_fragment$TL_getCollectibleInfo3, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        ProfileActivity.this.lambda$processOnClickOrPress$48(str4, user2, tLObject, tLRPC$TL_error);
                    }
                }), getClassGuid());
                return true;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            if (i == this.phoneRow) {
                TLRPC$UserFull tLRPC$UserFull3 = this.userInfo;
                if (tLRPC$UserFull3 != null && tLRPC$UserFull3.phone_calls_available) {
                    arrayList3.add(Integer.valueOf(R.drawable.msg_calls));
                    arrayList.add(LocaleController.getString("CallViaTelegram", R.string.CallViaTelegram));
                    arrayList2.add(2);
                    if (Build.VERSION.SDK_INT >= 18 && this.userInfo.video_calls_available) {
                        arrayList3.add(Integer.valueOf(R.drawable.msg_videocall));
                        arrayList.add(LocaleController.getString("VideoCallViaTelegram", R.string.VideoCallViaTelegram));
                        arrayList2.add(3);
                    }
                }
                if (!this.isFragmentPhoneNumber) {
                    arrayList3.add(Integer.valueOf(R.drawable.msg_calls_regular));
                    arrayList.add(LocaleController.getString("Call", R.string.Call));
                    arrayList2.add(0);
                }
            }
            arrayList3.add(Integer.valueOf(R.drawable.msg_copy));
            arrayList.add(LocaleController.getString("Copy", R.string.Copy));
            arrayList2.add(1);
            final AtomicReference atomicReference = new AtomicReference();
            AnonymousClass41 anonymousClass41 = new ActionBarPopupWindow.ActionBarPopupWindowLayout(this, getContext(), R.drawable.popup_fixed_alert, this.resourcesProvider) {
                Path path = new Path();

                AnonymousClass41(ProfileActivity this, Context context, int i3, Theme.ResourcesProvider resourcesProvider) {
                    super(context, i3, resourcesProvider);
                    this.path = new Path();
                }

                @Override
                protected boolean drawChild(Canvas canvas, View view3, long j) {
                    canvas.save();
                    this.path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                    this.path.addRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
                    canvas.clipPath(this.path);
                    boolean drawChild = super.drawChild(canvas, view3, j);
                    canvas.restore();
                    return drawChild;
                }
            };
            anonymousClass41.setFitItems(true);
            for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                final int intValue = ((Integer) arrayList2.get(i3)).intValue();
                ActionBarMenuItem.addItem(anonymousClass41, ((Integer) arrayList3.get(i3)).intValue(), (CharSequence) arrayList.get(i3), false, this.resourcesProvider).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        ProfileActivity.this.lambda$processOnClickOrPress$49(atomicReference, intValue, user2, view3);
                    }
                });
            }
            if (this.isFragmentPhoneNumber) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                frameLayout.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuSeparator, this.resourcesProvider));
                anonymousClass41.addView((View) frameLayout, LayoutHelper.createLinear(-1, 8));
                TextView textView = new TextView(getContext());
                textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider));
                textView.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteValueText, this.resourcesProvider));
                textView.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector, this.resourcesProvider), 0, 6));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.getString(R.string.AnonymousNumberNotice)));
                int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '*');
                int lastIndexOf = TextUtils.lastIndexOf(spannableStringBuilder, '*');
                if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                    spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                    spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                    int i4 = lastIndexOf - 1;
                    spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), indexOf, i4, 33);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(textView.getLinkTextColors().getDefaultColor()), indexOf, i4, 33);
                }
                textView.setText(spannableStringBuilder);
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        ProfileActivity.lambda$processOnClickOrPress$50(view3);
                    }
                });
                int i5 = R.id.fit_width_tag;
                frameLayout.setTag(i5, 1);
                textView.setTag(i5, 1);
                i2 = -2;
                anonymousClass41.addView((View) textView, LayoutHelper.createLinear(-2, -2));
            } else {
                i2 = -2;
            }
            ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(anonymousClass41, i2, i2);
            actionBarPopupWindow.setPauseNotifications(true);
            actionBarPopupWindow.setDismissAnimationDuration(220);
            actionBarPopupWindow.setOutsideTouchable(true);
            actionBarPopupWindow.setClippingEnabled(true);
            actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
            actionBarPopupWindow.setFocusable(true);
            anonymousClass41.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            actionBarPopupWindow.setInputMethodMode(2);
            actionBarPopupWindow.getContentView().setFocusableInTouchMode(true);
            atomicReference.set(actionBarPopupWindow);
            float f3 = f;
            float f4 = f2;
            while (view2 != getFragmentView() && view2 != null) {
                f3 += view2.getX();
                f4 += view2.getY();
                view2 = (View) view2.getParent();
            }
            if (AndroidUtilities.isTablet()) {
                ViewGroup view3 = this.parentLayout.getView();
                f3 += view3.getX() + view3.getPaddingLeft();
                f4 += view3.getY() + view3.getPaddingTop();
            }
            actionBarPopupWindow.showAtLocation(getFragmentView(), 0, (int) (f3 - (anonymousClass41.getMeasuredWidth() / 2.0f)), (int) f4);
            actionBarPopupWindow.dimBehind();
            return true;
        }
        if (i == this.channelInfoRow || i == this.userInfoRow || i == this.locationRow || i == this.bioRow) {
            if (i == this.bioRow && ((tLRPC$UserFull = this.userInfo) == null || TextUtils.isEmpty(tLRPC$UserFull.about))) {
                return false;
            }
            if (editRow(view2, i)) {
                return true;
            }
            if ((view2 instanceof AboutLinkCell) && ((AboutLinkCell) view2).onClick()) {
                return false;
            }
            String str5 = null;
            if (i == this.locationRow) {
                TLRPC$ChatFull tLRPC$ChatFull = this.chatInfo;
                if (tLRPC$ChatFull != null) {
                    TLRPC$ChannelLocation tLRPC$ChannelLocation = tLRPC$ChatFull.location;
                    if (tLRPC$ChannelLocation instanceof TLRPC$TL_channelLocation) {
                        str5 = ((TLRPC$TL_channelLocation) tLRPC$ChannelLocation).address;
                    }
                }
            } else if (i == this.channelInfoRow) {
                TLRPC$ChatFull tLRPC$ChatFull2 = this.chatInfo;
                if (tLRPC$ChatFull2 != null) {
                    str5 = tLRPC$ChatFull2.about;
                }
            } else {
                TLRPC$UserFull tLRPC$UserFull4 = this.userInfo;
                if (tLRPC$UserFull4 != null) {
                    str5 = tLRPC$UserFull4.about;
                }
            }
            final String str6 = str5;
            if (TextUtils.isEmpty(str6)) {
                return false;
            }
            final String[] strArr = {TranslateController.UNKNOWN_LANGUAGE};
            final boolean isContextTranslateEnabled = MessagesController.getInstance(this.currentAccount).getTranslateController().isContextTranslateEnabled();
            final boolean[] zArr = new boolean[1];
            zArr[0] = i == this.bioRow || i == this.channelInfoRow || i == this.userInfoRow;
            final String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.this.lambda$processOnClickOrPress$53(zArr, str6, i, strArr, language, f, f2, view);
                }
            };
            if (zArr[0]) {
                if (LanguageDetector.hasSupport()) {
                    LanguageDetector.detectLanguage(str6, new LanguageDetector.StringCallback() {
                        @Override
                        public final void run(String str7) {
                            ProfileActivity.this.lambda$processOnClickOrPress$54(strArr, zArr, language, isContextTranslateEnabled, runnable, str7);
                        }
                    }, new LanguageDetector.ExceptionCallback() {
                        @Override
                        public final void run(Exception exc) {
                            ProfileActivity.lambda$processOnClickOrPress$55(runnable, exc);
                        }
                    });
                } else {
                    runnable.run();
                }
            } else {
                runnable.run();
            }
            return true;
        }
        if ((i != this.bizHoursRow && i != this.bizLocationRow) || getParentActivity() == null || (tLRPC$UserFull2 = this.userInfo) == null) {
            return false;
        }
        if (i == this.bizHoursRow) {
            TLRPC$TL_businessWorkHours tLRPC$TL_businessWorkHours = tLRPC$UserFull2.business_work_hours;
            if (tLRPC$TL_businessWorkHours == null) {
                return false;
            }
            str2 = OpeningHoursActivity.toString(this.currentAccount, tLRPC$UserFull2.user, tLRPC$TL_businessWorkHours);
        } else {
            if (i != this.bizLocationRow || editRow(view2, i)) {
                return true;
            }
            TLRPC$TL_businessLocation tLRPC$TL_businessLocation = this.userInfo.business_location;
            if (tLRPC$TL_businessLocation == null) {
                return false;
            }
            str2 = tLRPC$TL_businessLocation.address;
        }
        final AtomicReference atomicReference2 = new AtomicReference();
        AnonymousClass43 anonymousClass43 = new ActionBarPopupWindow.ActionBarPopupWindowLayout(this, getContext(), R.drawable.popup_fixed_alert, this.resourcesProvider) {
            Path path = new Path();

            AnonymousClass43(ProfileActivity this, Context context, int i6, Theme.ResourcesProvider resourcesProvider) {
                super(context, i6, resourcesProvider);
                this.path = new Path();
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view4, long j) {
                canvas.save();
                this.path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                this.path.addRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
                canvas.clipPath(this.path);
                boolean drawChild = super.drawChild(canvas, view4, j);
                canvas.restore();
                return drawChild;
            }
        };
        anonymousClass43.setFitItems(true);
        ActionBarMenuItem.addItem(anonymousClass43, R.drawable.msg_copy, LocaleController.getString(R.string.Copy), false, this.resourcesProvider).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                ProfileActivity.this.lambda$processOnClickOrPress$56(atomicReference2, str2, i, view4);
            }
        });
        ActionBarPopupWindow actionBarPopupWindow2 = new ActionBarPopupWindow(anonymousClass43, -2, -2);
        actionBarPopupWindow2.setPauseNotifications(true);
        actionBarPopupWindow2.setDismissAnimationDuration(220);
        actionBarPopupWindow2.setOutsideTouchable(true);
        actionBarPopupWindow2.setClippingEnabled(true);
        actionBarPopupWindow2.setAnimationStyle(R.style.PopupContextAnimation);
        actionBarPopupWindow2.setFocusable(true);
        anonymousClass43.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        actionBarPopupWindow2.setInputMethodMode(2);
        actionBarPopupWindow2.getContentView().setFocusableInTouchMode(true);
        atomicReference2.set(actionBarPopupWindow2);
        float f5 = f;
        float f6 = f2;
        while (view2 != getFragmentView()) {
            f5 += view2.getX();
            f6 += view2.getY();
            view2 = (View) view2.getParent();
        }
        if (AndroidUtilities.isTablet()) {
            ViewGroup view4 = this.parentLayout.getView();
            f5 += view4.getX() + view4.getPaddingLeft();
            f6 += view4.getY() + view4.getPaddingTop();
        }
        actionBarPopupWindow2.showAtLocation(getFragmentView(), 0, (int) (f5 - (anonymousClass43.getMeasuredWidth() / 2.0f)), (int) f6);
        actionBarPopupWindow2.dimBehind();
        return true;
    }

    public class AnonymousClass40 extends ShareAlert {
        AnonymousClass40(Context context, ArrayList arrayList, String str, boolean z, String str2, boolean z2) {
            super(context, arrayList, str, z, str2, z2);
        }

        @Override
        public void onSend(final LongSparseArray<TLRPC$Dialog> longSparseArray, final int i, TLRPC$TL_forumTopic tLRPC$TL_forumTopic) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.AnonymousClass40.this.lambda$onSend$0(longSparseArray, i);
                }
            }, 250L);
        }

        public void lambda$onSend$0(LongSparseArray longSparseArray, int i) {
            BulletinFactory.createInviteSentBulletin(ProfileActivity.this.getParentActivity(), ProfileActivity.this.contentView, longSparseArray.size(), longSparseArray.size() == 1 ? ((TLRPC$Dialog) longSparseArray.valueAt(0)).id : 0L, i, getThemedColor(Theme.key_undo_background), getThemedColor(Theme.key_undo_infoColor)).show();
        }
    }

    public void lambda$processOnClickOrPress$44(final TLRPC$TL_username tLRPC$TL_username, final ShareAlert shareAlert, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ProfileActivity.this.lambda$processOnClickOrPress$43(tLObject, tLRPC$TL_username, shareAlert, tLRPC$TL_error);
            }
        });
    }

    public void lambda$processOnClickOrPress$43(TLObject tLObject, TLRPC$TL_username tLRPC$TL_username, ShareAlert shareAlert, TLRPC$TL_error tLRPC$TL_error) {
        String str;
        if (tLObject instanceof TL_fragment$TL_collectibleInfo) {
            final TL_fragment$TL_collectibleInfo tL_fragment$TL_collectibleInfo = (TL_fragment$TL_collectibleInfo) tLObject;
            if (this.userId != 0) {
                getMessagesController().getUser(Long.valueOf(this.userId));
            } else {
                getMessagesController().getChat(Long.valueOf(this.chatId));
            }
            String str2 = "@" + tLRPC$TL_username.username;
            String format = LocaleController.getInstance().formatterBoostExpired.format(new Date(tL_fragment$TL_collectibleInfo.purchase_date * 1000));
            String formatCurrency = BillingController.getInstance().formatCurrency(tL_fragment$TL_collectibleInfo.crypto_amount, tL_fragment$TL_collectibleInfo.crypto_currency);
            String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_fragment$TL_collectibleInfo.amount, tL_fragment$TL_collectibleInfo.currency);
            BulletinFactory of = BulletinFactory.of(shareAlert.bulletinContainer2, this.resourcesProvider);
            int i = R.drawable.filled_username;
            int i2 = R.string.FragmentChannelUsername;
            Object[] objArr = new Object[4];
            objArr[0] = str2;
            objArr[1] = format;
            objArr[2] = formatCurrency;
            if (TextUtils.isEmpty(formatCurrency2)) {
                str = "";
            } else {
                str = "(" + formatCurrency2 + ")";
            }
            objArr[3] = str;
            of.createImageBulletin(i, AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.formatString(i2, objArr)), new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.this.lambda$processOnClickOrPress$41(tL_fragment$TL_collectibleInfo);
                }
            })).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ProfileActivity.this.lambda$processOnClickOrPress$42(tL_fragment$TL_collectibleInfo, view);
                }
            }).show(false);
            return;
        }
        BulletinFactory.showError(tLRPC$TL_error);
    }

    public void lambda$processOnClickOrPress$41(TL_fragment$TL_collectibleInfo tL_fragment$TL_collectibleInfo) {
        Bulletin.hideVisible();
        Browser.openUrl(getContext(), tL_fragment$TL_collectibleInfo.url);
    }

    public void lambda$processOnClickOrPress$42(TL_fragment$TL_collectibleInfo tL_fragment$TL_collectibleInfo, View view) {
        Bulletin.hideVisible();
        Browser.openUrl(getContext(), tL_fragment$TL_collectibleInfo.url);
    }

    public void lambda$processOnClickOrPress$46(final TLRPC$TL_username tLRPC$TL_username, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ProfileActivity.this.lambda$processOnClickOrPress$45(tLObject, tLRPC$TL_username, tLRPC$TL_error);
            }
        });
    }

    public void lambda$processOnClickOrPress$45(TLObject tLObject, TLRPC$TL_username tLRPC$TL_username, TLRPC$TL_error tLRPC$TL_error) {
        TLObject chat;
        if (tLObject instanceof TL_fragment$TL_collectibleInfo) {
            if (this.userId != 0) {
                chat = getMessagesController().getUser(Long.valueOf(this.userId));
            } else {
                chat = getMessagesController().getChat(Long.valueOf(this.chatId));
            }
            FragmentUsernameBottomSheet.open(getContext(), 0, tLRPC$TL_username.username, chat, (TL_fragment$TL_collectibleInfo) tLObject, getResourceProvider());
            return;
        }
        BulletinFactory.showError(tLRPC$TL_error);
    }

    public void lambda$processOnClickOrPress$48(final String str, final TLRPC$User tLRPC$User, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ProfileActivity.this.lambda$processOnClickOrPress$47(tLObject, str, tLRPC$User, tLRPC$TL_error);
            }
        });
    }

    public void lambda$processOnClickOrPress$47(TLObject tLObject, String str, TLRPC$User tLRPC$User, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TL_fragment$TL_collectibleInfo) {
            FragmentUsernameBottomSheet.open(getContext(), 1, str, tLRPC$User, (TL_fragment$TL_collectibleInfo) tLObject, getResourceProvider());
        } else {
            BulletinFactory.showError(tLRPC$TL_error);
        }
    }

    public class AnonymousClass41 extends ActionBarPopupWindow.ActionBarPopupWindowLayout {
        Path path = new Path();

        AnonymousClass41(ProfileActivity this, Context context, int i3, Theme.ResourcesProvider resourcesProvider) {
            super(context, i3, resourcesProvider);
            this.path = new Path();
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view3, long j) {
            canvas.save();
            this.path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
            this.path.addRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.clipPath(this.path);
            boolean drawChild = super.drawChild(canvas, view3, j);
            canvas.restore();
            return drawChild;
        }
    }

    public void lambda$processOnClickOrPress$49(AtomicReference atomicReference, int i, TLRPC$User tLRPC$User, View view) {
        ((ActionBarPopupWindow) atomicReference.get()).dismiss();
        if (i == 0) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:+" + tLRPC$User.phone));
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
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "+" + tLRPC$User.phone));
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    BulletinFactory.of(this).createCopyBulletin(LocaleController.getString("PhoneCopied", R.string.PhoneCopied)).show();
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
            TLRPC$UserFull tLRPC$UserFull = this.userInfo;
            VoIPHelper.startCall(tLRPC$User, z, tLRPC$UserFull != null && tLRPC$UserFull.video_calls_available, getParentActivity(), this.userInfo, getAccountInstance());
        }
    }

    public static void lambda$processOnClickOrPress$50(View view) {
        try {
            view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://fragment.com")));
        } catch (ActivityNotFoundException e) {
            FileLog.e(e);
        }
    }

    public void lambda$processOnClickOrPress$53(boolean[] zArr, final String str, final int i, final String[] strArr, final String str2, float f, float f2, View view) {
        if (getParentActivity() == null) {
            return;
        }
        boolean z = false;
        CharSequence[] charSequenceArr = zArr[0] ? new CharSequence[]{LocaleController.getString("Copy", R.string.Copy), LocaleController.getString("TranslateMessage", R.string.TranslateMessage)} : new CharSequence[]{LocaleController.getString("Copy", R.string.Copy)};
        int[] iArr = zArr[0] ? new int[]{R.drawable.msg_copy, R.drawable.msg_translate} : new int[]{R.drawable.msg_copy};
        final AtomicReference atomicReference = new AtomicReference();
        AnonymousClass42 anonymousClass42 = new ActionBarPopupWindow.ActionBarPopupWindowLayout(this, getContext(), R.drawable.popup_fixed_alert, this.resourcesProvider) {
            Path path = new Path();

            AnonymousClass42(ProfileActivity this, Context context, int i2, Theme.ResourcesProvider resourcesProvider) {
                super(context, i2, resourcesProvider);
                this.path = new Path();
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view2, long j) {
                canvas.save();
                this.path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                this.path.addRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
                canvas.clipPath(this.path);
                boolean drawChild = super.drawChild(canvas, view2, j);
                canvas.restore();
                return drawChild;
            }
        };
        anonymousClass42.setFitItems(true);
        int i2 = 0;
        while (i2 < iArr.length) {
            final int i3 = i2;
            ActionBarMenuItem.addItem(anonymousClass42, iArr[i2], charSequenceArr[i2], z, this.resourcesProvider).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ProfileActivity.this.lambda$processOnClickOrPress$52(atomicReference, i3, str, i, strArr, str2, view2);
                }
            });
            i2++;
            z = false;
        }
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(anonymousClass42, -2, -2);
        actionBarPopupWindow.setPauseNotifications(true);
        actionBarPopupWindow.setDismissAnimationDuration(220);
        actionBarPopupWindow.setOutsideTouchable(true);
        actionBarPopupWindow.setClippingEnabled(true);
        actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation);
        actionBarPopupWindow.setFocusable(true);
        anonymousClass42.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        actionBarPopupWindow.setInputMethodMode(2);
        actionBarPopupWindow.getContentView().setFocusableInTouchMode(true);
        atomicReference.set(actionBarPopupWindow);
        float f3 = f;
        float f4 = f2;
        for (View view2 = view; view2 != getFragmentView(); view2 = (View) view2.getParent()) {
            f3 += view2.getX();
            f4 += view2.getY();
        }
        if (AndroidUtilities.isTablet()) {
            ViewGroup view3 = this.parentLayout.getView();
            f3 += view3.getX() + view3.getPaddingLeft();
            f4 += view3.getY() + view3.getPaddingTop();
        }
        actionBarPopupWindow.showAtLocation(getFragmentView(), 0, (int) (f3 - (anonymousClass42.getMeasuredWidth() / 2.0f)), (int) f4);
        actionBarPopupWindow.dimBehind();
    }

    public class AnonymousClass42 extends ActionBarPopupWindow.ActionBarPopupWindowLayout {
        Path path = new Path();

        AnonymousClass42(ProfileActivity this, Context context, int i2, Theme.ResourcesProvider resourcesProvider) {
            super(context, i2, resourcesProvider);
            this.path = new Path();
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view2, long j) {
            canvas.save();
            this.path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            this.path.addRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.clipPath(this.path);
            boolean drawChild = super.drawChild(canvas, view2, j);
            canvas.restore();
            return drawChild;
        }
    }

    public void lambda$processOnClickOrPress$52(AtomicReference atomicReference, int i, String str, int i2, String[] strArr, String str2, View view) {
        ((ActionBarPopupWindow) atomicReference.get()).dismiss();
        try {
            if (i == 0) {
                AndroidUtilities.addToClipboard(str);
                if (i2 == this.bioRow) {
                    BulletinFactory.of(this).createCopyBulletin(LocaleController.getString("BioCopied", R.string.BioCopied)).show();
                } else {
                    BulletinFactory.of(this).createCopyBulletin(LocaleController.getString("TextCopied", R.string.TextCopied)).show();
                }
            } else if (i != 1) {
            } else {
                TranslateAlert2.showAlert(this.fragmentView.getContext(), this, this.currentAccount, strArr[0], str2, str, null, false, new Utilities.CallbackReturn() {
                    @Override
                    public final Object run(Object obj) {
                        Boolean lambda$processOnClickOrPress$51;
                        lambda$processOnClickOrPress$51 = ProfileActivity.this.lambda$processOnClickOrPress$51((URLSpan) obj);
                        return lambda$processOnClickOrPress$51;
                    }
                }, null);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public Boolean lambda$processOnClickOrPress$51(URLSpan uRLSpan) {
        if (uRLSpan != null) {
            openUrl(uRLSpan.getURL(), null);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public void lambda$processOnClickOrPress$54(String[] strArr, boolean[] zArr, String str, boolean z, Runnable runnable, String str2) {
        TLRPC$Chat tLRPC$Chat;
        strArr[0] = str2;
        zArr[0] = str2 != null && (!str2.equals(str) || str2.equals(TranslateController.UNKNOWN_LANGUAGE)) && ((z && !RestrictedLanguagesSelectActivity.getRestrictedLanguages().contains(str2)) || ((tLRPC$Chat = this.currentChat) != null && ((tLRPC$Chat.has_link || ChatObject.isPublic(tLRPC$Chat)) && ("uk".equals(str2) || "ru".equals(str2)))));
        runnable.run();
    }

    public static void lambda$processOnClickOrPress$55(Runnable runnable, Exception exc) {
        FileLog.e("mlkit: failed to detect language in selection", exc);
        runnable.run();
    }

    public class AnonymousClass43 extends ActionBarPopupWindow.ActionBarPopupWindowLayout {
        Path path = new Path();

        AnonymousClass43(ProfileActivity this, Context context, int i6, Theme.ResourcesProvider resourcesProvider) {
            super(context, i6, resourcesProvider);
            this.path = new Path();
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view4, long j) {
            canvas.save();
            this.path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
            this.path.addRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.clipPath(this.path);
            boolean drawChild = super.drawChild(canvas, view4, j);
            canvas.restore();
            return drawChild;
        }
    }

    public void lambda$processOnClickOrPress$56(AtomicReference atomicReference, String str, int i, View view) {
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
        boolean isForum = ChatObject.isForum(this.currentChat);
        AlertsCreator.createClearOrDeleteDialogAlert(this, false, this.currentChat, null, false, isForum, !isForum, new MessagesStorage.BooleanCallback() {
            @Override
            public final void run(boolean z) {
                ProfileActivity.this.lambda$leaveChatPressed$57(z);
            }
        }, this.resourcesProvider);
    }

    public void lambda$leaveChatPressed$57(boolean z) {
        this.playProfileAnimation = 0;
        NotificationCenter notificationCenter = getNotificationCenter();
        int i = NotificationCenter.closeChats;
        notificationCenter.removeObserver(this, i);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i, new Object[0]);
        lambda$onBackPressed$305();
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-this.currentChat.id), null, this.currentChat, Boolean.valueOf(z));
    }

    public void getChannelParticipants(boolean z) {
        LongSparseArray<TLRPC$ChatParticipant> longSparseArray;
        if (this.loadingUsers || (longSparseArray = this.participantsMap) == null || this.chatInfo == null) {
            return;
        }
        this.loadingUsers = true;
        final int i = (longSparseArray.size() == 0 || !z) ? 0 : 300;
        final TLRPC$TL_channels_getParticipants tLRPC$TL_channels_getParticipants = new TLRPC$TL_channels_getParticipants();
        tLRPC$TL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.chatId);
        tLRPC$TL_channels_getParticipants.filter = new TLRPC$TL_channelParticipantsRecent();
        tLRPC$TL_channels_getParticipants.offset = z ? 0 : this.participantsMap.size();
        tLRPC$TL_channels_getParticipants.limit = 200;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tLRPC$TL_channels_getParticipants, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ProfileActivity.this.lambda$getChannelParticipants$60(tLRPC$TL_channels_getParticipants, i, tLObject, tLRPC$TL_error);
            }
        }), this.classGuid);
    }

    public void lambda$getChannelParticipants$59(final TLRPC$TL_error tLRPC$TL_error, final TLObject tLObject, final TLRPC$TL_channels_getParticipants tLRPC$TL_channels_getParticipants) {
        getNotificationCenter().doOnIdle(new Runnable() {
            @Override
            public final void run() {
                ProfileActivity.this.lambda$getChannelParticipants$58(tLRPC$TL_error, tLObject, tLRPC$TL_channels_getParticipants);
            }
        });
    }

    public void lambda$getChannelParticipants$60(final TLRPC$TL_channels_getParticipants tLRPC$TL_channels_getParticipants, int i, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ProfileActivity.this.lambda$getChannelParticipants$59(tLRPC$TL_error, tLObject, tLRPC$TL_channels_getParticipants);
            }
        }, i);
    }

    public void lambda$getChannelParticipants$58(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, TLRPC$TL_channels_getParticipants tLRPC$TL_channels_getParticipants) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_channels_channelParticipants tLRPC$TL_channels_channelParticipants = (TLRPC$TL_channels_channelParticipants) tLObject;
            getMessagesController().putUsers(tLRPC$TL_channels_channelParticipants.users, false);
            getMessagesController().putChats(tLRPC$TL_channels_channelParticipants.chats, false);
            if (tLRPC$TL_channels_channelParticipants.users.size() < 200) {
                this.usersEndReached = true;
            }
            if (tLRPC$TL_channels_getParticipants.offset == 0) {
                this.participantsMap.clear();
                this.chatInfo.participants = new TLRPC$TL_chatParticipants();
                getMessagesStorage().putUsersAndChats(tLRPC$TL_channels_channelParticipants.users, tLRPC$TL_channels_channelParticipants.chats, true, true);
                getMessagesStorage().updateChannelUsers(this.chatId, tLRPC$TL_channels_channelParticipants.participants);
            }
            for (int i = 0; i < tLRPC$TL_channels_channelParticipants.participants.size(); i++) {
                TLRPC$TL_chatChannelParticipant tLRPC$TL_chatChannelParticipant = new TLRPC$TL_chatChannelParticipant();
                TLRPC$ChannelParticipant tLRPC$ChannelParticipant = tLRPC$TL_channels_channelParticipants.participants.get(i);
                tLRPC$TL_chatChannelParticipant.channelParticipant = tLRPC$ChannelParticipant;
                tLRPC$TL_chatChannelParticipant.inviter_id = tLRPC$ChannelParticipant.inviter_id;
                long peerId = MessageObject.getPeerId(tLRPC$ChannelParticipant.peer);
                tLRPC$TL_chatChannelParticipant.user_id = peerId;
                tLRPC$TL_chatChannelParticipant.date = tLRPC$TL_chatChannelParticipant.channelParticipant.date;
                if (this.participantsMap.indexOfKey(peerId) < 0) {
                    TLRPC$ChatFull tLRPC$ChatFull = this.chatInfo;
                    if (tLRPC$ChatFull.participants == null) {
                        tLRPC$ChatFull.participants = new TLRPC$TL_chatParticipants();
                    }
                    this.chatInfo.participants.participants.add(tLRPC$TL_chatChannelParticipant);
                    this.participantsMap.put(tLRPC$TL_chatChannelParticipant.user_id, tLRPC$TL_chatChannelParticipant);
                }
            }
        }
        this.loadingUsers = false;
        saveScrollPosition();
        updateListAnimated(true);
    }

    public class AnonymousClass44 extends AnimationProperties.FloatProperty<ActionBar> {
        AnonymousClass44(String str) {
            super(str);
        }

        @Override
        public void setValue(ActionBar actionBar, float f) {
            int themedColor;
            int themedColor2;
            ProfileActivity.this.mediaHeaderAnimationProgress = f;
            if (ProfileActivity.this.storyView != null) {
                ProfileActivity.this.storyView.setActionBarActionMode(f);
            }
            ProfileActivity.this.topView.invalidate();
            int themedColor3 = ProfileActivity.this.getThemedColor(Theme.key_profile_title);
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
            int i2 = -1;
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
                    i2 = profileActivity2.applyPeerColor(profileActivity2.getThemedColor(Theme.key_profile_verifiedCheck));
                }
                ProfileActivity.this.verifiedCheckDrawable[1].setColorFilter(AndroidUtilities.getOffsetColor(i2, ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite), f, 1.0f), PorterDuff.Mode.MULTIPLY);
            }
            if (ProfileActivity.this.premiumStarDrawable[0] != null) {
                ProfileActivity.this.premiumStarDrawable[0].setColorFilter(AndroidUtilities.getOffsetColor(ProfileActivity.this.getThemedColor(Theme.key_profile_verifiedBackground), ProfileActivity.this.getThemedColor(i), f, 1.0f), PorterDuff.Mode.MULTIPLY);
            }
            if (ProfileActivity.this.premiumStarDrawable[1] != null) {
                ProfileActivity profileActivity3 = ProfileActivity.this;
                int applyPeerColor = profileActivity3.applyPeerColor(profileActivity3.getThemedColor(Theme.key_profile_verifiedBackground));
                ProfileActivity profileActivity4 = ProfileActivity.this;
                ProfileActivity.this.premiumStarDrawable[1].setColorFilter(AndroidUtilities.getOffsetColor(applyPeerColor, profileActivity4.applyPeerColor(profileActivity4.getThemedColor(i)), f, 1.0f), PorterDuff.Mode.MULTIPLY);
            }
            ProfileActivity.this.updateEmojiStatusDrawableColor();
            if (ProfileActivity.this.avatarsViewPagerIndicatorView.getSecondaryMenuItem() != null) {
                if (ProfileActivity.this.videoCallItemVisible || ProfileActivity.this.editItemVisible || ProfileActivity.this.callItemVisible) {
                    ProfileActivity profileActivity5 = ProfileActivity.this;
                    profileActivity5.needLayoutText(Math.min(1.0f, profileActivity5.extraHeight / AndroidUtilities.dp(88.0f)));
                }
            }
        }

        @Override
        public Float get(ActionBar actionBar) {
            return Float.valueOf(ProfileActivity.this.mediaHeaderAnimationProgress);
        }
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
        ActionBarMenuItem searchItem = this.sharedMediaLayout.getSearchItem();
        RLottieImageView searchOptionsItem = this.sharedMediaLayout.getSearchOptionsItem();
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
        } else {
            if (this.sharedMediaLayout.isSearchItemVisible()) {
                searchItem.setVisibility(0);
            }
            if (searchOptionsItem != null) {
                searchOptionsItem.setVisibility(0);
            }
            if (this.sharedMediaLayout.isCalendarItemVisible()) {
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
        float[] fArr = new float[1];
        fArr[0] = z ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem, (Property<ActionBarMenuItem, Float>) property, fArr));
        ActionBarMenuItem actionBarMenuItem2 = this.videoCallItem;
        Property property2 = View.ALPHA;
        float[] fArr2 = new float[1];
        fArr2[0] = z ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem2, (Property<ActionBarMenuItem, Float>) property2, fArr2));
        ActionBarMenuItem actionBarMenuItem3 = this.otherItem;
        Property property3 = View.ALPHA;
        float[] fArr3 = new float[1];
        fArr3[0] = z ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem3, (Property<ActionBarMenuItem, Float>) property3, fArr3));
        ActionBarMenuItem actionBarMenuItem4 = this.editItem;
        Property property4 = View.ALPHA;
        float[] fArr4 = new float[1];
        fArr4[0] = z ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem4, (Property<ActionBarMenuItem, Float>) property4, fArr4));
        ActionBarMenuItem actionBarMenuItem5 = this.callItem;
        Property property5 = View.TRANSLATION_Y;
        float[] fArr5 = new float[1];
        fArr5[0] = z ? -AndroidUtilities.dp(10.0f) : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem5, (Property<ActionBarMenuItem, Float>) property5, fArr5));
        ActionBarMenuItem actionBarMenuItem6 = this.videoCallItem;
        Property property6 = View.TRANSLATION_Y;
        float[] fArr6 = new float[1];
        fArr6[0] = z ? -AndroidUtilities.dp(10.0f) : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem6, (Property<ActionBarMenuItem, Float>) property6, fArr6));
        ActionBarMenuItem actionBarMenuItem7 = this.otherItem;
        Property property7 = View.TRANSLATION_Y;
        float[] fArr7 = new float[1];
        fArr7[0] = z ? -AndroidUtilities.dp(10.0f) : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem7, (Property<ActionBarMenuItem, Float>) property7, fArr7));
        ActionBarMenuItem actionBarMenuItem8 = this.editItem;
        Property property8 = View.TRANSLATION_Y;
        float[] fArr8 = new float[1];
        fArr8[0] = z ? -AndroidUtilities.dp(10.0f) : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem8, (Property<ActionBarMenuItem, Float>) property8, fArr8));
        Property property9 = View.ALPHA;
        float[] fArr9 = new float[1];
        fArr9[0] = z ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(searchItem, (Property<ActionBarMenuItem, Float>) property9, fArr9));
        Property property10 = View.TRANSLATION_Y;
        float[] fArr10 = new float[1];
        fArr10[0] = z ? 0.0f : AndroidUtilities.dp(10.0f);
        arrayList.add(ObjectAnimator.ofFloat(searchItem, (Property<ActionBarMenuItem, Float>) property10, fArr10));
        ImageView imageView = this.sharedMediaLayout.photoVideoOptionsItem;
        Property property11 = View.ALPHA;
        float[] fArr11 = new float[1];
        fArr11[0] = z ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property11, fArr11));
        ImageView imageView2 = this.sharedMediaLayout.photoVideoOptionsItem;
        Property property12 = View.TRANSLATION_Y;
        float[] fArr12 = new float[1];
        fArr12[0] = z ? 0.0f : AndroidUtilities.dp(10.0f);
        arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property12, fArr12));
        ActionBar actionBar2 = this.actionBar;
        Property<ActionBar, Float> property13 = this.ACTIONBAR_HEADER_PROGRESS;
        float[] fArr13 = new float[1];
        fArr13[0] = z ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(actionBar2, property13, fArr13));
        SimpleTextView simpleTextView = this.onlineTextView[1];
        Property property14 = View.ALPHA;
        float[] fArr14 = new float[1];
        fArr14[0] = z ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(simpleTextView, (Property<SimpleTextView, Float>) property14, fArr14));
        AudioPlayerAlert.ClippingTextViewSwitcher clippingTextViewSwitcher = this.mediaCounterTextView;
        Property property15 = View.ALPHA;
        float[] fArr15 = new float[1];
        fArr15[0] = z ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(clippingTextViewSwitcher, (Property<AudioPlayerAlert.ClippingTextViewSwitcher, Float>) property15, fArr15));
        if (z) {
            arrayList.add(ObjectAnimator.ofFloat(this, this.HEADER_SHADOW, 0.0f));
        }
        if (this.storyView != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ProfileActivity.this.lambda$setMediaHeaderVisible$61(valueAnimator);
                }
            });
            arrayList.add(ofFloat);
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.headerAnimatorSet = animatorSet3;
        animatorSet3.playTogether(arrayList);
        this.headerAnimatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.headerAnimatorSet.addListener(new AnimatorListenerAdapter() {
            final ActionBarMenuItem val$mediaSearchItem;

            AnonymousClass45(ActionBarMenuItem searchItem2) {
                r2 = searchItem2;
            }

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
                            r2.setVisibility(0);
                        }
                        ProfileActivity.this.sharedMediaLayout.photoVideoOptionsItem.setVisibility(4);
                        ProfileActivity.this.headerShadowAnimatorSet = new AnimatorSet();
                        AnimatorSet animatorSet4 = ProfileActivity.this.headerShadowAnimatorSet;
                        ProfileActivity profileActivity = ProfileActivity.this;
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(profileActivity, (Property<ProfileActivity, Float>) profileActivity.HEADER_SHADOW, 1.0f));
                        ProfileActivity.this.headerShadowAnimatorSet.setDuration(100L);
                        ProfileActivity.this.headerShadowAnimatorSet.addListener(new AnimatorListenerAdapter() {
                            AnonymousClass1() {
                            }

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

            class AnonymousClass1 extends AnimatorListenerAdapter {
                AnonymousClass1() {
                }

                @Override
                public void onAnimationEnd(Animator animator2) {
                    ProfileActivity.this.headerShadowAnimatorSet = null;
                }
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

    public void lambda$setMediaHeaderVisible$61(ValueAnimator valueAnimator) {
        updateStoriesViewBounds(true);
    }

    public class AnonymousClass45 extends AnimatorListenerAdapter {
        final ActionBarMenuItem val$mediaSearchItem;

        AnonymousClass45(ActionBarMenuItem searchItem2) {
            r2 = searchItem2;
        }

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
                        r2.setVisibility(0);
                    }
                    ProfileActivity.this.sharedMediaLayout.photoVideoOptionsItem.setVisibility(4);
                    ProfileActivity.this.headerShadowAnimatorSet = new AnimatorSet();
                    AnimatorSet animatorSet4 = ProfileActivity.this.headerShadowAnimatorSet;
                    ProfileActivity profileActivity = ProfileActivity.this;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(profileActivity, (Property<ProfileActivity, Float>) profileActivity.HEADER_SHADOW, 1.0f));
                    ProfileActivity.this.headerShadowAnimatorSet.setDuration(100L);
                    ProfileActivity.this.headerShadowAnimatorSet.addListener(new AnimatorListenerAdapter() {
                        AnonymousClass1() {
                        }

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

        class AnonymousClass1 extends AnimatorListenerAdapter {
            AnonymousClass1() {
            }

            @Override
            public void onAnimationEnd(Animator animator2) {
                ProfileActivity.this.headerShadowAnimatorSet = null;
            }
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            ProfileActivity.this.headerAnimatorSet = null;
        }
    }

    public void openAddMember() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("addToGroup", true);
        bundle.putLong("chatId", this.currentChat.id);
        GroupCreateActivity groupCreateActivity = new GroupCreateActivity(bundle);
        groupCreateActivity.setInfo(this.chatInfo);
        TLRPC$ChatFull tLRPC$ChatFull = this.chatInfo;
        if (tLRPC$ChatFull != null && tLRPC$ChatFull.participants != null) {
            LongSparseArray<TLObject> longSparseArray = new LongSparseArray<>();
            for (int i = 0; i < this.chatInfo.participants.participants.size(); i++) {
                longSparseArray.put(this.chatInfo.participants.participants.get(i).user_id, null);
            }
            groupCreateActivity.setIgnoreUsers(longSparseArray);
        }
        groupCreateActivity.setDelegate2(new GroupCreateActivity.ContactsAddActivityDelegate() {
            @Override
            public final void didSelectUsers(ArrayList arrayList, int i2) {
                ProfileActivity.this.lambda$openAddMember$65(arrayList, i2);
            }

            @Override
            public void needAddBot(TLRPC$User tLRPC$User) {
                GroupCreateActivity.ContactsAddActivityDelegate.CC.$default$needAddBot(this, tLRPC$User);
            }
        });
        presentFragment(groupCreateActivity);
    }

    public void lambda$openAddMember$65(ArrayList arrayList, int i) {
        TLRPC$ChatParticipants tLRPC$ChatParticipants;
        final HashSet hashSet = new HashSet();
        final ArrayList arrayList2 = new ArrayList();
        TLRPC$ChatFull tLRPC$ChatFull = this.chatInfo;
        if (tLRPC$ChatFull != null && (tLRPC$ChatParticipants = tLRPC$ChatFull.participants) != null && tLRPC$ChatParticipants.participants != null) {
            for (int i2 = 0; i2 < this.chatInfo.participants.participants.size(); i2++) {
                hashSet.add(Long.valueOf(this.chatInfo.participants.participants.get(i2).user_id));
            }
        }
        getMessagesController().addUsersToChat(this.currentChat, this, arrayList, i, new androidx.core.util.Consumer() {
            @Override
            public final void accept(Object obj) {
                arrayList2.add((TLRPC$User) obj);
            }
        }, new androidx.core.util.Consumer() {
            @Override
            public final void accept(Object obj) {
                ProfileActivity.this.lambda$openAddMember$63((TLRPC$User) obj);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                ProfileActivity.this.lambda$openAddMember$64(arrayList2, hashSet);
            }
        });
    }

    public void lambda$openAddMember$63(TLRPC$User tLRPC$User) {
        for (int i = 0; i < this.chatInfo.participants.participants.size(); i++) {
            if (this.chatInfo.participants.participants.get(i).user_id == tLRPC$User.id) {
                this.chatInfo.participants.participants.remove(i);
                updateListAnimated(true);
                return;
            }
        }
    }

    public void lambda$openAddMember$64(ArrayList arrayList, HashSet hashSet) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC$User tLRPC$User = (TLRPC$User) arrayList.get(i);
            if (!hashSet.contains(Long.valueOf(tLRPC$User.id))) {
                TLRPC$ChatFull tLRPC$ChatFull = this.chatInfo;
                if (tLRPC$ChatFull.participants == null) {
                    tLRPC$ChatFull.participants = new TLRPC$TL_chatParticipants();
                }
                if (ChatObject.isChannel(this.currentChat)) {
                    TLRPC$TL_chatChannelParticipant tLRPC$TL_chatChannelParticipant = new TLRPC$TL_chatChannelParticipant();
                    TLRPC$TL_channelParticipant tLRPC$TL_channelParticipant = new TLRPC$TL_channelParticipant();
                    tLRPC$TL_chatChannelParticipant.channelParticipant = tLRPC$TL_channelParticipant;
                    tLRPC$TL_channelParticipant.inviter_id = getUserConfig().getClientUserId();
                    tLRPC$TL_chatChannelParticipant.channelParticipant.peer = new TLRPC$TL_peerUser();
                    TLRPC$ChannelParticipant tLRPC$ChannelParticipant = tLRPC$TL_chatChannelParticipant.channelParticipant;
                    tLRPC$ChannelParticipant.peer.user_id = tLRPC$User.id;
                    tLRPC$ChannelParticipant.date = getConnectionsManager().getCurrentTime();
                    tLRPC$TL_chatChannelParticipant.user_id = tLRPC$User.id;
                    this.chatInfo.participants.participants.add(tLRPC$TL_chatChannelParticipant);
                } else {
                    TLRPC$TL_chatParticipant tLRPC$TL_chatParticipant = new TLRPC$TL_chatParticipant();
                    tLRPC$TL_chatParticipant.user_id = tLRPC$User.id;
                    tLRPC$TL_chatParticipant.inviter_id = getAccountInstance().getUserConfig().clientUserId;
                    this.chatInfo.participants.participants.add(tLRPC$TL_chatParticipant);
                }
                this.chatInfo.participants_count++;
                getMessagesController().putUser(tLRPC$User, false);
            }
        }
        updateListAnimated(true);
    }

    public void checkListViewScroll() {
        View view;
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
                view = null;
                break;
            }
            RecyclerListView recyclerListView = this.listView;
            if (recyclerListView.getChildAdapterPosition(recyclerListView.getChildAt(i)) == 0) {
                view = this.listView.getChildAt(i);
                break;
            }
            i++;
        }
        RecyclerListView.Holder holder = view != null ? (RecyclerListView.Holder) this.listView.findContainingViewHolder(view) : null;
        int top = view == null ? 0 : view.getTop();
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
            this.allowProfileAnimation = this.extraHeight != 0.0f;
        }
        needLayout(true);
    }

    @Override
    public void updateSelectedMediaTabText() {
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout == null || this.mediaCounterTextView == null) {
            return;
        }
        int closestTab = sharedMediaLayout.getClosestTab();
        int[] lastMediaCount = this.sharedMediaPreloader.getLastMediaCount();
        if (closestTab == 0) {
            if (lastMediaCount[7] <= 0 && lastMediaCount[6] <= 0) {
                if (lastMediaCount[0] <= 0) {
                    this.mediaCounterTextView.setText(LocaleController.getString(R.string.SharedMedia));
                    return;
                } else {
                    this.mediaCounterTextView.setText(LocaleController.formatPluralString("Media", lastMediaCount[0], new Object[0]));
                    return;
                }
            }
            if (this.sharedMediaLayout.getPhotosVideosTypeFilter() == 1 || lastMediaCount[7] <= 0) {
                this.mediaCounterTextView.setText(LocaleController.formatPluralString("Photos", lastMediaCount[6], new Object[0]));
                return;
            } else if (this.sharedMediaLayout.getPhotosVideosTypeFilter() == 2 || lastMediaCount[6] <= 0) {
                this.mediaCounterTextView.setText(LocaleController.formatPluralString("Videos", lastMediaCount[7], new Object[0]));
                return;
            } else {
                this.mediaCounterTextView.setText(String.format("%s, %s", LocaleController.formatPluralString("Photos", lastMediaCount[6], new Object[0]), LocaleController.formatPluralString("Videos", lastMediaCount[7], new Object[0])));
                return;
            }
        }
        if (closestTab == 1) {
            if (lastMediaCount[1] <= 0) {
                this.mediaCounterTextView.setText(LocaleController.getString(R.string.Files));
                return;
            } else {
                this.mediaCounterTextView.setText(LocaleController.formatPluralString("Files", lastMediaCount[1], new Object[0]));
                return;
            }
        }
        if (closestTab == 2) {
            if (lastMediaCount[2] <= 0) {
                this.mediaCounterTextView.setText(LocaleController.getString(R.string.Voice));
                return;
            } else {
                this.mediaCounterTextView.setText(LocaleController.formatPluralString("Voice", lastMediaCount[2], new Object[0]));
                return;
            }
        }
        if (closestTab == 3) {
            if (lastMediaCount[3] <= 0) {
                this.mediaCounterTextView.setText(LocaleController.getString(R.string.SharedLinks));
                return;
            } else {
                this.mediaCounterTextView.setText(LocaleController.formatPluralString("Links", lastMediaCount[3], new Object[0]));
                return;
            }
        }
        if (closestTab == 4) {
            if (lastMediaCount[4] <= 0) {
                this.mediaCounterTextView.setText(LocaleController.getString(R.string.Music));
                return;
            } else {
                this.mediaCounterTextView.setText(LocaleController.formatPluralString("MusicFiles", lastMediaCount[4], new Object[0]));
                return;
            }
        }
        if (closestTab == 5) {
            if (lastMediaCount[5] <= 0) {
                this.mediaCounterTextView.setText(LocaleController.getString(R.string.AccDescrGIFs));
                return;
            } else {
                this.mediaCounterTextView.setText(LocaleController.formatPluralString("GIFs", lastMediaCount[5], new Object[0]));
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
        if (closestTab == 8) {
            this.mediaCounterTextView.setText(LocaleController.formatPluralString("ProfileStoriesCount", this.sharedMediaLayout.getStoriesCount(closestTab), new Object[0]));
            return;
        }
        if (closestTab == 9) {
            this.mediaCounterTextView.setText(LocaleController.formatPluralString("ProfileStoriesArchiveCount", this.sharedMediaLayout.getStoriesCount(closestTab), new Object[0]));
            return;
        }
        if (closestTab == 10) {
            MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.currentAccount).getChannelRecommendations(this.chatId);
            this.mediaCounterTextView.setText(LocaleController.formatPluralString("Channels", channelRecommendations == null ? 0 : channelRecommendations.chats.size() + channelRecommendations.more, new Object[0]));
        } else if (closestTab == 12) {
            this.mediaCounterTextView.setText(LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, getMessagesController().getSavedMessagesController().getMessagesCount(getDialogId())), new Object[0]));
        }
    }

    public void needLayout(boolean z) {
        OverlaysView overlaysView;
        BackupImageView currentItemView;
        ValueAnimator valueAnimator;
        TLRPC$ChatFull tLRPC$ChatFull;
        int i = 0;
        int currentActionBarHeight = (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + ActionBar.getCurrentActionBarHeight();
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null && !this.openAnimationInProgress) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) recyclerListView.getLayoutParams();
            if (layoutParams.topMargin != currentActionBarHeight) {
                layoutParams.topMargin = currentActionBarHeight;
                this.listView.setLayoutParams(layoutParams);
            }
        }
        if (this.avatarContainer != null) {
            float min = Math.min(1.0f, this.extraHeight / AndroidUtilities.dp(88.0f));
            this.listView.setTopGlowOffset((int) this.extraHeight);
            this.listView.setOverScrollMode((this.extraHeight <= ((float) AndroidUtilities.dp(88.0f)) || this.extraHeight >= ((float) (this.listView.getMeasuredWidth() - currentActionBarHeight))) ? 0 : 2);
            RLottieImageView rLottieImageView = this.writeButton;
            if (rLottieImageView != null) {
                rLottieImageView.setTranslationY(((((this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + ActionBar.getCurrentActionBarHeight()) + this.extraHeight) + this.searchTransitionOffset) - AndroidUtilities.dp(29.5f));
                boolean z2 = min > 0.2f && !this.searchMode && (this.imageUpdater == null || this.setAvatarRow == -1);
                if (z2 && this.chatId != 0) {
                    z2 = (!ChatObject.isChannel(this.currentChat) || this.currentChat.megagroup || (tLRPC$ChatFull = this.chatInfo) == null || tLRPC$ChatFull.linked_chat_id == 0 || this.infoHeaderRow == -1) ? false : true;
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
                                AnonymousClass46() {
                                }

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
                    if (this.qrItem != null) {
                        updateQrItemVisibility(z);
                        if (!z) {
                            float dp = AndroidUtilities.dp(48.0f) * this.qrItem.getAlpha();
                            this.qrItem.setTranslationX(dp);
                            PagerIndicatorView pagerIndicatorView = this.avatarsViewPagerIndicatorView;
                            if (pagerIndicatorView != null) {
                                pagerIndicatorView.setTranslationX(dp - AndroidUtilities.dp(48.0f));
                            }
                        }
                    }
                }
                ProfileStoriesView profileStoriesView = this.storyView;
                if (profileStoriesView != null) {
                    profileStoriesView.setExpandCoords(this.avatarContainer2.getMeasuredWidth() - AndroidUtilities.dp(40.0f), z2, (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + ActionBar.getCurrentActionBarHeight() + this.extraHeight + this.searchTransitionOffset);
                }
            }
            this.avatarX = (-AndroidUtilities.dpf2(47.0f)) * min;
            float f = AndroidUtilities.density;
            this.avatarY = (((this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + ((ActionBar.getCurrentActionBarHeight() / 2.0f) * (min + 1.0f))) - (f * 21.0f)) + (f * 27.0f * min) + this.actionBar.getTranslationY();
            float f2 = this.openAnimationInProgress ? this.initialAnimationExtraHeight : this.extraHeight;
            if (f2 > AndroidUtilities.dp(88.0f) || this.isPulledDown) {
                float max = Math.max(0.0f, Math.min(1.0f, (f2 - AndroidUtilities.dp(88.0f)) / ((this.listView.getMeasuredWidth() - currentActionBarHeight) - AndroidUtilities.dp(88.0f))));
                this.expandProgress = max;
                this.avatarScale = AndroidUtilities.lerp(1.4285715f, 2.4285715f, Math.min(1.0f, max * 3.0f));
                ProfileStoriesView profileStoriesView2 = this.storyView;
                if (profileStoriesView2 != null) {
                    profileStoriesView2.invalidate();
                }
                float min2 = Math.min(AndroidUtilities.dpf2(2000.0f), Math.max(AndroidUtilities.dpf2(1100.0f), Math.abs(this.listViewVelocityY))) / AndroidUtilities.dpf2(1100.0f);
                if (this.allowPullingDown && (this.openingAvatar || this.expandProgress >= 0.33f)) {
                    if (!this.isPulledDown) {
                        if (this.otherItem != null) {
                            if (!getMessagesController().isChatNoForwards(this.currentChat)) {
                                this.otherItem.showSubItem(21);
                            } else {
                                this.otherItem.hideSubItem(21);
                            }
                            if (this.imageUpdater != null) {
                                this.otherItem.showSubItem(36);
                                this.otherItem.showSubItem(34);
                                this.otherItem.showSubItem(35);
                                this.otherItem.hideSubItem(33);
                                this.otherItem.hideSubItem(31);
                            }
                        }
                        ActionBarMenuItem actionBarMenuItem = this.searchItem;
                        if (actionBarMenuItem != null) {
                            actionBarMenuItem.setEnabled(false);
                        }
                        this.isPulledDown = true;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                        this.overlaysView.setOverlaysVisible(true, min2);
                        this.avatarsViewPagerIndicatorView.refreshVisibility(min2);
                        this.avatarsViewPager.setCreateThumbFromParent(true);
                        this.avatarsViewPager.getAdapter().notifyDataSetChanged();
                        this.expandAnimator.cancel();
                        float lerp = AndroidUtilities.lerp(this.expandAnimatorValues, this.currentExpanAnimatorFracture);
                        float[] fArr = this.expandAnimatorValues;
                        fArr[0] = lerp;
                        fArr[1] = 1.0f;
                        ProfileStoriesView profileStoriesView3 = this.storyView;
                        if (profileStoriesView3 != null && !profileStoriesView3.isEmpty()) {
                            this.expandAnimator.setInterpolator(new FastOutSlowInInterpolator());
                            this.expandAnimator.setDuration((((1.0f - lerp) * 1.3f) * 250.0f) / min2);
                        } else {
                            this.expandAnimator.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
                            this.expandAnimator.setDuration(((1.0f - lerp) * 250.0f) / min2);
                        }
                        this.expandAnimator.addListener(new AnimatorListenerAdapter() {
                            AnonymousClass47() {
                            }

                            @Override
                            public void onAnimationStart(Animator animator) {
                                ProfileActivity.this.setForegroundImage(false);
                                ProfileActivity.this.avatarsViewPager.setAnimatedFileMaybe(ProfileActivity.this.avatarImage.getImageReceiver().getAnimation());
                                ProfileActivity.this.avatarsViewPager.resetCurrentItem();
                            }

                            @Override
                            public void onAnimationEnd(Animator animator) {
                                ProfileActivity.this.expandAnimator.removeListener(this);
                                ProfileActivity.this.topView.setBackgroundColor(-16777216);
                                ProfileActivity.this.avatarContainer.setVisibility(8);
                                ProfileActivity.this.avatarsViewPager.setVisibility(0);
                            }
                        });
                        this.expandAnimator.start();
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.avatarsViewPager.getLayoutParams();
                    layoutParams2.width = this.listView.getMeasuredWidth();
                    float f3 = f2 + currentActionBarHeight;
                    layoutParams2.height = (int) f3;
                    this.avatarsViewPager.requestLayout();
                    if (!this.expandAnimator.isRunning()) {
                        float dp2 = (this.openAnimationInProgress && this.playProfileAnimation == 2) ? (-(1.0f - this.avatarAnimationProgress)) * AndroidUtilities.dp(50.0f) : 0.0f;
                        this.onlineX = AndroidUtilities.dpf2(16.0f) - this.onlineTextView[1].getLeft();
                        this.nameTextView[1].setTranslationX(AndroidUtilities.dpf2(18.0f) - this.nameTextView[1].getLeft());
                        this.nameTextView[1].setTranslationY(((f3 - AndroidUtilities.dpf2(38.0f)) - this.nameTextView[1].getBottom()) + dp2);
                        this.onlineTextView[1].setTranslationX(this.onlineX + this.customPhotoOffset);
                        this.onlineTextView[1].setTranslationY(((f3 - AndroidUtilities.dpf2(18.0f)) - this.onlineTextView[1].getBottom()) + dp2);
                        this.mediaCounterTextView.setTranslationX(this.onlineTextView[1].getTranslationX());
                        this.mediaCounterTextView.setTranslationY(this.onlineTextView[1].getTranslationY());
                    }
                } else {
                    if (this.isPulledDown) {
                        this.isPulledDown = false;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
                        ActionBarMenuItem actionBarMenuItem2 = this.otherItem;
                        if (actionBarMenuItem2 != null) {
                            actionBarMenuItem2.hideSubItem(21);
                            if (this.imageUpdater != null) {
                                this.otherItem.hideSubItem(33);
                                this.otherItem.hideSubItem(34);
                                this.otherItem.hideSubItem(35);
                                this.otherItem.showSubItem(36);
                                this.otherItem.showSubItem(31);
                            }
                        }
                        ActionBarMenuItem actionBarMenuItem3 = this.searchItem;
                        if (actionBarMenuItem3 != null) {
                            actionBarMenuItem3.setEnabled(!this.scrolling);
                        }
                        this.overlaysView.setOverlaysVisible(false, min2);
                        this.avatarsViewPagerIndicatorView.refreshVisibility(min2);
                        this.expandAnimator.cancel();
                        this.avatarImage.getImageReceiver().setAllowStartAnimation(true);
                        this.avatarImage.getImageReceiver().startAnimation();
                        float lerp2 = AndroidUtilities.lerp(this.expandAnimatorValues, this.currentExpanAnimatorFracture);
                        float[] fArr2 = this.expandAnimatorValues;
                        fArr2[0] = lerp2;
                        fArr2[1] = 0.0f;
                        this.expandAnimator.setInterpolator(CubicBezierInterpolator.EASE_BOTH);
                        if (!this.isInLandscapeMode) {
                            this.expandAnimator.setDuration((lerp2 * 250.0f) / min2);
                        } else {
                            this.expandAnimator.setDuration(0L);
                        }
                        this.topView.setBackgroundColor(getThemedColor(Theme.key_avatar_backgroundActionBarBlue));
                        if (!this.doNotSetForeground && (currentItemView = this.avatarsViewPager.getCurrentItemView()) != null) {
                            if (currentItemView.getImageReceiver().getDrawable() instanceof VectorAvatarThumbDrawable) {
                                this.avatarImage.drawForeground(false);
                            } else {
                                this.avatarImage.drawForeground(true);
                                this.avatarImage.setForegroundImageDrawable(currentItemView.getImageReceiver().getDrawableSafe());
                            }
                        }
                        this.avatarImage.setForegroundAlpha(1.0f);
                        this.avatarContainer.setVisibility(0);
                        this.avatarsViewPager.setVisibility(8);
                        this.expandAnimator.start();
                    }
                    this.avatarContainer.setScaleX(this.avatarScale);
                    this.avatarContainer.setScaleY(this.avatarScale);
                    ValueAnimator valueAnimator2 = this.expandAnimator;
                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                        refreshNameAndOnlineXY();
                        this.nameTextView[1].setTranslationX(this.nameX);
                        this.nameTextView[1].setTranslationY(this.nameY);
                        this.onlineTextView[1].setTranslationX(this.onlineX + this.customPhotoOffset);
                        this.onlineTextView[1].setTranslationY(this.onlineY);
                        this.mediaCounterTextView.setTranslationX(this.onlineX);
                        this.mediaCounterTextView.setTranslationY(this.onlineY);
                    }
                }
            }
            if (this.openAnimationInProgress && this.playProfileAnimation == 2) {
                float currentActionBarHeight2 = (((this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + (ActionBar.getCurrentActionBarHeight() / 2.0f)) - (AndroidUtilities.density * 21.0f)) + this.actionBar.getTranslationY();
                this.nameTextView[0].setTranslationX(0.0f);
                double d = currentActionBarHeight2;
                this.nameTextView[0].setTranslationY(((float) Math.floor(d)) + AndroidUtilities.dp(1.3f));
                this.onlineTextView[0].setTranslationX(0.0f);
                this.onlineTextView[0].setTranslationY(((float) Math.floor(d)) + AndroidUtilities.dp(24.0f));
                this.nameTextView[0].setScaleX(1.0f);
                this.nameTextView[0].setScaleY(1.0f);
                this.nameTextView[1].setPivotY(r4[1].getMeasuredHeight());
                this.nameTextView[1].setScaleX(1.67f);
                this.nameTextView[1].setScaleY(1.67f);
                this.avatarScale = AndroidUtilities.lerp(1.0f, 2.4285715f, this.avatarAnimationProgress);
                ProfileStoriesView profileStoriesView4 = this.storyView;
                if (profileStoriesView4 != null) {
                    profileStoriesView4.setExpandProgress(1.0f);
                }
                this.avatarImage.setRoundRadius((int) AndroidUtilities.lerp(getSmallAvatarRoundRadius(), 0.0f, this.avatarAnimationProgress));
                this.avatarContainer.setTranslationX(AndroidUtilities.lerp(0.0f, 0.0f, this.avatarAnimationProgress));
                this.avatarContainer.setTranslationY(AndroidUtilities.lerp((float) Math.ceil(d), 0.0f, this.avatarAnimationProgress));
                float measuredWidth = (this.avatarContainer.getMeasuredWidth() - AndroidUtilities.dp(42.0f)) * this.avatarScale;
                this.timeItem.setTranslationX(this.avatarContainer.getX() + AndroidUtilities.dp(16.0f) + measuredWidth);
                this.timeItem.setTranslationY(this.avatarContainer.getY() + AndroidUtilities.dp(15.0f) + measuredWidth);
                this.avatarContainer.setScaleX(this.avatarScale);
                this.avatarContainer.setScaleY(this.avatarScale);
                this.overlaysView.setAlphaValue(this.avatarAnimationProgress, false);
                this.actionBar.setItemsColor(ColorUtils.blendARGB(this.peerColor != null ? -1 : getThemedColor(Theme.key_actionBarDefaultIcon), -1, this.avatarAnimationProgress), false);
                ScamDrawable scamDrawable = this.scamDrawable;
                if (scamDrawable != null) {
                    scamDrawable.setColor(ColorUtils.blendARGB(getThemedColor(Theme.key_avatar_subtitleInProfileBlue), Color.argb(179, 255, 255, 255), this.avatarAnimationProgress));
                }
                Drawable drawable = this.lockIconDrawable;
                if (drawable != null) {
                    drawable.setColorFilter(ColorUtils.blendARGB(getThemedColor(Theme.key_chat_lockIcon), -1, this.avatarAnimationProgress), PorterDuff.Mode.MULTIPLY);
                }
                CrossfadeDrawable[] crossfadeDrawableArr = this.verifiedCrossfadeDrawable;
                if (crossfadeDrawableArr[1] != null) {
                    crossfadeDrawableArr[1].setProgress(this.avatarAnimationProgress);
                    this.nameTextView[1].invalidate();
                }
                CrossfadeDrawable[] crossfadeDrawableArr2 = this.premiumCrossfadeDrawable;
                if (crossfadeDrawableArr2[1] != null) {
                    crossfadeDrawableArr2[1].setProgress(this.avatarAnimationProgress);
                    this.nameTextView[1].invalidate();
                }
                updateEmojiStatusDrawableColor(this.avatarAnimationProgress);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.avatarContainer.getLayoutParams();
                int lerp3 = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(42.0f), (this.extraHeight + currentActionBarHeight) / this.avatarScale, this.avatarAnimationProgress);
                layoutParams3.height = lerp3;
                layoutParams3.width = lerp3;
                layoutParams3.leftMargin = (int) AndroidUtilities.lerp(AndroidUtilities.dpf2(64.0f), 0.0f, this.avatarAnimationProgress);
                this.avatarContainer.requestLayout();
            } else if (this.extraHeight <= AndroidUtilities.dp(88.0f)) {
                this.avatarScale = ((18.0f * min) + 42.0f) / 42.0f;
                ProfileStoriesView profileStoriesView5 = this.storyView;
                if (profileStoriesView5 != null) {
                    profileStoriesView5.invalidate();
                }
                float f4 = (0.12f * min) + 1.0f;
                ValueAnimator valueAnimator3 = this.expandAnimator;
                if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                    this.avatarContainer.setScaleX(this.avatarScale);
                    this.avatarContainer.setScaleY(this.avatarScale);
                    this.avatarContainer.setTranslationX(this.avatarX);
                    this.avatarContainer.setTranslationY((float) Math.ceil(this.avatarY));
                    float dp3 = (AndroidUtilities.dp(42.0f) * this.avatarScale) - AndroidUtilities.dp(42.0f);
                    this.timeItem.setTranslationX(this.avatarContainer.getX() + AndroidUtilities.dp(16.0f) + dp3);
                    this.timeItem.setTranslationY(this.avatarContainer.getY() + AndroidUtilities.dp(15.0f) + dp3);
                }
                this.nameX = AndroidUtilities.density * (-21.0f) * min;
                this.nameY = ((float) Math.floor(this.avatarY)) + AndroidUtilities.dp(1.3f) + (AndroidUtilities.dp(7.0f) * min) + (this.titleAnimationsYDiff * (1.0f - this.avatarAnimationProgress));
                this.onlineX = AndroidUtilities.density * (-21.0f) * min;
                this.onlineY = ((float) Math.floor(this.avatarY)) + AndroidUtilities.dp(24.0f) + (((float) Math.floor(AndroidUtilities.density * 11.0f)) * min);
                ShowDrawable showDrawable = this.showStatusButton;
                if (showDrawable != null) {
                    showDrawable.setAlpha((int) (255.0f * min));
                }
                while (true) {
                    SimpleTextView[] simpleTextViewArr = this.nameTextView;
                    if (i >= simpleTextViewArr.length) {
                        break;
                    }
                    if (simpleTextViewArr[i] != null) {
                        ValueAnimator valueAnimator4 = this.expandAnimator;
                        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                            this.nameTextView[i].setTranslationX(this.nameX);
                            this.nameTextView[i].setTranslationY(this.nameY);
                            this.onlineTextView[i].setTranslationX(this.onlineX + this.customPhotoOffset);
                            this.onlineTextView[i].setTranslationY(this.onlineY);
                            if (i == 1) {
                                this.mediaCounterTextView.setTranslationX(this.onlineX);
                                this.mediaCounterTextView.setTranslationY(this.onlineY);
                            }
                        }
                        this.nameTextView[i].setScaleX(f4);
                        this.nameTextView[i].setScaleY(f4);
                    }
                    i++;
                }
            }
            if (!this.openAnimationInProgress && ((valueAnimator = this.expandAnimator) == null || !valueAnimator.isRunning())) {
                needLayoutText(min);
            }
        }
        if (this.isPulledDown || ((overlaysView = this.overlaysView) != null && overlaysView.animator != null && this.overlaysView.animator.isRunning())) {
            ViewGroup.LayoutParams layoutParams4 = this.overlaysView.getLayoutParams();
            layoutParams4.width = this.listView.getMeasuredWidth();
            layoutParams4.height = (int) (this.extraHeight + currentActionBarHeight);
            this.overlaysView.requestLayout();
        }
        updateEmojiStatusEffectPosition();
    }

    public class AnonymousClass46 extends AnimatorListenerAdapter {
        AnonymousClass46() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (ProfileActivity.this.writeButtonAnimation == null || !ProfileActivity.this.writeButtonAnimation.equals(animator)) {
                return;
            }
            ProfileActivity.this.writeButtonAnimation = null;
        }
    }

    public class AnonymousClass47 extends AnimatorListenerAdapter {
        AnonymousClass47() {
        }

        @Override
        public void onAnimationStart(Animator animator) {
            ProfileActivity.this.setForegroundImage(false);
            ProfileActivity.this.avatarsViewPager.setAnimatedFileMaybe(ProfileActivity.this.avatarImage.getImageReceiver().getAnimation());
            ProfileActivity.this.avatarsViewPager.resetCurrentItem();
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            ProfileActivity.this.expandAnimator.removeListener(this);
            ProfileActivity.this.topView.setBackgroundColor(-16777216);
            ProfileActivity.this.avatarContainer.setVisibility(8);
            ProfileActivity.this.avatarsViewPager.setVisibility(0);
        }
    }

    public void updateQrItemVisibility(boolean z) {
        if (this.qrItem == null) {
            return;
        }
        boolean z2 = isQrNeedVisible() && Math.min(1.0f, this.extraHeight / ((float) AndroidUtilities.dp(88.0f))) > 0.5f && this.searchTransitionProgress > 0.5f;
        if (z) {
            if (z2 != this.isQrItemVisible) {
                this.isQrItemVisible = z2;
                AnimatorSet animatorSet = this.qrItemAnimation;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.qrItemAnimation = null;
                }
                this.qrItem.setClickable(this.isQrItemVisible);
                this.qrItemAnimation = new AnimatorSet();
                if (this.qrItem.getVisibility() != 8 || z2) {
                    this.qrItem.setVisibility(0);
                }
                if (z2) {
                    this.qrItemAnimation.setInterpolator(new DecelerateInterpolator());
                    this.qrItemAnimation.playTogether(ObjectAnimator.ofFloat(this.qrItem, (Property<ActionBarMenuItem, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.qrItem, (Property<ActionBarMenuItem, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.avatarsViewPagerIndicatorView, (Property<PagerIndicatorView, Float>) View.TRANSLATION_X, -AndroidUtilities.dp(48.0f)));
                } else {
                    this.qrItemAnimation.setInterpolator(new AccelerateInterpolator());
                    this.qrItemAnimation.playTogether(ObjectAnimator.ofFloat(this.qrItem, (Property<ActionBarMenuItem, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.qrItem, (Property<ActionBarMenuItem, Float>) View.SCALE_Y, 0.0f), ObjectAnimator.ofFloat(this.avatarsViewPagerIndicatorView, (Property<PagerIndicatorView, Float>) View.TRANSLATION_X, 0.0f));
                }
                this.qrItemAnimation.setDuration(150L);
                this.qrItemAnimation.addListener(new AnimatorListenerAdapter() {
                    AnonymousClass48() {
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ProfileActivity.this.qrItemAnimation = null;
                    }
                });
                this.qrItemAnimation.start();
                return;
            }
            return;
        }
        AnimatorSet animatorSet2 = this.qrItemAnimation;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.qrItemAnimation = null;
        }
        this.isQrItemVisible = z2;
        this.qrItem.setClickable(z2);
        this.qrItem.setAlpha(z2 ? 1.0f : 0.0f);
        this.qrItem.setVisibility(z2 ? 0 : 8);
    }

    public class AnonymousClass48 extends AnimatorListenerAdapter {
        AnonymousClass48() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            ProfileActivity.this.qrItemAnimation = null;
        }
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

    private void refreshNameAndOnlineXY() {
        this.nameX = AndroidUtilities.dp(-21.0f) + (this.avatarContainer.getMeasuredWidth() * (this.avatarScale - 1.4285715f));
        this.nameY = ((float) Math.floor(this.avatarY)) + AndroidUtilities.dp(1.3f) + AndroidUtilities.dp(7.0f) + ((this.avatarContainer.getMeasuredHeight() * (this.avatarScale - 1.4285715f)) / 2.0f);
        this.onlineX = AndroidUtilities.dp(-21.0f) + (this.avatarContainer.getMeasuredWidth() * (this.avatarScale - 1.4285715f));
        this.onlineY = ((float) Math.floor(this.avatarY)) + AndroidUtilities.dp(24.0f) + ((float) Math.floor(AndroidUtilities.density * 11.0f)) + ((this.avatarContainer.getMeasuredHeight() * (this.avatarScale - 1.4285715f)) / 2.0f);
    }

    @Override
    public RecyclerListView getListView() {
        return this.listView;
    }

    public void needLayoutText(float f) {
        float scaleX = this.nameTextView[1].getScaleX();
        float f2 = this.extraHeight > ((float) AndroidUtilities.dp(88.0f)) ? 1.67f : 1.12f;
        if (this.extraHeight <= AndroidUtilities.dp(88.0f) || scaleX == f2) {
            int dp = AndroidUtilities.isTablet() ? AndroidUtilities.dp(490.0f) : AndroidUtilities.displaySize.x;
            this.avatarsViewPagerIndicatorView.getSecondaryMenuItem();
            int i = this.editItemVisible ? 48 : 0;
            if (this.callItemVisible) {
                i += 48;
            }
            if (this.videoCallItemVisible) {
                i += 48;
            }
            if (this.searchItem != null) {
                i += 48;
            }
            int dp2 = AndroidUtilities.dp((i * (1.0f - this.mediaHeaderAnimationProgress)) + 40.0f + 126.0f);
            int i2 = dp - dp2;
            float f3 = dp;
            int max = (int) ((f3 - (dp2 * Math.max(0.0f, 1.0f - (f != 1.0f ? (0.15f * f) / (1.0f - f) : 1.0f)))) - this.nameTextView[1].getTranslationX());
            float measureText = (this.nameTextView[1].getPaint().measureText(this.nameTextView[1].getText().toString()) * scaleX) + this.nameTextView[1].getSideDrawablesSize();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.nameTextView[1].getLayoutParams();
            int i3 = layoutParams.width;
            float f4 = max;
            if (f4 < measureText) {
                layoutParams.width = Math.max(i2, (int) Math.ceil((max - AndroidUtilities.dp(24.0f)) / (((f2 - scaleX) * 7.0f) + scaleX)));
            } else {
                layoutParams.width = (int) Math.ceil(measureText);
            }
            int min = (int) Math.min(((f3 - this.nameTextView[1].getX()) / scaleX) - AndroidUtilities.dp(8.0f), layoutParams.width);
            layoutParams.width = min;
            if (min != i3) {
                this.nameTextView[1].requestLayout();
            }
            float measureText2 = this.onlineTextView[1].getPaint().measureText(this.onlineTextView[1].getText().toString()) + this.onlineTextView[1].getRightDrawableWidth();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.onlineTextView[1].getLayoutParams();
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.mediaCounterTextView.getLayoutParams();
            int i4 = layoutParams2.width;
            int ceil = (int) Math.ceil(this.onlineTextView[1].getTranslationX() + AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(40.0f) * (1.0f - f)));
            layoutParams2.rightMargin = ceil;
            layoutParams3.rightMargin = ceil;
            if (f4 < measureText2) {
                int ceil2 = (int) Math.ceil(max);
                layoutParams2.width = ceil2;
                layoutParams3.width = ceil2;
            } else {
                layoutParams2.width = -2;
                layoutParams3.width = -2;
            }
            if (i4 != layoutParams2.width) {
                this.onlineTextView[2].getLayoutParams().width = layoutParams2.width;
                this.onlineTextView[2].requestLayout();
                this.onlineTextView[3].getLayoutParams().width = layoutParams2.width;
                this.onlineTextView[3].requestLayout();
                this.onlineTextView[1].requestLayout();
                this.mediaCounterTextView.requestLayout();
            }
        }
    }

    private void fixLayout() {
        View view = this.fragmentView;
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            AnonymousClass49() {
            }

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

    public class AnonymousClass49 implements ViewTreeObserver.OnPreDrawListener {
        AnonymousClass49() {
        }

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
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        View findViewByPosition;
        super.onConfigurationChanged(configuration);
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout != null) {
            sharedMediaLayout.onConfigurationChanged(configuration);
        }
        invalidateIsInLandscapeMode();
        if (this.isInLandscapeMode && this.isPulledDown && (findViewByPosition = this.layoutManager.findViewByPosition(0)) != null) {
            this.listView.scrollBy(0, findViewByPosition.getTop() - AndroidUtilities.dp(88.0f));
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
        TLRPC$ChatFull tLRPC$ChatFull;
        TLRPC$ChatFull tLRPC$ChatFull2;
        TLRPC$TL_inputGroupCall tLRPC$TL_inputGroupCall;
        TLRPC$Chat tLRPC$Chat;
        RecyclerListView recyclerListView;
        RecyclerListView recyclerListView2;
        RecyclerListView.Holder holder;
        if (i == NotificationCenter.uploadStoryEnd || i == NotificationCenter.chatWasBoostedByUser) {
            checkCanSendStoryForPosting();
            return;
        }
        r2 = 0;
        char c = 0;
        if (i == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            boolean z = ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (MessagesController.UPDATE_MASK_NAME & intValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & intValue) == 0 && (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) == 0) ? false : true;
            if (this.userId != 0) {
                if (z) {
                    updateProfileData(true);
                }
                if ((intValue & MessagesController.UPDATE_MASK_PHONE) == 0 || (recyclerListView2 = this.listView) == null || (holder = (RecyclerListView.Holder) recyclerListView2.findViewHolderForPosition(this.phoneRow)) == null) {
                    return;
                }
                this.listAdapter.onBindViewHolder(holder, this.phoneRow);
                return;
            }
            if (this.chatId != 0) {
                if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                    if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0) {
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
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = this.listView.getChildAt(i3);
                    if (childAt instanceof UserCell) {
                        ((UserCell) childAt).update(intValue);
                    }
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.chatOnlineCountDidLoad) {
            Long l = (Long) objArr[0];
            if (this.chatInfo == null || (tLRPC$Chat = this.currentChat) == null || tLRPC$Chat.id != l.longValue()) {
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
                        ProfileActivity.this.lambda$didReceivedNotification$66(objArr);
                    }
                });
                return;
            }
            return;
        }
        if (i == NotificationCenter.encryptedChatUpdated) {
            TLRPC$EncryptedChat tLRPC$EncryptedChat = (TLRPC$EncryptedChat) objArr[0];
            TLRPC$EncryptedChat tLRPC$EncryptedChat2 = this.currentEncryptedChat;
            if (tLRPC$EncryptedChat2 == null || tLRPC$EncryptedChat.id != tLRPC$EncryptedChat2.id) {
                return;
            }
            this.currentEncryptedChat = tLRPC$EncryptedChat;
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
                long longValue = l2.longValue();
                TLRPC$Chat tLRPC$Chat2 = this.currentChat;
                if (longValue == tLRPC$Chat2.id && ChatObject.canManageCalls(tLRPC$Chat2)) {
                    TLRPC$ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(l2.longValue());
                    if (chatFull != null) {
                        TLRPC$ChatFull tLRPC$ChatFull3 = this.chatInfo;
                        if (tLRPC$ChatFull3 != null) {
                            chatFull.participants = tLRPC$ChatFull3.participants;
                        }
                        this.chatInfo = chatFull;
                    }
                    SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
                    if (sharedMediaLayout != null) {
                        sharedMediaLayout.setChatInfo(this.chatInfo);
                    }
                    TLRPC$ChatFull tLRPC$ChatFull4 = this.chatInfo;
                    if (tLRPC$ChatFull4 != null && (((tLRPC$TL_inputGroupCall = tLRPC$ChatFull4.call) == null && !this.hasVoiceChatItem) || (tLRPC$TL_inputGroupCall != null && this.hasVoiceChatItem))) {
                        createActionBarMenu(false);
                    }
                    ProfileStoriesView profileStoriesView = this.storyView;
                    if (profileStoriesView != null && (tLRPC$ChatFull2 = this.chatInfo) != null) {
                        profileStoriesView.setStories(tLRPC$ChatFull2.stories);
                    }
                    AvatarImageView avatarImageView = this.avatarImage;
                    if (avatarImageView != null) {
                        avatarImageView.setHasStories(needInsetForStories());
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC$ChatFull tLRPC$ChatFull5 = (TLRPC$ChatFull) objArr[0];
            if (tLRPC$ChatFull5.id == this.chatId) {
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                TLRPC$ChatFull tLRPC$ChatFull6 = this.chatInfo;
                if ((tLRPC$ChatFull6 instanceof TLRPC$TL_channelFull) && tLRPC$ChatFull5.participants == null) {
                    tLRPC$ChatFull5.participants = tLRPC$ChatFull6.participants;
                }
                if (tLRPC$ChatFull6 == null && (tLRPC$ChatFull5 instanceof TLRPC$TL_channelFull)) {
                    c = 1;
                }
                this.chatInfo = tLRPC$ChatFull5;
                if (this.mergeDialogId == 0) {
                    long j = tLRPC$ChatFull5.migrated_from_chat_id;
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
                TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
                if (chat != null) {
                    this.currentChat = chat;
                    createActionBarMenu(true);
                }
                FlagSecureReason flagSecureReason2 = this.flagSecure;
                if (flagSecureReason2 != null) {
                    flagSecureReason2.invalidate();
                }
                if (this.currentChat.megagroup && (c != 0 || !booleanValue)) {
                    getChannelParticipants(true);
                }
                updateAutoDeleteItem();
                updateTtlIcon();
                ProfileStoriesView profileStoriesView2 = this.storyView;
                if (profileStoriesView2 != null && (tLRPC$ChatFull = this.chatInfo) != null) {
                    profileStoriesView2.setStories(tLRPC$ChatFull.stories);
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
        if (i == NotificationCenter.botInfoDidLoad) {
            TLRPC$BotInfo tLRPC$BotInfo = (TLRPC$BotInfo) objArr[0];
            if (tLRPC$BotInfo.user_id == this.userId) {
                this.botInfo = tLRPC$BotInfo;
                updateListAnimated(false);
                return;
            }
            return;
        }
        if (i == NotificationCenter.userInfoDidLoad) {
            if (((Long) objArr[0]).longValue() == this.userId) {
                TLRPC$UserFull tLRPC$UserFull = (TLRPC$UserFull) objArr[1];
                this.userInfo = tLRPC$UserFull;
                ProfileStoriesView profileStoriesView3 = this.storyView;
                if (profileStoriesView3 != null) {
                    profileStoriesView3.setStories(tLRPC$UserFull.stories);
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
                    if (!this.openAnimationInProgress && !this.callItemVisible) {
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
                            ProfileActivity.this.lambda$didReceivedNotification$67();
                        }
                    });
                    this.profileChannelMessageFetcher.fetch(this.userInfo);
                }
                if (isSettings()) {
                    return;
                }
                ProfileBirthdayEffect.BirthdayEffectFetcher birthdayEffectFetcher = this.birthdayFetcher;
                ProfileBirthdayEffect.BirthdayEffectFetcher of = ProfileBirthdayEffect.BirthdayEffectFetcher.of(this.currentAccount, this.userInfo, birthdayEffectFetcher);
                this.birthdayFetcher = of;
                this.createdBirthdayFetcher = of != birthdayEffectFetcher;
                if (of != null) {
                    of.subscribe(new ProfileActivity$$ExternalSyntheticLambda50(this));
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.privacyRulesUpdated) {
            if (this.qrItem != null) {
                updateQrItemVisibility(true);
                return;
            }
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
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i4);
                    if (this.currentEncryptedChat != null) {
                        TLRPC$MessageAction tLRPC$MessageAction = messageObject.messageOwner.action;
                        if (tLRPC$MessageAction instanceof TLRPC$TL_messageEncryptedAction) {
                            TLRPC$DecryptedMessageAction tLRPC$DecryptedMessageAction = tLRPC$MessageAction.encryptedAction;
                            if (tLRPC$DecryptedMessageAction instanceof TLRPC$TL_decryptedMessageActionSetMessageTTL) {
                                ListAdapter listAdapter = this.listAdapter;
                                if (listAdapter != null) {
                                    listAdapter.notifyDataSetChanged();
                                }
                            }
                        }
                    }
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
            int i5 = this.passwordSuggestionRow;
            int i6 = this.phoneSuggestionRow;
            updateRowsIds();
            if (i5 == this.passwordSuggestionRow && i6 == this.phoneSuggestionRow) {
                return;
            }
            this.listAdapter.notifyDataSetChanged();
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
                searchAdapter.searchArray = searchAdapter.onCreateSearchArray();
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
            TLRPC$UserFull tLRPC$UserFull2 = this.userInfo;
            if (tLRPC$UserFull2 != null) {
                this.storyView.setStories(tLRPC$UserFull2.stories);
                return;
            }
            TLRPC$ChatFull tLRPC$ChatFull7 = this.chatInfo;
            if (tLRPC$ChatFull7 != null) {
                this.storyView.setStories(tLRPC$ChatFull7.stories);
                return;
            }
            return;
        }
        if (i == NotificationCenter.userIsPremiumBlockedUpadted) {
            ActionBarMenuItem actionBarMenuItem = this.otherItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setSubItemShown(20, !getMessagesController().isUserPremiumBlocked(this.userId));
            }
            updateEditColorIcon();
            return;
        }
        if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            updateEditColorIcon();
        } else if (i == NotificationCenter.starBalanceUpdated) {
            updateListAnimated(false);
        }
    }

    public void lambda$didReceivedNotification$66(Object[] objArr) {
        NotificationCenter notificationCenter = getNotificationCenter();
        int i = NotificationCenter.closeChats;
        notificationCenter.removeObserver(this, i);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i, new Object[0]);
        TLRPC$EncryptedChat tLRPC$EncryptedChat = (TLRPC$EncryptedChat) objArr[0];
        Bundle bundle = new Bundle();
        bundle.putInt("enc_id", tLRPC$EncryptedChat.id);
        presentFragment(new ChatActivity(bundle), true);
    }

    public void lambda$didReceivedNotification$67() {
        updateListAnimated(false);
    }

    private void updateAutoDeleteItem() {
        if (this.autoDeleteItem == null || this.autoDeletePopupWrapper == null) {
            return;
        }
        int i = 0;
        TLRPC$UserFull tLRPC$UserFull = this.userInfo;
        if (tLRPC$UserFull != null || this.chatInfo != null) {
            i = tLRPC$UserFull != null ? tLRPC$UserFull.ttl_period : this.chatInfo.ttl_period;
        }
        this.autoDeleteItemDrawable.setTime(i);
        this.autoDeletePopupWrapper.lambda$updateItems$7(i);
    }

    private void updateTimeItem() {
        TimerDrawable timerDrawable = this.timerDrawable;
        if (timerDrawable == null) {
            return;
        }
        TLRPC$EncryptedChat tLRPC$EncryptedChat = this.currentEncryptedChat;
        if (tLRPC$EncryptedChat != null) {
            timerDrawable.setTime(tLRPC$EncryptedChat.ttl);
            this.timeItem.setTag(1);
            this.timeItem.setVisibility(0);
            return;
        }
        TLRPC$UserFull tLRPC$UserFull = this.userInfo;
        if (tLRPC$UserFull != null) {
            timerDrawable.setTime(tLRPC$UserFull.ttl_period);
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
        TLRPC$ChatFull tLRPC$ChatFull = this.chatInfo;
        if (tLRPC$ChatFull != null) {
            timerDrawable.setTime(tLRPC$ChatFull.ttl_period);
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
        TLRPC$User user;
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
            setParentActivityTitle(LocaleController.getString("Settings", R.string.Settings));
        }
        updateProfileData(true);
        fixLayout();
        SimpleTextView[] simpleTextViewArr = this.nameTextView;
        if (simpleTextViewArr[1] != null) {
            setParentActivityTitle(simpleTextViewArr[1].getText());
        }
        if (this.userId != 0 && (user = getMessagesController().getUser(Long.valueOf(this.userId))) != null && user.photo == null && this.extraHeight >= AndroidUtilities.dp(88.0f)) {
            this.expandAnimator.cancel();
            float[] fArr = this.expandAnimatorValues;
            fArr[0] = 1.0f;
            fArr[1] = 0.0f;
            setAvatarExpandProgress(1.0f);
            this.avatarsViewPager.setVisibility(8);
            this.extraHeight = AndroidUtilities.dp(88.0f);
            this.allowPullingDown = false;
            this.layoutManager.scrollToPositionWithOffset(0, AndroidUtilities.dp(88.0f) - this.listView.getPaddingTop());
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
        if (this.rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight())) {
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

    @Override
    public boolean onBackPressed() {
        SharedMediaLayout sharedMediaLayout;
        if (!closeSheet() && this.actionBar.isEnabled()) {
            return this.sharedMediaRow == -1 || (sharedMediaLayout = this.sharedMediaLayout) == null || !sharedMediaLayout.closeActionMode();
        }
        return false;
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
        super.onTransitionAnimationStart(z, z2);
        this.isFragmentOpened = z;
        if (((!z && z2) || (z && !z2)) && this.playProfileAnimation != 0 && this.allowProfileAnimation && !this.isPulledDown) {
            this.openAnimationInProgress = true;
        }
        if (z) {
            if (this.imageUpdater != null) {
                this.transitionIndex = getNotificationCenter().setAnimationInProgress(this.transitionIndex, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaCountsDidLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.needCheckSystemBarColors});
            } else {
                this.transitionIndex = getNotificationCenter().setAnimationInProgress(this.transitionIndex, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaCountsDidLoad, NotificationCenter.needCheckSystemBarColors});
            }
            if (Build.VERSION.SDK_INT >= 21 && !z2 && getParentActivity() != null) {
                this.navigationBarAnimationColorFrom = getParentActivity().getWindow().getNavigationBarColor();
            }
        }
        this.transitionAnimationInProress = true;
        checkPhotoDescriptionAlpha();
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            if (!z2) {
                int i = this.playProfileAnimation;
                if (i != 0 && this.allowProfileAnimation) {
                    if (i == 1) {
                        this.currentExpandAnimatorValue = 0.0f;
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

    @Keep
    public float getAvatarAnimationProgress() {
        return this.avatarAnimationProgress;
    }

    @Keep
    public void setAvatarAnimationProgress(float f) {
        int profileBackColorForId;
        int profileTextColorForId;
        this.currentExpandAnimatorValue = f;
        this.avatarAnimationProgress = f;
        checkPhotoDescriptionAlpha();
        if (this.playProfileAnimation == 2) {
            this.avatarImage.setProgressToExpand(f);
        }
        this.listView.setAlpha(f);
        this.listView.setTranslationX(AndroidUtilities.dp(48.0f) - (AndroidUtilities.dp(48.0f) * f));
        long j = 5;
        if (this.playProfileAnimation != 2 || (profileBackColorForId = this.avatarColor) == 0) {
            profileBackColorForId = AvatarDrawable.getProfileBackColorForId((this.userId != 0 || (ChatObject.isChannel(this.chatId, this.currentAccount) && !this.currentChat.megagroup)) ? 5L : this.chatId, this.resourcesProvider);
        }
        int i = this.actionBarAnimationColorFrom;
        if (i == 0) {
            i = getThemedColor(Theme.key_actionBarDefault);
        }
        this.topView.setBackgroundColor(ColorUtils.blendARGB(SharedConfig.chatBlurEnabled() ? ColorUtils.setAlphaComponent(i, 0) : i, profileBackColorForId, f));
        this.timerDrawable.setBackgroundColor(ColorUtils.blendARGB(i, profileBackColorForId, f));
        this.actionBar.setItemsColor(ColorUtils.blendARGB(this.peerColor != null ? -1 : getThemedColor(Theme.key_actionBarDefaultIcon), AvatarDrawable.getIconColorForId((this.userId != 0 || (ChatObject.isChannel(this.chatId, this.currentAccount) && !this.currentChat.megagroup)) ? 5L : this.chatId, this.resourcesProvider), this.avatarAnimationProgress), false);
        int themedColor = getThemedColor(Theme.key_profile_title);
        int themedColor2 = getThemedColor(Theme.key_actionBarDefaultTitle);
        for (int i2 = 0; i2 < 2; i2++) {
            SimpleTextView[] simpleTextViewArr = this.nameTextView;
            if (simpleTextViewArr[i2] != null && (i2 != 1 || this.playProfileAnimation != 2)) {
                simpleTextViewArr[i2].setTextColor(ColorUtils.blendARGB(themedColor2, themedColor, f));
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
        int themedColor3 = getThemedColor(this.isOnline[0] ? Theme.key_chat_status : Theme.key_actionBarDefaultSubtitle);
        int i3 = 0;
        while (i3 < 3) {
            SimpleTextView[] simpleTextViewArr2 = this.onlineTextView;
            if (simpleTextViewArr2[i3] != null && i3 != 1 && (i3 != 2 || this.playProfileAnimation != 2)) {
                simpleTextViewArr2[i3].setTextColor(ColorUtils.blendARGB(i3 == 0 ? themedColor3 : applyPeerColor(themedColor3, true, Boolean.valueOf(this.isOnline[0])), i3 == 0 ? profileTextColorForId : applyPeerColor(profileTextColorForId, true, Boolean.valueOf(this.isOnline[0])), f));
            }
            i3++;
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
        int i4 = this.navigationBarAnimationColorFrom;
        if (i4 != 0) {
            setNavigationBarColor(ColorUtils.blendARGB(i4, getNavigationBarColor(), f));
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
        }
    }

    @Override
    public android.animation.AnimatorSet onCustomTransitionAnimation(boolean r18, java.lang.Runnable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.onCustomTransitionAnimation(boolean, java.lang.Runnable):android.animation.AnimatorSet");
    }

    public void lambda$onCustomTransitionAnimation$68(ValueAnimator valueAnimator) {
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        updateStoriesViewBounds(true);
    }

    class AnonymousClass50 extends AnimatorListenerAdapter {
        final Runnable val$callback;

        AnonymousClass50(Runnable runnable) {
            r2 = runnable;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            ProfileActivity profileActivity = ProfileActivity.this;
            if (profileActivity.fragmentView != null) {
                profileActivity.avatarImage.setProgressToExpand(0.0f);
                ProfileActivity.this.listView.setLayerType(0, null);
                if (ProfileActivity.this.animatingItem != null) {
                    ((BaseFragment) ProfileActivity.this).actionBar.createMenu().clearItems();
                    ProfileActivity.this.animatingItem = null;
                }
                r2.run();
                if (ProfileActivity.this.playProfileAnimation == 2) {
                    ProfileActivity.this.playProfileAnimation = 1;
                    ProfileActivity.this.avatarImage.setForegroundAlpha(1.0f);
                    ProfileActivity.this.avatarContainer.setVisibility(8);
                    ProfileActivity.this.avatarsViewPager.resetCurrentItem();
                    ProfileActivity.this.avatarsViewPager.setVisibility(0);
                }
                ProfileActivity.this.transitionOnlineText = null;
                ProfileActivity.this.avatarContainer2.invalidate();
                ProfileActivity profileActivity2 = ProfileActivity.this;
                profileActivity2.profileTransitionInProgress = false;
                profileActivity2.previousTransitionFragment = null;
                profileActivity2.fragmentView.invalidate();
                return;
            }
            r2.run();
        }
    }

    public int getAverageColor(ImageReceiver imageReceiver) {
        if (imageReceiver.getDrawable() instanceof VectorAvatarThumbDrawable) {
            return ((VectorAvatarThumbDrawable) imageReceiver.getDrawable()).gradientTools.getAverageColor();
        }
        return AndroidUtilities.calcBitmapColor(this.avatarImage.getImageReceiver().getBitmap());
    }

    public void updateOnlineCount(boolean z) {
        TLRPC$UserStatus tLRPC$UserStatus;
        this.onlineCount = 0;
        final int currentTime = getConnectionsManager().getCurrentTime();
        this.sortedUsers.clear();
        TLRPC$ChatFull tLRPC$ChatFull = this.chatInfo;
        if ((tLRPC$ChatFull instanceof TLRPC$TL_chatFull) || ((tLRPC$ChatFull instanceof TLRPC$TL_channelFull) && tLRPC$ChatFull.participants_count <= 200 && tLRPC$ChatFull.participants != null)) {
            for (int i = 0; i < this.chatInfo.participants.participants.size(); i++) {
                TLRPC$User user = getMessagesController().getUser(Long.valueOf(this.chatInfo.participants.participants.get(i).user_id));
                if (user != null && (tLRPC$UserStatus = user.status) != null && ((tLRPC$UserStatus.expires > currentTime || user.id == getUserConfig().getClientUserId()) && user.status.expires > 10000)) {
                    this.onlineCount++;
                }
                this.sortedUsers.add(Integer.valueOf(i));
            }
            try {
                Collections.sort(this.sortedUsers, Comparator$EL.reversed(Comparator$CC.comparingInt(new ToIntFunction() {
                    @Override
                    public final int applyAsInt(Object obj) {
                        int lambda$updateOnlineCount$69;
                        lambda$updateOnlineCount$69 = ProfileActivity.this.lambda$updateOnlineCount$69(currentTime, obj);
                        return lambda$updateOnlineCount$69;
                    }
                })));
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (z && this.listAdapter != null && this.membersStartRow > 0) {
                AndroidUtilities.updateVisibleRows(this.listView);
            }
            if (this.sharedMediaLayout == null || this.sharedMediaRow == -1) {
                return;
            }
            if ((this.sortedUsers.size() > 5 || this.usersForceShowingIn == 2) && this.usersForceShowingIn != 1) {
                this.sharedMediaLayout.setChatUsers(this.sortedUsers, this.chatInfo);
                return;
            }
            return;
        }
        if (!(tLRPC$ChatFull instanceof TLRPC$TL_channelFull) || tLRPC$ChatFull.participants_count <= 200) {
            return;
        }
        this.onlineCount = tLRPC$ChatFull.online_count;
    }

    public int lambda$updateOnlineCount$69(int i, Object obj) {
        TLRPC$User user = getMessagesController().getUser(Long.valueOf(this.chatInfo.participants.participants.get(((Integer) obj).intValue()).user_id));
        if (user == null) {
            return Integer.MIN_VALUE;
        }
        if (user.bot) {
            return -110;
        }
        if (user.self) {
            return i + 50000;
        }
        TLRPC$UserStatus tLRPC$UserStatus = user.status;
        if (tLRPC$UserStatus != null) {
            return tLRPC$UserStatus.expires;
        }
        return Integer.MIN_VALUE;
    }

    public void setChatInfo(TLRPC$ChatFull tLRPC$ChatFull) {
        TLRPC$ChatFull tLRPC$ChatFull2;
        this.chatInfo = tLRPC$ChatFull;
        if (tLRPC$ChatFull != null) {
            long j = tLRPC$ChatFull.migrated_from_chat_id;
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
        if (profileStoriesView != null && (tLRPC$ChatFull2 = this.chatInfo) != null) {
            profileStoriesView.setStories(tLRPC$ChatFull2.stories);
        }
        AvatarImageView avatarImageView = this.avatarImage;
        if (avatarImageView != null) {
            avatarImageView.setHasStories(needInsetForStories());
        }
        fetchUsersFromChannelInfo();
    }

    public boolean needInsetForStories() {
        return getMessagesController().getStoriesController().hasStories(getDialogId()) && !this.isTopic;
    }

    public void setUserInfo(TLRPC$UserFull tLRPC$UserFull, ProfileChannelCell.ChannelMessageFetcher channelMessageFetcher, ProfileBirthdayEffect.BirthdayEffectFetcher birthdayEffectFetcher) {
        this.userInfo = tLRPC$UserFull;
        ProfileStoriesView profileStoriesView = this.storyView;
        if (profileStoriesView != null) {
            profileStoriesView.setStories(tLRPC$UserFull.stories);
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
                ProfileActivity.this.lambda$setUserInfo$70();
            }
        });
        this.profileChannelMessageFetcher.fetch(this.userInfo);
        if (this.birthdayFetcher == null) {
            this.birthdayFetcher = birthdayEffectFetcher;
        }
        ProfileBirthdayEffect.BirthdayEffectFetcher birthdayEffectFetcher2 = this.birthdayFetcher;
        if (birthdayEffectFetcher2 == null) {
            ProfileBirthdayEffect.BirthdayEffectFetcher of = ProfileBirthdayEffect.BirthdayEffectFetcher.of(this.currentAccount, this.userInfo, birthdayEffectFetcher2);
            this.birthdayFetcher = of;
            this.createdBirthdayFetcher = of != null;
        }
        ProfileBirthdayEffect.BirthdayEffectFetcher birthdayEffectFetcher3 = this.birthdayFetcher;
        if (birthdayEffectFetcher3 != null) {
            birthdayEffectFetcher3.subscribe(new ProfileActivity$$ExternalSyntheticLambda50(this));
        }
        ActionBarMenuItem actionBarMenuItem = this.otherItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setSubItemShown(20, true ^ getMessagesController().isUserPremiumBlocked(this.userId));
        }
    }

    public void lambda$setUserInfo$70() {
        updateListAnimated(false);
    }

    @Override
    public boolean canSearchMembers() {
        return this.canSearchMembers;
    }

    private void fetchUsersFromChannelInfo() {
        TLRPC$Chat tLRPC$Chat = this.currentChat;
        if (tLRPC$Chat == null || !tLRPC$Chat.megagroup) {
            return;
        }
        TLRPC$ChatFull tLRPC$ChatFull = this.chatInfo;
        if (!(tLRPC$ChatFull instanceof TLRPC$TL_channelFull) || tLRPC$ChatFull.participants == null) {
            return;
        }
        for (int i = 0; i < this.chatInfo.participants.participants.size(); i++) {
            TLRPC$ChatParticipant tLRPC$ChatParticipant = this.chatInfo.participants.participants.get(i);
            this.participantsMap.put(tLRPC$ChatParticipant.user_id, tLRPC$ChatParticipant);
        }
    }

    private void kickUser(long j, TLRPC$ChatParticipant tLRPC$ChatParticipant) {
        if (j != 0) {
            TLRPC$User user = getMessagesController().getUser(Long.valueOf(j));
            getMessagesController().deleteParticipantFromChat(this.chatId, user);
            if (this.currentChat != null && user != null && BulletinFactory.canShowBulletin(this)) {
                BulletinFactory.createRemoveFromChatBulletin(this, user, this.currentChat.title).show();
            }
            if (this.chatInfo.participants.participants.remove(tLRPC$ChatParticipant)) {
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
        lambda$onBackPressed$305();
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
                this.verifiedDrawable[1].setColorFilter(AndroidUtilities.getOffsetColor(Theme.adaptHSV(peerColor.hasColor6(Theme.isCurrentThemeDark()) ? this.peerColor.getColor5() : this.peerColor.getColor3(), 0.1f, Theme.isCurrentThemeDark() ? -0.1f : -0.08f), getThemedColor(Theme.key_player_actionBarTitle), this.mediaHeaderAnimationProgress, 1.0f), PorterDuff.Mode.MULTIPLY);
                this.verifiedCheckDrawable[1].setColorFilter(AndroidUtilities.getOffsetColor(-1, getThemedColor(Theme.key_windowBackgroundWhite), this.mediaHeaderAnimationProgress, 1.0f), PorterDuff.Mode.MULTIPLY);
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
                themedColor = applyPeerColor(themedColor);
            }
            this.premiumStarDrawable[i].setColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
            this.premiumCrossfadeDrawable[i] = new CrossfadeDrawable(this.premiumStarDrawable[i], ContextCompat.getDrawable(getParentActivity(), R.drawable.msg_premium_prolfilestar).mutate());
        }
        return this.premiumCrossfadeDrawable[i];
    }

    private Drawable getEmojiStatusDrawable(TLRPC$EmojiStatus tLRPC$EmojiStatus, boolean z, boolean z2, int i) {
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[] swapAnimatedEmojiDrawableArr = this.emojiStatusDrawable;
        if (swapAnimatedEmojiDrawableArr[i] == null) {
            swapAnimatedEmojiDrawableArr[i] = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this.nameTextView[i], AndroidUtilities.dp(24.0f), i == 0 ? 7 : 2);
            if (this.fragmentViewAttached) {
                this.emojiStatusDrawable[i].attach();
            }
        }
        if (tLRPC$EmojiStatus instanceof TLRPC$TL_emojiStatus) {
            this.emojiStatusDrawable[i].set(((TLRPC$TL_emojiStatus) tLRPC$EmojiStatus).document_id, z2);
        } else {
            if (tLRPC$EmojiStatus instanceof TLRPC$TL_emojiStatusUntil) {
                TLRPC$TL_emojiStatusUntil tLRPC$TL_emojiStatusUntil = (TLRPC$TL_emojiStatusUntil) tLRPC$EmojiStatus;
                if (tLRPC$TL_emojiStatusUntil.until > ((int) (System.currentTimeMillis() / 1000)) && !this.reportSpam) {
                    this.emojiStatusDrawable[i].set(tLRPC$TL_emojiStatusUntil.document_id, z2);
                }
            }
            this.emojiStatusDrawable[i].set(getPremiumCrossfadeDrawable(i), z2);
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
                offsetColor = ColorUtils.blendARGB(peerColor.getColor2(), this.peerColor.hasColor6(Theme.isCurrentThemeDark()) ? this.peerColor.getColor5() : this.peerColor.getColor3(), 0.5f);
            } else {
                offsetColor = AndroidUtilities.getOffsetColor(getThemedColor(Theme.key_profile_verifiedBackground), getThemedColor(Theme.key_player_actionBarTitle), this.mediaHeaderAnimationProgress, 1.0f);
            }
            int blendARGB = ColorUtils.blendARGB(ColorUtils.blendARGB(offsetColor, -1, f), getThemedColor(Theme.key_player_actionBarTitle), this.mediaHeaderAnimationProgress);
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[] swapAnimatedEmojiDrawableArr = this.emojiStatusDrawable;
            if (swapAnimatedEmojiDrawableArr[i] != null) {
                swapAnimatedEmojiDrawableArr[i].setColor(Integer.valueOf(blendARGB));
            }
            if (i == 1) {
                this.animatedStatusView.setColor(blendARGB);
            }
        }
        this.lastEmojiStatusProgress = f;
    }

    public void updateEmojiStatusEffectPosition() {
        this.animatedStatusView.setScaleX(this.nameTextView[1].getScaleX());
        this.animatedStatusView.setScaleY(this.nameTextView[1].getScaleY());
        this.animatedStatusView.translate(this.nameTextView[1].getX() + (this.nameTextView[1].getRightDrawableX() * this.nameTextView[1].getScaleX()), this.nameTextView[1].getY() + (this.nameTextView[1].getHeight() - ((this.nameTextView[1].getHeight() - this.nameTextView[1].getRightDrawableY()) * this.nameTextView[1].getScaleY())));
    }

    public void updateProfileData(boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.updateProfileData(boolean):void");
    }

    public void lambda$updateProfileData$72(View view) {
        MessagePrivateSeenView.showSheet(getContext(), this.currentAccount, this.dialogId, true, null, new Runnable() {
            @Override
            public final void run() {
                ProfileActivity.this.lambda$updateProfileData$71();
            }
        }, this.resourcesProvider);
    }

    public void lambda$updateProfileData$71() {
        getMessagesController().reloadUser(this.dialogId);
    }

    public void lambda$updateProfileData$73(View view) {
        showStatusSelect();
    }

    public void lambda$updateProfileData$74(TLRPC$User tLRPC$User, SimpleTextView simpleTextView, View view) {
        ImageLocation forDocument;
        PremiumPreviewBottomSheet premiumPreviewBottomSheet = new PremiumPreviewBottomSheet(this, this.currentAccount, tLRPC$User, this.resourcesProvider);
        simpleTextView.getLocationOnScreen(new int[2]);
        premiumPreviewBottomSheet.startEnterFromX = simpleTextView.rightDrawableX;
        premiumPreviewBottomSheet.startEnterFromY = simpleTextView.rightDrawableY;
        premiumPreviewBottomSheet.startEnterFromScale = simpleTextView.getScaleX();
        premiumPreviewBottomSheet.startEnterFromX1 = simpleTextView.getLeft();
        premiumPreviewBottomSheet.startEnterFromY1 = simpleTextView.getTop();
        premiumPreviewBottomSheet.startEnterFromView = simpleTextView;
        Drawable rightDrawable = simpleTextView.getRightDrawable();
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable[] swapAnimatedEmojiDrawableArr = this.emojiStatusDrawable;
        if (rightDrawable == swapAnimatedEmojiDrawableArr[1] && swapAnimatedEmojiDrawableArr[1] != null && (swapAnimatedEmojiDrawableArr[1].getDrawable() instanceof AnimatedEmojiDrawable)) {
            premiumPreviewBottomSheet.startEnterFromScale *= 0.98f;
            TLRPC$Document document = ((AnimatedEmojiDrawable) this.emojiStatusDrawable[1].getDrawable()).getDocument();
            if (document != null) {
                BackupImageView backupImageView = new BackupImageView(getContext());
                String str = "160_160";
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, Theme.key_windowBackgroundWhiteGrayIcon, 0.2f);
                TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                if ("video/webm".equals(document.mime_type)) {
                    forDocument = ImageLocation.getForDocument(document);
                    str = "160_160_" + ImageLoader.AUTOPLAY_FILTER;
                    if (svgThumb != null) {
                        svgThumb.overrideWidthAndHeight(LiteMode.FLAG_CALLS_ANIMATIONS, LiteMode.FLAG_CALLS_ANIMATIONS);
                    }
                } else {
                    if (svgThumb != null && MessageObject.isAnimatedStickerDocument(document, false)) {
                        svgThumb.overrideWidthAndHeight(LiteMode.FLAG_CALLS_ANIMATIONS, LiteMode.FLAG_CALLS_ANIMATIONS);
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

    public void lambda$updateProfileData$75(View view) {
        showStatusSelect();
    }

    public void lambda$updateProfileData$76(View view) {
        goToForum();
    }

    private void updatedPeerColor() {
        SharedMediaLayout.ScrollSlidingTextTabStripInner scrollSlidingTextTabStripInner;
        TextView textView;
        int themedColor;
        int themedColor2;
        this.adaptedColors.clear();
        TopView topView = this.topView;
        if (topView != null) {
            topView.setBackgroundColorId(this.peerColor, true);
        }
        SimpleTextView[] simpleTextViewArr = this.onlineTextView;
        if (simpleTextViewArr[1] != null) {
            if (simpleTextViewArr[1].getTag() instanceof Integer) {
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
            actionBar.setItemsBackgroundColor(this.peerColor != null ? 553648127 : getThemedColor(Theme.key_avatar_actionBarSelectorBlue), false);
            this.actionBar.setItemsColor(ColorUtils.blendARGB(this.peerColor != null ? -1 : getThemedColor(Theme.key_actionBarDefaultIcon), AvatarDrawable.getIconColorForId((this.userId != 0 || (ChatObject.isChannel(this.chatId, this.currentAccount) && !this.currentChat.megagroup)) ? 5L : this.chatId, this.resourcesProvider), this.avatarAnimationProgress), false);
        }
        if (this.verifiedDrawable[1] != null) {
            MessagesController.PeerColor peerColor = this.peerColor;
            if (peerColor != null) {
                themedColor = Theme.adaptHSV(ColorUtils.blendARGB(peerColor.getColor2(), this.peerColor.hasColor6(Theme.isCurrentThemeDark()) ? this.peerColor.getColor5() : this.peerColor.getColor3(), 0.4f), 0.1f, Theme.isCurrentThemeDark() ? -0.1f : -0.08f);
            } else {
                themedColor = getThemedColor(Theme.key_profile_verifiedBackground);
            }
            this.verifiedDrawable[1].setColorFilter(AndroidUtilities.getOffsetColor(themedColor, getThemedColor(Theme.key_player_actionBarTitle), this.mediaHeaderAnimationProgress, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        if (this.verifiedCheckDrawable[1] != null) {
            this.verifiedCheckDrawable[1].setColorFilter(AndroidUtilities.getOffsetColor(this.peerColor != null ? -1 : applyPeerColor(getThemedColor(Theme.key_profile_verifiedCheck)), getThemedColor(Theme.key_windowBackgroundWhite), this.mediaHeaderAnimationProgress, 1.0f), PorterDuff.Mode.MULTIPLY);
        }
        SimpleTextView[] simpleTextViewArr2 = this.nameTextView;
        if (simpleTextViewArr2[1] != null) {
            simpleTextViewArr2[1].setTextColor(ColorUtils.blendARGB(this.peerColor != null ? -1 : getThemedColor(Theme.key_profile_title), -1, this.currentExpandAnimatorValue));
        }
        AutoDeletePopupWrapper autoDeletePopupWrapper = this.autoDeletePopupWrapper;
        if (autoDeletePopupWrapper != null && (textView = autoDeletePopupWrapper.textView) != null) {
            textView.invalidate();
        }
        AndroidUtilities.forEachViews((RecyclerView) this.listView, (com.google.android.exoplayer2.util.Consumer<View>) new com.google.android.exoplayer2.util.Consumer() {
            @Override
            public final void accept(Object obj) {
                ProfileActivity.this.lambda$updatedPeerColor$77((View) obj);
            }
        });
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout != null && (scrollSlidingTextTabStripInner = sharedMediaLayout.scrollSlidingTextTabStrip) != null) {
            scrollSlidingTextTabStripInner.updateColors();
        }
        writeButtonSetBackground();
        updateEmojiStatusDrawableColor();
    }

    public void lambda$updatedPeerColor$77(View view) {
        if (view instanceof HeaderCell) {
            ((HeaderCell) view).setTextColor(applyPeerColor(getThemedColor(Theme.key_windowBackgroundWhiteBlueHeader), false));
            return;
        }
        if (view instanceof TextDetailCell) {
            ((TextDetailCell) view).updateColors();
            return;
        }
        if (view instanceof TextCell) {
            ((TextCell) view).updateColors();
            return;
        }
        if (view instanceof AboutLinkCell) {
            ((AboutLinkCell) view).updateColors();
            return;
        }
        if (view instanceof NotificationsCheckCell) {
            ((NotificationsCheckCell) view).getCheckBox().invalidate();
        } else if (view instanceof ProfileHoursCell) {
            ((ProfileHoursCell) view).updateColors();
        } else if (view instanceof ProfileChannelCell) {
            ((ProfileChannelCell) view).updateColors();
        }
    }

    public int applyPeerColor(int i) {
        return applyPeerColor(i, true, null);
    }

    public int applyPeerColor(int i, boolean z) {
        return applyPeerColor(i, z, null);
    }

    private int applyPeerColor(int i, boolean z, Boolean bool) {
        if ((!z && isSettings()) || this.peerColor == null) {
            return i;
        }
        if (!z) {
            int indexOfKey = this.adaptedColors.indexOfKey(i);
            if (indexOfKey < 0) {
                int adapt = OKLCH.adapt(i, Theme.adaptHSV(this.peerColor.getBgColor1(Theme.isCurrentThemeDark()), Theme.isCurrentThemeDark() ? 0.0f : 0.05f, Theme.isCurrentThemeDark() ? -0.1f : -0.04f));
                this.adaptedColors.put(i, adapt);
                return adapt;
            }
            return this.adaptedColors.valueAt(indexOfKey);
        }
        int themedColor = getThemedColor(z ? Theme.key_actionBarDefault : Theme.key_windowBackgroundWhiteBlueIcon);
        int blendARGB = ColorUtils.blendARGB(this.peerColor.getStoryColor1(Theme.isCurrentThemeDark()), this.peerColor.getStoryColor2(Theme.isCurrentThemeDark()), 0.5f);
        int bgColor1 = z ? blendARGB : this.peerColor.getBgColor1(Theme.isCurrentThemeDark());
        if (!Theme.hasHue(themedColor)) {
            return (bool == null || bool.booleanValue()) ? blendARGB : Theme.adaptHSV(Theme.multAlpha(blendARGB, 0.7f), -0.2f, 0.2f);
        }
        boolean isCurrentThemeDark = Theme.isCurrentThemeDark();
        if (bool != null && !bool.booleanValue()) {
            blendARGB = Theme.multAlpha(blendARGB, 0.7f);
        }
        return Theme.changeColorAccent(themedColor, bgColor1, i, isCurrentThemeDark, blendARGB);
    }

    private int applyPeerColor2(int i) {
        MessagesController.PeerColor peerColor = this.peerColor;
        if (peerColor == null) {
            return i;
        }
        int bgColor2 = peerColor.getBgColor2(Theme.isCurrentThemeDark());
        return Theme.changeColorAccent(getThemedColor(Theme.key_windowBackgroundWhiteBlueIcon), bgColor2, i, Theme.isCurrentThemeDark(), bgColor2);
    }

    private void createActionBarMenu(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.createActionBarMenu(boolean):void");
    }

    public class AnonymousClass51 implements AutoDeletePopupWrapper.Callback {
        AnonymousClass51() {
        }

        @Override
        public void dismiss() {
            ProfileActivity.this.otherItem.toggleSubMenu();
        }

        @Override
        public void setAutoDeleteHistory(int i, int i2) {
            ProfileActivity.this.setAutoDeleteHistory(i, i2);
        }

        @Override
        public void showGlobalAutoDeleteScreen() {
            ProfileActivity.this.presentFragment(new AutoDeleteMessagesActivity());
            dismiss();
        }
    }

    private void createAutoDeleteItem(Context context) {
        int i;
        this.autoDeletePopupWrapper = new AutoDeletePopupWrapper(context, this.otherItem.getPopupLayout().getSwipeBack(), new AutoDeletePopupWrapper.Callback() {
            AnonymousClass51() {
            }

            @Override
            public void dismiss() {
                ProfileActivity.this.otherItem.toggleSubMenu();
            }

            @Override
            public void setAutoDeleteHistory(int i2, int i22) {
                ProfileActivity.this.setAutoDeleteHistory(i2, i22);
            }

            @Override
            public void showGlobalAutoDeleteScreen() {
                ProfileActivity.this.presentFragment(new AutoDeleteMessagesActivity());
                dismiss();
            }
        }, false, 0, this.resourcesProvider);
        if (this.dialogId > 0 || this.userId > 0) {
            this.autoDeletePopupWrapper.allowExtendedHint(applyPeerColor(getThemedColor(Theme.key_windowBackgroundWhiteBlueText), false));
        }
        TLRPC$UserFull tLRPC$UserFull = this.userInfo;
        if (tLRPC$UserFull == null && this.chatInfo == null) {
            i = 0;
        } else {
            i = tLRPC$UserFull != null ? tLRPC$UserFull.ttl_period : this.chatInfo.ttl_period;
        }
        TimerDrawable ttlIcon = TimerDrawable.getTtlIcon(i);
        this.autoDeleteItemDrawable = ttlIcon;
        this.autoDeleteItem = this.otherItem.addSwipeBackItem(0, ttlIcon, LocaleController.getString("AutoDeletePopupTitle", R.string.AutoDeletePopupTitle), this.autoDeletePopupWrapper.windowLayout);
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
        TLRPC$User user = getMessagesController().getUser(Long.valueOf(dialogId));
        TLRPC$UserFull tLRPC$UserFull = this.userInfo;
        undoView.showWithAction(dialogId, i2, user, Integer.valueOf(tLRPC$UserFull != null ? tLRPC$UserFull.ttl_period : this.chatInfo.ttl_period), (Runnable) null, (Runnable) null);
    }

    @Override
    public void onDialogDismiss(Dialog dialog) {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            recyclerListView.invalidateViews();
        }
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList<MessagesStorage.TopicKey> arrayList, CharSequence charSequence, boolean z, TopicsFragment topicsFragment) {
        long j = arrayList.get(0).dialogId;
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
        int i = NotificationCenter.closeChats;
        notificationCenter.removeObserver(this, i);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i, new Object[0]);
        presentFragment(new ChatActivity(bundle), true);
        removeSelfFromStack();
        getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(getMessagesController().getUser(Long.valueOf(this.userId)), j, (MessageObject) null, (MessageObject) null, (TLRPC$ReplyMarkup) null, (HashMap<String, String>) null, true, 0));
        if (!TextUtils.isEmpty(charSequence)) {
            SendMessagesHelper.prepareSendingText(AccountInstance.getInstance(this.currentAccount), charSequence.toString(), j, true, 0, 0L);
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
            TLRPC$User user = getMessagesController().getUser(Long.valueOf(this.userId));
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
                TLRPC$UserFull tLRPC$UserFull = this.userInfo;
                VoIPHelper.startCall(user, z3, tLRPC$UserFull != null && tLRPC$UserFull.video_calls_available, getParentActivity(), this.userInfo, getAccountInstance());
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
        float[] fArr = new float[2];
        fArr[0] = this.searchTransitionProgress;
        fArr[1] = z ? 0.0f : 1.0f;
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
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
        if (this.qrItem != null) {
            updateQrItemVisibility(false);
        }
        this.searchItem.setVisibility(i);
        this.searchItem.getSearchContainer().setVisibility(this.searchTransitionProgress <= 0.5f ? 0 : 8);
        this.searchListView.setEmptyView(this.emptyView);
        this.avatarContainer.setClickable(false);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ProfileActivity.this.lambda$searchExpandTransition$78(ofFloat, f, z, valueAnimator);
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            final boolean val$enter;

            AnonymousClass52(final boolean z2) {
                r2 = z2;
            }

            @Override
            public void onAnimationEnd(Animator animator2) {
                ProfileActivity.this.updateSearchViewState(r2);
                ProfileActivity.this.avatarContainer.setClickable(true);
                if (r2) {
                    ProfileActivity.this.searchItem.requestFocusOnSearchView();
                }
                ProfileActivity.this.needLayout(true);
                ProfileActivity.this.searchViewTransition = null;
                ProfileActivity.this.fragmentView.invalidate();
                if (r2) {
                    ProfileActivity.this.invalidateScroll = true;
                    ProfileActivity.this.saveScrollPosition();
                    AndroidUtilities.requestAdjustResize(ProfileActivity.this.getParentActivity(), ((BaseFragment) ProfileActivity.this).classGuid);
                    ProfileActivity.this.emptyView.setPreventMoving(false);
                }
            }
        });
        if (!z2) {
            this.invalidateScroll = true;
            saveScrollPosition();
            AndroidUtilities.requestAdjustNothing(getParentActivity(), this.classGuid);
            this.emptyView.setPreventMoving(true);
        }
        ofFloat.setDuration(220L);
        ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.searchViewTransition = ofFloat;
        return ofFloat;
    }

    public void lambda$searchExpandTransition$78(ValueAnimator valueAnimator, float f, boolean z, ValueAnimator valueAnimator2) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.searchTransitionProgress = floatValue;
        float f2 = (floatValue - 0.5f) / 0.5f;
        float f3 = (0.5f - floatValue) / 0.5f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        float f4 = -f;
        this.searchTransitionOffset = (int) ((1.0f - floatValue) * f4);
        this.searchListView.setTranslationY(floatValue * f);
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
        ActionBarMenuItem actionBarMenuItem2 = this.qrItem;
        if (actionBarMenuItem2 != null) {
            actionBarMenuItem2.setAlpha(f2);
            updateQrItemVisibility(false);
        }
        this.searchItem.setVisibility(i);
        this.actionBar.onSearchFieldVisibilityChanged(this.searchTransitionProgress < 0.5f);
        ActionBarMenuItem actionBarMenuItem3 = this.otherItem;
        if (actionBarMenuItem3 != null) {
            actionBarMenuItem3.setAlpha(f2);
        }
        ActionBarMenuItem actionBarMenuItem4 = this.qrItem;
        if (actionBarMenuItem4 != null) {
            actionBarMenuItem4.setAlpha(f2);
        }
        this.searchItem.setAlpha(f2);
        this.topView.invalidate();
        this.fragmentView.invalidate();
    }

    public class AnonymousClass52 extends AnimatorListenerAdapter {
        final boolean val$enter;

        AnonymousClass52(final boolean z2) {
            r2 = z2;
        }

        @Override
        public void onAnimationEnd(Animator animator2) {
            ProfileActivity.this.updateSearchViewState(r2);
            ProfileActivity.this.avatarContainer.setClickable(true);
            if (r2) {
                ProfileActivity.this.searchItem.requestFocusOnSearchView();
            }
            ProfileActivity.this.needLayout(true);
            ProfileActivity.this.searchViewTransition = null;
            ProfileActivity.this.fragmentView.invalidate();
            if (r2) {
                ProfileActivity.this.invalidateScroll = true;
                ProfileActivity.this.saveScrollPosition();
                AndroidUtilities.requestAdjustResize(ProfileActivity.this.getParentActivity(), ((BaseFragment) ProfileActivity.this).classGuid);
                ProfileActivity.this.emptyView.setPreventMoving(false);
            }
        }
    }

    public void updateSearchViewState(boolean z) {
        int i = z ? 8 : 0;
        this.listView.setVisibility(i);
        this.searchListView.setVisibility(z ? 0 : 8);
        this.searchItem.getSearchContainer().setVisibility(z ? 0 : 8);
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
        ActionBarMenuItem actionBarMenuItem2 = this.qrItem;
        if (actionBarMenuItem2 != null) {
            actionBarMenuItem2.setAlpha(1.0f);
            this.qrItem.setVisibility((z || !isQrNeedVisible()) ? 8 : 0);
        }
        this.searchItem.setVisibility(i);
        this.avatarContainer.setAlpha(1.0f);
        ProfileStoriesView profileStoriesView2 = this.storyView;
        if (profileStoriesView2 != null) {
            profileStoriesView2.setAlpha(1.0f);
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
    public void didStartUpload(boolean z) {
        RadialProgressView radialProgressView = this.avatarProgressView;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public void didUploadPhoto(final TLRPC$InputFile tLRPC$InputFile, final TLRPC$InputFile tLRPC$InputFile2, final double d, final String str, final TLRPC$PhotoSize tLRPC$PhotoSize, final TLRPC$PhotoSize tLRPC$PhotoSize2, boolean z, final TLRPC$VideoSize tLRPC$VideoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ProfileActivity.this.lambda$didUploadPhoto$81(tLRPC$InputFile, tLRPC$InputFile2, tLRPC$VideoSize, d, str, tLRPC$PhotoSize2, tLRPC$PhotoSize);
            }
        });
    }

    public void lambda$didUploadPhoto$80(final String str, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ProfileActivity.this.lambda$didUploadPhoto$79(tLRPC$TL_error, tLObject, str);
            }
        });
    }

    public void lambda$didUploadPhoto$79(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, String str) {
        if (tLRPC$TL_error == null) {
            TLRPC$User user = getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId()));
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
            TLRPC$TL_photos_photo tLRPC$TL_photos_photo = (TLRPC$TL_photos_photo) tLObject;
            ArrayList<TLRPC$PhotoSize> arrayList = tLRPC$TL_photos_photo.photo.sizes;
            TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
            TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 800);
            TLRPC$VideoSize closestVideoSizeWithSize = tLRPC$TL_photos_photo.photo.video_sizes.isEmpty() ? null : FileLoader.getClosestVideoSizeWithSize(tLRPC$TL_photos_photo.photo.video_sizes, 1000);
            TLRPC$TL_userProfilePhoto tLRPC$TL_userProfilePhoto = new TLRPC$TL_userProfilePhoto();
            user.photo = tLRPC$TL_userProfilePhoto;
            tLRPC$TL_userProfilePhoto.photo_id = tLRPC$TL_photos_photo.photo.id;
            if (closestPhotoSizeWithSize != null) {
                tLRPC$TL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                tLRPC$TL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
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
            getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tLRPC$TL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC$UserFull userFull = getMessagesController().getUserFull(this.userId);
            if (userFull != null) {
                userFull.profile_photo = tLRPC$TL_photos_photo.photo;
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

    public void lambda$didUploadPhoto$81(TLRPC$InputFile tLRPC$InputFile, TLRPC$InputFile tLRPC$InputFile2, TLRPC$VideoSize tLRPC$VideoSize, double d, final String str, TLRPC$PhotoSize tLRPC$PhotoSize, TLRPC$PhotoSize tLRPC$PhotoSize2) {
        if (tLRPC$InputFile != null || tLRPC$InputFile2 != null || tLRPC$VideoSize != null) {
            if (this.avatar == null) {
                return;
            }
            TLRPC$TL_photos_uploadProfilePhoto tLRPC$TL_photos_uploadProfilePhoto = new TLRPC$TL_photos_uploadProfilePhoto();
            if (tLRPC$InputFile != null) {
                tLRPC$TL_photos_uploadProfilePhoto.file = tLRPC$InputFile;
                tLRPC$TL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (tLRPC$InputFile2 != null) {
                tLRPC$TL_photos_uploadProfilePhoto.video = tLRPC$InputFile2;
                int i = tLRPC$TL_photos_uploadProfilePhoto.flags | 2;
                tLRPC$TL_photos_uploadProfilePhoto.flags = i;
                tLRPC$TL_photos_uploadProfilePhoto.video_start_ts = d;
                tLRPC$TL_photos_uploadProfilePhoto.flags = i | 4;
            }
            if (tLRPC$VideoSize != null) {
                tLRPC$TL_photos_uploadProfilePhoto.video_emoji_markup = tLRPC$VideoSize;
                tLRPC$TL_photos_uploadProfilePhoto.flags |= 16;
            }
            this.avatarUploadingRequest = getConnectionsManager().sendRequest(tLRPC$TL_photos_uploadProfilePhoto, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ProfileActivity.this.lambda$didUploadPhoto$80(str, tLObject, tLRPC$TL_error);
                }
            });
        } else {
            TLRPC$FileLocation tLRPC$FileLocation = tLRPC$PhotoSize.location;
            this.avatar = tLRPC$FileLocation;
            this.avatarBig = tLRPC$PhotoSize2.location;
            this.avatarImage.setImage(ImageLocation.getForLocal(tLRPC$FileLocation), "50_50", this.avatarDrawable, (Object) null);
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

    public void showAvatarProgress(boolean z, boolean z2) {
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
            final boolean val$show;

            AnonymousClass53(boolean z3) {
                r2 = z3;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (ProfileActivity.this.avatarAnimation == null || ProfileActivity.this.avatarProgressView == null) {
                    return;
                }
                if (!r2) {
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

    public class AnonymousClass53 extends AnimatorListenerAdapter {
        final boolean val$show;

        AnonymousClass53(boolean z3) {
            r2 = z3;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (ProfileActivity.this.avatarAnimation == null || ProfileActivity.this.avatarProgressView == null) {
                return;
            }
            if (!r2) {
                ProfileActivity.this.avatarProgressView.setVisibility(4);
            }
            ProfileActivity.this.avatarAnimation = null;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            ProfileActivity.this.avatarAnimation = null;
        }
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
            public final void run() {
                ProfileActivity.lambda$sendLogs$83(AlertDialog.this, z, activity);
            }
        });
    }

    public static void lambda$sendLogs$83(final AlertDialog alertDialog, boolean z, final Activity activity) {
        ZipOutputStream zipOutputStream;
        try {
            File logsDir = AndroidUtilities.getLogsDir();
            if (logsDir == null) {
                Objects.requireNonNull(alertDialog);
                AndroidUtilities.runOnUIThread(new BillingController$$ExternalSyntheticLambda9(alertDialog));
                return;
            }
            final File file = new File(logsDir, "logs.zip");
            if (file.exists()) {
                file.delete();
            }
            ArrayList arrayList = new ArrayList();
            for (File file2 : logsDir.listFiles()) {
                arrayList.add(file2);
            }
            File file3 = new File(ApplicationLoader.getFilesDirFixed(), "malformed_database/");
            if (file3.exists() && file3.isDirectory()) {
                for (File file4 : file3.listFiles()) {
                    arrayList.add(file4);
                }
            }
            final boolean[] zArr = new boolean[1];
            long currentTimeMillis = System.currentTimeMillis();
            BufferedInputStream bufferedInputStream = null;
            try {
                zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                try {
                    try {
                        byte[] bArr = new byte[65536];
                        for (int i = 0; i < arrayList.size(); i++) {
                            File file5 = (File) arrayList.get(i);
                            if ((file5.getName().contains("cache4") || ((!z && !file5.getName().contains("_mtproto")) || currentTimeMillis - file5.lastModified() <= 86400000)) && file5.exists()) {
                                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file5), 65536);
                                try {
                                    zipOutputStream.putNextEntry(new ZipEntry(file5.getName()));
                                    while (true) {
                                        int read = bufferedInputStream2.read(bArr, 0, 65536);
                                        if (read == -1) {
                                            break;
                                        } else {
                                            zipOutputStream.write(bArr, 0, read);
                                        }
                                    }
                                    bufferedInputStream2.close();
                                } catch (Exception e) {
                                    e = e;
                                    bufferedInputStream = bufferedInputStream2;
                                    e.printStackTrace();
                                    if (bufferedInputStream != null) {
                                        bufferedInputStream.close();
                                    }
                                    if (zipOutputStream != null) {
                                        zipOutputStream.close();
                                    }
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            ProfileActivity.lambda$sendLogs$82(AlertDialog.this, zArr, activity, file);
                                        }
                                    });
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedInputStream = bufferedInputStream2;
                                    if (bufferedInputStream != null) {
                                        bufferedInputStream.close();
                                    }
                                    if (zipOutputStream != null) {
                                        zipOutputStream.close();
                                    }
                                    throw th;
                                }
                            }
                        }
                        zArr[0] = true;
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e3) {
                e = e3;
                zipOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                zipOutputStream = null;
            }
            zipOutputStream.close();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.lambda$sendLogs$82(AlertDialog.this, zArr, activity, file);
                }
            });
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public static void lambda$sendLogs$82(AlertDialog alertDialog, boolean[] zArr, Activity activity, File file) {
        Uri fromFile;
        try {
            alertDialog.dismiss();
        } catch (Exception unused) {
        }
        if (!zArr[0]) {
            if (activity != null) {
                Toast.makeText(activity, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred), 0).show();
                return;
            }
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            fromFile = FileProvider.getUriForFile(activity, ApplicationLoader.getApplicationId() + ".provider", file);
        } else {
            fromFile = Uri.fromFile(file);
        }
        Intent intent = new Intent("android.intent.action.SEND");
        if (i >= 24) {
            intent.addFlags(1);
        }
        intent.setType("message/rfc822");
        intent.putExtra("android.intent.extra.EMAIL", "");
        intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + LocaleController.getInstance().formatterStats.format(System.currentTimeMillis()));
        intent.putExtra("android.intent.extra.STREAM", fromFile);
        if (activity != null) {
            try {
                activity.startActivityForResult(Intent.createChooser(intent, "Select email application."), 500);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;
        private final HashMap<TLRPC$TL_username, ClickableSpan> usernameSpans = new HashMap<>();

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        class AnonymousClass1 extends TextDetailCell {
            AnonymousClass1(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
                super(context, resourcesProvider, z);
            }

            @Override
            protected int processColor(int i) {
                return ProfileActivity.this.applyPeerColor(i, false);
            }
        }

        class AnonymousClass2 extends AboutLinkCell {
            AnonymousClass2(Context context, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
                super(context, baseFragment, resourcesProvider);
            }

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
            protected int processColor(int i) {
                return ProfileActivity.this.applyPeerColor(i, false);
            }
        }

        class AnonymousClass3 extends TextCell {
            AnonymousClass3(Context context, Theme.ResourcesProvider resourcesProvider) {
                super(context, resourcesProvider);
            }

            @Override
            protected int processColor(int i) {
                return ProfileActivity.this.applyPeerColor(i, false);
            }
        }

        class AnonymousClass4 extends NotificationsCheckCell {
            AnonymousClass4(Context context, int i, int i2, boolean z, Theme.ResourcesProvider resourcesProvider) {
                super(context, i, i2, z, resourcesProvider);
            }

            @Override
            protected int processColor(int i) {
                return ProfileActivity.this.applyPeerColor(i, false);
            }
        }

        class AnonymousClass5 extends View {
            AnonymousClass5(ListAdapter listAdapter, Context context) {
                super(context);
            }

            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
            }
        }

        class AnonymousClass6 extends View {
            private int lastPaddingHeight = 0;
            private int lastListViewHeight = 0;

            AnonymousClass6(Context context) {
                super(context);
                this.lastPaddingHeight = 0;
                this.lastListViewHeight = 0;
            }

            @Override
            protected void onMeasure(int i, int i2) {
                if (this.lastListViewHeight != ProfileActivity.this.listView.getMeasuredHeight()) {
                    this.lastPaddingHeight = 0;
                }
                this.lastListViewHeight = ProfileActivity.this.listView.getMeasuredHeight();
                int childCount = ProfileActivity.this.listView.getChildCount();
                if (childCount != ProfileActivity.this.listAdapter.getItemCount()) {
                    setMeasuredDimension(ProfileActivity.this.listView.getMeasuredWidth(), this.lastPaddingHeight);
                    return;
                }
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    int childAdapterPosition = ProfileActivity.this.listView.getChildAdapterPosition(ProfileActivity.this.listView.getChildAt(i4));
                    if (childAdapterPosition >= 0 && childAdapterPosition != ProfileActivity.this.bottomPaddingRow) {
                        i3 += ProfileActivity.this.listView.getChildAt(i4).getMeasuredHeight();
                    }
                }
                View view = ProfileActivity.this.fragmentView;
                int measuredHeight = (((view == null ? 0 : view.getMeasuredHeight()) - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - i3;
                if (measuredHeight > AndroidUtilities.dp(88.0f)) {
                    measuredHeight = 0;
                }
                int i5 = measuredHeight > 0 ? measuredHeight : 0;
                int measuredWidth = ProfileActivity.this.listView.getMeasuredWidth();
                this.lastPaddingHeight = i5;
                setMeasuredDimension(measuredWidth, i5);
            }
        }

        class AnonymousClass7 extends ProfileHoursCell {
            AnonymousClass7(Context context, Theme.ResourcesProvider resourcesProvider) {
                super(context, resourcesProvider);
            }

            @Override
            protected int processColor(int i) {
                return ProfileActivity.this.applyPeerColor(i, false);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View headerCell;
            FrameLayout frameLayout;
            String str;
            switch (i) {
                case 1:
                    headerCell = new HeaderCell(this.mContext, 23, ProfileActivity.this.resourcesProvider);
                    headerCell.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    break;
                case 2:
                case 19:
                    AnonymousClass1 anonymousClass1 = new TextDetailCell(this.mContext, ProfileActivity.this.resourcesProvider, i == 19) {
                        AnonymousClass1(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
                            super(context, resourcesProvider, z);
                        }

                        @Override
                        protected int processColor(int i2) {
                            return ProfileActivity.this.applyPeerColor(i2, false);
                        }
                    };
                    anonymousClass1.setContentDescriptionValueFirst(true);
                    anonymousClass1.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    frameLayout = anonymousClass1;
                    headerCell = frameLayout;
                    break;
                case 3:
                    ProfileActivity profileActivity = ProfileActivity.this;
                    Context context = this.mContext;
                    ProfileActivity profileActivity2 = ProfileActivity.this;
                    headerCell = profileActivity.aboutLinkCell = new AboutLinkCell(context, profileActivity2, profileActivity2.resourcesProvider) {
                        AnonymousClass2(Context context2, BaseFragment profileActivity22, Theme.ResourcesProvider resourcesProvider) {
                            super(context2, profileActivity22, resourcesProvider);
                        }

                        @Override
                        protected void didPressUrl(String str2, Browser.Progress progress) {
                            ProfileActivity.this.openUrl(str2, progress);
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
                            return ProfileActivity.this.applyPeerColor(i2, false);
                        }
                    };
                    headerCell.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    break;
                case 4:
                    headerCell = new TextCell(this.mContext, ProfileActivity.this.resourcesProvider) {
                        AnonymousClass3(Context context2, Theme.ResourcesProvider resourcesProvider) {
                            super(context2, resourcesProvider);
                        }

                        @Override
                        protected int processColor(int i2) {
                            return ProfileActivity.this.applyPeerColor(i2, false);
                        }
                    };
                    headerCell.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    break;
                case 5:
                    headerCell = new DividerCell(this.mContext, ProfileActivity.this.resourcesProvider);
                    headerCell.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    headerCell.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                    break;
                case 6:
                    headerCell = new NotificationsCheckCell(this.mContext, 23, 70, false, ProfileActivity.this.resourcesProvider) {
                        AnonymousClass4(Context context2, int i2, int i22, boolean z, Theme.ResourcesProvider resourcesProvider) {
                            super(context2, i2, i22, z, resourcesProvider);
                        }

                        @Override
                        protected int processColor(int i2) {
                            return ProfileActivity.this.applyPeerColor(i2, false);
                        }
                    };
                    headerCell.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    break;
                case 7:
                    headerCell = new ShadowSectionCell(this.mContext, ProfileActivity.this.resourcesProvider);
                    break;
                case 8:
                    headerCell = new UserCell(this.mContext, ProfileActivity.this.addMemberRow == -1 ? 9 : 6, 0, true, ProfileActivity.this.resourcesProvider);
                    headerCell.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
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
                    try {
                        PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                        int i2 = packageInfo.versionCode;
                        int i3 = i2 / 10;
                        int i4 = i2 % 10;
                        if (i4 == 1 || i4 == 2) {
                            str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                        } else if (ApplicationLoader.isStandaloneBuild()) {
                            str = "direct " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                        } else {
                            str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                        }
                        textInfoPrivacyCell.setText(LocaleController.formatString("TelegramVersion", R.string.TelegramVersion, String.format(Locale.US, "v%s (%d) %s", packageInfo.versionName, Integer.valueOf(i3), str)));
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    textInfoPrivacyCell.getTextView().setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
                    textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, R.drawable.greydivider_bottom, ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundGrayShadow)));
                    frameLayout = textInfoPrivacyCell;
                    headerCell = frameLayout;
                    break;
                case 11:
                    headerCell = new View(this, this.mContext) {
                        AnonymousClass5(ListAdapter this, Context context2) {
                            super(context2);
                        }

                        @Override
                        protected void onMeasure(int i5, int i22) {
                            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i5), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                        }
                    };
                    break;
                case 12:
                    headerCell = new View(this.mContext) {
                        private int lastPaddingHeight = 0;
                        private int lastListViewHeight = 0;

                        AnonymousClass6(Context context2) {
                            super(context2);
                            this.lastPaddingHeight = 0;
                            this.lastListViewHeight = 0;
                        }

                        @Override
                        protected void onMeasure(int i5, int i22) {
                            if (this.lastListViewHeight != ProfileActivity.this.listView.getMeasuredHeight()) {
                                this.lastPaddingHeight = 0;
                            }
                            this.lastListViewHeight = ProfileActivity.this.listView.getMeasuredHeight();
                            int childCount = ProfileActivity.this.listView.getChildCount();
                            if (childCount != ProfileActivity.this.listAdapter.getItemCount()) {
                                setMeasuredDimension(ProfileActivity.this.listView.getMeasuredWidth(), this.lastPaddingHeight);
                                return;
                            }
                            int i32 = 0;
                            for (int i42 = 0; i42 < childCount; i42++) {
                                int childAdapterPosition = ProfileActivity.this.listView.getChildAdapterPosition(ProfileActivity.this.listView.getChildAt(i42));
                                if (childAdapterPosition >= 0 && childAdapterPosition != ProfileActivity.this.bottomPaddingRow) {
                                    i32 += ProfileActivity.this.listView.getChildAt(i42).getMeasuredHeight();
                                }
                            }
                            View view = ProfileActivity.this.fragmentView;
                            int measuredHeight = (((view == null ? 0 : view.getMeasuredHeight()) - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - i32;
                            if (measuredHeight > AndroidUtilities.dp(88.0f)) {
                                measuredHeight = 0;
                            }
                            int i52 = measuredHeight > 0 ? measuredHeight : 0;
                            int measuredWidth = ProfileActivity.this.listView.getMeasuredWidth();
                            this.lastPaddingHeight = i52;
                            setMeasuredDimension(measuredWidth, i52);
                        }
                    };
                    headerCell.setBackground(new ColorDrawable(0));
                    break;
                case 13:
                    if (ProfileActivity.this.sharedMediaLayout.getParent() != null) {
                        ((ViewGroup) ProfileActivity.this.sharedMediaLayout.getParent()).removeView(ProfileActivity.this.sharedMediaLayout);
                    }
                    headerCell = ProfileActivity.this.sharedMediaLayout;
                    break;
                case 15:
                    headerCell = new SettingsSuggestionCell(this.mContext, ProfileActivity.this.resourcesProvider) {
                        AnonymousClass8(Context context2, Theme.ResourcesProvider resourcesProvider) {
                            super(context2, resourcesProvider);
                        }

                        @Override
                        protected void onYesClick(int i5) {
                            NotificationCenter notificationCenter = ProfileActivity.this.getNotificationCenter();
                            ProfileActivity profileActivity3 = ProfileActivity.this;
                            int i6 = NotificationCenter.newSuggestionsAvailable;
                            notificationCenter.removeObserver(profileActivity3, i6);
                            if (i5 == 2) {
                                Browser.openUrl(getContext(), ProfileActivity.this.getMessagesController().premiumManageSubscriptionUrl);
                                ProfileActivity.this.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                                ProfileActivity.this.updateListAnimated(false);
                            } else {
                                ProfileActivity.this.getMessagesController().removeSuggestion(0L, i5 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                                ProfileActivity.this.updateListAnimated(false);
                            }
                            ProfileActivity.this.getNotificationCenter().addObserver(ProfileActivity.this, i6);
                        }

                        @Override
                        protected void onNoClick(int i5) {
                            if (i5 == 0) {
                                ProfileActivity.this.presentFragment(new ActionIntroActivity(3));
                            } else {
                                ProfileActivity.this.presentFragment(new TwoStepVerificationSetupActivity(8, null));
                            }
                        }
                    };
                    break;
                case 17:
                    headerCell = new TextInfoPrivacyCell(this.mContext, ProfileActivity.this.resourcesProvider);
                    headerCell.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    break;
                case 18:
                case 24:
                    FrameLayout profilePremiumCell = new ProfilePremiumCell(this.mContext, i == 18 ? 0 : 1, ProfileActivity.this.resourcesProvider);
                    profilePremiumCell.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    frameLayout = profilePremiumCell;
                    headerCell = frameLayout;
                    break;
                case 20:
                    headerCell = new TextCheckCell(this.mContext, ProfileActivity.this.resourcesProvider);
                    headerCell.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    break;
                case 21:
                    headerCell = new ProfileLocationCell(this.mContext, ProfileActivity.this.resourcesProvider);
                    headerCell.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    break;
                case 22:
                    headerCell = new ProfileHoursCell(this.mContext, ProfileActivity.this.resourcesProvider) {
                        AnonymousClass7(Context context2, Theme.ResourcesProvider resourcesProvider) {
                            super(context2, resourcesProvider);
                        }

                        @Override
                        protected int processColor(int i5) {
                            return ProfileActivity.this.applyPeerColor(i5, false);
                        }
                    };
                    headerCell.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    break;
                case 23:
                    headerCell = new ProfileChannelCell(ProfileActivity.this) {
                        AnonymousClass9(BaseFragment baseFragment) {
                            super(baseFragment);
                        }

                        @Override
                        public int processColor(int i5) {
                            return ProfileActivity.this.applyPeerColor(i5, false);
                        }
                    };
                    headerCell.setBackgroundColor(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    break;
            }
            if (i != 13) {
                headerCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            }
            return new RecyclerListView.Holder(headerCell);
        }

        class AnonymousClass8 extends SettingsSuggestionCell {
            AnonymousClass8(Context context2, Theme.ResourcesProvider resourcesProvider) {
                super(context2, resourcesProvider);
            }

            @Override
            protected void onYesClick(int i5) {
                NotificationCenter notificationCenter = ProfileActivity.this.getNotificationCenter();
                ProfileActivity profileActivity3 = ProfileActivity.this;
                int i6 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity3, i6);
                if (i5 == 2) {
                    Browser.openUrl(getContext(), ProfileActivity.this.getMessagesController().premiumManageSubscriptionUrl);
                    ProfileActivity.this.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    ProfileActivity.this.updateListAnimated(false);
                } else {
                    ProfileActivity.this.getMessagesController().removeSuggestion(0L, i5 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                    ProfileActivity.this.updateListAnimated(false);
                }
                ProfileActivity.this.getNotificationCenter().addObserver(ProfileActivity.this, i6);
            }

            @Override
            protected void onNoClick(int i5) {
                if (i5 == 0) {
                    ProfileActivity.this.presentFragment(new ActionIntroActivity(3));
                } else {
                    ProfileActivity.this.presentFragment(new TwoStepVerificationSetupActivity(8, null));
                }
            }
        }

        class AnonymousClass9 extends ProfileChannelCell {
            AnonymousClass9(BaseFragment baseFragment) {
                super(baseFragment);
            }

            @Override
            public int processColor(int i5) {
                return ProfileActivity.this.applyPeerColor(i5, false);
            }
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.itemView == ProfileActivity.this.sharedMediaLayout) {
                ProfileActivity.this.sharedMediaLayoutAttached = true;
            }
            View view = viewHolder.itemView;
            if (view instanceof TextDetailCell) {
                ((TextDetailCell) view).textView.setLoading(ProfileActivity.this.loadingSpan);
                ((TextDetailCell) viewHolder.itemView).valueTextView.setLoading(ProfileActivity.this.loadingSpan);
            }
        }

        @Override
        public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.itemView == ProfileActivity.this.sharedMediaLayout) {
                ProfileActivity.this.sharedMediaLayoutAttached = false;
            }
        }

        @Override
        public void onBindViewHolder(final androidx.recyclerview.widget.RecyclerView.ViewHolder r25, final int r26) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ProfileActivity.ListAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        public void lambda$onBindViewHolder$0(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getAdapterPosition() == i && ProfileActivity.this.birthdayRow == i && viewHolder.getItemViewType() == 2) {
                onBindViewHolder(viewHolder, i);
            }
        }

        public void lambda$onBindViewHolder$3(View view) {
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

        private CharSequence alsoUsernamesString(String str, ArrayList<TLRPC$TL_username> arrayList, CharSequence charSequence) {
            if (arrayList == null) {
                return charSequence;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            int i = 0;
            while (i < arrayList2.size()) {
                if (!((TLRPC$TL_username) arrayList2.get(i)).active || (str != null && str.equals(((TLRPC$TL_username) arrayList2.get(i)).username))) {
                    arrayList2.remove(i);
                    i--;
                }
                i++;
            }
            CharSequence charSequence2 = charSequence;
            if (arrayList2.size() > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    TLRPC$TL_username tLRPC$TL_username = (TLRPC$TL_username) arrayList2.get(i2);
                    SpannableString spannableString = new SpannableString("@" + tLRPC$TL_username.username);
                    spannableString.setSpan(makeUsernameLinkSpan(tLRPC$TL_username), 0, spannableString.length(), 33);
                    ProfileActivity profileActivity = ProfileActivity.this;
                    spannableString.setSpan(new ForegroundColorSpan(profileActivity.applyPeerColor(profileActivity.getThemedColor(Theme.key_chat_messageLinkIn), false)), 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    if (i2 < arrayList2.size() - 1) {
                        spannableStringBuilder.append((CharSequence) ", ");
                    }
                }
                String string = LocaleController.getString("UsernameAlso", R.string.UsernameAlso);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string);
                int indexOf = string.indexOf("%1$s");
                charSequence2 = spannableStringBuilder2;
                if (indexOf >= 0) {
                    spannableStringBuilder2.replace(indexOf, indexOf + 4, (CharSequence) spannableStringBuilder);
                    charSequence2 = spannableStringBuilder2;
                }
            }
            return charSequence2;
        }

        public ClickableSpan makeUsernameLinkSpan(TLRPC$TL_username tLRPC$TL_username) {
            ClickableSpan clickableSpan = this.usernameSpans.get(tLRPC$TL_username);
            if (clickableSpan != null) {
                return clickableSpan;
            }
            AnonymousClass10 anonymousClass10 = new AnonymousClass10(tLRPC$TL_username, tLRPC$TL_username.username);
            this.usernameSpans.put(tLRPC$TL_username, anonymousClass10);
            return anonymousClass10;
        }

        public class AnonymousClass10 extends ClickableSpan {
            final TLRPC$TL_username val$usernameObj;
            final String val$usernameRaw;

            AnonymousClass10(TLRPC$TL_username tLRPC$TL_username, String str) {
                this.val$usernameObj = tLRPC$TL_username;
                this.val$usernameRaw = str;
            }

            @Override
            public void onClick(View view) {
                if (!this.val$usernameObj.editable) {
                    if (ProfileActivity.this.loadingSpan == this) {
                        return;
                    }
                    ProfileActivity.this.setLoadingSpan(this);
                    TL_fragment$TL_getCollectibleInfo tL_fragment$TL_getCollectibleInfo = new TL_fragment$TL_getCollectibleInfo();
                    TL_fragment$TL_inputCollectibleUsername tL_fragment$TL_inputCollectibleUsername = new TL_fragment$TL_inputCollectibleUsername();
                    tL_fragment$TL_inputCollectibleUsername.username = this.val$usernameObj.username;
                    tL_fragment$TL_getCollectibleInfo.collectible = tL_fragment$TL_inputCollectibleUsername;
                    ConnectionsManager connectionsManager = ProfileActivity.this.getConnectionsManager();
                    final TLRPC$TL_username tLRPC$TL_username = this.val$usernameObj;
                    ProfileActivity.this.getConnectionsManager().bindRequestToGuid(connectionsManager.sendRequest(tL_fragment$TL_getCollectibleInfo, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            ProfileActivity.ListAdapter.AnonymousClass10.this.lambda$onClick$1(tLRPC$TL_username, tLObject, tLRPC$TL_error);
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

            public void lambda$onClick$1(final TLRPC$TL_username tLRPC$TL_username, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ProfileActivity.ListAdapter.AnonymousClass10.this.lambda$onClick$0(tLObject, tLRPC$TL_username, tLRPC$TL_error);
                    }
                });
            }

            public void lambda$onClick$0(TLObject tLObject, TLRPC$TL_username tLRPC$TL_username, TLRPC$TL_error tLRPC$TL_error) {
                ProfileActivity.this.setLoadingSpan(null);
                if (tLObject instanceof TL_fragment$TL_collectibleInfo) {
                    TLObject user = ProfileActivity.this.userId != 0 ? ProfileActivity.this.getMessagesController().getUser(Long.valueOf(ProfileActivity.this.userId)) : ProfileActivity.this.getMessagesController().getChat(Long.valueOf(ProfileActivity.this.chatId));
                    if (ProfileActivity.this.getContext() == null) {
                        return;
                    }
                    FragmentUsernameBottomSheet.open(ProfileActivity.this.getContext(), 0, tLRPC$TL_username.username, user, (TL_fragment$TL_collectibleInfo) tLObject, ProfileActivity.this.getResourceProvider());
                    return;
                }
                BulletinFactory.showError(tLRPC$TL_error);
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
                if (adapterPosition != ProfileActivity.this.notificationRow && adapterPosition != ProfileActivity.this.numberRow && adapterPosition != ProfileActivity.this.privacyRow && adapterPosition != ProfileActivity.this.languageRow && adapterPosition != ProfileActivity.this.setUsernameRow && adapterPosition != ProfileActivity.this.bioRow && adapterPosition != ProfileActivity.this.versionRow && adapterPosition != ProfileActivity.this.dataRow && adapterPosition != ProfileActivity.this.chatRow && adapterPosition != ProfileActivity.this.questionRow && adapterPosition != ProfileActivity.this.devicesRow && adapterPosition != ProfileActivity.this.filtersRow && adapterPosition != ProfileActivity.this.stickersRow && adapterPosition != ProfileActivity.this.faqRow && adapterPosition != ProfileActivity.this.policyRow && adapterPosition != ProfileActivity.this.sendLogsRow && adapterPosition != ProfileActivity.this.sendLastLogsRow && adapterPosition != ProfileActivity.this.clearLogsRow && adapterPosition != ProfileActivity.this.switchBackendRow && adapterPosition != ProfileActivity.this.setAvatarRow && adapterPosition != ProfileActivity.this.addToGroupButtonRow && adapterPosition != ProfileActivity.this.premiumRow && adapterPosition != ProfileActivity.this.premiumGiftingRow && adapterPosition != ProfileActivity.this.businessRow && adapterPosition != ProfileActivity.this.liteModeRow) {
                    ProfileActivity profileActivity = ProfileActivity.this;
                    if (adapterPosition != profileActivity.birthdayRow && adapterPosition != profileActivity.channelRow && adapterPosition != ProfileActivity.this.starsRow) {
                        return false;
                    }
                }
                return true;
            }
            View view = viewHolder.itemView;
            if (view instanceof UserCell) {
                Object currentObject = ((UserCell) view).getCurrentObject();
                if ((currentObject instanceof TLRPC$User) && UserObject.isUserSelf((TLRPC$User) currentObject)) {
                    return false;
                }
            }
            int itemViewType = viewHolder.getItemViewType();
            return (itemViewType == 1 || itemViewType == 5 || itemViewType == 7 || itemViewType == 11 || itemViewType == 12 || itemViewType == 13 || itemViewType == 9 || itemViewType == 10) ? false : true;
        }

        @Override
        public int getItemCount() {
            return ProfileActivity.this.rowCount;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == ProfileActivity.this.infoHeaderRow || i == ProfileActivity.this.membersHeaderRow || i == ProfileActivity.this.settingsSectionRow2 || i == ProfileActivity.this.numberSectionRow || i == ProfileActivity.this.helpHeaderRow || i == ProfileActivity.this.debugHeaderRow) {
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
            if (i == ProfileActivity.this.userInfoRow || i == ProfileActivity.this.channelInfoRow || i == ProfileActivity.this.bioRow) {
                return 3;
            }
            if (i == ProfileActivity.this.settingsTimerRow || i == ProfileActivity.this.settingsKeyRow || i == ProfileActivity.this.reportRow || i == ProfileActivity.this.reportReactionRow || i == ProfileActivity.this.subscribersRow || i == ProfileActivity.this.subscribersRequestsRow || i == ProfileActivity.this.administratorsRow || i == ProfileActivity.this.settingsRow || i == ProfileActivity.this.blockedUsersRow || i == ProfileActivity.this.addMemberRow || i == ProfileActivity.this.joinRow || i == ProfileActivity.this.unblockRow || i == ProfileActivity.this.sendMessageRow || i == ProfileActivity.this.notificationRow || i == ProfileActivity.this.privacyRow || i == ProfileActivity.this.languageRow || i == ProfileActivity.this.dataRow || i == ProfileActivity.this.chatRow || i == ProfileActivity.this.questionRow || i == ProfileActivity.this.devicesRow || i == ProfileActivity.this.filtersRow || i == ProfileActivity.this.stickersRow || i == ProfileActivity.this.faqRow || i == ProfileActivity.this.policyRow || i == ProfileActivity.this.sendLogsRow || i == ProfileActivity.this.sendLastLogsRow || i == ProfileActivity.this.clearLogsRow || i == ProfileActivity.this.switchBackendRow || i == ProfileActivity.this.setAvatarRow || i == ProfileActivity.this.addToGroupButtonRow || i == ProfileActivity.this.addToContactsRow || i == ProfileActivity.this.liteModeRow || i == ProfileActivity.this.premiumGiftingRow || i == ProfileActivity.this.businessRow) {
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
            if (i == ProfileActivity.this.infoSectionRow || i == ProfileActivity.this.lastSectionRow || i == ProfileActivity.this.membersSectionRow || i == ProfileActivity.this.secretSettingsSectionRow || i == ProfileActivity.this.settingsSectionRow || i == ProfileActivity.this.devicesSectionRow || i == ProfileActivity.this.helpSectionCell || i == ProfileActivity.this.setAvatarSectionRow || i == ProfileActivity.this.passwordSuggestionSectionRow || i == ProfileActivity.this.phoneSuggestionSectionRow || i == ProfileActivity.this.premiumSectionsRow || i == ProfileActivity.this.reportDividerRow || i == ProfileActivity.this.channelDividerRow || i == ProfileActivity.this.graceSuggestionSectionRow) {
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
            return i == ProfileActivity.this.channelRow ? 23 : 0;
        }
    }

    public class SearchAdapter extends RecyclerListView.SelectionAdapter {
        private TLRPC$WebPage faqWebPage;
        private String lastSearchString;
        private boolean loadingFaqPage;
        private Context mContext;
        private Runnable searchRunnable;
        private boolean searchWas;
        private SearchResult[] searchArray = onCreateSearchArray();
        private ArrayList<MessagesController.FaqSearchResult> faqSearchArray = new ArrayList<>();
        private ArrayList<CharSequence> resultNames = new ArrayList<>();
        private ArrayList<SearchResult> searchResults = new ArrayList<>();
        private ArrayList<MessagesController.FaqSearchResult> faqSearchResults = new ArrayList<>();
        private ArrayList<Object> recentSearches = new ArrayList<>();

        public class SearchResult {
            private int guid;
            private int iconResId;
            private int num;
            private Runnable openRunnable;
            private String[] path;
            private String rowName;
            private String searchTitle;

            public SearchResult(SearchAdapter searchAdapter, int i, String str, int i2, Runnable runnable) {
                this(i, str, null, null, null, i2, runnable);
            }

            public SearchResult(SearchAdapter searchAdapter, int i, String str, String str2, int i2, Runnable runnable) {
                this(i, str, null, str2, null, i2, runnable);
            }

            public SearchResult(SearchAdapter searchAdapter, int i, String str, String str2, String str3, int i2, Runnable runnable) {
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

            public void open() {
                this.openRunnable.run();
                AndroidUtilities.scrollToFragmentRow(((BaseFragment) ProfileActivity.this).parentLayout, this.rowName);
            }
        }

        public SearchAdapter(Context context) {
            this.mContext = context;
            updateSearchArray();
        }

        public void updateSearchArray() {
            String[] strArr;
            SearchResult searchResult;
            HashMap hashMap = new HashMap();
            int i = 0;
            while (true) {
                SearchResult[] searchResultArr = this.searchArray;
                if (i >= searchResultArr.length) {
                    break;
                }
                if (searchResultArr[i] != null) {
                    hashMap.put(Integer.valueOf(searchResultArr[i].guid), this.searchArray[i]);
                }
                i++;
            }
            Set<String> stringSet = MessagesController.getGlobalMainSettings().getStringSet("settingsSearchRecent2", null);
            if (stringSet != null) {
                Iterator<String> it = stringSet.iterator();
                while (it.hasNext()) {
                    try {
                        SerializedData serializedData = new SerializedData(Utilities.hexToBytes(it.next()));
                        int readInt32 = serializedData.readInt32(false);
                        int readInt322 = serializedData.readInt32(false);
                        if (readInt322 == 0) {
                            String readString = serializedData.readString(false);
                            int readInt323 = serializedData.readInt32(false);
                            if (readInt323 > 0) {
                                strArr = new String[readInt323];
                                for (int i2 = 0; i2 < readInt323; i2++) {
                                    strArr[i2] = serializedData.readString(false);
                                }
                            } else {
                                strArr = null;
                            }
                            MessagesController.FaqSearchResult faqSearchResult = new MessagesController.FaqSearchResult(readString, strArr, serializedData.readString(false));
                            faqSearchResult.num = readInt32;
                            this.recentSearches.add(faqSearchResult);
                        } else if (readInt322 == 1 && (searchResult = (SearchResult) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                            searchResult.num = readInt32;
                            this.recentSearches.add(searchResult);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            Collections.sort(this.recentSearches, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int lambda$updateSearchArray$0;
                    lambda$updateSearchArray$0 = ProfileActivity.SearchAdapter.this.lambda$updateSearchArray$0(obj, obj2);
                    return lambda$updateSearchArray$0;
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

        public SearchResult[] onCreateSearchArray() {
            SearchResult[] searchResultArr = new SearchResult[143];
            searchResultArr[0] = new SearchResult(this, 500, LocaleController.getString("EditName", R.string.EditName), 0, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$1();
                }
            });
            searchResultArr[1] = new SearchResult(this, 501, LocaleController.getString("ChangePhoneNumber", R.string.ChangePhoneNumber), 0, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$2();
                }
            });
            searchResultArr[2] = new SearchResult(this, 502, LocaleController.getString("AddAnotherAccount", R.string.AddAnotherAccount), 0, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$3();
                }
            });
            searchResultArr[3] = new SearchResult(this, 503, LocaleController.getString("UserBio", R.string.UserBio), 0, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$4();
                }
            });
            String string = LocaleController.getString(R.string.AddPhoto);
            final ProfileActivity profileActivity = ProfileActivity.this;
            searchResultArr[4] = new SearchResult(this, 504, string, 0, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.access$7600(ProfileActivity.this);
                }
            });
            int i = R.string.NotificationsAndSounds;
            String string2 = LocaleController.getString("NotificationsAndSounds", i);
            int i2 = R.drawable.msg_notifications;
            searchResultArr[5] = new SearchResult(this, 1, string2, i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$6();
                }
            });
            searchResultArr[6] = new SearchResult(this, 2, LocaleController.getString("NotificationsPrivateChats", R.string.NotificationsPrivateChats), LocaleController.getString("NotificationsAndSounds", i), i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$7();
                }
            });
            searchResultArr[7] = new SearchResult(this, 3, LocaleController.getString("NotificationsGroups", R.string.NotificationsGroups), LocaleController.getString("NotificationsAndSounds", i), i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$8();
                }
            });
            searchResultArr[8] = new SearchResult(this, 4, LocaleController.getString("NotificationsChannels", R.string.NotificationsChannels), LocaleController.getString("NotificationsAndSounds", i), i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$9();
                }
            });
            searchResultArr[9] = new SearchResult(this, 5, LocaleController.getString("VoipNotificationSettings", R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString("NotificationsAndSounds", i), i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$10();
                }
            });
            searchResultArr[10] = new SearchResult(this, 6, LocaleController.getString("BadgeNumber", R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString("NotificationsAndSounds", i), i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$11();
                }
            });
            searchResultArr[11] = new SearchResult(this, 7, LocaleController.getString("InAppNotifications", R.string.InAppNotifications), "inappSectionRow", LocaleController.getString("NotificationsAndSounds", i), i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$12();
                }
            });
            searchResultArr[12] = new SearchResult(this, 8, LocaleController.getString("ContactJoined", R.string.ContactJoined), "contactJoinedRow", LocaleController.getString("NotificationsAndSounds", i), i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$13();
                }
            });
            searchResultArr[13] = new SearchResult(this, 9, LocaleController.getString("PinnedMessages", R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString("NotificationsAndSounds", i), i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$14();
                }
            });
            searchResultArr[14] = new SearchResult(this, 10, LocaleController.getString("ResetAllNotifications", R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString("NotificationsAndSounds", i), i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$15();
                }
            });
            searchResultArr[15] = new SearchResult(this, 11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString("NotificationsAndSounds", i), i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$16();
                }
            });
            searchResultArr[16] = new SearchResult(this, 12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString("NotificationsAndSounds", i), i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$17();
                }
            });
            searchResultArr[17] = new SearchResult(this, 13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString("NotificationsAndSounds", i), i2, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$18();
                }
            });
            int i3 = R.string.PrivacySettings;
            String string3 = LocaleController.getString("PrivacySettings", i3);
            int i4 = R.drawable.msg_secret;
            searchResultArr[18] = new SearchResult(this, 100, string3, i4, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$19();
                }
            });
            String string4 = LocaleController.getString("TwoStepVerification", R.string.TwoStepVerification);
            String string5 = LocaleController.getString("PrivacySettings", i3);
            int i5 = R.drawable.msg2_secret;
            searchResultArr[19] = new SearchResult(this, R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, string4, string5, i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$20();
                }
            });
            searchResultArr[20] = new SearchResult(this, 124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(i3), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$21();
                }
            });
            searchResultArr[21] = new SearchResult(this, R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, LocaleController.getString("Passcode", R.string.Passcode), LocaleController.getString("PrivacySettings", i3), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$22();
                }
            });
            searchResultArr[22] = SharedConfig.hasEmailLogin ? new SearchResult(this, 125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString("PrivacySettings", i3), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$23();
                }
            }) : null;
            searchResultArr[23] = new SearchResult(this, 101, LocaleController.getString("BlockedUsers", R.string.BlockedUsers), LocaleController.getString("PrivacySettings", i3), i4, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$24();
                }
            });
            searchResultArr[24] = new SearchResult(this, R.styleable.AppCompatTheme_textColorAlertDialogListItem, LocaleController.getString("SessionsTitle", R.string.SessionsTitle), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$25();
                }
            });
            searchResultArr[25] = new SearchResult(this, R.styleable.AppCompatTheme_textAppearanceListItemSmall, LocaleController.getString("PrivacyPhone", R.string.PrivacyPhone), LocaleController.getString("PrivacySettings", i3), i4, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$26();
                }
            });
            searchResultArr[26] = new SearchResult(this, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, LocaleController.getString("PrivacyLastSeen", R.string.PrivacyLastSeen), LocaleController.getString("PrivacySettings", i3), i4, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$27();
                }
            });
            searchResultArr[27] = new SearchResult(this, R.styleable.AppCompatTheme_textAppearanceListItem, LocaleController.getString("PrivacyProfilePhoto", R.string.PrivacyProfilePhoto), LocaleController.getString("PrivacySettings", i3), i4, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$28();
                }
            });
            searchResultArr[28] = new SearchResult(this, R.styleable.AppCompatTheme_textAppearanceListItemSecondary, LocaleController.getString("PrivacyForwards", R.string.PrivacyForwards), LocaleController.getString("PrivacySettings", i3), i4, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$29();
                }
            });
            searchResultArr[29] = new SearchResult(this, 122, LocaleController.getString("PrivacyP2P", R.string.PrivacyP2P), LocaleController.getString("PrivacySettings", i3), i4, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$30();
                }
            });
            int i6 = R.string.Calls;
            searchResultArr[30] = new SearchResult(this, R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, LocaleController.getString("Calls", i6), LocaleController.getString("PrivacySettings", i3), i4, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$31();
                }
            });
            searchResultArr[31] = new SearchResult(this, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, LocaleController.getString("PrivacyInvites", R.string.PrivacyInvites), LocaleController.getString("PrivacySettings", i3), i4, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$32();
                }
            });
            searchResultArr[32] = new SearchResult(this, 123, LocaleController.getString("PrivacyVoiceMessages", R.string.PrivacyVoiceMessages), LocaleController.getString("PrivacySettings", i3), i4, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$33();
                }
            });
            searchResultArr[33] = ProfileActivity.this.getMessagesController().autoarchiveAvailable ? new SearchResult(this, 121, LocaleController.getString("ArchiveAndMute", R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString("PrivacySettings", i3), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$34();
                }
            }) : null;
            searchResultArr[34] = new SearchResult(this, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, LocaleController.getString("DeleteAccountIfAwayFor2", R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString("PrivacySettings", i3), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$35();
                }
            });
            searchResultArr[35] = new SearchResult(this, R.styleable.AppCompatTheme_toolbarStyle, LocaleController.getString("PrivacyPaymentsClear", R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString("PrivacySettings", i3), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$36();
                }
            });
            searchResultArr[36] = new SearchResult(this, R.styleable.AppCompatTheme_tooltipForegroundColor, LocaleController.getString("WebSessionsTitle", R.string.WebSessionsTitle), LocaleController.getString("PrivacySettings", i3), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$37();
                }
            });
            searchResultArr[37] = new SearchResult(this, R.styleable.AppCompatTheme_tooltipFrameBackground, LocaleController.getString("SyncContactsDelete", R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString("PrivacySettings", i3), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$38();
                }
            });
            searchResultArr[38] = new SearchResult(this, 116, LocaleController.getString("SyncContacts", R.string.SyncContacts), "contactsSyncRow", LocaleController.getString("PrivacySettings", i3), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$39();
                }
            });
            searchResultArr[39] = new SearchResult(this, 117, LocaleController.getString("SuggestContacts", R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString("PrivacySettings", i3), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$40();
                }
            });
            searchResultArr[40] = new SearchResult(this, 118, LocaleController.getString("MapPreviewProvider", R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString("PrivacySettings", i3), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$41();
                }
            });
            searchResultArr[41] = new SearchResult(this, 119, LocaleController.getString("SecretWebPage", R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString("PrivacySettings", i3), i5, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$42();
                }
            });
            int i7 = R.string.Devices;
            String string6 = LocaleController.getString(i7);
            int i8 = R.drawable.msg2_devices;
            searchResultArr[42] = new SearchResult(this, 120, string6, i8, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$43();
                }
            });
            searchResultArr[43] = new SearchResult(this, 121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(i7), i8, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$44();
                }
            });
            searchResultArr[44] = new SearchResult(this, 122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(i7), i8, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$45();
                }
            });
            int i9 = R.string.DataSettings;
            String string7 = LocaleController.getString("DataSettings", i9);
            int i10 = R.drawable.msg2_data;
            searchResultArr[45] = new SearchResult(this, 200, string7, i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$46();
                }
            });
            searchResultArr[46] = new SearchResult(this, 201, LocaleController.getString("DataUsage", R.string.DataUsage), "usageSectionRow", LocaleController.getString("DataSettings", i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$47();
                }
            });
            int i11 = R.string.StorageUsage;
            searchResultArr[47] = new SearchResult(this, 202, LocaleController.getString("StorageUsage", i11), LocaleController.getString("DataSettings", i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$48();
                }
            });
            searchResultArr[48] = new SearchResult(203, LocaleController.getString("KeepMedia", R.string.KeepMedia), "keepMediaRow", LocaleController.getString("DataSettings", i9), LocaleController.getString("StorageUsage", i11), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$49();
                }
            });
            searchResultArr[49] = new SearchResult(204, LocaleController.getString("ClearMediaCache", R.string.ClearMediaCache), "cacheRow", LocaleController.getString("DataSettings", i9), LocaleController.getString("StorageUsage", i11), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$50();
                }
            });
            searchResultArr[50] = new SearchResult(205, LocaleController.getString("LocalDatabase", R.string.LocalDatabase), "databaseRow", LocaleController.getString("DataSettings", i9), LocaleController.getString("StorageUsage", i11), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$51();
                }
            });
            searchResultArr[51] = new SearchResult(this, 206, LocaleController.getString("NetworkUsage", R.string.NetworkUsage), LocaleController.getString("DataSettings", i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$52();
                }
            });
            searchResultArr[52] = new SearchResult(this, 207, LocaleController.getString("AutomaticMediaDownload", R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString("DataSettings", i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$53();
                }
            });
            searchResultArr[53] = new SearchResult(this, 208, LocaleController.getString("WhenUsingMobileData", R.string.WhenUsingMobileData), LocaleController.getString("DataSettings", i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$54();
                }
            });
            searchResultArr[54] = new SearchResult(this, 209, LocaleController.getString("WhenConnectedOnWiFi", R.string.WhenConnectedOnWiFi), LocaleController.getString("DataSettings", i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$55();
                }
            });
            searchResultArr[55] = new SearchResult(this, 210, LocaleController.getString("WhenRoaming", R.string.WhenRoaming), LocaleController.getString("DataSettings", i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$56();
                }
            });
            searchResultArr[56] = new SearchResult(this, 211, LocaleController.getString("ResetAutomaticMediaDownload", R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString("DataSettings", i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$57();
                }
            });
            searchResultArr[57] = new SearchResult(this, 215, LocaleController.getString("Streaming", R.string.Streaming), "streamSectionRow", LocaleController.getString("DataSettings", i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$58();
                }
            });
            searchResultArr[58] = new SearchResult(this, 216, LocaleController.getString("EnableStreaming", R.string.EnableStreaming), "enableStreamRow", LocaleController.getString("DataSettings", i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$59();
                }
            });
            searchResultArr[59] = new SearchResult(this, 217, LocaleController.getString("Calls", i6), "callsSectionRow", LocaleController.getString("DataSettings", i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$60();
                }
            });
            searchResultArr[60] = new SearchResult(this, 218, LocaleController.getString("VoipUseLessData", R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString("DataSettings", i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$61();
                }
            });
            searchResultArr[61] = new SearchResult(this, 219, LocaleController.getString("VoipQuickReplies", R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString("DataSettings", i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$62();
                }
            });
            int i12 = R.string.ProxySettings;
            searchResultArr[62] = new SearchResult(this, 220, LocaleController.getString("ProxySettings", i12), LocaleController.getString("DataSettings", i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$63();
                }
            });
            searchResultArr[63] = new SearchResult(221, LocaleController.getString("UseProxyForCalls", R.string.UseProxyForCalls), "callsRow", LocaleController.getString("DataSettings", i9), LocaleController.getString("ProxySettings", i12), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$64();
                }
            });
            searchResultArr[64] = new SearchResult(this, R.styleable.AppCompatTheme_textColorSearchUrl, LocaleController.getString("PrivacyDeleteCloudDrafts", R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString("DataSettings", i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$65();
                }
            });
            int i13 = R.string.SaveToGallery;
            searchResultArr[65] = new SearchResult(this, 222, LocaleController.getString(i13), "saveToGallerySectionRow", LocaleController.getString(i9), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$66();
                }
            });
            searchResultArr[66] = new SearchResult(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(i9), LocaleController.getString(i13), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$67();
                }
            });
            searchResultArr[67] = new SearchResult(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(i9), LocaleController.getString(i13), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$68();
                }
            });
            searchResultArr[68] = new SearchResult(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(i9), LocaleController.getString(i13), i10, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$69();
                }
            });
            int i14 = R.string.ChatSettings;
            String string8 = LocaleController.getString("ChatSettings", i14);
            int i15 = R.drawable.msg2_discussion;
            searchResultArr[69] = new SearchResult(this, 300, string8, i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$70();
                }
            });
            searchResultArr[70] = new SearchResult(this, 301, LocaleController.getString("TextSizeHeader", R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString("ChatSettings", i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$71();
                }
            });
            searchResultArr[71] = new SearchResult(this, 302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString("ChatSettings", i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$72();
                }
            });
            String string9 = LocaleController.getString("SetColor", R.string.SetColor);
            String string10 = LocaleController.getString("ChatSettings", i14);
            int i16 = R.string.ChatBackground;
            searchResultArr[72] = new SearchResult(303, string9, null, string10, LocaleController.getString("ChatBackground", i16), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$73();
                }
            });
            searchResultArr[73] = new SearchResult(304, LocaleController.getString("ResetChatBackgrounds", R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString("ChatSettings", i14), LocaleController.getString("ChatBackground", i16), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$74();
                }
            });
            searchResultArr[74] = new SearchResult(this, 306, LocaleController.getString("ColorTheme", R.string.ColorTheme), "themeHeaderRow", LocaleController.getString("ChatSettings", i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$75();
                }
            });
            int i17 = R.string.BrowseThemes;
            searchResultArr[75] = new SearchResult(this, 319, LocaleController.getString(i17), null, LocaleController.getString(i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$76();
                }
            });
            searchResultArr[76] = new SearchResult(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(i14), LocaleController.getString(i17), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$77();
                }
            });
            searchResultArr[77] = new SearchResult(this, 321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString("ChatSettings", i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$78();
                }
            });
            searchResultArr[78] = new SearchResult(this, 322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString("ChatSettings", i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$79();
                }
            });
            searchResultArr[79] = new SearchResult(this, 323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString("ChatSettings", i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$80();
                }
            });
            searchResultArr[80] = new SearchResult(this, 324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString("ChatSettings", i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$81();
                }
            });
            searchResultArr[81] = new SearchResult(this, 305, LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), LocaleController.getString("ChatSettings", i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$82();
                }
            });
            searchResultArr[82] = new SearchResult(this, 307, LocaleController.getString("ChromeCustomTabs", R.string.ChromeCustomTabs), "customTabsRow", LocaleController.getString("ChatSettings", i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$83();
                }
            });
            searchResultArr[83] = new SearchResult(this, 328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString("ChatSettings", i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$84();
                }
            });
            searchResultArr[84] = new SearchResult(this, 327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString("ChatSettings", i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$85();
                }
            });
            searchResultArr[85] = new SearchResult(this, 310, LocaleController.getString("RaiseToSpeak", R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString("ChatSettings", i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$86();
                }
            });
            searchResultArr[86] = new SearchResult(this, 326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString("ChatSettings", i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$87();
                }
            });
            searchResultArr[87] = new SearchResult(this, 325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString("ChatSettings", i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$88();
                }
            });
            searchResultArr[88] = new SearchResult(this, 308, LocaleController.getString("DirectShare", R.string.DirectShare), "directShareRow", LocaleController.getString("ChatSettings", i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$89();
                }
            });
            searchResultArr[89] = new SearchResult(this, 311, LocaleController.getString("SendByEnter", R.string.SendByEnter), "sendByEnterRow", LocaleController.getString("ChatSettings", i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$90();
                }
            });
            searchResultArr[90] = new SearchResult(this, 318, LocaleController.getString("DistanceUnits", R.string.DistanceUnits), "distanceRow", LocaleController.getString("ChatSettings", i14), i15, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$91();
                }
            });
            int i18 = R.string.StickersName;
            String string11 = LocaleController.getString(i18);
            int i19 = R.drawable.msg2_sticker;
            searchResultArr[91] = new SearchResult(this, 600, string11, i19, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$92();
                }
            });
            searchResultArr[92] = new SearchResult(this, 601, LocaleController.getString("SuggestStickers", R.string.SuggestStickers), "suggestRow", LocaleController.getString(i18), i19, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$93();
                }
            });
            searchResultArr[93] = new SearchResult(this, 602, LocaleController.getString("FeaturedStickers", R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(i18), i19, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$94();
                }
            });
            searchResultArr[94] = new SearchResult(this, 603, LocaleController.getString("Masks", R.string.Masks), null, LocaleController.getString(i18), i19, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$95();
                }
            });
            searchResultArr[95] = new SearchResult(this, 604, LocaleController.getString("ArchivedStickers", R.string.ArchivedStickers), null, LocaleController.getString(i18), i19, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$96();
                }
            });
            searchResultArr[96] = new SearchResult(this, 605, LocaleController.getString("ArchivedMasks", R.string.ArchivedMasks), null, LocaleController.getString(i18), i19, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$97();
                }
            });
            searchResultArr[97] = new SearchResult(this, 606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(i18), i19, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$98();
                }
            });
            searchResultArr[98] = new SearchResult(this, 607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(i18), i19, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$99();
                }
            });
            int i20 = R.string.Emoji;
            String string12 = LocaleController.getString(i20);
            String string13 = LocaleController.getString(i18);
            int i21 = R.drawable.input_smile;
            searchResultArr[99] = new SearchResult(this, 608, string12, null, string13, i21, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$100();
                }
            });
            searchResultArr[100] = new SearchResult(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(i18), LocaleController.getString(i20), i21, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$101();
                }
            });
            searchResultArr[101] = new SearchResult(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(i18), LocaleController.getString(i20), i21, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$102();
                }
            });
            searchResultArr[102] = new SearchResult(this, 611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(i18), i19, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$103();
                }
            });
            int i22 = R.string.Filters;
            String string14 = LocaleController.getString(i22);
            int i23 = R.drawable.msg2_folder;
            searchResultArr[103] = new SearchResult(this, 700, string14, null, i23, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$104();
                }
            });
            searchResultArr[104] = new SearchResult(this, 701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(i22), i23, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$105();
                }
            });
            searchResultArr[105] = isPremiumFeatureAvailable(-1) ? new SearchResult(this, 800, LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$106();
                }
            }) : null;
            searchResultArr[106] = isPremiumFeatureAvailable(0) ? new SearchResult(this, 801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$107();
                }
            }) : null;
            searchResultArr[107] = isPremiumFeatureAvailable(11) ? new SearchResult(this, 802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$108();
                }
            }) : null;
            searchResultArr[108] = isPremiumFeatureAvailable(1) ? new SearchResult(this, 803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$109();
                }
            }) : null;
            searchResultArr[109] = isPremiumFeatureAvailable(2) ? new SearchResult(this, 804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$110();
                }
            }) : null;
            searchResultArr[110] = isPremiumFeatureAvailable(8) ? new SearchResult(this, 805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$111();
                }
            }) : null;
            searchResultArr[111] = isPremiumFeatureAvailable(3) ? new SearchResult(this, 806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$112();
                }
            }) : null;
            searchResultArr[112] = isPremiumFeatureAvailable(4) ? new SearchResult(this, 807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$113();
                }
            }) : null;
            searchResultArr[113] = isPremiumFeatureAvailable(5) ? new SearchResult(this, 808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$114();
                }
            }) : null;
            searchResultArr[114] = isPremiumFeatureAvailable(9) ? new SearchResult(this, 809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$115();
                }
            }) : null;
            searchResultArr[115] = isPremiumFeatureAvailable(6) ? new SearchResult(this, 810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$116();
                }
            }) : null;
            searchResultArr[116] = isPremiumFeatureAvailable(7) ? new SearchResult(this, 811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$117();
                }
            }) : null;
            searchResultArr[117] = isPremiumFeatureAvailable(10) ? new SearchResult(this, 812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$118();
                }
            }) : null;
            searchResultArr[118] = isPremiumFeatureAvailable(12) ? new SearchResult(this, 813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$119();
                }
            }) : null;
            int i24 = R.string.PowerUsage;
            String string15 = LocaleController.getString(i24);
            int i25 = R.drawable.msg2_battery;
            searchResultArr[119] = new SearchResult(this, 900, string15, null, i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$120();
                }
            });
            int i26 = R.string.LiteOptionsStickers;
            searchResultArr[120] = new SearchResult(this, 901, LocaleController.getString(i26), LocaleController.getString(i24), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$121();
                }
            });
            int i27 = R.string.LiteOptionsAutoplayKeyboard;
            searchResultArr[121] = new SearchResult(902, LocaleController.getString(i27), null, LocaleController.getString(i24), LocaleController.getString(i26), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$122();
                }
            });
            int i28 = R.string.LiteOptionsAutoplayChat;
            searchResultArr[122] = new SearchResult(903, LocaleController.getString(i28), null, LocaleController.getString(i24), LocaleController.getString(i26), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$123();
                }
            });
            int i29 = R.string.LiteOptionsEmoji;
            searchResultArr[123] = new SearchResult(this, 904, LocaleController.getString(i29), LocaleController.getString(i24), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$124();
                }
            });
            searchResultArr[124] = new SearchResult(905, LocaleController.getString(i27), null, LocaleController.getString(i24), LocaleController.getString(i29), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$125();
                }
            });
            searchResultArr[125] = new SearchResult(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(i24), LocaleController.getString(i29), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$126();
                }
            });
            searchResultArr[126] = new SearchResult(907, LocaleController.getString(i28), null, LocaleController.getString(i24), LocaleController.getString(i29), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$127();
                }
            });
            int i30 = R.string.LiteOptionsChat;
            searchResultArr[127] = new SearchResult(this, 908, LocaleController.getString(i30), LocaleController.getString(i24), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$128();
                }
            });
            searchResultArr[128] = new SearchResult(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(i24), LocaleController.getString(i30), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$129();
                }
            });
            searchResultArr[129] = new SearchResult(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(i24), LocaleController.getString(i30), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$130();
                }
            });
            searchResultArr[130] = new SearchResult(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(i24), LocaleController.getString(i30), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$131();
                }
            });
            searchResultArr[131] = SharedConfig.getDevicePerformanceClass() >= 1 ? new SearchResult(326, LocaleController.getString(R.string.LiteOptionsBlur), null, LocaleController.getString(i24), LocaleController.getString(i30), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$132();
                }
            }) : null;
            searchResultArr[132] = new SearchResult(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(i24), LocaleController.getString(i30), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$133();
                }
            });
            searchResultArr[133] = new SearchResult(this, 913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(i24), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$134();
                }
            });
            searchResultArr[134] = new SearchResult(this, 214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(i24), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$135();
                }
            });
            searchResultArr[135] = new SearchResult(this, 213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(i24), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$136();
                }
            });
            searchResultArr[136] = new SearchResult(this, 914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(i24), i25, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$137();
                }
            });
            int i31 = R.string.Language;
            String string16 = LocaleController.getString("Language", i31);
            int i32 = R.drawable.msg2_language;
            searchResultArr[137] = new SearchResult(this, 400, string16, i32, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$138();
                }
            });
            searchResultArr[138] = new SearchResult(this, 405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(i31), i32, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$139();
                }
            });
            searchResultArr[139] = MessagesController.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).getTranslateController().isContextTranslateEnabled() ? new SearchResult(this, 406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(i31), i32, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$140();
                }
            }) : null;
            String string17 = LocaleController.getString("AskAQuestion", R.string.AskAQuestion);
            int i33 = R.string.SettingsHelp;
            String string18 = LocaleController.getString("SettingsHelp", i33);
            int i34 = R.drawable.msg2_help;
            searchResultArr[140] = new SearchResult(this, 402, string17, string18, i34, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$141();
                }
            });
            searchResultArr[141] = new SearchResult(this, 403, LocaleController.getString("TelegramFAQ", R.string.TelegramFAQ), LocaleController.getString("SettingsHelp", i33), i34, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$142();
                }
            });
            searchResultArr[142] = new SearchResult(this, 404, LocaleController.getString("PrivacyPolicy", R.string.PrivacyPolicy), LocaleController.getString("SettingsHelp", i33), i34, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$onCreateSearchArray$143();
                }
            });
            return searchResultArr;
        }

        public void lambda$onCreateSearchArray$1() {
            ProfileActivity profileActivity = ProfileActivity.this;
            profileActivity.presentFragment(new ChangeNameActivity(profileActivity.resourcesProvider));
        }

        public void lambda$onCreateSearchArray$2() {
            ProfileActivity.this.presentFragment(new ActionIntroActivity(3));
        }

        public void lambda$onCreateSearchArray$3() {
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
                ProfileActivity.this.presentFragment(new LoginActivity(i));
            }
        }

        public void lambda$onCreateSearchArray$4() {
            if (ProfileActivity.this.userInfo != null) {
                ProfileActivity.this.presentFragment(new ChangeBioActivity());
            }
        }

        public void lambda$onCreateSearchArray$6() {
            ProfileActivity.this.presentFragment(new NotificationsSettingsActivity());
        }

        public void lambda$onCreateSearchArray$7() {
            ProfileActivity.this.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
        }

        public void lambda$onCreateSearchArray$8() {
            ProfileActivity.this.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
        }

        public void lambda$onCreateSearchArray$9() {
            ProfileActivity.this.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
        }

        public void lambda$onCreateSearchArray$10() {
            ProfileActivity.this.presentFragment(new NotificationsSettingsActivity());
        }

        public void lambda$onCreateSearchArray$11() {
            ProfileActivity.this.presentFragment(new NotificationsSettingsActivity());
        }

        public void lambda$onCreateSearchArray$12() {
            ProfileActivity.this.presentFragment(new NotificationsSettingsActivity());
        }

        public void lambda$onCreateSearchArray$13() {
            ProfileActivity.this.presentFragment(new NotificationsSettingsActivity());
        }

        public void lambda$onCreateSearchArray$14() {
            ProfileActivity.this.presentFragment(new NotificationsSettingsActivity());
        }

        public void lambda$onCreateSearchArray$15() {
            ProfileActivity.this.presentFragment(new NotificationsSettingsActivity());
        }

        public void lambda$onCreateSearchArray$16() {
            ProfileActivity.this.presentFragment(new NotificationsSettingsActivity());
        }

        public void lambda$onCreateSearchArray$17() {
            ProfileActivity.this.presentFragment(new NotificationsSettingsActivity());
        }

        public void lambda$onCreateSearchArray$18() {
            ProfileActivity.this.presentFragment(new NotificationsSettingsActivity());
        }

        public void lambda$onCreateSearchArray$19() {
            ProfileActivity.this.presentFragment(new PrivacySettingsActivity());
        }

        public void lambda$onCreateSearchArray$20() {
            ProfileActivity.this.presentFragment(new TwoStepVerificationActivity());
        }

        public void lambda$onCreateSearchArray$21() {
            if (ProfileActivity.this.getUserConfig().getGlobalTTl() >= 0) {
                ProfileActivity.this.presentFragment(new AutoDeleteMessagesActivity());
            }
        }

        public void lambda$onCreateSearchArray$22() {
            ProfileActivity.this.presentFragment(PasscodeActivity.determineOpenFragment());
        }

        public void lambda$onCreateSearchArray$23() {
            ProfileActivity.this.presentFragment(new PrivacySettingsActivity());
        }

        public void lambda$onCreateSearchArray$24() {
            ProfileActivity.this.presentFragment(new PrivacyUsersActivity().loadBlocked());
        }

        public void lambda$onCreateSearchArray$25() {
            ProfileActivity.this.presentFragment(new SessionsActivity(0));
        }

        public void lambda$onCreateSearchArray$26() {
            ProfileActivity.this.presentFragment(new PrivacyControlActivity(6, true));
        }

        public void lambda$onCreateSearchArray$27() {
            ProfileActivity.this.presentFragment(new PrivacyControlActivity(0, true));
        }

        public void lambda$onCreateSearchArray$28() {
            ProfileActivity.this.presentFragment(new PrivacyControlActivity(4, true));
        }

        public void lambda$onCreateSearchArray$29() {
            ProfileActivity.this.presentFragment(new PrivacyControlActivity(5, true));
        }

        public void lambda$onCreateSearchArray$30() {
            ProfileActivity.this.presentFragment(new PrivacyControlActivity(3, true));
        }

        public void lambda$onCreateSearchArray$31() {
            ProfileActivity.this.presentFragment(new PrivacyControlActivity(2, true));
        }

        public void lambda$onCreateSearchArray$32() {
            ProfileActivity.this.presentFragment(new PrivacyControlActivity(1, true));
        }

        public void lambda$onCreateSearchArray$33() {
            if (!ProfileActivity.this.getUserConfig().isPremium()) {
                try {
                    ProfileActivity.this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                BulletinFactory.of(ProfileActivity.this).createRestrictVoiceMessagesPremiumBulletin().show();
                return;
            }
            ProfileActivity.this.presentFragment(new PrivacyControlActivity(8, true));
        }

        public void lambda$onCreateSearchArray$34() {
            ProfileActivity.this.presentFragment(new PrivacySettingsActivity());
        }

        public void lambda$onCreateSearchArray$35() {
            ProfileActivity.this.presentFragment(new PrivacySettingsActivity());
        }

        public void lambda$onCreateSearchArray$36() {
            ProfileActivity.this.presentFragment(new PrivacySettingsActivity());
        }

        public void lambda$onCreateSearchArray$37() {
            ProfileActivity.this.presentFragment(new SessionsActivity(1));
        }

        public void lambda$onCreateSearchArray$38() {
            ProfileActivity.this.presentFragment(new PrivacySettingsActivity());
        }

        public void lambda$onCreateSearchArray$39() {
            ProfileActivity.this.presentFragment(new PrivacySettingsActivity());
        }

        public void lambda$onCreateSearchArray$40() {
            ProfileActivity.this.presentFragment(new PrivacySettingsActivity());
        }

        public void lambda$onCreateSearchArray$41() {
            ProfileActivity.this.presentFragment(new PrivacySettingsActivity());
        }

        public void lambda$onCreateSearchArray$42() {
            ProfileActivity.this.presentFragment(new PrivacySettingsActivity());
        }

        public void lambda$onCreateSearchArray$43() {
            ProfileActivity.this.presentFragment(new SessionsActivity(0));
        }

        public void lambda$onCreateSearchArray$44() {
            ProfileActivity.this.presentFragment(new SessionsActivity(0));
        }

        public void lambda$onCreateSearchArray$45() {
            ProfileActivity.this.presentFragment(new SessionsActivity(0).setHighlightLinkDesktopDevice());
        }

        public void lambda$onCreateSearchArray$46() {
            ProfileActivity.this.presentFragment(new DataSettingsActivity());
        }

        public void lambda$onCreateSearchArray$47() {
            ProfileActivity.this.presentFragment(new DataSettingsActivity());
        }

        public void lambda$onCreateSearchArray$48() {
            ProfileActivity.this.presentFragment(new CacheControlActivity());
        }

        public void lambda$onCreateSearchArray$49() {
            ProfileActivity.this.presentFragment(new CacheControlActivity());
        }

        public void lambda$onCreateSearchArray$50() {
            ProfileActivity.this.presentFragment(new CacheControlActivity());
        }

        public void lambda$onCreateSearchArray$51() {
            ProfileActivity.this.presentFragment(new CacheControlActivity());
        }

        public void lambda$onCreateSearchArray$52() {
            ProfileActivity.this.presentFragment(new DataUsage2Activity());
        }

        public void lambda$onCreateSearchArray$53() {
            ProfileActivity.this.presentFragment(new DataSettingsActivity());
        }

        public void lambda$onCreateSearchArray$54() {
            ProfileActivity.this.presentFragment(new DataAutoDownloadActivity(0));
        }

        public void lambda$onCreateSearchArray$55() {
            ProfileActivity.this.presentFragment(new DataAutoDownloadActivity(1));
        }

        public void lambda$onCreateSearchArray$56() {
            ProfileActivity.this.presentFragment(new DataAutoDownloadActivity(2));
        }

        public void lambda$onCreateSearchArray$57() {
            ProfileActivity.this.presentFragment(new DataSettingsActivity());
        }

        public void lambda$onCreateSearchArray$58() {
            ProfileActivity.this.presentFragment(new DataSettingsActivity());
        }

        public void lambda$onCreateSearchArray$59() {
            ProfileActivity.this.presentFragment(new DataSettingsActivity());
        }

        public void lambda$onCreateSearchArray$60() {
            ProfileActivity.this.presentFragment(new DataSettingsActivity());
        }

        public void lambda$onCreateSearchArray$61() {
            ProfileActivity.this.presentFragment(new DataSettingsActivity());
        }

        public void lambda$onCreateSearchArray$62() {
            ProfileActivity.this.presentFragment(new DataSettingsActivity());
        }

        public void lambda$onCreateSearchArray$63() {
            ProfileActivity.this.presentFragment(new ProxyListActivity());
        }

        public void lambda$onCreateSearchArray$64() {
            ProfileActivity.this.presentFragment(new ProxyListActivity());
        }

        public void lambda$onCreateSearchArray$65() {
            ProfileActivity.this.presentFragment(new DataSettingsActivity());
        }

        public void lambda$onCreateSearchArray$66() {
            ProfileActivity.this.presentFragment(new DataSettingsActivity());
        }

        public void lambda$onCreateSearchArray$67() {
            ProfileActivity.this.presentFragment(new DataSettingsActivity());
        }

        public void lambda$onCreateSearchArray$68() {
            ProfileActivity.this.presentFragment(new DataSettingsActivity());
        }

        public void lambda$onCreateSearchArray$69() {
            ProfileActivity.this.presentFragment(new DataSettingsActivity());
        }

        public void lambda$onCreateSearchArray$70() {
            ProfileActivity.this.presentFragment(new ThemeActivity(0));
        }

        public void lambda$onCreateSearchArray$71() {
            ProfileActivity.this.presentFragment(new ThemeActivity(0));
        }

        public void lambda$onCreateSearchArray$72() {
            ProfileActivity.this.presentFragment(new WallpapersListActivity(0));
        }

        public void lambda$onCreateSearchArray$73() {
            ProfileActivity.this.presentFragment(new WallpapersListActivity(1));
        }

        public void lambda$onCreateSearchArray$74() {
            ProfileActivity.this.presentFragment(new WallpapersListActivity(0));
        }

        public void lambda$onCreateSearchArray$75() {
            ProfileActivity.this.presentFragment(new ThemeActivity(0));
        }

        public void lambda$onCreateSearchArray$76() {
            ProfileActivity.this.presentFragment(new ThemeActivity(3));
        }

        public void lambda$onCreateSearchArray$77() {
            ProfileActivity.this.presentFragment(new ThemeActivity(3));
        }

        public void lambda$onCreateSearchArray$78() {
            ProfileActivity.this.presentFragment(new ThemeActivity(0));
        }

        public void lambda$onCreateSearchArray$79() {
            ProfileActivity.this.presentFragment(new ThemeActivity(0));
        }

        public void lambda$onCreateSearchArray$80() {
            ProfileActivity.this.presentFragment(new ThemeActivity(0));
        }

        public void lambda$onCreateSearchArray$81() {
            ProfileActivity.this.presentFragment(new ThemeActivity(0));
        }

        public void lambda$onCreateSearchArray$82() {
            ProfileActivity.this.presentFragment(new ThemeActivity(1));
        }

        public void lambda$onCreateSearchArray$83() {
            ProfileActivity.this.presentFragment(new ThemeActivity(0));
        }

        public void lambda$onCreateSearchArray$84() {
            ProfileActivity.this.presentFragment(new ThemeActivity(0));
        }

        public void lambda$onCreateSearchArray$85() {
            ProfileActivity.this.presentFragment(new ThemeActivity(0));
        }

        public void lambda$onCreateSearchArray$86() {
            ProfileActivity.this.presentFragment(new ThemeActivity(0));
        }

        public void lambda$onCreateSearchArray$87() {
            ProfileActivity.this.presentFragment(new ThemeActivity(0));
        }

        public void lambda$onCreateSearchArray$88() {
            ProfileActivity.this.presentFragment(new ThemeActivity(0));
        }

        public void lambda$onCreateSearchArray$89() {
            ProfileActivity.this.presentFragment(new ThemeActivity(0));
        }

        public void lambda$onCreateSearchArray$90() {
            ProfileActivity.this.presentFragment(new ThemeActivity(0));
        }

        public void lambda$onCreateSearchArray$91() {
            ProfileActivity.this.presentFragment(new ThemeActivity(0));
        }

        public void lambda$onCreateSearchArray$92() {
            ProfileActivity.this.presentFragment(new StickersActivity(0, null));
        }

        public void lambda$onCreateSearchArray$93() {
            ProfileActivity.this.presentFragment(new StickersActivity(0, null));
        }

        public void lambda$onCreateSearchArray$94() {
            ProfileActivity.this.presentFragment(new StickersActivity(0, null));
        }

        public void lambda$onCreateSearchArray$95() {
            ProfileActivity.this.presentFragment(new StickersActivity(1, null));
        }

        public void lambda$onCreateSearchArray$96() {
            ProfileActivity.this.presentFragment(new ArchivedStickersActivity(0));
        }

        public void lambda$onCreateSearchArray$97() {
            ProfileActivity.this.presentFragment(new ArchivedStickersActivity(1));
        }

        public void lambda$onCreateSearchArray$98() {
            ProfileActivity.this.presentFragment(new StickersActivity(0, null));
        }

        public void lambda$onCreateSearchArray$99() {
            ProfileActivity.this.presentFragment(new StickersActivity(0, null));
        }

        public void lambda$onCreateSearchArray$100() {
            ProfileActivity.this.presentFragment(new StickersActivity(5, null));
        }

        public void lambda$onCreateSearchArray$101() {
            ProfileActivity.this.presentFragment(new StickersActivity(5, null));
        }

        public void lambda$onCreateSearchArray$102() {
            ProfileActivity.this.presentFragment(new StickersActivity(5, null));
        }

        public void lambda$onCreateSearchArray$103() {
            ProfileActivity.this.presentFragment(new ReactionsDoubleTapManageActivity());
        }

        public void lambda$onCreateSearchArray$104() {
            ProfileActivity.this.presentFragment(new FiltersSetupActivity());
        }

        public void lambda$onCreateSearchArray$105() {
            ProfileActivity.this.presentFragment(new FiltersSetupActivity());
        }

        public void lambda$onCreateSearchArray$106() {
            ProfileActivity.this.presentFragment(new PremiumPreviewFragment("settings"));
        }

        public void lambda$onCreateSearchArray$107() {
            ProfileActivity.this.showDialog(new PremiumFeatureBottomSheet(ProfileActivity.this, 0, false).setForceAbout());
        }

        public void lambda$onCreateSearchArray$108() {
            ProfileActivity.this.showDialog(new PremiumFeatureBottomSheet(ProfileActivity.this, 11, false).setForceAbout());
        }

        public void lambda$onCreateSearchArray$109() {
            ProfileActivity.this.showDialog(new PremiumFeatureBottomSheet(ProfileActivity.this, 1, false).setForceAbout());
        }

        public void lambda$onCreateSearchArray$110() {
            ProfileActivity.this.showDialog(new PremiumFeatureBottomSheet(ProfileActivity.this, 2, false).setForceAbout());
        }

        public void lambda$onCreateSearchArray$111() {
            ProfileActivity.this.showDialog(new PremiumFeatureBottomSheet(ProfileActivity.this, 8, false).setForceAbout());
        }

        public void lambda$onCreateSearchArray$112() {
            ProfileActivity.this.showDialog(new PremiumFeatureBottomSheet(ProfileActivity.this, 3, false).setForceAbout());
        }

        public void lambda$onCreateSearchArray$113() {
            ProfileActivity.this.showDialog(new PremiumFeatureBottomSheet(ProfileActivity.this, 4, false).setForceAbout());
        }

        public void lambda$onCreateSearchArray$114() {
            ProfileActivity.this.showDialog(new PremiumFeatureBottomSheet(ProfileActivity.this, 5, false).setForceAbout());
        }

        public void lambda$onCreateSearchArray$115() {
            ProfileActivity.this.showDialog(new PremiumFeatureBottomSheet(ProfileActivity.this, 9, false).setForceAbout());
        }

        public void lambda$onCreateSearchArray$116() {
            ProfileActivity.this.showDialog(new PremiumFeatureBottomSheet(ProfileActivity.this, 6, false).setForceAbout());
        }

        public void lambda$onCreateSearchArray$117() {
            ProfileActivity.this.showDialog(new PremiumFeatureBottomSheet(ProfileActivity.this, 7, false).setForceAbout());
        }

        public void lambda$onCreateSearchArray$118() {
            ProfileActivity.this.showDialog(new PremiumFeatureBottomSheet(ProfileActivity.this, 10, false).setForceAbout());
        }

        public void lambda$onCreateSearchArray$119() {
            ProfileActivity.this.showDialog(new PremiumFeatureBottomSheet(ProfileActivity.this, 12, false).setForceAbout());
        }

        public void lambda$onCreateSearchArray$120() {
            ProfileActivity.this.presentFragment(new LiteModeSettingsActivity());
        }

        public void lambda$onCreateSearchArray$121() {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            ProfileActivity.this.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.scrollToFlags(3);
        }

        public void lambda$onCreateSearchArray$122() {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            ProfileActivity.this.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.setExpanded(3, true);
            liteModeSettingsActivity.scrollToFlags(1);
        }

        public void lambda$onCreateSearchArray$123() {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            ProfileActivity.this.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.setExpanded(3, true);
            liteModeSettingsActivity.scrollToFlags(2);
        }

        public void lambda$onCreateSearchArray$124() {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            ProfileActivity.this.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.scrollToFlags(LiteMode.FLAGS_ANIMATED_EMOJI);
        }

        public void lambda$onCreateSearchArray$125() {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            ProfileActivity.this.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.setExpanded(LiteMode.FLAGS_ANIMATED_EMOJI, true);
            liteModeSettingsActivity.scrollToFlags(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
        }

        public void lambda$onCreateSearchArray$126() {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            ProfileActivity.this.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.setExpanded(LiteMode.FLAGS_ANIMATED_EMOJI, true);
            liteModeSettingsActivity.scrollToFlags(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
        }

        public void lambda$onCreateSearchArray$127() {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            ProfileActivity.this.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.setExpanded(LiteMode.FLAGS_ANIMATED_EMOJI, true);
            liteModeSettingsActivity.scrollToFlags(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
        }

        public void lambda$onCreateSearchArray$128() {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            ProfileActivity.this.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.scrollToFlags(LiteMode.FLAGS_CHAT);
        }

        public void lambda$onCreateSearchArray$129() {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            ProfileActivity.this.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.setExpanded(LiteMode.FLAGS_CHAT, true);
            liteModeSettingsActivity.scrollToFlags(32);
        }

        public void lambda$onCreateSearchArray$130() {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            ProfileActivity.this.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.setExpanded(LiteMode.FLAGS_CHAT, true);
            liteModeSettingsActivity.scrollToFlags(64);
        }

        public void lambda$onCreateSearchArray$131() {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            ProfileActivity.this.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.setExpanded(LiteMode.FLAGS_CHAT, true);
            liteModeSettingsActivity.scrollToFlags(128);
        }

        public void lambda$onCreateSearchArray$132() {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            ProfileActivity.this.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.setExpanded(LiteMode.FLAGS_CHAT, true);
            liteModeSettingsActivity.scrollToFlags(LiteMode.FLAG_CHAT_BLUR);
        }

        public void lambda$onCreateSearchArray$133() {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            ProfileActivity.this.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.setExpanded(LiteMode.FLAGS_CHAT, true);
            liteModeSettingsActivity.scrollToFlags(LiteMode.FLAG_CHAT_SCALE);
        }

        public void lambda$onCreateSearchArray$134() {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            ProfileActivity.this.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.scrollToFlags(LiteMode.FLAG_CALLS_ANIMATIONS);
        }

        public void lambda$onCreateSearchArray$135() {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            ProfileActivity.this.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.scrollToFlags(1024);
        }

        public void lambda$onCreateSearchArray$136() {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            ProfileActivity.this.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.scrollToFlags(2048);
        }

        public void lambda$onCreateSearchArray$137() {
            LiteModeSettingsActivity liteModeSettingsActivity = new LiteModeSettingsActivity();
            ProfileActivity.this.presentFragment(liteModeSettingsActivity);
            liteModeSettingsActivity.scrollToType(1);
        }

        public void lambda$onCreateSearchArray$138() {
            ProfileActivity.this.presentFragment(new LanguageSelectActivity());
        }

        public void lambda$onCreateSearchArray$139() {
            ProfileActivity.this.presentFragment(new LanguageSelectActivity());
        }

        public void lambda$onCreateSearchArray$140() {
            ProfileActivity.this.presentFragment(new LanguageSelectActivity());
        }

        public void lambda$onCreateSearchArray$141() {
            ProfileActivity profileActivity = ProfileActivity.this;
            profileActivity.showDialog(AlertsCreator.createSupportAlert(profileActivity, null));
        }

        public void lambda$onCreateSearchArray$142() {
            Browser.openUrl(ProfileActivity.this.getParentActivity(), LocaleController.getString("TelegramFaqUrl", R.string.TelegramFaqUrl));
        }

        public void lambda$onCreateSearchArray$143() {
            Browser.openUrl(ProfileActivity.this.getParentActivity(), LocaleController.getString("PrivacyPolicyUrl", R.string.PrivacyPolicyUrl));
        }

        private boolean isPremiumFeatureAvailable(int i) {
            if (!ProfileActivity.this.getMessagesController().premiumFeaturesBlocked() || ProfileActivity.this.getUserConfig().isPremium()) {
                return i == -1 || ProfileActivity.this.getMessagesController().premiumFeaturesTypesToPosition.get(i, -1) != -1;
            }
            return false;
        }

        public void loadFaqWebPage() {
            TLRPC$WebPage tLRPC$WebPage = ProfileActivity.this.getMessagesController().faqWebPage;
            this.faqWebPage = tLRPC$WebPage;
            if (tLRPC$WebPage != null) {
                this.faqSearchArray.addAll(ProfileActivity.this.getMessagesController().faqSearchArray);
            }
            if (this.faqWebPage != null || this.loadingFaqPage) {
                return;
            }
            this.loadingFaqPage = true;
            TLRPC$TL_messages_getWebPage tLRPC$TL_messages_getWebPage = new TLRPC$TL_messages_getWebPage();
            tLRPC$TL_messages_getWebPage.url = LocaleController.getString("TelegramFaqUrl", R.string.TelegramFaqUrl);
            tLRPC$TL_messages_getWebPage.hash = 0;
            ProfileActivity.this.getConnectionsManager().sendRequest(tLRPC$TL_messages_getWebPage, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ProfileActivity.SearchAdapter.this.lambda$loadFaqWebPage$145(tLObject, tLRPC$TL_error);
                }
            });
        }

        public void lambda$loadFaqWebPage$145(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            if (tLObject instanceof TLRPC$TL_messages_webPage) {
                TLRPC$TL_messages_webPage tLRPC$TL_messages_webPage = (TLRPC$TL_messages_webPage) tLObject;
                MessagesController.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).putUsers(tLRPC$TL_messages_webPage.users, false);
                MessagesController.getInstance(((BaseFragment) ProfileActivity.this).currentAccount).putChats(tLRPC$TL_messages_webPage.chats, false);
                tLObject = tLRPC$TL_messages_webPage.webpage;
            }
            if (tLObject instanceof TLRPC$WebPage) {
                final ArrayList arrayList = new ArrayList();
                TLRPC$WebPage tLRPC$WebPage = (TLRPC$WebPage) tLObject;
                TLRPC$Page tLRPC$Page = tLRPC$WebPage.cached_page;
                if (tLRPC$Page != null) {
                    int size = tLRPC$Page.blocks.size();
                    for (int i = 0; i < size; i++) {
                        TLRPC$PageBlock tLRPC$PageBlock = tLRPC$WebPage.cached_page.blocks.get(i);
                        if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockList) {
                            String str = null;
                            if (i != 0) {
                                TLRPC$PageBlock tLRPC$PageBlock2 = tLRPC$WebPage.cached_page.blocks.get(i - 1);
                                if (tLRPC$PageBlock2 instanceof TLRPC$TL_pageBlockParagraph) {
                                    str = ArticleViewer.getPlainText(((TLRPC$TL_pageBlockParagraph) tLRPC$PageBlock2).text).toString();
                                }
                            }
                            TLRPC$TL_pageBlockList tLRPC$TL_pageBlockList = (TLRPC$TL_pageBlockList) tLRPC$PageBlock;
                            int size2 = tLRPC$TL_pageBlockList.items.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                TLRPC$PageListItem tLRPC$PageListItem = tLRPC$TL_pageBlockList.items.get(i2);
                                if (tLRPC$PageListItem instanceof TLRPC$TL_pageListItemText) {
                                    TLRPC$TL_pageListItemText tLRPC$TL_pageListItemText = (TLRPC$TL_pageListItemText) tLRPC$PageListItem;
                                    String url = ArticleViewer.getUrl(tLRPC$TL_pageListItemText.text);
                                    String charSequence = ArticleViewer.getPlainText(tLRPC$TL_pageListItemText.text).toString();
                                    if (!TextUtils.isEmpty(url) && !TextUtils.isEmpty(charSequence)) {
                                        arrayList.add(new MessagesController.FaqSearchResult(charSequence, str != null ? new String[]{LocaleController.getString("SettingsSearchFaq", R.string.SettingsSearchFaq), str} : new String[]{LocaleController.getString("SettingsSearchFaq", R.string.SettingsSearchFaq)}, url));
                                    }
                                }
                            }
                        } else if (tLRPC$PageBlock instanceof TLRPC$TL_pageBlockAnchor) {
                            break;
                        }
                    }
                    this.faqWebPage = tLRPC$WebPage;
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ProfileActivity.SearchAdapter.this.lambda$loadFaqWebPage$144(arrayList);
                    }
                });
            }
            this.loadingFaqPage = false;
        }

        public void lambda$loadFaqWebPage$144(ArrayList arrayList) {
            this.faqSearchArray.addAll(arrayList);
            ProfileActivity.this.getMessagesController().faqSearchArray = arrayList;
            ProfileActivity.this.getMessagesController().faqWebPage = this.faqWebPage;
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
                    ((GraySectionCell) viewHolder.itemView).setText(LocaleController.getString("SettingsFaqSearchTitle", R.string.SettingsFaqSearchTitle));
                    return;
                } else {
                    if (itemViewType != 2) {
                        return;
                    }
                    ((HeaderCell) viewHolder.itemView).setText(LocaleController.getString("SettingsRecent", R.string.SettingsRecent));
                    return;
                }
            }
            SettingsSearchCell settingsSearchCell = (SettingsSearchCell) viewHolder.itemView;
            if (this.searchWas) {
                if (i < this.searchResults.size()) {
                    SearchResult searchResult = this.searchResults.get(i);
                    SearchResult searchResult2 = i > 0 ? this.searchResults.get(i - 1) : null;
                    settingsSearchCell.setTextAndValueAndIcon(this.resultNames.get(i), searchResult.path, (searchResult2 == null || searchResult2.iconResId != searchResult.iconResId) ? searchResult.iconResId : 0, i < this.searchResults.size() - 1);
                    return;
                } else {
                    int size = i - (this.searchResults.size() + 1);
                    settingsSearchCell.setTextAndValue(this.resultNames.get(this.searchResults.size() + size), this.faqSearchResults.get(size).path, true, size < this.searchResults.size() - 1);
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
            MessagesController.FaqSearchResult faqSearchResult2 = this.faqSearchArray.get(size2);
            settingsSearchCell.setTextAndValue(faqSearchResult2.title, faqSearchResult2.path, true, size2 < this.recentSearches.size() - 1);
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
            int indexOf = this.recentSearches.indexOf(obj);
            if (indexOf >= 0) {
                this.recentSearches.remove(indexOf);
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
                ProfileActivity.this.emptyView.stickerView.getImageReceiver().startAnimation();
                ProfileActivity.this.emptyView.title.setText(LocaleController.getString("SettingsNoRecent", R.string.SettingsNoRecent));
                notifyDataSetChanged();
                return;
            }
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$search$147(str);
                }
            };
            this.searchRunnable = runnable;
            dispatchQueue.postRunnable(runnable, 300L);
        }

        public void lambda$search$147(final String str) {
            SpannableStringBuilder spannableStringBuilder;
            String str2;
            int i;
            String str3;
            final ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = new ArrayList();
            String str4 = " ";
            String[] split = str.split(" ");
            String[] strArr = new String[split.length];
            int i2 = 0;
            while (true) {
                spannableStringBuilder = null;
                if (i2 >= split.length) {
                    break;
                }
                strArr[i2] = LocaleController.getInstance().getTranslitString(split[i2]);
                if (strArr[i2].equals(split[i2])) {
                    strArr[i2] = null;
                }
                i2++;
            }
            int i3 = 0;
            while (true) {
                SearchResult[] searchResultArr = this.searchArray;
                if (i3 >= searchResultArr.length) {
                    break;
                }
                SearchResult searchResult = searchResultArr[i3];
                if (searchResult != null) {
                    String str5 = " " + searchResult.searchTitle.toLowerCase();
                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                    int i4 = 0;
                    while (i4 < split.length) {
                        if (split[i4].length() != 0) {
                            String str6 = split[i4];
                            int indexOf = str5.indexOf(" " + str6);
                            if (indexOf < 0 && strArr[i4] != null) {
                                str6 = strArr[i4];
                                indexOf = str5.indexOf(" " + str6);
                            }
                            if (indexOf >= 0) {
                                if (spannableStringBuilder2 == null) {
                                    spannableStringBuilder2 = new SpannableStringBuilder(searchResult.searchTitle);
                                }
                                str3 = str5;
                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlueText4)), indexOf, str6.length() + indexOf, 33);
                            }
                        } else {
                            str3 = str5;
                        }
                        if (spannableStringBuilder2 != null && i4 == split.length - 1) {
                            if (searchResult.guid == 502) {
                                int i5 = -1;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= 4) {
                                        break;
                                    }
                                    if (!UserConfig.getInstance(i6).isClientActivated()) {
                                        i5 = i6;
                                        break;
                                    }
                                    i6++;
                                }
                                if (i5 < 0) {
                                }
                            }
                            arrayList.add(searchResult);
                            arrayList3.add(spannableStringBuilder2);
                        }
                        i4++;
                        str5 = str3;
                    }
                }
                i3++;
                spannableStringBuilder = null;
            }
            if (this.faqWebPage != null) {
                int size = this.faqSearchArray.size();
                int i7 = 0;
                while (i7 < size) {
                    MessagesController.FaqSearchResult faqSearchResult = this.faqSearchArray.get(i7);
                    String str7 = str4 + faqSearchResult.title.toLowerCase();
                    int i8 = 0;
                    SpannableStringBuilder spannableStringBuilder3 = null;
                    while (i8 < split.length) {
                        if (split[i8].length() != 0) {
                            String str8 = split[i8];
                            int indexOf2 = str7.indexOf(str4 + str8);
                            if (indexOf2 < 0 && strArr[i8] != null) {
                                str8 = strArr[i8];
                                indexOf2 = str7.indexOf(str4 + str8);
                            }
                            if (indexOf2 >= 0) {
                                if (spannableStringBuilder3 == null) {
                                    spannableStringBuilder3 = new SpannableStringBuilder(faqSearchResult.title);
                                }
                                str2 = str4;
                                i = size;
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(ProfileActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlueText4)), indexOf2, str8.length() + indexOf2, 33);
                            }
                        } else {
                            str2 = str4;
                            i = size;
                        }
                        if (spannableStringBuilder3 != null && i8 == split.length - 1) {
                            arrayList2.add(faqSearchResult);
                            arrayList3.add(spannableStringBuilder3);
                        }
                        i8++;
                        str4 = str2;
                        size = i;
                    }
                    i7++;
                    str4 = str4;
                    size = size;
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.SearchAdapter.this.lambda$search$146(str, arrayList, arrayList2, arrayList3);
                }
            });
        }

        public void lambda$search$146(String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
            if (str.equals(this.lastSearchString)) {
                if (!this.searchWas) {
                    ProfileActivity.this.emptyView.stickerView.getImageReceiver().startAnimation();
                    ProfileActivity.this.emptyView.title.setText(LocaleController.getString("SettingsNoResults", R.string.SettingsNoResults));
                }
                this.searchWas = true;
                this.searchResults = arrayList;
                this.faqSearchResults = arrayList2;
                this.resultNames = arrayList3;
                notifyDataSetChanged();
                ProfileActivity.this.emptyView.stickerView.getImageReceiver().startAnimation();
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
        if (str.startsWith("#")) {
            DialogsActivity dialogsActivity = new DialogsActivity(null);
            dialogsActivity.setSearchString(str);
            presentFragment(dialogsActivity);
        } else {
            if (!str.startsWith("/") || this.parentLayout.getFragmentStack().size() <= 1) {
                return;
            }
            BaseFragment baseFragment = this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            if (baseFragment instanceof ChatActivity) {
                lambda$onBackPressed$305();
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
        ValueAnimator ofFloat;
        boolean z = f > 0.0f;
        this.fragmentView.invalidate();
        AnimatorSet animatorSet = this.scrimAnimatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.scrimAnimatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z) {
            ofFloat = ValueAnimator.ofFloat(0.0f, f);
            arrayList.add(ofFloat);
        } else {
            ofFloat = ValueAnimator.ofFloat(this.scrimPaint.getAlpha() / 255.0f, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ProfileActivity.this.lambda$dimBehindView$84(valueAnimator);
            }
        });
        this.scrimAnimatorSet.playTogether(arrayList);
        this.scrimAnimatorSet.setDuration(z ? 150L : 220L);
        if (!z) {
            this.scrimAnimatorSet.addListener(new AnimatorListenerAdapter() {
                AnonymousClass54() {
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    ProfileActivity.this.scrimView = null;
                    ProfileActivity.this.fragmentView.invalidate();
                }
            });
        }
        this.scrimAnimatorSet.start();
    }

    public void lambda$dimBehindView$84(ValueAnimator valueAnimator) {
        this.scrimPaint.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
    }

    public class AnonymousClass54 extends AnimatorListenerAdapter {
        AnonymousClass54() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            ProfileActivity.this.scrimView = null;
            ProfileActivity.this.fragmentView.invalidate();
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        if (this.resourcesProvider != null) {
            return null;
        }
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                ProfileActivity.this.lambda$getThemeDescriptions$85();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
        if (sharedMediaLayout != null) {
            arrayList.addAll(sharedMediaLayout.getThemeDescriptions());
        }
        RecyclerListView recyclerListView = this.listView;
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(recyclerListView, 0, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.searchListView, 0, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUBACKGROUND, null, null, null, null, Theme.key_actionBarDefaultSubmenuBackground));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUITEM, null, null, null, null, Theme.key_actionBarDefaultSubmenuItem));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUITEM | ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, Theme.key_actionBarDefaultSubmenuItemIcon));
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
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i7));
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

    public void lambda$getThemeDescriptions$85() {
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
            SimpleTextView[] simpleTextViewArr = this.onlineTextView;
            if (simpleTextViewArr[1] != null) {
                Object tag = simpleTextViewArr[1].getTag();
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
            SimpleTextView[] simpleTextViewArr2 = this.nameTextView;
            if (simpleTextViewArr2[1] != null) {
                simpleTextViewArr2[1].setTextColor(getThemedColor(Theme.key_profile_title));
            }
            ActionBar actionBar = this.actionBar;
            if (actionBar != null) {
                actionBar.setItemsColor(this.peerColor != null ? -1 : getThemedColor(Theme.key_actionBarDefaultIcon), false);
                this.actionBar.setItemsBackgroundColor(this.peerColor != null ? 553648127 : getThemedColor(Theme.key_avatar_actionBarSelectorBlue), false);
            }
        }
        updateEmojiStatusDrawableColor();
    }

    public void updateListAnimated(boolean z) {
        if (this.listAdapter == null) {
            if (z) {
                updateOnlineCount(false);
            }
            updateRowsIds();
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
        } catch (Exception unused) {
            this.listAdapter.notifyDataSetChanged();
        }
        int i = this.savedScrollPosition;
        if (i >= 0) {
            this.layoutManager.scrollToPositionWithOffset(i, this.savedScrollOffset - this.listView.getPaddingTop());
        }
        AndroidUtilities.updateVisibleRows(this.listView);
    }

    public void saveScrollPosition() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView == null || this.layoutManager == null || recyclerListView.getChildCount() <= 0 || this.savedScrollToSharedMedia) {
            return;
        }
        View view = null;
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i2 = -1;
        for (int i3 = 0; i3 < this.listView.getChildCount(); i3++) {
            RecyclerListView recyclerListView2 = this.listView;
            int childAdapterPosition = recyclerListView2.getChildAdapterPosition(recyclerListView2.getChildAt(i3));
            View childAt = this.listView.getChildAt(i3);
            if (childAdapterPosition != -1 && childAt.getTop() < i) {
                i = childAt.getTop();
                i2 = childAdapterPosition;
                view = childAt;
            }
        }
        if (view != null) {
            this.savedScrollPosition = i2;
            int top = view.getTop();
            this.savedScrollOffset = top;
            if (this.savedScrollPosition == 0 && !this.allowPullingDown && top > AndroidUtilities.dp(88.0f)) {
                this.savedScrollOffset = AndroidUtilities.dp(88.0f);
            }
            this.layoutManager.scrollToPositionWithOffset(i2, view.getTop() - this.listView.getPaddingTop());
        }
    }

    @Override
    public void scrollToSharedMedia() {
        this.layoutManager.scrollToPositionWithOffset(this.sharedMediaRow, -this.listView.getPaddingTop());
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
            return;
        }
        final TLRPC$User user = getMessagesController().getUser(Long.valueOf(this.userId));
        if (user == null || this.userInfo == null) {
            return;
        }
        if (new ArrayList(this.userInfo.premium_gifts).isEmpty()) {
            if (getVisibleDialog() != null) {
                return;
            }
            final AlertDialog alertDialog = new AlertDialog(getContext(), 3);
            final int loadGiftOptions = BoostRepository.loadGiftOptions(null, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    ProfileActivity.this.lambda$onTextDetailCellImageClicked$86(alertDialog, user, (List) obj);
                }
            });
            alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    ProfileActivity.this.lambda$onTextDetailCellImageClicked$87(loadGiftOptions, dialogInterface);
                }
            });
            alertDialog.showDelayed(500L);
            return;
        }
        showDialog(new GiftPremiumBottomSheet(this, user));
    }

    public void lambda$onTextDetailCellImageClicked$86(AlertDialog alertDialog, TLRPC$User tLRPC$User, List list) {
        alertDialog.dismiss();
        if (getVisibleDialog() != null) {
            return;
        }
        List<TLRPC$TL_premiumGiftCodeOption> filterGiftOptionsByBilling = BoostRepository.filterGiftOptionsByBilling(BoostRepository.filterGiftOptions(list, 1));
        ArrayList arrayList = new ArrayList();
        arrayList.add(tLRPC$User);
        PremiumPreviewGiftToUsersBottomSheet.show(arrayList, filterGiftOptionsByBilling);
    }

    public void lambda$onTextDetailCellImageClicked$87(int i, DialogInterface dialogInterface) {
        getConnectionsManager().cancelRequest(i, true);
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
            Drawable mutate = this.fragmentView.getContext().getResources().getDrawable(R.drawable.floating_shadow_profile).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            int themedColor = getThemedColor(Theme.key_profile_actionBackground);
            int themedColor2 = getThemedColor(Theme.key_profile_actionPressedBackground);
            int themedColor3 = getThemedColor(Theme.key_profile_actionIcon);
            if (this.peerColor != null && Theme.hasHue(themedColor)) {
                themedColor = Theme.adaptHSV(this.peerColor.getBgColor1(false), 0.05f, -0.04f);
                themedColor2 = applyPeerColor2(themedColor2);
                themedColor3 = -1;
            }
            CombinedDrawable combinedDrawable = new CombinedDrawable(mutate, Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(56.0f), themedColor, themedColor2), 0, 0);
            combinedDrawable.setIconSize(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
            this.writeButton.setBackground(combinedDrawable);
            this.writeButton.setColorFilter(new PorterDuffColorFilter(themedColor3, PorterDuff.Mode.MULTIPLY));
        } catch (Exception unused) {
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void openAddToContact(final TLRPC$User tLRPC$User, Bundle bundle) {
        ContactAddActivity contactAddActivity = new ContactAddActivity(bundle, this.resourcesProvider);
        contactAddActivity.setDelegate(new ContactAddActivity.ContactAddActivityDelegate() {
            @Override
            public final void didAddToContacts() {
                ProfileActivity.this.lambda$openAddToContact$88(tLRPC$User);
            }
        });
        presentFragment(contactAddActivity);
    }

    public void lambda$openAddToContact$88(TLRPC$User tLRPC$User) {
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
                this.listView.setPadding(0, AndroidUtilities.dp(88.0f), 0, 0);
                this.expandAnimator.cancel();
                float[] fArr = this.expandAnimatorValues;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                setAvatarExpandProgress(1.0f);
                this.extraHeight = AndroidUtilities.dp(88.0f);
            } else {
                int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.listView.getMeasuredWidth(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.listView.getMeasuredHeight(), 0);
                int i = 0;
                for (int i2 = 0; i2 < this.listAdapter.getItemCount(); i2++) {
                    ListAdapter listAdapter = this.listAdapter;
                    RecyclerView.ViewHolder createViewHolder = listAdapter.createViewHolder(null, listAdapter.getItemViewType(i2));
                    this.listAdapter.onBindViewHolder(createViewHolder, i2);
                    createViewHolder.itemView.measure(makeMeasureSpec, makeMeasureSpec2);
                    i += createViewHolder.itemView.getMeasuredHeight();
                }
                int max = Math.max(0, this.fragmentView.getMeasuredHeight() - ((i + AndroidUtilities.dp(88.0f)) + currentActionBarHeight));
                RecyclerListView recyclerListView = this.listView;
                recyclerListView.setPadding(0, recyclerListView.getPaddingTop(), 0, max);
            }
        }
        this.undoView.showWithAction(this.dialogId, 8, tLRPC$User);
    }

    public class DiffCallback extends DiffUtil.Callback {
        SparseIntArray newPositionToItem;
        ArrayList<TLRPC$ChatParticipant> oldChatParticipant;
        ArrayList<Integer> oldChatParticipantSorted;
        int oldMembersEndRow;
        int oldMembersStartRow;
        SparseIntArray oldPositionToItem;
        int oldRowCount;

        private DiffCallback() {
            this.oldPositionToItem = new SparseIntArray();
            this.newPositionToItem = new SparseIntArray();
            this.oldChatParticipant = new ArrayList<>();
            this.oldChatParticipantSorted = new ArrayList<>();
        }

        DiffCallback(ProfileActivity profileActivity, AnonymousClass1 anonymousClass1) {
            this();
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
            TLRPC$ChatParticipant tLRPC$ChatParticipant;
            if (i2 >= ProfileActivity.this.membersStartRow && i2 < ProfileActivity.this.membersEndRow && i >= this.oldMembersStartRow && i < this.oldMembersEndRow) {
                if (!this.oldChatParticipantSorted.isEmpty()) {
                    tLRPC$ChatParticipant = this.oldChatParticipant.get(this.oldChatParticipantSorted.get(i - this.oldMembersStartRow).intValue());
                } else {
                    tLRPC$ChatParticipant = this.oldChatParticipant.get(i - this.oldMembersStartRow);
                }
                return tLRPC$ChatParticipant.user_id == (!ProfileActivity.this.sortedUsers.isEmpty() ? (TLRPC$ChatParticipant) ProfileActivity.this.visibleChatParticipants.get(((Integer) ProfileActivity.this.visibleSortedUsers.get(i2 - ProfileActivity.this.membersStartRow)).intValue()) : (TLRPC$ChatParticipant) ProfileActivity.this.visibleChatParticipants.get(i2 - ProfileActivity.this.membersStartRow)).user_id;
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
            put(44, ProfileActivity.this.phoneRow, sparseIntArray);
            put(45, ProfileActivity.this.locationRow, sparseIntArray);
            put(46, ProfileActivity.this.userInfoRow, sparseIntArray);
            put(47, ProfileActivity.this.channelInfoRow, sparseIntArray);
            put(48, ProfileActivity.this.usernameRow, sparseIntArray);
            put(49, ProfileActivity.this.notificationsDividerRow, sparseIntArray);
            put(50, ProfileActivity.this.reportDividerRow, sparseIntArray);
            put(51, ProfileActivity.this.notificationsRow, sparseIntArray);
            put(52, ProfileActivity.this.infoSectionRow, sparseIntArray);
            put(53, ProfileActivity.this.sendMessageRow, sparseIntArray);
            put(54, ProfileActivity.this.reportRow, sparseIntArray);
            put(55, ProfileActivity.this.reportReactionRow, sparseIntArray);
            put(56, ProfileActivity.this.addToContactsRow, sparseIntArray);
            put(57, ProfileActivity.this.settingsTimerRow, sparseIntArray);
            put(58, ProfileActivity.this.settingsKeyRow, sparseIntArray);
            put(59, ProfileActivity.this.secretSettingsSectionRow, sparseIntArray);
            put(60, ProfileActivity.this.membersHeaderRow, sparseIntArray);
            put(61, ProfileActivity.this.addMemberRow, sparseIntArray);
            put(62, ProfileActivity.this.subscribersRow, sparseIntArray);
            put(63, ProfileActivity.this.subscribersRequestsRow, sparseIntArray);
            put(64, ProfileActivity.this.administratorsRow, sparseIntArray);
            put(65, ProfileActivity.this.settingsRow, sparseIntArray);
            put(66, ProfileActivity.this.blockedUsersRow, sparseIntArray);
            put(67, ProfileActivity.this.membersSectionRow, sparseIntArray);
            put(68, ProfileActivity.this.sharedMediaRow, sparseIntArray);
            put(69, ProfileActivity.this.unblockRow, sparseIntArray);
            put(70, ProfileActivity.this.addToGroupButtonRow, sparseIntArray);
            put(71, ProfileActivity.this.addToGroupInfoRow, sparseIntArray);
            put(72, ProfileActivity.this.joinRow, sparseIntArray);
            put(73, ProfileActivity.this.lastSectionRow, sparseIntArray);
            put(74, ProfileActivity.this.notificationsSimpleRow, sparseIntArray);
            put(75, ProfileActivity.this.bizHoursRow, sparseIntArray);
            put(76, ProfileActivity.this.bizLocationRow, sparseIntArray);
            put(77, ProfileActivity.this.birthdayRow, sparseIntArray);
            put(78, ProfileActivity.this.channelRow, sparseIntArray);
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
        if (this.actionBar.isActionModeShowed()) {
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
            SimpleTextView[] simpleTextViewArr = this.onlineTextView;
            this.photoDescriptionProgress = simpleTextViewArr[1] == null ? 0.0f : simpleTextViewArr[1].getAlpha();
        } else if (this.userId == UserConfig.getInstance(this.currentAccount).clientUserId) {
            this.photoDescriptionProgress = this.currentExpandAnimatorValue * (1.0f - this.customAvatarProgress);
        } else {
            this.photoDescriptionProgress = this.currentExpandAnimatorValue * this.customAvatarProgress;
        }
        if (this.userId == UserConfig.getInstance(this.currentAccount).clientUserId) {
            if (this.hasFallbackPhoto) {
                this.customPhotoOffset = AndroidUtilities.dp(28.0f) * this.photoDescriptionProgress;
                SimpleTextView[] simpleTextViewArr2 = this.onlineTextView;
                if (simpleTextViewArr2[2] != null) {
                    simpleTextViewArr2[2].setAlpha(this.currentExpandAnimatorValue);
                    this.onlineTextView[3].setAlpha(1.0f - this.currentExpandAnimatorValue);
                    this.onlineTextView[1].setTranslationX(this.onlineX + this.customPhotoOffset);
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
            SimpleTextView[] simpleTextViewArr3 = this.onlineTextView;
            if (simpleTextViewArr3[2] != null) {
                simpleTextViewArr3[2].setAlpha(0.0f);
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
            SimpleTextView[] simpleTextViewArr4 = this.onlineTextView;
            if (simpleTextViewArr4[2] != null) {
                simpleTextViewArr4[2].setAlpha(this.photoDescriptionProgress);
            }
            ShowDrawable showDrawable3 = this.showStatusButton;
            if (showDrawable3 != null) {
                showDrawable3.setAlpha2(1.0f - this.photoDescriptionProgress);
                return;
            }
            return;
        }
        SimpleTextView[] simpleTextViewArr5 = this.onlineTextView;
        if (simpleTextViewArr5[2] != null) {
            simpleTextViewArr5[2].setAlpha(0.0f);
        }
        ShowDrawable showDrawable4 = this.showStatusButton;
        if (showDrawable4 != null) {
            showDrawable4.setAlpha2(1.0f);
        }
    }

    public void updateStoriesViewBounds(boolean z) {
        ActionBar actionBar;
        if (this.storyView == null || (actionBar = this.actionBar) == null) {
            return;
        }
        float f = actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0.0f;
        float width = this.actionBar.getWidth();
        float max = this.actionBar.getBackButton() != null ? Math.max(0.0f, this.actionBar.getBackButton().getRight()) : 0.0f;
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
        this.storyView.setBounds(max, width, f + ((this.actionBar.getHeight() - f) / 2.0f), !z);
    }

    public class ClippedListView extends RecyclerListView implements StoriesListPlaceProvider.ClippedView {
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
        boolean z;
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
                            z = false;
                            break;
                        } else {
                            if (supportedTypes[i2].equals(str)) {
                                z = true;
                                break;
                            }
                            i2++;
                        }
                    }
                    if (z) {
                        (codecInfoAt.isEncoder() ? arrayList2 : arrayList).add(Integer.valueOf(i));
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
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        this.blurredView.setBackground(new BitmapDrawable(createBitmap));
        this.blurredView.setAlpha(0.0f);
        this.blurredView.setVisibility(0);
    }

    public ShowDrawable getShowStatusButton() {
        if (this.showStatusButton == null) {
            ShowDrawable showDrawable = new ShowDrawable(LocaleController.getString(R.string.StatusHiddenShow));
            this.showStatusButton = showDrawable;
            showDrawable.setAlpha((int) (Math.min(1.0f, this.extraHeight / AndroidUtilities.dp(88.0f)) * 255.0f));
            this.showStatusButton.setBackgroundColor(ColorUtils.blendARGB(Theme.multAlpha(Theme.adaptHSV(this.actionBarBackgroundColor, 0.18f, -0.1f), 0.5f), 603979775, this.currentExpandAnimatorValue));
        }
        return this.showStatusButton;
    }

    public static class ShowDrawable extends Drawable implements SimpleTextView.PressableDrawable {
        private float alpha;
        private float alpha2;
        public final Paint backgroundPaint;
        private final ButtonBounce bounce;
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
                AnonymousClass2(View view) {
                    super(view);
                }

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

                AnonymousClass1() {
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

        public class AnonymousClass1 implements Drawable.Callback {
            @Override
            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            }

            @Override
            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            }

            AnonymousClass1() {
            }

            @Override
            public void invalidateDrawable(Drawable drawable) {
                if (ShowDrawable.this.view != null) {
                    ShowDrawable.this.view.invalidate();
                }
            }
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

        public class AnonymousClass2 extends ButtonBounce {
            AnonymousClass2(View view) {
                super(view);
            }

            @Override
            public void invalidate() {
                ShowDrawable.this.invalidateSelf();
            }
        }

        @Override
        public void setPressed(boolean z) {
            this.bounce.setPressed(z);
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
        AndroidUtilities.forEachViews((RecyclerView) this.listView, (com.google.android.exoplayer2.util.Consumer<View>) new com.google.android.exoplayer2.util.Consumer() {
            @Override
            public final void accept(Object obj) {
                ProfileActivity.this.lambda$setLoadingSpan$89((View) obj);
            }
        });
    }

    public void lambda$setLoadingSpan$89(View view) {
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
        TLRPC$TL_businessLocation tLRPC$TL_businessLocation;
        TLRPC$UserFull tLRPC$UserFull = this.userInfo;
        if (tLRPC$UserFull == null || (tLRPC$TL_businessLocation = tLRPC$UserFull.business_location) == null) {
            return;
        }
        if (tLRPC$TL_businessLocation.geo_point != null && !z) {
            AnonymousClass55 anonymousClass55 = new LocationActivity(this, 3) {
                @Override
                protected boolean disablePermissionCheck() {
                    return true;
                }

                AnonymousClass55(ProfileActivity this, int i) {
                    super(i);
                }
            };
            anonymousClass55.setResourceProvider(this.resourcesProvider);
            TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
            tLRPC$TL_message.local_id = -1;
            tLRPC$TL_message.peer_id = getMessagesController().getPeer(this.dialogId);
            TLRPC$TL_messageMediaGeo tLRPC$TL_messageMediaGeo = new TLRPC$TL_messageMediaGeo();
            TLRPC$TL_businessLocation tLRPC$TL_businessLocation2 = this.userInfo.business_location;
            tLRPC$TL_messageMediaGeo.geo = tLRPC$TL_businessLocation2.geo_point;
            tLRPC$TL_messageMediaGeo.address = tLRPC$TL_businessLocation2.address;
            tLRPC$TL_message.media = tLRPC$TL_messageMediaGeo;
            anonymousClass55.setSharingAllowed(false);
            anonymousClass55.setMessageObject(new MessageObject(UserConfig.selectedAccount, tLRPC$TL_message, false, false));
            presentFragment(anonymousClass55);
            return;
        }
        String str = BuildVars.isHuaweiStoreApp() ? "mapapp://navigation" : "http://maps.google.com/maps";
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str + "?q=" + this.userInfo.business_location.address, new Object[0]))));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public class AnonymousClass55 extends LocationActivity {
        @Override
        protected boolean disablePermissionCheck() {
            return true;
        }

        AnonymousClass55(ProfileActivity this, int i) {
            super(i);
        }
    }

    public boolean editRow(View view, final int i) {
        TLRPC$TL_businessLocation tLRPC$TL_businessLocation;
        if (!this.myProfile) {
            return false;
        }
        if (view instanceof ProfileChannelCell) {
            view = ((ProfileChannelCell) view).dialogCell;
        }
        TLRPC$User currentUser = getUserConfig().getCurrentUser();
        if (currentUser == null) {
            return false;
        }
        final TLRPC$UserFull tLRPC$UserFull = this.userInfo;
        if (tLRPC$UserFull == null) {
            tLRPC$UserFull = getMessagesController().getUserFull(currentUser.id);
        }
        if (tLRPC$UserFull == null) {
            return false;
        }
        String string = LocaleController.getString(R.string.Copy);
        final String str = null;
        if (i == this.channelInfoRow || i == this.userInfoRow || i == this.bioRow) {
            str = tLRPC$UserFull.about;
        } else if (i == this.bizHoursRow) {
            str = OpeningHoursActivity.toString(this.currentAccount, currentUser, tLRPC$UserFull.business_work_hours);
            string = LocaleController.getString(R.string.ProfileHoursCopy);
        } else if (i == this.bizLocationRow) {
            str = tLRPC$UserFull.business_location.address;
            string = LocaleController.getString(R.string.ProfileLocationCopy);
        } else if (i == this.usernameRow) {
            String publicUsername = UserObject.getPublicUsername(currentUser);
            if (publicUsername != null) {
                publicUsername = "@" + publicUsername;
            }
            str = publicUsername;
            string = LocaleController.getString(R.string.ProfileCopyUsername);
        } else if (i == this.phoneRow) {
            str = currentUser.phone;
        } else if (i == this.birthdayRow) {
            str = UserInfoActivity.birthdayString(this.userInfo.birthday);
        }
        ItemOptions makeOptions = ItemOptions.makeOptions(this.contentView, this.resourcesProvider, view);
        makeOptions.setGravity(3);
        if (i == this.bizLocationRow && (tLRPC$TL_businessLocation = tLRPC$UserFull.business_location) != null) {
            if (tLRPC$TL_businessLocation.geo_point != null) {
                makeOptions.add(R.drawable.msg_view_file, LocaleController.getString(R.string.ProfileLocationView), new Runnable() {
                    @Override
                    public final void run() {
                        ProfileActivity.this.lambda$editRow$90();
                    }
                });
            }
            makeOptions.add(R.drawable.msg_map, LocaleController.getString(R.string.ProfileLocationMaps), new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.this.lambda$editRow$91();
                }
            });
        }
        if (str != null) {
            makeOptions.add(R.drawable.msg_copy, string, new Runnable() {
                @Override
                public final void run() {
                    AndroidUtilities.addToClipboard(str);
                }
            });
        }
        if (i == this.bizHoursRow) {
            makeOptions.add(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileHoursEdit), new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.this.lambda$editRow$93();
                }
            });
            makeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.ProfileHoursRemove), true, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.this.lambda$editRow$97(tLRPC$UserFull, i);
                }
            });
        } else if (i == this.bizLocationRow) {
            makeOptions.add(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileLocationEdit), new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.this.lambda$editRow$98();
                }
            });
            makeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.ProfileLocationRemove), true, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.this.lambda$editRow$102(tLRPC$UserFull, i);
                }
            });
        } else if (i == this.usernameRow) {
            makeOptions.add(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileUsernameEdit), new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.this.lambda$editRow$103();
                }
            });
        } else if (i == this.channelInfoRow || i == this.userInfoRow || i == this.bioRow) {
            makeOptions.add(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileEditBio), new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.this.lambda$editRow$104();
                }
            });
        } else if (i == this.phoneRow) {
            makeOptions.add(R.drawable.menu_storage_path, LocaleController.getString(R.string.ProfilePhoneEdit), new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.this.lambda$editRow$105();
                }
            });
        } else if (i == this.birthdayRow) {
            makeOptions.add(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileBirthdayChange), new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.this.lambda$editRow$110(tLRPC$UserFull);
                }
            });
            makeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.Remove), true, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.this.lambda$editRow$114(tLRPC$UserFull, i);
                }
            });
        } else if (i == this.channelRow) {
            final TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(tLRPC$UserFull.personal_channel_id));
            if (chat != null && ChatObject.getPublicUsername(chat) != null) {
                makeOptions.add(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileChannelCopy), new Runnable() {
                    @Override
                    public final void run() {
                        ProfileActivity.this.lambda$editRow$115(chat);
                    }
                });
            }
            makeOptions.add(R.drawable.msg_edit, LocaleController.getString(R.string.ProfileChannelChange), new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.this.lambda$editRow$116();
                }
            });
            makeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.Remove), true, new Runnable() {
                @Override
                public final void run() {
                    ProfileActivity.this.lambda$editRow$120(tLRPC$UserFull, i);
                }
            });
        }
        if (makeOptions.getItemsCount() <= 0) {
            return false;
        }
        makeOptions.show();
        return true;
    }

    public void lambda$editRow$90() {
        openLocation(false);
    }

    public void lambda$editRow$91() {
        openLocation(true);
    }

    public void lambda$editRow$93() {
        presentFragment(new OpeningHoursActivity());
    }

    public void lambda$editRow$97(final TLRPC$UserFull tLRPC$UserFull, final int i) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.BusinessHoursClearTitle));
        builder.setMessage(LocaleController.getString(R.string.BusinessHoursClearMessage));
        builder.setPositiveButton(LocaleController.getString(R.string.Remove), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ProfileActivity.this.lambda$editRow$96(tLRPC$UserFull, i, dialogInterface, i2);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(builder.create());
    }

    public void lambda$editRow$96(TLRPC$UserFull tLRPC$UserFull, int i, DialogInterface dialogInterface, int i2) {
        TLRPC$TL_account_updateBusinessWorkHours tLRPC$TL_account_updateBusinessWorkHours = new TLRPC$TL_account_updateBusinessWorkHours();
        if (tLRPC$UserFull != null) {
            tLRPC$UserFull.business_work_hours = null;
            tLRPC$UserFull.flags2 &= -2;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_account_updateBusinessWorkHours, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ProfileActivity.this.lambda$editRow$95(tLObject, tLRPC$TL_error);
            }
        });
        updateRowsIds();
        this.listAdapter.notifyItemRemoved(i);
        getMessagesStorage().updateUserInfo(tLRPC$UserFull, false);
    }

    public void lambda$editRow$95(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ProfileActivity.this.lambda$editRow$94(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$editRow$94(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error != null) {
            BulletinFactory.showError(tLRPC$TL_error);
        } else if (tLObject instanceof TLRPC$TL_boolFalse) {
            BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show();
        }
    }

    public void lambda$editRow$98() {
        presentFragment(new org.telegram.ui.Business.LocationActivity());
    }

    public void lambda$editRow$102(final TLRPC$UserFull tLRPC$UserFull, final int i) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.BusinessLocationClearTitle));
        builder.setMessage(LocaleController.getString(R.string.BusinessLocationClearMessage));
        builder.setPositiveButton(LocaleController.getString(R.string.Remove), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ProfileActivity.this.lambda$editRow$101(tLRPC$UserFull, i, dialogInterface, i2);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(builder.create());
    }

    public void lambda$editRow$101(TLRPC$UserFull tLRPC$UserFull, int i, DialogInterface dialogInterface, int i2) {
        TLRPC$TL_account_updateBusinessLocation tLRPC$TL_account_updateBusinessLocation = new TLRPC$TL_account_updateBusinessLocation();
        if (tLRPC$UserFull != null) {
            tLRPC$UserFull.business_location = null;
            tLRPC$UserFull.flags2 &= -3;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_account_updateBusinessLocation, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ProfileActivity.this.lambda$editRow$100(tLObject, tLRPC$TL_error);
            }
        });
        updateRowsIds();
        this.listAdapter.notifyItemRemoved(i);
        getMessagesStorage().updateUserInfo(tLRPC$UserFull, false);
    }

    public void lambda$editRow$100(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ProfileActivity.this.lambda$editRow$99(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$editRow$99(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error != null) {
            BulletinFactory.showError(tLRPC$TL_error);
        } else if (tLObject instanceof TLRPC$TL_boolFalse) {
            BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show();
        }
    }

    public void lambda$editRow$103() {
        presentFragment(new ChangeUsernameActivity());
    }

    public void lambda$editRow$104() {
        presentFragment(new UserInfoActivity());
    }

    public void lambda$editRow$105() {
        presentFragment(new ActionIntroActivity(3));
    }

    public void lambda$editRow$110(final TLRPC$UserFull tLRPC$UserFull) {
        showDialog(AlertsCreator.createBirthdayPickerDialog(getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), tLRPC$UserFull.birthday, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ProfileActivity.this.lambda$editRow$108(tLRPC$UserFull, (TLRPC$TL_birthday) obj);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                ProfileActivity.this.lambda$editRow$109();
            }
        }, getResourceProvider()).create());
    }

    public void lambda$editRow$108(final TLRPC$UserFull tLRPC$UserFull, TLRPC$TL_birthday tLRPC$TL_birthday) {
        TLRPC$TL_account_updateBirthday tLRPC$TL_account_updateBirthday = new TLRPC$TL_account_updateBirthday();
        tLRPC$TL_account_updateBirthday.flags |= 1;
        tLRPC$TL_account_updateBirthday.birthday = tLRPC$TL_birthday;
        final TLRPC$TL_birthday tLRPC$TL_birthday2 = tLRPC$UserFull != null ? tLRPC$UserFull.birthday : null;
        if (tLRPC$UserFull != null) {
            tLRPC$UserFull.flags2 |= 32;
            tLRPC$UserFull.birthday = tLRPC$TL_birthday;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_account_updateBirthday, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ProfileActivity.this.lambda$editRow$107(tLRPC$UserFull, tLRPC$TL_birthday2, tLObject, tLRPC$TL_error);
            }
        }, 1024);
    }

    public void lambda$editRow$107(final TLRPC$UserFull tLRPC$UserFull, final TLRPC$TL_birthday tLRPC$TL_birthday, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ProfileActivity.this.lambda$editRow$106(tLObject, tLRPC$UserFull, tLRPC$TL_birthday, tLRPC$TL_error);
            }
        });
    }

    public void lambda$editRow$106(TLObject tLObject, TLRPC$UserFull tLRPC$UserFull, TLRPC$TL_birthday tLRPC$TL_birthday, TLRPC$TL_error tLRPC$TL_error) {
        String str;
        if (tLObject instanceof TLRPC$TL_boolTrue) {
            BulletinFactory.of(this).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.PrivacyBirthdaySetDone)).setDuration(5000).show();
            return;
        }
        if (tLRPC$UserFull != null) {
            if (tLRPC$TL_birthday == null) {
                tLRPC$UserFull.flags2 &= -33;
            } else {
                tLRPC$UserFull.flags2 |= 32;
            }
            tLRPC$UserFull.birthday = tLRPC$TL_birthday;
            getMessagesStorage().updateUserInfo(tLRPC$UserFull, false);
        }
        if (tLRPC$TL_error != null && (str = tLRPC$TL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (getContext() != null) {
                showDialog(new AlertDialog.Builder(getContext(), this.resourceProvider).setTitle(LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle)).setMessage(LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage)).setPositiveButton(LocaleController.getString(R.string.OK), null).create());
                return;
            }
            return;
        }
        BulletinFactory.of(this).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.UnknownError)).show();
    }

    public void lambda$editRow$109() {
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        showAsSheet(new PrivacyControlActivity(11), bottomSheetParams);
    }

    public void lambda$editRow$114(final TLRPC$UserFull tLRPC$UserFull, final int i) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.BirthdayClearTitle));
        builder.setMessage(LocaleController.getString(R.string.BirthdayClearMessage));
        builder.setPositiveButton(LocaleController.getString(R.string.Remove), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ProfileActivity.this.lambda$editRow$113(tLRPC$UserFull, i, dialogInterface, i2);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(builder.create());
    }

    public void lambda$editRow$113(TLRPC$UserFull tLRPC$UserFull, int i, DialogInterface dialogInterface, int i2) {
        TLRPC$TL_account_updateBirthday tLRPC$TL_account_updateBirthday = new TLRPC$TL_account_updateBirthday();
        if (tLRPC$UserFull != null) {
            tLRPC$UserFull.birthday = null;
            tLRPC$UserFull.flags2 &= -33;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_account_updateBirthday, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ProfileActivity.this.lambda$editRow$112(tLObject, tLRPC$TL_error);
            }
        });
        updateRowsIds();
        this.listAdapter.notifyItemRemoved(i);
        getMessagesStorage().updateUserInfo(tLRPC$UserFull, false);
    }

    public void lambda$editRow$112(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ProfileActivity.this.lambda$editRow$111(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$editRow$111(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error != null) {
            BulletinFactory.showError(tLRPC$TL_error);
        } else if (tLObject instanceof TLRPC$TL_boolFalse) {
            BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show();
        }
    }

    public void lambda$editRow$115(TLRPC$Chat tLRPC$Chat) {
        AndroidUtilities.addToClipboard("https://" + getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(tLRPC$Chat));
    }

    public void lambda$editRow$116() {
        presentFragment(new UserInfoActivity());
    }

    public void lambda$editRow$120(final TLRPC$UserFull tLRPC$UserFull, final int i) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.ProfileChannelClearTitle));
        builder.setMessage(LocaleController.getString(R.string.ProfileChannelClearMessage));
        builder.setPositiveButton(LocaleController.getString(R.string.Remove), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ProfileActivity.this.lambda$editRow$119(tLRPC$UserFull, i, dialogInterface, i2);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(builder.create());
    }

    public void lambda$editRow$119(TLRPC$UserFull tLRPC$UserFull, int i, DialogInterface dialogInterface, int i2) {
        TLRPC$TL_account_updatePersonalChannel tLRPC$TL_account_updatePersonalChannel = new TLRPC$TL_account_updatePersonalChannel();
        if (tLRPC$UserFull != null) {
            tLRPC$UserFull.personal_channel_id = 0L;
            tLRPC$UserFull.personal_channel_message = 0;
            tLRPC$UserFull.flags2 &= -65;
        }
        getConnectionsManager().sendRequest(tLRPC$TL_account_updatePersonalChannel, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ProfileActivity.this.lambda$editRow$118(tLObject, tLRPC$TL_error);
            }
        });
        updateRowsIds();
        this.listAdapter.notifyItemRemoved(i);
        getMessagesStorage().updateUserInfo(tLRPC$UserFull, false);
    }

    public void lambda$editRow$118(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ProfileActivity.this.lambda$editRow$117(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$editRow$117(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error != null) {
            BulletinFactory.showError(tLRPC$TL_error);
        } else if (tLObject instanceof TLRPC$TL_boolFalse) {
            BulletinFactory.of(this).createErrorBulletin(LocaleController.getString(R.string.UnknownError)).show();
        }
    }

    private void updateItemsUsername() {
        TLRPC$User user;
        if (this.myProfile && (user = getMessagesController().getUser(Long.valueOf(this.userId))) != null) {
            boolean z = UserObject.getPublicUsername(user) != null;
            this.setUsernameItem.setIcon(z ? R.drawable.menu_username_change : R.drawable.menu_username_set);
            this.setUsernameItem.setText(LocaleController.getString(z ? R.string.ProfileUsernameEdit : R.string.ProfileUsernameSet));
            this.linkItem.setVisibility(UserObject.getPublicUsername(user) == null ? 8 : 0);
        }
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
        this.editColorItem.setIcon(new CombinedDrawable(this, drawable, drawable2, AndroidUtilities.dp(1.0f), -AndroidUtilities.dp(1.0f)) {
            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }

            AnonymousClass56(ProfileActivity this, Drawable drawable3, Drawable drawable22, int i, int i2) {
                super(drawable3, drawable22, i, i2);
            }
        });
    }

    public class AnonymousClass56 extends CombinedDrawable {
        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        AnonymousClass56(ProfileActivity this, Drawable drawable3, Drawable drawable22, int i, int i2) {
            super(drawable3, drawable22, i, i2);
        }
    }
}
