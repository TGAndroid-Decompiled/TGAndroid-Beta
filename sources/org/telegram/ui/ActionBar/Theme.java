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
import android.os.Trace;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Base64;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.StateSet;
import android.view.View;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.os.TraceCompat;
import androidx.emoji2.text.EmojiCompat;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import com.google.android.gms.internal.mlkit_language_id_common.zzit;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.stripe.android.Stripe;
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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import me.vkryl.android.util.ClickHelper$$ExternalSyntheticLambda0;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji$$ExternalSyntheticLambda1;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LiteMode$$ExternalSyntheticLambda0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
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
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.BlurSettingsBottomSheet;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda208;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda271;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda470;
import org.telegram.ui.Components.AudioVisualizerDrawable;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.BackgroundGradientDrawable$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.FragmentContextViewWavesDrawable;
import org.telegram.ui.Components.GradientTools;
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
import org.telegram.ui.Components.voip.VoIPPiPView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LinkEditActivity;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda89;
import org.telegram.ui.Stories.StoriesUtilities;
import org.telegram.ui.ThemePreviewActivity;
import org.telegram.ui.web.MHTML;

public abstract class Theme {
    public static final Paint DEBUG_GREEN_B0;
    public static final Paint DEBUG_GREEN_STROKE;
    public static final Paint DEBUG_RED;
    public static final Paint DEBUG_RED_STROKE;
    public static final Paint PAINT_CLEAR;
    public static final Paint PAINT_FILLING;
    public static Method StateListDrawable_getStateDrawableMethod;
    public static final AnonymousClass11 ambientSensorListener;
    public static HashMap animatedOutVisualizerDrawables;
    public static SparseIntArray animatingColors;
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
    public static BackgroundGradientDrawable$$ExternalSyntheticLambda1 backgroundGradientDisposable;
    public static Bitmap blurredBitmap;
    public static Drawable calllog_msgCallDownGreenDrawable;
    public static Drawable calllog_msgCallDownRedDrawable;
    public static Drawable calllog_msgCallUpGreenDrawable;
    public static Drawable calllog_msgCallUpRedDrawable;
    public static boolean canStartHolidayAnimation;
    public static boolean changingWallpaper;
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
    public static AudioVisualizerDrawable chat_msgAudioVisualizeDrawable;
    public static TextPaint chat_msgBotButtonPaint;
    public static Drawable chat_msgCallDownGreenDrawable;
    public static Drawable chat_msgCallDownRedDrawable;
    public static Drawable chat_msgCallUpGreenDrawable;
    public static MsgClockDrawable chat_msgClockDrawable;
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
    public static Paint chat_radialProgressPausedSeekbarPaint;
    public static Drawable chat_replyIconDrawable;
    public static Paint chat_replyLinePaint;
    public static TextPaint chat_replyNamePaint;
    public static TextPaint chat_replyTextPaint;
    public static LinkEditActivity.AnonymousClass2 chat_roundVideoShadow;
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
    public static final int colorsCount;
    public static SparseIntArray currentColors;
    public static SparseIntArray currentColorsNoAccent;
    public static ThemeInfo currentDayTheme;
    public static ThemeInfo currentNightTheme;
    public static ThemeInfo currentTheme;
    public static final HashMap defaultChatDrawableColorKeys;
    public static final HashMap defaultChatDrawables;
    public static final HashMap defaultChatPaintColors;
    public static final HashMap defaultChatPaints;
    public static final int[] defaultColors;
    public static final ThemeInfo defaultTheme;
    public static Paint dialogs_actionMessagePaint;
    public static RLottieDrawable dialogs_archiveAvatarDrawable;
    public static boolean dialogs_archiveAvatarDrawableRecolored;
    public static RLottieDrawable dialogs_archiveDrawable;
    public static boolean dialogs_archiveDrawableRecolored;
    public static TextPaint dialogs_archiveTextPaint;
    public static TextPaint dialogs_archiveTextPaintSmall;
    public static Drawable dialogs_checkDrawable;
    public static Drawable dialogs_checkReadDrawable;
    public static MsgClockDrawable dialogs_clockDrawable;
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
    public static int dialogs_holidayDrawableOffsetX;
    public static int dialogs_holidayDrawableOffsetY;
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
    public static final SparseIntArray fallbackKeys;
    public static FragmentContextViewWavesDrawable fragmentContextViewWavesDrawable;
    public static boolean hasPreviousTheme;
    public static final ThreadLocal hsvTemp1Local;
    public static final ThreadLocal hsvTemp2Local;
    public static final ThreadLocal hsvTemp3Local;
    public static final ThreadLocal hsvTemp4Local;
    public static final ThreadLocal hsvTemp5Local;
    public static boolean isApplyingAccent;
    public static boolean isCustomTheme;
    public static boolean isInNigthMode;
    public static boolean isPatternWallpaper;
    public static boolean isWallpaperMotion;
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
    public static final int[] keys_avatar_background;
    public static final int[] keys_avatar_background2;
    public static final int[] keys_avatar_nameInMessage;
    public static final int[] keys_colors;
    public static long lastDelayUpdateTime;
    public static WeakReference lastDrawableToBlur;
    public static long lastHolidayCheckTime;
    public static int lastLoadingCurrentThemeTime;
    public static long lastThemeSwitchTime;
    public static Sensor lightSensor;
    public static boolean lightSensorRegistered;
    public static Paint linkSelectionPaint;
    public static int loadingCurrentTheme;
    public static Drawable moveUpDrawable;
    public static final int myMessages2EndIndex;
    public static final int myMessages2StartIndex;
    public static final int[] myMessagesAccentExtraKeys;
    public static final int myMessagesBubblesEndIndex;
    public static final int myMessagesBubblesStartIndex;
    public static final int myMessagesEndIndex;
    public static final int myMessagesStartIndex;
    public static final ArrayList otherThemes;
    public static PathAnimator playPauseAnimator;
    public static int previousPhase;
    public static ThemeInfo previousTheme;
    public static TextPaint profile_aboutTextPaint;
    public static Drawable profile_verifiedCheckDrawable;
    public static Drawable profile_verifiedDrawable;
    public static ChatActivity.AnonymousClass117 roundPlayDrawable;
    public static int selectedAutoNightType;
    public static SensorManager sensorManager;
    public static Bitmap serviceBitmap;
    public static Matrix serviceBitmapMatrix;
    public static BitmapShader serviceBitmapShader;
    public static int serviceMessageColor;
    public static int serviceMessageColorBackup;
    public static int serviceSelectedMessageColor;
    public static int serviceSelectedMessageColorBackup;
    public static boolean shouldDrawGradientIcons;
    public static boolean switchDayRunnableScheduled;
    public static final AnonymousClass1 switchNightBrightnessRunnable;
    public static boolean switchNightRunnableScheduled;
    public static int switchNightThemeDelay;
    public static boolean switchingNightTheme;
    public static final HashSet themeAccentExclusionKeys;
    public static Drawable themedWallpaper;
    public static int themedWallpaperFileOffset;
    public static String themedWallpaperLink;
    public static final ArrayList themes;
    public static final HashMap themesDict;
    public static float[] tmpHSV5;
    public static final int[] viewPos;
    public static Drawable wallpaper;
    public static Theme$$ExternalSyntheticLambda4 wallpaperLoadTask;
    public static final int default_shadow_color = ColorUtils.setAlphaComponent(-16777216, 27);
    public static final Object sync = new Object();
    public static float lastBrightnessValue = 1.0f;
    public static final AnonymousClass1 switchDayBrightnessRunnable = new AnonymousClass1(0);
    public static final int DEFALT_THEME_ACCENT_ID = 99;
    public static final Paint maskPaint = new Paint(1);
    public static final boolean[] loadingRemoteThemes = new boolean[4];
    public static final int[] lastLoadingThemesTime = new int[4];
    public static final long[] remoteThemesHash = new long[4];
    public static final Drawable[] avatarDrawables = new Drawable[25];
    public static final StatusDrawable[] chat_status_drawables = new StatusDrawable[6];
    public static final Drawable[] chat_msgInCallDrawable = new Drawable[2];
    public static final Drawable[] chat_msgInCallSelectedDrawable = new Drawable[2];
    public static final Drawable[] chat_msgOutCallDrawable = new Drawable[2];
    public static final Drawable[] chat_msgOutCallSelectedDrawable = new Drawable[2];
    public static final Drawable[] chat_pollCheckDrawable = new Drawable[2];
    public static final Drawable[] chat_pollCrossDrawable = new Drawable[2];
    public static final Drawable[] chat_pollHintDrawable = new Drawable[2];
    public static final Drawable[] chat_psaHelpDrawable = new Drawable[2];
    public static final Drawable[] chat_locationDrawable = new Drawable[2];
    public static final Drawable[] chat_contactDrawable = new Drawable[2];
    public static final Drawable[][] chat_fileStatesDrawable = (Drawable[][]) Array.newInstance((Class<?>) Drawable.class, 5, 2);
    public static final Path[] chat_filePath = new Path[2];
    public static final Path[] chat_updatePath = new Path[3];

