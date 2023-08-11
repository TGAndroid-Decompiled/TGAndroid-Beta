package org.telegram.ui.ActionBar;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
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
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.hardware.Sensor;
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
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticLambda251;
import org.telegram.messenger.MessagesStorage;
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
import org.telegram.tgnet.TLRPC$BaseTheme;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$InputFile;
import org.telegram.tgnet.TLRPC$TL_account_getMultiWallPapers;
import org.telegram.tgnet.TLRPC$TL_account_getTheme;
import org.telegram.tgnet.TLRPC$TL_account_getThemes;
import org.telegram.tgnet.TLRPC$TL_account_getWallPaper;
import org.telegram.tgnet.TLRPC$TL_baseThemeArctic;
import org.telegram.tgnet.TLRPC$TL_baseThemeClassic;
import org.telegram.tgnet.TLRPC$TL_baseThemeDay;
import org.telegram.tgnet.TLRPC$TL_baseThemeNight;
import org.telegram.tgnet.TLRPC$TL_baseThemeTinted;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputTheme;
import org.telegram.tgnet.TLRPC$TL_inputWallPaperSlug;
import org.telegram.tgnet.TLRPC$TL_theme;
import org.telegram.tgnet.TLRPC$TL_wallPaper;
import org.telegram.tgnet.TLRPC$TL_wallPaperNoFile;
import org.telegram.tgnet.TLRPC$Theme;
import org.telegram.tgnet.TLRPC$ThemeSettings;
import org.telegram.tgnet.TLRPC$Vector;
import org.telegram.tgnet.TLRPC$WallPaper;
import org.telegram.tgnet.TLRPC$WallPaperSettings;
import org.telegram.ui.ActionBar.Theme;
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
import org.telegram.ui.Components.TypingDotsDrawable;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.RoundVideoProgressShadow;
import org.telegram.ui.ThemeActivity;
public class Theme {
    public static Paint DEBUG_BLUE;
    public static Paint DEBUG_RED;
    private static Method StateListDrawable_getStateDrawableMethod;
    private static SensorEventListener ambientSensorListener;
    private static HashMap<MessageObject, AudioVisualizerDrawable> animatedOutVisualizerDrawables;
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
    public static Drawable[] avatarDrawables;
    public static Paint avatar_backgroundPaint;
    private static BackgroundGradientDrawable.Disposable backgroundGradientDisposable;
    public static Drawable calllog_msgCallDownGreenDrawable;
    public static Drawable calllog_msgCallDownRedDrawable;
    public static Drawable calllog_msgCallUpGreenDrawable;
    public static Drawable calllog_msgCallUpRedDrawable;
    private static boolean canStartHolidayAnimation;
    private static boolean changingWallpaper;
    public static Paint chat_actionBackgroundGradientDarkenPaint;
    public static Paint chat_actionBackgroundPaint;
    public static Paint chat_actionBackgroundPaint2;
    public static Paint chat_actionBackgroundSelectedPaint;
    public static TextPaint chat_actionTextPaint;
    public static TextPaint chat_actionTextPaint2;
    public static TextPaint chat_adminPaint;
    public static PorterDuffColorFilter chat_animatedEmojiTextColorFilter;
    public static RLottieDrawable[] chat_attachButtonDrawables;
    public static Drawable chat_attachEmptyDrawable;
    public static TextPaint chat_audioPerformerPaint;
    public static TextPaint chat_audioTimePaint;
    public static TextPaint chat_audioTitlePaint;
    public static TextPaint chat_botButtonPaint;
    public static Drawable chat_botCardDrawable;
    public static Drawable chat_botInlineDrawable;
    public static Drawable chat_botInviteDrawable;
    public static Drawable chat_botLinkDrawable;
    public static Drawable chat_botWebViewDrawable;
    public static Drawable chat_commentArrowDrawable;
    public static Drawable chat_commentDrawable;
    public static Drawable chat_commentStickerDrawable;
    public static TextPaint chat_commentTextPaint;
    public static Paint chat_composeBackgroundPaint;
    public static Drawable chat_composeShadowDrawable;
    public static Drawable chat_composeShadowRoundDrawable;
    public static Drawable[] chat_contactDrawable;
    public static TextPaint chat_contactNamePaint;
    public static TextPaint chat_contactPhonePaint;
    public static TextPaint chat_contextResult_descriptionTextPaint;
    public static Drawable chat_contextResult_shadowUnderSwitchDrawable;
    public static TextPaint chat_contextResult_titleTextPaint;
    public static Paint chat_deleteProgressPaint;
    public static Paint chat_docBackPaint;
    public static TextPaint chat_docNamePaint;
    public static TextPaint chat_durationPaint;
    public static Path[] chat_filePath;
    public static Drawable[][] chat_fileStatesDrawable;
    public static Drawable chat_flameIcon;
    public static TextPaint chat_forwardNamePaint;
    public static TextPaint chat_gamePaint;
    public static Drawable chat_gifIcon;
    public static Drawable chat_goIconDrawable;
    public static Drawable chat_gradientLeftDrawable;
    public static Drawable chat_gradientRightDrawable;
    public static TextPaint chat_infoPaint;
    public static Drawable chat_inlineResultAudio;
    public static Drawable chat_inlineResultFile;
    public static Drawable chat_inlineResultLocation;
    public static TextPaint chat_instantViewPaint;
    public static Paint chat_instantViewRectPaint;
    public static TextPaint chat_livePaint;
    public static TextPaint chat_locationAddressPaint;
    public static Drawable[] chat_locationDrawable;
    public static TextPaint chat_locationTitlePaint;
    public static Drawable chat_lockIconDrawable;
    public static Paint chat_messageBackgroundSelectedPaint;
    private static AudioVisualizerDrawable chat_msgAudioVisualizeDrawable;
    public static TextPaint chat_msgBotButtonPaint;
    public static Drawable chat_msgCallDownGreenDrawable;
    public static Drawable chat_msgCallDownRedDrawable;
    public static Drawable chat_msgCallUpGreenDrawable;
    public static MsgClockDrawable chat_msgClockDrawable;
    public static Drawable chat_msgErrorDrawable;
    public static Paint chat_msgErrorPaint;
    public static TextPaint chat_msgGameTextPaint;
    public static Drawable[] chat_msgInCallDrawable;
    public static Drawable[] chat_msgInCallSelectedDrawable;
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
    public static Drawable[] chat_msgOutCallDrawable;
    public static Drawable[] chat_msgOutCallSelectedDrawable;
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
    public static TextPaint chat_msgTextPaint;
    public static TextPaint[] chat_msgTextPaintEmoji;
    public static TextPaint chat_msgTextPaintOneEmoji;
    public static TextPaint chat_msgTextPaintThreeEmoji;
    public static TextPaint chat_msgTextPaintTwoEmoji;
    public static Drawable chat_msgUnlockDrawable;
    public static Drawable chat_muteIconDrawable;
    public static TextPaint chat_namePaint;
    public static Paint chat_outUrlPaint;
    public static Drawable[] chat_pollCheckDrawable;
    public static Drawable[] chat_pollCrossDrawable;
    public static Drawable[] chat_pollHintDrawable;
    public static Paint chat_pollTimerPaint;
    public static Drawable[] chat_psaHelpDrawable;
    public static Paint chat_radialProgress2Paint;
    public static Paint chat_radialProgressPaint;
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
    private static StatusDrawable[] chat_status_drawables;
    public static TextPaint chat_stickerCommentCountPaint;
    public static Paint chat_textSearchSelectionPaint;
    public static Paint chat_timeBackgroundPaint;
    public static TextPaint chat_timePaint;
    public static TextPaint chat_topicTextPaint;
    public static TextPaint chat_unlockExtendedMediaTextPaint;
    public static Path[] chat_updatePath;
    public static Paint chat_urlPaint;
    public static Paint checkboxSquare_backgroundPaint;
    public static Paint checkboxSquare_checkPaint;
    public static Paint checkboxSquare_eraserPaint;
    public static int colorsCount;
    private static SparseIntArray currentColors;
    private static SparseIntArray currentColorsNoAccent;
    private static ThemeInfo currentDayTheme;
    private static ThemeInfo currentNightTheme;
    private static ThemeInfo currentTheme;
    private static final HashMap<String, Integer> defaultChatDrawableColorKeys;
    private static final HashMap<String, Drawable> defaultChatDrawables;
    private static final HashMap<String, Integer> defaultChatPaintColors;
    private static final HashMap<String, Paint> defaultChatPaints;
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
    public static Paint dialogs_countGrayPaint;
    public static Paint dialogs_countPaint;
    public static TextPaint dialogs_countTextPaint;
    public static Drawable dialogs_errorDrawable;
    public static Paint dialogs_errorPaint;
    public static ScamDrawable dialogs_fakeDrawable;
    public static Drawable dialogs_forum_arrowDrawable;
    public static Drawable dialogs_halfCheckDrawable;
    public static RLottieDrawable dialogs_hidePsaDrawable;
    public static boolean dialogs_hidePsaDrawableRecolored;
    public static Drawable dialogs_holidayDrawable;
    private static int dialogs_holidayDrawableOffsetX;
    private static int dialogs_holidayDrawableOffsetY;
    public static Drawable dialogs_lock2Drawable;
    public static Drawable dialogs_lockDrawable;
    public static Drawable dialogs_mentionDrawable;
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
    public static Paint dialogs_pinnedPaint;
    public static Drawable dialogs_playDrawable;
    public static Paint dialogs_reactionsCountPaint;
    public static Drawable dialogs_reactionsMentionDrawable;
    public static Drawable dialogs_reorderDrawable;
    public static ScamDrawable dialogs_scamDrawable;
    public static TextPaint dialogs_searchNameEncryptedPaint;
    public static TextPaint dialogs_searchNamePaint;
    public static RLottieDrawable dialogs_swipeDeleteDrawable;
    public static RLottieDrawable dialogs_swipeMuteDrawable;
    public static RLottieDrawable dialogs_swipePinDrawable;
    public static RLottieDrawable dialogs_swipeReadDrawable;
    public static RLottieDrawable dialogs_swipeUnmuteDrawable;
    public static RLottieDrawable dialogs_swipeUnpinDrawable;
    public static RLottieDrawable dialogs_swipeUnreadDrawable;
    public static Paint dialogs_tabletSeletedPaint;
    public static TextPaint dialogs_timePaint;
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
    private static ThreadLocal<float[]> hsvTemp1Local;
    private static ThreadLocal<float[]> hsvTemp2Local;
    private static ThreadLocal<float[]> hsvTemp3Local;
    private static ThreadLocal<float[]> hsvTemp4Local;
    private static ThreadLocal<float[]> hsvTemp5Local;
    private static boolean isApplyingAccent;
    private static boolean isCustomTheme;
    private static boolean isInNigthMode;
    private static boolean isPatternWallpaper;
    private static boolean isWallpaperMotion;
    public static final int key_actionBarActionModeDefault;
    public static final int key_actionBarActionModeDefaultIcon;
    public static final int key_actionBarActionModeDefaultSelector;
    public static final int key_actionBarActionModeDefaultTop;
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
    public static final int key_calls_callReceivedGreenIcon;
    public static final int key_calls_callReceivedRedIcon;
    public static final int key_changephoneinfo_image2;
    public static final int key_chat_BlurAlpha;
    public static final int key_chat_TextSelectionCursor;
    public static final int key_chat_addContact;
    public static final int key_chat_attachActiveTab;
    public static final int key_chat_attachAudioBackground;
    public static final int key_chat_attachAudioText;
    public static final int key_chat_attachCheckBoxBackground;
    public static final int key_chat_attachCheckBoxCheck;
    public static final int key_chat_attachContactBackground;
    public static final int key_chat_attachContactText;
    public static final int key_chat_attachEmptyImage;
    public static final int key_chat_attachFileBackground;
    public static final int key_chat_attachFileText;
    public static final int key_chat_attachGalleryBackground;
    public static final int key_chat_attachGalleryText;
    public static final int key_chat_attachIcon;
    public static final int key_chat_attachLocationBackground;
    public static final int key_chat_attachLocationText;
    public static final int key_chat_attachPermissionImage;
    public static final int key_chat_attachPermissionMark;
    public static final int key_chat_attachPermissionText;
    public static final int key_chat_attachPhotoBackground;
    public static final int key_chat_attachPollBackground;
    public static final int key_chat_attachPollText;
    public static final int key_chat_attachUnactiveTab;
    public static final int key_chat_botButtonText;
    public static final int key_chat_botKeyboardButtonBackground;
    public static final int key_chat_botKeyboardButtonBackgroundPressed;
    public static final int key_chat_botKeyboardButtonText;
    public static final int key_chat_botSwitchToInlineText;
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
    public static final int key_chat_goDownButtonIcon;
    public static final int key_chat_inAdminSelectedText;
    public static final int key_chat_inAdminText;
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
    public static final int key_chat_inContactBackground;
    public static final int key_chat_inContactIcon;
    public static final int key_chat_inContactNameText;
    public static final int key_chat_inContactPhoneSelectedText;
    public static final int key_chat_inContactPhoneText;
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
    public static final int key_chat_muteIcon;
    public static final int key_chat_outAdminSelectedText;
    public static final int key_chat_outAdminText;
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
    public static final int key_chat_outContactBackground;
    public static final int key_chat_outContactIcon;
    public static final int key_chat_outContactNameText;
    public static final int key_chat_outContactPhoneSelectedText;
    public static final int key_chat_outContactPhoneText;
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
    public static final int key_chat_outReactionButtonBackground;
    public static final int key_chat_outReactionButtonText;
    public static final int key_chat_outReactionButtonTextSelected;
    public static final int key_chat_outReplyLine;
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
    public static final int key_chat_recordTime;
    public static final int key_chat_recordVoiceCancel;
    public static final int key_chat_recordedVoiceBackground;
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
    public static final int key_dialogCameraIcon;
    public static final int key_dialogCheckboxSquareBackground;
    public static final int key_dialogCheckboxSquareCheck;
    public static final int key_dialogCheckboxSquareDisabled;
    public static final int key_dialogCheckboxSquareUnchecked;
    public static final int key_dialogEmptyImage;
    public static final int key_dialogEmptyText;
    public static final int key_dialogFloatingButton;
    public static final int key_dialogFloatingButtonPressed;
    public static final int key_dialogFloatingIcon;
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
    public static final int key_premiumStartGradient1;
    public static final int key_premiumStartGradient2;
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
    public static final int key_returnToCallBackground;
    public static final int key_returnToCallMutedBackground;
    public static final int key_returnToCallText;
    public static final int key_sessions_devicesImage;
    public static final int key_sharedMedia_linkPlaceholder;
    public static final int key_sharedMedia_linkPlaceholderText;
    public static final int key_sharedMedia_photoPlaceholder;
    public static final int key_sharedMedia_startStopLoadIcon;
    public static final int key_sheet_other;
    public static final int key_sheet_scrollUp;
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
    private static long lastHolidayCheckTime;
    private static int lastLoadingCurrentThemeTime;
    private static int[] lastLoadingThemesTime;
    private static long lastThemeSwitchTime;
    private static Sensor lightSensor;
    private static boolean lightSensorRegistered;
    public static Paint linkSelectionPaint;
    private static int loadingCurrentTheme;
    private static boolean[] loadingRemoteThemes;
    private static Paint maskPaint;
    public static Drawable moveUpDrawable;
    public static final int myMessagesBubblesEndIndex;
    public static final int myMessagesBubblesStartIndex;
    public static final int myMessagesEndIndex;
    public static final int myMessagesStartIndex;
    private static ArrayList<ThemeInfo> otherThemes;
    public static PathAnimator playPauseAnimator;
    private static int previousPhase;
    private static ThemeInfo previousTheme;
    public static TextPaint profile_aboutTextPaint;
    public static Drawable profile_verifiedCheckDrawable;
    public static Drawable profile_verifiedDrawable;
    private static long[] remoteThemesHash;
    private static RoundVideoProgressShadow roundPlayDrawable;
    public static int selectedAutoNightType;
    private static SensorManager sensorManager;
    private static Bitmap serviceBitmap;
    private static Matrix serviceBitmapMatrix;
    public static BitmapShader serviceBitmapShader;
    private static int serviceMessage2Color;
    private static int serviceMessageColor;
    public static int serviceMessageColorBackup;
    private static int serviceSelectedMessage2Color;
    private static int serviceSelectedMessageColor;
    public static int serviceSelectedMessageColorBackup;
    private static boolean shouldDrawGradientIcons;
    private static boolean switchDayRunnableScheduled;
    private static boolean switchNightRunnableScheduled;
    private static int switchNightThemeDelay;
    private static boolean switchingNightTheme;
    private static HashSet<Integer> themeAccentExclusionKeys;
    private static Drawable themedWallpaper;
    private static int themedWallpaperFileOffset;
    private static String themedWallpaperLink;
    public static ArrayList<ThemeInfo> themes;
    private static HashMap<String, ThemeInfo> themesDict;
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

    public static class BackgroundDrawableSettings {
        public Boolean isCustomTheme;
        public Boolean isPatternWallpaper;
        public Boolean isWallpaperMotion;
        public Drawable wallpaper;
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

    static long access$3100() {
        return getAutoNightSwitchThemeDelay();
    }

