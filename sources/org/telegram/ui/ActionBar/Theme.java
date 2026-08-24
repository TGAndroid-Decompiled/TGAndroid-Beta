package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.StateSet;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticNonNull0;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticLambda98;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.time.SunDate;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.BlurSettingsBottomSheet;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AudioVisualizerDrawable;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChoosingStickerStatusDrawable;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.FragmentContextViewWavesDrawable;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.MsgClockDrawable;
import org.telegram.ui.Components.PathAnimator;
import org.telegram.ui.Components.PlayingGameDrawable;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecordStatusDrawable;
import org.telegram.ui.Components.RoundStatusDrawable;
import org.telegram.ui.Components.ScamDrawable;
import org.telegram.ui.Components.SendingFileDrawable;
import org.telegram.ui.Components.StatusDrawable;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.TypingDotsDrawable;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.RoundVideoProgressShadow;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.ThemePreviewActivity;

public abstract class Theme {
    public static Paint DEBUG_BLUE;
    public static Paint DEBUG_GREEN_40;
    public static Paint DEBUG_GREEN_B0;
    public static Paint DEBUG_GREEN_STROKE;
    public static Paint DEBUG_RED;
    public static Paint DEBUG_RED_STROKE;
    public static final Paint PAINT_CLEAR;
    private static final Paint PAINT_FILLING;
    private static Method StateListDrawable_getStateDrawableMethod;
    private static SensorEventListener ambientSensorListener;
    private static HashMap animatedOutVisualizerDrawables;
    private static SparseIntArray animatingColors;
    public static float autoNightBrighnessThreshold;
    public static String autoNightCityName;
    public static int autoNightDayEndTime;
    public static int autoNightDayStartTime;
    public static int autoNightLastSunCheckDay;
    public static double autoNightLocationLatitude;
    public static double autoNightLocationLongitude;
    public static boolean autoNightScheduleByLocation;
    public static int autoNightSunriseTime;
    public static int autoNightSunsetTime;
    public static Paint avatar_backgroundPaint;
    private static BackgroundGradientDrawable.Disposable backgroundGradientDisposable;
    private static Bitmap blurredBitmap;
    public static Drawable calllog_msgCallDownGreenDrawable;
    public static Drawable calllog_msgCallDownRedDrawable;
    public static Drawable calllog_msgCallUpGreenDrawable;
    public static Drawable calllog_msgCallUpRedDrawable;
    private static boolean canStartHolidayAnimation;
    private static boolean changingWallpaper;
    public static Paint chat_actionBackgroundGradientDarkenPaint;
    public static Paint chat_actionBackgroundPaint;
    public static Paint chat_actionBackgroundSelectedPaint;
    public static TextPaint chat_actionTextPaint;
    public static TextPaint chat_actionTextPaint2;
    public static TextPaint chat_actionTextPaint3;
    public static TextPaint chat_adminPaint;
    public static PorterDuffColorFilter chat_animatedEmojiTextColorFilter;
    public static Drawable chat_attachEmptyDrawable;
    public static TextPaint chat_audioPerformerPaint;
    public static TextPaint chat_audioTimePaint;
    public static TextPaint chat_audioTitlePaint;
    public static TextPaint chat_botButtonPaint;
    public static Drawable chat_botCardDrawable;
    public static Drawable chat_botInlineDrawable;
    public static Drawable chat_botInviteDrawable;
    public static Drawable chat_botLinkDrawable;
    public static Drawable chat_botLockDrawable;
    public static Drawable chat_botWebViewDrawable;
    public static Drawable chat_closeIconDrawable;
    public static Drawable chat_commentArrowDrawable;
    public static Drawable chat_commentDrawable;
    public static Drawable chat_commentStickerDrawable;
    public static TextPaint chat_commentTextPaint;
    public static Paint chat_composeBackgroundPaint;
    public static Drawable chat_composeShadowDrawable;
    public static Drawable chat_composeShadowRoundDrawable;
    public static TextPaint chat_contactNamePaint;
    public static TextPaint chat_contactPhonePaint;
    public static TextPaint chat_contextResult_descriptionTextPaint;
    public static Drawable chat_contextResult_shadowUnderSwitchDrawable;
    public static TextPaint chat_contextResult_titleTextPaint;
    public static Paint chat_deleteProgressPaint;
    public static Paint chat_docBackPaint;
    public static TextPaint chat_docNamePaint;
    public static TextPaint chat_durationPaint;
    public static TextPaint chat_ephemeralPaint;
    public static TextPaint chat_explanationTextPaint;
    public static Drawable chat_flameIcon;
    public static TextPaint chat_forwardNamePaint;
    public static TextPaint chat_gamePaint;
    public static Drawable chat_gifIcon;
    public static Drawable chat_goIconDrawable;
    public static Drawable chat_gradientLeftDrawable;
    public static Drawable chat_gradientRightDrawable;
    public static TextPaint chat_infoBoldPaint;
    public static TextPaint chat_infoPaint;
    public static Drawable chat_inlineResultAudio;
    public static Drawable chat_inlineResultFile;
    public static Drawable chat_inlineResultLocation;
    public static Paint chat_instantViewButtonPaint;
    public static TextPaint chat_instantViewPaint;
    public static Paint chat_instantViewRectPaint;
    public static TextPaint chat_livePaint;
    public static Drawable chat_livePhoto;
    public static TextPaint chat_locationAddressPaint;
    public static TextPaint chat_locationTitlePaint;
    public static Drawable chat_lockIconDrawable;
    public static Paint chat_messageBackgroundSelectedPaint;
    public static Drawable chat_moreIconDrawable;
    private static AudioVisualizerDrawable chat_msgAudioVisualizeDrawable;
    public static TextPaint chat_msgBotButtonPaint;
    public static Drawable chat_msgCallDownGreenDrawable;
    public static Drawable chat_msgCallDownRedDrawable;
    public static Drawable chat_msgCallUpGreenDrawable;
    public static MsgClockDrawable chat_msgClockDrawable;
    public static TextPaint chat_msgCodeBgPaint;
    public static Drawable chat_msgErrorDrawable;
    public static Paint chat_msgErrorPaint;
    public static TextPaint chat_msgGameTextPaint;
    public static MessageDrawable chat_msgInDrawable;
    public static Drawable chat_msgInInstantDrawable;
    public static MessageDrawable chat_msgInMediaDrawable;
    public static MessageDrawable chat_msgInMediaSelectedDrawable;
    public static Drawable chat_msgInMenuDrawable;
    public static Drawable chat_msgInMenuSelectedDrawable;
    public static Drawable chat_msgInPinnedDrawable;
    public static Drawable chat_msgInPinnedSelectedDrawable;
    public static Drawable chat_msgInRepliesDrawable;
    public static Drawable chat_msgInRepliesSelectedDrawable;
    public static MessageDrawable chat_msgInSelectedDrawable;
    public static Drawable chat_msgInViewsDrawable;
    public static Drawable chat_msgInViewsSelectedDrawable;
    public static Drawable chat_msgMediaCheckDrawable;
    public static Drawable chat_msgMediaHalfCheckDrawable;
    public static Drawable chat_msgMediaMenuDrawable;
    public static Drawable chat_msgMediaPinnedDrawable;
    public static Drawable chat_msgMediaRepliesDrawable;
    public static Drawable chat_msgMediaViewsDrawable;
    public static Drawable chat_msgNoSoundDrawable;
    public static Drawable chat_msgOutCheckDrawable;
    public static Drawable chat_msgOutCheckReadDrawable;
    public static Drawable chat_msgOutCheckReadSelectedDrawable;
    public static Drawable chat_msgOutCheckSelectedDrawable;
    public static MessageDrawable chat_msgOutDrawable;
    public static Drawable chat_msgOutHalfCheckDrawable;
    public static Drawable chat_msgOutHalfCheckSelectedDrawable;
    public static Drawable chat_msgOutInstantDrawable;
    public static MessageDrawable chat_msgOutMediaDrawable;
    public static MessageDrawable chat_msgOutMediaSelectedDrawable;
    public static Drawable chat_msgOutMenuDrawable;
    public static Drawable chat_msgOutMenuSelectedDrawable;
    public static Drawable chat_msgOutPinnedDrawable;
    public static Drawable chat_msgOutPinnedSelectedDrawable;
    public static Drawable chat_msgOutRepliesDrawable;
    public static Drawable chat_msgOutRepliesSelectedDrawable;
    public static MessageDrawable chat_msgOutSelectedDrawable;
    public static Drawable chat_msgOutViewsDrawable;
    public static Drawable chat_msgOutViewsSelectedDrawable;
    public static Drawable chat_msgStickerCheckDrawable;
    public static Drawable chat_msgStickerHalfCheckDrawable;
    public static Drawable chat_msgStickerPinnedDrawable;
    public static Drawable chat_msgStickerRepliesDrawable;
    public static Drawable chat_msgStickerViewsDrawable;
    public static TextPaint chat_msgTextCode2Paint;
    public static TextPaint chat_msgTextCode3Paint;
    public static TextPaint chat_msgTextCodePaint;
    public static TextPaint chat_msgTextPaint;
    public static TextPaint[] chat_msgTextPaintEmoji;
    public static TextPaint chat_msgTextPaintOneEmoji;
    public static TextPaint chat_msgTextPaintThreeEmoji;
    public static TextPaint chat_msgTextPaintTwoEmoji;
    public static Drawable chat_msgUnlockDrawable;
    public static Drawable chat_muteIconDrawable;
    public static TextPaint chat_namePaint;
    public static PorterDuffColorFilter chat_outAnimatedEmojiTextColorFilter;
    public static Paint chat_outUrlPaint;
    public static Paint chat_pollTimerPaint;
    public static TextPaint chat_quoteTextPaint;
    public static Paint chat_radialProgress2Paint;
    public static Paint chat_radialProgressPaint;
    public static Paint chat_radialProgressPausedPaint;
    public static Paint chat_radialProgressPausedSeekbarPaint;
    public static Drawable chat_replyIconDrawable;
    public static Paint chat_replyLinePaint;
    public static TextPaint chat_replyNamePaint;
    public static TextPaint chat_replyTextPaint;
    public static Drawable chat_roundVideoShadow;
    public static Drawable chat_shareIconDrawable;
    public static TextPaint chat_shipmentPaint;
    public static Paint chat_statusPaint;
    public static Paint chat_statusRecordPaint;
    public static TextPaint chat_stickerCommentCountPaint;
    public static Paint chat_textSearchSelectionPaint;
    public static Paint chat_timeBackgroundPaint;
    public static TextPaint chat_timePaint;
    public static TextPaint chat_titleLabelTextPaint;
    public static TextPaint chat_topicTextPaint;
    public static TextPaint chat_unlockExtendedMediaTextPaint;
    public static Paint chat_urlPaint;
    public static Paint chat_videoProgressPaint;
    public static Paint checkboxSquare_backgroundPaint;
    public static Paint checkboxSquare_checkPaint;
    public static Paint checkboxSquare_eraserPaint;
    public static int colorsCount;
    public static int currentColor;
    private static SparseIntArray currentColors;
    private static SparseIntArray currentColorsNoAccent;
    private static ThemeInfo currentDayTheme;
    private static ThemeInfo currentNightTheme;
    private static ThemeInfo currentTheme;
    private static final HashMap defaultChatDrawableColorKeys;
    private static final HashMap defaultChatDrawables;
    private static final HashMap defaultChatPaintColors;
    private static final HashMap defaultChatPaints;
    private static int[] defaultColors;
    private static ThemeInfo defaultTheme;
    public static Paint dialogs_actionMessagePaint;
    public static RLottieDrawable dialogs_archiveAvatarDrawable;
    public static boolean dialogs_archiveAvatarDrawableRecolored;
    public static RLottieDrawable dialogs_archiveDrawable;
    public static boolean dialogs_archiveDrawableRecolored;
    public static TextPaint dialogs_archiveTextPaint;
    public static TextPaint dialogs_archiveTextPaintSmall;
    public static Drawable dialogs_checkDrawable;
    public static Drawable dialogs_checkReadDrawable;
    public static Drawable dialogs_clockDrawable;
    public static Drawable dialogs_communityCardsDrawable;
    public static Paint dialogs_countGrayPaint;
    public static Paint dialogs_countPaint;
    public static TextPaint dialogs_countTextPaint;
    public static TextPaint dialogs_countTextPaint2;
    public static Drawable dialogs_errorDrawable;
    public static Paint dialogs_errorPaint;
    public static ScamDrawable dialogs_fakeDrawable;
    public static Drawable dialogs_forum_arrowDrawable;
    public static Drawable dialogs_halfCheckDrawable;
    public static Drawable dialogs_hiddenDrawable;
    public static RLottieDrawable dialogs_hidePsaDrawable;
    public static boolean dialogs_hidePsaDrawableRecolored;
    public static Drawable dialogs_holidayDrawable;
    private static int dialogs_holidayDrawableOffsetX;
    private static int dialogs_holidayDrawableOffsetY;
    public static Drawable dialogs_lock2Drawable;
    public static Drawable dialogs_lockDrawable;
    public static Drawable dialogs_mentionDrawable;
    public static Drawable dialogs_mentionDrawableMuted;
    public static TextPaint dialogs_messageNamePaint;
    public static TextPaint[] dialogs_messagePaint;
    public static TextPaint[] dialogs_messagePrintingPaint;
    public static Drawable dialogs_muteDrawable;
    public static TextPaint[] dialogs_nameEncryptedPaint;
    public static TextPaint[] dialogs_namePaint;
    public static TextPaint dialogs_offlinePaint;
    public static Paint dialogs_onlineCirclePaint;
    public static TextPaint dialogs_onlinePaint;
    public static RLottieDrawable dialogs_pinArchiveDrawable;
    public static Drawable dialogs_pinnedDrawable;
    public static Drawable dialogs_pinnedDrawable2;
    public static Drawable dialogs_pinnedDrawable2Accent;
    public static Paint dialogs_pinnedPaint;
    public static Drawable dialogs_playDrawable;
    public static Drawable dialogs_pollMentionDrawable;
    public static Drawable dialogs_pollMentionDrawableMuted;
    public static Drawable dialogs_reactionsMentionDrawable;
    public static Drawable dialogs_reactionsMentionDrawableMuted;
    public static Drawable dialogs_reorderDrawable;
    public static ScamDrawable dialogs_scamDrawable;
    public static TextPaint dialogs_searchNameEncryptedPaint;
    public static TextPaint dialogs_searchNamePaint;
    public static RLottieDrawable dialogs_swipeCommunityUngroup;
    public static RLottieDrawable dialogs_swipeDeleteDrawable;
    public static RLottieDrawable dialogs_swipeMuteDrawable;
    public static RLottieDrawable dialogs_swipePinDrawable;
    public static RLottieDrawable dialogs_swipeReadDrawable;
    public static RLottieDrawable dialogs_swipeUnmuteDrawable;
    public static RLottieDrawable dialogs_swipeUnpinDrawable;
    public static RLottieDrawable dialogs_swipeUnreadDrawable;
    public static Paint dialogs_tabletSeletedPaint;
    public static Paint dialogs_tagPaint;
    public static TextPaint dialogs_tagTextPaint;
    public static TextPaint dialogs_timePaint;
    public static TextPaint dialogs_timePaintBold;
    public static TextPaint dialogs_timePaintBoldAccent;
    public static RLottieDrawable dialogs_unarchiveDrawable;
    public static Drawable dialogs_unmuteDrawable;
    public static RLottieDrawable dialogs_unpinArchiveDrawable;
    public static Drawable dialogs_verifiedCheckDrawable;
    public static Drawable dialogs_verifiedDrawable;
    public static boolean disallowChangeServiceMessageColor;
    public static Paint dividerExtraPaint;
    public static Paint dividerPaint;
    private static SparseIntArray fallbackKeys;
    private static FragmentContextViewWavesDrawable fragmentContextViewWavesDrawable;
    private static boolean hasPreviousTheme;
    private static final ThreadLocal hsvTemp1Local;
    private static final ThreadLocal hsvTemp2Local;
    private static final ThreadLocal hsvTemp3Local;
    private static final ThreadLocal hsvTemp4Local;
    private static final ThreadLocal hsvTemp5Local;
    private static boolean isApplyingAccent;
    private static boolean isCustomTheme;
    private static boolean isInNigthMode;
    private static boolean isPatternWallpaper;
    private static boolean isWallpaperMotion;
    public static final int key_actionBarActionModeDefault;
    public static final int key_actionBarActionModeDefaultIcon;
    public static final int key_actionBarActionModeDefaultSelector;
    public static final int key_actionBarActionModeDefaultTop;
    public static final int key_actionBarActionModeReaction;
    public static final int key_actionBarActionModeReactionDot;
    public static final int key_actionBarActionModeReactionText;
    public static final int key_actionBarBrowser;
    public static final int key_actionBarDefault;
    public static final int key_actionBarDefaultArchived;
    public static final int key_actionBarDefaultArchivedIcon;
    public static final int key_actionBarDefaultArchivedSearch;
    public static final int key_actionBarDefaultArchivedSearchPlaceholder;
    public static final int key_actionBarDefaultArchivedSelector;
    public static final int key_actionBarDefaultArchivedTitle;
    public static final int key_actionBarDefaultIcon;
    public static final int key_actionBarDefaultSearch;
    public static final int key_actionBarDefaultSearchPlaceholder;
    public static final int key_actionBarDefaultSelector;
    public static final int key_actionBarDefaultSubmenuBackground;
    public static final int key_actionBarDefaultSubmenuItem;
    public static final int key_actionBarDefaultSubmenuItemIcon;
    public static final int key_actionBarDefaultSubmenuSeparator;
    public static final int key_actionBarDefaultSubtitle;
    public static final int key_actionBarDefaultTitle;
    public static final int key_actionBarTabActiveText;
    public static final int key_actionBarTabLine;
    public static final int key_actionBarTabSelector;
    public static final int key_actionBarTabUnactiveText;
    public static final int key_actionBarWhiteSelector;
    public static final int key_avatar_actionBarIconBlue;
    public static final int key_avatar_actionBarSelectorBlue;
    public static final int key_avatar_background2Blue;
    public static final int key_avatar_background2Cyan;
    public static final int key_avatar_background2Green;
    public static final int key_avatar_background2Orange;
    public static final int key_avatar_background2Pink;
    public static final int key_avatar_background2Red;
    public static final int key_avatar_background2Saved;
    public static final int key_avatar_background2Violet;
    public static final int key_avatar_backgroundActionBarBlue;
    public static final int key_avatar_backgroundArchived;
    public static final int key_avatar_backgroundArchivedHidden;
    public static final int key_avatar_backgroundBlue;
    public static final int key_avatar_backgroundCyan;
    public static final int key_avatar_backgroundGray;
    public static final int key_avatar_backgroundGreen;
    public static final int key_avatar_backgroundInProfileBlue;
    public static final int key_avatar_backgroundOrange;
    public static final int key_avatar_backgroundPink;
    public static final int key_avatar_backgroundRed;
    public static final int key_avatar_backgroundSaved;
    public static final int key_avatar_backgroundViolet;
    public static final int key_avatar_nameInMessageBlue;
    public static final int key_avatar_nameInMessageCyan;
    public static final int key_avatar_nameInMessageGreen;
    public static final int key_avatar_nameInMessageOrange;
    public static final int key_avatar_nameInMessagePink;
    public static final int key_avatar_nameInMessageRed;
    public static final int key_avatar_nameInMessageViolet;
    public static final int key_avatar_subtitleInProfileBlue;
    public static final int key_avatar_text;
    public static final int key_botKeyboard_button_danger;
    public static final int key_botKeyboard_button_primary;
    public static final int key_botKeyboard_button_success;
    public static final int key_bot_loadingIcon;
    public static final int key_buttonNeutral;
    public static final int key_buttonNeutralText;
    public static final int key_calls_callReceivedGreenIcon;
    public static final int key_calls_callReceivedRedIcon;
    public static final int key_changephoneinfo_image2;
    public static final int key_chat_BlurAlpha;
    public static final int key_chat_BlurAlphaSlow;
    public static final int key_chat_TextSelectionCursor;
    public static final int key_chat_addContact;
    public static final int key_chat_attachActiveTab;
    public static final int key_chat_attachAudioBackground;
    public static final int key_chat_attachCheckBoxBackground;
    public static final int key_chat_attachCheckBoxCheck;
    public static final int key_chat_attachContactBackground;
    public static final int key_chat_attachContactText;
    public static final int key_chat_attachEmptyImage;
    public static final int key_chat_attachGalleryBackground;
    public static final int key_chat_attachIcon;
    public static final int key_chat_attachLocationBackground;
    public static final int key_chat_attachPermissionImage;
    public static final int key_chat_attachPermissionMark;
    public static final int key_chat_attachPermissionText;
    public static final int key_chat_attachPhotoBackground;
    public static final int key_chat_attachPollBackground;
    public static final int key_chat_attachUnactiveTab;
    public static final int key_chat_botButtonText;
    public static final int key_chat_botKeyboardButtonBackground;
    public static final int key_chat_botKeyboardButtonBackgroundPressed;
    public static final int key_chat_botKeyboardButtonText;
    public static final int key_chat_botSwitchToInlineText;
    public static final int key_chat_editMediaButton;
    public static final int key_chat_emojiBottomPanelIcon;
    public static final int key_chat_emojiPanelBackground;
    public static final int key_chat_emojiPanelBackspace;
    public static final int key_chat_emojiPanelEmptyText;
    public static final int key_chat_emojiPanelIcon;
    public static final int key_chat_emojiPanelIconSelected;
    public static final int key_chat_emojiPanelNewTrending;
    public static final int key_chat_emojiPanelShadowLine;
    public static final int key_chat_emojiPanelStickerPackSelector;
    public static final int key_chat_emojiPanelStickerPackSelectorLine;
    public static final int key_chat_emojiPanelStickerSetName;
    public static final int key_chat_emojiPanelStickerSetNameHighlight;
    public static final int key_chat_emojiPanelStickerSetNameIcon;
    public static final int key_chat_emojiPanelTrendingDescription;
    public static final int key_chat_emojiPanelTrendingTitle;
    public static final int key_chat_emojiSearchBackground;
    public static final int key_chat_emojiSearchIcon;
    public static final int key_chat_fieldOverlayText;
    public static final int key_chat_gifSaveHintBackground;
    public static final int key_chat_gifSaveHintText;
    public static final int key_chat_goDownButton;
    public static final int key_chat_goDownButtonCounter;
    public static final int key_chat_goDownButtonCounterBackground;
    public static final int key_chat_inAdminSelectedText;
    public static final int key_chat_inAdminText;
    public static final int key_chat_inArticleCodeBackground;
    public static final int key_chat_inArticleCodeScrollbar;
    public static final int key_chat_inArticleCodeScrollbarBackground;
    public static final int key_chat_inArticleDetailsArrow;
    public static final int key_chat_inArticleDetailsLine;
    public static final int key_chat_inAudioCacheSeekbar;
    public static final int key_chat_inAudioDurationSelectedText;
    public static final int key_chat_inAudioDurationText;
    public static final int key_chat_inAudioPerformerSelectedText;
    public static final int key_chat_inAudioPerformerText;
    public static final int key_chat_inAudioProgress;
    public static final int key_chat_inAudioSeekbar;
    public static final int key_chat_inAudioSeekbarFill;
    public static final int key_chat_inAudioSeekbarSelected;
    public static final int key_chat_inAudioSelectedProgress;
    public static final int key_chat_inAudioTitleText;
    public static final int key_chat_inBubble;
    public static final int key_chat_inBubbleLocationPlaceholder;
    public static final int key_chat_inBubbleSelected;
    public static final int key_chat_inBubbleSelectedOverlay;
    public static final int key_chat_inBubbleShadow;
    public static final int key_chat_inCodeBackground;
    public static final int key_chat_inContactBackground;
    public static final int key_chat_inContactIcon;
    public static final int key_chat_inContactNameText;
    public static final int key_chat_inContactPhoneSelectedText;
    public static final int key_chat_inContactPhoneText;
    public static final int key_chat_inDivider;
    public static final int key_chat_inFileBackground;
    public static final int key_chat_inFileBackgroundSelected;
    public static final int key_chat_inFileInfoSelectedText;
    public static final int key_chat_inFileInfoText;
    public static final int key_chat_inFileNameText;
    public static final int key_chat_inFileProgress;
    public static final int key_chat_inFileProgressSelected;
    public static final int key_chat_inForwardedNameText;
    public static final int key_chat_inGreenCall;
    public static final int key_chat_inInstant;
    public static final int key_chat_inInstantSelected;
    public static final int key_chat_inLoader;
    public static final int key_chat_inLoaderPhoto;
    public static final int key_chat_inLoaderSelected;
    public static final int key_chat_inLocationBackground;
    public static final int key_chat_inLocationIcon;
    public static final int key_chat_inMediaIcon;
    public static final int key_chat_inMediaIconSelected;
    public static final int key_chat_inMenu;
    public static final int key_chat_inMenuSelected;
    public static final int key_chat_inPollCorrectAnswer;
    public static final int key_chat_inPollWrongAnswer;
    public static final int key_chat_inPreviewInstantText;
    public static final int key_chat_inPreviewLine;
    public static final int key_chat_inPsaNameText;
    public static final int key_chat_inQuote;
    public static final int key_chat_inReactionButtonBackground;
    public static final int key_chat_inReactionButtonText;
    public static final int key_chat_inReactionButtonTextSelected;
    public static final int key_chat_inReplyLine;
    public static final int key_chat_inReplyMediaMessageSelectedText;
    public static final int key_chat_inReplyMediaMessageText;
    public static final int key_chat_inReplyMessageText;
    public static final int key_chat_inReplyNameText;
    public static final int key_chat_inSentClock;
    public static final int key_chat_inSentClockSelected;
    public static final int key_chat_inSiteNameText;
    public static final int key_chat_inTableBackground;
    public static final int key_chat_inTableBorder;
    public static final int key_chat_inTextSelectionHighlight;
    public static final int key_chat_inTimeSelectedText;
    public static final int key_chat_inTimeText;
    public static final int key_chat_inVenueInfoSelectedText;
    public static final int key_chat_inVenueInfoText;
    public static final int key_chat_inViaBotNameText;
    public static final int key_chat_inViews;
    public static final int key_chat_inViewsSelected;
    public static final int key_chat_inVoiceSeekbar;
    public static final int key_chat_inVoiceSeekbarFill;
    public static final int key_chat_inVoiceSeekbarSelected;
    public static final int key_chat_inlineResultIcon;
    public static final int key_chat_linkSelectBackground;
    public static final int key_chat_lockIcon;
    public static final int key_chat_mediaInfoText;
    public static final int key_chat_mediaLoaderPhoto;
    public static final int key_chat_mediaLoaderPhotoIcon;
    public static final int key_chat_mediaLoaderPhotoIconSelected;
    public static final int key_chat_mediaLoaderPhotoSelected;
    public static final int key_chat_mediaMenu;
    public static final int key_chat_mediaProgress;
    public static final int key_chat_mediaSentCheck;
    public static final int key_chat_mediaSentClock;
    public static final int key_chat_mediaTimeBackground;
    public static final int key_chat_mediaTimeText;
    public static final int key_chat_mediaViews;
    public static final int key_chat_messageLinkIn;
    public static final int key_chat_messageLinkOut;
    public static final int key_chat_messagePanelBackground;
    public static final int key_chat_messagePanelCancelInlineBot;
    public static final int key_chat_messagePanelCursor;
    public static final int key_chat_messagePanelHint;
    public static final int key_chat_messagePanelIcons;
    public static final int key_chat_messagePanelSend;
    public static final int key_chat_messagePanelShadow;
    public static final int key_chat_messagePanelText;
    public static final int key_chat_messagePanelVoiceBackground;
    public static final int key_chat_messagePanelVoiceDelete;
    public static final int key_chat_messagePanelVoiceDuration;
    public static final int key_chat_messagePanelVoiceLock;
    public static final int key_chat_messagePanelVoiceLockBackground;
    public static final int key_chat_messagePanelVoiceLockShadow;
    public static final int key_chat_messagePanelVoicePressed;
    public static final int key_chat_messageTextIn;
    public static final int key_chat_messageTextOut;
    public static final int key_chat_msgIvButtonDangerIn;
    public static final int key_chat_msgIvButtonDangerInPressed;
    public static final int key_chat_msgIvButtonDangerInText;
    public static final int key_chat_msgIvButtonDangerOut;
    public static final int key_chat_msgIvButtonDangerOutPressed;
    public static final int key_chat_msgIvButtonDangerOutText;
    public static final int key_chat_msgIvButtonDefaultIn;
    public static final int key_chat_msgIvButtonDefaultInPressed;
    public static final int key_chat_msgIvButtonDefaultInText;
    public static final int key_chat_msgIvButtonDefaultInlineIn;
    public static final int key_chat_msgIvButtonDefaultInlineInPressed;
    public static final int key_chat_msgIvButtonDefaultInlineInText;
    public static final int key_chat_msgIvButtonDefaultInlineOut;
    public static final int key_chat_msgIvButtonDefaultInlineOutPressed;
    public static final int key_chat_msgIvButtonDefaultInlineOutText;
    public static final int key_chat_msgIvButtonDefaultOut;
    public static final int key_chat_msgIvButtonDefaultOutPressed;
    public static final int key_chat_msgIvButtonDefaultOutText;
    public static final int key_chat_msgIvButtonPrimaryIn;
    public static final int key_chat_msgIvButtonPrimaryInPressed;
    public static final int key_chat_msgIvButtonPrimaryInText;
    public static final int key_chat_msgIvButtonPrimaryOut;
    public static final int key_chat_msgIvButtonPrimaryOutPressed;
    public static final int key_chat_msgIvButtonPrimaryOutText;
    public static final int key_chat_msgIvButtonSuccessIn;
    public static final int key_chat_msgIvButtonSuccessInPressed;
    public static final int key_chat_msgIvButtonSuccessInText;
    public static final int key_chat_msgIvButtonSuccessOut;
    public static final int key_chat_msgIvButtonSuccessOutPressed;
    public static final int key_chat_msgIvButtonSuccessOutText;
    public static final int key_chat_muteIcon;
    public static final int key_chat_outAdminSelectedText;
    public static final int key_chat_outAdminText;
    public static final int key_chat_outArticleCodeBackground;
    public static final int key_chat_outArticleCodeScrollbar;
    public static final int key_chat_outArticleCodeScrollbarBackground;
    public static final int key_chat_outArticleDetailsArrow;
    public static final int key_chat_outArticleDetailsLine;
    public static final int key_chat_outAudioCacheSeekbar;
    public static final int key_chat_outAudioDurationSelectedText;
    public static final int key_chat_outAudioDurationText;
    public static final int key_chat_outAudioPerformerSelectedText;
    public static final int key_chat_outAudioPerformerText;
    public static final int key_chat_outAudioProgress;
    public static final int key_chat_outAudioSeekbar;
    public static final int key_chat_outAudioSeekbarFill;
    public static final int key_chat_outAudioSeekbarSelected;
    public static final int key_chat_outAudioSelectedProgress;
    public static final int key_chat_outAudioTitleText;
    public static final int key_chat_outBubble;
    public static final int key_chat_outBubbleGradient1;
    public static final int key_chat_outBubbleGradient2;
    public static final int key_chat_outBubbleGradient3;
    public static final int key_chat_outBubbleGradientAnimated;
    public static final int key_chat_outBubbleGradientSelectedOverlay;
    public static final int key_chat_outBubbleLocationPlaceholder;
    public static final int key_chat_outBubbleSelected;
    public static final int key_chat_outBubbleSelectedOverlay;
    public static final int key_chat_outBubbleShadow;
    public static final int key_chat_outCodeBackground;
    public static final int key_chat_outContactBackground;
    public static final int key_chat_outContactIcon;
    public static final int key_chat_outContactNameText;
    public static final int key_chat_outContactPhoneSelectedText;
    public static final int key_chat_outContactPhoneText;
    public static final int key_chat_outDivider;
    public static final int key_chat_outFileBackground;
    public static final int key_chat_outFileBackgroundSelected;
    public static final int key_chat_outFileInfoSelectedText;
    public static final int key_chat_outFileInfoText;
    public static final int key_chat_outFileNameText;
    public static final int key_chat_outFileProgress;
    public static final int key_chat_outFileProgressSelected;
    public static final int key_chat_outForwardedNameText;
    public static final int key_chat_outGreenCall;
    public static final int key_chat_outInstant;
    public static final int key_chat_outInstantSelected;
    public static final int key_chat_outLinkSelectBackground;
    public static final int key_chat_outLoader;
    public static final int key_chat_outLoaderSelected;
    public static final int key_chat_outLocationIcon;
    public static final int key_chat_outMediaIcon;
    public static final int key_chat_outMediaIconSelected;
    public static final int key_chat_outMenu;
    public static final int key_chat_outMenuSelected;
    public static final int key_chat_outPollCorrectAnswer;
    public static final int key_chat_outPollWrongAnswer;
    public static final int key_chat_outPreviewInstantText;
    public static final int key_chat_outPreviewLine;
    public static final int key_chat_outPsaNameText;
    public static final int key_chat_outQuote;
    public static final int key_chat_outReactionButtonBackground;
    public static final int key_chat_outReactionButtonText;
    public static final int key_chat_outReactionButtonTextSelected;
    public static final int key_chat_outReplyLine;
    public static final int key_chat_outReplyLine2;
    public static final int key_chat_outReplyMediaMessageSelectedText;
    public static final int key_chat_outReplyMediaMessageText;
    public static final int key_chat_outReplyMessageText;
    public static final int key_chat_outReplyNameText;
    public static final int key_chat_outSentCheck;
    public static final int key_chat_outSentCheckRead;
    public static final int key_chat_outSentCheckReadSelected;
    public static final int key_chat_outSentCheckSelected;
    public static final int key_chat_outSentClock;
    public static final int key_chat_outSentClockSelected;
    public static final int key_chat_outSiteNameText;
    public static final int key_chat_outTableBackground;
    public static final int key_chat_outTableBorder;
    public static final int key_chat_outTextSelectionCursor;
    public static final int key_chat_outTextSelectionHighlight;
    public static final int key_chat_outTimeSelectedText;
    public static final int key_chat_outTimeText;
    public static final int key_chat_outVenueInfoSelectedText;
    public static final int key_chat_outVenueInfoText;
    public static final int key_chat_outViaBotNameText;
    public static final int key_chat_outViews;
    public static final int key_chat_outViewsSelected;
    public static final int key_chat_outVoiceSeekbar;
    public static final int key_chat_outVoiceSeekbarFill;
    public static final int key_chat_outVoiceSeekbarSelected;
    public static final int key_chat_previewDurationText;
    public static final int key_chat_previewGameText;
    public static final int key_chat_reactionServiceButtonBackgroundSelected;
    public static final int key_chat_reactionServiceButtonTextSelected;
    public static final int key_chat_recordTime;
    public static final int key_chat_recordVoiceCancel;
    public static final int key_chat_recordedVoiceBackground;
    public static final int key_chat_recordedVoiceDarkerBackground;
    public static final int key_chat_recordedVoiceDot;
    public static final int key_chat_recordedVoicePlayPause;
    public static final int key_chat_recordedVoiceProgress;
    public static final int key_chat_recordedVoiceProgressInner;
    public static final int key_chat_replyPanelClose;
    public static final int key_chat_replyPanelIcons;
    public static final int key_chat_replyPanelLine;
    public static final int key_chat_replyPanelName;
    public static final int key_chat_searchPanelIcons;
    public static final int key_chat_searchPanelText;
    public static final int key_chat_secretChatStatusText;
    public static final int key_chat_secretTimeText;
    public static final int key_chat_selectedBackground;
    public static final int key_chat_sentError;
    public static final int key_chat_sentErrorIcon;
    public static final int key_chat_serviceBackground;
    public static final int key_chat_serviceBackgroundSelected;
    public static final int key_chat_serviceBackgroundSelector;
    public static final int key_chat_serviceIcon;
    public static final int key_chat_serviceLink;
    public static final int key_chat_serviceText;
    public static final int key_chat_status;
    public static final int key_chat_stickerNameText;
    public static final int key_chat_stickerReplyLine;
    public static final int key_chat_stickerReplyMessageText;
    public static final int key_chat_stickerReplyNameText;
    public static final int key_chat_stickerViaBotNameText;
    public static final int key_chat_stickersHintPanel;
    public static final int key_chat_tagAdmin;
    public static final int key_chat_tagCreator;
    public static final int key_chat_textSelectBackground;
    public static final int key_chat_topPanelBackground;
    public static final int key_chat_topPanelClose;
    public static final int key_chat_topPanelLine;
    public static final int key_chat_topPanelMessage;
    public static final int key_chat_topPanelTitle;
    public static final int key_chat_unreadMessagesStartArrowIcon;
    public static final int key_chat_unreadMessagesStartBackground;
    public static final int key_chat_unreadMessagesStartText;
    public static final int key_chat_wallpaper;
    public static final int key_chat_wallpaper_gradient_rotation;
    public static final int key_chat_wallpaper_gradient_to1;
    public static final int key_chat_wallpaper_gradient_to2;
    public static final int key_chat_wallpaper_gradient_to3;
    public static final int key_chats_actionBackground;
    public static final int key_chats_actionIcon;
    public static final int key_chats_actionMessage;
    public static final int key_chats_actionPressedBackground;
    public static final int key_chats_archiveBackground;
    public static final int key_chats_archiveIcon;
    public static final int key_chats_archivePinBackground;
    public static final int key_chats_archivePullDownBackground;
    public static final int key_chats_archivePullDownBackgroundActive;
    public static final int key_chats_archiveText;
    public static final int key_chats_attachMessage;
    public static final int key_chats_date;
    public static final int key_chats_date_bold;
    public static final int key_chats_draft;
    public static final int key_chats_mentionIcon;
    public static final int key_chats_menuBackground;
    public static final int key_chats_menuItemCheck;
    public static final int key_chats_menuItemIcon;
    public static final int key_chats_menuItemText;
    public static final int key_chats_menuName;
    public static final int key_chats_menuPhone;
    public static final int key_chats_menuPhoneCats;
    public static final int key_chats_menuTopBackground;
    public static final int key_chats_menuTopBackgroundCats;
    public static final int key_chats_menuTopShadow;
    public static final int key_chats_menuTopShadowCats;
    public static final int key_chats_message;
    public static final int key_chats_messageArchived;
    public static final int key_chats_message_threeLines;
    public static final int key_chats_muteIcon;
    public static final int key_chats_name;
    public static final int key_chats_nameArchived;
    public static final int key_chats_nameMessage;
    public static final int key_chats_nameMessageArchived;
    public static final int key_chats_nameMessageArchived_threeLines;
    public static final int key_chats_nameMessage_threeLines;
    public static final int key_chats_onlineCircle;
    public static final int key_chats_pinnedIcon;
    public static final int key_chats_pinnedOverlay;
    public static final int key_chats_secretIcon;
    public static final int key_chats_secretName;
    public static final int key_chats_sentCheck;
    public static final int key_chats_sentClock;
    public static final int key_chats_sentError;
    public static final int key_chats_sentErrorIcon;
    public static final int key_chats_sentReadCheck;
    public static final int key_chats_tabUnreadActiveBackground;
    public static final int key_chats_tabUnreadUnactiveBackground;
    public static final int key_chats_tabletSelectedOverlay;
    public static final int key_chats_unreadCounter;
    public static final int key_chats_unreadCounterMuted;
    public static final int key_chats_unreadCounterText;
    public static final int key_chats_verifiedBackground;
    public static final int key_chats_verifiedCheck;
    public static final int key_checkbox;
    public static final int key_checkboxCheck;
    public static final int key_checkboxDisabled;
    public static final int key_checkboxSquareBackground;
    public static final int key_checkboxSquareCheck;
    public static final int key_checkboxSquareDisabled;
    public static final int key_checkboxSquareUnchecked;
    public static final int key_code_comment;
    public static final int key_code_constant;
    public static final int key_code_function;
    public static final int key_code_keyword;
    public static final int key_code_number;
    public static final int key_code_operator;
    public static final int key_code_string;
    public static final int key_color_blue;
    public static final int key_color_cyan;
    public static final int key_color_green;
    public static final int key_color_lightblue;
    public static final int key_color_lightgreen;
    public static final int key_color_orange;
    public static final int key_color_purple;
    public static final int key_color_red;
    public static final int key_color_yellow;
    public static final int key_contacts_inviteBackground;
    public static final int key_contacts_inviteText;
    public static final int key_contextProgressInner1;
    public static final int key_contextProgressInner2;
    public static final int key_contextProgressInner3;
    public static final int key_contextProgressInner4;
    public static final int key_contextProgressOuter1;
    public static final int key_contextProgressOuter2;
    public static final int key_contextProgressOuter3;
    public static final int key_contextProgressOuter4;
    public static final int key_dialogBackground;
    public static final int key_dialogBackgroundGray;
    public static final int key_dialogButton;
    public static final int key_dialogButtonSelector;
    public static final int key_dialogCardShadow;
    public static final int key_dialogCheckboxSquareBackground;
    public static final int key_dialogCheckboxSquareCheck;
    public static final int key_dialogCheckboxSquareDisabled;
    public static final int key_dialogCheckboxSquareUnchecked;
    public static final int key_dialogEmptyImage;
    public static final int key_dialogEmptyText;
    public static final int key_dialogFloatingButton;
    public static final int key_dialogFloatingButtonPressed;
    public static final int key_dialogFloatingIcon;
    public static final int key_dialogGiftsBackground;
    public static final int key_dialogGiftsTabText;
    public static final int key_dialogGrayLine;
    public static final int key_dialogIcon;
    public static final int key_dialogInputField;
    public static final int key_dialogInputFieldActivated;
    public static final int key_dialogLineProgress;
    public static final int key_dialogLineProgressBackground;
    public static final int key_dialogLinkSelection;
    public static final int key_dialogRadioBackground;
    public static final int key_dialogRadioBackgroundChecked;
    public static final int key_dialogReactionMentionBackground;
    public static final int key_dialogRoundCheckBox;
    public static final int key_dialogRoundCheckBoxCheck;
    public static final int key_dialogScrollGlow;
    public static final int key_dialogSearchBackground;
    public static final int key_dialogSearchHint;
    public static final int key_dialogSearchIcon;
    public static final int key_dialogSearchText;
    public static final int key_dialogShadowLine;
    public static final int key_dialogSwipeRemove;
    public static final int key_dialogTextBlack;
    public static final int key_dialogTextBlue;
    public static final int key_dialogTextBlue2;
    public static final int key_dialogTextBlue4;
    public static final int key_dialogTextGray;
    public static final int key_dialogTextGray2;
    public static final int key_dialogTextGray3;
    public static final int key_dialogTextGray4;
    public static final int key_dialogTextHint;
    public static final int key_dialogTextLink;
    public static final int key_dialogTopBackground;
    public static final int key_dialog_inlineProgress;
    public static final int key_dialog_inlineProgressBackground;
    public static final int key_dialog_liveLocationProgress;
    public static final int key_divider;
    public static final int key_emptyListPlaceholder;
    public static final int key_fastScrollActive;
    public static final int key_fastScrollInactive;
    public static final int key_fastScrollText;
    public static final int key_featuredStickers_addButton;
    public static final int key_featuredStickers_addButton2;
    public static final int key_featuredStickers_addButtonPressed;
    public static final int key_featuredStickers_addedIcon;
    public static final int key_featuredStickers_buttonProgress;
    public static final int key_featuredStickers_buttonText;
    public static final int key_featuredStickers_removeButtonText;
    public static final int key_featuredStickers_unread;
    public static final int key_files_folderIcon;
    public static final int key_files_folderIconBackground;
    public static final int key_files_iconText;
    public static final int key_fill_RedDark;
    public static final int key_fill_RedNormal;
    public static final int key_gift_ribbon;
    public static final int key_gift_ribbon_soldout;
    public static final int key_glass_defaultIcon;
    public static final int key_glass_defaultText;
    public static final int key_glass_tabSelected;
    public static final int key_glass_tabSelectedText;
    public static final int key_glass_tabUnselected;
    public static final int key_glass_targetMainTabs;
    public static final int key_glass_targetMainTopPanel;
    public static final int key_graySection;
    public static final int key_graySectionText;
    public static final int key_groupcreate_cursor;
    public static final int key_groupcreate_hintText;
    public static final int key_groupcreate_sectionShadow;
    public static final int key_groupcreate_sectionText;
    public static final int key_groupcreate_spanBackground;
    public static final int key_groupcreate_spanDelete;
    public static final int key_groupcreate_spanText;
    public static final int key_inappPlayerBackground;
    public static final int key_inappPlayerClose;
    public static final int key_inappPlayerPerformer;
    public static final int key_inappPlayerPlayPause;
    public static final int key_inappPlayerTitle;
    public static final int key_iv_ab_progress;
    public static final int key_iv_background;
    public static final int key_iv_backgroundGray;
    public static final int key_iv_navigationBackground;
    public static final int key_listSelector;
    public static final int key_location_actionActiveIcon;
    public static final int key_location_actionBackground;
    public static final int key_location_actionIcon;
    public static final int key_location_actionPressedBackground;
    public static final int key_location_liveLocationProgress;
    public static final int key_location_placeLocationBackground;
    public static final int key_location_sendLiveLocationBackground;
    public static final int key_location_sendLiveLocationIcon;
    public static final int key_location_sendLiveLocationText;
    public static final int key_location_sendLocationBackground;
    public static final int key_location_sendLocationIcon;
    public static final int key_location_sendLocationText;
    public static final int key_login_progressInner;
    public static final int key_login_progressOuter;
    public static final int key_passport_authorizeBackground;
    public static final int key_passport_authorizeBackgroundSelected;
    public static final int key_passport_authorizeText;
    public static final int key_picker_badge;
    public static final int key_picker_badgeText;
    public static final int key_picker_disabledButton;
    public static final int key_picker_enabledButton;
    public static final int key_player_actionBarItems;
    public static final int key_player_actionBarSelector;
    public static final int key_player_actionBarSubtitle;
    public static final int key_player_actionBarTitle;
    public static final int key_player_background;
    public static final int key_player_button;
    public static final int key_player_buttonActive;
    public static final int key_player_progress;
    public static final int key_player_progressBackground;
    public static final int key_player_progressCachedBackground;
    public static final int key_player_time;
    public static final int key_pollCreateIcons;
    public static final int key_premiumCoinGradient1;
    public static final int key_premiumCoinGradient2;
    public static final int key_premiumGradient0;
    public static final int key_premiumGradient1;
    public static final int key_premiumGradient2;
    public static final int key_premiumGradient3;
    public static final int key_premiumGradient4;
    public static final int key_premiumGradientBackground1;
    public static final int key_premiumGradientBackground2;
    public static final int key_premiumGradientBackground3;
    public static final int key_premiumGradientBackground4;
    public static final int key_premiumGradientBackgroundOverlay;
    public static final int key_premiumGradientBottomSheet1;
    public static final int key_premiumGradientBottomSheet2;
    public static final int key_premiumGradientBottomSheet3;
    public static final int key_premiumStarGradient1;
    public static final int key_premiumStarGradient2;
    public static final int key_premiumStartSmallStarsColor;
    public static final int key_premiumStartSmallStarsColor2;
    public static final int key_profile_actionBackground;
    public static final int key_profile_actionIcon;
    public static final int key_profile_actionPressedBackground;
    public static final int key_profile_creatorIcon;
    public static final int key_profile_status;
    public static final int key_profile_tabSelectedLine;
    public static final int key_profile_tabSelectedText;
    public static final int key_profile_tabSelector;
    public static final int key_profile_tabText;
    public static final int key_profile_title;
    public static final int key_profile_verifiedBackground;
    public static final int key_profile_verifiedCheck;
    public static final int key_progressCircle;
    public static final int key_radioBackground;
    public static final int key_radioBackgroundChecked;
    public static final int key_reactionStarSelector;
    public static final int key_returnToCallBackground;
    public static final int key_returnToCallMutedBackground;
    public static final int key_returnToCallText;
    public static final int key_sessions_devicesImage;
    public static final int key_settings_listSelector;
    public static final int key_share_icon;
    public static final int key_share_linkBackground;
    public static final int key_share_linkText;
    public static final int key_sharedMedia_linkPlaceholder;
    public static final int key_sharedMedia_linkPlaceholderText;
    public static final int key_sharedMedia_photoPlaceholder;
    public static final int key_sharedMedia_startStopLoadIcon;
    public static final int key_sheet_other;
    public static final int key_sheet_scrollUp;
    public static final int key_starsGradient1;
    public static final int key_starsGradient2;
    public static final int key_statisticChartActiveLine;
    public static final int key_statisticChartActivePickerChart;
    public static final int key_statisticChartBackZoomColor;
    public static final int key_statisticChartChevronColor;
    public static final int key_statisticChartHintLine;
    public static final int key_statisticChartInactivePickerChart;
    public static final int key_statisticChartLineEmpty;
    public static final int key_statisticChartLine_blue;
    public static final int key_statisticChartLine_cyan;
    public static final int key_statisticChartLine_golden;
    public static final int key_statisticChartLine_green;
    public static final int key_statisticChartLine_indigo;
    public static final int key_statisticChartLine_lightblue;
    public static final int key_statisticChartLine_lightgreen;
    public static final int key_statisticChartLine_orange;
    public static final int key_statisticChartLine_purple;
    public static final int key_statisticChartLine_red;
    public static final int key_statisticChartRipple;
    public static final int key_statisticChartSignature;
    public static final int key_statisticChartSignatureAlpha;
    public static final int key_stickers_menu;
    public static final int key_stickers_menuSelector;
    public static final int key_stories_circle1;
    public static final int key_stories_circle2;
    public static final int key_stories_circle_closeFriends1;
    public static final int key_stories_circle_closeFriends2;
    public static final int key_stories_circle_dialog1;
    public static final int key_stories_circle_dialog2;
    public static final int key_stories_circle_live1;
    public static final int key_stories_circle_live2;
    public static final int key_switch2Track;
    public static final int key_switch2TrackChecked;
    public static final int key_switchTrack;
    public static final int key_switchTrackBlue;
    public static final int key_switchTrackBlueChecked;
    public static final int key_switchTrackBlueSelector;
    public static final int key_switchTrackBlueSelectorChecked;
    public static final int key_switchTrackBlueThumb;
    public static final int key_switchTrackBlueThumbChecked;
    public static final int key_switchTrackChecked;
    public static final int key_table_background;
    public static final int key_table_border;
    public static final int key_telegram_color;
    public static final int key_telegram_color_dialogsLogo;
    public static final int key_telegram_color_text;
    public static final int key_text_RedBold;
    public static final int key_text_RedRegular;
    public static final int key_topics_unreadCounter;
    public static final int key_topics_unreadCounterMuted;
    public static final int key_undo_background;
    public static final int key_undo_cancelColor;
    public static final int key_undo_infoColor;
    public static final int key_voipgroup_actionBar;
    public static final int key_voipgroup_actionBarItems;
    public static final int key_voipgroup_actionBarItemsSelector;
    public static final int key_voipgroup_actionBarUnscrolled;
    public static final int key_voipgroup_checkMenu;
    public static final int key_voipgroup_connectingProgress;
    public static final int key_voipgroup_dialogBackground;
    public static final int key_voipgroup_disabledButton;
    public static final int key_voipgroup_disabledButtonActive;
    public static final int key_voipgroup_disabledButtonActiveScrolled;
    public static final int key_voipgroup_inviteMembersBackground;
    public static final int key_voipgroup_lastSeenText;
    public static final int key_voipgroup_lastSeenTextUnscrolled;
    public static final int key_voipgroup_leaveButton;
    public static final int key_voipgroup_leaveButtonScrolled;
    public static final int key_voipgroup_leaveCallMenu;
    public static final int key_voipgroup_listSelector;
    public static final int key_voipgroup_listViewBackground;
    public static final int key_voipgroup_listViewBackgroundUnscrolled;
    public static final int key_voipgroup_listeningText;
    public static final int key_voipgroup_muteButton;
    public static final int key_voipgroup_muteButton2;
    public static final int key_voipgroup_muteButton3;
    public static final int key_voipgroup_mutedByAdminGradient;
    public static final int key_voipgroup_mutedByAdminGradient2;
    public static final int key_voipgroup_mutedByAdminGradient3;
    public static final int key_voipgroup_mutedByAdminIcon;
    public static final int key_voipgroup_mutedByAdminMuteButton;
    public static final int key_voipgroup_mutedByAdminMuteButtonDisabled;
    public static final int key_voipgroup_mutedIcon;
    public static final int key_voipgroup_mutedIconUnscrolled;
    public static final int key_voipgroup_nameText;
    public static final int key_voipgroup_overlayAlertGradientMuted;
    public static final int key_voipgroup_overlayAlertGradientMuted2;
    public static final int key_voipgroup_overlayAlertGradientUnmuted;
    public static final int key_voipgroup_overlayAlertGradientUnmuted2;
    public static final int key_voipgroup_overlayAlertMutedByAdmin;
    public static final int key_voipgroup_overlayAlertMutedByAdmin2;
    public static final int key_voipgroup_overlayBlue1;
    public static final int key_voipgroup_overlayBlue2;
    public static final int key_voipgroup_overlayGreen1;
    public static final int key_voipgroup_overlayGreen2;
    public static final int key_voipgroup_rtmpButton;
    public static final int key_voipgroup_scrollUp;
    public static final int key_voipgroup_searchBackground;
    public static final int key_voipgroup_searchPlaceholder;
    public static final int key_voipgroup_searchText;
    public static final int key_voipgroup_soundButton;
    public static final int key_voipgroup_soundButton2;
    public static final int key_voipgroup_soundButtonActive;
    public static final int key_voipgroup_soundButtonActive2;
    public static final int key_voipgroup_soundButtonActive2Scrolled;
    public static final int key_voipgroup_soundButtonActiveScrolled;
    public static final int key_voipgroup_speakingText;
    public static final int key_voipgroup_topPanelBlue1;
    public static final int key_voipgroup_topPanelBlue2;
    public static final int key_voipgroup_topPanelGray;
    public static final int key_voipgroup_topPanelGreen1;
    public static final int key_voipgroup_topPanelGreen2;
    public static final int key_voipgroup_unmuteButton;
    public static final int key_voipgroup_unmuteButton2;
    public static final int key_voipgroup_windowBackgroundWhiteInputField;
    public static final int key_voipgroup_windowBackgroundWhiteInputFieldActivated;
    public static final int key_wallpaperFileOffset;
    public static final int key_windowBackgroundCheckText;
    public static final int key_windowBackgroundChecked;
    public static final int key_windowBackgroundGray;
    public static final int key_windowBackgroundGrayShadow;
    public static final int key_windowBackgroundUnchecked;
    public static final int key_windowBackgroundWhite;
    public static final int key_windowBackgroundWhiteBlackText;
    public static final int key_windowBackgroundWhiteBlueButton;
    public static final int key_windowBackgroundWhiteBlueHeader;
    public static final int key_windowBackgroundWhiteBlueIcon;
    public static final int key_windowBackgroundWhiteBlueText;
    public static final int key_windowBackgroundWhiteBlueText2;
    public static final int key_windowBackgroundWhiteBlueText3;
    public static final int key_windowBackgroundWhiteBlueText4;
    public static final int key_windowBackgroundWhiteBlueText5;
    public static final int key_windowBackgroundWhiteBlueText6;
    public static final int key_windowBackgroundWhiteBlueText7;
    public static final int key_windowBackgroundWhiteGrayIcon;
    public static final int key_windowBackgroundWhiteGrayText;
    public static final int key_windowBackgroundWhiteGrayText2;
    public static final int key_windowBackgroundWhiteGrayText3;
    public static final int key_windowBackgroundWhiteGrayText4;
    public static final int key_windowBackgroundWhiteGrayText5;
    public static final int key_windowBackgroundWhiteGrayText6;
    public static final int key_windowBackgroundWhiteGrayText7;
    public static final int key_windowBackgroundWhiteGrayText8;
    public static final int key_windowBackgroundWhiteGreenText;
    public static final int key_windowBackgroundWhiteGreenText2;
    public static final int key_windowBackgroundWhiteHintText;
    public static final int key_windowBackgroundWhiteInputField;
    public static final int key_windowBackgroundWhiteInputFieldActivated;
    public static final int key_windowBackgroundWhiteLinkSelection;
    public static final int key_windowBackgroundWhiteLinkText;
    public static final int key_windowBackgroundWhiteValueText;
    public static int[] keys_avatar_background;
    public static int[] keys_avatar_background2;
    public static int[] keys_avatar_nameInMessage;
    public static final int[] keys_colors;
    private static long lastDelayUpdateTime;
    private static WeakReference lastDrawableToBlur;
    private static long lastHolidayCheckTime;
    private static int lastLoadingCurrentThemeTime;
    private static long lastThemeSwitchTime;
    private static Sensor lightSensor;
    private static boolean lightSensorRegistered;
    public static Paint linkSelectionPaint;
    private static int loadingCurrentTheme;
    public static Drawable moveUpDrawable;
    public static final int myMessages2EndIndex;
    public static final int myMessages2StartIndex;
    private static final int[] myMessagesAccentExtraKeys;
    public static final int myMessagesBubblesEndIndex;
    public static final int myMessagesBubblesStartIndex;
    public static final int myMessagesEndIndex;
    public static final int myMessagesStartIndex;
    private static ArrayList otherThemes;
    private static int patternIntensity;
    public static PathAnimator playPauseAnimator;
    private static int previousPhase;
    private static ThemeInfo previousTheme;
    public static TextPaint profile_aboutTextPaint;
    public static Drawable profile_verifiedCheckDrawable;
    public static Drawable profile_verifiedDrawable;
    private static RoundVideoProgressShadow roundPlayDrawable;
    public static int selectedAutoNightType;
    private static SensorManager sensorManager;
    private static Bitmap serviceBitmap;
    private static Matrix serviceBitmapMatrix;
    public static BitmapShader serviceBitmapShader;
    private static int serviceMessageColor;
    public static int serviceMessageColorBackup;
    private static int serviceSelectedMessageColor;
    public static int serviceSelectedMessageColorBackup;
    public static boolean shouldDrawGradientIcons;
    private static boolean switchDayRunnableScheduled;
    private static boolean switchNightRunnableScheduled;
    private static int switchNightThemeDelay;
    private static boolean switchingNightTheme;
    private static HashSet themeAccentExclusionKeys;
    private static Drawable themedWallpaper;
    private static int themedWallpaperFileOffset;
    private static String themedWallpaperLink;
    public static ArrayList themes;
    private static HashMap themesDict;
    private static float[] tmpHSV5;
    private static int[] viewPos;
    private static Drawable wallpaper;
    public static Runnable wallpaperLoadTask;
    public static final int default_shadow_color = ColorUtils.setAlphaComponent(-16777216, 27);
    private static final Object sync = new Object();
    private static float lastBrightnessValue = 1.0f;
    private static Runnable switchDayBrightnessRunnable = new Runnable() {
        @Override
        public void run() {
            boolean unused = Theme.switchDayRunnableScheduled = false;
            Theme.applyDayNightThemeMaybe(false);
        }
    };
    private static Runnable switchNightBrightnessRunnable = new Runnable() {
        @Override
        public void run() {
            boolean unused = Theme.switchNightRunnableScheduled = false;
            Theme.applyDayNightThemeMaybe(true);
        }
    };
    public static int DEFALT_THEME_ACCENT_ID = 99;
    private static Paint maskPaint = new Paint(1);
    private static boolean[] loadingRemoteThemes = new boolean[4];
    private static int[] lastLoadingThemesTime = new int[4];
    private static long[] remoteThemesHash = new long[4];
    public static Drawable[] avatarDrawables = new Drawable[25];
    private static StatusDrawable[] chat_status_drawables = new StatusDrawable[6];
    public static Drawable[] chat_msgInCallDrawable = new Drawable[2];
    public static Drawable[] chat_msgInCallSelectedDrawable = new Drawable[2];
    public static Drawable[] chat_msgOutCallDrawable = new Drawable[2];
    public static Drawable[] chat_msgOutCallSelectedDrawable = new Drawable[2];
    public static Drawable[] chat_pollCheckDrawable = new Drawable[2];
    public static Drawable[] chat_pollCrossDrawable = new Drawable[2];
    public static Drawable[] chat_pollHintDrawable = new Drawable[2];
    public static Drawable[] chat_psaHelpDrawable = new Drawable[2];
    public static Drawable[] chat_locationDrawable = new Drawable[2];
    public static Drawable[] chat_contactDrawable = new Drawable[2];
    public static Drawable[][] chat_fileStatesDrawable = (Drawable[][]) Array.newInstance((Class<?>) Drawable.class, 5, 2);
    public static Path[] chat_filePath = new Path[2];
    public static Path[] chat_updatePath = new Path[3];

    public static class BackgroundDrawableSettings {
        public Boolean isCustomTheme;
        public Boolean isPatternWallpaper;
        public Boolean isWallpaperMotion;
        public Drawable themedWallpaper;
        public Drawable wallpaper;
    }

    public interface Colorable {

        public abstract class CC {
            public static int[] $default$getColorKeys(Colorable colorable) {
                return null;
            }
        }

        void updateColors();
    }

    private static float abs(float f) {
        return f > 0.0f ? f : -f;
    }

    public static void destroyResources() {
    }

    public static int getWallpaperColor(int i) {
        if (i == 0) {
            return 0;
        }
        return i | (-16777216);
    }

    static {
        ThemeInfo themeInfo;
        ThemeInfo themeInfo2;
        ThemeInfo themeInfo3;
        SharedPreferences.Editor editor;
        ThemeInfo themeInfo4;
        boolean z;
        int i;
        SparseArray sparseArray;
        ThemeAccent accent;
        int i2;
        selectedAutoNightType = 0;
        autoNightBrighnessThreshold = 0.25f;
        autoNightDayStartTime = 1320;
        autoNightDayEndTime = 480;
        autoNightSunsetTime = 1320;
        autoNightLastSunCheckDay = -1;
        autoNightSunriseTime = 480;
        autoNightCityName = "";
        autoNightLocationLatitude = 10000.0d;
        autoNightLocationLongitude = 10000.0d;
        int i3 = 3;
        int i4 = colorsCount;
        key_wallpaperFileOffset = i4;
        key_dialogBackground = i4 + 1;
        key_dialogBackgroundGray = i4 + 2;
        key_dialogTextBlack = i4 + 3;
        key_dialogTextLink = i4 + 4;
        key_dialogLinkSelection = i4 + 5;
        key_dialogTextBlue = i4 + 6;
        key_dialogTextBlue2 = i4 + 7;
        key_dialogTextBlue4 = i4 + 8;
        key_dialogTextGray = i4 + 9;
        key_dialogTextGray2 = i4 + 10;
        key_dialogTextGray3 = i4 + 11;
        key_dialogTextGray4 = i4 + 12;
        key_dialogTextHint = i4 + 13;
        key_dialogInputField = i4 + 14;
        key_dialogInputFieldActivated = i4 + 15;
        key_dialogCheckboxSquareBackground = i4 + 16;
        key_dialogCheckboxSquareCheck = i4 + 17;
        key_dialogCheckboxSquareUnchecked = i4 + 18;
        key_dialogCheckboxSquareDisabled = i4 + 19;
        key_dialogScrollGlow = i4 + 20;
        key_dialogRoundCheckBox = i4 + 21;
        key_dialogRoundCheckBoxCheck = i4 + 22;
        key_dialogRadioBackground = i4 + 23;
        key_dialogRadioBackgroundChecked = i4 + 24;
        key_dialogLineProgress = i4 + 25;
        key_dialogLineProgressBackground = i4 + 26;
        key_dialogButton = i4 + 27;
        key_dialogButtonSelector = i4 + 28;
        key_dialogIcon = i4 + 29;
        key_dialogGrayLine = i4 + 30;
        key_dialogTopBackground = i4 + 31;
        key_dialog_inlineProgressBackground = i4 + 32;
        key_dialog_inlineProgress = i4 + 33;
        key_dialogSearchBackground = i4 + 34;
        key_dialogSearchHint = i4 + 35;
        key_dialogSearchIcon = i4 + 36;
        key_dialogSearchText = i4 + 37;
        key_dialogFloatingButton = i4 + 38;
        key_dialogFloatingButtonPressed = i4 + 39;
        key_dialogFloatingIcon = i4 + 40;
        key_dialogShadowLine = i4 + 41;
        colorsCount = i4 + 43;
        key_dialogEmptyImage = i4 + 42;
        int i5 = colorsCount;
        colorsCount = i5 + 1;
        key_dialogEmptyText = i5;
        int i6 = colorsCount;
        colorsCount = i6 + 1;
        key_dialogSwipeRemove = i6;
        int i7 = colorsCount;
        colorsCount = i7 + 1;
        key_dialogReactionMentionBackground = i7;
        int i8 = colorsCount;
        colorsCount = i8 + 1;
        key_dialogCardShadow = i8;
        int i9 = colorsCount;
        colorsCount = i9 + 1;
        key_dialogGiftsBackground = i9;
        int i10 = colorsCount;
        colorsCount = i10 + 1;
        key_dialogGiftsTabText = i10;
        int i11 = colorsCount;
        colorsCount = i11 + 1;
        key_windowBackgroundWhite = i11;
        int i12 = colorsCount;
        colorsCount = i12 + 1;
        key_windowBackgroundUnchecked = i12;
        int i13 = colorsCount;
        colorsCount = i13 + 1;
        key_windowBackgroundChecked = i13;
        int i14 = colorsCount;
        colorsCount = i14 + 1;
        key_windowBackgroundCheckText = i14;
        int i15 = colorsCount;
        colorsCount = i15 + 1;
        key_progressCircle = i15;
        int i16 = colorsCount;
        colorsCount = i16 + 1;
        key_listSelector = i16;
        int i17 = colorsCount;
        colorsCount = i17 + 1;
        key_settings_listSelector = i17;
        int i18 = colorsCount;
        colorsCount = i18 + 1;
        key_windowBackgroundWhiteInputField = i18;
        int i19 = colorsCount;
        colorsCount = i19 + 1;
        key_windowBackgroundWhiteInputFieldActivated = i19;
        int i20 = colorsCount;
        colorsCount = i20 + 1;
        key_windowBackgroundWhiteGrayIcon = i20;
        int i21 = colorsCount;
        colorsCount = i21 + 1;
        key_windowBackgroundWhiteBlueText = i21;
        int i22 = colorsCount;
        colorsCount = i22 + 1;
        key_windowBackgroundWhiteBlueText2 = i22;
        int i23 = colorsCount;
        colorsCount = i23 + 1;
        key_windowBackgroundWhiteBlueText3 = i23;
        int i24 = colorsCount;
        colorsCount = i24 + 1;
        key_windowBackgroundWhiteBlueText4 = i24;
        int i25 = colorsCount;
        colorsCount = i25 + 1;
        key_windowBackgroundWhiteBlueText5 = i25;
        int i26 = colorsCount;
        colorsCount = i26 + 1;
        key_windowBackgroundWhiteBlueText6 = i26;
        int i27 = colorsCount;
        colorsCount = i27 + 1;
        key_windowBackgroundWhiteBlueText7 = i27;
        int i28 = colorsCount;
        colorsCount = i28 + 1;
        key_windowBackgroundWhiteBlueButton = i28;
        int i29 = colorsCount;
        colorsCount = i29 + 1;
        key_windowBackgroundWhiteBlueIcon = i29;
        int i30 = colorsCount;
        colorsCount = i30 + 1;
        key_windowBackgroundWhiteGreenText = i30;
        int i31 = colorsCount;
        colorsCount = i31 + 1;
        key_windowBackgroundWhiteGreenText2 = i31;
        int i32 = colorsCount;
        colorsCount = i32 + 1;
        key_windowBackgroundWhiteGrayText = i32;
        int i33 = colorsCount;
        colorsCount = i33 + 1;
        key_windowBackgroundWhiteGrayText2 = i33;
        int i34 = colorsCount;
        colorsCount = i34 + 1;
        key_windowBackgroundWhiteGrayText3 = i34;
        int i35 = colorsCount;
        colorsCount = i35 + 1;
        key_windowBackgroundWhiteGrayText4 = i35;
        int i36 = colorsCount;
        colorsCount = i36 + 1;
        key_windowBackgroundWhiteGrayText5 = i36;
        int i37 = colorsCount;
        colorsCount = i37 + 1;
        key_windowBackgroundWhiteGrayText6 = i37;
        int i38 = colorsCount;
        colorsCount = i38 + 1;
        key_windowBackgroundWhiteGrayText7 = i38;
        int i39 = colorsCount;
        colorsCount = i39 + 1;
        key_windowBackgroundWhiteGrayText8 = i39;
        int i40 = colorsCount;
        colorsCount = i40 + 1;
        key_windowBackgroundWhiteBlackText = i40;
        int i41 = colorsCount;
        colorsCount = i41 + 1;
        key_windowBackgroundWhiteHintText = i41;
        int i42 = colorsCount;
        colorsCount = i42 + 1;
        key_windowBackgroundWhiteValueText = i42;
        int i43 = colorsCount;
        colorsCount = i43 + 1;
        key_windowBackgroundWhiteLinkText = i43;
        int i44 = colorsCount;
        colorsCount = i44 + 1;
        key_windowBackgroundWhiteLinkSelection = i44;
        int i45 = colorsCount;
        colorsCount = i45 + 1;
        key_windowBackgroundWhiteBlueHeader = i45;
        int i46 = colorsCount;
        colorsCount = i46 + 1;
        key_switchTrack = i46;
        int i47 = colorsCount;
        colorsCount = i47 + 1;
        key_switchTrackChecked = i47;
        int i48 = colorsCount;
        colorsCount = i48 + 1;
        key_switchTrackBlue = i48;
        int i49 = colorsCount;
        colorsCount = i49 + 1;
        key_switchTrackBlueChecked = i49;
        int i50 = colorsCount;
        colorsCount = i50 + 1;
        key_switchTrackBlueThumb = i50;
        int i51 = colorsCount;
        colorsCount = i51 + 1;
        key_switchTrackBlueThumbChecked = i51;
        int i52 = colorsCount;
        colorsCount = i52 + 1;
        key_switchTrackBlueSelector = i52;
        int i53 = colorsCount;
        colorsCount = i53 + 1;
        key_switchTrackBlueSelectorChecked = i53;
        int i54 = colorsCount;
        colorsCount = i54 + 1;
        key_switch2Track = i54;
        int i55 = colorsCount;
        colorsCount = i55 + 1;
        key_switch2TrackChecked = i55;
        int i56 = colorsCount;
        colorsCount = i56 + 1;
        key_checkboxSquareBackground = i56;
        int i57 = colorsCount;
        colorsCount = i57 + 1;
        key_checkboxSquareCheck = i57;
        int i58 = colorsCount;
        colorsCount = i58 + 1;
        key_checkboxSquareUnchecked = i58;
        int i59 = colorsCount;
        colorsCount = i59 + 1;
        key_checkboxSquareDisabled = i59;
        int i60 = colorsCount;
        colorsCount = i60 + 1;
        key_windowBackgroundGray = i60;
        int i61 = colorsCount;
        colorsCount = i61 + 1;
        key_windowBackgroundGrayShadow = i61;
        int i62 = colorsCount;
        colorsCount = i62 + 1;
        key_emptyListPlaceholder = i62;
        int i63 = colorsCount;
        colorsCount = i63 + 1;
        key_divider = i63;
        int i64 = colorsCount;
        colorsCount = i64 + 1;
        key_graySection = i64;
        int i65 = colorsCount;
        colorsCount = i65 + 1;
        key_graySectionText = i65;
        int i66 = colorsCount;
        colorsCount = i66 + 1;
        key_radioBackground = i66;
        int i67 = colorsCount;
        colorsCount = i67 + 1;
        key_radioBackgroundChecked = i67;
        int i68 = colorsCount;
        colorsCount = i68 + 1;
        key_checkbox = i68;
        int i69 = colorsCount;
        colorsCount = i69 + 1;
        key_checkboxDisabled = i69;
        int i70 = colorsCount;
        colorsCount = i70 + 1;
        key_checkboxCheck = i70;
        int i71 = colorsCount;
        colorsCount = i71 + 1;
        key_fastScrollActive = i71;
        int i72 = colorsCount;
        colorsCount = i72 + 1;
        key_fastScrollInactive = i72;
        int i73 = colorsCount;
        colorsCount = i73 + 1;
        key_fastScrollText = i73;
        int i74 = colorsCount;
        colorsCount = i74 + 1;
        key_pollCreateIcons = i74;
        int i75 = colorsCount;
        colorsCount = i75 + 1;
        key_text_RedRegular = i75;
        int i76 = colorsCount;
        colorsCount = i76 + 1;
        key_text_RedBold = i76;
        int i77 = colorsCount;
        colorsCount = i77 + 1;
        key_fill_RedNormal = i77;
        int i78 = colorsCount;
        colorsCount = i78 + 1;
        key_fill_RedDark = i78;
        int i79 = colorsCount;
        colorsCount = i79 + 1;
        key_inappPlayerPerformer = i79;
        int i80 = colorsCount;
        colorsCount = i80 + 1;
        key_inappPlayerTitle = i80;
        int i81 = colorsCount;
        colorsCount = i81 + 1;
        key_inappPlayerBackground = i81;
        int i82 = colorsCount;
        colorsCount = i82 + 1;
        key_inappPlayerPlayPause = i82;
        int i83 = colorsCount;
        colorsCount = i83 + 1;
        key_inappPlayerClose = i83;
        int i84 = colorsCount;
        colorsCount = i84 + 1;
        key_returnToCallBackground = i84;
        int i85 = colorsCount;
        colorsCount = i85 + 1;
        key_returnToCallMutedBackground = i85;
        int i86 = colorsCount;
        colorsCount = i86 + 1;
        key_returnToCallText = i86;
        int i87 = colorsCount;
        colorsCount = i87 + 1;
        key_contextProgressInner1 = i87;
        int i88 = colorsCount;
        colorsCount = i88 + 1;
        key_contextProgressOuter1 = i88;
        int i89 = colorsCount;
        colorsCount = i89 + 1;
        key_contextProgressInner2 = i89;
        int i90 = colorsCount;
        colorsCount = i90 + 1;
        key_contextProgressOuter2 = i90;
        int i91 = colorsCount;
        colorsCount = i91 + 1;
        key_contextProgressInner3 = i91;
        int i92 = colorsCount;
        colorsCount = i92 + 1;
        key_contextProgressOuter3 = i92;
        int i93 = colorsCount;
        colorsCount = i93 + 1;
        key_contextProgressInner4 = i93;
        int i94 = colorsCount;
        colorsCount = i94 + 1;
        key_contextProgressOuter4 = i94;
        int i95 = colorsCount;
        colorsCount = i95 + 1;
        key_avatar_text = i95;
        int i96 = colorsCount;
        colorsCount = i96 + 1;
        key_avatar_backgroundSaved = i96;
        int i97 = colorsCount;
        colorsCount = i97 + 1;
        key_avatar_background2Saved = i97;
        int i98 = colorsCount;
        colorsCount = i98 + 1;
        key_avatar_backgroundArchived = i98;
        int i99 = colorsCount;
        colorsCount = i99 + 1;
        key_avatar_backgroundArchivedHidden = i99;
        int i100 = colorsCount;
        colorsCount = i100 + 1;
        key_avatar_backgroundRed = i100;
        int i101 = colorsCount;
        colorsCount = i101 + 1;
        key_avatar_backgroundOrange = i101;
        int i102 = colorsCount;
        colorsCount = i102 + 1;
        key_avatar_backgroundViolet = i102;
        int i103 = colorsCount;
        colorsCount = i103 + 1;
        key_avatar_backgroundGreen = i103;
        int i104 = colorsCount;
        colorsCount = i104 + 1;
        key_avatar_backgroundCyan = i104;
        int i105 = colorsCount;
        colorsCount = i105 + 1;
        key_avatar_backgroundBlue = i105;
        int i106 = colorsCount;
        colorsCount = i106 + 1;
        key_avatar_backgroundPink = i106;
        int i107 = colorsCount;
        colorsCount = i107 + 1;
        key_avatar_background2Red = i107;
        int i108 = colorsCount;
        colorsCount = i108 + 1;
        key_avatar_background2Orange = i108;
        int i109 = colorsCount;
        colorsCount = i109 + 1;
        key_avatar_background2Violet = i109;
        int i110 = colorsCount;
        colorsCount = i110 + 1;
        key_avatar_background2Green = i110;
        int i111 = colorsCount;
        colorsCount = i111 + 1;
        key_avatar_background2Cyan = i111;
        int i112 = colorsCount;
        colorsCount = i112 + 1;
        key_avatar_background2Blue = i112;
        int i113 = colorsCount;
        colorsCount = i113 + 1;
        key_avatar_background2Pink = i113;
        int i114 = colorsCount;
        colorsCount = i114 + 1;
        key_avatar_backgroundGray = i114;
        int i115 = colorsCount;
        colorsCount = i115 + 1;
        key_avatar_backgroundInProfileBlue = i115;
        int i116 = colorsCount;
        colorsCount = i116 + 1;
        key_avatar_backgroundActionBarBlue = i116;
        int i117 = colorsCount;
        colorsCount = i117 + 1;
        key_avatar_actionBarSelectorBlue = i117;
        int i118 = colorsCount;
        colorsCount = i118 + 1;
        key_avatar_actionBarIconBlue = i118;
        int i119 = colorsCount;
        colorsCount = i119 + 1;
        key_avatar_subtitleInProfileBlue = i119;
        int i120 = colorsCount;
        colorsCount = i120 + 1;
        key_avatar_nameInMessageRed = i120;
        int i121 = colorsCount;
        colorsCount = i121 + 1;
        key_avatar_nameInMessageOrange = i121;
        int i122 = colorsCount;
        colorsCount = i122 + 1;
        key_avatar_nameInMessageViolet = i122;
        int i123 = colorsCount;
        colorsCount = i123 + 1;
        key_avatar_nameInMessageGreen = i123;
        int i124 = colorsCount;
        colorsCount = i124 + 1;
        key_avatar_nameInMessageCyan = i124;
        int i125 = colorsCount;
        colorsCount = i125 + 1;
        key_avatar_nameInMessageBlue = i125;
        int i126 = colorsCount;
        colorsCount = i126 + 1;
        key_avatar_nameInMessagePink = i126;
        keys_avatar_background = new int[]{i100, i101, i102, i103, i104, i105, i106};
        keys_avatar_background2 = new int[]{i107, i108, i109, i110, i111, i112, i113};
        keys_avatar_nameInMessage = new int[]{i120, i121, i122, i123, i124, i125, i126};
        int i127 = colorsCount;
        colorsCount = i127 + 1;
        key_actionBarDefault = i127;
        int i128 = colorsCount;
        colorsCount = i128 + 1;
        key_actionBarDefaultSelector = i128;
        int i129 = colorsCount;
        colorsCount = i129 + 1;
        key_actionBarWhiteSelector = i129;
        int i130 = colorsCount;
        colorsCount = i130 + 1;
        key_actionBarDefaultIcon = i130;
        int i131 = colorsCount;
        colorsCount = i131 + 1;
        key_actionBarActionModeDefault = i131;
        int i132 = colorsCount;
        colorsCount = i132 + 1;
        key_actionBarActionModeDefaultTop = i132;
        int i133 = colorsCount;
        colorsCount = i133 + 1;
        key_actionBarActionModeDefaultIcon = i133;
        int i134 = colorsCount;
        colorsCount = i134 + 1;
        key_actionBarActionModeDefaultSelector = i134;
        int i135 = colorsCount;
        colorsCount = i135 + 1;
        key_actionBarDefaultTitle = i135;
        int i136 = colorsCount;
        colorsCount = i136 + 1;
        key_actionBarDefaultSubtitle = i136;
        int i137 = colorsCount;
        colorsCount = i137 + 1;
        key_actionBarDefaultSearch = i137;
        int i138 = colorsCount;
        colorsCount = i138 + 1;
        key_actionBarDefaultSearchPlaceholder = i138;
        int i139 = colorsCount;
        colorsCount = i139 + 1;
        key_actionBarDefaultSubmenuItem = i139;
        int i140 = colorsCount;
        colorsCount = i140 + 1;
        key_actionBarDefaultSubmenuItemIcon = i140;
        int i141 = colorsCount;
        colorsCount = i141 + 1;
        key_actionBarDefaultSubmenuBackground = i141;
        int i142 = colorsCount;
        colorsCount = i142 + 1;
        key_actionBarDefaultSubmenuSeparator = i142;
        int i143 = colorsCount;
        colorsCount = i143 + 1;
        key_actionBarTabActiveText = i143;
        int i144 = colorsCount;
        colorsCount = i144 + 1;
        key_actionBarTabUnactiveText = i144;
        int i145 = colorsCount;
        colorsCount = i145 + 1;
        key_actionBarTabLine = i145;
        int i146 = colorsCount;
        colorsCount = i146 + 1;
        key_actionBarTabSelector = i146;
        int i147 = colorsCount;
        colorsCount = i147 + 1;
        key_actionBarDefaultArchived = i147;
        int i148 = colorsCount;
        colorsCount = i148 + 1;
        key_actionBarDefaultArchivedSelector = i148;
        int i149 = colorsCount;
        colorsCount = i149 + 1;
        key_actionBarDefaultArchivedIcon = i149;
        int i150 = colorsCount;
        colorsCount = i150 + 1;
        key_actionBarDefaultArchivedTitle = i150;
        int i151 = colorsCount;
        colorsCount = i151 + 1;
        key_actionBarDefaultArchivedSearch = i151;
        int i152 = colorsCount;
        colorsCount = i152 + 1;
        key_actionBarDefaultArchivedSearchPlaceholder = i152;
        int i153 = colorsCount;
        colorsCount = i153 + 1;
        key_actionBarBrowser = i153;
        int i154 = colorsCount;
        colorsCount = i154 + 1;
        key_chats_onlineCircle = i154;
        int i155 = colorsCount;
        colorsCount = i155 + 1;
        key_chats_unreadCounter = i155;
        int i156 = colorsCount;
        colorsCount = i156 + 1;
        key_chats_unreadCounterMuted = i156;
        int i157 = colorsCount;
        colorsCount = i157 + 1;
        key_chats_unreadCounterText = i157;
        int i158 = colorsCount;
        colorsCount = i158 + 1;
        key_chats_name = i158;
        int i159 = colorsCount;
        colorsCount = i159 + 1;
        key_chats_nameArchived = i159;
        int i160 = colorsCount;
        colorsCount = i160 + 1;
        key_chats_secretName = i160;
        int i161 = colorsCount;
        colorsCount = i161 + 1;
        key_chats_secretIcon = i161;
        int i162 = colorsCount;
        colorsCount = i162 + 1;
        key_chats_pinnedIcon = i162;
        int i163 = colorsCount;
        colorsCount = i163 + 1;
        key_chats_archiveBackground = i163;
        int i164 = colorsCount;
        colorsCount = i164 + 1;
        key_chats_archivePinBackground = i164;
        int i165 = colorsCount;
        colorsCount = i165 + 1;
        key_chats_archiveIcon = i165;
        int i166 = colorsCount;
        colorsCount = i166 + 1;
        key_chats_archiveText = i166;
        int i167 = colorsCount;
        colorsCount = i167 + 1;
        key_chats_message = i167;
        int i168 = colorsCount;
        colorsCount = i168 + 1;
        key_chats_messageArchived = i168;
        int i169 = colorsCount;
        colorsCount = i169 + 1;
        key_chats_message_threeLines = i169;
        int i170 = colorsCount;
        colorsCount = i170 + 1;
        key_chats_draft = i170;
        int i171 = colorsCount;
        colorsCount = i171 + 1;
        key_chats_nameMessage = i171;
        int i172 = colorsCount;
        colorsCount = i172 + 1;
        key_chats_nameMessageArchived = i172;
        int i173 = colorsCount;
        colorsCount = i173 + 1;
        key_chats_nameMessage_threeLines = i173;
        int i174 = colorsCount;
        colorsCount = i174 + 1;
        key_chats_nameMessageArchived_threeLines = i174;
        int i175 = colorsCount;
        colorsCount = i175 + 1;
        key_chats_attachMessage = i175;
        int i176 = colorsCount;
        colorsCount = i176 + 1;
        key_chats_actionMessage = i176;
        int i177 = colorsCount;
        colorsCount = i177 + 1;
        key_chats_date = i177;
        int i178 = colorsCount;
        colorsCount = i178 + 1;
        key_chats_date_bold = i178;
        int i179 = colorsCount;
        colorsCount = i179 + 1;
        key_chats_pinnedOverlay = i179;
        int i180 = colorsCount;
        colorsCount = i180 + 1;
        key_chats_tabletSelectedOverlay = i180;
        int i181 = colorsCount;
        colorsCount = i181 + 1;
        key_chats_sentCheck = i181;
        int i182 = colorsCount;
        colorsCount = i182 + 1;
        key_chats_sentReadCheck = i182;
        int i183 = colorsCount;
        colorsCount = i183 + 1;
        key_chats_sentClock = i183;
        int i184 = colorsCount;
        colorsCount = i184 + 1;
        key_chats_sentError = i184;
        int i185 = colorsCount;
        colorsCount = i185 + 1;
        key_chats_sentErrorIcon = i185;
        int i186 = colorsCount;
        colorsCount = i186 + 1;
        key_chats_verifiedBackground = i186;
        int i187 = colorsCount;
        colorsCount = i187 + 1;
        key_chats_verifiedCheck = i187;
        int i188 = colorsCount;
        colorsCount = i188 + 1;
        key_chats_muteIcon = i188;
        int i189 = colorsCount;
        colorsCount = i189 + 1;
        key_chats_mentionIcon = i189;
        int i190 = colorsCount;
        colorsCount = i190 + 1;
        key_chats_menuTopShadow = i190;
        int i191 = colorsCount;
        colorsCount = i191 + 1;
        key_chats_menuTopShadowCats = i191;
        int i192 = colorsCount;
        colorsCount = i192 + 1;
        key_chats_menuBackground = i192;
        int i193 = colorsCount;
        colorsCount = i193 + 1;
        key_chats_menuItemText = i193;
        int i194 = colorsCount;
        colorsCount = i194 + 1;
        key_chats_menuItemCheck = i194;
        int i195 = colorsCount;
        colorsCount = i195 + 1;
        key_chats_menuItemIcon = i195;
        int i196 = colorsCount;
        colorsCount = i196 + 1;
        key_chats_menuName = i196;
        int i197 = colorsCount;
        colorsCount = i197 + 1;
        key_chats_menuPhone = i197;
        int i198 = colorsCount;
        colorsCount = i198 + 1;
        key_chats_menuPhoneCats = i198;
        int i199 = colorsCount;
        colorsCount = i199 + 1;
        key_chats_menuTopBackgroundCats = i199;
        int i200 = colorsCount;
        colorsCount = i200 + 1;
        key_chats_menuTopBackground = i200;
        int i201 = colorsCount;
        colorsCount = i201 + 1;
        key_chats_actionIcon = i201;
        int i202 = colorsCount;
        colorsCount = i202 + 1;
        key_chats_actionBackground = i202;
        int i203 = colorsCount;
        colorsCount = i203 + 1;
        key_chats_actionPressedBackground = i203;
        int i204 = colorsCount;
        colorsCount = i204 + 1;
        key_chats_archivePullDownBackground = i204;
        int i205 = colorsCount;
        colorsCount = i205 + 1;
        key_chats_archivePullDownBackgroundActive = i205;
        int i206 = colorsCount;
        colorsCount = i206 + 1;
        key_chats_tabUnreadActiveBackground = i206;
        int i207 = colorsCount;
        colorsCount = i207 + 1;
        key_chats_tabUnreadUnactiveBackground = i207;
        int i208 = colorsCount;
        colorsCount = i208 + 1;
        key_chat_attachCheckBoxCheck = i208;
        int i209 = colorsCount;
        colorsCount = i209 + 1;
        key_chat_attachCheckBoxBackground = i209;
        int i210 = colorsCount;
        colorsCount = i210 + 1;
        key_chat_attachPhotoBackground = i210;
        int i211 = colorsCount;
        colorsCount = i211 + 1;
        key_chat_attachActiveTab = i211;
        int i212 = colorsCount;
        colorsCount = i212 + 1;
        key_chat_attachUnactiveTab = i212;
        int i213 = colorsCount;
        colorsCount = i213 + 1;
        key_chat_attachPermissionImage = i213;
        int i214 = colorsCount;
        colorsCount = i214 + 1;
        key_chat_attachPermissionMark = i214;
        int i215 = colorsCount;
        colorsCount = i215 + 1;
        key_chat_attachPermissionText = i215;
        int i216 = colorsCount;
        colorsCount = i216 + 1;
        key_chat_attachEmptyImage = i216;
        int i217 = colorsCount;
        colorsCount = i217 + 1;
        key_chat_inPollCorrectAnswer = i217;
        int i218 = colorsCount;
        colorsCount = i218 + 1;
        key_chat_outPollCorrectAnswer = i218;
        int i219 = colorsCount;
        colorsCount = i219 + 1;
        key_chat_inPollWrongAnswer = i219;
        int i220 = colorsCount;
        colorsCount = i220 + 1;
        key_chat_outPollWrongAnswer = i220;
        int i221 = colorsCount;
        colorsCount = i221 + 1;
        key_chat_attachIcon = i221;
        int i222 = colorsCount;
        colorsCount = i222 + 1;
        key_chat_attachGalleryBackground = i222;
        int i223 = colorsCount;
        colorsCount = i223 + 1;
        key_chat_attachAudioBackground = i223;
        int i224 = colorsCount;
        colorsCount = i224 + 1;
        key_chat_attachContactBackground = i224;
        int i225 = colorsCount;
        colorsCount = i225 + 1;
        key_chat_attachContactText = i225;
        int i226 = colorsCount;
        colorsCount = i226 + 1;
        key_chat_attachLocationBackground = i226;
        int i227 = colorsCount;
        colorsCount = i227 + 1;
        key_chat_attachPollBackground = i227;
        int i228 = colorsCount;
        colorsCount = i228 + 1;
        key_chat_status = i228;
        int i229 = colorsCount;
        colorsCount = i229 + 1;
        key_chat_inGreenCall = i229;
        int i230 = colorsCount;
        colorsCount = i230 + 1;
        key_chat_inBubble = i230;
        int i231 = colorsCount;
        colorsCount = i231 + 1;
        key_chat_inBubbleSelectedOverlay = i231;
        int i232 = colorsCount;
        colorsCount = i232 + 1;
        key_chat_inBubbleShadow = i232;
        int i233 = colorsCount;
        colorsCount = i233 + 1;
        key_actionBarActionModeReaction = i233;
        int i234 = colorsCount;
        colorsCount = i234 + 1;
        key_actionBarActionModeReactionText = i234;
        int i235 = colorsCount;
        colorsCount = i235 + 1;
        key_actionBarActionModeReactionDot = i235;
        int i236 = colorsCount;
        colorsCount = i236 + 1;
        key_buttonNeutral = i236;
        int i237 = colorsCount;
        colorsCount = i237 + 1;
        key_buttonNeutralText = i237;
        myMessagesBubblesStartIndex = colorsCount;
        int i238 = colorsCount;
        colorsCount = i238 + 1;
        key_chat_outBubble = i238;
        int i239 = colorsCount;
        colorsCount = i239 + 1;
        key_chat_outBubbleSelected = i239;
        int i240 = colorsCount;
        colorsCount = i240 + 1;
        key_chat_outBubbleShadow = i240;
        int i241 = colorsCount;
        colorsCount = i241 + 1;
        key_chat_outBubbleGradient1 = i241;
        int i242 = colorsCount;
        colorsCount = i242 + 1;
        key_chat_outBubbleGradient2 = i242;
        int i243 = colorsCount;
        colorsCount = i243 + 1;
        key_chat_outBubbleGradient3 = i243;
        myMessagesBubblesEndIndex = colorsCount;
        myMessagesStartIndex = colorsCount;
        int i244 = colorsCount;
        colorsCount = i244 + 1;
        key_chat_outGreenCall = i244;
        int i245 = colorsCount;
        colorsCount = i245 + 1;
        key_chat_outSentCheck = i245;
        int i246 = colorsCount;
        colorsCount = i246 + 1;
        key_chat_outSentCheckSelected = i246;
        int i247 = colorsCount;
        colorsCount = i247 + 1;
        key_chat_outSentCheckRead = i247;
        int i248 = colorsCount;
        colorsCount = i248 + 1;
        key_chat_outSentCheckReadSelected = i248;
        int i249 = colorsCount;
        colorsCount = i249 + 1;
        key_chat_outSentClock = i249;
        int i250 = colorsCount;
        colorsCount = i250 + 1;
        key_chat_outSentClockSelected = i250;
        int i251 = colorsCount;
        colorsCount = i251 + 1;
        key_chat_outMediaIcon = i251;
        int i252 = colorsCount;
        colorsCount = i252 + 1;
        key_chat_outMediaIconSelected = i252;
        int i253 = colorsCount;
        colorsCount = i253 + 1;
        key_chat_outViews = i253;
        int i254 = colorsCount;
        colorsCount = i254 + 1;
        key_chat_outViewsSelected = i254;
        int i255 = colorsCount;
        colorsCount = i255 + 1;
        key_chat_outMenu = i255;
        int i256 = colorsCount;
        colorsCount = i256 + 1;
        key_chat_outMenuSelected = i256;
        int i257 = colorsCount;
        colorsCount = i257 + 1;
        key_chat_outInstant = i257;
        int i258 = colorsCount;
        colorsCount = i258 + 1;
        key_chat_outInstantSelected = i258;
        int i259 = colorsCount;
        colorsCount = i259 + 1;
        key_chat_outPreviewInstantText = i259;
        int i260 = colorsCount;
        colorsCount = i260 + 1;
        key_chat_outForwardedNameText = i260;
        int i261 = colorsCount;
        colorsCount = i261 + 1;
        key_chat_outViaBotNameText = i261;
        int i262 = colorsCount;
        colorsCount = i262 + 1;
        key_chat_outReplyLine = i262;
        int i263 = colorsCount;
        colorsCount = i263 + 1;
        key_chat_outReplyLine2 = i263;
        int i264 = colorsCount;
        colorsCount = i264 + 1;
        key_chat_outReplyNameText = i264;
        int i265 = colorsCount;
        colorsCount = i265 + 1;
        key_chat_outReplyMessageText = i265;
        int i266 = colorsCount;
        colorsCount = i266 + 1;
        key_chat_outReplyMediaMessageText = i266;
        int i267 = colorsCount;
        colorsCount = i267 + 1;
        key_chat_outReplyMediaMessageSelectedText = i267;
        int i268 = colorsCount;
        colorsCount = i268 + 1;
        key_chat_outPreviewLine = i268;
        int i269 = colorsCount;
        colorsCount = i269 + 1;
        key_chat_outSiteNameText = i269;
        int i270 = colorsCount;
        colorsCount = i270 + 1;
        key_chat_outContactNameText = i270;
        int i271 = colorsCount;
        colorsCount = i271 + 1;
        key_chat_outContactPhoneText = i271;
        int i272 = colorsCount;
        colorsCount = i272 + 1;
        key_chat_outContactPhoneSelectedText = i272;
        int i273 = colorsCount;
        colorsCount = i273 + 1;
        key_chat_outAudioPerformerText = i273;
        int i274 = colorsCount;
        colorsCount = i274 + 1;
        key_chat_outAudioPerformerSelectedText = i274;
        int i275 = colorsCount;
        colorsCount = i275 + 1;
        key_chat_outTimeSelectedText = i275;
        int i276 = colorsCount;
        colorsCount = i276 + 1;
        key_chat_outAdminText = i276;
        int i277 = colorsCount;
        colorsCount = i277 + 1;
        key_chat_outAdminSelectedText = i277;
        int i278 = colorsCount;
        colorsCount = i278 + 1;
        key_chat_outAudioProgress = i278;
        int i279 = colorsCount;
        colorsCount = i279 + 1;
        key_chat_outAudioSelectedProgress = i279;
        int i280 = colorsCount;
        colorsCount = i280 + 1;
        key_chat_outTimeText = i280;
        int i281 = colorsCount;
        colorsCount = i281 + 1;
        key_chat_outAudioTitleText = i281;
        int i282 = colorsCount;
        colorsCount = i282 + 1;
        key_chat_outAudioDurationText = i282;
        int i283 = colorsCount;
        colorsCount = i283 + 1;
        key_chat_outAudioDurationSelectedText = i283;
        int i284 = colorsCount;
        colorsCount = i284 + 1;
        key_chat_outAudioSeekbar = i284;
        int i285 = colorsCount;
        colorsCount = i285 + 1;
        key_chat_outAudioCacheSeekbar = i285;
        int i286 = colorsCount;
        colorsCount = i286 + 1;
        key_chat_outAudioSeekbarSelected = i286;
        int i287 = colorsCount;
        colorsCount = i287 + 1;
        key_chat_outAudioSeekbarFill = i287;
        int i288 = colorsCount;
        colorsCount = i288 + 1;
        key_chat_outVoiceSeekbar = i288;
        int i289 = colorsCount;
        colorsCount = i289 + 1;
        key_chat_outVoiceSeekbarSelected = i289;
        int i290 = colorsCount;
        colorsCount = i290 + 1;
        key_chat_outVoiceSeekbarFill = i290;
        int i291 = colorsCount;
        colorsCount = i291 + 1;
        key_chat_outFileProgress = i291;
        int i292 = colorsCount;
        colorsCount = i292 + 1;
        key_chat_outFileProgressSelected = i292;
        int i293 = colorsCount;
        colorsCount = i293 + 1;
        key_chat_outFileNameText = i293;
        int i294 = colorsCount;
        colorsCount = i294 + 1;
        key_chat_outFileInfoText = i294;
        int i295 = colorsCount;
        colorsCount = i295 + 1;
        key_chat_outFileInfoSelectedText = i295;
        int i296 = colorsCount;
        colorsCount = i296 + 1;
        key_chat_outFileBackground = i296;
        int i297 = colorsCount;
        colorsCount = i297 + 1;
        key_chat_outFileBackgroundSelected = i297;
        int i298 = colorsCount;
        colorsCount = i298 + 1;
        key_chat_outVenueInfoText = i298;
        int i299 = colorsCount;
        colorsCount = i299 + 1;
        key_chat_outVenueInfoSelectedText = i299;
        int i300 = colorsCount;
        colorsCount = i300 + 1;
        key_chat_outLinkSelectBackground = i300;
        int i301 = colorsCount;
        colorsCount = i301 + 1;
        key_chat_outLoader = i301;
        int i302 = colorsCount;
        colorsCount = i302 + 1;
        key_chat_outLoaderSelected = i302;
        int i303 = colorsCount;
        colorsCount = i303 + 1;
        key_chat_outLocationIcon = i303;
        int i304 = colorsCount;
        colorsCount = i304 + 1;
        key_chat_outContactBackground = i304;
        int i305 = colorsCount;
        colorsCount = i305 + 1;
        key_chat_outContactIcon = i305;
        int i306 = colorsCount;
        colorsCount = i306 + 1;
        key_chat_outReactionButtonBackground = i306;
        myMessagesEndIndex = colorsCount;
        myMessages2StartIndex = colorsCount;
        int i307 = colorsCount;
        colorsCount = i307 + 1;
        key_chat_outTextSelectionHighlight = i307;
        int i308 = colorsCount;
        colorsCount = i308 + 1;
        key_chat_outTextSelectionCursor = i308;
        int i309 = colorsCount;
        colorsCount = i309 + 1;
        key_chat_outBubbleLocationPlaceholder = i309;
        int i310 = colorsCount;
        colorsCount = i310 + 1;
        key_chat_outBubbleSelectedOverlay = i310;
        int i311 = colorsCount;
        colorsCount = i311 + 1;
        key_chat_outPsaNameText = i311;
        int i312 = colorsCount;
        colorsCount = i312 + 1;
        key_chat_outBubbleGradientAnimated = i312;
        int i313 = colorsCount;
        colorsCount = i313 + 1;
        key_chat_outBubbleGradientSelectedOverlay = i313;
        myMessages2EndIndex = colorsCount;
        int i314 = colorsCount;
        colorsCount = i314 + 1;
        key_chat_inBubbleSelected = i314;
        int i315 = colorsCount;
        colorsCount = i315 + 1;
        key_chat_messageTextIn = i315;
        int i316 = colorsCount;
        colorsCount = i316 + 1;
        key_chat_messageTextOut = i316;
        int i317 = colorsCount;
        colorsCount = i317 + 1;
        key_chat_messageLinkIn = i317;
        int i318 = colorsCount;
        colorsCount = i318 + 1;
        key_chat_messageLinkOut = i318;
        int i319 = colorsCount;
        colorsCount = i319 + 1;
        key_chat_serviceText = i319;
        int i320 = colorsCount;
        colorsCount = i320 + 1;
        key_chat_serviceLink = i320;
        int i321 = colorsCount;
        colorsCount = i321 + 1;
        key_chat_serviceIcon = i321;
        int i322 = colorsCount;
        colorsCount = i322 + 1;
        key_chat_serviceBackground = i322;
        int i323 = colorsCount;
        colorsCount = i323 + 1;
        key_chat_serviceBackgroundSelected = i323;
        int i324 = colorsCount;
        colorsCount = i324 + 1;
        key_chat_serviceBackgroundSelector = i324;
        int i325 = colorsCount;
        colorsCount = i325 + 1;
        key_chat_muteIcon = i325;
        int i326 = colorsCount;
        colorsCount = i326 + 1;
        key_chat_lockIcon = i326;
        int i327 = colorsCount;
        colorsCount = i327 + 1;
        key_chat_inSentClock = i327;
        int i328 = colorsCount;
        colorsCount = i328 + 1;
        key_chat_inSentClockSelected = i328;
        int i329 = colorsCount;
        colorsCount = i329 + 1;
        key_chat_mediaSentCheck = i329;
        int i330 = colorsCount;
        colorsCount = i330 + 1;
        key_chat_mediaSentClock = i330;
        int i331 = colorsCount;
        colorsCount = i331 + 1;
        key_chat_inMediaIcon = i331;
        int i332 = colorsCount;
        colorsCount = i332 + 1;
        key_chat_inMediaIconSelected = i332;
        int i333 = colorsCount;
        colorsCount = i333 + 1;
        key_chat_mediaTimeBackground = i333;
        int i334 = colorsCount;
        colorsCount = i334 + 1;
        key_chat_inViews = i334;
        int i335 = colorsCount;
        colorsCount = i335 + 1;
        key_chat_inViewsSelected = i335;
        int i336 = colorsCount;
        colorsCount = i336 + 1;
        key_chat_mediaViews = i336;
        int i337 = colorsCount;
        colorsCount = i337 + 1;
        key_chat_inMenu = i337;
        int i338 = colorsCount;
        colorsCount = i338 + 1;
        key_chat_inMenuSelected = i338;
        int i339 = colorsCount;
        colorsCount = i339 + 1;
        key_chat_mediaMenu = i339;
        int i340 = colorsCount;
        colorsCount = i340 + 1;
        key_chat_inInstant = i340;
        int i341 = colorsCount;
        colorsCount = i341 + 1;
        key_chat_inInstantSelected = i341;
        int i342 = colorsCount;
        colorsCount = i342 + 1;
        key_chat_sentError = i342;
        int i343 = colorsCount;
        colorsCount = i343 + 1;
        key_chat_sentErrorIcon = i343;
        int i344 = colorsCount;
        colorsCount = i344 + 1;
        key_chat_selectedBackground = i344;
        int i345 = colorsCount;
        colorsCount = i345 + 1;
        key_chat_previewDurationText = i345;
        int i346 = colorsCount;
        colorsCount = i346 + 1;
        key_chat_previewGameText = i346;
        int i347 = colorsCount;
        colorsCount = i347 + 1;
        key_chat_inPreviewInstantText = i347;
        int i348 = colorsCount;
        colorsCount = i348 + 1;
        key_chat_secretTimeText = i348;
        int i349 = colorsCount;
        colorsCount = i349 + 1;
        key_chat_stickerNameText = i349;
        int i350 = colorsCount;
        colorsCount = i350 + 1;
        key_chat_botButtonText = i350;
        int i351 = colorsCount;
        colorsCount = i351 + 1;
        key_chat_inForwardedNameText = i351;
        int i352 = colorsCount;
        colorsCount = i352 + 1;
        key_chat_inPsaNameText = i352;
        int i353 = colorsCount;
        colorsCount = i353 + 1;
        key_chat_inViaBotNameText = i353;
        int i354 = colorsCount;
        colorsCount = i354 + 1;
        key_chat_stickerViaBotNameText = i354;
        int i355 = colorsCount;
        colorsCount = i355 + 1;
        key_chat_inQuote = i355;
        int i356 = colorsCount;
        colorsCount = i356 + 1;
        key_chat_outQuote = i356;
        int i357 = colorsCount;
        colorsCount = i357 + 1;
        key_chat_inReplyLine = i357;
        int i358 = colorsCount;
        colorsCount = i358 + 1;
        key_chat_stickerReplyLine = i358;
        int i359 = colorsCount;
        colorsCount = i359 + 1;
        key_chat_inReplyNameText = i359;
        int i360 = colorsCount;
        colorsCount = i360 + 1;
        key_chat_stickerReplyNameText = i360;
        int i361 = colorsCount;
        colorsCount = i361 + 1;
        key_chat_inReplyMessageText = i361;
        int i362 = colorsCount;
        colorsCount = i362 + 1;
        key_chat_inReplyMediaMessageText = i362;
        int i363 = colorsCount;
        colorsCount = i363 + 1;
        key_chat_inReplyMediaMessageSelectedText = i363;
        int i364 = colorsCount;
        colorsCount = i364 + 1;
        key_chat_stickerReplyMessageText = i364;
        int i365 = colorsCount;
        colorsCount = i365 + 1;
        key_chat_inPreviewLine = i365;
        int i366 = colorsCount;
        colorsCount = i366 + 1;
        key_chat_inSiteNameText = i366;
        int i367 = colorsCount;
        colorsCount = i367 + 1;
        key_chat_inContactNameText = i367;
        int i368 = colorsCount;
        colorsCount = i368 + 1;
        key_chat_inContactPhoneText = i368;
        int i369 = colorsCount;
        colorsCount = i369 + 1;
        key_chat_inContactPhoneSelectedText = i369;
        int i370 = colorsCount;
        colorsCount = i370 + 1;
        key_chat_mediaProgress = i370;
        int i371 = colorsCount;
        colorsCount = i371 + 1;
        key_chat_inAudioProgress = i371;
        int i372 = colorsCount;
        colorsCount = i372 + 1;
        key_chat_inAudioSelectedProgress = i372;
        int i373 = colorsCount;
        colorsCount = i373 + 1;
        key_chat_mediaTimeText = i373;
        int i374 = colorsCount;
        colorsCount = i374 + 1;
        key_chat_inAdminText = i374;
        int i375 = colorsCount;
        colorsCount = i375 + 1;
        key_chat_inAdminSelectedText = i375;
        int i376 = colorsCount;
        colorsCount = i376 + 1;
        key_chat_inTimeText = i376;
        int i377 = colorsCount;
        colorsCount = i377 + 1;
        key_chat_inTimeSelectedText = i377;
        int i378 = colorsCount;
        colorsCount = i378 + 1;
        key_chat_inAudioPerformerText = i378;
        int i379 = colorsCount;
        colorsCount = i379 + 1;
        key_chat_inAudioPerformerSelectedText = i379;
        int i380 = colorsCount;
        colorsCount = i380 + 1;
        key_chat_inAudioTitleText = i380;
        int i381 = colorsCount;
        colorsCount = i381 + 1;
        key_chat_inAudioDurationText = i381;
        int i382 = colorsCount;
        colorsCount = i382 + 1;
        key_chat_inAudioDurationSelectedText = i382;
        int i383 = colorsCount;
        colorsCount = i383 + 1;
        key_chat_inAudioSeekbar = i383;
        int i384 = colorsCount;
        colorsCount = i384 + 1;
        key_chat_inAudioCacheSeekbar = i384;
        int i385 = colorsCount;
        colorsCount = i385 + 1;
        key_chat_inAudioSeekbarSelected = i385;
        int i386 = colorsCount;
        colorsCount = i386 + 1;
        key_chat_inAudioSeekbarFill = i386;
        int i387 = colorsCount;
        colorsCount = i387 + 1;
        key_chat_inVoiceSeekbar = i387;
        int i388 = colorsCount;
        colorsCount = i388 + 1;
        key_chat_inVoiceSeekbarSelected = i388;
        int i389 = colorsCount;
        colorsCount = i389 + 1;
        key_chat_inVoiceSeekbarFill = i389;
        int i390 = colorsCount;
        colorsCount = i390 + 1;
        key_chat_inFileProgress = i390;
        int i391 = colorsCount;
        colorsCount = i391 + 1;
        key_chat_inFileProgressSelected = i391;
        int i392 = colorsCount;
        colorsCount = i392 + 1;
        key_chat_inFileNameText = i392;
        int i393 = colorsCount;
        colorsCount = i393 + 1;
        key_chat_inFileInfoText = i393;
        int i394 = colorsCount;
        colorsCount = i394 + 1;
        key_chat_inFileInfoSelectedText = i394;
        int i395 = colorsCount;
        colorsCount = i395 + 1;
        key_chat_inFileBackground = i395;
        int i396 = colorsCount;
        colorsCount = i396 + 1;
        key_chat_inFileBackgroundSelected = i396;
        int i397 = colorsCount;
        colorsCount = i397 + 1;
        key_chat_inVenueInfoText = i397;
        int i398 = colorsCount;
        colorsCount = i398 + 1;
        key_chat_inVenueInfoSelectedText = i398;
        int i399 = colorsCount;
        colorsCount = i399 + 1;
        key_chat_mediaInfoText = i399;
        int i400 = colorsCount;
        colorsCount = i400 + 1;
        key_chat_linkSelectBackground = i400;
        int i401 = colorsCount;
        colorsCount = i401 + 1;
        key_chat_textSelectBackground = i401;
        int i402 = colorsCount;
        colorsCount = i402 + 1;
        key_chat_wallpaper = i402;
        int i403 = colorsCount;
        colorsCount = i403 + 1;
        key_chat_wallpaper_gradient_to1 = i403;
        int i404 = colorsCount;
        colorsCount = i404 + 1;
        key_chat_wallpaper_gradient_to2 = i404;
        int i405 = colorsCount;
        colorsCount = i405 + 1;
        key_chat_wallpaper_gradient_to3 = i405;
        int i406 = colorsCount;
        colorsCount = i406 + 1;
        key_chat_wallpaper_gradient_rotation = i406;
        int i407 = colorsCount;
        colorsCount = i407 + 1;
        key_chat_messagePanelBackground = i407;
        int i408 = colorsCount;
        colorsCount = i408 + 1;
        key_chat_messagePanelShadow = i408;
        int i409 = colorsCount;
        colorsCount = i409 + 1;
        key_chat_messagePanelText = i409;
        int i410 = colorsCount;
        colorsCount = i410 + 1;
        key_chat_messagePanelHint = i410;
        int i411 = colorsCount;
        colorsCount = i411 + 1;
        key_chat_messagePanelCursor = i411;
        int i412 = colorsCount;
        colorsCount = i412 + 1;
        key_chat_messagePanelIcons = i412;
        int i413 = colorsCount;
        colorsCount = i413 + 1;
        key_chat_messagePanelSend = i413;
        int i414 = colorsCount;
        colorsCount = i414 + 1;
        key_chat_messagePanelVoiceLock = i414;
        int i415 = colorsCount;
        colorsCount = i415 + 1;
        key_chat_messagePanelVoiceLockBackground = i415;
        int i416 = colorsCount;
        colorsCount = i416 + 1;
        key_chat_messagePanelVoiceLockShadow = i416;
        int i417 = colorsCount;
        colorsCount = i417 + 1;
        key_chat_topPanelBackground = i417;
        int i418 = colorsCount;
        colorsCount = i418 + 1;
        key_chat_topPanelClose = i418;
        int i419 = colorsCount;
        colorsCount = i419 + 1;
        key_chat_topPanelLine = i419;
        int i420 = colorsCount;
        colorsCount = i420 + 1;
        key_chat_topPanelTitle = i420;
        int i421 = colorsCount;
        colorsCount = i421 + 1;
        key_chat_topPanelMessage = i421;
        int i422 = colorsCount;
        colorsCount = i422 + 1;
        key_chat_addContact = i422;
        int i423 = colorsCount;
        colorsCount = i423 + 1;
        key_chat_inLoader = i423;
        int i424 = colorsCount;
        colorsCount = i424 + 1;
        key_chat_inLoaderSelected = i424;
        int i425 = colorsCount;
        colorsCount = i425 + 1;
        key_chat_inLoaderPhoto = i425;
        int i426 = colorsCount;
        colorsCount = i426 + 1;
        key_chat_mediaLoaderPhoto = i426;
        int i427 = colorsCount;
        colorsCount = i427 + 1;
        key_chat_mediaLoaderPhotoSelected = i427;
        int i428 = colorsCount;
        colorsCount = i428 + 1;
        key_chat_mediaLoaderPhotoIcon = i428;
        int i429 = colorsCount;
        colorsCount = i429 + 1;
        key_chat_mediaLoaderPhotoIconSelected = i429;
        int i430 = colorsCount;
        colorsCount = i430 + 1;
        key_chat_inLocationBackground = i430;
        int i431 = colorsCount;
        colorsCount = i431 + 1;
        key_chat_inLocationIcon = i431;
        int i432 = colorsCount;
        colorsCount = i432 + 1;
        key_chat_inContactBackground = i432;
        int i433 = colorsCount;
        colorsCount = i433 + 1;
        key_chat_inContactIcon = i433;
        int i434 = colorsCount;
        colorsCount = i434 + 1;
        key_chat_replyPanelIcons = i434;
        int i435 = colorsCount;
        colorsCount = i435 + 1;
        key_chat_replyPanelClose = i435;
        int i436 = colorsCount;
        colorsCount = i436 + 1;
        key_chat_replyPanelName = i436;
        int i437 = colorsCount;
        colorsCount = i437 + 1;
        key_chat_replyPanelLine = i437;
        int i438 = colorsCount;
        colorsCount = i438 + 1;
        key_chat_searchPanelIcons = i438;
        int i439 = colorsCount;
        colorsCount = i439 + 1;
        key_chat_searchPanelText = i439;
        int i440 = colorsCount;
        colorsCount = i440 + 1;
        key_chat_secretChatStatusText = i440;
        int i441 = colorsCount;
        colorsCount = i441 + 1;
        key_chat_fieldOverlayText = i441;
        int i442 = colorsCount;
        colorsCount = i442 + 1;
        key_chat_stickersHintPanel = i442;
        int i443 = colorsCount;
        colorsCount = i443 + 1;
        key_chat_botSwitchToInlineText = i443;
        int i444 = colorsCount;
        colorsCount = i444 + 1;
        key_chat_unreadMessagesStartArrowIcon = i444;
        int i445 = colorsCount;
        colorsCount = i445 + 1;
        key_chat_unreadMessagesStartText = i445;
        int i446 = colorsCount;
        colorsCount = i446 + 1;
        key_chat_unreadMessagesStartBackground = i446;
        int i447 = colorsCount;
        colorsCount = i447 + 1;
        key_chat_inlineResultIcon = i447;
        int i448 = colorsCount;
        colorsCount = i448 + 1;
        key_chat_emojiPanelBackground = i448;
        int i449 = colorsCount;
        colorsCount = i449 + 1;
        key_chat_emojiSearchBackground = i449;
        int i450 = colorsCount;
        colorsCount = i450 + 1;
        key_chat_emojiSearchIcon = i450;
        int i451 = colorsCount;
        colorsCount = i451 + 1;
        key_chat_emojiPanelShadowLine = i451;
        int i452 = colorsCount;
        colorsCount = i452 + 1;
        key_chat_emojiPanelEmptyText = i452;
        int i453 = colorsCount;
        colorsCount = i453 + 1;
        key_chat_emojiPanelIcon = i453;
        int i454 = colorsCount;
        colorsCount = i454 + 1;
        key_chat_emojiBottomPanelIcon = i454;
        int i455 = colorsCount;
        colorsCount = i455 + 1;
        key_chat_emojiPanelIconSelected = i455;
        int i456 = colorsCount;
        colorsCount = i456 + 1;
        key_chat_emojiPanelStickerPackSelector = i456;
        int i457 = colorsCount;
        colorsCount = i457 + 1;
        key_chat_emojiPanelStickerPackSelectorLine = i457;
        int i458 = colorsCount;
        colorsCount = i458 + 1;
        key_chat_emojiPanelBackspace = i458;
        int i459 = colorsCount;
        colorsCount = i459 + 1;
        key_chat_emojiPanelTrendingTitle = i459;
        int i460 = colorsCount;
        colorsCount = i460 + 1;
        key_chat_emojiPanelStickerSetName = i460;
        int i461 = colorsCount;
        colorsCount = i461 + 1;
        key_chat_emojiPanelStickerSetNameHighlight = i461;
        int i462 = colorsCount;
        colorsCount = i462 + 1;
        key_chat_emojiPanelStickerSetNameIcon = i462;
        int i463 = colorsCount;
        colorsCount = i463 + 1;
        key_chat_emojiPanelTrendingDescription = i463;
        int i464 = colorsCount;
        colorsCount = i464 + 1;
        key_chat_botKeyboardButtonText = i464;
        int i465 = colorsCount;
        colorsCount = i465 + 1;
        key_chat_botKeyboardButtonBackground = i465;
        int i466 = colorsCount;
        colorsCount = i466 + 1;
        key_chat_botKeyboardButtonBackgroundPressed = i466;
        int i467 = colorsCount;
        colorsCount = i467 + 1;
        key_chat_emojiPanelNewTrending = i467;
        int i468 = colorsCount;
        colorsCount = i468 + 1;
        key_chat_messagePanelVoicePressed = i468;
        int i469 = colorsCount;
        colorsCount = i469 + 1;
        key_chat_messagePanelVoiceBackground = i469;
        int i470 = colorsCount;
        colorsCount = i470 + 1;
        key_chat_messagePanelVoiceDelete = i470;
        int i471 = colorsCount;
        colorsCount = i471 + 1;
        key_chat_messagePanelVoiceDuration = i471;
        int i472 = colorsCount;
        colorsCount = i472 + 1;
        key_chat_recordedVoicePlayPause = i472;
        int i473 = colorsCount;
        colorsCount = i473 + 1;
        key_chat_recordedVoiceProgress = i473;
        int i474 = colorsCount;
        colorsCount = i474 + 1;
        key_chat_recordedVoiceProgressInner = i474;
        int i475 = colorsCount;
        colorsCount = i475 + 1;
        key_chat_recordedVoiceDot = i475;
        int i476 = colorsCount;
        colorsCount = i476 + 1;
        key_chat_recordedVoiceBackground = i476;
        int i477 = colorsCount;
        colorsCount = i477 + 1;
        key_chat_recordedVoiceDarkerBackground = i477;
        int i478 = colorsCount;
        colorsCount = i478 + 1;
        key_chat_recordVoiceCancel = i478;
        int i479 = colorsCount;
        colorsCount = i479 + 1;
        key_chat_recordTime = i479;
        int i480 = colorsCount;
        colorsCount = i480 + 1;
        key_chat_messagePanelCancelInlineBot = i480;
        int i481 = colorsCount;
        colorsCount = i481 + 1;
        key_chat_gifSaveHintText = i481;
        int i482 = colorsCount;
        colorsCount = i482 + 1;
        key_chat_gifSaveHintBackground = i482;
        int i483 = colorsCount;
        colorsCount = i483 + 1;
        key_chat_goDownButton = i483;
        int i484 = colorsCount;
        colorsCount = i484 + 1;
        key_chat_goDownButtonCounter = i484;
        int i485 = colorsCount;
        colorsCount = i485 + 1;
        key_chat_goDownButtonCounterBackground = i485;
        int i486 = colorsCount;
        colorsCount = i486 + 1;
        key_chat_inTextSelectionHighlight = i486;
        int i487 = colorsCount;
        colorsCount = i487 + 1;
        key_chat_TextSelectionCursor = i487;
        int i488 = colorsCount;
        colorsCount = i488 + 1;
        key_chat_inBubbleLocationPlaceholder = i488;
        int i489 = colorsCount;
        colorsCount = i489 + 1;
        key_chat_BlurAlpha = i489;
        int i490 = colorsCount;
        colorsCount = i490 + 1;
        key_chat_BlurAlphaSlow = i490;
        int i491 = colorsCount;
        colorsCount = i491 + 1;
        key_chat_editMediaButton = i491;
        int i492 = colorsCount;
        colorsCount = i492 + 1;
        key_chat_msgIvButtonDefaultIn = i492;
        int i493 = colorsCount;
        colorsCount = i493 + 1;
        key_chat_msgIvButtonDefaultInPressed = i493;
        int i494 = colorsCount;
        colorsCount = i494 + 1;
        key_chat_msgIvButtonDefaultInText = i494;
        int i495 = colorsCount;
        colorsCount = i495 + 1;
        key_chat_msgIvButtonPrimaryIn = i495;
        int i496 = colorsCount;
        colorsCount = i496 + 1;
        key_chat_msgIvButtonPrimaryInPressed = i496;
        int i497 = colorsCount;
        colorsCount = i497 + 1;
        key_chat_msgIvButtonPrimaryInText = i497;
        int i498 = colorsCount;
        colorsCount = i498 + 1;
        key_chat_msgIvButtonDangerIn = i498;
        int i499 = colorsCount;
        colorsCount = i499 + 1;
        key_chat_msgIvButtonDangerInPressed = i499;
        int i500 = colorsCount;
        colorsCount = i500 + 1;
        key_chat_msgIvButtonDangerInText = i500;
        int i501 = colorsCount;
        colorsCount = i501 + 1;
        key_chat_msgIvButtonSuccessIn = i501;
        int i502 = colorsCount;
        colorsCount = i502 + 1;
        key_chat_msgIvButtonSuccessInPressed = i502;
        int i503 = colorsCount;
        colorsCount = i503 + 1;
        key_chat_msgIvButtonSuccessInText = i503;
        int i504 = colorsCount;
        colorsCount = i504 + 1;
        key_chat_msgIvButtonDefaultInlineIn = i504;
        int i505 = colorsCount;
        colorsCount = i505 + 1;
        key_chat_msgIvButtonDefaultInlineInPressed = i505;
        int i506 = colorsCount;
        colorsCount = i506 + 1;
        key_chat_msgIvButtonDefaultInlineInText = i506;
        int i507 = colorsCount;
        colorsCount = i507 + 1;
        key_chat_msgIvButtonDefaultOut = i507;
        int i508 = colorsCount;
        colorsCount = i508 + 1;
        key_chat_msgIvButtonDefaultOutPressed = i508;
        int i509 = colorsCount;
        colorsCount = i509 + 1;
        key_chat_msgIvButtonDefaultOutText = i509;
        int i510 = colorsCount;
        colorsCount = i510 + 1;
        key_chat_msgIvButtonPrimaryOut = i510;
        int i511 = colorsCount;
        colorsCount = i511 + 1;
        key_chat_msgIvButtonPrimaryOutPressed = i511;
        int i512 = colorsCount;
        colorsCount = i512 + 1;
        key_chat_msgIvButtonPrimaryOutText = i512;
        int i513 = colorsCount;
        colorsCount = i513 + 1;
        key_chat_msgIvButtonDangerOut = i513;
        int i514 = colorsCount;
        colorsCount = i514 + 1;
        key_chat_msgIvButtonDangerOutPressed = i514;
        int i515 = colorsCount;
        colorsCount = i515 + 1;
        key_chat_msgIvButtonDangerOutText = i515;
        int i516 = colorsCount;
        colorsCount = i516 + 1;
        key_chat_msgIvButtonSuccessOut = i516;
        int i517 = colorsCount;
        colorsCount = i517 + 1;
        key_chat_msgIvButtonSuccessOutPressed = i517;
        int i518 = colorsCount;
        colorsCount = i518 + 1;
        key_chat_msgIvButtonSuccessOutText = i518;
        int i519 = colorsCount;
        colorsCount = i519 + 1;
        key_chat_msgIvButtonDefaultInlineOut = i519;
        int i520 = colorsCount;
        colorsCount = i520 + 1;
        key_chat_msgIvButtonDefaultInlineOutPressed = i520;
        int i521 = colorsCount;
        colorsCount = i521 + 1;
        key_chat_msgIvButtonDefaultInlineOutText = i521;
        int i522 = colorsCount;
        colorsCount = i522 + 1;
        key_voipgroup_listSelector = i522;
        int i523 = colorsCount;
        colorsCount = i523 + 1;
        key_voipgroup_inviteMembersBackground = i523;
        int i524 = colorsCount;
        colorsCount = i524 + 1;
        key_voipgroup_actionBar = i524;
        int i525 = colorsCount;
        colorsCount = i525 + 1;
        key_voipgroup_actionBarItems = i525;
        int i526 = colorsCount;
        colorsCount = i526 + 1;
        key_voipgroup_actionBarItemsSelector = i526;
        int i527 = colorsCount;
        colorsCount = i527 + 1;
        key_voipgroup_actionBarUnscrolled = i527;
        int i528 = colorsCount;
        colorsCount = i528 + 1;
        key_voipgroup_listViewBackgroundUnscrolled = i528;
        int i529 = colorsCount;
        colorsCount = i529 + 1;
        key_voipgroup_lastSeenTextUnscrolled = i529;
        int i530 = colorsCount;
        colorsCount = i530 + 1;
        key_voipgroup_mutedIconUnscrolled = i530;
        int i531 = colorsCount;
        colorsCount = i531 + 1;
        key_voipgroup_nameText = i531;
        int i532 = colorsCount;
        colorsCount = i532 + 1;
        key_voipgroup_lastSeenText = i532;
        int i533 = colorsCount;
        colorsCount = i533 + 1;
        key_voipgroup_listeningText = i533;
        int i534 = colorsCount;
        colorsCount = i534 + 1;
        key_voipgroup_speakingText = i534;
        int i535 = colorsCount;
        colorsCount = i535 + 1;
        key_voipgroup_mutedIcon = i535;
        int i536 = colorsCount;
        colorsCount = i536 + 1;
        key_voipgroup_mutedByAdminIcon = i536;
        int i537 = colorsCount;
        colorsCount = i537 + 1;
        key_voipgroup_listViewBackground = i537;
        int i538 = colorsCount;
        colorsCount = i538 + 1;
        key_voipgroup_dialogBackground = i538;
        int i539 = colorsCount;
        colorsCount = i539 + 1;
        key_voipgroup_leaveCallMenu = i539;
        int i540 = colorsCount;
        colorsCount = i540 + 1;
        key_voipgroup_checkMenu = i540;
        int i541 = colorsCount;
        colorsCount = i541 + 1;
        key_voipgroup_soundButton = i541;
        int i542 = colorsCount;
        colorsCount = i542 + 1;
        key_voipgroup_soundButtonActive = i542;
        int i543 = colorsCount;
        colorsCount = i543 + 1;
        key_voipgroup_soundButtonActiveScrolled = i543;
        int i544 = colorsCount;
        colorsCount = i544 + 1;
        key_voipgroup_soundButton2 = i544;
        int i545 = colorsCount;
        colorsCount = i545 + 1;
        key_voipgroup_soundButtonActive2 = i545;
        int i546 = colorsCount;
        colorsCount = i546 + 1;
        key_voipgroup_soundButtonActive2Scrolled = i546;
        int i547 = colorsCount;
        colorsCount = i547 + 1;
        key_voipgroup_leaveButton = i547;
        int i548 = colorsCount;
        colorsCount = i548 + 1;
        key_voipgroup_leaveButtonScrolled = i548;
        int i549 = colorsCount;
        colorsCount = i549 + 1;
        key_voipgroup_muteButton = i549;
        int i550 = colorsCount;
        colorsCount = i550 + 1;
        key_voipgroup_muteButton2 = i550;
        int i551 = colorsCount;
        colorsCount = i551 + 1;
        key_voipgroup_muteButton3 = i551;
        int i552 = colorsCount;
        colorsCount = i552 + 1;
        key_voipgroup_unmuteButton = i552;
        int i553 = colorsCount;
        colorsCount = i553 + 1;
        key_voipgroup_unmuteButton2 = i553;
        int i554 = colorsCount;
        colorsCount = i554 + 1;
        key_voipgroup_disabledButton = i554;
        int i555 = colorsCount;
        colorsCount = i555 + 1;
        key_voipgroup_rtmpButton = i555;
        int i556 = colorsCount;
        colorsCount = i556 + 1;
        key_voipgroup_disabledButtonActive = i556;
        int i557 = colorsCount;
        colorsCount = i557 + 1;
        key_voipgroup_disabledButtonActiveScrolled = i557;
        int i558 = colorsCount;
        colorsCount = i558 + 1;
        key_voipgroup_connectingProgress = i558;
        int i559 = colorsCount;
        colorsCount = i559 + 1;
        key_voipgroup_scrollUp = i559;
        int i560 = colorsCount;
        colorsCount = i560 + 1;
        key_voipgroup_searchPlaceholder = i560;
        int i561 = colorsCount;
        colorsCount = i561 + 1;
        key_voipgroup_searchBackground = i561;
        int i562 = colorsCount;
        colorsCount = i562 + 1;
        key_voipgroup_searchText = i562;
        int i563 = colorsCount;
        colorsCount = i563 + 1;
        key_voipgroup_overlayGreen1 = i563;
        int i564 = colorsCount;
        colorsCount = i564 + 1;
        key_voipgroup_overlayGreen2 = i564;
        int i565 = colorsCount;
        colorsCount = i565 + 1;
        key_voipgroup_overlayBlue1 = i565;
        int i566 = colorsCount;
        colorsCount = i566 + 1;
        key_voipgroup_overlayBlue2 = i566;
        int i567 = colorsCount;
        colorsCount = i567 + 1;
        key_voipgroup_topPanelGreen1 = i567;
        int i568 = colorsCount;
        colorsCount = i568 + 1;
        key_voipgroup_topPanelGreen2 = i568;
        int i569 = colorsCount;
        colorsCount = i569 + 1;
        key_voipgroup_topPanelBlue1 = i569;
        int i570 = colorsCount;
        colorsCount = i570 + 1;
        key_voipgroup_topPanelBlue2 = i570;
        int i571 = colorsCount;
        colorsCount = i571 + 1;
        key_voipgroup_topPanelGray = i571;
        int i572 = colorsCount;
        colorsCount = i572 + 1;
        key_voipgroup_overlayAlertGradientMuted = i572;
        int i573 = colorsCount;
        colorsCount = i573 + 1;
        key_voipgroup_overlayAlertGradientMuted2 = i573;
        int i574 = colorsCount;
        colorsCount = i574 + 1;
        key_voipgroup_overlayAlertGradientUnmuted = i574;
        int i575 = colorsCount;
        colorsCount = i575 + 1;
        key_voipgroup_overlayAlertGradientUnmuted2 = i575;
        int i576 = colorsCount;
        colorsCount = i576 + 1;
        key_voipgroup_overlayAlertMutedByAdmin = i576;
        int i577 = colorsCount;
        colorsCount = i577 + 1;
        key_voipgroup_overlayAlertMutedByAdmin2 = i577;
        int i578 = colorsCount;
        colorsCount = i578 + 1;
        key_voipgroup_mutedByAdminGradient = i578;
        int i579 = colorsCount;
        colorsCount = i579 + 1;
        key_voipgroup_mutedByAdminGradient2 = i579;
        int i580 = colorsCount;
        colorsCount = i580 + 1;
        key_voipgroup_mutedByAdminGradient3 = i580;
        int i581 = colorsCount;
        colorsCount = i581 + 1;
        key_voipgroup_mutedByAdminMuteButton = i581;
        int i582 = colorsCount;
        colorsCount = i582 + 1;
        key_voipgroup_mutedByAdminMuteButtonDisabled = i582;
        int i583 = colorsCount;
        colorsCount = i583 + 1;
        key_voipgroup_windowBackgroundWhiteInputField = i583;
        int i584 = colorsCount;
        colorsCount = i584 + 1;
        key_voipgroup_windowBackgroundWhiteInputFieldActivated = i584;
        int i585 = colorsCount;
        colorsCount = i585 + 1;
        key_table_background = i585;
        int i586 = colorsCount;
        colorsCount = i586 + 1;
        key_table_border = i586;
        int i587 = colorsCount;
        colorsCount = i587 + 1;
        key_passport_authorizeBackground = i587;
        int i588 = colorsCount;
        colorsCount = i588 + 1;
        key_passport_authorizeBackgroundSelected = i588;
        int i589 = colorsCount;
        colorsCount = i589 + 1;
        key_passport_authorizeText = i589;
        int i590 = colorsCount;
        colorsCount = i590 + 1;
        key_profile_creatorIcon = i590;
        int i591 = colorsCount;
        colorsCount = i591 + 1;
        key_profile_title = i591;
        int i592 = colorsCount;
        colorsCount = i592 + 1;
        key_profile_actionIcon = i592;
        int i593 = colorsCount;
        colorsCount = i593 + 1;
        key_profile_actionBackground = i593;
        int i594 = colorsCount;
        colorsCount = i594 + 1;
        key_profile_actionPressedBackground = i594;
        int i595 = colorsCount;
        colorsCount = i595 + 1;
        key_profile_verifiedBackground = i595;
        int i596 = colorsCount;
        colorsCount = i596 + 1;
        key_profile_verifiedCheck = i596;
        int i597 = colorsCount;
        colorsCount = i597 + 1;
        key_profile_status = i597;
        int i598 = colorsCount;
        colorsCount = i598 + 1;
        key_chat_tagAdmin = i598;
        int i599 = colorsCount;
        colorsCount = i599 + 1;
        key_chat_tagCreator = i599;
        int i600 = colorsCount;
        colorsCount = i600 + 1;
        key_profile_tabText = i600;
        int i601 = colorsCount;
        colorsCount = i601 + 1;
        key_profile_tabSelectedText = i601;
        int i602 = colorsCount;
        colorsCount = i602 + 1;
        key_profile_tabSelectedLine = i602;
        int i603 = colorsCount;
        colorsCount = i603 + 1;
        key_profile_tabSelector = i603;
        int i604 = colorsCount;
        colorsCount = i604 + 1;
        key_sharedMedia_startStopLoadIcon = i604;
        int i605 = colorsCount;
        colorsCount = i605 + 1;
        key_sharedMedia_linkPlaceholder = i605;
        int i606 = colorsCount;
        colorsCount = i606 + 1;
        key_sharedMedia_linkPlaceholderText = i606;
        int i607 = colorsCount;
        colorsCount = i607 + 1;
        key_sharedMedia_photoPlaceholder = i607;
        int i608 = colorsCount;
        colorsCount = i608 + 1;
        key_featuredStickers_addedIcon = i608;
        int i609 = colorsCount;
        colorsCount = i609 + 1;
        key_featuredStickers_buttonProgress = i609;
        int i610 = colorsCount;
        colorsCount = i610 + 1;
        key_featuredStickers_addButton = i610;
        int i611 = colorsCount;
        colorsCount = i611 + 1;
        key_featuredStickers_addButton2 = i611;
        int i612 = colorsCount;
        colorsCount = i612 + 1;
        key_featuredStickers_addButtonPressed = i612;
        int i613 = colorsCount;
        colorsCount = i613 + 1;
        key_featuredStickers_removeButtonText = i613;
        int i614 = colorsCount;
        colorsCount = i614 + 1;
        key_featuredStickers_buttonText = i614;
        int i615 = colorsCount;
        colorsCount = i615 + 1;
        key_featuredStickers_unread = i615;
        int i616 = colorsCount;
        colorsCount = i616 + 1;
        key_stickers_menu = i616;
        int i617 = colorsCount;
        colorsCount = i617 + 1;
        key_stickers_menuSelector = i617;
        int i618 = colorsCount;
        colorsCount = i618 + 1;
        key_changephoneinfo_image2 = i618;
        int i619 = colorsCount;
        colorsCount = i619 + 1;
        key_groupcreate_hintText = i619;
        int i620 = colorsCount;
        colorsCount = i620 + 1;
        key_groupcreate_cursor = i620;
        int i621 = colorsCount;
        colorsCount = i621 + 1;
        key_groupcreate_sectionShadow = i621;
        int i622 = colorsCount;
        colorsCount = i622 + 1;
        key_groupcreate_sectionText = i622;
        int i623 = colorsCount;
        colorsCount = i623 + 1;
        key_groupcreate_spanText = i623;
        int i624 = colorsCount;
        colorsCount = i624 + 1;
        key_groupcreate_spanBackground = i624;
        int i625 = colorsCount;
        colorsCount = i625 + 1;
        key_groupcreate_spanDelete = i625;
        int i626 = colorsCount;
        colorsCount = i626 + 1;
        key_contacts_inviteBackground = i626;
        int i627 = colorsCount;
        colorsCount = i627 + 1;
        key_contacts_inviteText = i627;
        int i628 = colorsCount;
        colorsCount = i628 + 1;
        key_login_progressInner = i628;
        int i629 = colorsCount;
        colorsCount = i629 + 1;
        key_login_progressOuter = i629;
        int i630 = colorsCount;
        colorsCount = i630 + 1;
        key_picker_enabledButton = i630;
        int i631 = colorsCount;
        colorsCount = i631 + 1;
        key_picker_disabledButton = i631;
        int i632 = colorsCount;
        colorsCount = i632 + 1;
        key_picker_badge = i632;
        int i633 = colorsCount;
        colorsCount = i633 + 1;
        key_picker_badgeText = i633;
        int i634 = colorsCount;
        colorsCount = i634 + 1;
        key_location_sendLocationBackground = i634;
        int i635 = colorsCount;
        colorsCount = i635 + 1;
        key_location_sendLocationIcon = i635;
        int i636 = colorsCount;
        colorsCount = i636 + 1;
        key_location_sendLocationText = i636;
        int i637 = colorsCount;
        colorsCount = i637 + 1;
        key_location_sendLiveLocationBackground = i637;
        int i638 = colorsCount;
        colorsCount = i638 + 1;
        key_location_sendLiveLocationIcon = i638;
        int i639 = colorsCount;
        colorsCount = i639 + 1;
        key_location_sendLiveLocationText = i639;
        int i640 = colorsCount;
        colorsCount = i640 + 1;
        key_location_liveLocationProgress = i640;
        int i641 = colorsCount;
        colorsCount = i641 + 1;
        key_location_placeLocationBackground = i641;
        int i642 = colorsCount;
        colorsCount = i642 + 1;
        key_location_actionIcon = i642;
        int i643 = colorsCount;
        colorsCount = i643 + 1;
        key_location_actionActiveIcon = i643;
        int i644 = colorsCount;
        colorsCount = i644 + 1;
        key_location_actionBackground = i644;
        int i645 = colorsCount;
        colorsCount = i645 + 1;
        key_location_actionPressedBackground = i645;
        int i646 = colorsCount;
        colorsCount = i646 + 1;
        key_dialog_liveLocationProgress = i646;
        int i647 = colorsCount;
        colorsCount = i647 + 1;
        key_files_folderIcon = i647;
        int i648 = colorsCount;
        colorsCount = i648 + 1;
        key_files_folderIconBackground = i648;
        int i649 = colorsCount;
        colorsCount = i649 + 1;
        key_files_iconText = i649;
        int i650 = colorsCount;
        colorsCount = i650 + 1;
        key_sessions_devicesImage = i650;
        int i651 = colorsCount;
        colorsCount = i651 + 1;
        key_calls_callReceivedGreenIcon = i651;
        int i652 = colorsCount;
        colorsCount = i652 + 1;
        key_calls_callReceivedRedIcon = i652;
        int i653 = colorsCount;
        colorsCount = i653 + 1;
        key_undo_background = i653;
        int i654 = colorsCount;
        colorsCount = i654 + 1;
        key_undo_cancelColor = i654;
        int i655 = colorsCount;
        colorsCount = i655 + 1;
        key_undo_infoColor = i655;
        int i656 = colorsCount;
        colorsCount = i656 + 1;
        key_sheet_scrollUp = i656;
        int i657 = colorsCount;
        colorsCount = i657 + 1;
        key_sheet_other = i657;
        int i658 = colorsCount;
        colorsCount = i658 + 1;
        key_bot_loadingIcon = i658;
        int i659 = colorsCount;
        colorsCount = i659 + 1;
        key_gift_ribbon = i659;
        int i660 = colorsCount;
        colorsCount = i660 + 1;
        key_gift_ribbon_soldout = i660;
        int i661 = colorsCount;
        colorsCount = i661 + 1;
        key_player_actionBarSelector = i661;
        int i662 = colorsCount;
        colorsCount = i662 + 1;
        key_player_actionBarTitle = i662;
        int i663 = colorsCount;
        colorsCount = i663 + 1;
        key_player_actionBarSubtitle = i663;
        int i664 = colorsCount;
        colorsCount = i664 + 1;
        key_player_actionBarItems = i664;
        int i665 = colorsCount;
        colorsCount = i665 + 1;
        key_player_background = i665;
        int i666 = colorsCount;
        colorsCount = i666 + 1;
        key_player_time = i666;
        int i667 = colorsCount;
        colorsCount = i667 + 1;
        key_player_progressBackground = i667;
        int i668 = colorsCount;
        colorsCount = i668 + 1;
        key_player_progressCachedBackground = i668;
        int i669 = colorsCount;
        colorsCount = i669 + 1;
        key_player_progress = i669;
        int i670 = colorsCount;
        colorsCount = i670 + 1;
        key_player_button = i670;
        int i671 = colorsCount;
        colorsCount = i671 + 1;
        key_player_buttonActive = i671;
        int i672 = colorsCount;
        colorsCount = i672 + 1;
        key_statisticChartSignature = i672;
        int i673 = colorsCount;
        colorsCount = i673 + 1;
        key_statisticChartSignatureAlpha = i673;
        int i674 = colorsCount;
        colorsCount = i674 + 1;
        key_statisticChartHintLine = i674;
        int i675 = colorsCount;
        colorsCount = i675 + 1;
        key_statisticChartActiveLine = i675;
        int i676 = colorsCount;
        colorsCount = i676 + 1;
        key_statisticChartInactivePickerChart = i676;
        int i677 = colorsCount;
        colorsCount = i677 + 1;
        key_statisticChartActivePickerChart = i677;
        int i678 = colorsCount;
        colorsCount = i678 + 1;
        key_statisticChartRipple = i678;
        int i679 = colorsCount;
        colorsCount = i679 + 1;
        key_statisticChartBackZoomColor = i679;
        int i680 = colorsCount;
        colorsCount = i680 + 1;
        key_statisticChartChevronColor = i680;
        int i681 = colorsCount;
        colorsCount = i681 + 1;
        key_statisticChartLine_blue = i681;
        int i682 = colorsCount;
        colorsCount = i682 + 1;
        key_statisticChartLine_green = i682;
        int i683 = colorsCount;
        colorsCount = i683 + 1;
        key_statisticChartLine_red = i683;
        int i684 = colorsCount;
        colorsCount = i684 + 1;
        key_statisticChartLine_golden = i684;
        int i685 = colorsCount;
        colorsCount = i685 + 1;
        key_statisticChartLine_lightblue = i685;
        int i686 = colorsCount;
        colorsCount = i686 + 1;
        key_statisticChartLine_lightgreen = i686;
        int i687 = colorsCount;
        colorsCount = i687 + 1;
        key_statisticChartLine_orange = i687;
        int i688 = colorsCount;
        colorsCount = i688 + 1;
        key_statisticChartLine_indigo = i688;
        int i689 = colorsCount;
        colorsCount = i689 + 1;
        key_statisticChartLine_purple = i689;
        int i690 = colorsCount;
        colorsCount = i690 + 1;
        key_statisticChartLine_cyan = i690;
        int i691 = colorsCount;
        colorsCount = i691 + 1;
        key_statisticChartLineEmpty = i691;
        int i692 = colorsCount;
        colorsCount = i692 + 1;
        key_color_lightblue = i692;
        int i693 = colorsCount;
        colorsCount = i693 + 1;
        key_color_blue = i693;
        int i694 = colorsCount;
        colorsCount = i694 + 1;
        key_color_green = i694;
        int i695 = colorsCount;
        colorsCount = i695 + 1;
        key_color_lightgreen = i695;
        int i696 = colorsCount;
        colorsCount = i696 + 1;
        key_color_red = i696;
        int i697 = colorsCount;
        colorsCount = i697 + 1;
        key_color_orange = i697;
        int i698 = colorsCount;
        colorsCount = i698 + 1;
        key_color_yellow = i698;
        int i699 = colorsCount;
        colorsCount = i699 + 1;
        key_color_purple = i699;
        int i700 = colorsCount;
        colorsCount = i700 + 1;
        key_color_cyan = i700;
        keys_colors = new int[]{i692, i693, i694, i695, i696, i697, i698, i699, i700};
        int i701 = colorsCount;
        colorsCount = i701 + 1;
        key_chat_inReactionButtonBackground = i701;
        int i702 = colorsCount;
        colorsCount = i702 + 1;
        key_chat_outReactionButtonText = i702;
        int i703 = colorsCount;
        colorsCount = i703 + 1;
        key_chat_inReactionButtonText = i703;
        int i704 = colorsCount;
        colorsCount = i704 + 1;
        key_chat_inReactionButtonTextSelected = i704;
        int i705 = colorsCount;
        colorsCount = i705 + 1;
        key_chat_outReactionButtonTextSelected = i705;
        int i706 = colorsCount;
        colorsCount = i706 + 1;
        key_chat_reactionServiceButtonBackgroundSelected = i706;
        int i707 = colorsCount;
        colorsCount = i707 + 1;
        key_chat_reactionServiceButtonTextSelected = i707;
        int i708 = colorsCount;
        colorsCount = i708 + 1;
        key_reactionStarSelector = i708;
        int i709 = colorsCount;
        colorsCount = i709 + 1;
        key_premiumGradient0 = i709;
        int i710 = colorsCount;
        colorsCount = i710 + 1;
        key_premiumGradient1 = i710;
        int i711 = colorsCount;
        colorsCount = i711 + 1;
        key_premiumGradient2 = i711;
        int i712 = colorsCount;
        colorsCount = i712 + 1;
        key_premiumGradient3 = i712;
        int i713 = colorsCount;
        colorsCount = i713 + 1;
        key_premiumGradient4 = i713;
        int i714 = colorsCount;
        colorsCount = i714 + 1;
        key_premiumGradientBackground1 = i714;
        int i715 = colorsCount;
        colorsCount = i715 + 1;
        key_premiumGradientBackground2 = i715;
        int i716 = colorsCount;
        colorsCount = i716 + 1;
        key_premiumGradientBackground3 = i716;
        int i717 = colorsCount;
        colorsCount = i717 + 1;
        key_premiumGradientBackground4 = i717;
        int i718 = colorsCount;
        colorsCount = i718 + 1;
        key_premiumGradientBackgroundOverlay = i718;
        int i719 = colorsCount;
        colorsCount = i719 + 1;
        key_premiumStartSmallStarsColor = i719;
        int i720 = colorsCount;
        colorsCount = i720 + 1;
        key_premiumStarGradient1 = i720;
        int i721 = colorsCount;
        colorsCount = i721 + 1;
        key_premiumStarGradient2 = i721;
        int i722 = colorsCount;
        colorsCount = i722 + 1;
        key_premiumCoinGradient1 = i722;
        int i723 = colorsCount;
        colorsCount = i723 + 1;
        key_premiumCoinGradient2 = i723;
        int i724 = colorsCount;
        colorsCount = i724 + 1;
        key_premiumStartSmallStarsColor2 = i724;
        int i725 = colorsCount;
        colorsCount = i725 + 1;
        key_premiumGradientBottomSheet1 = i725;
        int i726 = colorsCount;
        colorsCount = i726 + 1;
        key_premiumGradientBottomSheet2 = i726;
        int i727 = colorsCount;
        colorsCount = i727 + 1;
        key_premiumGradientBottomSheet3 = i727;
        int i728 = colorsCount;
        colorsCount = i728 + 1;
        key_topics_unreadCounter = i728;
        int i729 = colorsCount;
        colorsCount = i729 + 1;
        key_topics_unreadCounterMuted = i729;
        int i730 = colorsCount;
        colorsCount = i730 + 1;
        key_starsGradient1 = i730;
        int i731 = colorsCount;
        colorsCount = i731 + 1;
        key_starsGradient2 = i731;
        int i732 = colorsCount;
        colorsCount = i732 + 1;
        key_stories_circle1 = i732;
        int i733 = colorsCount;
        colorsCount = i733 + 1;
        key_stories_circle2 = i733;
        int i734 = colorsCount;
        colorsCount = i734 + 1;
        key_stories_circle_dialog1 = i734;
        int i735 = colorsCount;
        colorsCount = i735 + 1;
        key_stories_circle_dialog2 = i735;
        int i736 = colorsCount;
        colorsCount = i736 + 1;
        key_stories_circle_closeFriends1 = i736;
        int i737 = colorsCount;
        colorsCount = i737 + 1;
        key_stories_circle_closeFriends2 = i737;
        int i738 = colorsCount;
        colorsCount = i738 + 1;
        key_stories_circle_live1 = i738;
        int i739 = colorsCount;
        colorsCount = i739 + 1;
        key_stories_circle_live2 = i739;
        int i740 = colorsCount;
        colorsCount = i740 + 1;
        key_chat_inCodeBackground = i740;
        int i741 = colorsCount;
        colorsCount = i741 + 1;
        key_chat_outCodeBackground = i741;
        int i742 = colorsCount;
        colorsCount = i742 + 1;
        key_chat_inTableBackground = i742;
        int i743 = colorsCount;
        colorsCount = i743 + 1;
        key_chat_outTableBackground = i743;
        int i744 = colorsCount;
        colorsCount = i744 + 1;
        key_chat_inTableBorder = i744;
        int i745 = colorsCount;
        colorsCount = i745 + 1;
        key_chat_outTableBorder = i745;
        int i746 = colorsCount;
        colorsCount = i746 + 1;
        key_chat_inDivider = i746;
        int i747 = colorsCount;
        colorsCount = i747 + 1;
        key_chat_outDivider = i747;
        int i748 = colorsCount;
        colorsCount = i748 + 1;
        key_chat_inArticleCodeBackground = i748;
        int i749 = colorsCount;
        colorsCount = i749 + 1;
        key_chat_outArticleCodeBackground = i749;
        int i750 = colorsCount;
        colorsCount = i750 + 1;
        key_chat_inArticleCodeScrollbarBackground = i750;
        int i751 = colorsCount;
        colorsCount = i751 + 1;
        key_chat_inArticleCodeScrollbar = i751;
        int i752 = colorsCount;
        colorsCount = i752 + 1;
        key_chat_outArticleCodeScrollbarBackground = i752;
        int i753 = colorsCount;
        colorsCount = i753 + 1;
        key_chat_outArticleCodeScrollbar = i753;
        int i754 = colorsCount;
        colorsCount = i754 + 1;
        key_chat_inArticleDetailsArrow = i754;
        int i755 = colorsCount;
        colorsCount = i755 + 1;
        key_chat_outArticleDetailsArrow = i755;
        int i756 = colorsCount;
        colorsCount = i756 + 1;
        key_chat_inArticleDetailsLine = i756;
        int i757 = colorsCount;
        colorsCount = i757 + 1;
        key_chat_outArticleDetailsLine = i757;
        myMessagesAccentExtraKeys = new int[]{i747};
        int i758 = colorsCount;
        colorsCount = i758 + 1;
        key_code_keyword = i758;
        int i759 = colorsCount;
        colorsCount = i759 + 1;
        key_code_operator = i759;
        int i760 = colorsCount;
        colorsCount = i760 + 1;
        key_code_constant = i760;
        int i761 = colorsCount;
        colorsCount = i761 + 1;
        key_code_string = i761;
        int i762 = colorsCount;
        colorsCount = i762 + 1;
        key_code_number = i762;
        int i763 = colorsCount;
        colorsCount = i763 + 1;
        key_code_comment = i763;
        int i764 = colorsCount;
        colorsCount = i764 + 1;
        key_code_function = i764;
        int i765 = colorsCount;
        colorsCount = i765 + 1;
        key_iv_background = i765;
        int i766 = colorsCount;
        colorsCount = i766 + 1;
        key_iv_backgroundGray = i766;
        int i767 = colorsCount;
        colorsCount = i767 + 1;
        key_iv_ab_progress = i767;
        int i768 = colorsCount;
        colorsCount = i768 + 1;
        key_iv_navigationBackground = i768;
        int i769 = colorsCount;
        colorsCount = i769 + 1;
        key_share_linkText = i769;
        int i770 = colorsCount;
        colorsCount = i770 + 1;
        key_share_linkBackground = i770;
        int i771 = colorsCount;
        colorsCount = i771 + 1;
        key_share_icon = i771;
        int i772 = colorsCount;
        colorsCount = i772 + 1;
        key_glass_defaultIcon = i772;
        int i773 = colorsCount;
        colorsCount = i773 + 1;
        key_glass_defaultText = i773;
        int i774 = colorsCount;
        colorsCount = i774 + 1;
        key_glass_targetMainTabs = i774;
        int i775 = colorsCount;
        colorsCount = i775 + 1;
        key_glass_targetMainTopPanel = i775;
        int i776 = colorsCount;
        colorsCount = i776 + 1;
        key_glass_tabSelected = i776;
        int i777 = colorsCount;
        colorsCount = i777 + 1;
        key_glass_tabSelectedText = i777;
        int i778 = colorsCount;
        colorsCount = i778 + 1;
        key_glass_tabUnselected = i778;
        int i779 = colorsCount;
        colorsCount = i779 + 1;
        key_botKeyboard_button_primary = i779;
        int i780 = colorsCount;
        colorsCount = i780 + 1;
        key_botKeyboard_button_danger = i780;
        int i781 = colorsCount;
        colorsCount = i781 + 1;
        key_botKeyboard_button_success = i781;
        int i782 = colorsCount;
        colorsCount = i782 + 1;
        key_telegram_color_dialogsLogo = i782;
        int i783 = colorsCount;
        colorsCount = i783 + 1;
        key_telegram_color = i783;
        int i784 = colorsCount;
        colorsCount = i784 + 1;
        key_telegram_color_text = i784;
        defaultChatDrawables = new HashMap();
        defaultChatDrawableColorKeys = new HashMap();
        defaultChatPaints = new HashMap();
        defaultChatPaintColors = new HashMap();
        fallbackKeys = new SparseIntArray();
        themeAccentExclusionKeys = new HashSet();
        hsvTemp1Local = new ThreadLocal();
        hsvTemp2Local = new ThreadLocal();
        hsvTemp3Local = new ThreadLocal();
        hsvTemp4Local = new ThreadLocal();
        hsvTemp5Local = new ThreadLocal();
        defaultColors = ThemeColors.createDefaultColors();
        fallbackKeys.put(i765, key_windowBackgroundWhite);
        SparseIntArray sparseIntArray = fallbackKeys;
        int i785 = key_windowBackgroundGray;
        sparseIntArray.put(i766, i785);
        fallbackKeys.put(i768, i785);
        fallbackKeys.put(key_bot_loadingIcon, key_groupcreate_spanBackground);
        fallbackKeys.put(key_gift_ribbon_soldout, key_text_RedBold);
        SparseIntArray sparseIntArray2 = fallbackKeys;
        int i786 = key_featuredStickers_addButton;
        sparseIntArray2.put(i767, i786);
        fallbackKeys.put(key_featuredStickers_addButton2, i786);
        fallbackKeys.put(key_dialogGiftsBackground, i785);
        SparseIntArray sparseIntArray3 = fallbackKeys;
        int i787 = key_dialogGiftsTabText;
        int i788 = key_windowBackgroundWhiteGrayText2;
        sparseIntArray3.put(i787, i788);
        fallbackKeys.put(key_chat_inQuote, key_featuredStickers_addButtonPressed);
        SparseIntArray sparseIntArray4 = fallbackKeys;
        int i789 = key_chat_outQuote;
        int i790 = key_chat_outReplyLine;
        sparseIntArray4.put(i789, i790);
        fallbackKeys.put(key_chat_outReplyLine2, i790);
        fallbackKeys.put(key_chat_inAdminText, key_chat_inTimeText);
        fallbackKeys.put(key_chat_inAdminSelectedText, key_chat_inTimeSelectedText);
        fallbackKeys.put(key_player_progressCachedBackground, key_player_progressBackground);
        fallbackKeys.put(key_chat_inAudioCacheSeekbar, key_chat_inAudioSeekbar);
        fallbackKeys.put(key_chat_outAudioCacheSeekbar, key_chat_outAudioSeekbar);
        fallbackKeys.put(key_chat_emojiSearchBackground, key_chat_emojiPanelStickerPackSelector);
        fallbackKeys.put(key_location_sendLiveLocationIcon, key_location_sendLocationIcon);
        fallbackKeys.put(key_changephoneinfo_image2, i786);
        fallbackKeys.put(key_graySectionText, i788);
        fallbackKeys.put(key_chat_inMediaIcon, key_chat_inBubble);
        fallbackKeys.put(key_chat_outMediaIcon, key_chat_outBubble);
        fallbackKeys.put(key_chat_inMediaIconSelected, key_chat_inBubbleSelected);
        fallbackKeys.put(key_chat_outMediaIconSelected, key_chat_outBubbleSelected);
        fallbackKeys.put(key_dialog_inlineProgressBackground, i785);
        fallbackKeys.put(key_dialog_inlineProgress, key_chats_menuItemIcon);
        fallbackKeys.put(key_groupcreate_spanDelete, key_chats_actionIcon);
        fallbackKeys.put(key_sharedMedia_photoPlaceholder, i785);
        fallbackKeys.put(key_chat_attachPollBackground, key_chat_attachAudioBackground);
        fallbackKeys.put(key_chats_onlineCircle, key_windowBackgroundWhiteBlueText);
        SparseIntArray sparseIntArray5 = fallbackKeys;
        int i791 = key_windowBackgroundWhiteBlueButton;
        int i792 = key_windowBackgroundWhiteValueText;
        sparseIntArray5.put(i791, i792);
        fallbackKeys.put(key_windowBackgroundWhiteBlueIcon, i792);
        fallbackKeys.put(key_undo_background, key_chat_gifSaveHintBackground);
        SparseIntArray sparseIntArray6 = fallbackKeys;
        int i793 = key_undo_cancelColor;
        int i794 = key_chat_gifSaveHintText;
        sparseIntArray6.put(i793, i794);
        fallbackKeys.put(key_undo_infoColor, i794);
        SparseIntArray sparseIntArray7 = fallbackKeys;
        int i795 = key_windowBackgroundUnchecked;
        int i796 = key_windowBackgroundWhite;
        sparseIntArray7.put(i795, i796);
        fallbackKeys.put(key_windowBackgroundChecked, i796);
        fallbackKeys.put(key_switchTrackBlue, key_switchTrack);
        fallbackKeys.put(key_switchTrackBlueChecked, key_switchTrackChecked);
        fallbackKeys.put(key_switchTrackBlueThumb, i796);
        fallbackKeys.put(key_switchTrackBlueThumbChecked, i796);
        fallbackKeys.put(key_windowBackgroundCheckText, i796);
        fallbackKeys.put(key_contextProgressInner4, key_contextProgressInner1);
        fallbackKeys.put(key_contextProgressOuter4, key_contextProgressOuter1);
        SparseIntArray sparseIntArray8 = fallbackKeys;
        int i797 = key_switchTrackBlueSelector;
        int i798 = key_listSelector;
        sparseIntArray8.put(i797, i798);
        fallbackKeys.put(key_switchTrackBlueSelectorChecked, i798);
        fallbackKeys.put(key_settings_listSelector, i798);
        SparseIntArray sparseIntArray9 = fallbackKeys;
        int i799 = key_chat_emojiBottomPanelIcon;
        int i800 = key_chat_emojiPanelIcon;
        sparseIntArray9.put(i799, i800);
        fallbackKeys.put(key_chat_emojiSearchIcon, i800);
        fallbackKeys.put(key_chat_emojiPanelStickerSetNameHighlight, key_windowBackgroundWhiteBlueText4);
        fallbackKeys.put(key_chat_emojiPanelStickerPackSelectorLine, key_chat_emojiPanelIconSelected);
        SparseIntArray sparseIntArray10 = fallbackKeys;
        int i801 = key_sheet_scrollUp;
        int i802 = key_chat_emojiPanelStickerPackSelector;
        sparseIntArray10.put(i801, i802);
        fallbackKeys.put(key_sheet_other, key_player_actionBarItems);
        fallbackKeys.put(key_dialogSearchBackground, i802);
        fallbackKeys.put(key_dialogSearchHint, i800);
        fallbackKeys.put(key_dialogSearchIcon, i800);
        SparseIntArray sparseIntArray11 = fallbackKeys;
        int i803 = key_dialogSearchText;
        int i804 = key_windowBackgroundWhiteBlackText;
        sparseIntArray11.put(i803, i804);
        fallbackKeys.put(key_buttonNeutral, key_chat_replyPanelLine);
        fallbackKeys.put(key_buttonNeutralText, i804);
        SparseIntArray sparseIntArray12 = fallbackKeys;
        int i805 = key_dialogFloatingButton;
        int i806 = key_dialogRoundCheckBox;
        sparseIntArray12.put(i805, i806);
        fallbackKeys.put(key_dialogFloatingButtonPressed, i806);
        fallbackKeys.put(key_dialogFloatingIcon, key_dialogRoundCheckBoxCheck);
        fallbackKeys.put(key_dialogShadowLine, key_chat_emojiPanelShadowLine);
        fallbackKeys.put(key_actionBarDefaultArchived, key_actionBarDefault);
        SparseIntArray sparseIntArray13 = fallbackKeys;
        int i807 = key_actionBarDefaultArchivedSelector;
        int i808 = key_actionBarDefaultSelector;
        sparseIntArray13.put(i807, i808);
        fallbackKeys.put(key_actionBarDefaultArchivedIcon, key_actionBarDefaultIcon);
        fallbackKeys.put(key_actionBarDefaultArchivedTitle, i804);
        fallbackKeys.put(key_actionBarDefaultArchivedSearch, key_actionBarDefaultSearch);
        fallbackKeys.put(key_actionBarDefaultArchivedSearchPlaceholder, key_actionBarDefaultSearchPlaceholder);
        SparseIntArray sparseIntArray14 = fallbackKeys;
        int i809 = key_chats_message_threeLines;
        int i810 = key_chats_message;
        sparseIntArray14.put(i809, i810);
        SparseIntArray sparseIntArray15 = fallbackKeys;
        int i811 = key_chats_nameMessage_threeLines;
        int i812 = key_chats_nameMessage;
        sparseIntArray15.put(i811, i812);
        fallbackKeys.put(key_chats_nameArchived, key_chats_name);
        fallbackKeys.put(key_chats_nameMessageArchived, i812);
        fallbackKeys.put(key_chats_nameMessageArchived_threeLines, i812);
        fallbackKeys.put(key_chats_messageArchived, i810);
        SparseIntArray sparseIntArray16 = fallbackKeys;
        int i813 = key_avatar_backgroundArchived;
        int i814 = key_chats_unreadCounterMuted;
        sparseIntArray16.put(i813, i814);
        SparseIntArray sparseIntArray17 = fallbackKeys;
        int i815 = key_chats_archiveBackground;
        int i816 = key_chats_actionBackground;
        sparseIntArray17.put(i815, i816);
        fallbackKeys.put(key_chats_archivePinBackground, i814);
        SparseIntArray sparseIntArray18 = fallbackKeys;
        int i817 = key_chats_archiveIcon;
        int i818 = key_chats_actionIcon;
        sparseIntArray18.put(i817, i818);
        fallbackKeys.put(key_chats_archiveText, i818);
        fallbackKeys.put(key_actionBarDefaultSubmenuItemIcon, key_dialogIcon);
        fallbackKeys.put(key_checkboxDisabled, i814);
        SparseIntArray sparseIntArray19 = fallbackKeys;
        int i819 = key_chat_status;
        int i820 = key_actionBarDefaultSubtitle;
        sparseIntArray19.put(i819, i820);
        SparseIntArray sparseIntArray20 = fallbackKeys;
        int i821 = key_chat_inGreenCall;
        int i822 = key_calls_callReceivedGreenIcon;
        sparseIntArray20.put(i821, i822);
        fallbackKeys.put(key_chat_outGreenCall, i822);
        SparseIntArray sparseIntArray21 = fallbackKeys;
        int i823 = key_actionBarTabActiveText;
        int i824 = key_actionBarDefaultTitle;
        sparseIntArray21.put(i823, i824);
        fallbackKeys.put(key_actionBarTabUnactiveText, i820);
        fallbackKeys.put(key_actionBarTabLine, i824);
        fallbackKeys.put(key_actionBarTabSelector, i808);
        fallbackKeys.put(key_profile_status, key_avatar_subtitleInProfileBlue);
        fallbackKeys.put(key_chats_menuTopBackgroundCats, key_avatar_backgroundActionBarBlue);
        fallbackKeys.put(key_chat_outLinkSelectBackground, key_chat_linkSelectBackground);
        fallbackKeys.put(key_actionBarDefaultSubmenuSeparator, key_windowBackgroundGray);
        SparseIntArray sparseIntArray22 = fallbackKeys;
        int i825 = key_chat_attachPermissionImage;
        int i826 = key_dialogTextBlack;
        sparseIntArray22.put(i825, i826);
        fallbackKeys.put(key_chat_attachPermissionMark, key_chat_sentError);
        fallbackKeys.put(key_chat_attachPermissionText, i826);
        fallbackKeys.put(key_chat_attachEmptyImage, key_emptyListPlaceholder);
        fallbackKeys.put(key_actionBarBrowser, key_actionBarDefault);
        fallbackKeys.put(key_chats_sentReadCheck, key_chats_sentCheck);
        fallbackKeys.put(key_chat_outSentCheckRead, key_chat_outSentCheck);
        fallbackKeys.put(key_chat_outSentCheckReadSelected, key_chat_outSentCheckSelected);
        fallbackKeys.put(key_chats_archivePullDownBackground, i814);
        fallbackKeys.put(key_chats_archivePullDownBackgroundActive, i816);
        fallbackKeys.put(key_avatar_backgroundArchivedHidden, key_avatar_backgroundSaved);
        fallbackKeys.put(key_featuredStickers_removeButtonText, key_featuredStickers_addButtonPressed);
        SparseIntArray sparseIntArray23 = fallbackKeys;
        int i827 = key_dialogEmptyImage;
        int i828 = key_player_time;
        sparseIntArray23.put(i827, i828);
        fallbackKeys.put(key_dialogEmptyText, i828);
        fallbackKeys.put(key_location_actionIcon, i826);
        SparseIntArray sparseIntArray24 = fallbackKeys;
        int i829 = key_location_actionActiveIcon;
        int i830 = key_windowBackgroundWhiteBlueText7;
        sparseIntArray24.put(i829, i830);
        fallbackKeys.put(key_location_actionBackground, key_dialogBackground);
        fallbackKeys.put(key_location_actionPressedBackground, key_dialogBackgroundGray);
        fallbackKeys.put(key_location_sendLocationText, i830);
        fallbackKeys.put(key_location_sendLiveLocationText, key_windowBackgroundWhiteGreenText);
        SparseIntArray sparseIntArray25 = fallbackKeys;
        int i831 = key_chat_outTextSelectionHighlight;
        int i832 = key_chat_textSelectBackground;
        sparseIntArray25.put(i831, i832);
        fallbackKeys.put(key_chat_inTextSelectionHighlight, i832);
        SparseIntArray sparseIntArray26 = fallbackKeys;
        int i833 = key_chat_TextSelectionCursor;
        sparseIntArray26.put(i833, key_chat_messagePanelCursor);
        fallbackKeys.put(key_chat_outTextSelectionCursor, i833);
        SparseIntArray sparseIntArray27 = fallbackKeys;
        int i834 = key_chat_inPollCorrectAnswer;
        int i835 = key_chat_attachLocationBackground;
        sparseIntArray27.put(i834, i835);
        fallbackKeys.put(key_chat_outPollCorrectAnswer, i835);
        SparseIntArray sparseIntArray28 = fallbackKeys;
        int i836 = key_chat_inPollWrongAnswer;
        int i837 = key_chat_attachAudioBackground;
        sparseIntArray28.put(i836, i837);
        fallbackKeys.put(key_chat_outPollWrongAnswer, i837);
        fallbackKeys.put(key_chat_editMediaButton, key_dialogFloatingButton);
        fallbackKeys.put(key_chat_attachCheckBoxBackground, key_dialogRoundCheckBox);
        fallbackKeys.put(key_pollCreateIcons, key_windowBackgroundWhiteGrayIcon);
        fallbackKeys.put(key_profile_tabText, key_windowBackgroundWhiteGrayText);
        SparseIntArray sparseIntArray29 = fallbackKeys;
        int i838 = key_profile_tabSelectedText;
        int i839 = key_windowBackgroundWhiteBlueHeader;
        sparseIntArray29.put(i838, i839);
        fallbackKeys.put(key_profile_tabSelectedLine, i839);
        fallbackKeys.put(key_profile_tabSelector, key_listSelector);
        fallbackKeys.put(key_chat_attachContactText, key_chat_attachContactBackground);
        SparseIntArray sparseIntArray30 = fallbackKeys;
        int i840 = key_chat_inPsaNameText;
        int i841 = key_avatar_nameInMessageGreen;
        sparseIntArray30.put(i840, i841);
        fallbackKeys.put(key_chat_outPsaNameText, i841);
        fallbackKeys.put(key_chat_outAdminText, key_chat_outTimeText);
        fallbackKeys.put(key_chat_outAdminSelectedText, key_chat_outTimeSelectedText);
        SparseIntArray sparseIntArray31 = fallbackKeys;
        int i842 = key_returnToCallMutedBackground;
        int i843 = key_windowBackgroundWhite;
        sparseIntArray31.put(i842, i843);
        SparseIntArray sparseIntArray32 = fallbackKeys;
        int i844 = key_dialogSwipeRemove;
        int i845 = key_avatar_backgroundRed;
        sparseIntArray32.put(i844, i845);
        fallbackKeys.put(key_chat_inReactionButtonBackground, key_chat_inLoader);
        fallbackKeys.put(key_chat_outReactionButtonBackground, key_chat_outLoader);
        fallbackKeys.put(key_chat_reactionServiceButtonBackgroundSelected, key_chat_outBubble);
        fallbackKeys.put(key_chat_reactionServiceButtonTextSelected, key_chat_messageTextOut);
        SparseIntArray sparseIntArray33 = fallbackKeys;
        int i846 = key_chat_inReactionButtonText;
        sparseIntArray33.put(i846, key_chat_inPreviewInstantText);
        fallbackKeys.put(key_chat_outReactionButtonText, key_chat_outPreviewInstantText);
        fallbackKeys.put(key_chat_inReactionButtonTextSelected, i843);
        fallbackKeys.put(key_chat_outReactionButtonTextSelected, i843);
        fallbackKeys.put(key_dialogReactionMentionBackground, key_voipgroup_mutedByAdminGradient2);
        fallbackKeys.put(key_topics_unreadCounter, key_chats_unreadCounter);
        fallbackKeys.put(key_topics_unreadCounterMuted, key_chats_message);
        fallbackKeys.put(key_avatar_background2Saved, key_avatar_backgroundSaved);
        fallbackKeys.put(key_avatar_background2Red, i845);
        fallbackKeys.put(key_avatar_background2Orange, key_avatar_backgroundOrange);
        fallbackKeys.put(key_avatar_background2Violet, key_avatar_backgroundViolet);
        fallbackKeys.put(key_avatar_background2Green, key_avatar_backgroundGreen);
        fallbackKeys.put(key_avatar_background2Cyan, key_avatar_backgroundCyan);
        fallbackKeys.put(key_avatar_background2Blue, key_avatar_backgroundBlue);
        fallbackKeys.put(key_avatar_background2Pink, key_avatar_backgroundPink);
        fallbackKeys.put(key_chats_date_bold, key_chats_date);
        fallbackKeys.put(key_statisticChartLine_orange, key_color_orange);
        fallbackKeys.put(key_statisticChartLine_blue, key_color_blue);
        fallbackKeys.put(key_statisticChartLine_red, key_color_red);
        fallbackKeys.put(key_statisticChartLine_lightblue, key_color_lightblue);
        fallbackKeys.put(key_statisticChartLine_golden, key_color_yellow);
        SparseIntArray sparseIntArray34 = fallbackKeys;
        int i847 = key_statisticChartLine_purple;
        int i848 = key_color_purple;
        sparseIntArray34.put(i847, i848);
        fallbackKeys.put(key_statisticChartLine_indigo, i848);
        fallbackKeys.put(key_statisticChartLine_cyan, key_color_cyan);
        SparseIntArray sparseIntArray35 = fallbackKeys;
        int i849 = key_actionBarActionModeReaction;
        int i850 = key_windowBackgroundGray;
        sparseIntArray35.put(i849, i850);
        fallbackKeys.put(key_actionBarActionModeReactionText, i846);
        SparseIntArray sparseIntArray36 = fallbackKeys;
        int i851 = key_table_background;
        sparseIntArray36.put(i851, key_graySection);
        SparseIntArray sparseIntArray37 = fallbackKeys;
        int i852 = key_table_border;
        sparseIntArray37.put(i852, key_divider);
        fallbackKeys.put(key_chat_inTableBackground, i851);
        SparseIntArray sparseIntArray38 = fallbackKeys;
        int i853 = key_chat_outTableBackground;
        int i854 = key_chat_outCodeBackground;
        sparseIntArray38.put(i853, i854);
        fallbackKeys.put(key_chat_inTableBorder, i852);
        fallbackKeys.put(key_chat_outTableBorder, i852);
        fallbackKeys.put(key_chat_outArticleCodeBackground, i854);
        SparseIntArray sparseIntArray39 = fallbackKeys;
        int i855 = key_share_icon;
        int i856 = key_windowBackgroundWhiteBlackText;
        sparseIntArray39.put(i855, i856);
        fallbackKeys.put(key_share_linkBackground, i850);
        fallbackKeys.put(key_share_linkText, i856);
        fallbackKeys.put(key_glass_defaultIcon, key_chat_messagePanelIcons);
        fallbackKeys.put(key_glass_defaultText, key_chat_messagePanelText);
        SparseIntArray sparseIntArray40 = fallbackKeys;
        int i857 = key_glass_targetMainTabs;
        int i858 = key_dialogBackground;
        sparseIntArray40.put(i857, i858);
        fallbackKeys.put(key_glass_targetMainTopPanel, i858);
        SparseIntArray sparseIntArray41 = fallbackKeys;
        int i859 = key_glass_tabSelected;
        int i860 = key_chat_messagePanelSend;
        sparseIntArray41.put(i859, i860);
        fallbackKeys.put(key_glass_tabSelectedText, i860);
        fallbackKeys.put(key_glass_tabUnselected, i856);
        fallbackKeys.put(key_actionBarDefaultTitle, i856);
        fallbackKeys.put(key_telegram_color_dialogsLogo, i856);
        fallbackKeys.put(key_profile_title, i856);
        fallbackKeys.put(key_telegram_color, i860);
        SparseIntArray sparseIntArray42 = fallbackKeys;
        int i861 = key_telegram_color_text;
        sparseIntArray42.put(i861, key_windowBackgroundWhiteBlueText4);
        fallbackKeys.put(key_chat_msgIvButtonDefaultInText, key_chat_messageTextIn);
        SparseIntArray sparseIntArray43 = fallbackKeys;
        int i862 = key_chat_msgIvButtonPrimaryIn;
        int i863 = key_featuredStickers_addButton;
        sparseIntArray43.put(i862, i863);
        SparseIntArray sparseIntArray44 = fallbackKeys;
        int i864 = key_chat_msgIvButtonPrimaryInPressed;
        int i865 = key_featuredStickers_addButtonPressed;
        sparseIntArray44.put(i864, i865);
        SparseIntArray sparseIntArray45 = fallbackKeys;
        int i866 = key_chat_msgIvButtonPrimaryInText;
        int i867 = key_featuredStickers_buttonText;
        sparseIntArray45.put(i866, i867);
        SparseIntArray sparseIntArray46 = fallbackKeys;
        int i868 = key_chat_msgIvButtonDangerInText;
        int i869 = key_avatar_nameInMessageRed;
        sparseIntArray46.put(i868, i869);
        SparseIntArray sparseIntArray47 = fallbackKeys;
        int i870 = key_chat_msgIvButtonSuccessInText;
        int i871 = key_avatar_nameInMessageGreen;
        sparseIntArray47.put(i870, i871);
        fallbackKeys.put(key_chat_msgIvButtonDefaultInlineInText, i861);
        fallbackKeys.put(key_chat_msgIvButtonDefaultOutText, key_chat_messageTextOut);
        fallbackKeys.put(key_chat_msgIvButtonPrimaryOut, i863);
        fallbackKeys.put(key_chat_msgIvButtonPrimaryOutPressed, i865);
        fallbackKeys.put(key_chat_msgIvButtonPrimaryOutText, i867);
        fallbackKeys.put(key_chat_msgIvButtonDangerOutText, i869);
        fallbackKeys.put(key_chat_msgIvButtonSuccessOutText, i871);
        fallbackKeys.put(key_chat_msgIvButtonDefaultInlineOutText, i861);
        int i872 = 0;
        while (true) {
            int[] iArr = keys_avatar_background;
            if (i872 >= iArr.length) {
                break;
            }
            themeAccentExclusionKeys.add(Integer.valueOf(iArr[i872]));
            i872++;
        }
        int i873 = 0;
        while (true) {
            int[] iArr2 = keys_avatar_background2;
            if (i873 >= iArr2.length) {
                break;
            }
            themeAccentExclusionKeys.add(Integer.valueOf(iArr2[i873]));
            i873++;
        }
        int i874 = 0;
        while (true) {
            int[] iArr3 = keys_avatar_nameInMessage;
            if (i874 >= iArr3.length) {
                break;
            }
            themeAccentExclusionKeys.add(Integer.valueOf(iArr3[i874]));
            i874++;
        }
        int i875 = 0;
        while (true) {
            int[] iArr4 = keys_colors;
            if (i875 >= iArr4.length) {
                break;
            }
            themeAccentExclusionKeys.add(Integer.valueOf(iArr4[i875]));
            i875++;
        }
        themeAccentExclusionKeys.add(Integer.valueOf(key_chat_attachGalleryBackground));
        themeAccentExclusionKeys.add(Integer.valueOf(key_statisticChartLine_blue));
        themeAccentExclusionKeys.add(Integer.valueOf(key_statisticChartLine_green));
        themeAccentExclusionKeys.add(Integer.valueOf(key_statisticChartLine_red));
        themeAccentExclusionKeys.add(Integer.valueOf(key_statisticChartLine_golden));
        themeAccentExclusionKeys.add(Integer.valueOf(key_statisticChartLine_lightblue));
        themeAccentExclusionKeys.add(Integer.valueOf(key_statisticChartLine_lightgreen));
        themeAccentExclusionKeys.add(Integer.valueOf(key_statisticChartLine_orange));
        themeAccentExclusionKeys.add(Integer.valueOf(key_statisticChartLine_indigo));
        themeAccentExclusionKeys.add(Integer.valueOf(key_chat_inCodeBackground));
        themeAccentExclusionKeys.add(Integer.valueOf(key_chat_inTableBackground));
        themeAccentExclusionKeys.add(Integer.valueOf(key_chat_outTableBackground));
        themeAccentExclusionKeys.add(Integer.valueOf(key_chat_inTableBorder));
        themeAccentExclusionKeys.add(Integer.valueOf(key_chat_outTableBorder));
        themeAccentExclusionKeys.add(Integer.valueOf(key_chat_inDivider));
        themeAccentExclusionKeys.add(Integer.valueOf(key_chat_inArticleCodeBackground));
        themeAccentExclusionKeys.add(Integer.valueOf(key_chat_outArticleCodeBackground));
        themeAccentExclusionKeys.add(Integer.valueOf(key_chat_inArticleCodeScrollbarBackground));
        themeAccentExclusionKeys.add(Integer.valueOf(key_chat_inArticleCodeScrollbar));
        themeAccentExclusionKeys.add(Integer.valueOf(key_chat_outArticleCodeScrollbarBackground));
        themeAccentExclusionKeys.add(Integer.valueOf(key_chat_outArticleCodeScrollbar));
        themeAccentExclusionKeys.add(Integer.valueOf(key_chat_inArticleDetailsArrow));
        themeAccentExclusionKeys.add(Integer.valueOf(key_chat_outArticleDetailsArrow));
        themeAccentExclusionKeys.add(Integer.valueOf(key_chat_inArticleDetailsLine));
        themeAccentExclusionKeys.add(Integer.valueOf(key_chat_outArticleDetailsLine));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_checkMenu));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_muteButton));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_muteButton2));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_muteButton3));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_searchText));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_searchPlaceholder));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_searchBackground));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_leaveCallMenu));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_scrollUp));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_soundButton));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_soundButtonActive));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_soundButtonActiveScrolled));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_soundButton2));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_soundButtonActive2));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_soundButtonActive2Scrolled));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_leaveButton));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_leaveButtonScrolled));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_connectingProgress));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_disabledButton));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_rtmpButton));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_disabledButtonActive));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_disabledButtonActiveScrolled));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_unmuteButton));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_unmuteButton2));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_actionBarUnscrolled));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_listViewBackgroundUnscrolled));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_lastSeenTextUnscrolled));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_mutedIconUnscrolled));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_actionBar));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_actionBarItems));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_actionBarItemsSelector));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_mutedByAdminIcon));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_mutedIcon));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_lastSeenText));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_nameText));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_listViewBackground));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_listeningText));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_speakingText));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_listSelector));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_inviteMembersBackground));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_dialogBackground));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_overlayGreen1));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_overlayGreen2));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_overlayBlue1));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_overlayBlue2));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_topPanelGreen1));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_topPanelGreen2));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_topPanelBlue1));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_topPanelBlue2));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_topPanelGray));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_overlayAlertGradientMuted));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_overlayAlertGradientMuted2));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_overlayAlertGradientUnmuted));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_overlayAlertGradientUnmuted2));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_overlayAlertMutedByAdmin));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_overlayAlertMutedByAdmin2));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_mutedByAdminGradient));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_mutedByAdminGradient2));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_mutedByAdminGradient3));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_mutedByAdminMuteButton));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_mutedByAdminMuteButtonDisabled));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_windowBackgroundWhiteInputField));
        themeAccentExclusionKeys.add(Integer.valueOf(key_voipgroup_windowBackgroundWhiteInputFieldActivated));
        themeAccentExclusionKeys.add(Integer.valueOf(key_premiumGradient0));
        themeAccentExclusionKeys.add(Integer.valueOf(key_premiumGradient1));
        themeAccentExclusionKeys.add(Integer.valueOf(key_premiumGradient2));
        themeAccentExclusionKeys.add(Integer.valueOf(key_premiumGradient3));
        themeAccentExclusionKeys.add(Integer.valueOf(key_premiumGradient4));
        themeAccentExclusionKeys.add(Integer.valueOf(key_premiumGradientBackground1));
        themeAccentExclusionKeys.add(Integer.valueOf(key_premiumGradientBackground2));
        themeAccentExclusionKeys.add(Integer.valueOf(key_premiumGradientBackground3));
        themeAccentExclusionKeys.add(Integer.valueOf(key_premiumGradientBackground4));
        themeAccentExclusionKeys.add(Integer.valueOf(key_premiumStartSmallStarsColor));
        themeAccentExclusionKeys.add(Integer.valueOf(key_premiumStarGradient1));
        themeAccentExclusionKeys.add(Integer.valueOf(key_premiumStarGradient2));
        themeAccentExclusionKeys.add(Integer.valueOf(key_stories_circle1));
        themeAccentExclusionKeys.add(Integer.valueOf(key_stories_circle2));
        themeAccentExclusionKeys.add(Integer.valueOf(key_stories_circle_dialog1));
        themeAccentExclusionKeys.add(Integer.valueOf(key_stories_circle_dialog2));
        themeAccentExclusionKeys.add(Integer.valueOf(key_stories_circle_closeFriends1));
        themeAccentExclusionKeys.add(Integer.valueOf(key_stories_circle_closeFriends2));
        themes = new ArrayList();
        otherThemes = new ArrayList();
        themesDict = new HashMap();
        currentColorsNoAccent = new SparseIntArray();
        currentColors = new SparseIntArray();
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        ThemeInfo themeInfo5 = new ThemeInfo();
        themeInfo5.name = "Blue";
        themeInfo5.assetName = "bluebubbles.attheme";
        themeInfo5.previewBackgroundColor = -6963476;
        themeInfo5.previewInColor = -1;
        themeInfo5.previewOutColor = -3086593;
        themeInfo5.firstAccentIsDefault = true;
        themeInfo5.currentAccentId = DEFALT_THEME_ACCENT_ID;
        themeInfo5.sortIndex = 1;
        themeInfo5.setAccentColorOptions(new int[]{-10972987, -14444461, -3252606, -8428605, -14380627, -14050257, -7842636, -13464881, -12342073, -11359164, -3317869, -2981834, -8165684, -3256745, -2904512, -8681301}, new int[]{-4660851, -328756, -1572, -4108434, -3031781, -1335, -198952, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, -853047, -264993, 0, 0, -135756, -198730, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, -2104672, -937328, -2637335, -2639714, -1270157, -3428124, -6570777, -7223828, -6567550, -1793599, -1855875, -4674838, -1336199, -2900876, -6247730}, new int[]{0, -4532067, -1257580, -1524266, -1646910, -1519483, -1324823, -4138509, -4202516, -2040429, -1458474, -1256030, -3814930, -1000039, -1450082, -3485987}, new int[]{0, -1909081, -1592444, -2969879, -2439762, -1137033, -2119471, -6962197, -4857383, -4270699, -3364639, -2117514, -5000734, -1598028, -2045813, -5853742}, new int[]{0, -6371440, -1319256, -1258616, -1712961, -1186647, -1193816, -4467224, -4203544, -3023977, -1061929, -1255788, -2113811, -806526, -1715305, -3485976}, new int[]{99, 9, 10, 11, 12, 13, 14, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new String[]{"", "p-pXcflrmFIBAAAAvXYQk-mCwZU", "JqSUrO0-mFIBAAAAWwTvLzoWGQI", "O-wmAfBPSFADAAAA4zINVfD_bro", "RepJ5uE_SVABAAAAr4d0YhgB850", "-Xc-np9y2VMCAAAARKr0yNNPYW0", "fqv01SQemVIBAAAApND8LDRUhRU", "fqv01SQemVIBAAAApND8LDRUhRU", "RepJ5uE_SVABAAAAr4d0YhgB850", "lp0prF8ISFAEAAAA_p385_CvG0w", "heptcj-hSVACAAAAC9RrMzOa-cs", "PllZ-bf_SFAEAAAA8crRfwZiDNg", "dhf9pceaQVACAAAAbzdVo4SCiZA", "Ujx2TFcJSVACAAAARJ4vLa50MkM", "p-pXcflrmFIBAAAAvXYQk-mCwZU", "dk_wwlghOFACAAAAfz9xrxi6euw"}, new int[]{0, 180, 45, 0, 45, 180, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 52, 46, 57, 45, 64, 52, 35, 36, 41, 50, 50, 35, 38, 37, 30});
        sortAccents(themeInfo5);
        ArrayList arrayList = themes;
        defaultTheme = themeInfo5;
        currentDayTheme = themeInfo5;
        arrayList.add(themeInfo5);
        themesDict.put("Blue", themeInfo5);
        ThemeInfo themeInfo6 = new ThemeInfo();
        themeInfo6.name = "Dark Blue";
        themeInfo6.assetName = "darkblue.attheme";
        themeInfo6.previewBackgroundColor = -10523006;
        themeInfo6.previewInColor = -9009508;
        themeInfo6.previewOutColor = -8214301;
        themeInfo6.sortIndex = 3;
        themeInfo6.setAccentColorOptions(new int[]{-7177260, -9860357, -14440464, -8687151, -9848491, -14053142, -9403671, -10044691, -13203974, -12138259, -10179489, -1344335, -1142742, -6127120, -2931932, -1131212, -8417365, -13270557}, new int[]{-6464359, -10267323, -13532789, -5413850, -11898828, -13410942, -13215889, -10914461, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-10465880, -9937588, -14983040, -6736562, -14197445, -13534568, -13144441, -10587280, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-14213586, -15263198, -16310753, -15724781, -15853551, -16051428, -14868183, -14668758, -15854566, -15326427, -15327979, -14411490, -14345453, -14738135, -14543346, -14212843, -15263205, -15854566}, new int[]{-15659501, -14277074, -15459034, -14542297, -14735336, -15129808, -15591910, -15459810, -15260623, -15853800, -15259879, -14477540, -14674936, -15461604, -13820650, -15067635, -14605528, -15260623}, new int[]{-13951445, -15395557, -15985382, -15855853, -16050417, -15525854, -15260627, -15327189, -15788258, -14799314, -15458796, -13952727, -13754603, -14081231, -14478324, -14081004, -15197667, -15788258}, new int[]{-15330777, -15066858, -15915220, -14213847, -15262439, -15260879, -15657695, -16443625, -15459285, -15589601, -14932454, -14740451, -15002870, -15264997, -13821660, -14805234, -14605784, -15459285}, new int[]{11, 12, 13, 14, 15, 16, 17, 18, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, new String[]{"O-wmAfBPSFADAAAA4zINVfD_bro", "RepJ5uE_SVABAAAAr4d0YhgB850", "dk_wwlghOFACAAAAfz9xrxi6euw", "9LW_RcoOSVACAAAAFTk3DTyXN-M", "PllZ-bf_SFAEAAAA8crRfwZiDNg", "-Xc-np9y2VMCAAAARKr0yNNPYW0", "kO4jyq55SFABAAAA0WEpcLfahXk", "CJNyxPMgSVAEAAAAvW9sMwc51cw", "fqv01SQemVIBAAAApND8LDRUhRU", "RepJ5uE_SVABAAAAr4d0YhgB850", "CJNyxPMgSVAEAAAAvW9sMwc51cw", "9LW_RcoOSVACAAAAFTk3DTyXN-M", "9GcNVISdSVADAAAAUcw5BYjELW4", "F5oWoCs7QFACAAAAgf2bD_mg8Bw", "9ShF73d1MFIIAAAAjWnm8_ZMe8Q", "3rX-PaKbSFACAAAAEiHNvcEm6X4", "dk_wwlghOFACAAAAfz9xrxi6euw", "fqv01SQemVIBAAAApND8LDRUhRU"}, new int[]{225, 45, 225, 135, 45, 225, 45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{40, 40, 31, 50, 25, 34, 35, 35, 38, 29, 24, 34, 34, 31, 29, 37, 21, 38});
        sortAccents(themeInfo6);
        themes.add(themeInfo6);
        HashMap map = themesDict;
        currentNightTheme = themeInfo6;
        map.put("Dark Blue", themeInfo6);
        ThemeInfo themeInfo7 = new ThemeInfo();
        themeInfo7.name = "Arctic Blue";
        themeInfo7.assetName = "arctic.attheme";
        themeInfo7.previewBackgroundColor = -1971728;
        themeInfo7.previewInColor = -1;
        themeInfo7.previewOutColor = -9657877;
        themeInfo7.sortIndex = 5;
        themeInfo7.setAccentColorOptions(new int[]{-12537374, -12472227, -3240928, -11033621, -2194124, -3382903, -13332245, -12342073, -11359164, -3317869, -2981834, -8165684, -3256745, -2904512, -8681301}, new int[]{-13525046, -14113959, -7579073, -13597229, -3581840, -8883763, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-11616542, -9716647, -6400452, -12008744, -2592697, -4297041, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-3808528, -2433367, -2700891, -1838093, -1120848, -1712148, -2037779, -4202261, -4005713, -1058332, -925763, -1975316, -1189672, -1318451, -2302235}, new int[]{-1510157, -4398164, -1647697, -3610898, -1130838, -1980692, -4270093, -4202261, -3415654, -1259815, -1521765, -4341268, -1127744, -1318219, -3945761}, new int[]{-4924688, -3283031, -1523567, -2494477, -1126510, -595210, -2037517, -3478548, -4661623, -927514, -796762, -2696971, -1188403, -1319735, -1577487}, new int[]{-3149585, -5714021, -1978209, -4925720, -1134713, -1718833, -3613709, -5317397, -3218014, -999207, -2116466, -4343054, -931397, -1583186, -3815718}, new int[]{9, 10, 11, 12, 13, 14, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new String[]{"MIo6r0qGSFAFAAAAtL8TsDzNX60", "dhf9pceaQVACAAAAbzdVo4SCiZA", "fqv01SQemVIBAAAApND8LDRUhRU", "p-pXcflrmFIBAAAAvXYQk-mCwZU", "JqSUrO0-mFIBAAAAWwTvLzoWGQI", "F5oWoCs7QFACAAAAgf2bD_mg8Bw", "fqv01SQemVIBAAAApND8LDRUhRU", "RepJ5uE_SVABAAAAr4d0YhgB850", "PllZ-bf_SFAEAAAA8crRfwZiDNg", "pgJfpFNRSFABAAAACDT8s5sEjfc", "ptuUd96JSFACAAAATobI23sPpz0", "dhf9pceaQVACAAAAbzdVo4SCiZA", "JqSUrO0-mFIBAAAAWwTvLzoWGQI", "9iklpvIPQVABAAAAORQXKur_Eyc", "F5oWoCs7QFACAAAAgf2bD_mg8Bw"}, new int[]{315, 315, 225, 315, 0, 180, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{50, 50, 58, 47, 46, 50, 49, 46, 51, 50, 49, 34, 54, 50, 40});
        sortAccents(themeInfo7);
        themes.add(themeInfo7);
        themesDict.put("Arctic Blue", themeInfo7);
        ThemeInfo themeInfo8 = new ThemeInfo();
        themeInfo8.name = "Day";
        themeInfo8.assetName = "day.attheme";
        themeInfo8.previewBackgroundColor = -1;
        themeInfo8.previewInColor = -1315084;
        themeInfo8.previewOutColor = -8604930;
        themeInfo8.sortIndex = 2;
        themeInfo8.setAccentColorOptions(new int[]{-11099447, -3379581, -3109305, -3382174, -7963438, -11759137, -11029287, -11226775, -2506945, -3382174, -3379581, -6587438, -2649788, -8681301}, new int[]{-10125092, -9671214, -3451775, -3978678, -10711329, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-12664362, -3642988, -2383569, -3109317, -11422261, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, null, null, new int[]{9, 10, 11, 12, 13, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new String[]{"", "", "", "", "", "", "", "", "", "", "", "", "", ""}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        sortAccents(themeInfo8);
        themes.add(themeInfo8);
        themesDict.put("Day", themeInfo8);
        ThemeInfo themeInfo9 = new ThemeInfo();
        themeInfo9.name = "Night";
        themeInfo9.assetName = "night.attheme";
        themeInfo9.previewBackgroundColor = -11315623;
        themeInfo9.previewInColor = -9143676;
        themeInfo9.previewOutColor = -9067802;
        themeInfo9.sortIndex = 4;
        themeInfo9.setAccentColorOptions(new int[]{-9781697, -7505693, -2204034, -10913816, -2375398, -12678921, -11881005, -11880383, -2534026, -1934037, -7115558, -3128522, -1528292, -8812381}, new int[]{-7712108, -4953061, -5288081, -14258547, -9154889, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-9939525, -5948598, -10335844, -13659747, -14054507, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-15330532, -14806760, -15791344, -16184308, -16313063, -15921641, -15656164, -15986420, -15856883, -14871025, -16185078, -14937584, -14869736, -15855598}, new int[]{-14673881, -15724781, -15002342, -15458526, -15987697, -16184820, -16118258, -16250616, -15067624, -15527923, -14804447, -15790836, -15987960, -16316665}, new int[]{-15856877, -14608861, -15528430, -15921391, -15722209, -15197144, -15458015, -15591406, -15528431, -15068401, -16053749, -15594229, -15395825, -15724012}, new int[]{-14804694, -15658986, -14609382, -15656421, -16118509, -15855854, -16315381, -16052981, -14544354, -15791092, -15659241, -16316922, -15988214, -16185077}, new int[]{9, 10, 11, 12, 13, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new String[]{"YIxYGEALQVADAAAAA3QbEH0AowY", "9LW_RcoOSVACAAAAFTk3DTyXN-M", "O-wmAfBPSFADAAAA4zINVfD_bro", "F5oWoCs7QFACAAAAgf2bD_mg8Bw", "-Xc-np9y2VMCAAAARKr0yNNPYW0", "fqv01SQemVIBAAAApND8LDRUhRU", "F5oWoCs7QFACAAAAgf2bD_mg8Bw", "ptuUd96JSFACAAAATobI23sPpz0", "p-pXcflrmFIBAAAAvXYQk-mCwZU", "Nl8Pg2rBQVACAAAA25Lxtb8SDp0", "dhf9pceaQVACAAAAbzdVo4SCiZA", "9GcNVISdSVADAAAAUcw5BYjELW4", "9LW_RcoOSVACAAAAFTk3DTyXN-M", "dk_wwlghOFACAAAAfz9xrxi6euw"}, new int[]{45, 135, 0, 180, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{34, 47, 52, 48, 54, 50, 37, 56, 48, 49, 40, 64, 38, 48});
        sortAccents(themeInfo9);
        themes.add(themeInfo9);
        themesDict.put("Night", themeInfo9);
        String str = null;
        String string = sharedPreferences.getString("themes2", null);
        int i876 = 1;
        if (sharedPreferences.getInt("remote_version", 0) == 1) {
            int i877 = 0;
            while (i877 < 4) {
                long[] jArr = remoteThemesHash;
                StringBuilder sb = new StringBuilder();
                sb.append("2remoteThemesHash");
                sb.append(i877 != 0 ? Integer.valueOf(i877) : "");
                jArr[i877] = sharedPreferences.getLong(sb.toString(), 0L);
                int[] iArr5 = lastLoadingThemesTime;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("lastLoadingThemesTime");
                sb2.append(i877 != 0 ? Integer.valueOf(i877) : "");
                iArr5[i877] = sharedPreferences.getInt(sb2.toString(), 0);
                i877++;
            }
            i876 = 1;
        }
        sharedPreferences.edit().putInt("remote_version", i876).apply();
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i878 = 0; i878 < jSONArray.length(); i878++) {
                    ThemeInfo themeInfoCreateWithJson = ThemeInfo.createWithJson(jSONArray.getJSONObject(i878));
                    if (themeInfoCreateWithJson != null) {
                        otherThemes.add(themeInfoCreateWithJson);
                        themes.add(themeInfoCreateWithJson);
                        themesDict.put(themeInfoCreateWithJson.getKey(), themeInfoCreateWithJson);
                        themeInfoCreateWithJson.loadWallpapers(sharedPreferences);
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            String string2 = sharedPreferences.getString("themes", null);
            if (!TextUtils.isEmpty(string2)) {
                for (String str2 : string2.split("&")) {
                    ThemeInfo themeInfoCreateWithString = ThemeInfo.createWithString(str2);
                    if (themeInfoCreateWithString != null) {
                        otherThemes.add(themeInfoCreateWithString);
                        themes.add(themeInfoCreateWithString);
                        themesDict.put(themeInfoCreateWithString.getKey(), themeInfoCreateWithString);
                    }
                }
                saveOtherThemes(true, true);
                sharedPreferences.edit().remove("themes").commit();
            }
        }
        sortThemes();
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        try {
            ThemeInfo themeInfo10 = (ThemeInfo) themesDict.get("Dark Blue");
            String string3 = globalMainSettings.getString("theme", null);
            if ("Default".equals(string3)) {
                themeInfo = (ThemeInfo) themesDict.get("Blue");
                themeInfo.currentAccentId = DEFALT_THEME_ACCENT_ID;
            } else if ("Dark".equals(string3)) {
                themeInfo10.currentAccentId = 9;
                themeInfo = themeInfo10;
            } else if (string3 != null) {
                themeInfo = (ThemeInfo) themesDict.get(string3);
                if (themeInfo != null && !sharedPreferences.contains("lastDayTheme")) {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString("lastDayTheme", themeInfo.getKey());
                    editorEdit.commit();
                }
            } else {
                themeInfo = null;
            }
            String string4 = globalMainSettings.getString("nighttheme", null);
            if ("Default".equals(string4)) {
                themeInfo = (ThemeInfo) themesDict.get("Blue");
                themeInfo.currentAccentId = DEFALT_THEME_ACCENT_ID;
            } else if ("Dark".equals(string4)) {
                currentNightTheme = themeInfo10;
                themeInfo10.currentAccentId = 9;
            } else if (string4 != null && (themeInfo2 = (ThemeInfo) themesDict.get(string4)) != null) {
                currentNightTheme = themeInfo2;
            }
            if (currentNightTheme != null && !sharedPreferences.contains("lastDarkTheme")) {
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                editorEdit2.putString("lastDarkTheme", currentNightTheme.getKey());
                editorEdit2.commit();
            }
            SharedPreferences.Editor editorEdit3 = null;
            SharedPreferences.Editor editorEdit4 = null;
            for (ThemeInfo themeInfo11 : themesDict.values()) {
                if (themeInfo11.assetName == null || themeInfo11.accentBaseColor == 0) {
                    themeInfo = themeInfo;
                    editorEdit3 = editorEdit3;
                } else {
                    String string5 = sharedPreferences.getString("accents_" + themeInfo11.assetName, str);
                    themeInfo11.currentAccentId = sharedPreferences.getInt("accent_current_" + themeInfo11.assetName, themeInfo11.firstAccentIsDefault ? DEFALT_THEME_ACCENT_ID : 0);
                    ArrayList arrayList2 = new ArrayList();
                    if (!TextUtils.isEmpty(string5)) {
                        try {
                            SerializedData serializedData = new SerializedData(Base64.decode(string5, i3));
                            boolean z2 = true;
                            int int32 = serializedData.readInt32(true);
                            int int33 = serializedData.readInt32(true);
                            int i879 = 0;
                            while (i879 < int33) {
                                try {
                                    ThemeAccent themeAccent = new ThemeAccent();
                                    themeAccent.id = serializedData.readInt32(z2);
                                    themeAccent.accentColor = serializedData.readInt32(z2);
                                    if (int32 >= 9) {
                                        themeAccent.accentColor2 = serializedData.readInt32(z2);
                                    }
                                    themeAccent.parentTheme = themeInfo11;
                                    themeAccent.myMessagesAccentColor = serializedData.readInt32(true);
                                    themeAccent.myMessagesGradientAccentColor1 = serializedData.readInt32(true);
                                    if (int32 >= 7) {
                                        themeAccent.myMessagesGradientAccentColor2 = serializedData.readInt32(true);
                                        themeAccent.myMessagesGradientAccentColor3 = serializedData.readInt32(true);
                                    }
                                    if (int32 >= 8) {
                                        z = true;
                                        themeAccent.myMessagesAnimated = serializedData.readBool(true);
                                    } else {
                                        z = true;
                                    }
                                    if (int32 >= 3) {
                                        themeAccent.backgroundOverrideColor = serializedData.readInt64(z);
                                    } else {
                                        themeAccent.backgroundOverrideColor = serializedData.readInt32(z);
                                    }
                                    if (int32 >= 2) {
                                        themeAccent.backgroundGradientOverrideColor1 = serializedData.readInt64(z);
                                    } else {
                                        themeAccent.backgroundGradientOverrideColor1 = serializedData.readInt32(z);
                                    }
                                    ?? r15 = z;
                                    if (int32 >= 6) {
                                        themeAccent.backgroundGradientOverrideColor2 = serializedData.readInt64(z);
                                        themeAccent.backgroundGradientOverrideColor3 = serializedData.readInt64(z);
                                        r15 = 1;
                                    }
                                    if (int32 >= r15) {
                                        themeAccent.backgroundRotation = serializedData.readInt32(r15);
                                    }
                                    if (int32 >= 4) {
                                        serializedData.readInt64(r15);
                                        themeAccent.patternIntensity = (float) serializedData.readDouble(r15);
                                        themeAccent.patternMotion = serializedData.readBool(r15);
                                        i = 5;
                                        if (int32 >= 5) {
                                            themeAccent.patternSlug = serializedData.readString(r15);
                                            i = 5;
                                        }
                                    } else {
                                        i = 5;
                                    }
                                    if (int32 >= i && serializedData.readBool(true)) {
                                        themeAccent.account = serializedData.readInt32(true);
                                        themeAccent.info = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                                    }
                                    TLRPC.TL_theme tL_theme = themeAccent.info;
                                    if (tL_theme != null) {
                                        themeAccent.isDefault = tL_theme.isDefault;
                                    }
                                    themeInfo11.themeAccentsMap.put(themeAccent.id, themeAccent);
                                    TLRPC.TL_theme tL_theme2 = themeAccent.info;
                                    if (tL_theme2 != null) {
                                        themeInfo11.accentsByThemeId.put(tL_theme2.id, themeAccent);
                                    }
                                    arrayList2.add(themeAccent);
                                    themeInfo11.lastAccentId = Math.max(themeInfo11.lastAccentId, themeAccent.id);
                                    i879++;
                                    themeInfo = themeInfo;
                                    editorEdit3 = editorEdit3;
                                    z2 = true;
                                } catch (Throwable th) {
                                    throw new RuntimeException(th);
                                }
                            }
                            editor = editorEdit3;
                            themeInfo4 = themeInfo;
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            throw new RuntimeException(th2);
                        }
                    } else {
                        editor = editorEdit3;
                        themeInfo4 = themeInfo;
                        String str3 = "accent_for_" + themeInfo11.assetName;
                        int i880 = globalMainSettings.getInt(str3, 0);
                        if (i880 != 0) {
                            if (editor == null) {
                                editorEdit3 = globalMainSettings.edit();
                                editorEdit4 = sharedPreferences.edit();
                            } else {
                                editorEdit3 = editor;
                            }
                            editorEdit3.remove(str3);
                            int size = themeInfo11.themeAccents.size();
                            int i881 = 0;
                            while (true) {
                                if (i881 < size) {
                                    ThemeAccent themeAccent2 = (ThemeAccent) themeInfo11.themeAccents.get(i881);
                                    if (themeAccent2.accentColor == i880) {
                                        themeInfo11.currentAccentId = themeAccent2.id;
                                        break;
                                    }
                                    i881++;
                                } else {
                                    ThemeAccent themeAccent3 = new ThemeAccent();
                                    themeAccent3.id = 100;
                                    themeAccent3.accentColor = i880;
                                    themeAccent3.parentTheme = themeInfo11;
                                    themeInfo11.themeAccentsMap.put(100, themeAccent3);
                                    arrayList2.add(0, themeAccent3);
                                    themeInfo11.currentAccentId = 100;
                                    themeInfo11.lastAccentId = 101;
                                    SerializedData serializedData2 = new SerializedData(72);
                                    serializedData2.writeInt32(9);
                                    serializedData2.writeInt32(1);
                                    serializedData2.writeInt32(themeAccent3.id);
                                    serializedData2.writeInt32(themeAccent3.accentColor);
                                    serializedData2.writeInt32(themeAccent3.myMessagesAccentColor);
                                    serializedData2.writeInt32(themeAccent3.myMessagesGradientAccentColor1);
                                    serializedData2.writeInt32(themeAccent3.myMessagesGradientAccentColor2);
                                    serializedData2.writeInt32(themeAccent3.myMessagesGradientAccentColor3);
                                    serializedData2.writeBool(themeAccent3.myMessagesAnimated);
                                    serializedData2.writeInt64(themeAccent3.backgroundOverrideColor);
                                    serializedData2.writeInt64(themeAccent3.backgroundGradientOverrideColor1);
                                    serializedData2.writeInt64(themeAccent3.backgroundGradientOverrideColor2);
                                    serializedData2.writeInt64(themeAccent3.backgroundGradientOverrideColor3);
                                    serializedData2.writeInt32(themeAccent3.backgroundRotation);
                                    serializedData2.writeInt64(0L);
                                    serializedData2.writeDouble(themeAccent3.patternIntensity);
                                    serializedData2.writeBool(themeAccent3.patternMotion);
                                    serializedData2.writeString(themeAccent3.patternSlug);
                                    serializedData2.writeBool(false);
                                    editorEdit4.putString("accents_" + themeInfo11.assetName, Base64.encodeToString(serializedData2.toByteArray(), 3));
                                    break;
                                }
                            }
                            editorEdit4.putInt("accent_current_" + themeInfo11.assetName, themeInfo11.currentAccentId);
                        }
                        if (!arrayList2.isEmpty()) {
                            themeInfo11.themeAccents.addAll(0, arrayList2);
                            sortAccents(themeInfo11);
                        }
                        sparseArray = themeInfo11.themeAccentsMap;
                        if (sparseArray != null && sparseArray.get(themeInfo11.currentAccentId) == null) {
                            if (themeInfo11.firstAccentIsDefault) {
                                i2 = DEFALT_THEME_ACCENT_ID;
                            } else {
                                i2 = 0;
                            }
                            themeInfo11.currentAccentId = i2;
                        }
                        themeInfo11.loadWallpapers(sharedPreferences);
                        accent = themeInfo11.getAccent(false);
                        if (accent != null) {
                            themeInfo11.overrideWallpaper = accent.overrideWallpaper;
                        }
                        themeInfo = themeInfo4;
                    }
                    editorEdit3 = editor;
                    if (!arrayList2.isEmpty()) {
                        themeInfo11.themeAccents.addAll(0, arrayList2);
                        sortAccents(themeInfo11);
                    }
                    sparseArray = themeInfo11.themeAccentsMap;
                    if (sparseArray != null) {
                        if (themeInfo11.firstAccentIsDefault) {
                            i2 = DEFALT_THEME_ACCENT_ID;
                        } else {
                            i2 = 0;
                        }
                        themeInfo11.currentAccentId = i2;
                    }
                    themeInfo11.loadWallpapers(sharedPreferences);
                    accent = themeInfo11.getAccent(false);
                    if (accent != null) {
                        themeInfo11.overrideWallpaper = accent.overrideWallpaper;
                    }
                    themeInfo = themeInfo4;
                }
                str = null;
                i3 = 3;
            }
            SharedPreferences.Editor editor2 = editorEdit3;
            ThemeInfo themeInfo12 = themeInfo;
            if (editor2 != null) {
                editor2.commit();
                editorEdit4.commit();
            }
            selectedAutoNightType = globalMainSettings.getInt("selectedAutoNightType", Build.VERSION.SDK_INT >= 29 ? 3 : 0);
            autoNightScheduleByLocation = globalMainSettings.getBoolean("autoNightScheduleByLocation", false);
            autoNightBrighnessThreshold = globalMainSettings.getFloat("autoNightBrighnessThreshold", 0.25f);
            autoNightDayStartTime = globalMainSettings.getInt("autoNightDayStartTime", 1320);
            autoNightDayEndTime = globalMainSettings.getInt("autoNightDayEndTime", 480);
            autoNightSunsetTime = globalMainSettings.getInt("autoNightSunsetTime", 1320);
            autoNightSunriseTime = globalMainSettings.getInt("autoNightSunriseTime", 480);
            autoNightCityName = globalMainSettings.getString("autoNightCityName", "");
            long j = globalMainSettings.getLong("autoNightLocationLatitude3", 10000L);
            if (j != 10000) {
                autoNightLocationLatitude = Double.longBitsToDouble(j);
            } else {
                autoNightLocationLatitude = 10000.0d;
            }
            long j2 = globalMainSettings.getLong("autoNightLocationLongitude3", 10000L);
            if (j2 != 10000) {
                autoNightLocationLongitude = Double.longBitsToDouble(j2);
            } else {
                autoNightLocationLongitude = 10000.0d;
            }
            autoNightLastSunCheckDay = globalMainSettings.getInt("autoNightLastSunCheckDay", -1);
            if (themeInfo12 == null) {
                themeInfo3 = defaultTheme;
            } else {
                currentDayTheme = themeInfo12;
                themeInfo3 = themeInfo12;
            }
            if (globalMainSettings.contains("overrideThemeWallpaper") || globalMainSettings.contains("selectedBackground2")) {
                boolean z3 = globalMainSettings.getBoolean("overrideThemeWallpaper", false);
                long j3 = globalMainSettings.getLong("selectedBackground2", 1000001L);
                if (j3 == -1 || (z3 && j3 != -2 && j3 != 1000001)) {
                    OverrideWallpaperInfo overrideWallpaperInfo = new OverrideWallpaperInfo();
                    overrideWallpaperInfo.color = globalMainSettings.getInt("selectedColor", 0);
                    overrideWallpaperInfo.slug = globalMainSettings.getString("selectedBackgroundSlug", "");
                    if (j3 >= -100 && j3 <= -1 && overrideWallpaperInfo.color != 0) {
                        overrideWallpaperInfo.slug = "c";
                        overrideWallpaperInfo.fileName = "";
                        overrideWallpaperInfo.originalFileName = "";
                    } else {
                        overrideWallpaperInfo.fileName = "wallpaper.jpg";
                        overrideWallpaperInfo.originalFileName = "wallpaper_original.jpg";
                    }
                    overrideWallpaperInfo.gradientColor1 = globalMainSettings.getInt("selectedGradientColor", 0);
                    overrideWallpaperInfo.gradientColor2 = globalMainSettings.getInt("selectedGradientColor2", 0);
                    overrideWallpaperInfo.gradientColor3 = globalMainSettings.getInt("selectedGradientColor3", 0);
                    overrideWallpaperInfo.rotation = globalMainSettings.getInt("selectedGradientRotation", 45);
                    overrideWallpaperInfo.isBlurred = globalMainSettings.getBoolean("selectedBackgroundBlurred", false);
                    overrideWallpaperInfo.isMotion = globalMainSettings.getBoolean("selectedBackgroundMotion", false);
                    overrideWallpaperInfo.intensity = globalMainSettings.getFloat("selectedIntensity", 0.5f);
                    currentDayTheme.setOverrideWallpaper(overrideWallpaperInfo);
                    if (selectedAutoNightType != 0) {
                        currentNightTheme.setOverrideWallpaper(overrideWallpaperInfo);
                    }
                }
                globalMainSettings.edit().remove("overrideThemeWallpaper").remove("selectedBackground2").commit();
            }
            int iNeedSwitchToTheme = needSwitchToTheme();
            if (iNeedSwitchToTheme == 2) {
                themeInfo3 = currentNightTheme;
            }
            applyTheme(themeInfo3, false, false, iNeedSwitchToTheme == 2);
            AndroidUtilities.runOnUIThread(new MessagesController$$ExternalSyntheticLambda98());
            ambientSensorListener = new SensorEventListener() {
                @Override
                public void onAccuracyChanged(Sensor sensor, int i882) {
                }

                @Override
                public void onSensorChanged(SensorEvent sensorEvent) {
                    float f = sensorEvent.values[0];
                    if (f <= 0.0f) {
                        f = 0.1f;
                    }
                    if (ApplicationLoader.mainInterfacePaused || !ApplicationLoader.isScreenOn) {
                        return;
                    }
                    if (f > 500.0f) {
                        float unused = Theme.lastBrightnessValue = 1.0f;
                    } else {
                        float unused2 = Theme.lastBrightnessValue = ((float) Math.ceil((Math.log(f) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
                    }
                    if (Theme.lastBrightnessValue > Theme.autoNightBrighnessThreshold) {
                        if (Theme.switchNightRunnableScheduled) {
                            boolean unused3 = Theme.switchNightRunnableScheduled = false;
                            AndroidUtilities.cancelRunOnUIThread(Theme.switchNightBrightnessRunnable);
                        }
                        if (Theme.switchDayRunnableScheduled) {
                            return;
                        }
                        boolean unused4 = Theme.switchDayRunnableScheduled = true;
                        AndroidUtilities.runOnUIThread(Theme.switchDayBrightnessRunnable, Theme.getAutoNightSwitchThemeDelay());
                        return;
                    }
                    if (MediaController.getInstance().isRecordingOrListeningByProximity()) {
                        return;
                    }
                    if (Theme.switchDayRunnableScheduled) {
                        boolean unused5 = Theme.switchDayRunnableScheduled = false;
                        AndroidUtilities.cancelRunOnUIThread(Theme.switchDayBrightnessRunnable);
                    }
                    if (Theme.switchNightRunnableScheduled) {
                        return;
                    }
                    boolean unused6 = Theme.switchNightRunnableScheduled = true;
                    AndroidUtilities.runOnUIThread(Theme.switchNightBrightnessRunnable, Theme.getAutoNightSwitchThemeDelay());
                }
            };
            viewPos = new int[2];
            PAINT_FILLING = new Paint(1);
            Paint paint = new Paint(1);
            PAINT_CLEAR = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            Paint paint2 = new Paint();
            DEBUG_RED = paint2;
            paint2.setColor(-65536);
            Paint paint3 = new Paint();
            DEBUG_BLUE = paint3;
            paint3.setColor(-16776961);
            Paint paint4 = new Paint();
            DEBUG_GREEN_40 = paint4;
            paint4.setColor(1073807104);
            Paint paint5 = new Paint();
            DEBUG_GREEN_B0 = paint5;
            paint5.setColor(-1342112000);
            Paint paint6 = new Paint();
            DEBUG_RED_STROKE = paint6;
            paint6.setColor(-65536);
            DEBUG_RED_STROKE.setStrokeWidth(2.0f);
            Paint paint7 = DEBUG_RED_STROKE;
            Paint.Style style = Paint.Style.STROKE;
            paint7.setStyle(style);
            Paint paint8 = new Paint();
            DEBUG_GREEN_STROKE = paint8;
            paint8.setColor(-16711936);
            DEBUG_GREEN_STROKE.setStrokeWidth(2.0f);
            DEBUG_GREEN_STROKE.setStyle(style);
        } catch (Exception e2) {
            FileLog.e(e2);
            throw new RuntimeException(e2);
        }
    }

    public static void applyDefaultShadow(Paint paint) {
        paint.setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, AndroidUtilities.dpf2(0.33f), default_shadow_color);
    }

    public static Paint getThemePaint(String str, ResourcesProvider resourcesProvider) {
        Paint paint;
        return (resourcesProvider == null || (paint = resourcesProvider.getPaint(str)) == null) ? getThemePaint(str) : paint;
    }

    public static ColorFilter getAnimatedEmojiColorFilter(ResourcesProvider resourcesProvider) {
        if (resourcesProvider != null) {
            return resourcesProvider.getAnimatedEmojiColorFilter();
        }
        return chat_animatedEmojiTextColorFilter;
    }

    public static class PatternsLoader implements NotificationCenter.NotificationCenterDelegate {
        private static PatternsLoader loader;
        private int account = UserConfig.selectedAccount;
        private HashMap watingForLoad;

        static class LoadingPattern {
            public ArrayList accents;
            public TLRPC.TL_wallPaper pattern;

            private LoadingPattern() {
                this.accents = new ArrayList();
            }
        }

        public static void createLoader(boolean z) {
            String str;
            ArrayList arrayList;
            if (loader == null || z) {
                ArrayList arrayList2 = null;
                for (int i = 0; i < 5; i++) {
                    if (i == 0) {
                        str = "Blue";
                    } else if (i == 1) {
                        str = "Dark Blue";
                    } else if (i == 2) {
                        str = "Arctic Blue";
                    } else if (i == 3) {
                        str = "Day";
                    } else {
                        str = "Night";
                    }
                    ThemeInfo themeInfo = (ThemeInfo) Theme.themesDict.get(str);
                    if (themeInfo != null && (arrayList = themeInfo.themeAccents) != null && !arrayList.isEmpty()) {
                        int size = themeInfo.themeAccents.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ThemeAccent themeAccent = (ThemeAccent) themeInfo.themeAccents.get(i2);
                            if (themeAccent.id != Theme.DEFALT_THEME_ACCENT_ID && !TextUtils.isEmpty(themeAccent.patternSlug)) {
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(themeAccent);
                            }
                        }
                    }
                }
                loader = new PatternsLoader(arrayList2);
            }
        }

        private PatternsLoader(final ArrayList arrayList) {
            if (arrayList == null) {
                return;
            }
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    Theme.PatternsLoader.$r8$lambda$sKonNv6L_enzMGdgxce6_74nXVc(this.f$0, arrayList);
                }
            });
        }

        public static void $r8$lambda$sKonNv6L_enzMGdgxce6_74nXVc(final PatternsLoader patternsLoader, final ArrayList arrayList) {
            patternsLoader.getClass();
            int size = arrayList.size();
            ArrayList arrayList2 = null;
            int i = 0;
            while (i < size) {
                ThemeAccent themeAccent = (ThemeAccent) arrayList.get(i);
                File pathToWallpaper = themeAccent.getPathToWallpaper();
                if (pathToWallpaper != null && pathToWallpaper.length() > 0) {
                    arrayList.remove(i);
                    i--;
                    size--;
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    if (!arrayList2.contains(themeAccent.patternSlug)) {
                        arrayList2.add(themeAccent.patternSlug);
                    }
                }
                i++;
            }
            if (arrayList2 == null) {
                return;
            }
            TL_account.getMultiWallPapers getmultiwallpapers = new TL_account.getMultiWallPapers();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                tL_inputWallPaperSlug.slug = (String) arrayList2.get(i2);
                getmultiwallpapers.wallpapers.add(tL_inputWallPaperSlug);
            }
            ConnectionsManager.getInstance(patternsLoader.account).sendRequest(getmultiwallpapers, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    Theme.PatternsLoader.$r8$lambda$JLb2B_Q2ntRGgCIF9hyGjD0YyCY(this.f$0, arrayList, tLObject, tL_error);
                }
            });
        }

        public static void $r8$lambda$JLb2B_Q2ntRGgCIF9hyGjD0YyCY(PatternsLoader patternsLoader, ArrayList arrayList, TLObject tLObject, TLRPC.TL_error tL_error) {
            ?? CreateWallpaperForAccent;
            patternsLoader.getClass();
            if (tLObject instanceof Vector) {
                Vector vector = (Vector) tLObject;
                int size = vector.objects.size();
                AnonymousClass1 anonymousClass1 = null;
                ArrayList arrayList2 = null;
                int i = 0;
                while (i < size) {
                    TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) vector.objects.get(i);
                    if (wallPaper instanceof TLRPC.TL_wallPaper) {
                        TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                        if (tL_wallPaper.pattern) {
                            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                            int size2 = arrayList.size();
                            AnonymousClass1 anonymousClass2 = anonymousClass1;
                            ?? ValueOf = anonymousClass2;
                            int i2 = 0;
                            while (i2 < size2) {
                                ThemeAccent themeAccent = (ThemeAccent) arrayList.get(i2);
                                if (themeAccent.patternSlug.equals(tL_wallPaper.slug)) {
                                    if (ValueOf == 0) {
                                        ValueOf = Boolean.valueOf(pathToAttach.exists());
                                    }
                                    if (CreateWallpaperForAccent != 0 || ValueOf.booleanValue()) {
                                        CreateWallpaperForAccent = patternsLoader.createWallpaperForAccent(CreateWallpaperForAccent, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, themeAccent);
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        arrayList2.add(themeAccent);
                                    } else {
                                        String attachFileName = FileLoader.getAttachFileName(tL_wallPaper.document);
                                        if (((PatternsLoader) patternsLoader).watingForLoad == null) {
                                            ((PatternsLoader) patternsLoader).watingForLoad = new HashMap();
                                        }
                                        LoadingPattern loadingPattern = (LoadingPattern) ((PatternsLoader) patternsLoader).watingForLoad.get(attachFileName);
                                        if (loadingPattern == null) {
                                            loadingPattern = new LoadingPattern();
                                            loadingPattern.pattern = tL_wallPaper;
                                            ((PatternsLoader) patternsLoader).watingForLoad.put(attachFileName, loadingPattern);
                                        }
                                        loadingPattern.accents.add(themeAccent);
                                    }
                                } else {
                                    CreateWallpaperForAccent = anonymousClass2;
                                    ValueOf = ValueOf;
                                }
                                i2++;
                                anonymousClass1 = null;
                                CreateWallpaperForAccent = CreateWallpaperForAccent;
                                ValueOf = ValueOf;
                            }
                            CreateWallpaperForAccent = anonymousClass2;
                            if (CreateWallpaperForAccent != 0) {
                                CreateWallpaperForAccent.recycle();
                            }
                        }
                    }
                    i++;
                    anonymousClass1 = null;
                }
                patternsLoader.checkCurrentWallpaper(arrayList2, true);
            }
        }

        private void checkCurrentWallpaper(final ArrayList arrayList, final boolean z) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.checkCurrentWallpaperInternal(arrayList, z);
                }
            });
        }

        public void checkCurrentWallpaperInternal(ArrayList arrayList, boolean z) {
            if (arrayList != null && Theme.currentTheme.themeAccents != null && !Theme.currentTheme.themeAccents.isEmpty() && arrayList.contains(Theme.currentTheme.getAccent(false))) {
                Theme.reloadWallpaper(true);
            }
            if (z) {
                if (this.watingForLoad != null) {
                    NotificationCenter.getInstance(this.account).addObserver(this, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(this.account).addObserver(this, NotificationCenter.fileLoadFailed);
                    Iterator it = this.watingForLoad.entrySet().iterator();
                    while (it.hasNext()) {
                        FileLoader.getInstance(this.account).loadFile(ImageLocation.getForDocument(((LoadingPattern) ((Map.Entry) it.next()).getValue()).pattern.document), "wallpaper", null, 0, 1);
                    }
                    return;
                }
                return;
            }
            HashMap map = this.watingForLoad;
            if (map == null || map.isEmpty()) {
                NotificationCenter.getInstance(this.account).removeObserver(this, NotificationCenter.fileLoaded);
                NotificationCenter.getInstance(this.account).removeObserver(this, NotificationCenter.fileLoadFailed);
            }
        }

        private Bitmap createWallpaperForAccent(Bitmap bitmap, boolean z, File file, ThemeAccent themeAccent) {
            Bitmap bitmap2;
            int patternColor;
            Drawable backgroundGradientDrawable;
            int patternColor2;
            int iMin;
            int iMax;
            Bitmap bitmapLoadScreenSizedBitmap;
            int i;
            int i2;
            int i3;
            try {
                File pathToWallpaper = themeAccent.getPathToWallpaper();
                Drawable colorDrawable = null;
                if (pathToWallpaper == null) {
                    return null;
                }
                ThemeInfo themeInfo = themeAccent.parentTheme;
                SparseIntArray themeFileValues = Theme.getThemeFileValues(null, themeInfo.assetName, null);
                Theme.checkIsDark(themeFileValues, themeInfo);
                int i4 = themeAccent.accentColor;
                int iChangeColorAccent = (int) themeAccent.backgroundOverrideColor;
                long j = themeAccent.backgroundGradientOverrideColor1;
                int iChangeColorAccent2 = (int) j;
                if (iChangeColorAccent2 == 0 && j == 0) {
                    if (iChangeColorAccent != 0) {
                        i4 = iChangeColorAccent;
                    }
                    int i5 = themeFileValues.get(Theme.key_chat_wallpaper_gradient_to1);
                    if (i5 != 0) {
                        iChangeColorAccent2 = Theme.changeColorAccent(themeInfo, i4, i5);
                    }
                } else {
                    i4 = 0;
                }
                long j2 = themeAccent.backgroundGradientOverrideColor2;
                int iChangeColorAccent3 = (int) j2;
                if (iChangeColorAccent3 == 0 && j2 == 0 && (i3 = themeFileValues.get(Theme.key_chat_wallpaper_gradient_to2)) != 0) {
                    iChangeColorAccent3 = Theme.changeColorAccent(themeInfo, i4, i3);
                }
                long j3 = themeAccent.backgroundGradientOverrideColor3;
                int iChangeColorAccent4 = (int) j3;
                if (iChangeColorAccent4 == 0 && j3 == 0 && (i2 = themeFileValues.get(Theme.key_chat_wallpaper_gradient_to3)) != 0) {
                    iChangeColorAccent4 = Theme.changeColorAccent(themeInfo, i4, i2);
                }
                if (iChangeColorAccent == 0 && (i = themeFileValues.get(Theme.key_chat_wallpaper)) != 0) {
                    iChangeColorAccent = Theme.changeColorAccent(themeInfo, i4, i);
                }
                try {
                    if (iChangeColorAccent3 == 0) {
                        if (iChangeColorAccent2 != 0) {
                            backgroundGradientDrawable = new BackgroundGradientDrawable(BackgroundGradientDrawable.getGradientOrientation(themeAccent.backgroundRotation), new int[]{iChangeColorAccent, iChangeColorAccent2});
                            patternColor2 = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(iChangeColorAccent, iChangeColorAccent2));
                        } else {
                            colorDrawable = new ColorDrawable(iChangeColorAccent);
                            patternColor = AndroidUtilities.getPatternColor(iChangeColorAccent);
                        }
                        if (bitmap == null) {
                            Point point = AndroidUtilities.displaySize;
                            iMin = Math.min(point.x, point.y);
                            Point point2 = AndroidUtilities.displaySize;
                            iMax = Math.max(point2.x, point2.y);
                            if (z) {
                                bitmapLoadScreenSizedBitmap = Theme.loadScreenSizedBitmap(new FileInputStream(file), 0);
                            } else {
                                bitmapLoadScreenSizedBitmap = SvgHelper.getBitmap(file, iMin, iMax, false, SvgHelper.ScaleMode.ByWidth);
                            }
                            bitmap2 = bitmapLoadScreenSizedBitmap;
                        } else {
                            bitmap2 = bitmap;
                        }
                        if (backgroundGradientDrawable != null) {
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                            backgroundGradientDrawable.setBounds(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
                            backgroundGradientDrawable.draw(canvas);
                            Paint paint = new Paint(2);
                            paint.setColorFilter(new PorterDuffColorFilter(patternColor2, PorterDuff.Mode.SRC_IN));
                            paint.setAlpha((int) (Math.abs(themeAccent.patternIntensity) * 255.0f));
                            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(pathToWallpaper));
                            return bitmap2;
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(pathToWallpaper);
                        bitmap2.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                        fileOutputStream.close();
                        return bitmap2;
                    }
                    patternColor = MotionBackgroundDrawable.getPatternColor(iChangeColorAccent, iChangeColorAccent2, iChangeColorAccent3, iChangeColorAccent4);
                    if (backgroundGradientDrawable != null) {
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                        backgroundGradientDrawable.setBounds(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
                        backgroundGradientDrawable.draw(canvas2);
                        Paint paint2 = new Paint(2);
                        paint2.setColorFilter(new PorterDuffColorFilter(patternColor2, PorterDuff.Mode.SRC_IN));
                        paint2.setAlpha((int) (Math.abs(themeAccent.patternIntensity) * 255.0f));
                        canvas2.drawBitmap(bitmap2, 0.0f, 0.0f, paint2);
                        bitmapCreateBitmap2.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(pathToWallpaper));
                        return bitmap2;
                    }
                    FileOutputStream fileOutputStream2 = new FileOutputStream(pathToWallpaper);
                    bitmap2.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream2);
                    fileOutputStream2.close();
                    return bitmap2;
                } catch (Throwable th) {
                    th = th;
                    FileLog.e(th);
                    return bitmap2;
                }
                int i6 = patternColor;
                backgroundGradientDrawable = colorDrawable;
                patternColor2 = i6;
                if (bitmap == null) {
                    Point point3 = AndroidUtilities.displaySize;
                    iMin = Math.min(point3.x, point3.y);
                    Point point4 = AndroidUtilities.displaySize;
                    iMax = Math.max(point4.x, point4.y);
                    if (z) {
                        bitmapLoadScreenSizedBitmap = Theme.loadScreenSizedBitmap(new FileInputStream(file), 0);
                    } else {
                        bitmapLoadScreenSizedBitmap = SvgHelper.getBitmap(file, iMin, iMax, false, SvgHelper.ScaleMode.ByWidth);
                    }
                    bitmap2 = bitmapLoadScreenSizedBitmap;
                } else {
                    bitmap2 = bitmap;
                }
            } catch (Throwable th2) {
                th = th2;
                bitmap2 = bitmap;
            }
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            HashMap map = this.watingForLoad;
            if (map == null) {
                return;
            }
            if (i == NotificationCenter.fileLoaded) {
                final LoadingPattern loadingPattern = (LoadingPattern) map.remove((String) objArr[0]);
                if (loadingPattern != null) {
                    Utilities.globalQueue.postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            Theme.PatternsLoader.$r8$lambda$_NpolgguTd1FDmV4WkYzlskMexw(this.f$0, loadingPattern);
                        }
                    });
                    return;
                }
                return;
            }
            if (i != NotificationCenter.fileLoadFailed || map.remove((String) objArr[0]) == null) {
                return;
            }
            checkCurrentWallpaper(null, false);
        }

        public static void $r8$lambda$_NpolgguTd1FDmV4WkYzlskMexw(PatternsLoader patternsLoader, LoadingPattern loadingPattern) {
            patternsLoader.getClass();
            TLRPC.TL_wallPaper tL_wallPaper = loadingPattern.pattern;
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
            int size = loadingPattern.accents.size();
            Bitmap bitmapCreateWallpaperForAccent = null;
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                ThemeAccent themeAccent = (ThemeAccent) loadingPattern.accents.get(i);
                if (themeAccent.patternSlug.equals(tL_wallPaper.slug)) {
                    bitmapCreateWallpaperForAccent = patternsLoader.createWallpaperForAccent(bitmapCreateWallpaperForAccent, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, themeAccent);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        arrayList.add(themeAccent);
                    }
                }
            }
            if (bitmapCreateWallpaperForAccent != null) {
                bitmapCreateWallpaperForAccent.recycle();
            }
            patternsLoader.checkCurrentWallpaper(arrayList, false);
        }
    }

    public static class ThemeAccent {
        public int accentColor;
        public int accentColor2;
        public int account;
        public long backgroundGradientOverrideColor1;
        public long backgroundGradientOverrideColor2;
        public long backgroundGradientOverrideColor3;
        public long backgroundOverrideColor;
        public int id;
        public TLRPC.TL_theme info;
        public boolean isDefault;
        public int myMessagesAccentColor;
        public boolean myMessagesAnimated;
        public int myMessagesGradientAccentColor1;
        public int myMessagesGradientAccentColor2;
        public int myMessagesGradientAccentColor3;
        public OverrideWallpaperInfo overrideWallpaper;
        public ThemeInfo parentTheme;
        public TLRPC.TL_wallPaper pattern;
        public float patternIntensity;
        public boolean patternMotion;
        public TLRPC.InputFile uploadedFile;
        public TLRPC.InputFile uploadedThumb;
        public String uploadingFile;
        public String uploadingThumb;
        public int backgroundRotation = 45;
        public String patternSlug = "";
        private float[] tempHSV = new float[3];

        ThemeAccent() {
        }

        public boolean fillAccentColors(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
            int iValueAt;
            char c;
            boolean zUseBlackText;
            boolean z;
            float f;
            int iValueAt2;
            int iValueAt3;
            int i;
            boolean zUseBlackText2;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            float[] tempHsv = Theme.getTempHsv(1);
            float[] tempHsv2 = Theme.getTempHsv(2);
            Color.colorToHSV(this.parentTheme.accentBaseColor, tempHsv);
            Color.colorToHSV(this.accentColor, tempHsv2);
            boolean zIsDark = this.parentTheme.isDark();
            if (this.accentColor != this.parentTheme.accentBaseColor || this.accentColor2 != 0) {
                for (int i7 = 0; i7 < Theme.defaultColors.length; i7++) {
                    if (!Theme.themeAccentExclusionKeys.contains(Integer.valueOf(i7))) {
                        int iIndexOfKey = sparseIntArray.indexOfKey(i7);
                        if (iIndexOfKey < 0) {
                            int i8 = Theme.fallbackKeys.get(i7, -1);
                            if (i8 < 0 || sparseIntArray.indexOfKey(i8) < 0) {
                                iValueAt = Theme.defaultColors[i7];
                            }
                        } else {
                            iValueAt = sparseIntArray.valueAt(iIndexOfKey);
                        }
                        int iChangeColorAccent = Theme.changeColorAccent(tempHsv, tempHsv2, iValueAt, zIsDark, iValueAt);
                        if (iChangeColorAccent != iValueAt) {
                            sparseIntArray2.put(i7, iChangeColorAccent);
                        }
                    }
                }
            }
            int accentColor = this.myMessagesAccentColor;
            if ((accentColor == 0 && this.accentColor == 0) || this.myMessagesGradientAccentColor1 == 0) {
                c = 2;
                z = false;
            } else {
                if (accentColor == 0) {
                    accentColor = this.accentColor;
                }
                int i9 = Theme.key_chat_outBubble;
                int i10 = sparseIntArray.get(i9);
                if (i10 == 0) {
                    i10 = Theme.defaultColors[i9];
                }
                int colorDistance = AndroidUtilities.getColorDistance(accentColor, Theme.changeColorAccent(tempHsv, tempHsv2, i10, zIsDark, i10));
                int colorDistance2 = AndroidUtilities.getColorDistance(accentColor, this.myMessagesGradientAccentColor1);
                if (this.myMessagesGradientAccentColor2 == 0) {
                    c = 2;
                    zUseBlackText = Theme.useBlackText(this.myMessagesAccentColor, this.myMessagesGradientAccentColor1);
                } else {
                    c = 2;
                    int averageColor = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(this.myMessagesAccentColor, this.myMessagesGradientAccentColor1), this.myMessagesGradientAccentColor2);
                    int i11 = this.myMessagesGradientAccentColor3;
                    if (i11 != 0) {
                        averageColor = AndroidUtilities.getAverageColor(averageColor, i11);
                    }
                    zUseBlackText = AndroidUtilities.computePerceivedBrightness(averageColor) > 0.705f;
                }
                z = zUseBlackText && colorDistance <= 35000 && colorDistance2 <= 35000;
                accentColor = Theme.getAccentColor(tempHsv, i10, accentColor);
            }
            boolean z2 = (accentColor == 0 || (((i5 = this.parentTheme.accentBaseColor) == 0 || accentColor == i5) && ((i6 = this.accentColor) == 0 || i6 == accentColor))) ? false : true;
            if (z2 || this.accentColor2 != 0) {
                int i12 = this.accentColor2;
                if (i12 != 0) {
                    Color.colorToHSV(i12, tempHsv2);
                } else {
                    Color.colorToHSV(accentColor, tempHsv2);
                }
                for (int i13 = Theme.myMessagesStartIndex; i13 < Theme.myMessagesEndIndex; i13++) {
                    int iIndexOfKey2 = sparseIntArray.indexOfKey(i13);
                    if (iIndexOfKey2 < 0) {
                        int i14 = Theme.fallbackKeys.get(i13, -1);
                        if (i14 < 0 || sparseIntArray.get(i14, -1) < 0) {
                            iValueAt3 = Theme.defaultColors[i13];
                        }
                    } else {
                        iValueAt3 = sparseIntArray.valueAt(iIndexOfKey2);
                    }
                    int iChangeColorAccent2 = Theme.changeColorAccent(tempHsv, tempHsv2, iValueAt3, zIsDark, iValueAt3);
                    if (iChangeColorAccent2 != iValueAt3) {
                        sparseIntArray2.put(i13, iChangeColorAccent2);
                    }
                }
                for (int i15 : Theme.myMessagesAccentExtraKeys) {
                    int iIndexOfKey3 = sparseIntArray.indexOfKey(i15);
                    int iValueAt4 = iIndexOfKey3 < 0 ? Theme.defaultColors[i15] : sparseIntArray.valueAt(iIndexOfKey3);
                    int iChangeColorAccent3 = Theme.changeColorAccent(tempHsv, tempHsv2, iValueAt4, zIsDark, iValueAt4);
                    if (iChangeColorAccent3 != iValueAt4) {
                        sparseIntArray2.put(i15, iChangeColorAccent3);
                    }
                }
                f = 0.705f;
                if (z2) {
                    Color.colorToHSV(accentColor, tempHsv2);
                    for (int i16 = Theme.myMessagesBubblesStartIndex; i16 < Theme.myMessagesBubblesEndIndex; i16++) {
                        int iIndexOfKey4 = sparseIntArray.indexOfKey(i16);
                        if (iIndexOfKey4 < 0) {
                            int i17 = Theme.fallbackKeys.get(i16, -1);
                            if (i17 < 0 || sparseIntArray.get(i17, -1) < 0) {
                                iValueAt2 = Theme.defaultColors[i16];
                            }
                        } else {
                            iValueAt2 = sparseIntArray.valueAt(iIndexOfKey4);
                        }
                        int iChangeColorAccent4 = Theme.changeColorAccent(tempHsv, tempHsv2, iValueAt2, zIsDark, iValueAt2);
                        if (iChangeColorAccent4 != iValueAt2) {
                            sparseIntArray2.put(i16, iChangeColorAccent4);
                        }
                    }
                }
            } else {
                f = 0.705f;
            }
            if (!z && (i = this.myMessagesGradientAccentColor1) != 0) {
                if (this.myMessagesGradientAccentColor2 == 0) {
                    zUseBlackText2 = Theme.useBlackText(this.myMessagesAccentColor, i);
                } else {
                    int averageColor2 = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(this.myMessagesAccentColor, i), this.myMessagesGradientAccentColor2);
                    int i18 = this.myMessagesGradientAccentColor3;
                    if (i18 != 0) {
                        averageColor2 = AndroidUtilities.getAverageColor(averageColor2, i18);
                    }
                    zUseBlackText2 = AndroidUtilities.computePerceivedBrightness(averageColor2) > f;
                }
                if (zUseBlackText2) {
                    i4 = -14606047;
                    i2 = -11184811;
                    i3 = 1291845632;
                } else {
                    i2 = -1118482;
                    i3 = 1308622847;
                    i4 = -1;
                }
                if (this.accentColor2 == 0) {
                    sparseIntArray2.put(Theme.key_chat_outAudioProgress, i3);
                    sparseIntArray2.put(Theme.key_chat_outAudioSelectedProgress, i3);
                    sparseIntArray2.put(Theme.key_chat_outAudioSeekbar, i3);
                    sparseIntArray2.put(Theme.key_chat_outAudioCacheSeekbar, i3);
                    sparseIntArray2.put(Theme.key_chat_outAudioSeekbarSelected, i3);
                    sparseIntArray2.put(Theme.key_chat_outAudioSeekbarFill, i4);
                    sparseIntArray2.put(Theme.key_chat_outVoiceSeekbar, i3);
                    sparseIntArray2.put(Theme.key_chat_outVoiceSeekbarSelected, i3);
                    sparseIntArray2.put(Theme.key_chat_outVoiceSeekbarFill, i4);
                    sparseIntArray2.put(Theme.key_chat_messageLinkOut, i4);
                    sparseIntArray2.put(Theme.key_chat_outForwardedNameText, i4);
                    sparseIntArray2.put(Theme.key_chat_outViaBotNameText, i4);
                    sparseIntArray2.put(Theme.key_chat_outReplyLine, i4);
                    sparseIntArray2.put(Theme.key_chat_outReplyLine2, i4);
                    sparseIntArray2.put(Theme.key_chat_outReplyNameText, i4);
                    sparseIntArray2.put(Theme.key_chat_outPreviewLine, i4);
                    sparseIntArray2.put(Theme.key_chat_outSiteNameText, i4);
                    sparseIntArray2.put(Theme.key_chat_outInstant, i4);
                    sparseIntArray2.put(Theme.key_chat_outInstantSelected, i4);
                    sparseIntArray2.put(Theme.key_chat_outPreviewInstantText, i4);
                    sparseIntArray2.put(Theme.key_chat_outViews, i4);
                    sparseIntArray2.put(Theme.key_chat_outViewsSelected, i4);
                    sparseIntArray2.put(Theme.key_chat_outAudioTitleText, i4);
                    sparseIntArray2.put(Theme.key_chat_outFileNameText, i4);
                    sparseIntArray2.put(Theme.key_chat_outContactNameText, i4);
                    sparseIntArray2.put(Theme.key_chat_outAudioPerformerText, i4);
                    sparseIntArray2.put(Theme.key_chat_outAudioPerformerSelectedText, i4);
                    sparseIntArray2.put(Theme.key_chat_outSentCheck, i4);
                    sparseIntArray2.put(Theme.key_chat_outSentCheckSelected, i4);
                    sparseIntArray2.put(Theme.key_chat_outSentCheckRead, i4);
                    sparseIntArray2.put(Theme.key_chat_outSentCheckReadSelected, i4);
                    sparseIntArray2.put(Theme.key_chat_outSentClock, i4);
                    sparseIntArray2.put(Theme.key_chat_outSentClockSelected, i4);
                    sparseIntArray2.put(Theme.key_chat_outMenu, i4);
                    sparseIntArray2.put(Theme.key_chat_outMenuSelected, i4);
                    sparseIntArray2.put(Theme.key_chat_outTimeText, i4);
                    sparseIntArray2.put(Theme.key_chat_outTimeSelectedText, i4);
                    sparseIntArray2.put(Theme.key_chat_outAudioDurationText, i2);
                    sparseIntArray2.put(Theme.key_chat_outAudioDurationSelectedText, i2);
                    sparseIntArray2.put(Theme.key_chat_outContactPhoneText, i2);
                    sparseIntArray2.put(Theme.key_chat_outContactPhoneSelectedText, i2);
                    sparseIntArray2.put(Theme.key_chat_outFileInfoText, i2);
                    sparseIntArray2.put(Theme.key_chat_outFileInfoSelectedText, i2);
                    sparseIntArray2.put(Theme.key_chat_outVenueInfoText, i2);
                    sparseIntArray2.put(Theme.key_chat_outVenueInfoSelectedText, i2);
                    sparseIntArray2.put(Theme.key_chat_outLoader, i4);
                    sparseIntArray2.put(Theme.key_chat_outLoaderSelected, i4);
                    sparseIntArray2.put(Theme.key_chat_outFileProgress, this.myMessagesAccentColor);
                    sparseIntArray2.put(Theme.key_chat_outFileProgressSelected, this.myMessagesAccentColor);
                    sparseIntArray2.put(Theme.key_chat_outMediaIcon, this.myMessagesAccentColor);
                    sparseIntArray2.put(Theme.key_chat_outMediaIconSelected, this.myMessagesAccentColor);
                }
                sparseIntArray2.put(Theme.key_chat_outReplyMessageText, i4);
                sparseIntArray2.put(Theme.key_chat_outReplyMediaMessageText, i4);
                sparseIntArray2.put(Theme.key_chat_outReplyMediaMessageSelectedText, i4);
                sparseIntArray2.put(Theme.key_chat_messageTextOut, i4);
            }
            if (z) {
                int i19 = Theme.key_chat_outLoader;
                if (AndroidUtilities.getColorDistance(-1, sparseIntArray2.indexOfKey(i19) >= 0 ? sparseIntArray2.get(i19) : 0) < 5000) {
                    z = false;
                }
            }
            int i20 = this.myMessagesAccentColor;
            if (i20 != 0 && this.myMessagesGradientAccentColor1 != 0) {
                sparseIntArray2.put(Theme.key_chat_outBubble, i20);
                sparseIntArray2.put(Theme.key_chat_outBubbleGradient1, this.myMessagesGradientAccentColor1);
                int i21 = this.myMessagesGradientAccentColor2;
                if (i21 != 0) {
                    sparseIntArray2.put(Theme.key_chat_outBubbleGradient2, i21);
                    int i22 = this.myMessagesGradientAccentColor3;
                    if (i22 != 0) {
                        sparseIntArray2.put(Theme.key_chat_outBubbleGradient3, i22);
                    }
                }
                sparseIntArray2.put(Theme.key_chat_outBubbleGradientAnimated, this.myMessagesAnimated ? 1 : 0);
            }
            long j = this.backgroundOverrideColor;
            int i23 = (int) j;
            if (i23 != 0) {
                sparseIntArray2.put(Theme.key_chat_wallpaper, i23);
            } else if (j != 0) {
                sparseIntArray2.delete(Theme.key_chat_wallpaper);
            }
            long j2 = this.backgroundGradientOverrideColor1;
            int i24 = (int) j2;
            if (i24 != 0) {
                sparseIntArray2.put(Theme.key_chat_wallpaper_gradient_to1, i24);
            } else if (j2 != 0) {
                sparseIntArray2.delete(Theme.key_chat_wallpaper_gradient_to1);
            }
            long j3 = this.backgroundGradientOverrideColor2;
            int i25 = (int) j3;
            if (i25 != 0) {
                sparseIntArray2.put(Theme.key_chat_wallpaper_gradient_to2, i25);
            } else if (j3 != 0) {
                sparseIntArray2.delete(Theme.key_chat_wallpaper_gradient_to2);
            }
            long j4 = this.backgroundGradientOverrideColor3;
            int i26 = (int) j4;
            if (i26 != 0) {
                sparseIntArray2.put(Theme.key_chat_wallpaper_gradient_to3, i26);
            } else if (j4 != 0) {
                sparseIntArray2.delete(Theme.key_chat_wallpaper_gradient_to3);
            }
            int i27 = this.backgroundRotation;
            if (i27 != 45) {
                sparseIntArray2.put(Theme.key_chat_wallpaper_gradient_rotation, i27);
            }
            int i28 = Theme.key_chat_outBubble;
            int color = sparseIntArray2.get(i28);
            if (color == 0) {
                color = Theme.getColor(i28);
            }
            int i29 = Theme.key_chat_inBubble;
            int color2 = sparseIntArray2.get(i29);
            if (color2 == 0) {
                color2 = Theme.getColor(i29);
            }
            TLRPC.TL_theme tL_theme = this.info;
            if (tL_theme != null && tL_theme.emoticon != null && !zIsDark) {
                sparseIntArray2.delete(Theme.key_chat_selectedBackground);
                int iAverageColor = averageColor(sparseIntArray2, Theme.key_chat_wallpaper_gradient_to1, Theme.key_chat_wallpaper_gradient_to2, Theme.key_chat_wallpaper_gradient_to3);
                if (iAverageColor == 0) {
                    iAverageColor = averageColor(sparseIntArray2, Theme.key_chat_wallpaper);
                }
                if (iAverageColor == 0) {
                    iAverageColor = this.accentColor;
                }
                int iBubbleSelectedOverlay = bubbleSelectedOverlay(color, iAverageColor);
                sparseIntArray2.put(Theme.key_chat_outBubbleSelectedOverlay, iBubbleSelectedOverlay);
                sparseIntArray2.put(Theme.key_chat_outBubbleGradientSelectedOverlay, iBubbleSelectedOverlay);
                sparseIntArray2.put(Theme.key_chat_outBubbleSelected, Theme.blendOver(color, iBubbleSelectedOverlay));
                int iBubbleSelectedOverlay2 = bubbleSelectedOverlay(color2, this.accentColor);
                sparseIntArray2.put(Theme.key_chat_inBubbleSelectedOverlay, iBubbleSelectedOverlay2);
                sparseIntArray2.put(Theme.key_chat_inBubbleSelected, Theme.blendOver(color2, iBubbleSelectedOverlay2));
            }
            if (!zIsDark) {
                sparseIntArray2.put(Theme.key_chat_inTextSelectionHighlight, textSelectionBackground(false, color2, this.accentColor));
                sparseIntArray2.put(Theme.key_chat_outTextSelectionHighlight, textSelectionBackground(true, color, this.accentColor));
                sparseIntArray2.put(Theme.key_chat_outTextSelectionCursor, textSelectionHandle(color, this.accentColor));
            }
            float hue = getHue(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText));
            sparseIntArray2.put(Theme.key_chat_outBubbleLocationPlaceholder, locationPlaceholderColor(hue, color, zIsDark));
            sparseIntArray2.put(Theme.key_chat_inBubbleLocationPlaceholder, locationPlaceholderColor(hue, color2, zIsDark));
            int i30 = Theme.key_chat_messageLinkIn;
            int color3 = sparseIntArray2.get(i30);
            if (color3 == 0) {
                color3 = Theme.getColor(i30);
            }
            int i31 = Theme.key_chat_messageLinkOut;
            int color4 = sparseIntArray2.get(i31);
            if (color4 == 0) {
                color4 = Theme.getColor(i31);
            }
            sparseIntArray2.put(Theme.key_chat_linkSelectBackground, linkSelectionBackground(color3, color2, zIsDark));
            sparseIntArray2.put(Theme.key_chat_outLinkSelectBackground, linkSelectionBackground(color4, color, zIsDark));
            int i32 = Theme.key_actionBarDefaultSubmenuBackground;
            int color5 = sparseIntArray2.get(i32);
            if (color5 == 0) {
                color5 = Theme.getColor(i32);
            }
            sparseIntArray2.put(Theme.key_actionBarDefaultSubmenuSeparator, Color.argb(Color.alpha(color5), Math.max(0, Color.red(color5) - 10), Math.max(0, Color.green(color5) - 10), Math.max(0, Color.blue(color5) - 10)));
            if (zIsDark) {
                int i33 = Theme.key_chat_outBubbleGradient1;
                if (sparseIntArray2.get(i33) != 0) {
                    Color.colorToHSV(averageColor(sparseIntArray2, i33, Theme.key_chat_outBubbleGradient2, Theme.key_chat_outBubbleGradient3), this.tempHSV);
                    float[] fArr = this.tempHSV;
                    fArr[1] = Utilities.clamp(fArr[1] + 0.1f, 1.0f, 0.0f);
                    float[] fArr2 = this.tempHSV;
                    fArr2[c] = Utilities.clamp(fArr2[c] - 0.8f, 1.0f, 0.0f);
                    sparseIntArray2.put(Theme.key_chat_outCodeBackground, Color.HSVToColor(64, this.tempHSV));
                } else {
                    sparseIntArray2.put(Theme.key_chat_outCodeBackground, codeBackground(color, zIsDark));
                }
            } else {
                sparseIntArray2.put(Theme.key_chat_outCodeBackground, codeBackground(color, zIsDark));
            }
            Theme.applyCalculatedTableColors(sparseIntArray, sparseIntArray2, zIsDark);
            Theme.applyCalculatedArticleCodeColors(sparseIntArray, sparseIntArray2, zIsDark);
            return !z;
        }

        public void resetAccentColorsForMyMessagesGiftThemeLight(SparseIntArray sparseIntArray) {
            for (int i = Theme.myMessagesBubblesStartIndex; i < Theme.myMessagesBubblesEndIndex; i++) {
                sparseIntArray.delete(i);
                sparseIntArray.put(i, Theme.defaultColors[i]);
            }
            for (int i2 = Theme.myMessagesStartIndex; i2 < Theme.myMessagesEndIndex; i2++) {
                sparseIntArray.delete(i2);
                sparseIntArray.put(i2, Theme.defaultColors[i2]);
            }
            for (int i3 = Theme.myMessages2StartIndex; i3 < Theme.myMessages2EndIndex; i3++) {
                sparseIntArray.delete(i3);
                sparseIntArray.put(i3, Theme.defaultColors[i3]);
            }
        }

        private float getHue(int i) {
            Color.colorToHSV(i, this.tempHSV);
            return this.tempHSV[0];
        }

        private int bubbleSelectedOverlay(int i, int i2) {
            Color.colorToHSV(i2, this.tempHSV);
            float[] fArr = this.tempHSV;
            float f = fArr[0];
            Color.colorToHSV(i, fArr);
            float[] fArr2 = this.tempHSV;
            float f2 = fArr2[1];
            if (f2 <= 0.0f) {
                fArr2[0] = f;
            }
            fArr2[1] = Math.max(0.0f, Math.min(1.0f, f2 + 0.6f));
            float[] fArr3 = this.tempHSV;
            fArr3[2] = Math.max(0.0f, Math.min(1.0f, fArr3[2] - 0.05f));
            return Color.HSVToColor(30, this.tempHSV);
        }

        private int textSelectionBackground(boolean z, int i, int i2) {
            Color.colorToHSV(i2, this.tempHSV);
            float[] fArr = this.tempHSV;
            float f = fArr[0];
            Color.colorToHSV(i, fArr);
            float[] fArr2 = this.tempHSV;
            float f2 = fArr2[1];
            if (f2 > 0.0f) {
                float f3 = fArr2[0];
                if (f3 > 45.0f && f3 < 85.0f) {
                    fArr2[0] = f;
                }
            } else {
                fArr2[0] = f;
            }
            fArr2[1] = Math.max(0.0f, Math.min(1.0f, f2 + (fArr2[2] > 0.85f ? 0.25f : 0.45f)));
            float[] fArr3 = this.tempHSV;
            fArr3[2] = Math.max(0.0f, Math.min(1.0f, fArr3[2] - 0.15f));
            return Color.HSVToColor(80, this.tempHSV);
        }

        private int textSelectionHandle(int i, int i2) {
            Color.colorToHSV(i2, this.tempHSV);
            float[] fArr = this.tempHSV;
            float f = fArr[0];
            Color.colorToHSV(i, fArr);
            float[] fArr2 = this.tempHSV;
            float f2 = fArr2[1];
            if (f2 > 0.0f) {
                float f3 = fArr2[0];
                if (f3 > 45.0f && f3 < 85.0f) {
                    fArr2[0] = f;
                }
            } else {
                fArr2[0] = f;
            }
            fArr2[1] = Math.max(0.0f, Math.min(1.0f, f2 + 0.6f));
            float[] fArr3 = this.tempHSV;
            float f4 = fArr3[2];
            fArr3[2] = Math.max(0.0f, Math.min(1.0f, f4 - (f4 > 0.7f ? 0.25f : 0.125f)));
            return Theme.blendOver(i, Color.HSVToColor(255, this.tempHSV));
        }

        private int linkSelectionBackground(int i, int i2, boolean z) {
            Color.colorToHSV(ColorUtils.blendARGB(i, i2, 0.25f), this.tempHSV);
            float[] fArr = this.tempHSV;
            fArr[1] = Math.max(0.0f, Math.min(1.0f, fArr[1] - 0.1f));
            float[] fArr2 = this.tempHSV;
            fArr2[2] = Math.max(0.0f, Math.min(1.0f, fArr2[2] + (z ? 0.1f : 0.0f)));
            return Color.HSVToColor(51, this.tempHSV);
        }

        private int codeBackground(int i, boolean z) {
            int i2;
            Color.colorToHSV(i, this.tempHSV);
            if (z) {
                float[] fArr = this.tempHSV;
                fArr[1] = Utilities.clamp(fArr[1] - 0.08f, 1.0f, 0.0f);
                this.tempHSV[2] = 0.03f;
                i2 = 64;
            } else {
                float[] fArr2 = this.tempHSV;
                float f = fArr2[1];
                if (f > 0.0f) {
                    float f2 = fArr2[2];
                    if (f2 >= 1.0f || f2 <= 0.0f) {
                        fArr2[2] = Math.max(0.0f, Math.min(1.0f, fArr2[2] - 0.2f));
                    } else {
                        fArr2[1] = Math.max(0.0f, Math.min(1.0f, f + 0.28f));
                        float[] fArr3 = this.tempHSV;
                        fArr3[2] = Math.max(0.0f, Math.min(1.0f, fArr3[2] - 0.1f));
                    }
                } else {
                    fArr2[2] = Math.max(0.0f, Math.min(1.0f, fArr2[2] - 0.2f));
                }
                i2 = 32;
            }
            return Color.HSVToColor(i2, this.tempHSV);
        }

        private int locationPlaceholderColor(float f, int i, boolean z) {
            if (z) {
                return 520093695;
            }
            Color.colorToHSV(i, this.tempHSV);
            float[] fArr = this.tempHSV;
            if (fArr[1] > 0.0f) {
                float f2 = fArr[2];
                if (f2 >= 1.0f || f2 <= 0.0f) {
                    fArr[0] = f;
                    fArr[1] = 0.2f;
                } else {
                    fArr[0] = MathUtils.clamp(fArr[0] + 0.22f, 0.0f, 1.0f);
                    float[] fArr2 = this.tempHSV;
                    fArr2[1] = MathUtils.clamp(fArr2[1] - 0.35f, 0.0f, 1.0f);
                }
            } else {
                fArr[0] = f;
                fArr[1] = 0.2f;
            }
            float[] fArr3 = this.tempHSV;
            fArr3[2] = MathUtils.clamp(fArr3[2] - 0.65f, 0.0f, 1.0f);
            return Color.HSVToColor(90, this.tempHSV);
        }

        private int averageColor(SparseIntArray sparseIntArray, int... iArr) {
            int i = 0;
            int iBlue = 0;
            int iGreen = 0;
            int iRed = 0;
            for (int i2 = 0; i2 < iArr.length; i2++) {
                if (sparseIntArray.indexOfKey(iArr[i2]) >= 0) {
                    try {
                        int i3 = sparseIntArray.get(iArr[i2]);
                        iRed += Color.red(i3);
                        iGreen += Color.green(i3);
                        iBlue += Color.blue(i3);
                        i++;
                    } catch (Exception unused) {
                    }
                }
            }
            if (i == 0) {
                return 0;
            }
            return Color.argb(255, iRed / i, iGreen / i, iBlue / i);
        }

        public File getPathToWallpaper() {
            if (this.id < 100) {
                if (TextUtils.isEmpty(this.patternSlug)) {
                    return null;
                }
                return new File(ApplicationLoader.getFilesDirFixed(), String.format(Locale.US, "%s_%d_%s_v5.jpg", this.parentTheme.getKey(), Integer.valueOf(this.id), this.patternSlug));
            }
            if (TextUtils.isEmpty(this.patternSlug)) {
                return null;
            }
            return new File(ApplicationLoader.getFilesDirFixed(), String.format(Locale.US, "%s_%d_%s_v8_debug.jpg", this.parentTheme.getKey(), Integer.valueOf(this.id), this.patternSlug));
        }

        public File saveToFile() throws Throwable {
            String str;
            FileOutputStream fileOutputStream;
            Throwable th;
            char c;
            String lowerCase;
            String lowerCase2;
            String lowerCase3;
            File sharingDirectory = AndroidUtilities.getSharingDirectory();
            sharingDirectory.mkdirs();
            File file = new File(sharingDirectory, String.format(Locale.US, "%s_%d.attheme", this.parentTheme.getKey(), Integer.valueOf(this.id)));
            SparseIntArray themeFileValues = Theme.getThemeFileValues(null, this.parentTheme.assetName, null);
            SparseIntArray sparseIntArrayClone = themeFileValues.clone();
            fillAccentColors(themeFileValues, sparseIntArrayClone);
            if (TextUtils.isEmpty(this.patternSlug)) {
                str = null;
            } else {
                StringBuilder sb = new StringBuilder();
                if (this.patternMotion) {
                    sb.append("motion");
                }
                int i = sparseIntArrayClone.get(Theme.key_chat_wallpaper);
                if (i == 0) {
                    i = -1;
                }
                int i2 = sparseIntArrayClone.get(Theme.key_chat_wallpaper_gradient_to1);
                if (i2 == 0) {
                    i2 = 0;
                }
                int i3 = sparseIntArrayClone.get(Theme.key_chat_wallpaper_gradient_to2);
                if (i3 == 0) {
                    i3 = 0;
                }
                int i4 = sparseIntArrayClone.get(Theme.key_chat_wallpaper_gradient_to3);
                if (i4 == 0) {
                    i4 = 0;
                }
                int i5 = sparseIntArrayClone.get(Theme.key_chat_wallpaper_gradient_rotation);
                if (i5 == 0) {
                    i5 = 45;
                }
                String lowerCase4 = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i >> 16)) & 255), Integer.valueOf(((byte) (i >> 8)) & 255), Byte.valueOf((byte) (i & 255))).toLowerCase();
                if (i2 != 0) {
                    c = 1;
                    lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i2 >> 16)) & 255), Integer.valueOf(((byte) (i2 >> 8)) & 255), Byte.valueOf((byte) (i2 & 255))).toLowerCase();
                } else {
                    c = 1;
                    lowerCase = null;
                }
                if (i3 != 0) {
                    Integer numValueOf = Integer.valueOf(((byte) (i3 >> 16)) & 255);
                    Integer numValueOf2 = Integer.valueOf(((byte) (i3 >> 8)) & 255);
                    Byte bValueOf = Byte.valueOf((byte) (i3 & 255));
                    Object[] objArr = new Object[3];
                    objArr[0] = numValueOf;
                    objArr[c] = numValueOf2;
                    objArr[2] = bValueOf;
                    lowerCase2 = String.format("%02x%02x%02x", objArr).toLowerCase();
                } else {
                    lowerCase2 = null;
                }
                if (i4 != 0) {
                    Integer numValueOf3 = Integer.valueOf(((byte) (i4 >> 16)) & 255);
                    Integer numValueOf4 = Integer.valueOf(((byte) (i4 >> 8)) & 255);
                    Byte bValueOf2 = Byte.valueOf((byte) (i4 & 255));
                    Object[] objArr2 = new Object[3];
                    objArr2[0] = numValueOf3;
                    objArr2[c] = numValueOf4;
                    objArr2[2] = bValueOf2;
                    lowerCase3 = String.format("%02x%02x%02x", objArr2).toLowerCase();
                } else {
                    lowerCase3 = null;
                }
                if (lowerCase == null || lowerCase2 == null) {
                    if (lowerCase != null) {
                        lowerCase4 = (lowerCase4 + "-" + lowerCase) + "&rotation=" + i5;
                    }
                } else if (lowerCase3 != null) {
                    lowerCase4 = lowerCase4 + "~" + lowerCase + "~" + lowerCase2 + "~" + lowerCase3;
                } else {
                    lowerCase4 = lowerCase4 + "~" + lowerCase + "~" + lowerCase2;
                }
                str = "https://attheme.org?slug=" + this.patternSlug + "&intensity=" + ((int) (this.patternIntensity * 100.0f)) + "&bg_color=" + lowerCase4;
                if (sb.length() > 0) {
                    str = str + "&mode=" + sb.toString();
                }
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i6 = 0; i6 < sparseIntArrayClone.size(); i6++) {
                try {
                    int iKeyAt = sparseIntArrayClone.keyAt(i6);
                    int iValueAt = sparseIntArrayClone.valueAt(i6);
                    if (str == null || (Theme.key_chat_wallpaper != iKeyAt && Theme.key_chat_wallpaper_gradient_to1 != iKeyAt && Theme.key_chat_wallpaper_gradient_to2 != iKeyAt && Theme.key_chat_wallpaper_gradient_to3 != iKeyAt)) {
                        sb2.append(iKeyAt);
                        sb2.append("=");
                        sb2.append(iValueAt);
                        sb2.append("\n");
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    try {
                        fileOutputStream.write(AndroidUtilities.getStringBytes(sb2.toString()));
                        if (!TextUtils.isEmpty(str)) {
                            fileOutputStream.write(AndroidUtilities.getStringBytes("WLS=" + str + "\n"));
                        }
                        fileOutputStream.close();
                        return file;
                    } catch (Exception e2) {
                        e = e2;
                        FileLog.e(e);
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return file;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (Exception e3) {
                            FileLog.e(e3);
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                th = th;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                    throw th;
                }
                throw th;
            }
        }
    }

    public static int blendOver(int i, int i2) {
        float fAlpha = Color.alpha(i2) / 255.0f;
        float fAlpha2 = Color.alpha(i) / 255.0f;
        float f = 1.0f - fAlpha;
        float f2 = (fAlpha2 * f) + fAlpha;
        if (f2 == 0.0f) {
            return 0;
        }
        return Color.argb((int) (255.0f * f2), (int) (((Color.red(i2) * fAlpha) + ((Color.red(i) * fAlpha2) * f)) / f2), (int) (((Color.green(i2) * fAlpha) + ((Color.green(i) * fAlpha2) * f)) / f2), (int) (((Color.blue(i2) * fAlpha) + ((Color.blue(i) * fAlpha2) * f)) / f2));
    }

    public static int adaptHue(int i, int i2) {
        float[] tempHsv = getTempHsv(5);
        Color.colorToHSV(i2, tempHsv);
        float f = tempHsv[0];
        float f2 = tempHsv[1];
        Color.colorToHSV(i, tempHsv);
        tempHsv[0] = f;
        tempHsv[1] = AndroidUtilities.lerp(tempHsv[1], f2, 0.25f);
        return Color.HSVToColor(Color.alpha(i), tempHsv);
    }

    public static int adaptHSV(int i, float f, float f2) {
        float[] tempHsv = getTempHsv(5);
        Color.colorToHSV(i, tempHsv);
        float f3 = tempHsv[1];
        if (f3 > 0.1f && f3 < 0.9f) {
            tempHsv[1] = MathUtils.clamp(f3 + f, 0.0f, 1.0f);
        }
        tempHsv[2] = MathUtils.clamp(tempHsv[2] + f2, 0.0f, 1.0f);
        return Color.HSVToColor(Color.alpha(i), tempHsv);
    }

    public static int multAlpha(int i, float f) {
        return f == 1.0f ? i : ColorUtils.setAlphaComponent(i, MathUtils.clamp((int) (Color.alpha(i) * f), 0, 255));
    }

    public static class OverrideWallpaperInfo {
        public long accessHash;
        public int color;
        public long dialogId;
        public String fileName;
        public boolean forBoth;
        public int gradientColor1;
        public int gradientColor2;
        public int gradientColor3;
        public float intensity;
        public boolean isBlurred;
        public boolean isMotion;
        public String originalFileName;
        public ThemeAccent parentAccent;
        public ThemeInfo parentTheme;
        public TLRPC.WallPaper prevUserWallpaper;
        public ArrayList requestIds;
        public int rotation;
        public String slug;
        public float uploadingProgress;
        public long wallpaperId;

        public OverrideWallpaperInfo() {
            this.fileName = "";
            this.originalFileName = "";
            this.slug = "";
        }

        public OverrideWallpaperInfo(OverrideWallpaperInfo overrideWallpaperInfo, ThemeInfo themeInfo, ThemeAccent themeAccent) {
            this.fileName = "";
            this.originalFileName = "";
            this.slug = "";
            this.slug = overrideWallpaperInfo.slug;
            this.color = overrideWallpaperInfo.color;
            this.gradientColor1 = overrideWallpaperInfo.gradientColor1;
            this.gradientColor2 = overrideWallpaperInfo.gradientColor2;
            this.gradientColor3 = overrideWallpaperInfo.gradientColor3;
            this.rotation = overrideWallpaperInfo.rotation;
            this.isBlurred = overrideWallpaperInfo.isBlurred;
            this.isMotion = overrideWallpaperInfo.isMotion;
            this.intensity = overrideWallpaperInfo.intensity;
            this.parentTheme = themeInfo;
            this.parentAccent = themeAccent;
            if (!TextUtils.isEmpty(overrideWallpaperInfo.fileName)) {
                try {
                    File file = new File(ApplicationLoader.getFilesDirFixed(), overrideWallpaperInfo.fileName);
                    File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                    String strGenerateWallpaperName = this.parentTheme.generateWallpaperName(this.parentAccent, false);
                    this.fileName = strGenerateWallpaperName;
                    AndroidUtilities.copyFile(file, new File(filesDirFixed, strGenerateWallpaperName));
                } catch (Exception e) {
                    this.fileName = "";
                    FileLog.e(e);
                }
            } else {
                this.fileName = "";
            }
            if (!TextUtils.isEmpty(overrideWallpaperInfo.originalFileName)) {
                if (!overrideWallpaperInfo.originalFileName.equals(overrideWallpaperInfo.fileName)) {
                    try {
                        File file2 = new File(ApplicationLoader.getFilesDirFixed(), overrideWallpaperInfo.originalFileName);
                        File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                        String strGenerateWallpaperName2 = this.parentTheme.generateWallpaperName(this.parentAccent, true);
                        this.originalFileName = strGenerateWallpaperName2;
                        AndroidUtilities.copyFile(file2, new File(filesDirFixed2, strGenerateWallpaperName2));
                        return;
                    } catch (Exception e2) {
                        this.originalFileName = "";
                        FileLog.e(e2);
                        return;
                    }
                }
                this.originalFileName = this.fileName;
                return;
            }
            this.originalFileName = "";
        }

        public boolean isDefault() {
            return "d".equals(this.slug);
        }

        public boolean isColor() {
            return "c".equals(this.slug);
        }

        public boolean isTheme() {
            return "t".equals(this.slug);
        }

        public void saveOverrideWallpaper() {
            ThemeInfo themeInfo = this.parentTheme;
            if (themeInfo != null) {
                ThemeAccent themeAccent = this.parentAccent;
                if (themeAccent != null || themeInfo.overrideWallpaper == this) {
                    if (themeAccent == null || themeAccent.overrideWallpaper == this) {
                        save();
                    }
                }
            }
        }

        private String getKey() {
            if (this.parentAccent != null) {
                return this.parentTheme.name + "_" + this.parentAccent.id + "_owp";
            }
            return this.parentTheme.name + "_owp";
        }

        public void save() {
            try {
                String key = getKey();
                SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("wall", this.fileName);
                jSONObject.put("owall", this.originalFileName);
                jSONObject.put("pColor", this.color);
                jSONObject.put("pGrColor", this.gradientColor1);
                jSONObject.put("pGrColor2", this.gradientColor2);
                jSONObject.put("pGrColor3", this.gradientColor3);
                jSONObject.put("pGrAngle", this.rotation);
                String str = this.slug;
                if (str == null) {
                    str = "";
                }
                jSONObject.put("wallSlug", str);
                jSONObject.put("wBlur", this.isBlurred);
                jSONObject.put("wMotion", this.isMotion);
                jSONObject.put("pIntensity", this.intensity);
                editorEdit.putString(key, jSONObject.toString());
                editorEdit.commit();
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }

        public void delete() {
            ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(getKey()).commit();
            new File(ApplicationLoader.getFilesDirFixed(), this.fileName).delete();
            new File(ApplicationLoader.getFilesDirFixed(), this.originalFileName).delete();
        }
    }

    public static class ThemeInfo implements NotificationCenter.NotificationCenterDelegate {
        public int accentBaseColor;
        public LongSparseArray accentsByThemeId;
        public int account;
        public String assetName;
        public boolean badWallpaper;
        public LongSparseArray chatAccentsByThemeId;
        public int currentAccentId;
        public int defaultAccentCount;
        public boolean firstAccentIsDefault;
        public TLRPC.TL_theme info;
        public boolean isBlured;
        private int isDark;
        public boolean isMotion;
        public int lastAccentId;
        public int lastChatThemeId;
        public boolean loaded;
        private String loadingThemeWallpaperName;
        public String name;
        private String newPathToWallpaper;
        public OverrideWallpaperInfo overrideWallpaper;
        public String pathToFile;
        public String pathToWallpaper;
        public int patternBgColor;
        public int patternBgGradientColor1;
        public int patternBgGradientColor2;
        public int patternBgGradientColor3;
        public int patternBgGradientRotation;
        public int patternIntensity;
        public int prevAccentId;
        private int previewBackgroundColor;
        public int previewBackgroundGradientColor1;
        public int previewBackgroundGradientColor2;
        public int previewBackgroundGradientColor3;
        private int previewInColor;
        private int previewOutColor;
        public boolean previewParsed;
        public int previewWallpaperOffset;
        public String slug;
        public int sortIndex;
        public ArrayList themeAccents;
        public SparseArray themeAccentsMap;
        public boolean themeLoaded;
        public TLRPC.InputFile uploadedFile;
        public TLRPC.InputFile uploadedThumb;
        public String uploadingFile;
        public String uploadingThumb;

        ThemeInfo() {
            this.patternBgGradientRotation = 45;
            this.loaded = true;
            this.themeLoaded = true;
            this.prevAccentId = -1;
            this.chatAccentsByThemeId = new LongSparseArray();
            this.lastChatThemeId = 0;
            this.lastAccentId = 100;
            this.isDark = -1;
        }

        public ThemeInfo(ThemeInfo themeInfo) {
            this.patternBgGradientRotation = 45;
            this.loaded = true;
            this.themeLoaded = true;
            this.prevAccentId = -1;
            this.chatAccentsByThemeId = new LongSparseArray();
            this.lastChatThemeId = 0;
            this.lastAccentId = 100;
            this.isDark = -1;
            this.name = themeInfo.name;
            this.pathToFile = themeInfo.pathToFile;
            this.pathToWallpaper = themeInfo.pathToWallpaper;
            this.assetName = themeInfo.assetName;
            this.slug = themeInfo.slug;
            this.badWallpaper = themeInfo.badWallpaper;
            this.isBlured = themeInfo.isBlured;
            this.isMotion = themeInfo.isMotion;
            this.patternBgColor = themeInfo.patternBgColor;
            this.patternBgGradientColor1 = themeInfo.patternBgGradientColor1;
            this.patternBgGradientColor2 = themeInfo.patternBgGradientColor2;
            this.patternBgGradientColor3 = themeInfo.patternBgGradientColor3;
            this.patternBgGradientRotation = themeInfo.patternBgGradientRotation;
            this.patternIntensity = themeInfo.patternIntensity;
            this.account = themeInfo.account;
            this.info = themeInfo.info;
            this.loaded = themeInfo.loaded;
            this.uploadingThumb = themeInfo.uploadingThumb;
            this.uploadingFile = themeInfo.uploadingFile;
            this.uploadedThumb = themeInfo.uploadedThumb;
            this.uploadedFile = themeInfo.uploadedFile;
            this.previewBackgroundColor = themeInfo.previewBackgroundColor;
            this.previewBackgroundGradientColor1 = themeInfo.previewBackgroundGradientColor1;
            this.previewBackgroundGradientColor2 = themeInfo.previewBackgroundGradientColor2;
            this.previewBackgroundGradientColor3 = themeInfo.previewBackgroundGradientColor3;
            this.previewWallpaperOffset = themeInfo.previewWallpaperOffset;
            this.previewInColor = themeInfo.previewInColor;
            this.previewOutColor = themeInfo.previewOutColor;
            this.firstAccentIsDefault = themeInfo.firstAccentIsDefault;
            this.previewParsed = themeInfo.previewParsed;
            this.themeLoaded = themeInfo.themeLoaded;
            this.sortIndex = themeInfo.sortIndex;
            this.defaultAccentCount = themeInfo.defaultAccentCount;
            this.accentBaseColor = themeInfo.accentBaseColor;
            this.currentAccentId = themeInfo.currentAccentId;
            this.prevAccentId = themeInfo.prevAccentId;
            this.themeAccentsMap = themeInfo.themeAccentsMap;
            this.themeAccents = themeInfo.themeAccents;
            this.accentsByThemeId = themeInfo.accentsByThemeId;
            this.lastAccentId = themeInfo.lastAccentId;
            this.loadingThemeWallpaperName = themeInfo.loadingThemeWallpaperName;
            this.newPathToWallpaper = themeInfo.newPathToWallpaper;
            this.overrideWallpaper = themeInfo.overrideWallpaper;
        }

        JSONObject getSaveJson() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", this.name);
                jSONObject.put("path", this.pathToFile);
                jSONObject.put("account", this.account);
                TLRPC.TL_theme tL_theme = this.info;
                if (tL_theme != null) {
                    SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
                    this.info.serializeToStream(serializedData);
                    jSONObject.put("info", Utilities.bytesToHex(serializedData.toByteArray()));
                }
                jSONObject.put("loaded", this.loaded);
                return jSONObject;
            } catch (Exception e) {
                FileLog.e(e);
                return null;
            }
        }

        public void loadWallpapers(SharedPreferences sharedPreferences) {
            ArrayList arrayList = this.themeAccents;
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = this.themeAccents.size();
                for (int i = 0; i < size; i++) {
                    ThemeAccent themeAccent = (ThemeAccent) this.themeAccents.get(i);
                    loadOverrideWallpaper(sharedPreferences, themeAccent, this.name + "_" + themeAccent.id + "_owp");
                }
                return;
            }
            loadOverrideWallpaper(sharedPreferences, null, this.name + "_owp");
        }

        private void loadOverrideWallpaper(SharedPreferences sharedPreferences, ThemeAccent themeAccent, String str) {
            try {
                String string = sharedPreferences.getString(str, null);
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(string);
                OverrideWallpaperInfo overrideWallpaperInfo = new OverrideWallpaperInfo();
                overrideWallpaperInfo.fileName = jSONObject.getString("wall");
                overrideWallpaperInfo.originalFileName = jSONObject.getString("owall");
                overrideWallpaperInfo.color = jSONObject.getInt("pColor");
                overrideWallpaperInfo.gradientColor1 = jSONObject.getInt("pGrColor");
                overrideWallpaperInfo.gradientColor2 = jSONObject.optInt("pGrColor2");
                overrideWallpaperInfo.gradientColor3 = jSONObject.optInt("pGrColor3");
                overrideWallpaperInfo.rotation = jSONObject.getInt("pGrAngle");
                overrideWallpaperInfo.slug = jSONObject.getString("wallSlug");
                overrideWallpaperInfo.isBlurred = jSONObject.getBoolean("wBlur");
                overrideWallpaperInfo.isMotion = jSONObject.getBoolean("wMotion");
                overrideWallpaperInfo.intensity = (float) jSONObject.getDouble("pIntensity");
                overrideWallpaperInfo.parentTheme = this;
                overrideWallpaperInfo.parentAccent = themeAccent;
                if (themeAccent != null) {
                    themeAccent.overrideWallpaper = overrideWallpaperInfo;
                } else {
                    this.overrideWallpaper = overrideWallpaperInfo;
                }
                if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                    overrideWallpaperInfo.slug = "d";
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }

        public void setOverrideWallpaper(OverrideWallpaperInfo overrideWallpaperInfo) {
            if (this.overrideWallpaper == overrideWallpaperInfo) {
                return;
            }
            ThemeAccent accent = getAccent(false);
            OverrideWallpaperInfo overrideWallpaperInfo2 = this.overrideWallpaper;
            if (overrideWallpaperInfo2 != null) {
                overrideWallpaperInfo2.delete();
            }
            if (overrideWallpaperInfo != null) {
                overrideWallpaperInfo.parentAccent = accent;
                overrideWallpaperInfo.parentTheme = this;
                overrideWallpaperInfo.save();
            }
            this.overrideWallpaper = overrideWallpaperInfo;
            if (accent != null) {
                accent.overrideWallpaper = overrideWallpaperInfo;
            }
        }

        public String getName() {
            if ("Blue".equals(this.name)) {
                return LocaleController.getString(R.string.ThemeClassic);
            }
            if ("Dark Blue".equals(this.name)) {
                return LocaleController.getString(R.string.ThemeDark);
            }
            if ("Arctic Blue".equals(this.name)) {
                return LocaleController.getString(R.string.ThemeArcticBlue);
            }
            if ("Day".equals(this.name)) {
                return LocaleController.getString(R.string.ThemeDay);
            }
            if ("Night".equals(this.name)) {
                return LocaleController.getString(R.string.ThemeNight);
            }
            TLRPC.TL_theme tL_theme = this.info;
            return tL_theme != null ? tL_theme.title : this.name;
        }

        public void setCurrentAccentId(int i) {
            this.currentAccentId = i;
            ThemeAccent accent = getAccent(false);
            if (accent != null) {
                this.overrideWallpaper = accent.overrideWallpaper;
            }
        }

        public String generateWallpaperName(ThemeAccent themeAccent, boolean z) {
            StringBuilder sb;
            StringBuilder sb2;
            if (themeAccent == null) {
                themeAccent = getAccent(false);
            }
            if (themeAccent != null) {
                StringBuilder sb3 = new StringBuilder();
                if (z) {
                    sb2 = new StringBuilder();
                    sb2.append(this.name);
                    sb2.append("_");
                    sb2.append(themeAccent.id);
                    sb2.append("_wp_o");
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(this.name);
                    sb2.append("_");
                    sb2.append(themeAccent.id);
                    sb2.append("_wp");
                }
                sb3.append(sb2.toString());
                sb3.append(Utilities.random.nextInt());
                sb3.append(".jpg");
                return sb3.toString();
            }
            StringBuilder sb4 = new StringBuilder();
            if (z) {
                sb = new StringBuilder();
                sb.append(this.name);
                sb.append("_wp_o");
            } else {
                sb = new StringBuilder();
                sb.append(this.name);
                sb.append("_wp");
            }
            sb4.append(sb.toString());
            sb4.append(Utilities.random.nextInt());
            sb4.append(".jpg");
            return sb4.toString();
        }

        public void setPreviewInColor(int i) {
            this.previewInColor = i;
        }

        public void setPreviewOutColor(int i) {
            this.previewOutColor = i;
        }

        public void setPreviewBackgroundColor(int i) {
            this.previewBackgroundColor = i;
        }

        public int getPreviewInColor() {
            if (this.firstAccentIsDefault && this.currentAccentId == Theme.DEFALT_THEME_ACCENT_ID) {
                return -1;
            }
            return this.previewInColor;
        }

        public int getPreviewOutColor() {
            if (this.firstAccentIsDefault && this.currentAccentId == Theme.DEFALT_THEME_ACCENT_ID) {
                return -983328;
            }
            return this.previewOutColor;
        }

        public int getPreviewBackgroundColor() {
            if (this.firstAccentIsDefault && this.currentAccentId == Theme.DEFALT_THEME_ACCENT_ID) {
                return -3155485;
            }
            return this.previewBackgroundColor;
        }

        public boolean isDefaultMyMessagesBubbles() {
            if (!this.firstAccentIsDefault) {
                return false;
            }
            int i = this.currentAccentId;
            int i2 = Theme.DEFALT_THEME_ACCENT_ID;
            if (i == i2) {
                return true;
            }
            ThemeAccent themeAccent = (ThemeAccent) this.themeAccentsMap.get(i2);
            ThemeAccent themeAccent2 = (ThemeAccent) this.themeAccentsMap.get(this.currentAccentId);
            return themeAccent != null && themeAccent2 != null && themeAccent.myMessagesAccentColor == themeAccent2.myMessagesAccentColor && themeAccent.myMessagesGradientAccentColor1 == themeAccent2.myMessagesGradientAccentColor1 && themeAccent.myMessagesGradientAccentColor2 == themeAccent2.myMessagesGradientAccentColor2 && themeAccent.myMessagesGradientAccentColor3 == themeAccent2.myMessagesGradientAccentColor3 && themeAccent.myMessagesAnimated == themeAccent2.myMessagesAnimated;
        }

        public boolean isDefaultMyMessages() {
            if (!this.firstAccentIsDefault) {
                return false;
            }
            int i = this.currentAccentId;
            int i2 = Theme.DEFALT_THEME_ACCENT_ID;
            if (i == i2) {
                return true;
            }
            ThemeAccent themeAccent = (ThemeAccent) this.themeAccentsMap.get(i2);
            ThemeAccent themeAccent2 = (ThemeAccent) this.themeAccentsMap.get(this.currentAccentId);
            return themeAccent != null && themeAccent2 != null && themeAccent.accentColor2 == themeAccent2.accentColor2 && themeAccent.myMessagesAccentColor == themeAccent2.myMessagesAccentColor && themeAccent.myMessagesGradientAccentColor1 == themeAccent2.myMessagesGradientAccentColor1 && themeAccent.myMessagesGradientAccentColor2 == themeAccent2.myMessagesGradientAccentColor2 && themeAccent.myMessagesGradientAccentColor3 == themeAccent2.myMessagesGradientAccentColor3 && themeAccent.myMessagesAnimated == themeAccent2.myMessagesAnimated;
        }

        public boolean isDefaultMainAccent() {
            if (!this.firstAccentIsDefault) {
                return false;
            }
            int i = this.currentAccentId;
            int i2 = Theme.DEFALT_THEME_ACCENT_ID;
            if (i == i2) {
                return true;
            }
            ThemeAccent themeAccent = (ThemeAccent) this.themeAccentsMap.get(i2);
            ThemeAccent themeAccent2 = (ThemeAccent) this.themeAccentsMap.get(this.currentAccentId);
            return (themeAccent2 == null || themeAccent == null || themeAccent.accentColor != themeAccent2.accentColor) ? false : true;
        }

        public boolean hasAccentColors() {
            return this.defaultAccentCount != 0;
        }

        public boolean isDark() {
            int i = this.isDark;
            if (i != -1) {
                return i == 1;
            }
            if ("Dark Blue".equals(this.name) || "Night".equals(this.name)) {
                this.isDark = 1;
            } else if ("Blue".equals(this.name) || "Arctic Blue".equals(this.name) || "Day".equals(this.name)) {
                this.isDark = 0;
            }
            if (this.isDark == -1) {
                Theme.checkIsDark(Theme.getThemeFileValues(new File(this.pathToFile), null, new String[1]), this);
            }
            return this.isDark == 1;
        }

        public boolean isLight() {
            return this.pathToFile == null && !isDark();
        }

        public String getKey() {
            if (this.info != null) {
                return "remote" + this.info.id;
            }
            return this.name;
        }

        static ThemeInfo createWithJson(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            try {
                ThemeInfo themeInfo = new ThemeInfo();
                themeInfo.name = jSONObject.getString("name");
                themeInfo.pathToFile = jSONObject.getString("path");
                if (jSONObject.has("account")) {
                    themeInfo.account = jSONObject.getInt("account");
                }
                if (jSONObject.has("info")) {
                    try {
                        SerializedData serializedData = new SerializedData(Utilities.hexToBytes(jSONObject.getString("info")));
                        themeInfo.info = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    } catch (Throwable th) {
                        FileLog.e(th);
                    }
                }
                if (jSONObject.has("loaded")) {
                    themeInfo.loaded = jSONObject.getBoolean("loaded");
                }
                return themeInfo;
            } catch (Exception e) {
                FileLog.e(e);
                return null;
            }
        }

        static ThemeInfo createWithString(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String[] strArrSplit = str.split("\\|");
            if (strArrSplit.length != 2) {
                return null;
            }
            ThemeInfo themeInfo = new ThemeInfo();
            themeInfo.name = strArrSplit[0];
            themeInfo.pathToFile = strArrSplit[1];
            return themeInfo;
        }

        public void setAccentColorOptions(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
            this.defaultAccentCount = iArr.length;
            this.themeAccents = new ArrayList();
            this.themeAccentsMap = new SparseArray();
            this.accentsByThemeId = new LongSparseArray();
            for (int i = 0; i < iArr.length; i++) {
                ThemeAccent themeAccent = new ThemeAccent();
                themeAccent.id = iArr8 != null ? iArr8[i] : i;
                if (Theme.isHome(themeAccent)) {
                    themeAccent.isDefault = true;
                }
                themeAccent.accentColor = iArr[i];
                themeAccent.parentTheme = this;
                if (iArr2 != null) {
                    themeAccent.myMessagesAccentColor = iArr2[i];
                }
                if (iArr3 != null) {
                    themeAccent.myMessagesGradientAccentColor1 = iArr3[i];
                }
                if (iArr4 != null) {
                    long j = iArr4[i];
                    themeAccent.backgroundOverrideColor = j;
                    if (this.firstAccentIsDefault && themeAccent.id == Theme.DEFALT_THEME_ACCENT_ID) {
                        themeAccent.backgroundOverrideColor = 4294967296L;
                    } else {
                        themeAccent.backgroundOverrideColor = j;
                    }
                }
                if (iArr5 != null) {
                    if (this.firstAccentIsDefault && themeAccent.id == Theme.DEFALT_THEME_ACCENT_ID) {
                        themeAccent.backgroundGradientOverrideColor1 = 4294967296L;
                    } else {
                        themeAccent.backgroundGradientOverrideColor1 = iArr5[i];
                    }
                }
                if (iArr6 != null) {
                    if (this.firstAccentIsDefault && themeAccent.id == Theme.DEFALT_THEME_ACCENT_ID) {
                        themeAccent.backgroundGradientOverrideColor2 = 4294967296L;
                    } else {
                        themeAccent.backgroundGradientOverrideColor2 = iArr6[i];
                    }
                }
                if (iArr7 != null) {
                    if (this.firstAccentIsDefault && themeAccent.id == Theme.DEFALT_THEME_ACCENT_ID) {
                        themeAccent.backgroundGradientOverrideColor3 = 4294967296L;
                    } else {
                        themeAccent.backgroundGradientOverrideColor3 = iArr7[i];
                    }
                }
                if (strArr != null) {
                    themeAccent.patternIntensity = iArr10[i] / 100.0f;
                    themeAccent.backgroundRotation = iArr9[i];
                    themeAccent.patternSlug = strArr[i];
                }
                if ((Theme.isHome(themeAccent) && this.name.equals("Dark Blue")) || this.name.equals("Night")) {
                    themeAccent.myMessagesAccentColor = -14316059;
                    themeAccent.myMessagesGradientAccentColor1 = -12422433;
                    themeAccent.myMessagesGradientAccentColor2 = -8304937;
                    themeAccent.myMessagesGradientAccentColor3 = -6340950;
                    if (this.name.equals("Night")) {
                        themeAccent.patternIntensity = -0.57f;
                        themeAccent.backgroundOverrideColor = -9666650L;
                        themeAccent.backgroundGradientOverrideColor1 = -13749173L;
                        themeAccent.backgroundGradientOverrideColor2 = -8883033L;
                        themeAccent.backgroundGradientOverrideColor3 = -13421992L;
                    }
                }
                this.themeAccentsMap.put(themeAccent.id, themeAccent);
                this.themeAccents.add(themeAccent);
            }
            this.accentBaseColor = ((ThemeAccent) this.themeAccentsMap.get(0)).accentColor;
        }

        public void loadThemeDocument() {
            this.loaded = false;
            this.loadingThemeWallpaperName = null;
            this.newPathToWallpaper = null;
            addObservers();
            FileLoader fileLoader = FileLoader.getInstance(this.account);
            TLRPC.TL_theme tL_theme = this.info;
            fileLoader.loadFile(tL_theme.document, tL_theme, 1, 1);
        }

        private void addObservers() {
            NotificationCenter.getInstance(this.account).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(this.account).addObserver(this, NotificationCenter.fileLoadFailed);
        }

        public void removeObservers() {
            NotificationCenter.getInstance(this.account).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(this.account).removeObserver(this, NotificationCenter.fileLoadFailed);
        }

        public void onFinishLoadingRemoteTheme() {
            this.loaded = true;
            this.previewParsed = false;
            Theme.saveOtherThemes(true);
            if (this == Theme.currentTheme && Theme.previousTheme == null) {
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.needSetDayNightTheme, this, Boolean.valueOf(this == Theme.currentNightTheme), null, -1, Theme.fallbackKeys);
            }
        }

        public static boolean accentEquals(ThemeAccent themeAccent, TLRPC.ThemeSettings themeSettings) {
            boolean z;
            boolean z2;
            long wallpaperColor;
            long wallpaperColor2;
            long wallpaperColor3;
            String str;
            int wallpaperColor4;
            int wallpaperRotation;
            float f;
            TLRPC.WallPaperSettings wallPaperSettings;
            int iIntValue = themeSettings.message_colors.size() > 0 ? themeSettings.message_colors.get(0).intValue() | (-16777216) : 0;
            int iIntValue2 = themeSettings.message_colors.size() > 1 ? themeSettings.message_colors.get(1).intValue() | (-16777216) : 0;
            if (iIntValue == iIntValue2) {
                iIntValue2 = 0;
            }
            int iIntValue3 = themeSettings.message_colors.size() > 2 ? themeSettings.message_colors.get(2).intValue() | (-16777216) : 0;
            int iIntValue4 = themeSettings.message_colors.size() > 3 ? (-16777216) | themeSettings.message_colors.get(3).intValue() : 0;
            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
            if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null) {
                wallpaperColor4 = Theme.getWallpaperColor(wallPaperSettings.background_color);
                int i = themeSettings.wallpaper.settings.second_background_color;
                wallpaperColor = i == 0 ? 4294967296L : Theme.getWallpaperColor(i);
                int i2 = themeSettings.wallpaper.settings.third_background_color;
                wallpaperColor2 = i2 == 0 ? 4294967296L : Theme.getWallpaperColor(i2);
                int i3 = themeSettings.wallpaper.settings.fourth_background_color;
                wallpaperColor3 = i3 != 0 ? Theme.getWallpaperColor(i3) : 4294967296L;
                wallpaperRotation = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
                z = false;
                TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
                z2 = true;
                if ((wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) || !wallPaper2.pattern) {
                    str = null;
                } else {
                    str = wallPaper2.slug;
                    f = wallPaper2.settings.intensity / 100.0f;
                }
                return (themeSettings.accent_color != themeAccent.accentColor && themeSettings.outbox_accent_color == themeAccent.accentColor2 && iIntValue == themeAccent.myMessagesAccentColor && iIntValue2 == themeAccent.myMessagesGradientAccentColor1 && iIntValue3 == themeAccent.myMessagesGradientAccentColor2 && iIntValue4 == themeAccent.myMessagesGradientAccentColor3 && themeSettings.message_colors_animated == themeAccent.myMessagesAnimated && ((long) wallpaperColor4) == themeAccent.backgroundOverrideColor && wallpaperColor == themeAccent.backgroundGradientOverrideColor1 && wallpaperColor2 == themeAccent.backgroundGradientOverrideColor2 && wallpaperColor3 == themeAccent.backgroundGradientOverrideColor3 && wallpaperRotation == themeAccent.backgroundRotation && TextUtils.equals(str, themeAccent.patternSlug) && ((double) Math.abs(f - themeAccent.patternIntensity)) < 0.001d) ? z2 : z;
            }
            z = false;
            z2 = true;
            wallpaperColor = 0;
            wallpaperColor2 = 0;
            wallpaperColor3 = 0;
            str = null;
            wallpaperColor4 = 0;
            wallpaperRotation = 0;
            f = 0.0f;
            if (themeSettings.accent_color != themeAccent.accentColor) {
            }
        }

        public static void fillAccentValues(ThemeAccent themeAccent, TLRPC.ThemeSettings themeSettings) {
            TLRPC.WallPaperSettings wallPaperSettings;
            themeAccent.accentColor = themeSettings.accent_color;
            themeAccent.accentColor2 = themeSettings.outbox_accent_color;
            themeAccent.myMessagesAccentColor = themeSettings.message_colors.size() > 0 ? themeSettings.message_colors.get(0).intValue() | (-16777216) : 0;
            int iIntValue = themeSettings.message_colors.size() > 1 ? themeSettings.message_colors.get(1).intValue() | (-16777216) : 0;
            themeAccent.myMessagesGradientAccentColor1 = iIntValue;
            if (themeAccent.myMessagesAccentColor == iIntValue) {
                themeAccent.myMessagesGradientAccentColor1 = 0;
            }
            themeAccent.myMessagesGradientAccentColor2 = themeSettings.message_colors.size() > 2 ? themeSettings.message_colors.get(2).intValue() | (-16777216) : 0;
            themeAccent.myMessagesGradientAccentColor3 = themeSettings.message_colors.size() > 3 ? themeSettings.message_colors.get(3).intValue() | (-16777216) : 0;
            themeAccent.myMessagesAnimated = themeSettings.message_colors_animated;
            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
            if (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null) {
                return;
            }
            int i = wallPaperSettings.background_color;
            if (i == 0) {
                themeAccent.backgroundOverrideColor = 4294967296L;
            } else {
                themeAccent.backgroundOverrideColor = Theme.getWallpaperColor(i);
            }
            TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings2.flags & 16) != 0 && wallPaperSettings2.second_background_color == 0) {
                themeAccent.backgroundGradientOverrideColor1 = 4294967296L;
            } else {
                themeAccent.backgroundGradientOverrideColor1 = Theme.getWallpaperColor(wallPaperSettings2.second_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) != 0 && wallPaperSettings3.third_background_color == 0) {
                themeAccent.backgroundGradientOverrideColor2 = 4294967296L;
            } else {
                themeAccent.backgroundGradientOverrideColor2 = Theme.getWallpaperColor(wallPaperSettings3.third_background_color);
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) != 0 && wallPaperSettings4.fourth_background_color == 0) {
                themeAccent.backgroundGradientOverrideColor3 = 4294967296L;
            } else {
                themeAccent.backgroundGradientOverrideColor3 = Theme.getWallpaperColor(wallPaperSettings4.fourth_background_color);
            }
            themeAccent.backgroundRotation = AndroidUtilities.getWallpaperRotation(themeSettings.wallpaper.settings.rotation, false);
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            if ((wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) || !wallPaper2.pattern) {
                return;
            }
            themeAccent.patternSlug = wallPaper2.slug;
            TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
            themeAccent.patternIntensity = wallPaperSettings5.intensity / 100.0f;
            themeAccent.patternMotion = wallPaperSettings5.motion;
        }

        public ThemeAccent createNewAccent(TLRPC.ThemeSettings themeSettings) {
            ThemeAccent themeAccent = new ThemeAccent();
            fillAccentValues(themeAccent, themeSettings);
            themeAccent.parentTheme = this;
            return themeAccent;
        }

        public ThemeAccent createNewAccent(TLRPC.TL_theme tL_theme, int i) {
            return createNewAccent(tL_theme, i, false, 0);
        }

        public ThemeAccent createNewAccent(TLRPC.TL_theme tL_theme, int i, boolean z, int i2) {
            if (tL_theme == null) {
                return null;
            }
            return createNewAccent(tL_theme.id, i2 < tL_theme.settings.size() ? tL_theme.settings.get(i2) : null, tL_theme, i, z);
        }

        public ThemeAccent createNewAccent(long j, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i, boolean z) {
            if (z) {
                ThemeAccent themeAccent = (ThemeAccent) this.chatAccentsByThemeId.get(j);
                if (themeAccent != null) {
                    return themeAccent;
                }
                int i2 = this.lastChatThemeId + 1;
                this.lastChatThemeId = i2;
                ThemeAccent themeAccentCreateNewAccent = createNewAccent(themeSettings);
                themeAccentCreateNewAccent.id = i2;
                themeAccentCreateNewAccent.info = tL_theme;
                themeAccentCreateNewAccent.account = i;
                this.chatAccentsByThemeId.put(i2, themeAccentCreateNewAccent);
                return themeAccentCreateNewAccent;
            }
            ThemeAccent themeAccent2 = (ThemeAccent) this.accentsByThemeId.get(j);
            if (themeAccent2 != null) {
                return themeAccent2;
            }
            int i3 = this.lastAccentId + 1;
            this.lastAccentId = i3;
            ThemeAccent themeAccentCreateNewAccent2 = createNewAccent(themeSettings);
            themeAccentCreateNewAccent2.id = i3;
            themeAccentCreateNewAccent2.info = tL_theme;
            themeAccentCreateNewAccent2.account = i;
            this.themeAccentsMap.put(i3, themeAccentCreateNewAccent2);
            this.themeAccents.add(0, themeAccentCreateNewAccent2);
            Theme.sortAccents(this);
            this.accentsByThemeId.put(j, themeAccentCreateNewAccent2);
            return themeAccentCreateNewAccent2;
        }

        public ThemeAccent getAccent(boolean z) {
            ThemeAccent themeAccent;
            if (this.themeAccents == null || (themeAccent = (ThemeAccent) this.themeAccentsMap.get(this.currentAccentId)) == null) {
                return null;
            }
            if (!z) {
                return themeAccent;
            }
            int i = this.lastAccentId + 1;
            this.lastAccentId = i;
            ThemeAccent themeAccent2 = new ThemeAccent();
            themeAccent2.accentColor = themeAccent.accentColor;
            themeAccent2.accentColor2 = themeAccent.accentColor2;
            themeAccent2.myMessagesAccentColor = themeAccent.myMessagesAccentColor;
            themeAccent2.myMessagesGradientAccentColor1 = themeAccent.myMessagesGradientAccentColor1;
            themeAccent2.myMessagesGradientAccentColor2 = themeAccent.myMessagesGradientAccentColor2;
            themeAccent2.myMessagesGradientAccentColor3 = themeAccent.myMessagesGradientAccentColor3;
            themeAccent2.myMessagesAnimated = themeAccent.myMessagesAnimated;
            themeAccent2.backgroundOverrideColor = themeAccent.backgroundOverrideColor;
            themeAccent2.backgroundGradientOverrideColor1 = themeAccent.backgroundGradientOverrideColor1;
            themeAccent2.backgroundGradientOverrideColor2 = themeAccent.backgroundGradientOverrideColor2;
            themeAccent2.backgroundGradientOverrideColor3 = themeAccent.backgroundGradientOverrideColor3;
            themeAccent2.backgroundRotation = themeAccent.backgroundRotation;
            themeAccent2.patternSlug = themeAccent.patternSlug;
            themeAccent2.patternIntensity = themeAccent.patternIntensity;
            themeAccent2.patternMotion = themeAccent.patternMotion;
            themeAccent2.parentTheme = this;
            OverrideWallpaperInfo overrideWallpaperInfo = this.overrideWallpaper;
            if (overrideWallpaperInfo != null) {
                themeAccent2.overrideWallpaper = new OverrideWallpaperInfo(overrideWallpaperInfo, this, themeAccent2);
            }
            this.prevAccentId = this.currentAccentId;
            themeAccent2.id = i;
            this.currentAccentId = i;
            this.overrideWallpaper = themeAccent2.overrideWallpaper;
            this.themeAccentsMap.put(i, themeAccent2);
            this.themeAccents.add(0, themeAccent2);
            Theme.sortAccents(this);
            return themeAccent2;
        }

        public int getAccentColor(int i) {
            ThemeAccent themeAccent = (ThemeAccent) this.themeAccentsMap.get(i);
            if (themeAccent != null) {
                return themeAccent.accentColor;
            }
            return 0;
        }

        public boolean createBackground(File file, String str) {
            int patternColor;
            try {
                Bitmap scaledBitmap = AndroidUtilities.getScaledBitmap(AndroidUtilities.dp(640.0f), AndroidUtilities.dp(360.0f), file.getAbsolutePath(), null, 0);
                if (scaledBitmap != null && this.patternBgColor != 0) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(scaledBitmap.getWidth(), scaledBitmap.getHeight(), scaledBitmap.getConfig());
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    int i = this.patternBgGradientColor2;
                    if (i != 0) {
                        patternColor = MotionBackgroundDrawable.getPatternColor(this.patternBgColor, this.patternBgGradientColor1, i, this.patternBgGradientColor3);
                    } else {
                        int i2 = this.patternBgGradientColor1;
                        if (i2 != 0) {
                            patternColor = AndroidUtilities.getAverageColor(this.patternBgColor, i2);
                            GradientDrawable gradientDrawable = new GradientDrawable(BackgroundGradientDrawable.getGradientOrientation(this.patternBgGradientRotation), new int[]{this.patternBgColor, this.patternBgGradientColor1});
                            gradientDrawable.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                            gradientDrawable.draw(canvas);
                        } else {
                            patternColor = AndroidUtilities.getPatternColor(this.patternBgColor);
                            canvas.drawColor(this.patternBgColor);
                        }
                    }
                    Paint paint = new Paint(2);
                    paint.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                    paint.setAlpha((int) ((this.patternIntensity / 100.0f) * 255.0f));
                    canvas.drawBitmap(scaledBitmap, 0.0f, 0.0f, paint);
                    canvas.setBitmap(null);
                    scaledBitmap = bitmapCreateBitmap;
                }
                if (this.isBlured) {
                    scaledBitmap = Utilities.blurWallpaper(scaledBitmap);
                }
                FileOutputStream fileOutputStream = new FileOutputStream(str);
                scaledBitmap.compress(this.patternBgGradientColor2 != 0 ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                fileOutputStream.close();
                return true;
            } catch (Throwable th) {
                FileLog.e(th);
                return false;
            }
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            int i3 = NotificationCenter.fileLoaded;
            if (i == i3 || i == NotificationCenter.fileLoadFailed) {
                String str = (String) objArr[0];
                TLRPC.TL_theme tL_theme = this.info;
                if (tL_theme == null || tL_theme.document == null) {
                    return;
                }
                if (str.equals(this.loadingThemeWallpaperName)) {
                    this.loadingThemeWallpaperName = null;
                    final File file = (File) objArr[1];
                    Utilities.globalQueue.postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            Theme.ThemeInfo.$r8$lambda$g3vjPPviGM52HV2bdy2qgJepTyA(this.f$0, file);
                        }
                    });
                    return;
                }
                if (str.equals(FileLoader.getAttachFileName(this.info.document))) {
                    removeObservers();
                    if (i == i3) {
                        File file2 = new File(this.pathToFile);
                        TLRPC.TL_theme tL_theme2 = this.info;
                        final ThemeInfo themeInfoFillThemeValues = Theme.fillThemeValues(file2, tL_theme2.title, tL_theme2);
                        if (themeInfoFillThemeValues != null && themeInfoFillThemeValues.pathToWallpaper != null && !new File(themeInfoFillThemeValues.pathToWallpaper).exists()) {
                            this.patternBgColor = themeInfoFillThemeValues.patternBgColor;
                            this.patternBgGradientColor1 = themeInfoFillThemeValues.patternBgGradientColor1;
                            this.patternBgGradientColor2 = themeInfoFillThemeValues.patternBgGradientColor2;
                            this.patternBgGradientColor3 = themeInfoFillThemeValues.patternBgGradientColor3;
                            this.patternBgGradientRotation = themeInfoFillThemeValues.patternBgGradientRotation;
                            this.isBlured = themeInfoFillThemeValues.isBlured;
                            this.patternIntensity = themeInfoFillThemeValues.patternIntensity;
                            this.newPathToWallpaper = themeInfoFillThemeValues.pathToWallpaper;
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = themeInfoFillThemeValues.slug;
                            getwallpaper.wallpaper = tL_inputWallPaperSlug;
                            ConnectionsManager.getInstance(themeInfoFillThemeValues.account).sendRequest(getwallpaper, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    Theme.ThemeInfo.m1281$r8$lambda$c_j19Zuji1OQz3z1YRI_mf1uqU(this.f$0, themeInfoFillThemeValues, tLObject, tL_error);
                                }
                            });
                            return;
                        }
                        onFinishLoadingRemoteTheme();
                    }
                }
            }
        }

        public static void $r8$lambda$g3vjPPviGM52HV2bdy2qgJepTyA(final ThemeInfo themeInfo, File file) {
            themeInfo.createBackground(file, themeInfo.newPathToWallpaper);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.onFinishLoadingRemoteTheme();
                }
            });
        }

        public static void m1281$r8$lambda$c_j19Zuji1OQz3z1YRI_mf1uqU(final ThemeInfo themeInfo, final ThemeInfo themeInfo2, final TLObject tLObject, TLRPC.TL_error tL_error) {
            themeInfo.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    Theme.ThemeInfo.$r8$lambda$IkN0vPgptelwfw2FsHLDJYaiwnM(this.f$0, tLObject, themeInfo2);
                }
            });
        }

        public static void $r8$lambda$IkN0vPgptelwfw2FsHLDJYaiwnM(ThemeInfo themeInfo, TLObject tLObject, ThemeInfo themeInfo2) {
            themeInfo.getClass();
            if (tLObject instanceof TLRPC.TL_wallPaper) {
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject;
                themeInfo.loadingThemeWallpaperName = FileLoader.getAttachFileName(tL_wallPaper.document);
                themeInfo.addObservers();
                FileLoader.getInstance(themeInfo2.account).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                return;
            }
            themeInfo.onFinishLoadingRemoteTheme();
        }
    }

    public interface ResourcesProvider {
        void applyServiceShaderMatrix(int i, int i2, float f, float f2);

        ColorFilter getAnimatedEmojiColorFilter();

        int getColor(int i);

        int getColorOrDefault(int i);

        int getCurrentColor(int i);

        Drawable getDrawable(String str);

        Paint getPaint(String str);

        boolean hasGradientService();

        boolean isDark();

        void setAnimatedColor(int i, int i2);

        public abstract class CC {
            public static Drawable $default$getDrawable(ResourcesProvider resourcesProvider, String str) {
                return null;
            }

            public static boolean $default$hasGradientService(ResourcesProvider resourcesProvider) {
                return false;
            }

            public static void $default$setAnimatedColor(ResourcesProvider resourcesProvider, int i, int i2) {
            }

            public static Paint $default$getPaint(ResourcesProvider resourcesProvider, String str) {
                return Theme.getThemePaint(str);
            }

            public static boolean $default$isDark(ResourcesProvider resourcesProvider) {
                return Theme.isCurrentThemeDark();
            }

            public static ColorFilter $default$getAnimatedEmojiColorFilter(ResourcesProvider resourcesProvider) {
                return Theme.chat_animatedEmojiTextColorFilter;
            }
        }
    }

    public static void sortAccents(ThemeInfo themeInfo) {
        Collections.sort(themeInfo.themeAccents, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return Theme.m1280$r8$lambda$iIb89iYIwD07Wnq6O3Bw32oCr8((Theme.ThemeAccent) obj, (Theme.ThemeAccent) obj2);
            }
        });
    }

    public static int m1280$r8$lambda$iIb89iYIwD07Wnq6O3Bw32oCr8(ThemeAccent themeAccent, ThemeAccent themeAccent2) {
        if (isHome(themeAccent)) {
            return -1;
        }
        if (isHome(themeAccent2)) {
            return 1;
        }
        ?? r0 = themeAccent.isDefault;
        ?? r1 = themeAccent2.isDefault;
        if (r0 != r1) {
            return r0 > r1 ? -1 : 1;
        }
        if (r0 != 0) {
            int i = themeAccent.id;
            int i2 = themeAccent2.id;
            if (i > i2) {
                return 1;
            }
            return i < i2 ? -1 : 0;
        }
        int i3 = themeAccent.id;
        int i4 = themeAccent2.id;
        if (i3 > i4) {
            return -1;
        }
        return i3 < i4 ? 1 : 0;
    }

    public static void saveAutoNightThemeConfig() {
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putInt("selectedAutoNightType", selectedAutoNightType);
        editorEdit.putBoolean("autoNightScheduleByLocation", autoNightScheduleByLocation);
        editorEdit.putFloat("autoNightBrighnessThreshold", autoNightBrighnessThreshold);
        editorEdit.putInt("autoNightDayStartTime", autoNightDayStartTime);
        editorEdit.putInt("autoNightDayEndTime", autoNightDayEndTime);
        editorEdit.putInt("autoNightSunriseTime", autoNightSunriseTime);
        editorEdit.putString("autoNightCityName", autoNightCityName);
        editorEdit.putInt("autoNightSunsetTime", autoNightSunsetTime);
        editorEdit.putLong("autoNightLocationLatitude3", Double.doubleToRawLongBits(autoNightLocationLatitude));
        editorEdit.putLong("autoNightLocationLongitude3", Double.doubleToRawLongBits(autoNightLocationLongitude));
        editorEdit.putInt("autoNightLastSunCheckDay", autoNightLastSunCheckDay);
        ThemeInfo themeInfo = currentNightTheme;
        if (themeInfo != null) {
            editorEdit.putString("nighttheme", themeInfo.getKey());
        } else {
            editorEdit.remove("nighttheme");
        }
        editorEdit.commit();
    }

    private static Drawable getStateDrawable(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 29 && (drawable instanceof StateListDrawable)) {
            return ((StateListDrawable) drawable).getStateDrawable(i);
        }
        if (StateListDrawable_getStateDrawableMethod == null) {
            try {
                StateListDrawable_getStateDrawableMethod = StateListDrawable.class.getDeclaredMethod("getStateDrawable", Integer.TYPE);
            } catch (Throwable unused) {
            }
        }
        Method method = StateListDrawable_getStateDrawableMethod;
        if (method == null) {
            return null;
        }
        try {
            return (Drawable) method.invoke(drawable, Integer.valueOf(i));
        } catch (Exception unused2) {
            return null;
        }
    }

    public static Drawable createEmojiIconSelectorDrawable(Context context, int i, int i2, int i3) {
        Resources resources = context.getResources();
        Drawable drawableMutate = resources.getDrawable(i).mutate();
        if (i2 != 0) {
            drawableMutate.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
        }
        Drawable drawableMutate2 = resources.getDrawable(i).mutate();
        if (i3 != 0) {
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
        }
        StateListDrawable stateListDrawable = new StateListDrawable() {
            @Override
            public boolean selectDrawable(int i4) {
                return super.selectDrawable(i4);
            }
        };
        stateListDrawable.setEnterFadeDuration(1);
        stateListDrawable.setExitFadeDuration(200);
        stateListDrawable.addState(new int[]{16842913}, drawableMutate2);
        stateListDrawable.addState(new int[0], drawableMutate);
        return stateListDrawable;
    }

    public static Drawable createEditTextDrawable(Context context, boolean z) {
        return createEditTextDrawable(context, getColor(z ? key_dialogInputField : key_windowBackgroundWhiteInputField), getColor(z ? key_dialogInputFieldActivated : key_windowBackgroundWhiteInputFieldActivated));
    }

    public static Drawable createEditTextDrawable(Context context, int i, int i2) {
        Resources resources = context.getResources();
        Drawable drawableMutate = resources.getDrawable(R.drawable.search_dark).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(i, mode));
        Drawable drawableMutate2 = resources.getDrawable(R.drawable.search_dark_activated).mutate();
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(i2, mode));
        StateListDrawable stateListDrawable = new StateListDrawable() {
            @Override
            public boolean selectDrawable(int i3) {
                return super.selectDrawable(i3);
            }
        };
        stateListDrawable.addState(new int[]{16842910, 16842908}, drawableMutate2);
        stateListDrawable.addState(new int[]{16842908}, drawableMutate2);
        stateListDrawable.addState(StateSet.WILD_CARD, drawableMutate);
        return stateListDrawable;
    }

    public static boolean canStartHolidayAnimation() {
        return canStartHolidayAnimation;
    }

    public static int getEventType() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i = calendar.get(2);
        int i2 = calendar.get(5);
        calendar.get(12);
        int i3 = calendar.get(11);
        if (i == 11 && i2 >= 24 && i2 <= 31) {
            return 0;
        }
        if (i == 0 && i2 == 1) {
            return 0;
        }
        if (i == 1 && i2 == 14) {
            return 1;
        }
        return ((i != 9 || i2 < 30) && !(i == 10 && i2 == 1 && i3 < 12)) ? -1 : 2;
    }

    public static Drawable getCurrentHolidayDrawable() {
        if (System.currentTimeMillis() - lastHolidayCheckTime >= 60000) {
            lastHolidayCheckTime = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i = calendar.get(2);
            int i2 = calendar.get(5);
            calendar.get(12);
            int i3 = calendar.get(11);
            if (i == 0 && i2 == 1 && i3 <= 23) {
                canStartHolidayAnimation = true;
            } else {
                canStartHolidayAnimation = false;
            }
            if (dialogs_holidayDrawable == null) {
                if (i == 11) {
                    if (i2 >= (BuildVars.DEBUG_PRIVATE_VERSION ? 29 : 31) && i2 <= 31) {
                        dialogs_holidayDrawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.newyear);
                        dialogs_holidayDrawableOffsetX = -AndroidUtilities.dp(3.0f);
                        dialogs_holidayDrawableOffsetY = -AndroidUtilities.dp(-7.0f);
                    } else if (i == 0) {
                        dialogs_holidayDrawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.newyear);
                        dialogs_holidayDrawableOffsetX = -AndroidUtilities.dp(3.0f);
                        dialogs_holidayDrawableOffsetY = -AndroidUtilities.dp(-7.0f);
                    }
                } else if (i == 0 && i2 == 1) {
                    dialogs_holidayDrawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.newyear);
                    dialogs_holidayDrawableOffsetX = -AndroidUtilities.dp(3.0f);
                    dialogs_holidayDrawableOffsetY = -AndroidUtilities.dp(-7.0f);
                }
            }
        }
        return dialogs_holidayDrawable;
    }

    public static int getCurrentHolidayDrawableXOffset() {
        return dialogs_holidayDrawableOffsetX;
    }

    public static int getCurrentHolidayDrawableYOffset() {
        return dialogs_holidayDrawableOffsetY;
    }

    public static ShapeDrawable createCircleDrawable(int i, int i2) {
        OvalShape ovalShape = new OvalShape();
        float f = i;
        ovalShape.resize(f, f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.setIntrinsicWidth(i);
        shapeDrawable.setIntrinsicHeight(i);
        shapeDrawable.getPaint().setColor(i2);
        return shapeDrawable;
    }

    public static Drawable createOutlineCircleDrawable(int i, int i2, int i3) {
        return new Drawable(i3, i2, i) {
            private final Paint paint;
            final int val$color;
            final int val$size;
            final int val$strokeWidth;

            @Override
            public int getOpacity() {
                return -2;
            }

            {
                this.val$strokeWidth = i3;
                this.val$color = i2;
                this.val$size = i;
                Paint paint = new Paint(1);
                this.paint = paint;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(i3);
                paint.setColor(i2);
            }

            @Override
            public void draw(Canvas canvas) {
                Rect bounds = getBounds();
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), this.val$size / 2.0f, this.paint);
            }

            @Override
            public void setAlpha(int i4) {
                this.paint.setAlpha(i4);
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
                this.paint.setColorFilter(colorFilter);
            }

            @Override
            public int getIntrinsicWidth() {
                return this.val$size + this.val$strokeWidth;
            }

            @Override
            public int getIntrinsicHeight() {
                return this.val$size + this.val$strokeWidth;
            }
        };
    }

    public static ShapeDrawable createCircleDrawable(int i, int i2, int i3) {
        OvalShape ovalShape = new OvalShape();
        float f = i;
        ovalShape.resize(f, f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.setIntrinsicWidth(i);
        shapeDrawable.setIntrinsicHeight(i);
        shapeDrawable.getPaint().setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, i2, i3, Shader.TileMode.CLAMP));
        return shapeDrawable;
    }

    public static CombinedDrawable createCircleDrawableWithIcon(int i, int i2) {
        return createCircleDrawableWithIcon(i, i2, 0);
    }

    public static CombinedDrawable createCircleDrawableWithIcon(int i, int i2, int i3) {
        return createCircleDrawableWithIcon(i, i2 != 0 ? ApplicationLoader.applicationContext.getResources().getDrawable(i2).mutate() : null, i3);
    }

    public static CombinedDrawable createCircleDrawableWithIcon(int i, Drawable drawable, int i2) {
        OvalShape ovalShape = new OvalShape();
        float f = i;
        ovalShape.resize(f, f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(-1);
        if (i2 == 1) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        } else if (i2 == 2) {
            paint.setAlpha(0);
        }
        CombinedDrawable combinedDrawable = new CombinedDrawable(shapeDrawable, drawable);
        combinedDrawable.setCustomSize(i, i);
        return combinedDrawable;
    }

    public static float getThemeIntensity(float f) {
        return (f >= 0.0f || getActiveTheme().isDark()) ? f : -f;
    }

    public static void setCombinedDrawableColor(Drawable drawable, int i, boolean z) {
        Drawable background;
        if (drawable instanceof CombinedDrawable) {
            if (z) {
                background = ((CombinedDrawable) drawable).getIcon();
            } else {
                background = ((CombinedDrawable) drawable).getBackground();
            }
            if (background instanceof ColorDrawable) {
                ((ColorDrawable) background).setColor(i);
            } else {
                background.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public static Drawable createSimpleSelectorCircleDrawable(int i, int i2, int i3) {
        OvalShape ovalShape = new OvalShape();
        float f = i;
        ovalShape.resize(f, f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.getPaint().setColor(i2);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(ovalShape);
        shapeDrawable2.getPaint().setColor(-1);
        return new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i3}), shapeDrawable, shapeDrawable2);
    }

    public static ShapeDrawable createRoundRectDrawable(int i, int i2) {
        float f = i;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setColor(i2);
        return shapeDrawable;
    }

    public static InsetDrawable createRoundRectDrawableShadowed(int i, int i2) {
        float f = i;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setColor(i2);
        shapeDrawable.getPaint().setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), multAlpha(285212672, Color.alpha(i2) / 255.0f));
        return new InsetDrawable((Drawable) shapeDrawable, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
    }

    public static GradientDrawable createRoundRectGradientDrawable(int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{i2, i3});
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(i);
        return gradientDrawable;
    }

    public static ShapeDrawable createRoundRectDrawable(int i, int i2, int i3, int i4, int i5) {
        float f = i;
        float f2 = i2;
        float f3 = i3;
        float f4 = i4;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f2, f2, f3, f3, f4, f4}, null, null));
        shapeDrawable.getPaint().setColor(i5);
        return shapeDrawable;
    }

    public static ShapeDrawable createRoundRectDrawable(int i, int i2, int i3) {
        float f = i;
        float f2 = i2;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f2, f2, f2, f2}, null, null));
        shapeDrawable.getPaint().setColor(i3);
        return shapeDrawable;
    }

    public static Drawable createServiceDrawable(int i, View view, View view2) {
        return createServiceDrawable(i, view, view2, chat_actionBackgroundPaint);
    }

    public static Drawable createServiceDrawable(int i, View view, View view2, Paint paint) {
        return createServiceDrawable(i, view, view2, paint, null);
    }

    public static Drawable createServiceDrawable(final int i, final View view, final View view2, final Paint paint, final ResourcesProvider resourcesProvider) {
        return new Drawable() {
            private RectF rect = new RectF();

            @Override
            public int getOpacity() {
                return -2;
            }

            @Override
            public void setAlpha(int i2) {
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }

            @Override
            public void draw(Canvas canvas) {
                Rect bounds = getBounds();
                this.rect.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                Theme.applyServiceShaderMatrixForView(view, view2);
                RectF rectF = this.rect;
                float f = i;
                Paint themePaint = paint;
                if (themePaint == null) {
                    themePaint = Theme.getThemePaint("paintChatActionBackground", resourcesProvider);
                }
                canvas.drawRoundRect(rectF, f, f, themePaint);
                ResourcesProvider resourcesProvider2 = resourcesProvider;
                if (resourcesProvider2 != null) {
                    if (!resourcesProvider2.hasGradientService()) {
                        return;
                    }
                } else if (!Theme.hasGradientService()) {
                    return;
                }
                RectF rectF2 = this.rect;
                float f2 = i;
                canvas.drawRoundRect(rectF2, f2, f2, Theme.getThemePaint("paintChatActionBackgroundDarken", resourcesProvider));
            }
        };
    }

    public static Drawable createSimpleSelectorRoundRectDrawable(int i, int i2, int i3) {
        return createSimpleSelectorRoundRectDrawable(i, i2, i3, i3);
    }

    public static Drawable createSimpleSelectorRoundRectDrawable(int i, int i2, int i3, int i4) {
        return createSimpleSelectorRoundRectDrawable(i, i, i, i, i2, i3, i4);
    }

    public static Drawable createSimpleSelectorRoundRectDrawable(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        float f = i;
        float f2 = i2;
        float f3 = i3;
        float f4 = i4;
        return createSimpleSelectorRoundRectDrawable(new float[]{f, f, f2, f2, f3, f3, f4, f4}, i5, i6, i7);
    }

    private static Drawable createSimpleSelectorRoundRectDrawable(float[] fArr, int i, int i2, int i3) {
        return createSimpleSelectorRoundRectDrawable(fArr, i, i2, i3, 0);
    }

    private static Drawable createSimpleSelectorRoundRectDrawable(float[] fArr, int i, int i2, int i3, int i4) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.setPadding(i4, i4, i4, i4);
        shapeDrawable.getPaint().setColor(i);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable2.getPaint().setColor(i3);
        shapeDrawable2.setPadding(i4, i4, i4, i4);
        return new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i2}), shapeDrawable, shapeDrawable2);
    }

    public static Drawable createSelectorDrawableFromDrawables(Drawable drawable, Drawable drawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, drawable2);
        stateListDrawable.addState(new int[]{16842913}, drawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, drawable);
        return stateListDrawable;
    }

    public static Drawable getRoundRectSelectorDrawable(int i) {
        return getRoundRectSelectorDrawable(AndroidUtilities.dp(3.0f), i);
    }

    public static Drawable getRoundRectSelectorDrawable(int i, int i2) {
        return new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{(i2 & 16777215) | 419430400}), null, createRoundRectDrawable(i, -1));
    }

    public static Drawable createSelectorWithBackgroundDrawable(int i, int i2) {
        return new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i2}), new ColorDrawable(i), new ColorDrawable(i));
    }

    public static Drawable getSelectorDrawable(boolean z) {
        return getSelectorDrawable(getColor(key_listSelector), z);
    }

    public static Drawable getSelectorDrawable(boolean z, ResourcesProvider resourcesProvider) {
        int color = getColor(key_listSelector, resourcesProvider);
        if (z) {
            return getSelectorDrawable(color, key_windowBackgroundWhite, resourcesProvider);
        }
        return createSelectorDrawable(color, 2);
    }

    public static Drawable getSelectorDrawable(int i, boolean z) {
        if (z) {
            return getSelectorDrawable(i, key_windowBackgroundWhite);
        }
        return createSelectorDrawable(i, 2);
    }

    public static Drawable getSelectorDrawable(int i, int i2) {
        return getSelectorDrawable(i, i2, null);
    }

    public static Drawable getSelectorDrawable(int i, int i2, ResourcesProvider resourcesProvider) {
        if (i2 >= 0) {
            return new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i}), new ColorDrawable(getColor(i2, resourcesProvider)), new ColorDrawable(-1));
        }
        return createSelectorDrawable(i, 2);
    }

    public static Drawable createSelectorDrawable(int i) {
        return createSelectorDrawable(i, 1, -1);
    }

    public static Drawable createSelectorDrawable(int i, int i2) {
        return createSelectorDrawable(i, i2, -1);
    }

    public static Drawable createSelectorDrawable(int i, final int i2, final int i3) {
        Drawable colorDrawable;
        if ((i2 == 1 || i2 == 5) && Build.VERSION.SDK_INT >= 23) {
            colorDrawable = null;
        } else if (i2 == 1 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) {
            maskPaint.setColor(-1);
            colorDrawable = new Drawable() {
                RectF rect;

                @Override
                public int getOpacity() {
                    return 0;
                }

                @Override
                public void setAlpha(int i4) {
                }

                @Override
                public void setColorFilter(ColorFilter colorFilter) {
                }

                @Override
                public void draw(Canvas canvas) {
                    int iDp;
                    Rect bounds = getBounds();
                    int i4 = i2;
                    if (i4 != 7) {
                        if (i4 == 1 || i4 == 6) {
                            iDp = i3;
                            if (iDp <= 0) {
                                iDp = AndroidUtilities.dp(20.0f);
                            }
                        } else if (i4 == 3) {
                            iDp = Math.max(bounds.width(), bounds.height()) / 2;
                        } else {
                            iDp = (int) Math.ceil(Math.sqrt(((bounds.left - bounds.centerX()) * (bounds.left - bounds.centerX())) + ((bounds.top - bounds.centerY()) * (bounds.top - bounds.centerY()))));
                        }
                        canvas.drawCircle(bounds.centerX(), bounds.centerY(), iDp, Theme.maskPaint);
                        return;
                    }
                    if (this.rect == null) {
                        this.rect = new RectF();
                    }
                    this.rect.set(bounds);
                    int iDp2 = i3;
                    if (iDp2 <= 0) {
                        iDp2 = AndroidUtilities.dp(6.0f);
                    }
                    float f = iDp2;
                    canvas.drawRoundRect(this.rect, f, f, Theme.maskPaint);
                }
            };
        } else if (i2 == 2) {
            colorDrawable = new ColorDrawable(-1);
        } else {
            colorDrawable = null;
        }
        BaseCell.RippleDrawableSafe rippleDrawableSafe = new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i}), null, colorDrawable);
        if (Build.VERSION.SDK_INT >= 23) {
            if (i2 == 1) {
                if (i3 <= 0) {
                    i3 = AndroidUtilities.dp(20.0f);
                }
                rippleDrawableSafe.setRadius(i3);
                return rippleDrawableSafe;
            }
            if (i2 == 5) {
                rippleDrawableSafe.setRadius(-1);
            }
        }
        return rippleDrawableSafe;
    }

    public static Drawable createInsetRoundRectDrawable(int i, float f, int i2) {
        return createInsetRoundRectDrawable(i, f, i2, i2);
    }

    public static Drawable createInsetRoundRectDrawable(int i, float f, int i2, int i3) {
        return createInsetRoundRectDrawable(i, f, i2, i3, i2, i3);
    }

    public static Drawable createInsetRoundRectDrawable(int i, final float f, final int i2, final int i3, final int i4, final int i5) {
        maskPaint.setColor(-1);
        return new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i}), null, new Drawable() {
            private final RectF rectF = new RectF();

            @Override
            public int getOpacity() {
                return 0;
            }

            @Override
            public void setAlpha(int i6) {
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }

            @Override
            public void draw(Canvas canvas) {
                this.rectF.set(getBounds());
                RectF rectF = this.rectF;
                rectF.left += i2;
                rectF.top += i3;
                rectF.right -= i4;
                rectF.bottom -= i5;
                float f2 = f;
                canvas.drawRoundRect(rectF, f2, f2, Theme.maskPaint);
            }
        });
    }

    public static Drawable createCircleSelectorDrawable(int i, final int i2, final int i3) {
        maskPaint.setColor(-1);
        return new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i}), null, new Drawable() {
            @Override
            public int getOpacity() {
                return 0;
            }

            @Override
            public void setAlpha(int i4) {
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }

            @Override
            public void draw(Canvas canvas) {
                Rect bounds = getBounds();
                canvas.drawCircle((bounds.centerX() - i2) + i3, bounds.centerY(), (Math.max(bounds.width(), bounds.height()) / 2) + i2 + i3, Theme.maskPaint);
            }
        });
    }

    public static class AdaptiveRipple {
        private static final int defaultBackgroundColorKey = Theme.key_windowBackgroundWhite;
        private static float[] tempHSV;

        public static Drawable circle(int i) {
            return circle(i, -1.0f);
        }

        public static Drawable circle(int i, float f) {
            return createCircle(calcRippleColor(i), f);
        }

        public static Drawable filledCircle() {
            return filledCircle(null, Theme.getColor(defaultBackgroundColorKey), -1.0f);
        }

        public static Drawable filledCircle(Drawable drawable, int i, float f) {
            return createCircle(drawable, calcRippleColor(i), f);
        }

        public static Drawable rectByKey(int i, float... fArr) {
            return rect(Theme.getColor(i), fArr);
        }

        public static Drawable rect(int i) {
            return rect(i, 0.0f);
        }

        public static Drawable rect(int i, float... fArr) {
            return createRect(0, calcRippleColor(i), fArr);
        }

        public static Drawable filledRectByKey(int i) {
            return filledRect(Theme.getColor(i));
        }

        public static Drawable filledRectByKey(int i, float... fArr) {
            return filledRect(Theme.getColor(i), fArr);
        }

        public static Drawable filledRect(int i) {
            return createRect(i, calcRippleColor(i), new float[0]);
        }

        public static Drawable filledRect(int i, float... fArr) {
            return createRect(i, calcRippleColor(i), fArr);
        }

        public static Drawable createRect(int i, float... fArr) {
            return createRect(0, i, fArr);
        }

        public static Drawable createRect(int i, int i2, float... fArr) {
            Drawable colorDrawable = null;
            if (i != 0) {
                if (hasNonzeroRadii(fArr)) {
                    ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(calcRadii(fArr), null, null));
                    shapeDrawable.getPaint().setColor(i);
                    colorDrawable = shapeDrawable;
                } else {
                    colorDrawable = new ColorDrawable(i);
                }
            }
            return createRect(colorDrawable, i2, fArr);
        }

        private static Drawable createRect(Drawable drawable, int i, float... fArr) {
            ShapeDrawable shapeDrawable;
            if (hasNonzeroRadii(fArr)) {
                shapeDrawable = new ShapeDrawable(new RoundRectShape(calcRadii(fArr), null, null));
                shapeDrawable.getPaint().setColor(-1);
            } else {
                shapeDrawable = new ShapeDrawable(new RectShape());
                shapeDrawable.getPaint().setColor(-1);
            }
            return new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i}), drawable, shapeDrawable);
        }

        private static Drawable createCircle(int i, float f) {
            return createCircle(0, i, f);
        }

        private static Drawable createCircle(int i, int i2, float f) {
            return createCircle(i == 0 ? null : new CircleDrawable(f, i), i2, f);
        }

        private static Drawable createCircle(Drawable drawable, int i, float f) {
            return new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i}), drawable, new CircleDrawable(f));
        }

        private static class CircleDrawable extends Drawable {
            private static Paint maskPaint;
            private Paint paint;
            private float radius;

            @Override
            public int getOpacity() {
                return -2;
            }

            @Override
            public void setAlpha(int i) {
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }

            public CircleDrawable(float f) {
                this.radius = f;
                if (maskPaint == null) {
                    Paint paint = new Paint(1);
                    maskPaint = paint;
                    paint.setColor(-1);
                }
                this.paint = maskPaint;
            }

            public CircleDrawable(float f, int i) {
                this.radius = f;
                Paint paint = new Paint(1);
                this.paint = paint;
                paint.setColor(i);
            }

            @Override
            public void draw(Canvas canvas) {
                int iDp;
                Rect bounds = getBounds();
                if (Math.abs(this.radius - (-1.0f)) < 0.01f) {
                    iDp = Math.max(bounds.width(), bounds.height()) / 2;
                } else if (Math.abs(this.radius - (-2.0f)) < 0.01f) {
                    iDp = (int) Math.ceil(Math.sqrt(((bounds.left - bounds.centerX()) * (bounds.left - bounds.centerX())) + ((bounds.top - bounds.centerY()) * (bounds.top - bounds.centerY()))));
                } else {
                    iDp = AndroidUtilities.dp(this.radius);
                }
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), iDp, this.paint);
            }
        }

        private static float[] calcRadii(float... fArr) {
            if (fArr.length == 0) {
                return new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
            }
            if (fArr.length == 1) {
                return new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0])};
            }
            if (fArr.length == 2) {
                return new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1])};
            }
            if (fArr.length == 3) {
                return new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2])};
            }
            if (fArr.length < 8) {
                return new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[3]), AndroidUtilities.dp(fArr[3])};
            }
            return new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[3]), AndroidUtilities.dp(fArr[4]), AndroidUtilities.dp(fArr[5]), AndroidUtilities.dp(fArr[6]), AndroidUtilities.dp(fArr[7])};
        }

        private static boolean hasNonzeroRadii(float... fArr) {
            for (int i = 0; i < Math.min(8, fArr.length); i++) {
                if (fArr[i] > 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public static int calcRippleColor(int i) {
            if (tempHSV == null) {
                tempHSV = new float[3];
            }
            Color.colorToHSV(i, tempHSV);
            float[] fArr = tempHSV;
            float f = fArr[1];
            if (f > 0.01f) {
                fArr[1] = Math.min(1.0f, Math.max(0.0f, f + (Theme.isCurrentThemeDark() ? 0.25f : -0.25f)));
                float[] fArr2 = tempHSV;
                fArr2[2] = Math.min(1.0f, Math.max(0.0f, fArr2[2] + (Theme.isCurrentThemeDark() ? 0.05f : -0.05f)));
            } else {
                fArr[2] = Math.min(1.0f, Math.max(0.0f, fArr[2] + (Theme.isCurrentThemeDark() ? 0.1f : -0.1f)));
            }
            return Color.HSVToColor(127, tempHSV);
        }
    }

    public static class RippleRadMaskDrawable extends Drawable {
        private float[] radii;
        private Path path = new Path();
        boolean invalidatePath = true;

        @Override
        public int getOpacity() {
            return 0;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public RippleRadMaskDrawable(float f, float f2) {
            this.radii = new float[]{fDp, fDp, fDp, fDp, 0.0f, 0.0f, 0.0f, 0.0f};
            float fDp = AndroidUtilities.dp(f);
            float[] fArr = this.radii;
            float fDp2 = AndroidUtilities.dp(f2);
            fArr[7] = fDp2;
            fArr[6] = fDp2;
            fArr[5] = fDp2;
            fArr[4] = fDp2;
        }

        public RippleRadMaskDrawable(float f, float f2, float f3, float f4) {
            float[] fArr = new float[8];
            this.radii = fArr;
            float fDp = AndroidUtilities.dp(f);
            fArr[1] = fDp;
            fArr[0] = fDp;
            float[] fArr2 = this.radii;
            float fDp2 = AndroidUtilities.dp(f2);
            fArr2[3] = fDp2;
            fArr2[2] = fDp2;
            float[] fArr3 = this.radii;
            float fDp3 = AndroidUtilities.dp(f3);
            fArr3[5] = fDp3;
            fArr3[4] = fDp3;
            float[] fArr4 = this.radii;
            float fDp4 = AndroidUtilities.dp(f4);
            fArr4[7] = fDp4;
            fArr4[6] = fDp4;
        }

        public void setRadius(float f, float f2) {
            float[] fArr = this.radii;
            float fDp = AndroidUtilities.dp(f);
            fArr[3] = fDp;
            fArr[2] = fDp;
            fArr[1] = fDp;
            fArr[0] = fDp;
            float[] fArr2 = this.radii;
            float fDp2 = AndroidUtilities.dp(f2);
            fArr2[7] = fDp2;
            fArr2[6] = fDp2;
            fArr2[5] = fDp2;
            fArr2[4] = fDp2;
            this.invalidatePath = true;
            invalidateSelf();
        }

        public void setRadius(float f, float f2, float f3, float f4) {
            float[] fArr = this.radii;
            float fDp = AndroidUtilities.dp(f);
            fArr[1] = fDp;
            fArr[0] = fDp;
            float[] fArr2 = this.radii;
            float fDp2 = AndroidUtilities.dp(f2);
            fArr2[3] = fDp2;
            fArr2[2] = fDp2;
            float[] fArr3 = this.radii;
            float fDp3 = AndroidUtilities.dp(f3);
            fArr3[5] = fDp3;
            fArr3[4] = fDp3;
            float[] fArr4 = this.radii;
            float fDp4 = AndroidUtilities.dp(f4);
            fArr4[7] = fDp4;
            fArr4[6] = fDp4;
            this.invalidatePath = true;
            invalidateSelf();
        }

        @Override
        protected void onBoundsChange(Rect rect) {
            this.invalidatePath = true;
        }

        @Override
        public void draw(Canvas canvas) {
            if (this.invalidatePath) {
                this.invalidatePath = false;
                this.path.reset();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getBounds());
                this.path.addRoundRect(rectF, this.radii, Path.Direction.CW);
            }
            canvas.drawPath(this.path, Theme.maskPaint);
        }
    }

    public static void setMaskDrawableRad(Drawable drawable, int i, int i2) {
        if (drawable instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) drawable;
            int numberOfLayers = rippleDrawable.getNumberOfLayers();
            for (int i3 = 0; i3 < numberOfLayers; i3++) {
                Drawable drawable2 = rippleDrawable.getDrawable(i3);
                if (drawable2 instanceof RippleRadMaskDrawable) {
                    ((RippleRadMaskDrawable) drawable2).setRadius(i, i2);
                    return;
                }
            }
        }
    }

    public static void setMaskDrawableRad(Drawable drawable, float f, float f2, float f3, float f4) {
        if (drawable instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) drawable;
            int numberOfLayers = rippleDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                Drawable drawable2 = rippleDrawable.getDrawable(i);
                if (drawable2 instanceof RippleRadMaskDrawable) {
                    ((RippleRadMaskDrawable) drawable2).setRadius(f, f2, f3, f4);
                    return;
                }
            }
        }
    }

    public static Drawable createRadSelectorDrawable(int i, int i2, int i3) {
        maskPaint.setColor(-1);
        return new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i}), null, new RippleRadMaskDrawable(i2, i3));
    }

    public static Drawable createRadSelectorDrawable(int i, int i2, int i3, int i4) {
        maskPaint.setColor(-1);
        float f = i3;
        float f2 = i4;
        return new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i2}), createRoundRectDrawable(AndroidUtilities.dp(f), AndroidUtilities.dp(f2), i), new RippleRadMaskDrawable(f, f2));
    }

    public static Drawable createRadSelectorDrawable(int i, int i2, int i3, int i4, int i5) {
        maskPaint.setColor(-1);
        return new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i}), null, new RippleRadMaskDrawable(i2, i3, i4, i5));
    }

    public static void applyPreviousTheme() {
        ThemeInfo themeInfo;
        ThemeInfo themeInfo2 = previousTheme;
        if (themeInfo2 == null) {
            return;
        }
        hasPreviousTheme = false;
        if (isInNigthMode && (themeInfo = currentNightTheme) != null) {
            applyTheme(themeInfo, true, false, true);
        } else if (!isApplyingAccent) {
            applyTheme(themeInfo2, true, false, false);
        }
        isApplyingAccent = false;
        previousTheme = null;
        checkAutoNightThemeConditions();
    }

    public static void clearPreviousTheme() {
        if (previousTheme == null) {
            return;
        }
        hasPreviousTheme = false;
        isApplyingAccent = false;
        previousTheme = null;
    }

    private static void sortThemes() {
        Collections.sort(themes, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return Theme.m1275$r8$lambda$5DwEtG8oZHyp3J5BcUaprxPJb8((Theme.ThemeInfo) obj, (Theme.ThemeInfo) obj2);
            }
        });
    }

    public static int m1275$r8$lambda$5DwEtG8oZHyp3J5BcUaprxPJb8(ThemeInfo themeInfo, ThemeInfo themeInfo2) {
        if (themeInfo.pathToFile == null && themeInfo.assetName == null) {
            return -1;
        }
        if (themeInfo2.pathToFile == null && themeInfo2.assetName == null) {
            return 1;
        }
        return themeInfo.name.compareTo(themeInfo2.name);
    }

    public static void applyThemeTemporary(ThemeInfo themeInfo, boolean z) {
        previousTheme = getCurrentTheme();
        hasPreviousTheme = true;
        isApplyingAccent = z;
        applyTheme(themeInfo, false, false, false);
    }

    public static boolean hasCustomWallpaper() {
        return isApplyingAccent && currentTheme.overrideWallpaper != null;
    }

    public static boolean isCustomWallpaperColor() {
        return hasCustomWallpaper() && currentTheme.overrideWallpaper.color != 0;
    }

    public static void resetCustomWallpaper(boolean z) {
        if (z) {
            isApplyingAccent = false;
            reloadWallpaper(true);
        } else {
            currentTheme.setOverrideWallpaper(null);
        }
    }

    public static ThemeInfo fillThemeValues(File file, String str, TLRPC.TL_theme tL_theme) {
        String[] strArrSplit;
        try {
            ThemeInfo themeInfo = new ThemeInfo();
            themeInfo.name = str;
            themeInfo.info = tL_theme;
            themeInfo.pathToFile = file.getAbsolutePath();
            themeInfo.account = UserConfig.selectedAccount;
            String[] strArr = new String[1];
            checkIsDark(getThemeFileValues(new File(themeInfo.pathToFile), null, strArr), themeInfo);
            if (!TextUtils.isEmpty(strArr[0])) {
                String str2 = strArr[0];
                themeInfo.pathToWallpaper = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(str2) + ".wp").getAbsolutePath();
                try {
                    Uri uri = Uri.parse(str2);
                    themeInfo.slug = uri.getQueryParameter("slug");
                    String queryParameter = uri.getQueryParameter("mode");
                    if (queryParameter != null && (strArrSplit = queryParameter.toLowerCase().split(" ")) != null && strArrSplit.length > 0) {
                        for (int i = 0; i < strArrSplit.length; i++) {
                            if ("blur".equals(strArrSplit[i])) {
                                themeInfo.isBlured = true;
                            } else if ("motion".equals(strArrSplit[i])) {
                                themeInfo.isMotion = true;
                            }
                        }
                    }
                    String queryParameter2 = uri.getQueryParameter("intensity");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        try {
                            String queryParameter3 = uri.getQueryParameter("bg_color");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                themeInfo.patternBgColor = Integer.parseInt(queryParameter3.substring(0, 6), 16) | (-16777216);
                                if (queryParameter3.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter3.charAt(6))) {
                                    themeInfo.patternBgGradientColor1 = Integer.parseInt(queryParameter3.substring(7, 13), 16) | (-16777216);
                                }
                                if (queryParameter3.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter3.charAt(13))) {
                                    themeInfo.patternBgGradientColor2 = Integer.parseInt(queryParameter3.substring(14, 20), 16) | (-16777216);
                                }
                                if (queryParameter3.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter3.charAt(20))) {
                                    themeInfo.patternBgGradientColor3 = Integer.parseInt(queryParameter3.substring(21), 16) | (-16777216);
                                }
                            }
                        } catch (Exception unused) {
                        }
                        try {
                            String queryParameter4 = uri.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter4)) {
                                themeInfo.patternBgGradientRotation = Utilities.parseInt((CharSequence) queryParameter4).intValue();
                            }
                        } catch (Exception unused2) {
                        }
                        if (!TextUtils.isEmpty(queryParameter2)) {
                            themeInfo.patternIntensity = Utilities.parseInt((CharSequence) queryParameter2).intValue();
                        }
                        if (themeInfo.patternIntensity == 0) {
                            themeInfo.patternIntensity = 50;
                        }
                    }
                } catch (Throwable th) {
                    FileLog.e(th);
                }
                return themeInfo;
            }
            themedWallpaperLink = null;
            return themeInfo;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static ThemeInfo applyThemeFile(File file, String str, TLRPC.TL_theme tL_theme, boolean z) {
        File file2;
        String str2;
        try {
            if (!str.toLowerCase().endsWith(".attheme")) {
                str = str + ".attheme";
            }
            if (z) {
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.goingToPreviewTheme, new Object[0]);
                ThemeInfo themeInfo = new ThemeInfo();
                themeInfo.name = str;
                themeInfo.info = tL_theme;
                themeInfo.pathToFile = file.getAbsolutePath();
                themeInfo.account = UserConfig.selectedAccount;
                applyThemeTemporary(themeInfo, false);
                return themeInfo;
            }
            if (tL_theme != null) {
                str2 = "remote" + tL_theme.id;
                file2 = new File(ApplicationLoader.getFilesDirFixed(), str2 + ".attheme");
            } else {
                file2 = new File(ApplicationLoader.getFilesDirFixed(), str);
                str2 = str;
            }
            if (!AndroidUtilities.copyFile(file, file2)) {
                applyPreviousTheme();
                return null;
            }
            previousTheme = null;
            hasPreviousTheme = false;
            isApplyingAccent = false;
            ThemeInfo themeInfo2 = (ThemeInfo) themesDict.get(str2);
            if (themeInfo2 == null) {
                themeInfo2 = new ThemeInfo();
                themeInfo2.name = str;
                themeInfo2.account = UserConfig.selectedAccount;
                themes.add(themeInfo2);
                otherThemes.add(themeInfo2);
                sortThemes();
            } else {
                themesDict.remove(str2);
            }
            themeInfo2.info = tL_theme;
            themeInfo2.pathToFile = file2.getAbsolutePath();
            themesDict.put(themeInfo2.getKey(), themeInfo2);
            saveOtherThemes(true);
            applyTheme(themeInfo2, true, true, false);
            return themeInfo2;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static ThemeInfo getTheme(String str) {
        return (ThemeInfo) themesDict.get(str);
    }

    public static void applyTheme(ThemeInfo themeInfo) {
        applyTheme(themeInfo, true, true, false);
    }

    public static void applyTheme(ThemeInfo themeInfo, boolean z) {
        applyTheme(themeInfo, true, z);
    }

    public static void applyThemeInBackground(ThemeInfo themeInfo, boolean z, Runnable runnable) {
        applyThemeInBackground(themeInfo, true, true, z, runnable);
    }

    public static void applyTheme(ThemeInfo themeInfo, boolean z, boolean z2) {
        applyTheme(themeInfo, z, true, z2);
    }

    private static void applyTheme(ThemeInfo themeInfo, boolean z, boolean z2, boolean z3) {
        String[] strArrSplit;
        if (themeInfo == null) {
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.getInstance();
        if (themeEditorView != null) {
            themeEditorView.destroy();
        }
        try {
            if (themeInfo.pathToFile != null || themeInfo.assetName != null) {
                if (!z3 && z) {
                    SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                    editorEdit.putString("theme", themeInfo.getKey());
                    editorEdit.apply();
                }
                String[] strArr = new String[1];
                String str = themeInfo.assetName;
                if (str != null) {
                    currentColorsNoAccent = getThemeFileValues(null, str, null);
                } else {
                    currentColorsNoAccent = getThemeFileValues(new File(themeInfo.pathToFile), null, strArr);
                }
                themedWallpaperFileOffset = currentColorsNoAccent.get(key_wallpaperFileOffset, -1);
                if (!TextUtils.isEmpty(strArr[0])) {
                    themedWallpaperLink = strArr[0];
                    String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(themedWallpaperLink) + ".wp").getAbsolutePath();
                    try {
                        String str2 = themeInfo.pathToWallpaper;
                        if (str2 != null && !str2.equals(absolutePath)) {
                            new File(themeInfo.pathToWallpaper).delete();
                        }
                    } catch (Exception unused) {
                    }
                    themeInfo.pathToWallpaper = absolutePath;
                    try {
                        Uri uri = Uri.parse(themedWallpaperLink);
                        themeInfo.slug = uri.getQueryParameter("slug");
                        String queryParameter = uri.getQueryParameter("mode");
                        if (queryParameter != null && (strArrSplit = queryParameter.toLowerCase().split(" ")) != null && strArrSplit.length > 0) {
                            for (int i = 0; i < strArrSplit.length; i++) {
                                if ("blur".equals(strArrSplit[i])) {
                                    themeInfo.isBlured = true;
                                } else if ("motion".equals(strArrSplit[i])) {
                                    themeInfo.isMotion = true;
                                }
                            }
                        }
                        Utilities.parseInt((CharSequence) uri.getQueryParameter("intensity")).getClass();
                        themeInfo.patternBgGradientRotation = 45;
                        try {
                            String queryParameter2 = uri.getQueryParameter("bg_color");
                            if (!TextUtils.isEmpty(queryParameter2)) {
                                themeInfo.patternBgColor = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                    themeInfo.patternBgGradientColor1 = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                }
                                if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                    themeInfo.patternBgGradientColor2 = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                }
                                if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                    themeInfo.patternBgGradientColor3 = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        try {
                            String queryParameter3 = uri.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                themeInfo.patternBgGradientRotation = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                            }
                        } catch (Exception unused3) {
                        }
                    } catch (Throwable th) {
                        FileLog.e(th);
                    }
                } else {
                    try {
                        if (themeInfo.pathToWallpaper != null) {
                            new File(themeInfo.pathToWallpaper).delete();
                        }
                    } catch (Exception unused4) {
                    }
                    themeInfo.pathToWallpaper = null;
                    themedWallpaperLink = null;
                }
            } else {
                if (!z3 && z) {
                    SharedPreferences.Editor editorEdit2 = MessagesController.getGlobalMainSettings().edit();
                    editorEdit2.remove("theme");
                    editorEdit2.commit();
                }
                currentColorsNoAccent.clear();
                themedWallpaperFileOffset = 0;
                themedWallpaperLink = null;
                wallpaper = null;
                themedWallpaper = null;
            }
            if (!z3 && previousTheme == null) {
                currentDayTheme = themeInfo;
                if (isCurrentThemeNight()) {
                    switchNightThemeDelay = 2000;
                    lastDelayUpdateTime = SystemClock.elapsedRealtime();
                    AndroidUtilities.runOnUIThread(new MessagesController$$ExternalSyntheticLambda98(), 2100L);
                }
            }
            currentTheme = themeInfo;
            refreshThemeColors();
        } catch (Exception e) {
            FileLog.e(e);
        }
        BlurSettingsBottomSheet.onThemeApplyed();
        if (previousTheme == null && z && !switchingNightTheme) {
            MessagesController.getInstance(themeInfo.account).saveTheme(themeInfo, themeInfo.getAccent(false), z3, false);
        }
    }

    private static void applyThemeInBackground(ThemeInfo themeInfo, boolean z, boolean z2, boolean z3, Runnable runnable) {
        final ThemeInfo themeInfo2;
        final boolean z4;
        final boolean z5;
        final Runnable runnable2;
        if (themeInfo == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.getInstance();
        if (themeEditorView != null) {
            themeEditorView.destroy();
        }
        try {
            if (themeInfo.pathToFile == null && themeInfo.assetName == null) {
                if (!z3 && z) {
                    SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                    editorEdit.remove("theme");
                    editorEdit.apply();
                }
                currentColorsNoAccent.clear();
                themedWallpaperFileOffset = 0;
                themedWallpaperLink = null;
                wallpaper = null;
                themedWallpaper = null;
                if (!z3 && previousTheme == null) {
                    currentDayTheme = themeInfo;
                    if (isCurrentThemeNight()) {
                        switchNightThemeDelay = 2000;
                        lastDelayUpdateTime = SystemClock.elapsedRealtime();
                        AndroidUtilities.runOnUIThread(new MessagesController$$ExternalSyntheticLambda98(), 2100L);
                    }
                }
                currentTheme = themeInfo;
                refreshThemeColors();
                themeInfo2 = themeInfo;
                z4 = z;
                z5 = z3;
                runnable2 = runnable;
                if (previousTheme == null && z4 && !switchingNightTheme) {
                    MessagesController.getInstance(themeInfo2.account).saveTheme(themeInfo2, themeInfo2.getAccent(false), z5, false);
                }
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
            if (!z3 && z) {
                SharedPreferences.Editor editorEdit2 = MessagesController.getGlobalMainSettings().edit();
                editorEdit2.putString("theme", themeInfo.getKey());
                editorEdit2.apply();
            }
            final String[] strArr = new String[1];
            themeInfo2 = themeInfo;
            z4 = z;
            z5 = z3;
            runnable2 = runnable;
            try {
                final Runnable runnable3 = new Runnable() {
                    @Override
                    public final void run() {
                        Theme.$r8$lambda$hXZO8feR59GGnPGakQxZrmdaYUg(strArr, themeInfo2, z5, z4, runnable2);
                    }
                };
                String str = themeInfo2.assetName;
                if (str != null) {
                    getThemeFileValuesInBackground(null, str, null, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            Theme.$r8$lambda$uoADhlIjZ0L8lu1XOfNoRRUgOGw(runnable3, (SparseIntArray) obj);
                        }
                    });
                } else {
                    getThemeFileValuesInBackground(new File(themeInfo2.pathToFile), null, strArr, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            Theme.$r8$lambda$Fw3ecpL5lIcIDhHXr1csyUDY9ms(runnable3, (SparseIntArray) obj);
                        }
                    });
                }
            } catch (Exception e) {
                e = e;
                FileLog.e(e);
                if (previousTheme == null) {
                    MessagesController.getInstance(themeInfo2.account).saveTheme(themeInfo2, themeInfo2.getAccent(false), z5, false);
                }
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        } catch (Exception e2) {
            e = e2;
            themeInfo2 = themeInfo;
            z4 = z;
            z5 = z3;
            runnable2 = runnable;
        }
    }

    public static void $r8$lambda$hXZO8feR59GGnPGakQxZrmdaYUg(String[] strArr, ThemeInfo themeInfo, boolean z, boolean z2, Runnable runnable) {
        String[] strArrSplit;
        try {
            themedWallpaperFileOffset = currentColorsNoAccent.get(key_wallpaperFileOffset, -1);
            if (!TextUtils.isEmpty(strArr[0])) {
                themedWallpaperLink = strArr[0];
                String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(themedWallpaperLink) + ".wp").getAbsolutePath();
                try {
                    String str = themeInfo.pathToWallpaper;
                    if (str != null && !str.equals(absolutePath)) {
                        new File(themeInfo.pathToWallpaper).delete();
                    }
                } catch (Exception unused) {
                }
                themeInfo.pathToWallpaper = absolutePath;
                try {
                    Uri uri = Uri.parse(themedWallpaperLink);
                    themeInfo.slug = uri.getQueryParameter("slug");
                    String queryParameter = uri.getQueryParameter("mode");
                    if (queryParameter != null && (strArrSplit = queryParameter.toLowerCase().split(" ")) != null && strArrSplit.length > 0) {
                        for (int i = 0; i < strArrSplit.length; i++) {
                            if ("blur".equals(strArrSplit[i])) {
                                themeInfo.isBlured = true;
                            } else if ("motion".equals(strArrSplit[i])) {
                                themeInfo.isMotion = true;
                            }
                        }
                    }
                    Utilities.parseInt((CharSequence) uri.getQueryParameter("intensity")).getClass();
                    themeInfo.patternBgGradientRotation = 45;
                    try {
                        String queryParameter2 = uri.getQueryParameter("bg_color");
                        if (!TextUtils.isEmpty(queryParameter2)) {
                            themeInfo.patternBgColor = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                            if (queryParameter2.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(6))) {
                                themeInfo.patternBgGradientColor1 = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                            }
                            if (queryParameter2.length() >= 20 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(13))) {
                                themeInfo.patternBgGradientColor2 = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                            }
                            if (queryParameter2.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter2.charAt(20))) {
                                themeInfo.patternBgGradientColor3 = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    try {
                        String queryParameter3 = uri.getQueryParameter("rotation");
                        if (!TextUtils.isEmpty(queryParameter3)) {
                            themeInfo.patternBgGradientRotation = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                        }
                    } catch (Exception unused3) {
                    }
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            } else {
                try {
                    if (themeInfo.pathToWallpaper != null) {
                        new File(themeInfo.pathToWallpaper).delete();
                    }
                } catch (Exception unused4) {
                }
                themeInfo.pathToWallpaper = null;
                themedWallpaperLink = null;
            }
            if (!z && previousTheme == null) {
                currentDayTheme = themeInfo;
                if (isCurrentThemeNight()) {
                    switchNightThemeDelay = 2000;
                    lastDelayUpdateTime = SystemClock.elapsedRealtime();
                    AndroidUtilities.runOnUIThread(new MessagesController$$ExternalSyntheticLambda98(), 2100L);
                }
            }
            currentTheme = themeInfo;
            refreshThemeColors();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (previousTheme == null && z2 && !switchingNightTheme) {
            MessagesController.getInstance(themeInfo.account).saveTheme(themeInfo, themeInfo.getAccent(false), z, false);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void $r8$lambda$uoADhlIjZ0L8lu1XOfNoRRUgOGw(Runnable runnable, SparseIntArray sparseIntArray) {
        currentColorsNoAccent = sparseIntArray;
        runnable.run();
    }

    public static void $r8$lambda$Fw3ecpL5lIcIDhHXr1csyUDY9ms(Runnable runnable, SparseIntArray sparseIntArray) {
        currentColorsNoAccent = sparseIntArray;
        runnable.run();
    }

    public static boolean useBlackText(int i, int i2) {
        float fRed = Color.red(i) / 255.0f;
        float fRed2 = Color.red(i2) / 255.0f;
        float fGreen = Color.green(i) / 255.0f;
        float fGreen2 = Color.green(i2) / 255.0f;
        float fBlue = Color.blue(i) / 255.0f;
        return ((((fRed * 0.5f) + (fRed2 * 0.5f)) * 0.2126f) + (((fGreen * 0.5f) + (fGreen2 * 0.5f)) * 0.7152f)) + (((fBlue * 0.5f) + ((((float) Color.blue(i2)) / 255.0f) * 0.5f)) * 0.0722f) > 0.705f || ((fRed * 0.2126f) + (fGreen * 0.7152f)) + (fBlue * 0.0722f) > 0.705f;
    }

    private static int calculatedTableBackground(int i, boolean z, boolean z2) {
        if (z && z2) {
            return multAlpha(-1, 0.07f);
        }
        float[] tempHsv = getTempHsv(3);
        Color.colorToHSV(i, tempHsv);
        if (z) {
            tempHsv[2] = Math.min(1.0f, tempHsv[2] + 0.07f);
            if (z2) {
                tempHsv[1] = Math.min(1.0f, tempHsv[1] + 0.02f);
            }
        } else {
            tempHsv[2] = Math.max(0.0f, tempHsv[2] - (z2 ? 0.06f : 0.03f));
            if (z2) {
                float f = tempHsv[1];
                if (f > 0.02f) {
                    tempHsv[1] = Math.min(1.0f, f + 0.02f);
                }
            }
        }
        return Color.HSVToColor(Color.alpha(i), tempHsv);
    }

    private static int calculatedTableBorder(int i, boolean z, boolean z2) {
        if (z && z2) {
            return multAlpha(-1, 0.14f);
        }
        float[] tempHsv = getTempHsv(3);
        Color.colorToHSV(i, tempHsv);
        if (z) {
            tempHsv[2] = Math.min(1.0f, tempHsv[2] + 0.14f);
            if (z2) {
                tempHsv[1] = Math.min(1.0f, tempHsv[1] + 0.03f);
            }
        } else {
            tempHsv[2] = Math.max(0.0f, tempHsv[2] - (z2 ? 0.14f : 0.12f));
            if (z2) {
                float f = tempHsv[1];
                if (f > 0.02f) {
                    tempHsv[1] = Math.min(1.0f, f + 0.04f);
                }
            }
        }
        return Color.HSVToColor(Color.alpha(i), tempHsv);
    }

    private static int tableOutBubble(SparseIntArray sparseIntArray) {
        int[] iArr = {key_chat_outBubble, key_chat_outBubbleGradient1, key_chat_outBubbleGradient2, key_chat_outBubbleGradient3};
        int iRed = 0;
        int i = 0;
        int iBlue = 0;
        int iGreen = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = iArr[i2];
            if (i3 == key_chat_outBubble || sparseIntArray.indexOfKey(i3) >= 0) {
                int i4 = sparseIntArray.get(i3, defaultColors[i3]);
                iRed += Color.red(i4);
                iGreen += Color.green(i4);
                iBlue += Color.blue(i4);
                i++;
            }
        }
        return Color.rgb(iRed / i, iGreen / i, iBlue / i);
    }

    public static void applyCalculatedTableColors(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, boolean z) {
        int i = key_chat_inBubble;
        int i2 = sparseIntArray2.get(i, defaultColors[i]);
        int iTableOutBubble = tableOutBubble(sparseIntArray2);
        int i3 = key_chat_inTableBackground;
        if (sparseIntArray.indexOfKey(i3) < 0) {
            sparseIntArray2.put(i3, calculatedTableBackground(i2, z, false));
        }
        int i4 = key_chat_outTableBackground;
        if (sparseIntArray.indexOfKey(i4) < 0) {
            sparseIntArray2.put(i4, calculatedTableBackground(iTableOutBubble, z, true));
        }
        int i5 = key_chat_inTableBorder;
        if (sparseIntArray.indexOfKey(i5) < 0) {
            sparseIntArray2.put(i5, calculatedTableBorder(i2, z, false));
        }
        int i6 = key_chat_outTableBorder;
        if (sparseIntArray.indexOfKey(i6) < 0) {
            sparseIntArray2.put(i6, calculatedTableBorder(iTableOutBubble, z, true));
        }
        int i7 = key_chat_outDivider;
        if (sparseIntArray.indexOfKey(i7) < 0) {
            int i8 = key_chat_outReplyLine;
            sparseIntArray2.put(i7, multAlpha(sparseIntArray2.get(i8, defaultColors[i8]), 0.2f));
        }
        if (z) {
            int i9 = key_chat_inDivider;
            if (sparseIntArray.indexOfKey(i9) < 0) {
                int i10 = key_chat_inReplyMessageText;
                sparseIntArray2.put(i9, multAlpha(sparseIntArray2.get(i10, defaultColors[i10]), 0.2f));
            }
        }
    }

    public static void applyCalculatedArticleCodeColors(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, boolean z) {
        if (z) {
            int i = key_chat_inArticleCodeBackground;
            if (sparseIntArray.indexOfKey(i) < 0) {
                sparseIntArray2.put(i, multAlpha(-1, 0.1f));
            }
        }
        int i2 = key_chat_inBubble;
        int i3 = sparseIntArray2.get(i2, defaultColors[i2]);
        int iTableOutBubble = tableOutBubble(sparseIntArray2);
        int i4 = key_chat_inArticleCodeScrollbarBackground;
        if (sparseIntArray.indexOfKey(i4) < 0) {
            sparseIntArray2.put(i4, calculatedArticleCodeScrollbar(i3, z, false));
        }
        int i5 = key_chat_inArticleCodeScrollbar;
        if (sparseIntArray.indexOfKey(i5) < 0) {
            sparseIntArray2.put(i5, calculatedArticleCodeScrollbar(i3, z, true));
        }
        int i6 = key_chat_outArticleCodeScrollbarBackground;
        if (sparseIntArray.indexOfKey(i6) < 0) {
            sparseIntArray2.put(i6, calculatedArticleCodeScrollbar(iTableOutBubble, z, false));
        }
        int i7 = key_chat_outArticleCodeScrollbar;
        if (sparseIntArray.indexOfKey(i7) < 0) {
            sparseIntArray2.put(i7, calculatedArticleCodeScrollbar(iTableOutBubble, z, true));
        }
        int i8 = key_chat_inArticleDetailsArrow;
        if (sparseIntArray.indexOfKey(i8) < 0) {
            sparseIntArray2.put(i8, calculatedArticleDetailsColor(i3, z, false, true));
        }
        int i9 = key_chat_outArticleDetailsArrow;
        if (sparseIntArray.indexOfKey(i9) < 0) {
            sparseIntArray2.put(i9, calculatedArticleDetailsColor(iTableOutBubble, z, true, true));
        }
        int i10 = key_chat_inArticleDetailsLine;
        if (sparseIntArray.indexOfKey(i10) < 0) {
            sparseIntArray2.put(i10, calculatedArticleDetailsColor(i3, z, false, false));
        }
        int i11 = key_chat_outArticleDetailsLine;
        if (sparseIntArray.indexOfKey(i11) < 0) {
            sparseIntArray2.put(i11, calculatedArticleDetailsColor(iTableOutBubble, z, true, false));
        }
    }

    private static int calculatedArticleDetailsColor(int i, boolean z, boolean z2, boolean z3) {
        if (z) {
            return multAlpha(-1, z3 ? 0.62f : 0.18f);
        }
        int i2 = z3 ? -6380376 : -2565928;
        float[] tempHsv = getTempHsv(3);
        Color.colorToHSV(i, tempHsv);
        return (!z2 || tempHsv[1] <= 0.02f) ? i2 : adaptHue(i2, i);
    }

    private static int calculatedArticleCodeScrollbar(int i, boolean z, boolean z2) {
        if (z) {
            return multAlpha(-1, z2 ? 0.22f : 0.12f);
        }
        int i2 = z2 ? -3813931 : -1972501;
        float[] tempHsv = getTempHsv(3);
        Color.colorToHSV(i, tempHsv);
        return tempHsv[1] > 0.02f ? adaptHue(i2, i) : i2;
    }

    public static void refreshThemeColors() {
        refreshThemeColors(false, false);
    }

    public static void refreshThemeColors(boolean z, boolean z2) {
        currentColors = currentColorsNoAccent.clone();
        shouldDrawGradientIcons = true;
        ThemeAccent accent = currentTheme.getAccent(false);
        if (accent != null) {
            shouldDrawGradientIcons = accent.fillAccentColors(currentColorsNoAccent, currentColors);
        }
        applyCalculatedTableColors(currentColorsNoAccent, currentColors, currentTheme.isDark());
        applyCalculatedArticleCodeColors(currentColorsNoAccent, currentColors, currentTheme.isDark());
        if (!z2) {
            reloadWallpaper(!(LaunchActivity.getLastFragment() instanceof ChatActivity));
        }
        applyCommonTheme();
        applyDialogsTheme();
        applyProfileTheme();
        applyChatTheme(false, z);
        final boolean z3 = !hasPreviousTheme;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.didSetNewTheme, Boolean.FALSE, Boolean.valueOf(z3));
            }
        });
    }

    public static boolean hasHue(int i) {
        float[] tempHsv = getTempHsv(3);
        Color.colorToHSV(i, tempHsv);
        float f = tempHsv[1];
        return f > 0.1f && f < 0.9f;
    }

    public static int changeColorAccent(int i, int i2, int i3, boolean z, int i4) {
        float[] tempHsv = getTempHsv(3);
        float[] tempHsv2 = getTempHsv(4);
        Color.colorToHSV(i, tempHsv);
        Color.colorToHSV(i2, tempHsv2);
        return changeColorAccent(tempHsv, tempHsv2, i3, z, i4);
    }

    public static int changeColorAccent(ThemeInfo themeInfo, int i, int i2) {
        int i3;
        if (i == 0 || (i3 = themeInfo.accentBaseColor) == 0 || i == i3 || (themeInfo.firstAccentIsDefault && themeInfo.currentAccentId == DEFALT_THEME_ACCENT_ID)) {
            return i2;
        }
        float[] tempHsv = getTempHsv(3);
        float[] tempHsv2 = getTempHsv(4);
        Color.colorToHSV(themeInfo.accentBaseColor, tempHsv);
        Color.colorToHSV(i, tempHsv2);
        return changeColorAccent(tempHsv, tempHsv2, i2, themeInfo.isDark(), i2);
    }

    public static float[] getTempHsv(int i) {
        ThreadLocal threadLocal;
        if (i == 1) {
            threadLocal = hsvTemp1Local;
        } else if (i == 2) {
            threadLocal = hsvTemp2Local;
        } else if (i == 3) {
            threadLocal = hsvTemp3Local;
        } else if (i == 4) {
            threadLocal = hsvTemp4Local;
        } else {
            threadLocal = hsvTemp5Local;
        }
        float[] fArr = (float[]) threadLocal.get();
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = new float[3];
        threadLocal.set(fArr2);
        return fArr2;
    }

    public static int getAccentColor(float[] fArr, int i, int i2) {
        float[] tempHsv = getTempHsv(3);
        float[] tempHsv2 = getTempHsv(4);
        Color.colorToHSV(i, tempHsv);
        Color.colorToHSV(i2, tempHsv2);
        float fMin = Math.min((tempHsv[1] * 1.5f) / fArr[1], 1.0f);
        tempHsv[0] = (tempHsv2[0] - tempHsv[0]) + fArr[0];
        tempHsv[1] = (tempHsv2[1] * fArr[1]) / tempHsv[1];
        float f = ((((tempHsv2[2] / tempHsv[2]) + fMin) - 1.0f) * fArr[2]) / fMin;
        tempHsv[2] = f;
        return f < 0.3f ? i2 : Color.HSVToColor(255, tempHsv);
    }

    public static int changeColorAccent(int i) {
        ThemeAccent accent = currentTheme.getAccent(false);
        return changeColorAccent(currentTheme, accent != null ? accent.accentColor : 0, i);
    }

    public static int changeColorAccent(float[] fArr, float[] fArr2, int i, boolean z, int i2) {
        if (tmpHSV5 == null) {
            tmpHSV5 = new float[3];
        }
        float[] fArr3 = tmpHSV5;
        Color.colorToHSV(i, fArr3);
        if (Math.min(abs(fArr3[0] - fArr[0]), abs((fArr3[0] - fArr[0]) - 360.0f)) > 30.0f) {
            return i2;
        }
        float fMin = Math.min((fArr3[1] * 1.5f) / fArr[1], 1.0f);
        fArr3[0] = (fArr3[0] + fArr2[0]) - fArr[0];
        fArr3[1] = (fArr3[1] * fArr2[1]) / fArr[1];
        fArr3[2] = fArr3[2] * ((1.0f - fMin) + ((fMin * fArr2[2]) / fArr[2]));
        int iHSVToColor = Color.HSVToColor(Color.alpha(i), fArr3);
        float fComputePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(i);
        float fComputePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(iHSVToColor);
        if (z) {
            if (fComputePerceivedBrightness <= fComputePerceivedBrightness2) {
                return iHSVToColor;
            }
        } else if (fComputePerceivedBrightness >= fComputePerceivedBrightness2) {
            return iHSVToColor;
        }
        return changeBrightness(iHSVToColor, ((fComputePerceivedBrightness * 0.39999998f) / fComputePerceivedBrightness2) + 0.6f);
    }

    private static int changeBrightness(int i, float f) {
        int iRed = (int) (Color.red(i) * f);
        int iGreen = (int) (Color.green(i) * f);
        int iBlue = (int) (Color.blue(i) * f);
        return Color.argb(Color.alpha(i), iRed < 0 ? 0 : Math.min(iRed, 255), iGreen < 0 ? 0 : Math.min(iGreen, 255), iBlue >= 0 ? Math.min(iBlue, 255) : 0);
    }

    public static boolean deleteThemeAccent(ThemeInfo themeInfo, ThemeAccent themeAccent, boolean z) {
        boolean z2 = false;
        if (themeAccent == null || themeInfo == null || themeInfo.themeAccents == null) {
            return false;
        }
        boolean z3 = themeAccent.id == themeInfo.currentAccentId;
        File pathToWallpaper = themeAccent.getPathToWallpaper();
        if (pathToWallpaper != null) {
            pathToWallpaper.delete();
        }
        themeInfo.themeAccentsMap.remove(themeAccent.id);
        themeInfo.themeAccents.remove(themeAccent);
        TLRPC.TL_theme tL_theme = themeAccent.info;
        if (tL_theme != null) {
            themeInfo.accentsByThemeId.remove(tL_theme.id);
        }
        OverrideWallpaperInfo overrideWallpaperInfo = themeAccent.overrideWallpaper;
        if (overrideWallpaperInfo != null) {
            overrideWallpaperInfo.delete();
        }
        if (z3) {
            themeInfo.setCurrentAccentId(((ThemeAccent) themeInfo.themeAccents.get(0)).id);
        }
        if (z) {
            saveThemeAccents(themeInfo, true, false, false, false);
            if (themeAccent.info != null) {
                MessagesController messagesController = MessagesController.getInstance(themeAccent.account);
                if (z3 && themeInfo == currentNightTheme) {
                    z2 = true;
                }
                messagesController.saveTheme(themeInfo, themeAccent, z2, true);
            }
        }
        return z3;
    }

    public static void saveThemeAccents(ThemeInfo themeInfo, boolean z, boolean z2, boolean z3, boolean z4) {
        saveThemeAccents(themeInfo, z, z2, z3, z4, false);
    }

    public static void saveThemeAccents(ThemeInfo themeInfo, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (z) {
            SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            if (!z3) {
                int size = themeInfo.themeAccents.size();
                int iMax = Math.max(0, size - themeInfo.defaultAccentCount);
                SerializedData serializedData = new SerializedData(((iMax * 16) + 2) * 4);
                serializedData.writeInt32(9);
                serializedData.writeInt32(iMax);
                for (int i = 0; i < size; i++) {
                    ThemeAccent themeAccent = (ThemeAccent) themeInfo.themeAccents.get(i);
                    int i2 = themeAccent.id;
                    if (i2 >= 100) {
                        serializedData.writeInt32(i2);
                        serializedData.writeInt32(themeAccent.accentColor);
                        serializedData.writeInt32(themeAccent.accentColor2);
                        serializedData.writeInt32(themeAccent.myMessagesAccentColor);
                        serializedData.writeInt32(themeAccent.myMessagesGradientAccentColor1);
                        serializedData.writeInt32(themeAccent.myMessagesGradientAccentColor2);
                        serializedData.writeInt32(themeAccent.myMessagesGradientAccentColor3);
                        serializedData.writeBool(themeAccent.myMessagesAnimated);
                        serializedData.writeInt64(themeAccent.backgroundOverrideColor);
                        serializedData.writeInt64(themeAccent.backgroundGradientOverrideColor1);
                        serializedData.writeInt64(themeAccent.backgroundGradientOverrideColor2);
                        serializedData.writeInt64(themeAccent.backgroundGradientOverrideColor3);
                        serializedData.writeInt32(themeAccent.backgroundRotation);
                        serializedData.writeInt64(0L);
                        serializedData.writeDouble(themeAccent.patternIntensity);
                        serializedData.writeBool(themeAccent.patternMotion);
                        serializedData.writeString(themeAccent.patternSlug);
                        serializedData.writeBool(themeAccent.info != null);
                        if (themeAccent.info != null) {
                            serializedData.writeInt32(themeAccent.account);
                            themeAccent.info.serializeToStream(serializedData);
                        }
                    }
                }
                editorEdit.putString("accents_" + themeInfo.assetName, Base64.encodeToString(serializedData.toByteArray(), 3));
                if (!z5) {
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.themeAccentListUpdated, new Object[0]);
                }
                if (z4) {
                    MessagesController.getInstance(UserConfig.selectedAccount).saveThemeToServer(themeInfo, themeInfo.getAccent(false));
                }
            }
            editorEdit.putInt("accent_current_" + themeInfo.assetName, themeInfo.currentAccentId);
            editorEdit.commit();
        } else {
            if (themeInfo.prevAccentId != -1) {
                if (z2) {
                    ThemeAccent themeAccent2 = (ThemeAccent) themeInfo.themeAccentsMap.get(themeInfo.currentAccentId);
                    themeInfo.themeAccentsMap.remove(themeAccent2.id);
                    themeInfo.themeAccents.remove(themeAccent2);
                    TLRPC.TL_theme tL_theme = themeAccent2.info;
                    if (tL_theme != null) {
                        themeInfo.accentsByThemeId.remove(tL_theme.id);
                    }
                }
                themeInfo.currentAccentId = themeInfo.prevAccentId;
                ThemeAccent accent = themeInfo.getAccent(false);
                if (accent != null) {
                    themeInfo.overrideWallpaper = accent.overrideWallpaper;
                } else {
                    themeInfo.overrideWallpaper = null;
                }
            }
            if (currentTheme == themeInfo) {
                refreshThemeColors();
            }
        }
        themeInfo.prevAccentId = -1;
    }

    public static void saveOtherThemes(boolean z) {
        saveOtherThemes(z, false);
    }

    private static void saveOtherThemes(boolean z, boolean z2) {
        String str;
        boolean z3;
        ArrayList arrayList;
        int i = 0;
        SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
        if (z) {
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < otherThemes.size(); i2++) {
                JSONObject saveJson = ((ThemeInfo) otherThemes.get(i2)).getSaveJson();
                if (saveJson != null) {
                    jSONArray.put(saveJson);
                }
            }
            editorEdit.putString("themes2", jSONArray.toString());
        }
        int i3 = 0;
        while (i3 < 4) {
            StringBuilder sb = new StringBuilder();
            sb.append("2remoteThemesHash");
            Object objValueOf = "";
            sb.append(i3 != 0 ? Integer.valueOf(i3) : "");
            editorEdit.putLong(sb.toString(), remoteThemesHash[i3]);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("lastLoadingThemesTime");
            if (i3 != 0) {
                objValueOf = Integer.valueOf(i3);
            }
            sb2.append(objValueOf);
            editorEdit.putInt(sb2.toString(), lastLoadingThemesTime[i3]);
            i3++;
        }
        editorEdit.putInt("lastLoadingCurrentThemeTime", lastLoadingCurrentThemeTime);
        editorEdit.commit();
        if (z) {
            while (i < 5) {
                if (i == 0) {
                    str = "Blue";
                } else if (i == 1) {
                    str = "Dark Blue";
                } else if (i == 2) {
                    str = "Arctic Blue";
                } else if (i == 3) {
                    str = "Day";
                } else {
                    str = "Night";
                }
                ThemeInfo themeInfo = (ThemeInfo) themesDict.get(str);
                if (themeInfo == null || (arrayList = themeInfo.themeAccents) == null || arrayList.isEmpty()) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    saveThemeAccents(themeInfo, true, false, false, false, z3);
                }
                i++;
                z2 = z3;
            }
        }
    }

    public static int[] getDefaultColors() {
        return defaultColors;
    }

    public static ThemeInfo getPreviousTheme() {
        return previousTheme;
    }

    public static String getCurrentNightThemeName() {
        ThemeInfo themeInfo = currentNightTheme;
        if (themeInfo == null) {
            return "";
        }
        String name = themeInfo.getName();
        return name.toLowerCase().endsWith(".attheme") ? name.substring(0, name.lastIndexOf(46)) : name;
    }

    public static ThemeInfo getCurrentTheme() {
        ThemeInfo themeInfo = currentDayTheme;
        return themeInfo != null ? themeInfo : defaultTheme;
    }

    public static ThemeInfo getCurrentNightTheme() {
        return currentNightTheme;
    }

    public static boolean isCurrentThemeNight() {
        return currentTheme == currentNightTheme;
    }

    public static boolean isCurrentThemeDark() {
        return currentTheme.isDark();
    }

    public static ThemeInfo getActiveTheme() {
        return currentTheme;
    }

    public static long getAutoNightSwitchThemeDelay() {
        return Math.abs(lastThemeSwitchTime - SystemClock.elapsedRealtime()) >= 12000 ? 1800L : 12000L;
    }

    public static void setCurrentNightTheme(ThemeInfo themeInfo) {
        boolean z = currentTheme == currentNightTheme;
        currentNightTheme = themeInfo;
        if (z) {
            applyDayNightThemeMaybe(true);
        }
    }

    public static void checkAutoNightThemeConditions() {
        checkAutoNightThemeConditions(false);
    }

    public static void cancelAutoNightThemeCallbacks() {
        if (selectedAutoNightType != 2) {
            if (switchNightRunnableScheduled) {
                switchNightRunnableScheduled = false;
                AndroidUtilities.cancelRunOnUIThread(switchNightBrightnessRunnable);
            }
            if (switchDayRunnableScheduled) {
                switchDayRunnableScheduled = false;
                AndroidUtilities.cancelRunOnUIThread(switchDayBrightnessRunnable);
            }
            if (lightSensorRegistered) {
                lastBrightnessValue = 1.0f;
                sensorManager.unregisterListener(ambientSensorListener, lightSensor);
                lightSensorRegistered = false;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("light sensor unregistered");
                }
            }
        }
    }

    private static int needSwitchToTheme() {
        Sensor sensor;
        SensorEventListener sensorEventListener;
        int i;
        int i2;
        int i3 = selectedAutoNightType;
        if (i3 == 1) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i4 = (calendar.get(11) * 60) + calendar.get(12);
            if (autoNightScheduleByLocation) {
                int i5 = calendar.get(5);
                if (autoNightLastSunCheckDay != i5) {
                    double d = autoNightLocationLatitude;
                    if (d != 10000.0d) {
                        double d2 = autoNightLocationLongitude;
                        if (d2 != 10000.0d) {
                            int[] iArrCalculateSunriseSunset = SunDate.calculateSunriseSunset(d, d2);
                            autoNightSunriseTime = iArrCalculateSunriseSunset[0];
                            autoNightSunsetTime = iArrCalculateSunriseSunset[1];
                            autoNightLastSunCheckDay = i5;
                            saveAutoNightThemeConfig();
                        }
                    }
                }
                i = autoNightSunsetTime;
                i2 = autoNightSunriseTime;
            } else {
                i = autoNightDayStartTime;
                i2 = autoNightDayEndTime;
            }
            if (i < i2) {
                return (i > i4 || i4 > i2) ? 1 : 2;
            }
            return ((i > i4 || i4 > 1440) && (i4 < 0 || i4 > i2)) ? 1 : 2;
        }
        if (i3 == 2) {
            if (lightSensor == null) {
                SensorManager sensorManager2 = (SensorManager) ApplicationLoader.applicationContext.getSystemService("sensor");
                sensorManager = sensorManager2;
                lightSensor = sensorManager2.getDefaultSensor(5);
            }
            if (!lightSensorRegistered && (sensor = lightSensor) != null && (sensorEventListener = ambientSensorListener) != null) {
                sensorManager.registerListener(sensorEventListener, sensor, 500000);
                lightSensorRegistered = true;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("light sensor registered");
                }
            }
            if (lastBrightnessValue <= autoNightBrighnessThreshold) {
                if (!switchNightRunnableScheduled) {
                    return 2;
                }
            } else if (!switchDayRunnableScheduled) {
                return 1;
            }
        } else if (i3 == 3) {
            int i6 = ApplicationLoader.applicationContext.getResources().getConfiguration().uiMode & 48;
            if (i6 == 0 || i6 == 16) {
                return 1;
            }
            if (i6 == 32) {
                return 2;
            }
        } else if (i3 == 0) {
            return 1;
        }
        return 0;
    }

    public static void setChangingWallpaper(boolean z) {
        changingWallpaper = z;
        if (z) {
            return;
        }
        checkAutoNightThemeConditions(false);
    }

    public static void checkAutoNightThemeConditions(boolean z) {
        if (previousTheme != null || changingWallpaper) {
            return;
        }
        if (!z && switchNightThemeDelay > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - lastDelayUpdateTime;
            lastDelayUpdateTime = jElapsedRealtime;
            int i = (int) (((long) switchNightThemeDelay) - j);
            switchNightThemeDelay = i;
            if (i > 0) {
                return;
            }
        }
        if (z) {
            if (switchNightRunnableScheduled) {
                switchNightRunnableScheduled = false;
                AndroidUtilities.cancelRunOnUIThread(switchNightBrightnessRunnable);
            }
            if (switchDayRunnableScheduled) {
                switchDayRunnableScheduled = false;
                AndroidUtilities.cancelRunOnUIThread(switchDayBrightnessRunnable);
            }
        }
        cancelAutoNightThemeCallbacks();
        int iNeedSwitchToTheme = needSwitchToTheme();
        if (iNeedSwitchToTheme != 0) {
            applyDayNightThemeMaybe(iNeedSwitchToTheme == 2);
        }
        if (z) {
            lastThemeSwitchTime = 0L;
        }
    }

    public static void applyDayNightThemeMaybe(boolean z) {
        ThemeInfo themeInfo;
        if (previousTheme != null) {
            return;
        }
        if (z) {
            ThemeInfo themeInfo2 = currentTheme;
            ThemeInfo themeInfo3 = currentNightTheme;
            if (themeInfo2 != themeInfo3) {
                if (themeInfo2 == null || !(themeInfo3 == null || themeInfo2.isDark() == currentNightTheme.isDark())) {
                    isInNigthMode = true;
                    lastThemeSwitchTime = SystemClock.elapsedRealtime();
                    switchingNightTheme = true;
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.needSetDayNightTheme, currentNightTheme, Boolean.TRUE, null, -1);
                    switchingNightTheme = false;
                    return;
                }
                return;
            }
            return;
        }
        ThemeInfo themeInfo4 = currentDayTheme;
        if (themeInfo4 != null && themeInfo4.isDark() && selectedAutoNightType != 0 && (themeInfo = defaultTheme) != null) {
            themeInfo4 = themeInfo;
        }
        ThemeInfo themeInfo5 = currentTheme;
        if (themeInfo5 != themeInfo4) {
            if (themeInfo5 == null || !(themeInfo4 == null || themeInfo5.isDark() == themeInfo4.isDark())) {
                isInNigthMode = false;
                lastThemeSwitchTime = SystemClock.elapsedRealtime();
                switchingNightTheme = true;
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.needSetDayNightTheme, themeInfo4, Boolean.TRUE, null, -1);
                switchingNightTheme = false;
            }
        }
    }

    public static boolean deleteTheme(ThemeInfo themeInfo) {
        boolean z = false;
        if (themeInfo.pathToFile == null) {
            return false;
        }
        if (currentTheme == themeInfo) {
            applyTheme(defaultTheme, true, false, false);
            z = true;
        }
        if (themeInfo == currentNightTheme) {
            currentNightTheme = (ThemeInfo) themesDict.get("Dark Blue");
        }
        themeInfo.removeObservers();
        otherThemes.remove(themeInfo);
        themesDict.remove(themeInfo.name);
        OverrideWallpaperInfo overrideWallpaperInfo = themeInfo.overrideWallpaper;
        if (overrideWallpaperInfo != null) {
            overrideWallpaperInfo.delete();
        }
        themes.remove(themeInfo);
        new File(themeInfo.pathToFile).delete();
        saveOtherThemes(true);
        return z;
    }

    public static ThemeInfo createNewTheme(String str) throws Throwable {
        ThemeInfo themeInfo = new ThemeInfo();
        themeInfo.pathToFile = new File(ApplicationLoader.getFilesDirFixed(), "theme" + Utilities.random.nextLong() + ".attheme").getAbsolutePath();
        themeInfo.name = str;
        themedWallpaperLink = getWallpaperUrl(currentTheme.overrideWallpaper);
        themeInfo.account = UserConfig.selectedAccount;
        saveCurrentTheme(themeInfo, true, true, false);
        return themeInfo;
    }

    private static String getWallpaperUrl(OverrideWallpaperInfo overrideWallpaperInfo) {
        String str;
        if (overrideWallpaperInfo == null || TextUtils.isEmpty(overrideWallpaperInfo.slug) || overrideWallpaperInfo.slug.equals("d")) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (overrideWallpaperInfo.isBlurred) {
            sb.append("blur");
        }
        if (overrideWallpaperInfo.isMotion) {
            if (sb.length() > 0) {
                sb.append("+");
            }
            sb.append("motion");
        }
        int i = overrideWallpaperInfo.color;
        if (i == 0) {
            str = "https://attheme.org?slug=" + overrideWallpaperInfo.slug;
        } else {
            String lowerCase = String.format("%02x%02x%02x", Integer.valueOf(((byte) (i >> 16)) & 255), Integer.valueOf(((byte) (overrideWallpaperInfo.color >> 8)) & 255), Byte.valueOf((byte) (overrideWallpaperInfo.color & 255))).toLowerCase();
            int i2 = overrideWallpaperInfo.gradientColor1;
            String lowerCase2 = i2 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i2 >> 16)) & 255), Integer.valueOf(((byte) (overrideWallpaperInfo.gradientColor1 >> 8)) & 255), Byte.valueOf((byte) (overrideWallpaperInfo.gradientColor1 & 255))).toLowerCase() : null;
            int i3 = overrideWallpaperInfo.gradientColor2;
            String lowerCase3 = i3 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i3 >> 16)) & 255), Integer.valueOf(((byte) (overrideWallpaperInfo.gradientColor2 >> 8)) & 255), Byte.valueOf((byte) (overrideWallpaperInfo.gradientColor2 & 255))).toLowerCase() : null;
            int i4 = overrideWallpaperInfo.gradientColor3;
            String lowerCase4 = i4 != 0 ? String.format("%02x%02x%02x", Integer.valueOf(((byte) (i4 >> 16)) & 255), Integer.valueOf(((byte) (overrideWallpaperInfo.gradientColor3 >> 8)) & 255), Byte.valueOf((byte) (overrideWallpaperInfo.gradientColor3 & 255))).toLowerCase() : null;
            if (lowerCase2 == null || lowerCase3 == null) {
                if (lowerCase2 != null) {
                    lowerCase = (lowerCase + "-" + lowerCase2) + "&rotation=" + overrideWallpaperInfo.rotation;
                }
            } else if (lowerCase4 != null) {
                lowerCase = lowerCase + "~" + lowerCase2 + "~" + lowerCase3 + "~" + lowerCase4;
            } else {
                lowerCase = lowerCase + "~" + lowerCase2 + "~" + lowerCase3;
            }
            str = "https://attheme.org?slug=" + overrideWallpaperInfo.slug + "&intensity=" + ((int) (overrideWallpaperInfo.intensity * 100.0f)) + "&bg_color=" + lowerCase;
        }
        if (sb.length() <= 0) {
            return str;
        }
        return str + "&mode=" + sb.toString();
    }

    public static void saveCurrentTheme(ThemeInfo themeInfo, boolean z, boolean z2, boolean z3) throws Throwable {
        String wallpaperUrl;
        Throwable th;
        FileOutputStream fileOutputStream;
        Bitmap bitmap;
        OverrideWallpaperInfo overrideWallpaperInfo = themeInfo.overrideWallpaper;
        if (overrideWallpaperInfo != null) {
            wallpaperUrl = getWallpaperUrl(overrideWallpaperInfo);
        } else {
            wallpaperUrl = themedWallpaperLink;
        }
        Drawable drawable = z2 ? wallpaper : themedWallpaper;
        if (z2 && drawable != null) {
            themedWallpaper = wallpaper;
        }
        ThemeAccent accent = currentTheme.getAccent(false);
        boolean z4 = currentTheme.firstAccentIsDefault && accent.id == DEFALT_THEME_ACCENT_ID;
        FileOutputStream fileOutputStream2 = null;
        SparseIntArray sparseIntArray = z4 ? null : currentColors;
        StringBuilder sb = new StringBuilder();
        if (!z4) {
            int i = accent != null ? accent.myMessagesAccentColor : 0;
            int i2 = accent != null ? accent.myMessagesGradientAccentColor1 : 0;
            int i3 = accent != null ? accent.myMessagesGradientAccentColor2 : 0;
            int i4 = accent != null ? accent.myMessagesGradientAccentColor3 : 0;
            if (i != 0 && i2 != 0) {
                sparseIntArray.put(key_chat_outBubble, i);
                sparseIntArray.put(key_chat_outBubbleGradient1, i2);
                if (i3 != 0) {
                    sparseIntArray.put(key_chat_outBubbleGradient2, i3);
                    if (i4 != 0) {
                        sparseIntArray.put(key_chat_outBubbleGradient3, i4);
                    }
                }
                sparseIntArray.put(key_chat_outBubbleGradientAnimated, (accent == null || !accent.myMessagesAnimated) ? 0 : 1);
            }
        }
        try {
            try {
                try {
                    try {
                        if (!z4) {
                            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                                int iKeyAt = sparseIntArray.keyAt(i5);
                                int iValueAt = sparseIntArray.valueAt(i5);
                                if ((!(drawable instanceof BitmapDrawable) && wallpaperUrl == null) || (key_chat_wallpaper != iKeyAt && key_chat_wallpaper_gradient_to1 != iKeyAt && key_chat_wallpaper_gradient_to2 != iKeyAt && key_chat_wallpaper_gradient_to3 != iKeyAt)) {
                                    sb.append(ThemeColors.getStringName(iKeyAt));
                                    sb.append("=");
                                    sb.append(iValueAt);
                                    sb.append("\n");
                                }
                            }
                        } else {
                            int i6 = 0;
                            while (true) {
                                int[] iArr = defaultColors;
                                if (i6 >= iArr.length) {
                                    break;
                                }
                                int i7 = iArr[i6];
                                if ((!(drawable instanceof BitmapDrawable) && wallpaperUrl == null) || (key_chat_wallpaper != i6 && key_chat_wallpaper_gradient_to1 != i6 && key_chat_wallpaper_gradient_to2 != i6 && key_chat_wallpaper_gradient_to3 != i6)) {
                                    sb.append(ThemeColors.getStringName(i6));
                                    sb.append("=");
                                    sb.append(i7);
                                    sb.append("\n");
                                }
                                i6++;
                            }
                            fileOutputStream = new FileOutputStream(themeInfo.pathToFile);
                            if (sb.length() == 0 && !(drawable instanceof BitmapDrawable) && TextUtils.isEmpty(wallpaperUrl)) {
                                sb.append(' ');
                            }
                            fileOutputStream.write(AndroidUtilities.getStringBytes(sb.toString()));
                            if (!TextUtils.isEmpty(wallpaperUrl)) {
                                fileOutputStream.write(AndroidUtilities.getStringBytes("WLS=" + wallpaperUrl + "\n"));
                                if (z2) {
                                    try {
                                        Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                                        FileOutputStream fileOutputStream3 = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(wallpaperUrl) + ".wp"));
                                        bitmap2.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream3);
                                        fileOutputStream3.close();
                                    } catch (Throwable th2) {
                                        FileLog.e(th2);
                                    }
                                }
                            } else if (drawable instanceof BitmapDrawable) {
                                bitmap = ((BitmapDrawable) drawable).getBitmap();
                                if (bitmap != null) {
                                    fileOutputStream.write(new byte[]{87, 80, 83, 10});
                                    bitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                                    fileOutputStream.write(new byte[]{10, 87, 80, 69, 10});
                                }
                                if (z && !z3) {
                                    wallpaper = drawable;
                                    calcBackgroundColor(drawable, 2);
                                }
                            }
                            if (!z3) {
                                if (themesDict.get(themeInfo.getKey()) == null) {
                                    themes.add(themeInfo);
                                    themesDict.put(themeInfo.getKey(), themeInfo);
                                    otherThemes.add(themeInfo);
                                    saveOtherThemes(true);
                                    sortThemes();
                                }
                                currentTheme = themeInfo;
                                if (themeInfo != currentNightTheme) {
                                    currentDayTheme = themeInfo;
                                }
                                if (z4) {
                                    currentColorsNoAccent.clear();
                                    refreshThemeColors();
                                }
                                SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                                editorEdit.putString("theme", currentDayTheme.getKey());
                                editorEdit.apply();
                            }
                            fileOutputStream.close();
                            if (z) {
                                MessagesController.getInstance(themeInfo.account).saveThemeToServer(themeInfo, themeInfo.getAccent(false));
                            }
                        }
                        if (sb.length() == 0) {
                            sb.append(' ');
                        }
                        fileOutputStream.write(AndroidUtilities.getStringBytes(sb.toString()));
                        if (!TextUtils.isEmpty(wallpaperUrl)) {
                            fileOutputStream.write(AndroidUtilities.getStringBytes("WLS=" + wallpaperUrl + "\n"));
                            if (z2) {
                                Bitmap bitmap3 = ((BitmapDrawable) drawable).getBitmap();
                                FileOutputStream fileOutputStream4 = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(wallpaperUrl) + ".wp"));
                                bitmap3.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream4);
                                fileOutputStream4.close();
                            }
                        } else if (drawable instanceof BitmapDrawable) {
                            bitmap = ((BitmapDrawable) drawable).getBitmap();
                            if (bitmap != null) {
                                fileOutputStream.write(new byte[]{87, 80, 83, 10});
                                bitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                                fileOutputStream.write(new byte[]{10, 87, 80, 69, 10});
                            }
                            if (z) {
                                wallpaper = drawable;
                                calcBackgroundColor(drawable, 2);
                            }
                        }
                        if (!z3) {
                            if (themesDict.get(themeInfo.getKey()) == null) {
                                themes.add(themeInfo);
                                themesDict.put(themeInfo.getKey(), themeInfo);
                                otherThemes.add(themeInfo);
                                saveOtherThemes(true);
                                sortThemes();
                            }
                            currentTheme = themeInfo;
                            if (themeInfo != currentNightTheme) {
                                currentDayTheme = themeInfo;
                            }
                            if (z4) {
                                currentColorsNoAccent.clear();
                                refreshThemeColors();
                            }
                            SharedPreferences.Editor editorEdit2 = MessagesController.getGlobalMainSettings().edit();
                            editorEdit2.putString("theme", currentDayTheme.getKey());
                            editorEdit2.apply();
                        }
                        fileOutputStream.close();
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream2 = fileOutputStream;
                        FileLog.e(e);
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        if (z) {
                            MessagesController.getInstance(themeInfo.account).saveThemeToServer(themeInfo, themeInfo.getAccent(false));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (Exception e2) {
                                FileLog.e(e2);
                                throw th;
                            }
                        }
                        throw th;
                    }
                    fileOutputStream = new FileOutputStream(themeInfo.pathToFile);
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = fileOutputStream2;
            }
        } catch (Exception e4) {
            e = e4;
        }
        if (z) {
            MessagesController.getInstance(themeInfo.account).saveThemeToServer(themeInfo, themeInfo.getAccent(false));
        }
    }

    public static void checkCurrentRemoteTheme(boolean z) {
        int i;
        if (loadingCurrentTheme == 0) {
            if (z || Math.abs((System.currentTimeMillis() / 1000) - ((long) lastLoadingCurrentThemeTime)) >= 3600) {
                int i2 = 0;
                while (i2 < 2) {
                    final ThemeInfo themeInfo = i2 == 0 ? currentDayTheme : currentNightTheme;
                    if (themeInfo != null && UserConfig.getInstance(themeInfo.account).isClientActivated()) {
                        final ThemeAccent accent = themeInfo.getAccent(false);
                        final TLRPC.TL_theme tL_theme = themeInfo.info;
                        if (tL_theme != null) {
                            i = themeInfo.account;
                        } else if (accent != null && (tL_theme = accent.info) != null) {
                            i = UserConfig.selectedAccount;
                        }
                        if (tL_theme.document != null) {
                            loadingCurrentTheme++;
                            TL_account.getTheme gettheme = new TL_account.getTheme();
                            gettheme.document_id = tL_theme.document.id;
                            gettheme.format = "android";
                            TLRPC.TL_inputTheme tL_inputTheme = new TLRPC.TL_inputTheme();
                            tL_inputTheme.access_hash = tL_theme.access_hash;
                            tL_inputTheme.id = tL_theme.id;
                            gettheme.theme = tL_inputTheme;
                            ConnectionsManager.getInstance(i).sendRequest(gettheme, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            Theme.m1279$r8$lambda$YaQiMDK_ThvoQBl6AnzeXT7s8(tLObject, themeAccent, themeInfo, tL_theme);
                                        }
                                    });
                                }
                            });
                        }
                    }
                    i2++;
                }
            }
        }
    }

    public static void m1279$r8$lambda$YaQiMDK_ThvoQBl6AnzeXT7s8(TLObject tLObject, ThemeAccent themeAccent, ThemeInfo themeInfo, TLRPC.TL_theme tL_theme) {
        boolean z;
        TLRPC.WallPaperSettings wallPaperSettings;
        boolean z2 = false;
        loadingCurrentTheme--;
        if (tLObject instanceof TLRPC.TL_theme) {
            TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) tLObject;
            TLRPC.ThemeSettings themeSettings = tL_theme2.settings.size() > 0 ? tL_theme2.settings.get(0) : null;
            if (themeAccent != null && themeSettings != null) {
                if (ThemeInfo.accentEquals(themeAccent, themeSettings)) {
                    z = false;
                } else {
                    File pathToWallpaper = themeAccent.getPathToWallpaper();
                    if (pathToWallpaper != null) {
                        pathToWallpaper.delete();
                    }
                    ThemeInfo.fillAccentValues(themeAccent, themeSettings);
                    ThemeInfo themeInfo2 = currentTheme;
                    if (themeInfo2 == themeInfo && themeInfo2.currentAccentId == themeAccent.id) {
                        refreshThemeColors();
                        createChatResources(ApplicationLoader.applicationContext, false);
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        int i = NotificationCenter.needSetDayNightTheme;
                        ThemeInfo themeInfo3 = currentTheme;
                        globalInstance.postNotificationName(i, themeInfo3, Boolean.valueOf(currentNightTheme == themeInfo3), null, -1);
                    }
                    PatternsLoader.createLoader(true);
                    z = true;
                }
                TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                if (wallPaper != null && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.motion) {
                    z2 = true;
                }
                themeAccent.patternMotion = z2;
                z2 = z;
            } else {
                TLRPC.Document document = tL_theme2.document;
                if (document != null && document.id != tL_theme.document.id) {
                    if (themeAccent != null) {
                        themeAccent.info = tL_theme2;
                    } else {
                        themeInfo.info = tL_theme2;
                        themeInfo.loadThemeDocument();
                    }
                    z2 = true;
                }
            }
        }
        if (loadingCurrentTheme == 0) {
            lastLoadingCurrentThemeTime = (int) (System.currentTimeMillis() / 1000);
            saveOtherThemes(z2);
        }
    }

    public static void loadRemoteThemes(final int i, boolean z) {
        if (loadingRemoteThemes[i]) {
            return;
        }
        if ((z || Math.abs((System.currentTimeMillis() / 1000) - ((long) lastLoadingThemesTime[i])) >= 3600) && UserConfig.getInstance(i).isClientActivated()) {
            loadingRemoteThemes[i] = true;
            TL_account.getThemes getthemes = new TL_account.getThemes();
            getthemes.format = "android";
            if (!MediaDataController.getInstance(i).defaultEmojiThemes.isEmpty()) {
                getthemes.hash = remoteThemesHash[i];
            }
            if (BuildVars.LOGS_ENABLED) {
                Log.i("theme", "loading remote themes, hash " + getthemes.hash);
            }
            ConnectionsManager.getInstance(i).sendRequest(getthemes, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            Theme.$r8$lambda$QJ4M_NRBSxhPO8JEoHapVMMxNAI(i, tLObject);
                        }
                    });
                }
            });
        }
    }

    public static void $r8$lambda$QJ4M_NRBSxhPO8JEoHapVMMxNAI(int i, TLObject tLObject) {
        boolean z;
        ThemeInfo themeInfo;
        ArrayList<TLRPC.TL_theme> arrayList;
        String baseThemeKey;
        TLRPC.WallPaperSettings wallPaperSettings;
        loadingRemoteThemes[i] = false;
        if (tLObject instanceof TL_account.TL_themes) {
            TL_account.TL_themes tL_themes = (TL_account.TL_themes) tLObject;
            remoteThemesHash[i] = tL_themes.hash;
            lastLoadingThemesTime[i] = (int) (System.currentTimeMillis() / 1000);
            ArrayList<TLRPC.TL_theme> arrayList2 = new ArrayList<>();
            ArrayList arrayList3 = new ArrayList();
            int size = themes.size();
            for (int i2 = 0; i2 < size; i2++) {
                ThemeInfo themeInfo2 = (ThemeInfo) themes.get(i2);
                if (themeInfo2.info != null && themeInfo2.account == i) {
                    arrayList3.add(themeInfo2);
                } else if (themeInfo2.themeAccents != null) {
                    for (int i3 = 0; i3 < themeInfo2.themeAccents.size(); i3++) {
                        ThemeAccent themeAccent = (ThemeAccent) themeInfo2.themeAccents.get(i3);
                        if (themeAccent.info != null && themeAccent.account == i) {
                            arrayList3.add(themeAccent);
                        }
                    }
                }
            }
            int size2 = tL_themes.themes.size();
            int i4 = 0;
            boolean z2 = false;
            boolean z3 = false;
            while (i4 < size2) {
                TLRPC.TL_theme tL_theme = tL_themes.themes.get(i4);
                if (OnBackPressedDispatcher$$ExternalSyntheticNonNull0.m(tL_theme)) {
                    if (tL_theme.isDefault) {
                        arrayList2.add(tL_theme);
                    }
                    ArrayList<TLRPC.ThemeSettings> arrayList4 = tL_theme.settings;
                    if (arrayList4 != null && arrayList4.size() > 0) {
                        int i5 = 0;
                        while (i5 < tL_theme.settings.size()) {
                            TLRPC.ThemeSettings themeSettings = tL_theme.settings.get(i5);
                            if (themeSettings != null && (baseThemeKey = getBaseThemeKey(themeSettings)) != null) {
                                ThemeInfo themeInfo3 = (ThemeInfo) themesDict.get(baseThemeKey);
                                if (themeInfo3 == null || themeInfo3.themeAccents == null) {
                                    arrayList2 = arrayList2;
                                } else {
                                    arrayList2 = arrayList2;
                                    ThemeAccent themeAccentCreateNewAccent = (ThemeAccent) themeInfo3.accentsByThemeId.get(tL_theme.id);
                                    if (themeAccentCreateNewAccent != null) {
                                        if (!ThemeInfo.accentEquals(themeAccentCreateNewAccent, themeSettings)) {
                                            File pathToWallpaper = themeAccentCreateNewAccent.getPathToWallpaper();
                                            if (pathToWallpaper != null) {
                                                pathToWallpaper.delete();
                                            }
                                            ThemeInfo.fillAccentValues(themeAccentCreateNewAccent, themeSettings);
                                            ThemeInfo themeInfo4 = currentTheme;
                                            if (themeInfo4 == themeInfo3 && themeInfo4.currentAccentId == themeAccentCreateNewAccent.id) {
                                                refreshThemeColors();
                                                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                                int i6 = NotificationCenter.needSetDayNightTheme;
                                                ThemeInfo themeInfo5 = currentTheme;
                                                globalInstance.postNotificationName(i6, themeInfo5, Boolean.valueOf(currentNightTheme == themeInfo5), null, -1);
                                            }
                                            z2 = true;
                                            z3 = true;
                                        }
                                        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                                        themeAccentCreateNewAccent.patternMotion = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                                        arrayList3.remove(themeAccentCreateNewAccent);
                                    } else {
                                        themeAccentCreateNewAccent = themeInfo3.createNewAccent(tL_theme, i, false, i5);
                                        if (!TextUtils.isEmpty(themeAccentCreateNewAccent.patternSlug)) {
                                            z2 = true;
                                        }
                                    }
                                    themeAccentCreateNewAccent.isDefault = tL_theme.isDefault;
                                }
                            }
                            i5++;
                            arrayList2 = arrayList2;
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = arrayList2;
                        String str = "remote" + tL_theme.id;
                        ThemeInfo themeInfo6 = (ThemeInfo) themesDict.get(str);
                        if (themeInfo6 == null) {
                            themeInfo6 = new ThemeInfo();
                            themeInfo6.account = i;
                            themeInfo6.pathToFile = new File(ApplicationLoader.getFilesDirFixed(), str + ".attheme").getAbsolutePath();
                            themes.add(themeInfo6);
                            otherThemes.add(themeInfo6);
                            z3 = true;
                        } else {
                            arrayList3.remove(themeInfo6);
                        }
                        themeInfo6.name = tL_theme.title;
                        themeInfo6.info = tL_theme;
                        themesDict.put(themeInfo6.getKey(), themeInfo6);
                    }
                    i4++;
                    arrayList2 = arrayList;
                } else {
                    arrayList = arrayList2;
                }
                i4++;
                arrayList2 = arrayList;
            }
            ArrayList<TLRPC.TL_theme> arrayList5 = arrayList2;
            boolean z4 = true;
            int size3 = arrayList3.size();
            for (int i7 = 0; i7 < size3; i7++) {
                Object obj = arrayList3.get(i7);
                if (obj instanceof ThemeInfo) {
                    ThemeInfo themeInfo7 = (ThemeInfo) obj;
                    themeInfo7.removeObservers();
                    otherThemes.remove(themeInfo7);
                    themesDict.remove(themeInfo7.name);
                    OverrideWallpaperInfo overrideWallpaperInfo = themeInfo7.overrideWallpaper;
                    if (overrideWallpaperInfo != null) {
                        overrideWallpaperInfo.delete();
                    }
                    themes.remove(themeInfo7);
                    new File(themeInfo7.pathToFile).delete();
                    if (currentDayTheme == themeInfo7) {
                        currentDayTheme = defaultTheme;
                    } else {
                        if (currentNightTheme == themeInfo7) {
                            currentNightTheme = (ThemeInfo) themesDict.get("Dark Blue");
                            z = true;
                        }
                        if (currentTheme == themeInfo7) {
                            if (z) {
                                themeInfo = currentNightTheme;
                            } else {
                                themeInfo = currentDayTheme;
                            }
                            applyTheme(themeInfo, true, false, z);
                        }
                    }
                    z = false;
                    if (currentTheme == themeInfo7) {
                        if (z) {
                            themeInfo = currentNightTheme;
                        } else {
                            themeInfo = currentDayTheme;
                        }
                        applyTheme(themeInfo, true, false, z);
                    }
                } else {
                    if (obj instanceof ThemeAccent) {
                        ThemeAccent themeAccent2 = (ThemeAccent) obj;
                        if (deleteThemeAccent(themeAccent2.parentTheme, themeAccent2, false) && currentTheme == themeAccent2.parentTheme) {
                            refreshThemeColors();
                            NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                            int i8 = NotificationCenter.needSetDayNightTheme;
                            ThemeInfo themeInfo8 = currentTheme;
                            z4 = true;
                            globalInstance2.postNotificationName(i8, themeInfo8, Boolean.valueOf(currentNightTheme == themeInfo8), null, -1);
                        }
                    }
                }
                z4 = true;
            }
            saveOtherThemes(z4);
            sortThemes();
            if (z3) {
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.themeListUpdated, new Object[0]);
            }
            if (z2) {
                PatternsLoader.createLoader(z4);
            }
            MediaDataController.getInstance(i).generateEmojiPreviewThemes(arrayList5, i);
        }
    }

    public static String getBaseThemeKey(TLRPC.ThemeSettings themeSettings) {
        if (themeSettings == null) {
            return null;
        }
        TLRPC.BaseTheme baseTheme = themeSettings.base_theme;
        if (baseTheme instanceof TLRPC.TL_baseThemeClassic) {
            return "Blue";
        }
        if (baseTheme instanceof TLRPC.TL_baseThemeDay) {
            return "Day";
        }
        if (baseTheme instanceof TLRPC.TL_baseThemeTinted) {
            return "Dark Blue";
        }
        if (baseTheme instanceof TLRPC.TL_baseThemeArctic) {
            return "Arctic Blue";
        }
        if (baseTheme instanceof TLRPC.TL_baseThemeNight) {
            return "Night";
        }
        return null;
    }

    public static TLRPC.BaseTheme getBaseThemeByKey(String str) {
        if ("Blue".equals(str)) {
            return new TLRPC.TL_baseThemeClassic();
        }
        if ("Day".equals(str)) {
            return new TLRPC.TL_baseThemeDay();
        }
        if ("Dark Blue".equals(str)) {
            return new TLRPC.TL_baseThemeTinted();
        }
        if ("Arctic Blue".equals(str)) {
            return new TLRPC.TL_baseThemeArctic();
        }
        if ("Night".equals(str)) {
            return new TLRPC.TL_baseThemeNight();
        }
        return null;
    }

    public static void setThemeFileReference(TLRPC.TL_theme tL_theme) {
        TLRPC.Document document;
        int size = themes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.TL_theme tL_theme2 = ((ThemeInfo) themes.get(i)).info;
            if (tL_theme2 != null && tL_theme2.id == tL_theme.id) {
                TLRPC.Document document2 = tL_theme2.document;
                if (document2 == null || (document = tL_theme.document) == null) {
                    return;
                }
                document2.file_reference = document.file_reference;
                saveOtherThemes(true);
                return;
            }
        }
    }

    public static boolean isThemeInstalled(ThemeInfo themeInfo) {
        return (themeInfo == null || themesDict.get(themeInfo.getKey()) == null) ? false : true;
    }

    public static void setThemeUploadInfo(ThemeInfo themeInfo, ThemeAccent themeAccent, TLRPC.TL_theme tL_theme, int i, boolean z) {
        String key;
        TLRPC.WallPaperSettings wallPaperSettings;
        if (tL_theme == null) {
            return;
        }
        TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
        if (themeSettings != null) {
            if (themeInfo == null) {
                String baseThemeKey = getBaseThemeKey(themeSettings);
                if (baseThemeKey == null || (themeInfo = (ThemeInfo) themesDict.get(baseThemeKey)) == null) {
                    return;
                } else {
                    themeAccent = (ThemeAccent) themeInfo.accentsByThemeId.get(tL_theme.id);
                }
            }
            if (themeAccent == null) {
                return;
            }
            TLRPC.TL_theme tL_theme2 = themeAccent.info;
            if (tL_theme2 != null) {
                themeInfo.accentsByThemeId.remove(tL_theme2.id);
            }
            themeAccent.info = tL_theme;
            themeAccent.account = i;
            themeInfo.accentsByThemeId.put(tL_theme.id, themeAccent);
            if (!ThemeInfo.accentEquals(themeAccent, themeSettings)) {
                File pathToWallpaper = themeAccent.getPathToWallpaper();
                if (pathToWallpaper != null) {
                    pathToWallpaper.delete();
                }
                ThemeInfo.fillAccentValues(themeAccent, themeSettings);
                ThemeInfo themeInfo2 = currentTheme;
                if (themeInfo2 == themeInfo && themeInfo2.currentAccentId == themeAccent.id) {
                    refreshThemeColors();
                    NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                    int i2 = NotificationCenter.needSetDayNightTheme;
                    ThemeInfo themeInfo3 = currentTheme;
                    globalInstance.postNotificationName(i2, themeInfo3, Boolean.valueOf(currentNightTheme == themeInfo3), null, -1);
                }
                PatternsLoader.createLoader(true);
            }
            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
            themeAccent.patternMotion = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
            themeInfo.previewParsed = false;
        } else {
            if (themeInfo != null) {
                HashMap map = themesDict;
                key = themeInfo.getKey();
                map.remove(key);
            } else {
                HashMap map2 = themesDict;
                key = "remote" + tL_theme.id;
                themeInfo = (ThemeInfo) map2.get(key);
            }
            if (themeInfo == null) {
                return;
            }
            themeInfo.info = tL_theme;
            themeInfo.name = tL_theme.title;
            File file = new File(themeInfo.pathToFile);
            File file2 = new File(ApplicationLoader.getFilesDirFixed(), key + ".attheme");
            if (!file.equals(file2)) {
                try {
                    AndroidUtilities.copyFile(file, file2);
                    themeInfo.pathToFile = file2.getAbsolutePath();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (z) {
                themeInfo.loadThemeDocument();
            } else {
                themeInfo.previewParsed = false;
            }
            themesDict.put(themeInfo.getKey(), themeInfo);
        }
        saveOtherThemes(true);
    }

    public static File getAssetFile(String str) {
        long jAvailable;
        File file = new File(ApplicationLoader.getFilesDirFixed(), str);
        try {
            InputStream inputStreamOpen = ApplicationLoader.applicationContext.getAssets().open(str);
            jAvailable = inputStreamOpen.available();
            inputStreamOpen.close();
        } catch (Exception e) {
            FileLog.e(e);
            jAvailable = 0;
        }
        if (!file.exists() || (jAvailable != 0 && file.length() != jAvailable)) {
            try {
                InputStream inputStreamOpen2 = ApplicationLoader.applicationContext.getAssets().open(str);
                try {
                    AndroidUtilities.copyFile(inputStreamOpen2, file);
                    if (inputStreamOpen2 != null) {
                        inputStreamOpen2.close();
                    }
                } catch (Throwable th) {
                    if (inputStreamOpen2 != null) {
                        try {
                            inputStreamOpen2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        return file;
    }

    public static int getPreviewColor(SparseIntArray sparseIntArray, int i) {
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        return defaultColors[i];
    }

    public static String createThemePreviewImage(String str, String str2, ThemeAccent themeAccent) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Drawable drawableMutate;
        int i11;
        Drawable drawableMutate2;
        Drawable drawableMutate3;
        Drawable drawableMutate4;
        int i12;
        MessageDrawable[] messageDrawableArr;
        int i13;
        Drawable drawable;
        int i14;
        int i15;
        int i16;
        Drawable drawable2;
        Drawable drawable3;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z;
        int i21;
        FileInputStream fileInputStream;
        BitmapFactory.Options options;
        float f;
        File file;
        int i22;
        int i23;
        Bitmap bitmapDecodeStream;
        int i24;
        int i25;
        Drawable drawableCreateDitheredGradientBitmapDrawable;
        boolean z2;
        int i26;
        try {
            String[] strArr = new String[1];
            final SparseIntArray themeFileValues = getThemeFileValues(new File(str), null, strArr);
            if (themeAccent != null) {
                checkIsDark(themeFileValues, themeAccent.parentTheme);
            }
            int i27 = currentColorsNoAccent.get(key_wallpaperFileOffset, -1);
            Bitmap bitmapCreateBitmap = Bitmaps.createBitmap(560, 678, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            int previewColor = getPreviewColor(themeFileValues, key_actionBarDefault);
            int previewColor2 = getPreviewColor(themeFileValues, key_actionBarDefaultIcon);
            int previewColor3 = getPreviewColor(themeFileValues, key_chat_messagePanelBackground);
            int previewColor4 = getPreviewColor(themeFileValues, key_chat_messagePanelIcons);
            int previewColor5 = getPreviewColor(themeFileValues, key_chat_inBubble);
            int previewColor6 = getPreviewColor(themeFileValues, key_chat_outBubble);
            themeFileValues.get(key_chat_outBubbleGradient1);
            int i28 = themeFileValues.get(key_chat_wallpaper);
            int i29 = themeFileValues.get(key_chat_wallpaper_gradient_to1);
            int i30 = themeFileValues.get(key_chat_wallpaper_gradient_to2);
            int i31 = i28;
            int i32 = themeFileValues.get(key_chat_wallpaper_gradient_to3);
            int i33 = themeAccent != null ? (int) themeAccent.backgroundOverrideColor : 0;
            try {
                if (i33 == 0 && themeAccent != null) {
                    if (themeAccent.backgroundOverrideColor != 0) {
                        i31 = 0;
                    }
                    if (themeAccent != null) {
                        i = (int) themeAccent.backgroundGradientOverrideColor1;
                    } else {
                        i = 0;
                    }
                    if (i != 0 && themeAccent != null) {
                        if (themeAccent.backgroundGradientOverrideColor1 != 0) {
                            i29 = 0;
                        }
                        if (themeAccent != null) {
                            i2 = (int) themeAccent.backgroundGradientOverrideColor2;
                        } else {
                            i2 = 0;
                        }
                        if (i2 != 0 && themeAccent != null) {
                            if (themeAccent.backgroundGradientOverrideColor2 != 0) {
                                i3 = 0;
                            }
                            if (themeAccent != null) {
                                i3 = i2;
                                i4 = (int) themeAccent.backgroundGradientOverrideColor3;
                            } else {
                                i3 = i2;
                                i4 = 0;
                            }
                            if (i4 != 0 && themeAccent != null) {
                                if (themeAccent.backgroundGradientOverrideColor3 != 0) {
                                    i4 = 0;
                                }
                                if (TextUtils.isEmpty(strArr[0])) {
                                    strArr = strArr;
                                    i5 = previewColor2;
                                    i30 = i30;
                                    i7 = i29;
                                    i9 = i31;
                                    i8 = i3;
                                } else {
                                    try {
                                        String queryParameter = Uri.parse(strArr[0]).getQueryParameter("bg_color");
                                        if (themeAccent != null || TextUtils.isEmpty(queryParameter)) {
                                            strArr = strArr;
                                            i5 = previewColor2;
                                            i30 = i30;
                                            i7 = i29;
                                            i9 = i31;
                                            i8 = i3;
                                        } else {
                                            int i34 = Integer.parseInt(queryParameter.substring(0, 6), 16) | (-16777216);
                                            i5 = previewColor2;
                                            try {
                                                themeAccent.backgroundOverrideColor = i34;
                                                if (queryParameter.length() >= 13 && AndroidUtilities.isValidWallChar(queryParameter.charAt(6))) {
                                                    i29 = Integer.parseInt(queryParameter.substring(7, 13), 16) | (-16777216);
                                                    themeAccent.backgroundGradientOverrideColor1 = i29;
                                                }
                                                try {
                                                    if (queryParameter.length() < 20 || !AndroidUtilities.isValidWallChar(queryParameter.charAt(13))) {
                                                        i10 = i29;
                                                        i30 = i30;
                                                        i6 = i3;
                                                    } else {
                                                        i6 = Integer.parseInt(queryParameter.substring(14, 20), 16) | (-16777216);
                                                        i10 = i29;
                                                        i30 = i30;
                                                        try {
                                                            themeAccent.backgroundGradientOverrideColor2 = i6;
                                                        } catch (Exception e) {
                                                            e = e;
                                                            strArr = strArr;
                                                            i31 = i34;
                                                            i29 = i10;
                                                            FileLog.e(e);
                                                            i7 = i29;
                                                            i8 = i6;
                                                            i9 = i31;
                                                            drawableMutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_back).mutate();
                                                            int i35 = i5;
                                                            setDrawableColor(drawableMutate, i35);
                                                            i11 = i8;
                                                            drawableMutate2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                                            setDrawableColor(drawableMutate2, i35);
                                                            drawableMutate3 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                                            setDrawableColor(drawableMutate3, previewColor4);
                                                            drawableMutate4 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                                            setDrawableColor(drawableMutate4, previewColor4);
                                                            messageDrawableArr = new MessageDrawable[2];
                                                            i13 = 0;
                                                            for (i12 = 2; i13 < i12; i12 = 2) {
                                                                Drawable drawable4 = drawableMutate4;
                                                                if (i13 == 1) {
                                                                    z2 = true;
                                                                } else {
                                                                    z2 = false;
                                                                }
                                                                int i36 = i9;
                                                                int i37 = i7;
                                                                MessageDrawable messageDrawable = new MessageDrawable(2, z2, false) {
                                                                    @Override
                                                                    protected int getColor(int i38) {
                                                                        int iIndexOfKey = themeFileValues.indexOfKey(i38);
                                                                        if (iIndexOfKey <= 0) {
                                                                            return Theme.defaultColors[i38];
                                                                        }
                                                                        return themeFileValues.valueAt(iIndexOfKey);
                                                                    }

                                                                    @Override
                                                                    protected int getCurrentColor(int i38) {
                                                                        return themeFileValues.get(i38);
                                                                    }
                                                                };
                                                                messageDrawableArr[i13] = messageDrawable;
                                                                if (i13 == 0) {
                                                                    i26 = previewColor5;
                                                                } else {
                                                                    i26 = previewColor6;
                                                                }
                                                                setDrawableColor(messageDrawable, i26);
                                                                i13++;
                                                                drawableMutate4 = drawable4;
                                                                i9 = i36;
                                                                i7 = i37;
                                                            }
                                                            drawable = drawableMutate4;
                                                            i14 = i9;
                                                            i15 = i7;
                                                            RectF rectF = new RectF();
                                                            i16 = 80;
                                                            if (str2 != null) {
                                                                try {
                                                                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                                                                    options2.inJustDecodeBounds = true;
                                                                    BitmapFactory.decodeFile(str2, options2);
                                                                    i17 = options2.outWidth;
                                                                    if (i17 <= 0) {
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                }
                                                                drawable2 = drawableMutate2;
                                                                drawable3 = drawable;
                                                                i20 = 80;
                                                                z = false;
                                                            } else {
                                                                i21 = i4;
                                                                if (i14 != 0) {
                                                                    if (i15 == 0) {
                                                                        drawableCreateDitheredGradientBitmapDrawable = new ColorDrawable(i14);
                                                                    } else if (i11 != 0) {
                                                                        drawableCreateDitheredGradientBitmapDrawable = new MotionBackgroundDrawable(i14, i15, i11, i21, true);
                                                                    } else {
                                                                        i25 = themeFileValues.get(key_chat_wallpaper_gradient_rotation, -1);
                                                                        if (i25 == -1) {
                                                                            i25 = 45;
                                                                        }
                                                                        drawableCreateDitheredGradientBitmapDrawable = BackgroundGradientDrawable.createDitheredGradientBitmapDrawable(i25, new int[]{i14, i30}, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                                                                        i16 = 90;
                                                                    }
                                                                    drawableCreateDitheredGradientBitmapDrawable.setBounds(0, 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                                                                    drawableCreateDitheredGradientBitmapDrawable.draw(canvas);
                                                                    i20 = i16;
                                                                    drawable2 = drawableMutate2;
                                                                    drawable3 = drawable;
                                                                    z = true;
                                                                } else {
                                                                    drawable2 = drawableMutate2;
                                                                    drawable3 = drawable;
                                                                    if (i27 < 0) {
                                                                        try {
                                                                            options = new BitmapFactory.Options();
                                                                            options.inJustDecodeBounds = true;
                                                                            if (!TextUtils.isEmpty(strArr[0])) {
                                                                                f = 2.0f;
                                                                                file = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(strArr[0]) + ".wp");
                                                                                BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                                                                                fileInputStream = null;
                                                                            } else {
                                                                                f = 2.0f;
                                                                                fileInputStream = new FileInputStream(str);
                                                                                try {
                                                                                    fileInputStream.getChannel().position(i27);
                                                                                    BitmapFactory.decodeStream(fileInputStream, null, options);
                                                                                    file = null;
                                                                                } catch (Throwable th2) {
                                                                                    th = th2;
                                                                                    try {
                                                                                        FileLog.e(th);
                                                                                        if (fileInputStream != null) {
                                                                                            try {
                                                                                                fileInputStream.close();
                                                                                            } catch (Exception e2) {
                                                                                                e = e2;
                                                                                                z = false;
                                                                                                FileLog.e(e);
                                                                                                i20 = 80;
                                                                                            }
                                                                                        }
                                                                                        i20 = 80;
                                                                                        z = false;
                                                                                        if (!z) {
                                                                                            Drawable drawableCreateDefaultWallpaper = createDefaultWallpaper(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                                                                                            drawableCreateDefaultWallpaper.setBounds(0, 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                                                                                            drawableCreateDefaultWallpaper.draw(canvas);
                                                                                        }
                                                                                        paint.setColor(previewColor);
                                                                                        canvas.drawRect(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), 120.0f, paint);
                                                                                        if (drawableMutate != null) {
                                                                                            int intrinsicHeight = (120 - drawableMutate.getIntrinsicHeight()) / 2;
                                                                                            drawableMutate.setBounds(13, intrinsicHeight, drawableMutate.getIntrinsicWidth() + 13, drawableMutate.getIntrinsicHeight() + intrinsicHeight);
                                                                                            drawableMutate.draw(canvas);
                                                                                        }
                                                                                        if (drawable2 != null) {
                                                                                            int width = (bitmapCreateBitmap.getWidth() - drawable2.getIntrinsicWidth()) - 10;
                                                                                            int intrinsicHeight2 = (120 - drawable2.getIntrinsicHeight()) / 2;
                                                                                            drawable2.setBounds(width, intrinsicHeight2, drawable2.getIntrinsicWidth() + width, drawable2.getIntrinsicHeight() + intrinsicHeight2);
                                                                                            drawable2.draw(canvas);
                                                                                        }
                                                                                        messageDrawableArr[1].setBounds(161, 216, bitmapCreateBitmap.getWidth() - 20, 308);
                                                                                        messageDrawableArr[1].setTop(0, 560, 522, false, false);
                                                                                        messageDrawableArr[1].draw(canvas);
                                                                                        messageDrawableArr[1].setBounds(161, 430, bitmapCreateBitmap.getWidth() - 20, 522);
                                                                                        messageDrawableArr[1].setTop(430, 560, 522, false, false);
                                                                                        messageDrawableArr[1].draw(canvas);
                                                                                        messageDrawableArr[0].setBounds(20, 323, 399, 415);
                                                                                        messageDrawableArr[0].setTop(323, 560, 522, false, false);
                                                                                        messageDrawableArr[0].draw(canvas);
                                                                                        paint.setColor(previewColor3);
                                                                                        canvas.drawRect(0.0f, bitmapCreateBitmap.getHeight() - 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), paint);
                                                                                        if (drawableMutate3 != null) {
                                                                                            int height = (bitmapCreateBitmap.getHeight() - 120) + ((120 - drawableMutate3.getIntrinsicHeight()) / 2);
                                                                                            drawableMutate3.setBounds(22, height, drawableMutate3.getIntrinsicWidth() + 22, drawableMutate3.getIntrinsicHeight() + height);
                                                                                            drawableMutate3.draw(canvas);
                                                                                        }
                                                                                        if (drawable3 != null) {
                                                                                            int width2 = (bitmapCreateBitmap.getWidth() - drawable3.getIntrinsicWidth()) - 22;
                                                                                            int height2 = (bitmapCreateBitmap.getHeight() - 120) + ((120 - drawable3.getIntrinsicHeight()) / 2);
                                                                                            drawable3.setBounds(width2, height2, drawable3.getIntrinsicWidth() + width2, drawable3.getIntrinsicHeight() + height2);
                                                                                            drawable3.draw(canvas);
                                                                                        }
                                                                                        canvas.setBitmap(null);
                                                                                        File file2 = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
                                                                                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, i20, new FileOutputStream(file2));
                                                                                        SharedConfig.saveConfig();
                                                                                        return file2.getAbsolutePath();
                                                                                    } catch (Throwable th3) {
                                                                                        if (fileInputStream != null) {
                                                                                            try {
                                                                                                fileInputStream.close();
                                                                                                throw th3;
                                                                                            } catch (Exception e3) {
                                                                                                FileLog.e(e3);
                                                                                                throw th3;
                                                                                            }
                                                                                        }
                                                                                        throw th3;
                                                                                    }
                                                                                }
                                                                            }
                                                                            i22 = options.outWidth;
                                                                            if (i22 > 0) {
                                                                                z = false;
                                                                            } else {
                                                                                z = false;
                                                                            }
                                                                            if (fileInputStream != null) {
                                                                                try {
                                                                                    fileInputStream.close();
                                                                                } catch (Exception e4) {
                                                                                    e = e4;
                                                                                    FileLog.e(e);
                                                                                }
                                                                            }
                                                                            i20 = 80;
                                                                        } catch (Throwable th4) {
                                                                            th = th4;
                                                                            fileInputStream = null;
                                                                        }
                                                                    } else {
                                                                        options = new BitmapFactory.Options();
                                                                        options.inJustDecodeBounds = true;
                                                                        if (!TextUtils.isEmpty(strArr[0])) {
                                                                            f = 2.0f;
                                                                            file = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(strArr[0]) + ".wp");
                                                                            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                                                                            fileInputStream = null;
                                                                        } else {
                                                                            f = 2.0f;
                                                                            fileInputStream = new FileInputStream(str);
                                                                            fileInputStream.getChannel().position(i27);
                                                                            BitmapFactory.decodeStream(fileInputStream, null, options);
                                                                            file = null;
                                                                        }
                                                                        i22 = options.outWidth;
                                                                        if (i22 > 0) {
                                                                            z = false;
                                                                        } else {
                                                                            z = false;
                                                                        }
                                                                        if (fileInputStream != null) {
                                                                            fileInputStream.close();
                                                                        }
                                                                        i20 = 80;
                                                                    }
                                                                }
                                                            }
                                                            if (!z) {
                                                                Drawable drawableCreateDefaultWallpaper2 = createDefaultWallpaper(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                                                                drawableCreateDefaultWallpaper2.setBounds(0, 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                                                                drawableCreateDefaultWallpaper2.draw(canvas);
                                                            }
                                                            paint.setColor(previewColor);
                                                            canvas.drawRect(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), 120.0f, paint);
                                                            if (drawableMutate != null) {
                                                                int intrinsicHeight3 = (120 - drawableMutate.getIntrinsicHeight()) / 2;
                                                                drawableMutate.setBounds(13, intrinsicHeight3, drawableMutate.getIntrinsicWidth() + 13, drawableMutate.getIntrinsicHeight() + intrinsicHeight3);
                                                                drawableMutate.draw(canvas);
                                                            }
                                                            if (drawable2 != null) {
                                                                int width3 = (bitmapCreateBitmap.getWidth() - drawable2.getIntrinsicWidth()) - 10;
                                                                int intrinsicHeight4 = (120 - drawable2.getIntrinsicHeight()) / 2;
                                                                drawable2.setBounds(width3, intrinsicHeight4, drawable2.getIntrinsicWidth() + width3, drawable2.getIntrinsicHeight() + intrinsicHeight4);
                                                                drawable2.draw(canvas);
                                                            }
                                                            messageDrawableArr[1].setBounds(161, 216, bitmapCreateBitmap.getWidth() - 20, 308);
                                                            messageDrawableArr[1].setTop(0, 560, 522, false, false);
                                                            messageDrawableArr[1].draw(canvas);
                                                            messageDrawableArr[1].setBounds(161, 430, bitmapCreateBitmap.getWidth() - 20, 522);
                                                            messageDrawableArr[1].setTop(430, 560, 522, false, false);
                                                            messageDrawableArr[1].draw(canvas);
                                                            messageDrawableArr[0].setBounds(20, 323, 399, 415);
                                                            messageDrawableArr[0].setTop(323, 560, 522, false, false);
                                                            messageDrawableArr[0].draw(canvas);
                                                            paint.setColor(previewColor3);
                                                            canvas.drawRect(0.0f, bitmapCreateBitmap.getHeight() - 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), paint);
                                                            if (drawableMutate3 != null) {
                                                                int height3 = (bitmapCreateBitmap.getHeight() - 120) + ((120 - drawableMutate3.getIntrinsicHeight()) / 2);
                                                                drawableMutate3.setBounds(22, height3, drawableMutate3.getIntrinsicWidth() + 22, drawableMutate3.getIntrinsicHeight() + height3);
                                                                drawableMutate3.draw(canvas);
                                                            }
                                                            if (drawable3 != null) {
                                                                int width4 = (bitmapCreateBitmap.getWidth() - drawable3.getIntrinsicWidth()) - 22;
                                                                int height4 = (bitmapCreateBitmap.getHeight() - 120) + ((120 - drawable3.getIntrinsicHeight()) / 2);
                                                                drawable3.setBounds(width4, height4, drawable3.getIntrinsicWidth() + width4, drawable3.getIntrinsicHeight() + height4);
                                                                drawable3.draw(canvas);
                                                            }
                                                            canvas.setBitmap(null);
                                                            File file3 = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
                                                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, i20, new FileOutputStream(file3));
                                                            SharedConfig.saveConfig();
                                                            return file3.getAbsolutePath();
                                                        }
                                                    }
                                                    if (queryParameter.length() == 27 && AndroidUtilities.isValidWallChar(queryParameter.charAt(20))) {
                                                        int i38 = Integer.parseInt(queryParameter.substring(21), 16) | (-16777216);
                                                        strArr = strArr;
                                                        try {
                                                            themeAccent.backgroundGradientOverrideColor3 = i38;
                                                            i4 = i38;
                                                        } catch (Exception e5) {
                                                            e = e5;
                                                            i4 = i38;
                                                            i31 = i34;
                                                            i29 = i10;
                                                            FileLog.e(e);
                                                            i7 = i29;
                                                            i8 = i6;
                                                            i9 = i31;
                                                        }
                                                    } else {
                                                        strArr = strArr;
                                                    }
                                                    i9 = i34;
                                                    i8 = i6;
                                                    i7 = i10;
                                                } catch (Exception e6) {
                                                    e = e6;
                                                    i31 = i34;
                                                    i6 = i3;
                                                    FileLog.e(e);
                                                    i7 = i29;
                                                    i8 = i6;
                                                    i9 = i31;
                                                    drawableMutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_back).mutate();
                                                    int i39 = i5;
                                                    setDrawableColor(drawableMutate, i39);
                                                    i11 = i8;
                                                    drawableMutate2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                                    setDrawableColor(drawableMutate2, i39);
                                                    drawableMutate3 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                                    setDrawableColor(drawableMutate3, previewColor4);
                                                    drawableMutate4 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                                    setDrawableColor(drawableMutate4, previewColor4);
                                                    messageDrawableArr = new MessageDrawable[2];
                                                    i13 = 0;
                                                    while (i13 < i12) {
                                                        Drawable drawable5 = drawableMutate4;
                                                        if (i13 == 1) {
                                                            z2 = true;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        int i310 = i9;
                                                        int i311 = i7;
                                                        MessageDrawable messageDrawable2 = new MessageDrawable(2, z2, false) {
                                                            @Override
                                                            protected int getColor(int i312) {
                                                                int iIndexOfKey = themeFileValues.indexOfKey(i312);
                                                                if (iIndexOfKey <= 0) {
                                                                    return Theme.defaultColors[i312];
                                                                }
                                                                return themeFileValues.valueAt(iIndexOfKey);
                                                            }

                                                            @Override
                                                            protected int getCurrentColor(int i312) {
                                                                return themeFileValues.get(i312);
                                                            }
                                                        };
                                                        messageDrawableArr[i13] = messageDrawable2;
                                                        if (i13 == 0) {
                                                            i26 = previewColor5;
                                                        } else {
                                                            i26 = previewColor6;
                                                        }
                                                        setDrawableColor(messageDrawable2, i26);
                                                        i13++;
                                                        drawableMutate4 = drawable5;
                                                        i9 = i310;
                                                        i7 = i311;
                                                    }
                                                    drawable = drawableMutate4;
                                                    i14 = i9;
                                                    i15 = i7;
                                                    RectF rectF2 = new RectF();
                                                    i16 = 80;
                                                    if (str2 != null) {
                                                        BitmapFactory.Options options3 = new BitmapFactory.Options();
                                                        options3.inJustDecodeBounds = true;
                                                        BitmapFactory.decodeFile(str2, options3);
                                                        i17 = options3.outWidth;
                                                        if (i17 <= 0) {
                                                        }
                                                        drawable2 = drawableMutate2;
                                                        drawable3 = drawable;
                                                        i20 = 80;
                                                        z = false;
                                                    } else {
                                                        i21 = i4;
                                                        if (i14 != 0) {
                                                            if (i15 == 0) {
                                                                drawableCreateDitheredGradientBitmapDrawable = new ColorDrawable(i14);
                                                            } else if (i11 != 0) {
                                                                drawableCreateDitheredGradientBitmapDrawable = new MotionBackgroundDrawable(i14, i15, i11, i21, true);
                                                            } else {
                                                                i25 = themeFileValues.get(key_chat_wallpaper_gradient_rotation, -1);
                                                                if (i25 == -1) {
                                                                    i25 = 45;
                                                                }
                                                                drawableCreateDitheredGradientBitmapDrawable = BackgroundGradientDrawable.createDitheredGradientBitmapDrawable(i25, new int[]{i14, i30}, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                                                                i16 = 90;
                                                            }
                                                            drawableCreateDitheredGradientBitmapDrawable.setBounds(0, 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                                                            drawableCreateDitheredGradientBitmapDrawable.draw(canvas);
                                                            i20 = i16;
                                                            drawable2 = drawableMutate2;
                                                            drawable3 = drawable;
                                                            z = true;
                                                        } else {
                                                            drawable2 = drawableMutate2;
                                                            drawable3 = drawable;
                                                            if (i27 < 0) {
                                                                options = new BitmapFactory.Options();
                                                                options.inJustDecodeBounds = true;
                                                                if (!TextUtils.isEmpty(strArr[0])) {
                                                                    f = 2.0f;
                                                                    file = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(strArr[0]) + ".wp");
                                                                    BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                                                                    fileInputStream = null;
                                                                } else {
                                                                    f = 2.0f;
                                                                    fileInputStream = new FileInputStream(str);
                                                                    fileInputStream.getChannel().position(i27);
                                                                    BitmapFactory.decodeStream(fileInputStream, null, options);
                                                                    file = null;
                                                                }
                                                                i22 = options.outWidth;
                                                                if (i22 > 0) {
                                                                    z = false;
                                                                } else {
                                                                    z = false;
                                                                }
                                                                if (fileInputStream != null) {
                                                                    fileInputStream.close();
                                                                }
                                                                i20 = 80;
                                                            } else {
                                                                options = new BitmapFactory.Options();
                                                                options.inJustDecodeBounds = true;
                                                                if (!TextUtils.isEmpty(strArr[0])) {
                                                                    f = 2.0f;
                                                                    file = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(strArr[0]) + ".wp");
                                                                    BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                                                                    fileInputStream = null;
                                                                } else {
                                                                    f = 2.0f;
                                                                    fileInputStream = new FileInputStream(str);
                                                                    fileInputStream.getChannel().position(i27);
                                                                    BitmapFactory.decodeStream(fileInputStream, null, options);
                                                                    file = null;
                                                                }
                                                                i22 = options.outWidth;
                                                                if (i22 > 0) {
                                                                    z = false;
                                                                } else {
                                                                    z = false;
                                                                }
                                                                if (fileInputStream != null) {
                                                                    fileInputStream.close();
                                                                }
                                                                i20 = 80;
                                                            }
                                                        }
                                                    }
                                                    if (!z) {
                                                        Drawable drawableCreateDefaultWallpaper3 = createDefaultWallpaper(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                                                        drawableCreateDefaultWallpaper3.setBounds(0, 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                                                        drawableCreateDefaultWallpaper3.draw(canvas);
                                                    }
                                                    paint.setColor(previewColor);
                                                    canvas.drawRect(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), 120.0f, paint);
                                                    if (drawableMutate != null) {
                                                        int intrinsicHeight5 = (120 - drawableMutate.getIntrinsicHeight()) / 2;
                                                        drawableMutate.setBounds(13, intrinsicHeight5, drawableMutate.getIntrinsicWidth() + 13, drawableMutate.getIntrinsicHeight() + intrinsicHeight5);
                                                        drawableMutate.draw(canvas);
                                                    }
                                                    if (drawable2 != null) {
                                                        int width5 = (bitmapCreateBitmap.getWidth() - drawable2.getIntrinsicWidth()) - 10;
                                                        int intrinsicHeight6 = (120 - drawable2.getIntrinsicHeight()) / 2;
                                                        drawable2.setBounds(width5, intrinsicHeight6, drawable2.getIntrinsicWidth() + width5, drawable2.getIntrinsicHeight() + intrinsicHeight6);
                                                        drawable2.draw(canvas);
                                                    }
                                                    messageDrawableArr[1].setBounds(161, 216, bitmapCreateBitmap.getWidth() - 20, 308);
                                                    messageDrawableArr[1].setTop(0, 560, 522, false, false);
                                                    messageDrawableArr[1].draw(canvas);
                                                    messageDrawableArr[1].setBounds(161, 430, bitmapCreateBitmap.getWidth() - 20, 522);
                                                    messageDrawableArr[1].setTop(430, 560, 522, false, false);
                                                    messageDrawableArr[1].draw(canvas);
                                                    messageDrawableArr[0].setBounds(20, 323, 399, 415);
                                                    messageDrawableArr[0].setTop(323, 560, 522, false, false);
                                                    messageDrawableArr[0].draw(canvas);
                                                    paint.setColor(previewColor3);
                                                    canvas.drawRect(0.0f, bitmapCreateBitmap.getHeight() - 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), paint);
                                                    if (drawableMutate3 != null) {
                                                        int height5 = (bitmapCreateBitmap.getHeight() - 120) + ((120 - drawableMutate3.getIntrinsicHeight()) / 2);
                                                        drawableMutate3.setBounds(22, height5, drawableMutate3.getIntrinsicWidth() + 22, drawableMutate3.getIntrinsicHeight() + height5);
                                                        drawableMutate3.draw(canvas);
                                                    }
                                                    if (drawable3 != null) {
                                                        int width6 = (bitmapCreateBitmap.getWidth() - drawable3.getIntrinsicWidth()) - 22;
                                                        int height6 = (bitmapCreateBitmap.getHeight() - 120) + ((120 - drawable3.getIntrinsicHeight()) / 2);
                                                        drawable3.setBounds(width6, height6, drawable3.getIntrinsicWidth() + width6, drawable3.getIntrinsicHeight() + height6);
                                                        drawable3.draw(canvas);
                                                    }
                                                    canvas.setBitmap(null);
                                                    File file4 = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
                                                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, i20, new FileOutputStream(file4));
                                                    SharedConfig.saveConfig();
                                                    return file4.getAbsolutePath();
                                                }
                                            } catch (Exception e7) {
                                                e = e7;
                                            }
                                        }
                                    } catch (Exception e8) {
                                        e = e8;
                                        i5 = previewColor2;
                                    }
                                }
                                drawableMutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_back).mutate();
                                int i312 = i5;
                                setDrawableColor(drawableMutate, i312);
                                i11 = i8;
                                drawableMutate2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                setDrawableColor(drawableMutate2, i312);
                                drawableMutate3 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                setDrawableColor(drawableMutate3, previewColor4);
                                drawableMutate4 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                setDrawableColor(drawableMutate4, previewColor4);
                                messageDrawableArr = new MessageDrawable[2];
                                i13 = 0;
                                while (i13 < i12) {
                                    Drawable drawable6 = drawableMutate4;
                                    if (i13 == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    int i313 = i9;
                                    int i314 = i7;
                                    MessageDrawable messageDrawable3 = new MessageDrawable(2, z2, false) {
                                        @Override
                                        protected int getColor(int i315) {
                                            int iIndexOfKey = themeFileValues.indexOfKey(i315);
                                            if (iIndexOfKey <= 0) {
                                                return Theme.defaultColors[i315];
                                            }
                                            return themeFileValues.valueAt(iIndexOfKey);
                                        }

                                        @Override
                                        protected int getCurrentColor(int i315) {
                                            return themeFileValues.get(i315);
                                        }
                                    };
                                    messageDrawableArr[i13] = messageDrawable3;
                                    if (i13 == 0) {
                                        i26 = previewColor5;
                                    } else {
                                        i26 = previewColor6;
                                    }
                                    setDrawableColor(messageDrawable3, i26);
                                    i13++;
                                    drawableMutate4 = drawable6;
                                    i9 = i313;
                                    i7 = i314;
                                }
                                drawable = drawableMutate4;
                                i14 = i9;
                                i15 = i7;
                                RectF rectF3 = new RectF();
                                i16 = 80;
                                if (str2 != null) {
                                    BitmapFactory.Options options4 = new BitmapFactory.Options();
                                    options4.inJustDecodeBounds = true;
                                    BitmapFactory.decodeFile(str2, options4);
                                    i17 = options4.outWidth;
                                    if (i17 <= 0 && (i18 = options4.outHeight) > 0) {
                                        float fMin = Math.min(i17 / 560.0f, i18 / 560.0f);
                                        options4.inSampleSize = 1;
                                        if (fMin > 1.0f) {
                                            do {
                                                i19 = options4.inSampleSize * 2;
                                                try {
                                                    options4.inSampleSize = i19;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    FileLog.e(th);
                                                    drawable2 = drawableMutate2;
                                                    drawable3 = drawable;
                                                    i20 = 80;
                                                    z = false;
                                                    if (!z) {
                                                        Drawable drawableCreateDefaultWallpaper4 = createDefaultWallpaper(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                                                        drawableCreateDefaultWallpaper4.setBounds(0, 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                                                        drawableCreateDefaultWallpaper4.draw(canvas);
                                                    }
                                                    paint.setColor(previewColor);
                                                    canvas.drawRect(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), 120.0f, paint);
                                                    if (drawableMutate != null) {
                                                        int intrinsicHeight7 = (120 - drawableMutate.getIntrinsicHeight()) / 2;
                                                        drawableMutate.setBounds(13, intrinsicHeight7, drawableMutate.getIntrinsicWidth() + 13, drawableMutate.getIntrinsicHeight() + intrinsicHeight7);
                                                        drawableMutate.draw(canvas);
                                                    }
                                                    if (drawable2 != null) {
                                                        int width7 = (bitmapCreateBitmap.getWidth() - drawable2.getIntrinsicWidth()) - 10;
                                                        int intrinsicHeight8 = (120 - drawable2.getIntrinsicHeight()) / 2;
                                                        drawable2.setBounds(width7, intrinsicHeight8, drawable2.getIntrinsicWidth() + width7, drawable2.getIntrinsicHeight() + intrinsicHeight8);
                                                        drawable2.draw(canvas);
                                                    }
                                                    messageDrawableArr[1].setBounds(161, 216, bitmapCreateBitmap.getWidth() - 20, 308);
                                                    messageDrawableArr[1].setTop(0, 560, 522, false, false);
                                                    messageDrawableArr[1].draw(canvas);
                                                    messageDrawableArr[1].setBounds(161, 430, bitmapCreateBitmap.getWidth() - 20, 522);
                                                    messageDrawableArr[1].setTop(430, 560, 522, false, false);
                                                    messageDrawableArr[1].draw(canvas);
                                                    messageDrawableArr[0].setBounds(20, 323, 399, 415);
                                                    messageDrawableArr[0].setTop(323, 560, 522, false, false);
                                                    messageDrawableArr[0].draw(canvas);
                                                    paint.setColor(previewColor3);
                                                    canvas.drawRect(0.0f, bitmapCreateBitmap.getHeight() - 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), paint);
                                                    if (drawableMutate3 != null) {
                                                        int height7 = (bitmapCreateBitmap.getHeight() - 120) + ((120 - drawableMutate3.getIntrinsicHeight()) / 2);
                                                        drawableMutate3.setBounds(22, height7, drawableMutate3.getIntrinsicWidth() + 22, drawableMutate3.getIntrinsicHeight() + height7);
                                                        drawableMutate3.draw(canvas);
                                                    }
                                                    if (drawable3 != null) {
                                                        int width8 = (bitmapCreateBitmap.getWidth() - drawable3.getIntrinsicWidth()) - 22;
                                                        int height8 = (bitmapCreateBitmap.getHeight() - 120) + ((120 - drawable3.getIntrinsicHeight()) / 2);
                                                        drawable3.setBounds(width8, height8, drawable3.getIntrinsicWidth() + width8, drawable3.getIntrinsicHeight() + height8);
                                                        drawable3.draw(canvas);
                                                    }
                                                    canvas.setBitmap(null);
                                                    File file5 = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
                                                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, i20, new FileOutputStream(file5));
                                                    SharedConfig.saveConfig();
                                                    return file5.getAbsolutePath();
                                                }
                                            } while (i19 < fMin);
                                        }
                                        Bitmap.Config config = Bitmap.Config.ALPHA_8;
                                        options4.inPreferredConfig = config;
                                        options4.inJustDecodeBounds = false;
                                        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str2, options4);
                                        if (bitmapDecodeFile != null) {
                                            if (i11 != 0 && themeAccent != null) {
                                                MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable(i14, i15, i11, i4, true);
                                                if (bitmapCreateBitmap != null && bitmapCreateBitmap.getConfig() != config) {
                                                    Bitmap bitmapCopy = bitmapCreateBitmap.copy(config, false);
                                                    try {
                                                        bitmapCreateBitmap.recycle();
                                                        bitmapCreateBitmap = bitmapCopy;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        bitmapCreateBitmap = bitmapCopy;
                                                        FileLog.e(th);
                                                        drawable2 = drawableMutate2;
                                                        drawable3 = drawable;
                                                        i20 = 80;
                                                        z = false;
                                                    }
                                                }
                                                motionBackgroundDrawable.setPatternBitmap((int) (themeAccent.patternIntensity * 100.0f), bitmapDecodeFile);
                                                motionBackgroundDrawable.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                                                motionBackgroundDrawable.draw(canvas);
                                            } else {
                                                Paint paint2 = new Paint();
                                                paint2.setFilterBitmap(true);
                                                float fMin2 = Math.min(bitmapDecodeFile.getWidth() / 560.0f, bitmapDecodeFile.getHeight() / 560.0f);
                                                rectF3.set(0.0f, 0.0f, bitmapDecodeFile.getWidth() / fMin2, bitmapDecodeFile.getHeight() / fMin2);
                                                rectF3.offset((bitmapCreateBitmap.getWidth() - rectF3.width()) / 2.0f, (bitmapCreateBitmap.getHeight() - rectF3.height()) / 2.0f);
                                                canvas.drawBitmap(bitmapDecodeFile, (Rect) null, rectF3, paint2);
                                            }
                                            i20 = i16;
                                            drawable2 = drawableMutate2;
                                            drawable3 = drawable;
                                            z = true;
                                        }
                                    }
                                    drawable2 = drawableMutate2;
                                    drawable3 = drawable;
                                    i20 = 80;
                                    z = false;
                                } else {
                                    i21 = i4;
                                    if (i14 != 0) {
                                        if (i15 == 0) {
                                            drawableCreateDitheredGradientBitmapDrawable = new ColorDrawable(i14);
                                        } else if (i11 != 0) {
                                            drawableCreateDitheredGradientBitmapDrawable = new MotionBackgroundDrawable(i14, i15, i11, i21, true);
                                        } else {
                                            i25 = themeFileValues.get(key_chat_wallpaper_gradient_rotation, -1);
                                            if (i25 == -1) {
                                                i25 = 45;
                                            }
                                            drawableCreateDitheredGradientBitmapDrawable = BackgroundGradientDrawable.createDitheredGradientBitmapDrawable(i25, new int[]{i14, i30}, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                                            i16 = 90;
                                        }
                                        drawableCreateDitheredGradientBitmapDrawable.setBounds(0, 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                                        drawableCreateDitheredGradientBitmapDrawable.draw(canvas);
                                        i20 = i16;
                                        drawable2 = drawableMutate2;
                                        drawable3 = drawable;
                                        z = true;
                                    } else {
                                        drawable2 = drawableMutate2;
                                        drawable3 = drawable;
                                        if (i27 < 0 || !TextUtils.isEmpty(strArr[0])) {
                                            options = new BitmapFactory.Options();
                                            options.inJustDecodeBounds = true;
                                            if (!TextUtils.isEmpty(strArr[0])) {
                                                f = 2.0f;
                                                file = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(strArr[0]) + ".wp");
                                                BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                                                fileInputStream = null;
                                            } else {
                                                f = 2.0f;
                                                fileInputStream = new FileInputStream(str);
                                                fileInputStream.getChannel().position(i27);
                                                BitmapFactory.decodeStream(fileInputStream, null, options);
                                                file = null;
                                            }
                                            i22 = options.outWidth;
                                            if (i22 > 0 || (i23 = options.outHeight) <= 0) {
                                                z = false;
                                            } else {
                                                float fMin3 = Math.min(i22 / 560.0f, i23 / 560.0f);
                                                options.inSampleSize = 1;
                                                if (fMin3 > 1.0f) {
                                                    do {
                                                        i24 = options.inSampleSize * 2;
                                                        options.inSampleSize = i24;
                                                    } while (i24 < fMin3);
                                                }
                                                options.inJustDecodeBounds = false;
                                                if (file != null) {
                                                    bitmapDecodeStream = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                                                } else {
                                                    fileInputStream.getChannel().position(i27);
                                                    bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                                                }
                                                if (bitmapDecodeStream != null) {
                                                    Paint paint3 = new Paint();
                                                    paint3.setFilterBitmap(true);
                                                    float fMin4 = Math.min(bitmapDecodeStream.getWidth() / 560.0f, bitmapDecodeStream.getHeight() / 560.0f);
                                                    rectF3.set(0.0f, 0.0f, bitmapDecodeStream.getWidth() / fMin4, bitmapDecodeStream.getHeight() / fMin4);
                                                    rectF3.offset((bitmapCreateBitmap.getWidth() - rectF3.width()) / f, (bitmapCreateBitmap.getHeight() - rectF3.height()) / f);
                                                    canvas.drawBitmap(bitmapDecodeStream, (Rect) null, rectF3, paint3);
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                            }
                                            if (fileInputStream != null) {
                                                fileInputStream.close();
                                            }
                                            i20 = 80;
                                        } else {
                                            i20 = 80;
                                            z = false;
                                        }
                                    }
                                }
                                if (!z) {
                                    Drawable drawableCreateDefaultWallpaper5 = createDefaultWallpaper(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                                    drawableCreateDefaultWallpaper5.setBounds(0, 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                                    drawableCreateDefaultWallpaper5.draw(canvas);
                                }
                                paint.setColor(previewColor);
                                canvas.drawRect(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), 120.0f, paint);
                                if (drawableMutate != null) {
                                    int intrinsicHeight9 = (120 - drawableMutate.getIntrinsicHeight()) / 2;
                                    drawableMutate.setBounds(13, intrinsicHeight9, drawableMutate.getIntrinsicWidth() + 13, drawableMutate.getIntrinsicHeight() + intrinsicHeight9);
                                    drawableMutate.draw(canvas);
                                }
                                if (drawable2 != null) {
                                    int width9 = (bitmapCreateBitmap.getWidth() - drawable2.getIntrinsicWidth()) - 10;
                                    int intrinsicHeight10 = (120 - drawable2.getIntrinsicHeight()) / 2;
                                    drawable2.setBounds(width9, intrinsicHeight10, drawable2.getIntrinsicWidth() + width9, drawable2.getIntrinsicHeight() + intrinsicHeight10);
                                    drawable2.draw(canvas);
                                }
                                messageDrawableArr[1].setBounds(161, 216, bitmapCreateBitmap.getWidth() - 20, 308);
                                messageDrawableArr[1].setTop(0, 560, 522, false, false);
                                messageDrawableArr[1].draw(canvas);
                                messageDrawableArr[1].setBounds(161, 430, bitmapCreateBitmap.getWidth() - 20, 522);
                                messageDrawableArr[1].setTop(430, 560, 522, false, false);
                                messageDrawableArr[1].draw(canvas);
                                messageDrawableArr[0].setBounds(20, 323, 399, 415);
                                messageDrawableArr[0].setTop(323, 560, 522, false, false);
                                messageDrawableArr[0].draw(canvas);
                                paint.setColor(previewColor3);
                                canvas.drawRect(0.0f, bitmapCreateBitmap.getHeight() - 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), paint);
                                if (drawableMutate3 != null) {
                                    int height9 = (bitmapCreateBitmap.getHeight() - 120) + ((120 - drawableMutate3.getIntrinsicHeight()) / 2);
                                    drawableMutate3.setBounds(22, height9, drawableMutate3.getIntrinsicWidth() + 22, drawableMutate3.getIntrinsicHeight() + height9);
                                    drawableMutate3.draw(canvas);
                                }
                                if (drawable3 != null) {
                                    int width10 = (bitmapCreateBitmap.getWidth() - drawable3.getIntrinsicWidth()) - 22;
                                    int height10 = (bitmapCreateBitmap.getHeight() - 120) + ((120 - drawable3.getIntrinsicHeight()) / 2);
                                    drawable3.setBounds(width10, height10, drawable3.getIntrinsicWidth() + width10, drawable3.getIntrinsicHeight() + height10);
                                    drawable3.draw(canvas);
                                }
                                canvas.setBitmap(null);
                                File file6 = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
                                bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, i20, new FileOutputStream(file6));
                                SharedConfig.saveConfig();
                                return file6.getAbsolutePath();
                            }
                            if (i4 == 0) {
                                i4 = i32;
                            }
                            if (TextUtils.isEmpty(strArr[0])) {
                                String queryParameter2 = Uri.parse(strArr[0]).getQueryParameter("bg_color");
                                if (themeAccent != null) {
                                    strArr = strArr;
                                    i5 = previewColor2;
                                    i30 = i30;
                                    i7 = i29;
                                    i9 = i31;
                                    i8 = i3;
                                } else {
                                    strArr = strArr;
                                    i5 = previewColor2;
                                    i30 = i30;
                                    i7 = i29;
                                    i9 = i31;
                                    i8 = i3;
                                }
                            } else {
                                strArr = strArr;
                                i5 = previewColor2;
                                i30 = i30;
                                i7 = i29;
                                i9 = i31;
                                i8 = i3;
                            }
                            drawableMutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_back).mutate();
                            int i315 = i5;
                            setDrawableColor(drawableMutate, i315);
                            i11 = i8;
                            drawableMutate2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_dots).mutate();
                            setDrawableColor(drawableMutate2, i315);
                            drawableMutate3 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_smile).mutate();
                            setDrawableColor(drawableMutate3, previewColor4);
                            drawableMutate4 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_mic).mutate();
                            setDrawableColor(drawableMutate4, previewColor4);
                            messageDrawableArr = new MessageDrawable[2];
                            i13 = 0;
                            while (i13 < i12) {
                                Drawable drawable7 = drawableMutate4;
                                if (i13 == 1) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                int i316 = i9;
                                int i317 = i7;
                                MessageDrawable messageDrawable4 = new MessageDrawable(2, z2, false) {
                                    @Override
                                    protected int getColor(int i318) {
                                        int iIndexOfKey = themeFileValues.indexOfKey(i318);
                                        if (iIndexOfKey <= 0) {
                                            return Theme.defaultColors[i318];
                                        }
                                        return themeFileValues.valueAt(iIndexOfKey);
                                    }

                                    @Override
                                    protected int getCurrentColor(int i318) {
                                        return themeFileValues.get(i318);
                                    }
                                };
                                messageDrawableArr[i13] = messageDrawable4;
                                if (i13 == 0) {
                                    i26 = previewColor5;
                                } else {
                                    i26 = previewColor6;
                                }
                                setDrawableColor(messageDrawable4, i26);
                                i13++;
                                drawableMutate4 = drawable7;
                                i9 = i316;
                                i7 = i317;
                            }
                            drawable = drawableMutate4;
                            i14 = i9;
                            i15 = i7;
                            RectF rectF4 = new RectF();
                            i16 = 80;
                            if (str2 != null) {
                                BitmapFactory.Options options5 = new BitmapFactory.Options();
                                options5.inJustDecodeBounds = true;
                                BitmapFactory.decodeFile(str2, options5);
                                i17 = options5.outWidth;
                                if (i17 <= 0) {
                                }
                                drawable2 = drawableMutate2;
                                drawable3 = drawable;
                                i20 = 80;
                                z = false;
                            } else {
                                i21 = i4;
                                if (i14 != 0) {
                                    if (i15 == 0) {
                                        drawableCreateDitheredGradientBitmapDrawable = new ColorDrawable(i14);
                                    } else if (i11 != 0) {
                                        drawableCreateDitheredGradientBitmapDrawable = new MotionBackgroundDrawable(i14, i15, i11, i21, true);
                                    } else {
                                        i25 = themeFileValues.get(key_chat_wallpaper_gradient_rotation, -1);
                                        if (i25 == -1) {
                                            i25 = 45;
                                        }
                                        drawableCreateDitheredGradientBitmapDrawable = BackgroundGradientDrawable.createDitheredGradientBitmapDrawable(i25, new int[]{i14, i30}, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                                        i16 = 90;
                                    }
                                    drawableCreateDitheredGradientBitmapDrawable.setBounds(0, 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                                    drawableCreateDitheredGradientBitmapDrawable.draw(canvas);
                                    i20 = i16;
                                    drawable2 = drawableMutate2;
                                    drawable3 = drawable;
                                    z = true;
                                } else {
                                    drawable2 = drawableMutate2;
                                    drawable3 = drawable;
                                    if (i27 < 0) {
                                        options = new BitmapFactory.Options();
                                        options.inJustDecodeBounds = true;
                                        if (!TextUtils.isEmpty(strArr[0])) {
                                            f = 2.0f;
                                            file = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(strArr[0]) + ".wp");
                                            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                                            fileInputStream = null;
                                        } else {
                                            f = 2.0f;
                                            fileInputStream = new FileInputStream(str);
                                            fileInputStream.getChannel().position(i27);
                                            BitmapFactory.decodeStream(fileInputStream, null, options);
                                            file = null;
                                        }
                                        i22 = options.outWidth;
                                        if (i22 > 0) {
                                            z = false;
                                        } else {
                                            z = false;
                                        }
                                        if (fileInputStream != null) {
                                            fileInputStream.close();
                                        }
                                        i20 = 80;
                                    } else {
                                        options = new BitmapFactory.Options();
                                        options.inJustDecodeBounds = true;
                                        if (!TextUtils.isEmpty(strArr[0])) {
                                            f = 2.0f;
                                            file = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(strArr[0]) + ".wp");
                                            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                                            fileInputStream = null;
                                        } else {
                                            f = 2.0f;
                                            fileInputStream = new FileInputStream(str);
                                            fileInputStream.getChannel().position(i27);
                                            BitmapFactory.decodeStream(fileInputStream, null, options);
                                            file = null;
                                        }
                                        i22 = options.outWidth;
                                        if (i22 > 0) {
                                            z = false;
                                        } else {
                                            z = false;
                                        }
                                        if (fileInputStream != null) {
                                            fileInputStream.close();
                                        }
                                        i20 = 80;
                                    }
                                }
                            }
                            if (!z) {
                                Drawable drawableCreateDefaultWallpaper6 = createDefaultWallpaper(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                                drawableCreateDefaultWallpaper6.setBounds(0, 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                                drawableCreateDefaultWallpaper6.draw(canvas);
                            }
                            paint.setColor(previewColor);
                            canvas.drawRect(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), 120.0f, paint);
                            if (drawableMutate != null) {
                                int intrinsicHeight11 = (120 - drawableMutate.getIntrinsicHeight()) / 2;
                                drawableMutate.setBounds(13, intrinsicHeight11, drawableMutate.getIntrinsicWidth() + 13, drawableMutate.getIntrinsicHeight() + intrinsicHeight11);
                                drawableMutate.draw(canvas);
                            }
                            if (drawable2 != null) {
                                int width11 = (bitmapCreateBitmap.getWidth() - drawable2.getIntrinsicWidth()) - 10;
                                int intrinsicHeight12 = (120 - drawable2.getIntrinsicHeight()) / 2;
                                drawable2.setBounds(width11, intrinsicHeight12, drawable2.getIntrinsicWidth() + width11, drawable2.getIntrinsicHeight() + intrinsicHeight12);
                                drawable2.draw(canvas);
                            }
                            messageDrawableArr[1].setBounds(161, 216, bitmapCreateBitmap.getWidth() - 20, 308);
                            messageDrawableArr[1].setTop(0, 560, 522, false, false);
                            messageDrawableArr[1].draw(canvas);
                            messageDrawableArr[1].setBounds(161, 430, bitmapCreateBitmap.getWidth() - 20, 522);
                            messageDrawableArr[1].setTop(430, 560, 522, false, false);
                            messageDrawableArr[1].draw(canvas);
                            messageDrawableArr[0].setBounds(20, 323, 399, 415);
                            messageDrawableArr[0].setTop(323, 560, 522, false, false);
                            messageDrawableArr[0].draw(canvas);
                            paint.setColor(previewColor3);
                            canvas.drawRect(0.0f, bitmapCreateBitmap.getHeight() - 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), paint);
                            if (drawableMutate3 != null) {
                                int height11 = (bitmapCreateBitmap.getHeight() - 120) + ((120 - drawableMutate3.getIntrinsicHeight()) / 2);
                                drawableMutate3.setBounds(22, height11, drawableMutate3.getIntrinsicWidth() + 22, drawableMutate3.getIntrinsicHeight() + height11);
                                drawableMutate3.draw(canvas);
                            }
                            if (drawable3 != null) {
                                int width12 = (bitmapCreateBitmap.getWidth() - drawable3.getIntrinsicWidth()) - 22;
                                int height12 = (bitmapCreateBitmap.getHeight() - 120) + ((120 - drawable3.getIntrinsicHeight()) / 2);
                                drawable3.setBounds(width12, height12, drawable3.getIntrinsicWidth() + width12, drawable3.getIntrinsicHeight() + height12);
                                drawable3.draw(canvas);
                            }
                            canvas.setBitmap(null);
                            File file7 = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, i20, new FileOutputStream(file7));
                            SharedConfig.saveConfig();
                            return file7.getAbsolutePath();
                        }
                        if (i2 == 0) {
                            i3 = i30;
                        }
                        if (themeAccent != null) {
                            i3 = i2;
                            i4 = (int) themeAccent.backgroundGradientOverrideColor3;
                        } else {
                            i3 = i2;
                            i4 = 0;
                        }
                        if (i4 != 0) {
                            if (i4 == 0) {
                                i4 = i32;
                            }
                        } else if (i4 == 0) {
                            i4 = i32;
                        }
                        if (TextUtils.isEmpty(strArr[0])) {
                            String queryParameter3 = Uri.parse(strArr[0]).getQueryParameter("bg_color");
                            if (themeAccent != null) {
                                strArr = strArr;
                                i5 = previewColor2;
                                i30 = i30;
                                i7 = i29;
                                i9 = i31;
                                i8 = i3;
                            } else {
                                strArr = strArr;
                                i5 = previewColor2;
                                i30 = i30;
                                i7 = i29;
                                i9 = i31;
                                i8 = i3;
                            }
                        } else {
                            strArr = strArr;
                            i5 = previewColor2;
                            i30 = i30;
                            i7 = i29;
                            i9 = i31;
                            i8 = i3;
                        }
                        drawableMutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_back).mutate();
                        int i318 = i5;
                        setDrawableColor(drawableMutate, i318);
                        i11 = i8;
                        drawableMutate2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_dots).mutate();
                        setDrawableColor(drawableMutate2, i318);
                        drawableMutate3 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_smile).mutate();
                        setDrawableColor(drawableMutate3, previewColor4);
                        drawableMutate4 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_mic).mutate();
                        setDrawableColor(drawableMutate4, previewColor4);
                        messageDrawableArr = new MessageDrawable[2];
                        i13 = 0;
                        while (i13 < i12) {
                            Drawable drawable8 = drawableMutate4;
                            if (i13 == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            int i319 = i9;
                            int i3110 = i7;
                            MessageDrawable messageDrawable5 = new MessageDrawable(2, z2, false) {
                                @Override
                                protected int getColor(int i3111) {
                                    int iIndexOfKey = themeFileValues.indexOfKey(i3111);
                                    if (iIndexOfKey <= 0) {
                                        return Theme.defaultColors[i3111];
                                    }
                                    return themeFileValues.valueAt(iIndexOfKey);
                                }

                                @Override
                                protected int getCurrentColor(int i3111) {
                                    return themeFileValues.get(i3111);
                                }
                            };
                            messageDrawableArr[i13] = messageDrawable5;
                            if (i13 == 0) {
                                i26 = previewColor5;
                            } else {
                                i26 = previewColor6;
                            }
                            setDrawableColor(messageDrawable5, i26);
                            i13++;
                            drawableMutate4 = drawable8;
                            i9 = i319;
                            i7 = i3110;
                        }
                        drawable = drawableMutate4;
                        i14 = i9;
                        i15 = i7;
                        RectF rectF5 = new RectF();
                        i16 = 80;
                        if (str2 != null) {
                            BitmapFactory.Options options6 = new BitmapFactory.Options();
                            options6.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(str2, options6);
                            i17 = options6.outWidth;
                            if (i17 <= 0) {
                            }
                            drawable2 = drawableMutate2;
                            drawable3 = drawable;
                            i20 = 80;
                            z = false;
                        } else {
                            i21 = i4;
                            if (i14 != 0) {
                                if (i15 == 0) {
                                    drawableCreateDitheredGradientBitmapDrawable = new ColorDrawable(i14);
                                } else if (i11 != 0) {
                                    drawableCreateDitheredGradientBitmapDrawable = new MotionBackgroundDrawable(i14, i15, i11, i21, true);
                                } else {
                                    i25 = themeFileValues.get(key_chat_wallpaper_gradient_rotation, -1);
                                    if (i25 == -1) {
                                        i25 = 45;
                                    }
                                    drawableCreateDitheredGradientBitmapDrawable = BackgroundGradientDrawable.createDitheredGradientBitmapDrawable(i25, new int[]{i14, i30}, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                                    i16 = 90;
                                }
                                drawableCreateDitheredGradientBitmapDrawable.setBounds(0, 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                                drawableCreateDitheredGradientBitmapDrawable.draw(canvas);
                                i20 = i16;
                                drawable2 = drawableMutate2;
                                drawable3 = drawable;
                                z = true;
                            } else {
                                drawable2 = drawableMutate2;
                                drawable3 = drawable;
                                if (i27 < 0) {
                                    options = new BitmapFactory.Options();
                                    options.inJustDecodeBounds = true;
                                    if (!TextUtils.isEmpty(strArr[0])) {
                                        f = 2.0f;
                                        file = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(strArr[0]) + ".wp");
                                        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                                        fileInputStream = null;
                                    } else {
                                        f = 2.0f;
                                        fileInputStream = new FileInputStream(str);
                                        fileInputStream.getChannel().position(i27);
                                        BitmapFactory.decodeStream(fileInputStream, null, options);
                                        file = null;
                                    }
                                    i22 = options.outWidth;
                                    if (i22 > 0) {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                    i20 = 80;
                                } else {
                                    options = new BitmapFactory.Options();
                                    options.inJustDecodeBounds = true;
                                    if (!TextUtils.isEmpty(strArr[0])) {
                                        f = 2.0f;
                                        file = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(strArr[0]) + ".wp");
                                        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                                        fileInputStream = null;
                                    } else {
                                        f = 2.0f;
                                        fileInputStream = new FileInputStream(str);
                                        fileInputStream.getChannel().position(i27);
                                        BitmapFactory.decodeStream(fileInputStream, null, options);
                                        file = null;
                                    }
                                    i22 = options.outWidth;
                                    if (i22 > 0) {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                    i20 = 80;
                                }
                            }
                        }
                        if (!z) {
                            Drawable drawableCreateDefaultWallpaper7 = createDefaultWallpaper(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                            drawableCreateDefaultWallpaper7.setBounds(0, 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                            drawableCreateDefaultWallpaper7.draw(canvas);
                        }
                        paint.setColor(previewColor);
                        canvas.drawRect(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), 120.0f, paint);
                        if (drawableMutate != null) {
                            int intrinsicHeight13 = (120 - drawableMutate.getIntrinsicHeight()) / 2;
                            drawableMutate.setBounds(13, intrinsicHeight13, drawableMutate.getIntrinsicWidth() + 13, drawableMutate.getIntrinsicHeight() + intrinsicHeight13);
                            drawableMutate.draw(canvas);
                        }
                        if (drawable2 != null) {
                            int width13 = (bitmapCreateBitmap.getWidth() - drawable2.getIntrinsicWidth()) - 10;
                            int intrinsicHeight14 = (120 - drawable2.getIntrinsicHeight()) / 2;
                            drawable2.setBounds(width13, intrinsicHeight14, drawable2.getIntrinsicWidth() + width13, drawable2.getIntrinsicHeight() + intrinsicHeight14);
                            drawable2.draw(canvas);
                        }
                        messageDrawableArr[1].setBounds(161, 216, bitmapCreateBitmap.getWidth() - 20, 308);
                        messageDrawableArr[1].setTop(0, 560, 522, false, false);
                        messageDrawableArr[1].draw(canvas);
                        messageDrawableArr[1].setBounds(161, 430, bitmapCreateBitmap.getWidth() - 20, 522);
                        messageDrawableArr[1].setTop(430, 560, 522, false, false);
                        messageDrawableArr[1].draw(canvas);
                        messageDrawableArr[0].setBounds(20, 323, 399, 415);
                        messageDrawableArr[0].setTop(323, 560, 522, false, false);
                        messageDrawableArr[0].draw(canvas);
                        paint.setColor(previewColor3);
                        canvas.drawRect(0.0f, bitmapCreateBitmap.getHeight() - 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), paint);
                        if (drawableMutate3 != null) {
                            int height13 = (bitmapCreateBitmap.getHeight() - 120) + ((120 - drawableMutate3.getIntrinsicHeight()) / 2);
                            drawableMutate3.setBounds(22, height13, drawableMutate3.getIntrinsicWidth() + 22, drawableMutate3.getIntrinsicHeight() + height13);
                            drawableMutate3.draw(canvas);
                        }
                        if (drawable3 != null) {
                            int width14 = (bitmapCreateBitmap.getWidth() - drawable3.getIntrinsicWidth()) - 22;
                            int height14 = (bitmapCreateBitmap.getHeight() - 120) + ((120 - drawable3.getIntrinsicHeight()) / 2);
                            drawable3.setBounds(width14, height14, drawable3.getIntrinsicWidth() + width14, drawable3.getIntrinsicHeight() + height14);
                            drawable3.draw(canvas);
                        }
                        canvas.setBitmap(null);
                        File file8 = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, i20, new FileOutputStream(file8));
                        SharedConfig.saveConfig();
                        return file8.getAbsolutePath();
                    }
                    if (i != 0) {
                        i29 = i;
                    }
                    if (themeAccent != null) {
                        i2 = (int) themeAccent.backgroundGradientOverrideColor2;
                    } else {
                        i2 = 0;
                    }
                    if (i2 != 0) {
                        if (i2 == 0) {
                            i3 = i30;
                        }
                    } else if (i2 == 0) {
                        i3 = i30;
                    }
                    if (themeAccent != null) {
                        i3 = i2;
                        i4 = (int) themeAccent.backgroundGradientOverrideColor3;
                    } else {
                        i3 = i2;
                        i4 = 0;
                    }
                    if (i4 != 0) {
                        if (i4 == 0) {
                            i4 = i32;
                        }
                    } else if (i4 == 0) {
                        i4 = i32;
                    }
                    if (TextUtils.isEmpty(strArr[0])) {
                        String queryParameter4 = Uri.parse(strArr[0]).getQueryParameter("bg_color");
                        if (themeAccent != null) {
                            strArr = strArr;
                            i5 = previewColor2;
                            i30 = i30;
                            i7 = i29;
                            i9 = i31;
                            i8 = i3;
                        } else {
                            strArr = strArr;
                            i5 = previewColor2;
                            i30 = i30;
                            i7 = i29;
                            i9 = i31;
                            i8 = i3;
                        }
                    } else {
                        strArr = strArr;
                        i5 = previewColor2;
                        i30 = i30;
                        i7 = i29;
                        i9 = i31;
                        i8 = i3;
                    }
                    drawableMutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_back).mutate();
                    int i3111 = i5;
                    setDrawableColor(drawableMutate, i3111);
                    i11 = i8;
                    drawableMutate2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_dots).mutate();
                    setDrawableColor(drawableMutate2, i3111);
                    drawableMutate3 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_smile).mutate();
                    setDrawableColor(drawableMutate3, previewColor4);
                    drawableMutate4 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_mic).mutate();
                    setDrawableColor(drawableMutate4, previewColor4);
                    messageDrawableArr = new MessageDrawable[2];
                    i13 = 0;
                    while (i13 < i12) {
                        Drawable drawable9 = drawableMutate4;
                        if (i13 == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        int i3112 = i9;
                        int i3113 = i7;
                        MessageDrawable messageDrawable6 = new MessageDrawable(2, z2, false) {
                            @Override
                            protected int getColor(int i3114) {
                                int iIndexOfKey = themeFileValues.indexOfKey(i3114);
                                if (iIndexOfKey <= 0) {
                                    return Theme.defaultColors[i3114];
                                }
                                return themeFileValues.valueAt(iIndexOfKey);
                            }

                            @Override
                            protected int getCurrentColor(int i3114) {
                                return themeFileValues.get(i3114);
                            }
                        };
                        messageDrawableArr[i13] = messageDrawable6;
                        if (i13 == 0) {
                            i26 = previewColor5;
                        } else {
                            i26 = previewColor6;
                        }
                        setDrawableColor(messageDrawable6, i26);
                        i13++;
                        drawableMutate4 = drawable9;
                        i9 = i3112;
                        i7 = i3113;
                    }
                    drawable = drawableMutate4;
                    i14 = i9;
                    i15 = i7;
                    RectF rectF6 = new RectF();
                    i16 = 80;
                    if (str2 != null) {
                        BitmapFactory.Options options7 = new BitmapFactory.Options();
                        options7.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(str2, options7);
                        i17 = options7.outWidth;
                        if (i17 <= 0) {
                        }
                        drawable2 = drawableMutate2;
                        drawable3 = drawable;
                        i20 = 80;
                        z = false;
                    } else {
                        i21 = i4;
                        if (i14 != 0) {
                            if (i15 == 0) {
                                drawableCreateDitheredGradientBitmapDrawable = new ColorDrawable(i14);
                            } else if (i11 != 0) {
                                drawableCreateDitheredGradientBitmapDrawable = new MotionBackgroundDrawable(i14, i15, i11, i21, true);
                            } else {
                                i25 = themeFileValues.get(key_chat_wallpaper_gradient_rotation, -1);
                                if (i25 == -1) {
                                    i25 = 45;
                                }
                                drawableCreateDitheredGradientBitmapDrawable = BackgroundGradientDrawable.createDitheredGradientBitmapDrawable(i25, new int[]{i14, i30}, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                                i16 = 90;
                            }
                            drawableCreateDitheredGradientBitmapDrawable.setBounds(0, 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                            drawableCreateDitheredGradientBitmapDrawable.draw(canvas);
                            i20 = i16;
                            drawable2 = drawableMutate2;
                            drawable3 = drawable;
                            z = true;
                        } else {
                            drawable2 = drawableMutate2;
                            drawable3 = drawable;
                            if (i27 < 0) {
                                options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                if (!TextUtils.isEmpty(strArr[0])) {
                                    f = 2.0f;
                                    file = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(strArr[0]) + ".wp");
                                    BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                                    fileInputStream = null;
                                } else {
                                    f = 2.0f;
                                    fileInputStream = new FileInputStream(str);
                                    fileInputStream.getChannel().position(i27);
                                    BitmapFactory.decodeStream(fileInputStream, null, options);
                                    file = null;
                                }
                                i22 = options.outWidth;
                                if (i22 > 0) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                i20 = 80;
                            } else {
                                options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                if (!TextUtils.isEmpty(strArr[0])) {
                                    f = 2.0f;
                                    file = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(strArr[0]) + ".wp");
                                    BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                                    fileInputStream = null;
                                } else {
                                    f = 2.0f;
                                    fileInputStream = new FileInputStream(str);
                                    fileInputStream.getChannel().position(i27);
                                    BitmapFactory.decodeStream(fileInputStream, null, options);
                                    file = null;
                                }
                                i22 = options.outWidth;
                                if (i22 > 0) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                i20 = 80;
                            }
                        }
                    }
                    if (!z) {
                        Drawable drawableCreateDefaultWallpaper8 = createDefaultWallpaper(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                        drawableCreateDefaultWallpaper8.setBounds(0, 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                        drawableCreateDefaultWallpaper8.draw(canvas);
                    }
                    paint.setColor(previewColor);
                    canvas.drawRect(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), 120.0f, paint);
                    if (drawableMutate != null) {
                        int intrinsicHeight15 = (120 - drawableMutate.getIntrinsicHeight()) / 2;
                        drawableMutate.setBounds(13, intrinsicHeight15, drawableMutate.getIntrinsicWidth() + 13, drawableMutate.getIntrinsicHeight() + intrinsicHeight15);
                        drawableMutate.draw(canvas);
                    }
                    if (drawable2 != null) {
                        int width15 = (bitmapCreateBitmap.getWidth() - drawable2.getIntrinsicWidth()) - 10;
                        int intrinsicHeight16 = (120 - drawable2.getIntrinsicHeight()) / 2;
                        drawable2.setBounds(width15, intrinsicHeight16, drawable2.getIntrinsicWidth() + width15, drawable2.getIntrinsicHeight() + intrinsicHeight16);
                        drawable2.draw(canvas);
                    }
                    messageDrawableArr[1].setBounds(161, 216, bitmapCreateBitmap.getWidth() - 20, 308);
                    messageDrawableArr[1].setTop(0, 560, 522, false, false);
                    messageDrawableArr[1].draw(canvas);
                    messageDrawableArr[1].setBounds(161, 430, bitmapCreateBitmap.getWidth() - 20, 522);
                    messageDrawableArr[1].setTop(430, 560, 522, false, false);
                    messageDrawableArr[1].draw(canvas);
                    messageDrawableArr[0].setBounds(20, 323, 399, 415);
                    messageDrawableArr[0].setTop(323, 560, 522, false, false);
                    messageDrawableArr[0].draw(canvas);
                    paint.setColor(previewColor3);
                    canvas.drawRect(0.0f, bitmapCreateBitmap.getHeight() - 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), paint);
                    if (drawableMutate3 != null) {
                        int height15 = (bitmapCreateBitmap.getHeight() - 120) + ((120 - drawableMutate3.getIntrinsicHeight()) / 2);
                        drawableMutate3.setBounds(22, height15, drawableMutate3.getIntrinsicWidth() + 22, drawableMutate3.getIntrinsicHeight() + height15);
                        drawableMutate3.draw(canvas);
                    }
                    if (drawable3 != null) {
                        int width16 = (bitmapCreateBitmap.getWidth() - drawable3.getIntrinsicWidth()) - 22;
                        int height16 = (bitmapCreateBitmap.getHeight() - 120) + ((120 - drawable3.getIntrinsicHeight()) / 2);
                        drawable3.setBounds(width16, height16, drawable3.getIntrinsicWidth() + width16, drawable3.getIntrinsicHeight() + height16);
                        drawable3.draw(canvas);
                    }
                    canvas.setBitmap(null);
                    File file9 = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, i20, new FileOutputStream(file9));
                    SharedConfig.saveConfig();
                    return file9.getAbsolutePath();
                }
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, i20, new FileOutputStream(file9));
                SharedConfig.saveConfig();
                return file9.getAbsolutePath();
            } catch (Throwable th7) {
                FileLog.e(th7);
                return null;
            }
            if (i33 != 0) {
                i31 = i33;
            }
            if (themeAccent != null) {
                i = (int) themeAccent.backgroundGradientOverrideColor1;
            } else {
                i = 0;
            }
            if (i != 0) {
                if (i != 0) {
                    i29 = i;
                }
            } else if (i != 0) {
                i29 = i;
            }
            if (themeAccent != null) {
                i2 = (int) themeAccent.backgroundGradientOverrideColor2;
            } else {
                i2 = 0;
            }
            if (i2 != 0) {
                if (i2 == 0) {
                    i3 = i30;
                }
            } else if (i2 == 0) {
                i3 = i30;
            }
            if (themeAccent != null) {
                i3 = i2;
                i4 = (int) themeAccent.backgroundGradientOverrideColor3;
            } else {
                i3 = i2;
                i4 = 0;
            }
            if (i4 != 0) {
                if (i4 == 0) {
                    i4 = i32;
                }
            } else if (i4 == 0) {
                i4 = i32;
            }
            if (TextUtils.isEmpty(strArr[0])) {
                String queryParameter5 = Uri.parse(strArr[0]).getQueryParameter("bg_color");
                if (themeAccent != null) {
                    strArr = strArr;
                    i5 = previewColor2;
                    i30 = i30;
                    i7 = i29;
                    i9 = i31;
                    i8 = i3;
                } else {
                    strArr = strArr;
                    i5 = previewColor2;
                    i30 = i30;
                    i7 = i29;
                    i9 = i31;
                    i8 = i3;
                }
            } else {
                strArr = strArr;
                i5 = previewColor2;
                i30 = i30;
                i7 = i29;
                i9 = i31;
                i8 = i3;
            }
            drawableMutate = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_back).mutate();
            int i3114 = i5;
            setDrawableColor(drawableMutate, i3114);
            i11 = i8;
            drawableMutate2 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_dots).mutate();
            setDrawableColor(drawableMutate2, i3114);
            drawableMutate3 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_smile).mutate();
            setDrawableColor(drawableMutate3, previewColor4);
            drawableMutate4 = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.preview_mic).mutate();
            setDrawableColor(drawableMutate4, previewColor4);
            messageDrawableArr = new MessageDrawable[2];
            i13 = 0;
            while (i13 < i12) {
                Drawable drawable10 = drawableMutate4;
                if (i13 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i3115 = i9;
                int i3116 = i7;
                MessageDrawable messageDrawable7 = new MessageDrawable(2, z2, false) {
                    @Override
                    protected int getColor(int i3117) {
                        int iIndexOfKey = themeFileValues.indexOfKey(i3117);
                        if (iIndexOfKey <= 0) {
                            return Theme.defaultColors[i3117];
                        }
                        return themeFileValues.valueAt(iIndexOfKey);
                    }

                    @Override
                    protected int getCurrentColor(int i3117) {
                        return themeFileValues.get(i3117);
                    }
                };
                messageDrawableArr[i13] = messageDrawable7;
                if (i13 == 0) {
                    i26 = previewColor5;
                } else {
                    i26 = previewColor6;
                }
                setDrawableColor(messageDrawable7, i26);
                i13++;
                drawableMutate4 = drawable10;
                i9 = i3115;
                i7 = i3116;
            }
            drawable = drawableMutate4;
            i14 = i9;
            i15 = i7;
            RectF rectF7 = new RectF();
            i16 = 80;
            if (str2 != null) {
                BitmapFactory.Options options8 = new BitmapFactory.Options();
                options8.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str2, options8);
                i17 = options8.outWidth;
                if (i17 <= 0) {
                }
                drawable2 = drawableMutate2;
                drawable3 = drawable;
                i20 = 80;
                z = false;
            } else {
                i21 = i4;
                if (i14 != 0) {
                    if (i15 == 0) {
                        drawableCreateDitheredGradientBitmapDrawable = new ColorDrawable(i14);
                    } else if (i11 != 0) {
                        drawableCreateDitheredGradientBitmapDrawable = new MotionBackgroundDrawable(i14, i15, i11, i21, true);
                    } else {
                        i25 = themeFileValues.get(key_chat_wallpaper_gradient_rotation, -1);
                        if (i25 == -1) {
                            i25 = 45;
                        }
                        drawableCreateDitheredGradientBitmapDrawable = BackgroundGradientDrawable.createDitheredGradientBitmapDrawable(i25, new int[]{i14, i30}, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                        i16 = 90;
                    }
                    drawableCreateDitheredGradientBitmapDrawable.setBounds(0, 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                    drawableCreateDitheredGradientBitmapDrawable.draw(canvas);
                    i20 = i16;
                    drawable2 = drawableMutate2;
                    drawable3 = drawable;
                    z = true;
                } else {
                    drawable2 = drawableMutate2;
                    drawable3 = drawable;
                    if (i27 < 0) {
                        options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        if (!TextUtils.isEmpty(strArr[0])) {
                            f = 2.0f;
                            file = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(strArr[0]) + ".wp");
                            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                            fileInputStream = null;
                        } else {
                            f = 2.0f;
                            fileInputStream = new FileInputStream(str);
                            fileInputStream.getChannel().position(i27);
                            BitmapFactory.decodeStream(fileInputStream, null, options);
                            file = null;
                        }
                        i22 = options.outWidth;
                        if (i22 > 0) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        i20 = 80;
                    } else {
                        options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        if (!TextUtils.isEmpty(strArr[0])) {
                            f = 2.0f;
                            file = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(strArr[0]) + ".wp");
                            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                            fileInputStream = null;
                        } else {
                            f = 2.0f;
                            fileInputStream = new FileInputStream(str);
                            fileInputStream.getChannel().position(i27);
                            BitmapFactory.decodeStream(fileInputStream, null, options);
                            file = null;
                        }
                        i22 = options.outWidth;
                        if (i22 > 0) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        i20 = 80;
                    }
                }
            }
            if (!z) {
                Drawable drawableCreateDefaultWallpaper9 = createDefaultWallpaper(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                drawableCreateDefaultWallpaper9.setBounds(0, 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight() - 120);
                drawableCreateDefaultWallpaper9.draw(canvas);
            }
            paint.setColor(previewColor);
            canvas.drawRect(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), 120.0f, paint);
            if (drawableMutate != null) {
                int intrinsicHeight17 = (120 - drawableMutate.getIntrinsicHeight()) / 2;
                drawableMutate.setBounds(13, intrinsicHeight17, drawableMutate.getIntrinsicWidth() + 13, drawableMutate.getIntrinsicHeight() + intrinsicHeight17);
                drawableMutate.draw(canvas);
            }
            if (drawable2 != null) {
                int width17 = (bitmapCreateBitmap.getWidth() - drawable2.getIntrinsicWidth()) - 10;
                int intrinsicHeight18 = (120 - drawable2.getIntrinsicHeight()) / 2;
                drawable2.setBounds(width17, intrinsicHeight18, drawable2.getIntrinsicWidth() + width17, drawable2.getIntrinsicHeight() + intrinsicHeight18);
                drawable2.draw(canvas);
            }
            messageDrawableArr[1].setBounds(161, 216, bitmapCreateBitmap.getWidth() - 20, 308);
            messageDrawableArr[1].setTop(0, 560, 522, false, false);
            messageDrawableArr[1].draw(canvas);
            messageDrawableArr[1].setBounds(161, 430, bitmapCreateBitmap.getWidth() - 20, 522);
            messageDrawableArr[1].setTop(430, 560, 522, false, false);
            messageDrawableArr[1].draw(canvas);
            messageDrawableArr[0].setBounds(20, 323, 399, 415);
            messageDrawableArr[0].setTop(323, 560, 522, false, false);
            messageDrawableArr[0].draw(canvas);
            paint.setColor(previewColor3);
            canvas.drawRect(0.0f, bitmapCreateBitmap.getHeight() - 120, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), paint);
            if (drawableMutate3 != null) {
                int height17 = (bitmapCreateBitmap.getHeight() - 120) + ((120 - drawableMutate3.getIntrinsicHeight()) / 2);
                drawableMutate3.setBounds(22, height17, drawableMutate3.getIntrinsicWidth() + 22, drawableMutate3.getIntrinsicHeight() + height17);
                drawableMutate3.draw(canvas);
            }
            if (drawable3 != null) {
                int width18 = (bitmapCreateBitmap.getWidth() - drawable3.getIntrinsicWidth()) - 22;
                int height18 = (bitmapCreateBitmap.getHeight() - 120) + ((120 - drawable3.getIntrinsicHeight()) / 2);
                drawable3.setBounds(width18, height18, drawable3.getIntrinsicWidth() + width18, drawable3.getIntrinsicHeight() + height18);
                drawable3.draw(canvas);
            }
            canvas.setBitmap(null);
            File file10 = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
        } catch (Throwable th8) {
            FileLog.e(th8);
            return null;
        }
    }

    public static void checkIsDark(SparseIntArray sparseIntArray, ThemeInfo themeInfo) {
        if (themeInfo == null || sparseIntArray == null || themeInfo.isDark != -1) {
            return;
        }
        int i = key_windowBackgroundWhite;
        if (ColorUtils.calculateLuminance(ColorUtils.blendARGB(getPreviewColor(sparseIntArray, i), getPreviewColor(sparseIntArray, i), 0.5f)) < 0.5d) {
            themeInfo.isDark = 1;
        } else {
            themeInfo.isDark = 0;
        }
    }

    public static void getThemeFileValuesInBackground(final File file, final String str, final String[] strArr, final Utilities.Callback callback) {
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                callback.run(Theme.getThemeFileValues(file, str, strArr));
            }
        });
    }

    public static SparseIntArray getThemeFileValues(File file, String str, String[] strArr) {
        FileInputStream fileInputStream;
        int iIntValue;
        SparseIntArray sparseIntArray = new SparseIntArray();
        try {
            try {
                byte[] bArr = new byte[1024];
                fileInputStream = new FileInputStream(str != null ? getAssetFile(str) : file);
                int i = -1;
                int i2 = 0;
                int i3 = -1;
                boolean z = false;
                while (true) {
                    try {
                        int i4 = fileInputStream.read(bArr);
                        if (i4 == i) {
                            break;
                        }
                        int i5 = i2;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < i4) {
                            if (bArr[i6] == 10) {
                                int i8 = i6 - i7;
                                int i9 = i8 + 1;
                                String str2 = new String(bArr, i7, i8);
                                if (str2.startsWith("WLS=")) {
                                    if (strArr != null && strArr.length > 0) {
                                        strArr[0] = str2.substring(4);
                                    }
                                } else {
                                    if (str2.startsWith("WPS")) {
                                        i3 = i5 + i9;
                                        z = true;
                                        break;
                                    }
                                    int iIndexOf = str2.indexOf(61);
                                    if (iIndexOf != i) {
                                        String strSubstring = str2.substring(0, iIndexOf);
                                        String strSubstring2 = str2.substring(iIndexOf + 1);
                                        if (strSubstring2.length() > 0 && strSubstring2.charAt(0) == '#') {
                                            try {
                                                iIntValue = Color.parseColor(strSubstring2);
                                            } catch (Exception unused) {
                                                iIntValue = Utilities.parseInt((CharSequence) strSubstring2).intValue();
                                            }
                                        } else {
                                            iIntValue = Utilities.parseInt((CharSequence) strSubstring2).intValue();
                                        }
                                        int iStringKeyToInt = ThemeColors.stringKeyToInt(strSubstring);
                                        if (iStringKeyToInt >= 0) {
                                            sparseIntArray.put(iStringKeyToInt, iIntValue);
                                        }
                                    }
                                    th = th;
                                    try {
                                        FileLog.e(th);
                                        return sparseIntArray;
                                    } finally {
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                            }
                                        }
                                    }
                                }
                                i7 += i9;
                                i5 += i9;
                            }
                            i6++;
                            i = -1;
                        }
                        if (i2 == i5) {
                            break;
                        }
                        fileInputStream.getChannel().position(i5);
                        if (z) {
                            break;
                        }
                        i2 = i5;
                        i = -1;
                    } catch (Throwable th) {
                        th = th;
                        FileLog.e(th);
                        return sparseIntArray;
                    }
                }
                sparseIntArray.put(key_wallpaperFileOffset, i3);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
        } catch (Exception e2) {
        }
        return sparseIntArray;
    }

    public static void createCommonResources(Context context) {
        if (dividerPaint == null) {
            Paint paint = new Paint();
            dividerPaint = paint;
            paint.setStrokeWidth(1.0f);
            Paint paint2 = new Paint();
            dividerExtraPaint = paint2;
            paint2.setStrokeWidth(1.0f);
            avatar_backgroundPaint = new Paint(1);
            Paint paint3 = new Paint(1);
            checkboxSquare_checkPaint = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            checkboxSquare_checkPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            checkboxSquare_checkPaint.setStrokeCap(Paint.Cap.ROUND);
            Paint paint4 = new Paint(1);
            checkboxSquare_eraserPaint = paint4;
            paint4.setColor(0);
            checkboxSquare_eraserPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            checkboxSquare_backgroundPaint = new Paint(1);
            Paint paint5 = new Paint();
            linkSelectionPaint = paint5;
            paint5.setPathEffect(LinkPath.getRoundedEffect());
            Resources resources = context.getResources();
            avatarDrawables[0] = resources.getDrawable(R.drawable.chats_saved);
            avatarDrawables[1] = resources.getDrawable(R.drawable.ghost);
            Drawable[] drawableArr = avatarDrawables;
            int i = R.drawable.msg_folders_private;
            drawableArr[2] = resources.getDrawable(i);
            avatarDrawables[3] = resources.getDrawable(R.drawable.msg_folders_requests);
            avatarDrawables[4] = resources.getDrawable(R.drawable.msg_folders_groups);
            avatarDrawables[5] = resources.getDrawable(R.drawable.msg_folders_channels);
            avatarDrawables[6] = resources.getDrawable(R.drawable.msg_folders_bots);
            avatarDrawables[7] = resources.getDrawable(R.drawable.msg_folders_muted);
            avatarDrawables[8] = resources.getDrawable(R.drawable.msg_folders_read);
            avatarDrawables[9] = resources.getDrawable(R.drawable.msg_folders_archive);
            avatarDrawables[10] = resources.getDrawable(i);
            avatarDrawables[11] = resources.getDrawable(R.drawable.chats_replies);
            avatarDrawables[12] = resources.getDrawable(R.drawable.other_chats);
            avatarDrawables[13] = resources.getDrawable(R.drawable.msg_stories_closefriends);
            avatarDrawables[14] = resources.getDrawable(R.drawable.filled_gift_premium);
            avatarDrawables[15] = resources.getDrawable(R.drawable.filled_unknown);
            avatarDrawables[16] = resources.getDrawable(R.drawable.filled_unclaimed);
            avatarDrawables[17] = resources.getDrawable(R.drawable.large_repost_story);
            avatarDrawables[18] = resources.getDrawable(R.drawable.large_hidden);
            avatarDrawables[19] = resources.getDrawable(R.drawable.large_notes);
            avatarDrawables[20] = resources.getDrawable(R.drawable.filled_folder_new);
            avatarDrawables[21] = resources.getDrawable(R.drawable.filled_folder_existing);
            avatarDrawables[22] = resources.getDrawable(R.drawable.filled_giveaway_premium);
            avatarDrawables[23] = resources.getDrawable(R.drawable.filled_giveaway_stars);
            avatarDrawables[24] = resources.getDrawable(R.drawable.filled_suggest_chat_avatar);
            RLottieDrawable rLottieDrawable = dialogs_archiveAvatarDrawable;
            if (rLottieDrawable != null) {
                rLottieDrawable.setCallback(null);
                dialogs_archiveAvatarDrawable.recycle(false);
            }
            RLottieDrawable rLottieDrawable2 = dialogs_archiveDrawable;
            if (rLottieDrawable2 != null) {
                rLottieDrawable2.recycle(false);
            }
            RLottieDrawable rLottieDrawable3 = dialogs_unarchiveDrawable;
            if (rLottieDrawable3 != null) {
                rLottieDrawable3.recycle(false);
            }
            RLottieDrawable rLottieDrawable4 = dialogs_pinArchiveDrawable;
            if (rLottieDrawable4 != null) {
                rLottieDrawable4.recycle(false);
            }
            RLottieDrawable rLottieDrawable5 = dialogs_unpinArchiveDrawable;
            if (rLottieDrawable5 != null) {
                rLottieDrawable5.recycle(false);
            }
            RLottieDrawable rLottieDrawable6 = dialogs_hidePsaDrawable;
            if (rLottieDrawable6 != null) {
                rLottieDrawable6.recycle(false);
            }
            dialogs_archiveAvatarDrawable = new RLottieDrawable(R.raw.chats_archiveavatar, "chats_archiveavatar", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            dialogs_archiveDrawable = new RLottieDrawable(R.raw.chats_archive, "chats_archive", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            dialogs_unarchiveDrawable = new RLottieDrawable(R.raw.chats_unarchive, "chats_unarchive", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            dialogs_pinArchiveDrawable = new RLottieDrawable(R.raw.chats_hide, "chats_hide", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            dialogs_unpinArchiveDrawable = new RLottieDrawable(R.raw.chats_unhide, "chats_unhide", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            dialogs_hidePsaDrawable = new RLottieDrawable(R.raw.chat_audio_record_delete, "chats_psahide", AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), false, null);
            dialogs_swipeMuteDrawable = new RLottieDrawable(R.raw.swipe_mute, "swipe_mute", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            dialogs_swipeUnmuteDrawable = new RLottieDrawable(R.raw.swipe_unmute, "swipe_unmute", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            dialogs_swipeReadDrawable = new RLottieDrawable(R.raw.swipe_read, "swipe_read", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            dialogs_swipeUnreadDrawable = new RLottieDrawable(R.raw.swipe_unread, "swipe_unread", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            dialogs_swipeDeleteDrawable = new RLottieDrawable(R.raw.swipe_delete, "swipe_delete", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            dialogs_swipeUnpinDrawable = new RLottieDrawable(R.raw.swipe_unpin, "swipe_unpin", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            dialogs_swipePinDrawable = new RLottieDrawable(R.raw.swipe_pin, "swipe_pin", AndroidUtilities.dp(36.0f), AndroidUtilities.dp(36.0f), false, null);
            dialogs_swipeCommunityUngroup = new RLottieDrawable(R.raw.swipe_community_ungroup, "swipe_community_ungroup", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
            applyCommonTheme();
        }
    }

    public static void applyCommonTheme() {
        Paint paint = dividerPaint;
        if (paint == null) {
            return;
        }
        paint.setColor(getColor(key_divider));
        linkSelectionPaint.setColor(getColor(key_windowBackgroundWhiteLinkSelection));
        int i = 0;
        while (true) {
            Drawable[] drawableArr = avatarDrawables;
            if (i < drawableArr.length) {
                setDrawableColorByKey(drawableArr[i], key_avatar_text);
                i++;
            } else {
                dialogs_archiveAvatarDrawable.beginApplyLayerColors();
                RLottieDrawable rLottieDrawable = dialogs_archiveAvatarDrawable;
                int i2 = key_avatar_backgroundArchived;
                rLottieDrawable.setLayerColor("Arrow1", getNonAnimatedColor(i2));
                dialogs_archiveAvatarDrawable.setLayerColor("Arrow2", getNonAnimatedColor(i2));
                RLottieDrawable rLottieDrawable2 = dialogs_archiveAvatarDrawable;
                int i3 = key_avatar_text;
                rLottieDrawable2.setLayerColor("Box2", getNonAnimatedColor(i3));
                dialogs_archiveAvatarDrawable.setLayerColor("Box1", getNonAnimatedColor(i3));
                dialogs_archiveAvatarDrawable.commitApplyLayerColors();
                dialogs_archiveAvatarDrawableRecolored = false;
                dialogs_archiveAvatarDrawable.setAllowDecodeSingleFrame(true);
                dialogs_pinArchiveDrawable.beginApplyLayerColors();
                RLottieDrawable rLottieDrawable3 = dialogs_pinArchiveDrawable;
                int i4 = key_chats_archiveIcon;
                rLottieDrawable3.setLayerColor("Arrow", getNonAnimatedColor(i4));
                dialogs_pinArchiveDrawable.setLayerColor("Line", getNonAnimatedColor(i4));
                dialogs_pinArchiveDrawable.commitApplyLayerColors();
                dialogs_unpinArchiveDrawable.beginApplyLayerColors();
                dialogs_unpinArchiveDrawable.setLayerColor("Arrow", getNonAnimatedColor(i4));
                dialogs_unpinArchiveDrawable.setLayerColor("Line", getNonAnimatedColor(i4));
                dialogs_unpinArchiveDrawable.commitApplyLayerColors();
                dialogs_hidePsaDrawable.beginApplyLayerColors();
                RLottieDrawable rLottieDrawable4 = dialogs_hidePsaDrawable;
                int i5 = key_chats_archiveBackground;
                rLottieDrawable4.setLayerColor("Line 1", getNonAnimatedColor(i5));
                dialogs_hidePsaDrawable.setLayerColor("Line 2", getNonAnimatedColor(i5));
                dialogs_hidePsaDrawable.setLayerColor("Line 3", getNonAnimatedColor(i5));
                dialogs_hidePsaDrawable.setLayerColor("Cup Red", getNonAnimatedColor(i4));
                dialogs_hidePsaDrawable.setLayerColor("Box", getNonAnimatedColor(i4));
                dialogs_hidePsaDrawable.commitApplyLayerColors();
                dialogs_hidePsaDrawableRecolored = false;
                dialogs_archiveDrawable.beginApplyLayerColors();
                dialogs_archiveDrawable.setLayerColor("Arrow", getNonAnimatedColor(i5));
                dialogs_archiveDrawable.setLayerColor("Box2", getNonAnimatedColor(i4));
                dialogs_archiveDrawable.setLayerColor("Box1", getNonAnimatedColor(i4));
                dialogs_archiveDrawable.commitApplyLayerColors();
                dialogs_archiveDrawableRecolored = false;
                dialogs_unarchiveDrawable.beginApplyLayerColors();
                dialogs_unarchiveDrawable.setLayerColor("Arrow1", getNonAnimatedColor(i4));
                dialogs_unarchiveDrawable.setLayerColor("Arrow2", getNonAnimatedColor(key_chats_archivePinBackground));
                dialogs_unarchiveDrawable.setLayerColor("Box2", getNonAnimatedColor(i4));
                dialogs_unarchiveDrawable.setLayerColor("Box1", getNonAnimatedColor(i4));
                dialogs_unarchiveDrawable.commitApplyLayerColors();
                int color = getColor(key_windowBackgroundWhiteBlackText);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                chat_animatedEmojiTextColorFilter = new PorterDuffColorFilter(color, mode);
                chat_outAnimatedEmojiTextColorFilter = new PorterDuffColorFilter(getColor(key_chat_messageTextOut), mode);
                PremiumGradient.getInstance().checkIconColors();
                return;
            }
        }
    }

    public static void createCommonDialogResources(Context context) {
        if (dialogs_countTextPaint == null) {
            TextPaint textPaint = new TextPaint(1);
            dialogs_countTextPaint = textPaint;
            textPaint.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint2 = new TextPaint(1);
            dialogs_countTextPaint2 = textPaint2;
            textPaint2.setTypeface(AndroidUtilities.bold());
            dialogs_countPaint = new Paint(1);
            dialogs_onlineCirclePaint = new Paint(1);
            dialogs_tagPaint = new Paint(1);
        }
        dialogs_countTextPaint.setTextSize(AndroidUtilities.dp(12.0f));
        dialogs_countTextPaint2.setTextSize(AndroidUtilities.dp(13.0f));
    }

    public static void createDialogsResources(Context context) {
        createCommonResources(context);
        createCommonDialogResources(context);
        if (dialogs_namePaint == null) {
            Resources resources = context.getResources();
            dialogs_namePaint = new TextPaint[2];
            dialogs_nameEncryptedPaint = new TextPaint[2];
            dialogs_messagePaint = new TextPaint[2];
            dialogs_messagePrintingPaint = new TextPaint[2];
            for (int i = 0; i < 2; i++) {
                dialogs_namePaint[i] = new TextPaint(1);
                dialogs_namePaint[i].setTypeface(AndroidUtilities.bold());
                dialogs_nameEncryptedPaint[i] = new TextPaint(1);
                dialogs_nameEncryptedPaint[i].setTypeface(AndroidUtilities.bold());
                dialogs_messagePaint[i] = new TextPaint(1);
                dialogs_messagePrintingPaint[i] = new TextPaint(1);
            }
            TextPaint textPaint = new TextPaint(1);
            dialogs_searchNamePaint = textPaint;
            textPaint.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint2 = new TextPaint(1);
            dialogs_searchNameEncryptedPaint = textPaint2;
            textPaint2.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint3 = new TextPaint(1);
            dialogs_messageNamePaint = textPaint3;
            textPaint3.setTypeface(AndroidUtilities.bold());
            dialogs_timePaint = new TextPaint(1);
            dialogs_timePaintBold = new TextPaint(1);
            dialogs_timePaintBoldAccent = new TextPaint(1);
            TextPaint textPaint4 = new TextPaint(1);
            dialogs_archiveTextPaint = textPaint4;
            textPaint4.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint5 = new TextPaint(1);
            dialogs_archiveTextPaintSmall = textPaint5;
            textPaint5.setTypeface(AndroidUtilities.bold());
            dialogs_onlinePaint = new TextPaint(1);
            dialogs_offlinePaint = new TextPaint(1);
            TextPaint textPaint6 = new TextPaint(1);
            dialogs_tagTextPaint = textPaint6;
            textPaint6.setTypeface(AndroidUtilities.bold());
            dialogs_tabletSeletedPaint = new Paint();
            dialogs_pinnedPaint = new Paint(1);
            dialogs_countGrayPaint = new Paint(1);
            dialogs_errorPaint = new Paint(1);
            dialogs_actionMessagePaint = new Paint(1);
            dialogs_lockDrawable = resources.getDrawable(R.drawable.list_secret);
            dialogs_lock2Drawable = resources.getDrawable(R.drawable.msg_mini_lock2);
            int i2 = R.drawable.list_check;
            dialogs_checkDrawable = resources.getDrawable(i2).mutate();
            dialogs_communityCardsDrawable = resources.getDrawable(R.drawable.community_cards).mutate();
            dialogs_playDrawable = resources.getDrawable(R.drawable.minithumb_play).mutate();
            dialogs_checkReadDrawable = resources.getDrawable(i2).mutate();
            dialogs_halfCheckDrawable = resources.getDrawable(R.drawable.list_halfcheck);
            dialogs_clockDrawable = new MsgClockDrawable();
            dialogs_errorDrawable = resources.getDrawable(R.drawable.list_warning_sign);
            dialogs_reorderDrawable = resources.getDrawable(R.drawable.list_reorder).mutate();
            dialogs_muteDrawable = resources.getDrawable(R.drawable.list_mute).mutate();
            dialogs_unmuteDrawable = resources.getDrawable(R.drawable.list_unmute).mutate();
            dialogs_hiddenDrawable = resources.getDrawable(R.drawable.mini_ephemeral_hidden_16).mutate();
            dialogs_verifiedDrawable = resources.getDrawable(R.drawable.verified_area).mutate();
            dialogs_scamDrawable = new ScamDrawable(11, 0);
            dialogs_fakeDrawable = new ScamDrawable(11, 1);
            dialogs_verifiedCheckDrawable = resources.getDrawable(R.drawable.verified_check).mutate();
            int i3 = R.drawable.filled_chatlist_mention;
            dialogs_mentionDrawable = resources.getDrawable(i3).mutate();
            int i4 = R.drawable.filled_chatlist_reaction;
            dialogs_reactionsMentionDrawable = resources.getDrawable(i4).mutate();
            int i5 = R.drawable.filled_chatlist_poll;
            dialogs_pollMentionDrawable = resources.getDrawable(i5).mutate();
            dialogs_mentionDrawableMuted = resources.getDrawable(i3).mutate();
            dialogs_reactionsMentionDrawableMuted = resources.getDrawable(i4).mutate();
            dialogs_pollMentionDrawableMuted = resources.getDrawable(i5).mutate();
            dialogs_pinnedDrawable = resources.getDrawable(R.drawable.list_pin);
            int i6 = R.drawable.msg_pin_mini;
            dialogs_pinnedDrawable2 = resources.getDrawable(i6).mutate();
            dialogs_pinnedDrawable2Accent = resources.getDrawable(i6).mutate();
            dialogs_forum_arrowDrawable = resources.getDrawable(R.drawable.msg_mini_forumarrow);
            moveUpDrawable = resources.getDrawable(R.drawable.preview_arrow);
            RectF rectF = new RectF();
            chat_updatePath[0] = new Path();
            chat_updatePath[2] = new Path();
            float fDp = AndroidUtilities.dp(12.0f);
            float fDp2 = AndroidUtilities.dp(12.0f);
            rectF.set(fDp - AndroidUtilities.dp(5.0f), fDp2 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f) + fDp, AndroidUtilities.dp(5.0f) + fDp2);
            chat_updatePath[2].arcTo(rectF, -160.0f, -110.0f, true);
            chat_updatePath[2].arcTo(rectF, 20.0f, -110.0f, true);
            chat_updatePath[0].moveTo(fDp, AndroidUtilities.dp(8.0f) + fDp2);
            chat_updatePath[0].lineTo(fDp, AndroidUtilities.dp(2.0f) + fDp2);
            chat_updatePath[0].lineTo(AndroidUtilities.dp(3.0f) + fDp, AndroidUtilities.dp(5.0f) + fDp2);
            chat_updatePath[0].close();
            chat_updatePath[0].moveTo(fDp, fDp2 - AndroidUtilities.dp(8.0f));
            chat_updatePath[0].lineTo(fDp, fDp2 - AndroidUtilities.dp(2.0f));
            chat_updatePath[0].lineTo(fDp - AndroidUtilities.dp(3.0f), fDp2 - AndroidUtilities.dp(5.0f));
            chat_updatePath[0].close();
            applyDialogsTheme();
        }
        dialogs_messageNamePaint.setTextSize(AndroidUtilities.dp(14.0f));
        dialogs_timePaint.setTextSize(AndroidUtilities.dp(12.0f));
        dialogs_timePaintBold.setTextSize(AndroidUtilities.dp(12.0f));
        dialogs_timePaintBold.setTypeface(AndroidUtilities.bold());
        dialogs_timePaintBoldAccent.setTextSize(AndroidUtilities.dp(12.0f));
        dialogs_timePaintBoldAccent.setTypeface(AndroidUtilities.bold());
        dialogs_archiveTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
        dialogs_archiveTextPaintSmall.setTextSize(AndroidUtilities.dp(11.0f));
        dialogs_onlinePaint.setTextSize(AndroidUtilities.dp(15.0f));
        dialogs_offlinePaint.setTextSize(AndroidUtilities.dp(15.0f));
        dialogs_tagTextPaint.setTextSize(AndroidUtilities.dp(10.0f));
        dialogs_searchNamePaint.setTextSize(AndroidUtilities.dp(16.0f));
        dialogs_searchNameEncryptedPaint.setTextSize(AndroidUtilities.dp(16.0f));
    }

    public static void applyDialogsTheme() {
        if (dialogs_namePaint == null) {
            return;
        }
        for (int i = 0; i < 2; i++) {
            dialogs_namePaint[i].setColor(getColor(key_chats_name));
            dialogs_nameEncryptedPaint[i].setColor(getColor(key_chats_secretName));
            TextPaint textPaint = dialogs_messagePaint[i];
            int color = getColor(key_chats_message);
            textPaint.linkColor = color;
            textPaint.setColor(color);
            dialogs_messagePrintingPaint[i].setColor(getColor(key_chats_actionMessage));
        }
        dialogs_searchNamePaint.setColor(getColor(key_chats_name));
        dialogs_searchNameEncryptedPaint.setColor(getColor(key_chats_secretName));
        TextPaint textPaint2 = dialogs_messageNamePaint;
        int color2 = getColor(key_chats_nameMessage_threeLines);
        textPaint2.linkColor = color2;
        textPaint2.setColor(color2);
        dialogs_tabletSeletedPaint.setColor(getColor(key_chats_tabletSelectedOverlay));
        dialogs_pinnedPaint.setColor(getColor(key_chats_pinnedOverlay));
        dialogs_timePaint.setColor(getColor(key_chats_date));
        dialogs_timePaintBold.setColor(getColor(key_chats_date_bold));
        TextPaint textPaint3 = dialogs_timePaintBoldAccent;
        int i2 = key_telegram_color_text;
        textPaint3.setColor(getColor(i2));
        TextPaint textPaint4 = dialogs_countTextPaint;
        int i3 = key_chats_unreadCounterText;
        textPaint4.setColor(getColor(i3));
        dialogs_countTextPaint2.setColor(getColor(i3));
        TextPaint textPaint5 = dialogs_archiveTextPaint;
        int i4 = key_chats_archiveText;
        textPaint5.setColor(getColor(i4));
        dialogs_archiveTextPaintSmall.setColor(getColor(i4));
        Paint paint = dialogs_countPaint;
        int i5 = key_chats_unreadCounter;
        paint.setColor(getColor(i5));
        Paint paint2 = dialogs_countGrayPaint;
        int i6 = key_chats_unreadCounterMuted;
        paint2.setColor(getColor(i6));
        dialogs_actionMessagePaint.setColor(getColor(key_chats_actionMessage));
        dialogs_errorPaint.setColor(getColor(key_chats_sentError));
        dialogs_onlinePaint.setColor(getColor(key_windowBackgroundWhiteBlueText3));
        dialogs_offlinePaint.setColor(getColor(key_windowBackgroundWhiteGrayText3));
        setDrawableColorByKey(dialogs_lockDrawable, key_chats_secretIcon);
        Drawable drawable = dialogs_lock2Drawable;
        int i7 = key_chats_pinnedIcon;
        setDrawableColorByKey(drawable, i7);
        setDrawableColorByKey(dialogs_checkDrawable, key_chats_sentCheck);
        setDrawableColorByKey(dialogs_communityCardsDrawable, key_windowBackgroundWhiteBlackText);
        Drawable drawable2 = dialogs_checkReadDrawable;
        int i8 = key_chats_sentReadCheck;
        setDrawableColorByKey(drawable2, i8);
        setDrawableColorByKey(dialogs_halfCheckDrawable, i8);
        setDrawableColorByKey(dialogs_clockDrawable, key_chats_sentClock);
        setDrawableColorByKey(dialogs_errorDrawable, key_chats_sentErrorIcon);
        setDrawableColorByKey(dialogs_pinnedDrawable, i7);
        setDrawableColorByKey(dialogs_pinnedDrawable2, i7);
        setDrawableColorByKey(dialogs_pinnedDrawable2Accent, i2);
        setDrawableColorByKey(dialogs_reorderDrawable, i7);
        Drawable drawable3 = dialogs_muteDrawable;
        int i9 = key_chats_muteIcon;
        setDrawableColorByKey(drawable3, i9);
        setDrawableColorByKey(dialogs_unmuteDrawable, i9);
        setDrawableColorByKey(dialogs_hiddenDrawable, i9);
        setDrawableColorByKey(dialogs_mentionDrawable, i5);
        setDrawableColorByKey(dialogs_reactionsMentionDrawable, key_dialogReactionMentionBackground);
        setDrawableColorByKey(dialogs_pollMentionDrawable, key_color_purple);
        setDrawableColorByKey(dialogs_mentionDrawableMuted, i6);
        setDrawableColorByKey(dialogs_reactionsMentionDrawableMuted, i6);
        setDrawableColorByKey(dialogs_pollMentionDrawableMuted, i6);
        setDrawableColorByKey(dialogs_forum_arrowDrawable, key_chats_message);
        setDrawableColorByKey(dialogs_verifiedDrawable, key_chats_verifiedBackground);
        setDrawableColorByKey(dialogs_verifiedCheckDrawable, key_chats_verifiedCheck);
        setDrawableColorByKey(dialogs_holidayDrawable, key_actionBarDefaultTitle);
        ScamDrawable scamDrawable = dialogs_scamDrawable;
        int i10 = key_chats_draft;
        setDrawableColorByKey(scamDrawable, i10);
        setDrawableColorByKey(dialogs_fakeDrawable, i10);
    }

    public static void reloadAllResources(Context context) {
        destroyResources();
        if (chat_msgInDrawable != null) {
            chat_msgInDrawable = null;
            currentColor = 0;
            createChatResources(context, false);
        }
        if (dialogs_namePaint != null) {
            dialogs_namePaint = null;
            createDialogsResources(context);
        }
        if (profile_verifiedDrawable != null) {
            profile_verifiedDrawable = null;
            createProfileResources(context);
        }
    }

    public static void createCommonMessageResources() {
        synchronized (sync) {
            try {
                if (chat_msgTextPaint == null) {
                    chat_msgTextPaint = new TextPaint(1);
                    chat_msgGameTextPaint = new TextPaint(1);
                    chat_msgTextPaintEmoji = new TextPaint[6];
                    chat_msgTextPaintOneEmoji = new TextPaint(1);
                    chat_msgTextPaintTwoEmoji = new TextPaint(1);
                    chat_msgTextPaintThreeEmoji = new TextPaint(1);
                    TextPaint textPaint = new TextPaint(1);
                    chat_msgBotButtonPaint = textPaint;
                    textPaint.setTypeface(AndroidUtilities.bold());
                    TextPaint textPaint2 = new TextPaint(1);
                    chat_namePaint = textPaint2;
                    textPaint2.setTypeface(AndroidUtilities.bold());
                    TextPaint textPaint3 = new TextPaint(1);
                    chat_replyNamePaint = textPaint3;
                    textPaint3.setTypeface(AndroidUtilities.bold());
                    chat_replyTextPaint = new TextPaint(1);
                    chat_quoteTextPaint = new TextPaint(1);
                    chat_explanationTextPaint = new TextPaint(1);
                    chat_titleLabelTextPaint = new TextPaint(1);
                    TextPaint textPaint4 = new TextPaint(1);
                    chat_topicTextPaint = textPaint4;
                    textPaint4.setTypeface(AndroidUtilities.bold());
                    chat_forwardNamePaint = new TextPaint(1);
                    chat_adminPaint = new TextPaint(1);
                    chat_timePaint = new TextPaint(1);
                    TextPaint textPaint5 = new TextPaint(1);
                    chat_msgTextCodePaint = textPaint5;
                    Typeface typeface = Typeface.MONOSPACE;
                    textPaint5.setTypeface(typeface);
                    TextPaint textPaint6 = new TextPaint(1);
                    chat_msgTextCode2Paint = textPaint6;
                    textPaint6.setTypeface(typeface);
                    TextPaint textPaint7 = new TextPaint(1);
                    chat_msgTextCode3Paint = textPaint7;
                    textPaint7.setTypeface(typeface);
                    chat_msgCodeBgPaint = new TextPaint(1);
                    chat_ephemeralPaint = new TextPaint(1);
                }
                float[] fArr = {0.68f, 0.46f, 0.34f, 0.28f, 0.22f, 0.19f};
                int i = 0;
                while (true) {
                    TextPaint[] textPaintArr = chat_msgTextPaintEmoji;
                    if (i < textPaintArr.length) {
                        textPaintArr[i] = new TextPaint(1);
                        chat_msgTextPaintEmoji[i].setTextSize(AndroidUtilities.dp(fArr[i] * 120.0f));
                        i++;
                    } else {
                        chat_msgTextPaintOneEmoji.setTextSize(AndroidUtilities.dp(46.0f));
                        chat_msgTextPaintTwoEmoji.setTextSize(AndroidUtilities.dp(38.0f));
                        chat_msgTextPaintThreeEmoji.setTextSize(AndroidUtilities.dp(30.0f));
                        chat_msgTextPaint.setTextSize(AndroidUtilities.dp(SharedConfig.fontSize));
                        chat_msgGameTextPaint.setTextSize(AndroidUtilities.dp(14.0f));
                        chat_msgBotButtonPaint.setTextSize(AndroidUtilities.dp(15.0f));
                        float f = ((SharedConfig.fontSize * 2) + 10) / 3.0f;
                        chat_namePaint.setTextSize(AndroidUtilities.dp(f));
                        chat_replyNamePaint.setTextSize(AndroidUtilities.dp(f));
                        chat_replyTextPaint.setTextSize(AndroidUtilities.dp(f));
                        float f2 = f - 1.0f;
                        chat_quoteTextPaint.setTextSize(AndroidUtilities.dp(f2));
                        chat_explanationTextPaint.setTextSize(AndroidUtilities.dp(f));
                        chat_ephemeralPaint.setTextSize(AndroidUtilities.dp(12.0f));
                        chat_topicTextPaint.setTextSize(AndroidUtilities.dp(f2));
                        chat_titleLabelTextPaint.setTextSize(AndroidUtilities.dp(f - 2.0f));
                        chat_forwardNamePaint.setTextSize(AndroidUtilities.dp(f));
                        chat_adminPaint.setTextSize(AndroidUtilities.dp(f2));
                        chat_msgTextCodePaint.setTextSize(AndroidUtilities.dp(Math.max(Math.min(10, SharedConfig.fontSize - 1), SharedConfig.fontSize - 2)));
                        chat_msgTextCode2Paint.setTextSize(AndroidUtilities.dp(Math.max(Math.min(10, SharedConfig.fontSize - 2), SharedConfig.fontSize - 3)));
                        chat_msgTextCode3Paint.setTextSize(AndroidUtilities.dp(Math.max(Math.min(10, SharedConfig.fontSize - 2), SharedConfig.fontSize - 5)));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void createCommonChatResources() {
        createCommonMessageResources();
        if (chat_infoPaint == null) {
            chat_infoPaint = new TextPaint(1);
            TextPaint textPaint = new TextPaint(1);
            chat_infoBoldPaint = textPaint;
            textPaint.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint2 = new TextPaint(1);
            chat_stickerCommentCountPaint = textPaint2;
            textPaint2.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint3 = new TextPaint(1);
            chat_docNamePaint = textPaint3;
            textPaint3.setTypeface(AndroidUtilities.bold());
            chat_docBackPaint = new Paint(1);
            Paint paint = new Paint(1);
            chat_deleteProgressPaint = paint;
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            Paint paint2 = chat_deleteProgressPaint;
            Paint.Cap cap = Paint.Cap.ROUND;
            paint2.setStrokeCap(cap);
            TextPaint textPaint4 = new TextPaint(1);
            chat_locationTitlePaint = textPaint4;
            textPaint4.setTypeface(AndroidUtilities.bold());
            chat_locationAddressPaint = new TextPaint(1);
            Paint paint3 = new Paint();
            chat_urlPaint = paint3;
            paint3.setPathEffect(LinkPath.getRoundedEffect());
            Paint paint4 = new Paint();
            chat_outUrlPaint = paint4;
            paint4.setPathEffect(LinkPath.getRoundedEffect());
            Paint paint5 = new Paint();
            chat_textSearchSelectionPaint = paint5;
            paint5.setPathEffect(LinkPath.getRoundedEffect());
            Paint paint6 = new Paint(1);
            chat_radialProgressPaint = paint6;
            paint6.setStrokeCap(cap);
            chat_radialProgressPaint.setStyle(style);
            chat_radialProgressPaint.setColor(-1610612737);
            Paint paint7 = new Paint(1);
            chat_radialProgress2Paint = paint7;
            paint7.setStrokeCap(cap);
            chat_radialProgress2Paint.setStyle(style);
            chat_audioTimePaint = new TextPaint(1);
            TextPaint textPaint5 = new TextPaint(1);
            chat_livePaint = textPaint5;
            textPaint5.setTypeface(Typeface.DEFAULT_BOLD);
            TextPaint textPaint6 = new TextPaint(1);
            chat_audioTitlePaint = textPaint6;
            textPaint6.setTypeface(AndroidUtilities.bold());
            chat_audioPerformerPaint = new TextPaint(1);
            TextPaint textPaint7 = new TextPaint(1);
            chat_botButtonPaint = textPaint7;
            textPaint7.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint8 = new TextPaint(1);
            chat_contactNamePaint = textPaint8;
            textPaint8.setTypeface(AndroidUtilities.bold());
            chat_contactPhonePaint = new TextPaint(1);
            chat_durationPaint = new TextPaint(1);
            TextPaint textPaint9 = new TextPaint(1);
            chat_gamePaint = textPaint9;
            textPaint9.setTypeface(AndroidUtilities.bold());
            chat_shipmentPaint = new TextPaint(1);
            chat_timePaint = new TextPaint(1);
            chat_adminPaint = new TextPaint(1);
            chat_ephemeralPaint = new TextPaint(1);
            TextPaint textPaint10 = new TextPaint(1);
            chat_namePaint = textPaint10;
            textPaint10.setTypeface(AndroidUtilities.bold());
            chat_forwardNamePaint = new TextPaint(1);
            TextPaint textPaint11 = new TextPaint(1);
            chat_replyNamePaint = textPaint11;
            textPaint11.setTypeface(AndroidUtilities.bold());
            chat_replyTextPaint = new TextPaint(1);
            TextPaint textPaint12 = new TextPaint(1);
            chat_topicTextPaint = textPaint12;
            textPaint12.setTypeface(AndroidUtilities.bold());
            chat_titleLabelTextPaint = new TextPaint(1);
            chat_commentTextPaint = new TextPaint(1);
            TextPaint textPaint13 = new TextPaint(1);
            chat_instantViewPaint = textPaint13;
            textPaint13.setTypeface(AndroidUtilities.bold());
            Paint paint8 = new Paint(1);
            chat_instantViewRectPaint = paint8;
            paint8.setStyle(style);
            chat_instantViewRectPaint.setStrokeCap(cap);
            chat_instantViewButtonPaint = new Paint(1);
            Paint paint9 = new Paint(1);
            chat_pollTimerPaint = paint9;
            paint9.setStyle(style);
            chat_pollTimerPaint.setStrokeCap(cap);
            chat_replyLinePaint = new Paint(1);
            chat_msgErrorPaint = new Paint(1);
            chat_statusPaint = new Paint(1);
            Paint paint10 = new Paint(1);
            chat_statusRecordPaint = paint10;
            paint10.setStyle(style);
            chat_statusRecordPaint.setStrokeCap(cap);
            chat_actionTextPaint = new TextPaint(1);
            chat_actionTextPaint2 = new TextPaint(1);
            chat_actionTextPaint3 = new TextPaint(1);
            chat_actionTextPaint.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint14 = new TextPaint(1);
            chat_unlockExtendedMediaTextPaint = textPaint14;
            textPaint14.setTypeface(AndroidUtilities.bold());
            Paint paint11 = new Paint(1);
            chat_actionBackgroundGradientDarkenPaint = paint11;
            paint11.setColor(352321536);
            chat_timeBackgroundPaint = new Paint(1);
            TextPaint textPaint15 = new TextPaint(1);
            chat_contextResult_titleTextPaint = textPaint15;
            textPaint15.setTypeface(AndroidUtilities.bold());
            chat_contextResult_descriptionTextPaint = new TextPaint(1);
            chat_composeBackgroundPaint = new Paint();
            chat_radialProgressPausedPaint = new Paint(1);
            chat_radialProgressPausedSeekbarPaint = new Paint(1);
            chat_videoProgressPaint = new Paint(1);
            chat_messageBackgroundSelectedPaint = new Paint(1);
            chat_actionBackgroundPaint = new Paint(7);
            chat_actionBackgroundSelectedPaint = new Paint(7);
            addChatPaint("paintChatMessageBackgroundSelected", chat_messageBackgroundSelectedPaint, key_chat_selectedBackground);
            Paint paint12 = chat_actionBackgroundPaint;
            int i = key_chat_serviceBackground;
            addChatPaint("paintChatActionBackground", paint12, i);
            addChatPaint("paintChatActionBackgroundDarken", chat_actionBackgroundGradientDarkenPaint, i);
            addChatPaint("paintChatActionBackgroundSelected", chat_actionBackgroundSelectedPaint, key_chat_serviceBackgroundSelected);
            TextPaint textPaint16 = chat_actionTextPaint;
            int i2 = key_chat_serviceText;
            addChatPaint("paintChatActionText", textPaint16, i2);
            addChatPaint("paintChatActionText2", chat_actionTextPaint2, i2);
            addChatPaint("paintChatActionText3", chat_actionTextPaint3, i2);
            addChatPaint("paintChatBotButton", chat_botButtonPaint, key_chat_botButtonText);
            addChatPaint("paintChatComposeBackground", chat_composeBackgroundPaint, key_chat_messagePanelBackground);
            addChatPaint("paintChatTimeBackground", chat_timeBackgroundPaint, key_chat_mediaTimeBackground);
        }
    }

    public static void createChatResources(Context context, boolean z) {
        float f;
        float f2;
        TextPaint textPaint;
        createCommonChatResources();
        if (z || chat_msgInDrawable != null) {
            f = 1.0f;
            f2 = 14.0f;
        } else {
            Resources resources = context.getResources();
            chat_msgNoSoundDrawable = resources.getDrawable(R.drawable.video_muted);
            chat_livePhoto = resources.getDrawable(R.drawable.media_live_on).mutate();
            chat_msgInDrawable = new MessageDrawable(0, false, false);
            chat_msgInSelectedDrawable = new MessageDrawable(0, false, true);
            chat_msgOutDrawable = new MessageDrawable(0, true, false);
            chat_msgOutSelectedDrawable = new MessageDrawable(0, true, true);
            chat_msgInMediaDrawable = new MessageDrawable(1, false, false);
            chat_msgInMediaSelectedDrawable = new MessageDrawable(1, false, true);
            chat_msgOutMediaDrawable = new MessageDrawable(1, true, false);
            chat_msgOutMediaSelectedDrawable = new MessageDrawable(1, true, true);
            PathAnimator pathAnimator = new PathAnimator(0.293f, -26.0f, -28.0f, 1.0f);
            playPauseAnimator = pathAnimator;
            pathAnimator.addSvgKeyFrame("M 34.141 16.042 C 37.384 17.921 40.886 20.001 44.211 21.965 C 46.139 23.104 49.285 24.729 49.586 25.917 C 50.289 28.687 48.484 30 46.274 30 L 6 30.021 C 3.79 30.021 2.075 30.023 2 26.021 L 2.009 3.417 C 2.009 0.417 5.326 -0.58 7.068 0.417 C 10.545 2.406 25.024 10.761 34.141 16.042 Z", 166.0f);
            playPauseAnimator.addSvgKeyFrame("M 37.843 17.769 C 41.143 19.508 44.131 21.164 47.429 23.117 C 48.542 23.775 49.623 24.561 49.761 25.993 C 50.074 28.708 48.557 30 46.347 30 L 6 30.012 C 3.79 30.012 2 28.222 2 26.012 L 2.009 4.609 C 2.009 1.626 5.276 0.664 7.074 1.541 C 10.608 3.309 28.488 12.842 37.843 17.769 Z", 200.0f);
            playPauseAnimator.addSvgKeyFrame("M 40.644 18.756 C 43.986 20.389 49.867 23.108 49.884 25.534 C 49.897 27.154 49.88 24.441 49.894 26.059 C 49.911 28.733 48.6 30 46.39 30 L 6 30.013 C 3.79 30.013 2 28.223 2 26.013 L 2.008 5.52 C 2.008 2.55 5.237 1.614 7.079 2.401 C 10.656 4 31.106 14.097 40.644 18.756 Z", 217.0f);
            playPauseAnimator.addSvgKeyFrame("M 43.782 19.218 C 47.117 20.675 50.075 21.538 50.041 24.796 C 50.022 26.606 50.038 24.309 50.039 26.104 C 50.038 28.736 48.663 30 46.453 30 L 6 29.986 C 3.79 29.986 2 28.196 2 25.986 L 2.008 6.491 C 2.008 3.535 5.196 2.627 7.085 3.316 C 10.708 4.731 33.992 14.944 43.782 19.218 Z", 234.0f);
            playPauseAnimator.addSvgKeyFrame("M 47.421 16.941 C 50.544 18.191 50.783 19.91 50.769 22.706 C 50.761 24.484 50.76 23.953 50.79 26.073 C 50.814 27.835 49.334 30 47.124 30 L 5 30.01 C 2.79 30.01 1 28.22 1 26.01 L 1.001 10.823 C 1.001 8.218 3.532 6.895 5.572 7.26 C 7.493 8.01 47.421 16.941 47.421 16.941 Z", 267.0f);
            playPauseAnimator.addSvgKeyFrame("M 47.641 17.125 C 50.641 18.207 51.09 19.935 51.078 22.653 C 51.07 24.191 51.062 21.23 51.088 23.063 C 51.109 24.886 49.587 27 47.377 27 L 5 27.009 C 2.79 27.009 1 25.219 1 23.009 L 0.983 11.459 C 0.983 8.908 3.414 7.522 5.476 7.838 C 7.138 8.486 47.641 17.125 47.641 17.125 Z", 300.0f);
            playPauseAnimator.addSvgKeyFrame("M 48 7 C 50.21 7 52 8.79 52 11 C 52 19 52 19 52 19 C 52 21.21 50.21 23 48 23 L 4 23 C 1.79 23 0 21.21 0 19 L 0 11 C 0 8.79 1.79 7 4 7 C 48 7 48 7 48 7 Z", 383.0f);
            int i = R.drawable.msg_check_s;
            chat_msgOutCheckDrawable = resources.getDrawable(i).mutate();
            chat_msgOutCheckSelectedDrawable = resources.getDrawable(i).mutate();
            chat_msgOutCheckReadDrawable = resources.getDrawable(i).mutate();
            chat_msgOutCheckReadSelectedDrawable = resources.getDrawable(i).mutate();
            chat_msgMediaCheckDrawable = resources.getDrawable(i).mutate();
            chat_msgStickerCheckDrawable = resources.getDrawable(i).mutate();
            int i2 = R.drawable.msg_halfcheck;
            chat_msgOutHalfCheckDrawable = resources.getDrawable(i2).mutate();
            chat_msgOutHalfCheckSelectedDrawable = resources.getDrawable(i2).mutate();
            int i3 = R.drawable.msg_halfcheck_s;
            chat_msgMediaHalfCheckDrawable = resources.getDrawable(i3).mutate();
            chat_msgStickerHalfCheckDrawable = resources.getDrawable(i3).mutate();
            chat_msgClockDrawable = new MsgClockDrawable();
            int i4 = R.drawable.ic_lock_header;
            chat_msgUnlockDrawable = resources.getDrawable(i4).mutate();
            int i5 = R.drawable.msg_views;
            chat_msgInViewsDrawable = resources.getDrawable(i5).mutate();
            chat_msgInViewsSelectedDrawable = resources.getDrawable(i5).mutate();
            chat_msgOutViewsDrawable = resources.getDrawable(i5).mutate();
            chat_msgOutViewsSelectedDrawable = resources.getDrawable(i5).mutate();
            int i6 = R.drawable.msg_reply_small;
            chat_msgInRepliesDrawable = resources.getDrawable(i6).mutate();
            chat_msgInRepliesSelectedDrawable = resources.getDrawable(i6).mutate();
            chat_msgOutRepliesDrawable = resources.getDrawable(i6).mutate();
            chat_msgOutRepliesSelectedDrawable = resources.getDrawable(i6).mutate();
            int i7 = R.drawable.msg_pin_mini;
            chat_msgInPinnedDrawable = resources.getDrawable(i7).mutate();
            chat_msgInPinnedSelectedDrawable = resources.getDrawable(i7).mutate();
            chat_msgOutPinnedDrawable = resources.getDrawable(i7).mutate();
            chat_msgOutPinnedSelectedDrawable = resources.getDrawable(i7).mutate();
            chat_msgMediaPinnedDrawable = resources.getDrawable(i7).mutate();
            chat_msgStickerPinnedDrawable = resources.getDrawable(i7).mutate();
            chat_msgMediaViewsDrawable = resources.getDrawable(i5).mutate();
            chat_msgMediaRepliesDrawable = resources.getDrawable(i6).mutate();
            chat_msgStickerViewsDrawable = resources.getDrawable(i5).mutate();
            chat_msgStickerRepliesDrawable = resources.getDrawable(i6).mutate();
            int i8 = R.drawable.msg_actions;
            chat_msgInMenuDrawable = resources.getDrawable(i8).mutate();
            chat_msgInMenuSelectedDrawable = resources.getDrawable(i8).mutate();
            chat_msgOutMenuDrawable = resources.getDrawable(i8).mutate();
            chat_msgOutMenuSelectedDrawable = resources.getDrawable(i8).mutate();
            chat_msgMediaMenuDrawable = resources.getDrawable(R.drawable.video_actions);
            int i9 = R.drawable.msg_instant;
            chat_msgInInstantDrawable = resources.getDrawable(i9).mutate();
            chat_msgOutInstantDrawable = resources.getDrawable(i9).mutate();
            chat_msgErrorDrawable = resources.getDrawable(R.drawable.msg_warning);
            chat_muteIconDrawable = resources.getDrawable(R.drawable.list_mute).mutate();
            chat_lockIconDrawable = resources.getDrawable(i4);
            Drawable[] drawableArr = chat_msgInCallDrawable;
            int i10 = R.drawable.chat_calls_voice;
            drawableArr[0] = resources.getDrawable(i10).mutate();
            chat_msgInCallSelectedDrawable[0] = resources.getDrawable(i10).mutate();
            chat_msgOutCallDrawable[0] = resources.getDrawable(i10).mutate();
            chat_msgOutCallSelectedDrawable[0] = resources.getDrawable(i10).mutate();
            Drawable[] drawableArr2 = chat_msgInCallDrawable;
            int i11 = R.drawable.chat_calls_video;
            drawableArr2[1] = resources.getDrawable(i11).mutate();
            chat_msgInCallSelectedDrawable[1] = resources.getDrawable(i11).mutate();
            chat_msgOutCallDrawable[1] = resources.getDrawable(i11).mutate();
            chat_msgOutCallSelectedDrawable[1] = resources.getDrawable(i11).mutate();
            chat_msgCallUpGreenDrawable = resources.getDrawable(R.drawable.chat_calls_outgoing).mutate();
            int i12 = R.drawable.chat_calls_incoming;
            chat_msgCallDownRedDrawable = resources.getDrawable(i12).mutate();
            chat_msgCallDownGreenDrawable = resources.getDrawable(i12).mutate();
            for (int i13 = 0; i13 < 2; i13++) {
                chat_pollCheckDrawable[i13] = resources.getDrawable(R.drawable.poll_right).mutate();
                chat_pollCrossDrawable[i13] = resources.getDrawable(R.drawable.poll_wrong).mutate();
                chat_pollHintDrawable[i13] = resources.getDrawable(R.drawable.msg_emoji_objects).mutate();
                chat_psaHelpDrawable[i13] = resources.getDrawable(R.drawable.msg_psa).mutate();
            }
            int i14 = R.drawable.mini_call_out_16;
            calllog_msgCallUpRedDrawable = resources.getDrawable(i14).mutate();
            calllog_msgCallUpGreenDrawable = resources.getDrawable(i14).mutate();
            int i15 = R.drawable.mini_call_in_16;
            calllog_msgCallDownRedDrawable = resources.getDrawable(i15).mutate();
            calllog_msgCallDownGreenDrawable = resources.getDrawable(i15).mutate();
            chat_inlineResultFile = resources.getDrawable(R.drawable.bot_file);
            chat_inlineResultAudio = resources.getDrawable(R.drawable.bot_music);
            chat_inlineResultLocation = resources.getDrawable(R.drawable.bot_location);
            chat_botLinkDrawable = resources.getDrawable(R.drawable.bot_link);
            chat_botInlineDrawable = resources.getDrawable(R.drawable.bot_lines);
            chat_botCardDrawable = resources.getDrawable(R.drawable.bot_card);
            chat_botWebViewDrawable = resources.getDrawable(R.drawable.bot_webview);
            chat_botInviteDrawable = resources.getDrawable(R.drawable.bot_invite);
            chat_botLockDrawable = resources.getDrawable(R.drawable.permission_locked);
            chat_commentDrawable = resources.getDrawable(R.drawable.msg_msgbubble);
            chat_commentStickerDrawable = resources.getDrawable(R.drawable.msg_msgbubble2);
            chat_commentArrowDrawable = resources.getDrawable(R.drawable.msg_arrowright);
            chat_gradientLeftDrawable = resources.getDrawable(R.drawable.gradient_left);
            chat_gradientRightDrawable = resources.getDrawable(R.drawable.gradient_right);
            chat_contextResult_shadowUnderSwitchDrawable = resources.getDrawable(R.drawable.header_shadow).mutate();
            chat_attachEmptyDrawable = resources.getDrawable(R.drawable.nophotos3);
            chat_shareIconDrawable = resources.getDrawable(R.drawable.filled_button_share).mutate();
            chat_replyIconDrawable = resources.getDrawable(R.drawable.filled_button_reply);
            chat_closeIconDrawable = resources.getDrawable(R.drawable.msg_voiceclose).mutate();
            chat_moreIconDrawable = resources.getDrawable(R.drawable.media_more).mutate();
            chat_goIconDrawable = resources.getDrawable(R.drawable.filled_open_message);
            int iDp = AndroidUtilities.dp(2.0f);
            RectF rectF = new RectF();
            chat_filePath[0] = new Path();
            chat_filePath[0].moveTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(3.0f));
            chat_filePath[0].lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f));
            chat_filePath[0].lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f));
            chat_filePath[0].lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(20.0f));
            int i16 = iDp * 2;
            f = 1.0f;
            f2 = 14.0f;
            rectF.set(AndroidUtilities.dp(21.0f) - i16, AndroidUtilities.dp(19.0f) - iDp, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(19.0f) + iDp);
            chat_filePath[0].arcTo(rectF, 0.0f, 90.0f, false);
            chat_filePath[0].lineTo(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f));
            rectF.set(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(19.0f) - iDp, AndroidUtilities.dp(5.0f) + i16, AndroidUtilities.dp(19.0f) + iDp);
            chat_filePath[0].arcTo(rectF, 90.0f, 90.0f, false);
            chat_filePath[0].lineTo(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f));
            rectF.set(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(5.0f) + i16, AndroidUtilities.dp(3.0f) + i16);
            chat_filePath[0].arcTo(rectF, 180.0f, 90.0f, false);
            chat_filePath[0].close();
            chat_filePath[1] = new Path();
            chat_filePath[1].moveTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(5.0f));
            chat_filePath[1].lineTo(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(10.0f));
            chat_filePath[1].lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f));
            chat_filePath[1].close();
            chat_flameIcon = resources.getDrawable(R.drawable.filled_fire).mutate();
            chat_gifIcon = resources.getDrawable(R.drawable.msg_round_gif_m).mutate();
            Drawable[] drawableArr3 = chat_fileStatesDrawable[0];
            int iDp2 = AndroidUtilities.dp(44.0f);
            int i17 = R.drawable.msg_round_play_m;
            drawableArr3[0] = createCircleDrawableWithIcon(iDp2, i17);
            chat_fileStatesDrawable[0][1] = createCircleDrawableWithIcon(AndroidUtilities.dp(44.0f), i17);
            Drawable[] drawableArr4 = chat_fileStatesDrawable[1];
            int iDp3 = AndroidUtilities.dp(44.0f);
            int i18 = R.drawable.msg_round_pause_m;
            drawableArr4[0] = createCircleDrawableWithIcon(iDp3, i18);
            chat_fileStatesDrawable[1][1] = createCircleDrawableWithIcon(AndroidUtilities.dp(44.0f), i18);
            Drawable[] drawableArr5 = chat_fileStatesDrawable[2];
            int iDp4 = AndroidUtilities.dp(44.0f);
            int i19 = R.drawable.msg_round_load_m;
            drawableArr5[0] = createCircleDrawableWithIcon(iDp4, i19);
            chat_fileStatesDrawable[2][1] = createCircleDrawableWithIcon(AndroidUtilities.dp(44.0f), i19);
            Drawable[] drawableArr6 = chat_fileStatesDrawable[3];
            int iDp5 = AndroidUtilities.dp(44.0f);
            int i20 = R.drawable.msg_round_file_s;
            drawableArr6[0] = createCircleDrawableWithIcon(iDp5, i20);
            chat_fileStatesDrawable[3][1] = createCircleDrawableWithIcon(AndroidUtilities.dp(44.0f), i20);
            Drawable[] drawableArr7 = chat_fileStatesDrawable[4];
            int iDp6 = AndroidUtilities.dp(44.0f);
            int i21 = R.drawable.msg_round_cancel_m;
            drawableArr7[0] = createCircleDrawableWithIcon(iDp6, i21);
            chat_fileStatesDrawable[4][1] = createCircleDrawableWithIcon(AndroidUtilities.dp(44.0f), i21);
            Drawable[] drawableArr8 = chat_contactDrawable;
            int iDp7 = AndroidUtilities.dp(44.0f);
            int i22 = R.drawable.msg_contact;
            drawableArr8[0] = createCircleDrawableWithIcon(iDp7, i22);
            chat_contactDrawable[1] = createCircleDrawableWithIcon(AndroidUtilities.dp(44.0f), i22);
            Drawable[] drawableArr9 = chat_locationDrawable;
            int i23 = R.drawable.msg_location;
            drawableArr9[0] = resources.getDrawable(i23).mutate();
            chat_locationDrawable[1] = resources.getDrawable(i23).mutate();
            chat_composeShadowDrawable = context.getResources().getDrawable(R.drawable.compose_panel_shadow).mutate();
            chat_composeShadowRoundDrawable = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            chat_roundVideoShadow = new RoundVideoShadow();
            defaultChatDrawables.clear();
            defaultChatDrawableColorKeys.clear();
            Drawable drawable = chat_botInlineDrawable;
            int i24 = key_chat_serviceIcon;
            addChatDrawable("drawableBotInline", drawable, i24);
            addChatDrawable("drawableBotWebView", chat_botWebViewDrawable, i24);
            addChatDrawable("drawableBotLock", chat_botLockDrawable, i24);
            addChatDrawable("drawableBotLink", chat_botLinkDrawable, i24);
            addChatDrawable("drawable_botInvite", chat_botInviteDrawable, i24);
            addChatDrawable("drawableGoIcon", chat_goIconDrawable, i24);
            addChatDrawable("drawableCommentSticker", chat_commentStickerDrawable, i24);
            addChatDrawable("drawableMsgError", chat_msgErrorDrawable, key_chat_sentErrorIcon);
            addChatDrawable("drawableMsgIn", chat_msgInDrawable, -1);
            addChatDrawable("drawableMsgInSelected", chat_msgInSelectedDrawable, -1);
            addChatDrawable("drawableMsgInMedia", chat_msgInMediaDrawable, -1);
            addChatDrawable("drawableMsgInMediaSelected", chat_msgInMediaSelectedDrawable, -1);
            addChatDrawable("drawableMsgInInstant", chat_msgInInstantDrawable, key_chat_inInstant);
            addChatDrawable("drawableMsgOut", chat_msgOutDrawable, -1);
            addChatDrawable("drawableMsgOutSelected", chat_msgOutSelectedDrawable, -1);
            addChatDrawable("drawableMsgOutMedia", chat_msgOutMediaDrawable, -1);
            addChatDrawable("drawableMsgOutMediaSelected", chat_msgOutMediaSelectedDrawable, -1);
            Drawable drawable2 = chat_msgOutCallDrawable[0];
            int i25 = key_chat_outInstant;
            addChatDrawable("drawableMsgOutCallAudio", drawable2, i25);
            Drawable drawable3 = chat_msgOutCallSelectedDrawable[0];
            int i26 = key_chat_outInstantSelected;
            addChatDrawable("drawableMsgOutCallAudioSelected", drawable3, i26);
            addChatDrawable("drawableMsgOutCallVideo", chat_msgOutCallDrawable[1], i25);
            addChatDrawable("drawableMsgOutCallVideo", chat_msgOutCallSelectedDrawable[1], i26);
            addChatDrawable("drawableMsgOutCheck", chat_msgOutCheckDrawable, key_chat_outSentCheck);
            addChatDrawable("drawableMsgOutCheckSelected", chat_msgOutCheckSelectedDrawable, key_chat_outSentCheckSelected);
            Drawable drawable4 = chat_msgOutCheckReadDrawable;
            int i27 = key_chat_outSentCheckRead;
            addChatDrawable("drawableMsgOutCheckRead", drawable4, i27);
            Drawable drawable5 = chat_msgOutCheckReadSelectedDrawable;
            int i28 = key_chat_outSentCheckReadSelected;
            addChatDrawable("drawableMsgOutCheckReadSelected", drawable5, i28);
            addChatDrawable("drawableMsgOutHalfCheck", chat_msgOutHalfCheckDrawable, i27);
            addChatDrawable("drawableMsgOutHalfCheckSelected", chat_msgOutHalfCheckSelectedDrawable, i28);
            addChatDrawable("drawableMsgOutInstant", chat_msgOutInstantDrawable, i25);
            addChatDrawable("drawableMsgOutMenu", chat_msgOutMenuDrawable, key_chat_outMenu);
            addChatDrawable("drawableMsgOutMenuSelected", chat_msgOutMenuSelectedDrawable, key_chat_outMenuSelected);
            Drawable drawable6 = chat_msgOutPinnedDrawable;
            int i29 = key_chat_outViews;
            addChatDrawable("drawableMsgOutPinned", drawable6, i29);
            Drawable drawable7 = chat_msgOutPinnedSelectedDrawable;
            int i30 = key_chat_outViewsSelected;
            addChatDrawable("drawableMsgOutPinnedSelected", drawable7, i30);
            addChatDrawable("drawableMsgOutReplies", chat_msgOutRepliesDrawable, i29);
            addChatDrawable("drawableMsgOutReplies", chat_msgOutRepliesSelectedDrawable, i30);
            addChatDrawable("drawableMsgOutViews", chat_msgOutViewsDrawable, i29);
            addChatDrawable("drawableMsgOutViewsSelected", chat_msgOutViewsSelectedDrawable, i30);
            Drawable drawable8 = chat_msgStickerCheckDrawable;
            int i31 = key_chat_serviceText;
            addChatDrawable("drawableMsgStickerCheck", drawable8, i31);
            addChatDrawable("drawableMsgStickerHalfCheck", chat_msgStickerHalfCheckDrawable, i31);
            addChatDrawable("drawableMsgStickerPinned", chat_msgStickerPinnedDrawable, i31);
            addChatDrawable("drawableMsgStickerReplies", chat_msgStickerRepliesDrawable, i31);
            addChatDrawable("drawableMsgStickerViews", chat_msgStickerViewsDrawable, i31);
            addChatDrawable("drawableReplyIcon", chat_replyIconDrawable, i24);
            addChatDrawable("drawableCloseIcon", chat_closeIconDrawable, i24);
            addChatDrawable("drawableMoreIcon", chat_moreIconDrawable, i24);
            addChatDrawable("drawableShareIcon", chat_shareIconDrawable, i24);
            addChatDrawable("drawableMuteIcon", chat_muteIconDrawable, key_chat_muteIcon);
            addChatDrawable("drawableLockIcon", chat_lockIconDrawable, key_chat_lockIcon);
            addChatDrawable("drawable_chat_pollHintDrawableOut", chat_pollHintDrawable[1], key_chat_outPreviewInstantText);
            addChatDrawable("drawable_chat_pollHintDrawableIn", chat_pollHintDrawable[0], key_chat_inPreviewInstantText);
            applyChatTheme(z, false);
        }
        if (z || (textPaint = chat_infoPaint) == null) {
            return;
        }
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        chat_infoBoldPaint.setTextSize(AndroidUtilities.dp(12.0f));
        chat_stickerCommentCountPaint.setTextSize(AndroidUtilities.dp(11.0f));
        chat_docNamePaint.setTextSize(AndroidUtilities.dp(15.0f));
        chat_locationTitlePaint.setTextSize(AndroidUtilities.dp(15.0f));
        chat_locationAddressPaint.setTextSize(AndroidUtilities.dp(13.0f));
        chat_audioTimePaint.setTextSize(AndroidUtilities.dp(12.0f));
        chat_livePaint.setTextSize(AndroidUtilities.dp(12.0f));
        chat_audioTitlePaint.setTextSize(AndroidUtilities.dp(16.0f));
        chat_audioPerformerPaint.setTextSize(AndroidUtilities.dp(15.0f));
        chat_botButtonPaint.setTextSize(AndroidUtilities.dp(15.0f));
        chat_contactNamePaint.setTextSize(AndroidUtilities.dp(15.0f));
        chat_contactPhonePaint.setTextSize(AndroidUtilities.dp(13.0f));
        chat_durationPaint.setTextSize(AndroidUtilities.dp(12.0f));
        float f3 = ((SharedConfig.fontSize * 2) + 10) / 3.0f;
        chat_namePaint.setTextSize(AndroidUtilities.dp(f3));
        chat_replyNamePaint.setTextSize(AndroidUtilities.dp(f3));
        chat_replyTextPaint.setTextSize(AndroidUtilities.dp(f3));
        float f4 = f3 - f;
        chat_topicTextPaint.setTextSize(AndroidUtilities.dp(f4));
        chat_forwardNamePaint.setTextSize(AndroidUtilities.dp(f3));
        chat_adminPaint.setTextSize(AndroidUtilities.dp(f4));
        chat_ephemeralPaint.setTextSize(AndroidUtilities.dp(12.0f));
        chat_timePaint.setTextSize(AndroidUtilities.dp(12.0f));
        chat_gamePaint.setTextSize(AndroidUtilities.dp(13.0f));
        chat_shipmentPaint.setTextSize(AndroidUtilities.dp(13.0f));
        chat_instantViewPaint.setTextSize(AndroidUtilities.dp(13.0f));
        chat_instantViewRectPaint.setStrokeWidth(AndroidUtilities.dp(f));
        chat_pollTimerPaint.setStrokeWidth(AndroidUtilities.dp(1.1f));
        chat_actionTextPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        chat_actionTextPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        chat_actionTextPaint3.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 3));
        chat_unlockExtendedMediaTextPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize)));
        chat_contextResult_titleTextPaint.setTextSize(AndroidUtilities.dp(15.0f));
        chat_contextResult_descriptionTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
        chat_radialProgressPaint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        chat_radialProgress2Paint.setStrokeWidth(AndroidUtilities.dp(2.33f));
        chat_commentTextPaint.setTextSize(AndroidUtilities.dp(f2));
        chat_commentTextPaint.setTypeface(AndroidUtilities.bold());
    }

    public static void applyChatTheme(boolean z, boolean z2) {
        if (chat_msgTextPaint == null || chat_msgInDrawable == null || z) {
            return;
        }
        chat_gamePaint.setColor(getColor(key_chat_previewGameText));
        chat_durationPaint.setColor(getColor(key_chat_previewDurationText));
        chat_botButtonPaint.setColor(getColor(key_chat_botButtonText));
        chat_urlPaint.setColor(getColor(key_chat_linkSelectBackground));
        chat_outUrlPaint.setColor(getColor(key_chat_outLinkSelectBackground));
        chat_textSearchSelectionPaint.setColor(getColor(key_chat_textSelectBackground));
        chat_msgErrorPaint.setColor(getColor(key_chat_sentError));
        Paint paint = chat_statusPaint;
        int i = key_chat_status;
        paint.setColor(getColor(i));
        chat_statusRecordPaint.setColor(getColor(i));
        TextPaint textPaint = chat_actionTextPaint;
        int i2 = key_chat_serviceText;
        textPaint.setColor(getColor(i2));
        chat_actionTextPaint2.setColor(getColor(i2));
        chat_actionTextPaint3.setColor(getColor(i2));
        chat_actionTextPaint.linkColor = getColor(key_chat_serviceLink);
        chat_unlockExtendedMediaTextPaint.setColor(getColor(i2));
        chat_contextResult_titleTextPaint.setColor(getColor(key_windowBackgroundWhiteBlackText));
        chat_composeBackgroundPaint.setColor(getColor(key_chat_messagePanelBackground));
        chat_timeBackgroundPaint.setColor(getColor(key_chat_mediaTimeBackground));
        setDrawableColorByKey(chat_msgNoSoundDrawable, key_chat_mediaTimeText);
        MessageDrawable messageDrawable = chat_msgInDrawable;
        int i3 = key_chat_inBubble;
        setDrawableColorByKey(messageDrawable, i3);
        MessageDrawable messageDrawable2 = chat_msgInSelectedDrawable;
        int i4 = key_chat_inBubbleSelected;
        setDrawableColorByKey(messageDrawable2, i4);
        setDrawableColorByKey(chat_msgInMediaDrawable, i3);
        setDrawableColorByKey(chat_msgInMediaSelectedDrawable, i4);
        setDrawableColorByKey(chat_msgOutCheckDrawable, key_chat_outSentCheck);
        setDrawableColorByKey(chat_msgOutCheckSelectedDrawable, key_chat_outSentCheckSelected);
        Drawable drawable = chat_msgOutCheckReadDrawable;
        int i5 = key_chat_outSentCheckRead;
        setDrawableColorByKey(drawable, i5);
        Drawable drawable2 = chat_msgOutCheckReadSelectedDrawable;
        int i6 = key_chat_outSentCheckReadSelected;
        setDrawableColorByKey(drawable2, i6);
        setDrawableColorByKey(chat_msgOutHalfCheckDrawable, i5);
        setDrawableColorByKey(chat_msgOutHalfCheckSelectedDrawable, i6);
        Drawable drawable3 = chat_msgMediaCheckDrawable;
        int i7 = key_chat_mediaSentCheck;
        setDrawableColorByKey(drawable3, i7);
        setDrawableColorByKey(chat_msgMediaHalfCheckDrawable, i7);
        setDrawableColorByKey(chat_msgStickerCheckDrawable, i2);
        setDrawableColorByKey(chat_msgStickerHalfCheckDrawable, i2);
        setDrawableColorByKey(chat_msgStickerViewsDrawable, i2);
        setDrawableColorByKey(chat_msgStickerRepliesDrawable, i2);
        setDrawableColorByKey(chat_msgUnlockDrawable, i2);
        Drawable drawable4 = chat_shareIconDrawable;
        int i8 = key_chat_serviceIcon;
        setDrawableColorByKey(drawable4, i8);
        setDrawableColorByKey(chat_replyIconDrawable, i8);
        setDrawableColorByKey(chat_goIconDrawable, i8);
        setDrawableColorByKey(chat_botInlineDrawable, i8);
        setDrawableColorByKey(chat_botWebViewDrawable, i8);
        Drawable drawable5 = chat_botLockDrawable;
        int i9 = key_chat_lockIcon;
        setDrawableColorByKey(drawable5, i9);
        setDrawableColorByKey(chat_botInviteDrawable, i8);
        setDrawableColorByKey(chat_botLinkDrawable, i8);
        Drawable drawable6 = chat_msgInViewsDrawable;
        int i10 = key_chat_inViews;
        setDrawableColorByKey(drawable6, i10);
        Drawable drawable7 = chat_msgInViewsSelectedDrawable;
        int i11 = key_chat_inViewsSelected;
        setDrawableColorByKey(drawable7, i11);
        Drawable drawable8 = chat_msgOutViewsDrawable;
        int i12 = key_chat_outViews;
        setDrawableColorByKey(drawable8, i12);
        Drawable drawable9 = chat_msgOutViewsSelectedDrawable;
        int i13 = key_chat_outViewsSelected;
        setDrawableColorByKey(drawable9, i13);
        setDrawableColorByKey(chat_msgInRepliesDrawable, i10);
        setDrawableColorByKey(chat_msgInRepliesSelectedDrawable, i11);
        setDrawableColorByKey(chat_msgOutRepliesDrawable, i12);
        setDrawableColorByKey(chat_msgOutRepliesSelectedDrawable, i13);
        setDrawableColorByKey(chat_msgInPinnedDrawable, i10);
        setDrawableColorByKey(chat_msgInPinnedSelectedDrawable, i11);
        setDrawableColorByKey(chat_msgOutPinnedDrawable, i12);
        setDrawableColorByKey(chat_msgOutPinnedSelectedDrawable, i13);
        Drawable drawable10 = chat_msgMediaPinnedDrawable;
        int i14 = key_chat_mediaViews;
        setDrawableColorByKey(drawable10, i14);
        setDrawableColorByKey(chat_msgStickerPinnedDrawable, i2);
        setDrawableColorByKey(chat_msgMediaViewsDrawable, i14);
        setDrawableColorByKey(chat_msgMediaRepliesDrawable, i14);
        setDrawableColorByKey(chat_msgInMenuDrawable, key_chat_inMenu);
        setDrawableColorByKey(chat_msgInMenuSelectedDrawable, key_chat_inMenuSelected);
        setDrawableColorByKey(chat_msgOutMenuDrawable, key_chat_outMenu);
        setDrawableColorByKey(chat_msgOutMenuSelectedDrawable, key_chat_outMenuSelected);
        setDrawableColorByKey(chat_msgMediaMenuDrawable, key_chat_mediaMenu);
        setDrawableColorByKey(chat_msgOutInstantDrawable, key_chat_outInstant);
        Drawable drawable11 = chat_msgInInstantDrawable;
        int i15 = key_chat_inInstant;
        setDrawableColorByKey(drawable11, i15);
        setDrawableColorByKey(chat_msgErrorDrawable, key_chat_sentErrorIcon);
        setDrawableColorByKey(chat_muteIconDrawable, key_chat_muteIcon);
        setDrawableColorByKey(chat_lockIconDrawable, i9);
        Drawable drawable12 = chat_inlineResultFile;
        int i16 = key_chat_inlineResultIcon;
        setDrawableColorByKey(drawable12, i16);
        setDrawableColorByKey(chat_inlineResultAudio, i16);
        setDrawableColorByKey(chat_inlineResultLocation, i16);
        setDrawableColorByKey(chat_commentDrawable, i15);
        setDrawableColorByKey(chat_commentStickerDrawable, i8);
        setDrawableColorByKey(chat_commentArrowDrawable, i15);
        Drawable drawable13 = chat_gradientLeftDrawable;
        int i17 = key_chat_stickersHintPanel;
        setDrawableColorByKey(drawable13, i17);
        setDrawableColorByKey(chat_gradientRightDrawable, i17);
        for (int i18 = 0; i18 < 2; i18++) {
            setDrawableColorByKey(chat_msgInCallDrawable[i18], key_chat_inInstant);
            setDrawableColorByKey(chat_msgInCallSelectedDrawable[i18], key_chat_inInstantSelected);
            setDrawableColorByKey(chat_msgOutCallDrawable[i18], key_chat_outInstant);
            setDrawableColorByKey(chat_msgOutCallSelectedDrawable[i18], key_chat_outInstantSelected);
        }
        setDrawableColorByKey(chat_msgCallUpGreenDrawable, key_chat_outGreenCall);
        Drawable drawable14 = chat_msgCallDownRedDrawable;
        int i19 = key_fill_RedNormal;
        setDrawableColorByKey(drawable14, i19);
        setDrawableColorByKey(chat_msgCallDownGreenDrawable, key_chat_inGreenCall);
        setDrawableColorByKey(calllog_msgCallUpRedDrawable, i19);
        Drawable drawable15 = calllog_msgCallUpGreenDrawable;
        int i20 = key_calls_callReceivedGreenIcon;
        setDrawableColorByKey(drawable15, i20);
        setDrawableColorByKey(calllog_msgCallDownRedDrawable, i19);
        setDrawableColorByKey(calllog_msgCallDownGreenDrawable, i20);
        int i21 = 0;
        while (true) {
            StatusDrawable[] statusDrawableArr = chat_status_drawables;
            if (i21 >= statusDrawableArr.length) {
                break;
            }
            setDrawableColorByKey(statusDrawableArr[i21], key_chats_actionMessage);
            i21++;
        }
        for (int i22 = 0; i22 < 5; i22++) {
            setCombinedDrawableColor(chat_fileStatesDrawable[i22][0], getColor(key_chat_inLoader), false);
            setCombinedDrawableColor(chat_fileStatesDrawable[i22][0], getColor(key_chat_inMediaIcon), true);
            setCombinedDrawableColor(chat_fileStatesDrawable[i22][1], getColor(key_chat_inLoaderSelected), false);
            setCombinedDrawableColor(chat_fileStatesDrawable[i22][1], getColor(key_chat_inMediaIconSelected), true);
        }
        setCombinedDrawableColor(chat_contactDrawable[0], getColor(key_chat_inContactBackground), false);
        setCombinedDrawableColor(chat_contactDrawable[0], getColor(key_chat_inContactIcon), true);
        setCombinedDrawableColor(chat_contactDrawable[1], getColor(key_chat_outContactBackground), false);
        setCombinedDrawableColor(chat_contactDrawable[1], getColor(key_chat_outContactIcon), true);
        setDrawableColor(chat_locationDrawable[0], getColor(key_chat_inLocationIcon));
        setDrawableColor(chat_locationDrawable[1], getColor(key_chat_outLocationIcon));
        setDrawableColor(chat_pollHintDrawable[0], getColor(key_chat_inPreviewInstantText));
        setDrawableColor(chat_pollHintDrawable[1], getColor(key_chat_outPreviewInstantText));
        setDrawableColor(chat_psaHelpDrawable[0], getColor(key_chat_inViews));
        setDrawableColor(chat_psaHelpDrawable[1], getColor(key_chat_outViews));
        setDrawableColorByKey(chat_composeShadowDrawable, key_chat_messagePanelShadow);
        setDrawableColorByKey(chat_composeShadowRoundDrawable, key_chat_messagePanelBackground);
        int color = getColor(key_chat_outAudioSeekbarFill) == -1 ? getColor(key_chat_outBubble) : -1;
        setDrawableColor(chat_pollCheckDrawable[1], color);
        setDrawableColor(chat_pollCrossDrawable[1], color);
        setDrawableColor(chat_attachEmptyDrawable, getColor(key_chat_attachEmptyImage));
        if (z2 || disallowChangeServiceMessageColor) {
            return;
        }
        applyChatServiceMessageColor();
        applyChatMessageSelectedBackgroundColor();
    }

    public static void applyChatServiceMessageColor() {
        Drawable drawable = wallpaper;
        if (drawable != null) {
            applyChatServiceMessageColor(null, null, drawable);
        }
    }

    public static boolean hasGradientService() {
        return serviceBitmapShader != null;
    }

    public static void applyServiceShaderMatrixForView(View view, View view2) {
        applyServiceShaderMatrixForView(view, view2, null);
    }

    public static void applyServiceShaderMatrixForView(View view, View view2, ResourcesProvider resourcesProvider) {
        int measuredWidth;
        if (view == null || view2 == null) {
            return;
        }
        view.getLocationOnScreen(viewPos);
        int[] iArr = viewPos;
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationOnScreen(iArr);
        if (view2 instanceof ThemePreviewActivity.BackgroundView) {
            Bitmap bitmap = serviceBitmap;
            if (bitmap != null) {
                float width = bitmap.getWidth();
                measuredWidth = (int) (i + (((view2.getMeasuredWidth() - (width * Math.max(view2.getMeasuredWidth() / width, view2.getMeasuredHeight() / serviceBitmap.getHeight()))) / 2.0f) - ((ThemePreviewActivity.BackgroundView) view2).tx));
            } else {
                measuredWidth = (int) (i + (-((ThemePreviewActivity.BackgroundView) view2).tx));
            }
            i = measuredWidth;
            i2 = (int) (i2 + (-((ThemePreviewActivity.BackgroundView) view2).ty));
        }
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(view2.getMeasuredWidth(), view2.getMeasuredHeight(), i, i2 - viewPos[1]);
        } else {
            applyServiceShaderMatrix(view2.getMeasuredWidth(), view2.getMeasuredHeight(), i, i2 - viewPos[1]);
        }
    }

    public static void applyServiceShaderMatrix(int i, int i2, float f, float f2) {
        applyServiceShaderMatrix(serviceBitmap, serviceBitmapShader, serviceBitmapMatrix, i, i2, f, f2);
    }

    public static void applyServiceShaderMatrix(Bitmap bitmap, BitmapShader bitmapShader, Matrix matrix, int i, int i2, float f, float f2) {
        if (bitmapShader == null || matrix == null) {
            return;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float f3 = i;
        float f4 = i2;
        float fMax = Math.max(f3 / width, f4 / height);
        matrix.reset();
        matrix.setTranslate(((f3 - (width * fMax)) / 2.0f) - f, ((f4 - (height * fMax)) / 2.0f) - f2);
        matrix.preScale(fMax, fMax);
        bitmapShader.setLocalMatrix(matrix);
    }

    public static void applyChatServiceMessageColor(int[] iArr, Drawable drawable, Drawable drawable2) {
        int iValueAt;
        int i;
        int iValueAt2;
        Bitmap bitmapCheckBlur;
        if (chat_actionBackgroundPaint == null) {
            return;
        }
        serviceMessageColor = serviceMessageColorBackup;
        serviceSelectedMessageColor = serviceSelectedMessageColorBackup;
        if (iArr != null && iArr.length >= 2) {
            i = iArr[0];
            iValueAt2 = iArr[1];
            serviceMessageColor = i;
            serviceSelectedMessageColor = iValueAt2;
        } else {
            int iIndexOfKey = currentColors.indexOfKey(key_chat_serviceBackground);
            if (iIndexOfKey >= 0) {
                iValueAt = currentColors.valueAt(iIndexOfKey);
            } else {
                iValueAt = serviceMessageColor;
            }
            i = iValueAt;
            int iIndexOfKey2 = currentColors.indexOfKey(key_chat_serviceBackgroundSelected);
            if (iIndexOfKey2 >= 0) {
                iValueAt2 = currentColors.valueAt(iIndexOfKey2);
            } else {
                iValueAt2 = serviceSelectedMessageColor;
            }
        }
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z = drawable instanceof MotionBackgroundDrawable;
        if ((z || (drawable instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32)) {
            if (z) {
                bitmapCheckBlur = ((MotionBackgroundDrawable) drawable).getBitmap();
            } else {
                bitmapCheckBlur = drawable instanceof BitmapDrawable ? checkBlur(drawable) : null;
            }
            if (serviceBitmap != bitmapCheckBlur) {
                serviceBitmap = bitmapCheckBlur;
                Bitmap bitmap = serviceBitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                serviceBitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                if (Build.VERSION.SDK_INT >= 33) {
                    serviceBitmapShader.setFilterMode(2);
                }
                if (serviceBitmapMatrix == null) {
                    serviceBitmapMatrix = new Matrix();
                }
            }
            setDrawableColor(chat_msgStickerPinnedDrawable, -1);
            setDrawableColor(chat_msgStickerCheckDrawable, -1);
            setDrawableColor(chat_msgStickerHalfCheckDrawable, -1);
            setDrawableColor(chat_msgStickerViewsDrawable, -1);
            setDrawableColor(chat_msgStickerRepliesDrawable, -1);
            chat_actionTextPaint.setColor(-1);
            chat_actionTextPaint2.setColor(-1);
            chat_actionTextPaint3.setColor(-1);
            chat_actionTextPaint.linkColor = -1;
            chat_unlockExtendedMediaTextPaint.setColor(-1);
            chat_botButtonPaint.setColor(-1);
            setDrawableColor(chat_commentStickerDrawable, -1);
            setDrawableColor(chat_shareIconDrawable, -1);
            setDrawableColor(chat_replyIconDrawable, -1);
            setDrawableColor(chat_goIconDrawable, -1);
            setDrawableColor(chat_botInlineDrawable, -1);
            setDrawableColor(chat_botWebViewDrawable, -1);
            setDrawableColor(chat_botLockDrawable, -1);
            setDrawableColor(chat_botInviteDrawable, -1);
            setDrawableColor(chat_botLinkDrawable, -1);
        } else {
            serviceBitmap = null;
            serviceBitmapShader = null;
            Drawable drawable3 = chat_msgStickerPinnedDrawable;
            int i2 = key_chat_serviceText;
            setDrawableColorByKey(drawable3, i2);
            setDrawableColorByKey(chat_msgStickerCheckDrawable, i2);
            setDrawableColorByKey(chat_msgStickerHalfCheckDrawable, i2);
            setDrawableColorByKey(chat_msgStickerViewsDrawable, i2);
            setDrawableColorByKey(chat_msgStickerRepliesDrawable, i2);
            chat_actionTextPaint.setColor(getColor(i2));
            chat_actionTextPaint2.setColor(getColor(i2));
            chat_actionTextPaint.linkColor = getColor(key_chat_serviceLink);
            chat_unlockExtendedMediaTextPaint.setColor(getColor(i2));
            Drawable drawable4 = chat_commentStickerDrawable;
            int i3 = key_chat_serviceIcon;
            setDrawableColorByKey(drawable4, i3);
            setDrawableColorByKey(chat_shareIconDrawable, i3);
            setDrawableColorByKey(chat_replyIconDrawable, i3);
            setDrawableColorByKey(chat_goIconDrawable, i3);
            setDrawableColorByKey(chat_botInlineDrawable, i3);
            setDrawableColorByKey(chat_botWebViewDrawable, i3);
            setDrawableColorByKey(chat_botLockDrawable, i3);
            setDrawableColorByKey(chat_botInviteDrawable, i3);
            setDrawableColorByKey(chat_botLinkDrawable, i3);
            chat_botButtonPaint.setColor(getColor(key_chat_botButtonText));
        }
        chat_actionBackgroundPaint.setColor(i);
        chat_actionBackgroundSelectedPaint.setColor(iValueAt2);
        currentColor = i;
        if (serviceBitmapShader != null && (currentColors.indexOfKey(key_chat_serviceBackground) < 0 || z || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix = new ColorMatrix();
            if (z) {
                if (((MotionBackgroundDrawable) drawable).getIntensity() >= 0.0f) {
                    colorMatrix.setSaturation(1.6f);
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, isCurrentThemeDark() ? 0.97f : 0.92f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, isCurrentThemeDark() ? 0.12f : -0.06f);
                } else {
                    colorMatrix.setSaturation(1.1f);
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, isCurrentThemeDark() ? 0.4f : 0.8f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, isCurrentThemeDark() ? 0.08f : -0.06f);
                }
            } else {
                colorMatrix.setSaturation(1.6f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, isCurrentThemeDark() ? 0.9f : 0.84f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, isCurrentThemeDark() ? -0.04f : 0.06f);
            }
            chat_actionBackgroundPaint.setFilterBitmap(true);
            chat_actionBackgroundPaint.setShader(serviceBitmapShader);
            chat_actionBackgroundPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            chat_actionBackgroundPaint.setAlpha(255);
            chat_actionBackgroundSelectedPaint.setFilterBitmap(true);
            chat_actionBackgroundSelectedPaint.setShader(serviceBitmapShader);
            ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, 0.26f);
            isCurrentThemeDark();
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix2, 0.92f);
            chat_actionBackgroundSelectedPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
            chat_actionBackgroundSelectedPaint.setAlpha(255);
            chat_actionBackgroundGradientDarkenPaint.setAlpha(0);
            return;
        }
        chat_actionBackgroundPaint.setColorFilter(null);
        chat_actionBackgroundPaint.setShader(null);
        chat_actionBackgroundSelectedPaint.setColorFilter(null);
        chat_actionBackgroundSelectedPaint.setShader(null);
        chat_actionBackgroundGradientDarkenPaint.setAlpha(21);
    }

    private static Bitmap checkBlur(Drawable drawable) {
        WeakReference weakReference = lastDrawableToBlur;
        if (weakReference != null && weakReference.get() == drawable) {
            return blurredBitmap;
        }
        WeakReference weakReference2 = lastDrawableToBlur;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        lastDrawableToBlur = null;
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            blurredBitmap = null;
            return null;
        }
        lastDrawableToBlur = new WeakReference(drawable);
        int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) * 24.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, 24, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, intrinsicWidth, 24);
        ColorFilter colorFilter = drawable.getColorFilter();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1.3f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.94f);
        drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setColorFilter(colorFilter);
        Utilities.blurBitmap(bitmapCreateBitmap, 3);
        blurredBitmap = bitmapCreateBitmap;
        return bitmapCreateBitmap;
    }

    public static void applyChatMessageSelectedBackgroundColor() {
        applyChatMessageSelectedBackgroundColor(null, wallpaper);
    }

    public static void applyChatMessageSelectedBackgroundColor(Drawable drawable, Drawable drawable2) {
        Bitmap bitmap;
        if (chat_messageBackgroundSelectedPaint == null) {
            return;
        }
        int i = currentColors.get(key_chat_selectedBackground);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z = (drawable instanceof MotionBackgroundDrawable) && SharedConfig.getDevicePerformanceClass() != 0 && i == 0;
        if (z && serviceBitmap != (bitmap = ((MotionBackgroundDrawable) drawable).getBitmap())) {
            serviceBitmap = bitmap;
            Bitmap bitmap2 = serviceBitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            serviceBitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
            if (serviceBitmapMatrix == null) {
                serviceBitmapMatrix = new Matrix();
            }
        }
        if (serviceBitmapShader != null && i == 0 && z) {
            ColorMatrix colorMatrix = new ColorMatrix();
            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 2.5f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.75f);
            chat_messageBackgroundSelectedPaint.setShader(serviceBitmapShader);
            chat_messageBackgroundSelectedPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            chat_messageBackgroundSelectedPaint.setAlpha(64);
            return;
        }
        Paint paint = chat_messageBackgroundSelectedPaint;
        if (i == 0) {
            i = 1073741824;
        }
        paint.setColor(i);
        chat_messageBackgroundSelectedPaint.setColorFilter(null);
        chat_messageBackgroundSelectedPaint.setShader(null);
    }

    public static void createProfileResources(Context context) {
        if (profile_verifiedDrawable == null) {
            profile_aboutTextPaint = new TextPaint(1);
            Resources resources = context.getResources();
            profile_verifiedDrawable = resources.getDrawable(R.drawable.verified_area).mutate();
            profile_verifiedCheckDrawable = resources.getDrawable(R.drawable.verified_check).mutate();
            applyProfileTheme();
        }
        profile_aboutTextPaint.setTextSize(AndroidUtilities.dp(16.0f));
    }

    public static void applyProfileTheme() {
        if (profile_verifiedDrawable == null) {
            return;
        }
        profile_aboutTextPaint.setColor(getColor(key_windowBackgroundWhiteBlackText));
        profile_aboutTextPaint.linkColor = getColor(key_windowBackgroundWhiteLinkText);
        setDrawableColorByKey(profile_verifiedDrawable, key_profile_verifiedBackground);
        setDrawableColorByKey(profile_verifiedCheckDrawable, key_profile_verifiedCheck);
    }

    public static Drawable getThemedDrawableByKey(Context context, int i, int i2, ResourcesProvider resourcesProvider) {
        return getThemedDrawable(context, i, getColor(i2, resourcesProvider));
    }

    public static Drawable getThemedDrawableByKey(Context context, int i, int i2) {
        return getThemedDrawable(context, i, getColor(i2));
    }

    public static Drawable getThemedDrawable(Context context, int i, int i2) {
        if (context == null) {
            return null;
        }
        Drawable drawableMutate = context.getResources().getDrawable(i).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
        return drawableMutate;
    }

    public static int getDefaultColor(int i) {
        int i2 = defaultColors[i];
        if (i2 != 0) {
            return i2;
        }
        int i3 = fallbackKeys.get(i, -1);
        if (i3 != -1) {
            return getDefaultColor(i3);
        }
        return (isMyMessagesBubbles(i) || i == key_chats_menuTopShadow || i == key_chats_menuTopBackground || i == key_chats_menuTopShadowCats || i == key_chat_wallpaper_gradient_to2 || i == key_chat_wallpaper_gradient_to3) ? 0 : -65536;
    }

    public static boolean hasThemeKey(int i) {
        return currentColors.indexOfKey(i) >= 0;
    }

    public static void setAnimatingColor(boolean z) {
        animatingColors = z ? new SparseIntArray() : null;
    }

    public static boolean isAnimatingColor() {
        return animatingColors != null;
    }

    public static void setAnimatedColor(int i, int i2) {
        SparseIntArray sparseIntArray = animatingColors;
        if (sparseIntArray == null) {
            return;
        }
        sparseIntArray.put(i, i2);
    }

    public static int getDefaultAccentColor(int i) {
        int iIndexOfKey = currentColorsNoAccent.indexOfKey(i);
        if (iIndexOfKey < 0) {
            return 0;
        }
        int iValueAt = currentColorsNoAccent.valueAt(iIndexOfKey);
        ThemeAccent accent = currentTheme.getAccent(false);
        if (accent == null) {
            return 0;
        }
        float[] tempHsv = getTempHsv(1);
        float[] tempHsv2 = getTempHsv(2);
        Color.colorToHSV(currentTheme.accentBaseColor, tempHsv);
        Color.colorToHSV(accent.accentColor, tempHsv2);
        return changeColorAccent(tempHsv, tempHsv2, iValueAt, currentTheme.isDark(), iValueAt);
    }

    public static int getNonAnimatedColor(int i) {
        return getColor(i, null, true);
    }

    public static int getColor(int i, ResourcesProvider resourcesProvider) {
        if (resourcesProvider != null) {
            return resourcesProvider.getColor(i);
        }
        return getColor(i);
    }

    public static int getCurrentColor(int i) {
        return currentColors.get(i);
    }

    public static int getColor(int i) {
        return getColor(i, null, false);
    }

    public static int getColor(int i, boolean[] zArr) {
        return getColor(i, zArr, false);
    }

    public static int getColor(int i, boolean[] zArr, boolean z) {
        int iIndexOfKey;
        boolean zIsDefaultMainAccent;
        SparseIntArray sparseIntArray;
        int iIndexOfKey2;
        if (!z && (sparseIntArray = animatingColors) != null && (iIndexOfKey2 = sparseIntArray.indexOfKey(i)) >= 0) {
            return animatingColors.valueAt(iIndexOfKey2);
        }
        if (serviceBitmapShader != null && (key_chat_serviceText == i || key_chat_serviceLink == i || key_chat_serviceIcon == i || key_chat_stickerReplyLine == i || key_chat_stickerReplyNameText == i || key_chat_stickerReplyMessageText == i)) {
            return -1;
        }
        if (currentTheme == defaultTheme) {
            if (isMyMessagesBubbles(i)) {
                zIsDefaultMainAccent = currentTheme.isDefaultMyMessagesBubbles();
            } else if (isMyMessages(i)) {
                zIsDefaultMainAccent = currentTheme.isDefaultMyMessages();
            } else {
                zIsDefaultMainAccent = (key_chat_wallpaper == i || key_chat_wallpaper_gradient_to1 == i || key_chat_wallpaper_gradient_to2 == i || key_chat_wallpaper_gradient_to3 == i) ? false : currentTheme.isDefaultMainAccent();
            }
            if (zIsDefaultMainAccent) {
                if (i == key_chat_serviceBackground) {
                    return serviceMessageColor;
                }
                if (i == key_chat_serviceBackgroundSelected) {
                    return serviceSelectedMessageColor;
                }
                return getDefaultColor(i);
            }
        }
        int iIndexOfKey3 = currentColors.indexOfKey(i);
        if (iIndexOfKey3 < 0) {
            int i2 = fallbackKeys.get(i, -1);
            if (i2 != -1 && (iIndexOfKey = currentColors.indexOfKey(i2)) >= 0) {
                return currentColors.valueAt(iIndexOfKey);
            }
            if (zArr != null) {
                zArr[0] = true;
            }
            if (i == key_chat_serviceBackground) {
                return serviceMessageColor;
            }
            if (i == key_chat_serviceBackgroundSelected) {
                return serviceSelectedMessageColor;
            }
            return getDefaultColor(i);
        }
        int iValueAt = currentColors.valueAt(iIndexOfKey3);
        return (key_windowBackgroundWhite == i || key_windowBackgroundGray == i || key_actionBarDefault == i || key_actionBarDefaultArchived == i) ? (-16777216) | iValueAt : iValueAt;
    }

    private static boolean isMyMessagesBubbles(int i) {
        return i >= myMessagesBubblesStartIndex && i < myMessagesBubblesEndIndex;
    }

    private static boolean isMyMessages(int i) {
        return i >= myMessagesStartIndex && i < myMessagesEndIndex;
    }

    public static void setColor(int i, int i2, boolean z) {
        int i3 = key_chat_wallpaper;
        if (i == i3 || i == key_chat_wallpaper_gradient_to1 || i == key_chat_wallpaper_gradient_to2 || i == key_chat_wallpaper_gradient_to3 || i == key_windowBackgroundWhite || i == key_windowBackgroundGray || i == key_actionBarDefault || i == key_actionBarDefaultArchived) {
            i2 |= -16777216;
        }
        if (z) {
            currentColors.delete(i);
        } else {
            currentColors.put(i, i2);
        }
        if (i == key_chat_selectedBackground) {
            applyChatMessageSelectedBackgroundColor();
            return;
        }
        if (i == key_chat_serviceBackground || i == key_chat_serviceBackgroundSelected) {
            applyChatServiceMessageColor();
            return;
        }
        if (i == i3 || i == key_chat_wallpaper_gradient_to1 || i == key_chat_wallpaper_gradient_to2 || i == key_chat_wallpaper_gradient_to3 || i == key_chat_wallpaper_gradient_rotation) {
            reloadWallpaper(true);
            return;
        }
        if (i == key_actionBarDefault) {
            if (Build.VERSION.SDK_INT >= 23) {
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        } else {
            if (i != key_windowBackgroundGray || Build.VERSION.SDK_INT < 26) {
                return;
            }
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
    }

    public static void setDefaultColor(int i, int i2) {
        defaultColors[i] = i2;
    }

    public static void setThemeWallpaper(ThemeInfo themeInfo, Bitmap bitmap, File file) throws Throwable {
        currentColors.delete(key_chat_wallpaper);
        currentColors.delete(key_chat_wallpaper_gradient_to1);
        currentColors.delete(key_chat_wallpaper_gradient_to2);
        currentColors.delete(key_chat_wallpaper_gradient_to3);
        currentColors.delete(key_chat_wallpaper_gradient_rotation);
        themedWallpaperLink = null;
        themeInfo.setOverrideWallpaper(null);
        if (bitmap != null) {
            themedWallpaper = new BitmapDrawable(bitmap);
            saveCurrentTheme(themeInfo, false, false, false);
            calcBackgroundColor(themedWallpaper, 0);
            applyChatServiceMessageColor();
            applyChatMessageSelectedBackgroundColor();
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.didSetNewWallpapper, new Object[0]);
            return;
        }
        themedWallpaper = null;
        wallpaper = null;
        saveCurrentTheme(themeInfo, false, false, false);
        reloadWallpaper(true);
    }

    public static void setDrawableColor(Drawable drawable, int i) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof StatusDrawable) {
            ((StatusDrawable) drawable).setColor(i);
            return;
        }
        if (drawable instanceof MsgClockDrawable) {
            ((MsgClockDrawable) drawable).setColor(i);
            return;
        }
        if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(i);
        } else if (drawable instanceof ScamDrawable) {
            ((ScamDrawable) drawable).setColor(i);
        } else {
            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        }
    }

    public static void setDrawableColorByKey(Drawable drawable, int i) {
        setDrawableColor(drawable, getColor(i));
    }

    public static void setEmojiDrawableColor(Drawable drawable, int i, boolean z) {
        Drawable stateDrawable;
        if (drawable instanceof StateListDrawable) {
            try {
                if (z) {
                    stateDrawable = getStateDrawable(drawable, 0);
                } else {
                    stateDrawable = getStateDrawable(drawable, 1);
                }
                if (stateDrawable instanceof ShapeDrawable) {
                    ((ShapeDrawable) stateDrawable).getPaint().setColor(i);
                } else {
                    stateDrawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void setRippleDrawableForceSoftware(RippleDrawable rippleDrawable) {
        if (rippleDrawable == null) {
            return;
        }
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(rippleDrawable, Boolean.TRUE);
        } catch (Throwable unused) {
        }
    }

    public static boolean setSelectorDrawableColor(Drawable drawable, int i, boolean z) {
        Drawable stateDrawable;
        boolean z2;
        boolean z3 = true;
        if (drawable instanceof StateListDrawable) {
            try {
                if (z) {
                    Drawable stateDrawable2 = getStateDrawable(drawable, 0);
                    if (stateDrawable2 instanceof ShapeDrawable) {
                        z2 = ((ShapeDrawable) stateDrawable2).getPaint().getColor() != i;
                        try {
                            ((ShapeDrawable) stateDrawable2).getPaint().setColor(i);
                        } catch (Throwable unused) {
                            return z2;
                        }
                    } else {
                        stateDrawable2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                        z2 = false;
                    }
                    stateDrawable = getStateDrawable(drawable, 1);
                } else {
                    stateDrawable = getStateDrawable(drawable, 2);
                    z2 = false;
                }
                if (stateDrawable instanceof ShapeDrawable) {
                    if (((ShapeDrawable) stateDrawable).getPaint().getColor() == i && !z2) {
                        z3 = false;
                    }
                    try {
                        ((ShapeDrawable) stateDrawable).getPaint().setColor(i);
                        return z3;
                    } catch (Throwable unused2) {
                        return z3;
                    }
                }
                stateDrawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                return z2;
            } catch (Throwable unused3) {
                return false;
            }
        }
        if (drawable instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) drawable;
            if (z) {
                rippleDrawable.setColor(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i}));
                return false;
            }
            if (rippleDrawable.getNumberOfLayers() > 0) {
                Drawable drawable2 = rippleDrawable.getDrawable(0);
                if (drawable2 instanceof ShapeDrawable) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) drawable2;
                    z3 = shapeDrawable.getPaint().getColor() != i;
                    shapeDrawable.getPaint().setColor(i);
                    return z3;
                }
                drawable2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
            }
        }
        return false;
    }

    public static boolean isThemeWallpaperPublic() {
        return !TextUtils.isEmpty(themedWallpaperLink);
    }

    public static boolean hasWallpaperFromTheme() {
        ThemeInfo themeInfo = currentTheme;
        if (themeInfo.firstAccentIsDefault && themeInfo.currentAccentId == DEFALT_THEME_ACCENT_ID) {
            return false;
        }
        return currentColors.indexOfKey(key_chat_wallpaper) >= 0 || themedWallpaperFileOffset > 0 || !TextUtils.isEmpty(themedWallpaperLink);
    }

    public static boolean isCustomTheme() {
        return isCustomTheme;
    }

    public static void reloadWallpaper(boolean z) {
        BackgroundGradientDrawable.Disposable disposable = backgroundGradientDisposable;
        if (disposable != null) {
            disposable.dispose();
            backgroundGradientDisposable = null;
        }
        Drawable drawable = wallpaper;
        if (drawable instanceof MotionBackgroundDrawable) {
            previousPhase = ((MotionBackgroundDrawable) drawable).getPhase();
        } else {
            previousPhase = 0;
        }
        wallpaper = null;
        themedWallpaper = null;
        loadWallpaper(z);
    }

    private static void calcBackgroundColor(Drawable drawable, int i) {
        if (i != 2) {
            int[] iArrCalcDrawableColor = AndroidUtilities.calcDrawableColor(drawable);
            int i2 = iArrCalcDrawableColor[0];
            serviceMessageColorBackup = i2;
            serviceMessageColor = i2;
            int i3 = iArrCalcDrawableColor[1];
            serviceSelectedMessageColorBackup = i3;
            serviceSelectedMessageColor = i3;
        }
    }

    public static int getServiceMessageColor() {
        int iIndexOfKey = currentColors.indexOfKey(key_chat_serviceBackground);
        if (iIndexOfKey >= 0) {
            return currentColors.valueAt(iIndexOfKey);
        }
        return serviceMessageColor;
    }

    public static void loadWallpaper(boolean z) {
        File file;
        TLRPC.Document document;
        boolean z2;
        float f;
        float f2;
        final int i;
        Drawable drawableLoadWallpaperInternal;
        TLRPC.WallPaper wallPaper;
        if (wallpaper != null) {
            return;
        }
        ThemeInfo themeInfo = currentTheme;
        boolean z3 = themeInfo.firstAccentIsDefault && themeInfo.currentAccentId == DEFALT_THEME_ACCENT_ID;
        ThemeAccent accent = themeInfo.getAccent(false);
        if (accent != null) {
            File pathToWallpaper = accent.getPathToWallpaper();
            z2 = accent.patternMotion;
            TLRPC.TL_theme tL_theme = accent.info;
            TLRPC.ThemeSettings themeSettings = (tL_theme == null || tL_theme.settings.size() <= 0) ? null : accent.info.settings.get(0);
            document = (accent.info == null || themeSettings == null || (wallPaper = themeSettings.wallpaper) == null) ? null : wallPaper.document;
            file = pathToWallpaper;
        } else {
            file = null;
            document = null;
            z2 = false;
        }
        ThemeInfo themeInfo2 = currentTheme;
        final File file2 = file;
        final OverrideWallpaperInfo overrideWallpaperInfo = themeInfo2.overrideWallpaper;
        if (overrideWallpaperInfo == null) {
            if (accent != null) {
                f2 = accent.patternIntensity;
            } else {
                f = themeInfo2.patternIntensity;
            }
            i = (int) f;
            if (z) {
                DispatchQueue dispatchQueue = Utilities.themeQueue;
                final boolean z4 = z3;
                final TLRPC.Document document2 = document;
                final boolean z5 = z2;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        Theme.$r8$lambda$gvgZQHt_aksR0W7l4hMLnrufm7A(overrideWallpaperInfo, file2, i, z5, document2, z4);
                    }
                };
                wallpaperLoadTask = runnable;
                dispatchQueue.postRunnable(runnable);
                return;
            }
            drawableLoadWallpaperInternal = loadWallpaperInternal(overrideWallpaperInfo, file2, i, z2, document, z3);
            createCommonChatResources();
            if (!disallowChangeServiceMessageColor) {
                applyChatServiceMessageColor(null, null, drawableLoadWallpaperInternal);
                applyChatMessageSelectedBackgroundColor(null, drawableLoadWallpaperInternal);
            }
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.didSetNewWallpapper, new Object[0]);
        }
        f2 = overrideWallpaperInfo.intensity;
        f = f2 * 100.0f;
        i = (int) f;
        if (z) {
            DispatchQueue dispatchQueue2 = Utilities.themeQueue;
            final boolean z6 = z3;
            final TLRPC.Document document3 = document;
            final boolean z7 = z2;
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    Theme.$r8$lambda$gvgZQHt_aksR0W7l4hMLnrufm7A(overrideWallpaperInfo, file2, i, z7, document3, z6);
                }
            };
            wallpaperLoadTask = runnable2;
            dispatchQueue2.postRunnable(runnable2);
            return;
        }
        drawableLoadWallpaperInternal = loadWallpaperInternal(overrideWallpaperInfo, file2, i, z2, document, z3);
        createCommonChatResources();
        if (!disallowChangeServiceMessageColor) {
            applyChatServiceMessageColor(null, null, drawableLoadWallpaperInternal);
            applyChatMessageSelectedBackgroundColor(null, drawableLoadWallpaperInternal);
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.didSetNewWallpapper, new Object[0]);
    }

    public static void $r8$lambda$gvgZQHt_aksR0W7l4hMLnrufm7A(OverrideWallpaperInfo overrideWallpaperInfo, File file, int i, boolean z, TLRPC.Document document, boolean z2) {
        final Drawable drawableLoadWallpaperInternal = loadWallpaperInternal(overrideWallpaperInfo, file, i, z, document, z2);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                Theme.$r8$lambda$Mu0Qxx9lco6NYPpjphkArSoB7e8(drawableLoadWallpaperInternal);
            }
        });
    }

    public static void $r8$lambda$Mu0Qxx9lco6NYPpjphkArSoB7e8(Drawable drawable) {
        wallpaperLoadTask = null;
        createCommonChatResources();
        if (!disallowChangeServiceMessageColor) {
            applyChatServiceMessageColor(null, null, drawable);
            applyChatMessageSelectedBackgroundColor(null, drawable);
        }
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.didSetNewWallpapper, new Object[0]);
    }

    private static Drawable loadWallpaperInternal(OverrideWallpaperInfo overrideWallpaperInfo, File file, int i, boolean z, TLRPC.Document document, boolean z2) {
        BackgroundDrawableSettings backgroundDrawableSettingsCreateBackgroundDrawable = createBackgroundDrawable(currentTheme, overrideWallpaperInfo, currentColors, file, themedWallpaperLink, themedWallpaperFileOffset, i, previousPhase, z2, hasPreviousTheme, isApplyingAccent, z, document, false);
        Boolean bool = backgroundDrawableSettingsCreateBackgroundDrawable.isWallpaperMotion;
        isWallpaperMotion = bool != null ? bool.booleanValue() : isWallpaperMotion;
        Boolean bool2 = backgroundDrawableSettingsCreateBackgroundDrawable.isPatternWallpaper;
        isPatternWallpaper = bool2 != null ? bool2.booleanValue() : isPatternWallpaper;
        Boolean bool3 = backgroundDrawableSettingsCreateBackgroundDrawable.isCustomTheme;
        isCustomTheme = bool3 != null ? bool3.booleanValue() : isCustomTheme;
        patternIntensity = i;
        Drawable drawable = backgroundDrawableSettingsCreateBackgroundDrawable.wallpaper;
        wallpaper = drawable != null ? drawable : wallpaper;
        calcBackgroundColor(drawable, 1);
        applyChatServiceMessageColor();
        return drawable;
    }

    public static BackgroundDrawableSettings createBackgroundDrawable(ThemeInfo themeInfo, SparseIntArray sparseIntArray, String str, int i, boolean z) {
        float f;
        float f2;
        boolean z2 = themeInfo.firstAccentIsDefault && themeInfo.currentAccentId == DEFALT_THEME_ACCENT_ID;
        ThemeAccent accent = themeInfo.getAccent(false);
        File pathToWallpaper = accent != null ? accent.getPathToWallpaper() : null;
        boolean z3 = accent != null && accent.patternMotion;
        OverrideWallpaperInfo overrideWallpaperInfo = themeInfo.overrideWallpaper;
        if (overrideWallpaperInfo != null) {
            f2 = overrideWallpaperInfo.intensity;
        } else {
            if (accent != null) {
                f2 = accent.patternIntensity;
            } else {
                f = themeInfo.patternIntensity;
            }
            return createBackgroundDrawable(themeInfo, overrideWallpaperInfo, sparseIntArray, pathToWallpaper, str, currentColorsNoAccent.get(key_wallpaperFileOffset, -1), (int) f, i, z2, false, false, z3, null, z);
        }
        f = f2 * 100.0f;
        return createBackgroundDrawable(themeInfo, overrideWallpaperInfo, sparseIntArray, pathToWallpaper, str, currentColorsNoAccent.get(key_wallpaperFileOffset, -1), (int) f, i, z2, false, false, z3, null, z);
    }

    public static BackgroundDrawableSettings createBackgroundDrawable(ThemeInfo themeInfo, OverrideWallpaperInfo overrideWallpaperInfo, SparseIntArray sparseIntArray, File file, String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, TLRPC.Document document, boolean z5) {
        int height;
        int iMin;
        Bitmap bitmapLoadScreenSizedBitmap;
        Bitmap bitmapLoadScreenSizedBitmap2;
        boolean z6;
        File file2;
        Bitmap bitmap;
        Bitmap bitmap2;
        BackgroundDrawableSettings backgroundDrawableSettings = new BackgroundDrawableSettings();
        backgroundDrawableSettings.wallpaper = z5 ? null : wallpaper;
        boolean z7 = (!z2 || z3) && overrideWallpaperInfo != null;
        if (overrideWallpaperInfo != null) {
            backgroundDrawableSettings.isWallpaperMotion = Boolean.valueOf(overrideWallpaperInfo.isMotion);
            backgroundDrawableSettings.isPatternWallpaper = Boolean.valueOf((overrideWallpaperInfo.color == 0 || overrideWallpaperInfo.isDefault() || overrideWallpaperInfo.isColor()) ? false : true);
        } else {
            backgroundDrawableSettings.isWallpaperMotion = Boolean.valueOf(themeInfo.isMotion);
            backgroundDrawableSettings.isPatternWallpaper = Boolean.valueOf(themeInfo.patternBgColor != 0);
        }
        if (!z7) {
            int i4 = z ? 0 : sparseIntArray.get(key_chat_wallpaper);
            int i5 = sparseIntArray.get(key_chat_wallpaper_gradient_to3);
            int i6 = sparseIntArray.get(key_chat_wallpaper_gradient_to2);
            int i7 = sparseIntArray.get(key_chat_wallpaper_gradient_to1);
            if (file == null || !file.exists()) {
                z6 = false;
            } else {
                try {
                    if (i4 != 0 && i7 != 0 && i6 != 0) {
                        MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable(i4, i7, i6, i5, false);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        Bitmap.Config config = Bitmap.Config.ALPHA_8;
                        options.inPreferredConfig = config;
                        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                        if (bitmapDecodeFile != null && bitmapDecodeFile.getConfig() != config) {
                            Bitmap bitmapCopy = bitmapDecodeFile.copy(config, false);
                            bitmapDecodeFile.recycle();
                            bitmapDecodeFile = bitmapCopy;
                        }
                        z6 = bitmapDecodeFile != null;
                        try {
                            motionBackgroundDrawable.setPatternBitmap(i2, bitmapDecodeFile);
                            motionBackgroundDrawable.setPatternColorFilter(motionBackgroundDrawable.getPatternColor());
                            backgroundDrawableSettings.wallpaper = motionBackgroundDrawable;
                        } catch (Throwable th) {
                            th = th;
                            FileLog.e(th);
                        }
                    } else {
                        backgroundDrawableSettings.wallpaper = Drawable.createFromPath(file.getAbsolutePath());
                        z6 = true;
                    }
                    backgroundDrawableSettings.isWallpaperMotion = Boolean.valueOf(z4);
                    Boolean bool = Boolean.TRUE;
                    backgroundDrawableSettings.isPatternWallpaper = bool;
                    backgroundDrawableSettings.isCustomTheme = bool;
                } catch (Throwable th2) {
                    th = th2;
                    z6 = true;
                }
            }
            if (!z6) {
                if (i4 != 0) {
                    int i8 = sparseIntArray.get(key_chat_wallpaper_gradient_rotation, -1);
                    if (i8 == -1) {
                        i8 = 45;
                    }
                    if (i7 == 0 || i6 == 0) {
                        int i9 = i4;
                        if (i7 == 0 || i7 == i9) {
                            backgroundDrawableSettings.wallpaper = new ColorDrawable(i9);
                        } else {
                            BackgroundGradientDrawable backgroundGradientDrawable = new BackgroundGradientDrawable(BackgroundGradientDrawable.getGradientOrientation(i8), new int[]{i9, i7});
                            backgroundGradientDisposable = backgroundGradientDrawable.startDithering(BackgroundGradientDrawable.Sizes.ofDeviceScreen(), new BackgroundGradientDrawable.ListenerAdapter() {
                                @Override
                                public void onSizeReady(int i10, int i11) {
                                    Point point = AndroidUtilities.displaySize;
                                    if ((point.x <= point.y) == (i10 <= i11)) {
                                        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.didSetNewWallpapper, new Object[0]);
                                    }
                                }
                            }, 100L);
                            backgroundDrawableSettings.wallpaper = backgroundGradientDrawable;
                        }
                    } else {
                        MotionBackgroundDrawable motionBackgroundDrawable2 = new MotionBackgroundDrawable(i4, i7, i6, i5, false);
                        if (file != null) {
                            Point point = AndroidUtilities.displaySize;
                            int iMin2 = Math.min(point.x, point.y);
                            Point point2 = AndroidUtilities.displaySize;
                            int iMax = Math.max(point2.x, point2.y);
                            if (document != null) {
                                bitmap2 = SvgHelper.getBitmap(FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true), iMin2, iMax, false, SvgHelper.ScaleMode.ByWidth);
                            } else {
                                bitmap2 = SvgHelper.getBitmap(R.raw.default_pattern, iMin2, iMax, -1, 1.0f, SvgHelper.ScaleMode.ByWidth);
                            }
                            bitmap = bitmap2;
                            if (bitmap != null) {
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                    Bitmap bitmapCopy2 = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                                    bitmapCopy2.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
                                    bitmapCopy2.recycle();
                                    fileOutputStream.close();
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    e.printStackTrace();
                                }
                            }
                        } else {
                            bitmap = null;
                        }
                        motionBackgroundDrawable2.setPatternBitmap(i2, bitmap);
                        motionBackgroundDrawable2.setPhase(i3);
                        backgroundDrawableSettings.wallpaper = motionBackgroundDrawable2;
                    }
                    backgroundDrawableSettings.isCustomTheme = Boolean.TRUE;
                } else if (str != null) {
                    try {
                        Bitmap bitmapLoadScreenSizedBitmap3 = loadScreenSizedBitmap(new FileInputStream(new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(str) + ".wp")), 0);
                        if (bitmapLoadScreenSizedBitmap3 != null) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapLoadScreenSizedBitmap3);
                            backgroundDrawableSettings.wallpaper = bitmapDrawable;
                            backgroundDrawableSettings.themedWallpaper = bitmapDrawable;
                            backgroundDrawableSettings.isCustomTheme = Boolean.TRUE;
                        }
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                } else if (i > 0 && (themeInfo.pathToFile != null || themeInfo.assetName != null)) {
                    try {
                        String str2 = themeInfo.assetName;
                        if (str2 != null) {
                            file2 = getAssetFile(str2);
                        } else {
                            file2 = new File(themeInfo.pathToFile);
                        }
                        Bitmap bitmapLoadScreenSizedBitmap4 = loadScreenSizedBitmap(new FileInputStream(file2), i);
                        if (bitmapLoadScreenSizedBitmap4 != null) {
                            BitmapDrawable bitmapDrawable2 = new BitmapDrawable(bitmapLoadScreenSizedBitmap4);
                            wallpaper = bitmapDrawable2;
                            backgroundDrawableSettings.themedWallpaper = bitmapDrawable2;
                            backgroundDrawableSettings.wallpaper = bitmapDrawable2;
                            bitmapDrawable2.setFilterBitmap(true);
                            backgroundDrawableSettings.isCustomTheme = Boolean.TRUE;
                        }
                    } catch (Throwable th3) {
                        FileLog.e(th3);
                    }
                }
            }
        }
        if (backgroundDrawableSettings.wallpaper == null) {
            int i10 = overrideWallpaperInfo != null ? overrideWallpaperInfo.color : 0;
            if (overrideWallpaperInfo != null) {
                try {
                    if (overrideWallpaperInfo.isDefault()) {
                        backgroundDrawableSettings.wallpaper = createDefaultWallpaper();
                        backgroundDrawableSettings.isCustomTheme = Boolean.FALSE;
                    } else if (!overrideWallpaperInfo.isColor() || overrideWallpaperInfo.gradientColor1 != 0) {
                        if (i10 != 0 && (!isPatternWallpaper || overrideWallpaperInfo.gradientColor2 != 0)) {
                            if (overrideWallpaperInfo.gradientColor1 != 0 && overrideWallpaperInfo.gradientColor2 != 0) {
                                MotionBackgroundDrawable motionBackgroundDrawable3 = new MotionBackgroundDrawable(overrideWallpaperInfo.color, overrideWallpaperInfo.gradientColor1, overrideWallpaperInfo.gradientColor2, overrideWallpaperInfo.gradientColor3, false);
                                motionBackgroundDrawable3.setPhase(i3);
                                if (backgroundDrawableSettings.isPatternWallpaper.booleanValue()) {
                                    File file3 = new File(ApplicationLoader.getFilesDirFixed(), overrideWallpaperInfo.fileName);
                                    if (file3.exists()) {
                                        motionBackgroundDrawable3.setPatternBitmap((int) (overrideWallpaperInfo.intensity * 100.0f), loadScreenSizedBitmap(new FileInputStream(file3), 0));
                                        backgroundDrawableSettings.isCustomTheme = Boolean.TRUE;
                                    }
                                }
                                backgroundDrawableSettings.wallpaper = motionBackgroundDrawable3;
                            } else if (backgroundDrawableSettings.isPatternWallpaper.booleanValue()) {
                                File file4 = new File(ApplicationLoader.getFilesDirFixed(), overrideWallpaperInfo.fileName);
                                if (file4.exists() && (bitmapLoadScreenSizedBitmap2 = loadScreenSizedBitmap(new FileInputStream(file4), 0)) != null) {
                                    BitmapDrawable bitmapDrawable3 = new BitmapDrawable(bitmapLoadScreenSizedBitmap2);
                                    backgroundDrawableSettings.wallpaper = bitmapDrawable3;
                                    bitmapDrawable3.setFilterBitmap(true);
                                    backgroundDrawableSettings.isCustomTheme = Boolean.TRUE;
                                }
                            } else {
                                int i11 = overrideWallpaperInfo.gradientColor1;
                                if (i11 != 0) {
                                    BackgroundGradientDrawable backgroundGradientDrawable2 = new BackgroundGradientDrawable(BackgroundGradientDrawable.getGradientOrientation(overrideWallpaperInfo.rotation), new int[]{i10, i11});
                                    backgroundGradientDisposable = backgroundGradientDrawable2.startDithering(BackgroundGradientDrawable.Sizes.ofDeviceScreen(), new BackgroundGradientDrawable.ListenerAdapter() {
                                        @Override
                                        public void onSizeReady(int i12, int i13) {
                                            Point point3 = AndroidUtilities.displaySize;
                                            if ((point3.x <= point3.y) == (i12 <= i13)) {
                                                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.didSetNewWallpapper, new Object[0]);
                                            }
                                        }
                                    }, 100L);
                                    backgroundDrawableSettings.wallpaper = backgroundGradientDrawable2;
                                } else {
                                    backgroundDrawableSettings.wallpaper = new ColorDrawable(i10);
                                }
                            }
                        } else {
                            File file5 = new File(ApplicationLoader.getFilesDirFixed(), overrideWallpaperInfo.fileName);
                            if (file5.exists() && (bitmapLoadScreenSizedBitmap = loadScreenSizedBitmap(new FileInputStream(file5), 0)) != null) {
                                BitmapDrawable bitmapDrawable4 = new BitmapDrawable(bitmapLoadScreenSizedBitmap);
                                backgroundDrawableSettings.wallpaper = bitmapDrawable4;
                                bitmapDrawable4.setFilterBitmap(true);
                                backgroundDrawableSettings.isCustomTheme = Boolean.TRUE;
                            }
                            if (backgroundDrawableSettings.wallpaper == null) {
                                backgroundDrawableSettings.wallpaper = createDefaultWallpaper();
                                backgroundDrawableSettings.isCustomTheme = Boolean.FALSE;
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            } else {
                backgroundDrawableSettings.wallpaper = createDefaultWallpaper();
                backgroundDrawableSettings.isCustomTheme = Boolean.FALSE;
            }
            if (backgroundDrawableSettings.wallpaper == null) {
                if (i10 == 0) {
                    i10 = -2693905;
                }
                backgroundDrawableSettings.wallpaper = new ColorDrawable(i10);
            }
        }
        if (!LiteMode.isEnabled(32)) {
            Drawable drawable = backgroundDrawableSettings.wallpaper;
            if (drawable instanceof MotionBackgroundDrawable) {
                MotionBackgroundDrawable motionBackgroundDrawable4 = (MotionBackgroundDrawable) drawable;
                if (motionBackgroundDrawable4.getPatternBitmap() == null) {
                    Point point3 = AndroidUtilities.displaySize;
                    iMin = Math.min(point3.x, point3.y);
                    Point point4 = AndroidUtilities.displaySize;
                    height = Math.max(point4.x, point4.y);
                } else {
                    int width = motionBackgroundDrawable4.getPatternBitmap().getWidth();
                    height = motionBackgroundDrawable4.getPatternBitmap().getHeight();
                    iMin = width;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, height, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                backgroundDrawableSettings.wallpaper.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                backgroundDrawableSettings.wallpaper.draw(canvas);
                backgroundDrawableSettings.wallpaper = new BitmapDrawable(bitmapCreateBitmap);
            }
        }
        return backgroundDrawableSettings;
    }

    public static Drawable createDefaultWallpaper() {
        return createDefaultWallpaper(0, 0);
    }

    public static Drawable createDefaultWallpaper(int i, int i2) {
        MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable(-2368069, -9722489, -2762611, -7817084, i != 0);
        if (i <= 0 || i2 <= 0) {
            Point point = AndroidUtilities.displaySize;
            i = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            i2 = Math.max(point2.x, point2.y);
        }
        motionBackgroundDrawable.setPatternBitmap(34, SvgHelper.getBitmap(R.raw.default_pattern, i, i2, -16777216, 1.0f, SvgHelper.ScaleMode.ByWidth));
        motionBackgroundDrawable.setPatternColorFilter(motionBackgroundDrawable.getPatternColor());
        return motionBackgroundDrawable;
    }

    public static Bitmap loadScreenSizedBitmap(FileInputStream fileInputStream, int i) {
        float fMin;
        int i2;
        try {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 1;
                options.inJustDecodeBounds = true;
                long j = i;
                fileInputStream.getChannel().position(j);
                BitmapFactory.decodeStream(fileInputStream, null, options);
                float f = options.outWidth;
                float f2 = options.outHeight;
                Point point = AndroidUtilities.displaySize;
                int iMin = Math.min(point.x, point.y);
                Point point2 = AndroidUtilities.displaySize;
                int iMax = Math.max(point2.x, point2.y);
                if (iMin >= iMax && f > f2) {
                    fMin = Math.max(f / iMin, f2 / iMax);
                } else {
                    fMin = Math.min(f / iMin, f2 / iMax);
                }
                if (fMin < 1.2f) {
                    fMin = 1.0f;
                }
                options.inJustDecodeBounds = false;
                if (fMin > 1.0f && (f > iMin || f2 > iMax)) {
                    int i3 = 1;
                    while (true) {
                        i2 = i3 * 2;
                        if (i3 * 4 >= fMin) {
                            break;
                        }
                        i3 = i2;
                    }
                    options.inSampleSize = i2;
                } else {
                    options.inSampleSize = (int) fMin;
                }
                fileInputStream.getChannel().position(j);
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                if (bitmapDecodeStream.getWidth() < iMin || bitmapDecodeStream.getHeight() < iMax) {
                    float fMax = Math.max(iMin / bitmapDecodeStream.getWidth(), iMax / bitmapDecodeStream.getHeight());
                    if (fMax >= 1.02f) {
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeStream, (int) (bitmapDecodeStream.getWidth() * fMax), (int) (bitmapDecodeStream.getHeight() * fMax), true);
                        bitmapDecodeStream.recycle();
                        try {
                            fileInputStream.close();
                        } catch (Exception unused) {
                        }
                        return bitmapCreateScaledBitmap;
                    }
                }
                try {
                    fileInputStream.close();
                } catch (Exception unused2) {
                }
                return bitmapDecodeStream;
            } catch (Throwable th) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            FileLog.e(e);
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Exception unused4) {
                }
            }
            return null;
        }
    }

    public static Drawable getThemedWallpaper(final boolean z, final View view) {
        MotionBackgroundDrawable motionBackgroundDrawable;
        File assetFile;
        int i;
        Throwable th;
        FileInputStream fileInputStream;
        BitmapFactory.Options options;
        int i2;
        Bitmap.Config config;
        Bitmap bitmapDecodeStream;
        BitmapDrawable bitmapDrawable;
        ThemeAccent accent;
        int i3;
        float f;
        float f2;
        int iDp;
        float f3;
        File pathToWallpaper;
        int i4 = currentColors.get(key_chat_wallpaper);
        if (i4 != 0) {
            int i5 = currentColors.get(key_chat_wallpaper_gradient_to1);
            int i6 = currentColors.get(key_chat_wallpaper_gradient_to2);
            int i7 = currentColors.get(key_chat_wallpaper_gradient_to3);
            int i8 = currentColors.get(key_chat_wallpaper_gradient_rotation, -1);
            if (i8 == -1) {
                i8 = 45;
            }
            if (i5 == 0) {
                return new ColorDrawable(i4);
            }
            ThemeAccent accent2 = currentTheme.getAccent(false);
            assetFile = (accent2 == null || TextUtils.isEmpty(accent2.patternSlug) || previousTheme != null || (pathToWallpaper = accent2.getPathToWallpaper()) == null || !pathToWallpaper.exists()) ? null : pathToWallpaper;
            if (i6 != 0) {
                motionBackgroundDrawable = new MotionBackgroundDrawable(i4, i5, i6, i7, true);
                if (assetFile == null) {
                    return motionBackgroundDrawable;
                }
            } else {
                if (assetFile == null) {
                    BackgroundGradientDrawable backgroundGradientDrawable = new BackgroundGradientDrawable(BackgroundGradientDrawable.getGradientOrientation(i8), new int[]{i4, i5});
                    backgroundGradientDrawable.startDithering(!z ? BackgroundGradientDrawable.Sizes.ofDeviceScreen() : BackgroundGradientDrawable.Sizes.ofDeviceScreen(0.125f, BackgroundGradientDrawable.Sizes.Orientation.PORTRAIT), view != null ? new BackgroundGradientDrawable.ListenerAdapter() {
                        @Override
                        public void onSizeReady(int i9, int i10) {
                            if (!z) {
                                Point point = AndroidUtilities.displaySize;
                                if ((point.x <= point.y) == (i9 <= i10)) {
                                    view.invalidate();
                                    return;
                                }
                                return;
                            }
                            view.invalidate();
                        }
                    } : null);
                    return backgroundGradientDrawable;
                }
                motionBackgroundDrawable = null;
            }
        } else {
            if (themedWallpaperFileOffset > 0) {
                ThemeInfo themeInfo = currentTheme;
                if (themeInfo.pathToFile != null || themeInfo.assetName != null) {
                    String str = themeInfo.assetName;
                    assetFile = str != null ? getAssetFile(str) : new File(currentTheme.pathToFile);
                    i = themedWallpaperFileOffset;
                    motionBackgroundDrawable = null;
                }
                if (assetFile != null) {
                    try {
                        fileInputStream = new FileInputStream(assetFile);
                        try {
                            fileInputStream.getChannel().position(i);
                            options = new BitmapFactory.Options();
                            i2 = 1;
                            if (z) {
                                options.inJustDecodeBounds = true;
                                f = options.outWidth;
                                f2 = options.outHeight;
                                iDp = AndroidUtilities.dp(100.0f);
                                while (true) {
                                    f3 = iDp;
                                    if (f > f3 && f2 <= f3) {
                                        break;
                                    }
                                    i2 *= 2;
                                    f /= 2.0f;
                                    f2 /= 2.0f;
                                }
                            }
                            config = Bitmap.Config.ALPHA_8;
                            options.inPreferredConfig = config;
                            options.inJustDecodeBounds = false;
                            options.inSampleSize = i2;
                            bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                            if (motionBackgroundDrawable != null) {
                                accent = currentTheme.getAccent(false);
                                if (accent != null) {
                                    i3 = (int) (accent.patternIntensity * 100.0f);
                                } else {
                                    i3 = 100;
                                }
                                if (bitmapDecodeStream != null && bitmapDecodeStream.getConfig() != config) {
                                    Bitmap bitmapCopy = bitmapDecodeStream.copy(config, false);
                                    bitmapDecodeStream.recycle();
                                    bitmapDecodeStream = bitmapCopy;
                                }
                                motionBackgroundDrawable.setPatternBitmap(i3, bitmapDecodeStream);
                                motionBackgroundDrawable.setPatternColorFilter(motionBackgroundDrawable.getPatternColor());
                                try {
                                    fileInputStream.close();
                                    return motionBackgroundDrawable;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return motionBackgroundDrawable;
                                }
                            }
                            if (bitmapDecodeStream != null) {
                                bitmapDrawable = new BitmapDrawable(bitmapDecodeStream);
                                try {
                                    fileInputStream.close();
                                    return bitmapDrawable;
                                } catch (Exception e2) {
                                    FileLog.e(e2);
                                    return bitmapDrawable;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                FileLog.e(th);
                                return null;
                            } finally {
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Exception e3) {
                                        FileLog.e(e3);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream = null;
                    }
                }
                return null;
            }
            motionBackgroundDrawable = null;
            assetFile = null;
        }
        i = 0;
        if (assetFile != null) {
            fileInputStream = new FileInputStream(assetFile);
            fileInputStream.getChannel().position(i);
            options = new BitmapFactory.Options();
            i2 = 1;
            if (z) {
                options.inJustDecodeBounds = true;
                f = options.outWidth;
                f2 = options.outHeight;
                iDp = AndroidUtilities.dp(100.0f);
                while (true) {
                    f3 = iDp;
                    if (f > f3) {
                    }
                    i2 *= 2;
                    f /= 2.0f;
                    f2 /= 2.0f;
                }
            }
            config = Bitmap.Config.ALPHA_8;
            options.inPreferredConfig = config;
            options.inJustDecodeBounds = false;
            options.inSampleSize = i2;
            bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
            if (motionBackgroundDrawable != null) {
                accent = currentTheme.getAccent(false);
                if (accent != null) {
                    i3 = (int) (accent.patternIntensity * 100.0f);
                } else {
                    i3 = 100;
                }
                if (bitmapDecodeStream != null) {
                    Bitmap bitmapCopy2 = bitmapDecodeStream.copy(config, false);
                    bitmapDecodeStream.recycle();
                    bitmapDecodeStream = bitmapCopy2;
                }
                motionBackgroundDrawable.setPatternBitmap(i3, bitmapDecodeStream);
                motionBackgroundDrawable.setPatternColorFilter(motionBackgroundDrawable.getPatternColor());
                fileInputStream.close();
                return motionBackgroundDrawable;
            }
            if (bitmapDecodeStream != null) {
                bitmapDrawable = new BitmapDrawable(bitmapDecodeStream);
                fileInputStream.close();
                return bitmapDrawable;
            }
        }
        return null;
    }

    public static String getSelectedBackgroundSlug() {
        OverrideWallpaperInfo overrideWallpaperInfo = currentTheme.overrideWallpaper;
        if (overrideWallpaperInfo != null) {
            return overrideWallpaperInfo.slug;
        }
        if (hasWallpaperFromTheme()) {
            return "t";
        }
        return "d";
    }

    public static Drawable getCachedWallpaper() {
        Drawable cachedWallpaperNonBlocking = getCachedWallpaperNonBlocking();
        if (cachedWallpaperNonBlocking != null || wallpaperLoadTask == null) {
            return cachedWallpaperNonBlocking;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Utilities.themeQueue.postRunnable(new Theme$$ExternalSyntheticLambda12(countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return getCachedWallpaperNonBlocking();
    }

    public static Drawable getCachedWallpaperNonBlocking() {
        Drawable drawable = themedWallpaper;
        return drawable != null ? drawable : wallpaper;
    }

    public static boolean isWallpaperMotion() {
        return isWallpaperMotion;
    }

    public static boolean isPatternWallpaper() {
        String selectedBackgroundSlug = getSelectedBackgroundSlug();
        return isPatternWallpaper || "CJz3BZ6YGEYBAAAABboWp6SAv04".equals(selectedBackgroundSlug) || "qeZWES8rGVIEAAAARfWlK1lnfiI".equals(selectedBackgroundSlug);
    }

    public static BackgroundGradientDrawable getCurrentGradientWallpaper() {
        int i;
        int i2;
        OverrideWallpaperInfo overrideWallpaperInfo = currentTheme.overrideWallpaper;
        if (overrideWallpaperInfo == null || (i = overrideWallpaperInfo.color) == 0 || (i2 = overrideWallpaperInfo.gradientColor1) == 0) {
            return null;
        }
        return new BackgroundGradientDrawable(BackgroundGradientDrawable.getGradientOrientation(overrideWallpaperInfo.rotation), new int[]{i, i2});
    }

    public static AudioVisualizerDrawable getCurrentAudiVisualizerDrawable() {
        if (chat_msgAudioVisualizeDrawable == null) {
            chat_msgAudioVisualizeDrawable = new AudioVisualizerDrawable();
        }
        return chat_msgAudioVisualizeDrawable;
    }

    public static void unrefAudioVisualizeDrawable(final MessageObject messageObject) {
        AudioVisualizerDrawable audioVisualizerDrawable = chat_msgAudioVisualizeDrawable;
        if (audioVisualizerDrawable == null) {
            return;
        }
        if (audioVisualizerDrawable.getParentView() == null || messageObject == null) {
            chat_msgAudioVisualizeDrawable.setParentView(null);
            return;
        }
        if (animatedOutVisualizerDrawables == null) {
            animatedOutVisualizerDrawables = new HashMap();
        }
        animatedOutVisualizerDrawables.put(messageObject, chat_msgAudioVisualizeDrawable);
        chat_msgAudioVisualizeDrawable.setWaveform(false, true, null);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                Theme.m1277$r8$lambda$IfQcXDUUx0gKIvGuTBUT9VHuMI(messageObject);
            }
        }, 200L);
        chat_msgAudioVisualizeDrawable = null;
    }

    public static void m1277$r8$lambda$IfQcXDUUx0gKIvGuTBUT9VHuMI(MessageObject messageObject) {
        AudioVisualizerDrawable audioVisualizerDrawable = (AudioVisualizerDrawable) animatedOutVisualizerDrawables.remove(messageObject);
        if (audioVisualizerDrawable != null) {
            audioVisualizerDrawable.setParentView(null);
        }
    }

    public static AudioVisualizerDrawable getAnimatedOutAudioVisualizerDrawable(MessageObject messageObject) {
        HashMap map = animatedOutVisualizerDrawables;
        if (map == null || messageObject == null) {
            return null;
        }
        return (AudioVisualizerDrawable) map.get(messageObject);
    }

    public static StatusDrawable getChatStatusDrawable(int i) {
        if (i < 0 || i > 5) {
            return null;
        }
        StatusDrawable[] statusDrawableArr = chat_status_drawables;
        StatusDrawable statusDrawable = statusDrawableArr[i];
        if (statusDrawable != null) {
            return statusDrawable;
        }
        if (i == 0) {
            statusDrawableArr[0] = new TypingDotsDrawable(true);
        } else if (i == 1) {
            statusDrawableArr[1] = new RecordStatusDrawable(true);
        } else if (i == 2) {
            statusDrawableArr[2] = new SendingFileDrawable(true);
        } else if (i == 3) {
            statusDrawableArr[3] = new PlayingGameDrawable(true, null);
        } else if (i == 4) {
            statusDrawableArr[4] = new RoundStatusDrawable(true);
        } else if (i == 5) {
            statusDrawableArr[5] = new ChoosingStickerStatusDrawable(true);
        }
        StatusDrawable statusDrawable2 = chat_status_drawables[i];
        statusDrawable2.start();
        statusDrawable2.setColor(getColor(key_chats_actionMessage));
        return statusDrawable2;
    }

    public static FragmentContextViewWavesDrawable getFragmentContextViewWavesDrawable() {
        if (fragmentContextViewWavesDrawable == null) {
            fragmentContextViewWavesDrawable = new FragmentContextViewWavesDrawable();
        }
        return fragmentContextViewWavesDrawable;
    }

    public static RoundVideoProgressShadow getRadialSeekbarShadowDrawable() {
        if (roundPlayDrawable == null) {
            roundPlayDrawable = new RoundVideoProgressShadow();
        }
        return roundPlayDrawable;
    }

    public static SparseIntArray getFallbackKeys() {
        return fallbackKeys;
    }

    public static int getFallbackKey(int i) {
        return fallbackKeys.get(i);
    }

    public static Map getThemeDrawablesMap() {
        return defaultChatDrawables;
    }

    public static Drawable getThemeDrawable(String str) {
        return (Drawable) defaultChatDrawables.get(str);
    }

    public static Drawable getThemeDrawable(String str, ResourcesProvider resourcesProvider) {
        Drawable drawable = resourcesProvider != null ? resourcesProvider.getDrawable(str) : null;
        return drawable != null ? drawable : (Drawable) defaultChatDrawables.get(str);
    }

    public static int getThemeDrawableColorKey(String str) {
        return ((Integer) defaultChatDrawableColorKeys.get(str)).intValue();
    }

    public static Map getThemePaintsMap() {
        return defaultChatPaints;
    }

    public static Paint getThemePaint(String str) {
        if (Objects.equals(str, "paintDivider")) {
            return dividerPaint;
        }
        return (Paint) defaultChatPaints.get(str);
    }

    public static int getThemePaintColorKey(String str) {
        return ((Integer) defaultChatPaintColors.get(str)).intValue();
    }

    private static void addChatDrawable(String str, Drawable drawable, int i) {
        defaultChatDrawables.put(str, drawable);
        defaultChatDrawableColorKeys.put(str, Integer.valueOf(i));
    }

    private static void addChatPaint(String str, Paint paint, int i) {
        defaultChatPaints.put(str, paint);
        defaultChatPaintColors.put(str, Integer.valueOf(i));
    }

    public static boolean isCurrentThemeDay() {
        return !getActiveTheme().isDark();
    }

    public static boolean isHome(ThemeAccent themeAccent) {
        ThemeInfo themeInfo = themeAccent.parentTheme;
        if (themeInfo == null) {
            return false;
        }
        if (themeInfo.getKey().equals("Blue") && themeAccent.id == 99) {
            return true;
        }
        if (themeAccent.parentTheme.getKey().equals("Day") && themeAccent.id == 9) {
            return true;
        }
        return (themeAccent.parentTheme.getKey().equals("Night") || themeAccent.parentTheme.getKey().equals("Dark Blue")) && themeAccent.id == 0;
    }

    public static void turnOffAutoNight(final BaseFragment baseFragment) {
        String string;
        if (selectedAutoNightType != 0) {
            if (baseFragment != null) {
                try {
                    BulletinFactory bulletinFactoryOf = BulletinFactory.of(baseFragment);
                    int i = R.raw.auto_night_off;
                    if (selectedAutoNightType == 3) {
                        string = LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff);
                    } else {
                        string = LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff);
                    }
                    bulletinFactoryOf.createSimpleBulletin(i, string, LocaleController.getString("Settings", R.string.Settings), 5000, new Runnable() {
                        @Override
                        public final void run() {
                            baseFragment.presentFragment(new ThemeActivity(1));
                        }
                    }).show();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            selectedAutoNightType = 0;
            saveAutoNightThemeConfig();
            cancelAutoNightThemeCallbacks();
        }
    }

    public static void turnOffAutoNight(BulletinFactory bulletinFactory, Runnable runnable) {
        String string;
        int i = selectedAutoNightType;
        if (i != 0) {
            if (bulletinFactory != null && runnable != null) {
                try {
                    int i2 = R.raw.auto_night_off;
                    if (i == 3) {
                        string = LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff);
                    } else {
                        string = LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff);
                    }
                    bulletinFactory.createSimpleBulletin(i2, string, LocaleController.getString("Settings", R.string.Settings), 5000, runnable).show();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            selectedAutoNightType = 0;
            saveAutoNightThemeConfig();
            cancelAutoNightThemeCallbacks();
        }
    }

    public enum IvButtonColors {
        DEFAULT(Theme.key_chat_msgIvButtonDefaultIn, Theme.key_chat_msgIvButtonDefaultInPressed, Theme.key_chat_msgIvButtonDefaultInText, Theme.key_chat_msgIvButtonDefaultOut, Theme.key_chat_msgIvButtonDefaultOutPressed, Theme.key_chat_msgIvButtonDefaultOutText),
        PRIMARY(Theme.key_chat_msgIvButtonPrimaryIn, Theme.key_chat_msgIvButtonPrimaryInPressed, Theme.key_chat_msgIvButtonPrimaryInText, Theme.key_chat_msgIvButtonPrimaryOut, Theme.key_chat_msgIvButtonPrimaryOutPressed, Theme.key_chat_msgIvButtonPrimaryOutText),
        DANGER(Theme.key_chat_msgIvButtonDangerIn, Theme.key_chat_msgIvButtonDangerInPressed, Theme.key_chat_msgIvButtonDangerInText, Theme.key_chat_msgIvButtonDangerOut, Theme.key_chat_msgIvButtonDangerOutPressed, Theme.key_chat_msgIvButtonDangerOutText),
        SUCCESS(Theme.key_chat_msgIvButtonSuccessIn, Theme.key_chat_msgIvButtonSuccessInPressed, Theme.key_chat_msgIvButtonSuccessInText, Theme.key_chat_msgIvButtonSuccessOut, Theme.key_chat_msgIvButtonSuccessOutPressed, Theme.key_chat_msgIvButtonSuccessOutText),
        DEFAULT_IN_TEXT(Theme.key_chat_msgIvButtonDefaultInlineIn, Theme.key_chat_msgIvButtonDefaultInlineInPressed, Theme.key_chat_msgIvButtonDefaultInlineInText, Theme.key_chat_msgIvButtonDefaultInlineOut, Theme.key_chat_msgIvButtonDefaultInlineOutPressed, Theme.key_chat_msgIvButtonDefaultInlineOutText);

        private final int backgroundIn;
        private final int backgroundInPressed;
        private final int backgroundOut;
        private final int backgroundOutPressed;
        private final int textIn;
        private final int textOut;

        IvButtonColors(int i, int i2, int i3, int i4, int i5, int i6) {
            this.backgroundIn = i;
            this.backgroundInPressed = i2;
            this.textIn = i3;
            this.backgroundOut = i4;
            this.backgroundOutPressed = i5;
            this.textOut = i6;
        }

        public int getBackgroundKey(boolean z) {
            return z ? this.backgroundOut : this.backgroundIn;
        }

        public int getBackgroundPressedKey(boolean z) {
            return z ? this.backgroundOutPressed : this.backgroundInPressed;
        }

        public int getTextKey(boolean z) {
            return z ? this.textOut : this.textIn;
        }

        public static IvButtonColors of(TL_keyboard.RichButtonStyle richButtonStyle) {
            if (richButtonStyle != null) {
                if (richButtonStyle.bg_primary) {
                    return PRIMARY;
                }
                if (richButtonStyle.bg_danger) {
                    return DANGER;
                }
                if (richButtonStyle.bg_success) {
                    return SUCCESS;
                }
            }
            return DEFAULT;
        }
    }

    public static Paint fillingPaint(int i) {
        Paint paint = PAINT_FILLING;
        if (paint.getColor() != i) {
            paint.setColor(i);
        }
        return paint;
    }
}