    public final class AnonymousClass13 extends zzms {
        @Override
        public final void onSizeReady(int i, int i2) {
            Point point = AndroidUtilities.displaySize;
            if ((point.x <= point.y) == (i <= i2)) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
            }
        }
    }

    public final class AnonymousClass14 extends zzms {
        @Override
        public final void onSizeReady(int i, int i2) {
            Point point = AndroidUtilities.displaySize;
            if ((point.x <= point.y) == (i <= i2)) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
            }
        }
    }

    public final class AnonymousClass3 extends StateListDrawable {
    }

    public final class AnonymousClass6 extends Drawable {
        public final int $r8$classId = 1;
        public Object paint;
        public final int val$size;
        public final int val$strokeWidth;

        public AnonymousClass6(int i, int i2) {
            this.val$strokeWidth = i;
            this.val$size = i2;
        }

        @Override
        public final void draw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    Rect bounds = getBounds();
                    canvas.drawCircle(bounds.centerX(), bounds.centerY(), this.val$size / 2.0f, (Paint) this.paint);
                    break;
                case 1:
                    Rect bounds2 = getBounds();
                    int iDp = this.val$size;
                    int i = this.val$strokeWidth;
                    if (i != 7) {
                        if (i == 1 || i == 6) {
                            if (iDp <= 0) {
                                iDp = AndroidUtilities.dp(20.0f);
                            }
                        } else if (i == 3) {
                            iDp = Math.max(bounds2.width(), bounds2.height()) / 2;
                        } else {
                            iDp = (int) Math.ceil(Math.sqrt(((bounds2.top - bounds2.centerY()) * (bounds2.top - bounds2.centerY())) + ((bounds2.left - bounds2.centerX()) * (bounds2.left - bounds2.centerX()))));
                        }
                        canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), iDp, Theme.maskPaint);
                    } else {
                        if (((RectF) this.paint) == null) {
                            this.paint = new RectF();
                        }
                        ((RectF) this.paint).set(bounds2);
                        float fDp = iDp <= 0 ? AndroidUtilities.dp(6.0f) : iDp;
                        canvas.drawRoundRect((RectF) this.paint, fDp, fDp, Theme.maskPaint);
                    }
                    break;
                default:
                    ((Drawable) this.paint).draw(canvas);
                    break;
            }
        }

        @Override
        public int getAlpha() {
            switch (this.$r8$classId) {
                case 2:
                    return ((Drawable) this.paint).getAlpha();
                default:
                    return super.getAlpha();
            }
        }

        @Override
        public int getIntrinsicHeight() {
            switch (this.$r8$classId) {
                case 0:
                    return this.val$size + this.val$strokeWidth;
                default:
                    return super.getIntrinsicHeight();
            }
        }

        @Override
        public int getIntrinsicWidth() {
            switch (this.$r8$classId) {
                case 0:
                    return this.val$size + this.val$strokeWidth;
                default:
                    return super.getIntrinsicWidth();
            }
        }

        @Override
        public final int getOpacity() {
            switch (this.$r8$classId) {
                case 0:
                    return -2;
                case 1:
                    return 0;
                default:
                    return ((Drawable) this.paint).getOpacity();
            }
        }

        @Override
        public void onBoundsChange(Rect rect) {
            switch (this.$r8$classId) {
                case 2:
                    super.onBoundsChange(rect);
                    int iWidth = rect.width();
                    int i = this.val$strokeWidth;
                    int i2 = (iWidth - i) / 2;
                    int iHeight = rect.height();
                    int i3 = this.val$size;
                    int i4 = (iHeight - i3) / 2;
                    ((Drawable) this.paint).setBounds(i2, i4, i + i2, i3 + i4);
                    break;
                default:
                    super.onBoundsChange(rect);
                    break;
            }
        }

        @Override
        public final void setAlpha(int i) {
            switch (this.$r8$classId) {
                case 0:
                    ((Paint) this.paint).setAlpha(i);
                    break;
                case 1:
                    break;
                default:
                    ((Drawable) this.paint).setAlpha(i);
                    break;
            }
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
            switch (this.$r8$classId) {
                case 0:
                    ((Paint) this.paint).setColorFilter(colorFilter);
                    break;
            }
        }

        public AnonymousClass6(int i, int i2, int i3) {
            this.val$strokeWidth = i;
            this.val$size = i3;
            Paint paint = new Paint(1);
            this.paint = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(i);
            paint.setColor(i2);
        }

        public AnonymousClass6(int i, int i2, Drawable drawable) {
            this.val$strokeWidth = i;
            this.val$size = i2;
            this.paint = drawable;
        }

        private final void setAlpha$org$telegram$ui$ActionBar$Theme$8(int i) {
        }

        private final void setColorFilter$org$telegram$ui$ActionBar$Theme$8(ColorFilter colorFilter) {
        }

        private final void setColorFilter$org$telegram$ui$Components$blur3$utils$Blur3Utils$1(ColorFilter colorFilter) {
        }
    }

    public final class AnonymousClass7 extends Drawable {
        public final RectF rect = new RectF();
        public final Paint val$backgroundPaint;
        public final View val$containerView;
        public final int val$rad;
        public final View val$view;

        public AnonymousClass7(View view, View view2, int i, Paint paint) {
            this.val$view = view;
            this.val$containerView = view2;
            this.val$rad = i;
            this.val$backgroundPaint = paint;
        }

        @Override
        public final void draw(Canvas canvas) {
            Rect bounds = getBounds();
            RectF rectF = this.rect;
            rectF.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
            Theme.applyServiceShaderMatrixForView(this.val$view, this.val$containerView, null);
            int i = this.val$rad;
            float f = i;
            Paint themePaint = this.val$backgroundPaint;
            if (themePaint == null) {
                themePaint = Theme.getThemePaint("paintChatActionBackground");
            }
            canvas.drawRoundRect(rectF, f, f, themePaint);
            if (Theme.hasGradientService()) {
                float f2 = i;
                canvas.drawRoundRect(rectF, f2, f2, Theme.getThemePaint("paintChatActionBackgroundDarken"));
            }
        }

        @Override
        public final int getOpacity() {
            return -2;
        }

        @Override
        public final void setAlpha(int i) {
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public abstract class AdaptiveRipple {
        public static final int defaultBackgroundColorKey = Theme.key_windowBackgroundWhite;
        public static float[] tempHSV;

        public final class CircleDrawable extends Drawable {
            public static Paint maskPaint;
            public final Paint paint;
            public final float radius = -1.0f;

            public CircleDrawable() {
                if (maskPaint == null) {
                    Paint paint = new Paint(1);
                    maskPaint = paint;
                    paint.setColor(-1);
                }
                this.paint = maskPaint;
            }

            @Override
            public final void draw(Canvas canvas) {
                int iDp;
                Rect bounds = getBounds();
                float f = this.radius;
                if (Math.abs(f - (-1.0f)) < 0.01f) {
                    iDp = Math.max(bounds.width(), bounds.height()) / 2;
                } else if (Math.abs(f - (-2.0f)) < 0.01f) {
                    iDp = (int) Math.ceil(Math.sqrt(((bounds.top - bounds.centerY()) * (bounds.top - bounds.centerY())) + ((bounds.left - bounds.centerX()) * (bounds.left - bounds.centerX()))));
                } else {
                    iDp = AndroidUtilities.dp(f);
                }
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), iDp, this.paint);
            }

            @Override
            public final int getOpacity() {
                return -2;
            }

            @Override
            public final void setAlpha(int i) {
            }

            @Override
            public final void setColorFilter(ColorFilter colorFilter) {
            }
        }

        public static float[] calcRadii(float... fArr) {
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
            return fArr.length < 8 ? new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[3]), AndroidUtilities.dp(fArr[3])} : new float[]{AndroidUtilities.dp(fArr[0]), AndroidUtilities.dp(fArr[1]), AndroidUtilities.dp(fArr[2]), AndroidUtilities.dp(fArr[3]), AndroidUtilities.dp(fArr[4]), AndroidUtilities.dp(fArr[5]), AndroidUtilities.dp(fArr[6]), AndroidUtilities.dp(fArr[7])};
        }

        public static int calcRippleColor(int i) {
            if (tempHSV == null) {
                tempHSV = new float[3];
            }
            Color.colorToHSV(i, tempHSV);
            float[] fArr = tempHSV;
            float f = fArr[1];
            if (f > 0.01f) {
                fArr[1] = Math.min(1.0f, Math.max(0.0f, f + (Theme.currentTheme.isDark() ? 0.25f : -0.25f)));
                float[] fArr2 = tempHSV;
                fArr2[2] = Math.min(1.0f, Math.max(0.0f, fArr2[2] + (Theme.currentTheme.isDark() ? 0.05f : -0.05f)));
            } else {
                fArr[2] = Math.min(1.0f, Math.max(0.0f, fArr[2] + (Theme.currentTheme.isDark() ? 0.1f : -0.1f)));
            }
            return Color.HSVToColor(127, tempHSV);
        }

        public static BaseCell.RippleDrawableSafe createRect(float[] fArr, int i, int i2) {
            Drawable colorDrawable;
            ShapeDrawable shapeDrawable;
            if (i != 0) {
                int i3 = 0;
                while (true) {
                    if (i3 >= Math.min(8, fArr.length)) {
                        colorDrawable = new ColorDrawable(i);
                        break;
                    }
                    if (fArr[i3] > 0.0f) {
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(calcRadii(fArr), null, null));
                        shapeDrawable2.getPaint().setColor(i);
                        colorDrawable = shapeDrawable2;
                        break;
                    }
                    i3++;
                }
            } else {
                colorDrawable = null;
            }
            for (int i4 = 0; i4 < Math.min(8, fArr.length); i4++) {
                if (fArr[i4] > 0.0f) {
                    shapeDrawable = new ShapeDrawable(new RoundRectShape(calcRadii(fArr), null, null));
                    shapeDrawable.getPaint().setColor(-1);
                    return new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i2}), colorDrawable, shapeDrawable);
                }
            }
            shapeDrawable = new ShapeDrawable(new RectShape());
            shapeDrawable.getPaint().setColor(-1);
            return new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i2}), colorDrawable, shapeDrawable);
        }

        public static BaseCell.RippleDrawableSafe filledRectByKey(float[] fArr, int i) {
            int color = Theme.getColor(null, i, false);
            return createRect(fArr, color, calcRippleColor(color));
        }
    }

    public interface Colorable {
        void updateColors$1();
    }

    public enum IvButtonColors {
        DEFAULT(Theme.key_chat_msgIvButtonDefaultIn, Theme.key_chat_msgIvButtonDefaultInPressed, Theme.key_chat_msgIvButtonDefaultInText, Theme.key_chat_msgIvButtonDefaultOut, Theme.key_chat_msgIvButtonDefaultOutPressed, Theme.key_chat_msgIvButtonDefaultOutText),
        PRIMARY(Theme.key_chat_msgIvButtonPrimaryIn, Theme.key_chat_msgIvButtonPrimaryInPressed, Theme.key_chat_msgIvButtonPrimaryInText, Theme.key_chat_msgIvButtonPrimaryOut, Theme.key_chat_msgIvButtonPrimaryOutPressed, Theme.key_chat_msgIvButtonPrimaryOutText),
        DANGER(Theme.key_chat_msgIvButtonDangerIn, Theme.key_chat_msgIvButtonDangerInPressed, Theme.key_chat_msgIvButtonDangerInText, Theme.key_chat_msgIvButtonDangerOut, Theme.key_chat_msgIvButtonDangerOutPressed, Theme.key_chat_msgIvButtonDangerOutText),
        SUCCESS(Theme.key_chat_msgIvButtonSuccessIn, Theme.key_chat_msgIvButtonSuccessInPressed, Theme.key_chat_msgIvButtonSuccessInText, Theme.key_chat_msgIvButtonSuccessOut, Theme.key_chat_msgIvButtonSuccessOutPressed, Theme.key_chat_msgIvButtonSuccessOutText),
        DEFAULT_IN_TEXT(Theme.key_chat_msgIvButtonDefaultInlineIn, Theme.key_chat_msgIvButtonDefaultInlineInPressed, Theme.key_chat_msgIvButtonDefaultInlineInText, Theme.key_chat_msgIvButtonDefaultInlineOut, Theme.key_chat_msgIvButtonDefaultInlineOutPressed, Theme.key_chat_msgIvButtonDefaultInlineOutText);

        public final int backgroundIn;
        public final int backgroundInPressed;
        public final int backgroundOut;
        public final int backgroundOutPressed;
        public final int textIn;
        public final int textOut;

        IvButtonColors(int i, int i2, int i3, int i4, int i5, int i6) {
            this.backgroundIn = i;
            this.backgroundInPressed = i2;
            this.textIn = i3;
            this.backgroundOut = i4;
            this.backgroundOutPressed = i5;
            this.textOut = i6;
        }
    }

    public final class OverrideWallpaperInfo {
        public long accessHash;
        public int color;
        public long dialogId;
        public boolean forBoth;
        public int gradientColor1;
        public int gradientColor2;
        public int gradientColor3;
        public float intensity;
        public boolean isBlurred;
        public boolean isMotion;
        public ThemeAccent parentAccent;
        public ThemeInfo parentTheme;
        public TLRPC.WallPaper prevUserWallpaper;
        public ArrayList requestIds;
        public int rotation;
        public float uploadingProgress;
        public long wallpaperId;
        public String fileName = "";
        public String originalFileName = "";
        public String slug = "";

        public static void access$1300(OverrideWallpaperInfo overrideWallpaperInfo) {
            String strM;
            if (overrideWallpaperInfo.parentAccent != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(overrideWallpaperInfo.parentTheme.name);
                sb.append("_");
                strM = SurfaceContainer$$ExternalSyntheticOutline0.m(overrideWallpaperInfo.parentAccent.id, "_owp", sb);
            } else {
                strM = MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(), overrideWallpaperInfo.parentTheme.name, "_owp");
            }
            ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit().remove(strM).commit();
            new File(ApplicationLoader.getFilesDirFixed(), overrideWallpaperInfo.fileName).delete();
            new File(ApplicationLoader.getFilesDirFixed(), overrideWallpaperInfo.originalFileName).delete();
        }

        public final void save() {
            String str;
            try {
                if (this.parentAccent != null) {
                    str = this.parentTheme.name + "_" + this.parentAccent.id + "_owp";
                } else {
                    str = this.parentTheme.name + "_owp";
                }
                SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("wall", this.fileName);
                jSONObject.put("owall", this.originalFileName);
                jSONObject.put("pColor", this.color);
                jSONObject.put("pGrColor", this.gradientColor1);
                jSONObject.put("pGrColor2", this.gradientColor2);
                jSONObject.put("pGrColor3", this.gradientColor3);
                jSONObject.put("pGrAngle", this.rotation);
                String str2 = this.slug;
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject.put("wallSlug", str2);
                jSONObject.put("wBlur", this.isBlurred);
                jSONObject.put("wMotion", this.isMotion);
                jSONObject.put("pIntensity", this.intensity);
                editorEdit.putString(str, jSONObject.toString());
                editorEdit.commit();
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
    }

    public final class PatternsLoader implements NotificationCenter.NotificationCenterDelegate {
        public static PatternsLoader loader;
        public final int account = UserConfig.selectedAccount;
        public HashMap watingForLoad;

        public final class LoadingPattern {
            public final ArrayList accents = new ArrayList();
            public TLRPC.TL_wallPaper pattern;
        }

        public PatternsLoader(ArrayList arrayList) {
            if (arrayList == null) {
                return;
            }
            Utilities.globalQueue.postRunnable(new ClickHelper$$ExternalSyntheticLambda0(27, this, arrayList));
        }

        public static void createLoader(boolean z) {
            String str;
            ArrayList arrayList;
            if (loader == null || z) {
                ArrayList arrayList2 = null;
                int i = 0;
                while (i < 5) {
                    if (i == 0) {
                        str = "Blue";
                    } else if (i == 1) {
                        str = "Dark Blue";
                    } else if (i != 2) {
                        str = i != 3 ? "Night" : "Day";
                    } else {
                        str = "Arctic Blue";
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
                    i++;
                }
                loader = new PatternsLoader(arrayList2);
            }
        }

        public static Bitmap createWallpaperForAccent(Bitmap bitmap, boolean z, File file, ThemeAccent themeAccent) {
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
                                bitmapLoadScreenSizedBitmap = SvgHelper.getBitmap(file, iMin, iMax, false, SvgHelper.ScaleMode.ByWidth);
                            } else {
                                bitmapLoadScreenSizedBitmap = Theme.loadScreenSizedBitmap(new FileInputStream(file), 0);
                            }
                            bitmap2 = bitmapLoadScreenSizedBitmap;
                        } else {
                            bitmap2 = bitmap;
                        }
                        if (backgroundGradientDrawable != null) {
                            FileOutputStream fileOutputStream = new FileOutputStream(pathToWallpaper);
                            bitmap2.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream);
                            fileOutputStream.close();
                            return bitmap2;
                        }
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
                    patternColor = MotionBackgroundDrawable.getPatternColor(iChangeColorAccent, iChangeColorAccent2, iChangeColorAccent3, iChangeColorAccent4);
                    if (backgroundGradientDrawable != null) {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(pathToWallpaper);
                        bitmap2.compress(Bitmap.CompressFormat.PNG, 87, fileOutputStream2);
                        fileOutputStream2.close();
                        return bitmap2;
                    }
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
                        bitmapLoadScreenSizedBitmap = SvgHelper.getBitmap(file, iMin, iMax, false, SvgHelper.ScaleMode.ByWidth);
                    } else {
                        bitmapLoadScreenSizedBitmap = Theme.loadScreenSizedBitmap(new FileInputStream(file), 0);
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
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            HashMap map = this.watingForLoad;
            if (map == null) {
                return;
            }
            boolean z = false;
            if (i == NotificationCenter.fileLoaded) {
                LoadingPattern loadingPattern = (LoadingPattern) map.remove((String) objArr[0]);
                if (loadingPattern != null) {
                    Utilities.globalQueue.postRunnable(new ClickHelper$$ExternalSyntheticLambda0(28, this, loadingPattern));
                    return;
                }
                return;
            }
            if (i != NotificationCenter.fileLoadFailed || map.remove((String) objArr[0]) == null) {
                return;
            }
            AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda89(this, (Object) null, z, 5));
        }
    }

    public interface ResourcesProvider {
        void applyServiceShaderMatrix(float f, float f2, int i, int i2);

        ColorFilter getAnimatedEmojiColorFilter();

        int getColor(int i);

        int getColorOrDefault(int i);

        int getCurrentColor(int i);

        Drawable getDrawable(String str);

        Paint getPaint(String str);

        boolean hasGradientService();

        boolean isDark();

        void setAnimatedColor(int i, int i2);
    }

    public final class ThemeAccent {
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
        public final float[] tempHSV = new float[3];

        public static int averageColor(SparseIntArray sparseIntArray, int... iArr) {
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

        public static void resetAccentColorsForMyMessagesGiftThemeLight(SparseIntArray sparseIntArray) {
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

        public final int bubbleSelectedOverlay(int i, int i2) {
            float[] fArr = this.tempHSV;
            Color.colorToHSV(i2, fArr);
            float f = fArr[0];
            Color.colorToHSV(i, fArr);
            float f2 = fArr[1];
            if (f2 <= 0.0f) {
                fArr[0] = f;
            }
            fArr[1] = Math.max(0.0f, Math.min(1.0f, f2 + 0.6f));
            fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.05f));
            return Color.HSVToColor(30, fArr);
        }

        public final boolean fillAccentColors(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
            int iValueAt;
            char c;
            char c2;
            float f;
            boolean zAccess$800;
            boolean z;
            int iValueAt2;
            int iValueAt3;
            float f2;
            float f3;
            int i;
            boolean zAccess$801;
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
                int i7 = 0;
                while (true) {
                    int[] iArr = Theme.defaultColors;
                    if (i7 >= iArr.length) {
                        break;
                    }
                    if (!Theme.themeAccentExclusionKeys.contains(Integer.valueOf(i7))) {
                        int iIndexOfKey = sparseIntArray.indexOfKey(i7);
                        if (iIndexOfKey < 0) {
                            int i8 = Theme.fallbackKeys.get(i7, -1);
                            if (i8 < 0 || sparseIntArray.indexOfKey(i8) < 0) {
                                iValueAt = iArr[i7];
                            }
                        } else {
                            iValueAt = sparseIntArray.valueAt(iIndexOfKey);
                        }
                        int iChangeColorAccent = Theme.changeColorAccent(tempHsv, tempHsv2, iValueAt, zIsDark, iValueAt);
                        if (iChangeColorAccent != iValueAt) {
                            sparseIntArray2.put(i7, iChangeColorAccent);
                        }
                    }
                    i7++;
                }
            }
            int iHSVToColor = this.myMessagesAccentColor;
            if ((iHSVToColor == 0 && this.accentColor == 0) || this.myMessagesGradientAccentColor1 == 0) {
                c = 1;
                c2 = 2;
                f = 0.705f;
                z = false;
            } else {
                if (iHSVToColor == 0) {
                    iHSVToColor = this.accentColor;
                }
                int i9 = Theme.key_chat_outBubble;
                int i10 = sparseIntArray.get(i9);
                if (i10 == 0) {
                    i10 = Theme.defaultColors[i9];
                }
                int colorDistance = AndroidUtilities.getColorDistance(iHSVToColor, Theme.changeColorAccent(tempHsv, tempHsv2, i10, zIsDark, i10));
                c = 1;
                int colorDistance2 = AndroidUtilities.getColorDistance(iHSVToColor, this.myMessagesGradientAccentColor1);
                c2 = 2;
                if (this.myMessagesGradientAccentColor2 != 0) {
                    f = 0.705f;
                    int averageColor = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(this.myMessagesAccentColor, this.myMessagesGradientAccentColor1), this.myMessagesGradientAccentColor2);
                    int i11 = this.myMessagesGradientAccentColor3;
                    if (i11 != 0) {
                        averageColor = AndroidUtilities.getAverageColor(averageColor, i11);
                    }
                    zAccess$800 = AndroidUtilities.computePerceivedBrightness(averageColor) > 0.705f;
                } else {
                    f = 0.705f;
                    zAccess$800 = Theme.access$800(this.myMessagesAccentColor, this.myMessagesGradientAccentColor1);
                }
                z = zAccess$800 && colorDistance <= 35000 && colorDistance2 <= 35000;
                float[] tempHsv3 = Theme.getTempHsv(3);
                float[] tempHsv4 = Theme.getTempHsv(4);
                Color.colorToHSV(i10, tempHsv3);
                Color.colorToHSV(iHSVToColor, tempHsv4);
                float fMin = Math.min((tempHsv3[1] * 1.5f) / tempHsv[1], 1.0f);
                tempHsv3[0] = (tempHsv4[0] - tempHsv3[0]) + tempHsv[0];
                tempHsv3[1] = (tempHsv4[1] * tempHsv[1]) / tempHsv3[1];
                float f4 = ((((tempHsv4[2] / tempHsv3[2]) + fMin) - 1.0f) * tempHsv[2]) / fMin;
                tempHsv3[2] = f4;
                if (f4 >= 0.3f) {
                    iHSVToColor = Color.HSVToColor(255, tempHsv3);
                }
            }
            boolean z2 = (iHSVToColor == 0 || (((i5 = this.parentTheme.accentBaseColor) == 0 || iHSVToColor == i5) && ((i6 = this.accentColor) == 0 || i6 == iHSVToColor))) ? false : true;
            if (z2 || this.accentColor2 != 0) {
                int i12 = this.accentColor2;
                if (i12 != 0) {
                    Color.colorToHSV(i12, tempHsv2);
                } else {
                    Color.colorToHSV(iHSVToColor, tempHsv2);
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
                if (z2) {
                    Color.colorToHSV(iHSVToColor, tempHsv2);
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
            }
            if (!z && (i = this.myMessagesGradientAccentColor1) != 0) {
                if (this.myMessagesGradientAccentColor2 != 0) {
                    int averageColor2 = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(this.myMessagesAccentColor, i), this.myMessagesGradientAccentColor2);
                    int i18 = this.myMessagesGradientAccentColor3;
                    if (i18 != 0) {
                        averageColor2 = AndroidUtilities.getAverageColor(averageColor2, i18);
                    }
                    zAccess$801 = AndroidUtilities.computePerceivedBrightness(averageColor2) > f;
                } else {
                    zAccess$801 = Theme.access$800(this.myMessagesAccentColor, i);
                }
                if (zAccess$801) {
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
                color = Theme.getColor(null, i28, false);
            }
            int i29 = Theme.key_chat_inBubble;
            int color2 = sparseIntArray2.get(i29);
            if (color2 == 0) {
                color2 = Theme.getColor(null, i29, false);
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
            float[] fArr = this.tempHSV;
            if (!zIsDark) {
                sparseIntArray2.put(Theme.key_chat_inTextSelectionHighlight, textSelectionBackground(color2, this.accentColor));
                sparseIntArray2.put(Theme.key_chat_outTextSelectionHighlight, textSelectionBackground(color, this.accentColor));
                int i30 = Theme.key_chat_outTextSelectionCursor;
                Color.colorToHSV(this.accentColor, fArr);
                float f5 = fArr[0];
                Color.colorToHSV(color, fArr);
                float f6 = fArr[c];
                if (f6 > 0.0f) {
                    float f7 = fArr[0];
                    if (f7 > 45.0f && f7 < 85.0f) {
                        fArr[0] = f5;
                    }
                } else {
                    fArr[0] = f5;
                }
                fArr[c] = Math.max(0.0f, Math.min(1.0f, f6 + 0.6f));
                float f8 = fArr[c2];
                fArr[c2] = Math.max(0.0f, Math.min(1.0f, f8 - (f8 > 0.7f ? 0.25f : 0.125f)));
                sparseIntArray2.put(i30, Theme.blendOver(color, Color.HSVToColor(255, fArr)));
            }
            Color.colorToHSV(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText, false), fArr);
            float f9 = fArr[0];
            sparseIntArray2.put(Theme.key_chat_outBubbleLocationPlaceholder, locationPlaceholderColor(color, f9, zIsDark));
            sparseIntArray2.put(Theme.key_chat_inBubbleLocationPlaceholder, locationPlaceholderColor(color2, f9, zIsDark));
            int i31 = Theme.key_chat_messageLinkIn;
            int color3 = sparseIntArray2.get(i31);
            if (color3 == 0) {
                color3 = Theme.getColor(null, i31, false);
            }
            int i32 = Theme.key_chat_messageLinkOut;
            int color4 = sparseIntArray2.get(i32);
            if (color4 == 0) {
                color4 = Theme.getColor(null, i32, false);
            }
            sparseIntArray2.put(Theme.key_chat_linkSelectBackground, linkSelectionBackground(color3, color2, zIsDark));
            sparseIntArray2.put(Theme.key_chat_outLinkSelectBackground, linkSelectionBackground(color4, color, zIsDark));
            int i33 = Theme.key_actionBarDefaultSubmenuBackground;
            int color5 = sparseIntArray2.get(i33);
            if (color5 == 0) {
                color5 = Theme.getColor(null, i33, false);
            }
            sparseIntArray2.put(Theme.key_actionBarDefaultSubmenuSeparator, Color.argb(Color.alpha(color5), Math.max(0, Color.red(color5) - 10), Math.max(0, Color.green(color5) - 10), Math.max(0, Color.blue(color5) - 10)));
            int i34 = 64;
            if (zIsDark) {
                int i35 = Theme.key_chat_outBubbleGradient1;
                if (sparseIntArray2.get(i35) != 0) {
                    Color.colorToHSV(averageColor(sparseIntArray2, i35, Theme.key_chat_outBubbleGradient2, Theme.key_chat_outBubbleGradient3), fArr);
                    fArr[c] = Utilities.clamp(fArr[c] + 0.1f, 1.0f, 0.0f);
                    fArr[c2] = Utilities.clamp(fArr[c2] - 0.8f, 1.0f, 0.0f);
                    sparseIntArray2.put(Theme.key_chat_outCodeBackground, Color.HSVToColor(64, fArr));
                } else {
                    int i36 = Theme.key_chat_outCodeBackground;
                    Color.colorToHSV(color, fArr);
                    if (zIsDark) {
                        fArr[c] = Utilities.clamp(fArr[c] - 0.08f, 1.0f, 0.0f);
                        fArr[c2] = 0.03f;
                    } else {
                        f2 = fArr[c];
                        if (f2 > 0.0f) {
                            f3 = fArr[c2];
                            if (f3 < 1.0f || f3 <= 0.0f) {
                                fArr[c2] = Math.max(0.0f, Math.min(1.0f, fArr[c2] - 0.2f));
                            } else {
                                fArr[c] = Math.max(0.0f, Math.min(1.0f, f2 + 0.28f));
                                fArr[c2] = Math.max(0.0f, Math.min(1.0f, fArr[c2] - 0.1f));
                            }
                        } else {
                            fArr[c2] = Math.max(0.0f, Math.min(1.0f, fArr[c2] - 0.2f));
                        }
                        i34 = 32;
                    }
                    sparseIntArray2.put(i36, Color.HSVToColor(i34, fArr));
                }
            } else {
                int i37 = Theme.key_chat_outCodeBackground;
                Color.colorToHSV(color, fArr);
                if (zIsDark) {
                    fArr[c] = Utilities.clamp(fArr[c] - 0.08f, 1.0f, 0.0f);
                    fArr[c2] = 0.03f;
                } else {
                    f2 = fArr[c];
                    if (f2 > 0.0f) {
                        f3 = fArr[c2];
                        if (f3 < 1.0f) {
                            fArr[c2] = Math.max(0.0f, Math.min(1.0f, fArr[c2] - 0.2f));
                        } else {
                            fArr[c2] = Math.max(0.0f, Math.min(1.0f, fArr[c2] - 0.2f));
                        }
                    } else {
                        fArr[c2] = Math.max(0.0f, Math.min(1.0f, fArr[c2] - 0.2f));
                    }
                    i34 = 32;
                }
                sparseIntArray2.put(i37, Color.HSVToColor(i34, fArr));
            }
            Theme.applyCalculatedTableColors(sparseIntArray, sparseIntArray2, zIsDark);
            Theme.applyCalculatedArticleCodeColors(sparseIntArray, sparseIntArray2, zIsDark);
            return !z;
        }

        public final File getPathToWallpaper() {
            if (this.id < 100) {
                if (TextUtils.isEmpty(this.patternSlug)) {
                    return null;
                }
                File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                Locale locale = Locale.US;
                return new File(filesDirFixed, this.parentTheme.getKey() + "_" + this.id + "_" + this.patternSlug + "_v5.jpg");
            }
            if (TextUtils.isEmpty(this.patternSlug)) {
                return null;
            }
            File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
            Locale locale2 = Locale.US;
            return new File(filesDirFixed2, this.parentTheme.getKey() + "_" + this.id + "_" + this.patternSlug + "_v8_debug.jpg");
        }

        public final int linkSelectionBackground(int i, int i2, boolean z) {
            int iBlendARGB = ColorUtils.blendARGB(0.25f, i, i2);
            float[] fArr = this.tempHSV;
            Color.colorToHSV(iBlendARGB, fArr);
            fArr[1] = Math.max(0.0f, Math.min(1.0f, fArr[1] - 0.1f));
            fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] + (z ? 0.1f : 0.0f)));
            return Color.HSVToColor(51, fArr);
        }

        public final int locationPlaceholderColor(int i, float f, boolean z) {
            if (z) {
                return 520093695;
            }
            float[] fArr = this.tempHSV;
            Color.colorToHSV(i, fArr);
            if (fArr[1] > 0.0f) {
                float f2 = fArr[2];
                if (f2 >= 1.0f || f2 <= 0.0f) {
                    fArr[0] = f;
                    fArr[1] = 0.2f;
                } else {
                    fArr[0] = MathUtils.clamp(fArr[0] + 0.22f, 0.0f, 1.0f);
                    fArr[1] = MathUtils.clamp(fArr[1] - 0.35f, 0.0f, 1.0f);
                }
            } else {
                fArr[0] = f;
                fArr[1] = 0.2f;
            }
            fArr[2] = MathUtils.clamp(fArr[2] - 0.65f, 0.0f, 1.0f);
            return Color.HSVToColor(90, fArr);
        }

        public final int textSelectionBackground(int i, int i2) {
            float[] fArr = this.tempHSV;
            Color.colorToHSV(i2, fArr);
            float f = fArr[0];
            Color.colorToHSV(i, fArr);
            float f2 = fArr[1];
            if (f2 > 0.0f) {
                float f3 = fArr[0];
                if (f3 > 45.0f && f3 < 85.0f) {
                    fArr[0] = f;
                }
            } else {
                fArr[0] = f;
            }
            fArr[1] = Math.max(0.0f, Math.min(1.0f, f2 + (fArr[2] > 0.85f ? 0.25f : 0.45f)));
            fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.15f));
            return Color.HSVToColor(80, fArr);
        }
    }

    static {
        ThemeInfo themeInfo;
        ThemeInfo themeInfo2;
        SharedPreferences.Editor editor;
        ArrayList arrayList;
        boolean z;
        ArrayList arrayList2;
        SparseArray sparseArray;
        ThemeAccent accent;
        int i;
        int i2 = 3;
        switchNightBrightnessRunnable = new AnonymousClass1(i2);
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
        int i3 = colorsCount;
        key_wallpaperFileOffset = i3;
        key_dialogBackground = i3 + 1;
        key_dialogBackgroundGray = i3 + 2;
        key_dialogTextBlack = i3 + 3;
        key_dialogTextLink = i3 + 4;
        key_dialogLinkSelection = i3 + 5;
        key_dialogTextBlue = i3 + 6;
        key_dialogTextBlue2 = i3 + 7;
        key_dialogTextBlue4 = i3 + 8;
        key_dialogTextGray = i3 + 9;
        key_dialogTextGray2 = i3 + 10;
        key_dialogTextGray3 = i3 + 11;
        key_dialogTextGray4 = i3 + 12;
        key_dialogTextHint = i3 + 13;
        key_dialogInputField = i3 + 14;
        key_dialogInputFieldActivated = i3 + 15;
        key_dialogCheckboxSquareBackground = i3 + 16;
        key_dialogCheckboxSquareCheck = i3 + 17;
        key_dialogCheckboxSquareUnchecked = i3 + 18;
        key_dialogCheckboxSquareDisabled = i3 + 19;
        key_dialogScrollGlow = i3 + 20;
        key_dialogRoundCheckBox = i3 + 21;
        key_dialogRoundCheckBoxCheck = i3 + 22;
        key_dialogRadioBackground = i3 + 23;
        key_dialogRadioBackgroundChecked = i3 + 24;
        key_dialogLineProgress = i3 + 25;
        key_dialogLineProgressBackground = i3 + 26;
        key_dialogButton = i3 + 27;
        key_dialogButtonSelector = i3 + 28;
        key_dialogIcon = i3 + 29;
        key_dialogGrayLine = i3 + 30;
        key_dialogTopBackground = i3 + 31;
        key_dialog_inlineProgressBackground = i3 + 32;
        key_dialog_inlineProgress = i3 + 33;
        key_dialogSearchBackground = i3 + 34;
        key_dialogSearchHint = i3 + 35;
        key_dialogSearchIcon = i3 + 36;
        key_dialogSearchText = i3 + 37;
        key_dialogFloatingButton = i3 + 38;
        key_dialogFloatingButtonPressed = i3 + 39;
        key_dialogFloatingIcon = i3 + 40;
        key_dialogShadowLine = i3 + 41;
        key_dialogEmptyImage = i3 + 42;
        key_dialogEmptyText = i3 + 43;
        key_dialogSwipeRemove = i3 + 44;
        key_dialogReactionMentionBackground = i3 + 45;
        key_dialogCardShadow = i3 + 46;
        key_dialogGiftsBackground = i3 + 47;
        colorsCount = i3 + 49;
        key_dialogGiftsTabText = i3 + 48;
        int i4 = colorsCount;
        key_windowBackgroundWhite = i4;
        key_windowBackgroundUnchecked = i4 + 1;
        key_windowBackgroundChecked = i4 + 2;
        key_windowBackgroundCheckText = i4 + 3;
        key_progressCircle = i4 + 4;
        key_listSelector = i4 + 5;
        key_settings_listSelector = i4 + 6;
        key_windowBackgroundWhiteInputField = i4 + 7;
        key_windowBackgroundWhiteInputFieldActivated = i4 + 8;
        key_windowBackgroundWhiteGrayIcon = i4 + 9;
        key_windowBackgroundWhiteBlueText = i4 + 10;
        key_windowBackgroundWhiteBlueText2 = i4 + 11;
        key_windowBackgroundWhiteBlueText3 = i4 + 12;
        key_windowBackgroundWhiteBlueText4 = i4 + 13;
        key_windowBackgroundWhiteBlueText5 = i4 + 14;
        key_windowBackgroundWhiteBlueText6 = i4 + 15;
        key_windowBackgroundWhiteBlueText7 = i4 + 16;
        key_windowBackgroundWhiteBlueButton = i4 + 17;
        key_windowBackgroundWhiteBlueIcon = i4 + 18;
        key_windowBackgroundWhiteGreenText = i4 + 19;
        key_windowBackgroundWhiteGreenText2 = i4 + 20;
        key_windowBackgroundWhiteGrayText = i4 + 21;
        key_windowBackgroundWhiteGrayText2 = i4 + 22;
        key_windowBackgroundWhiteGrayText3 = i4 + 23;
        key_windowBackgroundWhiteGrayText4 = i4 + 24;
        key_windowBackgroundWhiteGrayText5 = i4 + 25;
        key_windowBackgroundWhiteGrayText6 = i4 + 26;
        key_windowBackgroundWhiteGrayText7 = i4 + 27;
        key_windowBackgroundWhiteGrayText8 = i4 + 28;
        key_windowBackgroundWhiteBlackText = i4 + 29;
        key_windowBackgroundWhiteHintText = i4 + 30;
        key_windowBackgroundWhiteValueText = i4 + 31;
        key_windowBackgroundWhiteLinkText = i4 + 32;
        key_windowBackgroundWhiteLinkSelection = i4 + 33;
        key_windowBackgroundWhiteBlueHeader = i4 + 34;
        key_switchTrack = i4 + 35;
        key_switchTrackChecked = i4 + 36;
        key_switchTrackBlue = i4 + 37;
        key_switchTrackBlueChecked = i4 + 38;
        key_switchTrackBlueThumb = i4 + 39;
        key_switchTrackBlueThumbChecked = i4 + 40;
        key_switchTrackBlueSelector = i4 + 41;
        key_switchTrackBlueSelectorChecked = i4 + 42;
        key_switch2Track = i4 + 43;
        key_switch2TrackChecked = i4 + 44;
        key_checkboxSquareBackground = i4 + 45;
        key_checkboxSquareCheck = i4 + 46;
        key_checkboxSquareUnchecked = i4 + 47;
        colorsCount = i4 + 49;
        key_checkboxSquareDisabled = i4 + 48;
        int i5 = colorsCount;
        key_windowBackgroundGray = i5;
        key_windowBackgroundGrayShadow = i5 + 1;
        key_emptyListPlaceholder = i5 + 2;
        key_divider = i5 + 3;
        key_graySection = i5 + 4;
        key_graySectionText = i5 + 5;
        key_radioBackground = i5 + 6;
        key_radioBackgroundChecked = i5 + 7;
        key_checkbox = i5 + 8;
        key_checkboxDisabled = i5 + 9;
        key_checkboxCheck = i5 + 10;
        key_fastScrollActive = i5 + 11;
        key_fastScrollInactive = i5 + 12;
        key_fastScrollText = i5 + 13;
        key_pollCreateIcons = i5 + 14;
        key_text_RedRegular = i5 + 15;
        key_text_RedBold = i5 + 16;
        key_fill_RedNormal = i5 + 17;
        key_fill_RedDark = i5 + 18;
        key_inappPlayerPerformer = i5 + 19;
        key_inappPlayerTitle = i5 + 20;
        key_inappPlayerBackground = i5 + 21;
        key_inappPlayerPlayPause = i5 + 22;
        key_inappPlayerClose = i5 + 23;
        key_returnToCallBackground = i5 + 24;
        key_returnToCallMutedBackground = i5 + 25;
        key_returnToCallText = i5 + 26;
        key_contextProgressInner1 = i5 + 27;
        key_contextProgressOuter1 = i5 + 28;
        key_contextProgressInner2 = i5 + 29;
        key_contextProgressOuter2 = i5 + 30;
        key_contextProgressInner3 = i5 + 31;
        key_contextProgressOuter3 = i5 + 32;
        key_contextProgressInner4 = i5 + 33;
        key_contextProgressOuter4 = i5 + 34;
        key_avatar_text = i5 + 35;
        key_avatar_backgroundSaved = i5 + 36;
        key_avatar_background2Saved = i5 + 37;
        key_avatar_backgroundArchived = i5 + 38;
        int i6 = i5 + 40;
        key_avatar_backgroundArchivedHidden = i5 + 39;
        int i7 = i5 + 41;
        key_avatar_backgroundRed = i6;
        int i8 = i5 + 42;
        key_avatar_backgroundOrange = i7;
        int i9 = i5 + 43;
        key_avatar_backgroundViolet = i8;
        int i10 = i5 + 44;
        key_avatar_backgroundGreen = i9;
        int i11 = i5 + 45;
        key_avatar_backgroundCyan = i10;
        int i12 = i5 + 46;
        key_avatar_backgroundBlue = i11;
        int i13 = i5 + 47;
        key_avatar_backgroundPink = i12;
        int i14 = i5 + 48;
        key_avatar_background2Red = i13;
        colorsCount = i5 + 49;
        key_avatar_background2Orange = i14;
        int i15 = colorsCount;
        int i16 = i15 + 1;
        key_avatar_background2Violet = i15;
        int i17 = i15 + 2;
        key_avatar_background2Green = i16;
        int i18 = i15 + 3;
        key_avatar_background2Cyan = i17;
        int i19 = i15 + 4;
        key_avatar_background2Blue = i18;
        key_avatar_background2Pink = i19;
        key_avatar_backgroundGray = i15 + 5;
        key_avatar_backgroundInProfileBlue = i15 + 6;
        key_avatar_backgroundActionBarBlue = i15 + 7;
        key_avatar_actionBarSelectorBlue = i15 + 8;
        key_avatar_actionBarIconBlue = i15 + 9;
        int i20 = i15 + 11;
        key_avatar_subtitleInProfileBlue = i15 + 10;
        int i21 = i15 + 12;
        key_avatar_nameInMessageRed = i20;
        int i22 = i15 + 13;
        key_avatar_nameInMessageOrange = i21;
        int i23 = i15 + 14;
        key_avatar_nameInMessageViolet = i22;
        int i24 = i15 + 15;
        key_avatar_nameInMessageGreen = i23;
        int i25 = i15 + 16;
        key_avatar_nameInMessageCyan = i24;
        int i26 = i15 + 17;
        key_avatar_nameInMessageBlue = i25;
        key_avatar_nameInMessagePink = i26;
        keys_avatar_background = new int[]{i6, i7, i8, i9, i10, i11, i12};
        keys_avatar_background2 = new int[]{i13, i14, i15, i16, i17, i18, i19};
        keys_avatar_nameInMessage = new int[]{i20, i21, i22, i23, i24, i25, i26};
        key_actionBarDefault = i15 + 18;
        key_actionBarDefaultSelector = i15 + 19;
        key_actionBarWhiteSelector = i15 + 20;
        key_actionBarDefaultIcon = i15 + 21;
        key_actionBarActionModeDefault = i15 + 22;
        key_actionBarActionModeDefaultTop = i15 + 23;
        key_actionBarActionModeDefaultIcon = i15 + 24;
        key_actionBarActionModeDefaultSelector = i15 + 25;
        key_actionBarDefaultTitle = i15 + 26;
        key_actionBarDefaultSubtitle = i15 + 27;
        key_actionBarDefaultSearch = i15 + 28;
        key_actionBarDefaultSearchPlaceholder = i15 + 29;
        key_actionBarDefaultSubmenuItem = i15 + 30;
        key_actionBarDefaultSubmenuItemIcon = i15 + 31;
        key_actionBarDefaultSubmenuBackground = i15 + 32;
        key_actionBarDefaultSubmenuSeparator = i15 + 33;
        key_actionBarTabActiveText = i15 + 34;
        key_actionBarTabUnactiveText = i15 + 35;
        key_actionBarTabLine = i15 + 36;
        key_actionBarTabSelector = i15 + 37;
        key_actionBarDefaultArchived = i15 + 38;
        key_actionBarDefaultArchivedSelector = i15 + 39;
        key_actionBarDefaultArchivedIcon = i15 + 40;
        key_actionBarDefaultArchivedTitle = i15 + 41;
        key_actionBarDefaultArchivedSearch = i15 + 42;
        key_actionBarDefaultArchivedSearchPlaceholder = i15 + 43;
        key_actionBarBrowser = i15 + 44;
        colorsCount = i15 + 46;
        key_chats_onlineCircle = i15 + 45;
        int i27 = colorsCount;
        key_chats_unreadCounter = i27;
        key_chats_unreadCounterMuted = i27 + 1;
        key_chats_unreadCounterText = i27 + 2;
        key_chats_name = i27 + 3;
        key_chats_nameArchived = i27 + 4;
        key_chats_secretName = i27 + 5;
        key_chats_secretIcon = i27 + 6;
        key_chats_pinnedIcon = i27 + 7;
        key_chats_archiveBackground = i27 + 8;
        key_chats_archivePinBackground = i27 + 9;
        key_chats_archiveIcon = i27 + 10;
        key_chats_archiveText = i27 + 11;
        key_chats_message = i27 + 12;
        key_chats_messageArchived = i27 + 13;
        key_chats_message_threeLines = i27 + 14;
        key_chats_draft = i27 + 15;
        key_chats_nameMessage = i27 + 16;
        key_chats_nameMessageArchived = i27 + 17;
        key_chats_nameMessage_threeLines = i27 + 18;
        key_chats_nameMessageArchived_threeLines = i27 + 19;
        key_chats_attachMessage = i27 + 20;
        key_chats_actionMessage = i27 + 21;
        key_chats_date = i27 + 22;
        key_chats_date_bold = i27 + 23;
        key_chats_pinnedOverlay = i27 + 24;
        key_chats_tabletSelectedOverlay = i27 + 25;
        key_chats_sentCheck = i27 + 26;
        key_chats_sentReadCheck = i27 + 27;
        key_chats_sentClock = i27 + 28;
        key_chats_sentError = i27 + 29;
        key_chats_sentErrorIcon = i27 + 30;
        key_chats_verifiedBackground = i27 + 31;
        key_chats_verifiedCheck = i27 + 32;
        key_chats_muteIcon = i27 + 33;
        key_chats_mentionIcon = i27 + 34;
        key_chats_menuTopShadow = i27 + 35;
        key_chats_menuTopShadowCats = i27 + 36;
        key_chats_menuBackground = i27 + 37;
        key_chats_menuItemText = i27 + 38;
        key_chats_menuItemCheck = i27 + 39;
        key_chats_menuItemIcon = i27 + 40;
        key_chats_menuName = i27 + 41;
        key_chats_menuPhone = i27 + 42;
        key_chats_menuPhoneCats = i27 + 43;
        key_chats_menuTopBackgroundCats = i27 + 44;
        key_chats_menuTopBackground = i27 + 45;
        key_chats_actionIcon = i27 + 46;
        key_chats_actionBackground = i27 + 47;
        colorsCount = i27 + 49;
        key_chats_actionPressedBackground = i27 + 48;
        int i28 = colorsCount;
        key_chats_archivePullDownBackground = i28;
        key_chats_archivePullDownBackgroundActive = i28 + 1;
        key_chats_tabUnreadActiveBackground = i28 + 2;
        key_chats_tabUnreadUnactiveBackground = i28 + 3;
        key_chat_attachCheckBoxCheck = i28 + 4;
        key_chat_attachCheckBoxBackground = i28 + 5;
        key_chat_attachPhotoBackground = i28 + 6;
        key_chat_attachActiveTab = i28 + 7;
        key_chat_attachUnactiveTab = i28 + 8;
        key_chat_attachPermissionImage = i28 + 9;
        key_chat_attachPermissionMark = i28 + 10;
        key_chat_attachPermissionText = i28 + 11;
        key_chat_attachEmptyImage = i28 + 12;
        key_chat_inPollCorrectAnswer = i28 + 13;
        key_chat_outPollCorrectAnswer = i28 + 14;
        key_chat_inPollWrongAnswer = i28 + 15;
        key_chat_outPollWrongAnswer = i28 + 16;
        key_chat_attachIcon = i28 + 17;
        key_chat_attachGalleryBackground = i28 + 18;
        key_chat_attachAudioBackground = i28 + 19;
        key_chat_attachContactBackground = i28 + 20;
        key_chat_attachContactText = i28 + 21;
        key_chat_attachLocationBackground = i28 + 22;
        key_chat_attachPollBackground = i28 + 23;
        key_chat_status = i28 + 24;
        key_chat_inGreenCall = i28 + 25;
        key_chat_inBubble = i28 + 26;
        key_chat_inBubbleSelectedOverlay = i28 + 27;
        key_chat_inBubbleShadow = i28 + 28;
        key_actionBarActionModeReaction = i28 + 29;
        key_actionBarActionModeReactionText = i28 + 30;
        key_actionBarActionModeReactionDot = i28 + 31;
        key_buttonNeutral = i28 + 32;
        int i29 = i28 + 34;
        key_buttonNeutralText = i28 + 33;
        myMessagesBubblesStartIndex = i29;
        key_chat_outBubble = i29;
        key_chat_outBubbleSelected = i28 + 35;
        key_chat_outBubbleShadow = i28 + 36;
        key_chat_outBubbleGradient1 = i28 + 37;
        key_chat_outBubbleGradient2 = i28 + 38;
        int i30 = i28 + 40;
        key_chat_outBubbleGradient3 = i28 + 39;
        myMessagesBubblesEndIndex = i30;
        myMessagesStartIndex = i30;
        key_chat_outGreenCall = i30;
        key_chat_outSentCheck = i28 + 41;
        key_chat_outSentCheckSelected = i28 + 42;
        key_chat_outSentCheckRead = i28 + 43;
        key_chat_outSentCheckReadSelected = i28 + 44;
        colorsCount = i28 + 46;
        key_chat_outSentClock = i28 + 45;
        int i31 = colorsCount;
        key_chat_outSentClockSelected = i31;
        key_chat_outMediaIcon = i31 + 1;
        key_chat_outMediaIconSelected = i31 + 2;
        key_chat_outViews = i31 + 3;
        key_chat_outViewsSelected = i31 + 4;
        key_chat_outMenu = i31 + 5;
        key_chat_outMenuSelected = i31 + 6;
        key_chat_outInstant = i31 + 7;
        key_chat_outInstantSelected = i31 + 8;
        key_chat_outPreviewInstantText = i31 + 9;
        key_chat_outForwardedNameText = i31 + 10;
        key_chat_outViaBotNameText = i31 + 11;
        key_chat_outReplyLine = i31 + 12;
        key_chat_outReplyLine2 = i31 + 13;
        key_chat_outReplyNameText = i31 + 14;
        key_chat_outReplyMessageText = i31 + 15;
        key_chat_outReplyMediaMessageText = i31 + 16;
        key_chat_outReplyMediaMessageSelectedText = i31 + 17;
        key_chat_outPreviewLine = i31 + 18;
        key_chat_outSiteNameText = i31 + 19;
        key_chat_outContactNameText = i31 + 20;
        key_chat_outContactPhoneText = i31 + 21;
        key_chat_outContactPhoneSelectedText = i31 + 22;
        key_chat_outAudioPerformerText = i31 + 23;
        key_chat_outAudioPerformerSelectedText = i31 + 24;
        key_chat_outTimeSelectedText = i31 + 25;
        key_chat_outAdminText = i31 + 26;
        key_chat_outAdminSelectedText = i31 + 27;
        key_chat_outAudioProgress = i31 + 28;
        key_chat_outAudioSelectedProgress = i31 + 29;
        key_chat_outTimeText = i31 + 30;
        key_chat_outAudioTitleText = i31 + 31;
        key_chat_outAudioDurationText = i31 + 32;
        key_chat_outAudioDurationSelectedText = i31 + 33;
        key_chat_outAudioSeekbar = i31 + 34;
        key_chat_outAudioCacheSeekbar = i31 + 35;
        key_chat_outAudioSeekbarSelected = i31 + 36;
        key_chat_outAudioSeekbarFill = i31 + 37;
        key_chat_outVoiceSeekbar = i31 + 38;
        key_chat_outVoiceSeekbarSelected = i31 + 39;
        key_chat_outVoiceSeekbarFill = i31 + 40;
        key_chat_outFileProgress = i31 + 41;
        key_chat_outFileProgressSelected = i31 + 42;
        key_chat_outFileNameText = i31 + 43;
        key_chat_outFileInfoText = i31 + 44;
        key_chat_outFileInfoSelectedText = i31 + 45;
        key_chat_outFileBackground = i31 + 46;
        key_chat_outFileBackgroundSelected = i31 + 47;
        colorsCount = i31 + 49;
        key_chat_outVenueInfoText = i31 + 48;
        int i32 = colorsCount;
        key_chat_outVenueInfoSelectedText = i32;
        key_chat_outLinkSelectBackground = i32 + 1;
        key_chat_outLoader = i32 + 2;
        key_chat_outLoaderSelected = i32 + 3;
        key_chat_outLocationIcon = i32 + 4;
        key_chat_outContactBackground = i32 + 5;
        key_chat_outContactIcon = i32 + 6;
        int i33 = i32 + 8;
        key_chat_outReactionButtonBackground = i32 + 7;
        myMessagesEndIndex = i33;
        myMessages2StartIndex = i33;
        key_chat_outTextSelectionHighlight = i33;
        key_chat_outTextSelectionCursor = i32 + 9;
        key_chat_outBubbleLocationPlaceholder = i32 + 10;
        key_chat_outBubbleSelectedOverlay = i32 + 11;
        key_chat_outPsaNameText = i32 + 12;
        key_chat_outBubbleGradientAnimated = i32 + 13;
        int i34 = i32 + 15;
        key_chat_outBubbleGradientSelectedOverlay = i32 + 14;
        myMessages2EndIndex = i34;
        key_chat_inBubbleSelected = i34;
        key_chat_messageTextIn = i32 + 16;
        key_chat_messageTextOut = i32 + 17;
        key_chat_messageLinkIn = i32 + 18;
        key_chat_messageLinkOut = i32 + 19;
        key_chat_serviceText = i32 + 20;
        key_chat_serviceLink = i32 + 21;
        key_chat_serviceIcon = i32 + 22;
        key_chat_serviceBackground = i32 + 23;
        key_chat_serviceBackgroundSelected = i32 + 24;
        key_chat_serviceBackgroundSelector = i32 + 25;
        key_chat_muteIcon = i32 + 26;
        key_chat_lockIcon = i32 + 27;
        key_chat_inSentClock = i32 + 28;
        key_chat_inSentClockSelected = i32 + 29;
        key_chat_mediaSentCheck = i32 + 30;
        key_chat_mediaSentClock = i32 + 31;
        key_chat_inMediaIcon = i32 + 32;
        key_chat_inMediaIconSelected = i32 + 33;
        key_chat_mediaTimeBackground = i32 + 34;
        key_chat_inViews = i32 + 35;
        key_chat_inViewsSelected = i32 + 36;
        key_chat_mediaViews = i32 + 37;
        key_chat_inMenu = i32 + 38;
        key_chat_inMenuSelected = i32 + 39;
        key_chat_mediaMenu = i32 + 40;
        key_chat_inInstant = i32 + 41;
        key_chat_inInstantSelected = i32 + 42;
        key_chat_sentError = i32 + 43;
        key_chat_sentErrorIcon = i32 + 44;
        colorsCount = i32 + 46;
        key_chat_selectedBackground = i32 + 45;
        int i35 = colorsCount;
        key_chat_previewDurationText = i35;
        key_chat_previewGameText = i35 + 1;
        key_chat_inPreviewInstantText = i35 + 2;
        key_chat_secretTimeText = i35 + 3;
        key_chat_stickerNameText = i35 + 4;
        key_chat_botButtonText = i35 + 5;
        key_chat_inForwardedNameText = i35 + 6;
        key_chat_inPsaNameText = i35 + 7;
        key_chat_inViaBotNameText = i35 + 8;
        key_chat_stickerViaBotNameText = i35 + 9;
        key_chat_inQuote = i35 + 10;
        key_chat_outQuote = i35 + 11;
        key_chat_inReplyLine = i35 + 12;
        key_chat_stickerReplyLine = i35 + 13;
        key_chat_inReplyNameText = i35 + 14;
        key_chat_stickerReplyNameText = i35 + 15;
        key_chat_inReplyMessageText = i35 + 16;
        key_chat_inReplyMediaMessageText = i35 + 17;
        key_chat_inReplyMediaMessageSelectedText = i35 + 18;
        key_chat_stickerReplyMessageText = i35 + 19;
        key_chat_inPreviewLine = i35 + 20;
        key_chat_inSiteNameText = i35 + 21;
        key_chat_inContactNameText = i35 + 22;
        key_chat_inContactPhoneText = i35 + 23;
        key_chat_inContactPhoneSelectedText = i35 + 24;
        key_chat_mediaProgress = i35 + 25;
        key_chat_inAudioProgress = i35 + 26;
        key_chat_inAudioSelectedProgress = i35 + 27;
        key_chat_mediaTimeText = i35 + 28;
        key_chat_inAdminText = i35 + 29;
        key_chat_inAdminSelectedText = i35 + 30;
        key_chat_inTimeText = i35 + 31;
        key_chat_inTimeSelectedText = i35 + 32;
        key_chat_inAudioPerformerText = i35 + 33;
        key_chat_inAudioPerformerSelectedText = i35 + 34;
        key_chat_inAudioTitleText = i35 + 35;
        key_chat_inAudioDurationText = i35 + 36;
        key_chat_inAudioDurationSelectedText = i35 + 37;
        key_chat_inAudioSeekbar = i35 + 38;
        key_chat_inAudioCacheSeekbar = i35 + 39;
        key_chat_inAudioSeekbarSelected = i35 + 40;
        key_chat_inAudioSeekbarFill = i35 + 41;
        key_chat_inVoiceSeekbar = i35 + 42;
        key_chat_inVoiceSeekbarSelected = i35 + 43;
        key_chat_inVoiceSeekbarFill = i35 + 44;
        key_chat_inFileProgress = i35 + 45;
        key_chat_inFileProgressSelected = i35 + 46;
        key_chat_inFileNameText = i35 + 47;
        colorsCount = i35 + 49;
        key_chat_inFileInfoText = i35 + 48;
        int i36 = colorsCount;
        key_chat_inFileInfoSelectedText = i36;
        key_chat_inFileBackground = i36 + 1;
        key_chat_inFileBackgroundSelected = i36 + 2;
        key_chat_inVenueInfoText = i36 + 3;
        key_chat_inVenueInfoSelectedText = i36 + 4;
        key_chat_mediaInfoText = i36 + 5;
        key_chat_linkSelectBackground = i36 + 6;
        key_chat_textSelectBackground = i36 + 7;
        key_chat_wallpaper = i36 + 8;
        key_chat_wallpaper_gradient_to1 = i36 + 9;
        key_chat_wallpaper_gradient_to2 = i36 + 10;
        key_chat_wallpaper_gradient_to3 = i36 + 11;
        key_chat_wallpaper_gradient_rotation = i36 + 12;
        key_chat_messagePanelBackground = i36 + 13;
        key_chat_messagePanelShadow = i36 + 14;
        key_chat_messagePanelText = i36 + 15;
        key_chat_messagePanelHint = i36 + 16;
        key_chat_messagePanelCursor = i36 + 17;
        key_chat_messagePanelIcons = i36 + 18;
        key_chat_messagePanelSend = i36 + 19;
        key_chat_messagePanelVoiceLock = i36 + 20;
        key_chat_messagePanelVoiceLockBackground = i36 + 21;
        key_chat_messagePanelVoiceLockShadow = i36 + 22;
        key_chat_topPanelBackground = i36 + 23;
        key_chat_topPanelClose = i36 + 24;
        key_chat_topPanelLine = i36 + 25;
        key_chat_topPanelTitle = i36 + 26;
        key_chat_topPanelMessage = i36 + 27;
        key_chat_addContact = i36 + 28;
        key_chat_inLoader = i36 + 29;
        key_chat_inLoaderSelected = i36 + 30;
        key_chat_inLoaderPhoto = i36 + 31;
        key_chat_mediaLoaderPhoto = i36 + 32;
        key_chat_mediaLoaderPhotoSelected = i36 + 33;
        key_chat_mediaLoaderPhotoIcon = i36 + 34;
        key_chat_mediaLoaderPhotoIconSelected = i36 + 35;
        key_chat_inLocationBackground = i36 + 36;
        key_chat_inLocationIcon = i36 + 37;
        key_chat_inContactBackground = i36 + 38;
        key_chat_inContactIcon = i36 + 39;
        key_chat_replyPanelIcons = i36 + 40;
        key_chat_replyPanelClose = i36 + 41;
        key_chat_replyPanelName = i36 + 42;
        key_chat_replyPanelLine = i36 + 43;
        key_chat_searchPanelIcons = i36 + 44;
        key_chat_searchPanelText = i36 + 45;
        key_chat_secretChatStatusText = i36 + 46;
        key_chat_fieldOverlayText = i36 + 47;
        colorsCount = i36 + 49;
        key_chat_stickersHintPanel = i36 + 48;
        int i37 = colorsCount;
        key_chat_botSwitchToInlineText = i37;
        key_chat_unreadMessagesStartArrowIcon = i37 + 1;
        key_chat_unreadMessagesStartText = i37 + 2;
        key_chat_unreadMessagesStartBackground = i37 + 3;
        key_chat_inlineResultIcon = i37 + 4;
        key_chat_emojiPanelBackground = i37 + 5;
        key_chat_emojiSearchBackground = i37 + 6;
        key_chat_emojiSearchIcon = i37 + 7;
        key_chat_emojiPanelShadowLine = i37 + 8;
        key_chat_emojiPanelEmptyText = i37 + 9;
        key_chat_emojiPanelIcon = i37 + 10;
        key_chat_emojiBottomPanelIcon = i37 + 11;
        key_chat_emojiPanelIconSelected = i37 + 12;
        key_chat_emojiPanelStickerPackSelector = i37 + 13;
        key_chat_emojiPanelStickerPackSelectorLine = i37 + 14;
        key_chat_emojiPanelBackspace = i37 + 15;
        key_chat_emojiPanelTrendingTitle = i37 + 16;
        key_chat_emojiPanelStickerSetName = i37 + 17;
        key_chat_emojiPanelStickerSetNameHighlight = i37 + 18;
        key_chat_emojiPanelStickerSetNameIcon = i37 + 19;
        key_chat_emojiPanelTrendingDescription = i37 + 20;
        key_chat_botKeyboardButtonText = i37 + 21;
        key_chat_botKeyboardButtonBackground = i37 + 22;
        key_chat_botKeyboardButtonBackgroundPressed = i37 + 23;
        key_chat_emojiPanelNewTrending = i37 + 24;
        key_chat_messagePanelVoicePressed = i37 + 25;
        key_chat_messagePanelVoiceBackground = i37 + 26;
        key_chat_messagePanelVoiceDelete = i37 + 27;
        key_chat_messagePanelVoiceDuration = i37 + 28;
        key_chat_recordedVoicePlayPause = i37 + 29;
        key_chat_recordedVoiceProgress = i37 + 30;
        key_chat_recordedVoiceProgressInner = i37 + 31;
        key_chat_recordedVoiceDot = i37 + 32;
        key_chat_recordedVoiceBackground = i37 + 33;
        key_chat_recordedVoiceDarkerBackground = i37 + 34;
        key_chat_recordVoiceCancel = i37 + 35;
        key_chat_recordTime = i37 + 36;
        key_chat_messagePanelCancelInlineBot = i37 + 37;
        key_chat_gifSaveHintText = i37 + 38;
        key_chat_gifSaveHintBackground = i37 + 39;
        key_chat_goDownButton = i37 + 40;
        key_chat_goDownButtonCounter = i37 + 41;
        key_chat_goDownButtonCounterBackground = i37 + 42;
        key_chat_inTextSelectionHighlight = i37 + 43;
        key_chat_TextSelectionCursor = i37 + 44;
        key_chat_inBubbleLocationPlaceholder = i37 + 45;
        key_chat_BlurAlpha = i37 + 46;
        key_chat_BlurAlphaSlow = i37 + 47;
        colorsCount = i37 + 49;
        key_chat_editMediaButton = i37 + 48;
        int i38 = colorsCount;
        key_chat_msgIvButtonDefaultIn = i38;
        key_chat_msgIvButtonDefaultInPressed = i38 + 1;
        key_chat_msgIvButtonDefaultInText = i38 + 2;
        key_chat_msgIvButtonPrimaryIn = i38 + 3;
        key_chat_msgIvButtonPrimaryInPressed = i38 + 4;
        key_chat_msgIvButtonPrimaryInText = i38 + 5;
        key_chat_msgIvButtonDangerIn = i38 + 6;
        key_chat_msgIvButtonDangerInPressed = i38 + 7;
        key_chat_msgIvButtonDangerInText = i38 + 8;
        key_chat_msgIvButtonSuccessIn = i38 + 9;
        key_chat_msgIvButtonSuccessInPressed = i38 + 10;
        key_chat_msgIvButtonSuccessInText = i38 + 11;
        key_chat_msgIvButtonDefaultInlineIn = i38 + 12;
        key_chat_msgIvButtonDefaultInlineInPressed = i38 + 13;
        key_chat_msgIvButtonDefaultInlineInText = i38 + 14;
        key_chat_msgIvButtonDefaultOut = i38 + 15;
        key_chat_msgIvButtonDefaultOutPressed = i38 + 16;
        key_chat_msgIvButtonDefaultOutText = i38 + 17;
        key_chat_msgIvButtonPrimaryOut = i38 + 18;
        key_chat_msgIvButtonPrimaryOutPressed = i38 + 19;
        key_chat_msgIvButtonPrimaryOutText = i38 + 20;
        key_chat_msgIvButtonDangerOut = i38 + 21;
        key_chat_msgIvButtonDangerOutPressed = i38 + 22;
        key_chat_msgIvButtonDangerOutText = i38 + 23;
        key_chat_msgIvButtonSuccessOut = i38 + 24;
        key_chat_msgIvButtonSuccessOutPressed = i38 + 25;
        key_chat_msgIvButtonSuccessOutText = i38 + 26;
        key_chat_msgIvButtonDefaultInlineOut = i38 + 27;
        key_chat_msgIvButtonDefaultInlineOutPressed = i38 + 28;
        key_chat_msgIvButtonDefaultInlineOutText = i38 + 29;
        key_voipgroup_listSelector = i38 + 30;
        key_voipgroup_inviteMembersBackground = i38 + 31;
        key_voipgroup_actionBar = i38 + 32;
        key_voipgroup_actionBarItems = i38 + 33;
        key_voipgroup_actionBarItemsSelector = i38 + 34;
        key_voipgroup_actionBarUnscrolled = i38 + 35;
        key_voipgroup_listViewBackgroundUnscrolled = i38 + 36;
        key_voipgroup_lastSeenTextUnscrolled = i38 + 37;
        key_voipgroup_mutedIconUnscrolled = i38 + 38;
        key_voipgroup_nameText = i38 + 39;
        key_voipgroup_lastSeenText = i38 + 40;
        key_voipgroup_listeningText = i38 + 41;
        key_voipgroup_speakingText = i38 + 42;
        key_voipgroup_mutedIcon = i38 + 43;
        key_voipgroup_mutedByAdminIcon = i38 + 44;
        key_voipgroup_listViewBackground = i38 + 45;
        key_voipgroup_dialogBackground = i38 + 46;
        key_voipgroup_leaveCallMenu = i38 + 47;
        colorsCount = i38 + 49;
        key_voipgroup_checkMenu = i38 + 48;
        int i39 = colorsCount;
        key_voipgroup_soundButton = i39;
        key_voipgroup_soundButtonActive = i39 + 1;
        key_voipgroup_soundButtonActiveScrolled = i39 + 2;
        key_voipgroup_soundButton2 = i39 + 3;
        key_voipgroup_soundButtonActive2 = i39 + 4;
        key_voipgroup_soundButtonActive2Scrolled = i39 + 5;
        key_voipgroup_leaveButton = i39 + 6;
        key_voipgroup_leaveButtonScrolled = i39 + 7;
        key_voipgroup_muteButton = i39 + 8;
        key_voipgroup_muteButton2 = i39 + 9;
        key_voipgroup_muteButton3 = i39 + 10;
        key_voipgroup_unmuteButton = i39 + 11;
        key_voipgroup_unmuteButton2 = i39 + 12;
        key_voipgroup_disabledButton = i39 + 13;
        key_voipgroup_rtmpButton = i39 + 14;
        key_voipgroup_disabledButtonActive = i39 + 15;
        key_voipgroup_disabledButtonActiveScrolled = i39 + 16;
        key_voipgroup_connectingProgress = i39 + 17;
        key_voipgroup_scrollUp = i39 + 18;
        key_voipgroup_searchPlaceholder = i39 + 19;
        key_voipgroup_searchBackground = i39 + 20;
        key_voipgroup_searchText = i39 + 21;
        key_voipgroup_overlayGreen1 = i39 + 22;
        key_voipgroup_overlayGreen2 = i39 + 23;
        key_voipgroup_overlayBlue1 = i39 + 24;
        key_voipgroup_overlayBlue2 = i39 + 25;
        key_voipgroup_topPanelGreen1 = i39 + 26;
        key_voipgroup_topPanelGreen2 = i39 + 27;
        key_voipgroup_topPanelBlue1 = i39 + 28;
        key_voipgroup_topPanelBlue2 = i39 + 29;
        key_voipgroup_topPanelGray = i39 + 30;
        key_voipgroup_overlayAlertGradientMuted = i39 + 31;
        key_voipgroup_overlayAlertGradientMuted2 = i39 + 32;
        key_voipgroup_overlayAlertGradientUnmuted = i39 + 33;
        key_voipgroup_overlayAlertGradientUnmuted2 = i39 + 34;
        key_voipgroup_overlayAlertMutedByAdmin = i39 + 35;
        key_voipgroup_overlayAlertMutedByAdmin2 = i39 + 36;
        key_voipgroup_mutedByAdminGradient = i39 + 37;
        key_voipgroup_mutedByAdminGradient2 = i39 + 38;
        key_voipgroup_mutedByAdminGradient3 = i39 + 39;
        key_voipgroup_mutedByAdminMuteButton = i39 + 40;
        key_voipgroup_mutedByAdminMuteButtonDisabled = i39 + 41;
        key_voipgroup_windowBackgroundWhiteInputField = i39 + 42;
        key_voipgroup_windowBackgroundWhiteInputFieldActivated = i39 + 43;
        key_table_background = i39 + 44;
        key_table_border = i39 + 45;
        key_passport_authorizeBackground = i39 + 46;
        key_passport_authorizeBackgroundSelected = i39 + 47;
        colorsCount = i39 + 49;
        key_passport_authorizeText = i39 + 48;
        int i40 = colorsCount;
        key_profile_creatorIcon = i40;
        key_profile_title = i40 + 1;
        key_profile_actionIcon = i40 + 2;
        key_profile_actionBackground = i40 + 3;
        key_profile_actionPressedBackground = i40 + 4;
        key_profile_verifiedBackground = i40 + 5;
        key_profile_verifiedCheck = i40 + 6;
        key_profile_status = i40 + 7;
        key_chat_tagAdmin = i40 + 8;
        key_chat_tagCreator = i40 + 9;
        key_profile_tabText = i40 + 10;
        key_profile_tabSelectedText = i40 + 11;
        key_profile_tabSelectedLine = i40 + 12;
        key_profile_tabSelector = i40 + 13;
        key_sharedMedia_startStopLoadIcon = i40 + 14;
        key_sharedMedia_linkPlaceholder = i40 + 15;
        key_sharedMedia_linkPlaceholderText = i40 + 16;
        key_sharedMedia_photoPlaceholder = i40 + 17;
        key_featuredStickers_addedIcon = i40 + 18;
        key_featuredStickers_buttonProgress = i40 + 19;
        key_featuredStickers_addButton = i40 + 20;
        key_featuredStickers_addButton2 = i40 + 21;
        key_featuredStickers_addButtonPressed = i40 + 22;
        key_featuredStickers_removeButtonText = i40 + 23;
        key_featuredStickers_buttonText = i40 + 24;
        key_featuredStickers_unread = i40 + 25;
        key_stickers_menu = i40 + 26;
        key_stickers_menuSelector = i40 + 27;
        key_changephoneinfo_image2 = i40 + 28;
        key_groupcreate_hintText = i40 + 29;
        key_groupcreate_cursor = i40 + 30;
        key_groupcreate_sectionShadow = i40 + 31;
        key_groupcreate_sectionText = i40 + 32;
        key_groupcreate_spanText = i40 + 33;
        key_groupcreate_spanBackground = i40 + 34;
        key_groupcreate_spanDelete = i40 + 35;
        key_contacts_inviteBackground = i40 + 36;
        key_contacts_inviteText = i40 + 37;
        key_login_progressInner = i40 + 38;
        key_login_progressOuter = i40 + 39;
        key_picker_enabledButton = i40 + 40;
        key_picker_disabledButton = i40 + 41;
        key_picker_badge = i40 + 42;
        key_picker_badgeText = i40 + 43;
        key_location_sendLocationBackground = i40 + 44;
        key_location_sendLocationIcon = i40 + 45;
        key_location_sendLocationText = i40 + 46;
        key_location_sendLiveLocationBackground = i40 + 47;
        colorsCount = i40 + 49;
        key_location_sendLiveLocationIcon = i40 + 48;
        int i41 = colorsCount;
        key_location_sendLiveLocationText = i41;
        key_location_liveLocationProgress = i41 + 1;
        key_location_placeLocationBackground = i41 + 2;
        key_location_actionIcon = i41 + 3;
        key_location_actionActiveIcon = i41 + 4;
        key_location_actionBackground = i41 + 5;
        key_location_actionPressedBackground = i41 + 6;
        key_dialog_liveLocationProgress = i41 + 7;
        key_files_folderIcon = i41 + 8;
        key_files_folderIconBackground = i41 + 9;
        key_files_iconText = i41 + 10;
        key_sessions_devicesImage = i41 + 11;
        key_calls_callReceivedGreenIcon = i41 + 12;
        key_calls_callReceivedRedIcon = i41 + 13;
        key_undo_background = i41 + 14;
        key_undo_cancelColor = i41 + 15;
        key_undo_infoColor = i41 + 16;
        key_sheet_scrollUp = i41 + 17;
        key_sheet_other = i41 + 18;
        key_bot_loadingIcon = i41 + 19;
        key_gift_ribbon = i41 + 20;
        key_gift_ribbon_soldout = i41 + 21;
        key_player_actionBarSelector = i41 + 22;
        key_player_actionBarTitle = i41 + 23;
        key_player_actionBarSubtitle = i41 + 24;
        key_player_actionBarItems = i41 + 25;
        key_player_background = i41 + 26;
        key_player_time = i41 + 27;
        key_player_progressBackground = i41 + 28;
        key_player_progressCachedBackground = i41 + 29;
        key_player_progress = i41 + 30;
        key_player_button = i41 + 31;
        key_player_buttonActive = i41 + 32;
        key_statisticChartSignature = i41 + 33;
        key_statisticChartSignatureAlpha = i41 + 34;
        key_statisticChartHintLine = i41 + 35;
        key_statisticChartActiveLine = i41 + 36;
        key_statisticChartInactivePickerChart = i41 + 37;
        key_statisticChartActivePickerChart = i41 + 38;
        key_statisticChartRipple = i41 + 39;
        key_statisticChartBackZoomColor = i41 + 40;
        key_statisticChartChevronColor = i41 + 41;
        key_statisticChartLine_blue = i41 + 42;
        key_statisticChartLine_green = i41 + 43;
        key_statisticChartLine_red = i41 + 44;
        key_statisticChartLine_golden = i41 + 45;
        key_statisticChartLine_lightblue = i41 + 46;
        key_statisticChartLine_lightgreen = i41 + 47;
        colorsCount = i41 + 49;
        key_statisticChartLine_orange = i41 + 48;
        int i42 = colorsCount;
        key_statisticChartLine_indigo = i42;
        key_statisticChartLine_purple = i42 + 1;
        key_statisticChartLine_cyan = i42 + 2;
        int i43 = i42 + 4;
        key_statisticChartLineEmpty = i42 + 3;
        int i44 = i42 + 5;
        key_color_lightblue = i43;
        int i45 = i42 + 6;
        key_color_blue = i44;
        int i46 = i42 + 7;
        key_color_green = i45;
        int i47 = i42 + 8;
        key_color_lightgreen = i46;
        int i48 = i42 + 9;
        key_color_red = i47;
        int i49 = i42 + 10;
        key_color_orange = i48;
        int i50 = i42 + 11;
        key_color_yellow = i49;
        int i51 = i42 + 12;
        key_color_purple = i50;
        key_color_cyan = i51;
        keys_colors = new int[]{i43, i44, i45, i46, i47, i48, i49, i50, i51};
        key_chat_inReactionButtonBackground = i42 + 13;
        key_chat_outReactionButtonText = i42 + 14;
        key_chat_inReactionButtonText = i42 + 15;
        key_chat_inReactionButtonTextSelected = i42 + 16;
        key_chat_outReactionButtonTextSelected = i42 + 17;
        key_chat_reactionServiceButtonBackgroundSelected = i42 + 18;
        key_chat_reactionServiceButtonTextSelected = i42 + 19;
        key_reactionStarSelector = i42 + 20;
        key_premiumGradient0 = i42 + 21;
        key_premiumGradient1 = i42 + 22;
        key_premiumGradient2 = i42 + 23;
        key_premiumGradient3 = i42 + 24;
        key_premiumGradient4 = i42 + 25;
        key_premiumGradientBackground1 = i42 + 26;
        key_premiumGradientBackground2 = i42 + 27;
        key_premiumGradientBackground3 = i42 + 28;
        key_premiumGradientBackground4 = i42 + 29;
        key_premiumGradientBackgroundOverlay = i42 + 30;
        key_premiumStartSmallStarsColor = i42 + 31;
        key_premiumStarGradient1 = i42 + 32;
        key_premiumStarGradient2 = i42 + 33;
        key_premiumCoinGradient1 = i42 + 34;
        key_premiumCoinGradient2 = i42 + 35;
        key_premiumStartSmallStarsColor2 = i42 + 36;
        key_premiumGradientBottomSheet1 = i42 + 37;
        key_premiumGradientBottomSheet2 = i42 + 38;
        key_premiumGradientBottomSheet3 = i42 + 39;
        key_topics_unreadCounter = i42 + 40;
        key_topics_unreadCounterMuted = i42 + 41;
        key_starsGradient1 = i42 + 42;
        key_starsGradient2 = i42 + 43;
        key_stories_circle1 = i42 + 44;
        key_stories_circle2 = i42 + 45;
        key_stories_circle_dialog1 = i42 + 46;
        colorsCount = i42 + 48;
        key_stories_circle_dialog2 = i42 + 47;
        int i52 = colorsCount;
        key_stories_circle_closeFriends1 = i52;
        key_stories_circle_closeFriends2 = i52 + 1;
        key_stories_circle_live1 = i52 + 2;
        key_stories_circle_live2 = i52 + 3;
        key_chat_inCodeBackground = i52 + 4;
        key_chat_outCodeBackground = i52 + 5;
        key_chat_inTableBackground = i52 + 6;
        key_chat_outTableBackground = i52 + 7;
        key_chat_inTableBorder = i52 + 8;
        key_chat_outTableBorder = i52 + 9;
        int i53 = i52 + 11;
        key_chat_inDivider = i52 + 10;
        key_chat_outDivider = i53;
        key_chat_inArticleCodeBackground = i52 + 12;
        key_chat_outArticleCodeBackground = i52 + 13;
        key_chat_inArticleCodeScrollbarBackground = i52 + 14;
        key_chat_inArticleCodeScrollbar = i52 + 15;
        key_chat_outArticleCodeScrollbarBackground = i52 + 16;
        key_chat_outArticleCodeScrollbar = i52 + 17;
        key_chat_inArticleDetailsArrow = i52 + 18;
        key_chat_outArticleDetailsArrow = i52 + 19;
        key_chat_inArticleDetailsLine = i52 + 20;
        key_chat_outArticleDetailsLine = i52 + 21;
        myMessagesAccentExtraKeys = new int[]{i53};
        key_code_keyword = i52 + 22;
        key_code_operator = i52 + 23;
        key_code_constant = i52 + 24;
        key_code_string = i52 + 25;
        key_code_number = i52 + 26;
        key_code_comment = i52 + 27;
        int i54 = i52 + 29;
        key_code_function = i52 + 28;
        int i55 = i52 + 30;
        key_iv_background = i54;
        int i56 = i52 + 31;
        key_iv_backgroundGray = i55;
        int i57 = i52 + 32;
        key_iv_ab_progress = i56;
        key_iv_navigationBackground = i57;
        key_share_linkText = i52 + 33;
        key_share_linkBackground = i52 + 34;
        key_share_icon = i52 + 35;
        key_glass_defaultIcon = i52 + 36;
        key_glass_defaultText = i52 + 37;
        key_glass_targetMainTabs = i52 + 38;
        key_glass_targetMainTopPanel = i52 + 39;
        key_glass_tabSelected = i52 + 40;
        key_glass_tabSelectedText = i52 + 41;
        key_glass_tabUnselected = i52 + 42;
        key_botKeyboard_button_primary = i52 + 43;
        key_botKeyboard_button_danger = i52 + 44;
        key_botKeyboard_button_success = i52 + 45;
        key_telegram_color_dialogsLogo = i52 + 46;
        colorsCount = i52 + 48;
        key_telegram_color = i52 + 47;
        int i58 = colorsCount;
        colorsCount = i58 + 1;
        key_telegram_color_text = i58;
        defaultChatDrawables = new HashMap();
        defaultChatDrawableColorKeys = new HashMap();
        defaultChatPaints = new HashMap();
        defaultChatPaintColors = new HashMap();
        SparseIntArray sparseIntArray = new SparseIntArray();
        fallbackKeys = sparseIntArray;
        themeAccentExclusionKeys = new HashSet();
        hsvTemp1Local = new ThreadLocal();
        hsvTemp2Local = new ThreadLocal();
        hsvTemp3Local = new ThreadLocal();
        hsvTemp4Local = new ThreadLocal();
        hsvTemp5Local = new ThreadLocal();
        defaultColors = OKLCH.createDefaultColors();
        sparseIntArray.put(i54, key_windowBackgroundWhite);
        int i59 = key_windowBackgroundGray;
        sparseIntArray.put(i55, i59);
        sparseIntArray.put(i57, i59);
        sparseIntArray.put(key_bot_loadingIcon, key_groupcreate_spanBackground);
        sparseIntArray.put(key_gift_ribbon_soldout, key_text_RedBold);
        int i60 = key_featuredStickers_addButton;
        sparseIntArray.put(i56, i60);
        sparseIntArray.put(key_featuredStickers_addButton2, i60);
        sparseIntArray.put(key_dialogGiftsBackground, i59);
        int i61 = key_dialogGiftsTabText;
        int i62 = key_windowBackgroundWhiteGrayText2;
        sparseIntArray.put(i61, i62);
        sparseIntArray.put(key_chat_inQuote, key_featuredStickers_addButtonPressed);
        int i63 = key_chat_outQuote;
        int i64 = key_chat_outReplyLine;
        sparseIntArray.put(i63, i64);
        sparseIntArray.put(key_chat_outReplyLine2, i64);
        sparseIntArray.put(key_chat_inAdminText, key_chat_inTimeText);
        sparseIntArray.put(key_chat_inAdminSelectedText, key_chat_inTimeSelectedText);
        sparseIntArray.put(key_player_progressCachedBackground, key_player_progressBackground);
        sparseIntArray.put(key_chat_inAudioCacheSeekbar, key_chat_inAudioSeekbar);
        sparseIntArray.put(key_chat_outAudioCacheSeekbar, key_chat_outAudioSeekbar);
        sparseIntArray.put(key_chat_emojiSearchBackground, key_chat_emojiPanelStickerPackSelector);
        sparseIntArray.put(key_location_sendLiveLocationIcon, key_location_sendLocationIcon);
        sparseIntArray.put(key_changephoneinfo_image2, i60);
        sparseIntArray.put(key_graySectionText, i62);
        sparseIntArray.put(key_chat_inMediaIcon, key_chat_inBubble);
        sparseIntArray.put(key_chat_outMediaIcon, key_chat_outBubble);
        sparseIntArray.put(key_chat_inMediaIconSelected, key_chat_inBubbleSelected);
        sparseIntArray.put(key_chat_outMediaIconSelected, key_chat_outBubbleSelected);
        sparseIntArray.put(key_dialog_inlineProgressBackground, i59);
        sparseIntArray.put(key_dialog_inlineProgress, key_chats_menuItemIcon);
        SparseIntArray sparseIntArray2 = fallbackKeys;
        sparseIntArray2.put(key_groupcreate_spanDelete, key_chats_actionIcon);
        sparseIntArray2.put(key_sharedMedia_photoPlaceholder, i59);
        sparseIntArray2.put(key_chat_attachPollBackground, key_chat_attachAudioBackground);
        sparseIntArray2.put(key_chats_onlineCircle, key_windowBackgroundWhiteBlueText);
        int i65 = key_windowBackgroundWhiteBlueButton;
        int i66 = key_windowBackgroundWhiteValueText;
        sparseIntArray2.put(i65, i66);
        sparseIntArray2.put(key_windowBackgroundWhiteBlueIcon, i66);
        sparseIntArray2.put(key_undo_background, key_chat_gifSaveHintBackground);
        int i67 = key_undo_cancelColor;
        int i68 = key_chat_gifSaveHintText;
        sparseIntArray2.put(i67, i68);
        sparseIntArray2.put(key_undo_infoColor, i68);
        int i69 = key_windowBackgroundUnchecked;
        int i70 = key_windowBackgroundWhite;
        sparseIntArray2.put(i69, i70);
        sparseIntArray2.put(key_windowBackgroundChecked, i70);
        sparseIntArray2.put(key_switchTrackBlue, key_switchTrack);
        sparseIntArray2.put(key_switchTrackBlueChecked, key_switchTrackChecked);
        sparseIntArray2.put(key_switchTrackBlueThumb, i70);
        sparseIntArray2.put(key_switchTrackBlueThumbChecked, i70);
        sparseIntArray2.put(key_windowBackgroundCheckText, i70);
        sparseIntArray2.put(key_contextProgressInner4, key_contextProgressInner1);
        sparseIntArray2.put(key_contextProgressOuter4, key_contextProgressOuter1);
        int i71 = key_switchTrackBlueSelector;
        int i72 = key_listSelector;
        sparseIntArray2.put(i71, i72);
        sparseIntArray2.put(key_switchTrackBlueSelectorChecked, i72);
        sparseIntArray2.put(key_settings_listSelector, i72);
        int i73 = key_chat_emojiBottomPanelIcon;
        int i74 = key_chat_emojiPanelIcon;
        sparseIntArray2.put(i73, i74);
        sparseIntArray2.put(key_chat_emojiSearchIcon, i74);
        sparseIntArray2.put(key_chat_emojiPanelStickerSetNameHighlight, key_windowBackgroundWhiteBlueText4);
        sparseIntArray2.put(key_chat_emojiPanelStickerPackSelectorLine, key_chat_emojiPanelIconSelected);
        int i75 = key_sheet_scrollUp;
        int i76 = key_chat_emojiPanelStickerPackSelector;
        sparseIntArray2.put(i75, i76);
        sparseIntArray2.put(key_sheet_other, key_player_actionBarItems);
        sparseIntArray2.put(key_dialogSearchBackground, i76);
        sparseIntArray2.put(key_dialogSearchHint, i74);
        sparseIntArray2.put(key_dialogSearchIcon, i74);
        int i77 = key_dialogSearchText;
        int i78 = key_windowBackgroundWhiteBlackText;
        sparseIntArray2.put(i77, i78);
        SparseIntArray sparseIntArray3 = fallbackKeys;
        sparseIntArray3.put(key_buttonNeutral, key_chat_replyPanelLine);
        sparseIntArray3.put(key_buttonNeutralText, i78);
        int i79 = key_dialogFloatingButton;
        int i80 = key_dialogRoundCheckBox;
        sparseIntArray3.put(i79, i80);
        sparseIntArray3.put(key_dialogFloatingButtonPressed, i80);
        sparseIntArray3.put(key_dialogFloatingIcon, key_dialogRoundCheckBoxCheck);
        sparseIntArray3.put(key_dialogShadowLine, key_chat_emojiPanelShadowLine);
        sparseIntArray3.put(key_actionBarDefaultArchived, key_actionBarDefault);
        int i81 = key_actionBarDefaultArchivedSelector;
        int i82 = key_actionBarDefaultSelector;
        sparseIntArray3.put(i81, i82);
        sparseIntArray3.put(key_actionBarDefaultArchivedIcon, key_actionBarDefaultIcon);
        sparseIntArray3.put(key_actionBarDefaultArchivedTitle, i78);
        sparseIntArray3.put(key_actionBarDefaultArchivedSearch, key_actionBarDefaultSearch);
        sparseIntArray3.put(key_actionBarDefaultArchivedSearchPlaceholder, key_actionBarDefaultSearchPlaceholder);
        int i83 = key_chats_message_threeLines;
        int i84 = key_chats_message;
        sparseIntArray3.put(i83, i84);
        int i85 = key_chats_nameMessage_threeLines;
        int i86 = key_chats_nameMessage;
        sparseIntArray3.put(i85, i86);
        sparseIntArray3.put(key_chats_nameArchived, key_chats_name);
        sparseIntArray3.put(key_chats_nameMessageArchived, i86);
        sparseIntArray3.put(key_chats_nameMessageArchived_threeLines, i86);
        sparseIntArray3.put(key_chats_messageArchived, i84);
        int i87 = key_avatar_backgroundArchived;
        int i88 = key_chats_unreadCounterMuted;
        sparseIntArray3.put(i87, i88);
        int i89 = key_chats_archiveBackground;
        int i90 = key_chats_actionBackground;
        sparseIntArray3.put(i89, i90);
        sparseIntArray3.put(key_chats_archivePinBackground, i88);
        int i91 = key_chats_archiveIcon;
        int i92 = key_chats_actionIcon;
        sparseIntArray3.put(i91, i92);
        sparseIntArray3.put(key_chats_archiveText, i92);
        sparseIntArray3.put(key_actionBarDefaultSubmenuItemIcon, key_dialogIcon);
        sparseIntArray3.put(key_checkboxDisabled, i88);
        int i93 = key_chat_status;
        int i94 = key_actionBarDefaultSubtitle;
        sparseIntArray3.put(i93, i94);
        int i95 = key_chat_inGreenCall;
        int i96 = key_calls_callReceivedGreenIcon;
        sparseIntArray3.put(i95, i96);
        sparseIntArray3.put(key_chat_outGreenCall, i96);
        int i97 = key_actionBarTabActiveText;
        int i98 = key_actionBarDefaultTitle;
        sparseIntArray3.put(i97, i98);
        sparseIntArray3.put(key_actionBarTabUnactiveText, i94);
        SparseIntArray sparseIntArray4 = fallbackKeys;
        sparseIntArray4.put(key_actionBarTabLine, i98);
        sparseIntArray4.put(key_actionBarTabSelector, i82);
        sparseIntArray4.put(key_profile_status, key_avatar_subtitleInProfileBlue);
        sparseIntArray4.put(key_chats_menuTopBackgroundCats, key_avatar_backgroundActionBarBlue);
        sparseIntArray4.put(key_chat_outLinkSelectBackground, key_chat_linkSelectBackground);
        sparseIntArray4.put(key_actionBarDefaultSubmenuSeparator, key_windowBackgroundGray);
        int i99 = key_chat_attachPermissionImage;
        int i100 = key_dialogTextBlack;
        sparseIntArray4.put(i99, i100);
        sparseIntArray4.put(key_chat_attachPermissionMark, key_chat_sentError);
        sparseIntArray4.put(key_chat_attachPermissionText, i100);
        sparseIntArray4.put(key_chat_attachEmptyImage, key_emptyListPlaceholder);
        sparseIntArray4.put(key_actionBarBrowser, key_actionBarDefault);
        sparseIntArray4.put(key_chats_sentReadCheck, key_chats_sentCheck);
        sparseIntArray4.put(key_chat_outSentCheckRead, key_chat_outSentCheck);
        sparseIntArray4.put(key_chat_outSentCheckReadSelected, key_chat_outSentCheckSelected);
        sparseIntArray4.put(key_chats_archivePullDownBackground, i88);
        sparseIntArray4.put(key_chats_archivePullDownBackgroundActive, i90);
        sparseIntArray4.put(key_avatar_backgroundArchivedHidden, key_avatar_backgroundSaved);
        sparseIntArray4.put(key_featuredStickers_removeButtonText, key_featuredStickers_addButtonPressed);
        int i101 = key_dialogEmptyImage;
        int i102 = key_player_time;
        sparseIntArray4.put(i101, i102);
        sparseIntArray4.put(key_dialogEmptyText, i102);
        sparseIntArray4.put(key_location_actionIcon, i100);
        int i103 = key_location_actionActiveIcon;
        int i104 = key_windowBackgroundWhiteBlueText7;
        sparseIntArray4.put(i103, i104);
        sparseIntArray4.put(key_location_actionBackground, key_dialogBackground);
        sparseIntArray4.put(key_location_actionPressedBackground, key_dialogBackgroundGray);
        sparseIntArray4.put(key_location_sendLocationText, i104);
        sparseIntArray4.put(key_location_sendLiveLocationText, key_windowBackgroundWhiteGreenText);
        int i105 = key_chat_outTextSelectionHighlight;
        int i106 = key_chat_textSelectBackground;
        sparseIntArray4.put(i105, i106);
        sparseIntArray4.put(key_chat_inTextSelectionHighlight, i106);
        int i107 = key_chat_TextSelectionCursor;
        sparseIntArray4.put(i107, key_chat_messagePanelCursor);
        SparseIntArray sparseIntArray5 = fallbackKeys;
        sparseIntArray5.put(key_chat_outTextSelectionCursor, i107);
        int i108 = key_chat_inPollCorrectAnswer;
        int i109 = key_chat_attachLocationBackground;
        sparseIntArray5.put(i108, i109);
        sparseIntArray5.put(key_chat_outPollCorrectAnswer, i109);
        int i110 = key_chat_inPollWrongAnswer;
        int i111 = key_chat_attachAudioBackground;
        sparseIntArray5.put(i110, i111);
        sparseIntArray5.put(key_chat_outPollWrongAnswer, i111);
        sparseIntArray5.put(key_chat_editMediaButton, key_dialogFloatingButton);
        sparseIntArray5.put(key_chat_attachCheckBoxBackground, key_dialogRoundCheckBox);
        sparseIntArray5.put(key_pollCreateIcons, key_windowBackgroundWhiteGrayIcon);
        sparseIntArray5.put(key_profile_tabText, key_windowBackgroundWhiteGrayText);
        int i112 = key_profile_tabSelectedText;
        int i113 = key_windowBackgroundWhiteBlueHeader;
        sparseIntArray5.put(i112, i113);
        sparseIntArray5.put(key_profile_tabSelectedLine, i113);
        sparseIntArray5.put(key_profile_tabSelector, key_listSelector);
        sparseIntArray5.put(key_chat_attachContactText, key_chat_attachContactBackground);
        int i114 = key_chat_inPsaNameText;
        int i115 = key_avatar_nameInMessageGreen;
        sparseIntArray5.put(i114, i115);
        sparseIntArray5.put(key_chat_outPsaNameText, i115);
        sparseIntArray5.put(key_chat_outAdminText, key_chat_outTimeText);
        sparseIntArray5.put(key_chat_outAdminSelectedText, key_chat_outTimeSelectedText);
        int i116 = key_returnToCallMutedBackground;
        int i117 = key_windowBackgroundWhite;
        sparseIntArray5.put(i116, i117);
        int i118 = key_dialogSwipeRemove;
        int i119 = key_avatar_backgroundRed;
        sparseIntArray5.put(i118, i119);
        sparseIntArray5.put(key_chat_inReactionButtonBackground, key_chat_inLoader);
        sparseIntArray5.put(key_chat_outReactionButtonBackground, key_chat_outLoader);
        sparseIntArray5.put(key_chat_reactionServiceButtonBackgroundSelected, key_chat_outBubble);
        sparseIntArray5.put(key_chat_reactionServiceButtonTextSelected, key_chat_messageTextOut);
        int i120 = key_chat_inReactionButtonText;
        sparseIntArray5.put(i120, key_chat_inPreviewInstantText);
        sparseIntArray5.put(key_chat_outReactionButtonText, key_chat_outPreviewInstantText);
        sparseIntArray5.put(key_chat_inReactionButtonTextSelected, i117);
        sparseIntArray5.put(key_chat_outReactionButtonTextSelected, i117);
        sparseIntArray5.put(key_dialogReactionMentionBackground, key_voipgroup_mutedByAdminGradient2);
        SparseIntArray sparseIntArray6 = fallbackKeys;
        sparseIntArray6.put(key_topics_unreadCounter, key_chats_unreadCounter);
        sparseIntArray6.put(key_topics_unreadCounterMuted, key_chats_message);
        sparseIntArray6.put(key_avatar_background2Saved, key_avatar_backgroundSaved);
        sparseIntArray6.put(key_avatar_background2Red, i119);
        sparseIntArray6.put(key_avatar_background2Orange, key_avatar_backgroundOrange);
        sparseIntArray6.put(key_avatar_background2Violet, key_avatar_backgroundViolet);
        sparseIntArray6.put(key_avatar_background2Green, key_avatar_backgroundGreen);
        sparseIntArray6.put(key_avatar_background2Cyan, key_avatar_backgroundCyan);
        sparseIntArray6.put(key_avatar_background2Blue, key_avatar_backgroundBlue);
        sparseIntArray6.put(key_avatar_background2Pink, key_avatar_backgroundPink);
        sparseIntArray6.put(key_chats_date_bold, key_chats_date);
        sparseIntArray6.put(key_statisticChartLine_orange, key_color_orange);
        sparseIntArray6.put(key_statisticChartLine_blue, key_color_blue);
        sparseIntArray6.put(key_statisticChartLine_red, key_color_red);
        sparseIntArray6.put(key_statisticChartLine_lightblue, key_color_lightblue);
        sparseIntArray6.put(key_statisticChartLine_golden, key_color_yellow);
        int i121 = key_statisticChartLine_purple;
        int i122 = key_color_purple;
        sparseIntArray6.put(i121, i122);
        sparseIntArray6.put(key_statisticChartLine_indigo, i122);
        sparseIntArray6.put(key_statisticChartLine_cyan, key_color_cyan);
        int i123 = key_actionBarActionModeReaction;
        int i124 = key_windowBackgroundGray;
        sparseIntArray6.put(i123, i124);
        sparseIntArray6.put(key_actionBarActionModeReactionText, i120);
        int i125 = key_table_background;
        sparseIntArray6.put(i125, key_graySection);
        int i126 = key_table_border;
        sparseIntArray6.put(i126, key_divider);
        sparseIntArray6.put(key_chat_inTableBackground, i125);
        int i127 = key_chat_outTableBackground;
        int i128 = key_chat_outCodeBackground;
        sparseIntArray6.put(i127, i128);
        sparseIntArray6.put(key_chat_inTableBorder, i126);
        sparseIntArray6.put(key_chat_outTableBorder, i126);
        sparseIntArray6.put(key_chat_outArticleCodeBackground, i128);
        SparseIntArray sparseIntArray7 = fallbackKeys;
        int i129 = key_share_icon;
        int i130 = key_windowBackgroundWhiteBlackText;
        sparseIntArray7.put(i129, i130);
        sparseIntArray7.put(key_share_linkBackground, i124);
        sparseIntArray7.put(key_share_linkText, i130);
        sparseIntArray7.put(key_glass_defaultIcon, key_chat_messagePanelIcons);
        sparseIntArray7.put(key_glass_defaultText, key_chat_messagePanelText);
        int i131 = key_glass_targetMainTabs;
        int i132 = key_dialogBackground;
        sparseIntArray7.put(i131, i132);
        sparseIntArray7.put(key_glass_targetMainTopPanel, i132);
        int i133 = key_glass_tabSelected;
        int i134 = key_chat_messagePanelSend;
        sparseIntArray7.put(i133, i134);
        sparseIntArray7.put(key_glass_tabSelectedText, i134);
        sparseIntArray7.put(key_glass_tabUnselected, i130);
        sparseIntArray7.put(key_actionBarDefaultTitle, i130);
        sparseIntArray7.put(key_telegram_color_dialogsLogo, i130);
        sparseIntArray7.put(key_profile_title, i130);
        sparseIntArray7.put(key_telegram_color, i134);
        int i135 = key_telegram_color_text;
        sparseIntArray7.put(i135, key_windowBackgroundWhiteBlueText4);
        sparseIntArray7.put(key_chat_msgIvButtonDefaultInText, key_chat_messageTextIn);
        int i136 = key_chat_msgIvButtonPrimaryIn;
        int i137 = key_featuredStickers_addButton;
        sparseIntArray7.put(i136, i137);
        int i138 = key_chat_msgIvButtonPrimaryInPressed;
        int i139 = key_featuredStickers_addButtonPressed;
        sparseIntArray7.put(i138, i139);
        int i140 = key_chat_msgIvButtonPrimaryInText;
        int i141 = key_featuredStickers_buttonText;
        sparseIntArray7.put(i140, i141);
        int i142 = key_chat_msgIvButtonDangerInText;
        int i143 = key_avatar_nameInMessageRed;
        sparseIntArray7.put(i142, i143);
        int i144 = key_chat_msgIvButtonSuccessInText;
        int i145 = key_avatar_nameInMessageGreen;
        sparseIntArray7.put(i144, i145);
        sparseIntArray7.put(key_chat_msgIvButtonDefaultInlineInText, i135);
        sparseIntArray7.put(key_chat_msgIvButtonDefaultOutText, key_chat_messageTextOut);
        sparseIntArray7.put(key_chat_msgIvButtonPrimaryOut, i137);
        sparseIntArray7.put(key_chat_msgIvButtonPrimaryOutPressed, i139);
        sparseIntArray7.put(key_chat_msgIvButtonPrimaryOutText, i141);
        sparseIntArray7.put(key_chat_msgIvButtonDangerOutText, i143);
        sparseIntArray7.put(key_chat_msgIvButtonSuccessOutText, i145);
        sparseIntArray7.put(key_chat_msgIvButtonDefaultInlineOutText, i135);
        int i146 = 0;
        while (true) {
            int[] iArr = keys_avatar_background;
            if (i146 >= iArr.length) {
                break;
            }
            themeAccentExclusionKeys.add(Integer.valueOf(iArr[i146]));
            i146++;
        }
        int i147 = 0;
        while (true) {
            int[] iArr2 = keys_avatar_background2;
            if (i147 >= iArr2.length) {
                break;
            }
            themeAccentExclusionKeys.add(Integer.valueOf(iArr2[i147]));
            i147++;
        }
        int i148 = 0;
        while (true) {
            int[] iArr3 = keys_avatar_nameInMessage;
            if (i148 >= iArr3.length) {
                break;
            }
            themeAccentExclusionKeys.add(Integer.valueOf(iArr3[i148]));
            i148++;
        }
        int i149 = 0;
        while (true) {
            int[] iArr4 = keys_colors;
            if (i149 >= iArr4.length) {
                break;
            }
            themeAccentExclusionKeys.add(Integer.valueOf(iArr4[i149]));
            i149++;
        }
        HashSet hashSet = themeAccentExclusionKeys;
        hashSet.add(Integer.valueOf(key_chat_attachGalleryBackground));
        hashSet.add(Integer.valueOf(key_statisticChartLine_blue));
        hashSet.add(Integer.valueOf(key_statisticChartLine_green));
        hashSet.add(Integer.valueOf(key_statisticChartLine_red));
        hashSet.add(Integer.valueOf(key_statisticChartLine_golden));
        hashSet.add(Integer.valueOf(key_statisticChartLine_lightblue));
        hashSet.add(Integer.valueOf(key_statisticChartLine_lightgreen));
        hashSet.add(Integer.valueOf(key_statisticChartLine_orange));
        hashSet.add(Integer.valueOf(key_statisticChartLine_indigo));
        hashSet.add(Integer.valueOf(key_chat_inCodeBackground));
        hashSet.add(Integer.valueOf(key_chat_inTableBackground));
        hashSet.add(Integer.valueOf(key_chat_outTableBackground));
        hashSet.add(Integer.valueOf(key_chat_inTableBorder));
        hashSet.add(Integer.valueOf(key_chat_outTableBorder));
        hashSet.add(Integer.valueOf(key_chat_inDivider));
        hashSet.add(Integer.valueOf(key_chat_inArticleCodeBackground));
        hashSet.add(Integer.valueOf(key_chat_outArticleCodeBackground));
        hashSet.add(Integer.valueOf(key_chat_inArticleCodeScrollbarBackground));
        hashSet.add(Integer.valueOf(key_chat_inArticleCodeScrollbar));
        hashSet.add(Integer.valueOf(key_chat_outArticleCodeScrollbarBackground));
        hashSet.add(Integer.valueOf(key_chat_outArticleCodeScrollbar));
        hashSet.add(Integer.valueOf(key_chat_inArticleDetailsArrow));
        hashSet.add(Integer.valueOf(key_chat_outArticleDetailsArrow));
        hashSet.add(Integer.valueOf(key_chat_inArticleDetailsLine));
        hashSet.add(Integer.valueOf(key_chat_outArticleDetailsLine));
        hashSet.add(Integer.valueOf(key_voipgroup_checkMenu));
        hashSet.add(Integer.valueOf(key_voipgroup_muteButton));
        hashSet.add(Integer.valueOf(key_voipgroup_muteButton2));
        hashSet.add(Integer.valueOf(key_voipgroup_muteButton3));
        hashSet.add(Integer.valueOf(key_voipgroup_searchText));
        hashSet.add(Integer.valueOf(key_voipgroup_searchPlaceholder));
        hashSet.add(Integer.valueOf(key_voipgroup_searchBackground));
        hashSet.add(Integer.valueOf(key_voipgroup_leaveCallMenu));
        hashSet.add(Integer.valueOf(key_voipgroup_scrollUp));
        hashSet.add(Integer.valueOf(key_voipgroup_soundButton));
        hashSet.add(Integer.valueOf(key_voipgroup_soundButtonActive));
        hashSet.add(Integer.valueOf(key_voipgroup_soundButtonActiveScrolled));
        hashSet.add(Integer.valueOf(key_voipgroup_soundButton2));
        hashSet.add(Integer.valueOf(key_voipgroup_soundButtonActive2));
        hashSet.add(Integer.valueOf(key_voipgroup_soundButtonActive2Scrolled));
        hashSet.add(Integer.valueOf(key_voipgroup_leaveButton));
        hashSet.add(Integer.valueOf(key_voipgroup_leaveButtonScrolled));
        hashSet.add(Integer.valueOf(key_voipgroup_connectingProgress));
        hashSet.add(Integer.valueOf(key_voipgroup_disabledButton));
        hashSet.add(Integer.valueOf(key_voipgroup_rtmpButton));
        hashSet.add(Integer.valueOf(key_voipgroup_disabledButtonActive));
        hashSet.add(Integer.valueOf(key_voipgroup_disabledButtonActiveScrolled));
        hashSet.add(Integer.valueOf(key_voipgroup_unmuteButton));
        hashSet.add(Integer.valueOf(key_voipgroup_unmuteButton2));
        HashSet hashSet2 = themeAccentExclusionKeys;
        hashSet2.add(Integer.valueOf(key_voipgroup_actionBarUnscrolled));
        hashSet2.add(Integer.valueOf(key_voipgroup_listViewBackgroundUnscrolled));
        hashSet2.add(Integer.valueOf(key_voipgroup_lastSeenTextUnscrolled));
        hashSet2.add(Integer.valueOf(key_voipgroup_mutedIconUnscrolled));
        hashSet2.add(Integer.valueOf(key_voipgroup_actionBar));
        hashSet2.add(Integer.valueOf(key_voipgroup_actionBarItems));
        hashSet2.add(Integer.valueOf(key_voipgroup_actionBarItemsSelector));
        hashSet2.add(Integer.valueOf(key_voipgroup_mutedByAdminIcon));
        hashSet2.add(Integer.valueOf(key_voipgroup_mutedIcon));
        hashSet2.add(Integer.valueOf(key_voipgroup_lastSeenText));
        hashSet2.add(Integer.valueOf(key_voipgroup_nameText));
        hashSet2.add(Integer.valueOf(key_voipgroup_listViewBackground));
        hashSet2.add(Integer.valueOf(key_voipgroup_listeningText));
        hashSet2.add(Integer.valueOf(key_voipgroup_speakingText));
        hashSet2.add(Integer.valueOf(key_voipgroup_listSelector));
        hashSet2.add(Integer.valueOf(key_voipgroup_inviteMembersBackground));
        hashSet2.add(Integer.valueOf(key_voipgroup_dialogBackground));
        hashSet2.add(Integer.valueOf(key_voipgroup_overlayGreen1));
        hashSet2.add(Integer.valueOf(key_voipgroup_overlayGreen2));
        hashSet2.add(Integer.valueOf(key_voipgroup_overlayBlue1));
        hashSet2.add(Integer.valueOf(key_voipgroup_overlayBlue2));
        hashSet2.add(Integer.valueOf(key_voipgroup_topPanelGreen1));
        hashSet2.add(Integer.valueOf(key_voipgroup_topPanelGreen2));
        hashSet2.add(Integer.valueOf(key_voipgroup_topPanelBlue1));
        hashSet2.add(Integer.valueOf(key_voipgroup_topPanelBlue2));
        hashSet2.add(Integer.valueOf(key_voipgroup_topPanelGray));
        hashSet2.add(Integer.valueOf(key_voipgroup_overlayAlertGradientMuted));
        hashSet2.add(Integer.valueOf(key_voipgroup_overlayAlertGradientMuted2));
        hashSet2.add(Integer.valueOf(key_voipgroup_overlayAlertGradientUnmuted));
        hashSet2.add(Integer.valueOf(key_voipgroup_overlayAlertGradientUnmuted2));
        hashSet2.add(Integer.valueOf(key_voipgroup_overlayAlertMutedByAdmin));
        hashSet2.add(Integer.valueOf(key_voipgroup_overlayAlertMutedByAdmin2));
        hashSet2.add(Integer.valueOf(key_voipgroup_mutedByAdminGradient));
        hashSet2.add(Integer.valueOf(key_voipgroup_mutedByAdminGradient2));
        hashSet2.add(Integer.valueOf(key_voipgroup_mutedByAdminGradient3));
        hashSet2.add(Integer.valueOf(key_voipgroup_mutedByAdminMuteButton));
        hashSet2.add(Integer.valueOf(key_voipgroup_mutedByAdminMuteButtonDisabled));
        hashSet2.add(Integer.valueOf(key_voipgroup_windowBackgroundWhiteInputField));
        hashSet2.add(Integer.valueOf(key_voipgroup_windowBackgroundWhiteInputFieldActivated));
        hashSet2.add(Integer.valueOf(key_premiumGradient0));
        hashSet2.add(Integer.valueOf(key_premiumGradient1));
        hashSet2.add(Integer.valueOf(key_premiumGradient2));
        hashSet2.add(Integer.valueOf(key_premiumGradient3));
        hashSet2.add(Integer.valueOf(key_premiumGradient4));
        hashSet2.add(Integer.valueOf(key_premiumGradientBackground1));
        hashSet2.add(Integer.valueOf(key_premiumGradientBackground2));
        hashSet2.add(Integer.valueOf(key_premiumGradientBackground3));
        hashSet2.add(Integer.valueOf(key_premiumGradientBackground4));
        hashSet2.add(Integer.valueOf(key_premiumStartSmallStarsColor));
        HashSet hashSet3 = themeAccentExclusionKeys;
        hashSet3.add(Integer.valueOf(key_premiumStarGradient1));
        hashSet3.add(Integer.valueOf(key_premiumStarGradient2));
        hashSet3.add(Integer.valueOf(key_stories_circle1));
        hashSet3.add(Integer.valueOf(key_stories_circle2));
        hashSet3.add(Integer.valueOf(key_stories_circle_dialog1));
        hashSet3.add(Integer.valueOf(key_stories_circle_dialog2));
        hashSet3.add(Integer.valueOf(key_stories_circle_closeFriends1));
        hashSet3.add(Integer.valueOf(key_stories_circle_closeFriends2));
        ArrayList arrayList3 = new ArrayList();
        themes = arrayList3;
        otherThemes = new ArrayList();
        HashMap map = new HashMap();
        themesDict = map;
        currentColorsNoAccent = new SparseIntArray();
        currentColors = new SparseIntArray();
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        ThemeInfo themeInfo3 = new ThemeInfo();
        themeInfo3.name = "Blue";
        themeInfo3.assetName = "bluebubbles.attheme";
        themeInfo3.previewBackgroundColor = -6963476;
        themeInfo3.previewInColor = -1;
        themeInfo3.previewOutColor = -3086593;
        themeInfo3.firstAccentIsDefault = true;
        themeInfo3.currentAccentId = DEFALT_THEME_ACCENT_ID;
        themeInfo3.sortIndex = 1;
        ThemeInfo.access$2400(themeInfo3, new int[]{-10972987, -14444461, -3252606, -8428605, -14380627, -14050257, -7842636, -13464881, -12342073, -11359164, -3317869, -2981834, -8165684, -3256745, -2904512, -8681301}, new int[]{-4660851, -328756, -1572, -4108434, -3031781, -1335, -198952, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, -853047, -264993, 0, 0, -135756, -198730, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, -2104672, -937328, -2637335, -2639714, -1270157, -3428124, -6570777, -7223828, -6567550, -1793599, -1855875, -4674838, -1336199, -2900876, -6247730}, new int[]{0, -4532067, -1257580, -1524266, -1646910, -1519483, -1324823, -4138509, -4202516, -2040429, -1458474, -1256030, -3814930, -1000039, -1450082, -3485987}, new int[]{0, -1909081, -1592444, -2969879, -2439762, -1137033, -2119471, -6962197, -4857383, -4270699, -3364639, -2117514, -5000734, -1598028, -2045813, -5853742}, new int[]{0, -6371440, -1319256, -1258616, -1712961, -1186647, -1193816, -4467224, -4203544, -3023977, -1061929, -1255788, -2113811, -806526, -1715305, -3485976}, new int[]{99, 9, 10, 11, 12, 13, 14, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new String[]{"", "p-pXcflrmFIBAAAAvXYQk-mCwZU", "JqSUrO0-mFIBAAAAWwTvLzoWGQI", "O-wmAfBPSFADAAAA4zINVfD_bro", "RepJ5uE_SVABAAAAr4d0YhgB850", "-Xc-np9y2VMCAAAARKr0yNNPYW0", "fqv01SQemVIBAAAApND8LDRUhRU", "fqv01SQemVIBAAAApND8LDRUhRU", "RepJ5uE_SVABAAAAr4d0YhgB850", "lp0prF8ISFAEAAAA_p385_CvG0w", "heptcj-hSVACAAAAC9RrMzOa-cs", "PllZ-bf_SFAEAAAA8crRfwZiDNg", "dhf9pceaQVACAAAAbzdVo4SCiZA", "Ujx2TFcJSVACAAAARJ4vLa50MkM", "p-pXcflrmFIBAAAAvXYQk-mCwZU", "dk_wwlghOFACAAAAfz9xrxi6euw"}, new int[]{0, 180, 45, 0, 45, 180, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 52, 46, 57, 45, 64, 52, 35, 36, 41, 50, 50, 35, 38, 37, 30});
        sortAccents(themeInfo3);
        defaultTheme = themeInfo3;
        currentDayTheme = themeInfo3;
        arrayList3.add(themeInfo3);
        map.put("Blue", themeInfo3);
        ThemeInfo themeInfo4 = new ThemeInfo();
        themeInfo4.name = "Dark Blue";
        themeInfo4.assetName = "darkblue.attheme";
        themeInfo4.previewBackgroundColor = -10523006;
        themeInfo4.previewInColor = -9009508;
        themeInfo4.previewOutColor = -8214301;
        themeInfo4.sortIndex = 3;
        ThemeInfo.access$2400(themeInfo4, new int[]{-7177260, -9860357, -14440464, -8687151, -9848491, -14053142, -9403671, -10044691, -13203974, -12138259, -10179489, -1344335, -1142742, -6127120, -2931932, -1131212, -8417365, -13270557}, new int[]{-6464359, -10267323, -13532789, -5413850, -11898828, -13410942, -13215889, -10914461, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-10465880, -9937588, -14983040, -6736562, -14197445, -13534568, -13144441, -10587280, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-14213586, -15263198, -16310753, -15724781, -15853551, -16051428, -14868183, -14668758, -15854566, -15326427, -15327979, -14411490, -14345453, -14738135, -14543346, -14212843, -15263205, -15854566}, new int[]{-15659501, -14277074, -15459034, -14542297, -14735336, -15129808, -15591910, -15459810, -15260623, -15853800, -15259879, -14477540, -14674936, -15461604, -13820650, -15067635, -14605528, -15260623}, new int[]{-13951445, -15395557, -15985382, -15855853, -16050417, -15525854, -15260627, -15327189, -15788258, -14799314, -15458796, -13952727, -13754603, -14081231, -14478324, -14081004, -15197667, -15788258}, new int[]{-15330777, -15066858, -15915220, -14213847, -15262439, -15260879, -15657695, -16443625, -15459285, -15589601, -14932454, -14740451, -15002870, -15264997, -13821660, -14805234, -14605784, -15459285}, new int[]{11, 12, 13, 14, 15, 16, 17, 18, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, new String[]{"O-wmAfBPSFADAAAA4zINVfD_bro", "RepJ5uE_SVABAAAAr4d0YhgB850", "dk_wwlghOFACAAAAfz9xrxi6euw", "9LW_RcoOSVACAAAAFTk3DTyXN-M", "PllZ-bf_SFAEAAAA8crRfwZiDNg", "-Xc-np9y2VMCAAAARKr0yNNPYW0", "kO4jyq55SFABAAAA0WEpcLfahXk", "CJNyxPMgSVAEAAAAvW9sMwc51cw", "fqv01SQemVIBAAAApND8LDRUhRU", "RepJ5uE_SVABAAAAr4d0YhgB850", "CJNyxPMgSVAEAAAAvW9sMwc51cw", "9LW_RcoOSVACAAAAFTk3DTyXN-M", "9GcNVISdSVADAAAAUcw5BYjELW4", "F5oWoCs7QFACAAAAgf2bD_mg8Bw", "9ShF73d1MFIIAAAAjWnm8_ZMe8Q", "3rX-PaKbSFACAAAAEiHNvcEm6X4", "dk_wwlghOFACAAAAfz9xrxi6euw", "fqv01SQemVIBAAAApND8LDRUhRU"}, new int[]{225, 45, 225, 135, 45, 225, 45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{40, 40, 31, 50, 25, 34, 35, 35, 38, 29, 24, 34, 34, 31, 29, 37, 21, 38});
        sortAccents(themeInfo4);
        arrayList3.add(themeInfo4);
        currentNightTheme = themeInfo4;
        map.put("Dark Blue", themeInfo4);
        ThemeInfo themeInfo5 = new ThemeInfo();
        themeInfo5.name = "Arctic Blue";
        themeInfo5.assetName = "arctic.attheme";
        themeInfo5.previewBackgroundColor = -1971728;
        themeInfo5.previewInColor = -1;
        themeInfo5.previewOutColor = -9657877;
        themeInfo5.sortIndex = 5;
        ThemeInfo.access$2400(themeInfo5, new int[]{-12537374, -12472227, -3240928, -11033621, -2194124, -3382903, -13332245, -12342073, -11359164, -3317869, -2981834, -8165684, -3256745, -2904512, -8681301}, new int[]{-13525046, -14113959, -7579073, -13597229, -3581840, -8883763, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-11616542, -9716647, -6400452, -12008744, -2592697, -4297041, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-3808528, -2433367, -2700891, -1838093, -1120848, -1712148, -2037779, -4202261, -4005713, -1058332, -925763, -1975316, -1189672, -1318451, -2302235}, new int[]{-1510157, -4398164, -1647697, -3610898, -1130838, -1980692, -4270093, -4202261, -3415654, -1259815, -1521765, -4341268, -1127744, -1318219, -3945761}, new int[]{-4924688, -3283031, -1523567, -2494477, -1126510, -595210, -2037517, -3478548, -4661623, -927514, -796762, -2696971, -1188403, -1319735, -1577487}, new int[]{-3149585, -5714021, -1978209, -4925720, -1134713, -1718833, -3613709, -5317397, -3218014, -999207, -2116466, -4343054, -931397, -1583186, -3815718}, new int[]{9, 10, 11, 12, 13, 14, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new String[]{"MIo6r0qGSFAFAAAAtL8TsDzNX60", "dhf9pceaQVACAAAAbzdVo4SCiZA", "fqv01SQemVIBAAAApND8LDRUhRU", "p-pXcflrmFIBAAAAvXYQk-mCwZU", "JqSUrO0-mFIBAAAAWwTvLzoWGQI", "F5oWoCs7QFACAAAAgf2bD_mg8Bw", "fqv01SQemVIBAAAApND8LDRUhRU", "RepJ5uE_SVABAAAAr4d0YhgB850", "PllZ-bf_SFAEAAAA8crRfwZiDNg", "pgJfpFNRSFABAAAACDT8s5sEjfc", "ptuUd96JSFACAAAATobI23sPpz0", "dhf9pceaQVACAAAAbzdVo4SCiZA", "JqSUrO0-mFIBAAAAWwTvLzoWGQI", "9iklpvIPQVABAAAAORQXKur_Eyc", "F5oWoCs7QFACAAAAgf2bD_mg8Bw"}, new int[]{315, 315, 225, 315, 0, 180, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{50, 50, 58, 47, 46, 50, 49, 46, 51, 50, 49, 34, 54, 50, 40});
        sortAccents(themeInfo5);
        arrayList3.add(themeInfo5);
        map.put("Arctic Blue", themeInfo5);
        ThemeInfo themeInfo6 = new ThemeInfo();
        themeInfo6.name = "Day";
        themeInfo6.assetName = "day.attheme";
        themeInfo6.previewBackgroundColor = -1;
        themeInfo6.previewInColor = -1315084;
        themeInfo6.previewOutColor = -8604930;
        themeInfo6.sortIndex = 2;
        ThemeInfo.access$2400(themeInfo6, new int[]{-11099447, -3379581, -3109305, -3382174, -7963438, -11759137, -11029287, -11226775, -2506945, -3382174, -3379581, -6587438, -2649788, -8681301}, new int[]{-10125092, -9671214, -3451775, -3978678, -10711329, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-12664362, -3642988, -2383569, -3109317, -11422261, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, null, null, new int[]{9, 10, 11, 12, 13, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new String[]{"", "", "", "", "", "", "", "", "", "", "", "", "", ""}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        sortAccents(themeInfo6);
        arrayList3.add(themeInfo6);
        map.put("Day", themeInfo6);
        ThemeInfo themeInfo7 = new ThemeInfo();
        themeInfo7.name = "Night";
        themeInfo7.assetName = "night.attheme";
        themeInfo7.previewBackgroundColor = -11315623;
        themeInfo7.previewInColor = -9143676;
        themeInfo7.previewOutColor = -9067802;
        themeInfo7.sortIndex = 4;
        ThemeInfo.access$2400(themeInfo7, new int[]{-9781697, -7505693, -2204034, -10913816, -2375398, -12678921, -11881005, -11880383, -2534026, -1934037, -7115558, -3128522, -1528292, -8812381}, new int[]{-7712108, -4953061, -5288081, -14258547, -9154889, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-9939525, -5948598, -10335844, -13659747, -14054507, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{-15330532, -14806760, -15791344, -16184308, -16313063, -15921641, -15656164, -15986420, -15856883, -14871025, -16185078, -14937584, -14869736, -15855598}, new int[]{-14673881, -15724781, -15002342, -15458526, -15987697, -16184820, -16118258, -16250616, -15067624, -15527923, -14804447, -15790836, -15987960, -16316665}, new int[]{-15856877, -14608861, -15528430, -15921391, -15722209, -15197144, -15458015, -15591406, -15528431, -15068401, -16053749, -15594229, -15395825, -15724012}, new int[]{-14804694, -15658986, -14609382, -15656421, -16118509, -15855854, -16315381, -16052981, -14544354, -15791092, -15659241, -16316922, -15988214, -16185077}, new int[]{9, 10, 11, 12, 13, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new String[]{"YIxYGEALQVADAAAAA3QbEH0AowY", "9LW_RcoOSVACAAAAFTk3DTyXN-M", "O-wmAfBPSFADAAAA4zINVfD_bro", "F5oWoCs7QFACAAAAgf2bD_mg8Bw", "-Xc-np9y2VMCAAAARKr0yNNPYW0", "fqv01SQemVIBAAAApND8LDRUhRU", "F5oWoCs7QFACAAAAgf2bD_mg8Bw", "ptuUd96JSFACAAAATobI23sPpz0", "p-pXcflrmFIBAAAAvXYQk-mCwZU", "Nl8Pg2rBQVACAAAA25Lxtb8SDp0", "dhf9pceaQVACAAAAbzdVo4SCiZA", "9GcNVISdSVADAAAAUcw5BYjELW4", "9LW_RcoOSVACAAAAFTk3DTyXN-M", "dk_wwlghOFACAAAAfz9xrxi6euw"}, new int[]{45, 135, 0, 180, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{34, 47, 52, 48, 54, 50, 37, 56, 48, 49, 40, 64, 38, 48});
        sortAccents(themeInfo7);
        arrayList3.add(themeInfo7);
        map.put("Night", themeInfo7);
        String string = sharedPreferences.getString("themes2", null);
        int i150 = 1;
        if (sharedPreferences.getInt("remote_version", 0) == 1) {
            int i151 = 0;
            while (i151 < 4) {
                long[] jArr = remoteThemesHash;
                StringBuilder sb = new StringBuilder("2remoteThemesHash");
                sb.append(i151 != 0 ? Integer.valueOf(i151) : "");
                jArr[i151] = sharedPreferences.getLong(sb.toString(), 0L);
                int[] iArr5 = lastLoadingThemesTime;
                StringBuilder sb2 = new StringBuilder("lastLoadingThemesTime");
                sb2.append(i151 != 0 ? Integer.valueOf(i151) : "");
                iArr5[i151] = sharedPreferences.getInt(sb2.toString(), 0);
                i151++;
            }
            i150 = 1;
        }
        sharedPreferences.edit().putInt("remote_version", i150).apply();
        if (TextUtils.isEmpty(string)) {
            String string2 = sharedPreferences.getString("themes", null);
            if (!TextUtils.isEmpty(string2)) {
                for (String str : string2.split("&")) {
                    ThemeInfo themeInfoCreateWithString = ThemeInfo.createWithString(str);
                    if (themeInfoCreateWithString != null) {
                        otherThemes.add(themeInfoCreateWithString);
                        themes.add(themeInfoCreateWithString);
                        themesDict.put(themeInfoCreateWithString.getKey(), themeInfoCreateWithString);
                    }
                }
                saveOtherThemes(true, true);
                sharedPreferences.edit().remove("themes").commit();
            }
        } else {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i152 = 0; i152 < jSONArray.length(); i152++) {
                    ThemeInfo themeInfoCreateWithJson = ThemeInfo.createWithJson(jSONArray.getJSONObject(i152));
                    if (themeInfoCreateWithJson != null) {
                        otherThemes.add(themeInfoCreateWithJson);
                        themes.add(themeInfoCreateWithJson);
                        themesDict.put(themeInfoCreateWithJson.getKey(), themeInfoCreateWithJson);
                        ThemeInfo.access$2500(themeInfoCreateWithJson, sharedPreferences);
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        Collections.sort(themes, new Theme$$ExternalSyntheticLambda5(0));
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        try {
            HashMap map2 = themesDict;
            ThemeInfo themeInfo8 = (ThemeInfo) map2.get("Dark Blue");
            String string3 = globalMainSettings.getString("theme", null);
            if ("Default".equals(string3)) {
                themeInfo = (ThemeInfo) map2.get("Blue");
                themeInfo.currentAccentId = DEFALT_THEME_ACCENT_ID;
            } else if ("Dark".equals(string3)) {
                themeInfo8.currentAccentId = 9;
                themeInfo = themeInfo8;
            } else if (string3 != null) {
                themeInfo = (ThemeInfo) map2.get(string3);
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
                themeInfo = (ThemeInfo) map2.get("Blue");
                themeInfo.currentAccentId = DEFALT_THEME_ACCENT_ID;
            } else if ("Dark".equals(string4)) {
                currentNightTheme = themeInfo8;
                themeInfo8.currentAccentId = 9;
            } else if (string4 != null && (themeInfo2 = (ThemeInfo) map2.get(string4)) != null) {
                currentNightTheme = themeInfo2;
            }
            if (currentNightTheme != null && !sharedPreferences.contains("lastDarkTheme")) {
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                editorEdit2.putString("lastDarkTheme", currentNightTheme.getKey());
                editorEdit2.commit();
            }
            SharedPreferences.Editor editorEdit3 = null;
            SharedPreferences.Editor editorEdit4 = null;
            for (ThemeInfo themeInfo9 : map2.values()) {
                if (themeInfo9.assetName == null || themeInfo9.accentBaseColor == 0) {
                    editorEdit3 = editorEdit3;
                } else {
                    String string5 = sharedPreferences.getString("accents_" + themeInfo9.assetName, null);
                    themeInfo9.currentAccentId = sharedPreferences.getInt("accent_current_" + themeInfo9.assetName, themeInfo9.firstAccentIsDefault ? DEFALT_THEME_ACCENT_ID : 0);
                    ArrayList arrayList4 = new ArrayList();
                    if (TextUtils.isEmpty(string5)) {
                        editor = editorEdit3;
                        arrayList = arrayList4;
                        String str2 = "accent_for_" + themeInfo9.assetName;
                        int i153 = globalMainSettings.getInt(str2, 0);
                        if (i153 != 0) {
                            if (editor == null) {
                                editorEdit3 = globalMainSettings.edit();
                                editorEdit4 = sharedPreferences.edit();
                            } else {
                                editorEdit3 = editor;
                            }
                            editorEdit3.remove(str2);
                            int size = themeInfo9.themeAccents.size();
                            int i154 = 0;
                            while (true) {
                                if (i154 >= size) {
                                    ThemeAccent themeAccent = new ThemeAccent();
                                    themeAccent.id = 100;
                                    themeAccent.accentColor = i153;
                                    themeAccent.parentTheme = themeInfo9;
                                    themeInfo9.themeAccentsMap.put(100, themeAccent);
                                    arrayList.add(0, themeAccent);
                                    themeInfo9.currentAccentId = 100;
                                    themeInfo9.lastAccentId = 101;
                                    SerializedData serializedData = new SerializedData(72);
                                    serializedData.writeInt32(9);
                                    serializedData.writeInt32(1);
                                    serializedData.writeInt32(themeAccent.id);
                                    serializedData.writeInt32(themeAccent.accentColor);
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
                                    serializedData.writeBool(false);
                                    editorEdit4.putString("accents_" + themeInfo9.assetName, Base64.encodeToString(serializedData.toByteArray(), 3));
                                    break;
                                }
                                ThemeAccent themeAccent2 = (ThemeAccent) themeInfo9.themeAccents.get(i154);
                                if (themeAccent2.accentColor == i153) {
                                    themeInfo9.currentAccentId = themeAccent2.id;
                                    break;
                                }
                                i154++;
                            }
                            editorEdit4.putInt("accent_current_" + themeInfo9.assetName, themeInfo9.currentAccentId);
                        }
                        if (!arrayList.isEmpty()) {
                            themeInfo9.themeAccents.addAll(0, arrayList);
                            sortAccents(themeInfo9);
                        }
                        sparseArray = themeInfo9.themeAccentsMap;
                        if (sparseArray != null && sparseArray.get(themeInfo9.currentAccentId) == null) {
                            if (themeInfo9.firstAccentIsDefault) {
                                i = DEFALT_THEME_ACCENT_ID;
                            } else {
                                i = 0;
                            }
                            themeInfo9.currentAccentId = i;
                        }
                        ThemeInfo.access$2500(themeInfo9, sharedPreferences);
                        accent = themeInfo9.getAccent(false);
                        if (accent != null) {
                            themeInfo9.overrideWallpaper = accent.overrideWallpaper;
                        }
                    } else {
                        try {
                            SerializedData serializedData2 = new SerializedData(Base64.decode(string5, i2));
                            boolean z2 = true;
                            int int32 = serializedData2.readInt32(true);
                            int int33 = serializedData2.readInt32(true);
                            int i155 = 0;
                            while (i155 < int33) {
                                try {
                                    ThemeAccent themeAccent3 = new ThemeAccent();
                                    themeAccent3.id = serializedData2.readInt32(z2);
                                    themeAccent3.accentColor = serializedData2.readInt32(z2);
                                    if (int32 >= 9) {
                                        themeAccent3.accentColor2 = serializedData2.readInt32(z2);
                                    }
                                    themeAccent3.parentTheme = themeInfo9;
                                    themeAccent3.myMessagesAccentColor = serializedData2.readInt32(true);
                                    themeAccent3.myMessagesGradientAccentColor1 = serializedData2.readInt32(true);
                                    if (int32 >= 7) {
                                        themeAccent3.myMessagesGradientAccentColor2 = serializedData2.readInt32(true);
                                        themeAccent3.myMessagesGradientAccentColor3 = serializedData2.readInt32(true);
                                    }
                                    if (int32 >= 8) {
                                        z = true;
                                        themeAccent3.myMessagesAnimated = serializedData2.readBool(true);
                                    } else {
                                        z = true;
                                    }
                                    if (int32 >= i2) {
                                        themeAccent3.backgroundOverrideColor = serializedData2.readInt64(z);
                                    } else {
                                        themeAccent3.backgroundOverrideColor = serializedData2.readInt32(z);
                                    }
                                    if (int32 >= 2) {
                                        themeAccent3.backgroundGradientOverrideColor1 = serializedData2.readInt64(z);
                                    } else {
                                        themeAccent3.backgroundGradientOverrideColor1 = serializedData2.readInt32(z);
                                    }
                                    if (int32 >= 6) {
                                        themeAccent3.backgroundGradientOverrideColor2 = serializedData2.readInt64(z);
                                        themeAccent3.backgroundGradientOverrideColor3 = serializedData2.readInt64(z);
                                    }
                                    if (int32 >= 1) {
                                        themeAccent3.backgroundRotation = serializedData2.readInt32(true);
                                    }
                                    if (int32 >= 4) {
                                        serializedData2.readInt64(true);
                                        arrayList2 = arrayList4;
                                        themeAccent3.patternIntensity = (float) serializedData2.readDouble(true);
                                        themeAccent3.patternMotion = serializedData2.readBool(true);
                                        if (int32 >= 5) {
                                            themeAccent3.patternSlug = serializedData2.readString(true);
                                        }
                                    } else {
                                        arrayList2 = arrayList4;
                                    }
                                    if (int32 >= 5 && serializedData2.readBool(true)) {
                                        themeAccent3.account = serializedData2.readInt32(true);
                                        themeAccent3.info = TLRPC.Theme.TLdeserialize(serializedData2, serializedData2.readInt32(true), true);
                                    }
                                    TLRPC.TL_theme tL_theme = themeAccent3.info;
                                    if (tL_theme != null) {
                                        themeAccent3.isDefault = tL_theme.isDefault;
                                    }
                                    themeInfo9.themeAccentsMap.put(themeAccent3.id, themeAccent3);
                                    TLRPC.TL_theme tL_theme2 = themeAccent3.info;
                                    if (tL_theme2 != null) {
                                        themeInfo9.accentsByThemeId.put(tL_theme2.id, themeAccent3);
                                    }
                                    arrayList2.add(themeAccent3);
                                    themeInfo9.lastAccentId = Math.max(themeInfo9.lastAccentId, themeAccent3.id);
                                    i155++;
                                    arrayList4 = arrayList2;
                                    editorEdit3 = editorEdit3;
                                    i2 = 3;
                                    z2 = true;
                                } catch (Throwable th) {
                                    throw new RuntimeException(th);
                                }
                            }
                            editor = editorEdit3;
                            arrayList = arrayList4;
                        } catch (Throwable th2) {
                            FileLog.e(th2);
                            throw new RuntimeException(th2);
                        }
                    }
                    editorEdit3 = editor;
                    if (!arrayList.isEmpty()) {
                        themeInfo9.themeAccents.addAll(0, arrayList);
                        sortAccents(themeInfo9);
                    }
                    sparseArray = themeInfo9.themeAccentsMap;
                    if (sparseArray != null) {
                        if (themeInfo9.firstAccentIsDefault) {
                            i = DEFALT_THEME_ACCENT_ID;
                        } else {
                            i = 0;
                        }
                        themeInfo9.currentAccentId = i;
                    }
                    ThemeInfo.access$2500(themeInfo9, sharedPreferences);
                    accent = themeInfo9.getAccent(false);
                    if (accent != null) {
                        themeInfo9.overrideWallpaper = accent.overrideWallpaper;
                    }
                }
                i2 = 3;
            }
            SharedPreferences.Editor editor2 = editorEdit3;
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
            if (themeInfo == null) {
                themeInfo = defaultTheme;
            } else {
                currentDayTheme = themeInfo;
            }
            if (globalMainSettings.contains("overrideThemeWallpaper") || globalMainSettings.contains("selectedBackground2")) {
                boolean z3 = globalMainSettings.getBoolean("overrideThemeWallpaper", false);
                long j3 = globalMainSettings.getLong("selectedBackground2", 1000001L);
                if (j3 == -1 || (z3 && j3 != -2 && j3 != 1000001)) {
                    OverrideWallpaperInfo overrideWallpaperInfo = new OverrideWallpaperInfo();
                    overrideWallpaperInfo.color = globalMainSettings.getInt("selectedColor", 0);
                    overrideWallpaperInfo.slug = globalMainSettings.getString("selectedBackgroundSlug", "");
                    if (j3 < -100 || j3 > -1 || overrideWallpaperInfo.color == 0) {
                        overrideWallpaperInfo.fileName = "wallpaper.jpg";
                        overrideWallpaperInfo.originalFileName = "wallpaper_original.jpg";
                    } else {
                        overrideWallpaperInfo.slug = "c";
                        overrideWallpaperInfo.fileName = "";
                        overrideWallpaperInfo.originalFileName = "";
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
                themeInfo = currentNightTheme;
            }
            applyTheme(themeInfo, false, iNeedSwitchToTheme == 2);
            AndroidUtilities.runOnUIThread(new Emoji$$ExternalSyntheticLambda1(15));
            ambientSensorListener = new SensorEventListener() {
                @Override
                public final void onAccuracyChanged(Sensor sensor, int i156) {
                }

                @Override
                public final void onSensorChanged(SensorEvent sensorEvent) {
                    float f = sensorEvent.values[0];
                    if (f <= 0.0f) {
                        f = 0.1f;
                    }
                    if (ApplicationLoader.mainInterfacePaused || !ApplicationLoader.isScreenOn) {
                        return;
                    }
                    if (f > 500.0f) {
                        Theme.lastBrightnessValue = 1.0f;
                    } else {
                        Theme.lastBrightnessValue = ((float) Math.ceil((Math.log(f) * 9.932299613952637d) + 27.05900001525879d)) / 100.0f;
                    }
                    if (Theme.lastBrightnessValue > Theme.autoNightBrighnessThreshold) {
                        if (Theme.switchNightRunnableScheduled) {
                            Theme.switchNightRunnableScheduled = false;
                            AndroidUtilities.cancelRunOnUIThread(Theme.switchNightBrightnessRunnable);
                        }
                        if (Theme.switchDayRunnableScheduled) {
                            return;
                        }
                        Theme.switchDayRunnableScheduled = true;
                        AndroidUtilities.runOnUIThread(Theme.switchDayBrightnessRunnable, Math.abs(Theme.lastThemeSwitchTime - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
                        return;
                    }
                    if (MediaController.getInstance().isRecordingOrListeningByProximity()) {
                        return;
                    }
                    if (Theme.switchDayRunnableScheduled) {
                        Theme.switchDayRunnableScheduled = false;
                        AndroidUtilities.cancelRunOnUIThread(Theme.switchDayBrightnessRunnable);
                    }
                    if (Theme.switchNightRunnableScheduled) {
                        return;
                    }
                    Theme.switchNightRunnableScheduled = true;
                    AndroidUtilities.runOnUIThread(Theme.switchNightBrightnessRunnable, Math.abs(Theme.lastThemeSwitchTime - SystemClock.elapsedRealtime()) < 12000 ? 12000L : 1800L);
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
            new Paint().setColor(-16776961);
            new Paint().setColor(1073807104);
            Paint paint3 = new Paint();
            DEBUG_GREEN_B0 = paint3;
            paint3.setColor(-1342112000);
            Paint paint4 = new Paint();
            DEBUG_RED_STROKE = paint4;
            paint4.setColor(-65536);
            paint4.setStrokeWidth(2.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint4.setStyle(style);
            Paint paint5 = new Paint();
            DEBUG_GREEN_STROKE = paint5;
            paint5.setColor(-16711936);
            paint5.setStrokeWidth(2.0f);
            paint5.setStyle(style);
        } catch (Exception e2) {
            FileLog.e(e2);
            throw new RuntimeException(e2);
        }
    }

    public static boolean access$800(int i, int i2) {
        float fRed = Color.red(i) / 255.0f;
        float fRed2 = Color.red(i2) / 255.0f;
        float fGreen = Color.green(i) / 255.0f;
        float fGreen2 = Color.green(i2) / 255.0f;
        float fBlue = Color.blue(i) / 255.0f;
        return ((((((float) Color.blue(i2)) / 255.0f) * 0.5f) + (fBlue * 0.5f)) * 0.0722f) + ((((fGreen2 * 0.5f) + (fGreen * 0.5f)) * 0.7152f) + (((fRed2 * 0.5f) + (fRed * 0.5f)) * 0.2126f)) > 0.705f || (fBlue * 0.0722f) + ((fGreen * 0.7152f) + (fRed * 0.2126f)) > 0.705f;
    }

    public static int adaptHSV(float f, float f2, int i) {
        float[] tempHsv = getTempHsv(5);
        Color.colorToHSV(i, tempHsv);
        float f3 = tempHsv[1];
        if (f3 > 0.1f && f3 < 0.9f) {
            tempHsv[1] = MathUtils.clamp(f3 + f, 0.0f, 1.0f);
        }
        tempHsv[2] = MathUtils.clamp(tempHsv[2] + f2, 0.0f, 1.0f);
        return Color.HSVToColor(Color.alpha(i), tempHsv);
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

    public static void addChatDrawable(int i, String str, Drawable drawable) {
        defaultChatDrawables.put(str, drawable);
        defaultChatDrawableColorKeys.put(str, Integer.valueOf(i));
    }

    public static void addChatPaint(int i, Paint paint, String str) {
        defaultChatPaints.put(str, paint);
        defaultChatPaintColors.put(str, Integer.valueOf(i));
    }

    public static void applyCalculatedArticleCodeColors(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, boolean z) {
        if (z) {
            int i = key_chat_inArticleCodeBackground;
            if (sparseIntArray.indexOfKey(i) < 0) {
                sparseIntArray2.put(i, multAlpha(0.1f, -1));
            }
        }
        int[] iArr = defaultColors;
        int i2 = key_chat_inBubble;
        int i3 = sparseIntArray2.get(i2, iArr[i2]);
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

    public static void applyCalculatedTableColors(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2, boolean z) {
        int[] iArr = defaultColors;
        int i = key_chat_inBubble;
        int i2 = sparseIntArray2.get(i, iArr[i]);
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
            sparseIntArray2.put(i7, multAlpha(0.2f, sparseIntArray2.get(i8, iArr[i8])));
        }
        if (z) {
            int i9 = key_chat_inDivider;
            if (sparseIntArray.indexOfKey(i9) < 0) {
                int i10 = key_chat_inReplyMessageText;
                sparseIntArray2.put(i9, multAlpha(0.2f, sparseIntArray2.get(i10, iArr[i10])));
            }
        }
    }

    public static void applyChatMessageSelectedBackgroundColor(Drawable drawable) {
        Bitmap bitmap;
        if (chat_messageBackgroundSelectedPaint == null) {
            return;
        }
        int i = currentColors.get(key_chat_selectedBackground);
        boolean z = (drawable instanceof MotionBackgroundDrawable) && SharedConfig.getDevicePerformanceClass() != 0 && i == 0;
        if (z && serviceBitmap != (bitmap = ((MotionBackgroundDrawable) drawable).currentBitmap)) {
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

    public static void applyChatServiceMessageColor(Drawable drawable) {
        Bitmap bitmap;
        if (chat_actionBackgroundPaint == null) {
            return;
        }
        serviceMessageColor = serviceMessageColorBackup;
        serviceSelectedMessageColor = serviceSelectedMessageColorBackup;
        SparseIntArray sparseIntArray = currentColors;
        int i = key_chat_serviceBackground;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        int iValueAt = iIndexOfKey >= 0 ? currentColors.valueAt(iIndexOfKey) : serviceMessageColor;
        int iIndexOfKey2 = currentColors.indexOfKey(key_chat_serviceBackgroundSelected);
        int iValueAt2 = iIndexOfKey2 >= 0 ? currentColors.valueAt(iIndexOfKey2) : serviceSelectedMessageColor;
        boolean z = drawable instanceof MotionBackgroundDrawable;
        if ((z || (drawable instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32)) {
            if (z) {
                bitmap = ((MotionBackgroundDrawable) drawable).currentBitmap;
            } else if (drawable instanceof BitmapDrawable) {
                WeakReference weakReference = lastDrawableToBlur;
                if (weakReference == null || weakReference.get() != drawable) {
                    WeakReference weakReference2 = lastDrawableToBlur;
                    if (weakReference2 != null) {
                        weakReference2.clear();
                    }
                    lastDrawableToBlur = null;
                    if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
                        blurredBitmap = null;
                        bitmap = null;
                    } else {
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
                        bitmap = bitmapCreateBitmap;
                    }
                } else {
                    bitmap = blurredBitmap;
                }
            } else {
                bitmap = null;
            }
            if (serviceBitmap != bitmap) {
                serviceBitmap = bitmap;
                Bitmap bitmap2 = serviceBitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                serviceBitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                if (Build.VERSION.SDK_INT >= 33) {
                    serviceBitmapShader.setFilterMode(2);
                }
                if (serviceBitmapMatrix == null) {
                    serviceBitmapMatrix = new Matrix();
                }
            }
            setDrawableColor(-1, chat_msgStickerPinnedDrawable);
            setDrawableColor(-1, chat_msgStickerCheckDrawable);
            setDrawableColor(-1, chat_msgStickerHalfCheckDrawable);
            setDrawableColor(-1, chat_msgStickerViewsDrawable);
            setDrawableColor(-1, chat_msgStickerRepliesDrawable);
            chat_actionTextPaint.setColor(-1);
            chat_actionTextPaint2.setColor(-1);
            chat_actionTextPaint3.setColor(-1);
            chat_actionTextPaint.linkColor = -1;
            chat_unlockExtendedMediaTextPaint.setColor(-1);
            chat_botButtonPaint.setColor(-1);
            setDrawableColor(-1, chat_commentStickerDrawable);
            setDrawableColor(-1, chat_shareIconDrawable);
            setDrawableColor(-1, chat_replyIconDrawable);
            setDrawableColor(-1, chat_goIconDrawable);
            setDrawableColor(-1, chat_botInlineDrawable);
            setDrawableColor(-1, chat_botWebViewDrawable);
            setDrawableColor(-1, chat_botLockDrawable);
            setDrawableColor(-1, chat_botInviteDrawable);
            setDrawableColor(-1, chat_botLinkDrawable);
        } else {
            serviceBitmap = null;
            serviceBitmapShader = null;
            Drawable drawable2 = chat_msgStickerPinnedDrawable;
            int i2 = key_chat_serviceText;
            setDrawableColorByKey(i2, drawable2);
            setDrawableColorByKey(i2, chat_msgStickerCheckDrawable);
            setDrawableColorByKey(i2, chat_msgStickerHalfCheckDrawable);
            setDrawableColorByKey(i2, chat_msgStickerViewsDrawable);
            setDrawableColorByKey(i2, chat_msgStickerRepliesDrawable);
            chat_actionTextPaint.setColor(getColor(null, i2, false));
            chat_actionTextPaint2.setColor(getColor(null, i2, false));
            chat_actionTextPaint.linkColor = getColor(null, key_chat_serviceLink, false);
            chat_unlockExtendedMediaTextPaint.setColor(getColor(null, i2, false));
            Drawable drawable3 = chat_commentStickerDrawable;
            int i3 = key_chat_serviceIcon;
            setDrawableColorByKey(i3, drawable3);
            setDrawableColorByKey(i3, chat_shareIconDrawable);
            setDrawableColorByKey(i3, chat_replyIconDrawable);
            setDrawableColorByKey(i3, chat_goIconDrawable);
            setDrawableColorByKey(i3, chat_botInlineDrawable);
            setDrawableColorByKey(i3, chat_botWebViewDrawable);
            setDrawableColorByKey(i3, chat_botLockDrawable);
            setDrawableColorByKey(i3, chat_botInviteDrawable);
            setDrawableColorByKey(i3, chat_botLinkDrawable);
            chat_botButtonPaint.setColor(getColor(null, key_chat_botButtonText, false));
        }
        chat_actionBackgroundPaint.setColor(iValueAt);
        chat_actionBackgroundSelectedPaint.setColor(iValueAt2);
        if (serviceBitmapShader == null || !(currentColors.indexOfKey(i) < 0 || z || (drawable instanceof BitmapDrawable))) {
            chat_actionBackgroundPaint.setColorFilter(null);
            chat_actionBackgroundPaint.setShader(null);
            chat_actionBackgroundSelectedPaint.setColorFilter(null);
            chat_actionBackgroundSelectedPaint.setShader(null);
            chat_actionBackgroundGradientDarkenPaint.setAlpha(21);
            return;
        }
        ColorMatrix colorMatrix2 = new ColorMatrix();
        if (z) {
            if (((MotionBackgroundDrawable) drawable).intensity >= 0.0f) {
                colorMatrix2.setSaturation(1.6f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix2, currentTheme.isDark() ? 0.97f : 0.92f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, currentTheme.isDark() ? 0.12f : -0.06f);
            } else {
                colorMatrix2.setSaturation(1.1f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix2, currentTheme.isDark() ? 0.4f : 0.8f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, currentTheme.isDark() ? 0.08f : -0.06f);
            }
        } else {
            colorMatrix2.setSaturation(1.6f);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix2, currentTheme.isDark() ? 0.9f : 0.84f);
            AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, currentTheme.isDark() ? -0.04f : 0.06f);
        }
        chat_actionBackgroundPaint.setFilterBitmap(true);
        chat_actionBackgroundPaint.setShader(serviceBitmapShader);
        chat_actionBackgroundPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
        chat_actionBackgroundPaint.setAlpha(255);
        chat_actionBackgroundSelectedPaint.setFilterBitmap(true);
        chat_actionBackgroundSelectedPaint.setShader(serviceBitmapShader);
        ColorMatrix colorMatrix3 = new ColorMatrix(colorMatrix2);
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 0.26f);
        currentTheme.isDark();
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix3, 0.92f);
        chat_actionBackgroundSelectedPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
        chat_actionBackgroundSelectedPaint.setAlpha(255);
        chat_actionBackgroundGradientDarkenPaint.setAlpha(0);
    }

    public static void applyChatTheme(boolean z) {
        if (chat_msgTextPaint == null || chat_msgInDrawable == null) {
            return;
        }
        chat_gamePaint.setColor(getColor(null, key_chat_previewGameText, false));
        chat_durationPaint.setColor(getColor(null, key_chat_previewDurationText, false));
        chat_botButtonPaint.setColor(getColor(null, key_chat_botButtonText, false));
        chat_urlPaint.setColor(getColor(null, key_chat_linkSelectBackground, false));
        chat_outUrlPaint.setColor(getColor(null, key_chat_outLinkSelectBackground, false));
        chat_textSearchSelectionPaint.setColor(getColor(null, key_chat_textSelectBackground, false));
        chat_msgErrorPaint.setColor(getColor(null, key_chat_sentError, false));
        Paint paint = chat_statusPaint;
        int i = key_chat_status;
        paint.setColor(getColor(null, i, false));
        chat_statusRecordPaint.setColor(getColor(null, i, false));
        TextPaint textPaint = chat_actionTextPaint;
        int i2 = key_chat_serviceText;
        textPaint.setColor(getColor(null, i2, false));
        chat_actionTextPaint2.setColor(getColor(null, i2, false));
        chat_actionTextPaint3.setColor(getColor(null, i2, false));
        chat_actionTextPaint.linkColor = getColor(null, key_chat_serviceLink, false);
        chat_unlockExtendedMediaTextPaint.setColor(getColor(null, i2, false));
        chat_contextResult_titleTextPaint.setColor(getColor(null, key_windowBackgroundWhiteBlackText, false));
        Paint paint2 = chat_composeBackgroundPaint;
        int i3 = key_chat_messagePanelBackground;
        paint2.setColor(getColor(null, i3, false));
        chat_timeBackgroundPaint.setColor(getColor(null, key_chat_mediaTimeBackground, false));
        setDrawableColorByKey(key_chat_mediaTimeText, chat_msgNoSoundDrawable);
        MessageDrawable messageDrawable = chat_msgInDrawable;
        int i4 = key_chat_inBubble;
        setDrawableColorByKey(i4, messageDrawable);
        MessageDrawable messageDrawable2 = chat_msgInSelectedDrawable;
        int i5 = key_chat_inBubbleSelected;
        setDrawableColorByKey(i5, messageDrawable2);
        setDrawableColorByKey(i4, chat_msgInMediaDrawable);
        setDrawableColorByKey(i5, chat_msgInMediaSelectedDrawable);
        setDrawableColorByKey(key_chat_outSentCheck, chat_msgOutCheckDrawable);
        setDrawableColorByKey(key_chat_outSentCheckSelected, chat_msgOutCheckSelectedDrawable);
        Drawable drawable = chat_msgOutCheckReadDrawable;
        int i6 = key_chat_outSentCheckRead;
        setDrawableColorByKey(i6, drawable);
        Drawable drawable2 = chat_msgOutCheckReadSelectedDrawable;
        int i7 = key_chat_outSentCheckReadSelected;
        setDrawableColorByKey(i7, drawable2);
        setDrawableColorByKey(i6, chat_msgOutHalfCheckDrawable);
        setDrawableColorByKey(i7, chat_msgOutHalfCheckSelectedDrawable);
        Drawable drawable3 = chat_msgMediaCheckDrawable;
        int i8 = key_chat_mediaSentCheck;
        setDrawableColorByKey(i8, drawable3);
        setDrawableColorByKey(i8, chat_msgMediaHalfCheckDrawable);
        setDrawableColorByKey(i2, chat_msgStickerCheckDrawable);
        setDrawableColorByKey(i2, chat_msgStickerHalfCheckDrawable);
        setDrawableColorByKey(i2, chat_msgStickerViewsDrawable);
        setDrawableColorByKey(i2, chat_msgStickerRepliesDrawable);
        setDrawableColorByKey(i2, chat_msgUnlockDrawable);
        Drawable drawable4 = chat_shareIconDrawable;
        int i9 = key_chat_serviceIcon;
        setDrawableColorByKey(i9, drawable4);
        setDrawableColorByKey(i9, chat_replyIconDrawable);
        setDrawableColorByKey(i9, chat_goIconDrawable);
        setDrawableColorByKey(i9, chat_botInlineDrawable);
        setDrawableColorByKey(i9, chat_botWebViewDrawable);
        Drawable drawable5 = chat_botLockDrawable;
        int i10 = key_chat_lockIcon;
        setDrawableColorByKey(i10, drawable5);
        setDrawableColorByKey(i9, chat_botInviteDrawable);
        setDrawableColorByKey(i9, chat_botLinkDrawable);
        Drawable drawable6 = chat_msgInViewsDrawable;
        int i11 = key_chat_inViews;
        setDrawableColorByKey(i11, drawable6);
        Drawable drawable7 = chat_msgInViewsSelectedDrawable;
        int i12 = key_chat_inViewsSelected;
        setDrawableColorByKey(i12, drawable7);
        Drawable drawable8 = chat_msgOutViewsDrawable;
        int i13 = key_chat_outViews;
        setDrawableColorByKey(i13, drawable8);
        Drawable drawable9 = chat_msgOutViewsSelectedDrawable;
        int i14 = key_chat_outViewsSelected;
        setDrawableColorByKey(i14, drawable9);
        setDrawableColorByKey(i11, chat_msgInRepliesDrawable);
        setDrawableColorByKey(i12, chat_msgInRepliesSelectedDrawable);
        setDrawableColorByKey(i13, chat_msgOutRepliesDrawable);
        setDrawableColorByKey(i14, chat_msgOutRepliesSelectedDrawable);
        setDrawableColorByKey(i11, chat_msgInPinnedDrawable);
        setDrawableColorByKey(i12, chat_msgInPinnedSelectedDrawable);
        setDrawableColorByKey(i13, chat_msgOutPinnedDrawable);
        setDrawableColorByKey(i14, chat_msgOutPinnedSelectedDrawable);
        Drawable drawable10 = chat_msgMediaPinnedDrawable;
        int i15 = key_chat_mediaViews;
        setDrawableColorByKey(i15, drawable10);
        setDrawableColorByKey(i2, chat_msgStickerPinnedDrawable);
        setDrawableColorByKey(i15, chat_msgMediaViewsDrawable);
        setDrawableColorByKey(i15, chat_msgMediaRepliesDrawable);
        setDrawableColorByKey(key_chat_inMenu, chat_msgInMenuDrawable);
        setDrawableColorByKey(key_chat_inMenuSelected, chat_msgInMenuSelectedDrawable);
        setDrawableColorByKey(key_chat_outMenu, chat_msgOutMenuDrawable);
        setDrawableColorByKey(key_chat_outMenuSelected, chat_msgOutMenuSelectedDrawable);
        setDrawableColorByKey(key_chat_mediaMenu, chat_msgMediaMenuDrawable);
        Drawable drawable11 = chat_msgOutInstantDrawable;
        int i16 = key_chat_outInstant;
        setDrawableColorByKey(i16, drawable11);
        Drawable drawable12 = chat_msgInInstantDrawable;
        int i17 = key_chat_inInstant;
        setDrawableColorByKey(i17, drawable12);
        setDrawableColorByKey(key_chat_sentErrorIcon, chat_msgErrorDrawable);
        setDrawableColorByKey(key_chat_muteIcon, chat_muteIconDrawable);
        setDrawableColorByKey(i10, chat_lockIconDrawable);
        Drawable drawable13 = chat_inlineResultFile;
        int i18 = key_chat_inlineResultIcon;
        setDrawableColorByKey(i18, drawable13);
        setDrawableColorByKey(i18, chat_inlineResultAudio);
        setDrawableColorByKey(i18, chat_inlineResultLocation);
        setDrawableColorByKey(i17, chat_commentDrawable);
        setDrawableColorByKey(i9, chat_commentStickerDrawable);
        setDrawableColorByKey(i17, chat_commentArrowDrawable);
        Drawable drawable14 = chat_gradientLeftDrawable;
        int i19 = key_chat_stickersHintPanel;
        setDrawableColorByKey(i19, drawable14);
        setDrawableColorByKey(i19, chat_gradientRightDrawable);
        for (int i20 = 0; i20 < 2; i20++) {
            setDrawableColorByKey(i17, chat_msgInCallDrawable[i20]);
            setDrawableColorByKey(key_chat_inInstantSelected, chat_msgInCallSelectedDrawable[i20]);
            setDrawableColorByKey(i16, chat_msgOutCallDrawable[i20]);
            setDrawableColorByKey(key_chat_outInstantSelected, chat_msgOutCallSelectedDrawable[i20]);
        }
        setDrawableColorByKey(key_chat_outGreenCall, chat_msgCallUpGreenDrawable);
        Drawable drawable15 = chat_msgCallDownRedDrawable;
        int i21 = key_fill_RedNormal;
        setDrawableColorByKey(i21, drawable15);
        setDrawableColorByKey(key_chat_inGreenCall, chat_msgCallDownGreenDrawable);
        setDrawableColorByKey(i21, calllog_msgCallUpRedDrawable);
        Drawable drawable16 = calllog_msgCallUpGreenDrawable;
        int i22 = key_calls_callReceivedGreenIcon;
        setDrawableColorByKey(i22, drawable16);
        setDrawableColorByKey(i21, calllog_msgCallDownRedDrawable);
        setDrawableColorByKey(i22, calllog_msgCallDownGreenDrawable);
        int i23 = 0;
        while (true) {
            StatusDrawable[] statusDrawableArr = chat_status_drawables;
            if (i23 >= statusDrawableArr.length) {
                break;
            }
            setDrawableColorByKey(key_chats_actionMessage, statusDrawableArr[i23]);
            i23++;
        }
        for (int i24 = 0; i24 < 5; i24++) {
            Drawable[][] drawableArr = chat_fileStatesDrawable;
            setCombinedDrawableColor(drawableArr[i24][0], getColor(null, key_chat_inLoader, false), false);
            setCombinedDrawableColor(drawableArr[i24][0], getColor(null, key_chat_inMediaIcon, false), true);
            setCombinedDrawableColor(drawableArr[i24][1], getColor(null, key_chat_inLoaderSelected, false), false);
            setCombinedDrawableColor(drawableArr[i24][1], getColor(null, key_chat_inMediaIconSelected, false), true);
        }
        Drawable[] drawableArr2 = chat_contactDrawable;
        setCombinedDrawableColor(drawableArr2[0], getColor(null, key_chat_inContactBackground, false), false);
        setCombinedDrawableColor(drawableArr2[0], getColor(null, key_chat_inContactIcon, false), true);
        setCombinedDrawableColor(drawableArr2[1], getColor(null, key_chat_outContactBackground, false), false);
        setCombinedDrawableColor(drawableArr2[1], getColor(null, key_chat_outContactIcon, false), true);
        Drawable[] drawableArr3 = chat_locationDrawable;
        setDrawableColor(getColor(null, key_chat_inLocationIcon, false), drawableArr3[0]);
        setDrawableColor(getColor(null, key_chat_outLocationIcon, false), drawableArr3[1]);
        Drawable[] drawableArr4 = chat_pollHintDrawable;
        setDrawableColor(getColor(null, key_chat_inPreviewInstantText, false), drawableArr4[0]);
        setDrawableColor(getColor(null, key_chat_outPreviewInstantText, false), drawableArr4[1]);
        Drawable[] drawableArr5 = chat_psaHelpDrawable;
        setDrawableColor(getColor(null, i11, false), drawableArr5[0]);
        setDrawableColor(getColor(null, i13, false), drawableArr5[1]);
        setDrawableColorByKey(key_chat_messagePanelShadow, chat_composeShadowDrawable);
        setDrawableColorByKey(i3, chat_composeShadowRoundDrawable);
        int color = getColor(null, key_chat_outAudioSeekbarFill, false) == -1 ? getColor(null, key_chat_outBubble, false) : -1;
        setDrawableColor(color, chat_pollCheckDrawable[1]);
        setDrawableColor(color, chat_pollCrossDrawable[1]);
        setDrawableColor(getColor(null, key_chat_attachEmptyImage, false), chat_attachEmptyDrawable);
        if (z || disallowChangeServiceMessageColor) {
            return;
        }
        Drawable drawable17 = wallpaper;
        if (drawable17 != null) {
            applyChatServiceMessageColor(drawable17);
        }
        applyChatMessageSelectedBackgroundColor(wallpaper);
    }

    public static void applyCommonTheme() {
        int i;
        Paint paint = dividerPaint;
        if (paint == null) {
            return;
        }
        paint.setColor(getColor(null, key_divider, false));
        linkSelectionPaint.setColor(getColor(null, key_windowBackgroundWhiteLinkSelection, false));
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = avatarDrawables;
            int length = drawableArr.length;
            i = key_avatar_text;
            if (i2 >= length) {
                break;
            }
            setDrawableColorByKey(i, drawableArr[i2]);
            i2++;
        }
        RLottieDrawable rLottieDrawable = dialogs_archiveAvatarDrawable;
        rLottieDrawable.applyingLayerColors = true;
        int i3 = key_avatar_backgroundArchived;
        OKLCH.m(getColor(null, i3, true), rLottieDrawable.newColorUpdates, "Arrow1", rLottieDrawable);
        RLottieDrawable rLottieDrawable2 = dialogs_archiveAvatarDrawable;
        OKLCH.m(getColor(null, i3, true), rLottieDrawable2.newColorUpdates, "Arrow2", rLottieDrawable2);
        RLottieDrawable rLottieDrawable3 = dialogs_archiveAvatarDrawable;
        OKLCH.m(getColor(null, i, true), rLottieDrawable3.newColorUpdates, "Box2", rLottieDrawable3);
        RLottieDrawable rLottieDrawable4 = dialogs_archiveAvatarDrawable;
        OKLCH.m(getColor(null, i, true), rLottieDrawable4.newColorUpdates, "Box1", rLottieDrawable4);
        dialogs_archiveAvatarDrawable.commitApplyLayerColors();
        dialogs_archiveAvatarDrawableRecolored = false;
        RLottieDrawable rLottieDrawable5 = dialogs_archiveAvatarDrawable;
        rLottieDrawable5.decodeSingleFrame = true;
        rLottieDrawable5.scheduleNextGetFrame();
        RLottieDrawable rLottieDrawable6 = dialogs_pinArchiveDrawable;
        rLottieDrawable6.applyingLayerColors = true;
        int i4 = key_chats_archiveIcon;
        OKLCH.m(getColor(null, i4, true), rLottieDrawable6.newColorUpdates, "Arrow", rLottieDrawable6);
        RLottieDrawable rLottieDrawable7 = dialogs_pinArchiveDrawable;
        OKLCH.m(getColor(null, i4, true), rLottieDrawable7.newColorUpdates, "Line", rLottieDrawable7);
        dialogs_pinArchiveDrawable.commitApplyLayerColors();
        RLottieDrawable rLottieDrawable8 = dialogs_unpinArchiveDrawable;
        rLottieDrawable8.applyingLayerColors = true;
        OKLCH.m(getColor(null, i4, true), rLottieDrawable8.newColorUpdates, "Arrow", rLottieDrawable8);
        RLottieDrawable rLottieDrawable9 = dialogs_unpinArchiveDrawable;
        OKLCH.m(getColor(null, i4, true), rLottieDrawable9.newColorUpdates, "Line", rLottieDrawable9);
        dialogs_unpinArchiveDrawable.commitApplyLayerColors();
        RLottieDrawable rLottieDrawable10 = dialogs_hidePsaDrawable;
        rLottieDrawable10.applyingLayerColors = true;
        int i5 = key_chats_archiveBackground;
        rLottieDrawable10.newColorUpdates.put("Line 1", Integer.valueOf(getColor(null, i5, true)));
        rLottieDrawable10.requestRedrawColors();
        RLottieDrawable rLottieDrawable11 = dialogs_hidePsaDrawable;
        OKLCH.m(getColor(null, i5, true), rLottieDrawable11.newColorUpdates, "Line 2", rLottieDrawable11);
        RLottieDrawable rLottieDrawable12 = dialogs_hidePsaDrawable;
        OKLCH.m(getColor(null, i5, true), rLottieDrawable12.newColorUpdates, "Line 3", rLottieDrawable12);
        RLottieDrawable rLottieDrawable13 = dialogs_hidePsaDrawable;
        OKLCH.m(getColor(null, i4, true), rLottieDrawable13.newColorUpdates, "Cup Red", rLottieDrawable13);
        RLottieDrawable rLottieDrawable14 = dialogs_hidePsaDrawable;
        OKLCH.m(getColor(null, i4, true), rLottieDrawable14.newColorUpdates, "Box", rLottieDrawable14);
        dialogs_hidePsaDrawable.commitApplyLayerColors();
        dialogs_hidePsaDrawableRecolored = false;
        RLottieDrawable rLottieDrawable15 = dialogs_archiveDrawable;
        rLottieDrawable15.applyingLayerColors = true;
        OKLCH.m(getColor(null, i5, true), rLottieDrawable15.newColorUpdates, "Arrow", rLottieDrawable15);
        RLottieDrawable rLottieDrawable16 = dialogs_archiveDrawable;
        OKLCH.m(getColor(null, i4, true), rLottieDrawable16.newColorUpdates, "Box2", rLottieDrawable16);
        RLottieDrawable rLottieDrawable17 = dialogs_archiveDrawable;
        OKLCH.m(getColor(null, i4, true), rLottieDrawable17.newColorUpdates, "Box1", rLottieDrawable17);
        dialogs_archiveDrawable.commitApplyLayerColors();
        dialogs_archiveDrawableRecolored = false;
        RLottieDrawable rLottieDrawable18 = dialogs_unarchiveDrawable;
        rLottieDrawable18.applyingLayerColors = true;
        OKLCH.m(getColor(null, i4, true), rLottieDrawable18.newColorUpdates, "Arrow1", rLottieDrawable18);
        RLottieDrawable rLottieDrawable19 = dialogs_unarchiveDrawable;
        OKLCH.m(getColor(null, key_chats_archivePinBackground, true), rLottieDrawable19.newColorUpdates, "Arrow2", rLottieDrawable19);
        RLottieDrawable rLottieDrawable20 = dialogs_unarchiveDrawable;
        OKLCH.m(getColor(null, i4, true), rLottieDrawable20.newColorUpdates, "Box2", rLottieDrawable20);
        RLottieDrawable rLottieDrawable21 = dialogs_unarchiveDrawable;
        OKLCH.m(getColor(null, i4, true), rLottieDrawable21.newColorUpdates, "Box1", rLottieDrawable21);
        dialogs_unarchiveDrawable.commitApplyLayerColors();
        int color = getColor(null, key_windowBackgroundWhiteBlackText, false);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        chat_animatedEmojiTextColorFilter = new PorterDuffColorFilter(color, mode);
        chat_outAnimatedEmojiTextColorFilter = new PorterDuffColorFilter(getColor(null, key_chat_messageTextOut, false), mode);
        PremiumGradient premiumGradient = PremiumGradient.getInstance();
        premiumGradient.getClass();
        int i6 = key_chats_verifiedBackground;
        if (getColor(null, i6, false) != premiumGradient.lastStarColor) {
            premiumGradient.lastStarColor = getColor(null, i6, false);
            premiumGradient.premiumStarDrawableMini.setColorFilter(new PorterDuffColorFilter(premiumGradient.lastStarColor, PorterDuff.Mode.MULTIPLY));
        }
        premiumGradient.premiumStarMenuDrawable = premiumGradient.checkColors(premiumGradient.premiumStarMenuDrawable);
        premiumGradient.premiumStarMenuDrawable2 = premiumGradient.checkColors(premiumGradient.premiumStarMenuDrawable2);
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
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, currentNightTheme, Boolean.TRUE, null, -1);
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
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themeInfo4, Boolean.TRUE, null, -1);
                switchingNightTheme = false;
            }
        }
    }

    public static void applyDialogsTheme() {
        if (dialogs_namePaint == null) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = key_chats_actionMessage;
            int i3 = key_chats_message;
            int i4 = key_chats_secretName;
            int i5 = key_chats_name;
            if (i >= 2) {
                dialogs_searchNamePaint.setColor(getColor(null, i5, false));
                dialogs_searchNameEncryptedPaint.setColor(getColor(null, i4, false));
                TextPaint textPaint = dialogs_messageNamePaint;
                int color = getColor(null, key_chats_nameMessage_threeLines, false);
                textPaint.linkColor = color;
                textPaint.setColor(color);
                dialogs_tabletSeletedPaint.setColor(getColor(null, key_chats_tabletSelectedOverlay, false));
                dialogs_pinnedPaint.setColor(getColor(null, key_chats_pinnedOverlay, false));
                dialogs_timePaint.setColor(getColor(null, key_chats_date, false));
                dialogs_timePaintBold.setColor(getColor(null, key_chats_date_bold, false));
                TextPaint textPaint2 = dialogs_timePaintBoldAccent;
                int i6 = key_telegram_color_text;
                textPaint2.setColor(getColor(null, i6, false));
                TextPaint textPaint3 = dialogs_countTextPaint;
                int i7 = key_chats_unreadCounterText;
                textPaint3.setColor(getColor(null, i7, false));
                dialogs_countTextPaint2.setColor(getColor(null, i7, false));
                TextPaint textPaint4 = dialogs_archiveTextPaint;
                int i8 = key_chats_archiveText;
                textPaint4.setColor(getColor(null, i8, false));
                dialogs_archiveTextPaintSmall.setColor(getColor(null, i8, false));
                Paint paint = dialogs_countPaint;
                int i9 = key_chats_unreadCounter;
                paint.setColor(getColor(null, i9, false));
                Paint paint2 = dialogs_countGrayPaint;
                int i10 = key_chats_unreadCounterMuted;
                paint2.setColor(getColor(null, i10, false));
                dialogs_actionMessagePaint.setColor(getColor(null, i2, false));
                dialogs_errorPaint.setColor(getColor(null, key_chats_sentError, false));
                dialogs_onlinePaint.setColor(getColor(null, key_windowBackgroundWhiteBlueText3, false));
                dialogs_offlinePaint.setColor(getColor(null, key_windowBackgroundWhiteGrayText3, false));
                setDrawableColorByKey(key_chats_secretIcon, dialogs_lockDrawable);
                Drawable drawable = dialogs_lock2Drawable;
                int i11 = key_chats_pinnedIcon;
                setDrawableColorByKey(i11, drawable);
                setDrawableColorByKey(key_chats_sentCheck, dialogs_checkDrawable);
                setDrawableColorByKey(key_windowBackgroundWhiteBlackText, dialogs_communityCardsDrawable);
                Drawable drawable2 = dialogs_checkReadDrawable;
                int i12 = key_chats_sentReadCheck;
                setDrawableColorByKey(i12, drawable2);
                setDrawableColorByKey(i12, dialogs_halfCheckDrawable);
                setDrawableColorByKey(key_chats_sentClock, dialogs_clockDrawable);
                setDrawableColorByKey(key_chats_sentErrorIcon, dialogs_errorDrawable);
                setDrawableColorByKey(i11, dialogs_pinnedDrawable);
                setDrawableColorByKey(i11, dialogs_pinnedDrawable2);
                setDrawableColorByKey(i6, dialogs_pinnedDrawable2Accent);
                setDrawableColorByKey(i11, dialogs_reorderDrawable);
                Drawable drawable3 = dialogs_muteDrawable;
                int i13 = key_chats_muteIcon;
                setDrawableColorByKey(i13, drawable3);
                setDrawableColorByKey(i13, dialogs_unmuteDrawable);
                setDrawableColorByKey(i13, dialogs_hiddenDrawable);
                setDrawableColorByKey(i9, dialogs_mentionDrawable);
                setDrawableColorByKey(key_dialogReactionMentionBackground, dialogs_reactionsMentionDrawable);
                setDrawableColorByKey(key_color_purple, dialogs_pollMentionDrawable);
                setDrawableColorByKey(i10, dialogs_mentionDrawableMuted);
                setDrawableColorByKey(i10, dialogs_reactionsMentionDrawableMuted);
                setDrawableColorByKey(i10, dialogs_pollMentionDrawableMuted);
                setDrawableColorByKey(i3, dialogs_forum_arrowDrawable);
                setDrawableColorByKey(key_chats_verifiedBackground, dialogs_verifiedDrawable);
                setDrawableColorByKey(key_chats_verifiedCheck, dialogs_verifiedCheckDrawable);
                setDrawableColorByKey(key_actionBarDefaultTitle, dialogs_holidayDrawable);
                ScamDrawable scamDrawable = dialogs_scamDrawable;
                int i14 = key_chats_draft;
                setDrawableColorByKey(i14, scamDrawable);
                setDrawableColorByKey(i14, dialogs_fakeDrawable);
                return;
            }
            dialogs_namePaint[i].setColor(getColor(null, i5, false));
            dialogs_nameEncryptedPaint[i].setColor(getColor(null, i4, false));
            TextPaint textPaint5 = dialogs_messagePaint[i];
            int color2 = getColor(null, i3, false);
            textPaint5.linkColor = color2;
            textPaint5.setColor(color2);
            dialogs_messagePrintingPaint[i].setColor(getColor(null, i2, false));
            i++;
        }
    }

    public static void applyPreviousTheme() {
        ThemeInfo themeInfo;
        ThemeInfo themeInfo2 = previousTheme;
        if (themeInfo2 == null) {
            return;
        }
        hasPreviousTheme = false;
        if (isInNigthMode && (themeInfo = currentNightTheme) != null) {
            applyTheme(themeInfo, true, true);
        } else if (!isApplyingAccent) {
            applyTheme(themeInfo2, true, false);
        }
        isApplyingAccent = false;
        previousTheme = null;
        checkAutoNightThemeConditions(false);
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

    public static void applyServiceShaderMatrixForView(View view, View view2, ResourcesProvider resourcesProvider) {
        if (view == null || view2 == null) {
            return;
        }
        int[] iArr = viewPos;
        view.getLocationOnScreen(iArr);
        int measuredWidth = iArr[0];
        int i = iArr[1];
        view2.getLocationOnScreen(iArr);
        if (view2 instanceof ThemePreviewActivity.BackgroundView) {
            Bitmap bitmap = serviceBitmap;
            if (bitmap != null) {
                float width = bitmap.getWidth();
                measuredWidth = (int) ((((view2.getMeasuredWidth() - (Math.max(view2.getMeasuredWidth() / width, view2.getMeasuredHeight() / serviceBitmap.getHeight()) * width)) / 2.0f) - ((ThemePreviewActivity.BackgroundView) view2).tx) + measuredWidth);
            } else {
                measuredWidth = (int) (measuredWidth + (-((ThemePreviewActivity.BackgroundView) view2).tx));
            }
            i = (int) (i + (-((ThemePreviewActivity.BackgroundView) view2).ty));
        }
        if (resourcesProvider != null) {
            resourcesProvider.applyServiceShaderMatrix(measuredWidth, i - iArr[1], view2.getMeasuredWidth(), view2.getMeasuredHeight());
        } else {
            applyServiceShaderMatrix(serviceBitmap, serviceBitmapShader, serviceBitmapMatrix, view2.getMeasuredWidth(), view2.getMeasuredHeight(), measuredWidth, i - iArr[1]);
        }
    }

    public static void applyTheme(ThemeInfo themeInfo, boolean z, boolean z2) {
        String[] strArrSplit;
        if (themeInfo == null) {
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.Instance;
        if (themeEditorView != null) {
            themeEditorView.destroy();
        }
        try {
            if (themeInfo.pathToFile == null && themeInfo.assetName == null) {
                if (!z2 && z) {
                    SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                    editorEdit.remove("theme");
                    editorEdit.commit();
                }
                currentColorsNoAccent.clear();
                themedWallpaperFileOffset = 0;
                themedWallpaperLink = null;
                wallpaper = null;
                themedWallpaper = null;
            } else {
                if (!z2 && z) {
                    SharedPreferences.Editor editorEdit2 = MessagesController.getGlobalMainSettings().edit();
                    editorEdit2.putString("theme", themeInfo.getKey());
                    editorEdit2.apply();
                }
                String[] strArr = new String[1];
                String str = themeInfo.assetName;
                if (str != null) {
                    currentColorsNoAccent = getThemeFileValues(null, str, null);
                } else {
                    currentColorsNoAccent = getThemeFileValues(new File(themeInfo.pathToFile), null, strArr);
                }
                themedWallpaperFileOffset = currentColorsNoAccent.get(key_wallpaperFileOffset, -1);
                if (TextUtils.isEmpty(strArr[0])) {
                    try {
                        if (themeInfo.pathToWallpaper != null) {
                            new File(themeInfo.pathToWallpaper).delete();
                        }
                    } catch (Exception unused) {
                    }
                    themeInfo.pathToWallpaper = null;
                    themedWallpaperLink = null;
                } else {
                    themedWallpaperLink = strArr[0];
                    String absolutePath = new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(themedWallpaperLink) + ".wp").getAbsolutePath();
                    try {
                        String str2 = themeInfo.pathToWallpaper;
                        if (str2 != null && !str2.equals(absolutePath)) {
                            new File(themeInfo.pathToWallpaper).delete();
                        }
                    } catch (Exception unused2) {
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
                        } catch (Exception unused3) {
                        }
                        try {
                            String queryParameter3 = uri.getQueryParameter("rotation");
                            if (!TextUtils.isEmpty(queryParameter3)) {
                                themeInfo.patternBgGradientRotation = Utilities.parseInt((CharSequence) queryParameter3).intValue();
                            }
                        } catch (Exception unused4) {
                        }
                    } catch (Throwable th) {
                        FileLog.e(th);
                    }
                }
            }
            if (!z2 && previousTheme == null) {
                currentDayTheme = themeInfo;
                if (currentTheme == currentNightTheme) {
                    switchNightThemeDelay = 2000;
                    lastDelayUpdateTime = SystemClock.elapsedRealtime();
                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda470(3), 2100L);
                }
            }
            currentTheme = themeInfo;
            refreshThemeColors(false, false);
        } catch (Exception e) {
            FileLog.e(e);
        }
        float f = BlurSettingsBottomSheet.saturation;
        BlurSettingsBottomSheet.blurAlpha = 1.0f - (Color.alpha(getColor(null, key_chat_BlurAlpha, true)) / 255.0f);
        if (previousTheme == null && z && !switchingNightTheme) {
            MessagesController.getInstance(themeInfo.account).saveTheme(themeInfo, themeInfo.getAccent(false), z2, false);
        }
    }

    public static ThemeInfo applyThemeFile(File file, String str, TLRPC.TL_theme tL_theme, boolean z) {
        File file2;
        String str2;
        try {
            if (!str.toLowerCase().endsWith(".attheme")) {
                str = str.concat(".attheme");
            }
            if (z) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.goingToPreviewTheme, new Object[0]);
                ThemeInfo themeInfo = new ThemeInfo();
                themeInfo.name = str;
                themeInfo.info = tL_theme;
                themeInfo.pathToFile = file.getAbsolutePath();
                themeInfo.account = UserConfig.selectedAccount;
                ThemeInfo themeInfo2 = currentDayTheme;
                if (themeInfo2 == null) {
                    themeInfo2 = defaultTheme;
                }
                previousTheme = themeInfo2;
                hasPreviousTheme = true;
                isApplyingAccent = false;
                applyTheme(themeInfo, false, false);
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
            HashMap map = themesDict;
            ThemeInfo themeInfo3 = (ThemeInfo) map.get(str2);
            if (themeInfo3 == null) {
                themeInfo3 = new ThemeInfo();
                themeInfo3.name = str;
                themeInfo3.account = UserConfig.selectedAccount;
                ArrayList arrayList = themes;
                arrayList.add(themeInfo3);
                otherThemes.add(themeInfo3);
                Collections.sort(arrayList, new Theme$$ExternalSyntheticLambda5(0));
            } else {
                map.remove(str2);
            }
            themeInfo3.info = tL_theme;
            themeInfo3.pathToFile = file2.getAbsolutePath();
            map.put(themeInfo3.getKey(), themeInfo3);
            saveOtherThemes(true, false);
            applyTheme(themeInfo3, true, false);
            return themeInfo3;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
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
        return Color.argb((int) (255.0f * f2), (int) ((((Color.red(i) * fAlpha2) * f) + (Color.red(i2) * fAlpha)) / f2), (int) ((((Color.green(i) * fAlpha2) * f) + (Color.green(i2) * fAlpha)) / f2), (int) ((((Color.blue(i) * fAlpha2) * f) + (Color.blue(i2) * fAlpha)) / f2));
    }

    public static int calculatedArticleCodeScrollbar(int i, boolean z, boolean z2) {
        if (z) {
            return multAlpha(z2 ? 0.22f : 0.12f, -1);
        }
        int i2 = z2 ? -3813931 : -1972501;
        float[] tempHsv = getTempHsv(3);
        Color.colorToHSV(i, tempHsv);
        return tempHsv[1] > 0.02f ? adaptHue(i2, i) : i2;
    }

    public static int calculatedArticleDetailsColor(int i, boolean z, boolean z2, boolean z3) {
        if (z) {
            return multAlpha(z3 ? 0.62f : 0.18f, -1);
        }
        int i2 = z3 ? -6380376 : -2565928;
        float[] tempHsv = getTempHsv(3);
        Color.colorToHSV(i, tempHsv);
        return (!z2 || tempHsv[1] <= 0.02f) ? i2 : adaptHue(i2, i);
    }

    public static int calculatedTableBackground(int i, boolean z, boolean z2) {
        if (z && z2) {
            return multAlpha(0.07f, -1);
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

    public static int calculatedTableBorder(int i, boolean z, boolean z2) {
        if (z && z2) {
            return multAlpha(0.14f, -1);
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
                                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda271(tLObject, accent, themeInfo, tL_theme, 7));
                                }
                            });
                        }
                    }
                    i2++;
                }
            }
        }
    }

    public static void checkIsDark(SparseIntArray sparseIntArray, ThemeInfo themeInfo) {
        if (themeInfo == null || themeInfo.isDark != -1) {
            return;
        }
        int i = key_windowBackgroundWhite;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        int[] iArr = defaultColors;
        int iValueAt = iIndexOfKey >= 0 ? sparseIntArray.valueAt(iIndexOfKey) : iArr[i];
        int iIndexOfKey2 = sparseIntArray.indexOfKey(i);
        if (ColorUtils.calculateLuminance(ColorUtils.blendARGB(0.5f, iValueAt, iIndexOfKey2 >= 0 ? sparseIntArray.valueAt(iIndexOfKey2) : iArr[i])) < 0.5d) {
            themeInfo.isDark = 1;
        } else {
            themeInfo.isDark = 0;
        }
    }

    public static MHTML createBackgroundDrawable(ThemeInfo themeInfo, SparseIntArray sparseIntArray, String str, int i, boolean z) {
        float f;
        float f2;
        boolean z2 = themeInfo.firstAccentIsDefault && themeInfo.currentAccentId == DEFALT_THEME_ACCENT_ID;
        ThemeAccent accent = themeInfo.getAccent(false);
        File pathToWallpaper = accent != null ? accent.getPathToWallpaper() : null;
        boolean z3 = accent != null && accent.patternMotion;
        OverrideWallpaperInfo overrideWallpaperInfo = themeInfo.overrideWallpaper;
        if (overrideWallpaperInfo == null) {
            if (accent != null) {
                f2 = accent.patternIntensity;
            } else {
                f = themeInfo.patternIntensity;
            }
            return createBackgroundDrawable(themeInfo, overrideWallpaperInfo, sparseIntArray, pathToWallpaper, str, currentColorsNoAccent.get(key_wallpaperFileOffset, -1), (int) f, i, z2, false, false, z3, null, z);
        }
        f2 = overrideWallpaperInfo.intensity;
        f = f2 * 100.0f;
        return createBackgroundDrawable(themeInfo, overrideWallpaperInfo, sparseIntArray, pathToWallpaper, str, currentColorsNoAccent.get(key_wallpaperFileOffset, -1), (int) f, i, z2, false, false, z3, null, z);
    }

    public static void createChatResources(Context context) {
        float f;
        float f2;
        Drawable[] drawableArr;
        createCommonChatResources();
        if (chat_msgInDrawable == null) {
            Resources resources = context.getResources();
            chat_msgNoSoundDrawable = resources.getDrawable(R.drawable.video_muted);
            chat_livePhoto = resources.getDrawable(R.drawable.media_live_on).mutate();
            chat_msgInDrawable = new MessageDrawable(0, false, false, null);
            chat_msgInSelectedDrawable = new MessageDrawable(0, false, true, null);
            chat_msgOutDrawable = new MessageDrawable(0, true, false, null);
            chat_msgOutSelectedDrawable = new MessageDrawable(0, true, true, null);
            chat_msgInMediaDrawable = new MessageDrawable(1, false, false, null);
            chat_msgInMediaSelectedDrawable = new MessageDrawable(1, false, true, null);
            chat_msgOutMediaDrawable = new MessageDrawable(1, true, false, null);
            chat_msgOutMediaSelectedDrawable = new MessageDrawable(1, true, true, null);
            PathAnimator pathAnimator = new PathAnimator();
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
            int i10 = R.drawable.chat_calls_voice;
            Drawable drawableMutate = resources.getDrawable(i10).mutate();
            Drawable[] drawableArr2 = chat_msgInCallDrawable;
            drawableArr2[0] = drawableMutate;
            Drawable drawableMutate2 = resources.getDrawable(i10).mutate();
            Drawable[] drawableArr3 = chat_msgInCallSelectedDrawable;
            drawableArr3[0] = drawableMutate2;
            Drawable drawableMutate3 = resources.getDrawable(i10).mutate();
            Drawable[] drawableArr4 = chat_msgOutCallDrawable;
            drawableArr4[0] = drawableMutate3;
            Drawable drawableMutate4 = resources.getDrawable(i10).mutate();
            Drawable[] drawableArr5 = chat_msgOutCallSelectedDrawable;
            drawableArr5[0] = drawableMutate4;
            int i11 = R.drawable.chat_calls_video;
            drawableArr2[1] = resources.getDrawable(i11).mutate();
            drawableArr3[1] = resources.getDrawable(i11).mutate();
            drawableArr4[1] = resources.getDrawable(i11).mutate();
            drawableArr5[1] = resources.getDrawable(i11).mutate();
            chat_msgCallUpGreenDrawable = resources.getDrawable(R.drawable.chat_calls_outgoing).mutate();
            int i12 = R.drawable.chat_calls_incoming;
            chat_msgCallDownRedDrawable = resources.getDrawable(i12).mutate();
            chat_msgCallDownGreenDrawable = resources.getDrawable(i12).mutate();
            int i13 = 0;
            while (true) {
                drawableArr = chat_pollHintDrawable;
                if (i13 >= 2) {
                    break;
                }
                chat_pollCheckDrawable[i13] = resources.getDrawable(R.drawable.poll_right).mutate();
                chat_pollCrossDrawable[i13] = resources.getDrawable(R.drawable.poll_wrong).mutate();
                drawableArr[i13] = resources.getDrawable(R.drawable.msg_emoji_objects).mutate();
                chat_psaHelpDrawable[i13] = resources.getDrawable(R.drawable.msg_psa).mutate();
                i13++;
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
            Path path = new Path();
            Path[] pathArr = chat_filePath;
            pathArr[0] = path;
            path.moveTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(3.0f));
            pathArr[0].lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f));
            pathArr[0].lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f));
            pathArr[0].lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(20.0f));
            int i16 = iDp * 2;
            f2 = 14.0f;
            f = 3.0f;
            rectF.set(AndroidUtilities.dp(21.0f) - i16, AndroidUtilities.dp(19.0f) - iDp, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(19.0f) + iDp);
            pathArr[0].arcTo(rectF, 0.0f, 90.0f, false);
            pathArr[0].lineTo(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f));
            rectF.set(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(19.0f) - iDp, AndroidUtilities.dp(5.0f) + i16, AndroidUtilities.dp(19.0f) + iDp);
            pathArr[0].arcTo(rectF, 90.0f, 90.0f, false);
            pathArr[0].lineTo(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(4.0f));
            rectF.set(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(5.0f) + i16, AndroidUtilities.dp(3.0f) + i16);
            pathArr[0].arcTo(rectF, 180.0f, 90.0f, false);
            pathArr[0].close();
            Path path2 = new Path();
            pathArr[1] = path2;
            path2.moveTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(5.0f));
            pathArr[1].lineTo(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(10.0f));
            pathArr[1].lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(10.0f));
            pathArr[1].close();
            chat_flameIcon = resources.getDrawable(R.drawable.filled_fire).mutate();
            chat_gifIcon = resources.getDrawable(R.drawable.msg_round_gif_m).mutate();
            Drawable[][] drawableArr6 = chat_fileStatesDrawable;
            Drawable[] drawableArr7 = drawableArr6[0];
            int iDp2 = AndroidUtilities.dp(44.0f);
            int i17 = R.drawable.msg_round_play_m;
            drawableArr7[0] = createCircleDrawableWithIcon(iDp2, i17);
            drawableArr6[0][1] = createCircleDrawableWithIcon(AndroidUtilities.dp(44.0f), i17);
            Drawable[] drawableArr8 = drawableArr6[1];
            int iDp3 = AndroidUtilities.dp(44.0f);
            int i18 = R.drawable.msg_round_pause_m;
            drawableArr8[0] = createCircleDrawableWithIcon(iDp3, i18);
            drawableArr6[1][1] = createCircleDrawableWithIcon(AndroidUtilities.dp(44.0f), i18);
            Drawable[] drawableArr9 = drawableArr6[2];
            int iDp4 = AndroidUtilities.dp(44.0f);
            int i19 = R.drawable.msg_round_load_m;
            drawableArr9[0] = createCircleDrawableWithIcon(iDp4, i19);
            drawableArr6[2][1] = createCircleDrawableWithIcon(AndroidUtilities.dp(44.0f), i19);
            Drawable[] drawableArr10 = drawableArr6[3];
            int iDp5 = AndroidUtilities.dp(44.0f);
            int i20 = R.drawable.msg_round_file_s;
            drawableArr10[0] = createCircleDrawableWithIcon(iDp5, i20);
            drawableArr6[3][1] = createCircleDrawableWithIcon(AndroidUtilities.dp(44.0f), i20);
            Drawable[] drawableArr11 = drawableArr6[4];
            int iDp6 = AndroidUtilities.dp(44.0f);
            int i21 = R.drawable.msg_round_cancel_m;
            drawableArr11[0] = createCircleDrawableWithIcon(iDp6, i21);
            drawableArr6[4][1] = createCircleDrawableWithIcon(AndroidUtilities.dp(44.0f), i21);
            int iDp7 = AndroidUtilities.dp(44.0f);
            int i22 = R.drawable.msg_contact;
            CombinedDrawable combinedDrawableCreateCircleDrawableWithIcon = createCircleDrawableWithIcon(iDp7, i22);
            Drawable[] drawableArr12 = chat_contactDrawable;
            drawableArr12[0] = combinedDrawableCreateCircleDrawableWithIcon;
            drawableArr12[1] = createCircleDrawableWithIcon(AndroidUtilities.dp(44.0f), i22);
            int i23 = R.drawable.msg_location;
            Drawable drawableMutate5 = resources.getDrawable(i23).mutate();
            Drawable[] drawableArr13 = chat_locationDrawable;
            drawableArr13[0] = drawableMutate5;
            drawableArr13[1] = resources.getDrawable(i23).mutate();
            chat_composeShadowDrawable = context.getResources().getDrawable(R.drawable.compose_panel_shadow).mutate();
            chat_composeShadowRoundDrawable = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
            chat_roundVideoShadow = new LinkEditActivity.AnonymousClass2(1);
            defaultChatDrawables.clear();
            defaultChatDrawableColorKeys.clear();
            Drawable drawable = chat_botInlineDrawable;
            int i24 = key_chat_serviceIcon;
            addChatDrawable(i24, "drawableBotInline", drawable);
            addChatDrawable(i24, "drawableBotWebView", chat_botWebViewDrawable);
            addChatDrawable(i24, "drawableBotLock", chat_botLockDrawable);
            addChatDrawable(i24, "drawableBotLink", chat_botLinkDrawable);
            addChatDrawable(i24, "drawable_botInvite", chat_botInviteDrawable);
            addChatDrawable(i24, "drawableGoIcon", chat_goIconDrawable);
            addChatDrawable(i24, "drawableCommentSticker", chat_commentStickerDrawable);
            addChatDrawable(key_chat_sentErrorIcon, "drawableMsgError", chat_msgErrorDrawable);
            addChatDrawable(-1, "drawableMsgIn", chat_msgInDrawable);
            addChatDrawable(-1, "drawableMsgInSelected", chat_msgInSelectedDrawable);
            addChatDrawable(-1, "drawableMsgInMedia", chat_msgInMediaDrawable);
            addChatDrawable(-1, "drawableMsgInMediaSelected", chat_msgInMediaSelectedDrawable);
            addChatDrawable(key_chat_inInstant, "drawableMsgInInstant", chat_msgInInstantDrawable);
            addChatDrawable(-1, "drawableMsgOut", chat_msgOutDrawable);
            addChatDrawable(-1, "drawableMsgOutSelected", chat_msgOutSelectedDrawable);
            addChatDrawable(-1, "drawableMsgOutMedia", chat_msgOutMediaDrawable);
            addChatDrawable(-1, "drawableMsgOutMediaSelected", chat_msgOutMediaSelectedDrawable);
            Drawable drawable2 = drawableArr4[0];
            int i25 = key_chat_outInstant;
            addChatDrawable(i25, "drawableMsgOutCallAudio", drawable2);
            Drawable drawable3 = drawableArr5[0];
            int i26 = key_chat_outInstantSelected;
            addChatDrawable(i26, "drawableMsgOutCallAudioSelected", drawable3);
            addChatDrawable(i25, "drawableMsgOutCallVideo", drawableArr4[1]);
            addChatDrawable(i26, "drawableMsgOutCallVideo", drawableArr5[1]);
            addChatDrawable(key_chat_outSentCheck, "drawableMsgOutCheck", chat_msgOutCheckDrawable);
            addChatDrawable(key_chat_outSentCheckSelected, "drawableMsgOutCheckSelected", chat_msgOutCheckSelectedDrawable);
            Drawable drawable4 = chat_msgOutCheckReadDrawable;
            int i27 = key_chat_outSentCheckRead;
            addChatDrawable(i27, "drawableMsgOutCheckRead", drawable4);
            Drawable drawable5 = chat_msgOutCheckReadSelectedDrawable;
            int i28 = key_chat_outSentCheckReadSelected;
            addChatDrawable(i28, "drawableMsgOutCheckReadSelected", drawable5);
            addChatDrawable(i27, "drawableMsgOutHalfCheck", chat_msgOutHalfCheckDrawable);
            addChatDrawable(i28, "drawableMsgOutHalfCheckSelected", chat_msgOutHalfCheckSelectedDrawable);
            addChatDrawable(i25, "drawableMsgOutInstant", chat_msgOutInstantDrawable);
            addChatDrawable(key_chat_outMenu, "drawableMsgOutMenu", chat_msgOutMenuDrawable);
            addChatDrawable(key_chat_outMenuSelected, "drawableMsgOutMenuSelected", chat_msgOutMenuSelectedDrawable);
            Drawable drawable6 = chat_msgOutPinnedDrawable;
            int i29 = key_chat_outViews;
            addChatDrawable(i29, "drawableMsgOutPinned", drawable6);
            Drawable drawable7 = chat_msgOutPinnedSelectedDrawable;
            int i30 = key_chat_outViewsSelected;
            addChatDrawable(i30, "drawableMsgOutPinnedSelected", drawable7);
            addChatDrawable(i29, "drawableMsgOutReplies", chat_msgOutRepliesDrawable);
            addChatDrawable(i30, "drawableMsgOutReplies", chat_msgOutRepliesSelectedDrawable);
            addChatDrawable(i29, "drawableMsgOutViews", chat_msgOutViewsDrawable);
            addChatDrawable(i30, "drawableMsgOutViewsSelected", chat_msgOutViewsSelectedDrawable);
            Drawable drawable8 = chat_msgStickerCheckDrawable;
            int i31 = key_chat_serviceText;
            addChatDrawable(i31, "drawableMsgStickerCheck", drawable8);
            addChatDrawable(i31, "drawableMsgStickerHalfCheck", chat_msgStickerHalfCheckDrawable);
            addChatDrawable(i31, "drawableMsgStickerPinned", chat_msgStickerPinnedDrawable);
            addChatDrawable(i31, "drawableMsgStickerReplies", chat_msgStickerRepliesDrawable);
            addChatDrawable(i31, "drawableMsgStickerViews", chat_msgStickerViewsDrawable);
            addChatDrawable(i24, "drawableReplyIcon", chat_replyIconDrawable);
            addChatDrawable(i24, "drawableCloseIcon", chat_closeIconDrawable);
            addChatDrawable(i24, "drawableMoreIcon", chat_moreIconDrawable);
            addChatDrawable(i24, "drawableShareIcon", chat_shareIconDrawable);
            addChatDrawable(key_chat_muteIcon, "drawableMuteIcon", chat_muteIconDrawable);
            addChatDrawable(key_chat_lockIcon, "drawableLockIcon", chat_lockIconDrawable);
            addChatDrawable(key_chat_outPreviewInstantText, "drawable_chat_pollHintDrawableOut", drawableArr[1]);
            addChatDrawable(key_chat_inPreviewInstantText, "drawable_chat_pollHintDrawableIn", drawableArr[0]);
            applyChatTheme(false);
        } else {
            f = 3.0f;
            f2 = 14.0f;
        }
        TextPaint textPaint = chat_infoPaint;
        if (textPaint != null) {
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
            float f3 = ((SharedConfig.fontSize * 2) + 10) / f;
            chat_namePaint.setTextSize(AndroidUtilities.dp(f3));
            chat_replyNamePaint.setTextSize(AndroidUtilities.dp(f3));
            chat_replyTextPaint.setTextSize(AndroidUtilities.dp(f3));
            float f4 = f3 - 1.0f;
            chat_topicTextPaint.setTextSize(AndroidUtilities.dp(f4));
            chat_forwardNamePaint.setTextSize(AndroidUtilities.dp(f3));
            chat_adminPaint.setTextSize(AndroidUtilities.dp(f4));
            chat_ephemeralPaint.setTextSize(AndroidUtilities.dp(12.0f));
            chat_timePaint.setTextSize(AndroidUtilities.dp(12.0f));
            chat_gamePaint.setTextSize(AndroidUtilities.dp(13.0f));
            chat_shipmentPaint.setTextSize(AndroidUtilities.dp(13.0f));
            chat_instantViewPaint.setTextSize(AndroidUtilities.dp(13.0f));
            chat_instantViewRectPaint.setStrokeWidth(AndroidUtilities.dp(1.0f));
            chat_pollTimerPaint.setStrokeWidth(AndroidUtilities.dp(1.1f));
            chat_actionTextPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
            chat_actionTextPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
            chat_actionTextPaint3.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 3));
            chat_unlockExtendedMediaTextPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize)));
            chat_contextResult_titleTextPaint.setTextSize(AndroidUtilities.dp(15.0f));
            chat_contextResult_descriptionTextPaint.setTextSize(AndroidUtilities.dp(13.0f));
            chat_radialProgressPaint.setStrokeWidth(AndroidUtilities.dp(f));
            chat_radialProgress2Paint.setStrokeWidth(AndroidUtilities.dp(2.33f));
            chat_commentTextPaint.setTextSize(AndroidUtilities.dp(f2));
            chat_commentTextPaint.setTypeface(AndroidUtilities.bold());
        }
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
        Drawable drawableMutate = i2 != 0 ? ApplicationLoader.applicationContext.getResources().getDrawable(i2).mutate() : null;
        OvalShape ovalShape = new OvalShape();
        float f = i;
        ovalShape.resize(f, f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.getPaint().setColor(-1);
        CombinedDrawable combinedDrawable = new CombinedDrawable(shapeDrawable, drawableMutate);
        combinedDrawable.backWidth = i;
        combinedDrawable.backHeight = i;
        return combinedDrawable;
    }

    public static BaseCell.RippleDrawableSafe createCircleSelectorDrawable(int i, final int i2, final int i3) {
        maskPaint.setColor(-1);
        return new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i}), null, new Drawable() {
            @Override
            public final void draw(Canvas canvas) {
                Rect bounds = getBounds();
                int iMax = Math.max(bounds.width(), bounds.height()) / 2;
                int i4 = i2;
                int i5 = i3;
                canvas.drawCircle((bounds.centerX() - i4) + i5, bounds.centerY(), iMax + i4 + i5, Theme.maskPaint);
            }

            @Override
            public final int getOpacity() {
                return 0;
            }

            @Override
            public final void setAlpha(int i4) {
            }

            @Override
            public final void setColorFilter(ColorFilter colorFilter) {
            }
        });
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
            new Paint(1);
            chat_radialProgressPausedSeekbarPaint = new Paint(1);
            chat_videoProgressPaint = new Paint(1);
            chat_messageBackgroundSelectedPaint = new Paint(1);
            chat_actionBackgroundPaint = new Paint(7);
            chat_actionBackgroundSelectedPaint = new Paint(7);
            addChatPaint(key_chat_selectedBackground, chat_messageBackgroundSelectedPaint, "paintChatMessageBackgroundSelected");
            Paint paint12 = chat_actionBackgroundPaint;
            int i = key_chat_serviceBackground;
            addChatPaint(i, paint12, "paintChatActionBackground");
            addChatPaint(i, chat_actionBackgroundGradientDarkenPaint, "paintChatActionBackgroundDarken");
            addChatPaint(key_chat_serviceBackgroundSelected, chat_actionBackgroundSelectedPaint, "paintChatActionBackgroundSelected");
            TextPaint textPaint16 = chat_actionTextPaint;
            int i2 = key_chat_serviceText;
            addChatPaint(i2, textPaint16, "paintChatActionText");
            addChatPaint(i2, chat_actionTextPaint2, "paintChatActionText2");
            addChatPaint(i2, chat_actionTextPaint3, "paintChatActionText3");
            addChatPaint(key_chat_botButtonText, chat_botButtonPaint, "paintChatBotButton");
            addChatPaint(key_chat_messagePanelBackground, chat_composeBackgroundPaint, "paintChatComposeBackground");
            addChatPaint(key_chat_mediaTimeBackground, chat_timeBackgroundPaint, "paintChatTimeBackground");
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
                    new TextPaint(1);
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
            Drawable drawable = resources.getDrawable(R.drawable.chats_saved);
            Drawable[] drawableArr = avatarDrawables;
            drawableArr[0] = drawable;
            drawableArr[1] = resources.getDrawable(R.drawable.ghost);
            int i = R.drawable.msg_folders_private;
            drawableArr[2] = resources.getDrawable(i);
            drawableArr[3] = resources.getDrawable(R.drawable.msg_folders_requests);
            drawableArr[4] = resources.getDrawable(R.drawable.msg_folders_groups);
            drawableArr[5] = resources.getDrawable(R.drawable.msg_folders_channels);
            drawableArr[6] = resources.getDrawable(R.drawable.msg_folders_bots);
            drawableArr[7] = resources.getDrawable(R.drawable.msg_folders_muted);
            drawableArr[8] = resources.getDrawable(R.drawable.msg_folders_read);
            drawableArr[9] = resources.getDrawable(R.drawable.msg_folders_archive);
            drawableArr[10] = resources.getDrawable(i);
            drawableArr[11] = resources.getDrawable(R.drawable.chats_replies);
            drawableArr[12] = resources.getDrawable(R.drawable.other_chats);
            drawableArr[13] = resources.getDrawable(R.drawable.msg_stories_closefriends);
            drawableArr[14] = resources.getDrawable(R.drawable.filled_gift_premium);
            drawableArr[15] = resources.getDrawable(R.drawable.filled_unknown);
            drawableArr[16] = resources.getDrawable(R.drawable.filled_unclaimed);
            drawableArr[17] = resources.getDrawable(R.drawable.large_repost_story);
            drawableArr[18] = resources.getDrawable(R.drawable.large_hidden);
            drawableArr[19] = resources.getDrawable(R.drawable.large_notes);
            drawableArr[20] = resources.getDrawable(R.drawable.filled_folder_new);
            drawableArr[21] = resources.getDrawable(R.drawable.filled_folder_existing);
            drawableArr[22] = resources.getDrawable(R.drawable.filled_giveaway_premium);
            drawableArr[23] = resources.getDrawable(R.drawable.filled_giveaway_stars);
            drawableArr[24] = resources.getDrawable(R.drawable.filled_suggest_chat_avatar);
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

    public static MotionBackgroundDrawable createDefaultWallpaper(int i, int i2) {
        MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable(-2368069, -9722489, -2762611, -7817084, i != 0, 0, false);
        if (i <= 0 || i2 <= 0) {
            Point point = AndroidUtilities.displaySize;
            i = Math.min(point.x, point.y);
            Point point2 = AndroidUtilities.displaySize;
            i2 = Math.max(point2.x, point2.y);
        }
        motionBackgroundDrawable.setPatternBitmap(SvgHelper.getBitmap(R.raw.default_pattern, i, i2, -16777216, 1.0f, SvgHelper.ScaleMode.ByWidth), 34);
        motionBackgroundDrawable.setPatternColorFilter(motionBackgroundDrawable.getPatternColor());
        return motionBackgroundDrawable;
    }

    public static void createDialogsResources(Context context) {
        createCommonResources(context);
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
            TextPaint textPaint3 = new TextPaint(1);
            dialogs_searchNamePaint = textPaint3;
            textPaint3.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint4 = new TextPaint(1);
            dialogs_searchNameEncryptedPaint = textPaint4;
            textPaint4.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint5 = new TextPaint(1);
            dialogs_messageNamePaint = textPaint5;
            textPaint5.setTypeface(AndroidUtilities.bold());
            dialogs_timePaint = new TextPaint(1);
            dialogs_timePaintBold = new TextPaint(1);
            dialogs_timePaintBoldAccent = new TextPaint(1);
            TextPaint textPaint6 = new TextPaint(1);
            dialogs_archiveTextPaint = textPaint6;
            textPaint6.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint7 = new TextPaint(1);
            dialogs_archiveTextPaintSmall = textPaint7;
            textPaint7.setTypeface(AndroidUtilities.bold());
            dialogs_onlinePaint = new TextPaint(1);
            dialogs_offlinePaint = new TextPaint(1);
            TextPaint textPaint8 = new TextPaint(1);
            dialogs_tagTextPaint = textPaint8;
            textPaint8.setTypeface(AndroidUtilities.bold());
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
            dialogs_scamDrawable = new ScamDrawable(0);
            dialogs_fakeDrawable = new ScamDrawable(1);
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
            Path path = new Path();
            Path[] pathArr = chat_updatePath;
            pathArr[0] = path;
            pathArr[2] = new Path();
            float fDp = AndroidUtilities.dp(12.0f);
            float fDp2 = AndroidUtilities.dp(12.0f);
            rectF.set(fDp - AndroidUtilities.dp(5.0f), fDp2 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f) + fDp, AndroidUtilities.dp(5.0f) + fDp2);
            pathArr[2].arcTo(rectF, -160.0f, -110.0f, true);
            pathArr[2].arcTo(rectF, 20.0f, -110.0f, true);
            pathArr[0].moveTo(fDp, AndroidUtilities.dp(8.0f) + fDp2);
            pathArr[0].lineTo(fDp, AndroidUtilities.dp(2.0f) + fDp2);
            pathArr[0].lineTo(AndroidUtilities.dp(3.0f) + fDp, AndroidUtilities.dp(5.0f) + fDp2);
            pathArr[0].close();
            pathArr[0].moveTo(fDp, fDp2 - AndroidUtilities.dp(8.0f));
            pathArr[0].lineTo(fDp, fDp2 - AndroidUtilities.dp(2.0f));
            pathArr[0].lineTo(fDp - AndroidUtilities.dp(3.0f), fDp2 - AndroidUtilities.dp(5.0f));
            pathArr[0].close();
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

    public static AnonymousClass3 createEditTextDrawable(Context context) {
        int color = getColor(null, key_dialogInputField, false);
        int color2 = getColor(null, key_dialogInputFieldActivated, false);
        Resources resources = context.getResources();
        Drawable drawableMutate = resources.getDrawable(R.drawable.search_dark).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(color, mode));
        Drawable drawableMutate2 = resources.getDrawable(R.drawable.search_dark_activated).mutate();
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(color2, mode));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        anonymousClass3.addState(new int[]{16842910, 16842908}, drawableMutate2);
        anonymousClass3.addState(new int[]{16842908}, drawableMutate2);
        anonymousClass3.addState(StateSet.WILD_CARD, drawableMutate);
        return anonymousClass3;
    }

    public static AnonymousClass3 createEmojiIconSelectorDrawable(Context context, int i, int i2, int i3) {
        Resources resources = context.getResources();
        Drawable drawableMutate = resources.getDrawable(i).mutate();
        if (i2 != 0) {
            drawableMutate.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
        }
        Drawable drawableMutate2 = resources.getDrawable(i).mutate();
        if (i3 != 0) {
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
        }
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        anonymousClass3.setEnterFadeDuration(1);
        anonymousClass3.setExitFadeDuration(200);
        anonymousClass3.addState(new int[]{16842913}, drawableMutate2);
        anonymousClass3.addState(new int[0], drawableMutate);
        return anonymousClass3;
    }

    public static BaseCell.RippleDrawableSafe createInsetRoundRectDrawable(float f, int i, int i2) {
        return createInsetRoundRectDrawable(f, 285212671, i, i2, i, i2);
    }

    public static BaseCell.RippleDrawableSafe createRadSelectorDrawable(int i, int i2, int i3) {
        maskPaint.setColor(-1);
        return new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i}), null, new RippleRadMaskDrawable(i2, i3));
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
        shapeDrawable.getPaint().setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), multAlpha(Color.alpha(i2) / 255.0f, 285212672));
        return new InsetDrawable((Drawable) shapeDrawable, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
    }

    public static BaseCell.RippleDrawableSafe createSelectorDrawable(int i, int i2) {
        return createSelectorDrawable(i, i2, -1);
    }

    public static BaseCell.RippleDrawableSafe createSelectorWithBackgroundDrawable(int i, int i2) {
        return new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i2}), new ColorDrawable(i), new ColorDrawable(i));
    }

    public static BaseCell.RippleDrawableSafe createSimpleSelectorCircleDrawable(int i, int i2, int i3) {
        OvalShape ovalShape = new OvalShape();
        float f = i;
        ovalShape.resize(f, f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.getPaint().setColor(i2);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(ovalShape);
        shapeDrawable2.getPaint().setColor(-1);
        return new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i3}), shapeDrawable, shapeDrawable2);
    }

    public static BaseCell.RippleDrawableSafe createSimpleSelectorRoundRectDrawable(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        float f = i;
        float f2 = i2;
        float f3 = i3;
        float f4 = i4;
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.setPadding(0, 0, 0, 0);
        shapeDrawable.getPaint().setColor(i5);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable2.getPaint().setColor(i7);
        shapeDrawable2.setPadding(0, 0, 0, 0);
        return new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i6}), shapeDrawable, shapeDrawable2);
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
            OverrideWallpaperInfo.access$1300(overrideWallpaperInfo);
        }
        if (z3) {
            themeInfo.setCurrentAccentId(((ThemeAccent) themeInfo.themeAccents.get(0)).id);
        }
        if (z) {
            saveThemeAccents(themeInfo, true, false, false, false, false);
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
            if (TextUtils.isEmpty(strArr[0])) {
                themedWallpaperLink = null;
                return themeInfo;
            }
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
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static Paint fillingPaint(int i) {
        Paint paint = PAINT_FILLING;
        if (paint.getColor() != i) {
            paint.setColor(i);
        }
        return paint;
    }

    public static ThemeInfo getActiveTheme() {
        return currentTheme;
    }

    public static AudioVisualizerDrawable getAnimatedOutAudioVisualizerDrawable(MessageObject messageObject) {
        HashMap map = animatedOutVisualizerDrawables;
        if (map == null || messageObject == null) {
            return null;
        }
        return (AudioVisualizerDrawable) map.get(messageObject);
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

    public static Drawable getCachedWallpaper() {
        Drawable drawable = themedWallpaper;
        if (drawable == null) {
            drawable = wallpaper;
        }
        if (drawable != null || wallpaperLoadTask == null) {
            return drawable;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Utilities.themeQueue.postRunnable(new Theme$$ExternalSyntheticLambda8(countDownLatch, 17));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        Drawable drawable2 = themedWallpaper;
        return drawable2 != null ? drawable2 : wallpaper;
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
            statusDrawableArr[3] = new PlayingGameDrawable(null, true);
        } else if (i == 4) {
            statusDrawableArr[4] = new RoundStatusDrawable(true);
        } else if (i == 5) {
            statusDrawableArr[5] = new RecordStatusDrawable();
        }
        StatusDrawable statusDrawable2 = statusDrawableArr[i];
        statusDrawable2.start();
        statusDrawable2.setColor(getColor(null, key_chats_actionMessage, false));
        return statusDrawable2;
    }

    public static int getColor(int i, ResourcesProvider resourcesProvider) {
        return resourcesProvider != null ? resourcesProvider.getColor(i) : getColor(null, i, false);
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

    public static int getDefaultColor(int i) {
        int i2 = defaultColors[i];
        if (i2 != 0) {
            return i2;
        }
        int i3 = fallbackKeys.get(i, -1);
        if (i3 != -1) {
            return getDefaultColor(i3);
        }
        return ((i >= myMessagesBubblesStartIndex && i < myMessagesBubblesEndIndex) || i == key_chats_menuTopShadow || i == key_chats_menuTopBackground || i == key_chats_menuTopShadowCats || i == key_chat_wallpaper_gradient_to2 || i == key_chat_wallpaper_gradient_to3) ? 0 : -65536;
    }

    public static FragmentContextViewWavesDrawable getFragmentContextViewWavesDrawable() {
        if (fragmentContextViewWavesDrawable == null) {
            fragmentContextViewWavesDrawable = new FragmentContextViewWavesDrawable();
        }
        return fragmentContextViewWavesDrawable;
    }

    public static int getNonAnimatedColor(int i) {
        return getColor(null, i, true);
    }

    public static BaseCell.RippleDrawableSafe getRoundRectSelectorDrawable(int i, int i2) {
        return new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{(i2 & 16777215) | 419430400}), null, createRoundRectDrawable(i, -1));
    }

    public static String getSelectedBackgroundSlug() {
        OverrideWallpaperInfo overrideWallpaperInfo = currentTheme.overrideWallpaper;
        if (overrideWallpaperInfo != null) {
            return overrideWallpaperInfo.slug;
        }
        return hasWallpaperFromTheme() ? "t" : "d";
    }

    public static BaseCell.RippleDrawableSafe getSelectorDrawable(boolean z) {
        int color = getColor(null, key_listSelector, false);
        if (!z) {
            return createSelectorDrawable(color, 2, -1);
        }
        int i = key_windowBackgroundWhite;
        return i >= 0 ? new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{color}), new ColorDrawable(getColor(null, i, false)), new ColorDrawable(-1)) : createSelectorDrawable(color, 2, -1);
    }

    public static Drawable getStateDrawable(int i, Drawable drawable) {
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

    public static float[] getTempHsv(int i) {
        ThreadLocal threadLocal;
        if (i == 1) {
            threadLocal = hsvTemp1Local;
        } else if (i == 2) {
            threadLocal = hsvTemp2Local;
        } else if (i != 3) {
            threadLocal = i != 4 ? hsvTemp5Local : hsvTemp4Local;
        } else {
            threadLocal = hsvTemp3Local;
        }
        float[] fArr = (float[]) threadLocal.get();
        if (fArr != null) {
            return fArr;
        }
        float[] fArr2 = new float[3];
        threadLocal.set(fArr2);
        return fArr2;
    }

    public static Drawable getThemeDrawable(String str, ResourcesProvider resourcesProvider) {
        Drawable drawable = resourcesProvider != null ? resourcesProvider.getDrawable(str) : null;
        return drawable != null ? drawable : (Drawable) defaultChatDrawables.get(str);
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
                                if (!str2.startsWith("WLS=")) {
                                    if (str2.startsWith("WPS")) {
                                        i3 = i5 + i9;
                                        z = true;
                                        break;
                                    }
                                    int iIndexOf = str2.indexOf(61);
                                    if (iIndexOf != i) {
                                        String strSubstring = str2.substring(0, iIndexOf);
                                        String strSubstring2 = str2.substring(iIndexOf + 1);
                                        if (strSubstring2.length() <= 0 || strSubstring2.charAt(0) != '#') {
                                            iIntValue = Utilities.parseInt((CharSequence) strSubstring2).intValue();
                                        } else {
                                            try {
                                                iIntValue = Color.parseColor(strSubstring2);
                                            } catch (Exception unused) {
                                                iIntValue = Utilities.parseInt((CharSequence) strSubstring2).intValue();
                                            }
                                        }
                                        int iStringKeyToInt = OKLCH.stringKeyToInt(strSubstring);
                                        if (iStringKeyToInt >= 0) {
                                            sparseIntArray.put(iStringKeyToInt, iIntValue);
                                        }
                                    }
                                    th = th;
                                    try {
                                        FileLog.e(th);
                                        if (fileInputStream != null) {
                                            fileInputStream.close();
                                        }
                                        return sparseIntArray;
                                    } catch (Throwable th) {
                                        if (fileInputStream == null) {
                                            throw th;
                                        }
                                        try {
                                            fileInputStream.close();
                                            throw th;
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                            throw th;
                                        }
                                    }
                                }
                                if (strArr != null && strArr.length > 0) {
                                    strArr[0] = str2.substring(4);
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
                    } catch (Throwable th2) {
                        th = th2;
                        FileLog.e(th);
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return sparseIntArray;
                    }
                }
                sparseIntArray.put(key_wallpaperFileOffset, i3);
                fileInputStream.close();
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
        return sparseIntArray;
    }

    public static Paint getThemePaint(String str, ResourcesProvider resourcesProvider) {
        Paint paint;
        return (resourcesProvider == null || (paint = resourcesProvider.getPaint(str)) == null) ? getThemePaint(str) : paint;
    }

    public static Drawable getThemedDrawable(Context context, int i, int i2) {
        if (context == null) {
            return null;
        }
        Drawable drawableMutate = context.getResources().getDrawable(i).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
        return drawableMutate;
    }

    public static Drawable getThemedDrawableByKey(Context context, int i, int i2) {
        return getThemedDrawable(context, i, getColor(null, i2, false));
    }

    public static Drawable getThemedWallpaper(final View view, final boolean z) {
        MotionBackgroundDrawable motionBackgroundDrawable;
        File assetFile;
        int i;
        Throwable th;
        FileInputStream fileInputStream;
        BitmapFactory.Options options;
        Bitmap.Config config;
        Bitmap bitmapDecodeStream;
        BitmapDrawable bitmapDrawable;
        ThemeAccent accent;
        int i2;
        float f;
        float f2;
        int iDp;
        float f3;
        File pathToWallpaper;
        int i3 = currentColors.get(key_chat_wallpaper);
        int i4 = 1;
        try {
            if (i3 != 0) {
                int i5 = currentColors.get(key_chat_wallpaper_gradient_to1);
                int i6 = currentColors.get(key_chat_wallpaper_gradient_to2);
                int i7 = currentColors.get(key_chat_wallpaper_gradient_to3);
                int i8 = currentColors.get(key_chat_wallpaper_gradient_rotation, -1);
                if (i8 == -1) {
                    i8 = 45;
                }
                if (i5 == 0) {
                    return new ColorDrawable(i3);
                }
                ThemeAccent accent2 = currentTheme.getAccent(false);
                assetFile = (accent2 == null || TextUtils.isEmpty(accent2.patternSlug) || previousTheme != null || (pathToWallpaper = accent2.getPathToWallpaper()) == null || !pathToWallpaper.exists()) ? null : pathToWallpaper;
                if (i6 != 0) {
                    motionBackgroundDrawable = new MotionBackgroundDrawable(i3, i5, i6, i7, true, 0, false);
                    if (assetFile == null) {
                        return motionBackgroundDrawable;
                    }
                } else {
                    if (assetFile == null) {
                        BackgroundGradientDrawable backgroundGradientDrawable = new BackgroundGradientDrawable(BackgroundGradientDrawable.getGradientOrientation(i8), new int[]{i3, i5});
                        backgroundGradientDrawable.startDithering(!z ? Stripe.ofDeviceScreen(0.5f, 3) : Stripe.ofDeviceScreen(0.125f, 1), view != null ? new zzms() {
                            @Override
                            public final void onSizeReady(int i9, int i10) {
                                boolean z2 = z;
                                View view2 = view;
                                if (z2) {
                                    view2.invalidate();
                                    return;
                                }
                                Point point = AndroidUtilities.displaySize;
                                if ((point.x <= point.y) == (i9 <= i10)) {
                                    view2.invalidate();
                                }
                            }
                        } : null, 0L);
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
                                        i4 *= 2;
                                        f /= 2.0f;
                                        f2 /= 2.0f;
                                    }
                                }
                                config = Bitmap.Config.ALPHA_8;
                                options.inPreferredConfig = config;
                                options.inJustDecodeBounds = false;
                                options.inSampleSize = i4;
                                bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                                if (motionBackgroundDrawable != null) {
                                    if (bitmapDecodeStream != null) {
                                        fileInputStream.close();
                                        return null;
                                    }
                                    bitmapDrawable = new BitmapDrawable(bitmapDecodeStream);
                                    try {
                                        fileInputStream.close();
                                        return bitmapDrawable;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return bitmapDrawable;
                                    }
                                }
                                accent = currentTheme.getAccent(false);
                                if (accent != null) {
                                    i2 = (int) (accent.patternIntensity * 100.0f);
                                } else {
                                    i2 = 100;
                                }
                                if (bitmapDecodeStream != null && bitmapDecodeStream.getConfig() != config) {
                                    Bitmap bitmapCopy = bitmapDecodeStream.copy(config, false);
                                    bitmapDecodeStream.recycle();
                                    bitmapDecodeStream = bitmapCopy;
                                }
                                motionBackgroundDrawable.setPatternBitmap(bitmapDecodeStream, i2);
                                motionBackgroundDrawable.setPatternColorFilter(motionBackgroundDrawable.getPatternColor());
                                try {
                                    fileInputStream.close();
                                    return motionBackgroundDrawable;
                                } catch (Exception e2) {
                                    FileLog.e(e2);
                                    return motionBackgroundDrawable;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    FileLog.e(th);
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                    return null;
                                } catch (Throwable th3) {
                                    if (fileInputStream == null) {
                                        throw th3;
                                    }
                                    try {
                                        fileInputStream.close();
                                        throw th3;
                                    } catch (Exception e3) {
                                        FileLog.e(e3);
                                        throw th3;
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            fileInputStream = null;
                        }
                    }
                    return null;
                }
                motionBackgroundDrawable = null;
                assetFile = null;
            }
            if (assetFile != null) {
                fileInputStream = new FileInputStream(assetFile);
                fileInputStream.getChannel().position(i);
                options = new BitmapFactory.Options();
                if (z) {
                    options.inJustDecodeBounds = true;
                    f = options.outWidth;
                    f2 = options.outHeight;
                    iDp = AndroidUtilities.dp(100.0f);
                    while (true) {
                        f3 = iDp;
                        if (f > f3) {
                        }
                        i4 *= 2;
                        f /= 2.0f;
                        f2 /= 2.0f;
                    }
                }
                config = Bitmap.Config.ALPHA_8;
                options.inPreferredConfig = config;
                options.inJustDecodeBounds = false;
                options.inSampleSize = i4;
                bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                if (motionBackgroundDrawable != null) {
                    if (bitmapDecodeStream != null) {
                        fileInputStream.close();
                        return null;
                    }
                    bitmapDrawable = new BitmapDrawable(bitmapDecodeStream);
                    fileInputStream.close();
                    return bitmapDrawable;
                }
                accent = currentTheme.getAccent(false);
                if (accent != null) {
                    i2 = (int) (accent.patternIntensity * 100.0f);
                } else {
                    i2 = 100;
                }
                if (bitmapDecodeStream != null) {
                    Bitmap bitmapCopy2 = bitmapDecodeStream.copy(config, false);
                    bitmapDecodeStream.recycle();
                    bitmapDecodeStream = bitmapCopy2;
                }
                motionBackgroundDrawable.setPatternBitmap(bitmapDecodeStream, i2);
                motionBackgroundDrawable.setPatternColorFilter(motionBackgroundDrawable.getPatternColor());
                fileInputStream.close();
                return motionBackgroundDrawable;
            }
        } catch (Exception e4) {
            FileLog.e(e4);
        }
        i = 0;
        return null;
    }

    public static int getWallpaperColor(int i) {
        if (i == 0) {
            return 0;
        }
        return i | (-16777216);
    }

    public static String getWallpaperUrl(OverrideWallpaperInfo overrideWallpaperInfo) {
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
                    StringBuilder sbM = Log.m(zzit.m(lowerCase, "-", lowerCase2), "&rotation=");
                    sbM.append(overrideWallpaperInfo.rotation);
                    lowerCase = sbM.toString();
                }
            } else if (lowerCase4 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(lowerCase);
                sb2.append("~");
                sb2.append(lowerCase2);
                sb2.append("~");
                sb2.append(lowerCase3);
                lowerCase = MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(sb2, "~", lowerCase4);
            } else {
                lowerCase = lowerCase + "~" + lowerCase2 + "~" + lowerCase3;
            }
            str = "https://attheme.org?slug=" + overrideWallpaperInfo.slug + "&intensity=" + ((int) (overrideWallpaperInfo.intensity * 100.0f)) + "&bg_color=" + lowerCase;
        }
        if (sb.length() <= 0) {
            return str;
        }
        StringBuilder sbM2 = Log.m(str, "&mode=");
        sbM2.append(sb.toString());
        return sbM2.toString();
    }

    public static boolean hasCustomWallpaper() {
        return isApplyingAccent && currentTheme.overrideWallpaper != null;
    }

    public static boolean hasGradientService() {
        return serviceBitmapShader != null;
    }

    public static boolean hasHue(int i) {
        float[] tempHsv = getTempHsv(3);
        Color.colorToHSV(i, tempHsv);
        float f = tempHsv[1];
        return f > 0.1f && f < 0.9f;
    }

    public static boolean hasThemeKey(int i) {
        return currentColors.indexOfKey(i) >= 0;
    }

    public static boolean hasWallpaperFromTheme() {
        ThemeInfo themeInfo = currentTheme;
        if (themeInfo.firstAccentIsDefault && themeInfo.currentAccentId == DEFALT_THEME_ACCENT_ID) {
            return false;
        }
        return currentColors.indexOfKey(key_chat_wallpaper) >= 0 || themedWallpaperFileOffset > 0 || !TextUtils.isEmpty(themedWallpaperLink);
    }

    public static boolean isCurrentThemeDark() {
        return currentTheme.isDark();
    }

    public static boolean isCurrentThemeDay() {
        return !currentTheme.isDark();
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

    public static void loadRemoteThemes(int i, boolean z) {
        boolean[] zArr = loadingRemoteThemes;
        if (zArr[i]) {
            return;
        }
        if ((z || Math.abs((System.currentTimeMillis() / 1000) - ((long) lastLoadingThemesTime[i])) >= 3600) && UserConfig.getInstance(i).isClientActivated()) {
            zArr[i] = true;
            TL_account.getThemes getthemes = new TL_account.getThemes();
            getthemes.format = "android";
            if (!MediaDataController.getInstance(i).defaultEmojiThemes.isEmpty()) {
                getthemes.hash = remoteThemesHash[i];
            }
            if (BuildVars.LOGS_ENABLED) {
                android.util.Log.i("theme", "loading remote themes, hash " + getthemes.hash);
            }
            ConnectionsManager.getInstance(i).sendRequest(getthemes, new Theme$$ExternalSyntheticLambda9(i, 0));
        }
    }

    public static Bitmap loadScreenSizedBitmap(FileInputStream fileInputStream, int i) {
        int i2;
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
            float fMin = (iMin < iMax || f <= f2) ? Math.min(f / iMin, f2 / iMax) : Math.max(f / iMin, f2 / iMax);
            if (fMin < 1.2f) {
                fMin = 1.0f;
            }
            options.inJustDecodeBounds = false;
            if (fMin <= 1.0f || (f <= iMin && f2 <= iMax)) {
                options.inSampleSize = (int) fMin;
            } else {
                int i3 = 1;
                while (true) {
                    i2 = i3 * 2;
                    if (i3 * 4 >= fMin) {
                        break;
                    }
                    i3 = i2;
                }
                options.inSampleSize = i2;
            }
            fileInputStream.getChannel().position(j);
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
            if (bitmapDecodeStream.getWidth() < iMin || bitmapDecodeStream.getHeight() < iMax) {
                float fMax = Math.max(iMin / bitmapDecodeStream.getWidth(), iMax / bitmapDecodeStream.getHeight());
                if (fMax >= 1.02f) {
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeStream, (int) (bitmapDecodeStream.getWidth() * fMax), (int) (bitmapDecodeStream.getHeight() * fMax), true);
                    bitmapDecodeStream.recycle();
                    return bitmapCreateScaledBitmap;
                }
            }
            return bitmapDecodeStream;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        } finally {
            try {
                fileInputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void loadWallpaper(boolean z) {
        File file;
        TLRPC.Document document;
        boolean z2;
        float f;
        float f2;
        int i;
        Drawable drawableLoadWallpaperInternal;
        TLRPC.WallPaper wallPaper;
        if (wallpaper != null) {
            return;
        }
        ThemeInfo themeInfo = currentTheme;
        boolean z3 = themeInfo.firstAccentIsDefault && themeInfo.currentAccentId == DEFALT_THEME_ACCENT_ID;
        ThemeAccent accent = themeInfo.getAccent(false);
        TLRPC.Document document2 = null;
        if (accent != null) {
            File pathToWallpaper = accent.getPathToWallpaper();
            boolean z4 = accent.patternMotion;
            TLRPC.TL_theme tL_theme = accent.info;
            TLRPC.ThemeSettings themeSettings = (tL_theme == null || tL_theme.settings.size() <= 0) ? null : accent.info.settings.get(0);
            if (accent.info != null && themeSettings != null && (wallPaper = themeSettings.wallpaper) != null) {
                document2 = wallPaper.document;
            }
            document = document2;
            z2 = z4;
            file = pathToWallpaper;
        } else {
            file = null;
            document = null;
            z2 = false;
        }
        ThemeInfo themeInfo2 = currentTheme;
        OverrideWallpaperInfo overrideWallpaperInfo = themeInfo2.overrideWallpaper;
        if (overrideWallpaperInfo == null) {
            if (accent != null) {
                f2 = accent.patternIntensity;
            } else {
                f = themeInfo2.patternIntensity;
            }
            i = (int) f;
            if (z) {
                DispatchQueue dispatchQueue = Utilities.themeQueue;
                Theme$$ExternalSyntheticLambda4 theme$$ExternalSyntheticLambda4 = new Theme$$ExternalSyntheticLambda4(overrideWallpaperInfo, file, i, z2, document, z3);
                wallpaperLoadTask = theme$$ExternalSyntheticLambda4;
                dispatchQueue.postRunnable(theme$$ExternalSyntheticLambda4);
                return;
            }
            drawableLoadWallpaperInternal = loadWallpaperInternal(overrideWallpaperInfo, file, i, z2, document, z3);
            createCommonChatResources();
            if (!disallowChangeServiceMessageColor) {
                applyChatServiceMessageColor(drawableLoadWallpaperInternal);
                applyChatMessageSelectedBackgroundColor(drawableLoadWallpaperInternal);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
        }
        f2 = overrideWallpaperInfo.intensity;
        f = f2 * 100.0f;
        i = (int) f;
        if (z) {
            DispatchQueue dispatchQueue2 = Utilities.themeQueue;
            Theme$$ExternalSyntheticLambda4 theme$$ExternalSyntheticLambda5 = new Theme$$ExternalSyntheticLambda4(overrideWallpaperInfo, file, i, z2, document, z3);
            wallpaperLoadTask = theme$$ExternalSyntheticLambda5;
            dispatchQueue2.postRunnable(theme$$ExternalSyntheticLambda5);
            return;
        }
        drawableLoadWallpaperInternal = loadWallpaperInternal(overrideWallpaperInfo, file, i, z2, document, z3);
        createCommonChatResources();
        if (!disallowChangeServiceMessageColor) {
            applyChatServiceMessageColor(drawableLoadWallpaperInternal);
            applyChatMessageSelectedBackgroundColor(drawableLoadWallpaperInternal);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetNewWallpapper, new Object[0]);
    }

    public static Drawable loadWallpaperInternal(OverrideWallpaperInfo overrideWallpaperInfo, File file, int i, boolean z, TLRPC.Document document, boolean z2) {
        MHTML mhtmlCreateBackgroundDrawable = createBackgroundDrawable(currentTheme, overrideWallpaperInfo, currentColors, file, themedWallpaperLink, themedWallpaperFileOffset, i, previousPhase, z2, hasPreviousTheme, isApplyingAccent, z, document, false);
        Boolean bool = (Boolean) mhtmlCreateBackgroundDrawable.entries;
        isWallpaperMotion = bool != null ? bool.booleanValue() : isWallpaperMotion;
        Boolean bool2 = (Boolean) mhtmlCreateBackgroundDrawable.entriesByLocation;
        isPatternWallpaper = bool2 != null ? bool2.booleanValue() : isPatternWallpaper;
        Boolean bool3 = (Boolean) mhtmlCreateBackgroundDrawable.filePos;
        isCustomTheme = bool3 != null ? bool3.booleanValue() : isCustomTheme;
        Drawable drawable = (Drawable) mhtmlCreateBackgroundDrawable.file;
        wallpaper = drawable != null ? drawable : wallpaper;
        int[] iArrCalcDrawableColor = AndroidUtilities.calcDrawableColor(drawable);
        int i2 = iArrCalcDrawableColor[0];
        serviceMessageColorBackup = i2;
        serviceMessageColor = i2;
        int i3 = iArrCalcDrawableColor[1];
        serviceSelectedMessageColorBackup = i3;
        serviceSelectedMessageColor = i3;
        Drawable drawable2 = wallpaper;
        if (drawable2 != null) {
            applyChatServiceMessageColor(drawable2);
        }
        return drawable;
    }

    public static int multAlpha(float f, int i) {
        return f == 1.0f ? i : ColorUtils.setAlphaComponent(i, MathUtils.clamp((int) (Color.alpha(i) * f), 0, 255));
    }

    public static int needSwitchToTheme() {
        Sensor sensor;
        AnonymousClass11 anonymousClass11;
        int i;
        int i2;
        int i3 = selectedAutoNightType;
        if (i3 == 1) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i4 = calendar.get(12) + (calendar.get(11) * 60);
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
            if (!lightSensorRegistered && (sensor = lightSensor) != null && (anonymousClass11 = ambientSensorListener) != null) {
                sensorManager.registerListener(anonymousClass11, sensor, 500000);
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
        if (profile_verifiedDrawable != null) {
            profile_aboutTextPaint.setColor(getColor(null, key_windowBackgroundWhiteBlackText, false));
            profile_aboutTextPaint.linkColor = getColor(null, key_windowBackgroundWhiteLinkText, false);
            setDrawableColorByKey(key_profile_verifiedBackground, profile_verifiedDrawable);
            setDrawableColorByKey(key_profile_verifiedCheck, profile_verifiedCheckDrawable);
        }
        applyChatTheme(z);
        AndroidUtilities.runOnUIThread(new LiteMode$$ExternalSyntheticLambda0(3, !hasPreviousTheme));
    }

    public static void reloadWallpaper(boolean z) {
        BackgroundGradientDrawable$$ExternalSyntheticLambda1 backgroundGradientDrawable$$ExternalSyntheticLambda1 = backgroundGradientDisposable;
        if (backgroundGradientDrawable$$ExternalSyntheticLambda1 != null) {
            backgroundGradientDrawable$$ExternalSyntheticLambda1.dispose();
            backgroundGradientDisposable = null;
        }
        Drawable drawable = wallpaper;
        if (drawable instanceof MotionBackgroundDrawable) {
            previousPhase = ((MotionBackgroundDrawable) drawable).phase;
        } else {
            previousPhase = 0;
        }
        wallpaper = null;
        themedWallpaper = null;
        loadWallpaper(z);
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

    public static void saveCurrentTheme(ThemeInfo themeInfo, boolean z, boolean z2, boolean z3) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        Throwable th;
        OverrideWallpaperInfo overrideWallpaperInfo = themeInfo.overrideWallpaper;
        String wallpaperUrl = overrideWallpaperInfo != null ? getWallpaperUrl(overrideWallpaperInfo) : themedWallpaperLink;
        Drawable drawable = z2 ? wallpaper : themedWallpaper;
        if (z2 && drawable != null) {
            themedWallpaper = wallpaper;
        }
        ThemeAccent accent = currentTheme.getAccent(false);
        boolean z4 = currentTheme.firstAccentIsDefault && accent.id == DEFALT_THEME_ACCENT_ID;
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
        int i5 = key_chat_wallpaper_gradient_to3;
        int i6 = key_chat_wallpaper_gradient_to2;
        int i7 = key_chat_wallpaper_gradient_to1;
        int i8 = key_chat_wallpaper;
        if (z4) {
            int i9 = 0;
            while (true) {
                int[] iArr = defaultColors;
                if (i9 >= iArr.length) {
                    break;
                }
                int i10 = iArr[i9];
                if ((!(drawable instanceof BitmapDrawable) && wallpaperUrl == null) || (i8 != i9 && i7 != i9 && i6 != i9 && i5 != i9)) {
                    if (OKLCH.colorKeysMap == null) {
                        OKLCH.colorKeysMap = OKLCH.createColorKeysMap();
                    }
                    sb.append((String) OKLCH.colorKeysMap.get(i9));
                    sb.append("=");
                    sb.append(i10);
                    sb.append("\n");
                }
                i9++;
            }
        } else {
            for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
                int iKeyAt = sparseIntArray.keyAt(i11);
                int iValueAt = sparseIntArray.valueAt(i11);
                if ((!(drawable instanceof BitmapDrawable) && wallpaperUrl == null) || (i8 != iKeyAt && i7 != iKeyAt && i6 != iKeyAt && i5 != iKeyAt)) {
                    if (OKLCH.colorKeysMap == null) {
                        OKLCH.colorKeysMap = OKLCH.createColorKeysMap();
                    }
                    sb.append((String) OKLCH.colorKeysMap.get(iKeyAt));
                    sb.append("=");
                    sb.append(iValueAt);
                    sb.append("\n");
                }
            }
        }
        try {
            try {
                fileOutputStream2 = new FileOutputStream(themeInfo.pathToFile);
                try {
                    if (sb.length() == 0 && !(drawable instanceof BitmapDrawable) && TextUtils.isEmpty(wallpaperUrl)) {
                        sb.append(' ');
                    }
                    fileOutputStream2.write(AndroidUtilities.getStringBytes(sb.toString()));
                    if (!TextUtils.isEmpty(wallpaperUrl)) {
                        fileOutputStream2.write(AndroidUtilities.getStringBytes("WLS=" + wallpaperUrl + "\n"));
                        if (z2) {
                            try {
                                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                                FileOutputStream fileOutputStream3 = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(wallpaperUrl) + ".wp"));
                                bitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream3);
                                fileOutputStream3.close();
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                    } else if (drawable instanceof BitmapDrawable) {
                        Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                        if (bitmap2 != null) {
                            fileOutputStream2.write(new byte[]{87, 80, 83, 10});
                            bitmap2.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream2);
                            fileOutputStream2.write(new byte[]{10, 87, 80, 69, 10});
                        }
                        if (z && !z3) {
                            wallpaper = drawable;
                        }
                    }
                    if (!z3) {
                        HashMap map = themesDict;
                        if (map.get(themeInfo.getKey()) == null) {
                            ArrayList arrayList = themes;
                            arrayList.add(themeInfo);
                            map.put(themeInfo.getKey(), themeInfo);
                            otherThemes.add(themeInfo);
                            saveOtherThemes(true, false);
                            Collections.sort(arrayList, new Theme$$ExternalSyntheticLambda5(0));
                        }
                        currentTheme = themeInfo;
                        if (themeInfo != currentNightTheme) {
                            currentDayTheme = themeInfo;
                        }
                        if (z4) {
                            currentColorsNoAccent.clear();
                            refreshThemeColors(false, false);
                        }
                        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                        editorEdit.putString("theme", currentDayTheme.getKey());
                        editorEdit.apply();
                    }
                    fileOutputStream2.close();
                } catch (Exception e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    try {
                        FileLog.e(e);
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (z) {
                            MessagesController.getInstance(themeInfo.account).saveThemeToServer(themeInfo, themeInfo.getAccent(false));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        fileOutputStream2 = fileOutputStream;
                        if (fileOutputStream2 == null) {
                            throw th;
                        }
                        try {
                            fileOutputStream2.close();
                            throw th;
                        } catch (Exception e2) {
                            FileLog.e(e2);
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (fileOutputStream2 == null) {
                        throw th;
                    }
                    fileOutputStream2.close();
                    throw th;
                }
            } catch (Exception e3) {
                FileLog.e(e3);
            }
        } catch (Exception e4) {
            e = e4;
            fileOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
            th = th;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 == null) {
                throw th;
            }
            fileOutputStream2.close();
            throw th;
        }
        if (z) {
            MessagesController.getInstance(themeInfo.account).saveThemeToServer(themeInfo, themeInfo.getAccent(false));
        }
    }

    public static void saveOtherThemes(boolean z, boolean z2) {
        String str;
        boolean z3;
        ArrayList arrayList;
        JSONObject jSONObject;
        int i = 0;
        SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
        if (z) {
            JSONArray jSONArray = new JSONArray();
            int i2 = 0;
            while (true) {
                ArrayList arrayList2 = otherThemes;
                if (i2 >= arrayList2.size()) {
                    break;
                }
                ThemeInfo themeInfo = (ThemeInfo) arrayList2.get(i2);
                themeInfo.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("name", themeInfo.name);
                    jSONObject.put("path", themeInfo.pathToFile);
                    jSONObject.put("account", themeInfo.account);
                    TLRPC.TL_theme tL_theme = themeInfo.info;
                    if (tL_theme != null) {
                        SerializedData serializedData = new SerializedData(tL_theme.getObjectSize());
                        themeInfo.info.serializeToStream(serializedData);
                        jSONObject.put("info", Utilities.bytesToHex(serializedData.toByteArray()));
                    }
                    jSONObject.put("loaded", themeInfo.loaded);
                } catch (Exception e) {
                    FileLog.e(e);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    jSONArray.put(jSONObject);
                }
                i2++;
            }
            editorEdit.putString("themes2", jSONArray.toString());
        }
        int i3 = 0;
        while (i3 < 4) {
            StringBuilder sb = new StringBuilder("2remoteThemesHash");
            Object objValueOf = "";
            sb.append(i3 != 0 ? Integer.valueOf(i3) : "");
            editorEdit.putLong(sb.toString(), remoteThemesHash[i3]);
            StringBuilder sb2 = new StringBuilder("lastLoadingThemesTime");
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
                } else if (i != 2) {
                    str = i != 3 ? "Night" : "Day";
                } else {
                    str = "Arctic Blue";
                }
                ThemeInfo themeInfo2 = (ThemeInfo) themesDict.get(str);
                if (themeInfo2 == null || (arrayList = themeInfo2.themeAccents) == null || arrayList.isEmpty()) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    saveThemeAccents(themeInfo2, true, false, false, false, z3);
                }
                i++;
                z2 = z3;
            }
        }
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
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
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
                refreshThemeColors(false, false);
            }
        }
        themeInfo.prevAccentId = -1;
    }

    public static void setColor(int i, int i2, boolean z) {
        int i3 = key_actionBarDefault;
        int i4 = key_windowBackgroundGray;
        int i5 = key_chat_wallpaper_gradient_to3;
        int i6 = key_chat_wallpaper_gradient_to2;
        int i7 = key_chat_wallpaper_gradient_to1;
        int i8 = key_chat_wallpaper;
        if (i == i8 || i == i7 || i == i6 || i == i5 || i == key_windowBackgroundWhite || i == i4 || i == i3 || i == key_actionBarDefaultArchived) {
            i2 |= -16777216;
        }
        if (z) {
            currentColors.delete(i);
        } else {
            currentColors.put(i, i2);
        }
        if (i == key_chat_selectedBackground) {
            applyChatMessageSelectedBackgroundColor(wallpaper);
            return;
        }
        if (i == key_chat_serviceBackground || i == key_chat_serviceBackgroundSelected) {
            Drawable drawable = wallpaper;
            if (drawable != null) {
                applyChatServiceMessageColor(drawable);
                return;
            }
            return;
        }
        if (i == i8 || i == i7 || i == i6 || i == i5 || i == key_chat_wallpaper_gradient_rotation) {
            reloadWallpaper(true);
            return;
        }
        if (i == i3) {
            if (Build.VERSION.SDK_INT >= 23) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        } else {
            if (i != i4 || Build.VERSION.SDK_INT < 26) {
                return;
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
    }

    public static void setCombinedDrawableColor(Drawable drawable, int i, boolean z) {
        if (drawable instanceof CombinedDrawable) {
            Drawable drawable2 = z ? ((CombinedDrawable) drawable).icon : ((CombinedDrawable) drawable).background;
            if (drawable2 instanceof ColorDrawable) {
                ((ColorDrawable) drawable2).setColor(i);
            } else {
                drawable2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public static void setDrawableColor(int i, Drawable drawable) {
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

    public static void setDrawableColorByKey(int i, Drawable drawable) {
        setDrawableColor(getColor(null, i, false), drawable);
    }

    public static void setEmojiDrawableColor(Drawable drawable, int i, boolean z) {
        if (drawable instanceof StateListDrawable) {
            try {
                Drawable stateDrawable = z ? getStateDrawable(0, drawable) : getStateDrawable(1, drawable);
                if (stateDrawable instanceof ShapeDrawable) {
                    ((ShapeDrawable) stateDrawable).getPaint().setColor(i);
                } else {
                    stateDrawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void setMaskDrawableRad(BaseCell.RippleDrawableSafe rippleDrawableSafe, int i, int i2) {
        if (rippleDrawableSafe != null) {
            int numberOfLayers = rippleDrawableSafe.getNumberOfLayers();
            for (int i3 = 0; i3 < numberOfLayers; i3++) {
                Drawable drawable = rippleDrawableSafe.getDrawable(i3);
                if (drawable instanceof RippleRadMaskDrawable) {
                    RippleRadMaskDrawable rippleRadMaskDrawable = (RippleRadMaskDrawable) drawable;
                    float f = i;
                    float f2 = i2;
                    float[] fArr = rippleRadMaskDrawable.radii;
                    float fDp = AndroidUtilities.dp(f);
                    fArr[3] = fDp;
                    fArr[2] = fDp;
                    fArr[1] = fDp;
                    fArr[0] = fDp;
                    float fDp2 = AndroidUtilities.dp(f2);
                    float[] fArr2 = rippleRadMaskDrawable.radii;
                    fArr2[7] = fDp2;
                    fArr2[6] = fDp2;
                    fArr2[5] = fDp2;
                    fArr2[4] = fDp2;
                    rippleRadMaskDrawable.invalidatePath = true;
                    rippleRadMaskDrawable.invalidateSelf();
                    return;
                }
            }
        }
    }

    public static boolean setSelectorDrawableColor(Drawable drawable, int i, boolean z) {
        Drawable stateDrawable;
        boolean z2;
        boolean z3 = true;
        if (!(drawable instanceof StateListDrawable)) {
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
        try {
            if (z) {
                Drawable stateDrawable2 = getStateDrawable(0, drawable);
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
                stateDrawable = getStateDrawable(1, drawable);
            } else {
                stateDrawable = getStateDrawable(2, drawable);
                z2 = false;
            }
            if (!(stateDrawable instanceof ShapeDrawable)) {
                stateDrawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                return z2;
            }
            if (((ShapeDrawable) stateDrawable).getPaint().getColor() == i && !z2) {
                z3 = false;
            }
            try {
                ((ShapeDrawable) stateDrawable).getPaint().setColor(i);
                return z3;
            } catch (Throwable unused2) {
                return z3;
            }
        } catch (Throwable unused3) {
            return false;
        }
    }

    public static void setThemeUploadInfo(ThemeInfo themeInfo, ThemeAccent themeAccent, TLRPC.TL_theme tL_theme, int i, boolean z) {
        String key;
        TLRPC.WallPaperSettings wallPaperSettings;
        if (tL_theme == null) {
            return;
        }
        TLRPC.ThemeSettings themeSettings = tL_theme.settings.size() > 0 ? tL_theme.settings.get(0) : null;
        HashMap map = themesDict;
        if (themeSettings != null) {
            if (themeInfo == null) {
                String baseThemeKey = getBaseThemeKey(themeSettings);
                if (baseThemeKey == null || (themeInfo = (ThemeInfo) map.get(baseThemeKey)) == null) {
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
                    refreshThemeColors(false, false);
                    NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                    int i2 = NotificationCenter.needSetDayNightTheme;
                    ThemeInfo themeInfo3 = currentTheme;
                    globalInstance.lambda$postNotificationNameOnUIThread$1(i2, themeInfo3, Boolean.valueOf(currentNightTheme == themeInfo3), null, -1);
                }
                PatternsLoader.createLoader(true);
            }
            TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
            themeAccent.patternMotion = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
            themeInfo.previewParsed = false;
        } else {
            if (themeInfo != null) {
                key = themeInfo.getKey();
                map.remove(key);
            } else {
                key = "remote" + tL_theme.id;
                themeInfo = (ThemeInfo) map.get(key);
            }
            if (themeInfo == null) {
                return;
            }
            themeInfo.info = tL_theme;
            themeInfo.name = tL_theme.title;
            File file = new File(themeInfo.pathToFile);
            File file2 = new File(ApplicationLoader.getFilesDirFixed(), zzhr.m(key, ".attheme"));
            if (!file.equals(file2)) {
                try {
                    AndroidUtilities.copyFile(file, file2);
                    themeInfo.pathToFile = file2.getAbsolutePath();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (z) {
                themeInfo.loaded = false;
                themeInfo.loadingThemeWallpaperName = null;
                themeInfo.newPathToWallpaper = null;
                NotificationCenter.getInstance(themeInfo.account).addObserver(themeInfo, NotificationCenter.fileLoaded);
                NotificationCenter.getInstance(themeInfo.account).addObserver(themeInfo, NotificationCenter.fileLoadFailed);
                FileLoader fileLoader = FileLoader.getInstance(themeInfo.account);
                TLRPC.TL_theme tL_theme3 = themeInfo.info;
                fileLoader.loadFile(tL_theme3.document, tL_theme3, 1, 1);
            } else {
                themeInfo.previewParsed = false;
            }
            map.put(themeInfo.getKey(), themeInfo);
        }
        saveOtherThemes(true, false);
    }

    public static void sortAccents(ThemeInfo themeInfo) {
        Collections.sort(themeInfo.themeAccents, new Theme$$ExternalSyntheticLambda5(25));
    }

    public static int tableOutBubble(SparseIntArray sparseIntArray) {
        int i = key_chat_outBubbleGradient2;
        int i2 = key_chat_outBubbleGradient3;
        int i3 = key_chat_outBubble;
        int[] iArr = {i3, key_chat_outBubbleGradient1, i, i2};
        int i4 = 0;
        int i5 = 0;
        int iBlue = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            int i8 = iArr[i7];
            if (i8 == i3 || sparseIntArray.indexOfKey(i8) >= 0) {
                int i9 = sparseIntArray.get(i8, defaultColors[i8]);
                int iRed = Color.red(i9) + i4;
                int iGreen = Color.green(i9) + i6;
                i5++;
                iBlue = Color.blue(i9) + iBlue;
                i6 = iGreen;
                i4 = iRed;
            }
        }
        return Color.rgb(i4 / i5, i6 / i5, iBlue / i5);
    }

    public static void turnOffAutoNight(BaseFragment baseFragment) {
        if (selectedAutoNightType != 0) {
            if (baseFragment != null) {
                try {
                    BulletinFactory.of(baseFragment).createSimpleBulletin(R.raw.auto_night_off, selectedAutoNightType == 3 ? LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff) : LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff), LocaleController.getString("Settings", R.string.Settings), 5000, false, new Theme$$ExternalSyntheticLambda8(baseFragment, 18)).show();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            selectedAutoNightType = 0;
            saveAutoNightThemeConfig();
            cancelAutoNightThemeCallbacks();
        }
    }

    public static void unrefAudioVisualizeDrawable(MessageObject messageObject) {
        AudioVisualizerDrawable audioVisualizerDrawable = chat_msgAudioVisualizeDrawable;
        if (audioVisualizerDrawable == null) {
            return;
        }
        if (audioVisualizerDrawable.parentView == null || messageObject == null) {
            audioVisualizerDrawable.parentView = null;
            return;
        }
        if (animatedOutVisualizerDrawables == null) {
            animatedOutVisualizerDrawables = new HashMap();
        }
        animatedOutVisualizerDrawables.put(messageObject, chat_msgAudioVisualizeDrawable);
        chat_msgAudioVisualizeDrawable.setWaveform(false, true, null);
        AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda8(messageObject, 0), 200L);
        chat_msgAudioVisualizeDrawable = null;
    }

    public final class AnonymousClass12 extends MessageDrawable {
        public final int $r8$classId = 1;
        public final Object val$colors;

        public AnonymousClass12(ThemePreviewActivity themePreviewActivity, int i, boolean z) {
            super(i, true, z, null);
            this.val$colors = themePreviewActivity;
        }

        @Override
        public int getColor(int i) {
            switch (this.$r8$classId) {
                case 0:
                    SparseIntArray sparseIntArray = (SparseIntArray) this.val$colors;
                    int iIndexOfKey = sparseIntArray.indexOfKey(i);
                    return iIndexOfKey > 0 ? sparseIntArray.valueAt(iIndexOfKey) : Theme.defaultColors[i];
                default:
                    return super.getColor(i);
            }
        }

        @Override
        public int getCurrentColor(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return ((SparseIntArray) this.val$colors).get(i);
                default:
                    return super.getCurrentColor(i);
            }
        }

        @Override
        public void setTop(int i, int i2, int i3) {
            switch (this.$r8$classId) {
                case 1:
                    if (!((ThemePreviewActivity) this.val$colors).setupFinished) {
                        setTop(i, i2, i3, i3, 0, 0, false, false);
                        break;
                    }
                    break;
                default:
                    super.setTop(i, i2, i3);
                    break;
            }
        }

        public AnonymousClass12(boolean z, SparseIntArray sparseIntArray) {
            super(2, z, false, null);
            this.val$colors = sparseIntArray;
        }

        @Override
        public void setTop(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
            switch (this.$r8$classId) {
                case 1:
                    if (!((ThemePreviewActivity) this.val$colors).setupFinished) {
                        super.setTop(i, i2, i3, i4, i5, i6, z, z2);
                        break;
                    }
                    break;
                default:
                    super.setTop(i, i2, i3, i4, i5, i6, z, z2);
                    break;
            }
        }
    }

    public static BaseCell.RippleDrawableSafe createInsetRoundRectDrawable(final float f, int i, final int i2, final int i3, final int i4, final int i5) {
        maskPaint.setColor(-1);
        return new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i}), null, new Drawable() {
            public final RectF rectF = new RectF();

            @Override
            public final void draw(Canvas canvas) {
                RectF rectF = this.rectF;
                rectF.set(getBounds());
                rectF.left += i2;
                rectF.top += i3;
                rectF.right -= i4;
                rectF.bottom -= i5;
                Paint paint = Theme.maskPaint;
                float f2 = f;
                canvas.drawRoundRect(rectF, f2, f2, paint);
            }

            @Override
            public final int getOpacity() {
                return 0;
            }

            @Override
            public final void setAlpha(int i6) {
            }

            @Override
            public final void setColorFilter(ColorFilter colorFilter) {
            }
        });
    }

    public static BaseCell.RippleDrawableSafe createSelectorDrawable(int i, int i2, int i3) {
        Drawable anonymousClass6;
        if ((i2 == 1 || i2 == 5) && Build.VERSION.SDK_INT >= 23) {
            anonymousClass6 = null;
        } else if (i2 == 1 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) {
            maskPaint.setColor(-1);
            anonymousClass6 = new AnonymousClass6(i2, i3);
        } else if (i2 == 2) {
            anonymousClass6 = new ColorDrawable(-1);
        } else {
            anonymousClass6 = null;
        }
        BaseCell.RippleDrawableSafe rippleDrawableSafe = new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i}), null, anonymousClass6);
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

    public final class ThemeInfo implements NotificationCenter.NotificationCenterDelegate {
        public int accentBaseColor;
        public LongSparseArray accentsByThemeId;
        public int account;
        public String assetName;
        public boolean badWallpaper;
        public final LongSparseArray chatAccentsByThemeId;
        public int currentAccentId;
        public int defaultAccentCount;
        public boolean firstAccentIsDefault;
        public TLRPC.TL_theme info;
        public boolean isBlured;
        public int isDark;
        public boolean isMotion;
        public int lastAccentId;
        public int lastChatThemeId;
        public boolean loaded;
        public String loadingThemeWallpaperName;
        public String name;
        public String newPathToWallpaper;
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
        public int previewBackgroundColor;
        public int previewBackgroundGradientColor1;
        public int previewBackgroundGradientColor2;
        public int previewBackgroundGradientColor3;
        public int previewInColor;
        public int previewOutColor;
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

        public ThemeInfo() {
            this.patternBgGradientRotation = 45;
            this.loaded = true;
            this.themeLoaded = true;
            this.prevAccentId = -1;
            this.chatAccentsByThemeId = new LongSparseArray();
            this.lastChatThemeId = 0;
            this.lastAccentId = 100;
            this.isDark = -1;
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

        public static void access$2400(ThemeInfo themeInfo, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
            themeInfo.defaultAccentCount = iArr.length;
            themeInfo.themeAccents = new ArrayList();
            themeInfo.themeAccentsMap = new SparseArray();
            themeInfo.accentsByThemeId = new LongSparseArray();
            for (int i = 0; i < iArr.length; i++) {
                ThemeAccent themeAccent = new ThemeAccent();
                themeAccent.id = iArr8[i];
                if (Theme.isHome(themeAccent)) {
                    themeAccent.isDefault = true;
                }
                themeAccent.accentColor = iArr[i];
                themeAccent.parentTheme = themeInfo;
                themeAccent.myMessagesAccentColor = iArr2[i];
                themeAccent.myMessagesGradientAccentColor1 = iArr3[i];
                long j = iArr4[i];
                themeAccent.backgroundOverrideColor = j;
                boolean z = themeInfo.firstAccentIsDefault;
                if (z && themeAccent.id == Theme.DEFALT_THEME_ACCENT_ID) {
                    themeAccent.backgroundOverrideColor = 4294967296L;
                } else {
                    themeAccent.backgroundOverrideColor = j;
                }
                if (z && themeAccent.id == Theme.DEFALT_THEME_ACCENT_ID) {
                    themeAccent.backgroundGradientOverrideColor1 = 4294967296L;
                } else {
                    themeAccent.backgroundGradientOverrideColor1 = iArr5[i];
                }
                if (iArr6 != null) {
                    if (z && themeAccent.id == Theme.DEFALT_THEME_ACCENT_ID) {
                        themeAccent.backgroundGradientOverrideColor2 = 4294967296L;
                    } else {
                        themeAccent.backgroundGradientOverrideColor2 = iArr6[i];
                    }
                }
                if (iArr7 != null) {
                    if (z && themeAccent.id == Theme.DEFALT_THEME_ACCENT_ID) {
                        themeAccent.backgroundGradientOverrideColor3 = 4294967296L;
                    } else {
                        themeAccent.backgroundGradientOverrideColor3 = iArr7[i];
                    }
                }
                themeAccent.patternIntensity = iArr10[i] / 100.0f;
                themeAccent.backgroundRotation = iArr9[i];
                themeAccent.patternSlug = strArr[i];
                if ((Theme.isHome(themeAccent) && themeInfo.name.equals("Dark Blue")) || themeInfo.name.equals("Night")) {
                    themeAccent.myMessagesAccentColor = -14316059;
                    themeAccent.myMessagesGradientAccentColor1 = -12422433;
                    themeAccent.myMessagesGradientAccentColor2 = -8304937;
                    themeAccent.myMessagesGradientAccentColor3 = -6340950;
                    if (themeInfo.name.equals("Night")) {
                        themeAccent.patternIntensity = -0.57f;
                        themeAccent.backgroundOverrideColor = -9666650L;
                        themeAccent.backgroundGradientOverrideColor1 = -13749173L;
                        themeAccent.backgroundGradientOverrideColor2 = -8883033L;
                        themeAccent.backgroundGradientOverrideColor3 = -13421992L;
                    }
                }
                themeInfo.themeAccentsMap.put(themeAccent.id, themeAccent);
                themeInfo.themeAccents.add(themeAccent);
            }
            themeInfo.accentBaseColor = ((ThemeAccent) themeInfo.themeAccentsMap.get(0)).accentColor;
        }

        public static void access$2500(ThemeInfo themeInfo, SharedPreferences sharedPreferences) {
            ArrayList arrayList = themeInfo.themeAccents;
            if (arrayList == null || arrayList.isEmpty()) {
                themeInfo.loadOverrideWallpaper(sharedPreferences, null, MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(), themeInfo.name, "_owp"));
                return;
            }
            int size = themeInfo.themeAccents.size();
            for (int i = 0; i < size; i++) {
                ThemeAccent themeAccent = (ThemeAccent) themeInfo.themeAccents.get(i);
                StringBuilder sb = new StringBuilder();
                sb.append(themeInfo.name);
                sb.append("_");
                themeInfo.loadOverrideWallpaper(sharedPreferences, themeAccent, SurfaceContainer$$ExternalSyntheticOutline0.m(themeAccent.id, "_owp", sb));
            }
        }

        public static ThemeInfo createWithJson(JSONObject jSONObject) {
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

        public static ThemeInfo createWithString(String str) {
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
            if ((wallPaperSettings2.flags & 16) == 0 || wallPaperSettings2.second_background_color != 0) {
                themeAccent.backgroundGradientOverrideColor1 = Theme.getWallpaperColor(wallPaperSettings2.second_background_color);
            } else {
                themeAccent.backgroundGradientOverrideColor1 = 4294967296L;
            }
            TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings3.flags & 32) == 0 || wallPaperSettings3.third_background_color != 0) {
                themeAccent.backgroundGradientOverrideColor2 = Theme.getWallpaperColor(wallPaperSettings3.third_background_color);
            } else {
                themeAccent.backgroundGradientOverrideColor2 = 4294967296L;
            }
            TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
            if ((wallPaperSettings4.flags & 64) == 0 || wallPaperSettings4.fourth_background_color != 0) {
                themeAccent.backgroundGradientOverrideColor3 = Theme.getWallpaperColor(wallPaperSettings4.fourth_background_color);
            } else {
                themeAccent.backgroundGradientOverrideColor3 = 4294967296L;
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

        public final boolean createBackground(File file, String str) {
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

        public final ThemeAccent createNewAccent(TLRPC.TL_theme tL_theme, int i, int i2) {
            if (tL_theme == null) {
                return null;
            }
            return createNewAccent(tL_theme.id, i2 < tL_theme.settings.size() ? tL_theme.settings.get(i2) : null, tL_theme, i, false);
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            int i3 = NotificationCenter.fileLoaded;
            if (i == i3 || i == NotificationCenter.fileLoadFailed) {
                String str = (String) objArr[0];
                TLRPC.TL_theme tL_theme = this.info;
                if (tL_theme == null || tL_theme.document == null) {
                    return;
                }
                if (str.equals(this.loadingThemeWallpaperName)) {
                    this.loadingThemeWallpaperName = null;
                    Utilities.globalQueue.postRunnable(new ClickHelper$$ExternalSyntheticLambda0(29, this, (File) objArr[1]));
                    return;
                }
                if (str.equals(FileLoader.getAttachFileName(this.info.document))) {
                    NotificationCenter.getInstance(this.account).removeObserver(this, i3);
                    NotificationCenter.getInstance(this.account).removeObserver(this, NotificationCenter.fileLoadFailed);
                    if (i == i3) {
                        File file = new File(this.pathToFile);
                        TLRPC.TL_theme tL_theme2 = this.info;
                        ThemeInfo themeInfoFillThemeValues = Theme.fillThemeValues(file, tL_theme2.title, tL_theme2);
                        if (themeInfoFillThemeValues == null || themeInfoFillThemeValues.pathToWallpaper == null || new File(themeInfoFillThemeValues.pathToWallpaper).exists()) {
                            onFinishLoadingRemoteTheme();
                            return;
                        }
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
                        ConnectionsManager.getInstance(themeInfoFillThemeValues.account).sendRequest(getwallpaper, new ChatActivity$$ExternalSyntheticLambda208(6, this, themeInfoFillThemeValues));
                    }
                }
            }
        }

        public final String generateWallpaperName(ThemeAccent themeAccent, boolean z) {
            String strM;
            if (themeAccent == null) {
                themeAccent = getAccent(false);
            }
            if (themeAccent == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(z ? MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(), this.name, "_wp_o") : MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(), this.name, "_wp"));
                sb.append(Utilities.random.nextInt());
                sb.append(".jpg");
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            if (z) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.name);
                sb3.append("_");
                strM = SurfaceContainer$$ExternalSyntheticOutline0.m(themeAccent.id, "_wp_o", sb3);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.name);
                sb4.append("_");
                strM = SurfaceContainer$$ExternalSyntheticOutline0.m(themeAccent.id, "_wp", sb4);
            }
            sb2.append(strM);
            sb2.append(Utilities.random.nextInt());
            sb2.append(".jpg");
            return sb2.toString();
        }

        public final ThemeAccent getAccent(boolean z) {
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
                OverrideWallpaperInfo overrideWallpaperInfo2 = new OverrideWallpaperInfo();
                overrideWallpaperInfo2.fileName = "";
                overrideWallpaperInfo2.originalFileName = "";
                overrideWallpaperInfo2.slug = "";
                overrideWallpaperInfo2.slug = overrideWallpaperInfo.slug;
                overrideWallpaperInfo2.color = overrideWallpaperInfo.color;
                overrideWallpaperInfo2.gradientColor1 = overrideWallpaperInfo.gradientColor1;
                overrideWallpaperInfo2.gradientColor2 = overrideWallpaperInfo.gradientColor2;
                overrideWallpaperInfo2.gradientColor3 = overrideWallpaperInfo.gradientColor3;
                overrideWallpaperInfo2.rotation = overrideWallpaperInfo.rotation;
                overrideWallpaperInfo2.isBlurred = overrideWallpaperInfo.isBlurred;
                overrideWallpaperInfo2.isMotion = overrideWallpaperInfo.isMotion;
                overrideWallpaperInfo2.intensity = overrideWallpaperInfo.intensity;
                overrideWallpaperInfo2.parentTheme = this;
                overrideWallpaperInfo2.parentAccent = themeAccent2;
                if (TextUtils.isEmpty(overrideWallpaperInfo.fileName)) {
                    overrideWallpaperInfo2.fileName = "";
                } else {
                    try {
                        File file = new File(ApplicationLoader.getFilesDirFixed(), overrideWallpaperInfo.fileName);
                        File filesDirFixed = ApplicationLoader.getFilesDirFixed();
                        String strGenerateWallpaperName = overrideWallpaperInfo2.parentTheme.generateWallpaperName(overrideWallpaperInfo2.parentAccent, false);
                        overrideWallpaperInfo2.fileName = strGenerateWallpaperName;
                        AndroidUtilities.copyFile(file, new File(filesDirFixed, strGenerateWallpaperName));
                    } catch (Exception e) {
                        overrideWallpaperInfo2.fileName = "";
                        FileLog.e(e);
                    }
                }
                if (TextUtils.isEmpty(overrideWallpaperInfo.originalFileName)) {
                    overrideWallpaperInfo2.originalFileName = "";
                } else if (overrideWallpaperInfo.originalFileName.equals(overrideWallpaperInfo.fileName)) {
                    overrideWallpaperInfo2.originalFileName = overrideWallpaperInfo2.fileName;
                } else {
                    try {
                        File file2 = new File(ApplicationLoader.getFilesDirFixed(), overrideWallpaperInfo.originalFileName);
                        File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
                        String strGenerateWallpaperName2 = overrideWallpaperInfo2.parentTheme.generateWallpaperName(overrideWallpaperInfo2.parentAccent, true);
                        overrideWallpaperInfo2.originalFileName = strGenerateWallpaperName2;
                        AndroidUtilities.copyFile(file2, new File(filesDirFixed2, strGenerateWallpaperName2));
                    } catch (Exception e2) {
                        overrideWallpaperInfo2.originalFileName = "";
                        FileLog.e(e2);
                    }
                }
                themeAccent2.overrideWallpaper = overrideWallpaperInfo2;
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

        public final int getAccentColor(int i) {
            ThemeAccent themeAccent = (ThemeAccent) this.themeAccentsMap.get(i);
            if (themeAccent != null) {
                return themeAccent.accentColor;
            }
            return 0;
        }

        public final String getKey() {
            if (this.info == null) {
                return this.name;
            }
            return "remote" + this.info.id;
        }

        public final String getName() {
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

        public final int getPreviewBackgroundColor() {
            if (this.firstAccentIsDefault && this.currentAccentId == Theme.DEFALT_THEME_ACCENT_ID) {
                return -3155485;
            }
            return this.previewBackgroundColor;
        }

        public final boolean isDark() {
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

        public final void loadOverrideWallpaper(SharedPreferences sharedPreferences, ThemeAccent themeAccent, String str) {
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

        public final void onFinishLoadingRemoteTheme() {
            this.loaded = true;
            this.previewParsed = false;
            Theme.saveOtherThemes(true, false);
            if (this == Theme.currentTheme && Theme.previousTheme == null) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, this, Boolean.valueOf(this == Theme.currentNightTheme), null, -1, Theme.fallbackKeys);
            }
        }

        public final void setCurrentAccentId(int i) {
            this.currentAccentId = i;
            ThemeAccent accent = getAccent(false);
            if (accent != null) {
                this.overrideWallpaper = accent.overrideWallpaper;
            }
        }

        public final void setOverrideWallpaper(OverrideWallpaperInfo overrideWallpaperInfo) {
            if (this.overrideWallpaper == overrideWallpaperInfo) {
                return;
            }
            ThemeAccent accent = getAccent(false);
            OverrideWallpaperInfo overrideWallpaperInfo2 = this.overrideWallpaper;
            if (overrideWallpaperInfo2 != null) {
                OverrideWallpaperInfo.access$1300(overrideWallpaperInfo2);
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

        public final ThemeAccent createNewAccent(long j, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i, boolean z) {
            if (z) {
                LongSparseArray longSparseArray = this.chatAccentsByThemeId;
                ThemeAccent themeAccent = (ThemeAccent) longSparseArray.get(j);
                if (themeAccent != null) {
                    return themeAccent;
                }
                int i2 = this.lastChatThemeId + 1;
                this.lastChatThemeId = i2;
                ThemeAccent themeAccent2 = new ThemeAccent();
                fillAccentValues(themeAccent2, themeSettings);
                themeAccent2.parentTheme = this;
                themeAccent2.id = i2;
                themeAccent2.info = tL_theme;
                themeAccent2.account = i;
                longSparseArray.put(i2, themeAccent2);
                return themeAccent2;
            }
            ThemeAccent themeAccent3 = (ThemeAccent) this.accentsByThemeId.get(j);
            if (themeAccent3 != null) {
                return themeAccent3;
            }
            int i3 = this.lastAccentId + 1;
            this.lastAccentId = i3;
            ThemeAccent themeAccent4 = new ThemeAccent();
            fillAccentValues(themeAccent4, themeSettings);
            themeAccent4.parentTheme = this;
            themeAccent4.id = i3;
            themeAccent4.info = tL_theme;
            themeAccent4.account = i;
            this.themeAccentsMap.put(i3, themeAccent4);
            this.themeAccents.add(0, themeAccent4);
            Theme.sortAccents(this);
            this.accentsByThemeId.put(j, themeAccent4);
            return themeAccent4;
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
    }

    public static ShapeDrawable createRoundRectDrawable(int i, int i2, int i3) {
        float f = i;
        float f2 = i2;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f2, f2, f2, f2}, null, null));
        shapeDrawable.getPaint().setColor(i3);
        return shapeDrawable;
    }

    public static int getColor(int i) {
        return getColor(null, i, false);
    }

    public static Paint getThemePaint(String str) {
        if (Objects.equals(str, "paintDivider")) {
            return dividerPaint;
        }
        return (Paint) defaultChatPaints.get(str);
    }

    public static int getColor(boolean[] r6, int r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.Theme.getColor(boolean[], int, boolean):int");
    }

    public final class RippleRadMaskDrawable extends Drawable {
        public final float[] radii;
        public final Path path = new Path();
        public boolean invalidatePath = true;

        public RippleRadMaskDrawable(float f, float f2) {
            this.radii = new float[]{fDp, fDp, fDp, fDp, fDp, fDp, fDp, fDp};
            float fDp = AndroidUtilities.dp(f);
            float fDp2 = AndroidUtilities.dp(f2);
        }

        @Override
        public final void draw(Canvas canvas) {
            boolean z = this.invalidatePath;
            Path path = this.path;
            if (z) {
                this.invalidatePath = false;
                path.reset();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getBounds());
                path.addRoundRect(rectF, this.radii, Path.Direction.CW);
            }
            canvas.drawPath(path, Theme.maskPaint);
        }

        @Override
        public final int getOpacity() {
            return 0;
        }

        @Override
        public final void onBoundsChange(Rect rect) {
            this.invalidatePath = true;
        }

        @Override
        public final void setAlpha(int i) {
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
        }

        public RippleRadMaskDrawable(float f, float f2, float f3, float f4) {
            this.radii = new float[]{fDp, fDp, fDp, fDp, fDp, fDp, fDp, fDp};
            float fDp = AndroidUtilities.dp(f);
            float fDp2 = AndroidUtilities.dp(f2);
            float fDp3 = AndroidUtilities.dp(f3);
            float fDp4 = AndroidUtilities.dp(f4);
        }
    }

    public static BaseCell.RippleDrawableSafe createRadSelectorDrawable(int i, int i2, int i3, int i4) {
        maskPaint.setColor(-1);
        float f = i3;
        float f2 = i4;
        return new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i2}), createRoundRectDrawable(AndroidUtilities.dp(f), AndroidUtilities.dp(f2), i), new RippleRadMaskDrawable(f, f2));
    }

    public static int changeColorAccent(float[] fArr, float[] fArr2, int i, boolean z, int i2) {
        if (tmpHSV5 == null) {
            tmpHSV5 = new float[3];
        }
        float[] fArr3 = tmpHSV5;
        Color.colorToHSV(i, fArr3);
        float f = fArr3[0] - fArr[0];
        float f2 = f > 0.0f ? f : -f;
        float f3 = f - 360.0f;
        if (f3 <= 0.0f) {
            f3 = -f3;
        }
        if (Math.min(f2, f3) > 30.0f) {
            return i2;
        }
        float fMin = Math.min((fArr3[1] * 1.5f) / fArr[1], 1.0f);
        fArr3[0] = (fArr3[0] + fArr2[0]) - fArr[0];
        fArr3[1] = (fArr3[1] * fArr2[1]) / fArr[1];
        fArr3[2] = (((fMin * fArr2[2]) / fArr[2]) + (1.0f - fMin)) * fArr3[2];
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
        float fM = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(0.39999998f, fComputePerceivedBrightness, fComputePerceivedBrightness2, 0.6f);
        int iRed = (int) (Color.red(iHSVToColor) * fM);
        int iGreen = (int) (Color.green(iHSVToColor) * fM);
        int iBlue = (int) (Color.blue(iHSVToColor) * fM);
        return Color.argb(Color.alpha(iHSVToColor), iRed < 0 ? 0 : Math.min(iRed, 255), iGreen < 0 ? 0 : Math.min(iGreen, 255), iBlue >= 0 ? Math.min(iBlue, 255) : 0);
    }

    public static MHTML createBackgroundDrawable(ThemeInfo themeInfo, OverrideWallpaperInfo overrideWallpaperInfo, SparseIntArray sparseIntArray, File file, String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, TLRPC.Document document, boolean z5) {
        int height;
        int iMin;
        Bitmap bitmapLoadScreenSizedBitmap;
        Bitmap bitmapLoadScreenSizedBitmap2;
        boolean z6;
        File file2;
        Bitmap bitmap;
        Bitmap bitmap2;
        MHTML mhtml = new MHTML();
        mhtml.file = z5 ? null : wallpaper;
        boolean z7 = (!z2 || z3) && overrideWallpaperInfo != null;
        if (overrideWallpaperInfo != null) {
            mhtml.entries = Boolean.valueOf(overrideWallpaperInfo.isMotion);
            mhtml.entriesByLocation = Boolean.valueOf((overrideWallpaperInfo.color == 0 || "d".equals(overrideWallpaperInfo.slug) || "c".equals(overrideWallpaperInfo.slug)) ? false : true);
        } else {
            mhtml.entries = Boolean.valueOf(themeInfo.isMotion);
            mhtml.entriesByLocation = Boolean.valueOf(themeInfo.patternBgColor != 0);
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
                        MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable(i4, i7, i6, i5, false, 0, false);
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
                            motionBackgroundDrawable.setPatternBitmap(bitmapDecodeFile, i2);
                            motionBackgroundDrawable.setPatternColorFilter(motionBackgroundDrawable.getPatternColor());
                            mhtml.file = motionBackgroundDrawable;
                        } catch (Throwable th) {
                            th = th;
                            FileLog.e(th);
                        }
                    } else {
                        mhtml.file = Drawable.createFromPath(file.getAbsolutePath());
                        z6 = true;
                    }
                    mhtml.entries = Boolean.valueOf(z4);
                    Boolean bool = Boolean.TRUE;
                    mhtml.entriesByLocation = bool;
                    mhtml.filePos = bool;
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
                        if (i7 != 0 && i7 != i9) {
                            BackgroundGradientDrawable backgroundGradientDrawable = new BackgroundGradientDrawable(BackgroundGradientDrawable.getGradientOrientation(i8), new int[]{i9, i7});
                            backgroundGradientDisposable = backgroundGradientDrawable.startDithering(Stripe.ofDeviceScreen(0.5f, 3), new AnonymousClass13(), 100L);
                            mhtml.file = backgroundGradientDrawable;
                        } else {
                            mhtml.file = new ColorDrawable(i9);
                        }
                    } else {
                        MotionBackgroundDrawable motionBackgroundDrawable2 = new MotionBackgroundDrawable(i4, i7, i6, i5, false, 0, false);
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
                        motionBackgroundDrawable2.setPatternBitmap(bitmap, i2);
                        motionBackgroundDrawable2.setPhase(i3);
                        mhtml.file = motionBackgroundDrawable2;
                    }
                    mhtml.filePos = Boolean.TRUE;
                } else if (str != null) {
                    try {
                        Bitmap bitmapLoadScreenSizedBitmap3 = loadScreenSizedBitmap(new FileInputStream(new File(ApplicationLoader.getFilesDirFixed(), Utilities.MD5(str) + ".wp")), 0);
                        if (bitmapLoadScreenSizedBitmap3 != null) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapLoadScreenSizedBitmap3);
                            mhtml.file = bitmapDrawable;
                            mhtml.boundary = bitmapDrawable;
                            mhtml.filePos = Boolean.TRUE;
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
                            mhtml.boundary = bitmapDrawable2;
                            mhtml.file = bitmapDrawable2;
                            bitmapDrawable2.setFilterBitmap(true);
                            mhtml.filePos = Boolean.TRUE;
                        }
                    } catch (Throwable th3) {
                        FileLog.e(th3);
                    }
                }
            }
        }
        if (((Drawable) mhtml.file) == null) {
            int i10 = overrideWallpaperInfo != null ? overrideWallpaperInfo.color : 0;
            if (overrideWallpaperInfo != null) {
                try {
                    if (!"d".equals(overrideWallpaperInfo.slug)) {
                        if (!"c".equals(overrideWallpaperInfo.slug) || overrideWallpaperInfo.gradientColor1 != 0) {
                            if (i10 != 0 && (!isPatternWallpaper || overrideWallpaperInfo.gradientColor2 != 0)) {
                                if (overrideWallpaperInfo.gradientColor1 != 0 && overrideWallpaperInfo.gradientColor2 != 0) {
                                    MotionBackgroundDrawable motionBackgroundDrawable3 = new MotionBackgroundDrawable(overrideWallpaperInfo.color, overrideWallpaperInfo.gradientColor1, overrideWallpaperInfo.gradientColor2, overrideWallpaperInfo.gradientColor3, false, 0, false);
                                    motionBackgroundDrawable3.setPhase(i3);
                                    if (((Boolean) mhtml.entriesByLocation).booleanValue()) {
                                        File file3 = new File(ApplicationLoader.getFilesDirFixed(), overrideWallpaperInfo.fileName);
                                        if (file3.exists()) {
                                            motionBackgroundDrawable3.setPatternBitmap(loadScreenSizedBitmap(new FileInputStream(file3), 0), (int) (overrideWallpaperInfo.intensity * 100.0f));
                                            mhtml.filePos = Boolean.TRUE;
                                        }
                                    }
                                    mhtml.file = motionBackgroundDrawable3;
                                } else if (((Boolean) mhtml.entriesByLocation).booleanValue()) {
                                    File file4 = new File(ApplicationLoader.getFilesDirFixed(), overrideWallpaperInfo.fileName);
                                    if (file4.exists() && (bitmapLoadScreenSizedBitmap2 = loadScreenSizedBitmap(new FileInputStream(file4), 0)) != null) {
                                        BitmapDrawable bitmapDrawable3 = new BitmapDrawable(bitmapLoadScreenSizedBitmap2);
                                        mhtml.file = bitmapDrawable3;
                                        bitmapDrawable3.setFilterBitmap(true);
                                        mhtml.filePos = Boolean.TRUE;
                                    }
                                } else {
                                    int i11 = overrideWallpaperInfo.gradientColor1;
                                    if (i11 != 0) {
                                        BackgroundGradientDrawable backgroundGradientDrawable2 = new BackgroundGradientDrawable(BackgroundGradientDrawable.getGradientOrientation(overrideWallpaperInfo.rotation), new int[]{i10, i11});
                                        backgroundGradientDisposable = backgroundGradientDrawable2.startDithering(Stripe.ofDeviceScreen(0.5f, 3), new AnonymousClass14(), 100L);
                                        mhtml.file = backgroundGradientDrawable2;
                                    } else {
                                        mhtml.file = new ColorDrawable(i10);
                                    }
                                }
                            } else {
                                File file5 = new File(ApplicationLoader.getFilesDirFixed(), overrideWallpaperInfo.fileName);
                                if (file5.exists() && (bitmapLoadScreenSizedBitmap = loadScreenSizedBitmap(new FileInputStream(file5), 0)) != null) {
                                    BitmapDrawable bitmapDrawable4 = new BitmapDrawable(bitmapLoadScreenSizedBitmap);
                                    mhtml.file = bitmapDrawable4;
                                    bitmapDrawable4.setFilterBitmap(true);
                                    mhtml.filePos = Boolean.TRUE;
                                }
                                if (((Drawable) mhtml.file) == null) {
                                    mhtml.file = createDefaultWallpaper(0, 0);
                                    mhtml.filePos = Boolean.FALSE;
                                }
                            }
                        }
                    } else {
                        mhtml.file = createDefaultWallpaper(0, 0);
                        mhtml.filePos = Boolean.FALSE;
                    }
                } catch (Throwable unused) {
                }
            } else {
                mhtml.file = createDefaultWallpaper(0, 0);
                mhtml.filePos = Boolean.FALSE;
            }
            if (((Drawable) mhtml.file) == null) {
                if (i10 == 0) {
                    i10 = -2693905;
                }
                mhtml.file = new ColorDrawable(i10);
            }
        }
        if (!LiteMode.isEnabled(32)) {
            Drawable drawable = (Drawable) mhtml.file;
            if (drawable instanceof MotionBackgroundDrawable) {
                MotionBackgroundDrawable motionBackgroundDrawable4 = (MotionBackgroundDrawable) drawable;
                Bitmap bitmap3 = motionBackgroundDrawable4.patternBitmap;
                if (bitmap3 == null) {
                    Point point3 = AndroidUtilities.displaySize;
                    iMin = Math.min(point3.x, point3.y);
                    Point point4 = AndroidUtilities.displaySize;
                    height = Math.max(point4.x, point4.y);
                } else {
                    int width = bitmap3.getWidth();
                    height = motionBackgroundDrawable4.patternBitmap.getHeight();
                    iMin = width;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, height, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                ((Drawable) mhtml.file).setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                ((Drawable) mhtml.file).draw(canvas);
                mhtml.file = new BitmapDrawable(bitmapCreateBitmap);
            }
        }
        return mhtml;
    }

    public static void setMaskDrawableRad(BaseCell.RippleDrawableSafe rippleDrawableSafe, float f, float f2, float f3, float f4) {
        if (rippleDrawableSafe != null) {
            int numberOfLayers = rippleDrawableSafe.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                Drawable drawable = rippleDrawableSafe.getDrawable(i);
                if (drawable instanceof RippleRadMaskDrawable) {
                    RippleRadMaskDrawable rippleRadMaskDrawable = (RippleRadMaskDrawable) drawable;
                    float[] fArr = rippleRadMaskDrawable.radii;
                    float fDp = AndroidUtilities.dp(f);
                    fArr[1] = fDp;
                    fArr[0] = fDp;
                    float fDp2 = AndroidUtilities.dp(f2);
                    float[] fArr2 = rippleRadMaskDrawable.radii;
                    fArr2[3] = fDp2;
                    fArr2[2] = fDp2;
                    float fDp3 = AndroidUtilities.dp(f3);
                    fArr2[5] = fDp3;
                    fArr2[4] = fDp3;
                    float fDp4 = AndroidUtilities.dp(f4);
                    fArr2[7] = fDp4;
                    fArr2[6] = fDp4;
                    rippleRadMaskDrawable.invalidatePath = true;
                    rippleRadMaskDrawable.invalidateSelf();
                    return;
                }
            }
        }
    }

    public static BaseCell.RippleDrawableSafe createRadSelectorDrawable(int i, int i2, int i3, int i4, int i5) {
        maskPaint.setColor(-1);
        return new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i}), null, new RippleRadMaskDrawable(i2, i3, i4, i5));
    }

    public static BaseCell.RippleDrawableSafe getSelectorDrawable(ResourcesProvider resourcesProvider, boolean z) {
        int color = getColor(key_listSelector, resourcesProvider);
        if (z) {
            int i = key_windowBackgroundWhite;
            if (i >= 0) {
                return new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{color}), new ColorDrawable(getColor(i, resourcesProvider)), new ColorDrawable(-1));
            }
            return createSelectorDrawable(color, 2, -1);
        }
        return createSelectorDrawable(color, 2, -1);
    }

    public final class AnonymousClass1 implements Runnable {
        public final int $r8$classId;

        public AnonymousClass1(int i) {
            this.$r8$classId = i;
        }

        @Override
        public final void run() {
            boolean z = true;
            switch (this.$r8$classId) {
                case 0:
                    Theme.switchDayRunnableScheduled = false;
                    Theme.applyDayNightThemeMaybe(false);
                    return;
                case 1:
                    try {
                        int i = TraceCompat.$r8$clinit;
                        Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                        if (EmojiCompat.sInstance == null) {
                            z = false;
                        }
                        if (z) {
                            EmojiCompat.get().load();
                            break;
                        }
                        return;
                    } finally {
                        int i2 = TraceCompat.$r8$clinit;
                        Trace.endSection();
                    }
                case 2:
                    return;
                case 3:
                    Theme.switchNightRunnableScheduled = false;
                    Theme.applyDayNightThemeMaybe(true);
                    return;
                case 4:
                    VoIPPiPView voIPPiPView = VoIPPiPView.instance;
                    if (voIPPiPView != null) {
                        int i3 = VoIPPiPView.FloatingView.$r8$clinit;
                        VoIPPiPView.FloatingView floatingView = voIPPiPView.floatingView;
                        AndroidUtilities.cancelRunOnUIThread(floatingView.this$0.collapseRunnable);
                        if (VoIPPiPView.instance != null) {
                            floatingView.this$0.getClass();
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    Math.abs(Utilities.random.nextInt() % 3);
                    GradientTools[] gradientToolsArr = StoriesUtilities.storiesGradientTools;
                    NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                    AndroidUtilities.runOnUIThread(StoriesUtilities.debugRunnable, 1000L);
                    LaunchActivity.getLastFragment().getFragmentView();
                    return;
            }
        }

        private final void run$com$google$mlkit$common$sdkinternal$zza() {
        }
    }
}