    static {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.Theme.<clinit>():void");
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

    public static class MessageDrawable extends Drawable {
        public static MotionBackgroundDrawable[] motionBackground = new MotionBackgroundDrawable[3];
        private int alpha;
        private Drawable[][] backgroundDrawable;
        private int[][] backgroundDrawableColor;
        private Rect backupRect;
        private boolean botButtonsBottom;
        private Bitmap crosfadeFromBitmap;
        private Shader crosfadeFromBitmapShader;
        public MessageDrawable crossfadeFromDrawable;
        public float crossfadeProgress;
        private boolean currentAnimateGradient;
        private int[][] currentBackgroundDrawableRadius;
        private int currentBackgroundHeight;
        private int currentColor;
        private int currentGradientColor1;
        private int currentGradientColor2;
        private int currentGradientColor3;
        private int[] currentShadowDrawableRadius;
        private int currentType;
        private boolean drawFullBubble;
        private Shader gradientShader;
        private boolean isBottomNear;
        public boolean isCrossfadeBackground;
        private final boolean isOut;
        public boolean isSelected;
        private boolean isTopNear;
        public boolean lastDrawWithShadow;
        private Matrix matrix;
        private int overrideRoundRadius;
        private float overrideRounding;
        private Paint paint;
        private Path path;
        PathDrawParams pathDrawCacheParams;
        private RectF rect;
        private ResourcesProvider resourcesProvider;
        private Paint selectedPaint;
        private Drawable[] shadowDrawable;
        private Bitmap[] shadowDrawableBitmap;
        private int[] shadowDrawableColor;
        public boolean themePreview;
        private int topY;
        Drawable transitionDrawable;
        int transitionDrawableColor;

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setColorFilter(int i, PorterDuff.Mode mode) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public MessageDrawable(int i, boolean z, boolean z2) {
            this(i, z, z2, null);
        }

        public MessageDrawable(int i, boolean z, boolean z2, ResourcesProvider resourcesProvider) {
            this.paint = new Paint(1);
            this.rect = new RectF();
            this.matrix = new Matrix();
            this.backupRect = new Rect();
            this.currentShadowDrawableRadius = new int[]{-1, -1, -1, -1};
            this.shadowDrawableBitmap = new Bitmap[4];
            this.shadowDrawable = new Drawable[4];
            this.shadowDrawableColor = new int[]{-1, -1, -1, -1};
            this.currentBackgroundDrawableRadius = new int[][]{new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
            this.backgroundDrawable = (Drawable[][]) Array.newInstance(Drawable.class, 4, 4);
            this.backgroundDrawableColor = new int[][]{new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}, new int[]{-1, -1, -1, -1}};
            this.resourcesProvider = resourcesProvider;
            this.isOut = z;
            this.currentType = i;
            this.isSelected = z2;
            this.path = new Path();
            this.selectedPaint = new Paint(1);
            this.alpha = 255;
        }

        public boolean hasGradient() {
            return this.gradientShader != null && Theme.shouldDrawGradientIcons;
        }

        public void applyMatrixScale() {
            Bitmap bitmap;
            if (this.gradientShader instanceof BitmapShader) {
                char c = 2;
                if (this.isCrossfadeBackground && (bitmap = this.crosfadeFromBitmap) != null) {
                    char c2 = this.currentType != 2 ? (char) 0 : (char) 1;
                    float min = 1.0f / Math.min(bitmap.getWidth() / motionBackground[c2].getBounds().width(), this.crosfadeFromBitmap.getHeight() / motionBackground[c2].getBounds().height());
                    this.matrix.postScale(min, min);
                    return;
                }
                if (!this.themePreview) {
                    c = this.currentType != 2 ? (char) 0 : (char) 1;
                }
                Bitmap bitmap2 = motionBackground[c].getBitmap();
                float min2 = 1.0f / Math.min(bitmap2.getWidth() / motionBackground[c].getBounds().width(), bitmap2.getHeight() / motionBackground[c].getBounds().height());
                this.matrix.postScale(min2, min2);
            }
        }

        public Shader getGradientShader() {
            return this.gradientShader;
        }

        public Matrix getMatrix() {
            return this.matrix;
        }

        protected int getColor(int i) {
            if (this.currentType == 2) {
                return Theme.getColor(i);
            }
            ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (resourcesProvider != null) {
                return resourcesProvider.getColor(i);
            }
            return Theme.getColor(i);
        }

        protected int getCurrentColor(int i) {
            if (this.currentType == 2) {
                return Theme.getColor(i);
            }
            ResourcesProvider resourcesProvider = this.resourcesProvider;
            return resourcesProvider != null ? resourcesProvider.getCurrentColor(i) : Theme.currentColors.get(i);
        }

        public void setBotButtonsBottom(boolean z) {
            this.botButtonsBottom = z;
        }

        public void setTop(int i, int i2, int i3, boolean z, boolean z2) {
            setTop(i, i2, i3, i3, 0, 0, z, z2);
        }

        public void setTop(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
            int color;
            int i7;
            int i8;
            int i9;
            boolean z3;
            char c;
            int i10;
            int i11;
            MessageDrawable messageDrawable = this.crossfadeFromDrawable;
            if (messageDrawable != null) {
                messageDrawable.setTop(i, i2, i3, i4, i5, i6, z, z2);
            }
            if (this.isOut) {
                color = getColor(this.isSelected ? Theme.key_chat_outBubbleSelected : Theme.key_chat_outBubble);
                int currentColor = getCurrentColor(Theme.key_chat_outBubbleGradient1);
                int currentColor2 = getCurrentColor(Theme.key_chat_outBubbleGradient2);
                i7 = currentColor;
                i8 = currentColor2;
                i9 = getCurrentColor(Theme.key_chat_outBubbleGradient3);
                z3 = getCurrentColor(Theme.key_chat_outBubbleGradientAnimated) != 0;
            } else {
                color = getColor(this.isSelected ? Theme.key_chat_inBubbleSelected : Theme.key_chat_inBubble);
                i7 = 0;
                i8 = 0;
                i9 = 0;
                z3 = false;
            }
            if (i7 != 0) {
                color = getColor(Theme.key_chat_outBubble);
            }
            if (this.themePreview) {
                c = 2;
            } else {
                c = this.currentType == 2 ? (char) 1 : (char) 0;
            }
            if (!this.isCrossfadeBackground && i8 != 0 && z3) {
                MotionBackgroundDrawable[] motionBackgroundDrawableArr = motionBackground;
                if (motionBackgroundDrawableArr[c] != null) {
                    int[] colors = motionBackgroundDrawableArr[c].getColors();
                    this.currentColor = colors[0];
                    this.currentGradientColor1 = colors[1];
                    this.currentGradientColor2 = colors[2];
                    this.currentGradientColor3 = colors[3];
                }
            }
            if (this.isCrossfadeBackground && i8 != 0 && z3) {
                if (i3 == this.currentBackgroundHeight && this.crosfadeFromBitmapShader != null && this.currentColor == color && this.currentGradientColor1 == i7 && this.currentGradientColor2 == i8 && this.currentGradientColor3 == i9 && this.currentAnimateGradient == z3) {
                    i11 = -1;
                } else {
                    if (this.crosfadeFromBitmap == null) {
                        this.crosfadeFromBitmap = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
                        Bitmap bitmap = this.crosfadeFromBitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        this.crosfadeFromBitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    }
                    MotionBackgroundDrawable[] motionBackgroundDrawableArr2 = motionBackground;
                    if (motionBackgroundDrawableArr2[c] == null) {
                        motionBackgroundDrawableArr2[c] = new MotionBackgroundDrawable();
                        if (this.currentType != 2) {
                            motionBackground[c].setPostInvalidateParent(true);
                        }
                        motionBackground[c].setRoundRadius(AndroidUtilities.dp(1.0f));
                    }
                    i11 = -1;
                    motionBackground[c].setColors(color, i7, i8, i9, this.crosfadeFromBitmap);
                    this.crosfadeFromBitmapShader.setLocalMatrix(this.matrix);
                }
                Shader shader = this.crosfadeFromBitmapShader;
                this.gradientShader = shader;
                this.paint.setShader(shader);
                this.paint.setColor(i11);
                this.currentColor = color;
                this.currentAnimateGradient = z3;
                this.currentGradientColor1 = i7;
                this.currentGradientColor2 = i8;
                this.currentGradientColor3 = i9;
            } else if (i7 != 0 && (this.gradientShader == null || i3 != this.currentBackgroundHeight || this.currentColor != color || this.currentGradientColor1 != i7 || this.currentGradientColor2 != i8 || this.currentGradientColor3 != i9 || this.currentAnimateGradient != z3)) {
                if (i8 != 0 && z3) {
                    MotionBackgroundDrawable[] motionBackgroundDrawableArr3 = motionBackground;
                    if (motionBackgroundDrawableArr3[c] == null) {
                        motionBackgroundDrawableArr3[c] = new MotionBackgroundDrawable();
                        if (this.currentType != 2) {
                            motionBackground[c].setPostInvalidateParent(true);
                        }
                        motionBackground[c].setRoundRadius(AndroidUtilities.dp(1.0f));
                    }
                    motionBackground[c].setColors(color, i7, i8, i9);
                    this.gradientShader = motionBackground[c].getBitmapShader();
                } else if (i8 == 0) {
                    this.gradientShader = new LinearGradient(0.0f, i5, 0.0f, i3, new int[]{i7, color}, (float[]) null, Shader.TileMode.CLAMP);
                } else if (i9 != 0) {
                    this.gradientShader = new LinearGradient(0.0f, i5, 0.0f, i3, new int[]{i9, i8, i7, color}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    this.gradientShader = new LinearGradient(0.0f, i5, 0.0f, i3, new int[]{i8, i7, color}, (float[]) null, Shader.TileMode.CLAMP);
                }
                this.paint.setShader(this.gradientShader);
                this.currentColor = color;
                this.currentAnimateGradient = z3;
                this.currentGradientColor1 = i7;
                this.currentGradientColor2 = i8;
                this.currentGradientColor3 = i9;
                this.paint.setColor(-1);
            } else if (i7 == 0) {
                if (this.gradientShader != null) {
                    this.gradientShader = null;
                    this.paint.setShader(null);
                }
                this.paint.setColor(color);
            }
            if (this.gradientShader instanceof BitmapShader) {
                i10 = 0;
                motionBackground[c].setBounds(0, i5, i2, i3 - i4);
            } else {
                i10 = 0;
            }
            this.currentBackgroundHeight = i3;
            if (this.gradientShader instanceof BitmapShader) {
                i10 = i4;
            }
            this.topY = i - i10;
            this.isTopNear = z;
            this.isBottomNear = z2;
        }

        public int getTopY() {
            return this.topY;
        }

        private int dp(float f) {
            if (this.currentType == 2) {
                return (int) Math.ceil(f * 3.0f);
            }
            return AndroidUtilities.dp(f);
        }

        public Paint getPaint() {
            return this.paint;
        }

        public Drawable[] getShadowDrawables() {
            return this.shadowDrawable;
        }

        public Drawable getBackgroundDrawable() {
            char c;
            int color;
            int i = this.overrideRoundRadius;
            boolean z = false;
            if (i == 0) {
                i = this.overrideRounding > 0.0f ? 0 : AndroidUtilities.dp(SharedConfig.bubbleRadius);
            }
            boolean z2 = this.isTopNear;
            char c2 = 3;
            if (z2 && this.isBottomNear) {
                c = 3;
            } else if (z2) {
                c = 2;
            } else {
                c = this.isBottomNear ? (char) 1 : (char) 0;
            }
            boolean z3 = this.isSelected;
            if (!z3 || !this.botButtonsBottom) {
                if (z3) {
                    c2 = 1;
                } else {
                    c2 = this.botButtonsBottom ? (char) 2 : (char) 0;
                }
            }
            boolean z4 = (this.gradientShader != null || z3 || this.isCrossfadeBackground) ? false : true;
            int color2 = getColor(this.isOut ? Theme.key_chat_outBubbleShadow : Theme.key_chat_inBubbleShadow);
            if (this.lastDrawWithShadow != z4 || this.currentBackgroundDrawableRadius[c2][c] != i || (z4 && this.shadowDrawableColor[c] != color2)) {
                this.currentBackgroundDrawableRadius[c2][c] = i;
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(dp(50.0f), dp(40.0f), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    this.backupRect.set(getBounds());
                    if (z4) {
                        this.shadowDrawableColor[c] = color2;
                        Paint paint = new Paint(1);
                        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, dp(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                        paint.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.MULTIPLY));
                        paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                        if (AndroidUtilities.density > 1.0f) {
                            setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                        } else {
                            setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        }
                        draw(canvas, paint);
                        if (AndroidUtilities.density > 1.0f) {
                            paint.setColor(0);
                            paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                            setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                            draw(canvas, paint);
                        }
                    }
                    Paint paint2 = new Paint(1);
                    paint2.setColor(-1);
                    setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    draw(canvas, paint2);
                    this.backgroundDrawable[c2][c] = new NinePatchDrawable(createBitmap, getByteBuffer((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1).array(), new Rect(), null);
                    try {
                        setBounds(this.backupRect);
                    } catch (Throwable unused) {
                    }
                    z = true;
                } catch (Throwable unused2) {
                }
            }
            this.lastDrawWithShadow = z4;
            if (this.isSelected) {
                color = getColor(this.isOut ? Theme.key_chat_outBubbleSelected : Theme.key_chat_inBubbleSelected);
            } else {
                color = getColor(this.isOut ? Theme.key_chat_outBubble : Theme.key_chat_inBubble);
            }
            Drawable[][] drawableArr = this.backgroundDrawable;
            if (drawableArr[c2][c] != null && (this.backgroundDrawableColor[c2][c] != color || z)) {
                drawableArr[c2][c].setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
                this.backgroundDrawableColor[c2][c] = color;
            }
            return this.backgroundDrawable[c2][c];
        }

        public Drawable getTransitionDrawable(int i) {
            if (this.transitionDrawable == null) {
                Bitmap createBitmap = Bitmap.createBitmap(dp(50.0f), dp(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                this.backupRect.set(getBounds());
                Paint paint = new Paint(1);
                paint.setColor(-1);
                setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                draw(canvas, paint);
                this.transitionDrawable = new NinePatchDrawable(createBitmap, getByteBuffer((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1).array(), new Rect(), null);
                setBounds(this.backupRect);
            }
            if (this.transitionDrawableColor != i) {
                this.transitionDrawableColor = i;
                this.transitionDrawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
            }
            return this.transitionDrawable;
        }

        public MotionBackgroundDrawable getMotionBackgroundDrawable() {
            if (this.themePreview) {
                return motionBackground[2];
            }
            return motionBackground[this.currentType == 2 ? (char) 1 : (char) 0];
        }

        public Drawable getShadowDrawable() {
            char c;
            if (this.isCrossfadeBackground) {
                return null;
            }
            if (this.gradientShader == null && !this.isSelected && this.crossfadeFromDrawable == null) {
                return null;
            }
            int dp = AndroidUtilities.dp(SharedConfig.bubbleRadius);
            boolean z = this.isTopNear;
            boolean z2 = false;
            if (z && this.isBottomNear) {
                c = 3;
            } else if (z) {
                c = 2;
            } else {
                c = this.isBottomNear ? (char) 1 : (char) 0;
            }
            int[] iArr = this.currentShadowDrawableRadius;
            if (iArr[c] != dp) {
                iArr[c] = dp;
                Bitmap[] bitmapArr = this.shadowDrawableBitmap;
                if (bitmapArr[c] != null) {
                    bitmapArr[c].recycle();
                }
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(dp(50.0f), dp(40.0f), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint(1);
                    paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, dp(40.0f), new int[]{358573417, 694117737}, (float[]) null, Shader.TileMode.CLAMP));
                    paint.setShadowLayer(2.0f, 0.0f, 1.0f, -1);
                    if (AndroidUtilities.density > 1.0f) {
                        setBounds(-1, -1, createBitmap.getWidth() + 1, createBitmap.getHeight() + 1);
                    } else {
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    }
                    draw(canvas, paint);
                    if (AndroidUtilities.density > 1.0f) {
                        paint.setColor(0);
                        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        draw(canvas, paint);
                    }
                    this.shadowDrawableBitmap[c] = createBitmap;
                    this.shadowDrawable[c] = new NinePatchDrawable(createBitmap, getByteBuffer((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1).array(), new Rect(), null);
                    z2 = true;
                } catch (Throwable unused) {
                }
            }
            int color = getColor(this.isOut ? Theme.key_chat_outBubbleShadow : Theme.key_chat_inBubbleShadow);
            Drawable[] drawableArr = this.shadowDrawable;
            if (drawableArr[c] != null && (this.shadowDrawableColor[c] != color || z2)) {
                drawableArr[c].setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
                this.shadowDrawableColor[c] = color;
            }
            return this.shadowDrawable[c];
        }

        protected void finalize() throws Throwable {
            Bitmap[] bitmapArr;
            super.finalize();
            for (Bitmap bitmap : this.shadowDrawableBitmap) {
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            Arrays.fill(this.shadowDrawableBitmap, (Object) null);
            Arrays.fill(this.shadowDrawable, (Object) null);
            Arrays.fill(this.currentShadowDrawableRadius, -1);
        }

        private static ByteBuffer getByteBuffer(int i, int i2, int i3, int i4) {
            ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
            order.put((byte) 1);
            order.put((byte) 2);
            order.put((byte) 2);
            order.put((byte) 9);
            order.putInt(0);
            order.putInt(0);
            order.putInt(0);
            order.putInt(0);
            order.putInt(0);
            order.putInt(0);
            order.putInt(0);
            order.putInt(i);
            order.putInt(i2);
            order.putInt(i3);
            order.putInt(i4);
            order.putInt(1);
            order.putInt(1);
            order.putInt(1);
            order.putInt(1);
            order.putInt(1);
            order.putInt(1);
            order.putInt(1);
            order.putInt(1);
            order.putInt(1);
            return order;
        }

        public void drawCached(Canvas canvas, PathDrawParams pathDrawParams, Paint paint) {
            this.pathDrawCacheParams = pathDrawParams;
            MessageDrawable messageDrawable = this.crossfadeFromDrawable;
            if (messageDrawable != null) {
                messageDrawable.pathDrawCacheParams = pathDrawParams;
            }
            draw(canvas, paint);
            this.pathDrawCacheParams = null;
            MessageDrawable messageDrawable2 = this.crossfadeFromDrawable;
            if (messageDrawable2 != null) {
                messageDrawable2.pathDrawCacheParams = null;
            }
        }

        public void drawCached(Canvas canvas, PathDrawParams pathDrawParams) {
            drawCached(canvas, pathDrawParams, null);
        }

        @Override
        public void draw(Canvas canvas) {
            MessageDrawable messageDrawable = this.crossfadeFromDrawable;
            if (messageDrawable != null) {
                messageDrawable.draw(canvas);
                setAlpha((int) (this.crossfadeProgress * 255.0f));
                draw(canvas, null);
                setAlpha(255);
                return;
            }
            draw(canvas, null);
        }

        public void draw(android.graphics.Canvas r22, android.graphics.Paint r23) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.Theme.MessageDrawable.draw(android.graphics.Canvas, android.graphics.Paint):void");
        }

        public void setDrawFullBubble(boolean z) {
            this.drawFullBubble = z;
        }

        @Override
        public void setAlpha(int i) {
            if (this.alpha != i || this.paint.getAlpha() != i) {
                this.alpha = i;
                this.paint.setAlpha(i);
                if (this.isOut) {
                    this.selectedPaint.setAlpha((int) (Color.alpha(getColor(Theme.key_chat_outBubbleGradientSelectedOverlay)) * (i / 255.0f)));
                }
            }
            if (this.gradientShader == null) {
                Drawable backgroundDrawable = getBackgroundDrawable();
                if (Build.VERSION.SDK_INT >= 19) {
                    if (backgroundDrawable.getAlpha() != i) {
                        backgroundDrawable.setAlpha(i);
                        return;
                    }
                    return;
                }
                backgroundDrawable.setAlpha(i);
            }
        }

        @Override
        public void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4);
            MessageDrawable messageDrawable = this.crossfadeFromDrawable;
            if (messageDrawable != null) {
                messageDrawable.setBounds(i, i2, i3, i4);
            }
        }

        public void setRoundRadius(int i) {
            this.overrideRoundRadius = i;
        }

        public void setRoundingRadius(float f) {
            this.overrideRounding = f;
        }

        public void setResourceProvider(ResourcesProvider resourcesProvider) {
            this.resourcesProvider = resourcesProvider;
        }

        public static class PathDrawParams {
            boolean lastDrawFullBottom;
            boolean lastDrawFullTop;
            Path path = new Path();
            Rect lastRect = new Rect();

            public boolean invalidatePath(Rect rect, boolean z, boolean z2) {
                boolean z3;
                if (!this.lastRect.isEmpty()) {
                    Rect rect2 = this.lastRect;
                    if (rect2.top == rect.top && rect2.bottom == rect.bottom && rect2.right == rect.right && rect2.left == rect.left && this.lastDrawFullTop == z2 && this.lastDrawFullBottom == z && z2 && z) {
                        z3 = false;
                        this.lastDrawFullTop = z2;
                        this.lastDrawFullBottom = z;
                        this.lastRect.set(rect);
                        return z3;
                    }
                }
                z3 = true;
                this.lastDrawFullTop = z2;
                this.lastDrawFullBottom = z;
                this.lastRect.set(rect);
                return z3;
            }

            public Path getPath() {
                return this.path;
            }
        }
    }

    public static class PatternsLoader implements NotificationCenter.NotificationCenterDelegate {
        private static PatternsLoader loader;
        private int account = UserConfig.selectedAccount;
        private HashMap<String, LoadingPattern> watingForLoad;

        public static class LoadingPattern {
            public ArrayList<ThemeAccent> accents;
            public TLRPC$TL_wallPaper pattern;

            private LoadingPattern() {
                this.accents = new ArrayList<>();
            }
        }

        public static void createLoader(boolean z) {
            ArrayList<ThemeAccent> arrayList;
            if (loader == null || z) {
                ArrayList arrayList2 = null;
                int i = 0;
                while (i < 5) {
                    ThemeInfo themeInfo = (ThemeInfo) Theme.themesDict.get(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Night" : "Day" : "Arctic Blue" : "Dark Blue" : "Blue");
                    if (themeInfo != null && (arrayList = themeInfo.themeAccents) != null && !arrayList.isEmpty()) {
                        int size = themeInfo.themeAccents.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ThemeAccent themeAccent = themeInfo.themeAccents.get(i2);
                            if (themeAccent.id != Theme.DEFALT_THEME_ACCENT_ID && !TextUtils.isEmpty(themeAccent.patternSlug)) {
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(themeAccent);
                            }
                        }
                    }
                    i++;
                }
                loader = new PatternsLoader(arrayList2);
            }
        }

        private PatternsLoader(final ArrayList<ThemeAccent> arrayList) {
            if (arrayList == null) {
                return;
            }
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    Theme.PatternsLoader.this.lambda$new$1(arrayList);
                }
            });
        }

        public void lambda$new$1(final ArrayList arrayList) {
            int size = arrayList.size();
            ArrayList arrayList2 = null;
            int i = 0;
            while (i < size) {
                ThemeAccent themeAccent = (ThemeAccent) arrayList.get(i);
                File pathToWallpaper = themeAccent.getPathToWallpaper();
                if (pathToWallpaper != null && pathToWallpaper.exists()) {
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
            TLRPC$TL_account_getMultiWallPapers tLRPC$TL_account_getMultiWallPapers = new TLRPC$TL_account_getMultiWallPapers();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                TLRPC$TL_inputWallPaperSlug tLRPC$TL_inputWallPaperSlug = new TLRPC$TL_inputWallPaperSlug();
                tLRPC$TL_inputWallPaperSlug.slug = (String) arrayList2.get(i2);
                tLRPC$TL_account_getMultiWallPapers.wallpapers.add(tLRPC$TL_inputWallPaperSlug);
            }
            ConnectionsManager.getInstance(this.account).sendRequest(tLRPC$TL_account_getMultiWallPapers, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    Theme.PatternsLoader.this.lambda$new$0(arrayList, tLObject, tLRPC$TL_error);
                }
            });
        }

