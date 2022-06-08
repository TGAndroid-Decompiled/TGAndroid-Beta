package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
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
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.Settings;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
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
import android.util.Property;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import android.widget.Scroller;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import androidx.annotation.Keep;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.graphics.ColorUtils;
import androidx.core.widget.NestedScrollView;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScrollerEnd;
import androidx.recyclerview.widget.RecyclerView;
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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
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
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.WebFile;
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
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageAction;
import org.telegram.tgnet.TLRPC$MessageEntity;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$PageBlock;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_documentAttributeVideo;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_fileLocationToBeDeprecated;
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
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.PhotoPickerPhotoCell;
import org.telegram.ui.ChooseSpeedLayout;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.Crop.CropTransform;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FadingTextViewLayout;
import org.telegram.ui.Components.FilterGLThread;
import org.telegram.ui.Components.FilterShaders;
import org.telegram.ui.Components.FloatSeekBarAccessibilityDelegate;
import org.telegram.ui.Components.GestureDetector2;
import org.telegram.ui.Components.GroupedPhotosListView;
import org.telegram.ui.Components.HideViewAfterAnimation;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.PaintingOverlay;
import org.telegram.ui.Components.PhotoCropView;
import org.telegram.ui.Components.PhotoFilterView;
import org.telegram.ui.Components.PhotoPaintView;
import org.telegram.ui.Components.PhotoViewerCaptionEnterView;
import org.telegram.ui.Components.PhotoViewerWebView;
import org.telegram.ui.Components.PickerBottomLayoutViewer;
import org.telegram.ui.Components.PipVideoOverlay;
import org.telegram.ui.Components.PlayPauseDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SizeNotifierFrameLayoutPhoto;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.TextViewSwitcher;
import org.telegram.ui.Components.Tooltip;
import org.telegram.ui.Components.URLSpanReplacement;
import org.telegram.ui.Components.URLSpanUserMentionPhotoViewer;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.VideoEditTextureView;
import org.telegram.ui.Components.VideoForwardDrawable;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Components.VideoPlayerSeekBar;
import org.telegram.ui.Components.VideoSeekPreviewImage;
import org.telegram.ui.Components.VideoTimelinePlayView;
import org.telegram.ui.Components.ViewHelper;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.PhotoViewer;
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
    private ActionBar actionBar;
    private AnimatorSet actionBarAnimator;
    private Context activityContext;
    private ActionBarMenuSubItem allMediaItem;
    private boolean allowMentions;
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
    private boolean applying;
    private AspectRatioFrameLayout aspectRatioFrameLayout;
    private boolean attachedToWindow;
    private long audioFramesSize;
    private float avatarStartProgress;
    private long avatarStartTime;
    private long avatarsDialogId;
    private int bitrate;
    private LinearLayout bottomButtonsLayout;
    private FrameLayout bottomLayout;
    private ImageView cameraItem;
    private boolean canEditAvatar;
    private FrameLayout captionContainer;
    private PhotoViewerCaptionEnterView captionEditText;
    public CharSequence captionForAllMedia;
    private boolean captionHwLayerEnabled;
    private TextView captionLimitView;
    private CaptionScrollView captionScrollView;
    private CaptionTextViewSwitcher captionTextViewSwitcher;
    private boolean centerImageIsVideo;
    private AnimatorSet changeModeAnimation;
    private TextureView changedTextureView;
    private boolean changingPage;
    private boolean changingTextureView;
    private CheckBox checkImageView;
    ChooseSpeedLayout chooseSpeedLayout;
    private int classGuid;
    private ImageView compressItem;
    private AnimatorSet compressItemAnimation;
    private FrameLayoutDrawer containerView;
    private boolean cropInitied;
    private ImageView cropItem;
    private int currentAccount;
    private AnimatedFileDrawable currentAnimation;
    private Bitmap currentBitmap;
    private TLRPC$BotInlineResult currentBotInlineResult;
    private long currentDialogId;
    private int currentEditMode;
    private ImageLocation currentFileLocation;
    private ImageLocation currentFileLocationVideo;
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
    private int dateOverride;
    private FadingTextViewLayout dateTextView;
    private boolean disableShowCheck;
    private boolean discardTap;
    private TextView docInfoTextView;
    private TextView docNameTextView;
    private boolean doneButtonPressed;
    private boolean dontAutoPlay;
    private boolean dontChangeCaptionPosition;
    private boolean dontResetZoomOnFirstLayout;
    private boolean doubleTap;
    private boolean doubleTapEnabled;
    private float dragY;
    private boolean draggingDown;
    private PickerBottomLayoutViewer editorDoneLayout;
    private long endTime;
    private long estimatedDuration;
    private long estimatedSize;
    private ImageView exitFullscreenButton;
    private boolean firstAnimationDelay;
    private FirstFrameView firstFrameView;
    private AnimatorSet flashAnimator;
    private View flashView;
    boolean fromCamera;
    private int fullscreenedByButton;
    private GestureDetector2 gestureDetector;
    private GroupedPhotosListView groupedPhotosListView;
    public boolean hasCaptionForAllMedia;
    private PlaceProviderObject hideAfterAnimation;
    private UndoView hintView;
    private boolean ignoreDidSetImage;
    private AnimatorSet imageMoveAnimation;
    private boolean inBubbleMode;
    private boolean inPreview;
    private VideoPlayer injectingVideoPlayer;
    private SurfaceTexture injectingVideoPlayerSurface;
    private float inlineOutAnimationProgress;
    private boolean invalidCoords;
    private boolean isCurrentVideo;
    private boolean isDocumentsPicker;
    private boolean isEmbedVideo;
    private boolean isEvent;
    private boolean isFirstLoading;
    private boolean isInline;
    private boolean isPhotosListViewVisible;
    private boolean isPlaying;
    private boolean isStreaming;
    private boolean isVisible;
    private LinearLayout itemsLayout;
    private boolean keepScreenOnFlagSet;
    boolean keyboardAnimationEnabled;
    private int keyboardSize;
    private long lastBufferedPositionCheck;
    private Object lastInsets;
    private long lastPhotoSetTime;
    private long lastSaveTime;
    private String lastTitle;
    private MediaController.CropState leftCropState;
    private boolean leftImageIsVideo;
    private PaintingOverlay leftPaintingOverlay;
    private boolean loadInitialVideo;
    private boolean loadingMoreImages;
    float longPressX;
    private boolean manuallyPaused;
    private StickersAlert masksAlert;
    private ActionBarMenuItem masksItem;
    private float maxX;
    private float maxY;
    private LinearLayoutManager mentionLayoutManager;
    private AnimatorSet mentionListAnimation;
    private RecyclerListView mentionListView;
    private MentionsAdapter mentionsAdapter;
    private ActionBarMenuItem menuItem;
    private long mergeDialogId;
    private float minX;
    private float minY;
    private AnimatorSet miniProgressAnimator;
    private RadialProgressView miniProgressView;
    private ImageView mirrorItem;
    private float moveStartX;
    private float moveStartY;
    private boolean moving;
    private ImageView muteItem;
    private boolean muteVideo;
    private String nameOverride;
    private FadingTextViewLayout nameTextView;
    private ValueAnimator navBarAnimator;
    private View navigationBar;
    private int navigationBarHeight;
    private boolean needCaptionLayout;
    private boolean needSearchImageInArr;
    private boolean needShowOnReady;
    private boolean openedFullScreenVideo;
    private boolean opennedFromMedia;
    private OrientationEventListener orientationEventListener;
    private int originalBitrate;
    private int originalHeight;
    private long originalSize;
    private int originalWidth;
    private boolean padImageForHorizontalInsets;
    private PageBlocksAdapter pageBlocksAdapter;
    private ImageView paintButton;
    private ImageView paintItem;
    private int paintViewTouched;
    private PaintingOverlay paintingOverlay;
    private Activity parentActivity;
    private ChatAttachAlert parentAlert;
    private ChatActivity parentChatActivity;
    private PhotoCropView photoCropView;
    private PhotoFilterView photoFilterView;
    private PhotoPaintView photoPaintView;
    private PhotoViewerWebView photoViewerWebView;
    private CounterView photosCounterView;
    private FrameLayout pickerView;
    private ImageView pickerViewSendButton;
    private Drawable pickerViewSendDrawable;
    private float pinchCenterX;
    private float pinchCenterY;
    private float pinchStartDistance;
    private float pinchStartX;
    private float pinchStartY;
    private boolean pipAnimationInProgress;
    private boolean pipAvailable;
    private ActionBarMenuItem pipItem;
    private PhotoViewerProvider placeProvider;
    private View playButtonAccessibilityOverlay;
    private boolean playerAutoStarted;
    private boolean playerInjected;
    private boolean playerLooping;
    private boolean playerWasPlaying;
    private boolean playerWasReady;
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
    private boolean requestingPreview;
    private TextView resetButton;
    private Theme.ResourcesProvider resourcesProvider;
    private int resultHeight;
    private int resultWidth;
    private MediaController.CropState rightCropState;
    private boolean rightImageIsVideo;
    private PaintingOverlay rightPaintingOverlay;
    private ImageView rotateItem;
    private int rotationValue;
    private Scroller scroller;
    private float seekToProgressPending;
    private float seekToProgressPending2;
    private int selectedCompression;
    private ListAdapter selectedPhotosAdapter;
    private SelectedPhotosListView selectedPhotosListView;
    private ActionBarMenuItem sendItem;
    private int sendPhotoType;
    private ActionBarPopupWindow.ActionBarPopupWindowLayout sendPopupLayout;
    private ActionBarPopupWindow sendPopupWindow;
    private ImageView shareButton;
    private ActionBarMenuItem shareItem;
    private int sharedMediaType;
    private String shouldSavePositionForCurrentVideo;
    private String shouldSavePositionForCurrentVideoShortTerm;
    private PlaceProviderObject showAfterAnimation;
    private ImageReceiver sideImage;
    private boolean skipFirstBufferingProgress;
    private int slideshowMessageId;
    private ActionBarPopupWindow.GapView speedGap;
    private ActionBarMenuSubItem speedItem;
    private int startOffset;
    private long startTime;
    private long startedPlayTime;
    private boolean streamingAlertShown;
    private int switchImageAfterAnimation;
    private boolean switchingInlineMode;
    private int switchingToIndex;
    private ImageView textureImageView;
    private boolean textureUploaded;
    private ImageView timeItem;
    private Tooltip tooltip;
    private int totalImagesCount;
    private int totalImagesCountMerge;
    private int touchSlop;
    private long transitionAnimationStartTime;
    private int transitionIndex;
    private float translationX;
    private float translationY;
    private boolean tryStartRequestPreviewOnFinish;
    private ImageView tuneItem;
    private boolean useSmoothKeyboard;
    private VelocityTracker velocityTracker;
    private TextView videoAvatarTooltip;
    private boolean videoConvertSupported;
    private float videoCrossfadeAlpha;
    private long videoCrossfadeAlphaLastTime;
    private boolean videoCrossfadeStarted;
    private float videoCutEnd;
    private float videoCutStart;
    private float videoDuration;
    private VideoForwardDrawable videoForwardDrawable;
    private int videoFramerate;
    private long videoFramesSize;
    private int videoHeight;
    private Runnable videoPlayRunnable;
    private VideoPlayer videoPlayer;
    private Animator videoPlayerControlAnimator;
    private VideoPlayerControlFrameLayout videoPlayerControlFrameLayout;
    private VideoPlayerSeekBar videoPlayerSeekbar;
    private View videoPlayerSeekbarView;
    private SimpleTextView videoPlayerTime;
    private VideoSeekPreviewImage videoPreviewFrame;
    private AnimatorSet videoPreviewFrameAnimation;
    private MessageObject videoPreviewMessageObject;
    private boolean videoSizeSet;
    private TextureView videoTextureView;
    private ObjectAnimator videoTimelineAnimator;
    private VideoTimelinePlayView videoTimelineView;
    private int videoWidth;
    private AlertDialog visibleDialog;
    private int waitingForDraw;
    private int waitingForFirstTextureUpload;
    private boolean wasLayout;
    private boolean wasRotated;
    private WindowManager.LayoutParams windowLayoutParams;
    private FrameLayout windowView;
    private boolean zoomAnimation;
    private boolean zooming;
    private int maxSelectedPhotos = -1;
    private boolean allowOrder = true;
    private Runnable miniProgressShowRunnable = new Runnable() {
        @Override
        public final void run() {
            PhotoViewer.this.lambda$new$0();
        }
    };
    private boolean isActionBarVisible = true;
    private Map<View, Boolean> actionBarItemsVisibility = new HashMap(3);
    private BackgroundDrawable backgroundDrawable = new BackgroundDrawable(-16777216);
    private Paint blackPaint = new Paint();
    private PhotoProgressView[] photoProgressViews = new PhotoProgressView[3];
    private Runnable onUserLeaveHintListener = new Runnable() {
        @Override
        public final void run() {
            PhotoViewer.this.onUserLeaveHint();
        }
    };
    private GradientDrawable[] pressedDrawable = new GradientDrawable[2];
    private boolean[] drawPressedDrawable = new boolean[2];
    private float[] pressedDrawableAlpha = new float[2];
    private CropTransform cropTransform = new CropTransform();
    private CropTransform leftCropTransform = new CropTransform();
    private CropTransform rightCropTransform = new CropTransform();
    private Paint bitmapPaint = new Paint(2);
    private Runnable setLoadingRunnable = new Runnable() {
        @Override
        public void run() {
            if (PhotoViewer.this.currentMessageObject != null) {
                FileLoader.getInstance(PhotoViewer.this.currentMessageObject.currentAccount).setLoadingVideo(PhotoViewer.this.currentMessageObject.getDocument(), true, false);
            }
        }
    };
    private Runnable hideActionBarRunnable = new Runnable() {
        @Override
        public void run() {
            if (PhotoViewer.this.videoPlayerControlVisible && PhotoViewer.this.isPlaying && !ApplicationLoader.mainInterfacePaused) {
                if (PhotoViewer.this.menuItem != null && PhotoViewer.this.menuItem.isSubMenuShowing()) {
                    return;
                }
                if (PhotoViewer.this.captionScrollView != null && PhotoViewer.this.captionScrollView.getScrollY() != 0) {
                    return;
                }
                if (PhotoViewer.this.miniProgressView == null || PhotoViewer.this.miniProgressView.getVisibility() != 0) {
                    PhotoViewer photoViewer = PhotoViewer.PipInstance;
                    PhotoViewer photoViewer2 = PhotoViewer.this;
                    if (photoViewer != photoViewer2) {
                        photoViewer2.toggleActionBar(false, true);
                    }
                }
            }
        }
    };
    private ArrayMap<String, SavedVideoPosition> savedVideoPositions = new ArrayMap<>();
    private boolean videoPlayerControlVisible = true;
    private int[] videoPlayerCurrentTime = new int[2];
    private int[] videoPlayerTotalTime = new int[2];
    private ImageView[] fullscreenButton = new ImageView[3];
    private int[] pipPosition = new int[2];
    private boolean pipVideoOverlayAnimateFlag = true;
    private int lastImageId = -1;
    private int prevOrientation = -10;
    VideoPlayerRewinder videoPlayerRewinder = new VideoPlayerRewinder() {
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
    public final Property<View, Float> FLASH_VIEW_VALUE = new AnimationProperties.FloatProperty<View>("flashViewAlpha") {
        public void setValue(View view, float f) {
            view.setAlpha(f);
            if (PhotoViewer.this.photoCropView != null) {
                PhotoViewer.this.photoCropView.setVideoThumbFlashAlpha(f);
            }
        }

        public Float get(View view) {
            return Float.valueOf(view.getAlpha());
        }
    };
    private Runnable updateProgressRunnable = new AnonymousClass5();
    private Runnable switchToInlineRunnable = new Runnable() {
        @Override
        public void run() {
            if (PipVideoOverlay.isVisible()) {
                PipVideoOverlay.dismiss();
                AndroidUtilities.runOnUIThread(this, 250L);
                return;
            }
            PhotoViewer.this.switchingInlineMode = false;
            if (PhotoViewer.this.currentBitmap != null) {
                PhotoViewer.this.currentBitmap.recycle();
                PhotoViewer.this.currentBitmap = null;
            }
            PhotoViewer.this.changingTextureView = true;
            if (PhotoViewer.this.textureImageView != null) {
                try {
                    PhotoViewer photoViewer = PhotoViewer.this;
                    photoViewer.currentBitmap = Bitmaps.createBitmap(photoViewer.videoTextureView.getWidth(), PhotoViewer.this.videoTextureView.getHeight(), Bitmap.Config.ARGB_8888);
                    PhotoViewer.this.videoTextureView.getBitmap(PhotoViewer.this.currentBitmap);
                } catch (Throwable th) {
                    if (PhotoViewer.this.currentBitmap != null) {
                        PhotoViewer.this.currentBitmap.recycle();
                        PhotoViewer.this.currentBitmap = null;
                    }
                    FileLog.e(th);
                }
                if (PhotoViewer.this.currentBitmap != null) {
                    PhotoViewer.this.textureImageView.setVisibility(0);
                    PhotoViewer.this.textureImageView.setImageBitmap(PhotoViewer.this.currentBitmap);
                } else {
                    PhotoViewer.this.textureImageView.setImageDrawable(null);
                }
            }
            PhotoViewer.this.isInline = true;
            PhotoViewer.this.changedTextureView = new TextureView(PhotoViewer.this.parentActivity);
            if (PipVideoOverlay.show(false, PhotoViewer.this.parentActivity, PhotoViewer.this.changedTextureView, PhotoViewer.this.videoWidth, PhotoViewer.this.videoHeight, PhotoViewer.this.pipVideoOverlayAnimateFlag)) {
                PipVideoOverlay.setPhotoViewer(PhotoViewer.this);
            }
            PhotoViewer.this.pipVideoOverlayAnimateFlag = true;
            PhotoViewer.this.changedTextureView.setVisibility(4);
            PhotoViewer.this.aspectRatioFrameLayout.removeView(PhotoViewer.this.videoTextureView);
        }
    };
    private TextureView.SurfaceTextureListener surfaceTextureListener = new TextureView.SurfaceTextureListener() {
        @Override
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (PhotoViewer.this.videoTextureView == null || !PhotoViewer.this.changingTextureView) {
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

        public class AnonymousClass1 implements ViewTreeObserver.OnPreDrawListener {
            AnonymousClass1() {
            }

            @Override
            public boolean onPreDraw() {
                PhotoViewer.this.changedTextureView.getViewTreeObserver().removeOnPreDrawListener(this);
                if (PhotoViewer.this.textureImageView != null) {
                    if (PhotoViewer.this.isInline) {
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                PhotoViewer.AnonymousClass7.AnonymousClass1.this.lambda$onPreDraw$0();
                            }
                        }, 300L);
                    } else {
                        PhotoViewer.this.textureImageView.setVisibility(4);
                        PhotoViewer.this.textureImageView.setImageDrawable(null);
                        if (PhotoViewer.this.currentBitmap != null) {
                            PhotoViewer.this.currentBitmap.recycle();
                            PhotoViewer.this.currentBitmap = null;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PhotoViewer.AnonymousClass7.AnonymousClass1.this.lambda$onPreDraw$1();
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

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            if (PhotoViewer.this.waitingForFirstTextureUpload == 1) {
                PhotoViewer.this.changedTextureView.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass1());
                PhotoViewer.this.changedTextureView.invalidate();
            }
        }
    };
    private float[][] animationValues = (float[][]) Array.newInstance(float.class, 2, 13);
    private final Runnable updateContainerFlagsRunnable = new Runnable() {
        @Override
        public final void run() {
            PhotoViewer.this.lambda$new$3();
        }
    };
    private ImageReceiver leftImage = new ImageReceiver();
    private ImageReceiver centerImage = new ImageReceiver();
    private ImageReceiver rightImage = new ImageReceiver();
    private Paint videoFrameBitmapPaint = new Paint();
    private Bitmap videoFrameBitmap = null;
    private EditState editState = new EditState();
    private String[] currentFileNames = new String[3];
    private boolean[] endReached = {false, true};
    private float scale = 1.0f;
    private float rotate = 0.0f;
    private float mirror = 0.0f;
    private int switchingToMode = -1;
    private DecelerateInterpolator interpolator = new DecelerateInterpolator(1.5f);
    private float pinchStartScale = 1.0f;
    private boolean canZoom = true;
    private boolean canDragDown = true;
    private boolean shownControlsByEnd = false;
    private boolean actionBarWasShownBeforeByEnd = false;
    private boolean bottomTouchEnabled = true;
    private ArrayList<MessageObject> imagesArrTemp = new ArrayList<>();
    private SparseArray<MessageObject>[] imagesByIdsTemp = {new SparseArray<>(), new SparseArray<>()};
    private ArrayList<MessageObject> imagesArr = new ArrayList<>();
    private SparseArray<MessageObject>[] imagesByIds = {new SparseArray<>(), new SparseArray<>()};
    private ArrayList<ImageLocation> imagesArrLocations = new ArrayList<>();
    private ArrayList<ImageLocation> imagesArrLocationsVideo = new ArrayList<>();
    private ArrayList<Long> imagesArrLocationsSizes = new ArrayList<>();
    private ArrayList<TLRPC$Message> imagesArrMessages = new ArrayList<>();
    private ArrayList<SecureDocument> secureDocuments = new ArrayList<>();
    private ArrayList<TLRPC$Photo> avatarsArr = new ArrayList<>();
    private ArrayList<Object> imagesArrLocals = new ArrayList<>();
    private ImageLocation currentAvatarLocation = null;
    private SavedState savedState = null;
    private Rect hitRect = new Rect();
    Runnable longPressRunnable = new Runnable() {
        @Override
        public final void run() {
            PhotoViewer.this.onLongPress();
        }
    };
    private int[] tempInt = new int[2];
    private long captureFrameAtTime = -1;
    private long captureFrameReadyAtTime = -1;
    private long needCaptureFrameReadyAtTime = -1;
    private int compressionsCount = -1;

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
        public CharSequence getSubtitleFor(int i) {
            return null;
        }

        @Override
        public ImageReceiver.BitmapHolder getThumbForPhoto(MessageObject messageObject, TLRPC$FileLocation tLRPC$FileLocation, int i) {
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
        public void onCaptionChanged(CharSequence charSequence) {
        }

        @Override
        public void onClose() {
        }

        @Override
        public void onOpen() {
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

        boolean isVideo(int i);

        void updateSlideshowCell(TLRPC$PageBlock tLRPC$PageBlock);
    }

    public interface PhotoViewerProvider {
        boolean allowCaption();

        boolean allowSendingSubmenu();

        boolean canCaptureMorePhotos();

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

        CharSequence getSubtitleFor(int i);

        ImageReceiver.BitmapHolder getThumbForPhoto(MessageObject messageObject, TLRPC$FileLocation tLRPC$FileLocation, int i);

        CharSequence getTitleFor(int i);

        int getTotalImageCount();

        boolean isPhotoChecked(int i);

        boolean loadMore();

        void needAddMorePhotos();

        void onApplyCaption(CharSequence charSequence);

        void onCaptionChanged(CharSequence charSequence);

        void onClose();

        void onOpen();

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

    public static boolean lambda$setParentActivity$24(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean lambda$setParentActivity$25(View view, MotionEvent motionEvent) {
        return true;
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

    public void lambda$new$0() {
        toggleMiniProgressInternal(true);
    }

    public void addPhoto(MessageObject messageObject, int i) {
        if (i == this.classGuid) {
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
    }

    public int getClassGuid() {
        return this.classGuid;
    }

    public void setCaption(CharSequence charSequence) {
        this.hasCaptionForAllMedia = true;
        this.captionForAllMedia = charSequence;
        setCurrentCaption(null, charSequence, false);
        updateCaptionTextForCurrentPhoto(null);
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
        if (textView == null || !(clickableSpan instanceof URLSpan)) {
            clickableSpan.onClick(textView);
            return;
        }
        String url = ((URLSpan) clickableSpan).getURL();
        if (url.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            if (this.videoPlayer != null && this.currentMessageObject != null) {
                int intValue = Utilities.parseInt((CharSequence) url).intValue();
                if (this.videoPlayer.getDuration() == -9223372036854775807L) {
                    this.seekToProgressPending = intValue / this.currentMessageObject.getDuration();
                    return;
                }
                long j = intValue * 1000;
                this.videoPlayer.seekTo(j);
                this.videoPlayerSeekbar.setProgress(((float) j) / ((float) this.videoPlayer.getDuration()), true);
                this.videoPlayerSeekbarView.invalidate();
            }
        } else if (url.startsWith("#")) {
            if (this.parentActivity instanceof LaunchActivity) {
                DialogsActivity dialogsActivity = new DialogsActivity(null);
                dialogsActivity.setSearchString(url);
                ((LaunchActivity) this.parentActivity).presentFragment(dialogsActivity, false, true);
                closePhoto(false, false);
            }
        } else if (this.parentChatActivity == null || (!(clickableSpan instanceof URLSpanReplacement) && !AndroidUtilities.shouldShowUrlInAlert(url))) {
            clickableSpan.onClick(textView);
        } else {
            AlertsCreator.showOpenUrlAlert(this.parentChatActivity, url, true, true);
        }
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

    public class AnonymousClass5 implements Runnable {
        AnonymousClass5() {
        }

        @Override
        public void run() {
            float f;
            if (PhotoViewer.this.videoPlayer != null) {
                float f2 = 0.0f;
                if (!PhotoViewer.this.isCurrentVideo) {
                    final float currentPosition = ((float) PhotoViewer.this.videoPlayer.getCurrentPosition()) / ((float) PhotoViewer.this.videoPlayer.getDuration());
                    if (PhotoViewer.this.shownControlsByEnd && !PhotoViewer.this.actionBarWasShownBeforeByEnd) {
                        currentPosition = 0.0f;
                    }
                    if (PhotoViewer.this.currentVideoFinishedLoading) {
                        f = 1.0f;
                    } else {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (Math.abs(elapsedRealtime - PhotoViewer.this.lastBufferedPositionCheck) >= 500) {
                            if (PhotoViewer.this.isStreaming) {
                                f = FileLoader.getInstance(PhotoViewer.this.currentAccount).getBufferedProgressFromPosition(PhotoViewer.this.seekToProgressPending != 0.0f ? PhotoViewer.this.seekToProgressPending : currentPosition, PhotoViewer.this.currentFileNames[0]);
                            } else {
                                f = 1.0f;
                            }
                            PhotoViewer.this.lastBufferedPositionCheck = elapsedRealtime;
                        } else {
                            f = -1.0f;
                        }
                    }
                    if (PhotoViewer.this.inPreview || PhotoViewer.this.videoTimelineView.getVisibility() != 0) {
                        if (PhotoViewer.this.seekToProgressPending == 0.0f) {
                            PhotoViewer photoViewer = PhotoViewer.this;
                            VideoPlayerRewinder videoPlayerRewinder = photoViewer.videoPlayerRewinder;
                            if (videoPlayerRewinder.rewindCount == 0 || !videoPlayerRewinder.rewindByBackSeek) {
                                photoViewer.videoPlayerSeekbar.setProgress(currentPosition, false);
                            }
                        }
                        if (f != -1.0f) {
                            PhotoViewer.this.videoPlayerSeekbar.setBufferedProgress(f);
                            PipVideoOverlay.setBufferedProgress(f);
                        }
                    } else if (currentPosition >= PhotoViewer.this.videoTimelineView.getRightProgress()) {
                        PhotoViewer.this.manuallyPaused = false;
                        PhotoViewer.this.videoPlayer.pause();
                        PhotoViewer.this.videoPlayerSeekbar.setProgress(0.0f);
                        PhotoViewer.this.videoPlayer.seekTo((int) (PhotoViewer.this.videoTimelineView.getLeftProgress() * ((float) PhotoViewer.this.videoPlayer.getDuration())));
                        PhotoViewer.this.containerView.invalidate();
                    } else {
                        float leftProgress = currentPosition - PhotoViewer.this.videoTimelineView.getLeftProgress();
                        if (leftProgress < 0.0f) {
                            leftProgress = 0.0f;
                        }
                        currentPosition = leftProgress / (PhotoViewer.this.videoTimelineView.getRightProgress() - PhotoViewer.this.videoTimelineView.getLeftProgress());
                        if (currentPosition > 1.0f) {
                            currentPosition = 1.0f;
                        }
                        PhotoViewer.this.videoPlayerSeekbar.setProgress(currentPosition);
                    }
                    PhotoViewer.this.videoPlayerSeekbarView.invalidate();
                    if (PhotoViewer.this.shouldSavePositionForCurrentVideo != null && currentPosition >= 0.0f && SystemClock.elapsedRealtime() - PhotoViewer.this.lastSaveTime >= 1000) {
                        String unused = PhotoViewer.this.shouldSavePositionForCurrentVideo;
                        PhotoViewer.this.lastSaveTime = SystemClock.elapsedRealtime();
                        Utilities.globalQueue.postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                PhotoViewer.AnonymousClass5.this.lambda$run$0(currentPosition);
                            }
                        });
                    }
                    PhotoViewer.this.updateVideoPlayerTime();
                } else if (!PhotoViewer.this.videoTimelineView.isDragging()) {
                    f2 = ((float) PhotoViewer.this.videoPlayer.getCurrentPosition()) / ((float) PhotoViewer.this.videoPlayer.getDuration());
                    if (!PhotoViewer.this.shownControlsByEnd || PhotoViewer.this.actionBarWasShownBeforeByEnd) {
                    }
                    if (PhotoViewer.this.inPreview || (PhotoViewer.this.currentEditMode == 0 && PhotoViewer.this.videoTimelineView.getVisibility() != 0)) {
                        if (PhotoViewer.this.sendPhotoType != 1) {
                            PhotoViewer.this.videoTimelineView.setProgress(f2);
                        }
                    } else if (f2 >= PhotoViewer.this.videoTimelineView.getRightProgress()) {
                        PhotoViewer.this.videoTimelineView.setProgress(PhotoViewer.this.videoTimelineView.getLeftProgress());
                        PhotoViewer.this.videoPlayer.seekTo((int) (PhotoViewer.this.videoTimelineView.getLeftProgress() * ((float) PhotoViewer.this.videoPlayer.getDuration())));
                        PhotoViewer.this.manuallyPaused = false;
                        PhotoViewer.this.cancelVideoPlayRunnable();
                        if (PhotoViewer.this.muteVideo || PhotoViewer.this.sendPhotoType == 1 || PhotoViewer.this.currentEditMode != 0 || PhotoViewer.this.switchingToMode > 0) {
                            PhotoViewer.this.videoPlayer.play();
                        } else {
                            PhotoViewer.this.videoPlayer.pause();
                        }
                        PhotoViewer.this.containerView.invalidate();
                    } else {
                        PhotoViewer.this.videoTimelineView.setProgress(f2);
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

    public void lambda$new$3() {
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

        private EditState() {
        }

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
            PhotoViewer.this.windowLayoutParams.softInputMode = (PhotoViewer.this.useSmoothKeyboard ? 32 : 16) | 256;
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
        private final RectF rect = new RectF();
        private final RectF visibleRect = new RectF();

        public BackgroundDrawable(int i) {
            super(i);
            Paint paint = new Paint(1);
            this.paint = paint;
            paint.setColor(i);
        }

        @Override
        @Keep
        public void setAlpha(int i) {
            if (PhotoViewer.this.parentActivity instanceof LaunchActivity) {
                this.allowDrawContent = !PhotoViewer.this.isVisible || i != 255;
                ((LaunchActivity) PhotoViewer.this.parentActivity).drawerLayoutContainer.setAllowDrawContent(this.allowDrawContent);
                if (PhotoViewer.this.parentAlert != null) {
                    if (!this.allowDrawContent) {
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                PhotoViewer.BackgroundDrawable.this.lambda$setAlpha$0();
                            }
                        }, 50L);
                    } else {
                        PhotoViewer.this.parentAlert.setAllowDrawContent(true);
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
            if (PhotoViewer.this.animationInProgress == 0 || AndroidUtilities.isTablet() || PhotoViewer.this.currentPlaceObject == null || PhotoViewer.this.currentPlaceObject.animatingImageView == null) {
                super.draw(canvas);
            } else {
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
            }
            if (!(getAlpha() == 0 || (runnable = this.drawRunnable) == null)) {
                AndroidUtilities.runOnUIThread(runnable);
                this.drawRunnable = null;
            }
        }
    }

    public static class SelectedPhotosListView extends RecyclerListView {
        private Drawable arrowDrawable;
        private Paint paint = new Paint(1);
        private RectF rect = new RectF();

        public SelectedPhotosListView(Context context) {
            super(context);
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
                int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i2 = Integer.MIN_VALUE;
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    i = (int) Math.min(i, Math.floor(childAt.getX()));
                    i2 = (int) Math.max(i2, Math.ceil(childAt.getX() + childAt.getMeasuredWidth()));
                }
                if (!(i == Integer.MAX_VALUE || i2 == Integer.MIN_VALUE)) {
                    this.rect.set(i - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), i2 + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(103.0f));
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.paint);
                }
            }
        }
    }

    public static class CounterView extends View {
        private int height;
        private Paint paint;
        private float rotation;
        private StaticLayout staticLayout;
        private TextPaint textPaint;
        private int width;
        private int currentCount = 0;
        private RectF rect = new RectF();

        public CounterView(Context context) {
            super(context);
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
                        if (j2 >= 300) {
                            float f2 = this.currentProgress;
                            this.animatedProgressValue = f2;
                            this.animationProgressStart = f2;
                            this.currentProgressTime = 0L;
                        } else {
                            this.animatedProgressValue = this.animationProgressStart + (f * PhotoViewer.decelerateInterpolator.getInterpolation(((float) this.currentProgressTime) / 300.0f));
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
            if (i3 != i) {
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
                if (!z || (i2 = this.backgroundState) == i) {
                    this.previousBackgroundState = -2;
                } else {
                    this.previousBackgroundState = i2;
                    this.animatedAlphaValue = 1.0f;
                }
                this.backgroundState = i;
                onBackgroundStateUpdated(i);
                this.parent.invalidate();
            }
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
        private boolean ignoreLayout;
        private Paint paint = new Paint();
        AdjustPanLayoutHelper adjustPanLayoutHelper = new AdjustPanLayoutHelper(this, false) {
            @Override
            protected void onPanTranslationUpdate(float f, float f2, boolean z) {
                PhotoViewer.this.currentPanTranslationY = f;
                if (PhotoViewer.this.currentEditMode != 3) {
                    PhotoViewer.this.actionBar.setTranslationY(f);
                }
                if (PhotoViewer.this.miniProgressView != null) {
                    PhotoViewer.this.miniProgressView.setTranslationY(f);
                }
                if (PhotoViewer.this.progressView != null) {
                    PhotoViewer.this.progressView.setTranslationY(f);
                }
                if (PhotoViewer.this.checkImageView != null) {
                    PhotoViewer.this.checkImageView.setTranslationY(f);
                }
                if (PhotoViewer.this.photosCounterView != null) {
                    PhotoViewer.this.photosCounterView.setTranslationY(f);
                }
                if (PhotoViewer.this.selectedPhotosListView != null) {
                    PhotoViewer.this.selectedPhotosListView.setTranslationY(f);
                }
                if (PhotoViewer.this.aspectRatioFrameLayout != null) {
                    PhotoViewer.this.aspectRatioFrameLayout.setTranslationY(f);
                }
                if (PhotoViewer.this.textureImageView != null) {
                    PhotoViewer.this.textureImageView.setTranslationY(f);
                }
                if (PhotoViewer.this.photoCropView != null) {
                    PhotoViewer.this.photoCropView.setTranslationY(f);
                }
                if (PhotoViewer.this.photoFilterView != null) {
                    PhotoViewer.this.photoFilterView.setTranslationY(f);
                }
                if (PhotoViewer.this.pickerView != null) {
                    PhotoViewer.this.pickerView.setTranslationY(f);
                }
                if (PhotoViewer.this.pickerViewSendButton != null) {
                    PhotoViewer.this.pickerViewSendButton.setTranslationY(f);
                }
                float f3 = 0.0f;
                if (PhotoViewer.this.currentEditMode == 3) {
                    if (PhotoViewer.this.captionEditText != null) {
                        PhotoViewer.this.captionEditText.setTranslationY(f);
                    }
                    if (PhotoViewer.this.photoPaintView != null) {
                        PhotoViewer.this.photoPaintView.setTranslationY(0.0f);
                        PhotoViewer.this.photoPaintView.getColorPicker().setTranslationY(f);
                        PhotoViewer.this.photoPaintView.getToolsView().setTranslationY(f);
                        PhotoViewer.this.photoPaintView.getColorPickerBackground().setTranslationY(f);
                        PhotoViewer.this.photoPaintView.getCurtainView().setTranslationY(f);
                    }
                } else {
                    if (PhotoViewer.this.photoPaintView != null) {
                        PhotoViewer.this.photoPaintView.setTranslationY(f);
                    }
                    if (PhotoViewer.this.captionEditText != null) {
                        if (f2 >= 0.5f) {
                            f3 = (f2 - 0.5f) / 0.5f;
                        }
                        PhotoViewer.this.captionEditText.setAlpha(f3);
                        PhotoViewerCaptionEnterView photoViewerCaptionEnterView = PhotoViewer.this.captionEditText;
                        float f4 = this.keyboardSize;
                        photoViewerCaptionEnterView.setTranslationY((f - f4) + (AndroidUtilities.dp(f4 / 2.0f) * (1.0f - f2)));
                    }
                }
                if (PhotoViewer.this.muteItem != null) {
                    PhotoViewer.this.muteItem.setTranslationY(f);
                }
                if (PhotoViewer.this.cameraItem != null) {
                    PhotoViewer.this.cameraItem.setTranslationY(f);
                }
                if (PhotoViewer.this.captionLimitView != null) {
                    PhotoViewer.this.captionLimitView.setTranslationY(f);
                }
                FrameLayoutDrawer.this.invalidate();
            }

            @Override
            protected void onTransitionStart(boolean z, int i) {
                int i2;
                String str;
                PhotoViewer.this.navigationBar.setVisibility(4);
                PhotoViewer.this.animateNavBarColorTo(-16777216);
                if (PhotoViewer.this.captionEditText.getTag() == null || !z) {
                    PhotoViewer.this.checkImageView.animate().alpha(1.0f).setDuration(220L).start();
                    PhotoViewer.this.photosCounterView.animate().alpha(1.0f).setDuration(220L).start();
                    if (PhotoViewer.this.lastTitle != null && !PhotoViewer.this.isCurrentVideo) {
                        PhotoViewer.this.actionBar.setTitleAnimated(PhotoViewer.this.lastTitle, false, 220L);
                        PhotoViewer.this.lastTitle = null;
                        return;
                    }
                    return;
                }
                if (PhotoViewer.this.isCurrentVideo) {
                    if (PhotoViewer.this.muteVideo) {
                        i2 = R.string.GifCaption;
                        str = "GifCaption";
                    } else {
                        i2 = R.string.VideoCaption;
                        str = "VideoCaption";
                    }
                    PhotoViewer.this.actionBar.setTitleAnimated(LocaleController.getString(str, i2), true, 220L);
                } else {
                    PhotoViewer.this.actionBar.setTitleAnimated(LocaleController.getString("PhotoCaption", R.string.PhotoCaption), true, 220L);
                }
                PhotoViewer.this.captionEditText.setAlpha(0.0f);
                PhotoViewer.this.checkImageView.animate().alpha(0.0f).setDuration(220L).start();
                PhotoViewer.this.photosCounterView.animate().alpha(0.0f).setDuration(220L).start();
                PhotoViewer.this.selectedPhotosListView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(220L).start();
            }

            @Override
            protected void onTransitionEnd() {
                super.onTransitionEnd();
                PhotoViewer.this.navigationBar.setVisibility(PhotoViewer.this.currentEditMode != 2 ? 0 : 4);
                if (PhotoViewer.this.captionEditText.getTag() == null) {
                    PhotoViewer.this.captionEditText.setVisibility(8);
                }
                PhotoViewer.this.captionEditText.setTranslationY(0.0f);
            }

            @Override
            protected boolean heightAnimationEnabled() {
                return !PhotoViewer.this.captionEditText.isPopupShowing() && PhotoViewer.this.keyboardAnimationEnabled;
            }
        };

        public FrameLayoutDrawer(Context context) {
            super(context, false);
            setWillNotDraw(false);
            this.paint.setColor(AndroidUtilities.DARK_STATUS_BAR_OVERLAY);
        }

        @Override
        protected void onMeasure(int r19, int r20) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.FrameLayoutDrawer.onMeasure(int, int):void");
        }

        @Override
        protected void onLayout(boolean r16, int r17, int r18, int r19, int r20) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.FrameLayoutDrawer.onLayout(boolean, int, int, int, int):void");
        }

        @Override
        protected void onDraw(Canvas canvas) {
            PhotoViewer.this.onDraw(canvas);
            if (PhotoViewer.this.isStatusBarVisible() && AndroidUtilities.statusBarHeight != 0 && PhotoViewer.this.actionBar != null) {
                this.paint.setAlpha((int) (PhotoViewer.this.actionBar.getAlpha() * 255.0f * 0.2f));
                canvas.drawRect(0.0f, PhotoViewer.this.currentPanTranslationY, getMeasuredWidth(), PhotoViewer.this.currentPanTranslationY + AndroidUtilities.statusBarHeight, this.paint);
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
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            canvas.save();
            canvas.clipRect(0, 0, getWidth(), getHeight());
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view == PhotoViewer.this.leftPaintingOverlay || view == PhotoViewer.this.rightPaintingOverlay) {
                return false;
            }
            if (view != PhotoViewer.this.navigationBar) {
                canvas.save();
                canvas.clipRect(0, 0, getWidth(), getHeight());
            }
            boolean drawChildInternal = drawChildInternal(canvas, view, j);
            if (view != PhotoViewer.this.navigationBar) {
                canvas.restore();
            }
            return drawChildInternal;
        }

        protected boolean drawChildInternal(Canvas canvas, View view, long j) {
            if (view == PhotoViewer.this.mentionListView || view == PhotoViewer.this.captionEditText) {
                if (PhotoViewer.this.currentEditMode != 0 && PhotoViewer.this.currentPanTranslationY == 0.0f) {
                    return false;
                }
                if (AndroidUtilities.isInMultiwindow || AndroidUtilities.usingHardwareInput) {
                    if (!PhotoViewer.this.captionEditText.isPopupShowing() && PhotoViewer.this.captionEditText.getEmojiPadding() == 0 && PhotoViewer.this.captionEditText.getTag() == null) {
                        return false;
                    }
                } else if (!PhotoViewer.this.captionEditText.isPopupShowing() && PhotoViewer.this.captionEditText.getEmojiPadding() == 0 && getKeyboardHeight() == 0 && PhotoViewer.this.currentPanTranslationY == 0.0f) {
                    return false;
                }
                if (view == PhotoViewer.this.mentionListView) {
                    canvas.save();
                    canvas.clipRect(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    boolean drawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return drawChild;
                }
            } else if (view == PhotoViewer.this.cameraItem || view == PhotoViewer.this.muteItem || view == PhotoViewer.this.pickerView || view == PhotoViewer.this.videoTimelineView || view == PhotoViewer.this.pickerViewSendButton || view == PhotoViewer.this.captionLimitView || view == PhotoViewer.this.captionTextViewSwitcher || (PhotoViewer.this.muteItem.getVisibility() == 0 && view == PhotoViewer.this.bottomLayout)) {
                if (PhotoViewer.this.captionEditText.isPopupAnimating()) {
                    view.setTranslationY(PhotoViewer.this.captionEditText.getEmojiPadding());
                    PhotoViewer.this.bottomTouchEnabled = false;
                } else {
                    int emojiPadding = (getKeyboardHeight() > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow) ? 0 : PhotoViewer.this.captionEditText.getEmojiPadding();
                    if (PhotoViewer.this.captionEditText.isPopupShowing() || (((AndroidUtilities.isInMultiwindow || AndroidUtilities.usingHardwareInput) && PhotoViewer.this.captionEditText.getTag() != null) || getKeyboardHeight() > AndroidUtilities.dp(80.0f) || emojiPadding != 0)) {
                        PhotoViewer.this.bottomTouchEnabled = false;
                        return false;
                    }
                    PhotoViewer.this.bottomTouchEnabled = true;
                }
            } else if (view == PhotoViewer.this.checkImageView || view == PhotoViewer.this.photosCounterView) {
                if (PhotoViewer.this.captionEditText.getTag() != null) {
                    PhotoViewer.this.bottomTouchEnabled = false;
                    if (view.getAlpha() < 0.0f) {
                        return false;
                    }
                } else {
                    PhotoViewer.this.bottomTouchEnabled = true;
                }
            } else if (view == PhotoViewer.this.miniProgressView) {
                return false;
            }
            if (view == PhotoViewer.this.videoTimelineView && PhotoViewer.this.videoTimelineView.getTranslationY() > 0.0f && PhotoViewer.this.pickerView.getTranslationY() == 0.0f) {
                canvas.save();
                canvas.clipRect(PhotoViewer.this.videoTimelineView.getX(), PhotoViewer.this.videoTimelineView.getY(), PhotoViewer.this.videoTimelineView.getX() + PhotoViewer.this.videoTimelineView.getMeasuredWidth(), PhotoViewer.this.videoTimelineView.getBottom());
                boolean drawChild2 = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild2;
            }
            try {
                if (!(view == PhotoViewer.this.aspectRatioFrameLayout || view == PhotoViewer.this.paintingOverlay)) {
                    if (super.drawChild(canvas, view, j)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable unused) {
                return true;
            }
        }

        @Override
        public void requestLayout() {
            if (!this.ignoreLayout) {
                super.requestLayout();
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.adjustPanLayoutHelper.setResizableView(PhotoViewer.this.windowView);
            this.adjustPanLayoutHelper.onAttach();
            Bulletin.addDelegate(this, new Bulletin.Delegate() {
                @Override
                public void onHide(Bulletin bulletin) {
                    Bulletin.Delegate.CC.$default$onHide(this, bulletin);
                }

                @Override
                public void onOffsetChange(float f) {
                    Bulletin.Delegate.CC.$default$onOffsetChange(this, f);
                }

                @Override
                public void onShow(Bulletin bulletin) {
                    Bulletin.Delegate.CC.$default$onShow(this, bulletin);
                }

                @Override
                public int getBottomOffset(int i) {
                    int i2 = 0;
                    if (PhotoViewer.this.bottomLayout != null && PhotoViewer.this.bottomLayout.getVisibility() == 0) {
                        i2 = 0 + PhotoViewer.this.bottomLayout.getHeight();
                    }
                    return (PhotoViewer.this.groupedPhotosListView == null || !PhotoViewer.this.groupedPhotosListView.hasPhotos()) ? i2 : (AndroidUtilities.isTablet() || PhotoViewer.this.containerView.getMeasuredHeight() > PhotoViewer.this.containerView.getMeasuredWidth()) ? i2 + PhotoViewer.this.groupedPhotosListView.getHeight() : i2;
                }
            });
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.adjustPanLayoutHelper.onDetach();
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
                public void setValue(VideoPlayerControlFrameLayout videoPlayerControlFrameLayout, float f) {
                    videoPlayerControlFrameLayout.setProgress(f);
                }

                public Float get(VideoPlayerControlFrameLayout videoPlayerControlFrameLayout) {
                    return Float.valueOf(videoPlayerControlFrameLayout.getProgress());
                }
            };
        } else {
            VPC_PROGRESS = new Property<VideoPlayerControlFrameLayout, Float>(Float.class, "progress") {
                public void set(VideoPlayerControlFrameLayout videoPlayerControlFrameLayout, Float f) {
                    videoPlayerControlFrameLayout.setProgress(f.floatValue());
                }

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
        private int parentHeight;
        private int parentWidth;
        private boolean seekBarTransitionEnabled;
        private float progress = 1.0f;
        private boolean translationYAnimationEnabled = true;

        public VideoPlayerControlFrameLayout(Context context) {
            super(context);
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
        public void requestLayout() {
            if (!this.ignoreLayout) {
                super.requestLayout();
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int i3;
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
            }
            long j2 = j / 1000;
            long j3 = j2 / 60;
            long j4 = j2 % 60;
            PhotoViewer.this.videoPlayerSeekbar.setSize(((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ((int) Math.ceil(PhotoViewer.this.videoPlayerTime.getPaint().measureText(String.format(Locale.ROOT, "%02d:%02d / %02d:%02d", Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j4)))))) - i3, getMeasuredHeight());
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
                if (z) {
                    setTranslationY(0.0f);
                    PhotoViewer.this.videoPlayerSeekbarView.setAlpha(1.0f);
                } else {
                    PhotoViewer.this.videoPlayerTime.setScaleX(1.0f);
                    PhotoViewer.this.videoPlayerTime.setScaleY(1.0f);
                    PhotoViewer.this.videoPlayerSeekbar.setTransitionProgress(0.0f);
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

    public class CaptionTextViewSwitcher extends TextViewSwitcher {
        private boolean inScrollView = false;
        private float alpha = 1.0f;

        public CaptionTextViewSwitcher(Context context) {
            super(context);
        }

        @Override
        public void setVisibility(int i) {
            setVisibility(i, true);
        }

        public void setVisibility(int i, boolean z) {
            super.setVisibility(i);
            if (this.inScrollView && z) {
                PhotoViewer.this.captionScrollView.setVisibility(i);
            }
        }

        @Override
        public void setAlpha(float f) {
            this.alpha = f;
            if (this.inScrollView) {
                PhotoViewer.this.captionScrollView.setAlpha(f);
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
                PhotoViewer.this.captionScrollView.invalidate();
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (PhotoViewer.this.captionContainer != null && getParent() == PhotoViewer.this.captionContainer) {
                this.inScrollView = true;
                PhotoViewer.this.captionScrollView.setVisibility(getVisibility());
                PhotoViewer.this.captionScrollView.setAlpha(this.alpha);
                super.setAlpha(1.0f);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.inScrollView) {
                this.inScrollView = false;
                PhotoViewer.this.captionScrollView.setVisibility(8);
                super.setAlpha(this.alpha);
            }
        }
    }

    public class CaptionScrollView extends NestedScrollView {
        private Method abortAnimatedScrollMethod;
        private boolean dontChangeTopMargin;
        private boolean isLandscape;
        private boolean nestedScrollStarted;
        private float overScrollY;
        private final Paint paint;
        private int prevHeight;
        private OverScroller scroller;
        private final SpringAnimation springAnimation;
        private int textHash;
        private float velocitySign;
        private float velocityY;
        private float backgroundAlpha = 1.0f;
        private int pendingTopMargin = -1;

        @Override
        protected float getBottomFadingEdgeStrength() {
            return 1.0f;
        }

        @Override
        protected float getTopFadingEdgeStrength() {
            return 1.0f;
        }

        public CaptionScrollView(Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.paint = paint;
            setClipChildren(false);
            setOverScrollMode(2);
            paint.setColor(-16777216);
            setFadingEdgeLength(AndroidUtilities.dp(12.0f));
            setVerticalFadingEdgeEnabled(true);
            setWillNotDraw(false);
            SpringAnimation springAnimation = new SpringAnimation(PhotoViewer.this.captionTextViewSwitcher, DynamicAnimation.TRANSLATION_Y, 0.0f);
            this.springAnimation = springAnimation;
            springAnimation.getSpring().setStiffness(100.0f);
            springAnimation.setMinimumVisibleChange(1.0f);
            springAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                @Override
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                    PhotoViewer.CaptionScrollView.this.lambda$new$0(dynamicAnimation, f, f2);
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
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= (PhotoViewer.this.captionContainer.getTop() - getScrollY()) + PhotoViewer.this.captionTextViewSwitcher.getTranslationY()) {
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
                ((ViewGroup.MarginLayoutParams) PhotoViewer.this.captionContainer.getLayoutParams()).topMargin = this.pendingTopMargin;
                this.pendingTopMargin = -1;
                requestLayout();
            }
        }

        public int getPendingMarginTopDiff() {
            int i = this.pendingTopMargin;
            if (i >= 0) {
                return i - ((ViewGroup.MarginLayoutParams) PhotoViewer.this.captionContainer.getLayoutParams()).topMargin;
            }
            return 0;
        }

        public void updateTopMargin() {
            updateTopMargin(getWidth(), getHeight());
        }

        private void updateTopMargin(int i, int i2) {
            int calculateNewContainerMarginTop = calculateNewContainerMarginTop(i, i2);
            if (calculateNewContainerMarginTop < 0) {
                return;
            }
            if (this.dontChangeTopMargin) {
                this.pendingTopMargin = calculateNewContainerMarginTop;
                return;
            }
            ((ViewGroup.MarginLayoutParams) PhotoViewer.this.captionContainer.getLayoutParams()).topMargin = calculateNewContainerMarginTop;
            this.pendingTopMargin = -1;
        }

        public int calculateNewContainerMarginTop(int i, int i2) {
            int i3;
            if (i == 0 || i2 == 0) {
                return -1;
            }
            TextView currentView = PhotoViewer.this.captionTextViewSwitcher.getCurrentView();
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
            int i4 = 2;
            if ((!z || lineCount > 2) && (z || lineCount > 5)) {
                if (!z) {
                    i4 = 5;
                }
                int min = Math.min(i4, lineCount);
                loop0: while (min > 1) {
                    int i5 = min - 1;
                    for (int lineStart = layout.getLineStart(i5); lineStart < layout.getLineEnd(i5); lineStart++) {
                        if (Character.isLetterOrDigit(text.charAt(lineStart))) {
                            break loop0;
                        }
                    }
                    min--;
                }
                i2 -= currentView.getPaint().getFontMetricsInt(null) * min;
                i3 = AndroidUtilities.dp(8.0f);
            } else {
                i3 = currentView.getMeasuredHeight();
            }
            return i2 - i3;
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
                    PhotoViewer.this.captionTextViewSwitcher.setTranslationY(this.overScrollY);
                    return true;
                }
            }
            return false;
        }

        @Override
        public void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
            float f;
            if (i4 != 0) {
                int round = Math.round(i4 * (1.0f - Math.abs((-this.overScrollY) / (PhotoViewer.this.captionContainer.getTop() - ((PhotoViewer.this.isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0) + ActionBar.getCurrentActionBarHeight())))));
                if (round == 0) {
                    return;
                }
                if (this.nestedScrollStarted) {
                    this.overScrollY -= round;
                    PhotoViewer.this.captionTextViewSwitcher.setTranslationY(this.overScrollY);
                } else if (!this.springAnimation.isRunning()) {
                    OverScroller overScroller = this.scroller;
                    float currVelocity = overScroller != null ? overScroller.getCurrVelocity() : Float.NaN;
                    if (!Float.isNaN(currVelocity)) {
                        Point point = AndroidUtilities.displaySize;
                        float min = Math.min(point.x > point.y ? 3000.0f : 5000.0f, currVelocity);
                        round = (int) ((round * min) / currVelocity);
                        f = min * (-this.velocitySign);
                    } else {
                        f = 0.0f;
                    }
                    if (round != 0) {
                        this.overScrollY -= round;
                        PhotoViewer.this.captionTextViewSwitcher.setTranslationY(this.overScrollY);
                    }
                    startSpringAnimationIfNotRunning(f);
                }
            }
        }

        private void startSpringAnimationIfNotRunning(float f) {
            if (!this.springAnimation.isRunning()) {
                this.springAnimation.setStartVelocity(f);
                this.springAnimation.start();
            }
        }

        @Override
        public boolean startNestedScroll(int i, int i2) {
            if (i2 == 0) {
                this.springAnimation.cancel();
                this.nestedScrollStarted = true;
                this.overScrollY = PhotoViewer.this.captionTextViewSwitcher.getTranslationY();
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
        }

        @Override
        public void stopNestedScroll(int i) {
            OverScroller overScroller;
            if (this.nestedScrollStarted && i == 0) {
                this.nestedScrollStarted = false;
                if (this.overScrollY != 0.0f && (overScroller = this.scroller) != null && overScroller.isFinished()) {
                    startSpringAnimationIfNotRunning(this.velocityY);
                }
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
            canvas.drawRect(0.0f, PhotoViewer.this.captionContainer.getTop() + PhotoViewer.this.captionTextViewSwitcher.getTranslationY(), width, i, this.paint);
            super.draw(canvas);
            canvas.restoreToCount(save);
        }

        @Override
        public void invalidate() {
            super.invalidate();
            if (PhotoViewer.this.isActionBarVisible) {
                int scrollY = getScrollY();
                float translationY = PhotoViewer.this.captionTextViewSwitcher.getTranslationY();
                float f = 0.0f;
                boolean z = scrollY == 0 && translationY == 0.0f;
                boolean z2 = scrollY == 0 && translationY == 0.0f;
                if (!z) {
                    int y = PhotoViewer.this.photoProgressViews[0].getY() + PhotoViewer.this.photoProgressViews[0].size;
                    int top = (((PhotoViewer.this.captionContainer.getTop() + ((int) translationY)) - scrollY) + ((PhotoViewer.this.isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0) + ActionBar.getCurrentActionBarHeight())) - AndroidUtilities.dp(12.0f);
                    z2 = top > ((int) PhotoViewer.this.fullscreenButton[0].getY()) + AndroidUtilities.dp(32.0f);
                    z = top > y;
                }
                if (PhotoViewer.this.allowShowFullscreenButton) {
                    if (PhotoViewer.this.fullscreenButton[0].getTag() != null && ((Integer) PhotoViewer.this.fullscreenButton[0].getTag()).intValue() == 3 && z2) {
                        PhotoViewer.this.fullscreenButton[0].setTag(2);
                        PhotoViewer.this.fullscreenButton[0].animate().alpha(1.0f).setDuration(150L).setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                PhotoViewer.this.fullscreenButton[0].setTag(null);
                            }
                        }).start();
                    } else if (PhotoViewer.this.fullscreenButton[0].getTag() == null && !z2) {
                        PhotoViewer.this.fullscreenButton[0].setTag(3);
                        PhotoViewer.this.fullscreenButton[0].animate().alpha(0.0f).setListener(null).setDuration(150L).start();
                    }
                }
                PhotoProgressView photoProgressView = PhotoViewer.this.photoProgressViews[0];
                if (z) {
                    f = 1.0f;
                }
                photoProgressView.setIndexedAlpha(2, f, true);
            }
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
        this.blackPaint.setColor(-16777216);
        this.videoFrameBitmapPaint.setColor(-1);
    }

    @Override
    public void didReceivedNotification(int r21, int r22, java.lang.Object... r23) {
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
        if (this.parentActivity != null && this.allowShare) {
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
                if (file == null || !file.exists()) {
                    showDownloadAlert();
                    return;
                }
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
                        intent.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(this.parentActivity, "org.telegram.messenger.beta.provider", file));
                        intent.setFlags(1);
                    } catch (Exception unused) {
                        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                }
                this.parentActivity.startActivityForResult(Intent.createChooser(intent, LocaleController.getString("ShareFile", R.string.ShareFile)), 500);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public void setScaleToFill() {
        float bitmapWidth = this.centerImage.getBitmapWidth();
        float bitmapHeight = this.centerImage.getBitmapHeight();
        if (bitmapWidth != 0.0f && bitmapHeight != 0.0f) {
            float containerViewWidth = getContainerViewWidth();
            float containerViewHeight = getContainerViewHeight();
            float min = Math.min(containerViewHeight / bitmapHeight, containerViewWidth / bitmapWidth);
            float max = Math.max(containerViewWidth / ((int) (bitmapWidth * min)), containerViewHeight / ((int) (bitmapHeight * min)));
            this.scale = max;
            updateMinMax(max);
        }
    }

    public void setParentAlert(ChatAttachAlert chatAttachAlert) {
        this.parentAlert = chatAttachAlert;
    }

    public void setParentActivity(Activity activity) {
        setParentActivity(activity, null);
    }

    public void setParentActivity(final Activity activity, final Theme.ResourcesProvider resourcesProvider) {
        Theme.createChatResources(activity, false);
        this.resourcesProvider = resourcesProvider;
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.centerImage.setCurrentAccount(i);
        this.leftImage.setCurrentAccount(this.currentAccount);
        this.rightImage.setCurrentAccount(this.currentAccount);
        PhotoViewerCaptionEnterView photoViewerCaptionEnterView = this.captionEditText;
        if (photoViewerCaptionEnterView != null) {
            photoViewerCaptionEnterView.currentAccount = UserConfig.selectedAccount;
        }
        if (this.parentActivity == activity || activity == null) {
            updateColors();
            return;
        }
        this.inBubbleMode = activity instanceof BubbleActivity;
        this.parentActivity = activity;
        this.activityContext = new ContextThemeWrapper(this.parentActivity, (int) R.style.Theme_TMessages);
        this.touchSlop = ViewConfiguration.get(this.parentActivity).getScaledTouchSlop();
        if (progressDrawables == null) {
            progressDrawables = new Drawable[]{ContextCompat.getDrawable(this.parentActivity, R.drawable.circle_big), ContextCompat.getDrawable(this.parentActivity, R.drawable.cancel_big), ContextCompat.getDrawable(this.parentActivity, R.drawable.load_big)};
        }
        this.scroller = new Scroller(activity);
        AnonymousClass10 r1 = new AnonymousClass10(activity);
        this.windowView = r1;
        r1.setBackgroundDrawable(this.backgroundDrawable);
        this.windowView.setFocusable(false);
        ClippingImageView clippingImageView = new ClippingImageView(activity);
        this.animatingImageView = clippingImageView;
        clippingImageView.setAnimationValues(this.animationValues);
        this.windowView.addView(this.animatingImageView, LayoutHelper.createFrame(40, 40.0f));
        FrameLayoutDrawer frameLayoutDrawer = new FrameLayoutDrawer(activity);
        this.containerView = frameLayoutDrawer;
        frameLayoutDrawer.setFocusable(false);
        this.containerView.setClipChildren(true);
        this.containerView.setClipToPadding(true);
        this.windowView.setClipChildren(false);
        this.windowView.setClipToPadding(false);
        this.windowView.addView(this.containerView, LayoutHelper.createFrame(-1, -1, 51));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            this.containerView.setFitsSystemWindows(true);
            this.containerView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                @Override
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    WindowInsets lambda$setParentActivity$4;
                    lambda$setParentActivity$4 = PhotoViewer.this.lambda$setParentActivity$4(view, windowInsets);
                    return lambda$setParentActivity$4;
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
        ActionBar actionBar = new ActionBar(activity) {
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
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.formatString("Of", R.string.Of, 1, 1));
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f));
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass12(resourcesProvider));
        ActionBarMenu createMenu = this.actionBar.createMenu();
        ActionBarMenuItem addItem = createMenu.addItem(13, R.drawable.msg_mask);
        this.masksItem = addItem;
        addItem.setContentDescription(LocaleController.getString("Masks", R.string.Masks));
        ActionBarMenuItem addItem2 = createMenu.addItem(5, R.drawable.ic_goinline);
        this.pipItem = addItem2;
        addItem2.setContentDescription(LocaleController.getString("AccDescrPipMode", R.string.AccDescrPipMode));
        ActionBarMenuItem addItem3 = createMenu.addItem(3, R.drawable.msg_forward);
        this.sendItem = addItem3;
        addItem3.setContentDescription(LocaleController.getString("Forward", R.string.Forward));
        ActionBarMenuItem addItem4 = createMenu.addItem(18, R.drawable.share);
        this.shareItem = addItem4;
        addItem4.setContentDescription(LocaleController.getString("ShareFile", R.string.ShareFile));
        ActionBarMenuItem addItem5 = createMenu.addItem(0, R.drawable.ic_ab_other);
        this.menuItem = addItem5;
        addItem5.getPopupLayout().swipeBackGravityRight = true;
        this.chooseSpeedLayout = new ChooseSpeedLayout(this.activityContext, this.menuItem.getPopupLayout().getSwipeBack(), new ChooseSpeedLayout.Callback() {
            @Override
            public void onSpeedSelected(float f) {
                PhotoViewer.this.menuItem.toggleSubMenu();
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
                    PhotoViewer.this.setMenuItemIcon();
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
        ActionBarMenuSubItem addSubItem = this.menuItem.addSubItem(2, R.drawable.msg_media, LocaleController.getString("ShowAllMedia", R.string.ShowAllMedia));
        this.allMediaItem = addSubItem;
        addSubItem.setColors(-328966, -328966);
        this.menuItem.addSubItem(14, R.drawable.msg_gif, LocaleController.getString("SaveToGIFs", R.string.SaveToGIFs)).setColors(-328966, -328966);
        this.menuItem.addSubItem(4, R.drawable.msg_message, LocaleController.getString("ShowInChat", R.string.ShowInChat)).setColors(-328966, -328966);
        this.menuItem.addSubItem(15, R.drawable.msg_sticker, LocaleController.getString("ShowStickers", R.string.ShowStickers)).setColors(-328966, -328966);
        this.menuItem.addSubItem(10, R.drawable.msg_shareout, LocaleController.getString("ShareFile", R.string.ShareFile)).setColors(-328966, -328966);
        this.menuItem.addSubItem(1, R.drawable.msg_gallery, LocaleController.getString("SaveToGallery", R.string.SaveToGallery)).setColors(-328966, -328966);
        this.menuItem.addSubItem(16, R.drawable.msg_openprofile, LocaleController.getString("SetAsMain", R.string.SetAsMain)).setColors(-328966, -328966);
        this.menuItem.addSubItem(6, R.drawable.msg_delete, LocaleController.getString("Delete", R.string.Delete)).setColors(-328966, -328966);
        this.menuItem.addSubItem(7, R.drawable.msg_cancel, LocaleController.getString("StopDownload", R.string.StopDownload)).setColors(-328966, -328966);
        this.menuItem.redrawPopup(-115203550);
        setMenuItemIcon();
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
            protected void measureChildWithMargins(View view, int i3, int i4, int i5, int i6) {
                if (view == PhotoViewer.this.nameTextView || view == PhotoViewer.this.dateTextView) {
                    i4 = PhotoViewer.this.bottomButtonsLayout.getMeasuredWidth();
                }
                super.measureChildWithMargins(view, i3, i4, i5, i6);
            }
        };
        this.bottomLayout = frameLayout;
        frameLayout.setBackgroundColor(2130706432);
        this.containerView.addView(this.bottomLayout, LayoutHelper.createFrame(-1, 48, 83));
        View view = new View(this.activityContext);
        this.navigationBar = view;
        view.setBackgroundColor(2130706432);
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
            public void setCurrentIndex(int i3) {
                PhotoViewer.this.currentIndex = -1;
                if (PhotoViewer.this.currentThumb != null) {
                    PhotoViewer.this.currentThumb.release();
                    PhotoViewer.this.currentThumb = null;
                }
                PhotoViewer.this.dontAutoPlay = true;
                PhotoViewer.this.setImageIndex(i3);
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
        for (int i3 = 0; i3 < 3; i3++) {
            this.fullscreenButton[i3] = new ImageView(this.parentActivity);
            this.fullscreenButton[i3].setImageResource(R.drawable.msg_maxvideo);
            this.fullscreenButton[i3].setContentDescription(LocaleController.getString("AccSwitchToFullscreen", R.string.AccSwitchToFullscreen));
            this.fullscreenButton[i3].setScaleType(ImageView.ScaleType.CENTER);
            this.fullscreenButton[i3].setBackground(Theme.createSelectorDrawable(1090519039));
            this.fullscreenButton[i3].setVisibility(4);
            this.fullscreenButton[i3].setAlpha(1.0f);
            this.containerView.addView(this.fullscreenButton[i3], LayoutHelper.createFrame(48, 48.0f));
            this.fullscreenButton[i3].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    PhotoViewer.this.lambda$setParentActivity$5(view2);
                }
            });
        }
        CaptionTextViewSwitcher captionTextViewSwitcher = new CaptionTextViewSwitcher(this.containerView.getContext());
        this.captionTextViewSwitcher = captionTextViewSwitcher;
        captionTextViewSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public final View makeView() {
                View lambda$setParentActivity$6;
                lambda$setParentActivity$6 = PhotoViewer.this.lambda$setParentActivity$6();
                return lambda$setParentActivity$6;
            }
        });
        this.captionTextViewSwitcher.setVisibility(4);
        setCaptionHwLayerEnabled(true);
        for (int i4 = 0; i4 < 3; i4++) {
            this.photoProgressViews[i4] = new PhotoProgressView(this.containerView) {
                @Override
                protected void onBackgroundStateUpdated(int i5) {
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
            this.photoProgressViews[i4].setBackgroundState(0, false, true);
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
        this.miniProgressView.setBackgroundResource(R.drawable.circle_big);
        this.miniProgressView.setVisibility(4);
        this.miniProgressView.setAlpha(0.0f);
        this.containerView.addView(this.miniProgressView, LayoutHelper.createFrame(64, 64, 17));
        LinearLayout linearLayout = new LinearLayout(this.containerView.getContext());
        this.bottomButtonsLayout = linearLayout;
        linearLayout.setOrientation(0);
        this.bottomLayout.addView(this.bottomButtonsLayout, LayoutHelper.createFrame(-2, -1, 53));
        ImageView imageView = new ImageView(this.containerView.getContext());
        this.paintButton = imageView;
        imageView.setImageResource(R.drawable.msg_photo_draw);
        this.paintButton.setScaleType(ImageView.ScaleType.CENTER);
        this.paintButton.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.bottomButtonsLayout.addView(this.paintButton, LayoutHelper.createFrame(50, -1.0f));
        this.paintButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$7(view2);
            }
        });
        this.paintButton.setContentDescription(LocaleController.getString("AccDescrPhotoEditor", R.string.AccDescrPhotoEditor));
        ImageView imageView2 = new ImageView(this.containerView.getContext());
        this.shareButton = imageView2;
        imageView2.setImageResource(R.drawable.share);
        this.shareButton.setScaleType(ImageView.ScaleType.CENTER);
        this.shareButton.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.bottomButtonsLayout.addView(this.shareButton, LayoutHelper.createFrame(50, -1.0f));
        this.shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$8(view2);
            }
        });
        this.shareButton.setContentDescription(LocaleController.getString("ShareFile", R.string.ShareFile));
        FadingTextViewLayout fadingTextViewLayout = new FadingTextViewLayout(this, this.containerView.getContext()) {
            @Override
            protected void onTextViewCreated(TextView textView) {
                super.onTextViewCreated(textView);
                textView.setTextSize(1, 14.0f);
                textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(-1);
                textView.setGravity(3);
            }
        };
        this.nameTextView = fadingTextViewLayout;
        this.bottomLayout.addView(fadingTextViewLayout, LayoutHelper.createFrame(-1, -2.0f, 51, 16.0f, 5.0f, 8.0f, 0.0f));
        FadingTextViewLayout fadingTextViewLayout2 = new FadingTextViewLayout(this, this.containerView.getContext(), true) {
            private LocaleController.LocaleInfo lastLocaleInfo = null;
            private int staticCharsCount = 0;

            @Override
            protected void onTextViewCreated(TextView textView) {
                super.onTextViewCreated(textView);
                textView.setTextSize(1, 13.0f);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(-1);
                textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                textView.setGravity(3);
            }

            @Override
            protected int getStaticCharsCount() {
                LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                if (this.lastLocaleInfo != currentLocaleInfo) {
                    this.lastLocaleInfo = currentLocaleInfo;
                    this.staticCharsCount = LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().formatterYear.format(new Date()), LocaleController.getInstance().formatterDay.format(new Date())).length();
                }
                return this.staticCharsCount;
            }

            @Override
            public void setText(CharSequence charSequence, boolean z) {
                int staticCharsCount;
                boolean z2 = false;
                if (z) {
                    if (!LocaleController.isRTL || (staticCharsCount = getStaticCharsCount()) <= 0 || (charSequence.length() == staticCharsCount && getText() != null && getText().length() == staticCharsCount)) {
                        z2 = true;
                    }
                    setText(charSequence, true, z2);
                    return;
                }
                setText(charSequence, false, false);
            }
        };
        this.dateTextView = fadingTextViewLayout2;
        this.bottomLayout.addView(fadingTextViewLayout2, LayoutHelper.createFrame(-1, -2.0f, 51, 16.0f, 25.0f, 8.0f, 0.0f));
        createVideoControlsInterface();
        RadialProgressView radialProgressView2 = new RadialProgressView(this.parentActivity, resourcesProvider);
        this.progressView = radialProgressView2;
        radialProgressView2.setProgressColor(-1);
        this.progressView.setBackgroundResource(R.drawable.circle_big);
        this.progressView.setVisibility(4);
        this.containerView.addView(this.progressView, LayoutHelper.createFrame(54, 54, 17));
        PickerBottomLayoutViewer pickerBottomLayoutViewer = new PickerBottomLayoutViewer(this.parentActivity);
        this.qualityPicker = pickerBottomLayoutViewer;
        pickerBottomLayoutViewer.setBackgroundColor(2130706432);
        this.qualityPicker.updateSelectedCount(0, false);
        this.qualityPicker.setTranslationY(AndroidUtilities.dp(120.0f));
        this.qualityPicker.doneButton.setText(LocaleController.getString("Done", R.string.Done).toUpperCase());
        this.qualityPicker.doneButton.setTextColor(getThemedColor("dialogFloatingButton"));
        this.containerView.addView(this.qualityPicker, LayoutHelper.createFrame(-1, 48, 83));
        this.qualityPicker.cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$9(view2);
            }
        });
        this.qualityPicker.doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$10(view2);
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
        QualityChooseView qualityChooseView = new QualityChooseView(this.parentActivity);
        this.qualityChooseView = qualityChooseView;
        qualityChooseView.setTranslationY(AndroidUtilities.dp(120.0f));
        this.qualityChooseView.setVisibility(4);
        this.qualityChooseView.setBackgroundColor(2130706432);
        this.containerView.addView(this.qualityChooseView, LayoutHelper.createFrame(-1, 70.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(this.activityContext) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return PhotoViewer.this.bottomTouchEnabled && super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return PhotoViewer.this.bottomTouchEnabled && super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return PhotoViewer.this.bottomTouchEnabled && super.onTouchEvent(motionEvent);
            }

            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                if (!(PhotoViewer.this.videoTimelineView == null || PhotoViewer.this.videoTimelineView.getVisibility() == 8)) {
                    PhotoViewer.this.videoTimelineView.setTranslationY(f);
                    PhotoViewer.this.videoAvatarTooltip.setTranslationY(f);
                }
                if (PhotoViewer.this.videoAvatarTooltip != null && PhotoViewer.this.videoAvatarTooltip.getVisibility() != 8) {
                    PhotoViewer.this.videoAvatarTooltip.setTranslationY(f);
                }
            }

            @Override
            public void setAlpha(float f) {
                super.setAlpha(f);
                if (PhotoViewer.this.videoTimelineView != null && PhotoViewer.this.videoTimelineView.getVisibility() != 8) {
                    PhotoViewer.this.videoTimelineView.setAlpha(f);
                }
            }

            @Override
            public void setVisibility(int i5) {
                super.setVisibility(i5);
                if (PhotoViewer.this.videoTimelineView != null && PhotoViewer.this.videoTimelineView.getVisibility() != 8) {
                    PhotoViewer.this.videoTimelineView.setVisibility(i5 == 0 ? 0 : 4);
                }
            }

            @Override
            protected void onLayout(boolean z, int i5, int i6, int i7, int i8) {
                super.onLayout(z, i5, i6, i7, i8);
                if (PhotoViewer.this.itemsLayout.getVisibility() != 8) {
                    int dp = (((i7 - i5) - AndroidUtilities.dp(70.0f)) - PhotoViewer.this.itemsLayout.getMeasuredWidth()) / 2;
                    PhotoViewer.this.itemsLayout.layout(dp, PhotoViewer.this.itemsLayout.getTop(), PhotoViewer.this.itemsLayout.getMeasuredWidth() + dp, PhotoViewer.this.itemsLayout.getTop() + PhotoViewer.this.itemsLayout.getMeasuredHeight());
                }
            }
        };
        this.pickerView = frameLayout2;
        frameLayout2.setBackgroundColor(2130706432);
        this.containerView.addView(this.pickerView, LayoutHelper.createFrame(-1, -2, 83));
        TextView textView = new TextView(this.containerView.getContext());
        this.docNameTextView = textView;
        textView.setTextSize(1, 15.0f);
        this.docNameTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.docNameTextView.setSingleLine(true);
        this.docNameTextView.setMaxLines(1);
        this.docNameTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.docNameTextView.setTextColor(-1);
        this.docNameTextView.setGravity(3);
        this.pickerView.addView(this.docNameTextView, LayoutHelper.createFrame(-1, -2.0f, 51, 20.0f, 23.0f, 84.0f, 0.0f));
        TextView textView2 = new TextView(this.containerView.getContext());
        this.docInfoTextView = textView2;
        textView2.setTextSize(1, 14.0f);
        this.docInfoTextView.setSingleLine(true);
        this.docInfoTextView.setMaxLines(1);
        this.docInfoTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.docInfoTextView.setTextColor(-1);
        this.docInfoTextView.setGravity(3);
        this.pickerView.addView(this.docInfoTextView, LayoutHelper.createFrame(-1, -2.0f, 51, 20.0f, 46.0f, 84.0f, 0.0f));
        VideoTimelinePlayView videoTimelinePlayView = new VideoTimelinePlayView(this.parentActivity) {
            @Override
            public void setTranslationY(float f) {
                if (getTranslationY() != f) {
                    super.setTranslationY(f);
                    PhotoViewer.this.containerView.invalidate();
                }
            }
        };
        this.videoTimelineView = videoTimelinePlayView;
        videoTimelinePlayView.setDelegate(new AnonymousClass24());
        showVideoTimeline(false, false);
        this.videoTimelineView.setBackgroundColor(2130706432);
        this.containerView.addView(this.videoTimelineView, LayoutHelper.createFrame(-1, 58.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(this.parentActivity);
        this.videoAvatarTooltip = textView3;
        textView3.setSingleLine(true);
        this.videoAvatarTooltip.setVisibility(8);
        this.videoAvatarTooltip.setText(LocaleController.getString("ChooseCover", R.string.ChooseCover));
        this.videoAvatarTooltip.setGravity(1);
        this.videoAvatarTooltip.setTextSize(1, 14.0f);
        this.videoAvatarTooltip.setTextColor(-7566196);
        this.containerView.addView(this.videoAvatarTooltip, LayoutHelper.createFrame(-1, -2.0f, 83, 0.0f, 8.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(this.parentActivity) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return PhotoViewer.this.bottomTouchEnabled && super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return PhotoViewer.this.bottomTouchEnabled && super.onTouchEvent(motionEvent);
            }

            @Override
            public void setVisibility(int i5) {
                super.setVisibility(i5);
                if (PhotoViewer.this.captionEditText.getCaptionLimitOffset() < 0) {
                    PhotoViewer.this.captionLimitView.setVisibility(i5);
                } else {
                    PhotoViewer.this.captionLimitView.setVisibility(8);
                }
            }

            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                PhotoViewer.this.captionLimitView.setTranslationY(f);
            }

            @Override
            public void setAlpha(float f) {
                super.setAlpha(f);
                PhotoViewer.this.captionLimitView.setAlpha(f);
            }
        };
        this.pickerViewSendButton = imageView3;
        imageView3.setScaleType(ImageView.ScaleType.CENTER);
        int dp = AndroidUtilities.dp(56.0f);
        int themedColor = getThemedColor("dialogFloatingButton");
        int i5 = Build.VERSION.SDK_INT;
        Drawable createSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(dp, themedColor, getThemedColor(i5 >= 21 ? "dialogFloatingButtonPressed" : "dialogFloatingButton"));
        this.pickerViewSendDrawable = createSimpleSelectorCircleDrawable;
        this.pickerViewSendButton.setBackgroundDrawable(createSimpleSelectorCircleDrawable);
        this.pickerViewSendButton.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        this.pickerViewSendButton.setImageResource(R.drawable.attach_send);
        this.pickerViewSendButton.setColorFilter(new PorterDuffColorFilter(getThemedColor("dialogFloatingIcon"), PorterDuff.Mode.MULTIPLY));
        this.containerView.addView(this.pickerViewSendButton, LayoutHelper.createFrame(56, 56.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
        this.pickerViewSendButton.setContentDescription(LocaleController.getString("Send", R.string.Send));
        this.pickerViewSendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$11(view2);
            }
        });
        this.pickerViewSendButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view2) {
                boolean lambda$setParentActivity$15;
                lambda$setParentActivity$15 = PhotoViewer.this.lambda$setParentActivity$15(resourcesProvider, view2);
                return lambda$setParentActivity$15;
            }
        });
        TextView textView4 = new TextView(this.parentActivity);
        this.captionLimitView = textView4;
        textView4.setTextSize(1, 15.0f);
        this.captionLimitView.setTextColor(-1280137);
        this.captionLimitView.setGravity(17);
        this.captionLimitView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.containerView.addView(this.captionLimitView, LayoutHelper.createFrame(56, 20.0f, 85, 3.0f, 0.0f, 14.0f, 78.0f));
        LinearLayout linearLayout2 = new LinearLayout(this.parentActivity) {
            @Override
            protected void onMeasure(int i6, int i7) {
                int childCount = getChildCount();
                int i8 = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    if (getChildAt(i9).getVisibility() == 0) {
                        i8++;
                    }
                }
                int size = View.MeasureSpec.getSize(i6);
                int size2 = View.MeasureSpec.getSize(i7);
                if (i8 != 0) {
                    int min = Math.min(AndroidUtilities.dp(70.0f), size / i8);
                    if (PhotoViewer.this.compressItem.getVisibility() == 0) {
                        int max = Math.max(0, (min - AndroidUtilities.dp(PhotoViewer.this.selectedCompression < 2 ? 48 : 64)) / 2);
                        PhotoViewer.this.compressItem.setPadding(max, 0, max, 0);
                    }
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = getChildAt(i10);
                        if (childAt.getVisibility() != 8) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                        }
                    }
                    setMeasuredDimension(min * i8, size2);
                    return;
                }
                setMeasuredDimension(size, size2);
            }
        };
        this.itemsLayout = linearLayout2;
        linearLayout2.setOrientation(0);
        this.pickerView.addView(this.itemsLayout, LayoutHelper.createFrame(-2, 48.0f, 81, 0.0f, 0.0f, 70.0f, 0.0f));
        ImageView imageView4 = new ImageView(this.parentActivity);
        this.cropItem = imageView4;
        imageView4.setScaleType(ImageView.ScaleType.CENTER);
        this.cropItem.setImageResource(R.drawable.msg_photo_crop);
        this.cropItem.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.itemsLayout.addView(this.cropItem, LayoutHelper.createLinear(48, 48));
        this.cropItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$16(view2);
            }
        });
        this.cropItem.setContentDescription(LocaleController.getString("CropImage", R.string.CropImage));
        ImageView imageView5 = new ImageView(this.parentActivity);
        this.rotateItem = imageView5;
        imageView5.setScaleType(ImageView.ScaleType.CENTER);
        this.rotateItem.setImageResource(R.drawable.msg_photo_rotate);
        this.rotateItem.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.itemsLayout.addView(this.rotateItem, LayoutHelper.createLinear(48, 48));
        this.rotateItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$17(view2);
            }
        });
        this.rotateItem.setContentDescription(LocaleController.getString("AccDescrRotate", R.string.AccDescrRotate));
        ImageView imageView6 = new ImageView(this.parentActivity);
        this.mirrorItem = imageView6;
        imageView6.setScaleType(ImageView.ScaleType.CENTER);
        this.mirrorItem.setImageResource(R.drawable.msg_photo_flip);
        this.mirrorItem.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.itemsLayout.addView(this.mirrorItem, LayoutHelper.createLinear(48, 48));
        this.mirrorItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$18(view2);
            }
        });
        this.mirrorItem.setContentDescription(LocaleController.getString("AccDescrMirror", R.string.AccDescrMirror));
        ImageView imageView7 = new ImageView(this.parentActivity);
        this.paintItem = imageView7;
        imageView7.setScaleType(ImageView.ScaleType.CENTER);
        this.paintItem.setImageResource(R.drawable.msg_photo_draw);
        this.paintItem.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.itemsLayout.addView(this.paintItem, LayoutHelper.createLinear(48, 48));
        this.paintItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$19(view2);
            }
        });
        this.paintItem.setContentDescription(LocaleController.getString("AccDescrPhotoEditor", R.string.AccDescrPhotoEditor));
        ImageView imageView8 = new ImageView(this.parentActivity);
        this.muteItem = imageView8;
        imageView8.setScaleType(ImageView.ScaleType.CENTER);
        this.muteItem.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.containerView.addView(this.muteItem, LayoutHelper.createFrame(48, 48.0f, 83, 16.0f, 0.0f, 0.0f, 0.0f));
        this.muteItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$20(view2);
            }
        });
        ImageView imageView9 = new ImageView(this.parentActivity);
        this.cameraItem = imageView9;
        imageView9.setScaleType(ImageView.ScaleType.CENTER);
        this.cameraItem.setImageResource(R.drawable.photo_add);
        this.cameraItem.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.cameraItem.setContentDescription(LocaleController.getString("AccDescrTakeMorePics", R.string.AccDescrTakeMorePics));
        this.containerView.addView(this.cameraItem, LayoutHelper.createFrame(48, 48.0f, 85, 0.0f, 0.0f, 16.0f, 0.0f));
        this.cameraItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$21(view2);
            }
        });
        ImageView imageView10 = new ImageView(this.parentActivity);
        this.tuneItem = imageView10;
        imageView10.setScaleType(ImageView.ScaleType.CENTER);
        this.tuneItem.setImageResource(R.drawable.msg_photo_settings);
        this.tuneItem.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.itemsLayout.addView(this.tuneItem, LayoutHelper.createLinear(48, 48));
        this.tuneItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$22(view2);
            }
        });
        this.tuneItem.setContentDescription(LocaleController.getString("AccDescrPhotoAdjust", R.string.AccDescrPhotoAdjust));
        ImageView imageView11 = new ImageView(this.parentActivity);
        this.compressItem = imageView11;
        imageView11.setTag(1);
        this.compressItem.setScaleType(ImageView.ScaleType.CENTER);
        this.compressItem.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        int selectCompression = selectCompression();
        this.selectedCompression = selectCompression;
        if (selectCompression <= 1) {
            this.compressItem.setImageResource(R.drawable.video_quality1);
        } else if (selectCompression == 2) {
            this.compressItem.setImageResource(R.drawable.video_quality2);
        } else {
            this.selectedCompression = this.compressionsCount - 1;
            this.compressItem.setImageResource(R.drawable.video_quality3);
        }
        this.compressItem.setContentDescription(LocaleController.getString("AccDescrVideoQuality", R.string.AccDescrVideoQuality));
        this.itemsLayout.addView(this.compressItem, LayoutHelper.createLinear(48, 48));
        this.compressItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$23(activity, view2);
            }
        });
        ImageView imageView12 = new ImageView(this.parentActivity);
        this.timeItem = imageView12;
        imageView12.setScaleType(ImageView.ScaleType.CENTER);
        this.timeItem.setImageResource(R.drawable.msg_autodelete);
        this.timeItem.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.timeItem.setContentDescription(LocaleController.getString("SetTimer", R.string.SetTimer));
        this.itemsLayout.addView(this.timeItem, LayoutHelper.createLinear(48, 48));
        this.timeItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$29(resourcesProvider, view2);
            }
        });
        PickerBottomLayoutViewer pickerBottomLayoutViewer2 = new PickerBottomLayoutViewer(this.activityContext);
        this.editorDoneLayout = pickerBottomLayoutViewer2;
        pickerBottomLayoutViewer2.setBackgroundColor(-872415232);
        this.editorDoneLayout.updateSelectedCount(0, false);
        this.editorDoneLayout.setVisibility(8);
        this.containerView.addView(this.editorDoneLayout, LayoutHelper.createFrame(-1, 48, 83));
        this.editorDoneLayout.cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$31(view2);
            }
        });
        this.editorDoneLayout.doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$32(view2);
            }
        });
        TextView textView5 = new TextView(this.activityContext);
        this.resetButton = textView5;
        textView5.setClickable(false);
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
                PhotoViewer.this.lambda$setParentActivity$34(view2);
            }
        });
        GestureDetector2 gestureDetector2 = new GestureDetector2(this.containerView.getContext(), this);
        this.gestureDetector = gestureDetector2;
        gestureDetector2.setIsLongpressEnabled(false);
        setDoubleTapEnabled(true);
        ImageReceiver.ImageReceiverDelegate photoViewer$$ExternalSyntheticLambda71 = new ImageReceiver.ImageReceiverDelegate() {
            @Override
            public final void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
                PhotoViewer.this.lambda$setParentActivity$35(imageReceiver, z, z2, z3);
            }

            @Override
            public void onAnimationReady(ImageReceiver imageReceiver) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
            }
        };
        this.centerImage.setParentView(this.containerView);
        this.centerImage.setCrossfadeAlpha((byte) 2);
        this.centerImage.setInvalidateAll(true);
        this.centerImage.setDelegate(photoViewer$$ExternalSyntheticLambda71);
        this.leftImage.setParentView(this.containerView);
        this.leftImage.setCrossfadeAlpha((byte) 2);
        this.leftImage.setInvalidateAll(true);
        this.leftImage.setDelegate(photoViewer$$ExternalSyntheticLambda71);
        this.rightImage.setParentView(this.containerView);
        this.rightImage.setCrossfadeAlpha((byte) 2);
        this.rightImage.setInvalidateAll(true);
        this.rightImage.setDelegate(photoViewer$$ExternalSyntheticLambda71);
        int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        CheckBox checkBox = new CheckBox(this.containerView.getContext(), R.drawable.selectphoto_large) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return PhotoViewer.this.bottomTouchEnabled && super.onTouchEvent(motionEvent);
            }
        };
        this.checkImageView = checkBox;
        checkBox.setDrawBackground(true);
        this.checkImageView.setHasBorder(true);
        this.checkImageView.setSize(34);
        this.checkImageView.setCheckOffset(AndroidUtilities.dp(1.0f));
        this.checkImageView.setColor(getThemedColor("dialogFloatingButton"), -1);
        this.checkImageView.setVisibility(8);
        this.containerView.addView(this.checkImageView, LayoutHelper.createFrame(34, 34.0f, 53, 0.0f, (rotation == 3 || rotation == 1) ? 61.0f : 71.0f, 11.0f, 0.0f));
        if (isStatusBarVisible()) {
            ((FrameLayout.LayoutParams) this.checkImageView.getLayoutParams()).topMargin += AndroidUtilities.statusBarHeight;
        }
        this.checkImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.this.lambda$setParentActivity$36(view2);
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
                PhotoViewer.this.lambda$setParentActivity$37(view2);
            }
        });
        SelectedPhotosListView selectedPhotosListView = new SelectedPhotosListView(this.parentActivity);
        this.selectedPhotosListView = selectedPhotosListView;
        selectedPhotosListView.setVisibility(8);
        this.selectedPhotosListView.setAlpha(0.0f);
        this.selectedPhotosListView.setLayoutManager(new LinearLayoutManager(this, this.parentActivity, 0, true) {
            @Override
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i6) {
                LinearSmoothScrollerEnd linearSmoothScrollerEnd = new LinearSmoothScrollerEnd(this, recyclerView.getContext()) {
                    @Override
                    protected int calculateTimeForDeceleration(int i7) {
                        return Math.max(180, super.calculateTimeForDeceleration(i7));
                    }
                };
                linearSmoothScrollerEnd.setTargetPosition(i6);
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
            public final void onItemClick(View view2, int i6) {
                PhotoViewer.this.lambda$setParentActivity$38(view2, i6);
            }
        });
        PhotoViewerCaptionEnterView photoViewerCaptionEnterView2 = new PhotoViewerCaptionEnterView(this.activityContext, this.containerView, this.windowView, resourcesProvider) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                try {
                    if (!PhotoViewer.this.bottomTouchEnabled) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    return false;
                } catch (Exception e) {
                    FileLog.e(e);
                    return false;
                }
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                try {
                    if (!PhotoViewer.this.bottomTouchEnabled) {
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                    return false;
                } catch (Exception e) {
                    FileLog.e(e);
                    return false;
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (PhotoViewer.this.bottomTouchEnabled && motionEvent.getAction() == 0) {
                    PhotoViewer.this.keyboardAnimationEnabled = true;
                }
                return !PhotoViewer.this.bottomTouchEnabled && super.onTouchEvent(motionEvent);
            }

            @Override
            protected void extendActionMode(ActionMode actionMode, Menu menu) {
                if (PhotoViewer.this.parentChatActivity != null) {
                    PhotoViewer.this.parentChatActivity.extendActionMode(menu);
                }
            }
        };
        this.captionEditText = photoViewerCaptionEnterView2;
        photoViewerCaptionEnterView2.setDelegate(new PhotoViewerCaptionEnterView.PhotoViewerCaptionEnterViewDelegate() {
            @Override
            public void onCaptionEnter() {
                PhotoViewer.this.closeCaptionEnter(true);
            }

            @Override
            public void onTextChanged(CharSequence charSequence) {
                if (!(PhotoViewer.this.mentionsAdapter == null || PhotoViewer.this.captionEditText == null || PhotoViewer.this.parentChatActivity == null || charSequence == null)) {
                    PhotoViewer.this.mentionsAdapter.searchUsernameOrHashtag(charSequence.toString(), PhotoViewer.this.captionEditText.getCursorPosition(), PhotoViewer.this.parentChatActivity.messages, false, false);
                }
                int themedColor2 = PhotoViewer.this.getThemedColor("dialogFloatingIcon");
                if (PhotoViewer.this.captionEditText.getCaptionLimitOffset() < 0) {
                    PhotoViewer.this.captionLimitView.setText(Integer.toString(PhotoViewer.this.captionEditText.getCaptionLimitOffset()));
                    PhotoViewer.this.captionLimitView.setVisibility(PhotoViewer.this.pickerViewSendButton.getVisibility());
                    PhotoViewer.this.pickerViewSendButton.setColorFilter(new PorterDuffColorFilter(ColorUtils.setAlphaComponent(themedColor2, (int) (Color.alpha(themedColor2) * 0.58f)), PorterDuff.Mode.MULTIPLY));
                } else {
                    PhotoViewer.this.pickerViewSendButton.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                    PhotoViewer.this.captionLimitView.setVisibility(8);
                }
                if (PhotoViewer.this.placeProvider != null) {
                    PhotoViewer.this.placeProvider.onCaptionChanged(charSequence);
                }
            }

            @Override
            public void onWindowSizeChanged(int i6) {
                if (i6 - (ActionBar.getCurrentActionBarHeight() * 2) < AndroidUtilities.dp((Math.min(3, PhotoViewer.this.mentionsAdapter.getItemCount()) * 36) + (PhotoViewer.this.mentionsAdapter.getItemCount() > 3 ? 18 : 0))) {
                    PhotoViewer.this.allowMentions = false;
                    if (PhotoViewer.this.mentionListView != null && PhotoViewer.this.mentionListView.getVisibility() == 0) {
                        PhotoViewer.this.mentionListView.setVisibility(4);
                        return;
                    }
                    return;
                }
                PhotoViewer.this.allowMentions = true;
                if (PhotoViewer.this.mentionListView != null && PhotoViewer.this.mentionListView.getVisibility() == 4) {
                    PhotoViewer.this.mentionListView.setVisibility(0);
                }
            }

            @Override
            public void onEmojiViewOpen() {
                PhotoViewer.this.navigationBar.setVisibility(4);
                PhotoViewer photoViewer = PhotoViewer.this;
                photoViewer.animateNavBarColorTo(photoViewer.getThemedColor("chat_emojiPanelBackground"), false);
            }

            @Override
            public void onEmojiViewCloseStart() {
                String str;
                int i6;
                PhotoViewer.this.navigationBar.setVisibility(PhotoViewer.this.currentEditMode != 2 ? 0 : 4);
                PhotoViewer.this.animateNavBarColorTo(-16777216);
                setOffset(PhotoViewer.this.captionEditText.getEmojiPadding());
                if (PhotoViewer.this.captionEditText.getTag() != null) {
                    if (PhotoViewer.this.isCurrentVideo) {
                        ActionBar actionBar2 = PhotoViewer.this.actionBar;
                        if (PhotoViewer.this.muteVideo) {
                            i6 = R.string.GifCaption;
                            str = "GifCaption";
                        } else {
                            i6 = R.string.VideoCaption;
                            str = "VideoCaption";
                        }
                        actionBar2.setTitleAnimated(LocaleController.getString(str, i6), true, 220L);
                    } else {
                        PhotoViewer.this.actionBar.setTitleAnimated(LocaleController.getString("PhotoCaption", R.string.PhotoCaption), true, 220L);
                    }
                    PhotoViewer.this.checkImageView.animate().alpha(0.0f).setDuration(220L).start();
                    PhotoViewer.this.photosCounterView.animate().alpha(0.0f).setDuration(220L).start();
                    PhotoViewer.this.selectedPhotosListView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(220L).start();
                    return;
                }
                PhotoViewer.this.checkImageView.animate().alpha(1.0f).setDuration(220L).start();
                PhotoViewer.this.photosCounterView.animate().alpha(1.0f).setDuration(220L).start();
                if (PhotoViewer.this.lastTitle != null) {
                    PhotoViewer.this.actionBar.setTitleAnimated(PhotoViewer.this.lastTitle, false, 220L);
                    PhotoViewer.this.lastTitle = null;
                }
            }

            @Override
            public void onEmojiViewCloseEnd() {
                setOffset(0);
                PhotoViewer.this.captionEditText.setVisibility(8);
            }

            private void setOffset(int i6) {
                for (int i7 = 0; i7 < PhotoViewer.this.containerView.getChildCount(); i7++) {
                    View childAt = PhotoViewer.this.containerView.getChildAt(i7);
                    if (childAt == PhotoViewer.this.cameraItem || childAt == PhotoViewer.this.muteItem || childAt == PhotoViewer.this.pickerView || childAt == PhotoViewer.this.videoTimelineView || childAt == PhotoViewer.this.pickerViewSendButton || childAt == PhotoViewer.this.captionTextViewSwitcher || (PhotoViewer.this.muteItem.getVisibility() == 0 && childAt == PhotoViewer.this.bottomLayout)) {
                        childAt.setTranslationY(i6);
                    }
                }
            }
        });
        if (i5 >= 19) {
            this.captionEditText.setImportantForAccessibility(4);
        }
        this.captionEditText.setVisibility(8);
        this.containerView.addView(this.captionEditText, LayoutHelper.createFrame(-1, -2, 83));
        RecyclerListView recyclerListView = new RecyclerListView(this.activityContext, resourcesProvider) {
            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return !PhotoViewer.this.bottomTouchEnabled && super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return !PhotoViewer.this.bottomTouchEnabled && super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return !PhotoViewer.this.bottomTouchEnabled && super.onTouchEvent(motionEvent);
            }
        };
        this.mentionListView = recyclerListView;
        recyclerListView.setTag(5);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, this.activityContext) {
            @Override
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        };
        this.mentionLayoutManager = linearLayoutManager;
        linearLayoutManager.setOrientation(1);
        this.mentionListView.setLayoutManager(this.mentionLayoutManager);
        this.mentionListView.setBackgroundColor(2130706432);
        this.mentionListView.setVisibility(8);
        this.mentionListView.setClipToPadding(true);
        this.mentionListView.setOverScrollMode(2);
        this.containerView.addView(this.mentionListView, LayoutHelper.createFrame(-1, 110, 83));
        RecyclerListView recyclerListView2 = this.mentionListView;
        MentionsAdapter mentionsAdapter = new MentionsAdapter(this.activityContext, true, 0L, 0, new MentionsAdapter.MentionsAdapterDelegate() {
            @Override
            public void onContextClick(TLRPC$BotInlineResult tLRPC$BotInlineResult) {
            }

            @Override
            public void onContextSearch(boolean z) {
            }

            @Override
            public void onItemCountUpdate(int i6, int i7) {
            }

            @Override
            public void needChangePanelVisibility(boolean z) {
                if (z) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) PhotoViewer.this.mentionListView.getLayoutParams();
                    float min = (Math.min(3, PhotoViewer.this.mentionsAdapter.getItemCount()) * 36) + (PhotoViewer.this.mentionsAdapter.getItemCount() > 3 ? 18 : 0);
                    layoutParams2.height = AndroidUtilities.dp(min);
                    layoutParams2.topMargin = -AndroidUtilities.dp(min);
                    PhotoViewer.this.mentionListView.setLayoutParams(layoutParams2);
                    if (PhotoViewer.this.mentionListAnimation != null) {
                        PhotoViewer.this.mentionListAnimation.cancel();
                        PhotoViewer.this.mentionListAnimation = null;
                    }
                    if (PhotoViewer.this.mentionListView.getVisibility() == 0) {
                        PhotoViewer.this.mentionListView.setAlpha(1.0f);
                        return;
                    }
                    PhotoViewer.this.mentionLayoutManager.scrollToPositionWithOffset(0, 10000);
                    if (PhotoViewer.this.allowMentions) {
                        PhotoViewer.this.mentionListView.setVisibility(0);
                        PhotoViewer.this.mentionListAnimation = new AnimatorSet();
                        PhotoViewer.this.mentionListAnimation.playTogether(ObjectAnimator.ofFloat(PhotoViewer.this.mentionListView, View.ALPHA, 0.0f, 1.0f));
                        PhotoViewer.this.mentionListAnimation.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (PhotoViewer.this.mentionListAnimation != null && PhotoViewer.this.mentionListAnimation.equals(animator)) {
                                    PhotoViewer.this.mentionListAnimation = null;
                                }
                            }
                        });
                        PhotoViewer.this.mentionListAnimation.setDuration(200L);
                        PhotoViewer.this.mentionListAnimation.start();
                        return;
                    }
                    PhotoViewer.this.mentionListView.setAlpha(1.0f);
                    PhotoViewer.this.mentionListView.setVisibility(4);
                    return;
                }
                if (PhotoViewer.this.mentionListAnimation != null) {
                    PhotoViewer.this.mentionListAnimation.cancel();
                    PhotoViewer.this.mentionListAnimation = null;
                }
                if (PhotoViewer.this.mentionListView.getVisibility() != 8) {
                    if (PhotoViewer.this.allowMentions) {
                        PhotoViewer.this.mentionListAnimation = new AnimatorSet();
                        PhotoViewer.this.mentionListAnimation.playTogether(ObjectAnimator.ofFloat(PhotoViewer.this.mentionListView, View.ALPHA, 0.0f));
                        PhotoViewer.this.mentionListAnimation.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (PhotoViewer.this.mentionListAnimation != null && PhotoViewer.this.mentionListAnimation.equals(animator)) {
                                    PhotoViewer.this.mentionListView.setVisibility(8);
                                    PhotoViewer.this.mentionListAnimation = null;
                                }
                            }
                        });
                        PhotoViewer.this.mentionListAnimation.setDuration(200L);
                        PhotoViewer.this.mentionListAnimation.start();
                        return;
                    }
                    PhotoViewer.this.mentionListView.setVisibility(8);
                }
            }
        }, resourcesProvider);
        this.mentionsAdapter = mentionsAdapter;
        recyclerListView2.setAdapter(mentionsAdapter);
        this.mentionListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view2, int i6) {
                PhotoViewer.this.lambda$setParentActivity$39(view2, i6);
            }
        });
        this.mentionListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view2, int i6) {
                boolean lambda$setParentActivity$41;
                lambda$setParentActivity$41 = PhotoViewer.this.lambda$setParentActivity$41(resourcesProvider, view2, i6);
                return lambda$setParentActivity$41;
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
    }

    public class AnonymousClass10 extends FrameLayout {
        AnonymousClass10(Context context) {
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
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.AnonymousClass10.dispatchTouchEvent(android.view.MotionEvent):boolean");
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
            int stableInsetBottom;
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            if (Build.VERSION.SDK_INT < 21 || PhotoViewer.this.lastInsets == null) {
                int i4 = AndroidUtilities.displaySize.y;
                if (size2 > i4) {
                    size2 = i4;
                }
            } else {
                WindowInsets windowInsets = (WindowInsets) PhotoViewer.this.lastInsets;
                if (!PhotoViewer.this.inBubbleMode) {
                    if (AndroidUtilities.incorrectDisplaySizeFix) {
                        int i5 = AndroidUtilities.displaySize.y;
                        if (size2 > i5) {
                            size2 = i5;
                        }
                        size2 += AndroidUtilities.statusBarHeight;
                    } else if (windowInsets.getStableInsetBottom() >= 0 && (i3 = AndroidUtilities.statusBarHeight) >= 0 && (stableInsetBottom = (size2 - i3) - windowInsets.getStableInsetBottom()) > 0 && stableInsetBottom < 4096) {
                        AndroidUtilities.displaySize.y = stableInsetBottom;
                    }
                }
                int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
                if (PhotoViewer.this.captionEditText.isPopupShowing()) {
                    systemWindowInsetBottom -= PhotoViewer.this.containerView.getKeyboardHeight();
                }
                size2 -= systemWindowInsetBottom;
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
                    PhotoViewer.this.scale = 1.0f;
                    PhotoViewer.this.translationX = 0.0f;
                    PhotoViewer.this.translationY = 0.0f;
                    PhotoViewer photoViewer = PhotoViewer.this;
                    photoViewer.updateMinMax(photoViewer.scale);
                }
                if (PhotoViewer.this.checkImageView != null) {
                    PhotoViewer.this.checkImageView.post(new Runnable() {
                        @Override
                        public final void run() {
                            PhotoViewer.AnonymousClass10.this.lambda$onLayout$0();
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
            int i = 0;
            int currentActionBarHeight = ((ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(34.0f)) / 2) + (PhotoViewer.this.isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0);
            if (currentActionBarHeight != layoutParams.topMargin) {
                layoutParams.topMargin = currentActionBarHeight;
                PhotoViewer.this.checkImageView.setLayoutParams(layoutParams);
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) PhotoViewer.this.photosCounterView.getLayoutParams();
            int currentActionBarHeight2 = (ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(40.0f)) / 2;
            if (PhotoViewer.this.isStatusBarVisible()) {
                i = AndroidUtilities.statusBarHeight;
            }
            int i2 = currentActionBarHeight2 + i;
            if (layoutParams2.topMargin != i2) {
                layoutParams2.topMargin = i2;
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
            if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                return super.dispatchKeyEventPreIme(keyEvent);
            }
            if (PhotoViewer.this.captionEditText.isPopupShowing() || PhotoViewer.this.captionEditText.isKeyboardVisible()) {
                PhotoViewer.this.closeCaptionEnter(true);
                return false;
            }
            PhotoViewer.getInstance().closePhoto(true, false);
            return true;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (Build.VERSION.SDK_INT >= 21 && PhotoViewer.this.isVisible && PhotoViewer.this.lastInsets != null) {
                PhotoViewer.this.blackPaint.setAlpha(PhotoViewer.this.backgroundDrawable.getAlpha());
                canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() + ((WindowInsets) PhotoViewer.this.lastInsets).getSystemWindowInsetBottom(), PhotoViewer.this.blackPaint);
            }
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (PhotoViewer.this.parentChatActivity != null) {
                UndoView undoView = PhotoViewer.this.parentChatActivity.getUndoView();
                if (undoView.getVisibility() == 0) {
                    canvas.save();
                    View view = (View) undoView.getParent();
                    canvas.clipRect(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                    canvas.translate(undoView.getX(), undoView.getY());
                    undoView.draw(canvas);
                    canvas.restore();
                    invalidate();
                }
            }
        }
    }

    public WindowInsets lambda$setParentActivity$4(View view, WindowInsets windowInsets) {
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        Activity activity = this.parentActivity;
        if ((activity instanceof LaunchActivity) && ((systemWindowInsetTop != 0 || AndroidUtilities.isInMultiwindow) && !this.inBubbleMode && AndroidUtilities.statusBarHeight != systemWindowInsetTop)) {
            AndroidUtilities.statusBarHeight = systemWindowInsetTop;
            ((LaunchActivity) activity).drawerLayoutContainer.requestLayout();
        }
        WindowInsets windowInsets2 = (WindowInsets) this.lastInsets;
        this.lastInsets = windowInsets;
        if (windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) {
            int i = this.animationInProgress;
            if (i == 1 || i == 3) {
                ClippingImageView clippingImageView = this.animatingImageView;
                clippingImageView.setTranslationX(clippingImageView.getTranslationX() - getLeftInset());
                this.animationValues[0][2] = this.animatingImageView.getTranslationX();
            }
            FrameLayout frameLayout = this.windowView;
            if (frameLayout != null) {
                frameLayout.requestLayout();
            }
        }
        if (this.navigationBar != null) {
            this.navigationBarHeight = windowInsets.getSystemWindowInsetBottom();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.navigationBar.getLayoutParams();
            int i2 = this.navigationBarHeight;
            marginLayoutParams.height = i2;
            marginLayoutParams.bottomMargin = (-i2) / 2;
            this.navigationBar.setLayoutParams(marginLayoutParams);
        }
        this.containerView.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), 0);
        if (this.actionBar != null) {
            AndroidUtilities.cancelRunOnUIThread(this.updateContainerFlagsRunnable);
            if (this.isVisible && this.animationInProgress == 0) {
                AndroidUtilities.runOnUIThread(this.updateContainerFlagsRunnable, 200L);
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public class AnonymousClass12 extends ActionBar.ActionBarMenuOnItemClick {
        final Theme.ResourcesProvider val$resourcesProvider;

        AnonymousClass12(Theme.ResourcesProvider resourcesProvider) {
            this.val$resourcesProvider = resourcesProvider;
        }

        public void lambda$onItemClick$0(boolean z) {
            BulletinFactory.createSaveToGalleryBulletin(PhotoViewer.this.containerView, z, -115203550, -1).show();
        }

        public class AnonymousClass1 extends ShareAlert {
            final boolean val$finalOpenKeyboardOnShareAlertClose;
            final ArrayList val$msgs;
            final FrameLayout val$photoContainerView;

            AnonymousClass1(Context context, ChatActivity chatActivity, ArrayList arrayList, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3, Theme.ResourcesProvider resourcesProvider, FrameLayout frameLayout, boolean z4, ArrayList arrayList2) {
                super(context, chatActivity, arrayList, str, str2, z, str3, str4, z2, z3, resourcesProvider);
                this.val$photoContainerView = frameLayout;
                this.val$finalOpenKeyboardOnShareAlertClose = z4;
                this.val$msgs = arrayList2;
            }

            @Override
            protected void onSend(final LongSparseArray<TLRPC$Dialog> longSparseArray, final int i) {
                final FrameLayout frameLayout = this.val$photoContainerView;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PhotoViewer.AnonymousClass12.AnonymousClass1.this.lambda$onSend$0(frameLayout, longSparseArray, i);
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
                            PhotoViewer.AnonymousClass12.AnonymousClass1.this.lambda$dismissInternal$1();
                        }
                    }, 50L);
                }
                PhotoViewer.this.requestAdjust();
            }

            public void lambda$dismissInternal$1() {
                if (PhotoViewer.this.parentChatActivity != null && PhotoViewer.this.parentChatActivity.getChatActivityEnterView() != null) {
                    PhotoViewer.this.parentChatActivity.getChatActivityEnterView().openKeyboard();
                }
            }

            @Override
            protected void sendInternal(final boolean z) {
                String str;
                int i;
                String str2;
                int i2;
                String str3;
                int i3;
                boolean z2 = true;
                if (this.val$msgs.size() <= 1) {
                    super.sendInternal(z);
                    return;
                }
                boolean z3 = this.selectedDialogs.size() == 1 && this.selectedDialogs.keyAt(0) == UserConfig.getInstance(this.currentAccount).getClientUserId();
                for (int i4 = 0; i4 < this.val$msgs.size(); i4++) {
                    if (!((MessageObject) this.val$msgs.get(i4)).isPhoto() || ((MessageObject) this.val$msgs.get(i4)).isVideo()) {
                        z2 = false;
                        break;
                    }
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(PhotoViewer.this.parentActivity, AnonymousClass12.this.val$resourcesProvider);
                if (z3) {
                    i = R.string.ForwardGroupMedia;
                    str = "ForwardGroupMedia";
                } else {
                    i = R.string.SaveGroupMedia;
                    str = "SaveGroupMedia";
                }
                AlertDialog.Builder title = builder.setTitle(LocaleController.getString(str, i));
                if (z3) {
                    i2 = R.string.SaveGroupMediaMessage;
                    str2 = "SaveGroupMediaMessage";
                } else {
                    i2 = R.string.ForwardGroupMediaMessage;
                    str2 = "ForwardGroupMediaMessage";
                }
                AlertDialog.Builder dialogButtonColorKey = title.setMessage(LocaleController.getString(str2, i2)).setDialogButtonColorKey("voipgroup_listeningText");
                if (z2) {
                    i3 = R.string.ThisPhoto;
                    str3 = "ThisPhoto";
                } else {
                    i3 = R.string.ThisMedia;
                    str3 = "ThisMedia";
                }
                AlertDialog create = dialogButtonColorKey.setNegativeButton(LocaleController.getString(str3, i3), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        PhotoViewer.AnonymousClass12.AnonymousClass1.this.lambda$sendInternal$2(z, dialogInterface, i5);
                    }
                }).setPositiveButton(z2 ? LocaleController.formatPluralString("AllNPhotos", this.val$msgs.size(), new Object[0]) : LocaleController.formatPluralString("AllNMedia", this.val$msgs.size(), new Object[0]), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        PhotoViewer.AnonymousClass12.AnonymousClass1.this.lambda$sendInternal$3(z, dialogInterface, i5);
                    }
                }).setNeutralButton(LocaleController.getString("Cancel", R.string.Cancel), PhotoViewer$12$1$$ExternalSyntheticLambda2.INSTANCE).create();
                create.setBackgroundColor(getThemedColor("voipgroup_dialogBackground"));
                create.show();
                View button = create.getButton(-3);
                if (button instanceof TextView) {
                    ((TextView) button).setTextColor(getThemedColor("dialogTextRed"));
                    button.setBackground(Theme.getRoundRectSelectorDrawable(getThemedColor("dialogTextRed")));
                }
                create.setTextColor(getThemedColor("voipgroup_actionBarItems"));
            }

            public void lambda$sendInternal$2(boolean z, DialogInterface dialogInterface, int i) {
                ArrayList<MessageObject> arrayList = new ArrayList<>(1);
                this.sendingMessageObjects = arrayList;
                arrayList.add(PhotoViewer.this.currentMessageObject);
                super.sendInternal(z);
            }

            public void lambda$sendInternal$3(boolean z, DialogInterface dialogInterface, int i) {
                super.sendInternal(z);
            }
        }

        public void lambda$onItemClick$1(ShareAlert shareAlert) {
            if (shareAlert != null && shareAlert.getWindow() != null) {
                shareAlert.setFocusable(true);
                if (PhotoViewer.this.parentChatActivity != null && PhotoViewer.this.parentChatActivity.getChatActivityEnterView() != null) {
                    PhotoViewer.this.parentChatActivity.getChatActivityEnterView().hidePopup(false);
                }
            }
        }

        public void lambda$onItemClick$2(ArrayList arrayList, ChatActivity chatActivity, DialogsActivity dialogsActivity, ArrayList arrayList2, CharSequence charSequence, boolean z) {
            if (arrayList2.size() > 1 || ((Long) arrayList2.get(0)).longValue() == UserConfig.getInstance(PhotoViewer.this.currentAccount).getClientUserId() || charSequence != null) {
                for (int i = 0; i < arrayList2.size(); i++) {
                    long longValue = ((Long) arrayList2.get(i)).longValue();
                    if (charSequence != null) {
                        SendMessagesHelper.getInstance(PhotoViewer.this.currentAccount).sendMessage(charSequence.toString(), longValue, null, null, null, true, null, null, null, true, 0, null);
                    }
                    SendMessagesHelper.getInstance(PhotoViewer.this.currentAccount).sendMessage((ArrayList<MessageObject>) arrayList, longValue, false, false, true, 0);
                }
                dialogsActivity.finishFragment();
                if (chatActivity == null) {
                    return;
                }
                if (arrayList2.size() == 1) {
                    chatActivity.getUndoView().showWithAction(((Long) arrayList2.get(0)).longValue(), 53, Integer.valueOf(arrayList.size()));
                } else {
                    chatActivity.getUndoView().showWithAction(0L, 53, Integer.valueOf(arrayList.size()), Integer.valueOf(arrayList2.size()), (Runnable) null, (Runnable) null);
                }
            } else {
                long longValue2 = ((Long) arrayList2.get(0)).longValue();
                Bundle bundle = new Bundle();
                bundle.putBoolean("scrollToTopOnResume", true);
                if (DialogObject.isEncryptedDialog(longValue2)) {
                    bundle.putInt("enc_id", DialogObject.getEncryptedChatId(longValue2));
                } else if (DialogObject.isUserDialog(longValue2)) {
                    bundle.putLong("user_id", longValue2);
                } else {
                    bundle.putLong("chat_id", -longValue2);
                }
                NotificationCenter.getInstance(PhotoViewer.this.currentAccount).postNotificationName(NotificationCenter.closeChats, new Object[0]);
                ChatActivity chatActivity2 = new ChatActivity(bundle);
                if (((LaunchActivity) PhotoViewer.this.parentActivity).presentFragment(chatActivity2, true, false)) {
                    chatActivity2.showFieldPanelForForward(true, arrayList);
                } else {
                    dialogsActivity.finishFragment();
                }
            }
        }

        public static void lambda$onItemClick$3(boolean[] zArr, View view) {
            zArr[0] = !zArr[0];
            ((CheckBoxCell) view).setChecked(zArr[0], true);
        }

        public void lambda$onItemClick$4(boolean[] zArr, DialogInterface dialogInterface, int i) {
            TLRPC$EncryptedChat tLRPC$EncryptedChat;
            ArrayList arrayList;
            if (!PhotoViewer.this.imagesArr.isEmpty()) {
                if (PhotoViewer.this.currentIndex >= 0 && PhotoViewer.this.currentIndex < PhotoViewer.this.imagesArr.size()) {
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
                            tLRPC$EncryptedChat = MessagesController.getInstance(PhotoViewer.this.currentAccount).getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(messageObject.getDialogId())));
                            arrayList = arrayList3;
                        }
                        MessagesController.getInstance(PhotoViewer.this.currentAccount).deleteMessages(arrayList2, arrayList, tLRPC$EncryptedChat, messageObject.getDialogId(), zArr[0], messageObject.scheduled);
                    }
                }
            } else if (!PhotoViewer.this.avatarsArr.isEmpty()) {
                if (PhotoViewer.this.currentIndex >= 0 && PhotoViewer.this.currentIndex < PhotoViewer.this.avatarsArr.size()) {
                    TLRPC$Message tLRPC$Message = (TLRPC$Message) PhotoViewer.this.imagesArrMessages.get(PhotoViewer.this.currentIndex);
                    if (tLRPC$Message != null) {
                        ArrayList<Integer> arrayList4 = new ArrayList<>();
                        arrayList4.add(Integer.valueOf(tLRPC$Message.id));
                        MessagesController.getInstance(PhotoViewer.this.currentAccount).deleteMessages(arrayList4, null, null, MessageObject.getDialogId(tLRPC$Message), true, false);
                        NotificationCenter.getInstance(PhotoViewer.this.currentAccount).postNotificationName(NotificationCenter.reloadDialogPhotos, new Object[0]);
                    }
                    if (PhotoViewer.this.isCurrentAvatarSet()) {
                        if (PhotoViewer.this.avatarsDialogId > 0) {
                            MessagesController.getInstance(PhotoViewer.this.currentAccount).deleteUserPhoto(null);
                        } else {
                            MessagesController.getInstance(PhotoViewer.this.currentAccount).changeChatAvatar(-PhotoViewer.this.avatarsDialogId, null, null, null, 0.0d, null, null, null, null);
                        }
                        PhotoViewer.this.closePhoto(false, false);
                        return;
                    }
                    TLRPC$Photo tLRPC$Photo = (TLRPC$Photo) PhotoViewer.this.avatarsArr.get(PhotoViewer.this.currentIndex);
                    if (tLRPC$Photo != null) {
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
                        if (PhotoViewer.this.imagesArrLocations.isEmpty()) {
                            PhotoViewer.this.closePhoto(false, false);
                        } else {
                            int i2 = PhotoViewer.this.currentIndex;
                            if (i2 >= PhotoViewer.this.avatarsArr.size()) {
                                i2 = PhotoViewer.this.avatarsArr.size() - 1;
                            }
                            PhotoViewer.this.currentIndex = -1;
                            PhotoViewer.this.setImageIndex(i2);
                        }
                        if (tLRPC$Message == null) {
                            NotificationCenter.getInstance(PhotoViewer.this.currentAccount).postNotificationName(NotificationCenter.reloadDialogPhotos, new Object[0]);
                        }
                    }
                }
            } else if (!PhotoViewer.this.secureDocuments.isEmpty() && PhotoViewer.this.placeProvider != null) {
                PhotoViewer.this.secureDocuments.remove(PhotoViewer.this.currentIndex);
                PhotoViewer.this.placeProvider.deleteImageAtIndex(PhotoViewer.this.currentIndex);
                if (PhotoViewer.this.secureDocuments.isEmpty()) {
                    PhotoViewer.this.closePhoto(false, false);
                    return;
                }
                int i3 = PhotoViewer.this.currentIndex;
                if (i3 >= PhotoViewer.this.secureDocuments.size()) {
                    i3 = PhotoViewer.this.secureDocuments.size() - 1;
                }
                PhotoViewer.this.currentIndex = -1;
                PhotoViewer.this.setImageIndex(i3);
            }
        }

        @Override
        public void onItemClick(int r23) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.AnonymousClass12.onItemClick(int):void");
        }

        public void lambda$onItemClick$6(final UserConfig userConfig, final TLRPC$Photo tLRPC$Photo, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.AnonymousClass12.this.lambda$onItemClick$5(tLObject, userConfig, tLRPC$Photo);
                }
            });
        }

        public void lambda$onItemClick$5(TLObject tLObject, UserConfig userConfig, TLRPC$Photo tLRPC$Photo) {
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

        public void lambda$onItemClick$7() {
            if (PhotoViewer.this.menuItem != null) {
                PhotoViewer.this.menuItem.hideSubItem(16);
            }
        }

        @Override
        public boolean canOpenMenu() {
            boolean z = true;
            if (PhotoViewer.this.currentMessageObject != null || PhotoViewer.this.currentSecureDocument != null) {
                return true;
            }
            if (PhotoViewer.this.currentFileLocationVideo == null) {
                return PhotoViewer.this.pageBlocksAdapter != null;
            }
            FileLoader fileLoader = FileLoader.getInstance(PhotoViewer.this.currentAccount);
            TLRPC$FileLocation fileLocation = PhotoViewer.getFileLocation(PhotoViewer.this.currentFileLocationVideo);
            String fileLocationExt = PhotoViewer.getFileLocationExt(PhotoViewer.this.currentFileLocationVideo);
            if (PhotoViewer.this.avatarsDialogId == 0 && !PhotoViewer.this.isEvent) {
                z = false;
            }
            return fileLoader.getPathToAttach(fileLocation, fileLocationExt, z).exists();
        }
    }

    public void lambda$setParentActivity$5(View view) {
        Activity activity = this.parentActivity;
        if (activity != null) {
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
    }

    public void lambda$setParentActivity$7(View view) {
        openCurrentPhotoInPaintModeForSelect();
    }

    public void lambda$setParentActivity$8(View view) {
        onSharePressed();
    }

    public void lambda$setParentActivity$9(View view) {
        this.selectedCompression = this.previousCompression;
        didChangedCompressionLevel(false);
        showQualityView(false);
        requestVideoPreview(2);
    }

    public void lambda$setParentActivity$10(View view) {
        showQualityView(false);
        requestVideoPreview(2);
    }

    public class AnonymousClass24 implements VideoTimelinePlayView.VideoTimelineViewDelegate {
        private int seekTo;
        private Runnable seekToRunnable;
        private boolean wasPlaying;

        AnonymousClass24() {
        }

        @Override
        public void onLeftProgressChanged(float f) {
            if (PhotoViewer.this.videoPlayer != null) {
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
        }

        @Override
        public void onRightProgressChanged(float f) {
            if (PhotoViewer.this.videoPlayer != null) {
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
        }

        @Override
        public void onPlayProgressChanged(float f) {
            if (PhotoViewer.this.videoPlayer != null) {
                if (PhotoViewer.this.sendPhotoType == 1) {
                    updateAvatarStartTime(0);
                }
                seekTo(f);
            }
        }

        private void seekTo(float f) {
            this.seekTo = (int) (PhotoViewer.this.videoDuration * f);
            if (SharedConfig.getDevicePerformanceClass() == 2) {
                if (PhotoViewer.this.videoPlayer != null) {
                    PhotoViewer.this.videoPlayer.seekTo(this.seekTo);
                }
                if (PhotoViewer.this.sendPhotoType == 1) {
                    PhotoViewer.this.needCaptureFrameReadyAtTime = this.seekTo;
                    if (PhotoViewer.this.captureFrameReadyAtTime != PhotoViewer.this.needCaptureFrameReadyAtTime) {
                        PhotoViewer.this.captureFrameReadyAtTime = -1L;
                    }
                }
                this.seekToRunnable = null;
            } else if (this.seekToRunnable == null) {
                Runnable photoViewer$24$$ExternalSyntheticLambda0 = new Runnable() {
                    @Override
                    public final void run() {
                        PhotoViewer.AnonymousClass24.this.lambda$seekTo$0();
                    }
                };
                this.seekToRunnable = photoViewer$24$$ExternalSyntheticLambda0;
                AndroidUtilities.runOnUIThread(photoViewer$24$$ExternalSyntheticLambda0, 100L);
            }
        }

        public void lambda$seekTo$0() {
            if (PhotoViewer.this.videoPlayer != null) {
                PhotoViewer.this.videoPlayer.seekTo(this.seekTo);
            }
            if (PhotoViewer.this.sendPhotoType == 1) {
                PhotoViewer.this.needCaptureFrameReadyAtTime = this.seekTo;
                if (PhotoViewer.this.captureFrameReadyAtTime != PhotoViewer.this.needCaptureFrameReadyAtTime) {
                    PhotoViewer.this.captureFrameReadyAtTime = -1L;
                }
            }
            this.seekToRunnable = null;
        }

        private void updateAvatarStartTime(int i) {
            if (PhotoViewer.this.sendPhotoType == 1) {
                if (i == 0) {
                    PhotoViewer photoViewer = PhotoViewer.this;
                    photoViewer.avatarStartProgress = photoViewer.videoTimelineView.getProgress();
                    PhotoViewer photoViewer2 = PhotoViewer.this;
                    photoViewer2.avatarStartTime = photoViewer2.videoDuration * 1000.0f * PhotoViewer.this.avatarStartProgress;
                } else if (PhotoViewer.this.photoCropView == null) {
                } else {
                    if (PhotoViewer.this.videoTimelineView.getLeftProgress() > PhotoViewer.this.avatarStartProgress || PhotoViewer.this.videoTimelineView.getRightProgress() < PhotoViewer.this.avatarStartProgress) {
                        PhotoViewer.this.photoCropView.setVideoThumbVisible(false);
                        if (i == 1) {
                            PhotoViewer photoViewer3 = PhotoViewer.this;
                            photoViewer3.avatarStartTime = photoViewer3.videoDuration * 1000.0f * PhotoViewer.this.videoTimelineView.getLeftProgress();
                        } else {
                            PhotoViewer photoViewer4 = PhotoViewer.this;
                            photoViewer4.avatarStartTime = photoViewer4.videoDuration * 1000.0f * PhotoViewer.this.videoTimelineView.getRightProgress();
                        }
                        PhotoViewer.this.captureFrameAtTime = -1L;
                    }
                }
            }
        }

        @Override
        public void didStartDragging(int i) {
            if (i == VideoTimelinePlayView.TYPE_PROGRESS) {
                PhotoViewer.this.cancelVideoPlayRunnable();
                boolean z = true;
                if (PhotoViewer.this.sendPhotoType == 1) {
                    PhotoViewer.this.cancelFlashAnimations();
                    PhotoViewer.this.captureFrameAtTime = -1L;
                }
                if (PhotoViewer.this.videoPlayer == null || !PhotoViewer.this.videoPlayer.isPlaying()) {
                    z = false;
                }
                this.wasPlaying = z;
                if (z) {
                    PhotoViewer.this.manuallyPaused = false;
                    PhotoViewer.this.videoPlayer.pause();
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
            if (PhotoViewer.this.sendPhotoType == 1 && PhotoViewer.this.flashView != null && i == VideoTimelinePlayView.TYPE_PROGRESS) {
                PhotoViewer.this.cancelFlashAnimations();
                PhotoViewer photoViewer = PhotoViewer.this;
                photoViewer.captureFrameAtTime = photoViewer.avatarStartTime;
                if (PhotoViewer.this.captureFrameReadyAtTime == this.seekTo) {
                    PhotoViewer.this.captureCurrentFrame();
                }
            } else if (PhotoViewer.this.sendPhotoType == 1 || this.wasPlaying) {
                PhotoViewer.this.manuallyPaused = false;
                if (PhotoViewer.this.videoPlayer != null) {
                    PhotoViewer.this.videoPlayer.play();
                }
            }
        }
    }

    public void lambda$setParentActivity$11(View view) {
        if (this.captionEditText.getCaptionLimitOffset() < 0) {
            AndroidUtilities.shakeView(this.captionLimitView, 2.0f, 0);
            Vibrator vibrator = (Vibrator) this.captionLimitView.getContext().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
                return;
            }
            return;
        }
        ChatActivity chatActivity = this.parentChatActivity;
        if (chatActivity == null || !chatActivity.isInScheduleMode() || this.parentChatActivity.isEditingMessageMedia()) {
            sendPressed(true, 0);
        } else {
            showScheduleDatePickerDialog();
        }
    }

    public boolean lambda$setParentActivity$15(org.telegram.ui.ActionBar.Theme.ResourcesProvider r17, android.view.View r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.lambda$setParentActivity$15(org.telegram.ui.ActionBar.Theme$ResourcesProvider, android.view.View):boolean");
    }

    public boolean lambda$setParentActivity$12(View view, MotionEvent motionEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (motionEvent.getActionMasked() != 0 || (actionBarPopupWindow = this.sendPopupWindow) == null || !actionBarPopupWindow.isShowing()) {
            return false;
        }
        view.getHitRect(this.hitRect);
        if (this.hitRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        this.sendPopupWindow.dismiss();
        return false;
    }

    public void lambda$setParentActivity$13(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.sendPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
    }

    public void lambda$setParentActivity$14(int i, View view) {
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
            sendPressed(true, 0, false, true);
        }
    }

    public void lambda$setParentActivity$16(View view) {
        if (this.captionEditText.getTag() == null) {
            if (this.isCurrentVideo) {
                if (this.videoConvertSupported) {
                    TextureView textureView = this.videoTextureView;
                    if (textureView instanceof VideoEditTextureView) {
                        VideoEditTextureView videoEditTextureView = (VideoEditTextureView) textureView;
                        if (videoEditTextureView.getVideoWidth() <= 0 || videoEditTextureView.getVideoHeight() <= 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            switchToEditMode(1);
        }
    }

    public void lambda$setParentActivity$17(View view) {
        cropRotate(-90.0f);
    }

    public void lambda$setParentActivity$18(View view) {
        cropMirror();
    }

    public void lambda$setParentActivity$19(View view) {
        if (this.captionEditText.getTag() == null) {
            if (this.isCurrentVideo) {
                if (this.videoConvertSupported) {
                    TextureView textureView = this.videoTextureView;
                    if (textureView instanceof VideoEditTextureView) {
                        VideoEditTextureView videoEditTextureView = (VideoEditTextureView) textureView;
                        if (videoEditTextureView.getVideoWidth() <= 0 || videoEditTextureView.getVideoHeight() <= 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            switchToEditMode(3);
        }
    }

    public void lambda$setParentActivity$20(View view) {
        if (this.captionEditText.getTag() == null) {
            this.muteVideo = !this.muteVideo;
            updateMuteButton();
            updateVideoInfo();
            if (!this.muteVideo || this.checkImageView.isChecked()) {
                Object obj = this.imagesArrLocals.get(this.currentIndex);
                if (obj instanceof MediaController.MediaEditState) {
                    ((MediaController.MediaEditState) obj).editedInfo = getCurrentVideoEditedInfo();
                    return;
                }
                return;
            }
            this.checkImageView.callOnClick();
        }
    }

    public void lambda$setParentActivity$21(View view) {
        if (this.placeProvider != null && this.captionEditText.getTag() == null) {
            this.placeProvider.needAddMorePhotos();
            closePhoto(true, false);
        }
    }

    public void lambda$setParentActivity$22(View view) {
        if (this.captionEditText.getTag() == null) {
            if (this.isCurrentVideo) {
                if (this.videoConvertSupported) {
                    TextureView textureView = this.videoTextureView;
                    if (textureView instanceof VideoEditTextureView) {
                        VideoEditTextureView videoEditTextureView = (VideoEditTextureView) textureView;
                        if (videoEditTextureView.getVideoWidth() <= 0 || videoEditTextureView.getVideoHeight() <= 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            switchToEditMode(2);
        }
    }

    public void lambda$setParentActivity$23(Activity activity, View view) {
        if (this.captionEditText.getTag() == null && !this.muteVideo) {
            if (this.compressItem.getTag() != null) {
                showQualityView(true);
                requestVideoPreview(1);
            } else if (this.videoConvertSupported) {
                if (this.tooltip == null) {
                    this.tooltip = new Tooltip(activity, this.containerView, -871296751, -1);
                }
                this.tooltip.setText(LocaleController.getString("VideoQualityIsTooLow", R.string.VideoQualityIsTooLow));
                this.tooltip.show(this.compressItem);
            }
        }
    }

    public void lambda$setParentActivity$29(Theme.ResourcesProvider resourcesProvider, View view) {
        String str;
        int i;
        int i2;
        if (this.parentActivity != null && this.captionEditText.getTag() == null) {
            BottomSheet.Builder builder = new BottomSheet.Builder(this.parentActivity, false, resourcesProvider, -16777216);
            builder.setUseHardwareLayer(false);
            LinearLayout linearLayout = new LinearLayout(this.parentActivity);
            linearLayout.setOrientation(1);
            builder.setCustomView(linearLayout);
            TextView textView = new TextView(this.parentActivity);
            textView.setLines(1);
            textView.setSingleLine(true);
            textView.setText(LocaleController.getString("MessageLifetime", R.string.MessageLifetime));
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            textView.setTextSize(1, 20.0f);
            textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(4.0f));
            textView.setGravity(16);
            linearLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f));
            textView.setOnTouchListener(PhotoViewer$$ExternalSyntheticLambda45.INSTANCE);
            TextView textView2 = new TextView(this.parentActivity);
            if (this.isCurrentVideo) {
                i = R.string.MessageLifetimeVideo;
                str = "MessageLifetimeVideo";
            } else {
                i = R.string.MessageLifetimePhoto;
                str = "MessageLifetimePhoto";
            }
            textView2.setText(LocaleController.getString(str, i));
            textView2.setTextColor(-8355712);
            textView2.setTextSize(1, 14.0f);
            textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            textView2.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
            textView2.setGravity(16);
            linearLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f));
            textView2.setOnTouchListener(PhotoViewer$$ExternalSyntheticLambda44.INSTANCE);
            final BottomSheet create = builder.create();
            final NumberPicker numberPicker = new NumberPicker(this.parentActivity, resourcesProvider);
            numberPicker.setMinValue(0);
            numberPicker.setMaxValue(28);
            Object obj = this.imagesArrLocals.get(this.currentIndex);
            if (obj instanceof MediaController.PhotoEntry) {
                i2 = ((MediaController.PhotoEntry) obj).ttl;
            } else {
                i2 = obj instanceof MediaController.SearchImage ? ((MediaController.SearchImage) obj).ttl : 0;
            }
            if (i2 == 0) {
                numberPicker.setValue(MessagesController.getGlobalMainSettings().getInt("self_destruct", 7));
            } else if (i2 < 0 || i2 >= 21) {
                numberPicker.setValue(((i2 / 5) + 21) - 5);
            } else {
                numberPicker.setValue(i2);
            }
            numberPicker.setTextColor(-1);
            numberPicker.setSelectorColor(-11711155);
            numberPicker.setFormatter(PhotoViewer$$ExternalSyntheticLambda74.INSTANCE);
            linearLayout.addView(numberPicker, LayoutHelper.createLinear(-1, -2));
            FrameLayout frameLayout = new FrameLayout(this, this.parentActivity) {
                @Override
                protected void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                    int childCount = getChildCount();
                    int i7 = i5 - i3;
                    for (int i8 = 0; i8 < childCount; i8++) {
                        View childAt = getChildAt(i8);
                        if (((Integer) childAt.getTag()).intValue() == -1) {
                            childAt.layout((i7 - getPaddingRight()) - childAt.getMeasuredWidth(), getPaddingTop(), i7 - getPaddingRight(), getPaddingTop() + childAt.getMeasuredHeight());
                        } else if (((Integer) childAt.getTag()).intValue() == -2) {
                            int paddingLeft = getPaddingLeft();
                            childAt.layout(paddingLeft, getPaddingTop(), childAt.getMeasuredWidth() + paddingLeft, getPaddingTop() + childAt.getMeasuredHeight());
                        } else {
                            childAt.layout(getPaddingLeft(), getPaddingTop(), getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingTop() + childAt.getMeasuredHeight());
                        }
                    }
                }
            };
            frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 52));
            TextView textView3 = new TextView(this.parentActivity);
            textView3.setMinWidth(AndroidUtilities.dp(64.0f));
            textView3.setTag(-1);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(getThemedColor("dialogFloatingButton"));
            textView3.setGravity(17);
            textView3.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            textView3.setText(LocaleController.getString("Done", R.string.Done).toUpperCase());
            textView3.setBackgroundDrawable(Theme.getRoundRectSelectorDrawable(-11944718));
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(textView3, LayoutHelper.createFrame(-2, 36, 53));
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    PhotoViewer.this.lambda$setParentActivity$27(numberPicker, create, view2);
                }
            });
            TextView textView4 = new TextView(this.parentActivity);
            textView4.setMinWidth(AndroidUtilities.dp(64.0f));
            textView4.setTag(-2);
            textView4.setTextSize(1, 14.0f);
            textView4.setTextColor(-1);
            textView4.setGravity(17);
            textView4.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            textView4.setText(LocaleController.getString("Cancel", R.string.Cancel).toUpperCase());
            textView4.setBackgroundDrawable(Theme.getRoundRectSelectorDrawable(-1));
            textView4.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            frameLayout.addView(textView4, LayoutHelper.createFrame(-2, 36, 53));
            textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    BottomSheet.this.dismiss();
                }
            });
            create.setBackgroundColor(-16777216);
            create.show();
            AndroidUtilities.setNavigationBarColor(create.getWindow(), -16777216, false);
            AndroidUtilities.setLightNavigationBar(create.getWindow(), false);
        }
    }

    public static String lambda$setParentActivity$26(int i) {
        if (i == 0) {
            return LocaleController.getString("ShortMessageLifetimeForever", R.string.ShortMessageLifetimeForever);
        }
        if (i < 1 || i >= 21) {
            return LocaleController.formatTTLString((i - 16) * 5);
        }
        return LocaleController.formatTTLString(i);
    }

    public void lambda$setParentActivity$27(NumberPicker numberPicker, BottomSheet bottomSheet, View view) {
        int value = numberPicker.getValue();
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putInt("self_destruct", value);
        edit.commit();
        bottomSheet.dismiss();
        if (value < 0 || value >= 21) {
            value = (value - 16) * 5;
        }
        Object obj = this.imagesArrLocals.get(this.currentIndex);
        if (obj instanceof MediaController.PhotoEntry) {
            ((MediaController.PhotoEntry) obj).ttl = value;
        } else if (obj instanceof MediaController.SearchImage) {
            ((MediaController.SearchImage) obj).ttl = value;
        }
        this.timeItem.setColorFilter(value != 0 ? new PorterDuffColorFilter(getThemedColor("dialogFloatingButton"), PorterDuff.Mode.MULTIPLY) : null);
        if (!this.checkImageView.isChecked()) {
            this.checkImageView.callOnClick();
        }
    }

    public void lambda$setParentActivity$31(View view) {
        if (this.imageMoveAnimation == null) {
            Runnable photoViewer$$ExternalSyntheticLambda48 = new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.this.lambda$setParentActivity$30();
                }
            };
            if (!this.previousHasTransform) {
                float stateOrientation = this.previousCropOrientation - this.photoCropView.cropView.getStateOrientation();
                if (Math.abs(stateOrientation) > 180.0f) {
                    stateOrientation = stateOrientation < 0.0f ? stateOrientation + 360.0f : -(360.0f - stateOrientation);
                }
                cropRotate(stateOrientation, this.photoCropView.cropView.getStateMirror(), photoViewer$$ExternalSyntheticLambda48);
                return;
            }
            photoViewer$$ExternalSyntheticLambda48.run();
        }
    }

    public void lambda$setParentActivity$30() {
        this.cropTransform.setViewTransform(this.previousHasTransform, this.previousCropPx, this.previousCropPy, this.previousCropRotation, this.previousCropOrientation, this.previousCropScale, 1.0f, 1.0f, this.previousCropPw, this.previousCropPh, 0.0f, 0.0f, this.previousCropMirrored);
        switchToEditMode(0);
    }

    public void lambda$setParentActivity$32(View view) {
        if (this.currentEditMode != 1 || this.photoCropView.isReady()) {
            applyCurrentEditMode();
            switchToEditMode(0);
        }
    }

    public void lambda$setParentActivity$34(View view) {
        float f = -this.photoCropView.cropView.getStateOrientation();
        if (Math.abs(f) > 180.0f) {
            f = f < 0.0f ? f + 360.0f : -(360.0f - f);
        }
        cropRotate(f, this.photoCropView.cropView.getStateMirror(), new Runnable() {
            @Override
            public final void run() {
                PhotoViewer.this.lambda$setParentActivity$33();
            }
        });
    }

    public void lambda$setParentActivity$33() {
        this.photoCropView.reset(true);
    }

    public void lambda$setParentActivity$35(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        PhotoViewerProvider photoViewerProvider;
        Bitmap bitmap;
        if (imageReceiver == this.centerImage && z && !z2) {
            if (!this.isCurrentVideo && !((this.currentEditMode != 1 && this.sendPhotoType != 1) || this.photoCropView == null || (bitmap = imageReceiver.getBitmap()) == null)) {
                this.photoCropView.setBitmap(bitmap, imageReceiver.getOrientation(), this.sendPhotoType != 1, true, this.paintingOverlay, this.cropTransform, null, null);
            }
            if (this.paintingOverlay.getVisibility() == 0) {
                this.containerView.requestLayout();
            }
            detectFaces();
        }
        if (imageReceiver == this.centerImage && z && (photoViewerProvider = this.placeProvider) != null && photoViewerProvider.scaleToFill() && !this.ignoreDidSetImage && this.sendPhotoType != 1) {
            if (!this.wasLayout) {
                this.dontResetZoomOnFirstLayout = true;
            } else {
                setScaleToFill();
            }
        }
    }

    public void lambda$setParentActivity$36(View view) {
        if (this.captionEditText.getTag() == null) {
            setPhotoChecked();
        }
    }

    public void lambda$setParentActivity$37(View view) {
        PhotoViewerProvider photoViewerProvider;
        if (this.captionEditText.getTag() == null && (photoViewerProvider = this.placeProvider) != null && photoViewerProvider.getSelectedPhotosOrder() != null && !this.placeProvider.getSelectedPhotosOrder().isEmpty()) {
            togglePhotosListView(!this.isPhotosListViewVisible, true);
        }
    }

    public void lambda$setParentActivity$38(View view, int i) {
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

    public void lambda$setParentActivity$39(View view, int i) {
        Object item = this.mentionsAdapter.getItem(i);
        int resultStartPosition = this.mentionsAdapter.getResultStartPosition();
        int resultLength = this.mentionsAdapter.getResultLength();
        if (item instanceof TLRPC$User) {
            TLRPC$User tLRPC$User = (TLRPC$User) item;
            if (tLRPC$User.username != null) {
                PhotoViewerCaptionEnterView photoViewerCaptionEnterView = this.captionEditText;
                photoViewerCaptionEnterView.replaceWithText(resultStartPosition, resultLength, "@" + tLRPC$User.username + " ", false);
                return;
            }
            String firstName = UserObject.getFirstName(tLRPC$User);
            SpannableString spannableString = new SpannableString(firstName + " ");
            spannableString.setSpan(new URLSpanUserMentionPhotoViewer("" + tLRPC$User.id, true), 0, spannableString.length(), 33);
            this.captionEditText.replaceWithText(resultStartPosition, resultLength, spannableString, false);
        } else if (item instanceof String) {
            PhotoViewerCaptionEnterView photoViewerCaptionEnterView2 = this.captionEditText;
            photoViewerCaptionEnterView2.replaceWithText(resultStartPosition, resultLength, item + " ", false);
        } else if (item instanceof MediaDataController.KeywordResult) {
            String str = ((MediaDataController.KeywordResult) item).emoji;
            this.captionEditText.addEmojiToRecent(str);
            this.captionEditText.replaceWithText(resultStartPosition, resultLength, str, true);
        }
    }

    public boolean lambda$setParentActivity$41(Theme.ResourcesProvider resourcesProvider, View view, int i) {
        if (!(this.mentionsAdapter.getItem(i) instanceof String)) {
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.parentActivity, resourcesProvider);
        builder.setTitle(LocaleController.getString("AppName", R.string.AppName));
        builder.setMessage(LocaleController.getString("ClearSearch", R.string.ClearSearch));
        builder.setPositiveButton(LocaleController.getString("ClearButton", R.string.ClearButton).toUpperCase(), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                PhotoViewer.this.lambda$setParentActivity$40(dialogInterface, i2);
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        showAlertDialog(builder);
        return true;
    }

    public void lambda$setParentActivity$40(DialogInterface dialogInterface, int i) {
        this.mentionsAdapter.clearRecentHashtags();
    }

    public void animateNavBarColorTo(int i) {
        animateNavBarColorTo(i, true);
    }

    public void animateNavBarColorTo(final int i, boolean z) {
        ValueAnimator valueAnimator = this.navBarAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final int color = this.blackPaint.getColor();
        AndroidUtilities.setLightNavigationBar(this.windowView, ((double) AndroidUtilities.computePerceivedBrightness(i)) >= 0.721d);
        if (z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.navBarAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    PhotoViewer.this.lambda$animateNavBarColorTo$42(color, i, valueAnimator2);
                }
            });
            this.navBarAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    PhotoViewer.this.blackPaint.setColor(i);
                    PhotoViewer.this.windowView.invalidate();
                }
            });
            this.navBarAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.navBarAnimator.setDuration(200L);
            this.navBarAnimator.start();
            return;
        }
        this.navBarAnimator = null;
        this.blackPaint.setColor(i);
        this.windowView.invalidate();
    }

    public void lambda$animateNavBarColorTo$42(int i, int i2, ValueAnimator valueAnimator) {
        this.blackPaint.setColor(ColorUtils.blendARGB(i, i2, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        this.windowView.invalidate();
    }

    private void showScheduleDatePickerDialog() {
        if (this.parentChatActivity != null) {
            AlertsCreator.createScheduleDatePickerDialog(this.parentActivity, this.parentChatActivity.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public final void didSelectDate(boolean z, int i) {
                    PhotoViewer.this.sendPressed(z, i);
                }
            }, new AlertsCreator.ScheduleDatePickerColors(-1, -14342875, -1, 520093695, -1, -115203550, 620756991));
        }
    }

    public void sendPressed(boolean z, int i) {
        sendPressed(z, i, false, false);
    }

    private void replacePressed() {
        sendPressed(false, 0, true, false);
    }

    private void sendPressed(boolean z, int i, boolean z2, boolean z3) {
        int i2;
        ChatActivity chatActivity;
        if (this.captionEditText.getTag() == null && this.placeProvider != null && !this.doneButtonPressed) {
            if (this.sendPhotoType == 1) {
                applyCurrentEditMode();
            }
            if (!z2 && (chatActivity = this.parentChatActivity) != null) {
                TLRPC$Chat currentChat = chatActivity.getCurrentChat();
                if (this.parentChatActivity.getCurrentUser() != null || ((ChatObject.isChannel(currentChat) && currentChat.megagroup) || !ChatObject.isChannel(currentChat))) {
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
                    edit.putBoolean("silent_" + this.parentChatActivity.getDialogId(), !z).commit();
                }
            }
            VideoEditedInfo currentVideoEditedInfo = getCurrentVideoEditedInfo();
            if (!this.imagesArrLocals.isEmpty() && (i2 = this.currentIndex) >= 0 && i2 < this.imagesArrLocals.size()) {
                Object obj = this.imagesArrLocals.get(this.currentIndex);
                if (obj instanceof MediaController.MediaEditState) {
                    ((MediaController.MediaEditState) obj).editedInfo = currentVideoEditedInfo;
                }
            }
            this.doneButtonPressed = true;
            if (!z2) {
                this.placeProvider.sendButtonPressed(this.currentIndex, currentVideoEditedInfo, z, i, z3);
            } else {
                this.placeProvider.replaceButtonPressed(this.currentIndex, currentVideoEditedInfo);
            }
            closePhoto(false, false);
        }
    }

    public void setMenuItemIcon() {
        if (this.speedItem.getVisibility() != 0) {
            this.menuItem.setIcon(R.drawable.ic_ab_other);
            return;
        }
        if (Math.abs(this.currentVideoSpeed - 0.25f) < 0.001f) {
            this.menuItem.setIcon(R.drawable.msg_more_0_2);
            this.speedItem.setSubtext(LocaleController.getString("SpeedVerySlow", R.string.SpeedVerySlow));
        } else if (Math.abs(this.currentVideoSpeed - 0.5f) < 0.001f) {
            this.menuItem.setIcon(R.drawable.msg_more_0_5);
            this.speedItem.setSubtext(LocaleController.getString("SpeedSlow", R.string.SpeedSlow));
        } else if (Math.abs(this.currentVideoSpeed - 1.0f) < 0.001f) {
            this.menuItem.setIcon(R.drawable.ic_ab_other);
            this.speedItem.setSubtext(LocaleController.getString("SpeedNormal", R.string.SpeedNormal));
        } else if (Math.abs(this.currentVideoSpeed - 1.5f) < 0.001f) {
            this.menuItem.setIcon(R.drawable.msg_more_1_5);
            this.speedItem.setSubtext(LocaleController.getString("SpeedFast", R.string.SpeedFast));
        } else {
            this.menuItem.setIcon(R.drawable.msg_more_2);
            this.speedItem.setSubtext(LocaleController.getString("SpeedVeryFast", R.string.SpeedVeryFast));
        }
        this.chooseSpeedLayout.update(this.currentVideoSpeed);
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
        if (this.captureFrameAtTime != -1 && (textureView = this.videoTextureView) != null) {
            this.captureFrameAtTime = -1L;
            final Bitmap bitmap = textureView.getBitmap();
            this.flashView.animate().alpha(1.0f).setInterpolator(CubicBezierInterpolator.EASE_BOTH).setDuration(85L).setListener(new AnimatorListenerAdapter() {
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
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (PhotoViewer.this.flashAnimator != null) {
                            AndroidUtilities.runOnUIThread(PhotoViewer.this.videoPlayRunnable = new Runnable() {
                                @Override
                                public final void run() {
                                    PhotoViewer.AnonymousClass36.AnonymousClass1.this.lambda$onAnimationEnd$0();
                                }
                            }, 860L);
                        }
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
    }

    public class AnonymousClass37 extends SpoilersTextView {
        private LinkSpanDrawable.LinkCollector links = new LinkSpanDrawable.LinkCollector(this);
        private LinkSpanDrawable<ClickableSpan> pressedLink;

        AnonymousClass37(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(android.view.MotionEvent r10) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.AnonymousClass37.onTouchEvent(android.view.MotionEvent):boolean");
        }

        public void lambda$onTouchEvent$1(LinkSpanDrawable linkSpanDrawable) {
            LinkSpanDrawable<ClickableSpan> linkSpanDrawable2 = this.pressedLink;
            if (linkSpanDrawable == linkSpanDrawable2 && linkSpanDrawable2 != null && (linkSpanDrawable2.getSpan() instanceof URLSpan)) {
                PhotoViewer.this.onLinkLongPress((URLSpan) this.pressedLink.getSpan(), this, new Runnable() {
                    @Override
                    public final void run() {
                        PhotoViewer.AnonymousClass37.this.lambda$onTouchEvent$0();
                    }
                });
                this.pressedLink = null;
            }
        }

        public void lambda$onTouchEvent$0() {
            this.links.clear();
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
            canvas.save();
            canvas.translate(getPaddingLeft(), 0.0f);
            if (this.links.draw(canvas)) {
                invalidate();
            }
            canvas.restore();
            super.onDraw(canvas);
        }
    }

    public TextView lambda$setParentActivity$6() {
        AnonymousClass37 r0 = new AnonymousClass37(this.activityContext);
        ViewHelper.setPadding(r0, 16.0f, 8.0f, 16.0f, 8.0f);
        r0.setLinkTextColor(-8796932);
        r0.setTextColor(-1);
        r0.setHighlightColor(872415231);
        r0.setGravity(LayoutHelper.getAbsoluteGravityStart() | 16);
        r0.setTextSize(1, 16.0f);
        r0.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PhotoViewer.this.lambda$createCaptionTextView$43(view);
            }
        });
        return r0;
    }

    public void lambda$createCaptionTextView$43(View view) {
        if (this.needCaptionLayout) {
            openCaptionEnter();
        }
    }

    public int getLeftInset() {
        Object obj = this.lastInsets;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return 0;
        }
        return ((WindowInsets) obj).getSystemWindowInsetLeft();
    }

    public int getRightInset() {
        Object obj = this.lastInsets;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return 0;
        }
        return ((WindowInsets) obj).getSystemWindowInsetRight();
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
        final CubicBezierInterpolator cubicBezierInterpolator;
        CubicBezierInterpolator cubicBezierInterpolator2;
        if (this.videoPlayer != null && this.textureUploaded && checkInlinePermissions() && !this.changingTextureView && !this.switchingInlineMode && !this.isInline) {
            if (PipInstance != null) {
                PipInstance.destroyPhotoViewer();
            }
            this.openedFullScreenVideo = false;
            PipInstance = Instance;
            Instance = null;
            this.switchingInlineMode = true;
            this.isVisible = false;
            AndroidUtilities.cancelRunOnUIThread(this.hideActionBarRunnable);
            PlaceProviderObject placeProviderObject = this.currentPlaceObject;
            if (placeProviderObject != null && !placeProviderObject.imageReceiver.getVisible()) {
                this.currentPlaceObject.imageReceiver.setVisible(true, true);
                AnimatedFileDrawable animation = this.currentPlaceObject.imageReceiver.getAnimation();
                if (animation != null) {
                    Bitmap animatedBitmap = animation.getAnimatedBitmap();
                    if (animatedBitmap != null) {
                        try {
                            Bitmap bitmap = this.videoTextureView.getBitmap(animatedBitmap.getWidth(), animatedBitmap.getHeight());
                            new Canvas(animatedBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                            bitmap.recycle();
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
                                PhotoViewer.lambda$switchToPip$44(ImageReceiver.this, valueAnimator);
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
                final float width = pipRect.width / this.videoTextureView.getWidth();
                final ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                final float translationX = this.videoTextureView.getTranslationX();
                final float translationY = this.videoTextureView.getTranslationY() + this.translationY;
                final float translationY2 = this.textureImageView.getTranslationY() + this.translationY;
                final float f = pipRect.x;
                final float x = (f - this.aspectRatioFrameLayout.getX()) + getLeftInset();
                final float f2 = pipRect.y;
                final float y = f2 - this.aspectRatioFrameLayout.getY();
                this.textureImageView.setTranslationY(translationY2);
                this.videoTextureView.setTranslationY(translationY);
                FirstFrameView firstFrameView = this.firstFrameView;
                if (firstFrameView != null) {
                    firstFrameView.setTranslationY(translationY);
                }
                this.translationY = 0.0f;
                this.containerView.invalidate();
                if (z) {
                    if (translationY < y) {
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
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), ((Float) ofFloat2.getAnimatedValue()).floatValue() * AndroidUtilities.dp(10.0f) * (1.0f / width));
                    }
                };
                this.videoTextureView.setOutlineProvider(viewOutlineProvider);
                this.videoTextureView.setClipToOutline(true);
                this.textureImageView.setOutlineProvider(viewOutlineProvider);
                this.textureImageView.setClipToOutline(true);
                FirstFrameView firstFrameView2 = this.firstFrameView;
                if (firstFrameView2 != null) {
                    firstFrameView2.setOutlineProvider(viewOutlineProvider);
                    this.firstFrameView.setClipToOutline(true);
                }
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        PhotoViewer.this.lambda$switchToPip$45(cubicBezierInterpolator, translationX, f, translationY2, f2, x, translationY, y, valueAnimator);
                    }
                });
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(this.textureImageView, View.SCALE_X, width), ObjectAnimator.ofFloat(this.textureImageView, View.SCALE_Y, width), ObjectAnimator.ofFloat(this.videoTextureView, View.SCALE_X, width), ObjectAnimator.ofFloat(this.videoTextureView, View.SCALE_Y, width), ObjectAnimator.ofInt(this.backgroundDrawable, (Property<BackgroundDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, 0), ofFloat2);
                if (z) {
                    animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                    animatorSet.setDuration(300L);
                } else {
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                    animatorSet.setDuration(250L);
                }
                animatorSet.addListener(new AnonymousClass40());
                animatorSet.start();
                if (!z) {
                    toggleActionBar(false, true, new ActionBarToggleParams().enableStatusBarAnimation(false).enableTranslationAnimation(false).animationDuration(250).animationInterpolator(new DecelerateInterpolator()));
                }
            } else {
                this.switchToInlineRunnable.run();
                dismissInternal();
            }
            ChatActivity chatActivity = this.parentChatActivity;
            if (chatActivity != null) {
                chatActivity.getFragmentView().invalidate();
            }
        }
    }

    public static void lambda$switchToPip$44(ImageReceiver imageReceiver, ValueAnimator valueAnimator) {
        imageReceiver.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void lambda$switchToPip$45(CubicBezierInterpolator cubicBezierInterpolator, float f, float f2, float f3, float f4, float f5, float f6, float f7, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float interpolation = cubicBezierInterpolator == null ? floatValue : cubicBezierInterpolator.getInterpolation(floatValue);
        float f8 = f * (1.0f - floatValue);
        this.textureImageView.setTranslationX((f2 * floatValue) + f8);
        float f9 = 1.0f - interpolation;
        this.textureImageView.setTranslationY((f3 * f9) + (f4 * interpolation));
        this.textureImageView.invalidateOutline();
        this.videoTextureView.setTranslationX(f8 + (f5 * floatValue));
        this.videoTextureView.setTranslationY((f6 * f9) + (f7 * interpolation));
        this.videoTextureView.invalidateOutline();
        FirstFrameView firstFrameView = this.firstFrameView;
        if (firstFrameView != null) {
            firstFrameView.setTranslationX(this.videoTextureView.getTranslationX());
            this.firstFrameView.setTranslationY(this.videoTextureView.getTranslationY());
            this.firstFrameView.setScaleX(this.videoTextureView.getScaleX());
            this.firstFrameView.setScaleY(this.videoTextureView.getScaleY());
            this.firstFrameView.invalidateOutline();
        }
    }

    public class AnonymousClass40 extends AnimatorListenerAdapter {
        AnonymousClass40() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            PhotoViewer.this.pipAnimationInProgress = false;
            PhotoViewer.this.switchToInlineRunnable.run();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.AnonymousClass40.this.lambda$onAnimationEnd$0();
                }
            }, 100L);
        }

        public void lambda$onAnimationEnd$0() {
            PhotoViewer.this.videoTextureView.setOutlineProvider(null);
            PhotoViewer.this.textureImageView.setOutlineProvider(null);
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
            @Override
            public void onAnimationEnd(Animator animator) {
                PhotoViewer.this.imageMoveAnimation = null;
                if (PhotoViewer.this.photoCropView != null) {
                    if (PhotoViewer.this.photoCropView.mirror()) {
                        PhotoViewer.this.mirrorItem.setColorFilter(new PorterDuffColorFilter(PhotoViewer.this.getThemedColor("dialogFloatingButton"), PorterDuff.Mode.MULTIPLY));
                    } else {
                        PhotoViewer.this.mirrorItem.setColorFilter((ColorFilter) null);
                    }
                    PhotoViewer photoViewer = PhotoViewer.this;
                    photoViewer.mirror = photoViewer.animateToMirror = 0.0f;
                    PhotoViewer.this.containerView.invalidate();
                }
            }
        });
        this.imageMoveAnimation.start();
        return !this.photoCropView.cropView.isMirrored();
    }

    public boolean cropRotate(float f) {
        return cropRotate(f, false, null);
    }

    private boolean cropRotate(final float f, boolean z, final Runnable runnable) {
        PhotoCropView photoCropView;
        if (this.imageMoveAnimation != null || (photoCropView = this.photoCropView) == null) {
            return false;
        }
        photoCropView.cropView.maximize(true);
        this.rotate = 0.0f;
        this.animateToRotate = 0.0f + f;
        if (z) {
            this.mirror = 0.0f;
            this.animateToMirror = 1.0f;
        }
        this.animationStartTime = System.currentTimeMillis();
        this.imageMoveAnimation = new AnimatorSet();
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
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float rotation = this.photoCropView.wheelView.getRotation();
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PhotoViewer.this.lambda$cropRotate$46(f, rotation, valueAnimator);
            }
        });
        this.imageMoveAnimation.playTogether(ObjectAnimator.ofFloat(this, AnimationProperties.PHOTO_VIEWER_ANIMATION_VALUE, 0.0f, 1.0f), ofFloat);
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
                photoViewer3.scale = photoViewer3.animateToScale = 1.0f;
                PhotoViewer.this.containerView.invalidate();
                PhotoViewer.this.photoCropView.cropView.areaView.setRotationScaleTranslation(0.0f, 1.0f, 0.0f, 0.0f);
                PhotoViewer.this.photoCropView.wheelView.setRotated(false);
                if (Math.abs(f) > 0.0f) {
                    if (PhotoViewer.this.photoCropView.rotate(f)) {
                        PhotoViewer.this.rotateItem.setColorFilter(new PorterDuffColorFilter(PhotoViewer.this.getThemedColor("dialogFloatingButton"), PorterDuff.Mode.MULTIPLY));
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

    public void lambda$cropRotate$46(float f, float f2, ValueAnimator valueAnimator) {
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
        TextureView textureView;
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
            if (this.photoViewerWebView == null && (textureView = this.videoTextureView) != null) {
                if (textureView.getParent() != null) {
                    ((ViewGroup) this.videoTextureView.getParent()).removeView(this.videoTextureView);
                }
                this.videoTextureView.setVisibility(4);
                this.aspectRatioFrameLayout.addView(this.videoTextureView);
            }
            if (ApplicationLoader.mainInterfacePaused) {
                try {
                    this.parentActivity.startService(new Intent(ApplicationLoader.applicationContext, BringAppForegroundService.class));
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            if (this.photoViewerWebView == null) {
                if (Build.VERSION.SDK_INT < 21 || this.videoTextureView == null) {
                    PipVideoOverlay.dismiss(true);
                } else {
                    this.pipAnimationInProgress = true;
                    org.telegram.ui.Components.Rect pipRect = PipVideoOverlay.getPipRect(false, this.aspectRatioFrameLayout.getAspectRatio());
                    final float f = pipRect.width / this.textureImageView.getLayoutParams().width;
                    this.textureImageView.setScaleX(f);
                    this.textureImageView.setScaleY(f);
                    this.textureImageView.setTranslationX(pipRect.x);
                    this.textureImageView.setTranslationY(pipRect.y);
                    this.videoTextureView.setScaleX(f);
                    this.videoTextureView.setScaleY(f);
                    this.videoTextureView.setTranslationX(pipRect.x - this.aspectRatioFrameLayout.getX());
                    this.videoTextureView.setTranslationY(pipRect.y - this.aspectRatioFrameLayout.getY());
                    FirstFrameView firstFrameView = this.firstFrameView;
                    if (firstFrameView != null) {
                        firstFrameView.setScaleX(f);
                        this.firstFrameView.setScaleY(f);
                        this.firstFrameView.setTranslationX(this.videoTextureView.getTranslationX());
                        this.firstFrameView.setTranslationY(this.videoTextureView.getTranslationY());
                    }
                    this.inlineOutAnimationProgress = 0.0f;
                    ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() {
                        @Override
                        public void getOutline(View view, Outline outline) {
                            outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), (1.0f - PhotoViewer.this.inlineOutAnimationProgress) * AndroidUtilities.dp(10.0f) * (1.0f / f));
                        }
                    };
                    this.videoTextureView.setOutlineProvider(viewOutlineProvider);
                    this.videoTextureView.setClipToOutline(true);
                    this.textureImageView.setOutlineProvider(viewOutlineProvider);
                    this.textureImageView.setClipToOutline(true);
                    FirstFrameView firstFrameView2 = this.firstFrameView;
                    if (firstFrameView2 != null) {
                        firstFrameView2.setOutlineProvider(viewOutlineProvider);
                        this.firstFrameView.setClipToOutline(true);
                    }
                }
            }
            try {
                this.isVisible = true;
                ((WindowManager) this.parentActivity.getSystemService("window")).addView(this.windowView, this.windowLayoutParams);
                onShowView();
                PlaceProviderObject placeProviderObject = this.currentPlaceObject;
                if (placeProviderObject != null) {
                    placeProviderObject.imageReceiver.setVisible(false, false);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (Build.VERSION.SDK_INT >= 21) {
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
    }

    public void onUserLeaveHint() {
        if (this.pipItem.getAlpha() == 1.0f && AndroidUtilities.checkInlinePermissions(this.parentActivity) && !PipVideoOverlay.isVisible()) {
            if (!this.isEmbedVideo) {
                this.pipVideoOverlayAnimateFlag = false;
                switchToPip(false);
            } else if (!this.photoViewerWebView.isInAppOnly() && this.photoViewerWebView.openInPip()) {
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
                dismissInternal();
            }
        }
    }

    public void updateVideoSeekPreviewPosition() {
        int thumbX = (this.videoPlayerSeekbar.getThumbX() + AndroidUtilities.dp(2.0f)) - (this.videoPreviewFrame.getMeasuredWidth() / 2);
        int dp = AndroidUtilities.dp(10.0f);
        int measuredWidth = (this.videoPlayerControlFrameLayout.getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - (this.videoPreviewFrame.getMeasuredWidth() / 2);
        if (thumbX < dp) {
            thumbX = dp;
        } else if (thumbX >= measuredWidth) {
            thumbX = measuredWidth;
        }
        this.videoPreviewFrame.setTranslationX(thumbX);
    }

    public void showVideoSeekPreviewPosition(boolean z) {
        if (z && this.videoPreviewFrame.getTag() != null) {
            return;
        }
        if (!z && this.videoPreviewFrame.getTag() == null) {
            return;
        }
        if (!z || this.videoPreviewFrame.isReady()) {
            AnimatorSet animatorSet = this.videoPreviewFrameAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.videoPreviewFrame.setTag(z ? 1 : null);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.videoPreviewFrameAnimation = animatorSet2;
            Animator[] animatorArr = new Animator[1];
            VideoSeekPreviewImage videoSeekPreviewImage = this.videoPreviewFrame;
            Property property = View.ALPHA;
            float[] fArr = new float[1];
            fArr[0] = z ? 1.0f : 0.0f;
            animatorArr[0] = ObjectAnimator.ofFloat(videoSeekPreviewImage, property, fArr);
            animatorSet2.playTogether(animatorArr);
            this.videoPreviewFrameAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    PhotoViewer.this.videoPreviewFrameAnimation = null;
                }
            });
            this.videoPreviewFrameAnimation.setDuration(180L);
            this.videoPreviewFrameAnimation.start();
            return;
        }
        this.needShowOnReady = true;
    }

    private void createVideoControlsInterface() {
        VideoPlayerControlFrameLayout videoPlayerControlFrameLayout = new VideoPlayerControlFrameLayout(this.containerView.getContext());
        this.videoPlayerControlFrameLayout = videoPlayerControlFrameLayout;
        this.containerView.addView(videoPlayerControlFrameLayout, LayoutHelper.createFrame(-1, 48, 83));
        final VideoPlayerSeekBar.SeekBarDelegate seekBarDelegate = new VideoPlayerSeekBar.SeekBarDelegate() {
            @Override
            public void onSeekBarDrag(float f) {
                if (PhotoViewer.this.videoPlayer != null) {
                    if (!PhotoViewer.this.inPreview && PhotoViewer.this.videoTimelineView.getVisibility() == 0) {
                        f = PhotoViewer.this.videoTimelineView.getLeftProgress() + ((PhotoViewer.this.videoTimelineView.getRightProgress() - PhotoViewer.this.videoTimelineView.getLeftProgress()) * f);
                    }
                    long duration = PhotoViewer.this.videoPlayer.getDuration();
                    if (duration == -9223372036854775807L) {
                        PhotoViewer.this.seekToProgressPending = f;
                    } else {
                        PhotoViewer.this.videoPlayer.seekTo((int) (f * ((float) duration)));
                    }
                    PhotoViewer.this.showVideoSeekPreviewPosition(false);
                    PhotoViewer.this.needShowOnReady = false;
                }
            }

            @Override
            public void onSeekBarContinuousDrag(float f) {
                if (!(PhotoViewer.this.videoPlayer == null || PhotoViewer.this.videoPreviewFrame == null)) {
                    PhotoViewer.this.videoPreviewFrame.setProgress(f, PhotoViewer.this.videoPlayerSeekbar.getWidth());
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
                PhotoViewer.this.lambda$createVideoControlsInterface$47();
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
                PhotoViewer.this.lambda$createVideoControlsInterface$48(view2);
            }
        });
    }

    public void lambda$createVideoControlsInterface$47() {
        if (this.needShowOnReady) {
            showVideoSeekPreviewPosition(true);
        }
    }

    public void lambda$createVideoControlsInterface$48(View view) {
        Activity activity = this.parentActivity;
        if (activity != null) {
            this.wasRotated = false;
            this.fullscreenedByButton = 2;
            if (this.prevOrientation == -10) {
                this.prevOrientation = activity.getRequestedOrientation();
            }
            this.parentActivity.setRequestedOrientation(1);
        }
    }

    private void openCaptionEnter() {
        int i;
        if (this.imageMoveAnimation == null && this.changeModeAnimation == null && this.currentEditMode == 0 && (i = this.sendPhotoType) != 1 && i != 3 && i != 10) {
            if (!this.windowView.isFocusable()) {
                makeFocusable();
            }
            this.keyboardAnimationEnabled = true;
            this.selectedPhotosListView.setEnabled(false);
            this.photosCounterView.setRotationX(0.0f);
            this.isPhotosListViewVisible = false;
            this.captionEditText.setTag(1);
            this.captionEditText.openKeyboard();
            this.captionEditText.setImportantForAccessibility(0);
            this.lastTitle = this.actionBar.getTitle();
            this.captionEditText.setVisibility(0);
        }
    }

    private int[] fixVideoWidthHeight(int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.fixVideoWidthHeight(int, int):int[]");
    }

    public VideoEditedInfo getCurrentVideoEditedInfo() {
        int i;
        long j;
        int i2 = -1;
        boolean z = false;
        ArrayList<VideoEditedInfo.MediaEntity> arrayList = null;
        if (!this.isCurrentVideo && hasAnimatedMediaEntities() && this.centerImage.getBitmapWidth() > 0) {
            float f = this.sendPhotoType == 1 ? 800.0f : 854.0f;
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
            videoEditedInfo.rotationValue = 0;
            videoEditedInfo.originalPath = this.currentImagePath;
            videoEditedInfo.estimatedSize = (int) ((((float) j) / 1000.0f) * 115200.0f);
            videoEditedInfo.estimatedDuration = j;
            videoEditedInfo.framerate = 30;
            videoEditedInfo.originalDuration = j;
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
            if (this.sendPhotoType == 1) {
                bitmapWidth = bitmapHeight;
            }
            float f2 = bitmapWidth;
            float f3 = bitmapHeight;
            float max = Math.max(f2 / f, f3 / f);
            if (max < 1.0f) {
                max = 1.0f;
            }
            int i4 = (int) (f2 / max);
            int i5 = (int) (f3 / max);
            if (i4 % 16 != 0) {
                i4 = Math.max(1, Math.round(i4 / 16.0f)) * 16;
            }
            if (i5 % 16 != 0) {
                i5 = Math.max(1, Math.round(i5 / 16.0f)) * 16;
            }
            videoEditedInfo.resultWidth = i4;
            videoEditedInfo.originalWidth = i4;
            videoEditedInfo.resultHeight = i5;
            videoEditedInfo.originalHeight = i5;
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
            videoEditedInfo2.rotationValue = this.rotationValue;
            videoEditedInfo2.originalWidth = this.originalWidth;
            videoEditedInfo2.originalHeight = this.originalHeight;
            videoEditedInfo2.bitrate = this.bitrate;
            videoEditedInfo2.originalPath = this.currentPathObject;
            long j2 = this.estimatedSize;
            if (j2 == 0) {
                j2 = 1;
            }
            videoEditedInfo2.estimatedSize = j2;
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
            if (this.sendPhotoType == 1 || this.muteVideo || !(this.compressItem.getTag() == null || (videoEditedInfo2.resultWidth == this.originalWidth && videoEditedInfo2.resultHeight == this.originalHeight))) {
                if (this.muteVideo || this.sendPhotoType == 1) {
                    this.selectedCompression = 1;
                    updateWidthHeightBitrateForCompression();
                }
                videoEditedInfo2.resultWidth = this.resultWidth;
                videoEditedInfo2.resultHeight = this.resultHeight;
                if (!this.muteVideo && this.sendPhotoType != 1) {
                    i2 = this.bitrate;
                }
                videoEditedInfo2.bitrate = i2;
            } else {
                videoEditedInfo2.resultWidth = this.originalWidth;
                videoEditedInfo2.resultHeight = this.originalHeight;
                if (!this.muteVideo) {
                    i2 = this.originalBitrate;
                }
                videoEditedInfo2.bitrate = i2;
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
            int i6 = this.sendPhotoType;
            if (i6 == 1) {
                videoEditedInfo2.avatarStartTime = this.avatarStartTime;
                videoEditedInfo2.originalBitrate = this.originalBitrate;
            }
            if (this.muteVideo || i6 == 1) {
                z = true;
            }
            videoEditedInfo2.muted = z;
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
        if (i >= 0 && i < this.imagesArrLocals.size() && this.captionEditText.getTag() != null) {
            Object obj = this.imagesArrLocals.get(this.currentIndex);
            if (z) {
                CharSequence fieldCharSequence = this.captionEditText.getFieldCharSequence();
                CharSequence[] charSequenceArr = {fieldCharSequence};
                if (this.hasCaptionForAllMedia && !TextUtils.equals(this.captionForAllMedia, fieldCharSequence) && this.placeProvider.getPhotoIndex(this.currentIndex) != 0 && this.placeProvider.getSelectedCount() > 0) {
                    this.hasCaptionForAllMedia = false;
                }
                ArrayList<TLRPC$MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, supportsSendingNewEntities());
                this.captionForAllMedia = fieldCharSequence;
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    photoEntry.caption = charSequenceArr[0];
                    photoEntry.entities = entities;
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    searchImage.caption = charSequenceArr[0];
                    searchImage.entities = entities;
                }
                if (this.captionEditText.getFieldCharSequence().length() != 0 && !this.placeProvider.isPhotoChecked(this.currentIndex)) {
                    setPhotoChecked();
                }
                PhotoViewerProvider photoViewerProvider = this.placeProvider;
                if (photoViewerProvider != null) {
                    photoViewerProvider.onApplyCaption(fieldCharSequence);
                }
                setCurrentCaption(null, charSequenceArr[0], false);
            }
            this.captionEditText.setTag(null);
            if (this.isCurrentVideo) {
                this.actionBar.setTitleAnimated(this.lastTitle, false, 220L);
                this.actionBar.setSubtitle(this.muteVideo ? LocaleController.getString("SoundMuted", R.string.SoundMuted) : this.currentSubtitle);
            }
            updateCaptionTextForCurrentPhoto(obj);
            if (this.captionEditText.isPopupShowing()) {
                this.captionEditText.hidePopup();
            }
            this.captionEditText.closeKeyboard();
            if (Build.VERSION.SDK_INT >= 19) {
                this.captionEditText.setImportantForAccessibility(4);
            }
        }
    }

    public void updateVideoPlayerTime() {
        Arrays.fill(this.videoPlayerCurrentTime, 0);
        Arrays.fill(this.videoPlayerTotalTime, 0);
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            long max = Math.max(0L, videoPlayer.getCurrentPosition());
            if (this.shownControlsByEnd && !this.actionBarWasShownBeforeByEnd) {
                max = 0;
            }
            long max2 = Math.max(0L, this.videoPlayer.getDuration());
            if (!this.inPreview && this.videoTimelineView.getVisibility() == 0) {
                max2 = ((float) max2) * (this.videoTimelineView.getRightProgress() - this.videoTimelineView.getLeftProgress());
                max = ((float) max) - (this.videoTimelineView.getLeftProgress() * ((float) max2));
                if (max > max2) {
                    max = max2;
                }
            }
            long j = max / 1000;
            long j2 = max2 / 1000;
            int[] iArr = this.videoPlayerCurrentTime;
            iArr[0] = (int) (j / 60);
            iArr[1] = (int) (j % 60);
            int[] iArr2 = this.videoPlayerTotalTime;
            iArr2[0] = (int) (j2 / 60);
            iArr2[1] = (int) (j2 % 60);
        }
        this.videoPlayerTime.setText(String.format(Locale.ROOT, "%02d:%02d / %02d:%02d", Integer.valueOf(this.videoPlayerCurrentTime[0]), Integer.valueOf(this.videoPlayerCurrentTime[1]), Integer.valueOf(this.videoPlayerTotalTime[0]), Integer.valueOf(this.videoPlayerTotalTime[1])));
    }

    private void checkBufferedProgress(float f) {
        MessageObject messageObject;
        TLRPC$Document document;
        if (this.isStreaming && this.parentActivity != null && !this.streamingAlertShown && this.videoPlayer != null && (messageObject = this.currentMessageObject) != null && (document = messageObject.getDocument()) != null && this.currentMessageObject.getDuration() >= 20 && f < 0.9f) {
            long j = document.size;
            if ((((float) j) * f >= 5242880.0f || (f >= 0.5f && j >= 2097152)) && Math.abs(SystemClock.elapsedRealtime() - this.startedPlayTime) >= 2000) {
                if (this.videoPlayer.getDuration() == -9223372036854775807L) {
                    Toast.makeText(this.parentActivity, LocaleController.getString("VideoDoesNotSupportStreaming", R.string.VideoDoesNotSupportStreaming), 1).show();
                }
                this.streamingAlertShown = true;
            }
        }
    }

    public void updateColors() {
        int themedColor = getThemedColor("dialogFloatingButton");
        ImageView imageView = this.pickerViewSendButton;
        if (imageView != null) {
            Drawable background = imageView.getBackground();
            Theme.setSelectorDrawableColor(background, themedColor, false);
            Theme.setSelectorDrawableColor(background, getThemedColor(Build.VERSION.SDK_INT >= 21 ? "dialogFloatingButtonPressed" : "dialogFloatingButton"), true);
            this.pickerViewSendButton.setColorFilter(new PorterDuffColorFilter(getThemedColor("dialogFloatingIcon"), PorterDuff.Mode.MULTIPLY));
        }
        CheckBox checkBox = this.checkImageView;
        if (checkBox != null) {
            checkBox.setColor(getThemedColor("dialogFloatingButton"), -1);
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY);
        ImageView imageView2 = this.timeItem;
        if (!(imageView2 == null || imageView2.getColorFilter() == null)) {
            this.timeItem.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView3 = this.paintItem;
        if (!(imageView3 == null || imageView3.getColorFilter() == null)) {
            this.paintItem.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView4 = this.cropItem;
        if (!(imageView4 == null || imageView4.getColorFilter() == null)) {
            this.cropItem.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView5 = this.tuneItem;
        if (!(imageView5 == null || imageView5.getColorFilter() == null)) {
            this.tuneItem.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView6 = this.rotateItem;
        if (!(imageView6 == null || imageView6.getColorFilter() == null)) {
            this.rotateItem.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView7 = this.mirrorItem;
        if (!(imageView7 == null || imageView7.getColorFilter() == null)) {
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
        PhotoPaintView photoPaintView = this.photoPaintView;
        if (photoPaintView != null) {
            photoPaintView.updateColors();
        }
        PhotoFilterView photoFilterView = this.photoFilterView;
        if (photoFilterView != null) {
            photoFilterView.updateColors();
        }
        PhotoViewerCaptionEnterView photoViewerCaptionEnterView = this.captionEditText;
        if (photoViewerCaptionEnterView != null) {
            photoViewerCaptionEnterView.updateColors();
        }
        VideoTimelinePlayView videoTimelinePlayView = this.videoTimelineView;
        if (videoTimelinePlayView != null) {
            videoTimelinePlayView.invalidate();
        }
        SelectedPhotosListView selectedPhotosListView = this.selectedPhotosListView;
        if (selectedPhotosListView != null) {
            int childCount = selectedPhotosListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.selectedPhotosListView.getChildAt(i);
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
        if (!isAccessibilityEnabled()) {
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

    public void updatePlayerState(boolean z, int i) {
        MessageObject messageObject;
        if (this.videoPlayer != null) {
            float f = 0.0f;
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
            int i2 = 4;
            if (aspectRatioFrameLayout != null) {
                aspectRatioFrameLayout.setKeepScreenOn((!z || i == 4 || i == 1) ? false : true);
            }
            if (!z || i == 4 || i == 1) {
                try {
                    this.parentActivity.getWindow().clearFlags(ConnectionsManager.RequestFlagNeedQuickAck);
                    this.keepScreenOnFlagSet = false;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else {
                try {
                    this.parentActivity.getWindow().addFlags(ConnectionsManager.RequestFlagNeedQuickAck);
                    this.keepScreenOnFlagSet = true;
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
            if (i == 3 || i == 1) {
                if (this.currentMessageObject != null) {
                    this.videoPreviewFrame.open(this.videoPlayer.getCurrentUri());
                }
                if (this.seekToProgressPending != 0.0f) {
                    this.videoPlayer.seekTo((int) (((float) this.videoPlayer.getDuration()) * this.seekToProgressPending));
                    this.seekToProgressPending = 0.0f;
                    MessageObject messageObject2 = this.currentMessageObject;
                    if (messageObject2 != null && !FileLoader.getInstance(messageObject2.currentAccount).isLoadingVideoAny(this.currentMessageObject.getDocument())) {
                        this.skipFirstBufferingProgress = true;
                    }
                }
            }
            if (i == 3) {
                if (this.aspectRatioFrameLayout.getVisibility() != 0) {
                    this.aspectRatioFrameLayout.setVisibility(0);
                }
                if (!this.pipItem.isEnabled() && this.pipItem.getVisibility() == 0) {
                    this.pipAvailable = true;
                    this.pipItem.setEnabled(true);
                    this.pipItem.animate().alpha(1.0f).setDuration(175L).withEndAction(null).start();
                }
                this.playerWasReady = true;
                MessageObject messageObject3 = this.currentMessageObject;
                if (messageObject3 != null && messageObject3.isVideo()) {
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
            long j = 0;
            if (!this.videoPlayer.isPlaying() || i == 4) {
                if (this.isPlaying || i == 4) {
                    if (this.currentEditMode != 3) {
                        this.photoProgressViews[0].setIndexedAlpha(1, 1.0f, i == 4);
                        PhotoProgressView[] photoProgressViewArr = this.photoProgressViews;
                        photoProgressViewArr[0].setBackgroundState(3, false, photoProgressViewArr[0].animAlphas[1] > 0.0f);
                    }
                    this.isPlaying = false;
                    AndroidUtilities.cancelRunOnUIThread(this.updateProgressRunnable);
                    if (i == 4) {
                        if (!this.isCurrentVideo) {
                            this.videoPlayerSeekbar.setProgress(0.0f);
                            this.videoPlayerSeekbarView.invalidate();
                            if (this.inPreview || this.videoTimelineView.getVisibility() != 0) {
                                this.videoPlayer.seekTo(0L);
                            } else {
                                this.videoPlayer.seekTo((int) (this.videoTimelineView.getLeftProgress() * ((float) this.videoPlayer.getDuration())));
                            }
                            this.manuallyPaused = false;
                            this.videoPlayer.pause();
                            if (!this.isActionBarVisible) {
                                toggleActionBar(true, true);
                            }
                        } else if (!this.videoTimelineView.isDragging()) {
                            VideoTimelinePlayView videoTimelinePlayView = this.videoTimelineView;
                            videoTimelinePlayView.setProgress(videoTimelinePlayView.getLeftProgress());
                            if (this.inPreview || (this.currentEditMode == 0 && this.videoTimelineView.getVisibility() != 0)) {
                                this.videoPlayer.seekTo(0L);
                            } else {
                                this.videoPlayer.seekTo((int) (this.videoTimelineView.getLeftProgress() * ((float) this.videoPlayer.getDuration())));
                            }
                            this.manuallyPaused = false;
                            cancelVideoPlayRunnable();
                            if (this.sendPhotoType == 1 || this.currentEditMode != 0 || this.switchingToMode > 0) {
                                this.videoPlayer.play();
                            } else {
                                this.videoPlayer.pause();
                            }
                            this.containerView.invalidate();
                        }
                        PipVideoOverlay.onVideoCompleted();
                    }
                }
            } else if (!this.isPlaying) {
                this.isPlaying = true;
                PhotoProgressView photoProgressView = this.photoProgressViews[0];
                if (this.isCurrentVideo) {
                    i2 = -1;
                }
                photoProgressView.setBackgroundState(i2, false, true);
                PhotoProgressView photoProgressView2 = this.photoProgressViews[0];
                if (this.isCurrentVideo || ((isAccessibilityEnabled() && !this.playerWasPlaying) || ((!this.playerAutoStarted || this.playerWasPlaying) && this.isActionBarVisible))) {
                    f = 1.0f;
                }
                photoProgressView2.setIndexedAlpha(1, f, false);
                this.playerWasPlaying = true;
                AndroidUtilities.runOnUIThread(this.updateProgressRunnable);
            }
            PipVideoOverlay.updatePlayButton();
            VideoPlayerSeekBar videoPlayerSeekBar = this.videoPlayerSeekbar;
            MessageObject messageObject4 = this.currentMessageObject;
            VideoPlayer videoPlayer = this.videoPlayer;
            if (videoPlayer != null) {
                j = videoPlayer.getDuration();
            }
            videoPlayerSeekBar.updateTimestamps(messageObject4, j);
            updateVideoPlayerTime();
        }
    }

    private void preparePlayer(Uri uri, boolean z, boolean z2) {
        preparePlayer(uri, z, z2, null);
    }

    private void preparePlayer(Uri uri, boolean z, boolean z2, MediaController.SavedFilterState savedFilterState) {
        boolean z3;
        if (!z2) {
            this.currentPlayingVideoFile = uri;
        }
        if (this.parentActivity != null) {
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
                    @Override
                    public void onOrientationChanged(int i) {
                        if (PhotoViewer.this.orientationEventListener != null && PhotoViewer.this.aspectRatioFrameLayout != null && PhotoViewer.this.aspectRatioFrameLayout.getVisibility() == 0 && PhotoViewer.this.parentActivity != null && PhotoViewer.this.fullscreenedByButton != 0) {
                            if (PhotoViewer.this.fullscreenedByButton == 1) {
                                if (i >= 240 && i <= 300) {
                                    PhotoViewer.this.wasRotated = true;
                                } else if (PhotoViewer.this.wasRotated && i > 0) {
                                    if (i >= 330 || i <= 30) {
                                        PhotoViewer.this.parentActivity.setRequestedOrientation(PhotoViewer.this.prevOrientation);
                                        PhotoViewer.this.fullscreenedByButton = 0;
                                        PhotoViewer.this.wasRotated = false;
                                    }
                                }
                            } else if (i > 0 && (i >= 330 || i <= 30)) {
                                PhotoViewer.this.wasRotated = true;
                            } else if (PhotoViewer.this.wasRotated && i >= 240 && i <= 300) {
                                PhotoViewer.this.parentActivity.setRequestedOrientation(PhotoViewer.this.prevOrientation);
                                PhotoViewer.this.fullscreenedByButton = 0;
                                PhotoViewer.this.wasRotated = false;
                            }
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
                    };
                    z3 = true;
                }
                TextureView textureView = this.videoTextureView;
                if (textureView != null) {
                    this.videoPlayer.setTextureView(textureView);
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
            TextureView textureView2 = this.videoTextureView;
            this.videoCrossfadeAlpha = 0.0f;
            textureView2.setAlpha(0.0f);
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
                this.videoTimelineView.setProgress(0.0f);
                this.videoPlayerSeekbar.setBufferedProgress(0.0f);
                MessageObject messageObject = this.currentMessageObject;
                if (messageObject != null) {
                    int duration = messageObject.getDuration();
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
                            if (messageObject2.forceSeekTo < 0.0f && savedVideoPosition != null) {
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
            boolean z4 = messageObject3 != null && messageObject3.getDuration() <= 30;
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
            if (tLRPC$BotInlineResult == null || (!tLRPC$BotInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND) && !MessageObject.isVideoDocument(this.currentBotInlineResult.document))) {
                this.bottomLayout.setPadding(0, 0, 0, 0);
            } else {
                this.bottomLayout.setVisibility(0);
                this.bottomLayout.setPadding(0, 0, AndroidUtilities.dp(84.0f), 0);
                this.pickerView.setVisibility(8);
            }
            if (this.pageBlocksAdapter != null) {
                this.bottomLayout.setVisibility(0);
            }
            setVideoPlayerControlVisible(!this.isCurrentVideo, true);
            if (!this.isCurrentVideo) {
                scheduleActionBarHide(this.playerAutoStarted ? 3000 : 1000);
            }
            if (this.currentMessageObject != null) {
                this.videoPlayer.setPlaybackSpeed(this.currentVideoSpeed);
            }
            this.inPreview = z2;
        }
    }

    public class AnonymousClass51 implements VideoPlayer.VideoPlayerDelegate {
        @Override
        public void onSeekFinished(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekFinished(this, eventTime);
        }

        @Override
        public void onSeekStarted(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekStarted(this, eventTime);
        }

        AnonymousClass51() {
        }

        @Override
        public void onStateChanged(boolean z, int i) {
            PhotoViewer.this.updatePlayerState(z, i);
        }

        @Override
        public void onError(VideoPlayer videoPlayer, Exception exc) {
            if (PhotoViewer.this.videoPlayer == videoPlayer) {
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
            if (PhotoViewer.this.firstFrameView == null) {
                return;
            }
            if (PhotoViewer.this.videoPlayer == null || !PhotoViewer.this.videoPlayer.isLooping()) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PhotoViewer.AnonymousClass51.this.lambda$onRenderedFirstFrame$1();
                    }
                }, 64L);
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
            if (PhotoViewer.this.firstFrameView == null) {
                return;
            }
            if (PhotoViewer.this.videoPlayer == null || !PhotoViewer.this.videoPlayer.isLooping()) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PhotoViewer.AnonymousClass51.this.lambda$onRenderedFirstFrame$2();
                    }
                }, 64L);
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
            if (PhotoViewer.this.waitingForFirstTextureUpload == 2) {
                if (PhotoViewer.this.textureImageView != null) {
                    PhotoViewer.this.textureImageView.setVisibility(4);
                    PhotoViewer.this.textureImageView.setImageDrawable(null);
                    if (PhotoViewer.this.currentBitmap != null) {
                        PhotoViewer.this.currentBitmap.recycle();
                        PhotoViewer.this.currentBitmap = null;
                    }
                }
                PhotoViewer.this.switchingInlineMode = false;
                if (Build.VERSION.SDK_INT >= 21) {
                    PhotoViewer.this.aspectRatioFrameLayout.getLocationInWindow(PhotoViewer.this.pipPosition);
                    int[] iArr = PhotoViewer.this.pipPosition;
                    iArr[1] = (int) (iArr[1] - PhotoViewer.this.containerView.getTranslationY());
                    if (PhotoViewer.this.textureImageView != null) {
                        PhotoViewer.this.textureImageView.setTranslationX(PhotoViewer.this.textureImageView.getTranslationX() + PhotoViewer.this.getLeftInset());
                    }
                    if (PhotoViewer.this.videoTextureView != null) {
                        PhotoViewer.this.videoTextureView.setTranslationX((PhotoViewer.this.videoTextureView.getTranslationX() + PhotoViewer.this.getLeftInset()) - PhotoViewer.this.aspectRatioFrameLayout.getX());
                    }
                    if (PhotoViewer.this.firstFrameView != null) {
                        PhotoViewer.this.firstFrameView.setTranslationX(PhotoViewer.this.videoTextureView.getTranslationX());
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.textureImageView, View.SCALE_X, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.textureImageView, View.SCALE_Y, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.textureImageView, View.TRANSLATION_X, PhotoViewer.this.pipPosition[0]));
                    arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.textureImageView, View.TRANSLATION_Y, PhotoViewer.this.pipPosition[1]));
                    arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.videoTextureView, View.SCALE_X, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.videoTextureView, View.SCALE_Y, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.videoTextureView, View.TRANSLATION_X, PhotoViewer.this.pipPosition[0] - PhotoViewer.this.aspectRatioFrameLayout.getX()));
                    arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.videoTextureView, View.TRANSLATION_Y, PhotoViewer.this.pipPosition[1] - PhotoViewer.this.aspectRatioFrameLayout.getY()));
                    arrayList.add(ObjectAnimator.ofInt(PhotoViewer.this.backgroundDrawable, (Property<BackgroundDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, 255));
                    if (PhotoViewer.this.firstFrameView != null) {
                        arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.firstFrameView, View.SCALE_X, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.firstFrameView, View.SCALE_Y, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.firstFrameView, View.TRANSLATION_X, PhotoViewer.this.pipPosition[0] - PhotoViewer.this.aspectRatioFrameLayout.getX()));
                        arrayList.add(ObjectAnimator.ofFloat(PhotoViewer.this.firstFrameView, View.TRANSLATION_Y, PhotoViewer.this.pipPosition[1] - PhotoViewer.this.aspectRatioFrameLayout.getY()));
                    }
                    float f = PipVideoOverlay.getPipRect(false, PhotoViewer.this.aspectRatioFrameLayout.getAspectRatio()).width;
                    PhotoViewer.this.videoTextureView.getWidth();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            PhotoViewer.AnonymousClass51.this.lambda$onSurfaceTextureUpdated$3(valueAnimator);
                        }
                    });
                    arrayList.add(ofFloat);
                    animatorSet.playTogether(arrayList);
                    DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
                    animatorSet.setInterpolator(decelerateInterpolator);
                    animatorSet.setDuration(250L);
                    animatorSet.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            PhotoViewer.this.pipAnimationInProgress = false;
                            if (PhotoViewer.this.videoTextureView != null) {
                                PhotoViewer.this.videoTextureView.setOutlineProvider(null);
                            }
                            if (PhotoViewer.this.textureImageView != null) {
                                PhotoViewer.this.textureImageView.setOutlineProvider(null);
                            }
                            if (PhotoViewer.this.firstFrameView != null) {
                                PhotoViewer.this.firstFrameView.setOutlineProvider(null);
                            }
                        }
                    });
                    animatorSet.start();
                    PhotoViewer.this.toggleActionBar(true, true, new ActionBarToggleParams().enableStatusBarAnimation(false).enableTranslationAnimation(false).animationDuration(250).animationInterpolator(decelerateInterpolator));
                } else {
                    PhotoViewer.this.toggleActionBar(true, false);
                }
                PhotoViewer.this.waitingForFirstTextureUpload = 0;
            }
            if (PhotoViewer.this.firstFrameView != null) {
                PhotoViewer.this.firstFrameView.checkFromPlayer(PhotoViewer.this.videoPlayer);
            }
        }

        public void lambda$onSurfaceTextureUpdated$3(ValueAnimator valueAnimator) {
            PhotoViewer.this.inlineOutAnimationProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (PhotoViewer.this.videoTextureView != null) {
                PhotoViewer.this.videoTextureView.invalidateOutline();
            }
            if (PhotoViewer.this.textureImageView != null) {
                PhotoViewer.this.textureImageView.invalidateOutline();
            }
            if (PhotoViewer.this.firstFrameView != null) {
                PhotoViewer.this.firstFrameView.invalidateOutline();
            }
        }
    }

    public void checkFullscreenButton() {
        float f;
        TextureView textureView;
        TextureView textureView2;
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
                MessageObject messageObject = this.imagesArr.get(i3);
                if (!messageObject.isVideo()) {
                    this.fullscreenButton[i2].setVisibility(4);
                } else {
                    int measuredWidth = (i2 != 0 || (textureView2 = this.videoTextureView) == null) ? 0 : textureView2.getMeasuredWidth();
                    int measuredHeight = (i2 != 0 || (textureView = this.videoTextureView) == null) ? 0 : textureView.getMeasuredHeight();
                    TLRPC$Document document = messageObject.getDocument();
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
                    Point point = AndroidUtilities.displaySize;
                    if (point.y > point.x && !(this.videoTextureView instanceof VideoEditTextureView) && measuredWidth > measuredHeight) {
                        if (this.fullscreenButton[i2].getVisibility() != 0) {
                            this.fullscreenButton[i2].setVisibility(0);
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
        if (this.videoTextureView == null) {
            AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(this.parentActivity) {
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
                        PhotoViewer.this.videoTextureView.setPivotX(0.0f);
                        PhotoViewer.this.firstFrameView.setPivotX(0.0f);
                    }
                    PhotoViewer.this.checkFullscreenButton();
                }
            };
            this.aspectRatioFrameLayout = aspectRatioFrameLayout;
            aspectRatioFrameLayout.setWillNotDraw(false);
            this.aspectRatioFrameLayout.setVisibility(4);
            this.containerView.addView(this.aspectRatioFrameLayout, 0, LayoutHelper.createFrame(-1, -1, 17));
            if (this.imagesArrLocals.isEmpty()) {
                this.videoTextureView = new TextureView(this.parentActivity);
            } else {
                VideoEditTextureView videoEditTextureView = new VideoEditTextureView(this.parentActivity, this.videoPlayer);
                if (savedFilterState != null) {
                    videoEditTextureView.setDelegate(new VideoEditTextureView.VideoEditTextureViewDelegate() {
                        @Override
                        public final void onEGLThreadAvailable(FilterGLThread filterGLThread) {
                            PhotoViewer.lambda$createVideoTextureView$49(MediaController.SavedFilterState.this, filterGLThread);
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
            this.videoTextureView.setPivotX(0.0f);
            this.videoTextureView.setPivotY(0.0f);
            this.videoTextureView.setOpaque(false);
            this.aspectRatioFrameLayout.addView(this.videoTextureView, LayoutHelper.createFrame(-1, -1, 17));
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
    }

    public static void lambda$createVideoTextureView$49(MediaController.SavedFilterState savedFilterState, FilterGLThread filterGLThread) {
        filterGLThread.setFilterGLThreadDelegate(FilterShaders.getFilterShadersDelegate(savedFilterState));
    }

    public void releasePlayer(boolean z) {
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
                this.parentActivity.getWindow().clearFlags(ConnectionsManager.RequestFlagNeedQuickAck);
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
            Animator animator = this.videoPlayerControlAnimator;
            if (animator != null) {
                animator.cancel();
            }
            this.videoPlayerControlVisible = z;
            float f = 1.0f;
            int i = 0;
            if (z2) {
                if (z) {
                    this.videoPlayerControlFrameLayout.setVisibility(0);
                } else {
                    this.dateTextView.setVisibility(0);
                    this.nameTextView.setVisibility(0);
                    if (this.allowShare) {
                        this.bottomButtonsLayout.setVisibility(0);
                    }
                }
                final boolean z3 = this.allowShare;
                float[] fArr = new float[2];
                fArr[0] = this.videoPlayerControlFrameLayout.getAlpha();
                if (!z) {
                    f = 0.0f;
                }
                fArr[1] = f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                ofFloat.setDuration(200L);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        PhotoViewer.this.lambda$setVideoPlayerControlVisible$50(z3, valueAnimator);
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator2) {
                        if (!z) {
                            PhotoViewer.this.videoPlayerControlFrameLayout.setVisibility(8);
                            return;
                        }
                        PhotoViewer.this.dateTextView.setVisibility(8);
                        PhotoViewer.this.nameTextView.setVisibility(8);
                        if (z3) {
                            PhotoViewer.this.bottomButtonsLayout.setVisibility(8);
                        }
                    }
                });
                this.videoPlayerControlAnimator = ofFloat;
                ofFloat.start();
            } else {
                this.videoPlayerControlFrameLayout.setVisibility(z ? 0 : 8);
                this.videoPlayerControlFrameLayout.setAlpha(z ? 1.0f : 0.0f);
                this.dateTextView.setVisibility(z ? 8 : 0);
                this.dateTextView.setAlpha(z ? 0.0f : 1.0f);
                this.nameTextView.setVisibility(z ? 8 : 0);
                this.nameTextView.setAlpha(z ? 0.0f : 1.0f);
                if (this.allowShare) {
                    LinearLayout linearLayout = this.bottomButtonsLayout;
                    if (z) {
                        i = 8;
                    }
                    linearLayout.setVisibility(i);
                    LinearLayout linearLayout2 = this.bottomButtonsLayout;
                    if (z) {
                        f = 0.0f;
                    }
                    linearLayout2.setAlpha(f);
                }
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

    public void lambda$setVideoPlayerControlVisible$50(boolean z, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.videoPlayerControlFrameLayout.setAlpha(floatValue);
        float f = 1.0f - floatValue;
        this.dateTextView.setAlpha(f);
        this.nameTextView.setAlpha(f);
        if (z) {
            this.bottomButtonsLayout.setAlpha(f);
        }
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
            this.captionEditText.setFieldText("");
        } else {
            this.captionEditText.setFieldText(charSequence);
        }
        this.captionEditText.setAllowTextEntitiesIntersection(supportsSendingNewEntities());
    }

    public void showAlertDialog(AlertDialog.Builder builder) {
        if (this.parentActivity != null) {
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
                        PhotoViewer.this.lambda$showAlertDialog$51(dialogInterface);
                    }
                });
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
    }

    public void lambda$showAlertDialog$51(DialogInterface dialogInterface) {
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
            width = (int) (f2 / max);
            height = (int) (height / max);
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
        createBitmap.compress(Bitmap.CompressFormat.JPEG, f == 512.0f ? 83 : 87, fileOutputStream);
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
                        long j3 = 0;
                        if (j2 > 0) {
                            j3 = j2 / 1000;
                        }
                        lottieAnimation.setProgressMs(j - j3);
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

    private int getAnimatedMediaEntitiesCount(boolean z) {
        ArrayList<VideoEditedInfo.MediaEntity> arrayList = this.editState.mediaEntities;
        if (arrayList == null) {
            return 0;
        }
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            VideoEditedInfo.MediaEntity mediaEntity = this.editState.mediaEntities.get(i2);
            if (mediaEntity.type == 0) {
                byte b = mediaEntity.subType;
                if ((b & 1) != 0 || (b & 4) != 0) {
                    i++;
                    if (z) {
                        break;
                    }
                }
            }
        }
        return i;
    }

    private boolean hasAnimatedMediaEntities() {
        return getAnimatedMediaEntitiesCount(true) != 0;
    }

    private Bitmap createCroppedBitmap(Bitmap bitmap, MediaController.CropState cropState, int[] iArr, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        Matrix matrix;
        try {
            int i5 = cropState.transformRotation;
            int i6 = 0;
            if (iArr != null) {
                i6 = iArr[0];
            }
            int i7 = (i5 + i6) % 360;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (!(i7 == 90 || i7 == 270)) {
                i2 = width;
                i = height;
                float f = i2;
                float f2 = i;
                Bitmap createBitmap = Bitmap.createBitmap((int) (cropState.cropPw * f), (int) (cropState.cropPh * f2), Bitmap.Config.ARGB_8888);
                matrix = new Matrix();
                matrix.postTranslate((-width) / 2, (-height) / 2);
                if (z && cropState.mirrored) {
                    if (!(i7 == 90 || i7 == 270)) {
                        matrix.postScale(-1.0f, 1.0f);
                    }
                    matrix.postScale(1.0f, -1.0f);
                }
                matrix.postRotate(cropState.cropRotate + i7);
                matrix.postTranslate(cropState.cropPx * f, cropState.cropPy * f2);
                float f3 = cropState.cropScale;
                matrix.postScale(f3, f3);
                matrix.postTranslate(i3 / 2, i4 / 2);
                new Canvas(createBitmap).drawBitmap(bitmap, matrix, new Paint(2));
                return createBitmap;
            }
            i = width;
            i2 = height;
            float f4 = i2;
            float f22 = i;
            Bitmap createBitmap2 = Bitmap.createBitmap((int) (cropState.cropPw * f4), (int) (cropState.cropPh * f22), Bitmap.Config.ARGB_8888);
            matrix = new Matrix();
            matrix.postTranslate((-width) / 2, (-height) / 2);
            if (z) {
                if (i7 == 90) {
                    matrix.postScale(-1.0f, 1.0f);
                }
                matrix.postScale(1.0f, -1.0f);
            }
            matrix.postRotate(cropState.cropRotate + i7);
            matrix.postTranslate(cropState.cropPx * f4, cropState.cropPy * f22);
            float f32 = cropState.cropScale;
            matrix.postScale(f32, f32);
            matrix.postTranslate(i3 / 2, i4 / 2);
            new Canvas(createBitmap2).drawBitmap(bitmap, matrix, new Paint(2));
            return createBitmap2;
        } catch (Throwable th) {
            FileLog.e(th);
            return null;
        }
    }

    private void applyCurrentEditMode() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.applyCurrentEditMode():void");
    }

    private void setPhotoChecked() {
        ChatActivity chatActivity;
        TLRPC$Chat currentChat;
        PhotoViewerProvider photoViewerProvider = this.placeProvider;
        if (photoViewerProvider == null) {
            return;
        }
        if (photoViewerProvider.getSelectedPhotos() == null || this.maxSelectedPhotos <= 0 || this.placeProvider.getSelectedPhotos().size() < this.maxSelectedPhotos || this.placeProvider.isPhotoChecked(this.currentIndex)) {
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
        } else if (this.allowOrder && (chatActivity = this.parentChatActivity) != null && (currentChat = chatActivity.getCurrentChat()) != null && !ChatObject.hasAdminRights(currentChat) && currentChat.slowmode_enabled) {
            AlertsCreator.createSimpleAlert(this.parentActivity, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSelectSendError", R.string.SlowmodeSelectSendError)).show();
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
                    PhotoViewer.this.lambda$updateResetButtonVisibility$52(z);
                }
            });
        }
    }

    public void lambda$updateResetButtonVisibility$52(boolean z) {
        if (!z) {
            this.resetButton.setVisibility(8);
        }
    }

    private void createCropView() {
        if (this.photoCropView == null) {
            PhotoCropView photoCropView = new PhotoCropView(this.activityContext, this.resourcesProvider);
            this.photoCropView = photoCropView;
            photoCropView.setVisibility(8);
            this.photoCropView.onDisappear();
            this.containerView.addView(this.photoCropView, this.containerView.indexOfChild(this.videoTimelineView) - 1, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
            this.photoCropView.setDelegate(new AnonymousClass54());
        }
    }

    public class AnonymousClass54 implements PhotoCropView.PhotoCropViewDelegate {
        AnonymousClass54() {
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
            if (PhotoViewer.this.videoPlayer != null) {
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
        if (this.isCurrentVideo && (videoPlayer = this.videoPlayer) != null && !videoPlayer.isPlaying()) {
            if (!this.muteVideo || this.sendPhotoType == 1) {
                this.videoPlayer.setVolume(0.0f);
            }
            this.manuallyPaused = false;
            toggleVideoPlayer();
        }
    }

    private void detectFaces() {
        if (this.centerImage.getAnimation() == null && !this.imagesArrLocals.isEmpty() && this.sendPhotoType != 1) {
            String imageKey = this.centerImage.getImageKey();
            String str = this.currentImageFaceKey;
            if (str == null || !str.equals(imageKey)) {
                this.currentImageHasFace = 0;
                detectFaces(imageKey, this.centerImage.getBitmapSafe(), this.centerImage.getOrientation());
            }
        }
    }

    private void detectFaces(final String str, final ImageReceiver.BitmapHolder bitmapHolder, final int i) {
        if (str != null && bitmapHolder != null && bitmapHolder.bitmap != null) {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.this.lambda$detectFaces$55(bitmapHolder, i, str);
                }
            });
        }
    }

    public void lambda$detectFaces$55(final ImageReceiver.BitmapHolder bitmapHolder, int i, final String str) {
        FaceDetector faceDetector = null;
        try {
            try {
                final boolean z = false;
                faceDetector = new FaceDetector.Builder(ApplicationLoader.applicationContext).setMode(0).setLandmarkType(0).setTrackingEnabled(false).build();
                if (faceDetector.isOperational()) {
                    SparseArray<Face> detect = faceDetector.detect(new Frame.Builder().setBitmap(bitmapHolder.bitmap).setRotation(i).build());
                    if (!(detect == null || detect.size() == 0)) {
                        z = true;
                    }
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PhotoViewer.this.lambda$detectFaces$53(str, z);
                        }
                    });
                } else {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("face detection is not operational");
                    }
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PhotoViewer.this.lambda$detectFaces$54(bitmapHolder, str);
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

    public void lambda$detectFaces$53(String str, boolean z) {
        if (str.equals(this.centerImage.getImageKey())) {
            this.currentImageHasFace = z ? 1 : 0;
            this.currentImageFaceKey = str;
        }
    }

    public void lambda$detectFaces$54(ImageReceiver.BitmapHolder bitmapHolder, String str) {
        bitmapHolder.release();
        if (str.equals(this.centerImage.getImageKey())) {
            this.currentImageHasFace = 2;
            this.currentImageFaceKey = str;
        }
    }

    private void switchToEditMode(final int i) {
        ActionBar actionBar;
        int i2;
        ActionBar actionBar2;
        int i3;
        MediaController.SavedFilterState savedFilterState;
        int i4;
        String str;
        Bitmap bitmap;
        Bitmap bitmap2;
        int i5;
        MediaController.CropState cropState;
        int i6;
        ActionBar actionBar3;
        int i7;
        int i8;
        float f;
        float f2;
        int i9;
        MediaController.CropState cropState2;
        int i10;
        int i11;
        if (this.currentEditMode == i) {
            return;
        }
        if ((!this.isCurrentVideo || this.photoProgressViews[0].backgroundState == 3 || this.isCurrentVideo || (this.centerImage.getBitmap() != null && this.photoProgressViews[0].backgroundState == -1)) && this.changeModeAnimation == null && this.imageMoveAnimation == null && this.captionEditText.getTag() == null) {
            this.windowView.setClipChildren(i == 2);
            int i12 = 2130706432;
            int color = this.navigationBar.getBackground() instanceof ColorDrawable ? ((ColorDrawable) this.navigationBar.getBackground()).getColor() : 2130706432;
            if (i == 1) {
                i12 = -872415232;
            } else if (i == 3) {
                i12 = -16777216;
            }
            this.navigationBar.setVisibility(i != 2 ? 0 : 4);
            this.switchingToMode = i;
            if (i == 0) {
                if (this.centerImage.getBitmap() != null) {
                    int bitmapWidth = this.centerImage.getBitmapWidth();
                    int bitmapHeight = this.centerImage.getBitmapHeight();
                    int i13 = this.currentEditMode;
                    if (i13 != 3) {
                        if (i13 != 1 && (cropState2 = this.editState.cropState) != null && ((i10 = cropState2.transformRotation) == 90 || i10 == 270)) {
                            float f3 = bitmapHeight;
                            float containerViewWidth = getContainerViewWidth() / f3;
                            float f4 = bitmapWidth;
                            if (containerViewWidth * f4 > getContainerViewHeight()) {
                                containerViewWidth = getContainerViewHeight() / f4;
                            }
                            this.scale = 1.0f / (containerViewWidth / Math.min(getContainerViewWidth() / f4, getContainerViewHeight() / f3));
                        } else if (this.sendPhotoType == 1 && (this.cropTransform.getOrientation() == 90 || this.cropTransform.getOrientation() == 270)) {
                            float f5 = bitmapHeight;
                            float containerViewWidth2 = getContainerViewWidth() / f5;
                            float f6 = bitmapWidth;
                            if (containerViewWidth2 * f6 > getContainerViewHeight()) {
                                containerViewWidth2 = getContainerViewHeight() / f6;
                            }
                            this.scale = 1.0f / ((((this.cropTransform.getScale() / this.cropTransform.getTrueCropScale()) * containerViewWidth2) / Math.min(getContainerViewWidth() / f6, getContainerViewHeight() / f5)) / this.cropTransform.getMinScale());
                        }
                        MediaController.CropState cropState3 = this.editState.cropState;
                        if (cropState3 != null) {
                            int i14 = cropState3.transformRotation;
                            if (i14 == 90 || i14 == 270) {
                                bitmapHeight = bitmapWidth;
                                bitmapWidth = bitmapHeight;
                            }
                            bitmapWidth = (int) (bitmapWidth * cropState3.cropPw);
                            i9 = (int) (bitmapHeight * cropState3.cropPh);
                        } else if (this.sendPhotoType == 1 && (this.cropTransform.getOrientation() == 90 || this.cropTransform.getOrientation() == 270)) {
                            i9 = bitmapWidth;
                            bitmapWidth = bitmapHeight;
                        } else {
                            i9 = bitmapHeight;
                        }
                        float f7 = bitmapWidth;
                        float f8 = i9;
                        f2 = Math.min(getContainerViewWidth() / f7, getContainerViewHeight() / f8);
                        if (this.sendPhotoType == 1) {
                            f = getCropFillScale(this.cropTransform.getOrientation() == 90 || this.cropTransform.getOrientation() == 270);
                        } else {
                            f = Math.min(getContainerViewWidth(0) / f7, getContainerViewHeight(0) / f8);
                        }
                    } else if (this.sendPhotoType == 1) {
                        if (this.cropTransform.getOrientation() == 90 || this.cropTransform.getOrientation() == 270) {
                            i11 = bitmapWidth;
                            bitmapWidth = bitmapHeight;
                            float f9 = bitmapWidth;
                            float f10 = i11;
                            f = Math.min(getContainerViewWidth(0) / f9, getContainerViewHeight(0) / f10);
                            f2 = Math.min(getContainerViewWidth(3) / f9, getContainerViewHeight(3) / f10);
                        }
                        i11 = bitmapHeight;
                        float f92 = bitmapWidth;
                        float f102 = i11;
                        f = Math.min(getContainerViewWidth(0) / f92, getContainerViewHeight(0) / f102);
                        f2 = Math.min(getContainerViewWidth(3) / f92, getContainerViewHeight(3) / f102);
                    } else {
                        MediaController.CropState cropState4 = this.editState.cropState;
                        if (cropState4 != null) {
                            int i15 = cropState4.transformRotation;
                            if (i15 == 90 || i15 == 270) {
                                bitmapHeight = bitmapWidth;
                                bitmapWidth = bitmapHeight;
                            }
                            bitmapWidth = (int) (bitmapWidth * cropState4.cropPw);
                            i11 = (int) (bitmapHeight * cropState4.cropPh);
                            float f922 = bitmapWidth;
                            float f1022 = i11;
                            f = Math.min(getContainerViewWidth(0) / f922, getContainerViewHeight(0) / f1022);
                            f2 = Math.min(getContainerViewWidth(3) / f922, getContainerViewHeight(3) / f1022);
                        }
                        i11 = bitmapHeight;
                        float f9222 = bitmapWidth;
                        float f10222 = i11;
                        f = Math.min(getContainerViewWidth(0) / f9222, getContainerViewHeight(0) / f10222);
                        f2 = Math.min(getContainerViewWidth(3) / f9222, getContainerViewHeight(3) / f10222);
                    }
                    this.animateToScale = f / f2;
                    this.animateToX = 0.0f;
                    this.translationX = (getLeftInset() / 2) - (getRightInset() / 2);
                    if (this.sendPhotoType == 1) {
                        int i16 = this.currentEditMode;
                        if (i16 == 2) {
                            this.animateToY = AndroidUtilities.dp(36.0f);
                        } else if (i16 == 3) {
                            this.animateToY = -AndroidUtilities.dp(12.0f);
                        }
                    } else {
                        int i17 = this.currentEditMode;
                        if (i17 == 1) {
                            this.animateToY = AndroidUtilities.dp(56.0f);
                        } else if (i17 == 2) {
                            this.animateToY = AndroidUtilities.dp(93.0f);
                        } else if (i17 == 3) {
                            this.animateToY = AndroidUtilities.dp(44.0f);
                        }
                        if (isStatusBarVisible()) {
                            this.animateToY -= AndroidUtilities.statusBarHeight / 2;
                        }
                    }
                    this.animationStartTime = System.currentTimeMillis();
                    this.zoomAnimation = true;
                }
                this.padImageForHorizontalInsets = false;
                this.imageMoveAnimation = new AnimatorSet();
                ArrayList arrayList = new ArrayList(4);
                int i18 = this.currentEditMode;
                if (i18 == 1) {
                    arrayList.add(ObjectAnimator.ofFloat(this.editorDoneLayout, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f)));
                    i8 = 2;
                    arrayList.add(ObjectAnimator.ofFloat(this, AnimationProperties.PHOTO_VIEWER_ANIMATION_VALUE, 0.0f, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.photoCropView, View.ALPHA, 0.0f));
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            PhotoViewer.this.lambda$switchToEditMode$56(valueAnimator);
                        }
                    });
                    arrayList.add(ofFloat);
                } else {
                    if (i18 == 2) {
                        this.photoFilterView.shutdown();
                        arrayList.add(ObjectAnimator.ofFloat(this.photoFilterView.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f)));
                        arrayList.add(ObjectAnimator.ofFloat(this.photoFilterView.getCurveControl(), View.ALPHA, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.photoFilterView.getBlurControl(), View.ALPHA, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this, AnimationProperties.PHOTO_VIEWER_ANIMATION_VALUE, 0.0f, 1.0f));
                    } else if (i18 == 3) {
                        this.paintingOverlay.showAll();
                        this.containerView.invalidate();
                        this.photoPaintView.shutdown();
                        arrayList.add(ObjectAnimator.ofFloat(this.photoPaintView.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(126.0f)));
                        arrayList.add(ObjectAnimator.ofFloat(this.photoPaintView.getColorPickerBackground(), View.TRANSLATION_Y, AndroidUtilities.dp(126.0f)));
                        arrayList.add(ObjectAnimator.ofFloat(this.photoPaintView.getColorPicker(), View.TRANSLATION_Y, AndroidUtilities.dp(126.0f)));
                        i8 = 2;
                        arrayList.add(ObjectAnimator.ofFloat(this, AnimationProperties.PHOTO_VIEWER_ANIMATION_VALUE, 0.0f, 1.0f));
                    }
                    i8 = 2;
                }
                View view = this.navigationBar;
                ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                Object[] objArr = new Object[i8];
                objArr[0] = Integer.valueOf(color);
                objArr[1] = Integer.valueOf(i12);
                arrayList.add(ObjectAnimator.ofObject(view, "backgroundColor", argbEvaluator, objArr));
                this.imageMoveAnimation.playTogether(arrayList);
                this.imageMoveAnimation.setDuration(200L);
                this.imageMoveAnimation.addListener(new AnimatorListenerAdapter() {
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
                            try {
                                PhotoViewer.this.containerView.removeView(PhotoViewer.this.photoPaintView);
                            } catch (Exception e2) {
                                FileLog.e(e2);
                            }
                            PhotoViewer.this.photoPaintView = null;
                        }
                        PhotoViewer.this.imageMoveAnimation = null;
                        PhotoViewer.this.currentEditMode = i;
                        PhotoViewer.this.switchingToMode = -1;
                        PhotoViewer.this.applying = false;
                        if (PhotoViewer.this.sendPhotoType == 1) {
                            PhotoViewer.this.photoCropView.setVisibility(0);
                        }
                        PhotoViewer.this.animateToScale = 1.0f;
                        PhotoViewer.this.animateToX = 0.0f;
                        PhotoViewer.this.animateToY = 0.0f;
                        PhotoViewer.this.scale = 1.0f;
                        PhotoViewer photoViewer = PhotoViewer.this;
                        photoViewer.updateMinMax(photoViewer.scale);
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
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(ObjectAnimator.ofFloat(PhotoViewer.this.pickerView, View.TRANSLATION_Y, 0.0f));
                        arrayList2.add(ObjectAnimator.ofFloat(PhotoViewer.this.pickerViewSendButton, View.TRANSLATION_Y, 0.0f));
                        if (PhotoViewer.this.sendPhotoType != 1) {
                            arrayList2.add(ObjectAnimator.ofFloat(PhotoViewer.this.actionBar, View.TRANSLATION_Y, 0.0f));
                        }
                        if (PhotoViewer.this.needCaptionLayout) {
                            arrayList2.add(ObjectAnimator.ofFloat(PhotoViewer.this.captionTextViewSwitcher, View.TRANSLATION_Y, 0.0f));
                        }
                        if (PhotoViewer.this.sendPhotoType == 0 || PhotoViewer.this.sendPhotoType == 4) {
                            arrayList2.add(ObjectAnimator.ofFloat(PhotoViewer.this.checkImageView, View.ALPHA, 1.0f));
                            arrayList2.add(ObjectAnimator.ofFloat(PhotoViewer.this.photosCounterView, View.ALPHA, 1.0f));
                        } else if (PhotoViewer.this.sendPhotoType == 1) {
                            arrayList2.add(ObjectAnimator.ofFloat(PhotoViewer.this.photoCropView, View.ALPHA, 1.0f));
                        }
                        if (PhotoViewer.this.cameraItem.getTag() != null) {
                            PhotoViewer.this.cameraItem.setVisibility(0);
                            arrayList2.add(ObjectAnimator.ofFloat(PhotoViewer.this.cameraItem, View.ALPHA, 1.0f));
                        }
                        if (PhotoViewer.this.muteItem.getTag() != null) {
                            PhotoViewer.this.muteItem.setVisibility(0);
                            arrayList2.add(ObjectAnimator.ofFloat(PhotoViewer.this.muteItem, View.ALPHA, 1.0f));
                        }
                        if (PhotoViewer.this.navigationBar != null) {
                            PhotoViewer.this.navigationBar.setVisibility(0);
                            arrayList2.add(ObjectAnimator.ofFloat(PhotoViewer.this.navigationBar, View.ALPHA, 1.0f));
                        }
                        animatorSet.playTogether(arrayList2);
                        animatorSet.setDuration(200L);
                        animatorSet.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationStart(Animator animator2) {
                                PhotoViewer.this.pickerView.setVisibility(0);
                                PhotoViewer.this.pickerViewSendButton.setVisibility(0);
                                PhotoViewer.this.actionBar.setVisibility(0);
                                if (PhotoViewer.this.needCaptionLayout) {
                                    PhotoViewer.this.captionTextViewSwitcher.setVisibility(PhotoViewer.this.captionTextViewSwitcher.getTag() != null ? 0 : 4);
                                }
                                if (PhotoViewer.this.sendPhotoType == 0 || PhotoViewer.this.sendPhotoType == 4 || ((PhotoViewer.this.sendPhotoType == 2 || PhotoViewer.this.sendPhotoType == 5) && PhotoViewer.this.imagesArrLocals.size() > 1)) {
                                    PhotoViewer.this.checkImageView.setVisibility(0);
                                    PhotoViewer.this.photosCounterView.setVisibility(0);
                                }
                            }
                        });
                        animatorSet.start();
                    }
                });
                this.imageMoveAnimation.start();
                return;
            }
            float f11 = 154.0f;
            if (i == 1) {
                startVideoPlayer();
                createCropView();
                this.previousHasTransform = this.cropTransform.hasViewTransform();
                this.previousCropPx = this.cropTransform.getCropPx();
                this.previousCropPy = this.cropTransform.getCropPy();
                this.previousCropScale = this.cropTransform.getScale();
                this.previousCropRotation = this.cropTransform.getRotation();
                this.previousCropOrientation = this.cropTransform.getOrientation();
                this.previousCropPw = this.cropTransform.getCropPw();
                this.previousCropPh = this.cropTransform.getCropPh();
                this.previousCropMirrored = this.cropTransform.isMirrored();
                this.photoCropView.onAppear();
                this.editorDoneLayout.doneButton.setText(LocaleController.getString("Crop", R.string.Crop));
                this.editorDoneLayout.doneButton.setTextColor(getThemedColor("dialogFloatingButton"));
                this.changeModeAnimation = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                FrameLayout frameLayout = this.pickerView;
                Property property = View.TRANSLATION_Y;
                float[] fArr = new float[2];
                fArr[0] = 0.0f;
                fArr[1] = AndroidUtilities.dp(this.isCurrentVideo ? 154.0f : 96.0f);
                arrayList2.add(ObjectAnimator.ofFloat(frameLayout, property, fArr));
                ImageView imageView = this.pickerViewSendButton;
                Property property2 = View.TRANSLATION_Y;
                float[] fArr2 = new float[2];
                fArr2[0] = 0.0f;
                fArr2[1] = AndroidUtilities.dp(this.isCurrentVideo ? 154.0f : 96.0f);
                arrayList2.add(ObjectAnimator.ofFloat(imageView, property2, fArr2));
                arrayList2.add(ObjectAnimator.ofFloat(this.actionBar, View.TRANSLATION_Y, 0.0f, -actionBar3.getHeight()));
                arrayList2.add(ObjectAnimator.ofObject(this.navigationBar, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(i12)));
                if (this.needCaptionLayout) {
                    CaptionTextViewSwitcher captionTextViewSwitcher = this.captionTextViewSwitcher;
                    Property property3 = View.TRANSLATION_Y;
                    float[] fArr3 = new float[2];
                    fArr3[0] = 0.0f;
                    if (!this.isCurrentVideo) {
                        f11 = 96.0f;
                    }
                    fArr3[1] = AndroidUtilities.dp(f11);
                    arrayList2.add(ObjectAnimator.ofFloat(captionTextViewSwitcher, property3, fArr3));
                }
                int i19 = this.sendPhotoType;
                if (i19 == 0 || i19 == 4) {
                    i7 = 2;
                    arrayList2.add(ObjectAnimator.ofFloat(this.checkImageView, View.ALPHA, 1.0f, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(this.photosCounterView, View.ALPHA, 1.0f, 0.0f));
                } else {
                    i7 = 2;
                }
                if (this.selectedPhotosListView.getVisibility() == 0) {
                    float[] fArr4 = new float[i7];
                    
                    fArr4[0] = 1.0f;
                    fArr4[1] = 0.0f;
                    arrayList2.add(ObjectAnimator.ofFloat(this.selectedPhotosListView, View.ALPHA, fArr4));
                }
                if (this.cameraItem.getTag() != null) {
                    float[] fArr5 = new float[i7];
                    
                    fArr5[0] = 1.0f;
                    fArr5[1] = 0.0f;
                    arrayList2.add(ObjectAnimator.ofFloat(this.cameraItem, View.ALPHA, fArr5));
                }
                if (this.muteItem.getTag() != null) {
                    float[] fArr6 = new float[i7];
                    
                    fArr6[0] = 1.0f;
                    fArr6[1] = 0.0f;
                    arrayList2.add(ObjectAnimator.ofFloat(this.muteItem, View.ALPHA, fArr6));
                }
                View view2 = this.navigationBar;
                if (view2 != null) {
                    arrayList2.add(ObjectAnimator.ofFloat(view2, View.ALPHA, 1.0f));
                }
                this.changeModeAnimation.playTogether(arrayList2);
                this.changeModeAnimation.setDuration(200L);
                this.changeModeAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PhotoViewer photoViewer;
                        VideoEditTextureView videoEditTextureView = null;
                        PhotoViewer.this.changeModeAnimation = null;
                        PhotoViewer.this.pickerView.setVisibility(8);
                        PhotoViewer.this.pickerViewSendButton.setVisibility(8);
                        PhotoViewer.this.cameraItem.setVisibility(8);
                        PhotoViewer.this.muteItem.setVisibility(8);
                        PhotoViewer.this.selectedPhotosListView.setVisibility(8);
                        PhotoViewer.this.selectedPhotosListView.setAlpha(0.0f);
                        PhotoViewer.this.selectedPhotosListView.setTranslationY(-AndroidUtilities.dp(10.0f));
                        PhotoViewer.this.photosCounterView.setRotationX(0.0f);
                        PhotoViewer.this.selectedPhotosListView.setEnabled(false);
                        PhotoViewer.this.isPhotosListViewVisible = false;
                        if (PhotoViewer.this.needCaptionLayout) {
                            PhotoViewer.this.captionTextViewSwitcher.setVisibility(4);
                        }
                        if (PhotoViewer.this.sendPhotoType == 0 || PhotoViewer.this.sendPhotoType == 4 || ((PhotoViewer.this.sendPhotoType == 2 || PhotoViewer.this.sendPhotoType == 5) && PhotoViewer.this.imagesArrLocals.size() > 1)) {
                            PhotoViewer.this.checkImageView.setVisibility(8);
                            PhotoViewer.this.photosCounterView.setVisibility(8);
                        }
                        Bitmap bitmap3 = PhotoViewer.this.centerImage.getBitmap();
                        if (bitmap3 != null || PhotoViewer.this.isCurrentVideo) {
                            PhotoCropView photoCropView = PhotoViewer.this.photoCropView;
                            int orientation = PhotoViewer.this.centerImage.getOrientation();
                            boolean z = PhotoViewer.this.sendPhotoType != 1;
                            PaintingOverlay paintingOverlay = PhotoViewer.this.paintingOverlay;
                            CropTransform cropTransform = PhotoViewer.this.cropTransform;
                            if (PhotoViewer.this.isCurrentVideo) {
                                videoEditTextureView = (VideoEditTextureView) PhotoViewer.this.videoTextureView;
                            }
                            photoCropView.setBitmap(bitmap3, orientation, z, false, paintingOverlay, cropTransform, videoEditTextureView, PhotoViewer.this.editState.cropState);
                            PhotoViewer.this.photoCropView.onDisappear();
                            int bitmapWidth2 = PhotoViewer.this.centerImage.getBitmapWidth();
                            int bitmapHeight2 = PhotoViewer.this.centerImage.getBitmapHeight();
                            if (PhotoViewer.this.editState.cropState != null) {
                                if (PhotoViewer.this.editState.cropState.transformRotation == 90 || PhotoViewer.this.editState.cropState.transformRotation == 270) {
                                    bitmapHeight2 = bitmapWidth2;
                                    bitmapWidth2 = bitmapHeight2;
                                }
                                bitmapWidth2 = (int) (bitmapWidth2 * PhotoViewer.this.editState.cropState.cropPw);
                                bitmapHeight2 = (int) (bitmapHeight2 * PhotoViewer.this.editState.cropState.cropPh);
                            }
                            float f12 = bitmapWidth2;
                            float f13 = bitmapHeight2;
                            float min = Math.min(PhotoViewer.this.getContainerViewWidth() / f12, PhotoViewer.this.getContainerViewHeight() / f13);
                            float min2 = Math.min(PhotoViewer.this.getContainerViewWidth(1) / f12, PhotoViewer.this.getContainerViewHeight(1) / f13);
                            if (PhotoViewer.this.sendPhotoType == 1) {
                                float min3 = Math.min(PhotoViewer.this.getContainerViewWidth(1), PhotoViewer.this.getContainerViewHeight(1));
                                min2 = Math.max(min3 / f12, min3 / f13);
                            }
                            PhotoViewer.this.animateToScale = min2 / min;
                            PhotoViewer.this.animateToX = (photoViewer.getLeftInset() / 2) - (PhotoViewer.this.getRightInset() / 2);
                            PhotoViewer.this.animateToY = (-AndroidUtilities.dp(56.0f)) + (PhotoViewer.this.isStatusBarVisible() ? AndroidUtilities.statusBarHeight / 2 : 0);
                            PhotoViewer.this.animationStartTime = System.currentTimeMillis();
                            PhotoViewer.this.zoomAnimation = true;
                        }
                        PhotoViewer.this.imageMoveAnimation = new AnimatorSet();
                        PhotoViewer.this.imageMoveAnimation.playTogether(ObjectAnimator.ofFloat(PhotoViewer.this.editorDoneLayout, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f), 0.0f), ObjectAnimator.ofFloat(PhotoViewer.this, AnimationProperties.PHOTO_VIEWER_ANIMATION_VALUE, 0.0f, 1.0f), ObjectAnimator.ofFloat(PhotoViewer.this.photoCropView, View.ALPHA, 0.0f, 1.0f));
                        PhotoViewer.this.imageMoveAnimation.setDuration(200L);
                        PhotoViewer.this.imageMoveAnimation.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationStart(Animator animator2) {
                                PhotoViewer.this.editorDoneLayout.setVisibility(0);
                                PhotoViewer.this.photoCropView.setVisibility(0);
                            }

                            @Override
                            public void onAnimationEnd(Animator animator2) {
                                PhotoViewer.this.photoCropView.onAppeared();
                                PhotoViewer.this.photoCropView.onShow();
                                PhotoViewer.this.imageMoveAnimation = null;
                                AnonymousClass56 r3 = AnonymousClass56.this;
                                PhotoViewer.this.currentEditMode = i;
                                PhotoViewer.this.switchingToMode = -1;
                                PhotoViewer.this.animateToScale = 1.0f;
                                PhotoViewer.this.animateToX = 0.0f;
                                PhotoViewer.this.animateToY = 0.0f;
                                PhotoViewer.this.scale = 1.0f;
                                PhotoViewer photoViewer2 = PhotoViewer.this;
                                photoViewer2.updateMinMax(photoViewer2.scale);
                                PhotoViewer.this.padImageForHorizontalInsets = true;
                                PhotoViewer.this.containerView.invalidate();
                            }
                        });
                        PhotoViewer.this.imageMoveAnimation.start();
                    }
                });
                this.changeModeAnimation.start();
            } else if (i == 2) {
                startVideoPlayer();
                if (this.photoFilterView == null) {
                    PaintingOverlay paintingOverlay = null;
                    if (!this.imagesArrLocals.isEmpty()) {
                        Object obj = this.imagesArrLocals.get(this.currentIndex);
                        i4 = obj instanceof MediaController.PhotoEntry ? ((MediaController.PhotoEntry) obj).orientation : 0;
                        MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) obj;
                        MediaController.SavedFilterState savedFilterState2 = mediaEditState.savedFilterState;
                        str = mediaEditState.getPath();
                        savedFilterState = savedFilterState2;
                    } else {
                        str = null;
                        savedFilterState = null;
                        i4 = 0;
                    }
                    if (this.videoTextureView != null) {
                        bitmap2 = null;
                    } else {
                        if (savedFilterState == null) {
                            bitmap = this.centerImage.getBitmap();
                            i4 = this.centerImage.getOrientation();
                        } else {
                            bitmap = BitmapFactory.decodeFile(str);
                        }
                        bitmap2 = bitmap;
                    }
                    int i20 = i4;
                    if (this.sendPhotoType == 1) {
                        i5 = 1;
                    } else if (this.isCurrentVideo || (i6 = this.currentImageHasFace) == 2) {
                        i5 = 2;
                    } else {
                        i5 = i6 == 1 ? 1 : 0;
                    }
                    Activity activity = this.parentActivity;
                    TextureView textureView = this.videoTextureView;
                    VideoEditTextureView videoEditTextureView = textureView != null ? (VideoEditTextureView) textureView : null;
                    if (!this.isCurrentVideo) {
                        paintingOverlay = this.paintingOverlay;
                    }
                    PhotoFilterView photoFilterView = new PhotoFilterView(activity, videoEditTextureView, bitmap2, i20, savedFilterState, paintingOverlay, i5, textureView == null && (((cropState = this.editState.cropState) != null && cropState.mirrored) || this.cropTransform.isMirrored()), this.resourcesProvider);
                    this.photoFilterView = photoFilterView;
                    this.containerView.addView(photoFilterView, LayoutHelper.createFrame(-1, -1.0f));
                    this.photoFilterView.getDoneTextView().setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view3) {
                            PhotoViewer.this.lambda$switchToEditMode$57(view3);
                        }
                    });
                    this.photoFilterView.getCancelTextView().setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view3) {
                            PhotoViewer.this.lambda$switchToEditMode$59(view3);
                        }
                    });
                    this.photoFilterView.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
                }
                this.changeModeAnimation = new AnimatorSet();
                ArrayList arrayList3 = new ArrayList();
                FrameLayout frameLayout2 = this.pickerView;
                Property property4 = View.TRANSLATION_Y;
                float[] fArr7 = new float[2];
                fArr7[0] = 0.0f;
                fArr7[1] = AndroidUtilities.dp(this.isCurrentVideo ? 154.0f : 96.0f);
                arrayList3.add(ObjectAnimator.ofFloat(frameLayout2, property4, fArr7));
                ImageView imageView2 = this.pickerViewSendButton;
                Property property5 = View.TRANSLATION_Y;
                float[] fArr8 = new float[2];
                fArr8[0] = 0.0f;
                if (!this.isCurrentVideo) {
                    f11 = 96.0f;
                }
                fArr8[1] = AndroidUtilities.dp(f11);
                arrayList3.add(ObjectAnimator.ofFloat(imageView2, property5, fArr8));
                arrayList3.add(ObjectAnimator.ofFloat(this.actionBar, View.TRANSLATION_Y, 0.0f, -actionBar2.getHeight()));
                int i21 = this.sendPhotoType;
                if (i21 == 0 || i21 == 4) {
                    i3 = 2;
                    arrayList3.add(ObjectAnimator.ofFloat(this.checkImageView, View.ALPHA, 1.0f, 0.0f));
                    arrayList3.add(ObjectAnimator.ofFloat(this.photosCounterView, View.ALPHA, 1.0f, 0.0f));
                } else if (i21 == 1) {
                    i3 = 2;
                    arrayList3.add(ObjectAnimator.ofFloat(this.photoCropView, View.ALPHA, 1.0f, 0.0f));
                } else {
                    i3 = 2;
                }
                if (this.selectedPhotosListView.getVisibility() == 0) {
                    float[] fArr9 = new float[i3];
                    
                    fArr9[0] = 1.0f;
                    fArr9[1] = 0.0f;
                    arrayList3.add(ObjectAnimator.ofFloat(this.selectedPhotosListView, View.ALPHA, fArr9));
                }
                if (this.cameraItem.getTag() != null) {
                    float[] fArr10 = new float[i3];
                    
                    fArr10[0] = 1.0f;
                    fArr10[1] = 0.0f;
                    arrayList3.add(ObjectAnimator.ofFloat(this.cameraItem, View.ALPHA, fArr10));
                }
                if (this.muteItem.getTag() != null) {
                    float[] fArr11 = new float[i3];
                    
                    fArr11[0] = 1.0f;
                    fArr11[1] = 0.0f;
                    arrayList3.add(ObjectAnimator.ofFloat(this.muteItem, View.ALPHA, fArr11));
                }
                View view3 = this.navigationBar;
                ArgbEvaluator argbEvaluator2 = new ArgbEvaluator();
                Object[] objArr2 = new Object[i3];
                objArr2[0] = Integer.valueOf(color);
                objArr2[1] = Integer.valueOf(i12);
                arrayList3.add(ObjectAnimator.ofObject(view3, "backgroundColor", argbEvaluator2, objArr2));
                this.changeModeAnimation.playTogether(arrayList3);
                this.changeModeAnimation.setDuration(200L);
                this.changeModeAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        float f12;
                        PhotoViewer photoViewer;
                        PhotoViewer.this.changeModeAnimation = null;
                        PhotoViewer.this.pickerView.setVisibility(8);
                        PhotoViewer.this.pickerViewSendButton.setVisibility(8);
                        PhotoViewer.this.actionBar.setVisibility(8);
                        PhotoViewer.this.cameraItem.setVisibility(8);
                        PhotoViewer.this.muteItem.setVisibility(8);
                        if (PhotoViewer.this.photoCropView != null) {
                            PhotoViewer.this.photoCropView.setVisibility(4);
                        }
                        PhotoViewer.this.selectedPhotosListView.setVisibility(8);
                        PhotoViewer.this.selectedPhotosListView.setAlpha(0.0f);
                        PhotoViewer.this.selectedPhotosListView.setTranslationY(-AndroidUtilities.dp(10.0f));
                        PhotoViewer.this.photosCounterView.setRotationX(0.0f);
                        PhotoViewer.this.selectedPhotosListView.setEnabled(false);
                        PhotoViewer.this.isPhotosListViewVisible = false;
                        if (PhotoViewer.this.needCaptionLayout) {
                            PhotoViewer.this.captionTextViewSwitcher.setVisibility(4);
                        }
                        if (PhotoViewer.this.sendPhotoType == 0 || PhotoViewer.this.sendPhotoType == 4 || ((PhotoViewer.this.sendPhotoType == 2 || PhotoViewer.this.sendPhotoType == 5) && PhotoViewer.this.imagesArrLocals.size() > 1)) {
                            PhotoViewer.this.checkImageView.setVisibility(8);
                            PhotoViewer.this.photosCounterView.setVisibility(8);
                        }
                        if (PhotoViewer.this.centerImage.getBitmap() != null) {
                            float bitmapWidth2 = PhotoViewer.this.centerImage.getBitmapWidth();
                            float bitmapHeight2 = PhotoViewer.this.centerImage.getBitmapHeight();
                            float min = Math.min(PhotoViewer.this.getContainerViewWidth(2) / bitmapWidth2, PhotoViewer.this.getContainerViewHeight(2) / bitmapHeight2);
                            if (PhotoViewer.this.sendPhotoType == 1) {
                                PhotoViewer.this.animateToY = -AndroidUtilities.dp(36.0f);
                                f12 = PhotoViewer.this.getCropFillScale(false);
                            } else {
                                PhotoViewer.this.animateToY = (-AndroidUtilities.dp(93.0f)) + (PhotoViewer.this.isStatusBarVisible() ? AndroidUtilities.statusBarHeight / 2 : 0);
                                f12 = (PhotoViewer.this.editState.cropState == null || !(PhotoViewer.this.editState.cropState.transformRotation == 90 || PhotoViewer.this.editState.cropState.transformRotation == 270)) ? Math.min(PhotoViewer.this.getContainerViewWidth() / bitmapWidth2, PhotoViewer.this.getContainerViewHeight() / bitmapHeight2) : Math.min(PhotoViewer.this.getContainerViewWidth() / bitmapHeight2, PhotoViewer.this.getContainerViewHeight() / bitmapWidth2);
                            }
                            PhotoViewer.this.animateToScale = min / f12;
                            PhotoViewer.this.animateToX = (photoViewer.getLeftInset() / 2) - (PhotoViewer.this.getRightInset() / 2);
                            PhotoViewer.this.animationStartTime = System.currentTimeMillis();
                            PhotoViewer.this.zoomAnimation = true;
                        }
                        PhotoViewer.this.imageMoveAnimation = new AnimatorSet();
                        PhotoViewer.this.imageMoveAnimation.playTogether(ObjectAnimator.ofFloat(PhotoViewer.this, AnimationProperties.PHOTO_VIEWER_ANIMATION_VALUE, 0.0f, 1.0f), ObjectAnimator.ofFloat(PhotoViewer.this.photoFilterView.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(186.0f), 0.0f));
                        PhotoViewer.this.imageMoveAnimation.setDuration(200L);
                        PhotoViewer.this.imageMoveAnimation.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationStart(Animator animator2) {
                            }

                            @Override
                            public void onAnimationEnd(Animator animator2) {
                                PhotoViewer.this.photoFilterView.init();
                                PhotoViewer.this.imageMoveAnimation = null;
                                AnonymousClass57 r3 = AnonymousClass57.this;
                                PhotoViewer.this.currentEditMode = i;
                                PhotoViewer.this.switchingToMode = -1;
                                PhotoViewer.this.animateToScale = 1.0f;
                                PhotoViewer.this.animateToX = 0.0f;
                                PhotoViewer.this.animateToY = 0.0f;
                                PhotoViewer.this.scale = 1.0f;
                                PhotoViewer photoViewer2 = PhotoViewer.this;
                                photoViewer2.updateMinMax(photoViewer2.scale);
                                PhotoViewer.this.padImageForHorizontalInsets = true;
                                PhotoViewer.this.containerView.invalidate();
                            }
                        });
                        PhotoViewer.this.imageMoveAnimation.start();
                    }
                });
                this.changeModeAnimation.start();
            } else if (i == 3) {
                startVideoPlayer();
                createPaintView();
                this.changeModeAnimation = new AnimatorSet();
                ArrayList arrayList4 = new ArrayList();
                FrameLayout frameLayout3 = this.pickerView;
                Property property6 = View.TRANSLATION_Y;
                float[] fArr12 = new float[1];
                fArr12[0] = AndroidUtilities.dp(this.isCurrentVideo ? 154.0f : 96.0f);
                arrayList4.add(ObjectAnimator.ofFloat(frameLayout3, property6, fArr12));
                ImageView imageView3 = this.pickerViewSendButton;
                Property property7 = View.TRANSLATION_Y;
                float[] fArr13 = new float[1];
                fArr13[0] = AndroidUtilities.dp(this.isCurrentVideo ? 154.0f : 96.0f);
                arrayList4.add(ObjectAnimator.ofFloat(imageView3, property7, fArr13));
                arrayList4.add(ObjectAnimator.ofFloat(this.actionBar, View.TRANSLATION_Y, -actionBar.getHeight()));
                arrayList4.add(ObjectAnimator.ofObject(this.navigationBar, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(color), Integer.valueOf(i12)));
                if (this.needCaptionLayout) {
                    CaptionTextViewSwitcher captionTextViewSwitcher2 = this.captionTextViewSwitcher;
                    Property property8 = View.TRANSLATION_Y;
                    float[] fArr14 = new float[1];
                    if (!this.isCurrentVideo) {
                        f11 = 96.0f;
                    }
                    fArr14[0] = AndroidUtilities.dp(f11);
                    arrayList4.add(ObjectAnimator.ofFloat(captionTextViewSwitcher2, property8, fArr14));
                }
                int i22 = this.sendPhotoType;
                if (i22 == 0 || i22 == 4) {
                    i2 = 2;
                    arrayList4.add(ObjectAnimator.ofFloat(this.checkImageView, View.ALPHA, 1.0f, 0.0f));
                    arrayList4.add(ObjectAnimator.ofFloat(this.photosCounterView, View.ALPHA, 1.0f, 0.0f));
                } else if (i22 == 1) {
                    i2 = 2;
                    arrayList4.add(ObjectAnimator.ofFloat(this.photoCropView, View.ALPHA, 1.0f, 0.0f));
                } else {
                    i2 = 2;
                }
                if (this.selectedPhotosListView.getVisibility() == 0) {
                    float[] fArr15 = new float[i2];
                    
                    fArr15[0] = 1.0f;
                    fArr15[1] = 0.0f;
                    arrayList4.add(ObjectAnimator.ofFloat(this.selectedPhotosListView, View.ALPHA, fArr15));
                }
                if (this.cameraItem.getTag() != null) {
                    float[] fArr16 = new float[i2];
                    
                    fArr16[0] = 1.0f;
                    fArr16[1] = 0.0f;
                    arrayList4.add(ObjectAnimator.ofFloat(this.cameraItem, View.ALPHA, fArr16));
                }
                if (this.muteItem.getTag() != null) {
                    float[] fArr17 = new float[i2];
                    
                    fArr17[0] = 1.0f;
                    fArr17[1] = 0.0f;
                    arrayList4.add(ObjectAnimator.ofFloat(this.muteItem, View.ALPHA, fArr17));
                }
                this.changeModeAnimation.playTogether(arrayList4);
                this.changeModeAnimation.setDuration(200L);
                this.changeModeAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PhotoViewer.this.switchToPaintMode();
                    }
                });
                this.changeModeAnimation.start();
            }
        }
    }

    public void lambda$switchToEditMode$56(ValueAnimator valueAnimator) {
        this.photoCropView.cropView.areaView.setRotationScaleTranslation(0.0f, AndroidUtilities.lerp(this.scale, this.animateToScale, this.animationValue), AndroidUtilities.lerp(this.translationX, this.animateToX, this.animationValue), AndroidUtilities.lerp(this.translationY, this.animateToY, this.animationValue));
    }

    public void lambda$switchToEditMode$57(View view) {
        applyCurrentEditMode();
        switchToEditMode(0);
    }

    public void lambda$switchToEditMode$59(View view) {
        if (this.photoFilterView.hasChanges()) {
            Activity activity = this.parentActivity;
            if (activity != null) {
                AlertDialog.Builder builder = new AlertDialog.Builder(activity, this.resourcesProvider);
                builder.setMessage(LocaleController.getString("DiscardChanges", R.string.DiscardChanges));
                builder.setTitle(LocaleController.getString("AppName", R.string.AppName));
                builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        PhotoViewer.this.lambda$switchToEditMode$58(dialogInterface, i);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                showAlertDialog(builder);
                return;
            }
            return;
        }
        switchToEditMode(0);
    }

    public void lambda$switchToEditMode$58(DialogInterface dialogInterface, int i) {
        switchToEditMode(0);
    }

    private void createPaintView() {
        int i;
        int i2;
        MediaController.CropState cropState;
        if (this.photoPaintView == null) {
            TextureView textureView = this.videoTextureView;
            if (textureView != null) {
                VideoEditTextureView videoEditTextureView = (VideoEditTextureView) textureView;
                i = videoEditTextureView.getVideoWidth();
                i2 = videoEditTextureView.getVideoHeight();
                while (true) {
                    if (i <= 1280 && i2 <= 1280) {
                        break;
                    }
                    i /= 2;
                    i2 /= 2;
                }
            } else {
                i = this.centerImage.getBitmapWidth();
                i2 = this.centerImage.getBitmapHeight();
            }
            Bitmap bitmap = this.paintingOverlay.getBitmap();
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            }
            Bitmap bitmap2 = bitmap;
            if (this.sendPhotoType == 1) {
                cropState = new MediaController.CropState();
                cropState.transformRotation = this.cropTransform.getOrientation();
            } else {
                cropState = this.editState.cropState;
            }
            PhotoPaintView photoPaintView = new PhotoPaintView(this.parentActivity, bitmap2, this.isCurrentVideo ? null : this.centerImage.getBitmap(), this.centerImage.getOrientation(), this.editState.mediaEntities, cropState, new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.this.lambda$createPaintView$60();
                }
            }, this.resourcesProvider) {
                @Override
                protected void onOpenCloseStickersAlert(boolean z) {
                    if (PhotoViewer.this.videoPlayer != null) {
                        PhotoViewer.this.manuallyPaused = false;
                        PhotoViewer.this.cancelVideoPlayRunnable();
                        if (z) {
                            PhotoViewer.this.videoPlayer.pause();
                        } else {
                            PhotoViewer.this.videoPlayer.play();
                        }
                    }
                }

                @Override
                protected void didSetAnimatedSticker(RLottieDrawable rLottieDrawable) {
                    if (PhotoViewer.this.videoPlayer != null) {
                        long currentPosition = PhotoViewer.this.videoPlayer.getCurrentPosition();
                        long j = 0;
                        if (PhotoViewer.this.startTime > 0) {
                            j = PhotoViewer.this.startTime / 1000;
                        }
                        rLottieDrawable.setProgressMs(currentPosition - j);
                    }
                }

                @Override
                protected void onTextAdd() {
                    if (!PhotoViewer.this.windowView.isFocusable()) {
                        PhotoViewer.this.makeFocusable();
                    }
                }
            };
            this.photoPaintView = photoPaintView;
            this.containerView.addView(photoPaintView, LayoutHelper.createFrame(-1, -1.0f));
            this.photoPaintView.getDoneTextView().setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PhotoViewer.this.lambda$createPaintView$61(view);
                }
            });
            this.photoPaintView.getCancelTextView().setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PhotoViewer.this.lambda$createPaintView$62(view);
                }
            });
            this.photoPaintView.getColorPicker().setTranslationY(AndroidUtilities.dp(126.0f));
            this.photoPaintView.getToolsView().setTranslationY(AndroidUtilities.dp(126.0f));
            this.photoPaintView.getColorPickerBackground().setTranslationY(AndroidUtilities.dp(126.0f));
        }
    }

    public void lambda$createPaintView$60() {
        this.paintingOverlay.hideBitmap();
    }

    public void lambda$createPaintView$61(View view) {
        this.savedState = null;
        applyCurrentEditMode();
        switchToEditMode(0);
    }

    public void lambda$createPaintView$62(View view) {
        closePaintMode();
    }

    private void closePaintMode() {
        this.photoPaintView.maybeShowDismissalAlert(this, this.parentActivity, new Runnable() {
            @Override
            public final void run() {
                PhotoViewer.this.lambda$closePaintMode$63();
            }
        });
    }

    public void lambda$closePaintMode$63() {
        switchToEditMode(0);
    }

    public void switchToPaintMode() {
        this.changeModeAnimation = null;
        this.pickerView.setVisibility(8);
        this.pickerViewSendButton.setVisibility(8);
        this.cameraItem.setVisibility(8);
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
        }
        if (this.centerImage.getBitmap() != null) {
            int bitmapWidth = this.centerImage.getBitmapWidth();
            int bitmapHeight = this.centerImage.getBitmapHeight();
            if (this.sendPhotoType == 1) {
                this.animateToY = AndroidUtilities.dp(12.0f);
                if (this.cropTransform.getOrientation() == 90 || this.cropTransform.getOrientation() == 270) {
                    bitmapHeight = bitmapWidth;
                    bitmapWidth = bitmapHeight;
                }
            } else {
                this.animateToY = (-AndroidUtilities.dp(44.0f)) + (isStatusBarVisible() ? AndroidUtilities.statusBarHeight / 2 : 0);
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
            float f = bitmapWidth;
            float f2 = bitmapHeight;
            this.animateToScale = Math.min(getContainerViewWidth(3) / f, getContainerViewHeight(3) / f2) / Math.min(getContainerViewWidth() / f, getContainerViewHeight() / f2);
            this.animateToX = (getLeftInset() / 2) - (getRightInset() / 2);
            this.animationStartTime = System.currentTimeMillis();
            this.zoomAnimation = true;
        }
        this.windowView.setClipChildren(true);
        this.navigationBar.setVisibility(4);
        AnimatorSet animatorSet = new AnimatorSet();
        this.imageMoveAnimation = animatorSet;
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, AnimationProperties.PHOTO_VIEWER_ANIMATION_VALUE, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.photoPaintView.getColorPicker(), View.TRANSLATION_Y, AndroidUtilities.dp(126.0f), 0.0f), ObjectAnimator.ofFloat(this.photoPaintView.getToolsView(), View.TRANSLATION_Y, AndroidUtilities.dp(126.0f), 0.0f), ObjectAnimator.ofFloat(this.photoPaintView.getColorPickerBackground(), View.TRANSLATION_Y, AndroidUtilities.dp(126.0f), 0.0f));
        this.imageMoveAnimation.setDuration(200L);
        this.imageMoveAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Animator animator) {
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                PhotoViewer.this.photoPaintView.init();
                PhotoViewer.this.paintingOverlay.hideEntities();
                PhotoViewer.this.imageMoveAnimation = null;
                PhotoViewer.this.currentEditMode = 3;
                PhotoViewer.this.switchingToMode = -1;
                PhotoViewer photoViewer = PhotoViewer.this;
                photoViewer.animateToScale = photoViewer.scale = 1.0f;
                PhotoViewer.this.animateToX = 0.0f;
                PhotoViewer.this.animateToY = 0.0f;
                PhotoViewer photoViewer2 = PhotoViewer.this;
                photoViewer2.updateMinMax(photoViewer2.scale);
                PhotoViewer.this.padImageForHorizontalInsets = true;
                PhotoViewer.this.containerView.invalidate();
            }
        });
        this.imageMoveAnimation.start();
    }

    private void toggleCheckImageView(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float dpf2 = AndroidUtilities.dpf2(24.0f);
        FrameLayout frameLayout = this.pickerView;
        Property property = View.ALPHA;
        float[] fArr = new float[1];
        float f = 1.0f;
        float f2 = 0.0f;
        fArr[0] = z ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout, property, fArr));
        FrameLayout frameLayout2 = this.pickerView;
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        fArr2[0] = z ? 0.0f : dpf2;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property2, fArr2));
        ImageView imageView = this.pickerViewSendButton;
        Property property3 = View.ALPHA;
        float[] fArr3 = new float[1];
        fArr3[0] = z ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(imageView, property3, fArr3));
        ImageView imageView2 = this.pickerViewSendButton;
        Property property4 = View.TRANSLATION_Y;
        float[] fArr4 = new float[1];
        fArr4[0] = z ? 0.0f : dpf2;
        arrayList.add(ObjectAnimator.ofFloat(imageView2, property4, fArr4));
        int i = this.sendPhotoType;
        if (i == 0 || i == 4) {
            CheckBox checkBox = this.checkImageView;
            Property property5 = View.ALPHA;
            float[] fArr5 = new float[1];
            fArr5[0] = z ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(checkBox, property5, fArr5));
            CheckBox checkBox2 = this.checkImageView;
            Property property6 = View.TRANSLATION_Y;
            float[] fArr6 = new float[1];
            fArr6[0] = z ? 0.0f : -dpf2;
            arrayList.add(ObjectAnimator.ofFloat(checkBox2, property6, fArr6));
            CounterView counterView = this.photosCounterView;
            Property property7 = View.ALPHA;
            float[] fArr7 = new float[1];
            if (!z) {
                f = 0.0f;
            }
            fArr7[0] = f;
            arrayList.add(ObjectAnimator.ofFloat(counterView, property7, fArr7));
            CounterView counterView2 = this.photosCounterView;
            Property property8 = View.TRANSLATION_Y;
            float[] fArr8 = new float[1];
            if (!z) {
                f2 = -dpf2;
            }
            fArr8[0] = f2;
            arrayList.add(ObjectAnimator.ofFloat(counterView2, property8, fArr8));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(200L);
        animatorSet.start();
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
        int i = 0;
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
        RadialProgressView radialProgressView = this.miniProgressView;
        if (!z) {
            i = 4;
        }
        radialProgressView.setVisibility(i);
    }

    private void updateContainerFlags(boolean z) {
        FrameLayoutDrawer frameLayoutDrawer;
        if (Build.VERSION.SDK_INT >= 21 && this.sendPhotoType != 1 && (frameLayoutDrawer = this.containerView) != null) {
            int i = 1792;
            if (!z) {
                i = 1796;
                if (frameLayoutDrawer.getPaddingLeft() > 0 || this.containerView.getPaddingRight() > 0) {
                    i = 5894;
                }
            }
            this.containerView.setSystemUiVisibility(i);
        }
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
                if (actionBarToggleParams.enableStatusBarAnimation) {
                    updateContainerFlags(z);
                }
                if (!this.videoPlayerControlVisible || !this.isPlaying || !z) {
                    AndroidUtilities.cancelRunOnUIThread(this.hideActionBarRunnable);
                } else {
                    scheduleActionBarHide();
                }
                if (!z) {
                    Bulletin.hide(this.containerView);
                }
                float dpf2 = AndroidUtilities.dpf2(24.0f);
                this.videoPlayerControlFrameLayout.setSeekBarTransitionEnabled(actionBarToggleParams.enableTranslationAnimation && this.playerLooping);
                this.videoPlayerControlFrameLayout.setTranslationYAnimationEnabled(actionBarToggleParams.enableTranslationAnimation);
                float f = 1.0f;
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
                    View view = this.navigationBar;
                    if (view != null) {
                        Property property7 = View.ALPHA;
                        float[] fArr7 = new float[1];
                        fArr7[0] = z ? 1.0f : 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(view, property7, fArr7));
                    }
                    if (this.videoPlayerControlVisible) {
                        VideoPlayerControlFrameLayout videoPlayerControlFrameLayout = this.videoPlayerControlFrameLayout;
                        Property<VideoPlayerControlFrameLayout, Float> property8 = VPC_PROGRESS;
                        float[] fArr8 = new float[1];
                        fArr8[0] = z ? 1.0f : 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(videoPlayerControlFrameLayout, property8, fArr8));
                    } else {
                        this.videoPlayerControlFrameLayout.setProgress(z ? 1.0f : 0.0f);
                    }
                    GroupedPhotosListView groupedPhotosListView = this.groupedPhotosListView;
                    Property property9 = View.ALPHA;
                    float[] fArr9 = new float[1];
                    fArr9[0] = z ? 1.0f : 0.0f;
                    arrayList.add(ObjectAnimator.ofFloat(groupedPhotosListView, property9, fArr9));
                    if (actionBarToggleParams.enableTranslationAnimation) {
                        GroupedPhotosListView groupedPhotosListView2 = this.groupedPhotosListView;
                        Property property10 = View.TRANSLATION_Y;
                        float[] fArr10 = new float[1];
                        fArr10[0] = z ? 0.0f : dpf2;
                        arrayList.add(ObjectAnimator.ofFloat(groupedPhotosListView2, property10, fArr10));
                    } else {
                        this.groupedPhotosListView.setTranslationY(0.0f);
                    }
                    if (!this.needCaptionLayout && (captionScrollView2 = this.captionScrollView) != null) {
                        Property property11 = View.ALPHA;
                        float[] fArr11 = new float[1];
                        fArr11[0] = z ? 1.0f : 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(captionScrollView2, property11, fArr11));
                        if (actionBarToggleParams.enableTranslationAnimation) {
                            CaptionScrollView captionScrollView3 = this.captionScrollView;
                            Property property12 = View.TRANSLATION_Y;
                            float[] fArr12 = new float[1];
                            if (z) {
                                dpf2 = 0.0f;
                            }
                            fArr12[0] = dpf2;
                            arrayList.add(ObjectAnimator.ofFloat(captionScrollView3, property12, fArr12));
                        } else {
                            this.captionScrollView.setTranslationY(0.0f);
                        }
                    }
                    if (this.videoPlayerControlVisible && this.isPlaying) {
                        float[] fArr13 = new float[2];
                        fArr13[0] = this.photoProgressViews[0].animAlphas[1];
                        fArr13[1] = z ? 1.0f : 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr13);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                PhotoViewer.this.lambda$toggleActionBar$64(valueAnimator);
                            }
                        });
                        arrayList.add(ofFloat);
                    }
                    if (this.muteItem.getTag() != null) {
                        ImageView imageView3 = this.muteItem;
                        Property property13 = View.ALPHA;
                        float[] fArr14 = new float[1];
                        if (!z) {
                            f = 0.0f;
                        }
                        fArr14[0] = f;
                        arrayList.add(ObjectAnimator.ofFloat(imageView3, property13, fArr14));
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.actionBarAnimator = animatorSet2;
                    animatorSet2.playTogether(arrayList);
                    this.actionBarAnimator.setDuration(actionBarToggleParams.animationDuration);
                    this.actionBarAnimator.setInterpolator(actionBarToggleParams.animationInterpolator);
                    this.actionBarAnimator.addListener(new AnimatorListenerAdapter() {
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
                this.bottomLayout.setAlpha(z ? 1.0f : 0.0f);
                this.bottomLayout.setTranslationY(z ? 0.0f : dpf2);
                this.navigationBar.setAlpha(z ? 1.0f : 0.0f);
                this.groupedPhotosListView.setAlpha(z ? 1.0f : 0.0f);
                this.groupedPhotosListView.setTranslationY(z ? 0.0f : dpf2);
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
                    PhotoProgressView photoProgressView = this.photoProgressViews[0];
                    if (!z) {
                        f = 0.0f;
                    }
                    photoProgressView.setIndexedAlpha(1, f, false);
                }
            }
        }
    }

    public void lambda$toggleActionBar$64(ValueAnimator valueAnimator) {
        this.photoProgressViews[0].setIndexedAlpha(1, ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
    }

    private void togglePhotosListView(boolean z, boolean z2) {
        if (z != this.isPhotosListViewVisible) {
            if (z) {
                this.selectedPhotosListView.setVisibility(0);
            }
            this.isPhotosListViewVisible = z;
            this.selectedPhotosListView.setEnabled(z);
            float f = 1.0f;
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
                if (!z) {
                    f = 0.0f;
                }
                fArr3[0] = f;
                arrayList.add(ObjectAnimator.ofFloat(counterView, property3, fArr3));
                AnimatorSet animatorSet = new AnimatorSet();
                this.currentListViewAnimation = animatorSet;
                animatorSet.playTogether(arrayList);
                if (!z) {
                    this.currentListViewAnimation.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (PhotoViewer.this.currentListViewAnimation != null && PhotoViewer.this.currentListViewAnimation.equals(animator)) {
                                PhotoViewer.this.selectedPhotosListView.setVisibility(8);
                                PhotoViewer.this.currentListViewAnimation = null;
                            }
                        }
                    });
                }
                this.currentListViewAnimation.setDuration(200L);
                this.currentListViewAnimation.start();
                return;
            }
            this.selectedPhotosListView.setAlpha(z ? 1.0f : 0.0f);
            this.selectedPhotosListView.setTranslationY(z ? 0.0f : -AndroidUtilities.dp(10.0f));
            CounterView counterView2 = this.photosCounterView;
            if (!z) {
                f = 0.0f;
            }
            counterView2.setRotationX(f);
            if (!z) {
                this.selectedPhotosListView.setVisibility(8);
            }
        }
    }

    public void toggleVideoPlayer() {
        if (this.videoPlayer != null) {
            cancelVideoPlayRunnable();
            AndroidUtilities.cancelRunOnUIThread(this.hideActionBarRunnable);
            if (this.isPlaying) {
                this.videoPlayer.pause();
            } else {
                if (!this.isCurrentVideo) {
                    if (Math.abs(this.videoPlayerSeekbar.getProgress() - this.videoTimelineView.getRightProgress()) < 0.01f || this.videoPlayer.getCurrentPosition() == this.videoPlayer.getDuration()) {
                        this.videoPlayer.seekTo(0L);
                    }
                    scheduleActionBarHide();
                } else if (Math.abs(this.videoTimelineView.getProgress() - this.videoTimelineView.getRightProgress()) < 0.01f || this.videoPlayer.getCurrentPosition() == this.videoPlayer.getDuration()) {
                    this.videoPlayer.seekTo((int) (this.videoTimelineView.getLeftProgress() * ((float) this.videoPlayer.getDuration())));
                }
                this.videoPlayer.play();
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
        } else if (this.imagesArrLocations.isEmpty() && this.imagesArr.isEmpty()) {
            if (this.imagesArrLocals.isEmpty()) {
                PageBlocksAdapter pageBlocksAdapter = this.pageBlocksAdapter;
                if (pageBlocksAdapter != null) {
                    return pageBlocksAdapter.getFileName(i);
                }
            } else if (i >= this.imagesArrLocals.size()) {
                return null;
            } else {
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
            }
            return null;
        } else if (!this.imagesArrLocations.isEmpty()) {
            if (i >= this.imagesArrLocations.size()) {
                return null;
            }
            ImageLocation imageLocation = this.imagesArrLocations.get(i);
            ImageLocation imageLocation2 = this.imagesArrLocationsVideo.get(i);
            if (imageLocation == null) {
                return null;
            }
            if (imageLocation2 != imageLocation) {
                return imageLocation2.location.volume_id + "_" + imageLocation2.location.local_id + ".mp4";
            }
            return imageLocation.location.volume_id + "_" + imageLocation.location.local_id + ".jpg";
        } else if (i >= this.imagesArr.size()) {
            return null;
        } else {
            return FileLoader.getMessageFileName(this.imagesArr.get(i).messageOwner);
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
            if (jArr != null) {
                jArr[0] = this.imagesArrLocationsSizes.get(i).longValue();
            }
            return this.imagesArrLocationsVideo.get(i);
        } else if (this.imagesArr.isEmpty() || i >= this.imagesArr.size()) {
            return null;
        } else {
            MessageObject messageObject = this.imagesArr.get(i);
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            if (!(tLRPC$Message instanceof TLRPC$TL_messageService)) {
                TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
                if ((!(tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaPhoto) || tLRPC$MessageMedia.photo == null) && (!(tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaWebPage) || tLRPC$MessageMedia.webpage == null)) {
                    if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaInvoice) {
                        return ImageLocation.getForWebFile(WebFile.createWithWebDocument(((TLRPC$TL_messageMediaInvoice) tLRPC$MessageMedia).photo));
                    }
                    if (messageObject.getDocument() != null) {
                        TLRPC$Document document = messageObject.getDocument();
                        if (this.sharedMediaType == 5) {
                            return ImageLocation.getForDocument(document);
                        }
                        if (MessageObject.isDocumentHasThumb(messageObject.getDocument())) {
                            TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                            if (jArr != null) {
                                jArr[0] = closestPhotoSizeWithSize.size;
                                if (jArr[0] == 0) {
                                    jArr[0] = -1;
                                }
                            }
                            return ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                        }
                    }
                } else if (messageObject.isGif()) {
                    return ImageLocation.getForDocument(messageObject.getDocument());
                } else {
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
                }
            } else if (tLRPC$Message.action instanceof TLRPC$TL_messageActionUserUpdatedPhoto) {
                return null;
            } else {
                TLRPC$PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                if (closestPhotoSizeWithSize3 != null) {
                    if (jArr != null) {
                        jArr[0] = closestPhotoSizeWithSize3.size;
                        if (jArr[0] == 0) {
                            jArr[0] = -1;
                        }
                    }
                    return ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject);
                } else if (jArr != null) {
                    jArr[0] = -1;
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
            if (jArr != null) {
                jArr[0] = this.imagesArrLocationsSizes.get(i).longValue();
            }
            return this.imagesArrLocationsVideo.get(i).location;
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
            } else {
                TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
                if (((tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaPhoto) && tLRPC$MessageMedia.photo != null) || ((tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaWebPage) && tLRPC$MessageMedia.webpage != null)) {
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
                } else if (tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaInvoice) {
                    return ((TLRPC$TL_messageMediaInvoice) tLRPC$MessageMedia).photo;
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
            }
            return null;
        }
    }

    public void updateSelectedCount() {
        PhotoViewerProvider photoViewerProvider = this.placeProvider;
        if (photoViewerProvider != null) {
            int selectedCount = photoViewerProvider.getSelectedCount();
            this.photosCounterView.setCount(selectedCount);
            if (selectedCount == 0) {
                togglePhotosListView(false, true);
            }
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
            } else {
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
            int i = 0;
            if (!z2 || bool == null) {
                if (!z) {
                    i = 8;
                }
                view.setVisibility(i);
                view.setAlpha(f2);
                return;
            }
            if (z) {
                view.setVisibility(0);
            }
            view.animate().alpha(f2).setDuration(100L).setInterpolator(new LinearInterpolator()).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.lambda$setItemVisible$65(z, view);
                }
            }).start();
        }
    }

    public static void lambda$setItemVisible$65(boolean z, View view) {
        if (!z) {
            view.setVisibility(8);
        }
    }

    public void onPhotoShow(org.telegram.messenger.MessageObject r19, org.telegram.tgnet.TLRPC$FileLocation r20, org.telegram.messenger.ImageLocation r21, org.telegram.messenger.ImageLocation r22, java.util.ArrayList<org.telegram.messenger.MessageObject> r23, java.util.ArrayList<org.telegram.messenger.SecureDocument> r24, java.util.List<java.lang.Object> r25, int r26, org.telegram.ui.PhotoViewer.PlaceProviderObject r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.onPhotoShow(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, org.telegram.messenger.ImageLocation, org.telegram.messenger.ImageLocation, java.util.ArrayList, java.util.ArrayList, java.util.List, int, org.telegram.ui.PhotoViewer$PlaceProviderObject):void");
    }

    private boolean canSendMediaToParentChatActivity() {
        TLRPC$Chat tLRPC$Chat;
        ChatActivity chatActivity = this.parentChatActivity;
        return chatActivity != null && (chatActivity.currentUser != null || ((tLRPC$Chat = chatActivity.currentChat) != null && !ChatObject.isNotInChat(tLRPC$Chat) && ChatObject.canSendMedia(this.parentChatActivity.currentChat)));
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

    private void setIsAboutToSwitchToIndex(int r31, boolean r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.setIsAboutToSwitchToIndex(int, boolean, boolean):void");
    }

    private void showVideoTimeline(boolean z, boolean z2) {
        Integer num = null;
        int i = 0;
        if (!z2) {
            this.videoTimelineView.animate().setListener(null).cancel();
            VideoTimelinePlayView videoTimelinePlayView = this.videoTimelineView;
            if (!z) {
                i = 8;
            }
            videoTimelinePlayView.setVisibility(i);
            this.videoTimelineView.setTranslationY(0.0f);
            this.videoTimelineView.setAlpha(this.pickerView.getAlpha());
        } else if (z && this.videoTimelineView.getTag() == null) {
            if (this.videoTimelineView.getVisibility() != 0) {
                this.videoTimelineView.setVisibility(0);
                this.videoTimelineView.setAlpha(this.pickerView.getAlpha());
                this.videoTimelineView.setTranslationY(AndroidUtilities.dp(58.0f));
            }
            ObjectAnimator objectAnimator = this.videoTimelineAnimator;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                this.videoTimelineAnimator.cancel();
            }
            VideoTimelinePlayView videoTimelinePlayView2 = this.videoTimelineView;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(videoTimelinePlayView2, View.TRANSLATION_Y, videoTimelinePlayView2.getTranslationY(), 0.0f);
            this.videoTimelineAnimator = ofFloat;
            ofFloat.setDuration(220L);
            this.videoTimelineAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.videoTimelineAnimator.start();
        } else if (!z && this.videoTimelineView.getTag() != null) {
            ObjectAnimator objectAnimator2 = this.videoTimelineAnimator;
            if (objectAnimator2 != null) {
                objectAnimator2.removeAllListeners();
                this.videoTimelineAnimator.cancel();
            }
            VideoTimelinePlayView videoTimelinePlayView3 = this.videoTimelineView;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(videoTimelinePlayView3, View.TRANSLATION_Y, videoTimelinePlayView3.getTranslationY(), AndroidUtilities.dp(58.0f));
            this.videoTimelineAnimator = ofFloat2;
            ofFloat2.addListener(new HideViewAfterAnimation(this.videoTimelineView));
            this.videoTimelineAnimator.setDuration(220L);
            this.videoTimelineAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.videoTimelineAnimator.start();
        }
        VideoTimelinePlayView videoTimelinePlayView4 = this.videoTimelineView;
        if (z) {
            num = 1;
        }
        videoTimelinePlayView4.setTag(num);
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

    private void setImageIndex(int i, boolean z, boolean z2) {
        int i2;
        boolean z3;
        boolean z4;
        Uri uri;
        boolean z5;
        Uri uri2;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        MessageObject messageObject;
        MediaController.CropState cropState;
        ImageReceiver.BitmapHolder bitmapHolder;
        if (!(this.currentIndex == i || this.placeProvider == null)) {
            if (!z && (bitmapHolder = this.currentThumb) != null) {
                bitmapHolder.release();
                this.currentThumb = null;
            }
            this.currentFileNames[0] = getFileName(i);
            this.currentFileNames[1] = getFileName(i + 1);
            this.currentFileNames[2] = getFileName(i - 1);
            this.placeProvider.willSwitchFromPhoto(this.currentMessageObject, getFileLocation(this.currentFileLocation), this.currentIndex);
            this.lastPhotoSetTime = SystemClock.elapsedRealtime();
            int i3 = this.currentIndex;
            this.currentIndex = i;
            setIsAboutToSwitchToIndex(i, z, z2);
            CropTransform clone = this.cropTransform.clone();
            EditState editState = this.editState;
            MediaController.CropState clone2 = (editState == null || (cropState = editState.cropState) == null) ? null : cropState.clone();
            boolean z10 = this.centerImageIsVideo;
            this.editState.reset();
            if (!this.imagesArr.isEmpty()) {
                int i4 = this.currentIndex;
                if (i4 < 0 || i4 >= this.imagesArr.size()) {
                    closePhoto(false, false);
                    return;
                }
                MessageObject messageObject2 = this.imagesArr.get(this.currentIndex);
                z4 = z && (messageObject = this.currentMessageObject) != null && messageObject.getId() == messageObject2.getId();
                this.currentMessageObject = messageObject2;
                z3 = messageObject2.isVideo();
                if (this.sharedMediaType == 1) {
                    boolean canPreviewDocument = messageObject2.canPreviewDocument();
                    this.canZoom = canPreviewDocument;
                    if (canPreviewDocument) {
                        if (this.allowShare) {
                            this.menuItem.showSubItem(1);
                        } else {
                            this.menuItem.hideSubItem(1);
                        }
                        setDoubleTapEnabled(true);
                    } else {
                        this.menuItem.hideSubItem(1);
                        setDoubleTapEnabled(false);
                    }
                }
                if (z3 || this.isEmbedVideo) {
                    this.speedItem.setVisibility(0);
                    this.speedGap.setVisibility(0);
                    this.menuItem.showSubItem(19);
                } else {
                    this.speedItem.setVisibility(8);
                    this.speedGap.setVisibility(8);
                    this.menuItem.checkHideMenuItem();
                }
                uri = null;
                i2 = i3;
            } else {
                if (!this.secureDocuments.isEmpty()) {
                    if (i < 0 || i >= this.secureDocuments.size()) {
                        closePhoto(false, false);
                        return;
                    } else {
                        this.currentSecureDocument = this.secureDocuments.get(i);
                        i2 = i3;
                    }
                } else if (this.imagesArrLocations.isEmpty()) {
                    i2 = i3;
                    if (this.imagesArrLocals.isEmpty()) {
                        PageBlocksAdapter pageBlocksAdapter = this.pageBlocksAdapter;
                        if (pageBlocksAdapter != null) {
                            int i5 = this.currentIndex;
                            if (i5 < 0 || i5 >= pageBlocksAdapter.getItemsCount()) {
                                closePhoto(false, false);
                                return;
                            }
                            TLRPC$PageBlock tLRPC$PageBlock = this.pageBlocksAdapter.get(this.currentIndex);
                            TLRPC$PageBlock tLRPC$PageBlock2 = this.currentPageBlock;
                            z4 = tLRPC$PageBlock2 != null && tLRPC$PageBlock2 == tLRPC$PageBlock;
                            this.currentPageBlock = tLRPC$PageBlock;
                            z3 = this.pageBlocksAdapter.isVideo(this.currentIndex);
                            uri = null;
                        }
                    } else if (i < 0 || i >= this.imagesArrLocals.size()) {
                        closePhoto(false, false);
                        return;
                    } else {
                        Object obj = this.imagesArrLocals.get(i);
                        if (obj instanceof TLRPC$BotInlineResult) {
                            TLRPC$BotInlineResult tLRPC$BotInlineResult = (TLRPC$BotInlineResult) obj;
                            this.currentBotInlineResult = tLRPC$BotInlineResult;
                            if (tLRPC$BotInlineResult.document != null) {
                                this.currentPathObject = FileLoader.getInstance(this.currentAccount).getPathToAttach(tLRPC$BotInlineResult.document).getAbsolutePath();
                                z8 = MessageObject.isVideoDocument(tLRPC$BotInlineResult.document);
                            } else {
                                if (tLRPC$BotInlineResult.photo != null) {
                                    this.currentPathObject = FileLoader.getInstance(this.currentAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(tLRPC$BotInlineResult.photo.sizes, AndroidUtilities.getPhotoSize())).getAbsolutePath();
                                } else {
                                    TLRPC$WebDocument tLRPC$WebDocument = tLRPC$BotInlineResult.content;
                                    if (tLRPC$WebDocument instanceof TLRPC$TL_webDocument) {
                                        this.currentPathObject = tLRPC$WebDocument.url;
                                        z8 = tLRPC$BotInlineResult.type.equals(MediaStreamTrack.VIDEO_TRACK_KIND);
                                    }
                                }
                                z8 = false;
                            }
                            z3 = z8;
                            uri = null;
                            z4 = false;
                        } else {
                            if (obj instanceof MediaController.PhotoEntry) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                                String str = photoEntry.path;
                                this.currentPathObject = str;
                                if (str == null) {
                                    closePhoto(false, false);
                                    return;
                                }
                                z6 = photoEntry.isVideo;
                                EditState editState2 = this.editState;
                                editState2.savedFilterState = photoEntry.savedFilterState;
                                editState2.paintPath = photoEntry.paintPath;
                                editState2.croppedPaintPath = photoEntry.croppedPaintPath;
                                editState2.croppedMediaEntities = photoEntry.croppedMediaEntities;
                                editState2.averageDuration = photoEntry.averageDuration;
                                editState2.mediaEntities = photoEntry.mediaEntities;
                                editState2.cropState = photoEntry.cropState;
                                File file = new File(photoEntry.path);
                                Uri fromFile = Uri.fromFile(file);
                                if (this.isDocumentsPicker) {
                                    StringBuilder sb = new StringBuilder();
                                    if (!(photoEntry.width == 0 || photoEntry.height == 0)) {
                                        if (sb.length() > 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(String.format(Locale.US, "%dx%d", Integer.valueOf(photoEntry.width), Integer.valueOf(photoEntry.height)));
                                    }
                                    if (photoEntry.isVideo) {
                                        if (sb.length() > 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(AndroidUtilities.formatShortDuration(photoEntry.duration));
                                    }
                                    if (photoEntry.size != 0) {
                                        if (sb.length() > 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(AndroidUtilities.formatFileSize(photoEntry.size));
                                    }
                                    this.docNameTextView.setText(file.getName());
                                    this.docInfoTextView.setText(sb);
                                }
                                z7 = this.savedState != null;
                                uri2 = fromFile;
                            } else {
                                if (obj instanceof MediaController.SearchImage) {
                                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                                    this.currentPathObject = searchImage.getPathToAttach();
                                    EditState editState3 = this.editState;
                                    editState3.savedFilterState = searchImage.savedFilterState;
                                    editState3.paintPath = searchImage.paintPath;
                                    editState3.croppedPaintPath = searchImage.croppedPaintPath;
                                    editState3.croppedMediaEntities = searchImage.croppedMediaEntities;
                                    editState3.averageDuration = searchImage.averageDuration;
                                    editState3.mediaEntities = searchImage.mediaEntities;
                                    editState3.cropState = searchImage.cropState;
                                }
                                z7 = false;
                                z6 = false;
                                uri2 = null;
                            }
                            if (obj instanceof MediaController.MediaEditState) {
                                MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) obj;
                                if (hasAnimatedMediaEntities()) {
                                    this.currentImagePath = mediaEditState.imagePath;
                                } else {
                                    String str2 = mediaEditState.filterPath;
                                    if (str2 != null) {
                                        this.currentImagePath = str2;
                                    } else {
                                        this.currentImagePath = this.currentPathObject;
                                    }
                                }
                            }
                            z3 = z6;
                            uri = uri2;
                            z4 = z7;
                        }
                        MediaController.CropState cropState2 = this.editState.cropState;
                        if (cropState2 != null) {
                            this.previousHasTransform = true;
                            float f = cropState2.cropPx;
                            this.previousCropPx = f;
                            float f2 = cropState2.cropPy;
                            this.previousCropPy = f2;
                            float f3 = cropState2.cropScale;
                            this.previousCropScale = f3;
                            float f4 = cropState2.cropRotate;
                            this.previousCropRotation = f4;
                            int i6 = cropState2.transformRotation;
                            this.previousCropOrientation = i6;
                            float f5 = cropState2.cropPw;
                            this.previousCropPw = f5;
                            float f6 = cropState2.cropPh;
                            this.previousCropPh = f6;
                            boolean z11 = cropState2.mirrored;
                            this.previousCropMirrored = z11;
                            this.cropTransform.setViewTransform(true, f, f2, f4, i6, f3, 1.0f, 1.0f, f5, f6, 0.0f, 0.0f, z11);
                        } else {
                            this.previousHasTransform = false;
                            this.cropTransform.setViewTransform(false, this.previousCropPx, this.previousCropPy, this.previousCropRotation, this.previousCropOrientation, this.previousCropScale, 1.0f, 1.0f, this.previousCropPw, this.previousCropPh, 0.0f, 0.0f, this.previousCropMirrored);
                        }
                    }
                } else if (i < 0 || i >= this.imagesArrLocations.size()) {
                    closePhoto(false, false);
                    return;
                } else {
                    ImageLocation imageLocation = this.currentFileLocation;
                    ImageLocation imageLocation2 = this.imagesArrLocations.get(i);
                    if (!(!z || imageLocation == null || imageLocation2 == null)) {
                        TLRPC$TL_fileLocationToBeDeprecated tLRPC$TL_fileLocationToBeDeprecated = imageLocation.location;
                        int i7 = tLRPC$TL_fileLocationToBeDeprecated.local_id;
                        TLRPC$TL_fileLocationToBeDeprecated tLRPC$TL_fileLocationToBeDeprecated2 = imageLocation2.location;
                        if (i7 == tLRPC$TL_fileLocationToBeDeprecated2.local_id) {
                            i2 = i3;
                            if (tLRPC$TL_fileLocationToBeDeprecated.volume_id == tLRPC$TL_fileLocationToBeDeprecated2.volume_id) {
                                z9 = true;
                                this.currentFileLocation = this.imagesArrLocations.get(i);
                                this.currentFileLocationVideo = this.imagesArrLocationsVideo.get(i);
                                z4 = z9;
                                uri = null;
                                z3 = false;
                            }
                            z9 = false;
                            this.currentFileLocation = this.imagesArrLocations.get(i);
                            this.currentFileLocationVideo = this.imagesArrLocationsVideo.get(i);
                            z4 = z9;
                            uri = null;
                            z3 = false;
                        }
                    }
                    i2 = i3;
                    z9 = false;
                    this.currentFileLocation = this.imagesArrLocations.get(i);
                    this.currentFileLocationVideo = this.imagesArrLocationsVideo.get(i);
                    z4 = z9;
                    uri = null;
                    z3 = false;
                }
                uri = null;
                z4 = false;
                z3 = false;
            }
            setMenuItemIcon();
            PlaceProviderObject placeProviderObject = this.currentPlaceObject;
            if (placeProviderObject != null) {
                if (this.animationInProgress == 0) {
                    placeProviderObject.imageReceiver.setVisible(true, true);
                } else {
                    this.showAfterAnimation = placeProviderObject;
                }
            }
            PlaceProviderObject placeForPhoto = this.placeProvider.getPlaceForPhoto(this.currentMessageObject, getFileLocation(this.currentFileLocation), this.currentIndex, false);
            this.currentPlaceObject = placeForPhoto;
            if (placeForPhoto != null) {
                if (this.animationInProgress == 0) {
                    placeForPhoto.imageReceiver.setVisible(false, true);
                } else {
                    this.hideAfterAnimation = placeForPhoto;
                }
            }
            if (!z4) {
                this.draggingDown = false;
                this.translationX = 0.0f;
                this.translationY = 0.0f;
                this.scale = 1.0f;
                this.animateToX = 0.0f;
                this.animateToY = 0.0f;
                this.animateToScale = 1.0f;
                this.animateToRotate = 0.0f;
                this.animationStartTime = 0L;
                this.zoomAnimation = false;
                this.imageMoveAnimation = null;
                this.changeModeAnimation = null;
                AspectRatioFrameLayout aspectRatioFrameLayout = this.aspectRatioFrameLayout;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setVisibility(4);
                }
                this.pinchStartDistance = 0.0f;
                this.pinchStartScale = 1.0f;
                this.pinchCenterX = 0.0f;
                this.pinchCenterY = 0.0f;
                this.pinchStartX = 0.0f;
                this.pinchStartY = 0.0f;
                this.moveStartX = 0.0f;
                this.moveStartY = 0.0f;
                this.zooming = false;
                this.moving = false;
                this.paintViewTouched = 0;
                this.doubleTap = false;
                this.invalidCoords = false;
                this.canDragDown = true;
                this.changingPage = false;
                this.switchImageAfterAnimation = 0;
                if (this.sharedMediaType != 1) {
                    this.canZoom = !this.isEmbedVideo && (!this.imagesArrLocals.isEmpty() || !(this.currentFileNames[0] == null || this.photoProgressViews[0].backgroundState == 0));
                }
                updateMinMax(this.scale);
                z5 = false;
                releasePlayer(false);
            } else {
                z5 = false;
            }
            if (z3 && uri != null) {
                this.isStreaming = z5;
                preparePlayer(uri, this.sendPhotoType == 1, z5, this.editState.savedFilterState);
            }
            if (this.imagesArrLocals.isEmpty()) {
                this.editState.reset();
            }
            this.centerImageIsVideo = z3;
            int i8 = i2;
            if (i8 == -1) {
                setImages();
                for (int i9 = 0; i9 < 3; i9++) {
                    checkProgress(i9, false, false);
                }
            } else {
                checkProgress(0, true, false);
                int i10 = this.currentIndex;
                if (i8 > i10) {
                    ImageReceiver imageReceiver = this.rightImage;
                    this.rightImage = this.centerImage;
                    this.centerImage = this.leftImage;
                    this.leftImage = imageReceiver;
                    this.rightImageIsVideo = z10;
                    this.rightCropTransform = clone;
                    this.rightCropState = clone2;
                    PhotoProgressView[] photoProgressViewArr = this.photoProgressViews;
                    PhotoProgressView photoProgressView = photoProgressViewArr[0];
                    photoProgressViewArr[0] = photoProgressViewArr[2];
                    photoProgressViewArr[2] = photoProgressView;
                    ImageView[] imageViewArr = this.fullscreenButton;
                    ImageView imageView = imageViewArr[0];
                    imageViewArr[0] = imageViewArr[2];
                    imageViewArr[2] = imageView;
                    imageViewArr[0].setTranslationY(imageView.getTranslationY());
                    this.leftCropState = null;
                    setIndexToPaintingOverlay(this.currentIndex - 1, this.leftPaintingOverlay);
                    setIndexToPaintingOverlay(this.currentIndex, this.paintingOverlay);
                    setIndexToPaintingOverlay(this.currentIndex + 1, this.rightPaintingOverlay);
                    setIndexToImage(this.leftImage, this.currentIndex - 1, this.leftCropTransform);
                    updateAccessibilityOverlayVisibility();
                    checkProgress(1, true, false);
                    checkProgress(2, true, false);
                } else if (i8 < i10) {
                    ImageReceiver imageReceiver2 = this.leftImage;
                    this.leftImage = this.centerImage;
                    this.centerImage = this.rightImage;
                    this.rightImage = imageReceiver2;
                    this.leftImageIsVideo = z10;
                    this.leftCropTransform = clone;
                    this.leftCropState = clone2;
                    PhotoProgressView[] photoProgressViewArr2 = this.photoProgressViews;
                    PhotoProgressView photoProgressView2 = photoProgressViewArr2[0];
                    photoProgressViewArr2[0] = photoProgressViewArr2[1];
                    photoProgressViewArr2[1] = photoProgressView2;
                    ImageView[] imageViewArr2 = this.fullscreenButton;
                    ImageView imageView2 = imageViewArr2[0];
                    imageViewArr2[0] = imageViewArr2[1];
                    imageViewArr2[1] = imageView2;
                    imageViewArr2[0].setTranslationY(imageView2.getTranslationY());
                    this.rightCropState = null;
                    setIndexToPaintingOverlay(this.currentIndex - 1, this.leftPaintingOverlay);
                    setIndexToPaintingOverlay(this.currentIndex, this.paintingOverlay);
                    setIndexToPaintingOverlay(this.currentIndex + 1, this.rightPaintingOverlay);
                    setIndexToImage(this.rightImage, this.currentIndex + 1, this.rightCropTransform);
                    updateAccessibilityOverlayVisibility();
                    checkProgress(1, true, false);
                    checkProgress(2, true, false);
                }
                Bitmap bitmap = this.videoFrameBitmap;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.videoFrameBitmap = null;
                }
            }
            detectFaces();
        }
    }

    private void setCurrentCaption(MessageObject messageObject, CharSequence charSequence, boolean z) {
        boolean z2;
        CharSequence charSequence2;
        int i;
        int i2;
        boolean z3 = true;
        int i3 = 0;
        if (!this.needCaptionLayout) {
            if (this.captionScrollView == null) {
                this.captionScrollView = new CaptionScrollView(this.containerView.getContext());
                FrameLayout frameLayout = new FrameLayout(this.containerView.getContext());
                this.captionContainer = frameLayout;
                frameLayout.setClipChildren(false);
                this.captionScrollView.addView(this.captionContainer, new ViewGroup.LayoutParams(-1, -2));
                this.containerView.addView(this.captionScrollView, LayoutHelper.createFrame(-1, -1, 80));
            }
            if (this.captionTextViewSwitcher.getParent() != this.captionContainer) {
                this.pickerView.removeView(this.captionTextViewSwitcher);
                this.captionTextViewSwitcher.setMeasureAllChildren(true);
                this.captionContainer.addView(this.captionTextViewSwitcher, -1, -2);
                this.videoPreviewFrame.bringToFront();
            }
        } else if (this.captionTextViewSwitcher.getParent() != this.pickerView) {
            FrameLayout frameLayout2 = this.captionContainer;
            if (frameLayout2 != null) {
                frameLayout2.removeView(this.captionTextViewSwitcher);
            }
            this.captionTextViewSwitcher.setMeasureAllChildren(false);
            this.pickerView.addView(this.captionTextViewSwitcher, LayoutHelper.createFrame(-1, -2.0f, 83, 0.0f, 0.0f, 76.0f, 48.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean isEmpty2 = TextUtils.isEmpty(this.captionTextViewSwitcher.getCurrentView().getText());
        CaptionTextViewSwitcher captionTextViewSwitcher = this.captionTextViewSwitcher;
        TextView nextView = z ? captionTextViewSwitcher.getNextView() : captionTextViewSwitcher.getCurrentView();
        if (!this.isCurrentVideo) {
            int maxLines = nextView.getMaxLines();
            if (maxLines == 1) {
                this.captionTextViewSwitcher.getCurrentView().setSingleLine(false);
                this.captionTextViewSwitcher.getNextView().setSingleLine(false);
            }
            if (this.needCaptionLayout) {
                Point point = AndroidUtilities.displaySize;
                i2 = point.x > point.y ? 5 : 10;
            } else {
                i2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
            if (maxLines != i2) {
                this.captionTextViewSwitcher.getCurrentView().setMaxLines(i2);
                this.captionTextViewSwitcher.getNextView().setMaxLines(i2);
                this.captionTextViewSwitcher.getCurrentView().setEllipsize(null);
                this.captionTextViewSwitcher.getNextView().setEllipsize(null);
            }
        } else if (nextView.getMaxLines() != 1) {
            this.captionTextViewSwitcher.getCurrentView().setMaxLines(1);
            this.captionTextViewSwitcher.getNextView().setMaxLines(1);
            this.captionTextViewSwitcher.getCurrentView().setSingleLine(true);
            this.captionTextViewSwitcher.getNextView().setSingleLine(true);
            this.captionTextViewSwitcher.getCurrentView().setEllipsize(TextUtils.TruncateAt.END);
            this.captionTextViewSwitcher.getNextView().setEllipsize(TextUtils.TruncateAt.END);
        }
        nextView.setScrollX(0);
        boolean z4 = this.needCaptionLayout;
        this.dontChangeCaptionPosition = !z4 && z && isEmpty;
        if (!z4) {
            this.captionScrollView.dontChangeTopMargin = false;
        }
        if (!z || (i = Build.VERSION.SDK_INT) < 19) {
            this.captionTextViewSwitcher.getCurrentView().setText((CharSequence) null);
            CaptionScrollView captionScrollView = this.captionScrollView;
            if (captionScrollView != null) {
                captionScrollView.scrollTo(0, 0);
            }
            z2 = false;
        } else {
            if (i >= 23) {
                TransitionManager.endTransitions(this.needCaptionLayout ? this.pickerView : this.captionScrollView);
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
                TransitionSet duration = new TransitionSet().addTransition(new AnonymousClass65(2, isEmpty2, isEmpty)).addTransition(new AnonymousClass64(1, isEmpty2, isEmpty)).setDuration(200L);
                if (!isEmpty2) {
                    this.captionScrollView.dontChangeTopMargin = true;
                    duration.addTransition(new AnonymousClass66());
                }
                if (isEmpty2 && !isEmpty) {
                    duration.addTarget((View) this.captionTextViewSwitcher);
                }
                TransitionManager.beginDelayedTransition(this.captionScrollView, duration);
            }
            z2 = true;
        }
        if (!isEmpty) {
            Theme.createChatResources(null, true);
            if (messageObject == null || messageObject.messageOwner.entities.isEmpty()) {
                charSequence2 = Emoji.replaceEmoji(new SpannableStringBuilder(charSequence), nextView.getPaint().getFontMetricsInt(), AndroidUtilities.dp(20.0f), false);
            } else {
                SpannableString spannableString = new SpannableString(charSequence);
                messageObject.addEntitiesToText(spannableString, true, false);
                if (messageObject.isVideo()) {
                    MessageObject.addUrlsByPattern(messageObject.isOutOwner(), spannableString, false, 3, messageObject.getDuration(), false);
                }
                charSequence2 = Emoji.replaceEmoji(spannableString, nextView.getPaint().getFontMetricsInt(), AndroidUtilities.dp(20.0f), false);
            }
            this.captionTextViewSwitcher.setTag(charSequence2);
            try {
                this.captionTextViewSwitcher.setText(charSequence2, z);
                CaptionScrollView captionScrollView2 = this.captionScrollView;
                if (captionScrollView2 != null) {
                    captionScrollView2.updateTopMargin();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            nextView.setScrollY(0);
            nextView.setTextColor(-1);
            if (!this.isActionBarVisible || !(this.bottomLayout.getVisibility() == 0 || this.pickerView.getVisibility() == 0 || this.pageBlocksAdapter != null)) {
                z3 = false;
            }
            CaptionTextViewSwitcher captionTextViewSwitcher2 = this.captionTextViewSwitcher;
            if (!z3) {
                i3 = 4;
            }
            captionTextViewSwitcher2.setVisibility(i3);
        } else if (this.needCaptionLayout) {
            this.captionTextViewSwitcher.setText(LocaleController.getString("AddCaption", R.string.AddCaption), z);
            this.captionTextViewSwitcher.getCurrentView().setTextColor(-1291845633);
            this.captionTextViewSwitcher.setTag("empty");
            this.captionTextViewSwitcher.setVisibility(0);
        } else {
            this.captionTextViewSwitcher.setText(null, z);
            this.captionTextViewSwitcher.getCurrentView().setTextColor(-1);
            CaptionTextViewSwitcher captionTextViewSwitcher3 = this.captionTextViewSwitcher;
            if (z2 && !isEmpty2) {
                z3 = false;
            }
            captionTextViewSwitcher3.setVisibility(4, z3);
            this.captionTextViewSwitcher.setTag(null);
        }
    }

    public class AnonymousClass65 extends Fade {
        final boolean val$isCaptionEmpty;
        final boolean val$isCurrentCaptionEmpty;

        AnonymousClass65(int i, boolean z, boolean z2) {
            super(i);
            this.val$isCurrentCaptionEmpty = z;
            this.val$isCaptionEmpty = z2;
        }

        @Override
        public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
            Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
            if (!this.val$isCurrentCaptionEmpty && this.val$isCaptionEmpty && view == PhotoViewer.this.captionTextViewSwitcher) {
                onDisappear.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PhotoViewer.this.captionScrollView.setVisibility(4);
                        PhotoViewer.this.captionScrollView.backgroundAlpha = 1.0f;
                    }
                });
                ((ObjectAnimator) onDisappear).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        PhotoViewer.AnonymousClass65.this.lambda$onDisappear$0(valueAnimator);
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

    public class AnonymousClass64 extends Fade {
        final boolean val$isCaptionEmpty;
        final boolean val$isCurrentCaptionEmpty;

        AnonymousClass64(int i, boolean z, boolean z2) {
            super(i);
            this.val$isCurrentCaptionEmpty = z;
            this.val$isCaptionEmpty = z2;
        }

        @Override
        public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
            Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
            if (this.val$isCurrentCaptionEmpty && !this.val$isCaptionEmpty && view == PhotoViewer.this.captionTextViewSwitcher) {
                onAppear.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PhotoViewer.this.captionScrollView.backgroundAlpha = 1.0f;
                    }
                });
                ((ObjectAnimator) onAppear).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        PhotoViewer.AnonymousClass64.this.lambda$onAppear$0(valueAnimator);
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

    public class AnonymousClass66 extends Transition {
        AnonymousClass66() {
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
            if (transitionValues.view == PhotoViewer.this.captionScrollView) {
                ValueAnimator ofInt = ValueAnimator.ofInt(((Integer) transitionValues.values.get("scrollY")).intValue(), 0);
                ofInt.addListener(new AnimatorListenerAdapter() {
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
                        PhotoViewer.AnonymousClass66.this.lambda$createAnimator$0(valueAnimator);
                    }
                });
                return ofInt;
            } else if (transitionValues2.view != PhotoViewer.this.captionTextViewSwitcher || (intValue = ((Integer) transitionValues2.values.get("translationY")).intValue()) == 0) {
                return null;
            } else {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(PhotoViewer.this.captionTextViewSwitcher, View.TRANSLATION_Y, 0.0f, intValue);
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PhotoViewer.this.captionTextViewSwitcher.setTranslationY(0.0f);
                    }
                });
                return ofFloat;
            }
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

    public void checkProgress(final int r17, boolean r18, final boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.checkProgress(int, boolean, boolean):void");
    }

    public File lambda$checkProgress$66(TLObject tLObject) {
        return FileLoader.getInstance(this.currentAccount).getPathToAttach(tLObject, true);
    }

    public File lambda$checkProgress$67(TLRPC$Message tLRPC$Message) {
        return FileLoader.getInstance(this.currentAccount).getPathToMessage(tLRPC$Message);
    }

    public void lambda$checkProgress$69(final File file, File file2, FileLoader.FileResolver fileResolver, final int i, MessageObject messageObject, final boolean z, final boolean z2, final boolean z3, final boolean z4) {
        ChatActivity chatActivity;
        TLRPC$Document document;
        boolean exists = file != null ? file.exists() : false;
        final File file3 = (file2 != null || fileResolver == null) ? file2 : fileResolver.getFile();
        if (!exists && file3 != null) {
            exists = file3.exists();
        }
        final boolean z5 = exists;
        if (!z5 && i != 0 && messageObject != null && z && DownloadController.getInstance(this.currentAccount).canDownloadMedia(messageObject.messageOwner) != 0 && (((chatActivity = this.parentChatActivity) == null || chatActivity.getCurrentEncryptedChat() == null) && !messageObject.shouldEncryptPhotoOrVideo() && (document = messageObject.getDocument()) != null)) {
            FileLoader.getInstance(this.currentAccount).loadFile(document, messageObject, 0, 10);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PhotoViewer.this.lambda$checkProgress$68(i, file, file3, z5, z, z2, z3, z4);
            }
        });
    }

    public void lambda$checkProgress$68(int i, File file, File file2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = false;
        if (!this.shownControlsByEnd || this.actionBarWasShownBeforeByEnd || !this.isPlaying) {
            if (!(file == null && file2 == null) && (z || z2)) {
                if (i != 0 || !this.isPlaying) {
                    if (!z3 || (z4 && (i != 0 || !this.playerWasPlaying))) {
                        this.photoProgressViews[i].setBackgroundState(-1, z5, true);
                    } else {
                        this.photoProgressViews[i].setBackgroundState(3, z5, true);
                    }
                }
                if (i == 0) {
                    if (z) {
                        this.menuItem.hideSubItem(7);
                    } else if (!FileLoader.getInstance(this.currentAccount).isLoadingFile(this.currentFileNames[i])) {
                        this.menuItem.hideSubItem(7);
                    } else {
                        this.menuItem.showSubItem(7);
                    }
                }
            } else {
                if (!z3) {
                    this.photoProgressViews[i].setBackgroundState(0, z5, true);
                } else if (!FileLoader.getInstance(this.currentAccount).isLoadingFile(this.currentFileNames[i])) {
                    this.photoProgressViews[i].setBackgroundState(2, false, true);
                } else {
                    this.photoProgressViews[i].setBackgroundState(1, false, true);
                }
                Float fileProgress = ImageLoader.getInstance().getFileProgress(this.currentFileNames[i]);
                if (fileProgress == null) {
                    fileProgress = Float.valueOf(0.0f);
                }
                this.photoProgressViews[i].setProgress(fileProgress.floatValue(), false);
            }
            if (i == 0) {
                if (!this.isEmbedVideo && (!this.imagesArrLocals.isEmpty() || !(this.currentFileNames[0] == null || this.photoProgressViews[0].backgroundState == 0))) {
                    z6 = true;
                }
                this.canZoom = z6;
                return;
            }
            return;
        }
        this.photoProgressViews[i].setBackgroundState(3, false, false);
    }

    public int getSelectiongLength() {
        PhotoViewerCaptionEnterView photoViewerCaptionEnterView = this.captionEditText;
        if (photoViewerCaptionEnterView != null) {
            return photoViewerCaptionEnterView.getSelectionLength();
        }
        return 0;
    }

    private void setIndexToPaintingOverlay(int i, PaintingOverlay paintingOverlay) {
        ArrayList<VideoEditedInfo.MediaEntity> arrayList;
        boolean z;
        if (paintingOverlay != null) {
            paintingOverlay.reset();
            paintingOverlay.setVisibility(8);
            if (!this.imagesArrLocals.isEmpty() && i >= 0 && i < this.imagesArrLocals.size()) {
                Object obj = this.imagesArrLocals.get(i);
                String str = null;
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    z = photoEntry.isVideo;
                    str = photoEntry.paintPath;
                    arrayList = photoEntry.mediaEntities;
                } else {
                    if (obj instanceof MediaController.SearchImage) {
                        MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                        str = searchImage.paintPath;
                        arrayList = searchImage.mediaEntities;
                    } else {
                        arrayList = null;
                    }
                    z = false;
                }
                paintingOverlay.setVisibility(0);
                paintingOverlay.setData(str, arrayList, z, false);
            }
        }
    }

    private void setIndexToImage(org.telegram.messenger.ImageReceiver r33, int r34, org.telegram.ui.Components.Crop.CropTransform r35) {
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
                    if (!PipInstance.isVisible || PipInstance.disableShowCheck || messageObject == null || PipInstance.currentMessageObject == null || PipInstance.currentMessageObject.getId() != messageObject.getId() || PipInstance.currentMessageObject.getDialogId() != messageObject.getDialogId()) {
                        z2 = false;
                    }
                    return z2;
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
        return Instance != null && !Instance.pipAnimationInProgress && Instance.isVisible && messageObject != null && Instance.currentMessageObject != null && Instance.currentMessageObject.getId() == messageObject.getId() && Instance.currentMessageObject.getDialogId() == messageObject.getDialogId();
    }

    public static boolean isShowingImage(TLRPC$FileLocation tLRPC$FileLocation) {
        if (Instance == null || !Instance.isVisible || Instance.disableShowCheck || tLRPC$FileLocation == null) {
            return false;
        }
        return (Instance.currentFileLocation != null && tLRPC$FileLocation.local_id == Instance.currentFileLocation.location.local_id && tLRPC$FileLocation.volume_id == Instance.currentFileLocation.location.volume_id && tLRPC$FileLocation.dc_id == Instance.currentFileLocation.dc_id) || (Instance.currentFileLocationVideo != null && tLRPC$FileLocation.local_id == Instance.currentFileLocationVideo.location.local_id && tLRPC$FileLocation.volume_id == Instance.currentFileLocationVideo.location.volume_id && tLRPC$FileLocation.dc_id == Instance.currentFileLocationVideo.dc_id);
    }

    public static boolean isShowingImage(TLRPC$BotInlineResult tLRPC$BotInlineResult) {
        return Instance != null && Instance.isVisible && !Instance.disableShowCheck && tLRPC$BotInlineResult != null && Instance.currentBotInlineResult != null && tLRPC$BotInlineResult.id == Instance.currentBotInlineResult.id;
    }

    public static boolean isShowingImage(String str) {
        return Instance != null && Instance.isVisible && !Instance.disableShowCheck && str != null && str.equals(Instance.currentPathObject);
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

    public boolean openPhoto(MessageObject messageObject, ChatActivity chatActivity, long j, long j2, PhotoViewerProvider photoViewerProvider) {
        return openPhoto(messageObject, null, null, null, null, null, null, 0, photoViewerProvider, chatActivity, j, j2, true, null, null);
    }

    public boolean openPhoto(MessageObject messageObject, int i, ChatActivity chatActivity, long j, long j2, PhotoViewerProvider photoViewerProvider) {
        return openPhoto(messageObject, null, null, null, null, null, null, 0, photoViewerProvider, chatActivity, j, j2, true, null, Integer.valueOf(i));
    }

    public boolean openPhoto(MessageObject messageObject, long j, long j2, PhotoViewerProvider photoViewerProvider, boolean z) {
        return openPhoto(messageObject, null, null, null, null, null, null, 0, photoViewerProvider, null, j, j2, z, null, null);
    }

    public boolean openPhoto(TLRPC$FileLocation tLRPC$FileLocation, PhotoViewerProvider photoViewerProvider) {
        return openPhoto(null, tLRPC$FileLocation, null, null, null, null, null, 0, photoViewerProvider, null, 0L, 0L, true, null, null);
    }

    public boolean openPhotoWithVideo(TLRPC$FileLocation tLRPC$FileLocation, ImageLocation imageLocation, PhotoViewerProvider photoViewerProvider) {
        return openPhoto(null, tLRPC$FileLocation, null, imageLocation, null, null, null, 0, photoViewerProvider, null, 0L, 0L, true, null, null);
    }

    public boolean openPhoto(TLRPC$FileLocation tLRPC$FileLocation, ImageLocation imageLocation, PhotoViewerProvider photoViewerProvider) {
        return openPhoto(null, tLRPC$FileLocation, imageLocation, null, null, null, null, 0, photoViewerProvider, null, 0L, 0L, true, null, null);
    }

    public boolean openPhoto(ArrayList<MessageObject> arrayList, int i, long j, long j2, PhotoViewerProvider photoViewerProvider) {
        return openPhoto(arrayList.get(i), null, null, null, arrayList, null, null, i, photoViewerProvider, null, j, j2, true, null, null);
    }

    public boolean openPhoto(ArrayList<SecureDocument> arrayList, int i, PhotoViewerProvider photoViewerProvider) {
        return openPhoto(null, null, null, null, null, arrayList, null, i, photoViewerProvider, null, 0L, 0L, true, null, null);
    }

    public boolean openPhoto(int i, PageBlocksAdapter pageBlocksAdapter, PhotoViewerProvider photoViewerProvider) {
        return openPhoto(null, null, null, null, null, null, null, i, photoViewerProvider, null, 0L, 0L, true, pageBlocksAdapter, null);
    }

    public boolean openPhotoForSelect(ArrayList<Object> arrayList, int i, int i2, boolean z, PhotoViewerProvider photoViewerProvider, ChatActivity chatActivity) {
        this.isDocumentsPicker = z;
        ImageView imageView = this.pickerViewSendButton;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            if (i2 == 4 || i2 == 5) {
                this.pickerViewSendButton.setImageResource(R.drawable.attach_send);
                layoutParams.bottomMargin = AndroidUtilities.dp(19.0f);
            } else if (i2 == 1 || i2 == 3 || i2 == 10) {
                this.pickerViewSendButton.setImageResource(R.drawable.floating_check);
                this.pickerViewSendButton.setPadding(0, AndroidUtilities.dp(1.0f), 0, 0);
                layoutParams.bottomMargin = AndroidUtilities.dp(19.0f);
            } else {
                this.pickerViewSendButton.setImageResource(R.drawable.attach_send);
                layoutParams.bottomMargin = AndroidUtilities.dp(14.0f);
            }
            this.pickerViewSendButton.setLayoutParams(layoutParams);
        }
        if (this.sendPhotoType == 1 || i2 != 1 || !this.isVisible) {
            this.sendPhotoType = i2;
            return openPhoto(null, null, null, null, null, null, arrayList, i, photoViewerProvider, chatActivity, 0L, 0L, true, null, null);
        }
        this.sendPhotoType = i2;
        this.doneButtonPressed = false;
        this.actionBar.setTitle(LocaleController.formatString("Of", R.string.Of, 1, 1));
        this.placeProvider = photoViewerProvider;
        this.mergeDialogId = 0L;
        this.currentDialogId = 0L;
        this.selectedPhotosAdapter.notifyDataSetChanged();
        this.pageBlocksAdapter = null;
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.isVisible = true;
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
        onPhotoShow(null, null, null, null, null, null, arrayList, i, null);
        initCropView();
        setCropBitmap();
        return true;
    }

    private void openCurrentPhotoInPaintModeForSelect() {
        final boolean z;
        final MessageObject messageObject;
        final boolean z2;
        final File file;
        ActionBarToggleParams enableStatusBarAnimation;
        if (canSendMediaToParentChatActivity()) {
            MessageObject messageObject2 = this.currentMessageObject;
            File file2 = null;
            if (messageObject2 != null) {
                boolean z3 = messageObject2.canEditMedia() && !this.currentMessageObject.isDocument();
                z2 = this.currentMessageObject.isVideo();
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
                z = z3;
            } else {
                file = null;
                messageObject = null;
                z2 = false;
                z = false;
            }
            if (file == null || !file.exists()) {
                showDownloadAlert();
                return;
            }
            this.savedState = new SavedState(this.currentIndex, new ArrayList(this.imagesArr), this.placeProvider);
            toggleActionBar(false, true, new ActionBarToggleParams().enableStatusBarAnimation(false));
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.this.lambda$openCurrentPhotoInPaintModeForSelect$70(file, z2, messageObject, z);
                }
            }, enableStatusBarAnimation.animationDuration);
        }
    }

    public void lambda$openCurrentPhotoInPaintModeForSelect$70(File file, boolean z, final MessageObject messageObject, final boolean z2) {
        int i;
        try {
            int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 1);
            i = attributeInt != 3 ? attributeInt != 6 ? attributeInt != 8 ? 0 : 270 : 90 : 180;
        } catch (Exception e) {
            FileLog.e(e);
            i = 0;
        }
        int i2 = this.lastImageId;
        this.lastImageId = i2 - 1;
        final MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i2, 0L, file.getAbsolutePath(), i, z, 0, 0, 0L);
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
            public PlaceProviderObject getPlaceForPhoto(MessageObject messageObject2, TLRPC$FileLocation tLRPC$FileLocation, int i3, boolean z3) {
                PhotoViewerProvider photoViewerProvider2 = photoViewerProvider;
                if (photoViewerProvider2 != null) {
                    return photoViewerProvider2.getPlaceForPhoto(messageObject, null, 0, z3);
                }
                return null;
            }

            @Override
            public ImageReceiver.BitmapHolder getThumbForPhoto(MessageObject messageObject2, TLRPC$FileLocation tLRPC$FileLocation, int i3) {
                return this.thumbHolder;
            }

            @Override
            public void sendButtonPressed(int i3, VideoEditedInfo videoEditedInfo, boolean z3, int i4, boolean z4) {
                sendMedia(videoEditedInfo, z3, i4, false, z4);
            }

            @Override
            public void replaceButtonPressed(int i3, VideoEditedInfo videoEditedInfo) {
                MediaController.PhotoEntry photoEntry2 = photoEntry;
                if (photoEntry2.isCropped || photoEntry2.isPainted || photoEntry2.isFiltered || videoEditedInfo != null || !TextUtils.isEmpty(photoEntry2.caption)) {
                    sendMedia(videoEditedInfo, false, 0, true, false);
                }
            }

            @Override
            public boolean canReplace(int i3) {
                return photoViewerProvider != null && z2;
            }

            @Override
            public MessageObject getEditingMessageObject() {
                return messageObject;
            }

            private void sendMedia(VideoEditedInfo videoEditedInfo, boolean z3, int i3, boolean z4, boolean z5) {
                if (PhotoViewer.this.parentChatActivity != null) {
                    MessageObject messageObject2 = z4 ? messageObject : null;
                    if (messageObject2 != null && !TextUtils.isEmpty(photoEntry.caption)) {
                        MediaController.PhotoEntry photoEntry2 = photoEntry;
                        messageObject2.editingMessage = photoEntry2.caption;
                        messageObject2.editingMessageEntities = photoEntry2.entities;
                    }
                    MediaController.PhotoEntry photoEntry3 = photoEntry;
                    if (photoEntry3.isVideo) {
                        if (videoEditedInfo != null) {
                            AccountInstance accountInstance = PhotoViewer.this.parentChatActivity.getAccountInstance();
                            String str = photoEntry.path;
                            long dialogId = PhotoViewer.this.parentChatActivity.getDialogId();
                            MessageObject replyMessage = PhotoViewer.this.parentChatActivity.getReplyMessage();
                            MessageObject threadMessage = PhotoViewer.this.parentChatActivity.getThreadMessage();
                            MediaController.PhotoEntry photoEntry4 = photoEntry;
                            SendMessagesHelper.prepareSendingVideo(accountInstance, str, videoEditedInfo, dialogId, replyMessage, threadMessage, photoEntry4.caption, photoEntry4.entities, photoEntry4.ttl, messageObject2, z3, i3, z5);
                            return;
                        }
                        AccountInstance accountInstance2 = PhotoViewer.this.parentChatActivity.getAccountInstance();
                        String str2 = photoEntry.path;
                        long dialogId2 = PhotoViewer.this.parentChatActivity.getDialogId();
                        MessageObject replyMessage2 = PhotoViewer.this.parentChatActivity.getReplyMessage();
                        MessageObject threadMessage2 = PhotoViewer.this.parentChatActivity.getThreadMessage();
                        MediaController.PhotoEntry photoEntry5 = photoEntry;
                        SendMessagesHelper.prepareSendingVideo(accountInstance2, str2, null, dialogId2, replyMessage2, threadMessage2, photoEntry5.caption, photoEntry5.entities, photoEntry5.ttl, messageObject2, z3, i3, z5);
                    } else if (photoEntry3.imagePath != null) {
                        AccountInstance accountInstance3 = PhotoViewer.this.parentChatActivity.getAccountInstance();
                        MediaController.PhotoEntry photoEntry6 = photoEntry;
                        String str3 = photoEntry6.imagePath;
                        String str4 = photoEntry6.thumbPath;
                        long dialogId3 = PhotoViewer.this.parentChatActivity.getDialogId();
                        MessageObject replyMessage3 = PhotoViewer.this.parentChatActivity.getReplyMessage();
                        MessageObject threadMessage3 = PhotoViewer.this.parentChatActivity.getThreadMessage();
                        MediaController.PhotoEntry photoEntry7 = photoEntry;
                        SendMessagesHelper.prepareSendingPhoto(accountInstance3, str3, str4, null, dialogId3, replyMessage3, threadMessage3, photoEntry7.caption, photoEntry7.entities, photoEntry7.stickers, null, photoEntry7.ttl, messageObject2, videoEditedInfo, z3, i3, z5);
                    } else if (photoEntry3.path != null) {
                        AccountInstance accountInstance4 = PhotoViewer.this.parentChatActivity.getAccountInstance();
                        MediaController.PhotoEntry photoEntry8 = photoEntry;
                        String str5 = photoEntry8.path;
                        String str6 = photoEntry8.thumbPath;
                        long dialogId4 = PhotoViewer.this.parentChatActivity.getDialogId();
                        MessageObject replyMessage4 = PhotoViewer.this.parentChatActivity.getReplyMessage();
                        MessageObject threadMessage4 = PhotoViewer.this.parentChatActivity.getThreadMessage();
                        MediaController.PhotoEntry photoEntry9 = photoEntry;
                        SendMessagesHelper.prepareSendingPhoto(accountInstance4, str5, str6, null, dialogId4, replyMessage4, threadMessage4, photoEntry9.caption, photoEntry9.entities, photoEntry9.stickers, null, photoEntry9.ttl, messageObject2, videoEditedInfo, z3, i3, z5);
                    }
                }
            }
        };
        this.selectedPhotosAdapter.notifyDataSetChanged();
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        togglePhotosListView(false, false);
        toggleActionBar(true, false);
        ChatActivity chatActivity = this.parentChatActivity;
        if (chatActivity == null || chatActivity.getChatActivityEnterView() == null || !this.parentChatActivity.isKeyboardVisible()) {
            makeFocusable();
        } else {
            this.parentChatActivity.getChatActivityEnterView().closeKeyboard();
        }
        this.backgroundDrawable.setAlpha(255);
        this.containerView.setAlpha(1.0f);
        onPhotoShow(null, null, null, null, null, null, Collections.singletonList(photoEntry), 0, null);
        float f = 154.0f;
        this.pickerView.setTranslationY(AndroidUtilities.dp(this.isCurrentVideo ? 154.0f : 96.0f));
        this.pickerViewSendButton.setTranslationY(AndroidUtilities.dp(this.isCurrentVideo ? 154.0f : 96.0f));
        ActionBar actionBar = this.actionBar;
        actionBar.setTranslationY(-actionBar.getHeight());
        CaptionTextViewSwitcher captionTextViewSwitcher = this.captionTextViewSwitcher;
        if (!this.isCurrentVideo) {
            f = 96.0f;
        }
        captionTextViewSwitcher.setTranslationY(AndroidUtilities.dp(f));
        createPaintView();
        switchToPaintMode();
    }

    private boolean checkAnimation() {
        if (this.animationInProgress != 0 && Math.abs(this.transitionAnimationStartTime - System.currentTimeMillis()) >= 500) {
            Runnable runnable = this.animationEndRunnable;
            if (runnable != null) {
                runnable.run();
                this.animationEndRunnable = null;
            }
            this.animationInProgress = 0;
        }
        return this.animationInProgress != 0;
    }

    public void setCropBitmap() {
        VideoEditTextureView videoEditTextureView;
        if (!this.cropInitied && this.sendPhotoType == 1) {
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
                if (bitmap2 != null || this.videoTextureView != null) {
                    this.photoCropView.setBitmap(bitmap2, i, false, false, this.paintingOverlay, this.cropTransform, this.isCurrentVideo ? (VideoEditTextureView) this.videoTextureView : null, this.editState.cropState);
                }
            }
        }
    }

    private void initCropView() {
        PhotoCropView photoCropView = this.photoCropView;
        if (photoCropView != null) {
            photoCropView.setBitmap(null, 0, false, false, null, null, null, null);
            if (this.sendPhotoType == 1) {
                this.photoCropView.onAppear();
                this.photoCropView.setVisibility(0);
                this.photoCropView.setAlpha(1.0f);
                this.photoCropView.onAppeared();
                this.padImageForHorizontalInsets = true;
            }
        }
    }

    public boolean openPhoto(MessageObject messageObject, TLRPC$FileLocation tLRPC$FileLocation, ImageLocation imageLocation, ImageLocation imageLocation2, ArrayList<MessageObject> arrayList, ArrayList<SecureDocument> arrayList2, ArrayList<Object> arrayList3, int i, final PhotoViewerProvider photoViewerProvider, ChatActivity chatActivity, long j, long j2, boolean z, PageBlocksAdapter pageBlocksAdapter, final Integer num) {
        boolean z2;
        PhotoViewerProvider photoViewerProvider2;
        float f;
        TLRPC$Message tLRPC$Message;
        if (this.parentActivity != null && !this.isVisible && ((photoViewerProvider != null || !checkAnimation()) && !(messageObject == null && tLRPC$FileLocation == null && arrayList == null && arrayList3 == null && arrayList2 == null && imageLocation == null && pageBlocksAdapter == null))) {
            PlaceProviderObject placeForPhoto = photoViewerProvider.getPlaceForPhoto(messageObject, tLRPC$FileLocation, i, true);
            this.lastInsets = null;
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
                if ((chatActivity == null || chatActivity.getCurrentEncryptedChat() == null) && ((this.avatarsDialogId == 0 || !MessagesController.getInstance(this.currentAccount).isChatNoForwards(-this.avatarsDialogId)) && (messageObject == null || (!MessagesController.getInstance(this.currentAccount).isChatNoForwards(messageObject.getChatId()) && ((tLRPC$Message = messageObject.messageOwner) == null || !tLRPC$Message.noforwards))))) {
                    this.windowLayoutParams.flags &= -8193;
                } else {
                    this.windowLayoutParams.flags |= 8192;
                }
                this.windowLayoutParams.softInputMode = (this.useSmoothKeyboard ? 32 : 16) | 256;
                this.windowView.setFocusable(false);
                this.containerView.setFocusable(false);
                windowManager.addView(this.windowView, this.windowLayoutParams);
                onShowView();
                this.hasCaptionForAllMedia = false;
                this.doneButtonPressed = false;
                this.allowShowFullscreenButton = true;
                this.parentChatActivity = chatActivity;
                this.lastTitle = null;
                this.isEmbedVideo = num != null;
                this.actionBar.setTitle(LocaleController.formatString("Of", R.string.Of, 1, 1));
                this.actionBar.setTitleScrollNonFitText(false);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoadFailed);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoaded);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileLoadProgressChanged);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.mediaCountDidLoad);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.mediaDidLoad);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogPhotosLoaded);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagesDeleted);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.filePreparingFailed);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileNewChunkAvailable);
                this.placeProvider = photoViewerProvider;
                this.mergeDialogId = j2;
                this.currentDialogId = j;
                this.selectedPhotosAdapter.notifyDataSetChanged();
                this.pageBlocksAdapter = pageBlocksAdapter;
                if (this.velocityTracker == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                }
                this.isVisible = true;
                togglePhotosListView(false, false);
                boolean z3 = !z;
                this.openedFullScreenVideo = z3;
                if (z3) {
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
                    z2 = true;
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
                    for (int i2 = 0; i2 < animatingImageViews.length; i2++) {
                        animatingImageViews[i2].setAnimationValues(this.animationValues);
                        animatingImageViews[i2].setVisibility(0);
                        animatingImageViews[i2].setRadius(placeForPhoto.radius);
                        animatingImageViews[i2].setOrientation(orientation);
                        animatingImageViews[i2].setImageBitmap(placeForPhoto.thumb);
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
                    for (int i3 = 0; i3 < animatingImageViews.length; i3++) {
                        if (animatingImageViews.length > 1) {
                            f = 0.0f;
                            animatingImageViews[i3].setAlpha(0.0f);
                        } else {
                            f = 0.0f;
                            animatingImageViews[i3].setAlpha(1.0f);
                        }
                        animatingImageViews[i3].setPivotX(f);
                        animatingImageViews[i3].setPivotY(f);
                        animatingImageViews[i3].setScaleX(placeForPhoto.scale);
                        animatingImageViews[i3].setScaleY(placeForPhoto.scale);
                        animatingImageViews[i3].setTranslationX(placeForPhoto.viewX + (drawRegion.left * placeForPhoto.scale));
                        animatingImageViews[i3].setTranslationY(placeForPhoto.viewY + (drawRegion.top * placeForPhoto.scale));
                        animatingImageViews[i3].setLayoutParams(layoutParams2);
                    }
                    this.windowView.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass68(animatingImageViews, layoutParams2, f2, placeForPhoto, f3, pageBlocksAdapter, arrayList3, num, photoViewerProvider));
                } else {
                    z2 = true;
                    if (!(arrayList3 == null || this.sendPhotoType == 3 || ((photoViewerProvider2 = this.placeProvider) != null && photoViewerProvider2.closeKeyboard()))) {
                        makeFocusable();
                    }
                    this.containerView.setAlpha(1.0f);
                    onPhotoShow(messageObject, tLRPC$FileLocation, imageLocation, imageLocation2, arrayList, arrayList2, arrayList3, i, placeForPhoto);
                    initCropView();
                    setCropBitmap();
                    ChatActivity chatActivity2 = this.parentChatActivity;
                    if (chatActivity2 != null) {
                        chatActivity2.getUndoView().hide(false, 1);
                        this.parentChatActivity.getFragmentView().invalidate();
                    }
                    this.windowView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
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
                            PhotoViewer.this.cameraItem.setTranslationY(AndroidUtilities.dp(32.0f));
                            PhotoViewer.this.cameraItem.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
                            PhotoViewer.this.videoPreviewFrame.setTranslationY(AndroidUtilities.dp(32.0f));
                            PhotoViewer.this.videoPreviewFrame.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(cubicBezierInterpolator).start();
                            PhotoViewer.this.containerView.setAlpha(0.0f);
                            PhotoViewer.this.backgroundDrawable.setAlpha(0);
                            PhotoViewer.this.animationInProgress = 4;
                            PhotoViewer.this.containerView.invalidate();
                            AnimatorSet animatorSet = new AnimatorSet();
                            ObjectAnimator duration2 = ObjectAnimator.ofFloat(PhotoViewer.this.pickerView, View.TRANSLATION_Y, PhotoViewer.this.pickerView.getTranslationY(), 0.0f).setDuration(220L);
                            duration2.setInterpolator(cubicBezierInterpolator);
                            animatorSet.playTogether(ObjectAnimator.ofFloat(PhotoViewer.this.containerView, View.ALPHA, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(PhotoViewer.this.navigationBar, View.ALPHA, 0.0f, 1.0f).setDuration(220L), duration2);
                            animatorSet.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    super.onAnimationEnd(animator);
                                    PhotoViewer.this.animationInProgress = 0;
                                    PhotoViewer.this.backgroundDrawable.setAlpha(255);
                                    PhotoViewer.this.containerView.invalidate();
                                    PhotoViewer.this.pickerView.setTranslationY(0.0f);
                                    if (PhotoViewer.this.isEmbedVideo) {
                                        AnonymousClass69 r2 = AnonymousClass69.this;
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
                    obtain.setEventType(16384);
                    obtain.getText().add(LocaleController.getString("AccDescrPhotoViewer", R.string.AccDescrPhotoViewer));
                    accessibilityManager.sendAccessibilityEvent(obtain);
                }
                return z2;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return false;
    }

    public class AnonymousClass68 implements ViewTreeObserver.OnPreDrawListener {
        final ClippingImageView[] val$animatingImageViews;
        final Integer val$embedSeekTime;
        final ViewGroup.LayoutParams val$layoutParams;
        final float val$left;
        final PlaceProviderObject val$object;
        final PageBlocksAdapter val$pageBlocksAdapter;
        final ArrayList val$photos;
        final PhotoViewerProvider val$provider;
        final float val$top;

        AnonymousClass68(ClippingImageView[] clippingImageViewArr, ViewGroup.LayoutParams layoutParams, float f, PlaceProviderObject placeProviderObject, float f2, PageBlocksAdapter pageBlocksAdapter, ArrayList arrayList, Integer num, PhotoViewerProvider photoViewerProvider) {
            this.val$animatingImageViews = clippingImageViewArr;
            this.val$layoutParams = layoutParams;
            this.val$left = f;
            this.val$object = placeProviderObject;
            this.val$top = f2;
            this.val$pageBlocksAdapter = pageBlocksAdapter;
            this.val$photos = arrayList;
            this.val$embedSeekTime = num;
            this.val$provider = photoViewerProvider;
        }

        @Override
        public boolean onPreDraw() {
            float f;
            float f2;
            float f3;
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
                float f4 = PhotoViewer.this.isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0;
                float measuredHeight = (PhotoViewer.this.photoCropView.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - f4;
                float measuredWidth = PhotoViewer.this.photoCropView.getMeasuredWidth() / 2.0f;
                float f5 = f4 + (measuredHeight / 2.0f);
                float min = (Math.min(PhotoViewer.this.photoCropView.getMeasuredWidth(), measuredHeight) - (AndroidUtilities.dp(16.0f) * 2)) / 2.0f;
                float f6 = f5 - min;
                ViewGroup.LayoutParams layoutParams = this.val$layoutParams;
                float f7 = (f5 + min) - f6;
                f2 = Math.max(((measuredWidth + min) - (measuredWidth - min)) / layoutParams.width, f7 / layoutParams.height);
                f = f6 + ((f7 - (this.val$layoutParams.height * f2)) / 2.0f);
                f3 = ((((PhotoViewer.this.windowView.getMeasuredWidth() - PhotoViewer.this.getLeftInset()) - PhotoViewer.this.getRightInset()) - (this.val$layoutParams.width * f2)) / 2.0f) + PhotoViewer.this.getLeftInset();
            } else {
                f2 = Math.min(PhotoViewer.this.windowView.getMeasuredWidth() / this.val$layoutParams.width, (AndroidUtilities.displaySize.y + (PhotoViewer.this.isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0)) / this.val$layoutParams.height);
                f = ((AndroidUtilities.displaySize.y + (PhotoViewer.this.isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0)) - (this.val$layoutParams.height * f2)) / 2.0f;
                f3 = (PhotoViewer.this.windowView.getMeasuredWidth() - (this.val$layoutParams.width * f2)) / 2.0f;
            }
            int abs = (int) Math.abs(this.val$left - this.val$object.imageReceiver.getImageX());
            int abs2 = (int) Math.abs(this.val$top - this.val$object.imageReceiver.getImageY());
            if (this.val$pageBlocksAdapter != null && this.val$object.imageReceiver.isAspectFit()) {
                abs = 0;
            }
            int[] iArr = new int[2];
            this.val$object.parentView.getLocationInWindow(iArr);
            int i2 = iArr[1];
            int i3 = Build.VERSION.SDK_INT;
            int i4 = (i3 >= 21 || PhotoViewer.this.inBubbleMode) ? 0 : AndroidUtilities.statusBarHeight;
            int i5 = this.val$object.viewY;
            float f8 = this.val$top;
            int i6 = (int) (((i2 - i4) - (i5 + f8)) + placeProviderObject.clipTopAddition);
            if (i6 < 0) {
                i6 = 0;
            }
            int height = (int) ((((i5 + f8) + this.val$layoutParams.height) - ((iArr[1] + placeProviderObject.parentView.getHeight()) - ((i3 >= 21 || PhotoViewer.this.inBubbleMode) ? 0 : AndroidUtilities.statusBarHeight))) + this.val$object.clipBottomAddition);
            if (height < 0) {
                height = 0;
            }
            int max = Math.max(i6, abs2);
            int max2 = Math.max(height, abs2);
            PhotoViewer.this.animationValues[0][0] = PhotoViewer.this.animatingImageView.getScaleX();
            PhotoViewer.this.animationValues[0][1] = PhotoViewer.this.animatingImageView.getScaleY();
            PhotoViewer.this.animationValues[0][2] = PhotoViewer.this.animatingImageView.getTranslationX();
            int i7 = 3;
            PhotoViewer.this.animationValues[0][3] = PhotoViewer.this.animatingImageView.getTranslationY();
            float f9 = abs;
            PhotoViewer.this.animationValues[0][4] = this.val$object.scale * f9;
            PhotoViewer.this.animationValues[0][5] = max * this.val$object.scale;
            PhotoViewer.this.animationValues[0][6] = max2 * this.val$object.scale;
            int[] radius = PhotoViewer.this.animatingImageView.getRadius();
            int i8 = 0;
            while (true) {
                float f10 = 0.0f;
                if (i8 >= 4) {
                    break;
                }
                float[] fArr = PhotoViewer.this.animationValues[0];
                int i9 = i8 + 7;
                if (radius != null) {
                    f10 = radius[i8];
                }
                fArr[i9] = f10;
                i8++;
            }
            PhotoViewer.this.animationValues[0][11] = abs2 * this.val$object.scale;
            PhotoViewer.this.animationValues[0][12] = f9 * this.val$object.scale;
            PhotoViewer.this.animationValues[1][0] = f2;
            PhotoViewer.this.animationValues[1][1] = f2;
            PhotoViewer.this.animationValues[1][2] = f3;
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
            int i10 = 0;
            while (true) {
                ClippingImageView[] clippingImageViewArr4 = this.val$animatingImageViews;
                if (i10 >= clippingImageViewArr4.length) {
                    break;
                }
                clippingImageViewArr4[i10].setAnimationProgress(0.0f);
                i10++;
            }
            PhotoViewer.this.backgroundDrawable.setAlpha(0);
            PhotoViewer.this.containerView.setAlpha(0.0f);
            PhotoViewer.this.navigationBar.setAlpha(0.0f);
            PhotoViewer photoViewer = PhotoViewer.this;
            final ClippingImageView[] clippingImageViewArr5 = this.val$animatingImageViews;
            final ArrayList arrayList = this.val$photos;
            final Integer num = this.val$embedSeekTime;
            final PhotoViewerProvider photoViewerProvider = this.val$provider;
            photoViewer.animationEndRunnable = new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.AnonymousClass68.this.lambda$onPreDraw$0(clippingImageViewArr5, arrayList, num, photoViewerProvider);
                }
            };
            if (!PhotoViewer.this.openedFullScreenVideo) {
                final AnimatorSet animatorSet = new AnimatorSet();
                if (PhotoViewer.this.sendPhotoType != 1) {
                    i7 = 2;
                }
                ClippingImageView[] clippingImageViewArr6 = this.val$animatingImageViews;
                ArrayList arrayList2 = new ArrayList(i7 + clippingImageViewArr6.length + (clippingImageViewArr6.length > 1 ? 1 : 0));
                int i11 = 0;
                while (true) {
                    clippingImageViewArr = this.val$animatingImageViews;
                    if (i11 >= clippingImageViewArr.length) {
                        break;
                    }
                    arrayList2.add(ObjectAnimator.ofFloat(clippingImageViewArr[i11], AnimationProperties.CLIPPING_IMAGE_VIEW_PROGRESS, 0.0f, 1.0f));
                    i11++;
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
                float[] fArr2 = new float[i];
                
                fArr2[0] = 0.0f;
                fArr2[1] = 1.0f;
                arrayList2.add(ObjectAnimator.ofFloat(PhotoViewer.this.containerView, View.ALPHA, fArr2));
                float[] fArr3 = new float[i];
                
                fArr3[0] = 0.0f;
                fArr3[1] = 1.0f;
                arrayList2.add(ObjectAnimator.ofFloat(PhotoViewer.this.navigationBar, View.ALPHA, fArr3));
                if (PhotoViewer.this.sendPhotoType == 1) {
                    float[] fArr4 = new float[i];
                    
                    fArr4[0] = 0.0f;
                    fArr4[1] = 1.0f;
                    arrayList2.add(ObjectAnimator.ofFloat(PhotoViewer.this.photoCropView, View.ALPHA, fArr4));
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.setDuration(200L);
                final int i12 = PhotoViewer.this.currentAccount;
                animatorSet.addListener(new AnonymousClass1(i12));
                if (Build.VERSION.SDK_INT >= 18) {
                    PhotoViewer.this.containerView.setLayerType(2, null);
                }
                PhotoViewer.this.setCaptionHwLayerEnabled(false);
                PhotoViewer.this.transitionAnimationStartTime = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PhotoViewer.AnonymousClass68.this.lambda$onPreDraw$1(i12, animatorSet);
                    }
                });
            } else {
                if (PhotoViewer.this.animationEndRunnable != null) {
                    PhotoViewer.this.animationEndRunnable.run();
                    PhotoViewer.this.animationEndRunnable = null;
                }
                PhotoViewer.this.containerView.setAlpha(1.0f);
                PhotoViewer.this.backgroundDrawable.setAlpha(255);
                int i13 = 0;
                while (true) {
                    ClippingImageView[] clippingImageViewArr7 = this.val$animatingImageViews;
                    if (i13 >= clippingImageViewArr7.length) {
                        break;
                    }
                    clippingImageViewArr7[i13].setAnimationProgress(1.0f);
                    i13++;
                }
                if (PhotoViewer.this.sendPhotoType == 1) {
                    PhotoViewer.this.photoCropView.setAlpha(1.0f);
                }
            }
            BackgroundDrawable backgroundDrawable = PhotoViewer.this.backgroundDrawable;
            final PlaceProviderObject placeProviderObject2 = this.val$object;
            backgroundDrawable.drawRunnable = new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.AnonymousClass68.this.lambda$onPreDraw$2(placeProviderObject2);
                }
            };
            if (!(PhotoViewer.this.parentChatActivity == null || PhotoViewer.this.parentChatActivity.getFragmentView() == null)) {
                PhotoViewer.this.parentChatActivity.getUndoView().hide(false, 1);
                PhotoViewer.this.parentChatActivity.getFragmentView().invalidate();
            }
            return true;
        }

        public void lambda$onPreDraw$0(ClippingImageView[] clippingImageViewArr, ArrayList arrayList, Integer num, PhotoViewerProvider photoViewerProvider) {
            PhotoViewer.this.animationEndRunnable = null;
            if (!(PhotoViewer.this.containerView == null || PhotoViewer.this.windowView == null)) {
                if (Build.VERSION.SDK_INT >= 18) {
                    PhotoViewer.this.containerView.setLayerType(0, null);
                }
                PhotoViewer.this.animationInProgress = 0;
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
                if (!(arrayList == null || PhotoViewer.this.sendPhotoType == 3 || (PhotoViewer.this.placeProvider != null && PhotoViewer.this.placeProvider.closeKeyboard()))) {
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
        }

        public class AnonymousClass1 extends AnimatorListenerAdapter {
            final int val$account;

            AnonymousClass1(int i) {
                this.val$account = i;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                final int i = this.val$account;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PhotoViewer.AnonymousClass68.AnonymousClass1.this.lambda$onAnimationEnd$0(i);
                    }
                });
            }

            public void lambda$onAnimationEnd$0(int i) {
                NotificationCenter.getInstance(i).onAnimationFinish(PhotoViewer.this.transitionIndex);
                if (PhotoViewer.this.animationEndRunnable != null) {
                    PhotoViewer.this.animationEndRunnable.run();
                    PhotoViewer.this.animationEndRunnable = null;
                }
                PhotoViewer.this.setCaptionHwLayerEnabled(true);
            }
        }

        public void lambda$onPreDraw$1(int i, AnimatorSet animatorSet) {
            PhotoViewer.this.transitionIndex = NotificationCenter.getInstance(i).setAnimationInProgress(PhotoViewer.this.transitionIndex, new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.mediaCountDidLoad, NotificationCenter.mediaDidLoad, NotificationCenter.dialogPhotosLoaded});
            animatorSet.start();
        }

        public void lambda$onPreDraw$2(PlaceProviderObject placeProviderObject) {
            PhotoViewer.this.disableShowCheck = false;
            placeProviderObject.imageReceiver.setVisible(false, true);
        }
    }

    public void initEmbedVideo(int i) {
        if (this.isEmbedVideo) {
            PhotoViewerWebView photoViewerWebView = new PhotoViewerWebView(this.parentActivity, this.pipItem) {
                Rect rect = new Rect();

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

                @Override
                protected void processTouch(MotionEvent motionEvent) {
                    PhotoViewer.this.gestureDetector.onTouchEvent(motionEvent);
                }
            };
            this.photoViewerWebView = photoViewerWebView;
            photoViewerWebView.init(i, this.currentMessageObject.messageOwner.media.webpage);
            this.photoViewerWebView.setPlaybackSpeed(this.currentVideoSpeed);
            this.containerView.addView(this.photoViewerWebView, 0, LayoutHelper.createFrame(-1, -1.0f));
        }
    }

    public void makeFocusable() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.windowLayoutParams.flags = -2147417856;
        } else {
            this.windowLayoutParams.flags = 0;
        }
        this.windowLayoutParams.softInputMode = (this.useSmoothKeyboard ? 32 : 16) | 256;
        try {
            ((WindowManager) this.parentActivity.getSystemService("window")).updateViewLayout(this.windowView, this.windowLayoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.windowView.setFocusable(true);
        this.containerView.setFocusable(true);
    }

    public void requestAdjustToNothing() {
        this.windowLayoutParams.softInputMode = 48;
        try {
            ((WindowManager) this.parentActivity.getSystemService("window")).updateViewLayout(this.windowView, this.windowLayoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void requestAdjust() {
        this.windowLayoutParams.softInputMode = (this.useSmoothKeyboard ? 32 : 16) | 256;
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

    public void closePhoto(boolean z, boolean z2) {
        AnimatedFileDrawable animatedFileDrawable;
        RectF rectF;
        float f;
        float f2;
        int[] iArr;
        AnimatedFileDrawable animation;
        Bitmap animatedBitmap;
        int i;
        int i2;
        if (z2 || (i2 = this.currentEditMode) == 0) {
            QualityChooseView qualityChooseView = this.qualityChooseView;
            if (qualityChooseView == null || qualityChooseView.getTag() == null) {
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
                if (Build.VERSION.SDK_INT >= 21 && this.containerView != null) {
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
                        this.containerView.removeView(this.photoPaintView);
                        this.photoPaintView = null;
                        this.savedState = null;
                    }
                    this.currentEditMode = 0;
                }
                View view = this.navigationBar;
                if (view != null) {
                    view.setVisibility(0);
                }
                FrameLayout frameLayout = this.windowView;
                if (frameLayout != null) {
                    frameLayout.setClipChildren(false);
                }
                if (this.parentActivity == null) {
                    return;
                }
                if (!(this.isInline || this.isVisible) || checkAnimation() || this.placeProvider == null) {
                    return;
                }
                if (!this.captionEditText.hideActionMode() || z2) {
                    Activity activity = this.parentActivity;
                    if (!(activity == null || this.fullscreenedByButton == 0)) {
                        activity.setRequestedOrientation(this.prevOrientation);
                        this.fullscreenedByButton = 0;
                        this.wasRotated = false;
                    }
                    if (!this.doneButtonPressed && !this.imagesArrLocals.isEmpty() && (i = this.currentIndex) >= 0 && i < this.imagesArrLocals.size()) {
                        Object obj = this.imagesArrLocals.get(this.currentIndex);
                        if (obj instanceof MediaController.MediaEditState) {
                            ((MediaController.MediaEditState) obj).editedInfo = getCurrentVideoEditedInfo();
                        }
                    }
                    final PlaceProviderObject placeForPhoto = this.placeProvider.getPlaceForPhoto(this.currentMessageObject, getFileLocation(this.currentFileLocation), this.currentIndex, true);
                    if (!(this.videoPlayer == null || placeForPhoto == null || (animation = placeForPhoto.imageReceiver.getAnimation()) == null)) {
                        if (this.textureUploaded && (animatedBitmap = animation.getAnimatedBitmap()) != null) {
                            try {
                                Bitmap bitmap = this.videoTextureView.getBitmap(animatedBitmap.getWidth(), animatedBitmap.getHeight());
                                new Canvas(animatedBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                bitmap.recycle();
                            } catch (Throwable th) {
                                FileLog.e(th);
                            }
                        }
                        if (this.currentMessageObject != null) {
                            long startTime = animation.getStartTime();
                            long currentPosition = this.videoPlayer.getCurrentPosition();
                            if (startTime <= 0) {
                                startTime = 0;
                            }
                            animation.seekTo(currentPosition + startTime, !FileLoader.getInstance(this.currentMessageObject.currentAccount).isLoadingVideo(this.currentMessageObject.getDocument(), true));
                        }
                        placeForPhoto.imageReceiver.setAllowStartAnimation(true);
                        placeForPhoto.imageReceiver.startAnimation();
                    }
                    if (!this.doneButtonPressed) {
                        releasePlayer(true);
                    }
                    PhotoViewerWebView photoViewerWebView = this.photoViewerWebView;
                    if (photoViewerWebView != null) {
                        photoViewerWebView.release();
                        this.containerView.removeView(this.photoViewerWebView);
                        this.photoViewerWebView = null;
                    }
                    this.captionEditText.onDestroy();
                    ChatActivity chatActivity = this.parentChatActivity;
                    if (!(chatActivity == null || chatActivity.getFragmentView() == null)) {
                        this.parentChatActivity.getFragmentView().invalidate();
                    }
                    this.parentChatActivity = null;
                    removeObservers();
                    this.isActionBarVisible = false;
                    VelocityTracker velocityTracker = this.velocityTracker;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.velocityTracker = null;
                    }
                    if (this.isInline) {
                        this.isInline = false;
                        this.animationInProgress = 0;
                        onPhotoClosed(placeForPhoto);
                        this.containerView.setScaleX(1.0f);
                        this.containerView.setScaleY(1.0f);
                        return;
                    }
                    if (z) {
                        ClippingImageView[] animatingImageViews = getAnimatingImageViews(placeForPhoto);
                        for (int i4 = 0; i4 < animatingImageViews.length; i4++) {
                            animatingImageViews[i4].setAnimationValues(this.animationValues);
                            animatingImageViews[i4].setVisibility(0);
                        }
                        this.animationInProgress = 3;
                        this.containerView.invalidate();
                        AnimatorSet animatorSet = new AnimatorSet();
                        ViewGroup.LayoutParams layoutParams = this.animatingImageView.getLayoutParams();
                        if (placeForPhoto != null) {
                            rectF = placeForPhoto.imageReceiver.getDrawRegion();
                            layoutParams.width = (int) rectF.width();
                            layoutParams.height = (int) rectF.height();
                            int orientation = placeForPhoto.imageReceiver.getOrientation();
                            int animatedOrientation = placeForPhoto.imageReceiver.getAnimatedOrientation();
                            if (animatedOrientation != 0) {
                                orientation = animatedOrientation;
                            }
                            for (int i5 = 0; i5 < animatingImageViews.length; i5++) {
                                animatingImageViews[i5].setOrientation(orientation);
                                animatingImageViews[i5].setImageBitmap(placeForPhoto.thumb);
                            }
                        } else {
                            layoutParams.width = (int) this.centerImage.getImageWidth();
                            layoutParams.height = (int) this.centerImage.getImageHeight();
                            for (int i6 = 0; i6 < animatingImageViews.length; i6++) {
                                animatingImageViews[i6].setOrientation(this.centerImage.getOrientation());
                                animatingImageViews[i6].setImageBitmap(this.centerImage.getBitmapSafe());
                            }
                            rectF = null;
                        }
                        if (layoutParams.width <= 0) {
                            layoutParams.width = 100;
                        }
                        if (layoutParams.height <= 0) {
                            layoutParams.height = 100;
                        }
                        if (this.sendPhotoType == 1) {
                            float min = Math.min(this.photoCropView.getMeasuredWidth(), (this.photoCropView.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - (isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0)) - (AndroidUtilities.dp(16.0f) * 2);
                            f = Math.max(min / layoutParams.width, min / layoutParams.height);
                        } else {
                            f = Math.min(this.windowView.getMeasuredWidth() / layoutParams.width, (AndroidUtilities.displaySize.y + (isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0)) / layoutParams.height);
                        }
                        float f3 = this.scale;
                        float f4 = layoutParams.height * f3 * f;
                        float measuredWidth = (this.windowView.getMeasuredWidth() - ((layoutParams.width * f3) * f)) / 2.0f;
                        if (this.sendPhotoType == 1) {
                            f2 = this.photoCropView.getMeasuredHeight() - (isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0);
                        } else {
                            f2 = AndroidUtilities.displaySize.y + (isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0);
                        }
                        float f5 = (f2 - f4) / 2.0f;
                        for (int i7 = 0; i7 < animatingImageViews.length; i7++) {
                            animatingImageViews[i7].setLayoutParams(layoutParams);
                            animatingImageViews[i7].setTranslationX(this.translationX + measuredWidth);
                            animatingImageViews[i7].setTranslationY(this.translationY + f5);
                            animatingImageViews[i7].setScaleX(this.scale * f);
                            animatingImageViews[i7].setScaleY(this.scale * f);
                        }
                        if (placeForPhoto != null) {
                            placeForPhoto.imageReceiver.setVisible(false, true);
                            int abs = (int) Math.abs(rectF.left - placeForPhoto.imageReceiver.getImageX());
                            int abs2 = (int) Math.abs(rectF.top - placeForPhoto.imageReceiver.getImageY());
                            if (this.pageBlocksAdapter != null && placeForPhoto.imageReceiver.isAspectFit()) {
                                abs = 0;
                            }
                            int[] iArr2 = new int[2];
                            placeForPhoto.parentView.getLocationInWindow(iArr2);
                            int i8 = iArr2[1];
                            int i9 = Build.VERSION.SDK_INT;
                            int i10 = i9 >= 21 ? 0 : AndroidUtilities.statusBarHeight;
                            int i11 = placeForPhoto.viewY;
                            float f6 = rectF.top;
                            int i12 = (int) (((i8 - i10) - (i11 + f6)) + placeForPhoto.clipTopAddition);
                            if (i12 < 0) {
                                i12 = 0;
                            }
                            int height = (int) ((((i11 + f6) + (rectF.bottom - f6)) - ((iArr2[1] + placeForPhoto.parentView.getHeight()) - (i9 >= 21 ? 0 : AndroidUtilities.statusBarHeight))) + placeForPhoto.clipBottomAddition);
                            if (height < 0) {
                                height = 0;
                            }
                            int max = Math.max(i12, abs2);
                            int max2 = Math.max(height, abs2);
                            this.animationValues[0][0] = this.animatingImageView.getScaleX();
                            this.animationValues[0][1] = this.animatingImageView.getScaleY();
                            this.animationValues[0][2] = this.animatingImageView.getTranslationX();
                            this.animationValues[0][3] = this.animatingImageView.getTranslationY();
                            float[][] fArr = this.animationValues;
                            fArr[0][4] = 0.0f;
                            fArr[0][5] = 0.0f;
                            fArr[0][6] = 0.0f;
                            fArr[0][7] = 0.0f;
                            fArr[0][8] = 0.0f;
                            fArr[0][9] = 0.0f;
                            fArr[0][10] = 0.0f;
                            fArr[0][11] = 0.0f;
                            fArr[0][12] = 0.0f;
                            float[] fArr2 = fArr[1];
                            float f7 = placeForPhoto.scale;
                            fArr2[0] = f7;
                            fArr[1][1] = f7;
                            fArr[1][2] = placeForPhoto.viewX + (rectF.left * f7);
                            fArr[1][3] = placeForPhoto.viewY + (rectF.top * f7);
                            float f8 = abs;
                            fArr[1][4] = f8 * f7;
                            fArr[1][5] = max * f7;
                            fArr[1][6] = max2 * f7;
                            int i13 = 0;
                            for (int i14 = 4; i13 < i14; i14 = 4) {
                                this.animationValues[1][i13 + 7] = placeForPhoto.radius != null ? iArr[i13] : 0.0f;
                                i13++;
                            }
                            float[][] fArr3 = this.animationValues;
                            float[] fArr4 = fArr3[1];
                            float f9 = placeForPhoto.scale;
                            fArr4[11] = abs2 * f9;
                            fArr3[1][12] = f8 * f9;
                            ArrayList arrayList = new ArrayList((this.sendPhotoType == 1 ? 3 : 2) + animatingImageViews.length + (animatingImageViews.length > 1 ? 1 : 0));
                            for (ClippingImageView clippingImageView : animatingImageViews) {
                                arrayList.add(ObjectAnimator.ofFloat(clippingImageView, AnimationProperties.CLIPPING_IMAGE_VIEW_PROGRESS, 0.0f, 1.0f));
                            }
                            if (animatingImageViews.length > 1) {
                                arrayList.add(ObjectAnimator.ofFloat(this.animatingImageView, View.ALPHA, 0.0f));
                                animatingImageViews[1].setAdditionalTranslationX(-getLeftInset());
                            }
                            arrayList.add(ObjectAnimator.ofInt(this.backgroundDrawable, (Property<BackgroundDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, 0));
                            arrayList.add(ObjectAnimator.ofFloat(this.containerView, View.ALPHA, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.navigationBar, View.ALPHA, 0.0f));
                            if (this.sendPhotoType == 1) {
                                arrayList.add(ObjectAnimator.ofFloat(this.photoCropView, View.ALPHA, 0.0f));
                            }
                            animatorSet.playTogether(arrayList);
                        } else {
                            int i15 = AndroidUtilities.displaySize.y + (isStatusBarVisible() ? AndroidUtilities.statusBarHeight : 0);
                            Animator[] animatorArr = new Animator[5];
                            animatorArr[0] = ObjectAnimator.ofInt(this.backgroundDrawable, (Property<BackgroundDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, 0);
                            animatorArr[1] = ObjectAnimator.ofFloat(this.animatingImageView, View.ALPHA, 0.0f);
                            ClippingImageView clippingImageView2 = this.animatingImageView;
                            Property property = View.TRANSLATION_Y;
                            float[] fArr5 = new float[1];
                            if (this.translationY < 0.0f) {
                                i15 = -i15;
                            }
                            fArr5[0] = i15;
                            animatorArr[2] = ObjectAnimator.ofFloat(clippingImageView2, property, fArr5);
                            animatorArr[3] = ObjectAnimator.ofFloat(this.containerView, View.ALPHA, 0.0f);
                            animatorArr[4] = ObjectAnimator.ofFloat(this.navigationBar, View.ALPHA, 0.0f);
                            animatorSet.playTogether(animatorArr);
                        }
                        this.animationEndRunnable = new Runnable() {
                            @Override
                            public final void run() {
                                PhotoViewer.this.lambda$closePhoto$71(placeForPhoto);
                            }
                        };
                        animatorSet.setDuration(200L);
                        animatorSet.addListener(new AnonymousClass71());
                        this.transitionAnimationStartTime = System.currentTimeMillis();
                        if (Build.VERSION.SDK_INT >= 18) {
                            this.containerView.setLayerType(2, null);
                        }
                        animatorSet.start();
                        animatedFileDrawable = null;
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.containerView, View.SCALE_X, 0.9f), ObjectAnimator.ofFloat(this.containerView, View.SCALE_Y, 0.9f), ObjectAnimator.ofInt(this.backgroundDrawable, (Property<BackgroundDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, 0), ObjectAnimator.ofFloat(this.containerView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.navigationBar, View.ALPHA, 0.0f));
                        this.animationInProgress = 2;
                        this.animationEndRunnable = new Runnable() {
                            @Override
                            public final void run() {
                                PhotoViewer.this.lambda$closePhoto$72(placeForPhoto);
                            }
                        };
                        animatorSet2.setDuration(200L);
                        animatorSet2.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (PhotoViewer.this.animationEndRunnable != null) {
                                    ChatActivity chatActivity2 = PhotoViewer.this.parentChatActivity;
                                    if (chatActivity2 == null && PhotoViewer.this.parentAlert != null) {
                                        BaseFragment baseFragment = PhotoViewer.this.parentAlert.getBaseFragment();
                                        if (baseFragment instanceof ChatActivity) {
                                            chatActivity2 = (ChatActivity) baseFragment;
                                        }
                                    }
                                    if (chatActivity2 != null) {
                                        chatActivity2.lambda$openDiscussionMessageChat$225(PhotoViewer.this.animationEndRunnable);
                                        return;
                                    }
                                    PhotoViewer.this.animationEndRunnable.run();
                                    PhotoViewer.this.animationEndRunnable = null;
                                }
                            }
                        });
                        this.transitionAnimationStartTime = System.currentTimeMillis();
                        if (Build.VERSION.SDK_INT >= 18) {
                            animatedFileDrawable = null;
                            this.containerView.setLayerType(2, null);
                        } else {
                            animatedFileDrawable = null;
                        }
                        animatorSet2.start();
                    }
                    AnimatedFileDrawable animatedFileDrawable2 = this.currentAnimation;
                    if (animatedFileDrawable2 != null) {
                        animatedFileDrawable2.removeSecondParentView(this.containerView);
                        this.currentAnimation = animatedFileDrawable;
                        this.centerImage.setImageBitmap(animatedFileDrawable);
                    }
                    PhotoViewerProvider photoViewerProvider = this.placeProvider;
                    if (!(photoViewerProvider == null || photoViewerProvider.canScrollAway())) {
                        this.placeProvider.cancelButtonPressed();
                        return;
                    }
                    return;
                }
                return;
            }
            this.qualityPicker.cancelButton.callOnClick();
        } else if (i2 != 3 || this.photoPaintView == null) {
            if (i2 == 1) {
                this.cropTransform.setViewTransform(this.previousHasTransform, this.previousCropPx, this.previousCropPy, this.previousCropRotation, this.previousCropOrientation, this.previousCropScale, 1.0f, 1.0f, this.previousCropPw, this.previousCropPh, 0.0f, 0.0f, this.previousCropMirrored);
            }
            switchToEditMode(0);
        } else {
            closePaintMode();
        }
    }

    public void lambda$closePhoto$71(PlaceProviderObject placeProviderObject) {
        this.animationEndRunnable = null;
        if (Build.VERSION.SDK_INT >= 18) {
            this.containerView.setLayerType(0, null);
        }
        this.animationInProgress = 0;
        onPhotoClosed(placeProviderObject);
    }

    public class AnonymousClass71 extends AnimatorListenerAdapter {
        AnonymousClass71() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.AnonymousClass71.this.lambda$onAnimationEnd$0();
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

    public void lambda$closePhoto$72(PlaceProviderObject placeProviderObject) {
        this.animationEndRunnable = null;
        FrameLayoutDrawer frameLayoutDrawer = this.containerView;
        if (frameLayoutDrawer != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                frameLayoutDrawer.setLayerType(0, null);
            }
            this.animationInProgress = 0;
            onPhotoClosed(placeProviderObject);
            this.containerView.setScaleX(1.0f);
            this.containerView.setScaleY(1.0f);
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
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileLoadProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.mediaCountDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.mediaDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogPhotosLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagesDeleted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        ConnectionsManager.getInstance(this.currentAccount).cancelRequestsForGuid(this.classGuid);
    }

    public void destroyPhotoViewer() {
        if (this.parentActivity != null && this.windowView != null) {
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
            PhotoViewerCaptionEnterView photoViewerCaptionEnterView = this.captionEditText;
            if (photoViewerCaptionEnterView != null) {
                photoViewerCaptionEnterView.onDestroy();
            }
            if (this == PipInstance) {
                PipInstance = null;
            } else {
                Instance = null;
            }
            onHideView();
        }
    }

    private void onPhotoClosed(final PlaceProviderObject placeProviderObject) {
        if (this.doneButtonPressed) {
            releasePlayer(true);
        }
        this.isVisible = false;
        this.cropInitied = false;
        this.disableShowCheck = true;
        this.currentMessageObject = null;
        this.currentBotInlineResult = null;
        this.currentFileLocation = null;
        this.currentFileLocationVideo = null;
        this.currentSecureDocument = null;
        this.currentPageBlock = null;
        this.currentPathObject = null;
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
            videoTimelinePlayView.setBackgroundColor(2130706432);
            this.videoTimelineView.destroy();
        }
        this.hintView.hide(false, 0);
        this.centerImage.setImageBitmap((Bitmap) null);
        this.leftImage.setImageBitmap((Bitmap) null);
        this.rightImage.setImageBitmap((Bitmap) null);
        this.containerView.post(new Runnable() {
            @Override
            public final void run() {
                PhotoViewer.this.lambda$onPhotoClosed$73(placeProviderObject);
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

    public void lambda$onPhotoClosed$73(PlaceProviderObject placeProviderObject) {
        ClippingImageView clippingImageView;
        this.animatingImageView.setImageBitmap(null);
        if (!(placeProviderObject == null || AndroidUtilities.isTablet() || (clippingImageView = placeProviderObject.animatingImageView) == null)) {
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
        if (i < 6 && (frameLayoutDrawer = this.containerView) != null) {
            frameLayoutDrawer.invalidate();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PhotoViewer.this.lambda$redraw$74(i);
                }
            }, 100L);
        }
    }

    public void lambda$redraw$74(int i) {
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
        PhotoPaintView photoPaintView = this.photoPaintView;
        if (photoPaintView != null) {
            photoPaintView.onResume();
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
        if (videoPlayer != null && this.playerLooping) {
            videoPlayer.setLooping(false);
        }
    }

    public boolean isVisible() {
        return this.isVisible && this.placeProvider != null;
    }

    public void updateMinMax(float f) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null && aspectRatioFrameLayout.getVisibility() == 0 && this.textureUploaded) {
            f *= Math.min(getContainerViewWidth() / this.videoTextureView.getMeasuredWidth(), getContainerViewHeight() / this.videoTextureView.getMeasuredHeight());
        }
        float imageWidth = this.centerImage.getImageWidth();
        float imageHeight = this.centerImage.getImageHeight();
        MediaController.CropState cropState = this.editState.cropState;
        if (cropState != null) {
            imageWidth *= cropState.cropPw;
            imageHeight *= cropState.cropPh;
        }
        int containerViewWidth = ((int) ((imageWidth * f) - getContainerViewWidth())) / 2;
        int containerViewHeight = ((int) ((imageHeight * f) - getContainerViewHeight())) / 2;
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
            return;
        }
        this.maxY = 0.0f;
        this.minY = 0.0f;
    }

    private int getAdditionX() {
        int i = this.currentEditMode;
        if (i == 1 || (i == 0 && this.sendPhotoType == 1)) {
            return AndroidUtilities.dp(16.0f);
        }
        if (i == 0 || i == 3) {
            return 0;
        }
        return AndroidUtilities.dp(14.0f);
    }

    private int getAdditionY() {
        int i = this.currentEditMode;
        int i2 = 0;
        if (i == 1 || (i == 0 && this.sendPhotoType == 1)) {
            int dp = AndroidUtilities.dp(16.0f);
            if (isStatusBarVisible()) {
                i2 = AndroidUtilities.statusBarHeight;
            }
            return dp + i2;
        } else if (i == 3) {
            int dp2 = AndroidUtilities.dp(8.0f);
            if (isStatusBarVisible()) {
                i2 = AndroidUtilities.statusBarHeight;
            }
            return dp2 + i2;
        } else if (i == 0) {
            return 0;
        } else {
            int dp3 = AndroidUtilities.dp(14.0f);
            if (isStatusBarVisible()) {
                i2 = AndroidUtilities.statusBarHeight;
            }
            return dp3 + i2;
        }
    }

    public int getContainerViewWidth() {
        return getContainerViewWidth(this.currentEditMode);
    }

    public int getContainerViewWidth(int i) {
        int i2;
        int width = this.containerView.getWidth();
        if (i == 1 || (i == 0 && this.sendPhotoType == 1)) {
            i2 = AndroidUtilities.dp(32.0f);
        } else if (i == 0 || i == 3) {
            return width;
        } else {
            i2 = AndroidUtilities.dp(28.0f);
        }
        return width - i2;
    }

    public int getContainerViewHeight() {
        return getContainerViewHeight(this.currentEditMode);
    }

    public int getContainerViewHeight(int i) {
        return getContainerViewHeight(false, i);
    }

    private int getContainerViewHeight(boolean z, int i) {
        int i2;
        int i3;
        if (z || this.inBubbleMode) {
            i2 = this.containerView.getMeasuredHeight();
        } else {
            i2 = AndroidUtilities.displaySize.y;
            if (i == 0 && this.sendPhotoType != 1 && isStatusBarVisible()) {
                i2 += AndroidUtilities.statusBarHeight;
            }
        }
        if ((i == 0 && this.sendPhotoType == 1) || i == 1) {
            i3 = AndroidUtilities.dp(144.0f);
        } else if (i == 2) {
            i3 = AndroidUtilities.dp(214.0f);
        } else if (i != 3) {
            return i2;
        } else {
            i3 = AndroidUtilities.dp(48.0f) + ActionBar.getCurrentActionBarHeight();
        }
        return i2 - i3;
    }

    public boolean onTouchEvent(android.view.MotionEvent r20) {
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
        if (animatorSet != null) {
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
    }

    private void animateTo(float f, float f2, float f3, boolean z) {
        animateTo(f, f2, f3, z, 250);
    }

    private void animateTo(float f, float f2, float f3, boolean z, int i) {
        if (this.scale != f || this.translationX != f2 || this.translationY != f3) {
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
                @Override
                public void onAnimationEnd(Animator animator) {
                    PhotoViewer.this.imageMoveAnimation = null;
                    PhotoViewer.this.containerView.invalidate();
                }
            });
            this.imageMoveAnimation.start();
        }
    }

    @Keep
    public void setAnimationValue(float f) {
        this.animationValue = f;
        this.containerView.invalidate();
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
        return messageObject != null && messageObject.isVideo() && (messageObject.mediaExists || messageObject.attachPathExists || (messageObject.canStreamVideo() && SharedConfig.streamMedia)) && SharedConfig.autoplayVideo;
    }

    private boolean shouldIndexAutoPlayed(int i) {
        File file;
        PageBlocksAdapter pageBlocksAdapter = this.pageBlocksAdapter;
        return pageBlocksAdapter != null && pageBlocksAdapter.isVideo(i) && SharedConfig.autoplayVideo && (file = this.pageBlocksAdapter.getFile(i)) != null && file.exists();
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
    public void onDraw(android.graphics.Canvas r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.onDraw(android.graphics.Canvas):void");
    }

    public void lambda$onDraw$75() {
        switchToNextIndex(1, false);
    }

    public void lambda$onDraw$76() {
        switchToNextIndex(-1, false);
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
        if (this.checkImageView.getVisibility() == 0) {
            return true;
        }
        boolean[] zArr = this.drawPressedDrawable;
        if (zArr[0] || zArr[1]) {
            return true;
        }
        float x = motionEvent.getX();
        int min = Math.min(135, this.containerView.getMeasuredWidth() / 8);
        if ((x < min || x > this.containerView.getMeasuredWidth() - min) && (messageObject = this.currentMessageObject) != null) {
            return messageObject.isVideo() && SystemClock.elapsedRealtime() - this.lastPhotoSetTime >= 500 && canDoubleTapSeekVideo(motionEvent);
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
        if (!(this.containerView.getTag() == null || this.photoProgressViews[0] == null || this.containerView == null)) {
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
        if (videoPlayer != null && this.videoPlayerControlVisible && this.scale <= 1.1f) {
            long currentPosition = videoPlayer.getCurrentPosition();
            long duration = this.videoPlayer.getDuration();
            if (currentPosition != -9223372036854775807L && duration >= 15000) {
                float f = this.longPressX;
                int containerViewWidth = getContainerViewWidth() / 3;
                if (f >= containerViewWidth * 2) {
                    z = true;
                } else if (f < containerViewWidth) {
                    z = false;
                } else {
                    return;
                }
                this.videoPlayerRewinder.startRewind(this.videoPlayer, z, this.currentVideoSpeed);
            }
        }
    }

    public VideoPlayerRewinder getVideoPlayerRewinder() {
        return this.videoPlayerRewinder;
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.scale == 1.0f) {
            return false;
        }
        this.scroller.abortAnimation();
        this.scroller.fling(Math.round(this.translationX), Math.round(this.translationY), Math.round(f), Math.round(f2), (int) this.minX, (int) this.maxX, (int) this.minY, (int) this.maxY);
        this.containerView.postInvalidate();
        return false;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        MessageObject messageObject;
        if (this.discardTap) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (this.checkImageView.getVisibility() != 0 && y > ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + AndroidUtilities.dp(40.0f)) {
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
        if (this.containerView.getTag() != null) {
            AspectRatioFrameLayout aspectRatioFrameLayout = this.aspectRatioFrameLayout;
            boolean z = aspectRatioFrameLayout != null && aspectRatioFrameLayout.getVisibility() == 0;
            if (this.sharedMediaType != 1 || (messageObject = this.currentMessageObject) == null) {
                PhotoProgressView[] photoProgressViewArr = this.photoProgressViews;
                if (!(photoProgressViewArr[0] == null || this.containerView == null)) {
                    int i = photoProgressViewArr[0].backgroundState;
                    if (x >= (getContainerViewWidth() - AndroidUtilities.dp(100.0f)) / 2.0f && x <= (getContainerViewWidth() + AndroidUtilities.dp(100.0f)) / 2.0f && y >= (getContainerViewHeight() - AndroidUtilities.dp(100.0f)) / 2.0f && y <= (getContainerViewHeight() + AndroidUtilities.dp(100.0f)) / 2.0f) {
                        if (!z) {
                            if (i > 0 && i <= 3) {
                                onActionClick(true);
                                checkProgress(0, false, true);
                                return true;
                            }
                        } else if ((i == 3 || i == 4) && this.photoProgressViews[0].isVisible()) {
                            this.manuallyPaused = true;
                            toggleVideoPlayer();
                            return true;
                        }
                    }
                }
            } else if (!messageObject.canPreviewDocument()) {
                float containerViewHeight = (getContainerViewHeight() - AndroidUtilities.dp(360.0f)) / 2.0f;
                if (y >= containerViewHeight && y <= containerViewHeight + AndroidUtilities.dp(360.0f)) {
                    onActionClick(true);
                    return true;
                }
            }
            toggleActionBar(!this.isActionBarVisible, true);
        } else {
            int i2 = this.sendPhotoType;
            if (i2 != 0 && i2 != 4) {
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
            } else if (this.isCurrentVideo) {
                VideoPlayer videoPlayer = this.videoPlayer;
                if (!(videoPlayer == null || this.muteVideo || i2 == 1)) {
                    videoPlayer.setVolume(1.0f);
                }
                this.manuallyPaused = true;
                toggleVideoPlayer();
            } else {
                this.checkImageView.performClick();
            }
        }
        return true;
    }

    private boolean canDoubleTapSeekVideo(MotionEvent motionEvent) {
        if (this.videoPlayer == null) {
            return false;
        }
        boolean z = motionEvent.getX() >= ((float) ((getContainerViewWidth() / 3) * 2));
        long currentPosition = this.videoPlayer.getCurrentPosition();
        long duration = this.videoPlayer.getDuration();
        if (currentPosition == -9223372036854775807L || duration <= 15000) {
            return false;
        }
        return !z || duration - currentPosition > 10000;
    }

    @Override
    public boolean onDoubleTap(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoViewer.onDoubleTap(android.view.MotionEvent):boolean");
    }

    public class QualityChooseView extends View {
        private int circleSize;
        private int gapSize;
        private int lineSize;
        private int sideSide;
        private int startMovingQuality;
        private TextPaint textPaint;
        private Paint paint = new Paint(1);
        private String lowQualityDescription = LocaleController.getString("AccDescrVideoCompressLow", R.string.AccDescrVideoCompressLow);
        private String hightQualityDescription = LocaleController.getString("AccDescrVideoCompressHigh", R.string.AccDescrVideoCompressHigh);

        public QualityChooseView(Context context) {
            super(context);
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            this.textPaint.setColor(-3289651);
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
                    float f = 0.0f;
                    float dpf2 = i == PhotoViewer.this.selectedCompression + 1 ? AndroidUtilities.dpf2(2.0f) : 0.0f;
                    if (i == PhotoViewer.this.selectedCompression) {
                        f = AndroidUtilities.dpf2(2.0f);
                    }
                    canvas.drawRect(dpf2 + i6, measuredHeight - AndroidUtilities.dp(1.0f), (i6 + this.lineSize) - f, AndroidUtilities.dp(2.0f) + measuredHeight, this.paint);
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
            this.actionBar.setSubtitle(LocaleController.getString("SoundMuted", R.string.SoundMuted));
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
        this.actionBar.setSubtitle(this.currentSubtitle);
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

    public void updateVideoInfo() {
        int i;
        int i2;
        float f;
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            if (this.compressionsCount == 0) {
                actionBar.setSubtitle(null);
                return;
            }
            int i3 = this.selectedCompression;
            if (i3 < 2) {
                this.compressItem.setImageResource(R.drawable.video_quality1);
            } else if (i3 == 2) {
                this.compressItem.setImageResource(R.drawable.video_quality2);
            } else if (i3 == 3) {
                this.compressItem.setImageResource(R.drawable.video_quality3);
            }
            this.itemsLayout.requestLayout();
            long ceil = (long) Math.ceil((this.videoTimelineView.getRightProgress() - this.videoTimelineView.getLeftProgress()) * this.videoDuration);
            this.estimatedDuration = ceil;
            if (this.muteVideo) {
                int i4 = this.rotationValue;
                i = (i4 == 90 || i4 == 270) ? this.resultHeight : this.resultWidth;
                i2 = (i4 == 90 || i4 == 270) ? this.resultWidth : this.resultHeight;
                long j = ((this.sendPhotoType == 1 ? ceil <= 2000 ? 2600000 : ceil <= 5000 ? 2200000 : 1560000 : 921600) / 8) * (((float) ceil) / 1000.0f);
                this.estimatedSize = j;
                this.estimatedSize = j + ((j / 32768) * 16);
            } else if (this.compressItem.getTag() == null) {
                int i5 = this.rotationValue;
                i = (i5 == 90 || i5 == 270) ? this.originalHeight : this.originalWidth;
                i2 = (i5 == 90 || i5 == 270) ? this.originalWidth : this.originalHeight;
                this.estimatedSize = ((float) this.originalSize) * (((float) this.estimatedDuration) / this.videoDuration);
            } else {
                int i6 = this.rotationValue;
                i = (i6 == 90 || i6 == 270) ? this.resultHeight : this.resultWidth;
                i2 = (i6 == 90 || i6 == 270) ? this.resultWidth : this.resultHeight;
                long j2 = ((float) ((this.sendPhotoType == 1 ? 0L : this.audioFramesSize) + this.videoFramesSize)) * (((float) this.estimatedDuration) / this.videoDuration);
                this.estimatedSize = j2;
                this.estimatedSize = j2 + ((j2 / 32768) * 16);
            }
            this.videoCutStart = this.videoTimelineView.getLeftProgress();
            float rightProgress = this.videoTimelineView.getRightProgress();
            this.videoCutEnd = rightProgress;
            if (this.videoCutStart == 0.0f) {
                this.startTime = -1L;
            } else {
                this.startTime = f * this.videoDuration * 1000;
            }
            if (rightProgress == 1.0f) {
                this.endTime = -1L;
            } else {
                this.endTime = rightProgress * this.videoDuration * 1000;
            }
            this.currentSubtitle = String.format("%s, %s", String.format("%dx%d", Integer.valueOf(i), Integer.valueOf(i2)), String.format("%s, ~%s", AndroidUtilities.formatShortDuration((int) (this.estimatedDuration / 1000)), AndroidUtilities.formatFileSize(this.estimatedSize)));
            this.actionBar.beginDelayedTransition();
            this.actionBar.setSubtitle(this.muteVideo ? LocaleController.getString("SoundMuted", R.string.SoundMuted) : this.currentSubtitle);
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
        if (i != 1) {
            this.tryStartRequestPreviewOnFinish = false;
            this.photoProgressViews[0].setBackgroundState(3, false, true);
            if (i == 2) {
                preparePlayer(this.currentPlayingVideoFile, false, false, this.editState.savedFilterState);
                this.videoPlayer.seekTo(this.videoTimelineView.getLeftProgress() * this.videoDuration);
            }
        } else if (this.resultHeight == this.originalHeight && this.resultWidth == this.originalWidth) {
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
                videoEditedInfo.originalHeight = this.originalHeight;
                videoEditedInfo.framerate = this.videoFramerate;
                videoEditedInfo.originalPath = this.currentPlayingVideoFile.getPath();
            }
            VideoEditedInfo videoEditedInfo2 = this.videoPreviewMessageObject.videoEditedInfo;
            long j = this.startTime;
            videoEditedInfo2.startTime = j;
            long j2 = this.endTime;
            videoEditedInfo2.endTime = j2;
            if (j == -1) {
                j = 0;
            }
            if (j2 == -1) {
                j2 = this.videoDuration * 1000.0f;
            }
            if (j2 - j > 5000000) {
                videoEditedInfo2.endTime = j + 5000000;
            }
            videoEditedInfo2.bitrate = this.bitrate;
            videoEditedInfo2.resultWidth = this.resultWidth;
            videoEditedInfo2.resultHeight = this.resultHeight;
            videoEditedInfo2.needUpdateProgress = true;
            videoEditedInfo2.originalDuration = this.videoDuration * 1000.0f;
            if (!MediaController.getInstance().scheduleVideoConvert(this.videoPreviewMessageObject, true)) {
                this.tryStartRequestPreviewOnFinish = true;
            }
            this.requestingPreview = true;
            PhotoProgressView[] photoProgressViewArr2 = this.photoProgressViews;
            photoProgressViewArr2[0].setProgress(0.0f, photoProgressViewArr2[0].backgroundState == 0 || this.photoProgressViews[0].previousBackgroundState == 0);
            this.photoProgressViews[0].setBackgroundState(0, false, true);
        }
        this.containerView.invalidate();
    }

    public void updateWidthHeightBitrateForCompression() {
        int i = this.compressionsCount;
        if (i > 0) {
            if (this.selectedCompression >= i) {
                this.selectedCompression = i - 1;
            }
            if (this.sendPhotoType == 1) {
                float max = Math.max(800.0f / this.originalWidth, 800.0f / this.originalHeight);
                this.resultWidth = Math.round((this.originalWidth * max) / 2.0f) * 2;
                this.resultHeight = Math.round((this.originalHeight * max) / 2.0f) * 2;
            } else {
                int i2 = this.selectedCompression;
                float f = i2 != 0 ? i2 != 1 ? i2 != 2 ? 1920.0f : 1280.0f : 854.0f : 480.0f;
                int i3 = this.originalWidth;
                int i4 = this.originalHeight;
                float f2 = f / (i3 > i4 ? i3 : i4);
                if (i2 != i - 1 || f2 < 1.0f) {
                    this.resultWidth = Math.round((i3 * f2) / 2.0f) * 2;
                    this.resultHeight = Math.round((this.originalHeight * f2) / 2.0f) * 2;
                } else {
                    this.resultWidth = i3;
                    this.resultHeight = i4;
                }
            }
            if (this.bitrate != 0) {
                if (this.sendPhotoType == 1) {
                    this.bitrate = 1560000;
                } else {
                    int i5 = this.resultWidth;
                    int i6 = this.originalWidth;
                    if (i5 == i6 && this.resultHeight == this.originalHeight) {
                        this.bitrate = this.originalBitrate;
                    } else {
                        this.bitrate = MediaController.makeVideoBitrate(this.originalHeight, i6, this.originalBitrate, this.resultHeight, i5);
                    }
                }
                this.videoFramesSize = ((this.bitrate / 8) * this.videoDuration) / 1000.0f;
            }
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
        float f = 0.0f;
        if (z) {
            this.qualityChooseView.setTag(1);
            this.qualityChooseViewAnimation.playTogether(ObjectAnimator.ofFloat(this.pickerView, View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(152.0f)), ObjectAnimator.ofFloat(this.pickerViewSendButton, View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(152.0f)), ObjectAnimator.ofFloat(this.bottomLayout, View.TRANSLATION_Y, -AndroidUtilities.dp(48.0f), AndroidUtilities.dp(104.0f)));
        } else {
            this.qualityChooseView.setTag(null);
            this.qualityChooseViewAnimation.playTogether(ObjectAnimator.ofFloat(this.qualityChooseView, View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(166.0f)), ObjectAnimator.ofFloat(this.qualityPicker, View.TRANSLATION_Y, 0.0f, AndroidUtilities.dp(166.0f)), ObjectAnimator.ofFloat(this.bottomLayout, View.TRANSLATION_Y, -AndroidUtilities.dp(48.0f), AndroidUtilities.dp(118.0f)));
        }
        this.qualityChooseViewAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (animator.equals(PhotoViewer.this.qualityChooseViewAnimation)) {
                    PhotoViewer.this.qualityChooseViewAnimation = new AnimatorSet();
                    if (z) {
                        PhotoViewer.this.qualityChooseView.setVisibility(0);
                        PhotoViewer.this.qualityPicker.setVisibility(0);
                        PhotoViewer.this.qualityChooseViewAnimation.playTogether(ObjectAnimator.ofFloat(PhotoViewer.this.qualityChooseView, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(PhotoViewer.this.qualityPicker, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(PhotoViewer.this.bottomLayout, View.TRANSLATION_Y, -AndroidUtilities.dp(48.0f)));
                    } else {
                        PhotoViewer.this.qualityChooseView.setVisibility(4);
                        PhotoViewer.this.qualityPicker.setVisibility(4);
                        PhotoViewer.this.qualityChooseViewAnimation.playTogether(ObjectAnimator.ofFloat(PhotoViewer.this.pickerView, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(PhotoViewer.this.pickerViewSendButton, View.TRANSLATION_Y, 0.0f), ObjectAnimator.ofFloat(PhotoViewer.this.bottomLayout, View.TRANSLATION_Y, -AndroidUtilities.dp(48.0f)));
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
        float f2 = 0.25f;
        if (this.cameraItem.getVisibility() == 0) {
            this.cameraItem.animate().scaleX(z ? 0.25f : 1.0f).scaleY(z ? 0.25f : 1.0f).alpha(z ? 0.0f : 1.0f).setDuration(200L);
        }
        if (this.muteItem.getVisibility() == 0) {
            ViewPropertyAnimator scaleX = this.muteItem.animate().scaleX(z ? 0.25f : 1.0f);
            if (!z) {
                f2 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f2);
            if (!z) {
                f = 1.0f;
            }
            scaleY.alpha(f).setDuration(200L);
        }
    }

    private void processOpenVideo(String str, boolean z, float f, float f2) {
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
        AnonymousClass77 r6 = new AnonymousClass77(str);
        this.currentLoadingVideoRunnable = r6;
        dispatchQueue.postRunnable(r6);
    }

    public class AnonymousClass77 implements Runnable {
        final String val$videoPath;

        AnonymousClass77(String str) {
            this.val$videoPath = str;
        }

        @Override
        public void run() {
            if (PhotoViewer.this.currentLoadingVideoRunnable == this) {
                final int videoBitrate = MediaController.getVideoBitrate(this.val$videoPath);
                final int[] iArr = new int[11];
                AnimatedFileDrawable.getVideoInfo(this.val$videoPath, iArr);
                if (PhotoViewer.this.currentLoadingVideoRunnable == this) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            PhotoViewer.AnonymousClass77.this.lambda$run$0(this, iArr, videoBitrate);
                        }
                    });
                }
            }
        }

        public void lambda$run$0(Runnable runnable, int[] iArr, int i) {
            if (PhotoViewer.this.parentActivity != null && runnable == PhotoViewer.this.currentLoadingVideoRunnable) {
                PhotoViewer.this.currentLoadingVideoRunnable = null;
                boolean z = iArr[10] != 0;
                PhotoViewer.this.videoConvertSupported = iArr[0] != 0 && (!z || iArr[9] != 0);
                PhotoViewer.this.audioFramesSize = iArr[5];
                PhotoViewer.this.videoDuration = iArr[4];
                if (i == -1) {
                    PhotoViewer photoViewer = PhotoViewer.this;
                    photoViewer.originalBitrate = photoViewer.bitrate = iArr[3];
                } else {
                    PhotoViewer photoViewer2 = PhotoViewer.this;
                    photoViewer2.originalBitrate = photoViewer2.bitrate = i;
                }
                PhotoViewer.this.videoFramerate = iArr[7];
                PhotoViewer photoViewer3 = PhotoViewer.this;
                photoViewer3.videoFramesSize = ((photoViewer3.bitrate / 8) * PhotoViewer.this.videoDuration) / 1000.0f;
                if (PhotoViewer.this.videoConvertSupported) {
                    PhotoViewer.this.rotationValue = iArr[8];
                    PhotoViewer photoViewer4 = PhotoViewer.this;
                    photoViewer4.resultWidth = photoViewer4.originalWidth = iArr[1];
                    PhotoViewer photoViewer5 = PhotoViewer.this;
                    photoViewer5.resultHeight = photoViewer5.originalHeight = iArr[2];
                    PhotoViewer photoViewer6 = PhotoViewer.this;
                    photoViewer6.updateCompressionsCount(photoViewer6.originalWidth, PhotoViewer.this.originalHeight);
                    PhotoViewer photoViewer7 = PhotoViewer.this;
                    photoViewer7.selectedCompression = photoViewer7.selectCompression();
                    PhotoViewer.this.updateWidthHeightBitrateForCompression();
                    if (PhotoViewer.this.selectedCompression > PhotoViewer.this.compressionsCount - 1) {
                        PhotoViewer photoViewer8 = PhotoViewer.this;
                        photoViewer8.selectedCompression = photoViewer8.compressionsCount - 1;
                    }
                    PhotoViewer photoViewer9 = PhotoViewer.this;
                    photoViewer9.setCompressItemEnabled(photoViewer9.compressionsCount > 1, true);
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("compressionsCount = " + PhotoViewer.this.compressionsCount + " w = " + PhotoViewer.this.originalWidth + " h = " + PhotoViewer.this.originalHeight + " r = " + PhotoViewer.this.rotationValue);
                    }
                    if (Build.VERSION.SDK_INT < 18 && PhotoViewer.this.compressItem.getTag() != null) {
                        PhotoViewer.this.videoConvertSupported = false;
                        PhotoViewer.this.setCompressItemEnabled(false, true);
                    }
                    PhotoViewer.this.qualityChooseView.invalidate();
                } else {
                    PhotoViewer.this.setCompressItemEnabled(false, true);
                    PhotoViewer.this.compressionsCount = 0;
                }
                PhotoViewer.this.updateVideoInfo();
                PhotoViewer.this.updateMuteButton();
            }
        }
    }

    public int selectCompression() {
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

    public void setCompressItemEnabled(boolean z, boolean z2) {
        ImageView imageView = this.compressItem;
        if (imageView != null) {
            if (z && imageView.getTag() != null) {
                return;
            }
            if (z || this.compressItem.getTag() != null) {
                this.compressItem.setTag(z ? 1 : null);
                AnimatorSet animatorSet = this.compressItemAnimation;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.compressItemAnimation = null;
                }
                float f = 1.0f;
                if (z2) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.compressItemAnimation = animatorSet2;
                    Animator[] animatorArr = new Animator[4];
                    ImageView imageView2 = this.compressItem;
                    Property property = View.ALPHA;
                    float[] fArr = new float[1];
                    fArr[0] = z ? 1.0f : 0.5f;
                    animatorArr[0] = ObjectAnimator.ofFloat(imageView2, property, fArr);
                    ImageView imageView3 = this.paintItem;
                    Property property2 = View.ALPHA;
                    float[] fArr2 = new float[1];
                    fArr2[0] = this.videoConvertSupported ? 1.0f : 0.5f;
                    animatorArr[1] = ObjectAnimator.ofFloat(imageView3, property2, fArr2);
                    ImageView imageView4 = this.tuneItem;
                    Property property3 = View.ALPHA;
                    float[] fArr3 = new float[1];
                    fArr3[0] = this.videoConvertSupported ? 1.0f : 0.5f;
                    animatorArr[2] = ObjectAnimator.ofFloat(imageView4, property3, fArr3);
                    ImageView imageView5 = this.cropItem;
                    Property property4 = View.ALPHA;
                    float[] fArr4 = new float[1];
                    if (!this.videoConvertSupported) {
                        f = 0.5f;
                    }
                    fArr4[0] = f;
                    animatorArr[3] = ObjectAnimator.ofFloat(imageView5, property4, fArr4);
                    animatorSet2.playTogether(animatorArr);
                    this.compressItemAnimation.setDuration(180L);
                    this.compressItemAnimation.setInterpolator(decelerateInterpolator);
                    this.compressItemAnimation.start();
                    return;
                }
                ImageView imageView6 = this.compressItem;
                if (!z) {
                    f = 0.5f;
                }
                imageView6.setAlpha(f);
            }
        }
    }

    public void updateAccessibilityOverlayVisibility() {
        if (this.playButtonAccessibilityOverlay != null) {
            int i = this.photoProgressViews[0].backgroundState;
            if (!this.photoProgressViews[0].isVisible() || !(i == 3 || i == 4 || i == 2 || i == 1)) {
                this.playButtonAccessibilityOverlay.setVisibility(4);
                return;
            }
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
                    backupImageView.setOrientation(photoEntry.orientation, true);
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
        private int gettingFrameIndex = 0;
        private boolean gettingFrame = false;
        private boolean hasFrame = false;
        private boolean gotError = false;
        private final TimeInterpolator fadeInterpolator = CubicBezierInterpolator.EASE_IN;

        public FirstFrameView(Context context) {
            super(context);
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
            if (videoPlayer != null) {
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
                AnimatedFileDrawable animatedFileDrawable = new AnimatedFileDrawable(file, true, 0L, null, null, null, 0L, i2, false, point.x, point.y);
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
            if (PhotoViewer.this.videoPlayer == null || PhotoViewer.this.videoPlayer.getDuration() == -9223372036854775807L) {
                ValueAnimator valueAnimator = this.fadeAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.fadeAnimator = null;
                }
                setAlpha(0.0f);
                return;
            }
            long max = Math.max(0L, PhotoViewer.this.videoPlayer.getDuration() - PhotoViewer.this.videoPlayer.getCurrentPosition());
            float max2 = 1.0f - Math.max(Math.min(((float) max) / 250.0f, 1.0f), 0.0f);
            if (max2 <= 0.0f) {
                ValueAnimator valueAnimator2 = this.fadeAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.fadeAnimator = null;
                }
                setAlpha(0.0f);
            } else if (!PhotoViewer.this.videoPlayer.isPlaying()) {
                ValueAnimator valueAnimator3 = this.fadeAnimator;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                    this.fadeAnimator = null;
                }
                setAlpha(max2);
            } else if (this.fadeAnimator == null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(max2, 1.0f);
                this.fadeAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                        PhotoViewer.FirstFrameView.this.lambda$updateAlpha$3(valueAnimator4);
                    }
                });
                this.fadeAnimator.setDuration(max);
                this.fadeAnimator.setInterpolator(this.fadeInterpolator);
                this.fadeAnimator.start();
                setAlpha(max2);
            }
        }

        public void lambda$updateAlpha$3(ValueAnimator valueAnimator) {
            setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }
}
