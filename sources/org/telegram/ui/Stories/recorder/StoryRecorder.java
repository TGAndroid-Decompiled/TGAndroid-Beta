package org.telegram.ui.Stories.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
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
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$InputDocument;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$TL_inputPeerSelf;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;
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
import org.telegram.ui.Components.PhotoFilterBlurControl;
import org.telegram.ui.Components.PhotoFilterCurvesControl;
import org.telegram.ui.Components.PhotoFilterView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.URLSpanUserMention;
import org.telegram.ui.Components.VideoEditTextureView;
import org.telegram.ui.Components.ZoomControlView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.StoryWaveEffectView;
import org.telegram.ui.Stories.recorder.DownloadButton;
import org.telegram.ui.Stories.recorder.PreviewButtons;
import org.telegram.ui.Stories.recorder.RecordControl;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.WrappedResourceProvider;
public class StoryRecorder implements NotificationCenter.NotificationCenterDelegate {
    private static StoryRecorder instance;
    private FrameLayout actionBarContainer;
    private Activity activity;
    private Runnable afterPlayerAwait;
    private boolean animatedRecording;
    private Runnable audioGrantedCallback;
    private ImageView backButton;
    private BlurringShader.BlurManager blurManager;
    private HintView2 cameraHint;
    private DualCameraView cameraView;
    private ImageView cameraViewThumb;
    private float cameraZoom;
    private FrameLayout captionContainer;
    private CaptionStory captionEdit;
    private ClosingViewProvider closingSourceProvider;
    private ContainerView containerView;
    private ValueAnimator containerViewBackAnimator;
    private FrameLayout controlContainer;
    private int currentAccount;
    private float dismissProgress;
    private DownloadButton downloadButton;
    private DraftSavedHint draftSavedHint;
    private ToggleButton dualButton;
    private HintView2 dualHint;
    private AnimatorSet editModeAnimator;
    private ImageView flashButton;
    private int flashButtonResId;
    private boolean forceBackgroundVisible;
    private boolean fromGallery;
    private float fromRounding;
    private SourceView fromSourceView;
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
    private Utilities.Callback3<Long, Runnable, Boolean> onClosePrepareListener;
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
    private boolean showSavedDraftHint;
    private boolean shownLimitReached;
    private TimelineView timelineView;
    private SimpleTextView titleTextView;
    private TrashView trash;
    private int underControls;
    private boolean underStatusBar;
    private boolean videoError;
    private VideoTimeView videoTimeView;
    private FrameLayout videoTimelineContainerView;
    private VideoTimerView videoTimerView;
    private boolean wasGalleryOpen;
    private boolean wasSend;
    private StoryWaveEffectView waveEffect;
    private Runnable whenOpenDone;
    private final WindowManager.LayoutParams windowLayoutParams;
    WindowManager windowManager;
    private WindowView windowView;
    private AnimatorSet zoomControlAnimation;
    private Runnable zoomControlHideRunnable;
    private ZoomControlView zoomControlView;
    private final Theme.ResourcesProvider resourcesProvider = new DarkThemeResourceProvider();
    private RectF fromRect = new RectF();
    private AnimationNotificationsLocker notificationsLocker = new AnimationNotificationsLocker();
    private int currentPage = 0;
    private int currentEditMode = -1;
    private boolean isVideo = false;
    private boolean takingPhoto = false;
    private boolean takingVideo = false;
    private boolean stoppingTakingVideo = false;
    private boolean awaitingPlayer = false;
    private int shiftDp = -3;
    private boolean preparingUpload = false;
    private final RecordControl.Delegate recordControlDelegate = new AnonymousClass10();
    private boolean videoTimerShown = true;
    private boolean applyContainerViewTranslation2 = true;

    public interface ClosingViewProvider {
        SourceView getView(long j);

        void preLayout(long j, Runnable runnable);
    }

    public interface Touchable {
        boolean onTouch(MotionEvent motionEvent);
    }

    static float access$3216(StoryRecorder storyRecorder, float f) {
        float f2 = storyRecorder.cameraZoom + f;
        storyRecorder.cameraZoom = f2;
        return f2;
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

    public static void destroyInstance() {
        StoryRecorder storyRecorder = instance;
        if (storyRecorder != null) {
            storyRecorder.close(false);
        }
        instance = null;
    }

    public static boolean isVisible() {
        StoryRecorder storyRecorder = instance;
        return storyRecorder != null && storyRecorder.isShown;
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
            layoutParams.flags = 134283520 | Integer.MIN_VALUE;
        }
        layoutParams.softInputMode = 16;
        this.windowManager = (WindowManager) activity.getSystemService("window");
        initViews();
    }

    public static class SourceView {
        ImageReceiver backgroundImageReceiver;
        Paint backgroundPaint;
        Drawable iconDrawable;
        int iconSize;
        float rounding;
        View view;
        int type = 0;
        RectF screenRect = new RectF();

        protected void drawAbove(Canvas canvas, float f) {
        }

        protected void hide() {
            throw null;
        }

        protected void show() {
            throw null;
        }

        public static SourceView fromStoryViewer(final StoryViewer storyViewer) {
            if (storyViewer == null) {
                return null;
            }
            SourceView sourceView = new SourceView() {
                @Override
                protected void show() {
                    PeerStoriesView currentPeerView = storyViewer.getCurrentPeerView();
                    if (currentPeerView != null) {
                        currentPeerView.animateOut(false);
                    }
                    View view = this.view;
                    if (view != null) {
                        view.setTranslationX(0.0f);
                        this.view.setTranslationY(0.0f);
                    }
                }

                @Override
                protected void hide() {
                    PeerStoriesView currentPeerView = storyViewer.getCurrentPeerView();
                    if (currentPeerView != null) {
                        currentPeerView.animateOut(true);
                    }
                }
            };
            if (storyViewer.getStoryRect(sourceView.screenRect)) {
                sourceView.type = 1;
                sourceView.rounding = AndroidUtilities.dp(8.0f);
                PeerStoriesView currentPeerView = storyViewer.getCurrentPeerView();
                if (currentPeerView != null) {
                    sourceView.view = currentPeerView.storyContainer;
                }
                return sourceView;
            }
            return null;
        }

        public class AnonymousClass2 extends SourceView {
            final FrameLayout val$floatingButton;

            AnonymousClass2(FrameLayout frameLayout) {
                this.val$floatingButton = frameLayout;
            }

            @Override
            protected void show() {
                this.val$floatingButton.setVisibility(0);
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
        }

        public static SourceView fromFloatingButton(FrameLayout frameLayout) {
            if (frameLayout == null) {
                return null;
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(frameLayout);
            int[] iArr = new int[2];
            View childAt = frameLayout.getChildAt(0);
            childAt.getLocationOnScreen(iArr);
            anonymousClass2.screenRect.set(iArr[0], iArr[1], iArr[0] + childAt.getWidth(), iArr[1] + childAt.getHeight());
            Paint paint = new Paint(1);
            anonymousClass2.backgroundPaint = paint;
            paint.setColor(Theme.getColor(Theme.key_chats_actionBackground));
            anonymousClass2.iconDrawable = frameLayout.getContext().getResources().getDrawable(R.drawable.story_camera).mutate();
            anonymousClass2.iconSize = AndroidUtilities.dp(56.0f);
            anonymousClass2.rounding = Math.max(anonymousClass2.screenRect.width(), anonymousClass2.screenRect.height()) / 2.0f;
            return anonymousClass2;
        }

        public static SourceView fromStoryCell(DialogStoriesCell.StoryCell storyCell) {
            if (storyCell == null || storyCell.getRootView() == null) {
                return null;
            }
            float imageWidth = storyCell.avatarImage.getImageWidth();
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(storyCell, imageWidth / 2.0f);
            int[] iArr = new int[2];
            float[] fArr = new float[2];
            storyCell.getRootView().getLocationOnScreen(iArr);
            AndroidUtilities.getViewPositionInParent(storyCell, (ViewGroup) storyCell.getRootView(), fArr);
            float imageX = iArr[0] + fArr[0] + storyCell.avatarImage.getImageX();
            float imageY = iArr[1] + fArr[1] + storyCell.avatarImage.getImageY();
            anonymousClass3.screenRect.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
            anonymousClass3.backgroundImageReceiver = storyCell.avatarImage;
            anonymousClass3.rounding = Math.max(anonymousClass3.screenRect.width(), anonymousClass3.screenRect.height()) / 2.0f;
            return anonymousClass3;
        }

        public class AnonymousClass3 extends SourceView {
            final float val$radius;
            final DialogStoriesCell.StoryCell val$storyCell;

            AnonymousClass3(DialogStoriesCell.StoryCell storyCell, float f) {
                this.val$storyCell = storyCell;
                this.val$radius = f;
            }

            @Override
            protected void show() {
                DialogStoriesCell.StoryCell storyCell = this.val$storyCell;
                storyCell.drawAvatar = true;
                storyCell.invalidate();
            }

            @Override
            protected void hide() {
                final DialogStoriesCell.StoryCell storyCell = this.val$storyCell;
                storyCell.post(new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.SourceView.AnonymousClass3.lambda$hide$0(DialogStoriesCell.StoryCell.this);
                    }
                });
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
        }
    }

    public StoryRecorder closeToWhenSent(ClosingViewProvider closingViewProvider) {
        this.closingSourceProvider = closingViewProvider;
        return this;
    }

    public void open(SourceView sourceView) {
        open(sourceView, true);
    }

    public void open(SourceView sourceView, boolean z) {
        WindowView windowView;
        if (this.isShown) {
            return;
        }
        this.prepareClosing = false;
        this.forceBackgroundVisible = false;
        if (this.windowManager != null && (windowView = this.windowView) != null && windowView.getParent() == null) {
            this.windowManager.addView(this.windowView, this.windowLayoutParams);
        }
        this.cameraViewThumb.setImageDrawable(getCameraThumb());
        StoriesController.StoryLimit checkStoryLimit = MessagesController.getInstance(this.currentAccount).getStoriesController().checkStoryLimit();
        if (checkStoryLimit != null && checkStoryLimit.active(this.currentAccount)) {
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
        this.previewContainer.setBackgroundColor(this.openType != 1 ? -14737633 : 0);
        this.containerView.setTranslationX(0.0f);
        this.containerView.setTranslationY(0.0f);
        this.containerView.setTranslationY2(0.0f);
        this.containerView.setScaleX(1.0f);
        this.containerView.setScaleY(1.0f);
        this.dismissProgress = 0.0f;
        AndroidUtilities.lockOrientation(this.activity, 1);
        animateOpenTo(1.0f, z, new StoryRecorder$$ExternalSyntheticLambda34(this));
        addNotificationObservers();
    }

    public void openEdit(SourceView sourceView, StoryEntry storyEntry, long j, final boolean z) {
        WindowView windowView;
        if (this.isShown) {
            return;
        }
        this.prepareClosing = false;
        this.forceBackgroundVisible = false;
        if (this.windowManager != null && (windowView = this.windowView) != null && windowView.getParent() == null) {
            this.windowManager.addView(this.windowView, this.windowLayoutParams);
        }
        this.outputEntry = storyEntry;
        this.isVideo = storyEntry != null && storyEntry.isVideo;
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
        this.previewContainer.setBackgroundColor(this.openType == 1 ? 0 : -14737633);
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
        navigateTo(1, false);
        switchToEditMode(-1, false);
        addNotificationObservers();
    }

    public void lambda$openEdit$0(boolean z) {
        animateOpenTo(1.0f, z, new StoryRecorder$$ExternalSyntheticLambda34(this));
        this.previewButtons.appear(true, true);
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
            Utilities.Callback3<Long, Runnable, Boolean> callback3 = this.onClosePrepareListener;
            if (callback3 != null && (previewView = this.previewView) != null) {
                if (this.prepareClosing) {
                    return;
                }
                this.prepareClosing = true;
                callback3.run(Long.valueOf(previewView.release()), new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.this.lambda$close$1(z);
                    }
                }, Boolean.valueOf(this.wasSend));
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
            if (this.openType == 1) {
                this.windowView.setBackgroundColor(0);
                this.previewButtons.appear(false, true);
            }
            removeNotificationObservers();
        }
    }

    public void lambda$close$1(boolean z) {
        this.onClosePrepareListener = null;
        this.prepareClosing = false;
        close(z);
    }

