package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
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
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.LineHeightSpan;
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
import android.util.Range;
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
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
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
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.FaceDetector;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import me.vkryl.core.reference.ReferenceList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline2;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline9;
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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.camera.Size;
import org.telegram.messenger.chromecast.ChromecastController;
import org.telegram.messenger.pip.PipSource;
import org.telegram.messenger.pip.source.IPipSourceDelegate;
import org.telegram.messenger.pip.source.PipSourceSnapshot$$ExternalSyntheticApiModelOutline0;
import org.telegram.messenger.pip.utils.PipUtils;
import org.telegram.messenger.utils.WindowVisibilityManager;
import org.telegram.messenger.video.OldVideoPlayerRewinder;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.video.VideoPlayerRewinder;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSlider;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.PhotoPickerPhotoCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChooseDownloadQualityLayout;
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
import org.telegram.ui.Components.CastMediaRouteButton;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.Crop.CropTransform;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditCoverButton;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.FilterGLThread;
import org.telegram.ui.Components.FilterShaders;
import org.telegram.ui.Components.FloatSeekBarAccessibilityDelegate;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.GestureDetector2;
import org.telegram.ui.Components.GroupedPhotosListView;
import org.telegram.ui.Components.HideViewAfterAnimation;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.IntSeekBarAccessibilityDelegate;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LivePhotoButton;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.MentionsContainerView;
import org.telegram.ui.Components.MuteDrawable;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.Paint.Views.MaskPaintView;
import org.telegram.ui.Components.Paint.Views.PaintCancelView;
import org.telegram.ui.Components.Paint.Views.PaintDoneView;
import org.telegram.ui.Components.Paint.Views.PaintWeightChooserView;
import org.telegram.ui.Components.Paint.Views.StickerCutOutBtn;
import org.telegram.ui.Components.Paint.Views.StickerMakerBackgroundView;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.PaintingOverlay;
import org.telegram.ui.Components.PhotoCropView;
import org.telegram.ui.Components.PhotoFilterView;
import org.telegram.ui.Components.PhotoViewerCoverEditor;
import org.telegram.ui.Components.PhotoViewerPollAttachButtons;
import org.telegram.ui.Components.PhotoViewerWebView;
import org.telegram.ui.Components.PickerBottomLayoutViewer;
import org.telegram.ui.Components.PipVideoOverlay;
import org.telegram.ui.Components.PlayPauseDrawable;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.QuoteSpan;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RectOld;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SeekSpeedDrawable;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SizeNotifierFrameLayoutPhoto;
import org.telegram.ui.Components.SpeedIconDrawable;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.TextViewSwitcher;
import org.telegram.ui.Components.Tooltip;
import org.telegram.ui.Components.TranslateAlert2;
import org.telegram.ui.Components.TypefaceSpan;
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
import org.telegram.ui.Components.blur3.Blur3HashImpl;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableRenderNode;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableSource;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSource;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SpeedButtonsLayout;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.CaptionContainerView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;

public class PhotoViewer implements NotificationCenter.NotificationCenterDelegate, GestureDetector2.OnGestureListener, GestureDetector2.OnDoubleTapListener, IPipSourceDelegate, FactorAnimator.Target {
    private static volatile PhotoViewer Instance;
    private static volatile PhotoViewer Instance2;
    private static volatile PhotoViewer PipInstance;
    private static final Property VPC_PROGRESS;
    private static DecelerateInterpolator decelerateInterpolator;
    private static Drawable[] progressDrawables;
    private static Paint progressPaint;
    private boolean ALLOW_USE_SURFACE;
    public final Property FLASH_VIEW_VALUE;
    private int aboutToSwitchTo;
    private ActionBar actionBar;
    private AnimatorSet actionBarAnimator;
    private ImageView actionBarBackButton;
    private Drawable actionBarBackButtonDrawableDeafult;
    private Drawable actionBarBackButtonDrawableGlass;
    private PhotoViewerActionBarContainer actionBarContainer;
    private Map actionBarItemsVisibility;
    private boolean actionBarWasShownBeforeByEnd;
    private Context activityContext;
    private WindowVisibilityManager.Controller activityVisibilityController;
    private TextView adButtonTextView;
    private FrameLayout adButtonView;
    private VideoAds ads;
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
    private final BoolAnimator animatorPollAttachButtonsVisibility = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380);
    private boolean applying;
    private AspectRatioFrameLayout aspectRatioFrameLayout;
    private boolean attachedToWindow;
    private long audioFramesSize;
    private float avatarStartProgress;
    private long avatarStartTime;
    private final ArrayList avatarsArr;
    private long avatarsDialogId;
    private BackgroundDrawable backgroundDrawable;
    private volatile int bitrate;
    private Paint blackPaint;
    private final AnimatedFloat blurAlpha;
    private RectF blurBounds;
    public BlurringShader.BlurManager blurManager;
    private BlurredBackgroundSource blurredBackgroundSource;
    private FrameLayout bottomBulletinUnderCaption;
    private LinearGradient bottomFancyShadow;
    private Matrix bottomFancyShadowMatrix;
    private Paint bottomFancyShadowPaint;
    private FrameLayout bottomLayout;
    private LinearLayout btnLayout;
    private boolean canDragDown;
    private boolean canEditAvatar;
    private boolean canZoom;
    private FrameLayout captionContainer;
    private String captionDetectedLanguage;
    private CaptionPhotoViewer captionEdit;
    private final float[] captionEditAlpha;
    private FrameLayout captionEditContainer;
    public CharSequence captionForAllMedia;
    private boolean captionHwLayerEnabled;
    private CaptionScrollView captionScrollView;
    private CaptionTextViewSwitcher captionTextViewSwitcher;
    private boolean captionTranslated;
    private long captureFrameAtTime;
    private long captureFrameReadyAtTime;
    private ActionBarMenuSubItem castItem;
    private CastMediaRouteButton castItemButton;
    private BlurringShader.ThumbBlurer centerBlur;
    public ImageReceiver centerImage;
    private AnimatedFloat[] centerImageInsideBlur;
    private boolean centerImageIsLivePhoto;
    private boolean centerImageIsVideo;
    private Matrix centerImageTransform;
    private boolean centerImageTransformLocked;
    private AnimatorSet changeModeAnimation;
    public TextureView changedTextureView;
    private boolean changingPage;
    private boolean changingTextureView;
    private CheckBox checkImageView;
    private ChooseDownloadQualityLayout chooseDownloadQualityLayout;
    private SpeedButtonsLayout chooseSpeedLayout;
    private int classGuid;
    private Path clipFancyShadows;
    private float clippingImageProgress;
    public boolean closePhotoAfterSelect;
    public boolean closePhotoAfterSelectWithAnimation;
    private VideoCompressButton compressItem;
    private HintView2 compressPhotoHint;
    private volatile int compressionsCount;
    private FrameLayoutDrawer containerView;
    private PhotoCountView countView;
    public PhotoViewerCoverEditor coverEditor;
    private boolean cropInitied;
    private ImageView cropItem;
    private CropTransform cropTransform;
    private int currentAccount;
    private AnimatedFileDrawable currentAnimation;
    private ImageLocation currentAvatarLocation;
    private Bitmap currentBitmap;
    private TLRPC.BotInlineResult currentBotInlineResult;
    private float currentCropScale;
    private float currentCropX;
    private float currentCropY;
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
    private TL_iv.PageBlock currentPageBlock;
    private float currentPanTranslationY;
    private String currentPathObject;
    private long currentPathVideoOffset;
    private PlaceProviderObject currentPlaceObject;
    private Uri currentPlayingVideoFile;
    private ArrayList currentPlayingVideoQualityFiles;
    private SecureDocument currentSecureDocument;
    private String currentSubtitle;
    private ImageReceiver.BitmapHolder currentThumb;
    private boolean currentVideoFinishedLoading;
    private float currentVideoSpeed;
    public Utilities.Callback2 customStickerHandler;
    private CharSequence customTitle;
    private BlurButton cutOutBtn;
    private int dateOverride;
    private ActionBarMenuItem deleteItem;
    private MessagesController.DialogPhotos dialogPhotos;
    private boolean disableSelection;
    private boolean disableShowCheck;
    private boolean discardTap;
    private TextView docInfoTextView;
    private TextView docNameTextView;
    private TextView doneButtonFullWidth;
    public boolean doneButtonPressed;
    private boolean dontAutoPlay;
    private boolean dontChangeCaptionPosition;
    private boolean dontResetZoomOnFirstLayout;
    private boolean doubleTap;
    private boolean doubleTapEnabled;
    private float dragY;
    private boolean draggingDown;
    private boolean[] drawPressedDrawable;
    private EditCoverButton editCoverButton;
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
    public final VideoFramesRewinder framesRewinder;
    boolean fromCamera;
    private ImageView[] fullscreenButton;
    private int fullscreenedByButton;
    private ActionBarMenuSubItem galleryButton;
    private ActionBarPopupWindow.GapView galleryGap;
    private GestureDetector2 gestureDetector;
    private ReferenceList glassAttachedViews;
    private GroupedPhotosListView groupedPhotosListView;
    public boolean hasCaptionForAllMedia;
    private Runnable hideActionBarRunnable;
    private PlaceProviderObject hideAfterAnimation;
    private UndoView hintView;
    private Rect hitRect;
    private ReferenceList iBlur3BlurredDrawables;
    private BlurredBackgroundDrawableViewFactory iBlur3FactoryFrostedLiquidGlass;
    private boolean ignoreDidSetImage;
    private boolean ignorePlayerUpdate;
    private RectF imageBounds;
    private Matrix imageBoundsMatrix;
    private float[] imageBoundsPoints;
    private AnimatorSet imageMoveAnimation;
    private final ArrayList imagesArr;
    private final ArrayList imagesArrLocals;
    private final ArrayList imagesArrLocations;
    private final ArrayList imagesArrLocationsSizes;
    private final ArrayList imagesArrLocationsVideo;
    private final ArrayList imagesArrMessages;
    private final ArrayList imagesArrTemp;
    private final SparseArray[] imagesByIds;
    private final SparseArray[] imagesByIdsTemp;
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
    private int lastQualityIndexSelected;
    private long lastSaveTime;
    private CharSequence lastTitle;
    float lastX;
    private BlurringShader.ThumbBlurer leftBlur;
    private MediaController.CropState leftCropState;
    private CropTransform leftCropTransform;
    private ImageReceiver leftImage;
    private boolean leftImageIsVideo;
    private PaintingOverlay leftPaintingOverlay;
    private Bulletin limitBulletin;
    private LivePhotoButton livePhotoButton;
    private ArrayList livePhotoHints;
    private boolean loadInitialVideo;
    private boolean loadingMoreImages;
    Runnable longPressRunnable;
    float longPressX;
    OldVideoPlayerRewinder longVideoPlayerRewinder;
    private ActionBarMenuSubItem loopItem;
    private boolean manuallyPaused;
    private MaskPaintView maskPaintView;
    private boolean maskPaintViewEraser;
    private boolean maskPaintViewShuttingDown;
    private int maskPaintViewTouched;
    private StickersAlert masksAlert;
    private ActionBarMenuItem masksItem;
    private final LongSparseArray matrixRenderNodes;
    private int maxSelectedPhotos;
    private float maxX;
    private float maxY;
    private ActionBarMenu menu;
    private ActionBarMenuItem menuItem;
    private long mergeDialogId;
    private float minX;
    private float minY;
    private AnimatorSet miniProgressAnimator;
    private final Runnable miniProgressShowRunnable;
    private RadialProgressView miniProgressView;
    private float mirror;
    private ImageView mirrorItem;
    private float moveStartX;
    private float moveStartY;
    private boolean moving;
    private ImageView muteButton;
    private MuteDrawable muteDrawable;
    private ArrayList muteHints;
    private boolean muteVideo;
    private String nameOverride;
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
    public TLRPC.Document originalSticker;
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
    private WindowVisibilityManager.Controller parentAlertWindowVisibilityController;
    private ChatActivity parentChatActivity;
    private BaseFragment parentFragment;
    private PhotoCropView photoCropView;
    private PhotoFilterView photoFilterView;
    private LPhotoPaintView photoPaintView;
    private PhotoProgressView[] photoProgressViews;
    private PhotoViewerWebView photoViewerWebView;
    private CounterView photosCounterView;
    private FrameLayout pickerView;
    private ChatActivityEnterView.SendButton pickerViewSendButton;
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
    public Runnable pipFirstFrameCallback;
    private ActionBarMenuSubItem pipItem;
    private View pipPlaceholderView;
    private int[] pipPosition;
    private PipSource pipSource;
    private TextureView pipTextureView;
    private boolean pipVideoOverlayAnimateFlag;
    private PhotoViewerProvider placeProvider;
    private View playButtonAccessibilityOverlay;
    private boolean playerAutoStarted;
    private boolean playerInjected;
    private boolean playerLooping;
    private boolean playerWasPlaying;
    private boolean playerWasReady;
    private PhotoViewerPollAttachButtons pollAttachButtons;
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
    private RenderNode renderNodeBlurred;
    private RenderNode renderNodeGlassed;
    private final Blur3HashImpl renderNodeHashBuilder;
    public TLRPC.Document replacedSticker;
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
    private float scale;
    private Scroller scroller;
    private final ArrayList secureDocuments;
    private SeekSpeedDrawable seekSpeedDrawable;
    private float seekToProgressPending;
    private float seekToProgressPending2;
    private volatile int selectedCompression;
    private ArrayList selectedEmojis;
    private ListAdapter selectedPhotosAdapter;
    private SelectedPhotosListView selectedPhotosListView;
    private ActionBarMenuItem sendItem;
    private int sendPhotoType;
    private boolean sendPhotoTypeIsGif;
    private boolean sendPhotoTypeIsPollMedia;
    private boolean sendPhotoTypeIsPollMediaEdit;
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
    private ActionBarMenuSlider.SpeedSlider speedItem;
    private int startOffset;
    private boolean startReached;
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
    private final Runnable switchToInlineRunnable;
    private boolean switchingInlineMode;
    private int switchingToIndex;
    private int switchingToMode;
    private int[] tempInt;
    private TextSelectionHelper.SimpleTextSelectionHelper textSelectionHelper;
    private ImageView textureImageView;
    private boolean textureUploaded;
    private boolean textureViewSkipRender;
    private Tooltip tooltip;
    private FrameLayout topBulletinUnderCaption;
    private CaptionPhotoViewer topCaptionEdit;
    private final float[] topCaptionEditAlpha;
    private FrameLayout topCaptionEditContainer;
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
    private ActionBarMenuItem videoItem;
    private ChooseQualityLayout$QualityIcon videoItemIcon;
    private Runnable videoPlayRunnable;
    private VideoPlayer videoPlayer;
    private Animator videoPlayerControlAnimator;
    private VideoPlayerControlFrameLayout videoPlayerControlFrameLayout;
    private boolean videoPlayerControlVisible;
    private int[] videoPlayerCurrentTime;
    private final VideoPlayerRewinder videoPlayerRewinder;
    private VideoPlayerSeekBar videoPlayerSeekbar;
    private View videoPlayerSeekbarView;
    private SimpleTextView videoPlayerTime;
    private int[] videoPlayerTotalTime;
    private VideoSeekPreviewImage videoPreviewFrame;
    private AnimatorSet videoPreviewFrameAnimation;
    private MessageObject videoPreviewMessageObject;
    private final ArrayList videoQualityItems;
    private LinearLayout videoQualityLayout;
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
    public FrameLayout windowView;
    private boolean windowViewSkipRender;
    private boolean zoomAnimation;
    private boolean zooming;
    public static Paint bitmapPaint = new Paint(2);
    private static final HashMap savedVideoPositions = new HashMap();

    public static class EmptyPhotoViewerProvider implements PhotoViewerProvider {
        @Override
        public boolean allowCaption() {
            return true;
        }

        @Override
        public boolean allowLivePhotos() {
            return PhotoViewerProvider.CC.$default$allowLivePhotos(this);
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
        public boolean canEdit(int i) {
            return false;
        }

        @Override
        public boolean canLoadMoreAvatars() {
            return PhotoViewerProvider.CC.$default$canLoadMoreAvatars(this);
        }

        @Override
        public boolean canMoveCaptionAbove() {
            return PhotoViewerProvider.CC.$default$canMoveCaptionAbove(this);
        }

        @Override
        public boolean canReplace(int i) {
            return false;
        }

        @Override
        public boolean canSchedule() {
            return PhotoViewerProvider.CC.$default$canSchedule(this);
        }

        @Override
        public boolean canScrollAway() {
            return true;
        }

        @Override
        public boolean canSetTimer() {
            return PhotoViewerProvider.CC.$default$canSetTimer(this);
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
        public boolean forceAllInGroup() {
            return PhotoViewerProvider.CC.$default$forceAllInGroup(this);
        }

        @Override
        public String getDeleteMessageString() {
            return null;
        }

        @Override
        public long getDialogId() {
            return PhotoViewerProvider.CC.$default$getDialogId(this);
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
        public PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
            return null;
        }

        @Override
        public int getSelectedCount() {
            return 0;
        }

        @Override
        public HashMap getSelectedPhotos() {
            return null;
        }

        @Override
        public ArrayList getSelectedPhotosOrder() {
            return null;
        }

        @Override
        public CharSequence getSubtitleFor(int i) {
            return null;
        }

        @Override
        public ImageReceiver.BitmapHolder getThumbForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i) {
            return null;
        }

        @Override
        public CharSequence getTitleFor(int i) {
            return null;
        }

        @Override
        public int getTotalImageCount() {
            return -1;
        }

        @Override
        public boolean isCaptionAbove() {
            return PhotoViewerProvider.CC.$default$isCaptionAbove(this);
        }

        @Override
        public boolean isEditingMessage() {
            return PhotoViewerProvider.CC.$default$isEditingMessage(this);
        }

        @Override
        public boolean isEditingMessageResend() {
            return PhotoViewerProvider.CC.$default$isEditingMessageResend(this);
        }

        @Override
        public boolean isEditingSticker() {
            return PhotoViewerProvider.CC.$default$isEditingSticker(this);
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
        public void moveCaptionAbove(boolean z) {
            PhotoViewerProvider.CC.$default$moveCaptionAbove(this, z);
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
        public void onPollAttachDelete() {
            PhotoViewerProvider.CC.$default$onPollAttachDelete(this);
        }

        @Override
        public void onPollAttachReplace() {
            PhotoViewerProvider.CC.$default$onPollAttachReplace(this);
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
        public void sendButtonPressed(int i, VideoEditedInfo videoEditedInfo, boolean z, int i2, int i3, boolean z2) {
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
        public void updatedLivePhotos() {
            PhotoViewerProvider.CC.$default$updatedLivePhotos(this);
        }

        @Override
        public void willHidePhotoViewer() {
        }

        @Override
        public void willSwitchFromPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i) {
        }
    }

    public interface PageBlocksAdapter {
        TL_iv.PageBlock get(int i);

        List getAll();

        CharSequence getCaption(int i);

        File getFile(int i);

        TLRPC.PhotoSize getFileLocation(TLObject tLObject, int[] iArr);

        String getFileName(int i);

        int getItemsCount();

        TLObject getMedia(int i);

        Object getParentObject();

        boolean isHardwarePlayer(int i);

        boolean isVideo(int i);

        void updateSlideshowCell(TL_iv.PageBlock pageBlock);
    }

    public interface PhotoViewerProvider {

        public abstract class CC {
            public static boolean $default$allowLivePhotos(PhotoViewerProvider photoViewerProvider) {
                return false;
            }

            public static boolean $default$canLoadMoreAvatars(PhotoViewerProvider photoViewerProvider) {
                return true;
            }

            public static boolean $default$canMoveCaptionAbove(PhotoViewerProvider photoViewerProvider) {
                return false;
            }

            public static boolean $default$canSchedule(PhotoViewerProvider photoViewerProvider) {
                return false;
            }

            public static boolean $default$canSetTimer(PhotoViewerProvider photoViewerProvider) {
                return false;
            }

            public static boolean $default$forceAllInGroup(PhotoViewerProvider photoViewerProvider) {
                return false;
            }

            public static long $default$getDialogId(PhotoViewerProvider photoViewerProvider) {
                return 0L;
            }

            public static boolean $default$isCaptionAbove(PhotoViewerProvider photoViewerProvider) {
                return false;
            }

            public static boolean $default$isEditingMessage(PhotoViewerProvider photoViewerProvider) {
                return false;
            }

            public static boolean $default$isEditingMessageResend(PhotoViewerProvider photoViewerProvider) {
                return false;
            }

            public static boolean $default$isEditingSticker(PhotoViewerProvider photoViewerProvider) {
                return false;
            }

            public static void $default$moveCaptionAbove(PhotoViewerProvider photoViewerProvider, boolean z) {
            }

            public static boolean $default$onDeletePhoto(PhotoViewerProvider photoViewerProvider, int i) {
                return true;
            }

            public static void $default$onEditModeChanged(PhotoViewerProvider photoViewerProvider, boolean z) {
            }

            public static void $default$onPollAttachDelete(PhotoViewerProvider photoViewerProvider) {
            }

            public static void $default$onPollAttachReplace(PhotoViewerProvider photoViewerProvider) {
            }

            public static void $default$onPreClose(PhotoViewerProvider photoViewerProvider) {
            }

            public static void $default$onPreOpen(PhotoViewerProvider photoViewerProvider) {
            }

            public static void $default$onReleasePlayerBeforeClose(PhotoViewerProvider photoViewerProvider, int i) {
            }

            public static void $default$updatedLivePhotos(PhotoViewerProvider photoViewerProvider) {
            }
        }

        boolean allowCaption();

        boolean allowLivePhotos();

        boolean allowSendingSubmenu();

        boolean canCaptureMorePhotos();

        boolean canEdit(int i);

        boolean canLoadMoreAvatars();

        boolean canMoveCaptionAbove();

        boolean canReplace(int i);

        boolean canSchedule();

        boolean canScrollAway();

        boolean canSetTimer();

        boolean cancelButtonPressed();

        boolean closeKeyboard();

        void deleteImageAtIndex(int i);

        boolean forceAllInGroup();

        String getDeleteMessageString();

        long getDialogId();

        MessageObject getEditingMessageObject();

        int getPhotoIndex(int i);

        PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2);

        int getSelectedCount();

        HashMap getSelectedPhotos();

        ArrayList getSelectedPhotosOrder();

        CharSequence getSubtitleFor(int i);

        ImageReceiver.BitmapHolder getThumbForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i);

        CharSequence getTitleFor(int i);

        int getTotalImageCount();

        boolean isCaptionAbove();

        boolean isEditingMessage();

        boolean isEditingMessageResend();

        boolean isEditingSticker();

        boolean isPhotoChecked(int i);

        boolean loadMore();

        void moveCaptionAbove(boolean z);

        void needAddMorePhotos();

        void onApplyCaption(CharSequence charSequence);

        void onClose();

        boolean onDeletePhoto(int i);

        void onEditModeChanged(boolean z);

        void onOpen();

        void onPollAttachDelete();

        void onPollAttachReplace();

        void onPreClose();

        void onPreOpen();

        void onReleasePlayerBeforeClose(int i);

        void openPhotoForEdit(String str, String str2, boolean z);

        void replaceButtonPressed(int i, VideoEditedInfo videoEditedInfo);

        boolean scaleToFill();

        void sendButtonPressed(int i, VideoEditedInfo videoEditedInfo, boolean z, int i2, int i3, boolean z2);

        int setPhotoChecked(int i, VideoEditedInfo videoEditedInfo);

        int setPhotoUnchecked(Object obj);

        void updatePhotoAtIndex(int i);

        void updatedLivePhotos();

        void willHidePhotoViewer();

        void willSwitchFromPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i);
    }

    public static class PlaceProviderObject {
        public ClippingImageView animatingImageView;
        public int animatingImageViewYOffset;
        public boolean canEdit;
        public int clipBottomAddition;
        public int clipTopAddition;
        public long dialogId;
        public boolean fadeIn;
        public ImageReceiver imageReceiver;
        public boolean isEvent;
        public boolean keepImageReceiverVisible;
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

    public static void lambda$sendPressed$86(AlertDialog alertDialog, int i) {
    }

    public static void lambda$setParentActivity$53() {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
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

    public static void access$18500(PhotoViewer photoViewer) {
        photoViewer.updateCaptionTranslated();
    }

    private boolean isUnalivePhoto() {
        if (this.sendPhotoType == 11) {
            return true;
        }
        int i = this.currentIndex;
        if (i >= 0 && i < this.imagesArrLocals.size()) {
            PhotoViewerProvider photoViewerProvider = this.placeProvider;
            if (photoViewerProvider != null && !photoViewerProvider.allowLivePhotos()) {
                return true;
            }
            Object obj = this.imagesArrLocals.get(this.currentIndex);
            if (obj instanceof MediaController.PhotoEntry) {
                return ((MediaController.PhotoEntry) obj).isUnalivePhoto();
            }
        }
        return false;
    }

    private void setUnalivePhoto(boolean z) {
        int i = this.currentIndex;
        if (i < 0 || i >= this.imagesArrLocals.size()) {
            return;
        }
        Object obj = this.imagesArrLocals.get(this.currentIndex);
        if (obj instanceof MediaController.PhotoEntry) {
            ((MediaController.PhotoEntry) obj).discardLivePhoto = Boolean.valueOf(z);
            SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
            boolean z2 = !z;
            SharedConfig.photoLiveDefault = z2;
            editorEdit.putBoolean("photoLiveDefault", z2).apply();
            PhotoViewerProvider photoViewerProvider = this.placeProvider;
            if (photoViewerProvider != null) {
                photoViewerProvider.updatedLivePhotos();
            }
        }
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

    static class PhotoViewerActionBarContainer extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
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
            frameLayout.setPadding(AndroidUtilities.dp(56.0f), 0, 0, 0);
            addView(this.container, LayoutHelper.createFrame(-1, -1, 119));
            FrameLayout frameLayout2 = new FrameLayout(context) {
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
                this.titleTextView[i].setTypeface(AndroidUtilities.bold());
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
            this.subtitleTextView.setImportantForAccessibility(1);
            this.subtitleTextView.setAccessibilityLiveRegion(1);
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
            float fDp = AndroidUtilities.dp(8.0f) * (z2 ? 1 : -1);
            this.titleTextView[1].setTranslationX(0.0f);
            this.titleTextView[1].setTranslationY(0.0f);
            if (z) {
                this.titleTextView[0].setTranslationX(0.0f);
                this.titleTextView[0].setTranslationY(-fDp);
            } else {
                this.titleTextView[0].setTranslationX(-fDp);
                this.titleTextView[0].setTranslationY(0.0f);
            }
            this.titleTextView[0].setAlpha(0.0f);
            this.titleTextView[1].setAlpha(1.0f);
            this.titleTextView[0].setVisibility(0);
            this.titleTextView[1].setVisibility(0);
            ArrayList arrayList = new ArrayList();
            SimpleTextView simpleTextView = this.titleTextView[1];
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(simpleTextView, (Property<SimpleTextView, Float>) property, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.titleTextView[0], (Property<SimpleTextView, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.titleTextView[1], (Property<SimpleTextView, Float>) (z ? View.TRANSLATION_Y : View.TRANSLATION_X), fDp));
            arrayList.add(ObjectAnimator.ofFloat(this.titleTextView[0], (Property<SimpleTextView, Float>) (z ? View.TRANSLATION_Y : View.TRANSLATION_X), 0.0f));
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.titleAnimator = animatorSet2;
            animatorSet2.playTogether(arrayList);
            this.titleAnimator.addListener(new AnimatorListenerAdapter() {
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
            boolean zIsEmpty = TextUtils.isEmpty(charSequence);
            boolean z2 = !zIsEmpty;
            if (z2 != this.hasSubtitle) {
                this.hasSubtitle = z2;
                AnimatorSet animatorSet = this.subtitleAnimator;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                Point point = AndroidUtilities.displaySize;
                int iDp = AndroidUtilities.dp((!zIsEmpty ? 30 : 33) - (point.x > point.y ? 6 : 0));
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(this.subtitleTextView, (Property<AnimatedTextView, Float>) View.ALPHA, !zIsEmpty ? 1.0f : 0.0f));
                    AnimatedTextView animatedTextView = this.subtitleTextView;
                    Property property = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(animatedTextView, (Property<AnimatedTextView, Float>) property, iDp));
                    arrayList.add(ObjectAnimator.ofFloat(this.titleLayout, (Property<FrameLayout, Float>) property, zIsEmpty ? 0.0f : AndroidUtilities.dp(-12.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.titleLayout, (Property<FrameLayout, Float>) View.SCALE_X, !zIsEmpty ? 0.87f : 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.titleLayout, (Property<FrameLayout, Float>) View.SCALE_Y, zIsEmpty ? 1.0f : 0.87f));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.subtitleAnimator = animatorSet2;
                    animatorSet2.playTogether(arrayList);
                    this.subtitleAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    this.subtitleAnimator.start();
                } else {
                    this.subtitleTextView.setAlpha(!zIsEmpty ? 1.0f : 0.0f);
                    this.subtitleTextView.setTranslationY(iDp);
                    this.titleLayout.setTranslationY(zIsEmpty ? 0.0f : AndroidUtilities.dp(-12.0f));
                    this.titleLayout.setScaleX(!zIsEmpty ? 0.87f : 1.0f);
                    this.titleLayout.setScaleY(zIsEmpty ? 1.0f : 0.87f);
                }
            }
            this.subtitleTextView.setText(charSequence, z);
            AnimatedTextView animatedTextView2 = this.subtitleTextView;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = null;
            }
            animatedTextView2.setContentDescription(charSequence);
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
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.rightPadding, f);
                this.rightPaddingAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        this.f$0.lambda$updateRightPadding$0(f, valueAnimator2);
                    }
                });
                this.rightPaddingAnimator.addListener(new AnimatorListenerAdapter() {
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
            int i3 = AndroidUtilities.statusBarHeight;
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
            this.container.layout(0, AndroidUtilities.statusBarHeight, i3 - i, i4 - i2);
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

    private static class PhotoCountView extends View {
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
            this.left.setTypeface(AndroidUtilities.bold());
            this.left.setCallback(this);
            this.left.setText("0");
            this.left.setOverrideFullWidth(AndroidUtilities.displaySize.x);
            this.paint.setColor(-1);
            this.paint.setTextSize(AndroidUtilities.dp(14.0f));
            this.paint.setTypeface(AndroidUtilities.bold());
            setCenterText();
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
            this.right = animatedTextDrawable2;
            animatedTextDrawable2.setAnimationProperties(0.3f, 0L, 320L, cubicBezierInterpolator);
            this.right.setTextColor(-1);
            this.right.setTextSize(AndroidUtilities.dp(14.0f));
            this.right.setTypeface(AndroidUtilities.bold());
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
            } else {
                this.centerWidth = 0.0f;
                this.centerTop = 0.0f;
            }
        }

        private String getOf() {
            this.lng = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
            return LocaleController.getString(R.string.Of).replace("%1$d", "").replace("%2$d", "");
        }

        public void set(int i, int i2) {
            set(i, i2, true);
        }

        public void set(int i, int i2, boolean z) {
            boolean z2 = false;
            int iMax = Math.max(0, i);
            int iMax2 = Math.max(iMax, i2);
            if (LocaleController.getInstance().getCurrentLocaleInfo() != null && !TextUtils.equals(this.lng, LocaleController.getInstance().getCurrentLocaleInfo().shortName)) {
                setCenterText();
            }
            this.left.setText(String.format("%d", Integer.valueOf(LocaleController.isRTL ? iMax2 : iMax)), (!z || this.nextNotAnimate || LocaleController.isRTL) ? false : true);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.right;
            if (!LocaleController.isRTL) {
                iMax = iMax2;
            }
            String str = String.format("%d", Integer.valueOf(iMax));
            if (z && !this.nextNotAnimate && !LocaleController.isRTL) {
                z2 = true;
            }
            animatedTextDrawable.setText(str, z2);
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
            canvas.translate(((getWidth() - currentWidth) / 2.0f) + AndroidUtilities.dp(9.0f), f2 + AndroidUtilities.dp(9.5f));
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
            this.marginTop = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            this.left.setOverrideFullWidth(size);
            this.right.setOverrideFullWidth(size);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.marginTop + AndroidUtilities.dp(43.0f), 1073741824));
        }
    }

    static {
        String str = "progress";
        if (Build.VERSION.SDK_INT >= 24) {
            VPC_PROGRESS = new FloatProperty(str) {
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
            VPC_PROGRESS = new Property(Float.class, str) {
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
        Instance2 = null;
    }

    public void setSelectionDisabled(boolean z) {
        this.disableSelection = z;
        CheckBox checkBox = this.checkImageView;
        if (checkBox != null) {
            checkBox.setVisibility(z ? 8 : checkBox.getVisibility());
        }
        CounterView counterView = this.photosCounterView;
        if (counterView == null || !z) {
            return;
        }
        counterView.setVisibility(8);
    }

    public void addPhoto(MessageObject messageObject, int i) throws Resources.NotFoundException {
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
        TLRPC.User user;
        this.setAvatarFor = avatarFor;
        if (this.sendPhotoType == 1) {
            if (useFullWidthSendButton()) {
                this.doneButtonFullWidth.setVisibility(0);
                this.pickerViewSendButton.setVisibility(8);
            } else {
                this.pickerViewSendButton.setVisibility(0);
                this.doneButtonFullWidth.setVisibility(8);
            }
            if (avatarFor != null && (user = avatarFor.fromObject) != null && avatarFor.type == 1 && this.setAvatarFor.self) {
                if (avatarFor.isVideo) {
                    this.photoCropView.setSubtitle(LocaleController.formatString(R.string.SetSuggestedVideoTooltip, user.first_name));
                } else {
                    this.photoCropView.setSubtitle(LocaleController.formatString(R.string.SetSuggestedPhotoTooltip, user.first_name));
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
            this.actionBar.setElevation(2.0f);
        }
    }

    public boolean useFullWidthSendButton() {
        ImageUpdater.AvatarFor avatarFor = this.setAvatarFor;
        return (avatarFor == null || !avatarFor.self || avatarFor.isVideo) ? false : true;
    }

    private static class SavedVideoPosition {
        public final float position;
        public final long timestamp;

        public SavedVideoPosition(float f, long j) {
            this.position = f;
            this.timestamp = j;
        }
    }

    public void onLinkClick(ClickableSpan clickableSpan, TextView textView) throws NumberFormatException {
        if (textView != null && (clickableSpan instanceof URLSpan)) {
            String url = ((URLSpan) clickableSpan).getURL();
            if (url.startsWith("video")) {
                if (this.videoPlayer == null || this.currentMessageObject == null) {
                    return;
                }
                int iIntValue = Utilities.parseInt((CharSequence) url).intValue();
                if (this.videoPlayer.getDuration() == -9223372036854775807L) {
                    this.seekToProgressPending = iIntValue / ((float) this.currentMessageObject.getDuration());
                    return;
                }
                long j = iIntValue * 1000;
                this.videoPlayer.seekTo(j);
                this.videoPlayerSeekbar.setProgress(j / this.videoPlayer.getDuration(), true);
                this.videoPlayerSeekbarView.invalidate();
                return;
            }
            if (url.startsWith("#")) {
                if (this.parentActivity instanceof LaunchActivity) {
                    DialogsActivity dialogsActivity = new DialogsActivity(null);
                    dialogsActivity.setSearchString(url);
                    ((LaunchActivity) this.parentActivity).presentFragment(dialogsActivity, false, true);
                    closePhoto(false, false);
                    return;
                }
                return;
            }
            if (this.parentChatActivity != null && ((clickableSpan instanceof URLSpanReplacement) || AndroidUtilities.shouldShowUrlInAlert(url))) {
                AlertsCreator.showOpenUrlAlert(this.parentChatActivity, url, true, true);
                return;
            } else {
                clickableSpan.onClick(textView);
                return;
            }
        }
        clickableSpan.onClick(textView);
    }

    public void onLinkLongPress(final android.text.style.ClickableSpan r17, final android.widget.TextView r18, final java.lang.Runnable r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.onLinkLongPress(android.text.style.ClickableSpan, android.widget.TextView, java.lang.Runnable):void");
    }

    public void lambda$onLinkLongPress$1(ClickableSpan clickableSpan, TextView textView, String str, boolean z, DialogInterface dialogInterface, int i) throws NumberFormatException {
        String string;
        if (i == 0) {
            onLinkClick(clickableSpan, textView);
            return;
        }
        if (i == 1) {
            AndroidUtilities.addToClipboard(str);
            if (z) {
                string = LocaleController.getString("PhoneCopied", R.string.PhoneCopied);
            } else if (str.startsWith("#")) {
                string = LocaleController.getString("HashtagCopied", R.string.HashtagCopied);
            } else if (str.startsWith("@")) {
                string = LocaleController.getString("UsernameCopied", R.string.UsernameCopied);
            } else {
                string = LocaleController.getString("LinkCopied", R.string.LinkCopied);
            }
            if (AndroidUtilities.shouldShowClipboardToast()) {
                BulletinFactory.of(this.containerView, this.resourcesProvider).createSimpleBulletin(R.raw.voip_invite, string).show();
            }
        }
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

    class AnonymousClass6 implements Runnable {
        AnonymousClass6() {
        }

        @Override
        public void run() {
            float bufferedProgressFromPosition;
            if (PhotoViewer.this.videoPlayer != null || (PhotoViewer.this.photoViewerWebView != null && PhotoViewer.this.photoViewerWebView.isControllable())) {
                if (PhotoViewer.this.isCurrentVideo) {
                    if (!PhotoViewer.this.videoTimelineView.isDragging()) {
                        float currentVideoPosition = (!PhotoViewer.this.shownControlsByEnd || PhotoViewer.this.actionBarWasShownBeforeByEnd) ? PhotoViewer.this.getCurrentVideoPosition() / PhotoViewer.this.getVideoDuration() : 0.0f;
                        if (PhotoViewer.this.inPreview || (PhotoViewer.this.currentEditMode == 0 && PhotoViewer.this.videoTimelineViewContainer.getVisibility() != 0)) {
                            if (PhotoViewer.this.sendPhotoType != 1) {
                                PhotoViewer.this.videoTimelineView.setProgress(currentVideoPosition);
                            }
                        } else if (currentVideoPosition >= PhotoViewer.this.videoTimelineView.getRightProgress()) {
                            PhotoViewer.this.videoTimelineView.setProgress(PhotoViewer.this.videoTimelineView.getLeftProgress());
                            PhotoViewer.this.videoPlayer.seekTo((int) (PhotoViewer.this.videoTimelineView.getLeftProgress() * PhotoViewer.this.getVideoDuration()));
                            PhotoViewer.this.manuallyPaused = false;
                            PhotoViewer.this.cancelVideoPlayRunnable();
                            if (PhotoViewer.this.muteVideo || PhotoViewer.this.sendPhotoType == 1 || PhotoViewer.this.currentEditMode != 0 || PhotoViewer.this.switchingToMode > 0) {
                                PhotoViewer.this.playVideoOrWeb();
                            } else {
                                PhotoViewer.this.pauseVideoOrWeb();
                            }
                            PhotoViewer.this.containerView.invalidate();
                        } else {
                            PhotoViewer.this.videoTimelineView.setProgress(currentVideoPosition);
                        }
                        PhotoViewer.this.updateVideoPlayerTime();
                    }
                } else {
                    final float currentVideoPosition2 = PhotoViewer.this.getCurrentVideoPosition() / PhotoViewer.this.getVideoDuration();
                    if (PhotoViewer.this.shownControlsByEnd && !PhotoViewer.this.actionBarWasShownBeforeByEnd) {
                        currentVideoPosition2 = 0.0f;
                    }
                    if (PhotoViewer.this.currentVideoFinishedLoading) {
                        bufferedProgressFromPosition = 1.0f;
                    } else {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (Math.abs(jElapsedRealtime - PhotoViewer.this.lastBufferedPositionCheck) >= 500) {
                            if (PhotoViewer.this.photoViewerWebView == null || !PhotoViewer.this.photoViewerWebView.isControllable()) {
                                if (PhotoViewer.this.isStreaming) {
                                    bufferedProgressFromPosition = FileLoader.getInstance(PhotoViewer.this.currentAccount).getBufferedProgressFromPosition(PhotoViewer.this.seekToProgressPending != 0.0f ? PhotoViewer.this.seekToProgressPending : currentVideoPosition2, PhotoViewer.this.currentFileNames[0]);
                                } else {
                                    bufferedProgressFromPosition = 1.0f;
                                }
                            } else {
                                bufferedProgressFromPosition = PhotoViewer.this.photoViewerWebView.getBufferedPosition();
                            }
                            PhotoViewer.this.lastBufferedPositionCheck = jElapsedRealtime;
                        } else {
                            bufferedProgressFromPosition = -1.0f;
                        }
                    }
                    if (PhotoViewer.this.inPreview || PhotoViewer.this.videoTimelineViewContainer.getVisibility() != 0) {
                        if (PhotoViewer.this.seekToProgressPending == 0.0f) {
                            PhotoViewer photoViewer = PhotoViewer.this;
                            OldVideoPlayerRewinder oldVideoPlayerRewinder = photoViewer.longVideoPlayerRewinder;
                            if (oldVideoPlayerRewinder.rewindCount == 0 || (!oldVideoPlayerRewinder.rewindByBackSeek && !photoViewer.videoPlayerRewinder.rewindByBackSeek)) {
                                PhotoViewer.this.videoPlayerSeekbar.setProgress(currentVideoPosition2, false);
                            }
                        }
                        if (bufferedProgressFromPosition != -1.0f) {
                            PhotoViewer.this.videoPlayerSeekbar.setBufferedProgress(bufferedProgressFromPosition);
                            PipVideoOverlay.setBufferedProgress(bufferedProgressFromPosition);
                        }
                    } else if (currentVideoPosition2 >= PhotoViewer.this.videoTimelineView.getRightProgress()) {
                        PhotoViewer.this.manuallyPaused = false;
                        PhotoViewer.this.pauseVideoOrWeb();
                        PhotoViewer.this.videoPlayerSeekbar.setProgress(0.0f);
                        PhotoViewer.this.seekVideoOrWebTo((int) (r1.videoTimelineView.getLeftProgress() * PhotoViewer.this.getVideoDuration()));
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
                        final String str = PhotoViewer.this.shouldSavePositionForCurrentVideo;
                        PhotoViewer.this.lastSaveTime = SystemClock.elapsedRealtime();
                        if (PhotoViewer.this.currentMessageObject != null) {
                            PhotoViewer.this.currentMessageObject.cachedSavedTimestamp = Float.valueOf(currentVideoPosition2);
                        }
                        Utilities.globalQueue.postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                PhotoViewer.AnonymousClass6.lambda$run$0(str, currentVideoPosition2);
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

        public static void lambda$run$0(String str, float f) {
            ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putFloat(str, f).commit();
        }
    }

    class AnonymousClass7 implements Runnable {
        AnonymousClass7() {
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
                final TextureViewContainer textureViewContainer = new TextureViewContainer(PhotoViewer.this.parentActivity);
                try {
                    if (PhotoViewer.this.usedSurfaceView) {
                        Drawable drawable = PhotoViewer.this.textureImageView.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            PhotoViewer.this.currentBitmap = ((BitmapDrawable) drawable).getBitmap();
                            if (PhotoViewer.this.currentBitmap != null) {
                                if (PhotoViewer.this.textureImageView != null) {
                                    PhotoViewer.this.textureImageView.setVisibility(0);
                                    PhotoViewer.this.textureImageView.setImageBitmap(PhotoViewer.this.currentBitmap);
                                }
                                textureViewContainer.imageReceiver.setImageBitmap(PhotoViewer.this.currentBitmap);
                            }
                        } else {
                            PhotoViewer photoViewer = PhotoViewer.this;
                            photoViewer.currentBitmap = Bitmaps.createBitmap(photoViewer.videoSurfaceView.getWidth(), PhotoViewer.this.videoSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                            AndroidUtilities.getBitmapFromSurface(PhotoViewer.this.videoSurfaceView, PhotoViewer.this.currentBitmap, new Runnable() {
                                @Override
                                public final void run() {
                                    this.f$0.lambda$run$0(textureViewContainer);
                                }
                            });
                        }
                    } else {
                        PhotoViewer photoViewer2 = PhotoViewer.this;
                        photoViewer2.currentBitmap = Bitmaps.createBitmap(photoViewer2.videoTextureView.getWidth(), PhotoViewer.this.videoTextureView.getHeight(), Bitmap.Config.ARGB_8888);
                        PhotoViewer.this.videoTextureView.getBitmap(PhotoViewer.this.currentBitmap);
                        if (PhotoViewer.this.currentBitmap != null) {
                            if (PhotoViewer.this.textureImageView != null) {
                                PhotoViewer.this.textureImageView.setVisibility(0);
                                PhotoViewer.this.textureImageView.setImageBitmap(PhotoViewer.this.currentBitmap);
                            }
                            textureViewContainer.imageReceiver.setImageBitmap(PhotoViewer.this.currentBitmap);
                        }
                    }
                } catch (Throwable th) {
                    if (PhotoViewer.this.currentBitmap != null) {
                        PhotoViewer.this.currentBitmap.recycle();
                        PhotoViewer.this.currentBitmap = null;
                    }
                    FileLog.e(th);
                }
                PhotoViewer.this.isInline = true;
                PhotoViewer photoViewer3 = PhotoViewer.this;
                photoViewer3.changedTextureView = textureViewContainer.textureView;
                if (PipVideoOverlay.show(false, photoViewer3.parentActivity, textureViewContainer, PhotoViewer.this.videoWidth, PhotoViewer.this.videoHeight, PhotoViewer.this.pipVideoOverlayAnimateFlag)) {
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

        public void lambda$run$0(TextureViewContainer textureViewContainer) {
            if (PhotoViewer.this.currentBitmap != null) {
                if (PhotoViewer.this.textureImageView != null) {
                    PhotoViewer.this.textureImageView.setVisibility(0);
                    PhotoViewer.this.textureImageView.setImageBitmap(PhotoViewer.this.currentBitmap);
                }
                textureViewContainer.imageReceiver.setImageBitmap(PhotoViewer.this.currentBitmap);
            }
        }
    }

    public void checkChangedTextureView(boolean z) {
        if (z) {
            TextureView textureView = this.changedTextureView;
            if (textureView == null) {
                return;
            }
            textureView.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass9());
            this.changedTextureView.invalidate();
            return;
        }
        if (this.waitingForFirstTextureUpload == 2) {
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
            final View view = this.usedSurfaceView ? this.videoSurfaceView : this.videoTextureView;
            AspectRatioFrameLayout aspectRatioFrameLayout = this.aspectRatioFrameLayout;
            if (aspectRatioFrameLayout == null) {
                return;
            }
            aspectRatioFrameLayout.getLocationInWindow(this.pipPosition);
            this.pipPosition[1] = (int) (r5[1] - this.containerView.getTranslationY());
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
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$checkChangedTextureView$3(valueAnimator);
                }
            });
            float x = this.usedSurfaceView ? 0.0f : this.pipPosition[0] - this.aspectRatioFrameLayout.getX();
            float y = this.usedSurfaceView ? 0.0f : this.pipPosition[1] - this.aspectRatioFrameLayout.getY();
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(valueAnimatorOfFloat);
            ImageView imageView3 = this.textureImageView;
            Property property = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property, 1.0f));
            ImageView imageView4 = this.textureImageView;
            Property property2 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(imageView4, (Property<ImageView, Float>) property2, 1.0f));
            ImageView imageView5 = this.textureImageView;
            Property property3 = View.TRANSLATION_X;
            arrayList.add(ObjectAnimator.ofFloat(imageView5, (Property<ImageView, Float>) property3, this.usedSurfaceView ? 0.0f : this.pipPosition[0]));
            ImageView imageView6 = this.textureImageView;
            Property property4 = View.TRANSLATION_Y;
            arrayList.add(ObjectAnimator.ofFloat(imageView6, (Property<ImageView, Float>) property4, this.usedSurfaceView ? 0.0f : this.pipPosition[1]));
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property3, x));
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property4, y));
            arrayList.add(ObjectAnimator.ofInt(this.backgroundDrawable, (Property<BackgroundDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, 255));
            FirstFrameView firstFrameView2 = this.firstFrameView;
            if (firstFrameView2 != null) {
                arrayList.add(ObjectAnimator.ofFloat(firstFrameView2, (Property<FirstFrameView, Float>) property, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.firstFrameView, (Property<FirstFrameView, Float>) property2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.firstFrameView, (Property<FirstFrameView, Float>) property3, x));
                arrayList.add(ObjectAnimator.ofFloat(this.firstFrameView, (Property<FirstFrameView, Float>) property4, y));
            }
            float f = PipVideoOverlay.getPipRect(false, this.aspectRatioFrameLayout.getAspectRatio()).width;
            view.getWidth();
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$checkChangedTextureView$4(view, valueAnimator);
                }
            });
            arrayList.add(valueAnimatorOfFloat2);
            animatorSet.playTogether(arrayList);
            DecelerateInterpolator decelerateInterpolator2 = new DecelerateInterpolator();
            animatorSet.setInterpolator(decelerateInterpolator2);
            animatorSet.setDuration(250L);
            SurfaceView surfaceView = this.videoSurfaceView;
            if (surfaceView != null) {
                surfaceView.setVisibility(0);
            }
            animatorSet.addListener(new AnimatorListenerAdapter() {
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
            this.waitingForFirstTextureUpload = 0;
        }
    }

    class AnonymousClass9 implements ViewTreeObserver.OnPreDrawListener {
        AnonymousClass9() {
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
                            this.f$0.lambda$onPreDraw$0();
                        }
                    }, 300L);
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onPreDraw$1();
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
        public ArrayList croppedMediaEntities;
        public String croppedPaintPath;
        public ArrayList mediaEntities;
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

    private class SavedState {
        private int index;
        private ArrayList messages;
        private PhotoViewerProvider provider;

        public SavedState(int i, ArrayList arrayList, PhotoViewerProvider photoViewerProvider) {
            this.messages = arrayList;
            this.index = i;
            this.provider = photoViewerProvider;
        }

        public void restore() throws Resources.NotFoundException, NumberFormatException {
            PhotoViewer.this.placeProvider = this.provider;
            PhotoViewer.this.windowLayoutParams.flags = -2147286784;
            PhotoViewer.this.windowLayoutParams.softInputMode = 272;
            PhotoViewer.this.windowView.setFocusable(false);
            PhotoViewer.this.containerView.setFocusable(false);
            PhotoViewer.this.backgroundDrawable.setAlpha(255);
            PhotoViewer.this.containerView.setAlpha(1.0f);
            PhotoViewer photoViewer = PhotoViewer.this;
            ArrayList arrayList = this.messages;
            int i = this.index;
            photoViewer.onPhotoShow(null, null, null, null, arrayList, null, null, i, this.provider.getPlaceForPhoto((MessageObject) arrayList.get(i), null, this.index, true, false));
        }
    }

    class BackgroundDrawable extends ColorDrawable {
        private boolean allowDrawContent;
        private Runnable drawRunnable;
        private final Paint paint;
        private final RectF rect;
        private final RectF visibleRect;

        public BackgroundDrawable(int i) {
            super(i);
            this.rect = new RectF();
            this.visibleRect = new RectF();
            Paint paint = new Paint(1);
            this.paint = paint;
            paint.setColor(i);
        }

        public void checkAllowDrawContent() {
            if (PhotoViewer.this.activityVisibilityController != null) {
                PhotoViewer.this.activityVisibilityController.setHidden(!this.allowDrawContent);
            }
            if (PhotoViewer.this.parentAlertWindowVisibilityController != null) {
                PhotoViewer.this.parentAlertWindowVisibilityController.setHidden(!this.allowDrawContent);
            }
            if (PhotoViewer.this.parentAlert != null) {
                PhotoViewer.this.parentAlert.setAllowDrawContent(this.allowDrawContent);
            }
        }

        @Override
        public void setAlpha(int i) {
            if (PhotoViewer.this.parentActivity instanceof LaunchActivity) {
                boolean z = (PhotoViewer.this.isVisible && i == 255) ? false : true;
                this.allowDrawContent = z;
                if (z) {
                    checkAllowDrawContent();
                } else {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.checkAllowDrawContent();
                        }
                    }, 70L);
                }
            }
            super.setAlpha(i);
            this.paint.setAlpha(i);
        }

        @Override
        public void draw(Canvas canvas) {
            Runnable runnable;
            if (PhotoViewer.this.textureViewSkipRender) {
                return;
            }
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

    private static class SelectedPhotosListView extends RecyclerListView {
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
                @Override
                protected void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
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
                int iMin = Integer.MAX_VALUE;
                int iMax = Integer.MIN_VALUE;
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    iMin = (int) Math.min(iMin, Math.floor(childAt.getX()));
                    iMax = (int) Math.max(iMax, Math.ceil(childAt.getX() + childAt.getMeasuredWidth()));
                }
                if (iMin == Integer.MAX_VALUE || iMax == Integer.MIN_VALUE) {
                    return;
                }
                this.rect.set(iMin - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), iMax + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(103.0f));
                canvas.drawRoundRect(this.rect, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.paint);
            }
        }
    }

    private static class CounterView extends View {
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
            this.textPaint.setTypeface(AndroidUtilities.bold());
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
        public void setScaleX(float f) {
            super.setScaleX(f);
            invalidate();
        }

        @Override
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
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<CounterView, Float>) View.SCALE_X, 0.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<CounterView, Float>) View.SCALE_Y, 0.0f);
                Paint paint = this.paint;
                Property property = AnimationProperties.PAINT_ALPHA;
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofInt(paint, (Property<Paint, Integer>) property, 0), ObjectAnimator.ofInt(this.textPaint, (Property<TextPaint, Integer>) property, 0));
                animatorSet.setInterpolator(new DecelerateInterpolator());
            } else {
                int i2 = this.currentCount;
                if (i2 == 0) {
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, (Property<CounterView, Float>) View.SCALE_X, 0.0f, 1.0f);
                    ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this, (Property<CounterView, Float>) View.SCALE_Y, 0.0f, 1.0f);
                    Paint paint2 = this.paint;
                    Property property2 = AnimationProperties.PAINT_ALPHA;
                    animatorSet.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4, ObjectAnimator.ofInt(paint2, (Property<Paint, Integer>) property2, 0, 255), ObjectAnimator.ofInt(this.textPaint, (Property<TextPaint, Integer>) property2, 0, 255));
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                } else if (i < i2) {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<CounterView, Float>) View.SCALE_X, 1.1f, 1.0f), ObjectAnimator.ofFloat(this, (Property<CounterView, Float>) View.SCALE_Y, 1.1f, 1.0f));
                    animatorSet.setInterpolator(new OvershootInterpolator());
                } else {
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<CounterView, Float>) View.SCALE_X, 0.9f, 1.0f), ObjectAnimator.ofFloat(this, (Property<CounterView, Float>) View.SCALE_Y, 0.9f, 1.0f));
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
                int iCenterX = (int) this.rect.centerX();
                int iCenterY = (int) (((int) this.rect.centerY()) - (AndroidUtilities.dp(5.0f) * (1.0f - this.rotation)));
                canvas.drawLine(AndroidUtilities.dp(5.0f) + iCenterX, iCenterY - AndroidUtilities.dp(5.0f), iCenterX - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f) + iCenterY, this.paint);
                canvas.drawLine(iCenterX - AndroidUtilities.dp(5.0f), iCenterY - AndroidUtilities.dp(5.0f), iCenterX + AndroidUtilities.dp(5.0f), iCenterY + AndroidUtilities.dp(5.0f), this.paint);
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Button");
            int i = this.currentCount;
            if (i > 0) {
                accessibilityNodeInfo.setContentDescription(LocaleController.formatPluralString("PhotosSelected", i, new Object[0]));
            }
        }
    }

    private class PhotoProgressView {
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

        protected abstract void onBackgroundStateUpdated(int i);

        protected abstract void onVisibilityChanged(boolean z);

        public PhotoProgressView(View view) {
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
            this.playDrawable = new CombinedDrawable(ContextCompat.getDrawable(PhotoViewer.this.parentActivity, R.drawable.circle_big).mutate(), playPauseDrawable);
        }

        private void updateAnimation(boolean z) {
            boolean z2;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.lastUpdateTime;
            if (j > 18) {
                j = 18;
            }
            this.lastUpdateTime = jCurrentTimeMillis;
            int i = 0;
            if (z) {
                if (this.animatedProgressValue == 1.0f && this.currentProgress == 1.0f) {
                    z2 = false;
                } else {
                    this.radOffset += (360 * j) / 3000.0f;
                    float f = this.currentProgress - this.animationProgressStart;
                    if (Math.abs(f) > 0.0f) {
                        long j2 = this.currentProgressTime + j;
                        this.currentProgressTime = j2;
                        if (j2 < 300) {
                            this.animatedProgressValue = this.animationProgressStart + (f * PhotoViewer.decelerateInterpolator.getInterpolation(this.currentProgressTime / 300.0f));
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
                    float f4 = f3 - (j / 200.0f);
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
                float f6 = fArr2[i];
                if (f5 > f6) {
                    fArr2[i] = Math.min(1.0f, f6 + (j / 200.0f));
                } else if (f5 < f6) {
                    fArr2[i] = Math.max(0.0f, f6 - (j / 200.0f));
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
            float interpolation;
            float f = 1.0f;
            int i = 0;
            while (true) {
                float[] fArr = this.animAlphas;
                if (i >= fArr.length) {
                    return f;
                }
                if (i == 2) {
                    interpolation = AndroidUtilities.accelerateInterpolator.getInterpolation(fArr[i]);
                } else {
                    interpolation = fArr[i];
                }
                f *= interpolation;
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
            float fCalculateAlpha = calculateAlpha();
            int i3 = this.previousBackgroundState;
            if (i3 >= 0 && i3 < PhotoViewer.progressDrawables.length + 2) {
                if (this.previousBackgroundState < PhotoViewer.progressDrawables.length) {
                    drawable2 = PhotoViewer.progressDrawables[this.previousBackgroundState];
                } else {
                    drawable2 = this.playDrawable;
                }
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (this.animatedAlphaValue * 255.0f * fCalculateAlpha));
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
                        drawable.setAlpha((int) ((1.0f - this.animatedAlphaValue) * 255.0f * fCalculateAlpha));
                    } else {
                        drawable.setAlpha((int) (fCalculateAlpha * 255.0f));
                    }
                    drawable.setBounds(x, y, x + i2, y + i2);
                    drawable.draw(canvas);
                }
            }
            int i5 = this.backgroundState;
            if (i5 == 0 || i5 == 1 || (i = this.previousBackgroundState) == 0 || i == 1) {
                int iDp = AndroidUtilities.dp(4.0f);
                if (this.previousBackgroundState != -2) {
                    PhotoViewer.progressPaint.setAlpha((int) (this.animatedAlphaValue * 255.0f * fCalculateAlpha));
                } else {
                    PhotoViewer.progressPaint.setAlpha((int) (fCalculateAlpha * 255.0f));
                }
                this.progressRect.set(x + iDp, y + iDp, (x + i2) - iDp, (y + i2) - iDp);
                canvas.drawArc(this.progressRect, this.radOffset - 90.0f, Math.max(4.0f, this.animatedProgressValue * 360.0f), false, PhotoViewer.progressPaint);
                updateAnimation(true);
                return;
            }
            updateAnimation(false);
        }
    }

    class FrameLayoutDrawer extends SizeNotifierFrameLayoutPhoto {
        private boolean captionAbove;
        private ArrayList exclusionRects;
        private boolean ignoreLayout;
        private Paint paint;

        public FrameLayoutDrawer(Context context, Activity activity) {
            super(context, activity, false);
            this.paint = new Paint();
            setWillNotDraw(false);
            this.paint.setColor(855638016);
            setLayerType(2, null);
        }

        @Override
        protected void onMeasure(int r19, int r20) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.FrameLayoutDrawer.onMeasure(int, int):void");
        }

        @Override
        protected void onLayout(boolean r21, int r22, int r23, int r24, int r25) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.FrameLayoutDrawer.onLayout(boolean, int, int, int, int):void");
        }

        public void updateExclusionRects() {
            if (Build.VERSION.SDK_INT >= 29) {
                if (this.exclusionRects == null) {
                    this.exclusionRects = new ArrayList();
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
            if (!isStatusBarVisible() || AndroidUtilities.statusBarHeight == 0 || PhotoViewer.this.actionBar == null) {
                return;
            }
            this.paint.setAlpha((int) (PhotoViewer.this.actionBar.getAlpha() * 255.0f * 0.498f));
            if (getPaddingRight() > 0) {
                canvas.drawRect(getMeasuredWidth() - getPaddingRight(), 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.paint);
            }
            if (getPaddingLeft() > 0) {
                canvas.drawRect(0.0f, 0.0f, getPaddingLeft(), getMeasuredHeight(), this.paint);
            }
            if (getPaddingBottom() > 0) {
                float fDpf2 = AndroidUtilities.dpf2(24.0f) * (1.0f - PhotoViewer.this.actionBar.getAlpha());
                canvas.drawRect(0.0f, (getMeasuredHeight() - getPaddingBottom()) + fDpf2, getMeasuredWidth(), getMeasuredHeight() + fDpf2, this.paint);
            }
        }

        @Override
        public void draw(Canvas canvas) {
            super.draw(canvas);
            if (PhotoViewer.this.photoViewerWebView == null || !PhotoViewer.this.photoViewerWebView.isControllable()) {
                return;
            }
            int measuredHeight = ((int) (PhotoViewer.this.photoViewerWebView.getWebView().getMeasuredHeight() * (PhotoViewer.this.scale - 1.0f))) / 2;
            if (PhotoViewer.this.videoForwardDrawable != null && PhotoViewer.this.videoForwardDrawable.isAnimating()) {
                PhotoViewer.this.videoForwardDrawable.setBounds(PhotoViewer.this.photoViewerWebView.getLeft(), (PhotoViewer.this.photoViewerWebView.getWebView().getTop() - measuredHeight) + ((int) (PhotoViewer.this.translationY / PhotoViewer.this.scale)), PhotoViewer.this.photoViewerWebView.getRight(), PhotoViewer.this.photoViewerWebView.getWebView().getBottom() + measuredHeight + ((int) (PhotoViewer.this.translationY / PhotoViewer.this.scale)));
                PhotoViewer.this.videoForwardDrawable.draw(canvas);
            }
            if (PhotoViewer.this.seekSpeedDrawable == null || !PhotoViewer.this.seekSpeedDrawable.isShown()) {
                return;
            }
            PhotoViewer.this.seekSpeedDrawable.setBounds(PhotoViewer.this.photoViewerWebView.getLeft(), (int) (AndroidUtilities.statusBarHeight + (AndroidUtilities.dp(90.0f) * PhotoViewer.this.actionBar.getAlpha())), PhotoViewer.this.photoViewerWebView.getRight(), PhotoViewer.this.photoViewerWebView.getWebView().getBottom() + measuredHeight + ((int) (PhotoViewer.this.translationY / PhotoViewer.this.scale)));
            PhotoViewer.this.seekSpeedDrawable.draw(canvas);
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view == PhotoViewer.this.leftPaintingOverlay || view == PhotoViewer.this.rightPaintingOverlay) {
                return false;
            }
            return drawChildInternal(canvas, view, j);
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
            boolean zDrawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return zDrawChild;
        }

        @Override
        public void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        @Override
        protected void onAttachedToWindow() {
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
                public int getBottomOffset(int i) {
                    int height = 0;
                    if (PhotoViewer.this.editing) {
                        if (PhotoViewer.this.captionEdit != null) {
                            height = PhotoViewer.this.captionEdit.keyboardNotifier.getKeyboardHeight();
                            if (PhotoViewer.this.captionEdit.getVisibility() == 0 && (PhotoViewer.this.placeProvider == null || !PhotoViewer.this.placeProvider.isCaptionAbove())) {
                                height += PhotoViewer.this.captionEdit.getEditTextHeight() + AndroidUtilities.dp(12.0f);
                            }
                        }
                        return (PhotoViewer.this.pickerView == null || PhotoViewer.this.pickerView.getVisibility() != 0) ? height : (PhotoViewer.this.captionEdit == null || !PhotoViewer.this.captionEdit.keyboardNotifier.keyboardVisible()) ? height + PhotoViewer.this.pickerView.getHeight() : height;
                    }
                    if (PhotoViewer.this.bottomLayout != null && PhotoViewer.this.bottomLayout.getVisibility() == 0) {
                        height = (int) (0 + (PhotoViewer.this.bottomLayout.getHeight() * PhotoViewer.this.bottomLayout.getAlpha()));
                    }
                    return (PhotoViewer.this.groupedPhotosListView == null || !PhotoViewer.this.groupedPhotosListView.hasPhotos()) ? height : (AndroidUtilities.isTablet() || PhotoViewer.this.containerView.getMeasuredHeight() > PhotoViewer.this.containerView.getMeasuredWidth()) ? (int) (height + (PhotoViewer.this.groupedPhotosListView.getHeight() * PhotoViewer.this.groupedPhotosListView.getAlpha())) : height;
                }

                @Override
                public int getTopOffset(int i) {
                    return (FrameLayoutDrawer.this.isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0) + ActionBar.getCurrentActionBarHeight() + ((int) (PhotoViewer.this.topCaptionEdit.getAlpha() * PhotoViewer.this.topCaptionEdit.getEditTextHeight()));
                }
            });
        }

        @Override
        protected void onDetachedFromWindow() {
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

    class VideoPlayerControlFrameLayout extends FrameLayout {
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
            this.progress = 1.0f;
            this.translationYAnimationEnabled = true;
            this.timeValue = new FloatValueHolder(0.0f);
            this.timeSpring = (SpringAnimation) new SpringAnimation(this.timeValue).setSpring(new SpringForce(0.0f).setStiffness(750.0f).setDampingRatio(1.0f)).addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                @Override
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                    this.f$0.lambda$new$0(dynamicAnimation, f, f2);
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
        protected void onMeasure(int r13, int r14) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.VideoPlayerControlFrameLayout.onMeasure(int, int):void");
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            float currentPosition = PhotoViewer.this.videoPlayer != null ? PhotoViewer.this.videoPlayer.getCurrentPosition() / PhotoViewer.this.videoPlayer.getDuration() : 0.0f;
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

        public CaptionScrollView(Context context, CaptionTextViewSwitcher captionTextViewSwitcher, FrameLayout frameLayout) throws NoSuchFieldException, NoSuchMethodException, SecurityException {
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
                    this.f$0.lambda$new$0(dynamicAnimation, f, f2);
                }
            });
            springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                @Override
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                    this.f$0.lambda$new$1(dynamicAnimation, z, f, f2);
                }
            });
            springAnimation.getSpring().setDampingRatio(1.0f);
            try {
                Method declaredMethod = NestedScrollView.class.getDeclaredMethod("abortAnimatedScroll", null);
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
        protected void onMeasure(int i, int i2) {
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
            int iCalculateNewContainerMarginTop = calculateNewContainerMarginTop(i, i2);
            if (iCalculateNewContainerMarginTop >= 0) {
                if (this.dontChangeTopMargin) {
                    this.pendingTopMargin = iCalculateNewContainerMarginTop;
                } else {
                    ((ViewGroup.MarginLayoutParams) this.captionContainer.getLayoutParams()).topMargin = iCalculateNewContainerMarginTop;
                    this.pendingTopMargin = -1;
                }
            }
        }

        public int calculateNewContainerMarginTop(int i, int i2) {
            int fontMetricsInt;
            int iDp;
            if (i == 0 || i2 == 0) {
                return -1;
            }
            TextView currentView = this.captionTextViewSwitcher.getCurrentView();
            CharSequence text = currentView.getText();
            int iHashCode = text.hashCode();
            Point point = AndroidUtilities.displaySize;
            boolean z = point.x > point.y;
            if (this.textHash == iHashCode && this.isLandscape == z && this.prevHeight == i2) {
                return -1;
            }
            this.textHash = iHashCode;
            this.isLandscape = z;
            this.prevHeight = i2;
            currentView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
            Layout layout = currentView.getLayout();
            int lineCount = layout.getLineCount();
            if ((z && lineCount <= 2) || (!z && lineCount <= 5)) {
                fontMetricsInt = i2 - currentView.getMeasuredHeight();
                iDp = this.captionTextViewSwitcher.getPaddingBottom();
            } else {
                int iMin = Math.min(z ? 2 : 5, lineCount);
                loop0: while (iMin > 1) {
                    int i3 = iMin - 1;
                    for (int lineStart = layout.getLineStart(i3); lineStart < layout.getLineEnd(i3); lineStart++) {
                        if (!Character.isWhitespace(text.charAt(lineStart))) {
                            break loop0;
                        }
                    }
                    iMin--;
                }
                fontMetricsInt = i2 - (currentView.getPaint().getFontMetricsInt(null) * iMin);
                iDp = AndroidUtilities.dp(8.0f);
            }
            return fontMetricsInt - iDp;
        }

        public void reset() {
            scrollTo(0, 0);
        }

        public void stopScrolling() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Method method = this.abortAnimatedScrollMethod;
            if (method != null) {
                try {
                    method.invoke(this, null);
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
                            iArr[1] = (int) (0 + f2 + f3);
                        } else {
                            this.overScrollY = f3;
                            iArr[1] = i2;
                        }
                    } else if (f3 > 0.0f) {
                        this.overScrollY = 0.0f;
                        iArr[1] = (int) (0 + f2 + f3);
                    } else {
                        this.overScrollY = f3;
                        iArr[1] = i2;
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
                int iRound = Math.round(i4 * (1.0f - Math.abs((-this.overScrollY) / (this.captionContainer.getTop() - ((isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0) + ActionBar.getCurrentActionBarHeight())))));
                if (iRound != 0) {
                    if (!this.nestedScrollStarted) {
                        if (!this.springAnimation.isRunning()) {
                            OverScroller overScroller = this.scroller;
                            float currVelocity = overScroller != null ? overScroller.getCurrVelocity() : Float.NaN;
                            if (Float.isNaN(currVelocity)) {
                                f = 0.0f;
                            } else {
                                Point point = AndroidUtilities.displaySize;
                                float fMin = Math.min(point.x > point.y ? 3000.0f : 5000.0f, currVelocity);
                                iRound = (int) ((iRound * fMin) / currVelocity);
                                f = fMin * (-this.velocitySign);
                            }
                            if (iRound != 0) {
                                float f2 = this.overScrollY - iRound;
                                this.overScrollY = f2;
                                this.captionTextViewSwitcher.setTranslationY(f2);
                            }
                            startSpringAnimationIfNotRunning(f);
                        }
                    } else {
                        float f3 = this.overScrollY - iRound;
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
            int iSave = canvas.save();
            int i = height + scrollY;
            canvas.clipRect(0, scrollY, width, i);
            this.paint.setAlpha((int) (this.backgroundAlpha * 127.0f));
            canvas.drawRect(0.0f, this.captionContainer.getTop() + this.captionTextViewSwitcher.getTranslationY(), width, i, this.paint);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    public static PhotoViewer getPipInstance() {
        return PipInstance;
    }

    public static PhotoViewer getInstance() {
        PhotoViewer photoViewer = Instance;
        if (photoViewer == null) {
            synchronized (PhotoViewer.class) {
                try {
                    photoViewer = Instance;
                    if (photoViewer == null) {
                        photoViewer = new PhotoViewer();
                        Instance = photoViewer;
                    }
                } finally {
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
                this.f$0.lambda$new$0();
            }
        };
        this.isActionBarVisible = true;
        this.closePhotoAfterSelect = true;
        this.closePhotoAfterSelectWithAnimation = false;
        this.iBlur3BlurredDrawables = new ReferenceList();
        this.videoQualityItems = new ArrayList();
        this.actionBarItemsVisibility = new HashMap(3);
        this.backgroundDrawable = new BackgroundDrawable(-16777216);
        this.blackPaint = new Paint();
        this.photoProgressViews = new PhotoProgressView[3];
        this.onUserLeaveHintListener = new Runnable() {
            @Override
            public final void run() {
                this.f$0.onUserLeaveHint();
            }
        };
        this.pressedDrawable = new GradientDrawable[2];
        this.drawPressedDrawable = new boolean[2];
        this.pressedDrawableAlpha = new float[2];
        this.cropTransform = new CropTransform();
        this.leftCropTransform = new CropTransform();
        this.rightCropTransform = new CropTransform();
        this.shiftDp = -8.0f;
        this.insets = new Rect();
        this.setLoadingRunnable = new Runnable() {
            @Override
            public void run() {
                if (PhotoViewer.this.currentMessageObject == null) {
                    return;
                }
                FileLoader.getInstance(PhotoViewer.this.currentMessageObject.currentAccount).setLoadingVideo(PhotoViewer.this.currentMessageObject.getDocument(), true, false);
            }
        };
        this.hideActionBarRunnable = new Runnable() {
            @Override
            public void run() {
                if (PhotoViewer.this.videoPlayerControlVisible && PhotoViewer.this.isPlaying && !ApplicationLoader.mainInterfacePaused) {
                    if (PhotoViewer.this.menuItem == null || !PhotoViewer.this.menuItem.isSubMenuShowing()) {
                        if (PhotoViewer.this.videoItem == null || !PhotoViewer.this.videoItem.isSubMenuShowing()) {
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
            }
        };
        this.videoPlayerControlVisible = true;
        this.videoPlayerCurrentTime = new int[2];
        this.videoPlayerTotalTime = new int[2];
        this.fullscreenButton = new ImageView[3];
        this.pipPosition = new int[2];
        this.pipVideoOverlayAnimateFlag = true;
        this.lastImageId = -1;
        this.prevOrientation = -10;
        this.longVideoPlayerRewinder = new OldVideoPlayerRewinder() {
            @Override
            protected void onRewindCanceled() throws NumberFormatException {
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
        VideoFramesRewinder videoFramesRewinder = new VideoFramesRewinder();
        this.framesRewinder = videoFramesRewinder;
        this.videoPlayerRewinder = new VideoPlayerRewinder(videoFramesRewinder) {
            @Override
            protected void onRewindCanceled() throws NumberFormatException {
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
        this.FLASH_VIEW_VALUE = new AnimationProperties.FloatProperty("flashViewAlpha") {
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
        this.updateProgressRunnable = new AnonymousClass6();
        this.switchToInlineRunnable = new AnonymousClass7();
        this.surfaceTextureListener = new TextureView.SurfaceTextureListener() {
            @Override
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            @Override
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            @Override
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                if (PhotoViewer.this.videoTextureView == null) {
                    return true;
                }
                if (!PipVideoOverlay.isVisible() || PipVideoOverlay.getPipSource() == null || !PipVideoOverlay.getPipSource().state2.isAttachedToPip()) {
                    if (!PhotoViewer.this.changingTextureView) {
                        return true;
                    }
                    if (PhotoViewer.this.switchingInlineMode) {
                        PhotoViewer.this.waitingForFirstTextureUpload = 2;
                    }
                    PhotoViewer.this.videoTextureView.setSurfaceTexture(surfaceTexture);
                    PhotoViewer.this.videoTextureView.setVisibility(0);
                    PhotoViewer.this.changingTextureView = false;
                    PhotoViewer.this.containerView.invalidate();
                    return false;
                }
                PipVideoOverlay.getPipTextureView().setSurfaceTexture(surfaceTexture);
                PipVideoOverlay.getPipTextureView().setVisibility(0);
                return false;
            }

            @Override
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (PhotoViewer.this.waitingForFirstTextureUpload == 1) {
                    PhotoViewer.this.checkChangedTextureView(true);
                }
            }
        };
        this.animationValues = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 2, 13);
        this.updateContainerFlagsRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$5();
            }
        };
        this.leftImage = new ImageReceiver();
        this.centerImage = new ImageReceiver() {
            @Override
            protected boolean setImageBitmapByKey(Drawable drawable, String str, int i, boolean z, int i2) {
                boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i, z, i2);
                PhotoViewer.this.prepareSegmentImage();
                return imageBitmapByKey;
            }
        };
        this.rightImage = new ImageReceiver();
        this.leftBlur = new BlurringShader.ThumbBlurer(1, new PhotoViewer$$ExternalSyntheticLambda71(this));
        this.centerBlur = new BlurringShader.ThumbBlurer(1, new PhotoViewer$$ExternalSyntheticLambda71(this));
        this.rightBlur = new BlurringShader.ThumbBlurer(1, new PhotoViewer$$ExternalSyntheticLambda71(this));
        this.centerImageTransformLocked = false;
        this.centerImageTransform = new Matrix();
        this.videoFrameBitmapPaint = new Paint();
        this.videoFrameBitmap = null;
        this.editState = new EditState();
        this.currentFileNames = new String[3];
        this.endReached = new boolean[]{false, true};
        this.startReached = false;
        this.scale = 1.0f;
        this.currentCropScale = 1.0f;
        this.currentCropX = 0.0f;
        this.currentCropY = 0.0f;
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
        this.imagesArrTemp = new ArrayList();
        this.imagesByIdsTemp = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.imagesArr = new ArrayList();
        this.imagesByIds = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.imagesArrLocations = new ArrayList();
        this.imagesArrLocationsVideo = new ArrayList();
        this.imagesArrLocationsSizes = new ArrayList();
        this.imagesArrMessages = new ArrayList();
        this.secureDocuments = new ArrayList();
        this.avatarsArr = new ArrayList();
        this.imagesArrLocals = new ArrayList();
        this.currentAvatarLocation = null;
        this.savedState = null;
        this.hitRect = new Rect();
        this.transitionNotificationLocker = new AnimationNotificationsLocker(new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaDidLoad, NotificationCenter.dialogPhotosUpdate});
        this.captionEditAlpha = new float[]{1.0f};
        this.topCaptionEditAlpha = new float[]{1.0f};
        this.longPressRunnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.onLongPress();
            }
        };
        this.tempInt = new int[2];
        this.captureFrameAtTime = -1L;
        this.captureFrameReadyAtTime = -1L;
        this.needCaptureFrameReadyAtTime = -1L;
        this.compressionsCount = -1;
        this.blurAlpha = new AnimatedFloat(new PhotoViewer$$ExternalSyntheticLambda71(this), 180L, CubicBezierInterpolator.EASE_OUT);
        this.renderNodeHashBuilder = new Blur3HashImpl();
        this.matrixRenderNodes = new LongSparseArray();
        this.blackPaint.setColor(-16777216);
        this.videoFrameBitmapPaint.setColor(-1);
        this.centerImage.setFileLoadingPriority(3);
    }

    @Override
    public void didReceivedNotification(int r31, int r32, java.lang.Object... r33) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public void showDownloadAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.parentActivity, this.resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.AppName));
        builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.isVideo() && FileLoader.getInstance(this.currentMessageObject.currentAccount).isLoadingFile(this.currentFileNames[0])) {
            builder.setMessage(LocaleController.getString(R.string.PleaseStreamDownload));
        } else {
            builder.setMessage(LocaleController.getString(R.string.PleaseDownload));
        }
        showAlertDialog(builder);
    }

    public void onSharePressed() {
        File file;
        boolean zIsVideo;
        if (this.parentActivity == null || !this.allowShare) {
            return;
        }
        try {
            MessageObject messageObject = this.currentMessageObject;
            File pathToAttach = null;
            if (messageObject != null) {
                zIsVideo = messageObject.isVideo();
                if (!TextUtils.isEmpty(this.currentMessageObject.messageOwner.attachPath)) {
                    File file2 = new File(this.currentMessageObject.messageOwner.attachPath);
                    if (file2.exists()) {
                        pathToAttach = file2;
                    }
                }
                if (pathToAttach == null) {
                    pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToMessage(this.currentMessageObject.messageOwner);
                }
            } else if (this.currentFileLocationVideo != null) {
                pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(getFileLocation(this.currentFileLocationVideo), getFileLocationExt(this.currentFileLocationVideo), this.avatarsDialogId != 0 || this.isEvent);
                if (pathToAttach != null) {
                    if (!pathToAttach.exists()) {
                    }
                    zIsVideo = false;
                }
                file = FileLoader.getInstance(this.currentAccount).getPathToAttach(getFileLocation(this.currentFileLocationVideo), getFileLocationExt(this.currentFileLocationVideo), false);
                pathToAttach = file;
                zIsVideo = false;
            } else {
                PageBlocksAdapter pageBlocksAdapter = this.pageBlocksAdapter;
                if (pageBlocksAdapter != null) {
                    file = pageBlocksAdapter.getFile(this.currentIndex);
                    pathToAttach = file;
                }
                zIsVideo = false;
            }
            if (pathToAttach != null && !pathToAttach.exists()) {
                pathToAttach = new File(FileLoader.getDirectory(4), pathToAttach.getName());
            }
            if (pathToAttach != null && pathToAttach.exists()) {
                Intent intent = new Intent("android.intent.action.SEND");
                if (zIsVideo) {
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
                        intent.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(this.parentActivity, ApplicationLoader.getApplicationId() + ".provider", pathToAttach));
                        intent.setFlags(1);
                    } catch (Exception unused) {
                        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(pathToAttach));
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(pathToAttach));
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
        float fMin = Math.min(containerViewHeight / bitmapHeight, containerViewWidth / bitmapWidth);
        float fMax = Math.max(containerViewWidth / ((int) (bitmapWidth * fMin)), containerViewHeight / ((int) (bitmapHeight * fMin)));
        this.scale = fMax;
        updateMinMax(fMax);
    }

    public void setParentAlert(ChatAttachAlert chatAttachAlert) {
        this.parentAlert = chatAttachAlert;
        WindowVisibilityManager.Controller controller = this.parentAlertWindowVisibilityController;
        if (controller != null) {
            controller.destroy();
            this.parentAlertWindowVisibilityController = null;
        }
        if (chatAttachAlert != null) {
            this.parentAlertWindowVisibilityController = chatAttachAlert.obtainWindowVisibilityController();
        }
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

    public Activity getParentActivity() {
        return this.parentActivity;
    }

    public void setParentActivity(Activity activity, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        boolean z;
        boolean z2 = true;
        WindowVisibilityManager.Controller controller = this.activityVisibilityController;
        TextSelectionHelper.SimpleSelectabeleView simpleSelectabeleView = null;
        if (controller != null) {
            controller.destroy();
            this.activityVisibilityController = null;
        }
        this.activityVisibilityController = LaunchActivity.obtainActivityVisibilityController();
        Activity parentActivity = activity != null ? activity : baseFragment.getParentActivity();
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
        AnonymousClass14 anonymousClass14 = new AnonymousClass14(parentActivity);
        this.windowView = anonymousClass14;
        anonymousClass14.setBackground(this.backgroundDrawable);
        this.windowView.setFocusable(false);
        ClippingImageView clippingImageView = new ClippingImageView(parentActivity);
        this.animatingImageView = clippingImageView;
        clippingImageView.setAnimationValues(this.animationValues, false, false);
        this.windowView.addView(this.animatingImageView, LayoutHelper.createFrame(40, 40.0f));
        FrameLayoutDrawer frameLayoutDrawer = new FrameLayoutDrawer(parentActivity, parentActivity) {
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
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                PhotoViewer.this.textSelectionHelper.getOverlayView(PhotoViewer.this.windowView.getContext()).draw(canvas);
            }

            @Override
            protected void onLayout(boolean z3, int i2, int i3, int i4, int i5) {
                if (PhotoViewer.this.btnLayout != null && PhotoViewer.this.undoBtn != null) {
                    int iDp = (i4 - i2) - AndroidUtilities.dp(20.0f);
                    PhotoViewer.this.undoBtn.setTranslationY(((-iDp) / 2.0f) - AndroidUtilities.dp(47.0f));
                    float f = iDp / 2.0f;
                    PhotoViewer.this.btnLayout.setTranslationY(AndroidUtilities.dp(47.0f) + f);
                    PhotoViewer.this.cutOutBtn.setTranslationY(AndroidUtilities.dp(47.0f) + f);
                    PhotoViewer.this.outlineBtn.setTranslationY(f + AndroidUtilities.dp(95.0f));
                }
                super.onLayout(z3, i2, i3, i4, i5);
            }
        };
        this.containerView = frameLayoutDrawer;
        frameLayoutDrawer.setFocusable(false);
        VideoFramesRewinder videoFramesRewinder = this.framesRewinder;
        if (videoFramesRewinder != null) {
            videoFramesRewinder.setParentView(this.containerView);
        }
        this.containerView.setClipChildren(true);
        this.containerView.setClipToPadding(true);
        this.windowView.setClipChildren(false);
        this.windowView.setClipToPadding(false);
        BlurringShader.BlurManager blurManager = new BlurringShader.BlurManager(this.containerView);
        this.blurManager = blurManager;
        blurManager.padding = 1;
        this.blurredBackgroundSource = new BlurredBackgroundSource() {
            private final BlurringShader.StoryBlurDrawer blur;

            @Override
            public void dispatchOnDrawablesRelativePositionChange() {
                BlurredBackgroundSource.CC.$default$dispatchOnDrawablesRelativePositionChange(this);
            }

            {
                this.blur = new BlurringShader.StoryBlurDrawer(PhotoViewer.this.blurManager, PhotoViewer.this.containerView, 0);
            }

            @Override
            public BlurredBackgroundDrawable createDrawable() {
                if (Build.VERSION.SDK_INT >= 29) {
                    BlurredBackgroundDrawableRenderNode blurredBackgroundDrawableRenderNode = new BlurredBackgroundDrawableRenderNode(this);
                    PhotoViewer.this.iBlur3BlurredDrawables.add(blurredBackgroundDrawableRenderNode);
                    return blurredBackgroundDrawableRenderNode;
                }
                return new BlurredBackgroundDrawableSource(this);
            }

            @Override
            public void draw(Canvas canvas, float f, float f2, float f3, float f4) {
                canvas.save();
                canvas.clipRect(f, f2, f3, f4);
                PhotoViewer.this.drawCaptionBlur(canvas, this.blur, -14277082, 855638016, false, true, true);
                canvas.drawColor(637534208);
                canvas.restore();
            }
        };
        this.glassAttachedViews = new ReferenceList();
        this.iBlur3BlurredDrawables = new ReferenceList();
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(this.blurredBackgroundSource);
        this.iBlur3FactoryFrostedLiquidGlass = blurredBackgroundDrawableViewFactory;
        blurredBackgroundDrawableViewFactory.setSourceRootView(new ViewPositionWatcher(this.containerView), this.containerView);
        this.iBlur3FactoryFrostedLiquidGlass.setLinkedViewsRef(this.glassAttachedViews);
        this.shadowBlurer = new BlurringShader.StoryBlurDrawer(this.blurManager, this.containerView, 6);
        this.windowView.addView(this.containerView, LayoutHelper.createFrame(-1, -1, 51));
        this.containerView.setFitsSystemWindows(true);
        this.containerView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return this.f$0.lambda$setParentActivity$6(view, windowInsets);
            }
        });
        this.containerView.setSystemUiVisibility(1792);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.windowLayoutParams = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        layoutParams.flags = -2147286784;
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
        ImageView backButton = this.actionBar.getBackButton();
        this.actionBarBackButton = backButton;
        this.actionBarBackButtonDrawableDeafult = backButton.getBackground();
        this.actionBarBackButtonDrawableGlass = null;
        PhotoViewerActionBarContainer photoViewerActionBarContainer = new PhotoViewerActionBarContainer(parentActivity);
        this.actionBarContainer = photoViewerActionBarContainer;
        this.actionBar.addView(photoViewerActionBarContainer, LayoutHelper.createFrame(-1, -1, 119));
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f));
        PhotoCountView photoCountView = new PhotoCountView(parentActivity);
        this.countView = photoCountView;
        this.containerView.addView(photoCountView, LayoutHelper.createFrame(-1, -2, 55));
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass18(resourcesProvider));
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        this.menu = actionBarMenuCreateMenu;
        actionBarMenuCreateMenu.setOnLayoutListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.updateActionBarTitlePadding();
            }
        });
        ActionBarMenuItem actionBarMenuItemAddItem = this.menu.addItem(26, R.drawable.menu_delete_old);
        this.deleteItem = actionBarMenuItemAddItem;
        actionBarMenuItemAddItem.setContentDescription(LocaleController.getString(R.string.Delete));
        ScaleStateListAnimator.apply(this.deleteItem);
        setItemVisible(this.deleteItem, false, false);
        ActionBarMenuItem actionBarMenuItemAddItem2 = this.menu.addItem(11, R.drawable.msg_mask);
        this.masksItem = actionBarMenuItemAddItem2;
        actionBarMenuItemAddItem2.setContentDescription(LocaleController.getString(R.string.Masks));
        ActionBarMenuItem actionBarMenuItemAddItem3 = this.menu.addItem(18, R.drawable.msg_header_draw);
        this.editItem = actionBarMenuItemAddItem3;
        actionBarMenuItemAddItem3.setContentDescription(LocaleController.getString(R.string.AccDescrPhotoEditor));
        ActionBarMenuItem actionBarMenuItemAddItem4 = this.menu.addItem(4, R.drawable.msg_header_share);
        this.sendItem = actionBarMenuItemAddItem4;
        actionBarMenuItemAddItem4.setContentDescription(LocaleController.getString(R.string.Forward));
        ActionBarMenu actionBarMenu = this.menu;
        ChooseQualityLayout$QualityIcon chooseQualityLayout$QualityIcon = new ChooseQualityLayout$QualityIcon(this.activityContext, R.drawable.video_settings, new DarkThemeResourceProvider());
        this.videoItemIcon = chooseQualityLayout$QualityIcon;
        ActionBarMenuItem actionBarMenuItemAddItem5 = actionBarMenu.addItem(1, chooseQualityLayout$QualityIcon);
        this.videoItem = actionBarMenuItemAddItem5;
        this.videoItemIcon.setCallback(actionBarMenuItemAddItem5.getIconView());
        this.videoItem.getPopupLayout().setSwipeBackForegroundColor(-14540254);
        this.videoItem.getPopupLayout().swipeBackGravityRight = true;
        this.videoItem.getPopupLayout().setFitItems(true);
        this.videoItem.setMenuXOffset(AndroidUtilities.dp(3.0f));
        ActionBarMenuSlider.SpeedSlider speedSlider = new ActionBarMenuSlider.SpeedSlider(this.activityContext, resourcesProvider);
        this.speedItem = speedSlider;
        speedSlider.setStops(new float[]{0.5f, 1.0f, 1.5f, 2.0f, 2.5f});
        this.speedItem.setMinimumWidth(AndroidUtilities.dp(196.0f));
        this.speedItem.setDrawShadow(false);
        this.speedItem.setBackgroundColor(-14540254);
        this.speedItem.setTextColor(-1);
        this.speedItem.setLabel(LocaleController.getString(R.string.VideoPlayerSpeed));
        this.speedItem.setOnValueChange(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$setParentActivity$7((Float) obj, (Boolean) obj2);
            }
        });
        this.videoItem.getPopupLayout().addView((View) this.speedItem, LayoutHelper.createLinear(-1, 44));
        ActionBarPopupWindow.GapView gapViewAddColoredGap = this.videoItem.addColoredGap();
        this.speedGap = gapViewAddColoredGap;
        gapViewAddColoredGap.setColor(-15198184);
        ActionBarPopupWindow.ActionBarPopupWindowLayout popupLayout = this.videoItem.getPopupLayout();
        SpeedButtonsLayout speedButtonsLayout = new SpeedButtonsLayout(this.activityContext, new SpeedButtonsLayout.Callback() {
            @Override
            public final void onSpeedSelected(float f, boolean z3, boolean z4) {
                this.f$0.chooseSpeed(f, z3, z4);
            }
        });
        this.chooseSpeedLayout = speedButtonsLayout;
        popupLayout.addView(speedButtonsLayout);
        LinearLayout linearLayout = new LinearLayout(this.activityContext);
        this.videoQualityLayout = linearLayout;
        linearLayout.setOrientation(1);
        this.videoItem.getPopupLayout().addView(this.videoQualityLayout);
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem = this.videoItem.addSubItem(22, R.drawable.menu_video_loop, LocaleController.getString(R.string.VideoPlayerLoop));
        this.loopItem = actionBarMenuSubItemAddSubItem;
        actionBarMenuSubItemAddSubItem.setSelectorColor(268435455);
        CastMediaRouteButton castMediaRouteButton = new CastMediaRouteButton(this.activityContext) {
            @Override
            public void stateUpdated(boolean z3) {
                if (PhotoViewer.this.castItem != null) {
                    PhotoViewer.this.castItem.setEnabledByColor(z3, -1, -9194260);
                    PhotoViewer.this.castItem.setSelectorColor(z3 ? 259241196 : 268435455);
                }
                if (PhotoViewer.this.videoPlayer != null) {
                    PhotoViewer.this.videoPlayer.setMute(CastSync.isActive() || PhotoViewer.this.muteVideo);
                }
                if (PhotoViewer.this.videoItemIcon != null) {
                    PhotoViewer.this.videoItemIcon.setCasting(CastSync.isActive(), true);
                }
            }
        };
        this.castItemButton = castMediaRouteButton;
        try {
            castMediaRouteButton.setRouteSelector(CastContext.getSharedInstance(this.activityContext).getMergedSelector());
            z = true;
        } catch (Exception e) {
            FileLog.e(e);
            z = false;
        }
        this.castItemButton.setVisibility(4);
        if (z) {
            ActionBarMenuSubItem actionBarMenuSubItemAddSubItem2 = this.videoItem.addSubItem(24, R.drawable.menu_video_chromecast, LocaleController.getString(R.string.VideoPlayerChromecast));
            this.castItem = actionBarMenuSubItemAddSubItem2;
            actionBarMenuSubItemAddSubItem2.setEnabledByColor(false, -1, -9194260);
            this.castItem.setSelectorColor(268435455);
            this.castItem.addView(this.castItemButton, 0, LayoutHelper.createFrame(-1, -1.0f));
        }
        this.videoItem.redrawPopup(-115203550);
        this.videoItem.setOnMenuDismiss(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$setParentActivity$8((Boolean) obj);
            }
        });
        ActionBarMenuItem actionBarMenuItemAddItem6 = this.menu.addItem(0, R.drawable.media_more);
        this.menuItem = actionBarMenuItemAddItem6;
        actionBarMenuItemAddItem6.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.menuItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$setParentActivity$9(view);
            }
        });
        this.menuItem.setOnMenuDismiss(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$setParentActivity$10((Boolean) obj);
            }
        });
        this.menuItem.getPopupLayout().setSwipeBackForegroundColor(-14540254);
        this.menuItem.getPopupLayout().swipeBackGravityRight = true;
        this.menuItem.getPopupLayout().setFitItems(true);
        this.chooseDownloadQualityLayout = new ChooseDownloadQualityLayout(this.activityContext, this.menuItem.getPopupLayout().getSwipeBack(), new ChooseDownloadQualityLayout.Callback() {
            @Override
            public final void onQualitySelected(MessageObject messageObject, VideoPlayer.Quality quality) {
                this.f$0.lambda$setParentActivity$13(messageObject, quality);
            }
        });
        ActionBarMenuSubItem colors = this.menuItem.addSwipeBackItem(R.drawable.msg_gallery, null, LocaleController.getString(R.string.SaveToGallery), this.chooseDownloadQualityLayout.layout).setColors(-328966, -328966);
        this.galleryButton = colors;
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$setParentActivity$14(view);
            }
        });
        ActionBarPopupWindow.GapView gapViewAddColoredGap2 = this.menuItem.addColoredGap();
        this.galleryGap = gapViewAddColoredGap2;
        gapViewAddColoredGap2.setColor(-15198184);
        this.menuItem.addSubItem(10, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp)).setColors(-328966, -328966);
        this.pipItem = this.menuItem.addSubItem(6, R.drawable.menu_video_pip, LocaleController.getString(R.string.PipMinimize)).setColors(-328966, -328966);
        ActionBarMenuSubItem actionBarMenuSubItemAddSubItem3 = this.menuItem.addSubItem(3, R.drawable.msg_media, LocaleController.getString(R.string.ShowAllMedia));
        this.allMediaItem = actionBarMenuSubItemAddSubItem3;
        actionBarMenuSubItemAddSubItem3.setColors(-328966, -328966);
        this.menuItem.addSubItem(12, R.drawable.msg_gif, LocaleController.getString(R.string.SaveToGIFs)).setColors(-328966, -328966);
        this.menuItem.addSubItem(5, R.drawable.msg_message, LocaleController.getString(R.string.ShowInChat)).setColors(-328966, -328966);
        ActionBarMenuItem actionBarMenuItem = this.menuItem;
        int i2 = R.drawable.msg_sticker;
        actionBarMenuItem.addSubItem(25, i2, LocaleController.getString(R.string.CreateSticker)).setColors(-328966, -328966);
        this.menuItem.addSubItem(21, R.drawable.menu_reply, LocaleController.getString(R.string.Reply)).setColors(-328966, -328966);
        this.menuItem.addSubItem(23, R.drawable.msg_report, LocaleController.getString(R.string.ReportProfilePhoto)).setColors(-328966, -328966);
        this.menuItem.addSubItem(9, R.drawable.msg_shareout, LocaleController.getString(R.string.ShareFile)).setColors(-328966, -328966);
        this.menuItem.addSubItem(13, i2, LocaleController.getString(R.string.ShowStickers)).setColors(-328966, -328966);
        this.menuItem.addSubItem(14, R.drawable.msg_openprofile, LocaleController.getString(R.string.SetAsMain)).setColors(-328966, -328966);
        ActionBarMenuItem actionBarMenuItem2 = this.menuItem;
        int i3 = R.drawable.msg_translate;
        actionBarMenuItem2.addSubItem(19, i3, LocaleController.getString(R.string.TranslateMessage)).setColors(-328966, -328966);
        this.menuItem.addSubItem(20, i3, LocaleController.getString(R.string.HideTranslation)).setColors(-328966, -328966);
        this.menuItem.addSubItem(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete)).setColors(-328966, -328966);
        this.menuItem.addSubItem(8, R.drawable.msg_cancel, LocaleController.getString(R.string.StopDownload)).setColors(-328966, -328966);
        this.menuItem.redrawPopup(-115203550);
        this.menuItem.hideSubItem(19);
        this.menuItem.hideSubItem(20);
        setMenuItemIcon(false, true);
        this.menuItem.setPopupItemsSelectorColor(268435455);
        this.menuItem.setSubMenuDelegate(new ActionBarMenuItem.ActionBarSubMenuItemDelegate() {
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
        FrameLayout frameLayout = new FrameLayout(this.activityContext) {
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
            public ArrayList getImagesArrLocations() {
                return PhotoViewer.this.imagesArrLocations;
            }

            @Override
            public ArrayList getImagesArr() {
                return PhotoViewer.this.imagesArr;
            }

            @Override
            public List getPageBlockArr() {
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
            public void setCurrentIndex(int i4) throws Resources.NotFoundException, NumberFormatException {
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
            public void onStopScrolling() throws NumberFormatException {
                PhotoViewer photoViewer = PhotoViewer.this;
                if (photoViewer.shouldMessageObjectAutoPlayed(photoViewer.currentMessageObject)) {
                    PhotoViewer.this.playerAutoStarted = true;
                    PhotoViewer.this.onActionClick(true);
                    PhotoViewer.this.checkProgress(0, false, true);
                }
            }

            @Override
            public boolean forceAll() {
                return PhotoViewer.this.placeProvider != null && PhotoViewer.this.placeProvider.forceAllInGroup();
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
                    this.f$0.lambda$setParentActivity$15(view2);
                }
            });
        }
        this.textSelectionHelper = new TextSelectionHelper.SimpleTextSelectionHelper(simpleSelectabeleView, new DarkThemeResourceProvider()) {
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
                return this.f$0.lambda$setParentActivity$16();
            }
        });
        this.captionTextViewSwitcher.setVisibility(4);
        setCaptionHwLayerEnabled(true);
        for (int i5 = 0; i5 < 3; i5++) {
            this.photoProgressViews[i5] = new PhotoProgressView(this.containerView) {
                @Override
                protected void onBackgroundStateUpdated(int i6) {
                    if (this == PhotoViewer.this.photoProgressViews[0]) {
                        PhotoViewer.this.updateAccessibilityOverlayVisibility();
                    }
                }

                @Override
                protected void onVisibilityChanged(boolean z3) {
                    if (this == PhotoViewer.this.photoProgressViews[0]) {
                        PhotoViewer.this.updateAccessibilityOverlayVisibility();
                    }
                }
            };
            this.photoProgressViews[i5].setBackgroundState(0, false, true);
        }
        RadialProgressView radialProgressView = new RadialProgressView(this.activityContext, resourcesProvider) {
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
            public final void onClick(View view2) throws NumberFormatException {
                this.f$0.lambda$setParentActivity$17(view2);
            }
        });
        this.qualityPicker.doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) throws NumberFormatException {
                this.f$0.lambda$setParentActivity$18(view2);
            }
        });
        VideoForwardDrawable videoForwardDrawable = new VideoForwardDrawable(false);
        this.videoForwardDrawable = videoForwardDrawable;
        videoForwardDrawable.setDelegate(new VideoForwardDrawable.VideoForwardDrawableDelegate() {
            @Override
            public void onAnimationEnd() {
            }

            @Override
            public void invalidate() {
                PhotoViewer.this.containerView.invalidate();
            }
        });
        final FrameLayoutDrawer frameLayoutDrawer2 = this.containerView;
        Objects.requireNonNull(frameLayoutDrawer2);
        this.seekSpeedDrawable = new SeekSpeedDrawable(new Runnable() {
            @Override
            public final void run() {
                frameLayoutDrawer2.invalidate();
            }
        }, false, false);
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

            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (!PhotoViewer.this.fancyShadows) {
                    int measuredHeight = PhotoViewer.this.doneButtonFullWidth.getVisibility() == 0 ? getMeasuredHeight() - AndroidUtilities.dp(48.0f) : 0;
                    if (PhotoViewer.this.sendPhotoType == 0 || PhotoViewer.this.sendPhotoType == 2 || PhotoViewer.this.sendPhotoType == -1) {
                        this.bgMatrix.reset();
                        float fMin = Math.min(AndroidUtilities.dp(40.0f), getMeasuredHeight() - measuredHeight);
                        this.bgMatrix.postTranslate(0.0f, measuredHeight);
                        this.bgMatrix.postScale(1.0f, fMin / 16.0f);
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
                ((FrameLayout.LayoutParams) PhotoViewer.this.itemsLayout.getLayoutParams()).rightMargin = PhotoViewer.this.pickerViewSendButton.getVisibility() == 0 ? AndroidUtilities.dp(63.0f) : 0;
                super.onMeasure(i8, i9);
            }

            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                if (PhotoViewer.this.videoTimelineViewContainer != null && PhotoViewer.this.videoTimelineViewContainer.getVisibility() != 8) {
                    PhotoViewer.this.videoTimelineViewContainer.setTranslationY(PhotoViewer.this.pickerView.getTranslationY() - (Math.max(0, PhotoViewer.this.captionEdit.getEditTextHeight() - AndroidUtilities.dp(46.0f)) * PhotoViewer.this.captionEdit.getAlpha()));
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
                if (PhotoViewer.this.captionEdit != null && PhotoViewer.this.captionEdit.getVisibility() != 8) {
                    PhotoViewer.this.captionEdit.setAlpha(PhotoViewer.this.captionEditAlpha[0] * f);
                }
                if (PhotoViewer.this.topCaptionEdit == null || PhotoViewer.this.topCaptionEdit.getVisibility() == 8) {
                    return;
                }
                PhotoViewer.this.topCaptionEdit.setAlpha(f * PhotoViewer.this.topCaptionEditAlpha[0]);
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
            protected void onLayout(boolean z3, int i8, int i9, int i10, int i11) {
                super.onLayout(z3, i8, i9, i10, i11);
                if (PhotoViewer.this.itemsLayout.getVisibility() != 8) {
                    int iDp = (((i10 - i8) - (PhotoViewer.this.pickerViewSendButton.getVisibility() == 0 ? AndroidUtilities.dp(63.0f) : 0)) - PhotoViewer.this.itemsLayout.getMeasuredWidth()) / 2;
                    PhotoViewer.this.itemsLayout.layout(iDp, PhotoViewer.this.itemsLayout.getTop(), PhotoViewer.this.itemsLayout.getMeasuredWidth() + iDp, PhotoViewer.this.itemsLayout.getTop() + PhotoViewer.this.itemsLayout.getMeasuredHeight());
                }
            }
        };
        this.pickerView = frameLayout2;
        this.containerView.addView(frameLayout2, LayoutHelper.createFrame(-1, -2, 83));
        TextView textView2 = new TextView(this.containerView.getContext());
        this.docNameTextView = textView2;
        textView2.setTextSize(1, 15.0f);
        this.docNameTextView.setTypeface(AndroidUtilities.bold());
        this.docNameTextView.setSingleLine(true);
        this.docNameTextView.setMaxLines(1);
        TextView textView3 = this.docNameTextView;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView3.setEllipsize(truncateAt);
        this.docNameTextView.setTextColor(-1);
        this.docNameTextView.setGravity(3);
        this.pickerView.addView(this.docNameTextView, LayoutHelper.createFrame(-1, -2.0f, 51, 20.0f, 23.0f, 84.0f, 0.0f));
        TextView textView4 = new TextView(this.containerView.getContext());
        this.docInfoTextView = textView4;
        textView4.setTextSize(1, 14.0f);
        this.docInfoTextView.setSingleLine(true);
        this.docInfoTextView.setMaxLines(1);
        this.docInfoTextView.setEllipsize(truncateAt);
        this.docInfoTextView.setTextColor(-1);
        this.docInfoTextView.setGravity(3);
        this.pickerView.addView(this.docInfoTextView, LayoutHelper.createFrame(-1, -2.0f, 51, 20.0f, 46.0f, 84.0f, 0.0f));
        TextView textView5 = new TextView(this.containerView.getContext());
        this.doneButtonFullWidth = textView5;
        int i8 = Theme.key_featuredStickers_addButton;
        textView5.setBackground(Theme.AdaptiveRipple.filledRect(getThemedColor(i8), 6.0f));
        TextView textView6 = this.doneButtonFullWidth;
        int i9 = Theme.key_featuredStickers_buttonText;
        textView6.setTextColor(getThemedColor(i9));
        this.doneButtonFullWidth.setEllipsize(truncateAt);
        this.doneButtonFullWidth.setGravity(17);
        this.doneButtonFullWidth.setLines(1);
        this.doneButtonFullWidth.setSingleLine(true);
        this.doneButtonFullWidth.setText(LocaleController.getString("SetAsMyPhoto", R.string.SetAsMyPhoto));
        this.doneButtonFullWidth.setTextSize(1, 15.0f);
        this.doneButtonFullWidth.setTypeface(AndroidUtilities.bold());
        this.doneButtonFullWidth.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) throws NumberFormatException {
                this.f$0.lambda$setParentActivity$19(view2);
            }
        });
        this.doneButtonFullWidth.setVisibility(8);
        this.pickerView.addView(this.doneButtonFullWidth, LayoutHelper.createFrame(-1, 48.0f, 51, 20.0f, 0.0f, 20.0f, 64.0f));
        VideoTimelinePlayView videoTimelinePlayView = new VideoTimelinePlayView(this.parentActivity) {
            private final BlurringShader.StoryBlurDrawer blur;
            private final Path path = new Path();

            @Override
            protected boolean customBlur() {
                return true;
            }

            {
                this.blur = new BlurringShader.StoryBlurDrawer(PhotoViewer.this.blurManager, this, 0);
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
                PhotoViewer.this.drawCaptionBlur(canvas, this.blur, -14803426, 855638016, false, true, false);
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
        videoTimelinePlayView.setDelegate(new AnonymousClass29());
        FrameLayout frameLayout3 = new FrameLayout(this.parentActivity);
        this.videoTimelineViewContainer = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.videoTimelineViewContainer.addView(this.videoTimelineView, LayoutHelper.createFrame(-1, 54, 83));
        showVideoTimeline(false, false);
        this.containerView.addView(this.videoTimelineViewContainer, LayoutHelper.createFrame(-1, 54.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
        ActionBarMenuItem actionBarMenuItem3 = this.deleteItem;
        if (actionBarMenuItem3 != null) {
            actionBarMenuItem3.setBackground(Blur3Utils.wrapCenteredDrawable(this.iBlur3FactoryFrostedLiquidGlass.create(actionBarMenuItem3).setColorProvider(BlurredBackgroundProviderImpl.photoViewer(resourcesProvider)).setRadius(AndroidUtilities.dp(20.0f)).setPadding(AndroidUtilities.dp(7.0f)), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(54.0f)));
        }
        EditCoverButton editCoverButton = new EditCoverButton(this.parentActivity, LocaleController.getString(R.string.EditorSetCover), z2) {
            @Override
            public void setVisibility(int i10) {
                super.setVisibility(i10);
            }
        };
        this.editCoverButton = editCoverButton;
        editCoverButton.setBlurredBackgroundDrawable(this.iBlur3FactoryFrostedLiquidGlass.create(editCoverButton).setColorProvider(BlurredBackgroundProviderImpl.photoViewer(resourcesProvider)));
        ScaleStateListAnimator.apply(this.editCoverButton);
        this.editCoverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$setParentActivity$20(view2);
            }
        });
        this.containerView.addView(this.editCoverButton, LayoutHelper.createFrame(-1, 32.0f, 87, 60.0f, 0.0f, 60.0f, 0.0f));
        PhotoViewerCoverEditor photoViewerCoverEditor = new PhotoViewerCoverEditor(this.parentActivity, resourcesProvider, this, this.blurManager);
        this.coverEditor = photoViewerCoverEditor;
        EditCoverButton editCoverButton2 = photoViewerCoverEditor.openGalleryButton;
        editCoverButton2.setBlurredBackgroundDrawable(this.iBlur3FactoryFrostedLiquidGlass.create(editCoverButton2).setColorProvider(BlurredBackgroundProviderImpl.photoViewer(resourcesProvider)));
        ScaleStateListAnimator.apply(this.coverEditor.openGalleryButton);
        this.coverEditor.setVisibility(8);
        this.coverEditor.setAlpha(0.0f);
        this.coverEditor.setOnClose(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setParentActivity$21();
            }
        });
        this.containerView.addView(this.coverEditor, LayoutHelper.createFrame(-1, -1, 119));
        this.coverEditor.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$setParentActivity$28(view2);
            }
        });
        this.coverEditor.setOnGalleryImage(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$setParentActivity$33((MediaController.PhotoEntry) obj);
            }
        });
        ImageView imageView = new ImageView(this.parentActivity) {
            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                if (PhotoViewer.this.muteHints != null) {
                    Iterator it = PhotoViewer.this.muteHints.iterator();
                    while (it.hasNext()) {
                        ((HintView2) it.next()).setTranslationY(f);
                    }
                }
                if (PhotoViewer.this.editCoverButton != null) {
                    PhotoViewer.this.editCoverButton.setTranslationY(f);
                }
                if (PhotoViewer.this.livePhotoButton != null) {
                    PhotoViewer.this.livePhotoButton.setTranslationY(f);
                }
            }
        };
        this.muteButton = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.muteButton;
        MuteDrawable muteDrawable = new MuteDrawable(this.parentActivity);
        this.muteDrawable = muteDrawable;
        imageView2.setImageDrawable(muteDrawable);
        this.muteButton.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ImageView imageView3 = this.muteButton;
        imageView3.setBackground(this.iBlur3FactoryFrostedLiquidGlass.create(imageView3).setColorProvider(BlurredBackgroundProviderImpl.photoViewer(null)).setPadding(AndroidUtilities.dp(4.0f)).setRadius(AndroidUtilities.dp(16.0f)));
        ScaleStateListAnimator.apply(this.muteButton);
        this.containerView.addView(this.muteButton, LayoutHelper.createFrame(40, 40.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
        this.muteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$setParentActivity$35(view2);
            }
        });
        LivePhotoButton livePhotoButton = new LivePhotoButton(this.containerView.getContext());
        this.livePhotoButton = livePhotoButton;
        livePhotoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$setParentActivity$37(view2);
            }
        });
        this.containerView.addView(this.livePhotoButton, LayoutHelper.createFrame(45, 45.0f, 83, 8.0f, 0.0f, 0.0f, -4.0f));
        Context context = this.containerView.getContext();
        FrameLayout frameLayout4 = this.windowView;
        FrameLayoutDrawer frameLayoutDrawer3 = this.containerView;
        int i10 = 0;
        final Activity activity2 = parentActivity;
        CaptionPhotoViewer captionPhotoViewer2 = new CaptionPhotoViewer(context, frameLayout4, frameLayoutDrawer3, frameLayoutDrawer3, resourcesProvider, this.blurManager, new Runnable() {
            @Override
            public final void run() {
                this.f$0.applyCaption();
            }
        }) {
            private final Path path = new Path();

            @Override
            protected boolean customBlur() {
                return true;
            }

            @Override
            protected boolean isAtTop() {
                return false;
            }

            @Override
            protected boolean ignoreTouches(float f, float f2) {
                return (this.keyboardShown || PhotoViewer.this.currentEditMode == 0) ? false : true;
            }

            @Override
            public void updateKeyboard(int i11) {
                super.updateKeyboard(i11);
                Bulletin visibleBulletin = Bulletin.getVisibleBulletin();
                if (visibleBulletin != null) {
                    visibleBulletin.updatePosition();
                }
                updateMoveCaptionButton();
                boolean z3 = false;
                if (PhotoViewer.this.bottomBulletinUnderCaption != null) {
                    PhotoViewer.this.bottomBulletinUnderCaption.animate().translationY(-Math.max(0, i11 - PhotoViewer.this.pickerView.getHeight())).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).start();
                }
                PhotoViewer.this.actionBar.animate().alpha((!PhotoViewer.this.isActionBarVisible || (PhotoViewer.this.getCaptionView() == PhotoViewer.this.topCaptionEdit && PhotoViewer.this.topCaptionEdit.keyboardNotifier.keyboardVisible())) ? 0.0f : 1.0f).start();
                if (PhotoViewer.this.pickerView.getVisibility() == 0) {
                    PhotoViewer photoViewer = PhotoViewer.this;
                    if (photoViewer.isActionBarVisible && (PhotoViewer.this.getCaptionView() != PhotoViewer.this.topCaptionEdit || !PhotoViewer.this.topCaptionEdit.keyboardNotifier.keyboardVisible())) {
                        z3 = true;
                    }
                    photoViewer.toggleOnlyCheckImageView(z3);
                }
            }

            @Override
            public void setText(CharSequence charSequence) {
                super.setText(charSequence);
                updateMoveCaptionButton();
            }

            private void updateMoveCaptionButton() {
                setShowMoveButtonVisible(PhotoViewer.this.placeProvider != null && PhotoViewer.this.placeProvider.canMoveCaptionAbove() && (PhotoViewer.this.captionEdit.keyboardNotifier.keyboardVisible() || !(PhotoViewer.this.isCurrentVideo || TextUtils.isEmpty(PhotoViewer.this.getCaptionView().getText()))), true);
            }

            @Override
            protected void drawBlur(BlurringShader.StoryBlurDrawer storyBlurDrawer, Canvas canvas, RectF rectF, float f, boolean z3, float f2, float f3, boolean z4, float f4) {
                canvas.save();
                this.path.rewind();
                this.path.addRoundRect(rectF, f, f, Path.Direction.CW);
                canvas.clipPath(this.path);
                if (z4) {
                    canvas.translate(((-getX()) - PhotoViewer.this.captionEditContainer.getX()) + f2, ((-getY()) - PhotoViewer.this.captionEditContainer.getY()) + f3);
                } else {
                    canvas.translate(f2, f3);
                }
                PhotoViewer.this.drawCaptionBlur(canvas, storyBlurDrawer, Theme.multAlpha(z3 ? -8882056 : -14277082, f4), Theme.multAlpha(z4 ? z3 ? 0 : 855638016 : 1140850688, f4), false, !z3, !z3 && z4);
                canvas.restore();
            }

            @Override
            protected boolean captionLimitToast() {
                if (PhotoViewer.this.limitBulletin != null && Bulletin.getVisibleBulletin() == PhotoViewer.this.limitBulletin) {
                    return false;
                }
                PhotoViewer photoViewer = PhotoViewer.this;
                return photoViewer.showCaptionLimitBulletin(photoViewer.containerView);
            }

            @Override
            protected void setupMentionContainer() {
                this.mentionContainer.getAdapter().setAllowStickers(false);
                this.mentionContainer.getAdapter().setAllowBots(false);
                this.mentionContainer.getAdapter().setAllowChats(false);
                if (PhotoViewer.this.parentChatActivity != null) {
                    this.mentionContainer.getAdapter().setSearchInDialogs(false);
                    this.mentionContainer.getAdapter().setChatInfo(PhotoViewer.this.parentChatActivity.chatInfo);
                    this.mentionContainer.getAdapter().setNeedUsernames(PhotoViewer.this.parentChatActivity.currentChat != null);
                } else {
                    this.mentionContainer.getAdapter().setSearchInDialogs(true);
                    this.mentionContainer.getAdapter().setChatInfo(null);
                    this.mentionContainer.getAdapter().setNeedUsernames(false);
                }
                this.mentionContainer.getAdapter().setNeedBotContext(false);
            }

            @Override
            public void updateMentionsLayoutPosition() {
                MentionsContainerView mentionsContainerView = this.mentionContainer;
                if (mentionsContainerView != null) {
                    mentionsContainerView.setTranslationY(((-getEditTextHeight()) - AndroidUtilities.dp(14.0f)) - this.keyboardNotifier.getKeyboardHeight());
                }
            }

            @Override
            protected void onUpdateShowKeyboard(float f) {
                super.onUpdateShowKeyboard(f);
                float f2 = 1.0f - f;
                PhotoViewer.this.muteButton.setAlpha((PhotoViewer.this.muteButton.getTag() != null ? 1 : 0) * f2);
                PhotoViewer.this.livePhotoButton.setAlpha((PhotoViewer.this.livePhotoButton.getTag() != null ? 1 : 0) * f2);
                PhotoViewer.this.videoTimelineViewContainer.setAlpha(f2 * (PhotoViewer.this.videoTimelineViewContainer.getTag() != null ? 1 : 0));
            }

            @Override
            public void invalidate() {
                if (SharedConfig.photoViewerBlur && (PhotoViewer.this.animationInProgress == 1 || PhotoViewer.this.animationInProgress == 2 || PhotoViewer.this.animationInProgress == 3)) {
                    return;
                }
                super.invalidate();
            }

            @Override
            protected boolean showMoveButton() {
                return PhotoViewer.this.placeProvider != null && PhotoViewer.this.placeProvider.canMoveCaptionAbove();
            }

            @Override
            protected void onMoveButtonClick() {
                PhotoViewer.this.toggleCaptionAbove();
            }

            @Override
            protected void openedKeyboard() {
                expandMoveButton();
                if (PhotoViewer.this.topCaptionEdit != null) {
                    PhotoViewer.this.topCaptionEdit.expandMoveButton();
                }
            }
        };
        this.captionEdit = captionPhotoViewer2;
        captionPhotoViewer2.setBlurredBackgroundDrawableForMentions(this.iBlur3FactoryFrostedLiquidGlass);
        this.captionEdit.setOnTimerChange(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$setParentActivity$38((Integer) obj);
            }
        });
        this.captionEdit.setAccount(this.currentAccount);
        this.captionEdit.setOnHeightUpdate(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$setParentActivity$39((Integer) obj);
            }
        });
        this.captionEdit.setOnAddPhotoClick(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) throws NumberFormatException {
                this.f$0.lambda$setParentActivity$40(view2);
            }
        });
        Context context2 = this.activityContext;
        FrameLayout frameLayout5 = this.windowView;
        FrameLayoutDrawer frameLayoutDrawer4 = this.containerView;
        CaptionPhotoViewer captionPhotoViewer3 = new CaptionPhotoViewer(context2, frameLayout5, frameLayoutDrawer4, frameLayoutDrawer4, resourcesProvider, this.blurManager, new Runnable() {
            @Override
            public final void run() {
                this.f$0.applyCaption();
            }
        }) {
            private final Path path = new Path();

            @Override
            protected boolean customBlur() {
                return true;
            }

            @Override
            protected boolean isAtTop() {
                return true;
            }

            @Override
            protected boolean ignoreTouches(float f, float f2) {
                return (this.keyboardShown || PhotoViewer.this.currentEditMode == 0) ? false : true;
            }

            @Override
            public void updateKeyboard(int i11) {
                super.updateKeyboard(i11);
                PhotoViewer.this.actionBar.animate().alpha((!PhotoViewer.this.isActionBarVisible || (PhotoViewer.this.getCaptionView() == PhotoViewer.this.topCaptionEdit && PhotoViewer.this.topCaptionEdit.keyboardNotifier.keyboardVisible())) ? 0.0f : 1.0f).start();
                if (PhotoViewer.this.pickerView.getVisibility() == 0) {
                    PhotoViewer photoViewer = PhotoViewer.this;
                    photoViewer.toggleOnlyCheckImageView(photoViewer.isActionBarVisible && !(PhotoViewer.this.getCaptionView() == PhotoViewer.this.topCaptionEdit && PhotoViewer.this.topCaptionEdit.keyboardNotifier.keyboardVisible()));
                }
            }

            @Override
            protected void drawBlur(BlurringShader.StoryBlurDrawer storyBlurDrawer, Canvas canvas, RectF rectF, float f, boolean z3, float f2, float f3, boolean z4, float f4) {
                canvas.save();
                this.path.rewind();
                this.path.addRoundRect(rectF, f, f, Path.Direction.CW);
                canvas.clipPath(this.path);
                if (z4) {
                    canvas.translate(((-getX()) - PhotoViewer.this.topCaptionEditContainer.getX()) + f2, ((-getY()) - PhotoViewer.this.topCaptionEditContainer.getY()) + f3);
                } else {
                    canvas.translate(f2, f3);
                }
                PhotoViewer.this.drawCaptionBlur(canvas, storyBlurDrawer, Theme.multAlpha(z3 ? -8882056 : -14277082, f4), Theme.multAlpha(z4 ? z3 ? 0 : 855638016 : 1140850688, f4), false, !z3, !z3 && z4);
                canvas.restore();
            }

            @Override
            protected boolean captionLimitToast() {
                if (PhotoViewer.this.limitBulletin != null && Bulletin.getVisibleBulletin() == PhotoViewer.this.limitBulletin) {
                    return false;
                }
                PhotoViewer photoViewer = PhotoViewer.this;
                return photoViewer.showCaptionLimitBulletin(photoViewer.containerView);
            }

            @Override
            public void invalidate() {
                if (SharedConfig.photoViewerBlur && (PhotoViewer.this.animationInProgress == 1 || PhotoViewer.this.animationInProgress == 2 || PhotoViewer.this.animationInProgress == 3)) {
                    return;
                }
                super.invalidate();
            }

            @Override
            protected void setupMentionContainer() {
                this.mentionContainer.setReversed(true);
                this.mentionContainer.getAdapter().setAllowStickers(false);
                this.mentionContainer.getAdapter().setAllowBots(false);
                this.mentionContainer.getAdapter().setAllowChats(false);
                if (PhotoViewer.this.parentChatActivity != null) {
                    this.mentionContainer.getAdapter().setSearchInDialogs(false);
                    this.mentionContainer.getAdapter().setChatInfo(PhotoViewer.this.parentChatActivity.chatInfo);
                    this.mentionContainer.getAdapter().setNeedUsernames(PhotoViewer.this.parentChatActivity.currentChat != null);
                } else {
                    this.mentionContainer.getAdapter().setSearchInDialogs(true);
                    this.mentionContainer.getAdapter().setChatInfo(null);
                    this.mentionContainer.getAdapter().setNeedUsernames(false);
                }
                this.mentionContainer.getAdapter().setNeedBotContext(false);
                this.mentionContainer.setLayoutParams(LayoutHelper.createFrame(-1, -1, 51));
            }

            @Override
            public void updateMentionsLayoutPosition() {
                MentionsContainerView mentionsContainerView = this.mentionContainer;
                if (mentionsContainerView != null) {
                    mentionsContainerView.setTranslationY(getEditTextHeight());
                }
            }

            @Override
            protected boolean showMoveButton() {
                return PhotoViewer.this.placeProvider != null && PhotoViewer.this.placeProvider.canMoveCaptionAbove();
            }

            @Override
            protected void onMoveButtonClick() {
                PhotoViewer.this.toggleCaptionAbove();
            }

            @Override
            protected void openedKeyboard() {
                expandMoveButton();
                if (PhotoViewer.this.captionEdit != null) {
                    PhotoViewer.this.captionEdit.expandMoveButton();
                }
            }
        };
        this.topCaptionEdit = captionPhotoViewer3;
        captionPhotoViewer3.setBlurredBackgroundDrawableForMentions(this.iBlur3FactoryFrostedLiquidGlass);
        this.topCaptionEdit.setShowMoveButtonVisible(true, false);
        this.topCaptionEdit.setOnTimerChange(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$setParentActivity$41((Integer) obj);
            }
        });
        this.topCaptionEdit.setAccount(this.currentAccount);
        this.topCaptionEdit.setOnHeightUpdate(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$setParentActivity$42((Integer) obj);
            }
        });
        this.topCaptionEdit.setOnAddPhotoClick(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) throws NumberFormatException {
                this.f$0.lambda$setParentActivity$43(view2);
            }
        });
        StickerMakerBackgroundView stickerMakerBackgroundView = new StickerMakerBackgroundView(this.activityContext) {
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
        FrameLayoutDrawer frameLayoutDrawer5 = this.containerView;
        frameLayoutDrawer5.addView(this.stickerMakerView, frameLayoutDrawer5.indexOfChild(this.actionBar) - 1, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        BlurButton blurButton = new BlurButton();
        this.cutOutBtn = blurButton;
        blurButton.setRad(18);
        this.cutOutBtn.wrapContentDynamic();
        this.stickerMakerView.setStickerCutOutBtn(this.cutOutBtn);
        this.cutOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$setParentActivity$55(view2);
            }
        });
        this.cutOutBtn.setCutOutState(false);
        this.containerView.addView(this.cutOutBtn, LayoutHelper.createFrame(-1, 36, 17));
        LinearLayout linearLayout2 = new LinearLayout(this.parentActivity);
        this.btnLayout = linearLayout2;
        linearLayout2.setOrientation(0);
        BlurButton blurButton2 = new BlurButton();
        this.eraseBtn = blurButton2;
        blurButton2.wrapContent();
        this.eraseBtn.setRad(18);
        this.eraseBtn.setEraseState(false);
        this.eraseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$setParentActivity$56(view2);
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
                this.f$0.lambda$setParentActivity$57(view2);
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
                this.f$0.lambda$setParentActivity$58(view2);
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
                this.f$0.lambda$setParentActivity$59(view2);
            }
        });
        this.containerView.addView(this.outlineBtn, LayoutHelper.createFrame(-2, 36, 17));
        showEditCaption(false, false);
        showStickerMode(false, false);
        FrameLayout frameLayout6 = new FrameLayout(this.parentActivity) {
            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                PhotoViewer.this.invalidateBlur();
            }
        };
        this.captionEditContainer = frameLayout6;
        frameLayout6.addView(this.captionEdit, LayoutHelper.createFrame(-1, -1, 83));
        this.containerView.addView(this.captionEditContainer, LayoutHelper.createFrame(-1, -1.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
        FrameLayout frameLayout7 = new FrameLayout(this.parentActivity);
        this.topCaptionEditContainer = frameLayout7;
        frameLayout7.addView(this.topCaptionEdit, LayoutHelper.createFrame(-1, -1, 51));
        this.containerView.addView(this.topCaptionEditContainer, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
        FrameLayout frameLayout8 = new FrameLayout(this.parentActivity);
        this.topBulletinUnderCaption = frameLayout8;
        this.containerView.addView(frameLayout8, LayoutHelper.createFrame(-1, 120.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout9 = new FrameLayout(this.parentActivity);
        this.bottomBulletinUnderCaption = frameLayout9;
        this.containerView.addView(frameLayout9, LayoutHelper.createFrame(-1, 120.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView7 = new TextView(this.parentActivity);
        this.videoAvatarTooltip = textView7;
        textView7.setSingleLine(true);
        this.videoAvatarTooltip.setVisibility(8);
        this.videoAvatarTooltip.setText(LocaleController.getString("ChooseCover", R.string.ChooseCover));
        this.videoAvatarTooltip.setGravity(1);
        this.videoAvatarTooltip.setTextSize(1, 14.0f);
        this.videoAvatarTooltip.setTextColor(-7566196);
        this.containerView.addView(this.videoAvatarTooltip, LayoutHelper.createFrame(-1, -2.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
        ChatActivityEnterView.SendButton sendButton = new ChatActivityEnterView.SendButton(this.parentActivity, R.drawable.send_plane_24, resourcesProvider) {
            @Override
            public boolean isInactive() {
                return false;
            }

            @Override
            public boolean isOpen() {
                return true;
            }

            @Override
            public boolean shouldDrawBackground() {
                return true;
            }

            @Override
            public boolean isInScheduleMode() {
                return super.isInScheduleMode();
            }

            @Override
            public int getFillColor() {
                return PhotoViewer.this.getThemedColor(Theme.key_chat_editMediaButton);
            }
        };
        this.pickerViewSendButton = sendButton;
        sendButton.setCircleSize(AndroidUtilities.dp(52.0f), AndroidUtilities.dp(38.0f));
        ChatActivityEnterView.SendButton sendButton2 = this.pickerViewSendButton;
        sendButton2.newCounterPos = true;
        sendButton2.setBlurredBackgroundDrawable(this.iBlur3FactoryFrostedLiquidGlass.create(sendButton2).setColorProvider(BlurredBackgroundProviderImpl.photoViewer(resourcesProvider)));
        this.containerView.addView(this.pickerViewSendButton, LayoutHelper.createFrame(120, 120.0f, 85, 0.0f, 0.0f, 8.0f, 2.0f));
        this.pickerViewSendButton.setContentDescription(LocaleController.getString("Send", R.string.Send));
        ScaleStateListAnimator.apply(this.pickerViewSendButton);
        this.pickerViewSendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) throws NumberFormatException {
                this.f$0.lambda$setParentActivity$60(view2);
            }
        });
        this.pickerViewSendButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view2) {
                return this.f$0.lambda$setParentActivity$64(view2);
            }
        });
        PhotoViewerPollAttachButtons photoViewerPollAttachButtons = new PhotoViewerPollAttachButtons(this.parentActivity);
        this.pollAttachButtons = photoViewerPollAttachButtons;
        View view2 = photoViewerPollAttachButtons.editButton;
        view2.setBackground(this.iBlur3FactoryFrostedLiquidGlass.create(view2).setColorProvider(BlurredBackgroundProviderImpl.photoViewer(resourcesProvider)).setRadius(AndroidUtilities.dp(18.0f)).setPadding(AndroidUtilities.dp(7.0f)));
        View view3 = this.pollAttachButtons.replaceButton;
        view3.setBackground(this.iBlur3FactoryFrostedLiquidGlass.create(view3).setColorProvider(BlurredBackgroundProviderImpl.photoViewer(resourcesProvider)).setRadius(AndroidUtilities.dp(18.0f)).setPadding(AndroidUtilities.dp(7.0f)));
        this.pollAttachButtons.setVisibility(8);
        this.pollAttachButtons.editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                this.f$0.lambda$setParentActivity$65(view4);
            }
        });
        this.pollAttachButtons.replaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) throws NumberFormatException {
                this.f$0.lambda$setParentActivity$66(view4);
            }
        });
        this.containerView.addView(this.pollAttachButtons, LayoutHelper.createFrame(-1, 56, 80));
        LinearLayout linearLayout3 = new LinearLayout(this.parentActivity) {
            boolean ignoreLayout;

            @Override
            protected void onMeasure(int i11, int i12) {
                int childCount = getChildCount();
                int i13 = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    if (getChildAt(i14).getVisibility() == 0) {
                        i13++;
                    }
                }
                int size = (View.MeasureSpec.getSize(i11) - getPaddingLeft()) - getPaddingRight();
                int size2 = View.MeasureSpec.getSize(i12);
                if (i13 != 0) {
                    int iMin = Math.min(AndroidUtilities.dp(56.0f), size / i13);
                    if (PhotoViewer.this.compressItem.getVisibility() == 0) {
                        this.ignoreLayout = true;
                        int iMax = Math.max(0, (iMin - AndroidUtilities.dp(PhotoViewer.this.selectedCompression < 2 ? 48 : 64)) / 2);
                        PhotoViewer.this.compressItem.setPadding(iMax, 0, iMax, 0);
                        this.ignoreLayout = false;
                    }
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt = getChildAt(i15);
                        if (childAt.getVisibility() != 8) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                        }
                    }
                    setMeasuredDimension((iMin * i13) + getPaddingLeft() + getPaddingRight(), size2);
                    return;
                }
                setMeasuredDimension(size + getPaddingLeft() + getPaddingRight(), size2);
            }

            @Override
            public void draw(Canvas canvas) {
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    if (getChildAt(i11).getVisibility() == 0) {
                        super.draw(canvas);
                        return;
                    }
                }
            }
        };
        this.itemsLayout = linearLayout3;
        linearLayout3.setOrientation(0);
        this.itemsLayout.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        LinearLayout linearLayout4 = this.itemsLayout;
        linearLayout4.setBackground(this.iBlur3FactoryFrostedLiquidGlass.create(linearLayout4).setColorProvider(BlurredBackgroundProviderImpl.photoViewer(resourcesProvider)).setPadding(AndroidUtilities.dp(2.0f)).setRadius(AndroidUtilities.dp(22.0f)));
        this.pickerView.addView(this.itemsLayout, LayoutHelper.createFrame(-2, 48.0f, 81, 0.0f, 3.0f, 63.0f, 0.0f));
        ImageView imageView4 = new ImageView(this.parentActivity);
        this.cropItem = imageView4;
        imageView4.setScaleType(scaleType);
        this.cropItem.setImageResource(R.drawable.media_crop);
        this.cropItem.setBackground(Theme.createInsetRoundRectDrawable(285212671, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
        this.itemsLayout.addView(this.cropItem, LayoutHelper.createLinear(48, 48));
        this.cropItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                this.f$0.lambda$setParentActivity$67(view4);
            }
        });
        this.cropItem.setContentDescription(LocaleController.getString("CropImage", R.string.CropImage));
        ImageView imageView5 = new ImageView(this.parentActivity);
        this.rotateItem = imageView5;
        imageView5.setScaleType(scaleType);
        this.rotateItem.setImageResource(R.drawable.msg_photo_rotate);
        this.rotateItem.setBackground(Theme.createInsetRoundRectDrawable(285212671, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
        this.itemsLayout.addView(this.rotateItem, LayoutHelper.createLinear(48, 48));
        this.rotateItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                this.f$0.lambda$setParentActivity$68(view4);
            }
        });
        this.rotateItem.setContentDescription(LocaleController.getString("AccDescrRotate", R.string.AccDescrRotate));
        ImageView imageView6 = new ImageView(this.parentActivity);
        this.mirrorItem = imageView6;
        imageView6.setScaleType(scaleType);
        this.mirrorItem.setImageResource(R.drawable.media_flip);
        this.mirrorItem.setBackground(Theme.createInsetRoundRectDrawable(285212671, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
        this.itemsLayout.addView(this.mirrorItem, LayoutHelper.createLinear(48, 48));
        this.mirrorItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                this.f$0.lambda$setParentActivity$69(view4);
            }
        });
        this.mirrorItem.setContentDescription(LocaleController.getString("AccDescrMirror", R.string.AccDescrMirror));
        ImageView imageView7 = new ImageView(this.parentActivity);
        this.paintItem = imageView7;
        imageView7.setScaleType(scaleType);
        this.paintItem.setImageResource(R.drawable.media_draw);
        this.paintItem.setBackground(Theme.createInsetRoundRectDrawable(285212671, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
        this.itemsLayout.addView(this.paintItem, LayoutHelper.createLinear(48, 48));
        this.paintItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                this.f$0.lambda$setParentActivity$70(view4);
            }
        });
        this.paintItem.setContentDescription(LocaleController.getString("AccDescrPhotoEditor", R.string.AccDescrPhotoEditor));
        VideoCompressButton videoCompressButton = new VideoCompressButton(this.parentActivity);
        this.compressItem = videoCompressButton;
        videoCompressButton.setTag(1);
        this.compressItem.setBackground(Theme.createInsetRoundRectDrawable(285212671, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
        this.selectedCompression = selectCompression();
        this.compressItem.setState(this.videoConvertSupported && this.compressionsCount > 1, this.muteVideo, Math.min(this.resultWidth, this.resultHeight));
        this.compressItem.setContentDescription(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        this.itemsLayout.addView(this.compressItem, LayoutHelper.createLinear(48, 48));
        this.compressItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) throws NumberFormatException {
                this.f$0.lambda$setParentActivity$71(activity2, view4);
            }
        });
        ImageView imageView8 = new ImageView(this.parentActivity);
        this.tuneItem = imageView8;
        imageView8.setScaleType(scaleType);
        this.tuneItem.setImageResource(R.drawable.media_settings);
        this.tuneItem.setBackground(Theme.createInsetRoundRectDrawable(285212671, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f)));
        this.itemsLayout.addView(this.tuneItem, LayoutHelper.createLinear(48, 48));
        this.tuneItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                this.f$0.lambda$setParentActivity$72(view4);
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
            public final void onClick(View view4) {
                this.f$0.lambda$setParentActivity$74(view4);
            }
        });
        this.editorDoneLayout.doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                this.f$0.lambda$setParentActivity$75(view4);
            }
        });
        TextView textView8 = new TextView(this.activityContext);
        this.resetButton = textView8;
        textView8.setClickable(false);
        this.resetButton.setVisibility(8);
        this.resetButton.setTextSize(1, 14.0f);
        this.resetButton.setTextColor(-1);
        this.resetButton.setGravity(17);
        this.resetButton.setBackgroundDrawable(Theme.createSelectorDrawable(-12763843, 0));
        this.resetButton.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        this.resetButton.setText(LocaleController.getString(R.string.CropReset).toUpperCase());
        this.resetButton.setTypeface(AndroidUtilities.bold());
        this.editorDoneLayout.addView(this.resetButton, LayoutHelper.createFrame(-2, -1, 49));
        this.resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view4) {
                this.f$0.lambda$setParentActivity$77(view4);
            }
        });
        GestureDetector2 gestureDetector2 = new GestureDetector2(this.containerView.getContext(), this);
        this.gestureDetector = gestureDetector2;
        gestureDetector2.setIsLongpressEnabled(false);
        setDoubleTapEnabled(true);
        ImageReceiver.ImageReceiverDelegate imageReceiverDelegate = new ImageReceiver.ImageReceiverDelegate() {
            @Override
            public final void didSetImage(ImageReceiver imageReceiver, boolean z3, boolean z4, boolean z5) {
                this.f$0.lambda$setParentActivity$78(imageReceiver, z3, z4, z5);
            }

            @Override
            public void didSetImageBitmap(int i11, String str, Drawable drawable) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i11, str, drawable);
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
            public final void onClick(View view4) {
                this.f$0.lambda$setParentActivity$79(view4);
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
            public final void onClick(View view4) {
                this.f$0.lambda$setParentActivity$80(view4);
            }
        });
        SelectedPhotosListView selectedPhotosListView = new SelectedPhotosListView(this.parentActivity);
        this.selectedPhotosListView = selectedPhotosListView;
        selectedPhotosListView.setVisibility(8);
        this.selectedPhotosListView.setAlpha(0.0f);
        this.selectedPhotosListView.setLayoutManager(new LinearLayoutManager(this.parentActivity, i10, z2) {
            @Override
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i11) {
                LinearSmoothScrollerEnd linearSmoothScrollerEnd = new LinearSmoothScrollerEnd(recyclerView.getContext()) {
                    @Override
                    protected int calculateTimeForDeceleration(int i12) {
                        return Math.max(180, super.calculateTimeForDeceleration(i12));
                    }
                };
                linearSmoothScrollerEnd.setTargetPosition(i11);
                startSmoothScroll(linearSmoothScrollerEnd);
            }
        });
        SelectedPhotosListView selectedPhotosListView2 = this.selectedPhotosListView;
        ListAdapter listAdapter = new ListAdapter(this.parentActivity);
        this.selectedPhotosAdapter = listAdapter;
        selectedPhotosListView2.setAdapter(listAdapter);
        this.containerView.addView(this.selectedPhotosListView, LayoutHelper.createFrame(-1, 103, 51));
        this.selectedPhotosListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view4, int i11) throws Resources.NotFoundException, NumberFormatException {
                this.f$0.lambda$setParentActivity$81(view4, i11);
            }
        });
        UndoView undoView = new UndoView(this.activityContext, null, false, resourcesProvider);
        this.hintView = undoView;
        undoView.setAdditionalTranslationY(AndroidUtilities.dp(112.0f));
        this.hintView.setColors(-115203550, -1);
        this.containerView.addView(this.hintView, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
            View view4 = new View(this.activityContext);
            this.playButtonAccessibilityOverlay = view4;
            view4.setContentDescription(LocaleController.getString("AccActionPlay", R.string.AccActionPlay));
            this.playButtonAccessibilityOverlay.setFocusable(true);
            this.containerView.addView(this.playButtonAccessibilityOverlay, LayoutHelper.createFrame(64, 64, 17));
        }
        this.doneButtonFullWidth.setBackground(Theme.AdaptiveRipple.filledRect(getThemedColor(i8), 6.0f));
        this.doneButtonFullWidth.setTextColor(getThemedColor(i9));
        TextSelectionHelper.SimpleTextSelectionHelper simpleTextSelectionHelper = this.textSelectionHelper;
        simpleTextSelectionHelper.allowScrollPrentRelative = true;
        simpleTextSelectionHelper.useMovingOffset = false;
        TextSelectionHelper.TextSelectionOverlay overlayView = simpleTextSelectionHelper.getOverlayView(this.windowView.getContext());
        if (overlayView != null) {
            AndroidUtilities.removeFromParent(overlayView);
            this.containerView.addView(overlayView);
        }
        this.textSelectionHelper.setParentView(this.containerView);
        this.textSelectionHelper.setInvalidateParent();
        this.animatorPollAttachButtonsVisibility.setValue(false, false);
    }

    class AnonymousClass14 extends FrameLayout {
        AnonymousClass14(Context context) {
            super(context);
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
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.AnonymousClass14.dispatchTouchEvent(android.view.MotionEvent):boolean");
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
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            if (!PhotoViewer.this.inBubbleMode && AndroidUtilities.incorrectDisplaySizeFix) {
                int i3 = AndroidUtilities.displaySize.y;
                if (size2 > i3) {
                    size2 = i3;
                }
                size2 += AndroidUtilities.statusBarHeight;
            }
            int i4 = size2 - PhotoViewer.this.insets.bottom;
            int paddingLeft = size - (getPaddingLeft() + getPaddingRight());
            int paddingBottom = i4 - getPaddingBottom();
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
                            this.f$0.lambda$onLayout$0();
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
        public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) throws NumberFormatException {
            if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                if (PhotoViewer.this.textSelectionHelper.isInSelectionMode()) {
                    PhotoViewer.this.textSelectionHelper.clear();
                }
                if (PhotoViewer.this.isCaptionOpen()) {
                    PhotoViewer.this.closeCaptionEnter(true);
                    return false;
                }
                if (ContentPreviewViewer.getInstance().isVisible()) {
                    ContentPreviewViewer.getInstance().closeWithMenu();
                    return false;
                }
                PhotoViewer.getInstance().closePhoto(true, false);
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (PhotoViewer.this.stickerMakerBackgroundView != null && PhotoViewer.this.stickerMakerBackgroundView.getVisibility() == 0) {
                View view = (View) PhotoViewer.this.stickerMakerBackgroundView.getParent();
                float fMin = Math.min(PhotoViewer.this.stickerMakerBackgroundView.getAlpha(), view != null ? view.getAlpha() : 1.0f);
                if (fMin > 0.0f) {
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (fMin * 255.0f), 31);
                    PhotoViewer.this.stickerMakerBackgroundView.draw(canvas);
                    canvas.restore();
                }
            }
            if (PhotoViewer.this.isVisible) {
                PhotoViewer.this.blackPaint.setAlpha(PhotoViewer.this.backgroundDrawable.getAlpha());
                canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() + PhotoViewer.this.insets.bottom, PhotoViewer.this.blackPaint);
            }
        }

        @Override
        public void draw(Canvas canvas) {
            if (PhotoViewer.this.windowViewSkipRender) {
                return;
            }
            super.draw(canvas);
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

    class AnonymousClass18 extends ActionBar.ActionBarMenuOnItemClick {
        final Theme.ResourcesProvider val$resourcesProvider;

        AnonymousClass18(Theme.ResourcesProvider resourcesProvider) {
            this.val$resourcesProvider = resourcesProvider;
        }

        public void lambda$onItemClick$0(Uri uri) {
            BulletinFactory.createSaveToGalleryBulletin(PhotoViewer.this.containerView, false, true, -115203550, -1).show();
        }

        public void lambda$onItemClick$1(boolean z, Uri uri) {
            BulletinFactory.createSaveToGalleryBulletin(PhotoViewer.this.containerView, z, -115203550, -1).show();
        }

        public void lambda$onItemClick$4(AlertDialog alertDialog, int i) {
            File pathToMessage;
            if (PhotoViewer.this.currentMessageObject == null) {
                return;
            }
            File pathToAttach = null;
            if (!(MessageObject.getMedia(PhotoViewer.this.currentMessageObject.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) || MessageObject.getMedia(PhotoViewer.this.currentMessageObject.messageOwner).webpage == null || MessageObject.getMedia(PhotoViewer.this.currentMessageObject.messageOwner).webpage.document != null) {
                pathToMessage = FileLoader.getInstance(PhotoViewer.this.currentAccount).getPathToMessage(PhotoViewer.this.currentMessageObject.messageOwner);
            } else {
                PhotoViewer photoViewer = PhotoViewer.this;
                pathToMessage = FileLoader.getInstance(PhotoViewer.this.currentAccount).getPathToAttach(photoViewer.getFileLocation(photoViewer.currentIndex, null), true);
            }
            final boolean zIsVideo = PhotoViewer.this.currentMessageObject.isVideo();
            boolean zIsLivePhoto = PhotoViewer.this.currentMessageObject.isLivePhoto();
            if (zIsLivePhoto) {
                TLRPC.Document document = MessageObject.getMedia(PhotoViewer.this.currentMessageObject.messageOwner) != null ? MessageObject.getMedia(PhotoViewer.this.currentMessageObject.messageOwner).document : null;
                if (document != null && ((pathToAttach = FileLoader.getInstance(PhotoViewer.this.currentAccount).getPathToAttach(document, false)) == null || !pathToAttach.exists())) {
                    pathToAttach = FileLoader.getInstance(PhotoViewer.this.currentAccount).getPathToAttach(document, true);
                }
            }
            if (zIsLivePhoto) {
                if (pathToMessage == null || !pathToMessage.exists() || pathToAttach == null || !pathToAttach.exists()) {
                    PhotoViewer.this.showDownloadAlert();
                    return;
                } else {
                    MediaController.saveFile(pathToMessage.toString(), pathToAttach.toString(), PhotoViewer.this.parentActivity, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            this.f$0.lambda$onItemClick$2((Uri) obj);
                        }
                    });
                    return;
                }
            }
            if (pathToMessage == null || !pathToMessage.exists()) {
                PhotoViewer.this.showDownloadAlert();
            } else {
                MediaController.saveFile(pathToMessage.toString(), PhotoViewer.this.parentActivity, zIsVideo ? 1 : 0, null, null, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$onItemClick$3(zIsVideo, (Uri) obj);
                    }
                });
            }
        }

        public void lambda$onItemClick$2(Uri uri) {
            BulletinFactory.createSaveToGalleryBulletin(PhotoViewer.this.containerView, false, true, -115203550, -1).show();
        }

        public void lambda$onItemClick$3(boolean z, Uri uri) {
            BulletinFactory.createSaveToGalleryBulletin(PhotoViewer.this.containerView, z, -115203550, -1).show();
        }

        public void lambda$onItemClick$9(final boolean z, final boolean z2, final boolean z3, ArrayList arrayList, AlertDialog alertDialog, int i) {
            File pathToMessage;
            final int[] iArr = new int[1];
            final int[] iArr2 = new int[1];
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onItemClick$5(iArr2, iArr, z, z2, z3);
                }
            };
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i2);
                if (messageObject != null) {
                    File pathToAttach = null;
                    if (!(MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) || MessageObject.getMedia(messageObject.messageOwner).webpage == null || MessageObject.getMedia(messageObject.messageOwner).webpage.document != null) {
                        pathToMessage = FileLoader.getInstance(PhotoViewer.this.currentAccount).getPathToMessage(messageObject.messageOwner);
                    } else {
                        FileLoader fileLoader = FileLoader.getInstance(PhotoViewer.this.currentAccount);
                        PhotoViewer photoViewer = PhotoViewer.this;
                        pathToMessage = fileLoader.getPathToAttach(photoViewer.getFileLocation(photoViewer.currentIndex, null), true);
                    }
                    boolean zIsVideo = messageObject.isVideo();
                    boolean zIsLivePhoto = messageObject.isLivePhoto();
                    if (zIsLivePhoto) {
                        TLRPC.Document document = MessageObject.getMedia(messageObject.messageOwner) != null ? MessageObject.getMedia(messageObject.messageOwner).document : null;
                        if (document != null && ((pathToAttach = FileLoader.getInstance(PhotoViewer.this.currentAccount).getPathToAttach(document, false)) == null || !pathToAttach.exists())) {
                            pathToAttach = FileLoader.getInstance(PhotoViewer.this.currentAccount).getPathToAttach(document, true);
                        }
                    }
                    if (zIsLivePhoto && pathToMessage != null && pathToMessage.exists()) {
                        iArr[0] = iArr[0] + 1;
                        if (pathToAttach == null || !pathToAttach.exists()) {
                            MediaController.saveFile(pathToMessage.toString(), PhotoViewer.this.parentActivity, 0, null, null, new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    AndroidUtilities.runOnUIThread(runnable);
                                }
                            });
                        } else {
                            MediaController.saveFile(pathToMessage.toString(), pathToAttach.toString(), PhotoViewer.this.parentActivity, new Utilities.Callback() {
                                @Override
                                public final void run(Object obj) {
                                    AndroidUtilities.runOnUIThread(runnable);
                                }
                            });
                        }
                    } else if (!zIsLivePhoto && pathToMessage != null && pathToMessage.exists()) {
                        iArr[0] = iArr[0] + 1;
                        MediaController.saveFile(pathToMessage.toString(), PhotoViewer.this.parentActivity, zIsVideo ? 1 : 0, null, null, new Utilities.Callback() {
                            @Override
                            public final void run(Object obj) {
                                AndroidUtilities.runOnUIThread(runnable);
                            }
                        });
                    }
                }
            }
        }

        public void lambda$onItemClick$5(int[] iArr, int[] iArr2, boolean z, boolean z2, boolean z3) {
            int i = iArr[0] + 1;
            iArr[0] = i;
            if (i == iArr2[0]) {
                BulletinFactory.createSaveMediaToGalleryBulletin(PhotoViewer.this.containerView, iArr2[0], z, z2, z3, -115203550, -1).show();
            }
        }

        public void lambda$onItemClick$11(AlertDialog alertDialog, int i) throws Resources.NotFoundException {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(PhotoViewer.this.currentMessageObject);
            PhotoViewer.this.showShareAlert(arrayList);
        }

        public void lambda$onItemClick$12(ArrayList arrayList, AlertDialog alertDialog, int i) throws Resources.NotFoundException {
            PhotoViewer.this.showShareAlert(arrayList);
        }

        public boolean lambda$onItemClick$14(ArrayList arrayList, ChatActivity chatActivity, DialogsActivity dialogsActivity, ArrayList arrayList2, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) throws Resources.NotFoundException {
            UndoView undoView;
            long j;
            if (arrayList2.size() > 1 || ((MessagesStorage.TopicKey) arrayList2.get(0)).dialogId == UserConfig.getInstance(PhotoViewer.this.currentAccount).getClientUserId() || charSequence != null) {
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    long j2 = ((MessagesStorage.TopicKey) arrayList2.get(i3)).dialogId;
                    if (charSequence != null) {
                        j = j2;
                        SendMessagesHelper.getInstance(PhotoViewer.this.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j2, null, null, null, true, null, null, null, true, 0, 0, null, false));
                    } else {
                        j = j2;
                    }
                    SendMessagesHelper.getInstance(PhotoViewer.this.currentAccount).sendMessage(arrayList, j, false, false, true, 0, 0L);
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

        public static void lambda$onItemClick$15(boolean[] zArr, View view) {
            boolean z = !zArr[0];
            zArr[0] = z;
            ((CheckBoxCell) view).setChecked(z, true);
        }

        public void lambda$onItemClick$16(boolean[] zArr, AlertDialog alertDialog, int i) throws Resources.NotFoundException, NumberFormatException {
            ArrayList<Long> arrayList;
            TLRPC.EncryptedChat encryptedChat;
            if (PhotoViewer.this.placeProvider.onDeletePhoto(PhotoViewer.this.currentIndex)) {
                if (!PhotoViewer.this.imagesArr.isEmpty()) {
                    if (PhotoViewer.this.currentIndex < 0 || PhotoViewer.this.currentIndex >= PhotoViewer.this.imagesArr.size()) {
                        return;
                    }
                    MessageObject messageObject = (MessageObject) PhotoViewer.this.imagesArr.get(PhotoViewer.this.currentIndex);
                    if (messageObject.isSent()) {
                        PhotoViewer.this.closePhoto(false, false);
                        ArrayList<Integer> arrayList2 = new ArrayList<>();
                        if (PhotoViewer.this.slideshowMessageId != 0) {
                            arrayList2.add(Integer.valueOf(PhotoViewer.this.slideshowMessageId));
                        } else {
                            arrayList2.add(Integer.valueOf(messageObject.getId()));
                        }
                        if (!DialogObject.isEncryptedDialog(messageObject.getDialogId()) || messageObject.messageOwner.random_id == 0) {
                            arrayList = null;
                            encryptedChat = null;
                        } else {
                            ArrayList<Long> arrayList3 = new ArrayList<>();
                            arrayList3.add(Long.valueOf(messageObject.messageOwner.random_id));
                            encryptedChat = MessagesController.getInstance(PhotoViewer.this.currentAccount).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(messageObject.getDialogId())));
                            arrayList = arrayList3;
                        }
                        MessagesController.getInstance(PhotoViewer.this.currentAccount).deleteMessages(arrayList2, arrayList, encryptedChat, messageObject.getDialogId(), messageObject.getQuickReplyId(), zArr[0], messageObject.getChatMode());
                        return;
                    }
                    return;
                }
                if (!PhotoViewer.this.avatarsArr.isEmpty()) {
                    if (PhotoViewer.this.currentIndex < 0 || PhotoViewer.this.currentIndex >= PhotoViewer.this.avatarsArr.size()) {
                        return;
                    }
                    TLRPC.Message message = (TLRPC.Message) PhotoViewer.this.imagesArrMessages.get(PhotoViewer.this.currentIndex);
                    if (message != null) {
                        ArrayList<Integer> arrayList4 = new ArrayList<>();
                        arrayList4.add(Integer.valueOf(message.id));
                        MessagesController.getInstance(PhotoViewer.this.currentAccount).deleteMessages(arrayList4, null, null, MessageObject.getDialogId(message), message.quick_reply_shortcut_id, true, 0);
                        NotificationCenter.getInstance(PhotoViewer.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                    }
                    if (!PhotoViewer.this.isCurrentAvatarSet()) {
                        TLRPC.Photo photo = (TLRPC.Photo) PhotoViewer.this.avatarsArr.get(PhotoViewer.this.currentIndex);
                        if (photo == null) {
                            return;
                        }
                        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                        tL_inputPhoto.id = photo.id;
                        tL_inputPhoto.access_hash = photo.access_hash;
                        byte[] bArr = photo.file_reference;
                        tL_inputPhoto.file_reference = bArr;
                        if (bArr == null) {
                            tL_inputPhoto.file_reference = new byte[0];
                        }
                        if (PhotoViewer.this.avatarsDialogId > 0) {
                            MessagesController.getInstance(PhotoViewer.this.currentAccount).deleteUserPhoto(tL_inputPhoto);
                        }
                        MessagesStorage.getInstance(PhotoViewer.this.currentAccount).clearUserPhoto(PhotoViewer.this.avatarsDialogId, photo.id);
                        PhotoViewer.this.imagesArrLocations.remove(PhotoViewer.this.currentIndex);
                        PhotoViewer.this.imagesArrLocationsSizes.remove(PhotoViewer.this.currentIndex);
                        PhotoViewer.this.imagesArrLocationsVideo.remove(PhotoViewer.this.currentIndex);
                        PhotoViewer.this.imagesArrMessages.remove(PhotoViewer.this.currentIndex);
                        PhotoViewer.this.avatarsArr.remove(PhotoViewer.this.currentIndex);
                        if (!PhotoViewer.this.imagesArrLocations.isEmpty()) {
                            int size = PhotoViewer.this.currentIndex;
                            if (size >= PhotoViewer.this.avatarsArr.size()) {
                                size = PhotoViewer.this.avatarsArr.size() - 1;
                            }
                            PhotoViewer.this.currentIndex = -1;
                            PhotoViewer.this.setImageIndex(size);
                        } else {
                            PhotoViewer.this.closePhoto(false, false);
                        }
                        if (message == null) {
                            NotificationCenter.getInstance(PhotoViewer.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                            return;
                        }
                        return;
                    }
                    if (PhotoViewer.this.avatarsDialogId > 0) {
                        MessagesController.getInstance(PhotoViewer.this.currentAccount).deleteUserPhoto(null);
                    } else {
                        MessagesController.getInstance(PhotoViewer.this.currentAccount).changeChatAvatar(-PhotoViewer.this.avatarsDialogId, null, null, null, null, 0.0d, null, null, null, null);
                    }
                    PhotoViewer.this.closePhoto(false, false);
                    return;
                }
                if (PhotoViewer.this.secureDocuments.isEmpty() || PhotoViewer.this.placeProvider == null) {
                    return;
                }
                PhotoViewer.this.secureDocuments.remove(PhotoViewer.this.currentIndex);
                PhotoViewer.this.placeProvider.deleteImageAtIndex(PhotoViewer.this.currentIndex);
                if (!PhotoViewer.this.secureDocuments.isEmpty()) {
                    int size2 = PhotoViewer.this.currentIndex;
                    if (size2 >= PhotoViewer.this.secureDocuments.size()) {
                        size2 = PhotoViewer.this.secureDocuments.size() - 1;
                    }
                    PhotoViewer.this.currentIndex = -1;
                    PhotoViewer.this.setImageIndex(size2);
                    return;
                }
                PhotoViewer.this.closePhoto(false, false);
                return;
            }
            PhotoViewer.this.closePhoto(false, false);
        }

        @Override
        public void onItemClick(int r36) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.AnonymousClass18.onItemClick(int):void");
        }

        public void lambda$onItemClick$18(final UserConfig userConfig, final TLRPC.Photo photo, final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onItemClick$17(tLObject, userConfig, photo);
                }
            });
        }

        public void lambda$onItemClick$17(TLObject tLObject, UserConfig userConfig, TLRPC.Photo photo) {
            if (tLObject instanceof TLRPC.TL_photos_photo) {
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                MessagesController.getInstance(PhotoViewer.this.currentAccount).putUsers(tL_photos_photo.users, false);
                TLRPC.User user = MessagesController.getInstance(PhotoViewer.this.currentAccount).getUser(Long.valueOf(userConfig.clientUserId));
                if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                    int iIndexOf = PhotoViewer.this.avatarsArr.indexOf(photo);
                    if (iIndexOf >= 0) {
                        PhotoViewer.this.avatarsArr.set(iIndexOf, tL_photos_photo.photo);
                    }
                    if (user != null) {
                        user.photo.photo_id = tL_photos_photo.photo.id;
                        userConfig.setCurrentUser(user);
                        userConfig.saveConfig(true);
                    }
                }
            }
        }

        public void lambda$onItemClick$19() {
            if (PhotoViewer.this.menuItem == null) {
                return;
            }
            PhotoViewer.this.menuItem.hideSubItem(14);
        }

        public void lambda$onItemClick$20() {
            PhotoViewer.this.menuItem.hideSubItem(19);
            PhotoViewer.this.menuItem.showSubItem(20);
        }

        public void lambda$onItemClick$22() {
            PhotoViewer.this.menuItem.showSubItem(19);
            PhotoViewer.this.menuItem.hideSubItem(20);
        }

        @Override
        public boolean canOpenMenu() {
            if (PhotoViewer.this.currentMessageObject != null || PhotoViewer.this.currentSecureDocument != null) {
                return true;
            }
            if (PhotoViewer.this.currentFileLocationVideo == null) {
                return PhotoViewer.this.pageBlocksAdapter != null;
            }
            File pathToAttach = FileLoader.getInstance(PhotoViewer.this.currentAccount).getPathToAttach(PhotoViewer.getFileLocation(PhotoViewer.this.currentFileLocationVideo), PhotoViewer.getFileLocationExt(PhotoViewer.this.currentFileLocationVideo), PhotoViewer.this.avatarsDialogId != 0 || PhotoViewer.this.isEvent);
            return pathToAttach.exists() || new File(FileLoader.getDirectory(4), pathToAttach.getName()).exists() || FileLoader.getInstance(PhotoViewer.this.currentAccount).getPathToAttach(PhotoViewer.getFileLocation(PhotoViewer.this.currentFileLocationVideo), PhotoViewer.getFileLocationExt(PhotoViewer.this.currentFileLocationVideo), false).exists();
        }
    }

    public void lambda$setParentActivity$7(Float f, Boolean bool) {
        chooseSpeed((f.floatValue() * 2.8f) + 0.2f, bool.booleanValue(), false);
    }

    public void lambda$setParentActivity$8(Boolean bool) {
        checkProgress(0, false, false);
    }

    public void lambda$setParentActivity$9(View view) {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.isSponsored()) {
            openAdsMenu();
        } else if (this.actionBar.actionBarMenuOnItemClick.canOpenMenu()) {
            this.menuItem.toggleSubMenu();
        }
    }

    public void lambda$setParentActivity$10(Boolean bool) {
        checkProgress(0, false, false);
    }

    public void lambda$setParentActivity$13(MessageObject messageObject, VideoPlayer.Quality quality) {
        TLRPC.Document downloadDocument;
        if (quality == null || (downloadDocument = quality.getDownloadDocument()) == null) {
            return;
        }
        File pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(downloadDocument, null, false, true);
        if (pathToAttach == null || !pathToAttach.exists()) {
            pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(downloadDocument, null, true, true);
        }
        if (pathToAttach != null && pathToAttach.exists()) {
            MediaController.saveFile(pathToAttach.toString(), this.parentActivity, 1, null, null, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$setParentActivity$11((Uri) obj);
                }
            });
        } else {
            ArrayList arrayList = new ArrayList();
            messageObject.qualityToSave = downloadDocument;
            arrayList.add(messageObject);
            MediaController.saveFilesFromMessages(this.parentActivity, AccountInstance.getInstance(this.currentAccount), arrayList, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i) {
                    this.f$0.lambda$setParentActivity$12(i);
                }
            });
        }
        this.menuItem.toggleSubMenu();
    }

    public void lambda$setParentActivity$11(Uri uri) {
        BulletinFactory.createSaveToGalleryBulletin((FrameLayout) this.containerView, true, -115203550, -1).show();
    }

    public void lambda$setParentActivity$12(int i) {
        FrameLayoutDrawer frameLayoutDrawer;
        if (this.parentActivity == null || (frameLayoutDrawer = this.containerView) == null || i <= 0) {
            return;
        }
        BulletinFactory.createSaveToGalleryBulletin((FrameLayout) frameLayoutDrawer, true, -115203550, -1).show();
    }

    public void lambda$setParentActivity$14(View view) {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null && messageObject.hasVideoQualities() && this.chooseDownloadQualityLayout.update(this.currentMessageObject)) {
            this.galleryButton.openSwipeBack();
            return;
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar == null || actionBar.getActionBarMenuOnItemClick() == null) {
            return;
        }
        this.actionBar.getActionBarMenuOnItemClick().onItemClick(2);
        this.menuItem.toggleSubMenu();
    }

    public void lambda$setParentActivity$15(View view) {
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

    public View lambda$setParentActivity$16() {
        return new CaptionTextView(this.activityContext, this.captionScrollView, this.textSelectionHelper, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) throws NumberFormatException {
                this.f$0.onLinkClick((ClickableSpan) obj, (TextView) obj2);
            }
        }, new Utilities.Callback3() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3) {
                this.f$0.onLinkLongPress((ClickableSpan) obj, (TextView) obj2, (Runnable) obj3);
            }
        });
    }

    public void lambda$setParentActivity$17(View view) throws NumberFormatException {
        this.selectedCompression = this.previousCompression;
        didChangedCompressionLevel(false);
        showQualityView(false);
        requestVideoPreview(2);
    }

    public void lambda$setParentActivity$18(View view) throws NumberFormatException {
        Object obj = this.imagesArrLocals.get(this.currentIndex);
        if (obj instanceof MediaController.MediaEditState) {
            ((MediaController.MediaEditState) obj).editedInfo = getCurrentVideoEditedInfo();
        }
        showQualityView(false);
        requestVideoPreview(2);
    }

    public void lambda$setParentActivity$19(View view) throws NumberFormatException {
        lambda$showScheduleDatePickerDialog$85(false, 0, 0);
    }

    class AnonymousClass29 implements VideoTimelinePlayView.VideoTimelineViewDelegate {
        private int seekTo;
        private Runnable seekToRunnable;
        private boolean wasPlaying;

        AnonymousClass29() {
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
                return;
            }
            if (this.seekToRunnable == null) {
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$seekTo$0();
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
                            photoViewer.avatarStartTime = (long) (photoViewer.videoDuration * 1000.0f * PhotoViewer.this.videoTimelineView.getLeftProgress());
                        } else {
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            photoViewer2.avatarStartTime = (long) (photoViewer2.videoDuration * 1000.0f * PhotoViewer.this.videoTimelineView.getRightProgress());
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
            photoViewer4.avatarStartTime = (long) (photoViewer4.videoDuration * 1000.0f * PhotoViewer.this.avatarStartProgress);
        }

        @Override
        public void didStartDragging(int i) {
            if (i == VideoTimelinePlayView.TYPE_PROGRESS) {
                PhotoViewer.this.cancelVideoPlayRunnable();
                if (PhotoViewer.this.sendPhotoType == 1) {
                    PhotoViewer.this.cancelFlashAnimations();
                    PhotoViewer.this.captureFrameAtTime = -1L;
                }
                boolean zIsVideoPlaying = PhotoViewer.this.isVideoPlaying();
                this.wasPlaying = zIsVideoPlaying;
                if (zIsVideoPlaying) {
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

    public void lambda$setParentActivity$20(View view) {
        switchToEditMode(5);
    }

    public void lambda$setParentActivity$21() {
        switchToEditMode(0);
    }

    public void lambda$setParentActivity$28(View view) {
        int i;
        if (this.coverEditor.button.isLoading() || (i = this.currentIndex) < 0 || i >= this.imagesArrLocals.size() || !(this.imagesArrLocals.get(this.currentIndex) instanceof MediaController.PhotoEntry)) {
            return;
        }
        final MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.imagesArrLocals.get(this.currentIndex);
        final long time = this.coverEditor.getTime();
        final String tempFileAbsolutePath = getTempFileAbsolutePath();
        this.coverEditor.button.setLoading(true);
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setParentActivity$27(tempFileAbsolutePath, photoEntry, time);
            }
        });
    }

    public void lambda$setParentActivity$27(final String str, final MediaController.PhotoEntry photoEntry, final long j) {
        final Utilities.Callback callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) throws IOException {
                this.f$0.lambda$setParentActivity$25(str, photoEntry, j, (Bitmap) obj);
            }
        };
        if (this.usedSurfaceView) {
            final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.videoSurfaceView.getWidth(), this.videoSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
            AndroidUtilities.getBitmapFromSurface(this.videoSurfaceView, bitmapCreateBitmap, new Runnable() {
                @Override
                public final void run() {
                    callback.run(bitmapCreateBitmap);
                }
            });
            return;
        }
        TextureView textureView = this.videoTextureView;
        Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), this.videoTextureView.getHeight());
        if (bitmap == null) {
            callback.run(SendMessagesHelper.createVideoThumbnailAtTime(photoEntry.path, j, null, true));
        } else {
            callback.run(bitmap);
        }
    }

    public void lambda$setParentActivity$25(final String str, final MediaController.PhotoEntry photoEntry, final long j, Bitmap bitmap) throws IOException {
        if (bitmap == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setParentActivity$22();
                }
            });
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.close();
            final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint(3);
            canvas.translate(bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
            float fMax = Math.max(bitmapCreateBitmap.getWidth() / bitmap.getWidth(), bitmapCreateBitmap.getHeight() / bitmap.getHeight());
            canvas.scale(fMax, fMax);
            canvas.drawBitmap(bitmap, (-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f, paint);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setParentActivity$24(photoEntry, j, str, bitmapCreateBitmap);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setParentActivity$23();
                }
            });
        }
    }

    public void lambda$setParentActivity$22() {
        this.coverEditor.button.setLoading(false);
        switchToEditMode(0);
    }

    public void lambda$setParentActivity$23() {
        this.coverEditor.button.setLoading(false);
        switchToEditMode(0);
    }

    public void lambda$setParentActivity$24(MediaController.PhotoEntry photoEntry, long j, String str, Bitmap bitmap) {
        if (photoEntry.coverPath != null) {
            try {
                new File(photoEntry.coverPath).delete();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        photoEntry.coverSavedPosition = j;
        photoEntry.coverPath = str;
        photoEntry.coverPhoto = null;
        photoEntry.coverPhotoParentObject = null;
        this.coverEditor.button.setLoading(false);
        PhotoViewerProvider photoViewerProvider = this.placeProvider;
        if (photoViewerProvider != null) {
            photoViewerProvider.updatePhotoAtIndex(this.currentIndex);
        }
        EditCoverButton editCoverButton = this.editCoverButton;
        if (editCoverButton != null) {
            editCoverButton.lambda$setImage$0(bitmap);
        }
        switchToEditMode(0);
        if (this.checkImageView.isChecked()) {
            return;
        }
        this.checkImageView.callOnClick();
    }

    public void lambda$setParentActivity$33(final MediaController.PhotoEntry photoEntry) {
        int i;
        if (this.coverEditor.button.isLoading() || (i = this.currentIndex) < 0 || i >= this.imagesArrLocals.size() || !(this.imagesArrLocals.get(this.currentIndex) instanceof MediaController.PhotoEntry)) {
            return;
        }
        this.coverEditor.closeGallery();
        this.coverEditor.button.setLoading(true);
        final MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) this.imagesArrLocals.get(this.currentIndex);
        final String tempFileAbsolutePath = getTempFileAbsolutePath();
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws IOException {
                this.f$0.lambda$setParentActivity$32(photoEntry, photoEntry2, tempFileAbsolutePath);
            }
        });
    }

    public void lambda$setParentActivity$32(MediaController.PhotoEntry photoEntry, final MediaController.PhotoEntry photoEntry2, final String str) throws IOException {
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(photoEntry.path);
        if (bitmapDecodeFile == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setParentActivity$29();
                }
            });
            return;
        }
        int[] iArr = new int[11];
        AnimatedFileDrawable.getVideoInfo(photoEntry2.path, iArr, 0L);
        int iMax = Math.max(iArr[1], photoEntry2.width);
        int iMax2 = Math.max(iArr[2], photoEntry2.height);
        if ((iArr[8] / 90) % 2 == 1) {
            iMax2 = iMax;
            iMax = iMax2;
        }
        float f = iMax;
        float f2 = iMax2;
        float fMax = Math.max(bitmapDecodeFile.getWidth() / f, bitmapDecodeFile.getHeight() / f2);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (f * fMax), (int) (f2 * fMax), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        canvas.translate(bitmapCreateBitmap.getWidth() / 2, bitmapCreateBitmap.getHeight() / 2);
        float fMax2 = Math.max(bitmapCreateBitmap.getWidth() / bitmapDecodeFile.getWidth(), bitmapCreateBitmap.getHeight() / bitmapDecodeFile.getHeight());
        canvas.scale(fMax2, fMax2);
        canvas.drawBitmap(bitmapDecodeFile, (-bitmapDecodeFile.getWidth()) / 2, (-bitmapDecodeFile.getHeight()) / 2, paint);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.close();
            final Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), config);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            canvas2.translate(bitmapCreateBitmap2.getWidth() / 2.0f, bitmapCreateBitmap2.getHeight() / 2.0f);
            float fMax3 = Math.max(bitmapCreateBitmap2.getWidth() / bitmapCreateBitmap.getWidth(), bitmapCreateBitmap2.getHeight() / bitmapCreateBitmap.getHeight());
            canvas2.scale(fMax3, fMax3);
            canvas2.drawBitmap(bitmapCreateBitmap, (-bitmapCreateBitmap.getWidth()) / 2.0f, (-bitmapCreateBitmap.getHeight()) / 2.0f, paint);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setParentActivity$31(photoEntry2, str, bitmapCreateBitmap2);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setParentActivity$30();
                }
            });
        }
    }

    public void lambda$setParentActivity$29() {
        this.coverEditor.button.setLoading(false);
        switchToEditMode(0);
    }

    public void lambda$setParentActivity$30() {
        this.coverEditor.button.setLoading(false);
        switchToEditMode(0);
    }

    public void lambda$setParentActivity$31(MediaController.PhotoEntry photoEntry, String str, Bitmap bitmap) {
        if (photoEntry.coverPath != null) {
            try {
                new File(photoEntry.coverPath).delete();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        photoEntry.coverSavedPosition = -1L;
        photoEntry.coverPath = str;
        photoEntry.coverPhoto = null;
        photoEntry.coverPhotoParentObject = null;
        this.coverEditor.button.setLoading(false);
        PhotoViewerProvider photoViewerProvider = this.placeProvider;
        if (photoViewerProvider != null) {
            photoViewerProvider.updatePhotoAtIndex(this.currentIndex);
        }
        EditCoverButton editCoverButton = this.editCoverButton;
        if (editCoverButton != null) {
            editCoverButton.lambda$setImage$0(bitmap);
        }
        switchToEditMode(0);
        if (this.checkImageView.isChecked()) {
            return;
        }
        this.checkImageView.callOnClick();
    }

    public void lambda$setParentActivity$35(View view) {
        if (isCaptionOpen()) {
            return;
        }
        this.muteVideo = !this.muteVideo;
        ArrayList arrayList = this.muteHints;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((HintView2) it.next()).hide();
            }
        }
        if (this.muteVideo) {
            final HintView2 hintView2 = new HintView2(this.parentActivity, 3);
            hintView2.setMultilineText(true);
            hintView2.setText(LocaleController.getString(R.string.EditorMuteHint));
            hintView2.setMaxWidthPx(HintView2.cutInFancyHalf(hintView2.getText(), hintView2.getTextPaint()));
            hintView2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
            hintView2.setJoint(0.0f, 22.0f);
            hintView2.setOnHiddenListener(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setParentActivity$34(hintView2);
                }
            });
            if (this.muteHints == null) {
                this.muteHints = new ArrayList();
            }
            this.containerView.addView(hintView2, LayoutHelper.createFrame(-1, 200, 83));
            this.muteHints.add(hintView2);
            hintView2.show();
        }
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

    public void lambda$setParentActivity$34(HintView2 hintView2) {
        ArrayList arrayList = this.muteHints;
        if (arrayList != null) {
            arrayList.remove(hintView2);
        }
    }

    public void lambda$setParentActivity$37(View view) {
        VideoPlayer videoPlayer;
        setUnalivePhoto(!isUnalivePhoto());
        this.livePhotoButton.setValue(!isUnalivePhoto(), true);
        this.videoTimelineView.animate().alpha(isUnalivePhoto() ? 0.45f : 1.0f).start();
        if (isUnalivePhoto() && (videoPlayer = this.videoPlayer) != null) {
            videoPlayer.pause();
        }
        this.containerView.invalidate();
        if (this.muteHints == null) {
            this.muteHints = new ArrayList();
        }
        if (this.livePhotoHints == null) {
            this.livePhotoHints = new ArrayList();
        }
        Iterator it = this.muteHints.iterator();
        while (it.hasNext()) {
            ((HintView2) it.next()).hide();
        }
        final HintView2 hintView2 = new HintView2(this.parentActivity, 3);
        hintView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(isUnalivePhoto() ? R.string.LivePhotoOff : R.string.LivePhotoOn)));
        hintView2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        hintView2.setJoint(0.0f, 28.0f);
        hintView2.setOnHiddenListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setParentActivity$36(hintView2);
            }
        });
        this.containerView.addView(hintView2, LayoutHelper.createFrame(-1, 200, 83));
        this.muteHints.add(hintView2);
        this.livePhotoHints.add(hintView2);
        hintView2.show();
    }

    public void lambda$setParentActivity$36(HintView2 hintView2) {
        ArrayList arrayList = this.muteHints;
        if (arrayList != null) {
            arrayList.remove(hintView2);
        }
        ArrayList arrayList2 = this.livePhotoHints;
        if (arrayList2 != null) {
            arrayList2.remove(hintView2);
        }
    }

    public void lambda$setParentActivity$38(Integer num) {
        Object obj = this.imagesArrLocals.get(this.currentIndex);
        if (obj instanceof MediaController.PhotoEntry) {
            ((MediaController.PhotoEntry) obj).ttl = num.intValue();
        } else if (obj instanceof MediaController.SearchImage) {
            ((MediaController.SearchImage) obj).ttl = num.intValue();
        }
        if (num.intValue() != 0 && !this.placeProvider.isPhotoChecked(this.currentIndex)) {
            setPhotoChecked();
        }
        this.topCaptionEdit.setTimer(num.intValue());
    }

    public void lambda$setParentActivity$39(Integer num) {
        FrameLayout frameLayout = this.videoTimelineViewContainer;
        if (frameLayout != null && frameLayout.getVisibility() != 8) {
            this.videoTimelineViewContainer.setTranslationY(this.pickerView.getTranslationY() - (Math.max(0, this.captionEdit.getEditTextHeight() - AndroidUtilities.dp(46.0f)) * this.captionEdit.getAlpha()));
        }
        this.muteButton.setTranslationY((-Math.max(0, num.intValue() - AndroidUtilities.dp(46.0f))) * this.captionEdit.getAlpha());
        this.livePhotoButton.setTranslationY((-Math.max(0, num.intValue() - AndroidUtilities.dp(46.0f))) * this.captionEdit.getAlpha());
        this.editCoverButton.setTranslationY((-Math.max(0, num.intValue() - AndroidUtilities.dp(46.0f))) * this.captionEdit.getAlpha());
        MentionsContainerView mentionsContainerView = this.captionEdit.mentionContainer;
        if (mentionsContainerView != null) {
            mentionsContainerView.setTranslationY((-num.intValue()) - AndroidUtilities.dp(14.0f));
        }
    }

    public void lambda$setParentActivity$40(View view) throws NumberFormatException {
        if (this.placeProvider == null || isCaptionOpen()) {
            return;
        }
        this.placeProvider.needAddMorePhotos();
        closePhoto(true, false);
    }

    public void lambda$setParentActivity$41(Integer num) {
        Object obj = this.imagesArrLocals.get(this.currentIndex);
        if (obj instanceof MediaController.PhotoEntry) {
            ((MediaController.PhotoEntry) obj).ttl = num.intValue();
        } else if (obj instanceof MediaController.SearchImage) {
            ((MediaController.SearchImage) obj).ttl = num.intValue();
        }
        if (num.intValue() != 0 && !this.placeProvider.isPhotoChecked(this.currentIndex)) {
            setPhotoChecked();
        }
        this.captionEdit.setTimer(num.intValue());
    }

    public void lambda$setParentActivity$42(Integer num) {
        MentionsContainerView mentionsContainerView = this.topCaptionEdit.mentionContainer;
        if (mentionsContainerView != null) {
            mentionsContainerView.setTranslationY(num.intValue());
        }
    }

    public void lambda$setParentActivity$43(View view) throws NumberFormatException {
        if (this.placeProvider == null || isCaptionOpen()) {
            return;
        }
        this.placeProvider.needAddMorePhotos();
        closePhoto(true, false);
    }

    public void lambda$setParentActivity$55(View view) {
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
                    this.f$0.lambda$setParentActivity$54(z, mediaEditState, (StickerMakerView.SegmentedObject) obj);
                }
            });
            this.containerView.invalidate();
        } else {
            if (this.cutOutBtn.isCancelState()) {
                this.cutOutBtn.setCutOutState(true);
                showEditStickerMode(false, true);
                this.stickerMakerView.disableClippingMode();
                this.containerView.invalidate();
                return;
            }
            this.stickerMakerView.resetPaths();
            this.stickerMakerView.getThanosEffect();
            this.stickerMakerView.setSegmentedState(false, null);
            this.centerImage.setImageBitmap(this.stickerMakerView.getSourceBitmap(z));
            this.cutOutBtn.setCutOutState(true);
            showEditStickerMode(false, true);
            applyCurrentEditMode();
        }
    }

    public void lambda$setParentActivity$54(boolean r17, org.telegram.messenger.MediaController.MediaEditState r18, org.telegram.ui.Components.Paint.Views.StickerMakerView.SegmentedObject r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.lambda$setParentActivity$54(boolean, org.telegram.messenger.MediaController$MediaEditState, org.telegram.ui.Components.Paint.Views.StickerMakerView$SegmentedObject):void");
    }

    public void lambda$setParentActivity$45(final Bitmap bitmap) {
        lambda$setParentActivity$50(bitmap);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setParentActivity$44(bitmap);
            }
        });
    }

    public void lambda$setParentActivity$44(Bitmap bitmap) {
        this.centerImage.setImageBitmap(bitmap);
        this.cutOutBtn.setUndoCutState(true);
        showStickerMode(true, true);
    }

    public void lambda$setParentActivity$47(final Bitmap bitmap) {
        lambda$setParentActivity$50(bitmap);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setParentActivity$46(bitmap);
            }
        });
    }

    public void lambda$setParentActivity$46(Bitmap bitmap) {
        this.centerImage.setImageBitmap(bitmap);
        this.cutOutBtn.setUndoCutState(true);
        showStickerMode(true, true);
    }

    public void lambda$setParentActivity$49(final Bitmap bitmap) {
        lambda$setParentActivity$50(bitmap);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setParentActivity$48(bitmap);
            }
        });
    }

    public void lambda$setParentActivity$48(Bitmap bitmap) {
        this.centerImage.setImageBitmap(bitmap);
        this.cutOutBtn.setUndoCutState(true);
        showStickerMode(true, true);
    }

    public void lambda$setParentActivity$51() {
        this.stickerMakerView.isThanosInProgress = false;
    }

    public void lambda$setParentActivity$52(Bitmap bitmap, Runnable runnable) {
        this.centerImage.setImageBitmap(bitmap);
        this.cutOutBtn.setUndoCutState(true);
        showStickerMode(true, true);
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 800L);
    }

    public void lambda$setParentActivity$56(View view) {
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

    public void lambda$setParentActivity$57(View view) {
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

    public void lambda$setParentActivity$58(View view) {
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

    public void lambda$setParentActivity$59(View view) {
        if (this.stickerMakerView != null) {
            this.outlineBtn.setActive(!r3.isActive(), true);
            this.stickerMakerView.setOutlineVisible((!this.outlineBtn.isActive() || this.eraseBtn.isActive() || this.restoreBtn.isActive()) ? false : true);
        }
    }

    public void lambda$setParentActivity$60(View view) throws NumberFormatException {
        MessageObject messageObject;
        MessageSuggestionParams messageSuggestionParamsOf;
        ChatActivity chatActivity = this.parentChatActivity;
        if (chatActivity != null && (messageObject = chatActivity.editingMessageObject) != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(this.currentAccount, this.parentChatActivity.editingMessageObject.getDialogId())) {
            if (this.parentFragment == null || (messageSuggestionParamsOf = this.parentChatActivity.messageSuggestionParams) == null) {
                messageSuggestionParamsOf = MessageSuggestionParams.of(this.parentChatActivity.editingMessageObject.messageOwner.suggested_post);
            }
            if (!StarsController.isEnoughAmount(this.currentAccount, messageSuggestionParamsOf.amount)) {
                ChatActivity chatActivity2 = this.parentChatActivity;
                if (chatActivity2 != null) {
                    chatActivity2.showSuggestionOfferForEditMessage(messageSuggestionParamsOf);
                    return;
                }
                return;
            }
        }
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
        ChatActivity chatActivity3 = this.parentChatActivity;
        if (chatActivity3 != null && chatActivity3.isInScheduleMode() && !this.parentChatActivity.isEditingMessageMedia()) {
            showScheduleDatePickerDialog();
        } else {
            lambda$showScheduleDatePickerDialog$85(true, 0, 0);
        }
    }

    public boolean lambda$setParentActivity$64(View view) {
        TLRPC.User user;
        boolean zCanSchedule;
        boolean z;
        PhotoViewerProvider photoViewerProvider = this.placeProvider;
        if ((photoViewerProvider != null && !photoViewerProvider.allowSendingSubmenu()) || this.sendPhotoType == 11) {
            return false;
        }
        BaseFragment baseFragment = this.parentFragment;
        boolean z2 = (baseFragment == null || baseFragment.getLastStoryViewer() == null) ? false : true;
        ChatActivity chatActivity = this.parentChatActivity;
        if (chatActivity != null && chatActivity.isInScheduleMode()) {
            return false;
        }
        if ((this.parentChatActivity == null && !z2 && this.placeProvider == null) || this.captionEdit.isCaptionOverLimit()) {
            return false;
        }
        ChatActivity chatActivity2 = this.parentChatActivity;
        if (chatActivity2 != null) {
            user = chatActivity2.getCurrentUser();
            zCanSchedule = this.parentChatActivity.canScheduleMessage();
        } else {
            PhotoViewerProvider photoViewerProvider2 = this.placeProvider;
            if (photoViewerProvider2 == null) {
                return false;
            }
            long dialogId = photoViewerProvider2.getDialogId();
            user = dialogId != 0 ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialogId)) : null;
            zCanSchedule = this.placeProvider.canSchedule();
        }
        PhotoViewerProvider photoViewerProvider3 = this.placeProvider;
        boolean z3 = photoViewerProvider3 != null && photoViewerProvider3.canEdit(this.currentIndex);
        PhotoViewerProvider photoViewerProvider4 = this.placeProvider;
        boolean z4 = photoViewerProvider4 != null && photoViewerProvider4.canReplace(this.currentIndex);
        boolean zIsUserSelf = UserObject.isUserSelf(user);
        PhotoViewerProvider photoViewerProvider5 = this.placeProvider;
        if (photoViewerProvider5 == null || photoViewerProvider5.getSelectedPhotos() == null) {
            z = false;
        } else {
            Iterator it = this.placeProvider.getSelectedPhotos().entrySet().iterator();
            while (it.hasNext()) {
                Object value = ((Map.Entry) it.next()).getValue();
                if (value instanceof MediaController.PhotoEntry) {
                    if (((MediaController.PhotoEntry) value).ttl != 0) {
                        z = true;
                        break;
                    }
                } else if ((value instanceof MediaController.SearchImage) && ((MediaController.SearchImage) value).ttl != 0) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        boolean z5 = (z3 || this.isCurrentVideo || this.captionEdit.hasTimer()) ? false : true;
        boolean z6 = (z3 || !zCanSchedule || z) ? false : true;
        boolean z7 = ((z3 && z4) || zIsUserSelf) ? false : true;
        PhotoViewerProvider photoViewerProvider6 = this.placeProvider;
        ItemOptions itemOptionsAddIf = ItemOptions.makeOptions(this.containerView, new DarkThemeResourceProvider(), view).addIf(z5, R.drawable.msg_sendfile, LocaleController.getString(photoViewerProvider6 != null && photoViewerProvider6.getSelectedCount() > 1 ? R.string.SendAsFiles : R.string.SendAsFile), new Runnable() {
            @Override
            public final void run() throws NumberFormatException {
                this.f$0.lambda$setParentActivity$61();
            }
        }).addIf(z4, R.drawable.msg_send, LocaleController.getString(R.string.SendAsNewPhoto), new Runnable() {
            @Override
            public final void run() throws NumberFormatException {
                this.f$0.lambda$setParentActivity$62();
            }
        }).addIf(z4, R.drawable.msg_replace, LocaleController.getString(R.string.ReplacePhoto), new Runnable() {
            @Override
            public final void run() throws NumberFormatException {
                this.f$0.replacePressed();
            }
        }).addIf(z6, R.drawable.msg_calendar2, LocaleController.getString(zIsUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new Runnable() {
            @Override
            public final void run() {
                this.f$0.showScheduleDatePickerDialog();
            }
        }).addIf(z7, R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new Runnable() {
            @Override
            public final void run() throws NumberFormatException {
                this.f$0.lambda$setParentActivity$63();
            }
        });
        if (itemOptionsAddIf.getItemsCount() == 0) {
            return false;
        }
        itemOptionsAddIf.setGravity(5).show();
        return true;
    }

    public void lambda$setParentActivity$61() throws NumberFormatException {
        sendPressed(true, 0, 0, false, true, false);
    }

    public void lambda$setParentActivity$62() throws NumberFormatException {
        lambda$showScheduleDatePickerDialog$85(true, 0, 0);
    }

    public void lambda$setParentActivity$63() throws NumberFormatException {
        lambda$showScheduleDatePickerDialog$85(false, 0, 0);
    }

    public void lambda$setParentActivity$65(View view) {
        this.animatorPollAttachButtonsVisibility.setValue(false, true);
    }

    public void lambda$setParentActivity$66(View view) throws NumberFormatException {
        PhotoViewerProvider photoViewerProvider;
        if (this.parentActivity == null || (photoViewerProvider = this.placeProvider) == null) {
            return;
        }
        photoViewerProvider.onPollAttachReplace();
        closePhoto(true, false);
    }

    public void lambda$setParentActivity$67(View view) {
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

    public void lambda$setParentActivity$68(View view) {
        cropRotate(-90.0f);
    }

    public void lambda$setParentActivity$69(View view) {
        cropMirror();
    }

    public void lambda$setParentActivity$70(View view) {
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

    public void lambda$setParentActivity$71(Activity activity, View view) throws NumberFormatException {
        if (isCaptionOpen() || this.muteVideo) {
            return;
        }
        int i = this.currentIndex;
        if (i >= 0 && i < this.imagesArrLocals.size()) {
            Object obj = this.imagesArrLocals.get(this.currentIndex);
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                    photoEntry.highQuality = Boolean.valueOf(!photoEntry.isHighQuality());
                    this.compressItem.setPhotoState(photoEntry.isHighQuality());
                    showPhotoQualityHint(photoEntry.isHighQuality());
                    SharedConfig.photoHighQualityDefault = photoEntry.isHighQuality();
                    ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit().putBoolean("photoHighQualityDefault", SharedConfig.photoHighQualityDefault).apply();
                    return;
                }
            }
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

    public void lambda$setParentActivity$72(View view) {
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

    public void lambda$setParentActivity$74(View view) {
        if (this.imageMoveAnimation != null) {
            return;
        }
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setParentActivity$73();
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

    public void lambda$setParentActivity$73() {
        this.cropTransform.setViewTransform(this.previousHasTransform, this.previousCropPx, this.previousCropPy, this.previousCropRotation, this.previousCropOrientation, this.previousCropScale, scale1(), scale1(), this.previousCropPw, this.previousCropPh, 0.0f, 0.0f, this.previousCropMirrored);
        switchToEditMode(0);
    }

    public void lambda$setParentActivity$75(View view) {
        if (this.currentEditMode != 1 || this.photoCropView.isReady()) {
            applyCurrentEditMode();
            switchToEditMode(0);
        }
    }

    public void lambda$setParentActivity$77(View view) {
        float f = -this.photoCropView.cropView.getStateOrientation();
        if (Math.abs(f) > 180.0f) {
            f = f < 0.0f ? f + 360.0f : -(360.0f - f);
        }
        cropRotate(f, this.photoCropView.cropView.getStateMirror(), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setParentActivity$76();
            }
        });
    }

    public void lambda$setParentActivity$76() {
        this.photoCropView.reset(true);
    }

    public void lambda$setParentActivity$78(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
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

    public void lambda$setParentActivity$79(View view) {
        if (this.sendPhotoTypeIsPollMedia || isCaptionOpen()) {
            return;
        }
        setPhotoChecked();
    }

    public void lambda$setParentActivity$80(View view) {
        PhotoViewerProvider photoViewerProvider;
        if (isCaptionOpen() || (photoViewerProvider = this.placeProvider) == null || photoViewerProvider.getSelectedPhotosOrder() == null || this.placeProvider.getSelectedPhotosOrder().isEmpty()) {
            return;
        }
        togglePhotosListView(!this.isPhotosListViewVisible, true);
    }

    public void lambda$setParentActivity$81(View view, int i) throws Resources.NotFoundException, NumberFormatException {
        int i2;
        if (!this.imagesArrLocals.isEmpty() && (i2 = this.currentIndex) >= 0 && i2 < this.imagesArrLocals.size()) {
            Object obj = this.imagesArrLocals.get(this.currentIndex);
            if (obj instanceof MediaController.MediaEditState) {
                ((MediaController.MediaEditState) obj).editedInfo = getCurrentVideoEditedInfo();
            }
        }
        this.ignoreDidSetImage = true;
        int iIndexOf = this.imagesArrLocals.indexOf(view.getTag());
        if (iIndexOf >= 0) {
            this.currentIndex = -1;
            setImageIndex(iIndexOf);
        }
        this.ignoreDidSetImage = false;
    }

    public void invalidateAllGlassAttachedViews() {
        ReferenceList referenceList = this.iBlur3BlurredDrawables;
        if (referenceList != null && Build.VERSION.SDK_INT >= 29) {
            Iterator it = referenceList.iterator();
            while (it.hasNext()) {
                ((BlurredBackgroundDrawableRenderNode) it.next()).invalidateDisplayList();
            }
        }
        ReferenceList referenceList2 = this.glassAttachedViews;
        if (referenceList2 != null) {
            Iterator it2 = referenceList2.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public boolean showCaptionLimitBulletin(FrameLayout frameLayout) {
        BaseFragment baseFragment = this.parentFragment;
        if (!(baseFragment instanceof ChatActivity) || !ChatObject.isChannelAndNotMegaGroup(((ChatActivity) baseFragment).getCurrentChat())) {
            return false;
        }
        this.limitBulletin = BulletinFactory.of(frameLayout, this.resourcesProvider).createCaptionLimitBulletin(MessagesController.getInstance(this.currentAccount).captionLengthLimitPremium, new Runnable() {
            @Override
            public final void run() throws NumberFormatException {
                this.f$0.lambda$showCaptionLimitBulletin$82();
            }
        }).setOnHideListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showCaptionLimitBulletin$83();
            }
        }).show();
        return true;
    }

    public void lambda$showCaptionLimitBulletin$82() throws NumberFormatException {
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

    public void lambda$showCaptionLimitBulletin$83() {
        this.limitBulletin = null;
    }

    public void showScheduleDatePickerDialog() {
        long dialogId;
        if (this.parentActivity == null) {
            return;
        }
        ChatActivity chatActivity = this.parentChatActivity;
        if (chatActivity != null) {
            dialogId = chatActivity.getDialogId();
        } else {
            PhotoViewerProvider photoViewerProvider = this.placeProvider;
            if (photoViewerProvider == null) {
                return;
            } else {
                dialogId = photoViewerProvider.getDialogId();
            }
        }
        AlertsCreator.createScheduleDatePickerDialog(this.parentActivity, dialogId, new AlertsCreator.ScheduleDatePickerDelegate() {
            @Override
            public final void didSelectDate(boolean z, int i, int i2) throws NumberFormatException {
                this.f$0.lambda$showScheduleDatePickerDialog$85(z, i, i2);
            }
        }, new AlertsCreator.ScheduleDatePickerColors(-1, -14342875, -1, 520093695, -1, -115203550, 620756991));
    }

    public void lambda$showScheduleDatePickerDialog$85(boolean z, int i, int i2) throws NumberFormatException {
        sendPressed(z, i, i2, false, false, false);
    }

    public void replacePressed() throws NumberFormatException {
        sendPressed(false, 0, 0, true, false, false);
    }

    private void sendPressed(final boolean z, final int i, final int i2, final boolean z2, final boolean z3, boolean z4) throws NumberFormatException {
        String str;
        Object obj;
        MediaController.CropState cropState;
        int i3;
        ChatActivity chatActivity;
        ImageUpdater.AvatarFor avatarFor;
        String str2;
        long j;
        String string;
        TextureView textureView;
        final PhotoViewer photoViewer = this;
        int i4 = 8;
        char c = 1;
        if (isCaptionOpen() || photoViewer.placeProvider == null || photoViewer.doneButtonPressed) {
            return;
        }
        VideoEditedInfo videoEditedInfo = null;
        if (photoViewer.sendPhotoType == 1) {
            if (!z4 && (avatarFor = photoViewer.setAvatarFor) != null) {
                TLObject tLObject = avatarFor.object;
                if (!(tLObject instanceof TLRPC.User)) {
                    str2 = "";
                    j = 0;
                } else {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    str2 = user.first_name;
                    j = user.id;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(photoViewer.containerView.getContext());
                builder.setAdditionalHorizontalPadding(AndroidUtilities.dp(8.0f));
                SuggestUserPhotoView suggestUserPhotoView = new SuggestUserPhotoView(photoViewer.containerView.getContext());
                suggestUserPhotoView.setImages(photoViewer.setAvatarFor.object, photoViewer.containerView, photoViewer.photoCropView);
                builder.setTopView(suggestUserPhotoView);
                if (photoViewer.setAvatarFor.type == 1) {
                    if (UserConfig.getInstance(photoViewer.currentAccount).clientUserId == j) {
                        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString("SetUserPhotoSelfAlertMessage", R.string.SetUserPhotoSelfAlertMessage)));
                    } else {
                        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SetUserPhotoAlertMessage, str2, str2)));
                    }
                    if (photoViewer.centerImageIsVideo) {
                        string = LocaleController.getString("SetVideo", R.string.SetVideo);
                    } else {
                        string = LocaleController.getString("SetPhoto", R.string.SetPhoto);
                    }
                } else {
                    if (photoViewer.centerImageIsVideo) {
                        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestVideoAlertMessage, str2)));
                    } else {
                        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestPhotoAlertMessage, str2)));
                    }
                    string = LocaleController.getString("SuggestPhotoShort", R.string.SuggestPhotoShort);
                }
                String str3 = string;
                builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i5) {
                        PhotoViewer.lambda$sendPressed$86(alertDialog, i5);
                    }
                });
                builder.setPositiveButton(str3, new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i5) throws NumberFormatException {
                        this.f$0.lambda$sendPressed$87(z, i, i2, z2, z3, alertDialog, i5);
                    }
                });
                builder.setDialogButtonColorKey(Theme.key_voipgroup_listeningText);
                AlertDialog alertDialogCreate = builder.create();
                alertDialogCreate.setBlurParams(0.8f, false, true);
                alertDialogCreate.setBackgroundColor(ColorUtils.setAlphaComponent(-15461356, 204));
                alertDialogCreate.show();
                alertDialogCreate.setTextColor(Theme.getColor(Theme.key_voipgroup_nameText));
                alertDialogCreate.setOnDismissListener(photoViewer.new AnonymousClass40());
                if (!photoViewer.isCurrentVideo || (textureView = photoViewer.videoTextureView) == null) {
                    return;
                }
                try {
                    photoViewer.lastFrameBitmap = textureView.getBitmap();
                    ImageView imageView = photoViewer.lastFrameImageView;
                    if (imageView != null) {
                        photoViewer.aspectRatioFrameLayout.removeView(imageView);
                        photoViewer.lastFrameImageView = null;
                    }
                    ImageView imageView2 = new ImageView(photoViewer.videoTextureView.getContext());
                    photoViewer.lastFrameImageView = imageView2;
                    imageView2.setBackground(new BitmapDrawable(photoViewer.lastFrameBitmap));
                    photoViewer.aspectRatioFrameLayout.addView(photoViewer.lastFrameImageView);
                    return;
                } catch (Throwable th) {
                    Bitmap bitmap = photoViewer.currentBitmap;
                    if (bitmap != null) {
                        bitmap.recycle();
                        photoViewer.currentBitmap = null;
                    }
                    FileLog.e(th);
                    return;
                }
            }
            applyCurrentEditMode();
        }
        if (!z2 && (chatActivity = photoViewer.parentChatActivity) != null) {
            TLRPC.Chat currentChat = chatActivity.getCurrentChat();
            if (photoViewer.parentChatActivity.getCurrentUser() != null || ((ChatObject.isChannel(currentChat) && currentChat.megagroup) || !ChatObject.isChannel(currentChat))) {
                MessagesController.getNotificationsSettings(photoViewer.currentAccount).edit().putBoolean("silent_" + photoViewer.parentChatActivity.getDialogId(), !z).commit();
            }
        }
        VideoEditedInfo currentVideoEditedInfo = getCurrentVideoEditedInfo();
        if (!photoViewer.imagesArrLocals.isEmpty() && (i3 = photoViewer.currentIndex) >= 0 && i3 < photoViewer.imagesArrLocals.size()) {
            Object obj2 = photoViewer.imagesArrLocals.get(photoViewer.currentIndex);
            if (obj2 instanceof MediaController.MediaEditState) {
                ((MediaController.MediaEditState) obj2).editedInfo = currentVideoEditedInfo;
            }
        }
        ChatActivity chatActivity2 = photoViewer.parentChatActivity;
        if (chatActivity2 != null && chatActivity2.getCurrentChat() != null) {
            boolean z5 = photoViewer.isCurrentVideo || currentVideoEditedInfo != null;
            if (z5 && !ChatObject.canSendVideo(photoViewer.parentChatActivity.getCurrentChat())) {
                BulletinFactory.of(photoViewer.containerView, photoViewer.resourcesProvider).createErrorBulletin(LocaleController.getString(R.string.GlobalAttachVideoRestricted)).show();
                return;
            } else if (!z5 && !ChatObject.canSendPhoto(photoViewer.parentChatActivity.getCurrentChat())) {
                BulletinFactory.of(photoViewer.containerView, photoViewer.resourcesProvider).createErrorBulletin(LocaleController.getString(R.string.GlobalAttachPhotoRestricted)).show();
                return;
            }
        }
        photoViewer.doneButtonPressed = true;
        if (currentVideoEditedInfo != null) {
            long j2 = (long) (currentVideoEditedInfo.estimatedSize * 0.9f);
            if ((j2 > 2097152000 && !UserConfig.getInstance(photoViewer.currentAccount).isPremium()) || j2 > 4194304000L) {
                if (photoViewer.parentAlert != null) {
                    new LimitReachedBottomSheet(photoViewer.parentAlert.getBaseFragment(), photoViewer.parentAlert.getContainer().getContext(), 6, UserConfig.selectedAccount, null).show();
                    return;
                }
                return;
            }
        }
        if (!z2) {
            if (photoViewer.sendPhotoType == 11) {
                Object obj3 = photoViewer.imagesArrLocals.get(photoViewer.currentIndex);
                if (obj3 instanceof MediaController.PhotoEntry) {
                    final MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj3;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Path path = new Path();
                    RectF rectF = new RectF();
                    rectF.set(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                    float width = bitmapCreateBitmap.getWidth() / 8;
                    path.addRoundRect(rectF, width, width, Path.Direction.CW);
                    canvas.clipPath(path);
                    int containerViewWidth = getContainerViewWidth();
                    getContainerViewHeight();
                    float fDp = containerViewWidth - AndroidUtilities.dp(20.0f);
                    StickerMakerView stickerMakerView = photoViewer.stickerMakerView;
                    if (stickerMakerView != null && stickerMakerView.outlineVisible && stickerMakerView.getSourceBitmap() != null) {
                        canvas.save();
                        canvas.translate(bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                        canvas.scale(bitmapCreateBitmap.getWidth() / fDp, bitmapCreateBitmap.getHeight() / fDp);
                        photoViewer.applyTransformToOutline(canvas);
                        photoViewer.stickerMakerView.drawOutline(canvas, false, null, false);
                        canvas.restore();
                        canvas.save();
                        canvas.translate(bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                        canvas.scale(bitmapCreateBitmap.getWidth() / fDp, bitmapCreateBitmap.getHeight() / fDp);
                        photoViewer.applyTransformToOutline(canvas);
                        photoViewer.centerImage.draw(canvas);
                        canvas.restore();
                        canvas.save();
                        canvas.translate(bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                        canvas.scale(bitmapCreateBitmap.getWidth() / fDp, bitmapCreateBitmap.getHeight() / fDp);
                        photoViewer.applyTransformToOutline(canvas);
                        photoViewer.stickerMakerView.drawOutline(canvas, true, null, false);
                        canvas.restore();
                    } else {
                        canvas.save();
                        canvas.translate(bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                        canvas.scale(bitmapCreateBitmap.getWidth() / fDp, bitmapCreateBitmap.getHeight() / fDp);
                        photoViewer.applyTransformToOutline(canvas);
                        photoViewer.centerImage.draw(canvas);
                        canvas.restore();
                    }
                    if (photoViewer.paintingOverlay != null) {
                        canvas.save();
                        canvas.translate(bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                        canvas.scale(bitmapCreateBitmap.getWidth() / fDp, bitmapCreateBitmap.getHeight() / fDp);
                        photoViewer.applyTransformToOutline(canvas);
                        canvas.translate((-photoViewer.centerImage.getImageWidth()) / 2.0f, (-photoViewer.centerImage.getImageHeight()) / 2.0f);
                        canvas.scale(photoViewer.centerImage.getImageWidth() / photoViewer.paintingOverlay.getMeasuredWidth(), photoViewer.centerImage.getImageHeight() / photoViewer.paintingOverlay.getMeasuredHeight());
                        photoViewer.paintingOverlay.drawChildren = !hasAnimatedMediaEntities();
                        photoViewer.paintingOverlay.draw(canvas);
                        photoViewer.paintingOverlay.drawChildren = true;
                        canvas.restore();
                    }
                    if (hasAnimatedMediaEntities()) {
                        Matrix matrix = new Matrix();
                        matrix.reset();
                        float f = fDp / 2.0f;
                        matrix.preTranslate(f, f);
                        photoViewer.applyTransformToMatrix(matrix);
                        matrix.preTranslate((-photoViewer.centerImage.getImageWidth()) / 2.0f, (-photoViewer.centerImage.getImageHeight()) / 2.0f);
                        matrix.preScale(photoViewer.centerImage.getImageWidth(), photoViewer.centerImage.getImageHeight());
                        ArrayList<VideoEditedInfo.MediaEntity> arrayList = new ArrayList<>();
                        Iterator<VideoEditedInfo.MediaEntity> it = photoEntry.mediaEntities.iterator();
                        String strFindAnimatedEmojiEmoticon = null;
                        while (it.hasNext()) {
                            VideoEditedInfo.MediaEntity mediaEntityCopy = it.next().copy();
                            float f2 = mediaEntityCopy.x;
                            float f3 = mediaEntityCopy.y;
                            float f4 = mediaEntityCopy.width + f2;
                            float f5 = mediaEntityCopy.height + f3;
                            Iterator<VideoEditedInfo.MediaEntity> it2 = it;
                            float[] fArr = new float[i4];
                            fArr[0] = f2;
                            fArr[c] = f3;
                            fArr[2] = f4;
                            fArr[3] = f3;
                            fArr[4] = f4;
                            fArr[5] = f5;
                            fArr[6] = f2;
                            fArr[7] = f5;
                            matrix.mapPoints(fArr);
                            mediaEntityCopy.width = ((float) Math.sqrt(Math.pow(fArr[0] - fArr[2], 2.0d) + Math.pow(fArr[c] - fArr[3], 2.0d))) / fDp;
                            float fSqrt = ((float) Math.sqrt(Math.pow(fArr[0] - fArr[6], 2.0d) + Math.pow(fArr[1] - fArr[7], 2.0d))) / fDp;
                            mediaEntityCopy.height = fSqrt;
                            mediaEntityCopy.x = (((fArr[0] + fArr[4]) / 2.0f) / fDp) - (mediaEntityCopy.width / 2.0f);
                            mediaEntityCopy.y = (((fArr[1] + fArr[5]) / 2.0f) / fDp) - (fSqrt / 2.0f);
                            mediaEntityCopy.scale = 1.0f;
                            mediaEntityCopy.customTextView = true;
                            if (photoEntry.isCropped && (cropState = photoEntry.cropState) != null) {
                                mediaEntityCopy.rotation = (float) (mediaEntityCopy.rotation - ((cropState.transformRotation / 180.0f) * 3.141592653589793d));
                            }
                            photoViewer = this;
                            mediaEntityCopy.rotation = (float) (mediaEntityCopy.rotation - ((photoViewer.rotate / 180.0f) * 3.141592653589793d));
                            arrayList.add(mediaEntityCopy);
                            TLRPC.Document document = mediaEntityCopy.document;
                            if (document == null || strFindAnimatedEmojiEmoticon != null) {
                                obj = null;
                            } else {
                                obj = null;
                                strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, null);
                            }
                            it = it2;
                            i4 = 8;
                            c = 1;
                        }
                        videoEditedInfo = new VideoEditedInfo();
                        videoEditedInfo.isPhoto = true;
                        videoEditedInfo.resultWidth = 512;
                        videoEditedInfo.originalWidth = 512;
                        videoEditedInfo.resultHeight = 512;
                        videoEditedInfo.originalHeight = 512;
                        videoEditedInfo.mediaEntities = arrayList;
                        long jClamp = Utilities.clamp(photoEntry.averageDuration, 2999L, 800L);
                        videoEditedInfo.estimatedDuration = jClamp;
                        videoEditedInfo.originalDuration = jClamp;
                        videoEditedInfo.bitrate = 200000;
                        videoEditedInfo.framerate = 30;
                        videoEditedInfo.isSticker = true;
                        videoEditedInfo.estimatedSize = 262144L;
                        str = strFindAnimatedEmojiEmoticon;
                    } else {
                        str = null;
                    }
                    float f6 = 512;
                    final String string2 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(ImageLoader.scaleAndSaveImage(bitmapCreateBitmap, Bitmap.CompressFormat.WEBP, f6, f6, 100, false, 101, 101), "webp", true).toString();
                    if (videoEditedInfo != null) {
                        videoEditedInfo.originalPath = string2;
                    }
                    if (photoViewer.selectedEmojis == null) {
                        photoViewer.selectedEmojis = new ArrayList();
                    }
                    if (photoViewer.selectedEmojis.isEmpty()) {
                        String str4 = photoViewer.stickerMakerView.detectedEmoji;
                        if (str4 != null && Emoji.getEmojiDrawable(str4) != null) {
                            photoViewer.selectedEmojis.add(photoViewer.stickerMakerView.detectedEmoji);
                        } else if (str != null) {
                            photoViewer.selectedEmojis.add(str);
                        } else {
                            photoViewer.selectedEmojis.add("👍");
                        }
                    }
                    photoViewer.doneButtonPressed = false;
                    final VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                    ContentPreviewViewer.getInstance().showCustomStickerActions(string2, videoEditedInfo, photoViewer.stickerMakerView, photoViewer.selectedEmojis, new ContentPreviewViewer.ContentPreviewViewerDelegate() {
                        @Override
                        public void addCaptionToGif(Object obj4, Object obj5, boolean z6, int i5, int i6) {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$addCaptionToGif(this, obj4, obj5, z6, i5, i6);
                        }

                        @Override
                        public boolean can() {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$can(this);
                        }

                        @Override
                        public boolean canAddCaption(TLRPC.Document document2) {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canAddCaption(this, document2);
                        }

                        @Override
                        public boolean canDeleteSticker(TLRPC.Document document2) {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canDeleteSticker(this, document2);
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
                        public Boolean canSetAsStatus(TLRPC.Document document2) {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canSetAsStatus(this, document2);
                        }

                        @Override
                        public void copyEmoji(TLRPC.Document document2) {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$copyEmoji(this, document2);
                        }

                        @Override
                        public void deleteSticker(TLRPC.Document document2) {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$deleteSticker(this, document2);
                        }

                        @Override
                        public void editSticker(TLRPC.Document document2) {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$editSticker(this, document2);
                        }

                        @Override
                        public ItemOptions getCustomItemOptions(ViewGroup viewGroup, View view) {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getCustomItemOptions(this, viewGroup, view);
                        }

                        @Override
                        public TLRPC.TL_messageMediaPoll getPoll() {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getPoll(this);
                        }

                        @Override
                        public TLRPC.PollAnswer getPollAnswer() {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getPollAnswer(this);
                        }

                        @Override
                        public MessageObject getPollMessageObject() {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getPollMessageObject(this);
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
                        public boolean needCopy(TLRPC.Document document2) {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needCopy(this, document2);
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
                        public boolean needRemoveFromRecent(TLRPC.Document document2) {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needRemoveFromRecent(this, document2);
                        }

                        @Override
                        public boolean needSend(int i5) {
                            return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needSend(this, i5);
                        }

                        @Override
                        public void openSet(TLRPC.InputStickerSet inputStickerSet, boolean z6) {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$openSet(this, inputStickerSet, z6);
                        }

                        @Override
                        public void remove(SendMessagesHelper.ImportingSticker importingSticker) {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$remove(this, importingSticker);
                        }

                        @Override
                        public void removeFromRecent(TLRPC.Document document2) {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$removeFromRecent(this, document2);
                        }

                        @Override
                        public void resetTouch() {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$resetTouch(this);
                        }

                        @Override
                        public void retractVote() {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$retractVote(this);
                        }

                        @Override
                        public void sendEmoji(TLRPC.Document document2) {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendEmoji(this, document2);
                        }

                        @Override
                        public void sendGif(Object obj4, Object obj5, boolean z6, int i5, int i6) {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendGif(this, obj4, obj5, z6, i5, i6);
                        }

                        @Override
                        public void sendSticker(TLRPC.Document document2, String str5, Object obj4, boolean z6, int i5, int i6) {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendSticker(this, document2, str5, obj4, z6, i5, i6);
                        }

                        @Override
                        public void sendVote() {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendVote(this);
                        }

                        @Override
                        public void setAsEmojiStatus(TLRPC.Document document2, Integer num) {
                            ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$setAsEmojiStatus(this, document2, num);
                        }

                        @Override
                        public boolean canSendSticker() {
                            return (PhotoViewer.this.placeProvider == null || (PhotoViewer.this.placeProvider.isEditingSticker() && PhotoViewer.this.parentChatActivity == null)) ? false : true;
                        }

                        @Override
                        public void sendSticker(String str5) {
                            if (PhotoViewer.this.placeProvider == null) {
                                return;
                            }
                            if (PhotoViewer.this.placeProvider.isEditingSticker()) {
                                if (PhotoViewer.this.parentChatActivity == null) {
                                    return;
                                }
                                PhotoViewer.this.stickerEmptySent = true;
                                generateThumb();
                                PhotoViewer photoViewer2 = PhotoViewer.this;
                                photoViewer2.stickerMakerView.uploadStickerFile(string2, videoEditedInfo2, str5, null, false, photoViewer2.parentChatActivity.getDialogId(), null, null, PhotoViewer.this.getOriginalSticker(), photoEntry.thumbPath, null, null);
                                return;
                            }
                            PhotoViewer.this.stickerEmptySent = true;
                            generateThumb();
                            photoEntry.imagePath = string2;
                            PhotoViewer.this.placeProvider.sendButtonPressed(PhotoViewer.this.currentIndex, videoEditedInfo2, z, i, i2, z3);
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
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
                            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                            ImageReceiver imageReceiver = contentPreviewViewer.centerImage;
                            if (imageReceiver != null) {
                                imageReceiver.setAlpha(1.0f);
                                contentPreviewViewer.centerImage.setImageCoords(0.0f, 0.0f, bitmapCreateBitmap2.getWidth(), bitmapCreateBitmap2.getHeight());
                                contentPreviewViewer.centerImage.draw(canvas2);
                            }
                            if (contentPreviewViewer.paintingOverlay != null) {
                                canvas2.save();
                                canvas2.scale(bitmapCreateBitmap2.getWidth() / contentPreviewViewer.paintingOverlay.getWidth(), bitmapCreateBitmap2.getHeight() / contentPreviewViewer.paintingOverlay.getHeight());
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
                            photoEntry.thumbPath = FileLoader.getInstance(PhotoViewer.this.currentAccount).getPathToAttach(ImageLoader.scaleAndSaveImage(bitmapCreateBitmap2, PhotoViewer.this.getCompressFormat(), 512.0f, 512.0f, 83, false, 101, 101), true).toString();
                        }

                        @Override
                        public void addToFavoriteSelected(String str5) {
                            PhotoViewer.this.stickerEmptySent = true;
                            generateThumb();
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            photoViewer2.stickerMakerView.uploadStickerFile(string2, videoEditedInfo2, str5, null, true, 0L, null, null, photoViewer2.getOriginalSticker(), photoEntry.thumbPath, null, null);
                        }

                        @Override
                        public void stickerSetSelected(TLRPC.StickerSet stickerSet, String str5) {
                            PhotoViewer.this.stickerEmptySent = true;
                            generateThumb();
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            photoViewer2.stickerMakerView.uploadStickerFile(string2, videoEditedInfo2, str5, null, false, 0L, stickerSet, photoViewer2.replacedSticker, photoViewer2.getOriginalSticker(), photoEntry.thumbPath, null, null);
                        }

                        @Override
                        public void newStickerPackSelected(CharSequence charSequence, String str5, Utilities.Callback callback) {
                            PhotoViewer.this.stickerEmptySent = true;
                            generateThumb();
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            photoViewer2.stickerMakerView.uploadStickerFile(string2, videoEditedInfo2, str5, charSequence, false, 0L, null, null, photoViewer2.getOriginalSticker(), photoEntry.thumbPath, callback, null);
                        }

                        @Override
                        public void setIntroSticker(String str5) {
                            PhotoViewer.this.stickerEmptySent = true;
                            generateThumb();
                            PhotoViewer photoViewer2 = PhotoViewer.this;
                            photoViewer2.stickerMakerView.uploadStickerFile(string2, videoEditedInfo2, str5, null, false, 0L, null, null, photoViewer2.getOriginalSticker(), photoEntry.thumbPath, null, PhotoViewer.this.customStickerHandler);
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
            photoViewer.placeProvider.sendButtonPressed(photoViewer.currentIndex, currentVideoEditedInfo, z, i, i2, z3);
        } else {
            photoViewer.placeProvider.replaceButtonPressed(photoViewer.currentIndex, currentVideoEditedInfo);
        }
        if (photoViewer.closePhotoAfterSelect) {
            if (photoViewer.closePhotoAfterSelectWithAnimation) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() throws NumberFormatException {
                        this.f$0.lambda$sendPressed$88();
                    }
                }, 200L);
            } else {
                photoViewer.closePhoto(false, false);
            }
        }
    }

    public void lambda$sendPressed$87(boolean z, int i, int i2, boolean z2, boolean z3, AlertDialog alertDialog, int i3) throws NumberFormatException {
        sendPressed(z, i, i2, z2, z3, true);
    }

    class AnonymousClass40 implements DialogInterface.OnDismissListener {
        AnonymousClass40() {
        }

        @Override
        public void onDismiss(DialogInterface dialogInterface) {
            if (PhotoViewer.this.lastFrameImageView != null) {
                PhotoViewer.this.lastFrameImageView.animate().alpha(0.0f).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onDismiss$0();
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

    public void lambda$sendPressed$88() throws NumberFormatException {
        closePhoto(true, false);
    }

    public static String getTempFileAbsolutePath() {
        return new File(FileLoader.getDirectory(4), SharedConfig.getLastLocalId() + "_temp.jpg").getAbsolutePath();
    }

    public Bitmap.CompressFormat getCompressFormat() {
        return this.sendPhotoType == 11 ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    public boolean isCaptionOpen() {
        CaptionContainerView captionView = getCaptionView();
        return captionView != null && (captionView.keyboardNotifier.keyboardVisible() || captionView.editText.isPopupShowing());
    }

    public void showShareAlert(ArrayList arrayList) throws Resources.NotFoundException {
        boolean z;
        VideoPlayer videoPlayer;
        MessageObject messageObject;
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
        String str = null;
        Integer numValueOf = (arrayList == null || arrayList.size() != 1 || (videoPlayer = this.videoPlayer) == null || videoPlayer.getCurrentPosition() <= 1500 || (messageObject = this.currentMessageObject) == null || !messageObject.isVideo()) ? null : Integer.valueOf((int) (this.videoPlayer.getCurrentPosition() / 1000));
        if (arrayList != null && arrayList.size() == 1) {
            MessageObject messageObject2 = (MessageObject) arrayList.get(0);
            String publicUsername = ChatObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject2.getDialogId())));
            if (!TextUtils.isEmpty(publicUsername)) {
                str = "https://" + MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + publicUsername + "/" + messageObject2.getId();
            }
        }
        final AnonymousClass42 anonymousClass42 = new AnonymousClass42(this.parentActivity, this.parentChatActivity, arrayList, null, null, false, str, null, false, true, false, numValueOf, null, frameLayoutDrawer, z);
        anonymousClass42.setFocusable(false);
        anonymousClass42.getWindow().setSoftInputMode(48);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() throws Resources.NotFoundException {
                this.f$0.lambda$showShareAlert$89(anonymousClass42);
            }
        }, 250L);
        anonymousClass42.show();
    }

    class AnonymousClass42 extends ShareAlert {
        final boolean val$finalOpenKeyboardOnShareAlertClose;
        final FrameLayout val$photoContainerView;

        AnonymousClass42(Context context, ChatActivity chatActivity, ArrayList arrayList, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3, boolean z4, Integer num, Theme.ResourcesProvider resourcesProvider, FrameLayout frameLayout, boolean z5) {
            super(context, chatActivity, arrayList, str, str2, z, str3, str4, z2, z3, z4, num, resourcesProvider);
            this.val$photoContainerView = frameLayout;
            this.val$finalOpenKeyboardOnShareAlertClose = z5;
        }

        @Override
        protected void onSend(final LongSparseArray longSparseArray, final int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
            if (z) {
                final FrameLayout frameLayout = this.val$photoContainerView;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onSend$0(frameLayout, longSparseArray, i);
                    }
                }, 250L);
            }
        }

        public void lambda$onSend$0(FrameLayout frameLayout, LongSparseArray longSparseArray, int i) {
            BulletinFactory.createForwardedBulletin(PhotoViewer.this.parentActivity, null, frameLayout, longSparseArray.size(), longSparseArray.size() == 1 ? ((TLRPC.Dialog) longSparseArray.valueAt(0)).id : 0L, i, -115203550, -1, 1500).show();
        }

        @Override
        public void dismissInternal() {
            super.dismissInternal();
            if (this.val$finalOpenKeyboardOnShareAlertClose) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$dismissInternal$1();
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

    public void lambda$showShareAlert$89(ShareAlert shareAlert) throws Resources.NotFoundException {
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

    public void showChromecastBulletin(String str, String str2) {
        if (this.activityContext == null || this.containerView == null || !isVisible()) {
            return;
        }
        BulletinFactory.of(this.containerView, new DarkThemeResourceProvider()).createSimpleBulletin(R.raw.forward, !TextUtils.isEmpty(str2) ? LocaleController.formatString(R.string.ChromecastStartedTo, str2) : LocaleController.getString(R.string.ChromecastStarted)).show();
    }

    public void updateActionBarTitlePadding() {
        if (this.menu == null || this.actionBarContainer == null) {
            return;
        }
        float fMax = 0.0f;
        for (int i = 0; i < this.menu.getChildCount(); i++) {
            View childAt = this.menu.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                fMax += Math.min(0.5f, childAt.getAlpha()) * 2.0f * childAt.getWidth();
            }
        }
        CheckBox checkBox = this.checkImageView;
        if (checkBox != null && checkBox.getVisibility() == 0) {
            fMax = Math.max(fMax, AndroidUtilities.dp(48.0f));
        }
        CounterView counterView = this.photosCounterView;
        if (counterView != null && counterView.getVisibility() == 0) {
            fMax = Math.max(fMax, AndroidUtilities.dp(100.0f));
        }
        this.actionBarContainer.updateRightPadding(fMax, false);
    }

    private void setMenuItemIcon(boolean z, boolean z2) {
        if (this.speedItem.getVisibility() != 0 || Math.abs(this.currentVideoSpeed - 1.0f) < 0.001f) {
            this.videoItemIcon.topText.setText("", z);
        } else {
            this.videoItemIcon.topText.setText(SpeedIconDrawable.formatNumber(this.currentVideoSpeed) + "x", z);
        }
        this.speedItem.setSpeed(this.currentVideoSpeed, z);
        this.chooseSpeedLayout.update(this.currentVideoSpeed, z2);
    }

    private void chooseQuality(int i) throws NumberFormatException {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.setSelectedQuality(i);
        }
        if (i == -1) {
            VideoPlayer.saveQuality(null, this.currentMessageObject);
        } else {
            VideoPlayer videoPlayer2 = this.videoPlayer;
            if (videoPlayer2 != null) {
                VideoPlayer.saveQuality(videoPlayer2.getQuality(i), this.currentMessageObject);
            }
        }
        updateQualityItems();
        this.videoItem.toggleSubMenu();
        try {
            CastSync.check(0);
            if (ChromecastController.getInstance().isCasting()) {
                ChromecastController.getInstance().setCurrentMediaAndCastIfNeeded(getCurrentChromecastMedia());
            }
            VideoPlayer videoPlayer3 = this.videoPlayer;
            if (videoPlayer3 != null) {
                CastSync.setPlaying(videoPlayer3.isPlaying());
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void updateQualityItems() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.updateQualityItems():void");
    }

    public void lambda$updateQualityItems$90(int i, View view) throws NumberFormatException {
        chooseQuality(i);
    }

    public void lambda$updateQualityItems$91(int i, View view) throws NumberFormatException {
        chooseQuality(i);
    }

    public float getCurrentVideoSpeed() {
        return this.currentVideoSpeed;
    }

    private boolean checkInlinePermissions() {
        Activity activity = this.parentActivity;
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 23 || PipUtils.checkAnyPipPermissions(activity)) {
            return true;
        }
        AlertsCreator.createDrawOverlayPermissionDialog(this.parentActivity, null, true).show();
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
            @Override
            public void onAnimationEnd(Animator animator) {
                PhotoViewer.this.photoCropView.setVideoThumb(bitmap, 0);
                PhotoViewer.this.flashAnimator = new AnimatorSet();
                PhotoViewer.this.flashAnimator.playTogether(ObjectAnimator.ofFloat(PhotoViewer.this.flashView, (Property<View, Float>) PhotoViewer.this.FLASH_VIEW_VALUE, 0.0f));
                PhotoViewer.this.flashAnimator.setDuration(85L);
                PhotoViewer.this.flashAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                PhotoViewer.this.flashAnimator.addListener(new AnonymousClass1());
                PhotoViewer.this.flashAnimator.start();
            }

            class AnonymousClass1 extends AnimatorListenerAdapter {
                AnonymousClass1() {
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    if (PhotoViewer.this.flashAnimator == null) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(PhotoViewer.this.videoPlayRunnable = new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onAnimationEnd$0();
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
        private boolean loading;
        private LoadingDrawable loadingDrawable;
        private Path loadingPath;
        private ArrayList quoteBlocks;
        private final TextSelectionHelper.SimpleTextSelectionHelper textSelectionHelper;

        public CaptionTextView(Context context, final CaptionScrollView captionScrollView, TextSelectionHelper.SimpleTextSelectionHelper simpleTextSelectionHelper, final Utilities.Callback2 callback2, final Utilities.Callback3 callback3) {
            super(context);
            setClearLinkOnLongPress(false);
            setDisablePaddingsOffsetY(false);
            this.onPressListener = new LinkSpanDrawable.LinksTextView.OnLinkPress() {
                @Override
                public final void run(ClickableSpan clickableSpan) {
                    this.f$0.lambda$new$0(callback2, clickableSpan);
                }
            };
            this.onLongPressListener = new LinkSpanDrawable.LinksTextView.OnLinkPress() {
                @Override
                public final void run(ClickableSpan clickableSpan) {
                    this.f$0.lambda$new$1(callback3, clickableSpan);
                }
            };
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
                    PhotoViewer.CaptionTextView.lambda$new$2(captionScrollView, view);
                }
            });
        }

        public void lambda$new$0(Utilities.Callback2 callback2, ClickableSpan clickableSpan) {
            callback2.run(clickableSpan, this);
        }

        public void lambda$new$1(Utilities.Callback3 callback3, ClickableSpan clickableSpan) {
            callback3.run(clickableSpan, this, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.clearLinks();
                }
            });
        }

        public static void lambda$new$2(CaptionScrollView captionScrollView, View view) {
            if (captionScrollView != null) {
                captionScrollView.smoothScrollBy(0, AndroidUtilities.dp(64.0f));
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
        protected void onDraw(Canvas canvas) {
            TextSelectionHelper.SimpleTextSelectionHelper simpleTextSelectionHelper = this.textSelectionHelper;
            if (simpleTextSelectionHelper != null && simpleTextSelectionHelper.isInSelectionMode()) {
                canvas.save();
                canvas.translate(getPaddingLeft(), getPaddingTop());
                if (this.textSelectionHelper != null && getStaticTextLayout() != null && this.textSelectionHelper.isCurrent(this)) {
                    this.textSelectionHelper.draw(canvas);
                }
                canvas.restore();
            }
            super.onDraw(canvas);
            if (this.lastLayout != getLayout()) {
                this.animatedEmojiDrawables = AnimatedEmojiSpan.update(0, this, this.animatedEmojiDrawables, getLayout());
                this.quoteBlocks = QuoteSpan.updateQuoteBlocksSpanned(getLayout(), this.quoteBlocks);
                boolean z = getLayout() != null && (getLayout().getText() instanceof Spanned) && ((QuoteSpan.QuoteStyleSpan[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), QuoteSpan.QuoteStyleSpan.class)).length > 0;
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
        protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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
                    ((QuoteSpan.Block) this.quoteBlocks.get(i)).draw(canvas, 0.0f, ((getWidth() - getPaddingLeft()) - getPaddingRight()) + (this.hasQuote ? AndroidUtilities.dp(32.0f) : 0), -1, 1.0f, getPaint());
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
                    float fDp = AndroidUtilities.dp(16.0f);
                    float fDp2 = AndroidUtilities.dp(8.0f);
                    float lineTop = 0.0f;
                    int i = 0;
                    while (i < layout.getLineCount()) {
                        float f = fDp / 3.0f;
                        float lineLeft = layout.getLineLeft(i) - f;
                        float lineRight = layout.getLineRight(i) + f;
                        if (i == 0) {
                            lineTop = layout.getLineTop(i) - (fDp2 / 3.0f);
                        }
                        float lineBottom = layout.getLineBottom(i);
                        if (i >= layout.getLineCount() - 1) {
                            lineBottom += fDp2 / 3.0f;
                        }
                        this.loadingPath.addRect(getPaddingLeft() + lineLeft, getPaddingTop() + lineTop, getPaddingLeft() + lineRight, getPaddingTop() + lineBottom, Path.Direction.CW);
                        i++;
                        lineTop = lineBottom;
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
        WindowVisibilityManager.Controller controller = this.activityVisibilityController;
        if (controller != null) {
            controller.destroy();
            this.activityVisibilityController = null;
        }
        WindowVisibilityManager.Controller controller2 = this.parentAlertWindowVisibilityController;
        if (controller2 != null) {
            controller2.destroy();
            this.parentAlertWindowVisibilityController = null;
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

    public void switchToPip(boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.switchToPip(boolean):void");
    }

    public static void lambda$switchToPip$92(AnimatedFileDrawable animatedFileDrawable, Bitmap bitmap) {
        if (animatedFileDrawable == null) {
            return;
        }
        animatedFileDrawable.replaceAnimatedBitmap(bitmap);
        animatedFileDrawable.invalidateInternal();
    }

    public static void lambda$switchToPip$93(ImageReceiver imageReceiver, ValueAnimator valueAnimator) {
        imageReceiver.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void lambda$switchToPip$94(View view, ViewOutlineProvider viewOutlineProvider, float f, float f2, AnimatorSet animatorSet) {
        view.setOutlineProvider(viewOutlineProvider);
        view.setClipToOutline(true);
        this.textureImageView.setOutlineProvider(viewOutlineProvider);
        this.textureImageView.setClipToOutline(true);
        FirstFrameView firstFrameView = this.firstFrameView;
        if (firstFrameView != null) {
            firstFrameView.setOutlineProvider(viewOutlineProvider);
            this.firstFrameView.setClipToOutline(true);
        }
        this.textureImageView.setTranslationY(f);
        view.setTranslationY(f2);
        FirstFrameView firstFrameView2 = this.firstFrameView;
        if (firstFrameView2 != null) {
            firstFrameView2.setTranslationY(f2);
        }
        this.translationY = 0.0f;
        this.containerView.invalidate();
        animatorSet.start();
    }

    public void lambda$switchToPip$95(Bitmap bitmap, boolean[] zArr, Runnable runnable) {
        ImageView imageView = this.textureImageView;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
            this.textureImageView.setVisibility(0);
            SurfaceView surfaceView = this.videoSurfaceView;
            if (surfaceView != null) {
                surfaceView.setVisibility(4);
            }
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            runnable.run();
        }
    }

    public void lambda$switchToPip$96(boolean[] zArr, Runnable runnable) {
        if (zArr[0]) {
            return;
        }
        ImageView imageView = this.textureImageView;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        SurfaceView surfaceView = this.videoSurfaceView;
        if (surfaceView != null) {
            surfaceView.setVisibility(4);
        }
        zArr[0] = true;
        runnable.run();
    }

    public void lambda$switchToPip$97(CubicBezierInterpolator cubicBezierInterpolator, float f, float f2, float f3, float f4, View view, float f5, float f6, float f7, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float interpolation = cubicBezierInterpolator == null ? fFloatValue : cubicBezierInterpolator.getInterpolation(fFloatValue);
        ImageView imageView = this.textureImageView;
        if (imageView != null) {
            imageView.setTranslationX(((1.0f - fFloatValue) * f) + (f2 * fFloatValue));
            this.textureImageView.setTranslationY((f3 * (1.0f - interpolation)) + (f4 * interpolation));
            this.textureImageView.invalidateOutline();
        }
        view.setTranslationX((f * (1.0f - fFloatValue)) + (f5 * fFloatValue));
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

    public void lambda$switchToPip$98(ValueAnimator valueAnimator) {
        this.clippingImageProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    class AnonymousClass46 extends AnimatorListenerAdapter {
        final View val$textureView;

        AnonymousClass46(View view) {
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
                    this.f$0.lambda$onAnimationEnd$0(view);
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
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<PhotoViewer, Float>) AnimationProperties.PHOTO_VIEWER_ANIMATION_VALUE, 0.0f, 1.0f));
        this.imageMoveAnimation.setDuration(250L);
        this.imageMoveAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.imageMoveAnimation.addListener(new AnimatorListenerAdapter() {
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
        if (this.sendPhotoType != 11) {
            return 1.0f;
        }
        int containerViewWidth = getContainerViewWidth();
        if (containerViewWidth == 0) {
            containerViewWidth = AndroidUtilities.displaySize.x;
        }
        float fDp = ((containerViewWidth - AndroidUtilities.dp(20.0f)) + 1) / containerViewWidth;
        if (!z) {
            return fDp;
        }
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
        return (bitmapWidth <= 1 || bitmapHeight <= 1 || bitmapWidth <= bitmapHeight) ? fDp : fDp * (bitmapWidth / bitmapHeight);
    }

    private boolean cropRotate(final float f, boolean z, final Runnable runnable) {
        PhotoCropView photoCropView;
        if (this.imageMoveAnimation != null || (photoCropView = this.photoCropView) == null) {
            return false;
        }
        photoCropView.cropView.maximize(true);
        this.rotate = 0.0f;
        this.animateToRotate = f + 0.0f;
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
                if (Math.abs((((int) this.photoCropView.cropView.getStateOrientation()) / 90) % 2) != 1) {
                    bitmapHeight = bitmapWidth;
                    bitmapWidth = bitmapHeight;
                }
                MediaController.CropState cropState = this.editState.cropState;
                if (cropState != null) {
                    bitmapHeight = (int) (bitmapHeight * cropState.cropPw);
                    bitmapWidth = (int) (bitmapWidth * cropState.cropPh);
                }
                float f2 = bitmapHeight;
                float f3 = bitmapWidth;
                float fMin = Math.min(getContainerViewWidth(1) / f2, getContainerViewHeight(1) / f3);
                this.animateToScale = (Math.abs((f / 90.0f) % 2.0f) == 1.0f ? Math.min(getContainerViewWidth(1) / f3, getContainerViewHeight(1) / f2) : fMin) / fMin;
            }
        }
        if (this.sendPhotoType == 11) {
            this.scale *= scale1(false);
            this.animateToScale *= scale1(false);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float rotation = this.photoCropView.wheelView.getRotation();
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$cropRotate$99(f, rotation, valueAnimator);
            }
        });
        this.imageMoveAnimation.playTogether(ObjectAnimator.ofFloat(this, (Property<PhotoViewer, Float>) AnimationProperties.PHOTO_VIEWER_ANIMATION_VALUE, 0.0f, 1.0f), valueAnimatorOfFloat);
        this.imageMoveAnimation.setDuration(250L);
        this.imageMoveAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.imageMoveAnimation.addListener(new AnimatorListenerAdapter() {
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

    public void lambda$cropRotate$99(float f, float f2, ValueAnimator valueAnimator) {
        CropAreaView cropAreaView = this.photoCropView.cropView.areaView;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * f;
        float f3 = this.scale;
        cropAreaView.setRotationScaleTranslation(fFloatValue, f3 + ((this.animateToScale - f3) * this.animationValue), 0.0f, 0.0f);
        this.photoCropView.wheelView.setRotation(AndroidUtilities.lerp(f2, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()), false);
    }

    public VideoPlayer getVideoPlayer() {
        return this.videoPlayer;
    }

    public void exitFromPip() throws NumberFormatException {
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
                    this.parentActivity.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            if (this.photoViewerWebView != null) {
                this.clippingImageProgress = 0.0f;
            } else if (view != null) {
                this.pipAnimationInProgress = true;
                RectOld pipRect = PipVideoOverlay.getPipRect(false, this.aspectRatioFrameLayout.getAspectRatio());
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
            try {
                this.isVisible = true;
                this.isVisibleOrAnimating = true;
                ((WindowManager) this.parentActivity.getSystemService("window")).addView(this.windowView, this.windowLayoutParams);
                onShowView();
                PlaceProviderObject placeProviderObject = this.currentPlaceObject;
                if (placeProviderObject != null && !placeProviderObject.keepImageReceiverVisible) {
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
                this.waitingForDraw = 4;
                return;
            }
            this.waitingForDraw = 4;
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
        if (this.pipItem.isEnabled() && AndroidUtilities.checkInlinePermissions(this.parentActivity) && !PipVideoOverlay.isVisible() && this.isPlaying) {
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
        int iDp = AndroidUtilities.dp(10.0f);
        int measuredWidth = (this.videoPlayerControlFrameLayout.getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - (this.videoPreviewFrame.getMeasuredWidth() / 2);
        if (thumbX < iDp) {
            this.videoPreviewFrame.setPivotX(Utilities.clamp((r4.getMeasuredWidth() / 2.0f) - (iDp - thumbX), this.videoPreviewFrame.getMeasuredWidth(), 0.0f));
            thumbX = iDp;
        } else if (thumbX >= measuredWidth) {
            this.videoPreviewFrame.setPivotX(Utilities.clamp((r3.getMeasuredWidth() / 2.0f) + (thumbX - measuredWidth), this.videoPreviewFrame.getMeasuredWidth(), 0.0f));
            thumbX = measuredWidth;
        } else {
            this.videoPreviewFrame.setPivotX(r2.getMeasuredWidth() / 2.0f);
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
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.videoPreviewFrame, (Property<VideoSeekPreviewImage, Float>) View.ALPHA, z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.videoPreviewFrame, (Property<VideoSeekPreviewImage, Float>) View.SCALE_X, z ? 1.0f : 0.5f), ObjectAnimator.ofFloat(this.videoPreviewFrame, (Property<VideoSeekPreviewImage, Float>) View.SCALE_Y, z ? 1.0f : 0.5f), ObjectAnimator.ofFloat(this.videoPreviewFrame, (Property<VideoSeekPreviewImage, Float>) View.TRANSLATION_Y, z ? 0.0f : AndroidUtilities.dp(12.0f)));
                this.videoPreviewFrameAnimation.setDuration(380L);
                this.videoPreviewFrameAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.videoPreviewFrameAnimation.addListener(new AnimatorListenerAdapter() {
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
            @Override
            public void onSeekBarDrag(float f) {
                if (PhotoViewer.this.videoPlayer != null || (PhotoViewer.this.photoViewerWebView != null && PhotoViewer.this.photoViewerWebView.isControllable())) {
                    if (!PhotoViewer.this.inPreview && PhotoViewer.this.videoTimelineViewContainer.getVisibility() == 0) {
                        f = PhotoViewer.this.videoTimelineView.getLeftProgress() + ((PhotoViewer.this.videoTimelineView.getRightProgress() - PhotoViewer.this.videoTimelineView.getLeftProgress()) * f);
                    }
                    if (PhotoViewer.this.getVideoDuration() == -9223372036854775807L) {
                        PhotoViewer.this.seekToProgressPending = f;
                    } else {
                        PhotoViewer.this.seekVideoOrWebTo((int) (f * r0));
                    }
                    PhotoViewer.this.showVideoSeekPreviewPosition(false);
                    PhotoViewer.this.needShowOnReady = false;
                }
            }

            @Override
            public void onSeekBarContinuousDrag(float f) {
                if (PhotoViewer.this.photoViewerWebView == null || !PhotoViewer.this.photoViewerWebView.isYouTube() || PhotoViewer.this.videoPreviewFrame == null) {
                    if (PhotoViewer.this.videoPlayer != null && PhotoViewer.this.videoPreviewFrame != null) {
                        PhotoViewer.this.videoPreviewFrame.setProgress(PhotoViewer.this.currentMessageObject, f, PhotoViewer.this.videoPlayerSeekbar.getWidth());
                    }
                } else {
                    PhotoViewer.this.videoPreviewFrame.setProgressForYouTube(PhotoViewer.this.photoViewerWebView, f, PhotoViewer.this.videoPlayerSeekbar.getWidth());
                }
                PhotoViewer.this.showVideoSeekPreviewPosition(true);
                PhotoViewer.this.updateVideoSeekPreviewPosition();
            }
        };
        FloatSeekBarAccessibilityDelegate floatSeekBarAccessibilityDelegate = new FloatSeekBarAccessibilityDelegate() {
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
                this.f$0.lambda$createVideoControlsInterface$100();
            }
        }) {
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
                this.f$0.lambda$createVideoControlsInterface$101(view2);
            }
        });
    }

    public void lambda$createVideoControlsInterface$100() {
        if (this.needShowOnReady) {
            showVideoSeekPreviewPosition(true);
        }
    }

    public void lambda$createVideoControlsInterface$101(View view) {
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

    private int[] fixVideoWidthHeight(int i, int i2) {
        int[] iArr = {i, i2};
        MediaCodec mediaCodecCreateEncoderByType = null;
        try {
            mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("video/avc");
            MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecCreateEncoderByType.getCodecInfo().getCapabilitiesForType("video/avc").getVideoCapabilities();
            Range<Integer> supportedWidths = videoCapabilities.getSupportedWidths();
            Range<Integer> supportedHeights = videoCapabilities.getSupportedHeights();
            iArr[0] = Math.max(((Integer) supportedWidths.getLower()).intValue(), Math.round(i / 16.0f) * 16);
            iArr[1] = Math.max(((Integer) supportedHeights.getLower()).intValue(), Math.round(i2 / 16.0f) * 16);
        } catch (Exception unused) {
            if (mediaCodecCreateEncoderByType != null) {
            }
        } catch (Throwable th) {
            if (mediaCodecCreateEncoderByType != null) {
                try {
                    mediaCodecCreateEncoderByType.release();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
        try {
            mediaCodecCreateEncoderByType.release();
        } catch (Exception unused3) {
        }
        return iArr;
    }

    public VideoEditedInfo getCurrentVideoEditedInfo() {
        int i;
        long j;
        ArrayList<VideoEditedInfo.MediaEntity> arrayList = null;
        if (!this.isCurrentVideo && hasAnimatedMediaEntities() && this.centerImage.getBitmapWidth() > 0) {
            int i2 = this.sendPhotoType;
            float f = i2 == 1 ? 800.0f : i2 == 11 ? 500.0f : 854.0f;
            VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
            videoEditedInfo.startTime = 0L;
            videoEditedInfo.start = 0L;
            videoEditedInfo.endTime = Math.min(3000L, this.editState.averageDuration);
            while (true) {
                j = videoEditedInfo.endTime;
                if (j <= 0 || j >= 1000) {
                    break;
                }
                videoEditedInfo.endTime = j * 2;
            }
            videoEditedInfo.end = j;
            videoEditedInfo.compressQuality = this.selectedCompression;
            videoEditedInfo.rotationValue = 0;
            videoEditedInfo.originalPath = this.currentImagePath;
            long j2 = videoEditedInfo.endTime;
            videoEditedInfo.estimatedSize = (int) ((j2 / 1000.0f) * 115200.0f);
            videoEditedInfo.estimatedDuration = j2;
            videoEditedInfo.framerate = 30;
            videoEditedInfo.originalDuration = j2;
            EditState editState = this.editState;
            videoEditedInfo.filterState = editState.savedFilterState;
            String str = editState.croppedPaintPath;
            if (str != null) {
                videoEditedInfo.paintPath = str;
                ArrayList arrayList2 = editState.croppedMediaEntities;
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
                if (i3 != 90 && i3 != 270) {
                    bitmapHeight = bitmapWidth;
                    bitmapWidth = bitmapHeight;
                }
                int i4 = (int) (bitmapHeight * cropState.cropPw);
                bitmapHeight = (int) (bitmapWidth * cropState.cropPh);
                bitmapWidth = i4;
            }
            int i5 = this.sendPhotoType;
            if (i5 == 1 || i5 == 11) {
                bitmapWidth = bitmapHeight;
            }
            float f2 = bitmapWidth;
            float f3 = bitmapHeight;
            float fMax = Math.max(f2 / f, f3 / f);
            if (fMax < 1.0f) {
                fMax = 1.0f;
            }
            int iMax = (int) (f2 / fMax);
            int iMax2 = (int) (f3 / fMax);
            if (iMax % 16 != 0) {
                iMax = Math.max(1, Math.round(iMax / 16.0f)) * 16;
            }
            if (iMax2 % 16 != 0) {
                iMax2 = Math.max(1, Math.round(iMax2 / 16.0f)) * 16;
            }
            videoEditedInfo.resultWidth = iMax;
            videoEditedInfo.originalWidth = iMax;
            videoEditedInfo.resultHeight = iMax2;
            videoEditedInfo.originalHeight = iMax2;
            videoEditedInfo.bitrate = -1;
            videoEditedInfo.muted = true;
            videoEditedInfo.avatarStartTime = 0L;
            return videoEditedInfo;
        }
        if (!this.isCurrentVideo || ((this.currentPlayingVideoFile == null && this.currentPlayingVideoQualityFiles == null) || this.compressionsCount == 0)) {
            return null;
        }
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
        videoEditedInfo2.videoOffset = this.currentPathVideoOffset;
        long j3 = this.estimatedSize;
        if (j3 == 0) {
            j3 = 1;
        }
        videoEditedInfo2.estimatedSize = j3;
        videoEditedInfo2.estimatedDuration = this.estimatedDuration;
        videoEditedInfo2.framerate = this.videoFramerate;
        videoEditedInfo2.originalDuration = (long) (this.videoDuration * 1000.0f);
        EditState editState2 = this.editState;
        videoEditedInfo2.filterState = editState2.savedFilterState;
        String str2 = editState2.croppedPaintPath;
        if (str2 != null) {
            videoEditedInfo2.paintPath = str2;
            ArrayList arrayList3 = editState2.croppedMediaEntities;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                arrayList = this.editState.croppedMediaEntities;
            }
            videoEditedInfo2.mediaEntities = arrayList;
        } else {
            videoEditedInfo2.paintPath = editState2.paintPath;
            ArrayList arrayList4 = editState2.mediaEntities;
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
                i = this.bitrate;
            }
            videoEditedInfo2.bitrate = i;
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
                int iMin = Math.min(cropState5.transformWidth, cropState5.transformHeight);
                cropState5.transformHeight = iMin;
                cropState5.transformWidth = iMin;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("original transformed w = " + videoEditedInfo2.cropState.transformWidth + " h = " + videoEditedInfo2.cropState.transformHeight + " r = " + videoEditedInfo2.rotationValue);
            }
            MediaController.CropState cropState6 = videoEditedInfo2.cropState;
            int[] iArrFixVideoWidthHeight = fixVideoWidthHeight(cropState6.transformWidth, cropState6.transformHeight);
            MediaController.CropState cropState7 = videoEditedInfo2.cropState;
            cropState7.transformWidth = iArrFixVideoWidthHeight[0];
            cropState7.transformHeight = iArrFixVideoWidthHeight[1];
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("fixed transformed w = " + videoEditedInfo2.cropState.transformWidth + " h = " + videoEditedInfo2.cropState.transformHeight);
            }
        }
        if (this.sendPhotoType == 1) {
            videoEditedInfo2.avatarStartTime = this.avatarStartTime;
            videoEditedInfo2.originalBitrate = this.originalBitrate;
        }
        videoEditedInfo2.muted = this.muteVideo || this.sendPhotoType == 1;
        return videoEditedInfo2;
    }

    private boolean supportsSendingNewEntities() {
        TLRPC.EncryptedChat encryptedChat;
        ChatActivity chatActivity = this.parentChatActivity;
        return chatActivity != null && ((encryptedChat = chatActivity.currentEncryptedChat) == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101);
    }

    public void closeCaptionEnter(boolean z) {
        int i = this.currentIndex;
        if (i < 0 || i >= this.imagesArrLocals.size() || !isCaptionOpen()) {
            return;
        }
        if (z) {
            applyCaption();
        }
        getCaptionView().onBackPressed();
    }

    public CaptionContainerView getCaptionView() {
        PhotoViewerProvider photoViewerProvider = this.placeProvider;
        return (photoViewerProvider == null || !photoViewerProvider.isCaptionAbove()) ? this.captionEdit : this.topCaptionEdit;
    }

    public CharSequence getCurrentCaptionText() {
        CaptionContainerView captionView;
        if (isVisible() && (captionView = getCaptionView()) != null) {
            return captionView.getText();
        }
        return null;
    }

    public CharSequence applyCaption() {
        int i;
        if (!isVisible() || this.placeProvider == null || (i = this.currentIndex) < 0 || i >= this.imagesArrLocals.size()) {
            return null;
        }
        Object obj = this.imagesArrLocals.get(this.currentIndex);
        CharSequence text = getCaptionView().getText();
        CharSequence[] charSequenceArr = {text};
        if (this.hasCaptionForAllMedia && !TextUtils.equals(this.captionForAllMedia, text) && this.placeProvider.getPhotoIndex(this.currentIndex) != 0 && this.placeProvider.getSelectedCount() > 0) {
            this.hasCaptionForAllMedia = false;
        }
        ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, supportsSendingNewEntities());
        CharSequence charSequence = charSequenceArr[0];
        this.captionForAllMedia = charSequence;
        if (obj instanceof MediaController.PhotoEntry) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            photoEntry.caption = charSequence;
            photoEntry.entities = entities;
        } else if (obj instanceof MediaController.SearchImage) {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            searchImage.caption = charSequence;
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
        String str;
        String str2;
        Arrays.fill(this.videoPlayerCurrentTime, 0);
        Arrays.fill(this.videoPlayerTotalTime, 0);
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            long jMax = Math.max(0L, videoPlayer.getCurrentPosition());
            if (this.shownControlsByEnd && !this.actionBarWasShownBeforeByEnd) {
                jMax = 0;
            }
            long jMax2 = Math.max(0L, this.videoPlayer.getDuration());
            if (!this.inPreview && this.videoTimelineViewContainer.getVisibility() == 0) {
                jMax2 = (long) (jMax2 * (this.videoTimelineView.getRightProgress() - this.videoTimelineView.getLeftProgress()));
                jMax = (long) (jMax - (this.videoTimelineView.getLeftProgress() * jMax2));
                if (jMax > jMax2) {
                    jMax = jMax2;
                }
            }
            long j = jMax / 1000;
            long j2 = jMax2 / 1000;
            int[] iArr = this.videoPlayerCurrentTime;
            iArr[0] = (int) (j / 60);
            iArr[1] = (int) (j % 60);
            int[] iArr2 = this.videoPlayerTotalTime;
            iArr2[0] = (int) (j2 / 60);
            iArr2[1] = (int) (j2 % 60);
        } else {
            PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
            if (photoViewerWebView != null && photoViewerWebView.isControllable()) {
                long jMax3 = (!this.shownControlsByEnd || this.actionBarWasShownBeforeByEnd) ? Math.max(0, this.photoViewerWebView.getCurrentPosition()) : 0L;
                long jMax4 = Math.max(0, this.photoViewerWebView.getVideoDuration());
                if (!this.inPreview && this.videoTimelineViewContainer.getVisibility() == 0) {
                    jMax4 = (long) (jMax4 * (this.videoTimelineView.getRightProgress() - this.videoTimelineView.getLeftProgress()));
                    jMax3 = (long) (jMax3 - (this.videoTimelineView.getLeftProgress() * jMax4));
                    if (jMax3 > jMax4) {
                        jMax3 = jMax4;
                    }
                }
                long j3 = jMax3 / 1000;
                long j4 = jMax4 / 1000;
                int[] iArr3 = this.videoPlayerCurrentTime;
                iArr3[0] = (int) (j3 / 60);
                iArr3[1] = (int) (j3 % 60);
                int[] iArr4 = this.videoPlayerTotalTime;
                iArr4[0] = (int) (j4 / 60);
                iArr4[1] = (int) (j4 % 60);
            }
        }
        int[] iArr5 = this.videoPlayerCurrentTime;
        int i = iArr5[0];
        if (i >= 60) {
            str = format(i / 60, i % 60, iArr5[1]);
        } else {
            str = format(i, iArr5[1]);
        }
        int[] iArr6 = this.videoPlayerTotalTime;
        int i2 = iArr6[0];
        if (i2 >= 60) {
            str2 = format(i2 / 60, i2 % 60, iArr6[1]);
        } else {
            str2 = format(i2, iArr6[1]);
        }
        this.videoPlayerTime.setText(str + " / " + str2);
        if (Objects.equals(this.lastControlFrameDuration, str2)) {
            return;
        }
        this.lastControlFrameDuration = str2;
        this.videoPlayerControlFrameLayout.requestLayout();
    }

    private String format(int i, int i2, int i3) {
        char c = (char) (((i >= 100 ? 99 : i) / 10) + 48);
        if (i >= 100) {
            i = 99;
        }
        char c2 = (char) ((i % 10) + 48);
        char c3 = (char) (((i2 >= 100 ? 99 : i2) / 10) + 48);
        if (i2 >= 100) {
            i2 = 99;
        }
        char c4 = (char) ((i2 % 10) + 48);
        char c5 = (char) (((i3 >= 100 ? 99 : i3) / 10) + 48);
        if (i3 >= 100) {
            i3 = 99;
        }
        return new String(new char[]{c, c2, ':', c3, c4, ':', c5, (char) ((i3 % 10) + 48)});
    }

    private String format(int i, int i2) {
        char c = (char) (((i >= 100 ? 99 : i) / 10) + 48);
        if (i >= 100) {
            i = 99;
        }
        char c2 = (char) ((i % 10) + 48);
        char c3 = (char) (((i2 >= 100 ? 99 : i2) / 10) + 48);
        if (i2 >= 100) {
            i2 = 99;
        }
        return new String(new char[]{c, c2, ':', c3, (char) ((i2 % 10) + 48)});
    }

    private void checkBufferedProgress(float f) {
        MessageObject messageObject;
        TLRPC.Document document;
        if (!this.isStreaming || this.parentActivity == null || this.streamingAlertShown || this.videoPlayer == null || (messageObject = this.currentMessageObject) == null || (document = messageObject.getDocument()) == null || this.currentMessageObject.getDuration() < 20.0d) {
            return;
        }
        boolean z = document.size >= 2147483648L;
        if ((DownloadController.getInstance(this.currentAccount).getAutodownloadMask() & 4) == 0 || f >= 0.9f) {
            return;
        }
        long j = document.size;
        if (j * f >= 5242880.0f || (f >= 0.5f && j >= 2097152)) {
            if (Math.abs(SystemClock.elapsedRealtime() - this.startedPlayTime) >= (z ? 10000 : 3000)) {
                if (this.videoPlayer.getDuration() == -9223372036854775807L) {
                    Toast.makeText(this.parentActivity, LocaleController.getString(R.string.VideoDoesNotSupportStreaming), 1).show();
                }
                this.streamingAlertShown = true;
            }
        }
    }

    public void updateColors() {
        int i = Theme.key_chat_editMediaButton;
        int themedColor = getThemedColor(i);
        ChatActivityEnterView.SendButton sendButton = this.pickerViewSendButton;
        if (sendButton != null) {
            sendButton.updateColors();
            this.pickerViewSendButton.invalidate();
        }
        CheckBox checkBox = this.checkImageView;
        if (checkBox != null) {
            checkBox.setColor(getThemedColor(i), -1);
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.paintItem;
        if (imageView != null && imageView.getColorFilter() != null) {
            this.paintItem.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView2 = this.cropItem;
        if (imageView2 != null && imageView2.getColorFilter() != null) {
            this.cropItem.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView3 = this.tuneItem;
        if (imageView3 != null && imageView3.getColorFilter() != null) {
            this.tuneItem.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView4 = this.rotateItem;
        if (imageView4 != null && imageView4.getColorFilter() != null) {
            this.rotateItem.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView5 = this.mirrorItem;
        if (imageView5 != null && imageView5.getColorFilter() != null) {
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
        CaptionPhotoViewer captionPhotoViewer2 = this.topCaptionEdit;
        if (captionPhotoViewer2 != null) {
            captionPhotoViewer2.updateColors(this.resourcesProvider);
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
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || !messageObject.isSponsored()) {
            AndroidUtilities.cancelRunOnUIThread(this.hideActionBarRunnable);
            AndroidUtilities.runOnUIThread(this.hideActionBarRunnable, i);
        }
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

    public void updatePlayerState(boolean r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.updatePlayerState(boolean, int):void");
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
            videoPlayer.seekTo((long) (f * videoPlayer.getDuration()));
            return;
        }
        PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
        if (photoViewerWebView != null) {
            photoViewerWebView.seekTo((long) (f * photoViewerWebView.getVideoDuration()));
        }
    }

    private void preparePlayer(ArrayList arrayList, Uri uri, boolean z, boolean z2, boolean z3) throws NumberFormatException {
        preparePlayer(arrayList, uri, z, z2, null, z3, 0L);
    }

    private void preparePlayer(ArrayList arrayList, Uri uri, boolean z, boolean z2, MediaController.SavedFilterState savedFilterState, boolean z3, long j) throws NumberFormatException {
        boolean z4;
        PageBlocksAdapter pageBlocksAdapter;
        VideoSize videoSize;
        int i;
        int i2;
        if (!z2) {
            this.currentPlayingVideoFile = uri;
            this.currentPlayingVideoQualityFiles = arrayList;
        }
        if (this.parentActivity == null) {
            return;
        }
        boolean z5 = false;
        this.streamingAlertShown = false;
        this.startedPlayTime = SystemClock.elapsedRealtime();
        this.currentVideoFinishedLoading = false;
        this.lastBufferedPositionCheck = 0L;
        this.firstAnimationDelay = true;
        this.inPreview = z2;
        releasePlayer(false);
        if (this.imagesArrLocals.isEmpty()) {
            createVideoTextureView(null);
        }
        if (this.textureImageView == null) {
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
                @Override
                public void onOrientationChanged(int i3) {
                    if (PhotoViewer.this.orientationEventListener == null || PhotoViewer.this.aspectRatioFrameLayout == null || PhotoViewer.this.aspectRatioFrameLayout.getVisibility() != 0 || PhotoViewer.this.parentActivity == null || PhotoViewer.this.fullscreenedByButton == 0) {
                        return;
                    }
                    if (PhotoViewer.this.fullscreenedByButton != 1) {
                        if (i3 <= 0 || (i3 < 330 && i3 > 30)) {
                            if (!PhotoViewer.this.wasRotated || i3 < 240 || i3 > 300) {
                                return;
                            }
                            PhotoViewer.this.parentActivity.setRequestedOrientation(PhotoViewer.this.prevOrientation);
                            PhotoViewer.this.fullscreenedByButton = 0;
                            PhotoViewer.this.wasRotated = false;
                            return;
                        }
                        PhotoViewer.this.wasRotated = true;
                        return;
                    }
                    if (i3 < 240 || i3 > 300) {
                        if (!PhotoViewer.this.wasRotated || i3 <= 0) {
                            return;
                        }
                        if (i3 >= 330 || i3 <= 30) {
                            PhotoViewer.this.parentActivity.setRequestedOrientation(PhotoViewer.this.prevOrientation);
                            PhotoViewer.this.fullscreenedByButton = 0;
                            PhotoViewer.this.wasRotated = false;
                            return;
                        }
                        return;
                    }
                    PhotoViewer.this.wasRotated = true;
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
        PipSource pipSource = this.pipSource;
        if (pipSource != null) {
            pipSource.destroy();
            this.pipSource = null;
        }
        if (this.videoPlayer == null) {
            VideoPlayer videoPlayer = this.injectingVideoPlayer;
            if (videoPlayer != null) {
                this.videoPlayer = videoPlayer;
                this.injectingVideoPlayer = null;
                this.playerInjected = true;
                updatePlayerState(videoPlayer.getPlayWhenReady(), this.videoPlayer.getPlaybackState());
                z4 = false;
            } else {
                VideoPlayer videoPlayer2 = new VideoPlayer() {
                    @Override
                    public void play() {
                        super.play();
                        PhotoViewer.this.playOrStopAnimatedStickers(true);
                        if (PhotoViewer.this.ignorePlayerUpdate) {
                            return;
                        }
                        CastSync.syncPosition(getCurrentPosition());
                        CastSync.setPlaying(true);
                    }

                    @Override
                    public void pause() {
                        super.pause();
                        if (PhotoViewer.this.currentEditMode == 0) {
                            PhotoViewer.this.playOrStopAnimatedStickers(false);
                        }
                        if (PhotoViewer.this.ignorePlayerUpdate) {
                            return;
                        }
                        CastSync.syncPosition(getCurrentPosition());
                        CastSync.setPlaying(false);
                    }

                    @Override
                    public void seekTo(long j2) {
                        super.seekTo(j2);
                        if (PhotoViewer.this.isCurrentVideo) {
                            PhotoViewer.this.seekAnimatedStickersTo(j2);
                        }
                        if (PhotoViewer.this.ignorePlayerUpdate) {
                            return;
                        }
                        CastSync.syncPosition(j2);
                    }

                    @Override
                    public void onRenderedFirstFrame() {
                        super.onRenderedFirstFrame();
                        boolean z6 = true;
                        PhotoViewer.this.firstFrameRendered = true;
                        if (PhotoViewer.this.usedSurfaceView) {
                            PhotoViewer.this.containerView.invalidate();
                        }
                        PhotoViewer.this.updateQualityItems();
                        if (!CastSync.isActive() && !PhotoViewer.this.muteVideo) {
                            z6 = false;
                        }
                        setMute(z6);
                        if (PhotoViewer.this.ignorePlayerUpdate) {
                            return;
                        }
                        CastSync.syncPosition(getCurrentPosition());
                        CastSync.setSpeed(getPlaybackSpeed());
                    }

                    @Override
                    public void setPlaybackSpeed(float f) {
                        super.setPlaybackSpeed(f);
                        if (PhotoViewer.this.ignorePlayerUpdate) {
                            return;
                        }
                        CastSync.setSpeed(f);
                    }
                };
                this.videoPlayer = videoPlayer2;
                videoPlayer2.setOnQualityChangeListener(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.updateQualityItems();
                    }
                });
                if (PipUtils.checkPermissions(this.parentActivity) == 1) {
                    this.pipSource = new PipSource.Builder(this.parentActivity, this).setTagPrefix("photo-viewer-" + this.videoPlayer.playerId).setContentView(this.aspectRatioFrameLayout).setPlaceholderView(this.pipPlaceholderView).setNeedMediaSession(true).build();
                }
                z4 = true;
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
            this.videoPlayer.setDelegate(new AnonymousClass57());
        } else {
            z4 = false;
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
        if (z4) {
            this.seekToProgressPending = this.seekToProgressPending2;
            this.videoPlayerSeekbar.setProgress(0.0f);
            VideoTimelinePlayView videoTimelinePlayView = this.videoTimelineView;
            videoTimelinePlayView.setProgress(videoTimelinePlayView.getLeftProgress());
            this.videoPlayerSeekbar.setBufferedProgress(0.0f);
            MessageObject messageObject = this.currentMessageObject;
            if (messageObject != null) {
                int duration = (int) messageObject.getDuration();
                String fileNameFast = this.currentMessageObject.getFileNameFast();
                if (!TextUtils.isEmpty(fileNameFast)) {
                    if (duration >= 10) {
                        SavedVideoPosition savedVideoPosition = (SavedVideoPosition) savedVideoPositions.get(fileNameFast);
                        MessageObject messageObject2 = this.currentMessageObject;
                        if (messageObject2.forceSeekTo < 0.0f && savedVideoPosition != null) {
                            float f = savedVideoPosition.position;
                            if (f > 0.0f && f < 0.999f) {
                                messageObject2.forceSeekTo = f;
                                this.videoPlayerSeekbar.setProgress(f);
                            }
                        }
                        this.shouldSavePositionForCurrentVideoShortTerm = fileNameFast;
                    }
                    if (duration >= 300) {
                        if (this.currentMessageObject.forceSeekTo < 0.0f) {
                            float f2 = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).getFloat(fileNameFast, -1.0f);
                            if (f2 > 0.0f && f2 < 0.999f) {
                                this.currentMessageObject.forceSeekTo = f2;
                                this.videoPlayerSeekbar.setProgress(f2);
                            }
                        }
                        this.shouldSavePositionForCurrentVideo = fileNameFast;
                    }
                }
            }
            if (arrayList != null) {
                this.videoPlayer.preparePlayer(arrayList, VideoPlayer.getSavedQuality(arrayList, this.currentMessageObject));
            } else {
                this.videoPlayer.preparePlayer(uri, "other", 3, j);
            }
            ExoPlayer exoPlayer = this.videoPlayer.player;
            if (exoPlayer != null) {
                exoPlayer.setVideoFrameMetadataListener(new AnonymousClass58());
            }
            updateQualityItems();
            this.videoPlayer.setPlayWhenReady(z);
            PipSource pipSource2 = this.pipSource;
            if (pipSource2 != null) {
                pipSource2.setPlayer(this.videoPlayer.player);
                ExoPlayer exoPlayer2 = this.videoPlayer.player;
                if (exoPlayer2 != null && (videoSize = exoPlayer2.getVideoSize()) != null && (i = videoSize.width) > 0 && (i2 = videoSize.height) > 0) {
                    int i3 = videoSize.unappliedRotationDegrees;
                    if (i3 == 90 || i3 == 270) {
                        this.pipSource.setContentRatio(i2, i);
                    } else {
                        this.pipSource.setContentRatio(i, i2);
                    }
                }
            }
        }
        Boolean looping = VideoPlayer.getLooping(this.currentMessageObject);
        if (z3) {
            this.playerLooping = false;
        } else if (looping != null) {
            this.playerLooping = looping.booleanValue();
        } else {
            MessageObject messageObject3 = this.currentMessageObject;
            this.playerLooping = (messageObject3 != null && messageObject3.getDuration() <= 30.0d) || ((pageBlocksAdapter = this.pageBlocksAdapter) != null && pageBlocksAdapter.isHardwarePlayer(this.currentIndex));
        }
        this.videoPlayerControlFrameLayout.setSeekBarTransitionEnabled(this.playerLooping);
        this.videoPlayer.setLooping(this.playerLooping);
        this.loopItem.setEnabledByColor(this.playerLooping, -1, -9194260);
        this.loopItem.setSelectorColor(this.playerLooping ? 259241196 : 268435455);
        MessageObject messageObject4 = this.currentMessageObject;
        if (messageObject4 != null) {
            float f3 = messageObject4.forceSeekTo;
            if (f3 >= 0.0f) {
                this.seekToProgressPending = f3;
                messageObject4.forceSeekTo = -1.0f;
            }
        }
        TLRPC.BotInlineResult botInlineResult = this.currentBotInlineResult;
        if (botInlineResult != null && (botInlineResult.type.equals("video") || MessageObject.isVideoDocument(this.currentBotInlineResult.document))) {
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
            if (!this.isCurrentVideo && !z3) {
                z5 = true;
            }
            setVideoPlayerControlVisible(z5, true);
        }
        if (!this.isCurrentVideo) {
            scheduleActionBarHide(this.playerAutoStarted ? 3000 : 1000);
        }
        if (this.currentMessageObject != null) {
            this.videoPlayer.setPlaybackSpeed(this.currentVideoSpeed);
        }
        this.inPreview = z2;
    }

    class AnonymousClass57 implements VideoPlayer.VideoPlayerDelegate {
        private boolean firstState = true;

        @Override
        public void onSeekFinished(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekFinished(this, eventTime);
        }

        @Override
        public void onSeekStarted(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekStarted(this, eventTime);
        }

        AnonymousClass57() {
        }

        @Override
        public void onStateChanged(boolean z, int i) {
            if (PhotoViewer.this.videoPlayer != null) {
                PhotoViewer.this.videoPlayer.setMute(CastSync.isActive() || PhotoViewer.this.muteVideo);
            }
            if (this.firstState && PhotoViewer.this.videoPlayer != null && PhotoViewer.this.videoPlayer.getDuration() != -9223372036854775807L) {
                this.firstState = false;
                if (PhotoViewer.this.imagesArr.isEmpty() && PhotoViewer.this.secureDocuments.isEmpty() && PhotoViewer.this.imagesArrLocations.isEmpty() && !PhotoViewer.this.imagesArrLocals.isEmpty() && PhotoViewer.this.switchingToIndex >= 0 && PhotoViewer.this.switchingToIndex < PhotoViewer.this.imagesArrLocals.size()) {
                    Object obj = PhotoViewer.this.imagesArrLocals.get(PhotoViewer.this.switchingToIndex);
                    if (obj instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        if (photoEntry.isVideo && photoEntry.editedInfo != null) {
                            PhotoViewer.this.videoPlayer.seekTo((long) (photoEntry.editedInfo.start * PhotoViewer.this.videoPlayer.getDuration()));
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
            if (PhotoViewer.this.menuItem.isSubItemVisible(10)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PhotoViewer.this.parentActivity, PhotoViewer.this.resourcesProvider);
                builder.setTitle(LocaleController.getString("AppName", R.string.AppName));
                builder.setMessage(LocaleController.getString(R.string.CantPlayVideo));
                builder.setPositiveButton(LocaleController.getString("Open", R.string.Open), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        this.f$0.lambda$onError$0(alertDialog, i);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                PhotoViewer.this.showAlertDialog(builder);
            }
        }

        public void lambda$onError$0(AlertDialog alertDialog, int i) {
            try {
                AndroidUtilities.openForView(PhotoViewer.this.currentMessageObject, PhotoViewer.this.parentActivity, PhotoViewer.this.resourcesProvider, true);
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
                if (PhotoViewer.this.pipSource != null) {
                    PhotoViewer.this.pipSource.setContentRatio(PhotoViewer.this.videoWidth, PhotoViewer.this.videoHeight);
                }
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
                            this.f$0.lambda$onRenderedFirstFrame$1();
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
            Runnable runnable = PhotoViewer.this.pipFirstFrameCallback;
            if (runnable != null) {
                runnable.run();
                PhotoViewer.this.pipFirstFrameCallback = null;
            }
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
                            this.f$0.lambda$onRenderedFirstFrame$2();
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
            TextureView textureView;
            if (PipVideoOverlay.getPipSource() == null || !PipVideoOverlay.getPipSource().state2.isAttachedToPip() || (textureView = PhotoViewer.this.changedTextureView) == null || textureView.getSurfaceTexture() != surfaceTexture) {
                if (PhotoViewer.this.changingTextureView) {
                    PhotoViewer.this.changingTextureView = false;
                    if (PhotoViewer.this.isInline) {
                        PhotoViewer.this.waitingForFirstTextureUpload = 1;
                        PhotoViewer.this.changedTextureView.setSurfaceTexture(surfaceTexture);
                        PhotoViewer photoViewer = PhotoViewer.this;
                        photoViewer.changedTextureView.setSurfaceTextureListener(photoViewer.surfaceTextureListener);
                        PhotoViewer.this.changedTextureView.setVisibility(0);
                        return true;
                    }
                }
                return false;
            }
            PipVideoOverlay.getPipTextureView().setSurfaceTexture(surfaceTexture);
            PipVideoOverlay.getPipTextureView().setVisibility(0);
            return true;
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            PhotoViewer.this.checkChangedTextureView(false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onSurfaceTextureUpdated$3();
                }
            });
        }

        public void lambda$onSurfaceTextureUpdated$3() {
            if (PhotoViewer.this.firstFrameView != null) {
                PhotoViewer.this.firstFrameView.checkFromPlayer(PhotoViewer.this.videoPlayer);
            }
        }
    }

    class AnonymousClass58 implements VideoFrameMetadataListener {
        AnonymousClass58() {
        }

        @Override
        public void onVideoFrameAboutToBeRendered(long j, long j2, Format format, MediaFormat mediaFormat) {
            final VideoPlayer videoPlayer;
            if (PhotoViewer.this.centerImageIsLivePhoto && (videoPlayer = PhotoViewer.this.videoPlayer) != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onVideoFrameAboutToBeRendered$0(videoPlayer);
                    }
                });
            }
        }

        public void lambda$onVideoFrameAboutToBeRendered$0(VideoPlayer videoPlayer) {
            if (videoPlayer.getDuration() > 0 && videoPlayer.getCurrentPosition() >= videoPlayer.getDuration() - 590) {
                PhotoViewer.this.containerView.invalidate();
            }
        }
    }

    public void checkFullscreenButton() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.checkFullscreenButton():void");
    }

    private void createVideoTextureView(final MediaController.SavedFilterState savedFilterState) {
        if (this.videoTextureView != null) {
            return;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(this.parentActivity) {
            @Override
            protected void onMeasure(int i, int i2) {
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

            @Override
            public void draw(Canvas canvas) {
                if (PhotoViewer.this.textureViewSkipRender) {
                    return;
                }
                super.draw(canvas);
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
                        PhotoViewer.lambda$createVideoTextureView$102(savedFilterState, filterGLThread);
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
        View view = new View(this.parentActivity);
        this.pipPlaceholderView = view;
        this.aspectRatioFrameLayout.addView(view, LayoutHelper.createFrame(-1, -1.0f));
        if (this.sendPhotoType == 1) {
            View view2 = new View(this.parentActivity);
            this.flashView = view2;
            view2.setBackgroundColor(-1);
            this.flashView.setAlpha(0.0f);
            this.aspectRatioFrameLayout.addView(this.flashView, LayoutHelper.createFrame(-1, -1, 17));
        }
        PipSource pipSource = this.pipSource;
        if (pipSource != null) {
            pipSource.setContentView(this.aspectRatioFrameLayout);
            this.pipSource.setPlaceholderView(this.pipPlaceholderView);
        }
    }

    public static void lambda$createVideoTextureView$102(MediaController.SavedFilterState savedFilterState, FilterGLThread filterGLThread) {
        filterGLThread.setFilterGLThreadDelegate(FilterShaders.getFilterShadersDelegate(savedFilterState));
    }

    public void releasePlayer(boolean z) {
        this.usedSurfaceView = false;
        PipSource pipSource = this.pipSource;
        if (pipSource != null) {
            pipSource.destroy();
            this.pipSource = null;
        }
        if (this.videoPlayer != null) {
            cancelVideoPlayRunnable();
            AndroidUtilities.cancelRunOnUIThread(this.setLoadingRunnable);
            AndroidUtilities.cancelRunOnUIThread(this.hideActionBarRunnable);
            if (this.shouldSavePositionForCurrentVideoShortTerm != null) {
                float currentPosition = this.videoPlayer.getCurrentPosition() / this.videoPlayer.getDuration();
                savedVideoPositions.put(this.shouldSavePositionForCurrentVideoShortTerm, new SavedVideoPosition(currentPosition, SystemClock.elapsedRealtime()));
                MessageObject messageObject = this.currentMessageObject;
                if (messageObject != null) {
                    messageObject.cachedSavedTimestamp = Float.valueOf(currentPosition);
                }
            }
            this.videoPlayer.releasePlayer(true);
            this.videoPlayer = null;
        } else {
            this.playerWasPlaying = false;
        }
        if (this.photoViewerWebView != null) {
            AndroidUtilities.cancelRunOnUIThread(this.hideActionBarRunnable);
            if (this.shouldSavePositionForCurrentVideoShortTerm != null) {
                float currentVideoPosition = getCurrentVideoPosition() / getVideoDuration();
                savedVideoPositions.put(this.shouldSavePositionForCurrentVideoShortTerm, new SavedVideoPosition(currentVideoPosition, SystemClock.elapsedRealtime()));
                MessageObject messageObject2 = this.currentMessageObject;
                if (messageObject2 != null) {
                    messageObject2.cachedSavedTimestamp = Float.valueOf(currentVideoPosition);
                }
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
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.videoPlayerControlFrameLayout.getAlpha(), z ? 1.0f : 0.0f);
                valueAnimatorOfFloat.setDuration(200L);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f$0.lambda$setVideoPlayerControlVisible$103(valueAnimator);
                    }
                });
                valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator2) {
                        if (z) {
                            return;
                        }
                        PhotoViewer.this.videoPlayerControlFrameLayout.setVisibility(8);
                    }
                });
                this.videoPlayerControlAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.start();
            } else {
                this.videoPlayerControlFrameLayout.setVisibility(z ? 0 : 8);
                this.videoPlayerControlFrameLayout.setAlpha(z ? 1.0f : 0.0f);
            }
            if (this.allowShare && this.pageBlocksAdapter == null) {
                if (z) {
                    this.menuItem.showSubItem(9);
                } else {
                    this.menuItem.hideSubItem(9);
                }
            }
        }
    }

    public void lambda$setVideoPlayerControlVisible$103(ValueAnimator valueAnimator) {
        this.videoPlayerControlFrameLayout.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void updateCaptionTextForCurrentPhoto(Object obj) {
        CharSequence charSequence;
        if (this.hasCaptionForAllMedia) {
            charSequence = this.captionForAllMedia;
        } else if (obj instanceof MediaController.PhotoEntry) {
            charSequence = ((MediaController.PhotoEntry) obj).caption;
        } else {
            charSequence = (!(obj instanceof TLRPC.BotInlineResult) && (obj instanceof MediaController.SearchImage)) ? ((MediaController.SearchImage) obj).caption : null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            getCaptionView().setText("");
        } else {
            getCaptionView().setText(AnimatedEmojiSpan.cloneSpans(charSequence, 3));
        }
        getCaptionView().editText.getEditText().setAllowTextEntitiesIntersection(supportsSendingNewEntities());
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
            AlertDialog alertDialogShow = builder.show();
            this.visibleDialog = alertDialogShow;
            alertDialogShow.setCanceledOnTouchOutside(true);
            this.visibleDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f$0.lambda$showAlertDialog$104(dialogInterface);
                }
            });
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public void lambda$showAlertDialog$104(DialogInterface dialogInterface) {
        this.visibleDialog = null;
    }

    public void mergeImages(String str, String str2, Bitmap bitmap, Bitmap bitmap2, float f, boolean z) {
        mergeImages(str, str2, bitmap, bitmap2, getCompressFormat(), f, z);
    }

    public static void mergeImages(String str, String str2, Bitmap bitmap, Bitmap bitmap2, Bitmap.CompressFormat compressFormat, float f, boolean z) {
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
            float fMax = Math.max(width, height) / f;
            height = (int) (height / fMax);
            width = (int) (f2 / fMax);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rect = new Rect(0, 0, width, height);
        if (z) {
            canvas.drawBitmap(bitmap2, (Rect) null, rect, bitmapPaint);
            canvas.drawBitmap(bitmap, (Rect) null, rect, bitmapPaint);
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, rect, bitmapPaint);
            canvas.drawBitmap(bitmap2, (Rect) null, rect, bitmapPaint);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        bitmapCreateBitmap.compress(compressFormat, f == 512.0f ? 83 : 87, fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (z2) {
            bitmap.recycle();
        }
        bitmapCreateBitmap.recycle();
    }

    public void seekAnimatedStickersTo(long j) {
        RLottieDrawable lottieAnimation;
        ArrayList arrayList = this.editState.mediaEntities;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) this.editState.mediaEntities.get(i);
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
        ArrayList arrayList = this.editState.mediaEntities;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) this.editState.mediaEntities.get(i);
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

    public static Bitmap createCroppedBitmap(Bitmap bitmap, MediaController.CropState cropState, int[] iArr, boolean z) {
        int i;
        int i2;
        try {
            int i3 = 0;
            int i4 = (cropState.transformRotation + (iArr != null ? iArr[0] : 0)) % 360;
            if (iArr != null && iArr.length > 1) {
                i3 = iArr[1];
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (i4 == 90 || i4 == 270) {
                i = width;
                i2 = height;
            } else {
                i2 = width;
                i = height;
            }
            float f = i2;
            float f2 = i;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (cropState.cropPw * f), (int) (cropState.cropPh * f2), Bitmap.Config.ARGB_8888);
            Matrix matrix = new Matrix();
            matrix.postTranslate((-width) / 2, (-height) / 2);
            if (z && cropState.mirrored) {
                if (i4 == 90 || i4 == 270) {
                    matrix.postScale(1.0f, -1.0f);
                } else {
                    matrix.postScale(-1.0f, 1.0f);
                }
            }
            if (i3 == 1) {
                matrix.postScale(-1.0f, 1.0f);
            } else if (i3 == 2) {
                matrix.postScale(1.0f, -1.0f);
            }
            matrix.postRotate(cropState.cropRotate + i4);
            matrix.postTranslate(cropState.cropPx * f, cropState.cropPy * f2);
            float f3 = cropState.cropScale;
            matrix.postScale(f3, f3);
            matrix.postTranslate(r10 / 2, r11 / 2);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, matrix, new Paint(2));
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            FileLog.e(th);
            return null;
        }
    }

    public void lambda$setParentActivity$50(android.graphics.Bitmap r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.lambda$setParentActivity$50(android.graphics.Bitmap):void");
    }

    public void applyCurrentEditMode() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.applyCurrentEditMode():void");
    }

    private void setPhotoChecked() {
        ChatActivity chatActivity;
        TLRPC.Chat currentChat;
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
            boolean zIsPhotoChecked = this.placeProvider.isPhotoChecked(this.currentIndex);
            this.checkImageView.setChecked(zIsPhotoChecked, true);
            if (photoChecked >= 0) {
                if (zIsPhotoChecked) {
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
                    this.f$0.lambda$updateResetButtonVisibility$105(z);
                }
            });
        }
    }

    public void lambda$updateResetButtonVisibility$105(boolean z) {
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
        this.photoCropView.setDelegate(new AnonymousClass61());
    }

    class AnonymousClass61 implements PhotoCropView.PhotoCropViewDelegate {
        AnonymousClass61() {
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
            PhotoViewer.this.videoPlayer.seekTo((long) (PhotoViewer.this.videoPlayer.getDuration() * PhotoViewer.this.avatarStartProgress));
            PhotoViewer.this.videoPlayer.pause();
            PhotoViewer.this.videoTimelineView.setProgress(PhotoViewer.this.avatarStartProgress);
            PhotoViewer.this.cancelVideoPlayRunnable();
            AndroidUtilities.runOnUIThread(PhotoViewer.this.videoPlayRunnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onVideoThumbClick$0();
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
                this.f$0.lambda$detectFaces$108(bitmapHolder, i, str);
            }
        });
    }

    public void lambda$detectFaces$108(final ImageReceiver.BitmapHolder bitmapHolder, int i, final String str) {
        FaceDetector faceDetectorBuild = null;
        try {
            try {
                final boolean z = false;
                faceDetectorBuild = new FaceDetector.Builder(ApplicationLoader.applicationContext).setMode(0).setLandmarkType(0).setTrackingEnabled(false).build();
                if (faceDetectorBuild.isOperational()) {
                    SparseArray sparseArrayDetect = faceDetectorBuild.detect(new Frame.Builder().setBitmap(bitmapHolder.bitmap).setRotation(i).build());
                    if (sparseArrayDetect != null && sparseArrayDetect.size() != 0) {
                        z = true;
                    }
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$detectFaces$106(str, z);
                        }
                    });
                } else {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("face detection is not operational");
                    }
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$detectFaces$107(bitmapHolder, str);
                        }
                    });
                }
            } catch (Exception e) {
                FileLog.e(e);
                if (0 == 0) {
                    return;
                }
            }
            faceDetectorBuild.release();
        } catch (Throwable th) {
            if (0 != 0) {
                faceDetectorBuild.release();
            }
            throw th;
        }
    }

    public void lambda$detectFaces$106(String str, boolean z) {
        if (str.equals(this.centerImage.getImageKey())) {
            this.currentImageHasFace = z ? 1 : 0;
            this.currentImageFaceKey = str;
        }
    }

    public void lambda$detectFaces$107(ImageReceiver.BitmapHolder bitmapHolder, String str) {
        bitmapHolder.release();
        if (str.equals(this.centerImage.getImageKey())) {
            this.currentImageHasFace = 2;
            this.currentImageFaceKey = str;
        }
    }

    public void switchToEditMode(final int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.switchToEditMode(int):void");
    }

    public void lambda$switchToEditMode$109(ValueAnimator valueAnimator) {
        this.photoCropView.cropView.areaView.setRotationScaleTranslation(0.0f, AndroidUtilities.lerp(this.scale, this.animateToScale, this.animationValue), AndroidUtilities.lerp(this.translationX, this.animateToX, this.animationValue), AndroidUtilities.lerp(this.translationY, this.animateToY, this.animationValue));
    }

    public void lambda$switchToEditMode$110(ValueAnimator valueAnimator) {
        this.photoPaintView.setOffsetTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f, 0, false);
    }

    public void lambda$switchToEditMode$111(ValueAnimator valueAnimator) {
        this.photoPaintView.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    class AnonymousClass62 extends AnimatorListenerAdapter {
        final int val$mode;

        AnonymousClass62(int i) {
            this.val$mode = i;
        }

        @Override
        public void onAnimationEnd(Animator animator) throws Resources.NotFoundException, NumberFormatException {
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
                        this.f$0.lambda$onAnimationEnd$0(maskPaintView);
                    }
                });
                PhotoViewer.this.maskPaintView = null;
                PhotoViewer.this.eraseBtn.setActive(false, true);
                PhotoViewer.this.restoreBtn.setActive(false, true);
            } else if (PhotoViewer.this.currentEditMode == 5) {
                PhotoViewer.this.coverEditor.setVisibility(8);
                PhotoViewer.this.coverEditor.destroy();
            }
            PhotoViewer.this.imageMoveAnimation = null;
            final int i = PhotoViewer.this.currentEditMode;
            PhotoViewer.this.currentEditMode = this.val$mode;
            PhotoViewer.this.getCaptionView().keyboardNotifier.ignore(PhotoViewer.this.currentEditMode != 0);
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
                ActionBarToggleParams actionBarToggleParamsEnableStatusBarAnimation = new ActionBarToggleParams().enableStatusBarAnimation(false);
                PhotoViewer.this.toggleActionBar(false, false, actionBarToggleParamsEnableStatusBarAnimation);
                PhotoViewer.this.toggleActionBar(true, true, actionBarToggleParamsEnableStatusBarAnimation);
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            FrameLayout frameLayout = PhotoViewer.this.pickerView;
            Property property = View.TRANSLATION_Y;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 0.0f));
            FrameLayout frameLayout2 = PhotoViewer.this.pickerView;
            Property property2 = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, 1.0f));
            StickerMakerView stickerMakerView = PhotoViewer.this.stickerMakerView;
            if (stickerMakerView != null) {
                arrayList.add(ObjectAnimator.ofFloat(stickerMakerView, (Property<StickerMakerView, Float>) property2, 1.0f));
            }
            if (PhotoViewer.this.stickerMakerBackgroundView != null) {
                arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.stickerMakerBackgroundView, (Property<StickerMakerBackgroundView, Float>) property2, 1.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.pickerViewSendButton, (Property<ChatActivityEnterView.SendButton, Float>) property, 0.0f));
            if (PhotoViewer.this.sendPhotoType != 1) {
                arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.actionBar, (Property<ActionBar, Float>) property, 0.0f));
            }
            if (PhotoViewer.this.needCaptionLayout) {
                arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.captionTextViewSwitcher, (Property<CaptionTextViewSwitcher, Float>) property, 0.0f));
            }
            if (PhotoViewer.this.sendPhotoType == 0 || PhotoViewer.this.sendPhotoType == 4) {
                arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.checkImageView, (Property<CheckBox, Float>) property2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.photosCounterView, (Property<CounterView, Float>) property2, 1.0f));
            } else if (PhotoViewer.this.sendPhotoType == 1) {
                arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.photoCropView, (Property<PhotoCropView, Float>) property2, 1.0f));
            }
            if (PhotoViewer.this.muteButton.getTag() != null) {
                PhotoViewer.this.muteButton.setVisibility(PhotoViewer.this.sendPhotoTypeIsGif ? 8 : 0);
                arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.muteButton, (Property<ImageView, Float>) property2, 1.0f));
            }
            if (PhotoViewer.this.livePhotoButton.getTag() != null) {
                PhotoViewer.this.livePhotoButton.setVisibility((!PhotoViewer.this.sendPhotoTypeIsGif && PhotoViewer.this.centerImageIsLivePhoto && (PhotoViewer.this.placeProvider == null || PhotoViewer.this.placeProvider.allowLivePhotos())) ? 0 : 8);
                arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.livePhotoButton, (Property<LivePhotoButton, Float>) property2, 1.0f));
            }
            if (PhotoViewer.this.editCoverButton.getTag() != null) {
                PhotoViewer.this.editCoverButton.setVisibility(PhotoViewer.this.sendPhotoTypeIsGif ? 8 : 0);
                arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.editCoverButton, (Property<EditCoverButton, Float>) property2, 1.0f));
            }
            if (PhotoViewer.this.navigationBar != null) {
                PhotoViewer.this.navigationBar.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.navigationBar, (Property<View, Float>) property2, 1.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.addListener(new AnimatorListenerAdapter() {
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
                    if (PhotoViewer.this.sendPhotoTypeIsGif || PhotoViewer.this.sendPhotoTypeIsPollMedia) {
                        return;
                    }
                    if ((PhotoViewer.this.sendPhotoType == 0 || PhotoViewer.this.sendPhotoType == 4 || ((PhotoViewer.this.sendPhotoType == 2 || PhotoViewer.this.sendPhotoType == 5) && PhotoViewer.this.imagesArrLocals.size() > 1)) && !PhotoViewer.this.disableSelection) {
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
                    if (i == 3) {
                        PhotoViewer photoViewer7 = PhotoViewer.this;
                        photoViewer7.setIsAboutToSwitchToIndex(photoViewer7.currentIndex, false, true, true);
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

    public void lambda$switchToEditMode$112(View view) {
        applyCurrentEditMode();
        switchToEditMode(0);
    }

    public void lambda$switchToEditMode$114(View view) {
        if (this.photoFilterView.hasChanges()) {
            Activity activity = this.parentActivity;
            if (activity == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(activity, this.resourcesProvider);
            builder.setMessage(LocaleController.getString("DiscardChanges", R.string.DiscardChanges));
            builder.setTitle(LocaleController.getString("AppName", R.string.AppName));
            builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    this.f$0.lambda$switchToEditMode$113(alertDialog, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            showAlertDialog(builder);
            return;
        }
        switchToEditMode(0);
    }

    public void lambda$switchToEditMode$113(AlertDialog alertDialog, int i) {
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
        int bitmapWidth = this.centerImage.getBitmapWidth();
        int bitmapHeight = this.centerImage.getBitmapHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapWidth, bitmapHeight, config);
        StickerMakerView stickerMakerView = this.stickerMakerView;
        if (stickerMakerView != null && stickerMakerView.getSourceBitmap() != null) {
            Bitmap sourceBitmap = this.stickerMakerView.getSourceBitmap();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.translate(bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
            canvas.rotate(this.stickerMakerView.orientation);
            float width = bitmapCreateBitmap.getWidth() / ((this.stickerMakerView.orientation / 90) % 2 != 0 ? sourceBitmap.getHeight() : sourceBitmap.getWidth());
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(((-sourceBitmap.getWidth()) / 2.0f) * width, ((-sourceBitmap.getHeight()) / 2.0f) * width, (sourceBitmap.getWidth() / 2.0f) * width, (sourceBitmap.getHeight() / 2.0f) * width);
            canvas.drawBitmap(sourceBitmap, (Rect) null, rectF, new Paint(3));
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.centerImage.getBitmapWidth(), this.centerImage.getBitmapHeight(), config);
        if (this.centerImage.getBitmap() != null) {
            Bitmap bitmap = this.centerImage.getBitmap();
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            canvas2.translate(bitmapCreateBitmap2.getWidth() / 2.0f, bitmapCreateBitmap2.getHeight() / 2.0f);
            canvas2.rotate(this.centerImage.getOrientation());
            float width2 = bitmapCreateBitmap2.getWidth() / ((this.centerImage.getOrientation() / 90) % 2 != 0 ? bitmap.getHeight() : bitmap.getWidth());
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(((-bitmap.getWidth()) / 2.0f) * width2, ((-bitmap.getHeight()) / 2.0f) * width2, (bitmap.getWidth() / 2.0f) * width2, (bitmap.getHeight() / 2.0f) * width2);
            canvas2.drawBitmap(bitmap, (Rect) null, rectF2, new Paint(3));
        }
        MaskPaintView maskPaintView = new MaskPaintView(this.parentActivity, this.currentAccount, bitmapCreateBitmap2, bitmapCreateBitmap, this.centerImage.getOrientation(), cropState2) {
            @Override
            protected void onRenderViewAlphaUpdate(ValueAnimator valueAnimator) {
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
                this.f$0.lambda$createMaskPaintView$115(view);
            }
        });
        this.maskPaintView.doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createMaskPaintView$116(view);
            }
        });
        this.maskPaintView.setEraser(this.maskPaintViewEraser);
        int iIndexOfChild = this.containerView.indexOfChild(this.btnLayout) - 1;
        if (iIndexOfChild < 0) {
            iIndexOfChild = this.containerView.getChildCount();
        }
        this.containerView.addView(this.maskPaintView, iIndexOfChild, LayoutHelper.createFrame(-1, -1.0f));
        this.maskPaintViewShuttingDown = false;
    }

    public void lambda$createMaskPaintView$115(View view) {
        this.eraseBtn.setActive(false, true);
        this.restoreBtn.setActive(false, true);
        switchToEditMode(0);
    }

    public void lambda$createMaskPaintView$116(View view) {
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
            Bitmap bitmapCreateBitmap = bitmap == null ? Bitmap.createBitmap(bitmapWidth, bitmapHeight, Bitmap.Config.ARGB_8888) : bitmap;
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
                    this.f$0.lambda$createPaintView$118((Integer) obj);
                }
            });
            this.paintKeyboardNotifier = keyboardNotifier;
            keyboardNotifier.ignore(this.currentEditMode != 3);
            Activity activity = this.parentActivity;
            LPhotoPaintView lPhotoPaintView = new LPhotoPaintView(activity, activity, this.currentAccount, bitmapCreateBitmap, this.isCurrentVideo ? null : this.centerImage.getBitmap(), this.centerImage.getOrientation(), this.editState.mediaEntities, cropState2, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createPaintView$119();
                }
            }, this.resourcesProvider) {
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
            lPhotoPaintView.setBlurredBackgroundDrawableForTools(this.iBlur3FactoryFrostedLiquidGlass.create(lPhotoPaintView.bottomLayout).setColorProvider(BlurredBackgroundProviderImpl.photoViewer(this.resourcesProvider)));
            this.containerView.addView(this.photoPaintView.getView(), LayoutHelper.createFrame(-1, -1.0f));
            this.photoPaintView.setOnDoneButtonClickedListener(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createPaintView$120();
                }
            });
            this.photoPaintView.getCancelView().setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$createPaintView$121(view);
                }
            });
            this.photoPaintView.setOffsetTranslationY(AndroidUtilities.dp(126.0f), 0.0f, 0, false);
            this.photoPaintView.setOffsetTranslationX(-AndroidUtilities.dp(12.0f));
        }
    }

    public void lambda$createPaintView$118(Integer num) {
        this.photoPaintView.keyboardVisible = this.paintKeyboardNotifier.keyboardVisible();
        this.containerView.invalidate();
        int iMax = Math.max(num.intValue(), this.photoPaintView.getEmojiPadding(false));
        translateY((!this.photoPaintView.isCurrentText() || iMax <= 0) ? 0.0f : ((AndroidUtilities.displaySize.y - iMax) - AndroidUtilities.dp(80.0f)) - this.photoPaintView.getSelectedEntityBottom());
        AnimatorSet animatorSet = this.paintKeyboardAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$createPaintView$117(valueAnimator);
            }
        });
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.paintKeyboardAnimator = animatorSet2;
        PaintWeightChooserView paintWeightChooserView = this.photoPaintView.weightChooserView;
        Property property = View.TRANSLATION_Y;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(paintWeightChooserView, (Property<PaintWeightChooserView, Float>) property, (-iMax) / 2.5f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.photoPaintView.bottomLayout, (Property<FrameLayout, Float>) property, Math.min(0, r11 + AndroidUtilities.dp(40.0f)));
        LinearLayout linearLayout = this.photoPaintView.tabsLayout;
        Property property2 = View.ALPHA;
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property2, iMax > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(this.photoPaintView.cancelButton, (Property<PaintCancelView, Float>) property2, iMax > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(this.photoPaintView.doneButton, (Property<PaintDoneView, Float>) property2, iMax <= AndroidUtilities.dp(20.0f) ? 1.0f : 0.0f), valueAnimatorOfFloat);
        animatorSet2.setDuration(320L);
        animatorSet2.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        animatorSet2.start();
        this.photoPaintView.updatePlusEmojiKeyboardButton();
    }

    public void lambda$createPaintView$117(ValueAnimator valueAnimator) {
        LPhotoPaintView lPhotoPaintView = this.photoPaintView;
        if (lPhotoPaintView != null) {
            lPhotoPaintView.overlayLayout.invalidate();
        }
    }

    public void lambda$createPaintView$119() {
        this.paintingOverlay.hideBitmap();
    }

    public void lambda$createPaintView$120() {
        this.savedState = null;
        applyCurrentEditMode();
        switchToEditMode(0);
    }

    public void lambda$createPaintView$121(View view) {
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
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.translateY, f);
        this.translateYAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f$0.lambda$translateY$122(valueAnimator2);
            }
        });
        this.translateYAnimator.setDuration(320L);
        this.translateYAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.translateYAnimator.start();
    }

    public void lambda$translateY$122(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.translateY = fFloatValue;
        LPhotoPaintView lPhotoPaintView = this.photoPaintView;
        if (lPhotoPaintView != null) {
            lPhotoPaintView.translateY(fFloatValue);
        }
        this.containerView.invalidate();
    }

    private void closePaintMode() {
        this.photoPaintView.maybeShowDismissalAlert(this, this.parentActivity, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$closePaintMode$123();
            }
        });
    }

    public void lambda$closePaintMode$123() {
        switchToEditMode(0);
    }

    public void switchToPaintMode() {
        EditState editState;
        this.changeModeAnimation = null;
        this.pickerView.setVisibility(8);
        this.pickerViewSendButton.setVisibility(8);
        this.doneButtonFullWidth.setVisibility(8);
        this.muteButton.setVisibility(8);
        this.livePhotoButton.setVisibility(8);
        this.editCoverButton.setVisibility(8);
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
                float fDp = AndroidUtilities.dp(12.0f);
                this.animateToY = fDp;
                if (this.photoPaintView != null) {
                    this.animateToY = fDp + (r15.getAdditionalTop() / 2.0f);
                }
                if (this.cropTransform.getOrientation() == 90 || this.cropTransform.getOrientation() == 270) {
                    int i2 = bitmapHeight;
                    bitmapHeight = bitmapWidth;
                    bitmapWidth = i2;
                }
                float f2 = bitmapWidth;
                float f3 = bitmapHeight;
                this.animateToScale = (Math.min(getContainerViewWidth(3) / f2, getContainerViewHeight(3) / f3) / Math.min(getContainerViewWidth() / f2, getContainerViewHeight() / f3)) * scale1(false);
                this.animateToX = (getLeftInset() / 2) - (getRightInset() / 2);
                this.animationStartTime = System.currentTimeMillis();
                this.zoomAnimation = true;
            } else {
                float f4 = (-AndroidUtilities.dp(44.0f)) + (isStatusBarVisible() ? AndroidUtilities.statusBarHeight / 2 : 0);
                this.animateToY = f4;
                if (this.photoPaintView != null) {
                    float additionalTop = f4 + (r15.getAdditionalTop() / 2.0f);
                    this.animateToY = additionalTop;
                    this.animateToY = additionalTop - (this.photoPaintView.getAdditionalBottom() / 2.0f);
                }
                MediaController.CropState cropState = this.editState.cropState;
                if (cropState != null) {
                    int i3 = cropState.transformRotation;
                    if (i3 != 90 && i3 != 270) {
                        bitmapHeight = bitmapWidth;
                        bitmapWidth = bitmapHeight;
                    }
                    bitmapHeight = (int) (bitmapHeight * cropState.cropPw);
                    bitmapWidth = (int) (bitmapWidth * cropState.cropPh);
                    int i22 = bitmapHeight;
                    bitmapHeight = bitmapWidth;
                    bitmapWidth = i22;
                }
                float f22 = bitmapWidth;
                float f32 = bitmapHeight;
                this.animateToScale = (Math.min(getContainerViewWidth(3) / f22, getContainerViewHeight(3) / f32) / Math.min(getContainerViewWidth() / f22, getContainerViewHeight() / f32)) * scale1(false);
                this.animateToX = (getLeftInset() / 2) - (getRightInset() / 2);
                this.animationStartTime = System.currentTimeMillis();
                this.zoomAnimation = true;
            }
        }
        LPhotoPaintView lPhotoPaintView = this.photoPaintView;
        if (lPhotoPaintView != null) {
            lPhotoPaintView.setDrawShadow(this.sendPhotoType == 11 && ((editState = this.editState) == null || editState.cropState == null));
        }
        this.windowView.setClipChildren(true);
        this.navigationBar.setVisibility(4);
        this.imageMoveAnimation = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(AndroidUtilities.dp(126.0f), 0.0f);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(-AndroidUtilities.dp(12.0f), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$switchToPaintMode$124(valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$switchToPaintMode$125(valueAnimator);
            }
        });
        this.imageMoveAnimation.playTogether(ObjectAnimator.ofFloat(this, (Property<PhotoViewer, Float>) AnimationProperties.PHOTO_VIEWER_ANIMATION_VALUE, 0.0f, 1.0f), valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.photoPaintView.onAnimationStateChanged(true);
        this.imageMoveAnimation.setDuration(200L);
        this.imageMoveAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PhotoViewer.this.photoPaintView.onAnimationStateChanged(false);
                PhotoViewer.this.photoPaintView.init();
                PhotoViewer.this.paintingOverlay.hideEntities();
                PhotoViewer.this.imageMoveAnimation = null;
                PhotoViewer.this.currentEditMode = 3;
                PhotoViewer.this.getCaptionView().keyboardNotifier.ignore(PhotoViewer.this.currentEditMode != 0);
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

    public void lambda$switchToPaintMode$124(ValueAnimator valueAnimator) {
        this.photoPaintView.setOffsetTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f, 0, false);
    }

    public void lambda$switchToPaintMode$125(ValueAnimator valueAnimator) {
        this.photoPaintView.setOffsetTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void toggleOnlyCheckImageView(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float fDpf2 = AndroidUtilities.dpf2(24.0f);
        int i = this.sendPhotoType;
        if (i == 0 || i == 4) {
            CheckBox checkBox = this.checkImageView;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(checkBox, (Property<CheckBox, Float>) property, z ? 1.0f : 0.0f));
            CheckBox checkBox2 = this.checkImageView;
            Property property2 = View.TRANSLATION_Y;
            arrayList.add(ObjectAnimator.ofFloat(checkBox2, (Property<CheckBox, Float>) property2, z ? 0.0f : -fDpf2));
            arrayList.add(ObjectAnimator.ofFloat(this.photosCounterView, (Property<CounterView, Float>) property, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.photosCounterView, (Property<CounterView, Float>) property2, z ? 0.0f : -fDpf2));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    private void toggleCheckImageView(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float fDpf2 = AndroidUtilities.dpf2(24.0f);
        FrameLayout frameLayout = this.pickerView;
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.0f));
        FrameLayout frameLayout2 = this.pickerView;
        Property property2 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, z ? 0.0f : fDpf2));
        StickerMakerView stickerMakerView = this.stickerMakerView;
        if (stickerMakerView != null) {
            arrayList.add(ObjectAnimator.ofFloat(stickerMakerView, (Property<StickerMakerView, Float>) property, z ? 1.0f : 0.0f));
        }
        if (this.stickerMakerView != null) {
            arrayList.add(ObjectAnimator.ofFloat(this.stickerMakerBackgroundView, (Property<StickerMakerBackgroundView, Float>) property, z ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.pickerViewSendButton, (Property<ChatActivityEnterView.SendButton, Float>) property, z ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.pickerViewSendButton, (Property<ChatActivityEnterView.SendButton, Float>) property2, z ? 0.0f : fDpf2));
        int i = this.sendPhotoType;
        if (i == 0 || i == 4) {
            arrayList.add(ObjectAnimator.ofFloat(this.checkImageView, (Property<CheckBox, Float>) property, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.checkImageView, (Property<CheckBox, Float>) property2, z ? 0.0f : -fDpf2));
            arrayList.add(ObjectAnimator.ofFloat(this.photosCounterView, (Property<CounterView, Float>) property, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.photosCounterView, (Property<CounterView, Float>) property2, z ? 0.0f : -fDpf2));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(200L);
        animatorSet.start();
        if (z || !isCaptionOpen()) {
            return;
        }
        closeCaptionEnter(true);
        if (this.captionEdit.editText.isPopupShowing()) {
            this.captionEdit.editText.hidePopup(true);
        }
        if (this.topCaptionEdit.editText.isPopupShowing()) {
            this.topCaptionEdit.editText.hidePopup(true);
        }
        this.captionEdit.editText.closeKeyboard();
        this.topCaptionEdit.editText.closeKeyboard();
    }

    private void toggleMiniProgressInternal(final boolean z) {
        if (z) {
            this.miniProgressView.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.miniProgressAnimator = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.miniProgressView, (Property<RadialProgressView, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.miniProgressAnimator.setDuration(200L);
        this.miniProgressAnimator.addListener(new AnimatorListenerAdapter() {
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
                } else {
                    AndroidUtilities.runOnUIThread(this.miniProgressShowRunnable, 500L);
                    return;
                }
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
        int i;
        if (this.sendPhotoType == 1 || (frameLayoutDrawer = this.containerView) == null) {
            return;
        }
        if (z) {
            i = 1792;
        } else {
            i = (frameLayoutDrawer.getPaddingLeft() > 0 || this.containerView.getPaddingRight() > 0) ? 5894 : 1796;
        }
        this.containerView.setSystemUiVisibility(i);
    }

    private static class ActionBarToggleParams {
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

    public void toggleActionBar(final boolean r13, boolean r14, org.telegram.ui.PhotoViewer.ActionBarToggleParams r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.toggleActionBar(boolean, boolean, org.telegram.ui.PhotoViewer$ActionBarToggleParams):void");
    }

    public void lambda$toggleActionBar$127(ValueAnimator valueAnimator) {
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
            arrayList.add(ObjectAnimator.ofFloat(this.selectedPhotosListView, (Property<SelectedPhotosListView, Float>) View.ALPHA, z ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.selectedPhotosListView, (Property<SelectedPhotosListView, Float>) View.TRANSLATION_Y, z ? 0.0f : -AndroidUtilities.dp(10.0f)));
            arrayList.add(ObjectAnimator.ofFloat(this.photosCounterView, (Property<CounterView, Float>) View.ROTATION_X, z ? 1.0f : 0.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            this.currentListViewAnimation = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z) {
                this.currentListViewAnimation.addListener(new AnimatorListenerAdapter() {
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
            boolean zIsPlaying = this.videoPlayer != null ? this.isPlaying : this.photoViewerWebView.isPlaying();
            cancelVideoPlayRunnable();
            AndroidUtilities.cancelRunOnUIThread(this.hideActionBarRunnable);
            if (zIsPlaying) {
                pauseVideoOrWeb();
            } else {
                if (!this.isCurrentVideo) {
                    if (Math.abs(this.videoPlayerSeekbar.getProgress() - this.videoTimelineView.getRightProgress()) < 0.01f || ((videoPlayer = this.videoPlayer) != null && videoPlayer.getCurrentPosition() == this.videoPlayer.getDuration())) {
                        seekVideoOrWebToProgress(0.0f);
                    }
                    scheduleActionBarHide();
                } else if (Math.abs(this.videoTimelineView.getProgress() - this.videoTimelineView.getRightProgress()) < 0.01f || ((videoPlayer2 = this.videoPlayer) != null && videoPlayer2.getCurrentPosition() == this.videoPlayer.getDuration())) {
                    seekVideoOrWebToProgress(this.videoTimelineView.getLeftProgress());
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
            SecureDocument secureDocument = (SecureDocument) this.secureDocuments.get(i);
            return secureDocument.secureFile.dc_id + "_" + secureDocument.secureFile.id + ".jpg";
        }
        if (!this.imagesArrLocations.isEmpty() || !this.imagesArr.isEmpty()) {
            if (!this.imagesArrLocations.isEmpty()) {
                if (i >= this.imagesArrLocations.size()) {
                    return null;
                }
                ImageLocation imageLocation = (ImageLocation) this.imagesArrLocations.get(i);
                ImageLocation imageLocation2 = (ImageLocation) this.imagesArrLocationsVideo.get(i);
                if (imageLocation == null) {
                    return null;
                }
                if (imageLocation2 != null && imageLocation2 != imageLocation) {
                    return imageLocation2.location.volume_id + "_" + imageLocation2.location.local_id + ".mp4";
                }
                return imageLocation.location.volume_id + "_" + imageLocation.location.local_id + ".jpg";
            }
            if (i >= this.imagesArr.size()) {
                return null;
            }
            return FileLoader.getMessageFileName(((MessageObject) this.imagesArr.get(i)).messageOwner);
        }
        if (!this.imagesArrLocals.isEmpty()) {
            if (i >= this.imagesArrLocals.size()) {
                return null;
            }
            Object obj = this.imagesArrLocals.get(i);
            if (obj instanceof MediaController.SearchImage) {
                return ((MediaController.SearchImage) obj).getAttachName();
            }
            if (obj instanceof TLRPC.BotInlineResult) {
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj;
                TLRPC.Document document = botInlineResult.document;
                if (document != null) {
                    return FileLoader.getAttachFileName(document);
                }
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null) {
                    return FileLoader.getAttachFileName(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize()));
                }
                if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Utilities.MD5(botInlineResult.content.url));
                    sb.append(".");
                    TLRPC.WebDocument webDocument = botInlineResult.content;
                    sb.append(ImageLoader.getHttpUrlExtension(webDocument.url, FileLoader.getMimeTypePart(webDocument.mime_type)));
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

    private ImageLocation getImageLocation(int i, long[] jArr) {
        if (i < 0) {
            return null;
        }
        if (!this.secureDocuments.isEmpty()) {
            if (i >= this.secureDocuments.size()) {
                return null;
            }
            if (jArr != null) {
                jArr[0] = ((SecureDocument) this.secureDocuments.get(i)).secureFile.size;
            }
            return ImageLocation.getForSecureDocument((SecureDocument) this.secureDocuments.get(i));
        }
        if (!this.imagesArrLocations.isEmpty()) {
            if (i >= this.imagesArrLocations.size()) {
                return null;
            }
            if (jArr != null && this.imagesArrLocationsSizes.get(i) != null) {
                jArr[0] = ((Long) this.imagesArrLocationsSizes.get(i)).longValue();
            }
            return (ImageLocation) this.imagesArrLocationsVideo.get(i);
        }
        if (this.imagesArr.isEmpty() || i >= this.imagesArr.size()) {
            return null;
        }
        MessageObject messageObject = (MessageObject) this.imagesArr.get(i);
        TLRPC.Message message = messageObject.messageOwner;
        if (message instanceof TLRPC.TL_messageService) {
            if (message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                return null;
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
            if (closestPhotoSizeWithSize != null) {
                if (jArr != null) {
                    long j = closestPhotoSizeWithSize.size;
                    jArr[0] = j;
                    if (j == 0) {
                        jArr[0] = -1;
                    }
                }
                return ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject);
            }
            if (jArr != null) {
                jArr[0] = -1;
            }
        } else {
            TLRPC.MessageMedia messageMedia = messageObject.sponsoredMedia;
            if (messageMedia != null) {
                TLRPC.Document document = messageMedia.document;
                if (document != null) {
                    return ImageLocation.getForDocument(document);
                }
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize(), false, null, true);
                    if (closestPhotoSizeWithSize2 != null) {
                        if (jArr != null) {
                            long j2 = closestPhotoSizeWithSize2.size;
                            jArr[0] = j2;
                            if (j2 == 0) {
                                jArr[0] = -1;
                            }
                        }
                        return ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.sponsoredMedia.photo);
                    }
                    if (jArr != null) {
                        jArr[0] = -1;
                    }
                }
            } else if (((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) && MessageObject.getMedia(messageObject.messageOwner).photo != null) || ((MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(messageObject.messageOwner).webpage != null)) {
                if (messageObject.isGif()) {
                    return ImageLocation.getForDocument(messageObject.getDocument());
                }
                TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize(true), false, null, true);
                if (closestPhotoSizeWithSize3 != null) {
                    if (jArr != null) {
                        long j3 = closestPhotoSizeWithSize3.size;
                        jArr[0] = j3;
                        if (j3 == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject);
                }
                if (jArr != null) {
                    jArr[0] = -1;
                }
            } else {
                if (MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC.TL_messageMediaInvoice) {
                    return ImageLocation.getForWebFile(WebFile.createWithWebDocument(((TLRPC.TL_messageMediaInvoice) MessageObject.getMedia(messageObject.messageOwner)).webPhoto));
                }
                if (messageObject.getDocument() != null) {
                    TLRPC.Document document2 = messageObject.getDocument();
                    if (this.sharedMediaType == 5) {
                        return ImageLocation.getForDocument(document2);
                    }
                    if (MessageObject.isDocumentHasThumb(messageObject.getDocument())) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(document2.thumbs, 90);
                        if (jArr != null) {
                            long j4 = closestPhotoSizeWithSize4.size;
                            jArr[0] = j4;
                            if (j4 == 0) {
                                jArr[0] = -1;
                            }
                        }
                        return ImageLocation.getForDocument(closestPhotoSizeWithSize4, document2);
                    }
                }
            }
        }
        return null;
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
                jArr[0] = ((SecureDocument) this.secureDocuments.get(i)).secureFile.size;
            }
            return (TLObject) this.secureDocuments.get(i);
        }
        if (!this.imagesArrLocations.isEmpty()) {
            if (i >= this.imagesArrLocations.size()) {
                return null;
            }
            if (jArr != null && this.imagesArrLocationsSizes.get(i) != null) {
                jArr[0] = ((Long) this.imagesArrLocationsSizes.get(i)).longValue();
            }
            if (this.imagesArrLocationsVideo.get(i) != null) {
                return ((ImageLocation) this.imagesArrLocationsVideo.get(i)).location;
            }
            return null;
        }
        if (this.imagesArr.isEmpty() || i >= this.imagesArr.size()) {
            return null;
        }
        MessageObject messageObject = (MessageObject) this.imagesArr.get(i);
        TLRPC.Message message = messageObject.messageOwner;
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                return messageAction.newUserPhoto.photo_big;
            }
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
            if (closestPhotoSizeWithSize != null) {
                if (jArr != null) {
                    long j = closestPhotoSizeWithSize.size;
                    jArr[0] = j;
                    if (j == 0) {
                        jArr[0] = -1;
                    }
                }
                return closestPhotoSizeWithSize;
            }
            if (jArr != null) {
                jArr[0] = -1;
            }
        } else {
            TLRPC.MessageMedia messageMedia = messageObject.sponsoredMedia;
            if (messageMedia != null) {
                TLRPC.Document document = messageMedia.document;
                if (document != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                    if (jArr != null) {
                        long j2 = closestPhotoSizeWithSize2.size;
                        jArr[0] = j2;
                        if (j2 == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return closestPhotoSizeWithSize2;
                }
                TLRPC.Photo photo = messageMedia.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize(), false, null, true);
                    if (closestPhotoSizeWithSize3 != null) {
                        if (jArr != null) {
                            long j3 = closestPhotoSizeWithSize3.size;
                            jArr[0] = j3;
                            if (j3 == 0) {
                                jArr[0] = -1;
                            }
                        }
                        return closestPhotoSizeWithSize3;
                    }
                    if (jArr != null) {
                        jArr[0] = -1;
                    }
                }
            } else if (((MessageObject.getMedia(message) instanceof TLRPC.TL_messageMediaPhoto) && MessageObject.getMedia(messageObject.messageOwner).photo != null) || ((MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(messageObject.messageOwner).webpage != null)) {
                TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize(true), false, null, true);
                if (closestPhotoSizeWithSize4 != null) {
                    if (jArr != null) {
                        long j4 = closestPhotoSizeWithSize4.size;
                        jArr[0] = j4;
                        if (j4 == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return closestPhotoSizeWithSize4;
                }
                if (jArr != null) {
                    jArr[0] = -1;
                }
            } else {
                if (MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC.TL_messageMediaInvoice) {
                    return ((TLRPC.TL_messageMediaInvoice) MessageObject.getMedia(messageObject.messageOwner)).photo;
                }
                if (messageObject.getDocument() != null && MessageObject.isDocumentHasThumb(messageObject.getDocument())) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize5 = FileLoader.getClosestPhotoSizeWithSize(messageObject.getDocument().thumbs, 90);
                    if (jArr != null) {
                        long j5 = closestPhotoSizeWithSize5.size;
                        jArr[0] = j5;
                        if (j5 == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return closestPhotoSizeWithSize5;
                }
            }
        }
        return null;
    }

    public void updateSelectedCount() {
        MessageObject messageObject;
        PhotoViewerProvider photoViewerProvider = this.placeProvider;
        if (photoViewerProvider == null) {
            return;
        }
        int selectedCount = photoViewerProvider.getSelectedCount();
        this.photosCounterView.setCount(selectedCount);
        if (selectedCount == 0) {
            togglePhotosListView(false, true);
        }
        if (this.pickerViewSendButton != null) {
            PhotoViewerProvider photoViewerProvider2 = this.placeProvider;
            long dialogId = photoViewerProvider2 != null ? photoViewerProvider2.getDialogId() : 0L;
            if (dialogId == 0 && (messageObject = this.currentMessageObject) != null) {
                dialogId = messageObject.getDialogId();
            }
            ChatActivityEnterView.SendButton sendButton = this.pickerViewSendButton;
            PhotoViewerProvider photoViewerProvider3 = this.placeProvider;
            long sendPaidMessagesStars = (photoViewerProvider3 == null || !photoViewerProvider3.isEditingMessage() || this.placeProvider.isEditingMessageResend()) ? MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(dialogId) : 0L;
            PhotoViewerProvider photoViewerProvider4 = this.placeProvider;
            sendButton.setStarsPrice(sendPaidMessagesStars, Math.max(1, photoViewerProvider4 == null ? 1 : photoViewerProvider4.getSelectedCount()));
        }
    }

    public boolean isCurrentAvatarSet() {
        int i;
        if (this.currentAvatarLocation != null && (i = this.currentIndex) >= 0 && i < this.avatarsArr.size()) {
            TLRPC.Photo photo = (TLRPC.Photo) this.avatarsArr.get(this.currentIndex);
            ImageLocation imageLocation = (ImageLocation) this.imagesArrLocations.get(this.currentIndex);
            if (photo instanceof TLRPC.TL_photoEmpty) {
                photo = null;
            }
            if (photo != null) {
                int size = photo.sizes.size();
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC.FileLocation fileLocation = photo.sizes.get(i2).location;
                    if (fileLocation != null) {
                        int i3 = fileLocation.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = this.currentAvatarLocation.location;
                        if (i3 == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                            return true;
                        }
                    }
                }
            } else if (imageLocation != null) {
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = imageLocation.location;
                int i4 = tL_fileLocationToBeDeprecated2.local_id;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = this.currentAvatarLocation.location;
                if (i4 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated2.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
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
        Boolean bool = (Boolean) this.actionBarItemsVisibility.get(view);
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
                        this.f$0.lambda$setItemVisible$128(valueAnimator);
                    }
                }).setInterpolator(new LinearInterpolator()).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$setItemVisible$129(z, view);
                    }
                }).start();
            } else {
                view.setVisibility(z ? 0 : 8);
                view.setAlpha(f2);
                updateActionBarTitlePadding();
            }
        }
    }

    public void lambda$setItemVisible$128(ValueAnimator valueAnimator) {
        updateActionBarTitlePadding();
    }

    public void lambda$setItemVisible$129(boolean z, View view) {
        if (!z) {
            view.setVisibility(8);
        }
        updateActionBarTitlePadding();
    }

    public void onPhotoShow(org.telegram.messenger.MessageObject r20, org.telegram.tgnet.TLRPC.FileLocation r21, org.telegram.messenger.ImageLocation r22, org.telegram.messenger.ImageLocation r23, java.util.ArrayList r24, java.util.ArrayList r25, java.util.List r26, int r27, org.telegram.ui.PhotoViewer.PlaceProviderObject r28) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.onPhotoShow(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.ImageLocation, org.telegram.messenger.ImageLocation, java.util.ArrayList, java.util.ArrayList, java.util.List, int, org.telegram.ui.PhotoViewer$PlaceProviderObject):void");
    }

    public static int lambda$onPhotoShow$130(MessageObject messageObject, MessageObject messageObject2) {
        return messageObject.getId() - messageObject2.getId();
    }

    private boolean canSendMediaToParentChatActivity() {
        TLRPC.Chat chat;
        ChatActivity chatActivity = this.parentChatActivity;
        return (chatActivity == null || (chatActivity.currentUser == null && ((chat = chatActivity.currentChat) == null || ChatObject.isNotInChat(chat) || (!ChatObject.canSendPhoto(this.parentChatActivity.currentChat) && !ChatObject.canSendVideo(this.parentChatActivity.currentChat))))) ? false : true;
    }

    private void setDoubleTapEnabled(boolean z) {
        this.doubleTapEnabled = z;
        this.gestureDetector.setOnDoubleTapListener(z ? this : null);
    }

    public void setImages() throws Resources.NotFoundException {
        if (this.animationInProgress == 0) {
            setIndexToImage(this.centerImage, this.currentIndex, null);
            setIndexToPaintingOverlay(this.currentIndex, this.paintingOverlay);
            setIndexToImage(this.rightImage, this.currentIndex + 1, this.rightCropTransform);
            setIndexToPaintingOverlay(this.currentIndex + 1, this.rightPaintingOverlay);
            setIndexToImage(this.leftImage, this.currentIndex - 1, this.leftCropTransform);
            setIndexToPaintingOverlay(this.currentIndex - 1, this.leftPaintingOverlay);
        }
    }

    private void setIsAboutToSwitchToIndex(int i, boolean z, boolean z2) {
        setIsAboutToSwitchToIndex(i, z, z2, false);
    }

    public void setIsAboutToSwitchToIndex(final int r43, boolean r44, boolean r45, boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.setIsAboutToSwitchToIndex(int, boolean, boolean, boolean):void");
    }

    public void lambda$setIsAboutToSwitchToIndex$131(int i, TranslateController translateController, MessageObject messageObject, String str) {
        if (i != this.switchingToIndex) {
            return;
        }
        this.captionDetectedLanguage = str;
        if (translateController.isContextTranslateEnabled() && translateController.canTranslatePhoto(messageObject, this.captionDetectedLanguage)) {
            if (this.captionTranslated) {
                this.menuItem.showSubItem(20);
                this.menuItem.hideSubItem(19);
                return;
            } else {
                this.menuItem.showSubItem(19);
                this.menuItem.hideSubItem(20);
                return;
            }
        }
        this.menuItem.hideSubItem(19);
        this.menuItem.hideSubItem(20);
    }

    private void checkActionBarStyle() {
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            actionBarMenu.setTranslationX(this.sendPhotoTypeIsPollMediaEdit ? -AndroidUtilities.dp(4.0f) : 0.0f);
        }
        ActionBarMenuItem actionBarMenuItem = this.deleteItem;
        if (actionBarMenuItem != null) {
            setItemVisible(actionBarMenuItem, this.sendPhotoTypeIsPollMediaEdit, false);
        }
        boolean z = this.sendPhotoTypeIsPollMedia;
        if (z && this.actionBarBackButtonDrawableGlass == null) {
            this.actionBarBackButtonDrawableGlass = Blur3Utils.wrapCenteredDrawable(this.iBlur3FactoryFrostedLiquidGlass.create(this.actionBarBackButton).setColorProvider(BlurredBackgroundProviderImpl.photoViewer(this.resourcesProvider)).setRadius(AndroidUtilities.dp(20.0f)).setPadding(AndroidUtilities.dp(7.0f)), AndroidUtilities.dp(54.0f), AndroidUtilities.dp(54.0f));
        }
        if (z) {
            ScaleStateListAnimator.apply(this.actionBarBackButton);
            this.actionBarBackButton.setBackground(this.actionBarBackButtonDrawableGlass);
        } else {
            this.actionBarBackButton.setStateListAnimator(null);
            this.actionBarBackButton.setBackground(this.actionBarBackButtonDrawableDeafult);
        }
    }

    public void updateCaptionTranslated() {
        int i;
        MessageObject messageObject;
        TLRPC.Message message;
        if (this.imagesArr.isEmpty() || (i = this.switchingToIndex) < 0 || i >= this.imagesArr.size() || (messageObject = (MessageObject) this.imagesArr.get(this.switchingToIndex)) == null) {
            return;
        }
        if (this.captionTranslated && (message = messageObject.messageOwner) != null && message.translatedText != null && TextUtils.equals(message.translatedToLanguage, TranslateAlert2.getToLanguage())) {
            setCurrentCaption(messageObject, postProcessTranslated(messageObject), false, true);
        } else {
            setCurrentCaption(messageObject, messageObject.caption, this.captionTranslated, true);
        }
    }

    private CharSequence postProcessTranslated(MessageObject messageObject) {
        if (messageObject == null || messageObject.messageOwner == null) {
            return "";
        }
        Spannable spannableReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(messageObject.messageOwner.translatedText.text), Theme.chat_msgTextPaint.getFontMetricsInt(), false), messageObject.messageOwner.translatedText.entities, Theme.chat_msgTextPaint.getFontMetricsInt(), false);
        if (MessageObject.containsUrls(spannableReplaceAnimatedEmoji)) {
            try {
                AndroidUtilities.addLinksSafe(spannableReplaceAnimatedEmoji, 5, false, true);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        MessageObject.addUrlsByPattern(messageObject.isOutOwner(), spannableReplaceAnimatedEmoji, true, 0, 0, true);
        MessageObject.addEntitiesToText(spannableReplaceAnimatedEmoji, messageObject.messageOwner.translatedText.entities, messageObject.isOutOwner(), true, true, true);
        if (messageObject.isVideo()) {
            MessageObject.addUrlsByPattern(messageObject.isOutOwner(), spannableReplaceAnimatedEmoji, true, 3, (int) messageObject.getDuration(), false);
        } else if (messageObject.isMusic() || messageObject.isVoice()) {
            MessageObject.addUrlsByPattern(messageObject.isOutOwner(), spannableReplaceAnimatedEmoji, true, 4, (int) messageObject.getDuration(), false);
        }
        return spannableReplaceAnimatedEmoji;
    }

    public TLRPC.Document getOriginalSticker() {
        int i;
        if (this.translationX == 0.0f && this.translationY == 0.0f && (i = this.currentIndex) >= 0 && i < this.imagesArrLocals.size()) {
            Object obj = this.imagesArrLocals.get(this.currentIndex);
            if (!(obj instanceof MediaController.MediaEditState)) {
                return null;
            }
            MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) obj;
            if (!mediaEditState.isPainted && !mediaEditState.isCropped && !mediaEditState.isFiltered) {
                return this.originalSticker;
            }
        }
        return null;
    }

    public void enableStickerMode(TLRPC.Document document, TLRPC.Document document2, boolean z, Utilities.Callback2 callback2) {
        this.originalSticker = document;
        this.replacedSticker = document2;
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
            ArrayList arrayList = this.selectedEmojis;
            if (arrayList != null) {
                arrayList.clear();
            }
        }
        if (this.originalSticker != null) {
            ArrayList arrayList2 = this.selectedEmojis;
            if (arrayList2 == null) {
                this.selectedEmojis = new ArrayList();
            } else {
                arrayList2.clear();
            }
            ArrayList<String> arrayListFindStickerEmoticons = MessageObject.findStickerEmoticons(this.originalSticker, Integer.valueOf(this.currentAccount));
            if (arrayListFindStickerEmoticons != null) {
                this.selectedEmojis.addAll(arrayListFindStickerEmoticons);
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
                    this.f$0.lambda$prepareSegmentImage$132((StickerMakerView.SegmentedObject) obj);
                }
            });
        }
    }

    public void lambda$prepareSegmentImage$132(StickerMakerView.SegmentedObject segmentedObject) {
        try {
            boolean z = !TextUtils.isEmpty(((MediaController.MediaEditState) this.imagesArrLocals.get(this.currentIndex)).filterPath);
            this.stickerMakerView.setSegmentedState(true, segmentedObject);
            this.centerImage.setImageBitmap(this.stickerMakerView.getSegmentedImage(this.centerImage.getBitmap(), z, this.centerImage.getOrientation()));
            this.cutOutBtn.setUndoCutState(true);
            showStickerMode(true, true, true);
            this.cutOutBtn.post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.applyCurrentEditMode();
                }
            });
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
        this.undoBtn.setTag(z3 ? num : null);
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
                ViewPropertyAnimator viewPropertyAnimatorScaleY = this.eraseBtn.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                viewPropertyAnimatorScaleY.setInterpolator(cubicBezierInterpolator).setDuration(400L).start();
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
        PhotoViewerProvider photoViewerProvider = this.placeProvider;
        boolean z3 = false;
        boolean z4 = photoViewerProvider != null && photoViewerProvider.isCaptionAbove();
        showEditCaption(this.captionEdit, z && !z4, z2, this.captionEditAlpha);
        CaptionPhotoViewer captionPhotoViewer = this.topCaptionEdit;
        if (z && z4) {
            z3 = true;
        }
        showEditCaption(captionPhotoViewer, z3, z2, this.topCaptionEditAlpha);
    }

    private void showEditCaption(final View view, boolean z, boolean z2, final float[] fArr) {
        PhotoViewerProvider photoViewerProvider = this.placeProvider;
        float fDp = AndroidUtilities.dp((photoViewerProvider == null || !photoViewerProvider.canMoveCaptionAbove()) ? 58.0f : 175.0f) * (view == this.topCaptionEdit ? -1.0f : 1.0f);
        if (!z2) {
            view.animate().setListener(null).cancel();
            view.setVisibility(z ? 0 : 8);
            if (z) {
                fDp = 0.0f;
            }
            view.setTranslationY(fDp);
            float alpha = this.pickerView.getAlpha();
            float f = z ? 1.0f : 0.0f;
            fArr[0] = f;
            view.setAlpha(alpha * f);
        } else if (z && view.getTag() == null) {
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
                view.setAlpha(this.pickerView.getAlpha());
                view.setTranslationY(fDp);
            }
            view.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$showEditCaption$133(view, fArr, valueAnimator);
                }
            }).setDuration(420L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
        } else if (!z && view.getTag() != null) {
            view.animate().translationY(fDp).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$showEditCaption$134(view, fArr, valueAnimator);
                }
            }).setDuration(420L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    view.setVisibility(8);
                }
            }).start();
        }
        view.setTag(z ? 1 : null);
    }

    public void lambda$showEditCaption$133(View view, float[] fArr, ValueAnimator valueAnimator) {
        float alpha = this.pickerView.getAlpha();
        float animatedFraction = valueAnimator.getAnimatedFraction();
        fArr[0] = animatedFraction;
        view.setAlpha(alpha * animatedFraction);
        if (view == this.captionEdit) {
            FrameLayout frameLayout = this.videoTimelineViewContainer;
            if (frameLayout != null) {
                frameLayout.setTranslationY(this.pickerView.getTranslationY() - (Math.max(0, this.captionEdit.getEditTextHeight() - AndroidUtilities.dp(46.0f)) * this.captionEdit.getAlpha()));
            }
            this.muteButton.setTranslationY((-Math.max(0, this.captionEdit.getEditTextHeight() - AndroidUtilities.dp(46.0f))) * this.captionEdit.getAlpha());
            this.livePhotoButton.setTranslationY((-Math.max(0, this.captionEdit.getEditTextHeight() - AndroidUtilities.dp(46.0f))) * this.captionEdit.getAlpha());
            this.editCoverButton.setTranslationY((-Math.max(0, this.captionEdit.getEditTextHeight() - AndroidUtilities.dp(46.0f))) * this.captionEdit.getAlpha());
        }
        invalidateBlur();
    }

    public void lambda$showEditCaption$134(View view, float[] fArr, ValueAnimator valueAnimator) {
        float alpha = this.pickerView.getAlpha();
        float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
        fArr[0] = animatedFraction;
        view.setAlpha(alpha * animatedFraction);
        if (view == this.captionEdit) {
            FrameLayout frameLayout = this.videoTimelineViewContainer;
            if (frameLayout != null) {
                frameLayout.setTranslationY(this.pickerView.getTranslationY() - (Math.max(0, this.captionEdit.getEditTextHeight() - AndroidUtilities.dp(46.0f)) * this.captionEdit.getAlpha()));
            }
            this.muteButton.setTranslationY((-Math.max(0, this.captionEdit.getEditTextHeight() - AndroidUtilities.dp(46.0f))) * this.captionEdit.getAlpha());
            this.livePhotoButton.setTranslationY((-Math.max(0, this.captionEdit.getEditTextHeight() - AndroidUtilities.dp(46.0f))) * this.captionEdit.getAlpha());
            this.editCoverButton.setTranslationY((-Math.max(0, this.captionEdit.getEditTextHeight() - AndroidUtilities.dp(46.0f))) * this.captionEdit.getAlpha());
        }
        invalidateBlur();
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
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(videoTimelinePlayView, (Property<VideoTimelinePlayView, Float>) View.TRANSLATION_Y, videoTimelinePlayView.getTranslationY(), 0.0f);
            this.videoTimelineAnimator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(220L);
            this.videoTimelineAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.videoTimelineAnimator.start();
        } else if (!z && this.videoTimelineViewContainer.getTag() != null) {
            ObjectAnimator objectAnimator2 = this.videoTimelineAnimator;
            if (objectAnimator2 != null) {
                objectAnimator2.removeAllListeners();
                this.videoTimelineAnimator.cancel();
            }
            VideoTimelinePlayView videoTimelinePlayView2 = this.videoTimelineView;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(videoTimelinePlayView2, (Property<VideoTimelinePlayView, Float>) View.TRANSLATION_Y, videoTimelinePlayView2.getTranslationY(), AndroidUtilities.dp(58.0f));
            this.videoTimelineAnimator = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.addListener(new HideViewAfterAnimation(this.videoTimelineViewContainer));
            this.videoTimelineAnimator.setDuration(220L);
            this.videoTimelineAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.videoTimelineAnimator.start();
        }
        FrameLayout frameLayout = this.videoTimelineViewContainer;
        if (frameLayout != null && frameLayout.getVisibility() != 8) {
            this.videoTimelineViewContainer.setTranslationY(this.pickerView.getTranslationY() - (Math.max(0, this.captionEdit.getEditTextHeight() - AndroidUtilities.dp(46.0f)) * this.captionEdit.getAlpha()));
        }
        this.videoTimelineViewContainer.setTag(z ? 1 : null);
    }

    public static TLRPC.FileLocation getFileLocation(ImageLocation imageLocation) {
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

    public void setImageIndex(int i) throws Resources.NotFoundException, NumberFormatException {
        setImageIndex(i, true, false);
    }

    private void setImageIndex(int i, boolean z, boolean z2) throws Resources.NotFoundException, NumberFormatException {
        setImageIndex(i, z, z2, false);
    }

    private void setImageIndex(int r38, boolean r39, boolean r40, boolean r41) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.setImageIndex(int, boolean, boolean, boolean):void");
    }

    public void lambda$setImageIndex$136() {
        if (this.ads.isPopupShown()) {
            VideoAds videoAds = this.ads;
            VideoPlayer videoPlayer = this.videoPlayer;
            videoAds.videoWasPlaying = videoPlayer == null ? true : videoPlayer.isPlaying();
            VideoPlayer videoPlayer2 = this.videoPlayer;
            if (videoPlayer2 != null) {
                videoPlayer2.pause();
                return;
            }
            return;
        }
        VideoPlayer videoPlayer3 = this.videoPlayer;
        if (videoPlayer3 == null || !this.ads.videoWasPlaying) {
            return;
        }
        videoPlayer3.play();
    }

    private void resetIndexForDeferredImageLoading() throws Resources.NotFoundException {
        Object mark = this.centerImage.getMark();
        if (mark == null || !mark.equals(1)) {
            return;
        }
        setIndexToImage(this.centerImage, this.currentIndex, null);
    }

    private void setCurrentCaption(MessageObject messageObject, CharSequence charSequence, boolean z, boolean z2) {
        int i;
        boolean z3;
        TLRPC.Message message;
        CharSequence charSequenceCloneSpans = AnimatedEmojiSpan.cloneSpans(charSequence, 3);
        showEditCaption(this.editing, z2);
        if (!this.editing) {
            if (this.sendPhotoType != 1) {
                this.captionEdit.setVisibility(8);
                this.topCaptionEdit.setVisibility(8);
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
                            @Override
                            protected boolean isStatusBarVisible() {
                                return !PhotoViewer.this.inBubbleMode;
                            }

                            @Override
                            public void invalidate() {
                                super.invalidate();
                                if (PhotoViewer.this.isActionBarVisible) {
                                    int scrollY = getScrollY();
                                    float translationY = PhotoViewer.this.captionTextViewSwitcher.getTranslationY();
                                    boolean z4 = scrollY == 0 && translationY == 0.0f;
                                    boolean z5 = scrollY == 0 && translationY == 0.0f;
                                    if (!z4) {
                                        int y = PhotoViewer.this.photoProgressViews[0].getY() + PhotoViewer.this.photoProgressViews[0].size;
                                        int top = (((PhotoViewer.this.captionContainer.getTop() + ((int) translationY)) - scrollY) + ((isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0) + ActionBar.getCurrentActionBarHeight())) - AndroidUtilities.dp(12.0f);
                                        z5 = top > ((int) PhotoViewer.this.fullscreenButton[0].getY()) + AndroidUtilities.dp(32.0f);
                                        z4 = top > y;
                                    }
                                    if (PhotoViewer.this.allowShowFullscreenButton) {
                                        if (PhotoViewer.this.fullscreenButton[0].getTag() == null || ((Integer) PhotoViewer.this.fullscreenButton[0].getTag()).intValue() != 3 || !z5) {
                                            if (PhotoViewer.this.fullscreenButton[0].getTag() == null && !z5) {
                                                PhotoViewer.this.fullscreenButton[0].setTag(3);
                                                PhotoViewer.this.fullscreenButton[0].animate().alpha(0.0f).setListener(null).setDuration(150L).start();
                                            }
                                        } else {
                                            PhotoViewer.this.fullscreenButton[0].setTag(2);
                                            PhotoViewer.this.fullscreenButton[0].animate().alpha(1.0f).setDuration(150L).setListener(new AnimatorListenerAdapter() {
                                                @Override
                                                public void onAnimationEnd(Animator animator) {
                                                    PhotoViewer.this.fullscreenButton[0].setTag(null);
                                                }
                                            }).start();
                                        }
                                    }
                                    PhotoViewer.this.photoProgressViews[0].setIndexedAlpha(2, z4 ? 1.0f : 0.0f, true);
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
                    if (messageObject != null && messageObject.isSponsored()) {
                        createAdButtonView();
                        AndroidUtilities.removeFromParent(this.adButtonView);
                        this.adButtonTextView.setText(messageObject.sponsoredButtonText);
                        this.captionContainer.addView(this.adButtonView, LayoutHelper.createFrame(-1, 44.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
                        this.captionTextViewSwitcher.setPadding(0, 0, 0, AndroidUtilities.dp(64.0f));
                        this.adButtonView.bringToFront();
                    } else {
                        FrameLayout frameLayout3 = this.adButtonView;
                        if (frameLayout3 != null) {
                            AndroidUtilities.removeFromParent(frameLayout3);
                            this.captionTextViewSwitcher.setPadding(0, 0, 0, 0);
                        }
                    }
                }
                boolean zIsEmpty = TextUtils.isEmpty(charSequenceCloneSpans);
                boolean zIsEmpty2 = TextUtils.isEmpty(this.captionTextViewSwitcher.getCurrentView().getText());
                TextView nextView = z2 ? this.captionTextViewSwitcher.getNextView() : this.captionTextViewSwitcher.getCurrentView();
                if (this.isCurrentVideo) {
                    if (nextView.getMaxLines() != 1) {
                        this.captionTextViewSwitcher.getCurrentView().setMaxLines(1);
                        this.captionTextViewSwitcher.getNextView().setMaxLines(1);
                        this.captionTextViewSwitcher.getCurrentView().setSingleLine(true);
                        this.captionTextViewSwitcher.getNextView().setSingleLine(true);
                        TextView currentView = this.captionTextViewSwitcher.getCurrentView();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        currentView.setEllipsize(truncateAt);
                        this.captionTextViewSwitcher.getNextView().setEllipsize(truncateAt);
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
                        i = Integer.MAX_VALUE;
                    }
                    if (maxLines != i) {
                        this.captionTextViewSwitcher.getCurrentView().setMaxLines(i);
                        this.captionTextViewSwitcher.getNextView().setMaxLines(i);
                        this.captionTextViewSwitcher.getCurrentView().setEllipsize(null);
                        this.captionTextViewSwitcher.getNextView().setEllipsize(null);
                    }
                }
                nextView.setScrollX(0);
                boolean z4 = this.needCaptionLayout;
                this.dontChangeCaptionPosition = !z4 && z2 && zIsEmpty;
                if (!z4) {
                    this.captionScrollView.dontChangeTopMargin = false;
                }
                if (z2) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        TransitionManager.endTransitions(z4 ? this.pickerView : this.captionScrollView);
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
                        TransitionSet duration = new TransitionSet().addTransition(new AnonymousClass76(2, zIsEmpty2, zIsEmpty)).addTransition(new AnonymousClass75(1, zIsEmpty2, zIsEmpty)).setDuration(200L);
                        if (!zIsEmpty2) {
                            this.captionScrollView.dontChangeTopMargin = true;
                            duration.addTransition(new AnonymousClass77());
                        }
                        if (zIsEmpty2 && !zIsEmpty) {
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
                if (!zIsEmpty) {
                    Theme.createChatResources(null, true);
                    if (messageObject == null || !this.captionTranslated || (message = messageObject.messageOwner) == null || message.translatedText == null || !TextUtils.equals(message.translatedToLanguage, TranslateAlert2.getToLanguage())) {
                        if (messageObject != null && !messageObject.messageOwner.entities.isEmpty()) {
                            SpannableString spannableString = new SpannableString(charSequenceCloneSpans);
                            messageObject.addEntitiesToText(spannableString, true, false);
                            if (messageObject.isVideo()) {
                                MessageObject.addUrlsByPattern(messageObject.isOutOwner(), spannableString, false, 3, (int) messageObject.getDuration(), false);
                            }
                            charSequenceCloneSpans = Emoji.replaceEmoji(spannableString, nextView.getPaint().getFontMetricsInt(), false);
                        } else {
                            charSequenceCloneSpans = Emoji.replaceEmoji(new SpannableStringBuilder(charSequenceCloneSpans), nextView.getPaint().getFontMetricsInt(), false);
                        }
                    }
                    if (messageObject != null && messageObject.isSponsored()) {
                        charSequenceCloneSpans = sponsoredCaption(messageObject, charSequenceCloneSpans);
                    }
                    this.captionTextViewSwitcher.setTag(charSequenceCloneSpans);
                    try {
                        this.captionTextViewSwitcher.setText(charSequenceCloneSpans, z2, this.lastCaptionTranslating != z);
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
                } else if (this.needCaptionLayout) {
                    this.captionTextViewSwitcher.setText(LocaleController.getString("AddCaption", R.string.AddCaption), z2);
                    this.captionTextViewSwitcher.getCurrentView().setTextColor(-1291845633);
                    this.captionTextViewSwitcher.setTag("empty");
                    this.captionTextViewSwitcher.setVisibility(0);
                } else {
                    this.captionTextViewSwitcher.setText(null, z2);
                    this.captionTextViewSwitcher.getCurrentView().setTextColor(-1);
                    this.captionTextViewSwitcher.setVisibility(4, !z3 || zIsEmpty2);
                    this.captionTextViewSwitcher.setTag(null);
                }
                if (this.captionTextViewSwitcher.getCurrentView() instanceof CaptionTextView) {
                    ((CaptionTextView) this.captionTextViewSwitcher.getCurrentView()).setLoading(z);
                }
                this.lastCaptionTranslating = !zIsEmpty && z;
                return;
            }
        }
        getCaptionView().setText(charSequenceCloneSpans);
        this.captionTextViewSwitcher.setVisibility(8);
    }

    class AnonymousClass76 extends Fade {
        final boolean val$isCaptionEmpty;
        final boolean val$isCurrentCaptionEmpty;

        AnonymousClass76(int i, boolean z, boolean z2) {
            super(i);
            this.val$isCurrentCaptionEmpty = z;
            this.val$isCaptionEmpty = z2;
        }

        @Override
        public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
            Animator animatorOnDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
            if (!this.val$isCurrentCaptionEmpty && this.val$isCaptionEmpty && view == PhotoViewer.this.captionTextViewSwitcher) {
                animatorOnDisappear.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PhotoViewer.this.captionScrollView.setVisibility(4);
                        PhotoViewer.this.captionScrollView.backgroundAlpha = 1.0f;
                    }
                });
                ((ObjectAnimator) animatorOnDisappear).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f$0.lambda$onDisappear$0(valueAnimator);
                    }
                });
            }
            return animatorOnDisappear;
        }

        public void lambda$onDisappear$0(ValueAnimator valueAnimator) {
            PhotoViewer.this.captionScrollView.backgroundAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            PhotoViewer.this.captionScrollView.invalidate();
        }
    }

    class AnonymousClass75 extends Fade {
        final boolean val$isCaptionEmpty;
        final boolean val$isCurrentCaptionEmpty;

        AnonymousClass75(int i, boolean z, boolean z2) {
            super(i);
            this.val$isCurrentCaptionEmpty = z;
            this.val$isCaptionEmpty = z2;
        }

        @Override
        public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
            Animator animatorOnAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
            if (this.val$isCurrentCaptionEmpty && !this.val$isCaptionEmpty && view == PhotoViewer.this.captionTextViewSwitcher) {
                animatorOnAppear.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PhotoViewer.this.captionScrollView.backgroundAlpha = 1.0f;
                    }
                });
                ((ObjectAnimator) animatorOnAppear).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f$0.lambda$onAppear$0(valueAnimator);
                    }
                });
            }
            return animatorOnAppear;
        }

        public void lambda$onAppear$0(ValueAnimator valueAnimator) {
            PhotoViewer.this.captionScrollView.backgroundAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            PhotoViewer.this.captionScrollView.invalidate();
        }
    }

    class AnonymousClass77 extends Transition {
        AnonymousClass77() {
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
            int iIntValue;
            if (transitionValues.view != PhotoViewer.this.captionScrollView) {
                if (transitionValues2.view != PhotoViewer.this.captionTextViewSwitcher || (iIntValue = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                    return null;
                }
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(PhotoViewer.this.captionTextViewSwitcher, (Property<CaptionTextViewSwitcher, Float>) View.TRANSLATION_Y, 0.0f, iIntValue);
                objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PhotoViewer.this.captionTextViewSwitcher.setTranslationY(0.0f);
                    }
                });
                return objectAnimatorOfFloat;
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
            valueAnimatorOfInt.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    PhotoViewer.this.captionTextViewSwitcher.getNextView().setText((CharSequence) null);
                    PhotoViewer.this.captionScrollView.applyPendingTopMargin();
                }

                @Override
                public void onAnimationStart(Animator animator) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    PhotoViewer.this.captionScrollView.stopScrolling();
                }
            });
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$createAnimator$0(valueAnimator);
                }
            });
            return valueAnimatorOfInt;
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
        boolean z3;
        boolean z4;
        FileLoader.FileResolver fileResolver;
        MessageObject messageObject;
        File file;
        boolean zShouldIndexAutoPlayed;
        File pathToAttach;
        File pathToAttach2;
        File file2;
        boolean z5;
        AnimatedFileDrawable animatedFileDrawable;
        int i2 = this.currentIndex;
        int i3 = i == 1 ? i2 + 1 : i == 2 ? i2 - 1 : i2;
        if (this.currentFileNames[i] != null) {
            boolean zHasBitmap = (i == 0 && i2 == 0 && (animatedFileDrawable = this.currentAnimation) != null) ? animatedFileDrawable.hasBitmap() : false;
            File file3 = null;
            if (this.currentMessageObject != null) {
                if (i3 < 0 || i3 >= this.imagesArr.size()) {
                    this.photoProgressViews[i].setBackgroundState(-1, z2, true);
                    return;
                }
                MessageObject messageObject2 = (MessageObject) this.imagesArr.get(i3);
                zShouldIndexAutoPlayed = shouldMessageObjectAutoPlayed(messageObject2);
                if (this.sharedMediaType == 1 && !messageObject2.canPreviewDocument()) {
                    this.photoProgressViews[i].setBackgroundState(-1, z2, true);
                    return;
                }
                file = !TextUtils.isEmpty(messageObject2.messageOwner.attachPath) ? new File(messageObject2.messageOwner.attachPath) : null;
                if ((MessageObject.getMedia(messageObject2.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(messageObject2.messageOwner).webpage != null && MessageObject.getMedia(messageObject2.messageOwner).webpage.document == null) {
                    final TLObject fileLocation = getFileLocation(i3, null);
                    fileResolver = new FileLoader.FileResolver() {
                        @Override
                        public final File getFile() {
                            return this.f$0.lambda$checkProgress$137(fileLocation);
                        }
                    };
                } else {
                    final TLRPC.Message message = messageObject2.messageOwner;
                    fileResolver = new FileLoader.FileResolver() {
                        @Override
                        public final File getFile() {
                            return this.f$0.lambda$checkProgress$138(message);
                        }
                    };
                }
                if (messageObject2.isVideo()) {
                    messageObject = messageObject2;
                    z4 = (SharedConfig.streamMedia && messageObject2.canStreamVideo() && !DialogObject.isEncryptedDialog(messageObject2.getDialogId())) || messageObject2.hasVideoQualities();
                    z3 = true;
                } else {
                    messageObject = messageObject2;
                    z4 = false;
                    z3 = false;
                }
            } else if (this.currentBotInlineResult != null) {
                if (i3 < 0 || i3 >= this.imagesArrLocals.size()) {
                    this.photoProgressViews[i].setBackgroundState(-1, z2, true);
                    return;
                }
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.imagesArrLocals.get(i3);
                if (botInlineResult.type.equals("video") || MessageObject.isVideoDocument(botInlineResult.document)) {
                    if (botInlineResult.document != null) {
                        file2 = FileLoader.getInstance(this.currentAccount).getPathToAttach(botInlineResult.document);
                    } else if (botInlineResult.content instanceof TLRPC.TL_webDocument) {
                        file2 = new File(FileLoader.getDirectory(4), Utilities.MD5(botInlineResult.content.url) + "." + ImageLoader.getHttpUrlExtension(botInlineResult.content.url, "mp4"));
                    } else {
                        file2 = null;
                    }
                    z5 = true;
                } else {
                    if (botInlineResult.document != null) {
                        file2 = new File(FileLoader.getDirectory(3), this.currentFileNames[i]);
                    } else {
                        file2 = botInlineResult.photo != null ? new File(FileLoader.getDirectory(0), this.currentFileNames[i]) : null;
                    }
                    z5 = false;
                }
                file = file2;
                z3 = z5;
                fileResolver = null;
                messageObject = null;
                z4 = false;
                file3 = new File(FileLoader.getDirectory(4), this.currentFileNames[i]);
                zShouldIndexAutoPlayed = false;
            } else if (this.currentFileLocation != null) {
                if (i3 < 0 || i3 >= this.imagesArrLocationsVideo.size()) {
                    this.photoProgressViews[i].setBackgroundState(-1, z2, true);
                    return;
                }
                ImageLocation imageLocation = (ImageLocation) this.imagesArrLocationsVideo.get(i3);
                if (imageLocation != null) {
                    pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(imageLocation.location, getFileLocationExt(imageLocation), false);
                    pathToAttach2 = FileLoader.getInstance(this.currentAccount).getPathToAttach(imageLocation.location, getFileLocationExt(imageLocation), true);
                    file = pathToAttach;
                    fileResolver = null;
                    messageObject = null;
                    zShouldIndexAutoPlayed = false;
                    z4 = false;
                    z3 = false;
                    file3 = pathToAttach2;
                }
                file = null;
                fileResolver = null;
                messageObject = null;
                zShouldIndexAutoPlayed = false;
                z4 = false;
                z3 = false;
            } else if (this.currentSecureDocument != null) {
                if (i3 < 0 || i3 >= this.secureDocuments.size()) {
                    this.photoProgressViews[i].setBackgroundState(-1, z2, true);
                    return;
                }
                SecureDocument secureDocument = (SecureDocument) this.secureDocuments.get(i3);
                pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(secureDocument, true);
                pathToAttach2 = FileLoader.getInstance(this.currentAccount).getPathToAttach(secureDocument, false);
                file = pathToAttach;
                fileResolver = null;
                messageObject = null;
                zShouldIndexAutoPlayed = false;
                z4 = false;
                z3 = false;
                file3 = pathToAttach2;
            } else if (this.currentPathObject != null) {
                file = new File(FileLoader.getDirectory(3), this.currentFileNames[i]);
                fileResolver = null;
                messageObject = null;
                zShouldIndexAutoPlayed = false;
                z4 = false;
                z3 = false;
                file3 = new File(FileLoader.getDirectory(4), this.currentFileNames[i]);
            } else {
                PageBlocksAdapter pageBlocksAdapter = this.pageBlocksAdapter;
                if (pageBlocksAdapter != null) {
                    File file4 = pageBlocksAdapter.getFile(i3);
                    boolean z6 = this.pageBlocksAdapter.isVideo(i3) || this.pageBlocksAdapter.isHardwarePlayer(i3);
                    z3 = z6;
                    z4 = z6 && SharedConfig.streamMedia && (this.pageBlocksAdapter.getMedia(i3) instanceof TLRPC.Document);
                    fileResolver = null;
                    messageObject = null;
                    file = file4;
                    zShouldIndexAutoPlayed = shouldIndexAutoPlayed(i3);
                }
                file = null;
                fileResolver = null;
                messageObject = null;
                zShouldIndexAutoPlayed = false;
                z4 = false;
                z3 = false;
            }
            boolean z7 = !(i == 0 && this.dontAutoPlay) && zShouldIndexAutoPlayed;
            final boolean z8 = zHasBitmap;
            final File file5 = file;
            final File file6 = file3;
            final FileLoader.FileResolver fileResolver2 = fileResolver;
            final MessageObject messageObject3 = messageObject;
            final boolean z9 = z4;
            final boolean z10 = z3;
            final boolean z11 = z7;
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$checkProgress$140(z8, file5, file6, fileResolver2, i, messageObject3, z9, z10, z11, z2);
                }
            });
            return;
        }
        if (!this.imagesArrLocals.isEmpty() && i3 >= 0 && i3 < this.imagesArrLocals.size()) {
            Object obj = this.imagesArrLocals.get(i3);
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (photoEntry.isVideo && (!photoEntry.isLivePhoto() || (!photoEntry.isUnalivePhoto() && this.sendPhotoType != 11))) {
                    this.photoProgressViews[i].setBackgroundState(3, z2, true);
                    return;
                }
            }
        }
        this.photoProgressViews[i].setBackgroundState(-1, z2, true);
    }

    public File lambda$checkProgress$137(TLObject tLObject) {
        return FileLoader.getInstance(this.currentAccount).getPathToAttach(tLObject, true);
    }

    public File lambda$checkProgress$138(TLRPC.Message message) {
        return FileLoader.getInstance(this.currentAccount).getPathToMessage(message);
    }

    public void lambda$checkProgress$140(boolean z, final File file, File file2, FileLoader.FileResolver fileResolver, final int i, MessageObject messageObject, final boolean z2, final boolean z3, final boolean z4, final boolean z5) {
        final File file3;
        ChatActivity chatActivity;
        TLRPC.Document document;
        boolean zExists = (z || file == null) ? z : file.exists();
        if (file2 == null && fileResolver != null) {
            file3 = fileResolver.getFile();
        } else {
            file = fileResolver != null ? fileResolver.getFile() : null;
            file3 = file2;
        }
        if (!zExists && file3 != null) {
            zExists = file3.exists();
        }
        if (!zExists && file != null) {
            zExists = file.exists();
        }
        final boolean z6 = zExists;
        if (!z6 && i != 0 && messageObject != null && z2 && DownloadController.getInstance(this.currentAccount).canDownloadMedia(messageObject.messageOwner) != 0 && (((chatActivity = this.parentChatActivity) == null || chatActivity.getCurrentEncryptedChat() == null) && !messageObject.shouldEncryptPhotoOrVideo() && (document = messageObject.getDocument()) != null)) {
            FileLoader.getInstance(this.currentAccount).loadFile(document, messageObject, 0, 10);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkProgress$139(i, file, file3, z6, z2, z3, z4, z5);
            }
        });
    }

    public void lambda$checkProgress$139(int i, File file, File file2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
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
                if (z || !FileLoader.getInstance(this.currentAccount).isLoadingFile(this.currentFileNames[i])) {
                    this.menuItem.hideSubItem(8);
                } else {
                    this.menuItem.showSubItem(8);
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
        if (getCaptionView().editText != null) {
            return getCaptionView().getSelectionLength();
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

    private void setIndexToImage(org.telegram.messenger.ImageReceiver r34, int r35, org.telegram.ui.Components.Crop.CropTransform r36) throws android.content.res.Resources.NotFoundException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.setIndexToImage(org.telegram.messenger.ImageReceiver, int, org.telegram.ui.Components.Crop.CropTransform):void");
    }

    public static boolean isShowingImage(org.telegram.messenger.MessageObject r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.isShowingImage(org.telegram.messenger.MessageObject):boolean");
    }

    public static boolean isPlayingMessageInPip(MessageObject messageObject) {
        return (PipInstance == null || messageObject == null || PipInstance.currentMessageObject == null || PipInstance.currentMessageObject.getId() != messageObject.getId() || PipInstance.currentMessageObject.getDialogId() != messageObject.getDialogId()) ? false : true;
    }

    public static boolean isPlayingMessage(MessageObject messageObject) {
        return (Instance == null || Instance.pipAnimationInProgress || !Instance.isVisible || messageObject == null || Instance.currentMessageObject == null || Instance.currentMessageObject.getId() != messageObject.getId() || Instance.currentMessageObject.getDialogId() != messageObject.getDialogId()) ? false : true;
    }

    public static boolean isShowingImage(TLRPC.FileLocation fileLocation) {
        if (Instance == null || !Instance.isVisible || Instance.disableShowCheck || fileLocation == null) {
            return false;
        }
        return (Instance.currentFileLocation != null && fileLocation.local_id == Instance.currentFileLocation.location.local_id && fileLocation.volume_id == Instance.currentFileLocation.location.volume_id && fileLocation.dc_id == Instance.currentFileLocation.dc_id) || (Instance.currentFileLocationVideo != null && fileLocation.local_id == Instance.currentFileLocationVideo.location.local_id && fileLocation.volume_id == Instance.currentFileLocationVideo.location.volume_id && fileLocation.dc_id == Instance.currentFileLocationVideo.dc_id);
    }

    public static boolean isShowingImage(TLRPC.BotInlineResult botInlineResult) {
        return (Instance == null || !Instance.isVisible || Instance.disableShowCheck || botInlineResult == null || Instance.currentBotInlineResult == null || botInlineResult.id != Instance.currentBotInlineResult.id) ? false : true;
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
        PlaceProviderObject placeForPhoto = photoViewerProvider == null ? null : photoViewerProvider.getPlaceForPhoto(this.currentMessageObject, getFileLocation(this.currentFileLocation), this.currentIndex, false, false);
        this.currentPlaceObject = placeForPhoto;
        if (placeForPhoto == null || placeForPhoto.keepImageReceiverVisible) {
            return;
        }
        placeForPhoto.imageReceiver.setVisible(false, true);
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

    public boolean openPhoto(TLRPC.FileLocation fileLocation, PhotoViewerProvider photoViewerProvider) {
        return openPhoto(null, fileLocation, null, null, null, null, null, 0, photoViewerProvider, null, 0L, 0L, 0L, true, null, null);
    }

    public boolean openPhotoWithVideo(TLRPC.FileLocation fileLocation, ImageLocation imageLocation, PhotoViewerProvider photoViewerProvider) {
        return openPhoto(null, fileLocation, null, imageLocation, null, null, null, 0, photoViewerProvider, null, 0L, 0L, 0L, true, null, null);
    }

    public boolean openPhotoWithVideo(TLRPC.FileLocation fileLocation, ImageLocation imageLocation, ImageLocation imageLocation2, PhotoViewerProvider photoViewerProvider) {
        return openPhoto(null, fileLocation, imageLocation, imageLocation2, null, null, null, 0, photoViewerProvider, null, 0L, 0L, 0L, true, null, null);
    }

    public boolean openPhoto(TLRPC.FileLocation fileLocation, ImageLocation imageLocation, PhotoViewerProvider photoViewerProvider) {
        return openPhoto(null, fileLocation, imageLocation, null, null, null, null, 0, photoViewerProvider, null, 0L, 0L, 0L, true, null, null);
    }

    public boolean openPhoto(ArrayList arrayList, int i, long j, long j2, long j3, PhotoViewerProvider photoViewerProvider) {
        return openPhoto((MessageObject) arrayList.get(i), null, null, null, arrayList, null, null, i, photoViewerProvider, null, j, j2, j3, true, null, null);
    }

    public boolean openPhoto(ArrayList arrayList, int i, PhotoViewerProvider photoViewerProvider) {
        return openPhoto(null, null, null, null, null, arrayList, null, i, photoViewerProvider, null, 0L, 0L, 0L, true, null, null);
    }

    public boolean openPhoto(int i, PageBlocksAdapter pageBlocksAdapter, PhotoViewerProvider photoViewerProvider) {
        return openPhoto(null, null, null, null, null, null, null, i, photoViewerProvider, null, 0L, 0L, 0L, true, pageBlocksAdapter, null);
    }

    private static String attrsToString(TLRPC.Document document) {
        if (document == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < document.attributes.size(); i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(documentAttribute.getClass().getSimpleName());
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                sb.append("(w=");
                sb.append(documentAttribute.w);
                sb.append(",h=");
                sb.append(documentAttribute.h);
                sb.append(",dur=");
                sb.append(documentAttribute.duration);
                sb.append(")");
            }
        }
        return sb.toString();
    }

    public boolean openPhotoForSelect(ArrayList arrayList, int i, int i2, boolean z, PhotoViewerProvider photoViewerProvider, ChatActivity chatActivity) {
        return openPhotoForSelect(null, null, arrayList, i, i2, z, photoViewerProvider, chatActivity);
    }

    public boolean openPhotoForSelect(TLRPC.FileLocation fileLocation, ImageLocation imageLocation, ArrayList arrayList, int i, int i2, boolean z, PhotoViewerProvider photoViewerProvider, ChatActivity chatActivity) throws Resources.NotFoundException, NumberFormatException {
        AnimatedTextView animatedTextView;
        this.isDocumentsPicker = z;
        ChatActivityEnterView.SendButton sendButton = this.pickerViewSendButton;
        if (sendButton != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sendButton.getLayoutParams();
            if (i2 == 4 || i2 == 5) {
                this.pickerViewSendButton.setResourceId(R.drawable.send_plane_24);
                layoutParams.bottomMargin = AndroidUtilities.dp(1.0f);
            } else if (i2 == 13 || i2 == 14 || i2 == 1 || i2 == 3 || i2 == 10 || i2 == 11) {
                this.pickerViewSendButton.setResourceId(R.drawable.floating_check);
                this.pickerViewSendButton.setPadding(0, AndroidUtilities.dp(1.0f), 0, 0);
                layoutParams.bottomMargin = AndroidUtilities.dp(1.0f);
            } else {
                this.pickerViewSendButton.setResourceId(R.drawable.send_plane_24);
                layoutParams.bottomMargin = AndroidUtilities.dp(1.0f);
            }
            this.pickerViewSendButton.setLayoutParams(layoutParams);
        }
        if (i2 != 11 && this.stickerMakerView != null) {
            this.stickerEmpty = false;
            ImageView imageView = this.tuneItem;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            BlurButton blurButton = this.outlineBtn;
            if (blurButton != null) {
                blurButton.setActive(false, false);
            }
            this.stickerMakerView.clean();
            ArrayList arrayList2 = this.selectedEmojis;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        }
        boolean z2 = this.isVisible;
        if (z2 && this.sendPhotoType != i2 && i2 == 1) {
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
            onPhotoShow(null, fileLocation, imageLocation, null, null, null, arrayList, i, null);
            initCropView();
            setCropBitmap();
            return true;
        }
        if (z2 && this.sendPhotoType != i2 && i2 == 11) {
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
            this.seekToProgressPending2 = 0.0f;
            this.skipFirstBufferingProgress = false;
            this.playerInjected = false;
            makeFocusable();
            this.backgroundDrawable.setAlpha(255);
            this.containerView.setAlpha(1.0f);
            onPhotoShow(null, fileLocation, imageLocation, null, null, null, arrayList, i, null);
            return true;
        }
        this.sendPhotoType = i2;
        if (i2 == 12) {
            this.sendPhotoType = 0;
            this.sendPhotoTypeIsGif = true;
        }
        int i3 = this.sendPhotoType;
        boolean z3 = i3 == 14;
        this.sendPhotoTypeIsPollMediaEdit = z3;
        if (i3 == 13 || z3) {
            this.sendPhotoType = 0;
            this.sendPhotoTypeIsPollMedia = true;
        }
        this.animatorPollAttachButtonsVisibility.setValue(z3, false);
        if (this.sendPhotoType == 11) {
            this.navigationBar.setBackgroundColor(-16777216);
        }
        PhotoViewerActionBarContainer photoViewerActionBarContainer = this.actionBarContainer;
        if (photoViewerActionBarContainer != null && (animatedTextView = photoViewerActionBarContainer.subtitleTextView) != null) {
            animatedTextView.setVisibility(this.sendPhotoTypeIsPollMedia ? 8 : 0);
        }
        return openPhoto(null, fileLocation, imageLocation, null, null, null, arrayList, i, photoViewerProvider, chatActivity, 0L, 0L, 0L, true, null, null);
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
        final boolean z3;
        if (canSendMediaToParentChatActivity()) {
            MessageObject messageObject2 = this.currentMessageObject;
            File pathToMessage = null;
            if (messageObject2 != null) {
                boolean z4 = messageObject2.canEditMedia() && !this.currentMessageObject.isDocument();
                boolean z5 = z4 && this.currentMessageObject.isOutOwner();
                boolean zIsVideo = this.currentMessageObject.isVideo();
                if (!TextUtils.isEmpty(this.currentMessageObject.messageOwner.attachPath)) {
                    File file2 = new File(this.currentMessageObject.messageOwner.attachPath);
                    if (file2.exists()) {
                        pathToMessage = file2;
                    }
                }
                if (pathToMessage == null) {
                    pathToMessage = FileLoader.getInstance(this.currentAccount).getPathToMessage(this.currentMessageObject.messageOwner);
                }
                messageObject = messageObject2;
                file = pathToMessage;
                z2 = z4;
                z3 = z5;
                z = zIsVideo;
            } else {
                file = null;
                messageObject = null;
                z = false;
                z2 = false;
                z3 = false;
            }
            if (file != null && file.exists()) {
                this.savedState = new SavedState(this.currentIndex, new ArrayList(this.imagesArr), this.placeProvider);
                toggleActionBar(false, true, new ActionBarToggleParams().enableStatusBarAnimation(false));
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() throws Resources.NotFoundException, NumberFormatException {
                        this.f$0.lambda$openCurrentPhotoInPaintModeForSelect$141(file, z, messageObject, z2, z3);
                    }
                }, r0.animationDuration);
                return;
            }
            showDownloadAlert();
        }
    }

    public void lambda$openCurrentPhotoInPaintModeForSelect$141(File file, boolean z, final MessageObject messageObject, final boolean z2, final boolean z3) throws Resources.NotFoundException, NumberFormatException {
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
                this.thumbHolder = PhotoViewer.this.centerImage.getBitmapSafe();
            }

            @Override
            public PlaceProviderObject getPlaceForPhoto(MessageObject messageObject2, TLRPC.FileLocation fileLocation, int i2, boolean z4, boolean z5) {
                PhotoViewerProvider photoViewerProvider2 = photoViewerProvider;
                if (photoViewerProvider2 != null) {
                    return photoViewerProvider2.getPlaceForPhoto(messageObject, null, 0, z4, false);
                }
                return null;
            }

            @Override
            public ImageReceiver.BitmapHolder getThumbForPhoto(MessageObject messageObject2, TLRPC.FileLocation fileLocation, int i2) {
                return this.thumbHolder;
            }

            @Override
            public void sendButtonPressed(int i2, VideoEditedInfo videoEditedInfo, boolean z4, int i3, int i4, boolean z5) {
                sendMedia(videoEditedInfo, z4, i3, 0, false, z5);
            }

            @Override
            public void replaceButtonPressed(int i2, VideoEditedInfo videoEditedInfo) {
                MediaController.PhotoEntry photoEntry = orientation;
                if (photoEntry.isCropped || photoEntry.isPainted || photoEntry.isFiltered || videoEditedInfo != null || !TextUtils.isEmpty(photoEntry.caption)) {
                    sendMedia(videoEditedInfo, false, 0, 0, true, false);
                }
            }

            @Override
            public boolean canEdit(int i2) {
                return photoViewerProvider != null && z2;
            }

            @Override
            public boolean canReplace(int i2) {
                return photoViewerProvider != null && z3;
            }

            @Override
            public MessageObject getEditingMessageObject() {
                return messageObject;
            }

            private void sendMedia(VideoEditedInfo videoEditedInfo, boolean z4, int i2, int i3, boolean z5, boolean z6) {
                MessageObject replyMessage;
                ChatActivity.ReplyQuote replyQuote;
                MessageObject messageObject2;
                if (PhotoViewer.this.parentChatActivity != null) {
                    MessageObject messageObject3 = z5 ? messageObject : null;
                    if (messageObject3 != null && !TextUtils.isEmpty(orientation.caption)) {
                        MediaController.PhotoEntry photoEntry = orientation;
                        messageObject3.editingMessage = photoEntry.caption;
                        messageObject3.editingMessageEntities = photoEntry.entities;
                    }
                    if (z5 || (messageObject2 = messageObject) == null) {
                        replyMessage = PhotoViewer.this.parentChatActivity.getReplyMessage();
                        replyQuote = PhotoViewer.this.parentChatActivity.getReplyQuote();
                    } else {
                        replyQuote = null;
                        replyMessage = messageObject2;
                    }
                    MediaController.PhotoEntry photoEntry2 = orientation;
                    if (photoEntry2.isVideo) {
                        if (videoEditedInfo != null) {
                            AccountInstance accountInstance = PhotoViewer.this.parentChatActivity.getAccountInstance();
                            String str = orientation.path;
                            long dialogId = PhotoViewer.this.parentChatActivity.getDialogId();
                            MessageObject threadMessage = PhotoViewer.this.parentChatActivity.getThreadMessage();
                            MediaController.PhotoEntry photoEntry3 = orientation;
                            SendMessagesHelper.prepareSendingVideo(accountInstance, str, videoEditedInfo, null, null, dialogId, replyMessage, threadMessage, null, replyQuote, photoEntry3.entities, photoEntry3.ttl, messageObject3, z4, i2, i3, z6, photoEntry3.hasSpoiler, photoEntry3.caption, PhotoViewer.this.parentChatActivity.quickReplyShortcut, PhotoViewer.this.parentChatActivity.getQuickReplyId(), 0L, 0L, PhotoViewer.this.parentChatActivity.getSendMonoForumPeerId(), PhotoViewer.this.parentChatActivity.getSendMessageSuggestionParams());
                            return;
                        }
                        AccountInstance accountInstance2 = PhotoViewer.this.parentChatActivity.getAccountInstance();
                        String str2 = orientation.path;
                        long dialogId2 = PhotoViewer.this.parentChatActivity.getDialogId();
                        MessageObject threadMessage2 = PhotoViewer.this.parentChatActivity.getThreadMessage();
                        MediaController.PhotoEntry photoEntry4 = orientation;
                        SendMessagesHelper.prepareSendingVideo(accountInstance2, str2, null, null, null, dialogId2, replyMessage, threadMessage2, null, replyQuote, photoEntry4.entities, photoEntry4.ttl, messageObject3, z4, i2, i3, z6, photoEntry4.hasSpoiler, photoEntry4.caption, PhotoViewer.this.parentChatActivity.quickReplyShortcut, PhotoViewer.this.parentChatActivity.getQuickReplyId(), 0L, 0L, PhotoViewer.this.parentChatActivity.getSendMonoForumPeerId(), PhotoViewer.this.parentChatActivity.getSendMessageSuggestionParams());
                        return;
                    }
                    if (photoEntry2.imagePath != null) {
                        AccountInstance accountInstance3 = PhotoViewer.this.parentChatActivity.getAccountInstance();
                        MediaController.PhotoEntry photoEntry5 = orientation;
                        String str3 = photoEntry5.imagePath;
                        String str4 = photoEntry5.thumbPath;
                        long dialogId3 = PhotoViewer.this.parentChatActivity.getDialogId();
                        MessageObject threadMessage3 = PhotoViewer.this.parentChatActivity.getThreadMessage();
                        MediaController.PhotoEntry photoEntry6 = orientation;
                        SendMessagesHelper.prepareSendingPhoto(accountInstance3, str3, str4, null, dialogId3, replyMessage, threadMessage3, null, replyQuote, photoEntry6.entities, photoEntry6.stickers, null, photoEntry6.ttl, messageObject3, videoEditedInfo, z4, i2, i3, 0, z6, photoEntry6.caption, PhotoViewer.this.parentChatActivity.quickReplyShortcut, PhotoViewer.this.parentChatActivity.getQuickReplyId(), 0L, 0L, PhotoViewer.this.parentChatActivity.getSendMonoForumPeerId(), PhotoViewer.this.parentChatActivity.getSendMessageSuggestionParams());
                        return;
                    }
                    if (photoEntry2.path != null) {
                        AccountInstance accountInstance4 = PhotoViewer.this.parentChatActivity.getAccountInstance();
                        MediaController.PhotoEntry photoEntry7 = orientation;
                        String str5 = photoEntry7.path;
                        String str6 = photoEntry7.thumbPath;
                        long dialogId4 = PhotoViewer.this.parentChatActivity.getDialogId();
                        MessageObject threadMessage4 = PhotoViewer.this.parentChatActivity.getThreadMessage();
                        MediaController.PhotoEntry photoEntry8 = orientation;
                        SendMessagesHelper.prepareSendingPhoto(accountInstance4, str5, str6, null, dialogId4, replyMessage, threadMessage4, null, replyQuote, photoEntry8.entities, photoEntry8.stickers, null, photoEntry8.ttl, messageObject3, videoEditedInfo, z4, i2, i3, 0, z6, photoEntry8.caption, PhotoViewer.this.parentChatActivity.quickReplyShortcut, PhotoViewer.this.parentChatActivity.getQuickReplyId(), 0L, 0L, PhotoViewer.this.parentChatActivity.getSendMonoForumPeerId(), PhotoViewer.this.parentChatActivity.getSendMessageSuggestionParams());
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
        this.actionBar.setTranslationY(-r0.getHeight());
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

    public boolean openPhoto(org.telegram.messenger.MessageObject r19, org.telegram.tgnet.TLRPC.FileLocation r20, org.telegram.messenger.ImageLocation r21, org.telegram.messenger.ImageLocation r22, java.util.ArrayList r23, java.util.ArrayList r24, java.util.ArrayList r25, int r26, final org.telegram.ui.PhotoViewer.PhotoViewerProvider r27, org.telegram.ui.ChatActivity r28, long r29, long r31, long r33, boolean r35, org.telegram.ui.PhotoViewer.PageBlocksAdapter r36, final java.lang.Integer r37) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.openPhoto(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.ImageLocation, org.telegram.messenger.ImageLocation, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, int, org.telegram.ui.PhotoViewer$PhotoViewerProvider, org.telegram.ui.ChatActivity, long, long, long, boolean, org.telegram.ui.PhotoViewer$PageBlocksAdapter, java.lang.Integer):boolean");
    }

    public void lambda$openPhoto$142() throws NumberFormatException {
        Activity activity = this.parentActivity;
        if (activity instanceof LaunchActivity) {
            ((LaunchActivity) activity).onBackPressed();
        } else if (isVisible()) {
            closePhoto(true, false);
        }
    }

    class AnonymousClass79 implements ViewTreeObserver.OnPreDrawListener {
        final ClippingImageView[] val$animatingImageViews;
        final Integer val$embedSeekTime;
        final ViewGroup.LayoutParams val$layoutParams;
        final float val$left;
        final PlaceProviderObject val$object;
        final ArrayList val$photos;
        final PhotoViewerProvider val$provider;
        final float val$top;

        AnonymousClass79(ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f, PlaceProviderObject placeProviderObject, float f2, PhotoViewerProvider photoViewerProvider, ArrayList arrayList, Integer num) {
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
            float fMax;
            float f;
            float measuredWidth;
            ClippingImageView[] clippingImageViewArr;
            ClippingImageView[] clippingImageViewArr2 = this.val$animatingImageViews;
            if (clippingImageViewArr2.length > 1) {
                clippingImageViewArr2[1].setAlpha(1.0f);
                this.val$animatingImageViews[1].setAdditionalTranslationX(-PhotoViewer.this.getLeftInset());
            }
            ClippingImageView clippingImageView = this.val$animatingImageViews[0];
            clippingImageView.setTranslationX(clippingImageView.getTranslationX() + PhotoViewer.this.getLeftInset());
            PhotoViewer.this.windowView.getViewTreeObserver().removeOnPreDrawListener(this);
            if (PhotoViewer.this.sendPhotoType == 1) {
                float f2 = PhotoViewer.this.isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0;
                float measuredHeight = (PhotoViewer.this.photoCropView.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - f2;
                float measuredWidth2 = PhotoViewer.this.photoCropView.getMeasuredWidth() / 2.0f;
                float f3 = f2 + (measuredHeight / 2.0f);
                float fMin = (Math.min(PhotoViewer.this.photoCropView.getMeasuredWidth(), measuredHeight) - (AndroidUtilities.dp(16.0f) * 2)) / 2.0f;
                float f4 = f3 - fMin;
                ViewGroup.LayoutParams layoutParams = this.val$layoutParams;
                float f5 = (f3 + fMin) - f4;
                fMax = Math.max(((measuredWidth2 + fMin) - (measuredWidth2 - fMin)) / layoutParams.width, f5 / layoutParams.height);
                f = f4 + ((f5 - (this.val$layoutParams.height * fMax)) / 2.0f);
                measuredWidth = ((((PhotoViewer.this.windowView.getMeasuredWidth() - PhotoViewer.this.getLeftInset()) - PhotoViewer.this.getRightInset()) - (this.val$layoutParams.width * fMax)) / 2.0f) + PhotoViewer.this.getLeftInset();
            } else {
                float fMin2 = Math.min(PhotoViewer.this.windowView.getMeasuredWidth() / this.val$layoutParams.width, (AndroidUtilities.displaySize.y + (PhotoViewer.this.isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0)) / this.val$layoutParams.height);
                if (PhotoViewer.this.sendPhotoType == 11) {
                    fMin2 *= PhotoViewer.this.scale1();
                }
                fMax = fMin2;
                f = ((AndroidUtilities.displaySize.y + (PhotoViewer.this.isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0)) - (this.val$layoutParams.height * fMax)) / 2.0f;
                measuredWidth = (PhotoViewer.this.windowView.getMeasuredWidth() - (this.val$layoutParams.width * fMax)) / 2.0f;
                PhotoViewer.this.rotate = 0.0f;
                PhotoViewer.this.animateToRotate = 0.0f;
            }
            int iAbs = (int) Math.abs(this.val$left - this.val$object.imageReceiver.getImageX());
            int iAbs2 = (int) Math.abs(this.val$top - this.val$object.imageReceiver.getImageY());
            if (this.val$object.imageReceiver.isAspectFit()) {
                iAbs = 0;
            }
            int[] iArr = new int[2];
            this.val$object.parentView.getLocationInWindow(iArr);
            int i = iArr[1];
            PlaceProviderObject placeProviderObject = this.val$object;
            float f6 = placeProviderObject.viewY + this.val$top;
            int i2 = (int) ((i - f6) + placeProviderObject.clipTopAddition);
            if (i2 < 0) {
                i2 = 0;
            }
            int height = (int) (((f6 + this.val$layoutParams.height) - (i + placeProviderObject.parentView.getHeight())) + this.val$object.clipBottomAddition);
            if (height < 0) {
                height = 0;
            }
            int iMax = Math.max(i2, iAbs2);
            int iMax2 = Math.max(height, iAbs2);
            PhotoViewer.this.animationValues[0][0] = PhotoViewer.this.animatingImageView.getScaleX();
            PhotoViewer.this.animationValues[0][1] = PhotoViewer.this.animatingImageView.getScaleY();
            PhotoViewer.this.animationValues[0][2] = PhotoViewer.this.animatingImageView.getTranslationX();
            PhotoViewer.this.animationValues[0][3] = PhotoViewer.this.animatingImageView.getTranslationY();
            float f7 = iAbs;
            PhotoViewer.this.animationValues[0][4] = this.val$object.scale * f7;
            PhotoViewer.this.animationValues[0][5] = iMax * this.val$object.scale;
            PhotoViewer.this.animationValues[0][6] = iMax2 * this.val$object.scale;
            int[] radius = PhotoViewer.this.animatingImageView.getRadius();
            for (int i3 = 0; i3 < 4; i3++) {
                PhotoViewer.this.animationValues[0][i3 + 7] = radius != null ? radius[i3] : 0.0f;
            }
            PhotoViewer.this.animationValues[0][11] = iAbs2 * this.val$object.scale;
            PhotoViewer.this.animationValues[0][12] = f7 * this.val$object.scale;
            PhotoViewer.this.animationValues[1][0] = fMax;
            PhotoViewer.this.animationValues[1][1] = fMax;
            PhotoViewer.this.animationValues[1][2] = measuredWidth;
            PhotoViewer.this.animationValues[1][3] = f;
            PhotoViewer.this.animationValues[1][4] = 0.0f;
            PhotoViewer.this.animationValues[1][5] = 0.0f;
            PhotoViewer.this.animationValues[1][6] = 0.0f;
            PhotoViewer.this.animationValues[1][7] = 0.0f;
            PhotoViewer.this.animationValues[1][8] = 0.0f;
            PhotoViewer.this.animationValues[1][9] = 0.0f;
            PhotoViewer.this.animationValues[1][10] = 0.0f;
            PhotoViewer.this.animationValues[1][11] = 0.0f;
            PhotoViewer.this.animationValues[1][12] = 0.0f;
            int i4 = 0;
            while (true) {
                ClippingImageView[] clippingImageViewArr3 = this.val$animatingImageViews;
                if (i4 >= clippingImageViewArr3.length) {
                    break;
                }
                clippingImageViewArr3[i4].setAnimationProgress(0.0f);
                i4++;
            }
            PhotoViewer.this.backgroundDrawable.setAlpha(0);
            PhotoViewer.this.containerView.setAlpha(0.0f);
            PhotoViewer.this.navigationBar.setAlpha(0.0f);
            PhotoViewerProvider photoViewerProvider = this.val$provider;
            if (photoViewerProvider != null) {
                photoViewerProvider.onPreOpen();
            }
            PhotoViewer photoViewer = PhotoViewer.this;
            final ClippingImageView[] clippingImageViewArr4 = this.val$animatingImageViews;
            final ArrayList arrayList = this.val$photos;
            final Integer num = this.val$embedSeekTime;
            final PhotoViewerProvider photoViewerProvider2 = this.val$provider;
            photoViewer.animationEndRunnable = new Runnable() {
                @Override
                public final void run() throws Resources.NotFoundException {
                    this.f$0.lambda$onPreDraw$0(clippingImageViewArr4, arrayList, num, photoViewerProvider2);
                }
            };
            if (PhotoViewer.this.openedFullScreenVideo) {
                if (PhotoViewer.this.animationEndRunnable != null) {
                    PhotoViewer.this.animationEndRunnable.run();
                    PhotoViewer.this.animationEndRunnable = null;
                }
                PhotoViewer.this.containerView.setAlpha(1.0f);
                PhotoViewer.this.backgroundDrawable.setAlpha(255);
                int i5 = 0;
                while (true) {
                    ClippingImageView[] clippingImageViewArr5 = this.val$animatingImageViews;
                    if (i5 >= clippingImageViewArr5.length) {
                        break;
                    }
                    clippingImageViewArr5[i5].setAnimationProgress(1.0f);
                    i5++;
                }
                if (PhotoViewer.this.sendPhotoType == 1) {
                    PhotoViewer.this.photoCropView.setAlpha(1.0f);
                }
            } else {
                final AnimatorSet animatorSet = new AnimatorSet();
                int i6 = PhotoViewer.this.sendPhotoType == 1 ? 3 : 2;
                ClippingImageView[] clippingImageViewArr6 = this.val$animatingImageViews;
                ArrayList arrayList2 = new ArrayList(i6 + clippingImageViewArr6.length + (clippingImageViewArr6.length > 1 ? 1 : 0));
                int i7 = 0;
                while (true) {
                    clippingImageViewArr = this.val$animatingImageViews;
                    if (i7 >= clippingImageViewArr.length) {
                        break;
                    }
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(clippingImageViewArr[i7], (Property<ClippingImageView, Float>) AnimationProperties.CLIPPING_IMAGE_VIEW_PROGRESS, 0.0f, 1.0f);
                    if (i7 == 0) {
                        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                this.f$0.lambda$onPreDraw$1(valueAnimator);
                            }
                        });
                    }
                    arrayList2.add(objectAnimatorOfFloat);
                    i7++;
                }
                if (clippingImageViewArr.length > 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(PhotoViewer.this.animatingImageView, (Property<ClippingImageView, Float>) View.ALPHA, 0.0f, 1.0f));
                }
                arrayList2.add(ObjectAnimator.ofInt(PhotoViewer.this.backgroundDrawable, (Property<BackgroundDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, 0, 255));
                FrameLayoutDrawer frameLayoutDrawer = PhotoViewer.this.containerView;
                Property property = View.ALPHA;
                arrayList2.add(ObjectAnimator.ofFloat(frameLayoutDrawer, (Property<FrameLayoutDrawer, Float>) property, 0.0f, 1.0f));
                arrayList2.add(ObjectAnimator.ofFloat(PhotoViewer.this.navigationBar, (Property<View, Float>) property, 0.0f, 1.0f));
                if (PhotoViewer.this.sendPhotoType == 1) {
                    arrayList2.add(ObjectAnimator.ofFloat(PhotoViewer.this.photoCropView, (Property<PhotoCropView, Float>) property, 0.0f, 1.0f));
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
                        this.f$0.lambda$onPreDraw$2(animatorSet);
                    }
                });
            }
            BackgroundDrawable backgroundDrawable = PhotoViewer.this.backgroundDrawable;
            final PlaceProviderObject placeProviderObject2 = this.val$object;
            backgroundDrawable.drawRunnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onPreDraw$3(placeProviderObject2);
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

        public void lambda$onPreDraw$0(ClippingImageView[] clippingImageViewArr, ArrayList arrayList, Integer num, PhotoViewerProvider photoViewerProvider) throws Resources.NotFoundException {
            PhotoViewer.this.animationEndRunnable = null;
            if (PhotoViewer.this.containerView != null) {
                PhotoViewer photoViewer = PhotoViewer.this;
                if (photoViewer.windowView == null) {
                    return;
                }
                photoViewer.containerView.setLayerType(0, null);
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
                if (PhotoViewer.this.hideAfterAnimation != null && !PhotoViewer.this.hideAfterAnimation.keepImageReceiverVisible) {
                    PhotoViewer.this.hideAfterAnimation.imageReceiver.setVisible(false, true);
                }
                if (arrayList != null && PhotoViewer.this.sendPhotoType != 3 && PhotoViewer.this.sendPhotoType != 1 && (PhotoViewer.this.placeProvider == null || !PhotoViewer.this.placeProvider.closeKeyboard())) {
                    PhotoViewer.this.makeFocusable();
                }
                if (PhotoViewer.this.videoPlayer != null && PhotoViewer.this.videoPlayer.isPlaying() && PhotoViewer.this.isCurrentVideo && !PhotoViewer.this.imagesArrLocals.isEmpty()) {
                    PhotoViewer photoViewer2 = PhotoViewer.this;
                    photoViewer2.seekAnimatedStickersTo(photoViewer2.videoPlayer.getCurrentPosition());
                    PhotoViewer.this.playOrStopAnimatedStickers(true);
                }
                if (PhotoViewer.this.isEmbedVideo) {
                    PhotoViewer.this.initEmbedVideo(num.intValue());
                }
                if (photoViewerProvider != null) {
                    photoViewerProvider.onOpen();
                }
            }
        }

        public void lambda$onPreDraw$1(ValueAnimator valueAnimator) {
            PhotoViewer.this.clippingImageProgress = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
            PhotoViewer.this.invalidateBlur();
        }

        class AnonymousClass1 extends AnimatorListenerAdapter {
            AnonymousClass1() {
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onAnimationEnd$0();
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
            if (placeProviderObject.keepImageReceiverVisible) {
                return;
            }
            placeProviderObject.imageReceiver.setVisible(false, true);
        }
    }

    public void openKeyboard() {
        EditTextEmoji editTextEmoji;
        CaptionContainerView captionView = getCaptionView();
        if (captionView == null || (editTextEmoji = captionView.editText) == null) {
            return;
        }
        editTextEmoji.openKeyboard();
    }

    public void initEmbedVideo(int i) {
        if (this.isEmbedVideo) {
            PhotoViewerWebView photoViewerWebView = new PhotoViewerWebView(this, this.parentActivity, this.pipItem) {
                Rect rect = new Rect();

                @Override
                protected void processTouch(MotionEvent motionEvent) {
                }

                @Override
                protected void drawBlackBackground(Canvas canvas, int i2, int i3) {
                    Bitmap bitmap = PhotoViewer.this.centerImage.getBitmap();
                    if (bitmap != null) {
                        float fMin = Math.min(i2 / bitmap.getWidth(), i3 / bitmap.getHeight());
                        int width = (int) (bitmap.getWidth() * fMin);
                        int height = (int) (bitmap.getHeight() * fMin);
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
        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
        layoutParams.flags = -2147417856;
        layoutParams.softInputMode = 272;
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

    public void closePhoto(boolean z, boolean z2) throws NumberFormatException {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        boolean[] zArr;
        final PlaceProviderObject placeProviderObject;
        float f7;
        ?? r11;
        ?? r13;
        char c;
        char c2;
        RectF drawRegion;
        float fMin;
        float measuredHeight;
        final AnimatedFileDrawable animation;
        final TLRPC.Document currentDocument;
        Bitmap animatedBitmap;
        int i;
        int i2;
        StickerMakerView stickerMakerView = this.stickerMakerView;
        if (stickerMakerView != null) {
            stickerMakerView.isThanosInProgress = false;
            if (this.cutOutBtn.isCancelState()) {
                this.cutOutBtn.setCutOutState(true);
                showEditStickerMode(false, true);
                this.stickerMakerView.disableClippingMode();
                this.containerView.invalidate();
            }
        }
        if (!z2 && (i2 = this.currentEditMode) != 0) {
            if (i2 == 3 && this.photoPaintView != null) {
                closePaintMode();
                return;
            }
            if (i2 == 1) {
                this.cropTransform.setViewTransform(this.previousHasTransform, this.previousCropPx, this.previousCropPy, this.previousCropRotation, this.previousCropOrientation, this.previousCropScale, 1.0f, 1.0f, this.previousCropPw, this.previousCropPh, 0.0f, 0.0f, this.previousCropMirrored);
            }
            if (this.currentEditMode == 4) {
                applyCurrentEditMode();
            }
            switchToEditMode(0);
            return;
        }
        QualityChooseView qualityChooseView = this.qualityChooseView;
        if (qualityChooseView != null && qualityChooseView.getTag() != null) {
            this.qualityPicker.cancelButton.callOnClick();
            return;
        }
        this.isVisibleOrAnimating = false;
        this.openedFullScreenVideo = false;
        try {
            AlertDialog alertDialog = this.visibleDialog;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.visibleDialog = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.containerView != null) {
            AndroidUtilities.cancelRunOnUIThread(this.updateContainerFlagsRunnable);
            updateContainerFlags(true);
        }
        int i3 = this.currentEditMode;
        if (i3 != 0) {
            if (i3 == 2) {
                this.photoFilterView.shutdown();
                this.containerView.removeView(this.photoFilterView);
                this.photoFilterView = null;
            } else if (i3 == 1) {
                this.editorDoneLayout.setVisibility(8);
                this.photoCropView.setVisibility(8);
            } else if (i3 == 3) {
                this.photoPaintView.shutdown();
                this.containerView.removeView(this.photoPaintView.getView());
                this.photoPaintView = null;
                this.savedState = null;
            } else if (i3 == 4) {
                this.maskPaintViewShuttingDown = true;
                FrameLayoutDrawer frameLayoutDrawer = this.containerView;
                if (frameLayoutDrawer != null) {
                    frameLayoutDrawer.invalidate();
                    final MaskPaintView maskPaintView = this.maskPaintView;
                    this.containerView.post(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$closePhoto$143(maskPaintView);
                        }
                    });
                } else {
                    this.maskPaintView.shutdown();
                }
                this.maskPaintView = null;
            }
            this.currentEditMode = 0;
            getCaptionView().keyboardNotifier.ignore(false);
            KeyboardNotifier keyboardNotifier = this.paintKeyboardNotifier;
            if (keyboardNotifier != null) {
                keyboardNotifier.ignore(this.currentEditMode != 3);
            }
        }
        View view = this.navigationBar;
        if (view != null) {
            view.setVisibility(0);
        }
        FrameLayout frameLayout = this.windowView;
        if (frameLayout != null) {
            frameLayout.setClipChildren(false);
        }
        if (this.parentActivity != null) {
            if ((!this.isInline && !this.isVisible) || checkAnimation() || this.placeProvider == null) {
                return;
            }
            Activity activity = this.parentActivity;
            if (activity != null && this.fullscreenedByButton != 0) {
                activity.setRequestedOrientation(this.prevOrientation);
                this.fullscreenedByButton = 0;
                this.wasRotated = false;
            }
            if (!this.doneButtonPressed && !this.imagesArrLocals.isEmpty() && (i = this.currentIndex) >= 0 && i < this.imagesArrLocals.size()) {
                Object obj = this.imagesArrLocals.get(this.currentIndex);
                if (obj instanceof MediaController.MediaEditState) {
                    MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) obj;
                    mediaEditState.editedInfo = getCurrentVideoEditedInfo();
                    if (this.sendPhotoType == 11) {
                        mediaEditState.reset();
                    }
                }
            }
            BaseFragment baseFragment = this.parentFragment;
            if (baseFragment == null || baseFragment.getFragmentView() == null) {
                f = 1.0f;
                f2 = 1.0f;
                f3 = 1.0f;
                f4 = 1.0f;
            } else {
                View fragmentView = this.parentFragment.getFragmentView();
                float scaleX = fragmentView.getScaleX();
                float scaleY = fragmentView.getScaleY();
                fragmentView.setScaleX(1.0f);
                fragmentView.setScaleY(1.0f);
                ChatAttachAlert chatAttachAlert = this.parentAlert;
                if (chatAttachAlert != null) {
                    BottomSheet.ContainerView container = chatAttachAlert.getContainer();
                    float scaleX2 = container.getScaleX();
                    float scaleY2 = container.getScaleY();
                    container.setScaleX(1.0f);
                    container.setScaleY(1.0f);
                    f3 = scaleX2;
                    f4 = scaleY2;
                } else {
                    f3 = 1.0f;
                    f4 = 1.0f;
                }
                f2 = scaleX;
                f = scaleY;
            }
            PhotoViewerProvider photoViewerProvider = this.placeProvider;
            if (photoViewerProvider != null) {
                photoViewerProvider.onReleasePlayerBeforeClose(this.currentIndex);
            }
            boolean[] zArr2 = {true};
            PhotoViewerProvider photoViewerProvider2 = this.placeProvider;
            PlaceProviderObject placeForPhoto = photoViewerProvider2 != null ? photoViewerProvider2.getPlaceForPhoto(this.currentMessageObject, getFileLocation(this.currentFileLocation), this.currentIndex, true, true) : null;
            if (this.videoPlayer == null || placeForPhoto == null || (animation = placeForPhoto.imageReceiver.getAnimation()) == null) {
                f5 = f;
                f6 = f2;
                zArr = zArr2;
                placeProviderObject = placeForPhoto;
                f7 = 1.0f;
                r11 = 0;
                r13 = 0;
                c = 11;
                c2 = '\b';
            } else {
                long startTime = animation.getStartTime();
                long currentPosition = this.videoPlayer.getCurrentPosition();
                if (startTime <= 0) {
                    startTime = 0;
                }
                final long j = currentPosition + startTime;
                if (this.videoPlayer.getCurrentDocument() == null) {
                    MessageObject messageObject = this.currentMessageObject;
                    currentDocument = messageObject != null ? messageObject.getDocument() : null;
                } else {
                    currentDocument = this.videoPlayer.getCurrentDocument();
                }
                f5 = f;
                f6 = f2;
                zArr = zArr2;
                f7 = 1.0f;
                c = 11;
                placeProviderObject = placeForPhoto;
                r11 = 0;
                c2 = '\b';
                r13 = 0;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$closePhoto$144(animation, currentDocument, j, placeProviderObject);
                    }
                };
                if (this.textureUploaded && (animatedBitmap = animation.getAnimatedBitmap()) != null) {
                    if (this.usedSurfaceView) {
                        AndroidUtilities.getBitmapFromSurface(this.videoSurfaceView, animatedBitmap);
                    } else {
                        try {
                            Bitmap bitmap = this.videoTextureView.getBitmap(animatedBitmap.getWidth(), animatedBitmap.getHeight());
                            new Canvas(animatedBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                            bitmap.recycle();
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                    }
                }
                runnable.run();
            }
            PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
            if (photoViewerWebView != null) {
                photoViewerWebView.release();
                this.containerView.removeView(this.photoViewerWebView);
                this.photoViewerWebView = r11;
            }
            ChatActivity chatActivity = this.parentChatActivity;
            if (chatActivity != null && chatActivity.getFragmentView() != null) {
                this.parentChatActivity.getFragmentView().invalidate();
            }
            this.parentChatActivity = r11;
            removeObservers();
            this.isActionBarVisible = r13;
            VelocityTracker velocityTracker = this.velocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.velocityTracker = r11;
            }
            if (this.isInline) {
                this.isInline = r13;
                this.animationInProgress = r13;
                onPhotoClosed(placeProviderObject);
                this.containerView.setScaleX(f7);
                this.containerView.setScaleY(f7);
                if (!this.doneButtonPressed) {
                    releasePlayer(true);
                }
            } else {
                final PlaceProviderObject placeProviderObject2 = placeProviderObject;
                if (z) {
                    ClippingImageView[] animatingImageViews = getAnimatingImageViews(placeProviderObject2);
                    for (int i4 = 0; i4 < animatingImageViews.length; i4++) {
                        animatingImageViews[i4].setAnimationValues(this.animationValues, r13, placeProviderObject2 == null ? false : placeProviderObject2.fadeIn);
                        animatingImageViews[i4].setVisibility(r13);
                    }
                    final AnimatorSet animatorSet = new AnimatorSet();
                    ViewGroup.LayoutParams layoutParams = this.animatingImageView.getLayoutParams();
                    if (placeProviderObject2 != null) {
                        drawRegion = placeProviderObject2.imageReceiver.getDrawRegion();
                        layoutParams.width = (int) drawRegion.width();
                        layoutParams.height = (int) drawRegion.height();
                        int orientation = placeProviderObject2.imageReceiver.getOrientation();
                        int animatedOrientation = placeProviderObject2.imageReceiver.getAnimatedOrientation();
                        if (animatedOrientation != 0) {
                            orientation = animatedOrientation;
                        }
                        for (int i5 = 0; i5 < animatingImageViews.length; i5++) {
                            animatingImageViews[i5].setOrientation(orientation, placeProviderObject2.imageReceiver.getInvert());
                            animatingImageViews[i5].setImageBitmap(placeProviderObject2.thumb);
                        }
                    } else {
                        layoutParams.width = (int) this.centerImage.getImageWidth();
                        layoutParams.height = (int) this.centerImage.getImageHeight();
                        for (int i6 = 0; i6 < animatingImageViews.length; i6++) {
                            animatingImageViews[i6].setOrientation(this.centerImage.getOrientation(), this.centerImage.getInvert());
                            animatingImageViews[i6].setImageBitmap(this.centerImage.getBitmapSafe());
                        }
                        drawRegion = null;
                    }
                    if (layoutParams.width <= 0) {
                        layoutParams.width = 100;
                    }
                    if (layoutParams.height <= 0) {
                        layoutParams.height = 100;
                    }
                    if (this.sendPhotoType == 1) {
                        float fMin2 = Math.min(this.photoCropView.getMeasuredWidth(), (this.photoCropView.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - (isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.dp(16.0f) * 2);
                        fMin = Math.max(fMin2 / layoutParams.width, fMin2 / layoutParams.height);
                    } else {
                        fMin = Math.min(this.windowView.getMeasuredWidth() / layoutParams.width, (AndroidUtilities.displaySize.y + (isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0)) / layoutParams.height);
                    }
                    float f8 = layoutParams.width;
                    float f9 = this.scale;
                    float f10 = layoutParams.height * f9 * fMin;
                    float measuredWidth = (this.windowView.getMeasuredWidth() - ((f8 * f9) * fMin)) / 2.0f;
                    if (this.sendPhotoType == 1) {
                        measuredHeight = this.photoCropView.getMeasuredHeight() - (isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0);
                    } else {
                        measuredHeight = AndroidUtilities.displaySize.y + (isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0);
                    }
                    float f11 = (measuredHeight - f10) / 2.0f;
                    for (int i7 = 0; i7 < animatingImageViews.length; i7++) {
                        animatingImageViews[i7].setLayoutParams(layoutParams);
                        animatingImageViews[i7].setTranslationX(this.translationX + measuredWidth);
                        animatingImageViews[i7].setTranslationY(this.translationY + f11);
                        animatingImageViews[i7].setScaleX(this.scale * fMin);
                        animatingImageViews[i7].setScaleY(this.scale * fMin);
                    }
                    if (placeProviderObject2 != null) {
                        int iAbs = (int) Math.abs(drawRegion.left - placeProviderObject2.imageReceiver.getImageX());
                        int iAbs2 = (int) Math.abs(drawRegion.top - placeProviderObject2.imageReceiver.getImageY());
                        if (placeProviderObject2.imageReceiver.isAspectFit()) {
                            iAbs = 0;
                        }
                        int[] iArr = new int[2];
                        placeProviderObject2.parentView.getLocationInWindow(iArr);
                        int i8 = iArr[1];
                        float f12 = placeProviderObject2.viewY;
                        float f13 = drawRegion.top;
                        float f14 = f12 + f13;
                        int i9 = (int) ((i8 - f14) + placeProviderObject2.clipTopAddition);
                        if (i9 < 0) {
                            i9 = 0;
                        }
                        int height = (int) (((f14 + (drawRegion.bottom - f13)) - (i8 + placeProviderObject2.parentView.getHeight())) + placeProviderObject2.clipBottomAddition);
                        if (height < 0) {
                            height = 0;
                        }
                        int iMax = Math.max(i9, iAbs2);
                        int iMax2 = Math.max(height, iAbs2);
                        this.animationValues[r13][r13] = this.animatingImageView.getScaleX();
                        this.animationValues[r13][1] = this.animatingImageView.getScaleY();
                        this.animationValues[r13][2] = this.animatingImageView.getTranslationX();
                        this.animationValues[r13][3] = this.animatingImageView.getTranslationY();
                        float[][] fArr = this.animationValues;
                        float[] fArr2 = fArr[r13];
                        fArr2[4] = 0.0f;
                        fArr2[5] = 0.0f;
                        fArr2[6] = 0.0f;
                        fArr2[7] = 0.0f;
                        fArr2[c2] = 0.0f;
                        fArr2[9] = 0.0f;
                        fArr2[10] = 0.0f;
                        fArr2[c] = 0.0f;
                        fArr2[12] = 0.0f;
                        float[] fArr3 = fArr[1];
                        float f15 = placeProviderObject2.scale;
                        fArr3[r13] = f15;
                        fArr3[1] = f15;
                        fArr3[2] = placeProviderObject2.viewX + (drawRegion.left * f15);
                        fArr3[3] = placeProviderObject2.viewY + (drawRegion.top * f15);
                        float f16 = iAbs;
                        fArr3[4] = f16 * f15;
                        fArr3[5] = iMax * f15;
                        fArr3[6] = iMax2 * f15;
                        int i10 = 0;
                        for (int i11 = 4; i10 < i11; i11 = 4) {
                            this.animationValues[1][i10 + 7] = placeProviderObject2.radius != null ? r10[i10] : 0.0f;
                            i10++;
                        }
                        float[] fArr4 = this.animationValues[1];
                        float f17 = placeProviderObject2.scale;
                        fArr4[c] = iAbs2 * f17;
                        fArr4[12] = f16 * f17;
                        ArrayList arrayList = new ArrayList((this.sendPhotoType != 1 ? 2 : 3) + animatingImageViews.length + (animatingImageViews.length > 1 ? 1 : 0));
                        for (int i12 = 0; i12 < animatingImageViews.length; i12++) {
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(animatingImageViews[i12], (Property<Object[], Float>) AnimationProperties.CLIPPING_IMAGE_VIEW_PROGRESS, 0.0f, 1.0f);
                            if (i12 == 0) {
                                objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        this.f$0.lambda$closePhoto$145(valueAnimator);
                                    }
                                });
                            }
                            arrayList.add(objectAnimatorOfFloat);
                        }
                        if (animatingImageViews.length > 1) {
                            arrayList.add(ObjectAnimator.ofFloat(this.animatingImageView, (Property<ClippingImageView, Float>) View.ALPHA, 0.0f));
                            animatingImageViews[1].setAdditionalTranslationX(-getLeftInset());
                        }
                        arrayList.add(ObjectAnimator.ofInt(this.backgroundDrawable, (Property<BackgroundDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, 0));
                        FrameLayoutDrawer frameLayoutDrawer2 = this.containerView;
                        Property property = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayoutDrawer2, (Property<FrameLayoutDrawer, Float>) property, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.navigationBar, (Property<View, Float>) property, 0.0f));
                        if (this.sendPhotoType == 1) {
                            arrayList.add(ObjectAnimator.ofFloat(this.photoCropView, (Property<PhotoCropView, Float>) property, 0.0f));
                        }
                        animatorSet.playTogether(arrayList);
                    } else {
                        int i13 = AndroidUtilities.displaySize.y + (isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0);
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                this.f$0.lambda$closePhoto$146(valueAnimator);
                            }
                        });
                        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.backgroundDrawable, (Property<BackgroundDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, 0);
                        ClippingImageView clippingImageView = this.animatingImageView;
                        Property property2 = View.ALPHA;
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(clippingImageView, (Property<ClippingImageView, Float>) property2, 0.0f);
                        ClippingImageView clippingImageView2 = this.animatingImageView;
                        Property property3 = View.TRANSLATION_Y;
                        if (this.translationY < 0.0f) {
                            i13 = -i13;
                        }
                        animatorSet.playTogether(valueAnimatorOfFloat, objectAnimatorOfInt, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(clippingImageView2, (Property<ClippingImageView, Float>) property3, i13), ObjectAnimator.ofFloat(this.containerView, (Property<FrameLayoutDrawer, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.navigationBar, (Property<View, Float>) property2, 0.0f));
                    }
                    PhotoViewerProvider photoViewerProvider3 = this.placeProvider;
                    if (photoViewerProvider3 != null) {
                        photoViewerProvider3.onPreClose();
                    }
                    this.animationEndRunnable = new Runnable() {
                        @Override
                        public final void run() throws NumberFormatException {
                            this.f$0.lambda$closePhoto$147(placeProviderObject2);
                        }
                    };
                    animatorSet.setDuration(200L);
                    animatorSet.addListener(new AnonymousClass82());
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$closePhoto$148(placeProviderObject2, animatorSet);
                        }
                    };
                    if (zArr[0]) {
                        runnable2.run();
                    }
                } else {
                    final AnimatorSet animatorSet2 = new AnimatorSet();
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            this.f$0.lambda$closePhoto$149(valueAnimator);
                        }
                    });
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.containerView, (Property<FrameLayoutDrawer, Float>) View.SCALE_X, 0.9f);
                    ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.containerView, (Property<FrameLayoutDrawer, Float>) View.SCALE_Y, 0.9f);
                    ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(this.backgroundDrawable, (Property<BackgroundDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, 0);
                    FrameLayoutDrawer frameLayoutDrawer3 = this.containerView;
                    Property property4 = View.ALPHA;
                    animatorSet2.playTogether(valueAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfInt2, ObjectAnimator.ofFloat(frameLayoutDrawer3, (Property<FrameLayoutDrawer, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.navigationBar, (Property<View, Float>) property4, 0.0f));
                    PhotoViewerProvider photoViewerProvider4 = this.placeProvider;
                    if (photoViewerProvider4 != null) {
                        photoViewerProvider4.onPreClose();
                    }
                    this.animationEndRunnable = new Runnable() {
                        @Override
                        public final void run() throws NumberFormatException {
                            this.f$0.lambda$closePhoto$150(placeProviderObject2);
                        }
                    };
                    animatorSet2.setDuration(200L);
                    animatorSet2.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            PhotoViewer.this.clippingImageProgress = 1.0f;
                            if (PhotoViewer.this.animationEndRunnable != null) {
                                ChatActivity chatActivity2 = PhotoViewer.this.parentChatActivity;
                                if (chatActivity2 == null && PhotoViewer.this.parentAlert != null) {
                                    BaseFragment baseFragment2 = PhotoViewer.this.parentAlert.getBaseFragment();
                                    if (baseFragment2 instanceof ChatActivity) {
                                        chatActivity2 = (ChatActivity) baseFragment2;
                                    }
                                }
                                if (chatActivity2 != null) {
                                    chatActivity2.lambda$openDiscussionMessageChat$381(PhotoViewer.this.animationEndRunnable);
                                } else {
                                    PhotoViewer.this.animationEndRunnable.run();
                                    PhotoViewer.this.animationEndRunnable = null;
                                }
                            }
                        }
                    });
                    Runnable runnable3 = new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$closePhoto$151(animatorSet2, placeProviderObject2);
                        }
                    };
                    if (zArr[0]) {
                        runnable3.run();
                    }
                }
                AnimatedFileDrawable animatedFileDrawable = this.currentAnimation;
                if (animatedFileDrawable != null) {
                    animatedFileDrawable.removeSecondParentView(this.containerView);
                    this.currentAnimation = null;
                    this.centerImage.setImageBitmap((Drawable) null);
                    this.centerBlur.destroy();
                }
                PhotoViewerProvider photoViewerProvider5 = this.placeProvider;
                if (photoViewerProvider5 != null && !photoViewerProvider5.canScrollAway()) {
                    this.placeProvider.cancelButtonPressed();
                }
            }
            BaseFragment baseFragment2 = this.parentFragment;
            if (baseFragment2 == null || baseFragment2.getFragmentView() == null) {
                return;
            }
            View fragmentView2 = this.parentFragment.getFragmentView();
            fragmentView2.setScaleX(f6);
            fragmentView2.setScaleY(f5);
            ChatAttachAlert chatAttachAlert2 = this.parentAlert;
            if (chatAttachAlert2 != null) {
                BottomSheet.ContainerView container2 = chatAttachAlert2.getContainer();
                container2.setScaleX(f3);
                container2.setScaleY(f4);
            }
        }
    }

    public void lambda$closePhoto$143(MaskPaintView maskPaintView) {
        maskPaintView.shutdown();
        this.containerView.removeView(this.maskPaintView);
    }

    public void lambda$closePhoto$144(AnimatedFileDrawable animatedFileDrawable, TLRPC.Document document, long j, PlaceProviderObject placeProviderObject) {
        ImageReceiver imageReceiver;
        if (animatedFileDrawable != null && document != null) {
            FileLog.d("seeking from photo viewer to animation object");
            animatedFileDrawable.seekTo(j, !FileLoader.getInstance(this.currentAccount).isLoadingVideo(document, true), true);
        }
        if (placeProviderObject == null || (imageReceiver = placeProviderObject.imageReceiver) == null) {
            return;
        }
        imageReceiver.setAllowStartAnimation(true);
        placeProviderObject.imageReceiver.startAnimation();
    }

    public void lambda$closePhoto$145(ValueAnimator valueAnimator) {
        this.clippingImageProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidateBlur();
    }

    public void lambda$closePhoto$146(ValueAnimator valueAnimator) {
        this.clippingImageProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public void lambda$closePhoto$147(PlaceProviderObject placeProviderObject) throws NumberFormatException {
        ArrayList arrayList;
        this.animationEndRunnable = null;
        this.containerView.setLayerType(0, null);
        this.animationInProgress = 0;
        invalidateBlur();
        onPhotoClosed(placeProviderObject);
        MediaController.getInstance().tryResumePausedAudio();
        if (!this.stickerEmpty || this.stickerEmptySent || (arrayList = this.imagesArrLocals) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof MediaController.PhotoEntry) {
                ((MediaController.PhotoEntry) next).deleteAll();
            }
        }
    }

    class AnonymousClass82 extends AnimatorListenerAdapter {
        AnonymousClass82() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onAnimationEnd$0();
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

    public void lambda$closePhoto$148(PlaceProviderObject placeProviderObject, AnimatorSet animatorSet) {
        if (placeProviderObject != null && !placeProviderObject.keepImageReceiverVisible) {
            placeProviderObject.imageReceiver.setVisible(false, true);
        }
        if (!this.doneButtonPressed) {
            releasePlayer(true);
        }
        this.animationInProgress = 3;
        this.containerView.invalidate();
        this.transitionAnimationStartTime = System.currentTimeMillis();
        this.containerView.setLayerType(2, null);
        animatorSet.start();
    }

    public void lambda$closePhoto$149(ValueAnimator valueAnimator) {
        this.clippingImageProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    public void lambda$closePhoto$150(PlaceProviderObject placeProviderObject) throws NumberFormatException {
        ArrayList arrayList;
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
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof MediaController.PhotoEntry) {
                ((MediaController.PhotoEntry) next).deleteAll();
            }
        }
    }

    public void lambda$closePhoto$151(AnimatorSet animatorSet, PlaceProviderObject placeProviderObject) {
        if (!this.doneButtonPressed) {
            releasePlayer(true);
        }
        this.animationInProgress = 2;
        this.transitionAnimationStartTime = System.currentTimeMillis();
        this.containerView.setLayerType(2, null);
        animatorSet.start();
        if (placeProviderObject != null) {
            placeProviderObject.imageReceiver.setVisible(true, true);
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
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.replaceMessagesObjects);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogDeleted);
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

    private void onPhotoClosed(final PlaceProviderObject placeProviderObject) throws NumberFormatException {
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
        VideoAds videoAds = this.ads;
        if (videoAds != null) {
            videoAds.stop();
            this.ads = null;
        }
        if (this.videoPlayerControlFrameLayout != null) {
            setVideoPlayerControlVisible(false, false);
        }
        CaptionScrollView captionScrollView = this.captionScrollView;
        if (captionScrollView != null) {
            captionScrollView.reset();
        }
        this.sendPhotoType = 0;
        this.sendPhotoTypeIsGif = false;
        this.sendPhotoTypeIsPollMedia = false;
        this.sendPhotoTypeIsPollMediaEdit = false;
        this.isDocumentsPicker = false;
        ImageReceiver.BitmapHolder bitmapHolder = this.currentThumb;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.currentThumb = null;
        }
        this.parentAlert = null;
        WindowVisibilityManager.Controller controller = this.parentAlertWindowVisibilityController;
        if (controller != null) {
            controller.destroy();
            this.parentAlertWindowVisibilityController = null;
        }
        AnimatedFileDrawable animatedFileDrawable = this.currentAnimation;
        if (animatedFileDrawable != null) {
            animatedFileDrawable.removeSecondParentView(this.containerView);
            this.currentAnimation = null;
        }
        for (int i = 0; i < 3; i++) {
            PhotoProgressView photoProgressView = this.photoProgressViews[i];
            if (photoProgressView != null) {
                photoProgressView.setBackgroundState(-1, false, true);
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
                this.f$0.lambda$onPhotoClosed$152(placeProviderObject);
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

    public void lambda$onPhotoClosed$152(PlaceProviderObject placeProviderObject) {
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
                this.f$0.lambda$redraw$153(i);
            }
        }, 100L);
    }

    public void lambda$redraw$153(int i) {
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

    public void onPause() throws NumberFormatException {
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
        videoPlayer.setLooping(allowLoopingOnPause());
    }

    private boolean allowLoopingOnPause() {
        return AndroidUtilities.isInPictureInPictureMode(this.parentActivity);
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
        if (i == 0 || i == 5 || i == 4 || i == 3) {
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
        }
        if (i == 3 && this.photoPaintView != null) {
            return AndroidUtilities.dp(8.0f) + (isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0) + this.photoPaintView.getAdditionalTop();
        }
        if (i == 0 || i == 4 || i == 5) {
            return 0;
        }
        return AndroidUtilities.dp(14.0f) + (isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0);
    }

    public int getContainerViewWidth() {
        return getContainerViewWidth(this.currentEditMode);
    }

    public int getContainerViewWidth(int i) {
        int iDp;
        int width = this.containerView.getWidth();
        if (i == 1 || (i == 0 && this.sendPhotoType == 1)) {
            iDp = AndroidUtilities.dp(32.0f);
        } else {
            if (i == 0 || i == 4 || i == 5 || i == 3) {
                return width;
            }
            iDp = AndroidUtilities.dp(28.0f);
        }
        return width - iDp;
    }

    public int getContainerViewHeight() {
        return getContainerViewHeight(this.currentEditMode);
    }

    public int getContainerViewHeight(int i) {
        return getContainerViewHeight(false, i);
    }

    private int getContainerViewHeight(boolean z, int i) {
        int measuredHeight;
        int iDp;
        if (z || this.inBubbleMode) {
            measuredHeight = this.containerView.getMeasuredHeight();
        } else {
            measuredHeight = AndroidUtilities.displaySize.y + (AndroidUtilities.navigationBarHeight - this.insets.bottom);
            if ((i == 0 || i == 4 || i == 5) && this.sendPhotoType != 1 && isStatusBarVisible()) {
                measuredHeight += AndroidUtilities.statusBarHeight;
            }
        }
        if ((i == 0 && this.sendPhotoType == 1) || i == 1) {
            iDp = AndroidUtilities.dp(144.0f);
        } else if (i == 2) {
            iDp = AndroidUtilities.dp(214.0f);
        } else {
            if (i != 3) {
                return measuredHeight;
            }
            iDp = AndroidUtilities.dp(48.0f) + this.photoPaintView.getAdditionalBottom() + ActionBar.getCurrentActionBarHeight() + this.photoPaintView.getAdditionalTop();
        }
        return measuredHeight - iDp;
    }

    public boolean onTouchEvent(android.view.MotionEvent r21) throws java.lang.NumberFormatException {
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
        float f2 = this.animateToScale - f;
        float f3 = this.animationValue;
        float f4 = f + (f2 * f3);
        float f5 = this.translationX;
        float f6 = f5 + ((this.animateToX - f5) * f3);
        float f7 = this.translationY;
        float f8 = f7 + ((this.animateToY - f7) * f3);
        float f9 = this.rotate;
        float f10 = f9 + ((this.animateToRotate - f9) * f3);
        animatorSet.cancel();
        this.scale = f4;
        this.translationX = f6;
        this.translationY = f8;
        this.animationStartTime = 0L;
        this.rotate = f10;
        updateMinMax(f4);
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
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<PhotoViewer, Float>) AnimationProperties.PHOTO_VIEWER_ANIMATION_VALUE, 0.0f, 1.0f));
        this.imageMoveAnimation.setInterpolator(this.interpolator);
        this.imageMoveAnimation.setDuration(i);
        this.imageMoveAnimation.addListener(new AnimatorListenerAdapter() {
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

    public List getImagesArrLocals() {
        return this.imagesArrLocals;
    }

    public void setAnimationValue(float f) {
        this.animationValue = f;
        this.containerView.invalidate();
        invalidateBlur();
    }

    public float getAnimationValue() {
        return this.animationValue;
    }

    private void switchToNextIndex(int i, boolean z) throws Resources.NotFoundException, NumberFormatException {
        if (this.currentMessageObject != null) {
            releasePlayer(false);
            FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.currentMessageObject.getDocument());
        } else if (this.currentPageBlock != null) {
            TLObject media = this.pageBlocksAdapter.getMedia(this.currentIndex);
            if (media instanceof TLRPC.Document) {
                releasePlayer(false);
                FileLoader.getInstance(this.currentAccount).cancelLoadFile((TLRPC.Document) media);
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
        try {
            CastSync.check(0);
            if (ChromecastController.getInstance().isCasting()) {
                ChromecastController.getInstance().setCurrentMediaAndCastIfNeeded(getCurrentChromecastMedia());
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public boolean shouldMessageObjectAutoPlayed(MessageObject messageObject) {
        return messageObject != null && messageObject.isVideo() && (messageObject.mediaExists || messageObject.attachPathExists || messageObject.hasVideoQualities() || (messageObject.canStreamVideo() && SharedConfig.streamMedia)) && SharedConfig.isAutoplayVideo();
    }

    private boolean shouldIndexAutoPlayed(int i) {
        PageBlocksAdapter pageBlocksAdapter = this.pageBlocksAdapter;
        if (pageBlocksAdapter == null) {
            return false;
        }
        if ((!pageBlocksAdapter.isVideo(i) && !this.pageBlocksAdapter.isHardwarePlayer(i)) || !SharedConfig.isAutoplayVideo()) {
            return false;
        }
        File file = this.pageBlocksAdapter.getFile(i);
        if (file == null || !file.exists()) {
            return SharedConfig.streamMedia && (this.pageBlocksAdapter.getMedia(i) instanceof TLRPC.Document);
        }
        return true;
    }

    public float getCropFillScale(boolean z) {
        int bitmapHeight = z ? this.centerImage.getBitmapHeight() : this.centerImage.getBitmapWidth();
        int bitmapWidth = z ? this.centerImage.getBitmapWidth() : this.centerImage.getBitmapHeight();
        float fMin = Math.min(this.photoCropView.getMeasuredWidth(), (this.photoCropView.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - (isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.dp(16.0f) * 2);
        return Math.max(fMin / bitmapHeight, fMin / bitmapWidth);
    }

    public boolean isStatusBarVisible() {
        return !this.inBubbleMode;
    }

    public void onDraw(android.graphics.Canvas r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.onDraw(android.graphics.Canvas):void");
    }

    public void lambda$onDraw$154() throws Resources.NotFoundException, NumberFormatException {
        switchToNextIndex(1, false);
    }

    public void lambda$onDraw$155() throws Resources.NotFoundException, NumberFormatException {
        switchToNextIndex(-1, false);
    }

    public void lambda$onDraw$156() {
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
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint.setXfermode(new PorterDuffXfermode(mode));
                Paint paint2 = new Paint(1);
                this.bottomFancyShadowPaint = paint2;
                paint2.setXfermode(new PorterDuffXfermode(mode));
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.topFancyShadow = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
                this.bottomFancyShadow = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
                this.topFancyShadowMatrix = new Matrix();
                this.bottomFancyShadowMatrix = new Matrix();
                this.topFancyShadowPaint.setShader(this.topFancyShadow);
                this.bottomFancyShadowPaint.setShader(this.bottomFancyShadow);
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, this.containerView.getWidth(), this.containerView.getHeight() + AndroidUtilities.navigationBarHeight, (int) (f * (this.backgroundDrawable.getAlpha() - 127) * 2.007874f), 31);
            this.clipFancyShadows.rewind();
            Path path = this.clipFancyShadows;
            float width = this.containerView.getWidth();
            float f2 = currentActionBarHeight;
            Path.Direction direction = Path.Direction.CW;
            path.addRect(0.0f, 0.0f, width, f2, direction);
            this.clipFancyShadows.addRect(0.0f, (this.containerView.getHeight() + AndroidUtilities.navigationBarHeight) - height, this.containerView.getWidth(), this.containerView.getHeight() + AndroidUtilities.navigationBarHeight, direction);
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

    public void onActionClick(boolean r14) throws java.lang.NumberFormatException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.onActionClick(boolean):void");
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        if (!this.doubleTap && this.checkImageView.getVisibility() != 0) {
            boolean[] zArr = this.drawPressedDrawable;
            if (!zArr[0] && !zArr[1]) {
                float x = motionEvent.getX();
                if (x < Math.min(135, this.containerView.getMeasuredWidth() / 8)) {
                    if (this.leftImage.hasImageSet()) {
                        this.drawPressedDrawable[0] = true;
                        this.containerView.invalidate();
                    }
                } else if (x > this.containerView.getMeasuredWidth() - r0 && this.rightImage.hasImageSet()) {
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
        if (this.checkImageView.getVisibility() == 0) {
            return true;
        }
        boolean[] zArr = this.drawPressedDrawable;
        if (zArr[0] || zArr[1]) {
            return true;
        }
        float x = motionEvent.getX();
        if ((x < Math.min(135, this.containerView.getMeasuredWidth() / 8) || x > this.containerView.getMeasuredWidth() - r3) && (messageObject = this.currentMessageObject) != null) {
            return (messageObject.isVideo() || ((photoViewerWebView = this.photoViewerWebView) != null && photoViewerWebView.isControllable())) && SystemClock.elapsedRealtime() - this.lastPhotoSetTime >= 500 && canDoubleTapSeekVideo(motionEvent);
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
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer == null || this.scale > 1.35f) {
            return;
        }
        long currentPosition = videoPlayer.getCurrentPosition();
        long duration = this.videoPlayer.getDuration();
        if (currentPosition == -9223372036854775807L || duration < 8000) {
            return;
        }
        float f = this.longPressX;
        int containerViewWidth = getContainerViewWidth();
        boolean z = false;
        if (duration > 180000) {
            int i = containerViewWidth / 3;
            if (f >= i * 2) {
                z = true;
            } else if (f >= i) {
                return;
            }
            this.longVideoPlayerRewinder.startRewind(this.videoPlayer, z, this.currentVideoSpeed);
            return;
        }
        this.videoPlayerRewinder.startRewind(this.videoPlayer, f > ((float) (containerViewWidth / 3)), this.longPressX, this.currentVideoSpeed, this.seekSpeedDrawable);
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
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) throws Resources.NotFoundException, NumberFormatException {
        PhotoViewerWebView photoViewerWebView;
        MessageObject messageObject;
        MessageObject messageObject2;
        if (this.discardTap) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (this.checkImageView.getVisibility() != 0 && SharedConfig.nextMediaTap && this.sendPhotoType != 11 && y > ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.dp(40.0f)) {
            if (x < Math.min(135, this.containerView.getMeasuredWidth() / 8)) {
                if (this.leftImage.hasImageSet()) {
                    switchToNextIndex(-1, true);
                    return true;
                }
            } else if (x > this.containerView.getMeasuredWidth() - r4 && this.rightImage.hasImageSet()) {
                switchToNextIndex(1, true);
                return true;
            }
        }
        MessageObject messageObject3 = this.currentMessageObject;
        if (messageObject3 != null && messageObject3.isSponsored() && x >= (getContainerViewWidth() - this.centerImage.getImageWidth()) / 2.0f && x <= (getContainerViewWidth() + this.centerImage.getImageWidth()) / 2.0f && y >= (getContainerViewHeight() - this.centerImage.getImageHeight()) / 2.0f && y <= (getContainerViewHeight() + this.centerImage.getImageHeight()) / 2.0f) {
            BaseFragment baseFragment = this.parentFragment;
            if (baseFragment instanceof ChatActivity) {
                ((ChatActivity) baseFragment).logSponsoredClicked(this.currentMessageObject, true, true);
            }
            closePhoto(true, false);
            String str = this.currentMessageObject.sponsoredUrl;
            if (str != null) {
                Context context = LaunchActivity.instance;
                if (context == null) {
                    context = this.activityContext;
                }
                Browser.openUrl(context, Uri.parse(str), true, false, false, null, null, false, MessagesController.getInstance(this.currentAccount).sponsoredLinksInappAllow, false);
            }
            return true;
        }
        PhotoViewerWebView photoViewerWebView2 = this.photoViewerWebView;
        if (photoViewerWebView2 != null && photoViewerWebView2.isControllable() && this.isActionBarVisible) {
            WebView webView = this.photoViewerWebView.getWebView();
            if (x >= webView.getX() && x <= webView.getX() + webView.getWidth() && y >= webView.getY() && y <= webView.getY() + webView.getHeight()) {
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.setAction(0);
                motionEventObtain.offsetLocation(-webView.getX(), -webView.getY());
                webView.dispatchTouchEvent(motionEventObtain);
                motionEventObtain.setAction(1);
                webView.dispatchTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                scheduleActionBarHide();
                return true;
            }
        }
        if (this.containerView.getTag() != null) {
            AspectRatioFrameLayout aspectRatioFrameLayout = this.aspectRatioFrameLayout;
            boolean z = (aspectRatioFrameLayout != null && aspectRatioFrameLayout.getVisibility() == 0) || ((photoViewerWebView = this.photoViewerWebView) != null && photoViewerWebView.isControllable());
            if (this.sharedMediaType == 1 && (messageObject2 = this.currentMessageObject) != null) {
                if (!messageObject2.canPreviewDocument()) {
                    float containerViewHeight = (getContainerViewHeight() - AndroidUtilities.dp(360.0f)) / 2.0f;
                    if (y >= containerViewHeight && y <= containerViewHeight + AndroidUtilities.dp(360.0f)) {
                        onActionClick(true);
                        return true;
                    }
                }
            } else {
                PhotoProgressView photoProgressView = this.photoProgressViews[0];
                if (photoProgressView != null && this.containerView != null) {
                    int i = photoProgressView.backgroundState;
                    if ((x >= (getContainerViewWidth() - AndroidUtilities.dp(100.0f)) / 2.0f && x <= (getContainerViewWidth() + AndroidUtilities.dp(100.0f)) / 2.0f && y >= (getContainerViewHeight() - AndroidUtilities.dp(100.0f)) / 2.0f && y <= (getContainerViewHeight() + AndroidUtilities.dp(100.0f)) / 2.0f) || this.centerImageIsLivePhoto) {
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
            if ((photoViewerWebView3 == null || !photoViewerWebView3.isControllable() || this.photoViewerWebView.isPlaying() || !this.isActionBarVisible) && ((messageObject = this.currentMessageObject) == null || !messageObject.isSponsored())) {
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
                TLRPC.BotInlineResult botInlineResult = this.currentBotInlineResult;
                if (botInlineResult != null && (botInlineResult.type.equals("video") || MessageObject.isVideoDocument(this.currentBotInlineResult.document))) {
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
        if (this.videoPlayer == null && ((photoViewerWebView = this.photoViewerWebView) == null || !photoViewerWebView.isControllable())) {
            return false;
        }
        boolean z = motionEvent.getX() >= ((float) ((getContainerViewWidth() / 3) * 2));
        long currentVideoPosition = getCurrentVideoPosition();
        long videoDuration = getVideoDuration();
        if (currentVideoPosition == -9223372036854775807L || videoDuration <= 15000) {
            return false;
        }
        return !z || videoDuration - currentVideoPosition > 10000;
    }

    @Override
    public boolean onDoubleTap(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.onDoubleTap(android.view.MotionEvent):boolean");
    }

    private class QualityChooseView extends View {
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
            this.paint = new Paint(1);
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            this.textPaint.setColor(-3289651);
            this.lowQualityDescription = LocaleController.getString("AccDescrVideoCompressLow", R.string.AccDescrVideoCompressLow);
            this.hightQualityDescription = LocaleController.getString("AccDescrVideoCompressHigh", R.string.AccDescrVideoCompressHigh);
            setImportantForAccessibility(1);
            setFocusable(true);
            setAccessibilityDelegate(new IntSeekBarAccessibilityDelegate() {
                @Override
                protected int getProgress() {
                    return PhotoViewer.this.selectedCompression;
                }

                @Override
                protected void setProgress(int i) throws NumberFormatException {
                    int iMax;
                    if (PhotoViewer.this.compressionsCount > 0 && (iMax = Math.max(0, Math.min(PhotoViewer.this.compressionsCount - 1, i))) != PhotoViewer.this.selectedCompression) {
                        QualityChooseView qualityChooseView = QualityChooseView.this;
                        qualityChooseView.startMovingQuality = PhotoViewer.this.selectedCompression;
                        PhotoViewer.this.selectedCompression = iMax;
                        PhotoViewer.this.didChangedCompressionLevel(false);
                        QualityChooseView.this.invalidate();
                        if (PhotoViewer.this.selectedCompression != QualityChooseView.this.startMovingQuality) {
                            PhotoViewer.this.requestVideoPreview(1);
                        }
                    }
                }

                @Override
                protected int getMaxValue() {
                    return Math.max(0, PhotoViewer.this.compressionsCount - 1);
                }

                @Override
                protected CharSequence getContentDescription(View view) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
                    if (PhotoViewer.this.compressionsCount > 0) {
                        sb.append(", ");
                        sb.append(PhotoViewer.this.selectedCompression + 1);
                        sb.append(" / ");
                        sb.append(PhotoViewer.this.compressionsCount);
                    }
                    sb.append(", ");
                    sb.append(QualityChooseView.this.lowQualityDescription);
                    sb.append(" – ");
                    sb.append(QualityChooseView.this.hightQualityDescription);
                    return sb.toString();
                }
            });
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) throws NumberFormatException {
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
                    int i6 = i2 + (((i4 * 2) + i3 + i5) * i);
                    int i7 = i5 / 2;
                    int i8 = i6 + i7;
                    int i9 = (i3 / 2) + i7 + i4;
                    if (x <= i8 - i9 || x >= i8 + i9) {
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
                    canvas.drawRect((i == PhotoViewer.this.selectedCompression + 1 ? AndroidUtilities.dpf2(2.0f) : 0.0f) + (((i5 - (this.circleSize / 2)) - this.gapSize) - this.lineSize), measuredHeight - AndroidUtilities.dp(1.0f), (r0 + this.lineSize) - (i == PhotoViewer.this.selectedCompression ? AndroidUtilities.dpf2(2.0f) : 0.0f), AndroidUtilities.dp(2.0f) + measuredHeight, this.paint);
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
            videoPlayer.setMute(CastSync.isActive() || this.muteVideo);
        }
        if (!this.videoConvertSupported) {
            this.muteButton.setEnabled(false);
            this.muteButton.setClickable(false);
            this.muteButton.animate().alpha(0.5f).setDuration(180L).start();
            this.videoTimelineView.setMode(0);
            return;
        }
        this.muteButton.setEnabled(true);
        this.muteButton.setClickable(true);
        this.muteButton.animate().alpha(1.0f).setDuration(180L).start();
        if (this.muteVideo) {
            if (this.customTitle == null) {
                this.actionBarContainer.setSubtitle(LocaleController.getString("SoundMuted", R.string.SoundMuted));
            }
            this.muteDrawable.setMuted(true, true);
            if (this.compressItem.getTag() != null) {
                this.compressItem.setAlpha(0.5f);
                this.compressItem.setEnabled(false);
            }
            if (this.sendPhotoType == 1) {
                this.videoTimelineView.setMaxProgressDiff(9600.0f / this.videoDuration);
                this.videoTimelineView.setMode(1);
                updateVideoInfo();
                return;
            } else {
                this.videoTimelineView.setMaxProgressDiff(1.0f);
                this.videoTimelineView.setMode(0);
                return;
            }
        }
        this.actionBarContainer.setSubtitle(this.currentSubtitle);
        this.muteDrawable.setMuted(false, true);
        if (this.compressItem.getTag() != null) {
            this.compressItem.setAlpha(1.0f);
            this.compressItem.setEnabled(true);
        }
        this.videoTimelineView.setMaxProgressDiff(1.0f);
        this.videoTimelineView.setMode(0);
    }

    public void didChangedCompressionLevel(boolean z) throws NumberFormatException {
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putInt(String.format("compress_video_%d", Integer.valueOf(this.compressionsCount)), this.selectedCompression);
        editorEdit.commit();
        updateWidthHeightBitrateForCompression();
        updateVideoInfo();
        if (z) {
            requestVideoPreview(1);
        }
    }

    private void calculateEstimatedVideoSize(boolean z, boolean z2) {
        if (z) {
            long j = (long) (((z2 ? 0L : this.audioFramesSize) + this.videoFramesSize) * (this.estimatedDuration / this.videoDuration));
            this.estimatedSize = j + ((j / 32768) * 16);
            return;
        }
        float f = this.originalSize;
        float f2 = this.estimatedDuration / this.videoDuration;
        long j2 = (long) (f * f2);
        this.estimatedSize = j2;
        if (z2) {
            this.estimatedSize = j2 - ((long) (this.audioFramesSize * f2));
        }
    }

    private boolean needEncoding() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.needEncoding():boolean");
    }

    public void updateVideoInfo() {
        int i;
        if (this.actionBar == null) {
            return;
        }
        if (this.compressionsCount == 0) {
            this.actionBarContainer.setSubtitle(null);
            return;
        }
        if (!this.centerImageIsLivePhoto) {
            this.compressItem.setState(this.videoConvertSupported && this.compressionsCount > 1, this.muteVideo, Math.min(this.resultWidth, this.resultHeight));
        }
        this.itemsLayout.requestLayout();
        this.estimatedDuration = (long) Math.ceil((this.videoTimelineView.getRightProgress() - this.videoTimelineView.getLeftProgress()) * this.videoDuration);
        this.videoCutStart = this.videoTimelineView.getLeftProgress();
        this.videoCutEnd = this.videoTimelineView.getRightProgress();
        int i2 = this.rotationValue;
        int i3 = (i2 == 90 || i2 == 270) ? this.resultHeight : this.resultWidth;
        int i4 = this.rotationValue;
        int i5 = (i4 == 90 || i4 == 270) ? this.resultWidth : this.resultHeight;
        boolean zNeedEncoding = needEncoding();
        if (this.muteVideo) {
            if (this.sendPhotoType == 1) {
                long j = this.estimatedDuration;
                i = j <= 2000 ? 2600000 : j <= 5000 ? 2200000 : 1560000;
            } else {
                i = 921600;
            }
            long j2 = (long) ((i / 8) * (this.estimatedDuration / 1000.0f));
            this.estimatedSize = j2 + ((j2 / 32768) * 16);
        } else {
            calculateEstimatedVideoSize(zNeedEncoding, this.sendPhotoType == 1);
        }
        float f = this.videoCutStart;
        if (f == 0.0f) {
            this.startTime = -1L;
        } else {
            this.startTime = ((long) (f * this.videoDuration)) * 1000;
        }
        float f2 = this.videoCutEnd;
        if (f2 == 1.0f) {
            this.endTime = -1L;
        } else {
            this.endTime = ((long) (f2 * this.videoDuration)) * 1000;
        }
        this.currentSubtitle = String.format("%s, %s", String.format("%dx%d", Integer.valueOf(i3), Integer.valueOf(i5)), String.format("%s, ~%s", AndroidUtilities.formatShortDuration((int) (this.estimatedDuration / 1000)), AndroidUtilities.formatFileSize(this.estimatedSize)));
        this.actionBar.beginDelayedTransition();
        if (this.customTitle == null) {
            this.actionBarContainer.setSubtitle(this.muteVideo ? LocaleController.getString("SoundMuted", R.string.SoundMuted) : this.currentSubtitle);
        }
    }

    public void requestVideoPreview(int i) throws NumberFormatException {
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
                PhotoProgressView photoProgressView = this.photoProgressViews[0];
                photoProgressView.setProgress(0.0f, photoProgressView.backgroundState == 0 || this.photoProgressViews[0].previousBackgroundState == 0);
                this.photoProgressViews[0].setBackgroundState(3, false, true);
                if (!z) {
                    preparePlayer(this.currentPlayingVideoQualityFiles, this.currentPlayingVideoFile, false, false, this.editState.savedFilterState, false, 0L);
                    this.videoPlayer.seekTo((long) (this.videoTimelineView.getLeftProgress() * this.videoDuration));
                } else {
                    this.loadInitialVideo = true;
                }
            } else {
                releasePlayer(false);
                if (this.videoPreviewMessageObject == null) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.id = 0;
                    tL_message.message = "";
                    tL_message.media = new TLRPC.TL_messageMediaEmpty();
                    tL_message.action = new TLRPC.TL_messageActionEmpty();
                    tL_message.dialog_id = this.currentDialogId;
                    MessageObject messageObject = new MessageObject(UserConfig.selectedAccount, tL_message, false, false);
                    this.videoPreviewMessageObject = messageObject;
                    messageObject.messageOwner.attachPath = new File(FileLoader.getDirectory(4), "video_preview.mp4").getAbsolutePath();
                    this.videoPreviewMessageObject.videoEditedInfo = new VideoEditedInfo();
                    VideoEditedInfo videoEditedInfo = this.videoPreviewMessageObject.videoEditedInfo;
                    videoEditedInfo.rotationValue = this.rotationValue;
                    videoEditedInfo.originalWidth = this.originalWidth;
                    this.videoPreviewMessageObject.videoEditedInfo.originalHeight = this.originalHeight;
                    VideoEditedInfo videoEditedInfo2 = this.videoPreviewMessageObject.videoEditedInfo;
                    videoEditedInfo2.framerate = this.videoFramerate;
                    Uri uri = this.currentPlayingVideoFile;
                    if (uri == null) {
                        videoEditedInfo2.originalPath = uri.getPath();
                    } else {
                        videoEditedInfo2.originalPath = uri.getPath();
                    }
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
                    j2 = (long) (this.videoDuration * 1000.0f);
                }
                if (j2 - j > 5000000) {
                    videoEditedInfo3.endTime = j + 5000000;
                }
                videoEditedInfo3.bitrate = this.bitrate;
                this.videoPreviewMessageObject.videoEditedInfo.resultWidth = this.resultWidth;
                this.videoPreviewMessageObject.videoEditedInfo.resultHeight = this.resultHeight;
                VideoEditedInfo videoEditedInfo4 = this.videoPreviewMessageObject.videoEditedInfo;
                videoEditedInfo4.needUpdateProgress = true;
                videoEditedInfo4.originalDuration = (long) (this.videoDuration * 1000.0f);
                if (!MediaController.getInstance().scheduleVideoConvert(this.videoPreviewMessageObject, true, true, true)) {
                    this.tryStartRequestPreviewOnFinish = true;
                }
                this.requestingPreview = true;
                PhotoProgressView photoProgressView2 = this.photoProgressViews[0];
                photoProgressView2.setProgress(0.0f, photoProgressView2.backgroundState == 0 || this.photoProgressViews[0].previousBackgroundState == 0);
                this.photoProgressViews[0].setBackgroundState(0, false, true);
            }
        } else {
            this.tryStartRequestPreviewOnFinish = false;
            this.photoProgressViews[0].setBackgroundState(3, false, true);
            if (i == 2) {
                preparePlayer(this.currentPlayingVideoQualityFiles, this.currentPlayingVideoFile, false, false, this.editState.savedFilterState, false, 0L);
                this.videoPlayer.seekTo((long) (this.videoTimelineView.getLeftProgress() * this.videoDuration));
            }
        }
        this.containerView.invalidate();
    }

    private Size calculateResultVideoSize() {
        int iRound;
        int i;
        if (this.compressionsCount == 1) {
            return new Size(this.originalWidth, this.originalHeight);
        }
        int i2 = this.selectedCompression;
        float f = (i2 != 0 ? i2 != 1 ? i2 != 2 ? 1920.0f : 1280.0f : 854.0f : 480.0f) / (this.originalWidth > this.originalHeight ? this.originalWidth : this.originalHeight);
        if (this.selectedCompression == this.compressionsCount - 1 && f >= 1.0f) {
            i = this.originalWidth;
            iRound = this.originalHeight;
        } else {
            int iRound2 = Math.round((this.originalWidth * f) / 2.0f) * 2;
            iRound = Math.round((this.originalHeight * f) / 2.0f) * 2;
            i = iRound2;
        }
        int i3 = i % 4;
        if (i3 != 0 || iRound % 4 != 0) {
            i = (i - i3) - (iRound % 4);
        }
        return new Size(i, iRound);
    }

    public void prepareRealEncoderBitrate() {
        if (this.bitrate == 0 || this.sendPhotoType == 1) {
            return;
        }
        Size sizeCalculateResultVideoSize = calculateResultVideoSize();
        if (sizeCalculateResultVideoSize.getWidth() == this.originalWidth && sizeCalculateResultVideoSize.getHeight() == this.originalHeight) {
            MediaController.extractRealEncoderBitrate(sizeCalculateResultVideoSize.getWidth(), sizeCalculateResultVideoSize.getHeight(), this.originalBitrate, false);
        } else {
            MediaController.extractRealEncoderBitrate(sizeCalculateResultVideoSize.getWidth(), sizeCalculateResultVideoSize.getHeight(), MediaController.makeVideoBitrate(this.originalHeight, this.originalWidth, this.originalBitrate, sizeCalculateResultVideoSize.getHeight(), sizeCalculateResultVideoSize.getWidth()), false);
        }
    }

    public void updateWidthHeightBitrateForCompression() {
        int iExtractRealEncoderBitrate;
        if (this.compressionsCount <= 0) {
            return;
        }
        if (this.selectedCompression >= this.compressionsCount) {
            this.selectedCompression = this.compressionsCount - 1;
        }
        if (this.sendPhotoType == 1) {
            float fMax = Math.max(800.0f / this.originalWidth, 800.0f / this.originalHeight);
            this.resultWidth = Math.round((this.originalWidth * fMax) / 2.0f) * 2;
            this.resultHeight = Math.round((this.originalHeight * fMax) / 2.0f) * 2;
        } else {
            Size sizeCalculateResultVideoSize = calculateResultVideoSize();
            this.resultWidth = sizeCalculateResultVideoSize.getWidth();
            this.resultHeight = sizeCalculateResultVideoSize.getHeight();
        }
        if (this.bitrate != 0) {
            if (this.sendPhotoType == 1) {
                this.bitrate = 1560000;
                iExtractRealEncoderBitrate = this.bitrate;
            } else if (this.resultWidth == this.originalWidth && this.resultHeight == this.originalHeight) {
                this.bitrate = this.originalBitrate;
                iExtractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(this.resultWidth, this.resultHeight, this.bitrate, false);
            } else {
                this.bitrate = MediaController.makeVideoBitrate(this.originalHeight, this.originalWidth, this.originalBitrate, this.resultHeight, this.resultWidth);
                iExtractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(this.resultWidth, this.resultHeight, this.bitrate, false);
            }
            this.videoFramesSize = (long) (((iExtractRealEncoderBitrate / 8) * this.videoDuration) / 1000.0f);
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
            FrameLayout frameLayout = this.pickerView;
            Property property = View.TRANSLATION_Y;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 0.0f, frameLayout.getHeight() + this.captionEdit.getEditTextHeight() + (this.isCurrentVideo ? AndroidUtilities.dp(58.0f) : 0));
            FrameLayout frameLayout2 = this.pickerView;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.pickerViewSendButton, (Property<ChatActivityEnterView.SendButton, Float>) property, 0.0f, AndroidUtilities.dp(158.0f)), ObjectAnimator.ofFloat(this.navigationBar, (Property<View, Float>) property2, this.fancyShadows ? 0.0f : 1.0f, 1.0f));
        } else {
            this.qualityChooseView.setTag(null);
            AnimatorSet animatorSet3 = this.qualityChooseViewAnimation;
            QualityChooseView qualityChooseView = this.qualityChooseView;
            Property property3 = View.TRANSLATION_Y;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(qualityChooseView, (Property<QualityChooseView, Float>) property3, 0.0f, AndroidUtilities.dp(166.0f)), ObjectAnimator.ofFloat(this.qualityPicker, (Property<PickerBottomLayoutViewer, Float>) property3, 0.0f, AndroidUtilities.dp(166.0f)), ObjectAnimator.ofFloat(this.navigationBar, (Property<View, Float>) View.ALPHA, 1.0f, this.fancyShadows ? 0.0f : 1.0f));
        }
        this.qualityChooseViewAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (animator.equals(PhotoViewer.this.qualityChooseViewAnimation)) {
                    PhotoViewer.this.qualityChooseViewAnimation = new AnimatorSet();
                    if (z) {
                        PhotoViewer.this.qualityChooseView.setVisibility(0);
                        PhotoViewer.this.qualityPicker.setVisibility(0);
                        AnimatorSet animatorSet4 = PhotoViewer.this.qualityChooseViewAnimation;
                        QualityChooseView qualityChooseView2 = PhotoViewer.this.qualityChooseView;
                        Property property4 = View.TRANSLATION_Y;
                        animatorSet4.playTogether(ObjectAnimator.ofFloat(qualityChooseView2, (Property<QualityChooseView, Float>) property4, 0.0f), ObjectAnimator.ofFloat(PhotoViewer.this.qualityPicker, (Property<PickerBottomLayoutViewer, Float>) property4, 0.0f));
                    } else {
                        if (PhotoViewer.this.fancyShadows) {
                            PhotoViewer.this.navigationBar.setVisibility(8);
                            PhotoViewer.this.navigationBar.setAlpha(0.0f);
                            PhotoViewer.this.navigationBar.setBackgroundColor(PhotoViewer.this.sendPhotoType == 11 ? -16777216 : 2130706432);
                        }
                        PhotoViewer.this.qualityChooseView.setVisibility(4);
                        PhotoViewer.this.qualityPicker.setVisibility(4);
                        AnimatorSet animatorSet5 = PhotoViewer.this.qualityChooseViewAnimation;
                        FrameLayout frameLayout3 = PhotoViewer.this.pickerView;
                        Property property5 = View.TRANSLATION_Y;
                        animatorSet5.playTogether(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property5, 0.0f), ObjectAnimator.ofFloat(PhotoViewer.this.pickerView, (Property<FrameLayout, Float>) View.ALPHA, 1.0f), ObjectAnimator.ofFloat(PhotoViewer.this.pickerViewSendButton, (Property<ChatActivityEnterView.SendButton, Float>) property5, 0.0f));
                    }
                    PhotoViewer.this.qualityChooseViewAnimation.addListener(new AnimatorListenerAdapter() {
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
        if (this.muteButton.getVisibility() == 0) {
            this.muteButton.animate().scaleX(z ? 0.25f : 1.0f).scaleY(z ? 0.25f : 1.0f).alpha(z ? 0.0f : 1.0f).setDuration(200L);
        }
        if (this.livePhotoButton.getVisibility() == 0) {
            this.livePhotoButton.animate().scaleX(z ? 0.25f : 1.0f).scaleY(z ? 0.25f : 1.0f).alpha(z ? 0.0f : 1.0f).setDuration(200L);
        }
        if (this.editCoverButton.getVisibility() == 0) {
            this.editCoverButton.animate().scaleX(z ? 0.25f : 1.0f).scaleY(z ? 0.25f : 1.0f).alpha(z ? 0.0f : 1.0f).setDuration(200L);
        }
    }

    private void processOpenVideo(String str, long j, boolean z, float f, float f2, int i, long j2) {
        if (this.currentLoadingVideoRunnable != null) {
            Utilities.globalQueue.cancelRunnable(this.currentLoadingVideoRunnable);
            this.currentLoadingVideoRunnable = null;
        }
        this.videoTimelineView.setVideoPath(str, j, f, f2, j2);
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
        AnonymousClass88 anonymousClass88 = new AnonymousClass88(str, j, i);
        this.currentLoadingVideoRunnable = anonymousClass88;
        dispatchQueue.postRunnable(anonymousClass88);
    }

    class AnonymousClass88 implements Runnable {
        final int val$compressQuality;
        final String val$videoPath;
        final long val$videoPathOffset;

        AnonymousClass88(String str, long j, int i) {
            this.val$videoPath = str;
            this.val$videoPathOffset = j;
            this.val$compressQuality = i;
        }

        @Override
        public void run() {
            if (PhotoViewer.this.currentLoadingVideoRunnable != this) {
                return;
            }
            int videoBitrate = MediaController.getVideoBitrate(this.val$videoPath);
            final int[] iArr = new int[11];
            AnimatedFileDrawable.getVideoInfo(this.val$videoPath, iArr, this.val$videoPathOffset);
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
                int iSelectCompression = this.val$compressQuality;
                if (iSelectCompression == -1) {
                    iSelectCompression = photoViewer6.selectCompression();
                }
                photoViewer6.selectedCompression = iSelectCompression;
                PhotoViewer.this.prepareRealEncoderBitrate();
                PhotoViewer.this.isH264Video = MediaController.isH264Video(this.val$videoPath);
            }
            if (PhotoViewer.this.currentLoadingVideoRunnable != this) {
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$run$0(this, iArr);
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
            PhotoViewer.this.videoFramesSize = (long) (((r5.bitrate / 8) * PhotoViewer.this.videoDuration) / 1000.0f);
            if (PhotoViewer.this.videoConvertSupported) {
                PhotoViewer.this.rotationValue = iArr[8];
                PhotoViewer.this.updateWidthHeightBitrateForCompression();
                if (PhotoViewer.this.selectedCompression > PhotoViewer.this.compressionsCount - 1) {
                    PhotoViewer photoViewer = PhotoViewer.this;
                    photoViewer.selectedCompression = photoViewer.compressionsCount - 1;
                }
                if (!PhotoViewer.this.centerImageIsLivePhoto) {
                    PhotoViewer.this.compressItem.setState(PhotoViewer.this.compressionsCount > 1, PhotoViewer.this.muteVideo, Math.min(PhotoViewer.this.resultWidth, PhotoViewer.this.resultHeight));
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("compressionsCount = " + PhotoViewer.this.compressionsCount + " w = " + PhotoViewer.this.originalWidth + " h = " + PhotoViewer.this.originalHeight + " r = " + PhotoViewer.this.rotationValue);
                }
                PhotoViewer.this.qualityChooseView.invalidate();
            } else {
                if (!PhotoViewer.this.centerImageIsLivePhoto) {
                    PhotoViewer.this.compressItem.setState(false, PhotoViewer.this.muteVideo, Math.min(PhotoViewer.this.resultWidth, PhotoViewer.this.resultHeight));
                }
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
        int iMax = Math.max(i, i2);
        if (iMax > 1280) {
            this.compressionsCount = 4;
            return;
        }
        if (iMax > 854) {
            this.compressionsCount = 3;
        } else if (iMax > 640) {
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

    class ListAdapter extends RecyclerListView.SelectionAdapter {
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
                    this.f$0.lambda$onCreateViewHolder$0(view);
                }
            });
            return new RecyclerListView.Holder(photoPickerPhotoCell);
        }

        public void lambda$onCreateViewHolder$0(View view) {
            Object tag = ((View) view.getParent()).getTag();
            int iIndexOf = PhotoViewer.this.imagesArrLocals.indexOf(tag);
            if (iIndexOf >= 0) {
                int photoChecked = PhotoViewer.this.placeProvider.setPhotoChecked(iIndexOf, PhotoViewer.this.getCurrentVideoEditedInfo());
                boolean zIsPhotoChecked = PhotoViewer.this.placeProvider.isPhotoChecked(iIndexOf);
                if (iIndexOf == PhotoViewer.this.currentIndex) {
                    PhotoViewer.this.checkImageView.setChecked(-1, zIsPhotoChecked, true);
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
                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
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
                return;
            }
            if (obj instanceof MediaController.SearchImage) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                photoPickerPhotoCell.setTag(searchImage);
                photoPickerPhotoCell.setImage(searchImage);
                photoPickerPhotoCell.videoInfoContainer.setVisibility(4);
                photoPickerPhotoCell.setChecked(-1, true, false);
                photoPickerPhotoCell.checkBox.setVisibility(0);
            }
        }
    }

    class FirstFrameView extends ImageView {
        private VideoPlayer currentVideoPlayer;
        private ValueAnimator fadeAnimator;
        private final TimeInterpolator fadeInterpolator;
        private boolean gettingFrame;
        private int gettingFrameIndex;
        private boolean gotError;
        private boolean hasFrame;

        public FirstFrameView(Context context) {
            super(context);
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
                if (!this.hasFrame && !this.gotError && !this.gettingFrame && duration < 5250.0f) {
                    final Uri currentUri = videoPlayer.getCurrentUri();
                    final int i = this.gettingFrameIndex + 1;
                    this.gettingFrameIndex = i;
                    Utilities.globalQueue.postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$checkFromPlayer$2(currentUri, i);
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
                        this.f$0.lambda$checkFromPlayer$0(i, frameAtTime);
                    }
                });
            } catch (Throwable th) {
                FileLog.e(th);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$checkFromPlayer$1();
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
                long jMax = Math.max(0L, PhotoViewer.this.videoPlayer.getDuration() - PhotoViewer.this.videoPlayer.getCurrentPosition());
                float fMax = 1.0f - Math.max(Math.min(jMax / 250.0f, 1.0f), 0.0f);
                if (fMax > 0.0f) {
                    if (PhotoViewer.this.videoPlayer.isPlaying()) {
                        if (this.fadeAnimator == null) {
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fMax, 1.0f);
                            this.fadeAnimator = valueAnimatorOfFloat;
                            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    this.f$0.lambda$updateAlpha$3(valueAnimator);
                                }
                            });
                            this.fadeAnimator.setDuration(jMax);
                            this.fadeAnimator.setInterpolator(this.fadeInterpolator);
                            this.fadeAnimator.start();
                            setAlpha(fMax);
                            return;
                        }
                        return;
                    }
                    ValueAnimator valueAnimator = this.fadeAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.fadeAnimator = null;
                    }
                    setAlpha(fMax);
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

    public boolean BLUR_RENDERNODE() {
        return !this.textureViewSkipRender && Build.VERSION.SDK_INT >= 31 && SharedConfig.useNewBlur && SharedConfig.getDevicePerformanceClass() >= 2 && !AndroidUtilities.makingGlobalBlurBitmap;
    }

    private RenderNode getRenderNodeBlurred(boolean z) {
        if (this.renderNode == null) {
            return null;
        }
        float f = z ? 3.0f : 6.0f;
        RenderNode renderNodeM = z ? this.renderNodeGlassed : this.renderNodeBlurred;
        if (renderNodeM == null) {
            PipSourceSnapshot$$ExternalSyntheticApiModelOutline0.m();
            renderNodeM = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("pv_s_blur_" + z);
            float fDownscaleRadius = DownscaleScrollableNoiseSuppressor.downscaleRadius(AndroidUtilities.dp(z ? 1.66f : 40.0f), f);
            renderNodeM.setRenderEffect(RenderEffect.createBlurEffect(fDownscaleRadius, fDownscaleRadius, Shader.TileMode.CLAMP));
            if (z) {
                this.renderNodeGlassed = renderNodeM;
            } else {
                this.renderNodeBlurred = renderNodeM;
            }
        }
        int iCeil = (int) Math.ceil(this.renderNode.getWidth() / f);
        int iCeil2 = (int) Math.ceil(this.renderNode.getHeight() / f);
        if ((!renderNodeM.hasDisplayList()) | renderNodeM.setPosition(0, 0, iCeil, iCeil2)) {
            RecordingCanvas recordingCanvasBeginRecording = renderNodeM.beginRecording();
            recordingCanvasBeginRecording.save();
            recordingCanvasBeginRecording.scale(iCeil / this.renderNode.getWidth(), iCeil2 / this.renderNode.getHeight());
            recordingCanvasBeginRecording.drawRenderNode(this.renderNode);
            recordingCanvasBeginRecording.restore();
            renderNodeM.endRecording();
        }
        return renderNodeM;
    }

    private RenderNode getRenderNodeColorMatrix(ColorMatrix colorMatrix, boolean z) {
        RenderNode renderNodeBlurred = getRenderNodeBlurred(z);
        if (renderNodeBlurred == null) {
            return null;
        }
        this.renderNodeHashBuilder.start();
        this.renderNodeHashBuilder.add(colorMatrix);
        this.renderNodeHashBuilder.add(z);
        long j = this.renderNodeHashBuilder.get();
        RenderNode renderNodeM = BotFullscreenButtons$$ExternalSyntheticApiModelOutline2.m(this.matrixRenderNodes.get(j));
        if (renderNodeM == null) {
            PipSourceSnapshot$$ExternalSyntheticApiModelOutline0.m();
            renderNodeM = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("pv_mat_" + j + "_" + z);
            renderNodeM.setRenderEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix)));
        }
        if ((!renderNodeM.hasDisplayList()) | renderNodeM.setPosition(0, 0, renderNodeBlurred.getWidth(), renderNodeBlurred.getHeight())) {
            renderNodeM.beginRecording().drawRenderNode(renderNodeBlurred);
            renderNodeM.endRecording();
        }
        return renderNodeM;
    }

    public void drawCaptionBlur(Canvas canvas, BlurringShader.StoryBlurDrawer storyBlurDrawer, int i, int i2, boolean z, boolean z2, boolean z3) {
        drawCaptionBlur(canvas, storyBlurDrawer, i, i2, z, z2, z3, false);
    }

    public void drawCaptionBlur(android.graphics.Canvas r44, org.telegram.ui.Components.BlurringShader.StoryBlurDrawer r45, int r46, int r47, boolean r48, boolean r49, boolean r50, boolean r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.drawCaptionBlur(android.graphics.Canvas, org.telegram.ui.Components.BlurringShader$StoryBlurDrawer, int, int, boolean, boolean, boolean, boolean):void");
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
            invalidateAllGlassAttachedViews();
            CaptionPhotoViewer captionPhotoViewer = this.captionEdit;
            if (captionPhotoViewer != null) {
                captionPhotoViewer.invalidateBlur();
            }
            CaptionPhotoViewer captionPhotoViewer2 = this.topCaptionEdit;
            if (captionPhotoViewer2 != null) {
                captionPhotoViewer2.invalidateBlur();
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

    private class BlurButton extends StickerCutOutBtn {
        private boolean active;
        private final AnimatedFloat activeFloat;
        private final Path path;

        public BlurButton() {
            super(PhotoViewer.this.stickerMakerView, PhotoViewer.this.activityContext, PhotoViewer.this.resourcesProvider, PhotoViewer.this.blurManager);
            this.path = new Path();
            this.activeFloat = new AnimatedFloat(this, 0L, 420L, CubicBezierInterpolator.EASE_OUT_QUINT);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.save();
            this.path.rewind();
            this.path.addRoundRect(this.bounds, AndroidUtilities.dp(this.rad), AndroidUtilities.dp(this.rad), Path.Direction.CW);
            canvas.clipPath(this.path);
            canvas.translate(-getX(), -getY());
            if (this == PhotoViewer.this.eraseBtn || this == PhotoViewer.this.restoreBtn) {
                canvas.translate(-PhotoViewer.this.btnLayout.getX(), -PhotoViewer.this.btnLayout.getY());
            }
            PhotoViewer.this.drawCaptionBlur(canvas, this.blurDrawer, -13948117, 855638016, false, true, false);
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
        float fLerp;
        float fLerp2;
        float fLerp3;
        float fLerp4;
        float fLerp5;
        float f;
        float f2;
        float f3;
        MediaController.CropState cropState;
        if (this.imageMoveAnimation != null) {
            fLerp2 = AndroidUtilities.lerp(this.mirror, this.animateToMirror, this.animationValue);
            fLerp = AndroidUtilities.lerp(this.scale, this.animateToScale, this.animationValue);
            fLerp3 = AndroidUtilities.lerp(this.rotate, this.animateToRotate, this.animationValue);
            fLerp4 = AndroidUtilities.lerp(this.translationY, this.animateToY, this.animationValue);
            fLerp5 = AndroidUtilities.lerp(this.translationX, this.animateToX, this.animationValue);
        } else {
            fLerp = this.scale;
            fLerp2 = this.mirror;
            fLerp3 = this.rotate;
            fLerp4 = this.translationY;
            fLerp5 = this.translationX;
            if (this.animationStartTime != 0) {
                fLerp5 = this.animateToX;
                fLerp4 = this.animateToY;
                fLerp = this.animateToScale;
            }
        }
        int containerViewWidth = getContainerViewWidth();
        int containerViewHeight = getContainerViewHeight();
        canvas.translate(getAdditionX(this.currentEditMode), getAdditionY(this.currentEditMode));
        canvas.translate(fLerp5, fLerp4 + (this.currentEditMode != 3 ? this.currentPanTranslationY : 0.0f));
        canvas.scale(fLerp, fLerp);
        canvas.rotate(fLerp3);
        int bitmapWidth = this.centerImage.getBitmapWidth();
        int bitmapHeight = this.centerImage.getBitmapHeight();
        float f4 = containerViewWidth;
        float f5 = bitmapWidth;
        float f6 = f4 / f5;
        float f7 = containerViewHeight;
        float f8 = bitmapHeight;
        float f9 = f7 / f8;
        float fMin = Math.min(f6, f9);
        int orientation = this.cropTransform.getOrientation();
        if (orientation == 90 || orientation == 270) {
            bitmapHeight = bitmapWidth;
            bitmapWidth = bitmapHeight;
        }
        float cropPw = this.cropTransform.getCropPw();
        float cropPh = this.cropTransform.getCropPh();
        float f10 = bitmapWidth;
        float f11 = bitmapHeight;
        float f12 = (int) ((cropPw + ((1.0f - cropPw) * 0.0f)) * f10);
        float f13 = f4 / f12;
        float f14 = (int) ((cropPh + ((1.0f - cropPh) * 0.0f)) * f11);
        if (f13 * f14 > f7) {
            f13 = f7 / f14;
        }
        float f15 = fLerp2;
        if (this.sendPhotoType != 1 && ((this.currentEditMode != 1 || this.switchingToMode == 0) && this.editState.cropState != null)) {
            float f16 = f12 * f13;
            float f17 = f14 * f13;
            if (f6 * f8 > f7) {
                f6 = f9;
            }
            float f18 = f16 + ((((f5 * f6) / fLerp) - f16) * 0.0f);
            float f19 = f17 + ((((f8 * f6) / fLerp) - f17) * 0.0f);
            canvas.clipRect((-f18) / 2.0f, (-f19) / 2.0f, f18 / 2.0f, f19 / 2.0f);
        }
        if (this.sendPhotoType == 1 || this.cropTransform.hasViewTransform()) {
            TextureView textureView = this.videoTextureView;
            if (textureView != null) {
                MediaController.CropState cropState2 = this.editState.cropState;
                textureView.setScaleX((cropState2 == null || !cropState2.mirrored) ? 1.0f : -1.0f);
                FirstFrameView firstFrameView = this.firstFrameView;
                if (firstFrameView != null) {
                    firstFrameView.setScaleX(this.videoTextureView.getScaleX());
                }
            }
            MediaController.CropState cropState3 = this.editState.cropState;
            if (cropState3 != null) {
                f2 = cropState3.cropScale;
                f = 1.0f;
            } else {
                f = 1.0f;
                f2 = 1.0f;
            }
            float f20 = f2 * ((f13 / fMin) / (((f2 - f) * 0.0f) + f));
            canvas.translate(this.cropTransform.getCropAreaX() * f, this.cropTransform.getCropAreaY() * f);
            canvas.scale(f20, f20);
            canvas.translate(this.cropTransform.getCropPx() * f10 * fMin * f, this.cropTransform.getCropPy() * f11 * fMin * f);
            float rotation = this.cropTransform.getRotation() + orientation;
            if (rotation > 180.0f) {
                rotation -= 360.0f;
            }
            canvas.rotate(rotation);
        }
        if (this.imagesArrLocals.isEmpty() || (cropState = this.editState.cropState) == null || !cropState.mirrored) {
            f3 = 1.0f;
        } else {
            f3 = 1.0f;
            canvas.scale(-1.0f, 1.0f);
        }
        if (f15 > 0.0f) {
            canvas.scale(f3 - (f15 * 2.0f), f3);
            canvas.skew(0.0f, 4.0f * f15 * (f3 - f15) * 0.25f);
        }
    }

    private void applyTransformToMatrix(Matrix matrix) {
        float fLerp;
        float fLerp2;
        float fLerp3;
        float fLerp4;
        float fLerp5;
        MediaController.CropState cropState;
        if (this.imageMoveAnimation != null) {
            fLerp2 = AndroidUtilities.lerp(this.mirror, this.animateToMirror, this.animationValue);
            fLerp = AndroidUtilities.lerp(this.scale, this.animateToScale, this.animationValue);
            fLerp3 = AndroidUtilities.lerp(this.rotate, this.animateToRotate, this.animationValue);
            fLerp4 = AndroidUtilities.lerp(this.translationY, this.animateToY, this.animationValue);
            fLerp5 = AndroidUtilities.lerp(this.translationX, this.animateToX, this.animationValue);
        } else {
            fLerp = this.scale;
            fLerp2 = this.mirror;
            fLerp3 = this.rotate;
            fLerp4 = this.translationY;
            fLerp5 = this.translationX;
            if (this.animationStartTime != 0) {
                fLerp5 = this.animateToX;
                fLerp4 = this.animateToY;
                fLerp = this.animateToScale;
            }
        }
        int containerViewWidth = getContainerViewWidth();
        int containerViewHeight = getContainerViewHeight();
        matrix.preTranslate(fLerp5, fLerp4 + (this.currentEditMode != 3 ? this.currentPanTranslationY : 0.0f));
        matrix.preScale(fLerp, fLerp);
        matrix.preRotate(fLerp3);
        int bitmapWidth = this.centerImage.getBitmapWidth();
        int bitmapHeight = this.centerImage.getBitmapHeight();
        float f = containerViewWidth;
        float f2 = containerViewHeight;
        float fMin = Math.min(f / bitmapWidth, f2 / bitmapHeight);
        int orientation = this.cropTransform.getOrientation();
        if (orientation != 90 && orientation != 270) {
            bitmapHeight = bitmapWidth;
            bitmapWidth = bitmapHeight;
        }
        float cropPw = this.cropTransform.getCropPw();
        float cropPh = this.cropTransform.getCropPh();
        float f3 = bitmapHeight;
        float f4 = bitmapWidth;
        float f5 = f / ((int) ((cropPw + ((1.0f - cropPw) * 0.0f)) * f3));
        float f6 = (int) ((cropPh + ((1.0f - cropPh) * 0.0f)) * f4);
        if (f5 * f6 > f2) {
            f5 = f2 / f6;
        }
        if (this.sendPhotoType == 1 || this.cropTransform.hasViewTransform()) {
            TextureView textureView = this.videoTextureView;
            if (textureView != null) {
                MediaController.CropState cropState2 = this.editState.cropState;
                textureView.setScaleX((cropState2 == null || !cropState2.mirrored) ? 1.0f : -1.0f);
                FirstFrameView firstFrameView = this.firstFrameView;
                if (firstFrameView != null) {
                    firstFrameView.setScaleX(this.videoTextureView.getScaleX());
                }
            }
            MediaController.CropState cropState3 = this.editState.cropState;
            float f7 = cropState3 != null ? cropState3.cropScale : 1.0f;
            float f8 = f7 * ((f5 / fMin) / (((f7 - 1.0f) * 0.0f) + 1.0f));
            matrix.preTranslate(this.cropTransform.getCropAreaX() * 1.0f, this.cropTransform.getCropAreaY() * 1.0f);
            matrix.preScale(f8, f8);
            matrix.preTranslate(this.cropTransform.getCropPx() * f3 * fMin * 1.0f, this.cropTransform.getCropPy() * f4 * fMin * 1.0f);
            float rotation = this.cropTransform.getRotation() + orientation;
            if (rotation > 180.0f) {
                rotation -= 360.0f;
            }
            matrix.preRotate(rotation);
        }
        if (!this.imagesArrLocals.isEmpty() && (cropState = this.editState.cropState) != null && cropState.mirrored) {
            matrix.preScale(-1.0f, 1.0f);
        }
        if (fLerp2 > 0.0f) {
            matrix.preScale(1.0f - (2.0f * fLerp2), 1.0f);
            matrix.preSkew(0.0f, 4.0f * fLerp2 * (1.0f - fLerp2) * 0.25f);
        }
    }

    public void openAdsMenu() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.openAdsMenu():void");
    }

    public void lambda$openAdsMenu$158(ItemOptions itemOptions, View view) {
        if (this.currentMessageObject == null) {
            return;
        }
        itemOptions.dismiss();
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment instanceof ChatActivity) {
            ((ChatActivity) baseFragment).logSponsoredClicked(this.currentMessageObject, false, true);
        }
        Browser.openUrl(this.activityContext, Uri.parse(this.currentMessageObject.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(this.currentAccount).sponsoredLinksInappAllow, false);
    }

    public boolean lambda$openAdsMenu$159(Theme.ResourcesProvider resourcesProvider, View view) {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            return false;
        }
        if (!AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
            return true;
        }
        BulletinFactory.of(Bulletin.BulletinWindow.make(this.activityContext), resourcesProvider).createCopyLinkBulletin().show();
        return true;
    }

    public void lambda$openAdsMenu$160(Theme.ResourcesProvider resourcesProvider, View view) {
        if (AndroidUtilities.addToClipboard(this.currentMessageObject.sponsoredInfo)) {
            BulletinFactory.of(Bulletin.BulletinWindow.make(this.activityContext), resourcesProvider).createCopyBulletin(LocaleController.getString(R.string.TextCopied)).show();
        }
    }

    public void lambda$openAdsMenu$161(Theme.ResourcesProvider resourcesProvider, View view) {
        if (AndroidUtilities.addToClipboard(this.currentMessageObject.sponsoredAdditionalInfo)) {
            BulletinFactory.of(Bulletin.BulletinWindow.make(this.activityContext), resourcesProvider).createCopyBulletin(LocaleController.getString(R.string.TextCopied)).show();
        }
    }

    public void lambda$openAdsMenu$163(int i, Theme.ResourcesProvider resourcesProvider) {
        if (UserConfig.getInstance(i).isPremium()) {
            BulletinFactory.of(this.containerView, resourcesProvider).createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
            MessagesController.getInstance(i).disableAds(true);
            BaseFragment baseFragment = this.parentFragment;
            if (baseFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) baseFragment;
                chatActivity.removeFromSponsored(this.currentMessageObject);
                chatActivity.removeMessageWithThanos(this.currentMessageObject);
                return;
            }
            return;
        }
        new PremiumFeatureBottomSheet(this.parentFragment, 3, true).show();
    }

    public void lambda$openAdsMenu$164(Theme.ResourcesProvider resourcesProvider) {
        RevenueSharingAdsInfoBottomSheet.showAlert(this.activityContext, this.parentFragment, false, resourcesProvider);
    }

    public void lambda$openAdsMenu$165(int i, Theme.ResourcesProvider resourcesProvider) {
        if (UserConfig.getInstance(i).isPremium()) {
            BulletinFactory.of(this.containerView, resourcesProvider).createAdReportedBulletin(LocaleController.getString(R.string.AdHidden)).show();
            MessagesController.getInstance(i).disableAds(true);
            BaseFragment baseFragment = this.parentFragment;
            if (baseFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) baseFragment;
                chatActivity.removeFromSponsored(this.currentMessageObject);
                chatActivity.removeMessageWithThanos(this.currentMessageObject);
                return;
            }
            return;
        }
        new PremiumFeatureBottomSheet(this.parentFragment, 3, true).show();
    }

    private static CharSequence sponsoredCaption(MessageObject messageObject, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(messageObject.sponsoredTitle)) {
            spannableStringBuilder.append((CharSequence) messageObject.sponsoredTitle);
            spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new LineHeightSpan() {
                @Override
                public void chooseHeight(CharSequence charSequence2, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
                    fontMetricsInt.descent += AndroidUtilities.dp(4.0f);
                    fontMetricsInt.ascent = fontMetricsInt.ascent;
                }
            }, 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "\n");
        }
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private void createAdButtonView() {
        if (this.adButtonView != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this.activityContext);
        this.adButtonView = frameLayout;
        frameLayout.setBackground(Theme.createRadSelectorDrawable(620756991, 369098751, 8, 8));
        ScaleStateListAnimator.apply(this.adButtonView, 0.05f, 1.25f);
        TextView textView = new TextView(this.activityContext);
        this.adButtonTextView = textView;
        textView.setTextSize(1, 14.0f);
        this.adButtonTextView.setTextColor(-1);
        this.adButtonTextView.setTypeface(AndroidUtilities.bold());
        this.adButtonView.addView(this.adButtonTextView, LayoutHelper.createFrame(-2, -2, 17));
        this.adButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) throws NumberFormatException {
                this.f$0.lambda$createAdButtonView$166(view);
            }
        });
    }

    public void lambda$createAdButtonView$166(View view) throws NumberFormatException {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null || !messageObject.isSponsored()) {
            return;
        }
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment instanceof ChatActivity) {
            ((ChatActivity) baseFragment).logSponsoredClicked(this.currentMessageObject, false, true);
        }
        closePhoto(true, false);
        String str = this.currentMessageObject.sponsoredUrl;
        if (str != null) {
            Context context = LaunchActivity.instance;
            if (context == null) {
                context = this.activityContext;
            }
            Browser.openUrl(context, Uri.parse(str), true, false, false, null, null, false, MessagesController.getInstance(this.currentAccount).sponsoredLinksInappAllow, false);
        }
    }

    public void chooseSpeed(float f, boolean z, boolean z2) {
        if (f != this.currentVideoSpeed) {
            this.currentVideoSpeed = f;
            if (this.currentMessageObject != null) {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("playback_speed", 0);
                if (Math.abs(this.currentVideoSpeed - 1.0f) < 0.001f) {
                    sharedPreferences.edit().remove("speed" + this.currentMessageObject.getDialogId() + "_" + this.currentMessageObject.getId()).commit();
                } else {
                    sharedPreferences.edit().putFloat("speed" + this.currentMessageObject.getDialogId() + "_" + this.currentMessageObject.getId(), this.currentVideoSpeed).commit();
                }
            }
            VideoPlayer videoPlayer = this.videoPlayer;
            if (videoPlayer != null) {
                videoPlayer.setPlaybackSpeed(this.currentVideoSpeed);
            }
            PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
            if (photoViewerWebView != null) {
                photoViewerWebView.setPlaybackSpeed(this.currentVideoSpeed);
            }
        }
        setMenuItemIcon(true, z);
        if (z2) {
            this.videoItem.toggleSubMenu();
        }
    }

    public void toggleCaptionAbove() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.toggleCaptionAbove():void");
    }

    public static float getSavedProgressFast(MessageObject messageObject) {
        int duration = (int) messageObject.getDuration();
        String fileNameFast = messageObject.isEmbedVideo() ? messageObject.messageOwner.media.webpage.url : messageObject.getFileNameFast();
        if (!TextUtils.isEmpty(fileNameFast) && duration >= 10) {
            SavedVideoPosition savedVideoPosition = (SavedVideoPosition) savedVideoPositions.get(fileNameFast);
            if (messageObject.forceSeekTo < 0.0f && savedVideoPosition != null) {
                float f = savedVideoPosition.position;
                if (f > 0.0f && f < 0.999f) {
                    return f;
                }
            }
        }
        return 0.0f;
    }

    public static float getSavedProgress(MessageObject messageObject) {
        int duration = (int) messageObject.getDuration();
        String fileNameFast = messageObject.isEmbedVideo() ? messageObject.messageOwner.media.webpage.url : messageObject.getFileNameFast();
        if (!TextUtils.isEmpty(fileNameFast)) {
            if (duration >= 10) {
                SavedVideoPosition savedVideoPosition = (SavedVideoPosition) savedVideoPositions.get(fileNameFast);
                if (messageObject.forceSeekTo < 0.0f && savedVideoPosition != null) {
                    float f = savedVideoPosition.position;
                    if (f > 0.0f && f < 0.999f) {
                        return f;
                    }
                }
            }
            if (duration >= 120 && messageObject.forceSeekTo < 0.0f) {
                float f2 = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).getFloat(fileNameFast, -1.0f);
                if (f2 > 0.0f && f2 < 0.999f) {
                    return f2;
                }
            }
        }
        return 0.0f;
    }

    public org.telegram.messenger.chromecast.ChromecastMediaVariations getCurrentChromecastMedia() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.getCurrentChromecastMedia():org.telegram.messenger.chromecast.ChromecastMediaVariations");
    }

    public void syncCastedPlayer() {
        if (isVisible()) {
            this.ignorePlayerUpdate = true;
            VideoPlayer videoPlayer = this.videoPlayer;
            if (videoPlayer != null) {
                videoPlayer.setMute(CastSync.isActive() || this.muteVideo);
            }
            if (this.videoPlayer != null && CastSync.isActive() && !CastSync.isUpdatePending()) {
                long position = CastSync.getPosition();
                if (position >= 0 && Math.abs(this.videoPlayer.getCurrentPosition() - position) > 1000) {
                    this.videoPlayer.seekTo(position);
                }
                if (CastSync.isPlaying()) {
                    this.videoPlayer.play();
                } else {
                    this.videoPlayer.pause();
                }
                if (this.activityContext != null && Math.abs(CastSync.getDeviceVolume() - CastSync.getVolume()) > 0.05f) {
                    AudioManager audioManager = (AudioManager) this.activityContext.getSystemService("audio");
                    int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                    int streamMinVolume = (Build.VERSION.SDK_INT >= 28 ? audioManager.getStreamMinVolume(3) : 0) + ((int) ((streamMaxVolume - r5) * CastSync.getVolume()));
                    if (streamMinVolume != audioManager.getStreamVolume(3)) {
                        audioManager.setStreamVolume(3, streamMinVolume, 1);
                    }
                }
                chooseSpeed(CastSync.getSpeed(), true, false);
            }
            ChooseQualityLayout$QualityIcon chooseQualityLayout$QualityIcon = this.videoItemIcon;
            if (chooseQualityLayout$QualityIcon != null) {
                chooseQualityLayout$QualityIcon.setCasting(CastSync.isActive(), true);
            }
            this.ignorePlayerUpdate = false;
        }
    }

    public long getCurrentPosition() {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer == null) {
            return -1L;
        }
        return videoPlayer.getCurrentPosition();
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            float f3 = 1.0f - f;
            this.pollAttachButtons.setTranslationY(AndroidUtilities.dp(36.0f) * f3);
            this.pollAttachButtons.setAlpha(f);
            this.pollAttachButtons.setVisibility(f > 0.0f ? 0 : 8);
            if (this.sendPhotoTypeIsPollMediaEdit) {
                this.pickerView.setVisibility(f < 1.0f ? 0 : 8);
                this.pickerView.setAlpha(f3);
                this.pickerView.setTranslationY(AndroidUtilities.dp(36.0f) * f);
                this.pickerViewSendButton.setVisibility(f < 1.0f ? 0 : 8);
                this.pickerViewSendButton.setAlpha(f3);
                this.pickerViewSendButton.setTranslationY(AndroidUtilities.dp(36.0f) * f);
            }
        }
    }

    public void pipInvalidateAvailability() {
        PipSource pipSource = this.pipSource;
        if (pipSource != null) {
            pipSource.invalidateAvailability();
        }
        if (PipVideoOverlay.getPipSource() != null) {
            PipVideoOverlay.getPipSource().invalidateAvailability();
        }
    }

    @Override
    public boolean pipIsAvailable() {
        ActionBarMenuSubItem actionBarMenuSubItem = this.pipItem;
        return actionBarMenuSubItem != null && actionBarMenuSubItem.isEnabled() && this.isPlaying;
    }

    @Override
    public Bitmap pipCreatePrimaryWindowViewBitmap() {
        TextureView textureView = this.videoTextureView;
        if (textureView != null) {
            return textureView.getBitmap();
        }
        if (!this.usedSurfaceView || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmaps.createBitmap(this.videoSurfaceView.getWidth(), this.videoSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
        AndroidUtilities.getBitmapFromSurface(this.videoSurfaceView, bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    @Override
    public void pipRenderBackground(Canvas canvas) {
        canvas.drawColor(-16777216);
    }

    @Override
    public void pipRenderForeground(Canvas canvas) {
        this.textureViewSkipRender = true;
        this.windowView.draw(canvas);
        this.textureViewSkipRender = false;
    }

    @Override
    public View pipCreatePictureInPictureView() {
        TextureView textureView = new TextureView(this.parentActivity);
        this.pipTextureView = textureView;
        textureView.setOpaque(false);
        View view = this.pipPlaceholderView;
        if (view != null) {
            view.bringToFront();
        }
        return this.pipTextureView;
    }

    @Override
    public void pipHidePrimaryWindowView(Runnable runnable) {
        if (PipVideoOverlay.isVisible()) {
            PipVideoOverlay.dismiss(false);
        }
        this.pipFirstFrameCallback = runnable;
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.setSurfaceView(null);
            this.videoPlayer.setTextureView(null);
            this.videoPlayer.play();
            this.videoPlayer.setTextureView(this.pipTextureView);
        }
        ((WindowManager) this.parentActivity.getSystemService("window")).removeView(this.windowView);
        this.windowViewSkipRender = true;
        this.windowView.invalidate();
    }

    @Override
    public Bitmap pipCreatePictureInPictureViewBitmap() {
        TextureView textureView = this.pipTextureView;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.pipTextureView.getBitmap();
    }

    @Override
    public void pipShowPrimaryWindowView(Runnable runnable) {
        this.pipFirstFrameCallback = runnable;
        this.windowViewSkipRender = false;
        if (this.windowView != null) {
            ((WindowManager) this.parentActivity.getSystemService("window")).addView(this.windowView, this.windowLayoutParams);
            this.windowView.invalidate();
        }
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer == null) {
            return;
        }
        videoPlayer.setSurfaceView(null);
        this.videoPlayer.setTextureView(null);
        this.videoPlayer.play();
        TextureView textureView = this.videoTextureView;
        if (textureView != null) {
            this.videoPlayer.setTextureView(textureView);
            return;
        }
        SurfaceView surfaceView = this.videoSurfaceView;
        if (surfaceView != null) {
            this.videoPlayer.setSurfaceView(surfaceView);
        }
    }

    private void showPhotoQualityHint(boolean z) {
        HintView2 hintView2 = this.compressPhotoHint;
        if (hintView2 != null) {
            hintView2.hide();
            this.compressPhotoHint = null;
        }
        if (this.activityContext == null) {
            return;
        }
        this.compressPhotoHint = new HintView2(this.activityContext, 3);
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder("x ").append((CharSequence) LocaleController.getString(z ? R.string.PhotoWillBeSentInHD : R.string.PhotoWillBeSentInSD));
        spannableStringBuilderAppend.setSpan(new ColoredImageSpan(z ? R.drawable.menu_quality_hd_filled : R.drawable.menu_quality_sd_filled), 0, 1, 33);
        this.compressPhotoHint.setText(spannableStringBuilderAppend);
        this.containerView.addView(this.compressPhotoHint, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 48.0f));
        this.compressPhotoHint.setTranslationY(this.pickerView.getTranslationY());
        this.compressPhotoHint.setJointPx(0.0f, this.itemsLayout.getX() + this.compressItem.getX() + (this.compressItem.getWidth() / 2.0f));
        final HintView2 hintView22 = this.compressPhotoHint;
        hintView22.setOnHiddenListener(new Runnable() {
            @Override
            public final void run() {
                AndroidUtilities.removeFromParent(hintView22);
            }
        });
        this.compressPhotoHint.setDuration(3500L);
        this.compressPhotoHint.show();
    }
}
