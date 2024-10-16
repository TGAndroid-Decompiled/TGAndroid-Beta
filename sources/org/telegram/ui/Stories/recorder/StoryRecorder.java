package org.telegram.ui.Stories.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
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
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.URLSpan;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.WindowInsetsCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.Cells.ShareDialogCell;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.FilterGLThread;
import org.telegram.ui.Components.FilterShaders;
import org.telegram.ui.Components.GestureDetectorFixDoubleTap;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.RenderView;
import org.telegram.ui.Components.Paint.Views.EntitiesContainerView;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Paint.Views.MessageEntityView;
import org.telegram.ui.Components.Paint.Views.PhotoView;
import org.telegram.ui.Components.Paint.Views.RoundView;
import org.telegram.ui.Components.PhotoFilterBlurControl;
import org.telegram.ui.Components.PhotoFilterCurvesControl;
import org.telegram.ui.Components.PhotoFilterView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.ThanosEffect;
import org.telegram.ui.Components.URLSpanUserMention;
import org.telegram.ui.Components.VideoEditTextureView;
import org.telegram.ui.Components.ZoomControlView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.StoryWaveEffectView;
import org.telegram.ui.Stories.recorder.DownloadButton;
import org.telegram.ui.Stories.recorder.FlashViews;
import org.telegram.ui.Stories.recorder.PreviewButtons;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.Stories.recorder.RecordControl;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.TimelineView;
import org.telegram.ui.WrappedResourceProvider;

public class StoryRecorder implements NotificationCenter.NotificationCenterDelegate {
    private static boolean firstOpen = true;
    private static StoryRecorder instance;
    private LinearLayout actionBarButtons;
    private FrameLayout actionBarContainer;
    private final Activity activity;
    private Runnable afterPlayerAwait;
    private boolean animatedRecording;
    private Runnable audioGrantedCallback;
    private FlashViews.ImageViewInvertable backButton;
    private BlurringShader.BlurManager blurManager;
    private TLRPC.InputMedia botEdit;
    private long botId;
    private String botLang;
    private HintView2 cameraHint;
    private DualCameraView cameraView;
    private ImageView cameraViewThumb;
    private float cameraZoom;
    private FrameLayout captionContainer;
    private CaptionStory captionEdit;
    private View captionEditOverlay;
    private View changeDayNightView;
    private ValueAnimator changeDayNightViewAnimator;
    private float changeDayNightViewProgress;
    private Runnable closeListener;
    private ClosingViewProvider closingSourceProvider;
    private ContainerView containerView;
    private ValueAnimator containerViewBackAnimator;
    private FrameLayout controlContainer;
    private ButtonWithCounterView coverButton;
    private TimelineView coverTimelineView;
    private long coverValue;
    private final int currentAccount;
    private RoundVideoRecorder currentRoundRecorder;
    private float dismissProgress;
    private DownloadButton downloadButton;
    private DraftSavedHint draftSavedHint;
    private ToggleButton dualButton;
    private HintView2 dualHint;
    private AnimatorSet editModeAnimator;
    private ToggleButton2 flashButton;
    private int flashButtonResId;
    private FlashViews flashViews;
    private boolean forceBackgroundVisible;
    private boolean fromGallery;
    private float fromRounding;
    private SourceView fromSourceView;
    private ArrayList frontfaceFlashModes;
    private Float frozenDismissProgress;
    private boolean galleryClosing;
    private Runnable galleryLayouted;
    private GalleryListView galleryListView;
    private Boolean galleryListViewOpening;
    private ValueAnimator galleryOpenCloseAnimator;
    private SpringAnimation galleryOpenCloseSpringAnimator;
    private HintTextView hintTextView;
    private int insetBottom;
    private int insetLeft;
    private int insetRight;
    private int insetTop;
    private boolean isBackgroundVisible;
    private boolean isDark;
    private boolean isReposting;
    private boolean isShown;
    private Parcelable lastGalleryScrollPosition;
    private MediaController.AlbumEntry lastGallerySelectedAlbum;
    private PhotoVideoSwitcherView modeSwitcherView;
    private RLottieImageView muteButton;
    private RLottieDrawable muteButtonDrawable;
    private HintView2 muteHint;
    private FrameLayout navbarContainer;
    private boolean noCameraPermission;
    private Runnable onCloseListener;
    private Utilities.Callback4 onClosePrepareListener;
    private Runnable onFullyOpenListener;
    private ValueAnimator openCloseAnimator;
    private float openProgress;
    private int openType;
    private StoryEntry outputEntry;
    private File outputFile;
    private AnimatorSet pageAnimator;
    private PaintView paintView;
    private View paintViewEntitiesView;
    private View paintViewRenderInputView;
    private RenderView paintViewRenderView;
    private View paintViewSelectionContainerView;
    private View paintViewTextDim;
    private PhotoFilterView.EnhanceView photoFilterEnhanceView;
    private PhotoFilterView photoFilterView;
    private PhotoFilterBlurControl photoFilterViewBlurControl;
    private PhotoFilterCurvesControl photoFilterViewCurvesControl;
    private TextureView photoFilterViewTextureView;
    private PlayPauseButton playButton;
    private boolean prepareClosing;
    private boolean previewAlreadySet;
    private PreviewButtons previewButtons;
    private FrameLayout previewContainer;
    private int previewH;
    private PreviewHighlightView previewHighlight;
    private Touchable previewTouchable;
    private PreviewView previewView;
    private int previewW;
    private StoryPrivacyBottomSheet privacySheet;
    private RecordControl recordControl;
    private AnimatorSet recordingAnimator;
    private boolean requestedCameraPermission;
    private HintView2 savedDualHint;
    private boolean scrollingX;
    private boolean scrollingY;
    long selectedDialogId;
    private boolean showSavedDraftHint;
    private boolean shownLimitReached;
    private ThanosEffect thanosEffect;
    private ImageView themeButton;
    private RLottieDrawable themeButtonDrawable;
    private TimelineView timelineView;
    private SimpleTextView titleTextView;
    private TrashView trash;
    private int underControls;
    private boolean underStatusBar;
    private boolean videoError;
    private PreviewView.TextureViewHolder videoTextureHolder;
    private VideoTimeView videoTimeView;
    private FrameLayout videoTimelineContainerView;
    private VideoTimerView videoTimerView;
    private boolean wasGalleryOpen;
    private boolean wasSend;
    private Runnable whenOpenDone;
    private final WindowManager.LayoutParams windowLayoutParams;
    WindowManager windowManager;
    private WindowView windowView;
    private AnimatorSet zoomControlAnimation;
    private Runnable zoomControlHideRunnable;
    private ZoomControlView zoomControlView;
    private final Theme.ResourcesProvider resourcesProvider = new DarkThemeResourceProvider();
    private long wasSendPeer = 0;
    private final RectF fromRect = new RectF();
    private boolean canChangePeer = true;
    private AnimationNotificationsLocker notificationsLocker = new AnimationNotificationsLocker();
    private final RectF rectF = new RectF();
    private final RectF fullRectF = new RectF();
    private final Path clipPath = new Path();
    private final Rect rect = new Rect();
    private int currentPage = 0;
    private int currentEditMode = -1;
    private boolean isVideo = false;
    private boolean takingPhoto = false;
    private boolean takingVideo = false;
    private boolean stoppingTakingVideo = false;
    private boolean awaitingPlayer = false;
    private int shiftDp = -3;
    private boolean preparingUpload = false;
    private final RecordControl.Delegate recordControlDelegate = new AnonymousClass12();
    private boolean videoTimerShown = true;
    private boolean applyContainerViewTranslation2 = true;
    private int frontfaceFlashMode = -1;

    public class AnonymousClass1 extends AnimatorListenerAdapter {
        final Runnable val$onDone;
        final float val$value;

        AnonymousClass1(float f, Runnable runnable) {
            r2 = f;
            r3 = runnable;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            StoryRecorder.this.frozenDismissProgress = null;
            StoryRecorder.this.openProgress = r2;
            StoryRecorder.this.applyOpenProgress();
            StoryRecorder.this.containerView.invalidate();
            StoryRecorder.this.windowView.invalidate();
            Runnable runnable = r3;
            if (runnable != null) {
                runnable.run();
            }
            if (StoryRecorder.this.fromSourceView != null) {
                StoryRecorder.access$600(StoryRecorder.this);
            }
            StoryRecorder.this.notificationsLocker.unlock();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            NotificationCenter.getGlobalInstance().runDelayedNotifications();
            StoryRecorder.this.checkBackgroundVisibility();
            if (StoryRecorder.this.onFullyOpenListener != null) {
                StoryRecorder.this.onFullyOpenListener.run();
                StoryRecorder.this.onFullyOpenListener = null;
            }
            StoryRecorder.this.containerView.invalidate();
            StoryRecorder.this.previewContainer.invalidate();
        }
    }

    public class AnonymousClass10 implements Bulletin.Delegate {
        AnonymousClass10() {
        }

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
        public int getBottomOffset(int i) {
            return StoryRecorder.this.captionEdit.getEditTextHeight() + AndroidUtilities.dp(12.0f);
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
    }

    public class AnonymousClass11 extends View {
        AnonymousClass11(Context context) {
            super(context);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            canvas.save();
            canvas.translate(StoryRecorder.this.captionContainer.getX() + StoryRecorder.this.captionEdit.getX(), StoryRecorder.this.captionContainer.getY() + StoryRecorder.this.captionEdit.getY());
            StoryRecorder.this.captionEdit.drawOver2(canvas, StoryRecorder.this.captionEdit.getBounds(), StoryRecorder.this.captionEdit.getOver2Alpha());
            canvas.restore();
        }
    }

    public class AnonymousClass12 implements RecordControl.Delegate {
        AnonymousClass12() {
        }

        public void lambda$onVideoRecordEnd$7() {
            if (StoryRecorder.this.takingVideo && StoryRecorder.this.stoppingTakingVideo && StoryRecorder.this.cameraView != null) {
                StoryRecorder.this.showZoomControls(false, true);
                CameraController.getInstance().stopVideoRecording(StoryRecorder.this.cameraView.getCameraSessionRecording(), false, false);
            }
        }

        public void lambda$startRecording$4() {
            StoryRecorder.this.navigateTo(1, true);
        }

        public void lambda$startRecording$5(String str, long j) {
            if (StoryRecorder.this.recordControl != null) {
                StoryRecorder.this.recordControl.stopRecordingLoading(true);
            }
            if (StoryRecorder.this.useDisplayFlashlight()) {
                StoryRecorder.this.flashViews.flashOut();
            }
            if (StoryRecorder.this.outputFile == null || StoryRecorder.this.cameraView == null) {
                return;
            }
            StoryRecorder.this.takingVideo = false;
            StoryRecorder.this.stoppingTakingVideo = false;
            if (j <= 800) {
                StoryRecorder.this.animateRecording(false, true);
                StoryRecorder.this.setAwakeLock(false);
                StoryRecorder.this.videoTimerView.setRecording(false, true);
                if (StoryRecorder.this.recordControl != null) {
                    StoryRecorder.this.recordControl.stopRecordingLoading(true);
                }
                try {
                    StoryRecorder.this.outputFile.delete();
                    StoryRecorder.this.outputFile = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (str != null) {
                    try {
                        new File(str).delete();
                        return;
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        return;
                    }
                }
                return;
            }
            StoryRecorder.this.showVideoTimer(false, true);
            StoryRecorder storyRecorder = StoryRecorder.this;
            storyRecorder.outputEntry = StoryEntry.fromVideoShoot(storyRecorder.outputFile, str, j);
            if (StoryRecorder.this.outputEntry != null) {
                StoryRecorder.this.outputEntry.botId = StoryRecorder.this.botId;
                StoryRecorder.this.outputEntry.botLang = StoryRecorder.this.botLang;
            }
            StoryPrivacySelector.applySaved(StoryRecorder.this.currentAccount, StoryRecorder.this.outputEntry);
            StoryRecorder.this.fromGallery = false;
            int videoWidth = StoryRecorder.this.cameraView.getVideoWidth();
            int videoHeight = StoryRecorder.this.cameraView.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                StoryRecorder.this.outputEntry.width = videoWidth;
                StoryRecorder.this.outputEntry.height = videoHeight;
                StoryRecorder.this.outputEntry.setupMatrix();
            }
            StoryRecorder.this.navigateToPreviewWithPlayerAwait(new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.AnonymousClass12.this.lambda$startRecording$4();
                }
            }, 0L);
        }

        public void lambda$startRecording$6(Runnable runnable, boolean z) {
            runnable.run();
            StoryRecorder.this.hintTextView.setText(LocaleController.getString(z ? R.string.StoryHintSwipeToZoom : R.string.StoryHintPinchToZoom), false);
            StoryRecorder.this.animateRecording(true, true);
            StoryRecorder.this.setAwakeLock(true);
            StoryRecorder.this.videoTimerView.setRecording(true, true);
            StoryRecorder.this.showVideoTimer(true, true);
        }

        public void lambda$takePicture$0() {
            StoryRecorder.this.navigateTo(1, true);
        }