    private void animateOpenTo(final float f, boolean z, final Runnable runnable) {
        ValueAnimator valueAnimator = this.openCloseAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.openCloseAnimator = null;
        }
        if (z) {
            this.notificationsLocker.lock();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, Integer.valueOf((int) LiteMode.FLAG_CALLS_ANIMATIONS));
            this.frozenDismissProgress = Float.valueOf(this.dismissProgress);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.openProgress, f);
            this.openCloseAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    StoryRecorder.this.lambda$animateOpenTo$2(valueAnimator2);
                }
            });
            this.openCloseAnimator.addListener(new AnimatorListenerAdapter() {
                {
                    StoryRecorder.this = this;
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    StoryRecorder.this.frozenDismissProgress = null;
                    StoryRecorder.this.openProgress = f;
                    StoryRecorder.this.containerView.invalidate();
                    StoryRecorder.this.windowView.invalidate();
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    if (StoryRecorder.this.fromSourceView != null) {
                        StoryWaveEffectView unused = StoryRecorder.this.waveEffect;
                    }
                    StoryRecorder.this.notificationsLocker.unlock();
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, Integer.valueOf((int) LiteMode.FLAG_CALLS_ANIMATIONS));
                    NotificationCenter.getGlobalInstance().runDelayedNotifications();
                    StoryRecorder.this.checkBackgroundVisibility();
                }
            });
            if (f < 1.0f && this.wasSend) {
                this.openCloseAnimator.setDuration(250L);
                this.openCloseAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            } else if (f > 0.0f || this.containerView.getTranslationY1() < AndroidUtilities.dp(20.0f)) {
                this.openCloseAnimator.setDuration(270L);
                this.openCloseAnimator.setInterpolator(new FastOutSlowInInterpolator());
            } else {
                this.openCloseAnimator.setDuration(400L);
                this.openCloseAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            }
            this.openCloseAnimator.start();
            return;
        }
        this.frozenDismissProgress = null;
        this.openProgress = f;
        this.containerView.invalidate();
        this.windowView.invalidate();
        if (runnable != null) {
            runnable.run();
        }
        checkBackgroundVisibility();
    }

    public void lambda$animateOpenTo$2(ValueAnimator valueAnimator) {
        this.openProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        checkBackgroundVisibility();
        this.containerView.invalidate();
        this.windowView.invalidate();
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
        }
        Runnable runnable = this.whenOpenDone;
        if (runnable != null) {
            runnable.run();
            this.whenOpenDone = null;
            return;
        }
        onResumeInternal();
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
                StoryRecorder.this.lambda$onCloseDone$3();
            }
        }, 16L);
        SourceView sourceView = this.fromSourceView;
        if (sourceView != null) {
            sourceView.show();
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

    public void lambda$onCloseDone$3() {
        WindowView windowView;
        if (this.windowManager == null || (windowView = this.windowView) == null || windowView.getParent() == null) {
            return;
        }
        this.windowManager.removeView(this.windowView);
    }

    public void setOnPrepareCloseListener(Utilities.Callback3<Long, Runnable, Boolean> callback3) {
        this.onClosePrepareListener = callback3;
    }

    public class WindowView extends SizeNotifierFrameLayout {
        private boolean allowModeScroll;
        private Path clipPath;
        private boolean flingDetected;
        private RectF fullRectF;
        private GestureDetectorFixDoubleTap gestureDetector;
        private boolean ignoreLayout;
        private Rect rect;
        private RectF rectF;
        private ScaleGestureDetector scaleGestureDetector;
        private boolean scaling;
        private float stx;
        private float sty;
        private float ty;

        static float access$3616(WindowView windowView, float f) {
            float f2 = windowView.sty + f;
            windowView.sty = f2;
            return f2;
        }

        static float access$3716(WindowView windowView, float f) {
            float f2 = windowView.stx + f;
            windowView.stx = f2;
            return f2;
        }

        static float access$4424(WindowView windowView, float f) {
            float f2 = windowView.ty - f;
            windowView.ty = f2;
            return f2;
        }

        public WindowView(Context context) {
            super(context);
            StoryRecorder.this = r3;
            this.rectF = new RectF();
            this.fullRectF = new RectF();
            this.clipPath = new Path();
            this.rect = new Rect();
            this.scaling = false;
            this.gestureDetector = new GestureDetectorFixDoubleTap(context, new GestureListener());
            this.scaleGestureDetector = new ScaleGestureDetector(context, new ScaleListener());
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
        public void dispatchDraw(Canvas canvas) {
            float floatValue = StoryRecorder.this.frozenDismissProgress != null ? StoryRecorder.this.frozenDismissProgress.floatValue() : StoryRecorder.this.dismissProgress;
            if (StoryRecorder.this.openType == 0) {
                canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, (int) (StoryRecorder.this.openProgress * 255.0f * (1.0f - floatValue))));
            }
            boolean z = false;
            float lerp = AndroidUtilities.lerp(StoryRecorder.this.fromRounding, 0.0f, StoryRecorder.this.openProgress);
            if (StoryRecorder.this.openProgress != 1.0f) {
                if (StoryRecorder.this.openType != 0) {
                    if (StoryRecorder.this.openType == 1) {
                        this.fullRectF.set(StoryRecorder.this.previewContainer.getLeft(), StoryRecorder.this.previewContainer.getTop(), StoryRecorder.this.previewContainer.getMeasuredWidth(), StoryRecorder.this.previewContainer.getMeasuredHeight());
                        this.fullRectF.offset(StoryRecorder.this.containerView.getX(), StoryRecorder.this.containerView.getY());
                        AndroidUtilities.lerp(StoryRecorder.this.fromRect, this.fullRectF, StoryRecorder.this.openProgress, this.rectF);
                        StoryRecorder.this.previewContainer.setAlpha(StoryRecorder.this.openProgress);
                        StoryRecorder.this.previewContainer.setTranslationX((this.rectF.left - StoryRecorder.this.previewContainer.getLeft()) - StoryRecorder.this.containerView.getX());
                        StoryRecorder.this.previewContainer.setTranslationY((this.rectF.top - StoryRecorder.this.previewContainer.getTop()) - StoryRecorder.this.containerView.getY());
                        if (StoryRecorder.this.fromSourceView != null && StoryRecorder.this.fromSourceView.view != null) {
                            StoryRecorder.this.fromSourceView.view.setTranslationX((this.fullRectF.left - StoryRecorder.this.fromRect.left) * StoryRecorder.this.openProgress);
                            StoryRecorder.this.fromSourceView.view.setTranslationY((this.fullRectF.top - StoryRecorder.this.fromRect.top) * StoryRecorder.this.openProgress);
                        }
                        StoryRecorder.this.previewContainer.setScaleX(this.rectF.width() / StoryRecorder.this.previewContainer.getMeasuredWidth());
                        StoryRecorder.this.previewContainer.setScaleY(this.rectF.height() / StoryRecorder.this.previewContainer.getMeasuredHeight());
                        StoryRecorder.this.actionBarContainer.setAlpha(StoryRecorder.this.openProgress);
                        StoryRecorder.this.controlContainer.setAlpha(StoryRecorder.this.openProgress);
                        StoryRecorder.this.captionContainer.setAlpha(StoryRecorder.this.openProgress);
                    }
                } else {
                    this.fullRectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    this.fullRectF.offset(StoryRecorder.this.containerView.getTranslationX(), StoryRecorder.this.containerView.getTranslationY());
                    AndroidUtilities.lerp(StoryRecorder.this.fromRect, this.fullRectF, StoryRecorder.this.openProgress, this.rectF);
                    canvas.save();
                    this.clipPath.rewind();
                    this.clipPath.addRoundRect(this.rectF, lerp, lerp, Path.Direction.CW);
                    canvas.clipPath(this.clipPath);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.clamp(StoryRecorder.this.openProgress * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                    RectF rectF = this.rectF;
                    canvas.translate(rectF.left, rectF.top - (StoryRecorder.this.containerView.getTranslationY() * StoryRecorder.this.openProgress));
                    float max = Math.max(this.rectF.width() / getWidth(), this.rectF.height() / getHeight());
                    canvas.scale(max, max);
                    z = true;
                }
            }
            if (StoryRecorder.this.paintView != null) {
                StoryRecorder.this.paintView.onParentPreDraw();
            }
            super.dispatchDraw(canvas);
            if (z) {
                canvas.restore();
                canvas.restore();
                if (StoryRecorder.this.fromSourceView != null) {
                    float clamp = Utilities.clamp(1.0f - (StoryRecorder.this.openProgress * 1.5f), 1.0f, 0.0f);
                    float centerX = this.rectF.centerX();
                    float centerY = this.rectF.centerY();
                    Math.min(this.rectF.width(), this.rectF.height());
                    if (StoryRecorder.this.fromSourceView.backgroundImageReceiver != null) {
                        StoryRecorder.this.fromSourceView.backgroundImageReceiver.setImageCoords(this.rectF);
                        StoryRecorder.this.fromSourceView.backgroundImageReceiver.setAlpha(clamp);
                        StoryRecorder.this.fromSourceView.backgroundImageReceiver.draw(canvas);
                    } else if (StoryRecorder.this.fromSourceView.backgroundPaint != null) {
                        StoryRecorder.this.fromSourceView.backgroundPaint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(3.0f), Theme.multAlpha(AndroidUtilities.DARK_STATUS_BAR_OVERLAY, clamp));
                        StoryRecorder.this.fromSourceView.backgroundPaint.setAlpha((int) (255.0f * clamp));
                        canvas.drawRoundRect(this.rectF, lerp, lerp, StoryRecorder.this.fromSourceView.backgroundPaint);
                    }
                    if (StoryRecorder.this.fromSourceView.iconDrawable != null) {
                        this.rect.set(StoryRecorder.this.fromSourceView.iconDrawable.getBounds());
                        StoryRecorder.this.fromSourceView.iconDrawable.setBounds((int) (centerX - (StoryRecorder.this.fromSourceView.iconSize / 2)), (int) (centerY - (StoryRecorder.this.fromSourceView.iconSize / 2)), (int) (centerX + (StoryRecorder.this.fromSourceView.iconSize / 2)), (int) (centerY + (StoryRecorder.this.fromSourceView.iconSize / 2)));
                        int alpha = StoryRecorder.this.fromSourceView.iconDrawable.getAlpha();
                        StoryRecorder.this.fromSourceView.iconDrawable.setAlpha((int) (alpha * clamp));
                        StoryRecorder.this.fromSourceView.iconDrawable.draw(canvas);
                        StoryRecorder.this.fromSourceView.iconDrawable.setBounds(this.rect);
                        StoryRecorder.this.fromSourceView.iconDrawable.setAlpha(alpha);
                    }
                    canvas.save();
                    canvas.translate(StoryRecorder.this.fromRect.left, StoryRecorder.this.fromRect.top);
                    StoryRecorder.this.fromSourceView.drawAbove(canvas, clamp);
                    canvas.restore();
                }
            }
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            this.flingDetected = false;
            this.scaleGestureDetector.onTouchEvent(motionEvent);
            this.gestureDetector.onTouchEvent(motionEvent);
            boolean z = true;
            if (motionEvent.getAction() == 1 && !this.flingDetected) {
                if (StoryRecorder.this.containerView.getTranslationY() > 0.0f) {
                    if (StoryRecorder.this.dismissProgress <= 0.4f) {
                        StoryRecorder.this.animateContainerBack();
                    } else {
                        StoryRecorder.this.close(true);
                    }
                } else if (StoryRecorder.this.galleryListView != null && StoryRecorder.this.galleryListView.getTranslationY() > 0.0f && !StoryRecorder.this.galleryClosing) {
                    StoryRecorder storyRecorder = StoryRecorder.this;
                    storyRecorder.lambda$animateGalleryListView$38((storyRecorder.takingVideo || StoryRecorder.this.galleryListView.getTranslationY() >= ((float) StoryRecorder.this.galleryListView.getPadding())) ? false : false);
                }
                StoryRecorder.this.galleryClosing = false;
                StoryRecorder.this.modeSwitcherView.stopScroll(0.0f);
                StoryRecorder.this.scrollingY = false;
                StoryRecorder.this.scrollingX = false;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
            if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                StoryRecorder.this.onBackPressed();
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }

        public final class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
            private ScaleListener() {
                WindowView.this = r1;
            }

            @Override
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                if (!WindowView.this.scaling || StoryRecorder.this.cameraView == null || StoryRecorder.this.currentPage != 0 || StoryRecorder.this.cameraView.isDualTouch()) {
                    return false;
                }
                StoryRecorder.access$3216(StoryRecorder.this, (scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
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
                StoryRecorder.this.lambda$animateGalleryListView$38(false);
                StoryRecorder.this.animateContainerBack();
                super.onScaleEnd(scaleGestureDetector);
            }
        }

        public final class GestureListener extends GestureDetectorFixDoubleTap.OnGestureListener {
            @Override
            public void onLongPress(MotionEvent motionEvent) {
            }

            @Override
            public void onShowPress(MotionEvent motionEvent) {
            }

            private GestureListener() {
                WindowView.this = r1;
            }

            @Override
            public boolean onDown(MotionEvent motionEvent) {
                WindowView.this.sty = 0.0f;
                WindowView.this.stx = 0.0f;
                return false;
            }

            @Override
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                StoryRecorder.this.scrollingY = false;
                StoryRecorder.this.scrollingX = false;
                if (hasDoubleTap(motionEvent) || !onSingleTapConfirmed(motionEvent)) {
                    if (!StoryRecorder.this.isGalleryOpen() || motionEvent.getY() >= StoryRecorder.this.galleryListView.top()) {
                        return false;
                    }
                    StoryRecorder.this.lambda$animateGalleryListView$38(false);
                    return true;
                }
                return true;
            }

            @Override
            public boolean onScroll(android.view.MotionEvent r4, android.view.MotionEvent r5, float r6, float r7) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.StoryRecorder.WindowView.GestureListener.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
            }

            @Override
            public boolean onFling(android.view.MotionEvent r4, android.view.MotionEvent r5, float r6, float r7) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.StoryRecorder.WindowView.GestureListener.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
            }

            @Override
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (StoryRecorder.this.cameraView != null) {
                    StoryRecorder.this.cameraView.allowToTapFocus();
                    return true;
                }
                return false;
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
                return true;
            }

            @Override
            public boolean onDoubleTapEvent(MotionEvent motionEvent) {
                if (StoryRecorder.this.cameraView != null) {
                    StoryRecorder.this.cameraView.clearTapFocus();
                    return false;
                }
                return false;
            }

            @Override
            public boolean hasDoubleTap(MotionEvent motionEvent) {
                return (StoryRecorder.this.currentPage != 0 || StoryRecorder.this.cameraView == null || StoryRecorder.this.awaitingPlayer || !StoryRecorder.this.cameraView.isInited() || StoryRecorder.this.takingPhoto || StoryRecorder.this.recordControl.isTouch() || StoryRecorder.this.isGalleryOpen() || StoryRecorder.this.galleryListViewOpening != null) ? false : true;
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
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
                StoryRecorder storyRecorder3 = StoryRecorder.this;
                storyRecorder3.previewW = (int) Math.ceil((storyRecorder3.previewH * 9.0f) / 16.0f);
            }
            StoryRecorder storyRecorder4 = StoryRecorder.this;
            storyRecorder4.underControls = Utilities.clamp((size2 - storyRecorder4.previewH) - (StoryRecorder.this.underStatusBar ? 0 : i4), AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
            int systemUiVisibility = getSystemUiVisibility();
            setSystemUiVisibility(StoryRecorder.this.underStatusBar ? systemUiVisibility | 4 : systemUiVisibility & (-5));
            StoryRecorder.this.containerView.measure(View.MeasureSpec.makeMeasureSpec(StoryRecorder.this.previewW, 1073741824), View.MeasureSpec.makeMeasureSpec(StoryRecorder.this.previewH + StoryRecorder.this.underControls, 1073741824));
            if (StoryRecorder.this.galleryListView != null) {
                StoryRecorder.this.galleryListView.measure(View.MeasureSpec.makeMeasureSpec(StoryRecorder.this.previewW, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }
            if (StoryRecorder.this.captionEdit != null) {
                EmojiView emojiView = StoryRecorder.this.captionEdit.editText.getEmojiView();
                if (measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                    this.ignoreLayout = true;
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
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                } else if (childAt instanceof Bulletin.ParentLayout) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(340.0f), size2 - (StoryRecorder.this.underStatusBar ? 0 : i4)), 1073741824));
                }
            }
            setMeasuredDimension(size, size2);
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            EmojiView emojiView;
            if (this.ignoreLayout) {
                return;
            }
            int i6 = i3 - i;
            int i7 = i4 - i2;
            int i8 = StoryRecorder.this.insetTop;
            int measuredHeight = StoryRecorder.this.navbarContainer.getMeasuredHeight();
            if (StoryRecorder.this.underStatusBar) {
                i8 = 0;
            }
            int i9 = StoryRecorder.this.insetLeft + (((i6 - StoryRecorder.this.insetRight) - StoryRecorder.this.previewW) / 2);
            int i10 = StoryRecorder.this.insetLeft + (((i6 - StoryRecorder.this.insetRight) + StoryRecorder.this.previewW) / 2);
            if (StoryRecorder.this.underStatusBar) {
                i5 = StoryRecorder.this.previewH;
            } else {
                int i11 = (((((i7 - i8) - StoryRecorder.this.insetBottom) - StoryRecorder.this.previewH) - measuredHeight) / 2) + i8;
                if (StoryRecorder.this.openType == 1 && StoryRecorder.this.fromRect.top + StoryRecorder.this.previewH + measuredHeight < i7 - StoryRecorder.this.insetBottom) {
                    i8 = (int) StoryRecorder.this.fromRect.top;
                } else if (i11 - i8 >= AndroidUtilities.dp(40.0f)) {
                    i8 = i11;
                }
                i5 = StoryRecorder.this.previewH;
            }
            StoryRecorder.this.containerView.layout(i9, i8, i10, i5 + i8 + measuredHeight);
            if (StoryRecorder.this.galleryListView != null) {
                StoryRecorder.this.galleryListView.layout((i6 - StoryRecorder.this.galleryListView.getMeasuredWidth()) / 2, 0, (StoryRecorder.this.galleryListView.getMeasuredWidth() + i6) / 2, i7);
            }
            if (StoryRecorder.this.captionEdit != null && (emojiView = StoryRecorder.this.captionEdit.editText.getEmojiView()) != null) {
                emojiView.layout(StoryRecorder.this.insetLeft, (i7 - StoryRecorder.this.insetBottom) - emojiView.getMeasuredHeight(), i6 - StoryRecorder.this.insetRight, i7 - StoryRecorder.this.insetBottom);
            }
            if (StoryRecorder.this.paintView != null) {
                if (StoryRecorder.this.paintView.emojiView != null) {
                    StoryRecorder.this.paintView.emojiView.layout(StoryRecorder.this.insetLeft, (i7 - StoryRecorder.this.insetBottom) - StoryRecorder.this.paintView.emojiView.getMeasuredHeight(), i6 - StoryRecorder.this.insetRight, i7 - StoryRecorder.this.insetBottom);
                }
                if (StoryRecorder.this.paintView.reactionLayout != null) {
                    StoryRecorder.this.paintView.reactionLayout.layout(StoryRecorder.this.insetLeft, StoryRecorder.this.insetTop, StoryRecorder.this.insetLeft + StoryRecorder.this.paintView.reactionLayout.getMeasuredWidth(), StoryRecorder.this.insetTop + StoryRecorder.this.paintView.reactionLayout.getMeasuredHeight());
                    FrameLayout frameLayout = StoryRecorder.this.paintView.reactionLayout.getReactionsWindow() != null ? StoryRecorder.this.paintView.reactionLayout.getReactionsWindow().windowView : null;
                    if (frameLayout != null) {
                        frameLayout.layout(StoryRecorder.this.insetLeft, StoryRecorder.this.insetTop, StoryRecorder.this.insetLeft + frameLayout.getMeasuredWidth(), StoryRecorder.this.insetTop + frameLayout.getMeasuredHeight());
                    }
                }
            }
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt instanceof DownloadButton.PreparingVideoToast) {
                    childAt.layout(0, 0, i6, i7);
                } else if (childAt instanceof Bulletin.ParentLayout) {
                    childAt.layout(0, i8, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i8);
                }
            }
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
    }

    public class ContainerView extends FrameLayout {
        private LinearGradient topGradient;
        private final Paint topGradientPaint;
        private float translationY1;
        private float translationY2;

        public ContainerView(Context context) {
            super(context);
            StoryRecorder.this = r1;
            this.topGradientPaint = new Paint(1);
        }

        public void updateBackground() {
            if (StoryRecorder.this.openType == 0) {
                setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), -16777216));
            } else {
                setBackground(null);
            }
        }

        public void setTranslationY2(float f) {
            float f2 = this.translationY1;
            this.translationY2 = f;
            super.setTranslationY(f2 + f);
        }

        public float getTranslationY1() {
            return this.translationY1;
        }

        public float getTranslationY2() {
            return this.translationY2;
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

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5 = StoryRecorder.this.underStatusBar ? StoryRecorder.this.insetTop : 0;
            StoryRecorder.this.previewContainer.layout(0, 0, StoryRecorder.this.previewW, StoryRecorder.this.previewH);
            StoryRecorder.this.previewContainer.setPivotX(StoryRecorder.this.previewW * 0.5f);
            StoryRecorder.this.actionBarContainer.layout(0, i5, StoryRecorder.this.previewW, StoryRecorder.this.actionBarContainer.getMeasuredHeight() + i5);
            StoryRecorder.this.controlContainer.layout(0, StoryRecorder.this.previewH - StoryRecorder.this.controlContainer.getMeasuredHeight(), StoryRecorder.this.previewW, StoryRecorder.this.previewH);
            StoryRecorder.this.navbarContainer.layout(0, StoryRecorder.this.previewH, StoryRecorder.this.previewW, StoryRecorder.this.previewH + StoryRecorder.this.navbarContainer.getMeasuredHeight());
            StoryRecorder.this.captionContainer.layout(0, 0, StoryRecorder.this.previewW, StoryRecorder.this.previewH);
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
            int i6 = i3 - i;
            int i7 = i4 - i2;
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
                this.topGradientPaint.setAlpha((int) (StoryRecorder.this.openProgress * 255.0f));
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(72.0f) + f, this.topGradientPaint);
            }
            return drawChild;
        }
    }

    public Context getContext() {
        return this.activity;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void initViews() {
        Context context = getContext();
        WindowView windowView = new WindowView(context);
        this.windowView = windowView;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            windowView.setFitsSystemWindows(true);
            this.windowView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                {
                    StoryRecorder.this = this;
                }

                @Override
                public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30) {
                        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.displayCutout() | WindowInsetsCompat.Type.systemBars());
                        StoryRecorder.this.insetTop = insets.top;
                        StoryRecorder.this.insetBottom = insets.bottom;
                        StoryRecorder.this.insetLeft = insets.left;
                        StoryRecorder.this.insetRight = insets.right;
                    } else {
                        StoryRecorder.this.insetTop = windowInsets.getStableInsetTop();
                        StoryRecorder.this.insetBottom = windowInsets.getStableInsetBottom();
                        StoryRecorder.this.insetLeft = windowInsets.getStableInsetLeft();
                        StoryRecorder.this.insetRight = windowInsets.getStableInsetRight();
                    }
                    StoryRecorder.this.windowView.requestLayout();
                    if (i2 >= 30) {
                        return WindowInsets.CONSUMED;
                    }
                    return windowInsets.consumeSystemWindowInsets();
                }
            });
        }
        this.windowView.setFocusable(true);
        WindowView windowView2 = this.windowView;
        ContainerView containerView = new ContainerView(context);
        this.containerView = containerView;
        windowView2.addView(containerView);
        ContainerView containerView2 = this.containerView;
        FrameLayout frameLayout = new FrameLayout(context) {
            {
                StoryRecorder.this = this;
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (StoryRecorder.this.previewTouchable != null) {
                    StoryRecorder.this.previewTouchable.onTouch(motionEvent);
                    return true;
                }
                return super.onTouchEvent(motionEvent);
            }

            @Override
            protected void onMeasure(int i2, int i3) {
                super.onMeasure(i2, i3);
                if (StoryRecorder.this.photoFilterViewCurvesControl != null) {
                    StoryRecorder.this.photoFilterViewCurvesControl.setActualArea(0.0f, 0.0f, StoryRecorder.this.photoFilterViewCurvesControl.getMeasuredWidth(), StoryRecorder.this.photoFilterViewCurvesControl.getMeasuredHeight());
                }
                if (StoryRecorder.this.photoFilterViewBlurControl != null) {
                    StoryRecorder.this.photoFilterViewBlurControl.setActualAreaSize(StoryRecorder.this.photoFilterViewBlurControl.getMeasuredWidth(), StoryRecorder.this.photoFilterViewBlurControl.getMeasuredHeight());
                }
            }
        };
        this.previewContainer = frameLayout;
        containerView2.addView(frameLayout);
        this.blurManager = new BlurringShader.BlurManager(this.previewContainer);
        ContainerView containerView3 = this.containerView;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.actionBarContainer = frameLayout2;
        containerView3.addView(frameLayout2);
        ContainerView containerView4 = this.containerView;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.controlContainer = frameLayout3;
        containerView4.addView(frameLayout3);
        ContainerView containerView5 = this.containerView;
        FrameLayout frameLayout4 = new FrameLayout(context) {
            {
                StoryRecorder.this = this;
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
        this.captionContainer = frameLayout4;
        containerView5.addView(frameLayout4);
        this.captionContainer.setVisibility(8);
        this.captionContainer.setAlpha(0.0f);
        ContainerView containerView6 = this.containerView;
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.navbarContainer = frameLayout5;
        containerView6.addView(frameLayout5);
        Bulletin.addDelegate(this.windowView, new Bulletin.Delegate(this) {
            @Override
            public boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public boolean clipWithGradient(int i2) {
                return true;
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
            public int getTopOffset(int i2) {
                return AndroidUtilities.dp(56.0f);
            }

            @Override
            public int getBottomOffset(int i2) {
                return Bulletin.Delegate.CC.$default$getBottomOffset(this, i2);
            }
        });
        ImageView imageView = new ImageView(context);
        this.cameraViewThumb = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.cameraViewThumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StoryRecorder.this.lambda$initViews$4(view);
            }
        });
        this.cameraViewThumb.setClickable(true);
        this.previewContainer.addView(this.cameraViewThumb, LayoutHelper.createFrame(-1, -1, 119));
        this.previewContainer.setBackgroundColor(this.openType == 1 ? 0 : -14737633);
        if (i >= 21) {
            this.previewContainer.setOutlineProvider(new ViewOutlineProvider(this) {
                @Override
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(12.0f));
                }
            });
            this.previewContainer.setClipToOutline(true);
        }
        this.photoFilterEnhanceView = new PhotoFilterView.EnhanceView(context, new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.createFilterPhotoView();
            }
        });
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(context, this.blurManager);
        this.previewView = anonymousClass7;
        anonymousClass7.invalidateBlur = new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.invalidateBlur();
            }
        };
        this.previewView.setOnTapListener(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.lambda$initViews$5();
            }
        });
        this.previewView.setVisibility(8);
        this.previewView.whenError(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.lambda$initViews$6();
            }
        });
        this.previewContainer.addView(this.previewView, LayoutHelper.createFrame(-1, -1, 119));
        this.previewContainer.addView(this.photoFilterEnhanceView, LayoutHelper.createFrame(-1, -1, 119));
        WindowView windowView3 = this.windowView;
        CaptionStory captionStory = new CaptionStory(context, windowView3, windowView3, this.containerView, this.resourcesProvider, this.blurManager) {
            {
                StoryRecorder.this = this;
            }

            @Override
            public void drawBlurBitmap(Bitmap bitmap, float f) {
                StoryRecorder.this.windowView.drawBlurBitmap(bitmap, f);
                super.drawBlurBitmap(bitmap, f);
            }

            @Override
            public boolean captionLimitToast() {
                if (MessagesController.getInstance(this.currentAccount).premiumLocked) {
                    return false;
                }
                Bulletin visibleBulletin = Bulletin.getVisibleBulletin();
                if (visibleBulletin == null || visibleBulletin.tag != 2) {
                    int i2 = MessagesController.getInstance(this.currentAccount).storyCaptionLengthLimitPremium;
                    int round = Math.round(i2 / MessagesController.getInstance(this.currentAccount).storyCaptionLengthLimitDefault);
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", round, "" + i2));
                    int indexOf = replaceTags.toString().indexOf("__");
                    if (indexOf >= 0) {
                        replaceTags.replace(indexOf, indexOf + 2, (CharSequence) "");
                        int indexOf2 = replaceTags.toString().indexOf("__");
                        if (indexOf2 >= 0) {
                            replaceTags.replace(indexOf2, indexOf2 + 2, (CharSequence) "");
                            replaceTags.setSpan(new ForegroundColorSpan(Theme.getColor(Theme.key_chat_messageLinkIn, this.resourcesProvider)), indexOf, indexOf2, 33);
                            replaceTags.setSpan(new ClickableSpan() {
                                {
                                    AnonymousClass8.this = this;
                                }

                                @Override
                                public void updateDrawState(TextPaint textPaint) {
                                    textPaint.setUnderlineText(false);
                                }

                                @Override
                                public void onClick(View view) {
                                    StoryRecorder.this.openPremium();
                                }
                            }, indexOf, indexOf2, 33);
                        }
                    }
                    Bulletin createSimpleBulletin = BulletinFactory.of(StoryRecorder.this.captionContainer, this.resourcesProvider).createSimpleBulletin(R.raw.caption_limit, LocaleController.getString("CaptionPremiumTitle"), replaceTags);
                    createSimpleBulletin.tag = 2;
                    createSimpleBulletin.setDuration(5000);
                    createSimpleBulletin.show(false);
                    return true;
                }
                return false;
            }

            @Override
            protected void onCaptionLimitUpdate(boolean z) {
                StoryRecorder.this.previewButtons.setShareEnabled((StoryRecorder.this.videoError || z || (MessagesController.getInstance(this.currentAccount).getStoriesController().hasStoryLimit() && (StoryRecorder.this.outputEntry == null || !StoryRecorder.this.outputEntry.isEdit))) ? false : true);
            }
        };
        this.captionEdit = captionStory;
        captionStory.setAccount(this.currentAccount);
        this.captionEdit.setUiBlurBitmap(new Utilities.CallbackVoidReturn() {
            @Override
            public final Object run() {
                Bitmap uiBlurBitmap;
                uiBlurBitmap = StoryRecorder.this.getUiBlurBitmap();
                return uiBlurBitmap;
            }
        });
        Bulletin.addDelegate(this.captionContainer, new Bulletin.Delegate() {
            @Override
            public boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public boolean clipWithGradient(int i2) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i2);
            }

            @Override
            public int getTopOffset(int i2) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i2);
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
                StoryRecorder.this = this;
            }

            @Override
            public int getBottomOffset(int i2) {
                return StoryRecorder.this.captionEdit.getEditTextHeight() + AndroidUtilities.dp(12.0f);
            }
        });
        this.captionEdit.setOnHeightUpdate(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.this.lambda$initViews$7((Integer) obj);
            }
        });
        this.captionEdit.setOnPeriodUpdate(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.this.lambda$initViews$8((Integer) obj);
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
                StoryRecorder.this.lambda$initViews$9((Boolean) obj);
            }
        });
        TimelineView timelineView = new TimelineView(context, this.containerView, this.previewContainer, this.resourcesProvider, this.blurManager);
        this.timelineView = timelineView;
        this.previewView.setVideoTimelineView(timelineView);
        this.timelineView.setVisibility(8);
        this.timelineView.setAlpha(0.0f);
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.videoTimelineContainerView = frameLayout6;
        frameLayout6.addView(this.timelineView, LayoutHelper.createFrame(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        VideoTimeView videoTimeView = new VideoTimeView(context);
        this.videoTimeView = videoTimeView;
        videoTimeView.setVisibility(8);
        this.videoTimeView.show(false, false);
        this.videoTimelineContainerView.addView(this.videoTimeView, LayoutHelper.createFrame(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.captionContainer.addView(this.videoTimelineContainerView, LayoutHelper.createFrame(-1, 105.0f, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.captionContainer.addView(this.captionEdit, LayoutHelper.createFrame(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.backButton = imageView2;
        imageView2.setContentDescription(LocaleController.getString("AccDescrGoBack", R.string.AccDescrGoBack));
        this.backButton.setScaleType(ImageView.ScaleType.CENTER);
        this.backButton.setImageResource(R.drawable.msg_photo_back);
        this.backButton.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        this.backButton.setBackground(Theme.createSelectorDrawable(553648127));
        this.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StoryRecorder.this.lambda$initViews$10(view);
            }
        });
        this.actionBarContainer.addView(this.backButton, LayoutHelper.createFrame(56, 56, 51));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.titleTextView = simpleTextView;
        simpleTextView.setTextSize(20);
        this.titleTextView.setGravity(19);
        this.titleTextView.setTextColor(-1);
        this.titleTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.titleTextView.setText(LocaleController.getString("RecorderNewStory", R.string.RecorderNewStory));
        this.titleTextView.getPaint().setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, 1.0f, 1073741824);
        this.titleTextView.setAlpha(0.0f);
        this.titleTextView.setVisibility(8);
        this.titleTextView.setEllipsizeByGradient(true);
        this.titleTextView.setRightPadding(AndroidUtilities.dp(144.0f));
        this.actionBarContainer.addView(this.titleTextView, LayoutHelper.createFrame(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        DownloadButton downloadButton = new DownloadButton(context, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.this.lambda$initViews$11((Runnable) obj);
            }
        }, this.currentAccount, this.windowView, this.resourcesProvider);
        this.downloadButton = downloadButton;
        this.actionBarContainer.addView(downloadButton, LayoutHelper.createFrame(56, 56, 53));
        HintView2 animatedTextHacks = new HintView2(this.activity, 1).setJoint(1.0f, -68.0f).setDuration(2000L).setBounce(false).setAnimatedTextHacks(true, true, false);
        this.muteHint = animatedTextHacks;
        animatedTextHacks.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.actionBarContainer.addView(this.muteHint, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.muteButton = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        RLottieImageView rLottieImageView2 = this.muteButton;
        StoryEntry storyEntry = this.outputEntry;
        rLottieImageView2.setImageResource((storyEntry == null || !storyEntry.muted) ? R.drawable.media_mute : R.drawable.media_unmute);
        this.muteButton.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        this.muteButton.setBackground(Theme.createSelectorDrawable(553648127));
        this.muteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StoryRecorder.this.lambda$initViews$12(view);
            }
        });
        this.muteButton.setVisibility(8);
        this.muteButton.setAlpha(0.0f);
        this.actionBarContainer.addView(this.muteButton, LayoutHelper.createFrame(56, 56.0f, 53, 0.0f, 0.0f, 48.0f, 0.0f));
        PlayPauseButton playPauseButton = new PlayPauseButton(context);
        this.playButton = playPauseButton;
        playPauseButton.setBackground(Theme.createSelectorDrawable(553648127));
        this.playButton.setVisibility(8);
        this.playButton.setAlpha(0.0f);
        this.playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StoryRecorder.this.lambda$initViews$13(view);
            }
        });
        this.actionBarContainer.addView(this.playButton, LayoutHelper.createFrame(56, 56.0f, 53, 0.0f, 0.0f, 96.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.flashButton = imageView3;
        imageView3.setScaleType(ImageView.ScaleType.CENTER);
        this.flashButton.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        this.flashButton.setBackground(Theme.createSelectorDrawable(553648127));
        this.flashButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StoryRecorder.this.lambda$initViews$14(view);
            }
        });
        this.flashButton.setVisibility(8);
        this.flashButton.setAlpha(0.0f);
        this.actionBarContainer.addView(this.flashButton, LayoutHelper.createFrame(56, 56, 53));
        ToggleButton toggleButton = new ToggleButton(context, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.dualButton = toggleButton;
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StoryRecorder.this.lambda$initViews$15(view);
            }
        });
        this.dualButton.setVisibility(DualCameraView.dualAvailableStatic(context) ? 0 : 8);
        this.actionBarContainer.addView(this.dualButton, LayoutHelper.createFrame(56, 56, 53));
        HintView2 onHiddenListener = new HintView2(this.activity, 1).setJoint(1.0f, -20.0f).setDuration(5000L).setCloseButton(true).setText(LocaleController.getString(R.string.StoryCameraDualHint)).setOnHiddenListener(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.lambda$initViews$16();
            }
        });
        this.dualHint = onHiddenListener;
        onHiddenListener.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.actionBarContainer.addView(this.dualHint, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        HintView2 multilineText = new HintView2(this.activity, 2).setJoint(0.0f, 28.0f).setDuration(5000L).setMultilineText(true);
        this.savedDualHint = multilineText;
        this.actionBarContainer.addView(multilineText, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        this.videoTimerView = new VideoTimerView(context);
        showVideoTimer(false, false);
        this.actionBarContainer.addView(this.videoTimerView, LayoutHelper.createFrame(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        if (i >= 21) {
            MediaController.loadGalleryPhotosAlbums(0);
        }
        RecordControl recordControl = new RecordControl(context);
        this.recordControl = recordControl;
        recordControl.setDelegate(this.recordControlDelegate);
        this.recordControl.startAsVideo(this.isVideo);
        this.controlContainer.addView(this.recordControl, LayoutHelper.createFrame(-1, 100, 87));
        HintView2 textAlign = new HintView2(this.activity, 3).setMultilineText(true).setText(LocaleController.getString(R.string.StoryCameraHint2)).setMaxWidth(320.0f).setDuration(5000L).setTextAlign(Layout.Alignment.ALIGN_CENTER);
        this.cameraHint = textAlign;
        this.controlContainer.addView(textAlign, LayoutHelper.createFrame(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        ZoomControlView zoomControlView = new ZoomControlView(context);
        this.zoomControlView = zoomControlView;
        zoomControlView.enabledTouch = false;
        zoomControlView.setAlpha(0.0f);
        this.controlContainer.addView(this.zoomControlView, LayoutHelper.createFrame(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.zoomControlView.setDelegate(new ZoomControlView.ZoomControlViewDelegate() {
            @Override
            public final void didSetZoom(float f) {
                StoryRecorder.this.lambda$initViews$17(f);
            }
        });
        ZoomControlView zoomControlView2 = this.zoomControlView;
        this.cameraZoom = 0.0f;
        zoomControlView2.setZoom(0.0f, false);
        PhotoVideoSwitcherView photoVideoSwitcherView = new PhotoVideoSwitcherView(context);
        this.modeSwitcherView = photoVideoSwitcherView;
        photoVideoSwitcherView.setOnSwitchModeListener(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.this.lambda$initViews$18((Boolean) obj);
            }
        });
        this.modeSwitcherView.setOnSwitchingModeListener(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.this.lambda$initViews$19((Float) obj);
            }
        });
        this.navbarContainer.addView(this.modeSwitcherView, LayoutHelper.createFrame(-1, -1, 87));
        HintTextView hintTextView = new HintTextView(context);
        this.hintTextView = hintTextView;
        this.navbarContainer.addView(hintTextView, LayoutHelper.createFrame(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        PreviewButtons previewButtons = new PreviewButtons(context);
        this.previewButtons = previewButtons;
        previewButtons.setVisibility(8);
        this.previewButtons.setOnClickListener(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.this.lambda$initViews$25((Integer) obj);
            }
        });
        this.navbarContainer.addView(this.previewButtons, LayoutHelper.createFrame(-1, 52, 23));
        TrashView trashView = new TrashView(context);
        this.trash = trashView;
        trashView.setAlpha(0.0f);
        this.trash.setVisibility(8);
        this.previewContainer.addView(this.trash, LayoutHelper.createFrame(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        PreviewHighlightView previewHighlightView = new PreviewHighlightView(context, this.currentAccount, this.resourcesProvider);
        this.previewHighlight = previewHighlightView;
        this.previewContainer.addView(previewHighlightView, LayoutHelper.createFrame(-1, -1, 119));
    }

    public void lambda$initViews$4(View view) {
        if (this.noCameraPermission) {
            requestCameraPermission(true);
        }
    }

    public class AnonymousClass7 extends PreviewView {
        AnonymousClass7(Context context, BlurringShader.BlurManager blurManager) {
            super(context, blurManager);
            StoryRecorder.this = r1;
        }

        @Override
        public boolean additionalTouchEvent(MotionEvent motionEvent) {
            return StoryRecorder.this.photoFilterEnhanceView.onTouch(motionEvent);
        }

        @Override
        public void applyMatrix() {
            super.applyMatrix();
            StoryRecorder.this.applyFilterMatrix();
        }

        @Override
        public void onEntityDraggedTop(boolean z) {
            StoryRecorder.this.previewHighlight.show(true, z, StoryRecorder.this.actionBarContainer);
        }

        @Override
        public void onEntityDraggedBottom(boolean z) {
            StoryRecorder.this.previewHighlight.updateCaption(StoryRecorder.this.captionEdit.getText());
        }

        @Override
        public void onEntityDragEnd(boolean z) {
            StoryRecorder.this.controlContainer.clearAnimation();
            ViewPropertyAnimator duration = StoryRecorder.this.controlContainer.animate().alpha(1.0f).setDuration(180L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            StoryRecorder.this.trash.onDragInfo(false, z);
            StoryRecorder.this.trash.clearAnimation();
            StoryRecorder.this.trash.animate().alpha(0.0f).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.AnonymousClass7.this.lambda$onEntityDragEnd$0();
                }
            }).setDuration(180L).setInterpolator(cubicBezierInterpolator).setStartDelay(z ? 500L : 0L).start();
            if (z) {
                deleteCurrentPart();
            }
            super.onEntityDragEnd(z);
        }

        public void lambda$onEntityDragEnd$0() {
            StoryRecorder.this.trash.setVisibility(8);
        }

        @Override
        public void onEntityDragStart() {
            StoryRecorder.this.controlContainer.clearAnimation();
            ViewPropertyAnimator duration = StoryRecorder.this.controlContainer.animate().alpha(0.0f).setDuration(180L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            StoryRecorder.this.trash.setVisibility(0);
            StoryRecorder.this.trash.setAlpha(0.0f);
            StoryRecorder.this.trash.clearAnimation();
            StoryRecorder.this.trash.animate().alpha(1.0f).setDuration(180L).setInterpolator(cubicBezierInterpolator).start();
        }

        @Override
        public void onEntityDragTrash(boolean z) {
            StoryRecorder.this.trash.onDragInfo(z, false);
        }
    }

    public void lambda$initViews$5() {
        if (this.currentEditMode != -1 || this.currentPage != 1 || this.captionEdit.keyboardShown || this.timelineView.onBackPressed()) {
            return;
        }
        switchToEditMode(0, true);
        PaintView paintView = this.paintView;
        if (paintView != null) {
            paintView.openText();
            this.paintView.enteredThroughText = true;
        }
    }

    public void lambda$initViews$6() {
        this.videoError = true;
        this.previewButtons.setShareEnabled(false);
        this.downloadButton.showFailedVideo();
    }

    public void lambda$initViews$7(Integer num) {
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

    public void lambda$initViews$8(Integer num) {
        StoryEntry storyEntry = this.outputEntry;
        if (storyEntry != null) {
            storyEntry.period = num.intValue();
            MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
        }
    }

    public void lambda$initViews$9(Boolean bool) {
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

    public void lambda$initViews$10(View view) {
        if (this.awaitingPlayer) {
            return;
        }
        onBackPressed();
    }

    public void lambda$initViews$11(Runnable runnable) {
        applyPaint();
        applyFilter(runnable);
    }

    public void lambda$initViews$12(View view) {
        String string;
        StoryEntry storyEntry = this.outputEntry;
        if (storyEntry == null || this.awaitingPlayer) {
            return;
        }
        storyEntry.muted = !storyEntry.muted;
        boolean z = !TextUtils.isEmpty(storyEntry.audioPath);
        HintView2 hintView2 = this.muteHint;
        if (this.outputEntry.muted) {
            string = LocaleController.getString(z ? R.string.StoryOriginalSoundMuted : R.string.StorySoundMuted);
        } else {
            string = LocaleController.getString(z ? R.string.StoryOriginalSoundNotMuted : R.string.StorySoundNotMuted);
        }
        hintView2.setText(string, this.muteHint.shown());
        this.muteHint.show();
        setIconMuted(this.outputEntry.muted, true);
        this.previewView.mute(this.outputEntry.muted);
    }

    public void lambda$initViews$13(View view) {
        boolean isPlaying = this.previewView.isPlaying();
        this.previewView.play(!isPlaying);
        this.playButton.drawable.setPause(!isPlaying, true);
    }

    public void lambda$initViews$14(View view) {
        CameraSession cameraSession;
        DualCameraView dualCameraView = this.cameraView;
        if (dualCameraView == null || this.awaitingPlayer || (cameraSession = dualCameraView.getCameraSession()) == null) {
            return;
        }
        String currentFlashMode = cameraSession.getCurrentFlashMode();
        String nextFlashMode = cameraSession.getNextFlashMode();
        if (currentFlashMode.equals(nextFlashMode)) {
            return;
        }
        this.cameraView.getCameraSession().setCurrentFlashMode(nextFlashMode);
        setCameraFlashModeIcon(nextFlashMode, true);
    }

    public void lambda$initViews$15(View view) {
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

    public static void lambda$initViews$16() {
        MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) + 1).apply();
    }

    public void lambda$initViews$17(float f) {
        DualCameraView dualCameraView = this.cameraView;
        if (dualCameraView != null) {
            this.cameraZoom = f;
            dualCameraView.setZoom(f);
        }
        showZoomControls(true, true);
    }

    public void lambda$initViews$18(Boolean bool) {
        if (this.takingPhoto || this.takingVideo) {
            return;
        }
        boolean booleanValue = bool.booleanValue();
        this.isVideo = booleanValue;
        showVideoTimer(booleanValue, true);
        this.modeSwitcherView.switchMode(this.isVideo);
        this.recordControl.startAsVideo(this.isVideo);
    }

    public void lambda$initViews$19(Float f) {
        this.recordControl.startAsVideoT(f.floatValue());
    }

    public void lambda$initViews$25(Integer num) {
        StoriesController.StoryLimit checkStoryLimit;
        if (this.outputEntry == null) {
            return;
        }
        this.captionEdit.clearFocus();
        if (num.intValue() == 4) {
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
            } else if (!this.outputEntry.isEdit && (checkStoryLimit = MessagesController.getInstance(this.currentAccount).storiesController.checkStoryLimit()) != null && checkStoryLimit.active(this.currentAccount)) {
                showLimitReachedSheet(checkStoryLimit, false);
            } else {
                this.outputEntry.captionEntitiesAllowed = MessagesController.getInstance(this.currentAccount).storyEntitiesAllowed();
                CaptionStory captionStory2 = this.captionEdit;
                if (captionStory2 != null && !this.outputEntry.captionEntitiesAllowed) {
                    CharSequence text = captionStory2.getText();
                    if ((text instanceof Spannable) && (((TextStyleSpan[]) ((Spannable) text).getSpans(0, text.length(), TextStyleSpan.class)).length > 0 || ((URLSpan[]) ((Spannable) text).getSpans(0, text.length(), URLSpan.class)).length > 0)) {
                        BulletinFactory.of(this.windowView, this.resourcesProvider).createSimpleBulletin(R.raw.voip_invite, premiumText(LocaleController.getString("StoryPremiumFormatting", R.string.StoryPremiumFormatting))).show(true);
                        CaptionStory captionStory3 = this.captionEdit;
                        int i3 = -this.shiftDp;
                        this.shiftDp = i3;
                        AndroidUtilities.shakeViewSpring(captionStory3, i3);
                        return;
                    }
                }
                StoryEntry storyEntry = this.outputEntry;
                if (storyEntry.isEdit) {
                    storyEntry.editedPrivacy = false;
                    applyFilter(null);
                    upload(true);
                    return;
                }
                this.previewView.updatePauseReason(3, true);
                StoryPrivacyBottomSheet whenSelectedRules = new StoryPrivacyBottomSheet(this.activity, this.outputEntry.period, this.resourcesProvider).setValue(this.outputEntry.privacy).setPeer(this.outputEntry.peer).whenDismiss(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        StoryRecorder.this.lambda$initViews$20((StoryPrivacyBottomSheet.StoryPrivacy) obj);
                    }
                }).isEdit(false).setWarnUsers(getUsersFrom(this.captionEdit.getText())).whenSelectedPeer(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        StoryRecorder.this.lambda$initViews$21((TLRPC$InputPeer) obj);
                    }
                }).whenSelectedRules(new StoryPrivacyBottomSheet.DoneCallback() {
                    @Override
                    public final void done(StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, boolean z, boolean z2, TLRPC$InputPeer tLRPC$InputPeer, Runnable runnable) {
                        StoryRecorder.this.lambda$initViews$23(storyPrivacy, z, z2, tLRPC$InputPeer, runnable);
                    }
                }, false);
                this.privacySheet = whenSelectedRules;
                whenSelectedRules.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        StoryRecorder.this.lambda$initViews$24(dialogInterface);
                    }
                });
                this.privacySheet.show();
            }
        } else if (num.intValue() == 0) {
            switchToEditMode(0, true);
            PaintView paintView = this.paintView;
            if (paintView != null) {
                paintView.enteredThroughText = false;
                paintView.openPaint();
            }
        } else if (num.intValue() == 1) {
            switchToEditMode(0, true);
            PaintView paintView2 = this.paintView;
            if (paintView2 != null) {
                paintView2.openText();
                this.paintView.enteredThroughText = true;
            }
        } else if (num.intValue() == 2) {
            createPhotoPaintView();
            hidePhotoPaintView();
            PaintView paintView3 = this.paintView;
            if (paintView3 != null) {
                paintView3.openStickers();
            }
        } else if (num.intValue() == 3) {
            switchToEditMode(1, true);
        }
    }

    public void lambda$initViews$20(StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy) {
        StoryEntry storyEntry = this.outputEntry;
        if (storyEntry != null) {
            storyEntry.privacy = storyPrivacy;
        }
    }

    public void lambda$initViews$21(TLRPC$InputPeer tLRPC$InputPeer) {
        StoryEntry storyEntry = this.outputEntry;
        if (storyEntry == null) {
            return;
        }
        if (tLRPC$InputPeer == null) {
            tLRPC$InputPeer = new TLRPC$TL_inputPeerSelf();
        }
        storyEntry.peer = tLRPC$InputPeer;
    }

    public void lambda$initViews$23(StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, boolean z, boolean z2, TLRPC$InputPeer tLRPC$InputPeer, final Runnable runnable) {
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
        storyEntry2.peer = tLRPC$InputPeer;
        applyFilter(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.lambda$initViews$22(runnable);
            }
        });
    }

    public void lambda$initViews$22(Runnable runnable) {
        runnable.run();
        upload(true);
    }

    public void lambda$initViews$24(DialogInterface dialogInterface) {
        this.previewView.updatePauseReason(3, false);
        this.privacySheet = null;
    }

    public Bitmap getUiBlurBitmap() {
        PreviewView previewView;
        PhotoFilterView photoFilterView = this.photoFilterView;
        Bitmap uiBlurBitmap = photoFilterView != null ? photoFilterView.getUiBlurBitmap() : null;
        return (uiBlurBitmap != null || (previewView = this.previewView) == null || previewView.getTextureView() == null) ? uiBlurBitmap : this.previewView.getTextureView().getUiBlurBitmap();
    }

    private ArrayList<String> getUsersFrom(CharSequence charSequence) {
        URLSpanUserMention[] uRLSpanUserMentionArr;
        ArrayList<String> arrayList = new ArrayList<>();
        if (charSequence instanceof Spanned) {
            for (URLSpanUserMention uRLSpanUserMention : (URLSpanUserMention[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), URLSpanUserMention.class)) {
                if (uRLSpanUserMention != null) {
                    try {
                        TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(Long.parseLong(uRLSpanUserMention.getURL())));
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
                        if (userOrChat instanceof TLRPC$User) {
                            TLRPC$User tLRPC$User = (TLRPC$User) userOrChat;
                            if (!tLRPC$User.bot && !UserObject.isUserSelf(tLRPC$User) && tLRPC$User.id != 777000 && !UserObject.isReplyUser(tLRPC$User) && !arrayList.contains(charSequence2)) {
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
                if (userOrChat2 instanceof TLRPC$User) {
                    TLRPC$User tLRPC$User2 = (TLRPC$User) userOrChat2;
                    if (!tLRPC$User2.bot && !UserObject.isUserSelf(tLRPC$User2) && tLRPC$User2.id != 777000 && !UserObject.isReplyUser(tLRPC$User2) && !arrayList.contains(charSequence3)) {
                        arrayList.add(charSequence3);
                    }
                }
            }
        }
        return arrayList;
    }

    private DraftSavedHint getDraftSavedHint() {
        if (this.draftSavedHint == null) {
            DraftSavedHint draftSavedHint = new DraftSavedHint(getContext());
            this.draftSavedHint = draftSavedHint;
            this.controlContainer.addView(draftSavedHint, LayoutHelper.createFrame(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.draftSavedHint;
    }

    private void upload(final boolean z) {
        if (this.preparingUpload) {
            return;
        }
        this.preparingUpload = true;
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.lambda$upload$27(z);
            }
        });
    }

    public void lambda$upload$27(final boolean z) {
        applyPaint();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.lambda$upload$26(z);
            }
        });
    }

    public void lambda$upload$26(boolean z) {
        this.preparingUpload = false;
        uploadInternal(z);
    }

    private void uploadInternal(final boolean z) {
        if (this.outputEntry == null) {
            close(true);
            return;
        }
        destroyPhotoFilterView();
        prepareThumb(this.outputEntry, false);
        CharSequence text = this.captionEdit.getText();
        StoryEntry storyEntry = this.outputEntry;
        storyEntry.editedCaption = !TextUtils.equals(storyEntry.caption, text);
        this.outputEntry.caption = text;
        MessagesController.getInstance(this.currentAccount).getStoriesController().uploadStory(this.outputEntry, z);
        StoryEntry storyEntry2 = this.outputEntry;
        if (storyEntry2.isDraft && !storyEntry2.isEdit) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().getDraftsController().delete(this.outputEntry);
        }
        this.outputEntry.cancelCheckStickers();
        final long j = UserConfig.getInstance(this.currentAccount).clientUserId;
        TLRPC$InputPeer tLRPC$InputPeer = this.outputEntry.peer;
        if (tLRPC$InputPeer != null && !(tLRPC$InputPeer instanceof TLRPC$TL_inputPeerSelf)) {
            j = DialogObject.getPeerDialogId(tLRPC$InputPeer);
        }
        this.outputEntry = null;
        this.wasSend = true;
        this.forceBackgroundVisible = true;
        checkBackgroundVisibility();
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.lambda$uploadInternal$29(z, j);
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

    public void lambda$uploadInternal$29(boolean z, long j) {
        if (z) {
            SourceView sourceView = this.fromSourceView;
            if (sourceView != null) {
                sourceView.show();
                this.fromSourceView = null;
            }
            ClosingViewProvider closingViewProvider = this.closingSourceProvider;
            SourceView view = closingViewProvider != null ? closingViewProvider.getView(j) : null;
            this.fromSourceView = view;
            if (view != null) {
                this.openType = view.type;
                this.containerView.updateBackground();
                this.previewContainer.setBackgroundColor(this.openType == 1 ? 0 : -14737633);
                this.fromRect.set(this.fromSourceView.screenRect);
                SourceView sourceView2 = this.fromSourceView;
                this.fromRounding = sourceView2.rounding;
                sourceView2.hide();
                if (SharedConfig.getDevicePerformanceClass() > 1) {
                    LiteMode.isEnabled(LiteMode.FLAGS_CHAT);
                }
            }
            this.closingSourceProvider = null;
            Activity activity = this.activity;
            if (activity instanceof LaunchActivity) {
                ((LaunchActivity) activity).drawerLayoutContainer.post(new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.this.lambda$uploadInternal$28();
                    }
                });
                return;
            } else {
                close(true);
                return;
            }
        }
        close(true);
    }

    public void lambda$uploadInternal$28() {
        close(true);
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
        if (storyEntry.isVideo && textureView != null) {
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
            EntitiesContainerView entitiesContainerView = this.paintView.entitiesView;
            entitiesContainerView.drawForThumb = true;
            entitiesContainerView.draw(canvas);
            this.paintView.entitiesView.drawForThumb = false;
            canvas.restore();
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
        File makeCacheFile = StoryEntry.makeCacheFile(this.currentAccount, false);
        try {
            createBitmap.compress(Bitmap.CompressFormat.JPEG, z ? 95 : 75, new FileOutputStream(makeCacheFile));
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

    public void setCameraFlashModeIcon(String str, boolean z) {
        int i;
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
                        StoryRecorder.this.lambda$setCameraFlashModeIcon$30();
                    }
                }).start();
                return;
            }
            this.flashButton.setVisibility(8);
            this.flashButton.setAlpha(0.0f);
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode != 109935) {
                if (hashCode == 3005871 && str.equals("auto")) {
                    c = 1;
                }
            } else if (str.equals("off")) {
                c = 3;
            }
        } else if (str.equals("on")) {
            c = 0;
        }
        if (c == 0) {
            i = R.drawable.media_photo_flash_on2;
            this.flashButton.setContentDescription(LocaleController.getString("AccDescrCameraFlashOn", R.string.AccDescrCameraFlashOn));
        } else if (c == 1) {
            i = R.drawable.media_photo_flash_auto2;
            this.flashButton.setContentDescription(LocaleController.getString("AccDescrCameraFlashAuto", R.string.AccDescrCameraFlashAuto));
        } else {
            i = R.drawable.media_photo_flash_off2;
            this.flashButton.setContentDescription(LocaleController.getString("AccDescrCameraFlashOff", R.string.AccDescrCameraFlashOff));
        }
        if (z && this.flashButtonResId != i) {
            ImageView imageView = this.flashButton;
            this.flashButtonResId = i;
            AndroidUtilities.updateImageViewImageAnimated(imageView, i);
        } else {
            ImageView imageView2 = this.flashButton;
            this.flashButtonResId = i;
            imageView2.setImageResource(i);
        }
        this.flashButton.setVisibility(0);
        if (z) {
            this.flashButton.animate().alpha(1.0f).start();
        } else {
            this.flashButton.setAlpha(1.0f);
        }
    }

    public void lambda$setCameraFlashModeIcon$30() {
        this.flashButton.setVisibility(8);
    }

    public class AnonymousClass10 implements RecordControl.Delegate {
        AnonymousClass10() {
            StoryRecorder.this = r1;
        }

        @Override
        public boolean canRecordAudio() {
            return StoryRecorder.this.requestAudioPermission();
        }

        @Override
        public void onPhotoShoot() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.StoryRecorder.AnonymousClass10.onPhotoShoot():void");
        }

        public void lambda$onPhotoShoot$0(Integer num) {
            int i;
            StoryRecorder.this.takingPhoto = false;
            if (StoryRecorder.this.outputFile == null) {
                return;
            }
            int i2 = -1;
            int i3 = num.intValue() == -1 ? 0 : 90;
            if (num.intValue() == -1) {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(StoryRecorder.this.outputFile.getAbsolutePath(), options);
                    i = options.outWidth;
                    try {
                        i2 = options.outHeight;
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    i = -1;
                }
                if (i > i2) {
                    i3 = 270;
                }
            }
            StoryRecorder storyRecorder = StoryRecorder.this;
            storyRecorder.outputEntry = StoryEntry.fromPhotoShoot(storyRecorder.outputFile, i3);
            StoryPrivacySelector.applySaved(StoryRecorder.this.currentAccount, StoryRecorder.this.outputEntry);
            StoryRecorder.this.fromGallery = false;
            StoryRecorder.this.navigateTo(1, true);
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
            CameraController.getInstance().recordVideo(StoryRecorder.this.cameraView.getCameraSession(), StoryRecorder.this.outputFile, false, new CameraController.VideoTakeCallback() {
                @Override
                public final void onFinishVideoRecording(String str, long j) {
                    StoryRecorder.AnonymousClass10.this.lambda$onVideoRecordStart$2(str, j);
                }
            }, new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.AnonymousClass10.this.lambda$onVideoRecordStart$3(runnable, z);
                }
            }, StoryRecorder.this.cameraView, true);
            if (StoryRecorder.this.isVideo) {
                return;
            }
            StoryRecorder.this.isVideo = true;
            StoryRecorder storyRecorder2 = StoryRecorder.this;
            storyRecorder2.showVideoTimer(storyRecorder2.isVideo, true);
            StoryRecorder.this.modeSwitcherView.switchMode(StoryRecorder.this.isVideo);
            StoryRecorder.this.recordControl.startAsVideo(StoryRecorder.this.isVideo);
        }

        public void lambda$onVideoRecordStart$2(String str, long j) {
            if (StoryRecorder.this.recordControl != null) {
                StoryRecorder.this.recordControl.stopRecordingLoading(true);
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
                    StoryRecorder.AnonymousClass10.this.lambda$onVideoRecordStart$1();
                }
            }, 0L);
        }

        public void lambda$onVideoRecordStart$1() {
            StoryRecorder.this.navigateTo(1, true);
        }

        public void lambda$onVideoRecordStart$3(Runnable runnable, boolean z) {
            int i;
            String str;
            runnable.run();
            HintTextView hintTextView = StoryRecorder.this.hintTextView;
            if (z) {
                i = R.string.StoryHintSwipeToZoom;
                str = "StoryHintSwipeToZoom";
            } else {
                i = R.string.StoryHintPinchToZoom;
                str = "StoryHintPinchToZoom";
            }
            hintTextView.setText(LocaleController.getString(str, i), false);
            StoryRecorder.this.animateRecording(true, true);
            StoryRecorder.this.setAwakeLock(true);
            StoryRecorder.this.videoTimerView.setRecording(true, true);
            StoryRecorder.this.showVideoTimer(true, true);
        }

        @Override
        public void onVideoRecordLocked() {
            StoryRecorder.this.hintTextView.setText(LocaleController.getString("StoryHintPinchToZoom", R.string.StoryHintPinchToZoom), true);
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
                    StoryRecorder.AnonymousClass10.this.lambda$onVideoRecordEnd$4();
                }
            }, z ? 0L : 400L);
        }

        public void lambda$onVideoRecordEnd$4() {
            if (StoryRecorder.this.takingVideo && StoryRecorder.this.stoppingTakingVideo && StoryRecorder.this.cameraView != null) {
                StoryRecorder.this.showZoomControls(false, true);
                CameraController.getInstance().stopVideoRecording(StoryRecorder.this.cameraView.getCameraSessionRecording(), false, false);
            }
        }

        @Override
        public void onVideoDuration(long j) {
            StoryRecorder.this.videoTimerView.setDuration(j, true);
        }

        @Override
        public void onGalleryClick() {
            if (StoryRecorder.this.currentPage == 0 && StoryRecorder.this.requestGalleryPermission()) {
                StoryRecorder.this.lambda$animateGalleryListView$38(true);
            }
        }

        @Override
        public void onFlipClick() {
            if (StoryRecorder.this.cameraView == null || StoryRecorder.this.awaitingPlayer || StoryRecorder.this.takingPhoto || !StoryRecorder.this.cameraView.isInited() || StoryRecorder.this.currentPage != 0) {
                return;
            }
            if (StoryRecorder.this.savedDualHint != null) {
                StoryRecorder.this.savedDualHint.hide();
            }
            StoryRecorder.this.cameraView.switchCamera();
            StoryRecorder storyRecorder = StoryRecorder.this;
            storyRecorder.saveCameraFace(storyRecorder.cameraView.isFrontface());
        }

        @Override
        public void onFlipLongClick() {
            if (StoryRecorder.this.cameraView != null) {
                StoryRecorder.this.cameraView.toggleDual();
            }
        }

        @Override
        public void onZoom(float f) {
            StoryRecorder.this.zoomControlView.setZoom(f, true);
            StoryRecorder.this.showZoomControls(false, true);
        }
    }

    public void setAwakeLock(boolean z) {
        if (z) {
            this.windowLayoutParams.flags |= 128;
        } else {
            this.windowLayoutParams.flags &= -129;
        }
        try {
            this.windowManager.updateViewLayout(this.windowView, this.windowLayoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void animateRecording(final boolean z, boolean z2) {
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
        float f = 1.0f;
        float f2 = 0.0f;
        if (z2) {
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
            Animator[] animatorArr = new Animator[7];
            ImageView imageView = this.backButton;
            Property property = View.ALPHA;
            float[] fArr = new float[1];
            fArr[0] = z ? 0.0f : 1.0f;
            animatorArr[0] = ObjectAnimator.ofFloat(imageView, property, fArr);
            ImageView imageView2 = this.flashButton;
            Property property2 = View.ALPHA;
            float[] fArr2 = new float[1];
            fArr2[0] = (z || this.currentPage != 0) ? 0.0f : 1.0f;
            animatorArr[1] = ObjectAnimator.ofFloat(imageView2, property2, fArr2);
            ToggleButton toggleButton2 = this.dualButton;
            Property property3 = View.ALPHA;
            float[] fArr3 = new float[1];
            fArr3[0] = (z || this.currentPage != 0 || (dualCameraView2 = this.cameraView) == null || !dualCameraView2.dualAvailable()) ? 0.0f : 1.0f;
            animatorArr[2] = ObjectAnimator.ofFloat(toggleButton2, property3, fArr3);
            HintTextView hintTextView = this.hintTextView;
            Property property4 = View.ALPHA;
            float[] fArr4 = new float[1];
            fArr4[0] = (z && this.currentPage == 0) ? 1.0f : 0.0f;
            animatorArr[3] = ObjectAnimator.ofFloat(hintTextView, property4, fArr4);
            HintTextView hintTextView2 = this.hintTextView;
            Property property5 = View.TRANSLATION_Y;
            float[] fArr5 = new float[1];
            fArr5[0] = (z || this.currentPage != 0) ? 0.0f : AndroidUtilities.dp(16.0f);
            animatorArr[4] = ObjectAnimator.ofFloat(hintTextView2, property5, fArr5);
            PhotoVideoSwitcherView photoVideoSwitcherView = this.modeSwitcherView;
            Property property6 = View.ALPHA;
            float[] fArr6 = new float[1];
            fArr6[0] = (z || this.currentPage != 0) ? 0.0f : 0.0f;
            animatorArr[5] = ObjectAnimator.ofFloat(photoVideoSwitcherView, property6, fArr6);
            PhotoVideoSwitcherView photoVideoSwitcherView2 = this.modeSwitcherView;
            Property property7 = View.TRANSLATION_Y;
            float[] fArr7 = new float[1];
            if (z || this.currentPage != 0) {
                f2 = AndroidUtilities.dp(16.0f);
            }
            fArr7[0] = f2;
            animatorArr[6] = ObjectAnimator.ofFloat(photoVideoSwitcherView2, property7, fArr7);
            animatorSet2.playTogether(animatorArr);
            this.recordingAnimator.addListener(new AnimatorListenerAdapter() {
                {
                    StoryRecorder.this = this;
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    if (z) {
                        StoryRecorder.this.backButton.setVisibility(8);
                    }
                    if (z || StoryRecorder.this.currentPage != 0) {
                        StoryRecorder.this.flashButton.setVisibility(8);
                    }
                }
            });
            this.recordingAnimator.setDuration(260L);
            this.recordingAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.recordingAnimator.start();
            return;
        }
        this.backButton.setAlpha(z ? 0.0f : 1.0f);
        this.backButton.setVisibility(z ? 8 : 0);
        this.flashButton.setAlpha((z || this.currentPage != 0) ? 0.0f : 1.0f);
        this.flashButton.setVisibility((z || this.currentPage != 0) ? 8 : 0);
        this.dualButton.setAlpha((z || this.currentPage != 0) ? 0.0f : 1.0f);
        ToggleButton toggleButton3 = this.dualButton;
        if (!z && this.currentPage == 0 && (dualCameraView = this.cameraView) != null && dualCameraView.dualAvailable()) {
            i = 0;
        }
        toggleButton3.setVisibility(i);
        this.hintTextView.setAlpha((z && this.currentPage == 0) ? 1.0f : 0.0f);
        this.hintTextView.setTranslationY((z || this.currentPage != 0) ? 0.0f : AndroidUtilities.dp(16.0f));
        this.modeSwitcherView.setAlpha((z || this.currentPage != 0) ? 0.0f : 0.0f);
        PhotoVideoSwitcherView photoVideoSwitcherView3 = this.modeSwitcherView;
        if (z || this.currentPage != 0) {
            f2 = AndroidUtilities.dp(16.0f);
        }
        photoVideoSwitcherView3.setTranslationY(f2);
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
                    StoryRecorder.this.lambda$showVideoTimer$31(z);
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

    public void lambda$showVideoTimer$31(boolean z) {
        if (z) {
            return;
        }
        this.videoTimerView.setRecording(false, false);
    }

    public void showZoomControls(final boolean z, boolean z2) {
        if ((this.zoomControlView.getTag() != null && z) || (this.zoomControlView.getTag() == null && !z)) {
            if (z) {
                Runnable runnable = this.zoomControlHideRunnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                Runnable runnable2 = new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.this.lambda$showZoomControls$32();
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
        AnimatorSet animatorSet3 = this.zoomControlAnimation;
        Animator[] animatorArr = new Animator[1];
        ZoomControlView zoomControlView = this.zoomControlView;
        Property property = View.ALPHA;
        float[] fArr = new float[1];
        fArr[0] = z ? 1.0f : 0.0f;
        animatorArr[0] = ObjectAnimator.ofFloat(zoomControlView, property, fArr);
        animatorSet3.playTogether(animatorArr);
        this.zoomControlAnimation.addListener(new AnimatorListenerAdapter() {
            {
                StoryRecorder.this = this;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (!z) {
                    StoryRecorder.this.zoomControlView.setVisibility(8);
                }
                StoryRecorder.this.zoomControlAnimation = null;
            }
        });
        this.zoomControlAnimation.start();
        if (z) {
            Runnable runnable3 = new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.this.lambda$showZoomControls$33();
                }
            };
            this.zoomControlHideRunnable = runnable3;
            AndroidUtilities.runOnUIThread(runnable3, 2000L);
        }
    }

    public void lambda$showZoomControls$32() {
        showZoomControls(false, true);
        this.zoomControlHideRunnable = null;
    }

    public void lambda$showZoomControls$33() {
        showZoomControls(false, true);
        this.zoomControlHideRunnable = null;
    }

    public boolean onBackPressed() {
        StoryEntry storyEntry;
        PaintView paintView;
        StoryEntry storyEntry2;
        PaintView paintView2;
        if (this.takingVideo) {
            this.recordControl.stopRecording();
            return false;
        } else if (this.takingPhoto || this.captionEdit.onBackPressed()) {
            return false;
        } else {
            GalleryListView galleryListView = this.galleryListView;
            if (galleryListView != null) {
                if (galleryListView.onBackPressed()) {
                    return false;
                }
                lambda$animateGalleryListView$38(false);
                this.lastGallerySelectedAlbum = null;
                return false;
            } else if (this.currentEditMode == 0 && (paintView2 = this.paintView) != null && paintView2.onBackPressed()) {
                return false;
            } else {
                if (this.currentEditMode > -1) {
                    switchToEditMode(-1, true);
                    return false;
                } else if (this.currentPage == 1 && ((storyEntry = this.outputEntry) == null || !storyEntry.isEdit)) {
                    PaintView paintView3 = this.paintView;
                    if (paintView3 == null || !paintView3.onBackPressed()) {
                        if ((this.fromGallery && (((paintView = this.paintView) == null || !paintView.hasChanges()) && ((storyEntry2 = this.outputEntry) == null || storyEntry2.filterFile == null))) || !this.previewButtons.isShareEnabled()) {
                            navigateTo(0, true);
                        } else {
                            showDismissEntry();
                        }
                        return false;
                    }
                    return false;
                } else {
                    close(true);
                    return true;
                }
            }
        }
    }

    public void navigateToPreviewWithPlayerAwait(final Runnable runnable, long j) {
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
                StoryRecorder.this.lambda$navigateToPreviewWithPlayerAwait$34(runnable);
            }
        };
        this.previewView.setAlpha(0.0f);
        this.previewView.setVisibility(0);
        this.previewView.set(this.outputEntry, this.afterPlayerAwait, j);
        this.previewView.setupAudio(this.outputEntry, false);
        AndroidUtilities.runOnUIThread(this.afterPlayerAwait, 400L);
    }

    public void lambda$navigateToPreviewWithPlayerAwait$34(Runnable runnable) {
        lambda$animateGalleryListView$38(false);
        AndroidUtilities.cancelRunOnUIThread(this.afterPlayerAwait);
        this.afterPlayerAwait = null;
        this.awaitingPlayer = false;
        runnable.run();
    }

    public void navigateTo(final int i, boolean z) {
        StoryEntry storyEntry;
        DualCameraView dualCameraView;
        StoryEntry storyEntry2;
        DualCameraView dualCameraView2;
        final int i2 = this.currentPage;
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
            previewButtons.appear(i == 1 && this.openProgress > 0.0f, z);
        }
        showVideoTimer(i == 0 && this.isVideo, z);
        if (i != 1) {
            this.videoTimeView.show(false, z);
        }
        if (z) {
            this.pageAnimator = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            DualCameraView dualCameraView3 = this.cameraView;
            if (dualCameraView3 != null) {
                Property property = View.ALPHA;
                float[] fArr = new float[1];
                fArr[0] = i == 0 ? 1.0f : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(dualCameraView3, property, fArr));
            }
            this.cameraViewThumb.setVisibility(0);
            ImageView imageView = this.cameraViewThumb;
            Property property2 = View.ALPHA;
            float[] fArr2 = new float[1];
            fArr2[0] = i == 0 ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(imageView, property2, fArr2));
            PreviewView previewView = this.previewView;
            Property property3 = View.ALPHA;
            float[] fArr3 = new float[1];
            fArr3[0] = i == 1 ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(previewView, property3, fArr3));
            RecordControl recordControl = this.recordControl;
            Property property4 = View.ALPHA;
            float[] fArr4 = new float[1];
            fArr4[0] = i == 0 ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(recordControl, property4, fArr4));
            ImageView imageView2 = this.flashButton;
            Property property5 = View.ALPHA;
            float[] fArr5 = new float[1];
            fArr5[0] = i == 0 ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(imageView2, property5, fArr5));
            ToggleButton toggleButton = this.dualButton;
            Property property6 = View.ALPHA;
            float[] fArr6 = new float[1];
            fArr6[0] = (i == 0 && (dualCameraView2 = this.cameraView) != null && dualCameraView2.dualAvailable()) ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(toggleButton, property6, fArr6));
            RecordControl recordControl2 = this.recordControl;
            Property property7 = View.TRANSLATION_Y;
            float[] fArr7 = new float[1];
            fArr7[0] = i == 0 ? 0.0f : AndroidUtilities.dp(24.0f);
            arrayList.add(ObjectAnimator.ofFloat(recordControl2, property7, fArr7));
            PhotoVideoSwitcherView photoVideoSwitcherView = this.modeSwitcherView;
            Property property8 = View.ALPHA;
            float[] fArr8 = new float[1];
            fArr8[0] = i == 0 ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(photoVideoSwitcherView, property8, fArr8));
            PhotoVideoSwitcherView photoVideoSwitcherView2 = this.modeSwitcherView;
            Property property9 = View.TRANSLATION_Y;
            float[] fArr9 = new float[1];
            fArr9[0] = i == 0 ? 0.0f : AndroidUtilities.dp(24.0f);
            arrayList.add(ObjectAnimator.ofFloat(photoVideoSwitcherView2, property9, fArr9));
            this.backButton.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(this.backButton, View.ALPHA, 1.0f));
            HintTextView hintTextView = this.hintTextView;
            Property property10 = View.ALPHA;
            float[] fArr10 = new float[1];
            fArr10[0] = (i == 0 && this.animatedRecording) ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(hintTextView, property10, fArr10));
            FrameLayout frameLayout = this.captionContainer;
            Property property11 = View.ALPHA;
            float[] fArr11 = new float[1];
            fArr11[0] = i == 1 ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, property11, fArr11));
            FrameLayout frameLayout2 = this.captionContainer;
            Property property12 = View.TRANSLATION_Y;
            float[] fArr12 = new float[1];
            fArr12[0] = i == 1 ? 0.0f : AndroidUtilities.dp(12.0f);
            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property12, fArr12));
            SimpleTextView simpleTextView = this.titleTextView;
            Property property13 = View.ALPHA;
            float[] fArr13 = new float[1];
            fArr13[0] = i == 1 ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(simpleTextView, property13, fArr13));
            TimelineView timelineView = this.timelineView;
            Property property14 = View.ALPHA;
            float[] fArr14 = new float[1];
            fArr14[0] = i == 1 ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(timelineView, property14, fArr14));
            RLottieImageView rLottieImageView = this.muteButton;
            Property property15 = View.ALPHA;
            float[] fArr15 = new float[1];
            fArr15[0] = (i == 1 && this.isVideo) ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(rLottieImageView, property15, fArr15));
            ((ViewGroup.MarginLayoutParams) this.playButton.getLayoutParams()).rightMargin = AndroidUtilities.dp((this.isVideo ? 48 : 0) + 48);
            PlayPauseButton playPauseButton = this.playButton;
            Property property16 = View.ALPHA;
            float[] fArr16 = new float[1];
            fArr16[0] = (i != 1 || (!this.isVideo && ((storyEntry2 = this.outputEntry) == null || TextUtils.isEmpty(storyEntry2.audioPath)))) ? 0.0f : 1.0f;
            arrayList.add(ObjectAnimator.ofFloat(playPauseButton, property16, fArr16));
            DownloadButton downloadButton = this.downloadButton;
            Property property17 = View.ALPHA;
            float[] fArr17 = new float[1];
            fArr17[0] = i != 1 ? 0.0f : 1.0f;
            arrayList.add(ObjectAnimator.ofFloat(downloadButton, property17, fArr17));
            arrayList.add(ObjectAnimator.ofFloat(this.zoomControlView, View.ALPHA, 0.0f));
            this.pageAnimator.playTogether(arrayList);
            this.pageAnimator.addListener(new AnimatorListenerAdapter() {
                {
                    StoryRecorder.this = this;
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    StoryRecorder.this.onNavigateEnd(i2, i);
                }
            });
            this.pageAnimator.setDuration(460L);
            this.pageAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.pageAnimator.start();
            return;
        }
        DualCameraView dualCameraView4 = this.cameraView;
        if (dualCameraView4 != null) {
            dualCameraView4.setAlpha(i == 0 ? 1.0f : 0.0f);
        }
        this.cameraViewThumb.setAlpha(i == 0 ? 1.0f : 0.0f);
        this.cameraViewThumb.setVisibility(i == 0 ? 0 : 8);
        this.previewView.setAlpha(i == 1 ? 1.0f : 0.0f);
        this.flashButton.setAlpha(i == 0 ? 1.0f : 0.0f);
        this.dualButton.setAlpha((i == 0 && (dualCameraView = this.cameraView) != null && dualCameraView.dualAvailable()) ? 1.0f : 0.0f);
        this.recordControl.setAlpha(i == 0 ? 1.0f : 0.0f);
        this.recordControl.setTranslationY(i == 0 ? 0.0f : AndroidUtilities.dp(16.0f));
        this.modeSwitcherView.setAlpha(i == 0 ? 1.0f : 0.0f);
        this.modeSwitcherView.setTranslationY(i == 0 ? 0.0f : AndroidUtilities.dp(16.0f));
        this.backButton.setVisibility(0);
        this.backButton.setAlpha(1.0f);
        this.hintTextView.setAlpha((i == 0 && this.animatedRecording) ? 1.0f : 0.0f);
        this.captionContainer.setAlpha(i == 1 ? 1.0f : 0.0f);
        this.captionContainer.setTranslationY(i == 1 ? 0.0f : AndroidUtilities.dp(12.0f));
        this.muteButton.setAlpha((i == 1 && this.isVideo) ? 1.0f : 0.0f);
        ((ViewGroup.MarginLayoutParams) this.playButton.getLayoutParams()).rightMargin = AndroidUtilities.dp((this.isVideo ? 48 : 0) + 48);
        this.playButton.setAlpha((i != 1 || (!this.isVideo && ((storyEntry = this.outputEntry) == null || TextUtils.isEmpty(storyEntry.audioPath)))) ? 0.0f : 1.0f);
        this.downloadButton.setAlpha(i == 1 ? 1.0f : 0.0f);
        this.timelineView.setAlpha(i == 1 ? 1.0f : 0.0f);
        this.titleTextView.setAlpha(i == 1 ? 1.0f : 0.0f);
        onNavigateEnd(i2, i);
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
                StoryRecorder.this.lambda$animateContainerBack$35(translationY1, translationY2, valueAnimator2);
            }
        });
        this.containerViewBackAnimator.setDuration(340L);
        this.containerViewBackAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.containerViewBackAnimator.addListener(new AnimatorListenerAdapter() {
            {
                StoryRecorder.this = this;
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

    public void lambda$animateContainerBack$35(float f, float f2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.containerView.setTranslationY(f * floatValue);
        this.containerView.setTranslationY2(f2 * floatValue);
    }

    public void createGalleryListView() {
        createGalleryListView(false);
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

    public void createGalleryListView(final boolean z) {
        if (this.galleryListView != null || getContext() == null) {
            return;
        }
        AnonymousClass15 anonymousClass15 = new AnonymousClass15(this.currentAccount, getContext(), this.resourcesProvider, this.lastGallerySelectedAlbum, z);
        this.galleryListView = anonymousClass15;
        anonymousClass15.allowSearch(z);
        this.galleryListView.setOnBackClickListener(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.this.lambda$createGalleryListView$36();
            }
        });
        this.galleryListView.setOnSelectListener(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                StoryRecorder.this.lambda$createGalleryListView$37(z, obj, (Bitmap) obj2);
            }
        });
        Parcelable parcelable = this.lastGalleryScrollPosition;
        if (parcelable != null) {
            this.galleryListView.layoutManager.onRestoreInstanceState(parcelable);
        }
        this.windowView.addView(this.galleryListView, LayoutHelper.createFrame(-1, -1, 119));
    }

    public class AnonymousClass15 extends GalleryListView {
        AnonymousClass15(int i, Context context, Theme.ResourcesProvider resourcesProvider, MediaController.AlbumEntry albumEntry, boolean z) {
            super(i, context, resourcesProvider, albumEntry, z);
            StoryRecorder.this = r7;
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
                        StoryRecorder.AnonymousClass15.this.lambda$onFullScreen$0();
                    }
                });
            }
        }

        public void lambda$onFullScreen$0() {
            StoryRecorder.this.destroyCameraView(true);
            StoryRecorder.this.cameraViewThumb.setImageDrawable(StoryRecorder.this.getCameraThumb());
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < top()) {
                StoryRecorder.this.galleryClosing = true;
                StoryRecorder.this.lambda$animateGalleryListView$38(false);
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    public void lambda$createGalleryListView$36() {
        lambda$animateGalleryListView$38(false);
        this.lastGallerySelectedAlbum = null;
    }

    public void lambda$createGalleryListView$37(boolean z, Object obj, Bitmap bitmap) {
        if (obj == null || this.galleryListViewOpening != null || this.scrollingY || !isGalleryOpen()) {
            return;
        }
        if (z) {
            if (this.outputEntry == null) {
                return;
            }
            createPhotoPaintView();
            this.outputEntry.editedMedia = true;
            if (obj instanceof MediaController.PhotoEntry) {
                PaintView paintView = this.paintView;
                paintView.appearAnimation(paintView.createPhoto(((MediaController.PhotoEntry) obj).path, false));
            } else if (obj instanceof TLObject) {
                PaintView paintView2 = this.paintView;
                paintView2.appearAnimation(paintView2.createPhoto((TLObject) obj, false));
            }
            lambda$animateGalleryListView$38(false);
        } else {
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
                }
                this.isVideo = storyEntry.isVideo;
                this.outputEntry = storyEntry;
                storyEntry.blurredVideoThumb = bitmap;
                this.fromGallery = false;
            }
            showVideoTimer(false, true);
            this.modeSwitcherView.switchMode(this.isVideo);
            this.recordControl.startAsVideo(this.isVideo);
            lambda$animateGalleryListView$38(false);
            navigateTo(1, true);
        }
        GalleryListView galleryListView = this.galleryListView;
        if (galleryListView != null) {
            this.lastGalleryScrollPosition = galleryListView.layoutManager.onSaveInstanceState();
            this.lastGallerySelectedAlbum = this.galleryListView.getSelectedAlbum();
        }
    }

    public boolean isGalleryOpen() {
        GalleryListView galleryListView;
        return (this.scrollingY || (galleryListView = this.galleryListView) == null || galleryListView.getTranslationY() >= ((float) ((this.windowView.getMeasuredHeight() - ((int) (((float) AndroidUtilities.displaySize.y) * 0.35f))) - (AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight())))) ? false : true;
    }

    public void lambda$animateGalleryListView$38(final boolean z) {
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
                        StoryRecorder.this.lambda$animateGalleryListView$38(z);
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
                        StoryRecorder.this.lambda$animateGalleryListView$39(height, dynamicAnimation, z2, f, f2);
                    }
                });
                this.galleryOpenCloseSpringAnimator.start();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.galleryOpenCloseAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        StoryRecorder.this.lambda$animateGalleryListView$40(valueAnimator2);
                    }
                });
                this.galleryOpenCloseAnimator.addListener(new AnimatorListenerAdapter() {
                    {
                        StoryRecorder.this = this;
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

    public void lambda$animateGalleryListView$39(float f, DynamicAnimation dynamicAnimation, boolean z, float f2, float f3) {
        if (z) {
            return;
        }
        this.galleryListView.setTranslationY(f);
        this.galleryListView.ignoreScroll = false;
        this.galleryOpenCloseSpringAnimator = null;
        this.galleryListViewOpening = null;
    }

    public void lambda$animateGalleryListView$40(ValueAnimator valueAnimator) {
        this.galleryListView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void onNavigateStart(int i, int i2) {
        StoryEntry storyEntry;
        int i3;
        String str;
        StoryEntry storyEntry2;
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
            StoryEntry storyEntry3 = this.outputEntry;
            if (storyEntry3 != null) {
                storyEntry3.destroy(false);
                this.outputEntry = null;
            }
        }
        if (i == 0) {
            setCameraFlashModeIcon(null, true);
            saveLastCameraBitmap(new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.this.lambda$onNavigateStart$41();
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
                StoryEntry storyEntry4 = this.outputEntry;
                setIconMuted(storyEntry4 != null && storyEntry4.muted, false);
                this.playButton.setVisibility(0);
                this.previewView.play(true);
                this.playButton.drawable.setPause(this.previewView.isPlaying(), false);
                this.titleTextView.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                StoryEntry storyEntry5 = this.outputEntry;
                if (storyEntry5 != null && !TextUtils.isEmpty(storyEntry5.audioPath)) {
                    this.muteButton.setVisibility(8);
                    this.playButton.setVisibility(0);
                    this.playButton.drawable.setPause(true, false);
                    this.titleTextView.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.titleTextView.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.downloadButton.setVisibility(0);
            this.previewButtons.setVisibility(0);
            this.previewView.setVisibility(0);
            this.captionContainer.setVisibility(0);
            this.captionContainer.clearFocus();
            CaptionStory captionStory = this.captionEdit;
            StoryEntry storyEntry6 = this.outputEntry;
            captionStory.setPeriod(storyEntry6 == null ? 86400 : storyEntry6.period, false);
            this.captionEdit.setPeriodVisible(!MessagesController.getInstance(this.currentAccount).premiumLocked && ((storyEntry = this.outputEntry) == null || !storyEntry.isEdit));
        }
        if (i2 == 1) {
            this.videoError = false;
            PreviewButtons previewButtons = this.previewButtons;
            StoryEntry storyEntry7 = this.outputEntry;
            if (storyEntry7 == null || !storyEntry7.isEdit) {
                i3 = R.string.Next;
                str = "Next";
            } else {
                i3 = R.string.Done;
                str = "Done";
            }
            previewButtons.setShareText(LocaleController.getString(str, i3));
            if (!this.previewAlreadySet) {
                this.previewView.set(this.outputEntry);
                this.previewView.setupAudio(this.outputEntry, false);
            }
            this.previewAlreadySet = false;
            this.captionEdit.editText.getEditText().setOnPremiumMenuLockClickListener(MessagesController.getInstance(this.currentAccount).storyEntitiesAllowed() ? null : new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.this.lambda$onNavigateStart$42();
                }
            });
            StoryEntry storyEntry8 = this.outputEntry;
            if (storyEntry8 != null && (storyEntry8.isDraft || storyEntry8.isEdit)) {
                if (storyEntry8.paintFile != null) {
                    destroyPhotoPaintView();
                    createPhotoPaintView();
                    hidePhotoPaintView();
                }
                StoryEntry storyEntry9 = this.outputEntry;
                if (storyEntry9.isVideo && storyEntry9.filterState != null && (textureView = this.previewView.getTextureView()) != null) {
                    textureView.setDelegate(new VideoEditTextureView.VideoEditTextureViewDelegate() {
                        @Override
                        public final void onEGLThreadAvailable(FilterGLThread filterGLThread) {
                            StoryRecorder.this.lambda$onNavigateStart$43(filterGLThread);
                        }
                    });
                }
                this.captionEdit.setText(this.outputEntry.caption);
            } else {
                this.captionEdit.clear();
            }
            this.previewButtons.setShareEnabled((this.videoError || this.captionEdit.isCaptionOverLimit() || (MessagesController.getInstance(this.currentAccount).getStoriesController().hasStoryLimit() && ((storyEntry2 = this.outputEntry) == null || !storyEntry2.isEdit))) ? false : true);
            RLottieImageView rLottieImageView = this.muteButton;
            StoryEntry storyEntry10 = this.outputEntry;
            rLottieImageView.setImageResource((storyEntry10 == null || !storyEntry10.muted) ? R.drawable.media_mute : R.drawable.media_unmute);
            this.previewView.setVisibility(0);
            this.timelineView.setVisibility(0);
            this.titleTextView.setVisibility(0);
            SimpleTextView simpleTextView = this.titleTextView;
            StoryEntry storyEntry11 = this.outputEntry;
            simpleTextView.setText(LocaleController.getString((storyEntry11 == null || !storyEntry11.isEdit) ? R.string.RecorderNewStory : R.string.RecorderEditStory));
        }
        if (i == 1) {
            this.captionEdit.hidePeriodPopup();
            this.muteHint.hide();
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
        CaptionStory captionStory2 = this.captionEdit;
        if (captionStory2 != null) {
            captionStory2.closeKeyboard();
            this.captionEdit.ignoreTouches = true;
        }
        PreviewView previewView = this.previewView;
        if (previewView != null) {
            previewView.updatePauseReason(8, i2 != 1);
        }
    }

    public void lambda$onNavigateStart$41() {
        this.cameraViewThumb.setImageDrawable(getCameraThumb());
    }

    public void lambda$onNavigateStart$42() {
        BulletinFactory.of(this.windowView, this.resourcesProvider).createSimpleBulletin(R.raw.voip_invite, premiumText(LocaleController.getString("StoryPremiumFormatting", R.string.StoryPremiumFormatting))).show(true);
    }

    public void lambda$onNavigateStart$43(FilterGLThread filterGLThread) {
        StoryEntry storyEntry;
        MediaController.SavedFilterState savedFilterState;
        if (filterGLThread == null || (storyEntry = this.outputEntry) == null || (savedFilterState = storyEntry.filterState) == null) {
            return;
        }
        filterGLThread.setFilterGLThreadDelegate(FilterShaders.getFilterShadersDelegate(savedFilterState));
    }

    public void onNavigateEnd(int i, int i2) {
        int i3;
        int i4 = 8;
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
        if (i == 1) {
            this.previewButtons.setVisibility(8);
            this.previewView.setVisibility(8);
            this.captionContainer.setVisibility(8);
            this.muteButton.setVisibility(8);
            this.playButton.setVisibility(8);
            this.downloadButton.setVisibility(8);
            this.previewView.setVisibility(8);
            this.timelineView.setVisibility(8);
            destroyPhotoPaintView();
            destroyPhotoFilterView();
            this.titleTextView.setVisibility(8);
            destroyGalleryListView();
            this.trash.setAlpha(0.0f);
            this.trash.setVisibility(8);
            this.videoTimeView.setVisibility(8);
        }
        if (i2 == 1) {
            createPhotoPaintView();
            hidePhotoPaintView();
            createFilterPhotoView();
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
            StoryEntry storyEntry = this.outputEntry;
            if (storyEntry != null && storyEntry.duration >= 30000) {
                i4 = 0;
            }
            videoTimeView.setVisibility(i4);
            this.captionContainer.setAlpha(1.0f);
            this.captionContainer.setTranslationY(0.0f);
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
        CaptionStory captionStory = this.captionEdit;
        if (captionStory != null) {
            captionStory.ignoreTouches = i2 != 1;
        }
        if (i2 == 1) {
            MediaDataController.getInstance(this.currentAccount).checkStickers(0);
            MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
            MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
            MessagesController.getInstance(this.currentAccount).getStoriesController().loadBlocklistAtFirst();
            MessagesController.getInstance(this.currentAccount).getStoriesController().loadSendAs();
        }
    }

    public void switchToEditMode(final int r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.StoryRecorder.switchToEditMode(int, boolean):void");
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

    private void createPhotoPaintView() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.StoryRecorder.createPhotoPaintView():void");
    }

    public class AnonymousClass18 extends PaintView {
        private boolean multitouch;

        AnonymousClass18(Context context, boolean z, File file, boolean z2, WindowView windowView, Activity activity, int i, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i2, ArrayList arrayList, int i3, int i4, MediaController.CropState cropState, Runnable runnable, BlurringShader.BlurManager blurManager, Theme.ResourcesProvider resourcesProvider) {
            super(context, z, file, z2, windowView, activity, i, bitmap, bitmap2, bitmap3, i2, arrayList, i3, i4, cropState, runnable, blurManager, resourcesProvider);
            StoryRecorder.this = r21;
        }

        @Override
        public void onEntityDraggedTop(boolean z) {
            StoryRecorder.this.previewHighlight.show(true, z, StoryRecorder.this.actionBarContainer);
        }

        @Override
        protected void onGalleryClick() {
            StoryRecorder.this.captionEdit.keyboardNotifier.ignore(true);
            StoryRecorder.this.destroyGalleryListView();
            StoryRecorder.this.createGalleryListView(true);
            StoryRecorder.this.lambda$animateGalleryListView$38(true);
        }

        @Override
        public void onEntityDraggedBottom(boolean z) {
            StoryRecorder.this.previewHighlight.updateCaption(StoryRecorder.this.captionEdit.getText());
            StoryRecorder.this.previewHighlight.show(false, z && this.multitouch, null);
        }

        @Override
        public void onEntityDragEnd(boolean z) {
            StoryRecorder.this.captionContainer.clearAnimation();
            ViewPropertyAnimator duration = StoryRecorder.this.captionContainer.animate().alpha(1.0f).setDuration(180L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            StoryRecorder.this.trash.onDragInfo(false, z);
            StoryRecorder.this.trash.clearAnimation();
            StoryRecorder.this.trash.animate().alpha(0.0f).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.AnonymousClass18.this.lambda$onEntityDragEnd$0();
                }
            }).setDuration(180L).setInterpolator(cubicBezierInterpolator).setStartDelay(z ? 500L : 0L).start();
            if (z) {
                removeCurrentEntity();
            }
            super.onEntityDragEnd(z);
            this.multitouch = false;
        }

        public void lambda$onEntityDragEnd$0() {
            StoryRecorder.this.trash.setVisibility(8);
        }

        @Override
        public void onEntityDragStart() {
            StoryRecorder.this.paintView.showReactionsLayout(false);
            StoryRecorder.this.captionContainer.clearAnimation();
            ViewPropertyAnimator duration = StoryRecorder.this.captionContainer.animate().alpha(0.0f).setDuration(180L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            StoryRecorder.this.trash.setVisibility(0);
            StoryRecorder.this.trash.setAlpha(0.0f);
            StoryRecorder.this.trash.clearAnimation();
            StoryRecorder.this.trash.animate().alpha(1.0f).setDuration(180L).setInterpolator(cubicBezierInterpolator).start();
        }

        @Override
        public void onEntityDragMultitouchStart() {
            this.multitouch = true;
            StoryRecorder.this.paintView.showReactionsLayout(false);
            StoryRecorder.this.trash.onDragInfo(false, false);
            StoryRecorder.this.trash.clearAnimation();
            StoryRecorder.this.trash.animate().alpha(0.0f).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.AnonymousClass18.this.lambda$onEntityDragMultitouchStart$1();
                }
            }).setDuration(180L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
        }

        public void lambda$onEntityDragMultitouchStart$1() {
            StoryRecorder.this.trash.setVisibility(8);
        }

        @Override
        public void onEntityDragMultitouchEnd() {
            this.multitouch = false;
            StoryRecorder.this.trash.setVisibility(0);
            StoryRecorder.this.trash.setAlpha(0.0f);
            StoryRecorder.this.trash.clearAnimation();
            StoryRecorder.this.trash.animate().alpha(1.0f).setDuration(180L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
            StoryRecorder.this.previewHighlight.show(false, false, null);
        }

        @Override
        public void onEntityDragTrash(boolean z) {
            StoryRecorder.this.trash.onDragInfo(z, false);
        }

        @Override
        public void editSelectedTextEntity() {
            StoryRecorder.this.captionEdit.editText.closeKeyboard();
            StoryRecorder.this.switchToEditMode(0, true);
            super.editSelectedTextEntity();
        }

        @Override
        public void dismiss() {
            StoryRecorder.this.captionEdit.editText.closeKeyboard();
            StoryRecorder.this.switchToEditMode(-1, true);
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
        public void onAudioSelect(MessageObject messageObject) {
            StoryRecorder.this.previewView.setupAudio(messageObject, true);
            if (StoryRecorder.this.outputEntry != null && !StoryRecorder.this.isVideo) {
                final boolean z = !TextUtils.isEmpty(StoryRecorder.this.outputEntry.audioPath);
                StoryRecorder.this.playButton.drawable.setPause(!StoryRecorder.this.previewView.isPlaying(), false);
                ((ViewGroup.MarginLayoutParams) StoryRecorder.this.playButton.getLayoutParams()).rightMargin = AndroidUtilities.dp((StoryRecorder.this.isVideo ? 48 : 0) + 48);
                StoryRecorder.this.playButton.setVisibility(0);
                StoryRecorder.this.playButton.animate().alpha(z ? 1.0f : 0.0f).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.AnonymousClass18.this.lambda$onAudioSelect$2(z);
                    }
                }).start();
            }
            StoryRecorder.this.switchToEditMode(-1, true);
        }

        public void lambda$onAudioSelect$2(boolean z) {
            if (z) {
                return;
            }
            StoryRecorder.this.playButton.setVisibility(8);
        }

        @Override
        public void onEntityHandleTouched() {
            StoryRecorder.this.paintView.showReactionsLayout(false);
        }

        @Override
        protected boolean checkAudioPermission(Runnable runnable) {
            if (StoryRecorder.this.activity == null) {
                return true;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                if (StoryRecorder.this.activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                    StoryRecorder.this.activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
                    StoryRecorder.this.audioGrantedCallback = runnable;
                    return false;
                }
            } else if (i >= 23 && StoryRecorder.this.activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                StoryRecorder.this.activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
                StoryRecorder.this.audioGrantedCallback = runnable;
                return false;
            }
            return true;
        }
    }

    public void lambda$createPhotoPaintView$44() {
        switchToEditMode(-1, true);
    }

    public void lambda$createPhotoPaintView$45() {
        switchToEditMode(-1, true);
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
            this.titleTextView.setVisibility(0);
            if (this.isVideo) {
                this.muteButton.setVisibility(0);
                this.playButton.setVisibility(0);
            } else {
                StoryEntry storyEntry = this.outputEntry;
                if (storyEntry != null && !TextUtils.isEmpty(storyEntry.audioPath)) {
                    this.muteButton.setVisibility(8);
                    this.playButton.setVisibility(0);
                }
            }
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
            this.timelineView.setVisibility(8);
            this.titleTextView.setVisibility(8);
        }
        boolean z = true;
        this.previewView.setAllowCropping(i2 == -1);
        if ((i2 == 0 || i == 0) && (paintView = this.paintView) != null) {
            paintView.onAnimationStateChanged(false);
        }
        PhotoFilterView.EnhanceView enhanceView = this.photoFilterEnhanceView;
        if (enhanceView != null) {
            if (i2 != 1 && i2 != -1) {
                z = false;
            }
            enhanceView.setAllowTouch(z);
        }
    }

    private void applyPaint() {
        StoryEntry storyEntry;
        if (this.paintView == null || (storyEntry = this.outputEntry) == null) {
            return;
        }
        storyEntry.clearPaint();
        this.outputEntry.editedMedia |= this.paintView.hasChanges();
        StoryEntry storyEntry2 = this.outputEntry;
        ArrayList<VideoEditedInfo.MediaEntity> arrayList = storyEntry2.mediaEntities;
        if (arrayList == null) {
            storyEntry2.mediaEntities = new ArrayList<>();
        } else {
            arrayList.clear();
        }
        PaintView paintView = this.paintView;
        StoryEntry storyEntry3 = this.outputEntry;
        paintView.getBitmap(storyEntry3.mediaEntities, storyEntry3.resultWidth, storyEntry3.resultHeight, false, false, false);
        StoryEntry storyEntry4 = this.outputEntry;
        if (!storyEntry4.isVideo) {
            storyEntry4.averageDuration = Utilities.clamp(this.paintView.getLcm(), 7500L, 5000L);
        }
        List<TLRPC$InputDocument> masks = this.paintView.getMasks();
        this.outputEntry.stickers = masks != null ? new ArrayList(masks) : null;
        StoryEntry storyEntry5 = this.outputEntry;
        boolean z = storyEntry5.isVideo;
        boolean wouldBeVideo = storyEntry5.wouldBeVideo();
        this.outputEntry.mediaEntities = new ArrayList<>();
        PaintView paintView2 = this.paintView;
        StoryEntry storyEntry6 = this.outputEntry;
        Bitmap bitmap = paintView2.getBitmap(storyEntry6.mediaEntities, storyEntry6.resultWidth, storyEntry6.resultHeight, true, false, !z);
        if (this.outputEntry.mediaEntities.isEmpty()) {
            this.outputEntry.mediaEntities = null;
        }
        try {
            File file = this.outputEntry.paintFile;
            if (file != null) {
                file.delete();
            }
        } catch (Exception unused) {
        }
        try {
            File file2 = this.outputEntry.paintEntitiesFile;
            if (file2 != null) {
                file2.delete();
            }
        } catch (Exception unused2) {
        }
        try {
            File file3 = this.outputEntry.paintBlurFile;
            if (file3 != null) {
                file3.delete();
            }
        } catch (Exception unused3) {
        }
        StoryEntry storyEntry7 = this.outputEntry;
        storyEntry7.paintFile = null;
        storyEntry7.paintEntitiesFile = null;
        storyEntry7.paintBlurFile = null;
        FileLoader fileLoader = FileLoader.getInstance(this.currentAccount);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        StoryEntry storyEntry8 = this.outputEntry;
        storyEntry7.paintFile = fileLoader.getPathToAttach(ImageLoader.scaleAndSaveImage(bitmap, compressFormat, storyEntry8.resultWidth, storyEntry8.resultHeight, 87, false, (int) FileLoader.MEDIA_DIR_VIDEO_PUBLIC, (int) FileLoader.MEDIA_DIR_VIDEO_PUBLIC), true);
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        if (!wouldBeVideo) {
            PaintView paintView3 = this.paintView;
            ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = new ArrayList<>();
            StoryEntry storyEntry9 = this.outputEntry;
            Bitmap bitmap2 = paintView3.getBitmap(arrayList2, storyEntry9.resultWidth, storyEntry9.resultHeight, false, true, false);
            StoryEntry storyEntry10 = this.outputEntry;
            FileLoader fileLoader2 = FileLoader.getInstance(this.currentAccount);
            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
            StoryEntry storyEntry11 = this.outputEntry;
            storyEntry10.paintEntitiesFile = fileLoader2.getPathToAttach(ImageLoader.scaleAndSaveImage(bitmap2, compressFormat2, storyEntry11.resultWidth, storyEntry11.resultHeight, 87, false, (int) FileLoader.MEDIA_DIR_VIDEO_PUBLIC, (int) FileLoader.MEDIA_DIR_VIDEO_PUBLIC), true);
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bitmap2.recycle();
            }
        }
        if (this.paintView.hasBlur()) {
            Bitmap blurBitmap = this.paintView.getBlurBitmap();
            StoryEntry storyEntry12 = this.outputEntry;
            FileLoader fileLoader3 = FileLoader.getInstance(this.currentAccount);
            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
            StoryEntry storyEntry13 = this.outputEntry;
            storyEntry12.paintBlurFile = fileLoader3.getPathToAttach(ImageLoader.scaleAndSaveImage(blurBitmap, compressFormat3, storyEntry13.resultWidth, storyEntry13.resultHeight, 87, false, (int) FileLoader.MEDIA_DIR_VIDEO_PUBLIC, (int) FileLoader.MEDIA_DIR_VIDEO_PUBLIC), true);
            if (blurBitmap == null || blurBitmap.isRecycled()) {
                return;
            }
            blurBitmap.recycle();
        }
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
                        Bitmap lambda$createFilterPhotoView$46;
                        lambda$createFilterPhotoView$46 = StoryRecorder.this.lambda$createFilterPhotoView$46(options);
                        return lambda$createFilterPhotoView$46;
                    }
                };
                Point point = AndroidUtilities.displaySize;
                scaledBitmap = StoryEntry.getScaledBitmap(decodeBitmap, point.x, point.y, true);
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
                    StoryRecorder.this.lambda$createFilterPhotoView$47(view);
                }
            });
            this.photoFilterView.getCancelTextView().setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    StoryRecorder.this.lambda$createFilterPhotoView$48(view);
                }
            });
            this.photoFilterView.getToolsView().setVisibility(8);
            this.photoFilterView.getToolsView().setAlpha(0.0f);
            this.photoFilterView.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
            this.photoFilterView.init();
        }
    }

    public Bitmap lambda$createFilterPhotoView$46(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.outputEntry.file.getAbsolutePath(), options);
    }

    public void lambda$createFilterPhotoView$47(View view) {
        switchToEditMode(-1, true);
    }

    public void lambda$createFilterPhotoView$48(View view) {
        switchToEditMode(-1, true);
    }

    public void invalidateBlur() {
        CaptionStory captionStory = this.captionEdit;
        if (captionStory != null) {
            captionStory.invalidateBlur();
        }
    }

    public void applyFilterMatrix() {
        if (this.outputEntry == null || this.photoFilterViewTextureView == null || this.previewContainer.getMeasuredWidth() <= 0 || this.previewContainer.getMeasuredHeight() <= 0) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        int i = this.outputEntry.orientation;
        if (i != 0) {
            matrix.postRotate(-i, this.previewContainer.getMeasuredWidth() / 2.0f, this.previewContainer.getMeasuredHeight() / 2.0f);
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

    @SuppressLint({"ClickableViewAccessibility"})
    public void createCameraView() {
        if (this.cameraView != null || getContext() == null) {
            return;
        }
        AnonymousClass19 anonymousClass19 = new AnonymousClass19(getContext(), getCameraFace(), false);
        this.cameraView = anonymousClass19;
        anonymousClass19.isStory = true;
        anonymousClass19.setThumbDrawable(getCameraThumb());
        this.cameraView.initTexture();
        this.cameraView.setDelegate(new CameraView.CameraViewDelegate() {
            @Override
            public final void onCameraInit() {
                StoryRecorder.this.lambda$createCameraView$49();
            }
        });
        this.dualButton.setVisibility((this.cameraView.dualAvailable() && this.currentPage == 0) ? 0 : 8);
        this.flashButton.setTranslationX(this.cameraView.dualAvailable() ? -AndroidUtilities.dp(46.0f) : 0.0f);
        this.previewContainer.addView(this.cameraView, LayoutHelper.createFrame(-1, -1, 119));
        if (MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) < 1) {
            this.cameraHint.show();
            MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) + 1).apply();
        } else if (this.cameraView.isSavedDual() || !this.cameraView.dualAvailable() || MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) >= 2) {
        } else {
            this.dualHint.show();
        }
    }

    public class AnonymousClass19 extends DualCameraView {
        AnonymousClass19(Context context, boolean z, boolean z2) {
            super(context, z, z2);
            StoryRecorder.this = r1;
        }

        @Override
        public void onEntityDraggedTop(boolean z) {
            StoryRecorder.this.previewHighlight.show(true, z, StoryRecorder.this.actionBarContainer);
        }

        @Override
        public void onEntityDraggedBottom(boolean z) {
            StoryRecorder.this.previewHighlight.updateCaption(StoryRecorder.this.captionEdit.getText());
            StoryRecorder.this.previewHighlight.show(false, z, StoryRecorder.this.controlContainer);
        }

        @Override
        public void toggleDual() {
            super.toggleDual();
            StoryRecorder.this.dualButton.setValue(isDual());
            StoryRecorder.this.setCameraFlashModeIcon((isDual() || getCameraSession() == null || isFrontface()) ? null : getCameraSession().getCurrentFlashMode(), true);
        }

        @Override
        protected void onSavedDualCameraSuccess() {
            if (MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) < 2) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.AnonymousClass19.this.lambda$onSavedDualCameraSuccess$0();
                    }
                }, 340L);
            }
            StoryRecorder.this.dualButton.setValue(isDual());
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
    }

    public void lambda$createCameraView$49() {
        String currentFlashMode = this.cameraView.getCameraSession().getCurrentFlashMode();
        if (TextUtils.equals(currentFlashMode, this.cameraView.getCameraSession().getNextFlashMode())) {
            currentFlashMode = null;
        }
        setCameraFlashModeIcon(this.currentPage == 0 ? currentFlashMode : null, true);
        ZoomControlView zoomControlView = this.zoomControlView;
        if (zoomControlView != null) {
            this.cameraZoom = 0.0f;
            zoomControlView.setZoom(0.0f, false);
        }
    }

    public Drawable getCameraThumb() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null) {
            return new BitmapDrawable(bitmap);
        }
        return getContext().getResources().getDrawable(R.drawable.icplaceholder);
    }

    private void saveLastCameraBitmap(final Runnable runnable) {
        DualCameraView dualCameraView = this.cameraView;
        if (dualCameraView != null && dualCameraView.getTextureView() != null) {
            try {
                final Bitmap bitmap = this.cameraView.getTextureView().getBitmap();
                Utilities.themeQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.this.lambda$saveLastCameraBitmap$50(bitmap, runnable);
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public void lambda$saveLastCameraBitmap$50(Bitmap bitmap, Runnable runnable) {
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

    private void showDismissEntry() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
        builder.setTitle(LocaleController.getString("DiscardChanges", R.string.DiscardChanges));
        builder.setMessage(LocaleController.getString("PhotoEditorDiscardAlert", R.string.PhotoEditorDiscardAlert));
        StoryEntry storyEntry = this.outputEntry;
        if (storyEntry != null) {
            builder.setNeutralButton(LocaleController.getString(storyEntry.isDraft ? "StoryKeepDraft" : "StorySaveDraft"), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    StoryRecorder.this.lambda$showDismissEntry$51(dialogInterface, i);
                }
            });
        }
        StoryEntry storyEntry2 = this.outputEntry;
        builder.setPositiveButton((storyEntry2 == null || !storyEntry2.isDraft) ? LocaleController.getString("Discard", R.string.Discard) : LocaleController.getString("StoryDeleteDraft"), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                StoryRecorder.this.lambda$showDismissEntry$52(dialogInterface, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        AlertDialog create = builder.create();
        create.show();
        View button = create.getButton(-1);
        if (button instanceof TextView) {
            int i = Theme.key_text_RedBold;
            ((TextView) button).setTextColor(Theme.getColor(i, this.resourcesProvider));
            button.setBackground(Theme.createRadSelectorDrawable(ColorUtils.setAlphaComponent(Theme.getColor(i, this.resourcesProvider), 51), 6, 6));
        }
    }

    public void lambda$showDismissEntry$51(DialogInterface dialogInterface, int i) {
        StoryEntry storyEntry = this.outputEntry;
        if (storyEntry == null) {
            return;
        }
        storyEntry.captionEntitiesAllowed = MessagesController.getInstance(this.currentAccount).storyEntitiesAllowed();
        this.showSavedDraftHint = !this.outputEntry.isDraft;
        applyFilter(null);
        applyPaint();
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

    public void lambda$showDismissEntry$52(DialogInterface dialogInterface, int i) {
        StoryEntry storyEntry = this.outputEntry;
        if (storyEntry != null && storyEntry.isDraft) {
            MessagesController.getInstance(this.currentAccount).getStoriesController().getDraftsController().delete(this.outputEntry);
            this.outputEntry = null;
        }
        navigateTo(0, true);
    }

    public void destroyCameraView(boolean z) {
        if (this.cameraView != null) {
            if (z) {
                saveLastCameraBitmap(new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.this.lambda$destroyCameraView$53();
                    }
                });
                return;
            }
            saveLastCameraBitmap(new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.this.lambda$destroyCameraView$54();
                }
            });
            this.cameraView.destroy(true, null);
            this.previewContainer.removeView(this.cameraView);
            this.cameraView = null;
        }
    }

    public void lambda$destroyCameraView$53() {
        this.cameraViewThumb.setImageDrawable(getCameraThumb());
        DualCameraView dualCameraView = this.cameraView;
        if (dualCameraView != null) {
            dualCameraView.destroy(true, null);
            this.previewContainer.removeView(this.cameraView);
            this.cameraView = null;
        }
    }

    public void lambda$destroyCameraView$54() {
        this.cameraViewThumb.setImageDrawable(getCameraThumb());
    }

    private void requestCameraPermission(boolean z) {
        Activity activity;
        if (!this.requestedCameraPermission || z) {
            this.noCameraPermission = false;
            if (Build.VERSION.SDK_INT >= 23 && (activity = this.activity) != null) {
                boolean z2 = activity.checkSelfPermission("android.permission.CAMERA") != 0;
                this.noCameraPermission = z2;
                if (z2) {
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.story_camera).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(-14540254), mutate);
                    combinedDrawable.setIconSize(AndroidUtilities.dp(64.0f), AndroidUtilities.dp(64.0f));
                    this.cameraViewThumb.setImageDrawable(combinedDrawable);
                    if (this.activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        new AlertDialog.Builder(getContext()).setTopAnimation(R.raw.permission_request_camera, 72, false, Theme.getColor(Theme.key_dialogTopBackground)).setMessage(AndroidUtilities.replaceTags(LocaleController.getString("PermissionNoCameraWithHint", R.string.PermissionNoCameraWithHint))).setPositiveButton(LocaleController.getString("PermissionOpenSettings", R.string.PermissionOpenSettings), new DialogInterface.OnClickListener() {
                            @Override
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                StoryRecorder.this.lambda$requestCameraPermission$55(dialogInterface, i);
                            }
                        }).setNegativeButton(LocaleController.getString("ContactsPermissionAlertNotNow", R.string.ContactsPermissionAlertNotNow), null).create().show();
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
                CameraController.getInstance().initCamera(new StoryRecorder$$ExternalSyntheticLambda31(this));
            }
        }
    }

    public void lambda$requestCameraPermission$55(DialogInterface dialogInterface, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            this.activity.startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public boolean requestGalleryPermission() {
        Activity activity = this.activity;
        if (activity != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                r5 = (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && this.activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) ? true : true;
                if (r5) {
                    this.activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 114);
                }
            } else if (i >= 23) {
                r5 = activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
                if (r5) {
                    this.activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 114);
                }
            }
            return !r5;
        }
        return true;
    }

    public boolean requestAudioPermission() {
        Activity activity;
        if (Build.VERSION.SDK_INT >= 23 && (activity = this.activity) != null) {
            if (!(activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0)) {
                this.activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 112);
                return false;
            }
        }
        return true;
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
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.whenOpenDone = new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.this.lambda$onResumeInternal$56();
                    }
                };
            } else {
                requestCameraPermission(false);
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

    public void lambda$onResumeInternal$56() {
        requestCameraPermission(false);
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
        boolean z = iArr != null && iArr.length == 1 && iArr[0] == 0;
        if (i == 111) {
            this.noCameraPermission = !z;
            if (z && this.currentPage == 0) {
                this.cameraViewThumb.setImageDrawable(null);
                if (CameraController.getInstance().isCameraInitied()) {
                    createCameraView();
                } else {
                    CameraController.getInstance().initCamera(new StoryRecorder$$ExternalSyntheticLambda31(this));
                }
            }
        } else if (i == 114) {
            if (z) {
                MediaController.loadGalleryPhotosAlbums(0);
                lambda$animateGalleryListView$38(true);
            }
        } else if (i == 112) {
            if (z) {
                return;
            }
            new AlertDialog.Builder(getContext()).setTopAnimation(R.raw.permission_request_camera, 72, false, Theme.getColor(Theme.key_dialogTopBackground)).setMessage(AndroidUtilities.replaceTags(LocaleController.getString("PermissionNoCameraMicVideo", R.string.PermissionNoCameraMicVideo))).setPositiveButton(LocaleController.getString("PermissionOpenSettings", R.string.PermissionOpenSettings), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    StoryRecorder.this.lambda$onRequestPermissionsResultInternal$57(dialogInterface, i2);
                }
            }).setNegativeButton(LocaleController.getString("ContactsPermissionAlertNotNow", R.string.ContactsPermissionAlertNotNow), null).create().show();
        } else if (i == 115) {
            if (z && (runnable = this.audioGrantedCallback) != null) {
                runnable.run();
            }
            this.audioGrantedCallback = null;
        }
    }

    public void lambda$onRequestPermissionsResultInternal$57(DialogInterface dialogInterface, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            this.activity.startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void saveCameraFace(boolean z) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z).apply();
    }

    private boolean getCameraFace() {
        return MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false);
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
        } else if (i == NotificationCenter.storiesDraftsUpdated) {
            RecordControl recordControl2 = this.recordControl;
            if (recordControl2 == null || this.showSavedDraftHint) {
                return;
            }
            recordControl2.updateGalleryImage();
        } else if (i == NotificationCenter.storiesLimitUpdate) {
            int i5 = this.currentPage;
            if (i5 == 1) {
                PreviewButtons previewButtons = this.previewButtons;
                if (!this.videoError && !this.captionEdit.isCaptionOverLimit() && (!MessagesController.getInstance(this.currentAccount).getStoriesController().hasStoryLimit() || ((storyEntry = this.outputEntry) != null && storyEntry.isEdit))) {
                    z = true;
                }
                previewButtons.setShareEnabled(z);
            } else if (i5 == 0 && (checkStoryLimit = MessagesController.getInstance(this.currentAccount).getStoriesController().checkStoryLimit()) != null && checkStoryLimit.active(this.currentAccount)) {
                showLimitReachedSheet(checkStoryLimit, true);
            }
        }
    }

    public void addNotificationObservers() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesLimitUpdate);
    }

    public void removeNotificationObservers() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesLimitUpdate);
    }

    private void showLimitReachedSheet(StoriesController.StoryLimit storyLimit, final boolean z) {
        if (this.shownLimitReached) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(new BaseFragment() {
            @Override
            public boolean isLightStatusBar() {
                return false;
            }

            {
                StoryRecorder.this = this;
            }

            @Override
            public Activity getParentActivity() {
                return StoryRecorder.this.activity;
            }

            @Override
            public Theme.ResourcesProvider getResourceProvider() {
                return new WrappedResourceProvider(this, StoryRecorder.this.resourcesProvider) {
                    @Override
                    public void appendColors() {
                        this.sparseIntArray.append(Theme.key_dialogBackground, -14737633);
                        this.sparseIntArray.append(Theme.key_windowBackgroundGray, -13421773);
                    }
                };
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
                StoryRecorder.this.lambda$showLimitReachedSheet$58(z, dialogInterface);
            }
        });
        this.previewView.updatePauseReason(7, true);
        this.shownLimitReached = true;
        limitReachedBottomSheet.show();
    }

    public void lambda$showLimitReachedSheet$58(boolean z, DialogInterface dialogInterface) {
        this.shownLimitReached = false;
        this.previewView.updatePauseReason(7, true);
        if (z) {
            close(true);
        }
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
            @Override
            public boolean isLightStatusBar() {
                return false;
            }

            {
                StoryRecorder.this = this;
                this.currentAccount = this.currentAccount;
            }

            @Override
            public Dialog showDialog(Dialog dialog) {
                dialog.show();
                return dialog;
            }

            @Override
            public Activity getParentActivity() {
                return StoryRecorder.this.activity;
            }

            @Override
            public Theme.ResourcesProvider getResourceProvider() {
                return new WrappedResourceProvider(this, StoryRecorder.this.resourcesProvider) {
                    @Override
                    public void appendColors() {
                        this.sparseIntArray.append(Theme.key_dialogBackground, -14803426);
                        this.sparseIntArray.append(Theme.key_windowBackgroundGray, -16777216);
                    }
                };
            }
        }, 14, false);
        premiumFeatureBottomSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                StoryRecorder.this.lambda$openPremium$59(dialogInterface);
            }
        });
        premiumFeatureBottomSheet.show();
    }

    public void lambda$openPremium$59(DialogInterface dialogInterface) {
        PreviewView previewView = this.previewView;
        if (previewView != null) {
            previewView.updatePauseReason(4, false);
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

    public void showPremiumPeriodBulletin(int i) {
        int i2 = i / 3600;
        Bulletin.BulletinWindow.BulletinWindowLayout make = Bulletin.BulletinWindow.make(this.activity, new Bulletin.Delegate(this) {
            @Override
            public boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
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

    public void setIconMuted(boolean z, boolean z2) {
        if (this.muteButtonDrawable == null) {
            RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.media_mute_unmute, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.muteButtonDrawable = rLottieDrawable;
            rLottieDrawable.multiplySpeed(1.5f);
        }
        this.muteButton.setAnimation(this.muteButtonDrawable);
        if (!z2) {
            this.muteButtonDrawable.setCurrentFrame(z ? 20 : 0, false);
        } else if (z) {
            if (this.muteButtonDrawable.getCurrentFrame() > 20) {
                this.muteButtonDrawable.setCurrentFrame(0, false);
            }
            this.muteButtonDrawable.setCustomEndFrame(20);
            this.muteButtonDrawable.start();
        } else if (this.muteButtonDrawable.getCurrentFrame() == 0 || this.muteButtonDrawable.getCurrentFrame() >= 43) {
        } else {
            this.muteButtonDrawable.setCustomEndFrame(43);
            this.muteButtonDrawable.start();
        }
    }

    public static CharSequence cameraBtnSpan(Context context) {
        SpannableString spannableString = new SpannableString("c");
        final Drawable mutate = context.getResources().getDrawable(R.drawable.story_camera).mutate();
        int dp = AndroidUtilities.dp(35.0f);
        int i = -dp;
        mutate.setBounds(i / 4, i, (dp / 4) * 3, 0);
        spannableString.setSpan(new ImageSpan(mutate) {
            @Override
            public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
                return (super.getSize(paint, charSequence, i2, i3, fontMetricsInt) / 3) * 2;
            }

            @Override
            public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
                canvas.save();
                canvas.translate(0.0f, ((i6 - i4) / 2) + AndroidUtilities.dp(1.0f));
                mutate.setAlpha(paint.getAlpha());
                super.draw(canvas, charSequence, i2, i3, f, i4, i5, i6, paint);
                canvas.restore();
            }
        }, 0, 1, 33);
        return spannableString;
    }
}