        public void lambda$new$0(ArrayList arrayList, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            if (tLObject instanceof TLRPC$Vector) {
                TLRPC$Vector tLRPC$Vector = (TLRPC$Vector) tLObject;
                int size = tLRPC$Vector.objects.size();
                Bitmap bitmap = null;
                ArrayList<ThemeAccent> arrayList2 = null;
                int i = 0;
                while (i < size) {
                    TLRPC$WallPaper tLRPC$WallPaper = (TLRPC$WallPaper) tLRPC$Vector.objects.get(i);
                    if (tLRPC$WallPaper instanceof TLRPC$TL_wallPaper) {
                        TLRPC$TL_wallPaper tLRPC$TL_wallPaper = (TLRPC$TL_wallPaper) tLRPC$WallPaper;
                        if (tLRPC$TL_wallPaper.pattern) {
                            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tLRPC$TL_wallPaper.document, true);
                            int size2 = arrayList.size();
                            Bitmap bitmap2 = bitmap;
                            Boolean bool = bitmap2;
                            int i2 = 0;
                            AnonymousClass1 anonymousClass1 = bitmap;
                            while (i2 < size2) {
                                ThemeAccent themeAccent = (ThemeAccent) arrayList.get(i2);
                                bool = bool;
                                if (themeAccent.patternSlug.equals(tLRPC$TL_wallPaper.slug)) {
                                    if (bool == 0) {
                                        bool = Boolean.valueOf(pathToAttach.exists());
                                    }
                                    if (bitmap2 != null || bool.booleanValue()) {
                                        bitmap2 = createWallpaperForAccent(bitmap2, "application/x-tgwallpattern".equals(tLRPC$TL_wallPaper.document.mime_type), pathToAttach, themeAccent);
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList<>();
                                        }
                                        arrayList2.add(themeAccent);
                                    } else {
                                        String attachFileName = FileLoader.getAttachFileName(tLRPC$TL_wallPaper.document);
                                        if (this.watingForLoad == null) {
                                            this.watingForLoad = new HashMap<>();
                                        }
                                        LoadingPattern loadingPattern = this.watingForLoad.get(attachFileName);
                                        if (loadingPattern == null) {
                                            loadingPattern = new LoadingPattern();
                                            loadingPattern.pattern = tLRPC$TL_wallPaper;
                                            this.watingForLoad.put(attachFileName, loadingPattern);
                                        }
                                        loadingPattern.accents.add(themeAccent);
                                    }
                                }
                                i2++;
                                anonymousClass1 = 0;
                                bool = bool;
                            }
                            if (bitmap2 != null) {
                                bitmap2.recycle();
                            }
                            i++;
                            bitmap = null;
                        }
                    }
                    i++;
                    bitmap = null;
                }
                checkCurrentWallpaper(arrayList2, true);
            }
        }

        private void checkCurrentWallpaper(final ArrayList<ThemeAccent> arrayList, final boolean z) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    Theme.PatternsLoader.this.lambda$checkCurrentWallpaper$2(arrayList, z);
                }
            });
        }

        public void lambda$checkCurrentWallpaper$2(ArrayList<ThemeAccent> arrayList, boolean z) {
            if (arrayList != null && Theme.currentTheme.themeAccents != null && !Theme.currentTheme.themeAccents.isEmpty() && arrayList.contains(Theme.currentTheme.getAccent(false))) {
                Theme.reloadWallpaper(true);
            }
            if (z) {
                if (this.watingForLoad != null) {
                    NotificationCenter.getInstance(this.account).addObserver(this, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(this.account).addObserver(this, NotificationCenter.fileLoadFailed);
                    for (Map.Entry<String, LoadingPattern> entry : this.watingForLoad.entrySet()) {
                        FileLoader.getInstance(this.account).loadFile(ImageLocation.getForDocument(entry.getValue().pattern.document), "wallpaper", null, 0, 1);
                    }
                    return;
                }
                return;
            }
            HashMap<String, LoadingPattern> hashMap = this.watingForLoad;
            if (hashMap == null || hashMap.isEmpty()) {
                NotificationCenter.getInstance(this.account).removeObserver(this, NotificationCenter.fileLoaded);
                NotificationCenter.getInstance(this.account).removeObserver(this, NotificationCenter.fileLoadFailed);
            }
        }

        private Bitmap createWallpaperForAccent(Bitmap bitmap, boolean z, File file, ThemeAccent themeAccent) {
            Bitmap bitmap2;
            File pathToWallpaper;
            Drawable drawable;
            int patternColor;
            Bitmap loadScreenSizedBitmap;
            int i;
            int i2;
            int i3;
            try {
                pathToWallpaper = themeAccent.getPathToWallpaper();
                drawable = null;
            } catch (Throwable th) {
                th = th;
                bitmap2 = bitmap;
            }
            if (pathToWallpaper == null) {
                return null;
            }
            ThemeInfo themeInfo = themeAccent.parentTheme;
            SparseIntArray themeFileValues = Theme.getThemeFileValues(null, themeInfo.assetName, null);
            Theme.checkIsDark(themeFileValues, themeInfo);
            int i4 = themeAccent.accentColor;
            int i5 = (int) themeAccent.backgroundOverrideColor;
            long j = themeAccent.backgroundGradientOverrideColor1;
            int i6 = (int) j;
            if (i6 == 0 && j == 0) {
                if (i5 != 0) {
                    i4 = i5;
                }
                int i7 = themeFileValues.get(Theme.key_chat_wallpaper_gradient_to1);
                if (i7 != 0) {
                    i6 = Theme.changeColorAccent(themeInfo, i4, i7);
                }
            } else {
                i4 = 0;
            }
            long j2 = themeAccent.backgroundGradientOverrideColor2;
            int i8 = (int) j2;
            if (i8 == 0 && j2 == 0 && (i3 = themeFileValues.get(Theme.key_chat_wallpaper_gradient_to2)) != 0) {
                i8 = Theme.changeColorAccent(themeInfo, i4, i3);
            }
            long j3 = themeAccent.backgroundGradientOverrideColor3;
            int i9 = (int) j3;
            if (i9 == 0 && j3 == 0 && (i2 = themeFileValues.get(Theme.key_chat_wallpaper_gradient_to3)) != 0) {
                i9 = Theme.changeColorAccent(themeInfo, i4, i2);
            }
            if (i5 == 0 && (i = themeFileValues.get(Theme.key_chat_wallpaper)) != 0) {
                i5 = Theme.changeColorAccent(themeInfo, i4, i);
            }
            if (i8 != 0) {
                patternColor = MotionBackgroundDrawable.getPatternColor(i5, i6, i8, i9);
            } else if (i6 != 0) {
                Drawable backgroundGradientDrawable = new BackgroundGradientDrawable(BackgroundGradientDrawable.getGradientOrientation(themeAccent.backgroundRotation), new int[]{i5, i6});
                patternColor = AndroidUtilities.getPatternColor(AndroidUtilities.getAverageColor(i5, i6));
                drawable = backgroundGradientDrawable;
            } else {
                drawable = new ColorDrawable(i5);
                patternColor = AndroidUtilities.getPatternColor(i5);
            }
            if (bitmap == null) {
                Point point = AndroidUtilities.displaySize;
                int min = Math.min(point.x, point.y);
                Point point2 = AndroidUtilities.displaySize;
                int max = Math.max(point2.x, point2.y);
                if (!z) {
                    loadScreenSizedBitmap = Theme.loadScreenSizedBitmap(new FileInputStream(file), 0);
                } else {
                    loadScreenSizedBitmap = SvgHelper.getBitmap(file, min, max, false);
                }
                bitmap2 = loadScreenSizedBitmap;
            } else {
                bitmap2 = bitmap;
            }
            try {
                if (drawable != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    drawable.setBounds(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
                    drawable.draw(canvas);
                    Paint paint = new Paint(2);
                    paint.setColorFilter(new PorterDuffColorFilter(patternColor, PorterDuff.Mode.SRC_IN));
                    paint.setAlpha((int) (Math.abs(themeAccent.patternIntensity) * 255.0f));
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
                    createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(pathToWallpaper));
                } else {
                    FileOutputStream fileOutputStream = new FileOutputStream(pathToWallpaper);
                    bitmap2.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                    fileOutputStream.close();
                }
            } catch (Throwable th2) {
                th = th2;
                FileLog.e(th);
                return bitmap2;
            }
            return bitmap2;
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            HashMap<String, LoadingPattern> hashMap = this.watingForLoad;
            if (hashMap == null) {
                return;
            }
            if (i == NotificationCenter.fileLoaded) {
                final LoadingPattern remove = hashMap.remove((String) objArr[0]);
                if (remove != null) {
                    Utilities.globalQueue.postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            Theme.PatternsLoader.this.lambda$didReceivedNotification$3(remove);
                        }
                    });
                }
            } else if (i != NotificationCenter.fileLoadFailed || hashMap.remove((String) objArr[0]) == null) {
            } else {
                checkCurrentWallpaper(null, false);
            }
        }

        public void lambda$didReceivedNotification$3(LoadingPattern loadingPattern) {
            TLRPC$TL_wallPaper tLRPC$TL_wallPaper = loadingPattern.pattern;
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tLRPC$TL_wallPaper.document, true);
            int size = loadingPattern.accents.size();
            Bitmap bitmap = null;
            ArrayList<ThemeAccent> arrayList = null;
            for (int i = 0; i < size; i++) {
                ThemeAccent themeAccent = loadingPattern.accents.get(i);
                if (themeAccent.patternSlug.equals(tLRPC$TL_wallPaper.slug)) {
                    bitmap = createWallpaperForAccent(bitmap, "application/x-tgwallpattern".equals(tLRPC$TL_wallPaper.document.mime_type), pathToAttach, themeAccent);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        arrayList.add(themeAccent);
                    }
                }
            }
            if (bitmap != null) {
                bitmap.recycle();
            }
            checkCurrentWallpaper(arrayList, false);
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
        public TLRPC$TL_theme info;
        public boolean isDefault;
        public int myMessagesAccentColor;
        public boolean myMessagesAnimated;
        public int myMessagesGradientAccentColor1;
        public int myMessagesGradientAccentColor2;
        public int myMessagesGradientAccentColor3;
        public OverrideWallpaperInfo overrideWallpaper;
        public ThemeInfo parentTheme;
        public TLRPC$TL_wallPaper pattern;
        public float patternIntensity;
        public boolean patternMotion;
        public TLRPC$InputFile uploadedFile;
        public TLRPC$InputFile uploadedThumb;
        public String uploadingFile;
        public String uploadingThumb;
        public int backgroundRotation = 45;
        public String patternSlug = BuildConfig.APP_CENTER_HASH;
        private float[] tempHSV = new float[3];

        ThemeAccent() {
        }

        public boolean fillAccentColors(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
            int valueAt;
            boolean useBlackText;
            boolean z;
            int valueAt2;
            int valueAt3;
            int i;
            boolean useBlackText2;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            float[] tempHsv = Theme.getTempHsv(1);
            float[] tempHsv2 = Theme.getTempHsv(2);
            Color.colorToHSV(this.parentTheme.accentBaseColor, tempHsv);
            Color.colorToHSV(this.accentColor, tempHsv2);
            boolean isDark = this.parentTheme.isDark();
            if (this.accentColor != this.parentTheme.accentBaseColor || this.accentColor2 != 0) {
                for (int i7 = 0; i7 < Theme.defaultColors.length; i7++) {
                    if (!Theme.themeAccentExclusionKeys.contains(Integer.valueOf(i7))) {
                        int indexOfKey = sparseIntArray.indexOfKey(i7);
                        if (indexOfKey < 0) {
                            int i8 = Theme.fallbackKeys.get(i7, -1);
                            if (i8 < 0 || sparseIntArray.indexOfKey(i8) < 0) {
                                valueAt = Theme.defaultColors[i7];
                            }
                        } else {
                            valueAt = sparseIntArray.valueAt(indexOfKey);
                        }
                        int changeColorAccent = Theme.changeColorAccent(tempHsv, tempHsv2, valueAt, isDark);
                        if (changeColorAccent != valueAt) {
                            sparseIntArray2.put(i7, changeColorAccent);
                        }
                    }
                }
            }
            int i9 = this.myMessagesAccentColor;
            if ((i9 == 0 && this.accentColor == 0) || this.myMessagesGradientAccentColor1 == 0) {
                z = false;
            } else {
                if (i9 == 0) {
                    i9 = this.accentColor;
                }
                int i10 = Theme.key_chat_outBubble;
                int i11 = sparseIntArray.get(i10);
                if (i11 == 0) {
                    i11 = Theme.defaultColors[i10];
                }
                int colorDistance = AndroidUtilities.getColorDistance(i9, Theme.changeColorAccent(tempHsv, tempHsv2, i11, isDark));
                int colorDistance2 = AndroidUtilities.getColorDistance(i9, this.myMessagesGradientAccentColor1);
                if (this.myMessagesGradientAccentColor2 == 0) {
                    useBlackText = Theme.useBlackText(this.myMessagesAccentColor, this.myMessagesGradientAccentColor1);
                } else {
                    int averageColor = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(this.myMessagesAccentColor, this.myMessagesGradientAccentColor1), this.myMessagesGradientAccentColor2);
                    int i12 = this.myMessagesGradientAccentColor3;
                    if (i12 != 0) {
                        averageColor = AndroidUtilities.getAverageColor(averageColor, i12);
                    }
                    useBlackText = AndroidUtilities.computePerceivedBrightness(averageColor) > 0.705f;
                }
                z = useBlackText && colorDistance <= 35000 && colorDistance2 <= 35000;
                i9 = Theme.getAccentColor(tempHsv, i11, i9);
            }
            boolean z2 = (i9 == 0 || (((i5 = this.parentTheme.accentBaseColor) == 0 || i9 == i5) && ((i6 = this.accentColor) == 0 || i6 == i9))) ? false : true;
            if (z2 || this.accentColor2 != 0) {
                int i13 = this.accentColor2;
                if (i13 != 0) {
                    Color.colorToHSV(i13, tempHsv2);
                } else {
                    Color.colorToHSV(i9, tempHsv2);
                }
                for (int i14 = Theme.myMessagesStartIndex; i14 < Theme.myMessagesEndIndex; i14++) {
                    int indexOfKey2 = sparseIntArray.indexOfKey(i14);
                    if (indexOfKey2 < 0) {
                        int i15 = Theme.fallbackKeys.get(i14, -1);
                        if (i15 < 0 || sparseIntArray.get(i15, -1) < 0) {
                            valueAt3 = Theme.defaultColors[i14];
                        }
                    } else {
                        valueAt3 = sparseIntArray.valueAt(indexOfKey2);
                    }
                    int changeColorAccent2 = Theme.changeColorAccent(tempHsv, tempHsv2, valueAt3, isDark);
                    if (changeColorAccent2 != valueAt3) {
                        sparseIntArray2.put(i14, changeColorAccent2);
                    }
                }
                if (z2) {
                    Color.colorToHSV(i9, tempHsv2);
                    for (int i16 = Theme.myMessagesBubblesStartIndex; i16 < Theme.myMessagesBubblesEndIndex; i16++) {
                        int indexOfKey3 = sparseIntArray.indexOfKey(i16);
                        if (indexOfKey3 < 0) {
                            int i17 = Theme.fallbackKeys.get(i16, -1);
                            if (i17 < 0 || sparseIntArray.get(i17, -1) < 0) {
                                valueAt2 = Theme.defaultColors[i16];
                            }
                        } else {
                            valueAt2 = sparseIntArray.valueAt(indexOfKey3);
                        }
                        int changeColorAccent3 = Theme.changeColorAccent(tempHsv, tempHsv2, valueAt2, isDark);
                        if (changeColorAccent3 != valueAt2) {
                            sparseIntArray2.put(i16, changeColorAccent3);
                        }
                    }
                }
            }
            if (!z && (i = this.myMessagesGradientAccentColor1) != 0) {
                if (this.myMessagesGradientAccentColor2 == 0) {
                    useBlackText2 = Theme.useBlackText(this.myMessagesAccentColor, i);
                } else {
                    int averageColor2 = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(this.myMessagesAccentColor, i), this.myMessagesGradientAccentColor2);
                    int i18 = this.myMessagesGradientAccentColor3;
                    if (i18 != 0) {
                        averageColor2 = AndroidUtilities.getAverageColor(averageColor2, i18);
                    }
                    useBlackText2 = AndroidUtilities.computePerceivedBrightness(averageColor2) > 0.705f;
                }
                if (useBlackText2) {
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
            int i29 = sparseIntArray2.get(i28);
            if (i29 == 0) {
                i29 = Theme.getColor(i28);
            }
            int i30 = Theme.key_chat_inBubble;
            int i31 = sparseIntArray2.get(i30);
            if (i31 == 0) {
                i31 = Theme.getColor(i30);
            }
            TLRPC$TL_theme tLRPC$TL_theme = this.info;
            if (tLRPC$TL_theme != null && tLRPC$TL_theme.emoticon != null && !isDark) {
                sparseIntArray2.delete(Theme.key_chat_selectedBackground);
                int averageColor3 = averageColor(sparseIntArray2, Theme.key_chat_wallpaper_gradient_to1, Theme.key_chat_wallpaper_gradient_to2, Theme.key_chat_wallpaper_gradient_to3);
                if (averageColor3 == 0) {
                    averageColor3 = averageColor(sparseIntArray2, Theme.key_chat_wallpaper);
                }
                if (averageColor3 == 0) {
                    averageColor3 = this.accentColor;
                }
                int bubbleSelectedOverlay = bubbleSelectedOverlay(i29, averageColor3);
                sparseIntArray2.put(Theme.key_chat_outBubbleSelectedOverlay, bubbleSelectedOverlay);
                sparseIntArray2.put(Theme.key_chat_outBubbleGradientSelectedOverlay, bubbleSelectedOverlay);
                sparseIntArray2.put(Theme.key_chat_outBubbleSelected, Theme.blendOver(i29, bubbleSelectedOverlay));
                int bubbleSelectedOverlay2 = bubbleSelectedOverlay(i31, this.accentColor);
                sparseIntArray2.put(Theme.key_chat_inBubbleSelectedOverlay, bubbleSelectedOverlay2);
                sparseIntArray2.put(Theme.key_chat_inBubbleSelected, Theme.blendOver(i31, bubbleSelectedOverlay2));
            }
            if (!isDark) {
                sparseIntArray2.put(Theme.key_chat_inTextSelectionHighlight, textSelectionBackground(false, i31, this.accentColor));
                sparseIntArray2.put(Theme.key_chat_outTextSelectionHighlight, textSelectionBackground(true, i29, this.accentColor));
                sparseIntArray2.put(Theme.key_chat_outTextSelectionCursor, textSelectionHandle(i29, this.accentColor));
            }
            float hue = getHue(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText));
            sparseIntArray2.put(Theme.key_chat_outBubbleLocationPlaceholder, locationPlaceholderColor(hue, i29, isDark));
            sparseIntArray2.put(Theme.key_chat_inBubbleLocationPlaceholder, locationPlaceholderColor(hue, i31, isDark));
            int i32 = Theme.key_chat_messageLinkIn;
            int i33 = sparseIntArray2.get(i32);
            if (i33 == 0) {
                i33 = Theme.getColor(i32);
            }
            int i34 = Theme.key_chat_messageLinkOut;
            int i35 = sparseIntArray2.get(i34);
            if (i35 == 0) {
                i35 = Theme.getColor(i34);
            }
            sparseIntArray2.put(Theme.key_chat_linkSelectBackground, linkSelectionBackground(i33, i31, isDark));
            sparseIntArray2.put(Theme.key_chat_outLinkSelectBackground, linkSelectionBackground(i35, i29, isDark));
            int i36 = Theme.key_actionBarDefaultSubmenuBackground;
            int i37 = sparseIntArray2.get(i36);
            if (i37 == 0) {
                i37 = Theme.getColor(i36);
            }
            sparseIntArray2.put(Theme.key_actionBarDefaultSubmenuSeparator, Color.argb(Color.alpha(i37), Math.max(0, Color.red(i37) - 10), Math.max(0, Color.green(i37) - 10), Math.max(0, Color.blue(i37) - 10)));
            return !z;
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
            if (fArr2[1] <= 0.0f) {
                fArr2[0] = f;
            }
            fArr2[1] = Math.max(0.0f, Math.min(1.0f, fArr2[1] + 0.6f));
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
            if (fArr2[1] <= 0.0f || (fArr2[0] > 45.0f && fArr2[0] < 85.0f)) {
                fArr2[0] = f;
            }
            fArr2[1] = Math.max(0.0f, Math.min(1.0f, fArr2[1] + (fArr2[2] > 0.85f ? 0.25f : 0.45f)));
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
            if (fArr2[1] <= 0.0f || (fArr2[0] > 45.0f && fArr2[0] < 85.0f)) {
                fArr2[0] = f;
            }
            fArr2[1] = Math.max(0.0f, Math.min(1.0f, fArr2[1] + 0.6f));
            float[] fArr3 = this.tempHSV;
            fArr3[2] = Math.max(0.0f, Math.min(1.0f, fArr3[2] - (fArr3[2] > 0.7f ? 0.25f : 0.125f)));
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

        private int locationPlaceholderColor(float f, int i, boolean z) {
            if (z) {
                return 520093695;
            }
            Color.colorToHSV(i, this.tempHSV);
            float[] fArr = this.tempHSV;
            if (fArr[1] <= 0.0f || fArr[2] >= 1.0f || fArr[2] <= 0.0f) {
                fArr[0] = f;
                fArr[1] = 0.2f;
            } else {
                fArr[0] = MathUtils.clamp(fArr[0] + 0.22f, 0.0f, 1.0f);
                float[] fArr2 = this.tempHSV;
                fArr2[1] = MathUtils.clamp(fArr2[1] - 0.35f, 0.0f, 1.0f);
            }
            float[] fArr3 = this.tempHSV;
            fArr3[2] = MathUtils.clamp(fArr3[2] - 0.65f, 0.0f, 1.0f);
            return Color.HSVToColor(90, this.tempHSV);
        }

        private int averageColor(SparseIntArray sparseIntArray, int... iArr) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < iArr.length; i5++) {
                if (sparseIntArray.indexOfKey(iArr[i5]) >= 0) {
                    try {
                        int i6 = sparseIntArray.get(iArr[i5]);
                        i2 += Color.red(i6);
                        i3 += Color.green(i6);
                        i4 += Color.blue(i6);
                        i++;
                    } catch (Exception unused) {
                    }
                }
            }
            if (i == 0) {
                return 0;
            }
            return Color.argb(255, i2 / i, i3 / i, i4 / i);
        }

        public File getPathToWallpaper() {
            if (this.id < 100) {
                if (TextUtils.isEmpty(this.patternSlug)) {
                    return null;
                }
                return new File(ApplicationLoader.getFilesDirFixed(), String.format(Locale.US, "%s_%d_%s_v5.jpg", this.parentTheme.getKey(), Integer.valueOf(this.id), this.patternSlug));
            } else if (TextUtils.isEmpty(this.patternSlug)) {
                return null;
            } else {
                return new File(ApplicationLoader.getFilesDirFixed(), String.format(Locale.US, "%s_%d_%s_v8_debug.jpg", this.parentTheme.getKey(), Integer.valueOf(this.id), this.patternSlug));
            }
        }

        public java.io.File saveToFile() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.Theme.ThemeAccent.saveToFile():java.io.File");
        }
    }

    public static int blendOver(int i, int i2) {
        float alpha = Color.alpha(i2) / 255.0f;
        float alpha2 = Color.alpha(i) / 255.0f;
        float f = 1.0f - alpha;
        float f2 = (alpha2 * f) + alpha;
        if (f2 == 0.0f) {
            return 0;
        }
        return Color.argb((int) (255.0f * f2), (int) (((Color.red(i2) * alpha) + ((Color.red(i) * alpha2) * f)) / f2), (int) (((Color.green(i2) * alpha) + ((Color.green(i) * alpha2) * f)) / f2), (int) (((Color.blue(i2) * alpha) + ((Color.blue(i) * alpha2) * f)) / f2));
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
        tempHsv[1] = MathUtils.clamp(tempHsv[1] + f, 0.0f, 1.0f);
        tempHsv[2] = MathUtils.clamp(tempHsv[2] + f2, 0.0f, 1.0f);
        return Color.HSVToColor(Color.alpha(i), tempHsv);
    }

    public static int percentSV(int i, int i2, float f, float f2) {
        float[] tempHsv = getTempHsv(5);
        Color.colorToHSV(i2, tempHsv);
        float f3 = tempHsv[1];
        float f4 = tempHsv[2];
        Color.colorToHSV(i, tempHsv);
        tempHsv[1] = MathUtils.clamp(AndroidUtilities.lerp(tempHsv[1], f3, f), 0.0f, 1.0f);
        tempHsv[2] = MathUtils.clamp(AndroidUtilities.lerp(tempHsv[2], f4, f2), 0.0f, 1.0f);
        return Color.HSVToColor(AndroidUtilities.lerp(Color.alpha(i), Color.alpha(i2), 0.85f), tempHsv);
    }

    public static int multAlpha(int i, float f) {
        return ColorUtils.setAlphaComponent(i, MathUtils.clamp((int) (Color.alpha(i) * f), 0, 255));
    }

    public static class OverrideWallpaperInfo {
        public long accessHash;
        public int color;
        public long dialogId;
        public String fileName;
        public int gradientColor1;
        public int gradientColor2;
        public int gradientColor3;
        public float intensity;
        public boolean isBlurred;
        public boolean isMotion;
        public String originalFileName;
        public ThemeAccent parentAccent;
        public ThemeInfo parentTheme;
        public TLRPC$WallPaper prevUserWallpaper;
        public ArrayList<Integer> requestIds;
        public int rotation;
        public String slug;
        public float uploadingProgress;
        public long wallpaperId;

        public OverrideWallpaperInfo() {
            this.fileName = BuildConfig.APP_CENTER_HASH;
            this.originalFileName = BuildConfig.APP_CENTER_HASH;
            this.slug = BuildConfig.APP_CENTER_HASH;
        }

        public OverrideWallpaperInfo(OverrideWallpaperInfo overrideWallpaperInfo, ThemeInfo themeInfo, ThemeAccent themeAccent) {
            this.fileName = BuildConfig.APP_CENTER_HASH;
            this.originalFileName = BuildConfig.APP_CENTER_HASH;
            this.slug = BuildConfig.APP_CENTER_HASH;
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
                    String generateWallpaperName = this.parentTheme.generateWallpaperName(this.parentAccent, false);
                    this.fileName = generateWallpaperName;
                    AndroidUtilities.copyFile(file, new File(filesDirFixed, generateWallpaperName));
                } catch (Exception e) {
                    this.fileName = BuildConfig.APP_CENTER_HASH;
                    FileLog.e(e);
                }
            } else {
                this.fileName = BuildConfig.APP_CENTER_HASH;
            }
            if (!TextUtils.isEmpty(overrideWallpaperInfo.originalFileName)) {
                if (!overrideWallpaperInfo.originalFileName.equals(overrideWallpaperInfo.fileName)) {
                    try {
                        File file2 = new File(ApplicationLoader.getFilesDirFixed(), overrideWallpaperInfo.originalFileName);
                        File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                        String generateWallpaperName2 = this.parentTheme.generateWallpaperName(this.parentAccent, true);
                        this.originalFileName = generateWallpaperName2;
                        AndroidUtilities.copyFile(file2, new File(filesDirFixed2, generateWallpaperName2));
                        return;
                    } catch (Exception e2) {
                        this.originalFileName = BuildConfig.APP_CENTER_HASH;
                        FileLog.e(e2);
                        return;
                    }
                }
                this.originalFileName = this.fileName;
                return;
            }
            this.originalFileName = BuildConfig.APP_CENTER_HASH;
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
                SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
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
                    str = BuildConfig.APP_CENTER_HASH;
                }
                jSONObject.put("wallSlug", str);
                jSONObject.put("wBlur", this.isBlurred);
                jSONObject.put("wMotion", this.isMotion);
                jSONObject.put("pIntensity", this.intensity);
                edit.putString(key, jSONObject.toString());
                edit.commit();
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
        public LongSparseArray<ThemeAccent> accentsByThemeId;
        public int account;
        public String assetName;
        public boolean badWallpaper;
        public LongSparseArray<ThemeAccent> chatAccentsByThemeId;
        public int currentAccentId;
        public int defaultAccentCount;
        public boolean firstAccentIsDefault;
        public TLRPC$TL_theme info;
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
        public ArrayList<ThemeAccent> themeAccents;
        public SparseArray<ThemeAccent> themeAccentsMap;
        public boolean themeLoaded;
        public TLRPC$InputFile uploadedFile;
        public TLRPC$InputFile uploadedThumb;
        public String uploadingFile;
        public String uploadingThumb;

        ThemeInfo() {
            this.patternBgGradientRotation = 45;
            this.loaded = true;
            this.themeLoaded = true;
            this.prevAccentId = -1;
            this.chatAccentsByThemeId = new LongSparseArray<>();
            this.lastChatThemeId = 0;
            this.lastAccentId = 100;
            this.isDark = -1;
        }

        public ThemeInfo(ThemeInfo themeInfo) {
            this.patternBgGradientRotation = 45;
            this.loaded = true;
            this.themeLoaded = true;
            this.prevAccentId = -1;
            this.chatAccentsByThemeId = new LongSparseArray<>();
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
                TLRPC$TL_theme tLRPC$TL_theme = this.info;
                if (tLRPC$TL_theme != null) {
                    SerializedData serializedData = new SerializedData(tLRPC$TL_theme.getObjectSize());
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
            ArrayList<ThemeAccent> arrayList = this.themeAccents;
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = this.themeAccents.size();
                for (int i = 0; i < size; i++) {
                    ThemeAccent themeAccent = this.themeAccents.get(i);
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
                return LocaleController.getString("ThemeClassic", R.string.ThemeClassic);
            }
            if ("Dark Blue".equals(this.name)) {
                return LocaleController.getString("ThemeDark", R.string.ThemeDark);
            }
            if ("Arctic Blue".equals(this.name)) {
                return LocaleController.getString("ThemeArcticBlue", R.string.ThemeArcticBlue);
            }
            if ("Day".equals(this.name)) {
                return LocaleController.getString("ThemeDay", R.string.ThemeDay);
            }
            if ("Night".equals(this.name)) {
                return LocaleController.getString("ThemeNight", R.string.ThemeNight);
            }
            TLRPC$TL_theme tLRPC$TL_theme = this.info;
            return tLRPC$TL_theme != null ? tLRPC$TL_theme.title : this.name;
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
            if (this.firstAccentIsDefault) {
                int i = this.currentAccentId;
                int i2 = Theme.DEFALT_THEME_ACCENT_ID;
                if (i == i2) {
                    return true;
                }
                ThemeAccent themeAccent = this.themeAccentsMap.get(i2);
                ThemeAccent themeAccent2 = this.themeAccentsMap.get(this.currentAccentId);
                return themeAccent != null && themeAccent2 != null && themeAccent.myMessagesAccentColor == themeAccent2.myMessagesAccentColor && themeAccent.myMessagesGradientAccentColor1 == themeAccent2.myMessagesGradientAccentColor1 && themeAccent.myMessagesGradientAccentColor2 == themeAccent2.myMessagesGradientAccentColor2 && themeAccent.myMessagesGradientAccentColor3 == themeAccent2.myMessagesGradientAccentColor3 && themeAccent.myMessagesAnimated == themeAccent2.myMessagesAnimated;
            }
            return false;
        }

        public boolean isDefaultMyMessages() {
            if (this.firstAccentIsDefault) {
                int i = this.currentAccentId;
                int i2 = Theme.DEFALT_THEME_ACCENT_ID;
                if (i == i2) {
                    return true;
                }
                ThemeAccent themeAccent = this.themeAccentsMap.get(i2);
                ThemeAccent themeAccent2 = this.themeAccentsMap.get(this.currentAccentId);
                return themeAccent != null && themeAccent2 != null && themeAccent.accentColor2 == themeAccent2.accentColor2 && themeAccent.myMessagesAccentColor == themeAccent2.myMessagesAccentColor && themeAccent.myMessagesGradientAccentColor1 == themeAccent2.myMessagesGradientAccentColor1 && themeAccent.myMessagesGradientAccentColor2 == themeAccent2.myMessagesGradientAccentColor2 && themeAccent.myMessagesGradientAccentColor3 == themeAccent2.myMessagesGradientAccentColor3 && themeAccent.myMessagesAnimated == themeAccent2.myMessagesAnimated;
            }
            return false;
        }

        public boolean isDefaultMainAccent() {
            if (this.firstAccentIsDefault) {
                int i = this.currentAccentId;
                int i2 = Theme.DEFALT_THEME_ACCENT_ID;
                if (i == i2) {
                    return true;
                }
                ThemeAccent themeAccent = this.themeAccentsMap.get(i2);
                ThemeAccent themeAccent2 = this.themeAccentsMap.get(this.currentAccentId);
                return (themeAccent2 == null || themeAccent == null || themeAccent.accentColor != themeAccent2.accentColor) ? false : true;
            }
            return false;
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
                    SerializedData serializedData = new SerializedData(Utilities.hexToBytes(jSONObject.getString("info")));
                    themeInfo.info = TLRPC$Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
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
            String[] split = str.split("\\|");
            if (split.length != 2) {
                return null;
            }
            ThemeInfo themeInfo = new ThemeInfo();
            themeInfo.name = split[0];
            themeInfo.pathToFile = split[1];
            return themeInfo;
        }

        public void setAccentColorOptions(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
            this.defaultAccentCount = iArr.length;
            this.themeAccents = new ArrayList<>();
            this.themeAccentsMap = new SparseArray<>();
            this.accentsByThemeId = new LongSparseArray<>();
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
                    themeAccent.backgroundOverrideColor = iArr4[i];
                    if (this.firstAccentIsDefault && themeAccent.id == Theme.DEFALT_THEME_ACCENT_ID) {
                        themeAccent.backgroundOverrideColor = 4294967296L;
                    } else {
                        themeAccent.backgroundOverrideColor = iArr4[i];
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
                    themeAccent.myMessagesAccentColor = -10128392;
                    themeAccent.myMessagesGradientAccentColor1 = -9026357;
                    themeAccent.myMessagesGradientAccentColor2 = -7845452;
                    themeAccent.myMessagesGradientAccentColor3 = -5811800;
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
            this.accentBaseColor = this.themeAccentsMap.get(0).accentColor;
        }

        public void loadThemeDocument() {
            this.loaded = false;
            this.loadingThemeWallpaperName = null;
            this.newPathToWallpaper = null;
            addObservers();
            FileLoader fileLoader = FileLoader.getInstance(this.account);
            TLRPC$TL_theme tLRPC$TL_theme = this.info;
            fileLoader.loadFile(tLRPC$TL_theme.document, tLRPC$TL_theme, 1, 1);
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
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                int i = NotificationCenter.needSetDayNightTheme;
                Object[] objArr = new Object[5];
                objArr[0] = this;
                objArr[1] = Boolean.valueOf(this == Theme.currentNightTheme);
                objArr[2] = null;
                objArr[3] = -1;
                objArr[4] = Theme.fallbackKeys;
                globalInstance.lambda$postNotificationNameOnUIThread$1(i, objArr);
            }
        }

        public static boolean accentEquals(ThemeAccent themeAccent, TLRPC$ThemeSettings tLRPC$ThemeSettings) {
            long j;
            long j2;
            int i;
            String str;
            float f;
            int i2;
            TLRPC$WallPaperSettings tLRPC$WallPaperSettings;
            int i3;
            int i4;
            int i5;
            long j3;
            int intValue = tLRPC$ThemeSettings.message_colors.size() > 0 ? tLRPC$ThemeSettings.message_colors.get(0).intValue() | (-16777216) : 0;
            int intValue2 = tLRPC$ThemeSettings.message_colors.size() > 1 ? tLRPC$ThemeSettings.message_colors.get(1).intValue() | (-16777216) : 0;
            if (intValue == intValue2) {
                intValue2 = 0;
            }
            int intValue3 = tLRPC$ThemeSettings.message_colors.size() > 2 ? tLRPC$ThemeSettings.message_colors.get(2).intValue() | (-16777216) : 0;
            int intValue4 = tLRPC$ThemeSettings.message_colors.size() > 3 ? (-16777216) | tLRPC$ThemeSettings.message_colors.get(3).intValue() : 0;
            TLRPC$WallPaper tLRPC$WallPaper = tLRPC$ThemeSettings.wallpaper;
            long j4 = 0;
            if (tLRPC$WallPaper == null || (tLRPC$WallPaperSettings = tLRPC$WallPaper.settings) == null) {
                j = 0;
                j2 = 0;
                i = 0;
                str = null;
                f = 0.0f;
                i2 = 0;
            } else {
                i2 = Theme.getWallpaperColor(tLRPC$WallPaperSettings.background_color);
                long wallpaperColor = tLRPC$ThemeSettings.wallpaper.settings.second_background_color == 0 ? 4294967296L : Theme.getWallpaperColor(i3);
                long wallpaperColor2 = tLRPC$ThemeSettings.wallpaper.settings.third_background_color == 0 ? 4294967296L : Theme.getWallpaperColor(i4);
                long wallpaperColor3 = tLRPC$ThemeSettings.wallpaper.settings.fourth_background_color == 0 ? 4294967296L : Theme.getWallpaperColor(i5);
                int wallpaperRotation = AndroidUtilities.getWallpaperRotation(tLRPC$ThemeSettings.wallpaper.settings.rotation, false);
                TLRPC$WallPaper tLRPC$WallPaper2 = tLRPC$ThemeSettings.wallpaper;
                if ((tLRPC$WallPaper2 instanceof TLRPC$TL_wallPaperNoFile) || !tLRPC$WallPaper2.pattern) {
                    i = wallpaperRotation;
                    j3 = wallpaperColor2;
                    str = null;
                    f = 0.0f;
                } else {
                    j3 = wallpaperColor2;
                    f = tLRPC$WallPaper2.settings.intensity / 100.0f;
                    str = tLRPC$WallPaper2.slug;
                    i = wallpaperRotation;
                }
                long j5 = wallpaperColor3;
                j4 = wallpaperColor;
                j = j3;
                j2 = j5;
            }
            return tLRPC$ThemeSettings.accent_color == themeAccent.accentColor && tLRPC$ThemeSettings.outbox_accent_color == themeAccent.accentColor2 && intValue == themeAccent.myMessagesAccentColor && intValue2 == themeAccent.myMessagesGradientAccentColor1 && intValue3 == themeAccent.myMessagesGradientAccentColor2 && intValue4 == themeAccent.myMessagesGradientAccentColor3 && tLRPC$ThemeSettings.message_colors_animated == themeAccent.myMessagesAnimated && ((long) i2) == themeAccent.backgroundOverrideColor && j4 == themeAccent.backgroundGradientOverrideColor1 && j == themeAccent.backgroundGradientOverrideColor2 && j2 == themeAccent.backgroundGradientOverrideColor3 && i == themeAccent.backgroundRotation && TextUtils.equals(str, themeAccent.patternSlug) && ((double) Math.abs(f - themeAccent.patternIntensity)) < 0.001d;
        }

        public static void fillAccentValues(ThemeAccent themeAccent, TLRPC$ThemeSettings tLRPC$ThemeSettings) {
            TLRPC$WallPaperSettings tLRPC$WallPaperSettings;
            themeAccent.accentColor = tLRPC$ThemeSettings.accent_color;
            themeAccent.accentColor2 = tLRPC$ThemeSettings.outbox_accent_color;
            themeAccent.myMessagesAccentColor = tLRPC$ThemeSettings.message_colors.size() > 0 ? tLRPC$ThemeSettings.message_colors.get(0).intValue() | (-16777216) : 0;
            int intValue = tLRPC$ThemeSettings.message_colors.size() > 1 ? tLRPC$ThemeSettings.message_colors.get(1).intValue() | (-16777216) : 0;
            themeAccent.myMessagesGradientAccentColor1 = intValue;
            if (themeAccent.myMessagesAccentColor == intValue) {
                themeAccent.myMessagesGradientAccentColor1 = 0;
            }
            themeAccent.myMessagesGradientAccentColor2 = tLRPC$ThemeSettings.message_colors.size() > 2 ? tLRPC$ThemeSettings.message_colors.get(2).intValue() | (-16777216) : 0;
            themeAccent.myMessagesGradientAccentColor3 = tLRPC$ThemeSettings.message_colors.size() > 3 ? tLRPC$ThemeSettings.message_colors.get(3).intValue() | (-16777216) : 0;
            themeAccent.myMessagesAnimated = tLRPC$ThemeSettings.message_colors_animated;
            TLRPC$WallPaper tLRPC$WallPaper = tLRPC$ThemeSettings.wallpaper;
            if (tLRPC$WallPaper == null || (tLRPC$WallPaperSettings = tLRPC$WallPaper.settings) == null) {
                return;
            }
            int i = tLRPC$WallPaperSettings.background_color;
            if (i == 0) {
                themeAccent.backgroundOverrideColor = 4294967296L;
            } else {
                themeAccent.backgroundOverrideColor = Theme.getWallpaperColor(i);
            }
            TLRPC$WallPaperSettings tLRPC$WallPaperSettings2 = tLRPC$ThemeSettings.wallpaper.settings;
            if ((tLRPC$WallPaperSettings2.flags & 16) != 0 && tLRPC$WallPaperSettings2.second_background_color == 0) {
                themeAccent.backgroundGradientOverrideColor1 = 4294967296L;
            } else {
                themeAccent.backgroundGradientOverrideColor1 = Theme.getWallpaperColor(tLRPC$WallPaperSettings2.second_background_color);
            }
            TLRPC$WallPaperSettings tLRPC$WallPaperSettings3 = tLRPC$ThemeSettings.wallpaper.settings;
            if ((tLRPC$WallPaperSettings3.flags & 32) != 0 && tLRPC$WallPaperSettings3.third_background_color == 0) {
                themeAccent.backgroundGradientOverrideColor2 = 4294967296L;
            } else {
                themeAccent.backgroundGradientOverrideColor2 = Theme.getWallpaperColor(tLRPC$WallPaperSettings3.third_background_color);
            }
            TLRPC$WallPaperSettings tLRPC$WallPaperSettings4 = tLRPC$ThemeSettings.wallpaper.settings;
            if ((tLRPC$WallPaperSettings4.flags & 64) != 0 && tLRPC$WallPaperSettings4.fourth_background_color == 0) {
                themeAccent.backgroundGradientOverrideColor3 = 4294967296L;
            } else {
                themeAccent.backgroundGradientOverrideColor3 = Theme.getWallpaperColor(tLRPC$WallPaperSettings4.fourth_background_color);
            }
            themeAccent.backgroundRotation = AndroidUtilities.getWallpaperRotation(tLRPC$ThemeSettings.wallpaper.settings.rotation, false);
            TLRPC$WallPaper tLRPC$WallPaper2 = tLRPC$ThemeSettings.wallpaper;
            if ((tLRPC$WallPaper2 instanceof TLRPC$TL_wallPaperNoFile) || !tLRPC$WallPaper2.pattern) {
                return;
            }
            themeAccent.patternSlug = tLRPC$WallPaper2.slug;
            TLRPC$WallPaperSettings tLRPC$WallPaperSettings5 = tLRPC$WallPaper2.settings;
            themeAccent.patternIntensity = tLRPC$WallPaperSettings5.intensity / 100.0f;
            themeAccent.patternMotion = tLRPC$WallPaperSettings5.motion;
        }

        public ThemeAccent createNewAccent(TLRPC$ThemeSettings tLRPC$ThemeSettings) {
            ThemeAccent themeAccent = new ThemeAccent();
            fillAccentValues(themeAccent, tLRPC$ThemeSettings);
            themeAccent.parentTheme = this;
            return themeAccent;
        }

        public ThemeAccent createNewAccent(TLRPC$TL_theme tLRPC$TL_theme, int i) {
            return createNewAccent(tLRPC$TL_theme, i, false, 0);
        }

        public ThemeAccent createNewAccent(TLRPC$TL_theme tLRPC$TL_theme, int i, boolean z, int i2) {
            if (tLRPC$TL_theme == null) {
                return null;
            }
            TLRPC$ThemeSettings tLRPC$ThemeSettings = i2 < tLRPC$TL_theme.settings.size() ? tLRPC$TL_theme.settings.get(i2) : null;
            if (z) {
                ThemeAccent themeAccent = this.chatAccentsByThemeId.get(tLRPC$TL_theme.id);
                if (themeAccent != null) {
                    return themeAccent;
                }
                int i3 = this.lastChatThemeId + 1;
                this.lastChatThemeId = i3;
                ThemeAccent createNewAccent = createNewAccent(tLRPC$ThemeSettings);
                createNewAccent.id = i3;
                createNewAccent.info = tLRPC$TL_theme;
                createNewAccent.account = i;
                this.chatAccentsByThemeId.put(i3, createNewAccent);
                return createNewAccent;
            }
            ThemeAccent themeAccent2 = this.accentsByThemeId.get(tLRPC$TL_theme.id);
            if (themeAccent2 != null) {
                return themeAccent2;
            }
            int i4 = this.lastAccentId + 1;
            this.lastAccentId = i4;
            ThemeAccent createNewAccent2 = createNewAccent(tLRPC$ThemeSettings);
            createNewAccent2.id = i4;
            createNewAccent2.info = tLRPC$TL_theme;
            createNewAccent2.account = i;
            this.themeAccentsMap.put(i4, createNewAccent2);
            this.themeAccents.add(0, createNewAccent2);
            Theme.sortAccents(this);
            this.accentsByThemeId.put(tLRPC$TL_theme.id, createNewAccent2);
            return createNewAccent2;
        }

        public ThemeAccent getAccent(boolean z) {
            ThemeAccent themeAccent;
            if (this.themeAccents == null || (themeAccent = this.themeAccentsMap.get(this.currentAccentId)) == null) {
                return null;
            }
            if (z) {
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
            return themeAccent;
        }

        public int getAccentColor(int i) {
            ThemeAccent themeAccent = this.themeAccentsMap.get(i);
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
                    Bitmap createBitmap = Bitmap.createBitmap(scaledBitmap.getWidth(), scaledBitmap.getHeight(), scaledBitmap.getConfig());
                    Canvas canvas = new Canvas(createBitmap);
                    int i = this.patternBgGradientColor2;
                    if (i != 0) {
                        patternColor = MotionBackgroundDrawable.getPatternColor(this.patternBgColor, this.patternBgGradientColor1, i, this.patternBgGradientColor3);
                    } else {
                        int i2 = this.patternBgGradientColor1;
                        if (i2 != 0) {
                            patternColor = AndroidUtilities.getAverageColor(this.patternBgColor, i2);
                            GradientDrawable gradientDrawable = new GradientDrawable(BackgroundGradientDrawable.getGradientOrientation(this.patternBgGradientRotation), new int[]{this.patternBgColor, this.patternBgGradientColor1});
                            gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
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
                    scaledBitmap = createBitmap;
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
                TLRPC$TL_theme tLRPC$TL_theme = this.info;
                if (tLRPC$TL_theme == null || tLRPC$TL_theme.document == null) {
                    return;
                }
                if (str.equals(this.loadingThemeWallpaperName)) {
                    this.loadingThemeWallpaperName = null;
                    final File file = (File) objArr[1];
                    Utilities.globalQueue.postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            Theme.ThemeInfo.this.lambda$didReceivedNotification$0(file);
                        }
                    });
                } else if (str.equals(FileLoader.getAttachFileName(this.info.document))) {
                    removeObservers();
                    if (i == i3) {
                        File file2 = new File(this.pathToFile);
                        TLRPC$TL_theme tLRPC$TL_theme2 = this.info;
                        final ThemeInfo fillThemeValues = Theme.fillThemeValues(file2, tLRPC$TL_theme2.title, tLRPC$TL_theme2);
                        if (fillThemeValues != null && fillThemeValues.pathToWallpaper != null && !new File(fillThemeValues.pathToWallpaper).exists()) {
                            this.patternBgColor = fillThemeValues.patternBgColor;
                            this.patternBgGradientColor1 = fillThemeValues.patternBgGradientColor1;
                            this.patternBgGradientColor2 = fillThemeValues.patternBgGradientColor2;
                            this.patternBgGradientColor3 = fillThemeValues.patternBgGradientColor3;
                            this.patternBgGradientRotation = fillThemeValues.patternBgGradientRotation;
                            this.isBlured = fillThemeValues.isBlured;
                            this.patternIntensity = fillThemeValues.patternIntensity;
                            this.newPathToWallpaper = fillThemeValues.pathToWallpaper;
                            TLRPC$TL_account_getWallPaper tLRPC$TL_account_getWallPaper = new TLRPC$TL_account_getWallPaper();
                            TLRPC$TL_inputWallPaperSlug tLRPC$TL_inputWallPaperSlug = new TLRPC$TL_inputWallPaperSlug();
                            tLRPC$TL_inputWallPaperSlug.slug = fillThemeValues.slug;
                            tLRPC$TL_account_getWallPaper.wallpaper = tLRPC$TL_inputWallPaperSlug;
                            ConnectionsManager.getInstance(fillThemeValues.account).sendRequest(tLRPC$TL_account_getWallPaper, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                    Theme.ThemeInfo.this.lambda$didReceivedNotification$2(fillThemeValues, tLObject, tLRPC$TL_error);
                                }
                            });
                            return;
                        }
                        onFinishLoadingRemoteTheme();
                    }
                }
            }
        }

        public void lambda$didReceivedNotification$0(File file) {
            createBackground(file, this.newPathToWallpaper);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    Theme.ThemeInfo.this.onFinishLoadingRemoteTheme();
                }
            });
        }

        public void lambda$didReceivedNotification$2(final ThemeInfo themeInfo, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    Theme.ThemeInfo.this.lambda$didReceivedNotification$1(tLObject, themeInfo);
                }
            });
        }

        public void lambda$didReceivedNotification$1(TLObject tLObject, ThemeInfo themeInfo) {
            if (tLObject instanceof TLRPC$TL_wallPaper) {
                TLRPC$TL_wallPaper tLRPC$TL_wallPaper = (TLRPC$TL_wallPaper) tLObject;
                this.loadingThemeWallpaperName = FileLoader.getAttachFileName(tLRPC$TL_wallPaper.document);
                addObservers();
                FileLoader.getInstance(themeInfo.account).loadFile(tLRPC$TL_wallPaper.document, tLRPC$TL_wallPaper, 1, 1);
                return;
            }
            onFinishLoadingRemoteTheme();
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

        void setAnimatedColor(int i, int i2);

        public final class CC {
            public static Drawable $default$getDrawable(ResourcesProvider resourcesProvider, String str) {
                return null;
            }

            public static boolean $default$hasGradientService(ResourcesProvider resourcesProvider) {
                return false;
            }

            public static void $default$setAnimatedColor(ResourcesProvider resourcesProvider, int i, int i2) {
            }
        }
    }

    public static void sortAccents(ThemeInfo themeInfo) {
        Collections.sort(themeInfo.themeAccents, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$sortAccents$0;
                lambda$sortAccents$0 = Theme.lambda$sortAccents$0((Theme.ThemeAccent) obj, (Theme.ThemeAccent) obj2);
                return lambda$sortAccents$0;
            }
        });
    }

    public static int lambda$sortAccents$0(ThemeAccent themeAccent, ThemeAccent themeAccent2) {
        if (isHome(themeAccent)) {
            return -1;
        }
        if (isHome(themeAccent2)) {
            return 1;
        }
        ?? r0 = themeAccent.isDefault;
        ?? r3 = themeAccent2.isDefault;
        if (r0 != r3) {
            return r0 > r3 ? -1 : 1;
        } else if (r0 != 0) {
            int i = themeAccent.id;
            int i2 = themeAccent2.id;
            if (i > i2) {
                return 1;
            }
            return i < i2 ? -1 : 0;
        } else {
            int i3 = themeAccent.id;
            int i4 = themeAccent2.id;
            if (i3 > i4) {
                return -1;
            }
            return i3 < i4 ? 1 : 0;
        }
    }

    public static void saveAutoNightThemeConfig() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("selectedAutoNightType", selectedAutoNightType);
        edit.putBoolean("autoNightScheduleByLocation", autoNightScheduleByLocation);
        edit.putFloat("autoNightBrighnessThreshold", autoNightBrighnessThreshold);
        edit.putInt("autoNightDayStartTime", autoNightDayStartTime);
        edit.putInt("autoNightDayEndTime", autoNightDayEndTime);
        edit.putInt("autoNightSunriseTime", autoNightSunriseTime);
        edit.putString("autoNightCityName", autoNightCityName);
        edit.putInt("autoNightSunsetTime", autoNightSunsetTime);
        edit.putLong("autoNightLocationLatitude3", Double.doubleToRawLongBits(autoNightLocationLatitude));
        edit.putLong("autoNightLocationLongitude3", Double.doubleToRawLongBits(autoNightLocationLongitude));
        edit.putInt("autoNightLastSunCheckDay", autoNightLastSunCheckDay);
        ThemeInfo themeInfo = currentNightTheme;
        if (themeInfo != null) {
            edit.putString("nighttheme", themeInfo.getKey());
        } else {
            edit.remove("nighttheme");
        }
        edit.commit();
    }

    @SuppressLint({"PrivateApi"})
    public static Drawable getStateDrawable(Drawable drawable, int i) {
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
        Drawable mutate = resources.getDrawable(i).mutate();
        if (i2 != 0) {
            mutate.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
        }
        Drawable mutate2 = resources.getDrawable(i).mutate();
        if (i3 != 0) {
            mutate2.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
        }
        StateListDrawable stateListDrawable = new StateListDrawable() {
            @Override
            public boolean selectDrawable(int i4) {
                if (Build.VERSION.SDK_INT < 21) {
                    Drawable stateDrawable = Theme.getStateDrawable(this, i4);
                    ColorFilter colorFilter = null;
                    if (stateDrawable instanceof BitmapDrawable) {
                        colorFilter = ((BitmapDrawable) stateDrawable).getPaint().getColorFilter();
                    } else if (stateDrawable instanceof NinePatchDrawable) {
                        colorFilter = ((NinePatchDrawable) stateDrawable).getPaint().getColorFilter();
                    }
                    boolean selectDrawable = super.selectDrawable(i4);
                    if (colorFilter != null) {
                        stateDrawable.setColorFilter(colorFilter);
                    }
                    return selectDrawable;
                }
                return super.selectDrawable(i4);
            }
        };
        stateListDrawable.setEnterFadeDuration(1);
        stateListDrawable.setExitFadeDuration(200);
        stateListDrawable.addState(new int[]{16842913}, mutate2);
        stateListDrawable.addState(new int[0], mutate);
        return stateListDrawable;
    }

    public static Drawable createEditTextDrawable(Context context, boolean z) {
        return createEditTextDrawable(context, getColor(z ? key_dialogInputField : key_windowBackgroundWhiteInputField), getColor(z ? key_dialogInputFieldActivated : key_windowBackgroundWhiteInputFieldActivated));
    }

    public static Drawable createEditTextDrawable(Context context, int i, int i2) {
        Resources resources = context.getResources();
        Drawable mutate = resources.getDrawable(R.drawable.search_dark).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        Drawable mutate2 = resources.getDrawable(R.drawable.search_dark_activated).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
        StateListDrawable stateListDrawable = new StateListDrawable() {
            @Override
            public boolean selectDrawable(int i3) {
                if (Build.VERSION.SDK_INT < 21) {
                    Drawable stateDrawable = Theme.getStateDrawable(this, i3);
                    ColorFilter colorFilter = null;
                    if (stateDrawable instanceof BitmapDrawable) {
                        colorFilter = ((BitmapDrawable) stateDrawable).getPaint().getColorFilter();
                    } else if (stateDrawable instanceof NinePatchDrawable) {
                        colorFilter = ((NinePatchDrawable) stateDrawable).getPaint().getColorFilter();
                    }
                    boolean selectDrawable = super.selectDrawable(i3);
                    if (colorFilter != null) {
                        stateDrawable.setColorFilter(colorFilter);
                    }
                    return selectDrawable;
                }
                return super.selectDrawable(i3);
            }
        };
        stateListDrawable.addState(new int[]{16842910, 16842908}, mutate2);
        stateListDrawable.addState(new int[]{16842908}, mutate2);
        stateListDrawable.addState(StateSet.WILD_CARD, mutate);
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
        if ((i != 11 || i2 < 24 || i2 > 31) && !(i == 0 && i2 == 1)) {
            if (i == 1 && i2 == 14) {
                return 1;
            }
            if (i != 9 || i2 < 30) {
                return (i == 10 && i2 == 1 && i3 < 12) ? 2 : -1;
            }
            return 2;
        }
        return 0;
    }

    public static android.graphics.drawable.Drawable getCurrentHolidayDrawable() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.Theme.getCurrentHolidayDrawable():android.graphics.drawable.Drawable");
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
        if (Build.VERSION.SDK_INT >= 21) {
            shapeDrawable2.getPaint().setColor(-1);
            return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i3}), shapeDrawable, shapeDrawable2);
        }
        shapeDrawable2.getPaint().setColor(i3);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, shapeDrawable2);
        stateListDrawable.addState(new int[]{16842908}, shapeDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, shapeDrawable);
        return stateListDrawable;
    }

    public static Drawable createRoundRectDrawable(int i, int i2) {
        float f = i;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setColor(i2);
        return shapeDrawable;
    }

    public static Drawable createRoundRectDrawable(int i, int i2, int i3) {
        float f = i;
        float f2 = i2;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f2, f2, f2, f2}, null, null));
        shapeDrawable.getPaint().setColor(i3);
        return shapeDrawable;
    }

    public static Drawable createServiceDrawable(int i, View view, View view2) {
        return createServiceDrawable(i, view, view2, chat_actionBackgroundPaint);
    }

    public static Drawable createServiceDrawable(final int i, final View view, final View view2, final Paint paint) {
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
                int i2 = i;
                canvas.drawRoundRect(rectF, i2, i2, paint);
                if (Theme.hasGradientService()) {
                    RectF rectF2 = this.rect;
                    int i3 = i;
                    canvas.drawRoundRect(rectF2, i3, i3, Theme.chat_actionBackgroundGradientDarkenPaint);
                }
            }
        };
    }

    public static Drawable createSimpleSelectorRoundRectDrawable(int i, int i2, int i3) {
        return createSimpleSelectorRoundRectDrawable(i, i2, i3, i3);
    }

    public static Drawable createSimpleSelectorRoundRectDrawable(int i, int i2, int i3, int i4) {
        float f = i;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setColor(i2);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable2.getPaint().setColor(i4);
        if (Build.VERSION.SDK_INT >= 21) {
            return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i3}), shapeDrawable, shapeDrawable2);
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, shapeDrawable2);
        stateListDrawable.addState(new int[]{16842913}, shapeDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, shapeDrawable);
        return stateListDrawable;
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
        if (Build.VERSION.SDK_INT >= 21) {
            return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{(i2 & 16777215) | 419430400}), null, createRoundRectDrawable(i, -1));
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        int i3 = (i2 & 16777215) | 419430400;
        stateListDrawable.addState(new int[]{16842919}, createRoundRectDrawable(i, i3));
        stateListDrawable.addState(new int[]{16842913}, createRoundRectDrawable(i, i3));
        stateListDrawable.addState(StateSet.WILD_CARD, new ColorDrawable(0));
        return stateListDrawable;
    }

    public static Drawable createSelectorWithBackgroundDrawable(int i, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i2}), new ColorDrawable(i), new ColorDrawable(i));
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(i2));
        stateListDrawable.addState(new int[]{16842913}, new ColorDrawable(i2));
        stateListDrawable.addState(StateSet.WILD_CARD, new ColorDrawable(i));
        return stateListDrawable;
    }

    public static Drawable getSelectorDrawable(boolean z) {
        return getSelectorDrawable(getColor(key_listSelector), z);
    }

    public static Drawable getSelectorDrawable(boolean z, ResourcesProvider resourcesProvider) {
        return getSelectorDrawable(getColor(key_listSelector, resourcesProvider), z);
    }

    public static Drawable getSelectorDrawable(int i, boolean z) {
        if (z) {
            return getSelectorDrawable(i, key_windowBackgroundWhite);
        }
        return createSelectorDrawable(i, 2);
    }

    public static Drawable getSelectorDrawable(int i, int i2) {
        if (i2 >= 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i}), new ColorDrawable(getColor(i2)), new ColorDrawable(-1));
            }
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(i));
            stateListDrawable.addState(new int[]{16842913}, new ColorDrawable(i));
            stateListDrawable.addState(StateSet.WILD_CARD, new ColorDrawable(getColor(i2)));
            return stateListDrawable;
        }
        return createSelectorDrawable(i, 2);
    }

    public static Drawable createSelectorDrawable(int i) {
        return createSelectorDrawable(i, 1, -1);
    }

    public static Drawable createSelectorDrawable(int i, int i2) {
        return createSelectorDrawable(i, i2, -1);
    }

    public static android.graphics.drawable.Drawable createSelectorDrawable(int r11, final int r12, final int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.Theme.createSelectorDrawable(int, int, int):android.graphics.drawable.Drawable");
    }

    public static Drawable createCircleSelectorDrawable(int i, final int i2, final int i3) {
        if (Build.VERSION.SDK_INT >= 21) {
            maskPaint.setColor(-1);
            return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i}), null, new Drawable() {
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
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(i));
        stateListDrawable.addState(new int[]{16842913}, new ColorDrawable(i));
        stateListDrawable.addState(StateSet.WILD_CARD, new ColorDrawable(0));
        return stateListDrawable;
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

        public static Drawable rect() {
            return rect(Theme.getColor(defaultBackgroundColorKey));
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

        public static Drawable filledRect() {
            return filledRect(Theme.getColor(defaultBackgroundColorKey), 0.0f);
        }

        public static Drawable filledRectByKey(int i, float... fArr) {
            return filledRect(Theme.getColor(i), fArr);
        }

        public static Drawable filledRect(int i, float... fArr) {
            return createRect(i, calcRippleColor(i), fArr);
        }

        public static Drawable createRect(int i, int i2, float... fArr) {
            ColorDrawable colorDrawable = null;
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
            ShapeDrawable shapeDrawable2;
            if (Build.VERSION.SDK_INT >= 21) {
                if (hasNonzeroRadii(fArr)) {
                    shapeDrawable2 = new ShapeDrawable(new RoundRectShape(calcRadii(fArr), null, null));
                    shapeDrawable2.getPaint().setColor(-1);
                } else {
                    shapeDrawable2 = new ShapeDrawable(new RectShape());
                    shapeDrawable2.getPaint().setColor(-1);
                }
                return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i}), drawable, shapeDrawable2);
            }
            StateListDrawable stateListDrawable = new StateListDrawable();
            if (hasNonzeroRadii(fArr)) {
                shapeDrawable = new ShapeDrawable(new RoundRectShape(calcRadii(fArr), null, null));
                shapeDrawable.getPaint().setColor(i);
            } else {
                shapeDrawable = new ShapeDrawable(new RectShape());
                shapeDrawable.getPaint().setColor(i);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, shapeDrawable});
            stateListDrawable.addState(new int[]{16842919}, layerDrawable);
            stateListDrawable.addState(new int[]{16842913}, layerDrawable);
            stateListDrawable.addState(StateSet.WILD_CARD, drawable);
            return stateListDrawable;
        }

        private static Drawable createCircle(int i, float f) {
            return createCircle(0, i, f);
        }

        private static Drawable createCircle(int i, int i2, float f) {
            return createCircle(i == 0 ? null : new CircleDrawable(f, i), i2, f);
        }

        private static Drawable createCircle(Drawable drawable, int i, float f) {
            if (Build.VERSION.SDK_INT >= 21) {
                return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i}), drawable, new CircleDrawable(f));
            }
            StateListDrawable stateListDrawable = new StateListDrawable();
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, new CircleDrawable(f, i)});
            stateListDrawable.addState(new int[]{16842919}, layerDrawable);
            stateListDrawable.addState(new int[]{16842913}, layerDrawable);
            stateListDrawable.addState(StateSet.WILD_CARD, drawable);
            return stateListDrawable;
        }

        public static class CircleDrawable extends Drawable {
            private static Paint maskPaint;
            private Paint paint;
            private float radius;

            @Override
            @Deprecated
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
                int dp;
                Rect bounds = getBounds();
                if (Math.abs(this.radius - (-1.0f)) < 0.01f) {
                    dp = Math.max(bounds.width(), bounds.height()) / 2;
                } else if (Math.abs(this.radius - (-2.0f)) < 0.01f) {
                    dp = (int) Math.ceil(Math.sqrt(((bounds.left - bounds.centerX()) * (bounds.left - bounds.centerX())) + ((bounds.top - bounds.centerY()) * (bounds.top - bounds.centerY()))));
                } else {
                    dp = AndroidUtilities.dp(this.radius);
                }
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), dp, this.paint);
            }
        }

        private static float[] calcRadii(float... fArr) {
            return fArr.length == 0 ? new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f} : fArr.length == 1 ? new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0])} : fArr.length == 2 ? new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1])} : fArr.length == 3 ? new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2])} : fArr.length < 8 ? new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[3]), AndroidUtilities.dp(fArr[3])} : new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[3]), AndroidUtilities.dp(fArr[4]), AndroidUtilities.dp(fArr[5]), AndroidUtilities.dp(fArr[6]), AndroidUtilities.dp(fArr[7])};
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
            if (fArr[1] > 0.01f) {
                fArr[1] = Math.min(1.0f, Math.max(0.0f, fArr[1] + (Theme.isCurrentThemeDark() ? 0.25f : -0.25f)));
                float[] fArr2 = tempHSV;
                fArr2[2] = Math.min(1.0f, Math.max(0.0f, fArr2[2] + (Theme.isCurrentThemeDark() ? 0.05f : -0.05f)));
            } else {
                fArr[2] = Math.min(1.0f, Math.max(0.0f, fArr[2] + (Theme.isCurrentThemeDark() ? 0.1f : -0.1f)));
            }
            return Color.HSVToColor(MessagesStorage.LAST_DB_VERSION, tempHSV);
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
            this.radii = r0;
            float dp = AndroidUtilities.dp(f);
            float[] fArr = {dp, dp, dp, dp};
            float[] fArr2 = this.radii;
            float dp2 = AndroidUtilities.dp(f2);
            fArr2[7] = dp2;
            fArr2[6] = dp2;
            fArr2[5] = dp2;
            fArr2[4] = dp2;
        }

        public RippleRadMaskDrawable(float f, float f2, float f3, float f4) {
            float[] fArr = new float[8];
            this.radii = fArr;
            float dp = AndroidUtilities.dp(f);
            fArr[1] = dp;
            fArr[0] = dp;
            float[] fArr2 = this.radii;
            float dp2 = AndroidUtilities.dp(f2);
            fArr2[3] = dp2;
            fArr2[2] = dp2;
            float[] fArr3 = this.radii;
            float dp3 = AndroidUtilities.dp(f3);
            fArr3[5] = dp3;
            fArr3[4] = dp3;
            float[] fArr4 = this.radii;
            float dp4 = AndroidUtilities.dp(f4);
            fArr4[7] = dp4;
            fArr4[6] = dp4;
        }

        public void setRadius(float f, float f2) {
            float[] fArr = this.radii;
            float dp = AndroidUtilities.dp(f);
            fArr[3] = dp;
            fArr[2] = dp;
            fArr[1] = dp;
            fArr[0] = dp;
            float[] fArr2 = this.radii;
            float dp2 = AndroidUtilities.dp(f2);
            fArr2[7] = dp2;
            fArr2[6] = dp2;
            fArr2[5] = dp2;
            fArr2[4] = dp2;
            this.invalidatePath = true;
            invalidateSelf();
        }

        public void setRadius(float f, float f2, float f3, float f4) {
            float[] fArr = this.radii;
            float dp = AndroidUtilities.dp(f);
            fArr[1] = dp;
            fArr[0] = dp;
            float[] fArr2 = this.radii;
            float dp2 = AndroidUtilities.dp(f2);
            fArr2[3] = dp2;
            fArr2[2] = dp2;
            float[] fArr3 = this.radii;
            float dp3 = AndroidUtilities.dp(f3);
            fArr3[5] = dp3;
            fArr3[4] = dp3;
            float[] fArr4 = this.radii;
            float dp4 = AndroidUtilities.dp(f4);
            fArr4[7] = dp4;
            fArr4[6] = dp4;
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
        if (Build.VERSION.SDK_INT >= 21 && (drawable instanceof RippleDrawable)) {
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
        if (Build.VERSION.SDK_INT >= 21 && (drawable instanceof RippleDrawable)) {
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
        if (Build.VERSION.SDK_INT >= 21) {
            maskPaint.setColor(-1);
            return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i}), null, new RippleRadMaskDrawable(i2, i3));
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(i));
        stateListDrawable.addState(new int[]{16842913}, new ColorDrawable(i));
        stateListDrawable.addState(StateSet.WILD_CARD, new ColorDrawable(0));
        return stateListDrawable;
    }

    public static Drawable createRadSelectorDrawable(int i, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 21) {
            maskPaint.setColor(-1);
            return new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i}), null, new RippleRadMaskDrawable(i2, i3, i4, i5));
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(i));
        stateListDrawable.addState(new int[]{16842913}, new ColorDrawable(i));
        stateListDrawable.addState(StateSet.WILD_CARD, new ColorDrawable(0));
        return stateListDrawable;
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
                int lambda$sortThemes$1;
                lambda$sortThemes$1 = Theme.lambda$sortThemes$1((Theme.ThemeInfo) obj, (Theme.ThemeInfo) obj2);
                return lambda$sortThemes$1;
            }
        });
    }

    public static int lambda$sortThemes$1(ThemeInfo themeInfo, ThemeInfo themeInfo2) {
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
            return;
        }
        currentTheme.setOverrideWallpaper(null);
    }

    public static ThemeInfo fillThemeValues(File file, String str, TLRPC$TL_theme tLRPC$TL_theme) {
        String[] split;
        try {
            ThemeInfo themeInfo = new ThemeInfo();
            themeInfo.name = str;
            themeInfo.info = tLRPC$TL_theme;
            themeInfo.pathToFile = file.getAbsolutePath();
            themeInfo.account = UserConfig.selectedAccount;
            String[] strArr = new String[1];
            checkIsDark(getThemeFileValues(new File(themeInfo.pathToFile), null, strArr), themeInfo);
            if (!TextUtils.isEmpty(strArr[0])) {
                String str2 = strArr[0];
                File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                themeInfo.pathToWallpaper = new File(filesDirFixed, Utilities.MD5(str2) + ".wp").getAbsolutePath();
                Uri parse = Uri.parse(str2);
                themeInfo.slug = parse.getQueryParameter("slug");
                String queryParameter = parse.getQueryParameter("mode");
                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                    for (int i = 0; i < split.length; i++) {
                        if ("blur".equals(split[i])) {
                            themeInfo.isBlured = true;
                        } else if ("motion".equals(split[i])) {
                            themeInfo.isMotion = true;
                        }
                    }
                }
                String queryParameter2 = parse.getQueryParameter("intensity");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    try {
                        String queryParameter3 = parse.getQueryParameter("bg_color");
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
                        String queryParameter4 = parse.getQueryParameter("rotation");
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
            } else {
                themedWallpaperLink = null;
            }
            return themeInfo;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static ThemeInfo applyThemeFile(File file, String str, TLRPC$TL_theme tLRPC$TL_theme, boolean z) {
        File file2;
        String str2;
        try {
            if (!str.toLowerCase().endsWith(".attheme")) {
                str = str + ".attheme";
            }
            if (z) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.goingToPreviewTheme, new Object[0]);
                ThemeInfo themeInfo = new ThemeInfo();
                themeInfo.name = str;
                themeInfo.info = tLRPC$TL_theme;
                themeInfo.pathToFile = file.getAbsolutePath();
                themeInfo.account = UserConfig.selectedAccount;
                applyThemeTemporary(themeInfo, false);
                return themeInfo;
            }
            if (tLRPC$TL_theme != null) {
                str2 = "remote" + tLRPC$TL_theme.id;
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
            ThemeInfo themeInfo2 = themesDict.get(str2);
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
            themeInfo2.info = tLRPC$TL_theme;
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
        return themesDict.get(str);
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

    private static void applyTheme(org.telegram.ui.ActionBar.Theme.ThemeInfo r7, boolean r8, boolean r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.Theme.applyTheme(org.telegram.ui.ActionBar.Theme$ThemeInfo, boolean, boolean, boolean):void");
    }

    private static void applyThemeInBackground(final org.telegram.ui.ActionBar.Theme.ThemeInfo r9, final boolean r10, boolean r11, final boolean r12, final java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.Theme.applyThemeInBackground(org.telegram.ui.ActionBar.Theme$ThemeInfo, boolean, boolean, boolean, java.lang.Runnable):void");
    }

    public static void lambda$applyThemeInBackground$2(String[] strArr, ThemeInfo themeInfo, boolean z, boolean z2, Runnable runnable) {
        String[] split;
        try {
            themedWallpaperFileOffset = currentColorsNoAccent.get(key_wallpaperFileOffset, -1);
            if (!TextUtils.isEmpty(strArr[0])) {
                themedWallpaperLink = strArr[0];
                File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                String absolutePath = new File(filesDirFixed, Utilities.MD5(themedWallpaperLink) + ".wp").getAbsolutePath();
                try {
                    String str = themeInfo.pathToWallpaper;
                    if (str != null && !str.equals(absolutePath)) {
                        new File(themeInfo.pathToWallpaper).delete();
                    }
                } catch (Exception unused) {
                }
                themeInfo.pathToWallpaper = absolutePath;
                Uri parse = Uri.parse(themedWallpaperLink);
                themeInfo.slug = parse.getQueryParameter("slug");
                String queryParameter = parse.getQueryParameter("mode");
                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                    for (int i = 0; i < split.length; i++) {
                        if ("blur".equals(split[i])) {
                            themeInfo.isBlured = true;
                        } else if ("motion".equals(split[i])) {
                            themeInfo.isMotion = true;
                        }
                    }
                }
                Utilities.parseInt((CharSequence) parse.getQueryParameter("intensity")).intValue();
                themeInfo.patternBgGradientRotation = 45;
                try {
                    String queryParameter2 = parse.getQueryParameter("bg_color");
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
                    String queryParameter3 = parse.getQueryParameter("rotation");
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        themeInfo.patternBgGradientRotation = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                    }
                } catch (Exception unused3) {
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
                    AndroidUtilities.runOnUIThread(MessagesController$$ExternalSyntheticLambda251.INSTANCE, 2100L);
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

    public static void lambda$applyThemeInBackground$3(Runnable runnable, SparseIntArray sparseIntArray) {
        currentColorsNoAccent = sparseIntArray;
        runnable.run();
    }

    public static void lambda$applyThemeInBackground$4(Runnable runnable, SparseIntArray sparseIntArray) {
        currentColorsNoAccent = sparseIntArray;
        runnable.run();
    }

    public static boolean useBlackText(int i, int i2) {
        float red = Color.red(i) / 255.0f;
        float green = Color.green(i) / 255.0f;
        float blue = Color.blue(i) / 255.0f;
        return ((((red * 0.5f) + ((((float) Color.red(i2)) / 255.0f) * 0.5f)) * 0.2126f) + (((green * 0.5f) + ((((float) Color.green(i2)) / 255.0f) * 0.5f)) * 0.7152f)) + (((blue * 0.5f) + ((((float) Color.blue(i2)) / 255.0f) * 0.5f)) * 0.0722f) > 0.705f || ((red * 0.2126f) + (green * 0.7152f)) + (blue * 0.0722f) > 0.705f;
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
                Theme.lambda$refreshThemeColors$5(z3);
            }
        });
    }

    public static void lambda$refreshThemeColors$5(boolean z) {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewTheme, Boolean.FALSE, Boolean.valueOf(z));
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
        return changeColorAccent(tempHsv, tempHsv2, i2, themeInfo.isDark());
    }

    public static float[] getTempHsv(int i) {
        ThreadLocal<float[]> threadLocal;
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
        float[] fArr = threadLocal.get();
        if (fArr == null) {
            float[] fArr2 = new float[3];
            threadLocal.set(fArr2);
            return fArr2;
        }
        return fArr;
    }

    public static int getAccentColor(float[] fArr, int i, int i2) {
        float[] tempHsv = getTempHsv(3);
        float[] tempHsv2 = getTempHsv(4);
        Color.colorToHSV(i, tempHsv);
        Color.colorToHSV(i2, tempHsv2);
        float min = Math.min((tempHsv[1] * 1.5f) / fArr[1], 1.0f);
        tempHsv[0] = (tempHsv2[0] - tempHsv[0]) + fArr[0];
        tempHsv[1] = (tempHsv2[1] * fArr[1]) / tempHsv[1];
        tempHsv[2] = ((((tempHsv2[2] / tempHsv[2]) + min) - 1.0f) * fArr[2]) / min;
        return tempHsv[2] < 0.3f ? i2 : Color.HSVToColor(255, tempHsv);
    }

    public static int changeColorAccent(int i) {
        ThemeAccent accent = currentTheme.getAccent(false);
        return changeColorAccent(currentTheme, accent != null ? accent.accentColor : 0, i);
    }

    public static int changeColorAccent(float[] fArr, float[] fArr2, int i, boolean z) {
        if (tmpHSV5 == null) {
            tmpHSV5 = new float[3];
        }
        float[] fArr3 = tmpHSV5;
        Color.colorToHSV(i, fArr3);
        boolean z2 = false;
        if (Math.min(abs(fArr3[0] - fArr[0]), abs((fArr3[0] - fArr[0]) - 360.0f)) > 30.0f) {
            return i;
        }
        float min = Math.min((fArr3[1] * 1.5f) / fArr[1], 1.0f);
        fArr3[0] = (fArr3[0] + fArr2[0]) - fArr[0];
        fArr3[1] = (fArr3[1] * fArr2[1]) / fArr[1];
        fArr3[2] = fArr3[2] * ((1.0f - min) + ((min * fArr2[2]) / fArr[2]));
        int HSVToColor = Color.HSVToColor(Color.alpha(i), fArr3);
        float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(i);
        float computePerceivedBrightness2 = AndroidUtilities.computePerceivedBrightness(HSVToColor);
        if (!z ? computePerceivedBrightness < computePerceivedBrightness2 : computePerceivedBrightness > computePerceivedBrightness2) {
            z2 = true;
        }
        return z2 ? changeBrightness(HSVToColor, ((0.39999998f * computePerceivedBrightness) / computePerceivedBrightness2) + 0.6f) : HSVToColor;
    }

    private static int changeBrightness(int i, float f) {
        int red = (int) (Color.red(i) * f);
        int green = (int) (Color.green(i) * f);
        int blue = (int) (Color.blue(i) * f);
        return Color.argb(Color.alpha(i), red < 0 ? 0 : Math.min(red, 255), green < 0 ? 0 : Math.min(green, 255), blue >= 0 ? Math.min(blue, 255) : 0);
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
        TLRPC$TL_theme tLRPC$TL_theme = themeAccent.info;
        if (tLRPC$TL_theme != null) {
            themeInfo.accentsByThemeId.remove(tLRPC$TL_theme.id);
        }
        OverrideWallpaperInfo overrideWallpaperInfo = themeAccent.overrideWallpaper;
        if (overrideWallpaperInfo != null) {
            overrideWallpaperInfo.delete();
        }
        if (z3) {
            themeInfo.setCurrentAccentId(themeInfo.themeAccents.get(0).id);
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
            SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            if (!z3) {
                int size = themeInfo.themeAccents.size();
                int max = Math.max(0, size - themeInfo.defaultAccentCount);
                SerializedData serializedData = new SerializedData(((max * 16) + 2) * 4);
                serializedData.writeInt32(9);
                serializedData.writeInt32(max);
                for (int i = 0; i < size; i++) {
                    ThemeAccent themeAccent = themeInfo.themeAccents.get(i);
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
                edit.putString("accents_" + themeInfo.assetName, Base64.encodeToString(serializedData.toByteArray(), 3));
                if (!z5) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
                }
                if (z4) {
                    MessagesController.getInstance(UserConfig.selectedAccount).saveThemeToServer(themeInfo, themeInfo.getAccent(false));
                }
            }
            edit.putInt("accent_current_" + themeInfo.assetName, themeInfo.currentAccentId);
            edit.commit();
        } else {
            if (themeInfo.prevAccentId != -1) {
                if (z2) {
                    ThemeAccent themeAccent2 = themeInfo.themeAccentsMap.get(themeInfo.currentAccentId);
                    themeInfo.themeAccentsMap.remove(themeAccent2.id);
                    themeInfo.themeAccents.remove(themeAccent2);
                    TLRPC$TL_theme tLRPC$TL_theme = themeAccent2.info;
                    if (tLRPC$TL_theme != null) {
                        themeInfo.accentsByThemeId.remove(tLRPC$TL_theme.id);
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
        ArrayList<ThemeAccent> arrayList;
        int i = 0;
        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
        if (z) {
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < otherThemes.size(); i2++) {
                JSONObject saveJson = otherThemes.get(i2).getSaveJson();
                if (saveJson != null) {
                    jSONArray.put(saveJson);
                }
            }
            edit.putString("themes2", jSONArray.toString());
        }
        int i3 = 0;
        while (i3 < 4) {
            StringBuilder sb = new StringBuilder();
            sb.append("2remoteThemesHash");
            Object obj = BuildConfig.APP_CENTER_HASH;
            sb.append(i3 != 0 ? Integer.valueOf(i3) : BuildConfig.APP_CENTER_HASH);
            edit.putLong(sb.toString(), remoteThemesHash[i3]);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("lastLoadingThemesTime");
            if (i3 != 0) {
                obj = Integer.valueOf(i3);
            }
            sb2.append(obj);
            edit.putInt(sb2.toString(), lastLoadingThemesTime[i3]);
            i3++;
        }
        edit.putInt("lastLoadingCurrentThemeTime", lastLoadingCurrentThemeTime);
        edit.commit();
        if (z) {
            while (i < 5) {
                ThemeInfo themeInfo = themesDict.get(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Night" : "Day" : "Arctic Blue" : "Dark Blue" : "Blue");
                if (themeInfo != null && (arrayList = themeInfo.themeAccents) != null && !arrayList.isEmpty()) {
                    saveThemeAccents(themeInfo, true, false, false, false, z2);
                }
                i++;
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
            return BuildConfig.APP_CENTER_HASH;
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

    private static long getAutoNightSwitchThemeDelay() {
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
                            int[] calculateSunriseSunset = SunDate.calculateSunriseSunset(d, d2);
                            autoNightSunriseTime = calculateSunriseSunset[0];
                            autoNightSunsetTime = calculateSunriseSunset[1];
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
            return i < i2 ? (i > i4 || i4 > i2) ? 1 : 2 : ((i > i4 || i4 > 1440) && (i4 < 0 || i4 > i2)) ? 1 : 2;
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
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - lastDelayUpdateTime;
            lastDelayUpdateTime = elapsedRealtime;
            int i = (int) (switchNightThemeDelay - j);
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
        int needSwitchToTheme = needSwitchToTheme();
        if (needSwitchToTheme != 0) {
            applyDayNightThemeMaybe(needSwitchToTheme == 2);
        }
        if (z) {
            lastThemeSwitchTime = 0L;
        }
    }

    public static void applyDayNightThemeMaybe(boolean z) {
        if (previousTheme != null) {
            return;
        }
        if (z) {
            ThemeInfo themeInfo = currentTheme;
            ThemeInfo themeInfo2 = currentNightTheme;
            if (themeInfo != themeInfo2) {
                if (themeInfo == null || !(themeInfo2 == null || themeInfo.isDark() == currentNightTheme.isDark())) {
                    isInNigthMode = true;
                    lastThemeSwitchTime = SystemClock.elapsedRealtime();
                    switchingNightTheme = true;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, currentNightTheme, Boolean.TRUE, null, -1);
                    switchingNightTheme = false;
                    return;
                }
                return;
            }
            return;
        }
        ThemeInfo themeInfo3 = currentTheme;
        ThemeInfo themeInfo4 = currentDayTheme;
        if (themeInfo3 != themeInfo4) {
            if (themeInfo3 == null || !(themeInfo4 == null || themeInfo3.isLight() == currentDayTheme.isLight())) {
                isInNigthMode = false;
                lastThemeSwitchTime = SystemClock.elapsedRealtime();
                switchingNightTheme = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, currentDayTheme, Boolean.TRUE, null, -1);
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
            currentNightTheme = themesDict.get("Dark Blue");
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

    public static ThemeInfo createNewTheme(String str) {
        ThemeInfo themeInfo = new ThemeInfo();
        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
        themeInfo.pathToFile = new File(filesDirFixed, "theme" + Utilities.random.nextLong() + ".attheme").getAbsolutePath();
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
        if (sb.length() > 0) {
            return str + "&mode=" + sb.toString();
        }
        return str;
    }

    public static void saveCurrentTheme(org.telegram.ui.ActionBar.Theme.ThemeInfo r15, boolean r16, boolean r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.Theme.saveCurrentTheme(org.telegram.ui.ActionBar.Theme$ThemeInfo, boolean, boolean, boolean):void");
    }

    public static void checkCurrentRemoteTheme(boolean z) {
        int i;
        if (loadingCurrentTheme == 0) {
            if (z || Math.abs((System.currentTimeMillis() / 1000) - lastLoadingCurrentThemeTime) >= 3600) {
                int i2 = 0;
                while (i2 < 2) {
                    final ThemeInfo themeInfo = i2 == 0 ? currentDayTheme : currentNightTheme;
                    if (themeInfo != null && UserConfig.getInstance(themeInfo.account).isClientActivated()) {
                        final ThemeAccent accent = themeInfo.getAccent(false);
                        final TLRPC$TL_theme tLRPC$TL_theme = themeInfo.info;
                        if (tLRPC$TL_theme != null) {
                            i = themeInfo.account;
                        } else if (accent != null && (tLRPC$TL_theme = accent.info) != null) {
                            i = UserConfig.selectedAccount;
                        }
                        if (tLRPC$TL_theme != null && tLRPC$TL_theme.document != null) {
                            loadingCurrentTheme++;
                            TLRPC$TL_account_getTheme tLRPC$TL_account_getTheme = new TLRPC$TL_account_getTheme();
                            tLRPC$TL_account_getTheme.document_id = tLRPC$TL_theme.document.id;
                            tLRPC$TL_account_getTheme.format = "android";
                            TLRPC$TL_inputTheme tLRPC$TL_inputTheme = new TLRPC$TL_inputTheme();
                            tLRPC$TL_inputTheme.access_hash = tLRPC$TL_theme.access_hash;
                            tLRPC$TL_inputTheme.id = tLRPC$TL_theme.id;
                            tLRPC$TL_account_getTheme.theme = tLRPC$TL_inputTheme;
                            ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_account_getTheme, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                    Theme.lambda$checkCurrentRemoteTheme$7(Theme.ThemeAccent.this, themeInfo, tLRPC$TL_theme, tLObject, tLRPC$TL_error);
                                }
                            });
                        }
                    }
                    i2++;
                }
            }
        }
    }

    public static void lambda$checkCurrentRemoteTheme$7(final ThemeAccent themeAccent, final ThemeInfo themeInfo, final TLRPC$TL_theme tLRPC$TL_theme, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                Theme.lambda$checkCurrentRemoteTheme$6(TLObject.this, themeAccent, themeInfo, tLRPC$TL_theme);
            }
        });
    }

    public static void lambda$checkCurrentRemoteTheme$6(org.telegram.tgnet.TLObject r7, org.telegram.ui.ActionBar.Theme.ThemeAccent r8, org.telegram.ui.ActionBar.Theme.ThemeInfo r9, org.telegram.tgnet.TLRPC$TL_theme r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.Theme.lambda$checkCurrentRemoteTheme$6(org.telegram.tgnet.TLObject, org.telegram.ui.ActionBar.Theme$ThemeAccent, org.telegram.ui.ActionBar.Theme$ThemeInfo, org.telegram.tgnet.TLRPC$TL_theme):void");
    }

    public static void loadRemoteThemes(final int i, boolean z) {
        if (loadingRemoteThemes[i]) {
            return;
        }
        if ((z || Math.abs((System.currentTimeMillis() / 1000) - lastLoadingThemesTime[i]) >= 3600) && UserConfig.getInstance(i).isClientActivated()) {
            loadingRemoteThemes[i] = true;
            TLRPC$TL_account_getThemes tLRPC$TL_account_getThemes = new TLRPC$TL_account_getThemes();
            tLRPC$TL_account_getThemes.format = "android";
            if (!MediaDataController.getInstance(i).defaultEmojiThemes.isEmpty()) {
                tLRPC$TL_account_getThemes.hash = remoteThemesHash[i];
            }
            if (BuildVars.LOGS_ENABLED) {
                Log.i("theme", "loading remote themes, hash " + tLRPC$TL_account_getThemes.hash);
            }
            ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_account_getThemes, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    Theme.lambda$loadRemoteThemes$9(i, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public static void lambda$loadRemoteThemes$9(final int i, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                Theme.lambda$loadRemoteThemes$8(i, tLObject);
            }
        });
    }

    public static void lambda$loadRemoteThemes$8(int r18, org.telegram.tgnet.TLObject r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.Theme.lambda$loadRemoteThemes$8(int, org.telegram.tgnet.TLObject):void");
    }

    public static String getBaseThemeKey(TLRPC$ThemeSettings tLRPC$ThemeSettings) {
        TLRPC$BaseTheme tLRPC$BaseTheme = tLRPC$ThemeSettings.base_theme;
        if (tLRPC$BaseTheme instanceof TLRPC$TL_baseThemeClassic) {
            return "Blue";
        }
        if (tLRPC$BaseTheme instanceof TLRPC$TL_baseThemeDay) {
            return "Day";
        }
        if (tLRPC$BaseTheme instanceof TLRPC$TL_baseThemeTinted) {
            return "Dark Blue";
        }
        if (tLRPC$BaseTheme instanceof TLRPC$TL_baseThemeArctic) {
            return "Arctic Blue";
        }
        if (tLRPC$BaseTheme instanceof TLRPC$TL_baseThemeNight) {
            return "Night";
        }
        return null;
    }

    public static TLRPC$BaseTheme getBaseThemeByKey(String str) {
        if ("Blue".equals(str)) {
            return new TLRPC$TL_baseThemeClassic();
        }
        if ("Day".equals(str)) {
            return new TLRPC$TL_baseThemeDay();
        }
        if ("Dark Blue".equals(str)) {
            return new TLRPC$TL_baseThemeTinted();
        }
        if ("Arctic Blue".equals(str)) {
            return new TLRPC$TL_baseThemeArctic();
        }
        if ("Night".equals(str)) {
            return new TLRPC$TL_baseThemeNight();
        }
        return null;
    }

    public static void setThemeFileReference(TLRPC$TL_theme tLRPC$TL_theme) {
        TLRPC$Document tLRPC$Document;
        int size = themes.size();
        for (int i = 0; i < size; i++) {
            TLRPC$TL_theme tLRPC$TL_theme2 = themes.get(i).info;
            if (tLRPC$TL_theme2 != null && tLRPC$TL_theme2.id == tLRPC$TL_theme.id) {
                TLRPC$Document tLRPC$Document2 = tLRPC$TL_theme2.document;
                if (tLRPC$Document2 == null || (tLRPC$Document = tLRPC$TL_theme.document) == null) {
                    return;
                }
                tLRPC$Document2.file_reference = tLRPC$Document.file_reference;
                saveOtherThemes(true);
                return;
            }
        }
    }

    public static boolean isThemeInstalled(ThemeInfo themeInfo) {
        return (themeInfo == null || themesDict.get(themeInfo.getKey()) == null) ? false : true;
    }

    public static void setThemeUploadInfo(ThemeInfo themeInfo, ThemeAccent themeAccent, TLRPC$TL_theme tLRPC$TL_theme, int i, boolean z) {
        String str;
        TLRPC$WallPaperSettings tLRPC$WallPaperSettings;
        if (tLRPC$TL_theme == null) {
            return;
        }
        TLRPC$ThemeSettings tLRPC$ThemeSettings = tLRPC$TL_theme.settings.size() > 0 ? tLRPC$TL_theme.settings.get(0) : null;
        if (tLRPC$ThemeSettings != null) {
            if (themeInfo == null) {
                String baseThemeKey = getBaseThemeKey(tLRPC$ThemeSettings);
                if (baseThemeKey == null || (themeInfo = themesDict.get(baseThemeKey)) == null) {
                    return;
                }
                themeAccent = themeInfo.accentsByThemeId.get(tLRPC$TL_theme.id);
            }
            if (themeAccent == null) {
                return;
            }
            TLRPC$TL_theme tLRPC$TL_theme2 = themeAccent.info;
            if (tLRPC$TL_theme2 != null) {
                themeInfo.accentsByThemeId.remove(tLRPC$TL_theme2.id);
            }
            themeAccent.info = tLRPC$TL_theme;
            themeAccent.account = i;
            themeInfo.accentsByThemeId.put(tLRPC$TL_theme.id, themeAccent);
            if (!ThemeInfo.accentEquals(themeAccent, tLRPC$ThemeSettings)) {
                File pathToWallpaper = themeAccent.getPathToWallpaper();
                if (pathToWallpaper != null) {
                    pathToWallpaper.delete();
                }
                ThemeInfo.fillAccentValues(themeAccent, tLRPC$ThemeSettings);
                ThemeInfo themeInfo2 = currentTheme;
                if (themeInfo2 == themeInfo && themeInfo2.currentAccentId == themeAccent.id) {
                    refreshThemeColors();
                    NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                    int i2 = NotificationCenter.needSetDayNightTheme;
                    Object[] objArr = new Object[4];
                    ThemeInfo themeInfo3 = currentTheme;
                    objArr[0] = themeInfo3;
                    objArr[1] = Boolean.valueOf(currentNightTheme == themeInfo3);
                    objArr[2] = null;
                    objArr[3] = -1;
                    globalInstance.lambda$postNotificationNameOnUIThread$1(i2, objArr);
                }
                PatternsLoader.createLoader(true);
            }
            TLRPC$WallPaper tLRPC$WallPaper = tLRPC$ThemeSettings.wallpaper;
            themeAccent.patternMotion = (tLRPC$WallPaper == null || (tLRPC$WallPaperSettings = tLRPC$WallPaper.settings) == null || !tLRPC$WallPaperSettings.motion) ? false : true;
            themeInfo.previewParsed = false;
        } else {
            if (themeInfo != null) {
                HashMap<String, ThemeInfo> hashMap = themesDict;
                str = themeInfo.getKey();
                hashMap.remove(str);
            } else {
                str = "remote" + tLRPC$TL_theme.id;
                themeInfo = themesDict.get(str);
            }
            if (themeInfo == null) {
                return;
            }
            themeInfo.info = tLRPC$TL_theme;
            themeInfo.name = tLRPC$TL_theme.title;
            File file = new File(themeInfo.pathToFile);
            File file2 = new File(ApplicationLoader.getFilesDirFixed(), str + ".attheme");
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
        long j;
        File file = new File(ApplicationLoader.getFilesDirFixed(), str);
        try {
            InputStream open = ApplicationLoader.applicationContext.getAssets().open(str);
            j = open.available();
            open.close();
        } catch (Exception e) {
            FileLog.e(e);
            j = 0;
        }
        if (!file.exists() || (j != 0 && file.length() != j)) {
            try {
                InputStream open2 = ApplicationLoader.applicationContext.getAssets().open(str);
                AndroidUtilities.copyFile(open2, file);
                if (open2 != null) {
                    open2.close();
                }
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        return file;
    }

    public static int getPreviewColor(SparseIntArray sparseIntArray, int i) {
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return defaultColors[i];
    }

    public static java.lang.String createThemePreviewImage(java.lang.String r35, java.lang.String r36, org.telegram.ui.ActionBar.Theme.ThemeAccent r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.Theme.createThemePreviewImage(java.lang.String, java.lang.String, org.telegram.ui.ActionBar.Theme$ThemeAccent):java.lang.String");
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

    public static void getThemeFileValuesInBackground(final File file, final String str, final String[] strArr, final Utilities.Callback<SparseIntArray> callback) {
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                Theme.lambda$getThemeFileValuesInBackground$10(Utilities.Callback.this, file, str, strArr);
            }
        });
    }

    public static void lambda$getThemeFileValuesInBackground$10(Utilities.Callback callback, File file, String str, String[] strArr) {
        callback.run(getThemeFileValues(file, str, strArr));
    }

    public static SparseIntArray getThemeFileValues(File file, String str, String[] strArr) {
        int intValue;
        SparseIntArray sparseIntArray = new SparseIntArray();
        FileInputStream fileInputStream = null;
        try {
            try {
                byte[] bArr = new byte[1024];
                FileInputStream fileInputStream2 = new FileInputStream(str != null ? getAssetFile(str) : file);
                int i = -1;
                int i2 = 0;
                int i3 = -1;
                boolean z = false;
                while (true) {
                    try {
                        int read = fileInputStream2.read(bArr);
                        if (read == i) {
                            break;
                        }
                        int i4 = i2;
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            if (i5 >= read) {
                                break;
                            }
                            if (bArr[i5] == 10) {
                                int i7 = (i5 - i6) + 1;
                                String str2 = new String(bArr, i6, i7 - 1);
                                if (str2.startsWith("WLS=")) {
                                    if (strArr != null && strArr.length > 0) {
                                        strArr[0] = str2.substring(4);
                                    }
                                } else if (str2.startsWith("WPS")) {
                                    i3 = i7 + i4;
                                    z = true;
                                    break;
                                } else {
                                    int indexOf = str2.indexOf(61);
                                    if (indexOf != i) {
                                        String substring = str2.substring(0, indexOf);
                                        String substring2 = str2.substring(indexOf + 1);
                                        if (substring2.length() > 0 && substring2.charAt(0) == '#') {
                                            try {
                                                intValue = Color.parseColor(substring2);
                                            } catch (Exception unused) {
                                                intValue = Utilities.parseInt((CharSequence) substring2).intValue();
                                            }
                                        } else {
                                            intValue = Utilities.parseInt((CharSequence) substring2).intValue();
                                        }
                                        int stringKeyToInt = ThemeColors.stringKeyToInt(substring);
                                        if (stringKeyToInt >= 0) {
                                            sparseIntArray.put(stringKeyToInt, intValue);
                                        }
                                    }
                                }
                                i6 += i7;
                                i4 += i7;
                            }
                            i5++;
                            i = -1;
                        }
                        if (i2 == i4) {
                            break;
                        }
                        fileInputStream2.getChannel().position(i4);
                        if (z) {
                            break;
                        }
                        i2 = i4;
                        i = -1;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        try {
                            FileLog.e(th);
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return sparseIntArray;
                        } catch (Throwable th2) {
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            throw th2;
                        }
                    }
                }
                sparseIntArray.put(key_wallpaperFileOffset, i3);
                fileInputStream2.close();
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        } catch (Throwable th3) {
            th = th3;
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
            dialogs_unarchiveDrawable = new RLottieDrawable(R.raw.chats_unarchive, "chats_unarchive", AndroidUtilities.dp(AndroidUtilities.dp(36.0f)), AndroidUtilities.dp(36.0f), false, null);
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
                rLottieDrawable.setLayerColor("Arrow1.**", getNonAnimatedColor(i2));
                dialogs_archiveAvatarDrawable.setLayerColor("Arrow2.**", getNonAnimatedColor(i2));
                RLottieDrawable rLottieDrawable2 = dialogs_archiveAvatarDrawable;
                int i3 = key_avatar_text;
                rLottieDrawable2.setLayerColor("Box2.**", getNonAnimatedColor(i3));
                dialogs_archiveAvatarDrawable.setLayerColor("Box1.**", getNonAnimatedColor(i3));
                dialogs_archiveAvatarDrawable.commitApplyLayerColors();
                dialogs_archiveAvatarDrawableRecolored = false;
                dialogs_archiveAvatarDrawable.setAllowDecodeSingleFrame(true);
                dialogs_pinArchiveDrawable.beginApplyLayerColors();
                RLottieDrawable rLottieDrawable3 = dialogs_pinArchiveDrawable;
                int i4 = key_chats_archiveIcon;
                rLottieDrawable3.setLayerColor("Arrow.**", getNonAnimatedColor(i4));
                dialogs_pinArchiveDrawable.setLayerColor("Line.**", getNonAnimatedColor(i4));
                dialogs_pinArchiveDrawable.commitApplyLayerColors();
                dialogs_unpinArchiveDrawable.beginApplyLayerColors();
                dialogs_unpinArchiveDrawable.setLayerColor("Arrow.**", getNonAnimatedColor(i4));
                dialogs_unpinArchiveDrawable.setLayerColor("Line.**", getNonAnimatedColor(i4));
                dialogs_unpinArchiveDrawable.commitApplyLayerColors();
                dialogs_hidePsaDrawable.beginApplyLayerColors();
                RLottieDrawable rLottieDrawable4 = dialogs_hidePsaDrawable;
                int i5 = key_chats_archiveBackground;
                rLottieDrawable4.setLayerColor("Line 1.**", getNonAnimatedColor(i5));
                dialogs_hidePsaDrawable.setLayerColor("Line 2.**", getNonAnimatedColor(i5));
                dialogs_hidePsaDrawable.setLayerColor("Line 3.**", getNonAnimatedColor(i5));
                dialogs_hidePsaDrawable.setLayerColor("Cup Red.**", getNonAnimatedColor(i4));
                dialogs_hidePsaDrawable.setLayerColor("Box.**", getNonAnimatedColor(i4));
                dialogs_hidePsaDrawable.commitApplyLayerColors();
                dialogs_hidePsaDrawableRecolored = false;
                dialogs_archiveDrawable.beginApplyLayerColors();
                dialogs_archiveDrawable.setLayerColor("Arrow.**", getNonAnimatedColor(i5));
                dialogs_archiveDrawable.setLayerColor("Box2.**", getNonAnimatedColor(i4));
                dialogs_archiveDrawable.setLayerColor("Box1.**", getNonAnimatedColor(i4));
                dialogs_archiveDrawable.commitApplyLayerColors();
                dialogs_archiveDrawableRecolored = false;
                dialogs_unarchiveDrawable.beginApplyLayerColors();
                dialogs_unarchiveDrawable.setLayerColor("Arrow1.**", getNonAnimatedColor(i4));
                dialogs_unarchiveDrawable.setLayerColor("Arrow2.**", getNonAnimatedColor(key_chats_archivePinBackground));
                dialogs_unarchiveDrawable.setLayerColor("Box2.**", getNonAnimatedColor(i4));
                dialogs_unarchiveDrawable.setLayerColor("Box1.**", getNonAnimatedColor(i4));
                dialogs_unarchiveDrawable.commitApplyLayerColors();
                chat_animatedEmojiTextColorFilter = new PorterDuffColorFilter(getColor(key_windowBackgroundWhiteBlackText), PorterDuff.Mode.SRC_IN);
                PremiumGradient.getInstance().checkIconColors();
                return;
            }
        }
    }

    public static void createCommonDialogResources(Context context) {
        if (dialogs_countTextPaint == null) {
            TextPaint textPaint = new TextPaint(1);
            dialogs_countTextPaint = textPaint;
            textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            dialogs_countPaint = new Paint(1);
            dialogs_reactionsCountPaint = new Paint(1);
            dialogs_onlineCirclePaint = new Paint(1);
        }
        dialogs_countTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
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
                dialogs_namePaint[i].setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                dialogs_nameEncryptedPaint[i] = new TextPaint(1);
                dialogs_nameEncryptedPaint[i].setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                dialogs_messagePaint[i] = new TextPaint(1);
                dialogs_messagePrintingPaint[i] = new TextPaint(1);
            }
            TextPaint textPaint = new TextPaint(1);
            dialogs_searchNamePaint = textPaint;
            textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            TextPaint textPaint2 = new TextPaint(1);
            dialogs_searchNameEncryptedPaint = textPaint2;
            textPaint2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            TextPaint textPaint3 = new TextPaint(1);
            dialogs_messageNamePaint = textPaint3;
            textPaint3.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            dialogs_timePaint = new TextPaint(1);
            TextPaint textPaint4 = new TextPaint(1);
            dialogs_archiveTextPaint = textPaint4;
            textPaint4.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            TextPaint textPaint5 = new TextPaint(1);
            dialogs_archiveTextPaintSmall = textPaint5;
            textPaint5.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            dialogs_onlinePaint = new TextPaint(1);
            dialogs_offlinePaint = new TextPaint(1);
            dialogs_tabletSeletedPaint = new Paint();
            dialogs_pinnedPaint = new Paint(1);
            dialogs_countGrayPaint = new Paint(1);
            dialogs_errorPaint = new Paint(1);
            dialogs_actionMessagePaint = new Paint(1);
            dialogs_lockDrawable = resources.getDrawable(R.drawable.list_secret);
            dialogs_lock2Drawable = resources.getDrawable(R.drawable.msg_mini_lock2);
            int i2 = R.drawable.list_check;
            dialogs_checkDrawable = resources.getDrawable(i2).mutate();
            dialogs_playDrawable = resources.getDrawable(R.drawable.minithumb_play).mutate();
            dialogs_checkReadDrawable = resources.getDrawable(i2).mutate();
            dialogs_halfCheckDrawable = resources.getDrawable(R.drawable.list_halfcheck);
            dialogs_clockDrawable = new MsgClockDrawable();
            dialogs_errorDrawable = resources.getDrawable(R.drawable.list_warning_sign);
            dialogs_reorderDrawable = resources.getDrawable(R.drawable.list_reorder).mutate();
            dialogs_muteDrawable = resources.getDrawable(R.drawable.list_mute).mutate();
            dialogs_unmuteDrawable = resources.getDrawable(R.drawable.list_unmute).mutate();
            dialogs_verifiedDrawable = resources.getDrawable(R.drawable.verified_area).mutate();
            dialogs_scamDrawable = new ScamDrawable(11, 0);
            dialogs_fakeDrawable = new ScamDrawable(11, 1);
            dialogs_verifiedCheckDrawable = resources.getDrawable(R.drawable.verified_check).mutate();
            dialogs_mentionDrawable = resources.getDrawable(R.drawable.mentionchatslist);
            dialogs_reactionsMentionDrawable = resources.getDrawable(R.drawable.reactionchatslist);
            dialogs_pinnedDrawable = resources.getDrawable(R.drawable.list_pin);
            dialogs_forum_arrowDrawable = resources.getDrawable(R.drawable.msg_mini_forumarrow);
            moveUpDrawable = resources.getDrawable(R.drawable.preview_arrow);
            RectF rectF = new RectF();
            chat_updatePath[0] = new Path();
            chat_updatePath[2] = new Path();
            float dp = AndroidUtilities.dp(12.0f);
            float dp2 = AndroidUtilities.dp(12.0f);
            rectF.set(dp - AndroidUtilities.dp(5.0f), dp2 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f) + dp, AndroidUtilities.dp(5.0f) + dp2);
            chat_updatePath[2].arcTo(rectF, -160.0f, -110.0f, true);
            chat_updatePath[2].arcTo(rectF, 20.0f, -110.0f, true);
            chat_updatePath[0].moveTo(dp, AndroidUtilities.dp(8.0f) + dp2);
            chat_updatePath[0].lineTo(dp, AndroidUtilities.dp(2.0f) + dp2);
            chat_updatePath[0].lineTo(AndroidUtilities.dp(3.0f) + dp, AndroidUtilities.dp(5.0f) + dp2);
            chat_updatePath[0].close();
            chat_updatePath[0].moveTo(dp, dp2 - AndroidUtilities.dp(8.0f));
            chat_updatePath[0].lineTo(dp, dp2 - AndroidUtilities.dp(2.0f));
            chat_updatePath[0].lineTo(dp - AndroidUtilities.dp(3.0f), dp2 - AndroidUtilities.dp(5.0f));
            chat_updatePath[0].close();
            applyDialogsTheme();
        }
        dialogs_messageNamePaint.setTextSize(AndroidUtilities.dp(14.0f));
        dialogs_timePaint.setTextSize(AndroidUtilities.dp(13.0f));
        dialogs_archiveTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
        dialogs_archiveTextPaintSmall.setTextSize(AndroidUtilities.dp(11.0f));
        dialogs_onlinePaint.setTextSize(AndroidUtilities.dp(15.0f));
        dialogs_offlinePaint.setTextSize(AndroidUtilities.dp(15.0f));
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
            TextPaint[] textPaintArr = dialogs_messagePaint;
            TextPaint textPaint = textPaintArr[i];
            TextPaint textPaint2 = textPaintArr[i];
            int color = getColor(key_chats_message);
            textPaint2.linkColor = color;
            textPaint.setColor(color);
            dialogs_messagePrintingPaint[i].setColor(getColor(key_chats_actionMessage));
        }
        dialogs_searchNamePaint.setColor(getColor(key_chats_name));
        dialogs_searchNameEncryptedPaint.setColor(getColor(key_chats_secretName));
        TextPaint textPaint3 = dialogs_messageNamePaint;
        int color2 = getColor(key_chats_nameMessage_threeLines);
        textPaint3.linkColor = color2;
        textPaint3.setColor(color2);
        dialogs_tabletSeletedPaint.setColor(getColor(key_chats_tabletSelectedOverlay));
        dialogs_pinnedPaint.setColor(getColor(key_chats_pinnedOverlay));
        dialogs_timePaint.setColor(getColor(key_chats_date));
        dialogs_countTextPaint.setColor(getColor(key_chats_unreadCounterText));
        TextPaint textPaint4 = dialogs_archiveTextPaint;
        int i2 = key_chats_archiveText;
        textPaint4.setColor(getColor(i2));
        dialogs_archiveTextPaintSmall.setColor(getColor(i2));
        dialogs_countPaint.setColor(getColor(key_chats_unreadCounter));
        dialogs_reactionsCountPaint.setColor(getColor(key_dialogReactionMentionBackground));
        dialogs_countGrayPaint.setColor(getColor(key_chats_unreadCounterMuted));
        dialogs_actionMessagePaint.setColor(getColor(key_chats_actionMessage));
        dialogs_errorPaint.setColor(getColor(key_chats_sentError));
        dialogs_onlinePaint.setColor(getColor(key_windowBackgroundWhiteBlueText3));
        dialogs_offlinePaint.setColor(getColor(key_windowBackgroundWhiteGrayText3));
        setDrawableColorByKey(dialogs_lockDrawable, key_chats_secretIcon);
        Drawable drawable = dialogs_lock2Drawable;
        int i3 = key_chats_pinnedIcon;
        setDrawableColorByKey(drawable, i3);
        setDrawableColorByKey(dialogs_checkDrawable, key_chats_sentCheck);
        Drawable drawable2 = dialogs_checkReadDrawable;
        int i4 = key_chats_sentReadCheck;
        setDrawableColorByKey(drawable2, i4);
        setDrawableColorByKey(dialogs_halfCheckDrawable, i4);
        setDrawableColorByKey(dialogs_clockDrawable, key_chats_sentClock);
        setDrawableColorByKey(dialogs_errorDrawable, key_chats_sentErrorIcon);
        setDrawableColorByKey(dialogs_pinnedDrawable, i3);
        setDrawableColorByKey(dialogs_reorderDrawable, i3);
        Drawable drawable3 = dialogs_muteDrawable;
        int i5 = key_chats_muteIcon;
        setDrawableColorByKey(drawable3, i5);
        setDrawableColorByKey(dialogs_unmuteDrawable, i5);
        Drawable drawable4 = dialogs_mentionDrawable;
        int i6 = key_chats_mentionIcon;
        setDrawableColorByKey(drawable4, i6);
        setDrawableColorByKey(dialogs_forum_arrowDrawable, key_chats_message);
        setDrawableColorByKey(dialogs_reactionsMentionDrawable, i6);
        setDrawableColorByKey(dialogs_verifiedDrawable, key_chats_verifiedBackground);
        setDrawableColorByKey(dialogs_verifiedCheckDrawable, key_chats_verifiedCheck);
        setDrawableColorByKey(dialogs_holidayDrawable, key_actionBarDefaultTitle);
        ScamDrawable scamDrawable = dialogs_scamDrawable;
        int i7 = key_chats_draft;
        setDrawableColorByKey(scamDrawable, i7);
        setDrawableColorByKey(dialogs_fakeDrawable, i7);
    }

    public static void reloadAllResources(Context context) {
        destroyResources();
        if (chat_msgInDrawable != null) {
            chat_msgInDrawable = null;
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
            if (chat_msgTextPaint == null) {
                chat_msgTextPaint = new TextPaint(1);
                chat_msgGameTextPaint = new TextPaint(1);
                chat_msgTextPaintEmoji = new TextPaint[6];
                chat_msgTextPaintOneEmoji = new TextPaint(1);
                chat_msgTextPaintTwoEmoji = new TextPaint(1);
                chat_msgTextPaintThreeEmoji = new TextPaint(1);
                TextPaint textPaint = new TextPaint(1);
                chat_msgBotButtonPaint = textPaint;
                textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                TextPaint textPaint2 = new TextPaint(1);
                chat_namePaint = textPaint2;
                textPaint2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                TextPaint textPaint3 = new TextPaint(1);
                chat_replyNamePaint = textPaint3;
                textPaint3.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                chat_replyTextPaint = new TextPaint(1);
                TextPaint textPaint4 = new TextPaint(1);
                chat_topicTextPaint = textPaint4;
                textPaint4.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                chat_forwardNamePaint = new TextPaint(1);
                chat_adminPaint = new TextPaint(1);
                chat_timePaint = new TextPaint(1);
            }
            int i = 0;
            float[] fArr = {0.68f, 0.46f, 0.34f, 0.28f, 0.22f, 0.19f};
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
                    chat_topicTextPaint.setTextSize(AndroidUtilities.dp(f2));
                    chat_forwardNamePaint.setTextSize(AndroidUtilities.dp(f));
                    chat_adminPaint.setTextSize(AndroidUtilities.dp(f2));
                }
            }
        }
    }

    public static void createCommonChatResources() {
        createCommonMessageResources();
        if (chat_infoPaint == null) {
            chat_infoPaint = new TextPaint(1);
            TextPaint textPaint = new TextPaint(1);
            chat_stickerCommentCountPaint = textPaint;
            textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            TextPaint textPaint2 = new TextPaint(1);
            chat_docNamePaint = textPaint2;
            textPaint2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            chat_docBackPaint = new Paint(1);
            chat_deleteProgressPaint = new Paint(1);
            TextPaint textPaint3 = new TextPaint(1);
            chat_locationTitlePaint = textPaint3;
            textPaint3.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            chat_locationAddressPaint = new TextPaint(1);
            Paint paint = new Paint();
            chat_urlPaint = paint;
            paint.setPathEffect(LinkPath.getRoundedEffect());
            Paint paint2 = new Paint();
            chat_outUrlPaint = paint2;
            paint2.setPathEffect(LinkPath.getRoundedEffect());
            Paint paint3 = new Paint();
            chat_textSearchSelectionPaint = paint3;
            paint3.setPathEffect(LinkPath.getRoundedEffect());
            Paint paint4 = new Paint(1);
            chat_radialProgressPaint = paint4;
            paint4.setStrokeCap(Paint.Cap.ROUND);
            chat_radialProgressPaint.setStyle(Paint.Style.STROKE);
            chat_radialProgressPaint.setColor(-1610612737);
            Paint paint5 = new Paint(1);
            chat_radialProgress2Paint = paint5;
            paint5.setStrokeCap(Paint.Cap.ROUND);
            chat_radialProgress2Paint.setStyle(Paint.Style.STROKE);
            chat_audioTimePaint = new TextPaint(1);
            TextPaint textPaint4 = new TextPaint(1);
            chat_livePaint = textPaint4;
            textPaint4.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            TextPaint textPaint5 = new TextPaint(1);
            chat_audioTitlePaint = textPaint5;
            textPaint5.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            chat_audioPerformerPaint = new TextPaint(1);
            TextPaint textPaint6 = new TextPaint(1);
            chat_botButtonPaint = textPaint6;
            textPaint6.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            TextPaint textPaint7 = new TextPaint(1);
            chat_contactNamePaint = textPaint7;
            textPaint7.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            chat_contactPhonePaint = new TextPaint(1);
            chat_durationPaint = new TextPaint(1);
            TextPaint textPaint8 = new TextPaint(1);
            chat_gamePaint = textPaint8;
            textPaint8.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            chat_shipmentPaint = new TextPaint(1);
            chat_timePaint = new TextPaint(1);
            chat_adminPaint = new TextPaint(1);
            TextPaint textPaint9 = new TextPaint(1);
            chat_namePaint = textPaint9;
            textPaint9.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            chat_forwardNamePaint = new TextPaint(1);
            TextPaint textPaint10 = new TextPaint(1);
            chat_replyNamePaint = textPaint10;
            textPaint10.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            chat_replyTextPaint = new TextPaint(1);
            TextPaint textPaint11 = new TextPaint(1);
            chat_topicTextPaint = textPaint11;
            textPaint11.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            chat_commentTextPaint = new TextPaint(1);
            TextPaint textPaint12 = new TextPaint(1);
            chat_instantViewPaint = textPaint12;
            textPaint12.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            Paint paint6 = new Paint(1);
            chat_instantViewRectPaint = paint6;
            paint6.setStyle(Paint.Style.STROKE);
            chat_instantViewRectPaint.setStrokeCap(Paint.Cap.ROUND);
            Paint paint7 = new Paint(1);
            chat_pollTimerPaint = paint7;
            paint7.setStyle(Paint.Style.STROKE);
            chat_pollTimerPaint.setStrokeCap(Paint.Cap.ROUND);
            chat_replyLinePaint = new Paint(1);
            chat_msgErrorPaint = new Paint(1);
            chat_statusPaint = new Paint(1);
            Paint paint8 = new Paint(1);
            chat_statusRecordPaint = paint8;
            paint8.setStyle(Paint.Style.STROKE);
            chat_statusRecordPaint.setStrokeCap(Paint.Cap.ROUND);
            chat_actionTextPaint = new TextPaint(1);
            chat_actionTextPaint2 = new TextPaint(1);
            chat_actionTextPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            TextPaint textPaint13 = new TextPaint(1);
            chat_unlockExtendedMediaTextPaint = textPaint13;
            textPaint13.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            Paint paint9 = new Paint(1);
            chat_actionBackgroundGradientDarkenPaint = paint9;
            paint9.setColor(704643072);
            chat_timeBackgroundPaint = new Paint(1);
            TextPaint textPaint14 = new TextPaint(1);
            chat_contextResult_titleTextPaint = textPaint14;
            textPaint14.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            chat_contextResult_descriptionTextPaint = new TextPaint(1);
            chat_composeBackgroundPaint = new Paint();
            new Paint(1);
            chat_radialProgressPausedSeekbarPaint = new Paint(1);
            chat_messageBackgroundSelectedPaint = new Paint(1);
            chat_actionBackgroundPaint = new Paint(1);
            chat_actionBackgroundSelectedPaint = new Paint(1);
            chat_actionBackgroundPaint2 = new Paint(1);
            new Paint(1);
            addChatPaint("paintChatMessageBackgroundSelected", chat_messageBackgroundSelectedPaint, key_chat_selectedBackground);
            addChatPaint("paintChatActionBackground", chat_actionBackgroundPaint, key_chat_serviceBackground);
            addChatPaint("paintChatActionBackgroundSelected", chat_actionBackgroundSelectedPaint, key_chat_serviceBackgroundSelected);
            TextPaint textPaint15 = chat_actionTextPaint;
            int i = key_chat_serviceText;
            addChatPaint("paintChatActionText", textPaint15, i);
            addChatPaint("paintChatActionText2", chat_actionTextPaint2, i);
            addChatPaint("paintChatBotButton", chat_botButtonPaint, key_chat_botButtonText);
            addChatPaint("paintChatComposeBackground", chat_composeBackgroundPaint, key_chat_messagePanelBackground);
            addChatPaint("paintChatTimeBackground", chat_timeBackgroundPaint, key_chat_mediaTimeBackground);
        }
    }

    public static void createChatResources(Context context, boolean z) {
        TextPaint textPaint;
        createCommonChatResources();
        if (!z && chat_msgInDrawable == null) {
            Resources resources = context.getResources();
            chat_msgNoSoundDrawable = resources.getDrawable(R.drawable.video_muted);
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
            int i14 = R.drawable.ic_call_made_green_18dp;
            calllog_msgCallUpRedDrawable = resources.getDrawable(i14).mutate();
            calllog_msgCallUpGreenDrawable = resources.getDrawable(i14).mutate();
            int i15 = R.drawable.ic_call_received_green_18dp;
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
            chat_commentDrawable = resources.getDrawable(R.drawable.msg_msgbubble);
            chat_commentStickerDrawable = resources.getDrawable(R.drawable.msg_msgbubble2);
            chat_commentArrowDrawable = resources.getDrawable(R.drawable.msg_arrowright);
            chat_gradientLeftDrawable = resources.getDrawable(R.drawable.gradient_left);
            chat_gradientRightDrawable = resources.getDrawable(R.drawable.gradient_right);
            chat_contextResult_shadowUnderSwitchDrawable = resources.getDrawable(R.drawable.header_shadow).mutate();
            chat_attachButtonDrawables[0] = new RLottieDrawable(R.raw.attach_gallery, "attach_gallery", AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
            chat_attachButtonDrawables[1] = new RLottieDrawable(R.raw.attach_music, "attach_music", AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
            chat_attachButtonDrawables[2] = new RLottieDrawable(R.raw.attach_file, "attach_file", AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
            chat_attachButtonDrawables[3] = new RLottieDrawable(R.raw.attach_contact, "attach_contact", AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
            chat_attachButtonDrawables[4] = new RLottieDrawable(R.raw.attach_location, "attach_location", AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
            chat_attachButtonDrawables[5] = new RLottieDrawable(R.raw.attach_poll, "attach_poll", AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
            chat_attachEmptyDrawable = resources.getDrawable(R.drawable.nophotos3);
            chat_shareIconDrawable = resources.getDrawable(R.drawable.share_arrow).mutate();
            chat_replyIconDrawable = resources.getDrawable(R.drawable.fast_reply);
            chat_goIconDrawable = resources.getDrawable(R.drawable.message_arrow);
            int dp = AndroidUtilities.dp(2.0f);
            RectF rectF = new RectF();
            chat_filePath[0] = new Path();
            chat_filePath[0].moveTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(3.0f));
            chat_filePath[0].lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f));
            chat_filePath[0].lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f));
            chat_filePath[0].lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(20.0f));
            int i16 = dp * 2;
            rectF.set(AndroidUtilities.dp(21.0f) - i16, AndroidUtilities.dp(19.0f) - dp, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(19.0f) + dp);
            chat_filePath[0].arcTo(rectF, 0.0f, 90.0f, false);
            chat_filePath[0].lineTo(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f));
            rectF.set(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(19.0f) - dp, AndroidUtilities.dp(5.0f) + i16, AndroidUtilities.dp(19.0f) + dp);
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
            chat_flameIcon = resources.getDrawable(R.drawable.burn).mutate();
            chat_gifIcon = resources.getDrawable(R.drawable.msg_round_gif_m).mutate();
            Drawable[] drawableArr3 = chat_fileStatesDrawable[0];
            int dp2 = AndroidUtilities.dp(44.0f);
            int i17 = R.drawable.msg_round_play_m;
            drawableArr3[0] = createCircleDrawableWithIcon(dp2, i17);
            chat_fileStatesDrawable[0][1] = createCircleDrawableWithIcon(AndroidUtilities.dp(44.0f), i17);
            Drawable[] drawableArr4 = chat_fileStatesDrawable[1];
            int dp3 = AndroidUtilities.dp(44.0f);
            int i18 = R.drawable.msg_round_pause_m;
            drawableArr4[0] = createCircleDrawableWithIcon(dp3, i18);
            chat_fileStatesDrawable[1][1] = createCircleDrawableWithIcon(AndroidUtilities.dp(44.0f), i18);
            Drawable[] drawableArr5 = chat_fileStatesDrawable[2];
            int dp4 = AndroidUtilities.dp(44.0f);
            int i19 = R.drawable.msg_round_load_m;
            drawableArr5[0] = createCircleDrawableWithIcon(dp4, i19);
            chat_fileStatesDrawable[2][1] = createCircleDrawableWithIcon(AndroidUtilities.dp(44.0f), i19);
            Drawable[] drawableArr6 = chat_fileStatesDrawable[3];
            int dp5 = AndroidUtilities.dp(44.0f);
            int i20 = R.drawable.msg_round_file_s;
            drawableArr6[0] = createCircleDrawableWithIcon(dp5, i20);
            chat_fileStatesDrawable[3][1] = createCircleDrawableWithIcon(AndroidUtilities.dp(44.0f), i20);
            Drawable[] drawableArr7 = chat_fileStatesDrawable[4];
            int dp6 = AndroidUtilities.dp(44.0f);
            int i21 = R.drawable.msg_round_cancel_m;
            drawableArr7[0] = createCircleDrawableWithIcon(dp6, i21);
            chat_fileStatesDrawable[4][1] = createCircleDrawableWithIcon(AndroidUtilities.dp(44.0f), i21);
            Drawable[] drawableArr8 = chat_contactDrawable;
            int dp7 = AndroidUtilities.dp(44.0f);
            int i22 = R.drawable.msg_contact;
            drawableArr8[0] = createCircleDrawableWithIcon(dp7, i22);
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
        float f = ((SharedConfig.fontSize * 2) + 10) / 3.0f;
        chat_namePaint.setTextSize(AndroidUtilities.dp(f));
        chat_replyNamePaint.setTextSize(AndroidUtilities.dp(f));
        chat_replyTextPaint.setTextSize(AndroidUtilities.dp(f));
        float f2 = f - 1.0f;
        chat_topicTextPaint.setTextSize(AndroidUtilities.dp(f2));
        chat_forwardNamePaint.setTextSize(AndroidUtilities.dp(f));
        chat_adminPaint.setTextSize(AndroidUtilities.dp(f2));
        int i32 = SharedConfig.fontSize;
        chat_timePaint.setTextSize(AndroidUtilities.dp(12.0f));
        chat_gamePaint.setTextSize(AndroidUtilities.dp(13.0f));
        chat_shipmentPaint.setTextSize(AndroidUtilities.dp(13.0f));
        chat_instantViewPaint.setTextSize(AndroidUtilities.dp(13.0f));
        chat_instantViewRectPaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        chat_pollTimerPaint.setStrokeWidth(AndroidUtilities.dp(1.1f));
        chat_actionTextPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        chat_actionTextPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        chat_unlockExtendedMediaTextPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize)));
        chat_contextResult_titleTextPaint.setTextSize(AndroidUtilities.dp(15.0f));
        chat_contextResult_descriptionTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
        chat_radialProgressPaint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        chat_radialProgress2Paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        chat_commentTextPaint.setTextSize(AndroidUtilities.dp(14.0f));
        chat_commentTextPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
    }

    public static void refreshAttachButtonsColors() {
        int i = 0;
        while (true) {
            RLottieDrawable[] rLottieDrawableArr = chat_attachButtonDrawables;
            if (i >= rLottieDrawableArr.length) {
                return;
            }
            if (rLottieDrawableArr[i] != null) {
                rLottieDrawableArr[i].beginApplyLayerColors();
                if (i == 0) {
                    RLottieDrawable rLottieDrawable = chat_attachButtonDrawables[i];
                    int i2 = key_chat_attachGalleryBackground;
                    rLottieDrawable.setLayerColor("Color_Mount.**", getNonAnimatedColor(i2));
                    chat_attachButtonDrawables[i].setLayerColor("Color_PhotoShadow.**", getNonAnimatedColor(i2));
                    RLottieDrawable rLottieDrawable2 = chat_attachButtonDrawables[i];
                    int i3 = key_chat_attachIcon;
                    rLottieDrawable2.setLayerColor("White_Photo.**", getNonAnimatedColor(i3));
                    chat_attachButtonDrawables[i].setLayerColor("White_BackPhoto.**", getNonAnimatedColor(i3));
                } else if (i == 1) {
                    RLottieDrawable rLottieDrawable3 = chat_attachButtonDrawables[i];
                    int i4 = key_chat_attachIcon;
                    rLottieDrawable3.setLayerColor("White_Play1.**", getNonAnimatedColor(i4));
                    chat_attachButtonDrawables[i].setLayerColor("White_Play2.**", getNonAnimatedColor(i4));
                } else if (i == 2) {
                    chat_attachButtonDrawables[i].setLayerColor("Color_Corner.**", getNonAnimatedColor(key_chat_attachFileBackground));
                    chat_attachButtonDrawables[i].setLayerColor("White_List.**", getNonAnimatedColor(key_chat_attachIcon));
                } else if (i == 3) {
                    RLottieDrawable rLottieDrawable4 = chat_attachButtonDrawables[i];
                    int i5 = key_chat_attachIcon;
                    rLottieDrawable4.setLayerColor("White_User1.**", getNonAnimatedColor(i5));
                    chat_attachButtonDrawables[i].setLayerColor("White_User2.**", getNonAnimatedColor(i5));
                } else if (i == 4) {
                    chat_attachButtonDrawables[i].setLayerColor("Color_Oval.**", getNonAnimatedColor(key_chat_attachLocationBackground));
                    chat_attachButtonDrawables[i].setLayerColor("White_Pin.**", getNonAnimatedColor(key_chat_attachIcon));
                } else if (i == 5) {
                    RLottieDrawable rLottieDrawable5 = chat_attachButtonDrawables[i];
                    int i6 = key_chat_attachIcon;
                    rLottieDrawable5.setLayerColor("White_Column 1.**", getNonAnimatedColor(i6));
                    chat_attachButtonDrawables[i].setLayerColor("White_Column 2.**", getNonAnimatedColor(i6));
                    chat_attachButtonDrawables[i].setLayerColor("White_Column 3.**", getNonAnimatedColor(i6));
                }
                chat_attachButtonDrawables[i].commitApplyLayerColors();
            }
            i++;
        }
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
        chat_deleteProgressPaint.setColor(getColor(key_chat_secretTimeText));
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
        setDrawableColorByKey(chat_botInviteDrawable, i8);
        setDrawableColorByKey(chat_botLinkDrawable, i8);
        Drawable drawable5 = chat_msgInViewsDrawable;
        int i9 = key_chat_inViews;
        setDrawableColorByKey(drawable5, i9);
        Drawable drawable6 = chat_msgInViewsSelectedDrawable;
        int i10 = key_chat_inViewsSelected;
        setDrawableColorByKey(drawable6, i10);
        Drawable drawable7 = chat_msgOutViewsDrawable;
        int i11 = key_chat_outViews;
        setDrawableColorByKey(drawable7, i11);
        Drawable drawable8 = chat_msgOutViewsSelectedDrawable;
        int i12 = key_chat_outViewsSelected;
        setDrawableColorByKey(drawable8, i12);
        setDrawableColorByKey(chat_msgInRepliesDrawable, i9);
        setDrawableColorByKey(chat_msgInRepliesSelectedDrawable, i10);
        setDrawableColorByKey(chat_msgOutRepliesDrawable, i11);
        setDrawableColorByKey(chat_msgOutRepliesSelectedDrawable, i12);
        setDrawableColorByKey(chat_msgInPinnedDrawable, i9);
        setDrawableColorByKey(chat_msgInPinnedSelectedDrawable, i10);
        setDrawableColorByKey(chat_msgOutPinnedDrawable, i11);
        setDrawableColorByKey(chat_msgOutPinnedSelectedDrawable, i12);
        Drawable drawable9 = chat_msgMediaPinnedDrawable;
        int i13 = key_chat_mediaViews;
        setDrawableColorByKey(drawable9, i13);
        setDrawableColorByKey(chat_msgStickerPinnedDrawable, i2);
        setDrawableColorByKey(chat_msgMediaViewsDrawable, i13);
        setDrawableColorByKey(chat_msgMediaRepliesDrawable, i13);
        setDrawableColorByKey(chat_msgInMenuDrawable, key_chat_inMenu);
        setDrawableColorByKey(chat_msgInMenuSelectedDrawable, key_chat_inMenuSelected);
        setDrawableColorByKey(chat_msgOutMenuDrawable, key_chat_outMenu);
        setDrawableColorByKey(chat_msgOutMenuSelectedDrawable, key_chat_outMenuSelected);
        setDrawableColorByKey(chat_msgMediaMenuDrawable, key_chat_mediaMenu);
        setDrawableColorByKey(chat_msgOutInstantDrawable, key_chat_outInstant);
        Drawable drawable10 = chat_msgInInstantDrawable;
        int i14 = key_chat_inInstant;
        setDrawableColorByKey(drawable10, i14);
        setDrawableColorByKey(chat_msgErrorDrawable, key_chat_sentErrorIcon);
        setDrawableColorByKey(chat_muteIconDrawable, key_chat_muteIcon);
        setDrawableColorByKey(chat_lockIconDrawable, key_chat_lockIcon);
        Drawable drawable11 = chat_inlineResultFile;
        int i15 = key_chat_inlineResultIcon;
        setDrawableColorByKey(drawable11, i15);
        setDrawableColorByKey(chat_inlineResultAudio, i15);
        setDrawableColorByKey(chat_inlineResultLocation, i15);
        setDrawableColorByKey(chat_commentDrawable, i14);
        setDrawableColorByKey(chat_commentStickerDrawable, i8);
        setDrawableColorByKey(chat_commentArrowDrawable, i14);
        Drawable drawable12 = chat_gradientLeftDrawable;
        int i16 = key_chat_stickersHintPanel;
        setDrawableColorByKey(drawable12, i16);
        setDrawableColorByKey(chat_gradientRightDrawable, i16);
        for (int i17 = 0; i17 < 2; i17++) {
            setDrawableColorByKey(chat_msgInCallDrawable[i17], key_chat_inInstant);
            setDrawableColorByKey(chat_msgInCallSelectedDrawable[i17], key_chat_inInstantSelected);
            setDrawableColorByKey(chat_msgOutCallDrawable[i17], key_chat_outInstant);
            setDrawableColorByKey(chat_msgOutCallSelectedDrawable[i17], key_chat_outInstantSelected);
        }
        setDrawableColorByKey(chat_msgCallUpGreenDrawable, key_chat_outGreenCall);
        Drawable drawable13 = chat_msgCallDownRedDrawable;
        int i18 = key_fill_RedNormal;
        setDrawableColorByKey(drawable13, i18);
        setDrawableColorByKey(chat_msgCallDownGreenDrawable, key_chat_inGreenCall);
        setDrawableColorByKey(calllog_msgCallUpRedDrawable, i18);
        Drawable drawable14 = calllog_msgCallUpGreenDrawable;
        int i19 = key_calls_callReceivedGreenIcon;
        setDrawableColorByKey(drawable14, i19);
        setDrawableColorByKey(calllog_msgCallDownRedDrawable, i18);
        setDrawableColorByKey(calllog_msgCallDownGreenDrawable, i19);
        int i20 = 0;
        while (true) {
            StatusDrawable[] statusDrawableArr = chat_status_drawables;
            if (i20 >= statusDrawableArr.length) {
                break;
            }
            setDrawableColorByKey(statusDrawableArr[i20], key_chats_actionMessage);
            i20++;
        }
        for (int i21 = 0; i21 < 5; i21++) {
            setCombinedDrawableColor(chat_fileStatesDrawable[i21][0], getColor(key_chat_inLoader), false);
            setCombinedDrawableColor(chat_fileStatesDrawable[i21][0], getColor(key_chat_inMediaIcon), true);
            setCombinedDrawableColor(chat_fileStatesDrawable[i21][1], getColor(key_chat_inLoaderSelected), false);
            setCombinedDrawableColor(chat_fileStatesDrawable[i21][1], getColor(key_chat_inMediaIconSelected), true);
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
        if (!z2 && !disallowChangeServiceMessageColor) {
            applyChatServiceMessageColor();
            applyChatMessageSelectedBackgroundColor();
        }
        refreshAttachButtonsColors();
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
        if (view == null || view2 == null) {
            return;
        }
        view.getLocationOnScreen(viewPos);
        int[] iArr = viewPos;
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationOnScreen(iArr);
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
        if (bitmapShader == null) {
            return;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float f3 = i;
        float f4 = i2;
        float max = Math.max(f3 / width, f4 / height);
        matrix.reset();
        matrix.setTranslate(((f3 - (width * max)) / 2.0f) - f, ((f4 - (height * max)) / 2.0f) - f2);
        matrix.preScale(max, max);
        bitmapShader.setLocalMatrix(matrix);
    }

    public static void applyChatServiceMessageColor(int[] iArr, Drawable drawable) {
        applyChatServiceMessageColor(iArr, drawable, wallpaper);
    }

    public static void applyChatServiceMessageColor(int[] iArr, Drawable drawable, Drawable drawable2) {
        int i;
        int i2;
        int i3;
        if (chat_actionBackgroundPaint == null) {
            return;
        }
        serviceMessageColor = serviceMessageColorBackup;
        serviceSelectedMessageColor = serviceSelectedMessageColorBackup;
        boolean z = true;
        if (iArr != null && iArr.length >= 2) {
            i = iArr[0];
            i3 = iArr[1];
            serviceMessageColor = iArr[0];
            serviceSelectedMessageColor = iArr[1];
            i2 = i;
        } else {
            int indexOfKey = currentColors.indexOfKey(key_chat_serviceBackground);
            if (indexOfKey >= 0) {
                i2 = currentColors.valueAt(indexOfKey);
                i = i2;
            } else {
                i = serviceMessageColor;
                i2 = serviceMessage2Color;
            }
            int indexOfKey2 = currentColors.indexOfKey(key_chat_serviceBackgroundSelected);
            if (indexOfKey2 >= 0) {
                i3 = currentColors.valueAt(indexOfKey2);
            } else {
                i3 = serviceSelectedMessageColor;
            }
        }
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z2 = drawable instanceof MotionBackgroundDrawable;
        if ((z2 && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32)) ? false : false) {
            Bitmap bitmap = ((MotionBackgroundDrawable) drawable).getBitmap();
            if (serviceBitmap != bitmap) {
                serviceBitmap = bitmap;
                Bitmap bitmap2 = serviceBitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                serviceBitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
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
            chat_actionTextPaint.linkColor = -1;
            chat_unlockExtendedMediaTextPaint.setColor(-1);
            chat_botButtonPaint.setColor(-1);
            setDrawableColor(chat_commentStickerDrawable, -1);
            setDrawableColor(chat_shareIconDrawable, -1);
            setDrawableColor(chat_replyIconDrawable, -1);
            setDrawableColor(chat_goIconDrawable, -1);
            setDrawableColor(chat_botInlineDrawable, -1);
            setDrawableColor(chat_botWebViewDrawable, -1);
            setDrawableColor(chat_botInviteDrawable, -1);
            setDrawableColor(chat_botLinkDrawable, -1);
        } else {
            serviceBitmap = null;
            serviceBitmapShader = null;
            Drawable drawable3 = chat_msgStickerPinnedDrawable;
            int i4 = key_chat_serviceText;
            setDrawableColorByKey(drawable3, i4);
            setDrawableColorByKey(chat_msgStickerCheckDrawable, i4);
            setDrawableColorByKey(chat_msgStickerHalfCheckDrawable, i4);
            setDrawableColorByKey(chat_msgStickerViewsDrawable, i4);
            setDrawableColorByKey(chat_msgStickerRepliesDrawable, i4);
            chat_actionTextPaint.setColor(getColor(i4));
            chat_actionTextPaint2.setColor(getColor(i4));
            chat_actionTextPaint.linkColor = getColor(key_chat_serviceLink);
            chat_unlockExtendedMediaTextPaint.setColor(getColor(i4));
            Drawable drawable4 = chat_commentStickerDrawable;
            int i5 = key_chat_serviceIcon;
            setDrawableColorByKey(drawable4, i5);
            setDrawableColorByKey(chat_shareIconDrawable, i5);
            setDrawableColorByKey(chat_replyIconDrawable, i5);
            setDrawableColorByKey(chat_goIconDrawable, i5);
            setDrawableColorByKey(chat_botInlineDrawable, i5);
            setDrawableColorByKey(chat_botWebViewDrawable, i5);
            setDrawableColorByKey(chat_botInviteDrawable, i5);
            setDrawableColorByKey(chat_botLinkDrawable, i5);
            chat_botButtonPaint.setColor(getColor(key_chat_botButtonText));
        }
        chat_actionBackgroundPaint.setColor(i);
        chat_actionBackgroundSelectedPaint.setColor(i3);
        chat_actionBackgroundPaint2.setColor(i2);
        if (serviceBitmapShader != null && (currentColors.indexOfKey(key_chat_serviceBackground) < 0 || z2)) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(((MotionBackgroundDrawable) drawable).getIntensity() >= 0 ? 1.8f : 0.5f);
            chat_actionBackgroundPaint.setShader(serviceBitmapShader);
            chat_actionBackgroundPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            chat_actionBackgroundPaint.setAlpha(MessagesStorage.LAST_DB_VERSION);
            chat_actionBackgroundSelectedPaint.setShader(serviceBitmapShader);
            chat_actionBackgroundSelectedPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            chat_actionBackgroundSelectedPaint.setAlpha(200);
            return;
        }
        chat_actionBackgroundPaint.setColorFilter(null);
        chat_actionBackgroundPaint.setShader(null);
        chat_actionBackgroundSelectedPaint.setColorFilter(null);
        chat_actionBackgroundSelectedPaint.setShader(null);
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
        Drawable mutate = context.getResources().getDrawable(i).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
        return mutate;
    }

    public static int getDefaultColor(int i) {
        int i2 = defaultColors[i];
        return i2 == 0 ? (isMyMessagesBubbles(i) || i == key_chats_menuTopShadow || i == key_chats_menuTopBackground || i == key_chats_menuTopShadowCats || i == key_chat_wallpaper_gradient_to2 || i == key_chat_wallpaper_gradient_to3) ? 0 : -65536 : i2;
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
        int indexOfKey = currentColorsNoAccent.indexOfKey(i);
        if (indexOfKey >= 0) {
            int valueAt = currentColorsNoAccent.valueAt(indexOfKey);
            ThemeAccent accent = currentTheme.getAccent(false);
            if (accent == null) {
                return 0;
            }
            float[] tempHsv = getTempHsv(1);
            float[] tempHsv2 = getTempHsv(2);
            Color.colorToHSV(currentTheme.accentBaseColor, tempHsv);
            Color.colorToHSV(accent.accentColor, tempHsv2);
            return changeColorAccent(tempHsv, tempHsv2, valueAt, currentTheme.isDark());
        }
        return 0;
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

    public static int getColor(int i) {
        return getColor(i, null, false);
    }

    public static int getColor(int i, boolean[] zArr) {
        return getColor(i, zArr, false);
    }

    public static int getColor(int i, boolean[] zArr, boolean z) {
        int indexOfKey;
        boolean isDefaultMyMessages;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (!z && (sparseIntArray = animatingColors) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i)) >= 0) {
            return animatingColors.valueAt(indexOfKey2);
        }
        if (serviceBitmapShader == null || !(key_chat_serviceText == i || key_chat_serviceLink == i || key_chat_serviceIcon == i || key_chat_stickerReplyLine == i || key_chat_stickerReplyNameText == i || key_chat_stickerReplyMessageText == i)) {
            if (currentTheme == defaultTheme) {
                if (isMyMessagesBubbles(i)) {
                    isDefaultMyMessages = currentTheme.isDefaultMyMessagesBubbles();
                } else {
                    isDefaultMyMessages = isMyMessages(i) ? currentTheme.isDefaultMyMessages() : (key_chat_wallpaper == i || key_chat_wallpaper_gradient_to1 == i || key_chat_wallpaper_gradient_to2 == i || key_chat_wallpaper_gradient_to3 == i) ? false : currentTheme.isDefaultMainAccent();
                }
                if (isDefaultMyMessages) {
                    if (i == key_chat_serviceBackground) {
                        return serviceMessageColor;
                    }
                    if (i == key_chat_serviceBackgroundSelected) {
                        return serviceSelectedMessageColor;
                    }
                    return getDefaultColor(i);
                }
            }
            int indexOfKey3 = currentColors.indexOfKey(i);
            if (indexOfKey3 < 0) {
                int i2 = fallbackKeys.get(i, -1);
                if (i2 != -1 && (indexOfKey = currentColors.indexOfKey(i2)) >= 0) {
                    return currentColors.valueAt(indexOfKey);
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
            int valueAt = currentColors.valueAt(indexOfKey3);
            return (key_windowBackgroundWhite == i || key_windowBackgroundGray == i || key_actionBarDefault == i || key_actionBarDefaultArchived == i) ? valueAt | (-16777216) : valueAt;
        }
        return -1;
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
        } else if (i == key_chat_serviceBackground || i == key_chat_serviceBackgroundSelected) {
            applyChatServiceMessageColor();
        } else if (i == i3 || i == key_chat_wallpaper_gradient_to1 || i == key_chat_wallpaper_gradient_to2 || i == key_chat_wallpaper_gradient_to3 || i == key_chat_wallpaper_gradient_rotation) {
            reloadWallpaper(true);
        } else if (i == key_actionBarDefault) {
            if (Build.VERSION.SDK_INT >= 23) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        } else if (i != key_windowBackgroundGray || Build.VERSION.SDK_INT < 26) {
        } else {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
    }

    public static void setDefaultColor(int i, int i2) {
        defaultColors[i] = i2;
    }

    public static void setThemeWallpaper(ThemeInfo themeInfo, Bitmap bitmap, File file) {
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
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
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
        } else if (drawable instanceof MsgClockDrawable) {
            ((MsgClockDrawable) drawable).setColor(i);
        } else if (drawable instanceof ShapeDrawable) {
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

    @SuppressLint({"DiscouragedPrivateApi"})
    @TargetApi(21)
    public static void setRippleDrawableForceSoftware(RippleDrawable rippleDrawable) {
        if (rippleDrawable == null) {
            return;
        }
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(rippleDrawable, Boolean.TRUE);
        } catch (Throwable unused) {
        }
    }

    public static void setSelectorDrawableColor(Drawable drawable, int i, boolean z) {
        Drawable stateDrawable;
        if (drawable instanceof StateListDrawable) {
            try {
                if (z) {
                    Drawable stateDrawable2 = getStateDrawable(drawable, 0);
                    if (stateDrawable2 instanceof ShapeDrawable) {
                        ((ShapeDrawable) stateDrawable2).getPaint().setColor(i);
                    } else {
                        stateDrawable2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                    }
                    stateDrawable = getStateDrawable(drawable, 1);
                } else {
                    stateDrawable = getStateDrawable(drawable, 2);
                }
                if (stateDrawable instanceof ShapeDrawable) {
                    ((ShapeDrawable) stateDrawable).getPaint().setColor(i);
                } else {
                    stateDrawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                }
            } catch (Throwable unused) {
            }
        } else if (Build.VERSION.SDK_INT < 21 || !(drawable instanceof RippleDrawable)) {
        } else {
            RippleDrawable rippleDrawable = (RippleDrawable) drawable;
            if (z) {
                rippleDrawable.setColor(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i}));
            } else if (rippleDrawable.getNumberOfLayers() > 0) {
                Drawable drawable2 = rippleDrawable.getDrawable(0);
                if (drawable2 instanceof ShapeDrawable) {
                    ((ShapeDrawable) drawable2).getPaint().setColor(i);
                } else {
                    drawable2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                }
            }
        }
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
            int[] calcDrawableColor = AndroidUtilities.calcDrawableColor(drawable);
            int i2 = calcDrawableColor[0];
            serviceMessageColorBackup = i2;
            serviceMessageColor = i2;
            int i3 = calcDrawableColor[1];
            serviceSelectedMessageColorBackup = i3;
            serviceSelectedMessageColor = i3;
            serviceMessage2Color = calcDrawableColor[2];
            serviceSelectedMessage2Color = calcDrawableColor[3];
        }
    }

    public static int getServiceMessageColor() {
        int indexOfKey = currentColors.indexOfKey(key_chat_serviceBackground);
        if (indexOfKey >= 0) {
            return currentColors.valueAt(indexOfKey);
        }
        return serviceMessageColor;
    }

    public static void loadWallpaper(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.Theme.loadWallpaper(boolean):void");
    }

    public static void lambda$loadWallpaper$12(OverrideWallpaperInfo overrideWallpaperInfo, File file, int i, boolean z, TLRPC$Document tLRPC$Document, boolean z2) {
        final Drawable loadWallpaperInternal = loadWallpaperInternal(overrideWallpaperInfo, file, i, z, tLRPC$Document, z2);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                Theme.lambda$loadWallpaper$11(loadWallpaperInternal);
            }
        });
    }

    public static void lambda$loadWallpaper$11(Drawable drawable) {
        wallpaperLoadTask = null;
        createCommonChatResources();
        if (!disallowChangeServiceMessageColor) {
            applyChatServiceMessageColor(null, null, drawable);
            applyChatMessageSelectedBackgroundColor(null, drawable);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
    }

    private static Drawable loadWallpaperInternal(OverrideWallpaperInfo overrideWallpaperInfo, File file, int i, boolean z, TLRPC$Document tLRPC$Document, boolean z2) {
        BackgroundDrawableSettings createBackgroundDrawable = createBackgroundDrawable(currentTheme, overrideWallpaperInfo, currentColors, file, themedWallpaperLink, themedWallpaperFileOffset, i, previousPhase, z2, hasPreviousTheme, isApplyingAccent, z, tLRPC$Document);
        Boolean bool = createBackgroundDrawable.isWallpaperMotion;
        isWallpaperMotion = bool != null ? bool.booleanValue() : isWallpaperMotion;
        Boolean bool2 = createBackgroundDrawable.isPatternWallpaper;
        isPatternWallpaper = bool2 != null ? bool2.booleanValue() : isPatternWallpaper;
        Boolean bool3 = createBackgroundDrawable.isCustomTheme;
        isCustomTheme = bool3 != null ? bool3.booleanValue() : isCustomTheme;
        Drawable drawable = createBackgroundDrawable.wallpaper;
        wallpaper = drawable != null ? drawable : wallpaper;
        calcBackgroundColor(drawable, 1);
        return drawable;
    }

    public static BackgroundDrawableSettings createBackgroundDrawable(ThemeInfo themeInfo, SparseIntArray sparseIntArray, String str, int i) {
        float f;
        float f2;
        boolean z = themeInfo.firstAccentIsDefault && themeInfo.currentAccentId == DEFALT_THEME_ACCENT_ID;
        ThemeAccent accent = themeInfo.getAccent(false);
        File pathToWallpaper = accent != null ? accent.getPathToWallpaper() : null;
        boolean z2 = accent != null && accent.patternMotion;
        OverrideWallpaperInfo overrideWallpaperInfo = themeInfo.overrideWallpaper;
        if (overrideWallpaperInfo != null) {
            f2 = overrideWallpaperInfo.intensity;
        } else if (accent != null) {
            f2 = accent.patternIntensity;
        } else {
            f = themeInfo.patternIntensity;
            return createBackgroundDrawable(themeInfo, overrideWallpaperInfo, sparseIntArray, pathToWallpaper, str, currentColorsNoAccent.get(key_wallpaperFileOffset, -1), (int) f, i, z, false, false, z2, null);
        }
        f = f2 * 100.0f;
        return createBackgroundDrawable(themeInfo, overrideWallpaperInfo, sparseIntArray, pathToWallpaper, str, currentColorsNoAccent.get(key_wallpaperFileOffset, -1), (int) f, i, z, false, false, z2, null);
    }

    public static org.telegram.ui.ActionBar.Theme.BackgroundDrawableSettings createBackgroundDrawable(org.telegram.ui.ActionBar.Theme.ThemeInfo r22, org.telegram.ui.ActionBar.Theme.OverrideWallpaperInfo r23, android.util.SparseIntArray r24, java.io.File r25, java.lang.String r26, int r27, int r28, int r29, boolean r30, boolean r31, boolean r32, boolean r33, org.telegram.tgnet.TLRPC$Document r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.Theme.createBackgroundDrawable(org.telegram.ui.ActionBar.Theme$ThemeInfo, org.telegram.ui.ActionBar.Theme$OverrideWallpaperInfo, android.util.SparseIntArray, java.io.File, java.lang.String, int, int, int, boolean, boolean, boolean, boolean, org.telegram.tgnet.TLRPC$Document):org.telegram.ui.ActionBar.Theme$BackgroundDrawableSettings");
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
        motionBackgroundDrawable.setPatternBitmap(34, SvgHelper.getBitmap(R.raw.default_pattern, i, i2, -16777216));
        motionBackgroundDrawable.setPatternColorFilter(motionBackgroundDrawable.getPatternColor());
        return motionBackgroundDrawable;
    }

    public static Bitmap loadScreenSizedBitmap(FileInputStream fileInputStream, int i) {
        float min;
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
                int min2 = Math.min(point.x, point.y);
                Point point2 = AndroidUtilities.displaySize;
                int max = Math.max(point2.x, point2.y);
                if (min2 >= max && f > f2) {
                    min = Math.max(f / min2, f2 / max);
                } else {
                    min = Math.min(f / min2, f2 / max);
                }
                if (min < 1.2f) {
                    min = 1.0f;
                }
                options.inJustDecodeBounds = false;
                if (min > 1.0f && (f > min2 || f2 > max)) {
                    int i2 = 1;
                    do {
                        i2 *= 2;
                    } while (i2 * 2 < min);
                    options.inSampleSize = i2;
                } else {
                    options.inSampleSize = (int) min;
                }
                fileInputStream.getChannel().position(j);
                Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                if (decodeStream.getWidth() < min2 || decodeStream.getHeight() < max) {
                    float max2 = Math.max(min2 / decodeStream.getWidth(), max / decodeStream.getHeight());
                    if (max2 >= 1.02f) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeStream, (int) (decodeStream.getWidth() * max2), (int) (decodeStream.getHeight() * max2), true);
                        decodeStream.recycle();
                        try {
                            fileInputStream.close();
                        } catch (Exception unused) {
                        }
                        return createScaledBitmap;
                    }
                }
                try {
                    fileInputStream.close();
                } catch (Exception unused2) {
                }
                return decodeStream;
            } catch (Exception e) {
                FileLog.e(e);
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                return null;
            }
        } catch (Throwable th) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (Exception unused4) {
                }
            }
            throw th;
        }
    }

    public static android.graphics.drawable.Drawable getThemedWallpaper(final boolean r10, final android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.Theme.getThemedWallpaper(boolean, android.view.View):android.graphics.drawable.Drawable");
    }

    public static String getSelectedBackgroundSlug() {
        OverrideWallpaperInfo overrideWallpaperInfo = currentTheme.overrideWallpaper;
        if (overrideWallpaperInfo != null) {
            return overrideWallpaperInfo.slug;
        }
        return hasWallpaperFromTheme() ? "t" : "d";
    }

    public static Drawable getCachedWallpaper() {
        Drawable cachedWallpaperNonBlocking = getCachedWallpaperNonBlocking();
        if (cachedWallpaperNonBlocking != null || wallpaperLoadTask == null) {
            return cachedWallpaperNonBlocking;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Utilities.themeQueue.postRunnable(new Theme$$ExternalSyntheticLambda2(countDownLatch));
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
            animatedOutVisualizerDrawables = new HashMap<>();
        }
        animatedOutVisualizerDrawables.put(messageObject, chat_msgAudioVisualizeDrawable);
        chat_msgAudioVisualizeDrawable.setWaveform(false, true, null);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                Theme.lambda$unrefAudioVisualizeDrawable$13(MessageObject.this);
            }
        }, 200L);
        chat_msgAudioVisualizeDrawable = null;
    }

    public static void lambda$unrefAudioVisualizeDrawable$13(MessageObject messageObject) {
        AudioVisualizerDrawable remove = animatedOutVisualizerDrawables.remove(messageObject);
        if (remove != null) {
            remove.setParentView(null);
        }
    }

    public static AudioVisualizerDrawable getAnimatedOutAudioVisualizerDrawable(MessageObject messageObject) {
        HashMap<MessageObject, AudioVisualizerDrawable> hashMap = animatedOutVisualizerDrawables;
        if (hashMap == null || messageObject == null) {
            return null;
        }
        return hashMap.get(messageObject);
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

    public static Map<String, Drawable> getThemeDrawablesMap() {
        return defaultChatDrawables;
    }

    public static Drawable getThemeDrawable(String str) {
        return defaultChatDrawables.get(str);
    }

    public static int getThemeDrawableColorKey(String str) {
        return defaultChatDrawableColorKeys.get(str).intValue();
    }

    public static Map<String, Paint> getThemePaintsMap() {
        return defaultChatPaints;
    }

    public static Paint getThemePaint(String str) {
        if (Objects.equals(str, "paintDivider")) {
            return dividerPaint;
        }
        return defaultChatPaints.get(str);
    }

    public static int getThemePaintColorKey(String str) {
        return defaultChatPaintColors.get(str).intValue();
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
        if (themeInfo != null) {
            if (themeInfo.getKey().equals("Blue") && themeAccent.id == 99) {
                return true;
            }
            if (themeAccent.parentTheme.getKey().equals("Day") && themeAccent.id == 9) {
                return true;
            }
            return (themeAccent.parentTheme.getKey().equals("Night") || themeAccent.parentTheme.getKey().equals("Dark Blue")) && themeAccent.id == 0;
        }
        return false;
    }

    public static void turnOffAutoNight(final BaseFragment baseFragment) {
        String string;
        if (selectedAutoNightType != 0) {
            if (baseFragment != null) {
                try {
                    BulletinFactory of = BulletinFactory.of(baseFragment);
                    int i = R.raw.auto_night_off;
                    if (selectedAutoNightType == 3) {
                        string = LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff);
                    } else {
                        string = LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff);
                    }
                    of.createSimpleBulletin(i, string, LocaleController.getString("Settings", R.string.Settings), 5000, new Runnable() {
                        @Override
                        public final void run() {
                            Theme.lambda$turnOffAutoNight$14(BaseFragment.this);
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

    public static void lambda$turnOffAutoNight$14(BaseFragment baseFragment) {
        baseFragment.presentFragment(new ThemeActivity(1));
    }

    public static void turnOffAutoNight(FrameLayout frameLayout, Runnable runnable) {
        String string;
        if (selectedAutoNightType != 0) {
            if (frameLayout != null && runnable != null) {
                try {
                    BulletinFactory of = BulletinFactory.of(frameLayout, null);
                    int i = R.raw.auto_night_off;
                    if (selectedAutoNightType == 3) {
                        string = LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff);
                    } else {
                        string = LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff);
                    }
                    of.createSimpleBulletin(i, string, LocaleController.getString("Settings", R.string.Settings), 5000, runnable).show();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            selectedAutoNightType = 0;
            saveAutoNightThemeConfig();
            cancelAutoNightThemeCallbacks();
        }
    }
}
