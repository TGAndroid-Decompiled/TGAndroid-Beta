package org.telegram.ui.Stories.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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
import android.graphics.RenderNode;
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
import android.util.Pair;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.math.MathUtils;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline9;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
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
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.messenger.utils.WindowVisibilityManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.AccountFrozenAlert;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.ShareDialogCell;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.Crop.CropRotationWheel;
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
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.Components.PhotoFilterBlurControl;
import org.telegram.ui.Components.PhotoFilterCurvesControl;
import org.telegram.ui.Components.PhotoFilterView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RectOld;
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
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.StoryWaveEffectView;
import org.telegram.ui.WrappedResourceProvider;

public class StoryRecorder implements NotificationCenter.NotificationCenterDelegate {
    private static boolean firstOpen = true;
    private static StoryRecorder instance;
    private LinearLayout actionBarButtons;
    private FrameLayout actionBarContainer;
    private final Activity activity;
    private Runnable afterPlayerAwait;
    private boolean animatedRecording;
    private boolean animatedRecordingWasInCheck;
    private Runnable audioGrantedCallback;
    private FlashViews.ImageViewInvertable backButton;
    private BlurringShader.BlurManager blurManager;
    private TLRPC.InputMedia botEdit;
    private long botId;
    private String botLang;
    private HintView2 cameraHint;
    private DualCameraView cameraView;
    private float cameraZoom;
    private FrameLayout captionContainer;
    private CaptionStory captionEdit;
    private View captionEditOverlay;
    private View changeDayNightView;
    private ValueAnimator changeDayNightViewAnimator;
    private float changeDayNightViewProgress;
    private Runnable closeListener;
    private ClosingViewProvider closingSourceProvider;
    private CollageLayoutButton collageButton;
    private HintTextView collageHintTextView;
    private CollageLayoutView2 collageLayoutView;
    private CollageLayoutButton.CollageLayoutListView collageListView;
    private ToggleButton2 collageRemoveButton;
    private ContainerView containerView;
    private ValueAnimator containerViewBackAnimator;
    private FrameLayout controlContainer;
    private ButtonWithCounterView coverButton;
    private TimelineView coverTimelineView;
    private long coverValue;
    private CropEditor cropEditor;
    private CropInlineEditor cropInlineEditor;
    private final int currentAccount;
    private RoundVideoRecorder currentRoundRecorder;
    private float dismissProgress;
    private DownloadButton downloadButton;
    private DraftSavedHint draftSavedHint;
    private ToggleButton dualButton;
    private HintView2 dualHint;
    private AnimatorSet editModeAnimator;
    private boolean fastClose;
    private ToggleButton2 flashButton;
    private String flashButtonMode;
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
    private CollageLayout lastCollageLayout;
    private Parcelable lastGalleryScrollPosition;
    private MediaController.AlbumEntry lastGallerySelectedAlbum;
    private TLRPC.InputPeer livePeer;
    private SelectPeerView livePeerView;
    private FlashViews.ImageViewInvertable liveSettingsButton;
    private StoryModeTabs modeSwitcherView;
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
    private ScannedLinkPreview qrLinkView;
    private QRScanner qrScanner;
    private RecordControl recordControl;
    private AnimatorSet recordingAnimator;
    private HintView2 removeCollageHint;
    private boolean requestedCameraPermission;
    private FlashViews.ImageViewInvertable rotateButton;
    private HintView2 savedDualHint;
    private boolean scrollingX;
    private boolean scrollingY;
    long selectedDialogId;
    private boolean showSavedDraftHint;
    private boolean shownLimitReached;
    private ButtonWithCounterView startLiveButton;
    private MultipleStoriesSelector storiesSelector;
    private boolean switchingStory;
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
    private final WindowManager windowManager;
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
    private StoryPrivacyBottomSheet.StoryPrivacy livePrivacy = new StoryPrivacyBottomSheet.StoryPrivacy();
    private ArrayList entries = null;
    private ArrayList selectedEntries = null;
    private ArrayList selectedEntriesOrder = null;
    private int mode = 0;
    private boolean takingPhoto = false;
    private boolean takingVideo = false;
    private boolean stoppingTakingVideo = false;
    private boolean awaitingPlayer = false;
    private int shiftDp = -3;
    private boolean preparingUpload = false;
    private final RecordControl.Delegate recordControlDelegate = new AnonymousClass13();
    private boolean videoTimerShown = true;
    private boolean applyContainerViewTranslation2 = true;
    private int frontfaceFlashMode = -1;
    private final WindowVisibilityManager.Controller activityVisibilityController = LaunchActivity.obtainActivityVisibilityController();

    public interface ClosingViewProvider {
        SourceView getView(long j);

        void preLayout(long j, Runnable runnable);
    }

    public interface Touchable {
        boolean onTouch(MotionEvent motionEvent);
    }

    public static boolean m4619$r8$lambda$4zhLGEpig6PiDkCV8uZ9FajUME(View view, MotionEvent motionEvent) {
        return true;
    }

    static float access$3816(StoryRecorder storyRecorder, float f) {
        float f2 = storyRecorder.cameraZoom + f;
        storyRecorder.cameraZoom = f2;
        return f2;
    }

    static StoryWaveEffectView access$600(StoryRecorder storyRecorder) {
        storyRecorder.getClass();
        return null;
    }

    static StoryThemeSheet access$7000(StoryRecorder storyRecorder) {
        storyRecorder.getClass();
        return null;
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
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        layoutParams.flags = -2013200128;
        layoutParams.softInputMode = 16;
        this.windowManager = (WindowManager) activity.getSystemService("window");
        initViews();
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

        protected void drawAbove(Canvas canvas, float f) {
        }

        protected abstract void hide();

        protected abstract void show(boolean z);

        public static SourceView fromAvatarImage(final ProfileActivity.AvatarImageView avatarImageView, boolean z) {
            if (avatarImageView == null || avatarImageView.getRootView() == null) {
                return null;
            }
            float scaleX = ((View) avatarImageView.getParent()).getScaleX();
            float imageWidth = avatarImageView.getImageReceiver().getImageWidth() * scaleX;
            float f = z ? 0.32f * imageWidth : imageWidth;
            SourceView sourceView = new SourceView() {
                @Override
                protected void show(boolean z2) {
                    ProfileActivity.AvatarImageView avatarImageView2 = avatarImageView;
                    avatarImageView2.drawAvatar = true;
                    avatarImageView2.invalidate();
                }

                @Override
                protected void hide() {
                    ProfileActivity.AvatarImageView avatarImageView2 = avatarImageView;
                    avatarImageView2.drawAvatar = false;
                    avatarImageView2.invalidate();
                }
            };
            int[] iArr = new int[2];
            float[] fArr = new float[2];
            avatarImageView.getRootView().getLocationOnScreen(iArr);
            AndroidUtilities.getViewPositionInParent(avatarImageView, (ViewGroup) avatarImageView.getRootView(), fArr);
            float imageX = iArr[0] + fArr[0] + (avatarImageView.getImageReceiver().getImageX() * scaleX);
            float imageY = iArr[1] + fArr[1] + (avatarImageView.getImageReceiver().getImageY() * scaleX);
            sourceView.screenRect.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
            sourceView.backgroundImageReceiver = avatarImageView.getImageReceiver();
            sourceView.rounding = f;
            return sourceView;
        }

        public static SourceView fromStoryViewer(final StoryViewer storyViewer) {
            if (storyViewer == null) {
                return null;
            }
            SourceView sourceView = new SourceView() {
                @Override
                protected void show(boolean z) {
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
            if (!storyViewer.getStoryRect(sourceView.screenRect)) {
                return null;
            }
            sourceView.type = 1;
            sourceView.rounding = AndroidUtilities.dp(8.0f);
            PeerStoriesView currentPeerView = storyViewer.getCurrentPeerView();
            if (currentPeerView != null) {
                sourceView.view = currentPeerView.storyContainer;
            }
            return sourceView;
        }

        class AnonymousClass4 extends SourceView {
            final BackupImageView val$imageView;

            AnonymousClass4(BackupImageView backupImageView) {
                this.val$imageView = backupImageView;
            }

            @Override
            protected void show(boolean z) {
                this.val$imageView.setVisibility(0);
            }

            @Override
            protected void hide() {
                final BackupImageView backupImageView = this.val$imageView;
                backupImageView.post(new Runnable() {
                    @Override
                    public final void run() {
                        backupImageView.setVisibility(8);
                    }
                });
            }
        }

        public static SourceView fromShareCell(ShareDialogCell shareDialogCell) {
            if (shareDialogCell == null) {
                return null;
            }
            BackupImageView imageView = shareDialogCell.getImageView();
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(imageView);
            int[] iArr = new int[2];
            imageView.getLocationOnScreen(iArr);
            RectF rectF = anonymousClass4.screenRect;
            int i = iArr[0];
            rectF.set(i, iArr[1], i + imageView.getWidth(), iArr[1] + imageView.getHeight());
            anonymousClass4.backgroundDrawable = new ShareDialogCell.RepostStoryDrawable(imageView.getContext(), (View) null, false, shareDialogCell.resourcesProvider);
            anonymousClass4.rounding = Math.max(anonymousClass4.screenRect.width(), anonymousClass4.screenRect.height()) / 2.0f;
            return anonymousClass4;
        }

        public static SourceView fromStoryCell(DialogStoriesCell.StoryCell storyCell) {
            if (storyCell == null || storyCell.getRootView() == null) {
                return null;
            }
            float imageWidth = storyCell.avatarImage.getImageWidth();
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(storyCell, imageWidth / 2.0f);
            int[] iArr = new int[2];
            float[] fArr = new float[2];
            storyCell.getRootView().getLocationOnScreen(iArr);
            AndroidUtilities.getViewPositionInParent(storyCell, (ViewGroup) storyCell.getRootView(), fArr);
            float imageX = iArr[0] + fArr[0] + storyCell.avatarImage.getImageX();
            float imageY = iArr[1] + fArr[1] + storyCell.avatarImage.getImageY();
            anonymousClass5.screenRect.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
            anonymousClass5.backgroundImageReceiver = storyCell.avatarImage;
            anonymousClass5.rounding = Math.max(anonymousClass5.screenRect.width(), anonymousClass5.screenRect.height()) / 2.0f;
            return anonymousClass5;
        }

        class AnonymousClass5 extends SourceView {
            final float val$radius;
            final DialogStoriesCell.StoryCell val$storyCell;

            AnonymousClass5(DialogStoriesCell.StoryCell storyCell, float f) {
                this.val$storyCell = storyCell;
                this.val$radius = f;
            }

            @Override
            protected void show(boolean z) {
                DialogStoriesCell.StoryCell storyCell = this.val$storyCell;
                storyCell.drawAvatar = true;
                storyCell.invalidate();
                if (z) {
                    int[] iArr = new int[2];
                    this.val$storyCell.getLocationInWindow(iArr);
                    LaunchActivity.makeRipple(iArr[0] + (this.val$storyCell.getWidth() / 2.0f), iArr[1] + (this.val$storyCell.getHeight() / 2.0f), 1.0f);
                }
            }

            @Override
            protected void hide() {
                final DialogStoriesCell.StoryCell storyCell = this.val$storyCell;
                storyCell.post(new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.SourceView.AnonymousClass5.$r8$lambda$CddIKtIMy4frrCudqDPnaYUkxdE(storyCell);
                    }
                });
            }

            public static void $r8$lambda$CddIKtIMy4frrCudqDPnaYUkxdE(DialogStoriesCell.StoryCell storyCell) {
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

    public void replaceSourceView(SourceView sourceView) {
        int i = 0;
        if (sourceView != null) {
            this.fromSourceView = sourceView;
            this.openType = sourceView.type;
            this.fromRect.set(sourceView.screenRect);
            this.fromRounding = sourceView.rounding;
        } else {
            this.fromSourceView = null;
            this.openType = 0;
            this.fromRect.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.fromRounding = AndroidUtilities.dp(8.0f);
        }
        FrameLayout frameLayout = this.previewContainer;
        int i2 = this.openType;
        if (i2 != 1 && i2 != 0) {
            i = -14737633;
        }
        frameLayout.setBackgroundColor(i);
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
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            AccountFrozenAlert.show(this.currentAccount);
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
            setupBackDispatcher();
        }
        this.outputEntry = storyEntry;
        storyEntry.botId = j;
        storyEntry.botLang = str;
        this.mode = storyEntry.isVideo ? 1 : 0;
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
        animateOpenTo(1.0f, true, new StoryRecorder$$ExternalSyntheticLambda11(this));
        addNotificationObservers();
    }

    public void open(SourceView sourceView) {
        open(sourceView, true);
    }

    public void open(SourceView sourceView, boolean z) {
        StoriesController.StoryLimit storyLimitCheckStoryLimit;
        WindowView windowView;
        if (this.isShown) {
            return;
        }
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            AccountFrozenAlert.show(this.currentAccount);
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
            setupBackDispatcher();
        }
        this.collageLayoutView.setCameraThumb(getCameraThumb());
        if (this.botId == 0 && (storyLimitCheckStoryLimit = MessagesController.getInstance(this.currentAccount).getStoriesController().checkStoryLimit()) != null && storyLimitCheckStoryLimit.active(this.currentAccount)) {
            showLimitReachedSheet(storyLimitCheckStoryLimit, true);
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
        animateOpenTo(1.0f, z, new StoryRecorder$$ExternalSyntheticLambda11(this));
        addNotificationObservers();
        this.botId = 0L;
        this.botLang = "";
        this.botEdit = null;
    }

    public void openEdit(SourceView sourceView, StoryEntry storyEntry, long j, final boolean z) {
        WindowView windowView;
        if (this.isShown) {
            return;
        }
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            AccountFrozenAlert.show(this.currentAccount);
            return;
        }
        this.isReposting = false;
        this.prepareClosing = false;
        this.forceBackgroundVisible = false;
        if (this.windowManager != null && (windowView = this.windowView) != null && windowView.getParent() == null) {
            AndroidUtilities.setPreferredMaxRefreshRate(this.windowManager, this.windowView, this.windowLayoutParams);
            this.windowManager.addView(this.windowView, this.windowLayoutParams);
            setupBackDispatcher();
        }
        this.outputEntry = storyEntry;
        this.mode = (storyEntry == null || !storyEntry.isVideo) ? 0 : 1;
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
                StoryRecorder.$r8$lambda$iLn0bQmXHg9zVdTZ_cjbUSmaelo(this.f$0, z);
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

    public static void $r8$lambda$iLn0bQmXHg9zVdTZ_cjbUSmaelo(StoryRecorder storyRecorder, boolean z) {
        storyRecorder.getClass();
        storyRecorder.animateOpenTo(1.0f, z, new StoryRecorder$$ExternalSyntheticLambda11(storyRecorder));
        storyRecorder.previewButtons.appear(true, true);
    }

    public void openForward(SourceView sourceView, StoryEntry storyEntry, long j, final boolean z) {
        WindowView windowView;
        if (this.isShown) {
            return;
        }
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            AccountFrozenAlert.show(this.currentAccount);
            return;
        }
        this.isReposting = false;
        this.prepareClosing = false;
        this.forceBackgroundVisible = false;
        if (this.windowManager != null && (windowView = this.windowView) != null && windowView.getParent() == null) {
            AndroidUtilities.setPreferredMaxRefreshRate(this.windowManager, this.windowView, this.windowLayoutParams);
            this.windowManager.addView(this.windowView, this.windowLayoutParams);
            setupBackDispatcher();
        }
        this.outputEntry = storyEntry;
        StoryPrivacySelector.applySaved(this.currentAccount, storyEntry);
        StoryEntry storyEntry2 = this.outputEntry;
        this.mode = (storyEntry2 == null || !storyEntry2.isVideo) ? 0 : 1;
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
                StoryRecorder.$r8$lambda$eAJBqDjL16cf4M_COP6fygoS2Wc(this.f$0, z);
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

    public static void $r8$lambda$eAJBqDjL16cf4M_COP6fygoS2Wc(StoryRecorder storyRecorder, boolean z) {
        storyRecorder.getClass();
        storyRecorder.animateOpenTo(1.0f, z, new StoryRecorder$$ExternalSyntheticLambda11(storyRecorder));
    }

    public void openRepost(SourceView sourceView, StoryEntry storyEntry) {
        StoriesController.StoryLimit storyLimitCheckStoryLimit;
        WindowView windowView;
        if (this.isShown) {
            return;
        }
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            AccountFrozenAlert.show(this.currentAccount);
            return;
        }
        this.isReposting = true;
        this.prepareClosing = false;
        this.forceBackgroundVisible = false;
        if (this.windowManager != null && (windowView = this.windowView) != null && windowView.getParent() == null) {
            AndroidUtilities.setPreferredMaxRefreshRate(this.windowManager, this.windowView, this.windowLayoutParams);
            this.windowManager.addView(this.windowView, this.windowLayoutParams);
            setupBackDispatcher();
        }
        this.outputEntry = storyEntry;
        StoryPrivacySelector.applySaved(this.currentAccount, storyEntry);
        StoryEntry storyEntry2 = this.outputEntry;
        int i = (storyEntry2 == null || !storyEntry2.isVideo) ? 0 : 1;
        this.mode = i;
        this.videoTextureHolder.active = storyEntry2 != null && storyEntry2.isRepostMessage && i == 1;
        if (this.botId == 0 && (storyLimitCheckStoryLimit = MessagesController.getInstance(this.currentAccount).getStoriesController().checkStoryLimit()) != null && storyLimitCheckStoryLimit.active(this.currentAccount)) {
            showLimitReachedSheet(storyLimitCheckStoryLimit, true);
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
        int i2 = this.openType;
        frameLayout.setBackgroundColor((i2 == 1 || i2 == 0) ? 0 : -14737633);
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
        animateOpenTo(1.0f, true, new StoryRecorder$$ExternalSyntheticLambda11(this));
        addNotificationObservers();
        this.botId = 0L;
        this.botLang = "";
        this.botEdit = null;
    }

    private void setupBackDispatcher() {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = this.windowView.findOnBackInvokedDispatcher()) != null) {
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new OnBackInvokedCallback() {
                @Override
                public final void onBackInvoked() {
                    this.f$0.onBackPressed();
                }
            });
        }
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
                        StoryRecorder.m4613$r8$lambda$chghhlFMOOxIsYq62q65y6Era0(this.f$0, z);
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
                    this.f$0.onCloseDone();
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

    public static void m4613$r8$lambda$chghhlFMOOxIsYq62q65y6Era0(StoryRecorder storyRecorder, boolean z) {
        storyRecorder.onClosePrepareListener = null;
        storyRecorder.prepareClosing = false;
        storyRecorder.close(z);
    }

    private void animateOpenTo(final float f, boolean z, final Runnable runnable) {
        ValueAnimator valueAnimator = this.openCloseAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.openCloseAnimator = null;
        }
        if (z) {
            this.notificationsLocker.lock();
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.stopAllHeavyOperations, 512);
            this.frozenDismissProgress = Float.valueOf(this.dismissProgress);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.openProgress, f);
            this.openCloseAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    StoryRecorder.m4625$r8$lambda$DvjH9x3kCDsjTks3c3gr9j9SDU(this.f$0, valueAnimator2);
                }
            });
            this.openCloseAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    StoryRecorder.this.frozenDismissProgress = null;
                    StoryRecorder.this.openProgress = f;
                    StoryRecorder.this.applyOpenProgress();
                    StoryRecorder.this.containerView.invalidate();
                    StoryRecorder.this.windowView.invalidate();
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    if (StoryRecorder.this.fromSourceView != null) {
                        StoryRecorder.access$600(StoryRecorder.this);
                    }
                    StoryRecorder.this.notificationsLocker.unlock();
                    NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.startAllHeavyOperations, 512);
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
            if (f < 1.0f && this.wasSend) {
                this.openCloseAnimator.setDuration(250L);
                this.openCloseAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            } else if (f > 0.0f || this.containerView.getTranslationY1() < AndroidUtilities.dp(20.0f)) {
                this.openCloseAnimator.setDuration(300L);
                this.openCloseAnimator.setInterpolator(new FastOutSlowInInterpolator());
            } else if (f < 0.0f && this.fastClose) {
                this.openCloseAnimator.setDuration(200L);
                this.openCloseAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.fastClose = false;
            } else {
                this.openCloseAnimator.setDuration(400L);
                this.openCloseAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            }
            this.openCloseAnimator.start();
        } else {
            this.frozenDismissProgress = null;
            this.openProgress = f;
            applyOpenProgress();
            this.containerView.invalidate();
            this.windowView.invalidate();
            if (runnable != null) {
                runnable.run();
            }
            checkBackgroundVisibility();
        }
        if (f > 0.0f) {
            firstOpen = false;
        }
    }

    public static void m4625$r8$lambda$DvjH9x3kCDsjTks3c3gr9j9SDU(StoryRecorder storyRecorder, ValueAnimator valueAnimator) {
        storyRecorder.getClass();
        storyRecorder.openProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        storyRecorder.checkBackgroundVisibility();
        storyRecorder.containerView.invalidate();
        storyRecorder.windowView.invalidate();
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
            createFilterPhotoView();
        } else {
            if (storyEntry == null || !storyEntry.isRepostMessage) {
                return;
            }
            if (storyEntry.isVideo) {
                this.previewView.setupVideoPlayer(storyEntry, null, 0L);
            }
            createFilterPhotoView();
        }
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
                StoryRecorder.$r8$lambda$bAfkbaADfVPJfT23UHqO4GURt4g(this.f$0);
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
        CollageLayoutView2 collageLayoutView2 = this.collageLayoutView;
        if (collageLayoutView2 != null) {
            collageLayoutView2.clear(true);
        }
    }

    public static void $r8$lambda$bAfkbaADfVPJfT23UHqO4GURt4g(StoryRecorder storyRecorder) {
        WindowView windowView;
        if (storyRecorder.windowManager == null || (windowView = storyRecorder.windowView) == null || windowView.getParent() == null) {
            return;
        }
        storyRecorder.windowManager.removeView(storyRecorder.windowView);
    }

    public void setOnFullyOpenListener(Runnable runnable) {
        this.onFullyOpenListener = runnable;
    }

    public void setOnPrepareCloseListener(Utilities.Callback4 callback4) {
        this.onClosePrepareListener = callback4;
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
        FrameLayout frameLayout = this.previewContainer;
        frameLayout.setTranslationX((this.rectF.left - frameLayout.getLeft()) - this.containerView.getX());
        FrameLayout frameLayout2 = this.previewContainer;
        frameLayout2.setTranslationY((this.rectF.top - frameLayout2.getTop()) - this.containerView.getY());
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

    public class WindowView extends SizeNotifierFrameLayout {
        private boolean allowModeScroll;
        private boolean flingDetected;
        private GestureDetectorFixDoubleTap gestureDetector;
        private boolean ignoreLayout;
        private ScaleGestureDetector scaleGestureDetector;
        private boolean scaling;
        private float stx;
        private float sty;
        private boolean touchInCollageList;
        private float ty;

        static float access$4216(WindowView windowView, float f) {
            float f2 = windowView.sty + f;
            windowView.sty = f2;
            return f2;
        }

        static float access$4316(WindowView windowView, float f) {
            float f2 = windowView.stx + f;
            windowView.stx = f2;
            return f2;
        }

        static float access$5224(WindowView windowView, float f) {
            float f2 = windowView.ty - f;
            windowView.ty = f2;
            return f2;
        }

        public WindowView(Context context) {
            super(context);
            this.scaling = false;
            this.allowModeScroll = true;
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
        protected void dispatchDraw(Canvas canvas) {
            boolean z;
            float fFloatValue = StoryRecorder.this.frozenDismissProgress != null ? StoryRecorder.this.frozenDismissProgress.floatValue() : StoryRecorder.this.dismissProgress;
            if (StoryRecorder.this.openType == 0) {
                canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, (int) (StoryRecorder.this.openProgress * 255.0f * (1.0f - fFloatValue))));
            }
            float fLerp = AndroidUtilities.lerp(StoryRecorder.this.fromRounding, 0.0f, StoryRecorder.this.openProgress);
            if (StoryRecorder.this.openProgress != 1.0f) {
                z = true;
                if (StoryRecorder.this.openType == 0) {
                    StoryRecorder.this.fullRectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    StoryRecorder.this.fullRectF.offset(StoryRecorder.this.containerView.getTranslationX(), StoryRecorder.this.containerView.getTranslationY());
                    AndroidUtilities.lerp(StoryRecorder.this.fromRect, StoryRecorder.this.fullRectF, StoryRecorder.this.openProgress, StoryRecorder.this.rectF);
                    canvas.save();
                    StoryRecorder.this.clipPath.rewind();
                    StoryRecorder.this.clipPath.addRoundRect(StoryRecorder.this.rectF, fLerp, fLerp, Path.Direction.CW);
                    canvas.clipPath(StoryRecorder.this.clipPath);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.clamp(StoryRecorder.this.openProgress * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                    canvas.translate(StoryRecorder.this.rectF.left, StoryRecorder.this.rectF.top - (StoryRecorder.this.containerView.getTranslationY() * StoryRecorder.this.openProgress));
                    float fMax = Math.max(StoryRecorder.this.rectF.width() / getWidth(), StoryRecorder.this.rectF.height() / getHeight());
                    canvas.scale(fMax, fMax);
                } else {
                    if (StoryRecorder.this.openType == 1) {
                        StoryRecorder.this.applyOpenProgress();
                    }
                    z = false;
                }
            } else {
                z = false;
            }
            if (StoryRecorder.this.paintView != null) {
                StoryRecorder.this.paintView.onParentPreDraw();
            }
            super.dispatchDraw(canvas);
            if (z) {
                canvas.restore();
                canvas.restore();
                if (StoryRecorder.this.fromSourceView != null) {
                    float fClamp = Utilities.clamp(1.0f - (StoryRecorder.this.openProgress * 1.5f), 1.0f, 0.0f);
                    float fCenterX = StoryRecorder.this.rectF.centerX();
                    float fCenterY = StoryRecorder.this.rectF.centerY();
                    Math.min(StoryRecorder.this.rectF.width(), StoryRecorder.this.rectF.height());
                    if (StoryRecorder.this.fromSourceView.backgroundImageReceiver != null) {
                        StoryRecorder.this.fromSourceView.backgroundImageReceiver.setImageCoords(StoryRecorder.this.rectF);
                        int i = StoryRecorder.this.fromSourceView.backgroundImageReceiver.getRoundRadius()[0];
                        StoryRecorder.this.fromSourceView.backgroundImageReceiver.setRoundRadius((int) fLerp);
                        StoryRecorder.this.fromSourceView.backgroundImageReceiver.setAlpha(fClamp);
                        StoryRecorder.this.fromSourceView.backgroundImageReceiver.draw(canvas);
                        StoryRecorder.this.fromSourceView.backgroundImageReceiver.setRoundRadius(i);
                    } else if (StoryRecorder.this.fromSourceView.backgroundDrawable != null) {
                        StoryRecorder.this.fromSourceView.backgroundDrawable.setBounds((int) StoryRecorder.this.rectF.left, (int) StoryRecorder.this.rectF.top, (int) StoryRecorder.this.rectF.right, (int) StoryRecorder.this.rectF.bottom);
                        StoryRecorder.this.fromSourceView.backgroundDrawable.setAlpha((int) (255.0f * fClamp * fClamp * fClamp));
                        StoryRecorder.this.fromSourceView.backgroundDrawable.draw(canvas);
                    } else if (StoryRecorder.this.fromSourceView.backgroundPaint != null) {
                        if (StoryRecorder.this.fromSourceView.hasShadow) {
                            StoryRecorder.this.fromSourceView.backgroundPaint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(3.0f), Theme.multAlpha(855638016, fClamp));
                        }
                        StoryRecorder.this.fromSourceView.backgroundPaint.setAlpha((int) (255.0f * fClamp));
                        canvas.drawRoundRect(StoryRecorder.this.rectF, fLerp, fLerp, StoryRecorder.this.fromSourceView.backgroundPaint);
                    }
                    if (StoryRecorder.this.fromSourceView.iconDrawable != null) {
                        StoryRecorder.this.rect.set(StoryRecorder.this.fromSourceView.iconDrawable.getBounds());
                        StoryRecorder.this.fromSourceView.iconDrawable.setBounds((int) (fCenterX - (StoryRecorder.this.fromSourceView.iconSize / 2)), (int) (fCenterY - (StoryRecorder.this.fromSourceView.iconSize / 2)), (int) (fCenterX + (StoryRecorder.this.fromSourceView.iconSize / 2)), (int) (fCenterY + (StoryRecorder.this.fromSourceView.iconSize / 2)));
                        int alpha = StoryRecorder.this.fromSourceView.iconDrawable.getAlpha();
                        StoryRecorder.this.fromSourceView.iconDrawable.setAlpha((int) (alpha * fClamp));
                        StoryRecorder.this.fromSourceView.iconDrawable.draw(canvas);
                        StoryRecorder.this.fromSourceView.iconDrawable.setBounds(StoryRecorder.this.rect);
                        StoryRecorder.this.fromSourceView.iconDrawable.setAlpha(alpha);
                    }
                    canvas.save();
                    canvas.translate(StoryRecorder.this.fromRect.left, StoryRecorder.this.fromRect.top);
                    StoryRecorder.this.fromSourceView.drawAbove(canvas, fClamp);
                    canvas.restore();
                }
            }
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            boolean z = false;
            this.flingDetected = false;
            if (StoryRecorder.this.collageListView != null && StoryRecorder.this.collageListView.isVisible()) {
                float y = StoryRecorder.this.containerView.getY() + StoryRecorder.this.actionBarContainer.getY() + StoryRecorder.this.collageListView.getY();
                if ((motionEvent.getY() < y || motionEvent.getY() > y + StoryRecorder.this.collageListView.getHeight()) && !this.touchInCollageList) {
                    StoryRecorder.this.collageListView.setVisible(false, true);
                    StoryRecorder.this.updateActionBarButtons(true);
                } else {
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        z = true;
                    }
                    this.touchInCollageList = z;
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
            if (this.touchInCollageList && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
                this.touchInCollageList = false;
            }
            this.scaleGestureDetector.onTouchEvent(motionEvent);
            this.gestureDetector.onTouchEvent(motionEvent);
            if (motionEvent.getAction() == 1 && !this.flingDetected) {
                this.allowModeScroll = true;
                if (StoryRecorder.this.containerView.getTranslationY() > 0.0f) {
                    if (StoryRecorder.this.dismissProgress <= 0.4f) {
                        StoryRecorder.this.animateContainerBack();
                    } else {
                        StoryRecorder.this.close(true);
                    }
                } else if (StoryRecorder.this.galleryListView != null && StoryRecorder.this.galleryListView.getTranslationY() > 0.0f && !StoryRecorder.this.galleryClosing) {
                    StoryRecorder storyRecorder = StoryRecorder.this;
                    storyRecorder.animateGalleryListView(!storyRecorder.takingVideo && StoryRecorder.this.galleryListView.getTranslationY() < ((float) StoryRecorder.this.galleryListView.getPadding()));
                }
                StoryRecorder.this.galleryClosing = false;
                StoryRecorder.this.scrollingY = false;
                StoryRecorder.this.scrollingX = false;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        public void cancelGestures() {
            this.scaleGestureDetector.onTouchEvent(AndroidUtilities.emptyMotionEvent());
            this.gestureDetector.onTouchEvent(AndroidUtilities.emptyMotionEvent());
        }

        @Override
        public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
            if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                StoryRecorder.this.onBackPressed();
                return true;
            }
            return super.dispatchKeyEventPreIme(keyEvent);
        }

        private final class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
            private ScaleListener() {
            }

            @Override
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                if (!WindowView.this.scaling || StoryRecorder.this.cameraView == null || StoryRecorder.this.currentPage != 0 || StoryRecorder.this.cameraView.isDualTouch() || StoryRecorder.this.collageLayoutView.getFilledProgress() >= 1.0f) {
                    return false;
                }
                StoryRecorder.access$3816(StoryRecorder.this, (scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
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
                StoryRecorder.this.animateGalleryListView(false);
                StoryRecorder.this.animateContainerBack();
                super.onScaleEnd(scaleGestureDetector);
            }
        }

        private final class GestureListener extends GestureDetectorFixDoubleTap.OnGestureListener {
            @Override
            public void onLongPress(MotionEvent motionEvent) {
            }

            @Override
            public void onShowPress(MotionEvent motionEvent) {
            }

            private GestureListener() {
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
                if (!hasDoubleTap(motionEvent) && onSingleTapConfirmed(motionEvent)) {
                    return true;
                }
                if (!StoryRecorder.this.isGalleryOpen() || motionEvent.getY() >= StoryRecorder.this.galleryListView.top()) {
                    return false;
                }
                StoryRecorder.this.animateGalleryListView(false);
                return true;
            }

            @Override
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                boolean z = false;
                if ((StoryRecorder.this.openCloseAnimator == null || !StoryRecorder.this.openCloseAnimator.isRunning()) && StoryRecorder.this.galleryOpenCloseSpringAnimator == null && StoryRecorder.this.galleryOpenCloseAnimator == null && ((StoryRecorder.this.qrLinkView == null || !StoryRecorder.this.qrLinkView.inTouch()) && !StoryRecorder.this.recordControl.isTouch() && ((StoryRecorder.this.cameraView == null || !StoryRecorder.this.cameraView.isDualTouch()) && !WindowView.this.scaling && ((StoryRecorder.this.zoomControlView == null || !StoryRecorder.this.zoomControlView.isTouch()) && !StoryRecorder.this.inCheck() && !StoryRecorder.this.takingVideo && !StoryRecorder.this.takingPhoto && StoryRecorder.this.currentPage == 0)))) {
                    z = true;
                    if (!StoryRecorder.this.scrollingX) {
                        WindowView.access$4216(WindowView.this, f2);
                        if (!StoryRecorder.this.scrollingY && Math.abs(WindowView.this.sty) >= AndroidUtilities.touchSlop) {
                            if (StoryRecorder.this.collageLayoutView != null) {
                                StoryRecorder.this.collageLayoutView.cancelTouch();
                            }
                            StoryRecorder.this.scrollingY = true;
                        }
                    }
                    if (StoryRecorder.this.scrollingY) {
                        int measuredHeight = (StoryRecorder.this.windowView.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight());
                        if (StoryRecorder.this.galleryListView != null) {
                            float f3 = measuredHeight;
                            if (StoryRecorder.this.galleryListView.getTranslationY() >= f3) {
                                WindowView windowView = WindowView.this;
                                windowView.ty = StoryRecorder.this.containerView.getTranslationY1();
                            } else {
                                WindowView windowView2 = WindowView.this;
                                windowView2.ty = StoryRecorder.this.galleryListView.getTranslationY() - f3;
                            }
                        } else {
                            WindowView windowView3 = WindowView.this;
                            windowView3.ty = StoryRecorder.this.containerView.getTranslationY1();
                        }
                        if (StoryRecorder.this.galleryListView != null && StoryRecorder.this.galleryListView.listView.canScrollVertically(-1)) {
                            f2 = Math.max(0.0f, f2);
                        }
                        WindowView.access$5224(WindowView.this, f2);
                        WindowView windowView4 = WindowView.this;
                        windowView4.ty = Math.max(-measuredHeight, windowView4.ty);
                        if (StoryRecorder.this.currentPage == 1) {
                            WindowView windowView5 = WindowView.this;
                            windowView5.ty = Math.max(0.0f, windowView5.ty);
                        }
                        if (WindowView.this.ty < 0.0f) {
                            StoryRecorder.this.containerView.setTranslationY(0.0f);
                            if (StoryRecorder.this.galleryListView == null) {
                                StoryRecorder.this.createGalleryListView();
                            }
                            StoryRecorder.this.galleryListView.setTranslationY(measuredHeight + WindowView.this.ty);
                        } else {
                            StoryRecorder.this.containerView.setTranslationY(WindowView.this.ty);
                            if (StoryRecorder.this.galleryListView != null) {
                                StoryRecorder.this.galleryListView.setTranslationY(measuredHeight);
                            }
                        }
                    }
                    if (!StoryRecorder.this.scrollingY) {
                        WindowView.access$4316(WindowView.this, f);
                        if (!StoryRecorder.this.scrollingX && Math.abs(WindowView.this.stx) >= AndroidUtilities.touchSlop) {
                            if (StoryRecorder.this.collageLayoutView != null) {
                                StoryRecorder.this.collageLayoutView.cancelTouch();
                            }
                            StoryRecorder.this.scrollingX = true;
                        }
                    }
                }
                return z;
            }

            @Override
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if ((StoryRecorder.this.openCloseAnimator != null && StoryRecorder.this.openCloseAnimator.isRunning()) || ((StoryRecorder.this.qrLinkView != null && StoryRecorder.this.qrLinkView.inTouch()) || StoryRecorder.this.recordControl.isTouch() || ((StoryRecorder.this.cameraView != null && StoryRecorder.this.cameraView.isDualTouch()) || WindowView.this.scaling || ((StoryRecorder.this.zoomControlView != null && StoryRecorder.this.zoomControlView.isTouch()) || StoryRecorder.this.inCheck())))) {
                    return false;
                }
                boolean z = true;
                WindowView.this.flingDetected = true;
                WindowView.this.allowModeScroll = true;
                if (!StoryRecorder.this.scrollingY) {
                    z = false;
                } else if (Math.abs(StoryRecorder.this.containerView.getTranslationY1()) >= AndroidUtilities.dp(1.0f)) {
                    if ((f2 <= 0.0f || Math.abs(f2) <= 2000.0f || Math.abs(f2) <= Math.abs(f)) && StoryRecorder.this.dismissProgress <= 0.4f) {
                        StoryRecorder.this.animateContainerBack();
                    } else {
                        StoryRecorder.this.close(true);
                    }
                } else if (StoryRecorder.this.galleryListView == null || StoryRecorder.this.galleryClosing || StoryRecorder.this.mode == -1) {
                    z = false;
                } else if (Math.abs(f2) > 200.0f && (!StoryRecorder.this.galleryListView.listView.canScrollVertically(-1) || !StoryRecorder.this.wasGalleryOpen)) {
                    StoryRecorder storyRecorder = StoryRecorder.this;
                    storyRecorder.animateGalleryListView(!storyRecorder.takingVideo && f2 < 0.0f);
                } else {
                    StoryRecorder storyRecorder2 = StoryRecorder.this;
                    storyRecorder2.animateGalleryListView(!storyRecorder2.takingVideo && StoryRecorder.this.galleryListView.getTranslationY() < ((float) StoryRecorder.this.galleryListView.getPadding()));
                }
                StoryRecorder.this.galleryClosing = false;
                StoryRecorder.this.scrollingY = false;
                StoryRecorder.this.scrollingX = false;
                if (z && StoryRecorder.this.collageLayoutView != null) {
                    StoryRecorder.this.collageLayoutView.cancelTouch();
                }
                return z;
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
            public boolean onDoubleTap(MotionEvent motionEvent) {
                if (StoryRecorder.this.cameraView == null || StoryRecorder.this.awaitingPlayer || StoryRecorder.this.takingPhoto || !StoryRecorder.this.cameraView.isInited() || StoryRecorder.this.currentPage != 0 || StoryRecorder.this.mode == -1) {
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
            public boolean hasDoubleTap(MotionEvent motionEvent) {
                if (StoryRecorder.this.currentPage != 0 || StoryRecorder.this.cameraView == null || StoryRecorder.this.awaitingPlayer || !StoryRecorder.this.cameraView.isInited() || StoryRecorder.this.takingPhoto || StoryRecorder.this.recordControl.isTouch()) {
                    return false;
                }
                return (StoryRecorder.this.qrLinkView == null || !StoryRecorder.this.qrLinkView.inTouch()) && !StoryRecorder.this.isGalleryOpen() && StoryRecorder.this.galleryListViewOpening == null;
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int i3 = (size - StoryRecorder.this.insetLeft) - StoryRecorder.this.insetRight;
            int i4 = StoryRecorder.this.insetTop;
            int i5 = StoryRecorder.this.insetBottom;
            int iCeil = (int) Math.ceil((i3 / 9.0f) * 16.0f);
            StoryRecorder.this.underControls = AndroidUtilities.dp(48.0f);
            int i6 = size2 - i5;
            if (StoryRecorder.this.underControls + iCeil <= i6) {
                StoryRecorder.this.previewW = i3;
                StoryRecorder.this.previewH = iCeil;
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
            StoryRecorder.this.flashViews.backgroundView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            if (StoryRecorder.this.thanosEffect != null) {
                StoryRecorder.this.thanosEffect.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }
            if (StoryRecorder.this.changeDayNightView != null) {
                StoryRecorder.this.changeDayNightView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }
            StoryRecorder.access$7000(StoryRecorder.this);
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
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                } else if (childAt instanceof Bulletin.ParentLayout) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(340.0f), size2 - (StoryRecorder.this.underStatusBar ? 0 : i4)), 1073741824));
                }
            }
            if (StoryRecorder.this.cropEditor != null) {
                measureChildExactly(StoryRecorder.this.cropEditor, size, size2);
                measureChildExactly(StoryRecorder.this.cropEditor.contentView, size, size2);
            }
            if (StoryRecorder.this.cropInlineEditor != null) {
                measureChildExactly(StoryRecorder.this.cropInlineEditor, size, size2);
                measureChildExactly(StoryRecorder.this.cropInlineEditor.contentView, size, size2);
            }
            setMeasuredDimension(size, size2);
        }

        private void measureChildExactly(View view, int i, int i2) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            EmojiView emojiView;
            if (this.ignoreLayout) {
                return;
            }
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int i6 = StoryRecorder.this.insetTop;
            int measuredHeight2 = StoryRecorder.this.navbarContainer.getMeasuredHeight();
            if (StoryRecorder.this.underStatusBar) {
                i6 = 0;
            }
            int iClamp = MathUtils.clamp((measuredWidth - StoryRecorder.this.previewW) / 2, StoryRecorder.this.insetLeft, (measuredWidth - StoryRecorder.this.insetRight) - StoryRecorder.this.previewW);
            int i7 = StoryRecorder.this.previewW + iClamp;
            if (StoryRecorder.this.underStatusBar) {
                i5 = StoryRecorder.this.previewH;
            } else {
                int i8 = (((((measuredHeight - i6) - StoryRecorder.this.insetBottom) - StoryRecorder.this.previewH) - measuredHeight2) / 2) + i6;
                if (StoryRecorder.this.openType == 1 && StoryRecorder.this.fromRect.top + StoryRecorder.this.previewH + measuredHeight2 < measuredHeight - StoryRecorder.this.insetBottom) {
                    i6 = (int) StoryRecorder.this.fromRect.top;
                } else if (i8 - i6 >= AndroidUtilities.dp(40.0f)) {
                    i6 = i8;
                }
                i5 = StoryRecorder.this.previewH;
            }
            StoryRecorder.this.containerView.layout(iClamp, i6, i7, i5 + i6 + measuredHeight2);
            StoryRecorder.this.flashViews.backgroundView.layout(0, 0, measuredWidth, measuredHeight);
            if (StoryRecorder.this.thanosEffect != null) {
                StoryRecorder.this.thanosEffect.layout(0, 0, measuredWidth, measuredHeight);
            }
            if (StoryRecorder.this.changeDayNightView != null) {
                StoryRecorder.this.changeDayNightView.layout(0, 0, measuredWidth, measuredHeight);
            }
            if (StoryRecorder.this.galleryListView != null) {
                StoryRecorder.this.galleryListView.layout((measuredWidth - StoryRecorder.this.galleryListView.getMeasuredWidth()) / 2, 0, (StoryRecorder.this.galleryListView.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
            }
            StoryRecorder.access$7000(StoryRecorder.this);
            if (StoryRecorder.this.captionEdit != null && (emojiView = StoryRecorder.this.captionEdit.editText.getEmojiView()) != null) {
                emojiView.layout(StoryRecorder.this.insetLeft, (measuredHeight - StoryRecorder.this.insetBottom) - emojiView.getMeasuredHeight(), measuredWidth - StoryRecorder.this.insetRight, measuredHeight - StoryRecorder.this.insetBottom);
            }
            if (StoryRecorder.this.paintView != null) {
                if (StoryRecorder.this.paintView.emojiView != null) {
                    StoryRecorder.this.paintView.emojiView.layout(StoryRecorder.this.insetLeft, (measuredHeight - StoryRecorder.this.insetBottom) - StoryRecorder.this.paintView.emojiView.getMeasuredHeight(), measuredWidth - StoryRecorder.this.insetRight, measuredHeight - StoryRecorder.this.insetBottom);
                }
                if (StoryRecorder.this.paintView.reactionLayout != null) {
                    StoryRecorder.this.paintView.reactionLayout.layout(StoryRecorder.this.insetLeft, StoryRecorder.this.insetTop, StoryRecorder.this.insetLeft + StoryRecorder.this.paintView.reactionLayout.getMeasuredWidth(), StoryRecorder.this.insetTop + StoryRecorder.this.paintView.reactionLayout.getMeasuredHeight());
                    FrameLayout frameLayout = StoryRecorder.this.paintView.reactionLayout.getReactionsWindow() != null ? StoryRecorder.this.paintView.reactionLayout.getReactionsWindow().windowView : null;
                    if (frameLayout != null) {
                        frameLayout.layout(StoryRecorder.this.insetLeft, StoryRecorder.this.insetTop, StoryRecorder.this.insetLeft + frameLayout.getMeasuredWidth(), StoryRecorder.this.insetTop + frameLayout.getMeasuredHeight());
                    }
                }
            }
            if (StoryRecorder.this.cropEditor != null) {
                StoryRecorder.this.cropEditor.controlsLayout.setPadding(0, StoryRecorder.this.insetTop, 0, StoryRecorder.this.insetBottom);
                StoryRecorder.this.cropEditor.layout(0, 0, measuredWidth, measuredHeight);
                StoryRecorder.this.cropEditor.contentView.layout(0, 0, measuredWidth, measuredHeight);
            }
            if (StoryRecorder.this.cropInlineEditor != null) {
                StoryRecorder.this.cropInlineEditor.controlsLayout.setPadding(0, StoryRecorder.this.insetTop, 0, StoryRecorder.this.insetBottom);
                StoryRecorder.this.cropInlineEditor.layout(0, 0, measuredWidth, measuredHeight);
                StoryRecorder.this.cropInlineEditor.contentView.layout(0, 0, measuredWidth, measuredHeight);
            }
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                View childAt = getChildAt(i9);
                if (childAt instanceof DownloadButton.PreparingVideoToast) {
                    childAt.layout(0, 0, measuredWidth, measuredHeight);
                } else if (childAt instanceof Bulletin.ParentLayout) {
                    childAt.layout(0, i6, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i6);
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
                            if (childAt2 != StoryRecorder.this.previewView && childAt2 != StoryRecorder.this.cameraView && childAt2.getVisibility() == 0) {
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

    class ContainerView extends FrameLayout {
        private LinearGradient topGradient;
        private final Paint topGradientPaint;
        private float translationY1;
        private float translationY2;

        public ContainerView(Context context) {
            super(context);
            this.topGradientPaint = new Paint(1);
        }

        public void updateBackground() {
            if (StoryRecorder.this.openType == 0) {
                setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), -16777216));
            } else {
                setBackground(null);
            }
        }

        @Override
        public void invalidate() {
            if (StoryRecorder.this.openCloseAnimator == null || !StoryRecorder.this.openCloseAnimator.isRunning()) {
                super.invalidate();
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
            float fClamp = 1.0f - (Utilities.clamp(getTranslationY() / AndroidUtilities.dp(320.0f), 1.0f, 0.0f) * 0.1f);
            setScaleX(fClamp);
            setScaleY(fClamp);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5 = StoryRecorder.this.underStatusBar ? StoryRecorder.this.insetTop : 0;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            StoryRecorder.this.previewContainer.layout(0, 0, StoryRecorder.this.previewW, StoryRecorder.this.previewH);
            StoryRecorder.this.previewContainer.setPivotX(StoryRecorder.this.previewW * 0.5f);
            StoryRecorder.this.actionBarContainer.layout(0, i5, StoryRecorder.this.previewW, StoryRecorder.this.actionBarContainer.getMeasuredHeight() + i5);
            StoryRecorder.this.controlContainer.layout(0, StoryRecorder.this.previewH - StoryRecorder.this.controlContainer.getMeasuredHeight(), StoryRecorder.this.previewW, StoryRecorder.this.previewH);
            StoryRecorder.this.navbarContainer.layout(0, StoryRecorder.this.previewH, StoryRecorder.this.previewW, StoryRecorder.this.previewH + StoryRecorder.this.navbarContainer.getMeasuredHeight());
            StoryRecorder.this.captionContainer.layout(0, 0, StoryRecorder.this.previewW, StoryRecorder.this.previewH);
            if (StoryRecorder.this.captionEditOverlay != null) {
                StoryRecorder.this.captionEditOverlay.layout(0, 0, measuredWidth, measuredHeight);
            }
            StoryRecorder.this.flashViews.foregroundView.layout(0, 0, measuredWidth, measuredHeight);
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
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                if (childAt instanceof ItemOptions.DimView) {
                    childAt.layout(0, 0, measuredWidth, measuredHeight);
                }
            }
            setPivotX(measuredWidth / 2.0f);
            setPivotY((-measuredHeight) * 0.2f);
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

        private void measureChildExactly(View view, int i, int i2) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            boolean zDrawChild = super.drawChild(canvas, view, j);
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
            return zDrawChild;
        }
    }

    public Context getContext() {
        return this.activity;
    }

    private void initViews() {
        final Context context = getContext();
        WindowView windowView = new WindowView(context);
        this.windowView = windowView;
        ViewCompat.setOnApplyWindowInsetsListener(windowView, new OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return StoryRecorder.m4626$r8$lambda$EpqFVahDbH7U9EqnHFRU2qLnCw(this.f$0, view, windowInsetsCompat);
            }
        });
        this.windowView.setFocusable(true);
        this.windowView.setImportantForAccessibility(2);
        FlashViews flashViews = new FlashViews(context, this.windowManager, this.windowView, this.windowLayoutParams);
        this.flashViews = flashViews;
        flashViews.add(new FlashViews.Invertable() {
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
        FrameLayout frameLayout = new FrameLayout(context) {
            private RenderNode renderNode;
            private final Rect leftExclRect = new Rect();
            private final Rect rightExclRect = new Rect();

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (StoryRecorder.this.previewTouchable != null) {
                    StoryRecorder.this.previewTouchable.onTouch(motionEvent);
                    return true;
                }
                return super.onTouchEvent(motionEvent);
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
            public void invalidate() {
                if (StoryRecorder.this.openCloseAnimator == null || !StoryRecorder.this.openCloseAnimator.isRunning()) {
                    super.invalidate();
                }
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                Canvas canvasBeginRecording;
                int i = Build.VERSION.SDK_INT;
                boolean z = false;
                if (i < 31 || !canvas.isHardwareAccelerated() || AndroidUtilities.makingGlobalBlurBitmap) {
                    canvasBeginRecording = canvas;
                } else {
                    if (this.renderNode == null) {
                        this.renderNode = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("StoryRecorder.PreviewView");
                    }
                    this.renderNode.setPosition(0, 0, getWidth(), getHeight());
                    canvasBeginRecording = this.renderNode.beginRecording();
                    z = true;
                }
                super.dispatchDraw(canvasBeginRecording);
                if (!z || i < 31) {
                    return;
                }
                this.renderNode.endRecording();
                if (StoryRecorder.this.blurManager != null) {
                    StoryRecorder.this.blurManager.setRenderNode(this, this.renderNode, -14737633);
                }
                canvas.drawRenderNode(this.renderNode);
            }
        };
        this.previewContainer = frameLayout;
        containerView2.addView(frameLayout);
        this.containerView.addView(this.flashViews.foregroundView, new ViewGroup.LayoutParams(-1, -1));
        this.blurManager = new BlurringShader.BlurManager(this.previewContainer);
        this.videoTextureHolder = new PreviewView.TextureViewHolder();
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
        Bulletin.addDelegate(this.windowView, new Bulletin.Delegate() {
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
                return AndroidUtilities.dp(56.0f);
            }

            @Override
            public int getBottomOffset(int i) {
                return Bulletin.Delegate.CC.$default$getBottomOffset(this, i);
            }
        });
        CollageLayoutView2 collageLayoutView2 = new CollageLayoutView2(context, this.blurManager, this.containerView, this.resourcesProvider) {
            @Override
            protected void onLayoutUpdate(CollageLayout collageLayout) {
                StoryRecorder.this.collageListView.setVisible(false, true);
                if (collageLayout == null || collageLayout.parts.size() <= 1) {
                    StoryRecorder.this.collageButton.setSelected(false, true);
                } else {
                    StoryRecorder.this.collageButton.setIcon((Drawable) new CollageLayoutButton.CollageLayoutDrawable(StoryRecorder.this.lastCollageLayout = collageLayout), true);
                    StoryRecorder.this.collageButton.setSelected(true, true);
                }
                StoryRecorder.this.updateActionBarButtons(true);
                if (StoryRecorder.this.galleryListView != null) {
                    StoryRecorder.this.galleryListView.setMultipleOnClick(StoryRecorder.this.collageLayoutView.hasLayout());
                    StoryRecorder.this.galleryListView.setMaxCount(Math.min(10, CollageLayout.getMaxCount() - StoryRecorder.this.collageLayoutView.getFilledCount()));
                }
            }
        };
        this.collageLayoutView = collageLayoutView2;
        final WindowView windowView3 = this.windowView;
        Objects.requireNonNull(windowView3);
        collageLayoutView2.setCancelGestures(new Runnable() {
            @Override
            public final void run() {
                windowView3.cancelGestures();
            }
        });
        this.collageLayoutView.setResetState(new Runnable() {
            @Override
            public final void run() {
                this.f$0.updateActionBarButtons(true);
            }
        });
        this.previewContainer.addView(this.collageLayoutView, LayoutHelper.createFrame(-1, -1, 119));
        this.collageLayoutView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StoryRecorder.m4624$r8$lambda$DranJSZ5Y0o5miwC0Qo8D0Oj94(this.f$0, view);
            }
        });
        FrameLayout frameLayout6 = this.previewContainer;
        int i = this.openType;
        frameLayout6.setBackgroundColor((i == 1 || i == 0) ? 0 : -14737633);
        this.previewContainer.setOutlineProvider(ViewOutlineProviderImpl.boundsWithPaddingRoundRect(0, AndroidUtilities.dp(12.0f)));
        this.previewContainer.setClipToOutline(true);
        this.photoFilterEnhanceView = new PhotoFilterView.EnhanceView(context, new Runnable() {
            @Override
            public final void run() {
                this.f$0.createFilterPhotoView();
            }
        });
        PreviewView previewView = new PreviewView(context, this.blurManager, this.videoTextureHolder) {
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
            public void onEntityDraggedTop(boolean z) {
                StoryRecorder.this.previewHighlight.show(true, z, StoryRecorder.this.actionBarContainer);
            }

            @Override
            public void onEntityDraggedBottom(boolean z) {
                StoryRecorder.this.previewHighlight.updateCaption(StoryRecorder.this.captionEdit.getText());
            }

            @Override
            public void onRoundSelectChange(boolean z) {
                if (StoryRecorder.this.paintView == null) {
                    return;
                }
                if (z || !(StoryRecorder.this.paintView.getSelectedEntity() instanceof RoundView)) {
                    if (!z || (StoryRecorder.this.paintView.getSelectedEntity() instanceof RoundView) || StoryRecorder.this.paintView.findRoundView() == null) {
                        return;
                    }
                    StoryRecorder.this.paintView.selectEntity(StoryRecorder.this.paintView.findRoundView());
                    return;
                }
                StoryRecorder.this.paintView.selectEntity(null);
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
            protected void invalidateTextureViewHolder() {
                if (StoryRecorder.this.outputEntry == null || !StoryRecorder.this.outputEntry.isRepostMessage || !StoryRecorder.this.outputEntry.isVideo || StoryRecorder.this.paintView == null || StoryRecorder.this.paintView.entitiesView == null) {
                    return;
                }
                for (int i2 = 0; i2 < StoryRecorder.this.paintView.entitiesView.getChildCount(); i2++) {
                    View childAt = StoryRecorder.this.paintView.entitiesView.getChildAt(i2);
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
        };
        this.previewView = previewView;
        previewView.setCollageView(this.collageLayoutView);
        this.previewView.invalidateBlur = new Runnable() {
            @Override
            public final void run() {
                this.f$0.invalidateBlur();
            }
        };
        this.previewView.setOnTapListener(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.$r8$lambda$scUQdqCM7sjLa3jU0zCEiAC3rqY(this.f$0);
            }
        });
        this.previewView.setVisibility(8);
        this.previewView.whenError(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.m4643$r8$lambda$jk9AIvuXu53xuSjLM0D3IWvLs(this.f$0);
            }
        });
        this.previewContainer.addView(this.previewView, LayoutHelper.createFrame(-1, -1, 119));
        this.previewContainer.addView(this.photoFilterEnhanceView, LayoutHelper.createFrame(-1, -1, 119));
        WindowView windowView4 = this.windowView;
        AnonymousClass8 anonymousClass8 = new AnonymousClass8(context, windowView4, windowView4, this.containerView, this.resourcesProvider, this.blurManager);
        this.captionEdit = anonymousClass8;
        anonymousClass8.setAccount(this.currentAccount);
        this.captionEdit.setUiBlurBitmap(new Utilities.CallbackVoidReturn() {
            @Override
            public final Object run() {
                return this.f$0.getUiBlurBitmap();
            }
        });
        Bulletin.addDelegate(this.captionContainer, new Bulletin.Delegate() {
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

            @Override
            public int getBottomOffset(int i2) {
                return StoryRecorder.this.captionEdit.getEditTextHeight() + AndroidUtilities.dp(12.0f);
            }
        });
        this.captionEdit.setOnHeightUpdate(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.m4638$r8$lambda$bxn3jll7Kb9ZresnjWqFbwvp_0(this.f$0, (Integer) obj);
            }
        });
        this.captionEdit.setOnPeriodUpdate(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.$r8$lambda$7qWx5hzG8GXlDOQcPzhj2VJB9ts(this.f$0, (Integer) obj);
            }
        });
        long j = this.selectedDialogId;
        if (j != 0) {
            this.captionEdit.setDialogId(j);
        }
        this.captionEdit.setOnPremiumHint(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.showPremiumPeriodBulletin(((Integer) obj).intValue());
            }
        });
        this.captionEdit.setOnKeyboardOpen(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.$r8$lambda$Mv6qLT3XWSk5thylZ8rPZGyQYm4(this.f$0, (Boolean) obj);
            }
        });
        View view = new View(context) {
            @Override
            protected void dispatchDraw(Canvas canvas) {
                canvas.save();
                canvas.translate(StoryRecorder.this.captionContainer.getX() + StoryRecorder.this.captionEdit.getX(), StoryRecorder.this.captionContainer.getY() + StoryRecorder.this.captionEdit.getY());
                StoryRecorder.this.captionEdit.drawOver2(canvas, StoryRecorder.this.captionEdit.getBounds(), StoryRecorder.this.captionEdit.getOver2Alpha());
                canvas.restore();
            }
        };
        this.captionEditOverlay = view;
        this.containerView.addView(view);
        TimelineView timelineView = new TimelineView(context, this.containerView, this.previewContainer, this.resourcesProvider, this.blurManager);
        this.timelineView = timelineView;
        timelineView.setOnTimelineClick(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.m4628$r8$lambda$KovaA7Idoiu0tSpke7oC28Kp1Q(this.f$0);
            }
        });
        this.timelineView.setOnHeightChange(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.m4620$r8$lambda$9X82_RnRGcPGTd994xnONkngxo(this.f$0);
            }
        });
        this.previewView.setVideoTimelineView(this.timelineView);
        this.timelineView.setVisibility(8);
        this.timelineView.setAlpha(0.0f);
        this.timelineView.setMaxCount(1);
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.videoTimelineContainerView = frameLayout7;
        frameLayout7.addView(this.timelineView, LayoutHelper.createFrame(-1, TimelineView.heightDp(), 87, 0.0f, 0.0f, 0.0f, 0.0f));
        VideoTimeView videoTimeView = new VideoTimeView(context);
        this.videoTimeView = videoTimeView;
        videoTimeView.setVisibility(8);
        this.videoTimeView.show(false, false);
        this.videoTimelineContainerView.addView(this.videoTimeView, LayoutHelper.createFrame(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.captionContainer.addView(this.videoTimelineContainerView, LayoutHelper.createFrame(-1, TimelineView.heightDp() + 25, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.captionContainer.addView(this.captionEdit, LayoutHelper.createFrame(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.collageLayoutView.setTimelineView(this.timelineView);
        this.collageLayoutView.setPreviewView(this.previewView);
        TimelineView timelineView2 = new TimelineView(context, this.containerView, this.previewContainer, this.resourcesProvider, this.blurManager);
        this.coverTimelineView = timelineView2;
        timelineView2.setCover();
        this.coverTimelineView.setVisibility(8);
        this.coverTimelineView.setAlpha(0.0f);
        this.captionContainer.addView(this.coverTimelineView, LayoutHelper.createFrame(-1, TimelineView.heightDp(), 87, 0.0f, 0.0f, 0.0f, 6.0f));
        MultipleStoriesSelector multipleStoriesSelector = new MultipleStoriesSelector(context, this.resourcesProvider, this.blurManager) {
            private final Path path = new Path();

            @Override
            protected boolean customBlur() {
                return StoryRecorder.this.blurManager.hasRenderNode();
            }

            @Override
            protected void drawBlur(BlurringShader.StoryBlurDrawer storyBlurDrawer, Canvas canvas, RectF rectF, float f, boolean z, float f2, float f3, boolean z2, float f4) {
                if (canvas.isHardwareAccelerated()) {
                    canvas.save();
                    this.path.rewind();
                    this.path.addRoundRect(rectF, f, f, Path.Direction.CW);
                    canvas.clipPath(this.path);
                    canvas.translate(f2, f3);
                    storyBlurDrawer.drawRect(canvas, 0.0f, 0.0f, f4);
                    canvas.restore();
                }
            }

            @Override
            protected void onSwitchToStory(int i2, StoryEntry storyEntry) {
                showList(false, true);
                if (storyEntry != StoryRecorder.this.outputEntry) {
                    StoryRecorder.this.switchTo(i2);
                }
            }
        };
        this.storiesSelector = multipleStoriesSelector;
        multipleStoriesSelector.setVisibility(8);
        this.captionContainer.addView(this.storiesSelector, LayoutHelper.createFrame(-1, -2, 85));
        FlashViews.ImageViewInvertable imageViewInvertable = new FlashViews.ImageViewInvertable(context);
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
            public final void onClick(View view2) {
                StoryRecorder.$r8$lambda$XMag7XLUpAUXNBRKa8r9RAR96DI(this.f$0, view2);
            }
        });
        this.actionBarContainer.addView(this.backButton, LayoutHelper.createFrame(56, 56, 51));
        this.flashViews.add(this.backButton);
        SelectPeerView selectPeerView = new SelectPeerView(context, this.currentAccount);
        this.livePeerView = selectPeerView;
        selectPeerView.setShowing(false, false);
        this.livePeerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                StoryRecorder.$r8$lambda$Yeyob1ratzi265WPS_xrV0fj_0A(this.f$0, context, view2);
            }
        });
        this.actionBarContainer.addView(this.livePeerView, LayoutHelper.createFrame(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context);
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
        LinearLayout linearLayout = new LinearLayout(context);
        this.actionBarButtons = linearLayout;
        linearLayout.setOrientation(0);
        this.actionBarButtons.setGravity(5);
        this.actionBarContainer.addView(this.actionBarButtons, LayoutHelper.createFrame(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        this.downloadButton = new DownloadButton(context, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.m4637$r8$lambda$bvfPdXiJ5zqBiCRxygRT3cGEs4(this.f$0, (Runnable) obj);
            }
        }, this.currentAccount, this.windowView, this.resourcesProvider);
        HintView2 animatedTextHacks = new HintView2(this.activity, 1).setJoint(1.0f, -71.0f).setDuration(2000L).setBounce(false).setAnimatedTextHacks(true, true, false);
        this.muteHint = animatedTextHacks;
        animatedTextHacks.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.actionBarContainer.addView(this.muteHint, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.muteButton = rLottieImageView;
        rLottieImageView.setScaleType(scaleType);
        RLottieImageView rLottieImageView2 = this.muteButton;
        StoryEntry storyEntry = this.outputEntry;
        rLottieImageView2.setImageResource((storyEntry == null || !storyEntry.muted) ? R.drawable.media_mute : R.drawable.media_unmute);
        this.muteButton.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.muteButton.setBackground(Theme.createSelectorDrawable(553648127));
        this.muteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                StoryRecorder.$r8$lambda$SFwXvzxAEtP1ddgrW2y5VspblCY(this.f$0, view2);
            }
        });
        this.muteButton.setVisibility(8);
        this.muteButton.setAlpha(0.0f);
        PlayPauseButton playPauseButton = new PlayPauseButton(context);
        this.playButton = playPauseButton;
        playPauseButton.setBackground(Theme.createSelectorDrawable(553648127));
        this.playButton.setVisibility(8);
        this.playButton.setAlpha(0.0f);
        this.playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                StoryRecorder.m4633$r8$lambda$Wwgi46eccm8Rp4hBZ9Wn9mjcuw(this.f$0, view2);
            }
        });
        this.actionBarButtons.addView(this.playButton, LayoutHelper.createLinear(46, 56, 53));
        this.actionBarButtons.addView(this.muteButton, LayoutHelper.createLinear(46, 56, 53));
        this.actionBarButtons.addView(this.downloadButton, LayoutHelper.createFrame(46, 56, 53));
        ToggleButton2 toggleButton2 = new ToggleButton2(context);
        this.flashButton = toggleButton2;
        toggleButton2.setBackground(Theme.createSelectorDrawable(553648127));
        this.flashButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                StoryRecorder.$r8$lambda$VfbPY2VCKTNG9At0FUZShabkiF8(this.f$0, view2);
            }
        });
        this.flashButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view2) {
                return StoryRecorder.$r8$lambda$BNdDUIvHDWbshRC0A0dhY0xPSDc(this.f$0, view2);
            }
        });
        this.flashButton.setVisibility(8);
        this.flashButton.setAlpha(0.0f);
        this.flashViews.add(this.flashButton);
        this.actionBarContainer.addView(this.flashButton, LayoutHelper.createFrame(56, 56, 53));
        ToggleButton toggleButton = new ToggleButton(context, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.dualButton = toggleButton;
        toggleButton.setContentDescription(LocaleController.getString(R.string.AccDescrDualCameraOn));
        this.dualButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                StoryRecorder.m4616$r8$lambda$1zbi76KzvHJbE6KmWSvYb0MZFE(this.f$0, view2);
            }
        });
        boolean zDualAvailableStatic = DualCameraView.dualAvailableStatic(context);
        this.dualButton.setVisibility(zDualAvailableStatic ? 0 : 8);
        this.dualButton.setAlpha(zDualAvailableStatic ? 1.0f : 0.0f);
        this.flashViews.add(this.dualButton);
        this.actionBarContainer.addView(this.dualButton, LayoutHelper.createFrame(56, 56, 53));
        CollageLayoutButton collageLayoutButton = new CollageLayoutButton(context);
        this.collageButton = collageLayoutButton;
        collageLayoutButton.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.collageButton.setBackground(Theme.createSelectorDrawable(553648127));
        if (this.lastCollageLayout == null) {
            this.lastCollageLayout = (CollageLayout) CollageLayout.getLayouts().get(6);
        }
        this.collageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                StoryRecorder.$r8$lambda$eUvQiQTyfQrX8vXMZJN8VlrTBsE(this.f$0, view2);
            }
        });
        this.collageButton.setIcon((Drawable) new CollageLayoutButton.CollageLayoutDrawable(this.lastCollageLayout), false);
        this.collageButton.setSelected(false);
        this.collageButton.setVisibility(0);
        this.collageButton.setAlpha(1.0f);
        this.flashViews.add(this.collageButton);
        this.actionBarContainer.addView(this.collageButton, LayoutHelper.createFrame(56, 56, 53));
        ToggleButton2 toggleButton3 = new ToggleButton2(context);
        this.collageRemoveButton = toggleButton3;
        toggleButton3.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.collageRemoveButton.setBackground(Theme.createSelectorDrawable(553648127));
        this.collageRemoveButton.setIcon((Drawable) new CollageLayoutButton.CollageLayoutDrawable(new CollageLayout("../../.."), true), false);
        this.collageRemoveButton.setVisibility(8);
        this.collageRemoveButton.setAlpha(0.0f);
        this.collageRemoveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                StoryRecorder.$r8$lambda$leX93LGPODI66qu_l2e5r8SA22Q(this.f$0, view2);
            }
        });
        this.flashViews.add(this.collageRemoveButton);
        this.actionBarContainer.addView(this.collageRemoveButton, LayoutHelper.createFrame(56, 56, 53));
        CollageLayoutButton.CollageLayoutListView collageLayoutListView = new CollageLayoutButton.CollageLayoutListView(context, this.flashViews);
        this.collageListView = collageLayoutListView;
        collageLayoutListView.listView.scrollToPosition(6);
        this.collageListView.setSelected((CollageLayout) null);
        this.collageListView.setOnLayoutClick(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.$r8$lambda$lUMPKI3yWdBMciBZP4tDgk28X5o(this.f$0, (CollageLayout) obj);
            }
        });
        this.actionBarContainer.addView(this.collageListView, LayoutHelper.createFrame(-1, 56, 53));
        HintView2 onHiddenListener = new HintView2(this.activity, 1).setJoint(1.0f, -20.0f).setDuration(5000L).setCloseButton(true).setText(LocaleController.getString(R.string.StoryCameraDualHint)).setOnHiddenListener(new Runnable() {
            @Override
            public final void run() {
                MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) + 1).apply();
            }
        });
        this.dualHint = onHiddenListener;
        onHiddenListener.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.actionBarContainer.addView(this.dualHint, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        HintView2 multilineText = new HintView2(this.activity, 2).setJoint(0.0f, 28.0f).setDuration(5000L).setMultilineText(true);
        this.savedDualHint = multilineText;
        this.actionBarContainer.addView(multilineText, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        HintView2 text = new HintView2(this.activity, 1).setJoint(1.0f, -20.0f).setDuration(5000L).setText(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.removeCollageHint = text;
        text.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.actionBarContainer.addView(this.removeCollageHint, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        this.videoTimerView = new VideoTimerView(context);
        showVideoTimer(false, false);
        this.actionBarContainer.addView(this.videoTimerView, LayoutHelper.createFrame(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.flashViews.add(this.videoTimerView);
        MediaController.loadGalleryPhotosAlbums(0);
        RecordControl recordControl = new RecordControl(context);
        this.recordControl = recordControl;
        recordControl.setDelegate(this.recordControlDelegate);
        this.recordControl.startAsVideo(this.mode == 1);
        this.controlContainer.addView(this.recordControl, LayoutHelper.createFrame(-1, 100, 87));
        this.flashViews.add(this.recordControl);
        this.recordControl.setCollageProgress(this.collageLayoutView.hasLayout() ? this.collageLayoutView.getFilledProgress() : 0.0f, true);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, this.resourcesProvider);
        this.startLiveButton = buttonWithCounterView;
        buttonWithCounterView.setRoundRadius(24);
        this.startLiveButton.setColor(-2473124);
        this.startLiveButton.setText(LocaleController.getString(R.string.LiveStoryStart), false);
        this.startLiveButton.setAlpha(0.0f);
        this.startLiveButton.setScaleX(0.8f);
        this.startLiveButton.setScaleY(0.8f);
        this.startLiveButton.setVisibility(8);
        this.controlContainer.addView(this.startLiveButton, LayoutHelper.createFrame(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.startLiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.startLive();
            }
        });
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
                StoryRecorder.m4635$r8$lambda$ZD1BZaguJDkCGZDC6Yv3qc8ST8(this.f$0, f);
            }
        });
        ZoomControlView zoomControlView2 = this.zoomControlView;
        this.cameraZoom = 0.0f;
        zoomControlView2.setZoom(0.0f, false);
        ScannedLinkPreview scannedLinkPreview = new ScannedLinkPreview(context, this.currentAccount, new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.$r8$lambda$eapXGM3neZz6PdNZiHcwCcwPXco(this.f$0);
            }
        });
        this.qrLinkView = scannedLinkPreview;
        scannedLinkPreview.whenClicked(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.$r8$lambda$OZ0y9k9tcJL7HoDwccOH4xPOUa8(this.f$0, (Utilities.Callback) obj);
            }
        });
        this.controlContainer.addView(this.qrLinkView, LayoutHelper.createFrame(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        StoryModeTabs storyModeTabs = new StoryModeTabs(context) {
            @Override
            protected boolean allowTouch() {
                return !StoryRecorder.this.inCheck();
            }
        };
        this.modeSwitcherView = storyModeTabs;
        storyModeTabs.setOnSwitchModeListener(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.$r8$lambda$W3wo5WJSPW_5DlkKChBGxyDPB9A(this.f$0, (Integer) obj);
            }
        });
        this.modeSwitcherView.setOnSwitchingModeListener(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.$r8$lambda$2KMq9mMZ_rkOX5jYw5ZVM51nyxI(this.f$0, (Float) obj);
            }
        });
        this.navbarContainer.addView(this.modeSwitcherView, LayoutHelper.createFrame(-1, 48, 55));
        this.flashViews.add(this.modeSwitcherView);
        FlashViews.ImageViewInvertable imageViewInvertable4 = new FlashViews.ImageViewInvertable(context);
        this.rotateButton = imageViewInvertable4;
        imageViewInvertable4.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.rotateButton.setImageResource(R.drawable.stream_flip);
        this.rotateButton.setScaleType(scaleType);
        this.rotateButton.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.rotateButton.setBackground(Theme.createSelectorDrawable(553648127));
        this.navbarContainer.addView(this.rotateButton, LayoutHelper.createFrame(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.flashViews.add(this.rotateButton);
        this.rotateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                StoryRecorder.$r8$lambda$TVSKZn9I4S8Jk1pyN6VpmeRejgc(this.f$0, view2);
            }
        });
        FlashViews.ImageViewInvertable imageViewInvertable5 = new FlashViews.ImageViewInvertable(context);
        this.liveSettingsButton = imageViewInvertable5;
        imageViewInvertable5.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.liveSettingsButton.setImageResource(R.drawable.stream_settings);
        this.liveSettingsButton.setScaleType(scaleType);
        this.liveSettingsButton.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.liveSettingsButton.setBackground(Theme.createSelectorDrawable(553648127));
        this.navbarContainer.addView(this.liveSettingsButton, LayoutHelper.createFrame(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.flashViews.add(this.liveSettingsButton);
        this.liveSettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.startLive();
            }
        });
        HintTextView hintTextView = new HintTextView(context);
        this.hintTextView = hintTextView;
        this.navbarContainer.addView(hintTextView, LayoutHelper.createFrame(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.flashViews.add(this.hintTextView);
        HintTextView hintTextView2 = new HintTextView(context);
        this.collageHintTextView = hintTextView2;
        hintTextView2.setText(LocaleController.getString(R.string.StoryCollageReorderHint), false);
        this.collageHintTextView.setAlpha(0.0f);
        this.navbarContainer.addView(this.collageHintTextView, LayoutHelper.createFrame(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.flashViews.add(this.collageHintTextView);
        ButtonWithCounterView round = new ButtonWithCounterView(context, this.resourcesProvider).setRound();
        this.coverButton = round;
        round.setVisibility(8);
        this.coverButton.setAlpha(0.0f);
        this.coverButton.setText(LocaleController.getString(R.string.StoryCoverSave), false);
        this.coverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                StoryRecorder.$r8$lambda$gN0fbtEEXDsrOVg0BZ_FJlM_zJo(this.f$0, view2);
            }
        });
        this.navbarContainer.addView(this.coverButton, LayoutHelper.createFrame(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        PreviewButtons previewButtons = new PreviewButtons(context);
        this.previewButtons = previewButtons;
        previewButtons.setVisibility(8);
        this.previewButtons.setOnClickListener(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.$r8$lambda$YGJlulHvPSbgFeCVElHiXjy59o0(this.f$0, (Integer) obj);
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
        updateActionBarButtons(false);
    }

    public static WindowInsetsCompat m4626$r8$lambda$EpqFVahDbH7U9EqnHFRU2qLnCw(StoryRecorder storyRecorder, View view, WindowInsetsCompat windowInsetsCompat) {
        storyRecorder.getClass();
        Insets defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(windowInsetsCompat, false);
        storyRecorder.insetLeft = defaultWindowInsets.left;
        storyRecorder.insetTop = defaultWindowInsets.top;
        storyRecorder.insetRight = defaultWindowInsets.right;
        storyRecorder.insetBottom = defaultWindowInsets.bottom;
        storyRecorder.windowView.requestLayout();
        return WindowInsetsCompat.CONSUMED;
    }

    public static void m4624$r8$lambda$DranJSZ5Y0o5miwC0Qo8D0Oj94(StoryRecorder storyRecorder, View view) {
        if (storyRecorder.noCameraPermission) {
            storyRecorder.requestCameraPermission(true);
        }
    }

    public static void $r8$lambda$scUQdqCM7sjLa3jU0zCEiAC3rqY(StoryRecorder storyRecorder) {
        if (storyRecorder.currentEditMode == -1 && storyRecorder.currentPage == 1) {
            CaptionStory captionStory = storyRecorder.captionEdit;
            if (captionStory.keyboardShown || captionStory.isRecording() || storyRecorder.timelineView.onBackPressed() || storyRecorder.storiesSelector.onBackPressed()) {
                return;
            }
            storyRecorder.switchToEditMode(0, true);
            PaintView paintView = storyRecorder.paintView;
            if (paintView != null) {
                paintView.openText();
                storyRecorder.paintView.enteredThroughText = true;
            }
        }
    }

    public static void m4643$r8$lambda$jk9AIvuXu53xuSjLM0D3IWvLs(StoryRecorder storyRecorder) {
        storyRecorder.videoError = true;
        storyRecorder.previewButtons.setShareEnabled(false);
        storyRecorder.downloadButton.showFailedVideo();
    }

    class AnonymousClass8 extends CaptionStory {
        private final Path path;

        @Override
        public boolean drawOver2FromParent() {
            return true;
        }

        AnonymousClass8(Context context, FrameLayout frameLayout, SizeNotifierFrameLayout sizeNotifierFrameLayout, FrameLayout frameLayout2, Theme.ResourcesProvider resourcesProvider, BlurringShader.BlurManager blurManager) {
            super(context, frameLayout, sizeNotifierFrameLayout, frameLayout2, resourcesProvider, blurManager);
            this.path = new Path();
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
                        RectOld selectionBounds = ((EntityView) childAt).getSelectionBounds();
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
        public void setVisibility(int i) {
            super.setVisibility(i);
        }

        @Override
        protected void drawBlurBitmap(Bitmap bitmap, float f) {
            StoryRecorder.this.windowView.drawBlurBitmap(bitmap, f);
            super.drawBlurBitmap(bitmap, f);
        }

        @Override
        protected boolean captionLimitToast() {
            if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                return false;
            }
            Bulletin visibleBulletin = Bulletin.getVisibleBulletin();
            if (visibleBulletin != null && visibleBulletin.tag == 2) {
                return false;
            }
            int i = MessagesController.getInstance(this.currentAccount).storyCaptionLengthLimitPremium;
            SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i / MessagesController.getInstance(this.currentAccount).storyCaptionLengthLimitDefault), "" + i));
            int iIndexOf = spannableStringBuilderReplaceTags.toString().indexOf("__");
            if (iIndexOf >= 0) {
                spannableStringBuilderReplaceTags.replace(iIndexOf, iIndexOf + 2, (CharSequence) "");
                int iIndexOf2 = spannableStringBuilderReplaceTags.toString().indexOf("__");
                if (iIndexOf2 >= 0) {
                    spannableStringBuilderReplaceTags.replace(iIndexOf2, iIndexOf2 + 2, (CharSequence) "");
                    spannableStringBuilderReplaceTags.setSpan(new ForegroundColorSpan(Theme.getColor(Theme.key_chat_messageLinkIn, this.resourcesProvider)), iIndexOf, iIndexOf2, 33);
                    spannableStringBuilderReplaceTags.setSpan(new ClickableSpan() {
                        @Override
                        public void updateDrawState(TextPaint textPaint) {
                            textPaint.setUnderlineText(false);
                        }

                        @Override
                        public void onClick(View view) {
                            StoryRecorder.this.openPremium();
                        }
                    }, iIndexOf, iIndexOf2, 33);
                }
            }
            Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(StoryRecorder.this.captionContainer, this.resourcesProvider).createSimpleBulletin(R.raw.caption_limit, LocaleController.getString(R.string.CaptionPremiumTitle), spannableStringBuilderReplaceTags);
            bulletinCreateSimpleBulletin.tag = 2;
            bulletinCreateSimpleBulletin.setDuration(5000);
            bulletinCreateSimpleBulletin.show(false);
            return true;
        }

        @Override
        protected void onCaptionLimitUpdate(boolean z) {
            StoryRecorder.this.previewButtons.setShareEnabled((StoryRecorder.this.videoError || z || (MessagesController.getInstance(this.currentAccount).getStoriesController().hasStoryLimit(StoryRecorder.this.getCount()) && (StoryRecorder.this.outputEntry == null || !StoryRecorder.this.outputEntry.isEdit))) ? false : true);
        }

        @Override
        public boolean canRecord() {
            if (CameraView.isCameraAllowed()) {
                return StoryRecorder.this.requestAudioPermission();
            }
            return false;
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
                    StoryRecorder.AnonymousClass8.$r8$lambda$04i4h8yLniv9i600leFE4uJzmh4(this.f$0, roundVideoRecorder, (File) obj, (String) obj2, (Long) obj3);
                }
            });
            roundVideoRecorder.onDestroy(new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.AnonymousClass8.m4656$r8$lambda$6nEbgfMl33QuF7ERAh7HVI_wE(this.f$0);
                }
            });
            StoryRecorder.this.previewContainer.addView(StoryRecorder.this.currentRoundRecorder = roundVideoRecorder, LayoutHelper.createFrame(-1, -1.0f));
        }

        public static void $r8$lambda$04i4h8yLniv9i600leFE4uJzmh4(AnonymousClass8 anonymousClass8, RoundVideoRecorder roundVideoRecorder, File file, String str, Long l) {
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
                if (StoryRecorder.this.previewView != null && StoryRecorder.this.paintView != null) {
                    RoundView roundViewCreateRound = StoryRecorder.this.paintView.createRound(StoryRecorder.this.outputEntry.roundThumb, true);
                    anonymousClass8.setHasRoundVideo(true);
                    StoryRecorder.this.previewView.setupRound(StoryRecorder.this.outputEntry, roundViewCreateRound, true);
                    roundVideoRecorder.hideTo(roundViewCreateRound);
                    return;
                }
                roundVideoRecorder.destroy(false);
            }
        }

        public static void m4656$r8$lambda$6nEbgfMl33QuF7ERAh7HVI_wE(AnonymousClass8 anonymousClass8) {
            if (StoryRecorder.this.previewView != null) {
                StoryRecorder.this.previewView.mute(false);
                StoryRecorder.this.previewView.seek(0L);
            }
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
        public void invalidateDrawOver2() {
            if (StoryRecorder.this.captionEditOverlay != null) {
                StoryRecorder.this.captionEditOverlay.invalidate();
            }
        }

        @Override
        public int getTimelineHeight() {
            if (StoryRecorder.this.videoTimelineContainerView == null || StoryRecorder.this.timelineView == null || StoryRecorder.this.timelineView.getVisibility() != 0) {
                return 0;
            }
            return StoryRecorder.this.timelineView.getTimelineHeight();
        }

        @Override
        protected boolean customBlur() {
            return StoryRecorder.this.blurManager.hasRenderNode();
        }

        @Override
        protected void drawBlur(BlurringShader.StoryBlurDrawer storyBlurDrawer, Canvas canvas, RectF rectF, float f, boolean z, float f2, float f3, boolean z2, float f4) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                this.path.rewind();
                this.path.addRoundRect(rectF, f, f, Path.Direction.CW);
                canvas.clipPath(this.path);
                canvas.translate(f2, f3);
                storyBlurDrawer.drawRect(canvas, 0.0f, 0.0f, f4);
                canvas.restore();
            }
        }
    }

    public static void m4638$r8$lambda$bxn3jll7Kb9ZresnjWqFbwvp_0(StoryRecorder storyRecorder, Integer num) {
        MultipleStoriesSelector multipleStoriesSelector;
        FrameLayout frameLayout = storyRecorder.videoTimelineContainerView;
        if (frameLayout != null) {
            frameLayout.setTranslationY(storyRecorder.currentEditMode == 2 ? AndroidUtilities.dp(68.0f) : (-(storyRecorder.captionEdit.getEditTextHeight() + AndroidUtilities.dp(12.0f))) + AndroidUtilities.dp(64.0f));
        }
        MultipleStoriesSelector multipleStoriesSelector2 = storyRecorder.storiesSelector;
        if (multipleStoriesSelector2 != null) {
            int i = -(storyRecorder.captionEdit.getEditTextHeight() + AndroidUtilities.dp(24.0f));
            TimelineView timelineView = storyRecorder.timelineView;
            multipleStoriesSelector2.setTranslationY(i - (timelineView == null ? 0 : timelineView.getContentHeight() - AndroidUtilities.dp(5.0f)));
        }
        Bulletin visibleBulletin = Bulletin.getVisibleBulletin();
        if (visibleBulletin != null && visibleBulletin.tag == 2) {
            visibleBulletin.updatePosition();
        }
        if (!storyRecorder.captionEdit.keyboardShown || (multipleStoriesSelector = storyRecorder.storiesSelector) == null) {
            return;
        }
        multipleStoriesSelector.showList(false, true);
    }

    public static void $r8$lambda$7qWx5hzG8GXlDOQcPzhj2VJB9ts(StoryRecorder storyRecorder, Integer num) {
        StoryEntry storyEntry = storyRecorder.outputEntry;
        if (storyEntry != null) {
            storyEntry.period = num.intValue();
            MessagesController.getGlobalMainSettings().edit().putInt("story_period", num.intValue()).apply();
        }
    }

    public static void $r8$lambda$Mv6qLT3XWSk5thylZ8rPZGyQYm4(StoryRecorder storyRecorder, Boolean bool) {
        TimelineView timelineView;
        storyRecorder.getClass();
        if (bool.booleanValue() && (timelineView = storyRecorder.timelineView) != null) {
            timelineView.onBackPressed();
        }
        storyRecorder.previewView.updatePauseReason(2, bool.booleanValue());
        storyRecorder.videoTimelineContainerView.clearAnimation();
        storyRecorder.videoTimelineContainerView.animate().alpha(bool.booleanValue() ? 0.0f : 1.0f).setDuration(120L).start();
        Bulletin visibleBulletin = Bulletin.getVisibleBulletin();
        if (visibleBulletin == null || visibleBulletin.tag != 2) {
            return;
        }
        visibleBulletin.updatePosition();
    }

    public static void m4628$r8$lambda$KovaA7Idoiu0tSpke7oC28Kp1Q(StoryRecorder storyRecorder) {
        if (storyRecorder.currentPage != 1) {
            return;
        }
        storyRecorder.switchToEditMode(2, true);
    }

    public static void m4620$r8$lambda$9X82_RnRGcPGTd994xnONkngxo(StoryRecorder storyRecorder) {
        MultipleStoriesSelector multipleStoriesSelector = storyRecorder.storiesSelector;
        if (multipleStoriesSelector != null) {
            int i = -(storyRecorder.captionEdit.getEditTextHeight() + AndroidUtilities.dp(24.0f));
            TimelineView timelineView = storyRecorder.timelineView;
            multipleStoriesSelector.setTranslationY(i - (timelineView == null ? 0 : timelineView.getContentHeight() - AndroidUtilities.dp(5.0f)));
        }
    }

    public static void $r8$lambda$XMag7XLUpAUXNBRKa8r9RAR96DI(StoryRecorder storyRecorder, View view) {
        if (storyRecorder.awaitingPlayer) {
            return;
        }
        storyRecorder.onBackPressed();
    }

    public static void $r8$lambda$Yeyob1ratzi265WPS_xrV0fj_0A(final StoryRecorder storyRecorder, Context context, View view) {
        storyRecorder.getClass();
        new StoryPrivacyBottomSheet.ChoosePeerSheet(context, storyRecorder.currentAccount, true, storyRecorder.livePeer, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.$r8$lambda$UbZao7qJ7aYWwhDwL1epj37L744(this.f$0, (TLRPC.InputPeer) obj);
            }
        }, storyRecorder.resourcesProvider).show();
    }

    public static void $r8$lambda$UbZao7qJ7aYWwhDwL1epj37L744(StoryRecorder storyRecorder, TLRPC.InputPeer inputPeer) {
        SelectPeerView selectPeerView = storyRecorder.livePeerView;
        storyRecorder.livePeer = inputPeer;
        selectPeerView.set(inputPeer);
    }

    public static void m4637$r8$lambda$bvfPdXiJ5zqBiCRxygRT3cGEs4(StoryRecorder storyRecorder, Runnable runnable) {
        storyRecorder.applyPaint();
        storyRecorder.applyPaintMessage();
        storyRecorder.applyFilter(runnable);
    }

    public static void $r8$lambda$SFwXvzxAEtP1ddgrW2y5VspblCY(StoryRecorder storyRecorder, View view) {
        String string;
        StoryEntry storyEntry = storyRecorder.outputEntry;
        if (storyEntry == null || storyRecorder.awaitingPlayer) {
            return;
        }
        storyEntry.muted = !storyEntry.muted;
        ArrayList arrayList = storyEntry.collageContent;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((StoryEntry) obj).muted = storyRecorder.outputEntry.muted;
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(storyRecorder.outputEntry.audioPath);
        StoryEntry storyEntry2 = storyRecorder.outputEntry;
        boolean z = storyEntry2.round != null;
        if (storyRecorder.currentEditMode == -1) {
            HintView2 hintView2 = storyRecorder.muteHint;
            if (storyEntry2.muted) {
                string = LocaleController.getString((!zIsEmpty || z) ? R.string.StoryOriginalSoundMuted : R.string.StorySoundMuted);
            } else {
                string = LocaleController.getString((!zIsEmpty || z) ? R.string.StoryOriginalSoundNotMuted : R.string.StorySoundNotMuted);
            }
            hintView2.setText(string, storyRecorder.muteHint.shown());
            storyRecorder.muteHint.show();
        }
        storyRecorder.setIconMuted(storyRecorder.outputEntry.muted, true);
        storyRecorder.previewView.checkVolumes();
    }

    public static void m4633$r8$lambda$Wwgi46eccm8Rp4hBZ9Wn9mjcuw(StoryRecorder storyRecorder, View view) {
        boolean z = !storyRecorder.previewView.isPlaying();
        storyRecorder.previewView.play(z);
        storyRecorder.playButton.drawable.setPause(z, true);
    }

    public static void $r8$lambda$VfbPY2VCKTNG9At0FUZShabkiF8(StoryRecorder storyRecorder, View view) {
        if (storyRecorder.cameraView == null || storyRecorder.awaitingPlayer) {
            return;
        }
        String currentFlashMode = storyRecorder.getCurrentFlashMode();
        String nextFlashMode = storyRecorder.getNextFlashMode();
        if (currentFlashMode == null || currentFlashMode.equals(nextFlashMode)) {
            return;
        }
        storyRecorder.setCurrentFlashMode(nextFlashMode);
        storyRecorder.setCameraFlashModeIcon(nextFlashMode, true);
    }

    public static boolean $r8$lambda$BNdDUIvHDWbshRC0A0dhY0xPSDc(final StoryRecorder storyRecorder, View view) {
        DualCameraView dualCameraView = storyRecorder.cameraView;
        if (dualCameraView == null || !dualCameraView.isFrontface()) {
            return false;
        }
        storyRecorder.checkFrontfaceFlashModes();
        storyRecorder.flashButton.setSelected(true);
        storyRecorder.flashViews.previewStart();
        ItemOptions.makeOptions(storyRecorder.containerView, storyRecorder.resourcesProvider, storyRecorder.flashButton).addView(new SliderView(storyRecorder.getContext(), 1).setValue(storyRecorder.flashViews.warmth).setOnValueChange(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.flashViews.setWarmth(((Float) obj).floatValue());
            }
        })).addSpaceGap().addView(new SliderView(storyRecorder.getContext(), 2).setMinMax(0.65f, 1.0f).setValue(storyRecorder.flashViews.intensity).setOnValueChange(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.flashViews.setIntensity(((Float) obj).floatValue());
            }
        })).setOnDismiss(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.$r8$lambda$uCBZZpAc5ycVekthR95dwseuEKs(this.f$0);
            }
        }).setDimAlpha(0).setGravity(5).translate(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f)).setBackgroundColor(-1155851493).show();
        return true;
    }

    public static void $r8$lambda$uCBZZpAc5ycVekthR95dwseuEKs(StoryRecorder storyRecorder) {
        storyRecorder.saveFrontFaceFlashMode();
        storyRecorder.flashViews.previewEnd();
        storyRecorder.flashButton.setSelected(false);
    }

    public static void m4616$r8$lambda$1zbi76KzvHJbE6KmWSvYb0MZFE(StoryRecorder storyRecorder, View view) {
        DualCameraView dualCameraView = storyRecorder.cameraView;
        if (dualCameraView == null || storyRecorder.currentPage != 0) {
            return;
        }
        dualCameraView.toggleDual();
        storyRecorder.dualButton.setValue(storyRecorder.cameraView.isDual());
        storyRecorder.dualButton.setContentDescription(LocaleController.getString(storyRecorder.cameraView.isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
        storyRecorder.dualHint.hide();
        MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", 2).apply();
        if (storyRecorder.savedDualHint.shown()) {
            MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", 2).apply();
        }
        storyRecorder.savedDualHint.hide();
    }

    public static void $r8$lambda$eUvQiQTyfQrX8vXMZJN8VlrTBsE(StoryRecorder storyRecorder, View view) {
        if (storyRecorder.currentPage != 0 || storyRecorder.animatedRecording) {
            return;
        }
        DualCameraView dualCameraView = storyRecorder.cameraView;
        if (dualCameraView != null && dualCameraView.isDual()) {
            storyRecorder.cameraView.toggleDual();
        }
        if (!storyRecorder.collageListView.isVisible() && !storyRecorder.collageLayoutView.hasLayout()) {
            storyRecorder.collageLayoutView.setLayout(storyRecorder.lastCollageLayout, true);
            storyRecorder.collageListView.setSelected(storyRecorder.lastCollageLayout);
            storyRecorder.collageButton.setIcon((Drawable) new CollageLayoutButton.CollageLayoutDrawable(storyRecorder.lastCollageLayout), true);
            storyRecorder.collageButton.setSelected(true);
            DualCameraView dualCameraView2 = storyRecorder.cameraView;
            if (dualCameraView2 != null) {
                dualCameraView2.recordHevc = !storyRecorder.collageLayoutView.hasLayout();
            }
            GalleryListView galleryListView = storyRecorder.galleryListView;
            if (galleryListView != null) {
                galleryListView.setMultipleOnClick(storyRecorder.collageLayoutView.hasLayout());
                storyRecorder.galleryListView.setMaxCount(Math.min(10, CollageLayout.getMaxCount() - storyRecorder.collageLayoutView.getFilledCount()));
            }
        }
        CollageLayoutButton.CollageLayoutListView collageLayoutListView = storyRecorder.collageListView;
        collageLayoutListView.setVisible(!collageLayoutListView.isVisible(), true);
        storyRecorder.updateActionBarButtons(true);
    }

    public static void $r8$lambda$leX93LGPODI66qu_l2e5r8SA22Q(StoryRecorder storyRecorder, View view) {
        storyRecorder.collageLayoutView.setLayout(null, true);
        storyRecorder.collageLayoutView.clear(true);
        storyRecorder.collageListView.setSelected((CollageLayout) null);
        DualCameraView dualCameraView = storyRecorder.cameraView;
        if (dualCameraView != null) {
            dualCameraView.recordHevc = !storyRecorder.collageLayoutView.hasLayout();
        }
        storyRecorder.collageListView.setVisible(false, true);
        storyRecorder.updateActionBarButtons(true);
        GalleryListView galleryListView = storyRecorder.galleryListView;
        if (galleryListView != null) {
            galleryListView.setMultipleOnClick(storyRecorder.collageLayoutView.hasLayout());
            storyRecorder.galleryListView.setMaxCount(Math.min(10, CollageLayout.getMaxCount() - storyRecorder.collageLayoutView.getFilledCount()));
        }
    }

    public static void $r8$lambda$lUMPKI3yWdBMciBZP4tDgk28X5o(StoryRecorder storyRecorder, CollageLayout collageLayout) {
        CollageLayoutView2 collageLayoutView2 = storyRecorder.collageLayoutView;
        storyRecorder.lastCollageLayout = collageLayout;
        collageLayoutView2.setLayout(collageLayout, true);
        storyRecorder.collageListView.setSelected(collageLayout);
        DualCameraView dualCameraView = storyRecorder.cameraView;
        if (dualCameraView != null) {
            dualCameraView.recordHevc = !storyRecorder.collageLayoutView.hasLayout();
        }
        storyRecorder.collageButton.setDrawable(new CollageLayoutButton.CollageLayoutDrawable(collageLayout));
        storyRecorder.setActionBarButtonVisible(storyRecorder.collageRemoveButton, storyRecorder.collageListView.isVisible(), true);
        storyRecorder.recordControl.setCollageProgress(storyRecorder.collageLayoutView.hasLayout() ? storyRecorder.collageLayoutView.getFilledProgress() : 0.0f, true);
        GalleryListView galleryListView = storyRecorder.galleryListView;
        if (galleryListView != null) {
            galleryListView.setMultipleOnClick(storyRecorder.collageLayoutView.hasLayout());
            storyRecorder.galleryListView.setMaxCount(Math.min(10, CollageLayout.getMaxCount() - storyRecorder.collageLayoutView.getFilledCount()));
        }
    }

    public static void m4635$r8$lambda$ZD1BZaguJDkCGZDC6Yv3qc8ST8(StoryRecorder storyRecorder, float f) {
        DualCameraView dualCameraView = storyRecorder.cameraView;
        if (dualCameraView != null) {
            storyRecorder.cameraZoom = f;
            dualCameraView.setZoom(f);
        }
        storyRecorder.showZoomControls(true, true);
    }

    public static void $r8$lambda$eapXGM3neZz6PdNZiHcwCcwPXco(StoryRecorder storyRecorder) {
        CollageLayoutView2 collageLayoutView2 = storyRecorder.collageLayoutView;
        if (collageLayoutView2 != null) {
            collageLayoutView2.qrDrawer.setQrDetected(storyRecorder.qrLinkView.isResolved() ? storyRecorder.qrScanner.getDetected() : null);
        }
    }

    public static void $r8$lambda$OZ0y9k9tcJL7HoDwccOH4xPOUa8(StoryRecorder storyRecorder, final Utilities.Callback callback) {
        storyRecorder.fastClose = true;
        storyRecorder.close(true);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                callback.run(LaunchActivity.getSafeLastFragment());
            }
        }, 210L);
    }

    public static void $r8$lambda$W3wo5WJSPW_5DlkKChBGxyDPB9A(StoryRecorder storyRecorder, Integer num) {
        if (storyRecorder.takingPhoto || storyRecorder.takingVideo) {
            return;
        }
        int iIntValue = num.intValue();
        storyRecorder.mode = iIntValue;
        storyRecorder.livePeerView.setShowing(iIntValue == -1, true);
        storyRecorder.showVideoTimer(storyRecorder.mode == 1 && !storyRecorder.collageListView.isVisible(), true);
        storyRecorder.modeSwitcherView.switchMode(num.intValue());
        storyRecorder.recordControl.startAsVideo(num.intValue() == 1);
        if (num.intValue() == -1) {
            DualCameraView dualCameraView = storyRecorder.cameraView;
            if (dualCameraView != null && dualCameraView.isDual()) {
                storyRecorder.cameraView.toggleDual();
            }
            HintView2 hintView2 = storyRecorder.dualHint;
            if (hintView2 != null) {
                hintView2.hide();
            }
            HintView2 hintView3 = storyRecorder.savedDualHint;
            if (hintView3 != null) {
                hintView3.hide();
            }
            HintView2 hintView4 = storyRecorder.cameraHint;
            if (hintView4 != null) {
                hintView4.hide();
            }
            storyRecorder.collageLayoutView.setLayout(null, true);
            storyRecorder.collageLayoutView.clear(true);
            storyRecorder.collageListView.setSelected((CollageLayout) null);
            DualCameraView dualCameraView2 = storyRecorder.cameraView;
            if (dualCameraView2 != null) {
                dualCameraView2.recordHevc = !storyRecorder.collageLayoutView.hasLayout();
            }
        }
        storyRecorder.collageListView.setVisible(false, true);
        storyRecorder.updateActionBarButtons(true);
    }

    public static void $r8$lambda$2KMq9mMZ_rkOX5jYw5ZVM51nyxI(StoryRecorder storyRecorder, Float f) {
        storyRecorder.recordControl.startAsVideoT(f.floatValue());
        storyRecorder.recordControl.setVisibility(f.floatValue() <= -1.0f ? 8 : 0);
        storyRecorder.recordControl.setAlpha(Utilities.clamp01(f.floatValue() + 1.0f));
        storyRecorder.startLiveButton.setVisibility(f.floatValue() < 0.0f ? 0 : 8);
        storyRecorder.startLiveButton.setAlpha(AndroidUtilities.ilerp(f.floatValue(), 0.0f, -1.0f));
        storyRecorder.startLiveButton.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f.floatValue(), 0.0f, -1.0f)));
        storyRecorder.startLiveButton.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, AndroidUtilities.ilerp(f.floatValue(), 0.0f, -1.0f)));
        storyRecorder.startLiveButton.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.ilerp(f.floatValue(), 0.0f, -1.0f)));
        if (f.floatValue() < 0.0f) {
            storyRecorder.animateGalleryListView(false);
        }
    }

    public static void $r8$lambda$TVSKZn9I4S8Jk1pyN6VpmeRejgc(StoryRecorder storyRecorder, View view) {
        DualCameraView dualCameraView = storyRecorder.cameraView;
        if (dualCameraView == null || storyRecorder.awaitingPlayer || storyRecorder.takingPhoto || !dualCameraView.isInited() || storyRecorder.currentPage != 0) {
            return;
        }
        storyRecorder.cameraView.switchCamera();
        storyRecorder.recordControl.rotateFlip(180.0f);
        storyRecorder.saveCameraFace(storyRecorder.cameraView.isFrontface());
        if (storyRecorder.useDisplayFlashlight()) {
            storyRecorder.flashViews.flashIn(null);
        } else {
            storyRecorder.flashViews.flashOut();
        }
    }

    public static void $r8$lambda$gN0fbtEEXDsrOVg0BZ_FJlM_zJo(final StoryRecorder storyRecorder, View view) {
        StoryEntry storyEntry = storyRecorder.outputEntry;
        if (storyEntry == null) {
            return;
        }
        storyEntry.coverSet = true;
        storyEntry.cover = storyRecorder.coverValue;
        storyRecorder.processDone();
        StoryEntry storyEntry2 = storyRecorder.outputEntry;
        if (storyEntry2 == null || storyEntry2.isEditingCover) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.$r8$lambda$qXIJ2aqIEgc6wxm1kY60KoPzbX8(this.f$0);
            }
        }, 400L);
    }

    public static void $r8$lambda$qXIJ2aqIEgc6wxm1kY60KoPzbX8(final StoryRecorder storyRecorder) {
        PreviewView previewView;
        if (!storyRecorder.outputEntry.isEditingCover && storyRecorder.privacySheet != null && (previewView = storyRecorder.previewView) != null) {
            previewView.getCoverBitmap(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    StoryRecorder.$r8$lambda$wvXkTTHNtuqilW8wZUxp0kJffpo(this.f$0, (Bitmap) obj);
                }
            }, storyRecorder.previewView, storyRecorder.paintViewRenderView, storyRecorder.paintViewEntitiesView);
        }
        storyRecorder.navigateTo(1, true);
    }

    public static void $r8$lambda$wvXkTTHNtuqilW8wZUxp0kJffpo(StoryRecorder storyRecorder, Bitmap bitmap) {
        StoryEntry storyEntry = storyRecorder.outputEntry;
        if (storyEntry == null) {
            return;
        }
        AndroidUtilities.recycleBitmap(storyEntry.coverBitmap);
        storyRecorder.outputEntry.coverBitmap = bitmap;
        StoryPrivacyBottomSheet storyPrivacyBottomSheet = storyRecorder.privacySheet;
        if (storyPrivacyBottomSheet == null) {
            return;
        }
        storyPrivacyBottomSheet.setCover(bitmap);
    }

    public static void $r8$lambda$YGJlulHvPSbgFeCVElHiXjy59o0(StoryRecorder storyRecorder, Integer num) {
        if (storyRecorder.outputEntry == null || storyRecorder.captionEdit.isRecording()) {
            return;
        }
        storyRecorder.captionEdit.clearFocus();
        if (num.intValue() == 5) {
            storyRecorder.processDone();
            return;
        }
        if (num.intValue() == 0) {
            storyRecorder.switchToEditMode(0, true);
            PaintView paintView = storyRecorder.paintView;
            if (paintView != null) {
                paintView.enteredThroughText = false;
                paintView.openPaint();
                return;
            }
            return;
        }
        if (num.intValue() == 1) {
            storyRecorder.switchToEditMode(0, true);
            PaintView paintView2 = storyRecorder.paintView;
            if (paintView2 != null) {
                paintView2.openText();
                storyRecorder.paintView.enteredThroughText = true;
                return;
            }
            return;
        }
        if (num.intValue() == 2) {
            storyRecorder.createPhotoPaintView();
            storyRecorder.hidePhotoPaintView();
            PaintView paintView3 = storyRecorder.paintView;
            if (paintView3 != null) {
                paintView3.openStickers();
                return;
            }
            return;
        }
        if (num.intValue() == 4) {
            storyRecorder.switchToEditMode(1, true);
        } else if (num.intValue() == 3) {
            storyRecorder.switchToEditMode(3, true);
        }
    }

    private void processDone() {
        StoriesController.StoryLimit storyLimitCheckStoryLimit;
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
        if ((storyEntry == null || (!storyEntry.isEdit && storyEntry.botId == 0)) && (storyLimitCheckStoryLimit = MessagesController.getInstance(this.currentAccount).storiesController.checkStoryLimit()) != null && storyLimitCheckStoryLimit.active(this.currentAccount, getCount())) {
            showLimitReachedSheet(storyLimitCheckStoryLimit, false);
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
        StoryPrivacyBottomSheet storyPrivacyBottomSheetAllowCover = new StoryPrivacyBottomSheet(this.activity, this.outputEntry.period, this.resourcesProvider).setValue(this.outputEntry.privacy).setPeer(this.outputEntry.peer).setCanChangePeer(this.canChangePeer).whenDismiss(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.m4636$r8$lambda$_GFBe4be0ZDad_4pu9v86D44M(this.f$0, (StoryPrivacyBottomSheet.StoryPrivacy) obj);
            }
        }).allowCover(!this.collageLayoutView.hasLayout());
        ArrayList arrayList = this.selectedEntries;
        this.privacySheet = storyPrivacyBottomSheetAllowCover.setCount(arrayList == null ? this.outputEntry.getTotalCount() : arrayList.size()).isEdit(false).setWarnUsers(getUsersFrom(this.captionEdit.getText())).whenSelectedPeer(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.$r8$lambda$dJAvehXqHEIw6II3SbElCHVBjkc(this.f$0, (TLRPC.InputPeer) obj);
            }
        }).whenSelectedAlbums(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.m4647$r8$lambda$rUEYUHQrl3LlF8QjgBVuuhIDv8(this.f$0, (HashSet) obj);
            }
        }).whenSelectedRules(new StoryPrivacyBottomSheet.DoneCallback() {
            @Override
            public final void done(StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, boolean z, boolean z2, boolean z3, boolean z4, TLRPC.InputPeer inputPeer, int i4, Runnable runnable, Runnable runnable2) {
                StoryRecorder.$r8$lambda$WsBJEKlWazl0M1ECIZ6os_BzwVI(this.f$0, storyPrivacy, z, z2, z3, z4, inputPeer, i4, runnable, runnable2);
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
                        StoryRecorder.m4611$r8$lambda$VbRT3qc8EezRlJ_YVUWGO_eKIw(this.f$0, (Bitmap) obj);
                    }
                }, this.previewView, this.paintViewRenderView, this.paintViewEntitiesView);
            }
            this.privacySheet.setCover(this.outputEntry.coverBitmap, new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.$r8$lambda$K3ByVguswIJ236sI6MGds2Fs5AM(this.f$0);
                }
            });
        }
        this.privacySheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                StoryRecorder.m4614$r8$lambda$0eL_IzfjvpG28fk6vmZ1QgYPvU(this.f$0, dialogInterface);
            }
        });
        this.privacySheet.show();
    }

    public static void m4636$r8$lambda$_GFBe4be0ZDad_4pu9v86D44M(StoryRecorder storyRecorder, StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy) {
        StoryEntry storyEntry = storyRecorder.outputEntry;
        if (storyEntry != null) {
            storyEntry.privacy = storyPrivacy;
        }
        ArrayList arrayList = storyRecorder.entries;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((StoryEntry) obj).privacy = storyPrivacy;
            }
        }
    }

    public static void $r8$lambda$dJAvehXqHEIw6II3SbElCHVBjkc(StoryRecorder storyRecorder, TLRPC.InputPeer inputPeer) {
        StoryEntry storyEntry = storyRecorder.outputEntry;
        if (storyEntry == null) {
            return;
        }
        if (inputPeer == null) {
            inputPeer = new TLRPC.TL_inputPeerSelf();
        }
        storyEntry.peer = inputPeer;
        ArrayList arrayList = storyRecorder.entries;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((StoryEntry) obj).peer = storyRecorder.outputEntry.peer;
            }
        }
    }

    public static void m4647$r8$lambda$rUEYUHQrl3LlF8QjgBVuuhIDv8(StoryRecorder storyRecorder, HashSet hashSet) {
        StoryEntry storyEntry = storyRecorder.outputEntry;
        if (storyEntry == null) {
            return;
        }
        storyEntry.albums = hashSet;
        ArrayList arrayList = storyRecorder.entries;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((StoryEntry) obj).albums = hashSet;
            }
        }
    }

    public static void $r8$lambda$WsBJEKlWazl0M1ECIZ6os_BzwVI(final StoryRecorder storyRecorder, StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, boolean z, boolean z2, boolean z3, boolean z4, TLRPC.InputPeer inputPeer, int i, final Runnable runnable, Runnable runnable2) {
        if (storyRecorder.outputEntry == null) {
            return;
        }
        storyRecorder.previewView.updatePauseReason(5, true);
        storyRecorder.outputEntry.privacy = storyPrivacy;
        StoryPrivacySelector.save(storyRecorder.currentAccount, storyPrivacy);
        StoryEntry storyEntry = storyRecorder.outputEntry;
        storyEntry.pinned = z3;
        storyEntry.allowScreenshots = z2;
        storyEntry.privacyRules.clear();
        storyRecorder.outputEntry.privacyRules.addAll(storyPrivacy.rules);
        StoryEntry storyEntry2 = storyRecorder.outputEntry;
        storyEntry2.editedPrivacy = true;
        storyEntry2.peer = inputPeer;
        ArrayList arrayList = storyRecorder.entries;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                StoryEntry storyEntry3 = (StoryEntry) obj;
                storyEntry3.privacy = storyPrivacy;
                storyEntry3.pinned = z3;
                storyEntry3.allowScreenshots = z2;
                storyEntry3.privacyRules.clear();
                storyEntry3.privacyRules.addAll(storyPrivacy.rules);
                storyEntry3.editedPrivacy = true;
                storyEntry3.peer = inputPeer;
            }
        }
        storyRecorder.applyFilter(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.$r8$lambda$uOZSTYXGbRBTXxVPLab9xZft4BA(this.f$0, runnable);
            }
        });
    }

    public static void $r8$lambda$uOZSTYXGbRBTXxVPLab9xZft4BA(StoryRecorder storyRecorder, Runnable runnable) {
        storyRecorder.getClass();
        runnable.run();
        storyRecorder.upload(true);
    }

    public static void m4611$r8$lambda$VbRT3qc8EezRlJ_YVUWGO_eKIw(StoryRecorder storyRecorder, Bitmap bitmap) {
        StoryEntry storyEntry = storyRecorder.outputEntry;
        if (storyEntry == null) {
            return;
        }
        Bitmap bitmap2 = storyEntry.coverBitmap;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        storyRecorder.outputEntry.coverBitmap = bitmap;
        StoryPrivacyBottomSheet storyPrivacyBottomSheet = storyRecorder.privacySheet;
        if (storyPrivacyBottomSheet == null) {
            return;
        }
        storyPrivacyBottomSheet.setCover(bitmap);
    }

    public static void $r8$lambda$K3ByVguswIJ236sI6MGds2Fs5AM(StoryRecorder storyRecorder) {
        StoryPrivacyBottomSheet storyPrivacyBottomSheet = storyRecorder.privacySheet;
        if (storyPrivacyBottomSheet != null) {
            storyPrivacyBottomSheet.dismiss();
        }
        storyRecorder.navigateTo(2, true);
    }

    public static void m4614$r8$lambda$0eL_IzfjvpG28fk6vmZ1QgYPvU(StoryRecorder storyRecorder, DialogInterface dialogInterface) {
        storyRecorder.previewView.updatePauseReason(3, false);
        storyRecorder.privacySheet = null;
    }

    public void startLive() {
        StoryPrivacyBottomSheet storyPrivacyBottomSheet = this.privacySheet;
        if (storyPrivacyBottomSheet != null) {
            storyPrivacyBottomSheet.dismiss();
            this.privacySheet = null;
        }
        StoryPrivacyBottomSheet storyPrivacyBottomSheetWhenSelectedRules = new StoryPrivacyBottomSheet(this.activity, 86400, this.resourcesProvider).setLive(true).setValue(this.livePrivacy).setPeer(getLivePeer()).setCanChangePeer(this.canChangePeer).whenDismiss(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.livePrivacy = (StoryPrivacyBottomSheet.StoryPrivacy) obj;
            }
        }).allowCover(false).setCount(1).isEdit(false).whenSelectedPeer(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.m4618$r8$lambda$40KChm5p_uKndpsn9unCZPABo(this.f$0, (TLRPC.InputPeer) obj);
            }
        }).whenSelectedRules(new StoryPrivacyBottomSheet.DoneCallback() {
            @Override
            public final void done(StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, boolean z, boolean z2, boolean z3, boolean z4, TLRPC.InputPeer inputPeer, int i, Runnable runnable, Runnable runnable2) {
                StoryRecorder.m4612$r8$lambda$bdozVoV1DOl4cOOVXhHE7tbA8s(this.f$0, storyPrivacy, z, z2, z3, z4, inputPeer, i, runnable, runnable2);
            }
        }, false);
        this.privacySheet = storyPrivacyBottomSheetWhenSelectedRules;
        storyPrivacyBottomSheetWhenSelectedRules.show();
    }

    public static void m4618$r8$lambda$40KChm5p_uKndpsn9unCZPABo(StoryRecorder storyRecorder, TLRPC.InputPeer inputPeer) {
        SelectPeerView selectPeerView = storyRecorder.livePeerView;
        storyRecorder.livePeer = inputPeer;
        selectPeerView.set(inputPeer);
    }

    public static void m4612$r8$lambda$bdozVoV1DOl4cOOVXhHE7tbA8s(final StoryRecorder storyRecorder, final StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, final boolean z, final boolean z2, boolean z3, final boolean z4, final TLRPC.InputPeer inputPeer, final int i, Runnable runnable, final Runnable runnable2) {
        storyRecorder.getClass();
        PermissionRequest.ensureAllPermissions(R.raw.permission_request_camera, R.string.PermissionNoCameraMicVideo, z4 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.$r8$lambda$dyCpczeSLckGt40lF1bi6uGY3Mg(this.f$0, runnable2, z2, inputPeer, storyPrivacy, z4, z, i, (Boolean) obj);
            }
        });
    }

    public static void $r8$lambda$dyCpczeSLckGt40lF1bi6uGY3Mg(final StoryRecorder storyRecorder, final Runnable runnable, boolean z, TLRPC.InputPeer inputPeer, StoryPrivacyBottomSheet.StoryPrivacy storyPrivacy, final boolean z2, boolean z3, int i, Boolean bool) {
        storyRecorder.getClass();
        if (!bool.booleanValue()) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        DualCameraView dualCameraView = storyRecorder.cameraView;
        boolean z4 = dualCameraView == null || dualCameraView.isFrontface();
        final TL_stories.TL_startLive tL_startLive = new TL_stories.TL_startLive();
        tL_startLive.noforwards = true ^ z;
        tL_startLive.peer = inputPeer == null ? new TLRPC.TL_inputPeerSelf() : inputPeer;
        long clientUserId = (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) ? UserConfig.getInstance(storyRecorder.currentAccount).getClientUserId() : DialogObject.getPeerDialogId(inputPeer);
        tL_startLive.privacy_rules.addAll(storyPrivacy.rules);
        tL_startLive.random_id = Utilities.random.nextLong();
        tL_startLive.rtmp_stream = z2;
        tL_startLive.messages_enabled = Boolean.valueOf(z3);
        tL_startLive.send_paid_messages_stars = Long.valueOf(i);
        final boolean z5 = z4;
        final long j = clientUserId;
        ConnectionsManager.getInstance(storyRecorder.currentAccount).sendRequest(tL_startLive, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                StoryRecorder.$r8$lambda$43Qyiw3csivi6fiAouRMo7BGEn0(this.f$0, tL_startLive, z2, j, z5, runnable, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$43Qyiw3csivi6fiAouRMo7BGEn0(final StoryRecorder storyRecorder, final TL_stories.TL_startLive tL_startLive, final boolean z, final long j, final boolean z2, final Runnable runnable, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        storyRecorder.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                StoryRecorder.m4621$r8$lambda$9YqGJ8HJD1B4P3nQaXAy89JagM(this.f$0, tLObject, tL_startLive, z, j, z2, tL_error, runnable);
            }
        });
    }

    public static void m4621$r8$lambda$9YqGJ8HJD1B4P3nQaXAy89JagM(final StoryRecorder storyRecorder, TLObject tLObject, TL_stories.TL_startLive tL_startLive, final boolean z, final long j, final boolean z2, TLRPC.TL_error tL_error, Runnable runnable) throws InterruptedException {
        int i;
        TL_stories.StoryItem storyItem;
        TLRPC.InputGroupCall inputGroupCall;
        storyRecorder.getClass();
        if (!(tLObject instanceof TLRPC.Updates)) {
            if (tL_error != null) {
                if (tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                    new AlertDialog.Builder(storyRecorder.getContext(), storyRecorder.resourcesProvider).setTitle(LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle)).setMessage(LocaleController.getString(R.string.LiveStoryAlreadyStreaming)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                    return;
                }
                StoryPrivacyBottomSheet storyPrivacyBottomSheet = storyRecorder.privacySheet;
                if (storyPrivacyBottomSheet != null) {
                    BulletinFactory.of(storyPrivacyBottomSheet.container, storyRecorder.resourcesProvider).showForError(tL_error, true);
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        MessagesController.getInstance(storyRecorder.currentAccount).processUpdates(updates, false);
        DualCameraView dualCameraView = storyRecorder.cameraView;
        if (dualCameraView != null) {
            dualCameraView.destroy(true, null);
        }
        ArrayList arrayListFindUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateStoryID.class);
        int size = arrayListFindUpdates.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayListFindUpdates.get(i2);
            i2++;
            TL_update.TL_updateStoryID tL_updateStoryID = (TL_update.TL_updateStoryID) obj;
            if (tL_updateStoryID.random_id == tL_startLive.random_id) {
                i = tL_updateStoryID.id;
                break;
            }
        }
        ArrayList arrayListFindUpdates2 = MessagesController.findUpdates(updates, TL_stories.TL_updateStory.class);
        int size2 = arrayListFindUpdates2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                storyItem = null;
                break;
            }
            Object obj2 = arrayListFindUpdates2.get(i3);
            i3++;
            storyItem = ((TL_stories.TL_updateStory) obj2).story;
            if (storyItem != null && (storyItem.id == i || i == -1)) {
                break;
            }
        }
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
            } else {
                inputGroupCall = null;
            }
        } else {
            inputGroupCall = null;
        }
        if (inputGroupCall != null) {
            LivePlayer livePlayer = LivePlayer.recording;
            if (livePlayer != null) {
                livePlayer.destroy();
                if (LivePlayer.recording != null) {
                    LivePlayer.recording = null;
                    NotificationCenter.getInstance(storyRecorder.currentAccount).postNotificationName(NotificationCenter.liveStoryUpdated, Long.valueOf(LivePlayer.recording.getCallId()));
                }
            }
            final TLRPC.InputGroupCall inputGroupCall2 = inputGroupCall;
            final TL_stories.StoryItem storyItem2 = storyItem;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.$r8$lambda$YjFjW12o8Wuatn_W8LBfYrl6R6A(this.f$0, z, storyItem2, j, inputGroupCall2, z2);
                }
            }, 100L);
        }
    }

    public static void $r8$lambda$YjFjW12o8Wuatn_W8LBfYrl6R6A(StoryRecorder storyRecorder, boolean z, TL_stories.StoryItem storyItem, long j, TLRPC.InputGroupCall inputGroupCall, boolean z2) {
        if (!z) {
            LivePlayer.recording = new LivePlayer(storyRecorder.getContext(), storyRecorder.currentAccount, storyItem, j, storyItem.id, z, inputGroupCall, true, z2);
        }
        SourceView sourceView = storyRecorder.fromSourceView;
        if (sourceView != null) {
            sourceView.show(false);
        }
        storyRecorder.fromSourceView = null;
        storyRecorder.openType = 0;
        RectF rectF = storyRecorder.fromRect;
        Point point = AndroidUtilities.displaySize;
        rectF.set(0.0f, 0.0f, point.x, point.y);
        storyRecorder.fromRounding = AndroidUtilities.dp(8.0f);
        storyRecorder.close(true);
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        storyItem.dialogId = j;
        storyItem.justUploaded = true;
        safeLastFragment.getOrCreateStoryViewer().open(storyRecorder.getContext(), storyItem, (StoryViewer.PlaceProvider) null);
        NotificationCenter.getInstance(storyRecorder.currentAccount).postNotificationName(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.id));
    }

    private TLRPC.InputPeer getLivePeer() {
        TLRPC.InputPeer inputPeer = this.livePeer;
        if (inputPeer != null) {
            return inputPeer;
        }
        if (this.selectedDialogId != 0) {
            return MessagesController.getInstance(this.currentAccount).getInputPeer(this.selectedDialogId);
        }
        return new TLRPC.TL_inputPeerSelf();
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
                char cCharAt = charSequence.charAt(i2);
                if (cCharAt == '@') {
                    i = i2 + 1;
                } else if (cCharAt == ' ') {
                    if (i != -1) {
                        String string = charSequence.subSequence(i, i2).toString();
                        TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(string);
                        if (userOrChat instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) userOrChat;
                            if (!user2.bot && !UserObject.isUserSelf(user2) && user2.id != 777000 && !UserObject.isReplyUser(user2) && !arrayList.contains(string)) {
                                arrayList.add(string);
                            }
                        }
                    }
                    i = -1;
                }
            }
            if (i != -1) {
                String string2 = charSequence.subSequence(i, charSequence.length()).toString();
                TLObject userOrChat2 = MessagesController.getInstance(this.currentAccount).getUserOrChat(string2);
                if (userOrChat2 instanceof TLRPC.User) {
                    TLRPC.User user3 = (TLRPC.User) userOrChat2;
                    if (!user3.bot && !UserObject.isUserSelf(user3) && user3.id != 777000 && !UserObject.isReplyUser(user3) && !arrayList.contains(string2)) {
                        arrayList.add(string2);
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
        applyPaintInBackground(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.$r8$lambda$0HfJTova5_6RUNBXW0VTKUBttso(this.f$0, z);
            }
        });
    }

    public static void $r8$lambda$0HfJTova5_6RUNBXW0VTKUBttso(StoryRecorder storyRecorder, boolean z) {
        storyRecorder.applyPaintMessage();
        storyRecorder.preparingUpload = false;
        storyRecorder.uploadInternal(z);
    }

    public void switchTo(final int i) {
        if (this.switchingStory) {
            return;
        }
        this.storiesSelector.setSelected(i);
        this.switchingStory = true;
        applyPaintSwitching(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.m4640$r8$lambda$hzi1yhqlLtX1sh_LUazFem1Tik(this.f$0, i);
            }
        });
    }

    public static void m4640$r8$lambda$hzi1yhqlLtX1sh_LUazFem1Tik(StoryRecorder storyRecorder, int i) {
        storyRecorder.applyPaintMessage();
        storyRecorder.switchingStory = false;
        File file = storyRecorder.outputEntry.draftThumbFile;
        if (file != null) {
            file.delete();
            storyRecorder.outputEntry.draftThumbFile = null;
        }
        storyRecorder.prepareThumb(storyRecorder.outputEntry, true);
        CharSequence[] charSequenceArr = {storyRecorder.captionEdit.getText()};
        ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(storyRecorder.currentAccount).storyEntitiesAllowed() ? MediaDataController.getInstance(storyRecorder.currentAccount).getEntities(charSequenceArr, true) : new ArrayList<>();
        ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(storyRecorder.currentAccount).storyEntitiesAllowed() ? MediaDataController.getInstance(storyRecorder.currentAccount).getEntities(new CharSequence[]{storyRecorder.outputEntry.caption}, true) : new ArrayList<>();
        StoryEntry storyEntry = storyRecorder.outputEntry;
        storyEntry.editedCaption = (TextUtils.equals(storyEntry.caption, charSequenceArr[0]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
        storyRecorder.outputEntry.caption = new SpannableString(storyRecorder.captionEdit.getText());
        storyRecorder.destroyPhotoPaintView();
        storyRecorder.destroyPhotoFilterView();
        StoryEntry storyEntry2 = storyRecorder.outputEntry;
        storyRecorder.mode = (storyEntry2 == null || !storyEntry2.isVideo) ? 0 : 1;
        storyRecorder.outputEntry = (StoryEntry) storyRecorder.entries.get(i);
        storyRecorder.onNavigateStart(0, 1);
        storyRecorder.onNavigateEnd(0, 1);
        storyRecorder.storiesSelector.update();
        storyRecorder.captionEdit.setText(storyRecorder.outputEntry.caption);
    }

    private void uploadInternal(final boolean z) {
        if (this.outputEntry == null) {
            close(true);
            return;
        }
        destroyPhotoFilterView();
        Utilities.Callback callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                StoryRecorder.$r8$lambda$ySo1CWYatPHrnJPUMnfi1qMlVMs(this.f$0, z, (StoryEntry) obj);
            }
        };
        if (this.entries == null) {
            ArrayList arrayListCutIntoEntries = this.outputEntry.cutIntoEntries();
            this.entries = arrayListCutIntoEntries;
            if (arrayListCutIntoEntries != null) {
                this.selectedEntries = new ArrayList();
                this.selectedEntriesOrder = new ArrayList();
                for (int i = 0; i < this.entries.size(); i++) {
                    this.selectedEntries.add(Integer.valueOf(i));
                    this.selectedEntriesOrder.add(Integer.valueOf(i));
                }
            }
        }
        if (this.entries != null) {
            ArrayList arrayList = this.selectedEntriesOrder;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                Integer num = (Integer) obj;
                if (this.selectedEntries.contains(num)) {
                    StoryEntry storyEntry = (StoryEntry) this.entries.get(num.intValue());
                    StoryEntry storyEntry2 = this.outputEntry;
                    if (storyEntry2 == storyEntry) {
                        CharSequence[] charSequenceArr = {this.captionEdit.getText()};
                        ArrayList<TLRPC.MessageEntity> entities = MessagesController.getInstance(this.currentAccount).storyEntitiesAllowed() ? MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true) : new ArrayList<>();
                        ArrayList<TLRPC.MessageEntity> entities2 = MessagesController.getInstance(this.currentAccount).storyEntitiesAllowed() ? MediaDataController.getInstance(this.currentAccount).getEntities(new CharSequence[]{this.outputEntry.caption}, true) : new ArrayList<>();
                        StoryEntry storyEntry3 = this.outputEntry;
                        storyEntry3.editedCaption = (TextUtils.equals(storyEntry3.caption, charSequenceArr[0]) && MediaDataController.entitiesEqual(entities, entities2)) ? false : true;
                        this.outputEntry.caption = new SpannableString(this.captionEdit.getText());
                    } else if (storyEntry.caption == null) {
                        storyEntry2.editedCaption = false;
                        storyEntry2.caption = new SpannableString("");
                    }
                    callback.run(storyEntry);
                }
            }
        } else {
            CharSequence[] charSequenceArr2 = {this.captionEdit.getText()};
            ArrayList<TLRPC.MessageEntity> entities3 = MessagesController.getInstance(this.currentAccount).storyEntitiesAllowed() ? MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr2, true) : new ArrayList<>();
            ArrayList<TLRPC.MessageEntity> entities4 = MessagesController.getInstance(this.currentAccount).storyEntitiesAllowed() ? MediaDataController.getInstance(this.currentAccount).getEntities(new CharSequence[]{this.outputEntry.caption}, true) : new ArrayList<>();
            StoryEntry storyEntry4 = this.outputEntry;
            storyEntry4.editedCaption = (TextUtils.equals(storyEntry4.caption, charSequenceArr2[0]) && MediaDataController.entitiesEqual(entities3, entities4)) ? false : true;
            this.outputEntry.caption = new SpannableString(this.captionEdit.getText());
            callback.run(this.outputEntry);
        }
        final long peerDialogId = UserConfig.getInstance(this.currentAccount).clientUserId;
        TLRPC.InputPeer inputPeer = this.outputEntry.peer;
        if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
            peerDialogId = DialogObject.getPeerDialogId(inputPeer);
        }
        this.outputEntry = null;
        this.wasSend = true;
        this.wasSendPeer = peerDialogId;
        this.forceBackgroundVisible = true;
        checkBackgroundVisibility();
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.$r8$lambda$hMoaDLfJ250FShkv_fTfp32m_Jg(this.f$0, z, peerDialogId);
            }
        };
        ClosingViewProvider closingViewProvider = this.closingSourceProvider;
        if (closingViewProvider != null) {
            closingViewProvider.preLayout(peerDialogId, runnable);
        } else {
            runnable.run();
        }
        MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", 2).apply();
    }

    public static void $r8$lambda$ySo1CWYatPHrnJPUMnfi1qMlVMs(StoryRecorder storyRecorder, boolean z, StoryEntry storyEntry) {
        storyRecorder.prepareThumb(storyEntry, false);
        MessagesController.getInstance(storyRecorder.currentAccount).getStoriesController().uploadStory(storyEntry, z);
        if (storyEntry.isDraft && !storyEntry.isEdit) {
            MessagesController.getInstance(storyRecorder.currentAccount).getStoriesController().getDraftsController().delete(storyEntry);
        }
        storyEntry.cancelCheckStickers();
    }

    public static void $r8$lambda$hMoaDLfJ250FShkv_fTfp32m_Jg(final StoryRecorder storyRecorder, boolean z, long j) {
        if (z) {
            SourceView sourceView = storyRecorder.fromSourceView;
            if (sourceView != null) {
                sourceView.show(true);
                storyRecorder.fromSourceView = null;
            }
            Runnable runnable = storyRecorder.closeListener;
            if (runnable != null) {
                runnable.run();
                storyRecorder.closeListener = null;
            }
            ClosingViewProvider closingViewProvider = storyRecorder.closingSourceProvider;
            SourceView view = closingViewProvider != null ? closingViewProvider.getView(j) : null;
            storyRecorder.fromSourceView = view;
            if (view != null) {
                storyRecorder.openType = view.type;
                storyRecorder.containerView.updateBackground();
                FrameLayout frameLayout = storyRecorder.previewContainer;
                int i = storyRecorder.openType;
                frameLayout.setBackgroundColor((i == 1 || i == 0) ? 0 : -14737633);
                storyRecorder.fromRect.set(storyRecorder.fromSourceView.screenRect);
                SourceView sourceView2 = storyRecorder.fromSourceView;
                storyRecorder.fromRounding = sourceView2.rounding;
                sourceView2.hide();
                if (SharedConfig.getDevicePerformanceClass() > 1) {
                    LiteMode.isEnabled(360928);
                }
            }
            storyRecorder.closingSourceProvider = null;
            Activity activity = storyRecorder.activity;
            if (activity instanceof LaunchActivity) {
                ((LaunchActivity) activity).drawerLayoutContainer.post(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.close(true);
                    }
                });
                return;
            } else {
                storyRecorder.close(true);
                return;
            }
        }
        storyRecorder.close(true);
    }

    private File prepareThumb(StoryEntry storyEntry, boolean z) {
        final StoryEntry storyEntry2;
        final boolean z2;
        if (storyEntry == null || this.previewView.getWidth() <= 0 || this.previewView.getHeight() <= 0) {
            return null;
        }
        File file = z ? storyEntry.draftThumbFile : storyEntry.uploadThumbFile;
        if (file != null) {
            file.delete();
        }
        View view = this.collageLayoutView.hasLayout() ? this.collageLayoutView : this.previewView;
        float f = z ? 0.33333334f : 1.0f;
        int width = (int) (view.getWidth() * f);
        final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, (int) (view.getHeight() * f), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.save();
        canvas.scale(f, f);
        AndroidUtilities.makingGlobalBlurBitmap = true;
        view.draw(canvas);
        AndroidUtilities.makingGlobalBlurBitmap = false;
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
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file2.getPath());
                canvas.save();
                float width2 = width / bitmapDecodeFile.getWidth();
                canvas.scale(width2, width2);
                canvas.drawBitmap(bitmapDecodeFile, 0.0f, 0.0f, paint);
                canvas.restore();
                bitmapDecodeFile.recycle();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        File file3 = storyEntry.paintFile;
        if (file3 != null) {
            try {
                Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(file3.getPath());
                canvas.save();
                float width3 = width / bitmapDecodeFile2.getWidth();
                canvas.scale(width3, width3);
                canvas.drawBitmap(bitmapDecodeFile2, 0.0f, 0.0f, paint);
                canvas.restore();
                bitmapDecodeFile2.recycle();
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
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, 40, 22, true);
        final File fileMakeCacheFile = StoryEntry.makeCacheFile(this.currentAccount, false);
        if (z) {
            storyEntry2 = storyEntry;
            z2 = z;
            Utilities.searchQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.$r8$lambda$SeDs0mCAhmhqdeF2ONIiwUJbCys(this.f$0, bitmapCreateBitmap, z2, fileMakeCacheFile, storyEntry2);
                }
            });
        } else {
            storyEntry2 = storyEntry;
            z2 = z;
            try {
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, z2 ? 95 : 99, new FileOutputStream(fileMakeCacheFile));
            } catch (Exception e3) {
                FileLog.e(e3);
            }
        }
        if (!z2) {
            storyEntry2.uploadThumbFile = fileMakeCacheFile;
        }
        storyEntry2.thumbBitmap = bitmapCreateScaledBitmap;
        return fileMakeCacheFile;
    }

    public static void $r8$lambda$SeDs0mCAhmhqdeF2ONIiwUJbCys(final StoryRecorder storyRecorder, Bitmap bitmap, boolean z, final File file, final StoryEntry storyEntry) {
        storyRecorder.getClass();
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, z ? 95 : 99, new FileOutputStream(file));
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.$r8$lambda$mAkGYx2FAeJDoQhxPsuPJ_bs5PQ(this.f$0, storyEntry, file);
            }
        });
    }

    public static void $r8$lambda$mAkGYx2FAeJDoQhxPsuPJ_bs5PQ(StoryRecorder storyRecorder, StoryEntry storyEntry, File file) {
        storyRecorder.getClass();
        storyEntry.draftThumbFile = file;
        MultipleStoriesSelector multipleStoriesSelector = storyRecorder.storiesSelector;
        if (multipleStoriesSelector != null) {
            multipleStoriesSelector.update();
        }
    }

    public void setCameraFlashModeIcon(String str, boolean z) {
        byte b;
        int i;
        this.flashButton.clearAnimation();
        DualCameraView dualCameraView = this.cameraView;
        if ((dualCameraView != null && dualCameraView.isDual()) || this.animatedRecording) {
            str = null;
        }
        this.flashButtonMode = str;
        boolean z2 = false;
        if (str == null) {
            setActionBarButtonVisible(this.flashButton, false, z);
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 3551) {
            if (iHashCode != 109935) {
                if (iHashCode == 3005871 && str.equals("auto")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str.equals("off")) {
                b = 3;
            } else {
                b = -1;
            }
        } else if (str.equals("on")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            i = R.drawable.media_photo_flash_on2;
            this.flashButton.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOn));
        } else if (b == 1) {
            i = R.drawable.media_photo_flash_auto2;
            this.flashButton.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashAuto));
        } else {
            i = R.drawable.media_photo_flash_off2;
            this.flashButton.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
        }
        ToggleButton2 toggleButton2 = this.flashButton;
        this.flashButtonResId = i;
        toggleButton2.setIcon(i, false);
        ToggleButton2 toggleButton3 = this.flashButton;
        if (this.currentPage == 0 && !this.collageListView.isVisible() && this.flashButtonMode != null && !inCheck()) {
            z2 = true;
        }
        setActionBarButtonVisible(toggleButton3, z2, z);
    }

    class AnonymousClass13 implements RecordControl.Delegate {
        @Override
        public long getMaxVideoDuration() {
            return 177000L;
        }

        @Override
        public long getMaxVisibleVideoDuration() {
            return RecordControl.Delegate.CC.$default$getMaxVisibleVideoDuration(this);
        }

        @Override
        public boolean showStoriesDrafts() {
            return RecordControl.Delegate.CC.$default$showStoriesDrafts(this);
        }

        AnonymousClass13() {
        }

        @Override
        public boolean canRecordAudio() {
            return StoryRecorder.this.requestAudioPermission();
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
            if (StoryRecorder.this.qrScanner != null) {
                StoryRecorder.this.qrScanner.setPaused(true);
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
                        this.f$0.takePicture((Utilities.Callback) obj);
                    }
                });
            } else {
                takePicture(null);
            }
        }

        @Override
        public void onCheckClick() {
            ArrayList<StoryEntry> content = StoryRecorder.this.collageLayoutView.getContent();
            int i = 0;
            if (content.size() == 1) {
                StoryRecorder.this.outputEntry = content.get(0);
            } else {
                StoryRecorder storyRecorder = StoryRecorder.this;
                storyRecorder.outputEntry = StoryEntry.asCollage(storyRecorder.collageLayoutView.getLayout(), StoryRecorder.this.collageLayoutView.getContent());
            }
            StoryRecorder storyRecorder2 = StoryRecorder.this;
            if (storyRecorder2.outputEntry != null && StoryRecorder.this.outputEntry.isVideo) {
                i = 1;
            }
            storyRecorder2.mode = i;
            if (StoryRecorder.this.modeSwitcherView != null) {
                StoryRecorder.this.modeSwitcherView.switchMode(StoryRecorder.this.mode);
            }
            StoryPrivacySelector.applySaved(StoryRecorder.this.currentAccount, StoryRecorder.this.outputEntry);
            StoryRecorder.this.navigateTo(1, true);
        }

        public void takePicture(final Utilities.Callback callback) {
            boolean z;
            if (!StoryRecorder.this.useDisplayFlashlight()) {
                StoryRecorder.this.cameraView.startTakePictureAnimation(true);
            }
            if ((StoryRecorder.this.cameraView.isDual() && TextUtils.equals(StoryRecorder.this.cameraView.getCameraSession().getCurrentFlashMode(), "off")) || StoryRecorder.this.collageLayoutView.hasLayout()) {
                if (!StoryRecorder.this.collageLayoutView.hasLayout()) {
                    StoryRecorder.this.cameraView.pauseAsTakingPicture();
                }
                Bitmap bitmap = StoryRecorder.this.cameraView.getTextureView().getBitmap();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(StoryRecorder.this.outputFile.getAbsoluteFile());
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        try {
                            fileOutputStream.close();
                            z = true;
                        } catch (Exception e) {
                            e = e;
                            z = true;
                            FileLog.e(e);
                        }
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    z = false;
                }
                bitmap.recycle();
            } else {
                z = false;
            }
            if (!z) {
                if (StoryRecorder.this.qrScanner != null) {
                    StoryRecorder.this.qrScanner.setPaused(true);
                }
                StoryRecorder.this.takingPhoto = CameraController.getInstance().takePicture(StoryRecorder.this.outputFile, true, StoryRecorder.this.cameraView.getCameraSessionObject(), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        StoryRecorder.AnonymousClass13.m4653$r8$lambda$rJCFCYh4_IHlVYE5sdPdmopN7c(this.f$0, callback, (Integer) obj);
                    }
                });
                return;
            }
            StoryRecorder.this.takingPhoto = false;
            if (StoryRecorder.this.qrScanner != null) {
                StoryRecorder.this.qrScanner.setPaused(false);
            }
            StoryEntry storyEntryFromPhotoShoot = StoryEntry.fromPhotoShoot(StoryRecorder.this.outputFile, 0);
            storyEntryFromPhotoShoot.botId = StoryRecorder.this.botId;
            storyEntryFromPhotoShoot.botLang = StoryRecorder.this.botLang;
            if (StoryRecorder.this.collageLayoutView.hasLayout()) {
                StoryRecorder.this.outputFile = null;
                if (StoryRecorder.this.collageLayoutView.push(storyEntryFromPhotoShoot)) {
                    StoryRecorder storyRecorder = StoryRecorder.this;
                    storyRecorder.outputEntry = StoryEntry.asCollage(storyRecorder.collageLayoutView.getLayout(), StoryRecorder.this.collageLayoutView.getContent());
                    StoryPrivacySelector.applySaved(StoryRecorder.this.currentAccount, StoryRecorder.this.outputEntry);
                    StoryRecorder.this.fromGallery = false;
                    if (callback != null) {
                        callback.run(null);
                    }
                } else if (callback != null) {
                    callback.run(null);
                }
                StoryRecorder.this.updateActionBarButtons(true);
                return;
            }
            StoryRecorder.this.outputEntry = storyEntryFromPhotoShoot;
            StoryPrivacySelector.applySaved(StoryRecorder.this.currentAccount, StoryRecorder.this.outputEntry);
            StoryRecorder.this.fromGallery = false;
            if (callback != null) {
                callback.run(new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.this.navigateTo(1, true);
                    }
                });
            } else {
                StoryRecorder.this.navigateTo(1, true);
            }
        }

        public static void m4653$r8$lambda$rJCFCYh4_IHlVYE5sdPdmopN7c(final AnonymousClass13 anonymousClass13, Utilities.Callback callback, Integer num) {
            int i;
            int i2;
            if (StoryRecorder.this.useDisplayFlashlight()) {
                try {
                    StoryRecorder.this.windowView.performHapticFeedback(3, 1);
                } catch (Exception unused) {
                }
            }
            StoryRecorder.this.takingPhoto = false;
            if (StoryRecorder.this.qrScanner != null) {
                StoryRecorder.this.qrScanner.setPaused(false);
            }
            if (StoryRecorder.this.outputFile == null) {
                return;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(StoryRecorder.this.outputFile.getAbsolutePath(), options);
                i = options.outWidth;
                try {
                    i2 = options.outHeight;
                } catch (Exception unused2) {
                    i2 = -1;
                }
            } catch (Exception unused3) {
                i = -1;
            }
            int i3 = num.intValue() == -1 ? 0 : 90;
            if (num.intValue() == -1) {
                if (i > i2) {
                    i3 = 270;
                }
            } else if (i2 > i && i3 != 0) {
                i3 = 0;
            }
            StoryEntry storyEntryFromPhotoShoot = StoryEntry.fromPhotoShoot(StoryRecorder.this.outputFile, i3);
            if (storyEntryFromPhotoShoot != null) {
                storyEntryFromPhotoShoot.botId = StoryRecorder.this.botId;
                storyEntryFromPhotoShoot.botLang = StoryRecorder.this.botLang;
            }
            if (StoryRecorder.this.collageLayoutView.hasLayout()) {
                StoryRecorder.this.outputFile = null;
                if (StoryRecorder.this.collageLayoutView.push(storyEntryFromPhotoShoot)) {
                    StoryRecorder storyRecorder = StoryRecorder.this;
                    storyRecorder.outputEntry = StoryEntry.asCollage(storyRecorder.collageLayoutView.getLayout(), StoryRecorder.this.collageLayoutView.getContent());
                    StoryPrivacySelector.applySaved(StoryRecorder.this.currentAccount, StoryRecorder.this.outputEntry);
                    StoryRecorder.this.fromGallery = false;
                    if (callback != null) {
                        callback.run(null);
                    }
                } else if (callback != null) {
                    callback.run(null);
                }
                StoryRecorder.this.updateActionBarButtons(true);
                return;
            }
            StoryRecorder.this.outputEntry = storyEntryFromPhotoShoot;
            StoryPrivacySelector.applySaved(StoryRecorder.this.currentAccount, StoryRecorder.this.outputEntry);
            StoryRecorder.this.fromGallery = false;
            if (callback != null) {
                callback.run(new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.this.navigateTo(1, true);
                    }
                });
            } else {
                StoryRecorder.this.navigateTo(1, true);
            }
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
            if (StoryRecorder.this.qrScanner != null) {
                StoryRecorder.this.qrScanner.setPaused(true);
            }
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
                        this.f$0.startRecording(z, runnable);
                    }
                });
            } else {
                startRecording(z, runnable);
            }
        }

        public void startRecording(final boolean z, final Runnable runnable) {
            if (StoryRecorder.this.cameraView == null) {
                return;
            }
            CameraController.getInstance().recordVideo(StoryRecorder.this.cameraView.getCameraSessionObject(), StoryRecorder.this.outputFile, false, new CameraController.VideoTakeCallback() {
                @Override
                public final void onFinishVideoRecording(String str, long j) {
                    StoryRecorder.AnonymousClass13.$r8$lambda$nqncHAzz66SuneOOk5Sz81b_gNI(this.f$0, str, j);
                }
            }, new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.AnonymousClass13.$r8$lambda$QPp6ZuNHoGjfBIEONJjmEdZRnw8(this.f$0, runnable, z);
                }
            }, StoryRecorder.this.cameraView, true);
            if (StoryRecorder.this.mode != 1) {
                StoryRecorder.this.mode = 1;
                StoryRecorder.this.collageListView.setVisible(false, true);
                StoryRecorder storyRecorder = StoryRecorder.this;
                storyRecorder.showVideoTimer(storyRecorder.mode == 1, true);
                StoryRecorder.this.modeSwitcherView.switchMode(StoryRecorder.this.mode);
                StoryRecorder.this.recordControl.startAsVideo(StoryRecorder.this.mode == 1);
            }
        }

        public static void $r8$lambda$nqncHAzz66SuneOOk5Sz81b_gNI(final AnonymousClass13 anonymousClass13, String str, long j) {
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
            if (StoryRecorder.this.qrScanner != null) {
                StoryRecorder.this.qrScanner.setPaused(false);
            }
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
            StoryEntry storyEntryFromVideoShoot = StoryEntry.fromVideoShoot(StoryRecorder.this.outputFile, str, j);
            storyEntryFromVideoShoot.botId = StoryRecorder.this.botId;
            storyEntryFromVideoShoot.botLang = StoryRecorder.this.botLang;
            storyEntryFromVideoShoot.setupMultipleStoriesSelector();
            StoryRecorder.this.animateRecording(false, true);
            StoryRecorder.this.setAwakeLock(false);
            StoryRecorder.this.videoTimerView.setRecording(false, true);
            if (StoryRecorder.this.recordControl != null) {
                StoryRecorder.this.recordControl.stopRecordingLoading(true);
            }
            if (StoryRecorder.this.collageLayoutView.hasLayout()) {
                StoryRecorder.this.outputFile = null;
                storyEntryFromVideoShoot.videoVolume = 1.0f;
                if (StoryRecorder.this.collageLayoutView.push(storyEntryFromVideoShoot)) {
                    StoryRecorder storyRecorder = StoryRecorder.this;
                    storyRecorder.outputEntry = StoryEntry.asCollage(storyRecorder.collageLayoutView.getLayout(), StoryRecorder.this.collageLayoutView.getContent());
                    StoryPrivacySelector.applySaved(StoryRecorder.this.currentAccount, StoryRecorder.this.outputEntry);
                    StoryRecorder.this.fromGallery = false;
                    int videoWidth = StoryRecorder.this.cameraView.getVideoWidth();
                    int videoHeight = StoryRecorder.this.cameraView.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        StoryRecorder.this.outputEntry.width = videoWidth;
                        StoryRecorder.this.outputEntry.height = videoHeight;
                        StoryRecorder.this.outputEntry.setupMatrix();
                    }
                }
                StoryRecorder.this.updateActionBarButtons(true);
                return;
            }
            StoryRecorder.this.outputEntry = storyEntryFromVideoShoot;
            StoryPrivacySelector.applySaved(StoryRecorder.this.currentAccount, StoryRecorder.this.outputEntry);
            StoryRecorder.this.fromGallery = false;
            int videoWidth2 = StoryRecorder.this.cameraView.getVideoWidth();
            int videoHeight2 = StoryRecorder.this.cameraView.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                StoryRecorder.this.outputEntry.width = videoWidth2;
                StoryRecorder.this.outputEntry.height = videoHeight2;
                StoryRecorder.this.outputEntry.setupMatrix();
            }
            StoryRecorder.this.navigateToPreviewWithPlayerAwait(new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.this.navigateTo(1, true);
                }
            }, 0L);
        }

        public static void $r8$lambda$QPp6ZuNHoGjfBIEONJjmEdZRnw8(AnonymousClass13 anonymousClass13, Runnable runnable, boolean z) {
            anonymousClass13.getClass();
            runnable.run();
            StoryRecorder.this.hintTextView.setText(LocaleController.getString(z ? R.string.StoryHintSwipeToZoom : R.string.StoryHintPinchToZoom), false);
            StoryRecorder.this.animateRecording(true, true);
            StoryRecorder.this.setAwakeLock(true);
            StoryRecorder.this.collageListView.setVisible(false, true);
            StoryRecorder.this.videoTimerView.setRecording(true, true);
            StoryRecorder.this.showVideoTimer(true, true);
        }

        @Override
        public void onVideoRecordLocked() {
            StoryRecorder.this.hintTextView.setText(LocaleController.getString(R.string.StoryHintPinchToZoom), true);
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
                    StoryRecorder.AnonymousClass13.$r8$lambda$MW887itRjekCwplo6TnUG5tf2Pg(this.f$0);
                }
            }, z ? 0L : 400L);
        }

        public static void $r8$lambda$MW887itRjekCwplo6TnUG5tf2Pg(AnonymousClass13 anonymousClass13) {
            if (StoryRecorder.this.qrScanner != null) {
                StoryRecorder.this.qrScanner.setPaused(false);
            }
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
            if (StoryRecorder.this.currentPage != 0 || StoryRecorder.this.takingPhoto || StoryRecorder.this.takingVideo || !StoryRecorder.this.requestGalleryPermission()) {
                return;
            }
            StoryRecorder.this.animateGalleryListView(true);
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

    public void animateRecording(boolean z, boolean z2) {
        CollageLayoutButton.CollageLayoutListView collageLayoutListView;
        if (z) {
            HintView2 hintView2 = this.dualHint;
            if (hintView2 != null) {
                hintView2.hide();
            }
            HintView2 hintView3 = this.savedDualHint;
            if (hintView3 != null) {
                hintView3.hide();
            }
            HintView2 hintView4 = this.muteHint;
            if (hintView4 != null) {
                hintView4.hide();
            }
            HintView2 hintView5 = this.cameraHint;
            if (hintView5 != null) {
                hintView5.hide();
            }
        }
        if (this.animatedRecording == z && this.animatedRecordingWasInCheck == inCheck()) {
            return;
        }
        AnimatorSet animatorSet = this.recordingAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.recordingAnimator = null;
        }
        this.animatedRecording = z;
        this.animatedRecordingWasInCheck = inCheck();
        if (z && (collageLayoutListView = this.collageListView) != null && collageLayoutListView.isVisible()) {
            this.collageListView.setVisible(false, z2);
        }
        updateActionBarButtons(z2);
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.recordingAnimator = animatorSet2;
            HintTextView hintTextView = this.hintTextView;
            Property property = View.ALPHA;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(hintTextView, (Property<HintTextView, Float>) property, (z && this.currentPage == 0 && !inCheck()) ? 1.0f : 0.0f);
            HintTextView hintTextView2 = this.hintTextView;
            Property property2 = View.TRANSLATION_Y;
            animatorSet2.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(hintTextView2, (Property<HintTextView, Float>) property2, (z && this.currentPage == 0 && !inCheck()) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(this.collageHintTextView, (Property<HintTextView, Float>) property, (!z && this.currentPage == 0 && inCheck()) ? 0.6f : 0.0f), ObjectAnimator.ofFloat(this.collageHintTextView, (Property<HintTextView, Float>) property2, (!z && this.currentPage == 0 && inCheck()) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(this.modeSwitcherView, (Property<StoryModeTabs, Float>) property, (z || this.currentPage != 0 || inCheck()) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(this.modeSwitcherView, (Property<StoryModeTabs, Float>) property2, (z || this.currentPage != 0 || inCheck()) ? AndroidUtilities.dp(16.0f) : 0.0f));
            this.recordingAnimator.setDuration(260L);
            this.recordingAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.recordingAnimator.start();
            return;
        }
        this.hintTextView.setAlpha((z && this.currentPage == 0 && !inCheck()) ? 1.0f : 0.0f);
        this.hintTextView.setTranslationY((z && this.currentPage == 0 && !inCheck()) ? 0.0f : AndroidUtilities.dp(16.0f));
        this.collageHintTextView.setAlpha((!z && this.currentPage == 0 && inCheck()) ? 0.6f : 0.0f);
        this.collageHintTextView.setTranslationY((!z && this.currentPage == 0 && inCheck()) ? 0.0f : AndroidUtilities.dp(16.0f));
        this.modeSwitcherView.setAlpha((z || this.currentPage != 0 || inCheck()) ? 0.0f : 1.0f);
        this.modeSwitcherView.setTranslationY((z || this.currentPage != 0 || inCheck()) ? AndroidUtilities.dp(16.0f) : 0.0f);
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
        float fComputePerceivedBrightness = 0.0f;
        for (int i = 0; i < 10; i++) {
            int i2 = 0;
            while (i2 < 10) {
                i2++;
                fComputePerceivedBrightness += AndroidUtilities.computePerceivedBrightness(bitmap.getPixel((i + 1) * width, i2 * height));
            }
        }
        float f = fComputePerceivedBrightness / 100.0f;
        bitmap.recycle();
        this.isDark = f < 0.22f;
    }

    public boolean useDisplayFlashlight() {
        DualCameraView dualCameraView;
        if ((!this.takingPhoto && !this.takingVideo) || (dualCameraView = this.cameraView) == null || !dualCameraView.isFrontface()) {
            return false;
        }
        int i = this.frontfaceFlashMode;
        return i == 2 || (i == 1 && this.isDark);
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
                    StoryRecorder.$r8$lambda$TOQUeTjR_fVVDfMjEruXGz2kIq8(this.f$0, z);
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

    public static void $r8$lambda$TOQUeTjR_fVVDfMjEruXGz2kIq8(StoryRecorder storyRecorder, boolean z) {
        if (z) {
            storyRecorder.getClass();
        } else {
            storyRecorder.videoTimerView.setRecording(false, false);
        }
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
                        StoryRecorder.m4651$r8$lambda$yZiiCBP0fHIxWRXXI_J4SYQH2U(this.f$0);
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
                    StoryRecorder.m4644$r8$lambda$kRRYvxHXJg3wjzsa64wBIbXBKo(this.f$0);
                }
            };
            this.zoomControlHideRunnable = runnable3;
            AndroidUtilities.runOnUIThread(runnable3, 2000L);
        }
    }

    public static void m4651$r8$lambda$yZiiCBP0fHIxWRXXI_J4SYQH2U(StoryRecorder storyRecorder) {
        storyRecorder.showZoomControls(false, true);
        storyRecorder.zoomControlHideRunnable = null;
    }

    public static void m4644$r8$lambda$kRRYvxHXJg3wjzsa64wBIbXBKo(StoryRecorder storyRecorder) {
        storyRecorder.showZoomControls(false, true);
        storyRecorder.zoomControlHideRunnable = null;
    }

    public boolean onBackPressed() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.StoryRecorder.onBackPressed():boolean");
    }

    private void setReply() {
        SpannableStringBuilder spannableStringBuilderAppend;
        CaptionStory captionStory = this.captionEdit;
        if (captionStory == null) {
            return;
        }
        StoryEntry storyEntry = this.outputEntry;
        if (storyEntry == null || !storyEntry.isRepost) {
            captionStory.setReply(null, null);
            return;
        }
        TLRPC.Peer peer = storyEntry.repostPeer;
        if (peer instanceof TLRPC.TL_peerUser) {
            String userName = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peer.user_id)));
            StoryEntry storyEntry2 = this.outputEntry;
            spannableStringBuilderAppend = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
            storyEntry2.repostPeerName = spannableStringBuilderAppend;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
            String str = chat == null ? "" : chat.title;
            StoryEntry storyEntry3 = this.outputEntry;
            spannableStringBuilderAppend = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) str);
            storyEntry3.repostPeerName = spannableStringBuilderAppend;
        }
        String str2 = this.outputEntry.repostCaption;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        CharSequence charSequence = str2;
        if (zIsEmpty) {
            SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Story));
            spannableString.setSpan(new CharacterStyle() {
                @Override
                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setAlpha(128);
                }
            }, 0, spannableString.length(), 33);
            charSequence = spannableString;
        }
        this.captionEdit.setReply(spannableStringBuilderAppend, charSequence);
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
                StoryRecorder.$r8$lambda$Fe6QFueOxj8VeracHsJvmtwXPMg(this.f$0, runnable);
            }
        };
        this.previewView.setAlpha(0.0f);
        this.previewView.setVisibility(0);
        this.previewView.set(this.outputEntry, this.afterPlayerAwait, j);
        this.previewView.setupAudio(this.outputEntry, false);
        AndroidUtilities.runOnUIThread(this.afterPlayerAwait, j2);
    }

    public static void $r8$lambda$Fe6QFueOxj8VeracHsJvmtwXPMg(StoryRecorder storyRecorder, Runnable runnable) {
        storyRecorder.animateGalleryListView(false);
        AndroidUtilities.cancelRunOnUIThread(storyRecorder.afterPlayerAwait);
        storyRecorder.afterPlayerAwait = null;
        storyRecorder.awaitingPlayer = false;
        runnable.run();
    }

    public void navigateTo(final int i, boolean z) {
        StoryEntry storyEntry;
        StoryEntry storyEntry2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        ImageView imageView;
        StoryEntry storyEntry3;
        StoryEntry storyEntry4;
        StoryEntry storyEntry5;
        DualCameraView dualCameraView;
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
            previewButtons.appear(i == 1, z);
        }
        showVideoTimer(i == 0 && this.mode == 1 && !this.collageListView.isVisible() && !inCheck(), z);
        if (i != 1) {
            this.videoTimeView.show(false, z);
        }
        setActionBarButtonVisible(this.backButton, !this.collageListView.isVisible(), z);
        setActionBarButtonVisible(this.flashButton, (this.animatedRecording || i != 0 || this.collageListView.isVisible() || this.flashButtonMode == null || inCheck()) ? false : true, z);
        setActionBarButtonVisible(this.dualButton, (this.animatedRecording || i != 0 || (dualCameraView = this.cameraView) == null || !dualCameraView.dualAvailable() || this.collageListView.isVisible() || this.collageLayoutView.hasLayout()) ? false : true, true);
        setActionBarButtonVisible(this.collageButton, (this.animatedRecording || i != 0 || this.collageListView.isVisible()) ? false : true, z);
        updateActionBarButtons(z);
        if (z) {
            this.pageAnimator = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            DualCameraView dualCameraView2 = this.cameraView;
            if (dualCameraView2 != null) {
                arrayList.add(ObjectAnimator.ofFloat(dualCameraView2, (Property<DualCameraView, Float>) View.ALPHA, i == 0 ? 1.0f : 0.0f));
            }
            PreviewView previewView = this.previewView;
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(previewView, (Property<PreviewView, Float>) property, ((i != 1 || this.collageLayoutView.hasLayout()) && i != 2) ? 0.0f : 1.0f));
            CollageLayoutView2 collageLayoutView2 = this.collageLayoutView;
            arrayList.add(ObjectAnimator.ofFloat(collageLayoutView2, (Property<CollageLayoutView2, Float>) property, (i == 0 || (i == 1 && collageLayoutView2.hasLayout())) ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.recordControl, (Property<RecordControl, Float>) property, i == 0 ? 1.0f : 0.0f));
            RecordControl recordControl = this.recordControl;
            Property property2 = View.TRANSLATION_Y;
            arrayList.add(ObjectAnimator.ofFloat(recordControl, (Property<RecordControl, Float>) property2, i == 0 ? 0.0f : AndroidUtilities.dp(24.0f)));
            arrayList.add(ObjectAnimator.ofFloat(this.qrLinkView, (Property<ScannedLinkPreview, Float>) property, i == 0 ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.modeSwitcherView, (Property<StoryModeTabs, Float>) property, (i != 0 || inCheck()) ? 0.0f : 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.modeSwitcherView, (Property<StoryModeTabs, Float>) property2, (i != 0 || inCheck()) ? AndroidUtilities.dp(24.0f) : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.hintTextView, (Property<HintTextView, Float>) property, (i == 0 && this.animatedRecording && !inCheck()) ? 1.0f : 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.collageHintTextView, (Property<HintTextView, Float>) property, (i == 0 && !this.animatedRecording && inCheck()) ? 0.6f : 0.0f));
            FrameLayout frameLayout = this.captionContainer;
            if (i == 1) {
                StoryEntry storyEntry6 = this.outputEntry;
                f = 12.0f;
                float f10 = (storyEntry6 == null || storyEntry6.botId == 0) ? 1.0f : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, f10));
                arrayList.add(ObjectAnimator.ofFloat(this.captionContainer, (Property<FrameLayout, Float>) property2, ((i == 1 || !((storyEntry5 = this.outputEntry) == null || storyEntry5.botId == 0)) && i != 2) ? AndroidUtilities.dp(f) : 0.0f));
                CaptionStory captionStory = this.captionEdit;
                if (i == 2) {
                    f2 = 0.0f;
                } else {
                    f2 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(captionStory, (Property<CaptionStory, Float>) property, f2));
                SimpleTextView simpleTextView = this.titleTextView;
                if (i != 1 || i == 2) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(simpleTextView, (Property<SimpleTextView, Float>) property, f3));
                ButtonWithCounterView buttonWithCounterView = this.coverButton;
                if (i == 2) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(buttonWithCounterView, (Property<ButtonWithCounterView, Float>) property, f4));
                TimelineView timelineView = this.timelineView;
                if (i == 1) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(timelineView, (Property<TimelineView, Float>) property, f5));
                TimelineView timelineView2 = this.coverTimelineView;
                if (i == 2) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(timelineView2, (Property<TimelineView, Float>) property, f6));
                RLottieImageView rLottieImageView = this.muteButton;
                if (i == 1 || this.mode != 1) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(rLottieImageView, (Property<RLottieImageView, Float>) property, f7));
                PlayPauseButton playPauseButton = this.playButton;
                if (i == 1 || (this.mode != 1 && ((storyEntry4 = this.outputEntry) == null || TextUtils.isEmpty(storyEntry4.audioPath)))) {
                    f8 = 0.0f;
                } else {
                    f8 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(playPauseButton, (Property<PlayPauseButton, Float>) property, f8));
                DownloadButton downloadButton = this.downloadButton;
                if (i == 1) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(downloadButton, (Property<DownloadButton, Float>) property, f9));
                imageView = this.themeButton;
                if (imageView != null) {
                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, (i == 1 || (storyEntry3 = this.outputEntry) == null || !storyEntry3.isRepostMessage) ? 0.0f : 1.0f));
                }
                arrayList.add(ObjectAnimator.ofFloat(this.zoomControlView, (Property<ZoomControlView, Float>) property, 0.0f));
                this.pageAnimator.playTogether(arrayList);
                this.pageAnimator.addListener(new AnimatorListenerAdapter() {
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
            f = 12.0f;
            if (i == 2) {
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, f10));
            arrayList.add(ObjectAnimator.ofFloat(this.captionContainer, (Property<FrameLayout, Float>) property2, ((i == 1 || !((storyEntry5 = this.outputEntry) == null || storyEntry5.botId == 0)) && i != 2) ? AndroidUtilities.dp(f) : 0.0f));
            CaptionStory captionStory2 = this.captionEdit;
            if (i == 2) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(captionStory2, (Property<CaptionStory, Float>) property, f2));
            SimpleTextView simpleTextView2 = this.titleTextView;
            if (i != 1) {
                f3 = 1.0f;
            } else {
                f3 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(simpleTextView2, (Property<SimpleTextView, Float>) property, f3));
            ButtonWithCounterView buttonWithCounterView2 = this.coverButton;
            if (i == 2) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(buttonWithCounterView2, (Property<ButtonWithCounterView, Float>) property, f4));
            TimelineView timelineView3 = this.timelineView;
            if (i == 1) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(timelineView3, (Property<TimelineView, Float>) property, f5));
            TimelineView timelineView4 = this.coverTimelineView;
            if (i == 2) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(timelineView4, (Property<TimelineView, Float>) property, f6));
            RLottieImageView rLottieImageView2 = this.muteButton;
            if (i == 1) {
                f7 = 0.0f;
            } else {
                f7 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(rLottieImageView2, (Property<RLottieImageView, Float>) property, f7));
            PlayPauseButton playPauseButton2 = this.playButton;
            if (i == 1) {
                f8 = 0.0f;
            } else {
                f8 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(playPauseButton2, (Property<PlayPauseButton, Float>) property, f8));
            DownloadButton downloadButton2 = this.downloadButton;
            if (i == 1) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(downloadButton2, (Property<DownloadButton, Float>) property, f9));
            imageView = this.themeButton;
            if (imageView != null) {
                arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, (i == 1 || (storyEntry3 = this.outputEntry) == null || !storyEntry3.isRepostMessage) ? 0.0f : 1.0f));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.zoomControlView, (Property<ZoomControlView, Float>) property, 0.0f));
            this.pageAnimator.playTogether(arrayList);
            this.pageAnimator.addListener(new AnimatorListenerAdapter() {
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
        DualCameraView dualCameraView3 = this.cameraView;
        if (dualCameraView3 != null) {
            dualCameraView3.setAlpha(i == 0 ? 1.0f : 0.0f);
        }
        this.previewView.setAlpha(((i != 1 || this.collageLayoutView.hasLayout()) && i != 2) ? 0.0f : 1.0f);
        CollageLayoutView2 collageLayoutView3 = this.collageLayoutView;
        collageLayoutView3.setAlpha((i == 0 || (i == 1 && collageLayoutView3.hasLayout())) ? 1.0f : 0.0f);
        this.recordControl.setAlpha(i == 0 ? 1.0f : 0.0f);
        this.recordControl.setTranslationY(i == 0 ? 0.0f : AndroidUtilities.dp(16.0f));
        this.qrLinkView.setAlpha(i == 0 ? 1.0f : 0.0f);
        this.modeSwitcherView.setAlpha((i != 0 || inCheck()) ? 0.0f : 1.0f);
        this.modeSwitcherView.setTranslationY((i != 0 || inCheck()) ? AndroidUtilities.dp(16.0f) : 0.0f);
        this.hintTextView.setAlpha((i == 0 && this.animatedRecording && !inCheck()) ? 1.0f : 0.0f);
        this.collageHintTextView.setAlpha((i == 0 && !this.animatedRecording && inCheck()) ? 0.6f : 0.0f);
        this.captionContainer.setAlpha((i == 1 || i == 2) ? 1.0f : 0.0f);
        this.captionContainer.setTranslationY((i == 1 || i == 2) ? 0.0f : AndroidUtilities.dp(12.0f));
        this.captionEdit.setAlpha(i == 2 ? 0.0f : 1.0f);
        this.muteButton.setAlpha((i == 1 && this.mode == 1) ? 1.0f : 0.0f);
        this.playButton.setAlpha((i != 1 || (this.mode != 1 && ((storyEntry2 = this.outputEntry) == null || TextUtils.isEmpty(storyEntry2.audioPath)))) ? 0.0f : 1.0f);
        this.downloadButton.setAlpha(i == 1 ? 1.0f : 0.0f);
        ImageView imageView2 = this.themeButton;
        if (imageView2 != null) {
            imageView2.setAlpha((i == 1 && (storyEntry = this.outputEntry) != null && storyEntry.isRepostMessage) ? 1.0f : 0.0f);
        }
        this.timelineView.setAlpha(i == 1 ? 1.0f : 0.0f);
        this.coverTimelineView.setAlpha(i == 2 ? 1.0f : 0.0f);
        this.titleTextView.setAlpha((i == 1 || i == 2) ? 1.0f : 0.0f);
        this.coverButton.setAlpha(i != 2 ? 0.0f : 1.0f);
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
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.containerViewBackAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                StoryRecorder.$r8$lambda$fjUZ72t5ndAa_OPVWXeLcnmG158(this.f$0, translationY1, translationY2, valueAnimator2);
            }
        });
        this.containerViewBackAnimator.setDuration(340L);
        this.containerViewBackAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.containerViewBackAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                StoryRecorder.this.containerViewBackAnimator = null;
                StoryRecorder.this.containerView.setTranslationY(0.0f);
                StoryRecorder.this.containerView.setTranslationY2(0.0f);
            }
        });
        this.containerViewBackAnimator.start();
    }

    public static void $r8$lambda$fjUZ72t5ndAa_OPVWXeLcnmG158(StoryRecorder storyRecorder, float f, float f2, ValueAnimator valueAnimator) {
        storyRecorder.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        storyRecorder.containerView.setTranslationY(f * fFloatValue);
        storyRecorder.containerView.setTranslationY2(f2 * fFloatValue);
    }

    public StoryRecorder setMode(int i) {
        if (this.mode == i) {
            return this;
        }
        this.mode = i;
        StoryModeTabs storyModeTabs = this.modeSwitcherView;
        if (storyModeTabs != null) {
            storyModeTabs.switchMode(i);
        }
        showVideoTimer(i == 1, true);
        CollageLayoutButton.CollageLayoutListView collageLayoutListView = this.collageListView;
        if (collageLayoutListView != null) {
            collageLayoutListView.setVisible(false, true);
        }
        updateActionBarButtons(false);
        return this;
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
        if (this.galleryListView != null) {
            CollageLayoutView2 collageLayoutView2 = this.collageLayoutView;
            if ((collageLayoutView2 != null && collageLayoutView2.hasLayout()) == this.galleryListView.onlyCollaging) {
                return;
            }
        }
        if (getContext() == null) {
            return;
        }
        if (this.galleryListView != null) {
            destroyGalleryListView();
        }
        int i = this.currentAccount;
        Context context = getContext();
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        MediaController.AlbumEntry albumEntry = this.lastGallerySelectedAlbum;
        boolean z2 = !z;
        CollageLayoutView2 collageLayoutView3 = this.collageLayoutView;
        AnonymousClass19 anonymousClass19 = new AnonymousClass19(i, context, resourcesProvider, albumEntry, z, 1.39f, z2, collageLayoutView3 != null && collageLayoutView3.hasLayout());
        this.galleryListView = anonymousClass19;
        anonymousClass19.allowSearch(false);
        this.galleryListView.setMultipleOnClick(this.collageLayoutView.hasLayout());
        this.galleryListView.setMaxCount(Math.min(10, CollageLayout.getMaxCount() - this.collageLayoutView.getFilledCount()));
        this.galleryListView.setOnBackClickListener(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.m4645$r8$lambda$nllrLnDAfC7nZaxrIsEv8OWFZQ(this.f$0);
            }
        });
        this.galleryListView.setOnSelectListener(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                StoryRecorder.$r8$lambda$jbG0FGdxqzG0N8hZFIx7N_UfEww(this.f$0, z, obj, (Bitmap) obj2);
            }
        });
        this.galleryListView.setOnSelectMultipleListener(new Utilities.Callback3() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3) {
                StoryRecorder.$r8$lambda$pJAEyatQ2surZtWvJOw5d6FFLBU(this.f$0, (Boolean) obj, (ArrayList) obj2, (ArrayList) obj3);
            }
        });
        Parcelable parcelable = this.lastGalleryScrollPosition;
        if (parcelable != null) {
            this.galleryListView.layoutManager.onRestoreInstanceState(parcelable);
        }
        this.windowView.addView(this.galleryListView, LayoutHelper.createFrame(-1, -1, 119));
    }

    class AnonymousClass19 extends GalleryListView {
        AnonymousClass19(int i, Context context, Theme.ResourcesProvider resourcesProvider, MediaController.AlbumEntry albumEntry, boolean z, float f, boolean z2, boolean z3) {
            super(i, context, resourcesProvider, albumEntry, z, f, z2, z3);
        }

        @Override
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            if (StoryRecorder.this.applyContainerViewTranslation2) {
                float fClamp = Utilities.clamp(1.0f - (f / (StoryRecorder.this.windowView.getMeasuredHeight() - StoryRecorder.this.galleryListView.top())), 1.0f, 0.0f);
                StoryRecorder.this.containerView.setTranslationY2(AndroidUtilities.dp(-32.0f) * fClamp);
                StoryRecorder.this.containerView.setAlpha(1.0f - (0.6f * fClamp));
                StoryRecorder.this.actionBarContainer.setAlpha(1.0f - fClamp);
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
                        StoryRecorder.AnonymousClass19.m4654$r8$lambda$y63tE2HE1SWPb37Fg2TY6A9cY(this.f$0);
                    }
                });
            }
        }

        public static void m4654$r8$lambda$y63tE2HE1SWPb37Fg2TY6A9cY(AnonymousClass19 anonymousClass19) {
            StoryRecorder.this.destroyCameraView(true);
            StoryRecorder.this.collageLayoutView.setCameraThumb(StoryRecorder.this.getCameraThumb());
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < top()) {
                StoryRecorder.this.galleryClosing = true;
                StoryRecorder.this.animateGalleryListView(false);
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    public static void m4645$r8$lambda$nllrLnDAfC7nZaxrIsEv8OWFZQ(StoryRecorder storyRecorder) {
        storyRecorder.animateGalleryListView(false);
        storyRecorder.lastGallerySelectedAlbum = null;
    }

    public static void $r8$lambda$jbG0FGdxqzG0N8hZFIx7N_UfEww(StoryRecorder storyRecorder, boolean z, Object obj, Bitmap bitmap) {
        if (obj == null) {
            storyRecorder.getClass();
            return;
        }
        if (storyRecorder.galleryListViewOpening == null && !storyRecorder.scrollingY && storyRecorder.isGalleryOpen()) {
            int i = 0;
            if (!z) {
                storyRecorder.showVideoTimer(false, true);
                storyRecorder.modeSwitcherView.switchMode(storyRecorder.mode);
                storyRecorder.recordControl.startAsVideo(storyRecorder.mode == 1);
                storyRecorder.animateGalleryListView(false);
                boolean z2 = obj instanceof MediaController.PhotoEntry;
                if (z2) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                        i = 1;
                    }
                    storyRecorder.mode = i;
                    StoryEntry storyEntryFromPhotoEntry = StoryEntry.fromPhotoEntry(photoEntry);
                    storyEntryFromPhotoEntry.blurredVideoThumb = bitmap;
                    storyEntryFromPhotoEntry.botId = storyRecorder.botId;
                    storyEntryFromPhotoEntry.botLang = storyRecorder.botLang;
                    storyEntryFromPhotoEntry.setupMatrix();
                    storyRecorder.fromGallery = true;
                    if (storyRecorder.collageLayoutView.hasLayout()) {
                        storyRecorder.outputFile = null;
                        storyEntryFromPhotoEntry.videoVolume = 1.0f;
                        if (storyRecorder.collageLayoutView.push(storyEntryFromPhotoEntry)) {
                            storyRecorder.outputEntry = StoryEntry.asCollage(storyRecorder.collageLayoutView.getLayout(), storyRecorder.collageLayoutView.getContent());
                        }
                        storyRecorder.updateActionBarButtons(true);
                    } else {
                        storyEntryFromPhotoEntry.setupMultipleStoriesSelector();
                        storyRecorder.outputEntry = storyEntryFromPhotoEntry;
                        if (z2) {
                            StoryPrivacySelector.applySaved(storyRecorder.currentAccount, storyEntryFromPhotoEntry);
                        }
                        storyRecorder.navigateTo(1, true);
                    }
                } else {
                    if (!(obj instanceof StoryEntry)) {
                        return;
                    }
                    StoryEntry storyEntry = (StoryEntry) obj;
                    if (storyEntry.file == null && !storyEntry.isCollage()) {
                        storyRecorder.downloadButton.showToast(R.raw.error, "Failed to load draft");
                        MessagesController.getInstance(storyRecorder.currentAccount).getStoriesController().getDraftsController().delete(storyEntry);
                        return;
                    }
                    storyEntry.botId = storyRecorder.botId;
                    storyEntry.botLang = storyRecorder.botLang;
                    storyRecorder.mode = storyEntry.isVideo ? 1 : 0;
                    storyEntry.blurredVideoThumb = bitmap;
                    storyRecorder.fromGallery = false;
                    storyRecorder.collageLayoutView.set(storyEntry, true);
                    storyRecorder.outputEntry = storyEntry;
                    if (z2) {
                        StoryPrivacySelector.applySaved(storyRecorder.currentAccount, storyEntry);
                    }
                    storyRecorder.navigateTo(1, true);
                }
            } else {
                if (storyRecorder.outputEntry == null) {
                    return;
                }
                storyRecorder.createPhotoPaintView();
                storyRecorder.outputEntry.editedMedia = true;
                if (obj instanceof MediaController.PhotoEntry) {
                    PaintView paintView = storyRecorder.paintView;
                    paintView.appearAnimation(paintView.createPhoto(((MediaController.PhotoEntry) obj).path, false));
                } else if (obj instanceof TLObject) {
                    PaintView paintView2 = storyRecorder.paintView;
                    paintView2.appearAnimation(paintView2.createPhoto((TLObject) obj, false));
                }
                storyRecorder.animateGalleryListView(false);
            }
            GalleryListView galleryListView = storyRecorder.galleryListView;
            if (galleryListView != null) {
                storyRecorder.lastGalleryScrollPosition = galleryListView.layoutManager.onSaveInstanceState();
                storyRecorder.lastGallerySelectedAlbum = storyRecorder.galleryListView.getSelectedAlbum();
            }
        }
    }

    public static void $r8$lambda$pJAEyatQ2surZtWvJOw5d6FFLBU(StoryRecorder storyRecorder, Boolean bool, ArrayList arrayList, ArrayList arrayList2) {
        if (storyRecorder.currentPage == 0 && arrayList != null && !arrayList.isEmpty() && storyRecorder.galleryListViewOpening == null && !storyRecorder.scrollingY && storyRecorder.isGalleryOpen()) {
            storyRecorder.entries = null;
            storyRecorder.selectedEntries = null;
            storyRecorder.selectedEntriesOrder = null;
            if (bool.booleanValue() && storyRecorder.collageLayoutView.getFilledCount() + arrayList.size() > storyRecorder.collageLayoutView.getTotalCount()) {
                CollageLayout collageLayoutOf = CollageLayout.of(storyRecorder.collageLayoutView.getFilledCount() + arrayList.size());
                if (collageLayoutOf == null) {
                    storyRecorder.collageLayoutView.setLayout(null, true);
                    storyRecorder.collageLayoutView.clear(true);
                    storyRecorder.collageListView.setSelected((CollageLayout) null);
                    DualCameraView dualCameraView = storyRecorder.cameraView;
                    if (dualCameraView != null) {
                        dualCameraView.recordHevc = !storyRecorder.collageLayoutView.hasLayout();
                    }
                    storyRecorder.collageListView.setVisible(false, true);
                    storyRecorder.updateActionBarButtons(true);
                    return;
                }
                CollageLayoutView2 collageLayoutView2 = storyRecorder.collageLayoutView;
                storyRecorder.lastCollageLayout = collageLayoutOf;
                collageLayoutView2.setLayout(collageLayoutOf, true);
                storyRecorder.collageListView.setSelected(collageLayoutOf);
                int iIndexOf = CollageLayout.getLayouts().indexOf(collageLayoutOf);
                if (iIndexOf >= 0) {
                    storyRecorder.collageListView.listView.scrollToPosition(iIndexOf);
                }
                DualCameraView dualCameraView2 = storyRecorder.cameraView;
                if (dualCameraView2 != null) {
                    dualCameraView2.recordHevc = !storyRecorder.collageLayoutView.hasLayout();
                }
                storyRecorder.collageButton.setDrawable(new CollageLayoutButton.CollageLayoutDrawable(collageLayoutOf));
                storyRecorder.setActionBarButtonVisible(storyRecorder.collageRemoveButton, storyRecorder.collageListView.isVisible(), true);
                storyRecorder.recordControl.setCollageProgress(storyRecorder.collageLayoutView.hasLayout() ? storyRecorder.collageLayoutView.getFilledProgress() : 0.0f, true);
            }
            storyRecorder.fromGallery = true;
            for (int i = 0; i < arrayList.size(); i++) {
                StoryEntry storyEntryFromPhotoEntry = StoryEntry.fromPhotoEntry((MediaController.PhotoEntry) arrayList.get(i));
                storyEntryFromPhotoEntry.blurredVideoThumb = (Bitmap) arrayList2.get(i);
                storyEntryFromPhotoEntry.botId = storyRecorder.botId;
                storyEntryFromPhotoEntry.botLang = storyRecorder.botLang;
                storyEntryFromPhotoEntry.setupMatrix();
                if (bool.booleanValue()) {
                    if (storyRecorder.collageLayoutView.push(storyEntryFromPhotoEntry)) {
                        storyRecorder.outputEntry = StoryEntry.asCollage(storyRecorder.collageLayoutView.getLayout(), storyRecorder.collageLayoutView.getContent());
                        break;
                    }
                } else {
                    if (storyRecorder.outputEntry == null) {
                        storyRecorder.outputEntry = storyEntryFromPhotoEntry;
                    } else {
                        if (storyRecorder.entries == null) {
                            ArrayList arrayList3 = new ArrayList();
                            storyRecorder.entries = arrayList3;
                            arrayList3.add(storyRecorder.outputEntry);
                        }
                        if (storyRecorder.entries.size() >= 10) {
                            break;
                        } else {
                            storyRecorder.entries.add(storyEntryFromPhotoEntry);
                        }
                    }
                }
            }
            if (storyRecorder.entries != null) {
                storyRecorder.showVideoTimer(false, true);
                storyRecorder.modeSwitcherView.switchMode(storyRecorder.mode);
                storyRecorder.recordControl.startAsVideo(storyRecorder.mode == 1);
                storyRecorder.selectedEntries = new ArrayList();
                storyRecorder.selectedEntriesOrder = new ArrayList();
                for (int i2 = 0; i2 < storyRecorder.entries.size(); i2++) {
                    storyRecorder.selectedEntries.add(Integer.valueOf(i2));
                    storyRecorder.selectedEntriesOrder.add(Integer.valueOf(i2));
                }
                storyRecorder.collageLayoutView.set(null, true);
                storyRecorder.collageListView.setVisible(false, true);
                storyRecorder.updateActionBarButtons(true);
                storyRecorder.animateGalleryListView(false);
                storyRecorder.navigateTo(1, true);
                MultipleStoriesSelector multipleStoriesSelector = storyRecorder.storiesSelector;
                if (multipleStoriesSelector != null) {
                    multipleStoriesSelector.showHint();
                }
                GalleryListView galleryListView = storyRecorder.galleryListView;
                if (galleryListView != null) {
                    storyRecorder.lastGalleryScrollPosition = galleryListView.layoutManager.onSaveInstanceState();
                    storyRecorder.lastGallerySelectedAlbum = storyRecorder.galleryListView.getSelectedAlbum();
                    return;
                }
                return;
            }
            StoryEntry storyEntry = storyRecorder.outputEntry;
            if (storyEntry != null) {
                storyEntry.setupMultipleStoriesSelector();
            }
            storyRecorder.collageListView.setVisible(false, true);
            storyRecorder.updateActionBarButtons(true);
            storyRecorder.animateGalleryListView(false);
            GalleryListView galleryListView2 = storyRecorder.galleryListView;
            if (galleryListView2 != null) {
                storyRecorder.lastGalleryScrollPosition = galleryListView2.layoutManager.onSaveInstanceState();
                storyRecorder.lastGallerySelectedAlbum = storyRecorder.galleryListView.getSelectedAlbum();
            }
        }
    }

    public boolean isGalleryOpen() {
        GalleryListView galleryListView;
        return (this.scrollingY || (galleryListView = this.galleryListView) == null || galleryListView.getTranslationY() >= ((float) ((this.windowView.getMeasuredHeight() - ((int) (((float) AndroidUtilities.displaySize.y) * 0.35f))) - (AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight())))) ? false : true;
    }

    public void animateGalleryListView(final boolean z) {
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
                        this.f$0.animateGalleryListView(z);
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
            ContainerView containerView = this.containerView;
            if (containerView != null) {
                containerView.setImportantForAccessibility(z ? 4 : 0);
            }
            this.galleryListView.setImportantForAccessibility(z ? 0 : 4);
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
                        StoryRecorder.$r8$lambda$74AEEbz0dce8PCuIuFo0AxnQRVg(this.f$0, height, dynamicAnimation, z2, f, f2);
                    }
                });
                this.galleryOpenCloseSpringAnimator.start();
            } else {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(translationY, height);
                this.galleryOpenCloseAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        this.f$0.galleryListView.setTranslationY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                    }
                });
                this.galleryOpenCloseAnimator.addListener(new AnimatorListenerAdapter() {
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

    public static void $r8$lambda$74AEEbz0dce8PCuIuFo0AxnQRVg(StoryRecorder storyRecorder, float f, DynamicAnimation dynamicAnimation, boolean z, float f2, float f3) {
        if (z) {
            storyRecorder.getClass();
            return;
        }
        storyRecorder.galleryListView.setTranslationY(f);
        storyRecorder.galleryListView.ignoreScroll = false;
        storyRecorder.galleryOpenCloseSpringAnimator = null;
        storyRecorder.galleryListViewOpening = null;
    }

    private void onNavigateStart(int i, int i2) {
        StoryEntry storyEntry;
        StoryEntry storyEntry2;
        int i3;
        StoryEntry storyEntry3;
        StoryEntry storyEntry4;
        VideoEditTextureView textureView;
        StoryEntry storyEntry5;
        long j = 0;
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
            StoryEntry storyEntry6 = this.outputEntry;
            if (storyEntry6 != null) {
                storyEntry6.destroy(false);
                this.outputEntry = null;
            }
            CollageLayoutView2 collageLayoutView2 = this.collageLayoutView;
            if (collageLayoutView2 != null) {
                collageLayoutView2.clear(true);
                this.recordControl.setCollageProgress(0.0f, false);
            }
        }
        if (i == 0) {
            setCameraFlashModeIcon(null, true);
            saveLastCameraBitmap(new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder storyRecorder = this.f$0;
                    storyRecorder.collageLayoutView.setCameraThumb(storyRecorder.getCameraThumb());
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
            if (this.mode == 1) {
                this.muteButton.setVisibility(0);
                StoryEntry storyEntry7 = this.outputEntry;
                setIconMuted(storyEntry7 != null && storyEntry7.muted, false);
                this.playButton.setVisibility(0);
                this.previewView.play(true);
                this.playButton.drawable.setPause(this.previewView.isPlaying(), false);
                this.titleTextView.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                StoryEntry storyEntry8 = this.outputEntry;
                if (storyEntry8 != null && !TextUtils.isEmpty(storyEntry8.audioPath)) {
                    this.muteButton.setVisibility(8);
                    this.playButton.setVisibility(0);
                    this.playButton.drawable.setPause(true, false);
                    this.titleTextView.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.titleTextView.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.downloadButton.setVisibility(0);
            StoryEntry storyEntry9 = this.outputEntry;
            if (storyEntry9 != null && storyEntry9.isRepostMessage) {
                getThemeButton().setVisibility(0);
                updateThemeButtonDrawable(false);
            } else {
                ImageView imageView = this.themeButton;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
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
            StoryEntry storyEntry10 = this.outputEntry;
            captionStory.setPeriod(storyEntry10 == null ? 86400 : storyEntry10.period, false);
            this.captionEdit.setPeriodVisible(!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && ((storyEntry = this.outputEntry) == null || !storyEntry.isEdit));
            CaptionStory captionStory2 = this.captionEdit;
            StoryEntry storyEntry11 = this.outputEntry;
            captionStory2.setHasRoundVideo((storyEntry11 == null || storyEntry11.round == null) ? false : true);
            setReply();
            TimelineView timelineView = this.timelineView;
            StoryEntry storyEntry12 = this.outputEntry;
            timelineView.setOpen((storyEntry12 != null && storyEntry12.isCollage() && this.outputEntry.hasVideo()) ? false : true, false);
        }
        if (i2 == 2 || i == 2) {
            this.titleTextView.setVisibility(0);
            this.coverTimelineView.setVisibility(0);
            StoryEntry storyEntry13 = this.outputEntry;
            if (storyEntry13 != null && storyEntry13.isEditingCover) {
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
            StoryEntry storyEntry14 = this.outputEntry;
            boolean z = (storyEntry14 == null || storyEntry14.botId == 0) ? false : true;
            boolean z2 = storyEntry14 != null && storyEntry14.isEdit;
            PreviewButtons previewButtons = this.previewButtons;
            if (z2) {
                i3 = R.string.Done;
            } else {
                i3 = z ? R.string.UploadBotPreview : R.string.Next;
            }
            previewButtons.setShareText(LocaleController.getString(i3), !z);
            this.coverTimelineView.setVisibility(8);
            this.coverButton.setVisibility(8);
            if (!this.previewAlreadySet) {
                StoryEntry storyEntry15 = this.outputEntry;
                if (storyEntry15 != null && storyEntry15.isRepostMessage) {
                    this.previewView.preset(storyEntry15);
                } else {
                    this.previewView.set(storyEntry15);
                }
            }
            this.previewAlreadySet = false;
            this.captionEdit.editText.getEditText().setOnPremiumMenuLockClickListener(MessagesController.getInstance(this.currentAccount).storyEntitiesAllowed() ? null : new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder storyRecorder = this.f$0;
                    BulletinFactory.of(storyRecorder.windowView, storyRecorder.resourcesProvider).createSimpleBulletin(R.raw.voip_invite, storyRecorder.premiumText(LocaleController.getString(R.string.StoryPremiumFormatting))).show(true);
                }
            });
            this.storiesSelector.setVisibility(this.entries == null ? 8 : 0);
            ArrayList arrayList = this.entries;
            if (arrayList != null) {
                this.storiesSelector.set(arrayList, this.selectedEntriesOrder, this.selectedEntries);
                this.storiesSelector.setSelected(this.entries.indexOf(this.outputEntry));
            }
            this.timelineView.setMaxCount((z || z2 || this.entries != null || ((storyEntry5 = this.outputEntry) != null && (storyEntry5.isCollage() || !this.outputEntry.isVideo))) ? 1 : 3);
            if (i != 2) {
                StoryEntry storyEntry16 = this.outputEntry;
                if (storyEntry16 != null && (storyEntry16.isDraft || storyEntry16.isEdit || this.isReposting)) {
                    if (storyEntry16.paintFile != null) {
                        destroyPhotoPaintView();
                        createPhotoPaintView();
                        hidePhotoPaintView();
                    }
                    StoryEntry storyEntry17 = this.outputEntry;
                    if (storyEntry17.isVideo && storyEntry17.filterState != null && (textureView = this.previewView.getTextureView()) != null) {
                        textureView.setDelegate(new VideoEditTextureView.VideoEditTextureViewDelegate() {
                            @Override
                            public final void onEGLThreadAvailable(FilterGLThread filterGLThread) {
                                StoryRecorder.$r8$lambda$gY25mThaIByTcPanLBe4aOGzmy4(this.f$0, filterGLThread);
                            }
                        });
                    }
                    this.captionEdit.setText(this.outputEntry.caption);
                } else if (i != 2) {
                    this.captionEdit.clear();
                }
            }
            PreviewButtons previewButtons2 = this.previewButtons;
            StoryEntry storyEntry18 = this.outputEntry;
            previewButtons2.setButtonVisible(4, storyEntry18 == null || ((!storyEntry18.isRepostMessage || storyEntry18.isVideo) && !storyEntry18.isCollage()));
            this.previewButtons.setButtonVisible(3, (!BuildVars.DEBUG_PRIVATE_VERSION || (storyEntry4 = this.outputEntry) == null || storyEntry4.isRepostMessage || storyEntry4.isCollage()) ? false : true);
            this.previewButtons.setShareEnabled((this.videoError || this.captionEdit.isCaptionOverLimit() || (MessagesController.getInstance(this.currentAccount).getStoriesController().hasStoryLimit(getCount()) && ((storyEntry3 = this.outputEntry) == null || (!storyEntry3.isEdit && storyEntry3.botId == 0)))) ? false : true);
            RLottieImageView rLottieImageView = this.muteButton;
            StoryEntry storyEntry19 = this.outputEntry;
            rLottieImageView.setImageResource((storyEntry19 == null || !storyEntry19.muted) ? R.drawable.media_mute : R.drawable.media_unmute);
            this.previewView.setVisibility(0);
            this.timelineView.setVisibility(0);
            this.titleTextView.setVisibility(0);
            this.titleTextView.setTranslationX(0.0f);
            StoryEntry storyEntry20 = this.outputEntry;
            if (storyEntry20 != null && storyEntry20.botId != 0) {
                this.titleTextView.setText("");
            } else if (storyEntry20 != null && storyEntry20.isEdit) {
                this.titleTextView.setText(LocaleController.getString(R.string.RecorderEditStory));
            } else if (storyEntry20 != null && storyEntry20.isRepostMessage) {
                this.titleTextView.setText(LocaleController.getString(R.string.RecorderRepost));
            } else if (storyEntry20 != null && storyEntry20.isRepost) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                AvatarSpan avatarSpan = new AvatarSpan(this.titleTextView, this.currentAccount, 32.0f);
                this.titleTextView.setTranslationX(-AndroidUtilities.dp(6.0f));
                SpannableString spannableString = new SpannableString("a");
                spannableString.setSpan(avatarSpan, 0, 1, 33);
                if (this.outputEntry.repostPeer instanceof TLRPC.TL_peerUser) {
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.outputEntry.repostPeer.user_id));
                    avatarSpan.setUser(user);
                    spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) "  ");
                    spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(this.outputEntry.repostPeer)));
                    avatarSpan.setChat(chat);
                    spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) "  ");
                    spannableStringBuilder.append((CharSequence) (chat != null ? chat.title : ""));
                }
                this.titleTextView.setText(spannableStringBuilder);
            } else {
                j = 0;
                this.titleTextView.setText(LocaleController.getString(R.string.RecorderNewStory));
            }
            j = 0;
        } else {
            j = 0;
        }
        if (i == 1) {
            this.captionEdit.hidePeriodPopup();
            this.muteHint.hide();
            this.storiesSelector.onBackPressed();
        }
        if (i2 == 2 && (storyEntry2 = this.outputEntry) != null) {
            if (storyEntry2.cover < j) {
                storyEntry2.cover = j;
            }
            this.coverValue = storyEntry2.cover;
            long duration = this.previewView.getDuration() < 100 ? this.outputEntry.duration : this.previewView.getDuration();
            StoryEntry storyEntry21 = this.outputEntry;
            if (storyEntry21.duration <= 0) {
                storyEntry21.duration = duration;
            }
            TimelineView timelineView2 = this.coverTimelineView;
            String absolutePath = storyEntry21.getOriginalFile().getAbsolutePath();
            StoryEntry storyEntry22 = this.outputEntry;
            timelineView2.setVideo(false, absolutePath, storyEntry22.duration, storyEntry22.videoVolume);
            TimelineView timelineView3 = this.coverTimelineView;
            StoryEntry storyEntry23 = this.outputEntry;
            float f = duration;
            timelineView3.setCoverVideo((long) (storyEntry23.left * f), (long) (storyEntry23.right * f));
            final Utilities.Callback2 callback2 = new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    StoryRecorder.$r8$lambda$m_29YnP932QOif3DJi5os5Xc0Ps(this.f$0, (Boolean) obj, (Float) obj2);
                }
            };
            this.coverTimelineView.setDelegate(new TimelineView.TimelineDelegate() {
                @Override
                public void onAudioLeftChange(float f2) {
                    TimelineView.TimelineDelegate.CC.$default$onAudioLeftChange(this, f2);
                }

                @Override
                public void onAudioOffsetChange(long j2) {
                    TimelineView.TimelineDelegate.CC.$default$onAudioOffsetChange(this, j2);
                }

                @Override
                public void onAudioRemove() {
                    TimelineView.TimelineDelegate.CC.$default$onAudioRemove(this);
                }

                @Override
                public void onAudioRightChange(float f2) {
                    TimelineView.TimelineDelegate.CC.$default$onAudioRightChange(this, f2);
                }

                @Override
                public void onAudioVolumeChange(float f2) {
                    TimelineView.TimelineDelegate.CC.$default$onAudioVolumeChange(this, f2);
                }

                @Override
                public void onProgressChange(long j2, boolean z3) {
                    TimelineView.TimelineDelegate.CC.$default$onProgressChange(this, j2, z3);
                }

                @Override
                public void onProgressDragChange(boolean z3) {
                    TimelineView.TimelineDelegate.CC.$default$onProgressDragChange(this, z3);
                }

                @Override
                public void onRoundLeftChange(float f2) {
                    TimelineView.TimelineDelegate.CC.$default$onRoundLeftChange(this, f2);
                }

                @Override
                public void onRoundOffsetChange(long j2) {
                    TimelineView.TimelineDelegate.CC.$default$onRoundOffsetChange(this, j2);
                }

                @Override
                public void onRoundRemove() {
                    TimelineView.TimelineDelegate.CC.$default$onRoundRemove(this);
                }

                @Override
                public void onRoundRightChange(float f2) {
                    TimelineView.TimelineDelegate.CC.$default$onRoundRightChange(this, f2);
                }

                @Override
                public void onRoundSelectChange(boolean z3) {
                    TimelineView.TimelineDelegate.CC.$default$onRoundSelectChange(this, z3);
                }

                @Override
                public void onRoundVolumeChange(float f2) {
                    TimelineView.TimelineDelegate.CC.$default$onRoundVolumeChange(this, f2);
                }

                @Override
                public void onVideoLeftChange(int i4, float f2) {
                    TimelineView.TimelineDelegate.CC.$default$onVideoLeftChange(this, i4, f2);
                }

                @Override
                public void onVideoOffsetChange(int i4, long j2) {
                    TimelineView.TimelineDelegate.CC.$default$onVideoOffsetChange(this, i4, j2);
                }

                @Override
                public void onVideoRightChange(int i4, float f2) {
                    TimelineView.TimelineDelegate.CC.$default$onVideoRightChange(this, i4, f2);
                }

                @Override
                public void onVideoRightChange(boolean z3, float f2) {
                    TimelineView.TimelineDelegate.CC.$default$onVideoRightChange(this, z3, f2);
                }

                @Override
                public void onVideoSelected(int i4) {
                    TimelineView.TimelineDelegate.CC.$default$onVideoSelected(this, i4);
                }

                @Override
                public void onVideoVolumeChange(float f2) {
                    TimelineView.TimelineDelegate.CC.$default$onVideoVolumeChange(this, f2);
                }

                @Override
                public void onVideoVolumeChange(int i4, float f2) {
                    TimelineView.TimelineDelegate.CC.$default$onVideoVolumeChange(this, i4, f2);
                }

                @Override
                public void onVideoLeftChange(boolean z3, float f2) {
                    callback2.run(Boolean.FALSE, Float.valueOf(f2));
                }
            });
            float fMax = (this.coverValue / Math.max(1L, duration)) * 0.96f;
            this.coverTimelineView.setVideoLeft(fMax);
            this.coverTimelineView.setVideoRight(0.04f + fMax);
            callback2.run(Boolean.TRUE, Float.valueOf(fMax));
        }
        PhotoFilterView.EnhanceView enhanceView = this.photoFilterEnhanceView;
        if (enhanceView != null) {
            enhanceView.setAllowTouch(false);
        }
        HintView2 hintView3 = this.savedDualHint;
        if (hintView3 != null) {
            hintView3.hide();
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
        HintView2 hintView4 = this.removeCollageHint;
        if (hintView4 != null) {
            hintView4.hide();
        }
        CollageLayoutView2 collageLayoutView3 = this.collageLayoutView;
        collageLayoutView3.setPreview(i2 == 1 && collageLayoutView3.hasLayout());
    }

    public static void $r8$lambda$gY25mThaIByTcPanLBe4aOGzmy4(StoryRecorder storyRecorder, FilterGLThread filterGLThread) {
        MediaController.SavedFilterState savedFilterState;
        if (filterGLThread == null) {
            storyRecorder.getClass();
            return;
        }
        StoryEntry storyEntry = storyRecorder.outputEntry;
        if (storyEntry == null || (savedFilterState = storyEntry.filterState) == null) {
            return;
        }
        filterGLThread.setFilterGLThreadDelegate(FilterShaders.getFilterShadersDelegate(savedFilterState));
    }

    public static void $r8$lambda$m_29YnP932QOif3DJi5os5Xc0Ps(StoryRecorder storyRecorder, Boolean bool, Float f) {
        long duration = storyRecorder.previewView.getDuration() < 100 ? storyRecorder.outputEntry.duration : storyRecorder.previewView.getDuration();
        float fFloatValue = f.floatValue() + ((f.floatValue() / 0.96f) * 0.04f);
        StoryEntry storyEntry = storyRecorder.outputEntry;
        float f2 = storyEntry.right;
        float f3 = storyEntry.left;
        float f4 = duration;
        long j = (long) (fFloatValue * (f2 - f3) * f4);
        PreviewView previewView = storyRecorder.previewView;
        long j2 = (long) ((f3 * f4) + j);
        storyRecorder.coverValue = j2;
        previewView.seekTo(j2, false);
        PaintView paintView = storyRecorder.paintView;
        if (paintView != null) {
            paintView.setCoverTime(storyRecorder.coverValue);
        }
        StoryEntry storyEntry2 = storyRecorder.outputEntry;
        if (storyEntry2 == null || !storyEntry2.isEdit) {
            return;
        }
        storyEntry2.editedMedia = true;
    }

    public void onNavigateEnd(int i, int i2) {
        int i3;
        if (i == 0) {
            destroyCameraView(false);
            this.recordControl.setVisibility(8);
            this.zoomControlView.setVisibility(8);
            this.modeSwitcherView.setVisibility(8);
            animateRecording(false, false);
            setAwakeLock(false);
        }
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
            this.entries = null;
            this.selectedEntries = null;
            this.selectedEntriesOrder = null;
        }
        if (i2 == 1) {
            StoryEntry storyEntry = this.outputEntry;
            if (storyEntry == null || !storyEntry.isRepost) {
                createPhotoPaintView();
                hidePhotoPaintView();
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
            StoryEntry storyEntry2 = this.outputEntry;
            videoTimeView.setVisibility((storyEntry2 == null || storyEntry2.duration < 30000) ? 8 : 0);
            this.captionContainer.setAlpha(1.0f);
            this.captionContainer.setTranslationY(0.0f);
            CaptionStory captionStory = this.captionEdit;
            StoryEntry storyEntry3 = this.outputEntry;
            captionStory.setVisibility((storyEntry3 == null || storyEntry3.botId == 0) ? 0 : 8);
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

    public void switchToEditMode(int i, boolean z) {
        switchToEditMode(i, false, z);
    }

    public void switchToEditMode(final int i, boolean z, boolean z2) {
        char c;
        CropEditor cropEditor;
        float f;
        CropInlineEditor cropInlineEditor;
        Property property;
        StoryEntry storyEntry;
        float f2;
        ImageView imageView;
        int contentHeight;
        float f3;
        PhotoFilterCurvesControl photoFilterCurvesControl;
        PhotoFilterBlurControl photoFilterBlurControl;
        float f4;
        float f5;
        float fDp;
        int iDp;
        Property property2;
        float f6;
        float f7;
        float f8;
        float f9;
        ImageView imageView2;
        TimelineView timelineView;
        int i2;
        StoryEntry storyEntry2;
        boolean z3;
        float f10;
        float f11;
        StoryEntry storyEntry3;
        CaptionStory captionStory;
        if (this.currentEditMode != i || z) {
            if (i == -1 || (captionStory = this.captionEdit) == null || !captionStory.isRecording()) {
                final int i3 = this.currentEditMode;
                this.currentEditMode = i;
                AnimatorSet animatorSet = this.editModeAnimator;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.editModeAnimator = null;
                }
                if (i3 != i) {
                    onSwitchEditModeStart(i3, i);
                }
                this.previewButtons.appear((i == -1 || i == 2) && this.openProgress > 0.0f, z2);
                ArrayList arrayList = new ArrayList();
                PhotoFilterView photoFilterView = this.photoFilterView;
                boolean z4 = photoFilterView == null && i == 1;
                float f12 = 1.0f;
                if (i == 1) {
                    createFilterPhotoView();
                    PhotoFilterView photoFilterView2 = this.photoFilterView;
                    this.previewTouchable = photoFilterView2;
                    FrameLayout toolsView = photoFilterView2 != null ? photoFilterView2.getToolsView() : null;
                    if (toolsView != null) {
                        toolsView.setAlpha(0.0f);
                        toolsView.setVisibility(0);
                        arrayList.add(ObjectAnimator.ofFloat(toolsView, (Property<FrameLayout, Float>) View.TRANSLATION_Y, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(toolsView, (Property<FrameLayout, Float>) View.ALPHA, 1.0f));
                    }
                } else {
                    if (i3 == 1 && photoFilterView != null) {
                        this.previewTouchable = null;
                        c = 0;
                        arrayList.add(ObjectAnimator.ofFloat(photoFilterView.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(226.0f)));
                        arrayList.add(ObjectAnimator.ofFloat(this.photoFilterView.getToolsView(), (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                    }
                    if (i == 0) {
                        createPhotoPaintView();
                        this.previewTouchable = this.paintView;
                        FlashViews.ImageViewInvertable imageViewInvertable = this.backButton;
                        Property property3 = View.ALPHA;
                        float[] fArr = new float[1];
                        fArr[c] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(imageViewInvertable, (Property<FlashViews.ImageViewInvertable, Float>) property3, fArr));
                        arrayList.add(ObjectAnimator.ofFloat(this.paintView.getTopLayout(), (Property<View, Float>) property3, 0.0f, 1.0f));
                        View topLayout = this.paintView.getTopLayout();
                        Property property4 = View.TRANSLATION_Y;
                        float[] fArr2 = new float[2];
                        fArr2[c] = -AndroidUtilities.dp(16.0f);
                        fArr2[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(topLayout, (Property<View, Float>) property4, fArr2));
                        arrayList.add(ObjectAnimator.ofFloat(this.paintView.getBottomLayout(), (Property<View, Float>) property3, 0.0f, 1.0f));
                        View bottomLayout = this.paintView.getBottomLayout();
                        float[] fArr3 = new float[2];
                        fArr3[c] = AndroidUtilities.dp(48.0f);
                        fArr3[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(bottomLayout, (Property<View, Float>) property4, fArr3));
                        View weightChooserView = this.paintView.getWeightChooserView();
                        Property property5 = View.TRANSLATION_X;
                        float[] fArr4 = new float[2];
                        fArr4[c] = -AndroidUtilities.dp(32.0f);
                        fArr4[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(weightChooserView, (Property<View, Float>) property5, fArr4));
                    } else if (i3 == 0 && this.paintView != null) {
                        this.previewTouchable = null;
                        FlashViews.ImageViewInvertable imageViewInvertable2 = this.backButton;
                        Property property6 = View.ALPHA;
                        float[] fArr5 = new float[1];
                        fArr5[c] = 1.0f;
                        arrayList.add(ObjectAnimator.ofFloat(imageViewInvertable2, (Property<FlashViews.ImageViewInvertable, Float>) property6, fArr5));
                        View topLayout2 = this.paintView.getTopLayout();
                        float[] fArr6 = new float[1];
                        fArr6[c] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(topLayout2, (Property<View, Float>) property6, fArr6));
                        View topLayout3 = this.paintView.getTopLayout();
                        Property property7 = View.TRANSLATION_Y;
                        float[] fArr7 = new float[1];
                        fArr7[c] = -AndroidUtilities.dp(16.0f);
                        arrayList.add(ObjectAnimator.ofFloat(topLayout3, (Property<View, Float>) property7, fArr7));
                        View bottomLayout2 = this.paintView.getBottomLayout();
                        float[] fArr8 = new float[1];
                        fArr8[c] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(bottomLayout2, (Property<View, Float>) property6, fArr8));
                        View bottomLayout3 = this.paintView.getBottomLayout();
                        float[] fArr9 = new float[1];
                        fArr9[c] = AndroidUtilities.dp(48.0f);
                        arrayList.add(ObjectAnimator.ofFloat(bottomLayout3, (Property<View, Float>) property7, fArr9));
                        View weightChooserView2 = this.paintView.getWeightChooserView();
                        Property property8 = View.TRANSLATION_X;
                        float[] fArr10 = new float[1];
                        fArr10[c] = -AndroidUtilities.dp(32.0f);
                        arrayList.add(ObjectAnimator.ofFloat(weightChooserView2, (Property<View, Float>) property8, fArr10));
                    }
                    cropEditor = this.cropEditor;
                    if (cropEditor != null) {
                        f = 52.0f;
                    } else if (i == 3) {
                        CropRotationWheel cropRotationWheel = cropEditor.wheel;
                        Property property9 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(cropRotationWheel, (Property<CropRotationWheel, Float>) property9, 0.0f, 1.0f));
                        CropRotationWheel cropRotationWheel2 = this.cropEditor.wheel;
                        Property property10 = View.TRANSLATION_Y;
                        f = 52.0f;
                        float[] fArr11 = new float[2];
                        fArr11[c] = AndroidUtilities.dp(52.0f);
                        fArr11[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(cropRotationWheel2, (Property<CropRotationWheel, Float>) property10, fArr11));
                        arrayList.add(ObjectAnimator.ofFloat(this.cropEditor.buttonsLayout, (Property<FrameLayout, Float>) property9, 0.0f, 1.0f));
                        FrameLayout frameLayout = this.cropEditor.buttonsLayout;
                        float[] fArr12 = new float[2];
                        fArr12[c] = AndroidUtilities.dp(52.0f);
                        fArr12[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property10, fArr12));
                        float[] fArr13 = new float[2];
                        fArr13[c] = this.cropEditor.getAppearProgress();
                        fArr13[1] = 1.0f;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr13);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                this.f$0.cropEditor.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            }
                        });
                        arrayList.add(valueAnimatorOfFloat);
                    } else {
                        f = 52.0f;
                        if (i3 == 3) {
                            CropRotationWheel cropRotationWheel3 = cropEditor.wheel;
                            Property property11 = View.ALPHA;
                            arrayList.add(ObjectAnimator.ofFloat(cropRotationWheel3, (Property<CropRotationWheel, Float>) property11, 1.0f, 0.0f));
                            CropRotationWheel cropRotationWheel4 = this.cropEditor.wheel;
                            Property property12 = View.TRANSLATION_Y;
                            float fDp2 = AndroidUtilities.dp(52.0f);
                            float[] fArr14 = new float[2];
                            fArr14[c] = 0.0f;
                            fArr14[1] = fDp2;
                            arrayList.add(ObjectAnimator.ofFloat(cropRotationWheel4, (Property<CropRotationWheel, Float>) property12, fArr14));
                            arrayList.add(ObjectAnimator.ofFloat(this.cropEditor.buttonsLayout, (Property<FrameLayout, Float>) property11, 1.0f, 0.0f));
                            FrameLayout frameLayout2 = this.cropEditor.buttonsLayout;
                            float fDp3 = AndroidUtilities.dp(52.0f);
                            float[] fArr15 = new float[2];
                            fArr15[c] = 0.0f;
                            fArr15[1] = fDp3;
                            arrayList.add(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property12, fArr15));
                            float[] fArr16 = new float[2];
                            fArr16[c] = this.cropEditor.getAppearProgress();
                            fArr16[1] = 0.0f;
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr16);
                            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    this.f$0.cropEditor.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                }
                            });
                            arrayList.add(valueAnimatorOfFloat2);
                        }
                    }
                    cropInlineEditor = this.cropInlineEditor;
                    if (cropInlineEditor != null) {
                        if (i == 4) {
                            CropRotationWheel cropRotationWheel5 = cropInlineEditor.wheel;
                            Property property13 = View.ALPHA;
                            arrayList.add(ObjectAnimator.ofFloat(cropRotationWheel5, (Property<CropRotationWheel, Float>) property13, 0.0f, 1.0f));
                            CropRotationWheel cropRotationWheel6 = this.cropInlineEditor.wheel;
                            Property property14 = View.TRANSLATION_Y;
                            float[] fArr17 = new float[2];
                            fArr17[c] = AndroidUtilities.dp(f);
                            fArr17[1] = 0.0f;
                            arrayList.add(ObjectAnimator.ofFloat(cropRotationWheel6, (Property<CropRotationWheel, Float>) property14, fArr17));
                            arrayList.add(ObjectAnimator.ofFloat(this.cropInlineEditor.buttonsLayout, (Property<FrameLayout, Float>) property13, 0.0f, 1.0f));
                            FrameLayout frameLayout3 = this.cropInlineEditor.buttonsLayout;
                            float[] fArr18 = new float[2];
                            fArr18[c] = AndroidUtilities.dp(f);
                            fArr18[1] = 0.0f;
                            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property14, fArr18));
                            float[] fArr19 = new float[2];
                            fArr19[c] = this.cropInlineEditor.getAppearProgress();
                            fArr19[1] = 1.0f;
                            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(fArr19);
                            valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    this.f$0.cropInlineEditor.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                }
                            });
                            arrayList.add(valueAnimatorOfFloat3);
                        } else if (i3 == 4) {
                            CropRotationWheel cropRotationWheel7 = cropInlineEditor.wheel;
                            Property property15 = View.ALPHA;
                            arrayList.add(ObjectAnimator.ofFloat(cropRotationWheel7, (Property<CropRotationWheel, Float>) property15, 1.0f, 0.0f));
                            CropRotationWheel cropRotationWheel8 = this.cropInlineEditor.wheel;
                            Property property16 = View.TRANSLATION_Y;
                            float fDp4 = AndroidUtilities.dp(f);
                            float[] fArr20 = new float[2];
                            fArr20[c] = 0.0f;
                            fArr20[1] = fDp4;
                            arrayList.add(ObjectAnimator.ofFloat(cropRotationWheel8, (Property<CropRotationWheel, Float>) property16, fArr20));
                            arrayList.add(ObjectAnimator.ofFloat(this.cropInlineEditor.buttonsLayout, (Property<FrameLayout, Float>) property15, 1.0f, 0.0f));
                            FrameLayout frameLayout4 = this.cropInlineEditor.buttonsLayout;
                            float fDp5 = AndroidUtilities.dp(f);
                            float[] fArr21 = new float[2];
                            fArr21[c] = 0.0f;
                            fArr21[1] = fDp5;
                            arrayList.add(ObjectAnimator.ofFloat(frameLayout4, (Property<FrameLayout, Float>) property16, fArr21));
                            float[] fArr22 = new float[2];
                            fArr22[c] = this.cropInlineEditor.getAppearProgress();
                            fArr22[1] = 0.0f;
                            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(fArr22);
                            valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    this.f$0.cropInlineEditor.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                }
                            });
                            arrayList.add(valueAnimatorOfFloat4);
                        }
                    }
                    RLottieImageView rLottieImageView = this.muteButton;
                    property = View.ALPHA;
                    float[] fArr23 = new float[1];
                    fArr23[c] = ((i != -1 || i == 2) && this.mode == 1) ? 1.0f : 0.0f;
                    arrayList.add(ObjectAnimator.ofFloat(rLottieImageView, (Property<RLottieImageView, Float>) property, fArr23));
                    PlayPauseButton playPauseButton = this.playButton;
                    float[] fArr24 = new float[1];
                    fArr24[c] = ((i != -1 || i == 2) && (this.mode == 1 || !((storyEntry = this.outputEntry) == null || TextUtils.isEmpty(storyEntry.audioPath)))) ? 1.0f : 0.0f;
                    arrayList.add(ObjectAnimator.ofFloat(playPauseButton, (Property<PlayPauseButton, Float>) property, fArr24));
                    DownloadButton downloadButton = this.downloadButton;
                    if (i != -1 || i == 2) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    float[] fArr25 = new float[1];
                    fArr25[c] = f2;
                    arrayList.add(ObjectAnimator.ofFloat(downloadButton, (Property<DownloadButton, Float>) property, fArr25));
                    imageView = this.themeButton;
                    if (imageView != null) {
                        float[] fArr26 = new float[1];
                        fArr26[c] = ((i != -1 || i == 2) && (storyEntry3 = this.outputEntry) != null && storyEntry3.isRepostMessage) ? 1.0f : 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, fArr26));
                    }
                    SimpleTextView simpleTextView = this.titleTextView;
                    int i4 = this.currentPage;
                    float[] fArr27 = new float[1];
                    fArr27[c] = ((i4 != 1 || i4 == 2) && i == -1) ? 1.0f : 0.0f;
                    arrayList.add(ObjectAnimator.ofFloat(simpleTextView, (Property<SimpleTextView, Float>) property, fArr27));
                    if (i == 1) {
                        FrameLayout frameLayout5 = this.previewContainer;
                        frameLayout5.setPivotY(frameLayout5.getMeasuredHeight() * 0.2f);
                        contentHeight = AndroidUtilities.dp(164.0f);
                    } else if (i == 0) {
                        FrameLayout frameLayout6 = this.previewContainer;
                        frameLayout6.setPivotY(frameLayout6.getMeasuredHeight() * 0.6f);
                        contentHeight = AndroidUtilities.dp(40.0f);
                    } else if (i == 2) {
                        this.previewContainer.setPivotY(0.0f);
                        contentHeight = this.timelineView.getContentHeight() + AndroidUtilities.dp(8.0f);
                    } else {
                        contentHeight = 0;
                    }
                    if (contentHeight > 0) {
                        int height = this.previewContainer.getHeight() - ((int) this.previewContainer.getPivotY());
                        f3 = (height - contentHeight) / height;
                    } else {
                        f3 = 1.0f;
                    }
                    FrameLayout frameLayout7 = this.previewContainer;
                    Property property17 = View.SCALE_X;
                    float[] fArr28 = new float[1];
                    fArr28[c] = f3;
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout7, (Property<FrameLayout, Float>) property17, fArr28));
                    FrameLayout frameLayout8 = this.previewContainer;
                    Property property18 = View.SCALE_Y;
                    float[] fArr29 = new float[1];
                    fArr29[c] = f3;
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout8, (Property<FrameLayout, Float>) property18, fArr29));
                    if (i == -1) {
                        FrameLayout frameLayout9 = this.previewContainer;
                        Property property19 = View.TRANSLATION_Y;
                        float[] fArr30 = new float[1];
                        fArr30[c] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout9, (Property<FrameLayout, Float>) property19, fArr30));
                    }
                    photoFilterCurvesControl = this.photoFilterViewCurvesControl;
                    if (photoFilterCurvesControl != null) {
                        if (i == 1) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        float[] fArr31 = new float[1];
                        fArr31[c] = f11;
                        arrayList.add(ObjectAnimator.ofFloat(photoFilterCurvesControl, (Property<PhotoFilterCurvesControl, Float>) property, fArr31));
                    }
                    photoFilterBlurControl = this.photoFilterViewBlurControl;
                    if (photoFilterBlurControl != null) {
                        if (i == 1) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        float[] fArr32 = new float[1];
                        fArr32[c] = f10;
                        arrayList.add(ObjectAnimator.ofFloat(photoFilterBlurControl, (Property<PhotoFilterBlurControl, Float>) property, fArr32));
                    }
                    CaptionStory captionStory2 = this.captionEdit;
                    if (i == -1) {
                        f4 = 1.0f;
                    } else {
                        f4 = 0.0f;
                    }
                    float[] fArr33 = new float[1];
                    fArr33[c] = f4;
                    arrayList.add(ObjectAnimator.ofFloat(captionStory2, (Property<CaptionStory, Float>) property, fArr33));
                    FrameLayout frameLayout10 = this.captionContainer;
                    if (i != -1 || i == 2) {
                        f5 = 1.0f;
                    } else {
                        f5 = 0.0f;
                    }
                    float[] fArr34 = new float[1];
                    fArr34[c] = f5;
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout10, (Property<FrameLayout, Float>) property, fArr34));
                    FrameLayout frameLayout11 = this.captionContainer;
                    Property property20 = View.TRANSLATION_Y;
                    if (i != -1 || i == 2) {
                        fDp = 0.0f;
                    } else {
                        fDp = AndroidUtilities.dp(120.0f);
                    }
                    float[] fArr35 = new float[1];
                    fArr35[c] = fDp;
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout11, (Property<FrameLayout, Float>) property20, fArr35));
                    FrameLayout frameLayout12 = this.videoTimelineContainerView;
                    if (i != -1 && i != 2) {
                        f12 = 0.0f;
                    }
                    float[] fArr36 = new float[1];
                    fArr36[c] = f12;
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout12, (Property<FrameLayout, Float>) property, fArr36));
                    FrameLayout frameLayout13 = this.videoTimelineContainerView;
                    if (i == 2) {
                        iDp = AndroidUtilities.dp(68.0f);
                    } else {
                        iDp = (-(this.captionEdit.getEditTextHeight() + AndroidUtilities.dp(12.0f))) + AndroidUtilities.dp(64.0f);
                    }
                    float[] fArr37 = new float[1];
                    fArr37[c] = iDp;
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout13, (Property<FrameLayout, Float>) property20, fArr37));
                    LinearLayout linearLayout = this.actionBarButtons;
                    linearLayout.setPivotX(linearLayout.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                    LinearLayout linearLayout2 = this.actionBarButtons;
                    property2 = View.ROTATION;
                    if (i == 2) {
                        f6 = -90.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    float[] fArr38 = new float[1];
                    fArr38[c] = f6;
                    arrayList.add(ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) property2, fArr38));
                    PlayPauseButton playPauseButton2 = this.playButton;
                    if (i == 2) {
                        f7 = 90.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    float[] fArr39 = new float[1];
                    fArr39[c] = f7;
                    arrayList.add(ObjectAnimator.ofFloat(playPauseButton2, (Property<PlayPauseButton, Float>) property2, fArr39));
                    RLottieImageView rLottieImageView2 = this.muteButton;
                    if (i == 2) {
                        f8 = 90.0f;
                    } else {
                        f8 = 0.0f;
                    }
                    float[] fArr40 = new float[1];
                    fArr40[c] = f8;
                    arrayList.add(ObjectAnimator.ofFloat(rLottieImageView2, (Property<RLottieImageView, Float>) property2, fArr40));
                    DownloadButton downloadButton2 = this.downloadButton;
                    if (i == 2) {
                        f9 = 90.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    float[] fArr41 = new float[1];
                    fArr41[c] = f9;
                    arrayList.add(ObjectAnimator.ofFloat(downloadButton2, (Property<DownloadButton, Float>) property2, fArr41));
                    imageView2 = this.themeButton;
                    if (imageView2 != null) {
                        float[] fArr42 = new float[1];
                        fArr42[c] = i == 2 ? 90.0f : 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, fArr42));
                    }
                    if (this.blurManager.hasRenderNode()) {
                        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                StoryRecorder.this.captionEdit.invalidateBlur();
                            }
                        });
                        arrayList.add(valueAnimatorOfFloat5);
                    }
                    timelineView = this.timelineView;
                    if (timelineView != null) {
                        storyEntry2 = this.outputEntry;
                        if (storyEntry2 == null && storyEntry2.isCollage() && this.outputEntry.hasVideo() && i != 2) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        timelineView.setOpen(z3, z2);
                    }
                    if (z2) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        this.editModeAnimator = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        this.editModeAnimator.setDuration(320L);
                        this.editModeAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                        this.editModeAnimator.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                int i5 = i3;
                                int i6 = i;
                                if (i5 != i6) {
                                    StoryRecorder.this.onSwitchEditModeEnd(i5, i6);
                                }
                            }
                        });
                        if (z4) {
                            this.editModeAnimator.setStartDelay(120L);
                        }
                        this.editModeAnimator.start();
                        return;
                    }
                    for (i2 = 0; i2 < arrayList.size(); i2++) {
                        Animator animator = (Animator) arrayList.get(i2);
                        animator.setDuration(1L);
                        animator.start();
                    }
                    if (i3 != i) {
                        onSwitchEditModeEnd(i3, i);
                    }
                }
                c = 0;
                if (i == 0) {
                    createPhotoPaintView();
                    this.previewTouchable = this.paintView;
                    FlashViews.ImageViewInvertable imageViewInvertable3 = this.backButton;
                    Property property21 = View.ALPHA;
                    float[] fArr43 = new float[1];
                    fArr43[c] = 0.0f;
                    arrayList.add(ObjectAnimator.ofFloat(imageViewInvertable3, (Property<FlashViews.ImageViewInvertable, Float>) property21, fArr43));
                    arrayList.add(ObjectAnimator.ofFloat(this.paintView.getTopLayout(), (Property<View, Float>) property21, 0.0f, 1.0f));
                    View topLayout4 = this.paintView.getTopLayout();
                    Property property22 = View.TRANSLATION_Y;
                    float[] fArr44 = new float[2];
                    fArr44[c] = -AndroidUtilities.dp(16.0f);
                    fArr44[1] = 0.0f;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout4, (Property<View, Float>) property22, fArr44));
                    arrayList.add(ObjectAnimator.ofFloat(this.paintView.getBottomLayout(), (Property<View, Float>) property21, 0.0f, 1.0f));
                    View bottomLayout4 = this.paintView.getBottomLayout();
                    float[] fArr45 = new float[2];
                    fArr45[c] = AndroidUtilities.dp(48.0f);
                    fArr45[1] = 0.0f;
                    arrayList.add(ObjectAnimator.ofFloat(bottomLayout4, (Property<View, Float>) property22, fArr45));
                    View weightChooserView3 = this.paintView.getWeightChooserView();
                    Property property23 = View.TRANSLATION_X;
                    float[] fArr46 = new float[2];
                    fArr46[c] = -AndroidUtilities.dp(32.0f);
                    fArr46[1] = 0.0f;
                    arrayList.add(ObjectAnimator.ofFloat(weightChooserView3, (Property<View, Float>) property23, fArr46));
                } else if (i3 == 0) {
                    this.previewTouchable = null;
                    FlashViews.ImageViewInvertable imageViewInvertable4 = this.backButton;
                    Property property24 = View.ALPHA;
                    float[] fArr47 = new float[1];
                    fArr47[c] = 1.0f;
                    arrayList.add(ObjectAnimator.ofFloat(imageViewInvertable4, (Property<FlashViews.ImageViewInvertable, Float>) property24, fArr47));
                    View topLayout5 = this.paintView.getTopLayout();
                    float[] fArr48 = new float[1];
                    fArr48[c] = 0.0f;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout5, (Property<View, Float>) property24, fArr48));
                    View topLayout6 = this.paintView.getTopLayout();
                    Property property25 = View.TRANSLATION_Y;
                    float[] fArr49 = new float[1];
                    fArr49[c] = -AndroidUtilities.dp(16.0f);
                    arrayList.add(ObjectAnimator.ofFloat(topLayout6, (Property<View, Float>) property25, fArr49));
                    View bottomLayout5 = this.paintView.getBottomLayout();
                    float[] fArr50 = new float[1];
                    fArr50[c] = 0.0f;
                    arrayList.add(ObjectAnimator.ofFloat(bottomLayout5, (Property<View, Float>) property24, fArr50));
                    View bottomLayout6 = this.paintView.getBottomLayout();
                    float[] fArr51 = new float[1];
                    fArr51[c] = AndroidUtilities.dp(48.0f);
                    arrayList.add(ObjectAnimator.ofFloat(bottomLayout6, (Property<View, Float>) property25, fArr51));
                    View weightChooserView4 = this.paintView.getWeightChooserView();
                    Property property26 = View.TRANSLATION_X;
                    float[] fArr110 = new float[1];
                    fArr110[c] = -AndroidUtilities.dp(32.0f);
                    arrayList.add(ObjectAnimator.ofFloat(weightChooserView4, (Property<View, Float>) property26, fArr110));
                }
                cropEditor = this.cropEditor;
                if (cropEditor != null) {
                    f = 52.0f;
                } else if (i == 3) {
                    CropRotationWheel cropRotationWheel9 = cropEditor.wheel;
                    Property property27 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(cropRotationWheel9, (Property<CropRotationWheel, Float>) property27, 0.0f, 1.0f));
                    CropRotationWheel cropRotationWheel10 = this.cropEditor.wheel;
                    Property property110 = View.TRANSLATION_Y;
                    f = 52.0f;
                    float[] fArr111 = new float[2];
                    fArr111[c] = AndroidUtilities.dp(52.0f);
                    fArr111[1] = 0.0f;
                    arrayList.add(ObjectAnimator.ofFloat(cropRotationWheel10, (Property<CropRotationWheel, Float>) property110, fArr111));
                    arrayList.add(ObjectAnimator.ofFloat(this.cropEditor.buttonsLayout, (Property<FrameLayout, Float>) property27, 0.0f, 1.0f));
                    FrameLayout frameLayout14 = this.cropEditor.buttonsLayout;
                    float[] fArr112 = new float[2];
                    fArr112[c] = AndroidUtilities.dp(52.0f);
                    fArr112[1] = 0.0f;
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout14, (Property<FrameLayout, Float>) property110, fArr112));
                    float[] fArr113 = new float[2];
                    fArr113[c] = this.cropEditor.getAppearProgress();
                    fArr113[1] = 1.0f;
                    ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(fArr113);
                    valueAnimatorOfFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            this.f$0.cropEditor.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        }
                    });
                    arrayList.add(valueAnimatorOfFloat6);
                } else {
                    f = 52.0f;
                    if (i3 == 3) {
                        CropRotationWheel cropRotationWheel11 = cropEditor.wheel;
                        Property property111 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(cropRotationWheel11, (Property<CropRotationWheel, Float>) property111, 1.0f, 0.0f));
                        CropRotationWheel cropRotationWheel12 = this.cropEditor.wheel;
                        Property property112 = View.TRANSLATION_Y;
                        float fDp6 = AndroidUtilities.dp(52.0f);
                        float[] fArr114 = new float[2];
                        fArr114[c] = 0.0f;
                        fArr114[1] = fDp6;
                        arrayList.add(ObjectAnimator.ofFloat(cropRotationWheel12, (Property<CropRotationWheel, Float>) property112, fArr114));
                        arrayList.add(ObjectAnimator.ofFloat(this.cropEditor.buttonsLayout, (Property<FrameLayout, Float>) property111, 1.0f, 0.0f));
                        FrameLayout frameLayout15 = this.cropEditor.buttonsLayout;
                        float fDp7 = AndroidUtilities.dp(52.0f);
                        float[] fArr115 = new float[2];
                        fArr115[c] = 0.0f;
                        fArr115[1] = fDp7;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout15, (Property<FrameLayout, Float>) property112, fArr115));
                        float[] fArr116 = new float[2];
                        fArr116[c] = this.cropEditor.getAppearProgress();
                        fArr116[1] = 0.0f;
                        ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(fArr116);
                        valueAnimatorOfFloat7.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                this.f$0.cropEditor.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            }
                        });
                        arrayList.add(valueAnimatorOfFloat7);
                    }
                }
                cropInlineEditor = this.cropInlineEditor;
                if (cropInlineEditor != null) {
                    if (i == 4) {
                        CropRotationWheel cropRotationWheel13 = cropInlineEditor.wheel;
                        Property property113 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(cropRotationWheel13, (Property<CropRotationWheel, Float>) property113, 0.0f, 1.0f));
                        CropRotationWheel cropRotationWheel14 = this.cropInlineEditor.wheel;
                        Property property114 = View.TRANSLATION_Y;
                        float[] fArr117 = new float[2];
                        fArr117[c] = AndroidUtilities.dp(f);
                        fArr117[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(cropRotationWheel14, (Property<CropRotationWheel, Float>) property114, fArr117));
                        arrayList.add(ObjectAnimator.ofFloat(this.cropInlineEditor.buttonsLayout, (Property<FrameLayout, Float>) property113, 0.0f, 1.0f));
                        FrameLayout frameLayout16 = this.cropInlineEditor.buttonsLayout;
                        float[] fArr118 = new float[2];
                        fArr118[c] = AndroidUtilities.dp(f);
                        fArr118[1] = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout16, (Property<FrameLayout, Float>) property114, fArr118));
                        float[] fArr119 = new float[2];
                        fArr119[c] = this.cropInlineEditor.getAppearProgress();
                        fArr119[1] = 1.0f;
                        ValueAnimator valueAnimatorOfFloat8 = ValueAnimator.ofFloat(fArr119);
                        valueAnimatorOfFloat8.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                this.f$0.cropInlineEditor.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            }
                        });
                        arrayList.add(valueAnimatorOfFloat8);
                    } else if (i3 == 4) {
                        CropRotationWheel cropRotationWheel15 = cropInlineEditor.wheel;
                        Property property115 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(cropRotationWheel15, (Property<CropRotationWheel, Float>) property115, 1.0f, 0.0f));
                        CropRotationWheel cropRotationWheel16 = this.cropInlineEditor.wheel;
                        Property property116 = View.TRANSLATION_Y;
                        float fDp8 = AndroidUtilities.dp(f);
                        float[] fArr210 = new float[2];
                        fArr210[c] = 0.0f;
                        fArr210[1] = fDp8;
                        arrayList.add(ObjectAnimator.ofFloat(cropRotationWheel16, (Property<CropRotationWheel, Float>) property116, fArr210));
                        arrayList.add(ObjectAnimator.ofFloat(this.cropInlineEditor.buttonsLayout, (Property<FrameLayout, Float>) property115, 1.0f, 0.0f));
                        FrameLayout frameLayout17 = this.cropInlineEditor.buttonsLayout;
                        float fDp9 = AndroidUtilities.dp(f);
                        float[] fArr211 = new float[2];
                        fArr211[c] = 0.0f;
                        fArr211[1] = fDp9;
                        arrayList.add(ObjectAnimator.ofFloat(frameLayout17, (Property<FrameLayout, Float>) property116, fArr211));
                        float[] fArr212 = new float[2];
                        fArr212[c] = this.cropInlineEditor.getAppearProgress();
                        fArr212[1] = 0.0f;
                        ValueAnimator valueAnimatorOfFloat9 = ValueAnimator.ofFloat(fArr212);
                        valueAnimatorOfFloat9.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                this.f$0.cropInlineEditor.setAppearProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            }
                        });
                        arrayList.add(valueAnimatorOfFloat9);
                    }
                }
                RLottieImageView rLottieImageView3 = this.muteButton;
                property = View.ALPHA;
                float[] fArr213 = new float[1];
                fArr213[c] = ((i != -1 || i == 2) && this.mode == 1) ? 1.0f : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(rLottieImageView3, (Property<RLottieImageView, Float>) property, fArr213));
                PlayPauseButton playPauseButton3 = this.playButton;
                float[] fArr214 = new float[1];
                fArr214[c] = ((i != -1 || i == 2) && (this.mode == 1 || !((storyEntry = this.outputEntry) == null || TextUtils.isEmpty(storyEntry.audioPath)))) ? 1.0f : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(playPauseButton3, (Property<PlayPauseButton, Float>) property, fArr214));
                DownloadButton downloadButton3 = this.downloadButton;
                if (i != -1) {
                    f2 = 1.0f;
                } else {
                    f2 = 1.0f;
                }
                float[] fArr215 = new float[1];
                fArr215[c] = f2;
                arrayList.add(ObjectAnimator.ofFloat(downloadButton3, (Property<DownloadButton, Float>) property, fArr215));
                imageView = this.themeButton;
                if (imageView != null) {
                    float[] fArr216 = new float[1];
                    fArr216[c] = ((i != -1 || i == 2) && (storyEntry3 = this.outputEntry) != null && storyEntry3.isRepostMessage) ? 1.0f : 0.0f;
                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, fArr216));
                }
                SimpleTextView simpleTextView2 = this.titleTextView;
                int i5 = this.currentPage;
                float[] fArr217 = new float[1];
                fArr217[c] = ((i5 != 1 || i5 == 2) && i == -1) ? 1.0f : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(simpleTextView2, (Property<SimpleTextView, Float>) property, fArr217));
                if (i == 1) {
                    FrameLayout frameLayout18 = this.previewContainer;
                    frameLayout18.setPivotY(frameLayout18.getMeasuredHeight() * 0.2f);
                    contentHeight = AndroidUtilities.dp(164.0f);
                } else if (i == 0) {
                    FrameLayout frameLayout19 = this.previewContainer;
                    frameLayout19.setPivotY(frameLayout19.getMeasuredHeight() * 0.6f);
                    contentHeight = AndroidUtilities.dp(40.0f);
                } else if (i == 2) {
                    this.previewContainer.setPivotY(0.0f);
                    contentHeight = this.timelineView.getContentHeight() + AndroidUtilities.dp(8.0f);
                } else {
                    contentHeight = 0;
                }
                if (contentHeight > 0) {
                    int height2 = this.previewContainer.getHeight() - ((int) this.previewContainer.getPivotY());
                    f3 = (height2 - contentHeight) / height2;
                } else {
                    f3 = 1.0f;
                }
                FrameLayout frameLayout20 = this.previewContainer;
                Property property117 = View.SCALE_X;
                float[] fArr218 = new float[1];
                fArr218[c] = f3;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout20, (Property<FrameLayout, Float>) property117, fArr218));
                FrameLayout frameLayout21 = this.previewContainer;
                Property property118 = View.SCALE_Y;
                float[] fArr219 = new float[1];
                fArr219[c] = f3;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout21, (Property<FrameLayout, Float>) property118, fArr219));
                if (i == -1) {
                    FrameLayout frameLayout22 = this.previewContainer;
                    Property property119 = View.TRANSLATION_Y;
                    float[] fArr310 = new float[1];
                    fArr310[c] = 0.0f;
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout22, (Property<FrameLayout, Float>) property119, fArr310));
                }
                photoFilterCurvesControl = this.photoFilterViewCurvesControl;
                if (photoFilterCurvesControl != null) {
                    if (i == 1) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    float[] fArr311 = new float[1];
                    fArr311[c] = f11;
                    arrayList.add(ObjectAnimator.ofFloat(photoFilterCurvesControl, (Property<PhotoFilterCurvesControl, Float>) property, fArr311));
                }
                photoFilterBlurControl = this.photoFilterViewBlurControl;
                if (photoFilterBlurControl != null) {
                    if (i == 1) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    float[] fArr312 = new float[1];
                    fArr312[c] = f10;
                    arrayList.add(ObjectAnimator.ofFloat(photoFilterBlurControl, (Property<PhotoFilterBlurControl, Float>) property, fArr312));
                }
                CaptionStory captionStory3 = this.captionEdit;
                if (i == -1) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.0f;
                }
                float[] fArr313 = new float[1];
                fArr313[c] = f4;
                arrayList.add(ObjectAnimator.ofFloat(captionStory3, (Property<CaptionStory, Float>) property, fArr313));
                FrameLayout frameLayout110 = this.captionContainer;
                if (i != -1) {
                    f5 = 1.0f;
                } else {
                    f5 = 1.0f;
                }
                float[] fArr314 = new float[1];
                fArr314[c] = f5;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout110, (Property<FrameLayout, Float>) property, fArr314));
                FrameLayout frameLayout111 = this.captionContainer;
                Property property28 = View.TRANSLATION_Y;
                if (i != -1) {
                    fDp = 0.0f;
                } else {
                    fDp = 0.0f;
                }
                float[] fArr315 = new float[1];
                fArr315[c] = fDp;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout111, (Property<FrameLayout, Float>) property28, fArr315));
                FrameLayout frameLayout112 = this.videoTimelineContainerView;
                if (i != -1) {
                    f12 = 0.0f;
                }
                float[] fArr316 = new float[1];
                fArr316[c] = f12;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout112, (Property<FrameLayout, Float>) property, fArr316));
                FrameLayout frameLayout113 = this.videoTimelineContainerView;
                if (i == 2) {
                    iDp = AndroidUtilities.dp(68.0f);
                } else {
                    iDp = (-(this.captionEdit.getEditTextHeight() + AndroidUtilities.dp(12.0f))) + AndroidUtilities.dp(64.0f);
                }
                float[] fArr317 = new float[1];
                fArr317[c] = iDp;
                arrayList.add(ObjectAnimator.ofFloat(frameLayout113, (Property<FrameLayout, Float>) property28, fArr317));
                LinearLayout linearLayout3 = this.actionBarButtons;
                linearLayout3.setPivotX(linearLayout3.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                LinearLayout linearLayout4 = this.actionBarButtons;
                property2 = View.ROTATION;
                if (i == 2) {
                    f6 = -90.0f;
                } else {
                    f6 = 0.0f;
                }
                float[] fArr318 = new float[1];
                fArr318[c] = f6;
                arrayList.add(ObjectAnimator.ofFloat(linearLayout4, (Property<LinearLayout, Float>) property2, fArr318));
                PlayPauseButton playPauseButton4 = this.playButton;
                if (i == 2) {
                    f7 = 90.0f;
                } else {
                    f7 = 0.0f;
                }
                float[] fArr319 = new float[1];
                fArr319[c] = f7;
                arrayList.add(ObjectAnimator.ofFloat(playPauseButton4, (Property<PlayPauseButton, Float>) property2, fArr319));
                RLottieImageView rLottieImageView4 = this.muteButton;
                if (i == 2) {
                    f8 = 90.0f;
                } else {
                    f8 = 0.0f;
                }
                float[] fArr410 = new float[1];
                fArr410[c] = f8;
                arrayList.add(ObjectAnimator.ofFloat(rLottieImageView4, (Property<RLottieImageView, Float>) property2, fArr410));
                DownloadButton downloadButton4 = this.downloadButton;
                if (i == 2) {
                    f9 = 90.0f;
                } else {
                    f9 = 0.0f;
                }
                float[] fArr411 = new float[1];
                fArr411[c] = f9;
                arrayList.add(ObjectAnimator.ofFloat(downloadButton4, (Property<DownloadButton, Float>) property2, fArr411));
                imageView2 = this.themeButton;
                if (imageView2 != null) {
                    float[] fArr412 = new float[1];
                    fArr412[c] = i == 2 ? 90.0f : 0.0f;
                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, fArr412));
                }
                if (this.blurManager.hasRenderNode()) {
                    ValueAnimator valueAnimatorOfFloat10 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            StoryRecorder.this.captionEdit.invalidateBlur();
                        }
                    });
                    arrayList.add(valueAnimatorOfFloat10);
                }
                timelineView = this.timelineView;
                if (timelineView != null) {
                    storyEntry2 = this.outputEntry;
                    if (storyEntry2 == null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    timelineView.setOpen(z3, z2);
                }
                if (z2) {
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    this.editModeAnimator = animatorSet3;
                    animatorSet3.playTogether(arrayList);
                    this.editModeAnimator.setDuration(320L);
                    this.editModeAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    this.editModeAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator2) {
                            int i6 = i3;
                            int i7 = i;
                            if (i6 != i7) {
                                StoryRecorder.this.onSwitchEditModeEnd(i6, i7);
                            }
                        }
                    });
                    if (z4) {
                        this.editModeAnimator.setStartDelay(120L);
                    }
                    this.editModeAnimator.start();
                    return;
                }
                while (i2 < arrayList.size()) {
                    Animator animator2 = (Animator) arrayList.get(i2);
                    animator2.setDuration(1L);
                    animator2.start();
                }
                if (i3 != i) {
                    onSwitchEditModeEnd(i3, i);
                }
            }
        }
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
    }

    public void createPhotoPaintView() {
        Bitmap bitmapCreateBitmap;
        StoryEntry storyEntry;
        boolean z;
        Object obj;
        boolean z2;
        boolean z3;
        boolean z4;
        StoryEntry storyEntry2;
        boolean z5;
        RenderView renderView;
        View renderInputView;
        View textDimView;
        View entitiesView;
        View selectionEntitiesView;
        File file;
        File file2;
        if (this.paintView != null) {
            return;
        }
        Pair<Integer, Integer> paintSize = this.previewView.getPaintSize();
        StoryEntry storyEntry3 = this.outputEntry;
        Bitmap bitmapDecodeFile = (storyEntry3 == null || !(storyEntry3.isDraft || storyEntry3.isEdit || this.entries != null) || (file2 = storyEntry3.paintFile) == null) ? null : BitmapFactory.decodeFile(file2.getPath());
        if (bitmapDecodeFile == null) {
            bitmapDecodeFile = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap = bitmapDecodeFile;
        StoryEntry storyEntry4 = this.outputEntry;
        if (storyEntry4 != null && ((storyEntry4.isDraft || storyEntry4.isEdit || this.entries != null) && (file = storyEntry4.paintBlurFile) != null)) {
            bitmapCreateBitmap = BitmapFactory.decodeFile(file.getPath());
            boolean z6 = bitmapCreateBitmap != null;
            if (bitmapCreateBitmap == null) {
                bitmapCreateBitmap = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
            }
            Bitmap bitmap2 = bitmapCreateBitmap;
            int measuredWidth = this.previewContainer.getMeasuredWidth();
            int measuredHeight = this.previewContainer.getMeasuredHeight();
            Activity activity = this.activity;
            storyEntry = this.outputEntry;
            if (storyEntry != null || storyEntry.fileDeletable) {
                z = false;
            } else {
                z = true;
            }
            if (storyEntry == null) {
                obj = r3;
            } else {
                obj = storyEntry.file;
            }
            if (storyEntry == null && storyEntry.isVideo) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (storyEntry != null || storyEntry.botId == 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            z4 = z6;
            ?? r4 = obj;
            WindowView windowView = this.windowView;
            int i = this.currentAccount;
            int orientation = this.previewView.getOrientation();
            StoryEntry storyEntry5 = this.outputEntry;
            AnonymousClass24 anonymousClass24 = new AnonymousClass24(activity, z, r4, z2, z3, windowView, activity, i, bitmap, bitmap2, null, orientation, storyEntry5 != null ? storyEntry5.mediaEntities : null, storyEntry5, measuredWidth, measuredHeight, new MediaController.CropState(), null, this.blurManager, this.resourcesProvider, this.videoTextureHolder, this.previewView);
            this.paintView = anonymousClass24;
            storyEntry2 = this.outputEntry;
            if (storyEntry2 != null || storyEntry2.audioPath == null) {
                z5 = false;
            } else {
                z5 = true;
            }
            anonymousClass24.setHasAudio(z5);
            this.paintView.setBlurManager(this.blurManager);
            this.containerView.addView(this.paintView);
            renderView = this.paintView.getRenderView();
            this.paintViewRenderView = renderView;
            if (renderView != null) {
                renderView.getPainting().hasBlur = z4;
                this.previewContainer.addView(this.paintViewRenderView);
            }
            renderInputView = this.paintView.getRenderInputView();
            this.paintViewRenderInputView = renderInputView;
            if (renderInputView != null) {
                this.previewContainer.addView(renderInputView);
            }
            textDimView = this.paintView.getTextDimView();
            this.paintViewTextDim = textDimView;
            if (textDimView != null) {
                this.previewContainer.addView(textDimView);
            }
            entitiesView = this.paintView.getEntitiesView();
            this.paintViewEntitiesView = entitiesView;
            if (entitiesView != null) {
                this.previewContainer.addView(entitiesView);
            }
            selectionEntitiesView = this.paintView.getSelectionEntitiesView();
            this.paintViewSelectionContainerView = selectionEntitiesView;
            if (selectionEntitiesView != null) {
                this.previewContainer.addView(selectionEntitiesView);
            }
            orderPreviewViews();
            this.paintView.setOnDoneButtonClickedListener(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.switchToEditMode(-1, true);
                }
            });
            this.paintView.setOnCancelButtonClickedListener(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.switchToEditMode(-1, true);
                }
            });
            this.paintView.init();
        }
        bitmapCreateBitmap = null;
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap3 = bitmapCreateBitmap;
        int measuredWidth2 = this.previewContainer.getMeasuredWidth();
        int measuredHeight2 = this.previewContainer.getMeasuredHeight();
        Activity activity2 = this.activity;
        storyEntry = this.outputEntry;
        if (storyEntry != null) {
            z = false;
        } else {
            z = false;
        }
        if (storyEntry == null) {
            obj = r3;
        } else {
            obj = storyEntry.file;
        }
        if (storyEntry == null) {
            z2 = false;
        } else {
            z2 = false;
        }
        if (storyEntry != null) {
            z3 = false;
        } else {
            z3 = false;
        }
        z4 = z6;
        ?? r5 = obj;
        WindowView windowView2 = this.windowView;
        int i2 = this.currentAccount;
        int orientation2 = this.previewView.getOrientation();
        StoryEntry storyEntry6 = this.outputEntry;
        AnonymousClass24 anonymousClass25 = new AnonymousClass24(activity2, z, r5, z2, z3, windowView2, activity2, i2, bitmap, bitmap3, null, orientation2, storyEntry6 != null ? storyEntry6.mediaEntities : null, storyEntry6, measuredWidth2, measuredHeight2, new MediaController.CropState(), null, this.blurManager, this.resourcesProvider, this.videoTextureHolder, this.previewView);
        this.paintView = anonymousClass25;
        storyEntry2 = this.outputEntry;
        if (storyEntry2 != null) {
            z5 = false;
        } else {
            z5 = false;
        }
        anonymousClass25.setHasAudio(z5);
        this.paintView.setBlurManager(this.blurManager);
        this.containerView.addView(this.paintView);
        renderView = this.paintView.getRenderView();
        this.paintViewRenderView = renderView;
        if (renderView != null) {
            renderView.getPainting().hasBlur = z4;
            this.previewContainer.addView(this.paintViewRenderView);
        }
        renderInputView = this.paintView.getRenderInputView();
        this.paintViewRenderInputView = renderInputView;
        if (renderInputView != null) {
            this.previewContainer.addView(renderInputView);
        }
        textDimView = this.paintView.getTextDimView();
        this.paintViewTextDim = textDimView;
        if (textDimView != null) {
            this.previewContainer.addView(textDimView);
        }
        entitiesView = this.paintView.getEntitiesView();
        this.paintViewEntitiesView = entitiesView;
        if (entitiesView != null) {
            this.previewContainer.addView(entitiesView);
        }
        selectionEntitiesView = this.paintView.getSelectionEntitiesView();
        this.paintViewSelectionContainerView = selectionEntitiesView;
        if (selectionEntitiesView != null) {
            this.previewContainer.addView(selectionEntitiesView);
        }
        orderPreviewViews();
        this.paintView.setOnDoneButtonClickedListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.switchToEditMode(-1, true);
            }
        });
        this.paintView.setOnCancelButtonClickedListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.switchToEditMode(-1, true);
            }
        });
        this.paintView.init();
    }

    class AnonymousClass24 extends PaintView {
        private boolean multitouch;

        public static void m4655$r8$lambda$YkfwDNzmVRzurNJKj5M81lU0R8() {
        }

        AnonymousClass24(Context context, boolean z, File file, boolean z2, boolean z3, WindowView windowView, Activity activity, int i, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i2, ArrayList arrayList, StoryEntry storyEntry, int i3, int i4, MediaController.CropState cropState, Runnable runnable, BlurringShader.BlurManager blurManager, Theme.ResourcesProvider resourcesProvider, PreviewView.TextureViewHolder textureViewHolder, PreviewView previewView) {
            super(context, z, file, z2, z3, windowView, activity, i, bitmap, bitmap2, bitmap3, i2, arrayList, storyEntry, i3, i4, cropState, runnable, blurManager, resourcesProvider, textureViewHolder, previewView);
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
            StoryRecorder.this.animateGalleryListView(true);
        }

        @Override
        public void onEntityDraggedBottom(boolean z) {
            StoryRecorder.this.previewHighlight.updateCaption(StoryRecorder.this.captionEdit.getText());
            StoryRecorder.this.previewHighlight.show(false, z && this.multitouch, null);
        }

        @Override
        public void onEntityDragEnd(boolean z) {
            if (!isEntityDeletable()) {
                z = false;
            }
            StoryRecorder.this.captionEdit.clearAnimation();
            ViewPropertyAnimator duration = StoryRecorder.this.captionEdit.animate().alpha(StoryRecorder.this.currentEditMode == -1 ? 1.0f : 0.0f).setDuration(180L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            StoryRecorder.this.videoTimelineContainerView.clearAnimation();
            StoryRecorder.this.videoTimelineContainerView.animate().alpha((StoryRecorder.this.currentEditMode == -1 || StoryRecorder.this.currentEditMode == 2) ? 1.0f : 0.0f).setDuration(180L).setInterpolator(cubicBezierInterpolator).start();
            showTrash(false, z);
            if (z) {
                removeCurrentEntity();
            }
            super.onEntityDragEnd(z);
            this.multitouch = false;
        }

        @Override
        public void onEntityDragStart() {
            StoryRecorder.this.paintView.showReactionsLayout(false);
            StoryRecorder.this.captionEdit.clearAnimation();
            ViewPropertyAnimator duration = StoryRecorder.this.captionEdit.animate().alpha(0.0f).setDuration(180L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            if (StoryRecorder.this.currentEditMode != 2) {
                StoryRecorder.this.videoTimelineContainerView.clearAnimation();
                StoryRecorder.this.videoTimelineContainerView.animate().alpha(0.0f).setDuration(180L).setInterpolator(cubicBezierInterpolator).start();
            }
            showTrash(isEntityDeletable(), false);
        }

        public void showTrash(boolean z, boolean z2) {
            if (z) {
                StoryRecorder.this.trash.setVisibility(0);
                StoryRecorder.this.trash.setAlpha(0.0f);
                StoryRecorder.this.trash.clearAnimation();
                StoryRecorder.this.trash.animate().alpha(1.0f).setDuration(180L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
                return;
            }
            StoryRecorder.this.trash.onDragInfo(false, z2);
            StoryRecorder.this.trash.clearAnimation();
            StoryRecorder.this.trash.animate().alpha(0.0f).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.this.trash.setVisibility(8);
                }
            }).setDuration(180L).setInterpolator(CubicBezierInterpolator.EASE_OUT).setStartDelay(z2 ? 500L : 0L).start();
        }

        @Override
        public void onEntityDragMultitouchStart() {
            this.multitouch = true;
            StoryRecorder.this.paintView.showReactionsLayout(false);
            showTrash(false, false);
        }

        @Override
        public void onEntityDragMultitouchEnd() {
            this.multitouch = false;
            showTrash(isEntityDeletable(), false);
            StoryRecorder.this.previewHighlight.show(false, false, null);
        }

        @Override
        public void onEntityDragTrash(boolean z) {
            StoryRecorder.this.trash.onDragInfo(z, false);
        }

        @Override
        protected void editSelectedTextEntity() {
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
        protected void onAudioSelect(MessageObject messageObject) {
            StoryRecorder.this.previewView.setupAudio(messageObject, true);
            if (StoryRecorder.this.outputEntry != null && StoryRecorder.this.mode != 1) {
                boolean zIsEmpty = TextUtils.isEmpty(StoryRecorder.this.outputEntry.audioPath);
                final boolean z = !zIsEmpty;
                StoryRecorder.this.playButton.drawable.setPause(!StoryRecorder.this.previewView.isPlaying(), false);
                StoryRecorder.this.playButton.setVisibility(0);
                StoryRecorder.this.playButton.animate().alpha(!zIsEmpty ? 1.0f : 0.0f).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.AnonymousClass24.$r8$lambda$5oi_5HQrpjrxa2n0i4ZZ_BqN9MM(this.f$0, z);
                    }
                }).start();
            }
            StoryRecorder storyRecorder = StoryRecorder.this;
            storyRecorder.switchToEditMode((storyRecorder.collageLayoutView.hasLayout() && StoryRecorder.this.collageLayoutView.hasVideo() && !TextUtils.isEmpty(StoryRecorder.this.outputEntry.audioPath)) ? 2 : -1, true, true);
        }

        public static void $r8$lambda$5oi_5HQrpjrxa2n0i4ZZ_BqN9MM(AnonymousClass24 anonymousClass24, boolean z) {
            if (z) {
                anonymousClass24.getClass();
            } else {
                StoryRecorder.this.playButton.setVisibility(8);
            }
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
        public void onTryDeleteRound() {
            if (StoryRecorder.this.captionEdit != null) {
                StoryRecorder.this.captionEdit.showRemoveRoundAlert();
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
                float fSqrt = (float) Math.sqrt((f3 * f3) + (f4 * f4));
                float f5 = fSqrt * 2.0f;
                int i = (int) f5;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.save();
                canvas.rotate(photoView.getRotation(), fSqrt, fSqrt);
                canvas.drawBitmap(segmentedOutBitmap, (f5 - width2) / 2.0f, (f5 - height2) / 2.0f, (Paint) null);
                segmentedOutBitmap.recycle();
                float f6 = width / 2.0f;
                float f7 = height / 2.0f;
                float fSqrt2 = ((float) Math.sqrt((f6 * f6) + (f7 * f7))) * 2.0f;
                f2 = (-(fSqrt2 - width)) / 2.0f;
                float f8 = (-(fSqrt2 - height)) / 2.0f;
                height = fSqrt2;
                f = f8;
                width = height;
                segmentedOutBitmap = bitmapCreateBitmap;
            } else {
                f = 0.0f;
            }
            matrix.postScale(width, height);
            matrix.postScale(photoView.getScaleX(), photoView.getScaleY(), width / 2.0f, height / 2.0f);
            matrix.postTranslate(StoryRecorder.this.containerView.getX() + StoryRecorder.this.previewContainer.getX() + photoView.getX() + f2, StoryRecorder.this.containerView.getY() + StoryRecorder.this.previewContainer.getY() + photoView.getY() + f);
            thanosEffect.animate(matrix, segmentedOutBitmap, new Runnable() {
                @Override
                public final void run() {
                    photoView.onSwitchSegmentedAnimationStarted(true);
                }
            }, new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.AnonymousClass24.m4655$r8$lambda$YkfwDNzmVRzurNJKj5M81lU0R8();
                }
            });
        }

        @Override
        public void onSelectRound(RoundView roundView) {
            if (StoryRecorder.this.timelineView != null) {
                StoryRecorder.this.timelineView.selectRound(true);
            }
        }

        @Override
        public void onDeselectRound(RoundView roundView) {
            if (StoryRecorder.this.timelineView != null) {
                StoryRecorder.this.timelineView.selectRound(false);
            }
        }
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

    private boolean isBot() {
        StoryEntry storyEntry = this.outputEntry;
        return ((storyEntry == null || storyEntry.botId == 0) && this.botId == 0) ? false : true;
    }

    private void onSwitchEditModeStart(int i, int i2) {
        PaintView paintView;
        PaintView paintView2;
        if (i2 == -1) {
            this.backButton.setVisibility(0);
            this.captionEdit.setVisibility(0);
            PaintView paintView3 = this.paintView;
            if (paintView3 != null) {
                paintView3.clearSelection();
            }
            this.downloadButton.setVisibility(0);
            StoryEntry storyEntry = this.outputEntry;
            if (storyEntry != null && storyEntry.isRepostMessage) {
                getThemeButton().setVisibility(0);
                updateThemeButtonDrawable(false);
            } else {
                ImageView imageView = this.themeButton;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            }
            this.titleTextView.setVisibility(0);
            if (this.mode == 1) {
                this.muteButton.setVisibility(0);
                this.playButton.setVisibility(0);
            } else {
                StoryEntry storyEntry2 = this.outputEntry;
                if (storyEntry2 != null && !TextUtils.isEmpty(storyEntry2.audioPath)) {
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
        if (i2 == 3) {
            createCropEditor();
            this.cropEditor.setVisibility(0);
            StoryEntry storyEntry3 = this.outputEntry;
            if (storyEntry3 != null) {
                this.cropEditor.setEntry(storyEntry3);
            }
        } else if (i == 3) {
            this.previewView.applyMatrix();
            CropEditor cropEditor = this.cropEditor;
            if (cropEditor != null) {
                cropEditor.disappearStarts();
            }
        }
        if (i2 == 4) {
            createCropInlineEditor();
            this.cropInlineEditor.setVisibility(0);
        } else if (i == 4) {
            this.previewView.applyMatrix();
            CropInlineEditor cropInlineEditor = this.cropInlineEditor;
            if (cropInlineEditor != null) {
                cropInlineEditor.disappearStarts();
            }
        }
    }

    public void onSwitchEditModeEnd(int i, int i2) {
        PaintView paintView;
        CropEditor cropEditor;
        CropInlineEditor cropInlineEditor;
        PaintView paintView2;
        if (i2 == 0) {
            this.backButton.setVisibility(8);
        }
        if (i == 0 && (paintView2 = this.paintView) != null) {
            paintView2.setVisibility(8);
        }
        if (i == -1) {
            this.captionEdit.setVisibility(8);
            this.muteButton.setVisibility(i2 == 2 ? 0 : 8);
            this.playButton.setVisibility(i2 == 2 ? 0 : 8);
            this.downloadButton.setVisibility(i2 == 2 ? 0 : 8);
            ImageView imageView = this.themeButton;
            if (imageView != null) {
                imageView.setVisibility(i2 == 2 ? 0 : 8);
            }
            this.timelineView.setVisibility(i2 == 2 ? 0 : 8);
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
        if (i2 == 3) {
            CropEditor cropEditor2 = this.cropEditor;
            if (cropEditor2 != null) {
                cropEditor2.setAppearProgress(1.0f);
            }
        } else if (i == 3 && (cropEditor = this.cropEditor) != null) {
            cropEditor.setVisibility(8);
            this.cropEditor.setAppearProgress(0.0f);
            this.cropEditor.stop();
        }
        if (i2 == 4) {
            CropInlineEditor cropInlineEditor2 = this.cropInlineEditor;
            if (cropInlineEditor2 != null) {
                cropInlineEditor2.setAppearProgress(1.0f);
                return;
            }
            return;
        }
        if (i != 4 || (cropInlineEditor = this.cropInlineEditor) == null) {
            return;
        }
        cropInlineEditor.setVisibility(8);
        this.cropInlineEditor.setAppearProgress(0.0f);
        this.cropInlineEditor.stop();
    }

    private void applyPaintInBackground(final Runnable runnable) {
        final PaintView paintView = this.paintView;
        final StoryEntry storyEntry = this.outputEntry;
        if (paintView == null || storyEntry == null) {
            runnable.run();
            return;
        }
        storyEntry.clearPaint();
        final boolean zHasChanges = paintView.hasChanges();
        final boolean zHasBlur = paintView.hasBlur();
        final int i = storyEntry.resultWidth;
        final int i2 = storyEntry.resultHeight;
        Utilities.searchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.m4627$r8$lambda$FX4KzrsWO34OSTmUOv9ptI6K6I(this.f$0, paintView, i, i2, storyEntry, zHasBlur, zHasChanges, runnable);
            }
        });
    }

    public static void m4627$r8$lambda$FX4KzrsWO34OSTmUOv9ptI6K6I(StoryRecorder storyRecorder, PaintView paintView, int i, int i2, final StoryEntry storyEntry, boolean z, final boolean z2, final Runnable runnable) {
        File file;
        File fileMakeCacheFile;
        int i3;
        int i4;
        final File file2;
        final File file3;
        storyRecorder.getClass();
        ArrayList arrayList = new ArrayList();
        paintView.getBitmap(arrayList, i, i2, false, false, false, false, storyEntry);
        if (!storyEntry.isVideo) {
            storyEntry.averageDuration = Utilities.clamp(paintView.getLcm(), 7500L, 5000L);
        }
        List<TLRPC.InputDocument> masks = paintView.getMasks();
        ArrayList arrayList2 = masks != null ? new ArrayList(masks) : null;
        boolean z3 = storyEntry.isVideo;
        boolean zWouldBeVideo = storyEntry.wouldBeVideo();
        arrayList.clear();
        Bitmap bitmap = paintView.getBitmap(arrayList, i, i2, true, false, false, !z3, storyEntry);
        ArrayList arrayList3 = arrayList.isEmpty() ? null : arrayList;
        final File pathToAttach = FileLoader.getInstance(storyRecorder.currentAccount).getPathToAttach(ImageLoader.scaleAndSaveImage(bitmap, Bitmap.CompressFormat.PNG, storyEntry.resultWidth, storyEntry.resultHeight, 87, false, 101, 101), true);
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        if (storyEntry.isRepostMessage) {
            long j = storyEntry.backgroundWallpaperPeerId;
            if (j == Long.MIN_VALUE) {
                file = null;
            } else {
                Drawable backgroundDrawable = storyEntry.backgroundDrawable;
                if (backgroundDrawable == null) {
                    backgroundDrawable = PreviewView.getBackgroundDrawable((Drawable) null, storyRecorder.currentAccount, j, storyRecorder.isDark);
                }
                if (backgroundDrawable != null) {
                    File fileMakeCacheFile2 = StoryEntry.makeCacheFile(storyRecorder.currentAccount, "webp");
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                    StoryEntry.drawBackgroundDrawable(new Canvas(bitmapCreateBitmap), backgroundDrawable, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                    try {
                        try {
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(fileMakeCacheFile2));
                            if (!bitmapCreateBitmap.isRecycled()) {
                                bitmapCreateBitmap.recycle();
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                            if (!bitmapCreateBitmap.isRecycled()) {
                                bitmapCreateBitmap.recycle();
                            }
                        }
                        file = fileMakeCacheFile2;
                    } catch (Throwable th) {
                        if (!bitmapCreateBitmap.isRecycled()) {
                            bitmapCreateBitmap.recycle();
                        }
                        throw th;
                    }
                } else {
                    file = null;
                }
            }
        } else {
            file = null;
        }
        if (storyEntry.isRepostMessage && storyEntry.isVideo) {
            int i5 = storyEntry.width;
            int i6 = storyEntry.height;
            MessageEntityView messageEntityViewFindMessageView = paintView.findMessageView();
            ImageReceiver photoImage = (messageEntityViewFindMessageView == null || messageEntityViewFindMessageView.listView.getChildCount() != 1 || i5 <= 0 || i6 <= 0 || !(messageEntityViewFindMessageView.listView.getChildAt(0) instanceof ChatMessageCell)) ? null : ((ChatMessageCell) messageEntityViewFindMessageView.listView.getChildAt(0)).getPhotoImage();
            if (photoImage == null || ((int) photoImage.getImageWidth()) <= 0 || ((int) photoImage.getImageHeight()) <= 0) {
                fileMakeCacheFile = null;
            } else {
                float f = i5;
                float f2 = i6;
                float fMax = Math.max(photoImage.getImageWidth() / f, photoImage.getImageHeight() / f2);
                int i7 = (int) ((f * fMax) / 2.0f);
                int i8 = (int) ((f2 * fMax) / 2.0f);
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                float[] fArr = new float[8];
                for (int i9 = 0; i9 < photoImage.getRoundRadius().length; i9++) {
                    int i10 = i9 * 2;
                    fArr[i10] = photoImage.getRoundRadius()[i9];
                    fArr[i10 + 1] = photoImage.getRoundRadius()[i9];
                }
                Canvas canvas = new Canvas(bitmapCreateBitmap2);
                Path path = new Path();
                canvas.scale(0.5f, 0.5f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f3 = (i7 * 2.0f) / 2.0f;
                float f4 = (i8 * 2.0f) / 2.0f;
                rectF.set(f3 - (photoImage.getImageWidth() / 2.0f), f4 - (photoImage.getImageHeight() / 2.0f), f3 + (photoImage.getImageWidth() / 2.0f), f4 + (photoImage.getImageHeight() / 2.0f));
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                Paint paint = new Paint(1);
                paint.setColor(-1);
                canvas.drawPath(path, paint);
                try {
                    fileMakeCacheFile = StoryEntry.makeCacheFile(storyRecorder.currentAccount, "webp");
                    bitmapCreateBitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(fileMakeCacheFile));
                } catch (Exception e2) {
                    FileLog.e(e2);
                    fileMakeCacheFile = null;
                }
                bitmapCreateBitmap2.recycle();
            }
        } else {
            fileMakeCacheFile = null;
        }
        if (zWouldBeVideo) {
            i3 = i;
            i4 = i2;
            file2 = null;
        } else {
            i3 = i;
            i4 = i2;
            Bitmap bitmap2 = paintView.getBitmap(new ArrayList(), i3, i4, false, true, false, false, storyEntry);
            File pathToAttach2 = FileLoader.getInstance(storyRecorder.currentAccount).getPathToAttach(ImageLoader.scaleAndSaveImage(bitmap2, Bitmap.CompressFormat.PNG, i3, i4, 87, false, 101, 101), true);
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bitmap2.recycle();
            }
            file2 = pathToAttach2;
        }
        if (z) {
            Bitmap blurBitmap = paintView.getBlurBitmap();
            File pathToAttach3 = FileLoader.getInstance(storyRecorder.currentAccount).getPathToAttach(ImageLoader.scaleAndSaveImage(blurBitmap, Bitmap.CompressFormat.PNG, i3, i4, 87, false, 101, 101), true);
            if (blurBitmap != null && !blurBitmap.isRecycled()) {
                blurBitmap.recycle();
            }
            file3 = pathToAttach3;
        } else {
            file3 = null;
        }
        final File file4 = fileMakeCacheFile;
        final ArrayList arrayList4 = arrayList2;
        final File file5 = file;
        final ArrayList arrayList5 = arrayList3;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.m4623$r8$lambda$BP00od4hhBfvZVRQj5SPCSf4c(storyEntry, z2, arrayList5, pathToAttach, file5, file2, file4, file3, arrayList4, runnable);
            }
        });
    }

    public static void m4623$r8$lambda$BP00od4hhBfvZVRQj5SPCSf4c(StoryEntry storyEntry, boolean z, ArrayList arrayList, File file, File file2, File file3, File file4, File file5, List list, Runnable runnable) {
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

    private void applyPaintSwitching(final Runnable runnable) {
        final PaintView paintView = this.paintView;
        final StoryEntry storyEntry = this.outputEntry;
        if (paintView == null || storyEntry == null) {
            runnable.run();
            return;
        }
        if (!paintView.hasChanges()) {
            runnable.run();
            return;
        }
        storyEntry.clearPaint();
        final boolean zHasChanges = paintView.hasChanges();
        final boolean zHasBlur = paintView.hasBlur();
        final int i = storyEntry.resultWidth;
        final int i2 = storyEntry.resultHeight;
        Utilities.searchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.$r8$lambda$CHrmqbPsDMLMgHFXrPh6wg0ELwM(this.f$0, paintView, i, i2, storyEntry, zHasBlur, zHasChanges, runnable);
            }
        });
    }

    public static void $r8$lambda$CHrmqbPsDMLMgHFXrPh6wg0ELwM(StoryRecorder storyRecorder, PaintView paintView, int i, int i2, StoryEntry storyEntry, boolean z, final boolean z2, final Runnable runnable) {
        File file;
        File file2;
        StoryEntry storyEntry2;
        final File fileMakeCacheFile;
        final File fileMakeCacheFile2;
        final File file3;
        final File file4;
        int size;
        int i3;
        String str;
        ImageReceiver photoImage;
        storyRecorder.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        paintView.getBitmap(arrayList2, i, i2, false, false, false, false, storyEntry);
        if (!storyEntry.isVideo) {
            storyEntry.averageDuration = Utilities.clamp(paintView.getLcm(), 7500L, 5000L);
        }
        List<TLRPC.InputDocument> masks = paintView.getMasks();
        ArrayList arrayList3 = masks != null ? new ArrayList(masks) : null;
        boolean z3 = storyEntry.isVideo;
        boolean zWouldBeVideo = storyEntry.wouldBeVideo();
        arrayList2.clear();
        final Bitmap bitmap = paintView.getBitmap(arrayList2, i, i2, true, false, false, !z3, storyEntry);
        ArrayList arrayList4 = arrayList2.isEmpty() ? null : arrayList2;
        final File fileMakeCacheFile3 = StoryEntry.makeCacheFile(storyRecorder.currentAccount, "png");
        arrayList.add(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.$r8$lambda$layLMPzZu4ISw5ym5LQH0HHr4GM(bitmap, fileMakeCacheFile3);
            }
        });
        if (storyEntry.isRepostMessage) {
            long j = storyEntry.backgroundWallpaperPeerId;
            if (j == Long.MIN_VALUE) {
                file = null;
            } else {
                Drawable backgroundDrawable = storyEntry.backgroundDrawable;
                if (backgroundDrawable == null) {
                    backgroundDrawable = PreviewView.getBackgroundDrawable((Drawable) null, storyRecorder.currentAccount, j, storyRecorder.isDark);
                }
                if (backgroundDrawable != null) {
                    final File fileMakeCacheFile4 = StoryEntry.makeCacheFile(storyRecorder.currentAccount, "webp");
                    final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                    StoryEntry.drawBackgroundDrawable(new Canvas(bitmapCreateBitmap), backgroundDrawable, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                    arrayList.add(new Runnable() {
                        @Override
                        public final void run() {
                            StoryRecorder.m4630$r8$lambda$OeCh5EypcPyWasG24bNEAo8MUM(bitmapCreateBitmap, fileMakeCacheFile4);
                        }
                    });
                    file = fileMakeCacheFile4;
                } else {
                    file = null;
                }
            }
        } else {
            file = null;
        }
        if (storyEntry.isRepostMessage && storyEntry.isVideo) {
            int i4 = storyEntry.width;
            int i5 = storyEntry.height;
            MessageEntityView messageEntityViewFindMessageView = paintView.findMessageView();
            if (messageEntityViewFindMessageView != null && messageEntityViewFindMessageView.listView.getChildCount() == 1 && i4 > 0 && i5 > 0) {
                photoImage = messageEntityViewFindMessageView.listView.getChildAt(0) instanceof ChatMessageCell ? ((ChatMessageCell) messageEntityViewFindMessageView.listView.getChildAt(0)).getPhotoImage() : null;
                if (photoImage != null || ((int) photoImage.getImageWidth()) <= 0 || ((int) photoImage.getImageHeight()) <= 0) {
                    file2 = null;
                } else {
                    float f = i4;
                    float f2 = i5;
                    float fMax = Math.max(photoImage.getImageWidth() / f, photoImage.getImageHeight() / f2);
                    int i6 = (int) ((f * fMax) / 2.0f);
                    int i7 = (int) ((f2 * fMax) / 2.0f);
                    final Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i6, i7, Bitmap.Config.ARGB_8888);
                    float[] fArr = new float[8];
                    ImageReceiver imageReceiver = photoImage;
                    int i8 = 0;
                    while (i8 < imageReceiver.getRoundRadius().length) {
                        int i9 = i8 * 2;
                        int i10 = i8;
                        fArr[i9] = imageReceiver.getRoundRadius()[i10];
                        fArr[i9 + 1] = imageReceiver.getRoundRadius()[i10];
                        i8 = i10 + 1;
                    }
                    Canvas canvas = new Canvas(bitmapCreateBitmap2);
                    Path path = new Path();
                    canvas.scale(0.5f, 0.5f);
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f3 = (i6 * 2.0f) / 2.0f;
                    float f4 = (i7 * 2.0f) / 2.0f;
                    rectF.set(f3 - (imageReceiver.getImageWidth() / 2.0f), f4 - (imageReceiver.getImageHeight() / 2.0f), f3 + (imageReceiver.getImageWidth() / 2.0f), f4 + (imageReceiver.getImageHeight() / 2.0f));
                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                    Paint paint = new Paint(1);
                    paint.setColor(-1);
                    canvas.drawPath(path, paint);
                    final File fileMakeCacheFile5 = StoryEntry.makeCacheFile(storyRecorder.currentAccount, "webp");
                    arrayList.add(new Runnable() {
                        @Override
                        public final void run() {
                            StoryRecorder.m4641$r8$lambda$iHPC2nUP7ABMHUWxAlpcDaD4bg(bitmapCreateBitmap2, fileMakeCacheFile5);
                        }
                    });
                    file2 = fileMakeCacheFile5;
                }
            }
            if (photoImage != null) {
                file2 = null;
            } else {
                file2 = null;
            }
        } else {
            file2 = null;
        }
        if (!paintView.hasChanges()) {
            storyEntry2 = storyEntry;
            fileMakeCacheFile = storyEntry2.paintEntitiesFile;
            fileMakeCacheFile2 = storyEntry2.paintBlurFile;
        } else {
            if (zWouldBeVideo) {
                storyEntry2 = storyEntry;
                str = r2;
                fileMakeCacheFile = null;
            } else {
                storyEntry2 = storyEntry;
                str = "png";
                final Bitmap bitmap2 = paintView.getBitmap(new ArrayList(), i, i2, false, true, false, false, storyEntry2);
                fileMakeCacheFile = StoryEntry.makeCacheFile(storyRecorder.currentAccount, str);
                arrayList.add(new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.$r8$lambda$kpS36TI9lhC7HJol_gzW2lkVCyY(bitmap2, fileMakeCacheFile);
                    }
                });
            }
            if (z) {
                final Bitmap blurBitmap = paintView.getBlurBitmap();
                fileMakeCacheFile2 = StoryEntry.makeCacheFile(storyRecorder.currentAccount, str);
                arrayList.add(new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.$r8$lambda$p1EnWTor5yK7OeqRAHiXSX8JJ7M(blurBitmap, fileMakeCacheFile2);
                    }
                });
            } else {
                file4 = fileMakeCacheFile;
                file3 = null;
            }
            final StoryEntry storyEntry3 = storyEntry2;
            final File file5 = file;
            final ArrayList arrayList5 = arrayList3;
            final File file6 = file2;
            final ArrayList arrayList6 = arrayList4;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.m4615$r8$lambda$0Gqp1xfutrIgoLPIM68QKcXADI(storyEntry3, z2, arrayList6, fileMakeCacheFile3, file5, file4, file6, file3, arrayList5, runnable);
                }
            });
            size = arrayList.size();
            i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((Runnable) obj).run();
            }
        }
        file3 = fileMakeCacheFile2;
        file4 = fileMakeCacheFile;
        final StoryEntry storyEntry4 = storyEntry2;
        final File file7 = file;
        final List arrayList7 = arrayList3;
        final File file8 = file2;
        final ArrayList arrayList8 = arrayList4;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StoryRecorder.m4615$r8$lambda$0Gqp1xfutrIgoLPIM68QKcXADI(storyEntry4, z2, arrayList8, fileMakeCacheFile3, file7, file4, file8, file3, arrayList7, runnable);
            }
        });
        size = arrayList.size();
        i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            ((Runnable) obj2).run();
        }
    }

    public static void $r8$lambda$layLMPzZu4ISw5ym5LQH0HHr4GM(Bitmap bitmap, File file) {
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void m4630$r8$lambda$OeCh5EypcPyWasG24bNEAo8MUM(Bitmap bitmap, File file) {
        try {
            try {
                bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file));
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            } catch (Exception e) {
                FileLog.e(e);
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        } catch (Throwable th) {
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
            throw th;
        }
    }

    public static void m4641$r8$lambda$iHPC2nUP7ABMHUWxAlpcDaD4bg(Bitmap bitmap, File file) {
        try {
            bitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(file));
        } catch (Exception e) {
            FileLog.e(e);
        } finally {
            AndroidUtilities.recycleBitmap(bitmap);
        }
    }

    public static void $r8$lambda$kpS36TI9lhC7HJol_gzW2lkVCyY(Bitmap bitmap, File file) {
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void $r8$lambda$p1EnWTor5yK7OeqRAHiXSX8JJ7M(Bitmap bitmap, File file) {
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 87, new FileOutputStream(file));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void m4615$r8$lambda$0Gqp1xfutrIgoLPIM68QKcXADI(StoryEntry storyEntry, boolean z, ArrayList arrayList, File file, File file2, File file3, File file4, File file5, List list, Runnable runnable) {
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

    private void applyPaint() {
        StoryEntry storyEntry;
        ImageReceiver photoImage;
        if (this.paintView == null || (storyEntry = this.outputEntry) == null) {
            return;
        }
        storyEntry.clearPaint();
        this.outputEntry.editedMedia |= this.paintView.hasChanges();
        StoryEntry storyEntry2 = this.outputEntry;
        ArrayList arrayList = storyEntry2.mediaEntities;
        if (arrayList == null) {
            storyEntry2.mediaEntities = new ArrayList();
        } else {
            arrayList.clear();
        }
        PaintView paintView = this.paintView;
        StoryEntry storyEntry3 = this.outputEntry;
        paintView.getBitmap(storyEntry3.mediaEntities, storyEntry3.resultWidth, storyEntry3.resultHeight, false, false, false, false, storyEntry3);
        StoryEntry storyEntry4 = this.outputEntry;
        if (!storyEntry4.isVideo) {
            storyEntry4.averageDuration = Utilities.clamp(this.paintView.getLcm(), 7500L, 5000L);
        }
        List<TLRPC.InputDocument> masks = this.paintView.getMasks();
        this.outputEntry.stickers = masks != null ? new ArrayList(masks) : null;
        StoryEntry storyEntry5 = this.outputEntry;
        boolean z = storyEntry5.isVideo;
        boolean zWouldBeVideo = storyEntry5.wouldBeVideo();
        this.outputEntry.mediaEntities = new ArrayList();
        PaintView paintView2 = this.paintView;
        StoryEntry storyEntry6 = this.outputEntry;
        Bitmap bitmap = paintView2.getBitmap(storyEntry6.mediaEntities, storyEntry6.resultWidth, storyEntry6.resultHeight, true, false, false, !z, storyEntry6);
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
        storyEntry7.paintFile = fileLoader.getPathToAttach(ImageLoader.scaleAndSaveImage(bitmap, compressFormat, storyEntry8.resultWidth, storyEntry8.resultHeight, 87, false, 101, 101), true);
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        StoryEntry storyEntry9 = this.outputEntry;
        if (storyEntry9.isRepostMessage) {
            File file4 = storyEntry9.backgroundFile;
            if (file4 != null) {
                try {
                    file4.delete();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.outputEntry.backgroundFile = null;
            }
            StoryEntry storyEntry10 = this.outputEntry;
            long j = storyEntry10.backgroundWallpaperPeerId;
            if (j != Long.MIN_VALUE) {
                Drawable backgroundDrawable = storyEntry10.backgroundDrawable;
                if (backgroundDrawable == null) {
                    backgroundDrawable = PreviewView.getBackgroundDrawable((Drawable) null, this.currentAccount, j, this.isDark);
                }
                if (backgroundDrawable != null) {
                    this.outputEntry.backgroundFile = StoryEntry.makeCacheFile(this.currentAccount, "webp");
                    StoryEntry storyEntry11 = this.outputEntry;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(storyEntry11.resultWidth, storyEntry11.resultHeight, Bitmap.Config.ARGB_8888);
                    StoryEntry.drawBackgroundDrawable(new Canvas(bitmapCreateBitmap), backgroundDrawable, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                    try {
                        try {
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.outputEntry.backgroundFile));
                            if (!bitmapCreateBitmap.isRecycled()) {
                                bitmapCreateBitmap.recycle();
                            }
                        } catch (Exception e2) {
                            FileLog.e(e2);
                            if (!bitmapCreateBitmap.isRecycled()) {
                            }
                        }
                    } catch (Throwable th) {
                        if (!bitmapCreateBitmap.isRecycled()) {
                            bitmapCreateBitmap.recycle();
                        }
                        throw th;
                    }
                }
            }
        }
        StoryEntry storyEntry12 = this.outputEntry;
        if (storyEntry12.isRepostMessage) {
            File file5 = storyEntry12.messageVideoMaskFile;
            if (file5 != null) {
                try {
                    file5.delete();
                } catch (Exception e3) {
                    FileLog.e(e3);
                }
                this.outputEntry.messageVideoMaskFile = null;
            }
            StoryEntry storyEntry13 = this.outputEntry;
            if (storyEntry13.isRepostMessage && storyEntry13.isVideo) {
                int i = storyEntry13.width;
                int i2 = storyEntry13.height;
                MessageEntityView messageEntityViewFindMessageView = this.paintView.findMessageView();
                if (messageEntityViewFindMessageView != null && messageEntityViewFindMessageView.listView.getChildCount() == 1 && i > 0 && i2 > 0) {
                    if ((messageEntityViewFindMessageView.listView.getChildAt(0) instanceof ChatMessageCell) && (photoImage = ((ChatMessageCell) messageEntityViewFindMessageView.listView.getChildAt(0)).getPhotoImage()) != null && ((int) photoImage.getImageWidth()) > 0 && ((int) photoImage.getImageHeight()) > 0) {
                        float f = i;
                        float f2 = i2;
                        float fMax = Math.max(photoImage.getImageWidth() / f, photoImage.getImageHeight() / f2);
                        int i3 = (int) ((f * fMax) / 2.0f);
                        int i4 = (int) ((f2 * fMax) / 2.0f);
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                        float[] fArr = new float[8];
                        for (int i5 = 0; i5 < photoImage.getRoundRadius().length; i5++) {
                            int i6 = i5 * 2;
                            fArr[i6] = photoImage.getRoundRadius()[i5];
                            fArr[i6 + 1] = photoImage.getRoundRadius()[i5];
                        }
                        Canvas canvas = new Canvas(bitmapCreateBitmap2);
                        Path path = new Path();
                        canvas.scale(0.5f, 0.5f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f3 = (i3 * 2.0f) / 2.0f;
                        float f4 = (i4 * 2.0f) / 2.0f;
                        rectF.set(f3 - (photoImage.getImageWidth() / 2.0f), f4 - (photoImage.getImageHeight() / 2.0f), f3 + (photoImage.getImageWidth() / 2.0f), f4 + (photoImage.getImageHeight() / 2.0f));
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        Paint paint = new Paint(1);
                        paint.setColor(-1);
                        canvas.drawPath(path, paint);
                        try {
                            this.outputEntry.messageVideoMaskFile = StoryEntry.makeCacheFile(this.currentAccount, "webp");
                            bitmapCreateBitmap2.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.outputEntry.messageVideoMaskFile));
                        } catch (Exception e4) {
                            FileLog.e(e4);
                            this.outputEntry.messageVideoMaskFile = null;
                        }
                        bitmapCreateBitmap2.recycle();
                    }
                }
            }
        }
        if (!zWouldBeVideo) {
            PaintView paintView3 = this.paintView;
            ArrayList arrayList2 = new ArrayList();
            StoryEntry storyEntry14 = this.outputEntry;
            Bitmap bitmap2 = paintView3.getBitmap(arrayList2, storyEntry14.resultWidth, storyEntry14.resultHeight, false, true, false, false, storyEntry14);
            StoryEntry storyEntry15 = this.outputEntry;
            FileLoader fileLoader2 = FileLoader.getInstance(this.currentAccount);
            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
            StoryEntry storyEntry16 = this.outputEntry;
            storyEntry15.paintEntitiesFile = fileLoader2.getPathToAttach(ImageLoader.scaleAndSaveImage(bitmap2, compressFormat2, storyEntry16.resultWidth, storyEntry16.resultHeight, 87, false, 101, 101), true);
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bitmap2.recycle();
            }
        }
        if (this.paintView.hasBlur()) {
            Bitmap blurBitmap = this.paintView.getBlurBitmap();
            StoryEntry storyEntry17 = this.outputEntry;
            FileLoader fileLoader3 = FileLoader.getInstance(this.currentAccount);
            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
            StoryEntry storyEntry18 = this.outputEntry;
            storyEntry17.paintBlurFile = fileLoader3.getPathToAttach(ImageLoader.scaleAndSaveImage(blurBitmap, compressFormat3, storyEntry18.resultWidth, storyEntry18.resultHeight, 87, false, 101, 101), true);
            if (blurBitmap == null || blurBitmap.isRecycled()) {
                return;
            }
            blurBitmap.recycle();
        }
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
        Bitmap bitmap = paintView.getBitmap(storyEntry2.mediaEntities, storyEntry2.resultWidth, storyEntry2.resultHeight, false, false, true, this.mode != 1, storyEntry2);
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
                        return BitmapFactory.decodeFile(this.f$0.outputEntry.file.getAbsolutePath(), options);
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
                    this.f$0.switchToEditMode(-1, true);
                }
            });
            this.photoFilterView.getCancelTextView().setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.switchToEditMode(-1, true);
                }
            });
            this.photoFilterView.getToolsView().setVisibility(8);
            this.photoFilterView.getToolsView().setAlpha(0.0f);
            this.photoFilterView.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
            this.photoFilterView.init();
        }
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

    public void createCameraView() {
        if (this.cameraView != null || getContext() == null) {
            return;
        }
        this.cameraView = new AnonymousClass25(getContext(), getCameraFace(), false);
        RecordControl recordControl = this.recordControl;
        if (recordControl != null) {
            recordControl.setAmplitude(0.0f, false);
        }
        this.cameraView.recordHevc = !this.collageLayoutView.hasLayout();
        this.cameraView.setThumbDrawable(getCameraThumb());
        this.cameraView.initTexture();
        this.cameraView.setDelegate(new CameraView.CameraViewDelegate() {
            @Override
            public final void onCameraInit() {
                StoryRecorder.m4632$r8$lambda$WdOt9hKWTk0vRfpsu_pNYJNpnw(this.f$0);
            }
        });
        setActionBarButtonVisible(this.dualButton, this.cameraView.dualAvailable() && this.currentPage == 0, true);
        this.collageButton.setTranslationX(this.cameraView.dualAvailable() ? 0.0f : AndroidUtilities.dp(46.0f));
        this.collageLayoutView.setCameraView(this.cameraView);
        if (MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) < 1) {
            this.cameraHint.show();
            MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) + 1).apply();
        } else if (!this.cameraView.isSavedDual() && this.cameraView.dualAvailable() && MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) < 2) {
            this.dualHint.show();
        }
        if (this.qrScanner == null) {
            this.qrScanner = new QRScanner(getContext(), new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    StoryRecorder.m4622$r8$lambda$AOHACYVYsdb8e6H7cY_lReXpuA(this.f$0, (QRScanner.Detected) obj);
                }
            });
        }
        this.qrScanner.attach(this.cameraView);
        ScannedLinkPreview scannedLinkPreview = this.qrLinkView;
        if (scannedLinkPreview != null) {
            CollageLayoutView2 collageLayoutView2 = this.collageLayoutView;
            scannedLinkPreview.setBlurRenderNode(collageLayoutView2, collageLayoutView2.getBlurRenderNode());
        }
    }

    class AnonymousClass25 extends DualCameraView {
        AnonymousClass25(Context context, boolean z, boolean z2) {
            super(context, z, z2);
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
            StoryRecorder.this.dualButton.setContentDescription(LocaleController.getString(isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
            StoryRecorder storyRecorder = StoryRecorder.this;
            storyRecorder.setCameraFlashModeIcon(storyRecorder.getCurrentFlashMode(), true);
        }

        @Override
        protected void onSavedDualCameraSuccess() {
            if (MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) < 2) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.AnonymousClass25.$r8$lambda$KNDD5heyVlQF5W98IOcF2dP3pm4(this.f$0);
                    }
                }, 340L);
            }
            StoryRecorder.this.dualButton.setValue(isDual());
            StoryRecorder.this.dualButton.setContentDescription(LocaleController.getString(isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
        }

        public static void $r8$lambda$KNDD5heyVlQF5W98IOcF2dP3pm4(AnonymousClass25 anonymousClass25) {
            if (StoryRecorder.this.takingVideo || StoryRecorder.this.takingPhoto || StoryRecorder.this.cameraView == null || StoryRecorder.this.currentPage != 0 || StoryRecorder.this.savedDualHint == null) {
                return;
            }
            String string = LocaleController.getString(anonymousClass25.isFrontface() ? R.string.StoryCameraSavedDualBackHint : R.string.StoryCameraSavedDualFrontHint);
            StoryRecorder.this.savedDualHint.setMaxWidthPx(HintView2.cutInFancyHalf(string, StoryRecorder.this.savedDualHint.getTextPaint()));
            StoryRecorder.this.savedDualHint.setText(string);
            StoryRecorder.this.savedDualHint.show();
            MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) + 1).apply();
        }

        @Override
        public void receivedAmplitude(double d) {
            if (StoryRecorder.this.recordControl != null) {
                StoryRecorder.this.recordControl.setAmplitude(Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f), true);
            }
        }
    }

    public static void m4632$r8$lambda$WdOt9hKWTk0vRfpsu_pNYJNpnw(StoryRecorder storyRecorder) {
        String currentFlashMode = storyRecorder.getCurrentFlashMode();
        if (TextUtils.equals(currentFlashMode, storyRecorder.getNextFlashMode())) {
            currentFlashMode = null;
        }
        storyRecorder.setCameraFlashModeIcon(storyRecorder.currentPage == 0 ? currentFlashMode : null, true);
        ZoomControlView zoomControlView = storyRecorder.zoomControlView;
        if (zoomControlView != null) {
            storyRecorder.cameraZoom = 0.0f;
            zoomControlView.setZoom(0.0f, false);
        }
        storyRecorder.updateActionBarButtons(true);
    }

    public static void m4622$r8$lambda$AOHACYVYsdb8e6H7cY_lReXpuA(StoryRecorder storyRecorder, QRScanner.Detected detected) {
        if (storyRecorder.qrScanner == null) {
            return;
        }
        storyRecorder.qrLinkView.setLink(detected == null ? null : detected.link);
        CollageLayoutView2 collageLayoutView2 = storyRecorder.collageLayoutView;
        if (collageLayoutView2 != null) {
            collageLayoutView2.qrDrawer.setQrDetected(storyRecorder.qrLinkView.isResolved() ? storyRecorder.qrScanner.getDetected() : null);
        }
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

    private void saveFrontFaceFlashMode() {
        if (this.frontfaceFlashMode >= 0) {
            MessagesController.getGlobalMainSettings().edit().putFloat("frontflash_warmth", this.flashViews.warmth).putFloat("frontflash_intensity", this.flashViews.intensity).apply();
        }
    }

    public String getCurrentFlashMode() {
        DualCameraView dualCameraView = this.cameraView;
        if (dualCameraView == null || dualCameraView.getCameraSession() == null) {
            return null;
        }
        if (this.cameraView.isFrontface() && !this.cameraView.getCameraSession().hasFlashModes()) {
            checkFrontfaceFlashModes();
            return (String) this.frontfaceFlashModes.get(this.frontfaceFlashMode);
        }
        return this.cameraView.getCameraSession().getCurrentFlashMode();
    }

    private String getNextFlashMode() {
        DualCameraView dualCameraView = this.cameraView;
        if (dualCameraView == null || dualCameraView.getCameraSession() == null) {
            return null;
        }
        if (this.cameraView.isFrontface() && !this.cameraView.getCameraSession().hasFlashModes()) {
            checkFrontfaceFlashModes();
            ArrayList arrayList = this.frontfaceFlashModes;
            return (String) arrayList.get(this.frontfaceFlashMode + 1 >= arrayList.size() ? 0 : this.frontfaceFlashMode + 1);
        }
        return this.cameraView.getCameraSession().getNextFlashMode();
    }

    private void setCurrentFlashMode(String str) {
        DualCameraView dualCameraView = this.cameraView;
        if (dualCameraView == null || dualCameraView.getCameraSession() == null) {
            return;
        }
        if (this.cameraView.isFrontface() && !this.cameraView.getCameraSession().hasFlashModes()) {
            int iIndexOf = this.frontfaceFlashModes.indexOf(str);
            if (iIndexOf >= 0) {
                this.frontfaceFlashMode = iIndexOf;
                MessagesController.getGlobalMainSettings().edit().putInt("frontflash", this.frontfaceFlashMode).apply();
                return;
            }
            return;
        }
        this.cameraView.getCameraSession().setCurrentFlashMode(str);
    }

    public Drawable getCameraThumb() {
        Bitmap bitmapDecodeFile;
        try {
            bitmapDecodeFile = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmapDecodeFile = null;
        }
        if (bitmapDecodeFile != null) {
            return new BitmapDrawable(bitmapDecodeFile);
        }
        return getContext().getResources().getDrawable(R.drawable.icplaceholder);
    }

    private void saveLastCameraBitmap(final Runnable runnable) {
        DualCameraView dualCameraView = this.cameraView;
        if (dualCameraView == null || dualCameraView.getTextureView() == null) {
            return;
        }
        try {
            final Bitmap bitmap = this.cameraView.getTextureView().getBitmap();
            Utilities.themeQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.$r8$lambda$dBdeNOnXCSEuPUz8HIlIF5okVKU(this.f$0, bitmap, runnable);
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static void $r8$lambda$dBdeNOnXCSEuPUz8HIlIF5okVKU(StoryRecorder storyRecorder, Bitmap bitmap, Runnable runnable) {
        storyRecorder.getClass();
        if (bitmap != null) {
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), storyRecorder.cameraView.getMatrix(), true);
                bitmap.recycle();
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, 80, (int) (bitmapCreateBitmap.getHeight() / (bitmapCreateBitmap.getWidth() / 80.0f)), true);
                if (bitmapCreateScaledBitmap != null) {
                    if (bitmapCreateScaledBitmap != bitmapCreateBitmap) {
                        bitmapCreateBitmap.recycle();
                    }
                    Utilities.blurBitmap(bitmapCreateScaledBitmap, 7);
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg"));
                    bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                    bitmapCreateScaledBitmap.recycle();
                    fileOutputStream.close();
                }
            } catch (Throwable unused) {
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
        }
        AndroidUtilities.runOnUIThread(runnable);
    }

    private void showDismissEntry() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.DiscardChanges));
        builder.setMessage(LocaleController.getString(R.string.PhotoEditorDiscardAlert));
        StoryEntry storyEntry = this.outputEntry;
        if (storyEntry != null && !storyEntry.isEdit && !storyEntry.isShare) {
            builder.setNeutralButton(LocaleController.getString(storyEntry.isDraft ? R.string.StoryKeepDraft : R.string.StorySaveDraft), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    StoryRecorder.$r8$lambda$tnNOdgMoQ8koFVfSuo6IhaPL6xs(this.f$0, alertDialog, i);
                }
            });
        }
        StoryEntry storyEntry2 = this.outputEntry;
        builder.setPositiveButton(LocaleController.getString((storyEntry2 == null || !storyEntry2.isDraft || storyEntry2.isEdit) ? R.string.Discard : R.string.StoryDeleteDraft), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                StoryRecorder.$r8$lambda$fn2VVpye5cpbdDR6nft2ByhfVrc(this.f$0, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        View button = alertDialogCreate.getButton(-1);
        if (button instanceof TextView) {
            int i = Theme.key_text_RedBold;
            ((TextView) button).setTextColor(Theme.getColor(i, this.resourcesProvider));
            button.setBackground(Theme.createRadSelectorDrawable(ColorUtils.setAlphaComponent(Theme.getColor(i, this.resourcesProvider), 51), 6, 6));
        }
    }

    public static void $r8$lambda$tnNOdgMoQ8koFVfSuo6IhaPL6xs(StoryRecorder storyRecorder, AlertDialog alertDialog, int i) {
        StoryEntry storyEntry = storyRecorder.outputEntry;
        if (storyEntry == null) {
            return;
        }
        storyEntry.captionEntitiesAllowed = MessagesController.getInstance(storyRecorder.currentAccount).storyEntitiesAllowed();
        storyRecorder.showSavedDraftHint = !storyRecorder.outputEntry.isDraft;
        storyRecorder.applyFilter(null);
        storyRecorder.applyPaint();
        storyRecorder.applyPaintMessage();
        storyRecorder.destroyPhotoFilterView();
        StoryEntry storyEntry2 = storyRecorder.outputEntry;
        storyEntry2.destroy(true);
        storyEntry2.caption = storyRecorder.captionEdit.getText();
        storyRecorder.outputEntry = null;
        storyRecorder.prepareThumb(storyEntry2, true);
        DraftsController draftsController = MessagesController.getInstance(storyRecorder.currentAccount).getStoriesController().getDraftsController();
        if (storyEntry2.isDraft) {
            draftsController.edit(storyEntry2);
        } else {
            draftsController.append(storyEntry2);
        }
        storyRecorder.navigateTo(0, true);
    }

    public static void $r8$lambda$fn2VVpye5cpbdDR6nft2ByhfVrc(StoryRecorder storyRecorder, AlertDialog alertDialog, int i) {
        StoryEntry storyEntry = storyRecorder.outputEntry;
        if (storyEntry != null && !storyEntry.isEdit && ((!storyEntry.isRepost || storyEntry.isRepostMessage) && storyEntry.isDraft)) {
            MessagesController.getInstance(storyRecorder.currentAccount).getStoriesController().getDraftsController().delete(storyRecorder.outputEntry);
            storyRecorder.outputEntry = null;
        }
        StoryEntry storyEntry2 = storyRecorder.outputEntry;
        if (storyEntry2 != null && (storyEntry2.isShare || storyEntry2.isEdit || (storyEntry2.isRepost && !storyEntry2.isRepostMessage))) {
            storyRecorder.close(true);
        } else {
            storyRecorder.navigateTo(0, true);
        }
    }

    public void destroyCameraView(boolean z) {
        QRScanner qRScanner = this.qrScanner;
        if (qRScanner != null) {
            qRScanner.destroy();
            this.qrScanner = null;
            CollageLayoutView2 collageLayoutView2 = this.collageLayoutView;
            if (collageLayoutView2 != null) {
                collageLayoutView2.qrDrawer.setQrDetected(null);
            }
        }
        ScannedLinkPreview scannedLinkPreview = this.qrLinkView;
        if (scannedLinkPreview != null) {
            scannedLinkPreview.setBlurRenderNode(null, null);
        }
        if (this.cameraView != null) {
            if (z) {
                saveLastCameraBitmap(new Runnable() {
                    @Override
                    public final void run() {
                        StoryRecorder.$r8$lambda$KTuuk6CIiDGoya8Y5rXw6CuHZjM(this.f$0);
                    }
                });
                return;
            }
            saveLastCameraBitmap(new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder storyRecorder = this.f$0;
                    storyRecorder.collageLayoutView.setCameraThumb(storyRecorder.getCameraThumb());
                }
            });
            this.cameraView.destroy(true, null);
            AndroidUtilities.removeFromParent(this.cameraView);
            CollageLayoutView2 collageLayoutView3 = this.collageLayoutView;
            if (collageLayoutView3 != null) {
                collageLayoutView3.setCameraView(null);
            }
            this.cameraView = null;
        }
    }

    public static void $r8$lambda$KTuuk6CIiDGoya8Y5rXw6CuHZjM(StoryRecorder storyRecorder) {
        storyRecorder.collageLayoutView.setCameraThumb(storyRecorder.getCameraThumb());
        DualCameraView dualCameraView = storyRecorder.cameraView;
        if (dualCameraView != null) {
            dualCameraView.destroy(true, null);
            AndroidUtilities.removeFromParent(storyRecorder.cameraView);
            CollageLayoutView2 collageLayoutView2 = storyRecorder.collageLayoutView;
            if (collageLayoutView2 != null) {
                collageLayoutView2.setCameraView(null);
            }
            storyRecorder.cameraView = null;
        }
    }

    public void requestCameraPermission(boolean z) {
        Activity activity;
        if (!this.requestedCameraPermission || z) {
            this.noCameraPermission = false;
            if (Build.VERSION.SDK_INT >= 23 && (activity = this.activity) != null) {
                boolean z2 = activity.checkSelfPermission("android.permission.CAMERA") != 0;
                this.noCameraPermission = z2;
                if (z2) {
                    Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.story_camera).mutate();
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(-14540254), drawableMutate);
                    combinedDrawable.setIconSize(AndroidUtilities.dp(64.0f), AndroidUtilities.dp(64.0f));
                    this.collageLayoutView.setCameraThumb(combinedDrawable);
                    if (!this.activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        this.activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                        this.requestedCameraPermission = true;
                    } else {
                        new AlertDialog.Builder(getContext(), this.resourcesProvider).setTopAnimation(R.raw.permission_request_camera, 72, false, Theme.getColor(Theme.key_dialogTopBackground)).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint))).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new AlertDialog.OnButtonClickListener() {
                            @Override
                            public final void onClick(AlertDialog alertDialog, int i) {
                                StoryRecorder.m4648$r8$lambda$wD6ZKyHTxh4YSmAa5F8GLBbjU(this.f$0, alertDialog, i);
                            }
                        }).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).create().show();
                        return;
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

    public static void m4648$r8$lambda$wD6ZKyHTxh4YSmAa5F8GLBbjU(StoryRecorder storyRecorder, AlertDialog alertDialog, int i) {
        storyRecorder.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            storyRecorder.activity.startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public boolean requestGalleryPermission() {
        Activity activity = this.activity;
        if (activity == null) {
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i >= 33) {
            z = (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && this.activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) ? false : true;
            if (z) {
                this.activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 114);
            }
        } else if (i >= 23) {
            z = activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
            if (z) {
                this.activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 114);
            }
        }
        return !z;
    }

    public boolean requestAudioPermission() {
        Activity activity;
        if (Build.VERSION.SDK_INT < 23 || (activity = this.activity) == null || activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        this.activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 112);
        return false;
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
                        this.f$0.requestCameraPermission(false);
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
                this.collageLayoutView.setCameraThumb(null);
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
                animateGalleryListView(true);
                return;
            } else {
                new AlertDialog.Builder(getContext(), this.resourcesProvider).setTopAnimation(R.raw.permission_request_folder, 72, false, Theme.getColor(Theme.key_dialogTopBackground)).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionStorageWithHint))).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        StoryRecorder.m4617$r8$lambda$3rmT4mCqFVfvHqemI2fonO5X8o(this.f$0, alertDialog, i2);
                    }
                }).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).create().show();
                return;
            }
        }
        if (i == 112) {
            if (z) {
                return;
            }
            new AlertDialog.Builder(getContext(), this.resourcesProvider).setTopAnimation(R.raw.permission_request_camera, 72, false, Theme.getColor(Theme.key_dialogTopBackground)).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraMicVideo))).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    StoryRecorder.$r8$lambda$RmDnx8u5fGr6lKBoaevALWookLw(this.f$0, alertDialog, i2);
                }
            }).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).create().show();
        } else if (i == 115) {
            if (!z) {
                new AlertDialog.Builder(getContext(), this.resourcesProvider).setTopAnimation(R.raw.permission_request_folder, 72, false, Theme.getColor(Theme.key_dialogTopBackground)).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoAudioStorageStory))).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        StoryRecorder.$r8$lambda$gfmU3kvUDel7vYVtArFfo3YA3cE(this.f$0, alertDialog, i2);
                    }
                }).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).create().show();
            }
            if (z && (runnable = this.audioGrantedCallback) != null) {
                runnable.run();
            }
            this.audioGrantedCallback = null;
        }
    }

    public static void m4617$r8$lambda$3rmT4mCqFVfvHqemI2fonO5X8o(StoryRecorder storyRecorder, AlertDialog alertDialog, int i) {
        storyRecorder.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            storyRecorder.activity.startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void $r8$lambda$RmDnx8u5fGr6lKBoaevALWookLw(StoryRecorder storyRecorder, AlertDialog alertDialog, int i) {
        storyRecorder.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            storyRecorder.activity.startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void $r8$lambda$gfmU3kvUDel7vYVtArFfo3YA3cE(StoryRecorder storyRecorder, AlertDialog alertDialog, int i) {
        storyRecorder.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            storyRecorder.activity.startActivity(intent);
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
        StoriesController.StoryLimit storyLimitCheckStoryLimit;
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
                if (!this.videoError && !this.captionEdit.isCaptionOverLimit() && (!MessagesController.getInstance(this.currentAccount).getStoriesController().hasStoryLimit(getCount()) || ((storyEntry = this.outputEntry) != null && (storyEntry.isEdit || storyEntry.botId != 0)))) {
                    z = true;
                }
                previewButtons.setShareEnabled(z);
                return;
            }
            if (i5 == 0 && (storyLimitCheckStoryLimit = MessagesController.getInstance(this.currentAccount).getStoriesController().checkStoryLimit()) != null && storyLimitCheckStoryLimit.active(this.currentAccount)) {
                StoryEntry storyEntry2 = this.outputEntry;
                if (storyEntry2 == null || storyEntry2.botId == 0) {
                    showLimitReachedSheet(storyLimitCheckStoryLimit, true);
                }
            }
        }
    }

    public int getCount() {
        ArrayList arrayList = this.selectedEntries;
        if (arrayList != null) {
            return arrayList.size();
        }
        StoryEntry storyEntry = this.outputEntry;
        if (storyEntry != null) {
            return storyEntry.getTotalCount();
        }
        return 1;
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

            @Override
            public Activity getParentActivity() {
                return StoryRecorder.this.activity;
            }

            @Override
            public Theme.ResourcesProvider getResourceProvider() {
                return new WrappedResourceProvider(StoryRecorder.this.resourcesProvider) {
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
        }, this.activity, storyLimit.getLimitReachedType(), this.currentAccount, null) {
            {
                this.storiesCount = StoryRecorder.this.getCount();
            }
        };
        limitReachedBottomSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                StoryRecorder.$r8$lambda$BOMsR8HQSR8uCzmIfXxVy28OGjY(this.f$0, z, dialogInterface);
            }
        });
        this.previewView.updatePauseReason(7, true);
        this.shownLimitReached = true;
        limitReachedBottomSheet.show();
    }

    public static void $r8$lambda$BOMsR8HQSR8uCzmIfXxVy28OGjY(StoryRecorder storyRecorder, boolean z, DialogInterface dialogInterface) {
        storyRecorder.shownLimitReached = false;
        storyRecorder.previewView.updatePauseReason(7, true);
        if (z) {
            storyRecorder.close(true);
        }
    }

    public void checkBackgroundVisibility() {
        boolean z = this.dismissProgress != 0.0f || this.openProgress < 1.0f || this.forceBackgroundVisible;
        if (z == this.isBackgroundVisible) {
            return;
        }
        WindowVisibilityManager.Controller controller = this.activityVisibilityController;
        if (controller != null) {
            controller.setHidden(!z);
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
                this.currentAccount = StoryRecorder.this.currentAccount;
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
                return new WrappedResourceProvider(StoryRecorder.this.resourcesProvider) {
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
                StoryRecorder.$r8$lambda$Fu4BwSZgEyexPnq0Fh3nYlNcvc4(this.f$0, dialogInterface);
            }
        });
        premiumFeatureBottomSheet.show();
    }

    public static void $r8$lambda$Fu4BwSZgEyexPnq0Fh3nYlNcvc4(StoryRecorder storyRecorder, DialogInterface dialogInterface) {
        PreviewView previewView = storyRecorder.previewView;
        if (previewView != null) {
            previewView.updatePauseReason(4, false);
        }
    }

    private CharSequence premiumText(String str) {
        return AndroidUtilities.replaceSingleTag(str, Theme.key_chat_messageLinkIn, 0, new Runnable() {
            @Override
            public final void run() {
                this.f$0.openPremium();
            }
        }, this.resourcesProvider);
    }

    public void showPremiumPeriodBulletin(int i) {
        int i2 = i / 3600;
        Bulletin.BulletinWindow.BulletinWindowLayout bulletinWindowLayoutMake = Bulletin.BulletinWindow.make(this.activity, new Bulletin.Delegate() {
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
        WindowManager.LayoutParams layout = bulletinWindowLayoutMake.getLayout();
        if (layout != null) {
            layout.height = -2;
            layout.width = this.containerView.getWidth();
            layout.y = (int) (this.containerView.getY() + AndroidUtilities.dp(56.0f));
            bulletinWindowLayoutMake.updateLayout();
        }
        bulletinWindowLayoutMake.setTouchable(true);
        BulletinFactory.of(bulletinWindowLayoutMake, this.resourcesProvider).createSimpleBulletin(R.raw.fire_on, premiumText(LocaleController.formatPluralString("StoryPeriodPremium", i2, new Object[0])), 3).show(true);
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
            this.muteButtonDrawable.start();
            return;
        }
        if (this.muteButtonDrawable.getCurrentFrame() == 0 || this.muteButtonDrawable.getCurrentFrame() >= 43) {
            return;
        }
        this.muteButtonDrawable.setCustomEndFrame(43);
        this.muteButtonDrawable.start();
    }

    public StoryRecorder selectedPeerId(long j) {
        this.selectedDialogId = j;
        CaptionStory captionStory = this.captionEdit;
        if (captionStory != null) {
            captionStory.setDialogId(j);
        }
        return this;
    }

    public StoryRecorder canChangePeer(boolean z) {
        this.canChangePeer = z;
        return this;
    }

    public static CharSequence cameraBtnSpan(Context context) {
        SpannableString spannableString = new SpannableString("c");
        final Drawable drawableMutate = context.getResources().getDrawable(R.drawable.story_camera).mutate();
        int iDp = AndroidUtilities.dp(35.0f);
        int i = -iDp;
        drawableMutate.setBounds(i / 4, i, (iDp / 4) * 3, 0);
        spannableString.setSpan(new ImageSpan(drawableMutate) {
            @Override
            public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
                return (super.getSize(paint, charSequence, i2, i3, fontMetricsInt) / 3) * 2;
            }

            @Override
            public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
                canvas.save();
                canvas.translate(0.0f, ((i6 - i4) / 2) + AndroidUtilities.dp(1.0f));
                drawableMutate.setAlpha(paint.getAlpha());
                super.draw(canvas, charSequence, i2, i3, f, i4, i5, i6, paint);
                canvas.restore();
            }
        }, 0, 1, 33);
        return spannableString;
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
                    StoryRecorder.$r8$lambda$uhuSlcDL_koJjoeZOkoCH2kvaHE(this.f$0);
                }
            });
            this.thanosEffect = thanosEffect;
            windowView.addView(thanosEffect);
        }
        return this.thanosEffect;
    }

    public static void $r8$lambda$uhuSlcDL_koJjoeZOkoCH2kvaHE(StoryRecorder storyRecorder) {
        ThanosEffect thanosEffect = storyRecorder.thanosEffect;
        if (thanosEffect != null) {
            storyRecorder.thanosEffect = null;
            storyRecorder.windowView.removeView(thanosEffect);
        }
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
            this.themeButtonDrawable.setLayerColor("Sunny", color);
            this.themeButtonDrawable.setLayerColor("Path 6", color);
            this.themeButtonDrawable.setLayerColor("Path", color);
            this.themeButtonDrawable.setLayerColor("Path 5", color);
            this.themeButtonDrawable.commitApplyLayerColors();
            ImageView imageView = new ImageView(getContext());
            this.themeButton = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.themeButton.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.themeButton.setBackground(Theme.createSelectorDrawable(553648127));
            this.themeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.toggleTheme();
                }
            });
            this.themeButton.setVisibility(8);
            this.themeButton.setImageDrawable(this.themeButtonDrawable);
            this.themeButton.setAlpha(0.0f);
            this.actionBarButtons.addView(this.themeButton, 0, LayoutHelper.createLinear(46, 56, 53));
        }
        return this.themeButton;
    }

    public void updateThemeButtonDrawable(boolean z) {
        RLottieDrawable rLottieDrawable = this.themeButtonDrawable;
        if (rLottieDrawable != null) {
            int framesCount = 0;
            if (z) {
                StoryEntry storyEntry = this.outputEntry;
                if (storyEntry != null && storyEntry.isDark) {
                    framesCount = rLottieDrawable.getFramesCount();
                }
                rLottieDrawable.setCustomEndFrame(framesCount);
                RLottieDrawable rLottieDrawable2 = this.themeButtonDrawable;
                if (rLottieDrawable2 != null) {
                    rLottieDrawable2.start();
                    return;
                }
                return;
            }
            StoryEntry storyEntry2 = this.outputEntry;
            int framesCount2 = (storyEntry2 == null || !storyEntry2.isDark) ? 0 : rLottieDrawable.getFramesCount() - 1;
            this.themeButtonDrawable.setCurrentFrame(framesCount2, false, true);
            this.themeButtonDrawable.setCustomEndFrame(framesCount2);
            ImageView imageView = this.themeButton;
            if (imageView != null) {
                imageView.invalidate();
            }
        }
    }

    public void toggleTheme() {
        if (this.outputEntry == null || this.changeDayNightView != null || this.themeButton == null) {
            return;
        }
        ValueAnimator valueAnimator = this.changeDayNightViewAnimator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            final boolean z = this.outputEntry.isDark;
            final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.windowView.getWidth(), this.windowView.getHeight(), Bitmap.Config.ARGB_8888);
            final Canvas canvas = new Canvas(bitmapCreateBitmap);
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
            final Paint paint = new Paint(1);
            paint.setColor(-16777216);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            final Paint paint2 = new Paint(1);
            paint2.setFilterBitmap(true);
            int[] iArr = new int[2];
            this.themeButton.getLocationInWindow(iArr);
            final float f = iArr[0];
            final float f2 = iArr[1];
            final float measuredWidth = f + (this.themeButton.getMeasuredWidth() / 2.0f);
            final float measuredHeight = f2 + (this.themeButton.getMeasuredHeight() / 2.0f);
            final float fMax = Math.max(bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth()) + AndroidUtilities.navigationBarHeight;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
            View view = new View(getContext()) {
                @Override
                protected void onDraw(Canvas canvas2) {
                    super.onDraw(canvas2);
                    if (!z) {
                        canvas2.drawCircle(measuredWidth, measuredHeight, fMax * (1.0f - StoryRecorder.this.changeDayNightViewProgress), paint2);
                    } else {
                        if (StoryRecorder.this.changeDayNightViewProgress > 0.0f) {
                            canvas.drawCircle(measuredWidth, measuredHeight, fMax * StoryRecorder.this.changeDayNightViewProgress, paint);
                        }
                        canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint2);
                    }
                    canvas2.save();
                    canvas2.translate(f, f2);
                    StoryRecorder.this.themeButton.draw(canvas2);
                    canvas2.restore();
                }
            };
            this.changeDayNightView = view;
            view.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return StoryRecorder.m4619$r8$lambda$4zhLGEpig6PiDkCV8uZ9FajUME(view2, motionEvent);
                }
            });
            this.changeDayNightViewProgress = 0.0f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.changeDayNightViewAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                boolean changedNavigationBarColor = false;

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
            this.changeDayNightViewAnimator.setDuration(z ? 320L : 450L);
            this.changeDayNightViewAnimator.setInterpolator(z ? CubicBezierInterpolator.EASE_IN : CubicBezierInterpolator.EASE_OUT_QUINT);
            this.changeDayNightViewAnimator.start();
            this.windowView.addView(this.changeDayNightView, new ViewGroup.LayoutParams(-1, -1));
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StoryRecorder.$r8$lambda$I4GbjJmexKpN0xNty2JAIIAdkHk(this.f$0);
                }
            });
        }
    }

    public static void $r8$lambda$I4GbjJmexKpN0xNty2JAIIAdkHk(StoryRecorder storyRecorder) {
        StoryEntry storyEntry = storyRecorder.outputEntry;
        if (storyEntry == null) {
            return;
        }
        storyEntry.isDark = !storyEntry.isDark;
        PreviewView previewView = storyRecorder.previewView;
        if (previewView != null) {
            previewView.setupWallpaper(storyEntry, false);
        }
        PaintView paintView = storyRecorder.paintView;
        if (paintView != null && paintView.entitiesView != null) {
            for (int i = 0; i < storyRecorder.paintView.entitiesView.getChildCount(); i++) {
                View childAt = storyRecorder.paintView.entitiesView.getChildAt(i);
                if (childAt instanceof MessageEntityView) {
                    ((MessageEntityView) childAt).setupTheme(storyRecorder.outputEntry);
                }
            }
        }
        storyRecorder.updateThemeButtonDrawable(true);
    }

    public void setActionBarButtonVisible(final View view, final boolean z, boolean z2) {
        if (view == null) {
            return;
        }
        if (z2) {
            view.setVisibility(0);
            view.animate().alpha(z ? 1.0f : 0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    StoryRecorder.this.updateActionBarButtonsOffsets();
                }
            }).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    StoryRecorder.this.updateActionBarButtonsOffsets();
                    if (z) {
                        return;
                    }
                    view.setVisibility(8);
                }
            }).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
        } else {
            view.animate().cancel();
            view.setVisibility(z ? 0 : 8);
            view.setAlpha(z ? 1.0f : 0.0f);
            updateActionBarButtonsOffsets();
        }
    }

    public boolean inCheck() {
        return !this.animatedRecording && (this.collageLayoutView.hasLayout() ? this.collageLayoutView.getFilledProgress() : 0.0f) >= 1.0f;
    }

    public void updateActionBarButtons(boolean z) {
        DualCameraView dualCameraView;
        boolean z2 = false;
        showVideoTimer(this.currentPage == 0 && this.mode == 1 && !this.collageListView.isVisible() && !inCheck(), z);
        this.collageButton.setSelected(this.collageLayoutView.hasLayout());
        FlashViews.ImageViewInvertable imageViewInvertable = this.backButton;
        CollageLayoutButton.CollageLayoutListView collageLayoutListView = this.collageListView;
        setActionBarButtonVisible(imageViewInvertable, collageLayoutListView == null || !collageLayoutListView.isVisible(), z);
        setActionBarButtonVisible(this.flashButton, (this.animatedRecording || this.mode == -1 || this.currentPage != 0 || this.flashButtonMode == null || this.collageListView.isVisible() || inCheck()) ? false : true, z);
        setActionBarButtonVisible(this.dualButton, (this.animatedRecording || this.mode == -1 || this.currentPage != 0 || (dualCameraView = this.cameraView) == null || !dualCameraView.dualAvailable() || this.collageListView.isVisible() || this.collageLayoutView.hasLayout()) ? false : true, z);
        setActionBarButtonVisible(this.collageButton, (this.animatedRecording || this.mode == -1 || this.currentPage != 0 || this.collageListView.isVisible()) ? false : true, z);
        setActionBarButtonVisible(this.collageRemoveButton, this.collageListView.isVisible(), z);
        this.recordControl.setCollageProgress(this.collageLayoutView.hasLayout() ? this.collageLayoutView.getFilledProgress() : 0.0f, z);
        this.removeCollageHint.show(this.collageListView.isVisible());
        animateRecording(this.animatedRecording, z);
        AndroidUtilities.updateViewShow(this.liveSettingsButton, this.mode == -1 && this.currentPage == 0);
        FlashViews.ImageViewInvertable imageViewInvertable2 = this.rotateButton;
        if (this.mode == -1 && this.currentPage == 0) {
            z2 = true;
        }
        AndroidUtilities.updateViewShow(imageViewInvertable2, z2);
    }

    public void updateActionBarButtonsOffsets() {
        this.collageRemoveButton.setTranslationX(-0.0f);
        float fDp = (AndroidUtilities.dp(46.0f) * this.collageRemoveButton.getAlpha()) + 0.0f;
        this.dualButton.setTranslationX(-fDp);
        float fDp2 = fDp + (AndroidUtilities.dp(46.0f) * this.dualButton.getAlpha());
        this.collageButton.setTranslationX(-fDp2);
        float fDp3 = fDp2 + (AndroidUtilities.dp(46.0f) * this.collageButton.getAlpha());
        this.flashButton.setTranslationX(-fDp3);
        float fDp4 = fDp3 + (AndroidUtilities.dp(46.0f) * this.flashButton.getAlpha());
        this.backButton.setTranslationX(0.0f);
        this.collageListView.setBounds((AndroidUtilities.dp(46.0f) * this.backButton.getAlpha()) + 0.0f + AndroidUtilities.dp(8.0f), fDp4 + AndroidUtilities.dp(8.0f));
    }

    public void createCropEditor() {
        if (this.cropEditor != null) {
            return;
        }
        CropEditor cropEditor = new CropEditor(getContext(), this.previewView, this.resourcesProvider) {
            @Override
            protected void close() {
                StoryRecorder.this.switchToEditMode(-1, true);
            }
        };
        this.cropEditor = cropEditor;
        this.windowView.addView(cropEditor.contentView);
        this.windowView.addView(this.cropEditor);
    }

    public void createCropInlineEditor() {
        if (this.cropInlineEditor != null) {
            return;
        }
        CropInlineEditor cropInlineEditor = new CropInlineEditor(getContext(), this.previewView, this.resourcesProvider) {
            @Override
            protected void close() {
                StoryRecorder.this.switchToEditMode(-1, true);
            }
        };
        this.cropInlineEditor = cropInlineEditor;
        this.windowView.addView(cropInlineEditor.contentView);
        this.windowView.addView(this.cropInlineEditor);
    }
}
