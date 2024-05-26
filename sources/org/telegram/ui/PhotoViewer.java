package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.util.FloatProperty;
import android.util.Pair;
import android.util.Property;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import android.widget.Scroller;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import androidx.annotation.Keep;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.NestedScrollView;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScrollerEnd;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
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
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.camera.Size;
import org.telegram.messenger.video.VideoPlayerRewinder;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$BotInlineResult;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$EncryptedChat;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$InputDocument;
import org.telegram.tgnet.TLRPC$InputStickerSet;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageAction;
import org.telegram.tgnet.TLRPC$MessageEntity;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$PageBlock;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$TL_documentAttributeVideo;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_fileLocationToBeDeprecated;
import org.telegram.tgnet.TLRPC$TL_forumTopic;
import org.telegram.tgnet.TLRPC$TL_inputPhoto;
import org.telegram.tgnet.TLRPC$TL_message;
import org.telegram.tgnet.TLRPC$TL_messageActionEmpty;
import org.telegram.tgnet.TLRPC$TL_messageActionUserUpdatedPhoto;
import org.telegram.tgnet.TLRPC$TL_messageMediaEmpty;
import org.telegram.tgnet.TLRPC$TL_messageMediaInvoice;
import org.telegram.tgnet.TLRPC$TL_messageMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_messageMediaWebPage;
import org.telegram.tgnet.TLRPC$TL_messageService;
import org.telegram.tgnet.TLRPC$TL_photo;
import org.telegram.tgnet.TLRPC$TL_photoEmpty;
import org.telegram.tgnet.TLRPC$TL_photos_photo;
import org.telegram.tgnet.TLRPC$TL_webDocument;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$WebDocument;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.PhotoPickerPhotoCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChooseSpeedLayout;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CaptionPhotoViewer;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.Crop.CropTransform;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FilterGLThread;
import org.telegram.ui.Components.FilterShaders;
import org.telegram.ui.Components.FloatSeekBarAccessibilityDelegate;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.GestureDetector2;
import org.telegram.ui.Components.GroupedPhotosListView;
import org.telegram.ui.Components.HideViewAfterAnimation;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.OptionsSpeedIconDrawable;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.Paint.Views.MaskPaintView;
import org.telegram.ui.Components.Paint.Views.PaintCancelView;
import org.telegram.ui.Components.Paint.Views.PaintDoneView;
import org.telegram.ui.Components.Paint.Views.StickerCutOutBtn;
import org.telegram.ui.Components.Paint.Views.StickerMakerBackgroundView;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.PaintingOverlay;
import org.telegram.ui.Components.PhotoCropView;
import org.telegram.ui.Components.PhotoFilterView;
import org.telegram.ui.Components.PhotoViewerWebView;
import org.telegram.ui.Components.PickerBottomLayoutViewer;
import org.telegram.ui.Components.PipVideoOverlay;
import org.telegram.ui.Components.PlayPauseDrawable;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.QuoteSpan;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SizeNotifierFrameLayoutPhoto;
import org.telegram.ui.Components.SpeedIconDrawable;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.TextViewSwitcher;
import org.telegram.ui.Components.ThanosEffect;
import org.telegram.ui.Components.Tooltip;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Components.URLSpanReplacement;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.VideoCompressButton;
import org.telegram.ui.Components.VideoEditTextureView;
import org.telegram.ui.Components.VideoForwardDrawable;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Components.VideoPlayerSeekBar;
import org.telegram.ui.Components.VideoSeekPreviewImage;
import org.telegram.ui.Components.VideoTimelinePlayView;
import org.telegram.ui.Components.ViewHelper;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;
import org.webrtc.MediaStreamTrack;
@SuppressLint({"WrongConstant"})
public class PhotoViewer implements NotificationCenter.NotificationCenterDelegate, GestureDetector2.OnGestureListener, GestureDetector2.OnDoubleTapListener {
    @SuppressLint({"StaticFieldLeak"})
    private static volatile PhotoViewer Instance;
    private static volatile PhotoViewer PipInstance;
    private static final Property<VideoPlayerControlFrameLayout, Float> VPC_PROGRESS;
    private static DecelerateInterpolator decelerateInterpolator;
    private static Drawable[] progressDrawables;
    private static Paint progressPaint;
    private boolean ALLOW_USE_SURFACE;
    public final Property<View, Float> FLASH_VIEW_VALUE;
    private int aboutToSwitchTo;
    private ActionBar actionBar;
    private AnimatorSet actionBarAnimator;
    private PhotoViewerActionBarContainer actionBarContainer;
    private Map<View, Boolean> actionBarItemsVisibility;
    private boolean actionBarWasShownBeforeByEnd;
    private Context activityContext;
    private ActionBarMenuSubItem allMediaItem;
    private boolean allowOrder;
    private boolean allowShare;
    private boolean allowShowFullscreenButton;
    private float animateToMirror;
    private float animateToRotate;
    private float animateToScale;
    private float animateToX;
    private float animateToY;
    private ClippingImageView animatingImageView;
    private Runnable animationEndRunnable;
    private int animationInProgress;
    private long animationStartTime;
    private float animationValue;
    private float[][] animationValues;
    private boolean applying;
    private AspectRatioFrameLayout aspectRatioFrameLayout;
    private boolean attachedToWindow;
    private long audioFramesSize;
    private float avatarStartProgress;
    private long avatarStartTime;
    private final ArrayList<TLRPC$Photo> avatarsArr;
    private long avatarsDialogId;
    private BackgroundDrawable backgroundDrawable;
    private Paint bitmapPaint;
    private volatile int bitrate;
    private Paint blackPaint;
    private final AnimatedFloat blurAlpha;
    private RectF blurBounds;
    private BlurringShader.BlurManager blurManager;
    private LinearGradient bottomFancyShadow;
    private Matrix bottomFancyShadowMatrix;
    private Paint bottomFancyShadowPaint;
    private FrameLayout bottomLayout;
    private LinearLayout btnLayout;
    private boolean canDragDown;
    private boolean canEditAvatar;
    private boolean canZoom;
    private ObjectAnimator captionAnimator;
    private FrameLayout captionContainer;
    private String captionDetectedLanguage;
    private CaptionPhotoViewer captionEdit;
    private FrameLayout captionEditContainer;
    public CharSequence captionForAllMedia;
    private boolean captionHwLayerEnabled;
    private CaptionScrollView captionScrollView;
    private CaptionTextViewSwitcher captionTextViewSwitcher;
    private boolean captionTranslated;
    private long captureFrameAtTime;
    private long captureFrameReadyAtTime;
    private BlurringShader.ThumbBlurer centerBlur;
    private ImageReceiver centerImage;
    private AnimatedFloat[] centerImageInsideBlur;
    private boolean centerImageIsVideo;
    private Matrix centerImageTransform;
    private boolean centerImageTransformLocked;
    private AnimatorSet changeModeAnimation;
    private TextureView changedTextureView;
    private boolean changingPage;
    private boolean changingTextureView;
    private CheckBox checkImageView;
    ChooseSpeedLayout chooseSpeedLayout;
    private int classGuid;
    private Path clipFancyShadows;
    private float clippingImageProgress;
    public boolean closePhotoAfterSelect;
    private VideoCompressButton compressItem;
    private volatile int compressionsCount;
    private FrameLayoutDrawer containerView;
    private PhotoCountView countView;
    private boolean cropInitied;
    private ImageView cropItem;
    private CropTransform cropTransform;
    private int currentAccount;
    private AnimatedFileDrawable currentAnimation;
    private ImageLocation currentAvatarLocation;
    private Bitmap currentBitmap;
    private TLRPC$BotInlineResult currentBotInlineResult;
    private long currentDialogId;
    private int currentEditMode;
    private ImageLocation currentFileLocation;
    private ImageLocation currentFileLocationVideo;
    private String[] currentFileNames;
    private String currentFilterQuery;
    private ReactionsLayoutInBubble.VisibleReaction currentFilterTag;
    private boolean currentFiltered;
    private String currentImageFaceKey;
    private int currentImageHasFace;
    private String currentImagePath;
    private int currentIndex;
    private AnimatorSet currentListViewAnimation;
    private Runnable currentLoadingVideoRunnable;
    private MessageObject currentMessageObject;
    private TLRPC$PageBlock currentPageBlock;
    private float currentPanTranslationY;
    private String currentPathObject;
    private PlaceProviderObject currentPlaceObject;
    private Uri currentPlayingVideoFile;
    private SecureDocument currentSecureDocument;
    private String currentSubtitle;
    private ImageReceiver.BitmapHolder currentThumb;
    private boolean currentVideoFinishedLoading;
    private float currentVideoSpeed;
    public Utilities.Callback2<String, TLRPC$InputDocument> customStickerHandler;
    private CharSequence customTitle;
    private BlurButton cutOutBtn;
    private MessagesController.DialogPhotos dialogPhotos;
    private boolean disableShowCheck;
    private boolean discardTap;
    private TextView docInfoTextView;
    private TextView docNameTextView;
    private TextView doneButtonFullWidth;
    private boolean doneButtonPressed;
    private boolean dontAutoPlay;
    private boolean dontChangeCaptionPosition;
    private boolean dontResetZoomOnFirstLayout;
    private boolean doubleTap;
    private boolean doubleTapEnabled;
    private float dragY;
    private boolean draggingDown;
    private boolean[] drawPressedDrawable;
    private ActionBarMenuItem editItem;
    private EditState editState;
    private boolean editing;
    private PickerBottomLayoutViewer editorDoneLayout;
    private boolean[] endReached;
    private long endTime;
    private BlurButton eraseBtn;
    private long estimatedDuration;
    private long estimatedSize;
    private ImageView exitFullscreenButton;
    private boolean fancyShadows;
    private boolean firstAnimationDelay;
    private boolean firstFrameRendered;
    private FirstFrameView firstFrameView;
    private AnimatorSet flashAnimator;
    private View flashView;
    boolean fromCamera;
    private ImageView[] fullscreenButton;
    private int fullscreenedByButton;
    private GestureDetector2 gestureDetector;
    private GroupedPhotosListView groupedPhotosListView;
    public boolean hasCaptionForAllMedia;
    private Runnable hideActionBarRunnable;
    private PlaceProviderObject hideAfterAnimation;
    private UndoView hintView;
    private Rect hitRect;
    private boolean ignoreDidSetImage;
    private RectF imageBounds;
    private Matrix imageBoundsMatrix;
    private float[] imageBoundsPoints;
    private AnimatorSet imageMoveAnimation;
    private final ArrayList<MessageObject> imagesArr;
    private final ArrayList<Object> imagesArrLocals;
    private final ArrayList<ImageLocation> imagesArrLocations;
    private final ArrayList<Long> imagesArrLocationsSizes;
    private final ArrayList<ImageLocation> imagesArrLocationsVideo;
    private final ArrayList<TLRPC$Message> imagesArrMessages;
    private final ArrayList<MessageObject> imagesArrTemp;
    private final SparseArray<MessageObject>[] imagesByIds;
    private final SparseArray<MessageObject>[] imagesByIdsTemp;
    private boolean inBubbleMode;
    private boolean inPreview;
    private VideoPlayer injectingVideoPlayer;
    private SurfaceTexture injectingVideoPlayerSurface;
    private float inlineOutAnimationProgress;
    private final Rect insets;
    private DecelerateInterpolator interpolator;
    private boolean invalidCoords;
    private boolean isActionBarVisible;
    private boolean isCurrentVideo;
    private boolean isDocumentsPicker;
    private boolean isEmbedVideo;
    private boolean isEvent;
    private boolean isFirstLoading;
    private volatile boolean isH264Video;
    private boolean isInline;
    private boolean isPhotosListViewVisible;
    private boolean isPlaying;
    private boolean isStreaming;
    private boolean isVisible;
    private boolean isVisibleOrAnimating;
    private LinearLayout itemsLayout;
    private boolean keepScreenOnFlagSet;
    private int keyboardSize;
    private long lastBufferedPositionCheck;
    private boolean lastCaptionTranslating;
    private String lastControlFrameDuration;
    private Bitmap lastFrameBitmap;
    private ImageView lastFrameImageView;
    private int lastImageId;
    private long lastPhotoSetTime;
    private long lastSaveTime;
    private CharSequence lastTitle;
    private BlurringShader.ThumbBlurer leftBlur;
    private MediaController.CropState leftCropState;
    private CropTransform leftCropTransform;
    private ImageReceiver leftImage;
    private boolean leftImageIsVideo;
    private PaintingOverlay leftPaintingOverlay;
    private Bulletin limitBulletin;
    private boolean loadInitialVideo;
    private boolean loadingMoreImages;
    Runnable longPressRunnable;
    float longPressX;
    private boolean manuallyPaused;
    private MaskPaintView maskPaintView;
    private boolean maskPaintViewEraser;
    private boolean maskPaintViewShuttingDown;
    private int maskPaintViewTouched;
    private StickersAlert masksAlert;
    private ActionBarMenuItem masksItem;
    private int maxSelectedPhotos;
    private float maxX;
    private float maxY;
    private ActionBarMenu menu;
    private ActionBarMenuItem menuItem;
    private OptionsSpeedIconDrawable menuItemIcon;
    private long mergeDialogId;
    private float minX;
    private float minY;
    private AnimatorSet miniProgressAnimator;
    private Runnable miniProgressShowRunnable;
    private RadialProgressView miniProgressView;
    private float mirror;
    private ImageView mirrorItem;
    private float moveStartX;
    private float moveStartY;
    private boolean moving;
    private ImageView muteItem;
    private boolean muteVideo;
    private View navigationBar;
    private int navigationBarHeight;
    private boolean needCaptionLayout;
    private long needCaptureFrameReadyAtTime;
    private boolean needSearchImageInArr;
    private boolean needShowOnReady;
    private Runnable onUserLeaveHintListener;
    private boolean openedFromProfile;
    private boolean openedFullScreenVideo;
    private boolean opennedFromMedia;
    private OrientationEventListener orientationEventListener;
    private volatile int originalBitrate;
    private volatile int originalHeight;
    private long originalSize;
    private volatile int originalWidth;
    private BlurButton outlineBtn;
    private boolean padImageForHorizontalInsets;
    private PageBlocksAdapter pageBlocksAdapter;
    private ImageView paintItem;
    private AnimatorSet paintKeyboardAnimator;
    private KeyboardNotifier paintKeyboardNotifier;
    private int paintViewTouched;
    private PaintingOverlay paintingOverlay;
    private Activity parentActivity;
    private ChatAttachAlert parentAlert;
    private ChatActivity parentChatActivity;
    private BaseFragment parentFragment;
    private PhotoCropView photoCropView;
    private PhotoFilterView photoFilterView;
    private LPhotoPaintView photoPaintView;
    private PhotoProgressView[] photoProgressViews;
    private PhotoViewerWebView photoViewerWebView;
    private CounterView photosCounterView;
    private FrameLayout pickerView;
    private ImageView pickerViewSendButton;
    private Drawable pickerViewSendDrawable;
    private float pinchCenterX;
    private float pinchCenterY;
    private float pinchStartAngle;
    private float pinchStartDistance;
    private float pinchStartRotate;
    private float pinchStartScale;
    private float pinchStartX;
    private float pinchStartY;
    private boolean pipAnimationInProgress;
    private boolean pipAvailable;
    private ActionBarMenuItem pipItem;
    private int[] pipPosition;
    private boolean pipVideoOverlayAnimateFlag;
    private PhotoViewerProvider placeProvider;
    private View playButtonAccessibilityOverlay;
    private boolean playerAutoStarted;
    private boolean playerInjected;
    private boolean playerLooping;
    private boolean playerWasPlaying;
    private boolean playerWasReady;
    private GradientDrawable[] pressedDrawable;
    private float[] pressedDrawableAlpha;
    private int prevOrientation;
    private int previousCompression;
    private boolean previousCropMirrored;
    private int previousCropOrientation;
    private float previousCropPh;
    private float previousCropPw;
    private float previousCropPx;
    private float previousCropPy;
    private float previousCropRotation;
    private float previousCropScale;
    private boolean previousHasTransform;
    private RadialProgressView progressView;
    private QualityChooseView qualityChooseView;
    private AnimatorSet qualityChooseViewAnimation;
    private PickerBottomLayoutViewer qualityPicker;
    private RenderNode renderNode;
    public TLRPC$Document replacedSticker;
    private boolean requestingPreview;
    private TextView resetButton;
    private Theme.ResourcesProvider resourcesProvider;
    private BlurButton restoreBtn;
    private volatile int resultHeight;
    private volatile int resultWidth;
    private BlurringShader.ThumbBlurer rightBlur;
    private MediaController.CropState rightCropState;
    private CropTransform rightCropTransform;
    private ImageReceiver rightImage;
    private boolean rightImageIsVideo;
    private PaintingOverlay rightPaintingOverlay;
    private float rotate;
    private ImageView rotateItem;
    private int rotationValue;
    private float savedRotation;
    private float savedScale;
    private SavedState savedState;
    private float savedTx;
    private float savedTy;
    private ArrayMap<String, SavedVideoPosition> savedVideoPositions;
    private float scale;
    private Scroller scroller;
    private final ArrayList<SecureDocument> secureDocuments;
    private float seekToProgressPending;
    private float seekToProgressPending2;
    private volatile int selectedCompression;
    private ArrayList<String> selectedEmojis;
    private ListAdapter selectedPhotosAdapter;
    private SelectedPhotosListView selectedPhotosListView;
    private ActionBarMenuItem sendItem;
    private int sendPhotoType;
    private ActionBarPopupWindow.ActionBarPopupWindowLayout sendPopupLayout;
    private ActionBarPopupWindow sendPopupWindow;
    private ImageUpdater.AvatarFor setAvatarFor;
    private Runnable setLoadingRunnable;
    private BlurringShader.StoryBlurDrawer shadowBlurer;
    private int sharedMediaType;
    private float shiftDp;
    private String shouldSavePositionForCurrentVideo;
    private String shouldSavePositionForCurrentVideoShortTerm;
    private PlaceProviderObject showAfterAnimation;
    private boolean shownControlsByEnd;
    private ImageReceiver sideImage;
    private boolean skipFirstBufferingProgress;
    public boolean skipLastFrameDraw;
    private int slideshowMessageId;
    private ActionBarPopupWindow.GapView speedGap;
    private ActionBarMenuSubItem speedItem;
    private int startOffset;
    private long startTime;
    private long startedPlayTime;
    public boolean stickerEmpty;
    public boolean stickerEmptySent;
    private StickerMakerBackgroundView stickerMakerBackgroundView;
    public StickerMakerView stickerMakerView;
    private boolean streamingAlertShown;
    private Paint surfaceBlackoutPaint;
    private TextureView.SurfaceTextureListener surfaceTextureListener;
    private int switchImageAfterAnimation;
    private Runnable switchToInlineRunnable;
    private boolean switchingInlineMode;
    private int switchingToIndex;
    private int switchingToMode;
    private int[] tempInt;
    private TextSelectionHelper.SimpleTextSelectionHelper textSelectionHelper;
    private ImageView textureImageView;
    private boolean textureUploaded;
    private Tooltip tooltip;
    private LinearGradient topFancyShadow;
    private Matrix topFancyShadowMatrix;
    private Paint topFancyShadowPaint;
    private long topicId;
    private int totalImagesCount;
    private int totalImagesCountMerge;
    private int touchSlop;
    private long transitionAnimationStartTime;
    private AnimationNotificationsLocker transitionNotificationLocker;
    private float translateY;
    private ValueAnimator translateYAnimator;
    private float translationX;
    private float translationY;
    private boolean tryStartRequestPreviewOnFinish;
    private ImageView tuneItem;
    private BlurButton undoBtn;
    private final Runnable updateContainerFlagsRunnable;
    private Runnable updateProgressRunnable;
    private boolean usedSurfaceView;
    private VelocityTracker velocityTracker;
    private TextView videoAvatarTooltip;
    private volatile boolean videoConvertSupported;
    private float videoCrossfadeAlpha;
    private long videoCrossfadeAlphaLastTime;
    private boolean videoCrossfadeStarted;
    private float videoCutEnd;
    private float videoCutStart;
    private float videoDuration;
    private VideoForwardDrawable videoForwardDrawable;
    private Bitmap videoFrameBitmap;
    private Paint videoFrameBitmapPaint;
    private int videoFramerate;
    private long videoFramesSize;
    private int videoHeight;
    private Runnable videoPlayRunnable;
    private VideoPlayer videoPlayer;
    private Animator videoPlayerControlAnimator;
    private VideoPlayerControlFrameLayout videoPlayerControlFrameLayout;
    private boolean videoPlayerControlVisible;
    private int[] videoPlayerCurrentTime;
    VideoPlayerRewinder videoPlayerRewinder;
    private VideoPlayerSeekBar videoPlayerSeekbar;
    private View videoPlayerSeekbarView;
    private SimpleTextView videoPlayerTime;
    private int[] videoPlayerTotalTime;
    private VideoSeekPreviewImage videoPreviewFrame;
    private AnimatorSet videoPreviewFrameAnimation;
    private MessageObject videoPreviewMessageObject;
    private boolean videoSizeSet;
    private SurfaceView videoSurfaceView;
    private TextureView videoTextureView;
    private ObjectAnimator videoTimelineAnimator;
    private VideoTimelinePlayView videoTimelineView;
    private FrameLayout videoTimelineViewContainer;
    private int videoWidth;
    private AlertDialog visibleDialog;
    private int waitingForDraw;
    private int waitingForFirstTextureUpload;
    private boolean wasCountViewShown;
    private boolean wasLayout;
    private boolean wasRotated;
    private WindowManager.LayoutParams windowLayoutParams;
    private FrameLayout windowView;
    private boolean zoomAnimation;
    private boolean zooming;

    public static class EmptyPhotoViewerProvider implements PhotoViewerProvider {
        @Override
        public boolean allowCaption() {
            return true;
        }

        @Override
        public boolean allowSendingSubmenu() {
            return true;
        }

        @Override
        public boolean canCaptureMorePhotos() {
            return true;
        }

        @Override
        public boolean canLoadMoreAvatars() {
            return PhotoViewerProvider.CC.$default$canLoadMoreAvatars(this);
        }

        @Override
        public boolean canReplace(int i) {
            return false;
        }

        @Override
        public boolean canScrollAway() {
            return true;
        }

        @Override
        public boolean cancelButtonPressed() {
            return true;
        }

        @Override
        public boolean closeKeyboard() {
            return false;
        }

        @Override
        public void deleteImageAtIndex(int i) {
        }

        @Override
        public String getDeleteMessageString() {
            return null;
        }

        @Override
        public MessageObject getEditingMessageObject() {
            return null;
        }

        @Override
        public int getPhotoIndex(int i) {
            return -1;
        }

        @Override
        public PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC$FileLocation tLRPC$FileLocation, int i, boolean z) {
            return null;
        }

        @Override
        public int getSelectedCount() {
            return 0;
        }

        @Override
        public HashMap<Object, Object> getSelectedPhotos() {
            return null;
        }

        @Override
        public ArrayList<Object> getSelectedPhotosOrder() {
            return null;
        }

        @Override
        public ImageReceiver.BitmapHolder getThumbForPhoto(MessageObject messageObject, TLRPC$FileLocation tLRPC$FileLocation, int i) {
            return null;
        }

        @Override
        public int getTotalImageCount() {
            return -1;
        }

        @Override
        public boolean isPhotoChecked(int i) {
            return false;
        }

        @Override
        public boolean loadMore() {
            return false;
        }

        @Override
        public void needAddMorePhotos() {
        }

        @Override
        public void onApplyCaption(CharSequence charSequence) {
        }

        @Override
        public void onClose() {
        }

        @Override
        public boolean onDeletePhoto(int i) {
            return PhotoViewerProvider.CC.$default$onDeletePhoto(this, i);
        }

        @Override
        public void onEditModeChanged(boolean z) {
            PhotoViewerProvider.CC.$default$onEditModeChanged(this, z);
        }

        @Override
        public void onOpen() {
        }

        @Override
        public void onPreClose() {
            PhotoViewerProvider.CC.$default$onPreClose(this);
        }

        @Override
        public void onPreOpen() {
            PhotoViewerProvider.CC.$default$onPreOpen(this);
        }

        @Override
        public void onReleasePlayerBeforeClose(int i) {
            PhotoViewerProvider.CC.$default$onReleasePlayerBeforeClose(this, i);
        }

        @Override
        public void openPhotoForEdit(String str, String str2, boolean z) {
        }

        @Override
        public void replaceButtonPressed(int i, VideoEditedInfo videoEditedInfo) {
        }

        @Override
        public boolean scaleToFill() {
            return false;
        }

        @Override
        public void sendButtonPressed(int i, VideoEditedInfo videoEditedInfo, boolean z, int i2, boolean z2) {
        }

        @Override
        public int setPhotoChecked(int i, VideoEditedInfo videoEditedInfo) {
            return -1;
        }

        @Override
        public int setPhotoUnchecked(Object obj) {
            return -1;
        }

        @Override
        public void updatePhotoAtIndex(int i) {
        }

        @Override
        public void willHidePhotoViewer() {
        }

        @Override
        public void willSwitchFromPhoto(MessageObject messageObject, TLRPC$FileLocation tLRPC$FileLocation, int i) {
        }
    }

    public interface PageBlocksAdapter {
        TLRPC$PageBlock get(int i);

        List<TLRPC$PageBlock> getAll();

        CharSequence getCaption(int i);

        File getFile(int i);

        TLRPC$PhotoSize getFileLocation(TLObject tLObject, int[] iArr);

        String getFileName(int i);

        int getItemsCount();

        TLObject getMedia(int i);

        Object getParentObject();

        boolean isHardwarePlayer(int i);

        boolean isVideo(int i);

        void updateSlideshowCell(TLRPC$PageBlock tLRPC$PageBlock);
    }

    public interface PhotoViewerProvider {

        public final class CC {
            public static boolean $default$canLoadMoreAvatars(PhotoViewerProvider photoViewerProvider) {
                return true;
            }

            public static boolean $default$onDeletePhoto(PhotoViewerProvider photoViewerProvider, int i) {
                return true;
            }

            public static void $default$onEditModeChanged(PhotoViewerProvider photoViewerProvider, boolean z) {
            }

            public static void $default$onPreClose(PhotoViewerProvider photoViewerProvider) {
            }

            public static void $default$onPreOpen(PhotoViewerProvider photoViewerProvider) {
            }

            public static void $default$onReleasePlayerBeforeClose(PhotoViewerProvider photoViewerProvider, int i) {
            }
        }

        boolean allowCaption();

        boolean allowSendingSubmenu();

        boolean canCaptureMorePhotos();

        boolean canLoadMoreAvatars();

        boolean canReplace(int i);

        boolean canScrollAway();

        boolean cancelButtonPressed();

        boolean closeKeyboard();

        void deleteImageAtIndex(int i);

        String getDeleteMessageString();

        MessageObject getEditingMessageObject();

        int getPhotoIndex(int i);

        PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC$FileLocation tLRPC$FileLocation, int i, boolean z);

        int getSelectedCount();

        HashMap<Object, Object> getSelectedPhotos();

        ArrayList<Object> getSelectedPhotosOrder();

        ImageReceiver.BitmapHolder getThumbForPhoto(MessageObject messageObject, TLRPC$FileLocation tLRPC$FileLocation, int i);

        int getTotalImageCount();

        boolean isPhotoChecked(int i);

        boolean loadMore();

        void needAddMorePhotos();

        void onApplyCaption(CharSequence charSequence);

        void onClose();

        boolean onDeletePhoto(int i);

        void onEditModeChanged(boolean z);

        void onOpen();

        void onPreClose();

        void onPreOpen();

        void onReleasePlayerBeforeClose(int i);

        void openPhotoForEdit(String str, String str2, boolean z);

        void replaceButtonPressed(int i, VideoEditedInfo videoEditedInfo);

        boolean scaleToFill();

        void sendButtonPressed(int i, VideoEditedInfo videoEditedInfo, boolean z, int i2, boolean z2);

        int setPhotoChecked(int i, VideoEditedInfo videoEditedInfo);

        int setPhotoUnchecked(Object obj);

        void updatePhotoAtIndex(int i);

        void willHidePhotoViewer();

        void willSwitchFromPhoto(MessageObject messageObject, TLRPC$FileLocation tLRPC$FileLocation, int i);
    }

    public static class PlaceProviderObject {
        public ClippingImageView animatingImageView;
        public int animatingImageViewYOffset;
        public boolean canEdit;
        public int clipBottomAddition;
        public int clipTopAddition;
        public long dialogId;
        public ImageReceiver imageReceiver;
        public boolean isEvent;
        public View parentView;
        public int[] radius;
        public long size;
        public int starOffset;
        public ImageReceiver.BitmapHolder thumb;
        public int viewX;
        public int viewY;
        public float scale = 1.0f;
        public boolean allowTakeAnimation = true;
    }

    private boolean enableSwipeToPiP() {
        return false;
    }

    public static void lambda$sendPressed$50(DialogInterface dialogInterface, int i) {
    }

    public static void lambda$setParentActivity$19() {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
    }

    public static void access$16800(PhotoViewer photoViewer) {
        photoViewer.updateCaptionTranslated();
    }

    public void lambda$new$0() {
        toggleMiniProgressInternal(true);
    }

    public TextureView getVideoTextureView() {
        return this.videoTextureView;
    }

    public boolean isVisibleOrAnimating() {
        return this.isVisibleOrAnimating;
    }

    public SurfaceView getVideoSurfaceView() {
        return this.videoSurfaceView;
    }

    public static class PhotoViewerActionBarContainer extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
        private FrameLayout container;
        private boolean hasSubtitle;
        int lastHeight;
        private float rightPadding;
        private ValueAnimator rightPaddingAnimator;
        private AnimatorSet subtitleAnimator;
        AnimatedTextView subtitleTextView;
        private AnimatorSet titleAnimator;
        private FrameLayout titleLayout;
        SimpleTextView[] titleTextView;

        public PhotoViewerActionBarContainer(Context context) {
            super(context);
            FrameLayout frameLayout = new FrameLayout(context);
            this.container = frameLayout;
            frameLayout.setPadding(AndroidUtilities.dp((AndroidUtilities.isTablet() ? 80 : 72) - 16), 0, 0, 0);
            addView(this.container, LayoutHelper.createFrame(-1, -1, 119));
            FrameLayout frameLayout2 = new FrameLayout(this, context) {
                @Override
                protected void onMeasure(int i, int i2) {
                    super.onMeasure(i, i2);
                    setPivotY(getMeasuredHeight());
                }
            };
            this.titleLayout = frameLayout2;
            frameLayout2.setPivotX(AndroidUtilities.dp(16.0f));
            this.titleLayout.setPadding(AndroidUtilities.dp(16.0f), 0, 0, 0);
            this.titleLayout.setClipToPadding(false);
            this.container.addView(this.titleLayout, LayoutHelper.createFrame(-1, -1, 119));
            this.titleTextView = new SimpleTextView[2];
            for (int i = 0; i < 2; i++) {
                this.titleTextView[i] = new SimpleTextView(context);
                this.titleTextView[i].setGravity(19);
                this.titleTextView[i].setTextColor(-1);
                this.titleTextView[i].setTextSize(20);
                this.titleTextView[i].setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                this.titleTextView[i].setDrawablePadding(AndroidUtilities.dp(4.0f));
                this.titleTextView[i].setScrollNonFitText(true);
                this.titleLayout.addView(this.titleTextView[i], LayoutHelper.createFrame(-1, -2, 19));
            }
            AnimatedTextView animatedTextView = new AnimatedTextView(context, true, false, false);
            this.subtitleTextView = animatedTextView;
            animatedTextView.setAnimationProperties(0.4f, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.subtitleTextView.setTextSize(AndroidUtilities.dp(14.0f));
            this.subtitleTextView.setGravity(19);
            this.subtitleTextView.setTextColor(-1);
            this.subtitleTextView.setEllipsizeByGradient(true);
            this.container.addView(this.subtitleTextView, LayoutHelper.createFrame(-1, 20.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f));
        }

        public void setTextShadows(boolean z) {
            this.titleTextView[0].getPaint().setShadowLayer(AndroidUtilities.dpf2(0.66f), 0.0f, 1.0f, z ? 1912602624 : 0);
            this.titleTextView[1].getPaint().setShadowLayer(AndroidUtilities.dpf2(0.66f), 0.0f, 1.0f, z ? 1912602624 : 0);
            this.subtitleTextView.getDrawable().setShadowLayer(AndroidUtilities.dpf2(0.66f), 0.0f, 1.0f, z ? 1912602624 : 0);
        }

        public void setTitle(CharSequence charSequence) {
            this.titleTextView[1].setAlpha(0.0f);
            this.titleTextView[1].setVisibility(8);
            if (!areStringsEqual(this.titleTextView[0].getText(), charSequence)) {
                this.titleTextView[0].resetScrolling();
            }
            this.titleTextView[0].setText(charSequence);
            this.titleTextView[0].setAlpha(1.0f);
            this.titleTextView[0].setTranslationX(0.0f);
            this.titleTextView[0].setTranslationY(0.0f);
        }

        private boolean areStringsEqual(CharSequence charSequence, CharSequence charSequence2) {
            if (charSequence == null && charSequence2 == null) {
                return true;
            }
            if ((charSequence == null) != (charSequence2 == null)) {
                return false;
            }
            return TextUtils.equals(charSequence.toString(), charSequence2.toString());
        }

        public void setTitleAnimated(CharSequence charSequence, boolean z, boolean z2) {
            if (areStringsEqual(this.titleTextView[0].getText(), charSequence)) {
                return;
            }
            AnimatorSet animatorSet = this.titleAnimator;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.titleAnimator = null;
            }
            SimpleTextView[] simpleTextViewArr = this.titleTextView;
            simpleTextViewArr[1].copyScrolling(simpleTextViewArr[0]);
            SimpleTextView[] simpleTextViewArr2 = this.titleTextView;
            simpleTextViewArr2[1].setText(simpleTextViewArr2[0].getText());
            this.titleTextView[1].setRightPadding((int) this.rightPadding);
            this.titleTextView[0].resetScrolling();
            this.titleTextView[0].setText(charSequence);
            float dp = AndroidUtilities.dp(8.0f) * (z2 ? 1 : -1);
            this.titleTextView[1].setTranslationX(0.0f);
            this.titleTextView[1].setTranslationY(0.0f);
            if (z) {
                this.titleTextView[0].setTranslationX(0.0f);
                this.titleTextView[0].setTranslationY(-dp);
            } else {
                this.titleTextView[0].setTranslationX(-dp);
                this.titleTextView[0].setTranslationY(0.0f);
            }
            this.titleTextView[0].setAlpha(0.0f);
            this.titleTextView[1].setAlpha(1.0f);
            this.titleTextView[0].setVisibility(0);
            this.titleTextView[1].setVisibility(0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.titleTextView[1], View.ALPHA, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.titleTextView[0], View.ALPHA, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.titleTextView[1], z ? View.TRANSLATION_Y : View.TRANSLATION_X, dp));
            arrayList.add(ObjectAnimator.ofFloat(this.titleTextView[0], z ? View.TRANSLATION_Y : View.TRANSLATION_X, 0.0f));
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.titleAnimator = animatorSet2;
            animatorSet2.playTogether(arrayList);
            this.titleAnimator.addListener(new AnimatorListenerAdapter() {
                {
                    PhotoViewerActionBarContainer.this = this;
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    if (PhotoViewerActionBarContainer.this.titleAnimator == animator) {
                        PhotoViewerActionBarContainer.this.titleTextView[1].setVisibility(8);
                        PhotoViewerActionBarContainer.this.titleAnimator = null;
                    }
                }
            });
            this.titleAnimator.setDuration(320L);
            this.titleAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.titleAnimator.start();
        }

        public void setSubtitle(CharSequence charSequence) {
            setSubtitle(charSequence, true);
        }

        public void setSubtitle(CharSequence charSequence, boolean z) {
            boolean z2 = !TextUtils.isEmpty(charSequence);
            if (z2 != this.hasSubtitle) {
                this.hasSubtitle = z2;
                AnimatorSet animatorSet = this.subtitleAnimator;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                Point point = AndroidUtilities.displaySize;
                int dp = AndroidUtilities.dp((z2 ? 30 : 33) - (point.x > point.y ? 6 : 0));
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    AnimatedTextView animatedTextView = this.subtitleTextView;
                    Property property = View.ALPHA;
                    float[] fArr = new float[1];
                    fArr[0] = z2 ? 1.0f : 0.0f;
                    arrayList.add(ObjectAnimator.ofFloat(animatedTextView, property, fArr));
                    arrayList.add(ObjectAnimator.ofFloat(this.subtitleTextView, View.TRANSLATION_Y, dp));
                    FrameLayout frameLayout = this.titleLayout;
                    Property property2 = View.TRANSLATION_Y;
                    float[] fArr2 = new float[1];
                    fArr2[0] = z2 ? AndroidUtilities.dp(-12.0f) : 0.0f;
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout, property2, fArr2));
                    FrameLayout frameLayout2 = this.titleLayout;
                    Property property3 = View.SCALE_X;
                    float[] fArr3 = new float[1];
                    fArr3[0] = z2 ? 0.87f : 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property3, fArr3));
                    FrameLayout frameLayout3 = this.titleLayout;
                    Property property4 = View.SCALE_Y;
                    float[] fArr4 = new float[1];
                    fArr4[0] = z2 ? 0.87f : 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property4, fArr4));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.subtitleAnimator = animatorSet2;
                    animatorSet2.playTogether(arrayList);
                    this.subtitleAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    this.subtitleAnimator.start();
                } else {
                    this.subtitleTextView.setAlpha(z2 ? 1.0f : 0.0f);
                    this.subtitleTextView.setTranslationY(dp);
                    this.titleLayout.setTranslationY(z2 ? AndroidUtilities.dp(-12.0f) : 0.0f);
                    this.titleLayout.setScaleX(z2 ? 0.87f : 1.0f);
                    this.titleLayout.setScaleY(z2 ? 0.87f : 1.0f);
                }
            }
            this.subtitleTextView.setText(charSequence, z);
        }

        public void updateOrientation() {
            this.hasSubtitle = !this.hasSubtitle;
            setSubtitle(this.subtitleTextView.getText(), false);
        }

        public void updateRightPadding(final float f, boolean z) {
            ValueAnimator valueAnimator = this.rightPaddingAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.rightPaddingAnimator = null;
            }
            if (z) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.rightPadding, f);
                this.rightPaddingAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        PhotoViewer.PhotoViewerActionBarContainer.this.lambda$updateRightPadding$0(f, valueAnimator2);
                    }
                });
                this.rightPaddingAnimator.addListener(new AnimatorListenerAdapter() {
                    {
                        PhotoViewerActionBarContainer.this = this;
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PhotoViewerActionBarContainer.this.updateRightPadding(f, false);
                    }
                });
                this.rightPaddingAnimator.setDuration(320L);
                this.rightPaddingAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.rightPaddingAnimator.start();
                return;
            }
            this.rightPadding = f;
            this.titleTextView[0].setRightPadding((int) f);
            this.subtitleTextView.setRightPadding(f);
        }

        public void lambda$updateRightPadding$0(float f, ValueAnimator valueAnimator) {
            this.rightPadding = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int i = (int) f;
            this.titleTextView[0].setRightPadding(i);
            this.titleTextView[1].setRightPadding(i);
            this.subtitleTextView.setRightPadding(f);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int i3 = Build.VERSION.SDK_INT >= 21 ? AndroidUtilities.statusBarHeight : 0;
            int i4 = this.lastHeight;
            int i5 = AndroidUtilities.displaySize.y;
            if (i4 != i5) {
                this.lastHeight = i5;
                updateOrientation();
            }
            this.container.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - i3, 1073741824));
            setMeasuredDimension(size, size2);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            this.container.layout(0, Build.VERSION.SDK_INT >= 21 ? AndroidUtilities.statusBarHeight : 0, i3 - i, i4 - i2);
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.emojiLoaded) {
                this.titleTextView[0].invalidate();
                this.titleTextView[1].invalidate();
                this.subtitleTextView.invalidate();
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        }
    }

    public static class PhotoCountView extends View {
        Paint backgroundPaint;
        StaticLayout center;
        float centerTop;
        float centerWidth;
        AnimatedTextView.AnimatedTextDrawable left;
        private String lng;
        private int marginTop;
        private boolean nextNotAnimate;
        TextPaint paint;
        AnimatedTextView.AnimatedTextDrawable right;
        private AnimatedFloat showT;
        private boolean shown;

        public PhotoCountView(Context context) {
            super(context);
            this.backgroundPaint = new Paint(1);
            this.paint = new TextPaint(1);
            this.shown = false;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.showT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
            this.backgroundPaint.setColor(2130706432);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
            this.left = animatedTextDrawable;
            animatedTextDrawable.setAnimationProperties(0.3f, 0L, 320L, cubicBezierInterpolator);
            this.left.setTextColor(-1);
            this.left.setTextSize(AndroidUtilities.dp(14.0f));
            this.left.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.left.setCallback(this);
            this.left.setText("0");
            this.left.setOverrideFullWidth(AndroidUtilities.displaySize.x);
            this.paint.setColor(-1);
            this.paint.setTextSize(AndroidUtilities.dp(14.0f));
            this.paint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            setCenterText();
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
            this.right = animatedTextDrawable2;
            animatedTextDrawable2.setAnimationProperties(0.3f, 0L, 320L, cubicBezierInterpolator);
            this.right.setTextColor(-1);
            this.right.setTextSize(AndroidUtilities.dp(14.0f));
            this.right.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.right.setCallback(this);
            this.right.setText("0");
            this.right.setOverrideFullWidth(AndroidUtilities.displaySize.x);
        }

        private void setCenterText() {
            StaticLayout staticLayout = new StaticLayout(getOf(), this.paint, AndroidUtilities.dp(200.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.center = staticLayout;
            if (staticLayout.getLineCount() >= 1) {
                this.centerWidth = this.center.getLineWidth(0);
                this.centerTop = this.center.getLineDescent(0);
                return;
            }
            this.centerWidth = 0.0f;
            this.centerTop = 0.0f;
        }

        private String getOf() {
            this.lng = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
            return LocaleController.getString("Of").replace("%1$d", "").replace("%2$d", "");
        }

        public void set(int i, int i2) {
            set(i, i2, true);
        }

        public void set(int i, int i2, boolean z) {
            boolean z2 = false;
            int max = Math.max(0, i);
            int max2 = Math.max(max, i2);
            if (LocaleController.getInstance().getCurrentLocaleInfo() != null && !TextUtils.equals(this.lng, LocaleController.getInstance().getCurrentLocaleInfo().shortName)) {
                setCenterText();
            }
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.left;
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(LocaleController.isRTL ? max2 : max);
            animatedTextDrawable.setText(String.format("%d", objArr), (!z || this.nextNotAnimate || LocaleController.isRTL) ? false : true);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.right;
            Object[] objArr2 = new Object[1];
            if (!LocaleController.isRTL) {
                max = max2;
            }
            objArr2[0] = Integer.valueOf(max);
            String format = String.format("%d", objArr2);
            if (z && !this.nextNotAnimate && !LocaleController.isRTL) {
                z2 = true;
            }
            animatedTextDrawable2.setText(format, z2);
            this.nextNotAnimate = !z;
        }

        @Override
        protected boolean verifyDrawable(Drawable drawable) {
            return this.left == drawable || this.right == drawable || super.verifyDrawable(drawable);
        }

        public void updateShow(boolean z, boolean z2) {
            if (this.shown != z) {
                this.shown = z;
                if (!z) {
                    this.nextNotAnimate = true;
                }
                if (!z2) {
                    this.showT.set(z ? 1.0f : 0.0f, true);
                }
                invalidate();
            }
        }

        @Override
        public boolean isShown() {
            return this.shown;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            float f = this.showT.set(this.shown ? 1.0f : 0.0f);
            if (f <= 0.0f) {
                return;
            }
            float currentWidth = this.left.getCurrentWidth() + this.centerWidth + this.right.getCurrentWidth() + AndroidUtilities.dp(18.0f);
            float f2 = this.marginTop + ((1.0f - f) * (-AndroidUtilities.dp(8.0f)));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getWidth() - currentWidth) / 2.0f, AndroidUtilities.dpf2(10.0f) + f2, (getWidth() + currentWidth) / 2.0f, AndroidUtilities.dpf2(33.0f) + f2);
            int alpha = this.backgroundPaint.getAlpha();
            this.backgroundPaint.setAlpha((int) (alpha * f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(12.0f), AndroidUtilities.dpf2(12.0f), this.backgroundPaint);
            this.backgroundPaint.setAlpha(alpha);
            canvas.save();
            canvas.translate(((getWidth() - currentWidth) / 2.0f) + AndroidUtilities.dp(9.0f), f2 + AndroidUtilities.dp(10.0f));
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.left;
            animatedTextDrawable.setBounds(0, 0, (int) animatedTextDrawable.getCurrentWidth(), AndroidUtilities.dp(23.0f));
            int i = (int) (f * 255.0f);
            this.left.setAlpha(i);
            this.left.draw(canvas);
            canvas.translate(this.left.getCurrentWidth(), 0.0f);
            canvas.save();
            canvas.translate((-(this.center.getWidth() - this.centerWidth)) / 2.0f, ((AndroidUtilities.dp(23.0f) - this.center.getHeight()) + (this.centerTop / 2.0f)) / 2.0f);
            this.paint.setAlpha(i);
            this.center.draw(canvas);
            canvas.restore();
            canvas.translate(this.centerWidth, 0.0f);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.right;
            animatedTextDrawable2.setBounds(0, 0, (int) animatedTextDrawable2.getCurrentWidth(), AndroidUtilities.dp(23.0f));
            this.right.setAlpha(i);
            this.right.draw(canvas);
            canvas.restore();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            this.marginTop = ActionBar.getCurrentActionBarHeight() + (Build.VERSION.SDK_INT >= 21 ? AndroidUtilities.statusBarHeight : 0);
            this.left.setOverrideFullWidth(size);
            this.right.setOverrideFullWidth(size);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.marginTop + AndroidUtilities.dp(43.0f), 1073741824));
        }
    }

    public void addPhoto(MessageObject messageObject, int i) {
        if (i != this.classGuid) {
            return;
        }
        if (this.imagesByIds[0].indexOfKey(messageObject.getId()) < 0) {
            if (this.opennedFromMedia) {
                this.imagesArr.add(messageObject);
            } else {
                this.imagesArr.add(0, messageObject);
            }
            this.imagesByIds[0].put(messageObject.getId(), messageObject);
        }
        this.endReached[0] = this.imagesArr.size() == this.totalImagesCount;
        setImages();
    }

    public int getClassGuid() {
        return this.classGuid;
    }

    public void setCaption(CharSequence charSequence) {
        this.hasCaptionForAllMedia = true;
        this.captionForAllMedia = charSequence;
        setCurrentCaption(null, charSequence, false, false);
        updateCaptionTextForCurrentPhoto(null);
    }

    public void setAvatarFor(ImageUpdater.AvatarFor avatarFor) {
        int i;
        String str;
        TLRPC$User tLRPC$User;
        this.setAvatarFor = avatarFor;
        if (this.sendPhotoType == 1) {
            if (useFullWidthSendButton()) {
                this.doneButtonFullWidth.setVisibility(0);
                this.pickerViewSendButton.setVisibility(8);
            } else {
                this.pickerViewSendButton.setVisibility(0);
                this.doneButtonFullWidth.setVisibility(8);
            }
            if (avatarFor != null && (tLRPC$User = avatarFor.fromObject) != null && avatarFor.type == 1 && this.setAvatarFor.self) {
                if (avatarFor.isVideo) {
                    this.photoCropView.setSubtitle(LocaleController.formatString("SetSuggestedVideoTooltip", R.string.SetSuggestedVideoTooltip, tLRPC$User.first_name));
                } else {
                    this.photoCropView.setSubtitle(LocaleController.formatString("SetSuggestedPhotoTooltip", R.string.SetSuggestedPhotoTooltip, tLRPC$User.first_name));
                }
            } else {
                this.photoCropView.setSubtitle(null);
            }
        }
        if (avatarFor != null) {
            if (avatarFor.type == 2) {
                if (avatarFor.isVideo) {
                    i = R.string.SuggestVideo;
                    str = "SuggestVideo";
                } else {
                    i = R.string.SuggestPhoto;
                    str = "SuggestPhoto";
                }
                setTitle(LocaleController.getString(str, i));
            }
            if (avatarFor.isVideo) {
                this.videoAvatarTooltip.setText(LocaleController.getString("SetCover", R.string.SetCover));
            }
            this.actionBar.setBackground(null);
            if (Build.VERSION.SDK_INT >= 21) {
                this.actionBar.setElevation(2.0f);
            }
        }
    }

    public boolean useFullWidthSendButton() {
        ImageUpdater.AvatarFor avatarFor = this.setAvatarFor;
        return (avatarFor == null || !avatarFor.self || avatarFor.isVideo) ? false : true;
    }

    public static class SavedVideoPosition {
        public final float position;
        public final long timestamp;

        public SavedVideoPosition(float f, long j) {
            this.position = f;
            this.timestamp = j;
        }
    }

    public void onLinkClick(ClickableSpan clickableSpan, TextView textView) {
        if (textView != null && (clickableSpan instanceof URLSpan)) {
            String url = ((URLSpan) clickableSpan).getURL();
            if (url.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                if (this.videoPlayer == null || this.currentMessageObject == null) {
                    return;
                }
                int intValue = Utilities.parseInt((CharSequence) url).intValue();
                if (this.videoPlayer.getDuration() == -9223372036854775807L) {
                    this.seekToProgressPending = intValue / ((float) this.currentMessageObject.getDuration());
                    return;
                }
                long j = intValue * 1000;
                this.videoPlayer.seekTo(j);
                this.videoPlayerSeekbar.setProgress(((float) j) / ((float) this.videoPlayer.getDuration()), true);
                this.videoPlayerSeekbarView.invalidate();
                return;
            } else if (url.startsWith("#")) {
                if (this.parentActivity instanceof LaunchActivity) {
                    DialogsActivity dialogsActivity = new DialogsActivity(null);
                    dialogsActivity.setSearchString(url);
                    ((LaunchActivity) this.parentActivity).presentFragment(dialogsActivity, false, true);
                    closePhoto(false, false);
                    return;
                }
                return;
            } else if (this.parentChatActivity != null && ((clickableSpan instanceof URLSpanReplacement) || AndroidUtilities.shouldShowUrlInAlert(url))) {
                AlertsCreator.showOpenUrlAlert(this.parentChatActivity, url, true, true);
                return;
            } else {
                clickableSpan.onClick(textView);
                return;
            }
        }
        clickableSpan.onClick(textView);
    }

    public void onLinkLongPress(final android.text.style.URLSpan r11, final android.widget.TextView r12, final java.lang.Runnable r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.onLinkLongPress(android.text.style.URLSpan, android.widget.TextView, java.lang.Runnable):void");
    }

    public void lambda$onLinkLongPress$1(android.text.style.URLSpan r6, android.widget.TextView r7, int r8, android.content.DialogInterface r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.lambda$onLinkLongPress$1(android.text.style.URLSpan, android.widget.TextView, int, android.content.DialogInterface, int):void");
    }

    public void cancelFlashAnimations() {
        View view = this.flashView;
        if (view != null) {
            view.animate().setListener(null).cancel();
            this.flashView.setAlpha(0.0f);
        }
        AnimatorSet animatorSet = this.flashAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.flashAnimator = null;
        }
        PhotoCropView photoCropView = this.photoCropView;
        if (photoCropView != null) {
            photoCropView.cancelThumbAnimation();
        }
    }

    public void cancelVideoPlayRunnable() {
        Runnable runnable = this.videoPlayRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.videoPlayRunnable = null;
        }
    }

    public long getCurrentVideoPosition() {
        PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
        if (photoViewerWebView != null && photoViewerWebView.isControllable()) {
            return this.photoViewerWebView.getCurrentPosition();
        }
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer == null) {
            return 0L;
        }
        return videoPlayer.getCurrentPosition();
    }

    public long getVideoDuration() {
        PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
        if (photoViewerWebView != null && photoViewerWebView.isControllable()) {
            return this.photoViewerWebView.getVideoDuration();
        }
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer == null) {
            return 0L;
        }
        return videoPlayer.getDuration();
    }

    public void seekVideoOrWebTo(long j) {
        PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
        if (photoViewerWebView != null && photoViewerWebView.isControllable()) {
            this.photoViewerWebView.seekTo(j);
        } else {
            VideoPlayer videoPlayer = this.videoPlayer;
            if (videoPlayer != null) {
                videoPlayer.seekTo(j);
            }
        }
        updateVideoPlayerTime();
    }

    public boolean isVideoPlaying() {
        PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
        if (photoViewerWebView != null && photoViewerWebView.isControllable()) {
            return this.photoViewerWebView.isPlaying();
        }
        VideoPlayer videoPlayer = this.videoPlayer;
        return videoPlayer != null && videoPlayer.isPlaying();
    }

    public class AnonymousClass5 implements Runnable {
        AnonymousClass5() {
            PhotoViewer.this = r1;
        }

        @Override
        public void run() {
            float f;
            if (PhotoViewer.this.videoPlayer != null || (PhotoViewer.this.photoViewerWebView != null && PhotoViewer.this.photoViewerWebView.isControllable())) {
                float f2 = 0.0f;
                if (PhotoViewer.this.isCurrentVideo) {
                    if (!PhotoViewer.this.videoTimelineView.isDragging()) {
                        float currentVideoPosition = ((float) PhotoViewer.this.getCurrentVideoPosition()) / ((float) PhotoViewer.this.getVideoDuration());
                        if (!PhotoViewer.this.shownControlsByEnd || PhotoViewer.this.actionBarWasShownBeforeByEnd) {
                            f2 = currentVideoPosition;
                        }
                        if (PhotoViewer.this.inPreview || (PhotoViewer.this.currentEditMode == 0 && PhotoViewer.this.videoTimelineViewContainer.getVisibility() != 0)) {
                            if (PhotoViewer.this.sendPhotoType != 1) {
                                PhotoViewer.this.videoTimelineView.setProgress(f2);
                            }
                        } else if (f2 >= PhotoViewer.this.videoTimelineView.getRightProgress()) {
                            PhotoViewer.this.videoTimelineView.setProgress(PhotoViewer.this.videoTimelineView.getLeftProgress());
                            PhotoViewer.this.videoPlayer.seekTo((int) (PhotoViewer.this.videoTimelineView.getLeftProgress() * ((float) PhotoViewer.this.getVideoDuration())));
                            PhotoViewer.this.manuallyPaused = false;
                            PhotoViewer.this.cancelVideoPlayRunnable();
                            if (PhotoViewer.this.muteVideo || PhotoViewer.this.sendPhotoType == 1 || PhotoViewer.this.currentEditMode != 0 || PhotoViewer.this.switchingToMode > 0) {
                                PhotoViewer.this.playVideoOrWeb();
                            } else {
                                PhotoViewer.this.pauseVideoOrWeb();
                            }
                            PhotoViewer.this.containerView.invalidate();
                        } else {
                            PhotoViewer.this.videoTimelineView.setProgress(f2);
                        }
                        PhotoViewer.this.updateVideoPlayerTime();
                    }
                } else {
                    final float currentVideoPosition2 = ((float) PhotoViewer.this.getCurrentVideoPosition()) / ((float) PhotoViewer.this.getVideoDuration());
                    if (PhotoViewer.this.shownControlsByEnd && !PhotoViewer.this.actionBarWasShownBeforeByEnd) {
                        currentVideoPosition2 = 0.0f;
                    }
                    if (PhotoViewer.this.currentVideoFinishedLoading) {
                        f = 1.0f;
                    } else {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (Math.abs(elapsedRealtime - PhotoViewer.this.lastBufferedPositionCheck) >= 500) {
                            if (PhotoViewer.this.photoViewerWebView == null || !PhotoViewer.this.photoViewerWebView.isControllable()) {
                                if (PhotoViewer.this.isStreaming) {
                                    f = FileLoader.getInstance(PhotoViewer.this.currentAccount).getBufferedProgressFromPosition(PhotoViewer.this.seekToProgressPending != 0.0f ? PhotoViewer.this.seekToProgressPending : currentVideoPosition2, PhotoViewer.this.currentFileNames[0]);
                                } else {
                                    f = 1.0f;
                                }
                            } else {
                                f = PhotoViewer.this.photoViewerWebView.getBufferedPosition();
                            }
                            PhotoViewer.this.lastBufferedPositionCheck = elapsedRealtime;
                        } else {
                            f = -1.0f;
                        }
                    }
                    if (PhotoViewer.this.inPreview || PhotoViewer.this.videoTimelineViewContainer.getVisibility() != 0) {
                        if (PhotoViewer.this.seekToProgressPending == 0.0f) {
                            PhotoViewer photoViewer = PhotoViewer.this;
                            VideoPlayerRewinder videoPlayerRewinder = photoViewer.videoPlayerRewinder;
                            if (videoPlayerRewinder.rewindCount == 0 || !videoPlayerRewinder.rewindByBackSeek) {
                                photoViewer.videoPlayerSeekbar.setProgress(currentVideoPosition2, false);
                            }
                        }
                        if (f != -1.0f) {
                            PhotoViewer.this.videoPlayerSeekbar.setBufferedProgress(f);
                            PipVideoOverlay.setBufferedProgress(f);
                        }
                    } else if (currentVideoPosition2 >= PhotoViewer.this.videoTimelineView.getRightProgress()) {
                        PhotoViewer.this.manuallyPaused = false;
                        PhotoViewer.this.pauseVideoOrWeb();
                        PhotoViewer.this.videoPlayerSeekbar.setProgress(0.0f);
                        PhotoViewer photoViewer2 = PhotoViewer.this;
                        photoViewer2.seekVideoOrWebTo((int) (photoViewer2.videoTimelineView.getLeftProgress() * ((float) PhotoViewer.this.getVideoDuration())));
                        PhotoViewer.this.containerView.invalidate();
                    } else {
                        float leftProgress = currentVideoPosition2 - PhotoViewer.this.videoTimelineView.getLeftProgress();
                        if (leftProgress < 0.0f) {
                            leftProgress = 0.0f;
                        }
                        currentVideoPosition2 = leftProgress / (PhotoViewer.this.videoTimelineView.getRightProgress() - PhotoViewer.this.videoTimelineView.getLeftProgress());
                        if (currentVideoPosition2 > 1.0f) {
                            currentVideoPosition2 = 1.0f;
                        }
                        PhotoViewer.this.videoPlayerSeekbar.setProgress(currentVideoPosition2);
                    }
                    PhotoViewer.this.videoPlayerSeekbarView.invalidate();
                    if (PhotoViewer.this.shouldSavePositionForCurrentVideo != null && currentVideoPosition2 >= 0.0f && SystemClock.elapsedRealtime() - PhotoViewer.this.lastSaveTime >= 1000) {
                        String unused = PhotoViewer.this.shouldSavePositionForCurrentVideo;
                        PhotoViewer.this.lastSaveTime = SystemClock.elapsedRealtime();
                        Utilities.globalQueue.postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                PhotoViewer.AnonymousClass5.this.lambda$run$0(currentVideoPosition2);
                            }
                        });
                    }
                    PhotoViewer.this.updateVideoPlayerTime();
                }
            }
            if (PhotoViewer.this.firstFrameView != null) {
                PhotoViewer.this.firstFrameView.updateAlpha();
            }
            if (PhotoViewer.this.isPlaying) {
                AndroidUtilities.runOnUIThread(PhotoViewer.this.updateProgressRunnable, 17L);
            }
        }

        public void lambda$run$0(float f) {
            ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat(PhotoViewer.this.shouldSavePositionForCurrentVideo, f).commit();
        }
    }

    public void checkChangedTextureView(boolean z) {
        if (z) {
            TextureView textureView = this.changedTextureView;
            if (textureView == null) {
                return;
            }
            textureView.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass8());
            this.changedTextureView.invalidate();
        } else if (this.waitingForFirstTextureUpload == 2) {
            ImageView imageView = this.textureImageView;
            if (imageView != null) {
                imageView.setVisibility(4);
                this.textureImageView.setImageDrawable(null);
                Bitmap bitmap = this.currentBitmap;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.currentBitmap = null;
                }
            }
            this.switchingInlineMode = false;
            if (Build.VERSION.SDK_INT >= 21) {
                final View view = this.usedSurfaceView ? this.videoSurfaceView : this.videoTextureView;
                AspectRatioFrameLayout aspectRatioFrameLayout = this.aspectRatioFrameLayout;
                if (aspectRatioFrameLayout == null) {
                    return;
                }
                aspectRatioFrameLayout.getLocationInWindow(this.pipPosition);
                int[] iArr = this.pipPosition;
                iArr[1] = (int) (iArr[1] - this.containerView.getTranslationY());
                ImageView imageView2 = this.textureImageView;
                if (imageView2 != null) {
                    imageView2.setTranslationX(imageView2.getTranslationX() + getLeftInset());
                }
                if (view != null) {
                    view.setTranslationX((view.getTranslationX() + getLeftInset()) - this.aspectRatioFrameLayout.getX());
                }
                FirstFrameView firstFrameView = this.firstFrameView;
                if (firstFrameView != null) {
                    firstFrameView.setTranslationX(view.getTranslationX());
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        PhotoViewer.this.lambda$checkChangedTextureView$3(valueAnimator);
                    }
                });
                float x = this.usedSurfaceView ? 0.0f : this.pipPosition[0] - this.aspectRatioFrameLayout.getX();
                float y = this.usedSurfaceView ? 0.0f : this.pipPosition[1] - this.aspectRatioFrameLayout.getY();
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ofFloat);
                arrayList.add(ObjectAnimator.ofFloat(this.textureImageView, View.SCALE_X, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.textureImageView, View.SCALE_Y, 1.0f));
                ImageView imageView3 = this.textureImageView;
                Property property = View.TRANSLATION_X;
                float[] fArr = new float[1];
                fArr[0] = this.usedSurfaceView ? 0.0f : this.pipPosition[0];
                arrayList.add(ObjectAnimator.ofFloat(imageView3, property, fArr));
                ImageView imageView4 = this.textureImageView;
                Property property2 = View.TRANSLATION_Y;
                float[] fArr2 = new float[1];
                fArr2[0] = this.usedSurfaceView ? 0.0f : this.pipPosition[1];
                arrayList.add(ObjectAnimator.ofFloat(imageView4, property2, fArr2));
                arrayList.add(ObjectAnimator.ofFloat(view, View.SCALE_X, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(view, View.TRANSLATION_X, x));
                arrayList.add(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, y));
                arrayList.add(ObjectAnimator.ofInt(this.backgroundDrawable, (Property<BackgroundDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, 255));
                FirstFrameView firstFrameView2 = this.firstFrameView;
                if (firstFrameView2 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(firstFrameView2, View.SCALE_X, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.firstFrameView, View.SCALE_Y, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.firstFrameView, View.TRANSLATION_X, x));
                    arrayList.add(ObjectAnimator.ofFloat(this.firstFrameView, View.TRANSLATION_Y, y));
                }
                float f = PipVideoOverlay.getPipRect(false, this.aspectRatioFrameLayout.getAspectRatio()).width;
                view.getWidth();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        PhotoViewer.this.lambda$checkChangedTextureView$4(view, valueAnimator);
                    }
                });
                arrayList.add(ofFloat2);
                animatorSet.playTogether(arrayList);
                DecelerateInterpolator decelerateInterpolator2 = new DecelerateInterpolator();
                animatorSet.setInterpolator(decelerateInterpolator2);
                animatorSet.setDuration(250L);
                SurfaceView surfaceView = this.videoSurfaceView;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                }
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    {
                        PhotoViewer.this = this;
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PhotoViewer.this.pipAnimationInProgress = false;
                        view.setOutlineProvider(null);
                        if (PhotoViewer.this.textureImageView != null) {
                            PhotoViewer.this.textureImageView.setOutlineProvider(null);
                        }
                        if (PhotoViewer.this.firstFrameView != null) {
                            PhotoViewer.this.firstFrameView.setOutlineProvider(null);
                        }
                        if (PhotoViewer.this.videoSurfaceView != null) {
                            PhotoViewer.this.videoSurfaceView.setVisibility(0);
                        }
                    }
                });
                animatorSet.start();
                toggleActionBar(true, true, new ActionBarToggleParams().enableStatusBarAnimation(false).enableTranslationAnimation(false).animationDuration(250).animationInterpolator(decelerateInterpolator2));
            } else {
                toggleActionBar(true, false);
            }
            this.waitingForFirstTextureUpload = 0;
        }
    }

    public class AnonymousClass8 implements ViewTreeObserver.OnPreDrawListener {
        AnonymousClass8() {
            PhotoViewer.this = r1;
        }

        @Override
        public boolean onPreDraw() {
            PhotoViewer.this.changedTextureView.getViewTreeObserver().removeOnPreDrawListener(this);
            if (PhotoViewer.this.textureImageView != null) {
                if (!PhotoViewer.this.isInline) {
                    PhotoViewer.this.textureImageView.setVisibility(4);
                    PhotoViewer.this.textureImageView.setImageDrawable(null);
                    if (PhotoViewer.this.currentBitmap != null) {
                        PhotoViewer.this.currentBitmap.recycle();
                        PhotoViewer.this.currentBitmap = null;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PhotoViewer.AnonymousClass8.this.lambda$onPreDraw$0();
                        }
                    }, 300L);
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.AnonymousClass8.this.lambda$onPreDraw$1();
                }
            });
            PhotoViewer.this.waitingForFirstTextureUpload = 0;
            return true;
        }

        public void lambda$onPreDraw$0() {
            PhotoViewer.this.textureImageView.setVisibility(4);
            PhotoViewer.this.textureImageView.setImageDrawable(null);
            if (PhotoViewer.this.currentBitmap != null) {
                PhotoViewer.this.currentBitmap.recycle();
                PhotoViewer.this.currentBitmap = null;
            }
        }

        public void lambda$onPreDraw$1() {
            if (PhotoViewer.this.isInline) {
                PhotoViewer.this.dismissInternal();
            }
        }
    }

    public void lambda$checkChangedTextureView$3(ValueAnimator valueAnimator) {
        this.clippingImageProgress = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public void lambda$checkChangedTextureView$4(View view, ValueAnimator valueAnimator) {
        this.inlineOutAnimationProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        view.invalidateOutline();
        ImageView imageView = this.textureImageView;
        if (imageView != null) {
            imageView.invalidateOutline();
        }
        FirstFrameView firstFrameView = this.firstFrameView;
        if (firstFrameView != null) {
            firstFrameView.invalidateOutline();
        }
    }

    public void lambda$new$5() {
        if (this.isVisible && this.animationInProgress == 0) {
            updateContainerFlags(this.isActionBarVisible);
        }
    }

    public static class EditState {
        public long averageDuration;
        public MediaController.CropState cropState;
        public ArrayList<VideoEditedInfo.MediaEntity> croppedMediaEntities;
        public String croppedPaintPath;
        public ArrayList<VideoEditedInfo.MediaEntity> mediaEntities;
        public String paintPath;
        public MediaController.SavedFilterState savedFilterState;

        public void reset() {
            this.paintPath = null;
            this.cropState = null;
            this.savedFilterState = null;
            this.mediaEntities = null;
            this.croppedPaintPath = null;
            this.croppedMediaEntities = null;
            this.averageDuration = 0L;
        }
    }

    public class SavedState {
        private int index;
        private ArrayList<MessageObject> messages;
        private PhotoViewerProvider provider;

        public SavedState(int i, ArrayList<MessageObject> arrayList, PhotoViewerProvider photoViewerProvider) {
            PhotoViewer.this = r1;
            this.messages = arrayList;
            this.index = i;
            this.provider = photoViewerProvider;
        }

        public void restore() {
            PhotoViewer.this.placeProvider = this.provider;
            if (Build.VERSION.SDK_INT >= 21) {
                PhotoViewer.this.windowLayoutParams.flags = -2147286784;
            } else {
                PhotoViewer.this.windowLayoutParams.flags = 131072;
            }
            PhotoViewer.this.windowLayoutParams.softInputMode = 272;
            PhotoViewer.this.windowView.setFocusable(false);
            PhotoViewer.this.containerView.setFocusable(false);
            PhotoViewer.this.backgroundDrawable.setAlpha(255);
            PhotoViewer.this.containerView.setAlpha(1.0f);
            PhotoViewer photoViewer = PhotoViewer.this;
            ArrayList<MessageObject> arrayList = this.messages;
            int i = this.index;
            photoViewer.onPhotoShow(null, null, null, null, arrayList, null, null, i, this.provider.getPlaceForPhoto(arrayList.get(i), null, this.index, true));
        }
    }

    public class BackgroundDrawable extends ColorDrawable {
        private boolean allowDrawContent;
        private Runnable drawRunnable;
        private final Paint paint;
        private final RectF rect;
        private final RectF visibleRect;

        public BackgroundDrawable(int i) {
            super(i);
            PhotoViewer.this = r2;
            this.rect = new RectF();
            this.visibleRect = new RectF();
            Paint paint = new Paint(1);
            this.paint = paint;
            paint.setColor(i);
        }

        @Override
        @Keep
        public void setAlpha(int i) {
            if (PhotoViewer.this.parentActivity instanceof LaunchActivity) {
                this.allowDrawContent = (PhotoViewer.this.isVisible && i == 255) ? false : true;
                ((LaunchActivity) PhotoViewer.this.parentActivity).drawerLayoutContainer.setAllowDrawContent(this.allowDrawContent);
                if (PhotoViewer.this.parentAlert != null) {
                    if (this.allowDrawContent) {
                        PhotoViewer.this.parentAlert.setAllowDrawContent(true);
                    } else {
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                PhotoViewer.BackgroundDrawable.this.lambda$setAlpha$0();
                            }
                        }, 50L);
                    }
                }
            }
            super.setAlpha(i);
            this.paint.setAlpha(i);
        }

        public void lambda$setAlpha$0() {
            if (PhotoViewer.this.parentAlert != null) {
                PhotoViewer.this.parentAlert.setAllowDrawContent(this.allowDrawContent);
            }
        }

        @Override
        public void draw(Canvas canvas) {
            Runnable runnable;
            if (PhotoViewer.this.animationInProgress != 0 && !AndroidUtilities.isTablet() && PhotoViewer.this.currentPlaceObject != null && PhotoViewer.this.currentPlaceObject.animatingImageView != null) {
                PhotoViewer.this.animatingImageView.getClippedVisibleRect(this.visibleRect);
                if (!this.visibleRect.isEmpty()) {
                    this.visibleRect.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                    Rect bounds = getBounds();
                    float f = bounds.right;
                    float f2 = bounds.bottom;
                    for (int i = 0; i < 4; i++) {
                        if (i == 0) {
                            RectF rectF = this.rect;
                            RectF rectF2 = this.visibleRect;
                            rectF.set(0.0f, rectF2.top, rectF2.left, rectF2.bottom);
                        } else if (i == 1) {
                            this.rect.set(0.0f, 0.0f, f, this.visibleRect.top);
                        } else if (i == 2) {
                            RectF rectF3 = this.rect;
                            RectF rectF4 = this.visibleRect;
                            rectF3.set(rectF4.right, rectF4.top, f, rectF4.bottom);
                        } else if (i == 3) {
                            this.rect.set(0.0f, this.visibleRect.bottom, f, f2);
                        }
                        canvas.drawRect(this.rect, this.paint);
                    }
                }
            } else {
                super.draw(canvas);
            }
            if (getAlpha() == 0 || (runnable = this.drawRunnable) == null) {
                return;
            }
            AndroidUtilities.runOnUIThread(runnable);
            this.drawRunnable = null;
        }
    }

    public static class SelectedPhotosListView extends RecyclerListView {
        private Drawable arrowDrawable;
        private Paint paint;
        private RectF rect;

        public SelectedPhotosListView(Context context) {
            super(context);
            this.paint = new Paint(1);
            this.rect = new RectF();
            setWillNotDraw(false);
            setClipToPadding(false);
            setTranslationY(-AndroidUtilities.dp(10.0f));
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
                {
                    SelectedPhotosListView.this = this;
                }

                @Override
                public void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                    SelectedPhotosListView.this.invalidate();
                }
            };
            setItemAnimator(defaultItemAnimator);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setSupportsChangeAnimations(false);
            setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            this.paint.setColor(2130706432);
            this.arrowDrawable = context.getResources().getDrawable(R.drawable.photo_tooltip2).mutate();
        }

        @Override
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int childCount = getChildCount();
            if (childCount > 0) {
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(87.0f);
                Drawable drawable = this.arrowDrawable;
                drawable.setBounds(measuredWidth, 0, drawable.getIntrinsicWidth() + measuredWidth, AndroidUtilities.dp(6.0f));
                this.arrowDrawable.draw(canvas);
                int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i2 = Integer.MIN_VALUE;
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    i = (int) Math.min(i, Math.floor(childAt.getX()));
                    i2 = (int) Math.max(i2, Math.ceil(childAt.getX() + childAt.getMeasuredWidth()));
                }
                if (i == Integer.MAX_VALUE || i2 == Integer.MIN_VALUE) {
                    return;
                }
                this.rect.set(i - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), i2 + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(103.0f));
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.paint);
            }
        }
    }

    public static class CounterView extends View {
        private int currentCount;
        private int height;
        private Paint paint;
        private RectF rect;
        private float rotation;
        private StaticLayout staticLayout;
        private TextPaint textPaint;
        private int width;

        public CounterView(Context context) {
            super(context);
            this.currentCount = 0;
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.textPaint.setColor(-1);
            Paint paint = new Paint(1);
            this.paint = paint;
            paint.setColor(-1);
            this.paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            this.paint.setStyle(Paint.Style.STROKE);
            this.paint.setStrokeJoin(Paint.Join.ROUND);
            this.rect = new RectF();
            setCount(0);
        }

        @Override
        @Keep
        public void setScaleX(float f) {
            super.setScaleX(f);
            invalidate();
        }

        @Override
        @Keep
        public void setRotationX(float f) {
            this.rotation = f;
            invalidate();
        }

        @Override
        public float getRotationX() {
            return this.rotation;
        }

        public void setCount(int i) {
            StaticLayout staticLayout = new StaticLayout("" + Math.max(1, i), this.textPaint, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.staticLayout = staticLayout;
            this.width = (int) Math.ceil((double) staticLayout.getLineWidth(0));
            this.height = this.staticLayout.getLineBottom(0);
            AnimatorSet animatorSet = new AnimatorSet();
            if (i == 0) {
                Paint paint = this.paint;
                Property<Paint, Integer> property = AnimationProperties.PAINT_ALPHA;
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 0.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.0f), ObjectAnimator.ofInt(paint, property, 0), ObjectAnimator.ofInt(this.textPaint, (Property<TextPaint, Integer>) property, 0));
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                int i2 = this.currentCount;
                if (i2 == 0) {
                    Paint paint2 = this.paint;
                    Property<Paint, Integer> property2 = AnimationProperties.PAINT_ALPHA;
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofInt(paint2, property2, 0, 255), ObjectAnimator.ofInt(this.textPaint, (Property<TextPaint, Integer>) property2, 0, 255));
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                } else if (i < i2) {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 1.1f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 1.1f, 1.0f));
                    animatorSet.setInterpolator(new OvershootInterpolator());
                } else {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.SCALE_X, 0.9f, 1.0f), ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.9f, 1.0f));
                    animatorSet.setInterpolator(new OvershootInterpolator());
                }
            }
            animatorSet.setDuration(180L);
            animatorSet.start();
            requestLayout();
            this.currentCount = i;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.max(this.width + AndroidUtilities.dp(20.0f), AndroidUtilities.dp(30.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int measuredHeight = getMeasuredHeight() / 2;
            this.paint.setAlpha(255);
            this.rect.set(AndroidUtilities.dp(1.0f), measuredHeight - AndroidUtilities.dp(14.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), measuredHeight + AndroidUtilities.dp(14.0f));
            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.paint);
            if (this.staticLayout != null) {
                this.textPaint.setAlpha((int) ((1.0f - this.rotation) * 255.0f));
                canvas.save();
                canvas.translate((getMeasuredWidth() - this.width) / 2, ((getMeasuredHeight() - this.height) / 2) + AndroidUtilities.dpf2(0.2f) + (this.rotation * AndroidUtilities.dp(5.0f)));
                this.staticLayout.draw(canvas);
                canvas.restore();
                this.paint.setAlpha((int) (this.rotation * 255.0f));
                int centerX = (int) this.rect.centerX();
                int centerY = (int) (((int) this.rect.centerY()) - (AndroidUtilities.dp(5.0f) * (1.0f - this.rotation)));
                canvas.drawLine(AndroidUtilities.dp(5.0f) + centerX, centerY - AndroidUtilities.dp(5.0f), centerX - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f) + centerY, this.paint);
                canvas.drawLine(centerX - AndroidUtilities.dp(5.0f), centerY - AndroidUtilities.dp(5.0f), centerX + AndroidUtilities.dp(5.0f), centerY + AndroidUtilities.dp(5.0f), this.paint);
            }
        }
    }

    public class PhotoProgressView {
        private View parent;
        private final CombinedDrawable playDrawable;
        private final PlayPauseDrawable playPauseDrawable;
        private boolean visible;
        private long lastUpdateTime = 0;
        private float radOffset = 0.0f;
        private float currentProgress = 0.0f;
        private float animationProgressStart = 0.0f;
        private long currentProgressTime = 0;
        private float animatedProgressValue = 0.0f;
        private RectF progressRect = new RectF();
        private int backgroundState = -1;
        private int size = AndroidUtilities.dp(64.0f);
        private int previousBackgroundState = -2;
        private float animatedAlphaValue = 1.0f;
        private float[] animAlphas = new float[3];
        private float[] alphas = new float[3];
        private float scale = 1.0f;

        protected void onBackgroundStateUpdated(int i) {
            throw null;
        }

        protected void onVisibilityChanged(boolean z) {
            throw null;
        }

        public PhotoProgressView(View view) {
            PhotoViewer.this = r5;
            if (PhotoViewer.decelerateInterpolator == null) {
                DecelerateInterpolator unused = PhotoViewer.decelerateInterpolator = new DecelerateInterpolator(1.5f);
                Paint unused2 = PhotoViewer.progressPaint = new Paint(1);
                PhotoViewer.progressPaint.setStyle(Paint.Style.STROKE);
                PhotoViewer.progressPaint.setStrokeCap(Paint.Cap.ROUND);
                PhotoViewer.progressPaint.setStrokeWidth(AndroidUtilities.dp(3.0f));
                PhotoViewer.progressPaint.setColor(-1);
            }
            this.parent = view;
            resetAlphas();
            PlayPauseDrawable playPauseDrawable = new PlayPauseDrawable(28);
            this.playPauseDrawable = playPauseDrawable;
            playPauseDrawable.setDuration(200);
            this.playDrawable = new CombinedDrawable(ContextCompat.getDrawable(r5.parentActivity, R.drawable.circle_big).mutate(), playPauseDrawable);
        }

        private void updateAnimation(boolean z) {
            boolean z2;
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.lastUpdateTime;
            if (j > 18) {
                j = 18;
            }
            this.lastUpdateTime = currentTimeMillis;
            int i = 0;
            if (z) {
                if (this.animatedProgressValue == 1.0f && this.currentProgress == 1.0f) {
                    z2 = false;
                } else {
                    this.radOffset += ((float) (360 * j)) / 3000.0f;
                    float f = this.currentProgress - this.animationProgressStart;
                    if (Math.abs(f) > 0.0f) {
                        long j2 = this.currentProgressTime + j;
                        this.currentProgressTime = j2;
                        if (j2 < 300) {
                            this.animatedProgressValue = this.animationProgressStart + (f * PhotoViewer.decelerateInterpolator.getInterpolation(((float) this.currentProgressTime) / 300.0f));
                        } else {
                            float f2 = this.currentProgress;
                            this.animatedProgressValue = f2;
                            this.animationProgressStart = f2;
                            this.currentProgressTime = 0L;
                        }
                    }
                    z2 = true;
                }
                float f3 = this.animatedAlphaValue;
                if (f3 > 0.0f && this.previousBackgroundState != -2) {
                    float f4 = f3 - (((float) j) / 200.0f);
                    this.animatedAlphaValue = f4;
                    if (f4 <= 0.0f) {
                        this.animatedAlphaValue = 0.0f;
                        this.previousBackgroundState = -2;
                    }
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            while (true) {
                float[] fArr = this.alphas;
                if (i >= fArr.length) {
                    break;
                }
                float f5 = fArr[i];
                float[] fArr2 = this.animAlphas;
                if (f5 > fArr2[i]) {
                    fArr2[i] = Math.min(1.0f, fArr2[i] + (((float) j) / 200.0f));
                } else if (fArr[i] < fArr2[i]) {
                    fArr2[i] = Math.max(0.0f, fArr2[i] - (((float) j) / 200.0f));
                } else {
                    i++;
                }
                z2 = true;
                i++;
            }
            if (z2) {
                this.parent.postInvalidateOnAnimation();
            }
        }

        public void setProgress(float f, boolean z) {
            if (!z) {
                this.animatedProgressValue = f;
                this.animationProgressStart = f;
            } else {
                this.animationProgressStart = this.animatedProgressValue;
            }
            this.currentProgress = f;
            this.currentProgressTime = 0L;
            this.parent.invalidate();
        }

        public void setBackgroundState(int i, boolean z, boolean z2) {
            int i2;
            int i3 = this.backgroundState;
            if (i3 == i) {
                return;
            }
            PlayPauseDrawable playPauseDrawable = this.playPauseDrawable;
            if (playPauseDrawable != null) {
                boolean z3 = z2 && (i3 == 3 || i3 == 4);
                if (i == 3) {
                    playPauseDrawable.setPause(false, z3);
                } else if (i == 4) {
                    playPauseDrawable.setPause(true, z3);
                }
                this.playPauseDrawable.setParent(this.parent);
                this.playPauseDrawable.invalidateSelf();
            }
            this.lastUpdateTime = System.currentTimeMillis();
            if (z && (i2 = this.backgroundState) != i) {
                this.previousBackgroundState = i2;
                this.animatedAlphaValue = 1.0f;
            } else {
                this.previousBackgroundState = -2;
            }
            this.backgroundState = i;
            onBackgroundStateUpdated(i);
            this.parent.invalidate();
        }

        public void setAlpha(float f) {
            setIndexedAlpha(0, f, false);
        }

        public void setScale(float f) {
            this.scale = f;
        }

        public void setIndexedAlpha(int i, float f, boolean z) {
            float[] fArr = this.alphas;
            if (fArr[i] != f) {
                fArr[i] = f;
                if (!z) {
                    this.animAlphas[i] = f;
                }
                checkVisibility();
                this.parent.invalidate();
            }
        }

        public void resetAlphas() {
            int i = 0;
            while (true) {
                float[] fArr = this.alphas;
                if (i < fArr.length) {
                    this.animAlphas[i] = 1.0f;
                    fArr[i] = 1.0f;
                    i++;
                } else {
                    checkVisibility();
                    return;
                }
            }
        }

        private float calculateAlpha() {
            float f;
            float f2 = 1.0f;
            int i = 0;
            while (true) {
                float[] fArr = this.animAlphas;
                if (i >= fArr.length) {
                    return f2;
                }
                if (i == 2) {
                    f = AndroidUtilities.accelerateInterpolator.getInterpolation(fArr[i]);
                } else {
                    f = fArr[i];
                }
                f2 *= f;
                i++;
            }
        }

        private void checkVisibility() {
            boolean z = false;
            int i = 0;
            while (true) {
                float[] fArr = this.alphas;
                if (i >= fArr.length) {
                    z = true;
                    break;
                } else if (fArr[i] != 1.0f) {
                    break;
                } else {
                    i++;
                }
            }
            if (z != this.visible) {
                this.visible = z;
                onVisibilityChanged(z);
            }
        }

        public boolean isVisible() {
            return this.visible;
        }

        public int getX() {
            return (PhotoViewer.this.containerView.getWidth() - ((int) (this.size * this.scale))) / 2;
        }

        public int getY() {
            int i = (int) ((((AndroidUtilities.displaySize.y + (PhotoViewer.this.isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0)) - ((int) (this.size * this.scale))) / 2) + PhotoViewer.this.currentPanTranslationY);
            return PhotoViewer.this.sendPhotoType == 1 ? i - AndroidUtilities.dp(38.0f) : i;
        }

        public void onDraw(Canvas canvas) {
            int i;
            Drawable drawable;
            Drawable drawable2;
            int i2 = (int) (this.size * this.scale);
            int x = getX();
            int y = getY();
            float calculateAlpha = calculateAlpha();
            int i3 = this.previousBackgroundState;
            if (i3 >= 0 && i3 < PhotoViewer.progressDrawables.length + 2) {
                if (this.previousBackgroundState < PhotoViewer.progressDrawables.length) {
                    drawable2 = PhotoViewer.progressDrawables[this.previousBackgroundState];
                } else {
                    drawable2 = this.playDrawable;
                }
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (this.animatedAlphaValue * 255.0f * calculateAlpha));
                    drawable2.setBounds(x, y, x + i2, y + i2);
                    drawable2.draw(canvas);
                }
            }
            int i4 = this.backgroundState;
            if (i4 >= 0 && i4 < PhotoViewer.progressDrawables.length + 2) {
                if (this.backgroundState < PhotoViewer.progressDrawables.length) {
                    drawable = PhotoViewer.progressDrawables[this.backgroundState];
                } else {
                    drawable = this.playDrawable;
                }
                if (drawable != null) {
                    if (this.previousBackgroundState != -2) {
                        drawable.setAlpha((int) ((1.0f - this.animatedAlphaValue) * 255.0f * calculateAlpha));
                    } else {
                        drawable.setAlpha((int) (calculateAlpha * 255.0f));
                    }
                    drawable.setBounds(x, y, x + i2, y + i2);
                    drawable.draw(canvas);
                }
            }
            int i5 = this.backgroundState;
            if (i5 == 0 || i5 == 1 || (i = this.previousBackgroundState) == 0 || i == 1) {
                int dp = AndroidUtilities.dp(4.0f);
                if (this.previousBackgroundState != -2) {
                    PhotoViewer.progressPaint.setAlpha((int) (this.animatedAlphaValue * 255.0f * calculateAlpha));
                } else {
                    PhotoViewer.progressPaint.setAlpha((int) (calculateAlpha * 255.0f));
                }
                this.progressRect.set(x + dp, y + dp, (x + i2) - dp, (y + i2) - dp);
                canvas.drawArc(this.progressRect, this.radOffset - 90.0f, Math.max(4.0f, this.animatedProgressValue * 360.0f), false, PhotoViewer.progressPaint);
                updateAnimation(true);
                return;
            }
            updateAnimation(false);
        }
    }

    public class FrameLayoutDrawer extends SizeNotifierFrameLayoutPhoto {
        private boolean captionAbove;
        private ArrayList<Rect> exclusionRects;
        private boolean ignoreLayout;
        private Paint paint;

        public FrameLayoutDrawer(Context context, Activity activity) {
            super(context, activity, false);
            PhotoViewer.this = r1;
            this.paint = new Paint();
            setWillNotDraw(false);
            this.paint.setColor(AndroidUtilities.DARK_STATUS_BAR_OVERLAY);
            setLayerType(2, null);
        }

        @Override
        protected void onMeasure(int r18, int r19) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.FrameLayoutDrawer.onMeasure(int, int):void");
        }

        @Override
        public void onLayout(boolean r16, int r17, int r18, int r19, int r20) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.FrameLayoutDrawer.onLayout(boolean, int, int, int, int):void");
        }

        public void updateExclusionRects() {
            if (Build.VERSION.SDK_INT >= 29) {
                if (this.exclusionRects == null) {
                    this.exclusionRects = new ArrayList<>();
                }
                this.exclusionRects.clear();
                if (PhotoViewer.this.currentEditMode == 1 || PhotoViewer.this.switchingToMode == 1) {
                    int measuredHeight = getMeasuredHeight();
                    int measuredWidth = getMeasuredWidth();
                    this.exclusionRects.add(new Rect(0, (measuredHeight - AndroidUtilities.dp(200.0f)) / 2, AndroidUtilities.dp(100.0f), (AndroidUtilities.dp(200.0f) + measuredHeight) / 2));
                    this.exclusionRects.add(new Rect(measuredWidth - AndroidUtilities.dp(100.0f), (measuredHeight - AndroidUtilities.dp(200.0f)) / 2, measuredWidth, (measuredHeight + AndroidUtilities.dp(200.0f)) / 2));
                }
                setSystemGestureExclusionRects(this.exclusionRects);
                invalidate();
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            PhotoViewer.this.onDraw(canvas);
            if (!PhotoViewer.this.isStatusBarVisible() || AndroidUtilities.statusBarHeight == 0 || PhotoViewer.this.actionBar == null) {
                return;
            }
            if (Build.VERSION.SDK_INT < 21) {
                this.paint.setAlpha((int) (PhotoViewer.this.actionBar.getAlpha() * 255.0f * 0.2f));
                canvas.drawRect(0.0f, PhotoViewer.this.currentPanTranslationY, getMeasuredWidth(), PhotoViewer.this.currentPanTranslationY + AndroidUtilities.statusBarHeight, this.paint);
            }
            this.paint.setAlpha((int) (PhotoViewer.this.actionBar.getAlpha() * 255.0f * 0.498f));
            if (getPaddingRight() > 0) {
                canvas.drawRect(getMeasuredWidth() - getPaddingRight(), 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.paint);
            }
            if (getPaddingLeft() > 0) {
                canvas.drawRect(0.0f, 0.0f, getPaddingLeft(), getMeasuredHeight(), this.paint);
            }
            if (getPaddingBottom() > 0) {
                float dpf2 = AndroidUtilities.dpf2(24.0f) * (1.0f - PhotoViewer.this.actionBar.getAlpha());
                canvas.drawRect(0.0f, (getMeasuredHeight() - getPaddingBottom()) + dpf2, getMeasuredWidth(), getMeasuredHeight() + dpf2, this.paint);
            }
        }

        @Override
        public void draw(Canvas canvas) {
            super.draw(canvas);
            if (PhotoViewer.this.photoViewerWebView == null || !PhotoViewer.this.photoViewerWebView.isControllable() || PhotoViewer.this.videoForwardDrawable == null || !PhotoViewer.this.videoForwardDrawable.isAnimating()) {
                return;
            }
            int measuredHeight = ((int) (PhotoViewer.this.photoViewerWebView.getWebView().getMeasuredHeight() * (PhotoViewer.this.scale - 1.0f))) / 2;
            PhotoViewer.this.videoForwardDrawable.setBounds(PhotoViewer.this.photoViewerWebView.getLeft(), (PhotoViewer.this.photoViewerWebView.getWebView().getTop() - measuredHeight) + ((int) (PhotoViewer.this.translationY / PhotoViewer.this.scale)), PhotoViewer.this.photoViewerWebView.getRight(), PhotoViewer.this.photoViewerWebView.getWebView().getBottom() + measuredHeight + ((int) (PhotoViewer.this.translationY / PhotoViewer.this.scale)));
            PhotoViewer.this.videoForwardDrawable.draw(canvas);
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view == PhotoViewer.this.leftPaintingOverlay || view == PhotoViewer.this.rightPaintingOverlay) {
                return false;
            }
            if (view != PhotoViewer.this.navigationBar && (PhotoViewer.this.captionEdit == null || !PhotoViewer.this.captionEdit.editText.isPopupView(view))) {
                canvas.save();
            }
            boolean drawChildInternal = drawChildInternal(canvas, view, j);
            if (view != PhotoViewer.this.navigationBar && (PhotoViewer.this.captionEdit == null || !PhotoViewer.this.captionEdit.editText.isPopupView(view))) {
                canvas.restore();
            }
            return drawChildInternal;
        }

        protected boolean drawChildInternal(Canvas canvas, View view, long j) {
            if (view == PhotoViewer.this.miniProgressView) {
                return false;
            }
            if (view != PhotoViewer.this.videoTimelineViewContainer || PhotoViewer.this.videoTimelineViewContainer.getTranslationY() <= 0.0f || PhotoViewer.this.pickerView.getTranslationY() != 0.0f) {
                try {
                    if (view == PhotoViewer.this.aspectRatioFrameLayout || view == PhotoViewer.this.paintingOverlay) {
                        return false;
                    }
                    return super.drawChild(canvas, view, j);
                } catch (Throwable unused) {
                    return true;
                }
            }
            canvas.save();
            canvas.clipRect(PhotoViewer.this.videoTimelineViewContainer.getX(), PhotoViewer.this.videoTimelineViewContainer.getY(), PhotoViewer.this.videoTimelineViewContainer.getX() + PhotoViewer.this.videoTimelineViewContainer.getMeasuredWidth(), PhotoViewer.this.videoTimelineViewContainer.getBottom());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }

        @Override
        public void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
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
                    return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
                }

                @Override
                public int getTopOffset(int i) {
                    return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
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

                {
                    FrameLayoutDrawer.this = this;
                }

                @Override
                public int getBottomOffset(int i) {
                    int height;
                    int i2 = 0;
                    if (PhotoViewer.this.editing) {
                        if (PhotoViewer.this.captionEdit != null && PhotoViewer.this.captionEdit.getVisibility() == 0) {
                            i2 = 0 + PhotoViewer.this.captionEdit.getEditTextHeight() + AndroidUtilities.dp(12.0f);
                        }
                        if (PhotoViewer.this.pickerView == null || PhotoViewer.this.pickerView.getVisibility() != 0) {
                            return i2;
                        }
                        height = PhotoViewer.this.pickerView.getHeight();
                    } else {
                        if (PhotoViewer.this.bottomLayout != null && PhotoViewer.this.bottomLayout.getVisibility() == 0) {
                            i2 = 0 + PhotoViewer.this.bottomLayout.getHeight();
                        }
                        if (PhotoViewer.this.groupedPhotosListView == null || !PhotoViewer.this.groupedPhotosListView.hasPhotos()) {
                            return i2;
                        }
                        if (!AndroidUtilities.isTablet() && PhotoViewer.this.containerView.getMeasuredHeight() <= PhotoViewer.this.containerView.getMeasuredWidth()) {
                            return i2;
                        }
                        height = PhotoViewer.this.groupedPhotosListView.getHeight();
                    }
                    return i2 + height;
                }
            });
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            Bulletin.removeDelegate(this);
        }

        @Override
        public void notifyHeightChanged() {
            super.notifyHeightChanged();
            if (PhotoViewer.this.isCurrentVideo) {
                PhotoViewer.this.photoProgressViews[0].setIndexedAlpha(2, getKeyboardHeight() <= AndroidUtilities.dp(20.0f) ? 1.0f : 0.0f, true);
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 24) {
            VPC_PROGRESS = new FloatProperty<VideoPlayerControlFrameLayout>("progress") {
                @Override
                public void setValue(VideoPlayerControlFrameLayout videoPlayerControlFrameLayout, float f) {
                    videoPlayerControlFrameLayout.setProgress(f);
                }

                @Override
                public Float get(VideoPlayerControlFrameLayout videoPlayerControlFrameLayout) {
                    return Float.valueOf(videoPlayerControlFrameLayout.getProgress());
                }
            };
        } else {
            VPC_PROGRESS = new Property<VideoPlayerControlFrameLayout, Float>(Float.class, "progress") {
                @Override
                public void set(VideoPlayerControlFrameLayout videoPlayerControlFrameLayout, Float f) {
                    videoPlayerControlFrameLayout.setProgress(f.floatValue());
                }

                @Override
                public Float get(VideoPlayerControlFrameLayout videoPlayerControlFrameLayout) {
                    return Float.valueOf(videoPlayerControlFrameLayout.getProgress());
                }
            };
        }
        Instance = null;
        PipInstance = null;
    }

    public class VideoPlayerControlFrameLayout extends FrameLayout {
        private boolean ignoreLayout;
        private int lastTimeWidth;
        private int parentHeight;
        private int parentWidth;
        private float progress;
        private boolean seekBarTransitionEnabled;
        private SpringAnimation timeSpring;
        private FloatValueHolder timeValue;
        private boolean translationYAnimationEnabled;

        public void lambda$new$0(DynamicAnimation dynamicAnimation, float f, float f2) {
            PhotoViewer.this.videoPlayerSeekbar.setSize((int) (((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f) - (this.parentWidth > this.parentHeight ? AndroidUtilities.dp(48.0f) : 0)), getMeasuredHeight());
        }

        public VideoPlayerControlFrameLayout(Context context) {
            super(context);
            PhotoViewer.this = r3;
            this.progress = 1.0f;
            this.translationYAnimationEnabled = true;
            this.timeValue = new FloatValueHolder(0.0f);
            this.timeSpring = new SpringAnimation(this.timeValue).setSpring(new SpringForce(0.0f).setStiffness(750.0f).setDampingRatio(1.0f)).addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                @Override
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                    PhotoViewer.VideoPlayerControlFrameLayout.this.lambda$new$0(dynamicAnimation, f, f2);
                }
            });
            setWillNotDraw(false);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (this.progress < 1.0f) {
                return false;
            }
            if (PhotoViewer.this.videoPlayerSeekbar.onTouch(motionEvent.getAction(), motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY())) {
                getParent().requestDisallowInterceptTouchEvent(true);
                PhotoViewer.this.videoPlayerSeekbarView.invalidate();
            }
            return true;
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.timeValue.setValue(0.0f);
            this.lastTimeWidth = 0;
        }

        @Override
        public void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int i3;
            String format;
            this.ignoreLayout = true;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) PhotoViewer.this.videoPlayerTime.getLayoutParams();
            if (this.parentWidth > this.parentHeight) {
                if (PhotoViewer.this.exitFullscreenButton.getVisibility() != 0) {
                    PhotoViewer.this.exitFullscreenButton.setVisibility(0);
                }
                i3 = AndroidUtilities.dp(48.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
            } else {
                if (PhotoViewer.this.exitFullscreenButton.getVisibility() != 4) {
                    PhotoViewer.this.exitFullscreenButton.setVisibility(4);
                }
                layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
                i3 = 0;
            }
            this.ignoreLayout = false;
            super.onMeasure(i, i2);
            long j = 0;
            if (PhotoViewer.this.videoPlayer != null) {
                long duration = PhotoViewer.this.videoPlayer.getDuration();
                if (duration != -9223372036854775807L) {
                    j = duration;
                }
            } else if (PhotoViewer.this.photoViewerWebView != null && PhotoViewer.this.photoViewerWebView.isControllable()) {
                j = PhotoViewer.this.photoViewerWebView.getVideoDuration();
            }
            long j2 = j / 1000;
            long j3 = j2 / 60;
            if (j3 > 60) {
                format = String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(j3 / 60), Long.valueOf(j3 % 60), Long.valueOf(j2 % 60));
            } else {
                format = String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(j3), Long.valueOf(j2 % 60));
            }
            int ceil = (int) Math.ceil(PhotoViewer.this.videoPlayerTime.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", format)));
            this.timeSpring.cancel();
            if (this.lastTimeWidth != 0) {
                float f = ceil;
                if (this.timeValue.getValue() != f) {
                    this.timeSpring.getSpring().setFinalPosition(f);
                    this.timeSpring.start();
                    this.lastTimeWidth = ceil;
                }
            }
            PhotoViewer.this.videoPlayerSeekbar.setSize(((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i3, getMeasuredHeight());
            this.timeValue.setValue(ceil);
            this.lastTimeWidth = ceil;
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            float currentPosition = PhotoViewer.this.videoPlayer != null ? ((float) PhotoViewer.this.videoPlayer.getCurrentPosition()) / ((float) PhotoViewer.this.videoPlayer.getDuration()) : 0.0f;
            if (PhotoViewer.this.playerWasReady) {
                PhotoViewer.this.videoPlayerSeekbar.setProgress(currentPosition);
            }
            PhotoViewer.this.videoTimelineView.setProgress(currentPosition);
        }

        public float getProgress() {
            return this.progress;
        }

        public void setProgress(float f) {
            if (this.progress != f) {
                this.progress = f;
                onProgressChanged(f);
            }
        }

        private void onProgressChanged(float f) {
            PhotoViewer.this.videoPlayerTime.setAlpha(f);
            PhotoViewer.this.exitFullscreenButton.setAlpha(f);
            if (this.seekBarTransitionEnabled) {
                PhotoViewer.this.videoPlayerTime.setPivotX(PhotoViewer.this.videoPlayerTime.getWidth());
                PhotoViewer.this.videoPlayerTime.setPivotY(PhotoViewer.this.videoPlayerTime.getHeight());
                float f2 = 1.0f - f;
                float f3 = 1.0f - (0.1f * f2);
                PhotoViewer.this.videoPlayerTime.setScaleX(f3);
                PhotoViewer.this.videoPlayerTime.setScaleY(f3);
                PhotoViewer.this.videoPlayerSeekbar.setTransitionProgress(f2);
                return;
            }
            if (this.translationYAnimationEnabled) {
                setTranslationY(AndroidUtilities.dpf2(24.0f) * (1.0f - f));
            }
            PhotoViewer.this.videoPlayerSeekbarView.setAlpha(f);
        }

        public void setSeekBarTransitionEnabled(boolean z) {
            if (this.seekBarTransitionEnabled != z) {
                this.seekBarTransitionEnabled = z;
                if (!z) {
                    PhotoViewer.this.videoPlayerTime.setScaleX(1.0f);
                    PhotoViewer.this.videoPlayerTime.setScaleY(1.0f);
                    PhotoViewer.this.videoPlayerSeekbar.setTransitionProgress(0.0f);
                } else {
                    setTranslationY(0.0f);
                    PhotoViewer.this.videoPlayerSeekbarView.setAlpha(1.0f);
                }
                onProgressChanged(this.progress);
            }
        }

        public void setTranslationYAnimationEnabled(boolean z) {
            if (this.translationYAnimationEnabled != z) {
                this.translationYAnimationEnabled = z;
                if (!z) {
                    setTranslationY(0.0f);
                }
                onProgressChanged(this.progress);
            }
        }
    }

    public static class CaptionTextViewSwitcher extends TextViewSwitcher {
        private float alpha;
        private FrameLayout container;
        private boolean inScrollView;
        private NestedScrollView scrollView;

        public CaptionTextViewSwitcher(Context context) {
            super(context);
            this.inScrollView = false;
            this.alpha = 1.0f;
        }

        public void setScrollView(NestedScrollView nestedScrollView) {
            this.scrollView = nestedScrollView;
        }

        public void setContainer(FrameLayout frameLayout) {
            this.container = frameLayout;
        }

        @Override
        public void setVisibility(int i) {
            setVisibility(i, true);
        }

        public void setVisibility(int i, boolean z) {
            super.setVisibility(i);
            if (this.inScrollView && z) {
                this.scrollView.setVisibility(i);
            }
        }

        @Override
        public void setAlpha(float f) {
            this.alpha = f;
            if (this.inScrollView) {
                this.scrollView.setAlpha(f);
            } else {
                super.setAlpha(f);
            }
        }

        @Override
        public float getAlpha() {
            if (this.inScrollView) {
                return this.alpha;
            }
            return super.getAlpha();
        }

        @Override
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            if (this.inScrollView) {
                this.scrollView.invalidate();
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.container == null || getParent() != this.container) {
                return;
            }
            this.inScrollView = true;
            this.scrollView.setVisibility(getVisibility());
            this.scrollView.setAlpha(this.alpha);
            super.setAlpha(1.0f);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.inScrollView) {
                this.inScrollView = false;
                this.scrollView.setVisibility(8);
                super.setAlpha(this.alpha);
            }
        }
    }

    public static class CaptionScrollView extends NestedScrollView {
        private Method abortAnimatedScrollMethod;
        public float backgroundAlpha;
        private final FrameLayout captionContainer;
        private final CaptionTextViewSwitcher captionTextViewSwitcher;
        public boolean dontChangeTopMargin;
        private boolean isLandscape;
        private boolean nestedScrollStarted;
        private float overScrollY;
        private final Paint paint;
        private int pendingTopMargin;
        private int prevHeight;
        private OverScroller scroller;
        private final SpringAnimation springAnimation;
        private int textHash;
        private float velocitySign;
        private float velocityY;

        @Override
        protected float getBottomFadingEdgeStrength() {
            return 1.0f;
        }

        @Override
        protected float getTopFadingEdgeStrength() {
            return 1.0f;
        }

        protected boolean isStatusBarVisible() {
            return true;
        }

        protected void onScrollEnd() {
        }

        protected void onScrollStart() {
        }

        protected void onScrollUpdate() {
        }

        public CaptionScrollView(Context context, CaptionTextViewSwitcher captionTextViewSwitcher, FrameLayout frameLayout) {
            super(context);
            Paint paint = new Paint(1);
            this.paint = paint;
            this.backgroundAlpha = 1.0f;
            this.pendingTopMargin = -1;
            this.captionTextViewSwitcher = captionTextViewSwitcher;
            this.captionContainer = frameLayout;
            setClipChildren(false);
            setOverScrollMode(2);
            paint.setColor(-16777216);
            setFadingEdgeLength(AndroidUtilities.dp(12.0f));
            setVerticalFadingEdgeEnabled(true);
            setWillNotDraw(false);
            SpringAnimation springAnimation = new SpringAnimation(captionTextViewSwitcher, DynamicAnimation.TRANSLATION_Y, 0.0f);
            this.springAnimation = springAnimation;
            springAnimation.getSpring().setStiffness(100.0f);
            springAnimation.setMinimumVisibleChange(1.0f);
            springAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                @Override
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                    PhotoViewer.CaptionScrollView.this.lambda$new$0(dynamicAnimation, f, f2);
                }
            });
            springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                @Override
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                    PhotoViewer.CaptionScrollView.this.lambda$new$1(dynamicAnimation, z, f, f2);
                }
            });
            springAnimation.getSpring().setDampingRatio(1.0f);
            try {
                Method declaredMethod = NestedScrollView.class.getDeclaredMethod("abortAnimatedScroll", new Class[0]);
                this.abortAnimatedScrollMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception e) {
                this.abortAnimatedScrollMethod = null;
                FileLog.e(e);
            }
            try {
                Field declaredField = NestedScrollView.class.getDeclaredField("mScroller");
                declaredField.setAccessible(true);
                this.scroller = (OverScroller) declaredField.get(this);
            } catch (Exception e2) {
                this.scroller = null;
                FileLog.e(e2);
            }
        }

        public void lambda$new$0(DynamicAnimation dynamicAnimation, float f, float f2) {
            this.overScrollY = f;
            this.velocityY = f2;
            onScrollUpdate();
        }

        public void lambda$new$1(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
            onScrollEnd();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= (this.captionContainer.getTop() - getScrollY()) + this.captionTextViewSwitcher.getTranslationY()) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }

        @Override
        public void onMeasure(int i, int i2) {
            updateTopMargin(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            super.onMeasure(i, i2);
        }

        public void applyPendingTopMargin() {
            this.dontChangeTopMargin = false;
            if (this.pendingTopMargin >= 0) {
                ((ViewGroup.MarginLayoutParams) this.captionContainer.getLayoutParams()).topMargin = this.pendingTopMargin;
                this.pendingTopMargin = -1;
                requestLayout();
            }
        }

        public int getPendingMarginTopDiff() {
            int i = this.pendingTopMargin;
            if (i >= 0) {
                return i - ((ViewGroup.MarginLayoutParams) this.captionContainer.getLayoutParams()).topMargin;
            }
            return 0;
        }

        public void updateTopMargin() {
            updateTopMargin(getWidth(), getHeight());
        }

        private void updateTopMargin(int i, int i2) {
            int calculateNewContainerMarginTop = calculateNewContainerMarginTop(i, i2);
            if (calculateNewContainerMarginTop >= 0) {
                if (this.dontChangeTopMargin) {
                    this.pendingTopMargin = calculateNewContainerMarginTop;
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this.captionContainer.getLayoutParams()).topMargin = calculateNewContainerMarginTop;
                this.pendingTopMargin = -1;
            }
        }

        public int calculateNewContainerMarginTop(int i, int i2) {
            int dp;
            if (i == 0 || i2 == 0) {
                return -1;
            }
            TextView currentView = this.captionTextViewSwitcher.getCurrentView();
            CharSequence text = currentView.getText();
            int hashCode = text.hashCode();
            Point point = AndroidUtilities.displaySize;
            boolean z = point.x > point.y;
            if (this.textHash == hashCode && this.isLandscape == z && this.prevHeight == i2) {
                return -1;
            }
            this.textHash = hashCode;
            this.isLandscape = z;
            this.prevHeight = i2;
            currentView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
            Layout layout = currentView.getLayout();
            int lineCount = layout.getLineCount();
            if ((z && lineCount <= 2) || (!z && lineCount <= 5)) {
                dp = currentView.getMeasuredHeight();
            } else {
                int min = Math.min(z ? 2 : 5, lineCount);
                loop0: while (min > 1) {
                    int i3 = min - 1;
                    for (int lineStart = layout.getLineStart(i3); lineStart < layout.getLineEnd(i3); lineStart++) {
                        if (!Character.isWhitespace(text.charAt(lineStart))) {
                            break loop0;
                        }
                    }
                    min--;
                }
                i2 -= currentView.getPaint().getFontMetricsInt(null) * min;
                dp = AndroidUtilities.dp(8.0f);
            }
            return i2 - dp;
        }

        public void reset() {
            scrollTo(0, 0);
        }

        public void stopScrolling() {
            Method method = this.abortAnimatedScrollMethod;
            if (method != null) {
                try {
                    method.invoke(this, new Object[0]);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }

        @Override
        public void fling(int i) {
            super.fling(i);
            this.velocitySign = Math.signum(i);
            this.velocityY = 0.0f;
        }

        @Override
        public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
            iArr[1] = 0;
            if (this.nestedScrollStarted) {
                float f = this.overScrollY;
                if ((f > 0.0f && i2 > 0) || (f < 0.0f && i2 < 0)) {
                    float f2 = i2;
                    float f3 = f - f2;
                    if (f > 0.0f) {
                        if (f3 < 0.0f) {
                            this.overScrollY = 0.0f;
                            iArr[1] = (int) (iArr[1] + f2 + f3);
                        } else {
                            this.overScrollY = f3;
                            iArr[1] = iArr[1] + i2;
                        }
                    } else if (f3 > 0.0f) {
                        this.overScrollY = 0.0f;
                        iArr[1] = (int) (iArr[1] + f2 + f3);
                    } else {
                        this.overScrollY = f3;
                        iArr[1] = iArr[1] + i2;
                    }
                    onScrollUpdate();
                    this.captionTextViewSwitcher.setTranslationY(this.overScrollY);
                    return true;
                }
            }
            return false;
        }

        @Override
        public void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
            float f;
            if (i4 != 0) {
                int round = Math.round(i4 * (1.0f - Math.abs((-this.overScrollY) / (this.captionContainer.getTop() - ((isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0) + ActionBar.getCurrentActionBarHeight())))));
                if (round != 0) {
                    if (!this.nestedScrollStarted) {
                        if (!this.springAnimation.isRunning()) {
                            OverScroller overScroller = this.scroller;
                            float currVelocity = overScroller != null ? overScroller.getCurrVelocity() : Float.NaN;
                            if (Float.isNaN(currVelocity)) {
                                f = 0.0f;
                            } else {
                                Point point = AndroidUtilities.displaySize;
                                float min = Math.min(point.x > point.y ? 3000.0f : 5000.0f, currVelocity);
                                round = (int) ((round * min) / currVelocity);
                                f = min * (-this.velocitySign);
                            }
                            if (round != 0) {
                                float f2 = this.overScrollY - round;
                                this.overScrollY = f2;
                                this.captionTextViewSwitcher.setTranslationY(f2);
                            }
                            startSpringAnimationIfNotRunning(f);
                        }
                    } else {
                        float f3 = this.overScrollY - round;
                        this.overScrollY = f3;
                        this.captionTextViewSwitcher.setTranslationY(f3);
                    }
                }
                onScrollUpdate();
            }
        }

        private void startSpringAnimationIfNotRunning(float f) {
            if (this.springAnimation.isRunning()) {
                return;
            }
            this.springAnimation.setStartVelocity(f);
            this.springAnimation.start();
        }

        @Override
        public boolean startNestedScroll(int i, int i2) {
            if (i2 == 0) {
                this.springAnimation.cancel();
                this.nestedScrollStarted = true;
                this.overScrollY = this.captionTextViewSwitcher.getTranslationY();
                onScrollStart();
            }
            return true;
        }

        @Override
        public void computeScroll() {
            OverScroller overScroller;
            super.computeScroll();
            if (!this.nestedScrollStarted && this.overScrollY != 0.0f && (overScroller = this.scroller) != null && overScroller.isFinished()) {
                startSpringAnimationIfNotRunning(0.0f);
            }
            onScrollUpdate();
        }

        @Override
        public void stopNestedScroll(int i) {
            OverScroller overScroller;
            if (this.nestedScrollStarted && i == 0) {
                this.nestedScrollStarted = false;
                if (this.overScrollY != 0.0f && (overScroller = this.scroller) != null && overScroller.isFinished()) {
                    startSpringAnimationIfNotRunning(this.velocityY);
                }
                onScrollEnd();
            }
        }

        @Override
        public void draw(Canvas canvas) {
            int width = getWidth();
            int height = getHeight();
            int scrollY = getScrollY();
            int save = canvas.save();
            int i = height + scrollY;
            canvas.clipRect(0, scrollY, width, i);
            this.paint.setAlpha((int) (this.backgroundAlpha * 127.0f));
            canvas.drawRect(0.0f, this.captionContainer.getTop() + this.captionTextViewSwitcher.getTranslationY(), width, i, this.paint);
            super.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public static PhotoViewer getPipInstance() {
        return PipInstance;
    }

    public static PhotoViewer getInstance() {
        PhotoViewer photoViewer = Instance;
        if (photoViewer == null) {
            synchronized (PhotoViewer.class) {
                photoViewer = Instance;
                if (photoViewer == null) {
                    photoViewer = new PhotoViewer();
                    Instance = photoViewer;
                }
            }
        }
        return photoViewer;
    }

    public boolean isOpenedFullScreenVideo() {
        return this.openedFullScreenVideo;
    }

    public static boolean hasInstance() {
        return Instance != null;
    }

    public PhotoViewer() {
        this.ALLOW_USE_SURFACE = Build.VERSION.SDK_INT >= 30;
        this.maxSelectedPhotos = -1;
        this.allowOrder = true;
        this.miniProgressShowRunnable = new Runnable() {
            @Override
            public final void run() {
                PhotoViewer.this.lambda$new$0();
            }
        };
        this.isActionBarVisible = true;
        this.closePhotoAfterSelect = true;
        this.actionBarItemsVisibility = new HashMap(3);
        this.backgroundDrawable = new BackgroundDrawable(-16777216);
        this.blackPaint = new Paint();
        this.photoProgressViews = new PhotoProgressView[3];
        this.onUserLeaveHintListener = new Runnable() {
            @Override
            public final void run() {
                PhotoViewer.this.onUserLeaveHint();
            }
        };
        this.pressedDrawable = new GradientDrawable[2];
        this.drawPressedDrawable = new boolean[2];
        this.pressedDrawableAlpha = new float[2];
        this.cropTransform = new CropTransform();
        this.leftCropTransform = new CropTransform();
        this.rightCropTransform = new CropTransform();
        this.shiftDp = -8.0f;
        this.bitmapPaint = new Paint(2);
        this.insets = new Rect();
        this.setLoadingRunnable = new Runnable() {
            {
                PhotoViewer.this = this;
            }

            @Override
            public void run() {
                if (PhotoViewer.this.currentMessageObject == null) {
                    return;
                }
                FileLoader.getInstance(PhotoViewer.this.currentMessageObject.currentAccount).setLoadingVideo(PhotoViewer.this.currentMessageObject.getDocument(), true, false);
            }
        };
        this.hideActionBarRunnable = new Runnable() {
            {
                PhotoViewer.this = this;
            }

            @Override
            public void run() {
                if (PhotoViewer.this.videoPlayerControlVisible && PhotoViewer.this.isPlaying && !ApplicationLoader.mainInterfacePaused) {
                    if (PhotoViewer.this.menuItem == null || !PhotoViewer.this.menuItem.isSubMenuShowing()) {
                        if (PhotoViewer.this.captionScrollView == null || PhotoViewer.this.captionScrollView.getScrollY() == 0) {
                            if (PhotoViewer.this.miniProgressView == null || PhotoViewer.this.miniProgressView.getVisibility() != 0) {
                                PhotoViewer photoViewer = PhotoViewer.PipInstance;
                                PhotoViewer photoViewer2 = PhotoViewer.this;
                                if (photoViewer == photoViewer2) {
                                    return;
                                }
                                photoViewer2.toggleActionBar(false, true);
                            }
                        }
                    }
                }
            }
        };
        this.savedVideoPositions = new ArrayMap<>();
        this.videoPlayerControlVisible = true;
        this.videoPlayerCurrentTime = new int[2];
        this.videoPlayerTotalTime = new int[2];
        this.fullscreenButton = new ImageView[3];
        this.pipPosition = new int[2];
        this.pipVideoOverlayAnimateFlag = true;
        this.lastImageId = -1;
        this.prevOrientation = -10;
        this.videoPlayerRewinder = new VideoPlayerRewinder() {
            {
                PhotoViewer.this = this;
            }

            @Override
            protected void onRewindCanceled() {
                PhotoViewer.this.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                PhotoViewer.this.videoForwardDrawable.setShowing(false);
                PipVideoOverlay.onRewindCanceled();
            }

            @Override
            protected void updateRewindProgressUi(long j, float f, boolean z) {
                PhotoViewer.this.videoForwardDrawable.setTime(Math.abs(j));
                if (z) {
                    PhotoViewer.this.videoPlayerSeekbar.setProgress(f);
                    PhotoViewer.this.videoPlayerSeekbarView.invalidate();
                }
                PipVideoOverlay.onUpdateRewindProgressUi(j, f, z);
            }

            @Override
            protected void onRewindStart(boolean z) {
                PhotoViewer.this.videoForwardDrawable.setOneShootAnimation(false);
                PhotoViewer.this.videoForwardDrawable.setLeftSide(!z);
                PhotoViewer.this.videoForwardDrawable.setShowing(true);
                PhotoViewer.this.containerView.invalidate();
                PipVideoOverlay.onRewindStart(z);
            }
        };
        this.FLASH_VIEW_VALUE = new AnimationProperties.FloatProperty<View>("flashViewAlpha") {
            {
                PhotoViewer.this = this;
            }

            @Override
            public void setValue(View view, float f) {
                view.setAlpha(f);
                if (PhotoViewer.this.photoCropView != null) {
                    PhotoViewer.this.photoCropView.setVideoThumbFlashAlpha(f);
                }
            }

            @Override
            public Float get(View view) {
                return Float.valueOf(view.getAlpha());
            }
        };
        this.updateProgressRunnable = new AnonymousClass5();
        this.switchToInlineRunnable = new Runnable() {
            {
                PhotoViewer.this = this;
            }

            @Override
            public void run() {
                if (!PipVideoOverlay.isVisible()) {
                    PhotoViewer.this.switchingInlineMode = false;
                    if (PhotoViewer.this.currentBitmap != null) {
                        PhotoViewer.this.currentBitmap.recycle();
                        PhotoViewer.this.currentBitmap = null;
                    }
                    PhotoViewer.this.changingTextureView = true;
                    TextureViewContainer textureViewContainer = new TextureViewContainer(PhotoViewer.this.parentActivity);
                    try {
                        if (PhotoViewer.this.usedSurfaceView) {
                            Drawable drawable = PhotoViewer.this.textureImageView.getDrawable();
                            if (drawable instanceof BitmapDrawable) {
                                PhotoViewer.this.currentBitmap = ((BitmapDrawable) drawable).getBitmap();
                            } else {
                                PhotoViewer photoViewer = PhotoViewer.this;
                                photoViewer.currentBitmap = Bitmaps.createBitmap(photoViewer.videoSurfaceView.getWidth(), PhotoViewer.this.videoSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                                AndroidUtilities.getBitmapFromSurface(PhotoViewer.this.videoSurfaceView, PhotoViewer.this.currentBitmap);
                            }
                        } else {
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            photoViewer2.currentBitmap = Bitmaps.createBitmap(photoViewer2.videoTextureView.getWidth(), PhotoViewer.this.videoTextureView.getHeight(), Bitmap.Config.ARGB_8888);
                            PhotoViewer.this.videoTextureView.getBitmap(PhotoViewer.this.currentBitmap);
                        }
                    } catch (Throwable th) {
                        if (PhotoViewer.this.currentBitmap != null) {
                            PhotoViewer.this.currentBitmap.recycle();
                            PhotoViewer.this.currentBitmap = null;
                        }
                        FileLog.e(th);
                    }
                    if (PhotoViewer.this.currentBitmap != null) {
                        if (PhotoViewer.this.textureImageView != null) {
                            PhotoViewer.this.textureImageView.setVisibility(0);
                            PhotoViewer.this.textureImageView.setImageBitmap(PhotoViewer.this.currentBitmap);
                        }
                        textureViewContainer.imageReceiver.setImageBitmap(PhotoViewer.this.currentBitmap);
                    }
                    PhotoViewer.this.isInline = true;
                    PhotoViewer.this.changedTextureView = textureViewContainer.textureView;
                    if (PipVideoOverlay.show(false, PhotoViewer.this.parentActivity, textureViewContainer, PhotoViewer.this.videoWidth, PhotoViewer.this.videoHeight, PhotoViewer.this.pipVideoOverlayAnimateFlag)) {
                        PipVideoOverlay.setPhotoViewer(PhotoViewer.this);
                    }
                    PhotoViewer.this.pipVideoOverlayAnimateFlag = true;
                    if (PhotoViewer.this.usedSurfaceView) {
                        if (PhotoViewer.this.aspectRatioFrameLayout != null) {
                            PhotoViewer.this.aspectRatioFrameLayout.removeView(PhotoViewer.this.videoTextureView);
                            PhotoViewer.this.aspectRatioFrameLayout.removeView(PhotoViewer.this.videoSurfaceView);
                        }
                        PhotoViewer.this.videoPlayer.setSurfaceView(null);
                        PhotoViewer.this.videoPlayer.setTextureView(null);
                        PhotoViewer.this.videoPlayer.play();
                        PhotoViewer.this.videoPlayer.setTextureView(PhotoViewer.this.changedTextureView);
                        PhotoViewer.this.checkChangedTextureView(true);
                        PhotoViewer.this.changedTextureView.setVisibility(0);
                        return;
                    }
                    PhotoViewer.this.changedTextureView.setVisibility(4);
                    if (PhotoViewer.this.aspectRatioFrameLayout != null) {
                        PhotoViewer.this.aspectRatioFrameLayout.removeView(PhotoViewer.this.videoTextureView);
                        PhotoViewer.this.aspectRatioFrameLayout.removeView(PhotoViewer.this.videoSurfaceView);
                        return;
                    }
                    return;
                }
                PipVideoOverlay.dismiss();
                AndroidUtilities.runOnUIThread(this, 250L);
            }
        };
        this.surfaceTextureListener = new TextureView.SurfaceTextureListener() {
            @Override
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            @Override
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            {
                PhotoViewer.this = this;
            }

            @Override
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                if (PhotoViewer.this.videoTextureView != null && PhotoViewer.this.changingTextureView) {
                    if (PhotoViewer.this.switchingInlineMode) {
                        PhotoViewer.this.waitingForFirstTextureUpload = 2;
                    }
                    PhotoViewer.this.videoTextureView.setSurfaceTexture(surfaceTexture);
                    PhotoViewer.this.videoTextureView.setVisibility(0);
                    PhotoViewer.this.changingTextureView = false;
                    PhotoViewer.this.containerView.invalidate();
                    return false;
                }
                return true;
            }

            @Override
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (PhotoViewer.this.waitingForFirstTextureUpload == 1) {
                    PhotoViewer.this.checkChangedTextureView(true);
                }
            }
        };
        this.animationValues = (float[][]) Array.newInstance(float.class, 2, 13);
        this.updateContainerFlagsRunnable = new Runnable() {
            @Override
            public final void run() {
                PhotoViewer.this.lambda$new$5();
            }
        };
        this.leftImage = new ImageReceiver();
        this.centerImage = new ImageReceiver() {
            {
                PhotoViewer.this = this;
            }

            @Override
            public boolean setImageBitmapByKey(Drawable drawable, String str, int i, boolean z, int i2) {
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i, z, i2);
                PhotoViewer.this.prepareSegmentImage();
                return imageBitmapByKey;
            }
        };
        this.rightImage = new ImageReceiver();
        this.leftBlur = new BlurringShader.ThumbBlurer(1, new PhotoViewer$$ExternalSyntheticLambda70(this));
        this.centerBlur = new BlurringShader.ThumbBlurer(1, new PhotoViewer$$ExternalSyntheticLambda70(this));
        this.rightBlur = new BlurringShader.ThumbBlurer(1, new PhotoViewer$$ExternalSyntheticLambda70(this));
        this.centerImageTransformLocked = false;
        this.centerImageTransform = new Matrix();
        this.videoFrameBitmapPaint = new Paint();
        this.videoFrameBitmap = null;
        this.editState = new EditState();
        this.currentFileNames = new String[3];
        this.endReached = new boolean[]{false, true};
        this.scale = 1.0f;
        this.rotate = 0.0f;
        this.mirror = 0.0f;
        this.switchingToMode = -1;
        this.interpolator = new DecelerateInterpolator(1.5f);
        this.pinchStartScale = 1.0f;
        this.pinchStartRotate = 0.0f;
        this.canZoom = true;
        this.canDragDown = true;
        this.shownControlsByEnd = false;
        this.actionBarWasShownBeforeByEnd = false;
        this.imagesArrTemp = new ArrayList<>();
        this.imagesByIdsTemp = new SparseArray[]{new SparseArray<>(), new SparseArray<>()};
        this.imagesArr = new ArrayList<>();
        this.imagesByIds = new SparseArray[]{new SparseArray<>(), new SparseArray<>()};
        this.imagesArrLocations = new ArrayList<>();
        this.imagesArrLocationsVideo = new ArrayList<>();
        this.imagesArrLocationsSizes = new ArrayList<>();
        this.imagesArrMessages = new ArrayList<>();
        this.secureDocuments = new ArrayList<>();
        this.avatarsArr = new ArrayList<>();
        this.imagesArrLocals = new ArrayList<>();
        this.currentAvatarLocation = null;
        this.savedState = null;
        this.hitRect = new Rect();
        this.transitionNotificationLocker = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaDidLoad, NotificationCenter.dialogPhotosUpdate});
        this.longPressRunnable = new Runnable() {
            @Override
            public final void run() {
                PhotoViewer.this.onLongPress();
            }
        };
        this.tempInt = new int[2];
        this.captureFrameAtTime = -1L;
        this.captureFrameReadyAtTime = -1L;
        this.needCaptureFrameReadyAtTime = -1L;
        this.compressionsCount = -1;
        this.blurAlpha = new AnimatedFloat(new PhotoViewer$$ExternalSyntheticLambda70(this), 180L, CubicBezierInterpolator.EASE_OUT);
        this.blackPaint.setColor(-16777216);
        this.videoFrameBitmapPaint.setColor(-1);
        this.centerImage.setFileLoadingPriority(3);
    }

    @Override
    public void didReceivedNotification(int r31, int r32, java.lang.Object... r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public void showDownloadAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.parentActivity, this.resourcesProvider);
        builder.setTitle(LocaleController.getString("AppName", R.string.AppName));
        builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
        MessageObject messageObject = this.currentMessageObject;
        boolean z = false;
        if (messageObject != null && messageObject.isVideo() && FileLoader.getInstance(this.currentMessageObject.currentAccount).isLoadingFile(this.currentFileNames[0])) {
            z = true;
        }
        if (z) {
            builder.setMessage(LocaleController.getString("PleaseStreamDownload", R.string.PleaseStreamDownload));
        } else {
            builder.setMessage(LocaleController.getString("PleaseDownload", R.string.PleaseDownload));
        }
        showAlertDialog(builder);
    }

    public void onSharePressed() {
        boolean z;
        if (this.parentActivity == null || !this.allowShare) {
            return;
        }
        try {
            MessageObject messageObject = this.currentMessageObject;
            boolean z2 = false;
            File file = null;
            if (messageObject != null) {
                z2 = messageObject.isVideo();
                if (!TextUtils.isEmpty(this.currentMessageObject.messageOwner.attachPath)) {
                    File file2 = new File(this.currentMessageObject.messageOwner.attachPath);
                    if (file2.exists()) {
                        file = file2;
                    }
                }
                if (file == null) {
                    file = FileLoader.getInstance(this.currentAccount).getPathToMessage(this.currentMessageObject.messageOwner);
                }
            } else if (this.currentFileLocationVideo != null) {
                FileLoader fileLoader = FileLoader.getInstance(this.currentAccount);
                TLRPC$FileLocation fileLocation = getFileLocation(this.currentFileLocationVideo);
                String fileLocationExt = getFileLocationExt(this.currentFileLocationVideo);
                if (this.avatarsDialogId == 0 && !this.isEvent) {
                    z = false;
                    file = fileLoader.getPathToAttach(fileLocation, fileLocationExt, z);
                }
                z = true;
                file = fileLoader.getPathToAttach(fileLocation, fileLocationExt, z);
            } else {
                PageBlocksAdapter pageBlocksAdapter = this.pageBlocksAdapter;
                if (pageBlocksAdapter != null) {
                    file = pageBlocksAdapter.getFile(this.currentIndex);
                }
            }
            if (file != null && !file.exists()) {
                file = new File(FileLoader.getDirectory(4), file.getName());
            }
            if (file != null && file.exists()) {
                Intent intent = new Intent("android.intent.action.SEND");
                if (z2) {
                    intent.setType("video/mp4");
                } else {
                    MessageObject messageObject2 = this.currentMessageObject;
                    if (messageObject2 != null) {
                        intent.setType(messageObject2.getMimeType());
                    } else {
                        intent.setType("image/jpeg");
                    }
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    try {
                        Activity activity = this.parentActivity;
                        intent.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(activity, ApplicationLoader.getApplicationId() + ".provider", file));
                        intent.setFlags(1);
                    } catch (Exception unused) {
                        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                }
                this.parentActivity.startActivityForResult(Intent.createChooser(intent, LocaleController.getString("ShareFile", R.string.ShareFile)), 500);
                return;
            }
            showDownloadAlert();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void setScaleToFill() {
        float bitmapWidth = this.centerImage.getBitmapWidth();
        float bitmapHeight = this.centerImage.getBitmapHeight();
        if (bitmapWidth == 0.0f || bitmapHeight == 0.0f) {
            return;
        }
        float containerViewWidth = getContainerViewWidth();
        float containerViewHeight = getContainerViewHeight();
        float min = Math.min(containerViewHeight / bitmapHeight, containerViewWidth / bitmapWidth);
        float max = Math.max(containerViewWidth / ((int) (bitmapWidth * min)), containerViewHeight / ((int) (bitmapHeight * min)));
        this.scale = max;
        updateMinMax(max);
    }

    public void setParentAlert(ChatAttachAlert chatAttachAlert) {
        this.parentAlert = chatAttachAlert;
    }

    public void setParentActivity(Activity activity) {
        setParentActivity(activity, null, null);
    }

    public void setParentActivity(Activity activity, Theme.ResourcesProvider resourcesProvider) {
        setParentActivity(activity, null, resourcesProvider);
    }

    public void setParentActivity(BaseFragment baseFragment) {
        setParentActivity(baseFragment, (Theme.ResourcesProvider) null);
    }

    public void setParentActivity(BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        setParentActivity(null, baseFragment, resourcesProvider);
    }

    public void setParentActivity(Activity activity, BaseFragment baseFragment, final Theme.ResourcesProvider resourcesProvider) {
        final Activity parentActivity = activity != null ? activity : baseFragment.getParentActivity();
        Theme.createChatResources(parentActivity, false);
        this.resourcesProvider = resourcesProvider;
        this.parentFragment = baseFragment;
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.centerImage.setCurrentAccount(i);
        this.leftImage.setCurrentAccount(this.currentAccount);
        this.rightImage.setCurrentAccount(this.currentAccount);
        CaptionPhotoViewer captionPhotoViewer = this.captionEdit;
        if (captionPhotoViewer != null) {
            captionPhotoViewer.setAccount(this.currentAccount);
        }
        StickerMakerView stickerMakerView = this.stickerMakerView;
        if (stickerMakerView != null) {
            stickerMakerView.setCurrentAccount(this.currentAccount);
        }
        if (this.parentActivity == parentActivity || parentActivity == null) {
            updateColors();
            return;
        }
        this.inBubbleMode = parentActivity instanceof BubbleActivity;
        this.parentActivity = parentActivity;
        this.activityContext = new ContextThemeWrapper(this.parentActivity, R.style.Theme_TMessages);
        this.touchSlop = ViewConfiguration.get(this.parentActivity).getScaledTouchSlop();
        if (progressDrawables == null) {
            progressDrawables = new Drawable[]{ContextCompat.getDrawable(this.parentActivity, R.drawable.circle_big), ContextCompat.getDrawable(this.parentActivity, R.drawable.cancel_big), ContextCompat.getDrawable(this.parentActivity, R.drawable.load_big)};
        }
        this.scroller = new Scroller(parentActivity);
        AnonymousClass13 anonymousClass13 = new AnonymousClass13(parentActivity);
        this.windowView = anonymousClass13;
        anonymousClass13.setBackgroundDrawable(this.backgroundDrawable);
        this.windowView.setFocusable(false);
        ClippingImageView clippingImageView = new ClippingImageView(parentActivity);
        this.animatingImageView = clippingImageView;
        clippingImageView.setAnimationValues(this.animationValues);
        this.windowView.addView(this.animatingImageView, LayoutHelper.createFrame(40, 40.0f));
        FrameLayoutDrawer frameLayoutDrawer = new FrameLayoutDrawer(parentActivity, parentActivity) {
            {
                PhotoViewer.this = this;
            }

            @Override
            public int getBottomPadding() {
                return PhotoViewer.this.pickerView.getHeight();
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                PhotoViewer.this.textSelectionHelper.getOverlayView(getContext()).checkCancelAction(motionEvent);
                if (PhotoViewer.this.textSelectionHelper.isInSelectionMode()) {
                    PhotoViewer.this.textSelectionHelper.getOverlayView(getContext()).onTouchEvent(motionEvent);
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if (view == PhotoViewer.this.textSelectionHelper.getOverlayView(PhotoViewer.this.windowView.getContext()) || view == PhotoViewer.this.stickerMakerBackgroundView) {
                    return false;
                }
                return super.drawChild(canvas, view, j);
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                PhotoViewer.this.textSelectionHelper.getOverlayView(PhotoViewer.this.windowView.getContext()).draw(canvas);
            }

            @Override
            protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                if (PhotoViewer.this.btnLayout != null && PhotoViewer.this.undoBtn != null) {
                    int dp = (i4 - i2) - AndroidUtilities.dp(20.0f);
                    PhotoViewer.this.undoBtn.setTranslationY(((-dp) / 2.0f) - AndroidUtilities.dp(47.0f));
                    float f = dp / 2.0f;
                    PhotoViewer.this.btnLayout.setTranslationY(AndroidUtilities.dp(47.0f) + f);
                    PhotoViewer.this.cutOutBtn.setTranslationY(AndroidUtilities.dp(47.0f) + f);
                    PhotoViewer.this.outlineBtn.setTranslationY(f + AndroidUtilities.dp(95.0f));
                }
                super.onLayout(z, i2, i3, i4, i5);
            }
        };
        this.containerView = frameLayoutDrawer;
        frameLayoutDrawer.setFocusable(false);
        this.containerView.setClipChildren(true);
        this.containerView.setClipToPadding(true);
        this.windowView.setClipChildren(false);
        this.windowView.setClipToPadding(false);
        BlurringShader.BlurManager blurManager = new BlurringShader.BlurManager(this.containerView);
        this.blurManager = blurManager;
        blurManager.padding = 1;
        this.shadowBlurer = new BlurringShader.StoryBlurDrawer(blurManager, this.containerView, 6);
        this.windowView.addView(this.containerView, LayoutHelper.createFrame(-1, -1, 51));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            this.containerView.setFitsSystemWindows(true);
            this.containerView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                @Override
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    WindowInsets lambda$setParentActivity$6;
                    lambda$setParentActivity$6 = PhotoViewer.this.lambda$setParentActivity$6(view, windowInsets);
                    return lambda$setParentActivity$6;
                }
            });
            this.containerView.setSystemUiVisibility(1792);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.windowLayoutParams = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        if (i2 >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        if (i2 >= 21) {
            layoutParams.flags = -2147286784;
        } else {
            layoutParams.flags = 131072;
        }
        PaintingOverlay paintingOverlay = new PaintingOverlay(this.parentActivity);
        this.paintingOverlay = paintingOverlay;
        this.containerView.addView(paintingOverlay, LayoutHelper.createFrame(-2, -2.0f));
        PaintingOverlay paintingOverlay2 = new PaintingOverlay(this.parentActivity);
        this.leftPaintingOverlay = paintingOverlay2;
        this.containerView.addView(paintingOverlay2, LayoutHelper.createFrame(-2, -2.0f));
        PaintingOverlay paintingOverlay3 = new PaintingOverlay(this.parentActivity);
        this.rightPaintingOverlay = paintingOverlay3;
        this.containerView.addView(paintingOverlay3, LayoutHelper.createFrame(-2, -2.0f));
        ActionBar actionBar = new ActionBar(parentActivity) {
            {
                PhotoViewer.this = this;
            }

            @Override
            public void setAlpha(float f) {
                super.setAlpha(f);
                PhotoViewer.this.containerView.invalidate();
            }
        };
        this.actionBar = actionBar;
        actionBar.setOverlayTitleAnimation(true);
        this.actionBar.setTitleColor(-1);
        this.actionBar.setSubtitleColor(-1);
        this.actionBar.setBackgroundColor(2130706432);
        this.actionBar.setOccupyStatusBar(isStatusBarVisible());
        this.actionBar.setItemsBackgroundColor(1090519039, false);
        this.actionBar.setItemsColor(-1, false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        PhotoViewerActionBarContainer photoViewerActionBarContainer = new PhotoViewerActionBarContainer(parentActivity);
        this.actionBarContainer = photoViewerActionBarContainer;
        this.actionBar.addView(photoViewerActionBarContainer, LayoutHelper.createFrame(-1, -1, 119));
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f));
        PhotoCountView photoCountView = new PhotoCountView(parentActivity);
        this.countView = photoCountView;
        this.containerView.addView(photoCountView, LayoutHelper.createFrame(-1, -2, 55));
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass16(resourcesProvider));
        ActionBarMenu createMenu = this.actionBar.createMenu();
        this.menu = createMenu;
        createMenu.setOnLayoutListener(new Runnable() {
            @Override
            public final void run() {
                PhotoViewer.this.updateActionBarTitlePadding();
            }
        });
        ActionBarMenuItem addItem = this.menu.addItem(13, R.drawable.msg_mask);
        this.masksItem = addItem;
        addItem.setContentDescription(LocaleController.getString("Masks", R.string.Masks));
        ActionBarMenuItem addItem2 = this.menu.addItem(5, R.drawable.ic_goinline);
        this.pipItem = addItem2;
        addItem2.setContentDescription(LocaleController.getString("AccDescrPipMode", R.string.AccDescrPipMode));
        ActionBarMenuItem addItem3 = this.menu.addItem(20, R.drawable.msg_header_draw);
        this.editItem = addItem3;
        addItem3.setContentDescription(LocaleController.getString("AccDescrPhotoEditor", R.string.AccDescrPhotoEditor));
        ActionBarMenuItem addItem4 = this.menu.addItem(3, R.drawable.msg_header_share);
        this.sendItem = addItem4;
        addItem4.setContentDescription(LocaleController.getString("Forward", R.string.Forward));
        ActionBarMenu actionBarMenu = this.menu;
        OptionsSpeedIconDrawable optionsSpeedIconDrawable = new OptionsSpeedIconDrawable();
        this.menuItemIcon = optionsSpeedIconDrawable;
        ActionBarMenuItem addItem5 = actionBarMenu.addItem(0, optionsSpeedIconDrawable);
        this.menuItem = addItem5;
        addItem5.setOnMenuDismiss(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                PhotoViewer.this.lambda$setParentActivity$7((Boolean) obj);
            }
        });
        this.menuItem.getPopupLayout().swipeBackGravityRight = true;
        this.chooseSpeedLayout = new ChooseSpeedLayout(this.activityContext, this.menuItem.getPopupLayout().getSwipeBack(), new ChooseSpeedLayout.Callback() {
            {
                PhotoViewer.this = this;
            }

            @Override
            public void onSpeedSelected(float f, boolean z, boolean z2) {
                if (f != PhotoViewer.this.currentVideoSpeed) {
                    PhotoViewer.this.currentVideoSpeed = f;
                    if (PhotoViewer.this.currentMessageObject != null) {
                        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("playback_speed", 0);
                        if (Math.abs(PhotoViewer.this.currentVideoSpeed - 1.0f) < 0.001f) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.remove("speed" + PhotoViewer.this.currentMessageObject.getDialogId() + "_" + PhotoViewer.this.currentMessageObject.getId()).commit();
                        } else {
                            SharedPreferences.Editor edit2 = sharedPreferences.edit();
                            edit2.putFloat("speed" + PhotoViewer.this.currentMessageObject.getDialogId() + "_" + PhotoViewer.this.currentMessageObject.getId(), PhotoViewer.this.currentVideoSpeed).commit();
                        }
                    }
                    if (PhotoViewer.this.videoPlayer != null) {
                        PhotoViewer.this.videoPlayer.setPlaybackSpeed(PhotoViewer.this.currentVideoSpeed);
                    }
                    if (PhotoViewer.this.photoViewerWebView != null) {
                        PhotoViewer.this.photoViewerWebView.setPlaybackSpeed(PhotoViewer.this.currentVideoSpeed);
                    }
                }
                PhotoViewer.this.setMenuItemIcon(true, z);
                if (z2) {
                    PhotoViewer.this.menuItem.toggleSubMenu();
                }
            }
        });
        this.speedItem = this.menuItem.addSwipeBackItem(R.drawable.msg_speed, null, LocaleController.getString("Speed", R.string.Speed), this.chooseSpeedLayout.speedSwipeBackLayout);
        this.menuItem.getPopupLayout().setSwipeBackForegroundColor(-14540254);
        this.speedItem.setSubtext(LocaleController.getString("SpeedNormal", R.string.SpeedNormal));
        this.speedItem.setColors(-328966, -328966);
        ActionBarPopupWindow.GapView addColoredGap = this.menuItem.addColoredGap();
        this.speedGap = addColoredGap;
        addColoredGap.setColor(-15198184);
        this.menuItem.getPopupLayout().setFitItems(true);
        this.menuItem.addSubItem(11, R.drawable.msg_openin, LocaleController.getString("OpenInExternalApp", R.string.OpenInExternalApp)).setColors(-328966, -328966);
        this.menuItem.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        ActionBarMenuSubItem addSubItem = this.menuItem.addSubItem(2, R.drawable.msg_media, LocaleController.getString(R.string.ShowAllMedia));
        this.allMediaItem = addSubItem;
        addSubItem.setColors(-328966, -328966);
        this.menuItem.addSubItem(14, R.drawable.msg_gif, LocaleController.getString("SaveToGIFs", R.string.SaveToGIFs)).setColors(-328966, -328966);
        this.menuItem.addSubItem(4, R.drawable.msg_message, LocaleController.getString("ShowInChat", R.string.ShowInChat)).setColors(-328966, -328966);
        this.menuItem.addSubItem(15, R.drawable.msg_sticker, LocaleController.getString("ShowStickers", R.string.ShowStickers)).setColors(-328966, -328966);
        this.menuItem.addSubItem(10, R.drawable.msg_shareout, LocaleController.getString("ShareFile", R.string.ShareFile)).setColors(-328966, -328966);
        this.menuItem.addSubItem(1, R.drawable.msg_gallery, LocaleController.getString("SaveToGallery", R.string.SaveToGallery)).setColors(-328966, -328966);
        this.menuItem.addSubItem(16, R.drawable.msg_openprofile, LocaleController.getString("SetAsMain", R.string.SetAsMain)).setColors(-328966, -328966);
        ActionBarMenuItem actionBarMenuItem = this.menuItem;
        int i3 = R.drawable.msg_translate;
        actionBarMenuItem.addSubItem(21, i3, LocaleController.getString(R.string.TranslateMessage)).setColors(-328966, -328966);
        this.menuItem.addSubItem(22, i3, LocaleController.getString(R.string.HideTranslation)).setColors(-328966, -328966);
        this.menuItem.addSubItem(6, R.drawable.msg_delete, LocaleController.getString("Delete", R.string.Delete)).setColors(-328966, -328966);
        this.menuItem.addSubItem(7, R.drawable.msg_cancel, LocaleController.getString("StopDownload", R.string.StopDownload)).setColors(-328966, -328966);
        this.menuItem.redrawPopup(-115203550);
        this.menuItem.hideSubItem(21);
        this.menuItem.hideSubItem(22);
        setMenuItemIcon(false, true);
        this.menuItem.setPopupItemsSelectorColor(268435455);
        this.menuItem.setSubMenuDelegate(new ActionBarMenuItem.ActionBarSubMenuItemDelegate() {
            {
                PhotoViewer.this = this;
            }

            @Override
            public void onShowSubMenu() {
                if (PhotoViewer.this.videoPlayerControlVisible && PhotoViewer.this.isPlaying) {
                    AndroidUtilities.cancelRunOnUIThread(PhotoViewer.this.hideActionBarRunnable);
                }
            }

            @Override
            public void onHideSubMenu() {
                if (PhotoViewer.this.videoPlayerControlVisible && PhotoViewer.this.isPlaying) {
                    PhotoViewer.this.scheduleActionBarHide();
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(this, this.activityContext) {
            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
            }
        };
        this.bottomLayout = frameLayout;
        frameLayout.setBackgroundColor(2130706432);
        this.containerView.addView(this.bottomLayout, LayoutHelper.createFrame(-1, 48, 83));
        View view = new View(this.activityContext);
        this.navigationBar = view;
        view.setBackgroundColor(this.sendPhotoType == 11 ? -16777216 : 2130706432);
        this.windowView.addView(this.navigationBar, LayoutHelper.createFrame(-1.0f, this.navigationBarHeight / AndroidUtilities.density, 87));
        this.pressedDrawable[0] = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{838860800, 0});
        this.pressedDrawable[0].setShape(0);
        this.pressedDrawable[1] = new GradientDrawable(GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
        this.pressedDrawable[1].setShape(0);
        GroupedPhotosListView groupedPhotosListView = new GroupedPhotosListView(this.activityContext, AndroidUtilities.dp(10.0f));
        this.groupedPhotosListView = groupedPhotosListView;
        this.containerView.addView(groupedPhotosListView, LayoutHelper.createFrame(-1, 68, 83));
        this.groupedPhotosListView.setDelegate(new GroupedPhotosListView.GroupedPhotosListViewDelegate() {
            {
                PhotoViewer.this = this;
            }

            @Override
            public int getCurrentIndex() {
                return PhotoViewer.this.currentIndex;
            }

            @Override
            public int getCurrentAccount() {
                return PhotoViewer.this.currentAccount;
            }

            @Override
            public long getAvatarsDialogId() {
                return PhotoViewer.this.avatarsDialogId;
            }

            @Override
            public int getSlideshowMessageId() {
                return PhotoViewer.this.slideshowMessageId;
            }

            @Override
            public ArrayList<ImageLocation> getImagesArrLocations() {
                return PhotoViewer.this.imagesArrLocations;
            }

            @Override
            public ArrayList<MessageObject> getImagesArr() {
                return PhotoViewer.this.imagesArr;
            }

            @Override
            public List<TLRPC$PageBlock> getPageBlockArr() {
                if (PhotoViewer.this.pageBlocksAdapter != null) {
                    return PhotoViewer.this.pageBlocksAdapter.getAll();
                }
                return null;
            }

            @Override
            public Object getParentObject() {
                if (PhotoViewer.this.pageBlocksAdapter != null) {
                    return PhotoViewer.this.pageBlocksAdapter.getParentObject();
                }
                return null;
            }

            @Override
            public void setCurrentIndex(int i4) {
                PhotoViewer.this.currentIndex = -1;
                if (PhotoViewer.this.currentThumb != null) {
                    PhotoViewer.this.currentThumb.release();
                    PhotoViewer.this.currentThumb = null;
                }
                PhotoViewer.this.dontAutoPlay = true;
                PhotoViewer.this.setImageIndex(i4);
                PhotoViewer.this.dontAutoPlay = false;
            }

            @Override
            public void onShowAnimationStart() {
                PhotoViewer.this.containerView.requestLayout();
            }

            @Override
            public void onStopScrolling() {
                PhotoViewer photoViewer = PhotoViewer.this;
                if (photoViewer.shouldMessageObjectAutoPlayed(photoViewer.currentMessageObject)) {
                    PhotoViewer.this.playerAutoStarted = true;
                    PhotoViewer.this.onActionClick(true);
                    PhotoViewer.this.checkProgress(0, false, true);
                }
            }
        });
        for (int i4 = 0; i4 < 3; i4++) {
            this.fullscreenButton[i4] = new ImageView(this.parentActivity);
            this.fullscreenButton[i4].setImageResource(R.drawable.msg_maxvideo);
            this.fullscreenButton[i4].setContentDescription(LocaleController.getString("AccSwitchToFullscreen", R.string.AccSwitchToFullscreen));
            this.fullscreenButton[i4].setScaleType(ImageView.ScaleType.CENTER);
            this.fullscreenButton[i4].setBackground(Theme.createSelectorDrawable(1090519039));
            this.fullscreenButton[i4].setVisibility(4);
            this.fullscreenButton[i4].setAlpha(1.0f);
            this.containerView.addView(this.fullscreenButton[i4], LayoutHelper.createFrame(48, 48.0f));
            this.fullscreenButton[i4].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    PhotoViewer.this.lambda$setParentActivity$8(view2);
                }
            });
        }
        this.textSelectionHelper = new TextSelectionHelper.SimpleTextSelectionHelper(this, null, new DarkThemeResourceProvider()) {
            @Override
            public int getParentBottomPadding() {
                return 0;
            }
        };
        CaptionTextViewSwitcher captionTextViewSwitcher = new CaptionTextViewSwitcher(this.containerView.getContext());
        this.captionTextViewSwitcher = captionTextViewSwitcher;
        captionTextViewSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public final View makeView() {
                View lambda$setParentActivity$9;
                lambda$setParentActivity$9 = PhotoViewer.this.lambda$setParentActivity$9();
                return lambda$setParentActivity$9;
            }
        });
        this.captionTextViewSwitcher.setVisibility(4);
        setCaptionHwLayerEnabled(true);
        for (int i5 = 0; i5 < 3; i5++) {
            this.photoProgressViews[i5] = new PhotoProgressView(this.containerView) {
                {
                    PhotoViewer.this = this;
                }

                @Override
                protected void onBackgroundStateUpdated(int i6) {
                    if (this == PhotoViewer.this.photoProgressViews[0]) {
                        PhotoViewer.this.updateAccessibilityOverlayVisibility();
                    }
                }

                @Override
                protected void onVisibilityChanged(boolean z) {
                    if (this == PhotoViewer.this.photoProgressViews[0]) {
                        PhotoViewer.this.updateAccessibilityOverlayVisibility();
                    }
                }
            };
            this.photoProgressViews[i5].setBackgroundState(0, false, true);
        }
        RadialProgressView radialProgressView = new RadialProgressView(this.activityContext, resourcesProvider) {
            {
                PhotoViewer.this = this;
            }

            @Override
            public void setAlpha(float f) {
                super.setAlpha(f);
                if (PhotoViewer.this.containerView != null) {
                    PhotoViewer.this.containerView.invalidate();
                }
            }

            @Override
            public void invalidate() {
                super.invalidate();
                if (PhotoViewer.this.containerView != null) {
                    PhotoViewer.this.containerView.invalidate();
                }
            }
        };
        this.miniProgressView = radialProgressView;
        radialProgressView.setUseSelfAlpha(true);
        this.miniProgressView.setProgressColor(-1);
        this.miniProgressView.setSize(AndroidUtilities.dp(54.0f));
        RadialProgressView radialProgressView2 = this.miniProgressView;
        int i6 = R.drawable.circle_big;
        radialProgressView2.setBackgroundResource(i6);
        this.miniProgressView.setVisibility(4);
        this.miniProgressView.setAlpha(0.0f);
        this.containerView.addView(this.miniProgressView, LayoutHelper.createFrame(64, 64, 17));
        createVideoControlsInterface();
        RadialProgressView radialProgressView3 = new RadialProgressView(this.parentActivity, resourcesProvider);
        this.progressView = radialProgressView3;
        radialProgressView3.setProgressColor(-1);
        this.progressView.setBackgroundResource(i6);
        this.progressView.setVisibility(4);
        this.containerView.addView(this.progressView, LayoutHelper.createFrame(54, 54, 17));
        PickerBottomLayoutViewer pickerBottomLayoutViewer = new PickerBottomLayoutViewer(this.parentActivity);
        this.qualityPicker = pickerBottomLayoutViewer;
        pickerBottomLayoutViewer.setBackgroundColor(2130706432);
        this.qualityPicker.updateSelectedCount(0, false);
        this.qualityPicker.setTranslationY(AndroidUtilities.dp(120.0f));
        this.qualityPicker.doneButton.setText(LocaleController.getString("Done", R.string.Done).toUpperCase());
        TextView textView = this.qualityPicker.doneButton;
        int i7 = Theme.key_chat_editMediaButton;
        textView.setTextColor(getThemedColor(i7));
        this.containerView.addView(this.qualityPicker, LayoutHelper.createFrame(-1, 48, 83));
        this.qualityPicker.cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$10(view2);
            }
        });
        this.qualityPicker.doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$11(view2);
            }
        });
        VideoForwardDrawable videoForwardDrawable = new VideoForwardDrawable(false);
        this.videoForwardDrawable = videoForwardDrawable;
        videoForwardDrawable.setDelegate(new VideoForwardDrawable.VideoForwardDrawableDelegate() {
            @Override
            public void onAnimationEnd() {
            }

            {
                PhotoViewer.this = this;
            }

            @Override
            public void invalidate() {
                PhotoViewer.this.containerView.invalidate();
            }
        });
        QualityChooseView qualityChooseView = new QualityChooseView(this.parentActivity);
        this.qualityChooseView = qualityChooseView;
        qualityChooseView.setTranslationY(AndroidUtilities.dp(120.0f));
        this.qualityChooseView.setVisibility(4);
        this.qualityChooseView.setBackgroundColor(2130706432);
        this.containerView.addView(this.qualityChooseView, LayoutHelper.createFrame(-1, 70.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        new Paint().setColor(2130706432);
        FrameLayout frameLayout2 = new FrameLayout(this.activityContext) {
            private final Paint bgPaint = new Paint(3);
            private final LinearGradient bgGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            private final Matrix bgMatrix = new Matrix();

            {
                PhotoViewer.this = this;
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (!PhotoViewer.this.fancyShadows) {
                    int measuredHeight = PhotoViewer.this.doneButtonFullWidth.getVisibility() == 0 ? getMeasuredHeight() - AndroidUtilities.dp(48.0f) : 0;
                    if (PhotoViewer.this.sendPhotoType == 0 || PhotoViewer.this.sendPhotoType == 2 || PhotoViewer.this.sendPhotoType == -1) {
                        this.bgMatrix.reset();
                        this.bgMatrix.postTranslate(0.0f, measuredHeight);
                        this.bgMatrix.postScale(1.0f, Math.min(AndroidUtilities.dp(40.0f), getMeasuredHeight() - measuredHeight) / 16.0f);
                        this.bgGradient.setLocalMatrix(this.bgMatrix);
                        this.bgPaint.setShader(this.bgGradient);
                    } else {
                        this.bgPaint.setShader(null);
                        this.bgPaint.setColor(2130706432);
                    }
                    canvas.drawRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight(), this.bgPaint);
                }
                super.dispatchDraw(canvas);
            }

            @Override
            protected void onMeasure(int i8, int i9) {
                ((FrameLayout.LayoutParams) PhotoViewer.this.itemsLayout.getLayoutParams()).rightMargin = PhotoViewer.this.pickerViewSendButton.getVisibility() == 0 ? AndroidUtilities.dp(70.0f) : 0;
                super.onMeasure(i8, i9);
            }

            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                if (PhotoViewer.this.videoTimelineViewContainer != null && PhotoViewer.this.videoTimelineViewContainer.getVisibility() != 8) {
                    PhotoViewer.this.videoTimelineViewContainer.setTranslationY(f - Math.max(0, PhotoViewer.this.captionEdit.getEditTextHeight() - AndroidUtilities.dp(46.0f)));
                }
                if (PhotoViewer.this.captionEditContainer != null) {
                    PhotoViewer.this.captionEditContainer.setTranslationY(f);
                }
                if (PhotoViewer.this.videoAvatarTooltip == null || PhotoViewer.this.videoAvatarTooltip.getVisibility() == 8) {
                    return;
                }
                PhotoViewer.this.videoAvatarTooltip.setTranslationY(f);
            }

            @Override
            public void setAlpha(float f) {
                super.setAlpha(f);
                if (PhotoViewer.this.videoTimelineViewContainer != null && PhotoViewer.this.videoTimelineViewContainer.getVisibility() != 8) {
                    PhotoViewer.this.videoTimelineViewContainer.setAlpha(f);
                }
                if (PhotoViewer.this.captionEdit == null || PhotoViewer.this.captionEdit.getVisibility() == 8) {
                    return;
                }
                PhotoViewer.this.captionEdit.setAlpha(f);
            }

            @Override
            public void setVisibility(int i8) {
                super.setVisibility(i8);
                if (PhotoViewer.this.videoTimelineViewContainer == null || PhotoViewer.this.videoTimelineViewContainer.getVisibility() == 8) {
                    return;
                }
                PhotoViewer.this.videoTimelineViewContainer.setVisibility(i8 == 0 ? 0 : 4);
            }

            @Override
            protected void onLayout(boolean z, int i8, int i9, int i10, int i11) {
                super.onLayout(z, i8, i9, i10, i11);
                if (PhotoViewer.this.itemsLayout.getVisibility() != 8) {
                    int dp = (((i10 - i8) - (PhotoViewer.this.pickerViewSendButton.getVisibility() == 0 ? AndroidUtilities.dp(70.0f) : 0)) - PhotoViewer.this.itemsLayout.getMeasuredWidth()) / 2;
                    PhotoViewer.this.itemsLayout.layout(dp, PhotoViewer.this.itemsLayout.getTop(), PhotoViewer.this.itemsLayout.getMeasuredWidth() + dp, PhotoViewer.this.itemsLayout.getTop() + PhotoViewer.this.itemsLayout.getMeasuredHeight());
                }
            }
        };
        this.pickerView = frameLayout2;
        this.containerView.addView(frameLayout2, LayoutHelper.createFrame(-1, -2, 83));
        TextView textView2 = new TextView(this.containerView.getContext());
        this.docNameTextView = textView2;
        textView2.setTextSize(1, 15.0f);
        this.docNameTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.docNameTextView.setSingleLine(true);
        this.docNameTextView.setMaxLines(1);
        this.docNameTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.docNameTextView.setTextColor(-1);
        this.docNameTextView.setGravity(3);
        this.pickerView.addView(this.docNameTextView, LayoutHelper.createFrame(-1, -2.0f, 51, 20.0f, 23.0f, 84.0f, 0.0f));
        TextView textView3 = new TextView(this.containerView.getContext());
        this.docInfoTextView = textView3;
        textView3.setTextSize(1, 14.0f);
        this.docInfoTextView.setSingleLine(true);
        this.docInfoTextView.setMaxLines(1);
        this.docInfoTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.docInfoTextView.setTextColor(-1);
        this.docInfoTextView.setGravity(3);
        this.pickerView.addView(this.docInfoTextView, LayoutHelper.createFrame(-1, -2.0f, 51, 20.0f, 46.0f, 84.0f, 0.0f));
        TextView textView4 = new TextView(this.containerView.getContext());
        this.doneButtonFullWidth = textView4;
        int i8 = Theme.key_featuredStickers_addButton;
        textView4.setBackground(Theme.AdaptiveRipple.filledRect(getThemedColor(i8), 6.0f));
        TextView textView5 = this.doneButtonFullWidth;
        int i9 = Theme.key_featuredStickers_buttonText;
        textView5.setTextColor(getThemedColor(i9));
        this.doneButtonFullWidth.setEllipsize(TextUtils.TruncateAt.END);
        this.doneButtonFullWidth.setGravity(17);
        this.doneButtonFullWidth.setLines(1);
        this.doneButtonFullWidth.setSingleLine(true);
        this.doneButtonFullWidth.setText(LocaleController.getString("SetAsMyPhoto", R.string.SetAsMyPhoto));
        this.doneButtonFullWidth.setTextSize(1, 15.0f);
        this.doneButtonFullWidth.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.doneButtonFullWidth.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$12(view2);
            }
        });
        this.doneButtonFullWidth.setVisibility(8);
        this.pickerView.addView(this.doneButtonFullWidth, LayoutHelper.createFrame(-1, 48.0f, 51, 20.0f, 0.0f, 20.0f, 64.0f));
        VideoTimelinePlayView videoTimelinePlayView = new VideoTimelinePlayView(this.parentActivity) {
            private final BlurringShader.StoryBlurDrawer blur;

            @Override
            protected boolean customBlur() {
                return true;
            }

            {
                PhotoViewer.this = this;
                new Path();
                this.blur = new BlurringShader.StoryBlurDrawer(this.blurManager, this, 0);
            }

            @Override
            public void setTranslationY(float f) {
                if (getTranslationY() != f) {
                    super.setTranslationY(f);
                    PhotoViewer.this.containerView.invalidate();
                }
            }

            @Override
            protected void drawBlur(Canvas canvas, RectF rectF) {
                canvas.save();
                canvas.clipRect(rectF);
                canvas.translate((-getX()) - PhotoViewer.this.videoTimelineViewContainer.getX(), (-getY()) - PhotoViewer.this.videoTimelineViewContainer.getY());
                PhotoViewer.this.drawCaptionBlur(canvas, this.blur, -14803426, AndroidUtilities.DARK_STATUS_BAR_OVERLAY, false, true, false);
                canvas.restore();
            }

            @Override
            public void invalidate() {
                if (SharedConfig.photoViewerBlur && (PhotoViewer.this.animationInProgress == 1 || PhotoViewer.this.animationInProgress == 2 || PhotoViewer.this.animationInProgress == 3)) {
                    return;
                }
                super.invalidate();
            }
        };
        this.videoTimelineView = videoTimelinePlayView;
        videoTimelinePlayView.setDelegate(new AnonymousClass27());
        FrameLayout frameLayout3 = new FrameLayout(this.parentActivity);
        this.videoTimelineViewContainer = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.videoTimelineViewContainer.addView(this.videoTimelineView, LayoutHelper.createFrame(-1, 54, 83));
        showVideoTimeline(false, false);
        this.containerView.addView(this.videoTimelineViewContainer, LayoutHelper.createFrame(-1, 54.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
        Context context = this.containerView.getContext();
        FrameLayout frameLayout4 = this.windowView;
        FrameLayoutDrawer frameLayoutDrawer2 = this.containerView;
        CaptionPhotoViewer captionPhotoViewer2 = new CaptionPhotoViewer(context, frameLayout4, frameLayoutDrawer2, frameLayoutDrawer2, resourcesProvider, this.blurManager, new Runnable() {
            @Override
            public final void run() {
                PhotoViewer.this.applyCaption();
            }
        }) {
            private final Path path = new Path();

            @Override
            protected boolean customBlur() {
                return true;
            }

            {
                PhotoViewer.this = this;
            }

            @Override
            protected boolean ignoreTouches(float f, float f2) {
                return (this.keyboardShown || PhotoViewer.this.currentEditMode == 0) ? false : true;
            }

            @Override
            protected void drawBlur(BlurringShader.StoryBlurDrawer storyBlurDrawer, Canvas canvas, RectF rectF, float f, boolean z, float f2, float f3, boolean z2) {
                canvas.save();
                this.path.rewind();
                this.path.addRoundRect(rectF, f, f, Path.Direction.CW);
                canvas.clipPath(this.path);
                if (z2) {
                    canvas.translate(((-getX()) - PhotoViewer.this.captionEditContainer.getX()) + f2, ((-getY()) - PhotoViewer.this.captionEditContainer.getY()) + f3);
                } else {
                    canvas.translate(f2, f3);
                }
                PhotoViewer.this.drawCaptionBlur(canvas, storyBlurDrawer, z ? -8882056 : -14277082, z2 ? z ? 0 : AndroidUtilities.DARK_STATUS_BAR_OVERLAY : 1140850688, false, !z, !z && z2);
                canvas.restore();
            }

            @Override
            public boolean captionLimitToast() {
                if (PhotoViewer.this.limitBulletin == null || Bulletin.getVisibleBulletin() != PhotoViewer.this.limitBulletin) {
                    PhotoViewer photoViewer = PhotoViewer.this;
                    return photoViewer.showCaptionLimitBulletin(photoViewer.containerView);
                }
                return false;
            }

            @Override
            protected void setupMentionContainer() {
                this.mentionContainer.getAdapter().setAllowStickers(false);
                this.mentionContainer.getAdapter().setAllowBots(false);
                this.mentionContainer.getAdapter().setAllowChats(false);
                this.mentionContainer.getAdapter().setSearchInDailogs(true);
                if (PhotoViewer.this.parentChatActivity != null) {
                    this.mentionContainer.getAdapter().setChatInfo(PhotoViewer.this.parentChatActivity.chatInfo);
                    this.mentionContainer.getAdapter().setNeedUsernames(PhotoViewer.this.parentChatActivity.currentChat != null);
                } else {
                    this.mentionContainer.getAdapter().setChatInfo(null);
                    this.mentionContainer.getAdapter().setNeedUsernames(false);
                }
                this.mentionContainer.getAdapter().setNeedBotContext(false);
            }

            @Override
            public void onUpdateShowKeyboard(float f) {
                super.onUpdateShowKeyboard(f);
                float f2 = 1.0f - f;
                PhotoViewer.this.muteItem.setAlpha((PhotoViewer.this.muteItem.getTag() != null ? 1 : 0) * f2);
                PhotoViewer.this.videoTimelineViewContainer.setAlpha(f2 * (PhotoViewer.this.videoTimelineViewContainer.getTag() == null ? 0 : 1));
            }

            @Override
            public void invalidate() {
                if (SharedConfig.photoViewerBlur && (PhotoViewer.this.animationInProgress == 1 || PhotoViewer.this.animationInProgress == 2 || PhotoViewer.this.animationInProgress == 3)) {
                    return;
                }
                super.invalidate();
            }
        };
        this.captionEdit = captionPhotoViewer2;
        captionPhotoViewer2.setOnTimerChange(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                PhotoViewer.this.lambda$setParentActivity$13((Integer) obj);
            }
        });
        this.captionEdit.setAccount(this.currentAccount);
        this.captionEdit.setOnHeightUpdate(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                PhotoViewer.this.lambda$setParentActivity$14((Integer) obj);
            }
        });
        this.captionEdit.setOnAddPhotoClick(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$15(view2);
            }
        });
        StickerMakerBackgroundView stickerMakerBackgroundView = new StickerMakerBackgroundView(this.activityContext) {
            {
                PhotoViewer.this = this;
            }

            @Override
            public void setAlpha(float f) {
                super.setAlpha(f);
                PhotoViewer.this.windowView.invalidate();
            }
        };
        this.stickerMakerBackgroundView = stickerMakerBackgroundView;
        stickerMakerBackgroundView.setVisibility(8);
        this.containerView.addView(this.stickerMakerBackgroundView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        StickerMakerView stickerMakerView2 = new StickerMakerView(this.activityContext, resourcesProvider);
        this.stickerMakerView = stickerMakerView2;
        stickerMakerView2.setCurrentAccount(this.currentAccount);
        FrameLayoutDrawer frameLayoutDrawer3 = this.containerView;
        frameLayoutDrawer3.addView(this.stickerMakerView, frameLayoutDrawer3.indexOfChild(this.actionBar) - 1, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        BlurButton blurButton = new BlurButton();
        this.cutOutBtn = blurButton;
        blurButton.setRad(18);
        this.cutOutBtn.wrapContentDynamic();
        this.stickerMakerView.setStickerCutOutBtn(this.cutOutBtn);
        this.cutOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$21(view2);
            }
        });
        this.cutOutBtn.setCutOutState(false);
        this.containerView.addView(this.cutOutBtn, LayoutHelper.createFrame(-1, 36, 17));
        LinearLayout linearLayout = new LinearLayout(this.parentActivity);
        this.btnLayout = linearLayout;
        linearLayout.setOrientation(0);
        BlurButton blurButton2 = new BlurButton();
        this.eraseBtn = blurButton2;
        blurButton2.wrapContent();
        this.eraseBtn.setRad(18);
        this.eraseBtn.setEraseState(false);
        this.eraseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$22(view2);
            }
        });
        this.btnLayout.addView(this.eraseBtn, LayoutHelper.createLinear(-2, 36));
        this.btnLayout.addView(new Space(this.parentActivity), LayoutHelper.createLinear(12, -1));
        BlurButton blurButton3 = new BlurButton();
        this.restoreBtn = blurButton3;
        blurButton3.wrapContent();
        this.restoreBtn.setRad(18);
        this.restoreBtn.setRestoreState(false);
        this.restoreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$23(view2);
            }
        });
        this.btnLayout.addView(this.restoreBtn, LayoutHelper.createLinear(-2, 36));
        this.containerView.addView(this.btnLayout, LayoutHelper.createFrame(-2, 36, 17));
        BlurButton blurButton4 = new BlurButton();
        this.undoBtn = blurButton4;
        blurButton4.setUndoState(false);
        this.undoBtn.setRad(18);
        this.undoBtn.wrapContent();
        this.undoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$24(view2);
            }
        });
        this.containerView.addView(this.undoBtn, LayoutHelper.createFrame(-2, 36, 17));
        BlurButton blurButton5 = new BlurButton();
        this.outlineBtn = blurButton5;
        blurButton5.setOutlineState(false);
        this.outlineBtn.setRad(18);
        this.outlineBtn.wrapContent();
        this.outlineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$25(view2);
            }
        });
        this.containerView.addView(this.outlineBtn, LayoutHelper.createFrame(-2, 36, 17));
        showEditCaption(false, false);
        showStickerMode(false, false);
        FrameLayout frameLayout5 = new FrameLayout(this.parentActivity) {
            {
                PhotoViewer.this = this;
            }

            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                PhotoViewer.this.invalidateBlur();
            }
        };
        this.captionEditContainer = frameLayout5;
        frameLayout5.addView(this.captionEdit, LayoutHelper.createFrame(-1, -1, 83));
        this.containerView.addView(this.captionEditContainer, LayoutHelper.createFrame(-1, -1.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView6 = new TextView(this.parentActivity);
        this.videoAvatarTooltip = textView6;
        textView6.setSingleLine(true);
        this.videoAvatarTooltip.setVisibility(8);
        this.videoAvatarTooltip.setText(LocaleController.getString("ChooseCover", R.string.ChooseCover));
        this.videoAvatarTooltip.setGravity(1);
        this.videoAvatarTooltip.setTextSize(1, 14.0f);
        this.videoAvatarTooltip.setTextColor(-7566196);
        this.containerView.addView(this.videoAvatarTooltip, LayoutHelper.createFrame(-1, -2.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(this.parentActivity);
        this.pickerViewSendButton = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        Drawable createSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(48.0f), getThemedColor(i7), getThemedColor(Build.VERSION.SDK_INT >= 21 ? Theme.key_dialogFloatingButtonPressed : i7));
        this.pickerViewSendDrawable = createSimpleSelectorCircleDrawable;
        this.pickerViewSendButton.setBackgroundDrawable(createSimpleSelectorCircleDrawable);
        this.pickerViewSendButton.setImageResource(R.drawable.msg_input_send_mini);
        this.pickerViewSendButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_dialogFloatingIcon), PorterDuff.Mode.MULTIPLY));
        this.containerView.addView(this.pickerViewSendButton, LayoutHelper.createFrame(48, 48.0f, 85, 0.0f, 0.0f, 14.0f, 2.33f));
        this.pickerViewSendButton.setContentDescription(LocaleController.getString("Send", R.string.Send));
        ScaleStateListAnimator.apply(this.pickerViewSendButton);
        this.pickerViewSendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$26(view2);
            }
        });
        this.pickerViewSendButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view2) {
                boolean lambda$setParentActivity$30;
                lambda$setParentActivity$30 = PhotoViewer.this.lambda$setParentActivity$30(resourcesProvider, view2);
                return lambda$setParentActivity$30;
            }
        });
        LinearLayout linearLayout2 = new LinearLayout(this.parentActivity) {
            {
                PhotoViewer.this = this;
            }

            @Override
            protected void onMeasure(int i10, int i11) {
                int childCount = getChildCount();
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    if (getChildAt(i13).getVisibility() == 0) {
                        i12++;
                    }
                }
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (i12 != 0) {
                    int min = Math.min(AndroidUtilities.dp(70.0f), size / i12);
                    if (PhotoViewer.this.compressItem.getVisibility() == 0) {
                        int max = Math.max(0, (min - AndroidUtilities.dp(PhotoViewer.this.selectedCompression < 2 ? 48 : 64)) / 2);
                        PhotoViewer.this.compressItem.setPadding(max, 0, max, 0);
                    }
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt = getChildAt(i14);
                        if (childAt.getVisibility() != 8) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                        }
                    }
                    setMeasuredDimension(min * i12, size2);
                    return;
                }
                setMeasuredDimension(size, size2);
            }
        };
        this.itemsLayout = linearLayout2;
        linearLayout2.setOrientation(0);
        this.pickerView.addView(this.itemsLayout, LayoutHelper.createFrame(-2, 48.0f, 81, 0.0f, 0.0f, 70.0f, 0.0f));
        ImageView imageView2 = new ImageView(this.parentActivity);
        this.cropItem = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        this.cropItem.setImageResource(R.drawable.media_crop);
        this.cropItem.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.itemsLayout.addView(this.cropItem, LayoutHelper.createLinear(48, 48));
        this.cropItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$31(view2);
            }
        });
        this.cropItem.setContentDescription(LocaleController.getString("CropImage", R.string.CropImage));
        ImageView imageView3 = new ImageView(this.parentActivity);
        this.rotateItem = imageView3;
        imageView3.setScaleType(ImageView.ScaleType.CENTER);
        this.rotateItem.setImageResource(R.drawable.msg_photo_rotate);
        this.rotateItem.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.itemsLayout.addView(this.rotateItem, LayoutHelper.createLinear(48, 48));
        this.rotateItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$32(view2);
            }
        });
        this.rotateItem.setContentDescription(LocaleController.getString("AccDescrRotate", R.string.AccDescrRotate));
        ImageView imageView4 = new ImageView(this.parentActivity);
        this.mirrorItem = imageView4;
        imageView4.setScaleType(ImageView.ScaleType.CENTER);
        this.mirrorItem.setImageResource(R.drawable.media_flip);
        this.mirrorItem.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.itemsLayout.addView(this.mirrorItem, LayoutHelper.createLinear(48, 48));
        this.mirrorItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$33(view2);
            }
        });
        this.mirrorItem.setContentDescription(LocaleController.getString("AccDescrMirror", R.string.AccDescrMirror));
        ImageView imageView5 = new ImageView(this.parentActivity);
        this.paintItem = imageView5;
        imageView5.setScaleType(ImageView.ScaleType.CENTER);
        this.paintItem.setImageResource(R.drawable.media_draw);
        this.paintItem.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.itemsLayout.addView(this.paintItem, LayoutHelper.createLinear(48, 48));
        this.paintItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$34(view2);
            }
        });
        this.paintItem.setContentDescription(LocaleController.getString("AccDescrPhotoEditor", R.string.AccDescrPhotoEditor));
        ImageView imageView6 = new ImageView(this.parentActivity);
        this.muteItem = imageView6;
        imageView6.setScaleType(ImageView.ScaleType.CENTER);
        this.muteItem.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.containerView.addView(this.muteItem, LayoutHelper.createFrame(48, 48.0f, 83, 16.0f, 0.0f, 0.0f, 0.0f));
        this.muteItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$35(view2);
            }
        });
        VideoCompressButton videoCompressButton = new VideoCompressButton(this.parentActivity);
        this.compressItem = videoCompressButton;
        videoCompressButton.setTag(1);
        this.compressItem.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.selectedCompression = selectCompression();
        this.compressItem.setState(this.videoConvertSupported && this.compressionsCount > 1, this.muteVideo, Math.min(this.resultWidth, this.resultHeight));
        this.compressItem.setContentDescription(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        this.itemsLayout.addView(this.compressItem, LayoutHelper.createLinear(48, 48));
        this.compressItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$36(parentActivity, view2);
            }
        });
        ImageView imageView7 = new ImageView(this.parentActivity);
        this.tuneItem = imageView7;
        imageView7.setScaleType(ImageView.ScaleType.CENTER);
        this.tuneItem.setImageResource(R.drawable.media_settings);
        this.tuneItem.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.itemsLayout.addView(this.tuneItem, LayoutHelper.createLinear(48, 48));
        this.tuneItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$37(view2);
            }
        });
        this.tuneItem.setContentDescription(LocaleController.getString("AccDescrPhotoAdjust", R.string.AccDescrPhotoAdjust));
        PickerBottomLayoutViewer pickerBottomLayoutViewer2 = new PickerBottomLayoutViewer(this.activityContext);
        this.editorDoneLayout = pickerBottomLayoutViewer2;
        pickerBottomLayoutViewer2.setBackgroundColor(-872415232);
        this.editorDoneLayout.updateSelectedCount(0, false);
        this.editorDoneLayout.setVisibility(8);
        this.containerView.addView(this.editorDoneLayout, LayoutHelper.createFrame(-1, 48, 83));
        this.editorDoneLayout.cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$39(view2);
            }
        });
        this.editorDoneLayout.doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$40(view2);
            }
        });
        TextView textView7 = new TextView(this.activityContext);
        this.resetButton = textView7;
        textView7.setClickable(false);
        this.resetButton.setVisibility(8);
        this.resetButton.setTextSize(1, 14.0f);
        this.resetButton.setTextColor(-1);
        this.resetButton.setGravity(17);
        this.resetButton.setBackgroundDrawable(Theme.createSelectorDrawable(-12763843, 0));
        this.resetButton.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        this.resetButton.setText(LocaleController.getString("Reset", R.string.CropReset).toUpperCase());
        this.resetButton.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.editorDoneLayout.addView(this.resetButton, LayoutHelper.createFrame(-2, -1, 49));
        this.resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$42(view2);
            }
        });
        GestureDetector2 gestureDetector2 = new GestureDetector2(this.containerView.getContext(), this);
        this.gestureDetector = gestureDetector2;
        gestureDetector2.setIsLongpressEnabled(false);
        setDoubleTapEnabled(true);
        ImageReceiver.ImageReceiverDelegate imageReceiverDelegate = new ImageReceiver.ImageReceiverDelegate() {
            @Override
            public final void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
                PhotoViewer.this.lambda$setParentActivity$43(imageReceiver, z, z2, z3);
            }

            @Override
            public void didSetImageBitmap(int i10, String str, Drawable drawable) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i10, str, drawable);
            }

            @Override
            public void onAnimationReady(ImageReceiver imageReceiver) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
            }
        };
        this.centerImage.setParentView(this.containerView);
        this.centerImage.setCrossfadeAlpha((byte) 2);
        this.centerImage.setInvalidateAll(true);
        this.centerImage.setDelegate(imageReceiverDelegate);
        this.leftImage.setParentView(this.containerView);
        this.leftImage.setCrossfadeAlpha((byte) 2);
        this.leftImage.setInvalidateAll(true);
        this.leftImage.setDelegate(imageReceiverDelegate);
        this.rightImage.setParentView(this.containerView);
        this.rightImage.setCrossfadeAlpha((byte) 2);
        this.rightImage.setInvalidateAll(true);
        this.rightImage.setDelegate(imageReceiverDelegate);
        int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        CheckBox checkBox = new CheckBox(this.containerView.getContext(), R.drawable.selectphoto_large);
        this.checkImageView = checkBox;
        checkBox.setDrawBackground(true);
        this.checkImageView.setHasBorder(true);
        this.checkImageView.setSize(34);
        this.checkImageView.setCheckOffset(AndroidUtilities.dp(1.0f));
        this.checkImageView.setColor(getThemedColor(i7), -1);
        this.checkImageView.setVisibility(8);
        this.containerView.addView(this.checkImageView, LayoutHelper.createFrame(34, 34.0f, 53, 0.0f, (rotation == 3 || rotation == 1) ? 61.0f : 71.0f, 11.0f, 0.0f));
        if (isStatusBarVisible()) {
            ((FrameLayout.LayoutParams) this.checkImageView.getLayoutParams()).topMargin += AndroidUtilities.statusBarHeight;
        }
        this.checkImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$44(view2);
            }
        });
        CounterView counterView = new CounterView(this.parentActivity);
        this.photosCounterView = counterView;
        this.containerView.addView(counterView, LayoutHelper.createFrame(40, 40.0f, 53, 0.0f, (rotation == 3 || rotation == 1) ? 58.0f : 68.0f, 64.0f, 0.0f));
        if (isStatusBarVisible()) {
            ((FrameLayout.LayoutParams) this.photosCounterView.getLayoutParams()).topMargin += AndroidUtilities.statusBarHeight;
        }
        this.photosCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$45(view2);
            }
        });
        SelectedPhotosListView selectedPhotosListView = new SelectedPhotosListView(this.parentActivity);
        this.selectedPhotosListView = selectedPhotosListView;
        selectedPhotosListView.setVisibility(8);
        this.selectedPhotosListView.setAlpha(0.0f);
        this.selectedPhotosListView.setLayoutManager(new LinearLayoutManager(this, this.parentActivity, 0, true) {
            @Override
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i10) {
                LinearSmoothScrollerEnd linearSmoothScrollerEnd = new LinearSmoothScrollerEnd(this, recyclerView.getContext()) {
                    @Override
                    public int calculateTimeForDeceleration(int i11) {
                        return Math.max(180, super.calculateTimeForDeceleration(i11));
                    }
                };
                linearSmoothScrollerEnd.setTargetPosition(i10);
                startSmoothScroll(linearSmoothScrollerEnd);
            }
        });
        SelectedPhotosListView selectedPhotosListView2 = this.selectedPhotosListView;
        ListAdapter listAdapter = new ListAdapter(this.parentActivity);
        this.selectedPhotosAdapter = listAdapter;
        selectedPhotosListView2.setAdapter(listAdapter);
        this.containerView.addView(this.selectedPhotosListView, LayoutHelper.createFrame(-1, (int) R.styleable.AppCompatTheme_textAppearanceListItem, 51));
        this.selectedPhotosListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view2, int i10) {
                PhotoViewer.this.lambda$setParentActivity$46(view2, i10);
            }
        });
        UndoView undoView = new UndoView(this.activityContext, null, false, resourcesProvider);
        this.hintView = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(112.0f));
        this.hintView.setColors(-115203550, -1);
        this.containerView.addView(this.hintView, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            View view2 = new View(this.activityContext);
            this.playButtonAccessibilityOverlay = view2;
            view2.setContentDescription(LocaleController.getString("AccActionPlay", R.string.AccActionPlay));
            this.playButtonAccessibilityOverlay.setFocusable(true);
            this.containerView.addView(this.playButtonAccessibilityOverlay, LayoutHelper.createFrame(64, 64, 17));
        }
        this.doneButtonFullWidth.setBackground(Theme.AdaptiveRipple.filledRect(getThemedColor(i8), 6.0f));
        this.doneButtonFullWidth.setTextColor(getThemedColor(i9));
        TextSelectionHelper.SimpleTextSelectionHelper simpleTextSelectionHelper = this.textSelectionHelper;
        simpleTextSelectionHelper.allowScrollPrentRelative = true;
        simpleTextSelectionHelper.useMovingOffset = false;
        TextSelectionHelper<Cell>.TextSelectionOverlay overlayView = simpleTextSelectionHelper.getOverlayView(this.windowView.getContext());
        if (overlayView != null) {
            AndroidUtilities.removeFromParent(overlayView);
            this.containerView.addView(overlayView);
        }
        this.textSelectionHelper.setParentView(this.containerView);
        this.textSelectionHelper.setInvalidateParent();
    }

    public class AnonymousClass13 extends FrameLayout {
        AnonymousClass13(Context context) {
            super(context);
            PhotoViewer.this = r1;
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return PhotoViewer.this.isVisible && super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return PhotoViewer.this.isVisible && PhotoViewer.this.onTouchEvent(motionEvent);
        }

        @Override
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            keyEvent.getKeyCode();
            if (!PhotoViewer.this.muteVideo && PhotoViewer.this.sendPhotoType != 1 && PhotoViewer.this.isCurrentVideo && PhotoViewer.this.videoPlayer != null && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
                PhotoViewer.this.videoPlayer.setVolume(1.0f);
            }
            return super.dispatchKeyEvent(keyEvent);
        }

        @Override
        public boolean dispatchTouchEvent(android.view.MotionEvent r3) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.AnonymousClass13.dispatchTouchEvent(android.view.MotionEvent):boolean");
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            try {
                return super.drawChild(canvas, view, j);
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int i3;
            int i4;
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 21) {
                if (!PhotoViewer.this.inBubbleMode) {
                    if (!AndroidUtilities.incorrectDisplaySizeFix) {
                        if (PhotoViewer.this.insets.bottom >= 0 && (i3 = AndroidUtilities.statusBarHeight) >= 0 && (i4 = (size2 - i3) - PhotoViewer.this.insets.bottom) > 0 && i4 < 4096) {
                            AndroidUtilities.displaySize.y = i4;
                        }
                    } else {
                        int i6 = AndroidUtilities.displaySize.y;
                        if (size2 > i6) {
                            size2 = i6;
                        }
                        size2 += AndroidUtilities.statusBarHeight;
                    }
                }
                size2 -= PhotoViewer.this.insets.bottom;
            } else {
                if (i5 < 21) {
                    PhotoViewer.this.insets.top = AndroidUtilities.statusBarHeight;
                    PhotoViewer.this.insets.bottom = AndroidUtilities.navigationBarHeight;
                }
                int i7 = AndroidUtilities.displaySize.y;
                if (size2 > i7) {
                    size2 = i7;
                }
            }
            int paddingLeft = size - (getPaddingLeft() + getPaddingRight());
            int paddingBottom = size2 - getPaddingBottom();
            setMeasuredDimension(paddingLeft, paddingBottom);
            ViewGroup.LayoutParams layoutParams = PhotoViewer.this.animatingImageView.getLayoutParams();
            PhotoViewer.this.animatingImageView.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(layoutParams.height, Integer.MIN_VALUE));
            PhotoViewer.this.containerView.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
            PhotoViewer.this.navigationBar.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(PhotoViewer.this.navigationBarHeight, 1073741824));
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            PhotoViewer.this.animatingImageView.layout(getPaddingLeft(), 0, getPaddingLeft() + PhotoViewer.this.animatingImageView.getMeasuredWidth(), PhotoViewer.this.animatingImageView.getMeasuredHeight());
            PhotoViewer.this.containerView.layout(getPaddingLeft(), 0, getPaddingLeft() + PhotoViewer.this.containerView.getMeasuredWidth(), PhotoViewer.this.containerView.getMeasuredHeight());
            PhotoViewer.this.navigationBar.layout(getPaddingLeft(), PhotoViewer.this.containerView.getMeasuredHeight(), PhotoViewer.this.navigationBar.getMeasuredWidth(), PhotoViewer.this.containerView.getMeasuredHeight() + PhotoViewer.this.navigationBar.getMeasuredHeight());
            PhotoViewer.this.wasLayout = true;
            if (z) {
                if (!PhotoViewer.this.dontResetZoomOnFirstLayout) {
                    PhotoViewer photoViewer = PhotoViewer.this;
                    photoViewer.scale = photoViewer.scale1();
                    PhotoViewer.this.translationX = 0.0f;
                    PhotoViewer.this.translationY = 0.0f;
                    PhotoViewer photoViewer2 = PhotoViewer.this;
                    photoViewer2.updateMinMax(photoViewer2.scale);
                }
                if (PhotoViewer.this.checkImageView != null) {
                    PhotoViewer.this.checkImageView.post(new Runnable() {
                        @Override
                        public final void run() {
                            PhotoViewer.AnonymousClass13.this.lambda$onLayout$0();
                        }
                    });
                }
            }
            if (PhotoViewer.this.dontResetZoomOnFirstLayout) {
                PhotoViewer.this.setScaleToFill();
                PhotoViewer.this.dontResetZoomOnFirstLayout = false;
            }
        }

        public void lambda$onLayout$0() {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) PhotoViewer.this.checkImageView.getLayoutParams();
            ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
            int currentActionBarHeight = ((ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(34.0f)) / 2) + (PhotoViewer.this.isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0);
            if (currentActionBarHeight != layoutParams.topMargin) {
                layoutParams.topMargin = currentActionBarHeight;
                PhotoViewer.this.checkImageView.setLayoutParams(layoutParams);
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) PhotoViewer.this.photosCounterView.getLayoutParams();
            int currentActionBarHeight2 = ((ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(40.0f)) / 2) + (PhotoViewer.this.isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0);
            if (layoutParams2.topMargin != currentActionBarHeight2) {
                layoutParams2.topMargin = currentActionBarHeight2;
                PhotoViewer.this.photosCounterView.setLayoutParams(layoutParams2);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            PhotoViewer.this.centerImage.onAttachedToWindow();
            PhotoViewer.this.leftImage.onAttachedToWindow();
            PhotoViewer.this.rightImage.onAttachedToWindow();
            PhotoViewer.this.attachedToWindow = true;
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            PhotoViewer.this.centerImage.onDetachedFromWindow();
            PhotoViewer.this.leftImage.onDetachedFromWindow();
            PhotoViewer.this.rightImage.onDetachedFromWindow();
            PhotoViewer.this.attachedToWindow = false;
            PhotoViewer.this.wasLayout = false;
        }

        @Override
        public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
            if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                if (PhotoViewer.this.textSelectionHelper.isInSelectionMode()) {
                    PhotoViewer.this.textSelectionHelper.clear();
                }
                if (PhotoViewer.this.isCaptionOpen()) {
                    PhotoViewer.this.closeCaptionEnter(true);
                    return false;
                } else if (ContentPreviewViewer.getInstance().isVisible()) {
                    ContentPreviewViewer.getInstance().closeWithMenu();
                    return false;
                } else {
                    PhotoViewer.getInstance().closePhoto(true, false);
                    return true;
                }
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (PhotoViewer.this.stickerMakerBackgroundView != null && PhotoViewer.this.stickerMakerBackgroundView.getVisibility() == 0) {
                View view = (View) PhotoViewer.this.stickerMakerBackgroundView.getParent();
                float min = Math.min(PhotoViewer.this.stickerMakerBackgroundView.getAlpha(), view != null ? view.getAlpha() : 1.0f);
                if (min > 0.0f) {
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (min * 255.0f), 31);
                    PhotoViewer.this.stickerMakerBackgroundView.draw(canvas);
                    canvas.restore();
                }
            }
            if (Build.VERSION.SDK_INT < 21 || !PhotoViewer.this.isVisible) {
                return;
            }
            PhotoViewer.this.blackPaint.setAlpha(PhotoViewer.this.backgroundDrawable.getAlpha());
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() + PhotoViewer.this.insets.bottom, PhotoViewer.this.blackPaint);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            UndoView undoView;
            super.dispatchDraw(canvas);
            if (PhotoViewer.this.parentChatActivity == null || (undoView = PhotoViewer.this.parentChatActivity.getUndoView()) == null || undoView.getVisibility() != 0) {
                return;
            }
            canvas.save();
            View view = (View) undoView.getParent();
            canvas.clipRect(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            canvas.translate(undoView.getX(), undoView.getY());
            undoView.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    public WindowInsets lambda$setParentActivity$6(View view, WindowInsets windowInsets) {
        Rect rect = new Rect(this.insets);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.displayCutout() | WindowInsetsCompat.Type.systemBars());
            this.insets.set(insets.left, insets.top, insets.right, insets.bottom);
        } else {
            this.insets.set(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        int i2 = this.insets.top;
        Activity activity = this.parentActivity;
        if ((activity instanceof LaunchActivity) && ((i2 != 0 || AndroidUtilities.isInMultiwindow) && !this.inBubbleMode && AndroidUtilities.statusBarHeight != i2)) {
            AndroidUtilities.statusBarHeight = i2;
            ((LaunchActivity) activity).drawerLayoutContainer.requestLayout();
        }
        if (!rect.equals(windowInsets)) {
            int i3 = this.animationInProgress;
            if (i3 == 1 || i3 == 3) {
                ClippingImageView clippingImageView = this.animatingImageView;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - getLeftInset());
                this.animationValues[0][2] = this.animatingImageView.getTranslationX();
            }
            FrameLayout frameLayout = this.windowView;
            if (frameLayout != null) {
                frameLayout.requestLayout();
            }
        }
        View view2 = this.navigationBar;
        if (view2 != null) {
            this.navigationBarHeight = this.insets.bottom;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i4 = this.navigationBarHeight;
            marginLayoutParams.height = i4;
            marginLayoutParams.bottomMargin = (-i4) / 2;
            this.navigationBar.setLayoutParams(marginLayoutParams);
        }
        this.containerView.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), 0);
        if (this.actionBar != null) {
            AndroidUtilities.cancelRunOnUIThread(this.updateContainerFlagsRunnable);
            if (this.isVisible && this.animationInProgress == 0) {
                AndroidUtilities.runOnUIThread(this.updateContainerFlagsRunnable, 200L);
            }
        }
        if (i >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public class AnonymousClass16 extends ActionBar.ActionBarMenuOnItemClick {
        final Theme.ResourcesProvider val$resourcesProvider;

        AnonymousClass16(Theme.ResourcesProvider resourcesProvider) {
            PhotoViewer.this = r1;
            this.val$resourcesProvider = resourcesProvider;
        }

        public void lambda$onItemClick$0(boolean z, Uri uri) {
            BulletinFactory.createSaveToGalleryBulletin(PhotoViewer.this.containerView, z, -115203550, -1).show();
        }

        public void lambda$onItemClick$2(DialogInterface dialogInterface, int i) {
            File pathToMessage;
            if (PhotoViewer.this.currentMessageObject == null) {
                return;
            }
            if (!(MessageObject.getMedia(PhotoViewer.this.currentMessageObject.messageOwner) instanceof TLRPC$TL_messageMediaWebPage) || MessageObject.getMedia(PhotoViewer.this.currentMessageObject.messageOwner).webpage == null || MessageObject.getMedia(PhotoViewer.this.currentMessageObject.messageOwner).webpage.document != null) {
                pathToMessage = FileLoader.getInstance(PhotoViewer.this.currentAccount).getPathToMessage(PhotoViewer.this.currentMessageObject.messageOwner);
            } else {
                PhotoViewer photoViewer = PhotoViewer.this;
                pathToMessage = FileLoader.getInstance(PhotoViewer.this.currentAccount).getPathToAttach(photoViewer.getFileLocation(photoViewer.currentIndex, null), true);
            }
            final boolean isVideo = PhotoViewer.this.currentMessageObject.isVideo();
            if (pathToMessage == null || !pathToMessage.exists()) {
                PhotoViewer.this.showDownloadAlert();
                return;
            }
            MediaController.saveFile(pathToMessage.toString(), PhotoViewer.this.parentActivity, isVideo ? 1 : 0, null, null, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    PhotoViewer.AnonymousClass16.this.lambda$onItemClick$1(isVideo, (Uri) obj);
                }
            });
        }

        public void lambda$onItemClick$1(boolean z, Uri uri) {
            BulletinFactory.createSaveToGalleryBulletin(PhotoViewer.this.containerView, z, -115203550, -1).show();
        }

        public void lambda$onItemClick$5(final boolean z, ArrayList arrayList, DialogInterface dialogInterface, int i) {
            File pathToMessage;
            final int[] iArr = new int[1];
            final int[] iArr2 = new int[1];
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.AnonymousClass16.this.lambda$onItemClick$3(iArr2, iArr, z);
                }
            };
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i2);
                if (messageObject != null) {
                    if (!(MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC$TL_messageMediaWebPage) || MessageObject.getMedia(messageObject.messageOwner).webpage == null || MessageObject.getMedia(messageObject.messageOwner).webpage.document != null) {
                        pathToMessage = FileLoader.getInstance(PhotoViewer.this.currentAccount).getPathToMessage(messageObject.messageOwner);
                    } else {
                        FileLoader fileLoader = FileLoader.getInstance(PhotoViewer.this.currentAccount);
                        PhotoViewer photoViewer = PhotoViewer.this;
                        pathToMessage = fileLoader.getPathToAttach(photoViewer.getFileLocation(photoViewer.currentIndex, null), true);
                    }
                    boolean isVideo = messageObject.isVideo();
                    if (pathToMessage != null && pathToMessage.exists()) {
                        iArr[0] = iArr[0] + 1;
                        MediaController.saveFile(pathToMessage.toString(), PhotoViewer.this.parentActivity, isVideo ? 1 : 0, null, null, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                Uri uri = (Uri) obj;
                                AndroidUtilities.runOnUIThread(runnable);
                            }
                        });
                    }
                }
            }
        }

        public void lambda$onItemClick$3(int[] iArr, int[] iArr2, boolean z) {
            iArr[0] = iArr[0] + 1;
            if (iArr[0] == iArr2[0]) {
                BulletinFactory.createSaveToGalleryBulletin(PhotoViewer.this.containerView, iArr2[0], z, -115203550, -1).show();
            }
        }

        public void lambda$onItemClick$7(DialogInterface dialogInterface, int i) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(PhotoViewer.this.currentMessageObject);
            PhotoViewer.this.showShareAlert(arrayList);
        }

        public void lambda$onItemClick$8(ArrayList arrayList, DialogInterface dialogInterface, int i) {
            PhotoViewer.this.showShareAlert(arrayList);
        }

        public boolean lambda$onItemClick$10(ArrayList arrayList, ChatActivity chatActivity, DialogsActivity dialogsActivity, ArrayList arrayList2, CharSequence charSequence, boolean z, TopicsFragment topicsFragment) {
            UndoView undoView;
            long j;
            if (arrayList2.size() > 1 || ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId == UserConfig.getInstance(PhotoViewer.this.currentAccount).getClientUserId() || charSequence != null) {
                for (int i = 0; i < arrayList2.size(); i++) {
                    long j2 = ((MessagesStorage.TopicKey) arrayList2.get(i)).dialogId;
                    if (charSequence != null) {
                        j = j2;
                        SendMessagesHelper.getInstance(PhotoViewer.this.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j2, null, null, null, true, null, null, null, true, 0, null, false));
                    } else {
                        j = j2;
                    }
                    SendMessagesHelper.getInstance(PhotoViewer.this.currentAccount).sendMessage(arrayList, j, false, false, true, 0);
                }
                dialogsActivity.finishFragment();
                if (chatActivity != null && (undoView = chatActivity.getUndoView()) != null) {
                    if (arrayList2.size() == 1) {
                        undoView.showWithAction(((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId, 53, Integer.valueOf(arrayList.size()));
                    } else {
                        undoView.showWithAction(0L, 53, Integer.valueOf(arrayList.size()), Integer.valueOf(arrayList2.size()), (Runnable) null, (Runnable) null);
                    }
                }
            } else {
                MessagesStorage.TopicKey topicKey = (MessagesStorage.TopicKey) arrayList2.get(0);
                long j3 = topicKey.dialogId;
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(j3)) {
                    bundle.putInt("enc_id", DialogObject.getEncryptedChatId(j3));
                } else if (DialogObject.isUserDialog(j3)) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                ChatActivity chatActivity2 = new ChatActivity(bundle);
                if (topicKey.topicId != 0) {
                    ForumUtilities.applyTopic(chatActivity2, topicKey);
                }
                if (((LaunchActivity) PhotoViewer.this.parentActivity).presentFragment(chatActivity2, true, false)) {
                    chatActivity2.showFieldPanelForForward(true, arrayList);
                } else {
                    dialogsActivity.finishFragment();
                }
            }
            return true;
        }

        public static void lambda$onItemClick$11(boolean[] zArr, View view) {
            zArr[0] = !zArr[0];
            ((CheckBoxCell) view).setChecked(zArr[0], true);
        }

        public void lambda$onItemClick$12(boolean[] zArr, DialogInterface dialogInterface, int i) {
            ArrayList arrayList;
            TLRPC$EncryptedChat tLRPC$EncryptedChat;
            if (PhotoViewer.this.placeProvider.onDeletePhoto(PhotoViewer.this.currentIndex)) {
                if (!PhotoViewer.this.imagesArr.isEmpty()) {
                    if (PhotoViewer.this.currentIndex < 0 || PhotoViewer.this.currentIndex >= PhotoViewer.this.imagesArr.size()) {
                        return;
                    }
                    MessageObject messageObject = (MessageObject) PhotoViewer.this.imagesArr.get(PhotoViewer.this.currentIndex);
                    if (messageObject.isSent()) {
                        PhotoViewer.this.closePhoto(false, false);
                        ArrayList arrayList2 = new ArrayList();
                        if (PhotoViewer.this.slideshowMessageId != 0) {
                            arrayList2.add(Integer.valueOf(PhotoViewer.this.slideshowMessageId));
                        } else {
                            arrayList2.add(Integer.valueOf(messageObject.getId()));
                        }
                        if (!DialogObject.isEncryptedDialog(messageObject.getDialogId()) || messageObject.messageOwner.random_id == 0) {
                            arrayList = null;
                            tLRPC$EncryptedChat = null;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(Long.valueOf(messageObject.messageOwner.random_id));
                            arrayList = arrayList3;
                            tLRPC$EncryptedChat = MessagesController.getInstance(PhotoViewer.this.currentAccount).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(messageObject.getDialogId())));
                        }
                        MessagesController.getInstance(PhotoViewer.this.currentAccount).deleteMessages(arrayList2, arrayList, tLRPC$EncryptedChat, messageObject.getDialogId(), messageObject.getQuickReplyId(), zArr[0], messageObject.getChatMode());
                        return;
                    }
                    return;
                } else if (!PhotoViewer.this.avatarsArr.isEmpty()) {
                    if (PhotoViewer.this.currentIndex < 0 || PhotoViewer.this.currentIndex >= PhotoViewer.this.avatarsArr.size()) {
                        return;
                    }
                    TLRPC$Message tLRPC$Message = (TLRPC$Message) PhotoViewer.this.imagesArrMessages.get(PhotoViewer.this.currentIndex);
                    if (tLRPC$Message != null) {
                        ArrayList<Integer> arrayList4 = new ArrayList<>();
                        arrayList4.add(Integer.valueOf(tLRPC$Message.id));
                        MessagesController.getInstance(PhotoViewer.this.currentAccount).deleteMessages(arrayList4, null, null, MessageObject.getDialogId(tLRPC$Message), tLRPC$Message.quick_reply_shortcut_id, true, 0);
                        NotificationCenter.getInstance(PhotoViewer.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                    }
                    if (PhotoViewer.this.isCurrentAvatarSet()) {
                        if (PhotoViewer.this.avatarsDialogId > 0) {
                            MessagesController.getInstance(PhotoViewer.this.currentAccount).deleteUserPhoto(null);
                        } else {
                            MessagesController.getInstance(PhotoViewer.this.currentAccount).changeChatAvatar(-PhotoViewer.this.avatarsDialogId, null, null, null, null, 0.0d, null, null, null, null);
                        }
                        PhotoViewer.this.closePhoto(false, false);
                        return;
                    }
                    TLRPC$Photo tLRPC$Photo = (TLRPC$Photo) PhotoViewer.this.avatarsArr.get(PhotoViewer.this.currentIndex);
                    if (tLRPC$Photo == null) {
                        return;
                    }
                    TLRPC$TL_inputPhoto tLRPC$TL_inputPhoto = new TLRPC$TL_inputPhoto();
                    tLRPC$TL_inputPhoto.id = tLRPC$Photo.id;
                    tLRPC$TL_inputPhoto.access_hash = tLRPC$Photo.access_hash;
                    byte[] bArr = tLRPC$Photo.file_reference;
                    tLRPC$TL_inputPhoto.file_reference = bArr;
                    if (bArr == null) {
                        tLRPC$TL_inputPhoto.file_reference = new byte[0];
                    }
                    if (PhotoViewer.this.avatarsDialogId > 0) {
                        MessagesController.getInstance(PhotoViewer.this.currentAccount).deleteUserPhoto(tLRPC$TL_inputPhoto);
                    }
                    MessagesStorage.getInstance(PhotoViewer.this.currentAccount).clearUserPhoto(PhotoViewer.this.avatarsDialogId, tLRPC$Photo.id);
                    PhotoViewer.this.imagesArrLocations.remove(PhotoViewer.this.currentIndex);
                    PhotoViewer.this.imagesArrLocationsSizes.remove(PhotoViewer.this.currentIndex);
                    PhotoViewer.this.imagesArrLocationsVideo.remove(PhotoViewer.this.currentIndex);
                    PhotoViewer.this.imagesArrMessages.remove(PhotoViewer.this.currentIndex);
                    PhotoViewer.this.avatarsArr.remove(PhotoViewer.this.currentIndex);
                    if (!PhotoViewer.this.imagesArrLocations.isEmpty()) {
                        int i2 = PhotoViewer.this.currentIndex;
                        if (i2 >= PhotoViewer.this.avatarsArr.size()) {
                            i2 = PhotoViewer.this.avatarsArr.size() - 1;
                        }
                        PhotoViewer.this.currentIndex = -1;
                        PhotoViewer.this.setImageIndex(i2);
                    } else {
                        PhotoViewer.this.closePhoto(false, false);
                    }
                    if (tLRPC$Message == null) {
                        NotificationCenter.getInstance(PhotoViewer.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        return;
                    }
                    return;
                } else if (PhotoViewer.this.secureDocuments.isEmpty() || PhotoViewer.this.placeProvider == null) {
                    return;
                } else {
                    PhotoViewer.this.secureDocuments.remove(PhotoViewer.this.currentIndex);
                    PhotoViewer.this.placeProvider.deleteImageAtIndex(PhotoViewer.this.currentIndex);
                    if (!PhotoViewer.this.secureDocuments.isEmpty()) {
                        int i3 = PhotoViewer.this.currentIndex;
                        if (i3 >= PhotoViewer.this.secureDocuments.size()) {
                            i3 = PhotoViewer.this.secureDocuments.size() - 1;
                        }
                        PhotoViewer.this.currentIndex = -1;
                        PhotoViewer.this.setImageIndex(i3);
                        return;
                    }
                    PhotoViewer.this.closePhoto(false, false);
                    return;
                }
            }
            PhotoViewer.this.closePhoto(false, false);
        }

        @Override
        public void onItemClick(int r30) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.AnonymousClass16.onItemClick(int):void");
        }

        public void lambda$onItemClick$14(final UserConfig userConfig, final TLRPC$Photo tLRPC$Photo, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.AnonymousClass16.this.lambda$onItemClick$13(tLObject, userConfig, tLRPC$Photo);
                }
            });
        }

        public void lambda$onItemClick$13(TLObject tLObject, UserConfig userConfig, TLRPC$Photo tLRPC$Photo) {
            if (tLObject instanceof TLRPC$TL_photos_photo) {
                TLRPC$TL_photos_photo tLRPC$TL_photos_photo = (TLRPC$TL_photos_photo) tLObject;
                MessagesController.getInstance(PhotoViewer.this.currentAccount).putUsers(tLRPC$TL_photos_photo.users, false);
                TLRPC$User user = MessagesController.getInstance(PhotoViewer.this.currentAccount).getUser(Long.valueOf(userConfig.clientUserId));
                if (tLRPC$TL_photos_photo.photo instanceof TLRPC$TL_photo) {
                    int indexOf = PhotoViewer.this.avatarsArr.indexOf(tLRPC$Photo);
                    if (indexOf >= 0) {
                        PhotoViewer.this.avatarsArr.set(indexOf, tLRPC$TL_photos_photo.photo);
                    }
                    if (user != null) {
                        user.photo.photo_id = tLRPC$TL_photos_photo.photo.id;
                        userConfig.setCurrentUser(user);
                        userConfig.saveConfig(true);
                    }
                }
            }
        }

        public void lambda$onItemClick$15() {
            if (PhotoViewer.this.menuItem == null) {
                return;
            }
            PhotoViewer.this.menuItem.hideSubItem(16);
        }

        public void lambda$onItemClick$16() {
            PhotoViewer.this.menuItem.hideSubItem(21);
            PhotoViewer.this.menuItem.showSubItem(22);
        }

        public void lambda$onItemClick$18() {
            PhotoViewer.this.menuItem.showSubItem(21);
            PhotoViewer.this.menuItem.hideSubItem(22);
        }

        @Override
        public boolean canOpenMenu() {
            if (PhotoViewer.this.currentMessageObject == null && PhotoViewer.this.currentSecureDocument == null) {
                if (PhotoViewer.this.currentFileLocationVideo == null) {
                    return PhotoViewer.this.pageBlocksAdapter != null;
                }
                File pathToAttach = FileLoader.getInstance(PhotoViewer.this.currentAccount).getPathToAttach(PhotoViewer.getFileLocation(PhotoViewer.this.currentFileLocationVideo), PhotoViewer.getFileLocationExt(PhotoViewer.this.currentFileLocationVideo), PhotoViewer.this.avatarsDialogId != 0 || PhotoViewer.this.isEvent);
                return pathToAttach.exists() || new File(FileLoader.getDirectory(4), pathToAttach.getName()).exists();
            }
            return true;
        }
    }

    public void lambda$setParentActivity$7(Boolean bool) {
        checkProgress(0, false, false);
    }

    public void lambda$setParentActivity$8(View view) {
        Activity activity = this.parentActivity;
        if (activity == null) {
            return;
        }
        this.wasRotated = false;
        this.fullscreenedByButton = 1;
        if (this.prevOrientation == -10) {
            this.prevOrientation = activity.getRequestedOrientation();
        }
        if (((WindowManager) this.parentActivity.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
            this.parentActivity.setRequestedOrientation(8);
        } else {
            this.parentActivity.setRequestedOrientation(0);
        }
        toggleActionBar(false, false);
    }

    public View lambda$setParentActivity$9() {
        return new CaptionTextView(this.activityContext, this.captionScrollView, this.textSelectionHelper, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                PhotoViewer.this.onLinkClick((ClickableSpan) obj, (TextView) obj2);
            }
        }, new Utilities.Callback3() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3) {
                PhotoViewer.this.onLinkLongPress((URLSpan) obj, (TextView) obj2, (Runnable) obj3);
            }
        });
    }

    public void lambda$setParentActivity$10(View view) {
        this.selectedCompression = this.previousCompression;
        didChangedCompressionLevel(false);
        showQualityView(false);
        requestVideoPreview(2);
    }

    public void lambda$setParentActivity$11(View view) {
        Object obj = this.imagesArrLocals.get(this.currentIndex);
        if (obj instanceof MediaController.MediaEditState) {
            ((MediaController.MediaEditState) obj).editedInfo = getCurrentVideoEditedInfo();
        }
        showQualityView(false);
        requestVideoPreview(2);
    }

    public void lambda$setParentActivity$12(View view) {
        sendPressed(false, 0);
    }

    public class AnonymousClass27 implements VideoTimelinePlayView.VideoTimelineViewDelegate {
        private int seekTo;
        private Runnable seekToRunnable;
        private boolean wasPlaying;

        AnonymousClass27() {
            PhotoViewer.this = r1;
        }

        @Override
        public void onLeftProgressChanged(float f) {
            if (PhotoViewer.this.videoPlayer == null) {
                return;
            }
            if (PhotoViewer.this.videoPlayer.isPlaying()) {
                PhotoViewer.this.manuallyPaused = false;
                PhotoViewer.this.videoPlayer.pause();
                PhotoViewer.this.containerView.invalidate();
            }
            updateAvatarStartTime(1);
            seekTo(f);
            PhotoViewer.this.videoPlayerSeekbar.setProgress(0.0f);
            PhotoViewer.this.videoTimelineView.setProgress(f);
            PhotoViewer.this.updateVideoInfo();
        }

        @Override
        public void onRightProgressChanged(float f) {
            if (PhotoViewer.this.videoPlayer == null) {
                return;
            }
            if (PhotoViewer.this.videoPlayer.isPlaying()) {
                PhotoViewer.this.manuallyPaused = false;
                PhotoViewer.this.videoPlayer.pause();
                PhotoViewer.this.containerView.invalidate();
            }
            updateAvatarStartTime(2);
            seekTo(f);
            PhotoViewer.this.videoPlayerSeekbar.setProgress(1.0f);
            PhotoViewer.this.videoTimelineView.setProgress(f);
            PhotoViewer.this.updateVideoInfo();
        }

        @Override
        public void onPlayProgressChanged(float f) {
            if (PhotoViewer.this.videoPlayer == null) {
                return;
            }
            if (PhotoViewer.this.sendPhotoType == 1) {
                updateAvatarStartTime(0);
            }
            seekTo(f);
        }

        private void seekTo(float f) {
            this.seekTo = (int) (PhotoViewer.this.videoDuration * f);
            if (SharedConfig.getDevicePerformanceClass() == 2) {
                PhotoViewer.this.seekVideoOrWebTo(this.seekTo);
                if (PhotoViewer.this.sendPhotoType == 1) {
                    PhotoViewer.this.needCaptureFrameReadyAtTime = this.seekTo;
                    if (PhotoViewer.this.captureFrameReadyAtTime != PhotoViewer.this.needCaptureFrameReadyAtTime) {
                        PhotoViewer.this.captureFrameReadyAtTime = -1L;
                    }
                }
                this.seekToRunnable = null;
            } else if (this.seekToRunnable == null) {
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        PhotoViewer.AnonymousClass27.this.lambda$seekTo$0();
                    }
                };
                this.seekToRunnable = runnable;
                AndroidUtilities.runOnUIThread(runnable, 100L);
            }
        }

        public void lambda$seekTo$0() {
            PhotoViewer.this.seekVideoOrWebTo(this.seekTo);
            if (PhotoViewer.this.sendPhotoType == 1) {
                PhotoViewer.this.needCaptureFrameReadyAtTime = this.seekTo;
                if (PhotoViewer.this.captureFrameReadyAtTime != PhotoViewer.this.needCaptureFrameReadyAtTime) {
                    PhotoViewer.this.captureFrameReadyAtTime = -1L;
                }
            }
            this.seekToRunnable = null;
        }

        private void updateAvatarStartTime(int i) {
            if (PhotoViewer.this.sendPhotoType != 1) {
                return;
            }
            if (i != 0) {
                if (PhotoViewer.this.photoCropView != null) {
                    if (PhotoViewer.this.videoTimelineView.getLeftProgress() > PhotoViewer.this.avatarStartProgress || PhotoViewer.this.videoTimelineView.getRightProgress() < PhotoViewer.this.avatarStartProgress) {
                        PhotoViewer.this.photoCropView.setVideoThumbVisible(false);
                        if (i == 1) {
                            PhotoViewer photoViewer = PhotoViewer.this;
                            photoViewer.avatarStartTime = photoViewer.videoDuration * 1000.0f * PhotoViewer.this.videoTimelineView.getLeftProgress();
                        } else {
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            photoViewer2.avatarStartTime = photoViewer2.videoDuration * 1000.0f * PhotoViewer.this.videoTimelineView.getRightProgress();
                        }
                        PhotoViewer.this.captureFrameAtTime = -1L;
                        return;
                    }
                    return;
                }
                return;
            }
            PhotoViewer photoViewer3 = PhotoViewer.this;
            photoViewer3.avatarStartProgress = photoViewer3.videoTimelineView.getProgress();
            PhotoViewer photoViewer4 = PhotoViewer.this;
            photoViewer4.avatarStartTime = photoViewer4.videoDuration * 1000.0f * PhotoViewer.this.avatarStartProgress;
        }

        @Override
        public void didStartDragging(int i) {
            if (i == VideoTimelinePlayView.TYPE_PROGRESS) {
                PhotoViewer.this.cancelVideoPlayRunnable();
                if (PhotoViewer.this.sendPhotoType == 1) {
                    PhotoViewer.this.cancelFlashAnimations();
                    PhotoViewer.this.captureFrameAtTime = -1L;
                }
                boolean isVideoPlaying = PhotoViewer.this.isVideoPlaying();
                this.wasPlaying = isVideoPlaying;
                if (isVideoPlaying) {
                    PhotoViewer.this.manuallyPaused = false;
                    PhotoViewer.this.pauseVideoOrWeb();
                    PhotoViewer.this.containerView.invalidate();
                }
            }
        }

        @Override
        public void didStopDragging(int i) {
            Runnable runnable = this.seekToRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.seekToRunnable.run();
            }
            PhotoViewer.this.cancelVideoPlayRunnable();
            if (PhotoViewer.this.sendPhotoType != 1 || PhotoViewer.this.flashView == null || i != VideoTimelinePlayView.TYPE_PROGRESS) {
                if (PhotoViewer.this.sendPhotoType == 1 || this.wasPlaying) {
                    PhotoViewer.this.manuallyPaused = false;
                    PhotoViewer.this.playVideoOrWeb();
                    return;
                }
                return;
            }
            PhotoViewer.this.cancelFlashAnimations();
            PhotoViewer photoViewer = PhotoViewer.this;
            photoViewer.captureFrameAtTime = photoViewer.avatarStartTime;
            if (PhotoViewer.this.captureFrameReadyAtTime == this.seekTo) {
                PhotoViewer.this.captureCurrentFrame();
            }
        }
    }

    public void lambda$setParentActivity$13(Integer num) {
        Object obj = this.imagesArrLocals.get(this.currentIndex);
        if (obj instanceof MediaController.PhotoEntry) {
            ((MediaController.PhotoEntry) obj).ttl = num.intValue();
        } else if (obj instanceof MediaController.SearchImage) {
            ((MediaController.SearchImage) obj).ttl = num.intValue();
        }
        if (num.intValue() == 0 || this.placeProvider.isPhotoChecked(this.currentIndex)) {
            return;
        }
        setPhotoChecked();
    }

    public void lambda$setParentActivity$14(Integer num) {
        FrameLayout frameLayout = this.videoTimelineViewContainer;
        if (frameLayout != null && frameLayout.getVisibility() != 8) {
            this.videoTimelineViewContainer.setTranslationY(this.pickerView.getTranslationY() - Math.max(0, this.captionEdit.getEditTextHeight() - AndroidUtilities.dp(46.0f)));
        }
        this.muteItem.setTranslationY(-Math.max(0, num.intValue() - AndroidUtilities.dp(46.0f)));
    }

    public void lambda$setParentActivity$15(View view) {
        if (this.placeProvider == null || isCaptionOpen()) {
            return;
        }
        this.placeProvider.needAddMorePhotos();
        closePhoto(true, false);
    }

    public void lambda$setParentActivity$21(View view) {
        int i;
        if (this.stickerEmpty || this.cutOutBtn.isLoading() || this.cutOutBtn.isUndoCutState() || (i = this.currentIndex) < 0 || i >= this.imagesArrLocals.size() || this.stickerMakerView.isThanosInProgress) {
            return;
        }
        final MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) this.imagesArrLocals.get(this.currentIndex);
        final boolean z = !TextUtils.isEmpty(mediaEditState.filterPath);
        if (this.cutOutBtn.isCutOutState()) {
            this.cutOutBtn.setCancelState(true);
            this.stickerMakerView.enableClippingMode(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    PhotoViewer.this.lambda$setParentActivity$20(z, mediaEditState, (StickerMakerView.SegmentedObject) obj);
                }
            });
            this.containerView.invalidate();
        } else if (this.cutOutBtn.isCancelState()) {
            this.cutOutBtn.setCutOutState(true);
            showEditStickerMode(false, true);
            this.stickerMakerView.disableClippingMode();
            this.containerView.invalidate();
        } else {
            this.stickerMakerView.resetPaths();
            this.stickerMakerView.getThanosEffect();
            this.stickerMakerView.setSegmentedState(false, null);
            this.centerImage.setImageBitmap(this.stickerMakerView.getSourceBitmap(z));
            this.cutOutBtn.setCutOutState(true);
            showEditStickerMode(false, true);
            applyCurrentEditMode();
        }
    }

    public void lambda$setParentActivity$20(boolean z, MediaController.MediaEditState mediaEditState, StickerMakerView.SegmentedObject segmentedObject) {
        float f;
        float f2;
        float f3;
        if (this.stickerMakerView.hasSegmentedBitmap()) {
            ThanosEffect thanosEffect = this.stickerMakerView.getThanosEffect();
            this.stickerMakerView.setSegmentedState(true, segmentedObject);
            final Bitmap segmentedImage = this.stickerMakerView.getSegmentedImage(this.centerImage.getBitmap(), z, this.centerImage.getOrientation());
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.imagesArrLocals.get(this.currentIndex);
            if (thanosEffect == null) {
                this.centerImage.setImageBitmap(segmentedImage);
                this.cutOutBtn.setUndoCutState(true);
                showStickerMode(true, true);
                this.cutOutBtn.post(new PhotoViewer$$ExternalSyntheticLambda75(this));
                return;
            }
            Bitmap thanosImage = this.stickerMakerView.getThanosImage(photoEntry, this.centerImage.getOrientation());
            if (thanosImage == null) {
                this.centerImage.setImageBitmap(segmentedImage);
                this.cutOutBtn.setUndoCutState(true);
                showStickerMode(true, true);
                this.cutOutBtn.post(new PhotoViewer$$ExternalSyntheticLambda75(this));
                return;
            }
            MediaController.CropState cropState = mediaEditState.cropState;
            if (cropState != null) {
                thanosImage = createCroppedBitmap(thanosImage, cropState, new int[]{this.centerImage.getOrientation(), this.centerImage.getInvert()}, true);
            }
            if (thanosImage == null) {
                this.centerImage.setImageBitmap(segmentedImage);
                this.cutOutBtn.setUndoCutState(true);
                showEditStickerMode(true, true);
                this.cutOutBtn.post(new PhotoViewer$$ExternalSyntheticLambda75(this));
                return;
            }
            Matrix matrix = new Matrix();
            int width = thanosImage.getWidth();
            int height = thanosImage.getHeight();
            if (!photoEntry.isCropped && (this.centerImage.getOrientation() / 90) % 2 != 0) {
                width = thanosImage.getHeight();
                height = thanosImage.getWidth();
            }
            float f4 = width;
            float f5 = height;
            float min = Math.min(getContainerViewWidth() / f4, getContainerViewHeight() / f5);
            float f6 = f4 * min;
            float f7 = f5 * min;
            float f8 = 0.0f;
            if ((this.centerImage.getOrientation() == 0 || photoEntry.isCropped) && this.rotate == 0.0f) {
                f = f6;
                f2 = f7;
                f3 = 0.0f;
            } else {
                float width2 = thanosImage.getWidth();
                float height2 = thanosImage.getHeight();
                float f9 = width2 / 2.0f;
                float f10 = height2 / 2.0f;
                float sqrt = (float) Math.sqrt((f9 * f9) + (f10 * f10));
                float f11 = sqrt * 2.0f;
                int i = (int) f11;
                Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.rotate((photoEntry.isCropped ? 0 : this.centerImage.getOrientation()) + this.rotate, sqrt, sqrt);
                canvas.drawBitmap(thanosImage, (f11 - width2) / 2.0f, (f11 - height2) / 2.0f, (Paint) null);
                thanosImage.recycle();
                float f12 = f6 / 2.0f;
                float f13 = f7 / 2.0f;
                f = ((float) Math.sqrt((f12 * f12) + (f13 * f13))) * 2.0f;
                f8 = (-(f - f6)) / 2.0f;
                f3 = (-(f - f7)) / 2.0f;
                thanosImage = createBitmap;
                f2 = f;
            }
            matrix.postScale(f, f2);
            float f14 = this.scale;
            matrix.postScale(f14, f14, f / 2.0f, f2 / 2.0f);
            matrix.postTranslate(this.translationX + f8 + Math.max(0, (int) ((getContainerViewWidth() - f6) / 2.0f)), this.translationY + f3 + Math.max(0, (int) ((getContainerViewHeight() - f7) / 2.0f)));
            this.stickerMakerView.isThanosInProgress = true;
            Utilities.themeQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.this.lambda$setParentActivity$16(segmentedImage);
                }
            });
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.this.lambda$setParentActivity$17();
                }
            };
            thanosEffect.animate(matrix, thanosImage, new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.this.lambda$setParentActivity$18(segmentedImage, runnable);
                }
            }, new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.lambda$setParentActivity$19();
                }
            });
            AndroidUtilities.runOnUIThread(runnable, 1200L);
        } else {
            this.cutOutBtn.setCutOutState(true);
            showEditStickerMode(false, true);
        }
        this.stickerMakerView.disableClippingMode();
        this.containerView.invalidate();
    }

    public void lambda$setParentActivity$17() {
        this.stickerMakerView.isThanosInProgress = false;
    }

    public void lambda$setParentActivity$18(Bitmap bitmap, Runnable runnable) {
        this.centerImage.setImageBitmap(bitmap);
        this.cutOutBtn.setUndoCutState(true);
        showStickerMode(true, true);
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 800L);
    }

    public void lambda$setParentActivity$22(View view) {
        this.eraseBtn.setActive(true, true);
        this.restoreBtn.setActive(false, true);
        StickerMakerView stickerMakerView = this.stickerMakerView;
        if (stickerMakerView != null) {
            stickerMakerView.setOutlineVisible(false);
        }
        this.maskPaintViewEraser = true;
        MaskPaintView maskPaintView = this.maskPaintView;
        if (maskPaintView != null) {
            maskPaintView.setEraser(true);
        }
        switchToEditMode(4);
    }

    public void lambda$setParentActivity$23(View view) {
        this.eraseBtn.setActive(false, true);
        this.restoreBtn.setActive(true, true);
        StickerMakerView stickerMakerView = this.stickerMakerView;
        if (stickerMakerView != null) {
            stickerMakerView.setOutlineVisible(false);
        }
        this.maskPaintViewEraser = false;
        MaskPaintView maskPaintView = this.maskPaintView;
        if (maskPaintView != null) {
            maskPaintView.setEraser(false);
        }
        switchToEditMode(4);
    }

    public void lambda$setParentActivity$24(View view) {
        MaskPaintView maskPaintView = this.maskPaintView;
        if (maskPaintView == null || !maskPaintView.undo()) {
            switchToEditMode(0);
            this.stickerMakerView.resetPaths();
            boolean z = !TextUtils.isEmpty(((MediaController.MediaEditState) this.imagesArrLocals.get(this.currentIndex)).filterPath);
            StickerMakerView stickerMakerView = this.stickerMakerView;
            if (stickerMakerView != null && !stickerMakerView.empty) {
                stickerMakerView.setSegmentedState(false, null);
            }
            this.centerImage.setImageBitmap(this.stickerMakerView.getSourceBitmap(z));
            StickerMakerView stickerMakerView2 = this.stickerMakerView;
            if (stickerMakerView2 == null || !stickerMakerView2.empty) {
                this.cutOutBtn.setCutOutState(true);
            }
            showStickerMode(true, true);
        }
    }

    public void lambda$setParentActivity$25(View view) {
        if (this.stickerMakerView != null) {
            BlurButton blurButton = this.outlineBtn;
            boolean z = true;
            blurButton.setActive(!blurButton.isActive(), true);
            this.stickerMakerView.setOutlineVisible((!this.outlineBtn.isActive() || this.eraseBtn.isActive() || this.restoreBtn.isActive()) ? false : false);
        }
    }

    public void lambda$setParentActivity$26(View view) {
        if (this.captionEdit.isCaptionOverLimit()) {
            AnimatedTextView animatedTextView = this.captionEdit.limitTextView;
            float f = -this.shiftDp;
            this.shiftDp = f;
            AndroidUtilities.shakeViewSpring(animatedTextView, f);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || MessagesController.getInstance(this.currentAccount).captionLengthLimitPremium <= this.captionEdit.getCodePointCount()) {
                return;
            }
            showCaptionLimitBulletin(this.containerView);
            return;
        }
        ChatActivity chatActivity = this.parentChatActivity;
        if (chatActivity != null && chatActivity.isInScheduleMode() && !this.parentChatActivity.isEditingMessageMedia()) {
            showScheduleDatePickerDialog();
        } else {
            sendPressed(true, 0);
        }
    }

    public boolean lambda$setParentActivity$30(org.telegram.ui.ActionBar.Theme.ResourcesProvider r17, android.view.View r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.lambda$setParentActivity$30(org.telegram.ui.ActionBar.Theme$ResourcesProvider, android.view.View):boolean");
    }

    public boolean lambda$setParentActivity$27(View view, MotionEvent motionEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (motionEvent.getActionMasked() == 0 && (actionBarPopupWindow = this.sendPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            view.getHitRect(this.hitRect);
            if (this.hitRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
            this.sendPopupWindow.dismiss();
            return false;
        }
        return false;
    }

    public void lambda$setParentActivity$28(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.sendPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
    }

    public void lambda$setParentActivity$29(int i, View view) {
        ActionBarPopupWindow actionBarPopupWindow = this.sendPopupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
        if (i == 0) {
            showScheduleDatePickerDialog();
        } else if (i == 1) {
            sendPressed(false, 0);
        } else if (i == 2) {
            replacePressed();
        } else if (i == 3) {
            sendPressed(true, 0);
        } else if (i == 4) {
            sendPressed(true, 0, false, true, false);
        }
    }

    public void lambda$setParentActivity$31(View view) {
        cancelStickerClippingMode();
        if (isCaptionOpen()) {
            return;
        }
        if (this.isCurrentVideo) {
            if (!this.videoConvertSupported) {
                return;
            }
            TextureView textureView = this.videoTextureView;
            if (!(textureView instanceof VideoEditTextureView)) {
                return;
            }
            VideoEditTextureView videoEditTextureView = (VideoEditTextureView) textureView;
            if (videoEditTextureView.getVideoWidth() <= 0 || videoEditTextureView.getVideoHeight() <= 0) {
                return;
            }
        }
        switchToEditMode(1);
    }

    public void lambda$setParentActivity$32(View view) {
        cropRotate(-90.0f);
    }

    public void lambda$setParentActivity$33(View view) {
        cropMirror();
    }

    public void lambda$setParentActivity$34(View view) {
        cancelStickerClippingMode();
        if (isCaptionOpen()) {
            return;
        }
        if (this.isCurrentVideo) {
            if (!this.videoConvertSupported) {
                return;
            }
            TextureView textureView = this.videoTextureView;
            if (!(textureView instanceof VideoEditTextureView)) {
                return;
            }
            VideoEditTextureView videoEditTextureView = (VideoEditTextureView) textureView;
            if (videoEditTextureView.getVideoWidth() <= 0 || videoEditTextureView.getVideoHeight() <= 0) {
                return;
            }
        }
        switchToEditMode(3);
    }

    public void lambda$setParentActivity$35(View view) {
        if (isCaptionOpen()) {
            return;
        }
        this.muteVideo = !this.muteVideo;
        updateMuteButton();
        updateVideoInfo();
        if (this.muteVideo && !this.checkImageView.isChecked()) {
            this.checkImageView.callOnClick();
            return;
        }
        Object obj = this.imagesArrLocals.get(this.currentIndex);
        if (obj instanceof MediaController.MediaEditState) {
            ((MediaController.MediaEditState) obj).editedInfo = getCurrentVideoEditedInfo();
        }
    }

    public void lambda$setParentActivity$36(Activity activity, View view) {
        if (isCaptionOpen() || this.muteVideo) {
            return;
        }
        if (this.compressItem.getTag() == null) {
            if (this.videoConvertSupported) {
                if (this.tooltip == null) {
                    this.tooltip = new Tooltip(activity, this.containerView, -871296751, -1);
                }
                this.tooltip.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                this.tooltip.show(this.compressItem);
                return;
            }
            return;
        }
        showQualityView(true);
        requestVideoPreview(1);
    }

    public void lambda$setParentActivity$37(View view) {
        if (view.getAlpha() < 0.9f) {
            return;
        }
        cancelStickerClippingMode();
        if (isCaptionOpen()) {
            return;
        }
        if (this.isCurrentVideo) {
            if (!this.videoConvertSupported) {
                return;
            }
            TextureView textureView = this.videoTextureView;
            if (!(textureView instanceof VideoEditTextureView)) {
                return;
            }
            VideoEditTextureView videoEditTextureView = (VideoEditTextureView) textureView;
            if (videoEditTextureView.getVideoWidth() <= 0 || videoEditTextureView.getVideoHeight() <= 0) {
                return;
            }
        }
        switchToEditMode(2);
    }

    public void lambda$setParentActivity$39(View view) {
        if (this.imageMoveAnimation != null) {
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                PhotoViewer.this.lambda$setParentActivity$38();
            }
        };
        if (!this.previousHasTransform) {
            float stateOrientation = this.previousCropOrientation - this.photoCropView.cropView.getStateOrientation();
            if (Math.abs(stateOrientation) > 180.0f) {
                stateOrientation = stateOrientation < 0.0f ? stateOrientation + 360.0f : -(360.0f - stateOrientation);
            }
            cropRotate(stateOrientation, this.photoCropView.cropView.getStateMirror(), runnable);
            return;
        }
        runnable.run();
    }

    public void lambda$setParentActivity$38() {
        this.cropTransform.setViewTransform(this.previousHasTransform, this.previousCropPx, this.previousCropPy, this.previousCropRotation, this.previousCropOrientation, this.previousCropScale, scale1(), scale1(), this.previousCropPw, this.previousCropPh, 0.0f, 0.0f, this.previousCropMirrored);
        switchToEditMode(0);
    }

    public void lambda$setParentActivity$40(View view) {
        if (this.currentEditMode != 1 || this.photoCropView.isReady()) {
            applyCurrentEditMode();
            switchToEditMode(0);
        }
    }

    public void lambda$setParentActivity$42(View view) {
        float f = -this.photoCropView.cropView.getStateOrientation();
        if (Math.abs(f) > 180.0f) {
            f = f < 0.0f ? f + 360.0f : -(360.0f - f);
        }
        cropRotate(f, this.photoCropView.cropView.getStateMirror(), new Runnable() {
            @Override
            public final void run() {
                PhotoViewer.this.lambda$setParentActivity$41();
            }
        });
    }

    public void lambda$setParentActivity$41() {
        this.photoCropView.reset(true);
    }

    public void lambda$setParentActivity$43(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        PhotoViewerProvider photoViewerProvider;
        int i;
        Bitmap bitmap;
        int i2;
        if (imageReceiver == this.centerImage && z && !z2) {
            if (!this.isCurrentVideo && ((this.currentEditMode == 1 || (i2 = this.sendPhotoType) == 1 || i2 == 11) && this.photoCropView != null && (bitmap = imageReceiver.getBitmap()) != null)) {
                PhotoCropView photoCropView = this.photoCropView;
                int orientation = imageReceiver.getOrientation();
                int i3 = this.sendPhotoType;
                photoCropView.setBitmap(bitmap, orientation, (i3 == 1 || i3 == 11) ? false : true, true, this.paintingOverlay, this.cropTransform, null, null);
            }
            if (this.paintingOverlay.getVisibility() == 0) {
                this.containerView.requestLayout();
            }
            detectFaces();
        }
        if (imageReceiver != this.centerImage || !z || (photoViewerProvider = this.placeProvider) == null || !photoViewerProvider.scaleToFill() || this.ignoreDidSetImage || (i = this.sendPhotoType) == 1 || i == 11) {
            return;
        }
        if (!this.wasLayout) {
            this.dontResetZoomOnFirstLayout = true;
        } else {
            setScaleToFill();
        }
    }

    public void lambda$setParentActivity$44(View view) {
        if (isCaptionOpen()) {
            return;
        }
        setPhotoChecked();
    }

    public void lambda$setParentActivity$45(View view) {
        PhotoViewerProvider photoViewerProvider;
        if (isCaptionOpen() || (photoViewerProvider = this.placeProvider) == null || photoViewerProvider.getSelectedPhotosOrder() == null || this.placeProvider.getSelectedPhotosOrder().isEmpty()) {
            return;
        }
        togglePhotosListView(!this.isPhotosListViewVisible, true);
    }

    public void lambda$setParentActivity$46(View view, int i) {
        int i2;
        if (!this.imagesArrLocals.isEmpty() && (i2 = this.currentIndex) >= 0 && i2 < this.imagesArrLocals.size()) {
            Object obj = this.imagesArrLocals.get(this.currentIndex);
            if (obj instanceof MediaController.MediaEditState) {
                ((MediaController.MediaEditState) obj).editedInfo = getCurrentVideoEditedInfo();
            }
        }
        this.ignoreDidSetImage = true;
        int indexOf = this.imagesArrLocals.indexOf(view.getTag());
        if (indexOf >= 0) {
            this.currentIndex = -1;
            setImageIndex(indexOf);
        }
        this.ignoreDidSetImage = false;
    }

    public boolean showCaptionLimitBulletin(FrameLayout frameLayout) {
        BaseFragment baseFragment = this.parentFragment;
        if ((baseFragment instanceof ChatActivity) && ChatObject.isChannelAndNotMegaGroup(((ChatActivity) baseFragment).getCurrentChat())) {
            this.limitBulletin = BulletinFactory.of(frameLayout, this.resourcesProvider).createCaptionLimitBulletin(MessagesController.getInstance(this.currentAccount).captionLengthLimitPremium, new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.this.lambda$showCaptionLimitBulletin$47();
                }
            }).setOnHideListener(new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.this.lambda$showCaptionLimitBulletin$48();
                }
            }).show();
            return true;
        }
        return false;
    }

    public void lambda$showCaptionLimitBulletin$47() {
        closePhoto(false, false);
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert != null) {
            chatAttachAlert.dismiss(true);
        }
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment != null) {
            baseFragment.presentFragment(new PremiumPreviewFragment("caption_limit"));
        }
    }

    public void lambda$showCaptionLimitBulletin$48() {
        this.limitBulletin = null;
    }

    private void showScheduleDatePickerDialog() {
        if (this.parentChatActivity == null) {
            return;
        }
        AlertsCreator.createScheduleDatePickerDialog(this.parentActivity, this.parentChatActivity.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
            @Override
            public final void didSelectDate(boolean z, int i) {
                PhotoViewer.this.sendPressed(z, i);
            }
        }, new AlertsCreator.ScheduleDatePickerColors(-1, -14342875, -1, 520093695, -1, -115203550, 620756991));
    }

    public void sendPressed(boolean z, int i) {
        sendPressed(z, i, false, false, false);
    }

    private void replacePressed() {
        sendPressed(false, 0, true, false, false);
    }

    private void sendPressed(final boolean z, final int i, final boolean z2, final boolean z3, boolean z4) {
        Bitmap bitmap;
        VideoEditedInfo videoEditedInfo;
        String str;
        Object obj;
        MediaController.CropState cropState;
        int i2;
        ChatActivity chatActivity;
        ImageUpdater.AvatarFor avatarFor;
        String str2;
        String string;
        TextureView textureView;
        if (isCaptionOpen() || this.placeProvider == null || this.doneButtonPressed) {
            return;
        }
        char c = 1;
        if (this.sendPhotoType == 1) {
            if (!z4 && (avatarFor = this.setAvatarFor) != null) {
                long j = 0;
                TLObject tLObject = avatarFor.object;
                if (tLObject instanceof TLRPC$User) {
                    String str3 = ((TLRPC$User) tLObject).first_name;
                    long j2 = ((TLRPC$User) tLObject).id;
                    str2 = str3;
                    j = j2;
                } else {
                    str2 = "";
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(this.containerView.getContext());
                builder.setAdditionalHorizontalPadding(AndroidUtilities.dp(8.0f));
                SuggestUserPhotoView suggestUserPhotoView = new SuggestUserPhotoView(this.containerView.getContext());
                suggestUserPhotoView.setImages(this.setAvatarFor.object, this.containerView, this.photoCropView);
                builder.setTopView(suggestUserPhotoView);
                if (this.setAvatarFor.type == 1) {
                    if (UserConfig.getInstance(this.currentAccount).clientUserId == j) {
                        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString("SetUserPhotoSelfAlertMessage", R.string.SetUserPhotoSelfAlertMessage)));
                    } else {
                        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("SetUserPhotoAlertMessage", R.string.SetUserPhotoAlertMessage, str2, str2)));
                    }
                    if (this.centerImageIsVideo) {
                        string = LocaleController.getString("SetVideo", R.string.SetVideo);
                    } else {
                        string = LocaleController.getString("SetPhoto", R.string.SetPhoto);
                    }
                } else {
                    if (this.centerImageIsVideo) {
                        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("SuggestVideoAlertMessage", R.string.SuggestVideoAlertMessage, str2)));
                    } else {
                        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("SuggestPhotoAlertMessage", R.string.SuggestPhotoAlertMessage, str2)));
                    }
                    string = LocaleController.getString("SuggestPhotoShort", R.string.SuggestPhotoShort);
                }
                builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        PhotoViewer.lambda$sendPressed$50(dialogInterface, i3);
                    }
                });
                builder.setPositiveButton(string, new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        PhotoViewer.this.lambda$sendPressed$51(z, i, z2, z3, dialogInterface, i3);
                    }
                });
                builder.setDialogButtonColorKey(Theme.key_voipgroup_listeningText);
                AlertDialog create = builder.create();
                create.setBlurParams(0.8f, false, true);
                create.setBackgroundColor(ColorUtils.setAlphaComponent(-15461356, 204));
                create.show();
                create.setTextColor(Theme.getColor(Theme.key_voipgroup_nameText));
                create.setOnDismissListener(new AnonymousClass34());
                if (!this.isCurrentVideo || (textureView = this.videoTextureView) == null) {
                    return;
                }
                try {
                    this.lastFrameBitmap = textureView.getBitmap();
                    ImageView imageView = this.lastFrameImageView;
                    if (imageView != null) {
                        this.aspectRatioFrameLayout.removeView(imageView);
                        this.lastFrameImageView = null;
                    }
                    ImageView imageView2 = new ImageView(this.videoTextureView.getContext());
                    this.lastFrameImageView = imageView2;
                    imageView2.setBackground(new BitmapDrawable(this.lastFrameBitmap));
                    this.aspectRatioFrameLayout.addView(this.lastFrameImageView);
                    return;
                } catch (Throwable th) {
                    Bitmap bitmap2 = this.currentBitmap;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        this.currentBitmap = null;
                    }
                    FileLog.e(th);
                    return;
                }
            }
            applyCurrentEditMode();
        }
        if (!z2 && (chatActivity = this.parentChatActivity) != null) {
            TLRPC$Chat currentChat = chatActivity.getCurrentChat();
            if (this.parentChatActivity.getCurrentUser() != null || ((ChatObject.isChannel(currentChat) && currentChat.megagroup) || !ChatObject.isChannel(currentChat))) {
                MessagesController.getNotificationsSettings(this.currentAccount).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + this.parentChatActivity.getDialogId(), !z).commit();
            }
        }
        VideoEditedInfo currentVideoEditedInfo = getCurrentVideoEditedInfo();
        if (!this.imagesArrLocals.isEmpty() && (i2 = this.currentIndex) >= 0 && i2 < this.imagesArrLocals.size()) {
            Object obj2 = this.imagesArrLocals.get(this.currentIndex);
            if (obj2 instanceof MediaController.MediaEditState) {
                ((MediaController.MediaEditState) obj2).editedInfo = currentVideoEditedInfo;
            }
        }
        ChatActivity chatActivity2 = this.parentChatActivity;
        if (chatActivity2 != null && chatActivity2.getCurrentChat() != null) {
            boolean z5 = this.isCurrentVideo || currentVideoEditedInfo != null;
            if (z5 && !ChatObject.canSendVideo(this.parentChatActivity.getCurrentChat())) {
                BulletinFactory.of(this.containerView, this.resourcesProvider).createErrorBulletin(LocaleController.getString(R.string.GlobalAttachVideoRestricted)).show();
                return;
            } else if (!z5 && !ChatObject.canSendPhoto(this.parentChatActivity.getCurrentChat())) {
                BulletinFactory.of(this.containerView, this.resourcesProvider).createErrorBulletin(LocaleController.getString(R.string.GlobalAttachPhotoRestricted)).show();
                return;
            }
        }
        this.doneButtonPressed = true;
        if (currentVideoEditedInfo != null) {
            long j3 = ((float) currentVideoEditedInfo.estimatedSize) * 0.9f;
            if ((j3 > FileLoader.DEFAULT_MAX_FILE_SIZE && !UserConfig.getInstance(this.currentAccount).isPremium()) || j3 > 4194304000L) {
                if (this.parentAlert != null) {
                    new LimitReachedBottomSheet(this.parentAlert.getBaseFragment(), this.parentAlert.getContainer().getContext(), 6, UserConfig.selectedAccount, null).show();
                    return;
                }
                return;
            }
        }
        if (!z2) {
            if (this.sendPhotoType == 11) {
                Object obj3 = this.imagesArrLocals.get(this.currentIndex);
                if (obj3 instanceof MediaController.PhotoEntry) {
                    final MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj3;
                    Bitmap createBitmap = Bitmap.createBitmap(LiteMode.FLAG_CALLS_ANIMATIONS, LiteMode.FLAG_CALLS_ANIMATIONS, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Path path = new Path();
                    RectF rectF = new RectF();
                    rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
                    int i3 = 8;
                    float width = createBitmap.getWidth() / 8;
                    path.addRoundRect(rectF, width, width, Path.Direction.CW);
                    canvas.clipPath(path);
                    int containerViewWidth = getContainerViewWidth();
                    getContainerViewHeight();
                    float dp = containerViewWidth - AndroidUtilities.dp(20.0f);
                    StickerMakerView stickerMakerView = this.stickerMakerView;
                    if (stickerMakerView != null && stickerMakerView.outlineVisible && stickerMakerView.getSourceBitmap() != null) {
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        canvas.scale(createBitmap.getWidth() / dp, createBitmap.getHeight() / dp);
                        applyTransformToOutline(canvas);
                        this.stickerMakerView.drawOutline(canvas, false, null, false);
                        canvas.restore();
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        canvas.scale(createBitmap.getWidth() / dp, createBitmap.getHeight() / dp);
                        applyTransformToOutline(canvas);
                        this.centerImage.draw(canvas);
                        canvas.restore();
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        canvas.scale(createBitmap.getWidth() / dp, createBitmap.getHeight() / dp);
                        applyTransformToOutline(canvas);
                        this.stickerMakerView.drawOutline(canvas, true, null, false);
                        canvas.restore();
                    } else {
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        canvas.scale(createBitmap.getWidth() / dp, createBitmap.getHeight() / dp);
                        applyTransformToOutline(canvas);
                        this.centerImage.draw(canvas);
                        canvas.restore();
                    }
                    if (this.paintingOverlay != null) {
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        canvas.scale(createBitmap.getWidth() / dp, createBitmap.getHeight() / dp);
                        applyTransformToOutline(canvas);
                        canvas.translate((-this.centerImage.getImageWidth()) / 2.0f, (-this.centerImage.getImageHeight()) / 2.0f);
                        canvas.scale(this.centerImage.getImageWidth() / this.paintingOverlay.getMeasuredWidth(), this.centerImage.getImageHeight() / this.paintingOverlay.getMeasuredHeight());
                        this.paintingOverlay.drawChildren = !hasAnimatedMediaEntities();
                        this.paintingOverlay.draw(canvas);
                        this.paintingOverlay.drawChildren = true;
                        canvas.restore();
                    }
                    if (hasAnimatedMediaEntities()) {
                        Matrix matrix = new Matrix();
                        matrix.reset();
                        float f = dp / 2.0f;
                        matrix.preTranslate(f, f);
                        applyTransformToMatrix(matrix);
                        matrix.preTranslate((-this.centerImage.getImageWidth()) / 2.0f, (-this.centerImage.getImageHeight()) / 2.0f);
                        matrix.preScale(this.centerImage.getImageWidth(), this.centerImage.getImageHeight());
                        ArrayList<VideoEditedInfo.MediaEntity> arrayList = new ArrayList<>();
                        Iterator<VideoEditedInfo.MediaEntity> it = photoEntry.mediaEntities.iterator();
                        String str4 = null;
                        while (it.hasNext()) {
                            VideoEditedInfo.MediaEntity copy = it.next().copy();
                            float f2 = copy.x;
                            float f3 = copy.y;
                            float f4 = copy.width;
                            float f5 = copy.height;
                            Iterator<VideoEditedInfo.MediaEntity> it2 = it;
                            float[] fArr = new float[i3];
                            fArr[0] = f2;
                            fArr[c] = f3;
                            float f6 = f4 + f2;
                            fArr[2] = f6;
                            fArr[3] = f3;
                            fArr[4] = f6;
                            float f7 = f3 + f5;
                            fArr[5] = f7;
                            fArr[6] = f2;
                            fArr[7] = f7;
                            matrix.mapPoints(fArr);
                            Bitmap bitmap3 = createBitmap;
                            copy.width = ((float) Math.sqrt(Math.pow(fArr[0] - fArr[2], 2.0d) + Math.pow(fArr[c] - fArr[3], 2.0d))) / dp;
                            float sqrt = ((float) Math.sqrt(Math.pow(fArr[0] - fArr[6], 2.0d) + Math.pow(fArr[1] - fArr[7], 2.0d))) / dp;
                            copy.height = sqrt;
                            copy.x = (((fArr[0] + fArr[4]) / 2.0f) / dp) - (copy.width / 2.0f);
                            copy.y = (((fArr[1] + fArr[5]) / 2.0f) / dp) - (sqrt / 2.0f);
                            copy.scale = 1.0f;
                            copy.customTextView = true;
                            if (photoEntry.isCropped && (cropState = photoEntry.cropState) != null) {
                                double d = copy.rotation;
                                double d2 = cropState.transformRotation / 180.0f;
                                Double.isNaN(d2);
                                Double.isNaN(d);
                                copy.rotation = (float) (d - (d2 * 3.141592653589793d));
                            }
                            double d3 = copy.rotation;
                            double d4 = this.rotate / 180.0f;
                            Double.isNaN(d4);
                            Double.isNaN(d3);
                            copy.rotation = (float) (d3 - (d4 * 3.141592653589793d));
                            arrayList.add(copy);
                            TLRPC$Document tLRPC$Document = copy.document;
                            if (tLRPC$Document == null || str4 != null) {
                                obj = null;
                            } else {
                                obj = null;
                                str4 = MessageObject.findAnimatedEmojiEmoticon(tLRPC$Document, null);
                            }
                            it = it2;
                            createBitmap = bitmap3;
                            c = 1;
                            i3 = 8;
                        }
                        bitmap = createBitmap;
                        VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                        videoEditedInfo2.isPhoto = true;
                        videoEditedInfo2.resultWidth = LiteMode.FLAG_CALLS_ANIMATIONS;
                        videoEditedInfo2.originalWidth = LiteMode.FLAG_CALLS_ANIMATIONS;
                        videoEditedInfo2.resultHeight = LiteMode.FLAG_CALLS_ANIMATIONS;
                        videoEditedInfo2.originalHeight = LiteMode.FLAG_CALLS_ANIMATIONS;
                        videoEditedInfo2.mediaEntities = arrayList;
                        long clamp = Utilities.clamp(photoEntry.averageDuration, 2999L, 800L);
                        videoEditedInfo2.estimatedDuration = clamp;
                        videoEditedInfo2.originalDuration = clamp;
                        videoEditedInfo2.bitrate = 200000;
                        videoEditedInfo2.framerate = 30;
                        videoEditedInfo2.isSticker = true;
                        videoEditedInfo2.estimatedSize = 262144L;
                        videoEditedInfo = videoEditedInfo2;
                        str = str4;
                    } else {
                        bitmap = createBitmap;
                        videoEditedInfo = null;
                        str = null;
                    }
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
                    float f8 = (float) LiteMode.FLAG_CALLS_ANIMATIONS;
                    final String file = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(ImageLoader.scaleAndSaveImage(bitmap, compressFormat, f8, f8, 100, false, 101, 101), "webp", true).toString();
                    if (videoEditedInfo != null) {
                        videoEditedInfo.originalPath = file;
                    }
                    if (this.selectedEmojis == null) {
                        this.selectedEmojis = new ArrayList<>();
                    }
                    if (this.selectedEmojis.isEmpty()) {
                        String str5 = this.stickerMakerView.detectedEmoji;
                        if (str5 != null && Emoji.getEmojiDrawable(str5) != null) {
                            this.selectedEmojis.add(this.stickerMakerView.detectedEmoji);
                        } else if (str != null) {
                            this.selectedEmojis.add(str);
                        } else {
                            this.selectedEmojis.add("👍");
                        }
                    }
                    this.doneButtonPressed = false;
                    final VideoEditedInfo videoEditedInfo3 = videoEditedInfo;
                    ContentPreviewViewer.getInstance().showCustomStickerActions(file, videoEditedInfo, this.stickerMakerView, this.selectedEmojis, new ContentPreviewViewer.ContentPreviewViewerDelegate() {
                        @Override
                        public boolean can() {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$can(this);
                        }

                        @Override
                        public boolean canDeleteSticker(TLRPC$Document tLRPC$Document2) {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canDeleteSticker(this, tLRPC$Document2);
                        }

                        @Override
                        public boolean canEditSticker() {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canEditSticker(this);
                        }

                        @Override
                        public boolean canSchedule() {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canSchedule(this);
                        }

                        @Override
                        public Boolean canSetAsStatus(TLRPC$Document tLRPC$Document2) {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canSetAsStatus(this, tLRPC$Document2);
                        }

                        @Override
                        public void copyEmoji(TLRPC$Document tLRPC$Document2) {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$copyEmoji(this, tLRPC$Document2);
                        }

                        @Override
                        public void deleteSticker(TLRPC$Document tLRPC$Document2) {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$deleteSticker(this, tLRPC$Document2);
                        }

                        @Override
                        public void editSticker(TLRPC$Document tLRPC$Document2) {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$editSticker(this, tLRPC$Document2);
                        }

                        @Override
                        public String getQuery(boolean z6) {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getQuery(this, z6);
                        }

                        @Override
                        public void gifAddedOrDeleted() {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$gifAddedOrDeleted(this);
                        }

                        @Override
                        public boolean isInScheduleMode() {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isInScheduleMode(this);
                        }

                        @Override
                        public boolean isPhotoEditor() {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isPhotoEditor(this);
                        }

                        @Override
                        public boolean isStickerEditor() {
                            return true;
                        }

                        @Override
                        public boolean needCopy(TLRPC$Document tLRPC$Document2) {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needCopy(this, tLRPC$Document2);
                        }

                        @Override
                        public boolean needMenu() {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needMenu(this);
                        }

                        @Override
                        public boolean needOpen() {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needOpen(this);
                        }

                        @Override
                        public boolean needRemove() {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needRemove(this);
                        }

                        @Override
                        public boolean needRemoveFromRecent(TLRPC$Document tLRPC$Document2) {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needRemoveFromRecent(this, tLRPC$Document2);
                        }

                        @Override
                        public boolean needSend(int i4) {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needSend(this, i4);
                        }

                        @Override
                        public void openSet(TLRPC$InputStickerSet tLRPC$InputStickerSet, boolean z6) {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$openSet(this, tLRPC$InputStickerSet, z6);
                        }

                        @Override
                        public void remove(SendMessagesHelper.ImportingSticker importingSticker) {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$remove(this, importingSticker);
                        }

                        @Override
                        public void removeFromRecent(TLRPC$Document tLRPC$Document2) {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$removeFromRecent(this, tLRPC$Document2);
                        }

                        @Override
                        public void resetTouch() {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$resetTouch(this);
                        }

                        @Override
                        public void sendEmoji(TLRPC$Document tLRPC$Document2) {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendEmoji(this, tLRPC$Document2);
                        }

                        @Override
                        public void sendGif(Object obj4, Object obj5, boolean z6, int i4) {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendGif(this, obj4, obj5, z6, i4);
                        }

                        @Override
                        public void sendSticker(TLRPC$Document tLRPC$Document2, String str6, Object obj4, boolean z6, int i4) {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendSticker(this, tLRPC$Document2, str6, obj4, z6, i4);
                        }

                        @Override
                        public void setAsEmojiStatus(TLRPC$Document tLRPC$Document2, Integer num) {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$setAsEmojiStatus(this, tLRPC$Document2, num);
                        }

                        {
                            PhotoViewer.this = this;
                        }

                        @Override
                        public void sendSticker() {
                            if (PhotoViewer.this.placeProvider == null) {
                                return;
                            }
                            PhotoViewer.this.stickerEmptySent = true;
                            generateThumb();
                            photoEntry.imagePath = file;
                            PhotoViewer.this.placeProvider.sendButtonPressed(PhotoViewer.this.currentIndex, videoEditedInfo3, z, i, z3);
                            NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.TRUE);
                        }

                        private void generateThumb() {
                            ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.getInstance();
                            if (photoEntry.thumbPath != null) {
                                try {
                                    new File(photoEntry.thumbPath).delete();
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                photoEntry.thumbPath = null;
                            }
                            Bitmap createBitmap2 = Bitmap.createBitmap(LiteMode.FLAG_CALLS_ANIMATIONS, LiteMode.FLAG_CALLS_ANIMATIONS, Bitmap.Config.ARGB_8888);
                            Canvas canvas2 = new Canvas(createBitmap2);
                            ImageReceiver imageReceiver = contentPreviewViewer.centerImage;
                            if (imageReceiver != null) {
                                imageReceiver.setAlpha(1.0f);
                                contentPreviewViewer.centerImage.setImageCoords(0.0f, 0.0f, createBitmap2.getWidth(), createBitmap2.getHeight());
                                contentPreviewViewer.centerImage.draw(canvas2);
                            }
                            if (contentPreviewViewer.paintingOverlay != null) {
                                canvas2.save();
                                canvas2.scale(createBitmap2.getWidth() / contentPreviewViewer.paintingOverlay.getWidth(), createBitmap2.getHeight() / contentPreviewViewer.paintingOverlay.getHeight());
                                contentPreviewViewer.paintingOverlay.setAlpha(1.0f);
                                Path path2 = new Path();
                                path2.rewind();
                                RectF rectF2 = AndroidUtilities.rectTmp;
                                rectF2.set(0.0f, 0.0f, contentPreviewViewer.paintingOverlay.getWidth(), contentPreviewViewer.paintingOverlay.getHeight());
                                path2.addRoundRect(rectF2, contentPreviewViewer.paintingOverlay.getWidth() / 8.0f, contentPreviewViewer.paintingOverlay.getHeight() / 8.0f, Path.Direction.CW);
                                canvas2.clipPath(path2);
                                contentPreviewViewer.paintingOverlay.draw(canvas2);
                                canvas2.restore();
                            }
                            TLRPC$PhotoSize scaleAndSaveImage = ImageLoader.scaleAndSaveImage(createBitmap2, PhotoViewer.this.getCompressFormat(), 512.0f, 512.0f, 83, false, 101, 101);
                            photoEntry.thumbPath = FileLoader.getInstance(PhotoViewer.this.currentAccount).getPathToAttach(scaleAndSaveImage, true).toString();
                        }

                        @Override
                        public void addToFavoriteSelected(String str6) {
                            PhotoViewer.this.stickerEmptySent = true;
                            generateThumb();
                            PhotoViewer.this.stickerMakerView.uploadStickerFile(file, videoEditedInfo3, str6, null, true, null, null, photoEntry.thumbPath, null, null);
                        }

                        @Override
                        public void stickerSetSelected(TLRPC$StickerSet tLRPC$StickerSet, String str6) {
                            PhotoViewer.this.stickerEmptySent = true;
                            generateThumb();
                            PhotoViewer photoViewer = PhotoViewer.this;
                            photoViewer.stickerMakerView.uploadStickerFile(file, videoEditedInfo3, str6, null, false, tLRPC$StickerSet, photoViewer.replacedSticker, photoEntry.thumbPath, null, null);
                        }

                        @Override
                        public void newStickerPackSelected(CharSequence charSequence, String str6, Utilities.Callback<Boolean> callback) {
                            PhotoViewer.this.stickerEmptySent = true;
                            generateThumb();
                            PhotoViewer.this.stickerMakerView.uploadStickerFile(file, videoEditedInfo3, str6, charSequence, false, null, null, photoEntry.thumbPath, callback, null);
                        }

                        @Override
                        public void setIntroSticker(String str6) {
                            PhotoViewer.this.stickerEmptySent = true;
                            generateThumb();
                            PhotoViewer photoViewer = PhotoViewer.this;
                            photoViewer.stickerMakerView.uploadStickerFile(file, videoEditedInfo3, str6, null, false, null, null, photoEntry.thumbPath, null, photoViewer.customStickerHandler);
                        }

                        @Override
                        public boolean isReplacedSticker() {
                            return PhotoViewer.this.replacedSticker != null;
                        }

                        @Override
                        public boolean isSettingIntroSticker() {
                            return PhotoViewer.this.customStickerHandler != null;
                        }

                        @Override
                        public long getDialogId() {
                            return PhotoViewer.this.currentDialogId;
                        }
                    });
                    return;
                }
            }
            this.placeProvider.sendButtonPressed(this.currentIndex, currentVideoEditedInfo, z, i, z3);
        } else {
            this.placeProvider.replaceButtonPressed(this.currentIndex, currentVideoEditedInfo);
        }
        if (this.closePhotoAfterSelect) {
            closePhoto(false, false);
        }
    }

    public void lambda$sendPressed$51(boolean z, int i, boolean z2, boolean z3, DialogInterface dialogInterface, int i2) {
        sendPressed(z, i, z2, z3, true);
    }

    public class AnonymousClass34 implements DialogInterface.OnDismissListener {
        AnonymousClass34() {
            PhotoViewer.this = r1;
        }

        @Override
        public void onDismiss(DialogInterface dialogInterface) {
            if (PhotoViewer.this.lastFrameImageView != null) {
                PhotoViewer.this.lastFrameImageView.animate().alpha(0.0f).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        PhotoViewer.AnonymousClass34.this.lambda$onDismiss$0();
                    }
                }).setDuration(150L).start();
            }
        }

        public void lambda$onDismiss$0() {
            if (PhotoViewer.this.lastFrameImageView == null || PhotoViewer.this.lastFrameImageView.getParent() == null) {
                return;
            }
            ((ViewGroup) PhotoViewer.this.lastFrameImageView.getParent()).removeView(PhotoViewer.this.lastFrameImageView);
            if (PhotoViewer.this.lastFrameBitmap != null) {
                if (PhotoViewer.this.lastFrameImageView != null) {
                    PhotoViewer.this.lastFrameImageView.setBackground(null);
                }
                AndroidUtilities.recycleBitmap(PhotoViewer.this.lastFrameBitmap);
                PhotoViewer.this.lastFrameBitmap = null;
            }
            PhotoViewer.this.lastFrameImageView = null;
        }
    }

    private String getTempFileAbsolutePath() {
        File directory = FileLoader.getDirectory(4);
        return new File(directory, SharedConfig.getLastLocalId() + "_temp.jpg").getAbsolutePath();
    }

    public Bitmap.CompressFormat getCompressFormat() {
        return this.sendPhotoType == 11 ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    public boolean isCaptionOpen() {
        CaptionPhotoViewer captionPhotoViewer = this.captionEdit;
        return captionPhotoViewer != null && (captionPhotoViewer.keyboardNotifier.keyboardVisible() || this.captionEdit.editText.isPopupShowing());
    }

    public void showShareAlert(ArrayList<MessageObject> arrayList) {
        boolean z;
        boolean z2;
        FrameLayoutDrawer frameLayoutDrawer = this.containerView;
        requestAdjustToNothing();
        ChatActivity chatActivity = this.parentChatActivity;
        if (chatActivity == null || chatActivity.getChatActivityEnterView() == null || this.parentChatActivity.getFragmentView() == null) {
            z = false;
        } else {
            if (this.parentChatActivity.getChatActivityEnterView().isKeyboardVisible()) {
                this.parentChatActivity.getChatActivityEnterView().showEmojiView();
                z2 = true;
            } else {
                z2 = false;
            }
            AndroidUtilities.setAdjustResizeToNothing(this.parentChatActivity.getParentActivity(), this.classGuid);
            this.parentChatActivity.getFragmentView().requestLayout();
            z = z2;
        }
        final AnonymousClass36 anonymousClass36 = new AnonymousClass36(this.parentActivity, this.parentChatActivity, arrayList, null, null, false, null, null, false, true, false, null, frameLayoutDrawer, z);
        anonymousClass36.setFocusable(false);
        anonymousClass36.getWindow().setSoftInputMode(48);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PhotoViewer.this.lambda$showShareAlert$52(anonymousClass36);
            }
        }, 250L);
        anonymousClass36.show();
    }

    public class AnonymousClass36 extends ShareAlert {
        final boolean val$finalOpenKeyboardOnShareAlertClose;
        final FrameLayout val$photoContainerView;

        AnonymousClass36(Context context, ChatActivity chatActivity, ArrayList arrayList, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3, boolean z4, Theme.ResourcesProvider resourcesProvider, FrameLayout frameLayout, boolean z5) {
            super(context, chatActivity, arrayList, str, str2, z, str3, str4, z2, z3, z4, resourcesProvider);
            PhotoViewer.this = r15;
            this.val$photoContainerView = frameLayout;
            this.val$finalOpenKeyboardOnShareAlertClose = z5;
        }

        @Override
        public void onSend(final LongSparseArray<TLRPC$Dialog> longSparseArray, final int i, TLRPC$TL_forumTopic tLRPC$TL_forumTopic) {
            final FrameLayout frameLayout = this.val$photoContainerView;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.AnonymousClass36.this.lambda$onSend$0(frameLayout, longSparseArray, i);
                }
            }, 250L);
        }

        public void lambda$onSend$0(FrameLayout frameLayout, LongSparseArray longSparseArray, int i) {
            BulletinFactory.createForwardedBulletin(PhotoViewer.this.parentActivity, frameLayout, longSparseArray.size(), longSparseArray.size() == 1 ? ((TLRPC$Dialog) longSparseArray.valueAt(0)).id : 0L, i, -115203550, -1).show();
        }

        @Override
        public void dismissInternal() {
            super.dismissInternal();
            if (this.val$finalOpenKeyboardOnShareAlertClose) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PhotoViewer.AnonymousClass36.this.lambda$dismissInternal$1();
                    }
                }, 50L);
            }
            PhotoViewer.this.requestAdjust();
        }

        public void lambda$dismissInternal$1() {
            if (PhotoViewer.this.parentChatActivity == null || PhotoViewer.this.parentChatActivity.getChatActivityEnterView() == null) {
                return;
            }
            PhotoViewer.this.parentChatActivity.getChatActivityEnterView().openKeyboard();
        }
    }

    public void lambda$showShareAlert$52(ShareAlert shareAlert) {
        if (shareAlert == null || shareAlert.getWindow() == null) {
            return;
        }
        shareAlert.setFocusable(true);
        ChatActivity chatActivity = this.parentChatActivity;
        if (chatActivity == null || chatActivity.getChatActivityEnterView() == null) {
            return;
        }
        this.parentChatActivity.getChatActivityEnterView().hidePopup(false);
    }

    public void updateActionBarTitlePadding() {
        if (this.menu == null || this.actionBarContainer == null) {
            return;
        }
        float f = 0.0f;
        for (int i = 0; i < this.menu.getChildCount(); i++) {
            View childAt = this.menu.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                f += Math.min(0.5f, childAt.getAlpha()) * 2.0f * childAt.getWidth();
            }
        }
        CheckBox checkBox = this.checkImageView;
        if (checkBox != null && checkBox.getVisibility() == 0) {
            f = Math.max(f, AndroidUtilities.dp(48.0f));
        }
        CounterView counterView = this.photosCounterView;
        if (counterView != null && counterView.getVisibility() == 0) {
            f = Math.max(f, AndroidUtilities.dp(100.0f));
        }
        this.actionBarContainer.updateRightPadding(f, false);
    }

    public void setMenuItemIcon(boolean z, boolean z2) {
        if (this.speedItem.getVisibility() != 0) {
            this.menuItemIcon.setSpeed(null, z);
            return;
        }
        this.menuItemIcon.setSpeed(Math.abs(this.currentVideoSpeed - 1.0f) >= 0.001f ? Float.valueOf(this.currentVideoSpeed) : null, z);
        if (z2) {
            if (Math.abs(this.currentVideoSpeed - 0.2f) < 0.05f) {
                this.speedItem.setSubtext(LocaleController.getString("VideoSpeedVerySlow", R.string.VideoSpeedVerySlow));
            } else if (Math.abs(this.currentVideoSpeed - 0.5f) < 0.05f) {
                this.speedItem.setSubtext(LocaleController.getString("VideoSpeedSlow", R.string.VideoSpeedSlow));
            } else if (Math.abs(this.currentVideoSpeed - 1.0f) < 0.05f) {
                this.speedItem.setSubtext(LocaleController.getString("VideoSpeedNormal", R.string.VideoSpeedNormal));
            } else if (Math.abs(this.currentVideoSpeed - 1.5f) < 0.05f) {
                this.speedItem.setSubtext(LocaleController.getString("VideoSpeedFast", R.string.VideoSpeedFast));
            } else if (Math.abs(this.currentVideoSpeed - 2.0f) < 0.05f) {
                this.speedItem.setSubtext(LocaleController.getString("VideoSpeedVeryFast", R.string.VideoSpeedVeryFast));
            } else {
                ActionBarMenuSubItem actionBarMenuSubItem = this.speedItem;
                int i = R.string.VideoSpeedCustom;
                actionBarMenuSubItem.setSubtext(LocaleController.formatString("VideoSpeedCustom", i, SpeedIconDrawable.formatNumber(this.currentVideoSpeed) + "x"));
            }
        }
        this.chooseSpeedLayout.update(this.currentVideoSpeed, z2);
    }

    public float getCurrentVideoSpeed() {
        return this.currentVideoSpeed;
    }

    private boolean checkInlinePermissions() {
        Activity activity = this.parentActivity;
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(activity)) {
            return true;
        }
        AlertsCreator.createDrawOverlayPermissionDialog(this.parentActivity, null).show();
        return false;
    }

    public void captureCurrentFrame() {
        TextureView textureView;
        if (this.captureFrameAtTime == -1 || (textureView = this.videoTextureView) == null) {
            return;
        }
        this.captureFrameAtTime = -1L;
        final Bitmap bitmap = textureView.getBitmap();
        this.flashView.animate().alpha(1.0f).setInterpolator(CubicBezierInterpolator.EASE_BOTH).setDuration(85L).setListener(new AnimatorListenerAdapter() {
            {
                PhotoViewer.this = this;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                PhotoViewer.this.photoCropView.setVideoThumb(bitmap, 0);
                PhotoViewer.this.flashAnimator = new AnimatorSet();
                PhotoViewer.this.flashAnimator.playTogether(ObjectAnimator.ofFloat(PhotoViewer.this.flashView, PhotoViewer.this.FLASH_VIEW_VALUE, 0.0f));
                PhotoViewer.this.flashAnimator.setDuration(85L);
                PhotoViewer.this.flashAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                PhotoViewer.this.flashAnimator.addListener(new AnonymousClass1());
                PhotoViewer.this.flashAnimator.start();
            }

            public class AnonymousClass1 extends AnimatorListenerAdapter {
                AnonymousClass1() {
                    AnonymousClass37.this = r1;
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    if (PhotoViewer.this.flashAnimator == null) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(PhotoViewer.this.videoPlayRunnable = new Runnable() {
                        @Override
                        public final void run() {
                            PhotoViewer.AnonymousClass37.AnonymousClass1.this.lambda$onAnimationEnd$0();
                        }
                    }, 860L);
                }

                public void lambda$onAnimationEnd$0() {
                    PhotoViewer.this.manuallyPaused = false;
                    if (PhotoViewer.this.videoPlayer != null) {
                        PhotoViewer.this.videoPlayer.play();
                    }
                    PhotoViewer.this.videoPlayRunnable = null;
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    PhotoViewer.this.flashAnimator = null;
                }
            }
        }).start();
    }

    public static class CaptionTextView extends SpoilersTextView {
        private AnimatedEmojiSpan.EmojiGroupedSpans animatedEmojiDrawables;
        private boolean hasQuote;
        private Layout lastLayout;
        private Layout lastLoadingLayout;
        private final LinkSpanDrawable.LinkCollector links;
        private boolean loading;
        private LoadingDrawable loadingDrawable;
        private Path loadingPath;
        private final Utilities.Callback2<ClickableSpan, TextView> onLinkClick;
        private final Utilities.Callback3<URLSpan, TextView, Runnable> onLinkLongPress;
        private LinkSpanDrawable<ClickableSpan> pressedLink;
        private ArrayList<QuoteSpan.Block> quoteBlocks;
        private final CaptionScrollView scrollView;
        private final TextSelectionHelper.SimpleTextSelectionHelper textSelectionHelper;

        public CaptionTextView(Context context, final CaptionScrollView captionScrollView, TextSelectionHelper.SimpleTextSelectionHelper simpleTextSelectionHelper, Utilities.Callback2<ClickableSpan, TextView> callback2, Utilities.Callback3<URLSpan, TextView, Runnable> callback3) {
            super(context);
            this.links = new LinkSpanDrawable.LinkCollector(this);
            this.scrollView = captionScrollView;
            this.onLinkClick = callback2;
            this.onLinkLongPress = callback3;
            this.textSelectionHelper = simpleTextSelectionHelper;
            ViewHelper.setPadding(this, 16.0f, 8.0f, 16.0f, 8.0f);
            setLinkTextColor(-8796932);
            setTextColor(-1);
            setHighlightColor(872415231);
            setGravity(LayoutHelper.getAbsoluteGravityStart() | 16);
            setTextSize(1, 16.0f);
            setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PhotoViewer.CaptionTextView.lambda$new$0(PhotoViewer.CaptionScrollView.this, view);
                }
            });
        }

        public static void lambda$new$0(CaptionScrollView captionScrollView, View view) {
            if (captionScrollView != null) {
                captionScrollView.smoothScrollBy(0, AndroidUtilities.dp(64.0f));
            }
        }

        @Override
        public boolean onTouchEvent(android.view.MotionEvent r10) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.CaptionTextView.onTouchEvent(android.view.MotionEvent):boolean");
        }

        public void lambda$onTouchEvent$1(LinkSpanDrawable linkSpanDrawable) {
            LinkSpanDrawable<ClickableSpan> linkSpanDrawable2 = this.pressedLink;
            if (linkSpanDrawable == linkSpanDrawable2 && linkSpanDrawable2 != null && (linkSpanDrawable2.getSpan() instanceof URLSpan)) {
                LinkSpanDrawable.LinkCollector linkCollector = this.links;
                Objects.requireNonNull(linkCollector);
                this.onLinkLongPress.run((URLSpan) this.pressedLink.getSpan(), this, new PhotoViewer$CaptionTextView$$ExternalSyntheticLambda1(linkCollector));
                this.pressedLink = null;
            }
        }

        @Override
        public void setPressed(boolean z) {
            boolean z2 = z != isPressed();
            super.setPressed(z);
            if (z2) {
                invalidate();
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            TextSelectionHelper.SimpleTextSelectionHelper simpleTextSelectionHelper = this.textSelectionHelper;
            if (simpleTextSelectionHelper != null && simpleTextSelectionHelper.isInSelectionMode()) {
                canvas.save();
                canvas.translate(getPaddingLeft(), getPaddingTop());
                if (this.textSelectionHelper != null && getStaticTextLayout() != null && this.textSelectionHelper.isCurrent(this)) {
                    this.textSelectionHelper.draw(canvas);
                }
                canvas.restore();
            }
            canvas.save();
            canvas.translate(getPaddingLeft(), 0.0f);
            if (this.links.draw(canvas)) {
                invalidate();
            }
            canvas.restore();
            super.onDraw(canvas);
            if (this.lastLayout != getLayout()) {
                boolean z = true;
                this.animatedEmojiDrawables = AnimatedEmojiSpan.update(0, this, this.animatedEmojiDrawables, getLayout());
                this.quoteBlocks = QuoteSpan.updateQuoteBlocksSpanned(getLayout(), this.quoteBlocks);
                z = (getLayout() == null || !(getLayout().getText() instanceof Spanned) || ((QuoteSpan.QuoteStyleSpan[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), QuoteSpan.QuoteStyleSpan.class)).length <= 0) ? false : false;
                this.hasQuote = z;
                ViewHelper.setPadding(this, 16.0f, 8.0f, (z ? 32 : 0) + 16, 8.0f);
                this.lastLayout = getLayout();
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            AnimatedEmojiSpan.release(this, this.animatedEmojiDrawables);
            this.quoteBlocks = QuoteSpan.updateQuoteBlocksSpanned(null, this.quoteBlocks);
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            super.onTextChanged(charSequence, i, i2, i3);
            this.animatedEmojiDrawables = AnimatedEmojiSpan.update(0, this, this.animatedEmojiDrawables, getLayout());
            this.quoteBlocks = QuoteSpan.updateQuoteBlocksSpanned(getLayout(), this.quoteBlocks);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            if (this.loading) {
                checkLoadingPath();
                if (this.loadingDrawable == null) {
                    LoadingDrawable loadingDrawable = new LoadingDrawable();
                    this.loadingDrawable = loadingDrawable;
                    loadingDrawable.usePath(this.loadingPath);
                    this.loadingDrawable.setRadiiDp(4.0f);
                    this.loadingDrawable.setColors(Theme.multAlpha(-1, 0.3f), Theme.multAlpha(-1, 0.1f), Theme.multAlpha(-1, 0.2f), Theme.multAlpha(-1, 0.7f));
                    this.loadingDrawable.setCallback(this);
                }
                this.loadingDrawable.setBounds(0, 0, getWidth(), getHeight());
                this.loadingDrawable.draw(canvas);
            }
            if (this.loading) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 178, 31);
            }
            if (this.quoteBlocks != null && this.hasQuote) {
                canvas.save();
                canvas.translate(getPaddingLeft(), getPaddingTop());
                for (int i = 0; i < this.quoteBlocks.size(); i++) {
                    this.quoteBlocks.get(i).draw(canvas, 0.0f, ((getWidth() - getPaddingLeft()) - getPaddingRight()) + (this.hasQuote ? AndroidUtilities.dp(32.0f) : 0), -1, 1.0f, getPaint());
                }
                canvas.restore();
            }
            super.dispatchDraw(canvas);
            if (this.loading) {
                canvas.restore();
            }
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            canvas.clipRect(0.0f, getScrollY(), getWidth() - getPaddingRight(), (getHeight() + getScrollY()) - (getPaddingBottom() * 0.75f));
            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, getLayout(), this.animatedEmojiDrawables, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }

        public void setLoading(boolean z) {
            if (this.loading == z) {
                return;
            }
            this.loading = z;
            invalidate();
        }

        private void checkLoadingPath() {
            Layout layout = getLayout();
            Path path = this.loadingPath;
            if (path == null || this.lastLoadingLayout != layout) {
                if (path == null) {
                    this.loadingPath = new Path();
                } else {
                    path.rewind();
                }
                if (layout != null) {
                    float dp = AndroidUtilities.dp(16.0f);
                    float dp2 = AndroidUtilities.dp(8.0f);
                    float f = 0.0f;
                    int i = 0;
                    while (i < layout.getLineCount()) {
                        float f2 = dp / 3.0f;
                        float lineLeft = layout.getLineLeft(i) - f2;
                        float lineRight = layout.getLineRight(i) + f2;
                        if (i == 0) {
                            f = layout.getLineTop(i) - (dp2 / 3.0f);
                        }
                        float lineBottom = layout.getLineBottom(i);
                        if (i >= layout.getLineCount() - 1) {
                            lineBottom += dp2 / 3.0f;
                        }
                        this.loadingPath.addRect(getPaddingLeft() + lineLeft, getPaddingTop() + f, getPaddingLeft() + lineRight, getPaddingTop() + lineBottom, Path.Direction.CW);
                        i++;
                        f = lineBottom;
                    }
                }
                this.lastLoadingLayout = layout;
            }
        }

        @Override
        protected boolean verifyDrawable(Drawable drawable) {
            return drawable == this.loadingDrawable || super.verifyDrawable(drawable);
        }
    }

    public int getLeftInset() {
        return this.insets.left;
    }

    public int getRightInset() {
        return this.insets.right;
    }

    public void dismissInternal() {
        try {
            if (this.windowView.getParent() != null) {
                Activity activity = this.parentActivity;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).drawerLayoutContainer.setAllowDrawContent(true);
                }
                ((WindowManager) this.parentActivity.getSystemService("window")).removeView(this.windowView);
                onHideView();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void switchToPip(boolean z) {
        float translationX;
        float translationY;
        float translationY2;
        float f;
        CubicBezierInterpolator cubicBezierInterpolator;
        CubicBezierInterpolator cubicBezierInterpolator2;
        if (this.videoPlayer == null || !this.textureUploaded || !checkInlinePermissions() || this.changingTextureView || this.switchingInlineMode || this.isInline) {
            return;
        }
        if (PipInstance != null) {
            PipInstance.destroyPhotoViewer();
        }
        this.openedFullScreenVideo = false;
        PipInstance = Instance;
        Instance = null;
        this.switchingInlineMode = true;
        this.isVisible = false;
        this.isVisibleOrAnimating = false;
        AndroidUtilities.cancelRunOnUIThread(this.hideActionBarRunnable);
        PlaceProviderObject placeProviderObject = this.currentPlaceObject;
        if (placeProviderObject != null && !placeProviderObject.imageReceiver.getVisible()) {
            this.currentPlaceObject.imageReceiver.setVisible(true, true);
            AnimatedFileDrawable animation = this.currentPlaceObject.imageReceiver.getAnimation();
            if (animation != null) {
                Bitmap animatedBitmap = animation.getAnimatedBitmap();
                if (animatedBitmap != null) {
                    try {
                        if (this.usedSurfaceView) {
                            AndroidUtilities.getBitmapFromSurface(this.videoSurfaceView, animatedBitmap);
                        } else {
                            Bitmap bitmap = this.videoTextureView.getBitmap(animatedBitmap.getWidth(), animatedBitmap.getHeight());
                            new Canvas(animatedBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                            bitmap.recycle();
                        }
                    } catch (Throwable th) {
                        FileLog.e(th);
                    }
                }
                animation.seekTo(this.videoPlayer.getCurrentPosition(), true);
                if (z) {
                    this.currentPlaceObject.imageReceiver.setAlpha(0.0f);
                    final ImageReceiver imageReceiver = this.currentPlaceObject.imageReceiver;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            PhotoViewer.lambda$switchToPip$53(ImageReceiver.this, valueAnimator);
                        }
                    });
                    ofFloat.addListener(new AnimatorListenerAdapter(this) {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            imageReceiver.setAlpha(1.0f);
                        }
                    });
                    ofFloat.setDuration(250L);
                    ofFloat.start();
                }
                this.currentPlaceObject.imageReceiver.setAllowStartAnimation(true);
                this.currentPlaceObject.imageReceiver.startAnimation();
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.pipAnimationInProgress = true;
            org.telegram.ui.Components.Rect pipRect = PipVideoOverlay.getPipRect(true, this.aspectRatioFrameLayout.getAspectRatio());
            final View view = this.usedSurfaceView ? this.videoSurfaceView : this.videoTextureView;
            final float width = pipRect.width / view.getWidth();
            final ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            if (this.usedSurfaceView) {
                translationX = this.aspectRatioFrameLayout.getLeft() + view.getTranslationX();
                translationY = this.aspectRatioFrameLayout.getTop() + view.getTranslationY() + this.translationY;
                translationY2 = this.aspectRatioFrameLayout.getTop() + this.textureImageView.getTranslationY();
                f = this.translationY;
            } else {
                translationX = view.getTranslationX();
                translationY = view.getTranslationY() + this.translationY;
                translationY2 = this.textureImageView.getTranslationY();
                f = this.translationY;
            }
            final float f2 = translationY2 + f;
            final float f3 = translationY;
            final float f4 = translationX;
            final float f5 = pipRect.x;
            final float leftInset = getLeftInset() + (f5 - this.aspectRatioFrameLayout.getX());
            final float f6 = pipRect.y;
            final float y = f6 - this.aspectRatioFrameLayout.getY();
            if (this.videoSurfaceView != null) {
                this.videoPlayer.player.pause();
                this.textureImageView.setVisibility(0);
                if (this.usedSurfaceView) {
                    Bitmap createBitmap = Bitmaps.createBitmap(this.videoSurfaceView.getWidth(), this.videoSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(this.videoSurfaceView, createBitmap);
                    this.textureImageView.setImageBitmap(createBitmap);
                }
                this.videoSurfaceView.setVisibility(4);
            }
            this.textureImageView.setTranslationY(f2);
            view.setTranslationY(f3);
            FirstFrameView firstFrameView = this.firstFrameView;
            if (firstFrameView != null) {
                firstFrameView.setTranslationY(f3);
            }
            this.translationY = 0.0f;
            this.containerView.invalidate();
            if (z) {
                if (f3 < y) {
                    cubicBezierInterpolator2 = new CubicBezierInterpolator(0.5d, 0.0d, 0.9d, 0.9d);
                } else {
                    cubicBezierInterpolator2 = new CubicBezierInterpolator(0.0d, 0.5d, 0.9d, 0.9d);
                }
                cubicBezierInterpolator = cubicBezierInterpolator2;
            } else {
                cubicBezierInterpolator = null;
            }
            ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider(this) {
                @Override
                public void getOutline(View view2, Outline outline) {
                    outline.setRoundRect(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight(), ((Float) ofFloat2.getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f) * (1.0f / width));
                }
            };
            view.setOutlineProvider(viewOutlineProvider);
            view.setClipToOutline(true);
            this.textureImageView.setOutlineProvider(viewOutlineProvider);
            this.textureImageView.setClipToOutline(true);
            FirstFrameView firstFrameView2 = this.firstFrameView;
            if (firstFrameView2 != null) {
                firstFrameView2.setOutlineProvider(viewOutlineProvider);
                this.firstFrameView.setClipToOutline(true);
            }
            final CubicBezierInterpolator cubicBezierInterpolator3 = cubicBezierInterpolator;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PhotoViewer.this.lambda$switchToPip$54(cubicBezierInterpolator3, f4, f5, f2, f6, view, leftInset, f3, y, valueAnimator);
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PhotoViewer.this.lambda$switchToPip$55(valueAnimator);
                }
            });
            animatorSet.playTogether(ofFloat3, ObjectAnimator.ofFloat(this.textureImageView, View.SCALE_X, width), ObjectAnimator.ofFloat(this.textureImageView, View.SCALE_Y, width), ObjectAnimator.ofFloat(view, View.SCALE_X, width), ObjectAnimator.ofFloat(view, View.SCALE_Y, width), ObjectAnimator.ofInt(this.backgroundDrawable, (Property<BackgroundDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, 0), ofFloat2);
            if (z) {
                animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                animatorSet.setDuration(300L);
            } else {
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.setDuration(250L);
            }
            animatorSet.addListener(new AnonymousClass40(view));
            animatorSet.start();
            if (!z) {
                toggleActionBar(false, true, new ActionBarToggleParams().enableStatusBarAnimation(false).enableTranslationAnimation(false).animationDuration(250).animationInterpolator(new DecelerateInterpolator()));
            }
        } else {
            this.switchToInlineRunnable.run();
            dismissInternal();
        }
        ChatActivity chatActivity = this.parentChatActivity;
        if (chatActivity == null || chatActivity.getFragmentView() == null) {
            return;
        }
        this.parentChatActivity.getFragmentView().invalidate();
    }

    public static void lambda$switchToPip$53(ImageReceiver imageReceiver, ValueAnimator valueAnimator) {
        imageReceiver.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void lambda$switchToPip$54(CubicBezierInterpolator cubicBezierInterpolator, float f, float f2, float f3, float f4, View view, float f5, float f6, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float interpolation = cubicBezierInterpolator == null ? floatValue : cubicBezierInterpolator.getInterpolation(floatValue);
        ImageView imageView = this.textureImageView;
        if (imageView != null) {
            imageView.setTranslationX(((1.0f - floatValue) * f) + (f2 * floatValue));
            this.textureImageView.setTranslationY((f3 * (1.0f - interpolation)) + (f4 * interpolation));
            this.textureImageView.invalidateOutline();
        }
        view.setTranslationX((f * (1.0f - floatValue)) + (f5 * floatValue));
        view.setTranslationY((f6 * (1.0f - interpolation)) + (f7 * interpolation));
        view.invalidateOutline();
        FirstFrameView firstFrameView = this.firstFrameView;
        if (firstFrameView != null) {
            firstFrameView.setTranslationX(view.getTranslationX());
            this.firstFrameView.setTranslationY(view.getTranslationY());
            this.firstFrameView.setScaleX(view.getScaleX());
            this.firstFrameView.setScaleY(view.getScaleY());
            this.firstFrameView.invalidateOutline();
        }
    }

    public void lambda$switchToPip$55(ValueAnimator valueAnimator) {
        this.clippingImageProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public class AnonymousClass40 extends AnimatorListenerAdapter {
        final View val$textureView;

        AnonymousClass40(View view) {
            PhotoViewer.this = r1;
            this.val$textureView = view;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            PhotoViewer.this.pipAnimationInProgress = false;
            PhotoViewer.this.switchToInlineRunnable.run();
            final View view = this.val$textureView;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.AnonymousClass40.this.lambda$onAnimationEnd$0(view);
                }
            }, 100L);
        }

        public void lambda$onAnimationEnd$0(View view) {
            view.setOutlineProvider(null);
            if (PhotoViewer.this.textureImageView != null) {
                PhotoViewer.this.textureImageView.setOutlineProvider(null);
            }
            if (PhotoViewer.this.firstFrameView != null) {
                PhotoViewer.this.firstFrameView.setOutlineProvider(null);
            }
        }
    }

    public boolean cropMirror() {
        if (this.imageMoveAnimation != null || this.photoCropView == null) {
            return false;
        }
        this.mirror = 0.0f;
        this.animateToMirror = 1.0f;
        this.animationStartTime = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.imageMoveAnimation = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, AnimationProperties.PHOTO_VIEWER_ANIMATION_VALUE, 0.0f, 1.0f));
        this.imageMoveAnimation.setDuration(250L);
        this.imageMoveAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.imageMoveAnimation.addListener(new AnimatorListenerAdapter() {
            {
                PhotoViewer.this = this;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                PhotoViewer.this.imageMoveAnimation = null;
                if (PhotoViewer.this.photoCropView == null) {
                    return;
                }
                if (PhotoViewer.this.photoCropView.mirror()) {
                    PhotoViewer.this.mirrorItem.setColorFilter(new PorterDuffColorFilter(PhotoViewer.this.getThemedColor(Theme.key_chat_editMediaButton), PorterDuff.Mode.MULTIPLY));
                } else {
                    PhotoViewer.this.mirrorItem.setColorFilter((ColorFilter) null);
                }
                PhotoViewer photoViewer = PhotoViewer.this;
                photoViewer.mirror = photoViewer.animateToMirror = 0.0f;
                PhotoViewer.this.containerView.invalidate();
            }
        });
        this.imageMoveAnimation.start();
        return !this.photoCropView.cropView.isMirrored();
    }

    public boolean cropRotate(float f) {
        return cropRotate(f, false, null);
    }

    public float scale1() {
        return scale1(true);
    }

    public float scale1(boolean z) {
        int i;
        if (this.sendPhotoType == 11) {
            int containerViewWidth = getContainerViewWidth();
            if (containerViewWidth == 0) {
                containerViewWidth = AndroidUtilities.displaySize.x;
            }
            float dp = ((containerViewWidth - AndroidUtilities.dp(20.0f)) + 1) / containerViewWidth;
            if (z) {
                int bitmapWidth = this.centerImage.getBitmapWidth();
                int bitmapHeight = this.centerImage.getBitmapHeight();
                if ((bitmapWidth <= 1 || bitmapHeight <= 1) && (i = this.currentIndex) >= 0 && i < this.imagesArrLocals.size()) {
                    Object obj = this.imagesArrLocals.get(this.currentIndex);
                    if (obj instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        if ((photoEntry.orientation / 90) % 2 != 0) {
                            bitmapWidth = photoEntry.height;
                            bitmapHeight = photoEntry.width;
                        } else {
                            bitmapWidth = photoEntry.width;
                            bitmapHeight = photoEntry.height;
                        }
                    }
                }
                return (bitmapWidth <= 1 || bitmapHeight <= 1 || bitmapWidth <= bitmapHeight) ? dp : dp * (bitmapWidth / bitmapHeight);
            }
            return dp;
        }
        return 1.0f;
    }

    private boolean cropRotate(final float f, boolean z, final Runnable runnable) {
        PhotoCropView photoCropView;
        if (this.imageMoveAnimation == null && (photoCropView = this.photoCropView) != null) {
            photoCropView.cropView.maximize(true);
            this.rotate = 0.0f;
            this.animateToRotate = 0.0f + f;
            if (z) {
                this.mirror = 0.0f;
                this.animateToMirror = 1.0f;
            }
            this.animationStartTime = System.currentTimeMillis();
            this.imageMoveAnimation = new AnimatorSet();
            if (this.sendPhotoType == 1) {
                this.animateToScale = 1.0f;
                this.scale = 1.0f;
            } else {
                ImageReceiver imageReceiver = this.centerImage;
                if (imageReceiver != null) {
                    int bitmapWidth = imageReceiver.getBitmapWidth();
                    int bitmapHeight = this.centerImage.getBitmapHeight();
                    if (Math.abs((((int) this.photoCropView.cropView.getStateOrientation()) / 90) % 2) == 1) {
                        bitmapHeight = bitmapWidth;
                        bitmapWidth = bitmapHeight;
                    }
                    MediaController.CropState cropState = this.editState.cropState;
                    if (cropState != null) {
                        bitmapWidth = (int) (bitmapWidth * cropState.cropPw);
                        bitmapHeight = (int) (bitmapHeight * cropState.cropPh);
                    }
                    float f2 = bitmapWidth;
                    float f3 = bitmapHeight;
                    float min = Math.min(getContainerViewWidth(1) / f2, getContainerViewHeight(1) / f3);
                    this.animateToScale = (Math.abs((f / 90.0f) % 2.0f) == 1.0f ? Math.min(getContainerViewWidth(1) / f3, getContainerViewHeight(1) / f2) : min) / min;
                }
            }
            if (this.sendPhotoType == 11) {
                this.scale *= scale1(false);
                this.animateToScale *= scale1(false);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            final float rotation = this.photoCropView.wheelView.getRotation();
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PhotoViewer.this.lambda$cropRotate$56(f, rotation, valueAnimator);
                }
            });
            this.imageMoveAnimation.playTogether(ObjectAnimator.ofFloat(this, AnimationProperties.PHOTO_VIEWER_ANIMATION_VALUE, 0.0f, 1.0f), ofFloat);
            this.imageMoveAnimation.setDuration(250L);
            this.imageMoveAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.imageMoveAnimation.addListener(new AnimatorListenerAdapter() {
                {
                    PhotoViewer.this = this;
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    PhotoViewer.this.imageMoveAnimation = null;
                    PhotoViewer photoViewer = PhotoViewer.this;
                    photoViewer.rotate = photoViewer.animateToRotate = 0.0f;
                    PhotoViewer photoViewer2 = PhotoViewer.this;
                    photoViewer2.mirror = photoViewer2.animateToMirror = 0.0f;
                    PhotoViewer photoViewer3 = PhotoViewer.this;
                    photoViewer3.scale = photoViewer3.animateToScale = photoViewer3.scale1(false);
                    PhotoViewer.this.containerView.invalidate();
                    PhotoViewer.this.photoCropView.cropView.areaView.setRotationScaleTranslation(0.0f, PhotoViewer.this.scale1(false), 0.0f, 0.0f);
                    PhotoViewer.this.photoCropView.wheelView.setRotated(false);
                    if (Math.abs(f) > 0.0f) {
                        if (PhotoViewer.this.photoCropView.rotate(f)) {
                            PhotoViewer.this.rotateItem.setColorFilter(new PorterDuffColorFilter(PhotoViewer.this.getThemedColor(Theme.key_chat_editMediaButton), PorterDuff.Mode.MULTIPLY));
                        } else {
                            PhotoViewer.this.rotateItem.setColorFilter((ColorFilter) null);
                        }
                    }
                    if (PhotoViewer.this.editState.cropState != null) {
                        MediaController.CropState cropState2 = PhotoViewer.this.editState.cropState;
                        PhotoViewer.this.editState.cropState.cropPy = 0.0f;
                        cropState2.cropPx = 0.0f;
                        MediaController.CropState cropState3 = PhotoViewer.this.editState.cropState;
                        PhotoViewer.this.editState.cropState.cropPh = 1.0f;
                        cropState3.cropPw = 1.0f;
                    }
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            });
            this.imageMoveAnimation.start();
            return Math.abs(this.photoCropView.cropView.getStateOrientation() + f) > 0.01f;
        }
        return false;
    }

    public void lambda$cropRotate$56(float f, float f2, ValueAnimator valueAnimator) {
        CropAreaView cropAreaView = this.photoCropView.cropView.areaView;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f;
        float f3 = this.scale;
        cropAreaView.setRotationScaleTranslation(floatValue, f3 + ((this.animateToScale - f3) * this.animationValue), 0.0f, 0.0f);
        this.photoCropView.wheelView.setRotation(AndroidUtilities.lerp(f2, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()), false);
    }

    public VideoPlayer getVideoPlayer() {
        return this.videoPlayer;
    }

    public void exitFromPip() {
        if (this.isInline) {
            if (Instance != null) {
                Instance.closePhoto(false, true);
            }
            PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
            if (photoViewerWebView != null) {
                photoViewerWebView.exitFromPip();
            }
            Instance = PipInstance;
            PipInstance = null;
            if (this.photoViewerWebView == null) {
                this.switchingInlineMode = true;
                Bitmap bitmap = this.currentBitmap;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.currentBitmap = null;
                }
                this.changingTextureView = true;
            }
            this.isInline = false;
            View view = this.usedSurfaceView ? this.videoSurfaceView : this.videoTextureView;
            if (this.photoViewerWebView == null && view != null) {
                AndroidUtilities.removeFromParent(view);
                view.setVisibility(4);
                this.aspectRatioFrameLayout.addView(view);
            }
            if (ApplicationLoader.mainInterfacePaused) {
                try {
                    this.parentActivity.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            if (this.photoViewerWebView == null) {
                if (Build.VERSION.SDK_INT >= 21 && view != null) {
                    this.pipAnimationInProgress = true;
                    org.telegram.ui.Components.Rect pipRect = PipVideoOverlay.getPipRect(false, this.aspectRatioFrameLayout.getAspectRatio());
                    final float f = pipRect.width / this.textureImageView.getLayoutParams().width;
                    this.textureImageView.setScaleX(f);
                    this.textureImageView.setScaleY(f);
                    this.textureImageView.setTranslationX(pipRect.x);
                    this.textureImageView.setTranslationY(pipRect.y);
                    view.setScaleX(f);
                    view.setScaleY(f);
                    view.setTranslationX(pipRect.x - this.aspectRatioFrameLayout.getX());
                    view.setTranslationY(pipRect.y - this.aspectRatioFrameLayout.getY());
                    FirstFrameView firstFrameView = this.firstFrameView;
                    if (firstFrameView != null) {
                        firstFrameView.setScaleX(f);
                        this.firstFrameView.setScaleY(f);
                        this.firstFrameView.setTranslationX(view.getTranslationX());
                        this.firstFrameView.setTranslationY(view.getTranslationY());
                    }
                    this.inlineOutAnimationProgress = 0.0f;
                    ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() {
                        {
                            PhotoViewer.this = this;
                        }

                        @Override
                        public void getOutline(View view2, Outline outline) {
                            outline.setRoundRect(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight(), (1.0f - PhotoViewer.this.inlineOutAnimationProgress) * AndroidUtilities.dp(10.0f) * (1.0f / f));
                        }
                    };
                    view.setOutlineProvider(viewOutlineProvider);
                    view.setClipToOutline(true);
                    this.textureImageView.setOutlineProvider(viewOutlineProvider);
                    this.textureImageView.setClipToOutline(true);
                    FirstFrameView firstFrameView2 = this.firstFrameView;
                    if (firstFrameView2 != null) {
                        firstFrameView2.setOutlineProvider(viewOutlineProvider);
                        this.firstFrameView.setClipToOutline(true);
                    }
                } else {
                    PipVideoOverlay.dismiss(true);
                }
            } else {
                this.clippingImageProgress = 0.0f;
            }
            try {
                this.isVisible = true;
                this.isVisibleOrAnimating = true;
                ((WindowManager) this.parentActivity.getSystemService("window")).addView(this.windowView, this.windowLayoutParams);
                onShowView();
                PlaceProviderObject placeProviderObject = this.currentPlaceObject;
                if (placeProviderObject != null) {
                    placeProviderObject.imageReceiver.setVisible(false, false);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (this.usedSurfaceView) {
                ExoPlayer exoPlayer = this.videoPlayer.player;
                if (exoPlayer != null) {
                    exoPlayer.setVideoTextureView(null);
                }
                this.videoPlayer.setSurfaceView(this.videoSurfaceView);
                this.videoSurfaceView.setVisibility(4);
                this.waitingForFirstTextureUpload = 2;
                this.changingTextureView = false;
                this.containerView.invalidate();
                if (Build.VERSION.SDK_INT >= 21) {
                    this.waitingForDraw = 4;
                }
            } else if (Build.VERSION.SDK_INT >= 21) {
                this.waitingForDraw = 4;
            }
        }
    }

    private void onShowView() {
        Activity activity = this.parentActivity;
        if (activity instanceof LaunchActivity) {
            ((LaunchActivity) activity).addOnUserLeaveHintListener(this.onUserLeaveHintListener);
        }
    }

    private void onHideView() {
        Activity activity = this.parentActivity;
        if (activity instanceof LaunchActivity) {
            ((LaunchActivity) activity).removeOnUserLeaveHintListener(this.onUserLeaveHintListener);
        }
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment == null || baseFragment.getFragmentView() == null) {
            return;
        }
        this.clippingImageProgress = 1.0f;
        View fragmentView = this.parentFragment.getFragmentView();
        fragmentView.setScaleX(1.0f);
        fragmentView.setScaleY(1.0f);
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert != null) {
            BottomSheet.ContainerView container = chatAttachAlert.getContainer();
            container.setScaleX(1.0f);
            container.setScaleY(1.0f);
        }
    }

    public void onUserLeaveHint() {
        if (this.pipItem.getAlpha() == 1.0f && AndroidUtilities.checkInlinePermissions(this.parentActivity) && !PipVideoOverlay.isVisible() && this.isPlaying) {
            if (this.isEmbedVideo) {
                PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
                if (photoViewerWebView == null || photoViewerWebView.isInAppOnly() || !this.photoViewerWebView.openInPip()) {
                    return;
                }
                this.pipVideoOverlayAnimateFlag = false;
                if (PipInstance != null) {
                    PipInstance.destroyPhotoViewer();
                }
                this.isInline = true;
                PipInstance = Instance;
                Instance = null;
                this.isVisible = false;
                PlaceProviderObject placeProviderObject = this.currentPlaceObject;
                if (placeProviderObject != null && !placeProviderObject.imageReceiver.getVisible()) {
                    this.currentPlaceObject.imageReceiver.setVisible(true, true);
                }
                this.clippingImageProgress = 1.0f;
                this.containerView.invalidate();
                dismissInternal();
                return;
            }
            this.pipVideoOverlayAnimateFlag = false;
            switchToPip(false);
        }
    }

    public void updateVideoSeekPreviewPosition() {
        int thumbX = (this.videoPlayerSeekbar.getThumbX() + AndroidUtilities.dp(2.0f)) - (this.videoPreviewFrame.getMeasuredWidth() / 2);
        int dp = AndroidUtilities.dp(10.0f);
        int measuredWidth = (this.videoPlayerControlFrameLayout.getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - (this.videoPreviewFrame.getMeasuredWidth() / 2);
        if (thumbX < dp) {
            VideoSeekPreviewImage videoSeekPreviewImage = this.videoPreviewFrame;
            videoSeekPreviewImage.setPivotX(Utilities.clamp((videoSeekPreviewImage.getMeasuredWidth() / 2.0f) - (dp - thumbX), this.videoPreviewFrame.getMeasuredWidth(), 0.0f));
            thumbX = dp;
        } else if (thumbX >= measuredWidth) {
            VideoSeekPreviewImage videoSeekPreviewImage2 = this.videoPreviewFrame;
            videoSeekPreviewImage2.setPivotX(Utilities.clamp((videoSeekPreviewImage2.getMeasuredWidth() / 2.0f) + (thumbX - measuredWidth), this.videoPreviewFrame.getMeasuredWidth(), 0.0f));
            thumbX = measuredWidth;
        } else {
            VideoSeekPreviewImage videoSeekPreviewImage3 = this.videoPreviewFrame;
            videoSeekPreviewImage3.setPivotX(videoSeekPreviewImage3.getMeasuredWidth() / 2.0f);
        }
        this.videoPreviewFrame.setTranslationX(thumbX);
    }

    public void showVideoSeekPreviewPosition(boolean z) {
        PhotoViewerWebView photoViewerWebView;
        if (!z || this.videoPreviewFrame.getTag() == null) {
            if (z || this.videoPreviewFrame.getTag() != null) {
                if (z && !this.videoPreviewFrame.isReady() && ((photoViewerWebView = this.photoViewerWebView) == null || !photoViewerWebView.isYouTube() || !this.photoViewerWebView.hasYoutubeStoryboards())) {
                    this.needShowOnReady = true;
                    return;
                }
                AnimatorSet animatorSet = this.videoPreviewFrameAnimation;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.videoPreviewFrame.setTag(z ? 1 : null);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.videoPreviewFrameAnimation = animatorSet2;
                Animator[] animatorArr = new Animator[4];
                VideoSeekPreviewImage videoSeekPreviewImage = this.videoPreviewFrame;
                Property property = View.ALPHA;
                float[] fArr = new float[1];
                fArr[0] = z ? 1.0f : 0.0f;
                animatorArr[0] = ObjectAnimator.ofFloat(videoSeekPreviewImage, property, fArr);
                VideoSeekPreviewImage videoSeekPreviewImage2 = this.videoPreviewFrame;
                Property property2 = View.SCALE_X;
                float[] fArr2 = new float[1];
                fArr2[0] = z ? 1.0f : 0.5f;
                animatorArr[1] = ObjectAnimator.ofFloat(videoSeekPreviewImage2, property2, fArr2);
                VideoSeekPreviewImage videoSeekPreviewImage3 = this.videoPreviewFrame;
                Property property3 = View.SCALE_Y;
                float[] fArr3 = new float[1];
                fArr3[0] = z ? 1.0f : 0.5f;
                animatorArr[2] = ObjectAnimator.ofFloat(videoSeekPreviewImage3, property3, fArr3);
                VideoSeekPreviewImage videoSeekPreviewImage4 = this.videoPreviewFrame;
                Property property4 = View.TRANSLATION_Y;
                float[] fArr4 = new float[1];
                fArr4[0] = z ? 0.0f : AndroidUtilities.dp(12.0f);
                animatorArr[3] = ObjectAnimator.ofFloat(videoSeekPreviewImage4, property4, fArr4);
                animatorSet2.playTogether(animatorArr);
                this.videoPreviewFrameAnimation.setDuration(380L);
                this.videoPreviewFrameAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.videoPreviewFrameAnimation.addListener(new AnimatorListenerAdapter() {
                    {
                        PhotoViewer.this = this;
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PhotoViewer.this.videoPreviewFrameAnimation = null;
                    }
                });
                this.videoPreviewFrameAnimation.start();
            }
        }
    }

    private void createVideoControlsInterface() {
        VideoPlayerControlFrameLayout videoPlayerControlFrameLayout = new VideoPlayerControlFrameLayout(this.containerView.getContext());
        this.videoPlayerControlFrameLayout = videoPlayerControlFrameLayout;
        this.containerView.addView(videoPlayerControlFrameLayout, LayoutHelper.createFrame(-1, 48, 83));
        final VideoPlayerSeekBar.SeekBarDelegate seekBarDelegate = new VideoPlayerSeekBar.SeekBarDelegate() {
            {
                PhotoViewer.this = this;
            }

            @Override
            public void onSeekBarDrag(float f) {
                if (PhotoViewer.this.videoPlayer != null || (PhotoViewer.this.photoViewerWebView != null && PhotoViewer.this.photoViewerWebView.isControllable())) {
                    if (!PhotoViewer.this.inPreview && PhotoViewer.this.videoTimelineViewContainer.getVisibility() == 0) {
                        f = PhotoViewer.this.videoTimelineView.getLeftProgress() + ((PhotoViewer.this.videoTimelineView.getRightProgress() - PhotoViewer.this.videoTimelineView.getLeftProgress()) * f);
                    }
                    long videoDuration = PhotoViewer.this.getVideoDuration();
                    if (videoDuration == -9223372036854775807L) {
                        PhotoViewer.this.seekToProgressPending = f;
                    } else {
                        PhotoViewer.this.seekVideoOrWebTo((int) (f * ((float) videoDuration)));
                    }
                    PhotoViewer.this.showVideoSeekPreviewPosition(false);
                    PhotoViewer.this.needShowOnReady = false;
                }
            }

            @Override
            public void onSeekBarContinuousDrag(float f) {
                if (PhotoViewer.this.photoViewerWebView == null || !PhotoViewer.this.photoViewerWebView.isYouTube() || PhotoViewer.this.videoPreviewFrame == null) {
                    if (PhotoViewer.this.videoPlayer != null && PhotoViewer.this.videoPreviewFrame != null) {
                        PhotoViewer.this.videoPreviewFrame.setProgress(f, PhotoViewer.this.videoPlayerSeekbar.getWidth());
                    }
                } else {
                    PhotoViewer.this.videoPreviewFrame.setProgressForYouTube(PhotoViewer.this.photoViewerWebView, f, PhotoViewer.this.videoPlayerSeekbar.getWidth());
                }
                PhotoViewer.this.showVideoSeekPreviewPosition(true);
                PhotoViewer.this.updateVideoSeekPreviewPosition();
            }
        };
        FloatSeekBarAccessibilityDelegate floatSeekBarAccessibilityDelegate = new FloatSeekBarAccessibilityDelegate() {
            {
                PhotoViewer.this = this;
            }

            @Override
            public float getProgress() {
                return PhotoViewer.this.videoPlayerSeekbar.getProgress();
            }

            @Override
            public void setProgress(float f) {
                seekBarDelegate.onSeekBarDrag(f);
                PhotoViewer.this.videoPlayerSeekbar.setProgress(f);
                PhotoViewer.this.videoPlayerSeekbarView.invalidate();
            }

            @Override
            public String getContentDescription(View view) {
                return LocaleController.formatString("AccDescrPlayerDuration", R.string.AccDescrPlayerDuration, LocaleController.formatPluralString("Minutes", PhotoViewer.this.videoPlayerCurrentTime[0], new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", PhotoViewer.this.videoPlayerCurrentTime[1], new Object[0]), LocaleController.formatPluralString("Minutes", PhotoViewer.this.videoPlayerTotalTime[0], new Object[0]) + ' ' + LocaleController.formatPluralString("Seconds", PhotoViewer.this.videoPlayerTotalTime[1], new Object[0]));
            }
        };
        View view = new View(this.containerView.getContext()) {
            {
                PhotoViewer.this = this;
            }

            @Override
            protected void onDraw(Canvas canvas) {
                PhotoViewer.this.videoPlayerSeekbar.draw(canvas, this);
            }
        };
        this.videoPlayerSeekbarView = view;
        view.setAccessibilityDelegate(floatSeekBarAccessibilityDelegate);
        this.videoPlayerSeekbarView.setImportantForAccessibility(1);
        this.videoPlayerControlFrameLayout.addView(this.videoPlayerSeekbarView, LayoutHelper.createFrame(-1, -1.0f));
        VideoPlayerSeekBar videoPlayerSeekBar = new VideoPlayerSeekBar(this.videoPlayerSeekbarView);
        this.videoPlayerSeekbar = videoPlayerSeekBar;
        videoPlayerSeekBar.setHorizontalPadding(AndroidUtilities.dp(2.0f));
        this.videoPlayerSeekbar.setColors(872415231, 872415231, -1, -1, -1, 1509949439);
        this.videoPlayerSeekbar.setDelegate(seekBarDelegate);
        VideoSeekPreviewImage videoSeekPreviewImage = new VideoSeekPreviewImage(this.containerView.getContext(), new VideoSeekPreviewImage.VideoSeekPreviewImageDelegate() {
            @Override
            public final void onReady() {
                PhotoViewer.this.lambda$createVideoControlsInterface$57();
            }
        }) {
            {
                PhotoViewer.this = this;
            }

            @Override
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                PhotoViewer.this.updateVideoSeekPreviewPosition();
            }

            @Override
            public void setVisibility(int i) {
                super.setVisibility(i);
                if (i == 0) {
                    PhotoViewer.this.updateVideoSeekPreviewPosition();
                }
            }
        };
        this.videoPreviewFrame = videoSeekPreviewImage;
        videoSeekPreviewImage.setAlpha(0.0f);
        this.containerView.addView(this.videoPreviewFrame, LayoutHelper.createFrame(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 58.0f));
        SimpleTextView simpleTextView = new SimpleTextView(this.containerView.getContext());
        this.videoPlayerTime = simpleTextView;
        simpleTextView.setTextColor(-1);
        this.videoPlayerTime.setGravity(53);
        this.videoPlayerTime.setTextSize(14);
        this.videoPlayerTime.setImportantForAccessibility(2);
        this.videoPlayerControlFrameLayout.addView(this.videoPlayerTime, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 15.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(this.containerView.getContext());
        this.exitFullscreenButton = imageView;
        imageView.setImageResource(R.drawable.msg_minvideo);
        this.exitFullscreenButton.setContentDescription(LocaleController.getString("AccExitFullscreen", R.string.AccExitFullscreen));
        this.exitFullscreenButton.setScaleType(ImageView.ScaleType.CENTER);
        this.exitFullscreenButton.setBackground(Theme.createSelectorDrawable(1090519039));
        this.exitFullscreenButton.setVisibility(4);
        this.videoPlayerControlFrameLayout.addView(this.exitFullscreenButton, LayoutHelper.createFrame(48, 48, 53));
        this.exitFullscreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$createVideoControlsInterface$58(view2);
            }
        });
    }

    public void lambda$createVideoControlsInterface$57() {
        if (this.needShowOnReady) {
            showVideoSeekPreviewPosition(true);
        }
    }

    public void lambda$createVideoControlsInterface$58(View view) {
        Activity activity = this.parentActivity;
        if (activity == null) {
            return;
        }
        this.wasRotated = false;
        this.fullscreenedByButton = 2;
        if (this.prevOrientation == -10) {
            this.prevOrientation = activity.getRequestedOrientation();
        }
        this.parentActivity.setRequestedOrientation(1);
    }

    private int[] fixVideoWidthHeight(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.fixVideoWidthHeight(int, int):int[]");
    }

    public VideoEditedInfo getCurrentVideoEditedInfo() {
        int i;
        long j;
        boolean z = false;
        ArrayList<VideoEditedInfo.MediaEntity> arrayList = null;
        if (!this.isCurrentVideo && hasAnimatedMediaEntities() && this.centerImage.getBitmapWidth() > 0) {
            float f = 854.0f;
            int i2 = this.sendPhotoType;
            if (i2 == 1) {
                f = 800.0f;
            } else if (i2 == 11) {
                f = 500.0f;
            }
            VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
            videoEditedInfo.startTime = 0L;
            videoEditedInfo.start = (float) 0;
            videoEditedInfo.endTime = Math.min(3000L, this.editState.averageDuration);
            while (true) {
                j = videoEditedInfo.endTime;
                if (j <= 0 || j >= 1000) {
                    break;
                }
                videoEditedInfo.endTime = j * 2;
            }
            videoEditedInfo.end = (float) j;
            videoEditedInfo.compressQuality = this.selectedCompression;
            videoEditedInfo.rotationValue = 0;
            videoEditedInfo.originalPath = this.currentImagePath;
            long j2 = videoEditedInfo.endTime;
            videoEditedInfo.estimatedSize = (int) ((((float) j2) / 1000.0f) * 115200.0f);
            videoEditedInfo.estimatedDuration = j2;
            videoEditedInfo.framerate = 30;
            videoEditedInfo.originalDuration = j2;
            EditState editState = this.editState;
            videoEditedInfo.filterState = editState.savedFilterState;
            String str = editState.croppedPaintPath;
            if (str != null) {
                videoEditedInfo.paintPath = str;
                ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = editState.croppedMediaEntities;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList = this.editState.croppedMediaEntities;
                }
                videoEditedInfo.mediaEntities = arrayList;
            } else {
                videoEditedInfo.paintPath = editState.paintPath;
                videoEditedInfo.mediaEntities = editState.mediaEntities;
            }
            videoEditedInfo.isPhoto = true;
            int bitmapWidth = this.centerImage.getBitmapWidth();
            int bitmapHeight = this.centerImage.getBitmapHeight();
            MediaController.CropState cropState = this.editState.cropState;
            if (cropState != null) {
                int i3 = cropState.transformRotation;
                if (i3 == 90 || i3 == 270) {
                    bitmapHeight = bitmapWidth;
                    bitmapWidth = bitmapHeight;
                }
                bitmapWidth = (int) (bitmapWidth * cropState.cropPw);
                bitmapHeight = (int) (bitmapHeight * cropState.cropPh);
            }
            int i4 = this.sendPhotoType;
            if (i4 == 1 || i4 == 11) {
                bitmapWidth = bitmapHeight;
            }
            float f2 = bitmapWidth;
            float f3 = bitmapHeight;
            float max = Math.max(f2 / f, f3 / f);
            if (max < 1.0f) {
                max = 1.0f;
            }
            int i5 = (int) (f2 / max);
            int i6 = (int) (f3 / max);
            if (i5 % 16 != 0) {
                i5 = Math.max(1, Math.round(i5 / 16.0f)) * 16;
            }
            if (i6 % 16 != 0) {
                i6 = Math.max(1, Math.round(i6 / 16.0f)) * 16;
            }
            videoEditedInfo.resultWidth = i5;
            videoEditedInfo.originalWidth = i5;
            videoEditedInfo.resultHeight = i6;
            videoEditedInfo.originalHeight = i6;
            videoEditedInfo.bitrate = -1;
            videoEditedInfo.muted = true;
            videoEditedInfo.avatarStartTime = 0L;
            return videoEditedInfo;
        } else if (!this.isCurrentVideo || this.currentPlayingVideoFile == null || this.compressionsCount == 0) {
            return null;
        } else {
            VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
            videoEditedInfo2.startTime = this.startTime;
            videoEditedInfo2.endTime = this.endTime;
            videoEditedInfo2.start = this.videoCutStart;
            videoEditedInfo2.end = this.videoCutEnd;
            videoEditedInfo2.compressQuality = this.selectedCompression;
            videoEditedInfo2.rotationValue = this.rotationValue;
            videoEditedInfo2.originalWidth = this.originalWidth;
            videoEditedInfo2.originalHeight = this.originalHeight;
            videoEditedInfo2.bitrate = this.bitrate;
            videoEditedInfo2.originalPath = this.currentPathObject;
            long j3 = this.estimatedSize;
            if (j3 == 0) {
                j3 = 1;
            }
            videoEditedInfo2.estimatedSize = j3;
            videoEditedInfo2.estimatedDuration = this.estimatedDuration;
            videoEditedInfo2.framerate = this.videoFramerate;
            videoEditedInfo2.originalDuration = this.videoDuration * 1000.0f;
            EditState editState2 = this.editState;
            videoEditedInfo2.filterState = editState2.savedFilterState;
            String str2 = editState2.croppedPaintPath;
            if (str2 != null) {
                videoEditedInfo2.paintPath = str2;
                ArrayList<VideoEditedInfo.MediaEntity> arrayList3 = editState2.croppedMediaEntities;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    arrayList = this.editState.croppedMediaEntities;
                }
                videoEditedInfo2.mediaEntities = arrayList;
            } else {
                videoEditedInfo2.paintPath = editState2.paintPath;
                ArrayList<VideoEditedInfo.MediaEntity> arrayList4 = editState2.mediaEntities;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    arrayList = this.editState.mediaEntities;
                }
                videoEditedInfo2.mediaEntities = arrayList;
            }
            if (this.sendPhotoType != 1 && !this.muteVideo && (this.compressItem.getTag() == null || (videoEditedInfo2.resultWidth == this.originalWidth && videoEditedInfo2.resultHeight == this.originalHeight))) {
                videoEditedInfo2.resultWidth = this.originalWidth;
                videoEditedInfo2.resultHeight = this.originalHeight;
                videoEditedInfo2.bitrate = this.muteVideo ? -1 : this.originalBitrate;
            } else {
                if (this.muteVideo || this.sendPhotoType == 1) {
                    this.selectedCompression = 1;
                    updateWidthHeightBitrateForCompression();
                }
                videoEditedInfo2.resultWidth = this.resultWidth;
                videoEditedInfo2.resultHeight = this.resultHeight;
                if (!this.muteVideo && this.sendPhotoType != 1) {
                    r5 = this.bitrate;
                }
                videoEditedInfo2.bitrate = r5;
            }
            MediaController.CropState cropState2 = this.editState.cropState;
            videoEditedInfo2.cropState = cropState2;
            if (cropState2 != null) {
                videoEditedInfo2.rotationValue += cropState2.transformRotation;
                while (true) {
                    i = videoEditedInfo2.rotationValue;
                    if (i < 360) {
                        break;
                    }
                    videoEditedInfo2.rotationValue = i - 360;
                }
                if (i == 90 || i == 270) {
                    MediaController.CropState cropState3 = videoEditedInfo2.cropState;
                    cropState3.transformWidth = (int) (videoEditedInfo2.resultWidth * cropState3.cropPh);
                    cropState3.transformHeight = (int) (videoEditedInfo2.resultHeight * cropState3.cropPw);
                } else {
                    MediaController.CropState cropState4 = videoEditedInfo2.cropState;
                    cropState4.transformWidth = (int) (videoEditedInfo2.resultWidth * cropState4.cropPw);
                    cropState4.transformHeight = (int) (videoEditedInfo2.resultHeight * cropState4.cropPh);
                }
                if (this.sendPhotoType == 1) {
                    MediaController.CropState cropState5 = videoEditedInfo2.cropState;
                    if (cropState5.transformWidth > 800) {
                        cropState5.transformWidth = 800;
                    }
                    if (cropState5.transformHeight > 800) {
                        cropState5.transformHeight = 800;
                    }
                    int min = Math.min(cropState5.transformWidth, cropState5.transformHeight);
                    cropState5.transformHeight = min;
                    cropState5.transformWidth = min;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("original transformed w = " + videoEditedInfo2.cropState.transformWidth + " h = " + videoEditedInfo2.cropState.transformHeight + " r = " + videoEditedInfo2.rotationValue);
                }
                MediaController.CropState cropState6 = videoEditedInfo2.cropState;
                int[] fixVideoWidthHeight = fixVideoWidthHeight(cropState6.transformWidth, cropState6.transformHeight);
                MediaController.CropState cropState7 = videoEditedInfo2.cropState;
                cropState7.transformWidth = fixVideoWidthHeight[0];
                cropState7.transformHeight = fixVideoWidthHeight[1];
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("fixed transformed w = " + videoEditedInfo2.cropState.transformWidth + " h = " + videoEditedInfo2.cropState.transformHeight);
                }
            }
            if (this.sendPhotoType == 1) {
                videoEditedInfo2.avatarStartTime = this.avatarStartTime;
                videoEditedInfo2.originalBitrate = this.originalBitrate;
            }
            videoEditedInfo2.muted = (this.muteVideo || this.sendPhotoType == 1) ? true : true;
            return videoEditedInfo2;
        }
    }

    private boolean supportsSendingNewEntities() {
        TLRPC$EncryptedChat tLRPC$EncryptedChat;
        ChatActivity chatActivity = this.parentChatActivity;
        return chatActivity != null && ((tLRPC$EncryptedChat = chatActivity.currentEncryptedChat) == null || AndroidUtilities.getPeerLayerVersion(tLRPC$EncryptedChat.layer) >= 101);
    }

    public void closeCaptionEnter(boolean z) {
        int i = this.currentIndex;
        if (i < 0 || i >= this.imagesArrLocals.size() || !isCaptionOpen()) {
            return;
        }
        this.imagesArrLocals.get(this.currentIndex);
        if (z) {
            applyCaption();
        }
        if (this.captionEdit.editText.isPopupShowing()) {
            this.captionEdit.editText.hidePopup(true);
        }
        this.captionEdit.editText.closeKeyboard();
    }

    public CharSequence applyCaption() {
        int i;
        if (!isVisible() || this.placeProvider == null || (i = this.currentIndex) < 0 || i >= this.imagesArrLocals.size()) {
            return null;
        }
        Object obj = this.imagesArrLocals.get(this.currentIndex);
        CharSequence text = this.captionEdit.getText();
        CharSequence[] charSequenceArr = {text};
        if (this.hasCaptionForAllMedia && !TextUtils.equals(this.captionForAllMedia, text) && this.placeProvider.getPhotoIndex(this.currentIndex) != 0 && this.placeProvider.getSelectedCount() > 0) {
            this.hasCaptionForAllMedia = false;
        }
        ArrayList<TLRPC$MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, supportsSendingNewEntities());
        this.captionForAllMedia = charSequenceArr[0];
        if (obj instanceof MediaController.PhotoEntry) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            photoEntry.caption = charSequenceArr[0];
            photoEntry.entities = entities;
        } else if (obj instanceof MediaController.SearchImage) {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            searchImage.caption = charSequenceArr[0];
            searchImage.entities = entities;
        }
        if (text.length() != 0 && !this.placeProvider.isPhotoChecked(this.currentIndex)) {
            setPhotoChecked();
        }
        PhotoViewerProvider photoViewerProvider = this.placeProvider;
        if (photoViewerProvider != null) {
            photoViewerProvider.onApplyCaption(text);
        }
        return text;
    }

    public void updateVideoPlayerTime() {
        String format;
        String format2;
        Arrays.fill(this.videoPlayerCurrentTime, 0);
        Arrays.fill(this.videoPlayerTotalTime, 0);
        VideoPlayer videoPlayer = this.videoPlayer;
        long j = 0;
        if (videoPlayer != null) {
            long max = Math.max(0L, videoPlayer.getCurrentPosition());
            if (this.shownControlsByEnd && !this.actionBarWasShownBeforeByEnd) {
                max = 0;
            }
            long max2 = Math.max(0L, this.videoPlayer.getDuration());
            if (!this.inPreview && this.videoTimelineViewContainer.getVisibility() == 0) {
                max2 = ((float) max2) * (this.videoTimelineView.getRightProgress() - this.videoTimelineView.getLeftProgress());
                max = ((float) max) - (this.videoTimelineView.getLeftProgress() * ((float) max2));
                if (max > max2) {
                    max = max2;
                }
            }
            long j2 = max / 1000;
            long j3 = max2 / 1000;
            int[] iArr = this.videoPlayerCurrentTime;
            iArr[0] = (int) (j2 / 60);
            iArr[1] = (int) (j2 % 60);
            int[] iArr2 = this.videoPlayerTotalTime;
            iArr2[0] = (int) (j3 / 60);
            iArr2[1] = (int) (j3 % 60);
        } else {
            PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
            if (photoViewerWebView != null && photoViewerWebView.isControllable()) {
                long max3 = Math.max(0, this.photoViewerWebView.getCurrentPosition());
                if (!this.shownControlsByEnd || this.actionBarWasShownBeforeByEnd) {
                    j = max3;
                }
                long max4 = Math.max(0, this.photoViewerWebView.getVideoDuration());
                if (!this.inPreview && this.videoTimelineViewContainer.getVisibility() == 0) {
                    max4 = ((float) max4) * (this.videoTimelineView.getRightProgress() - this.videoTimelineView.getLeftProgress());
                    j = ((float) j) - (this.videoTimelineView.getLeftProgress() * ((float) max4));
                    if (j > max4) {
                        j = max4;
                    }
                }
                long j4 = j / 1000;
                long j5 = max4 / 1000;
                int[] iArr3 = this.videoPlayerCurrentTime;
                iArr3[0] = (int) (j4 / 60);
                iArr3[1] = (int) (j4 % 60);
                int[] iArr4 = this.videoPlayerTotalTime;
                iArr4[0] = (int) (j5 / 60);
                iArr4[1] = (int) (j5 % 60);
            }
        }
        int[] iArr5 = this.videoPlayerCurrentTime;
        if (iArr5[0] >= 60) {
            format = format(iArr5[0] / 60, iArr5[0] % 60, iArr5[1]);
        } else {
            format = format(iArr5[0], iArr5[1]);
        }
        int[] iArr6 = this.videoPlayerTotalTime;
        if (iArr6[0] >= 60) {
            format2 = format(iArr6[0] / 60, iArr6[0] % 60, iArr6[1]);
        } else {
            format2 = format(iArr6[0], iArr6[1]);
        }
        this.videoPlayerTime.setText(format + " / " + format2);
        if (Objects.equals(this.lastControlFrameDuration, format2)) {
            return;
        }
        this.lastControlFrameDuration = format2;
        this.videoPlayerControlFrameLayout.requestLayout();
    }

    private String format(int i, int i2, int i3) {
        char[] cArr = new char[8];
        cArr[0] = (char) (((i >= 100 ? 99 : i) / 10) + 48);
        if (i >= 100) {
            i = 99;
        }
        cArr[1] = (char) ((i % 10) + 48);
        cArr[2] = ':';
        cArr[3] = (char) (((i2 >= 100 ? 99 : i2) / 10) + 48);
        if (i2 >= 100) {
            i2 = 99;
        }
        cArr[4] = (char) ((i2 % 10) + 48);
        cArr[5] = ':';
        cArr[6] = (char) (((i3 >= 100 ? 99 : i3) / 10) + 48);
        if (i3 >= 100) {
            i3 = 99;
        }
        cArr[7] = (char) ((i3 % 10) + 48);
        return new String(cArr);
    }

    private String format(int i, int i2) {
        char[] cArr = new char[5];
        cArr[0] = (char) (((i >= 100 ? 99 : i) / 10) + 48);
        if (i >= 100) {
            i = 99;
        }
        cArr[1] = (char) ((i % 10) + 48);
        cArr[2] = ':';
        cArr[3] = (char) (((i2 >= 100 ? 99 : i2) / 10) + 48);
        if (i2 >= 100) {
            i2 = 99;
        }
        cArr[4] = (char) ((i2 % 10) + 48);
        return new String(cArr);
    }

    private void checkBufferedProgress(float f) {
        MessageObject messageObject;
        TLRPC$Document document;
        if (!this.isStreaming || this.parentActivity == null || this.streamingAlertShown || this.videoPlayer == null || (messageObject = this.currentMessageObject) == null || (document = messageObject.getDocument()) == null || this.currentMessageObject.getDuration() < 20.0d) {
            return;
        }
        boolean z = document.size >= 2147483648L;
        if (!((DownloadController.getInstance(this.currentAccount).getAutodownloadMask() & 4) != 0) || f >= 0.9f) {
            return;
        }
        long j = document.size;
        if (((float) j) * f >= 5242880.0f || (f >= 0.5f && j >= 2097152)) {
            if (Math.abs(SystemClock.elapsedRealtime() - this.startedPlayTime) >= (z ? 10000 : 3000)) {
                if (this.videoPlayer.getDuration() == -9223372036854775807L) {
                    Toast.makeText(this.parentActivity, LocaleController.getString("VideoDoesNotSupportStreaming", R.string.VideoDoesNotSupportStreaming), 1).show();
                }
                this.streamingAlertShown = true;
            }
        }
    }

    public void updateColors() {
        int i = Theme.key_chat_editMediaButton;
        int themedColor = getThemedColor(i);
        ImageView imageView = this.pickerViewSendButton;
        if (imageView != null) {
            Drawable background = imageView.getBackground();
            Theme.setSelectorDrawableColor(background, themedColor, false);
            Theme.setSelectorDrawableColor(background, getThemedColor(Build.VERSION.SDK_INT >= 21 ? Theme.key_dialogFloatingButtonPressed : i), true);
            this.pickerViewSendButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_dialogFloatingIcon), PorterDuff.Mode.MULTIPLY));
        }
        CheckBox checkBox = this.checkImageView;
        if (checkBox != null) {
            checkBox.setColor(getThemedColor(i), -1);
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        ImageView imageView2 = this.paintItem;
        if (imageView2 != null && imageView2.getColorFilter() != null) {
            this.paintItem.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView3 = this.cropItem;
        if (imageView3 != null && imageView3.getColorFilter() != null) {
            this.cropItem.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView4 = this.tuneItem;
        if (imageView4 != null && imageView4.getColorFilter() != null) {
            this.tuneItem.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView5 = this.rotateItem;
        if (imageView5 != null && imageView5.getColorFilter() != null) {
            this.rotateItem.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView6 = this.mirrorItem;
        if (imageView6 != null && imageView6.getColorFilter() != null) {
            this.mirrorItem.setColorFilter(porterDuffColorFilter);
        }
        PickerBottomLayoutViewer pickerBottomLayoutViewer = this.editorDoneLayout;
        if (pickerBottomLayoutViewer != null) {
            pickerBottomLayoutViewer.doneButton.setTextColor(themedColor);
        }
        PickerBottomLayoutViewer pickerBottomLayoutViewer2 = this.qualityPicker;
        if (pickerBottomLayoutViewer2 != null) {
            pickerBottomLayoutViewer2.doneButton.setTextColor(themedColor);
        }
        LPhotoPaintView lPhotoPaintView = this.photoPaintView;
        if (lPhotoPaintView != null) {
            lPhotoPaintView.updateColors();
        }
        PhotoFilterView photoFilterView = this.photoFilterView;
        if (photoFilterView != null) {
            photoFilterView.updateColors();
        }
        CaptionPhotoViewer captionPhotoViewer = this.captionEdit;
        if (captionPhotoViewer != null) {
            captionPhotoViewer.updateColors(this.resourcesProvider);
        }
        VideoTimelinePlayView videoTimelinePlayView = this.videoTimelineView;
        if (videoTimelinePlayView != null) {
            videoTimelinePlayView.invalidate();
        }
        SelectedPhotosListView selectedPhotosListView = this.selectedPhotosListView;
        if (selectedPhotosListView != null) {
            int childCount = selectedPhotosListView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.selectedPhotosListView.getChildAt(i2);
                if (childAt instanceof PhotoPickerPhotoCell) {
                    ((PhotoPickerPhotoCell) childAt).updateColors();
                }
            }
        }
        StickersAlert stickersAlert = this.masksAlert;
        if (stickersAlert != null) {
            stickersAlert.updateColors(true);
        }
    }

    public void injectVideoPlayer(VideoPlayer videoPlayer) {
        this.injectingVideoPlayer = videoPlayer;
    }

    public void injectVideoPlayerSurface(SurfaceTexture surfaceTexture) {
        this.injectingVideoPlayerSurface = surfaceTexture;
    }

    public boolean isInjectingVideoPlayer() {
        return this.injectingVideoPlayer != null;
    }

    public void scheduleActionBarHide() {
        scheduleActionBarHide(3000);
    }

    private void scheduleActionBarHide(int i) {
        if (isAccessibilityEnabled()) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.hideActionBarRunnable);
        AndroidUtilities.runOnUIThread(this.hideActionBarRunnable, i);
    }

    private boolean isAccessibilityEnabled() {
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.activityContext.getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                return accessibilityManager.isTouchExplorationEnabled();
            }
            return false;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public void updateWebPlayerState(boolean z, int i) {
        updatePlayerState(z, i);
    }

    public void updatePlayerState(boolean z, int i) {
        VideoPlayer videoPlayer;
        MessageObject messageObject;
        TLRPC$MessageMedia tLRPC$MessageMedia;
        TLRPC$WebPage tLRPC$WebPage;
        PhotoViewerWebView photoViewerWebView;
        if (this.videoPlayer != null || ((photoViewerWebView = this.photoViewerWebView) != null && photoViewerWebView.isControllable())) {
            PhotoViewerWebView photoViewerWebView2 = this.photoViewerWebView;
            if (photoViewerWebView2 != null && photoViewerWebView2.isControllable() && !z) {
                toggleActionBar(true, true);
            }
            PhotoViewerWebView photoViewerWebView3 = this.photoViewerWebView;
            float f = 0.0f;
            if (photoViewerWebView3 != null && photoViewerWebView3.isControllable() && i == 3 && getVideoDuration() >= 10000 && this.shouldSavePositionForCurrentVideo == null && this.shouldSavePositionForCurrentVideoShortTerm == null) {
                if (this.currentMessageObject != null) {
                    long videoDuration = getVideoDuration() / 1000;
                    TLRPC$Message tLRPC$Message = this.currentMessageObject.messageOwner;
                    String str = (tLRPC$Message == null || (tLRPC$MessageMedia = tLRPC$Message.media) == null || (tLRPC$WebPage = tLRPC$MessageMedia.webpage) == null) ? null : tLRPC$WebPage.url;
                    if (!TextUtils.isEmpty(str)) {
                        if (videoDuration >= 600) {
                            if (this.currentMessageObject.forceSeekTo < 0.0f) {
                                float f2 = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).getFloat(str, -1.0f);
                                if (f2 > 0.0f && f2 < 0.999f) {
                                    this.currentMessageObject.forceSeekTo = f2;
                                    this.videoPlayerSeekbar.setProgress(f2);
                                }
                            }
                            this.shouldSavePositionForCurrentVideo = str;
                        } else if (videoDuration >= 10) {
                            SavedVideoPosition savedVideoPosition = null;
                            for (int size = this.savedVideoPositions.size() - 1; size >= 0; size--) {
                                SavedVideoPosition valueAt = this.savedVideoPositions.valueAt(size);
                                if (valueAt.timestamp < SystemClock.elapsedRealtime() - 5000) {
                                    this.savedVideoPositions.removeAt(size);
                                } else if (savedVideoPosition == null && this.savedVideoPositions.keyAt(size).equals(str)) {
                                    savedVideoPosition = valueAt;
                                }
                            }
                            MessageObject messageObject2 = this.currentMessageObject;
                            if (messageObject2.forceSeekTo < 0.0f && savedVideoPosition != null) {
                                float f3 = savedVideoPosition.position;
                                if (f3 > 0.0f && f3 < 0.999f) {
                                    messageObject2.forceSeekTo = f3;
                                    this.videoPlayerSeekbar.setProgress(f3);
                                }
                            }
                            this.shouldSavePositionForCurrentVideoShortTerm = str;
                        }
                    }
                }
                MessageObject messageObject3 = this.currentMessageObject;
                if (messageObject3 != null) {
                    float f4 = messageObject3.forceSeekTo;
                    if (f4 >= 0.0f) {
                        seekVideoOrWebToProgress(f4);
                        this.currentMessageObject.forceSeekTo = -1.0f;
                    }
                }
            }
            if (this.isStreaming) {
                if (i != 2 || !this.skipFirstBufferingProgress) {
                    boolean z2 = this.seekToProgressPending != 0.0f || i == 2;
                    if (z2) {
                        AndroidUtilities.cancelRunOnUIThread(this.hideActionBarRunnable);
                    } else {
                        scheduleActionBarHide();
                    }
                    toggleMiniProgress(z2, true);
                } else if (z) {
                    this.skipFirstBufferingProgress = false;
                }
            }
            AspectRatioFrameLayout aspectRatioFrameLayout = this.aspectRatioFrameLayout;
            if (aspectRatioFrameLayout != null) {
                aspectRatioFrameLayout.setKeepScreenOn((!z || i == 4 || i == 1) ? false : true);
            }
            if (z && i != 4 && i != 1) {
                try {
                    this.parentActivity.getWindow().addFlags(128);
                    this.keepScreenOnFlagSet = true;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else {
                try {
                    this.parentActivity.getWindow().clearFlags(128);
                    this.keepScreenOnFlagSet = false;
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
            if (i == 3 || i == 1) {
                if (this.currentMessageObject != null && (videoPlayer = this.videoPlayer) != null) {
                    this.videoPreviewFrame.open(videoPlayer.getCurrentUri());
                }
                float f5 = this.seekToProgressPending;
                if (f5 != 0.0f) {
                    seekVideoOrWebToProgress(f5);
                    this.seekToProgressPending = 0.0f;
                    MessageObject messageObject4 = this.currentMessageObject;
                    if (messageObject4 != null && !FileLoader.getInstance(messageObject4.currentAccount).isLoadingVideoAny(this.currentMessageObject.getDocument())) {
                        this.skipFirstBufferingProgress = true;
                    }
                }
            }
            if (i == 3) {
                AspectRatioFrameLayout aspectRatioFrameLayout2 = this.aspectRatioFrameLayout;
                if (aspectRatioFrameLayout2 != null && aspectRatioFrameLayout2.getVisibility() != 0) {
                    this.aspectRatioFrameLayout.setVisibility(0);
                }
                if (!this.pipItem.isEnabled() && this.pipItem.getVisibility() == 0) {
                    this.pipAvailable = true;
                    this.pipItem.setEnabled(true);
                    this.pipItem.animate().alpha(1.0f).setDuration(175L).withEndAction(null).start();
                }
                this.playerWasReady = true;
                MessageObject messageObject5 = this.currentMessageObject;
                if (messageObject5 != null && messageObject5.isVideo()) {
                    AndroidUtilities.cancelRunOnUIThread(this.setLoadingRunnable);
                    FileLoader.getInstance(this.currentMessageObject.currentAccount).removeLoadingVideo(this.currentMessageObject.getDocument(), true, false);
                }
            } else if (i == 2 && z && (messageObject = this.currentMessageObject) != null && messageObject.isVideo()) {
                if (this.playerWasReady) {
                    this.setLoadingRunnable.run();
                } else {
                    AndroidUtilities.runOnUIThread(this.setLoadingRunnable, 1000L);
                }
            }
            VideoPlayer videoPlayer2 = this.videoPlayer;
            if (videoPlayer2 == null ? this.photoViewerWebView.isPlaying() : videoPlayer2.isPlaying()) {
                if (i != 4) {
                    if (!this.isPlaying) {
                        this.isPlaying = true;
                        this.photoProgressViews[0].setBackgroundState(this.isCurrentVideo ? -1 : 4, false, true);
                        PhotoProgressView photoProgressView = this.photoProgressViews[0];
                        if (this.isCurrentVideo || ((isAccessibilityEnabled() && !this.playerWasPlaying) || ((!this.playerAutoStarted || this.playerWasPlaying) && this.isActionBarVisible))) {
                            f = 1.0f;
                        }
                        photoProgressView.setIndexedAlpha(1, f, false);
                        this.playerWasPlaying = true;
                        AndroidUtilities.runOnUIThread(this.updateProgressRunnable);
                    }
                    PipVideoOverlay.updatePlayButton();
                    this.videoPlayerSeekbar.updateTimestamps(this.currentMessageObject, getVideoDuration());
                    updateVideoPlayerTime();
                }
            }
            if (this.isPlaying || i == 4) {
                if (this.currentEditMode != 3) {
                    this.photoProgressViews[0].setIndexedAlpha(1, 1.0f, i == 4);
                    PhotoProgressView[] photoProgressViewArr = this.photoProgressViews;
                    photoProgressViewArr[0].setBackgroundState(3, false, photoProgressViewArr[0].animAlphas[1] > 0.0f);
                }
                this.isPlaying = false;
                AndroidUtilities.cancelRunOnUIThread(this.updateProgressRunnable);
                if (i == 4) {
                    if (this.isCurrentVideo) {
                        if (!this.videoTimelineView.isDragging()) {
                            VideoTimelinePlayView videoTimelinePlayView = this.videoTimelineView;
                            videoTimelinePlayView.setProgress(videoTimelinePlayView.getLeftProgress());
                            if (!this.inPreview && (this.currentEditMode != 0 || this.videoTimelineViewContainer.getVisibility() == 0)) {
                                seekVideoOrWebToProgress(this.videoTimelineView.getLeftProgress());
                            } else {
                                seekVideoOrWebToProgress(0.0f);
                            }
                            this.manuallyPaused = false;
                            cancelVideoPlayRunnable();
                            if (this.sendPhotoType != 1 && this.currentEditMode == 0 && this.switchingToMode <= 0) {
                                pauseVideoOrWeb();
                            } else {
                                playVideoOrWeb();
                            }
                            this.containerView.invalidate();
                        }
                    } else {
                        this.videoPlayerSeekbar.setProgress(0.0f);
                        this.videoPlayerSeekbarView.invalidate();
                        if (!this.inPreview && this.videoTimelineViewContainer.getVisibility() == 0) {
                            seekVideoOrWebToProgress(this.videoTimelineView.getLeftProgress());
                        } else {
                            seekVideoOrWebToProgress(0.0f);
                        }
                        this.manuallyPaused = false;
                        pauseVideoOrWeb();
                        if (!this.isActionBarVisible) {
                            toggleActionBar(true, true);
                        }
                    }
                    PipVideoOverlay.onVideoCompleted();
                }
            }
            PipVideoOverlay.updatePlayButton();
            this.videoPlayerSeekbar.updateTimestamps(this.currentMessageObject, getVideoDuration());
            updateVideoPlayerTime();
        }
    }

    public void playVideoOrWeb() {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.play();
            return;
        }
        PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
        if (photoViewerWebView != null) {
            photoViewerWebView.playVideo();
        }
    }

    public void pauseVideoOrWeb() {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.pause();
            return;
        }
        PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
        if (photoViewerWebView != null) {
            photoViewerWebView.pauseVideo();
        }
    }

    private void seekVideoOrWebToProgress(float f) {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.seekTo(f * ((float) videoPlayer.getDuration()));
            return;
        }
        PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
        if (photoViewerWebView != null) {
            photoViewerWebView.seekTo(f * photoViewerWebView.getVideoDuration());
        }
    }

    private void preparePlayer(Uri uri, boolean z, boolean z2) {
        preparePlayer(uri, z, z2, null);
    }

    private void preparePlayer(Uri uri, boolean z, boolean z2, MediaController.SavedFilterState savedFilterState) {
        boolean z3;
        PageBlocksAdapter pageBlocksAdapter;
        if (!z2) {
            this.currentPlayingVideoFile = uri;
        }
        if (this.parentActivity == null) {
            return;
        }
        this.streamingAlertShown = false;
        this.startedPlayTime = SystemClock.elapsedRealtime();
        this.currentVideoFinishedLoading = false;
        this.lastBufferedPositionCheck = 0L;
        this.firstAnimationDelay = true;
        this.inPreview = z2;
        releasePlayer(false);
        SavedVideoPosition savedVideoPosition = null;
        if (this.imagesArrLocals.isEmpty()) {
            createVideoTextureView(null);
        }
        if (Build.VERSION.SDK_INT >= 21 && this.textureImageView == null) {
            ImageView imageView = new ImageView(this.parentActivity);
            this.textureImageView = imageView;
            imageView.setBackgroundColor(-65536);
            this.textureImageView.setPivotX(0.0f);
            this.textureImageView.setPivotY(0.0f);
            this.textureImageView.setVisibility(4);
            this.containerView.addView(this.textureImageView);
        }
        checkFullscreenButton();
        if (this.orientationEventListener == null) {
            OrientationEventListener orientationEventListener = new OrientationEventListener(ApplicationLoader.applicationContext) {
                {
                    PhotoViewer.this = this;
                }

                @Override
                public void onOrientationChanged(int i) {
                    if (PhotoViewer.this.orientationEventListener == null || PhotoViewer.this.aspectRatioFrameLayout == null || PhotoViewer.this.aspectRatioFrameLayout.getVisibility() != 0 || PhotoViewer.this.parentActivity == null || PhotoViewer.this.fullscreenedByButton == 0) {
                        return;
                    }
                    if (PhotoViewer.this.fullscreenedByButton != 1) {
                        if (i <= 0 || (i < 330 && i > 30)) {
                            if (!PhotoViewer.this.wasRotated || i < 240 || i > 300) {
                                return;
                            }
                            PhotoViewer.this.parentActivity.setRequestedOrientation(PhotoViewer.this.prevOrientation);
                            PhotoViewer.this.fullscreenedByButton = 0;
                            PhotoViewer.this.wasRotated = false;
                            return;
                        }
                        PhotoViewer.this.wasRotated = true;
                    } else if (i < 240 || i > 300) {
                        if (!PhotoViewer.this.wasRotated || i <= 0) {
                            return;
                        }
                        if (i >= 330 || i <= 30) {
                            PhotoViewer.this.parentActivity.setRequestedOrientation(PhotoViewer.this.prevOrientation);
                            PhotoViewer.this.fullscreenedByButton = 0;
                            PhotoViewer.this.wasRotated = false;
                        }
                    } else {
                        PhotoViewer.this.wasRotated = true;
                    }
                }
            };
            this.orientationEventListener = orientationEventListener;
            if (orientationEventListener.canDetectOrientation()) {
                this.orientationEventListener.enable();
            } else {
                this.orientationEventListener.disable();
                this.orientationEventListener = null;
            }
        }
        this.textureUploaded = false;
        this.videoSizeSet = false;
        this.videoCrossfadeStarted = false;
        this.playerWasReady = false;
        this.playerWasPlaying = false;
        this.captureFrameReadyAtTime = -1L;
        this.captureFrameAtTime = -1L;
        this.needCaptureFrameReadyAtTime = -1L;
        this.firstFrameRendered = false;
        if (this.videoPlayer == null) {
            VideoPlayer videoPlayer = this.injectingVideoPlayer;
            if (videoPlayer != null) {
                this.videoPlayer = videoPlayer;
                this.injectingVideoPlayer = null;
                this.playerInjected = true;
                updatePlayerState(videoPlayer.getPlayWhenReady(), this.videoPlayer.getPlaybackState());
                z3 = false;
            } else {
                this.videoPlayer = new VideoPlayer() {
                    {
                        PhotoViewer.this = this;
                    }

                    @Override
                    public void play() {
                        super.play();
                        PhotoViewer.this.playOrStopAnimatedStickers(true);
                    }

                    @Override
                    public void pause() {
                        super.pause();
                        if (PhotoViewer.this.currentEditMode == 0) {
                            PhotoViewer.this.playOrStopAnimatedStickers(false);
                        }
                    }

                    @Override
                    public void seekTo(long j) {
                        super.seekTo(j);
                        if (PhotoViewer.this.isCurrentVideo) {
                            PhotoViewer.this.seekAnimatedStickersTo(j);
                        }
                    }

                    @Override
                    public void onRenderedFirstFrame() {
                        super.onRenderedFirstFrame();
                        PhotoViewer.this.firstFrameRendered = true;
                        if (PhotoViewer.this.usedSurfaceView) {
                            PhotoViewer.this.containerView.invalidate();
                        }
                    }
                };
                z3 = true;
            }
            TextureView textureView = this.videoTextureView;
            if (textureView != null) {
                this.videoPlayer.setTextureView(textureView);
            } else {
                SurfaceView surfaceView = this.videoSurfaceView;
                if (surfaceView != null) {
                    this.videoPlayer.setSurfaceView(surfaceView);
                }
            }
            FirstFrameView firstFrameView = this.firstFrameView;
            if (firstFrameView != null) {
                firstFrameView.clear();
            }
            this.videoPlayer.setDelegate(new AnonymousClass51());
        } else {
            z3 = false;
        }
        if (!this.imagesArrLocals.isEmpty()) {
            createVideoTextureView(savedFilterState);
        }
        this.videoCrossfadeAlpha = 0.0f;
        TextureView textureView2 = this.videoTextureView;
        if (textureView2 != null) {
            textureView2.setAlpha(0.0f);
        }
        SurfaceView surfaceView2 = this.videoSurfaceView;
        if (surfaceView2 != null) {
            surfaceView2.setVisibility(4);
        }
        PaintingOverlay paintingOverlay = this.paintingOverlay;
        if (paintingOverlay != null) {
            paintingOverlay.setAlpha(this.videoCrossfadeAlpha);
        }
        this.shouldSavePositionForCurrentVideo = null;
        this.shouldSavePositionForCurrentVideoShortTerm = null;
        this.lastSaveTime = 0L;
        if (z3) {
            this.seekToProgressPending = this.seekToProgressPending2;
            this.videoPlayerSeekbar.setProgress(0.0f);
            VideoTimelinePlayView videoTimelinePlayView = this.videoTimelineView;
            videoTimelinePlayView.setProgress(videoTimelinePlayView.getLeftProgress());
            this.videoPlayerSeekbar.setBufferedProgress(0.0f);
            MessageObject messageObject = this.currentMessageObject;
            if (messageObject != null) {
                int duration = (int) messageObject.getDuration();
                String fileName = this.currentMessageObject.getFileName();
                if (!TextUtils.isEmpty(fileName)) {
                    if (duration >= 600) {
                        if (this.currentMessageObject.forceSeekTo < 0.0f) {
                            float f = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).getFloat(fileName, -1.0f);
                            if (f > 0.0f && f < 0.999f) {
                                this.currentMessageObject.forceSeekTo = f;
                                this.videoPlayerSeekbar.setProgress(f);
                            }
                        }
                        this.shouldSavePositionForCurrentVideo = fileName;
                    } else if (duration >= 10) {
                        for (int size = this.savedVideoPositions.size() - 1; size >= 0; size--) {
                            SavedVideoPosition valueAt = this.savedVideoPositions.valueAt(size);
                            if (valueAt.timestamp < SystemClock.elapsedRealtime() - 5000) {
                                this.savedVideoPositions.removeAt(size);
                            } else if (savedVideoPosition == null && this.savedVideoPositions.keyAt(size).equals(fileName)) {
                                savedVideoPosition = valueAt;
                            }
                        }
                        MessageObject messageObject2 = this.currentMessageObject;
                        if (messageObject2 != null && messageObject2.forceSeekTo < 0.0f && savedVideoPosition != null) {
                            float f2 = savedVideoPosition.position;
                            if (f2 > 0.0f && f2 < 0.999f) {
                                messageObject2.forceSeekTo = f2;
                                this.videoPlayerSeekbar.setProgress(f2);
                            }
                        }
                        this.shouldSavePositionForCurrentVideoShortTerm = fileName;
                    }
                }
            }
            this.videoPlayer.preparePlayer(uri, "other");
            this.videoPlayer.setPlayWhenReady(z);
        }
        MessageObject messageObject3 = this.currentMessageObject;
        boolean z4 = (messageObject3 != null && messageObject3.getDuration() <= 30.0d) || ((pageBlocksAdapter = this.pageBlocksAdapter) != null && pageBlocksAdapter.isHardwarePlayer(this.currentIndex));
        this.playerLooping = z4;
        this.videoPlayerControlFrameLayout.setSeekBarTransitionEnabled(z4);
        this.videoPlayer.setLooping(this.playerLooping);
        MessageObject messageObject4 = this.currentMessageObject;
        if (messageObject4 != null) {
            float f3 = messageObject4.forceSeekTo;
            if (f3 >= 0.0f) {
                this.seekToProgressPending = f3;
                messageObject4.forceSeekTo = -1.0f;
            }
        }
        TLRPC$BotInlineResult tLRPC$BotInlineResult = this.currentBotInlineResult;
        if (tLRPC$BotInlineResult != null && (tLRPC$BotInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || MessageObject.isVideoDocument(this.currentBotInlineResult.document))) {
            this.bottomLayout.setVisibility(0);
            this.bottomLayout.setPadding(0, 0, AndroidUtilities.dp(84.0f), 0);
            this.pickerView.setVisibility(8);
        } else {
            this.bottomLayout.setPadding(0, 0, 0, 0);
        }
        if (this.pageBlocksAdapter != null) {
            this.bottomLayout.setVisibility(0);
        }
        PageBlocksAdapter pageBlocksAdapter2 = this.pageBlocksAdapter;
        if (pageBlocksAdapter2 != null && pageBlocksAdapter2.isHardwarePlayer(this.currentIndex) && !this.pageBlocksAdapter.isVideo(this.currentIndex)) {
            setVideoPlayerControlVisible(false, true);
        } else {
            setVideoPlayerControlVisible(!this.isCurrentVideo, true);
        }
        if (!this.isCurrentVideo) {
            scheduleActionBarHide(this.playerAutoStarted ? 3000 : 1000);
        }
        if (this.currentMessageObject != null) {
            this.videoPlayer.setPlaybackSpeed(this.currentVideoSpeed);
        }
        this.inPreview = z2;
    }

    public class AnonymousClass51 implements VideoPlayer.VideoPlayerDelegate {
        private boolean firstState = true;

        @Override
        public void onSeekFinished(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekFinished(this, eventTime);
        }

        @Override
        public void onSeekStarted(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekStarted(this, eventTime);
        }

        AnonymousClass51() {
            PhotoViewer.this = r1;
        }

        @Override
        public void onStateChanged(boolean z, int i) {
            if (this.firstState && PhotoViewer.this.videoPlayer != null && PhotoViewer.this.videoPlayer.getDuration() != -9223372036854775807L) {
                this.firstState = false;
                if (PhotoViewer.this.imagesArr.isEmpty() && PhotoViewer.this.secureDocuments.isEmpty() && PhotoViewer.this.imagesArrLocations.isEmpty() && !PhotoViewer.this.imagesArrLocals.isEmpty() && PhotoViewer.this.switchingToIndex >= 0 && PhotoViewer.this.switchingToIndex < PhotoViewer.this.imagesArrLocals.size()) {
                    Object obj = PhotoViewer.this.imagesArrLocals.get(PhotoViewer.this.switchingToIndex);
                    if (obj instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        if (photoEntry.isVideo && photoEntry.editedInfo != null) {
                            PhotoViewer.this.videoPlayer.seekTo(photoEntry.editedInfo.start * ((float) PhotoViewer.this.videoPlayer.getDuration()));
                            if (PhotoViewer.this.videoTimelineView != null) {
                                PhotoViewer.this.videoTimelineView.setProgress(photoEntry.editedInfo.start);
                            }
                        }
                    }
                }
            }
            PhotoViewer.this.updatePlayerState(z, i);
        }

        @Override
        public void onError(VideoPlayer videoPlayer, Exception exc) {
            if (PhotoViewer.this.videoPlayer != videoPlayer) {
                return;
            }
            FileLog.e(exc);
            if (PhotoViewer.this.menuItem.isSubItemVisible(11)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PhotoViewer.this.parentActivity, PhotoViewer.this.resourcesProvider);
                builder.setTitle(LocaleController.getString("AppName", R.string.AppName));
                builder.setMessage(LocaleController.getString("CantPlayVideo", R.string.CantPlayVideo));
                builder.setPositiveButton(LocaleController.getString("Open", R.string.Open), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        PhotoViewer.AnonymousClass51.this.lambda$onError$0(dialogInterface, i);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                PhotoViewer.this.showAlertDialog(builder);
            }
        }

        public void lambda$onError$0(DialogInterface dialogInterface, int i) {
            try {
                AndroidUtilities.openForView(PhotoViewer.this.currentMessageObject, PhotoViewer.this.parentActivity, PhotoViewer.this.resourcesProvider);
                PhotoViewer.this.closePhoto(false, false);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void onVideoSizeChanged(int i, int i2, int i3, float f) {
            if (PhotoViewer.this.aspectRatioFrameLayout != null) {
                if (i3 == 90 || i3 == 270) {
                    i2 = i;
                    i = i2;
                }
                float f2 = i * f;
                int i4 = (int) f2;
                PhotoViewer.this.videoWidth = i4;
                float f3 = i2;
                PhotoViewer.this.videoHeight = (int) (f * f3);
                PhotoViewer.this.aspectRatioFrameLayout.setAspectRatio(i2 == 0 ? 1.0f : f2 / f3, i3);
                if (PhotoViewer.this.videoTextureView instanceof VideoEditTextureView) {
                    ((VideoEditTextureView) PhotoViewer.this.videoTextureView).setHDRInfo(PhotoViewer.this.videoPlayer.getHDRStaticInfo(null));
                    ((VideoEditTextureView) PhotoViewer.this.videoTextureView).setVideoSize(i4, i2);
                    if (PhotoViewer.this.sendPhotoType == 1) {
                        PhotoViewer.this.setCropBitmap();
                    }
                }
                PhotoViewer.this.videoSizeSet = true;
            }
        }

        @Override
        public void onRenderedFirstFrame() {
            if (!PhotoViewer.this.textureUploaded) {
                PhotoViewer.this.textureUploaded = true;
                PhotoViewer.this.containerView.invalidate();
            }
            if (PhotoViewer.this.firstFrameView != null) {
                if (PhotoViewer.this.videoPlayer == null || !PhotoViewer.this.videoPlayer.isLooping()) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PhotoViewer.AnonymousClass51.this.lambda$onRenderedFirstFrame$1();
                        }
                    }, 64L);
                }
            }
        }

        public void lambda$onRenderedFirstFrame$1() {
            PhotoViewer.this.firstFrameView.updateAlpha();
        }

        @Override
        public void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime) {
            if (eventTime.eventPlaybackPositionMs == PhotoViewer.this.needCaptureFrameReadyAtTime) {
                PhotoViewer.this.captureFrameReadyAtTime = eventTime.eventPlaybackPositionMs;
                PhotoViewer.this.needCaptureFrameReadyAtTime = -1L;
                PhotoViewer.this.captureCurrentFrame();
            }
            if (PhotoViewer.this.firstFrameView != null) {
                if (PhotoViewer.this.videoPlayer == null || !PhotoViewer.this.videoPlayer.isLooping()) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PhotoViewer.AnonymousClass51.this.lambda$onRenderedFirstFrame$2();
                        }
                    }, 64L);
                }
            }
        }

        public void lambda$onRenderedFirstFrame$2() {
            PhotoViewer.this.firstFrameView.updateAlpha();
        }

        @Override
        public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
            if (PhotoViewer.this.changingTextureView) {
                PhotoViewer.this.changingTextureView = false;
                if (PhotoViewer.this.isInline) {
                    PhotoViewer.this.waitingForFirstTextureUpload = 1;
                    PhotoViewer.this.changedTextureView.setSurfaceTexture(surfaceTexture);
                    PhotoViewer.this.changedTextureView.setSurfaceTextureListener(PhotoViewer.this.surfaceTextureListener);
                    PhotoViewer.this.changedTextureView.setVisibility(0);
                    return true;
                }
            }
            return false;
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            PhotoViewer.this.checkChangedTextureView(false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.AnonymousClass51.this.lambda$onSurfaceTextureUpdated$3();
                }
            });
        }

        public void lambda$onSurfaceTextureUpdated$3() {
            if (PhotoViewer.this.firstFrameView != null) {
                PhotoViewer.this.firstFrameView.checkFromPlayer(PhotoViewer.this.videoPlayer);
            }
        }
    }

    public void checkFullscreenButton() {
        int measuredWidth;
        TextureView textureView;
        int measuredHeight;
        TextureView textureView2;
        float f;
        MessageObject messageObject;
        if (this.imagesArr.isEmpty()) {
            for (int i = 0; i < 3; i++) {
                this.fullscreenButton[i].setVisibility(4);
            }
            return;
        }
        int i2 = 0;
        while (i2 < 3) {
            int i3 = this.currentIndex;
            if (i2 == 1) {
                i3++;
            } else if (i2 == 2) {
                i3--;
            }
            if (i3 < 0 || i3 >= this.imagesArr.size()) {
                this.fullscreenButton[i2].setVisibility(4);
            } else {
                MessageObject messageObject2 = this.imagesArr.get(i3);
                if (!messageObject2.isVideo() && !messageObject2.isYouTubeVideo()) {
                    this.fullscreenButton[i2].setVisibility(4);
                } else {
                    boolean z = messageObject2.isYouTubeVideo() && (messageObject = this.currentMessageObject) != null && messageObject.getId() == messageObject2.getId();
                    if (z) {
                        measuredWidth = messageObject2.messageOwner.media.webpage.embed_width;
                    } else {
                        measuredWidth = (i2 != 0 || (textureView = this.videoTextureView) == null) ? 0 : textureView.getMeasuredWidth();
                    }
                    if (z) {
                        measuredHeight = messageObject2.messageOwner.media.webpage.embed_height;
                    } else {
                        measuredHeight = (i2 != 0 || (textureView2 = this.videoTextureView) == null) ? 0 : textureView2.getMeasuredHeight();
                    }
                    TLRPC$Document document = messageObject2.getDocument();
                    if (document != null) {
                        int size = document.attributes.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size) {
                                break;
                            }
                            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = document.attributes.get(i4);
                            if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo) {
                                measuredWidth = tLRPC$DocumentAttribute.w;
                                measuredHeight = tLRPC$DocumentAttribute.h;
                                break;
                            }
                            i4++;
                        }
                    }
                    Point point = AndroidUtilities.displaySize;
                    if (point.y > point.x && measuredWidth > measuredHeight) {
                        if (this.fullscreenButton[i2].getVisibility() != 0) {
                            this.fullscreenButton[i2].setVisibility(0);
                        }
                        if (this.isActionBarVisible) {
                            this.fullscreenButton[i2].setAlpha(1.0f);
                        }
                        ((FrameLayout.LayoutParams) this.fullscreenButton[i2].getLayoutParams()).topMargin = ((this.containerView.getMeasuredHeight() + ((int) (measuredHeight / (measuredWidth / this.containerView.getMeasuredWidth())))) / 2) - AndroidUtilities.dp(48.0f);
                    } else if (this.fullscreenButton[i2].getVisibility() != 4) {
                        this.fullscreenButton[i2].setVisibility(4);
                    }
                    if (this.imageMoveAnimation != null) {
                        float f2 = this.translationX;
                        f = f2 + ((this.animateToX - f2) * this.animationValue);
                    } else {
                        f = this.translationX;
                    }
                    float f3 = 0.0f;
                    if (i2 != 1) {
                        if (i2 == 2) {
                            f3 = ((-AndroidUtilities.displaySize.x) - AndroidUtilities.dp(15.0f)) + (f - this.maxX);
                        } else {
                            float f4 = this.minX;
                            if (f < f4) {
                                f3 = f - f4;
                            }
                        }
                    }
                    this.fullscreenButton[i2].setTranslationX((f3 + AndroidUtilities.displaySize.x) - AndroidUtilities.dp(48.0f));
                }
            }
            i2++;
        }
    }

    private void createVideoTextureView(final MediaController.SavedFilterState savedFilterState) {
        if (this.videoTextureView != null) {
            return;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(this.parentActivity) {
            {
                PhotoViewer.this = this;
            }

            @Override
            public void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                if (PhotoViewer.this.textureImageView != null) {
                    ViewGroup.LayoutParams layoutParams = PhotoViewer.this.textureImageView.getLayoutParams();
                    layoutParams.width = getMeasuredWidth();
                    layoutParams.height = getMeasuredHeight();
                }
                if (PhotoViewer.this.videoTextureView instanceof VideoEditTextureView) {
                    PhotoViewer.this.videoTextureView.setPivotX(PhotoViewer.this.videoTextureView.getMeasuredWidth() / 2);
                    PhotoViewer.this.firstFrameView.setPivotX(PhotoViewer.this.videoTextureView.getMeasuredWidth() / 2);
                } else {
                    if (PhotoViewer.this.videoTextureView != null) {
                        PhotoViewer.this.videoTextureView.setPivotX(0.0f);
                    }
                    if (PhotoViewer.this.videoSurfaceView != null) {
                        PhotoViewer.this.videoSurfaceView.setPivotX(0.0f);
                    }
                    PhotoViewer.this.firstFrameView.setPivotX(0.0f);
                }
                PhotoViewer.this.checkFullscreenButton();
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if (view == PhotoViewer.this.lastFrameImageView && PhotoViewer.this.skipLastFrameDraw) {
                    return true;
                }
                return super.drawChild(canvas, view, j);
            }
        };
        this.aspectRatioFrameLayout = aspectRatioFrameLayout;
        aspectRatioFrameLayout.setWillNotDraw(false);
        this.aspectRatioFrameLayout.setVisibility(4);
        this.containerView.addView(this.aspectRatioFrameLayout, 0, LayoutHelper.createFrame(-1, -1, 17));
        this.usedSurfaceView = false;
        if (this.imagesArrLocals.isEmpty()) {
            if (this.ALLOW_USE_SURFACE && this.injectingVideoPlayerSurface == null) {
                this.videoSurfaceView = new SurfaceView(this.parentActivity);
                this.usedSurfaceView = true;
            } else {
                this.videoTextureView = new TextureView(this.parentActivity);
            }
        } else {
            VideoEditTextureView videoEditTextureView = new VideoEditTextureView(this.parentActivity, this.videoPlayer);
            this.blurManager.resetBitmap();
            videoEditTextureView.updateUiBlurManager(this.blurManager);
            if (savedFilterState != null) {
                videoEditTextureView.setDelegate(new VideoEditTextureView.VideoEditTextureViewDelegate() {
                    @Override
                    public final void onEGLThreadAvailable(FilterGLThread filterGLThread) {
                        PhotoViewer.lambda$createVideoTextureView$59(MediaController.SavedFilterState.this, filterGLThread);
                    }
                });
            }
            this.videoTextureView = videoEditTextureView;
        }
        SurfaceTexture surfaceTexture = this.injectingVideoPlayerSurface;
        if (surfaceTexture != null) {
            this.videoTextureView.setSurfaceTexture(surfaceTexture);
            this.textureUploaded = true;
            this.videoSizeSet = true;
            this.injectingVideoPlayerSurface = null;
        }
        TextureView textureView = this.videoTextureView;
        if (textureView != null) {
            textureView.setPivotX(0.0f);
            this.videoTextureView.setPivotY(0.0f);
            this.videoTextureView.setOpaque(false);
            this.aspectRatioFrameLayout.addView(this.videoTextureView, LayoutHelper.createFrame(-1, -1, 17));
        } else {
            this.aspectRatioFrameLayout.addView(this.videoSurfaceView, LayoutHelper.createFrame(-1, -1, 17));
        }
        FirstFrameView firstFrameView = new FirstFrameView(this.parentActivity);
        this.firstFrameView = firstFrameView;
        firstFrameView.setPivotX(0.0f);
        this.firstFrameView.setPivotY(0.0f);
        this.firstFrameView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.aspectRatioFrameLayout.addView(this.firstFrameView, LayoutHelper.createFrame(-1, -1, 17));
        if (this.sendPhotoType == 1) {
            View view = new View(this.parentActivity);
            this.flashView = view;
            view.setBackgroundColor(-1);
            this.flashView.setAlpha(0.0f);
            this.aspectRatioFrameLayout.addView(this.flashView, LayoutHelper.createFrame(-1, -1, 17));
        }
    }

    public static void lambda$createVideoTextureView$59(MediaController.SavedFilterState savedFilterState, FilterGLThread filterGLThread) {
        filterGLThread.setFilterGLThreadDelegate(FilterShaders.getFilterShadersDelegate(savedFilterState));
    }

    public void releasePlayer(boolean z) {
        this.usedSurfaceView = false;
        if (this.videoPlayer != null) {
            cancelVideoPlayRunnable();
            AndroidUtilities.cancelRunOnUIThread(this.setLoadingRunnable);
            AndroidUtilities.cancelRunOnUIThread(this.hideActionBarRunnable);
            if (this.shouldSavePositionForCurrentVideoShortTerm != null) {
                this.savedVideoPositions.put(this.shouldSavePositionForCurrentVideoShortTerm, new SavedVideoPosition(((float) this.videoPlayer.getCurrentPosition()) / ((float) this.videoPlayer.getDuration()), SystemClock.elapsedRealtime()));
            }
            this.videoPlayer.releasePlayer(true);
            this.videoPlayer = null;
        } else {
            this.playerWasPlaying = false;
        }
        if (this.photoViewerWebView != null) {
            AndroidUtilities.cancelRunOnUIThread(this.hideActionBarRunnable);
            if (this.shouldSavePositionForCurrentVideoShortTerm != null) {
                this.savedVideoPositions.put(this.shouldSavePositionForCurrentVideoShortTerm, new SavedVideoPosition(((float) getCurrentVideoPosition()) / ((float) getVideoDuration()), SystemClock.elapsedRealtime()));
            }
        }
        OrientationEventListener orientationEventListener = this.orientationEventListener;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.orientationEventListener = null;
        }
        this.videoPreviewFrame.close();
        toggleMiniProgress(false, false);
        this.pipAvailable = false;
        this.playerInjected = false;
        if (this.pipItem.isEnabled()) {
            this.pipItem.setEnabled(false);
            this.pipItem.animate().alpha(0.5f).setDuration(175L).withEndAction(null).start();
        }
        if (this.keepScreenOnFlagSet) {
            try {
                this.parentActivity.getWindow().clearFlags(128);
                this.keepScreenOnFlagSet = false;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            try {
                this.containerView.removeView(aspectRatioFrameLayout);
            } catch (Throwable unused) {
            }
            this.aspectRatioFrameLayout = null;
        }
        cancelFlashAnimations();
        this.flashView = null;
        TextureView textureView = this.videoTextureView;
        if (textureView != null) {
            if (textureView instanceof VideoEditTextureView) {
                ((VideoEditTextureView) textureView).release();
            }
            this.videoTextureView = null;
        }
        this.blurManager.resetBitmap();
        if (this.videoSurfaceView != null) {
            this.videoSurfaceView = null;
        }
        if (this.isPlaying) {
            this.isPlaying = false;
            AndroidUtilities.cancelRunOnUIThread(this.updateProgressRunnable);
        }
        if (!z && !this.inPreview && !this.requestingPreview) {
            setVideoPlayerControlVisible(false, true);
        }
        this.photoProgressViews[0].resetAlphas();
    }

    private void setVideoPlayerControlVisible(final boolean z, boolean z2) {
        if (this.videoPlayerControlVisible != z) {
            if (z) {
                this.bottomLayout.setTag(1);
            } else {
                this.bottomLayout.setTag(null);
            }
            Animator animator = this.videoPlayerControlAnimator;
            if (animator != null) {
                animator.cancel();
            }
            this.videoPlayerControlVisible = z;
            if (z2) {
                if (z) {
                    this.videoPlayerControlFrameLayout.setVisibility(0);
                }
                float[] fArr = new float[2];
                fArr[0] = this.videoPlayerControlFrameLayout.getAlpha();
                fArr[1] = z ? 1.0f : 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                ofFloat.setDuration(200L);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        PhotoViewer.this.lambda$setVideoPlayerControlVisible$60(valueAnimator);
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    {
                        PhotoViewer.this = this;
                    }

                    @Override
                    public void onAnimationEnd(Animator animator2) {
                        if (z) {
                            return;
                        }
                        PhotoViewer.this.videoPlayerControlFrameLayout.setVisibility(8);
                    }
                });
                this.videoPlayerControlAnimator = ofFloat;
                ofFloat.start();
            } else {
                this.videoPlayerControlFrameLayout.setVisibility(z ? 0 : 8);
                this.videoPlayerControlFrameLayout.setAlpha(z ? 1.0f : 0.0f);
            }
            if (this.allowShare && this.pageBlocksAdapter == null) {
                if (z) {
                    this.menuItem.showSubItem(10);
                } else {
                    this.menuItem.hideSubItem(10);
                }
            }
        }
    }

    public void lambda$setVideoPlayerControlVisible$60(ValueAnimator valueAnimator) {
        this.videoPlayerControlFrameLayout.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void updateCaptionTextForCurrentPhoto(Object obj) {
        CharSequence charSequence;
        if (this.hasCaptionForAllMedia) {
            charSequence = this.captionForAllMedia;
        } else if (obj instanceof MediaController.PhotoEntry) {
            charSequence = ((MediaController.PhotoEntry) obj).caption;
        } else {
            charSequence = (!(obj instanceof TLRPC$BotInlineResult) && (obj instanceof MediaController.SearchImage)) ? ((MediaController.SearchImage) obj).caption : null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.captionEdit.setText("");
        } else {
            this.captionEdit.setText(AnimatedEmojiSpan.cloneSpans(charSequence, 3));
        }
        this.captionEdit.editText.getEditText().setAllowTextEntitiesIntersection(supportsSendingNewEntities());
    }

    public void showAlertDialog(AlertDialog.Builder builder) {
        if (this.parentActivity == null) {
            return;
        }
        try {
            AlertDialog alertDialog = this.visibleDialog;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.visibleDialog = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            AlertDialog show = builder.show();
            this.visibleDialog = show;
            show.setCanceledOnTouchOutside(true);
            this.visibleDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    PhotoViewer.this.lambda$showAlertDialog$61(dialogInterface);
                }
            });
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public void lambda$showAlertDialog$61(DialogInterface dialogInterface) {
        this.visibleDialog = null;
    }

    private void mergeImages(String str, String str2, Bitmap bitmap, Bitmap bitmap2, float f, boolean z) {
        boolean z2;
        if (bitmap == null) {
            try {
                bitmap = BitmapFactory.decodeFile(str2);
                z2 = true;
            } catch (Throwable th) {
                FileLog.e(th);
                return;
            }
        } else {
            z2 = false;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f2 = width;
        if (f2 > f || height > f) {
            float max = Math.max(width, height) / f;
            height = (int) (height / max);
            width = (int) (f2 / max);
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect rect = new Rect(0, 0, width, height);
        if (z) {
            canvas.drawBitmap(bitmap2, (Rect) null, rect, this.bitmapPaint);
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.bitmapPaint);
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.bitmapPaint);
            canvas.drawBitmap(bitmap2, (Rect) null, rect, this.bitmapPaint);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        createBitmap.compress(getCompressFormat(), f == 512.0f ? 83 : 87, fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (z2) {
            bitmap.recycle();
        }
        createBitmap.recycle();
    }

    public void seekAnimatedStickersTo(long j) {
        RLottieDrawable lottieAnimation;
        ArrayList<VideoEditedInfo.MediaEntity> arrayList = this.editState.mediaEntities;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                VideoEditedInfo.MediaEntity mediaEntity = this.editState.mediaEntities.get(i);
                if (mediaEntity.type == 0 && (mediaEntity.subType & 1) != 0) {
                    View view = mediaEntity.view;
                    if ((view instanceof BackupImageView) && (lottieAnimation = ((BackupImageView) view).getImageReceiver().getLottieAnimation()) != null) {
                        long j2 = this.startTime;
                        lottieAnimation.setProgressMs(j - (j2 > 0 ? j2 / 1000 : 0L));
                    }
                }
            }
        }
    }

    public void playOrStopAnimatedStickers(boolean z) {
        RLottieDrawable lottieAnimation;
        ArrayList<VideoEditedInfo.MediaEntity> arrayList = this.editState.mediaEntities;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                VideoEditedInfo.MediaEntity mediaEntity = this.editState.mediaEntities.get(i);
                if (mediaEntity.type == 0 && (mediaEntity.subType & 1) != 0) {
                    View view = mediaEntity.view;
                    if ((view instanceof BackupImageView) && (lottieAnimation = ((BackupImageView) view).getImageReceiver().getLottieAnimation()) != null) {
                        if (z) {
                            lottieAnimation.start();
                        } else {
                            lottieAnimation.stop();
                        }
                    }
                }
            }
        }
    }

    private int getAnimatedMediaEntitiesCount(boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.getAnimatedMediaEntitiesCount(boolean):int");
    }

    private boolean hasAnimatedMediaEntities() {
        return getAnimatedMediaEntitiesCount(true) != 0;
    }

    private android.graphics.Bitmap createCroppedBitmap(android.graphics.Bitmap r17, org.telegram.messenger.MediaController.CropState r18, int[] r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.createCroppedBitmap(android.graphics.Bitmap, org.telegram.messenger.MediaController$CropState, int[], boolean):android.graphics.Bitmap");
    }

    public void lambda$setParentActivity$16(android.graphics.Bitmap r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.lambda$setParentActivity$16(android.graphics.Bitmap):void");
    }

    public void applyCurrentEditMode() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.applyCurrentEditMode():void");
    }

    private void setPhotoChecked() {
        ChatActivity chatActivity;
        TLRPC$Chat currentChat;
        PhotoViewerProvider photoViewerProvider = this.placeProvider;
        if (photoViewerProvider != null) {
            if (photoViewerProvider.getSelectedPhotos() != null && this.maxSelectedPhotos > 0 && this.placeProvider.getSelectedPhotos().size() >= this.maxSelectedPhotos && !this.placeProvider.isPhotoChecked(this.currentIndex)) {
                if (!this.allowOrder || (chatActivity = this.parentChatActivity) == null || (currentChat = chatActivity.getCurrentChat()) == null || ChatObject.hasAdminRights(currentChat) || !currentChat.slowmode_enabled) {
                    return;
                }
                AlertsCreator.createSimpleAlert(this.parentActivity, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSelectSendError", R.string.SlowmodeSelectSendError)).show();
                return;
            }
            int photoChecked = this.placeProvider.setPhotoChecked(this.currentIndex, getCurrentVideoEditedInfo());
            boolean isPhotoChecked = this.placeProvider.isPhotoChecked(this.currentIndex);
            this.checkImageView.setChecked(isPhotoChecked, true);
            if (photoChecked >= 0) {
                if (isPhotoChecked) {
                    this.selectedPhotosAdapter.notifyItemInserted(photoChecked);
                    this.selectedPhotosListView.smoothScrollToPosition(photoChecked);
                } else {
                    this.selectedPhotosAdapter.notifyItemRemoved(photoChecked);
                    if (photoChecked == 0) {
                        this.selectedPhotosAdapter.notifyItemChanged(0);
                    }
                }
            }
            updateSelectedCount();
        }
    }

    public void updateResetButtonVisibility(final boolean z) {
        if (this.resetButton.isClickable() != z) {
            this.resetButton.setClickable(z);
            this.resetButton.setVisibility(0);
            this.resetButton.clearAnimation();
            this.resetButton.animate().alpha(z ? 1.0f : 0.0f).setInterpolator(CubicBezierInterpolator.DEFAULT).setDuration(150L).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.this.lambda$updateResetButtonVisibility$62(z);
                }
            });
        }
    }

    public void lambda$updateResetButtonVisibility$62(boolean z) {
        if (z) {
            return;
        }
        this.resetButton.setVisibility(8);
    }

    private void createCropView() {
        if (this.photoCropView != null) {
            return;
        }
        PhotoCropView photoCropView = new PhotoCropView(this.activityContext, this.resourcesProvider);
        this.photoCropView = photoCropView;
        photoCropView.setVisibility(8);
        this.photoCropView.onDisappear();
        this.containerView.addView(this.photoCropView, this.containerView.indexOfChild(this.videoTimelineViewContainer) - 1, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.photoCropView.setDelegate(new AnonymousClass54());
    }

    public class AnonymousClass54 implements PhotoCropView.PhotoCropViewDelegate {
        AnonymousClass54() {
            PhotoViewer.this = r1;
        }

        @Override
        public void onChange(boolean z) {
            PhotoViewer.this.updateResetButtonVisibility(!z);
        }

        @Override
        public void onUpdate() {
            PhotoViewer.this.containerView.invalidate();
        }

        @Override
        public void onTapUp() {
            if (PhotoViewer.this.sendPhotoType == 1) {
                PhotoViewer.this.manuallyPaused = true;
                PhotoViewer.this.toggleVideoPlayer();
            }
        }

        @Override
        public void onVideoThumbClick() {
            if (PhotoViewer.this.videoPlayer == null) {
                return;
            }
            PhotoViewer.this.videoPlayer.seekTo(((float) PhotoViewer.this.videoPlayer.getDuration()) * PhotoViewer.this.avatarStartProgress);
            PhotoViewer.this.videoPlayer.pause();
            PhotoViewer.this.videoTimelineView.setProgress(PhotoViewer.this.avatarStartProgress);
            PhotoViewer.this.cancelVideoPlayRunnable();
            AndroidUtilities.runOnUIThread(PhotoViewer.this.videoPlayRunnable = new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.AnonymousClass54.this.lambda$onVideoThumbClick$0();
                }
            }, 860L);
        }

        public void lambda$onVideoThumbClick$0() {
            PhotoViewer.this.manuallyPaused = false;
            if (PhotoViewer.this.videoPlayer != null) {
                PhotoViewer.this.videoPlayer.play();
            }
            PhotoViewer.this.videoPlayRunnable = null;
        }

        @Override
        public boolean rotate() {
            return PhotoViewer.this.cropRotate(-90.0f);
        }

        @Override
        public boolean mirror() {
            return PhotoViewer.this.cropMirror();
        }

        @Override
        public int getVideoThumbX() {
            return (int) (AndroidUtilities.dp(16.0f) + ((PhotoViewer.this.videoTimelineView.getMeasuredWidth() - AndroidUtilities.dp(32.0f)) * PhotoViewer.this.avatarStartProgress));
        }
    }

    private void startVideoPlayer() {
        VideoPlayer videoPlayer;
        if (!this.isCurrentVideo || (videoPlayer = this.videoPlayer) == null || videoPlayer.isPlaying()) {
            return;
        }
        if (!this.muteVideo || this.sendPhotoType == 1) {
            this.videoPlayer.setVolume(0.0f);
        }
        this.manuallyPaused = false;
        toggleVideoPlayer();
    }

    private void detectFaces() {
        if (this.centerImage.getAnimation() != null || this.imagesArrLocals.isEmpty() || this.sendPhotoType == 1) {
            return;
        }
        String imageKey = this.centerImage.getImageKey();
        String str = this.currentImageFaceKey;
        if (str == null || !str.equals(imageKey)) {
            this.currentImageHasFace = 0;
            detectFaces(imageKey, this.centerImage.getBitmapSafe(), this.centerImage.getOrientation());
        }
    }

    private void detectFaces(final String str, final ImageReceiver.BitmapHolder bitmapHolder, final int i) {
        if (str == null || bitmapHolder == null || bitmapHolder.bitmap == null) {
            return;
        }
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                PhotoViewer.this.lambda$detectFaces$65(bitmapHolder, i, str);
            }
        });
    }

    public void lambda$detectFaces$65(final ImageReceiver.BitmapHolder bitmapHolder, int i, final String str) {
        FaceDetector faceDetector = null;
        try {
            try {
                final boolean z = false;
                faceDetector = new FaceDetector.Builder(ApplicationLoader.applicationContext).setMode(0).setLandmarkType(0).setTrackingEnabled(false).build();
                if (faceDetector.isOperational()) {
                    SparseArray<Face> detect = faceDetector.detect(new Frame.Builder().setBitmap(bitmapHolder.bitmap).setRotation(i).build());
                    if (detect != null && detect.size() != 0) {
                        z = true;
                    }
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PhotoViewer.this.lambda$detectFaces$63(str, z);
                        }
                    });
                } else {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("face detection is not operational");
                    }
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PhotoViewer.this.lambda$detectFaces$64(bitmapHolder, str);
                        }
                    });
                }
            } catch (Exception e) {
                FileLog.e(e);
                if (0 == 0) {
                    return;
                }
            }
            faceDetector.release();
        } catch (Throwable th) {
            if (0 != 0) {
                faceDetector.release();
            }
            throw th;
        }
    }

    public void lambda$detectFaces$63(String str, boolean z) {
        if (str.equals(this.centerImage.getImageKey())) {
            this.currentImageHasFace = z ? 1 : 0;
            this.currentImageFaceKey = str;
        }
    }

    public void lambda$detectFaces$64(ImageReceiver.BitmapHolder bitmapHolder, String str) {
        bitmapHolder.release();
        if (str.equals(this.centerImage.getImageKey())) {
            this.currentImageHasFace = 2;
            this.currentImageFaceKey = str;
        }
    }

    public void switchToEditMode(final int r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.switchToEditMode(int):void");
    }

    public void lambda$switchToEditMode$66(ValueAnimator valueAnimator) {
        this.photoCropView.cropView.areaView.setRotationScaleTranslation(0.0f, AndroidUtilities.lerp(this.scale, this.animateToScale, this.animationValue), AndroidUtilities.lerp(this.translationX, this.animateToX, this.animationValue), AndroidUtilities.lerp(this.translationY, this.animateToY, this.animationValue));
    }

    public void lambda$switchToEditMode$67(ValueAnimator valueAnimator) {
        this.photoPaintView.setOffsetTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f, 0, false);
    }

    public void lambda$switchToEditMode$68(ValueAnimator valueAnimator) {
        this.photoPaintView.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public class AnonymousClass55 extends AnimatorListenerAdapter {
        final int val$mode;

        AnonymousClass55(int i) {
            PhotoViewer.this = r1;
            this.val$mode = i;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (PhotoViewer.this.currentEditMode == 1) {
                PhotoViewer.this.photoCropView.onDisappear();
                PhotoViewer.this.photoCropView.onHide();
                PhotoViewer.this.editorDoneLayout.setVisibility(8);
                PhotoViewer.this.photoCropView.setVisibility(8);
                PhotoViewer.this.photoCropView.cropView.areaView.setRotationScaleTranslation(0.0f, 1.0f, 0.0f, 0.0f);
            } else if (PhotoViewer.this.currentEditMode == 2) {
                try {
                    PhotoViewer.this.containerView.removeView(PhotoViewer.this.photoFilterView);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                PhotoViewer.this.photoFilterView = null;
            } else if (PhotoViewer.this.currentEditMode == 3) {
                PhotoViewer.this.photoPaintView.onAnimationStateChanged(false);
                try {
                    PhotoViewer.this.containerView.removeView(PhotoViewer.this.photoPaintView.getView());
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                PhotoViewer.this.photoPaintView = null;
            } else if (PhotoViewer.this.currentEditMode == 4) {
                PhotoViewer.this.maskPaintViewShuttingDown = true;
                PhotoViewer.this.containerView.invalidate();
                final MaskPaintView maskPaintView = PhotoViewer.this.maskPaintView;
                PhotoViewer.this.containerView.post(new Runnable() {
                    @Override
                    public final void run() {
                        PhotoViewer.AnonymousClass55.this.lambda$onAnimationEnd$0(maskPaintView);
                    }
                });
                PhotoViewer.this.maskPaintView = null;
                PhotoViewer.this.eraseBtn.setActive(false, true);
                PhotoViewer.this.restoreBtn.setActive(false, true);
            }
            PhotoViewer.this.imageMoveAnimation = null;
            int i = PhotoViewer.this.currentEditMode;
            PhotoViewer.this.currentEditMode = this.val$mode;
            PhotoViewer.this.captionEdit.keyboardNotifier.ignore(PhotoViewer.this.currentEditMode != 0);
            if (PhotoViewer.this.paintKeyboardNotifier != null) {
                PhotoViewer.this.paintKeyboardNotifier.ignore(PhotoViewer.this.currentEditMode != 3);
            }
            if (PhotoViewer.this.currentEditMode != 3) {
                PhotoViewer.this.translateY = 0.0f;
            }
            PhotoViewer.this.applying = false;
            if (PhotoViewer.this.sendPhotoType == 1) {
                PhotoViewer.this.photoCropView.setVisibility(0);
            }
            if (PhotoViewer.this.sendPhotoType == 11 && (i == 3 || i == 2 || i == 1 || i == 4)) {
                PhotoViewer photoViewer = PhotoViewer.this;
                photoViewer.animateToX = photoViewer.savedTx;
                PhotoViewer photoViewer2 = PhotoViewer.this;
                photoViewer2.animateToY = photoViewer2.savedTy;
                PhotoViewer photoViewer3 = PhotoViewer.this;
                photoViewer3.animateToScale = photoViewer3.savedScale;
                PhotoViewer photoViewer4 = PhotoViewer.this;
                photoViewer4.animateToRotate = photoViewer4.savedRotation;
            } else {
                PhotoViewer photoViewer5 = PhotoViewer.this;
                photoViewer5.scale = photoViewer5.animateToScale = photoViewer5.scale1(false);
                PhotoViewer photoViewer6 = PhotoViewer.this;
                photoViewer6.updateMinMax(photoViewer6.scale);
                PhotoViewer.this.animateToX = 0.0f;
                PhotoViewer.this.animateToY = 0.0f;
            }
            PhotoViewer.this.switchingToMode = -1;
            PhotoViewer.this.containerView.invalidate();
            if (PhotoViewer.this.savedState != null) {
                PhotoViewer.this.savedState.restore();
                PhotoViewer.this.savedState = null;
                ActionBarToggleParams enableStatusBarAnimation = new ActionBarToggleParams().enableStatusBarAnimation(false);
                PhotoViewer.this.toggleActionBar(false, false, enableStatusBarAnimation);
                PhotoViewer.this.toggleActionBar(true, true, enableStatusBarAnimation);
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.pickerView, View.TRANSLATION_Y, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.pickerView, View.ALPHA, 1.0f));
            StickerMakerView stickerMakerView = PhotoViewer.this.stickerMakerView;
            if (stickerMakerView != null) {
                arrayList.add(ObjectAnimator.ofFloat(stickerMakerView, View.ALPHA, 1.0f));
            }
            if (PhotoViewer.this.stickerMakerBackgroundView != null) {
                arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.stickerMakerBackgroundView, View.ALPHA, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.pickerViewSendButton, View.TRANSLATION_Y, 0.0f));
            if (PhotoViewer.this.sendPhotoType != 1) {
                arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.actionBar, View.TRANSLATION_Y, 0.0f));
            }
            if (PhotoViewer.this.needCaptionLayout) {
                arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.captionTextViewSwitcher, View.TRANSLATION_Y, 0.0f));
            }
            if (PhotoViewer.this.sendPhotoType == 0 || PhotoViewer.this.sendPhotoType == 4) {
                arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.checkImageView, View.ALPHA, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.photosCounterView, View.ALPHA, 1.0f));
            } else if (PhotoViewer.this.sendPhotoType == 1) {
                arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.photoCropView, View.ALPHA, 1.0f));
            }
            if (PhotoViewer.this.muteItem.getTag() != null) {
                PhotoViewer.this.muteItem.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.muteItem, View.ALPHA, 1.0f));
            }
            if (PhotoViewer.this.navigationBar != null) {
                PhotoViewer.this.navigationBar.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.navigationBar, View.ALPHA, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new AnimatorListenerAdapter() {
                {
                    AnonymousClass55.this = this;
                }

                @Override
                public void onAnimationStart(Animator animator2) {
                    PhotoViewer.this.pickerView.setVisibility(0);
                    if (PhotoViewer.this.useFullWidthSendButton()) {
                        PhotoViewer.this.doneButtonFullWidth.setVisibility(0);
                    } else {
                        PhotoViewer.this.pickerViewSendButton.setVisibility(0);
                    }
                    PhotoViewer.this.actionBar.setVisibility(0);
                    if (PhotoViewer.this.needCaptionLayout) {
                        PhotoViewer.this.captionTextViewSwitcher.setVisibility(PhotoViewer.this.captionTextViewSwitcher.getTag() != null ? 0 : 4);
                    }
                    if (PhotoViewer.this.sendPhotoType == 0 || PhotoViewer.this.sendPhotoType == 4 || ((PhotoViewer.this.sendPhotoType == 2 || PhotoViewer.this.sendPhotoType == 5) && PhotoViewer.this.imagesArrLocals.size() > 1)) {
                        PhotoViewer.this.checkImageView.setVisibility(0);
                        PhotoViewer.this.photosCounterView.setVisibility(0);
                        PhotoViewer.this.updateActionBarTitlePadding();
                    }
                }

                @Override
                public void onAnimationEnd(Animator animator2) {
                    if (PhotoViewer.this.videoConvertSupported && PhotoViewer.this.isCurrentVideo) {
                        PhotoViewer.this.updateVideoInfo();
                    }
                }
            });
            animatorSet.start();
        }

        public void lambda$onAnimationEnd$0(MaskPaintView maskPaintView) {
            maskPaintView.shutdown();
            try {
                PhotoViewer.this.containerView.removeView(maskPaintView);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public void lambda$switchToEditMode$69(View view) {
        applyCurrentEditMode();
        switchToEditMode(0);
    }

    public void lambda$switchToEditMode$71(View view) {
        if (this.photoFilterView.hasChanges()) {
            Activity activity = this.parentActivity;
            if (activity == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(activity, this.resourcesProvider);
            builder.setMessage(LocaleController.getString("DiscardChanges", R.string.DiscardChanges));
            builder.setTitle(LocaleController.getString("AppName", R.string.AppName));
            builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    PhotoViewer.this.lambda$switchToEditMode$70(dialogInterface, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            showAlertDialog(builder);
            return;
        }
        switchToEditMode(0);
    }

    public void lambda$switchToEditMode$70(DialogInterface dialogInterface, int i) {
        switchToEditMode(0);
    }

    private void createMaskPaintView() {
        MediaController.CropState cropState;
        if (this.maskPaintView != null) {
            return;
        }
        if (this.sendPhotoType == 1) {
            cropState = new MediaController.CropState();
            cropState.transformRotation = this.cropTransform.getOrientation();
        } else {
            cropState = this.editState.cropState;
        }
        MediaController.CropState cropState2 = cropState;
        Bitmap createBitmap = Bitmap.createBitmap(this.centerImage.getBitmapWidth(), this.centerImage.getBitmapHeight(), Bitmap.Config.ARGB_8888);
        StickerMakerView stickerMakerView = this.stickerMakerView;
        if (stickerMakerView != null && stickerMakerView.getSourceBitmap() != null) {
            Bitmap sourceBitmap = this.stickerMakerView.getSourceBitmap();
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
            canvas.rotate(this.stickerMakerView.orientation);
            float width = createBitmap.getWidth() / ((this.stickerMakerView.orientation / 90) % 2 != 0 ? sourceBitmap.getHeight() : sourceBitmap.getWidth());
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(((-sourceBitmap.getWidth()) / 2.0f) * width, ((-sourceBitmap.getHeight()) / 2.0f) * width, (sourceBitmap.getWidth() / 2.0f) * width, (sourceBitmap.getHeight() / 2.0f) * width);
            canvas.drawBitmap(sourceBitmap, (Rect) null, rectF, new Paint(3));
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(this.centerImage.getBitmapWidth(), this.centerImage.getBitmapHeight(), Bitmap.Config.ARGB_8888);
        if (this.centerImage.getBitmap() != null) {
            Bitmap bitmap = this.centerImage.getBitmap();
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
            canvas2.rotate(this.centerImage.getOrientation());
            float width2 = createBitmap2.getWidth() / ((this.centerImage.getOrientation() / 90) % 2 != 0 ? bitmap.getHeight() : bitmap.getWidth());
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(((-bitmap.getWidth()) / 2.0f) * width2, ((-bitmap.getHeight()) / 2.0f) * width2, (bitmap.getWidth() / 2.0f) * width2, (bitmap.getHeight() / 2.0f) * width2);
            canvas2.drawBitmap(bitmap, (Rect) null, rectF2, new Paint(3));
        }
        MaskPaintView maskPaintView = new MaskPaintView(this.parentActivity, this.currentAccount, createBitmap2, createBitmap, this.centerImage.getOrientation(), cropState2) {
            {
                PhotoViewer.this = this;
            }

            @Override
            public void onRenderViewAlphaUpdate(ValueAnimator valueAnimator) {
                super.onRenderViewAlphaUpdate(valueAnimator);
                PhotoViewer.this.containerView.invalidate();
            }

            @Override
            protected void onDrawn() {
                PhotoViewer.this.showEditStickerMode(true, true);
            }
        };
        this.maskPaintView = maskPaintView;
        maskPaintView.cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PhotoViewer.this.lambda$createMaskPaintView$72(view);
            }
        });
        this.maskPaintView.doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PhotoViewer.this.lambda$createMaskPaintView$73(view);
            }
        });
        this.maskPaintView.setEraser(this.maskPaintViewEraser);
        int indexOfChild = this.containerView.indexOfChild(this.btnLayout) - 1;
        if (indexOfChild < 0) {
            indexOfChild = this.containerView.getChildCount();
        }
        this.containerView.addView(this.maskPaintView, indexOfChild, LayoutHelper.createFrame(-1, -1.0f));
        this.maskPaintViewShuttingDown = false;
    }

    public void lambda$createMaskPaintView$72(View view) {
        this.eraseBtn.setActive(false, true);
        this.restoreBtn.setActive(false, true);
        switchToEditMode(0);
    }

    public void lambda$createMaskPaintView$73(View view) {
        this.eraseBtn.setActive(false, true);
        this.restoreBtn.setActive(false, true);
        applyCurrentEditMode();
        switchToEditMode(0);
    }

    private void createPaintView() {
        int bitmapWidth;
        int bitmapHeight;
        MediaController.CropState cropState;
        if (this.photoPaintView == null) {
            TextureView textureView = this.videoTextureView;
            if (textureView != null) {
                VideoEditTextureView videoEditTextureView = (VideoEditTextureView) textureView;
                bitmapWidth = videoEditTextureView.getVideoWidth();
                bitmapHeight = videoEditTextureView.getVideoHeight();
                while (true) {
                    if (bitmapWidth <= 1280 && bitmapHeight <= 1280) {
                        break;
                    }
                    bitmapWidth /= 2;
                    bitmapHeight /= 2;
                }
            } else {
                bitmapWidth = this.centerImage.getBitmapWidth();
                bitmapHeight = this.centerImage.getBitmapHeight();
            }
            Bitmap bitmap = this.paintingOverlay.getBitmap();
            Bitmap createBitmap = bitmap == null ? Bitmap.createBitmap(bitmapWidth, bitmapHeight, Bitmap.Config.ARGB_8888) : bitmap;
            if (this.sendPhotoType == 1) {
                cropState = new MediaController.CropState();
                cropState.transformRotation = this.cropTransform.getOrientation();
            } else {
                cropState = this.editState.cropState;
            }
            MediaController.CropState cropState2 = cropState;
            KeyboardNotifier keyboardNotifier = new KeyboardNotifier(this.windowView, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    PhotoViewer.this.lambda$createPaintView$75((Integer) obj);
                }
            });
            this.paintKeyboardNotifier = keyboardNotifier;
            keyboardNotifier.ignore(this.currentEditMode != 3);
            Activity activity = this.parentActivity;
            LPhotoPaintView lPhotoPaintView = new LPhotoPaintView(activity, activity, this.currentAccount, createBitmap, this.isCurrentVideo ? null : this.centerImage.getBitmap(), this.centerImage.getOrientation(), this.editState.mediaEntities, cropState2, new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.this.lambda$createPaintView$76();
                }
            }, this.resourcesProvider) {
                {
                    PhotoViewer.this = this;
                }

                @Override
                protected void onOpenCloseStickersAlert(boolean z) {
                    if (PhotoViewer.this.videoPlayer == null) {
                        return;
                    }
                    PhotoViewer.this.manuallyPaused = false;
                    PhotoViewer.this.cancelVideoPlayRunnable();
                    if (z) {
                        PhotoViewer.this.videoPlayer.pause();
                    } else {
                        PhotoViewer.this.videoPlayer.play();
                    }
                }

                @Override
                protected int getPKeyboardHeight() {
                    if (PhotoViewer.this.paintKeyboardNotifier != null) {
                        return PhotoViewer.this.paintKeyboardNotifier.getKeyboardHeight();
                    }
                    return 0;
                }

                @Override
                protected void onEmojiViewCloseByClick() {
                    if (PhotoViewer.this.paintKeyboardNotifier != null) {
                        PhotoViewer.this.paintKeyboardNotifier.awaitKeyboard();
                    }
                }

                @Override
                protected void updateKeyboard() {
                    if (PhotoViewer.this.paintKeyboardNotifier != null) {
                        PhotoViewer.this.paintKeyboardNotifier.fire();
                    }
                }

                @Override
                protected void didSetAnimatedSticker(RLottieDrawable rLottieDrawable) {
                    if (PhotoViewer.this.videoPlayer == null) {
                        return;
                    }
                    rLottieDrawable.setProgressMs(PhotoViewer.this.videoPlayer.getCurrentPosition() - (PhotoViewer.this.startTime > 0 ? PhotoViewer.this.startTime / 1000 : 0L));
                }

                @Override
                protected void onTextAdd() {
                    PhotoViewer.this.windowView.isFocusable();
                }
            };
            this.photoPaintView = lPhotoPaintView;
            this.containerView.addView(lPhotoPaintView.getView(), LayoutHelper.createFrame(-1, -1.0f));
            this.photoPaintView.setOnDoneButtonClickedListener(new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.this.lambda$createPaintView$77();
                }
            });
            this.photoPaintView.getCancelView().setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PhotoViewer.this.lambda$createPaintView$78(view);
                }
            });
            this.photoPaintView.setOffsetTranslationY(AndroidUtilities.dp(126.0f), 0.0f, 0, false);
            this.photoPaintView.setOffsetTranslationX(-AndroidUtilities.dp(12.0f));
        }
    }

    public void lambda$createPaintView$75(Integer num) {
        this.photoPaintView.keyboardVisible = this.paintKeyboardNotifier.keyboardVisible();
        this.containerView.invalidate();
        Integer valueOf = Integer.valueOf(Math.max(num.intValue(), this.photoPaintView.getEmojiPadding(false)));
        translateY((!this.photoPaintView.isCurrentText() || valueOf.intValue() <= 0) ? 0.0f : ((AndroidUtilities.displaySize.y - valueOf.intValue()) - AndroidUtilities.dp(80.0f)) - this.photoPaintView.getSelectedEntityBottom());
        AnimatorSet animatorSet = this.paintKeyboardAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PhotoViewer.this.lambda$createPaintView$74(valueAnimator);
            }
        });
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.paintKeyboardAnimator = animatorSet2;
        Animator[] animatorArr = new Animator[6];
        animatorArr[0] = ObjectAnimator.ofFloat(this.photoPaintView.weightChooserView, View.TRANSLATION_Y, (-valueOf.intValue()) / 2.5f);
        animatorArr[1] = ObjectAnimator.ofFloat(this.photoPaintView.bottomLayout, View.TRANSLATION_Y, Math.min(0, (-valueOf.intValue()) + AndroidUtilities.dp(40.0f)));
        LinearLayout linearLayout = this.photoPaintView.tabsLayout;
        Property property = View.ALPHA;
        float[] fArr = new float[1];
        fArr[0] = valueOf.intValue() > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f;
        animatorArr[2] = ObjectAnimator.ofFloat(linearLayout, property, fArr);
        PaintCancelView paintCancelView = this.photoPaintView.cancelButton;
        Property property2 = View.ALPHA;
        float[] fArr2 = new float[1];
        fArr2[0] = valueOf.intValue() > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f;
        animatorArr[3] = ObjectAnimator.ofFloat(paintCancelView, property2, fArr2);
        PaintDoneView paintDoneView = this.photoPaintView.doneButton;
        Property property3 = View.ALPHA;
        float[] fArr3 = new float[1];
        fArr3[0] = valueOf.intValue() <= AndroidUtilities.dp(20.0f) ? 1.0f : 0.0f;
        animatorArr[4] = ObjectAnimator.ofFloat(paintDoneView, property3, fArr3);
        animatorArr[5] = ofFloat;
        animatorSet2.playTogether(animatorArr);
        animatorSet2.setDuration(320L);
        animatorSet2.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        animatorSet2.start();
        this.photoPaintView.updatePlusEmojiKeyboardButton();
    }

    public void lambda$createPaintView$74(ValueAnimator valueAnimator) {
        LPhotoPaintView lPhotoPaintView = this.photoPaintView;
        if (lPhotoPaintView != null) {
            lPhotoPaintView.overlayLayout.invalidate();
        }
    }

    public void lambda$createPaintView$76() {
        this.paintingOverlay.hideBitmap();
    }

    public void lambda$createPaintView$77() {
        this.savedState = null;
        applyCurrentEditMode();
        switchToEditMode(0);
    }

    public void lambda$createPaintView$78(View view) {
        closePaintMode();
    }

    private void translateY(float f) {
        ValueAnimator valueAnimator = this.translateYAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.translateYAnimator = null;
        }
        if (this.currentEditMode != 3) {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.translateY, f);
        this.translateYAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                PhotoViewer.this.lambda$translateY$79(valueAnimator2);
            }
        });
        this.translateYAnimator.setDuration(320L);
        this.translateYAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.translateYAnimator.start();
    }

    public void lambda$translateY$79(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.translateY = floatValue;
        LPhotoPaintView lPhotoPaintView = this.photoPaintView;
        if (lPhotoPaintView != null) {
            lPhotoPaintView.translateY(floatValue);
        }
        this.containerView.invalidate();
    }

    private void closePaintMode() {
        this.photoPaintView.maybeShowDismissalAlert(this, this.parentActivity, new Runnable() {
            @Override
            public final void run() {
                PhotoViewer.this.lambda$closePaintMode$80();
            }
        });
    }

    public void lambda$closePaintMode$80() {
        switchToEditMode(0);
    }

    public void switchToPaintMode() {
        EditState editState;
        LPhotoPaintView lPhotoPaintView;
        LPhotoPaintView lPhotoPaintView2;
        this.changeModeAnimation = null;
        this.pickerView.setVisibility(8);
        this.pickerViewSendButton.setVisibility(8);
        this.doneButtonFullWidth.setVisibility(8);
        this.muteItem.setVisibility(8);
        PhotoCropView photoCropView = this.photoCropView;
        if (photoCropView != null) {
            photoCropView.setVisibility(4);
        }
        this.selectedPhotosListView.setVisibility(8);
        this.selectedPhotosListView.setAlpha(0.0f);
        this.selectedPhotosListView.setTranslationY(-AndroidUtilities.dp(10.0f));
        this.photosCounterView.setRotationX(0.0f);
        this.selectedPhotosListView.setEnabled(false);
        this.isPhotosListViewVisible = false;
        if (this.needCaptionLayout) {
            this.captionTextViewSwitcher.setVisibility(4);
        }
        int i = this.sendPhotoType;
        if (i == 0 || i == 4 || ((i == 2 || i == 5) && this.imagesArrLocals.size() > 1)) {
            this.checkImageView.setVisibility(8);
            this.photosCounterView.setVisibility(8);
            updateActionBarTitlePadding();
        }
        showEditCaption(false, true);
        showStickerMode(false, false, true);
        Bitmap bitmap = this.centerImage.getBitmap();
        float f = this.scale;
        if (this.sendPhotoType == 11) {
            this.savedTy = this.translationY;
            this.savedTx = this.translationX;
            this.savedScale = f;
            this.savedRotation = this.rotate;
            this.animateToRotate = 0.0f;
        }
        if (bitmap != null) {
            int bitmapWidth = this.centerImage.getBitmapWidth();
            int bitmapHeight = this.centerImage.getBitmapHeight();
            if (this.sendPhotoType == 1) {
                float dp = AndroidUtilities.dp(12.0f);
                this.animateToY = dp;
                if (this.photoPaintView != null) {
                    this.animateToY = dp + (lPhotoPaintView2.getAdditionalTop() / 2.0f);
                }
                if (this.cropTransform.getOrientation() == 90 || this.cropTransform.getOrientation() == 270) {
                    bitmapHeight = bitmapWidth;
                    bitmapWidth = bitmapHeight;
                }
            } else {
                float f2 = (-AndroidUtilities.dp(44.0f)) + (isStatusBarVisible() ? AndroidUtilities.statusBarHeight / 2 : 0);
                this.animateToY = f2;
                if (this.photoPaintView != null) {
                    float additionalTop = f2 + (lPhotoPaintView.getAdditionalTop() / 2.0f);
                    this.animateToY = additionalTop;
                    this.animateToY = additionalTop - (this.photoPaintView.getAdditionalBottom() / 2.0f);
                }
                MediaController.CropState cropState = this.editState.cropState;
                if (cropState != null) {
                    int i2 = cropState.transformRotation;
                    if (i2 == 90 || i2 == 270) {
                        bitmapHeight = bitmapWidth;
                        bitmapWidth = bitmapHeight;
                    }
                    bitmapWidth = (int) (bitmapWidth * cropState.cropPw);
                    bitmapHeight = (int) (bitmapHeight * cropState.cropPh);
                }
            }
            float f3 = bitmapWidth;
            float f4 = bitmapHeight;
            this.animateToScale = (Math.min(getContainerViewWidth(3) / f3, getContainerViewHeight(3) / f4) / Math.min(getContainerViewWidth() / f3, getContainerViewHeight() / f4)) * scale1(false);
            this.animateToX = (getLeftInset() / 2) - (getRightInset() / 2);
            this.animationStartTime = System.currentTimeMillis();
            this.zoomAnimation = true;
        }
        LPhotoPaintView lPhotoPaintView3 = this.photoPaintView;
        if (lPhotoPaintView3 != null) {
            lPhotoPaintView3.setDrawShadow(this.sendPhotoType == 11 && ((editState = this.editState) == null || editState.cropState == null));
        }
        this.windowView.setClipChildren(true);
        this.navigationBar.setVisibility(4);
        this.imageMoveAnimation = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(126.0f), 0.0f);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(-AndroidUtilities.dp(12.0f), 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PhotoViewer.this.lambda$switchToPaintMode$81(valueAnimator);
            }
        });
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PhotoViewer.this.lambda$switchToPaintMode$82(valueAnimator);
            }
        });
        this.imageMoveAnimation.playTogether(ObjectAnimator.ofFloat(this, AnimationProperties.PHOTO_VIEWER_ANIMATION_VALUE, 0.0f, 1.0f), ofFloat, ofFloat2);
        this.photoPaintView.onAnimationStateChanged(true);
        this.imageMoveAnimation.setDuration(200L);
        this.imageMoveAnimation.addListener(new AnimatorListenerAdapter() {
            {
                PhotoViewer.this = this;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                PhotoViewer.this.photoPaintView.onAnimationStateChanged(false);
                PhotoViewer.this.photoPaintView.init();
                PhotoViewer.this.paintingOverlay.hideEntities();
                PhotoViewer.this.imageMoveAnimation = null;
                PhotoViewer.this.currentEditMode = 3;
                PhotoViewer.this.captionEdit.keyboardNotifier.ignore(PhotoViewer.this.currentEditMode != 0);
                if (PhotoViewer.this.paintKeyboardNotifier != null) {
                    PhotoViewer.this.paintKeyboardNotifier.ignore(PhotoViewer.this.currentEditMode != 3);
                }
                PhotoViewer.this.switchingToMode = -1;
                PhotoViewer photoViewer = PhotoViewer.this;
                photoViewer.animateToScale = photoViewer.scale = photoViewer.scale1(false);
                PhotoViewer.this.animateToX = 0.0f;
                PhotoViewer.this.animateToY = 0.0f;
                PhotoViewer photoViewer2 = PhotoViewer.this;
                photoViewer2.updateMinMax(photoViewer2.scale);
                PhotoViewer.this.padImageForHorizontalInsets = true;
                PhotoViewer.this.containerView.invalidate();
                if (PhotoViewer.this.placeProvider == null || !PhotoViewer.this.placeProvider.closeKeyboard()) {
                    PhotoViewer.this.makeFocusable();
                }
            }
        });
        this.imageMoveAnimation.start();
    }

    public void lambda$switchToPaintMode$81(ValueAnimator valueAnimator) {
        this.photoPaintView.setOffsetTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f, 0, false);
    }

    public void lambda$switchToPaintMode$82(ValueAnimator valueAnimator) {
        this.photoPaintView.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void toggleCheckImageView(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float dpf2 = AndroidUtilities.dpf2(24.0f);
        FrameLayout frameLayout = this.pickerView;
        Property property = View.ALPHA;
        float[] fArr = new float[1];
        fArr[0] = z ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout, property, fArr));
        FrameLayout frameLayout2 = this.pickerView;
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        fArr2[0] = z ? 0.0f : dpf2;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property2, fArr2));
        StickerMakerView stickerMakerView = this.stickerMakerView;
        if (stickerMakerView != null) {
            Property property3 = View.ALPHA;
            float[] fArr3 = new float[1];
            fArr3[0] = z ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(stickerMakerView, property3, fArr3));
        }
        if (this.stickerMakerView != null) {
            StickerMakerBackgroundView stickerMakerBackgroundView = this.stickerMakerBackgroundView;
            Property property4 = View.ALPHA;
            float[] fArr4 = new float[1];
            fArr4[0] = z ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(stickerMakerBackgroundView, property4, fArr4));
        }
        ImageView imageView = this.pickerViewSendButton;
        Property property5 = View.ALPHA;
        float[] fArr5 = new float[1];
        fArr5[0] = z ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(imageView, property5, fArr5));
        ImageView imageView2 = this.pickerViewSendButton;
        Property property6 = View.TRANSLATION_Y;
        float[] fArr6 = new float[1];
        fArr6[0] = z ? 0.0f : dpf2;
        arrayList.add(ObjectAnimator.ofFloat(imageView2, property6, fArr6));
        int i = this.sendPhotoType;
        if (i == 0 || i == 4) {
            CheckBox checkBox = this.checkImageView;
            Property property7 = View.ALPHA;
            float[] fArr7 = new float[1];
            fArr7[0] = z ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(checkBox, property7, fArr7));
            CheckBox checkBox2 = this.checkImageView;
            Property property8 = View.TRANSLATION_Y;
            float[] fArr8 = new float[1];
            fArr8[0] = z ? 0.0f : -dpf2;
            arrayList.add(ObjectAnimator.ofFloat(checkBox2, property8, fArr8));
            CounterView counterView = this.photosCounterView;
            Property property9 = View.ALPHA;
            float[] fArr9 = new float[1];
            fArr9[0] = z ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(counterView, property9, fArr9));
            CounterView counterView2 = this.photosCounterView;
            Property property10 = View.TRANSLATION_Y;
            float[] fArr10 = new float[1];
            fArr10[0] = z ? 0.0f : -dpf2;
            arrayList.add(ObjectAnimator.ofFloat(counterView2, property10, fArr10));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(200L);
        animatorSet.start();
        if (z || !isCaptionOpen()) {
            return;
        }
        if (this.captionEdit.editText.isPopupShowing()) {
            this.captionEdit.editText.hidePopup(true);
        }
        this.captionEdit.editText.closeKeyboard();
    }

    private void toggleMiniProgressInternal(final boolean z) {
        if (z) {
            this.miniProgressView.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.miniProgressAnimator = animatorSet;
        Animator[] animatorArr = new Animator[1];
        RadialProgressView radialProgressView = this.miniProgressView;
        Property property = View.ALPHA;
        float[] fArr = new float[1];
        fArr[0] = z ? 1.0f : 0.0f;
        animatorArr[0] = ObjectAnimator.ofFloat(radialProgressView, property, fArr);
        animatorSet.playTogether(animatorArr);
        this.miniProgressAnimator.setDuration(200L);
        this.miniProgressAnimator.addListener(new AnimatorListenerAdapter() {
            {
                PhotoViewer.this = this;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (animator.equals(PhotoViewer.this.miniProgressAnimator)) {
                    if (!z) {
                        PhotoViewer.this.miniProgressView.setVisibility(4);
                    }
                    PhotoViewer.this.miniProgressAnimator = null;
                }
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                if (animator.equals(PhotoViewer.this.miniProgressAnimator)) {
                    PhotoViewer.this.miniProgressAnimator = null;
                }
            }
        });
        this.miniProgressAnimator.start();
    }

    private void toggleMiniProgress(boolean z, boolean z2) {
        AndroidUtilities.cancelRunOnUIThread(this.miniProgressShowRunnable);
        if (z2) {
            toggleMiniProgressInternal(z);
            if (z) {
                AnimatorSet animatorSet = this.miniProgressAnimator;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.miniProgressAnimator = null;
                }
                if (this.firstAnimationDelay) {
                    this.firstAnimationDelay = false;
                    toggleMiniProgressInternal(true);
                    return;
                }
                AndroidUtilities.runOnUIThread(this.miniProgressShowRunnable, 500L);
                return;
            }
            AnimatorSet animatorSet2 = this.miniProgressAnimator;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                toggleMiniProgressInternal(false);
                return;
            }
            return;
        }
        AnimatorSet animatorSet3 = this.miniProgressAnimator;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
            this.miniProgressAnimator = null;
        }
        this.miniProgressView.setAlpha(z ? 1.0f : 0.0f);
        this.miniProgressView.setVisibility(z ? 0 : 4);
    }

    private void updateContainerFlags(boolean z) {
        FrameLayoutDrawer frameLayoutDrawer;
        if (Build.VERSION.SDK_INT < 21 || this.sendPhotoType == 1 || (frameLayoutDrawer = this.containerView) == null) {
            return;
        }
        int i = 1792;
        if (!z) {
            i = 1796;
            if (frameLayoutDrawer.getPaddingLeft() > 0 || this.containerView.getPaddingRight() > 0) {
                i = 5894;
            }
        }
        this.containerView.setSystemUiVisibility(i);
    }

    public static class ActionBarToggleParams {
        public static final ActionBarToggleParams DEFAULT = new ActionBarToggleParams();
        public Interpolator animationInterpolator;
        public int animationDuration = 200;
        public boolean enableStatusBarAnimation = true;
        public boolean enableTranslationAnimation = true;

        public ActionBarToggleParams enableStatusBarAnimation(boolean z) {
            this.enableStatusBarAnimation = z;
            return this;
        }

        public ActionBarToggleParams enableTranslationAnimation(boolean z) {
            this.enableTranslationAnimation = z;
            return this;
        }

        public ActionBarToggleParams animationDuration(int i) {
            this.animationDuration = i;
            return this;
        }

        public ActionBarToggleParams animationInterpolator(Interpolator interpolator) {
            this.animationInterpolator = interpolator;
            return this;
        }
    }

    public void toggleActionBar(boolean z, boolean z2) {
        toggleActionBar(z, z2, ActionBarToggleParams.DEFAULT);
    }

    public void toggleActionBar(final boolean z, boolean z2, ActionBarToggleParams actionBarToggleParams) {
        CaptionScrollView captionScrollView;
        CaptionScrollView captionScrollView2;
        if (this.currentEditMode == 0) {
            int i = this.switchingToMode;
            if (i == 0 || i == -1) {
                AnimatorSet animatorSet = this.actionBarAnimator;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                if (z) {
                    this.actionBar.setVisibility(0);
                    if (this.bottomLayout.getTag() != null) {
                        this.bottomLayout.setVisibility(0);
                    }
                    if (this.captionTextViewSwitcher.getTag() != null) {
                        this.captionTextViewSwitcher.setVisibility(0);
                        VideoSeekPreviewImage videoSeekPreviewImage = this.videoPreviewFrame;
                        if (videoSeekPreviewImage != null) {
                            videoSeekPreviewImage.requestLayout();
                        }
                    }
                }
                this.isActionBarVisible = z;
                PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
                if (photoViewerWebView != null) {
                    photoViewerWebView.setTouchDisabled(z);
                }
                if (actionBarToggleParams.enableStatusBarAnimation) {
                    updateContainerFlags(z);
                }
                if (this.videoPlayerControlVisible && this.isPlaying && z) {
                    scheduleActionBarHide();
                } else {
                    AndroidUtilities.cancelRunOnUIThread(this.hideActionBarRunnable);
                }
                if (!z) {
                    Bulletin.hide(this.containerView);
                }
                float dpf2 = AndroidUtilities.dpf2(24.0f);
                this.videoPlayerControlFrameLayout.setSeekBarTransitionEnabled(actionBarToggleParams.enableTranslationAnimation && this.playerLooping);
                this.videoPlayerControlFrameLayout.setTranslationYAnimationEnabled(actionBarToggleParams.enableTranslationAnimation);
                if (z2) {
                    ArrayList arrayList = new ArrayList();
                    ActionBar actionBar = this.actionBar;
                    Property property = View.ALPHA;
                    float[] fArr = new float[1];
                    fArr[0] = z ? 1.0f : 0.0f;
                    arrayList.add(ObjectAnimator.ofFloat(actionBar, property, fArr));
                    if (actionBarToggleParams.enableTranslationAnimation) {
                        ActionBar actionBar2 = this.actionBar;
                        Property property2 = View.TRANSLATION_Y;
                        float[] fArr2 = new float[1];
                        fArr2[0] = z ? 0.0f : -dpf2;
                        arrayList.add(ObjectAnimator.ofFloat(actionBar2, property2, fArr2));
                    } else {
                        this.actionBar.setTranslationY(0.0f);
                    }
                    if (this.allowShowFullscreenButton) {
                        ImageView imageView = this.fullscreenButton[0];
                        Property property3 = View.ALPHA;
                        float[] fArr3 = new float[1];
                        fArr3[0] = z ? 1.0f : 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(imageView, property3, fArr3));
                    }
                    for (int i2 = 1; i2 < 3; i2++) {
                        this.fullscreenButton[i2].setTranslationY(z ? 0.0f : dpf2);
                    }
                    if (actionBarToggleParams.enableTranslationAnimation) {
                        ImageView imageView2 = this.fullscreenButton[0];
                        Property property4 = View.TRANSLATION_Y;
                        float[] fArr4 = new float[1];
                        fArr4[0] = z ? 0.0f : dpf2;
                        arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, fArr4));
                    } else {
                        this.fullscreenButton[0].setTranslationY(0.0f);
                    }
                    FrameLayout frameLayout = this.bottomLayout;
                    if (frameLayout != null) {
                        Property property5 = View.ALPHA;
                        float[] fArr5 = new float[1];
                        fArr5[0] = z ? 1.0f : 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout, property5, fArr5));
                        if (actionBarToggleParams.enableTranslationAnimation) {
                            FrameLayout frameLayout2 = this.bottomLayout;
                            Property property6 = View.TRANSLATION_Y;
                            float[] fArr6 = new float[1];
                            fArr6[0] = z ? 0.0f : dpf2;
                            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property6, fArr6));
                        } else {
                            this.bottomLayout.setTranslationY(0.0f);
                        }
                    }
                    PhotoCountView photoCountView = this.countView;
                    if (photoCountView != null) {
                        Property property7 = View.ALPHA;
                        float[] fArr7 = new float[1];
                        fArr7[0] = z ? 1.0f : 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(photoCountView, property7, fArr7));
                        if (actionBarToggleParams.enableTranslationAnimation) {
                            PhotoCountView photoCountView2 = this.countView;
                            Property property8 = View.TRANSLATION_Y;
                            float[] fArr8 = new float[1];
                            fArr8[0] = z ? 0.0f : -dpf2;
                            arrayList.add(ObjectAnimator.ofFloat(photoCountView2, property8, fArr8));
                        } else {
                            this.countView.setTranslationY(0.0f);
                        }
                    }
                    View view = this.navigationBar;
                    if (view != null) {
                        Property property9 = View.ALPHA;
                        float[] fArr9 = new float[1];
                        fArr9[0] = z ? 1.0f : 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(view, property9, fArr9));
                    }
                    if (this.videoPlayerControlVisible) {
                        VideoPlayerControlFrameLayout videoPlayerControlFrameLayout = this.videoPlayerControlFrameLayout;
                        Property<VideoPlayerControlFrameLayout, Float> property10 = VPC_PROGRESS;
                        float[] fArr10 = new float[1];
                        fArr10[0] = z ? 1.0f : 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(videoPlayerControlFrameLayout, property10, fArr10));
                    } else {
                        this.videoPlayerControlFrameLayout.setProgress(z ? 1.0f : 0.0f);
                    }
                    GroupedPhotosListView groupedPhotosListView = this.groupedPhotosListView;
                    Property property11 = View.ALPHA;
                    float[] fArr11 = new float[1];
                    fArr11[0] = z ? 1.0f : 0.0f;
                    arrayList.add(ObjectAnimator.ofFloat(groupedPhotosListView, property11, fArr11));
                    if (actionBarToggleParams.enableTranslationAnimation) {
                        GroupedPhotosListView groupedPhotosListView2 = this.groupedPhotosListView;
                        Property property12 = View.TRANSLATION_Y;
                        float[] fArr12 = new float[1];
                        fArr12[0] = z ? 0.0f : dpf2;
                        arrayList.add(ObjectAnimator.ofFloat(groupedPhotosListView2, property12, fArr12));
                    } else {
                        this.groupedPhotosListView.setTranslationY(0.0f);
                    }
                    if (!this.needCaptionLayout && (captionScrollView2 = this.captionScrollView) != null) {
                        Property property13 = View.ALPHA;
                        float[] fArr13 = new float[1];
                        fArr13[0] = z ? 1.0f : 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(captionScrollView2, property13, fArr13));
                        if (actionBarToggleParams.enableTranslationAnimation) {
                            CaptionScrollView captionScrollView3 = this.captionScrollView;
                            Property property14 = View.TRANSLATION_Y;
                            float[] fArr14 = new float[1];
                            if (z) {
                                dpf2 = 0.0f;
                            }
                            fArr14[0] = dpf2;
                            arrayList.add(ObjectAnimator.ofFloat(captionScrollView3, property14, fArr14));
                        } else {
                            this.captionScrollView.setTranslationY(0.0f);
                        }
                    }
                    if (this.videoPlayerControlVisible && this.isPlaying) {
                        float[] fArr15 = new float[2];
                        fArr15[0] = this.photoProgressViews[0].animAlphas[1];
                        fArr15[1] = z ? 1.0f : 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr15);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                PhotoViewer.this.lambda$toggleActionBar$83(valueAnimator);
                            }
                        });
                        arrayList.add(ofFloat);
                    }
                    if (this.muteItem.getTag() != null) {
                        ImageView imageView3 = this.muteItem;
                        Property property15 = View.ALPHA;
                        float[] fArr16 = new float[1];
                        fArr16[0] = z ? 1.0f : 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(imageView3, property15, fArr16));
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.actionBarAnimator = animatorSet2;
                    animatorSet2.playTogether(arrayList);
                    this.actionBarAnimator.setDuration(actionBarToggleParams.animationDuration);
                    this.actionBarAnimator.setInterpolator(actionBarToggleParams.animationInterpolator);
                    this.actionBarAnimator.addListener(new AnimatorListenerAdapter() {
                        {
                            PhotoViewer.this = this;
                        }

                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (animator.equals(PhotoViewer.this.actionBarAnimator)) {
                                if (!z) {
                                    PhotoViewer.this.actionBar.setVisibility(4);
                                    if (PhotoViewer.this.bottomLayout.getTag() != null) {
                                        PhotoViewer.this.bottomLayout.setVisibility(4);
                                    }
                                    if (PhotoViewer.this.captionTextViewSwitcher.getTag() != null) {
                                        PhotoViewer.this.captionTextViewSwitcher.setVisibility(4);
                                    }
                                }
                                PhotoViewer.this.actionBarAnimator = null;
                            }
                        }

                        @Override
                        public void onAnimationCancel(Animator animator) {
                            if (animator.equals(PhotoViewer.this.actionBarAnimator)) {
                                PhotoViewer.this.actionBarAnimator = null;
                            }
                        }
                    });
                    this.actionBarAnimator.start();
                    return;
                }
                this.actionBar.setAlpha(z ? 1.0f : 0.0f);
                if (this.fullscreenButton[0].getTranslationX() != 0.0f && this.allowShowFullscreenButton) {
                    this.fullscreenButton[0].setAlpha(z ? 1.0f : 0.0f);
                }
                for (int i3 = 0; i3 < 3; i3++) {
                    this.fullscreenButton[i3].setTranslationY(z ? 0.0f : dpf2);
                }
                this.actionBar.setTranslationY(z ? 0.0f : -dpf2);
                PhotoCountView photoCountView3 = this.countView;
                if (photoCountView3 != null) {
                    photoCountView3.setAlpha(z ? 1.0f : 0.0f);
                    this.countView.setTranslationY(z ? 0.0f : -dpf2);
                }
                this.bottomLayout.setAlpha(z ? 1.0f : 0.0f);
                this.bottomLayout.setTranslationY(z ? 0.0f : dpf2);
                this.navigationBar.setAlpha(z ? 1.0f : 0.0f);
                this.groupedPhotosListView.setAlpha((!z || this.aboutToSwitchTo == 3) ? 0.0f : 1.0f);
                this.groupedPhotosListView.setTranslationY((!z || this.aboutToSwitchTo == 3) ? dpf2 : 0.0f);
                if (!this.needCaptionLayout && (captionScrollView = this.captionScrollView) != null) {
                    captionScrollView.setAlpha(z ? 1.0f : 0.0f);
                    CaptionScrollView captionScrollView4 = this.captionScrollView;
                    if (z) {
                        dpf2 = 0.0f;
                    }
                    captionScrollView4.setTranslationY(dpf2);
                }
                this.videoPlayerControlFrameLayout.setProgress(z ? 1.0f : 0.0f);
                if (this.muteItem.getTag() != null) {
                    this.muteItem.setAlpha(z ? 1.0f : 0.0f);
                }
                if (this.videoPlayerControlVisible && this.isPlaying) {
                    this.photoProgressViews[0].setIndexedAlpha(1, z ? 1.0f : 0.0f, false);
                }
            }
        }
    }

    public void lambda$toggleActionBar$83(ValueAnimator valueAnimator) {
        this.photoProgressViews[0].setIndexedAlpha(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
    }

    private void togglePhotosListView(boolean z, boolean z2) {
        if (z == this.isPhotosListViewVisible) {
            return;
        }
        if (z) {
            this.selectedPhotosListView.setVisibility(0);
        }
        this.isPhotosListViewVisible = z;
        this.selectedPhotosListView.setEnabled(z);
        if (z2) {
            ArrayList arrayList = new ArrayList();
            SelectedPhotosListView selectedPhotosListView = this.selectedPhotosListView;
            Property property = View.ALPHA;
            float[] fArr = new float[1];
            fArr[0] = z ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(selectedPhotosListView, property, fArr));
            SelectedPhotosListView selectedPhotosListView2 = this.selectedPhotosListView;
            Property property2 = View.TRANSLATION_Y;
            float[] fArr2 = new float[1];
            fArr2[0] = z ? 0.0f : -AndroidUtilities.dp(10.0f);
            arrayList.add(ObjectAnimator.ofFloat(selectedPhotosListView2, property2, fArr2));
            CounterView counterView = this.photosCounterView;
            Property property3 = View.ROTATION_X;
            float[] fArr3 = new float[1];
            fArr3[0] = z ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(counterView, property3, fArr3));
            AnimatorSet animatorSet = new AnimatorSet();
            this.currentListViewAnimation = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z) {
                this.currentListViewAnimation.addListener(new AnimatorListenerAdapter() {
                    {
                        PhotoViewer.this = this;
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (PhotoViewer.this.currentListViewAnimation == null || !PhotoViewer.this.currentListViewAnimation.equals(animator)) {
                            return;
                        }
                        PhotoViewer.this.selectedPhotosListView.setVisibility(8);
                        PhotoViewer.this.currentListViewAnimation = null;
                    }
                });
            }
            this.currentListViewAnimation.setDuration(200L);
            this.currentListViewAnimation.start();
            return;
        }
        this.selectedPhotosListView.setAlpha(z ? 1.0f : 0.0f);
        this.selectedPhotosListView.setTranslationY(z ? 0.0f : -AndroidUtilities.dp(10.0f));
        this.photosCounterView.setRotationX(z ? 1.0f : 0.0f);
        if (z) {
            return;
        }
        this.selectedPhotosListView.setVisibility(8);
    }

    public void toggleVideoPlayer() {
        VideoPlayer videoPlayer;
        VideoPlayer videoPlayer2;
        PhotoViewerWebView photoViewerWebView;
        if (this.videoPlayer != null || ((photoViewerWebView = this.photoViewerWebView) != null && photoViewerWebView.isControllable())) {
            boolean isPlaying = this.videoPlayer != null ? this.isPlaying : this.photoViewerWebView.isPlaying();
            cancelVideoPlayRunnable();
            AndroidUtilities.cancelRunOnUIThread(this.hideActionBarRunnable);
            if (isPlaying) {
                pauseVideoOrWeb();
            } else {
                if (this.isCurrentVideo) {
                    if (Math.abs(this.videoTimelineView.getProgress() - this.videoTimelineView.getRightProgress()) < 0.01f || ((videoPlayer2 = this.videoPlayer) != null && videoPlayer2.getCurrentPosition() == this.videoPlayer.getDuration())) {
                        seekVideoOrWebToProgress(this.videoTimelineView.getLeftProgress());
                    }
                } else {
                    if (Math.abs(this.videoPlayerSeekbar.getProgress() - this.videoTimelineView.getRightProgress()) < 0.01f || ((videoPlayer = this.videoPlayer) != null && videoPlayer.getCurrentPosition() == this.videoPlayer.getDuration())) {
                        seekVideoOrWebToProgress(0.0f);
                    }
                    scheduleActionBarHide();
                }
                playVideoOrWeb();
            }
            this.containerView.invalidate();
        }
    }

    private String getFileName(int i) {
        if (i < 0) {
            return null;
        }
        if (!this.secureDocuments.isEmpty()) {
            if (i >= this.secureDocuments.size()) {
                return null;
            }
            SecureDocument secureDocument = this.secureDocuments.get(i);
            return secureDocument.secureFile.dc_id + "_" + secureDocument.secureFile.id + ".jpg";
        } else if (!this.imagesArrLocations.isEmpty() || !this.imagesArr.isEmpty()) {
            if (!this.imagesArrLocations.isEmpty()) {
                if (i >= this.imagesArrLocations.size()) {
                    return null;
                }
                ImageLocation imageLocation = this.imagesArrLocations.get(i);
                ImageLocation imageLocation2 = this.imagesArrLocationsVideo.get(i);
                if (imageLocation == null) {
                    return null;
                }
                if (imageLocation2 != null && imageLocation2 != imageLocation) {
                    return imageLocation2.location.volume_id + "_" + imageLocation2.location.local_id + ".mp4";
                }
                return imageLocation.location.volume_id + "_" + imageLocation.location.local_id + ".jpg";
            } else if (i >= this.imagesArr.size()) {
                return null;
            } else {
                return FileLoader.getMessageFileName(this.imagesArr.get(i).messageOwner);
            }
        } else {
            if (!this.imagesArrLocals.isEmpty()) {
                if (i >= this.imagesArrLocals.size()) {
                    return null;
                }
                Object obj = this.imagesArrLocals.get(i);
                if (obj instanceof MediaController.SearchImage) {
                    return ((MediaController.SearchImage) obj).getAttachName();
                }
                if (obj instanceof TLRPC$BotInlineResult) {
                    TLRPC$BotInlineResult tLRPC$BotInlineResult = (TLRPC$BotInlineResult) obj;
                    TLRPC$Document tLRPC$Document = tLRPC$BotInlineResult.document;
                    if (tLRPC$Document != null) {
                        return FileLoader.getAttachFileName(tLRPC$Document);
                    }
                    TLRPC$Photo tLRPC$Photo = tLRPC$BotInlineResult.photo;
                    if (tLRPC$Photo != null) {
                        return FileLoader.getAttachFileName(FileLoader.getClosestPhotoSizeWithSize(tLRPC$Photo.sizes, AndroidUtilities.getPhotoSize()));
                    }
                    if (tLRPC$BotInlineResult.content instanceof TLRPC$TL_webDocument) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(Utilities.MD5(tLRPC$BotInlineResult.content.url));
                        sb.append(".");
                        TLRPC$WebDocument tLRPC$WebDocument = tLRPC$BotInlineResult.content;
                        sb.append(ImageLoader.getHttpUrlExtension(tLRPC$WebDocument.url, FileLoader.getMimeTypePart(tLRPC$WebDocument.mime_type)));
                        return sb.toString();
                    }
                }
            } else {
                PageBlocksAdapter pageBlocksAdapter = this.pageBlocksAdapter;
                if (pageBlocksAdapter != null) {
                    return pageBlocksAdapter.getFileName(i);
                }
            }
            return null;
        }
    }

    private ImageLocation getImageLocation(int i, long[] jArr) {
        if (i < 0) {
            return null;
        }
        if (!this.secureDocuments.isEmpty()) {
            if (i >= this.secureDocuments.size()) {
                return null;
            }
            if (jArr != null) {
                jArr[0] = this.secureDocuments.get(i).secureFile.size;
            }
            return ImageLocation.getForSecureDocument(this.secureDocuments.get(i));
        } else if (!this.imagesArrLocations.isEmpty()) {
            if (i >= this.imagesArrLocations.size()) {
                return null;
            }
            if (jArr != null && this.imagesArrLocationsSizes.get(i) != null) {
                jArr[0] = this.imagesArrLocationsSizes.get(i).longValue();
            }
            return this.imagesArrLocationsVideo.get(i);
        } else if (this.imagesArr.isEmpty() || i >= this.imagesArr.size()) {
            return null;
        } else {
            MessageObject messageObject = this.imagesArr.get(i);
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            if (tLRPC$Message instanceof TLRPC$TL_messageService) {
                if (tLRPC$Message.action instanceof TLRPC$TL_messageActionUserUpdatedPhoto) {
                    return null;
                }
                TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                if (closestPhotoSizeWithSize != null) {
                    if (jArr != null) {
                        jArr[0] = closestPhotoSizeWithSize.size;
                        if (jArr[0] == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject);
                } else if (jArr != null) {
                    jArr[0] = -1;
                }
            } else if (((MessageObject.getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaPhoto) && MessageObject.getMedia(messageObject.messageOwner).photo != null) || ((MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC$TL_messageMediaWebPage) && MessageObject.getMedia(messageObject.messageOwner).webpage != null)) {
                if (messageObject.isGif()) {
                    return ImageLocation.getForDocument(messageObject.getDocument());
                }
                TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize(), false, null, true);
                if (closestPhotoSizeWithSize2 != null) {
                    if (jArr != null) {
                        jArr[0] = closestPhotoSizeWithSize2.size;
                        if (jArr[0] == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject);
                } else if (jArr != null) {
                    jArr[0] = -1;
                }
            } else if (MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC$TL_messageMediaInvoice) {
                return ImageLocation.getForWebFile(WebFile.createWithWebDocument(((TLRPC$TL_messageMediaInvoice) MessageObject.getMedia(messageObject.messageOwner)).webPhoto));
            } else {
                if (messageObject.getDocument() != null) {
                    TLRPC$Document document = messageObject.getDocument();
                    if (this.sharedMediaType == 5) {
                        return ImageLocation.getForDocument(document);
                    }
                    if (MessageObject.isDocumentHasThumb(messageObject.getDocument())) {
                        TLRPC$PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                        if (jArr != null) {
                            jArr[0] = closestPhotoSizeWithSize3.size;
                            if (jArr[0] == 0) {
                                jArr[0] = -1;
                            }
                        }
                        return ImageLocation.getForDocument(closestPhotoSizeWithSize3, document);
                    }
                }
            }
            return null;
        }
    }

    public TLObject getFileLocation(int i, long[] jArr) {
        if (i < 0) {
            return null;
        }
        if (!this.secureDocuments.isEmpty()) {
            if (i >= this.secureDocuments.size()) {
                return null;
            }
            if (jArr != null) {
                jArr[0] = this.secureDocuments.get(i).secureFile.size;
            }
            return this.secureDocuments.get(i);
        } else if (!this.imagesArrLocations.isEmpty()) {
            if (i >= this.imagesArrLocations.size()) {
                return null;
            }
            if (jArr != null && this.imagesArrLocationsSizes.get(i) != null) {
                jArr[0] = this.imagesArrLocationsSizes.get(i).longValue();
            }
            if (this.imagesArrLocationsVideo.get(i) != null) {
                return this.imagesArrLocationsVideo.get(i).location;
            }
            return null;
        } else if (this.imagesArr.isEmpty() || i >= this.imagesArr.size()) {
            return null;
        } else {
            MessageObject messageObject = this.imagesArr.get(i);
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            if (tLRPC$Message instanceof TLRPC$TL_messageService) {
                TLRPC$MessageAction tLRPC$MessageAction = tLRPC$Message.action;
                if (tLRPC$MessageAction instanceof TLRPC$TL_messageActionUserUpdatedPhoto) {
                    return tLRPC$MessageAction.newUserPhoto.photo_big;
                }
                TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                if (closestPhotoSizeWithSize != null) {
                    if (jArr != null) {
                        jArr[0] = closestPhotoSizeWithSize.size;
                        if (jArr[0] == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return closestPhotoSizeWithSize;
                } else if (jArr != null) {
                    jArr[0] = -1;
                }
            } else if (((MessageObject.getMedia(tLRPC$Message) instanceof TLRPC$TL_messageMediaPhoto) && MessageObject.getMedia(messageObject.messageOwner).photo != null) || ((MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC$TL_messageMediaWebPage) && MessageObject.getMedia(messageObject.messageOwner).webpage != null)) {
                TLRPC$PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize(), false, null, true);
                if (closestPhotoSizeWithSize2 != null) {
                    if (jArr != null) {
                        jArr[0] = closestPhotoSizeWithSize2.size;
                        if (jArr[0] == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return closestPhotoSizeWithSize2;
                } else if (jArr != null) {
                    jArr[0] = -1;
                }
            } else if (MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC$TL_messageMediaInvoice) {
                return ((TLRPC$TL_messageMediaInvoice) MessageObject.getMedia(messageObject.messageOwner)).photo;
            } else {
                if (messageObject.getDocument() != null && MessageObject.isDocumentHasThumb(messageObject.getDocument())) {
                    TLRPC$PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.getDocument().thumbs, 90);
                    if (jArr != null) {
                        jArr[0] = closestPhotoSizeWithSize3.size;
                        if (jArr[0] == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return closestPhotoSizeWithSize3;
                }
            }
            return null;
        }
    }

    public void updateSelectedCount() {
        PhotoViewerProvider photoViewerProvider = this.placeProvider;
        if (photoViewerProvider == null) {
            return;
        }
        int selectedCount = photoViewerProvider.getSelectedCount();
        this.photosCounterView.setCount(selectedCount);
        if (selectedCount == 0) {
            togglePhotosListView(false, true);
        }
    }

    public boolean isCurrentAvatarSet() {
        int i;
        if (this.currentAvatarLocation != null && (i = this.currentIndex) >= 0 && i < this.avatarsArr.size()) {
            TLRPC$Photo tLRPC$Photo = this.avatarsArr.get(this.currentIndex);
            ImageLocation imageLocation = this.imagesArrLocations.get(this.currentIndex);
            if (tLRPC$Photo instanceof TLRPC$TL_photoEmpty) {
                tLRPC$Photo = null;
            }
            if (tLRPC$Photo != null) {
                int size = tLRPC$Photo.sizes.size();
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC$FileLocation tLRPC$FileLocation = tLRPC$Photo.sizes.get(i2).location;
                    if (tLRPC$FileLocation != null) {
                        int i3 = tLRPC$FileLocation.local_id;
                        TLRPC$TL_fileLocationToBeDeprecated tLRPC$TL_fileLocationToBeDeprecated = this.currentAvatarLocation.location;
                        if (i3 == tLRPC$TL_fileLocationToBeDeprecated.local_id && tLRPC$FileLocation.volume_id == tLRPC$TL_fileLocationToBeDeprecated.volume_id) {
                            return true;
                        }
                    }
                }
            } else if (imageLocation != null) {
                TLRPC$TL_fileLocationToBeDeprecated tLRPC$TL_fileLocationToBeDeprecated2 = imageLocation.location;
                int i4 = tLRPC$TL_fileLocationToBeDeprecated2.local_id;
                TLRPC$TL_fileLocationToBeDeprecated tLRPC$TL_fileLocationToBeDeprecated3 = this.currentAvatarLocation.location;
                if (i4 == tLRPC$TL_fileLocationToBeDeprecated3.local_id && tLRPC$TL_fileLocationToBeDeprecated2.volume_id == tLRPC$TL_fileLocationToBeDeprecated3.volume_id) {
                    return true;
                }
            }
        }
        return false;
    }

    private void setItemVisible(View view, boolean z, boolean z2) {
        setItemVisible(view, z, z2, 1.0f);
    }

    private void setItemVisible(final View view, final boolean z, boolean z2, float f) {
        Boolean bool = this.actionBarItemsVisibility.get(view);
        if (bool == null || bool.booleanValue() != z) {
            this.actionBarItemsVisibility.put(view, Boolean.valueOf(z));
            view.animate().cancel();
            float f2 = (z ? 1.0f : 0.0f) * f;
            if (z2 && bool != null) {
                if (z) {
                    view.setVisibility(0);
                }
                view.animate().alpha(f2).setDuration(100L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        PhotoViewer.this.lambda$setItemVisible$84(valueAnimator);
                    }
                }).setInterpolator(new LinearInterpolator()).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        PhotoViewer.this.lambda$setItemVisible$85(z, view);
                    }
                }).start();
                return;
            }
            view.setVisibility(z ? 0 : 8);
            view.setAlpha(f2);
            updateActionBarTitlePadding();
        }
    }

    public void lambda$setItemVisible$84(ValueAnimator valueAnimator) {
        updateActionBarTitlePadding();
    }

    public void lambda$setItemVisible$85(boolean z, View view) {
        if (!z) {
            view.setVisibility(8);
        }
        updateActionBarTitlePadding();
    }

    public void onPhotoShow(org.telegram.messenger.MessageObject r30, org.telegram.tgnet.TLRPC$FileLocation r31, org.telegram.messenger.ImageLocation r32, org.telegram.messenger.ImageLocation r33, java.util.ArrayList<org.telegram.messenger.MessageObject> r34, java.util.ArrayList<org.telegram.messenger.SecureDocument> r35, java.util.List<java.lang.Object> r36, int r37, org.telegram.ui.PhotoViewer.PlaceProviderObject r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.onPhotoShow(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.ImageLocation, org.telegram.messenger.ImageLocation, java.util.ArrayList, java.util.ArrayList, java.util.List, int, org.telegram.ui.PhotoViewer$PlaceProviderObject):void");
    }

    public static int lambda$onPhotoShow$86(MessageObject messageObject, MessageObject messageObject2) {
        return messageObject.getId() - messageObject2.getId();
    }

    private boolean canSendMediaToParentChatActivity() {
        TLRPC$Chat tLRPC$Chat;
        ChatActivity chatActivity = this.parentChatActivity;
        return (chatActivity == null || (chatActivity.currentUser == null && ((tLRPC$Chat = chatActivity.currentChat) == null || ChatObject.isNotInChat(tLRPC$Chat) || (!ChatObject.canSendPhoto(this.parentChatActivity.currentChat) && !ChatObject.canSendVideo(this.parentChatActivity.currentChat))))) ? false : true;
    }

    private void setDoubleTapEnabled(boolean z) {
        this.doubleTapEnabled = z;
        this.gestureDetector.setOnDoubleTapListener(z ? this : null);
    }

    public void setImages() {
        if (this.animationInProgress == 0) {
            setIndexToImage(this.centerImage, this.currentIndex, null);
            setIndexToPaintingOverlay(this.currentIndex, this.paintingOverlay);
            setIndexToImage(this.rightImage, this.currentIndex + 1, this.rightCropTransform);
            setIndexToPaintingOverlay(this.currentIndex + 1, this.rightPaintingOverlay);
            setIndexToImage(this.leftImage, this.currentIndex - 1, this.leftCropTransform);
            setIndexToPaintingOverlay(this.currentIndex - 1, this.leftPaintingOverlay);
        }
    }

    private void setIsAboutToSwitchToIndex(final int r41, boolean r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.setIsAboutToSwitchToIndex(int, boolean, boolean):void");
    }

    public void lambda$setIsAboutToSwitchToIndex$87(int i, TranslateController translateController, MessageObject messageObject, String str) {
        if (i != this.switchingToIndex) {
            return;
        }
        this.captionDetectedLanguage = str;
        if (translateController.isContextTranslateEnabled() && translateController.canTranslatePhoto(messageObject, this.captionDetectedLanguage)) {
            if (this.captionTranslated) {
                this.menuItem.showSubItem(22);
                this.menuItem.hideSubItem(21);
                return;
            }
            this.menuItem.showSubItem(21);
            this.menuItem.hideSubItem(22);
            return;
        }
        this.menuItem.hideSubItem(21);
        this.menuItem.hideSubItem(22);
    }

    public void updateCaptionTranslated() {
        int i;
        MessageObject messageObject;
        TLRPC$Message tLRPC$Message;
        if (this.imagesArr.isEmpty() || (i = this.switchingToIndex) < 0 || i >= this.imagesArr.size() || (messageObject = this.imagesArr.get(this.switchingToIndex)) == null) {
            return;
        }
        if (this.captionTranslated && (tLRPC$Message = messageObject.messageOwner) != null && tLRPC$Message.translatedText != null && TextUtils.equals(tLRPC$Message.translatedToLanguage, TranslateAlert2.getToLanguage())) {
            setCurrentCaption(messageObject, postProcessTranslated(messageObject), false, true);
        } else {
            setCurrentCaption(messageObject, messageObject.caption, this.captionTranslated, true);
        }
    }

    private CharSequence postProcessTranslated(MessageObject messageObject) {
        if (messageObject == null || messageObject.messageOwner == null) {
            return "";
        }
        Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(messageObject.messageOwner.translatedText.text), Theme.chat_msgTextPaint.getFontMetricsInt(), AndroidUtilities.dp(20.0f), false), messageObject.messageOwner.translatedText.entities, Theme.chat_msgTextPaint.getFontMetricsInt(), false);
        if (MessageObject.containsUrls(replaceAnimatedEmoji)) {
            try {
                AndroidUtilities.addLinksSafe(replaceAnimatedEmoji, 5, false, true);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        MessageObject.addUrlsByPattern(messageObject.isOutOwner(), replaceAnimatedEmoji, true, 0, 0, true);
        MessageObject.addEntitiesToText(replaceAnimatedEmoji, messageObject.messageOwner.translatedText.entities, messageObject.isOutOwner(), true, true, true);
        if (messageObject.isVideo()) {
            MessageObject.addUrlsByPattern(messageObject.isOutOwner(), replaceAnimatedEmoji, true, 3, (int) messageObject.getDuration(), false);
        } else if (messageObject.isMusic() || messageObject.isVoice()) {
            MessageObject.addUrlsByPattern(messageObject.isOutOwner(), replaceAnimatedEmoji, true, 4, (int) messageObject.getDuration(), false);
        }
        return replaceAnimatedEmoji;
    }

    public void enableStickerMode(TLRPC$Document tLRPC$Document, boolean z, Utilities.Callback2<String, TLRPC$InputDocument> callback2) {
        this.replacedSticker = tLRPC$Document;
        this.stickerEmpty = z;
        this.stickerEmptySent = false;
        this.customStickerHandler = callback2;
        this.rotate = 0.0f;
        this.animateToRotate = 0.0f;
        if (this.stickerMakerView != null) {
            BlurButton blurButton = this.outlineBtn;
            if (blurButton != null) {
                blurButton.setActive(false, false);
            }
            this.stickerMakerView.clean();
            ArrayList<String> arrayList = this.selectedEmojis;
            if (arrayList != null) {
                arrayList.clear();
            }
        }
        if (this.replacedSticker != null) {
            ArrayList<String> arrayList2 = this.selectedEmojis;
            if (arrayList2 == null) {
                this.selectedEmojis = new ArrayList<>();
            } else {
                arrayList2.clear();
            }
            ArrayList<String> findStickerEmoticons = MessageObject.findStickerEmoticons(tLRPC$Document, Integer.valueOf(this.currentAccount));
            if (findStickerEmoticons != null) {
                this.selectedEmojis.addAll(findStickerEmoticons);
            }
        }
        BlurButton blurButton2 = this.cutOutBtn;
        if (blurButton2 != null) {
            blurButton2.clean();
        }
        showStickerMode(true, false);
        ImageView imageView = this.tuneItem;
        if (imageView != null) {
            imageView.setAlpha(this.stickerEmpty ? 0.4f : 1.0f);
        }
    }

    public void prepareSegmentImage() {
        StickerMakerView stickerMakerView = this.stickerMakerView;
        if (stickerMakerView == null || this.sendPhotoType != 11) {
            return;
        }
        if (this.stickerEmpty) {
            stickerMakerView.clean();
        } else {
            stickerMakerView.segmentImage(this.centerImage.getBitmap(), this.centerImage.getOrientation(), getContainerViewWidth(), getContainerViewHeight(), new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    PhotoViewer.this.lambda$prepareSegmentImage$88((StickerMakerView.SegmentedObject) obj);
                }
            });
        }
    }

    public void lambda$prepareSegmentImage$88(StickerMakerView.SegmentedObject segmentedObject) {
        try {
            boolean z = !TextUtils.isEmpty(((MediaController.MediaEditState) this.imagesArrLocals.get(this.currentIndex)).filterPath);
            this.stickerMakerView.setSegmentedState(true, segmentedObject);
            this.centerImage.setImageBitmap(this.stickerMakerView.getSegmentedImage(this.centerImage.getBitmap(), z, this.centerImage.getOrientation()));
            this.cutOutBtn.setUndoCutState(true);
            showStickerMode(true, true, true);
            this.cutOutBtn.post(new PhotoViewer$$ExternalSyntheticLambda75(this));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void showStickerMode(boolean z, boolean z2) {
        showStickerMode(z, z, z2);
    }

    private void showStickerMode(boolean z, boolean z2, boolean z3) {
        if (!z3) {
            this.stickerMakerView.animate().setListener(null).cancel();
            this.stickerMakerView.setVisibility(z ? 0 : 8);
            this.stickerMakerView.setAlpha(this.pickerView.getAlpha());
            this.stickerMakerBackgroundView.animate().setListener(null).cancel();
            this.stickerMakerBackgroundView.setVisibility(z ? 0 : 8);
            this.stickerMakerBackgroundView.setAlpha(z ? 1.0f : 0.0f);
        } else if (z && this.stickerMakerView.getTag() == null) {
            this.stickerMakerView.animate().setListener(null).cancel();
            this.stickerMakerBackgroundView.animate().setListener(null).cancel();
            if (this.stickerMakerView.getVisibility() != 0) {
                this.stickerMakerView.setVisibility(0);
                this.stickerMakerView.animate().alpha(1.0f).start();
                this.stickerMakerBackgroundView.setVisibility(0);
                this.stickerMakerBackgroundView.animate().alpha(1.0f).start();
            }
        } else if (!z && this.stickerMakerView.getTag() != null) {
            this.stickerMakerView.animate().setListener(null).cancel();
            this.stickerMakerView.animate().alpha(0.0f).setListener(new HideViewAfterAnimation(this.stickerMakerView)).start();
            this.stickerMakerBackgroundView.animate().setListener(null).cancel();
            this.stickerMakerBackgroundView.animate().alpha(0.0f).setListener(new HideViewAfterAnimation(this.stickerMakerBackgroundView)).start();
        }
        this.stickerMakerView.setTag(z ? 1 : null);
        boolean z4 = (!z || this.cutOutBtn.isUndoCutState() || this.stickerEmpty) ? false : true;
        if (!z3) {
            this.cutOutBtn.animate().setListener(null).cancel();
            this.cutOutBtn.setVisibility(z4 ? 0 : 8);
            this.cutOutBtn.setAlpha(z4 ? 1.0f : 0.0f);
        } else if (z4 && this.cutOutBtn.getTag() == null) {
            this.cutOutBtn.animate().setListener(null).cancel();
            if (this.cutOutBtn.getVisibility() != 0) {
                this.cutOutBtn.setVisibility(0);
            }
            this.cutOutBtn.animate().alpha(1.0f).start();
        } else if (!z4 && this.cutOutBtn.getTag() != null) {
            this.cutOutBtn.animate().setListener(null).cancel();
            this.cutOutBtn.animate().alpha(0.0f).setListener(new HideViewAfterAnimation(this.cutOutBtn)).start();
        }
        this.cutOutBtn.setTag(z4 ? 1 : null);
        showEditStickerMode(z && this.cutOutBtn.isUndoCutState() && !this.stickerEmpty, z3);
        this.stickerMakerView.setOutlineVisible(z && this.cutOutBtn.isUndoCutState() && this.outlineBtn.isActive() && !this.eraseBtn.isActive() && !this.restoreBtn.isActive());
        boolean z5 = z && this.cutOutBtn.isUndoCutState() && !this.eraseBtn.isActive() && !this.restoreBtn.isActive();
        if (!z3) {
            this.outlineBtn.animate().setListener(null).cancel();
            this.outlineBtn.setVisibility(z5 ? 0 : 8);
            this.outlineBtn.setAlpha(z5 ? 1.0f : 0.0f);
            this.outlineBtn.setScaleX(z5 ? 1.0f : 0.8f);
            this.outlineBtn.setScaleY(z5 ? 1.0f : 0.8f);
        } else if (z5 && this.outlineBtn.getTag() == null) {
            this.outlineBtn.animate().setListener(null).cancel();
            if (this.outlineBtn.getVisibility() != 0) {
                this.outlineBtn.setVisibility(0);
            }
            this.outlineBtn.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(400L).start();
        } else if (!z5 && this.outlineBtn.getTag() != null) {
            this.outlineBtn.animate().setListener(null).cancel();
            this.outlineBtn.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new HideViewAfterAnimation(this.outlineBtn)).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(400L).start();
        }
        this.outlineBtn.setTag(z5 ? 1 : null);
    }

    public void showEditStickerMode(boolean z, boolean z2) {
        StickerMakerView stickerMakerView;
        MaskPaintView maskPaintView;
        boolean z3 = true;
        if (!z || (stickerMakerView = this.stickerMakerView) == null || (stickerMakerView.empty && !stickerMakerView.overriddenPaths() && ((maskPaintView = this.maskPaintView) == null || !maskPaintView.canUndo()))) {
            z3 = false;
        }
        if (!z2) {
            this.undoBtn.animate().setListener(null).cancel();
            this.undoBtn.setVisibility(z3 ? 0 : 8);
            this.undoBtn.setAlpha(z3 ? 1.0f : 0.0f);
            this.undoBtn.setScaleX(z3 ? 1.0f : 0.8f);
            this.undoBtn.setScaleY(z3 ? 1.0f : 0.8f);
        } else if (z3 && this.undoBtn.getTag() == null) {
            this.undoBtn.animate().setListener(null).cancel();
            if (this.undoBtn.getVisibility() != 0) {
                this.undoBtn.setVisibility(0);
                this.undoBtn.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(400L).start();
            }
        } else if (!z3 && this.undoBtn.getTag() != null) {
            this.undoBtn.animate().setListener(null).cancel();
            this.undoBtn.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new HideViewAfterAnimation(this.undoBtn)).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(400L).start();
        }
        this.undoBtn.setTag(z3 ? r1 : null);
        if (!z2) {
            this.eraseBtn.animate().setListener(null).cancel();
            this.eraseBtn.setVisibility(z ? 0 : 8);
            this.eraseBtn.setAlpha(z ? 1.0f : 0.0f);
            this.eraseBtn.setScaleX(z ? 1.0f : 0.8f);
            this.eraseBtn.setScaleY(z ? 1.0f : 0.8f);
            this.restoreBtn.animate().setListener(null).cancel();
            this.restoreBtn.setVisibility(z ? 0 : 8);
            this.restoreBtn.setAlpha(z ? 1.0f : 0.0f);
            this.restoreBtn.setScaleX(z ? 1.0f : 0.8f);
            this.restoreBtn.setScaleY(z ? 1.0f : 0.8f);
        } else if (z && this.eraseBtn.getTag() == null) {
            this.eraseBtn.animate().setListener(null).cancel();
            this.restoreBtn.animate().setListener(null).cancel();
            if (this.eraseBtn.getVisibility() != 0) {
                this.eraseBtn.setVisibility(0);
                ViewPropertyAnimator scaleY = this.eraseBtn.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                scaleY.setInterpolator(cubicBezierInterpolator).setDuration(400L).start();
                this.restoreBtn.setVisibility(0);
                this.restoreBtn.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(cubicBezierInterpolator).setDuration(400L).start();
            }
        } else if (!z && this.eraseBtn.getTag() != null) {
            this.eraseBtn.animate().setListener(null).cancel();
            ViewPropertyAnimator listener = this.eraseBtn.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new HideViewAfterAnimation(this.eraseBtn));
            CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_OUT_QUINT;
            listener.setInterpolator(cubicBezierInterpolator2).setDuration(400L).start();
            this.restoreBtn.animate().setListener(null).cancel();
            this.restoreBtn.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new HideViewAfterAnimation(this.restoreBtn)).setInterpolator(cubicBezierInterpolator2).setDuration(400L).start();
        }
        this.eraseBtn.setTag(z ? 1 : null);
    }

    private void showEditCaption(boolean z, boolean z2) {
        if (!z2) {
            this.captionEdit.animate().setListener(null).cancel();
            this.captionEdit.setVisibility(z ? 0 : 8);
            this.captionEdit.setTranslationY(0.0f);
            this.captionEdit.setAlpha(this.pickerView.getAlpha());
        } else if (z && this.captionEdit.getTag() == null) {
            if (this.captionEdit.getVisibility() != 0) {
                this.captionEdit.setVisibility(0);
                this.captionEdit.setAlpha(this.pickerView.getAlpha());
                this.captionEdit.setTranslationY(AndroidUtilities.dp(58.0f));
            }
            ObjectAnimator objectAnimator = this.captionAnimator;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.captionAnimator.cancel();
            }
            CaptionPhotoViewer captionPhotoViewer = this.captionEdit;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(captionPhotoViewer, View.TRANSLATION_Y, captionPhotoViewer.getTranslationY(), 0.0f);
            this.captionAnimator = ofFloat;
            ofFloat.setDuration(220L);
            this.captionAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.captionAnimator.start();
        } else if (!z && this.captionEdit.getTag() != null) {
            ObjectAnimator objectAnimator2 = this.captionAnimator;
            if (objectAnimator2 != null) {
                objectAnimator2.removeAllListeners();
                this.captionAnimator.cancel();
            }
            CaptionPhotoViewer captionPhotoViewer2 = this.captionEdit;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(captionPhotoViewer2, View.TRANSLATION_Y, captionPhotoViewer2.getTranslationY(), AndroidUtilities.dp(58.0f));
            this.captionAnimator = ofFloat2;
            ofFloat2.addListener(new HideViewAfterAnimation(this.captionEdit));
            this.captionAnimator.setDuration(220L);
            this.captionAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.captionAnimator.start();
        }
        this.captionEdit.setTag(z ? 1 : null);
    }

    private void showVideoTimeline(boolean z, boolean z2) {
        if (!z2) {
            this.videoTimelineViewContainer.animate().setListener(null).cancel();
            this.videoTimelineViewContainer.setVisibility(z ? 0 : 8);
            this.videoTimelineView.setTranslationY(0.0f);
            this.videoTimelineViewContainer.setAlpha(this.pickerView.getAlpha());
        } else if (z && this.videoTimelineViewContainer.getTag() == null) {
            if (this.videoTimelineViewContainer.getVisibility() != 0) {
                this.videoTimelineViewContainer.setVisibility(0);
                this.videoTimelineViewContainer.setAlpha(this.pickerView.getAlpha());
                this.videoTimelineView.setTranslationY(AndroidUtilities.dp(58.0f));
            }
            ObjectAnimator objectAnimator = this.videoTimelineAnimator;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.videoTimelineAnimator.cancel();
            }
            VideoTimelinePlayView videoTimelinePlayView = this.videoTimelineView;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(videoTimelinePlayView, View.TRANSLATION_Y, videoTimelinePlayView.getTranslationY(), 0.0f);
            this.videoTimelineAnimator = ofFloat;
            ofFloat.setDuration(220L);
            this.videoTimelineAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.videoTimelineAnimator.start();
        } else if (!z && this.videoTimelineViewContainer.getTag() != null) {
            ObjectAnimator objectAnimator2 = this.videoTimelineAnimator;
            if (objectAnimator2 != null) {
                objectAnimator2.removeAllListeners();
                this.videoTimelineAnimator.cancel();
            }
            VideoTimelinePlayView videoTimelinePlayView2 = this.videoTimelineView;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(videoTimelinePlayView2, View.TRANSLATION_Y, videoTimelinePlayView2.getTranslationY(), AndroidUtilities.dp(58.0f));
            this.videoTimelineAnimator = ofFloat2;
            ofFloat2.addListener(new HideViewAfterAnimation(this.videoTimelineViewContainer));
            this.videoTimelineAnimator.setDuration(220L);
            this.videoTimelineAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.videoTimelineAnimator.start();
        }
        FrameLayout frameLayout = this.videoTimelineViewContainer;
        if (frameLayout != null && frameLayout.getVisibility() != 8) {
            this.videoTimelineViewContainer.setTranslationY(this.pickerView.getTranslationY() - Math.max(0, this.captionEdit.getEditTextHeight() - AndroidUtilities.dp(46.0f)));
        }
        this.videoTimelineViewContainer.setTag(z ? 1 : null);
    }

    public static TLRPC$FileLocation getFileLocation(ImageLocation imageLocation) {
        if (imageLocation == null) {
            return null;
        }
        return imageLocation.location;
    }

    public static String getFileLocationExt(ImageLocation imageLocation) {
        if (imageLocation == null || imageLocation.imageType != 2) {
            return null;
        }
        return "mp4";
    }

    public void setImageIndex(int i) {
        setImageIndex(i, true, false);
    }

    private void setImageIndex(int r34, boolean r35, boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.setImageIndex(int, boolean, boolean):void");
    }

    private void resetIndexForDeferredImageLoading() {
        Object mark = this.centerImage.getMark();
        if (mark == null || !mark.equals(1)) {
            return;
        }
        setIndexToImage(this.centerImage, this.currentIndex, null);
    }

    private void setCurrentCaption(MessageObject messageObject, CharSequence charSequence, boolean z, boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        TLRPC$Message tLRPC$Message;
        int i2;
        CharSequence cloneSpans = AnimatedEmojiSpan.cloneSpans(charSequence, 3);
        showEditCaption(this.editing, z2);
        if (this.editing || this.sendPhotoType == 1) {
            this.captionEdit.setText(cloneSpans);
            this.captionTextViewSwitcher.setVisibility(8);
            return;
        }
        this.captionEdit.setVisibility(8);
        if (this.needCaptionLayout) {
            if (this.captionTextViewSwitcher.getParent() != this.pickerView) {
                FrameLayout frameLayout = this.captionContainer;
                if (frameLayout != null) {
                    frameLayout.removeView(this.captionTextViewSwitcher);
                }
                this.captionTextViewSwitcher.setMeasureAllChildren(false);
                this.pickerView.addView(this.captionTextViewSwitcher, LayoutHelper.createFrame(-1, -2.0f, 83, 0.0f, 0.0f, 76.0f, 48.0f));
            }
        } else {
            if (this.captionScrollView == null) {
                FrameLayout frameLayout2 = new FrameLayout(this.containerView.getContext());
                this.captionContainer = frameLayout2;
                this.captionTextViewSwitcher.setContainer(frameLayout2);
                CaptionScrollView captionScrollView = new CaptionScrollView(this.containerView.getContext(), this.captionTextViewSwitcher, this.captionContainer) {
                    {
                        PhotoViewer.this = this;
                    }

                    @Override
                    protected boolean isStatusBarVisible() {
                        return Build.VERSION.SDK_INT >= 21 && !PhotoViewer.this.inBubbleMode;
                    }

                    @Override
                    public void invalidate() {
                        super.invalidate();
                        if (PhotoViewer.this.isActionBarVisible) {
                            int scrollY = getScrollY();
                            float translationY = PhotoViewer.this.captionTextViewSwitcher.getTranslationY();
                            boolean z5 = scrollY == 0 && translationY == 0.0f;
                            boolean z6 = scrollY == 0 && translationY == 0.0f;
                            if (!z5) {
                                int y = PhotoViewer.this.photoProgressViews[0].getY() + PhotoViewer.this.photoProgressViews[0].size;
                                int top = (((PhotoViewer.this.captionContainer.getTop() + ((int) translationY)) - scrollY) + ((isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0) + ActionBar.getCurrentActionBarHeight())) - AndroidUtilities.dp(12.0f);
                                z6 = top > ((int) PhotoViewer.this.fullscreenButton[0].getY()) + AndroidUtilities.dp(32.0f);
                                z5 = top > y;
                            }
                            if (PhotoViewer.this.allowShowFullscreenButton) {
                                if (PhotoViewer.this.fullscreenButton[0].getTag() == null || ((Integer) PhotoViewer.this.fullscreenButton[0].getTag()).intValue() != 3 || !z6) {
                                    if (PhotoViewer.this.fullscreenButton[0].getTag() == null && !z6) {
                                        PhotoViewer.this.fullscreenButton[0].setTag(3);
                                        PhotoViewer.this.fullscreenButton[0].animate().alpha(0.0f).setListener(null).setDuration(150L).start();
                                    }
                                } else {
                                    PhotoViewer.this.fullscreenButton[0].setTag(2);
                                    PhotoViewer.this.fullscreenButton[0].animate().alpha(1.0f).setDuration(150L).setListener(new AnimatorListenerAdapter() {
                                        {
                                            AnonymousClass66.this = this;
                                        }

                                        @Override
                                        public void onAnimationEnd(Animator animator) {
                                            PhotoViewer.this.fullscreenButton[0].setTag(null);
                                        }
                                    }).start();
                                }
                            }
                            PhotoViewer.this.photoProgressViews[0].setIndexedAlpha(2, z5 ? 1.0f : 0.0f, true);
                        }
                    }
                };
                this.captionScrollView = captionScrollView;
                this.captionTextViewSwitcher.setScrollView(captionScrollView);
                this.captionContainer.setClipChildren(false);
                this.captionScrollView.addView(this.captionContainer, new ViewGroup.LayoutParams(-1, -2));
                this.containerView.addView(this.captionScrollView, LayoutHelper.createFrame(-1, -1, 80));
            }
            if (this.captionTextViewSwitcher.getParent() != this.captionContainer) {
                this.pickerView.removeView(this.captionTextViewSwitcher);
                this.captionTextViewSwitcher.setMeasureAllChildren(true);
                this.captionContainer.addView(this.captionTextViewSwitcher, -1, -2);
                this.videoPreviewFrame.bringToFront();
            }
        }
        boolean isEmpty = TextUtils.isEmpty(cloneSpans);
        boolean isEmpty2 = TextUtils.isEmpty(this.captionTextViewSwitcher.getCurrentView().getText());
        CaptionTextViewSwitcher captionTextViewSwitcher = this.captionTextViewSwitcher;
        TextView nextView = z2 ? captionTextViewSwitcher.getNextView() : captionTextViewSwitcher.getCurrentView();
        if (this.isCurrentVideo) {
            if (nextView.getMaxLines() != 1) {
                this.captionTextViewSwitcher.getCurrentView().setMaxLines(1);
                this.captionTextViewSwitcher.getNextView().setMaxLines(1);
                this.captionTextViewSwitcher.getCurrentView().setSingleLine(true);
                this.captionTextViewSwitcher.getNextView().setSingleLine(true);
                this.captionTextViewSwitcher.getCurrentView().setEllipsize(TextUtils.TruncateAt.END);
                this.captionTextViewSwitcher.getNextView().setEllipsize(TextUtils.TruncateAt.END);
            }
        } else {
            int maxLines = nextView.getMaxLines();
            if (maxLines == 1) {
                this.captionTextViewSwitcher.getCurrentView().setSingleLine(false);
                this.captionTextViewSwitcher.getNextView().setSingleLine(false);
            }
            if (this.needCaptionLayout) {
                Point point = AndroidUtilities.displaySize;
                i = point.x > point.y ? 5 : 10;
            } else {
                i = ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
            if (maxLines != i) {
                this.captionTextViewSwitcher.getCurrentView().setMaxLines(i);
                this.captionTextViewSwitcher.getNextView().setMaxLines(i);
                this.captionTextViewSwitcher.getCurrentView().setEllipsize(null);
                this.captionTextViewSwitcher.getNextView().setEllipsize(null);
            }
        }
        nextView.setScrollX(0);
        boolean z5 = this.needCaptionLayout;
        this.dontChangeCaptionPosition = !z5 && z2 && isEmpty;
        if (!z5) {
            this.captionScrollView.dontChangeTopMargin = false;
        }
        if (z2 && (i2 = Build.VERSION.SDK_INT) >= 19) {
            if (i2 >= 23) {
                TransitionManager.endTransitions(z5 ? this.pickerView : this.captionScrollView);
            }
            if (this.needCaptionLayout) {
                TransitionSet transitionSet = new TransitionSet();
                transitionSet.setOrdering(0);
                transitionSet.addTransition(new ChangeBounds());
                transitionSet.addTransition(new Fade(2));
                transitionSet.addTransition(new Fade(1));
                transitionSet.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.pickerView, transitionSet);
            } else {
                TransitionSet duration = new TransitionSet().addTransition(new AnonymousClass68(2, isEmpty2, isEmpty)).addTransition(new AnonymousClass67(1, isEmpty2, isEmpty)).setDuration(200L);
                if (!isEmpty2) {
                    this.captionScrollView.dontChangeTopMargin = true;
                    duration.addTransition(new AnonymousClass69());
                }
                if (isEmpty2 && !isEmpty) {
                    duration.addTarget((View) this.captionTextViewSwitcher);
                }
                TransitionManager.beginDelayedTransition(this.captionScrollView, duration);
            }
            z3 = true;
        } else {
            this.captionTextViewSwitcher.getCurrentView().setText((CharSequence) null);
            CaptionScrollView captionScrollView2 = this.captionScrollView;
            if (captionScrollView2 != null) {
                captionScrollView2.scrollTo(0, 0);
            }
            z3 = false;
        }
        if (!isEmpty) {
            Theme.createChatResources(null, true);
            if (messageObject == null || !this.captionTranslated || (tLRPC$Message = messageObject.messageOwner) == null || tLRPC$Message.translatedText == null || !TextUtils.equals(tLRPC$Message.translatedToLanguage, TranslateAlert2.getToLanguage())) {
                if (messageObject != null && !messageObject.messageOwner.entities.isEmpty()) {
                    SpannableString spannableString = new SpannableString(cloneSpans);
                    messageObject.addEntitiesToText(spannableString, true, false);
                    if (messageObject.isVideo()) {
                        MessageObject.addUrlsByPattern(messageObject.isOutOwner(), spannableString, false, 3, (int) messageObject.getDuration(), false);
                    }
                    cloneSpans = Emoji.replaceEmoji((CharSequence) spannableString, nextView.getPaint().getFontMetricsInt(), AndroidUtilities.dp(20.0f), false);
                } else {
                    cloneSpans = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(cloneSpans), nextView.getPaint().getFontMetricsInt(), AndroidUtilities.dp(20.0f), false);
                }
            }
            this.captionTextViewSwitcher.setTag(cloneSpans);
            try {
                this.captionTextViewSwitcher.setText(cloneSpans, z2, this.lastCaptionTranslating != z);
                CaptionScrollView captionScrollView3 = this.captionScrollView;
                if (captionScrollView3 != null) {
                    captionScrollView3.updateTopMargin();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            nextView.setScrollY(0);
            nextView.setTextColor(-1);
            this.captionTextViewSwitcher.setVisibility(this.isActionBarVisible && (!this.isCurrentVideo || this.pickerView.getVisibility() == 0 || this.pageBlocksAdapter != null) ? 0 : 4);
            z4 = false;
        } else if (this.needCaptionLayout) {
            this.captionTextViewSwitcher.setText(LocaleController.getString("AddCaption", R.string.AddCaption), z2);
            this.captionTextViewSwitcher.getCurrentView().setTextColor(-1291845633);
            this.captionTextViewSwitcher.setTag("empty");
            z4 = false;
            this.captionTextViewSwitcher.setVisibility(0);
        } else {
            z4 = false;
            this.captionTextViewSwitcher.setText(null, z2);
            this.captionTextViewSwitcher.getCurrentView().setTextColor(-1);
            this.captionTextViewSwitcher.setVisibility(4, !z3 || isEmpty2);
            this.captionTextViewSwitcher.setTag(null);
        }
        if (this.captionTextViewSwitcher.getCurrentView() instanceof CaptionTextView) {
            ((CaptionTextView) this.captionTextViewSwitcher.getCurrentView()).setLoading(z);
        }
        if (!isEmpty && z) {
            z4 = true;
        }
        this.lastCaptionTranslating = z4;
    }

    public class AnonymousClass68 extends Fade {
        final boolean val$isCaptionEmpty;
        final boolean val$isCurrentCaptionEmpty;

        AnonymousClass68(int i, boolean z, boolean z2) {
            super(i);
            PhotoViewer.this = r1;
            this.val$isCurrentCaptionEmpty = z;
            this.val$isCaptionEmpty = z2;
        }

        @Override
        public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
            Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
            if (!this.val$isCurrentCaptionEmpty && this.val$isCaptionEmpty && view == PhotoViewer.this.captionTextViewSwitcher) {
                onDisappear.addListener(new AnimatorListenerAdapter() {
                    {
                        AnonymousClass68.this = this;
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PhotoViewer.this.captionScrollView.setVisibility(4);
                        PhotoViewer.this.captionScrollView.backgroundAlpha = 1.0f;
                    }
                });
                ((ObjectAnimator) onDisappear).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        PhotoViewer.AnonymousClass68.this.lambda$onDisappear$0(valueAnimator);
                    }
                });
            }
            return onDisappear;
        }

        public void lambda$onDisappear$0(ValueAnimator valueAnimator) {
            PhotoViewer.this.captionScrollView.backgroundAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            PhotoViewer.this.captionScrollView.invalidate();
        }
    }

    public class AnonymousClass67 extends Fade {
        final boolean val$isCaptionEmpty;
        final boolean val$isCurrentCaptionEmpty;

        AnonymousClass67(int i, boolean z, boolean z2) {
            super(i);
            PhotoViewer.this = r1;
            this.val$isCurrentCaptionEmpty = z;
            this.val$isCaptionEmpty = z2;
        }

        @Override
        public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
            Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
            if (this.val$isCurrentCaptionEmpty && !this.val$isCaptionEmpty && view == PhotoViewer.this.captionTextViewSwitcher) {
                onAppear.addListener(new AnimatorListenerAdapter() {
                    {
                        AnonymousClass67.this = this;
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PhotoViewer.this.captionScrollView.backgroundAlpha = 1.0f;
                    }
                });
                ((ObjectAnimator) onAppear).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        PhotoViewer.AnonymousClass67.this.lambda$onAppear$0(valueAnimator);
                    }
                });
            }
            return onAppear;
        }

        public void lambda$onAppear$0(ValueAnimator valueAnimator) {
            PhotoViewer.this.captionScrollView.backgroundAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            PhotoViewer.this.captionScrollView.invalidate();
        }
    }

    public class AnonymousClass69 extends Transition {
        AnonymousClass69() {
            PhotoViewer.this = r1;
        }

        @Override
        public void captureStartValues(TransitionValues transitionValues) {
            if (transitionValues.view == PhotoViewer.this.captionScrollView) {
                transitionValues.values.put("scrollY", Integer.valueOf(PhotoViewer.this.captionScrollView.getScrollY()));
            }
        }

        @Override
        public void captureEndValues(TransitionValues transitionValues) {
            if (transitionValues.view == PhotoViewer.this.captionTextViewSwitcher) {
                transitionValues.values.put("translationY", Integer.valueOf(PhotoViewer.this.captionScrollView.getPendingMarginTopDiff()));
            }
        }

        @Override
        public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            int intValue;
            if (transitionValues.view != PhotoViewer.this.captionScrollView) {
                if (transitionValues2.view != PhotoViewer.this.captionTextViewSwitcher || (intValue = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(PhotoViewer.this.captionTextViewSwitcher, View.TRANSLATION_Y, 0.0f, intValue);
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    {
                        AnonymousClass69.this = this;
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PhotoViewer.this.captionTextViewSwitcher.setTranslationY(0.0f);
                    }
                });
                return ofFloat;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
            ofInt.addListener(new AnimatorListenerAdapter() {
                {
                    AnonymousClass69.this = this;
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    PhotoViewer.this.captionTextViewSwitcher.getNextView().setText((CharSequence) null);
                    PhotoViewer.this.captionScrollView.applyPendingTopMargin();
                }

                @Override
                public void onAnimationStart(Animator animator) {
                    PhotoViewer.this.captionScrollView.stopScrolling();
                }
            });
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PhotoViewer.AnonymousClass69.this.lambda$createAnimator$0(valueAnimator);
                }
            });
            return ofInt;
        }

        public void lambda$createAnimator$0(ValueAnimator valueAnimator) {
            PhotoViewer.this.captionScrollView.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public void setCaptionHwLayerEnabled(boolean z) {
        if (this.captionHwLayerEnabled != z) {
            this.captionHwLayerEnabled = z;
            this.captionTextViewSwitcher.setLayerType(2, null);
            this.captionTextViewSwitcher.getCurrentView().setLayerType(2, null);
            this.captionTextViewSwitcher.getNextView().setLayerType(2, null);
        }
    }

    public void checkProgress(final int i, boolean z, final boolean z2) {
        final File file;
        File file2;
        MessageObject messageObject;
        boolean shouldIndexAutoPlayed;
        boolean z3;
        File pathToAttach;
        File pathToAttach2;
        boolean z4;
        File file3;
        boolean z5;
        FileLoader.FileResolver fileResolver;
        AnimatedFileDrawable animatedFileDrawable;
        int i2 = this.currentIndex;
        int i3 = i == 1 ? i2 + 1 : i == 2 ? i2 - 1 : i2;
        boolean z6 = false;
        if (this.currentFileNames[i] != null) {
            boolean hasBitmap = (i == 0 && i2 == 0 && (animatedFileDrawable = this.currentAnimation) != null) ? animatedFileDrawable.hasBitmap() : false;
            FileLoader.FileResolver fileResolver2 = null;
            if (this.currentMessageObject != null) {
                if (i3 < 0 || i3 >= this.imagesArr.size()) {
                    this.photoProgressViews[i].setBackgroundState(-1, z2, true);
                    return;
                }
                MessageObject messageObject2 = this.imagesArr.get(i3);
                boolean shouldMessageObjectAutoPlayed = shouldMessageObjectAutoPlayed(messageObject2);
                if (this.sharedMediaType == 1 && !messageObject2.canPreviewDocument()) {
                    this.photoProgressViews[i].setBackgroundState(-1, z2, true);
                    return;
                }
                file2 = !TextUtils.isEmpty(messageObject2.messageOwner.attachPath) ? new File(messageObject2.messageOwner.attachPath) : null;
                if ((MessageObject.getMedia(messageObject2.messageOwner) instanceof TLRPC$TL_messageMediaWebPage) && MessageObject.getMedia(messageObject2.messageOwner).webpage != null && MessageObject.getMedia(messageObject2.messageOwner).webpage.document == null) {
                    final TLObject fileLocation = getFileLocation(i3, null);
                    fileResolver = new FileLoader.FileResolver() {
                        @Override
                        public final File getFile() {
                            File lambda$checkProgress$89;
                            lambda$checkProgress$89 = PhotoViewer.this.lambda$checkProgress$89(fileLocation);
                            return lambda$checkProgress$89;
                        }
                    };
                } else {
                    final TLRPC$Message tLRPC$Message = messageObject2.messageOwner;
                    fileResolver = new FileLoader.FileResolver() {
                        @Override
                        public final File getFile() {
                            File lambda$checkProgress$90;
                            lambda$checkProgress$90 = PhotoViewer.this.lambda$checkProgress$90(tLRPC$Message);
                            return lambda$checkProgress$90;
                        }
                    };
                }
                if (messageObject2.isVideo()) {
                    z4 = SharedConfig.streamMedia && messageObject2.canStreamVideo() && !DialogObject.isEncryptedDialog(messageObject2.getDialogId());
                    shouldIndexAutoPlayed = shouldMessageObjectAutoPlayed;
                    file = null;
                    fileResolver2 = fileResolver;
                    z3 = true;
                } else {
                    shouldIndexAutoPlayed = shouldMessageObjectAutoPlayed;
                    file = null;
                    fileResolver2 = fileResolver;
                    z4 = false;
                    z3 = false;
                }
                messageObject = messageObject2;
            } else {
                if (this.currentBotInlineResult != null) {
                    if (i3 < 0 || i3 >= this.imagesArrLocals.size()) {
                        this.photoProgressViews[i].setBackgroundState(-1, z2, true);
                        return;
                    }
                    TLRPC$BotInlineResult tLRPC$BotInlineResult = (TLRPC$BotInlineResult) this.imagesArrLocals.get(i3);
                    if (tLRPC$BotInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || MessageObject.isVideoDocument(tLRPC$BotInlineResult.document)) {
                        if (tLRPC$BotInlineResult.document != null) {
                            file3 = FileLoader.getInstance(this.currentAccount).getPathToAttach(tLRPC$BotInlineResult.document);
                        } else if (tLRPC$BotInlineResult.content instanceof TLRPC$TL_webDocument) {
                            file3 = new File(FileLoader.getDirectory(4), Utilities.MD5(tLRPC$BotInlineResult.content.url) + "." + ImageLoader.getHttpUrlExtension(tLRPC$BotInlineResult.content.url, "mp4"));
                        } else {
                            file3 = null;
                        }
                        z5 = true;
                    } else {
                        if (tLRPC$BotInlineResult.document != null) {
                            file3 = new File(FileLoader.getDirectory(3), this.currentFileNames[i]);
                        } else {
                            file3 = tLRPC$BotInlineResult.photo != null ? new File(FileLoader.getDirectory(0), this.currentFileNames[i]) : null;
                        }
                        z5 = false;
                    }
                    file = new File(FileLoader.getDirectory(4), this.currentFileNames[i]);
                    file2 = file3;
                    z3 = z5;
                    messageObject = null;
                    shouldIndexAutoPlayed = false;
                } else {
                    if (this.currentFileLocation != null) {
                        if (i3 < 0 || i3 >= this.imagesArrLocationsVideo.size()) {
                            this.photoProgressViews[i].setBackgroundState(-1, z2, true);
                            return;
                        }
                        ImageLocation imageLocation = this.imagesArrLocationsVideo.get(i3);
                        if (imageLocation != null) {
                            pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(imageLocation.location, getFileLocationExt(imageLocation), false);
                            pathToAttach2 = FileLoader.getInstance(this.currentAccount).getPathToAttach(imageLocation.location, getFileLocationExt(imageLocation), true);
                        } else {
                            pathToAttach2 = null;
                            pathToAttach = null;
                        }
                    } else if (this.currentSecureDocument != null) {
                        if (i3 < 0 || i3 >= this.secureDocuments.size()) {
                            this.photoProgressViews[i].setBackgroundState(-1, z2, true);
                            return;
                        }
                        SecureDocument secureDocument = this.secureDocuments.get(i3);
                        pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(secureDocument, true);
                        pathToAttach2 = FileLoader.getInstance(this.currentAccount).getPathToAttach(secureDocument, false);
                    } else if (this.currentPathObject != null) {
                        file2 = new File(FileLoader.getDirectory(3), this.currentFileNames[i]);
                        file = new File(FileLoader.getDirectory(4), this.currentFileNames[i]);
                        messageObject = null;
                        shouldIndexAutoPlayed = false;
                        z4 = false;
                        z3 = false;
                    } else {
                        PageBlocksAdapter pageBlocksAdapter = this.pageBlocksAdapter;
                        if (pageBlocksAdapter != null) {
                            File file4 = pageBlocksAdapter.getFile(i3);
                            boolean z7 = this.pageBlocksAdapter.isVideo(i3) || this.pageBlocksAdapter.isHardwarePlayer(i3);
                            shouldIndexAutoPlayed = shouldIndexAutoPlayed(i3);
                            file2 = file4;
                            z3 = z7;
                            file = null;
                            messageObject = null;
                        } else {
                            file = null;
                            file2 = null;
                            messageObject = null;
                            shouldIndexAutoPlayed = false;
                            z4 = false;
                            z3 = false;
                        }
                    }
                    file = pathToAttach2;
                    file2 = pathToAttach;
                    messageObject = null;
                    shouldIndexAutoPlayed = false;
                    z4 = false;
                    z3 = false;
                }
                z4 = false;
            }
            boolean z8 = !(i == 0 && this.dontAutoPlay) && shouldIndexAutoPlayed;
            final boolean z9 = hasBitmap;
            final File file5 = file2;
            final FileLoader.FileResolver fileResolver3 = fileResolver2;
            final MessageObject messageObject3 = messageObject;
            final boolean z10 = z4;
            final boolean z11 = z3;
            final boolean z12 = z8;
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.this.lambda$checkProgress$92(z9, file5, file, fileResolver3, i, messageObject3, z10, z11, z12, z2);
                }
            });
            return;
        }
        if (!this.imagesArrLocals.isEmpty() && i3 >= 0 && i3 < this.imagesArrLocals.size()) {
            Object obj = this.imagesArrLocals.get(i3);
            if (obj instanceof MediaController.PhotoEntry) {
                z6 = ((MediaController.PhotoEntry) obj).isVideo;
            }
        }
        if (z6) {
            this.photoProgressViews[i].setBackgroundState(3, z2, true);
        } else {
            this.photoProgressViews[i].setBackgroundState(-1, z2, true);
        }
    }

    public File lambda$checkProgress$89(TLObject tLObject) {
        return FileLoader.getInstance(this.currentAccount).getPathToAttach(tLObject, true);
    }

    public File lambda$checkProgress$90(TLRPC$Message tLRPC$Message) {
        return FileLoader.getInstance(this.currentAccount).getPathToMessage(tLRPC$Message);
    }

    public void lambda$checkProgress$92(boolean z, final File file, File file2, FileLoader.FileResolver fileResolver, final int i, MessageObject messageObject, final boolean z2, final boolean z3, final boolean z4, final boolean z5) {
        final File file3;
        ChatActivity chatActivity;
        TLRPC$Document document;
        boolean exists = (z || file == null) ? z : file.exists();
        if (file2 == null && fileResolver != null) {
            file3 = fileResolver.getFile();
        } else {
            r2 = fileResolver != null ? fileResolver.getFile() : null;
            file3 = file2;
        }
        if (!exists && file3 != null) {
            exists = file3.exists();
        }
        if (!exists && r2 != null) {
            exists = r2.exists();
        }
        final boolean z6 = exists;
        if (!z6 && i != 0 && messageObject != null && z2 && DownloadController.getInstance(this.currentAccount).canDownloadMedia(messageObject.messageOwner) != 0 && (((chatActivity = this.parentChatActivity) == null || chatActivity.getCurrentEncryptedChat() == null) && !messageObject.shouldEncryptPhotoOrVideo() && (document = messageObject.getDocument()) != null)) {
            FileLoader.getInstance(this.currentAccount).loadFile(document, messageObject, 0, 10);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PhotoViewer.this.lambda$checkProgress$91(i, file, file3, z6, z2, z3, z4, z5);
            }
        });
    }

    public void lambda$checkProgress$91(int i, File file, File file2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = false;
        if (this.shownControlsByEnd && !this.actionBarWasShownBeforeByEnd && this.isPlaying) {
            this.photoProgressViews[i].setBackgroundState(3, false, false);
            return;
        }
        if ((file != null || file2 != null) && (z || z2)) {
            if (i != 0 || !this.isPlaying) {
                if (z3 && (!z4 || (i == 0 && this.playerWasPlaying))) {
                    this.photoProgressViews[i].setBackgroundState(3, z5, true);
                } else {
                    this.photoProgressViews[i].setBackgroundState(-1, z5, true);
                }
            }
            if (i == 0 && !this.menuItem.isSubMenuShowing()) {
                if (!z) {
                    if (!FileLoader.getInstance(this.currentAccount).isLoadingFile(this.currentFileNames[i])) {
                        this.menuItem.hideSubItem(7);
                    } else {
                        this.menuItem.showSubItem(7);
                    }
                } else {
                    this.menuItem.hideSubItem(7);
                }
            }
        } else {
            if (z3) {
                if (!FileLoader.getInstance(this.currentAccount).isLoadingFile(this.currentFileNames[i])) {
                    this.photoProgressViews[i].setBackgroundState(2, false, true);
                } else {
                    this.photoProgressViews[i].setBackgroundState(1, false, true);
                }
            } else {
                this.photoProgressViews[i].setBackgroundState(0, z5, true);
            }
            Float fileProgress = ImageLoader.getInstance().getFileProgress(this.currentFileNames[i]);
            if (fileProgress == null) {
                fileProgress = Float.valueOf(0.0f);
            }
            this.photoProgressViews[i].setProgress(fileProgress.floatValue(), false);
        }
        if (i == 0) {
            if (!this.isEmbedVideo && (!this.imagesArrLocals.isEmpty() || (this.currentFileNames[0] != null && this.photoProgressViews[0].backgroundState != 0))) {
                z6 = true;
            }
            this.canZoom = z6;
        }
    }

    public int getSelectionLength() {
        CaptionPhotoViewer captionPhotoViewer = this.captionEdit;
        if (captionPhotoViewer.editText != null) {
            return captionPhotoViewer.getSelectionLength();
        }
        return 0;
    }

    private void setIndexToPaintingOverlay(int i, PaintingOverlay paintingOverlay) {
        String str;
        ArrayList<VideoEditedInfo.MediaEntity> arrayList;
        boolean z;
        if (paintingOverlay == null) {
            return;
        }
        paintingOverlay.reset();
        paintingOverlay.setVisibility(8);
        if (this.imagesArrLocals.isEmpty() || i < 0 || i >= this.imagesArrLocals.size()) {
            return;
        }
        Object obj = this.imagesArrLocals.get(i);
        if (obj instanceof MediaController.PhotoEntry) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            boolean z2 = photoEntry.isVideo;
            String str2 = photoEntry.paintPath;
            arrayList = photoEntry.mediaEntities;
            z = z2;
            str = str2;
        } else {
            if (obj instanceof MediaController.SearchImage) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                String str3 = searchImage.paintPath;
                arrayList = searchImage.mediaEntities;
                str = str3;
            } else {
                str = null;
                arrayList = null;
            }
            z = false;
        }
        paintingOverlay.setVisibility(0);
        paintingOverlay.setData(str, arrayList, z, false, this.sendPhotoType != 11);
    }

    private void setIndexToImage(org.telegram.messenger.ImageReceiver r35, int r36, org.telegram.ui.Components.Crop.CropTransform r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.setIndexToImage(org.telegram.messenger.ImageReceiver, int, org.telegram.ui.Components.Crop.CropTransform):void");
    }

    public static boolean isShowingImage(MessageObject messageObject) {
        boolean z;
        boolean z2 = true;
        if (Instance != null && !Instance.pipAnimationInProgress && Instance.isVisible && !Instance.disableShowCheck && messageObject != null) {
            MessageObject messageObject2 = Instance.currentMessageObject;
            if (messageObject2 == null && Instance.placeProvider != null) {
                messageObject2 = Instance.placeProvider.getEditingMessageObject();
            }
            if (messageObject2 != null && messageObject2.getId() == messageObject.getId() && messageObject2.getDialogId() == messageObject.getDialogId()) {
                z = true;
                if (z && PipInstance != null) {
                    return (!PipInstance.isVisible || PipInstance.disableShowCheck || messageObject == null || PipInstance.currentMessageObject == null || PipInstance.currentMessageObject.getId() != messageObject.getId() || PipInstance.currentMessageObject.getDialogId() != messageObject.getDialogId()) ? false : false;
                }
            }
        }
        z = false;
        return z ? z : z;
    }

    public static boolean isPlayingMessageInPip(MessageObject messageObject) {
        return (PipInstance == null || messageObject == null || PipInstance.currentMessageObject == null || PipInstance.currentMessageObject.getId() != messageObject.getId() || PipInstance.currentMessageObject.getDialogId() != messageObject.getDialogId()) ? false : true;
    }

    public static boolean isPlayingMessage(MessageObject messageObject) {
        return (Instance == null || Instance.pipAnimationInProgress || !Instance.isVisible || messageObject == null || Instance.currentMessageObject == null || Instance.currentMessageObject.getId() != messageObject.getId() || Instance.currentMessageObject.getDialogId() != messageObject.getDialogId()) ? false : true;
    }

    public static boolean isShowingImage(TLRPC$FileLocation tLRPC$FileLocation) {
        if (Instance == null || !Instance.isVisible || Instance.disableShowCheck || tLRPC$FileLocation == null) {
            return false;
        }
        return (Instance.currentFileLocation != null && tLRPC$FileLocation.local_id == Instance.currentFileLocation.location.local_id && tLRPC$FileLocation.volume_id == Instance.currentFileLocation.location.volume_id && tLRPC$FileLocation.dc_id == Instance.currentFileLocation.dc_id) || (Instance.currentFileLocationVideo != null && tLRPC$FileLocation.local_id == Instance.currentFileLocationVideo.location.local_id && tLRPC$FileLocation.volume_id == Instance.currentFileLocationVideo.location.volume_id && tLRPC$FileLocation.dc_id == Instance.currentFileLocationVideo.dc_id);
    }

    public static boolean isShowingImage(TLRPC$BotInlineResult tLRPC$BotInlineResult) {
        return (Instance == null || !Instance.isVisible || Instance.disableShowCheck || tLRPC$BotInlineResult == null || Instance.currentBotInlineResult == null || tLRPC$BotInlineResult.id != Instance.currentBotInlineResult.id) ? false : true;
    }

    public static boolean isShowingImage(String str) {
        return (Instance == null || !Instance.isVisible || Instance.disableShowCheck || str == null || !str.equals(Instance.currentPathObject)) ? false : true;
    }

    public void setParentChatActivity(ChatActivity chatActivity) {
        this.parentChatActivity = chatActivity;
    }

    public void setMaxSelectedPhotos(int i, boolean z) {
        this.maxSelectedPhotos = i;
        this.allowOrder = z;
    }

    public void checkCurrentImageVisibility() {
        PlaceProviderObject placeProviderObject = this.currentPlaceObject;
        if (placeProviderObject != null) {
            placeProviderObject.imageReceiver.setVisible(true, true);
        }
        PhotoViewerProvider photoViewerProvider = this.placeProvider;
        PlaceProviderObject placeForPhoto = photoViewerProvider == null ? null : photoViewerProvider.getPlaceForPhoto(this.currentMessageObject, getFileLocation(this.currentFileLocation), this.currentIndex, false);
        this.currentPlaceObject = placeForPhoto;
        if (placeForPhoto != null) {
            placeForPhoto.imageReceiver.setVisible(false, true);
        }
    }

    public boolean openPhoto(MessageObject messageObject, ChatActivity chatActivity, long j, long j2, long j3, PhotoViewerProvider photoViewerProvider) {
        return openPhoto(messageObject, null, null, null, null, null, null, 0, photoViewerProvider, chatActivity, j, j2, j3, true, null, null);
    }

    public boolean openPhoto(MessageObject messageObject, int i, ChatActivity chatActivity, long j, long j2, long j3, PhotoViewerProvider photoViewerProvider) {
        return openPhoto(messageObject, null, null, null, null, null, null, 0, photoViewerProvider, chatActivity, j, j2, j3, true, null, Integer.valueOf(i));
    }

    public boolean openPhoto(MessageObject messageObject, long j, long j2, long j3, PhotoViewerProvider photoViewerProvider, boolean z) {
        return openPhoto(messageObject, null, null, null, null, null, null, 0, photoViewerProvider, null, j, j2, j3, z, null, null);
    }

    public boolean openPhoto(TLRPC$FileLocation tLRPC$FileLocation, PhotoViewerProvider photoViewerProvider) {
        return openPhoto(null, tLRPC$FileLocation, null, null, null, null, null, 0, photoViewerProvider, null, 0L, 0L, 0L, true, null, null);
    }

    public boolean openPhotoWithVideo(TLRPC$FileLocation tLRPC$FileLocation, ImageLocation imageLocation, PhotoViewerProvider photoViewerProvider) {
        return openPhoto(null, tLRPC$FileLocation, null, imageLocation, null, null, null, 0, photoViewerProvider, null, 0L, 0L, 0L, true, null, null);
    }

    public boolean openPhoto(TLRPC$FileLocation tLRPC$FileLocation, ImageLocation imageLocation, PhotoViewerProvider photoViewerProvider) {
        return openPhoto(null, tLRPC$FileLocation, imageLocation, null, null, null, null, 0, photoViewerProvider, null, 0L, 0L, 0L, true, null, null);
    }

    public boolean openPhoto(ArrayList<MessageObject> arrayList, int i, long j, long j2, long j3, PhotoViewerProvider photoViewerProvider) {
        return openPhoto(arrayList.get(i), null, null, null, arrayList, null, null, i, photoViewerProvider, null, j, j2, j3, true, null, null);
    }

    public boolean openPhoto(ArrayList<SecureDocument> arrayList, int i, PhotoViewerProvider photoViewerProvider) {
        return openPhoto(null, null, null, null, null, arrayList, null, i, photoViewerProvider, null, 0L, 0L, 0L, true, null, null);
    }

    public boolean openPhoto(int i, PageBlocksAdapter pageBlocksAdapter, PhotoViewerProvider photoViewerProvider) {
        return openPhoto(null, null, null, null, null, null, null, i, photoViewerProvider, null, 0L, 0L, 0L, true, pageBlocksAdapter, null);
    }

    public boolean openPhotoForSelect(ArrayList<Object> arrayList, int i, int i2, boolean z, PhotoViewerProvider photoViewerProvider, ChatActivity chatActivity) {
        return openPhotoForSelect(null, null, arrayList, i, i2, z, photoViewerProvider, chatActivity);
    }

    public boolean openPhotoForSelect(TLRPC$FileLocation tLRPC$FileLocation, ImageLocation imageLocation, ArrayList<Object> arrayList, int i, int i2, boolean z, PhotoViewerProvider photoViewerProvider, ChatActivity chatActivity) {
        this.isDocumentsPicker = z;
        ImageView imageView = this.pickerViewSendButton;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            if (i2 == 4 || i2 == 5) {
                this.pickerViewSendButton.setImageResource(R.drawable.msg_input_send_mini);
                layoutParams.bottomMargin = AndroidUtilities.dp(7.33f);
            } else if (i2 == 1 || i2 == 3 || i2 == 10 || i2 == 11) {
                this.pickerViewSendButton.setImageResource(R.drawable.floating_check);
                this.pickerViewSendButton.setPadding(0, AndroidUtilities.dp(1.0f), 0, 0);
                layoutParams.bottomMargin = AndroidUtilities.dp(7.33f);
            } else {
                this.pickerViewSendButton.setImageResource(R.drawable.msg_input_send_mini);
                layoutParams.bottomMargin = AndroidUtilities.dp(2.33f);
            }
            this.pickerViewSendButton.setLayoutParams(layoutParams);
        }
        if (i2 != 11 && this.stickerMakerView != null) {
            this.stickerEmpty = false;
            ImageView imageView2 = this.tuneItem;
            if (imageView2 != null) {
                imageView2.setAlpha(1.0f);
            }
            BlurButton blurButton = this.outlineBtn;
            if (blurButton != null) {
                blurButton.setActive(false, false);
            }
            this.stickerMakerView.clean();
            ArrayList<String> arrayList2 = this.selectedEmojis;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        }
        if (this.sendPhotoType != 1 && i2 == 1 && this.isVisible) {
            this.sendPhotoType = i2;
            this.doneButtonPressed = false;
            this.actionBarContainer.setTitle("");
            this.actionBarContainer.setSubtitle("", false);
            this.placeProvider = photoViewerProvider;
            this.mergeDialogId = 0L;
            this.currentDialogId = 0L;
            this.selectedPhotosAdapter.notifyDataSetChanged();
            this.pageBlocksAdapter = null;
            if (this.velocityTracker == null) {
                this.velocityTracker = VelocityTracker.obtain();
            }
            this.isVisible = true;
            this.isVisibleOrAnimating = true;
            togglePhotosListView(false, false);
            this.openedFullScreenVideo = false;
            createCropView();
            toggleActionBar(false, false);
            this.seekToProgressPending2 = 0.0f;
            this.skipFirstBufferingProgress = false;
            this.playerInjected = false;
            makeFocusable();
            this.backgroundDrawable.setAlpha(255);
            this.containerView.setAlpha(1.0f);
            onPhotoShow(null, tLRPC$FileLocation, imageLocation, null, null, null, arrayList, i, null);
            initCropView();
            setCropBitmap();
            return true;
        }
        this.sendPhotoType = i2;
        if (i2 == 11) {
            this.navigationBar.setBackgroundColor(-16777216);
        }
        return openPhoto(null, tLRPC$FileLocation, imageLocation, null, null, null, arrayList, i, photoViewerProvider, chatActivity, 0L, 0L, 0L, true, null, null);
    }

    public void setTitle(CharSequence charSequence) {
        PhotoViewerActionBarContainer photoViewerActionBarContainer = this.actionBarContainer;
        this.customTitle = charSequence;
        photoViewerActionBarContainer.setTitle(charSequence);
        toggleActionBar(true, false);
    }

    public void openCurrentPhotoInPaintModeForSelect() {
        final File file;
        final MessageObject messageObject;
        final boolean z;
        final boolean z2;
        ActionBarToggleParams enableStatusBarAnimation;
        if (canSendMediaToParentChatActivity()) {
            MessageObject messageObject2 = this.currentMessageObject;
            File file2 = null;
            if (messageObject2 != null) {
                boolean z3 = messageObject2.canEditMedia() && !this.currentMessageObject.isDocument();
                boolean isVideo = this.currentMessageObject.isVideo();
                if (!TextUtils.isEmpty(this.currentMessageObject.messageOwner.attachPath)) {
                    File file3 = new File(this.currentMessageObject.messageOwner.attachPath);
                    if (file3.exists()) {
                        file2 = file3;
                    }
                }
                if (file2 == null) {
                    file2 = FileLoader.getInstance(this.currentAccount).getPathToMessage(this.currentMessageObject.messageOwner);
                }
                messageObject = messageObject2;
                file = file2;
                z2 = z3;
                z = isVideo;
            } else {
                file = null;
                messageObject = null;
                z = false;
                z2 = false;
            }
            if (file != null && file.exists()) {
                this.savedState = new SavedState(this.currentIndex, new ArrayList(this.imagesArr), this.placeProvider);
                toggleActionBar(false, true, new ActionBarToggleParams().enableStatusBarAnimation(false));
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PhotoViewer.this.lambda$openCurrentPhotoInPaintModeForSelect$93(file, z, messageObject, z2);
                    }
                }, enableStatusBarAnimation.animationDuration);
                return;
            }
            showDownloadAlert();
        }
    }

    public void lambda$openCurrentPhotoInPaintModeForSelect$93(File file, boolean z, final MessageObject messageObject, final boolean z2) {
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(file);
        int i = this.lastImageId;
        this.lastImageId = i - 1;
        final MediaController.PhotoEntry orientation = new MediaController.PhotoEntry(0, i, 0L, file.getAbsolutePath(), z ? 0 : ((Integer) imageOrientation.first).intValue(), z, 0, 0, 0L).setOrientation(imageOrientation);
        this.sendPhotoType = 2;
        this.doneButtonPressed = false;
        final PhotoViewerProvider photoViewerProvider = this.placeProvider;
        this.placeProvider = new EmptyPhotoViewerProvider() {
            private final ImageReceiver.BitmapHolder thumbHolder;

            @Override
            public boolean canCaptureMorePhotos() {
                return false;
            }

            {
                PhotoViewer.this = this;
                this.thumbHolder = this.centerImage.getBitmapSafe();
            }

            @Override
            public PlaceProviderObject getPlaceForPhoto(MessageObject messageObject2, TLRPC$FileLocation tLRPC$FileLocation, int i2, boolean z3) {
                PhotoViewerProvider photoViewerProvider2 = photoViewerProvider;
                if (photoViewerProvider2 != null) {
                    return photoViewerProvider2.getPlaceForPhoto(messageObject, null, 0, z3);
                }
                return null;
            }

            @Override
            public ImageReceiver.BitmapHolder getThumbForPhoto(MessageObject messageObject2, TLRPC$FileLocation tLRPC$FileLocation, int i2) {
                return this.thumbHolder;
            }

            @Override
            public void sendButtonPressed(int i2, VideoEditedInfo videoEditedInfo, boolean z3, int i3, boolean z4) {
                sendMedia(videoEditedInfo, z3, i3, false, z4);
            }

            @Override
            public void replaceButtonPressed(int i2, VideoEditedInfo videoEditedInfo) {
                MediaController.PhotoEntry photoEntry = orientation;
                if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null || !TextUtils.isEmpty(photoEntry.caption)) {
                    sendMedia(videoEditedInfo, false, 0, true, false);
                }
            }

            @Override
            public boolean canReplace(int i2) {
                return photoViewerProvider != null && z2;
            }

            @Override
            public MessageObject getEditingMessageObject() {
                return messageObject;
            }

            private void sendMedia(VideoEditedInfo videoEditedInfo, boolean z3, int i2, boolean z4, boolean z5) {
                if (PhotoViewer.this.parentChatActivity != null) {
                    MessageObject messageObject2 = z4 ? messageObject : null;
                    if (messageObject2 != null && !TextUtils.isEmpty(orientation.caption)) {
                        MediaController.PhotoEntry photoEntry = orientation;
                        messageObject2.editingMessage = photoEntry.caption;
                        messageObject2.editingMessageEntities = photoEntry.entities;
                    }
                    MediaController.PhotoEntry photoEntry2 = orientation;
                    if (photoEntry2.isVideo) {
                        if (videoEditedInfo != null) {
                            AccountInstance accountInstance = PhotoViewer.this.parentChatActivity.getAccountInstance();
                            String str = orientation.path;
                            long dialogId = PhotoViewer.this.parentChatActivity.getDialogId();
                            MessageObject replyMessage = PhotoViewer.this.parentChatActivity.getReplyMessage();
                            MessageObject threadMessage = PhotoViewer.this.parentChatActivity.getThreadMessage();
                            ChatActivity.ReplyQuote replyQuote = PhotoViewer.this.parentChatActivity.getReplyQuote();
                            MediaController.PhotoEntry photoEntry3 = orientation;
                            SendMessagesHelper.prepareSendingVideo(accountInstance, str, videoEditedInfo, dialogId, replyMessage, threadMessage, null, replyQuote, photoEntry3.entities, photoEntry3.ttl, messageObject2, z3, i2, z5, photoEntry3.hasSpoiler, photoEntry3.caption, PhotoViewer.this.parentChatActivity.quickReplyShortcut, PhotoViewer.this.parentChatActivity.getQuickReplyId(), 0L);
                            return;
                        }
                        AccountInstance accountInstance2 = PhotoViewer.this.parentChatActivity.getAccountInstance();
                        String str2 = orientation.path;
                        long dialogId2 = PhotoViewer.this.parentChatActivity.getDialogId();
                        MessageObject replyMessage2 = PhotoViewer.this.parentChatActivity.getReplyMessage();
                        MessageObject threadMessage2 = PhotoViewer.this.parentChatActivity.getThreadMessage();
                        ChatActivity.ReplyQuote replyQuote2 = PhotoViewer.this.parentChatActivity.getReplyQuote();
                        MediaController.PhotoEntry photoEntry4 = orientation;
                        SendMessagesHelper.prepareSendingVideo(accountInstance2, str2, null, dialogId2, replyMessage2, threadMessage2, null, replyQuote2, photoEntry4.entities, photoEntry4.ttl, messageObject2, z3, i2, z5, photoEntry4.hasSpoiler, photoEntry4.caption, PhotoViewer.this.parentChatActivity.quickReplyShortcut, PhotoViewer.this.parentChatActivity.getQuickReplyId(), 0L);
                    } else if (photoEntry2.imagePath != null) {
                        AccountInstance accountInstance3 = PhotoViewer.this.parentChatActivity.getAccountInstance();
                        MediaController.PhotoEntry photoEntry5 = orientation;
                        String str3 = photoEntry5.imagePath;
                        String str4 = photoEntry5.thumbPath;
                        long dialogId3 = PhotoViewer.this.parentChatActivity.getDialogId();
                        MessageObject replyMessage3 = PhotoViewer.this.parentChatActivity.getReplyMessage();
                        MessageObject threadMessage3 = PhotoViewer.this.parentChatActivity.getThreadMessage();
                        ChatActivity.ReplyQuote replyQuote3 = PhotoViewer.this.parentChatActivity.getReplyQuote();
                        MediaController.PhotoEntry photoEntry6 = orientation;
                        SendMessagesHelper.prepareSendingPhoto(accountInstance3, str3, str4, null, dialogId3, replyMessage3, threadMessage3, null, replyQuote3, photoEntry6.entities, photoEntry6.stickers, null, photoEntry6.ttl, messageObject2, videoEditedInfo, z3, i2, 0, z5, photoEntry6.caption, PhotoViewer.this.parentChatActivity.quickReplyShortcut, PhotoViewer.this.parentChatActivity.getQuickReplyId(), 0L);
                    } else if (photoEntry2.path != null) {
                        AccountInstance accountInstance4 = PhotoViewer.this.parentChatActivity.getAccountInstance();
                        MediaController.PhotoEntry photoEntry7 = orientation;
                        String str5 = photoEntry7.path;
                        String str6 = photoEntry7.thumbPath;
                        long dialogId4 = PhotoViewer.this.parentChatActivity.getDialogId();
                        MessageObject replyMessage4 = PhotoViewer.this.parentChatActivity.getReplyMessage();
                        MessageObject threadMessage4 = PhotoViewer.this.parentChatActivity.getThreadMessage();
                        ChatActivity.ReplyQuote replyQuote4 = PhotoViewer.this.parentChatActivity.getReplyQuote();
                        MediaController.PhotoEntry photoEntry8 = orientation;
                        SendMessagesHelper.prepareSendingPhoto(accountInstance4, str5, str6, null, dialogId4, replyMessage4, threadMessage4, null, replyQuote4, photoEntry8.entities, photoEntry8.stickers, null, photoEntry8.ttl, messageObject2, videoEditedInfo, z3, i2, 0, z5, photoEntry8.caption, PhotoViewer.this.parentChatActivity.quickReplyShortcut, PhotoViewer.this.parentChatActivity.getQuickReplyId(), 0L);
                    }
                }
            }
        };
        this.selectedPhotosAdapter.notifyDataSetChanged();
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.aboutToSwitchTo = 3;
        togglePhotosListView(false, false);
        toggleActionBar(true, false);
        ChatActivity chatActivity = this.parentChatActivity;
        if (chatActivity != null && chatActivity.getChatActivityEnterView() != null && this.parentChatActivity.isKeyboardVisible()) {
            this.parentChatActivity.getChatActivityEnterView().closeKeyboard();
        } else {
            makeFocusable();
        }
        this.backgroundDrawable.setAlpha(255);
        this.containerView.setAlpha(1.0f);
        onPhotoShow(null, null, null, null, null, null, Collections.singletonList(orientation), 0, null);
        this.pickerView.setTranslationY(AndroidUtilities.dp(this.isCurrentVideo ? 154.0f : 96.0f));
        this.pickerViewSendButton.setTranslationY(AndroidUtilities.dp(this.isCurrentVideo ? 154.0f : 96.0f));
        ActionBar actionBar = this.actionBar;
        actionBar.setTranslationY(-actionBar.getHeight());
        this.captionTextViewSwitcher.setTranslationY(AndroidUtilities.dp(this.isCurrentVideo ? 154.0f : 96.0f));
        createPaintView();
        switchToPaintMode();
        this.aboutToSwitchTo = 0;
    }

    private boolean checkAnimation() {
        if (this.animationInProgress != 0) {
            invalidateBlur();
            if (Math.abs(this.transitionAnimationStartTime - System.currentTimeMillis()) >= 500) {
                Runnable runnable = this.animationEndRunnable;
                if (runnable != null) {
                    runnable.run();
                    this.animationEndRunnable = null;
                }
                this.animationInProgress = 0;
            }
        }
        return this.animationInProgress != 0;
    }

    public void setCropBitmap() {
        VideoEditTextureView videoEditTextureView;
        if (this.cropInitied || this.sendPhotoType != 1) {
            return;
        }
        if (!this.isCurrentVideo || ((videoEditTextureView = (VideoEditTextureView) this.videoTextureView) != null && videoEditTextureView.getVideoWidth() > 0 && videoEditTextureView.getVideoHeight() > 0)) {
            this.cropInitied = true;
            Bitmap bitmap = this.centerImage.getBitmap();
            int orientation = this.centerImage.getOrientation();
            if (bitmap == null) {
                bitmap = this.animatingImageView.getBitmap();
                orientation = this.animatingImageView.getOrientation();
            }
            Bitmap bitmap2 = bitmap;
            int i = orientation;
            if (bitmap2 == null && this.videoTextureView == null) {
                return;
            }
            this.photoCropView.setBitmap(bitmap2, i, false, false, this.paintingOverlay, this.cropTransform, this.isCurrentVideo ? (VideoEditTextureView) this.videoTextureView : null, this.editState.cropState);
        }
    }

    private void initCropView() {
        PhotoCropView photoCropView = this.photoCropView;
        if (photoCropView == null) {
            return;
        }
        photoCropView.setBitmap(null, 0, false, false, null, null, null, null);
        if (this.sendPhotoType != 1) {
            return;
        }
        this.photoCropView.onAppear();
        this.photoCropView.setVisibility(0);
        this.photoCropView.setAlpha(1.0f);
        this.photoCropView.onAppeared();
        this.padImageForHorizontalInsets = true;
    }

    public boolean openPhoto(MessageObject messageObject, TLRPC$FileLocation tLRPC$FileLocation, ImageLocation imageLocation, ImageLocation imageLocation2, ArrayList<MessageObject> arrayList, ArrayList<SecureDocument> arrayList2, ArrayList<Object> arrayList3, int i, final PhotoViewerProvider photoViewerProvider, ChatActivity chatActivity, long j, long j2, long j3, boolean z, PageBlocksAdapter pageBlocksAdapter, final Integer num) {
        TLRPC$Message tLRPC$Message;
        PhotoViewerProvider photoViewerProvider2;
        int i2 = 0;
        if (this.parentActivity != null && !this.isVisible && ((photoViewerProvider != null || !checkAnimation()) && (messageObject != null || tLRPC$FileLocation != null || arrayList != null || arrayList3 != null || arrayList2 != null || imageLocation != null || pageBlocksAdapter != null))) {
            PlaceProviderObject placeForPhoto = photoViewerProvider.getPlaceForPhoto(messageObject, tLRPC$FileLocation, i, true);
            if (Build.VERSION.SDK_INT < 21) {
                Rect rect = this.insets;
                rect.top = AndroidUtilities.statusBarHeight;
                rect.bottom = AndroidUtilities.navigationBarHeight;
            }
            WindowManager windowManager = (WindowManager) this.parentActivity.getSystemService("window");
            if (this.attachedToWindow) {
                try {
                    windowManager.removeView(this.windowView);
                    onHideView();
                } catch (Exception unused) {
                }
            }
            try {
                WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
                layoutParams.type = 99;
                if (Build.VERSION.SDK_INT >= 21) {
                    layoutParams.flags = -2147286784;
                } else {
                    layoutParams.flags = 131072;
                }
                if (!(chatActivity == null || chatActivity.getCurrentEncryptedChat() == null) || ((this.avatarsDialogId != 0 && MessagesController.getInstance(this.currentAccount).isChatNoForwards(-this.avatarsDialogId)) || ((messageObject != null && (MessagesController.getInstance(this.currentAccount).isChatNoForwards(messageObject.getChatId()) || ((tLRPC$Message = messageObject.messageOwner) != null && tLRPC$Message.noforwards))) || (messageObject != null && messageObject.hasRevealedExtendedMedia())))) {
                    this.windowLayoutParams.flags |= LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM;
                } else {
                    this.windowLayoutParams.flags &= -8193;
                }
                this.windowLayoutParams.softInputMode = 272;
                this.windowView.setFocusable(false);
                this.containerView.setFocusable(false);
                windowManager.addView(this.windowView, this.windowLayoutParams);
                onShowView();
                this.hasCaptionForAllMedia = false;
                this.doneButtonPressed = false;
                this.closePhotoAfterSelect = true;
                this.allowShowFullscreenButton = true;
                this.usedSurfaceView = false;
                this.parentChatActivity = chatActivity;
                this.lastTitle = null;
                this.isEmbedVideo = num != null;
                this.actionBarContainer.setTitle("");
                this.actionBarContainer.setSubtitle("", false);
                PhotoCountView photoCountView = this.countView;
                if (photoCountView != null) {
                    photoCountView.set(0, 0, false);
                    this.countView.updateShow(false, false);
                }
                this.actionBar.setTitleScrollNonFitText(false);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoadFailed);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoaded);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.customStickerCreated);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoadProgressChanged);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.mediaCountDidLoad);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.mediaDidLoad);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogPhotosUpdate);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagesDeleted);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.filePreparingFailed);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileNewChunkAvailable);
                this.placeProvider = photoViewerProvider;
                this.mergeDialogId = j2;
                this.currentDialogId = j;
                this.currentFilterTag = chatActivity != null ? chatActivity.getFilterTag() : null;
                this.currentFilterQuery = chatActivity != null ? chatActivity.getFilterQuery() : null;
                this.currentFiltered = chatActivity != null && chatActivity.isFiltered();
                this.topicId = j3;
                this.selectedPhotosAdapter.notifyDataSetChanged();
                this.pageBlocksAdapter = pageBlocksAdapter;
                this.setAvatarFor = null;
                if (this.velocityTracker == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                }
                this.isVisible = true;
                this.isVisibleOrAnimating = true;
                togglePhotosListView(false, false);
                boolean z2 = !z;
                this.openedFullScreenVideo = z2;
                if (z2) {
                    toggleActionBar(false, false);
                } else if (this.sendPhotoType == 1) {
                    createCropView();
                    toggleActionBar(false, false);
                } else {
                    toggleActionBar(true, false);
                }
                this.windowView.setClipChildren(false);
                this.navigationBar.setVisibility(0);
                this.seekToProgressPending2 = 0.0f;
                this.skipFirstBufferingProgress = false;
                this.playerInjected = false;
                if (placeForPhoto != null) {
                    this.disableShowCheck = true;
                    this.animationInProgress = 1;
                    if (messageObject != null) {
                        AnimatedFileDrawable animation = placeForPhoto.allowTakeAnimation ? placeForPhoto.imageReceiver.getAnimation() : null;
                        this.currentAnimation = animation;
                        if (animation != null) {
                            if (messageObject.isVideo()) {
                                placeForPhoto.imageReceiver.setAllowStartAnimation(false);
                                placeForPhoto.imageReceiver.stopAnimation();
                                if (MediaController.getInstance().isPlayingMessage(messageObject)) {
                                    this.seekToProgressPending2 = messageObject.audioProgress;
                                }
                                this.skipFirstBufferingProgress = this.injectingVideoPlayer == null && !FileLoader.getInstance(messageObject.currentAccount).isLoadingVideo(messageObject.getDocument(), true) && (this.currentAnimation.hasBitmap() || !FileLoader.getInstance(messageObject.currentAccount).isLoadingVideo(messageObject.getDocument(), false));
                                this.currentAnimation = null;
                            } else if (messageObject.getWebPagePhotos(null, null).size() > 1) {
                                this.currentAnimation = null;
                            }
                        }
                    } else if (pageBlocksAdapter != null) {
                        this.currentAnimation = placeForPhoto.imageReceiver.getAnimation();
                    }
                    float f = 0.0f;
                    onPhotoShow(messageObject, tLRPC$FileLocation, imageLocation, imageLocation2, arrayList, arrayList2, arrayList3, i, placeForPhoto);
                    if (this.sendPhotoType == 1) {
                        this.photoCropView.setVisibility(0);
                        this.photoCropView.setAlpha(0.0f);
                        this.photoCropView.setFreeform(false);
                    }
                    RectF drawRegion = placeForPhoto.imageReceiver.getDrawRegion();
                    float f2 = drawRegion.left;
                    float f3 = drawRegion.top;
                    int orientation = placeForPhoto.imageReceiver.getOrientation();
                    int animatedOrientation = placeForPhoto.imageReceiver.getAnimatedOrientation();
                    if (animatedOrientation != 0) {
                        orientation = animatedOrientation;
                    }
                    ClippingImageView[] animatingImageViews = getAnimatingImageViews(placeForPhoto);
                    this.clippingImageProgress = 1.0f;
                    for (int i3 = 0; i3 < animatingImageViews.length; i3++) {
                        animatingImageViews[i3].setAnimationValues(this.animationValues);
                        animatingImageViews[i3].setVisibility(0);
                        animatingImageViews[i3].setRadius(placeForPhoto.radius);
                        animatingImageViews[i3].setOrientation(orientation, placeForPhoto.imageReceiver.getInvert());
                        animatingImageViews[i3].setImageBitmap(placeForPhoto.thumb);
                    }
                    initCropView();
                    if (this.sendPhotoType == 1) {
                        this.photoCropView.setAspectRatio(1.0f);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.animatingImageView.getLayoutParams();
                    layoutParams2.width = (int) drawRegion.width();
                    int height = (int) drawRegion.height();
                    layoutParams2.height = height;
                    if (layoutParams2.width <= 0) {
                        layoutParams2.width = 100;
                    }
                    if (height <= 0) {
                        layoutParams2.height = 100;
                    }
                    while (i2 < animatingImageViews.length) {
                        if (animatingImageViews.length > 1) {
                            animatingImageViews[i2].setAlpha(f);
                        } else {
                            animatingImageViews[i2].setAlpha(1.0f);
                        }
                        animatingImageViews[i2].setPivotX(f);
                        animatingImageViews[i2].setPivotY(f);
                        animatingImageViews[i2].setScaleX(placeForPhoto.scale);
                        animatingImageViews[i2].setScaleY(placeForPhoto.scale);
                        animatingImageViews[i2].setTranslationX(placeForPhoto.viewX + (drawRegion.left * placeForPhoto.scale));
                        animatingImageViews[i2].setTranslationY(placeForPhoto.viewY + (drawRegion.top * placeForPhoto.scale));
                        animatingImageViews[i2].setLayoutParams(layoutParams2);
                        i2++;
                        f = 0.0f;
                    }
                    this.windowView.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass71(animatingImageViews, layoutParams2, f2, placeForPhoto, f3, photoViewerProvider, arrayList3, num));
                } else {
                    if (arrayList3 != null && this.sendPhotoType != 3 && ((photoViewerProvider2 = this.placeProvider) == null || !photoViewerProvider2.closeKeyboard())) {
                        makeFocusable();
                    }
                    this.containerView.setAlpha(1.0f);
                    onPhotoShow(messageObject, tLRPC$FileLocation, imageLocation, imageLocation2, arrayList, arrayList2, arrayList3, i, placeForPhoto);
                    initCropView();
                    setCropBitmap();
                    ChatActivity chatActivity2 = this.parentChatActivity;
                    if (chatActivity2 != null) {
                        UndoView undoView = chatActivity2.getUndoView();
                        if (undoView != null) {
                            undoView.hide(false, 1);
                        }
                        this.parentChatActivity.getFragmentView().invalidate();
                    }
                    this.windowView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                        {
                            PhotoViewer.this = this;
                        }

                        @Override
                        public boolean onPreDraw() {
                            PhotoViewer.this.windowView.getViewTreeObserver().removeOnPreDrawListener(this);
                            PhotoViewer.this.actionBar.setTranslationY(-AndroidUtilities.dp(32.0f));
                            ViewPropertyAnimator duration = PhotoViewer.this.actionBar.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
                            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                            duration.setInterpolator(cubicBezierInterpolator).start();
                            PhotoViewer.this.checkImageView.setTranslationY(-AndroidUtilities.dp(32.0f));
                            PhotoViewer.this.checkImageView.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
                            PhotoViewer.this.photosCounterView.setTranslationY(-AndroidUtilities.dp(32.0f));
                            PhotoViewer.this.photosCounterView.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
                            PhotoViewer.this.pickerView.setTranslationY(AndroidUtilities.dp(32.0f));
                            PhotoViewer.this.pickerView.animate().alpha(1.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
                            PhotoViewer.this.pickerViewSendButton.setTranslationY(AndroidUtilities.dp(32.0f));
                            PhotoViewer.this.pickerViewSendButton.setAlpha(0.0f);
                            PhotoViewer.this.pickerViewSendButton.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
                            PhotoViewer.this.videoPreviewFrame.setTranslationY(AndroidUtilities.dp(32.0f));
                            PhotoViewer.this.videoPreviewFrame.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
                            PhotoViewer.this.containerView.setAlpha(0.0f);
                            PhotoViewer.this.backgroundDrawable.setAlpha(0);
                            PhotoViewer.this.animationInProgress = 4;
                            PhotoViewer.this.containerView.invalidate();
                            AnimatorSet animatorSet = new AnimatorSet();
                            ObjectAnimator duration2 = ObjectAnimator.ofFloat(PhotoViewer.this.pickerView, View.TRANSLATION_Y, PhotoViewer.this.pickerView.getTranslationY(), 0.0f).setDuration(220L);
                            duration2.setInterpolator(cubicBezierInterpolator);
                            ObjectAnimator duration3 = ObjectAnimator.ofFloat(PhotoViewer.this.pickerView, View.ALPHA, 1.0f).setDuration(220L);
                            duration3.setInterpolator(cubicBezierInterpolator);
                            animatorSet.playTogether(ObjectAnimator.ofFloat(PhotoViewer.this.containerView, View.ALPHA, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(PhotoViewer.this.navigationBar, View.ALPHA, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
                            animatorSet.addListener(new AnimatorListenerAdapter() {
                                {
                                    AnonymousClass72.this = this;
                                }

                                @Override
                                public void onAnimationStart(Animator animator) {
                                    super.onAnimationStart(animator);
                                    PhotoViewerProvider photoViewerProvider3 = photoViewerProvider;
                                    if (photoViewerProvider3 != null) {
                                        photoViewerProvider3.onPreOpen();
                                    }
                                }

                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    super.onAnimationEnd(animator);
                                    PhotoViewer.this.animationInProgress = 0;
                                    PhotoViewer.this.invalidateBlur();
                                    PhotoViewer.this.backgroundDrawable.setAlpha(255);
                                    PhotoViewer.this.containerView.invalidate();
                                    PhotoViewer.this.pickerView.setTranslationY(0.0f);
                                    if (PhotoViewer.this.isEmbedVideo) {
                                        AnonymousClass72 anonymousClass72 = AnonymousClass72.this;
                                        PhotoViewer.this.initEmbedVideo(num.intValue());
                                    }
                                    PhotoViewerProvider photoViewerProvider3 = photoViewerProvider;
                                    if (photoViewerProvider3 != null) {
                                        photoViewerProvider3.onOpen();
                                    }
                                }
                            });
                            animatorSet.start();
                            return true;
                        }
                    });
                }
                AccessibilityManager accessibilityManager = (AccessibilityManager) this.parentActivity.getSystemService("accessibility");
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM);
                    obtain.getText().add(LocaleController.getString("AccDescrPhotoViewer", R.string.AccDescrPhotoViewer));
                    accessibilityManager.sendAccessibilityEvent(obtain);
                }
                return true;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return false;
    }

    public class AnonymousClass71 implements ViewTreeObserver.OnPreDrawListener {
        final ClippingImageView[] val$animatingImageViews;
        final Integer val$embedSeekTime;
        final ViewGroup.LayoutParams val$layoutParams;
        final float val$left;
        final PlaceProviderObject val$object;
        final ArrayList val$photos;
        final PhotoViewerProvider val$provider;
        final float val$top;

        AnonymousClass71(ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f, PlaceProviderObject placeProviderObject, float f2, PhotoViewerProvider photoViewerProvider, ArrayList arrayList, Integer num) {
            PhotoViewer.this = r1;
            this.val$animatingImageViews = clippingImageViewArr;
            this.val$layoutParams = layoutParams;
            this.val$left = f;
            this.val$object = placeProviderObject;
            this.val$top = f2;
            this.val$provider = photoViewerProvider;
            this.val$photos = arrayList;
            this.val$embedSeekTime = num;
        }

        @Override
        public boolean onPreDraw() {
            float f;
            float f2;
            float measuredWidth;
            PlaceProviderObject placeProviderObject;
            ClippingImageView[] clippingImageViewArr;
            int i;
            ClippingImageView[] clippingImageViewArr2 = this.val$animatingImageViews;
            if (clippingImageViewArr2.length > 1) {
                clippingImageViewArr2[1].setAlpha(1.0f);
                this.val$animatingImageViews[1].setAdditionalTranslationX(-PhotoViewer.this.getLeftInset());
            }
            ClippingImageView[] clippingImageViewArr3 = this.val$animatingImageViews;
            clippingImageViewArr3[0].setTranslationX(clippingImageViewArr3[0].getTranslationX() + PhotoViewer.this.getLeftInset());
            PhotoViewer.this.windowView.getViewTreeObserver().removeOnPreDrawListener(this);
            if (PhotoViewer.this.sendPhotoType == 1) {
                float f3 = PhotoViewer.this.isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0;
                float measuredHeight = (PhotoViewer.this.photoCropView.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - f3;
                float measuredWidth2 = PhotoViewer.this.photoCropView.getMeasuredWidth() / 2.0f;
                float f4 = f3 + (measuredHeight / 2.0f);
                float min = (Math.min(PhotoViewer.this.photoCropView.getMeasuredWidth(), measuredHeight) - (AndroidUtilities.dp(16.0f) * 2)) / 2.0f;
                float f5 = f4 - min;
                ViewGroup.LayoutParams layoutParams = this.val$layoutParams;
                float f6 = (f4 + min) - f5;
                f = Math.max(((measuredWidth2 + min) - (measuredWidth2 - min)) / layoutParams.width, f6 / layoutParams.height);
                f2 = f5 + ((f6 - (this.val$layoutParams.height * f)) / 2.0f);
                measuredWidth = ((((PhotoViewer.this.windowView.getMeasuredWidth() - PhotoViewer.this.getLeftInset()) - PhotoViewer.this.getRightInset()) - (this.val$layoutParams.width * f)) / 2.0f) + PhotoViewer.this.getLeftInset();
            } else {
                float min2 = Math.min(PhotoViewer.this.windowView.getMeasuredWidth() / this.val$layoutParams.width, (AndroidUtilities.displaySize.y + (PhotoViewer.this.isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0)) / this.val$layoutParams.height);
                if (PhotoViewer.this.sendPhotoType == 11) {
                    min2 *= PhotoViewer.this.scale1();
                }
                f = min2;
                f2 = ((AndroidUtilities.displaySize.y + (PhotoViewer.this.isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0)) - (this.val$layoutParams.height * f)) / 2.0f;
                measuredWidth = (PhotoViewer.this.windowView.getMeasuredWidth() - (this.val$layoutParams.width * f)) / 2.0f;
                PhotoViewer.this.rotate = 0.0f;
                PhotoViewer.this.animateToRotate = 0.0f;
            }
            int abs = (int) Math.abs(this.val$left - this.val$object.imageReceiver.getImageX());
            int abs2 = (int) Math.abs(this.val$top - this.val$object.imageReceiver.getImageY());
            if (this.val$object.imageReceiver.isAspectFit()) {
                abs = 0;
            }
            int[] iArr = new int[2];
            this.val$object.parentView.getLocationInWindow(iArr);
            int i2 = iArr[1];
            int i3 = Build.VERSION.SDK_INT;
            float f7 = i2 - ((i3 >= 21 || PhotoViewer.this.inBubbleMode) ? 0 : AndroidUtilities.statusBarHeight);
            int i4 = this.val$object.viewY;
            float f8 = this.val$top;
            int i5 = (int) ((f7 - (i4 + f8)) + placeProviderObject.clipTopAddition);
            if (i5 < 0) {
                i5 = 0;
            }
            int height = (int) ((((i4 + f8) + this.val$layoutParams.height) - ((iArr[1] + placeProviderObject.parentView.getHeight()) - ((i3 >= 21 || PhotoViewer.this.inBubbleMode) ? 0 : AndroidUtilities.statusBarHeight))) + this.val$object.clipBottomAddition);
            if (height < 0) {
                height = 0;
            }
            int max = Math.max(i5, abs2);
            int max2 = Math.max(height, abs2);
            PhotoViewer.this.animationValues[0][0] = PhotoViewer.this.animatingImageView.getScaleX();
            PhotoViewer.this.animationValues[0][1] = PhotoViewer.this.animatingImageView.getScaleY();
            PhotoViewer.this.animationValues[0][2] = PhotoViewer.this.animatingImageView.getTranslationX();
            PhotoViewer.this.animationValues[0][3] = PhotoViewer.this.animatingImageView.getTranslationY();
            float f9 = abs;
            PhotoViewer.this.animationValues[0][4] = this.val$object.scale * f9;
            PhotoViewer.this.animationValues[0][5] = max * this.val$object.scale;
            PhotoViewer.this.animationValues[0][6] = max2 * this.val$object.scale;
            int[] radius = PhotoViewer.this.animatingImageView.getRadius();
            for (int i6 = 0; i6 < 4; i6++) {
                PhotoViewer.this.animationValues[0][i6 + 7] = radius != null ? radius[i6] : 0.0f;
            }
            PhotoViewer.this.animationValues[0][11] = abs2 * this.val$object.scale;
            PhotoViewer.this.animationValues[0][12] = f9 * this.val$object.scale;
            PhotoViewer.this.animationValues[1][0] = f;
            PhotoViewer.this.animationValues[1][1] = f;
            PhotoViewer.this.animationValues[1][2] = measuredWidth;
            PhotoViewer.this.animationValues[1][3] = f2;
            PhotoViewer.this.animationValues[1][4] = 0.0f;
            PhotoViewer.this.animationValues[1][5] = 0.0f;
            PhotoViewer.this.animationValues[1][6] = 0.0f;
            PhotoViewer.this.animationValues[1][7] = 0.0f;
            PhotoViewer.this.animationValues[1][8] = 0.0f;
            PhotoViewer.this.animationValues[1][9] = 0.0f;
            PhotoViewer.this.animationValues[1][10] = 0.0f;
            PhotoViewer.this.animationValues[1][11] = 0.0f;
            PhotoViewer.this.animationValues[1][12] = 0.0f;
            int i7 = 0;
            while (true) {
                ClippingImageView[] clippingImageViewArr4 = this.val$animatingImageViews;
                if (i7 >= clippingImageViewArr4.length) {
                    break;
                }
                clippingImageViewArr4[i7].setAnimationProgress(0.0f);
                i7++;
            }
            PhotoViewer.this.backgroundDrawable.setAlpha(0);
            PhotoViewer.this.containerView.setAlpha(0.0f);
            PhotoViewer.this.navigationBar.setAlpha(0.0f);
            PhotoViewerProvider photoViewerProvider = this.val$provider;
            if (photoViewerProvider != null) {
                photoViewerProvider.onPreOpen();
            }
            PhotoViewer photoViewer = PhotoViewer.this;
            final ClippingImageView[] clippingImageViewArr5 = this.val$animatingImageViews;
            final ArrayList arrayList = this.val$photos;
            final Integer num = this.val$embedSeekTime;
            final PhotoViewerProvider photoViewerProvider2 = this.val$provider;
            photoViewer.animationEndRunnable = new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.AnonymousClass71.this.lambda$onPreDraw$0(clippingImageViewArr5, arrayList, num, photoViewerProvider2);
                }
            };
            if (PhotoViewer.this.openedFullScreenVideo) {
                if (PhotoViewer.this.animationEndRunnable != null) {
                    PhotoViewer.this.animationEndRunnable.run();
                    PhotoViewer.this.animationEndRunnable = null;
                }
                PhotoViewer.this.containerView.setAlpha(1.0f);
                PhotoViewer.this.backgroundDrawable.setAlpha(255);
                int i8 = 0;
                while (true) {
                    ClippingImageView[] clippingImageViewArr6 = this.val$animatingImageViews;
                    if (i8 >= clippingImageViewArr6.length) {
                        break;
                    }
                    clippingImageViewArr6[i8].setAnimationProgress(1.0f);
                    i8++;
                }
                if (PhotoViewer.this.sendPhotoType == 1) {
                    PhotoViewer.this.photoCropView.setAlpha(1.0f);
                }
            } else {
                final AnimatorSet animatorSet = new AnimatorSet();
                int i9 = PhotoViewer.this.sendPhotoType != 1 ? 2 : 3;
                ClippingImageView[] clippingImageViewArr7 = this.val$animatingImageViews;
                ArrayList arrayList2 = new ArrayList(i9 + clippingImageViewArr7.length + (clippingImageViewArr7.length > 1 ? 1 : 0));
                int i10 = 0;
                while (true) {
                    clippingImageViewArr = this.val$animatingImageViews;
                    if (i10 >= clippingImageViewArr.length) {
                        break;
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i10], AnimationProperties.CLIPPING_IMAGE_VIEW_PROGRESS, 0.0f, 1.0f);
                    if (i10 == 0) {
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                PhotoViewer.AnonymousClass71.this.lambda$onPreDraw$1(valueAnimator);
                            }
                        });
                    }
                    arrayList2.add(ofFloat);
                    i10++;
                }
                if (clippingImageViewArr.length > 1) {
                    i = 2;
                    arrayList2.add(ObjectAnimator.ofFloat(PhotoViewer.this.animatingImageView, View.ALPHA, 0.0f, 1.0f));
                } else {
                    i = 2;
                }
                int[] iArr2 = new int[i];
                
                iArr2[0] = 0;
                iArr2[1] = 255;
                arrayList2.add(ObjectAnimator.ofInt(PhotoViewer.this.backgroundDrawable, (Property<BackgroundDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, iArr2));
                float[] fArr = new float[i];
                
                fArr[0] = 0.0f;
                fArr[1] = 1.0f;
                arrayList2.add(ObjectAnimator.ofFloat(PhotoViewer.this.containerView, View.ALPHA, fArr));
                float[] fArr2 = new float[i];
                
                fArr2[0] = 0.0f;
                fArr2[1] = 1.0f;
                arrayList2.add(ObjectAnimator.ofFloat(PhotoViewer.this.navigationBar, View.ALPHA, fArr2));
                if (PhotoViewer.this.sendPhotoType == 1) {
                    float[] fArr3 = new float[i];
                    
                    fArr3[0] = 0.0f;
                    fArr3[1] = 1.0f;
                    arrayList2.add(ObjectAnimator.ofFloat(PhotoViewer.this.photoCropView, View.ALPHA, fArr3));
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.setDuration(200L);
                animatorSet.addListener(new AnonymousClass1());
                PhotoViewer.this.containerView.setLayerType(2, null);
                PhotoViewer.this.setCaptionHwLayerEnabled(false);
                PhotoViewer.this.transitionAnimationStartTime = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PhotoViewer.AnonymousClass71.this.lambda$onPreDraw$2(animatorSet);
                    }
                });
            }
            BackgroundDrawable backgroundDrawable = PhotoViewer.this.backgroundDrawable;
            final PlaceProviderObject placeProviderObject2 = this.val$object;
            backgroundDrawable.drawRunnable = new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.AnonymousClass71.this.lambda$onPreDraw$3(placeProviderObject2);
                }
            };
            if (PhotoViewer.this.parentChatActivity != null && PhotoViewer.this.parentChatActivity.getFragmentView() != null) {
                UndoView undoView = PhotoViewer.this.parentChatActivity.getUndoView();
                if (undoView != null) {
                    undoView.hide(false, 1);
                }
                PhotoViewer.this.parentChatActivity.getFragmentView().invalidate();
            }
            return true;
        }

        public void lambda$onPreDraw$0(ClippingImageView[] clippingImageViewArr, ArrayList arrayList, Integer num, PhotoViewerProvider photoViewerProvider) {
            PhotoViewer.this.animationEndRunnable = null;
            if (PhotoViewer.this.containerView == null || PhotoViewer.this.windowView == null) {
                return;
            }
            PhotoViewer.this.containerView.setLayerType(0, null);
            PhotoViewer.this.animationInProgress = 0;
            PhotoViewer.this.invalidateBlur();
            PhotoViewer.this.transitionAnimationStartTime = 0L;
            PhotoViewer.this.leftCropState = null;
            PhotoViewer.this.leftCropTransform.setViewTransform(false);
            PhotoViewer.this.rightCropState = null;
            PhotoViewer.this.rightCropTransform.setViewTransform(false);
            PhotoViewer.this.setImages();
            PhotoViewer.this.setCropBitmap();
            PhotoViewer.this.containerView.invalidate();
            for (ClippingImageView clippingImageView : clippingImageViewArr) {
                clippingImageView.setVisibility(8);
            }
            if (PhotoViewer.this.showAfterAnimation != null) {
                PhotoViewer.this.showAfterAnimation.imageReceiver.setVisible(true, true);
            }
            if (PhotoViewer.this.hideAfterAnimation != null) {
                PhotoViewer.this.hideAfterAnimation.imageReceiver.setVisible(false, true);
            }
            if (arrayList != null && PhotoViewer.this.sendPhotoType != 3 && PhotoViewer.this.sendPhotoType != 1 && (PhotoViewer.this.placeProvider == null || !PhotoViewer.this.placeProvider.closeKeyboard())) {
                PhotoViewer.this.makeFocusable();
            }
            if (PhotoViewer.this.videoPlayer != null && PhotoViewer.this.videoPlayer.isPlaying() && PhotoViewer.this.isCurrentVideo && !PhotoViewer.this.imagesArrLocals.isEmpty()) {
                PhotoViewer photoViewer = PhotoViewer.this;
                photoViewer.seekAnimatedStickersTo(photoViewer.videoPlayer.getCurrentPosition());
                PhotoViewer.this.playOrStopAnimatedStickers(true);
            }
            if (PhotoViewer.this.isEmbedVideo) {
                PhotoViewer.this.initEmbedVideo(num.intValue());
            }
            if (photoViewerProvider != null) {
                photoViewerProvider.onOpen();
            }
        }

        public void lambda$onPreDraw$1(ValueAnimator valueAnimator) {
            PhotoViewer.this.clippingImageProgress = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
            PhotoViewer.this.invalidateBlur();
        }

        public class AnonymousClass1 extends AnimatorListenerAdapter {
            AnonymousClass1() {
                AnonymousClass71.this = r1;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PhotoViewer.AnonymousClass71.AnonymousClass1.this.lambda$onAnimationEnd$0();
                    }
                });
            }

            public void lambda$onAnimationEnd$0() {
                PhotoViewer.this.transitionNotificationLocker.unlock();
                if (PhotoViewer.this.animationEndRunnable != null) {
                    PhotoViewer.this.animationEndRunnable.run();
                    PhotoViewer.this.animationEndRunnable = null;
                }
                PhotoViewer.this.setCaptionHwLayerEnabled(true);
            }
        }

        public void lambda$onPreDraw$2(AnimatorSet animatorSet) {
            PhotoViewer.this.transitionNotificationLocker.lock();
            animatorSet.start();
        }

        public void lambda$onPreDraw$3(PlaceProviderObject placeProviderObject) {
            PhotoViewer.this.disableShowCheck = false;
            placeProviderObject.imageReceiver.setVisible(false, true);
        }
    }

    public void initEmbedVideo(int i) {
        if (this.isEmbedVideo) {
            PhotoViewerWebView photoViewerWebView = new PhotoViewerWebView(this, this.parentActivity, this.pipItem) {
                Rect rect = new Rect();

                @Override
                protected void processTouch(MotionEvent motionEvent) {
                }

                {
                    PhotoViewer.this = this;
                }

                @Override
                protected void drawBlackBackground(Canvas canvas, int i2, int i3) {
                    Bitmap bitmap = PhotoViewer.this.centerImage.getBitmap();
                    if (bitmap != null) {
                        float min = Math.min(i2 / bitmap.getWidth(), i3 / bitmap.getHeight());
                        int width = (int) (bitmap.getWidth() * min);
                        int height = (int) (bitmap.getHeight() * min);
                        int i4 = (i3 - height) / 2;
                        int i5 = (i2 - width) / 2;
                        this.rect.set(i5, i4, width + i5, height + i4);
                        canvas.drawBitmap(bitmap, (Rect) null, this.rect, (Paint) null);
                    }
                }
            };
            this.photoViewerWebView = photoViewerWebView;
            photoViewerWebView.init(i, MessageObject.getMedia(this.currentMessageObject.messageOwner).webpage);
            this.photoViewerWebView.setPlaybackSpeed(this.currentVideoSpeed);
            this.containerView.addView(this.photoViewerWebView, 0, LayoutHelper.createFrame(-1, -1.0f));
            if (this.photoViewerWebView.isControllable()) {
                setVideoPlayerControlVisible(true, true);
            }
            this.videoPlayerSeekbar.clearTimestamps();
            updateVideoPlayerTime();
            this.shouldSavePositionForCurrentVideo = null;
            this.shouldSavePositionForCurrentVideoShortTerm = null;
            this.lastSaveTime = 0L;
            this.seekToProgressPending = this.seekToProgressPending2;
            this.videoPlayerSeekbar.setProgress(0.0f);
            this.videoTimelineView.setProgress(0.0f);
            this.videoPlayerSeekbar.setBufferedProgress(0.0f);
        }
    }

    public void makeFocusable() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.windowLayoutParams.flags = -2147417856;
        } else {
            this.windowLayoutParams.flags = 0;
        }
        this.windowLayoutParams.softInputMode = 272;
        try {
            ((WindowManager) this.parentActivity.getSystemService("window")).updateViewLayout(this.windowView, this.windowLayoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.windowView.setFocusable(true);
        this.containerView.setFocusable(true);
    }

    private void requestAdjustToNothing() {
        this.windowLayoutParams.softInputMode = 48;
        try {
            ((WindowManager) this.parentActivity.getSystemService("window")).updateViewLayout(this.windowView, this.windowLayoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void requestAdjust() {
        this.windowLayoutParams.softInputMode = 272;
        try {
            ((WindowManager) this.parentActivity.getSystemService("window")).updateViewLayout(this.windowView, this.windowLayoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void injectVideoPlayerToMediaController() {
        if (this.videoPlayer.isPlaying()) {
            if (this.playerLooping) {
                this.videoPlayer.setLooping(false);
            }
            MediaController.getInstance().injectVideoPlayer(this.videoPlayer, this.currentMessageObject);
            this.videoPlayer = null;
        }
    }

    public void closePhoto(boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.closePhoto(boolean, boolean):void");
    }

    public void lambda$closePhoto$94(MaskPaintView maskPaintView) {
        maskPaintView.shutdown();
        this.containerView.removeView(this.maskPaintView);
    }

    public void lambda$closePhoto$95(ValueAnimator valueAnimator) {
        this.clippingImageProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidateBlur();
    }

    public void lambda$closePhoto$96(ValueAnimator valueAnimator) {
        this.clippingImageProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public void lambda$closePhoto$97(PlaceProviderObject placeProviderObject) {
        ArrayList<Object> arrayList;
        this.animationEndRunnable = null;
        this.containerView.setLayerType(0, null);
        this.animationInProgress = 0;
        invalidateBlur();
        onPhotoClosed(placeProviderObject);
        MediaController.getInstance().tryResumePausedAudio();
        if (!this.stickerEmpty || this.stickerEmptySent || (arrayList = this.imagesArrLocals) == null) {
            return;
        }
        Iterator<Object> it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof MediaController.PhotoEntry) {
                ((MediaController.PhotoEntry) next).deleteAll();
            }
        }
    }

    public class AnonymousClass74 extends AnimatorListenerAdapter {
        AnonymousClass74() {
            PhotoViewer.this = r1;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.AnonymousClass74.this.lambda$onAnimationEnd$0();
                }
            });
        }

        public void lambda$onAnimationEnd$0() {
            if (PhotoViewer.this.animationEndRunnable != null) {
                PhotoViewer.this.animationEndRunnable.run();
                PhotoViewer.this.animationEndRunnable = null;
            }
        }
    }

    public void lambda$closePhoto$98(ValueAnimator valueAnimator) {
        this.clippingImageProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public void lambda$closePhoto$99(PlaceProviderObject placeProviderObject) {
        ArrayList<Object> arrayList;
        this.animationEndRunnable = null;
        FrameLayoutDrawer frameLayoutDrawer = this.containerView;
        if (frameLayoutDrawer == null) {
            return;
        }
        frameLayoutDrawer.setLayerType(0, null);
        this.animationInProgress = 0;
        onPhotoClosed(placeProviderObject);
        this.containerView.setScaleX(1.0f);
        this.containerView.setScaleY(1.0f);
        MediaController.getInstance().tryResumePausedAudio();
        if (!this.stickerEmpty || this.stickerEmptySent || (arrayList = this.imagesArrLocals) == null) {
            return;
        }
        Iterator<Object> it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof MediaController.PhotoEntry) {
                ((MediaController.PhotoEntry) next).deleteAll();
            }
        }
    }

    private ClippingImageView[] getAnimatingImageViews(PlaceProviderObject placeProviderObject) {
        int i = (AndroidUtilities.isTablet() || placeProviderObject == null || placeProviderObject.animatingImageView == null) ? 0 : 1;
        ClippingImageView[] clippingImageViewArr = new ClippingImageView[i + 1];
        clippingImageViewArr[0] = this.animatingImageView;
        if (i != 0) {
            ClippingImageView clippingImageView = placeProviderObject.animatingImageView;
            clippingImageViewArr[1] = clippingImageView;
            clippingImageView.setAdditionalTranslationY(placeProviderObject.animatingImageViewYOffset);
        }
        return clippingImageViewArr;
    }

    private void removeObservers() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.customStickerCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.mediaCountDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.mediaDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogPhotosUpdate);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagesDeleted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        ConnectionsManager.getInstance(this.currentAccount).cancelRequestsForGuid(this.classGuid);
    }

    public void destroyPhotoViewer() {
        if (this.parentActivity == null || this.windowView == null) {
            return;
        }
        if (PipVideoOverlay.isVisible()) {
            PipVideoOverlay.dismiss();
        }
        removeObservers();
        releasePlayer(false);
        try {
            if (this.windowView.getParent() != null) {
                ((WindowManager) this.parentActivity.getSystemService("window")).removeViewImmediate(this.windowView);
                onHideView();
            }
            this.windowView = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        ImageReceiver.BitmapHolder bitmapHolder = this.currentThumb;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.currentThumb = null;
        }
        this.animatingImageView.setImageBitmap(null);
        if (this == PipInstance) {
            PipInstance = null;
        } else {
            Instance = null;
        }
        onHideView();
    }

    private void onPhotoClosed(final PlaceProviderObject placeProviderObject) {
        if (this.doneButtonPressed) {
            releasePlayer(true);
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && !messageObject.putInDownloadsStore) {
            FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.currentMessageObject.getDocument());
        }
        this.isVisible = false;
        this.isVisibleOrAnimating = false;
        this.cropInitied = false;
        this.disableShowCheck = true;
        this.currentMessageObject = null;
        this.currentBotInlineResult = null;
        this.currentFileLocation = null;
        this.currentFileLocationVideo = null;
        this.currentSecureDocument = null;
        this.currentPageBlock = null;
        this.currentPathObject = null;
        this.dialogPhotos = null;
        if (this.videoPlayerControlFrameLayout != null) {
            setVideoPlayerControlVisible(false, false);
        }
        CaptionScrollView captionScrollView = this.captionScrollView;
        if (captionScrollView != null) {
            captionScrollView.reset();
        }
        this.sendPhotoType = 0;
        this.isDocumentsPicker = false;
        ImageReceiver.BitmapHolder bitmapHolder = this.currentThumb;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.currentThumb = null;
        }
        this.parentAlert = null;
        AnimatedFileDrawable animatedFileDrawable = this.currentAnimation;
        if (animatedFileDrawable != null) {
            animatedFileDrawable.removeSecondParentView(this.containerView);
            this.currentAnimation = null;
        }
        for (int i = 0; i < 3; i++) {
            PhotoProgressView[] photoProgressViewArr = this.photoProgressViews;
            if (photoProgressViewArr[i] != null) {
                photoProgressViewArr[i].setBackgroundState(-1, false, true);
            }
        }
        requestVideoPreview(0);
        VideoTimelinePlayView videoTimelinePlayView = this.videoTimelineView;
        if (videoTimelinePlayView != null) {
            videoTimelinePlayView.destroy();
        }
        this.hintView.hide(false, 0);
        this.centerImage.setImageBitmap((Bitmap) null);
        this.centerBlur.destroy();
        this.leftImage.setImageBitmap((Bitmap) null);
        this.leftBlur.destroy();
        this.rightImage.setImageBitmap((Bitmap) null);
        this.rightBlur.destroy();
        this.containerView.post(new Runnable() {
            @Override
            public final void run() {
                PhotoViewer.this.lambda$onPhotoClosed$100(placeProviderObject);
            }
        });
        PhotoViewerProvider photoViewerProvider = this.placeProvider;
        if (photoViewerProvider != null) {
            photoViewerProvider.willHidePhotoViewer();
        }
        this.groupedPhotosListView.clear();
        PhotoViewerProvider photoViewerProvider2 = this.placeProvider;
        if (photoViewerProvider2 != null) {
            photoViewerProvider2.onClose();
        }
        this.placeProvider = null;
        this.selectedPhotosAdapter.notifyDataSetChanged();
        this.pageBlocksAdapter = null;
        this.disableShowCheck = false;
        this.shownControlsByEnd = false;
        this.videoCutStart = 0.0f;
        this.videoCutEnd = 1.0f;
        if (placeProviderObject != null) {
            placeProviderObject.imageReceiver.setVisible(true, true);
        }
        ChatActivity chatActivity = this.parentChatActivity;
        if (chatActivity != null) {
            chatActivity.getFragmentView().invalidate();
        }
        Bitmap bitmap = this.videoFrameBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.videoFrameBitmap = null;
        }
    }

    public void lambda$onPhotoClosed$100(PlaceProviderObject placeProviderObject) {
        ClippingImageView clippingImageView;
        this.animatingImageView.setImageBitmap(null);
        if (placeProviderObject != null && !AndroidUtilities.isTablet() && (clippingImageView = placeProviderObject.animatingImageView) != null) {
            clippingImageView.setImageBitmap(null);
        }
        try {
            if (this.windowView.getParent() != null) {
                ((WindowManager) this.parentActivity.getSystemService("window")).removeView(this.windowView);
                onHideView();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void redraw(final int i) {
        FrameLayoutDrawer frameLayoutDrawer;
        if (i >= 6 || (frameLayoutDrawer = this.containerView) == null) {
            return;
        }
        frameLayoutDrawer.invalidate();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PhotoViewer.this.lambda$redraw$101(i);
            }
        }, 100L);
    }

    public void lambda$redraw$101(int i) {
        redraw(i + 1);
    }

    public void onResume() {
        redraw(0);
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.seekTo(videoPlayer.getCurrentPosition() + 1);
            if (this.playerLooping) {
                this.videoPlayer.setLooping(true);
            }
        }
        LPhotoPaintView lPhotoPaintView = this.photoPaintView;
        if (lPhotoPaintView != null) {
            lPhotoPaintView.onResume();
        }
    }

    public void onPause() {
        if (this.currentAnimation != null) {
            closePhoto(false, false);
            return;
        }
        if (this.lastTitle != null) {
            closeCaptionEnter(true);
        }
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer == null || !this.playerLooping) {
            return;
        }
        videoPlayer.setLooping(false);
    }

    public boolean isVisible() {
        return this.isVisible && this.placeProvider != null;
    }

    public void updateMinMax(float f) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null && aspectRatioFrameLayout.getVisibility() == 0 && this.textureUploaded) {
            View view = this.usedSurfaceView ? this.videoSurfaceView : this.videoTextureView;
            f *= Math.min(getContainerViewWidth() / view.getMeasuredWidth(), getContainerViewHeight() / view.getMeasuredHeight());
        }
        float imageWidth = this.centerImage.getImageWidth();
        float imageHeight = this.centerImage.getImageHeight();
        MediaController.CropState cropState = this.editState.cropState;
        if (cropState != null) {
            imageWidth *= cropState.cropPw;
            imageHeight *= cropState.cropPh;
        }
        int containerViewWidth = this.sendPhotoType == 11 ? (int) (imageWidth * f) : ((int) ((imageWidth * f) - getContainerViewWidth())) / 2;
        int containerViewHeight = this.sendPhotoType == 11 ? (int) (imageHeight * f) : ((int) ((imageHeight * f) - getContainerViewHeight())) / 2;
        if (containerViewWidth > 0) {
            this.minX = -containerViewWidth;
            this.maxX = containerViewWidth;
        } else {
            this.maxX = 0.0f;
            this.minX = 0.0f;
        }
        if (containerViewHeight > 0) {
            this.minY = -containerViewHeight;
            this.maxY = containerViewHeight;
        } else {
            this.maxY = 0.0f;
            this.minY = 0.0f;
        }
        LPhotoPaintView lPhotoPaintView = this.photoPaintView;
        if (lPhotoPaintView != null) {
            lPhotoPaintView.updateZoom(f <= 1.1f);
        }
    }

    private int getAdditionX(int i) {
        if (i == 1 || (i == 0 && this.sendPhotoType == 1)) {
            return AndroidUtilities.dp(16.0f);
        }
        if (i == 0 || i == 4 || i == 3) {
            return 0;
        }
        return AndroidUtilities.dp(14.0f);
    }

    private int getAdditionY(int i) {
        if (i < 0) {
            return 0;
        }
        if (i == 1 || (i == 0 && this.sendPhotoType == 1)) {
            return AndroidUtilities.dp(16.0f) + (isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0);
        } else if (i == 3 && this.photoPaintView != null) {
            return AndroidUtilities.dp(8.0f) + (isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0) + this.photoPaintView.getAdditionalTop();
        } else if (i == 0 || i == 4) {
            return 0;
        } else {
            return AndroidUtilities.dp(14.0f) + (isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0);
        }
    }

    public int getContainerViewWidth() {
        return getContainerViewWidth(this.currentEditMode);
    }

    public int getContainerViewWidth(int i) {
        int dp;
        int width = this.containerView.getWidth();
        if (i == 1 || (i == 0 && this.sendPhotoType == 1)) {
            dp = AndroidUtilities.dp(32.0f);
        } else if (i == 0 || i == 4 || i == 3) {
            return width;
        } else {
            dp = AndroidUtilities.dp(28.0f);
        }
        return width - dp;
    }

    public int getContainerViewHeight() {
        return getContainerViewHeight(this.currentEditMode);
    }

    public int getContainerViewHeight(int i) {
        return getContainerViewHeight(false, i);
    }

    private int getContainerViewHeight(boolean z, int i) {
        int measuredHeight;
        int dp;
        if (z || this.inBubbleMode) {
            measuredHeight = this.containerView.getMeasuredHeight();
        } else {
            measuredHeight = AndroidUtilities.displaySize.y;
            if ((i == 0 || i == 4) && this.sendPhotoType != 1 && isStatusBarVisible()) {
                measuredHeight += AndroidUtilities.statusBarHeight;
            }
        }
        if ((i == 0 && this.sendPhotoType == 1) || i == 1) {
            dp = AndroidUtilities.dp(144.0f);
        } else if (i == 2) {
            dp = AndroidUtilities.dp(214.0f);
        } else if (i != 3) {
            return measuredHeight;
        } else {
            dp = AndroidUtilities.dp(48.0f) + this.photoPaintView.getAdditionalBottom() + ActionBar.getCurrentActionBarHeight() + this.photoPaintView.getAdditionalTop();
        }
        return measuredHeight - dp;
    }

    public boolean onTouchEvent(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void checkMinMax(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.checkMinMax(boolean):void");
    }

    private void goToNext() {
        float containerViewWidth = this.scale != 1.0f ? ((getContainerViewWidth() - this.centerImage.getImageWidth()) / 2.0f) * this.scale : 0.0f;
        this.switchImageAfterAnimation = 1;
        animateTo(this.scale, ((this.minX - getContainerViewWidth()) - containerViewWidth) - (AndroidUtilities.dp(30.0f) / 2), this.translationY, false);
    }

    private void goToPrev() {
        float containerViewWidth = this.scale != 1.0f ? ((getContainerViewWidth() - this.centerImage.getImageWidth()) / 2.0f) * this.scale : 0.0f;
        this.switchImageAfterAnimation = 2;
        animateTo(this.scale, this.maxX + getContainerViewWidth() + containerViewWidth + (AndroidUtilities.dp(30.0f) / 2), this.translationY, false);
    }

    private void cancelMoveZoomAnimation() {
        AnimatorSet animatorSet = this.imageMoveAnimation;
        if (animatorSet == null) {
            return;
        }
        float f = this.scale;
        float f2 = this.animationValue;
        float f3 = f + ((this.animateToScale - f) * f2);
        float f4 = this.translationX;
        float f5 = f4 + ((this.animateToX - f4) * f2);
        float f6 = this.translationY;
        float f7 = f6 + ((this.animateToY - f6) * f2);
        float f8 = this.rotate;
        animatorSet.cancel();
        this.scale = f3;
        this.translationX = f5;
        this.translationY = f7;
        this.animationStartTime = 0L;
        this.rotate = f8 + ((this.animateToRotate - f8) * f2);
        updateMinMax(f3);
        this.zoomAnimation = false;
        this.containerView.invalidate();
    }

    public void zoomOut() {
        animateTo(1.0f, 0.0f, 0.0f, false);
    }

    private void animateTo(float f, float f2, float f3, boolean z) {
        animateTo(f, f2, f3, z, 250);
    }

    private void animateTo(float f, float f2, float f3, boolean z, int i) {
        if (this.scale == f && this.translationX == f2 && this.translationY == f3) {
            return;
        }
        this.zoomAnimation = z;
        this.animateToScale = f;
        this.animateToX = f2;
        this.animateToY = f3;
        this.animationStartTime = System.currentTimeMillis();
        AnimatorSet animatorSet = new AnimatorSet();
        this.imageMoveAnimation = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, AnimationProperties.PHOTO_VIEWER_ANIMATION_VALUE, 0.0f, 1.0f));
        this.imageMoveAnimation.setInterpolator(this.interpolator);
        this.imageMoveAnimation.setDuration(i);
        this.imageMoveAnimation.addListener(new AnimatorListenerAdapter() {
            {
                PhotoViewer.this = this;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                PhotoViewer.this.imageMoveAnimation = null;
                PhotoViewer.this.containerView.invalidate();
            }
        });
        this.imageMoveAnimation.start();
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    public List<Object> getImagesArrLocals() {
        return this.imagesArrLocals;
    }

    @Keep
    public void setAnimationValue(float f) {
        this.animationValue = f;
        this.containerView.invalidate();
        invalidateBlur();
    }

    @Keep
    public float getAnimationValue() {
        return this.animationValue;
    }

    private void switchToNextIndex(int i, boolean z) {
        if (this.currentMessageObject != null) {
            releasePlayer(false);
            FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.currentMessageObject.getDocument());
        } else if (this.currentPageBlock != null) {
            TLObject media = this.pageBlocksAdapter.getMedia(this.currentIndex);
            if (media instanceof TLRPC$Document) {
                releasePlayer(false);
                FileLoader.getInstance(this.currentAccount).cancelLoadFile((TLRPC$Document) media);
            }
        }
        GroupedPhotosListView groupedPhotosListView = this.groupedPhotosListView;
        if (groupedPhotosListView != null) {
            groupedPhotosListView.setAnimateBackground(true);
        }
        this.playerAutoStarted = false;
        setImageIndex(this.currentIndex + i, z, true);
        if (shouldMessageObjectAutoPlayed(this.currentMessageObject) || shouldIndexAutoPlayed(this.currentIndex)) {
            this.playerAutoStarted = true;
            onActionClick(true);
            checkProgress(0, false, true);
        }
        checkFullscreenButton();
    }

    public boolean shouldMessageObjectAutoPlayed(MessageObject messageObject) {
        return messageObject != null && messageObject.isVideo() && (messageObject.mediaExists || messageObject.attachPathExists || (messageObject.canStreamVideo() && SharedConfig.streamMedia)) && SharedConfig.isAutoplayVideo();
    }

    private boolean shouldIndexAutoPlayed(int i) {
        File file;
        PageBlocksAdapter pageBlocksAdapter = this.pageBlocksAdapter;
        if (pageBlocksAdapter != null) {
            return (pageBlocksAdapter.isVideo(i) || this.pageBlocksAdapter.isHardwarePlayer(i)) && SharedConfig.isAutoplayVideo() && (file = this.pageBlocksAdapter.getFile(i)) != null && file.exists();
        }
        return false;
    }

    public float getCropFillScale(boolean z) {
        ImageReceiver imageReceiver = this.centerImage;
        int bitmapHeight = z ? imageReceiver.getBitmapHeight() : imageReceiver.getBitmapWidth();
        int bitmapWidth = z ? this.centerImage.getBitmapWidth() : this.centerImage.getBitmapHeight();
        float min = Math.min(this.photoCropView.getMeasuredWidth(), (this.photoCropView.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - (isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.dp(16.0f) * 2);
        return Math.max(min / bitmapHeight, min / bitmapWidth);
    }

    public boolean isStatusBarVisible() {
        return Build.VERSION.SDK_INT >= 21 && !this.inBubbleMode;
    }

    @android.annotation.SuppressLint({"NewApi", "DrawAllocation"})
    public void onDraw(android.graphics.Canvas r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.onDraw(android.graphics.Canvas):void");
    }

    public void lambda$onDraw$102() {
        switchToNextIndex(1, false);
    }

    public void lambda$onDraw$103() {
        switchToNextIndex(-1, false);
    }

    public void lambda$onDraw$104() {
        checkChangedTextureView(false);
        PipVideoOverlay.dismiss(true, true);
    }

    private void drawFancyShadows(Canvas canvas) {
        float f;
        if (this.fancyShadows) {
            if (SharedConfig.photoViewerBlur) {
                AnimatedFloat animatedFloat = this.blurAlpha;
                int i = this.animationInProgress;
                f = animatedFloat.set(i == 0 || i == 2 || i == 3);
            } else {
                f = 1.0f;
            }
            if (f <= 0.0f) {
                return;
            }
            int currentActionBarHeight = ((int) (AndroidUtilities.statusBarHeight * 1.5f)) + ActionBar.getCurrentActionBarHeight();
            int height = AndroidUtilities.navigationBarHeight + this.pickerView.getHeight() + (this.captionEdit.getVisibility() == 0 ? (this.captionEdit.getEditTextHeightClosedKeyboard() / 2) + AndroidUtilities.dp(20.0f) : 0);
            if (this.clipFancyShadows == null) {
                this.clipFancyShadows = new Path();
                Paint paint = new Paint(1);
                this.topFancyShadowPaint = paint;
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                Paint paint2 = new Paint(1);
                this.bottomFancyShadowPaint = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                this.topFancyShadow = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.bottomFancyShadow = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.topFancyShadowMatrix = new Matrix();
                this.bottomFancyShadowMatrix = new Matrix();
                this.topFancyShadowPaint.setShader(this.topFancyShadow);
                this.bottomFancyShadowPaint.setShader(this.bottomFancyShadow);
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, this.containerView.getWidth(), this.containerView.getHeight() + AndroidUtilities.navigationBarHeight, (int) (f * (this.backgroundDrawable.getAlpha() - 127) * 2.007874f), 31);
            this.clipFancyShadows.rewind();
            float f2 = currentActionBarHeight;
            this.clipFancyShadows.addRect(0.0f, 0.0f, this.containerView.getWidth(), f2, Path.Direction.CW);
            this.clipFancyShadows.addRect(0.0f, (this.containerView.getHeight() + AndroidUtilities.navigationBarHeight) - height, this.containerView.getWidth(), this.containerView.getHeight() + AndroidUtilities.navigationBarHeight, Path.Direction.CW);
            canvas.clipPath(this.clipFancyShadows);
            canvas.drawColor(-16777216);
            drawCaptionBlur(canvas, this.shadowBlurer, 0, 0, true, true, false);
            canvas.save();
            this.topFancyShadowMatrix.reset();
            this.topFancyShadowMatrix.postScale(1.0f, f2 / 16.0f);
            this.topFancyShadow.setLocalMatrix(this.topFancyShadowMatrix);
            this.topFancyShadowPaint.setAlpha(208);
            canvas.drawRect(0.0f, 0.0f, this.containerView.getWidth(), f2, this.topFancyShadowPaint);
            this.bottomFancyShadowMatrix.reset();
            this.bottomFancyShadowMatrix.postScale(1.0f, height / 16.0f);
            this.bottomFancyShadowMatrix.postTranslate(0.0f, (this.containerView.getHeight() - height) + AndroidUtilities.navigationBarHeight);
            this.bottomFancyShadow.setLocalMatrix(this.bottomFancyShadowMatrix);
            this.bottomFancyShadowPaint.setAlpha(187);
            canvas.drawRect(0.0f, (this.containerView.getHeight() + AndroidUtilities.navigationBarHeight) - height, this.containerView.getWidth(), this.containerView.getHeight() + AndroidUtilities.navigationBarHeight, this.bottomFancyShadowPaint);
            canvas.restore();
            canvas.restore();
        }
    }

    private void drawCenterImageInternal(android.graphics.Canvas r7, float r8, float r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.drawCenterImageInternal(android.graphics.Canvas, float, float):void");
    }

    private void drawProgress(android.graphics.Canvas r9, float r10, float r11, float r12, float r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.drawProgress(android.graphics.Canvas, float, float, float, float):void");
    }

    private int[] applyCrop(android.graphics.Canvas r23, int r24, int r25, int r26, int r27, float r28, org.telegram.ui.Components.Crop.CropTransform r29, org.telegram.messenger.MediaController.CropState r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.applyCrop(android.graphics.Canvas, int, int, int, int, float, org.telegram.ui.Components.Crop.CropTransform, org.telegram.messenger.MediaController$CropState):int[]");
    }

    public void onActionClick(boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.onActionClick(boolean):void");
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        if (!this.doubleTap && this.checkImageView.getVisibility() != 0) {
            boolean[] zArr = this.drawPressedDrawable;
            if (!zArr[0] && !zArr[1]) {
                float x = motionEvent.getX();
                int min = Math.min(135, this.containerView.getMeasuredWidth() / 8);
                if (x < min) {
                    if (this.leftImage.hasImageSet()) {
                        this.drawPressedDrawable[0] = true;
                        this.containerView.invalidate();
                    }
                } else if (x > this.containerView.getMeasuredWidth() - min && this.rightImage.hasImageSet()) {
                    this.drawPressedDrawable[1] = true;
                    this.containerView.invalidate();
                }
            }
        }
        return false;
    }

    @Override
    public boolean canDoubleTap(MotionEvent motionEvent) {
        MessageObject messageObject;
        PhotoViewerWebView photoViewerWebView;
        if (this.checkImageView.getVisibility() != 0) {
            boolean[] zArr = this.drawPressedDrawable;
            if (zArr[0] || zArr[1]) {
                return true;
            }
            float x = motionEvent.getX();
            int min = Math.min(135, this.containerView.getMeasuredWidth() / 8);
            if ((x < min || x > this.containerView.getMeasuredWidth() - min) && (messageObject = this.currentMessageObject) != null) {
                return (messageObject.isVideo() || ((photoViewerWebView = this.photoViewerWebView) != null && photoViewerWebView.isControllable())) && SystemClock.elapsedRealtime() - this.lastPhotoSetTime >= 500 && canDoubleTapSeekVideo(motionEvent);
            }
            return true;
        }
        return true;
    }

    private void hidePressedDrawables() {
        boolean[] zArr = this.drawPressedDrawable;
        zArr[1] = false;
        zArr[0] = false;
        this.containerView.invalidate();
    }

    @Override
    public void onUp(MotionEvent motionEvent) {
        hidePressedDrawables();
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        if (!this.canZoom && !this.doubleTapEnabled) {
            return onSingleTapConfirmed(motionEvent);
        }
        FrameLayoutDrawer frameLayoutDrawer = this.containerView;
        if (frameLayoutDrawer != null && frameLayoutDrawer.getTag() != null && this.photoProgressViews[0] != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if ((x < ((float) (getContainerViewWidth() - AndroidUtilities.dp(100.0f))) / 2.0f || x > ((float) (getContainerViewWidth() + AndroidUtilities.dp(100.0f))) / 2.0f || y < ((float) (getContainerViewHeight() - AndroidUtilities.dp(100.0f))) / 2.0f || y > ((float) (getContainerViewHeight() + AndroidUtilities.dp(100.0f))) / 2.0f) ? false : onSingleTapConfirmed(motionEvent)) {
                this.discardTap = true;
                return true;
            }
        }
        return false;
    }

    public void onLongPress() {
        boolean z;
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer == null || !this.videoPlayerControlVisible || this.scale > 1.1f) {
            return;
        }
        long currentPosition = videoPlayer.getCurrentPosition();
        long duration = this.videoPlayer.getDuration();
        if (currentPosition == -9223372036854775807L || duration < 15000) {
            return;
        }
        float f = this.longPressX;
        int containerViewWidth = getContainerViewWidth() / 3;
        if (f >= containerViewWidth * 2) {
            z = true;
        } else if (f >= containerViewWidth) {
            return;
        } else {
            z = false;
        }
        this.videoPlayerRewinder.startRewind(this.videoPlayer, z, this.currentVideoSpeed);
    }

    public VideoPlayerRewinder getVideoPlayerRewinder() {
        return this.videoPlayerRewinder;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.scale == 1.0f || this.sendPhotoType == 11) {
            return false;
        }
        this.scroller.abortAnimation();
        this.scroller.fling(Math.round(this.translationX), Math.round(this.translationY), Math.round(f), Math.round(f2), (int) this.minX, (int) this.maxX, (int) this.minY, (int) this.maxY);
        this.containerView.postInvalidate();
        return false;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        PhotoViewerWebView photoViewerWebView;
        MessageObject messageObject;
        if (this.discardTap) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (this.checkImageView.getVisibility() != 0 && SharedConfig.nextMediaTap && this.sendPhotoType != 11 && y > ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.dp(40.0f)) {
            int min = Math.min(135, this.containerView.getMeasuredWidth() / 8);
            if (x < min) {
                if (this.leftImage.hasImageSet()) {
                    switchToNextIndex(-1, true);
                    return true;
                }
            } else if (x > this.containerView.getMeasuredWidth() - min && this.rightImage.hasImageSet()) {
                switchToNextIndex(1, true);
                return true;
            }
        }
        PhotoViewerWebView photoViewerWebView2 = this.photoViewerWebView;
        if (photoViewerWebView2 != null && photoViewerWebView2.isControllable() && this.isActionBarVisible) {
            WebView webView = this.photoViewerWebView.getWebView();
            if (x >= webView.getX() && x <= webView.getX() + webView.getWidth() && y >= webView.getY() && y <= webView.getY() + webView.getHeight()) {
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(0);
                obtain.offsetLocation(-webView.getX(), -webView.getY());
                webView.dispatchTouchEvent(obtain);
                obtain.setAction(1);
                webView.dispatchTouchEvent(obtain);
                obtain.recycle();
                scheduleActionBarHide();
                return true;
            }
        }
        if (this.containerView.getTag() != null) {
            AspectRatioFrameLayout aspectRatioFrameLayout = this.aspectRatioFrameLayout;
            boolean z = (aspectRatioFrameLayout != null && aspectRatioFrameLayout.getVisibility() == 0) || ((photoViewerWebView = this.photoViewerWebView) != null && photoViewerWebView.isControllable());
            if (this.sharedMediaType == 1 && (messageObject = this.currentMessageObject) != null) {
                if (!messageObject.canPreviewDocument()) {
                    float containerViewHeight = (getContainerViewHeight() - AndroidUtilities.dp(360.0f)) / 2.0f;
                    if (y >= containerViewHeight && y <= containerViewHeight + AndroidUtilities.dp(360.0f)) {
                        onActionClick(true);
                        return true;
                    }
                }
            } else {
                PhotoProgressView[] photoProgressViewArr = this.photoProgressViews;
                if (photoProgressViewArr[0] != null && this.containerView != null) {
                    int i = photoProgressViewArr[0].backgroundState;
                    if (x >= (getContainerViewWidth() - AndroidUtilities.dp(100.0f)) / 2.0f && x <= (getContainerViewWidth() + AndroidUtilities.dp(100.0f)) / 2.0f && y >= (getContainerViewHeight() - AndroidUtilities.dp(100.0f)) / 2.0f && y <= (getContainerViewHeight() + AndroidUtilities.dp(100.0f)) / 2.0f) {
                        if (z) {
                            if ((i == 3 || i == 4) && this.photoProgressViews[0].isVisible()) {
                                this.manuallyPaused = true;
                                toggleVideoPlayer();
                                return true;
                            }
                        } else if (i > 0 && i <= 3) {
                            onActionClick(true);
                            checkProgress(0, false, true);
                            return true;
                        }
                    }
                }
            }
            PhotoViewerWebView photoViewerWebView3 = this.photoViewerWebView;
            if (photoViewerWebView3 == null || !photoViewerWebView3.isControllable() || this.photoViewerWebView.isPlaying() || !this.isActionBarVisible) {
                toggleActionBar(!this.isActionBarVisible, true);
            }
        } else {
            int i2 = this.sendPhotoType;
            if (i2 == 0 || i2 == 4) {
                if (this.isCurrentVideo) {
                    VideoPlayer videoPlayer = this.videoPlayer;
                    if (videoPlayer != null && !this.muteVideo && i2 != 1) {
                        videoPlayer.setVolume(1.0f);
                    }
                    this.manuallyPaused = true;
                    toggleVideoPlayer();
                } else {
                    this.checkImageView.performClick();
                }
            } else {
                TLRPC$BotInlineResult tLRPC$BotInlineResult = this.currentBotInlineResult;
                if (tLRPC$BotInlineResult != null && (tLRPC$BotInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) || MessageObject.isVideoDocument(this.currentBotInlineResult.document))) {
                    int i3 = this.photoProgressViews[0].backgroundState;
                    if (i3 > 0 && i3 <= 3 && x >= (getContainerViewWidth() - AndroidUtilities.dp(100.0f)) / 2.0f && x <= (getContainerViewWidth() + AndroidUtilities.dp(100.0f)) / 2.0f && y >= (getContainerViewHeight() - AndroidUtilities.dp(100.0f)) / 2.0f && y <= (getContainerViewHeight() + AndroidUtilities.dp(100.0f)) / 2.0f) {
                        onActionClick(true);
                        checkProgress(0, false, true);
                        return true;
                    }
                } else if (this.sendPhotoType == 2 && this.isCurrentVideo) {
                    this.manuallyPaused = true;
                    toggleVideoPlayer();
                }
            }
        }
        return true;
    }

    private boolean canDoubleTapSeekVideo(MotionEvent motionEvent) {
        PhotoViewerWebView photoViewerWebView;
        if (this.videoPlayer != null || ((photoViewerWebView = this.photoViewerWebView) != null && photoViewerWebView.isControllable())) {
            boolean z = motionEvent.getX() >= ((float) ((getContainerViewWidth() / 3) * 2));
            long currentVideoPosition = getCurrentVideoPosition();
            long videoDuration = getVideoDuration();
            if (currentVideoPosition == -9223372036854775807L || videoDuration <= 15000) {
                return false;
            }
            return !z || videoDuration - currentVideoPosition > 10000;
        }
        return false;
    }

    @Override
    public boolean onDoubleTap(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.onDoubleTap(android.view.MotionEvent):boolean");
    }

    public class QualityChooseView extends View {
        private int circleSize;
        private int gapSize;
        private String hightQualityDescription;
        private int lineSize;
        private String lowQualityDescription;
        private Paint paint;
        private int sideSide;
        private int startMovingQuality;
        private TextPaint textPaint;

        public QualityChooseView(Context context) {
            super(context);
            PhotoViewer.this = r1;
            this.paint = new Paint(1);
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            this.textPaint.setColor(-3289651);
            this.lowQualityDescription = LocaleController.getString("AccDescrVideoCompressLow", R.string.AccDescrVideoCompressLow);
            this.hightQualityDescription = LocaleController.getString("AccDescrVideoCompressHigh", R.string.AccDescrVideoCompressHigh);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            if (motionEvent.getAction() == 0) {
                this.startMovingQuality = PhotoViewer.this.selectedCompression;
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                int i = 0;
                while (true) {
                    if (i >= PhotoViewer.this.compressionsCount) {
                        break;
                    }
                    int i2 = this.sideSide;
                    int i3 = this.lineSize;
                    int i4 = this.gapSize;
                    int i5 = this.circleSize;
                    int i6 = i2 + (((i4 * 2) + i3 + i5) * i) + (i5 / 2);
                    int i7 = (i3 / 2) + (i5 / 2) + i4;
                    if (x <= i6 - i7 || x >= i6 + i7) {
                        i++;
                    } else if (PhotoViewer.this.selectedCompression != i) {
                        PhotoViewer.this.selectedCompression = i;
                        PhotoViewer.this.didChangedCompressionLevel(false);
                        invalidate();
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (PhotoViewer.this.selectedCompression != this.startMovingQuality) {
                    PhotoViewer.this.requestVideoPreview(1);
                }
                PhotoViewer.this.moving = false;
            }
            return true;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            this.circleSize = AndroidUtilities.dp(8.0f);
            this.gapSize = AndroidUtilities.dp(2.0f);
            this.sideSide = AndroidUtilities.dp(18.0f);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (PhotoViewer.this.compressionsCount != 1) {
                this.lineSize = (((getMeasuredWidth() - (this.circleSize * PhotoViewer.this.compressionsCount)) - (this.gapSize * ((PhotoViewer.this.compressionsCount * 2) - 2))) - (this.sideSide * 2)) / (PhotoViewer.this.compressionsCount - 1);
            } else {
                this.lineSize = ((getMeasuredWidth() - (this.circleSize * PhotoViewer.this.compressionsCount)) - (this.gapSize * 2)) - (this.sideSide * 2);
            }
            int measuredHeight = (getMeasuredHeight() / 2) + AndroidUtilities.dp(6.0f);
            int i = 0;
            while (i < PhotoViewer.this.compressionsCount) {
                int i2 = this.sideSide;
                int i3 = this.lineSize + (this.gapSize * 2);
                int i4 = this.circleSize;
                int i5 = i2 + ((i3 + i4) * i) + (i4 / 2);
                if (i <= PhotoViewer.this.selectedCompression) {
                    this.paint.setColor(-11292945);
                } else {
                    this.paint.setColor(1728053247);
                }
                canvas.drawCircle(i5, measuredHeight, i == PhotoViewer.this.selectedCompression ? AndroidUtilities.dp(6.0f) : this.circleSize / 2, this.paint);
                if (i != 0) {
                    int i6 = ((i5 - (this.circleSize / 2)) - this.gapSize) - this.lineSize;
                    canvas.drawRect((i == PhotoViewer.this.selectedCompression + 1 ? AndroidUtilities.dpf2(2.0f) : 0.0f) + i6, measuredHeight - AndroidUtilities.dp(1.0f), (i6 + this.lineSize) - (i == PhotoViewer.this.selectedCompression ? AndroidUtilities.dpf2(2.0f) : 0.0f), AndroidUtilities.dp(2.0f) + measuredHeight, this.paint);
                }
                i++;
            }
            canvas.drawText(this.lowQualityDescription, this.sideSide, measuredHeight - AndroidUtilities.dp(16.0f), this.textPaint);
            canvas.drawText(this.hightQualityDescription, (getMeasuredWidth() - this.sideSide) - this.textPaint.measureText(this.hightQualityDescription), measuredHeight - AndroidUtilities.dp(16.0f), this.textPaint);
        }
    }

    public void updateMuteButton() {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.setMute(this.muteVideo);
        }
        if (!this.videoConvertSupported) {
            this.muteItem.setEnabled(false);
            this.muteItem.setClickable(false);
            this.muteItem.animate().alpha(0.5f).setDuration(180L).start();
            this.videoTimelineView.setMode(0);
            return;
        }
        this.muteItem.setEnabled(true);
        this.muteItem.setClickable(true);
        this.muteItem.animate().alpha(1.0f).setDuration(180L).start();
        if (this.muteVideo) {
            if (this.customTitle == null) {
                this.actionBarContainer.setSubtitle(LocaleController.getString("SoundMuted", R.string.SoundMuted));
            }
            this.muteItem.setImageResource(R.drawable.video_send_mute);
            if (this.compressItem.getTag() != null) {
                this.compressItem.setAlpha(0.5f);
                this.compressItem.setEnabled(false);
            }
            if (this.sendPhotoType == 1) {
                this.videoTimelineView.setMaxProgressDiff(9600.0f / this.videoDuration);
                this.videoTimelineView.setMode(1);
                updateVideoInfo();
            } else {
                this.videoTimelineView.setMaxProgressDiff(1.0f);
                this.videoTimelineView.setMode(0);
            }
            this.muteItem.setContentDescription(LocaleController.getString("NoSound", R.string.NoSound));
            return;
        }
        this.actionBarContainer.setSubtitle(this.currentSubtitle);
        this.muteItem.setImageResource(R.drawable.video_send_unmute);
        this.muteItem.setContentDescription(LocaleController.getString("Sound", R.string.Sound));
        if (this.compressItem.getTag() != null) {
            this.compressItem.setAlpha(1.0f);
            this.compressItem.setEnabled(true);
        }
        this.videoTimelineView.setMaxProgressDiff(1.0f);
        this.videoTimelineView.setMode(0);
    }

    public void didChangedCompressionLevel(boolean z) {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt(String.format("compress_video_%d", Integer.valueOf(this.compressionsCount)), this.selectedCompression);
        edit.commit();
        updateWidthHeightBitrateForCompression();
        updateVideoInfo();
        if (z) {
            requestVideoPreview(1);
        }
    }

    private void calculateEstimatedVideoSize(boolean z, boolean z2) {
        float f;
        if (z) {
            long j = ((float) ((z2 ? 0L : this.audioFramesSize) + this.videoFramesSize)) * (((float) this.estimatedDuration) / this.videoDuration);
            this.estimatedSize = j;
            this.estimatedSize = j + ((j / 32768) * 16);
            return;
        }
        float f2 = (float) this.originalSize;
        long j2 = this.estimatedDuration;
        long j3 = f2 * (((float) j2) / this.videoDuration);
        this.estimatedSize = j3;
        if (z2) {
            this.estimatedSize = j3 - (((float) this.audioFramesSize) * (((float) j2) / f));
        }
    }

    private boolean needEncoding() {
        EditState editState = this.editState;
        ArrayList<VideoEditedInfo.MediaEntity> arrayList = null;
        if (editState.croppedPaintPath != null) {
            ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = editState.croppedMediaEntities;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = this.editState.croppedMediaEntities;
            }
        } else {
            ArrayList<VideoEditedInfo.MediaEntity> arrayList3 = editState.mediaEntities;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                arrayList = this.editState.mediaEntities;
            }
        }
        EditState editState2 = this.editState;
        String str = editState2.croppedPaintPath;
        if (str == null) {
            str = editState2.paintPath;
        }
        if (this.isH264Video && this.videoCutStart == 0.0f && this.rotationValue == 0 && this.resultWidth == this.originalWidth && this.resultHeight == this.originalHeight) {
            EditState editState3 = this.editState;
            return (editState3.cropState == null && arrayList == null && str == null && editState3.savedFilterState == null && this.sendPhotoType != 1) ? false : true;
        }
        return true;
    }

    public void updateVideoInfo() {
        float f;
        float f2;
        int i;
        if (this.actionBar == null) {
            return;
        }
        if (this.compressionsCount == 0) {
            this.actionBarContainer.setSubtitle(null);
            return;
        }
        this.compressItem.setState(this.videoConvertSupported && this.compressionsCount > 1, this.muteVideo, Math.min(this.resultWidth, this.resultHeight));
        this.itemsLayout.requestLayout();
        this.estimatedDuration = (long) Math.ceil((this.videoTimelineView.getRightProgress() - this.videoTimelineView.getLeftProgress()) * this.videoDuration);
        this.videoCutStart = this.videoTimelineView.getLeftProgress();
        this.videoCutEnd = this.videoTimelineView.getRightProgress();
        int i2 = this.rotationValue;
        int i3 = (i2 == 90 || i2 == 270) ? this.resultHeight : this.resultWidth;
        int i4 = this.rotationValue;
        int i5 = (i4 == 90 || i4 == 270) ? this.resultWidth : this.resultHeight;
        boolean needEncoding = needEncoding();
        if (this.muteVideo) {
            if (this.sendPhotoType == 1) {
                long j = this.estimatedDuration;
                i = j <= 2000 ? 2600000 : j <= 5000 ? 2200000 : 1560000;
            } else {
                i = 921600;
            }
            long j2 = (i / 8) * (((float) this.estimatedDuration) / 1000.0f);
            this.estimatedSize = j2;
            this.estimatedSize = j2 + ((j2 / 32768) * 16);
        } else {
            calculateEstimatedVideoSize(needEncoding, this.sendPhotoType == 1);
        }
        if (this.videoCutStart == 0.0f) {
            this.startTime = -1L;
        } else {
            this.startTime = f * this.videoDuration * 1000;
        }
        if (this.videoCutEnd == 1.0f) {
            this.endTime = -1L;
        } else {
            this.endTime = f2 * this.videoDuration * 1000;
        }
        this.currentSubtitle = String.format("%s, %s", String.format("%dx%d", Integer.valueOf(i3), Integer.valueOf(i5)), String.format("%s, ~%s", AndroidUtilities.formatShortDuration((int) (this.estimatedDuration / 1000)), AndroidUtilities.formatFileSize(this.estimatedSize)));
        this.actionBar.beginDelayedTransition();
        if (this.customTitle == null) {
            this.actionBarContainer.setSubtitle(this.muteVideo ? LocaleController.getString("SoundMuted", R.string.SoundMuted) : this.currentSubtitle);
        }
    }

    public void requestVideoPreview(int i) {
        if (this.videoPreviewMessageObject != null) {
            MediaController.getInstance().cancelVideoConvert(this.videoPreviewMessageObject);
        }
        boolean z = this.requestingPreview && !this.tryStartRequestPreviewOnFinish;
        this.requestingPreview = false;
        this.loadInitialVideo = false;
        this.progressView.setVisibility(4);
        if (i == 1) {
            if (this.resultHeight == this.originalHeight && this.resultWidth == this.originalWidth) {
                this.tryStartRequestPreviewOnFinish = false;
                PhotoProgressView[] photoProgressViewArr = this.photoProgressViews;
                photoProgressViewArr[0].setProgress(0.0f, photoProgressViewArr[0].backgroundState == 0 || this.photoProgressViews[0].previousBackgroundState == 0);
                this.photoProgressViews[0].setBackgroundState(3, false, true);
                if (!z) {
                    preparePlayer(this.currentPlayingVideoFile, false, false, this.editState.savedFilterState);
                    this.videoPlayer.seekTo(this.videoTimelineView.getLeftProgress() * this.videoDuration);
                } else {
                    this.loadInitialVideo = true;
                }
            } else {
                releasePlayer(false);
                if (this.videoPreviewMessageObject == null) {
                    TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
                    tLRPC$TL_message.id = 0;
                    tLRPC$TL_message.message = "";
                    tLRPC$TL_message.media = new TLRPC$TL_messageMediaEmpty();
                    tLRPC$TL_message.action = new TLRPC$TL_messageActionEmpty();
                    tLRPC$TL_message.dialog_id = this.currentDialogId;
                    MessageObject messageObject = new MessageObject(UserConfig.selectedAccount, tLRPC$TL_message, false, false);
                    this.videoPreviewMessageObject = messageObject;
                    messageObject.messageOwner.attachPath = new File(FileLoader.getDirectory(4), "video_preview.mp4").getAbsolutePath();
                    this.videoPreviewMessageObject.videoEditedInfo = new VideoEditedInfo();
                    VideoEditedInfo videoEditedInfo = this.videoPreviewMessageObject.videoEditedInfo;
                    videoEditedInfo.rotationValue = this.rotationValue;
                    videoEditedInfo.originalWidth = this.originalWidth;
                    this.videoPreviewMessageObject.videoEditedInfo.originalHeight = this.originalHeight;
                    VideoEditedInfo videoEditedInfo2 = this.videoPreviewMessageObject.videoEditedInfo;
                    videoEditedInfo2.framerate = this.videoFramerate;
                    videoEditedInfo2.originalPath = this.currentPlayingVideoFile.getPath();
                }
                VideoEditedInfo videoEditedInfo3 = this.videoPreviewMessageObject.videoEditedInfo;
                long j = this.startTime;
                videoEditedInfo3.startTime = j;
                long j2 = this.endTime;
                videoEditedInfo3.endTime = j2;
                if (j == -1) {
                    j = 0;
                }
                if (j2 == -1) {
                    j2 = this.videoDuration * 1000.0f;
                }
                if (j2 - j > 5000000) {
                    videoEditedInfo3.endTime = j + 5000000;
                }
                videoEditedInfo3.bitrate = this.bitrate;
                this.videoPreviewMessageObject.videoEditedInfo.resultWidth = this.resultWidth;
                this.videoPreviewMessageObject.videoEditedInfo.resultHeight = this.resultHeight;
                VideoEditedInfo videoEditedInfo4 = this.videoPreviewMessageObject.videoEditedInfo;
                videoEditedInfo4.needUpdateProgress = true;
                videoEditedInfo4.originalDuration = this.videoDuration * 1000.0f;
                if (!MediaController.getInstance().scheduleVideoConvert(this.videoPreviewMessageObject, true, true)) {
                    this.tryStartRequestPreviewOnFinish = true;
                }
                this.requestingPreview = true;
                PhotoProgressView[] photoProgressViewArr2 = this.photoProgressViews;
                photoProgressViewArr2[0].setProgress(0.0f, photoProgressViewArr2[0].backgroundState == 0 || this.photoProgressViews[0].previousBackgroundState == 0);
                this.photoProgressViews[0].setBackgroundState(0, false, true);
            }
        } else {
            this.tryStartRequestPreviewOnFinish = false;
            this.photoProgressViews[0].setBackgroundState(3, false, true);
            if (i == 2) {
                preparePlayer(this.currentPlayingVideoFile, false, false, this.editState.savedFilterState);
                this.videoPlayer.seekTo(this.videoTimelineView.getLeftProgress() * this.videoDuration);
            }
        }
        this.containerView.invalidate();
    }

    private Size calculateResultVideoSize() {
        int round;
        int i;
        if (this.compressionsCount == 1) {
            return new Size(this.originalWidth, this.originalHeight);
        }
        int i2 = this.selectedCompression;
        float f = (i2 != 0 ? i2 != 1 ? i2 != 2 ? 1920.0f : 1280.0f : 854.0f : 480.0f) / (this.originalWidth > this.originalHeight ? this.originalWidth : this.originalHeight);
        if (this.selectedCompression == this.compressionsCount - 1 && f >= 1.0f) {
            i = this.originalWidth;
            round = this.originalHeight;
        } else {
            int round2 = Math.round((this.originalWidth * f) / 2.0f) * 2;
            round = Math.round((this.originalHeight * f) / 2.0f) * 2;
            i = round2;
        }
        return new Size(i, round);
    }

    public void prepareRealEncoderBitrate() {
        if (this.bitrate == 0 || this.sendPhotoType == 1) {
            return;
        }
        Size calculateResultVideoSize = calculateResultVideoSize();
        if (calculateResultVideoSize.getWidth() == this.originalWidth && calculateResultVideoSize.getHeight() == this.originalHeight) {
            MediaController.extractRealEncoderBitrate(calculateResultVideoSize.getWidth(), calculateResultVideoSize.getHeight(), this.originalBitrate, false);
            return;
        }
        MediaController.extractRealEncoderBitrate(calculateResultVideoSize.getWidth(), calculateResultVideoSize.getHeight(), MediaController.makeVideoBitrate(this.originalHeight, this.originalWidth, this.originalBitrate, calculateResultVideoSize.getHeight(), calculateResultVideoSize.getWidth()), false);
    }

    public void updateWidthHeightBitrateForCompression() {
        int extractRealEncoderBitrate;
        if (this.compressionsCount <= 0) {
            return;
        }
        if (this.selectedCompression >= this.compressionsCount) {
            this.selectedCompression = this.compressionsCount - 1;
        }
        if (this.sendPhotoType == 1) {
            float max = Math.max(800.0f / this.originalWidth, 800.0f / this.originalHeight);
            this.resultWidth = Math.round((this.originalWidth * max) / 2.0f) * 2;
            this.resultHeight = Math.round((this.originalHeight * max) / 2.0f) * 2;
        } else {
            Size calculateResultVideoSize = calculateResultVideoSize();
            this.resultWidth = calculateResultVideoSize.getWidth();
            this.resultHeight = calculateResultVideoSize.getHeight();
        }
        if (this.bitrate != 0) {
            if (this.sendPhotoType == 1) {
                this.bitrate = 1560000;
                extractRealEncoderBitrate = this.bitrate;
            } else if (this.resultWidth == this.originalWidth && this.resultHeight == this.originalHeight) {
                this.bitrate = this.originalBitrate;
                extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(this.resultWidth, this.resultHeight, this.bitrate, false);
            } else {
                this.bitrate = MediaController.makeVideoBitrate(this.originalHeight, this.originalWidth, this.originalBitrate, this.resultHeight, this.resultWidth);
                extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(this.resultWidth, this.resultHeight, this.bitrate, false);
            }
            this.videoFramesSize = ((extractRealEncoderBitrate / 8) * this.videoDuration) / 1000.0f;
        }
    }

    private void showQualityView(final boolean z) {
        TextureView textureView;
        if (z && this.textureUploaded && this.videoSizeSet && !this.changingTextureView && (textureView = this.videoTextureView) != null) {
            this.videoFrameBitmap = textureView.getBitmap();
        }
        if (z) {
            this.previousCompression = this.selectedCompression;
        }
        AnimatorSet animatorSet = this.qualityChooseViewAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.qualityChooseViewAnimation = new AnimatorSet();
        if (z) {
            if (this.fancyShadows) {
                this.navigationBar.setVisibility(0);
                this.navigationBar.setAlpha(this.sendPhotoType == 11 ? 1.0f : 0.0f);
                this.navigationBar.setBackgroundColor(this.sendPhotoType == 11 ? 1711276032 : 2130706432);
            }
            this.qualityChooseView.setTag(1);
            AnimatorSet animatorSet2 = this.qualityChooseViewAnimation;
            Animator[] animatorArr = new Animator[4];
            FrameLayout frameLayout = this.pickerView;
            Property property = View.TRANSLATION_Y;
            float[] fArr = new float[2];
            fArr[0] = 0.0f;
            fArr[1] = frameLayout.getHeight() + this.captionEdit.getEditTextHeight() + (this.isCurrentVideo ? AndroidUtilities.dp(58.0f) : 0);
            animatorArr[0] = ObjectAnimator.ofFloat(frameLayout, property, fArr);
            animatorArr[1] = ObjectAnimator.ofFloat(this.pickerView, View.ALPHA, 0.0f);
            animatorArr[2] = ObjectAnimator.ofFloat(this.pickerViewSendButton, View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(158.0f));
            View view = this.navigationBar;
            Property property2 = View.ALPHA;
            float[] fArr2 = new float[2];
            fArr2[0] = this.fancyShadows ? 0.0f : 1.0f;
            fArr2[1] = 1.0f;
            animatorArr[3] = ObjectAnimator.ofFloat(view, property2, fArr2);
            animatorSet2.playTogether(animatorArr);
        } else {
            this.qualityChooseView.setTag(null);
            AnimatorSet animatorSet3 = this.qualityChooseViewAnimation;
            Animator[] animatorArr2 = new Animator[3];
            animatorArr2[0] = ObjectAnimator.ofFloat(this.qualityChooseView, View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(166.0f));
            animatorArr2[1] = ObjectAnimator.ofFloat(this.qualityPicker, View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(166.0f));
            View view2 = this.navigationBar;
            Property property3 = View.ALPHA;
            float[] fArr3 = new float[2];
            fArr3[0] = 1.0f;
            fArr3[1] = this.fancyShadows ? 0.0f : 1.0f;
            animatorArr2[2] = ObjectAnimator.ofFloat(view2, property3, fArr3);
            animatorSet3.playTogether(animatorArr2);
        }
        this.qualityChooseViewAnimation.addListener(new AnimatorListenerAdapter() {
            {
                PhotoViewer.this = this;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (animator.equals(PhotoViewer.this.qualityChooseViewAnimation)) {
                    PhotoViewer.this.qualityChooseViewAnimation = new AnimatorSet();
                    if (z) {
                        PhotoViewer.this.qualityChooseView.setVisibility(0);
                        PhotoViewer.this.qualityPicker.setVisibility(0);
                        PhotoViewer.this.qualityChooseViewAnimation.playTogether(ObjectAnimator.ofFloat(PhotoViewer.this.qualityChooseView, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(PhotoViewer.this.qualityPicker, View.TRANSLATION_Y, 0.0f));
                    } else {
                        if (PhotoViewer.this.fancyShadows) {
                            PhotoViewer.this.navigationBar.setVisibility(8);
                            PhotoViewer.this.navigationBar.setAlpha(0.0f);
                            PhotoViewer.this.navigationBar.setBackgroundColor(PhotoViewer.this.sendPhotoType == 11 ? -16777216 : 2130706432);
                        }
                        PhotoViewer.this.qualityChooseView.setVisibility(4);
                        PhotoViewer.this.qualityPicker.setVisibility(4);
                        PhotoViewer.this.qualityChooseViewAnimation.playTogether(ObjectAnimator.ofFloat(PhotoViewer.this.pickerView, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(PhotoViewer.this.pickerView, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(PhotoViewer.this.pickerViewSendButton, View.TRANSLATION_Y, 0.0f));
                    }
                    PhotoViewer.this.qualityChooseViewAnimation.addListener(new AnimatorListenerAdapter() {
                        {
                            AnonymousClass79.this = this;
                        }

                        @Override
                        public void onAnimationEnd(Animator animator2) {
                            if (animator2.equals(PhotoViewer.this.qualityChooseViewAnimation)) {
                                PhotoViewer.this.qualityChooseViewAnimation = null;
                            }
                        }
                    });
                    PhotoViewer.this.qualityChooseViewAnimation.setDuration(200L);
                    PhotoViewer.this.qualityChooseViewAnimation.setInterpolator(AndroidUtilities.decelerateInterpolator);
                    PhotoViewer.this.qualityChooseViewAnimation.start();
                }
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                PhotoViewer.this.qualityChooseViewAnimation = null;
            }
        });
        this.qualityChooseViewAnimation.setDuration(200L);
        this.qualityChooseViewAnimation.setInterpolator(AndroidUtilities.accelerateInterpolator);
        this.qualityChooseViewAnimation.start();
        if (this.muteItem.getVisibility() == 0) {
            this.muteItem.animate().scaleX(z ? 0.25f : 1.0f).scaleY(z ? 0.25f : 1.0f).alpha(z ? 0.0f : 1.0f).setDuration(200L);
        }
    }

    private void processOpenVideo(String str, boolean z, float f, float f2, int i) {
        if (this.currentLoadingVideoRunnable != null) {
            Utilities.globalQueue.cancelRunnable(this.currentLoadingVideoRunnable);
            this.currentLoadingVideoRunnable = null;
        }
        this.videoTimelineView.setVideoPath(str, f, f2);
        this.videoPreviewMessageObject = null;
        boolean z2 = true;
        if (!z && this.sendPhotoType != 1) {
            z2 = false;
        }
        this.muteVideo = z2;
        this.compressionsCount = -1;
        this.rotationValue = 0;
        this.videoFramerate = 25;
        this.originalSize = new File(str).length();
        DispatchQueue dispatchQueue = Utilities.globalQueue;
        AnonymousClass80 anonymousClass80 = new AnonymousClass80(str, i);
        this.currentLoadingVideoRunnable = anonymousClass80;
        dispatchQueue.postRunnable(anonymousClass80);
    }

    public class AnonymousClass80 implements Runnable {
        final int val$compressQuality;
        final String val$videoPath;

        AnonymousClass80(String str, int i) {
            PhotoViewer.this = r1;
            this.val$videoPath = str;
            this.val$compressQuality = i;
        }

        @Override
        public void run() {
            if (PhotoViewer.this.currentLoadingVideoRunnable != this) {
                return;
            }
            int videoBitrate = MediaController.getVideoBitrate(this.val$videoPath);
            final int[] iArr = new int[11];
            AnimatedFileDrawable.getVideoInfo(this.val$videoPath, iArr);
            boolean z = false;
            boolean z2 = iArr[10] != 0;
            PhotoViewer photoViewer = PhotoViewer.this;
            if (iArr[0] != 0 && (!z2 || iArr[9] != 0)) {
                z = true;
            }
            photoViewer.videoConvertSupported = z;
            PhotoViewer photoViewer2 = PhotoViewer.this;
            if (videoBitrate == -1) {
                videoBitrate = iArr[3];
            }
            photoViewer2.originalBitrate = photoViewer2.bitrate = videoBitrate;
            if (PhotoViewer.this.videoConvertSupported) {
                PhotoViewer photoViewer3 = PhotoViewer.this;
                photoViewer3.resultWidth = photoViewer3.originalWidth = iArr[1];
                PhotoViewer photoViewer4 = PhotoViewer.this;
                photoViewer4.resultHeight = photoViewer4.originalHeight = iArr[2];
                PhotoViewer photoViewer5 = PhotoViewer.this;
                photoViewer5.updateCompressionsCount(photoViewer5.originalWidth, PhotoViewer.this.originalHeight);
                PhotoViewer photoViewer6 = PhotoViewer.this;
                int i = this.val$compressQuality;
                if (i == -1) {
                    i = photoViewer6.selectCompression();
                }
                photoViewer6.selectedCompression = i;
                PhotoViewer.this.prepareRealEncoderBitrate();
                PhotoViewer.this.isH264Video = MediaController.isH264Video(this.val$videoPath);
            }
            if (PhotoViewer.this.currentLoadingVideoRunnable != this) {
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.AnonymousClass80.this.lambda$run$0(this, iArr);
                }
            });
        }

        public void lambda$run$0(Runnable runnable, int[] iArr) {
            if (PhotoViewer.this.parentActivity == null || runnable != PhotoViewer.this.currentLoadingVideoRunnable) {
                return;
            }
            PhotoViewer.this.currentLoadingVideoRunnable = null;
            PhotoViewer.this.audioFramesSize = iArr[5];
            PhotoViewer.this.videoDuration = iArr[4];
            PhotoViewer.this.videoFramerate = iArr[7];
            PhotoViewer photoViewer = PhotoViewer.this;
            photoViewer.videoFramesSize = ((photoViewer.bitrate / 8) * PhotoViewer.this.videoDuration) / 1000.0f;
            if (PhotoViewer.this.videoConvertSupported) {
                PhotoViewer.this.rotationValue = iArr[8];
                PhotoViewer.this.updateWidthHeightBitrateForCompression();
                if (PhotoViewer.this.selectedCompression > PhotoViewer.this.compressionsCount - 1) {
                    PhotoViewer photoViewer2 = PhotoViewer.this;
                    photoViewer2.selectedCompression = photoViewer2.compressionsCount - 1;
                }
                PhotoViewer.this.compressItem.setState(PhotoViewer.this.compressionsCount > 1, PhotoViewer.this.muteVideo, Math.min(PhotoViewer.this.resultWidth, PhotoViewer.this.resultHeight));
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("compressionsCount = " + PhotoViewer.this.compressionsCount + " w = " + PhotoViewer.this.originalWidth + " h = " + PhotoViewer.this.originalHeight + " r = " + PhotoViewer.this.rotationValue);
                }
                PhotoViewer.this.qualityChooseView.invalidate();
            } else {
                PhotoViewer.this.compressItem.setState(false, PhotoViewer.this.muteVideo, Math.min(PhotoViewer.this.resultWidth, PhotoViewer.this.resultHeight));
                PhotoViewer.this.compressionsCount = 0;
            }
            PhotoViewer.this.updateVideoInfo();
            PhotoViewer.this.updateMuteButton();
        }
    }

    public int selectCompression() {
        if (this.originalSize > 1048576000) {
            return this.compressionsCount - 1;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        int i = this.compressionsCount;
        while (i < 5) {
            int i2 = globalMainSettings.getInt(String.format(Locale.US, "compress_video_%d", Integer.valueOf(i)), -1);
            if (i2 >= 0) {
                return Math.min(i2, 2);
            }
            i++;
        }
        return Math.min(2, Math.round(DownloadController.getInstance(this.currentAccount).getMaxVideoBitrate() / (100.0f / i)) - 1);
    }

    public void updateCompressionsCount(int i, int i2) {
        int max = Math.max(i, i2);
        if (max > 1280) {
            this.compressionsCount = 4;
        } else if (max > 854) {
            this.compressionsCount = 3;
        } else if (max > 640) {
            this.compressionsCount = 2;
        } else {
            this.compressionsCount = 1;
        }
    }

    public void updateAccessibilityOverlayVisibility() {
        if (this.playButtonAccessibilityOverlay != null) {
            int i = this.photoProgressViews[0].backgroundState;
            if (this.photoProgressViews[0].isVisible() && (i == 3 || i == 4 || i == 2 || i == 1)) {
                if (i == 3) {
                    this.playButtonAccessibilityOverlay.setContentDescription(LocaleController.getString("AccActionPlay", R.string.AccActionPlay));
                } else if (i == 2) {
                    this.playButtonAccessibilityOverlay.setContentDescription(LocaleController.getString("AccActionDownload", R.string.AccActionDownload));
                } else if (i == 1) {
                    this.playButtonAccessibilityOverlay.setContentDescription(LocaleController.getString("AccActionCancelDownload", R.string.AccActionCancelDownload));
                } else {
                    this.playButtonAccessibilityOverlay.setContentDescription(LocaleController.getString("AccActionPause", R.string.AccActionPause));
                }
                this.playButtonAccessibilityOverlay.setVisibility(0);
                return;
            }
            this.playButtonAccessibilityOverlay.setVisibility(4);
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        @Override
        public int getItemViewType(int i) {
            return 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        public ListAdapter(Context context) {
            PhotoViewer.this = r1;
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            if (PhotoViewer.this.placeProvider == null || PhotoViewer.this.placeProvider.getSelectedPhotosOrder() == null) {
                return 0;
            }
            return PhotoViewer.this.placeProvider.getSelectedPhotosOrder().size();
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            PhotoPickerPhotoCell photoPickerPhotoCell = new PhotoPickerPhotoCell(this.mContext);
            photoPickerPhotoCell.checkFrame.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PhotoViewer.ListAdapter.this.lambda$onCreateViewHolder$0(view);
                }
            });
            return new RecyclerListView.Holder(photoPickerPhotoCell);
        }

        public void lambda$onCreateViewHolder$0(View view) {
            Object tag = ((View) view.getParent()).getTag();
            int indexOf = PhotoViewer.this.imagesArrLocals.indexOf(tag);
            if (indexOf >= 0) {
                int photoChecked = PhotoViewer.this.placeProvider.setPhotoChecked(indexOf, PhotoViewer.this.getCurrentVideoEditedInfo());
                boolean isPhotoChecked = PhotoViewer.this.placeProvider.isPhotoChecked(indexOf);
                if (indexOf == PhotoViewer.this.currentIndex) {
                    PhotoViewer.this.checkImageView.setChecked(-1, isPhotoChecked, true);
                }
                if (photoChecked >= 0) {
                    PhotoViewer.this.selectedPhotosAdapter.notifyItemRemoved(photoChecked);
                    if (photoChecked == 0) {
                        PhotoViewer.this.selectedPhotosAdapter.notifyItemChanged(0);
                    }
                }
                PhotoViewer.this.updateSelectedCount();
                return;
            }
            int photoUnchecked = PhotoViewer.this.placeProvider.setPhotoUnchecked(tag);
            if (photoUnchecked >= 0) {
                PhotoViewer.this.selectedPhotosAdapter.notifyItemRemoved(photoUnchecked);
                if (photoUnchecked == 0) {
                    PhotoViewer.this.selectedPhotosAdapter.notifyItemChanged(0);
                }
                PhotoViewer.this.updateSelectedCount();
            }
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            PhotoPickerPhotoCell photoPickerPhotoCell = (PhotoPickerPhotoCell) viewHolder.itemView;
            photoPickerPhotoCell.setItemWidth(AndroidUtilities.dp(85.0f), i != 0 ? AndroidUtilities.dp(6.0f) : 0);
            BackupImageView backupImageView = photoPickerPhotoCell.imageView;
            backupImageView.setOrientation(0, true);
            Object obj = PhotoViewer.this.placeProvider.getSelectedPhotos().get(PhotoViewer.this.placeProvider.getSelectedPhotosOrder().get(i));
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                photoPickerPhotoCell.setTag(photoEntry);
                photoPickerPhotoCell.videoInfoContainer.setVisibility(4);
                String str = photoEntry.thumbPath;
                if (str != null) {
                    backupImageView.setImage(str, null, this.mContext.getResources().getDrawable(R.drawable.nophotos));
                } else if (photoEntry.path != null) {
                    backupImageView.setOrientation(photoEntry.orientation, photoEntry.invert, true);
                    if (photoEntry.isVideo) {
                        photoPickerPhotoCell.videoInfoContainer.setVisibility(0);
                        photoPickerPhotoCell.videoTextView.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                        backupImageView.setImage("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, this.mContext.getResources().getDrawable(R.drawable.nophotos));
                    } else {
                        backupImageView.setImage("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, this.mContext.getResources().getDrawable(R.drawable.nophotos));
                    }
                } else {
                    backupImageView.setImageResource(R.drawable.nophotos);
                }
                photoPickerPhotoCell.setChecked(-1, true, false);
                photoPickerPhotoCell.checkBox.setVisibility(0);
            } else if (obj instanceof MediaController.SearchImage) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                photoPickerPhotoCell.setTag(searchImage);
                photoPickerPhotoCell.setImage(searchImage);
                photoPickerPhotoCell.videoInfoContainer.setVisibility(4);
                photoPickerPhotoCell.setChecked(-1, true, false);
                photoPickerPhotoCell.checkBox.setVisibility(0);
            }
        }
    }

    public class FirstFrameView extends ImageView {
        private VideoPlayer currentVideoPlayer;
        private ValueAnimator fadeAnimator;
        private final TimeInterpolator fadeInterpolator;
        private boolean gettingFrame;
        private int gettingFrameIndex;
        private boolean gotError;
        private boolean hasFrame;

        public FirstFrameView(Context context) {
            super(context);
            PhotoViewer.this = r1;
            this.gettingFrameIndex = 0;
            this.gettingFrame = false;
            this.hasFrame = false;
            this.gotError = false;
            this.fadeInterpolator = CubicBezierInterpolator.EASE_IN;
            setAlpha(0.0f);
        }

        public void clear() {
            this.hasFrame = false;
            this.gotError = false;
            if (this.gettingFrame) {
                this.gettingFrameIndex++;
                this.gettingFrame = false;
            }
            setImageResource(17170445);
        }

        public void checkFromPlayer(VideoPlayer videoPlayer) {
            if (this.currentVideoPlayer != videoPlayer) {
                this.gotError = false;
                clear();
            }
            if (videoPlayer != null && !videoPlayer.isHDR()) {
                long duration = videoPlayer.getDuration() - videoPlayer.getCurrentPosition();
                if (!this.hasFrame && !this.gotError && !this.gettingFrame && ((float) duration) < 5250.0f) {
                    final Uri currentUri = videoPlayer.getCurrentUri();
                    final int i = this.gettingFrameIndex + 1;
                    this.gettingFrameIndex = i;
                    Utilities.globalQueue.postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            PhotoViewer.FirstFrameView.this.lambda$checkFromPlayer$2(currentUri, i);
                        }
                    });
                    this.gettingFrame = true;
                }
            }
            this.currentVideoPlayer = videoPlayer;
        }

        public void lambda$checkFromPlayer$2(Uri uri, final int i) {
            try {
                File file = new File(uri.getPath());
                int i2 = UserConfig.selectedAccount;
                Point point = AndroidUtilities.displaySize;
                AnimatedFileDrawable animatedFileDrawable = new AnimatedFileDrawable(file, true, 0L, 0, null, null, null, 0L, i2, false, point.x, point.y, null);
                final Bitmap frameAtTime = animatedFileDrawable.getFrameAtTime(0L);
                animatedFileDrawable.recycle();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PhotoViewer.FirstFrameView.this.lambda$checkFromPlayer$0(i, frameAtTime);
                    }
                });
            } catch (Throwable th) {
                FileLog.e(th);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PhotoViewer.FirstFrameView.this.lambda$checkFromPlayer$1();
                    }
                });
            }
        }

        public void lambda$checkFromPlayer$0(int i, Bitmap bitmap) {
            if (i == this.gettingFrameIndex) {
                setImageBitmap(bitmap);
                this.hasFrame = true;
                this.gettingFrame = false;
            }
        }

        public void lambda$checkFromPlayer$1() {
            this.gotError = true;
        }

        public void updateAlpha() {
            if (PhotoViewer.this.videoPlayer != null && PhotoViewer.this.videoPlayer.getDuration() != -9223372036854775807L) {
                long max = Math.max(0L, PhotoViewer.this.videoPlayer.getDuration() - PhotoViewer.this.videoPlayer.getCurrentPosition());
                float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
                if (max2 > 0.0f) {
                    if (PhotoViewer.this.videoPlayer.isPlaying()) {
                        if (this.fadeAnimator == null) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                            this.fadeAnimator = ofFloat;
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    PhotoViewer.FirstFrameView.this.lambda$updateAlpha$3(valueAnimator);
                                }
                            });
                            this.fadeAnimator.setDuration(max);
                            this.fadeAnimator.setInterpolator(this.fadeInterpolator);
                            this.fadeAnimator.start();
                            setAlpha(max2);
                            return;
                        }
                        return;
                    }
                    ValueAnimator valueAnimator = this.fadeAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.fadeAnimator = null;
                    }
                    setAlpha(max2);
                    return;
                }
                ValueAnimator valueAnimator2 = this.fadeAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.fadeAnimator = null;
                }
                setAlpha(0.0f);
                return;
            }
            ValueAnimator valueAnimator3 = this.fadeAnimator;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                this.fadeAnimator = null;
            }
            setAlpha(0.0f);
        }

        public void lambda$updateAlpha$3(ValueAnimator valueAnimator) {
            setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public int getThemedColor(int i) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            return resourcesProvider.getColor(i);
        }
        return Theme.getColor(i);
    }

    public static boolean BLUR_RENDERNODE() {
        return Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur && SharedConfig.getDevicePerformanceClass() >= 2;
    }

    public void drawCaptionBlur(android.graphics.Canvas r44, org.telegram.ui.Components.BlurringShader.StoryBlurDrawer r45, int r46, int r47, boolean r48, boolean r49, boolean r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.drawCaptionBlur(android.graphics.Canvas, org.telegram.ui.Components.BlurringShader$StoryBlurDrawer, int, int, boolean, boolean, boolean):void");
    }

    private void cancelStickerClippingMode() {
        if (this.sendPhotoType == 11 && this.cutOutBtn.isCancelState()) {
            this.cutOutBtn.setCutOutState(true);
            showEditStickerMode(true, true);
            this.stickerMakerView.disableClippingMode();
            this.containerView.invalidate();
        }
    }

    public void invalidateBlur() {
        StickerMakerView stickerMakerView = this.stickerMakerView;
        if (stickerMakerView == null || !stickerMakerView.isThanosInProgress) {
            CaptionPhotoViewer captionPhotoViewer = this.captionEdit;
            if (captionPhotoViewer != null) {
                captionPhotoViewer.invalidateBlur();
            }
            BlurButton blurButton = this.cutOutBtn;
            if (blurButton != null) {
                blurButton.invalidateBlur();
            }
            BlurButton blurButton2 = this.eraseBtn;
            if (blurButton2 != null) {
                blurButton2.invalidateBlur();
            }
            BlurButton blurButton3 = this.restoreBtn;
            if (blurButton3 != null) {
                blurButton3.invalidateBlur();
            }
            BlurButton blurButton4 = this.undoBtn;
            if (blurButton4 != null) {
                blurButton4.invalidateBlur();
            }
            BlurButton blurButton5 = this.outlineBtn;
            if (blurButton5 != null) {
                blurButton5.invalidateBlur();
            }
            VideoTimelinePlayView videoTimelinePlayView = this.videoTimelineView;
            if (videoTimelinePlayView != null) {
                videoTimelinePlayView.invalidateBlur();
            }
            FrameLayoutDrawer frameLayoutDrawer = this.containerView;
            if (frameLayoutDrawer != null) {
                frameLayoutDrawer.invalidate();
            }
        }
    }

    public class BlurButton extends StickerCutOutBtn {
        private boolean active;
        private final AnimatedFloat activeFloat;
        private final Path path;

        public BlurButton() {
            super(r8.stickerMakerView, r8.activityContext, r8.resourcesProvider, r8.blurManager);
            PhotoViewer.this = r8;
            this.path = new Path();
            this.activeFloat = new AnimatedFloat(this, 0L, 420L, CubicBezierInterpolator.EASE_OUT_QUINT);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.save();
            this.path.rewind();
            this.path.addRoundRect(this.bounds, AndroidUtilities.dp(this.rad), AndroidUtilities.dp(this.rad), Path.Direction.CW);
            canvas.clipPath(this.path);
            canvas.translate(-getX(), -getY());
            if (this == PhotoViewer.this.eraseBtn || this == PhotoViewer.this.restoreBtn) {
                canvas.translate(-PhotoViewer.this.btnLayout.getX(), -PhotoViewer.this.btnLayout.getY());
            }
            PhotoViewer.this.drawCaptionBlur(canvas, this.blurDrawer, -13948117, AndroidUtilities.DARK_STATUS_BAR_OVERLAY, false, true, false);
            float f = this.activeFloat.set(this.active);
            if (f > 0.0f) {
                canvas.drawColor(Theme.multAlpha(-1, f));
            }
            setTextColor(ColorUtils.blendARGB(-1, -16777216, f));
            canvas.restore();
            super.onDraw(canvas);
        }

        @Override
        public void onDrawForeground(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.path);
            super.onDrawForeground(canvas);
            canvas.restore();
        }

        public void setActive(boolean z, boolean z2) {
            this.active = z;
            if (!z2) {
                this.activeFloat.set(z, true);
            }
            invalidate();
        }

        public boolean isActive() {
            return this.active;
        }
    }

    private void applyTransformToOutline(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        if (this.imageMoveAnimation != null) {
            f2 = AndroidUtilities.lerp(this.mirror, this.animateToMirror, this.animationValue);
            f = AndroidUtilities.lerp(this.scale, this.animateToScale, this.animationValue);
            f3 = AndroidUtilities.lerp(this.rotate, this.animateToRotate, this.animationValue);
            f4 = AndroidUtilities.lerp(this.translationY, this.animateToY, this.animationValue);
            f5 = AndroidUtilities.lerp(this.translationX, this.animateToX, this.animationValue);
        } else {
            f = this.scale;
            f2 = this.mirror;
            f3 = this.rotate;
            f4 = this.translationY;
            f5 = this.translationX;
            if (this.animationStartTime != 0) {
                f5 = this.animateToX;
                f4 = this.animateToY;
                f = this.animateToScale;
            }
        }
        int containerViewWidth = getContainerViewWidth();
        int containerViewHeight = getContainerViewHeight();
        canvas.translate(getAdditionX(this.currentEditMode), getAdditionY(this.currentEditMode));
        canvas.translate(f5, f4 + (this.currentEditMode != 3 ? this.currentPanTranslationY : 0.0f));
        canvas.scale(f, f);
        canvas.rotate(f3);
        int bitmapWidth = this.centerImage.getBitmapWidth();
        int bitmapHeight = this.centerImage.getBitmapHeight();
        float f8 = containerViewWidth;
        float f9 = bitmapWidth;
        float f10 = f8 / f9;
        float f11 = containerViewHeight;
        float f12 = bitmapHeight;
        float f13 = f11 / f12;
        float min = Math.min(f10, f13);
        int orientation = this.cropTransform.getOrientation();
        if (orientation == 90 || orientation == 270) {
            bitmapHeight = bitmapWidth;
            bitmapWidth = bitmapHeight;
        }
        float cropPw = this.cropTransform.getCropPw();
        float cropPh = this.cropTransform.getCropPh();
        float f14 = bitmapWidth;
        float f15 = bitmapHeight;
        float f16 = (int) ((cropPw + ((1.0f - cropPw) * 0.0f)) * f14);
        float f17 = f8 / f16;
        float f18 = (int) ((cropPh + ((1.0f - cropPh) * 0.0f)) * f15);
        if (f17 * f18 > f11) {
            f17 = f11 / f18;
        }
        float f19 = f2;
        boolean z = true;
        if (this.sendPhotoType != 1 && ((this.currentEditMode != 1 || this.switchingToMode == 0) && this.editState.cropState != null)) {
            float f20 = f16 * f17;
            float f21 = f18 * f17;
            if (f10 * f12 > f11) {
                f10 = f13;
            }
            float f22 = f20 + ((((f9 * f10) / f) - f20) * 0.0f);
            float f23 = f21 + ((((f12 * f10) / f) - f21) * 0.0f);
            canvas.clipRect((-f22) / 2.0f, (-f23) / 2.0f, f22 / 2.0f, f23 / 2.0f);
        }
        if (this.sendPhotoType == 1 || this.cropTransform.hasViewTransform()) {
            TextureView textureView = this.videoTextureView;
            if (textureView != null) {
                MediaController.CropState cropState = this.editState.cropState;
                textureView.setScaleX((cropState == null || !cropState.mirrored) ? 1.0f : -1.0f);
                FirstFrameView firstFrameView = this.firstFrameView;
                if (firstFrameView != null) {
                    firstFrameView.setScaleX(this.videoTextureView.getScaleX());
                }
            }
            MediaController.CropState cropState2 = this.editState.cropState;
            if (cropState2 != null) {
                f7 = cropState2.cropScale;
                f6 = 1.0f;
            } else {
                f6 = 1.0f;
                f7 = 1.0f;
            }
            float f24 = ((f17 / min) / (((f7 - f6) * 0.0f) + f6)) * f7;
            canvas.translate(this.cropTransform.getCropAreaX() * f6, this.cropTransform.getCropAreaY() * f6);
            canvas.scale(f24, f24);
            canvas.translate(this.cropTransform.getCropPx() * f14 * min * f6, this.cropTransform.getCropPy() * f15 * min * f6);
            float rotation = this.cropTransform.getRotation() + orientation;
            if (rotation > 180.0f) {
                rotation -= 360.0f;
            }
            canvas.rotate(rotation);
        }
        boolean z2 = false;
        if (!this.imagesArrLocals.isEmpty()) {
            MediaController.CropState cropState3 = this.editState.cropState;
            z2 = (cropState3 == null || !cropState3.mirrored) ? false : false;
        }
        if (z2) {
            canvas.scale(-1.0f, 1.0f);
        }
        if (f19 > 0.0f) {
            canvas.scale(1.0f - (f19 * 2.0f), 1.0f);
            canvas.skew(0.0f, 4.0f * f19 * (1.0f - f19) * 0.25f);
        }
    }

    private void applyTransformToMatrix(Matrix matrix) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (this.imageMoveAnimation != null) {
            f2 = AndroidUtilities.lerp(this.mirror, this.animateToMirror, this.animationValue);
            f = AndroidUtilities.lerp(this.scale, this.animateToScale, this.animationValue);
            f3 = AndroidUtilities.lerp(this.rotate, this.animateToRotate, this.animationValue);
            f4 = AndroidUtilities.lerp(this.translationY, this.animateToY, this.animationValue);
            f5 = AndroidUtilities.lerp(this.translationX, this.animateToX, this.animationValue);
        } else {
            f = this.scale;
            f2 = this.mirror;
            f3 = this.rotate;
            f4 = this.translationY;
            f5 = this.translationX;
            if (this.animationStartTime != 0) {
                f5 = this.animateToX;
                f4 = this.animateToY;
                f = this.animateToScale;
            }
        }
        int containerViewWidth = getContainerViewWidth();
        int containerViewHeight = getContainerViewHeight();
        matrix.preTranslate(f5, f4 + (this.currentEditMode != 3 ? this.currentPanTranslationY : 0.0f));
        matrix.preScale(f, f);
        matrix.preRotate(f3);
        int bitmapWidth = this.centerImage.getBitmapWidth();
        int bitmapHeight = this.centerImage.getBitmapHeight();
        float f6 = containerViewWidth;
        float f7 = containerViewHeight;
        float min = Math.min(f6 / bitmapWidth, f7 / bitmapHeight);
        int orientation = this.cropTransform.getOrientation();
        if (orientation == 90 || orientation == 270) {
            bitmapHeight = bitmapWidth;
            bitmapWidth = bitmapHeight;
        }
        float cropPw = this.cropTransform.getCropPw();
        float cropPh = this.cropTransform.getCropPh();
        float f8 = bitmapWidth;
        float f9 = bitmapHeight;
        float f10 = f6 / ((int) ((cropPw + ((1.0f - cropPw) * 0.0f)) * f8));
        float f11 = (int) ((cropPh + ((1.0f - cropPh) * 0.0f)) * f9);
        if (f10 * f11 > f7) {
            f10 = f7 / f11;
        }
        boolean z = true;
        if (this.sendPhotoType == 1 || this.cropTransform.hasViewTransform()) {
            TextureView textureView = this.videoTextureView;
            if (textureView != null) {
                MediaController.CropState cropState = this.editState.cropState;
                textureView.setScaleX((cropState == null || !cropState.mirrored) ? 1.0f : -1.0f);
                FirstFrameView firstFrameView = this.firstFrameView;
                if (firstFrameView != null) {
                    firstFrameView.setScaleX(this.videoTextureView.getScaleX());
                }
            }
            MediaController.CropState cropState2 = this.editState.cropState;
            float f12 = cropState2 != null ? cropState2.cropScale : 1.0f;
            float f13 = f12 * ((f10 / min) / (((f12 - 1.0f) * 0.0f) + 1.0f));
            matrix.preTranslate(this.cropTransform.getCropAreaX() * 1.0f, this.cropTransform.getCropAreaY() * 1.0f);
            matrix.preScale(f13, f13);
            matrix.preTranslate(this.cropTransform.getCropPx() * f8 * min * 1.0f, this.cropTransform.getCropPy() * f9 * min * 1.0f);
            float rotation = this.cropTransform.getRotation() + orientation;
            if (rotation > 180.0f) {
                rotation -= 360.0f;
            }
            matrix.preRotate(rotation);
        }
        boolean z2 = false;
        if (!this.imagesArrLocals.isEmpty()) {
            MediaController.CropState cropState3 = this.editState.cropState;
            z2 = (cropState3 == null || !cropState3.mirrored) ? false : false;
        }
        if (z2) {
            matrix.preScale(-1.0f, 1.0f);
        }
        if (f2 > 0.0f) {
            matrix.preScale(1.0f - (2.0f * f2), 1.0f);
            matrix.preSkew(0.0f, 4.0f * f2 * (1.0f - f2) * 0.25f);
        }
    }
}