        public void lambda$takePicture$1(org.telegram.messenger.Utilities.Callback r7, java.lang.Integer r8) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.StoryRecorder.AnonymousClass12.lambda$takePicture$1(org.telegram.messenger.Utilities$Callback, java.lang.Integer):void");
        }

        public void lambda$takePicture$2() {
            StoryRecorder.this.navigateTo(1, true);
        }

        public void lambda$onVideoRecordStart$3(final boolean z, final Runnable runnable) {
            if (StoryRecorder.this.cameraView == null) {
                return;
            }
            CameraController.getInstance().recordVideo(StoryRecorder.this.cameraView.getCameraSessionObject(), StoryRecorder.this.outputFile, false, new CameraController.VideoTakeCallback() {
                @Override
                public final void onFinishVideoRecording(String str, long j) {
                    StoryRecorder.AnonymousClass12.this.lambda$startRecording$5(str, j);
                }
            }, new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.AnonymousClass12.this.lambda$startRecording$6(runnable, z);
                }
            }, StoryRecorder.this.cameraView, true);
            if (StoryRecorder.this.isVideo) {
                return;
            }
            StoryRecorder.this.isVideo = true;
            StoryRecorder storyRecorder = StoryRecorder.this;
            storyRecorder.showVideoTimer(storyRecorder.isVideo, true);
            StoryRecorder.this.modeSwitcherView.switchMode(StoryRecorder.this.isVideo);
            StoryRecorder.this.recordControl.startAsVideo(StoryRecorder.this.isVideo);
        }

        public void takePicture(final org.telegram.messenger.Utilities.Callback r7) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.StoryRecorder.AnonymousClass12.takePicture(org.telegram.messenger.Utilities$Callback):void");
        }

        @Override
        public boolean canRecordAudio() {
            return StoryRecorder.this.requestAudioPermission();
        }

        @Override
        public void onFlipClick() {
            if (StoryRecorder.this.cameraView == null || StoryRecorder.this.awaitingPlayer || StoryRecorder.this.takingPhoto || !StoryRecorder.this.cameraView.isInited() || StoryRecorder.this.currentPage != 0) {
                return;
            }
            if (StoryRecorder.this.savedDualHint != null) {
                StoryRecorder.this.savedDualHint.hide();
            }
            if (StoryRecorder.this.useDisplayFlashlight() && StoryRecorder.this.frontfaceFlashModes != null && !StoryRecorder.this.frontfaceFlashModes.isEmpty()) {
                ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) StoryRecorder.this.frontfaceFlashModes.get(StoryRecorder.this.frontfaceFlashMode)).commit();
            }
            StoryRecorder.this.cameraView.switchCamera();
            StoryRecorder storyRecorder = StoryRecorder.this;
            storyRecorder.saveCameraFace(storyRecorder.cameraView.isFrontface());
            if (StoryRecorder.this.useDisplayFlashlight()) {
                StoryRecorder.this.flashViews.flashIn(null);
            } else {
                StoryRecorder.this.flashViews.flashOut();
            }
        }

        @Override
        public void onFlipLongClick() {
            if (StoryRecorder.this.cameraView != null) {
                StoryRecorder.this.cameraView.toggleDual();
            }
        }

        @Override
        public void onGalleryClick() {
            if (StoryRecorder.this.currentPage != 0 || StoryRecorder.this.takingPhoto || StoryRecorder.this.takingVideo || !StoryRecorder.this.requestGalleryPermission()) {
                return;
            }
            StoryRecorder.this.lambda$animateGalleryListView$48(true);
        }

        @Override
        public void onPhotoShoot() {
            if (StoryRecorder.this.takingPhoto || StoryRecorder.this.awaitingPlayer || StoryRecorder.this.currentPage != 0 || StoryRecorder.this.cameraView == null || !StoryRecorder.this.cameraView.isInited()) {
                return;
            }
            StoryRecorder.this.cameraHint.hide();
            if (StoryRecorder.this.outputFile != null) {
                try {
                    StoryRecorder.this.outputFile.delete();
                } catch (Exception unused) {
                }
                StoryRecorder.this.outputFile = null;
            }
            StoryRecorder storyRecorder = StoryRecorder.this;
            storyRecorder.outputFile = StoryEntry.makeCacheFile(storyRecorder.currentAccount, false);
            StoryRecorder.this.takingPhoto = true;
            StoryRecorder.this.checkFrontfaceFlashModes();
            StoryRecorder.this.isDark = false;
            if (StoryRecorder.this.cameraView.isFrontface() && StoryRecorder.this.frontfaceFlashMode == 1) {
                StoryRecorder.this.checkIsDark();
            }
            if (StoryRecorder.this.useDisplayFlashlight()) {
                StoryRecorder.this.flashViews.flash(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        StoryRecorder.AnonymousClass12.this.takePicture((Utilities.Callback) obj);
                    }
                });
            } else {
                takePicture(null);
            }
        }

        @Override
        public void onVideoDuration(long j) {
            StoryRecorder.this.videoTimerView.setDuration(j, true);
        }

        @Override
        public void onVideoRecordEnd(boolean z) {
            if (StoryRecorder.this.stoppingTakingVideo || !StoryRecorder.this.takingVideo) {
                return;
            }
            StoryRecorder.this.stoppingTakingVideo = true;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.AnonymousClass12.this.lambda$onVideoRecordEnd$7();
                }
            }, z ? 0L : 400L);
        }

        @Override
        public void onVideoRecordLocked() {
            StoryRecorder.this.hintTextView.setText(LocaleController.getString(R.string.StoryHintPinchToZoom), true);
        }

        @Override
        public void onVideoRecordStart(final boolean z, final Runnable runnable) {
            if (StoryRecorder.this.takingVideo || StoryRecorder.this.stoppingTakingVideo || StoryRecorder.this.awaitingPlayer || StoryRecorder.this.currentPage != 0 || StoryRecorder.this.cameraView == null || StoryRecorder.this.cameraView.getCameraSession() == null) {
                return;
            }
            if (StoryRecorder.this.dualHint != null) {
                StoryRecorder.this.dualHint.hide();
            }
            if (StoryRecorder.this.savedDualHint != null) {
                StoryRecorder.this.savedDualHint.hide();
            }
            StoryRecorder.this.cameraHint.hide();
            StoryRecorder.this.takingVideo = true;
            if (StoryRecorder.this.outputFile != null) {
                try {
                    StoryRecorder.this.outputFile.delete();
                } catch (Exception unused) {
                }
                StoryRecorder.this.outputFile = null;
            }
            StoryRecorder storyRecorder = StoryRecorder.this;
            storyRecorder.outputFile = StoryEntry.makeCacheFile(storyRecorder.currentAccount, true);
            StoryRecorder.this.checkFrontfaceFlashModes();
            StoryRecorder.this.isDark = false;
            if (StoryRecorder.this.cameraView.isFrontface() && StoryRecorder.this.frontfaceFlashMode == 1) {
                StoryRecorder.this.checkIsDark();
            }
            if (StoryRecorder.this.useDisplayFlashlight()) {
                StoryRecorder.this.flashViews.flashIn(new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.AnonymousClass12.this.lambda$onVideoRecordStart$3(z, runnable);
                    }
                });
            } else {
                lambda$onVideoRecordStart$3(z, runnable);
            }
        }

        @Override
        public void onZoom(float f) {
            StoryRecorder.this.zoomControlView.setZoom(f, true);
            StoryRecorder.this.showZoomControls(false, true);
        }
    }

    public class AnonymousClass13 extends AnimatorListenerAdapter {
        final boolean val$recording;

        AnonymousClass13(boolean z) {
            r2 = z;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (r2) {
                StoryRecorder.this.backButton.setVisibility(8);
            }
            if (r2 || StoryRecorder.this.currentPage != 0) {
                StoryRecorder.this.flashButton.setVisibility(8);
            }
        }
    }

    public class AnonymousClass14 extends AnimatorListenerAdapter {
        final boolean val$show;

        AnonymousClass14(boolean z) {
            r2 = z;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (!r2) {
                StoryRecorder.this.zoomControlView.setVisibility(8);
            }
            StoryRecorder.this.zoomControlAnimation = null;
        }
    }

    public class AnonymousClass15 extends CharacterStyle {
        AnonymousClass15() {
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setAlpha(128);
        }
    }

    public class AnonymousClass16 extends AnimatorListenerAdapter {
        final int val$oldPage;
        final int val$page;

        AnonymousClass16(int i, int i2) {
            r2 = i;
            r3 = i2;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            StoryRecorder.this.onNavigateEnd(r2, r3);
        }
    }

    public class AnonymousClass17 extends AnimatorListenerAdapter {
        AnonymousClass17() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            StoryRecorder.this.containerViewBackAnimator = null;
            StoryRecorder.this.containerView.setTranslationY(0.0f);
            StoryRecorder.this.containerView.setTranslationY2(0.0f);
        }
    }

    public class AnonymousClass19 extends GalleryListView {
        AnonymousClass19(int i, Context context, Theme.ResourcesProvider resourcesProvider, MediaController.AlbumEntry albumEntry, boolean z) {
            super(i, context, resourcesProvider, albumEntry, z);
        }

        public void lambda$onFullScreen$0() {
            StoryRecorder.this.destroyCameraView(true);
            StoryRecorder.this.cameraViewThumb.setImageDrawable(StoryRecorder.this.getCameraThumb());
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= top()) {
                return super.dispatchTouchEvent(motionEvent);
            }
            StoryRecorder.this.galleryClosing = true;
            StoryRecorder.this.lambda$animateGalleryListView$48(false);
            return true;
        }

        @Override
        public void firstLayout() {
            StoryRecorder.this.galleryListView.setTranslationY(StoryRecorder.this.windowView.getMeasuredHeight() - StoryRecorder.this.galleryListView.top());
            if (StoryRecorder.this.galleryLayouted != null) {
                StoryRecorder.this.galleryLayouted.run();
                StoryRecorder.this.galleryLayouted = null;
            }
        }

        @Override
        protected void onFullScreen(boolean z) {
            if (StoryRecorder.this.currentPage == 0 && z) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.AnonymousClass19.this.lambda$onFullScreen$0();
                    }
                });
            }
        }

        @Override
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            if (StoryRecorder.this.applyContainerViewTranslation2) {
                float clamp = Utilities.clamp(1.0f - (f / (StoryRecorder.this.windowView.getMeasuredHeight() - StoryRecorder.this.galleryListView.top())), 1.0f, 0.0f);
                StoryRecorder.this.containerView.setTranslationY2(AndroidUtilities.dp(-32.0f) * clamp);
                StoryRecorder.this.containerView.setAlpha(1.0f - (0.6f * clamp));
                StoryRecorder.this.actionBarContainer.setAlpha(1.0f - clamp);
            }
        }
    }

    public class AnonymousClass2 implements View.OnApplyWindowInsetsListener {
        AnonymousClass2() {
        }

        @Override
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            int stableInsetTop;
            int stableInsetBottom;
            int stableInsetLeft;
            int stableInsetRight;
            WindowInsets consumeSystemWindowInsets;
            WindowInsets windowInsets2;
            Insets insets;
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30) {
                insets = windowInsets.getInsets(WindowInsetsCompat.Type.displayCutout() | WindowInsetsCompat.Type.systemBars());
                StoryRecorder storyRecorder = StoryRecorder.this;
                i = insets.top;
                storyRecorder.insetTop = i;
                StoryRecorder storyRecorder2 = StoryRecorder.this;
                i2 = insets.bottom;
                storyRecorder2.insetBottom = i2;
                StoryRecorder storyRecorder3 = StoryRecorder.this;
                i3 = insets.left;
                storyRecorder3.insetLeft = i3;
                StoryRecorder storyRecorder4 = StoryRecorder.this;
                i4 = insets.right;
                storyRecorder4.insetRight = i4;
            } else {
                StoryRecorder storyRecorder5 = StoryRecorder.this;
                stableInsetTop = windowInsets.getStableInsetTop();
                storyRecorder5.insetTop = stableInsetTop;
                StoryRecorder storyRecorder6 = StoryRecorder.this;
                stableInsetBottom = windowInsets.getStableInsetBottom();
                storyRecorder6.insetBottom = stableInsetBottom;
                StoryRecorder storyRecorder7 = StoryRecorder.this;
                stableInsetLeft = windowInsets.getStableInsetLeft();
                storyRecorder7.insetLeft = stableInsetLeft;
                StoryRecorder storyRecorder8 = StoryRecorder.this;
                stableInsetRight = windowInsets.getStableInsetRight();
                storyRecorder8.insetRight = stableInsetRight;
            }
            StoryRecorder.this.windowView.requestLayout();
            if (i5 >= 30) {
                windowInsets2 = WindowInsets.CONSUMED;
                return windowInsets2;
            }
            consumeSystemWindowInsets = windowInsets.consumeSystemWindowInsets();
            return consumeSystemWindowInsets;
        }
    }

    public class AnonymousClass20 extends AnimatorListenerAdapter {
        AnonymousClass20() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            StoryRecorder.this.windowView.removeView(StoryRecorder.this.galleryListView);
            StoryRecorder.this.galleryListView = null;
            StoryRecorder.this.galleryOpenCloseAnimator = null;
            StoryRecorder.this.galleryListViewOpening = null;
            StoryRecorder.this.captionEdit.keyboardNotifier.ignore(StoryRecorder.this.currentPage != 1);
        }
    }

    public class AnonymousClass21 implements TimelineView.TimelineDelegate {
        final Utilities.Callback2 val$videoLeftSet;

        AnonymousClass21(Utilities.Callback2 callback2) {
            r2 = callback2;
        }

        @Override
        public void onAudioLeftChange(float f) {
            TimelineView.TimelineDelegate.CC.$default$onAudioLeftChange(this, f);
        }

        @Override
        public void onAudioOffsetChange(long j) {
            TimelineView.TimelineDelegate.CC.$default$onAudioOffsetChange(this, j);
        }

        @Override
        public void onAudioRemove() {
            TimelineView.TimelineDelegate.CC.$default$onAudioRemove(this);
        }

        @Override
        public void onAudioRightChange(float f) {
            TimelineView.TimelineDelegate.CC.$default$onAudioRightChange(this, f);
        }

        @Override
        public void onAudioVolumeChange(float f) {
            TimelineView.TimelineDelegate.CC.$default$onAudioVolumeChange(this, f);
        }

        @Override
        public void onProgressChange(long j, boolean z) {
            TimelineView.TimelineDelegate.CC.$default$onProgressChange(this, j, z);
        }

        @Override
        public void onProgressDragChange(boolean z) {
            TimelineView.TimelineDelegate.CC.$default$onProgressDragChange(this, z);
        }

        @Override
        public void onRoundLeftChange(float f) {
            TimelineView.TimelineDelegate.CC.$default$onRoundLeftChange(this, f);
        }

        @Override
        public void onRoundOffsetChange(long j) {
            TimelineView.TimelineDelegate.CC.$default$onRoundOffsetChange(this, j);
        }

        @Override
        public void onRoundRemove() {
            TimelineView.TimelineDelegate.CC.$default$onRoundRemove(this);
        }

        @Override
        public void onRoundRightChange(float f) {
            TimelineView.TimelineDelegate.CC.$default$onRoundRightChange(this, f);
        }

        @Override
        public void onRoundSelectChange(boolean z) {
            TimelineView.TimelineDelegate.CC.$default$onRoundSelectChange(this, z);
        }

        @Override
        public void onRoundVolumeChange(float f) {
            TimelineView.TimelineDelegate.CC.$default$onRoundVolumeChange(this, f);
        }

        @Override
        public void onVideoLeftChange(float f) {
            r2.run(Boolean.FALSE, Float.valueOf(f));
        }

        @Override
        public void onVideoRightChange(float f) {
            TimelineView.TimelineDelegate.CC.$default$onVideoRightChange(this, f);
        }

        @Override
        public void onVideoVolumeChange(float f) {
            TimelineView.TimelineDelegate.CC.$default$onVideoVolumeChange(this, f);
        }
    }

    public class AnonymousClass22 extends AnimatorListenerAdapter {
        final int val$editMode;
        final int val$oldEditMode;

        AnonymousClass22(int i, int i2) {
            r2 = i;
            r3 = i2;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            StoryRecorder.this.onSwitchEditModeEnd(r2, r3);
        }
    }

    public class AnonymousClass23 extends PaintView {
        private boolean multitouch;

        AnonymousClass23(Context context, boolean z, File file, boolean z2, boolean z3, WindowView windowView, Activity activity, int i, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i2, ArrayList arrayList, StoryEntry storyEntry, int i3, int i4, MediaController.CropState cropState, Runnable runnable, BlurringShader.BlurManager blurManager, Theme.ResourcesProvider resourcesProvider, PreviewView.TextureViewHolder textureViewHolder, PreviewView previewView) {
            super(context, z, file, z2, z3, windowView, activity, i, bitmap, bitmap2, bitmap3, i2, arrayList, storyEntry, i3, i4, cropState, runnable, blurManager, resourcesProvider, textureViewHolder, previewView);
        }

        public void lambda$onAudioSelect$1(boolean z) {
            if (z) {
                return;
            }
            StoryRecorder.this.playButton.setVisibility(8);
        }

        public static void lambda$onSwitchSegmentedAnimation$3() {
        }

        public void lambda$showTrash$0() {
            StoryRecorder.this.trash.setVisibility(8);
        }

        @Override
        protected boolean checkAudioPermission(Runnable runnable) {
            int checkSelfPermission;
            int checkSelfPermission2;
            if (StoryRecorder.this.activity == null) {
                return true;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                checkSelfPermission2 = StoryRecorder.this.activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO");
                if (checkSelfPermission2 != 0) {
                    StoryRecorder.this.activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
                    StoryRecorder.this.audioGrantedCallback = runnable;
                    return false;
                }
                return true;
            }
            if (i >= 23) {
                checkSelfPermission = StoryRecorder.this.activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE");
                if (checkSelfPermission != 0) {
                    StoryRecorder.this.activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
                    StoryRecorder.this.audioGrantedCallback = runnable;
                    return false;
                }
            }
            return true;
        }

        @Override
        public void dismiss() {
            StoryRecorder.this.captionEdit.editText.closeKeyboard();
            StoryRecorder.this.switchToEditMode(-1, true);
        }

        @Override
        public void editSelectedTextEntity() {
            StoryRecorder.this.captionEdit.editText.closeKeyboard();
            StoryRecorder.this.switchToEditMode(0, true);
            super.editSelectedTextEntity();
        }

        @Override
        public void onAudioSelect(MessageObject messageObject) {
            StoryRecorder.this.previewView.setupAudio(messageObject, true);
            if (StoryRecorder.this.outputEntry != null && !StoryRecorder.this.isVideo) {
                final boolean z = !TextUtils.isEmpty(StoryRecorder.this.outputEntry.audioPath);
                StoryRecorder.this.playButton.drawable.setPause(!StoryRecorder.this.previewView.isPlaying(), false);
                StoryRecorder.this.playButton.setVisibility(0);
                StoryRecorder.this.playButton.animate().alpha(z ? 1.0f : 0.0f).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.AnonymousClass23.this.lambda$onAudioSelect$1(z);
                    }
                }).start();
            }
            StoryRecorder.this.switchToEditMode(-1, true);
        }

        @Override
        public void onCreateRound(RoundView roundView) {
            if (StoryRecorder.this.previewView != null) {
                StoryRecorder.this.previewView.attachRoundView(roundView);
            }
            if (StoryRecorder.this.captionEdit != null) {
                StoryRecorder.this.captionEdit.setHasRoundVideo(true);
            }
        }

        @Override
        public void onDeleteRound() {
            if (StoryRecorder.this.previewView != null) {
                StoryRecorder.this.previewView.setupRound(null, null, true);
            }
            if (StoryRecorder.this.paintView != null) {
                StoryRecorder.this.paintView.deleteRound();
            }
            if (StoryRecorder.this.captionEdit != null) {
                StoryRecorder.this.captionEdit.setHasRoundVideo(false);
            }
            if (StoryRecorder.this.outputEntry != null) {
                if (StoryRecorder.this.outputEntry.round != null) {
                    try {
                        StoryRecorder.this.outputEntry.round.delete();
                    } catch (Exception unused) {
                    }
                    StoryRecorder.this.outputEntry.round = null;
                }
                if (StoryRecorder.this.outputEntry.roundThumb != null) {
                    try {
                        new File(StoryRecorder.this.outputEntry.roundThumb).delete();
                    } catch (Exception unused2) {
                    }
                    StoryRecorder.this.outputEntry.roundThumb = null;
                }
            }
        }

        @Override
        public void onDeselectRound(RoundView roundView) {
            if (StoryRecorder.this.timelineView != null) {
                StoryRecorder.this.timelineView.selectRound(false);
            }
        }

        @Override
        public void onEntityDragEnd(boolean z) {
            if (!isEntityDeletable()) {
                z = false;
            }
            StoryRecorder.this.captionContainer.clearAnimation();
            StoryRecorder.this.captionContainer.animate().alpha(1.0f).setDuration(180L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
            showTrash(false, z);
            if (z) {
                removeCurrentEntity();
            }
            super.onEntityDragEnd(z);
            this.multitouch = false;
        }

        @Override
        public void onEntityDragMultitouchEnd() {
            this.multitouch = false;
            showTrash(isEntityDeletable(), false);
            StoryRecorder.this.previewHighlight.show(false, false, null);
        }

        @Override
        public void onEntityDragMultitouchStart() {
            this.multitouch = true;
            StoryRecorder.this.paintView.showReactionsLayout(false);
            showTrash(false, false);
        }

        @Override
        public void onEntityDragStart() {
            StoryRecorder.this.paintView.showReactionsLayout(false);
            StoryRecorder.this.captionContainer.clearAnimation();
            StoryRecorder.this.captionContainer.animate().alpha(0.0f).setDuration(180L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
            showTrash(isEntityDeletable(), false);
        }

        @Override
        public void onEntityDragTrash(boolean z) {
            StoryRecorder.this.trash.onDragInfo(z, false);
        }

        @Override
        public void onEntityDraggedBottom(boolean z) {
            StoryRecorder.this.previewHighlight.updateCaption(StoryRecorder.this.captionEdit.getText());
            StoryRecorder.this.previewHighlight.show(false, z && this.multitouch, null);
        }

        @Override
        public void onEntityDraggedTop(boolean z) {
            StoryRecorder.this.previewHighlight.show(true, z, StoryRecorder.this.actionBarContainer);
        }

        @Override
        public void onEntityHandleTouched() {
            StoryRecorder.this.paintView.showReactionsLayout(false);
        }

        @Override
        protected void onGalleryClick() {
            StoryRecorder.this.captionEdit.keyboardNotifier.ignore(true);
            StoryRecorder.this.destroyGalleryListView();
            StoryRecorder.this.createGalleryListView(true);
            StoryRecorder.this.lambda$animateGalleryListView$48(true);
        }

        @Override
        protected void onOpenCloseStickersAlert(boolean z) {
            if (StoryRecorder.this.previewView != null) {
                StoryRecorder.this.previewView.updatePauseReason(6, z);
                if (StoryRecorder.this.playButton != null) {
                    StoryRecorder.this.playButton.drawable.setPause(StoryRecorder.this.previewView.isPlaying(), true);
                }
            }
            if (StoryRecorder.this.captionEdit != null) {
                StoryRecorder.this.captionEdit.ignoreTouches = z;
                StoryRecorder.this.captionEdit.keyboardNotifier.ignore(z);
            }
        }

        @Override
        public void onSelectRound(RoundView roundView) {
            if (StoryRecorder.this.timelineView != null) {
                StoryRecorder.this.timelineView.selectRound(true);
            }
        }

        @Override
        public void onSwitchSegmentedAnimation(final PhotoView photoView) {
            float f;
            if (photoView == null) {
                return;
            }
            ThanosEffect thanosEffect = StoryRecorder.this.getThanosEffect();
            if (thanosEffect == null) {
                photoView.onSwitchSegmentedAnimationStarted(false);
                return;
            }
            Bitmap segmentedOutBitmap = photoView.getSegmentedOutBitmap();
            if (segmentedOutBitmap == null) {
                photoView.onSwitchSegmentedAnimationStarted(false);
                return;
            }
            Matrix matrix = new Matrix();
            float width = photoView.getWidth();
            float height = photoView.getHeight();
            float f2 = 0.0f;
            if (photoView.getRotation() != 0.0f) {
                float width2 = segmentedOutBitmap.getWidth();
                float height2 = segmentedOutBitmap.getHeight();
                float f3 = width2 / 2.0f;
                float f4 = height2 / 2.0f;
                float sqrt = (float) Math.sqrt((f3 * f3) + (f4 * f4));
                float f5 = sqrt * 2.0f;
                int i = (int) f5;
                Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.rotate(photoView.getRotation(), sqrt, sqrt);
                canvas.drawBitmap(segmentedOutBitmap, (f5 - width2) / 2.0f, (f5 - height2) / 2.0f, (Paint) null);
                segmentedOutBitmap.recycle();
                float f6 = width / 2.0f;
                float f7 = height / 2.0f;
                float sqrt2 = ((float) Math.sqrt((f6 * f6) + (f7 * f7))) * 2.0f;
                f2 = (-(sqrt2 - width)) / 2.0f;
                float f8 = (-(sqrt2 - height)) / 2.0f;
                height = sqrt2;
                f = f8;
                width = height;
                segmentedOutBitmap = createBitmap;
            } else {
                f = 0.0f;
            }
            matrix.postScale(width, height);
            matrix.postScale(photoView.getScaleX(), photoView.getScaleY(), width / 2.0f, height / 2.0f);
            matrix.postTranslate(StoryRecorder.this.containerView.getX() + StoryRecorder.this.previewContainer.getX() + photoView.getX() + f2, StoryRecorder.this.containerView.getY() + StoryRecorder.this.previewContainer.getY() + photoView.getY() + f);
            thanosEffect.animate(matrix, segmentedOutBitmap, new Runnable() {
                @Override
                public final void run() {
                    PhotoView.this.onSwitchSegmentedAnimationStarted(true);
                }
            }, new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.AnonymousClass23.lambda$onSwitchSegmentedAnimation$3();
                }
            });
        }

        @Override
        public void onTryDeleteRound() {
            if (StoryRecorder.this.captionEdit != null) {
                StoryRecorder.this.captionEdit.showRemoveRoundAlert();
            }
        }

        public void showTrash(boolean z, boolean z2) {
            ViewPropertyAnimator startDelay;
            if (z) {
                StoryRecorder.this.trash.setVisibility(0);
                StoryRecorder.this.trash.setAlpha(0.0f);
                StoryRecorder.this.trash.clearAnimation();
                startDelay = StoryRecorder.this.trash.animate().alpha(1.0f).setDuration(180L).setInterpolator(CubicBezierInterpolator.EASE_OUT);
            } else {
                StoryRecorder.this.trash.onDragInfo(false, z2);
                StoryRecorder.this.trash.clearAnimation();
                startDelay = StoryRecorder.this.trash.animate().alpha(0.0f).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.AnonymousClass23.this.lambda$showTrash$0();
                    }
                }).setDuration(180L).setInterpolator(CubicBezierInterpolator.EASE_OUT).setStartDelay(z2 ? 500L : 0L);
            }
            startDelay.start();
        }
    }

    public class AnonymousClass24 extends DualCameraView {
        AnonymousClass24(Context context, boolean z, boolean z2) {
            super(context, z, z2);
        }

        public void lambda$onSavedDualCameraSuccess$0() {
            if (StoryRecorder.this.takingVideo || StoryRecorder.this.takingPhoto || StoryRecorder.this.cameraView == null || StoryRecorder.this.currentPage != 0 || StoryRecorder.this.savedDualHint == null) {
                return;
            }
            String string = LocaleController.getString(isFrontface() ? R.string.StoryCameraSavedDualBackHint : R.string.StoryCameraSavedDualFrontHint);
            StoryRecorder.this.savedDualHint.setMaxWidthPx(HintView2.cutInFancyHalf(string, StoryRecorder.this.savedDualHint.getTextPaint()));
            StoryRecorder.this.savedDualHint.setText(string);
            StoryRecorder.this.savedDualHint.show();
            MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) + 1).apply();
        }

        @Override
        public void onEntityDraggedBottom(boolean z) {
            StoryRecorder.this.previewHighlight.updateCaption(StoryRecorder.this.captionEdit.getText());
            StoryRecorder.this.previewHighlight.show(false, z, StoryRecorder.this.controlContainer);
        }

        @Override
        public void onEntityDraggedTop(boolean z) {
            StoryRecorder.this.previewHighlight.show(true, z, StoryRecorder.this.actionBarContainer);
        }

        @Override
        protected void onSavedDualCameraSuccess() {
            if (MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) < 2) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.AnonymousClass24.this.lambda$onSavedDualCameraSuccess$0();
                    }
                }, 340L);
            }
            StoryRecorder.this.dualButton.setValue(isDual());
        }

        @Override
        protected void receivedAmplitude(double d) {
            if (StoryRecorder.this.recordControl != null) {
                StoryRecorder.this.recordControl.setAmplitude(Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f), true);
            }
        }

        @Override
        public void toggleDual() {
            super.toggleDual();
            StoryRecorder.this.dualButton.setValue(isDual());
            StoryRecorder storyRecorder = StoryRecorder.this;
            storyRecorder.setCameraFlashModeIcon(storyRecorder.getCurrentFlashMode(), true);
        }
    }

    public class AnonymousClass25 extends BaseFragment {

        class AnonymousClass1 extends WrappedResourceProvider {
            AnonymousClass1(Theme.ResourcesProvider resourcesProvider) {
                super(resourcesProvider);
            }

            @Override
            public void appendColors() {
                this.sparseIntArray.append(Theme.key_dialogBackground, -14737633);
                this.sparseIntArray.append(Theme.key_windowBackgroundGray, -13421773);
            }
        }

        AnonymousClass25() {
        }

        @Override
        public Activity getParentActivity() {
            return StoryRecorder.this.activity;
        }

        @Override
        public Theme.ResourcesProvider getResourceProvider() {
            return new WrappedResourceProvider(StoryRecorder.this.resourcesProvider) {
                AnonymousClass1(Theme.ResourcesProvider resourcesProvider) {
                    super(resourcesProvider);
                }

                @Override
                public void appendColors() {
                    this.sparseIntArray.append(Theme.key_dialogBackground, -14737633);
                    this.sparseIntArray.append(Theme.key_windowBackgroundGray, -13421773);
                }
            };
        }

        @Override
        public boolean isLightStatusBar() {
            return false;
        }

        @Override
        public boolean presentFragment(BaseFragment baseFragment) {
            StoryRecorder.this.openPremium();
            return false;
        }
    }

    public class AnonymousClass26 extends BaseFragment {

        class AnonymousClass1 extends WrappedResourceProvider {
            AnonymousClass1(Theme.ResourcesProvider resourcesProvider) {
                super(resourcesProvider);
            }

            @Override
            public void appendColors() {
                this.sparseIntArray.append(Theme.key_dialogBackground, -14803426);
                this.sparseIntArray.append(Theme.key_windowBackgroundGray, -16777216);
            }
        }

        AnonymousClass26() {
            this.currentAccount = StoryRecorder.this.currentAccount;
        }

        @Override
        public Activity getParentActivity() {
            return StoryRecorder.this.activity;
        }

        @Override
        public Theme.ResourcesProvider getResourceProvider() {
            return new WrappedResourceProvider(StoryRecorder.this.resourcesProvider) {
                AnonymousClass1(Theme.ResourcesProvider resourcesProvider) {
                    super(resourcesProvider);
                }

                @Override
                public void appendColors() {
                    this.sparseIntArray.append(Theme.key_dialogBackground, -14803426);
                    this.sparseIntArray.append(Theme.key_windowBackgroundGray, -16777216);
                }
            };
        }

        @Override
        public boolean isLightStatusBar() {
            return false;
        }

        @Override
        public Dialog showDialog(Dialog dialog) {
            dialog.show();
            return dialog;
        }
    }

    public class AnonymousClass27 implements Bulletin.Delegate {
        AnonymousClass27() {
        }

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
            return true;
        }

        @Override
        public int getBottomOffset(int i) {
            return Bulletin.Delegate.CC.$default$getBottomOffset(this, i);
        }

        @Override
        public int getTopOffset(int i) {
            return 0;
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
    }

    public class AnonymousClass28 extends ImageSpan {
        final Drawable val$cameraDrawable;

        AnonymousClass28(Drawable drawable, Drawable drawable2) {
            super(drawable);
            r2 = drawable2;
        }

        @Override
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            canvas.save();
            canvas.translate(0.0f, ((i5 - i3) / 2) + AndroidUtilities.dp(1.0f));
            r2.setAlpha(paint.getAlpha());
            super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
            canvas.restore();
        }

        @Override
        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            return (super.getSize(paint, charSequence, i, i2, fontMetricsInt) / 3) * 2;
        }
    }

    public class AnonymousClass29 extends View {
        final Bitmap val$bitmap;
        final Canvas val$bitmapCanvas;
        final Paint val$bitmapPaint;
        final float val$cx;
        final float val$cy;
        final boolean val$isDark;
        final float val$r;
        final float val$x;
        final Paint val$xRefPaint;
        final float val$y;

        AnonymousClass29(Context context, boolean z, Canvas canvas, float f, float f2, float f3, Paint paint, Bitmap bitmap, Paint paint2, float f4, float f5) {
            super(context);
            r3 = z;
            r4 = canvas;
            r5 = f;
            r6 = f2;
            r7 = f3;
            r8 = paint;
            r9 = bitmap;
            r10 = paint2;
            r11 = f4;
            r12 = f5;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (r3) {
                if (StoryRecorder.this.changeDayNightViewProgress > 0.0f) {
                    r4.drawCircle(r5, r6, r7 * StoryRecorder.this.changeDayNightViewProgress, r8);
                }
                canvas.drawBitmap(r9, 0.0f, 0.0f, r10);
            } else {
                canvas.drawCircle(r5, r6, r7 * (1.0f - StoryRecorder.this.changeDayNightViewProgress), r10);
            }
            canvas.save();
            canvas.translate(r11, r12);
            StoryRecorder.this.themeButton.draw(canvas);
            canvas.restore();
        }
    }

    public class AnonymousClass3 implements FlashViews.Invertable {
        AnonymousClass3() {
        }

        @Override
        public void invalidate() {
        }

        @Override
        public void setInvert(float f) {
            AndroidUtilities.setLightNavigationBar(StoryRecorder.this.windowView, f > 0.5f);
            AndroidUtilities.setLightStatusBar(StoryRecorder.this.windowView, f > 0.5f);
        }
    }

    public class AnonymousClass30 implements ValueAnimator.AnimatorUpdateListener {
        boolean changedNavigationBarColor = false;

        AnonymousClass30() {
        }

        @Override
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            StoryRecorder.this.changeDayNightViewProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (StoryRecorder.this.changeDayNightView != null) {
                StoryRecorder.this.changeDayNightView.invalidate();
            }
            if (this.changedNavigationBarColor || StoryRecorder.this.changeDayNightViewProgress <= 0.5f) {
                return;
            }
            this.changedNavigationBarColor = true;
        }
    }

    public class AnonymousClass31 extends AnimatorListenerAdapter {
        AnonymousClass31() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (StoryRecorder.this.changeDayNightView != null) {
                if (StoryRecorder.this.changeDayNightView.getParent() != null) {
                    ((ViewGroup) StoryRecorder.this.changeDayNightView.getParent()).removeView(StoryRecorder.this.changeDayNightView);
                }
                StoryRecorder.this.changeDayNightView = null;
            }
            StoryRecorder.this.changeDayNightViewAnimator = null;
            super.onAnimationEnd(animator);
        }
    }

    public class AnonymousClass4 extends FrameLayout {
        private final Rect leftExclRect = new Rect();
        private final Rect rightExclRect = new Rect();

        AnonymousClass4(Context context) {
            super(context);
            this.leftExclRect = new Rect();
            this.rightExclRect = new Rect();
        }

        @Override
        public void invalidate() {
            if (StoryRecorder.this.openCloseAnimator == null || !StoryRecorder.this.openCloseAnimator.isRunning()) {
                super.invalidate();
            }
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (Build.VERSION.SDK_INT >= 29) {
                int i5 = i3 - i;
                int i6 = i4 - i2;
                this.leftExclRect.set(0, i6 - AndroidUtilities.dp(120.0f), AndroidUtilities.dp(40.0f), i6);
                this.rightExclRect.set(i5 - AndroidUtilities.dp(40.0f), i6 - AndroidUtilities.dp(120.0f), i5, i6);
                setSystemGestureExclusionRects(Arrays.asList(this.leftExclRect, this.rightExclRect));
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (StoryRecorder.this.photoFilterViewCurvesControl != null) {
                StoryRecorder.this.photoFilterViewCurvesControl.setActualArea(0.0f, 0.0f, StoryRecorder.this.photoFilterViewCurvesControl.getMeasuredWidth(), StoryRecorder.this.photoFilterViewCurvesControl.getMeasuredHeight());
            }
            if (StoryRecorder.this.photoFilterViewBlurControl != null) {
                StoryRecorder.this.photoFilterViewBlurControl.setActualAreaSize(StoryRecorder.this.photoFilterViewBlurControl.getMeasuredWidth(), StoryRecorder.this.photoFilterViewBlurControl.getMeasuredHeight());
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (StoryRecorder.this.previewTouchable == null) {
                return super.onTouchEvent(motionEvent);
            }
            StoryRecorder.this.previewTouchable.onTouch(motionEvent);
            return true;
        }
    }

    public class AnonymousClass5 extends FrameLayout {
        AnonymousClass5(Context context) {
            super(context);
        }

        @Override
        public void setTranslationY(float f) {
            if (getTranslationY() == f || StoryRecorder.this.captionEdit == null) {
                return;
            }
            super.setTranslationY(f);
            StoryRecorder.this.captionEdit.updateMentionsLayoutPosition();
        }
    }

    public class AnonymousClass6 implements Bulletin.Delegate {
        AnonymousClass6() {
        }

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
            return true;
        }

        @Override
        public int getBottomOffset(int i) {
            return Bulletin.Delegate.CC.$default$getBottomOffset(this, i);
        }

        @Override
        public int getTopOffset(int i) {
            return AndroidUtilities.dp(56.0f);
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
    }

    public class AnonymousClass7 extends ViewOutlineProvider {
        AnonymousClass7() {
        }

        @Override
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(12.0f));
        }
    }

    public class AnonymousClass8 extends PreviewView {
        AnonymousClass8(Context context, BlurringShader.BlurManager blurManager, PreviewView.TextureViewHolder textureViewHolder) {
            super(context, blurManager, textureViewHolder);
        }

        @Override
        public boolean additionalTouchEvent(MotionEvent motionEvent) {
            if (StoryRecorder.this.captionEdit == null || !StoryRecorder.this.captionEdit.isRecording()) {
                return StoryRecorder.this.photoFilterEnhanceView.onTouch(motionEvent);
            }
            return false;
        }

        @Override
        public void applyMatrix() {
            super.applyMatrix();
            StoryRecorder.this.applyFilterMatrix();
        }

        @Override
        protected void invalidateTextureViewHolder() {
            if (StoryRecorder.this.outputEntry == null || !StoryRecorder.this.outputEntry.isRepostMessage || !StoryRecorder.this.outputEntry.isVideo || StoryRecorder.this.paintView == null || StoryRecorder.this.paintView.entitiesView == null) {
                return;
            }
            for (int i = 0; i < StoryRecorder.this.paintView.entitiesView.getChildCount(); i++) {
                View childAt = StoryRecorder.this.paintView.entitiesView.getChildAt(i);
                if (childAt instanceof MessageEntityView) {
                    ((MessageEntityView) childAt).invalidateAll();
                }
            }
        }

        @Override
        public void onAudioChanged() {
            if (StoryRecorder.this.paintView != null) {
                StoryRecorder.this.paintView.setHasAudio((StoryRecorder.this.outputEntry == null || StoryRecorder.this.outputEntry.audioPath == null) ? false : true);
            }
        }

        @Override
        public void onEntityDraggedBottom(boolean z) {
            StoryRecorder.this.previewHighlight.updateCaption(StoryRecorder.this.captionEdit.getText());
        }

        @Override
        public void onEntityDraggedTop(boolean z) {
            StoryRecorder.this.previewHighlight.show(true, z, StoryRecorder.this.actionBarContainer);
        }

        @Override
        public void onRoundRemove() {
            if (StoryRecorder.this.previewView != null) {
                StoryRecorder.this.previewView.setupRound(null, null, true);
            }
            if (StoryRecorder.this.paintView != null) {
                StoryRecorder.this.paintView.deleteRound();
            }
            if (StoryRecorder.this.captionEdit != null) {
                StoryRecorder.this.captionEdit.setHasRoundVideo(false);
            }
            if (StoryRecorder.this.outputEntry != null) {
                if (StoryRecorder.this.outputEntry.round != null) {
                    try {
                        StoryRecorder.this.outputEntry.round.delete();
                    } catch (Exception unused) {
                    }
                    StoryRecorder.this.outputEntry.round = null;
                }
                if (StoryRecorder.this.outputEntry.roundThumb != null) {
                    try {
                        new File(StoryRecorder.this.outputEntry.roundThumb).delete();
                    } catch (Exception unused2) {
                    }
                    StoryRecorder.this.outputEntry.roundThumb = null;
                }
            }
        }

        @Override
        public void onRoundSelectChange(boolean z) {
            PaintView paintView;
            RoundView findRoundView;
            if (StoryRecorder.this.paintView == null) {
                return;
            }
            if (!z && (StoryRecorder.this.paintView.getSelectedEntity() instanceof RoundView)) {
                paintView = StoryRecorder.this.paintView;
                findRoundView = null;
            } else {
                if (!z || (StoryRecorder.this.paintView.getSelectedEntity() instanceof RoundView) || StoryRecorder.this.paintView.findRoundView() == null) {
                    return;
                }
                paintView = StoryRecorder.this.paintView;
                findRoundView = StoryRecorder.this.paintView.findRoundView();
            }
            paintView.lambda$createRound$61(findRoundView);
        }
    }

    public class AnonymousClass9 extends CaptionStory {

        class AnonymousClass1 extends ClickableSpan {
            AnonymousClass1() {
            }

            @Override
            public void onClick(View view) {
                StoryRecorder.this.openPremium();
            }

            @Override
            public void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }
        }

        AnonymousClass9(Context context, FrameLayout frameLayout, SizeNotifierFrameLayout sizeNotifierFrameLayout, FrameLayout frameLayout2, Theme.ResourcesProvider resourcesProvider, BlurringShader.BlurManager blurManager) {
            super(context, frameLayout, sizeNotifierFrameLayout, frameLayout2, resourcesProvider, blurManager);
        }

        public void lambda$putRecorder$0(RoundVideoRecorder roundVideoRecorder, File file, String str, Long l) {
            if (StoryRecorder.this.previewView != null) {
                StoryRecorder.this.previewView.mute(false);
                StoryRecorder.this.previewView.seek(0L);
            }
            if (StoryRecorder.this.outputEntry != null) {
                StoryRecorder.this.outputEntry.round = file;
                StoryRecorder.this.outputEntry.roundThumb = str;
                StoryRecorder.this.outputEntry.roundDuration = l.longValue();
                StoryRecorder.this.outputEntry.roundLeft = 0.0f;
                StoryRecorder.this.outputEntry.roundRight = 1.0f;
                StoryRecorder.this.outputEntry.roundOffset = 0L;
                StoryRecorder.this.outputEntry.roundVolume = 1.0f;
                StoryRecorder.this.createPhotoPaintView();
                if (StoryRecorder.this.previewView == null || StoryRecorder.this.paintView == null) {
                    roundVideoRecorder.destroy(false);
                    return;
                }
                RoundView createRound = StoryRecorder.this.paintView.createRound(StoryRecorder.this.outputEntry.roundThumb, true);
                setHasRoundVideo(true);
                StoryRecorder.this.previewView.setupRound(StoryRecorder.this.outputEntry, createRound, true);
                roundVideoRecorder.hideTo(createRound);
            }
        }

        public void lambda$putRecorder$1() {
            if (StoryRecorder.this.previewView != null) {
                StoryRecorder.this.previewView.mute(false);
                StoryRecorder.this.previewView.seek(0L);
            }
        }

        @Override
        public boolean canRecord() {
            return StoryRecorder.this.requestAudioPermission();
        }

        @Override
        public boolean captionLimitToast() {
            if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                return false;
            }
            Bulletin visibleBulletin = Bulletin.getVisibleBulletin();
            if (visibleBulletin != null && visibleBulletin.tag == 2) {
                return false;
            }
            int i = MessagesController.getInstance(this.currentAccount).storyCaptionLengthLimitPremium;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i / MessagesController.getInstance(this.currentAccount).storyCaptionLengthLimitDefault), "" + i));
            int indexOf = replaceTags.toString().indexOf("__");
            if (indexOf >= 0) {
                replaceTags.replace(indexOf, indexOf + 2, (CharSequence) "");
                int indexOf2 = replaceTags.toString().indexOf("__");
                if (indexOf2 >= 0) {
                    replaceTags.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                    replaceTags.setSpan(new ForegroundColorSpan(Theme.getColor(Theme.key_chat_messageLinkIn, this.resourcesProvider)), indexOf, indexOf2, 33);
                    replaceTags.setSpan(new ClickableSpan() {
                        AnonymousClass1() {
                        }

                        @Override
                        public void onClick(View view) {
                            StoryRecorder.this.openPremium();
                        }

                        @Override
                        public void updateDrawState(TextPaint textPaint) {
                            textPaint.setUnderlineText(false);
                        }
                    }, indexOf, indexOf2, 33);
                }
            }
            Bulletin createSimpleBulletin = BulletinFactory.of(StoryRecorder.this.captionContainer, this.resourcesProvider).createSimpleBulletin(R.raw.caption_limit, LocaleController.getString(R.string.CaptionPremiumTitle), replaceTags);
            createSimpleBulletin.tag = 2;
            createSimpleBulletin.setDuration(5000);
            createSimpleBulletin.show(false);
            return true;
        }

        @Override
        public void drawBlurBitmap(Bitmap bitmap, float f) {
            StoryRecorder.this.windowView.drawBlurBitmap(bitmap, f);
            super.drawBlurBitmap(bitmap, f);
        }

        @Override
        public boolean drawOver2FromParent() {
            return true;
        }

        @Override
        public int getTimelineHeight() {
            if (StoryRecorder.this.videoTimelineContainerView == null || StoryRecorder.this.timelineView == null || StoryRecorder.this.timelineView.getVisibility() != 0) {
                return 0;
            }
            return StoryRecorder.this.timelineView.getContentHeight();
        }

        @Override
        protected boolean ignoreTouches(float f, float f2) {
            if (StoryRecorder.this.paintView != null && StoryRecorder.this.paintView.entitiesView != null && !StoryRecorder.this.captionEdit.keyboardShown) {
                float x = f + StoryRecorder.this.captionEdit.getX();
                float y = f2 + StoryRecorder.this.captionEdit.getY();
                float x2 = x + StoryRecorder.this.captionContainer.getX();
                float y2 = y + StoryRecorder.this.captionContainer.getY();
                float x3 = x2 - StoryRecorder.this.previewContainer.getX();
                float y3 = y2 - StoryRecorder.this.previewContainer.getY();
                for (int i = 0; i < StoryRecorder.this.paintView.entitiesView.getChildCount(); i++) {
                    View childAt = StoryRecorder.this.paintView.entitiesView.getChildAt(i);
                    if (childAt instanceof EntityView) {
                        org.telegram.ui.Components.Rect selectionBounds = ((EntityView) childAt).getSelectionBounds();
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f3 = selectionBounds.x;
                        float f4 = selectionBounds.y;
                        rectF.set(f3, f4, selectionBounds.width + f3, selectionBounds.height + f4);
                        if (rectF.contains(x3, y3)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        @Override
        public void invalidateDrawOver2() {
            if (StoryRecorder.this.captionEditOverlay != null) {
                StoryRecorder.this.captionEditOverlay.invalidate();
            }
        }

        @Override
        protected void onCaptionLimitUpdate(boolean z) {
            StoryRecorder.this.previewButtons.setShareEnabled((StoryRecorder.this.videoError || z || (MessagesController.getInstance(this.currentAccount).getStoriesController().hasStoryLimit() && (StoryRecorder.this.outputEntry == null || !StoryRecorder.this.outputEntry.isEdit))) ? false : true);
        }

        @Override
        public void putRecorder(final RoundVideoRecorder roundVideoRecorder) {
            if (StoryRecorder.this.currentRoundRecorder != null) {
                StoryRecorder.this.currentRoundRecorder.destroy(true);
            }
            if (StoryRecorder.this.previewView != null) {
                StoryRecorder.this.previewView.mute(true);
                StoryRecorder.this.previewView.seek(0L);
            }
            roundVideoRecorder.onDone(new Utilities.Callback3() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3) {
                    StoryRecorder.AnonymousClass9.this.lambda$putRecorder$0(roundVideoRecorder, (File) obj, (String) obj2, (Long) obj3);
                }
            });
            roundVideoRecorder.onDestroy(new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.AnonymousClass9.this.lambda$putRecorder$1();
                }
            });
            StoryRecorder.this.previewContainer.addView(StoryRecorder.this.currentRoundRecorder = roundVideoRecorder, LayoutHelper.createFrame(-1, -1.0f));
        }

        @Override
        public void removeRound() {
            if (StoryRecorder.this.previewView != null) {
                StoryRecorder.this.previewView.setupRound(null, null, true);
            }
            if (StoryRecorder.this.paintView != null) {
                StoryRecorder.this.paintView.deleteRound();
            }
            if (StoryRecorder.this.captionEdit != null) {
                StoryRecorder.this.captionEdit.setHasRoundVideo(false);
            }
            if (StoryRecorder.this.outputEntry != null) {
                if (StoryRecorder.this.outputEntry.round != null) {
                    try {
                        StoryRecorder.this.outputEntry.round.delete();
                    } catch (Exception unused) {
                    }
                    StoryRecorder.this.outputEntry.round = null;
                }
                if (StoryRecorder.this.outputEntry.roundThumb != null) {
                    try {
                        new File(StoryRecorder.this.outputEntry.roundThumb).delete();
                    } catch (Exception unused2) {
                    }
                    StoryRecorder.this.outputEntry.roundThumb = null;
                }
            }
        }

        @Override
        public void setVisibility(int i) {
            super.setVisibility(i);
        }
    }

    public interface ClosingViewProvider {
        SourceView getView(long j);

        void preLayout(long j, Runnable runnable);
    }

    public class ContainerView extends FrameLayout {
        private LinearGradient topGradient;
        private final Paint topGradientPaint;
        private float translationY1;
        private float translationY2;

        public ContainerView(Context context) {
            super(context);
            this.topGradientPaint = new Paint(1);
        }

        private void measureChildExactly(View view, int i, int i2) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            boolean drawChild = super.drawChild(canvas, view, j);
            if (view == StoryRecorder.this.previewContainer) {
                float f = StoryRecorder.this.underStatusBar ? AndroidUtilities.statusBarHeight : 0.0f;
                if (this.topGradient == null) {
                    LinearGradient linearGradient = new LinearGradient(0.0f, f, 0.0f, f + AndroidUtilities.dp(72.0f), new int[]{1073741824, 0}, new float[]{f / (AndroidUtilities.dp(72.0f) + f), 1.0f}, Shader.TileMode.CLAMP);
                    this.topGradient = linearGradient;
                    this.topGradientPaint.setShader(linearGradient);
                }
                this.topGradientPaint.setAlpha(255);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(84.0f) + f);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.topGradientPaint);
            }
            return drawChild;
        }

        public float getTranslationY1() {
            return this.translationY1;
        }

        public float getTranslationY2() {
            return this.translationY2;
        }

        @Override
        public void invalidate() {
            if (StoryRecorder.this.openCloseAnimator == null || !StoryRecorder.this.openCloseAnimator.isRunning()) {
                super.invalidate();
            }
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5 = StoryRecorder.this.underStatusBar ? StoryRecorder.this.insetTop : 0;
            int i6 = i3 - i;
            int i7 = i4 - i2;
            StoryRecorder.this.previewContainer.layout(0, 0, StoryRecorder.this.previewW, StoryRecorder.this.previewH);
            StoryRecorder.this.previewContainer.setPivotX(StoryRecorder.this.previewW * 0.5f);
            StoryRecorder.this.actionBarContainer.layout(0, i5, StoryRecorder.this.previewW, StoryRecorder.this.actionBarContainer.getMeasuredHeight() + i5);
            StoryRecorder.this.controlContainer.layout(0, StoryRecorder.this.previewH - StoryRecorder.this.controlContainer.getMeasuredHeight(), StoryRecorder.this.previewW, StoryRecorder.this.previewH);
            StoryRecorder.this.navbarContainer.layout(0, StoryRecorder.this.previewH, StoryRecorder.this.previewW, StoryRecorder.this.previewH + StoryRecorder.this.navbarContainer.getMeasuredHeight());
            StoryRecorder.this.captionContainer.layout(0, 0, StoryRecorder.this.previewW, StoryRecorder.this.previewH);
            if (StoryRecorder.this.captionEditOverlay != null) {
                StoryRecorder.this.captionEditOverlay.layout(0, 0, i6, i7);
            }
            StoryRecorder.this.flashViews.foregroundView.layout(0, 0, i6, i7);
            if (StoryRecorder.this.captionEdit.mentionContainer != null) {
                StoryRecorder.this.captionEdit.mentionContainer.layout(0, 0, StoryRecorder.this.previewW, StoryRecorder.this.previewH);
                StoryRecorder.this.captionEdit.updateMentionsLayoutPosition();
            }
            if (StoryRecorder.this.photoFilterView != null) {
                StoryRecorder.this.photoFilterView.layout(0, 0, StoryRecorder.this.photoFilterView.getMeasuredWidth(), StoryRecorder.this.photoFilterView.getMeasuredHeight());
            }
            if (StoryRecorder.this.paintView != null) {
                StoryRecorder.this.paintView.layout(0, 0, StoryRecorder.this.paintView.getMeasuredWidth(), StoryRecorder.this.paintView.getMeasuredHeight());
            }
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                View childAt = getChildAt(i8);
                if (childAt instanceof ItemOptions.DimView) {
                    childAt.layout(0, 0, i6, i7);
                }
            }
            setPivotX(i6 / 2.0f);
            setPivotY((-i7) * 0.2f);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            measureChildExactly(StoryRecorder.this.previewContainer, StoryRecorder.this.previewW, StoryRecorder.this.previewH);
            StoryRecorder.this.applyFilterMatrix();
            measureChildExactly(StoryRecorder.this.actionBarContainer, StoryRecorder.this.previewW, AndroidUtilities.dp(150.0f));
            measureChildExactly(StoryRecorder.this.controlContainer, StoryRecorder.this.previewW, AndroidUtilities.dp(220.0f));
            measureChildExactly(StoryRecorder.this.navbarContainer, StoryRecorder.this.previewW, StoryRecorder.this.underControls);
            measureChildExactly(StoryRecorder.this.captionContainer, StoryRecorder.this.previewW, StoryRecorder.this.previewH);
            measureChildExactly(StoryRecorder.this.flashViews.foregroundView, size, size2);
            if (StoryRecorder.this.captionEditOverlay != null) {
                measureChildExactly(StoryRecorder.this.captionEditOverlay, size, size2);
            }
            if (StoryRecorder.this.captionEdit.mentionContainer != null) {
                measureChildExactly(StoryRecorder.this.captionEdit.mentionContainer, StoryRecorder.this.previewW, StoryRecorder.this.previewH);
            }
            if (StoryRecorder.this.photoFilterView != null) {
                measureChildExactly(StoryRecorder.this.photoFilterView, size, size2);
            }
            if (StoryRecorder.this.paintView != null) {
                measureChildExactly(StoryRecorder.this.paintView, size, size2);
            }
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt instanceof ItemOptions.DimView) {
                    measureChildExactly(childAt, size, size2);
                }
            }
            setMeasuredDimension(size, size2);
        }

        @Override
        public void setTranslationY(float f) {
            this.translationY1 = f;
            super.setTranslationY(this.translationY2 + f);
            StoryRecorder.this.dismissProgress = Utilities.clamp((f / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
            StoryRecorder.this.checkBackgroundVisibility();
            StoryRecorder.this.windowView.invalidate();
            float clamp = 1.0f - (Utilities.clamp(getTranslationY() / AndroidUtilities.dp(320.0f), 1.0f, 0.0f) * 0.1f);
            setScaleX(clamp);
            setScaleY(clamp);
        }

        public void setTranslationY2(float f) {
            float f2 = this.translationY1;
            this.translationY2 = f;
            super.setTranslationY(f2 + f);
        }

        public void updateBackground() {
            setBackground(StoryRecorder.this.openType == 0 ? Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), -16777216) : null);
        }
    }

    public static class SourceView {
        Drawable backgroundDrawable;
        ImageReceiver backgroundImageReceiver;
        Paint backgroundPaint;
        boolean hasShadow;
        Drawable iconDrawable;
        int iconSize;
        float rounding;
        View view;
        int type = 0;
        RectF screenRect = new RectF();

        public class AnonymousClass1 extends SourceView {
            AnonymousClass1() {
            }

            @Override
            protected void hide() {
                ProfileActivity.AvatarImageView avatarImageView = ProfileActivity.AvatarImageView.this;
                avatarImageView.drawAvatar = false;
                avatarImageView.invalidate();
            }

            @Override
            protected void show(boolean z) {
                ProfileActivity.AvatarImageView avatarImageView = ProfileActivity.AvatarImageView.this;
                avatarImageView.drawAvatar = true;
                avatarImageView.invalidate();
            }
        }

        public class AnonymousClass2 extends SourceView {
            AnonymousClass2() {
            }

            @Override
            protected void hide() {
                PeerStoriesView currentPeerView = StoryViewer.this.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.animateOut(true);
                }
            }

            @Override
            protected void show(boolean z) {
                PeerStoriesView currentPeerView = StoryViewer.this.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.animateOut(false);
                }
                View view = this.view;
                if (view != null) {
                    view.setTranslationX(0.0f);
                    this.view.setTranslationY(0.0f);
                }
            }
        }

        public class AnonymousClass3 extends SourceView {
            final FrameLayout val$floatingButton;

            AnonymousClass3(FrameLayout frameLayout) {
                this.val$floatingButton = frameLayout;
            }

            @Override
            protected void hide() {
                final FrameLayout frameLayout = this.val$floatingButton;
                frameLayout.post(new Runnable() {
                    @Override
                    public final void run() {
                        frameLayout.setVisibility(8);
                    }
                });
            }

            @Override
            protected void show(boolean z) {
                this.val$floatingButton.setVisibility(0);
            }
        }

        public class AnonymousClass4 extends SourceView {
            final BackupImageView val$imageView;

            AnonymousClass4(BackupImageView backupImageView) {
                this.val$imageView = backupImageView;
            }

            @Override
            protected void hide() {
                final BackupImageView backupImageView = this.val$imageView;
                backupImageView.post(new Runnable() {
                    @Override
                    public final void run() {
                        BackupImageView.this.setVisibility(8);
                    }
                });
            }

            @Override
            protected void show(boolean z) {
                this.val$imageView.setVisibility(0);
            }
        }

        public class AnonymousClass5 extends SourceView {
            final float val$radius;
            final DialogStoriesCell.StoryCell val$storyCell;

            AnonymousClass5(DialogStoriesCell.StoryCell storyCell, float f) {
                this.val$storyCell = storyCell;
                this.val$radius = f;
            }

            public static void lambda$hide$0(DialogStoriesCell.StoryCell storyCell) {
                storyCell.drawAvatar = false;
                storyCell.invalidate();
            }

            @Override
            protected void drawAbove(Canvas canvas, float f) {
                DialogStoriesCell.StoryCell storyCell = this.val$storyCell;
                float f2 = this.val$radius;
                storyCell.drawPlus(canvas, f2, f2, (float) Math.pow(f, 16.0d));
            }

            @Override
            protected void hide() {
                final DialogStoriesCell.StoryCell storyCell = this.val$storyCell;
                storyCell.post(new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.SourceView.AnonymousClass5.lambda$hide$0(DialogStoriesCell.StoryCell.this);
                    }
                });
            }

            @Override
            protected void show(boolean z) {
                DialogStoriesCell.StoryCell storyCell = this.val$storyCell;
                storyCell.drawAvatar = true;
                storyCell.invalidate();
                if (z) {
                    this.val$storyCell.getLocationInWindow(new int[2]);
                    LaunchActivity.makeRipple(r5[0] + (this.val$storyCell.getWidth() / 2.0f), r5[1] + (this.val$storyCell.getHeight() / 2.0f), 1.0f);
                }
            }
        }

        public static SourceView fromAvatarImage(ProfileActivity.AvatarImageView avatarImageView, boolean z) {
            if (avatarImageView == null || avatarImageView.getRootView() == null) {
                return null;
            }
            float scaleX = ((View) avatarImageView.getParent()).getScaleX();
            float imageWidth = avatarImageView.getImageReceiver().getImageWidth() * scaleX;
            float f = z ? 0.32f * imageWidth : imageWidth;
            AnonymousClass1 anonymousClass1 = new SourceView() {
                AnonymousClass1() {
                }

                @Override
                protected void hide() {
                    ProfileActivity.AvatarImageView avatarImageView2 = ProfileActivity.AvatarImageView.this;
                    avatarImageView2.drawAvatar = false;
                    avatarImageView2.invalidate();
                }

                @Override
                protected void show(boolean z2) {
                    ProfileActivity.AvatarImageView avatarImageView2 = ProfileActivity.AvatarImageView.this;
                    avatarImageView2.drawAvatar = true;
                    avatarImageView2.invalidate();
                }
            };
            float[] fArr = new float[2];
            avatarImageView.getRootView().getLocationOnScreen(new int[2]);
            AndroidUtilities.getViewPositionInParent(avatarImageView, (ViewGroup) avatarImageView.getRootView(), fArr);
            float imageX = r4[0] + fArr[0] + (avatarImageView.getImageReceiver().getImageX() * scaleX);
            float imageY = r4[1] + fArr[1] + (avatarImageView.getImageReceiver().getImageY() * scaleX);
            anonymousClass1.screenRect.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
            anonymousClass1.backgroundImageReceiver = avatarImageView.getImageReceiver();
            anonymousClass1.rounding = f;
            return anonymousClass1;
        }

        public static SourceView fromFloatingButton(FrameLayout frameLayout) {
            if (frameLayout == null) {
                return null;
            }
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(frameLayout);
            int[] iArr = new int[2];
            frameLayout.getChildAt(0).getLocationOnScreen(iArr);
            anonymousClass3.screenRect.set(iArr[0], iArr[1], r2 + r3.getWidth(), iArr[1] + r3.getHeight());
            anonymousClass3.hasShadow = true;
            Paint paint = new Paint(1);
            anonymousClass3.backgroundPaint = paint;
            paint.setColor(Theme.getColor(Theme.key_chats_actionBackground));
            anonymousClass3.iconDrawable = frameLayout.getContext().getResources().getDrawable(R.drawable.story_camera).mutate();
            anonymousClass3.iconSize = AndroidUtilities.dp(56.0f);
            anonymousClass3.rounding = Math.max(anonymousClass3.screenRect.width(), anonymousClass3.screenRect.height()) / 2.0f;
            return anonymousClass3;
        }

        public static SourceView fromShareCell(ShareDialogCell shareDialogCell) {
            if (shareDialogCell == null) {
                return null;
            }
            BackupImageView imageView = shareDialogCell.getImageView();
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(imageView);
            int[] iArr = new int[2];
            imageView.getLocationOnScreen(iArr);
            anonymousClass4.screenRect.set(iArr[0], iArr[1], r6 + imageView.getWidth(), iArr[1] + imageView.getHeight());
            anonymousClass4.backgroundDrawable = new ShareDialogCell.RepostStoryDrawable(imageView.getContext(), null, false, shareDialogCell.resourcesProvider);
            anonymousClass4.rounding = Math.max(anonymousClass4.screenRect.width(), anonymousClass4.screenRect.height()) / 2.0f;
            return anonymousClass4;
        }

        public static SourceView fromStoryCell(DialogStoriesCell.StoryCell storyCell) {
            if (storyCell == null || storyCell.getRootView() == null) {
                return null;
            }
            float imageWidth = storyCell.avatarImage.getImageWidth();
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(storyCell, imageWidth / 2.0f);
            float[] fArr = new float[2];
            storyCell.getRootView().getLocationOnScreen(new int[2]);
            AndroidUtilities.getViewPositionInParent(storyCell, (ViewGroup) storyCell.getRootView(), fArr);
            float imageX = r4[0] + fArr[0] + storyCell.avatarImage.getImageX();
            float imageY = r4[1] + fArr[1] + storyCell.avatarImage.getImageY();
            anonymousClass5.screenRect.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
            anonymousClass5.backgroundImageReceiver = storyCell.avatarImage;
            anonymousClass5.rounding = Math.max(anonymousClass5.screenRect.width(), anonymousClass5.screenRect.height()) / 2.0f;
            return anonymousClass5;
        }

        public static SourceView fromStoryViewer(StoryViewer storyViewer) {
            if (storyViewer == null) {
                return null;
            }
            AnonymousClass2 anonymousClass2 = new SourceView() {
                AnonymousClass2() {
                }

                @Override
                protected void hide() {
                    PeerStoriesView currentPeerView = StoryViewer.this.getCurrentPeerView();
                    if (currentPeerView != null) {
                        currentPeerView.animateOut(true);
                    }
                }

                @Override
                protected void show(boolean z) {
                    PeerStoriesView currentPeerView = StoryViewer.this.getCurrentPeerView();
                    if (currentPeerView != null) {
                        currentPeerView.animateOut(false);
                    }
                    View view = this.view;
                    if (view != null) {
                        view.setTranslationX(0.0f);
                        this.view.setTranslationY(0.0f);
                    }
                }
            };
            if (!storyViewer.getStoryRect(anonymousClass2.screenRect)) {
                return null;
            }
            anonymousClass2.type = 1;
            anonymousClass2.rounding = AndroidUtilities.dp(8.0f);
            PeerStoriesView currentPeerView = storyViewer.getCurrentPeerView();
            if (currentPeerView != null) {
                anonymousClass2.view = currentPeerView.storyContainer;
            }
            return anonymousClass2;
        }

        protected void drawAbove(Canvas canvas, float f) {
        }

        protected abstract void hide();

        protected abstract void show(boolean z);
    }

    public interface Touchable {
        boolean onTouch(MotionEvent motionEvent);
    }

    public class WindowView extends SizeNotifierFrameLayout {
        private boolean allowModeScroll;
        private boolean flingDetected;
        private GestureDetectorFixDoubleTap gestureDetector;
        private boolean ignoreLayout;
        private ScaleGestureDetector scaleGestureDetector;
        private boolean scaling;
        private float stx;
        private float sty;
        private float ty;

        public final class GestureListener extends GestureDetectorFixDoubleTap.OnGestureListener {
            private GestureListener() {
            }

            GestureListener(WindowView windowView, AnonymousClass1 anonymousClass1) {
                this();
            }

            @Override
            public boolean hasDoubleTap(MotionEvent motionEvent) {
                return (StoryRecorder.this.currentPage != 0 || StoryRecorder.this.cameraView == null || StoryRecorder.this.awaitingPlayer || !StoryRecorder.this.cameraView.isInited() || StoryRecorder.this.takingPhoto || StoryRecorder.this.recordControl.isTouch() || StoryRecorder.this.isGalleryOpen() || StoryRecorder.this.galleryListViewOpening != null) ? false : true;
            }

            @Override
            public boolean onDoubleTap(MotionEvent motionEvent) {
                if (StoryRecorder.this.cameraView == null || StoryRecorder.this.awaitingPlayer || StoryRecorder.this.takingPhoto || !StoryRecorder.this.cameraView.isInited() || StoryRecorder.this.currentPage != 0) {
                    return false;
                }
                StoryRecorder.this.cameraView.switchCamera();
                StoryRecorder.this.recordControl.rotateFlip(180.0f);
                StoryRecorder storyRecorder = StoryRecorder.this;
                storyRecorder.saveCameraFace(storyRecorder.cameraView.isFrontface());
                if (StoryRecorder.this.useDisplayFlashlight()) {
                    StoryRecorder.this.flashViews.flashIn(null);
                    return true;
                }
                StoryRecorder.this.flashViews.flashOut();
                return true;
            }

            @Override
            public boolean onDoubleTapEvent(MotionEvent motionEvent) {
                if (StoryRecorder.this.cameraView == null) {
                    return false;
                }
                StoryRecorder.this.cameraView.clearTapFocus();
                return false;
            }

            @Override
            public boolean onDown(MotionEvent motionEvent) {
                WindowView.this.sty = 0.0f;
                WindowView.this.stx = 0.0f;
                return false;
            }

            @Override
            public boolean onFling(android.view.MotionEvent r4, android.view.MotionEvent r5, float r6, float r7) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.StoryRecorder.WindowView.GestureListener.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
            }

            @Override
            public void onLongPress(MotionEvent motionEvent) {
            }

            @Override
            public boolean onScroll(android.view.MotionEvent r4, android.view.MotionEvent r5, float r6, float r7) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.StoryRecorder.WindowView.GestureListener.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
            }

            @Override
            public void onShowPress(MotionEvent motionEvent) {
            }

            @Override
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (StoryRecorder.this.cameraView == null) {
                    return false;
                }
                StoryRecorder.this.cameraView.allowToTapFocus();
                return true;
            }

            @Override
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                StoryRecorder.this.scrollingY = false;
                StoryRecorder.this.scrollingX = false;
                if (!hasDoubleTap(motionEvent) && onSingleTapConfirmed(motionEvent)) {
                    return true;
                }
                if (!StoryRecorder.this.isGalleryOpen() || motionEvent.getY() >= StoryRecorder.this.galleryListView.top()) {
                    return false;
                }
                StoryRecorder.this.lambda$animateGalleryListView$48(false);
                return true;
            }
        }

        public final class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
            private ScaleListener() {
            }

            ScaleListener(WindowView windowView, AnonymousClass1 anonymousClass1) {
                this();
            }

            @Override
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                if (!WindowView.this.scaling || StoryRecorder.this.cameraView == null || StoryRecorder.this.currentPage != 0 || StoryRecorder.this.cameraView.isDualTouch()) {
                    return false;
                }
                StoryRecorder.access$3516(StoryRecorder.this, (scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
                StoryRecorder storyRecorder = StoryRecorder.this;
                storyRecorder.cameraZoom = Utilities.clamp(storyRecorder.cameraZoom, 1.0f, 0.0f);
                StoryRecorder.this.cameraView.setZoom(StoryRecorder.this.cameraZoom);
                if (StoryRecorder.this.zoomControlView != null) {
                    StoryRecorder.this.zoomControlView.setZoom(StoryRecorder.this.cameraZoom, false);
                }
                StoryRecorder.this.showZoomControls(true, true);
                return true;
            }

            @Override
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                if (StoryRecorder.this.cameraView == null || StoryRecorder.this.currentPage != 0 || StoryRecorder.this.wasGalleryOpen) {
                    return false;
                }
                WindowView.this.scaling = true;
                return super.onScaleBegin(scaleGestureDetector);
            }

            @Override
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                WindowView.this.scaling = false;
                StoryRecorder.this.lambda$animateGalleryListView$48(false);
                StoryRecorder.this.animateContainerBack();
                super.onScaleEnd(scaleGestureDetector);
            }
        }

        public WindowView(Context context) {
            super(context);
            this.scaling = false;
            this.allowModeScroll = true;
            this.gestureDetector = new GestureDetectorFixDoubleTap(context, new GestureListener());
            this.scaleGestureDetector = new ScaleGestureDetector(context, new ScaleListener());
        }

        static float access$3916(WindowView windowView, float f) {
            float f2 = windowView.sty + f;
            windowView.sty = f2;
            return f2;
        }

        static float access$4016(WindowView windowView, float f) {
            float f2 = windowView.stx + f;
            windowView.stx = f2;
            return f2;
        }

        static float access$4724(WindowView windowView, float f) {
            float f2 = windowView.ty - f;
            windowView.ty = f2;
            return f2;
        }

        @Override
        public void dispatchDraw(android.graphics.Canvas r17) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.StoryRecorder.WindowView.dispatchDraw(android.graphics.Canvas):void");
        }

        @Override
        public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
            if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                return super.dispatchKeyEventPreIme(keyEvent);
            }
            StoryRecorder.this.onBackPressed();
            return true;
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            this.flingDetected = false;
            this.scaleGestureDetector.onTouchEvent(motionEvent);
            this.gestureDetector.onTouchEvent(motionEvent);
            if (motionEvent.getAction() == 1 && !this.flingDetected) {
                this.allowModeScroll = true;
                if (StoryRecorder.this.containerView.getTranslationY() > 0.0f) {
                    if (StoryRecorder.this.dismissProgress > 0.4f) {
                        StoryRecorder.this.close(true);
                    } else {
                        StoryRecorder.this.animateContainerBack();
                    }
                } else if (StoryRecorder.this.galleryListView != null && StoryRecorder.this.galleryListView.getTranslationY() > 0.0f && !StoryRecorder.this.galleryClosing) {
                    StoryRecorder storyRecorder = StoryRecorder.this;
                    storyRecorder.lambda$animateGalleryListView$48(!storyRecorder.takingVideo && StoryRecorder.this.galleryListView.getTranslationY() < ((float) StoryRecorder.this.galleryListView.getPadding()));
                }
                StoryRecorder.this.galleryClosing = false;
                StoryRecorder.this.modeSwitcherView.stopScroll(0.0f);
                StoryRecorder.this.scrollingY = false;
                StoryRecorder.this.scrollingX = false;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        public void drawBlurBitmap(Bitmap bitmap, float f) {
            Canvas canvas = new Canvas(bitmap);
            canvas.drawColor(-16777216);
            float width = bitmap.getWidth() / StoryRecorder.this.windowView.getWidth();
            canvas.scale(width, width);
            TextureView textureView = StoryRecorder.this.previewView.getTextureView();
            if (textureView == null) {
                textureView = StoryRecorder.this.previewView.filterTextureView;
            }
            if (textureView != null) {
                canvas.save();
                canvas.translate(StoryRecorder.this.containerView.getX() + StoryRecorder.this.previewContainer.getX(), StoryRecorder.this.containerView.getY() + StoryRecorder.this.previewContainer.getY());
                try {
                    Bitmap bitmap2 = textureView.getBitmap((int) (textureView.getWidth() / f), (int) (textureView.getHeight() / f));
                    float f2 = 1.0f / width;
                    canvas.scale(f2, f2);
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint(2));
                    bitmap2.recycle();
                } catch (Exception unused) {
                }
                canvas.restore();
            }
            canvas.save();
            canvas.translate(StoryRecorder.this.containerView.getX(), StoryRecorder.this.containerView.getY());
            for (int i = 0; i < StoryRecorder.this.containerView.getChildCount(); i++) {
                View childAt = StoryRecorder.this.containerView.getChildAt(i);
                canvas.save();
                canvas.translate(childAt.getX(), childAt.getY());
                if (childAt.getVisibility() == 0) {
                    if (childAt == StoryRecorder.this.previewContainer) {
                        for (int i2 = 0; i2 < StoryRecorder.this.previewContainer.getChildCount(); i2++) {
                            View childAt2 = StoryRecorder.this.previewContainer.getChildAt(i2);
                            if (childAt2 != StoryRecorder.this.previewView && childAt2 != StoryRecorder.this.cameraView && childAt2 != StoryRecorder.this.cameraViewThumb && childAt2.getVisibility() == 0) {
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                childAt2.draw(canvas);
                                canvas.restore();
                            }
                        }
                    } else {
                        childAt.draw(canvas);
                    }
                    canvas.restore();
                }
            }
            canvas.restore();
        }

        @Override
        public int getBottomPadding() {
            return (getHeight() - StoryRecorder.this.containerView.getBottom()) + StoryRecorder.this.underControls;
        }

        public int getBottomPadding2() {
            return getHeight() - StoryRecorder.this.containerView.getBottom();
        }

        public int getPaddingUnderContainer() {
            return (getHeight() - StoryRecorder.this.insetBottom) - StoryRecorder.this.containerView.getBottom();
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            EmojiView emojiView;
            if (this.ignoreLayout) {
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            int i7 = StoryRecorder.this.insetTop;
            int measuredHeight = StoryRecorder.this.navbarContainer.getMeasuredHeight();
            if (StoryRecorder.this.underStatusBar) {
                i7 = 0;
            }
            int i8 = StoryRecorder.this.insetLeft + (((i5 - StoryRecorder.this.insetRight) - StoryRecorder.this.previewW) / 2);
            int i9 = StoryRecorder.this.insetLeft + (((i5 - StoryRecorder.this.insetRight) + StoryRecorder.this.previewW) / 2);
            if (!StoryRecorder.this.underStatusBar) {
                int i10 = (((((i6 - i7) - StoryRecorder.this.insetBottom) - StoryRecorder.this.previewH) - measuredHeight) / 2) + i7;
                if (StoryRecorder.this.openType == 1 && StoryRecorder.this.fromRect.top + StoryRecorder.this.previewH + measuredHeight < i6 - StoryRecorder.this.insetBottom) {
                    i7 = (int) StoryRecorder.this.fromRect.top;
                } else if (i10 - i7 >= AndroidUtilities.dp(40.0f)) {
                    i7 = i10;
                }
            }
            StoryRecorder.this.containerView.layout(i8, i7, i9, StoryRecorder.this.previewH + i7 + measuredHeight);
            StoryRecorder.this.flashViews.backgroundView.layout(0, 0, i5, i6);
            if (StoryRecorder.this.thanosEffect != null) {
                StoryRecorder.this.thanosEffect.layout(0, 0, i5, i6);
            }
            if (StoryRecorder.this.changeDayNightView != null) {
                StoryRecorder.this.changeDayNightView.layout(0, 0, i5, i6);
            }
            if (StoryRecorder.this.galleryListView != null) {
                StoryRecorder.this.galleryListView.layout((i5 - StoryRecorder.this.galleryListView.getMeasuredWidth()) / 2, 0, (StoryRecorder.this.galleryListView.getMeasuredWidth() + i5) / 2, i6);
            }
            StoryRecorder.access$6400(StoryRecorder.this);
            if (StoryRecorder.this.captionEdit != null && (emojiView = StoryRecorder.this.captionEdit.editText.getEmojiView()) != null) {
                emojiView.layout(StoryRecorder.this.insetLeft, (i6 - StoryRecorder.this.insetBottom) - emojiView.getMeasuredHeight(), i5 - StoryRecorder.this.insetRight, i6 - StoryRecorder.this.insetBottom);
            }
            if (StoryRecorder.this.paintView != null) {
                if (StoryRecorder.this.paintView.emojiView != null) {
                    StoryRecorder.this.paintView.emojiView.layout(StoryRecorder.this.insetLeft, (i6 - StoryRecorder.this.insetBottom) - StoryRecorder.this.paintView.emojiView.getMeasuredHeight(), i5 - StoryRecorder.this.insetRight, i6 - StoryRecorder.this.insetBottom);
                }
                if (StoryRecorder.this.paintView.reactionLayout != null) {
                    StoryRecorder.this.paintView.reactionLayout.layout(StoryRecorder.this.insetLeft, StoryRecorder.this.insetTop, StoryRecorder.this.insetLeft + StoryRecorder.this.paintView.reactionLayout.getMeasuredWidth(), StoryRecorder.this.insetTop + StoryRecorder.this.paintView.reactionLayout.getMeasuredHeight());
                    FrameLayout frameLayout = StoryRecorder.this.paintView.reactionLayout.getReactionsWindow() != null ? StoryRecorder.this.paintView.reactionLayout.getReactionsWindow().windowView : null;
                    if (frameLayout != null) {
                        frameLayout.layout(StoryRecorder.this.insetLeft, StoryRecorder.this.insetTop, StoryRecorder.this.insetLeft + frameLayout.getMeasuredWidth(), StoryRecorder.this.insetTop + frameLayout.getMeasuredHeight());
                    }
                }
            }
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof DownloadButton.PreparingVideoToast) {
                    childAt.layout(0, 0, i5, i6);
                } else if (childAt instanceof Bulletin.ParentLayout) {
                    childAt.layout(0, i7, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i7);
                }
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            if (Build.VERSION.SDK_INT < 21) {
                StoryRecorder.this.insetTop = AndroidUtilities.statusBarHeight;
                StoryRecorder.this.insetBottom = AndroidUtilities.navigationBarHeight;
            }
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int i3 = (size - StoryRecorder.this.insetLeft) - StoryRecorder.this.insetRight;
            int i4 = StoryRecorder.this.insetTop;
            int i5 = StoryRecorder.this.insetBottom;
            int ceil = (int) Math.ceil((i3 / 9.0f) * 16.0f);
            StoryRecorder.this.underControls = AndroidUtilities.dp(48.0f);
            int i6 = size2 - i5;
            if (StoryRecorder.this.underControls + ceil <= i6) {
                StoryRecorder.this.previewW = i3;
                StoryRecorder.this.previewH = ceil;
                StoryRecorder storyRecorder = StoryRecorder.this;
                storyRecorder.underStatusBar = storyRecorder.previewH + StoryRecorder.this.underControls > i6 - i4;
            } else {
                StoryRecorder.this.underStatusBar = false;
                StoryRecorder storyRecorder2 = StoryRecorder.this;
                storyRecorder2.previewH = ((size2 - storyRecorder2.underControls) - i5) - i4;
                StoryRecorder.this.previewW = (int) Math.ceil((r4.previewH * 9.0f) / 16.0f);
            }
            StoryRecorder storyRecorder3 = StoryRecorder.this;
            storyRecorder3.underControls = Utilities.clamp((size2 - storyRecorder3.previewH) - (StoryRecorder.this.underStatusBar ? 0 : i4), AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
            int systemUiVisibility = getSystemUiVisibility();
            setSystemUiVisibility(StoryRecorder.this.underStatusBar ? systemUiVisibility | 4 : systemUiVisibility & (-5));
            StoryRecorder.this.containerView.measure(View.MeasureSpec.makeMeasureSpec(StoryRecorder.this.previewW, 1073741824), View.MeasureSpec.makeMeasureSpec(StoryRecorder.this.previewH + StoryRecorder.this.underControls, 1073741824));
            StoryRecorder.this.flashViews.backgroundView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            if (StoryRecorder.this.thanosEffect != null) {
                StoryRecorder.this.thanosEffect.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }
            if (StoryRecorder.this.changeDayNightView != null) {
                StoryRecorder.this.changeDayNightView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }
            StoryRecorder.access$6400(StoryRecorder.this);
            if (StoryRecorder.this.galleryListView != null) {
                StoryRecorder.this.galleryListView.measure(View.MeasureSpec.makeMeasureSpec(StoryRecorder.this.previewW, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }
            if (StoryRecorder.this.captionEdit != null) {
                EmojiView emojiView = StoryRecorder.this.captionEdit.editText.getEmojiView();
                if (measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                    this.ignoreLayout = false;
                }
                if (emojiView != null) {
                    emojiView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
                }
            }
            if (StoryRecorder.this.paintView != null) {
                if (StoryRecorder.this.paintView.emojiView != null) {
                    StoryRecorder.this.paintView.emojiView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(StoryRecorder.this.paintView.emojiView.getLayoutParams().height, 1073741824));
                }
                if (StoryRecorder.this.paintView.reactionLayout != null) {
                    measureChild(StoryRecorder.this.paintView.reactionLayout, i, i2);
                    if (StoryRecorder.this.paintView.reactionLayout.getReactionsWindow() != null) {
                        measureChild(StoryRecorder.this.paintView.reactionLayout.getReactionsWindow().windowView, i, i2);
                    }
                }
            }
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (childAt instanceof DownloadButton.PreparingVideoToast) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                } else if (childAt instanceof Bulletin.ParentLayout) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(340.0f), size2 - (StoryRecorder.this.underStatusBar ? 0 : i4)), 1073741824);
                }
                childAt.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            setMeasuredDimension(size, size2);
        }
    }

    public StoryRecorder(Activity activity, int i) {
        this.activity = activity;
        this.currentAccount = i;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.windowLayoutParams = layoutParams;
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.format = -3;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        layoutParams.flags = 134283520;
        if (i2 >= 21) {
            layoutParams.flags = -2013200128;
        }
        layoutParams.softInputMode = 16;
        this.windowManager = (WindowManager) activity.getSystemService("window");
        initViews();
    }

    static float access$3516(StoryRecorder storyRecorder, float f) {
        float f2 = storyRecorder.cameraZoom + f;
        storyRecorder.cameraZoom = f2;
        return f2;
    }

    static StoryWaveEffectView access$600(StoryRecorder storyRecorder) {
        storyRecorder.getClass();
        return null;
    }

    static StoryThemeSheet access$6400(StoryRecorder storyRecorder) {
        storyRecorder.getClass();
        return null;
    }

    public void animateContainerBack() {
        ValueAnimator valueAnimator = this.containerViewBackAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.containerViewBackAnimator = null;
        }
        this.applyContainerViewTranslation2 = false;
        final float translationY1 = this.containerView.getTranslationY1();
        final float translationY2 = this.containerView.getTranslationY2();
        this.containerView.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.containerViewBackAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                StoryRecorder.this.lambda$animateContainerBack$44(translationY1, translationY2, valueAnimator2);
            }
        });
        this.containerViewBackAnimator.setDuration(340L);
        this.containerViewBackAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.containerViewBackAnimator.addListener(new AnimatorListenerAdapter() {
            AnonymousClass17() {
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                StoryRecorder.this.containerViewBackAnimator = null;
                StoryRecorder.this.containerView.setTranslationY(0.0f);
                StoryRecorder.this.containerView.setTranslationY2(0.0f);
            }
        });
        this.containerViewBackAnimator.start();
    }

    public void lambda$animateGalleryListView$48(final boolean z) {
        DraftSavedHint draftSavedHint;
        this.wasGalleryOpen = z;
        Boolean bool = this.galleryListViewOpening;
        if (bool == null || bool.booleanValue() != z) {
            if (this.galleryListView == null) {
                if (z) {
                    createGalleryListView();
                }
                if (this.galleryListView == null) {
                    return;
                }
            }
            if (this.galleryListView.firstLayout) {
                this.galleryLayouted = new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.this.lambda$animateGalleryListView$48(z);
                    }
                };
                return;
            }
            ValueAnimator valueAnimator = this.galleryOpenCloseAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.galleryOpenCloseAnimator = null;
            }
            SpringAnimation springAnimation = this.galleryOpenCloseSpringAnimator;
            if (springAnimation != null) {
                springAnimation.cancel();
                this.galleryOpenCloseSpringAnimator = null;
            }
            if (this.galleryListView == null) {
                if (z) {
                    createGalleryListView();
                }
                if (this.galleryListView == null) {
                    return;
                }
            }
            GalleryListView galleryListView = this.galleryListView;
            if (galleryListView != null) {
                galleryListView.ignoreScroll = false;
            }
            if (z && (draftSavedHint = this.draftSavedHint) != null) {
                draftSavedHint.hide(true);
            }
            this.galleryListViewOpening = Boolean.valueOf(z);
            float translationY = this.galleryListView.getTranslationY();
            final float height = z ? 0.0f : (this.windowView.getHeight() - this.galleryListView.top()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            Math.max(1, this.windowView.getHeight());
            this.galleryListView.ignoreScroll = !z;
            this.applyContainerViewTranslation2 = this.containerViewBackAnimator == null;
            if (z) {
                SpringAnimation springAnimation2 = new SpringAnimation(this.galleryListView, DynamicAnimation.TRANSLATION_Y, height);
                this.galleryOpenCloseSpringAnimator = springAnimation2;
                springAnimation2.getSpring().setDampingRatio(0.75f);
                this.galleryOpenCloseSpringAnimator.getSpring().setStiffness(350.0f);
                this.galleryOpenCloseSpringAnimator.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                    @Override
                    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
                        StoryRecorder.this.lambda$animateGalleryListView$49(height, dynamicAnimation, z2, f, f2);
                    }
                });
                this.galleryOpenCloseSpringAnimator.start();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.galleryOpenCloseAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        StoryRecorder.this.lambda$animateGalleryListView$50(valueAnimator2);
                    }
                });
                this.galleryOpenCloseAnimator.addListener(new AnimatorListenerAdapter() {
                    AnonymousClass20() {
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        StoryRecorder.this.windowView.removeView(StoryRecorder.this.galleryListView);
                        StoryRecorder.this.galleryListView = null;
                        StoryRecorder.this.galleryOpenCloseAnimator = null;
                        StoryRecorder.this.galleryListViewOpening = null;
                        StoryRecorder.this.captionEdit.keyboardNotifier.ignore(StoryRecorder.this.currentPage != 1);
                    }
                });
                this.galleryOpenCloseAnimator.setDuration(450L);
                this.galleryOpenCloseAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.galleryOpenCloseAnimator.start();
            }
            if (!z && !this.awaitingPlayer) {
                this.lastGalleryScrollPosition = null;
            }
            if (z || this.currentPage != 0 || this.noCameraPermission) {
                return;
            }
            createCameraView();
        }
    }

    private void animateOpenTo(float f, boolean z, Runnable runnable) {
        ValueAnimator valueAnimator;
        TimeInterpolator fastOutSlowInInterpolator;
        ValueAnimator valueAnimator2;
        long j;
        ValueAnimator valueAnimator3 = this.openCloseAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            this.openCloseAnimator = null;
        }
        if (z) {
            this.notificationsLocker.lock();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.frozenDismissProgress = Float.valueOf(this.dismissProgress);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.openProgress, f);
            this.openCloseAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    StoryRecorder.this.lambda$animateOpenTo$3(valueAnimator4);
                }
            });
            this.openCloseAnimator.addListener(new AnimatorListenerAdapter() {
                final Runnable val$onDone;
                final float val$value;

                AnonymousClass1(float f2, Runnable runnable2) {
                    r2 = f2;
                    r3 = runnable2;
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    StoryRecorder.this.frozenDismissProgress = null;
                    StoryRecorder.this.openProgress = r2;
                    StoryRecorder.this.applyOpenProgress();
                    StoryRecorder.this.containerView.invalidate();
                    StoryRecorder.this.windowView.invalidate();
                    Runnable runnable2 = r3;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    if (StoryRecorder.this.fromSourceView != null) {
                        StoryRecorder.access$600(StoryRecorder.this);
                    }
                    StoryRecorder.this.notificationsLocker.unlock();
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    NotificationCenter.getGlobalInstance().runDelayedNotifications();
                    StoryRecorder.this.checkBackgroundVisibility();
                    if (StoryRecorder.this.onFullyOpenListener != null) {
                        StoryRecorder.this.onFullyOpenListener.run();
                        StoryRecorder.this.onFullyOpenListener = null;
                    }
                    StoryRecorder.this.containerView.invalidate();
                    StoryRecorder.this.previewContainer.invalidate();
                }
            });
            if (f2 < 1.0f && this.wasSend) {
                valueAnimator2 = this.openCloseAnimator;
                j = 250;
            } else if (f2 > 0.0f || this.containerView.getTranslationY1() < AndroidUtilities.dp(20.0f)) {
                this.openCloseAnimator.setDuration(300L);
                valueAnimator = this.openCloseAnimator;
                fastOutSlowInInterpolator = new FastOutSlowInInterpolator();
                valueAnimator.setInterpolator(fastOutSlowInInterpolator);
                this.openCloseAnimator.start();
            } else {
                valueAnimator2 = this.openCloseAnimator;
                j = 400;
            }
            valueAnimator2.setDuration(j);
            valueAnimator = this.openCloseAnimator;
            fastOutSlowInInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            valueAnimator.setInterpolator(fastOutSlowInInterpolator);
            this.openCloseAnimator.start();
        } else {
            this.frozenDismissProgress = null;
            this.openProgress = f2;
            applyOpenProgress();
            this.containerView.invalidate();
            this.windowView.invalidate();
            if (runnable2 != null) {
                runnable2.run();
            }
            checkBackgroundVisibility();
        }
        if (f2 > 0.0f) {
            firstOpen = false;
        }
    }

    public void animateRecording(boolean z, boolean z2) {
        DualCameraView dualCameraView;
        DualCameraView dualCameraView2;
        if (z) {
            HintView2 hintView2 = this.dualHint;
            if (hintView2 != null) {
                hintView2.hide();
            }
            HintView2 hintView22 = this.savedDualHint;
            if (hintView22 != null) {
                hintView22.hide();
            }
            HintView2 hintView23 = this.muteHint;
            if (hintView23 != null) {
                hintView23.hide();
            }
            HintView2 hintView24 = this.cameraHint;
            if (hintView24 != null) {
                hintView24.hide();
            }
        }
        if (this.animatedRecording == z) {
            return;
        }
        AnimatorSet animatorSet = this.recordingAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.recordingAnimator = null;
        }
        this.animatedRecording = z;
        int i = 8;
        if (!z2) {
            this.backButton.setAlpha(z ? 0.0f : 1.0f);
            this.backButton.setVisibility(z ? 8 : 0);
            this.flashButton.setAlpha((z || this.currentPage != 0) ? 0.0f : 1.0f);
            this.flashButton.setVisibility((z || this.currentPage != 0) ? 8 : 0);
            this.dualButton.setAlpha((z || this.currentPage != 0) ? 0.0f : 1.0f);
            this.dualButton.setVisibility((z || this.currentPage != 0 || (dualCameraView = this.cameraView) == null || !dualCameraView.dualAvailable()) ? 8 : 0);
            this.hintTextView.setAlpha((z && this.currentPage == 0) ? 1.0f : 0.0f);
            this.hintTextView.setTranslationY((z || this.currentPage != 0) ? 0.0f : AndroidUtilities.dp(16.0f));
            this.modeSwitcherView.setAlpha((z || this.currentPage != 0) ? 0.0f : 1.0f);
            this.modeSwitcherView.setTranslationY((z || this.currentPage != 0) ? AndroidUtilities.dp(16.0f) : 0.0f);
            return;
        }
        this.backButton.setVisibility(0);
        this.flashButton.setVisibility(0);
        ToggleButton toggleButton = this.dualButton;
        DualCameraView dualCameraView3 = this.cameraView;
        if (dualCameraView3 != null && dualCameraView3.dualAvailable()) {
            i = 0;
        }
        toggleButton.setVisibility(i);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.recordingAnimator = animatorSet2;
        FlashViews.ImageViewInvertable imageViewInvertable = this.backButton;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageViewInvertable, (Property<FlashViews.ImageViewInvertable, Float>) property, z ? 0.0f : 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.flashButton, (Property<ToggleButton2, Float>) property, (z || this.currentPage != 0) ? 0.0f : 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.dualButton, (Property<ToggleButton, Float>) property, (z || this.currentPage != 0 || (dualCameraView2 = this.cameraView) == null || !dualCameraView2.dualAvailable()) ? 0.0f : 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.hintTextView, (Property<HintTextView, Float>) property, (z && this.currentPage == 0) ? 1.0f : 0.0f);
        HintTextView hintTextView = this.hintTextView;
        Property property2 = View.TRANSLATION_Y;
        animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(hintTextView, (Property<HintTextView, Float>) property2, (z || this.currentPage != 0) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(this.modeSwitcherView, (Property<PhotoVideoSwitcherView, Float>) property, (z || this.currentPage != 0) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(this.modeSwitcherView, (Property<PhotoVideoSwitcherView, Float>) property2, (z || this.currentPage != 0) ? AndroidUtilities.dp(16.0f) : 0.0f));
        this.recordingAnimator.addListener(new AnimatorListenerAdapter() {
            final boolean val$recording;

            AnonymousClass13(boolean z3) {
                r2 = z3;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (r2) {
                    StoryRecorder.this.backButton.setVisibility(8);
                }
                if (r2 || StoryRecorder.this.currentPage != 0) {
                    StoryRecorder.this.flashButton.setVisibility(8);
                }
            }
        });
        this.recordingAnimator.setDuration(260L);
        this.recordingAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.recordingAnimator.start();
    }

    private void applyFilter(Runnable runnable) {
        StoryEntry storyEntry;
        PreviewView previewView;
        PhotoFilterView photoFilterView = this.photoFilterView;
        if (photoFilterView == null || (storyEntry = this.outputEntry) == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        storyEntry.editedMedia = photoFilterView.hasChanges() | storyEntry.editedMedia;
        this.outputEntry.updateFilter(this.photoFilterView, runnable);
        if (runnable == null) {
            StoryEntry storyEntry2 = this.outputEntry;
            if (storyEntry2.isVideo || (previewView = this.previewView) == null) {
                return;
            }
            previewView.set(storyEntry2);
        }
    }

    public void applyFilterMatrix() {
        if (this.outputEntry == null || this.photoFilterViewTextureView == null || this.previewContainer.getMeasuredWidth() <= 0 || this.previewContainer.getMeasuredHeight() <= 0) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        if (this.outputEntry.orientation != 0) {
            matrix.postRotate(-r1, this.previewContainer.getMeasuredWidth() / 2.0f, this.previewContainer.getMeasuredHeight() / 2.0f);
            if ((this.outputEntry.orientation / 90) % 2 == 1) {
                matrix.postScale(this.previewContainer.getMeasuredWidth() / this.previewContainer.getMeasuredHeight(), this.previewContainer.getMeasuredHeight() / this.previewContainer.getMeasuredWidth(), this.previewContainer.getMeasuredWidth() / 2.0f, this.previewContainer.getMeasuredHeight() / 2.0f);
            }
        }
        matrix.postScale((1.0f / this.previewContainer.getMeasuredWidth()) * this.outputEntry.width, (1.0f / this.previewContainer.getMeasuredHeight()) * this.outputEntry.height);
        matrix.postConcat(this.outputEntry.matrix);
        matrix.postScale(this.previewContainer.getMeasuredWidth() / this.outputEntry.resultWidth, this.previewContainer.getMeasuredHeight() / this.outputEntry.resultHeight);
        this.photoFilterViewTextureView.setTransform(matrix);
        this.photoFilterViewTextureView.invalidate();
    }

    public void applyOpenProgress() {
        View view;
        if (this.openType != 1) {
            return;
        }
        this.fullRectF.set(this.previewContainer.getLeft(), this.previewContainer.getTop(), this.previewContainer.getMeasuredWidth(), this.previewContainer.getMeasuredHeight());
        this.fullRectF.offset(this.containerView.getX(), this.containerView.getY());
        AndroidUtilities.lerp(this.fromRect, this.fullRectF, this.openProgress, this.rectF);
        this.previewContainer.setAlpha(this.openProgress);
        this.previewContainer.setTranslationX((this.rectF.left - r0.getLeft()) - this.containerView.getX());
        this.previewContainer.setTranslationY((this.rectF.top - r0.getTop()) - this.containerView.getY());
        SourceView sourceView = this.fromSourceView;
        if (sourceView != null && (view = sourceView.view) != null) {
            view.setTranslationX((this.fullRectF.left - this.fromRect.left) * this.openProgress);
            this.fromSourceView.view.setTranslationY((this.fullRectF.top - this.fromRect.top) * this.openProgress);
        }
        this.previewContainer.setScaleX(this.rectF.width() / this.previewContainer.getMeasuredWidth());
        this.previewContainer.setScaleY(this.rectF.height() / this.previewContainer.getMeasuredHeight());
        this.actionBarContainer.setAlpha(this.openProgress);
        this.controlContainer.setAlpha(this.openProgress);
        this.captionContainer.setAlpha(this.openProgress);
        if (this.currentPage == 2) {
            this.coverButton.setAlpha(this.openProgress);
        }
    }

    private void applyPaint() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.StoryRecorder.applyPaint():void");
    }

    private void applyPaintInBackground(final Runnable runnable) {
        final PaintView paintView = this.paintView;
        final StoryEntry storyEntry = this.outputEntry;
        if (paintView == null || storyEntry == null) {
            runnable.run();
            return;
        }
        storyEntry.clearPaint();
        final boolean hasChanges = paintView.hasChanges();
        final boolean hasBlur = paintView.hasBlur();
        final int i = storyEntry.resultWidth;
        final int i2 = storyEntry.resultHeight;
        Utilities.searchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.lambda$applyPaintInBackground$58(paintView, i, i2, storyEntry, hasBlur, hasChanges, runnable);
            }
        });
    }

    private void applyPaintMessage() {
        StoryEntry storyEntry;
        if (this.paintView == null || (storyEntry = this.outputEntry) == null || !storyEntry.isRepostMessage) {
            return;
        }
        File file = storyEntry.messageFile;
        if (file != null) {
            try {
                file.delete();
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.outputEntry.messageFile = null;
        }
        this.outputEntry.messageFile = StoryEntry.makeCacheFile(this.currentAccount, "webp");
        PaintView paintView = this.paintView;
        StoryEntry storyEntry2 = this.outputEntry;
        Bitmap bitmap = paintView.getBitmap(storyEntry2.mediaEntities, storyEntry2.resultWidth, storyEntry2.resultHeight, false, false, true, !this.isVideo, storyEntry2);
        try {
            try {
                bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.outputEntry.messageFile));
                if (bitmap.isRecycled()) {
                    return;
                }
            } catch (Exception e2) {
                FileLog.e(e2);
                try {
                    this.outputEntry.messageFile.delete();
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
                this.outputEntry.messageFile = null;
                if (bitmap == null || bitmap.isRecycled()) {
                    return;
                }
            }
            bitmap.recycle();
        } catch (Throwable th) {
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
            throw th;
        }
    }

    public static CharSequence cameraBtnSpan(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable mutate = context.getResources().getDrawable(R.drawable.story_camera).mutate();
        int dp = AndroidUtilities.dp(35.0f);
        int i = -dp;
        mutate.setBounds(i / 4, i, (dp / 4) * 3, 0);
        spannableString.setSpan(new ImageSpan(mutate) {
            final Drawable val$cameraDrawable;

            AnonymousClass28(Drawable mutate2, Drawable mutate22) {
                super(mutate22);
                r2 = mutate22;
            }

            @Override
            public void draw(Canvas canvas, CharSequence charSequence, int i2, int i22, float f, int i3, int i4, int i5, Paint paint) {
                canvas.save();
                canvas.translate(0.0f, ((i5 - i3) / 2) + AndroidUtilities.dp(1.0f));
                r2.setAlpha(paint.getAlpha());
                super.draw(canvas, charSequence, i2, i22, f, i3, i4, i5, paint);
                canvas.restore();
            }

            @Override
            public int getSize(Paint paint, CharSequence charSequence, int i2, int i22, Paint.FontMetricsInt fontMetricsInt) {
                return (super.getSize(paint, charSequence, i2, i22, fontMetricsInt) / 3) * 2;
            }
        }, 0, 1, 33);
        return spannableString;
    }

    public void checkBackgroundVisibility() {
        boolean z = this.dismissProgress != 0.0f || this.openProgress < 1.0f || this.forceBackgroundVisible;
        if (z == this.isBackgroundVisible) {
            return;
        }
        Activity activity = this.activity;
        if (activity instanceof LaunchActivity) {
            ((LaunchActivity) activity).drawerLayoutContainer.setAllowDrawContent(z);
        }
        this.isBackgroundVisible = z;
    }

    public void checkFrontfaceFlashModes() {
        if (this.frontfaceFlashMode < 0) {
            this.frontfaceFlashMode = MessagesController.getGlobalMainSettings().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.frontfaceFlashModes = arrayList;
            arrayList.add("off");
            this.frontfaceFlashModes.add("auto");
            this.frontfaceFlashModes.add("on");
            this.flashViews.setWarmth(MessagesController.getGlobalMainSettings().getFloat("frontflash_warmth", 0.9f));
            this.flashViews.setIntensity(MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f));
        }
    }

    public void checkIsDark() {
        DualCameraView dualCameraView = this.cameraView;
        if (dualCameraView == null || dualCameraView.getTextureView() == null) {
            this.isDark = false;
            return;
        }
        Bitmap bitmap = this.cameraView.getTextureView().getBitmap();
        if (bitmap == null) {
            this.isDark = false;
            return;
        }
        int width = bitmap.getWidth() / 12;
        int height = bitmap.getHeight() / 12;
        float f = 0.0f;
        for (int i = 0; i < 10; i++) {
            int i2 = 0;
            while (i2 < 10) {
                i2++;
                f += AndroidUtilities.computePerceivedBrightness(bitmap.getPixel((i + 1) * width, i2 * height));
            }
        }
        float f2 = f / 100.0f;
        bitmap.recycle();
        this.isDark = f2 < 0.22f;
    }

    public void createCameraView() {
        if (this.cameraView != null || getContext() == null) {
            return;
        }
        this.cameraView = new AnonymousClass24(getContext(), getCameraFace(), false);
        RecordControl recordControl = this.recordControl;
        if (recordControl != null) {
            recordControl.setAmplitude(0.0f, false);
        }
        DualCameraView dualCameraView = this.cameraView;
        dualCameraView.isStory = true;
        dualCameraView.setThumbDrawable(getCameraThumb());
        this.cameraView.initTexture();
        this.cameraView.setDelegate(new CameraView.CameraViewDelegate() {
            @Override
            public final void onCameraInit() {
                StoryRecorder.this.lambda$createCameraView$62();
            }
        });
        this.dualButton.setVisibility((this.cameraView.dualAvailable() && this.currentPage == 0) ? 0 : 8);
        this.flashButton.setTranslationX(this.cameraView.dualAvailable() ? -AndroidUtilities.dp(46.0f) : 0.0f);
        this.previewContainer.addView(this.cameraView, LayoutHelper.createFrame(-1, -1, 119));
        if (MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) < 1) {
            this.cameraHint.show();
            MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) + 1).apply();
        } else {
            if (this.cameraView.isSavedDual() || !this.cameraView.dualAvailable() || MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) >= 2) {
                return;
            }
            this.dualHint.show();
        }
    }

    public void createFilterPhotoView() {
        StoryEntry storyEntry;
        Bitmap bitmap;
        Bitmap scaledBitmap;
        if (this.photoFilterView != null || (storyEntry = this.outputEntry) == null) {
            return;
        }
        if (storyEntry.isVideo) {
            bitmap = null;
        } else {
            if (storyEntry.filterFile == null) {
                scaledBitmap = this.previewView.getPhotoBitmap();
            } else {
                StoryEntry.DecodeBitmap decodeBitmap = new StoryEntry.DecodeBitmap() {
                    @Override
                    public final Bitmap decode(BitmapFactory.Options options) {
                        Bitmap lambda$createFilterPhotoView$59;
                        lambda$createFilterPhotoView$59 = StoryRecorder.this.lambda$createFilterPhotoView$59(options);
                        return lambda$createFilterPhotoView$59;
                    }
                };
                Point point = AndroidUtilities.displaySize;
                scaledBitmap = StoryEntry.getScaledBitmap(decodeBitmap, point.x, point.y, true, true);
            }
            bitmap = scaledBitmap;
        }
        if (bitmap != null || this.outputEntry.isVideo) {
            Activity activity = this.activity;
            VideoEditTextureView textureView = this.previewView.getTextureView();
            int orientation = this.previewView.getOrientation();
            StoryEntry storyEntry2 = this.outputEntry;
            PhotoFilterView photoFilterView = new PhotoFilterView(activity, textureView, bitmap, orientation, storyEntry2 != null ? storyEntry2.filterState : null, null, 0, false, false, this.blurManager, this.resourcesProvider);
            this.photoFilterView = photoFilterView;
            this.containerView.addView(photoFilterView);
            PhotoFilterView.EnhanceView enhanceView = this.photoFilterEnhanceView;
            if (enhanceView != null) {
                enhanceView.setFilterView(this.photoFilterView);
            }
            TextureView myTextureView = this.photoFilterView.getMyTextureView();
            this.photoFilterViewTextureView = myTextureView;
            if (myTextureView != null) {
                myTextureView.setOpaque(false);
            }
            this.previewView.setFilterTextureView(this.photoFilterViewTextureView, this.photoFilterView);
            TextureView textureView2 = this.photoFilterViewTextureView;
            if (textureView2 != null) {
                textureView2.setAlpha(0.0f);
                this.photoFilterViewTextureView.animate().alpha(1.0f).setDuration(220L).start();
            }
            applyFilterMatrix();
            PhotoFilterBlurControl blurControl = this.photoFilterView.getBlurControl();
            this.photoFilterViewBlurControl = blurControl;
            if (blurControl != null) {
                this.previewContainer.addView(blurControl);
            }
            PhotoFilterCurvesControl curveControl = this.photoFilterView.getCurveControl();
            this.photoFilterViewCurvesControl = curveControl;
            if (curveControl != null) {
                this.previewContainer.addView(curveControl);
            }
            orderPreviewViews();
            this.photoFilterView.getDoneTextView().setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    StoryRecorder.this.lambda$createFilterPhotoView$60(view);
                }
            });
            this.photoFilterView.getCancelTextView().setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    StoryRecorder.this.lambda$createFilterPhotoView$61(view);
                }
            });
            this.photoFilterView.getToolsView().setVisibility(8);
            this.photoFilterView.getToolsView().setAlpha(0.0f);
            this.photoFilterView.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
            this.photoFilterView.init();
        }
    }

    public void createGalleryListView() {
        createGalleryListView(false);
    }

    public void createGalleryListView(final boolean z) {
        if (this.galleryListView != null || getContext() == null) {
            return;
        }
        AnonymousClass19 anonymousClass19 = new AnonymousClass19(this.currentAccount, getContext(), this.resourcesProvider, this.lastGallerySelectedAlbum, z);
        this.galleryListView = anonymousClass19;
        anonymousClass19.allowSearch(false);
        this.galleryListView.setOnBackClickListener(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.lambda$createGalleryListView$46();
            }
        });
        this.galleryListView.setOnSelectListener(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                StoryRecorder.this.lambda$createGalleryListView$47(z, obj, (Bitmap) obj2);
            }
        });
        Parcelable parcelable = this.lastGalleryScrollPosition;
        if (parcelable != null) {
            this.galleryListView.layoutManager.onRestoreInstanceState(parcelable);
        }
        this.windowView.addView(this.galleryListView, LayoutHelper.createFrame(-1, -1, 119));
    }

    public void createPhotoPaintView() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.StoryRecorder.createPhotoPaintView():void");
    }

    public void destroyCameraView(boolean z) {
        if (this.cameraView != null) {
            if (z) {
                saveLastCameraBitmap(new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.this.lambda$destroyCameraView$66();
                    }
                });
                return;
            }
            saveLastCameraBitmap(new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.this.lambda$destroyCameraView$67();
                }
            });
            this.cameraView.destroy(true, null);
            this.previewContainer.removeView(this.cameraView);
            this.cameraView = null;
        }
    }

    public void destroyGalleryListView() {
        GalleryListView galleryListView = this.galleryListView;
        if (galleryListView == null) {
            return;
        }
        this.windowView.removeView(galleryListView);
        this.galleryListView = null;
        ValueAnimator valueAnimator = this.galleryOpenCloseAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.galleryOpenCloseAnimator = null;
        }
        SpringAnimation springAnimation = this.galleryOpenCloseSpringAnimator;
        if (springAnimation != null) {
            springAnimation.cancel();
            this.galleryOpenCloseSpringAnimator = null;
        }
        this.galleryListViewOpening = null;
    }

    public static void destroyInstance() {
        StoryRecorder storyRecorder = instance;
        if (storyRecorder != null) {
            storyRecorder.close(false);
        }
        instance = null;
    }

    private void destroyPhotoFilterView() {
        PhotoFilterView photoFilterView = this.photoFilterView;
        if (photoFilterView == null) {
            return;
        }
        photoFilterView.shutdown();
        this.photoFilterEnhanceView.setFilterView(null);
        this.containerView.removeView(this.photoFilterView);
        TextureView textureView = this.photoFilterViewTextureView;
        if (textureView != null) {
            this.previewContainer.removeView(textureView);
            this.photoFilterViewTextureView = null;
        }
        this.previewView.setFilterTextureView(null, null);
        PhotoFilterBlurControl photoFilterBlurControl = this.photoFilterViewBlurControl;
        if (photoFilterBlurControl != null) {
            this.previewContainer.removeView(photoFilterBlurControl);
            this.photoFilterViewBlurControl = null;
        }
        PhotoFilterCurvesControl photoFilterCurvesControl = this.photoFilterViewCurvesControl;
        if (photoFilterCurvesControl != null) {
            this.previewContainer.removeView(photoFilterCurvesControl);
            this.photoFilterViewCurvesControl = null;
        }
        this.photoFilterView = null;
    }

    private void destroyPhotoPaintView() {
        PaintView paintView = this.paintView;
        if (paintView == null) {
            return;
        }
        paintView.onCleanupEntities();
        this.paintView.shutdown();
        this.containerView.removeView(this.paintView);
        this.paintView = null;
        RenderView renderView = this.paintViewRenderView;
        if (renderView != null) {
            this.previewContainer.removeView(renderView);
            this.paintViewRenderView = null;
        }
        View view = this.paintViewTextDim;
        if (view != null) {
            this.previewContainer.removeView(view);
            this.paintViewTextDim = null;
        }
        View view2 = this.paintViewRenderInputView;
        if (view2 != null) {
            this.previewContainer.removeView(view2);
            this.paintViewRenderInputView = null;
        }
        View view3 = this.paintViewEntitiesView;
        if (view3 != null) {
            this.previewContainer.removeView(view3);
            this.paintViewEntitiesView = null;
        }
        View view4 = this.paintViewSelectionContainerView;
        if (view4 != null) {
            this.previewContainer.removeView(view4);
            this.paintViewSelectionContainerView = null;
        }
    }

    private boolean getCameraFace() {
        return MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false);
    }

    public Drawable getCameraThumb() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        return bitmap != null ? new BitmapDrawable(bitmap) : getContext().getResources().getDrawable(R.drawable.icplaceholder);
    }

    public String getCurrentFlashMode() {
        DualCameraView dualCameraView = this.cameraView;
        if (dualCameraView == null || dualCameraView.getCameraSession() == null) {
            return null;
        }
        if (!this.cameraView.isFrontface() || this.cameraView.getCameraSession().hasFlashModes()) {
            return this.cameraView.getCameraSession().getCurrentFlashMode();
        }
        checkFrontfaceFlashModes();
        return (String) this.frontfaceFlashModes.get(this.frontfaceFlashMode);
    }

    private DraftSavedHint getDraftSavedHint() {
        if (this.draftSavedHint == null) {
            DraftSavedHint draftSavedHint = new DraftSavedHint(getContext());
            this.draftSavedHint = draftSavedHint;
            this.controlContainer.addView(draftSavedHint, LayoutHelper.createFrame(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.draftSavedHint;
    }

    public static StoryRecorder getInstance(Activity activity, int i) {
        StoryRecorder storyRecorder = instance;
        if (storyRecorder != null && (storyRecorder.activity != activity || storyRecorder.currentAccount != i)) {
            storyRecorder.close(false);
            instance = null;
        }
        if (instance == null) {
            instance = new StoryRecorder(activity, i);
        }
        return instance;
    }

    private String getNextFlashMode() {
        DualCameraView dualCameraView = this.cameraView;
        if (dualCameraView == null || dualCameraView.getCameraSession() == null) {
            return null;
        }
        if (!this.cameraView.isFrontface() || this.cameraView.getCameraSession().hasFlashModes()) {
            return this.cameraView.getCameraSession().getNextFlashMode();
        }
        checkFrontfaceFlashModes();
        ArrayList arrayList = this.frontfaceFlashModes;
        return (String) arrayList.get(this.frontfaceFlashMode + 1 >= arrayList.size() ? 0 : this.frontfaceFlashMode + 1);
    }

    public Bitmap getUiBlurBitmap() {
        PreviewView previewView;
        PhotoFilterView photoFilterView = this.photoFilterView;
        Bitmap uiBlurBitmap = photoFilterView != null ? photoFilterView.getUiBlurBitmap() : null;
        return (uiBlurBitmap != null || (previewView = this.previewView) == null || previewView.getTextureView() == null) ? uiBlurBitmap : this.previewView.getTextureView().getUiBlurBitmap();
    }

    private ArrayList getUsersFrom(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        if (charSequence instanceof Spanned) {
            for (URLSpanUserMention uRLSpanUserMention : (URLSpanUserMention[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), URLSpanUserMention.class)) {
                if (uRLSpanUserMention != null) {
                    try {
                        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(Long.parseLong(uRLSpanUserMention.getURL())));
                        if (user != null && !UserObject.isUserSelf(user) && UserObject.getPublicUsername(user) != null && !arrayList.contains(user)) {
                            arrayList.add(UserObject.getPublicUsername(user));
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (charSequence != null) {
            int i = -1;
            for (int i2 = 0; i2 < charSequence.length(); i2++) {
                char charAt = charSequence.charAt(i2);
                if (charAt == '@') {
                    i = i2 + 1;
                } else if (charAt == ' ') {
                    if (i != -1) {
                        String charSequence2 = charSequence.subSequence(i, i2).toString();
                        TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(charSequence2);
                        if (userOrChat instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) userOrChat;
                            if (!user2.bot && !UserObject.isUserSelf(user2) && user2.id != 777000 && !UserObject.isReplyUser(user2) && !arrayList.contains(charSequence2)) {
                                arrayList.add(charSequence2);
                            }
                        }
                    }
                    i = -1;
                }
            }
            if (i != -1) {
                String charSequence3 = charSequence.subSequence(i, charSequence.length()).toString();
                TLObject userOrChat2 = MessagesController.getInstance(this.currentAccount).getUserOrChat(charSequence3);
                if (userOrChat2 instanceof TLRPC.User) {
                    TLRPC.User user3 = (TLRPC.User) userOrChat2;
                    if (!user3.bot && !UserObject.isUserSelf(user3) && user3.id != 777000 && !UserObject.isReplyUser(user3) && !arrayList.contains(charSequence3)) {
                        arrayList.add(charSequence3);
                    }
                }
            }
        }
        return arrayList;
    }

    private void hidePhotoPaintView() {
        PaintView paintView = this.paintView;
        if (paintView == null) {
            return;
        }
        this.previewTouchable = null;
        paintView.getTopLayout().setAlpha(0.0f);
        this.paintView.getTopLayout().setTranslationY(-AndroidUtilities.dp(16.0f));
        this.paintView.getBottomLayout().setAlpha(0.0f);
        this.paintView.getBottomLayout().setTranslationY(AndroidUtilities.dp(48.0f));
        this.paintView.getWeightChooserView().setTranslationX(-AndroidUtilities.dp(32.0f));
        this.paintView.setVisibility(8);
        this.paintView.keyboardNotifier.ignore(true);
    }

    private void initViews() {
        Context context = getContext();
        WindowView windowView = new WindowView(context);
        this.windowView = windowView;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            windowView.setFitsSystemWindows(true);
            this.windowView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                AnonymousClass2() {
                }

                @Override
                public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    int stableInsetTop;
                    int stableInsetBottom;
                    int stableInsetLeft;
                    int stableInsetRight;
                    WindowInsets consumeSystemWindowInsets;
                    WindowInsets windowInsets2;
                    Insets insets;
                    int i2;
                    int i22;
                    int i3;
                    int i4;
                    int i5 = Build.VERSION.SDK_INT;
                    if (i5 >= 30) {
                        insets = windowInsets.getInsets(WindowInsetsCompat.Type.displayCutout() | WindowInsetsCompat.Type.systemBars());
                        StoryRecorder storyRecorder = StoryRecorder.this;
                        i2 = insets.top;
                        storyRecorder.insetTop = i2;
                        StoryRecorder storyRecorder2 = StoryRecorder.this;
                        i22 = insets.bottom;
                        storyRecorder2.insetBottom = i22;
                        StoryRecorder storyRecorder3 = StoryRecorder.this;
                        i3 = insets.left;
                        storyRecorder3.insetLeft = i3;
                        StoryRecorder storyRecorder4 = StoryRecorder.this;
                        i4 = insets.right;
                        storyRecorder4.insetRight = i4;
                    } else {
                        StoryRecorder storyRecorder5 = StoryRecorder.this;
                        stableInsetTop = windowInsets.getStableInsetTop();
                        storyRecorder5.insetTop = stableInsetTop;
                        StoryRecorder storyRecorder6 = StoryRecorder.this;
                        stableInsetBottom = windowInsets.getStableInsetBottom();
                        storyRecorder6.insetBottom = stableInsetBottom;
                        StoryRecorder storyRecorder7 = StoryRecorder.this;
                        stableInsetLeft = windowInsets.getStableInsetLeft();
                        storyRecorder7.insetLeft = stableInsetLeft;
                        StoryRecorder storyRecorder8 = StoryRecorder.this;
                        stableInsetRight = windowInsets.getStableInsetRight();
                        storyRecorder8.insetRight = stableInsetRight;
                    }
                    StoryRecorder.this.windowView.requestLayout();
                    if (i5 >= 30) {
                        windowInsets2 = WindowInsets.CONSUMED;
                        return windowInsets2;
                    }
                    consumeSystemWindowInsets = windowInsets.consumeSystemWindowInsets();
                    return consumeSystemWindowInsets;
                }
            });
        }
        this.windowView.setFocusable(true);
        FlashViews flashViews = new FlashViews(context, this.windowManager, this.windowView, this.windowLayoutParams);
        this.flashViews = flashViews;
        flashViews.add(new FlashViews.Invertable() {
            AnonymousClass3() {
            }

            @Override
            public void invalidate() {
            }

            @Override
            public void setInvert(float f) {
                AndroidUtilities.setLightNavigationBar(StoryRecorder.this.windowView, f > 0.5f);
                AndroidUtilities.setLightStatusBar(StoryRecorder.this.windowView, f > 0.5f);
            }
        });
        this.windowView.addView(this.flashViews.backgroundView, new ViewGroup.LayoutParams(-1, -1));
        WindowView windowView2 = this.windowView;
        ContainerView containerView = new ContainerView(context);
        this.containerView = containerView;
        windowView2.addView(containerView);
        ContainerView containerView2 = this.containerView;
        AnonymousClass4 anonymousClass4 = new FrameLayout(context) {
            private final Rect leftExclRect = new Rect();
            private final Rect rightExclRect = new Rect();

            AnonymousClass4(Context context2) {
                super(context2);
                this.leftExclRect = new Rect();
                this.rightExclRect = new Rect();
            }

            @Override
            public void invalidate() {
                if (StoryRecorder.this.openCloseAnimator == null || !StoryRecorder.this.openCloseAnimator.isRunning()) {
                    super.invalidate();
                }
            }

            @Override
            protected void onLayout(boolean z, int i2, int i22, int i3, int i4) {
                super.onLayout(z, i2, i22, i3, i4);
                if (Build.VERSION.SDK_INT >= 29) {
                    int i5 = i3 - i2;
                    int i6 = i4 - i22;
                    this.leftExclRect.set(0, i6 - AndroidUtilities.dp(120.0f), AndroidUtilities.dp(40.0f), i6);
                    this.rightExclRect.set(i5 - AndroidUtilities.dp(40.0f), i6 - AndroidUtilities.dp(120.0f), i5, i6);
                    setSystemGestureExclusionRects(Arrays.asList(this.leftExclRect, this.rightExclRect));
                }
            }

            @Override
            protected void onMeasure(int i2, int i22) {
                super.onMeasure(i2, i22);
                if (StoryRecorder.this.photoFilterViewCurvesControl != null) {
                    StoryRecorder.this.photoFilterViewCurvesControl.setActualArea(0.0f, 0.0f, StoryRecorder.this.photoFilterViewCurvesControl.getMeasuredWidth(), StoryRecorder.this.photoFilterViewCurvesControl.getMeasuredHeight());
                }
                if (StoryRecorder.this.photoFilterViewBlurControl != null) {
                    StoryRecorder.this.photoFilterViewBlurControl.setActualAreaSize(StoryRecorder.this.photoFilterViewBlurControl.getMeasuredWidth(), StoryRecorder.this.photoFilterViewBlurControl.getMeasuredHeight());
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (StoryRecorder.this.previewTouchable == null) {
                    return super.onTouchEvent(motionEvent);
                }
                StoryRecorder.this.previewTouchable.onTouch(motionEvent);
                return true;
            }
        };
        this.previewContainer = anonymousClass4;
        containerView2.addView(anonymousClass4);
        this.containerView.addView(this.flashViews.foregroundView, new ViewGroup.LayoutParams(-1, -1));
        this.blurManager = new BlurringShader.BlurManager(this.previewContainer);
        this.videoTextureHolder = new PreviewView.TextureViewHolder();
        ContainerView containerView3 = this.containerView;
        FrameLayout frameLayout = new FrameLayout(context2);
        this.actionBarContainer = frameLayout;
        containerView3.addView(frameLayout);
        ContainerView containerView4 = this.containerView;
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.controlContainer = frameLayout2;
        containerView4.addView(frameLayout2);
        ContainerView containerView5 = this.containerView;
        AnonymousClass5 anonymousClass5 = new FrameLayout(context2) {
            AnonymousClass5(Context context2) {
                super(context2);
            }

            @Override
            public void setTranslationY(float f) {
                if (getTranslationY() == f || StoryRecorder.this.captionEdit == null) {
                    return;
                }
                super.setTranslationY(f);
                StoryRecorder.this.captionEdit.updateMentionsLayoutPosition();
            }
        };
        this.captionContainer = anonymousClass5;
        containerView5.addView(anonymousClass5);
        this.captionContainer.setVisibility(8);
        this.captionContainer.setAlpha(0.0f);
        ContainerView containerView6 = this.containerView;
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.navbarContainer = frameLayout3;
        containerView6.addView(frameLayout3);
        Bulletin.addDelegate(this.windowView, new Bulletin.Delegate() {
            AnonymousClass6() {
            }

            @Override
            public boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public boolean clipWithGradient(int i2) {
                return true;
            }

            @Override
            public int getBottomOffset(int i2) {
                return Bulletin.Delegate.CC.$default$getBottomOffset(this, i2);
            }

            @Override
            public int getTopOffset(int i2) {
                return AndroidUtilities.dp(56.0f);
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
        });
        ImageView imageView = new ImageView(context2);
        this.cameraViewThumb = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.cameraViewThumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StoryRecorder.this.lambda$initViews$5(view);
            }
        });
        this.cameraViewThumb.setClickable(true);
        this.previewContainer.addView(this.cameraViewThumb, LayoutHelper.createFrame(-1, -1, 119));
        FrameLayout frameLayout4 = this.previewContainer;
        int i2 = this.openType;
        frameLayout4.setBackgroundColor((i2 == 1 || i2 == 0) ? 0 : -14737633);
        if (i >= 21) {
            this.previewContainer.setOutlineProvider(new ViewOutlineProvider() {
                AnonymousClass7() {
                }

                @Override
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(12.0f));
                }
            });
            this.previewContainer.setClipToOutline(true);
        }
        this.photoFilterEnhanceView = new PhotoFilterView.EnhanceView(context2, new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.createFilterPhotoView();
            }
        });
        AnonymousClass8 anonymousClass8 = new PreviewView(context2, this.blurManager, this.videoTextureHolder) {
            AnonymousClass8(Context context2, BlurringShader.BlurManager blurManager, PreviewView.TextureViewHolder textureViewHolder) {
                super(context2, blurManager, textureViewHolder);
            }

            @Override
            public boolean additionalTouchEvent(MotionEvent motionEvent) {
                if (StoryRecorder.this.captionEdit == null || !StoryRecorder.this.captionEdit.isRecording()) {
                    return StoryRecorder.this.photoFilterEnhanceView.onTouch(motionEvent);
                }
                return false;
            }

            @Override
            public void applyMatrix() {
                super.applyMatrix();
                StoryRecorder.this.applyFilterMatrix();
            }

            @Override
            protected void invalidateTextureViewHolder() {
                if (StoryRecorder.this.outputEntry == null || !StoryRecorder.this.outputEntry.isRepostMessage || !StoryRecorder.this.outputEntry.isVideo || StoryRecorder.this.paintView == null || StoryRecorder.this.paintView.entitiesView == null) {
                    return;
                }
                for (int i3 = 0; i3 < StoryRecorder.this.paintView.entitiesView.getChildCount(); i3++) {
                    View childAt = StoryRecorder.this.paintView.entitiesView.getChildAt(i3);
                    if (childAt instanceof MessageEntityView) {
                        ((MessageEntityView) childAt).invalidateAll();
                    }
                }
            }

            @Override
            public void onAudioChanged() {
                if (StoryRecorder.this.paintView != null) {
                    StoryRecorder.this.paintView.setHasAudio((StoryRecorder.this.outputEntry == null || StoryRecorder.this.outputEntry.audioPath == null) ? false : true);
                }
            }

            @Override
            public void onEntityDraggedBottom(boolean z) {
                StoryRecorder.this.previewHighlight.updateCaption(StoryRecorder.this.captionEdit.getText());
            }

            @Override
            public void onEntityDraggedTop(boolean z) {
                StoryRecorder.this.previewHighlight.show(true, z, StoryRecorder.this.actionBarContainer);
            }

            @Override
            public void onRoundRemove() {
                if (StoryRecorder.this.previewView != null) {
                    StoryRecorder.this.previewView.setupRound(null, null, true);
                }
                if (StoryRecorder.this.paintView != null) {
                    StoryRecorder.this.paintView.deleteRound();
                }
                if (StoryRecorder.this.captionEdit != null) {
                    StoryRecorder.this.captionEdit.setHasRoundVideo(false);
                }
                if (StoryRecorder.this.outputEntry != null) {
                    if (StoryRecorder.this.outputEntry.round != null) {
                        try {
                            StoryRecorder.this.outputEntry.round.delete();
                        } catch (Exception unused) {
                        }
                        StoryRecorder.this.outputEntry.round = null;
                    }
                    if (StoryRecorder.this.outputEntry.roundThumb != null) {
                        try {
                            new File(StoryRecorder.this.outputEntry.roundThumb).delete();
                        } catch (Exception unused2) {
                        }
                        StoryRecorder.this.outputEntry.roundThumb = null;
                    }
                }
            }

            @Override
            public void onRoundSelectChange(boolean z) {
                PaintView paintView;
                RoundView findRoundView;
                if (StoryRecorder.this.paintView == null) {
                    return;
                }
                if (!z && (StoryRecorder.this.paintView.getSelectedEntity() instanceof RoundView)) {
                    paintView = StoryRecorder.this.paintView;
                    findRoundView = null;
                } else {
                    if (!z || (StoryRecorder.this.paintView.getSelectedEntity() instanceof RoundView) || StoryRecorder.this.paintView.findRoundView() == null) {
                        return;
                    }
                    paintView = StoryRecorder.this.paintView;
                    findRoundView = StoryRecorder.this.paintView.findRoundView();
                }
                paintView.lambda$createRound$61(findRoundView);
            }
        };
        this.previewView = anonymousClass8;
        anonymousClass8.invalidateBlur = new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.invalidateBlur();
            }
        };
        this.previewView.setOnTapListener(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.lambda$initViews$6();
            }
        });
        this.previewView.setVisibility(8);
        this.previewView.whenError(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.lambda$initViews$7();
            }
        });
        this.previewContainer.addView(this.previewView, LayoutHelper.createFrame(-1, -1, 119));
        this.previewContainer.addView(this.photoFilterEnhanceView, LayoutHelper.createFrame(-1, -1, 119));
        WindowView windowView3 = this.windowView;
        AnonymousClass9 anonymousClass9 = new AnonymousClass9(context2, windowView3, windowView3, this.containerView, this.resourcesProvider, this.blurManager);
        this.captionEdit = anonymousClass9;
        anonymousClass9.setAccount(this.currentAccount);
        this.captionEdit.setUiBlurBitmap(new Utilities.CallbackVoidReturn() {
            @Override
            public final Object run() {
                Bitmap uiBlurBitmap;
                uiBlurBitmap = StoryRecorder.this.getUiBlurBitmap();
                return uiBlurBitmap;
            }
        });
        Bulletin.addDelegate(this.captionContainer, new Bulletin.Delegate() {
            AnonymousClass10() {
            }

            @Override
            public boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public boolean clipWithGradient(int i3) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i3);
            }

            @Override
            public int getBottomOffset(int i3) {
                return StoryRecorder.this.captionEdit.getEditTextHeight() + AndroidUtilities.dp(12.0f);
            }

            @Override
            public int getTopOffset(int i3) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i3);
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
        });
        this.captionEdit.setOnHeightUpdate(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.this.lambda$initViews$8((Integer) obj);
            }
        });
        this.captionEdit.setOnPeriodUpdate(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.this.lambda$initViews$9((Integer) obj);
            }
        });
        this.captionEdit.setOnPremiumHint(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.this.showPremiumPeriodBulletin(((Integer) obj).intValue());
            }
        });
        this.captionEdit.setOnKeyboardOpen(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.this.lambda$initViews$10((Boolean) obj);
            }
        });
        AnonymousClass11 anonymousClass11 = new View(context2) {
            AnonymousClass11(Context context2) {
                super(context2);
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                canvas.save();
                canvas.translate(StoryRecorder.this.captionContainer.getX() + StoryRecorder.this.captionEdit.getX(), StoryRecorder.this.captionContainer.getY() + StoryRecorder.this.captionEdit.getY());
                StoryRecorder.this.captionEdit.drawOver2(canvas, StoryRecorder.this.captionEdit.getBounds(), StoryRecorder.this.captionEdit.getOver2Alpha());
                canvas.restore();
            }
        };
        this.captionEditOverlay = anonymousClass11;
        this.containerView.addView(anonymousClass11);
        TimelineView timelineView = new TimelineView(context2, this.containerView, this.previewContainer, this.resourcesProvider, this.blurManager);
        this.timelineView = timelineView;
        this.previewView.setVideoTimelineView(timelineView);
        this.timelineView.setVisibility(8);
        this.timelineView.setAlpha(0.0f);
        FrameLayout frameLayout5 = new FrameLayout(context2);
        this.videoTimelineContainerView = frameLayout5;
        frameLayout5.addView(this.timelineView, LayoutHelper.createFrame(-1, TimelineView.heightDp(), 87, 0.0f, 0.0f, 0.0f, 0.0f));
        VideoTimeView videoTimeView = new VideoTimeView(context2);
        this.videoTimeView = videoTimeView;
        videoTimeView.setVisibility(8);
        this.videoTimeView.show(false, false);
        this.videoTimelineContainerView.addView(this.videoTimeView, LayoutHelper.createFrame(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.captionContainer.addView(this.videoTimelineContainerView, LayoutHelper.createFrame(-1, TimelineView.heightDp() + 25, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.captionContainer.addView(this.captionEdit, LayoutHelper.createFrame(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        TimelineView timelineView2 = new TimelineView(context2, this.containerView, this.previewContainer, this.resourcesProvider, this.blurManager);
        this.coverTimelineView = timelineView2;
        timelineView2.setCover();
        this.coverTimelineView.setVisibility(8);
        this.coverTimelineView.setAlpha(0.0f);
        this.captionContainer.addView(this.coverTimelineView, LayoutHelper.createFrame(-1, TimelineView.heightDp(), 87, 0.0f, 0.0f, 0.0f, 6.0f));
        FlashViews.ImageViewInvertable imageViewInvertable = new FlashViews.ImageViewInvertable(context2);
        this.backButton = imageViewInvertable;
        imageViewInvertable.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        FlashViews.ImageViewInvertable imageViewInvertable2 = this.backButton;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageViewInvertable2.setScaleType(scaleType);
        this.backButton.setImageResource(R.drawable.msg_photo_back);
        FlashViews.ImageViewInvertable imageViewInvertable3 = this.backButton;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageViewInvertable3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.backButton.setBackground(Theme.createSelectorDrawable(553648127));
        this.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StoryRecorder.this.lambda$initViews$11(view);
            }
        });
        this.actionBarContainer.addView(this.backButton, LayoutHelper.createFrame(56, 56, 51));
        this.flashViews.add(this.backButton);
        SimpleTextView simpleTextView = new SimpleTextView(context2);
        this.titleTextView = simpleTextView;
        simpleTextView.setTextSize(20);
        this.titleTextView.setGravity(19);
        this.titleTextView.setTextColor(-1);
        this.titleTextView.setTypeface(AndroidUtilities.bold());
        this.titleTextView.setText(LocaleController.getString(R.string.RecorderNewStory));
        this.titleTextView.getPaint().setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, 1.0f, 1073741824);
        this.titleTextView.setAlpha(0.0f);
        this.titleTextView.setVisibility(8);
        this.titleTextView.setEllipsizeByGradient(true);
        this.titleTextView.setRightPadding(AndroidUtilities.dp(144.0f));
        this.actionBarContainer.addView(this.titleTextView, LayoutHelper.createFrame(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context2);
        this.actionBarButtons = linearLayout;
        linearLayout.setOrientation(0);
        this.actionBarButtons.setGravity(5);
        this.actionBarContainer.addView(this.actionBarButtons, LayoutHelper.createFrame(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        this.downloadButton = new DownloadButton(context2, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.this.lambda$initViews$12((Runnable) obj);
            }
        }, this.currentAccount, this.windowView, this.resourcesProvider);
        HintView2 animatedTextHacks = new HintView2(this.activity, 1).setJoint(1.0f, -71.0f).setDuration(2000L).setBounce(false).setAnimatedTextHacks(true, true, false);
        this.muteHint = animatedTextHacks;
        animatedTextHacks.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.actionBarContainer.addView(this.muteHint, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        RLottieImageView rLottieImageView = new RLottieImageView(context2);
        this.muteButton = rLottieImageView;
        rLottieImageView.setScaleType(scaleType);
        RLottieImageView rLottieImageView2 = this.muteButton;
        StoryEntry storyEntry = this.outputEntry;
        rLottieImageView2.setImageResource((storyEntry == null || !storyEntry.muted) ? R.drawable.media_mute : R.drawable.media_unmute);
        this.muteButton.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.muteButton.setBackground(Theme.createSelectorDrawable(553648127));
        this.muteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StoryRecorder.this.lambda$initViews$13(view);
            }
        });
        this.muteButton.setVisibility(8);
        this.muteButton.setAlpha(0.0f);
        PlayPauseButton playPauseButton = new PlayPauseButton(context2);
        this.playButton = playPauseButton;
        playPauseButton.setBackground(Theme.createSelectorDrawable(553648127));
        this.playButton.setVisibility(8);
        this.playButton.setAlpha(0.0f);
        this.playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StoryRecorder.this.lambda$initViews$14(view);
            }
        });
        this.actionBarButtons.addView(this.playButton, LayoutHelper.createLinear(46, 56, 53));
        this.actionBarButtons.addView(this.muteButton, LayoutHelper.createLinear(46, 56, 53));
        this.actionBarButtons.addView(this.downloadButton, LayoutHelper.createFrame(46, 56, 53));
        ToggleButton2 toggleButton2 = new ToggleButton2(context2);
        this.flashButton = toggleButton2;
        toggleButton2.setBackground(Theme.createSelectorDrawable(553648127));
        this.flashButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StoryRecorder.this.lambda$initViews$15(view);
            }
        });
        this.flashButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                boolean lambda$initViews$19;
                lambda$initViews$19 = StoryRecorder.this.lambda$initViews$19(view);
                return lambda$initViews$19;
            }
        });
        this.flashButton.setVisibility(8);
        this.flashButton.setAlpha(0.0f);
        this.flashViews.add(this.flashButton);
        this.actionBarContainer.addView(this.flashButton, LayoutHelper.createFrame(56, 56, 53));
        ToggleButton toggleButton = new ToggleButton(context2, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.dualButton = toggleButton;
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StoryRecorder.this.lambda$initViews$20(view);
            }
        });
        this.dualButton.setVisibility(DualCameraView.dualAvailableStatic(context2) ? 0 : 8);
        this.flashViews.add(this.dualButton);
        this.actionBarContainer.addView(this.dualButton, LayoutHelper.createFrame(56, 56, 53));
        HintView2 onHiddenListener = new HintView2(this.activity, 1).setJoint(1.0f, -20.0f).setDuration(5000L).setCloseButton(true).setText(LocaleController.getString(R.string.StoryCameraDualHint)).setOnHiddenListener(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.lambda$initViews$21();
            }
        });
        this.dualHint = onHiddenListener;
        onHiddenListener.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.actionBarContainer.addView(this.dualHint, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        HintView2 multilineText = new HintView2(this.activity, 2).setJoint(0.0f, 28.0f).setDuration(5000L).setMultilineText(true);
        this.savedDualHint = multilineText;
        this.actionBarContainer.addView(multilineText, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        this.videoTimerView = new VideoTimerView(context2);
        showVideoTimer(false, false);
        this.actionBarContainer.addView(this.videoTimerView, LayoutHelper.createFrame(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.flashViews.add(this.videoTimerView);
        if (i >= 21) {
            MediaController.loadGalleryPhotosAlbums(0);
        }
        RecordControl recordControl = new RecordControl(context2);
        this.recordControl = recordControl;
        recordControl.setDelegate(this.recordControlDelegate);
        this.recordControl.startAsVideo(this.isVideo);
        this.controlContainer.addView(this.recordControl, LayoutHelper.createFrame(-1, 100, 87));
        this.flashViews.add(this.recordControl);
        HintView2 textAlign = new HintView2(this.activity, 3).setMultilineText(true).setText(LocaleController.getString(R.string.StoryCameraHint2)).setMaxWidth(320.0f).setDuration(5000L).setTextAlign(Layout.Alignment.ALIGN_CENTER);
        this.cameraHint = textAlign;
        this.controlContainer.addView(textAlign, LayoutHelper.createFrame(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        ZoomControlView zoomControlView = new ZoomControlView(context2);
        this.zoomControlView = zoomControlView;
        zoomControlView.enabledTouch = false;
        zoomControlView.setAlpha(0.0f);
        this.controlContainer.addView(this.zoomControlView, LayoutHelper.createFrame(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.zoomControlView.setDelegate(new ZoomControlView.ZoomControlViewDelegate() {
            @Override
            public final void didSetZoom(float f) {
                StoryRecorder.this.lambda$initViews$22(f);
            }
        });
        ZoomControlView zoomControlView2 = this.zoomControlView;
        this.cameraZoom = 0.0f;
        zoomControlView2.setZoom(0.0f, false);
        PhotoVideoSwitcherView photoVideoSwitcherView = new PhotoVideoSwitcherView(context2);
        this.modeSwitcherView = photoVideoSwitcherView;
        photoVideoSwitcherView.setOnSwitchModeListener(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.this.lambda$initViews$23((Boolean) obj);
            }
        });
        this.modeSwitcherView.setOnSwitchingModeListener(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.this.lambda$initViews$24((Float) obj);
            }
        });
        this.navbarContainer.addView(this.modeSwitcherView, LayoutHelper.createFrame(-1, -1, 87));
        this.flashViews.add(this.modeSwitcherView);
        HintTextView hintTextView = new HintTextView(context2);
        this.hintTextView = hintTextView;
        this.navbarContainer.addView(hintTextView, LayoutHelper.createFrame(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.flashViews.add(this.hintTextView);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context2, this.resourcesProvider);
        this.coverButton = buttonWithCounterView;
        buttonWithCounterView.setVisibility(8);
        this.coverButton.setAlpha(0.0f);
        this.coverButton.setText(LocaleController.getString(R.string.StoryCoverSave), false);
        this.coverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StoryRecorder.this.lambda$initViews$27(view);
            }
        });
        this.navbarContainer.addView(this.coverButton, LayoutHelper.createFrame(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        PreviewButtons previewButtons = new PreviewButtons(context2);
        this.previewButtons = previewButtons;
        previewButtons.setVisibility(8);
        this.previewButtons.setOnClickListener(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.this.lambda$initViews$28((Integer) obj);
            }
        });
        this.navbarContainer.addView(this.previewButtons, LayoutHelper.createFrame(-1, 52, 23));
        TrashView trashView = new TrashView(context2);
        this.trash = trashView;
        trashView.setAlpha(0.0f);
        this.trash.setVisibility(8);
        this.previewContainer.addView(this.trash, LayoutHelper.createFrame(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        PreviewHighlightView previewHighlightView = new PreviewHighlightView(context2, this.currentAccount, this.resourcesProvider);
        this.previewHighlight = previewHighlightView;
        this.previewContainer.addView(previewHighlightView, LayoutHelper.createFrame(-1, -1, 119));
    }

    private boolean isBot() {
        StoryEntry storyEntry = this.outputEntry;
        return ((storyEntry == null || storyEntry.botId == 0) && this.botId == 0) ? false : true;
    }

    public boolean isGalleryOpen() {
        GalleryListView galleryListView;
        return (this.scrollingY || (galleryListView = this.galleryListView) == null || galleryListView.getTranslationY() >= ((float) ((this.windowView.getMeasuredHeight() - ((int) (((float) AndroidUtilities.displaySize.y) * 0.35f))) - (AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight())))) ? false : true;
    }

    public static boolean isVisible() {
        StoryRecorder storyRecorder = instance;
        return storyRecorder != null && storyRecorder.isShown;
    }

    public void lambda$animateContainerBack$44(float f, float f2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.containerView.setTranslationY(f * floatValue);
        this.containerView.setTranslationY2(f2 * floatValue);
    }

    public void lambda$animateGalleryListView$49(float f, DynamicAnimation dynamicAnimation, boolean z, float f2, float f3) {
        if (z) {
            return;
        }
        this.galleryListView.setTranslationY(f);
        this.galleryListView.ignoreScroll = false;
        this.galleryOpenCloseSpringAnimator = null;
        this.galleryListViewOpening = null;
    }

    public void lambda$animateGalleryListView$50(ValueAnimator valueAnimator) {
        this.galleryListView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void lambda$animateOpenTo$3(ValueAnimator valueAnimator) {
        this.openProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        checkBackgroundVisibility();
        this.containerView.invalidate();
        this.windowView.invalidate();
    }

    public static void lambda$applyPaintInBackground$57(StoryEntry storyEntry, boolean z, ArrayList arrayList, File file, File file2, File file3, File file4, File file5, List list, Runnable runnable) {
        try {
            File file6 = storyEntry.paintFile;
            if (file6 != null) {
                file6.delete();
            }
        } catch (Exception unused) {
        }
        try {
            File file7 = storyEntry.paintEntitiesFile;
            if (file7 != null) {
                file7.delete();
            }
        } catch (Exception unused2) {
        }
        try {
            File file8 = storyEntry.paintBlurFile;
            if (file8 != null) {
                file8.delete();
            }
        } catch (Exception unused3) {
        }
        storyEntry.paintFile = null;
        storyEntry.paintEntitiesFile = null;
        storyEntry.paintBlurFile = null;
        File file9 = storyEntry.backgroundFile;
        if (file9 != null) {
            try {
                file9.delete();
            } catch (Exception e) {
                FileLog.e(e);
            }
            storyEntry.backgroundFile = null;
        }
        File file10 = storyEntry.messageVideoMaskFile;
        if (file10 != null) {
            try {
                file10.delete();
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            storyEntry.messageVideoMaskFile = null;
        }
        storyEntry.editedMedia = z | storyEntry.editedMedia;
        storyEntry.mediaEntities = arrayList;
        storyEntry.paintFile = file;
        storyEntry.backgroundFile = file2;
        storyEntry.paintEntitiesFile = file3;
        storyEntry.messageVideoMaskFile = file4;
        storyEntry.paintBlurFile = file5;
        storyEntry.stickers = list;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$applyPaintInBackground$58(org.telegram.ui.Stories.recorder.PaintView r36, int r37, int r38, final org.telegram.ui.Stories.recorder.StoryEntry r39, boolean r40, final boolean r41, final java.lang.Runnable r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.StoryRecorder.lambda$applyPaintInBackground$58(org.telegram.ui.Stories.recorder.PaintView, int, int, org.telegram.ui.Stories.recorder.StoryEntry, boolean, boolean, java.lang.Runnable):void");
    }

    public void lambda$close$2(boolean z) {
        this.onClosePrepareListener = null;
        this.prepareClosing = false;
        close(z);
    }

    public void lambda$createCameraView$62() {
        String currentFlashMode = getCurrentFlashMode();
        if (TextUtils.equals(currentFlashMode, getNextFlashMode())) {
            currentFlashMode = null;
        }
        setCameraFlashModeIcon(this.currentPage == 0 ? currentFlashMode : null, true);
        ZoomControlView zoomControlView = this.zoomControlView;
        if (zoomControlView != null) {
            this.cameraZoom = 0.0f;
            zoomControlView.setZoom(0.0f, false);
        }
    }

    public Bitmap lambda$createFilterPhotoView$59(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.outputEntry.file.getAbsolutePath(), options);
    }

    public void lambda$createFilterPhotoView$60(View view) {
        switchToEditMode(-1, true);
    }

    public void lambda$createFilterPhotoView$61(View view) {
        switchToEditMode(-1, true);
    }

    public void lambda$createGalleryListView$46() {
        lambda$animateGalleryListView$48(false);
        this.lastGallerySelectedAlbum = null;
    }

    public void lambda$createGalleryListView$47(boolean z, Object obj, Bitmap bitmap) {
        PaintView paintView;
        PhotoView createPhoto;
        if (obj == null || this.galleryListViewOpening != null || this.scrollingY || !isGalleryOpen()) {
            return;
        }
        if (!z) {
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                this.isVideo = photoEntry.isVideo;
                StoryEntry fromPhotoEntry = StoryEntry.fromPhotoEntry(photoEntry);
                this.outputEntry = fromPhotoEntry;
                StoryPrivacySelector.applySaved(this.currentAccount, fromPhotoEntry);
                this.outputEntry.blurredVideoThumb = bitmap;
                this.fromGallery = true;
            } else if (obj instanceof StoryEntry) {
                StoryEntry storyEntry = (StoryEntry) obj;
                if (storyEntry.file == null) {
                    this.downloadButton.showToast(R.raw.error, "Failed to load draft");
                    MessagesController.getInstance(this.currentAccount).getStoriesController().getDraftsController().delete(storyEntry);
                    return;
                } else {
                    this.isVideo = storyEntry.isVideo;
                    this.outputEntry = storyEntry;
                    storyEntry.blurredVideoThumb = bitmap;
                    this.fromGallery = false;
                }
            }
            StoryEntry storyEntry2 = this.outputEntry;
            if (storyEntry2 != null) {
                storyEntry2.botId = this.botId;
                storyEntry2.botLang = this.botLang;
                storyEntry2.setupMatrix();
            }
            showVideoTimer(false, true);
            this.modeSwitcherView.switchMode(this.isVideo);
            this.recordControl.startAsVideo(this.isVideo);
            lambda$animateGalleryListView$48(false);
            navigateTo(1, true);
        } else {
            if (this.outputEntry == null) {
                return;
            }
            createPhotoPaintView();
            this.outputEntry.editedMedia = true;
            if (obj instanceof MediaController.PhotoEntry) {
                paintView = this.paintView;
                createPhoto = paintView.createPhoto(((MediaController.PhotoEntry) obj).path, false);
            } else {
                if (obj instanceof TLObject) {
                    paintView = this.paintView;
                    createPhoto = paintView.createPhoto((TLObject) obj, false);
                }
                lambda$animateGalleryListView$48(false);
            }
            paintView.appearAnimation(createPhoto);
            lambda$animateGalleryListView$48(false);
        }
        GalleryListView galleryListView = this.galleryListView;
        if (galleryListView != null) {
            this.lastGalleryScrollPosition = galleryListView.layoutManager.onSaveInstanceState();
            this.lastGallerySelectedAlbum = this.galleryListView.getSelectedAlbum();
        }
    }

    public void lambda$createPhotoPaintView$55() {
        switchToEditMode(-1, true);
    }

    public void lambda$createPhotoPaintView$56() {
        switchToEditMode(-1, true);
    }

    public void lambda$destroyCameraView$66() {
        this.cameraViewThumb.setImageDrawable(getCameraThumb());
        DualCameraView dualCameraView = this.cameraView;
        if (dualCameraView != null) {
            dualCameraView.destroy(true, null);
            this.previewContainer.removeView(this.cameraView);
            this.cameraView = null;
        }
    }

    public void lambda$destroyCameraView$67() {
        this.cameraViewThumb.setImageDrawable(getCameraThumb());
    }

    public void lambda$getThanosEffect$75() {
        ThanosEffect thanosEffect = this.thanosEffect;
        if (thanosEffect != null) {
            this.thanosEffect = null;
            this.windowView.removeView(thanosEffect);
        }
    }

    public void lambda$getThemeButton$76(View view) {
        toggleTheme();
    }

    public void lambda$initViews$10(Boolean bool) {
        TimelineView timelineView;
        if (bool.booleanValue() && (timelineView = this.timelineView) != null) {
            timelineView.onBackPressed();
        }
        this.previewView.updatePauseReason(2, bool.booleanValue());
        this.videoTimelineContainerView.clearAnimation();
        this.videoTimelineContainerView.animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).setDuration(120L).start();
        Bulletin visibleBulletin = Bulletin.getVisibleBulletin();
        if (visibleBulletin == null || visibleBulletin.tag != 2) {
            return;
        }
        visibleBulletin.updatePosition();
    }

    public void lambda$initViews$11(View view) {
        if (this.awaitingPlayer) {
            return;
        }
        onBackPressed();
    }

    public void lambda$initViews$12(Runnable runnable) {
        applyPaint();
        applyPaintMessage();
        applyFilter(runnable);
    }

    public void lambda$initViews$13(View view) {
        StoryEntry storyEntry = this.outputEntry;
        if (storyEntry == null || this.awaitingPlayer) {
            return;
        }
        storyEntry.muted = !storyEntry.muted;
        boolean z = !TextUtils.isEmpty(storyEntry.audioPath);
        StoryEntry storyEntry2 = this.outputEntry;
        boolean z2 = storyEntry2.round != null;
        this.muteHint.setText(LocaleController.getString(storyEntry2.muted ? (z || z2) ? R.string.StoryOriginalSoundMuted : R.string.StorySoundMuted : (z || z2) ? R.string.StoryOriginalSoundNotMuted : R.string.StorySoundNotMuted), this.muteHint.shown());
        this.muteHint.show();
        setIconMuted(this.outputEntry.muted, true);
        this.previewView.checkVolumes();
    }

    public void lambda$initViews$14(View view) {
        boolean z = !this.previewView.isPlaying();
        this.previewView.play(z);
        this.playButton.drawable.setPause(z, true);
    }

    public void lambda$initViews$15(View view) {
        if (this.cameraView == null || this.awaitingPlayer) {
            return;
        }
        String currentFlashMode = getCurrentFlashMode();
        String nextFlashMode = getNextFlashMode();
        if (currentFlashMode == null || currentFlashMode.equals(nextFlashMode)) {
            return;
        }
        setCurrentFlashMode(nextFlashMode);
        setCameraFlashModeIcon(nextFlashMode, true);
    }

    public void lambda$initViews$16(Float f) {
        this.flashViews.setWarmth(f.floatValue());
    }

    public void lambda$initViews$17(Float f) {
        this.flashViews.setIntensity(f.floatValue());
    }

    public void lambda$initViews$18() {
        saveFrontFaceFlashMode();
        this.flashViews.previewEnd();
        this.flashButton.setSelected(false);
    }

    public boolean lambda$initViews$19(View view) {
        DualCameraView dualCameraView = this.cameraView;
        if (dualCameraView == null || !dualCameraView.isFrontface()) {
            return false;
        }
        checkFrontfaceFlashModes();
        this.flashButton.setSelected(true);
        this.flashViews.previewStart();
        ItemOptions.makeOptions(this.containerView, this.resourcesProvider, this.flashButton).addView(new SliderView(getContext(), 1).setValue(this.flashViews.warmth).setOnValueChange(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.this.lambda$initViews$16((Float) obj);
            }
        })).addSpaceGap().addView(new SliderView(getContext(), 2).setMinMax(0.65f, 1.0f).setValue(this.flashViews.intensity).setOnValueChange(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.this.lambda$initViews$17((Float) obj);
            }
        })).setOnDismiss(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.lambda$initViews$18();
            }
        }).setDimAlpha(0).setGravity(5).translate(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f)).setBackgroundColor(-1155851493).show();
        return true;
    }

    public void lambda$initViews$20(View view) {
        DualCameraView dualCameraView = this.cameraView;
        if (dualCameraView == null || this.currentPage != 0) {
            return;
        }
        dualCameraView.toggleDual();
        this.dualButton.setValue(this.cameraView.isDual());
        this.dualHint.hide();
        MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
        if (this.savedDualHint.shown()) {
            MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
        }
        this.savedDualHint.hide();
    }

    public static void lambda$initViews$21() {
        MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) + 1).apply();
    }

    public void lambda$initViews$22(float f) {
        DualCameraView dualCameraView = this.cameraView;
        if (dualCameraView != null) {
            this.cameraZoom = f;
            dualCameraView.setZoom(f);
        }
        showZoomControls(true, true);
    }

    public void lambda$initViews$23(Boolean bool) {
        if (this.takingPhoto || this.takingVideo) {
            return;
        }
        boolean booleanValue = bool.booleanValue();
        this.isVideo = booleanValue;
        showVideoTimer(booleanValue, true);
        this.modeSwitcherView.switchMode(this.isVideo);
        this.recordControl.startAsVideo(this.isVideo);
    }

    public void lambda$initViews$24(Float f) {
        this.recordControl.startAsVideoT(f.floatValue());
    }

    public void lambda$initViews$25(Bitmap bitmap) {
        StoryEntry storyEntry = this.outputEntry;
        if (storyEntry == null) {
            return;
        }
        AndroidUtilities.recycleBitmap(storyEntry.coverBitmap);
        this.outputEntry.coverBitmap = bitmap;
        StoryPrivacyBottomSheet storyPrivacyBottomSheet = this.privacySheet;
        if (storyPrivacyBottomSheet == null) {
            return;
        }
        storyPrivacyBottomSheet.setCover(bitmap);
    }

    public void lambda$initViews$26() {
        PreviewView previewView;
        if (!this.outputEntry.isEditingCover && this.privacySheet != null && (previewView = this.previewView) != null) {
            previewView.getCoverBitmap(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    StoryRecorder.this.lambda$initViews$25((Bitmap) obj);
                }
            }, this.previewView, this.paintViewRenderView, this.paintViewEntitiesView);
        }
        navigateTo(1, true);
    }

    public void lambda$initViews$27(View view) {
        StoryEntry storyEntry = this.outputEntry;
        if (storyEntry == null) {
            return;
        }
        storyEntry.coverSet = true;
        storyEntry.cover = this.coverValue;
        processDone();
        StoryEntry storyEntry2 = this.outputEntry;
        if (storyEntry2 == null || storyEntry2.isEditingCover) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.lambda$initViews$26();
            }
        }, 400L);
    }

    public void lambda$initViews$28(Integer num) {
        if (this.outputEntry == null || this.captionEdit.isRecording()) {
            return;
        }
        this.captionEdit.clearFocus();
        if (num.intValue() == 4) {
            processDone();
            return;
        }
        if (num.intValue() == 0) {
            switchToEditMode(0, true);
            PaintView paintView = this.paintView;
            if (paintView != null) {
                paintView.enteredThroughText = false;
                paintView.openPaint();
                return;
            }
            return;
        }
        if (num.intValue() == 1) {
            switchToEditMode(0, true);
            PaintView paintView2 = this.paintView;
            if (paintView2 != null) {
                paintView2.openText();
                this.paintView.enteredThroughText = true;
                return;
            }
            return;
        }
        if (num.intValue() != 2) {
            if (num.intValue() == 3) {
                switchToEditMode(1, true);
            }
        } else {
            createPhotoPaintView();
            hidePhotoPaintView();
            PaintView paintView3 = this.paintView;
            if (paintView3 != null) {
                paintView3.openStickers();
            }
        }
    }

    public void lambda$initViews$5(View view) {
        if (this.noCameraPermission) {
            requestCameraPermission(true);
        }
    }

    public void lambda$initViews$6() {
        if (this.currentEditMode == -1 && this.currentPage == 1) {
            CaptionStory captionStory = this.captionEdit;
            if (captionStory.keyboardShown || captionStory.isRecording() || this.timelineView.onBackPressed()) {
                return;
            }
            switchToEditMode(0, true);
            PaintView paintView = this.paintView;
            if (paintView != null) {
                paintView.openText();
                this.paintView.enteredThroughText = true;
            }
        }
    }

    public void lambda$initViews$7() {
        this.videoError = true;
        this.previewButtons.setShareEnabled(false);
        this.downloadButton.showFailedVideo();
    }

    public void lambda$initViews$8(Integer num) {
        FrameLayout frameLayout = this.videoTimelineContainerView;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(this.captionEdit.getEditTextHeight() + AndroidUtilities.dp(12.0f))) + AndroidUtilities.dp(64.0f));
        }
        Bulletin visibleBulletin = Bulletin.getVisibleBulletin();
        if (visibleBulletin == null || visibleBulletin.tag != 2) {
            return;
        }
        visibleBulletin.updatePosition();
    }

    public void lambda$initViews$9(Integer num) {
        StoryEntry storyEntry = this.outputEntry;
        if (storyEntry != null) {
            storyEntry.period = num.intValue();
            MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
        }
    }

    public void lambda$navigateToPreviewWithPlayerAwait$43(Runnable runnable) {
        lambda$animateGalleryListView$48(false);
        AndroidUtilities.cancelRunOnUIThread(this.afterPlayerAwait);
        this.afterPlayerAwait = null;
        this.awaitingPlayer = false;
        runnable.run();
    }

    public void lambda$onCloseDone$4() {
        WindowView windowView;
        if (this.windowManager == null || (windowView = this.windowView) == null || windowView.getParent() == null) {
            return;
        }
        this.windowManager.removeView(this.windowView);
    }

    public void lambda$onNavigateStart$51() {
        this.cameraViewThumb.setImageDrawable(getCameraThumb());
    }

    public void lambda$onNavigateStart$52() {
        BulletinFactory.of(this.windowView, this.resourcesProvider).createSimpleBulletin(R.raw.voip_invite, premiumText(LocaleController.getString(R.string.StoryPremiumFormatting))).show(true);
    }

    public void lambda$onNavigateStart$53(FilterGLThread filterGLThread) {
        StoryEntry storyEntry;
        MediaController.SavedFilterState savedFilterState;
        if (filterGLThread == null || (storyEntry = this.outputEntry) == null || (savedFilterState = storyEntry.filterState) == null) {
            return;
        }
        filterGLThread.setFilterGLThreadDelegate(FilterShaders.getFilterShadersDelegate(savedFilterState));
    }

    public void lambda$onNavigateStart$54(Boolean bool, Float f) {
        long duration = this.previewView.getDuration() < 100 ? this.outputEntry.duration : this.previewView.getDuration();
        float floatValue = f.floatValue() + ((f.floatValue() / 0.96f) * 0.04f);
        StoryEntry storyEntry = this.outputEntry;
        float f2 = storyEntry.right;
        float f3 = storyEntry.left;
        float f4 = (float) duration;
        long j = floatValue * (f2 - f3) * f4;
        PreviewView previewView = this.previewView;
        long j2 = (f3 * f4) + ((float) j);
        this.coverValue = j2;
        previewView.seekTo(j2, false);
        PaintView paintView = this.paintView;
        if (paintView != null) {
            paintView.setCoverTime(this.coverValue);
        }
        StoryEntry storyEntry2 = this.outputEntry;
        if (storyEntry2 == null || !storyEntry2.isEdit) {
            return;
        }
        storyEntry2.editedMedia = true;
    }

    public void lambda$onRequestPermissionsResultInternal$70(DialogInterface dialogInterface, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            this.activity.startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$onRequestPermissionsResultInternal$71(DialogInterface dialogInterface, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            this.activity.startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$onRequestPermissionsResultInternal$72(DialogInterface dialogInterface, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            this.activity.startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$onResumeInternal$69() {
        requestCameraPermission(false);
    }

    public void lambda$openEdit$0(boolean z) {
        animateOpenTo(1.0f, z, new StoryRecorder$$ExternalSyntheticLambda6(this));
        this.previewButtons.appear(true, true);
    }

    public void lambda$openForward$1(boolean z) {
        animateOpenTo(1.0f, z, new StoryRecorder$$ExternalSyntheticLambda6(this));
    }

    public void lambda$openPremium$74(DialogInterface dialogInterface) {
        PreviewView previewView = this.previewView;
        if (previewView != null) {
            previewView.updatePauseReason(4, false);
        }
    }

    public void lambda$processDone$29(StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy) {
        StoryEntry storyEntry = this.outputEntry;
        if (storyEntry != null) {
            storyEntry.privacy = storyPrivacy;
        }
    }

    public void lambda$processDone$30(TLRPC.InputPeer inputPeer) {
        StoryEntry storyEntry = this.outputEntry;
        if (storyEntry == null) {
            return;
        }
        if (inputPeer == null) {
            inputPeer = new TLRPC.TL_inputPeerSelf();
        }
        storyEntry.peer = inputPeer;
    }

    public void lambda$processDone$31(Runnable runnable) {
        runnable.run();
        upload(true);
    }

    public void lambda$processDone$32(StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, boolean z, boolean z2, TLRPC.InputPeer inputPeer, final Runnable runnable) {
        if (this.outputEntry == null) {
            return;
        }
        this.previewView.updatePauseReason(5, true);
        this.outputEntry.privacy = storyPrivacy;
        StoryPrivacySelector.save(this.currentAccount, storyPrivacy);
        StoryEntry storyEntry = this.outputEntry;
        storyEntry.pinned = z2;
        storyEntry.allowScreenshots = z;
        storyEntry.privacyRules.clear();
        this.outputEntry.privacyRules.addAll(storyPrivacy.rules);
        StoryEntry storyEntry2 = this.outputEntry;
        storyEntry2.editedPrivacy = true;
        storyEntry2.peer = inputPeer;
        applyFilter(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.lambda$processDone$31(runnable);
            }
        });
    }

    public void lambda$processDone$33(Bitmap bitmap) {
        StoryEntry storyEntry = this.outputEntry;
        if (storyEntry == null) {
            return;
        }
        Bitmap bitmap2 = storyEntry.coverBitmap;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        this.outputEntry.coverBitmap = bitmap;
        StoryPrivacyBottomSheet storyPrivacyBottomSheet = this.privacySheet;
        if (storyPrivacyBottomSheet == null) {
            return;
        }
        storyPrivacyBottomSheet.setCover(bitmap);
    }

    public void lambda$processDone$34() {
        StoryPrivacyBottomSheet storyPrivacyBottomSheet = this.privacySheet;
        if (storyPrivacyBottomSheet != null) {
            storyPrivacyBottomSheet.dismiss();
        }
        navigateTo(2, true);
    }

    public void lambda$processDone$35(DialogInterface dialogInterface) {
        this.previewView.updatePauseReason(3, false);
        this.privacySheet = null;
    }

    public void lambda$requestCameraPermission$68(DialogInterface dialogInterface, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            this.activity.startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$saveLastCameraBitmap$63(Bitmap bitmap, Runnable runnable) {
        if (bitmap != null) {
            try {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), this.cameraView.getMatrix(), true);
                bitmap.recycle();
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                if (createScaledBitmap != null) {
                    if (createScaledBitmap != createBitmap) {
                        createBitmap.recycle();
                    }
                    Utilities.blurBitmap(createScaledBitmap, 7, 1, createScaledBitmap.getWidth(), createScaledBitmap.getHeight(), createScaledBitmap.getRowBytes());
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg"));
                    createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                    createScaledBitmap.recycle();
                    fileOutputStream.close();
                }
            } catch (Throwable unused) {
            }
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    public void lambda$setCameraFlashModeIcon$39() {
        this.flashButton.setVisibility(8);
    }

    public void lambda$showDismissEntry$64(DialogInterface dialogInterface, int i) {
        StoryEntry storyEntry = this.outputEntry;
        if (storyEntry == null) {
            return;
        }
        storyEntry.captionEntitiesAllowed = MessagesController.getInstance(this.currentAccount).storyEntitiesAllowed();
        this.showSavedDraftHint = !this.outputEntry.isDraft;
        applyFilter(null);
        applyPaint();
        applyPaintMessage();
        destroyPhotoFilterView();
        StoryEntry storyEntry2 = this.outputEntry;
        storyEntry2.destroy(true);
        storyEntry2.caption = this.captionEdit.getText();
        this.outputEntry = null;
        prepareThumb(storyEntry2, true);
        DraftsController draftsController = MessagesController.getInstance(this.currentAccount).getStoriesController().getDraftsController();
        if (storyEntry2.isDraft) {
            draftsController.edit(storyEntry2);
        } else {
            draftsController.append(storyEntry2);
        }
        navigateTo(0, true);
    }

    public void lambda$showDismissEntry$65(DialogInterface dialogInterface, int i) {
        StoryEntry storyEntry = this.outputEntry;
        if (storyEntry != null && !storyEntry.isEdit && ((!storyEntry.isRepost || storyEntry.isRepostMessage) && storyEntry.isDraft)) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().getDraftsController().delete(this.outputEntry);
            this.outputEntry = null;
        }
        StoryEntry storyEntry2 = this.outputEntry;
        if (storyEntry2 == null || (!storyEntry2.isEdit && (!storyEntry2.isRepost || storyEntry2.isRepostMessage))) {
            navigateTo(0, true);
        } else {
            close(true);
        }
    }

    public void lambda$showLimitReachedSheet$73(boolean z, DialogInterface dialogInterface) {
        this.shownLimitReached = false;
        this.previewView.updatePauseReason(7, true);
        if (z) {
            close(true);
        }
    }

    public void lambda$showVideoTimer$40(boolean z) {
        if (z) {
            return;
        }
        this.videoTimerView.setRecording(false, false);
    }

    public void lambda$showZoomControls$41() {
        showZoomControls(false, true);
        this.zoomControlHideRunnable = null;
    }

    public void lambda$showZoomControls$42() {
        showZoomControls(false, true);
        this.zoomControlHideRunnable = null;
    }

    public static boolean lambda$toggleTheme$77(View view, MotionEvent motionEvent) {
        return true;
    }

    public void lambda$toggleTheme$78() {
        StoryEntry storyEntry = this.outputEntry;
        if (storyEntry == null) {
            return;
        }
        storyEntry.isDark = !storyEntry.isDark;
        PreviewView previewView = this.previewView;
        if (previewView != null) {
            previewView.setupWallpaper(storyEntry, false);
        }
        PaintView paintView = this.paintView;
        if (paintView != null && paintView.entitiesView != null) {
            for (int i = 0; i < this.paintView.entitiesView.getChildCount(); i++) {
                View childAt = this.paintView.entitiesView.getChildAt(i);
                if (childAt instanceof MessageEntityView) {
                    ((MessageEntityView) childAt).setupTheme(this.outputEntry);
                }
            }
        }
        updateThemeButtonDrawable(true);
    }

    public void lambda$upload$36(boolean z) {
        applyPaintMessage();
        this.preparingUpload = false;
        uploadInternal(z);
    }

    public void lambda$uploadInternal$37() {
        close(true);
    }

    public void lambda$uploadInternal$38(boolean z, long j) {
        if (z) {
            SourceView sourceView = this.fromSourceView;
            if (sourceView != null) {
                sourceView.show(true);
                this.fromSourceView = null;
            }
            Runnable runnable = this.closeListener;
            if (runnable != null) {
                runnable.run();
                this.closeListener = null;
            }
            ClosingViewProvider closingViewProvider = this.closingSourceProvider;
            SourceView view = closingViewProvider != null ? closingViewProvider.getView(j) : null;
            this.fromSourceView = view;
            if (view != null) {
                this.openType = view.type;
                this.containerView.updateBackground();
                FrameLayout frameLayout = this.previewContainer;
                int i = this.openType;
                frameLayout.setBackgroundColor((i == 1 || i == 0) ? 0 : -14737633);
                this.fromRect.set(this.fromSourceView.screenRect);
                SourceView sourceView2 = this.fromSourceView;
                this.fromRounding = sourceView2.rounding;
                sourceView2.hide();
                if (SharedConfig.getDevicePerformanceClass() > 1) {
                    LiteMode.isEnabled(98784);
                }
            }
            this.closingSourceProvider = null;
            Activity activity = this.activity;
            if (activity instanceof LaunchActivity) {
                ((LaunchActivity) activity).drawerLayoutContainer.post(new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.this.lambda$uploadInternal$37();
                    }
                });
                return;
            }
        }
        close(true);
    }

    public void onCloseDone() {
        this.isShown = false;
        AndroidUtilities.unlockOrientation(this.activity);
        if (this.cameraView != null) {
            if (this.takingVideo) {
                CameraController.getInstance().stopVideoRecording(this.cameraView.getCameraSession(), false);
            }
            destroyCameraView(false);
        }
        PreviewView previewView = this.previewView;
        if (previewView != null) {
            previewView.set(null);
        }
        destroyPhotoPaintView();
        destroyPhotoFilterView();
        File file = this.outputFile;
        if (file != null && !this.wasSend) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
        }
        this.outputFile = null;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.lambda$onCloseDone$4();
            }
        }, 16L);
        SourceView sourceView = this.fromSourceView;
        if (sourceView != null) {
            sourceView.show(false);
        }
        if (this.whenOpenDone != null) {
            this.whenOpenDone = null;
        }
        this.lastGalleryScrollPosition = null;
        StoryRecorder storyRecorder = instance;
        if (storyRecorder != null) {
            storyRecorder.close(false);
        }
        instance = null;
        Runnable runnable = this.onCloseListener;
        if (runnable != null) {
            runnable.run();
            this.onCloseListener = null;
        }
        WindowView windowView = this.windowView;
        if (windowView != null) {
            Bulletin.removeDelegate(windowView);
        }
        FrameLayout frameLayout = this.captionContainer;
        if (frameLayout != null) {
            Bulletin.removeDelegate(frameLayout);
        }
    }

    public void onNavigateEnd(int i, int i2) {
        int i3;
        if (i == 0) {
            destroyCameraView(false);
            this.recordControl.setVisibility(8);
            this.zoomControlView.setVisibility(8);
            this.modeSwitcherView.setVisibility(8);
            this.dualButton.setVisibility(8);
            animateRecording(false, false);
            setAwakeLock(false);
        }
        this.cameraViewThumb.setClickable(i2 == 0);
        if (i == 2) {
            this.coverTimelineView.setVisibility(8);
            this.captionContainer.setVisibility(i2 == 1 ? 0 : 8);
            this.captionEdit.setVisibility(8);
            this.coverButton.setVisibility(8);
        }
        if (i == 1) {
            this.previewButtons.setVisibility(8);
            this.captionContainer.setVisibility(i2 == 2 ? 0 : 8);
            this.muteButton.setVisibility(8);
            this.playButton.setVisibility(8);
            this.downloadButton.setVisibility(8);
            ImageView imageView = this.themeButton;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            this.previewView.setVisibility(i2 == 2 ? 0 : 8);
            this.timelineView.setVisibility(8);
            if (i2 != 2) {
                destroyPhotoPaintView();
                destroyPhotoFilterView();
            }
            this.titleTextView.setVisibility(i2 == 2 ? 0 : 8);
            destroyGalleryListView();
            this.trash.setAlpha(0.0f);
            this.trash.setVisibility(8);
            this.videoTimeView.setVisibility(8);
        }
        if (i2 == 1) {
            StoryEntry storyEntry = this.outputEntry;
            if (storyEntry == null || !storyEntry.isRepost) {
                createPhotoPaintView();
                hidePhotoPaintView();
            }
            StoryEntry storyEntry2 = this.outputEntry;
            if (storyEntry2 == null || (!storyEntry2.isRepost && !storyEntry2.isRepostMessage)) {
                createFilterPhotoView();
            }
            PhotoFilterView.EnhanceView enhanceView = this.photoFilterEnhanceView;
            if (enhanceView != null) {
                enhanceView.setAllowTouch(false);
            }
            this.previewView.updatePauseReason(2, false);
            this.previewView.updatePauseReason(3, false);
            this.previewView.updatePauseReason(4, false);
            this.previewView.updatePauseReason(5, false);
            this.previewView.updatePauseReason(7, false);
            VideoTimeView videoTimeView = this.videoTimeView;
            StoryEntry storyEntry3 = this.outputEntry;
            videoTimeView.setVisibility((storyEntry3 == null || storyEntry3.duration < 30000) ? 8 : 0);
            this.captionContainer.setAlpha(1.0f);
            this.captionContainer.setTranslationY(0.0f);
            CaptionStory captionStory = this.captionEdit;
            StoryEntry storyEntry4 = this.outputEntry;
            captionStory.setVisibility((storyEntry4 == null || storyEntry4.botId == 0) ? 0 : 8);
        }
        if (i2 == 0 && this.showSavedDraftHint) {
            getDraftSavedHint().setVisibility(0);
            getDraftSavedHint().show();
            this.recordControl.updateGalleryImage();
        }
        this.showSavedDraftHint = false;
        PhotoFilterView.EnhanceView enhanceView2 = this.photoFilterEnhanceView;
        if (enhanceView2 != null) {
            enhanceView2.setAllowTouch(i2 == 1 && ((i3 = this.currentEditMode) == -1 || i3 == 1));
        }
        CaptionStory captionStory2 = this.captionEdit;
        if (captionStory2 != null) {
            captionStory2.ignoreTouches = i2 != 1;
        }
        if (i2 == 1) {
            MediaDataController.getInstance(this.currentAccount).checkStickers(0);
            MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
            MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
            MessagesController.getInstance(this.currentAccount).getStoriesController().loadBlocklistAtFirst();
            MessagesController.getInstance(this.currentAccount).getStoriesController().loadSendAs();
        }
    }

    private void onNavigateStart(int i, int i2) {
        float f;
        SimpleTextView simpleTextView;
        StoryEntry storyEntry;
        StoryEntry storyEntry2;
        SimpleTextView simpleTextView2;
        int i3;
        StoryEntry storyEntry3;
        VideoEditTextureView textureView;
        if (i2 == 0) {
            requestCameraPermission(false);
            this.recordControl.setVisibility(0);
            RecordControl recordControl = this.recordControl;
            if (recordControl != null) {
                recordControl.stopRecordingLoading(false);
            }
            this.modeSwitcherView.setVisibility(0);
            this.zoomControlView.setVisibility(0);
            this.zoomControlView.setAlpha(0.0f);
            this.videoTimerView.setDuration(0L, true);
            StoryEntry storyEntry4 = this.outputEntry;
            if (storyEntry4 != null) {
                storyEntry4.destroy(false);
                this.outputEntry = null;
            }
        }
        if (i == 0) {
            setCameraFlashModeIcon(null, true);
            saveLastCameraBitmap(new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.this.lambda$onNavigateStart$51();
                }
            });
            DraftSavedHint draftSavedHint = this.draftSavedHint;
            if (draftSavedHint != null) {
                draftSavedHint.setVisibility(8);
            }
            this.cameraHint.hide();
            HintView2 hintView2 = this.dualHint;
            if (hintView2 != null) {
                hintView2.hide();
            }
        }
        if (i2 == 1 || i == 1) {
            this.downloadButton.setEntry(i2 == 1 ? this.outputEntry : null);
            if (this.isVideo) {
                this.muteButton.setVisibility(0);
                StoryEntry storyEntry5 = this.outputEntry;
                setIconMuted(storyEntry5 != null && storyEntry5.muted, false);
                this.playButton.setVisibility(0);
                this.previewView.play(true);
                this.playButton.drawable.setPause(this.previewView.isPlaying(), false);
                simpleTextView = this.titleTextView;
                f = 144.0f;
            } else {
                StoryEntry storyEntry6 = this.outputEntry;
                f = 48.0f;
                if (storyEntry6 != null && !TextUtils.isEmpty(storyEntry6.audioPath)) {
                    this.muteButton.setVisibility(8);
                    this.playButton.setVisibility(0);
                    this.playButton.drawable.setPause(true, false);
                }
                simpleTextView = this.titleTextView;
            }
            simpleTextView.setRightPadding(AndroidUtilities.dp(f));
            this.downloadButton.setVisibility(0);
            StoryEntry storyEntry7 = this.outputEntry;
            if (storyEntry7 == null || !storyEntry7.isRepostMessage) {
                ImageView imageView = this.themeButton;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else {
                getThemeButton().setVisibility(0);
                updateThemeButtonDrawable(false);
            }
            this.previewButtons.setVisibility(0);
            this.previewView.setVisibility(0);
            this.captionEdit.setVisibility(isBot() ? 8 : 0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.videoTimelineContainerView.getLayoutParams();
            layoutParams.bottomMargin = AndroidUtilities.dp(isBot() ? 12.0f : 68.0f);
            this.videoTimelineContainerView.setLayoutParams(layoutParams);
            this.captionContainer.setVisibility(0);
            this.captionContainer.clearFocus();
            CaptionStory captionStory = this.captionEdit;
            StoryEntry storyEntry8 = this.outputEntry;
            captionStory.setPeriod(storyEntry8 == null ? 86400 : storyEntry8.period, false);
            this.captionEdit.setPeriodVisible(!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && ((storyEntry = this.outputEntry) == null || !storyEntry.isEdit));
            CaptionStory captionStory2 = this.captionEdit;
            StoryEntry storyEntry9 = this.outputEntry;
            captionStory2.setHasRoundVideo((storyEntry9 == null || storyEntry9.round == null) ? false : true);
            setReply();
        }
        if (i2 == 2 || i == 2) {
            this.titleTextView.setVisibility(0);
            this.coverTimelineView.setVisibility(0);
            StoryEntry storyEntry10 = this.outputEntry;
            if (storyEntry10 != null && storyEntry10.isEditingCover) {
                this.titleTextView.setText(LocaleController.getString(R.string.RecorderEditCover));
            }
            this.captionContainer.setVisibility(0);
            this.coverButton.setVisibility(0);
        }
        if (i2 == 2) {
            this.titleTextView.setText(LocaleController.getString(R.string.RecorderEditCover));
        }
        if (i2 == 1) {
            this.videoError = false;
            StoryEntry storyEntry11 = this.outputEntry;
            boolean z = (storyEntry11 == null || storyEntry11.botId == 0) ? false : true;
            this.previewButtons.setShareText(LocaleController.getString(storyEntry11 != null && storyEntry11.isEdit ? R.string.Done : z ? R.string.UploadBotPreview : R.string.Next), !z);
            this.coverTimelineView.setVisibility(8);
            this.coverButton.setVisibility(8);
            if (!this.previewAlreadySet) {
                StoryEntry storyEntry12 = this.outputEntry;
                if (storyEntry12 == null || !storyEntry12.isRepostMessage) {
                    this.previewView.set(storyEntry12);
                } else {
                    this.previewView.preset(storyEntry12);
                }
            }
            this.previewAlreadySet = false;
            this.captionEdit.editText.getEditText().setOnPremiumMenuLockClickListener(MessagesController.getInstance(this.currentAccount).storyEntitiesAllowed() ? null : new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.this.lambda$onNavigateStart$52();
                }
            });
            StoryEntry storyEntry13 = this.outputEntry;
            if (storyEntry13 == null || !(storyEntry13.isDraft || storyEntry13.isEdit || this.isReposting)) {
                this.captionEdit.clear();
            } else {
                if (storyEntry13.paintFile != null) {
                    destroyPhotoPaintView();
                    createPhotoPaintView();
                    hidePhotoPaintView();
                }
                StoryEntry storyEntry14 = this.outputEntry;
                if (storyEntry14.isVideo && storyEntry14.filterState != null && (textureView = this.previewView.getTextureView()) != null) {
                    textureView.setDelegate(new VideoEditTextureView.VideoEditTextureViewDelegate() {
                        @Override
                        public final void onEGLThreadAvailable(FilterGLThread filterGLThread) {
                            StoryRecorder.this.lambda$onNavigateStart$53(filterGLThread);
                        }
                    });
                }
                this.captionEdit.setText(this.outputEntry.caption);
            }
            PreviewButtons previewButtons = this.previewButtons;
            StoryEntry storyEntry15 = this.outputEntry;
            previewButtons.setFiltersVisible(storyEntry15 == null || !storyEntry15.isRepostMessage || storyEntry15.isVideo);
            this.previewButtons.setShareEnabled((this.videoError || this.captionEdit.isCaptionOverLimit() || (MessagesController.getInstance(this.currentAccount).getStoriesController().hasStoryLimit() && ((storyEntry3 = this.outputEntry) == null || (!storyEntry3.isEdit && storyEntry3.botId == 0)))) ? false : true);
            RLottieImageView rLottieImageView = this.muteButton;
            StoryEntry storyEntry16 = this.outputEntry;
            rLottieImageView.setImageResource((storyEntry16 == null || !storyEntry16.muted) ? R.drawable.media_mute : R.drawable.media_unmute);
            this.previewView.setVisibility(0);
            this.timelineView.setVisibility(0);
            this.titleTextView.setVisibility(0);
            this.titleTextView.setTranslationX(0.0f);
            StoryEntry storyEntry17 = this.outputEntry;
            String str = "";
            if (storyEntry17 == null || storyEntry17.botId == 0) {
                if (storyEntry17 != null && storyEntry17.isEdit) {
                    simpleTextView2 = this.titleTextView;
                    i3 = R.string.RecorderEditStory;
                } else if (storyEntry17 != null && storyEntry17.isRepostMessage) {
                    simpleTextView2 = this.titleTextView;
                    i3 = R.string.RecorderRepost;
                } else if (storyEntry17 == null || !storyEntry17.isRepost) {
                    simpleTextView2 = this.titleTextView;
                    i3 = R.string.RecorderNewStory;
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    AvatarSpan avatarSpan = new AvatarSpan(this.titleTextView, this.currentAccount, 32.0f);
                    this.titleTextView.setTranslationX(-AndroidUtilities.dp(6.0f));
                    SpannableString spannableString = new SpannableString("a");
                    spannableString.setSpan(avatarSpan, 0, 1, 33);
                    if (this.outputEntry.repostPeer instanceof TLRPC.TL_peerUser) {
                        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.outputEntry.repostPeer.user_id));
                        avatarSpan.setUser(user);
                        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) "  ");
                        str = UserObject.getUserName(user);
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(this.outputEntry.repostPeer)));
                        avatarSpan.setChat(chat);
                        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) "  ");
                        if (chat != null) {
                            str = chat.title;
                        }
                    }
                    spannableStringBuilder.append((CharSequence) str);
                    this.titleTextView.setText(spannableStringBuilder);
                }
                str = LocaleController.getString(i3);
            } else {
                simpleTextView2 = this.titleTextView;
            }
            simpleTextView2.setText(str);
        }
        if (i == 1) {
            this.captionEdit.hidePeriodPopup();
            this.muteHint.hide();
        }
        if (i2 == 2 && (storyEntry2 = this.outputEntry) != null) {
            if (storyEntry2.cover < 0) {
                storyEntry2.cover = 0L;
            }
            this.coverValue = storyEntry2.cover;
            long duration = this.previewView.getDuration() < 100 ? this.outputEntry.duration : this.previewView.getDuration();
            StoryEntry storyEntry18 = this.outputEntry;
            if (storyEntry18.duration <= 0) {
                storyEntry18.duration = duration;
            }
            TimelineView timelineView = this.coverTimelineView;
            String absolutePath = storyEntry18.getOriginalFile().getAbsolutePath();
            StoryEntry storyEntry19 = this.outputEntry;
            timelineView.setVideo(false, absolutePath, storyEntry19.duration, storyEntry19.videoVolume);
            TimelineView timelineView2 = this.coverTimelineView;
            StoryEntry storyEntry20 = this.outputEntry;
            float f2 = (float) duration;
            timelineView2.setCoverVideo(storyEntry20.left * f2, storyEntry20.right * f2);
            Utilities.Callback2 callback2 = new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    StoryRecorder.this.lambda$onNavigateStart$54((Boolean) obj, (Float) obj2);
                }
            };
            this.coverTimelineView.setDelegate(new TimelineView.TimelineDelegate() {
                final Utilities.Callback2 val$videoLeftSet;

                AnonymousClass21(Utilities.Callback2 callback22) {
                    r2 = callback22;
                }

                @Override
                public void onAudioLeftChange(float f3) {
                    TimelineView.TimelineDelegate.CC.$default$onAudioLeftChange(this, f3);
                }

                @Override
                public void onAudioOffsetChange(long j) {
                    TimelineView.TimelineDelegate.CC.$default$onAudioOffsetChange(this, j);
                }

                @Override
                public void onAudioRemove() {
                    TimelineView.TimelineDelegate.CC.$default$onAudioRemove(this);
                }

                @Override
                public void onAudioRightChange(float f3) {
                    TimelineView.TimelineDelegate.CC.$default$onAudioRightChange(this, f3);
                }

                @Override
                public void onAudioVolumeChange(float f3) {
                    TimelineView.TimelineDelegate.CC.$default$onAudioVolumeChange(this, f3);
                }

                @Override
                public void onProgressChange(long j, boolean z2) {
                    TimelineView.TimelineDelegate.CC.$default$onProgressChange(this, j, z2);
                }

                @Override
                public void onProgressDragChange(boolean z2) {
                    TimelineView.TimelineDelegate.CC.$default$onProgressDragChange(this, z2);
                }

                @Override
                public void onRoundLeftChange(float f3) {
                    TimelineView.TimelineDelegate.CC.$default$onRoundLeftChange(this, f3);
                }

                @Override
                public void onRoundOffsetChange(long j) {
                    TimelineView.TimelineDelegate.CC.$default$onRoundOffsetChange(this, j);
                }

                @Override
                public void onRoundRemove() {
                    TimelineView.TimelineDelegate.CC.$default$onRoundRemove(this);
                }

                @Override
                public void onRoundRightChange(float f3) {
                    TimelineView.TimelineDelegate.CC.$default$onRoundRightChange(this, f3);
                }

                @Override
                public void onRoundSelectChange(boolean z2) {
                    TimelineView.TimelineDelegate.CC.$default$onRoundSelectChange(this, z2);
                }

                @Override
                public void onRoundVolumeChange(float f3) {
                    TimelineView.TimelineDelegate.CC.$default$onRoundVolumeChange(this, f3);
                }

                @Override
                public void onVideoLeftChange(float f3) {
                    r2.run(Boolean.FALSE, Float.valueOf(f3));
                }

                @Override
                public void onVideoRightChange(float f3) {
                    TimelineView.TimelineDelegate.CC.$default$onVideoRightChange(this, f3);
                }

                @Override
                public void onVideoVolumeChange(float f3) {
                    TimelineView.TimelineDelegate.CC.$default$onVideoVolumeChange(this, f3);
                }
            });
            float max = (((float) this.coverValue) / ((float) Math.max(1L, duration))) * 0.96f;
            this.coverTimelineView.setVideoLeft(max);
            this.coverTimelineView.setVideoRight(0.04f + max);
            callback22.run(Boolean.TRUE, Float.valueOf(max));
        }
        PhotoFilterView.EnhanceView enhanceView = this.photoFilterEnhanceView;
        if (enhanceView != null) {
            enhanceView.setAllowTouch(false);
        }
        this.cameraViewThumb.setClickable(false);
        HintView2 hintView22 = this.savedDualHint;
        if (hintView22 != null) {
            hintView22.hide();
        }
        Bulletin.hideVisible();
        CaptionStory captionStory3 = this.captionEdit;
        if (captionStory3 != null) {
            captionStory3.closeKeyboard();
            this.captionEdit.ignoreTouches = true;
        }
        PreviewView previewView = this.previewView;
        if (previewView != null) {
            previewView.updatePauseReason(8, i2 != 1);
        }
        PaintView paintView = this.paintView;
        if (paintView != null) {
            paintView.setCoverPreview(i2 != 1);
        }
    }

    public void onOpenDone() {
        this.isShown = true;
        this.wasSend = false;
        if (this.openType == 1) {
            this.previewContainer.setAlpha(1.0f);
            this.previewContainer.setTranslationX(0.0f);
            this.previewContainer.setTranslationY(0.0f);
            this.actionBarContainer.setAlpha(1.0f);
            this.controlContainer.setAlpha(1.0f);
            this.windowView.setBackgroundColor(-16777216);
            if (this.currentPage == 2) {
                this.coverButton.setAlpha(1.0f);
            }
        }
        Runnable runnable = this.whenOpenDone;
        if (runnable != null) {
            runnable.run();
            this.whenOpenDone = null;
        } else {
            onResumeInternal();
        }
        StoryEntry storyEntry = this.outputEntry;
        if (storyEntry != null && storyEntry.isRepost) {
            createPhotoPaintView();
            hidePhotoPaintView();
        } else {
            if (storyEntry == null || !storyEntry.isRepostMessage) {
                return;
            }
            if (storyEntry.isVideo) {
                this.previewView.setupVideoPlayer(storyEntry, null, 0L);
            }
        }
        createFilterPhotoView();
    }

    public static void onPause() {
        StoryRecorder storyRecorder = instance;
        if (storyRecorder != null) {
            storyRecorder.onPauseInternal();
        }
    }

    private void onPauseInternal() {
        destroyCameraView(false);
        CaptionStory captionStory = this.captionEdit;
        if (captionStory != null) {
            captionStory.onPause();
        }
        PreviewView previewView = this.previewView;
        if (previewView != null) {
            previewView.updatePauseReason(0, true);
        }
    }

    public static void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        StoryRecorder storyRecorder = instance;
        if (storyRecorder != null) {
            storyRecorder.onRequestPermissionsResultInternal(i, strArr, iArr);
        }
    }

    private void onRequestPermissionsResultInternal(int i, String[] strArr, int[] iArr) {
        Runnable runnable;
        AlertDialog.Builder message;
        String string;
        DialogInterface.OnClickListener onClickListener;
        boolean z = iArr != null && iArr.length == 1 && iArr[0] == 0;
        if (i == 111) {
            this.noCameraPermission = !z;
            if (z && this.currentPage == 0) {
                this.cameraViewThumb.setImageDrawable(null);
                if (CameraController.getInstance().isCameraInitied()) {
                    createCameraView();
                    return;
                } else {
                    CameraController.getInstance().initCamera(new StoryRecorder$$ExternalSyntheticLambda0(this));
                    return;
                }
            }
            return;
        }
        if (i == 114) {
            if (z) {
                MediaController.loadGalleryPhotosAlbums(0);
                lambda$animateGalleryListView$48(true);
                return;
            } else {
                message = new AlertDialog.Builder(getContext(), this.resourcesProvider).setTopAnimation(R.raw.permission_request_folder, 72, false, Theme.getColor(Theme.key_dialogTopBackground)).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionStorageWithHint)));
                string = LocaleController.getString(R.string.PermissionOpenSettings);
                onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        StoryRecorder.this.lambda$onRequestPermissionsResultInternal$70(dialogInterface, i2);
                    }
                };
            }
        } else {
            if (i != 112) {
                if (i == 115) {
                    if (!z) {
                        new AlertDialog.Builder(getContext(), this.resourcesProvider).setTopAnimation(R.raw.permission_request_folder, 72, false, Theme.getColor(Theme.key_dialogTopBackground)).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoAudioStorageStory))).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new DialogInterface.OnClickListener() {
                            @Override
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                StoryRecorder.this.lambda$onRequestPermissionsResultInternal$72(dialogInterface, i2);
                            }
                        }).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).create().show();
                    }
                    if (z && (runnable = this.audioGrantedCallback) != null) {
                        runnable.run();
                    }
                    this.audioGrantedCallback = null;
                    return;
                }
                return;
            }
            if (z) {
                return;
            }
            message = new AlertDialog.Builder(getContext(), this.resourcesProvider).setTopAnimation(R.raw.permission_request_camera, 72, false, Theme.getColor(Theme.key_dialogTopBackground)).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraMicVideo)));
            string = LocaleController.getString(R.string.PermissionOpenSettings);
            onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    StoryRecorder.this.lambda$onRequestPermissionsResultInternal$71(dialogInterface, i2);
                }
            };
        }
        message.setPositiveButton(string, onClickListener).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).create().show();
    }

    public static void onResume() {
        StoryRecorder storyRecorder = instance;
        if (storyRecorder != null) {
            storyRecorder.onResumeInternal();
        }
    }

    private void onResumeInternal() {
        if (this.currentPage == 0) {
            ValueAnimator valueAnimator = this.openCloseAnimator;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                requestCameraPermission(false);
            } else {
                this.whenOpenDone = new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.this.lambda$onResumeInternal$69();
                    }
                };
            }
        }
        CaptionStory captionStory = this.captionEdit;
        if (captionStory != null) {
            captionStory.onResume();
        }
        RecordControl recordControl = this.recordControl;
        if (recordControl != null) {
            recordControl.updateGalleryImage();
        }
        PreviewHighlightView previewHighlightView = this.previewHighlight;
        if (previewHighlightView != null) {
            previewHighlightView.updateCount();
        }
        PaintView paintView = this.paintView;
        if (paintView != null) {
            paintView.onResume();
        }
        PreviewView previewView = this.previewView;
        if (previewView != null) {
            previewView.updatePauseReason(0, false);
        }
        MessagesController.getInstance(this.currentAccount).getStoriesController().getDraftsController().load();
    }

    public void onSwitchEditModeEnd(int i, int i2) {
        PaintView paintView;
        PaintView paintView2;
        if (i2 == 0) {
            this.backButton.setVisibility(8);
        }
        if (i == 0 && (paintView2 = this.paintView) != null) {
            paintView2.setVisibility(8);
        }
        if (i == -1) {
            this.captionContainer.setVisibility(8);
            this.muteButton.setVisibility(8);
            this.playButton.setVisibility(8);
            this.downloadButton.setVisibility(8);
            ImageView imageView = this.themeButton;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            this.timelineView.setVisibility(8);
            this.titleTextView.setVisibility(8);
        }
        this.previewView.setAllowCropping(i2 == -1);
        if ((i2 == 0 || i == 0) && (paintView = this.paintView) != null) {
            paintView.onAnimationStateChanged(false);
        }
        PhotoFilterView.EnhanceView enhanceView = this.photoFilterEnhanceView;
        if (enhanceView != null) {
            enhanceView.setAllowTouch(i2 == 1 || i2 == -1);
        }
    }

    private void onSwitchEditModeStart(int i, int i2) {
        PaintView paintView;
        PaintView paintView2;
        if (i2 == -1) {
            this.backButton.setVisibility(0);
            this.captionContainer.setVisibility(0);
            PaintView paintView3 = this.paintView;
            if (paintView3 != null) {
                paintView3.clearSelection();
            }
            this.downloadButton.setVisibility(0);
            StoryEntry storyEntry = this.outputEntry;
            if (storyEntry == null || !storyEntry.isRepostMessage) {
                ImageView imageView = this.themeButton;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else {
                getThemeButton().setVisibility(0);
                updateThemeButtonDrawable(false);
            }
            this.titleTextView.setVisibility(0);
            if (this.isVideo) {
                this.muteButton.setVisibility(0);
            } else {
                StoryEntry storyEntry2 = this.outputEntry;
                if (storyEntry2 != null && !TextUtils.isEmpty(storyEntry2.audioPath)) {
                    this.muteButton.setVisibility(8);
                }
                this.timelineView.setVisibility(0);
            }
            this.playButton.setVisibility(0);
            this.timelineView.setVisibility(0);
        }
        if (i2 == 0 && (paintView2 = this.paintView) != null) {
            paintView2.setVisibility(0);
        }
        if ((i2 == 0 || i == 0) && (paintView = this.paintView) != null) {
            paintView.onAnimationStateChanged(true);
        }
        PaintView paintView4 = this.paintView;
        if (paintView4 != null) {
            paintView4.keyboardNotifier.ignore(i2 != 0);
        }
        this.captionEdit.keyboardNotifier.ignore(i2 != -1);
        Bulletin.hideVisible();
        if (this.photoFilterView != null && i == 1) {
            applyFilter(null);
        }
        PhotoFilterView.EnhanceView enhanceView = this.photoFilterEnhanceView;
        if (enhanceView != null) {
            enhanceView.setAllowTouch(false);
        }
        this.muteHint.hide();
    }

    public void openPremium() {
        PreviewView previewView = this.previewView;
        if (previewView != null) {
            previewView.updatePauseReason(4, true);
        }
        CaptionStory captionStory = this.captionEdit;
        if (captionStory != null) {
            captionStory.hidePeriodPopup();
        }
        PremiumFeatureBottomSheet premiumFeatureBottomSheet = new PremiumFeatureBottomSheet(new BaseFragment() {

            class AnonymousClass1 extends WrappedResourceProvider {
                AnonymousClass1(Theme.ResourcesProvider resourcesProvider) {
                    super(resourcesProvider);
                }

                @Override
                public void appendColors() {
                    this.sparseIntArray.append(Theme.key_dialogBackground, -14803426);
                    this.sparseIntArray.append(Theme.key_windowBackgroundGray, -16777216);
                }
            }

            AnonymousClass26() {
                this.currentAccount = StoryRecorder.this.currentAccount;
            }

            @Override
            public Activity getParentActivity() {
                return StoryRecorder.this.activity;
            }

            @Override
            public Theme.ResourcesProvider getResourceProvider() {
                return new WrappedResourceProvider(StoryRecorder.this.resourcesProvider) {
                    AnonymousClass1(Theme.ResourcesProvider resourcesProvider) {
                        super(resourcesProvider);
                    }

                    @Override
                    public void appendColors() {
                        this.sparseIntArray.append(Theme.key_dialogBackground, -14803426);
                        this.sparseIntArray.append(Theme.key_windowBackgroundGray, -16777216);
                    }
                };
            }

            @Override
            public boolean isLightStatusBar() {
                return false;
            }

            @Override
            public Dialog showDialog(Dialog dialog) {
                dialog.show();
                return dialog;
            }
        }, 14, false);
        premiumFeatureBottomSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                StoryRecorder.this.lambda$openPremium$74(dialogInterface);
            }
        });
        premiumFeatureBottomSheet.show();
    }

    private void orderPreviewViews() {
        RenderView renderView = this.paintViewRenderView;
        if (renderView != null) {
            renderView.bringToFront();
        }
        View view = this.paintViewRenderInputView;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.paintViewTextDim;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.paintViewEntitiesView;
        if (view3 != null) {
            view3.bringToFront();
        }
        View view4 = this.paintViewSelectionContainerView;
        if (view4 != null) {
            view4.bringToFront();
        }
        TrashView trashView = this.trash;
        if (trashView != null) {
            trashView.bringToFront();
        }
        PhotoFilterView.EnhanceView enhanceView = this.photoFilterEnhanceView;
        if (enhanceView != null) {
            enhanceView.bringToFront();
        }
        PhotoFilterBlurControl photoFilterBlurControl = this.photoFilterViewBlurControl;
        if (photoFilterBlurControl != null) {
            photoFilterBlurControl.bringToFront();
        }
        PhotoFilterCurvesControl photoFilterCurvesControl = this.photoFilterViewCurvesControl;
        if (photoFilterCurvesControl != null) {
            photoFilterCurvesControl.bringToFront();
        }
        PreviewHighlightView previewHighlightView = this.previewHighlight;
        if (previewHighlightView != null) {
            previewHighlightView.bringToFront();
        }
        RoundVideoRecorder roundVideoRecorder = this.currentRoundRecorder;
        if (roundVideoRecorder != null) {
            roundVideoRecorder.bringToFront();
        }
    }

    private CharSequence premiumText(String str) {
        return AndroidUtilities.replaceSingleTag(str, Theme.key_chat_messageLinkIn, 0, new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.openPremium();
            }
        }, this.resourcesProvider);
    }

    private File prepareThumb(StoryEntry storyEntry, boolean z) {
        if (storyEntry == null || this.previewView.getWidth() <= 0 || this.previewView.getHeight() <= 0) {
            return null;
        }
        File file = z ? storyEntry.draftThumbFile : storyEntry.uploadThumbFile;
        if (file != null) {
            file.delete();
        }
        float f = z ? 0.33333334f : 1.0f;
        int width = (int) (this.previewView.getWidth() * f);
        Bitmap createBitmap = Bitmap.createBitmap(width, (int) (this.previewView.getHeight() * f), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        canvas.save();
        canvas.scale(f, f);
        this.previewView.draw(canvas);
        canvas.restore();
        Paint paint = new Paint(2);
        VideoEditTextureView textureView = this.previewView.getTextureView();
        if (storyEntry.isVideo && !storyEntry.isRepostMessage && textureView != null) {
            Bitmap bitmap = textureView.getBitmap();
            Matrix transform = textureView.getTransform(null);
            if (transform != null) {
                Matrix matrix = new Matrix(transform);
                matrix.postScale(f, f);
                transform = matrix;
            }
            canvas.drawBitmap(bitmap, transform, paint);
            bitmap.recycle();
        }
        File file2 = storyEntry.paintBlurFile;
        if (file2 != null) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(file2.getPath());
                canvas.save();
                float width2 = width / decodeFile.getWidth();
                canvas.scale(width2, width2);
                canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint);
                canvas.restore();
                decodeFile.recycle();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        File file3 = storyEntry.paintFile;
        if (file3 != null) {
            try {
                Bitmap decodeFile2 = BitmapFactory.decodeFile(file3.getPath());
                canvas.save();
                float width3 = width / decodeFile2.getWidth();
                canvas.scale(width3, width3);
                canvas.drawBitmap(decodeFile2, 0.0f, 0.0f, paint);
                canvas.restore();
                decodeFile2.recycle();
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        PaintView paintView = this.paintView;
        if (paintView != null && paintView.entitiesView != null) {
            canvas.save();
            canvas.scale(f, f);
            PaintView paintView2 = this.paintView;
            paintView2.drawForThemeToggle = true;
            EntitiesContainerView entitiesContainerView = paintView2.entitiesView;
            entitiesContainerView.drawForThumb = true;
            entitiesContainerView.draw(canvas);
            PaintView paintView3 = this.paintView;
            paintView3.entitiesView.drawForThumb = false;
            paintView3.drawForThemeToggle = false;
            canvas.restore();
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
        File makeCacheFile = StoryEntry.makeCacheFile(this.currentAccount, false);
        try {
            createBitmap.compress(Bitmap.CompressFormat.JPEG, z ? 95 : 99, new FileOutputStream(makeCacheFile));
        } catch (FileNotFoundException e3) {
            e3.printStackTrace();
        }
        createBitmap.recycle();
        if (z) {
            storyEntry.draftThumbFile = makeCacheFile;
        } else {
            storyEntry.uploadThumbFile = makeCacheFile;
        }
        storyEntry.thumbBitmap = createScaledBitmap;
        return makeCacheFile;
    }

    private void processDone() {
        StoriesController.StoryLimit checkStoryLimit;
        StoryPrivacyBottomSheet storyPrivacyBottomSheet = this.privacySheet;
        if (storyPrivacyBottomSheet != null) {
            storyPrivacyBottomSheet.dismiss();
            this.privacySheet = null;
        }
        if (this.videoError) {
            this.downloadButton.showFailedVideo();
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            PreviewButtons.ShareButtonView shareButtonView = this.previewButtons.shareButton;
            int i = -this.shiftDp;
            this.shiftDp = i;
            AndroidUtilities.shakeViewSpring(shareButtonView, i);
            return;
        }
        CaptionStory captionStory = this.captionEdit;
        if (captionStory != null && captionStory.isCaptionOverLimit()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            AnimatedTextView animatedTextView = this.captionEdit.limitTextView;
            int i2 = -this.shiftDp;
            this.shiftDp = i2;
            AndroidUtilities.shakeViewSpring(animatedTextView, i2);
            this.captionEdit.captionLimitToast();
            return;
        }
        StoryEntry storyEntry = this.outputEntry;
        if ((storyEntry == null || (!storyEntry.isEdit && storyEntry.botId == 0)) && (checkStoryLimit = MessagesController.getInstance(this.currentAccount).storiesController.checkStoryLimit()) != null && checkStoryLimit.active(this.currentAccount)) {
            showLimitReachedSheet(checkStoryLimit, false);
            return;
        }
        this.outputEntry.captionEntitiesAllowed = MessagesController.getInstance(this.currentAccount).storyEntitiesAllowed();
        CaptionStory captionStory2 = this.captionEdit;
        if (captionStory2 != null && !this.outputEntry.captionEntitiesAllowed) {
            CharSequence text = captionStory2.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((TextStyleSpan[]) spannable.getSpans(0, text.length(), TextStyleSpan.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    BulletinFactory.of(this.windowView, this.resourcesProvider).createSimpleBulletin(R.raw.voip_invite, premiumText(LocaleController.getString(R.string.StoryPremiumFormatting))).show(true);
                    CaptionStory captionStory3 = this.captionEdit;
                    int i3 = -this.shiftDp;
                    this.shiftDp = i3;
                    AndroidUtilities.shakeViewSpring(captionStory3, i3);
                    return;
                }
            }
        }
        StoryEntry storyEntry2 = this.outputEntry;
        if (storyEntry2.isEdit || storyEntry2.botId != 0) {
            storyEntry2.editedPrivacy = false;
            applyFilter(null);
            upload(true);
            return;
        }
        if (this.selectedDialogId != 0) {
            storyEntry2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.selectedDialogId);
        }
        this.previewView.updatePauseReason(3, true);
        this.privacySheet = new StoryPrivacyBottomSheet(this.activity, this.outputEntry.period, this.resourcesProvider).setValue(this.outputEntry.privacy).setPeer(this.outputEntry.peer).setCanChangePeer(this.canChangePeer).whenDismiss(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.this.lambda$processDone$29((StoryPrivacyBottomSheet.StoryPrivacy) obj);
            }
        }).isEdit(false).setWarnUsers(getUsersFrom(this.captionEdit.getText())).whenSelectedPeer(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.this.lambda$processDone$30((TLRPC.InputPeer) obj);
            }
        }).whenSelectedRules(new StoryPrivacyBottomSheet.DoneCallback() {
            @Override
            public final void done(StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, boolean z, boolean z2, TLRPC.InputPeer inputPeer, Runnable runnable) {
                StoryRecorder.this.lambda$processDone$32(storyPrivacy, z, z2, inputPeer, runnable);
            }
        }, false);
        StoryEntry storyEntry3 = this.outputEntry;
        if (storyEntry3.isVideo) {
            PreviewView previewView = this.previewView;
            if (previewView != null && !storyEntry3.coverSet && this.currentPage != 2) {
                storyEntry3.cover = previewView.getCurrentPosition();
                this.previewView.getCoverBitmap(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        StoryRecorder.this.lambda$processDone$33((Bitmap) obj);
                    }
                }, this.previewView, this.paintViewRenderView, this.paintViewEntitiesView);
            }
            this.privacySheet.setCover(this.outputEntry.coverBitmap, new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.this.lambda$processDone$34();
                }
            });
        }
        this.privacySheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                StoryRecorder.this.lambda$processDone$35(dialogInterface);
            }
        });
        this.privacySheet.show();
    }

    public boolean requestAudioPermission() {
        Activity activity;
        int checkSelfPermission;
        if (Build.VERSION.SDK_INT < 23 || (activity = this.activity) == null) {
            return true;
        }
        checkSelfPermission = activity.checkSelfPermission("android.permission.RECORD_AUDIO");
        if (checkSelfPermission == 0) {
            return true;
        }
        this.activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 112);
        return false;
    }

    private void requestCameraPermission(boolean z) {
        Activity activity;
        int checkSelfPermission;
        boolean shouldShowRequestPermissionRationale;
        if (!this.requestedCameraPermission || z) {
            this.noCameraPermission = false;
            if (Build.VERSION.SDK_INT >= 23 && (activity = this.activity) != null) {
                checkSelfPermission = activity.checkSelfPermission("android.permission.CAMERA");
                boolean z2 = checkSelfPermission != 0;
                this.noCameraPermission = z2;
                if (z2) {
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.story_camera).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(-14540254), mutate);
                    combinedDrawable.setIconSize(AndroidUtilities.dp(64.0f), AndroidUtilities.dp(64.0f));
                    this.cameraViewThumb.setImageDrawable(combinedDrawable);
                    shouldShowRequestPermissionRationale = this.activity.shouldShowRequestPermissionRationale("android.permission.CAMERA");
                    if (shouldShowRequestPermissionRationale) {
                        new AlertDialog.Builder(getContext(), this.resourcesProvider).setTopAnimation(R.raw.permission_request_camera, 72, false, Theme.getColor(Theme.key_dialogTopBackground)).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint))).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new DialogInterface.OnClickListener() {
                            @Override
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                StoryRecorder.this.lambda$requestCameraPermission$68(dialogInterface, i);
                            }
                        }).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).create().show();
                        return;
                    } else {
                        this.activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                        this.requestedCameraPermission = true;
                    }
                }
            }
            if (this.noCameraPermission) {
                return;
            }
            if (CameraController.getInstance().isCameraInitied()) {
                createCameraView();
            } else {
                CameraController.getInstance().initCamera(new StoryRecorder$$ExternalSyntheticLambda0(this));
            }
        }
    }

    public boolean requestGalleryPermission() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.StoryRecorder.requestGalleryPermission():boolean");
    }

    public void saveCameraFace(boolean z) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z).apply();
    }

    private void saveFrontFaceFlashMode() {
        if (this.frontfaceFlashMode >= 0) {
            MessagesController.getGlobalMainSettings().edit().putFloat("frontflash_warmth", this.flashViews.warmth).putFloat("frontflash_intensity", this.flashViews.intensity).apply();
        }
    }

    private void saveLastCameraBitmap(final Runnable runnable) {
        DualCameraView dualCameraView = this.cameraView;
        if (dualCameraView != null && dualCameraView.getTextureView() != null) {
            try {
                final Bitmap bitmap = this.cameraView.getTextureView().getBitmap();
                Utilities.themeQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.this.lambda$saveLastCameraBitmap$63(bitmap, runnable);
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public void setAwakeLock(boolean z) {
        WindowManager.LayoutParams layoutParams;
        int i;
        if (z) {
            layoutParams = this.windowLayoutParams;
            i = layoutParams.flags | 128;
        } else {
            layoutParams = this.windowLayoutParams;
            i = layoutParams.flags & (-129);
        }
        layoutParams.flags = i;
        try {
            this.windowManager.updateViewLayout(this.windowView, this.windowLayoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void setCameraFlashModeIcon(String str, boolean z) {
        char c;
        int i;
        ToggleButton2 toggleButton2;
        int i2;
        this.flashButton.clearAnimation();
        DualCameraView dualCameraView = this.cameraView;
        if ((dualCameraView != null && dualCameraView.isDual()) || this.animatedRecording) {
            str = null;
        }
        if (str == null) {
            if (z) {
                this.flashButton.setVisibility(0);
                this.flashButton.animate().alpha(0.0f).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.this.lambda$setCameraFlashModeIcon$39();
                    }
                }).start();
                return;
            } else {
                this.flashButton.setVisibility(8);
                this.flashButton.setAlpha(0.0f);
                return;
            }
        }
        int hashCode = str.hashCode();
        if (hashCode == 3551) {
            if (str.equals("on")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 109935) {
            if (hashCode == 3005871 && str.equals("auto")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("off")) {
                c = 3;
            }
            c = 65535;
        }
        if (c == 0) {
            i = R.drawable.media_photo_flash_on2;
            toggleButton2 = this.flashButton;
            i2 = R.string.AccDescrCameraFlashOn;
        } else if (c != 1) {
            i = R.drawable.media_photo_flash_off2;
            toggleButton2 = this.flashButton;
            i2 = R.string.AccDescrCameraFlashOff;
        } else {
            i = R.drawable.media_photo_flash_auto2;
            toggleButton2 = this.flashButton;
            i2 = R.string.AccDescrCameraFlashAuto;
        }
        toggleButton2.setContentDescription(LocaleController.getString(i2));
        ToggleButton2 toggleButton22 = this.flashButton;
        this.flashButtonResId = i;
        toggleButton22.setIcon(i, false);
        this.flashButton.setVisibility(0);
        if (z) {
            this.flashButton.animate().alpha(1.0f).start();
        } else {
            this.flashButton.setAlpha(1.0f);
        }
    }

    private void setCurrentFlashMode(String str) {
        DualCameraView dualCameraView = this.cameraView;
        if (dualCameraView == null || dualCameraView.getCameraSession() == null) {
            return;
        }
        if (!this.cameraView.isFrontface() || this.cameraView.getCameraSession().hasFlashModes()) {
            this.cameraView.getCameraSession().setCurrentFlashMode(str);
            return;
        }
        int indexOf = this.frontfaceFlashModes.indexOf(str);
        if (indexOf >= 0) {
            this.frontfaceFlashMode = indexOf;
            MessagesController.getGlobalMainSettings().edit().putInt("frontflash", this.frontfaceFlashMode).apply();
        }
    }

    private void setReply() {
        String str;
        StoryEntry storyEntry;
        SpannableStringBuilder spannableStringBuilder;
        CaptionStory captionStory = this.captionEdit;
        if (captionStory == null) {
            return;
        }
        StoryEntry storyEntry2 = this.outputEntry;
        if (storyEntry2 == null || !storyEntry2.isRepost) {
            captionStory.setReply(null, null);
            return;
        }
        TLRPC.Peer peer = storyEntry2.repostPeer;
        if (peer instanceof TLRPC.TL_peerUser) {
            str = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peer.user_id)));
            storyEntry = this.outputEntry;
            spannableStringBuilder = new SpannableStringBuilder(MessageObject.userSpan());
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
            str = chat == null ? "" : chat.title;
            storyEntry = this.outputEntry;
            spannableStringBuilder = new SpannableStringBuilder(MessageObject.userSpan());
        }
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) " ").append((CharSequence) str);
        storyEntry.repostPeerName = append;
        String str2 = this.outputEntry.repostCaption;
        boolean isEmpty = TextUtils.isEmpty(str2);
        String str3 = str2;
        if (isEmpty) {
            SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Story));
            spannableString.setSpan(new CharacterStyle() {
                AnonymousClass15() {
                }

                @Override
                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setAlpha(128);
                }
            }, 0, spannableString.length(), 33);
            str3 = spannableString;
        }
        this.captionEdit.setReply(append, str3);
    }

    private void showDismissEntry() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.DiscardChanges));
        builder.setMessage(LocaleController.getString(R.string.PhotoEditorDiscardAlert));
        StoryEntry storyEntry = this.outputEntry;
        if (storyEntry != null && !storyEntry.isEdit) {
            builder.setNeutralButton(LocaleController.getString(storyEntry.isDraft ? R.string.StoryKeepDraft : R.string.StorySaveDraft), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    StoryRecorder.this.lambda$showDismissEntry$64(dialogInterface, i);
                }
            });
        }
        StoryEntry storyEntry2 = this.outputEntry;
        builder.setPositiveButton(LocaleController.getString((storyEntry2 == null || !storyEntry2.isDraft || storyEntry2.isEdit) ? R.string.Discard : R.string.StoryDeleteDraft), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                StoryRecorder.this.lambda$showDismissEntry$65(dialogInterface, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog create = builder.create();
        create.show();
        View button = create.getButton(-1);
        if (button instanceof TextView) {
            int i = Theme.key_text_RedBold;
            ((TextView) button).setTextColor(Theme.getColor(i, this.resourcesProvider));
            button.setBackground(Theme.createRadSelectorDrawable(ColorUtils.setAlphaComponent(Theme.getColor(i, this.resourcesProvider), 51), 6, 6));
        }
    }

    private void showLimitReachedSheet(StoriesController.StoryLimit storyLimit, final boolean z) {
        if (this.shownLimitReached) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(new BaseFragment() {

            class AnonymousClass1 extends WrappedResourceProvider {
                AnonymousClass1(Theme.ResourcesProvider resourcesProvider) {
                    super(resourcesProvider);
                }

                @Override
                public void appendColors() {
                    this.sparseIntArray.append(Theme.key_dialogBackground, -14737633);
                    this.sparseIntArray.append(Theme.key_windowBackgroundGray, -13421773);
                }
            }

            AnonymousClass25() {
            }

            @Override
            public Activity getParentActivity() {
                return StoryRecorder.this.activity;
            }

            @Override
            public Theme.ResourcesProvider getResourceProvider() {
                return new WrappedResourceProvider(StoryRecorder.this.resourcesProvider) {
                    AnonymousClass1(Theme.ResourcesProvider resourcesProvider) {
                        super(resourcesProvider);
                    }

                    @Override
                    public void appendColors() {
                        this.sparseIntArray.append(Theme.key_dialogBackground, -14737633);
                        this.sparseIntArray.append(Theme.key_windowBackgroundGray, -13421773);
                    }
                };
            }

            @Override
            public boolean isLightStatusBar() {
                return false;
            }

            @Override
            public boolean presentFragment(BaseFragment baseFragment) {
                StoryRecorder.this.openPremium();
                return false;
            }
        }, this.activity, storyLimit.getLimitReachedType(), this.currentAccount, null);
        limitReachedBottomSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                StoryRecorder.this.lambda$showLimitReachedSheet$73(z, dialogInterface);
            }
        });
        this.previewView.updatePauseReason(7, true);
        this.shownLimitReached = true;
        limitReachedBottomSheet.show();
    }

    public void showPremiumPeriodBulletin(int i) {
        int i2 = i / 3600;
        Bulletin.BulletinWindow.BulletinWindowLayout make = Bulletin.BulletinWindow.make(this.activity, new Bulletin.Delegate() {
            AnonymousClass27() {
            }

            @Override
            public boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public boolean clipWithGradient(int i3) {
                return true;
            }

            @Override
            public int getBottomOffset(int i3) {
                return Bulletin.Delegate.CC.$default$getBottomOffset(this, i3);
            }

            @Override
            public int getTopOffset(int i3) {
                return 0;
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
        });
        WindowManager.LayoutParams layout = make.getLayout();
        if (layout != null) {
            layout.height = -2;
            layout.width = this.containerView.getWidth();
            layout.y = (int) (this.containerView.getY() + AndroidUtilities.dp(56.0f));
            make.updateLayout();
        }
        make.setTouchable(true);
        BulletinFactory.of(make, this.resourcesProvider).createSimpleBulletin(R.raw.fire_on, premiumText(LocaleController.formatPluralString("StoryPeriodPremium", i2, new Object[0])), 3).show(true);
    }

    public void showVideoTimer(final boolean z, boolean z2) {
        if (this.videoTimerShown == z) {
            return;
        }
        this.videoTimerShown = z;
        if (z2) {
            this.videoTimerView.animate().alpha(z ? 1.0f : 0.0f).setDuration(350L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.this.lambda$showVideoTimer$40(z);
                }
            }).start();
            return;
        }
        this.videoTimerView.clearAnimation();
        this.videoTimerView.setAlpha(z ? 1.0f : 0.0f);
        if (z) {
            return;
        }
        this.videoTimerView.setRecording(false, false);
    }

    public void showZoomControls(boolean z, boolean z2) {
        if ((this.zoomControlView.getTag() != null && z) || (this.zoomControlView.getTag() == null && !z)) {
            if (z) {
                Runnable runnable = this.zoomControlHideRunnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                Runnable runnable2 = new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.this.lambda$showZoomControls$41();
                    }
                };
                this.zoomControlHideRunnable = runnable2;
                AndroidUtilities.runOnUIThread(runnable2, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.zoomControlAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.zoomControlView.setTag(z ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.zoomControlAnimation = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z) {
            this.zoomControlView.setVisibility(0);
        }
        this.zoomControlAnimation.playTogether(ObjectAnimator.ofFloat(this.zoomControlView, (Property<ZoomControlView, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.zoomControlAnimation.addListener(new AnimatorListenerAdapter() {
            final boolean val$show;

            AnonymousClass14(boolean z3) {
                r2 = z3;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (!r2) {
                    StoryRecorder.this.zoomControlView.setVisibility(8);
                }
                StoryRecorder.this.zoomControlAnimation = null;
            }
        });
        this.zoomControlAnimation.start();
        if (z3) {
            Runnable runnable3 = new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.this.lambda$showZoomControls$42();
                }
            };
            this.zoomControlHideRunnable = runnable3;
            AndroidUtilities.runOnUIThread(runnable3, 2000L);
        }
    }

    private void upload(final boolean z) {
        if (this.preparingUpload) {
            return;
        }
        this.preparingUpload = true;
        applyPaintInBackground(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.lambda$upload$36(z);
            }
        });
    }

    private void uploadInternal(final boolean z) {
        if (this.outputEntry == null) {
            close(true);
            return;
        }
        destroyPhotoFilterView();
        prepareThumb(this.outputEntry, false);
        CharSequence[] charSequenceArr = {this.captionEdit.getText()};
        ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(this.currentAccount).storyEntitiesAllowed() ? MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true) : new ArrayList<>();
        ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(this.currentAccount).storyEntitiesAllowed() ? MediaDataController.getInstance(this.currentAccount).getEntities(new CharSequence[]{this.outputEntry.caption}, true) : new ArrayList<>();
        StoryEntry storyEntry = this.outputEntry;
        storyEntry.editedCaption = (TextUtils.equals(storyEntry.caption, charSequenceArr[0]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
        this.outputEntry.caption = new SpannableString(this.captionEdit.getText());
        MessagesController.getInstance(this.currentAccount).getStoriesController().uploadStory(this.outputEntry, z);
        StoryEntry storyEntry2 = this.outputEntry;
        if (storyEntry2.isDraft && !storyEntry2.isEdit) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().getDraftsController().delete(this.outputEntry);
        }
        this.outputEntry.cancelCheckStickers();
        final long j = UserConfig.getInstance(this.currentAccount).clientUserId;
        TLRPC.InputPeer inputPeer = this.outputEntry.peer;
        if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
            j = DialogObject.getPeerDialogId(inputPeer);
        }
        this.outputEntry = null;
        this.wasSend = true;
        this.wasSendPeer = j;
        this.forceBackgroundVisible = true;
        checkBackgroundVisibility();
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.lambda$uploadInternal$38(z, j);
            }
        };
        ClosingViewProvider closingViewProvider = this.closingSourceProvider;
        if (closingViewProvider != null) {
            closingViewProvider.preLayout(j, runnable);
        } else {
            runnable.run();
        }
        MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", 2).apply();
    }

    public boolean useDisplayFlashlight() {
        DualCameraView dualCameraView;
        if ((this.takingPhoto || this.takingVideo) && (dualCameraView = this.cameraView) != null && dualCameraView.isFrontface()) {
            int i = this.frontfaceFlashMode;
            if (i == 2) {
                return true;
            }
            if (i == 1 && this.isDark) {
                return true;
            }
        }
        return false;
    }

    public void addNotificationObservers() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesLimitUpdate);
    }

    public StoryRecorder canChangePeer(boolean z) {
        this.canChangePeer = z;
        return this;
    }

    public void close(final boolean z) {
        PreviewView previewView;
        if (this.isShown) {
            StoryPrivacyBottomSheet storyPrivacyBottomSheet = this.privacySheet;
            if (storyPrivacyBottomSheet != null) {
                storyPrivacyBottomSheet.dismiss();
                this.privacySheet = null;
            }
            StoryEntry storyEntry = this.outputEntry;
            if (storyEntry != null && !storyEntry.isEditSaved) {
                if ((this.wasSend && storyEntry.isEdit) || storyEntry.draftId != 0) {
                    storyEntry.editedMedia = false;
                }
                storyEntry.destroy(false);
            }
            this.outputEntry = null;
            Utilities.Callback4 callback4 = this.onClosePrepareListener;
            if (callback4 != null && (previewView = this.previewView) != null) {
                if (this.prepareClosing) {
                    return;
                }
                this.prepareClosing = true;
                callback4.run(Long.valueOf(previewView.release()), new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.this.lambda$close$2(z);
                    }
                }, Boolean.valueOf(this.wasSend), Long.valueOf(this.wasSendPeer));
                return;
            }
            PreviewView previewView2 = this.previewView;
            if (previewView2 != null && !z) {
                previewView2.set(null);
            }
            animateOpenTo(0.0f, z, new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.this.onCloseDone();
                }
            });
            int i = this.openType;
            if (i == 1 || i == 0) {
                this.windowView.setBackgroundColor(0);
                this.previewButtons.appear(false, true);
            }
            removeNotificationObservers();
        }
    }

    public StoryRecorder closeToWhenSent(ClosingViewProvider closingViewProvider) {
        this.closingSourceProvider = closingViewProvider;
        return this;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        StoriesController.StoryLimit checkStoryLimit;
        StoryEntry storyEntry;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        if (i == NotificationCenter.albumsDidLoad) {
            RecordControl recordControl = this.recordControl;
            if (recordControl != null) {
                recordControl.updateGalleryImage();
            }
            if (this.lastGallerySelectedAlbum == null || MediaController.allMediaAlbums == null) {
                return;
            }
            for (int i3 = 0; i3 < MediaController.allMediaAlbums.size(); i3++) {
                MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i3);
                int i4 = albumEntry.bucketId;
                MediaController.AlbumEntry albumEntry2 = this.lastGallerySelectedAlbum;
                if (i4 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                    this.lastGallerySelectedAlbum = albumEntry;
                    return;
                }
            }
            return;
        }
        if (i == NotificationCenter.storiesDraftsUpdated) {
            RecordControl recordControl2 = this.recordControl;
            if (recordControl2 == null || this.showSavedDraftHint) {
                return;
            }
            recordControl2.updateGalleryImage();
            return;
        }
        if (i == NotificationCenter.storiesLimitUpdate) {
            int i5 = this.currentPage;
            if (i5 == 1) {
                PreviewButtons previewButtons = this.previewButtons;
                if (!this.videoError && !this.captionEdit.isCaptionOverLimit() && (!MessagesController.getInstance(this.currentAccount).getStoriesController().hasStoryLimit() || ((storyEntry = this.outputEntry) != null && (storyEntry.isEdit || storyEntry.botId != 0)))) {
                    z = true;
                }
                previewButtons.setShareEnabled(z);
                return;
            }
            if (i5 == 0 && (checkStoryLimit = MessagesController.getInstance(this.currentAccount).getStoriesController().checkStoryLimit()) != null && checkStoryLimit.active(this.currentAccount)) {
                StoryEntry storyEntry2 = this.outputEntry;
                if (storyEntry2 == null || storyEntry2.botId == 0) {
                    showLimitReachedSheet(checkStoryLimit, true);
                }
            }
        }
    }

    public Context getContext() {
        return this.activity;
    }

    public ThanosEffect getThanosEffect() {
        if (!ThanosEffect.supports()) {
            return null;
        }
        if (this.thanosEffect == null) {
            WindowView windowView = this.windowView;
            ThanosEffect thanosEffect = new ThanosEffect(getContext(), new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.this.lambda$getThanosEffect$75();
                }
            });
            this.thanosEffect = thanosEffect;
            windowView.addView(thanosEffect);
        }
        return this.thanosEffect;
    }

    public ImageView getThemeButton() {
        if (this.themeButton == null) {
            int i = R.raw.sun_outline;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i, "" + i, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.themeButtonDrawable = rLottieDrawable;
            rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
            StoryEntry storyEntry = this.outputEntry;
            if (storyEntry == null || !storyEntry.isDark) {
                this.themeButtonDrawable.setCustomEndFrame(0);
                this.themeButtonDrawable.setCurrentFrame(0);
            } else {
                this.themeButtonDrawable.setCurrentFrame(35);
                this.themeButtonDrawable.setCustomEndFrame(36);
            }
            this.themeButtonDrawable.beginApplyLayerColors();
            int color = Theme.getColor(Theme.key_chats_menuName, this.resourcesProvider);
            this.themeButtonDrawable.setLayerColor("Sunny.**", color);
            this.themeButtonDrawable.setLayerColor("Path 6.**", color);
            this.themeButtonDrawable.setLayerColor("Path.**", color);
            this.themeButtonDrawable.setLayerColor("Path 5.**", color);
            this.themeButtonDrawable.commitApplyLayerColors();
            ImageView imageView = new ImageView(getContext());
            this.themeButton = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.themeButton.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.themeButton.setBackground(Theme.createSelectorDrawable(553648127));
            this.themeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    StoryRecorder.this.lambda$getThemeButton$76(view);
                }
            });
            this.themeButton.setVisibility(8);
            this.themeButton.setImageDrawable(this.themeButtonDrawable);
            this.themeButton.setAlpha(0.0f);
            this.actionBarButtons.addView(this.themeButton, 0, LayoutHelper.createLinear(46, 56, 53));
        }
        return this.themeButton;
    }

    public void invalidateBlur() {
        CaptionStory captionStory = this.captionEdit;
        if (captionStory != null) {
            captionStory.invalidateBlur();
        }
    }

    public void navigateTo(int i, boolean z) {
        StoryEntry storyEntry;
        StoryEntry storyEntry2;
        DualCameraView dualCameraView;
        StoryEntry storyEntry3;
        StoryEntry storyEntry4;
        StoryEntry storyEntry5;
        StoryEntry storyEntry6;
        DualCameraView dualCameraView2;
        int i2 = this.currentPage;
        if (i == i2) {
            return;
        }
        this.currentPage = i;
        AnimatorSet animatorSet = this.pageAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        onNavigateStart(i2, i);
        PreviewButtons previewButtons = this.previewButtons;
        if (previewButtons != null) {
            previewButtons.appear(i == 1, z);
        }
        showVideoTimer(i == 0 && this.isVideo, z);
        if (i != 1) {
            this.videoTimeView.show(false, z);
        }
        if (!z) {
            DualCameraView dualCameraView3 = this.cameraView;
            if (dualCameraView3 != null) {
                dualCameraView3.setAlpha(i == 0 ? 1.0f : 0.0f);
            }
            this.cameraViewThumb.setAlpha(i == 0 ? 1.0f : 0.0f);
            this.cameraViewThumb.setVisibility(i == 0 ? 0 : 8);
            this.previewView.setAlpha((i == 1 || i == 2) ? 1.0f : 0.0f);
            this.flashButton.setAlpha(i == 0 ? 1.0f : 0.0f);
            this.dualButton.setAlpha((i == 0 && (dualCameraView = this.cameraView) != null && dualCameraView.dualAvailable()) ? 1.0f : 0.0f);
            this.recordControl.setAlpha(i == 0 ? 1.0f : 0.0f);
            this.recordControl.setTranslationY(i == 0 ? 0.0f : AndroidUtilities.dp(16.0f));
            this.modeSwitcherView.setAlpha(i == 0 ? 1.0f : 0.0f);
            this.modeSwitcherView.setTranslationY(i == 0 ? 0.0f : AndroidUtilities.dp(16.0f));
            this.backButton.setVisibility(0);
            this.backButton.setAlpha(1.0f);
            this.hintTextView.setAlpha((i == 0 && this.animatedRecording) ? 1.0f : 0.0f);
            this.captionContainer.setAlpha((i == 1 || i == 2) ? 1.0f : 0.0f);
            this.captionContainer.setTranslationY((i == 1 || i == 2) ? 0.0f : AndroidUtilities.dp(12.0f));
            this.captionEdit.setAlpha(i == 2 ? 0.0f : 1.0f);
            this.muteButton.setAlpha((i == 1 && this.isVideo) ? 1.0f : 0.0f);
            this.playButton.setAlpha((i != 1 || (!this.isVideo && ((storyEntry2 = this.outputEntry) == null || TextUtils.isEmpty(storyEntry2.audioPath)))) ? 0.0f : 1.0f);
            this.downloadButton.setAlpha(i == 1 ? 1.0f : 0.0f);
            ImageView imageView = this.themeButton;
            if (imageView != null) {
                imageView.setAlpha((i == 1 && (storyEntry = this.outputEntry) != null && storyEntry.isRepostMessage) ? 1.0f : 0.0f);
            }
            this.timelineView.setAlpha(i == 1 ? 1.0f : 0.0f);
            this.coverTimelineView.setAlpha(i == 2 ? 1.0f : 0.0f);
            this.titleTextView.setAlpha((i == 1 || i == 2) ? 1.0f : 0.0f);
            this.coverButton.setAlpha(i == 2 ? 1.0f : 0.0f);
            onNavigateEnd(i2, i);
            return;
        }
        this.pageAnimator = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        DualCameraView dualCameraView4 = this.cameraView;
        if (dualCameraView4 != null) {
            arrayList.add(ObjectAnimator.ofFloat(dualCameraView4, (Property<DualCameraView, Float>) View.ALPHA, i == 0 ? 1.0f : 0.0f));
        }
        this.cameraViewThumb.setVisibility(0);
        ImageView imageView2 = this.cameraViewThumb;
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, i == 0 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.previewView, (Property<PreviewView, Float>) property, (i == 1 || i == 2) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.recordControl, (Property<RecordControl, Float>) property, i == 0 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.flashButton, (Property<ToggleButton2, Float>) property, i == 0 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.dualButton, (Property<ToggleButton, Float>) property, (i == 0 && (dualCameraView2 = this.cameraView) != null && dualCameraView2.dualAvailable()) ? 1.0f : 0.0f));
        RecordControl recordControl = this.recordControl;
        Property property2 = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(recordControl, (Property<RecordControl, Float>) property2, i == 0 ? 0.0f : AndroidUtilities.dp(24.0f)));
        arrayList.add(ObjectAnimator.ofFloat(this.modeSwitcherView, (Property<PhotoVideoSwitcherView, Float>) property, i == 0 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.modeSwitcherView, (Property<PhotoVideoSwitcherView, Float>) property2, i == 0 ? 0.0f : AndroidUtilities.dp(24.0f)));
        this.backButton.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(this.backButton, (Property<FlashViews.ImageViewInvertable, Float>) property, 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.hintTextView, (Property<HintTextView, Float>) property, (i == 0 && this.animatedRecording) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.captionContainer, (Property<FrameLayout, Float>) property, ((i == 1 && ((storyEntry6 = this.outputEntry) == null || storyEntry6.botId == 0)) || i == 2) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.captionContainer, (Property<FrameLayout, Float>) property2, ((i == 1 && ((storyEntry5 = this.outputEntry) == null || storyEntry5.botId == 0)) || i == 2) ? 0.0f : AndroidUtilities.dp(12.0f)));
        arrayList.add(ObjectAnimator.ofFloat(this.captionEdit, (Property<CaptionStory, Float>) property, i == 2 ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.titleTextView, (Property<SimpleTextView, Float>) property, (i == 1 || i == 2) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.coverButton, (Property<ButtonWithCounterView, Float>) property, i == 2 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.timelineView, (Property<TimelineView, Float>) property, i == 1 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.coverTimelineView, (Property<TimelineView, Float>) property, i == 2 ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.muteButton, (Property<RLottieImageView, Float>) property, (i == 1 && this.isVideo) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.playButton, (Property<PlayPauseButton, Float>) property, (i != 1 || (!this.isVideo && ((storyEntry4 = this.outputEntry) == null || TextUtils.isEmpty(storyEntry4.audioPath)))) ? 0.0f : 1.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.downloadButton, (Property<DownloadButton, Float>) property, i == 1 ? 1.0f : 0.0f));
        ImageView imageView3 = this.themeButton;
        if (imageView3 != null) {
            arrayList.add(ObjectAnimator.ofFloat(imageView3, (Property<ImageView, Float>) property, (i == 1 && (storyEntry3 = this.outputEntry) != null && storyEntry3.isRepostMessage) ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.zoomControlView, (Property<ZoomControlView, Float>) property, 0.0f));
        this.pageAnimator.playTogether(arrayList);
        this.pageAnimator.addListener(new AnimatorListenerAdapter() {
            final int val$oldPage;
            final int val$page;

            AnonymousClass16(int i22, int i3) {
                r2 = i22;
                r3 = i3;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                StoryRecorder.this.onNavigateEnd(r2, r3);
            }
        });
        this.pageAnimator.setDuration(460L);
        this.pageAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.pageAnimator.start();
    }

    public void navigateToPreviewWithPlayerAwait(Runnable runnable, long j) {
        navigateToPreviewWithPlayerAwait(runnable, j, 800L);
    }

    public void navigateToPreviewWithPlayerAwait(final Runnable runnable, long j, long j2) {
        if (this.awaitingPlayer || this.outputEntry == null) {
            return;
        }
        Runnable runnable2 = this.afterPlayerAwait;
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
        this.previewAlreadySet = true;
        this.awaitingPlayer = true;
        this.afterPlayerAwait = new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.lambda$navigateToPreviewWithPlayerAwait$43(runnable);
            }
        };
        this.previewView.setAlpha(0.0f);
        this.previewView.setVisibility(0);
        this.previewView.set(this.outputEntry, this.afterPlayerAwait, j);
        this.previewView.setupAudio(this.outputEntry, false);
        AndroidUtilities.runOnUIThread(this.afterPlayerAwait, j2);
    }

    public boolean onBackPressed() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.StoryRecorder.onBackPressed():boolean");
    }

    public void open(SourceView sourceView) {
        open(sourceView, true);
    }

    public void open(SourceView sourceView, boolean z) {
        StoriesController.StoryLimit checkStoryLimit;
        WindowView windowView;
        if (this.isShown) {
            return;
        }
        int i = 0;
        this.isReposting = false;
        this.prepareClosing = false;
        this.forceBackgroundVisible = false;
        this.videoTextureHolder.active = false;
        if (this.windowManager != null && (windowView = this.windowView) != null && windowView.getParent() == null) {
            AndroidUtilities.setPreferredMaxRefreshRate(this.windowManager, this.windowView, this.windowLayoutParams);
            this.windowManager.addView(this.windowView, this.windowLayoutParams);
        }
        this.cameraViewThumb.setImageDrawable(getCameraThumb());
        if (this.botId == 0 && (checkStoryLimit = MessagesController.getInstance(this.currentAccount).getStoriesController().checkStoryLimit()) != null && checkStoryLimit.active(this.currentAccount)) {
            showLimitReachedSheet(checkStoryLimit, true);
        }
        navigateTo(0, false);
        switchToEditMode(-1, false);
        if (sourceView != null) {
            this.fromSourceView = sourceView;
            this.openType = sourceView.type;
            this.fromRect.set(sourceView.screenRect);
            this.fromRounding = sourceView.rounding;
            this.fromSourceView.hide();
        } else {
            this.openType = 0;
            this.fromRect.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.fromRounding = AndroidUtilities.dp(8.0f);
        }
        this.containerView.updateBackground();
        FrameLayout frameLayout = this.previewContainer;
        int i2 = this.openType;
        if (i2 != 1 && i2 != 0) {
            i = -14737633;
        }
        frameLayout.setBackgroundColor(i);
        this.containerView.setTranslationX(0.0f);
        this.containerView.setTranslationY(0.0f);
        this.containerView.setTranslationY2(0.0f);
        this.containerView.setScaleX(1.0f);
        this.containerView.setScaleY(1.0f);
        this.dismissProgress = 0.0f;
        AndroidUtilities.lockOrientation(this.activity, 1);
        animateOpenTo(1.0f, z, new StoryRecorder$$ExternalSyntheticLambda6(this));
        addNotificationObservers();
        this.botId = 0L;
        this.botLang = "";
        this.botEdit = null;
    }

    public void openBot(long j, String str, SourceView sourceView) {
        this.botId = j;
        this.botLang = str;
        this.botEdit = null;
        open(sourceView, true);
        this.botId = j;
        this.botLang = str;
    }

    public void openBotEntry(long j, String str, StoryEntry storyEntry, SourceView sourceView) {
        WindowView windowView;
        if (this.isShown || storyEntry == null) {
            return;
        }
        this.botId = j;
        this.botLang = str;
        this.isReposting = false;
        this.prepareClosing = false;
        this.forceBackgroundVisible = false;
        if (this.windowManager != null && (windowView = this.windowView) != null && windowView.getParent() == null) {
            AndroidUtilities.setPreferredMaxRefreshRate(this.windowManager, this.windowView, this.windowLayoutParams);
            this.windowManager.addView(this.windowView, this.windowLayoutParams);
        }
        this.outputEntry = storyEntry;
        storyEntry.botId = j;
        storyEntry.botLang = str;
        this.isVideo = storyEntry.isVideo;
        this.videoTextureHolder.active = false;
        if (sourceView != null) {
            this.fromSourceView = sourceView;
            this.openType = sourceView.type;
            this.fromRect.set(sourceView.screenRect);
            this.fromRounding = sourceView.rounding;
            this.fromSourceView.hide();
        } else {
            this.openType = 0;
            this.fromRect.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.fromRounding = AndroidUtilities.dp(8.0f);
        }
        this.containerView.updateBackground();
        FrameLayout frameLayout = this.previewContainer;
        int i = this.openType;
        frameLayout.setBackgroundColor((i == 1 || i == 0) ? 0 : -14737633);
        this.containerView.setTranslationX(0.0f);
        this.containerView.setTranslationY(0.0f);
        this.containerView.setTranslationY2(0.0f);
        this.containerView.setScaleX(1.0f);
        this.containerView.setScaleY(1.0f);
        this.dismissProgress = 0.0f;
        AndroidUtilities.lockOrientation(this.activity, 1);
        StoryEntry storyEntry2 = this.outputEntry;
        if (storyEntry2 != null) {
            this.captionEdit.setText(storyEntry2.caption);
        }
        navigateTo(1, false);
        switchToEditMode(-1, false);
        this.previewButtons.appear(false, false);
        this.previewButtons.appear(true, true);
        animateOpenTo(1.0f, true, new StoryRecorder$$ExternalSyntheticLambda6(this));
        addNotificationObservers();
    }

    public void openEdit(SourceView sourceView, StoryEntry storyEntry, long j, final boolean z) {
        WindowView windowView;
        if (this.isShown) {
            return;
        }
        this.isReposting = false;
        this.prepareClosing = false;
        this.forceBackgroundVisible = false;
        if (this.windowManager != null && (windowView = this.windowView) != null && windowView.getParent() == null) {
            AndroidUtilities.setPreferredMaxRefreshRate(this.windowManager, this.windowView, this.windowLayoutParams);
            this.windowManager.addView(this.windowView, this.windowLayoutParams);
        }
        this.outputEntry = storyEntry;
        this.isVideo = storyEntry != null && storyEntry.isVideo;
        this.videoTextureHolder.active = false;
        if (sourceView != null) {
            this.fromSourceView = sourceView;
            this.openType = sourceView.type;
            this.fromRect.set(sourceView.screenRect);
            this.fromRounding = sourceView.rounding;
            this.fromSourceView.hide();
        } else {
            this.openType = 0;
            this.fromRect.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.fromRounding = AndroidUtilities.dp(8.0f);
        }
        this.containerView.updateBackground();
        FrameLayout frameLayout = this.previewContainer;
        int i = this.openType;
        frameLayout.setBackgroundColor((i == 1 || i == 0) ? 0 : -14737633);
        this.containerView.setTranslationX(0.0f);
        this.containerView.setTranslationY(0.0f);
        this.containerView.setTranslationY2(0.0f);
        this.containerView.setScaleX(1.0f);
        this.containerView.setScaleY(1.0f);
        this.dismissProgress = 0.0f;
        AndroidUtilities.lockOrientation(this.activity, 1);
        StoryEntry storyEntry2 = this.outputEntry;
        if (storyEntry2 != null) {
            this.captionEdit.setText(storyEntry2.caption);
        }
        navigateToPreviewWithPlayerAwait(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.lambda$openEdit$0(z);
            }
        }, j);
        navigateTo(this.outputEntry.isEditingCover ? 2 : 1, false);
        switchToEditMode(-1, false);
        this.previewButtons.appear(false, false);
        addNotificationObservers();
        this.botId = 0L;
        this.botLang = "";
        this.botEdit = null;
    }

    public void openForward(SourceView sourceView, StoryEntry storyEntry, long j, final boolean z) {
        WindowView windowView;
        if (this.isShown) {
            return;
        }
        this.isReposting = false;
        this.prepareClosing = false;
        this.forceBackgroundVisible = false;
        if (this.windowManager != null && (windowView = this.windowView) != null && windowView.getParent() == null) {
            AndroidUtilities.setPreferredMaxRefreshRate(this.windowManager, this.windowView, this.windowLayoutParams);
            this.windowManager.addView(this.windowView, this.windowLayoutParams);
        }
        this.outputEntry = storyEntry;
        StoryPrivacySelector.applySaved(this.currentAccount, storyEntry);
        StoryEntry storyEntry2 = this.outputEntry;
        this.isVideo = storyEntry2 != null && storyEntry2.isVideo;
        this.videoTextureHolder.active = false;
        if (sourceView != null) {
            this.fromSourceView = sourceView;
            this.openType = sourceView.type;
            this.fromRect.set(sourceView.screenRect);
            this.fromRounding = sourceView.rounding;
            this.fromSourceView.hide();
        } else {
            this.openType = 0;
            this.fromRect.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.fromRounding = AndroidUtilities.dp(8.0f);
        }
        this.containerView.updateBackground();
        FrameLayout frameLayout = this.previewContainer;
        int i = this.openType;
        frameLayout.setBackgroundColor((i == 1 || i == 0) ? 0 : -14737633);
        this.containerView.setTranslationX(0.0f);
        this.containerView.setTranslationY(0.0f);
        this.containerView.setTranslationY2(0.0f);
        this.containerView.setScaleX(1.0f);
        this.containerView.setScaleY(1.0f);
        this.dismissProgress = 0.0f;
        AndroidUtilities.lockOrientation(this.activity, 1);
        StoryEntry storyEntry3 = this.outputEntry;
        if (storyEntry3 != null) {
            this.captionEdit.setText(storyEntry3.caption);
        }
        navigateToPreviewWithPlayerAwait(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.lambda$openForward$1(z);
            }
        }, j);
        this.previewButtons.appear(true, false);
        navigateTo(1, false);
        switchToEditMode(-1, false);
        addNotificationObservers();
        this.botId = 0L;
        this.botLang = "";
        this.botEdit = null;
    }

    public void openRepost(SourceView sourceView, StoryEntry storyEntry) {
        StoriesController.StoryLimit checkStoryLimit;
        WindowView windowView;
        if (this.isShown) {
            return;
        }
        this.isReposting = true;
        this.prepareClosing = false;
        this.forceBackgroundVisible = false;
        if (this.windowManager != null && (windowView = this.windowView) != null && windowView.getParent() == null) {
            AndroidUtilities.setPreferredMaxRefreshRate(this.windowManager, this.windowView, this.windowLayoutParams);
            this.windowManager.addView(this.windowView, this.windowLayoutParams);
        }
        this.outputEntry = storyEntry;
        StoryPrivacySelector.applySaved(this.currentAccount, storyEntry);
        StoryEntry storyEntry2 = this.outputEntry;
        boolean z = storyEntry2 != null && storyEntry2.isVideo;
        this.isVideo = z;
        this.videoTextureHolder.active = storyEntry2 != null && storyEntry2.isRepostMessage && z;
        if (this.botId == 0 && (checkStoryLimit = MessagesController.getInstance(this.currentAccount).getStoriesController().checkStoryLimit()) != null && checkStoryLimit.active(this.currentAccount)) {
            showLimitReachedSheet(checkStoryLimit, true);
        }
        if (sourceView != null) {
            this.fromSourceView = sourceView;
            this.openType = sourceView.type;
            this.fromRect.set(sourceView.screenRect);
            this.fromRounding = sourceView.rounding;
            this.fromSourceView.hide();
        } else {
            this.openType = 0;
            this.fromRect.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.fromRounding = AndroidUtilities.dp(8.0f);
        }
        this.containerView.updateBackground();
        FrameLayout frameLayout = this.previewContainer;
        int i = this.openType;
        frameLayout.setBackgroundColor((i == 1 || i == 0) ? 0 : -14737633);
        this.containerView.setTranslationX(0.0f);
        this.containerView.setTranslationY(0.0f);
        this.containerView.setTranslationY2(0.0f);
        this.containerView.setScaleX(1.0f);
        this.containerView.setScaleY(1.0f);
        this.dismissProgress = 0.0f;
        AndroidUtilities.lockOrientation(this.activity, 1);
        StoryEntry storyEntry3 = this.outputEntry;
        if (storyEntry3 != null) {
            this.captionEdit.setText(storyEntry3.caption);
        }
        this.previewButtons.appear(true, false);
        navigateTo(1, false);
        switchToEditMode(-1, false);
        animateOpenTo(1.0f, true, new StoryRecorder$$ExternalSyntheticLambda6(this));
        addNotificationObservers();
        this.botId = 0L;
        this.botLang = "";
        this.botEdit = null;
    }

    public void removeNotificationObservers() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesLimitUpdate);
    }

    public void replaceSourceView(SourceView sourceView) {
        float dp;
        int i = 0;
        if (sourceView != null) {
            this.fromSourceView = sourceView;
            this.openType = sourceView.type;
            this.fromRect.set(sourceView.screenRect);
            dp = sourceView.rounding;
        } else {
            this.fromSourceView = null;
            this.openType = 0;
            this.fromRect.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            dp = AndroidUtilities.dp(8.0f);
        }
        this.fromRounding = dp;
        FrameLayout frameLayout = this.previewContainer;
        int i2 = this.openType;
        if (i2 != 1 && i2 != 0) {
            i = -14737633;
        }
        frameLayout.setBackgroundColor(i);
    }

    public StoryRecorder selectedPeerId(long j) {
        this.selectedDialogId = j;
        return this;
    }

    public void setIconMuted(boolean z, boolean z2) {
        if (this.muteButtonDrawable == null) {
            RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.media_mute_unmute, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.muteButtonDrawable = rLottieDrawable;
            rLottieDrawable.multiplySpeed(1.5f);
        }
        this.muteButton.setAnimation(this.muteButtonDrawable);
        if (!z2) {
            this.muteButtonDrawable.setCurrentFrame(z ? 20 : 0, false);
            return;
        }
        if (z) {
            if (this.muteButtonDrawable.getCurrentFrame() > 20) {
                this.muteButtonDrawable.setCurrentFrame(0, false);
            }
            this.muteButtonDrawable.setCustomEndFrame(20);
        } else if (this.muteButtonDrawable.getCurrentFrame() == 0 || this.muteButtonDrawable.getCurrentFrame() >= 43) {
            return;
        } else {
            this.muteButtonDrawable.setCustomEndFrame(43);
        }
        this.muteButtonDrawable.start();
    }

    public void setOnFullyOpenListener(Runnable runnable) {
        this.onFullyOpenListener = runnable;
    }

    public void setOnPrepareCloseListener(Utilities.Callback4 callback4) {
        this.onClosePrepareListener = callback4;
    }

    public void switchToEditMode(int r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.StoryRecorder.switchToEditMode(int, boolean):void");
    }

    public void toggleTheme() {
        if (this.outputEntry == null || this.changeDayNightView != null || this.themeButton == null) {
            return;
        }
        ValueAnimator valueAnimator = this.changeDayNightViewAnimator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            boolean z = this.outputEntry.isDark;
            Bitmap createBitmap = Bitmap.createBitmap(this.windowView.getWidth(), this.windowView.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            this.themeButton.setAlpha(0.0f);
            PreviewView previewView = this.previewView;
            if (previewView != null) {
                previewView.drawForThemeToggle = true;
            }
            PaintView paintView = this.paintView;
            if (paintView != null) {
                paintView.drawForThemeToggle = true;
            }
            this.windowView.draw(canvas);
            PreviewView previewView2 = this.previewView;
            if (previewView2 != null) {
                previewView2.drawForThemeToggle = false;
            }
            PaintView paintView2 = this.paintView;
            if (paintView2 != null) {
                paintView2.drawForThemeToggle = false;
            }
            this.themeButton.setAlpha(1.0f);
            Paint paint = new Paint(1);
            paint.setColor(-16777216);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            Paint paint2 = new Paint(1);
            paint2.setFilterBitmap(true);
            int[] iArr = new int[2];
            this.themeButton.getLocationInWindow(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
            AnonymousClass29 anonymousClass29 = new View(getContext()) {
                final Bitmap val$bitmap;
                final Canvas val$bitmapCanvas;
                final Paint val$bitmapPaint;
                final float val$cx;
                final float val$cy;
                final boolean val$isDark;
                final float val$r;
                final float val$x;
                final Paint val$xRefPaint;
                final float val$y;

                AnonymousClass29(Context context, boolean z2, Canvas canvas2, float f3, float f22, float max2, Paint paint3, Bitmap createBitmap2, Paint paint22, float f4, float f23) {
                    super(context);
                    r3 = z2;
                    r4 = canvas2;
                    r5 = f3;
                    r6 = f22;
                    r7 = max2;
                    r8 = paint3;
                    r9 = createBitmap2;
                    r10 = paint22;
                    r11 = f4;
                    r12 = f23;
                }

                @Override
                protected void onDraw(Canvas canvas2) {
                    super.onDraw(canvas2);
                    if (r3) {
                        if (StoryRecorder.this.changeDayNightViewProgress > 0.0f) {
                            r4.drawCircle(r5, r6, r7 * StoryRecorder.this.changeDayNightViewProgress, r8);
                        }
                        canvas2.drawBitmap(r9, 0.0f, 0.0f, r10);
                    } else {
                        canvas2.drawCircle(r5, r6, r7 * (1.0f - StoryRecorder.this.changeDayNightViewProgress), r10);
                    }
                    canvas2.save();
                    canvas2.translate(r11, r12);
                    StoryRecorder.this.themeButton.draw(canvas2);
                    canvas2.restore();
                }
            };
            this.changeDayNightView = anonymousClass29;
            anonymousClass29.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean lambda$toggleTheme$77;
                    lambda$toggleTheme$77 = StoryRecorder.lambda$toggleTheme$77(view, motionEvent);
                    return lambda$toggleTheme$77;
                }
            });
            this.changeDayNightViewProgress = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.changeDayNightViewAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                boolean changedNavigationBarColor = false;

                AnonymousClass30() {
                }

                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    StoryRecorder.this.changeDayNightViewProgress = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    if (StoryRecorder.this.changeDayNightView != null) {
                        StoryRecorder.this.changeDayNightView.invalidate();
                    }
                    if (this.changedNavigationBarColor || StoryRecorder.this.changeDayNightViewProgress <= 0.5f) {
                        return;
                    }
                    this.changedNavigationBarColor = true;
                }
            });
            this.changeDayNightViewAnimator.addListener(new AnimatorListenerAdapter() {
                AnonymousClass31() {
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    if (StoryRecorder.this.changeDayNightView != null) {
                        if (StoryRecorder.this.changeDayNightView.getParent() != null) {
                            ((ViewGroup) StoryRecorder.this.changeDayNightView.getParent()).removeView(StoryRecorder.this.changeDayNightView);
                        }
                        StoryRecorder.this.changeDayNightView = null;
                    }
                    StoryRecorder.this.changeDayNightViewAnimator = null;
                    super.onAnimationEnd(animator);
                }
            });
            this.changeDayNightViewAnimator.setStartDelay(80L);
            this.changeDayNightViewAnimator.setDuration(z2 ? 320L : 450L);
            this.changeDayNightViewAnimator.setInterpolator(z2 ? CubicBezierInterpolator.EASE_IN : CubicBezierInterpolator.EASE_OUT_QUINT);
            this.changeDayNightViewAnimator.start();
            this.windowView.addView(this.changeDayNightView, new ViewGroup.LayoutParams(-1, -1));
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.this.lambda$toggleTheme$78();
                }
            });
        }
    }

    public void updateThemeButtonDrawable(boolean z) {
        RLottieDrawable rLottieDrawable = this.themeButtonDrawable;
        if (rLottieDrawable != null) {
            int i = 0;
            if (!z) {
                StoryEntry storyEntry = this.outputEntry;
                int framesCount = (storyEntry == null || !storyEntry.isDark) ? 0 : rLottieDrawable.getFramesCount() - 1;
                this.themeButtonDrawable.setCurrentFrame(framesCount, false, true);
                this.themeButtonDrawable.setCustomEndFrame(framesCount);
                ImageView imageView = this.themeButton;
                if (imageView != null) {
                    imageView.invalidate();
                    return;
                }
                return;
            }
            StoryEntry storyEntry2 = this.outputEntry;
            if (storyEntry2 != null && storyEntry2.isDark) {
                i = rLottieDrawable.getFramesCount();
            }
            rLottieDrawable.setCustomEndFrame(i);
            RLottieDrawable rLottieDrawable2 = this.themeButtonDrawable;
            if (rLottieDrawable2 != null) {
                rLottieDrawable2.start();
            }
        }
    }
}
