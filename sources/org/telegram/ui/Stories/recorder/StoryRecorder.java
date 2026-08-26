package org.telegram.ui.Stories.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
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
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
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
import android.window.OnBackInvokedDispatcher;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.AccountFrozenAlert;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.ShareDialogCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda488;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.Crop.CropRotationWheel;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.FilterGLThread;
import org.telegram.ui.Components.GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase;
import org.telegram.ui.Components.GestureDetectorFixDoubleTap$OnGestureListener;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.JoinGroupAlert$$ExternalSyntheticLambda12;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionPhotoDrawable;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.Components.Paint.RenderView;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Paint.Views.MessageEntityView;
import org.telegram.ui.Components.Paint.Views.ReactionWidgetEntityView;
import org.telegram.ui.Components.Paint.Views.TextPaintView;
import org.telegram.ui.Components.PhotoFilterBlurControl;
import org.telegram.ui.Components.PhotoFilterCurvesControl;
import org.telegram.ui.Components.PhotoFilterView;
import org.telegram.ui.Components.PipVideoOverlay$4$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.PlayPauseDrawable;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RectOld;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.URLSpanUserMention;
import org.telegram.ui.Components.VideoEditTextureView;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Components.ZoomControlView;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LinkManager$3$$ExternalSyntheticLambda0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda142;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda44;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda52;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda69;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda79;
import org.telegram.ui.PollItemMenu;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda85;
import org.telegram.ui.QrActivity;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda15;
import org.telegram.ui.Stars.StarReactionsOverlay;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.DialogStoriesCell$StoryCell$$ExternalSyntheticLambda2;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesViewPager$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.PreviewButtons.ShareButtonView;
import org.telegram.ui.ThemeActivity$$ExternalSyntheticLambda19;
import org.telegram.ui.ThemePreviewActivity;
import org.telegram.ui.TodoItemMenu;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda17;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda8;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda9;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda31;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda7;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda9;
import org.telegram.ui.VoIPFragment$12$$ExternalSyntheticLambda0;
import org.telegram.ui.iv.RichDetailsCell;
import org.telegram.ui.iv.RichEditor;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda8;

public final class StoryRecorder implements NotificationCenter.NotificationCenterDelegate {
    public static StoryRecorder instance;
    public final LinearLayout actionBarButtons;
    public final FrameLayout actionBarContainer;
    public final Activity activity;
    public final LaunchActivity.ActivityVisibilityController activityVisibilityController;
    public TodoItemMenu$$ExternalSyntheticLambda9 afterPlayerAwait;
    public boolean animatedRecording;
    public boolean animatedRecordingWasInCheck;
    public boolean applyContainerViewTranslation2;
    public VoIPFragment$$ExternalSyntheticLambda9 audioGrantedCallback;
    public boolean awaitingPlayer;
    public final FlashViews.ImageViewInvertable backButton;
    public final BlurringShader.BlurManager blurManager;
    public long botId;
    public String botLang;
    public final HintView2 cameraHint;
    public AnonymousClass25 cameraView;
    public float cameraZoom;
    public boolean canChangePeer;
    public final AnonymousClass4 captionContainer;
    public final AnonymousClass8 captionEdit;
    public final RichDetailsCell.AnonymousClass2 captionEditOverlay;
    public AnonymousClass31 changeDayNightView;
    public ValueAnimator changeDayNightViewAnimator;
    public float changeDayNightViewProgress;
    public final Path clipPath;
    public ClosingViewProvider closingSourceProvider;
    public final CollageLayoutButton collageButton;
    public final HintTextView collageHintTextView;
    public final AnonymousClass6 collageLayoutView;
    public final CollageLayoutButton.CollageLayoutListView collageListView;
    public final ToggleButton2 collageRemoveButton;
    public final ContainerView containerView;
    public ValueAnimator containerViewBackAnimator;
    public final FrameLayout controlContainer;
    public final ButtonWithCounterView coverButton;
    public final TimelineView coverTimelineView;
    public long coverValue;
    public AnonymousClass36 cropEditor;
    public AnonymousClass37 cropInlineEditor;
    public final int currentAccount;
    public int currentEditMode;
    public int currentPage;
    public CaptionStory.AnonymousClass1 currentRoundRecorder;
    public float dismissProgress;
    public final DownloadButton downloadButton;
    public DraftSavedHint draftSavedHint;
    public final ToggleButton dualButton;
    public final HintView2 dualHint;
    public AnimatorSet editModeAnimator;
    public ArrayList entries;
    public boolean fastClose;
    public final ToggleButton2 flashButton;
    public String flashButtonMode;
    public final FlashViews flashViews;
    public boolean forceBackgroundVisible;
    public boolean fromGallery;
    public final RectF fromRect;
    public float fromRounding;
    public SourceView fromSourceView;
    public int frontfaceFlashMode;
    public ArrayList frontfaceFlashModes;
    public Float frozenDismissProgress;
    public final RectF fullRectF;
    public boolean galleryClosing;
    public StoryRecorder$$ExternalSyntheticLambda6 galleryLayouted;
    public AnonymousClass19 galleryListView;
    public Boolean galleryListViewOpening;
    public ValueAnimator galleryOpenCloseAnimator;
    public SpringAnimation galleryOpenCloseSpringAnimator;
    public final HintTextView hintTextView;
    public int insetBottom;
    public int insetLeft;
    public int insetRight;
    public int insetTop;
    public boolean isBackgroundVisible;
    public boolean isDark;
    public boolean isReposting;
    public boolean isShown;
    public CollageLayout lastCollageLayout;
    public LinearLayoutManager.SavedState lastGalleryScrollPosition;
    public MediaController.AlbumEntry lastGallerySelectedAlbum;
    public TLRPC.InputPeer livePeer;
    public final SelectPeerView livePeerView;
    public StoryPrivacyBottomSheet.StoryPrivacy livePrivacy;
    public final FlashViews.ImageViewInvertable liveSettingsButton;
    public int mode;
    public final AnonymousClass12 modeSwitcherView;
    public final RLottieImageView muteButton;
    public RLottieDrawable muteButtonDrawable;
    public final HintView2 muteHint;
    public final FrameLayout navbarContainer;
    public boolean noCameraPermission;
    public final AnimationNotificationsLocker notificationsLocker;
    public Utilities.Callback4 onClosePrepareListener;
    public Runnable onFullyOpenListener;
    public ValueAnimator openCloseAnimator;
    public float openProgress;
    public int openType;
    public StoryEntry outputEntry;
    public File outputFile;
    public AnimatorSet pageAnimator;
    public AnonymousClass24 paintView;
    public View paintViewEntitiesView;
    public View paintViewRenderInputView;
    public RenderView paintViewRenderView;
    public View paintViewSelectionContainerView;
    public View paintViewTextDim;
    public final PhotoFilterView.EnhanceView photoFilterEnhanceView;
    public PhotoFilterView photoFilterView;
    public PhotoFilterBlurControl photoFilterViewBlurControl;
    public PhotoFilterCurvesControl photoFilterViewCurvesControl;
    public TextureView photoFilterViewTextureView;
    public final ChatActivity.AnonymousClass27 playButton;
    public boolean prepareClosing;
    public boolean preparingUpload;
    public boolean previewAlreadySet;
    public final PreviewButtons previewButtons;
    public final ThemePreviewActivity.AnonymousClass14 previewContainer;
    public int previewH;
    public final PreviewHighlightView previewHighlight;
    public FrameLayout previewTouchable;
    public final AnonymousClass7 previewView;
    public int previewW;
    public StoryPrivacyBottomSheet privacySheet;
    public final ScannedLinkPreview qrLinkView;
    public QRScanner qrScanner;
    public final RecordControl recordControl;
    public AnimatorSet recordingAnimator;
    public final RectF rectF;
    public final HintView2 removeCollageHint;
    public boolean requestedCameraPermission;
    public final DarkThemeResourceProvider resourcesProvider;
    public final FlashViews.ImageViewInvertable rotateButton;
    public final HintView2 savedDualHint;
    public boolean scrollingX;
    public boolean scrollingY;
    public long selectedDialogId;
    public ArrayList selectedEntries;
    public ArrayList selectedEntriesOrder;
    public int shiftDp;
    public boolean showSavedDraftHint;
    public boolean shownLimitReached;
    public final ButtonWithCounterView startLiveButton;
    public boolean stoppingTakingVideo;
    public final AnonymousClass11 storiesSelector;
    public boolean switchingStory;
    public boolean takingPhoto;
    public boolean takingVideo;
    public ImageView themeButton;
    public RLottieDrawable themeButtonDrawable;
    public final TimelineView timelineView;
    public final SimpleTextView titleTextView;
    public final TrashView trash;
    public int underControls;
    public boolean underStatusBar;
    public boolean videoError;
    public final PreviewView.TextureViewHolder videoTextureHolder;
    public final VideoTimeView videoTimeView;
    public final FrameLayout videoTimelineContainerView;
    public boolean videoTimerShown;
    public final VideoTimerView videoTimerView;
    public boolean wasGalleryOpen;
    public boolean wasSend;
    public long wasSendPeer;
    public StoryRecorder$$ExternalSyntheticLambda9 whenOpenDone;
    public final WindowManager.LayoutParams windowLayoutParams;
    public final WindowManager windowManager;
    public final WindowView windowView;
    public AnimatorSet zoomControlAnimation;
    public Runnable zoomControlHideRunnable;
    public final ZoomControlView zoomControlView;

    public final class AnonymousClass11 extends MultipleStoriesSelector {
        public final Path path;

        public AnonymousClass11(Activity activity, DarkThemeResourceProvider darkThemeResourceProvider, BlurringShader.BlurManager blurManager) {
            super(activity, darkThemeResourceProvider, blurManager);
            this.path = new Path();
        }
    }

    public final class AnonymousClass12 extends StoryModeTabs {
        public AnonymousClass12(Activity activity) {
            super(activity);
        }
    }

    public final class AnonymousClass13 implements RecordControl.Delegate {
        public AnonymousClass13() {
        }

        public final void onCheckClick() {
            StoryRecorder storyRecorder = StoryRecorder.this;
            ArrayList<StoryEntry> content = storyRecorder.collageLayoutView.getContent();
            int i = 0;
            if (content.size() == 1) {
                storyRecorder.outputEntry = content.get(0);
            } else {
                storyRecorder.outputEntry = StoryEntry.asCollage(storyRecorder.collageLayoutView.getLayout(), storyRecorder.collageLayoutView.getContent());
            }
            StoryEntry storyEntry = storyRecorder.outputEntry;
            if (storyEntry != null && storyEntry.isVideo) {
                i = 1;
            }
            storyRecorder.mode = i;
            AnonymousClass12 anonymousClass12 = storyRecorder.modeSwitcherView;
            if (anonymousClass12 != null) {
                anonymousClass12.switchMode(i);
            }
            StoryPrivacySelector.applySaved(storyRecorder.currentAccount, storyRecorder.outputEntry);
            storyRecorder.navigateTo(1, true);
        }

        public final void onFlipClick() {
            ArrayList arrayList;
            StoryRecorder storyRecorder = StoryRecorder.this;
            AnonymousClass25 anonymousClass25 = storyRecorder.cameraView;
            if (anonymousClass25 == null || storyRecorder.awaitingPlayer || storyRecorder.takingPhoto || !anonymousClass25.isInited()) {
                return;
            }
            StoryRecorder storyRecorder2 = StoryRecorder.this;
            if (storyRecorder2.currentPage != 0) {
                return;
            }
            HintView2 hintView2 = storyRecorder2.savedDualHint;
            if (hintView2 != null) {
                hintView2.hide(true);
            }
            if (StoryRecorder.this.useDisplayFlashlight() && (arrayList = StoryRecorder.this.frontfaceFlashModes) != null && !arrayList.isEmpty()) {
                StoryRecorder storyRecorder3 = StoryRecorder.this;
                ApplicationLoader.applicationContext.getSharedPreferences("camera", 0).edit().putString("flashMode", (String) storyRecorder3.frontfaceFlashModes.get(storyRecorder3.frontfaceFlashMode)).commit();
            }
            StoryRecorder.this.cameraView.switchCamera();
            MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", StoryRecorder.this.cameraView.isFrontface()).apply();
            if (!StoryRecorder.this.useDisplayFlashlight()) {
                StoryRecorder.this.flashViews.flashOut();
                return;
            }
            FlashViews flashViews = StoryRecorder.this.flashViews;
            flashViews.setScreenBrightness(flashViews.intensity);
            flashViews.flashTo(1.0f, 320L, null);
        }

        public final void onPhotoShoot() {
            AnonymousClass25 anonymousClass25;
            StoryRecorder storyRecorder = StoryRecorder.this;
            if (storyRecorder.takingPhoto || storyRecorder.awaitingPlayer || storyRecorder.currentPage != 0 || (anonymousClass25 = storyRecorder.cameraView) == null || !anonymousClass25.isInited()) {
                return;
            }
            storyRecorder.cameraHint.hide(true);
            File file = storyRecorder.outputFile;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                storyRecorder.outputFile = null;
            }
            QRScanner qRScanner = storyRecorder.qrScanner;
            if (qRScanner != null) {
                qRScanner.setPaused(true);
            }
            storyRecorder.outputFile = StoryEntry.makeCacheFile(storyRecorder.currentAccount, "jpg");
            storyRecorder.takingPhoto = true;
            storyRecorder.checkFrontfaceFlashModes();
            storyRecorder.isDark = false;
            if (storyRecorder.cameraView.isFrontface() && storyRecorder.frontfaceFlashMode == 1) {
                StoryRecorder.access$10900(storyRecorder);
            }
            if (!storyRecorder.useDisplayFlashlight()) {
                takePicture(null);
                return;
            }
            FlashViews flashViews = storyRecorder.flashViews;
            VoIPFragment$$ExternalSyntheticLambda7 voIPFragment$$ExternalSyntheticLambda7 = new VoIPFragment$$ExternalSyntheticLambda7(this, 20);
            flashViews.setScreenBrightness(flashViews.intensity);
            flashViews.flashTo(1.0f, 320L, new FlashViews$$ExternalSyntheticLambda2(flashViews, voIPFragment$$ExternalSyntheticLambda7, 0));
        }

        public final void onVideoRecordEnd(boolean z) {
            StoryRecorder storyRecorder = StoryRecorder.this;
            if (storyRecorder.stoppingTakingVideo || !storyRecorder.takingVideo) {
                return;
            }
            storyRecorder.stoppingTakingVideo = true;
            AndroidUtilities.runOnUIThread(new StoryRecorder$13$$ExternalSyntheticLambda0(this, 0), z ? 0L : 400L);
        }

        public final void onVideoRecordStart(Runnable runnable, boolean z) {
            AnonymousClass25 anonymousClass25;
            StoryRecorder storyRecorder = StoryRecorder.this;
            if (storyRecorder.takingVideo || storyRecorder.stoppingTakingVideo || storyRecorder.awaitingPlayer || storyRecorder.currentPage != 0 || (anonymousClass25 = storyRecorder.cameraView) == null || anonymousClass25.getCameraSession() == null) {
                return;
            }
            HintView2 hintView2 = storyRecorder.dualHint;
            if (hintView2 != null) {
                hintView2.hide(true);
            }
            HintView2 hintView3 = storyRecorder.savedDualHint;
            if (hintView3 != null) {
                hintView3.hide(true);
            }
            storyRecorder.cameraHint.hide(true);
            storyRecorder.takingVideo = true;
            QRScanner qRScanner = storyRecorder.qrScanner;
            if (qRScanner != null) {
                qRScanner.setPaused(true);
            }
            File file = storyRecorder.outputFile;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                storyRecorder.outputFile = null;
            }
            storyRecorder.outputFile = StoryEntry.makeCacheFile(storyRecorder.currentAccount, "mp4");
            storyRecorder.checkFrontfaceFlashModes();
            storyRecorder.isDark = false;
            if (storyRecorder.cameraView.isFrontface() && storyRecorder.frontfaceFlashMode == 1) {
                StoryRecorder.access$10900(storyRecorder);
            }
            if (!storyRecorder.useDisplayFlashlight()) {
                startRecording(runnable, z);
                return;
            }
            FlashViews flashViews = storyRecorder.flashViews;
            StoryRecorder$13$$ExternalSyntheticLambda2 storyRecorder$13$$ExternalSyntheticLambda2 = new StoryRecorder$13$$ExternalSyntheticLambda2(this, z, runnable);
            flashViews.setScreenBrightness(flashViews.intensity);
            flashViews.flashTo(1.0f, 320L, storyRecorder$13$$ExternalSyntheticLambda2);
        }

        public final void startRecording(Runnable runnable, boolean z) {
            StoryRecorder storyRecorder = StoryRecorder.this;
            if (storyRecorder.cameraView == null) {
                return;
            }
            CameraController.getInstance().recordVideo(storyRecorder.cameraView.getCameraSessionObject(), storyRecorder.outputFile, false, new StoriesViewPager$$ExternalSyntheticLambda0(this, 29), new StoryRecorder$13$$ExternalSyntheticLambda2(this, runnable, z), storyRecorder.cameraView, true);
            if (storyRecorder.mode != 1) {
                storyRecorder.mode = 1;
                storyRecorder.collageListView.setVisible(false, true);
                storyRecorder.showVideoTimer(storyRecorder.mode == 1, true);
                storyRecorder.modeSwitcherView.switchMode(storyRecorder.mode);
                RecordControl recordControl = storyRecorder.recordControl;
                boolean z2 = storyRecorder.mode == 1;
                recordControl.overrideStartModeIsVideoT = -1.0f;
                recordControl.startModeIsVideo = z2;
                recordControl.invalidate();
            }
        }

        public final void takePicture(Utilities.Callback callback) {
            boolean z;
            StoryRecorder storyRecorder = StoryRecorder.this;
            if (!storyRecorder.useDisplayFlashlight()) {
                storyRecorder.cameraView.startTakePictureAnimation(true);
            }
            if ((storyRecorder.cameraView.isDual() && TextUtils.equals(storyRecorder.cameraView.getCameraSession().getCurrentFlashMode(), "off")) || storyRecorder.collageLayoutView.hasLayout()) {
                if (!storyRecorder.collageLayoutView.hasLayout()) {
                    storyRecorder.cameraView.pauseAsTakingPicture();
                }
                Bitmap bitmap = storyRecorder.cameraView.getTextureView().getBitmap();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(storyRecorder.outputFile.getAbsoluteFile());
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
                QRScanner qRScanner = storyRecorder.qrScanner;
                if (qRScanner != null) {
                    qRScanner.setPaused(true);
                }
                storyRecorder.takingPhoto = CameraController.getInstance().takePicture(storyRecorder.outputFile, true, storyRecorder.cameraView.getCameraSessionObject(), new ThemeActivity$$ExternalSyntheticLambda19(7, this, callback));
                return;
            }
            storyRecorder.takingPhoto = false;
            QRScanner qRScanner2 = storyRecorder.qrScanner;
            if (qRScanner2 != null) {
                qRScanner2.setPaused(false);
            }
            StoryEntry storyEntryFromPhotoShoot = StoryEntry.fromPhotoShoot(0, storyRecorder.outputFile);
            storyEntryFromPhotoShoot.botId = storyRecorder.botId;
            storyEntryFromPhotoShoot.botLang = storyRecorder.botLang;
            boolean zHasLayout = storyRecorder.collageLayoutView.hasLayout();
            int i = storyRecorder.currentAccount;
            if (!zHasLayout) {
                storyRecorder.outputEntry = storyEntryFromPhotoShoot;
                StoryPrivacySelector.applySaved(i, storyEntryFromPhotoShoot);
                storyRecorder.fromGallery = false;
                if (callback != null) {
                    callback.run(new StoryRecorder$13$$ExternalSyntheticLambda0(this, 1));
                    return;
                } else {
                    storyRecorder.navigateTo(1, true);
                    return;
                }
            }
            storyRecorder.outputFile = null;
            if (storyRecorder.collageLayoutView.push(storyEntryFromPhotoShoot)) {
                StoryEntry storyEntryAsCollage = StoryEntry.asCollage(storyRecorder.collageLayoutView.getLayout(), storyRecorder.collageLayoutView.getContent());
                storyRecorder.outputEntry = storyEntryAsCollage;
                StoryPrivacySelector.applySaved(i, storyEntryAsCollage);
                storyRecorder.fromGallery = false;
                if (callback != null) {
                    callback.run(null);
                }
            } else if (callback != null) {
                callback.run(null);
            }
            storyRecorder.updateActionBarButtons(true);
        }
    }

    public final class AnonymousClass15 extends CharacterStyle {
        @Override
        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setAlpha(128);
        }
    }

    public final class AnonymousClass16 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final StoryRecorder this$0;
        public final int val$oldPage;
        public final int val$page;

        public AnonymousClass16(StoryRecorder storyRecorder, int i, int i2, int i3) {
            this.$r8$classId = i3;
            this.this$0 = storyRecorder;
            this.val$oldPage = i;
            this.val$page = i2;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    this.this$0.onNavigateEnd(this.val$oldPage, this.val$page);
                    break;
                default:
                    int i = this.val$oldPage;
                    int i2 = this.val$page;
                    if (i != i2) {
                        this.this$0.onSwitchEditModeEnd(i, i2);
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass17 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final StoryRecorder this$0;

        public AnonymousClass17(StoryRecorder storyRecorder, int i) {
            this.$r8$classId = i;
            this.this$0 = storyRecorder;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    StoryRecorder storyRecorder = this.this$0;
                    storyRecorder.containerViewBackAnimator = null;
                    storyRecorder.containerView.setTranslationY(0.0f);
                    storyRecorder.containerView.setTranslationY2(0.0f);
                    break;
                case 1:
                    StoryRecorder storyRecorder2 = this.this$0;
                    storyRecorder2.windowView.removeView(storyRecorder2.galleryListView);
                    storyRecorder2.galleryListView = null;
                    storyRecorder2.galleryOpenCloseAnimator = null;
                    storyRecorder2.galleryListViewOpening = null;
                    KeyboardNotifier keyboardNotifier = storyRecorder2.captionEdit.keyboardNotifier;
                    keyboardNotifier.ignoring = storyRecorder2.currentPage != 1;
                    keyboardNotifier.update();
                    break;
                default:
                    StoryRecorder storyRecorder3 = this.this$0;
                    AnonymousClass31 anonymousClass31 = storyRecorder3.changeDayNightView;
                    if (anonymousClass31 != null) {
                        if (anonymousClass31.getParent() != null) {
                            ((ViewGroup) storyRecorder3.changeDayNightView.getParent()).removeView(storyRecorder3.changeDayNightView);
                        }
                        storyRecorder3.changeDayNightView = null;
                    }
                    storyRecorder3.changeDayNightViewAnimator = null;
                    super.onAnimationEnd(animator);
                    break;
            }
        }
    }

    public final class AnonymousClass19 extends GalleryListView {
        public AnonymousClass19(int i, Context context, DarkThemeResourceProvider darkThemeResourceProvider, MediaController.AlbumEntry albumEntry, boolean z, boolean z2, boolean z3) {
            super(i, context, darkThemeResourceProvider, albumEntry, z, 1.39f, z2, z3);
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= top()) {
                return super.dispatchTouchEvent(motionEvent);
            }
            StoryRecorder storyRecorder = StoryRecorder.this;
            storyRecorder.galleryClosing = true;
            storyRecorder.animateGalleryListView(false);
            return true;
        }

        @Override
        public final void firstLayout() {
            StoryRecorder storyRecorder = StoryRecorder.this;
            storyRecorder.galleryListView.setTranslationY(storyRecorder.windowView.getMeasuredHeight() - storyRecorder.galleryListView.top());
            StoryRecorder$$ExternalSyntheticLambda6 storyRecorder$$ExternalSyntheticLambda6 = storyRecorder.galleryLayouted;
            if (storyRecorder$$ExternalSyntheticLambda6 != null) {
                storyRecorder$$ExternalSyntheticLambda6.run();
                storyRecorder.galleryLayouted = null;
            }
        }

        @Override
        public final void onFullScreen(boolean z) {
            if (StoryRecorder.this.currentPage == 0 && z) {
                AndroidUtilities.runOnUIThread(new VoIPFragment$12$$ExternalSyntheticLambda0(this, 18));
            }
        }

        @Override
        public final void setTranslationY(float f) {
            super.setTranslationY(f);
            StoryRecorder storyRecorder = StoryRecorder.this;
            if (storyRecorder.applyContainerViewTranslation2) {
                float fClamp = Utilities.clamp(1.0f - (f / (storyRecorder.windowView.getMeasuredHeight() - storyRecorder.galleryListView.top())), 1.0f, 0.0f);
                storyRecorder.containerView.setTranslationY2(AndroidUtilities.dp(-32.0f) * fClamp);
                storyRecorder.containerView.setAlpha(1.0f - (0.6f * fClamp));
                storyRecorder.actionBarContainer.setAlpha(1.0f - fClamp);
            }
        }
    }

    public final class AnonymousClass22 implements ValueAnimator.AnimatorUpdateListener {
        public final int $r8$classId;
        public final StoryRecorder this$0;

        public AnonymousClass22(StoryRecorder storyRecorder, int i) {
            this.$r8$classId = i;
            this.this$0 = storyRecorder;
        }

        @Override
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            switch (this.$r8$classId) {
                case 0:
                    this.this$0.captionEdit.invalidateBlur();
                    break;
                default:
                    this.this$0.updateActionBarButtonsOffsets();
                    break;
            }
        }
    }

    public final class AnonymousClass24 extends PaintView {
        public boolean multitouch;

        public AnonymousClass24(Context context, boolean z, File file, boolean z2, boolean z3, WindowView windowView, Activity activity, int i, Bitmap bitmap, Bitmap bitmap2, int i2, ArrayList arrayList, StoryEntry storyEntry, int i3, int i4, MediaController.CropState cropState, BlurringShader.BlurManager blurManager, DarkThemeResourceProvider darkThemeResourceProvider, PreviewView.TextureViewHolder textureViewHolder, AnonymousClass7 anonymousClass7) {
            super(context, z, file, z2, z3, windowView, activity, i, bitmap, bitmap2, i2, arrayList, storyEntry, i3, i4, cropState, blurManager, darkThemeResourceProvider, textureViewHolder, anonymousClass7);
        }

        @Override
        public final void editSelectedTextEntity$1() {
            StoryRecorder storyRecorder = StoryRecorder.this;
            AndroidUtilities.hideKeyboard(storyRecorder.captionEdit.editText.editText);
            storyRecorder.switchToEditMode(0, false, true);
            EntityView entityView = this.currentEntityView;
            if (!(entityView instanceof TextPaintView) || this.editingText) {
                return;
            }
            TextPaintView textPaintView = (TextPaintView) entityView;
            this.editingText = true;
            textPaintView.beginEditing();
            View focusedView = textPaintView.getFocusedView();
            focusedView.requestFocus();
            AndroidUtilities.showKeyboard(focusedView);
        }

        @Override
        public final void onEntityDragEnd(boolean z) {
            EntityView entityView;
            if (!isEntityDeletable()) {
                z = false;
            }
            StoryRecorder storyRecorder = StoryRecorder.this;
            storyRecorder.captionEdit.clearAnimation();
            ViewPropertyAnimator duration = storyRecorder.captionEdit.animate().alpha(storyRecorder.currentEditMode == -1 ? 1.0f : 0.0f).setDuration(180L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            storyRecorder.videoTimelineContainerView.clearAnimation();
            ViewPropertyAnimator viewPropertyAnimatorAnimate = storyRecorder.videoTimelineContainerView.animate();
            int i = storyRecorder.currentEditMode;
            viewPropertyAnimatorAnimate.alpha((i == -1 || i == 2) ? 1.0f : 0.0f).setDuration(180L).setInterpolator(cubicBezierInterpolator).start();
            showTrash(false, z);
            if (z && (entityView = this.currentEntityView) != null) {
                removeEntity$1(entityView);
            }
            updatePreviewViewTranslationY();
            this.forceChanges = true;
            this.multitouch = false;
        }

        @Override
        public final void onEntityDragMultitouchEnd() {
            this.multitouch = false;
            showTrash(isEntityDeletable(), false);
            StoryRecorder.this.previewHighlight.show(false, false, null);
        }

        @Override
        public final void onEntityDragMultitouchStart() {
            this.multitouch = true;
            StoryRecorder.this.paintView.showReactionsLayout(false);
            showTrash(false, false);
        }

        @Override
        public final void onEntityDragStart() {
            StoryRecorder storyRecorder = StoryRecorder.this;
            storyRecorder.paintView.showReactionsLayout(false);
            storyRecorder.captionEdit.clearAnimation();
            ViewPropertyAnimator duration = storyRecorder.captionEdit.animate().alpha(0.0f).setDuration(180L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            if (storyRecorder.currentEditMode != 2) {
                storyRecorder.videoTimelineContainerView.clearAnimation();
                storyRecorder.videoTimelineContainerView.animate().alpha(0.0f).setDuration(180L).setInterpolator(cubicBezierInterpolator).start();
            }
            showTrash(isEntityDeletable(), false);
        }

        @Override
        public final void onEntityDragTrash(boolean z) {
            StoryRecorder.this.trash.onDragInfo(z, false);
        }

        @Override
        public final void onEntityDraggedBottom(boolean z) {
            StoryRecorder storyRecorder = StoryRecorder.this;
            PreviewHighlightView previewHighlightView = storyRecorder.previewHighlight;
            CharSequence text = storyRecorder.captionEdit.getText();
            previewHighlightView.getClass();
            previewHighlightView.storyCaptionView.captionTextview.setText(AnimatedEmojiSpan.cloneSpans(new SpannableString(text)), null, null, false, false);
            storyRecorder.previewHighlight.show(false, z && this.multitouch, null);
        }

        @Override
        public final void onEntityDraggedTop(boolean z) {
            StoryRecorder storyRecorder = StoryRecorder.this;
            storyRecorder.previewHighlight.show(true, z, storyRecorder.actionBarContainer);
        }

        @Override
        public final void onEntityHandleTouched() {
            StoryRecorder.this.paintView.showReactionsLayout(false);
        }

        @Override
        public final void onOpenCloseStickersAlert(boolean z) {
            StoryRecorder storyRecorder = StoryRecorder.this;
            AnonymousClass7 anonymousClass7 = storyRecorder.previewView;
            if (anonymousClass7 != null) {
                anonymousClass7.updatePauseReason(6, z);
                ChatActivity.AnonymousClass27 anonymousClass27 = storyRecorder.playButton;
                if (anonymousClass27 != null) {
                    ((PlayPauseDrawable) anonymousClass27.this$0).setPause(!storyRecorder.previewView.pauseLinks.contains(-9982), true);
                }
            }
            AnonymousClass8 anonymousClass8 = storyRecorder.captionEdit;
            if (anonymousClass8 != null) {
                anonymousClass8.ignoreTouches = z;
                KeyboardNotifier keyboardNotifier = anonymousClass8.keyboardNotifier;
                keyboardNotifier.ignoring = z;
                keyboardNotifier.update();
            }
        }

        public final void showTrash(boolean z, boolean z2) {
            StoryRecorder storyRecorder = StoryRecorder.this;
            if (!z) {
                storyRecorder.trash.onDragInfo(false, z2);
                storyRecorder.trash.clearAnimation();
                storyRecorder.trash.animate().alpha(0.0f).withEndAction(new VoIPFragment$12$$ExternalSyntheticLambda0(this, 19)).setDuration(180L).setInterpolator(CubicBezierInterpolator.EASE_OUT).setStartDelay(z2 ? 500L : 0L).start();
            } else {
                storyRecorder.trash.setVisibility(0);
                storyRecorder.trash.setAlpha(0.0f);
                storyRecorder.trash.clearAnimation();
                storyRecorder.trash.animate().alpha(1.0f).setDuration(180L).setInterpolator(CubicBezierInterpolator.EASE_OUT).start();
            }
        }
    }

    public final class AnonymousClass25 extends DualCameraView {
        public AnonymousClass25(Context context, boolean z) {
            super(context, z);
        }

        @Override
        public final void onEntityDraggedBottom(boolean z) {
            StoryRecorder storyRecorder = StoryRecorder.this;
            PreviewHighlightView previewHighlightView = storyRecorder.previewHighlight;
            CharSequence text = storyRecorder.captionEdit.getText();
            previewHighlightView.getClass();
            previewHighlightView.storyCaptionView.captionTextview.setText(AnimatedEmojiSpan.cloneSpans(new SpannableString(text)), null, null, false, false);
            storyRecorder.previewHighlight.show(false, z, storyRecorder.controlContainer);
        }

        @Override
        public final void receivedAmplitude(double d) {
            RecordControl recordControl = StoryRecorder.this.recordControl;
            if (recordControl != null) {
                recordControl.amplitude = Utilities.clamp((float) (d / 1800.0d), 1.0f, 0.0f);
            }
        }

        @Override
        public final void toggleDual() {
            super.toggleDual();
            StoryRecorder storyRecorder = StoryRecorder.this;
            storyRecorder.dualButton.setValue(isDual());
            storyRecorder.dualButton.setContentDescription(LocaleController.getString(isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
            storyRecorder.setCameraFlashModeIcon(storyRecorder.getCurrentFlashMode());
        }
    }

    public final class AnonymousClass26 extends BaseFragment {
        public final int $r8$classId;
        public final StoryRecorder this$0;

        public AnonymousClass26(StoryRecorder storyRecorder, int i) {
            super(null);
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    this.this$0 = storyRecorder;
                    super(null);
                    this.currentAccount = storyRecorder.currentAccount;
                    break;
                default:
                    this.this$0 = storyRecorder;
                    break;
            }
        }

        @Override
        public final Activity getParentActivity() {
            switch (this.$r8$classId) {
                case 0:
                    break;
            }
            return this.this$0.activity;
        }

        @Override
        public final Theme.ResourcesProvider getResourceProvider() {
            switch (this.$r8$classId) {
                case 0:
                    return new PeerStoriesView.AnonymousClass18(7, this.this$0.resourcesProvider);
                default:
                    return new PeerStoriesView.AnonymousClass18(8, this.this$0.resourcesProvider);
            }
        }

        @Override
        public final boolean isLightStatusBar() {
            switch (this.$r8$classId) {
            }
            return false;
        }

        @Override
        public boolean presentFragment(BaseFragment baseFragment) {
            switch (this.$r8$classId) {
                case 0:
                    this.this$0.openPremium$1();
                    return false;
                default:
                    return super.presentFragment(baseFragment);
            }
        }

        @Override
        public Dialog showDialog(Dialog dialog) {
            switch (this.$r8$classId) {
                case 1:
                    dialog.show();
                    return dialog;
                default:
                    return super.showDialog(dialog);
            }
        }
    }

    public final class AnonymousClass27 extends LimitReachedBottomSheet {
    }

    public final class AnonymousClass31 extends View {
        public final int $r8$classId;
        public final NotificationCenter.NotificationCenterDelegate this$0;
        public final Bitmap val$bitmap;
        public final Canvas val$bitmapCanvas;
        public final Paint val$bitmapPaint;
        public final float val$cx;
        public final float val$cy;
        public final boolean val$isDark;
        public final float val$r;
        public final float val$x;
        public final Paint val$xRefPaint;
        public final float val$y;

        public AnonymousClass31(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, boolean z, Canvas canvas, float f, float f2, float f3, Paint paint, Bitmap bitmap, Paint paint2, float f4, float f5, int i) {
            super(context);
            this.$r8$classId = i;
            this.this$0 = notificationCenterDelegate;
            this.val$isDark = z;
            this.val$bitmapCanvas = canvas;
            this.val$cx = f;
            this.val$cy = f2;
            this.val$r = f3;
            this.val$xRefPaint = paint;
            this.val$bitmap = bitmap;
            this.val$bitmapPaint = paint2;
            this.val$x = f4;
            this.val$y = f5;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    super.onDraw(canvas);
                    boolean z = this.val$isDark;
                    Paint paint = this.val$bitmapPaint;
                    float f = this.val$r;
                    float f2 = this.val$cy;
                    float f3 = this.val$cx;
                    StoryRecorder storyRecorder = (StoryRecorder) this.this$0;
                    if (z) {
                        float f4 = storyRecorder.changeDayNightViewProgress;
                        if (f4 > 0.0f) {
                            this.val$bitmapCanvas.drawCircle(f3, f2, f * f4, this.val$xRefPaint);
                        }
                        canvas.drawBitmap(this.val$bitmap, 0.0f, 0.0f, paint);
                    } else {
                        canvas.drawCircle(f3, f2, (1.0f - storyRecorder.changeDayNightViewProgress) * f, paint);
                    }
                    canvas.save();
                    canvas.translate(this.val$x, this.val$y);
                    storyRecorder.themeButton.draw(canvas);
                    canvas.restore();
                    break;
                case 1:
                    super.onDraw(canvas);
                    boolean z2 = this.val$isDark;
                    Paint paint2 = this.val$bitmapPaint;
                    float f5 = this.val$r;
                    float f6 = this.val$cy;
                    float f7 = this.val$cx;
                    ChatThemeBottomSheet chatThemeBottomSheet = (ChatThemeBottomSheet) this.this$0;
                    if (z2) {
                        float f8 = chatThemeBottomSheet.changeDayNightViewProgress;
                        if (f8 > 0.0f) {
                            this.val$bitmapCanvas.drawCircle(f7, f6, f5 * f8, this.val$xRefPaint);
                        }
                        canvas.drawBitmap(this.val$bitmap, 0.0f, 0.0f, paint2);
                    } else {
                        canvas.drawCircle(f7, f6, (1.0f - chatThemeBottomSheet.changeDayNightViewProgress) * f5, paint2);
                    }
                    canvas.save();
                    canvas.translate(this.val$x, this.val$y);
                    chatThemeBottomSheet.darkThemeView.draw(canvas);
                    canvas.restore();
                    break;
                default:
                    super.onDraw(canvas);
                    boolean z3 = this.val$isDark;
                    Paint paint3 = this.val$bitmapPaint;
                    float f9 = this.val$r;
                    float f10 = this.val$cy;
                    float f11 = this.val$cx;
                    QrActivity.ThemeListViewController themeListViewController = (QrActivity.ThemeListViewController) this.this$0;
                    if (z3) {
                        float f12 = themeListViewController.changeDayNightViewProgress;
                        if (f12 > 0.0f) {
                            this.val$bitmapCanvas.drawCircle(f11, f10, f9 * f12, this.val$xRefPaint);
                        }
                        canvas.drawBitmap(this.val$bitmap, 0.0f, 0.0f, paint3);
                    } else {
                        canvas.drawCircle(f11, f10, (1.0f - themeListViewController.changeDayNightViewProgress) * f9, paint3);
                    }
                    canvas.save();
                    canvas.translate(this.val$x, this.val$y);
                    themeListViewController.darkThemeView.draw(canvas);
                    canvas.restore();
                    break;
            }
        }
    }

    public final class AnonymousClass36 extends CropEditor {
        public AnonymousClass36(Context context, AnonymousClass7 anonymousClass7) {
            super(context, anonymousClass7);
        }
    }

    public final class AnonymousClass37 extends CropInlineEditor {
        public AnonymousClass37(Context context, AnonymousClass7 anonymousClass7) {
            super(context, anonymousClass7);
        }
    }

    public final class AnonymousClass4 extends FrameLayout {
        public AnonymousClass4(Activity activity) {
            super(activity);
        }

        @Override
        public final void setTranslationY(float f) {
            if (getTranslationY() != f) {
                StoryRecorder storyRecorder = StoryRecorder.this;
                if (storyRecorder.captionEdit != null) {
                    super.setTranslationY(f);
                    storyRecorder.captionEdit.updateMentionsLayoutPosition();
                }
            }
        }
    }

    public final class AnonymousClass6 extends CollageLayoutView2 {
        public AnonymousClass6(Activity activity, BlurringShader.BlurManager blurManager, FrameLayout frameLayout, DarkThemeResourceProvider darkThemeResourceProvider) {
            super(activity, blurManager, frameLayout, darkThemeResourceProvider);
        }
    }

    public final class AnonymousClass7 extends PreviewView {
        public AnonymousClass7(Activity activity, BlurringShader.BlurManager blurManager, PreviewView.TextureViewHolder textureViewHolder) {
            super(activity, blurManager, textureViewHolder);
        }

        @Override
        public final void applyMatrix() {
            StoryEntry storyEntry = this.entry;
            if (storyEntry != null && !storyEntry.isRepostMessage) {
                if (this.textureView != null) {
                    Matrix matrix = this.matrix;
                    matrix.set(storyEntry.matrix);
                    float width = 1.0f / getWidth();
                    int i = this.entry.width;
                    if (i < 0) {
                        i = this.videoWidth;
                    }
                    float f = width * i;
                    float height = 1.0f / getHeight();
                    int i2 = this.entry.height;
                    if (i2 < 0) {
                        i2 = this.videoHeight;
                    }
                    matrix.preScale(f, height * i2);
                    matrix.postScale(getWidth() / this.entry.resultWidth, getHeight() / this.entry.resultHeight);
                    Matrix matrix2 = this.transformBackMatrix;
                    matrix2.reset();
                    this.transformMatrix.invert(matrix2);
                    this.textureView.setTransform(matrix);
                    this.textureView.invalidate();
                }
                invalidate();
            }
            StoryRecorder.this.applyFilterMatrix();
        }

        @Override
        public final void invalidateTextureViewHolder() {
            AnonymousClass24 anonymousClass24;
            StoryRecorder storyRecorder = StoryRecorder.this;
            StoryEntry storyEntry = storyRecorder.outputEntry;
            if (storyEntry == null || !storyEntry.isRepostMessage || !storyEntry.isVideo || (anonymousClass24 = storyRecorder.paintView) == null || anonymousClass24.entitiesView == null) {
                return;
            }
            for (int i = 0; i < storyRecorder.paintView.entitiesView.getChildCount(); i++) {
                View childAt = storyRecorder.paintView.entitiesView.getChildAt(i);
                if (childAt instanceof MessageEntityView) {
                    ((MessageEntityView) childAt).invalidateAll();
                }
            }
        }
    }

    public final class AnonymousClass8 extends CaptionStory {
        public final Path path;

        public AnonymousClass8(Activity activity, FrameLayout frameLayout, SizeNotifierFrameLayout sizeNotifierFrameLayout, FrameLayout frameLayout2, DarkThemeResourceProvider darkThemeResourceProvider, BlurringShader.BlurManager blurManager) {
            super(activity, frameLayout, sizeNotifierFrameLayout, frameLayout2, darkThemeResourceProvider, blurManager);
            this.path = new Path();
        }

        @Override
        public final boolean captionLimitToast() {
            Bulletin bulletin;
            if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || ((bulletin = Bulletin.visibleBulletin) != null && bulletin.tag == 2)) {
                return false;
            }
            int i = MessagesController.getInstance(this.currentAccount).storyCaptionLengthLimitPremium;
            SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("CaptionPremiumSubtitle", Math.round(i / MessagesController.getInstance(this.currentAccount).storyCaptionLengthLimitDefault), DiffUtil.m(i, "")));
            int iIndexOf = spannableStringBuilderReplaceTags.toString().indexOf("__");
            if (iIndexOf >= 0) {
                spannableStringBuilderReplaceTags.replace(iIndexOf, iIndexOf + 2, (CharSequence) "");
                int iIndexOf2 = spannableStringBuilderReplaceTags.toString().indexOf("__");
                if (iIndexOf2 >= 0) {
                    spannableStringBuilderReplaceTags.replace(iIndexOf2, iIndexOf2 + 2, (CharSequence) "");
                    spannableStringBuilderReplaceTags.setSpan(new ForegroundColorSpan(Theme.getColor(Theme.key_chat_messageLinkIn, this.resourcesProvider)), iIndexOf, iIndexOf2, 33);
                    spannableStringBuilderReplaceTags.setSpan(new ChatActivity.AnonymousClass102(this, 9), iIndexOf, iIndexOf2, 33);
                }
            }
            Bulletin bulletinCreateSimpleBulletin = new BulletinFactory(StoryRecorder.this.captionContainer, this.resourcesProvider).createSimpleBulletin(LocaleController.getString(R.string.CaptionPremiumTitle), spannableStringBuilderReplaceTags, R.raw.caption_limit);
            bulletinCreateSimpleBulletin.tag = 2;
            bulletinCreateSimpleBulletin.duration = 5000;
            bulletinCreateSimpleBulletin.show(false);
            return true;
        }

        @Override
        public final boolean customBlur() {
            return StoryRecorder.this.blurManager.hasRenderNode();
        }

        @Override
        public final void drawBlur(BlurringShader.StoryBlurDrawer storyBlurDrawer, Canvas canvas, RectF rectF, float f, boolean z, float f2, float f3, boolean z2) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = this.path;
                path.rewind();
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(f2, f3);
                storyBlurDrawer.drawRect(canvas, true);
                canvas.restore();
            }
        }

        @Override
        public final void drawBlurBitmap(Bitmap bitmap) {
            StoryRecorder.this.windowView.drawBlurBitmap(bitmap, 12.0f);
            Utilities.stackBlurBitmap(bitmap, (int) 12.0f);
        }

        @Override
        public final int getTimelineHeight() {
            TimelineView timelineView;
            StoryRecorder storyRecorder = StoryRecorder.this;
            if (storyRecorder.videoTimelineContainerView == null || (timelineView = storyRecorder.timelineView) == null || timelineView.getVisibility() != 0) {
                return 0;
            }
            return storyRecorder.timelineView.getTimelineHeight();
        }

        @Override
        public final boolean ignoreTouches(float f, float f2) {
            StoryRecorder storyRecorder = StoryRecorder.this;
            AnonymousClass24 anonymousClass24 = storyRecorder.paintView;
            if (anonymousClass24 != null && anonymousClass24.entitiesView != null) {
                AnonymousClass8 anonymousClass8 = storyRecorder.captionEdit;
                if (!anonymousClass8.keyboardShown) {
                    float x = anonymousClass8.getX() + f;
                    float y = storyRecorder.captionEdit.getY() + f2;
                    float x2 = storyRecorder.captionContainer.getX() + x;
                    float y2 = storyRecorder.captionContainer.getY() + y;
                    float x3 = x2 - storyRecorder.previewContainer.getX();
                    float y3 = y2 - storyRecorder.previewContainer.getY();
                    for (int i = 0; i < storyRecorder.paintView.entitiesView.getChildCount(); i++) {
                        View childAt = storyRecorder.paintView.entitiesView.getChildAt(i);
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
            }
            return false;
        }

        @Override
        public final void invalidateDrawOver2() {
            RichDetailsCell.AnonymousClass2 anonymousClass2 = StoryRecorder.this.captionEditOverlay;
            if (anonymousClass2 != null) {
                anonymousClass2.invalidate();
            }
        }

        @Override
        public final void onCaptionLimitUpdate(boolean z) {
            boolean z2;
            StoryEntry storyEntry;
            StoryRecorder storyRecorder = StoryRecorder.this;
            PreviewButtons previewButtons = storyRecorder.previewButtons;
            if (storyRecorder.videoError || z) {
                z2 = false;
            } else {
                StoriesController storiesController = MessagesController.getInstance(this.currentAccount).getStoriesController();
                int count$1 = storyRecorder.getCount$1();
                StoriesController.StoryLimit storyLimitCheckStoryLimit = storiesController.checkStoryLimit();
                if (storyLimitCheckStoryLimit == null || !storyLimitCheckStoryLimit.active(storiesController.currentAccount, count$1) || ((storyEntry = storyRecorder.outputEntry) != null && storyEntry.isEdit)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            previewButtons.setShareEnabled(z2);
        }
    }

    public interface ClosingViewProvider {
        SourceView getView(long j);

        void preLayout(long j, LinkManager$3$$ExternalSyntheticLambda0 linkManager$3$$ExternalSyntheticLambda0);
    }

    public final class ContainerView extends FrameLayout {
        public LinearGradient topGradient;
        public final Paint topGradientPaint;
        public float translationY1;
        public float translationY2;

        public ContainerView(Activity activity) {
            super(activity);
            this.topGradientPaint = new Paint(1);
        }

        public static void measureChildExactly(View view, int i, int i2) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            boolean zDrawChild = super.drawChild(canvas, view, j);
            StoryRecorder storyRecorder = StoryRecorder.this;
            if (view == storyRecorder.previewContainer) {
                float f = storyRecorder.underStatusBar ? AndroidUtilities.statusBarHeight : 0.0f;
                LinearGradient linearGradient = this.topGradient;
                Paint paint = this.topGradientPaint;
                if (linearGradient == null) {
                    LinearGradient linearGradient2 = new LinearGradient(0.0f, f, 0.0f, f + AndroidUtilities.dp(72.0f), new int[]{1073741824, 0}, new float[]{f / (AndroidUtilities.dp(72.0f) + f), 1.0f}, Shader.TileMode.CLAMP);
                    this.topGradient = linearGradient2;
                    paint.setShader(linearGradient2);
                }
                paint.setAlpha(255);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(84.0f) + f);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
            }
            return zDrawChild;
        }

        @Override
        public final void invalidate() {
            ValueAnimator valueAnimator = StoryRecorder.this.openCloseAnimator;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                super.invalidate();
            }
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            StoryRecorder storyRecorder = StoryRecorder.this;
            int i5 = storyRecorder.underStatusBar ? storyRecorder.insetTop : 0;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            storyRecorder.previewContainer.layout(0, 0, storyRecorder.previewW, storyRecorder.previewH);
            storyRecorder.previewContainer.setPivotX(storyRecorder.previewW * 0.5f);
            FrameLayout frameLayout = storyRecorder.actionBarContainer;
            frameLayout.layout(0, i5, storyRecorder.previewW, frameLayout.getMeasuredHeight() + i5);
            FrameLayout frameLayout2 = storyRecorder.controlContainer;
            frameLayout2.layout(0, storyRecorder.previewH - frameLayout2.getMeasuredHeight(), storyRecorder.previewW, storyRecorder.previewH);
            FrameLayout frameLayout3 = storyRecorder.navbarContainer;
            int i6 = storyRecorder.previewH;
            frameLayout3.layout(0, i6, storyRecorder.previewW, frameLayout3.getMeasuredHeight() + i6);
            storyRecorder.captionContainer.layout(0, 0, storyRecorder.previewW, storyRecorder.previewH);
            RichDetailsCell.AnonymousClass2 anonymousClass2 = storyRecorder.captionEditOverlay;
            if (anonymousClass2 != null) {
                anonymousClass2.layout(0, 0, measuredWidth, measuredHeight);
            }
            storyRecorder.flashViews.foregroundView.layout(0, 0, measuredWidth, measuredHeight);
            ChatAttachAlert.AnonymousClass36 anonymousClass36 = storyRecorder.captionEdit.mentionContainer;
            if (anonymousClass36 != null) {
                anonymousClass36.layout(0, 0, storyRecorder.previewW, storyRecorder.previewH);
                storyRecorder.captionEdit.updateMentionsLayoutPosition();
            }
            PhotoFilterView photoFilterView = storyRecorder.photoFilterView;
            if (photoFilterView != null) {
                photoFilterView.layout(0, 0, photoFilterView.getMeasuredWidth(), storyRecorder.photoFilterView.getMeasuredHeight());
            }
            AnonymousClass24 anonymousClass24 = storyRecorder.paintView;
            if (anonymousClass24 != null) {
                anonymousClass24.layout(0, 0, anonymousClass24.getMeasuredWidth(), storyRecorder.paintView.getMeasuredHeight());
            }
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (childAt instanceof ItemOptions.DimView) {
                    childAt.layout(0, 0, measuredWidth, measuredHeight);
                }
            }
            setPivotX(measuredWidth / 2.0f);
            setPivotY((-measuredHeight) * 0.2f);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            StoryRecorder storyRecorder = StoryRecorder.this;
            measureChildExactly(storyRecorder.previewContainer, storyRecorder.previewW, storyRecorder.previewH);
            storyRecorder.applyFilterMatrix();
            measureChildExactly(storyRecorder.actionBarContainer, storyRecorder.previewW, AndroidUtilities.dp(150.0f));
            measureChildExactly(storyRecorder.controlContainer, storyRecorder.previewW, AndroidUtilities.dp(220.0f));
            measureChildExactly(storyRecorder.navbarContainer, storyRecorder.previewW, storyRecorder.underControls);
            measureChildExactly(storyRecorder.captionContainer, storyRecorder.previewW, storyRecorder.previewH);
            measureChildExactly(storyRecorder.flashViews.foregroundView, size, size2);
            RichDetailsCell.AnonymousClass2 anonymousClass2 = storyRecorder.captionEditOverlay;
            if (anonymousClass2 != null) {
                measureChildExactly(anonymousClass2, size, size2);
            }
            ChatAttachAlert.AnonymousClass36 anonymousClass36 = storyRecorder.captionEdit.mentionContainer;
            if (anonymousClass36 != null) {
                measureChildExactly(anonymousClass36, storyRecorder.previewW, storyRecorder.previewH);
            }
            PhotoFilterView photoFilterView = storyRecorder.photoFilterView;
            if (photoFilterView != null) {
                measureChildExactly(photoFilterView, size, size2);
            }
            AnonymousClass24 anonymousClass24 = storyRecorder.paintView;
            if (anonymousClass24 != null) {
                measureChildExactly(anonymousClass24, size, size2);
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
        public final void setTranslationY(float f) {
            this.translationY1 = f;
            super.setTranslationY(this.translationY2 + f);
            float fClamp = Utilities.clamp((f / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
            StoryRecorder storyRecorder = StoryRecorder.this;
            storyRecorder.dismissProgress = fClamp;
            storyRecorder.checkBackgroundVisibility();
            storyRecorder.windowView.invalidate();
            float fClamp2 = 1.0f - (Utilities.clamp(getTranslationY() / AndroidUtilities.dp(320.0f), 1.0f, 0.0f) * 0.1f);
            setScaleX(fClamp2);
            setScaleY(fClamp2);
        }

        public final void setTranslationY2(float f) {
            float f2 = this.translationY1;
            this.translationY2 = f;
            super.setTranslationY(f2 + f);
        }

        public final void updateBackground() {
            if (StoryRecorder.this.openType == 0) {
                setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), -16777216));
            } else {
                setBackground(null);
            }
        }
    }

    public abstract class SourceView {
        public ShareDialogCell.RepostStoryDrawable backgroundDrawable;
        public ImageReceiver backgroundImageReceiver;
        public float rounding;
        public PeerStoriesView.AnonymousClass4 view;
        public int type = 0;
        public final RectF screenRect = new RectF();

        public final class AnonymousClass1 extends SourceView {
            public final int $r8$classId;
            public final Object val$avatarImage;

            public AnonymousClass1(Object obj, int i) {
                this.$r8$classId = i;
                this.val$avatarImage = obj;
            }

            @Override
            public final void hide() {
                switch (this.$r8$classId) {
                    case 0:
                        ProfileActivity.AnonymousClass21 anonymousClass21 = (ProfileActivity.AnonymousClass21) this.val$avatarImage;
                        anonymousClass21.drawAvatar = false;
                        anonymousClass21.invalidate();
                        break;
                    case 1:
                        PeerStoriesView currentPeerView = ((StoryViewer) this.val$avatarImage).getCurrentPeerView();
                        if (currentPeerView != null) {
                            currentPeerView.animateOut(true);
                        }
                        break;
                    default:
                        BackupImageView backupImageView = (BackupImageView) this.val$avatarImage;
                        backupImageView.post(new VoIPFragment$12$$ExternalSyntheticLambda0(backupImageView, 21));
                        break;
                }
            }

            @Override
            public final void show(boolean z) {
                switch (this.$r8$classId) {
                    case 0:
                        ProfileActivity.AnonymousClass21 anonymousClass21 = (ProfileActivity.AnonymousClass21) this.val$avatarImage;
                        anonymousClass21.drawAvatar = true;
                        anonymousClass21.invalidate();
                        break;
                    case 1:
                        PeerStoriesView currentPeerView = ((StoryViewer) this.val$avatarImage).getCurrentPeerView();
                        if (currentPeerView != null) {
                            currentPeerView.animateOut(false);
                        }
                        PeerStoriesView.AnonymousClass4 anonymousClass4 = this.view;
                        if (anonymousClass4 != null) {
                            anonymousClass4.setTranslationX(0.0f);
                            this.view.setTranslationY(0.0f);
                        }
                        break;
                    default:
                        ((BackupImageView) this.val$avatarImage).setVisibility(0);
                        break;
                }
            }
        }

        public static AnonymousClass1 fromShareCell(ShareDialogCell shareDialogCell) {
            if (shareDialogCell == null) {
                return null;
            }
            BackupImageView imageView = shareDialogCell.getImageView();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(imageView, 2);
            int[] iArr = new int[2];
            imageView.getLocationOnScreen(iArr);
            RectF rectF = anonymousClass1.screenRect;
            int i = iArr[0];
            rectF.set(i, iArr[1], imageView.getWidth() + i, imageView.getHeight() + iArr[1]);
            anonymousClass1.backgroundDrawable = new ShareDialogCell.RepostStoryDrawable(imageView.getContext(), null, false, R.drawable.large_repost_story, shareDialogCell.resourcesProvider);
            anonymousClass1.rounding = Math.max(rectF.width(), rectF.height()) / 2.0f;
            return anonymousClass1;
        }

        public static AnonymousClass5 fromStoryCell(final DialogStoriesCell.StoryCell storyCell) {
            if (storyCell == null || storyCell.getRootView() == null) {
                return null;
            }
            ImageReceiver imageReceiver = storyCell.avatarImage;
            float imageWidth = imageReceiver.getImageWidth();
            final float f = imageWidth / 2.0f;
            ?? r4 = new SourceView() {
                @Override
                public final void drawAbove(Canvas canvas, float f2) {
                    float fPow = (float) Math.pow(f2, 16.0d);
                    DialogStoriesCell.StoryCell storyCell2 = storyCell;
                    float f3 = f;
                    storyCell2.drawPlus(canvas, f3, f3, fPow);
                }

                @Override
                public final void hide() {
                    DialogStoriesCell.StoryCell storyCell2 = storyCell;
                    storyCell2.post(new DialogStoriesCell$StoryCell$$ExternalSyntheticLambda2(storyCell2, 1));
                }

                @Override
                public final void show(boolean z) {
                    DialogStoriesCell.StoryCell storyCell2 = storyCell;
                    storyCell2.drawAvatar = true;
                    storyCell2.invalidate();
                    if (z) {
                        int[] iArr = new int[2];
                        storyCell2.getLocationInWindow(iArr);
                        LaunchActivity.makeRipple((storyCell2.getWidth() / 2.0f) + iArr[0], (storyCell2.getHeight() / 2.0f) + iArr[1], 1.0f);
                    }
                }
            };
            int[] iArr = new int[2];
            float[] fArr = new float[2];
            storyCell.getRootView().getLocationOnScreen(iArr);
            AndroidUtilities.getViewPositionInParent(storyCell, (ViewGroup) storyCell.getRootView(), fArr);
            float imageX = imageReceiver.getImageX() + iArr[0] + fArr[0];
            float imageY = imageReceiver.getImageY() + iArr[1] + fArr[1];
            RectF rectF = r4.screenRect;
            rectF.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
            r4.backgroundImageReceiver = imageReceiver;
            r4.rounding = Math.max(rectF.width(), rectF.height()) / 2.0f;
            return r4;
        }

        public static AnonymousClass1 fromStoryViewer(StoryViewer storyViewer) {
            PeerStoriesView currentPeerView;
            PeerStoriesView.AnonymousClass4 anonymousClass4;
            if (storyViewer == null) {
                return null;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(storyViewer, 1);
            RectF rectF = anonymousClass1.screenRect;
            StoryViewer.AnonymousClass4 anonymousClass5 = storyViewer.storiesViewPager;
            if (anonymousClass5 == null || (currentPeerView = anonymousClass5.getCurrentPeerView()) == null || (anonymousClass4 = currentPeerView.storyContainer) == null) {
                return null;
            }
            StoryViewer.AnonymousClass2 anonymousClass2 = storyViewer.windowView;
            float x = anonymousClass2 == null ? 0.0f : anonymousClass2.getX();
            StoryViewer.AnonymousClass2 anonymousClass3 = storyViewer.windowView;
            float y = anonymousClass3 != null ? anonymousClass3.getY() : 0.0f;
            rectF.set(anonymousClass4.getX() + currentPeerView.getX() + storyViewer.swipeToDismissHorizontalOffset + x + storyViewer.containerView.getLeft(), anonymousClass4.getY() + currentPeerView.getY() + storyViewer.swipeToDismissOffset + y + storyViewer.containerView.getTop(), (((x + storyViewer.swipeToDismissHorizontalOffset) + storyViewer.containerView.getRight()) - (storyViewer.containerView.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - anonymousClass4.getRight()), (((y + storyViewer.swipeToDismissOffset) + storyViewer.containerView.getBottom()) - (storyViewer.containerView.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - anonymousClass4.getBottom()));
            anonymousClass1.type = 1;
            anonymousClass1.rounding = AndroidUtilities.dp(8.0f);
            PeerStoriesView currentPeerView2 = storyViewer.getCurrentPeerView();
            if (currentPeerView2 != null) {
                anonymousClass1.view = currentPeerView2.storyContainer;
            }
            return anonymousClass1;
        }

        public void drawAbove(Canvas canvas, float f) {
        }

        public abstract void hide();

        public abstract void show(boolean z);
    }

    public interface Touchable {
        boolean onTouch(MotionEvent motionEvent);
    }

    public final class WindowView extends SizeNotifierFrameLayout {
        public boolean flingDetected;
        public final PhotoViewer.AnonymousClass18 gestureDetector;
        public final ScaleGestureDetector scaleGestureDetector;
        public boolean scaling;
        public float stx;
        public float sty;
        public boolean touchInCollageList;
        public float ty;

        public final class GestureListener extends GestureDetectorFixDoubleTap$OnGestureListener {
            public GestureListener() {
            }

            @Override
            public final boolean hasDoubleTap() {
                AnonymousClass25 anonymousClass25;
                WindowView windowView = WindowView.this;
                StoryRecorder storyRecorder = StoryRecorder.this;
                if (storyRecorder.currentPage != 0 || (anonymousClass25 = storyRecorder.cameraView) == null || storyRecorder.awaitingPlayer || !anonymousClass25.isInited()) {
                    return false;
                }
                StoryRecorder storyRecorder2 = StoryRecorder.this;
                if (storyRecorder2.takingPhoto || storyRecorder2.recordControl.discardParentTouch) {
                    return false;
                }
                ScannedLinkPreview scannedLinkPreview = storyRecorder2.qrLinkView;
                return (scannedLinkPreview == null || !(scannedLinkPreview.bounce.isPressed || scannedLinkPreview.touch)) && !storyRecorder2.isGalleryOpen() && storyRecorder2.galleryListViewOpening == null;
            }

            @Override
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                WindowView windowView = WindowView.this;
                StoryRecorder storyRecorder = StoryRecorder.this;
                AnonymousClass25 anonymousClass25 = storyRecorder.cameraView;
                if (anonymousClass25 == null || storyRecorder.awaitingPlayer || storyRecorder.takingPhoto || !anonymousClass25.isInited()) {
                    return false;
                }
                StoryRecorder storyRecorder2 = StoryRecorder.this;
                if (storyRecorder2.currentPage != 0 || storyRecorder2.mode == -1) {
                    return false;
                }
                storyRecorder2.cameraView.switchCamera();
                storyRecorder2.recordControl.rotateFlip(180.0f);
                MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", storyRecorder2.cameraView.isFrontface()).apply();
                if (!storyRecorder2.useDisplayFlashlight()) {
                    storyRecorder2.flashViews.flashOut();
                    return true;
                }
                FlashViews flashViews = storyRecorder2.flashViews;
                flashViews.setScreenBrightness(flashViews.intensity);
                flashViews.flashTo(1.0f, 320L, null);
                return true;
            }

            @Override
            public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
                AnonymousClass25 anonymousClass25 = StoryRecorder.this.cameraView;
                if (anonymousClass25 == null) {
                    return false;
                }
                anonymousClass25.lastFocusToPoint = null;
                anonymousClass25.tapTime = -1L;
                return false;
            }

            @Override
            public final boolean onDown(MotionEvent motionEvent) {
                WindowView windowView = WindowView.this;
                windowView.sty = 0.0f;
                windowView.stx = 0.0f;
                return false;
            }

            @Override
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                StoryRecorder storyRecorder;
                ScannedLinkPreview scannedLinkPreview;
                AnonymousClass25 anonymousClass25;
                ZoomControlView zoomControlView;
                AnonymousClass6 anonymousClass6;
                WindowView windowView = WindowView.this;
                ValueAnimator valueAnimator = StoryRecorder.this.openCloseAnimator;
                if ((valueAnimator != null && valueAnimator.isRunning()) || (((scannedLinkPreview = (storyRecorder = StoryRecorder.this).qrLinkView) != null && (scannedLinkPreview.bounce.isPressed || scannedLinkPreview.touch)) || storyRecorder.recordControl.discardParentTouch || (((anonymousClass25 = storyRecorder.cameraView) != null && anonymousClass25.down) || windowView.scaling || (((zoomControlView = storyRecorder.zoomControlView) != null && (zoomControlView.pressed || zoomControlView.knobPressed)) || storyRecorder.inCheck())))) {
                    return false;
                }
                boolean z = true;
                windowView.flingDetected = true;
                if (!storyRecorder.scrollingY) {
                    z = false;
                } else if (Math.abs(storyRecorder.containerView.translationY1) >= AndroidUtilities.dp(1.0f)) {
                    if ((f2 <= 0.0f || Math.abs(f2) <= 2000.0f || Math.abs(f2) <= Math.abs(f)) && storyRecorder.dismissProgress <= 0.4f) {
                        storyRecorder.animateContainerBack();
                    } else {
                        storyRecorder.close(true);
                    }
                } else if (storyRecorder.galleryListView == null || storyRecorder.galleryClosing || storyRecorder.mode == -1) {
                    z = false;
                } else if (Math.abs(f2) <= 200.0f || (storyRecorder.galleryListView.listView.canScrollVertically(-1) && storyRecorder.wasGalleryOpen)) {
                    storyRecorder.animateGalleryListView(!storyRecorder.takingVideo && storyRecorder.galleryListView.getTranslationY() < ((float) storyRecorder.galleryListView.getPadding()));
                } else {
                    storyRecorder.animateGalleryListView(!storyRecorder.takingVideo && f2 < 0.0f);
                }
                storyRecorder.galleryClosing = false;
                storyRecorder.scrollingY = false;
                storyRecorder.scrollingX = false;
                if (z && (anonymousClass6 = storyRecorder.collageLayoutView) != null) {
                    anonymousClass6.cancelTouch();
                }
                return z;
            }

            @Override
            public final void onLongPress(MotionEvent motionEvent) {
            }

            @Override
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                ScannedLinkPreview scannedLinkPreview;
                AnonymousClass25 anonymousClass25;
                ZoomControlView zoomControlView;
                WindowView windowView = WindowView.this;
                ValueAnimator valueAnimator = StoryRecorder.this.openCloseAnimator;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    StoryRecorder storyRecorder = StoryRecorder.this;
                    if (storyRecorder.galleryOpenCloseSpringAnimator == null && storyRecorder.galleryOpenCloseAnimator == null && (((scannedLinkPreview = storyRecorder.qrLinkView) == null || (!scannedLinkPreview.bounce.isPressed && !scannedLinkPreview.touch)) && !storyRecorder.recordControl.discardParentTouch && (((anonymousClass25 = storyRecorder.cameraView) == null || !anonymousClass25.down) && !windowView.scaling && (((zoomControlView = storyRecorder.zoomControlView) == null || (!zoomControlView.pressed && !zoomControlView.knobPressed)) && !storyRecorder.inCheck() && !storyRecorder.takingVideo && !storyRecorder.takingPhoto && storyRecorder.currentPage == 0)))) {
                        if (!storyRecorder.scrollingX) {
                            float f3 = windowView.sty + f2;
                            windowView.sty = f3;
                            if (!storyRecorder.scrollingY && Math.abs(f3) >= AndroidUtilities.touchSlop) {
                                AnonymousClass6 anonymousClass6 = storyRecorder.collageLayoutView;
                                if (anonymousClass6 != null) {
                                    anonymousClass6.cancelTouch();
                                }
                                storyRecorder.scrollingY = true;
                            }
                        }
                        if (storyRecorder.scrollingY) {
                            int measuredHeight = (storyRecorder.windowView.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
                            AnonymousClass19 anonymousClass19 = storyRecorder.galleryListView;
                            if (anonymousClass19 != null) {
                                float f4 = measuredHeight;
                                if (anonymousClass19.getTranslationY() >= f4) {
                                    windowView.ty = storyRecorder.containerView.translationY1;
                                } else {
                                    windowView.ty = storyRecorder.galleryListView.getTranslationY() - f4;
                                }
                            } else {
                                windowView.ty = storyRecorder.containerView.translationY1;
                            }
                            AnonymousClass19 anonymousClass110 = storyRecorder.galleryListView;
                            if (anonymousClass110 != null && anonymousClass110.listView.canScrollVertically(-1)) {
                                f2 = Math.max(0.0f, f2);
                            }
                            float f5 = windowView.ty - f2;
                            windowView.ty = f5;
                            float fMax = Math.max(-measuredHeight, f5);
                            windowView.ty = fMax;
                            if (storyRecorder.currentPage == 1) {
                                windowView.ty = Math.max(0.0f, fMax);
                            }
                            float f6 = windowView.ty;
                            if (f6 >= 0.0f) {
                                storyRecorder.containerView.setTranslationY(f6);
                                AnonymousClass19 anonymousClass111 = storyRecorder.galleryListView;
                                if (anonymousClass111 != null) {
                                    anonymousClass111.setTranslationY(measuredHeight);
                                }
                            } else {
                                storyRecorder.containerView.setTranslationY(0.0f);
                                if (storyRecorder.galleryListView == null) {
                                    storyRecorder.createGalleryListView(false);
                                }
                                storyRecorder.galleryListView.setTranslationY(measuredHeight + windowView.ty);
                            }
                        }
                        if (!storyRecorder.scrollingY) {
                            float f7 = windowView.stx + f;
                            windowView.stx = f7;
                            if (!storyRecorder.scrollingX && Math.abs(f7) >= AndroidUtilities.touchSlop) {
                                AnonymousClass6 anonymousClass7 = storyRecorder.collageLayoutView;
                                if (anonymousClass7 != null) {
                                    anonymousClass7.cancelTouch();
                                }
                                storyRecorder.scrollingX = true;
                            }
                        }
                        return true;
                    }
                }
                return false;
            }

            @Override
            public final void onShowPress(MotionEvent motionEvent) {
            }

            @Override
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                AnonymousClass25 anonymousClass25 = StoryRecorder.this.cameraView;
                if (anonymousClass25 == null) {
                    return false;
                }
                DualCameraView$$ExternalSyntheticLambda1 dualCameraView$$ExternalSyntheticLambda1 = anonymousClass25.lastFocusToPoint;
                if (dualCameraView$$ExternalSyntheticLambda1 == null) {
                    return true;
                }
                dualCameraView$$ExternalSyntheticLambda1.run();
                anonymousClass25.lastFocusToPoint = null;
                return true;
            }

            @Override
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                WindowView windowView = WindowView.this;
                StoryRecorder storyRecorder = StoryRecorder.this;
                storyRecorder.scrollingY = false;
                storyRecorder.scrollingX = false;
                if (!hasDoubleTap() && onSingleTapConfirmed(motionEvent)) {
                    return true;
                }
                if (!StoryRecorder.this.isGalleryOpen() || motionEvent.getY() >= StoryRecorder.this.galleryListView.top()) {
                    return false;
                }
                StoryRecorder.this.animateGalleryListView(false);
                return true;
            }
        }

        public final class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
            public ScaleListener() {
            }

            @Override
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                StoryRecorder storyRecorder;
                AnonymousClass25 anonymousClass25;
                WindowView windowView = WindowView.this;
                if (!windowView.scaling || (anonymousClass25 = (storyRecorder = StoryRecorder.this).cameraView) == null || storyRecorder.currentPage != 0 || anonymousClass25.down || storyRecorder.collageLayoutView.getFilledProgress() >= 1.0f) {
                    return false;
                }
                float scaleFactor = storyRecorder.cameraZoom + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
                storyRecorder.cameraZoom = scaleFactor;
                storyRecorder.cameraZoom = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
                storyRecorder.cameraView.setZoom(storyRecorder.cameraZoom);
                ZoomControlView zoomControlView = storyRecorder.zoomControlView;
                if (zoomControlView != null) {
                    zoomControlView.setZoom(storyRecorder.cameraZoom, false);
                }
                storyRecorder.showZoomControls$1(true);
                return true;
            }

            @Override
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                WindowView windowView = WindowView.this;
                StoryRecorder storyRecorder = StoryRecorder.this;
                if (storyRecorder.cameraView == null || storyRecorder.currentPage != 0 || storyRecorder.wasGalleryOpen) {
                    return false;
                }
                windowView.scaling = true;
                return super.onScaleBegin(scaleGestureDetector);
            }

            @Override
            public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                WindowView windowView = WindowView.this;
                windowView.scaling = false;
                StoryRecorder.this.animateGalleryListView(false);
                StoryRecorder.this.animateContainerBack();
                super.onScaleEnd(scaleGestureDetector);
            }
        }

        public WindowView(Activity activity) {
            super(activity, null);
            this.scaling = false;
            this.gestureDetector = new PhotoViewer.AnonymousClass18(activity, new GestureListener());
            this.scaleGestureDetector = new ScaleGestureDetector(activity, new ScaleListener());
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            boolean z;
            boolean z2;
            ?? r9;
            AnonymousClass24 anonymousClass24;
            float f;
            float fClamp;
            SourceView sourceView;
            ImageReceiver imageReceiver;
            ShareDialogCell.RepostStoryDrawable repostStoryDrawable;
            ReactionWidgetEntityView reactionWidgetEntityView;
            float f2;
            StoryRecorder storyRecorder = StoryRecorder.this;
            Float f3 = storyRecorder.frozenDismissProgress;
            float fFloatValue = f3 != null ? f3.floatValue() : storyRecorder.dismissProgress;
            if (storyRecorder.openType == 0) {
                canvas.drawColor(ColorUtils.setAlphaComponent(-16777216, (int) ((1.0f - fFloatValue) * storyRecorder.openProgress * 255.0f)));
            }
            float fLerp = AndroidUtilities.lerp(storyRecorder.fromRounding, 0.0f, storyRecorder.openProgress);
            float f4 = storyRecorder.openProgress;
            RectF rectF = storyRecorder.fromRect;
            RectF rectF2 = storyRecorder.rectF;
            if (f4 != 1.0f) {
                int i = storyRecorder.openType;
                if (i == 0) {
                    RectF rectF3 = storyRecorder.fullRectF;
                    rectF3.set(0.0f, 0.0f, getWidth(), getHeight());
                    rectF3.offset(storyRecorder.containerView.getTranslationX(), storyRecorder.containerView.getTranslationY());
                    AndroidUtilities.lerp(rectF, rectF3, storyRecorder.openProgress, rectF2);
                    canvas.save();
                    Path path = storyRecorder.clipPath;
                    path.rewind();
                    path.addRoundRect(rectF2, fLerp, fLerp, Path.Direction.CW);
                    canvas.clipPath(path);
                    r9 = 0;
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.clamp(storyRecorder.openProgress * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                    canvas.translate(rectF2.left, rectF2.top - (storyRecorder.containerView.getTranslationY() * storyRecorder.openProgress));
                    float fMax = Math.max(rectF2.width() / getWidth(), rectF2.height() / getHeight());
                    canvas.scale(fMax, fMax);
                    z2 = true;
                } else {
                    z = false;
                    z = false;
                    if (i == 1) {
                        storyRecorder.applyOpenProgress();
                    }
                }
                anonymousClass24 = storyRecorder.paintView;
                if (anonymousClass24 == null && anonymousClass24.invalidateReactionPosition) {
                    anonymousClass24.invalidateReactionPosition = r9;
                    if (anonymousClass24.reactionLayout == null || (reactionWidgetEntityView = anonymousClass24.reactionForEntity) == null) {
                        f = 1.0f;
                    } else {
                        float measuredWidth = reactionWidgetEntityView.getMeasuredWidth() / 2.0f;
                        float[] fArr = anonymousClass24.points;
                        fArr[r9] = measuredWidth;
                        fArr[1] = anonymousClass24.reactionForEntity.getMeasuredHeight() / 2.0f;
                        anonymousClass24.reactionForEntity.getMatrix().mapPoints(fArr);
                        float scaleX = fArr[1] - (anonymousClass24.reactionForEntity.getScaleX() * (anonymousClass24.reactionForEntity.getMeasuredHeight() / 2.0f));
                        f = 1.0f;
                        float scaleX2 = (anonymousClass24.reactionForEntity.getScaleX() * (anonymousClass24.reactionForEntity.getMeasuredHeight() / 2.0f)) + fArr[1];
                        float fDp = AndroidUtilities.dp(120.0f);
                        WindowView windowView = anonymousClass24.parent;
                        if (scaleX < fDp && scaleX2 > windowView.getMeasuredHeight() - AndroidUtilities.dp(200.0f)) {
                            anonymousClass24.reactionLayout.setTop((boolean) r9);
                            anonymousClass24.reactionLayout.setTranslationY(AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(120.0f) - anonymousClass24.reactionLayout.getMeasuredHeight()));
                            f2 = 0.0f;
                        } else if (scaleX < AndroidUtilities.dp(120.0f)) {
                            anonymousClass24.reactionLayout.setTop(true);
                            f2 = 0.0f;
                            anonymousClass24.reactionLayout.setTranslationY((anonymousClass24.reactionForEntity.getScaleX() * (anonymousClass24.reactionForEntity.getMeasuredHeight() / 2.0f)) + fArr[1]);
                        } else {
                            f2 = 0.0f;
                            anonymousClass24.reactionLayout.setTop((boolean) r9);
                            ReactionsContainerLayout reactionsContainerLayout = anonymousClass24.reactionLayout;
                            reactionsContainerLayout.setTranslationY((scaleX - reactionsContainerLayout.getMeasuredHeight()) + AndroidUtilities.dp(16.0f));
                        }
                        if (fArr[r9] < anonymousClass24.getMeasuredWidth() / 2.0f) {
                            anonymousClass24.reactionLayout.setMirrorX(true);
                            float measuredWidth2 = ((anonymousClass24.reactionLayout.getMeasuredWidth() / 2.0f) + anonymousClass24.reactionLayout.getX()) - (fArr[r9] - (anonymousClass24.reactionForEntity.getMeasuredHeight() / 2.0f));
                            if (measuredWidth2 > f2) {
                                ReactionsContainerLayout reactionsContainerLayout2 = anonymousClass24.reactionLayout;
                                reactionsContainerLayout2.setBubbleOffset(((reactionsContainerLayout2.getMeasuredWidth() / 2.0f) - measuredWidth2) / 2.0f);
                            }
                        } else {
                            float measuredWidth3 = ((anonymousClass24.reactionLayout.getMeasuredWidth() / 2.0f) + anonymousClass24.reactionLayout.getX()) - ((anonymousClass24.reactionForEntity.getMeasuredHeight() / 2.0f) + fArr[r9]);
                            if (measuredWidth3 < f2) {
                                ReactionsContainerLayout reactionsContainerLayout3 = anonymousClass24.reactionLayout;
                                reactionsContainerLayout3.setBubbleOffset((-((reactionsContainerLayout3.getMeasuredWidth() / 2.0f) + measuredWidth3)) / 2.0f);
                            }
                            anonymousClass24.reactionLayout.setMirrorX(r9);
                        }
                        anonymousClass24.reactionLayout.setTranslationX((windowView.getMeasuredWidth() - anonymousClass24.reactionLayout.getMeasuredWidth()) / 2.0f);
                    }
                } else {
                    f = 1.0f;
                }
                super.dispatchDraw(canvas);
                if (z2) {
                    canvas.restore();
                    canvas.restore();
                    if (storyRecorder.fromSourceView != null) {
                        fClamp = Utilities.clamp(f - (storyRecorder.openProgress * 1.5f), 1.0f, 0.0f);
                        rectF2.centerX();
                        rectF2.centerY();
                        Math.min(rectF2.width(), rectF2.height());
                        sourceView = storyRecorder.fromSourceView;
                        imageReceiver = sourceView.backgroundImageReceiver;
                        if (imageReceiver != null) {
                            imageReceiver.setImageCoords(rectF2);
                            int i2 = storyRecorder.fromSourceView.backgroundImageReceiver.getRoundRadius()[r9];
                            storyRecorder.fromSourceView.backgroundImageReceiver.setRoundRadius((int) fLerp);
                            storyRecorder.fromSourceView.backgroundImageReceiver.setAlpha(fClamp);
                            storyRecorder.fromSourceView.backgroundImageReceiver.draw(canvas);
                            storyRecorder.fromSourceView.backgroundImageReceiver.setRoundRadius(i2);
                        } else {
                            repostStoryDrawable = sourceView.backgroundDrawable;
                            if (repostStoryDrawable != null) {
                                repostStoryDrawable.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                ShareDialogCell.RepostStoryDrawable repostStoryDrawable2 = storyRecorder.fromSourceView.backgroundDrawable;
                                repostStoryDrawable2.alpha = (int) MediaController$$ExternalSyntheticOutline0.m(fClamp, 255.0f, fClamp, fClamp);
                                repostStoryDrawable2.draw(canvas);
                            }
                        }
                        storyRecorder.fromSourceView.getClass();
                        canvas.save();
                        canvas.translate(rectF.left, rectF.top);
                        storyRecorder.fromSourceView.drawAbove(canvas, fClamp);
                        canvas.restore();
                    }
                }
            }
            z = false;
            z2 = false;
            r9 = z;
            anonymousClass24 = storyRecorder.paintView;
            if (anonymousClass24 == null) {
                f = 1.0f;
            } else {
                f = 1.0f;
            }
            super.dispatchDraw(canvas);
            if (z2) {
                canvas.restore();
                canvas.restore();
                if (storyRecorder.fromSourceView != null) {
                    fClamp = Utilities.clamp(f - (storyRecorder.openProgress * 1.5f), 1.0f, 0.0f);
                    rectF2.centerX();
                    rectF2.centerY();
                    Math.min(rectF2.width(), rectF2.height());
                    sourceView = storyRecorder.fromSourceView;
                    imageReceiver = sourceView.backgroundImageReceiver;
                    if (imageReceiver != null) {
                        imageReceiver.setImageCoords(rectF2);
                        int i3 = storyRecorder.fromSourceView.backgroundImageReceiver.getRoundRadius()[r9];
                        storyRecorder.fromSourceView.backgroundImageReceiver.setRoundRadius((int) fLerp);
                        storyRecorder.fromSourceView.backgroundImageReceiver.setAlpha(fClamp);
                        storyRecorder.fromSourceView.backgroundImageReceiver.draw(canvas);
                        storyRecorder.fromSourceView.backgroundImageReceiver.setRoundRadius(i3);
                    } else {
                        repostStoryDrawable = sourceView.backgroundDrawable;
                        if (repostStoryDrawable != null) {
                            repostStoryDrawable.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                            ShareDialogCell.RepostStoryDrawable repostStoryDrawable3 = storyRecorder.fromSourceView.backgroundDrawable;
                            repostStoryDrawable3.alpha = (int) MediaController$$ExternalSyntheticOutline0.m(fClamp, 255.0f, fClamp, fClamp);
                            repostStoryDrawable3.draw(canvas);
                        }
                    }
                    storyRecorder.fromSourceView.getClass();
                    canvas.save();
                    canvas.translate(rectF.left, rectF.top);
                    storyRecorder.fromSourceView.drawAbove(canvas, fClamp);
                    canvas.restore();
                }
            }
        }

        @Override
        public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
            if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
                return super.dispatchKeyEventPreIme(keyEvent);
            }
            StoryRecorder.this.onBackPressed();
            return true;
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            boolean z = false;
            this.flingDetected = false;
            StoryRecorder storyRecorder = StoryRecorder.this;
            CollageLayoutButton.CollageLayoutListView collageLayoutListView = storyRecorder.collageListView;
            if (collageLayoutListView != null && collageLayoutListView.visible) {
                float y = storyRecorder.collageListView.getY() + storyRecorder.actionBarContainer.getY() + storyRecorder.containerView.getY();
                if ((motionEvent.getY() >= y && motionEvent.getY() <= y + storyRecorder.collageListView.getHeight()) || this.touchInCollageList) {
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        z = true;
                    }
                    this.touchInCollageList = z;
                    return super.dispatchTouchEvent(motionEvent);
                }
                storyRecorder.collageListView.setVisible(false, true);
                storyRecorder.updateActionBarButtons(true);
            }
            if (this.touchInCollageList && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
                this.touchInCollageList = false;
            }
            this.scaleGestureDetector.onTouchEvent(motionEvent);
            ((GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase) this.gestureDetector.this$0).onTouchEvent(motionEvent);
            if (motionEvent.getAction() == 1 && !this.flingDetected) {
                if (storyRecorder.containerView.getTranslationY() <= 0.0f) {
                    AnonymousClass19 anonymousClass19 = storyRecorder.galleryListView;
                    if (anonymousClass19 != null && anonymousClass19.getTranslationY() > 0.0f && !storyRecorder.galleryClosing) {
                        storyRecorder.animateGalleryListView(!storyRecorder.takingVideo && storyRecorder.galleryListView.getTranslationY() < ((float) storyRecorder.galleryListView.getPadding()));
                    }
                } else if (storyRecorder.dismissProgress > 0.4f) {
                    storyRecorder.close(true);
                } else {
                    storyRecorder.animateContainerBack();
                }
                storyRecorder.galleryClosing = false;
                storyRecorder.scrollingY = false;
                storyRecorder.scrollingX = false;
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        public final void drawBlurBitmap(Bitmap bitmap, float f) {
            Canvas canvas = new Canvas(bitmap);
            canvas.drawColor(-16777216);
            float width = bitmap.getWidth();
            StoryRecorder storyRecorder = StoryRecorder.this;
            float width2 = width / storyRecorder.windowView.getWidth();
            canvas.scale(width2, width2);
            TextureView textureView = storyRecorder.previewView.getTextureView();
            if (textureView == null) {
                textureView = storyRecorder.previewView.filterTextureView;
            }
            if (textureView != null) {
                canvas.save();
                canvas.translate(storyRecorder.previewContainer.getX() + storyRecorder.containerView.getX(), storyRecorder.previewContainer.getY() + storyRecorder.containerView.getY());
                try {
                    Bitmap bitmap2 = textureView.getBitmap((int) (textureView.getWidth() / f), (int) (textureView.getHeight() / f));
                    float f2 = 1.0f / width2;
                    canvas.scale(f2, f2);
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint(2));
                    bitmap2.recycle();
                } catch (Exception unused) {
                }
                canvas.restore();
            }
            canvas.save();
            canvas.translate(storyRecorder.containerView.getX(), storyRecorder.containerView.getY());
            for (int i = 0; i < storyRecorder.containerView.getChildCount(); i++) {
                View childAt = storyRecorder.containerView.getChildAt(i);
                canvas.save();
                canvas.translate(childAt.getX(), childAt.getY());
                if (childAt.getVisibility() == 0) {
                    if (childAt == storyRecorder.previewContainer) {
                        for (int i2 = 0; i2 < storyRecorder.previewContainer.getChildCount(); i2++) {
                            View childAt2 = storyRecorder.previewContainer.getChildAt(i2);
                            if (childAt2 != storyRecorder.previewView && childAt2 != storyRecorder.cameraView && childAt2.getVisibility() == 0) {
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
            int height = getHeight();
            StoryRecorder storyRecorder = StoryRecorder.this;
            return (height - storyRecorder.containerView.getBottom()) + storyRecorder.underControls;
        }

        public int getBottomPadding2() {
            return getHeight() - StoryRecorder.this.containerView.getBottom();
        }

        public int getPaddingUnderContainer() {
            int height = getHeight();
            StoryRecorder storyRecorder = StoryRecorder.this;
            return (height - storyRecorder.insetBottom) - storyRecorder.containerView.getBottom();
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            EmojiView emojiView;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            StoryRecorder storyRecorder = StoryRecorder.this;
            int i6 = storyRecorder.insetTop;
            int measuredHeight2 = storyRecorder.navbarContainer.getMeasuredHeight();
            if (storyRecorder.underStatusBar) {
                i6 = 0;
            }
            int i7 = storyRecorder.previewW;
            int iClamp = MathUtils.clamp((measuredWidth - i7) / 2, storyRecorder.insetLeft, (measuredWidth - storyRecorder.insetRight) - i7);
            int i8 = storyRecorder.previewW + iClamp;
            if (storyRecorder.underStatusBar) {
                i5 = storyRecorder.previewH;
            } else {
                int i9 = storyRecorder.insetBottom;
                int i10 = storyRecorder.previewH;
                int i11 = (((((measuredHeight - i6) - i9) - i10) - measuredHeight2) / 2) + i6;
                if (storyRecorder.openType == 1) {
                    float f = storyRecorder.fromRect.top;
                    if (i10 + f + measuredHeight2 < measuredHeight - i9) {
                        i6 = (int) f;
                    } else if (i11 - i6 >= AndroidUtilities.dp(40.0f)) {
                        i6 = i11;
                    }
                } else if (i11 - i6 >= AndroidUtilities.dp(40.0f)) {
                    i6 = i11;
                }
                i5 = storyRecorder.previewH;
            }
            storyRecorder.containerView.layout(iClamp, i6, i8, i5 + i6 + measuredHeight2);
            storyRecorder.flashViews.backgroundView.layout(0, 0, measuredWidth, measuredHeight);
            AnonymousClass31 anonymousClass31 = storyRecorder.changeDayNightView;
            if (anonymousClass31 != null) {
                anonymousClass31.layout(0, 0, measuredWidth, measuredHeight);
            }
            AnonymousClass19 anonymousClass19 = storyRecorder.galleryListView;
            if (anonymousClass19 != null) {
                anonymousClass19.layout((measuredWidth - anonymousClass19.getMeasuredWidth()) / 2, 0, (storyRecorder.galleryListView.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
            }
            AnonymousClass8 anonymousClass8 = storyRecorder.captionEdit;
            if (anonymousClass8 != null && (emojiView = anonymousClass8.editText.getEmojiView()) != null) {
                emojiView.layout(storyRecorder.insetLeft, (measuredHeight - storyRecorder.insetBottom) - emojiView.getMeasuredHeight(), measuredWidth - storyRecorder.insetRight, measuredHeight - storyRecorder.insetBottom);
            }
            AnonymousClass24 anonymousClass24 = storyRecorder.paintView;
            if (anonymousClass24 != null) {
                EmojiView emojiView2 = anonymousClass24.emojiView;
                if (emojiView2 != null) {
                    emojiView2.layout(storyRecorder.insetLeft, (measuredHeight - storyRecorder.insetBottom) - emojiView2.getMeasuredHeight(), measuredWidth - storyRecorder.insetRight, measuredHeight - storyRecorder.insetBottom);
                }
                ReactionsContainerLayout reactionsContainerLayout = storyRecorder.paintView.reactionLayout;
                if (reactionsContainerLayout != null) {
                    int i12 = storyRecorder.insetLeft;
                    reactionsContainerLayout.layout(i12, storyRecorder.insetTop, reactionsContainerLayout.getMeasuredWidth() + i12, storyRecorder.paintView.reactionLayout.getMeasuredHeight() + storyRecorder.insetTop);
                    IntroActivity.AnonymousClass1 anonymousClass1 = storyRecorder.paintView.reactionLayout.getReactionsWindow() != null ? storyRecorder.paintView.reactionLayout.getReactionsWindow().windowView : null;
                    if (anonymousClass1 != null) {
                        int i13 = storyRecorder.insetLeft;
                        anonymousClass1.layout(i13, storyRecorder.insetTop, anonymousClass1.getMeasuredWidth() + i13, anonymousClass1.getMeasuredHeight() + storyRecorder.insetTop);
                    }
                }
            }
            AnonymousClass36 anonymousClass36 = storyRecorder.cropEditor;
            if (anonymousClass36 != null) {
                anonymousClass36.controlsLayout.setPadding(0, storyRecorder.insetTop, 0, storyRecorder.insetBottom);
                storyRecorder.cropEditor.layout(0, 0, measuredWidth, measuredHeight);
                storyRecorder.cropEditor.contentView.layout(0, 0, measuredWidth, measuredHeight);
            }
            AnonymousClass37 anonymousClass37 = storyRecorder.cropInlineEditor;
            if (anonymousClass37 != null) {
                anonymousClass37.controlsLayout.setPadding(0, storyRecorder.insetTop, 0, storyRecorder.insetBottom);
                storyRecorder.cropInlineEditor.layout(0, 0, measuredWidth, measuredHeight);
                storyRecorder.cropInlineEditor.contentView.layout(0, 0, measuredWidth, measuredHeight);
            }
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                if (childAt instanceof DownloadButton.PreparingVideoToast) {
                    childAt.layout(0, 0, measuredWidth, measuredHeight);
                } else if (childAt instanceof Bulletin.AnonymousClass1) {
                    childAt.layout(0, i6, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i6);
                }
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            StoryRecorder storyRecorder = StoryRecorder.this;
            int i3 = (size - storyRecorder.insetLeft) - storyRecorder.insetRight;
            int i4 = storyRecorder.insetTop;
            int i5 = storyRecorder.insetBottom;
            int iCeil = (int) Math.ceil((i3 / 9.0f) * 16.0f);
            storyRecorder.underControls = AndroidUtilities.dp(48.0f);
            int i6 = storyRecorder.underControls;
            int i7 = iCeil + i6;
            int i8 = size2 - i5;
            if (i7 <= i8) {
                storyRecorder.previewW = i3;
                storyRecorder.previewH = iCeil;
                storyRecorder.underStatusBar = i7 > i8 - i4;
            } else {
                storyRecorder.underStatusBar = false;
                int i9 = ((size2 - i6) - i5) - i4;
                storyRecorder.previewH = i9;
                storyRecorder.previewW = (int) Math.ceil((i9 * 9.0f) / 16.0f);
            }
            storyRecorder.underControls = Utilities.clamp((size2 - storyRecorder.previewH) - (storyRecorder.underStatusBar ? 0 : i4), AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
            int systemUiVisibility = getSystemUiVisibility();
            setSystemUiVisibility(storyRecorder.underStatusBar ? systemUiVisibility | 4 : systemUiVisibility & (-5));
            storyRecorder.containerView.measure(View.MeasureSpec.makeMeasureSpec(storyRecorder.previewW, 1073741824), View.MeasureSpec.makeMeasureSpec(storyRecorder.previewH + storyRecorder.underControls, 1073741824));
            storyRecorder.flashViews.backgroundView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            storyRecorder.getClass();
            AnonymousClass31 anonymousClass31 = storyRecorder.changeDayNightView;
            if (anonymousClass31 != null) {
                anonymousClass31.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }
            storyRecorder.getClass();
            AnonymousClass19 anonymousClass19 = storyRecorder.galleryListView;
            if (anonymousClass19 != null) {
                anonymousClass19.measure(View.MeasureSpec.makeMeasureSpec(storyRecorder.previewW, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }
            AnonymousClass8 anonymousClass8 = storyRecorder.captionEdit;
            if (anonymousClass8 != null) {
                EmojiView emojiView = anonymousClass8.editText.getEmojiView();
                measureKeyboardHeight();
                AndroidUtilities.dp(20.0f);
                if (emojiView != null) {
                    emojiView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
                }
            }
            AnonymousClass24 anonymousClass24 = storyRecorder.paintView;
            if (anonymousClass24 != null) {
                EmojiView emojiView2 = anonymousClass24.emojiView;
                if (emojiView2 != null) {
                    emojiView2.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(storyRecorder.paintView.emojiView.getLayoutParams().height, 1073741824));
                }
                ReactionsContainerLayout reactionsContainerLayout = storyRecorder.paintView.reactionLayout;
                if (reactionsContainerLayout != null) {
                    measureChild(reactionsContainerLayout, i, i2);
                    if (storyRecorder.paintView.reactionLayout.getReactionsWindow() != null) {
                        measureChild(storyRecorder.paintView.reactionLayout.getReactionsWindow().windowView, i, i2);
                    }
                }
            }
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof DownloadButton.PreparingVideoToast) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                } else if (childAt instanceof Bulletin.AnonymousClass1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(340.0f), size2 - (storyRecorder.underStatusBar ? 0 : i4)), 1073741824));
                }
            }
            AnonymousClass36 anonymousClass36 = storyRecorder.cropEditor;
            if (anonymousClass36 != null) {
                anonymousClass36.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                storyRecorder.cropEditor.contentView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }
            AnonymousClass37 anonymousClass37 = storyRecorder.cropInlineEditor;
            if (anonymousClass37 != null) {
                anonymousClass37.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                storyRecorder.cropInlineEditor.contentView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }
            setMeasuredDimension(size, size2);
        }
    }

    public StoryRecorder(Activity activity, int i) {
        int i2;
        int i3 = 17;
        int i4 = 14;
        int i5 = 8;
        DarkThemeResourceProvider darkThemeResourceProvider = new DarkThemeResourceProvider();
        this.resourcesProvider = darkThemeResourceProvider;
        this.wasSendPeer = 0L;
        this.fromRect = new RectF();
        this.canChangePeer = true;
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.rectF = new RectF();
        this.fullRectF = new RectF();
        this.clipPath = new Path();
        new Rect();
        this.currentPage = 0;
        this.currentEditMode = -1;
        this.livePrivacy = new StoryPrivacyBottomSheet.StoryPrivacy();
        this.entries = null;
        this.selectedEntries = null;
        this.selectedEntriesOrder = null;
        this.mode = 0;
        this.takingPhoto = false;
        this.takingVideo = false;
        this.stoppingTakingVideo = false;
        this.awaitingPlayer = false;
        this.shiftDp = -3;
        this.preparingUpload = false;
        AnonymousClass13 anonymousClass13 = new AnonymousClass13();
        this.videoTimerShown = true;
        this.applyContainerViewTranslation2 = true;
        this.frontfaceFlashMode = -1;
        this.activity = activity;
        this.currentAccount = i;
        this.activityVisibilityController = LaunchActivity.obtainActivityVisibilityController();
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
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        this.windowManager = windowManager;
        WindowView windowView = new WindowView(activity);
        this.windowView = windowView;
        StoryRecorder$$ExternalSyntheticLambda12 storyRecorder$$ExternalSyntheticLambda12 = new StoryRecorder$$ExternalSyntheticLambda12(this, 3);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(windowView, storyRecorder$$ExternalSyntheticLambda12);
        this.windowView.setFocusable(true);
        this.windowView.setImportantForAccessibility(2);
        FlashViews flashViews = new FlashViews(activity, windowManager, this.windowView, layoutParams);
        this.flashViews = flashViews;
        FlashViews.Invertable invertable = new FlashViews.Invertable() {
            @Override
            public final void invalidate() {
            }

            @Override
            public final void setInvert(float f) {
                StoryRecorder storyRecorder = StoryRecorder.this;
                AndroidUtilities.setLightNavigationBar(storyRecorder.windowView, f > 0.5f);
                AndroidUtilities.setLightStatusBar(storyRecorder.windowView, f > 0.5f);
            }
        };
        invertable.setInvert(flashViews.invert);
        flashViews.invertableViews.add(invertable);
        this.windowView.addView(this.flashViews.backgroundView, new ViewGroup.LayoutParams(-1, -1));
        WindowView windowView2 = this.windowView;
        ContainerView containerView = new ContainerView(activity);
        this.containerView = containerView;
        windowView2.addView(containerView);
        ContainerView containerView2 = this.containerView;
        ThemePreviewActivity.AnonymousClass14 anonymousClass14 = new ThemePreviewActivity.AnonymousClass14(this, activity);
        this.previewContainer = anonymousClass14;
        containerView2.addView(anonymousClass14);
        this.containerView.addView(this.flashViews.foregroundView, new ViewGroup.LayoutParams(-1, -1));
        this.blurManager = new BlurringShader.BlurManager(this.previewContainer);
        this.videoTextureHolder = new PreviewView.TextureViewHolder();
        ContainerView containerView3 = this.containerView;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.actionBarContainer = frameLayout;
        containerView3.addView(frameLayout);
        ContainerView containerView4 = this.containerView;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.controlContainer = frameLayout2;
        containerView4.addView(frameLayout2);
        ContainerView containerView5 = this.containerView;
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(activity);
        this.captionContainer = anonymousClass4;
        containerView5.addView(anonymousClass4);
        this.captionContainer.setVisibility(8);
        this.captionContainer.setAlpha(0.0f);
        ContainerView containerView6 = this.containerView;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.navbarContainer = frameLayout3;
        containerView6.addView(frameLayout3);
        WindowView windowView3 = this.windowView;
        LaunchActivity.AnonymousClass7 anonymousClass7 = new LaunchActivity.AnonymousClass7(i4);
        if (windowView3 != null) {
            windowView3.setTag(R.id.bulletin_delegate_tag, anonymousClass7);
        }
        int i6 = 6;
        int i7 = 12;
        int i8 = 0;
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(activity, this.blurManager, this.containerView, darkThemeResourceProvider);
        this.collageLayoutView = anonymousClass6;
        WindowView windowView4 = this.windowView;
        Objects.requireNonNull(windowView4);
        anonymousClass6.setCancelGestures(new VoIPFragment$12$$ExternalSyntheticLambda0(windowView4, i3));
        this.collageLayoutView.setResetState(new StoryRecorder$$ExternalSyntheticLambda7(this, i4));
        this.previewContainer.addView(this.collageLayoutView, LayoutHelper.createFrame(-1, -1, 119));
        this.collageLayoutView.setOnClickListener(new StoryRecorder$$ExternalSyntheticLambda24(this, i7));
        ThemePreviewActivity.AnonymousClass14 anonymousClass15 = this.previewContainer;
        int i9 = this.openType;
        anonymousClass15.setBackgroundColor((i9 == 1 || i9 == 0) ? 0 : -14737633);
        ThemePreviewActivity.AnonymousClass14 anonymousClass16 = this.previewContainer;
        float fDp = AndroidUtilities.dp(12.0f);
        RichEditor.AnonymousClass5 anonymousClass5 = ViewOutlineProviderImpl.BOUNDS_OVAL;
        anonymousClass16.setOutlineProvider(new ViewOutlineProviderImpl.AnonymousClass5(0, fDp));
        this.previewContainer.setClipToOutline(true);
        this.photoFilterEnhanceView = new PhotoFilterView.EnhanceView(activity, new StoryRecorder$$ExternalSyntheticLambda7(this, 15));
        AnonymousClass7 anonymousClass8 = new AnonymousClass7(activity, this.blurManager, this.videoTextureHolder);
        this.previewView = anonymousClass8;
        anonymousClass8.setCollageView(this.collageLayoutView);
        AnonymousClass7 anonymousClass9 = this.previewView;
        anonymousClass9.invalidateBlur = new StoryRecorder$$ExternalSyntheticLambda7(this, 16);
        anonymousClass9.setOnTapListener(new StoryRecorder$$ExternalSyntheticLambda7(this, i3));
        this.previewView.setVisibility(8);
        AnonymousClass7 anonymousClass10 = this.previewView;
        anonymousClass10.onErrorListener = new StoryRecorder$$ExternalSyntheticLambda7(this, 18);
        this.previewContainer.addView(anonymousClass10, LayoutHelper.createFrame(-1, -1, 119));
        this.previewContainer.addView(this.photoFilterEnhanceView, LayoutHelper.createFrame(-1, -1, 119));
        WindowView windowView5 = this.windowView;
        AnonymousClass8 anonymousClass11 = new AnonymousClass8(activity, windowView5, windowView5, this.containerView, darkThemeResourceProvider, this.blurManager);
        this.captionEdit = anonymousClass11;
        anonymousClass11.setAccount(i);
        this.captionEdit.setUiBlurBitmap(new StoryRecorder$$ExternalSyntheticLambda12(this, 5));
        AnonymousClass4 anonymousClass12 = this.captionContainer;
        ChatActivity.AnonymousClass103 anonymousClass103 = new ChatActivity.AnonymousClass103(this, 19);
        if (anonymousClass12 != null) {
            anonymousClass12.setTag(R.id.bulletin_delegate_tag, anonymousClass103);
        }
        this.captionEdit.setOnHeightUpdate(new StoryRecorder$$ExternalSyntheticLambda19(this, 13));
        this.captionEdit.setOnPeriodUpdate(new StoryRecorder$$ExternalSyntheticLambda19(this, i8));
        long j = this.selectedDialogId;
        if (j != 0) {
            this.captionEdit.setDialogId(j);
        }
        this.captionEdit.setOnPremiumHint(new StoryRecorder$$ExternalSyntheticLambda19(this, 5));
        this.captionEdit.setOnKeyboardOpen(new StoryRecorder$$ExternalSyntheticLambda19(this, i6));
        RichDetailsCell.AnonymousClass2 anonymousClass2 = new RichDetailsCell.AnonymousClass2(this, activity, 2);
        this.captionEditOverlay = anonymousClass2;
        this.containerView.addView(anonymousClass2);
        TimelineView timelineView = new TimelineView(activity, this.containerView, this.previewContainer, darkThemeResourceProvider, this.blurManager);
        this.timelineView = timelineView;
        timelineView.setOnTimelineClick(new StoryRecorder$$ExternalSyntheticLambda7(this, 11));
        this.timelineView.setOnHeightChange(new StoryRecorder$$ExternalSyntheticLambda7(this, i7));
        this.previewView.setVideoTimelineView(this.timelineView);
        this.timelineView.setVisibility(8);
        this.timelineView.setAlpha(0.0f);
        this.timelineView.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.videoTimelineContainerView = frameLayout4;
        float f = 388;
        frameLayout4.addView(this.timelineView, LayoutHelper.createFrame(-1, f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        VideoTimeView videoTimeView = new VideoTimeView(activity);
        this.videoTimeView = videoTimeView;
        videoTimeView.setVisibility(8);
        this.videoTimeView.show(false);
        this.videoTimelineContainerView.addView(this.videoTimeView, LayoutHelper.createFrame(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.captionContainer.addView(this.videoTimelineContainerView, LayoutHelper.createFrame(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.captionContainer.addView(this.captionEdit, LayoutHelper.createFrame(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.collageLayoutView.setTimelineView(this.timelineView);
        this.collageLayoutView.setPreviewView(this.previewView);
        TimelineView timelineView2 = new TimelineView(activity, this.containerView, this.previewContainer, darkThemeResourceProvider, this.blurManager);
        this.coverTimelineView = timelineView2;
        timelineView2.isCover = true;
        timelineView2.setVisibility(8);
        this.coverTimelineView.setAlpha(0.0f);
        this.captionContainer.addView(this.coverTimelineView, LayoutHelper.createFrame(-1, f, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        AnonymousClass11 anonymousClass17 = new AnonymousClass11(activity, darkThemeResourceProvider, this.blurManager);
        this.storiesSelector = anonymousClass17;
        anonymousClass17.setVisibility(8);
        this.captionContainer.addView(this.storiesSelector, LayoutHelper.createFrame(-1, -2, 85));
        FlashViews.ImageViewInvertable imageViewInvertable = new FlashViews.ImageViewInvertable(activity);
        this.backButton = imageViewInvertable;
        imageViewInvertable.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        FlashViews.ImageViewInvertable imageViewInvertable2 = this.backButton;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageViewInvertable2.setScaleType(scaleType);
        this.backButton.setImageResource(R.drawable.msg_photo_back);
        FlashViews.ImageViewInvertable imageViewInvertable3 = this.backButton;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageViewInvertable3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.backButton.setBackground(Theme.createSelectorDrawable(553648127, 1, -1));
        this.backButton.setOnClickListener(new StoryRecorder$$ExternalSyntheticLambda24(this, i8));
        this.actionBarContainer.addView(this.backButton, LayoutHelper.createFrame(56, 56, 51));
        FlashViews flashViews2 = this.flashViews;
        FlashViews.ImageViewInvertable imageViewInvertable4 = this.backButton;
        imageViewInvertable4.setInvert(flashViews2.invert);
        flashViews2.invertableViews.add(imageViewInvertable4);
        SelectPeerView selectPeerView = new SelectPeerView(activity, i);
        this.livePeerView = selectPeerView;
        selectPeerView.setShowing(false, false);
        this.livePeerView.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda52(29, this, activity));
        this.actionBarContainer.addView(this.livePeerView, LayoutHelper.createFrame(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(activity);
        this.titleTextView = simpleTextView;
        simpleTextView.setTextSize(20);
        this.titleTextView.setGravity(19);
        this.titleTextView.setTextColor(-1);
        this.titleTextView.setTypeface(AndroidUtilities.bold());
        this.titleTextView.setText(LocaleController.getString(R.string.RecorderNewStory), false);
        this.titleTextView.getPaint().setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, 1.0f, 1073741824);
        this.titleTextView.setAlpha(0.0f);
        this.titleTextView.setVisibility(8);
        this.titleTextView.setEllipsizeByGradient(true);
        this.titleTextView.setRightPadding(AndroidUtilities.dp(144.0f));
        this.actionBarContainer.addView(this.titleTextView, LayoutHelper.createFrame(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.actionBarButtons = linearLayout;
        linearLayout.setOrientation(0);
        this.actionBarButtons.setGravity(5);
        this.actionBarContainer.addView(this.actionBarButtons, LayoutHelper.createFrame(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        this.downloadButton = new DownloadButton(activity, new StoryRecorder$$ExternalSyntheticLambda19(this, 7), i, this.windowView);
        HintView2 hintView2 = new HintView2(activity, 1);
        hintView2.setJoint(1.0f, -71.0f);
        hintView2.duration = 2000L;
        hintView2.repeatedBounce = false;
        hintView2.textDrawable.setHacks(true, false);
        this.muteHint = hintView2;
        hintView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.actionBarContainer.addView(this.muteHint, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        RLottieImageView rLottieImageView = new RLottieImageView(activity);
        this.muteButton = rLottieImageView;
        rLottieImageView.setScaleType(scaleType);
        RLottieImageView rLottieImageView2 = this.muteButton;
        StoryEntry storyEntry = this.outputEntry;
        rLottieImageView2.setImageResource((storyEntry == null || !storyEntry.muted) ? R.drawable.media_mute : R.drawable.media_unmute);
        this.muteButton.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.muteButton.setBackground(Theme.createSelectorDrawable(553648127, 1, -1));
        this.muteButton.setOnClickListener(new StoryRecorder$$ExternalSyntheticLambda24(this, 2));
        this.muteButton.setVisibility(8);
        this.muteButton.setAlpha(0.0f);
        ChatActivity.AnonymousClass27 anonymousClass27 = new ChatActivity.AnonymousClass27(activity);
        this.playButton = anonymousClass27;
        anonymousClass27.setBackground(Theme.createSelectorDrawable(553648127, 1, -1));
        this.playButton.setVisibility(8);
        this.playButton.setAlpha(0.0f);
        this.playButton.setOnClickListener(new StoryRecorder$$ExternalSyntheticLambda24(this, 3));
        this.actionBarButtons.addView(this.playButton, LayoutHelper.createLinear(46, 56, 53));
        this.actionBarButtons.addView(this.muteButton, LayoutHelper.createLinear(46, 56, 53));
        this.actionBarButtons.addView(this.downloadButton, LayoutHelper.createFrame(46, 56, 53));
        ToggleButton2 toggleButton2 = new ToggleButton2(activity);
        this.flashButton = toggleButton2;
        toggleButton2.setBackground(Theme.createSelectorDrawable(553648127, 1, -1));
        this.flashButton.setOnClickListener(new StoryRecorder$$ExternalSyntheticLambda24(this, 4));
        this.flashButton.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda44(this, 15));
        this.flashButton.setVisibility(8);
        this.flashButton.setAlpha(0.0f);
        FlashViews flashViews3 = this.flashViews;
        ToggleButton2 toggleButton3 = this.flashButton;
        toggleButton3.setInvert(flashViews3.invert);
        flashViews3.invertableViews.add(toggleButton3);
        this.actionBarContainer.addView(this.flashButton, LayoutHelper.createFrame(56, 56, 53));
        ToggleButton toggleButton = new ToggleButton(activity, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.dualButton = toggleButton;
        toggleButton.setContentDescription(LocaleController.getString(R.string.AccDescrDualCameraOn));
        this.dualButton.setOnClickListener(new StoryRecorder$$ExternalSyntheticLambda24(this, 5));
        boolean zDualAvailableStatic = DualCameraView.dualAvailableStatic(activity);
        this.dualButton.setVisibility(zDualAvailableStatic ? 0 : 8);
        this.dualButton.setAlpha(zDualAvailableStatic ? 1.0f : 0.0f);
        FlashViews flashViews4 = this.flashViews;
        ToggleButton toggleButton4 = this.dualButton;
        toggleButton4.setInvert(flashViews4.invert);
        flashViews4.invertableViews.add(toggleButton4);
        this.actionBarContainer.addView(this.dualButton, LayoutHelper.createFrame(56, 56, 53));
        CollageLayoutButton collageLayoutButton = new CollageLayoutButton(activity);
        this.collageButton = collageLayoutButton;
        collageLayoutButton.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.collageButton.setBackground(Theme.createSelectorDrawable(553648127, 1, -1));
        if (this.lastCollageLayout == null) {
            i2 = 6;
            this.lastCollageLayout = (CollageLayout) CollageLayout.getLayouts().get(6);
        } else {
            i2 = 6;
        }
        this.collageButton.setOnClickListener(new StoryRecorder$$ExternalSyntheticLambda24(this, i2));
        this.collageButton.setIcon(new MotionPhotoDrawable(this.lastCollageLayout, false), false);
        this.collageButton.setSelected(false);
        this.collageButton.setVisibility(0);
        this.collageButton.setAlpha(1.0f);
        FlashViews flashViews5 = this.flashViews;
        CollageLayoutButton collageLayoutButton2 = this.collageButton;
        collageLayoutButton2.setInvert(flashViews5.invert);
        flashViews5.invertableViews.add(collageLayoutButton2);
        this.actionBarContainer.addView(this.collageButton, LayoutHelper.createFrame(56, 56, 53));
        ToggleButton2 toggleButton5 = new ToggleButton2(activity);
        this.collageRemoveButton = toggleButton5;
        toggleButton5.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.collageRemoveButton.setBackground(Theme.createSelectorDrawable(553648127, 1, -1));
        this.collageRemoveButton.setIcon(new MotionPhotoDrawable(new CollageLayout("../../.."), true), false);
        this.collageRemoveButton.setVisibility(8);
        this.collageRemoveButton.setAlpha(0.0f);
        this.collageRemoveButton.setOnClickListener(new StoryRecorder$$ExternalSyntheticLambda24(this, 7));
        FlashViews flashViews6 = this.flashViews;
        ToggleButton2 toggleButton6 = this.collageRemoveButton;
        toggleButton6.setInvert(flashViews6.invert);
        flashViews6.invertableViews.add(toggleButton6);
        this.actionBarContainer.addView(this.collageRemoveButton, LayoutHelper.createFrame(56, 56, 53));
        CollageLayoutButton.CollageLayoutListView collageLayoutListView = new CollageLayoutButton.CollageLayoutListView(activity, this.flashViews);
        this.collageListView = collageLayoutListView;
        collageLayoutListView.listView.scrollToPosition(6);
        this.collageListView.setSelected((CollageLayout) null);
        this.collageListView.setOnLayoutClick(new StoryRecorder$$ExternalSyntheticLambda19(this, i5));
        this.actionBarContainer.addView(this.collageListView, LayoutHelper.createFrame(-1, 56, 53));
        HintView2 hintView3 = new HintView2(activity, 1);
        hintView3.setJoint(1.0f, -20.0f);
        hintView3.duration = 5000L;
        hintView3.setCloseButton();
        hintView3.setText(LocaleController.getString(R.string.StoryCameraDualHint));
        hintView3.onHidden = new VoIPFragment$$ExternalSyntheticLambda31(i5);
        this.dualHint = hintView3;
        hintView3.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.actionBarContainer.addView(this.dualHint, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        HintView2 hintView4 = new HintView2(activity, 2);
        hintView4.setJoint(0.0f, 28.0f);
        hintView4.duration = 5000L;
        hintView4.setMultilineText(true);
        this.savedDualHint = hintView4;
        this.actionBarContainer.addView(hintView4, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        HintView2 hintView5 = new HintView2(activity, 1);
        hintView5.setJoint(1.0f, -20.0f);
        hintView5.duration = 5000L;
        hintView5.setText(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.removeCollageHint = hintView5;
        hintView5.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.actionBarContainer.addView(this.removeCollageHint, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        this.videoTimerView = new VideoTimerView(activity);
        showVideoTimer(false, false);
        this.actionBarContainer.addView(this.videoTimerView, LayoutHelper.createFrame(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        FlashViews flashViews7 = this.flashViews;
        VideoTimerView videoTimerView = this.videoTimerView;
        videoTimerView.setInvert(flashViews7.invert);
        flashViews7.invertableViews.add(videoTimerView);
        MediaController.loadGalleryPhotosAlbums(0);
        RecordControl recordControl = new RecordControl(activity);
        this.recordControl = recordControl;
        recordControl.setDelegate(anonymousClass13);
        RecordControl recordControl2 = this.recordControl;
        boolean z = this.mode == 1;
        recordControl2.overrideStartModeIsVideoT = -1.0f;
        recordControl2.startModeIsVideo = z;
        recordControl2.invalidate();
        this.controlContainer.addView(this.recordControl, LayoutHelper.createFrame(-1, 100, 87));
        FlashViews flashViews8 = this.flashViews;
        RecordControl recordControl3 = this.recordControl;
        recordControl3.setInvert(flashViews8.invert);
        flashViews8.invertableViews.add(recordControl3);
        this.recordControl.setCollageProgress(this.collageLayoutView.hasLayout() ? this.collageLayoutView.getFilledProgress() : 0.0f, true);
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(activity, darkThemeResourceProvider, true);
        this.startLiveButton = buttonWithCounterView;
        buttonWithCounterView.setRoundRadius(24);
        this.startLiveButton.setColor(-2473124);
        this.startLiveButton.setText(LocaleController.getString(R.string.LiveStoryStart), false, true);
        this.startLiveButton.setAlpha(0.0f);
        this.startLiveButton.setScaleX(0.8f);
        this.startLiveButton.setScaleY(0.8f);
        this.startLiveButton.setVisibility(8);
        this.controlContainer.addView(this.startLiveButton, LayoutHelper.createFrame(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.startLiveButton.setOnClickListener(new StoryRecorder$$ExternalSyntheticLambda24(this, 8));
        HintView2 hintView6 = new HintView2(activity, 3);
        hintView6.setMultilineText(true);
        hintView6.setText(LocaleController.getString(R.string.StoryCameraHint2));
        hintView6.textMaxWidth = AndroidUtilities.dp(320.0f);
        hintView6.duration = 5000L;
        hintView6.textLayoutAlignment = Layout.Alignment.ALIGN_CENTER;
        this.cameraHint = hintView6;
        this.controlContainer.addView(hintView6, LayoutHelper.createFrame(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        ZoomControlView zoomControlView = new ZoomControlView(activity);
        this.zoomControlView = zoomControlView;
        zoomControlView.enabledTouch = false;
        zoomControlView.setAlpha(0.0f);
        this.controlContainer.addView(this.zoomControlView, LayoutHelper.createFrame(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.zoomControlView.setDelegate(new StoryRecorder$$ExternalSyntheticLambda12(this, 4));
        ZoomControlView zoomControlView2 = this.zoomControlView;
        this.cameraZoom = 0.0f;
        zoomControlView2.setZoom(0.0f, false);
        ScannedLinkPreview scannedLinkPreview = new ScannedLinkPreview(activity, i, new StoryRecorder$$ExternalSyntheticLambda7(this, 13));
        this.qrLinkView = scannedLinkPreview;
        scannedLinkPreview.clickListener = new StoryRecorder$$ExternalSyntheticLambda19(this, 9);
        this.controlContainer.addView(scannedLinkPreview, LayoutHelper.createFrame(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        AnonymousClass12 anonymousClass18 = new AnonymousClass12(activity);
        this.modeSwitcherView = anonymousClass18;
        anonymousClass18.setOnSwitchModeListener(new StoryRecorder$$ExternalSyntheticLambda19(this, 10));
        this.modeSwitcherView.setOnSwitchingModeListener(new StoryRecorder$$ExternalSyntheticLambda19(this, 11));
        this.navbarContainer.addView(this.modeSwitcherView, LayoutHelper.createFrame(-1, 48, 55));
        FlashViews flashViews9 = this.flashViews;
        AnonymousClass12 anonymousClass19 = this.modeSwitcherView;
        anonymousClass19.setInvert(flashViews9.invert);
        flashViews9.invertableViews.add(anonymousClass19);
        FlashViews.ImageViewInvertable imageViewInvertable5 = new FlashViews.ImageViewInvertable(activity);
        this.rotateButton = imageViewInvertable5;
        imageViewInvertable5.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.rotateButton.setImageResource(R.drawable.stream_flip);
        this.rotateButton.setScaleType(scaleType);
        this.rotateButton.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.rotateButton.setBackground(Theme.createSelectorDrawable(553648127, 1, -1));
        this.navbarContainer.addView(this.rotateButton, LayoutHelper.createFrame(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        FlashViews flashViews10 = this.flashViews;
        FlashViews.ImageViewInvertable imageViewInvertable6 = this.rotateButton;
        imageViewInvertable6.setInvert(flashViews10.invert);
        flashViews10.invertableViews.add(imageViewInvertable6);
        this.rotateButton.setOnClickListener(new StoryRecorder$$ExternalSyntheticLambda24(this, 9));
        FlashViews.ImageViewInvertable imageViewInvertable7 = new FlashViews.ImageViewInvertable(activity);
        this.liveSettingsButton = imageViewInvertable7;
        imageViewInvertable7.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.liveSettingsButton.setImageResource(R.drawable.stream_settings);
        this.liveSettingsButton.setScaleType(scaleType);
        this.liveSettingsButton.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.liveSettingsButton.setBackground(Theme.createSelectorDrawable(553648127, 1, -1));
        this.navbarContainer.addView(this.liveSettingsButton, LayoutHelper.createFrame(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        FlashViews flashViews11 = this.flashViews;
        FlashViews.ImageViewInvertable imageViewInvertable8 = this.liveSettingsButton;
        imageViewInvertable8.setInvert(flashViews11.invert);
        flashViews11.invertableViews.add(imageViewInvertable8);
        this.liveSettingsButton.setOnClickListener(new StoryRecorder$$ExternalSyntheticLambda24(this, 10));
        HintTextView hintTextView = new HintTextView(activity);
        this.hintTextView = hintTextView;
        this.navbarContainer.addView(hintTextView, LayoutHelper.createFrame(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        FlashViews flashViews12 = this.flashViews;
        HintTextView hintTextView2 = this.hintTextView;
        hintTextView2.setInvert(flashViews12.invert);
        flashViews12.invertableViews.add(hintTextView2);
        HintTextView hintTextView3 = new HintTextView(activity);
        this.collageHintTextView = hintTextView3;
        hintTextView3.textDrawable.setText(LocaleController.getString(R.string.StoryCollageReorderHint), false, true);
        hintTextView3.invalidate();
        this.collageHintTextView.setAlpha(0.0f);
        this.navbarContainer.addView(this.collageHintTextView, LayoutHelper.createFrame(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        FlashViews flashViews13 = this.flashViews;
        HintTextView hintTextView4 = this.collageHintTextView;
        hintTextView4.setInvert(flashViews13.invert);
        flashViews13.invertableViews.add(hintTextView4);
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(activity, darkThemeResourceProvider, true);
        buttonWithCounterView2.setRoundRadius(24);
        this.coverButton = buttonWithCounterView2;
        buttonWithCounterView2.setVisibility(8);
        this.coverButton.setAlpha(0.0f);
        this.coverButton.setText(LocaleController.getString(R.string.StoryCoverSave), false, true);
        this.coverButton.setOnClickListener(new StoryRecorder$$ExternalSyntheticLambda24(this, 11));
        this.navbarContainer.addView(this.coverButton, LayoutHelper.createFrame(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        PreviewButtons previewButtons = new PreviewButtons(activity);
        this.previewButtons = previewButtons;
        previewButtons.setVisibility(8);
        this.previewButtons.setOnClickListener(new StoryRecorder$$ExternalSyntheticLambda19(this, 12));
        this.navbarContainer.addView(this.previewButtons, LayoutHelper.createFrame(-1, 52, 23));
        TrashView trashView = new TrashView(activity);
        this.trash = trashView;
        trashView.setAlpha(0.0f);
        this.trash.setVisibility(8);
        this.previewContainer.addView(this.trash, LayoutHelper.createFrame(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        PreviewHighlightView previewHighlightView = new PreviewHighlightView(activity, i, darkThemeResourceProvider);
        this.previewHighlight = previewHighlightView;
        this.previewContainer.addView(previewHighlightView, LayoutHelper.createFrame(-1, -1, 119));
        updateActionBarButtons(false);
    }

    public static void access$10900(StoryRecorder storyRecorder) {
        AnonymousClass25 anonymousClass25 = storyRecorder.cameraView;
        if (anonymousClass25 == null || anonymousClass25.getTextureView() == null) {
            storyRecorder.isDark = false;
            return;
        }
        Bitmap bitmap = storyRecorder.cameraView.getTextureView().getBitmap();
        if (bitmap == null) {
            storyRecorder.isDark = false;
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
        storyRecorder.isDark = f < 0.22f;
    }

    public static boolean access$12000(StoryRecorder storyRecorder) {
        Activity activity = storyRecorder.activity;
        if (activity == null) {
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i >= 33) {
            z = (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) ? false : true;
            if (z) {
                activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 114);
            }
        } else if (i >= 23) {
            z = activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0;
            if (z) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 114);
            }
        }
        return !z;
    }

    public static boolean access$9600(StoryRecorder storyRecorder) {
        Activity activity;
        storyRecorder.getClass();
        if (Build.VERSION.SDK_INT < 23 || (activity = storyRecorder.activity) == null || activity.checkSelfPermission("android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 112);
        return false;
    }

    public static SpannableString cameraBtnSpan(Context context) {
        SpannableString spannableString = new SpannableString("c");
        final Drawable drawableMutate = context.getResources().getDrawable(R.drawable.story_camera).mutate();
        int iDp = AndroidUtilities.dp(35.0f);
        int i = -iDp;
        drawableMutate.setBounds(i / 4, i, (iDp / 4) * 3, 0);
        spannableString.setSpan(new ImageSpan(drawableMutate) {
            @Override
            public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
                canvas.save();
                canvas.translate(0.0f, AndroidUtilities.dp(1.0f) + ((i6 - i4) / 2));
                drawableMutate.setAlpha(paint.getAlpha());
                super.draw(canvas, charSequence, i2, i3, f, i4, i5, i6, paint);
                canvas.restore();
            }

            @Override
            public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
                return (super.getSize(paint, charSequence, i2, i3, fontMetricsInt) / 3) * 2;
            }
        }, 0, 1, 33);
        return spannableString;
    }

    public static void destroyInstance() {
        StoryRecorder storyRecorder = instance;
        if (storyRecorder != null) {
            storyRecorder.close(false);
        }
        instance = null;
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

    public final void addNotificationObservers() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        int i = this.currentAccount;
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.storiesLimitUpdate);
    }

    public final void animateContainerBack() {
        int i = 0;
        ValueAnimator valueAnimator = this.containerViewBackAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.containerViewBackAnimator = null;
        }
        this.applyContainerViewTranslation2 = false;
        ContainerView containerView = this.containerView;
        float f = containerView.translationY1;
        float f2 = containerView.translationY2;
        containerView.getAlpha();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.containerViewBackAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new PhotoViewer$$ExternalSyntheticLambda79(this, f, f2, 4));
        this.containerViewBackAnimator.setDuration(340L);
        this.containerViewBackAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.containerViewBackAnimator.addListener(new AnonymousClass17(this, i));
        this.containerViewBackAnimator.start();
    }

    public final void animateGalleryListView(boolean z) {
        DraftSavedHint draftSavedHint;
        WindowView windowView = this.windowView;
        int i = 1;
        this.wasGalleryOpen = z;
        Boolean bool = this.galleryListViewOpening;
        if (bool == null || bool.booleanValue() != z) {
            if (this.galleryListView == null) {
                if (z) {
                    createGalleryListView(false);
                }
                if (this.galleryListView == null) {
                    return;
                }
            }
            if (this.galleryListView.firstLayout) {
                this.galleryLayouted = new StoryRecorder$$ExternalSyntheticLambda6(this, z, 2);
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
                    createGalleryListView(false);
                }
                if (this.galleryListView == null) {
                    return;
                }
            }
            AnonymousClass19 anonymousClass19 = this.galleryListView;
            if (anonymousClass19 != null) {
                anonymousClass19.ignoreScroll = false;
            }
            if (z && (draftSavedHint = this.draftSavedHint) != null) {
                draftSavedHint.show(false);
            }
            ContainerView containerView = this.containerView;
            if (containerView != null) {
                containerView.setImportantForAccessibility(z ? 4 : 0);
            }
            this.galleryListView.setImportantForAccessibility(z ? 0 : 4);
            this.galleryListViewOpening = Boolean.valueOf(z);
            float translationY = this.galleryListView.getTranslationY();
            float height = z ? 0.0f : (windowView.getHeight() - this.galleryListView.top()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            Math.max(1, windowView.getHeight());
            AnonymousClass19 anonymousClass110 = this.galleryListView;
            anonymousClass110.ignoreScroll = !z;
            this.applyContainerViewTranslation2 = this.containerViewBackAnimator == null;
            if (z) {
                SpringAnimation springAnimation2 = new SpringAnimation(anonymousClass110, DynamicAnimation.TRANSLATION_Y, height);
                this.galleryOpenCloseSpringAnimator = springAnimation2;
                springAnimation2.mSpring.setDampingRatio(0.75f);
                this.galleryOpenCloseSpringAnimator.mSpring.setStiffness(350.0f);
                this.galleryOpenCloseSpringAnimator.addEndListener(new PipVideoOverlay$4$$ExternalSyntheticLambda0(this, height, i));
                this.galleryOpenCloseSpringAnimator.start();
            } else {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(translationY, height);
                this.galleryOpenCloseAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new StoryRecorder$$ExternalSyntheticLambda68(this, 5));
                this.galleryOpenCloseAnimator.addListener(new AnonymousClass17(this, i));
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

    public final void animateOpenTo(float f, boolean z, Runnable runnable) {
        ContainerView containerView = this.containerView;
        int i = 4;
        ValueAnimator valueAnimator = this.openCloseAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.openCloseAnimator = null;
        }
        if (!z) {
            this.frozenDismissProgress = null;
            this.openProgress = f;
            applyOpenProgress();
            containerView.invalidate();
            this.windowView.invalidate();
            runnable.run();
            checkBackgroundVisibility();
            return;
        }
        this.notificationsLocker.lock();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.frozenDismissProgress = Float.valueOf(this.dismissProgress);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.openProgress, f);
        this.openCloseAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new StoryRecorder$$ExternalSyntheticLambda68(this, i));
        this.openCloseAnimator.addListener(new StarReactionsOverlay.AnonymousClass1(this, f, runnable, i));
        if (f < 1.0f && this.wasSend) {
            this.openCloseAnimator.setDuration(250L);
            this.openCloseAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        } else if (f > 0.0f || containerView.translationY1 < AndroidUtilities.dp(20.0f)) {
            this.openCloseAnimator.setDuration(300L);
            this.openCloseAnimator.setInterpolator(new FastOutSlowInInterpolator());
        } else if (f >= 0.0f || !this.fastClose) {
            this.openCloseAnimator.setDuration(400L);
            this.openCloseAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        } else {
            this.openCloseAnimator.setDuration(200L);
            this.openCloseAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.fastClose = false;
        }
        this.openCloseAnimator.start();
    }

    public final void animateRecording(boolean z, boolean z2) {
        CollageLayoutButton.CollageLayoutListView collageLayoutListView;
        AnonymousClass12 anonymousClass12 = this.modeSwitcherView;
        HintTextView hintTextView = this.collageHintTextView;
        HintTextView hintTextView2 = this.hintTextView;
        if (z) {
            HintView2 hintView2 = this.dualHint;
            if (hintView2 != null) {
                hintView2.hide(true);
            }
            HintView2 hintView3 = this.savedDualHint;
            if (hintView3 != null) {
                hintView3.hide(true);
            }
            HintView2 hintView4 = this.muteHint;
            if (hintView4 != null) {
                hintView4.hide(true);
            }
            HintView2 hintView5 = this.cameraHint;
            if (hintView5 != null) {
                hintView5.hide(true);
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
        if (z && (collageLayoutListView = this.collageListView) != null && collageLayoutListView.visible) {
            collageLayoutListView.setVisible(false, z2);
        }
        updateActionBarButtons(z2);
        if (!z2) {
            hintTextView2.setAlpha((z && this.currentPage == 0 && !inCheck()) ? 1.0f : 0.0f);
            hintTextView2.setTranslationY((z && this.currentPage == 0 && !inCheck()) ? 0.0f : AndroidUtilities.dp(16.0f));
            hintTextView.setAlpha((!z && this.currentPage == 0 && inCheck()) ? 0.6f : 0.0f);
            hintTextView.setTranslationY((!z && this.currentPage == 0 && inCheck()) ? 0.0f : AndroidUtilities.dp(16.0f));
            anonymousClass12.setAlpha((z || this.currentPage != 0 || inCheck()) ? 0.0f : 1.0f);
            anonymousClass12.setTranslationY((z || this.currentPage != 0 || inCheck()) ? AndroidUtilities.dp(16.0f) : 0.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.recordingAnimator = animatorSet2;
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(hintTextView2, (Property<HintTextView, Float>) property, (z && this.currentPage == 0 && !inCheck()) ? 1.0f : 0.0f);
        Property property2 = View.TRANSLATION_Y;
        animatorSet2.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(hintTextView2, (Property<HintTextView, Float>) property2, (z && this.currentPage == 0 && !inCheck()) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(hintTextView, (Property<HintTextView, Float>) property, (!z && this.currentPage == 0 && inCheck()) ? 0.6f : 0.0f), ObjectAnimator.ofFloat(hintTextView, (Property<HintTextView, Float>) property2, (!z && this.currentPage == 0 && inCheck()) ? 0.0f : AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(anonymousClass12, (Property<AnonymousClass12, Float>) property, (z || this.currentPage != 0 || inCheck()) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(anonymousClass12, (Property<AnonymousClass12, Float>) property2, (z || this.currentPage != 0 || inCheck()) ? AndroidUtilities.dp(16.0f) : 0.0f));
        this.recordingAnimator.setDuration(260L);
        this.recordingAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.recordingAnimator.start();
    }

    public final void applyFilter(Runnable runnable) {
        StoryEntry storyEntry;
        Runnable runnable2;
        AnonymousClass7 anonymousClass7;
        PhotoFilterView photoFilterView = this.photoFilterView;
        if (photoFilterView == null || (storyEntry = this.outputEntry) == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        storyEntry.editedMedia = photoFilterView.hasChanges() | storyEntry.editedMedia;
        StoryEntry storyEntry2 = this.outputEntry;
        PhotoFilterView photoFilterView2 = this.photoFilterView;
        File file = storyEntry2.filterFile;
        if (file != null) {
            file.delete();
            storyEntry2.filterFile = null;
        }
        MediaController.SavedFilterState savedFilterState = photoFilterView2.getSavedFilterState();
        storyEntry2.filterState = savedFilterState;
        if (storyEntry2.isVideo) {
            runnable2 = runnable;
            if (runnable2 != null) {
                runnable2.run();
            }
        } else {
            if (!savedFilterState.isEmpty()) {
                Bitmap bitmap = photoFilterView2.getBitmap();
                if (bitmap != null) {
                    Matrix matrix = new Matrix();
                    int i = storyEntry2.invert;
                    matrix.postScale(i == 1 ? -1.0f : 1.0f, i == 2 ? -1.0f : 1.0f, storyEntry2.width / 2.0f, storyEntry2.height / 2.0f);
                    matrix.postRotate(-storyEntry2.orientation);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    storyEntry2.matrix.preScale(storyEntry2.width / bitmapCreateBitmap.getWidth(), storyEntry2.height / bitmapCreateBitmap.getHeight());
                    storyEntry2.width = bitmapCreateBitmap.getWidth();
                    storyEntry2.height = bitmapCreateBitmap.getHeight();
                    bitmap.recycle();
                    File file2 = storyEntry2.filterFile;
                    if (file2 != null && file2.exists()) {
                        storyEntry2.filterFile.delete();
                    }
                    String strExt = StoryEntry.ext(storyEntry2.file);
                    boolean z = "png".equals(strExt) || "webp".equals(strExt);
                    storyEntry2.filterFile = StoryEntry.makeCacheFile(storyEntry2.currentAccount, z ? "webp" : "jpg");
                    if (runnable == null) {
                        try {
                            bitmapCreateBitmap.compress(z ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(storyEntry2.filterFile));
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        bitmapCreateBitmap.recycle();
                    } else {
                        runnable2 = runnable;
                        Utilities.themeQueue.postRunnable(new QrActivity$$ExternalSyntheticLambda15(storyEntry2, bitmapCreateBitmap, z, runnable2, 25));
                    }
                } else if (runnable != null) {
                    runnable.run();
                }
            } else if (runnable != null) {
                runnable.run();
            }
            runnable2 = runnable;
        }
        if (runnable2 == null) {
            StoryEntry storyEntry3 = this.outputEntry;
            if (storyEntry3.isVideo || (anonymousClass7 = this.previewView) == null) {
                return;
            }
            anonymousClass7.set(storyEntry3);
        }
    }

    public final void applyFilterMatrix() {
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

    public final void applyOpenProgress() {
        PeerStoriesView.AnonymousClass4 anonymousClass4;
        if (this.openType != 1) {
            return;
        }
        float left = this.previewContainer.getLeft();
        float top = this.previewContainer.getTop();
        float measuredWidth = this.previewContainer.getMeasuredWidth();
        float measuredHeight = this.previewContainer.getMeasuredHeight();
        RectF rectF = this.fullRectF;
        rectF.set(left, top, measuredWidth, measuredHeight);
        rectF.offset(this.containerView.getX(), this.containerView.getY());
        float f = this.openProgress;
        RectF rectF2 = this.fromRect;
        RectF rectF3 = this.rectF;
        AndroidUtilities.lerp(rectF2, rectF, f, rectF3);
        this.previewContainer.setAlpha(this.openProgress);
        ThemePreviewActivity.AnonymousClass14 anonymousClass14 = this.previewContainer;
        anonymousClass14.setTranslationX((rectF3.left - anonymousClass14.getLeft()) - this.containerView.getX());
        ThemePreviewActivity.AnonymousClass14 anonymousClass15 = this.previewContainer;
        anonymousClass15.setTranslationY((rectF3.top - anonymousClass15.getTop()) - this.containerView.getY());
        SourceView sourceView = this.fromSourceView;
        if (sourceView != null && (anonymousClass4 = sourceView.view) != null) {
            anonymousClass4.setTranslationX((rectF.left - rectF2.left) * this.openProgress);
            this.fromSourceView.view.setTranslationY((rectF.top - rectF2.top) * this.openProgress);
        }
        this.previewContainer.setScaleX(rectF3.width() / this.previewContainer.getMeasuredWidth());
        this.previewContainer.setScaleY(rectF3.height() / this.previewContainer.getMeasuredHeight());
        this.actionBarContainer.setAlpha(this.openProgress);
        this.controlContainer.setAlpha(this.openProgress);
        this.captionContainer.setAlpha(this.openProgress);
        if (this.currentPage == 2) {
            this.coverButton.setAlpha(this.openProgress);
        }
    }

    public final void applyPaint() {
        StoryEntry storyEntry;
        Bitmap bitmapCreateBitmap;
        Bitmap blurBitmap;
        boolean z;
        int i;
        ImageReceiver photoImage;
        ?? r6;
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
        AnonymousClass24 anonymousClass24 = this.paintView;
        StoryEntry storyEntry3 = this.outputEntry;
        anonymousClass24.getBitmap(storyEntry3.mediaEntities, false, false, false, false, storyEntry3);
        StoryEntry storyEntry4 = this.outputEntry;
        if (!storyEntry4.isVideo) {
            storyEntry4.averageDuration = Utilities.clamp(this.paintView.getLcm(), 7500L, 5000L);
        }
        List<TLRPC.InputDocument> masks = this.paintView.getMasks();
        this.outputEntry.stickers = masks != null ? new ArrayList(masks) : null;
        StoryEntry storyEntry5 = this.outputEntry;
        boolean z2 = storyEntry5.isVideo;
        boolean zWouldBeVideo = storyEntry5.wouldBeVideo();
        this.outputEntry.mediaEntities = new ArrayList();
        AnonymousClass24 anonymousClass25 = this.paintView;
        StoryEntry storyEntry6 = this.outputEntry;
        Bitmap bitmap = anonymousClass25.getBitmap(storyEntry6.mediaEntities, true, false, false, !z2, storyEntry6);
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
        int i2 = this.currentAccount;
        FileLoader fileLoader = FileLoader.getInstance(i2);
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
                    backgroundDrawable = PreviewView.getBackgroundDrawable((Drawable) null, i2, j, this.isDark);
                }
                if (backgroundDrawable != null) {
                    this.outputEntry.backgroundFile = StoryEntry.makeCacheFile(i2, "webp");
                    StoryEntry storyEntry11 = this.outputEntry;
                    bitmapCreateBitmap = Bitmap.createBitmap(storyEntry11.resultWidth, storyEntry11.resultHeight, Bitmap.Config.ARGB_8888);
                    StoryEntry.drawBackgroundDrawable(new Canvas(bitmapCreateBitmap), backgroundDrawable, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                    try {
                        try {
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.outputEntry.backgroundFile));
                            if (!bitmapCreateBitmap.isRecycled()) {
                                bitmapCreateBitmap.recycle();
                            }
                        } catch (Throwable th) {
                            if (!bitmapCreateBitmap.isRecycled()) {
                                bitmapCreateBitmap.recycle();
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        if (!bitmapCreateBitmap.isRecycled()) {
                        }
                    }
                }
            }
        }
        StoryEntry storyEntry12 = this.outputEntry;
        boolean z3 = storyEntry12.isRepostMessage;
        float f = z3;
        if (z3) {
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
            boolean z4 = storyEntry13.isRepostMessage;
            f = z4;
            if (z4 && (z = storyEntry13.isVideo)) {
                i = storyEntry13.width;
                int i3 = storyEntry13.height;
                MessageEntityView messageEntityViewFindMessageView = this.paintView.findMessageView();
                if (messageEntityViewFindMessageView != null) {
                    MessageEntityView.AnonymousClass2 anonymousClass2 = messageEntityViewFindMessageView.listView;
                    if (anonymousClass2.getChildCount() == 1 && i > 0 && i3 > 0) {
                        if ((anonymousClass2.getChildAt(0) instanceof ChatMessageCell) && (photoImage = ((ChatMessageCell) anonymousClass2.getChildAt(0)).getPhotoImage()) != null && ((int) photoImage.getImageWidth()) > 0 && ((int) photoImage.getImageHeight()) > 0) {
                            f = i;
                            f = i;
                            f = i;
                            f = i;
                            float f2 = i;
                            float f3 = i3;
                            float fMax = Math.max(photoImage.getImageWidth() / f2, photoImage.getImageHeight() / f3);
                            int i4 = (int) ((f2 * fMax) / 2.0f);
                            int i5 = (int) ((f3 * fMax) / 2.0f);
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
                            float[] fArr = new float[8];
                            for (int i6 = 0; i6 < photoImage.getRoundRadius().length; i6++) {
                                int i7 = i6 * 2;
                                fArr[i7] = photoImage.getRoundRadius()[i6];
                                fArr[i7 + 1] = photoImage.getRoundRadius()[i6];
                            }
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            Path path = new Path();
                            canvas.scale(0.5f, 0.5f);
                            RectF rectF = AndroidUtilities.rectTmp;
                            float f4 = (i4 * 2.0f) / 2.0f;
                            float imageWidth = f4 - (photoImage.getImageWidth() / 2.0f);
                            float f5 = (i5 * 2.0f) / 2.0f;
                            float imageHeight = f5 - (photoImage.getImageHeight() / 2.0f);
                            ?? imageWidth2 = (photoImage.getImageWidth() / 2.0f) + f4;
                            rectF.set(imageWidth, imageHeight, imageWidth2, (photoImage.getImageHeight() / 2.0f) + f5);
                            path.addRoundRect(rectF, fArr, Path.Direction.CW);
                            Paint paint = new Paint(1);
                            paint.setColor(-1);
                            canvas.drawPath(path, paint);
                            try {
                                this.outputEntry.messageVideoMaskFile = StoryEntry.makeCacheFile(i2, "webp");
                                Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.WEBP;
                                imageWidth2 = this.outputEntry.messageVideoMaskFile;
                                bitmapCreateBitmap2.compress(compressFormat2, 100, new FileOutputStream((File) imageWidth2));
                                r6 = imageWidth2;
                            } catch (Exception e4) {
                                FileLog.e(e4);
                                this.outputEntry.messageVideoMaskFile = null;
                                r6 = imageWidth2;
                            }
                            bitmapCreateBitmap2.recycle();
                            f = r6;
                        }
                    }
                }
            }
        }
        if (!zWouldBeVideo) {
            AnonymousClass24 anonymousClass26 = this.paintView;
            ArrayList arrayList2 = new ArrayList();
            StoryEntry storyEntry14 = this.outputEntry;
            int i8 = storyEntry14.resultWidth;
            Bitmap bitmap2 = anonymousClass26.getBitmap(arrayList2, false, true, false, false, storyEntry14);
            StoryEntry storyEntry15 = this.outputEntry;
            FileLoader fileLoader2 = FileLoader.getInstance(i2);
            Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
            StoryEntry storyEntry16 = this.outputEntry;
            f = storyEntry16.resultWidth;
            storyEntry15.paintEntitiesFile = fileLoader2.getPathToAttach(ImageLoader.scaleAndSaveImage(bitmap2, compressFormat3, f, storyEntry16.resultHeight, 87, false, 101, 101), true);
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bitmap2.recycle();
            }
        }
        bitmapCreateBitmap = f;
        if (getPainting().hasBlur) {
            blurBitmap = this.paintView.getBlurBitmap();
            StoryEntry storyEntry17 = this.outputEntry;
            FileLoader fileLoader3 = FileLoader.getInstance(i2);
            Bitmap.CompressFormat compressFormat4 = Bitmap.CompressFormat.PNG;
            StoryEntry storyEntry18 = this.outputEntry;
            storyEntry17.paintBlurFile = fileLoader3.getPathToAttach(ImageLoader.scaleAndSaveImage(blurBitmap, compressFormat4, storyEntry18.resultWidth, storyEntry18.resultHeight, 87, false, 101, 101), true);
            if (blurBitmap != null && !blurBitmap.isRecycled()) {
                bitmapCreateBitmap = blurBitmap;
                bitmapCreateBitmap = blurBitmap;
                blurBitmap.recycle();
                bitmapCreateBitmap = blurBitmap;
            }
        }
        bitmapCreateBitmap = blurBitmap;
        bitmapCreateBitmap = blurBitmap;
        bitmapCreateBitmap = blurBitmap;
    }

    public final void applyPaintMessage() {
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
        AnonymousClass24 anonymousClass24 = this.paintView;
        StoryEntry storyEntry2 = this.outputEntry;
        Bitmap bitmap = anonymousClass24.getBitmap(storyEntry2.mediaEntities, false, false, true, this.mode != 1, storyEntry2);
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

    public final void checkBackgroundVisibility() {
        boolean z = this.dismissProgress != 0.0f || this.openProgress < 1.0f || this.forceBackgroundVisible;
        if (z == this.isBackgroundVisible) {
            return;
        }
        LaunchActivity.ActivityVisibilityController activityVisibilityController = this.activityVisibilityController;
        if (activityVisibilityController != null) {
            activityVisibilityController.setHidden(!z);
        }
        this.isBackgroundVisible = z;
    }

    public final void checkFrontfaceFlashModes() {
        if (this.frontfaceFlashMode < 0) {
            this.frontfaceFlashMode = MessagesController.getGlobalMainSettings().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.frontfaceFlashModes = arrayList;
            arrayList.add("off");
            this.frontfaceFlashModes.add("auto");
            this.frontfaceFlashModes.add("on");
            FlashViews flashViews = this.flashViews;
            float f = MessagesController.getGlobalMainSettings().getFloat("frontflash_warmth", 0.9f);
            flashViews.warmth = f;
            flashViews.color = FlashViews.getColor(f);
            flashViews.invalidateGradient();
            FlashViews flashViews2 = this.flashViews;
            flashViews2.intensity = MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f);
            flashViews2.update();
        }
    }

    public final void close(boolean z) {
        AnonymousClass7 anonymousClass7;
        if (this.isShown) {
            StoryPrivacyBottomSheet storyPrivacyBottomSheet = this.privacySheet;
            if (storyPrivacyBottomSheet != null) {
                storyPrivacyBottomSheet.lambda$showGiftOfferSheet$15();
                this.privacySheet = null;
            }
            StoryEntry storyEntry = this.outputEntry;
            long currentPosition = 0;
            if (storyEntry != null && !storyEntry.isEditSaved) {
                if ((this.wasSend && storyEntry.isEdit) || storyEntry.draftId != 0) {
                    storyEntry.editedMedia = false;
                }
                storyEntry.destroy(false);
            }
            this.outputEntry = null;
            Utilities.Callback4 callback4 = this.onClosePrepareListener;
            if (callback4 == null || (anonymousClass7 = this.previewView) == null) {
                AnonymousClass7 anonymousClass8 = this.previewView;
                if (anonymousClass8 != null && !z) {
                    anonymousClass8.set(null);
                }
                animateOpenTo(0.0f, z, new StoryRecorder$$ExternalSyntheticLambda7(this, 0));
                int i = this.openType;
                if (i == 1 || i == 0) {
                    this.windowView.setBackgroundColor(0);
                    this.previewButtons.appear(false, true);
                }
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
                int i2 = this.currentAccount;
                NotificationCenter.getInstance(i2).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
                NotificationCenter.getInstance(i2).removeObserver(this, NotificationCenter.storiesLimitUpdate);
                return;
            }
            if (this.prepareClosing) {
                return;
            }
            this.prepareClosing = true;
            VideoPlayer videoPlayer = anonymousClass7.audioPlayer;
            if (videoPlayer != null) {
                videoPlayer.pause();
                anonymousClass7.audioPlayer.releasePlayer();
                anonymousClass7.audioPlayer = null;
            }
            VideoPlayer videoPlayer2 = anonymousClass7.roundPlayer;
            if (videoPlayer2 != null) {
                currentPosition = videoPlayer2.getCurrentPosition();
                anonymousClass7.roundPlayer.pause();
                anonymousClass7.roundPlayer.releasePlayer();
                anonymousClass7.roundPlayer = null;
            }
            VideoPlayer videoPlayer3 = anonymousClass7.videoPlayer;
            if (videoPlayer3 != null) {
                currentPosition = videoPlayer3.getCurrentPosition();
                anonymousClass7.videoPlayer.pause();
                anonymousClass7.videoPlayer.releasePlayer();
                anonymousClass7.videoPlayer = null;
            }
            callback4.run(Long.valueOf(currentPosition), new StoryRecorder$$ExternalSyntheticLambda6(this, z, 0), Boolean.valueOf(this.wasSend), Long.valueOf(this.wasSendPeer));
        }
    }

    public final void createCameraView() {
        long j;
        if (this.cameraView != null || this.activity == null) {
            return;
        }
        this.cameraView = new AnonymousClass25(this.activity, MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false));
        RecordControl recordControl = this.recordControl;
        if (recordControl != null) {
            recordControl.amplitude = 0.0f;
            recordControl.animatedAmplitude.set(0.0f, true);
        }
        this.cameraView.recordHevc = !this.collageLayoutView.hasLayout();
        this.cameraView.setThumbDrawable(getCameraThumb());
        this.cameraView.initTexture();
        this.cameraView.setDelegate(new StoryRecorder$$ExternalSyntheticLambda12(this, 13));
        setActionBarButtonVisible(this.dualButton, this.cameraView.dualAvailable && this.currentPage == 0, true);
        this.collageButton.setTranslationX(this.cameraView.dualAvailable ? 0.0f : AndroidUtilities.dp(46.0f));
        this.collageLayoutView.setCameraView(this.cameraView);
        if (MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) < 1) {
            this.cameraHint.show();
            MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) + 1).apply();
        } else if ((!DualCameraView.dualAvailableStatic(this.cameraView.getContext()) || !MessagesController.getGlobalMainSettings().getBoolean("dualcam", DualCameraView.dualAvailableDefault(ApplicationLoader.applicationContext, false))) && this.cameraView.dualAvailable && MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) < 2) {
            this.dualHint.show();
        }
        if (this.qrScanner == null) {
            this.qrScanner = new QRScanner(this.activity, new StoryRecorder$$ExternalSyntheticLambda19(this, 20));
        }
        QRScanner qRScanner = this.qrScanner;
        qRScanner.cameraView = this.cameraView;
        if (qRScanner.detector.get() != null && !qRScanner.paused.get()) {
            Utilities.globalQueue.cancelRunnable(qRScanner.process);
            DispatchQueue dispatchQueue = Utilities.globalQueue;
            QRScanner$$ExternalSyntheticLambda0 qRScanner$$ExternalSyntheticLambda0 = qRScanner.process;
            if (qRScanner.lastDetected == null) {
                j = 750;
            } else {
                int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                if (devicePerformanceClass != 1) {
                    j = devicePerformanceClass != 2 ? 800L : 80L;
                } else {
                    j = 400;
                }
            }
            dispatchQueue.postRunnable(qRScanner$$ExternalSyntheticLambda0, j);
        }
        ScannedLinkPreview scannedLinkPreview = this.qrLinkView;
        if (scannedLinkPreview != null) {
            AnonymousClass6 anonymousClass6 = this.collageLayoutView;
            Object blurRenderNode = anonymousClass6.getBlurRenderNode();
            scannedLinkPreview.blurView = anonymousClass6;
            scannedLinkPreview.blurRenderNode = blurRenderNode;
            scannedLinkPreview.invalidate();
        }
    }

    public final void createFilterPhotoView() {
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
                StoryRecorder$$ExternalSyntheticLambda12 storyRecorder$$ExternalSyntheticLambda12 = new StoryRecorder$$ExternalSyntheticLambda12(this, 10);
                Point point = AndroidUtilities.displaySize;
                scaledBitmap = StoryEntry.getScaledBitmap(storyRecorder$$ExternalSyntheticLambda12, point.x, point.y, 0, true);
            }
            bitmap = scaledBitmap;
        }
        if (bitmap != null || this.outputEntry.isVideo) {
            VideoEditTextureView textureView = this.previewView.getTextureView();
            int orientation = this.previewView.getOrientation();
            StoryEntry storyEntry2 = this.outputEntry;
            PhotoFilterView photoFilterView = new PhotoFilterView(this.activity, textureView, bitmap, null, orientation, storyEntry2 == null ? null : storyEntry2.filterState, null, 0, false, false, this.blurManager, this.resourcesProvider);
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
            AnonymousClass7 anonymousClass7 = this.previewView;
            TextureView textureView2 = this.photoFilterViewTextureView;
            PhotoFilterView photoFilterView2 = this.photoFilterView;
            TextureView textureView3 = anonymousClass7.filterTextureView;
            if (textureView3 != null) {
                anonymousClass7.removeView(textureView3);
                anonymousClass7.filterTextureView = null;
            }
            anonymousClass7.photoFilterView = photoFilterView2;
            anonymousClass7.filterTextureView = textureView2;
            if (photoFilterView2 != null) {
                int i = anonymousClass7.gradientTop;
                int i2 = anonymousClass7.gradientBottom;
                FilterGLThread filterGLThread = photoFilterView2.eglThread;
                if (filterGLThread != null) {
                    filterGLThread.updateUiBlurGradient(i, i2);
                } else {
                    photoFilterView2.gradientTop = i;
                    photoFilterView2.gradientBottom = i2;
                }
            }
            TextureView textureView4 = anonymousClass7.filterTextureView;
            if (textureView4 != null) {
                anonymousClass7.addView(textureView4);
            }
            TextureView textureView5 = this.photoFilterViewTextureView;
            if (textureView5 != null) {
                textureView5.setAlpha(0.0f);
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
            this.photoFilterView.getDoneTextView().setOnClickListener(new StoryRecorder$$ExternalSyntheticLambda24(this, 13));
            this.photoFilterView.getCancelTextView().setOnClickListener(new StoryRecorder$$ExternalSyntheticLambda24(this, 14));
            this.photoFilterView.getToolsView().setVisibility(8);
            this.photoFilterView.getToolsView().setAlpha(0.0f);
            this.photoFilterView.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
            this.photoFilterView.textureView.setVisibility(0);
        }
    }

    public final void createGalleryListView(boolean z) {
        if (this.galleryListView != null) {
            AnonymousClass6 anonymousClass6 = this.collageLayoutView;
            if ((anonymousClass6 != null && anonymousClass6.hasLayout()) == this.galleryListView.onlyCollaging) {
                return;
            }
        }
        if (this.activity == null) {
            return;
        }
        if (this.galleryListView != null) {
            destroyGalleryListView();
        }
        DarkThemeResourceProvider darkThemeResourceProvider = this.resourcesProvider;
        MediaController.AlbumEntry albumEntry = this.lastGallerySelectedAlbum;
        boolean z2 = !z;
        AnonymousClass6 anonymousClass7 = this.collageLayoutView;
        AnonymousClass19 anonymousClass19 = new AnonymousClass19(this.currentAccount, this.activity, darkThemeResourceProvider, albumEntry, z, z2, anonymousClass7 != null && anonymousClass7.hasLayout());
        this.galleryListView = anonymousClass19;
        anonymousClass19.searchItem.setVisibility(8);
        this.galleryListView.setMultipleOnClick(this.collageLayoutView.hasLayout());
        this.galleryListView.setMaxCount(Math.min(10, CollageLayout.getMaxCount() - this.collageLayoutView.getFilledCount()));
        int i = 1;
        this.galleryListView.setOnBackClickListener(new StoryRecorder$$ExternalSyntheticLambda9(this, i));
        this.galleryListView.setOnSelectListener(new ProfileActivity$$ExternalSyntheticLambda85(z, this, i));
        this.galleryListView.setOnSelectMultipleListener(new PhotoViewer$$ExternalSyntheticLambda142(this, 3));
        LinearLayoutManager.SavedState savedState = this.lastGalleryScrollPosition;
        if (savedState != null) {
            GalleryListView.AnonymousClass2 anonymousClass2 = this.galleryListView.layoutManager;
            anonymousClass2.getClass();
            anonymousClass2.mPendingSavedState = savedState;
            RecyclerView recyclerView = anonymousClass2.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }
        this.windowView.addView(this.galleryListView, LayoutHelper.createFrame(-1, -1, 119));
    }

    public final void createPhotoPaintView() {
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
            ?? r4 = obj;
            WindowView windowView = this.windowView;
            int orientation = this.previewView.getOrientation();
            StoryEntry storyEntry5 = this.outputEntry;
            ArrayList arrayList = storyEntry5 != null ? storyEntry5.mediaEntities : null;
            MediaController.CropState cropState = new MediaController.CropState();
            BlurringShader.BlurManager blurManager = this.blurManager;
            DarkThemeResourceProvider darkThemeResourceProvider = this.resourcesProvider;
            PreviewView.TextureViewHolder textureViewHolder = this.videoTextureHolder;
            AnonymousClass7 anonymousClass7 = this.previewView;
            Activity activity = this.activity;
            z4 = z6;
            AnonymousClass24 anonymousClass24 = new AnonymousClass24(activity, z, r4, z2, z3, windowView, activity, this.currentAccount, bitmap, bitmap2, orientation, arrayList, storyEntry5, measuredWidth, measuredHeight, cropState, blurManager, darkThemeResourceProvider, textureViewHolder, anonymousClass7);
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
            this.paintView.setOnDoneButtonClickedListener(new StoryRecorder$$ExternalSyntheticLambda7(this, 22));
            this.paintView.setOnCancelButtonClickedListener(new StoryRecorder$$ExternalSyntheticLambda7(this, 23));
            AnonymousClass24 anonymousClass25 = this.paintView;
            anonymousClass25.entitiesView.setVisibility(0);
            anonymousClass25.renderView.setVisibility(0);
            anonymousClass25.renderInputView.setVisibility(0);
        }
        bitmapCreateBitmap = null;
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(((Integer) paintSize.first).intValue(), ((Integer) paintSize.second).intValue(), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap3 = bitmapCreateBitmap;
        int measuredWidth2 = this.previewContainer.getMeasuredWidth();
        int measuredHeight2 = this.previewContainer.getMeasuredHeight();
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
        ?? r5 = obj;
        WindowView windowView2 = this.windowView;
        int orientation2 = this.previewView.getOrientation();
        StoryEntry storyEntry6 = this.outputEntry;
        ArrayList arrayList2 = storyEntry6 != null ? storyEntry6.mediaEntities : null;
        MediaController.CropState cropState2 = new MediaController.CropState();
        BlurringShader.BlurManager blurManager2 = this.blurManager;
        DarkThemeResourceProvider darkThemeResourceProvider2 = this.resourcesProvider;
        PreviewView.TextureViewHolder textureViewHolder2 = this.videoTextureHolder;
        AnonymousClass7 anonymousClass8 = this.previewView;
        Activity activity2 = this.activity;
        z4 = z6;
        AnonymousClass24 anonymousClass26 = new AnonymousClass24(activity2, z, r5, z2, z3, windowView2, activity2, this.currentAccount, bitmap, bitmap3, orientation2, arrayList2, storyEntry6, measuredWidth2, measuredHeight2, cropState2, blurManager2, darkThemeResourceProvider2, textureViewHolder2, anonymousClass8);
        this.paintView = anonymousClass26;
        storyEntry2 = this.outputEntry;
        if (storyEntry2 != null) {
            z5 = false;
        } else {
            z5 = false;
        }
        anonymousClass26.setHasAudio(z5);
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
        this.paintView.setOnDoneButtonClickedListener(new StoryRecorder$$ExternalSyntheticLambda7(this, 22));
        this.paintView.setOnCancelButtonClickedListener(new StoryRecorder$$ExternalSyntheticLambda7(this, 23));
        AnonymousClass24 anonymousClass27 = this.paintView;
        anonymousClass27.entitiesView.setVisibility(0);
        anonymousClass27.renderView.setVisibility(0);
        anonymousClass27.renderInputView.setVisibility(0);
    }

    public final void destroyCameraView(boolean z) {
        QRScanner qRScanner = this.qrScanner;
        if (qRScanner != null) {
            qRScanner.cameraView = null;
            Utilities.globalQueue.cancelRunnable(qRScanner.process);
            this.qrScanner = null;
            AnonymousClass6 anonymousClass6 = this.collageLayoutView;
            if (anonymousClass6 != null) {
                anonymousClass6.qrDrawer.setQrDetected(null);
            }
        }
        ScannedLinkPreview scannedLinkPreview = this.qrLinkView;
        if (scannedLinkPreview != null) {
            scannedLinkPreview.blurView = null;
            scannedLinkPreview.blurRenderNode = null;
            scannedLinkPreview.invalidate();
        }
        if (this.cameraView != null) {
            if (z) {
                saveLastCameraBitmap(new StoryRecorder$$ExternalSyntheticLambda7(this, 8));
                return;
            }
            saveLastCameraBitmap(new StoryRecorder$$ExternalSyntheticLambda7(this, 9));
            this.cameraView.destroy(true, null);
            AndroidUtilities.removeFromParent(this.cameraView);
            AnonymousClass6 anonymousClass7 = this.collageLayoutView;
            if (anonymousClass7 != null) {
                anonymousClass7.setCameraView(null);
            }
            this.cameraView = null;
        }
    }

    public final void destroyGalleryListView() {
        AnonymousClass19 anonymousClass19 = this.galleryListView;
        if (anonymousClass19 == null) {
            return;
        }
        this.windowView.removeView(anonymousClass19);
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

    public final void destroyPhotoFilterView() {
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
        AnonymousClass7 anonymousClass7 = this.previewView;
        TextureView textureView2 = anonymousClass7.filterTextureView;
        if (textureView2 != null) {
            anonymousClass7.removeView(textureView2);
            anonymousClass7.filterTextureView = null;
        }
        anonymousClass7.photoFilterView = null;
        anonymousClass7.filterTextureView = null;
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

    public final void destroyPhotoPaintView() {
        AnonymousClass24 anonymousClass24 = this.paintView;
        if (anonymousClass24 == null) {
            return;
        }
        anonymousClass24.entitiesView.removeAllViews();
        AnonymousClass24 anonymousClass25 = this.paintView;
        anonymousClass25.renderView.shutdown();
        anonymousClass25.entitiesView.setVisibility(8);
        anonymousClass25.selectionContainerView.setVisibility(8);
        anonymousClass25.queue.postRunnable(new VoIPFragment$$ExternalSyntheticLambda31(7));
        PaintView.AnonymousClass22 anonymousClass22 = anonymousClass25.emojiPopup;
        if (anonymousClass22 != null) {
            anonymousClass22.lambda$showGiftOfferSheet$15();
        }
        ColorPickerBottomSheet colorPickerBottomSheet = anonymousClass25.colorPickerBottomSheet;
        if (colorPickerBottomSheet != null) {
            colorPickerBottomSheet.lambda$showGiftOfferSheet$15();
        }
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

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
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
            int i6 = this.currentAccount;
            if (i5 != 1) {
                if (i5 == 0 && (storyLimitCheckStoryLimit = MessagesController.getInstance(i6).getStoriesController().checkStoryLimit()) != null && storyLimitCheckStoryLimit.active(i6, 1)) {
                    StoryEntry storyEntry2 = this.outputEntry;
                    if (storyEntry2 == null || storyEntry2.botId == 0) {
                        showLimitReachedSheet(storyLimitCheckStoryLimit, true);
                        return;
                    }
                    return;
                }
                return;
            }
            PreviewButtons previewButtons = this.previewButtons;
            if (!this.videoError) {
                AnonymousClass8 anonymousClass8 = this.captionEdit;
                if (anonymousClass8.getCodePointCount() <= anonymousClass8.getCaptionLimit()) {
                    StoriesController storiesController = MessagesController.getInstance(i6).getStoriesController();
                    int count$1 = getCount$1();
                    StoriesController.StoryLimit storyLimitCheckStoryLimit2 = storiesController.checkStoryLimit();
                    if (storyLimitCheckStoryLimit2 == null || !storyLimitCheckStoryLimit2.active(storiesController.currentAccount, count$1) || ((storyEntry = this.outputEntry) != null && (storyEntry.isEdit || storyEntry.botId != 0))) {
                        z = true;
                    }
                }
            }
            previewButtons.setShareEnabled(z);
        }
    }

    public final Drawable getCameraThumb() {
        Bitmap bitmapDecodeFile;
        try {
            bitmapDecodeFile = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmapDecodeFile = null;
        }
        return bitmapDecodeFile != null ? new BitmapDrawable(bitmapDecodeFile) : this.activity.getResources().getDrawable(R.drawable.icplaceholder);
    }

    public final int getCount$1() {
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

    public final String getCurrentFlashMode() {
        AnonymousClass25 anonymousClass25 = this.cameraView;
        if (anonymousClass25 == null || anonymousClass25.getCameraSession() == null) {
            return null;
        }
        if (!this.cameraView.isFrontface() || this.cameraView.getCameraSession().hasFlashModes()) {
            return this.cameraView.getCameraSession().getCurrentFlashMode();
        }
        checkFrontfaceFlashModes();
        return (String) this.frontfaceFlashModes.get(this.frontfaceFlashMode);
    }

    public final String getNextFlashMode() {
        AnonymousClass25 anonymousClass25 = this.cameraView;
        if (anonymousClass25 == null || anonymousClass25.getCameraSession() == null) {
            return null;
        }
        if (!this.cameraView.isFrontface() || this.cameraView.getCameraSession().hasFlashModes()) {
            return this.cameraView.getCameraSession().getNextFlashMode();
        }
        checkFrontfaceFlashModes();
        ArrayList arrayList = this.frontfaceFlashModes;
        return (String) arrayList.get(this.frontfaceFlashMode + 1 >= arrayList.size() ? 0 : this.frontfaceFlashMode + 1);
    }

    public final ImageView getThemeButton() {
        if (this.themeButton == null) {
            int i = R.raw.sun_outline;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i, SurfaceContainer$$ExternalSyntheticOutline0.m(i, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.themeButtonDrawable = rLottieDrawable;
            rLottieDrawable.playInDirectionOfCustomEndFrame = true;
            StoryEntry storyEntry = this.outputEntry;
            if (storyEntry == null || !storyEntry.isDark) {
                rLottieDrawable.setCustomEndFrame(0);
                this.themeButtonDrawable.setCurrentFrame(0, true, false);
            } else {
                rLottieDrawable.setCurrentFrame(35, true, false);
                this.themeButtonDrawable.setCustomEndFrame(36);
            }
            this.themeButtonDrawable.applyingLayerColors = true;
            int color = Theme.getColor(Theme.key_chats_menuName, this.resourcesProvider);
            RLottieDrawable rLottieDrawable2 = this.themeButtonDrawable;
            OKLCH.m(color, rLottieDrawable2.newColorUpdates, "Sunny", rLottieDrawable2);
            RLottieDrawable rLottieDrawable3 = this.themeButtonDrawable;
            OKLCH.m(color, rLottieDrawable3.newColorUpdates, "Path 6", rLottieDrawable3);
            RLottieDrawable rLottieDrawable4 = this.themeButtonDrawable;
            OKLCH.m(color, rLottieDrawable4.newColorUpdates, "Path", rLottieDrawable4);
            RLottieDrawable rLottieDrawable5 = this.themeButtonDrawable;
            OKLCH.m(color, rLottieDrawable5.newColorUpdates, "Path 5", rLottieDrawable5);
            this.themeButtonDrawable.commitApplyLayerColors();
            ImageView imageView = new ImageView(this.activity);
            this.themeButton = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.themeButton.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.themeButton.setBackground(Theme.createSelectorDrawable(553648127, 1, -1));
            this.themeButton.setOnClickListener(new StoryRecorder$$ExternalSyntheticLambda24(this, 1));
            this.themeButton.setVisibility(8);
            this.themeButton.setImageDrawable(this.themeButtonDrawable);
            this.themeButton.setAlpha(0.0f);
            this.actionBarButtons.addView(this.themeButton, 0, LayoutHelper.createLinear(46, 56, 53));
        }
        return this.themeButton;
    }

    public final void hidePhotoPaintView() {
        AnonymousClass24 anonymousClass24 = this.paintView;
        if (anonymousClass24 == null) {
            return;
        }
        this.previewTouchable = null;
        anonymousClass24.getTopLayout().setAlpha(0.0f);
        this.paintView.getTopLayout().setTranslationY(-AndroidUtilities.dp(16.0f));
        this.paintView.getBottomLayout().setAlpha(0.0f);
        this.paintView.getBottomLayout().setTranslationY(AndroidUtilities.dp(48.0f));
        this.paintView.getWeightChooserView().setTranslationX(-AndroidUtilities.dp(32.0f));
        this.paintView.setVisibility(8);
    }

    public final boolean inCheck() {
        return !this.animatedRecording && (this.collageLayoutView.hasLayout() ? this.collageLayoutView.getFilledProgress() : 0.0f) >= 1.0f;
    }

    public final boolean isGalleryOpen() {
        AnonymousClass19 anonymousClass19;
        if (this.scrollingY || (anonymousClass19 = this.galleryListView) == null) {
            return false;
        }
        return anonymousClass19.getTranslationY() < ((float) ((this.windowView.getMeasuredHeight() - ((int) (((float) AndroidUtilities.displaySize.y) * 0.35f))) - (ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)));
    }

    public final void navigateTo(int i, boolean z) {
        StoryEntry storyEntry;
        StoryEntry storyEntry2;
        int i2;
        int i3;
        float fDp;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        ImageView imageView;
        float f9;
        StoryEntry storyEntry3;
        StoryEntry storyEntry4;
        StoryEntry storyEntry5;
        StoryEntry storyEntry6;
        AnonymousClass25 anonymousClass25;
        DownloadButton downloadButton = this.downloadButton;
        ChatActivity.AnonymousClass27 anonymousClass27 = this.playButton;
        RLottieImageView rLottieImageView = this.muteButton;
        TimelineView timelineView = this.coverTimelineView;
        TimelineView timelineView2 = this.timelineView;
        ButtonWithCounterView buttonWithCounterView = this.coverButton;
        SimpleTextView simpleTextView = this.titleTextView;
        AnonymousClass8 anonymousClass8 = this.captionEdit;
        HintTextView hintTextView = this.collageHintTextView;
        HintTextView hintTextView2 = this.hintTextView;
        ScannedLinkPreview scannedLinkPreview = this.qrLinkView;
        AnonymousClass7 anonymousClass7 = this.previewView;
        AnonymousClass4 anonymousClass4 = this.captionContainer;
        AnonymousClass12 anonymousClass12 = this.modeSwitcherView;
        RecordControl recordControl = this.recordControl;
        AnonymousClass6 anonymousClass6 = this.collageLayoutView;
        CollageLayoutButton.CollageLayoutListView collageLayoutListView = this.collageListView;
        int i4 = this.currentPage;
        if (i == i4) {
            return;
        }
        this.currentPage = i;
        AnimatorSet animatorSet = this.pageAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        onNavigateStart(i4, i);
        PreviewButtons previewButtons = this.previewButtons;
        if (previewButtons != null) {
            previewButtons.appear(i == 1, z);
        }
        showVideoTimer(i == 0 && this.mode == 1 && !collageLayoutListView.visible && !inCheck(), z);
        if (i != 1) {
            this.videoTimeView.show(z);
        }
        setActionBarButtonVisible(this.backButton, !collageLayoutListView.visible, z);
        setActionBarButtonVisible(this.flashButton, (this.animatedRecording || i != 0 || collageLayoutListView.visible || this.flashButtonMode == null || inCheck()) ? false : true, z);
        setActionBarButtonVisible(this.dualButton, (this.animatedRecording || i != 0 || (anonymousClass25 = this.cameraView) == null || !anonymousClass25.dualAvailable || collageLayoutListView.visible || anonymousClass6.hasLayout()) ? false : true, true);
        setActionBarButtonVisible(this.collageButton, (this.animatedRecording || i != 0 || collageLayoutListView.visible) ? false : true, z);
        updateActionBarButtons(z);
        if (!z) {
            AnonymousClass25 anonymousClass26 = this.cameraView;
            if (anonymousClass26 != null) {
                anonymousClass26.setAlpha(i == 0 ? 1.0f : 0.0f);
            }
            anonymousClass7.setAlpha(((i != 1 || anonymousClass6.hasLayout()) && i != 2) ? 0.0f : 1.0f);
            anonymousClass6.setAlpha((i == 0 || (i == 1 && anonymousClass6.hasLayout())) ? 1.0f : 0.0f);
            recordControl.setAlpha(i == 0 ? 1.0f : 0.0f);
            recordControl.setTranslationY(i == 0 ? 0.0f : AndroidUtilities.dp(16.0f));
            scannedLinkPreview.setAlpha(i == 0 ? 1.0f : 0.0f);
            anonymousClass12.setAlpha((i != 0 || inCheck()) ? 0.0f : 1.0f);
            anonymousClass12.setTranslationY((i != 0 || inCheck()) ? AndroidUtilities.dp(16.0f) : 0.0f);
            hintTextView2.setAlpha((i == 0 && this.animatedRecording && !inCheck()) ? 1.0f : 0.0f);
            hintTextView.setAlpha((i == 0 && !this.animatedRecording && inCheck()) ? 0.6f : 0.0f);
            anonymousClass4.setAlpha((i == 1 || i == 2) ? 1.0f : 0.0f);
            anonymousClass4.setTranslationY((i == 1 || i == 2) ? 0.0f : AndroidUtilities.dp(12.0f));
            anonymousClass8.setAlpha(i == 2 ? 0.0f : 1.0f);
            rLottieImageView.setAlpha((i == 1 && this.mode == 1) ? 1.0f : 0.0f);
            anonymousClass27.setAlpha((i != 1 || (this.mode != 1 && ((storyEntry2 = this.outputEntry) == null || TextUtils.isEmpty(storyEntry2.audioPath)))) ? 0.0f : 1.0f);
            int i5 = 1;
            downloadButton.setAlpha(i == 1 ? 1.0f : 0.0f);
            ImageView imageView2 = this.themeButton;
            if (imageView2 != null) {
                imageView2.setAlpha((i == 1 && (storyEntry = this.outputEntry) != null && storyEntry.isRepostMessage) ? 1.0f : 0.0f);
                i5 = 1;
            }
            timelineView2.setAlpha(i == i5 ? 1.0f : 0.0f);
            timelineView.setAlpha(i == 2 ? 1.0f : 0.0f);
            simpleTextView.setAlpha((i == i5 || i == 2) ? 1.0f : 0.0f);
            buttonWithCounterView.setAlpha(i == 2 ? 1.0f : 0.0f);
            onNavigateEnd(i4, i);
            return;
        }
        this.pageAnimator = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        AnonymousClass25 anonymousClass28 = this.cameraView;
        if (anonymousClass28 != null) {
            i2 = 1;
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass28, (Property<AnonymousClass25, Float>) View.ALPHA, i == 0 ? 1.0f : 0.0f));
        } else {
            i2 = 1;
        }
        Property property = View.ALPHA;
        float[] fArr = new float[i2];
        fArr[0] = ((i != i2 || anonymousClass6.hasLayout()) && i != 2) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(anonymousClass7, (Property<AnonymousClass7, Float>) property, fArr));
        float[] fArr2 = new float[i2];
        fArr2[0] = (i == 0 || (i == i2 && anonymousClass6.hasLayout())) ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(anonymousClass6, (Property<AnonymousClass6, Float>) property, fArr2));
        float[] fArr3 = new float[i2];
        fArr3[0] = i == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(recordControl, (Property<RecordControl, Float>) property, fArr3));
        Property property2 = View.TRANSLATION_Y;
        float[] fArr4 = new float[i2];
        fArr4[0] = i == 0 ? 0.0f : AndroidUtilities.dp(24.0f);
        arrayList.add(ObjectAnimator.ofFloat(recordControl, (Property<RecordControl, Float>) property2, fArr4));
        float[] fArr5 = new float[i2];
        fArr5[0] = i == 0 ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(scannedLinkPreview, (Property<ScannedLinkPreview, Float>) property, fArr5));
        float[] fArr6 = new float[i2];
        fArr6[0] = (i != 0 || inCheck()) ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(anonymousClass12, (Property<AnonymousClass12, Float>) property, fArr6));
        arrayList.add(ObjectAnimator.ofFloat(anonymousClass12, (Property<AnonymousClass12, Float>) property2, (i != 0 || inCheck()) ? AndroidUtilities.dp(24.0f) : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(hintTextView2, (Property<HintTextView, Float>) property, (i == 0 && this.animatedRecording && !inCheck()) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(hintTextView, (Property<HintTextView, Float>) property, (i == 0 && !this.animatedRecording && inCheck()) ? 0.6f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(anonymousClass4, (Property<AnonymousClass4, Float>) property, ((i == 1 && ((storyEntry6 = this.outputEntry) == null || storyEntry6.botId == 0)) || i == 2) ? 1.0f : 0.0f));
        if (i != 1 || ((storyEntry5 = this.outputEntry) != null && storyEntry5.botId != 0)) {
            i3 = 2;
            if (i != 2) {
                fDp = AndroidUtilities.dp(12.0f);
            }
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass4, (Property<AnonymousClass4, Float>) property2, fDp));
            if (i == i3) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass8, (Property<AnonymousClass8, Float>) property, f));
            if (i != 1 || i == i3) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(simpleTextView, (Property<SimpleTextView, Float>) property, f2));
            if (i == i3) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(buttonWithCounterView, (Property<ButtonWithCounterView, Float>) property, f3));
            if (i == 1) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(timelineView2, (Property<TimelineView, Float>) property, f4));
            if (i == 2) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(timelineView, (Property<TimelineView, Float>) property, f5));
            if (i == 1 || this.mode != 1) {
                f6 = 0.0f;
            } else {
                f6 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(rLottieImageView, (Property<RLottieImageView, Float>) property, f6));
            if (i == 1 || (this.mode != 1 && ((storyEntry4 = this.outputEntry) == null || TextUtils.isEmpty(storyEntry4.audioPath)))) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass27, (Property<ChatActivity.AnonymousClass27, Float>) property, f7));
            if (i == 1) {
                f8 = 1.0f;
            } else {
                f8 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(downloadButton, (Property<DownloadButton, Float>) property, f8));
            imageView = this.themeButton;
            if (imageView != null) {
                if (i == 1 || (storyEntry3 = this.outputEntry) == null || !storyEntry3.isRepostMessage) {
                    f9 = 0.0f;
                } else {
                    f9 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, f9));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.zoomControlView, (Property<ZoomControlView, Float>) property, 0.0f));
            this.pageAnimator.playTogether(arrayList);
            this.pageAnimator.addListener(new AnonymousClass16(this, i4, i, 0));
            this.pageAnimator.setDuration(460L);
            this.pageAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.pageAnimator.start();
        }
        i3 = 2;
        fDp = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(anonymousClass4, (Property<AnonymousClass4, Float>) property2, fDp));
        if (i == i3) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(anonymousClass8, (Property<AnonymousClass8, Float>) property, f));
        if (i != 1) {
            f2 = 1.0f;
        } else {
            f2 = 1.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(simpleTextView, (Property<SimpleTextView, Float>) property, f2));
        if (i == i3) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(buttonWithCounterView, (Property<ButtonWithCounterView, Float>) property, f3));
        if (i == 1) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(timelineView2, (Property<TimelineView, Float>) property, f4));
        if (i == 2) {
            f5 = 1.0f;
        } else {
            f5 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(timelineView, (Property<TimelineView, Float>) property, f5));
        if (i == 1) {
            f6 = 0.0f;
        } else {
            f6 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(rLottieImageView, (Property<RLottieImageView, Float>) property, f6));
        if (i == 1) {
            f7 = 0.0f;
        } else {
            f7 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(anonymousClass27, (Property<ChatActivity.AnonymousClass27, Float>) property, f7));
        if (i == 1) {
            f8 = 1.0f;
        } else {
            f8 = 0.0f;
        }
        arrayList.add(ObjectAnimator.ofFloat(downloadButton, (Property<DownloadButton, Float>) property, f8));
        imageView = this.themeButton;
        if (imageView != null) {
            if (i == 1) {
                f9 = 0.0f;
            } else {
                f9 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, f9));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.zoomControlView, (Property<ZoomControlView, Float>) property, 0.0f));
        this.pageAnimator.playTogether(arrayList);
        this.pageAnimator.addListener(new AnonymousClass16(this, i4, i, 0));
        this.pageAnimator.setDuration(460L);
        this.pageAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.pageAnimator.start();
    }

    public final void navigateToPreviewWithPlayerAwait(long j, Runnable runnable) {
        if (this.awaitingPlayer || this.outputEntry == null) {
            return;
        }
        TodoItemMenu$$ExternalSyntheticLambda9 todoItemMenu$$ExternalSyntheticLambda9 = this.afterPlayerAwait;
        if (todoItemMenu$$ExternalSyntheticLambda9 != null) {
            AndroidUtilities.cancelRunOnUIThread(todoItemMenu$$ExternalSyntheticLambda9);
        }
        this.previewAlreadySet = true;
        this.awaitingPlayer = true;
        this.afterPlayerAwait = new TodoItemMenu$$ExternalSyntheticLambda9(5, this, runnable);
        this.previewView.setAlpha(0.0f);
        this.previewView.setVisibility(0);
        this.previewView.set(this.outputEntry, this.afterPlayerAwait, j);
        this.previewView.setupAudio(false, this.outputEntry);
        AndroidUtilities.runOnUIThread(this.afterPlayerAwait, 800L);
    }

    public final boolean onBackPressed() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.StoryRecorder.onBackPressed():boolean");
    }

    public final void onNavigateEnd(int i, int i2) {
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
            AnonymousClass8 anonymousClass8 = this.captionEdit;
            StoryEntry storyEntry3 = this.outputEntry;
            anonymousClass8.setVisibility((storyEntry3 == null || storyEntry3.botId == 0) ? 0 : 8);
        }
        if (i2 == 0 && this.showSavedDraftHint) {
            DraftSavedHint draftSavedHint = this.draftSavedHint;
            Activity activity = this.activity;
            if (draftSavedHint == null) {
                DraftSavedHint draftSavedHint2 = new DraftSavedHint(activity);
                this.draftSavedHint = draftSavedHint2;
                this.controlContainer.addView(draftSavedHint2, LayoutHelper.createFrame(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
            }
            this.draftSavedHint.setVisibility(0);
            if (this.draftSavedHint == null) {
                DraftSavedHint draftSavedHint3 = new DraftSavedHint(activity);
                this.draftSavedHint = draftSavedHint3;
                this.controlContainer.addView(draftSavedHint3, LayoutHelper.createFrame(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
            }
            DraftSavedHint draftSavedHint4 = this.draftSavedHint;
            draftSavedHint4.showT.set(0.0f, true);
            draftSavedHint4.show(true);
            VoIPFragment$12$$ExternalSyntheticLambda0 voIPFragment$12$$ExternalSyntheticLambda0 = draftSavedHint4.hideRunnable;
            if (voIPFragment$12$$ExternalSyntheticLambda0 != null) {
                AndroidUtilities.cancelRunOnUIThread(voIPFragment$12$$ExternalSyntheticLambda0);
            }
            VoIPFragment$12$$ExternalSyntheticLambda0 voIPFragment$12$$ExternalSyntheticLambda1 = new VoIPFragment$12$$ExternalSyntheticLambda0(draftSavedHint4, 3);
            draftSavedHint4.hideRunnable = voIPFragment$12$$ExternalSyntheticLambda1;
            AndroidUtilities.runOnUIThread(voIPFragment$12$$ExternalSyntheticLambda1, 3500L);
            this.recordControl.updateGalleryImage();
        }
        this.showSavedDraftHint = false;
        PhotoFilterView.EnhanceView enhanceView2 = this.photoFilterEnhanceView;
        if (enhanceView2 != null) {
            enhanceView2.setAllowTouch(i2 == 1 && ((i3 = this.currentEditMode) == -1 || i3 == 1));
        }
        AnonymousClass8 anonymousClass9 = this.captionEdit;
        if (anonymousClass9 != null) {
            anonymousClass9.ignoreTouches = i2 != 1;
        }
        if (i2 == 1) {
            int i4 = this.currentAccount;
            MediaDataController.getInstance(i4).checkStickers(0);
            MediaDataController.getInstance(i4).loadRecents(0, false, true, false);
            MediaDataController.getInstance(i4).loadRecents(2, false, true, false);
            StoriesController storiesController = MessagesController.getInstance(i4).getStoriesController();
            if (storiesController.lastBlocklistRequested == 0) {
                storiesController.loadBlocklist();
            }
            MessagesController.getInstance(i4).getStoriesController().loadSendAs();
        }
    }

    public final void onNavigateStart(int i, int i2) {
        SpannableStringBuilder spannableStringBuilderAppend;
        boolean z;
        StoryEntry storyEntry;
        boolean z2;
        StoryEntry storyEntry2;
        boolean z3;
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
            AnonymousClass6 anonymousClass6 = this.collageLayoutView;
            if (anonymousClass6 != null) {
                anonymousClass6.clear$2();
                this.recordControl.setCollageProgress(0.0f, false);
            }
        }
        if (i == 0) {
            setCameraFlashModeIcon(null);
            saveLastCameraBitmap(new StoryRecorder$$ExternalSyntheticLambda7(this, 20));
            DraftSavedHint draftSavedHint = this.draftSavedHint;
            if (draftSavedHint != null) {
                draftSavedHint.setVisibility(8);
            }
            this.cameraHint.hide(true);
            HintView2 hintView2 = this.dualHint;
            if (hintView2 != null) {
                hintView2.hide(true);
            }
        }
        int i3 = this.currentAccount;
        if (i2 == 1 || i == 1) {
            this.downloadButton.setEntry(i2 == 1 ? this.outputEntry : null);
            if (this.mode == 1) {
                this.muteButton.setVisibility(0);
                StoryEntry storyEntry7 = this.outputEntry;
                setIconMuted(storyEntry7 != null && storyEntry7.muted, false);
                this.playButton.setVisibility(0);
                this.previewView.updatePauseReason(-9982, false);
                ((PlayPauseDrawable) this.playButton.this$0).setPause(!this.previewView.pauseLinks.contains(-9982), false);
                this.titleTextView.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                StoryEntry storyEntry8 = this.outputEntry;
                if (storyEntry8 == null || TextUtils.isEmpty(storyEntry8.audioPath)) {
                    this.titleTextView.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.muteButton.setVisibility(8);
                    this.playButton.setVisibility(0);
                    ((PlayPauseDrawable) this.playButton.this$0).setPause(true, false);
                    this.titleTextView.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.downloadButton.setVisibility(0);
            StoryEntry storyEntry9 = this.outputEntry;
            if (storyEntry9 == null || !storyEntry9.isRepostMessage) {
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
            AnonymousClass8 anonymousClass8 = this.captionEdit;
            StoryEntry storyEntry10 = this.outputEntry;
            anonymousClass8.setVisibility(((storyEntry10 == null || storyEntry10.botId == 0) && this.botId == 0) ? 0 : 8);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.videoTimelineContainerView.getLayoutParams();
            StoryEntry storyEntry11 = this.outputEntry;
            layoutParams.bottomMargin = AndroidUtilities.dp(((storyEntry11 == null || storyEntry11.botId == 0) && this.botId == 0) ? 68.0f : 12.0f);
            this.videoTimelineContainerView.setLayoutParams(layoutParams);
            this.captionContainer.setVisibility(0);
            this.captionContainer.clearFocus();
            AnonymousClass8 anonymousClass9 = this.captionEdit;
            StoryEntry storyEntry12 = this.outputEntry;
            anonymousClass9.setPeriod(storyEntry12 == null ? 86400 : storyEntry12.period, false);
            this.captionEdit.setPeriodVisible(!MessagesController.getInstance(i3).premiumFeaturesBlocked() && ((storyEntry = this.outputEntry) == null || !storyEntry.isEdit));
            AnonymousClass8 anonymousClass10 = this.captionEdit;
            StoryEntry storyEntry13 = this.outputEntry;
            anonymousClass10.setHasRoundVideo((storyEntry13 == null || storyEntry13.round == null) ? false : true);
            AnonymousClass8 anonymousClass11 = this.captionEdit;
            if (anonymousClass11 == null) {
                j = 0;
            } else {
                StoryEntry storyEntry14 = this.outputEntry;
                if (storyEntry14 == null || !storyEntry14.isRepost) {
                    j = 0;
                    anonymousClass11.setReply(null, null);
                } else {
                    TLRPC.Peer peer = storyEntry14.repostPeer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        String userName = UserObject.getUserName(MessagesController.getInstance(i3).getUser(Long.valueOf(peer.user_id)));
                        StoryEntry storyEntry15 = this.outputEntry;
                        spannableStringBuilderAppend = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
                        storyEntry15.repostPeerName = spannableStringBuilderAppend;
                    } else {
                        TLRPC.Chat chat = MessagesController.getInstance(i3).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
                        String str = chat == null ? "" : chat.title;
                        StoryEntry storyEntry16 = this.outputEntry;
                        spannableStringBuilderAppend = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) str);
                        storyEntry16.repostPeerName = spannableStringBuilderAppend;
                    }
                    String str2 = this.outputEntry.repostCaption;
                    boolean zIsEmpty = TextUtils.isEmpty(str2);
                    CharSequence charSequence = str2;
                    if (zIsEmpty) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Story));
                        spannableString.setSpan(new AnonymousClass15(), 0, spannableString.length(), 33);
                        charSequence = spannableString;
                    }
                    this.captionEdit.setReply(charSequence, spannableStringBuilderAppend);
                }
            }
            TimelineView timelineView = this.timelineView;
            StoryEntry storyEntry17 = this.outputEntry;
            if (storyEntry17 == null || !storyEntry17.isCollage()) {
                z = true;
                break;
            }
            StoryEntry storyEntry18 = this.outputEntry;
            if (!storyEntry18.isCollage()) {
                z = true;
                break;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= storyEntry18.collageContent.size()) {
                    z = true;
                    break;
                } else {
                    if (((StoryEntry) storyEntry18.collageContent.get(i4)).isVideo) {
                        z = false;
                        break;
                    }
                    i4++;
                }
            }
            boolean z4 = timelineView.open;
            timelineView.open = z;
            timelineView.openT.set(z, true);
            timelineView.invalidate();
        } else {
            j = 0;
        }
        if (i2 == 2 || i == 2) {
            this.titleTextView.setVisibility(0);
            this.coverTimelineView.setVisibility(0);
            StoryEntry storyEntry19 = this.outputEntry;
            if (storyEntry19 != null && storyEntry19.isEditingCover) {
                this.titleTextView.setText(LocaleController.getString(R.string.RecorderEditCover), false);
            }
            this.captionContainer.setVisibility(0);
            this.coverButton.setVisibility(0);
        }
        if (i2 == 2) {
            this.titleTextView.setText(LocaleController.getString(R.string.RecorderEditCover), false);
        }
        if (i2 == 1) {
            this.videoError = false;
            StoryEntry storyEntry20 = this.outputEntry;
            boolean z5 = (storyEntry20 == null || storyEntry20.botId == j) ? false : true;
            boolean z6 = storyEntry20 != null && storyEntry20.isEdit;
            PreviewButtons previewButtons = this.previewButtons;
            String string = LocaleController.getString(z6 ? R.string.Done : z5 ? R.string.UploadBotPreview : R.string.Next);
            boolean z7 = !z5;
            if (!TextUtils.equals(string, previewButtons.shareText) || z7 != previewButtons.shareArrow) {
                previewButtons.removeView(previewButtons.shareButton);
                Context context = previewButtons.getContext();
                previewButtons.shareText = string;
                previewButtons.shareArrow = z7;
                PreviewButtons.ShareButtonView shareButtonView = previewButtons.new ShareButtonView(context, string, z7);
                previewButtons.shareButton = shareButtonView;
                shareButtonView.setContentDescription(string);
                previewButtons.addView(previewButtons.shareButton, LayoutHelper.createFrame(-2.0f, -2));
                previewButtons.updateAppearT();
            }
            this.coverTimelineView.setVisibility(8);
            this.coverButton.setVisibility(8);
            if (!this.previewAlreadySet) {
                StoryEntry storyEntry21 = this.outputEntry;
                if (storyEntry21 == null || !storyEntry21.isRepostMessage) {
                    this.previewView.set(storyEntry21);
                } else {
                    this.previewView.preset(storyEntry21);
                }
            }
            this.previewAlreadySet = false;
            this.captionEdit.editText.getEditText().setOnPremiumMenuLockClickListener(MessagesController.getInstance(i3).storyEntitiesAllowed() ? null : new StoryRecorder$$ExternalSyntheticLambda7(this, 21));
            this.storiesSelector.setVisibility(this.entries == null ? 8 : 0);
            ArrayList arrayList = this.entries;
            if (arrayList != null) {
                AnonymousClass11 anonymousClass12 = this.storiesSelector;
                ArrayList arrayList2 = this.selectedEntriesOrder;
                ArrayList arrayList3 = this.selectedEntries;
                anonymousClass12.showList(false, false);
                anonymousClass12.stories = arrayList;
                anonymousClass12.selectedOrder = arrayList2;
                anonymousClass12.selectedStories = arrayList3;
                anonymousClass12.counter = new Text(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                anonymousClass12.hint = new Text(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                anonymousClass12.listView.adapter.update(false);
                this.storiesSelector.setSelected(this.entries.indexOf(this.outputEntry));
            }
            this.timelineView.setMaxCount((z5 || z6 || this.entries != null || ((storyEntry5 = this.outputEntry) != null && (storyEntry5.isCollage() || !this.outputEntry.isVideo))) ? 1 : 3);
            if (i != 2) {
                StoryEntry storyEntry22 = this.outputEntry;
                if (storyEntry22 != null && (storyEntry22.isDraft || storyEntry22.isEdit || this.isReposting)) {
                    if (storyEntry22.paintFile != null) {
                        destroyPhotoPaintView();
                        createPhotoPaintView();
                        hidePhotoPaintView();
                    }
                    StoryEntry storyEntry23 = this.outputEntry;
                    if (storyEntry23.isVideo && storyEntry23.filterState != null && (textureView = this.previewView.getTextureView()) != null) {
                        textureView.setDelegate(new StoryRecorder$$ExternalSyntheticLambda12(this, 7));
                    }
                    this.captionEdit.setText(this.outputEntry.caption);
                } else if (i != 2) {
                    AnonymousClass8 anonymousClass13 = this.captionEdit;
                    anonymousClass13.ignoreTextChange = true;
                    anonymousClass13.editText.setText("");
                }
            }
            PreviewButtons previewButtons2 = this.previewButtons;
            StoryEntry storyEntry24 = this.outputEntry;
            boolean z8 = storyEntry24 == null || ((!storyEntry24.isRepostMessage || storyEntry24.isVideo) && !storyEntry24.isCollage());
            for (int i5 = 0; i5 < previewButtons2.buttons.size(); i5++) {
                PreviewButtons.ButtonView buttonView = (PreviewButtons.ButtonView) previewButtons2.buttons.get(i5);
                if (buttonView.id == 4) {
                    buttonView.setVisibility(z8 ? 0 : 8);
                }
            }
            PreviewButtons previewButtons3 = this.previewButtons;
            boolean z9 = (!BuildVars.DEBUG_PRIVATE_VERSION || (storyEntry4 = this.outputEntry) == null || storyEntry4.isRepostMessage || storyEntry4.isCollage()) ? false : true;
            for (int i6 = 0; i6 < previewButtons3.buttons.size(); i6++) {
                PreviewButtons.ButtonView buttonView2 = (PreviewButtons.ButtonView) previewButtons3.buttons.get(i6);
                if (buttonView2.id == 3) {
                    buttonView2.setVisibility(z9 ? 0 : 8);
                }
            }
            PreviewButtons previewButtons4 = this.previewButtons;
            if (this.videoError) {
                z3 = false;
            } else {
                AnonymousClass8 anonymousClass14 = this.captionEdit;
                if (anonymousClass14.getCodePointCount() > anonymousClass14.getCaptionLimit()) {
                    z3 = false;
                } else {
                    StoriesController storiesController = MessagesController.getInstance(i3).getStoriesController();
                    int count$1 = getCount$1();
                    StoriesController.StoryLimit storyLimitCheckStoryLimit = storiesController.checkStoryLimit();
                    if (storyLimitCheckStoryLimit == null || !storyLimitCheckStoryLimit.active(storiesController.currentAccount, count$1) || ((storyEntry3 = this.outputEntry) != null && (storyEntry3.isEdit || storyEntry3.botId != j))) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            }
            previewButtons4.setShareEnabled(z3);
            RLottieImageView rLottieImageView = this.muteButton;
            StoryEntry storyEntry25 = this.outputEntry;
            rLottieImageView.setImageResource((storyEntry25 == null || !storyEntry25.muted) ? R.drawable.media_mute : R.drawable.media_unmute);
            this.previewView.setVisibility(0);
            this.timelineView.setVisibility(0);
            this.titleTextView.setVisibility(0);
            this.titleTextView.setTranslationX(0.0f);
            StoryEntry storyEntry26 = this.outputEntry;
            if (storyEntry26 != null && storyEntry26.botId != j) {
                this.titleTextView.setText("", false);
            } else if (storyEntry26 != null && storyEntry26.isEdit) {
                this.titleTextView.setText(LocaleController.getString(R.string.RecorderEditStory), false);
            } else if (storyEntry26 != null && storyEntry26.isRepostMessage) {
                this.titleTextView.setText(LocaleController.getString(R.string.RecorderRepost), false);
            } else if (storyEntry26 == null || !storyEntry26.isRepost) {
                this.titleTextView.setText(LocaleController.getString(R.string.RecorderNewStory), false);
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                AvatarSpan avatarSpan = new AvatarSpan(this.titleTextView, 32.0f, i3);
                this.titleTextView.setTranslationX(-AndroidUtilities.dp(6.0f));
                SpannableString spannableString2 = new SpannableString("a");
                spannableString2.setSpan(avatarSpan, 0, 1, 33);
                if (this.outputEntry.repostPeer instanceof TLRPC.TL_peerUser) {
                    TLRPC.User user = MessagesController.getInstance(i3).getUser(Long.valueOf(this.outputEntry.repostPeer.user_id));
                    avatarSpan.setUser(user);
                    spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                    spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                } else {
                    TLRPC.Chat chat2 = MessagesController.getInstance(i3).getChat(Long.valueOf(-DialogObject.getPeerDialogId(this.outputEntry.repostPeer)));
                    avatarSpan.setChat(chat2);
                    spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                    spannableStringBuilder.append((CharSequence) (chat2 != null ? chat2.title : ""));
                }
                this.titleTextView.setText(spannableStringBuilder, false);
            }
        }
        if (i == 1) {
            AnonymousClass8 anonymousClass15 = this.captionEdit;
            ItemOptions itemOptions = anonymousClass15.periodPopup;
            if (itemOptions != null) {
                itemOptions.dismiss();
                anonymousClass15.periodPopup = null;
            }
            this.muteHint.hide(true);
            AnonymousClass11 anonymousClass16 = this.storiesSelector;
            if (anonymousClass16.listShown) {
                anonymousClass16.showList(false, true);
            }
        }
        if (i2 == 2 && (storyEntry2 = this.outputEntry) != null) {
            if (storyEntry2.cover < j) {
                storyEntry2.cover = j;
            }
            this.coverValue = storyEntry2.cover;
            long duration = this.previewView.getDuration() < 100 ? this.outputEntry.duration : this.previewView.getDuration();
            StoryEntry storyEntry27 = this.outputEntry;
            if (storyEntry27.duration <= 0) {
                storyEntry27.duration = duration;
            }
            TimelineView timelineView2 = this.coverTimelineView;
            File file = storyEntry27.filterFile;
            if (file == null) {
                file = storyEntry27.file;
            }
            String absolutePath = file.getAbsolutePath();
            StoryEntry storyEntry28 = this.outputEntry;
            timelineView2.setVideo(false, absolutePath, storyEntry28.duration, storyEntry28.videoVolume);
            TimelineView timelineView3 = this.coverTimelineView;
            StoryEntry storyEntry29 = this.outputEntry;
            float f = duration;
            long j2 = (long) (storyEntry29.left * f);
            long j3 = (long) (storyEntry29.right * f);
            timelineView3.coverStart = j2;
            timelineView3.coverEnd = j3;
            TimelineView.Track track = timelineView3.videoTrack;
            if (track != null) {
                track.setupThumbs(true);
            }
            final TodoItemMenu$$ExternalSyntheticLambda17 todoItemMenu$$ExternalSyntheticLambda17 = new TodoItemMenu$$ExternalSyntheticLambda17(this, 4);
            this.coverTimelineView.setDelegate(new TimelineView.TimelineDelegate() {
                @Override
                public final void onAudioLeftChange(float f2) {
                }

                @Override
                public final void onAudioOffsetChange(long j4) {
                }

                @Override
                public final void onAudioRemove() {
                }

                @Override
                public final void onAudioRightChange(float f2) {
                }

                @Override
                public final void onAudioVolumeChange(float f2) {
                }

                @Override
                public final void onProgressChange(long j4, boolean z10) {
                }

                @Override
                public final void onProgressDragChange(boolean z10) {
                }

                @Override
                public final void onRoundLeftChange(float f2) {
                }

                @Override
                public final void onRoundOffsetChange(long j4) {
                }

                @Override
                public final void onRoundRemove() {
                }

                @Override
                public final void onRoundRightChange(float f2) {
                }

                @Override
                public final void onRoundSelectChange(boolean z10) {
                }

                @Override
                public final void onRoundVolumeChange(float f2) {
                }

                @Override
                public final void onVideoLeftChange(float f2, int i7) {
                }

                @Override
                public final void onVideoOffsetChange(int i7, long j4) {
                }

                @Override
                public final void onVideoRightChange(float f2) {
                }

                @Override
                public final void onVideoSelected(int i7) {
                }

                @Override
                public final void onVideoVolumeChange(float f2) {
                }

                @Override
                public final void onVideoLeftChange(float f2, boolean z10) {
                    todoItemMenu$$ExternalSyntheticLambda17.run(Boolean.FALSE, Float.valueOf(f2));
                }

                @Override
                public final void onVideoRightChange(float f2, int i7) {
                }

                @Override
                public final void onVideoVolumeChange(float f2, int i7) {
                }
            });
            float fMax = (this.coverValue / Math.max(1L, duration)) * 0.96f;
            this.coverTimelineView.setVideoLeft(fMax);
            this.coverTimelineView.setVideoRight(0.04f + fMax);
            todoItemMenu$$ExternalSyntheticLambda17.run(Boolean.TRUE, Float.valueOf(fMax));
        }
        PhotoFilterView.EnhanceView enhanceView = this.photoFilterEnhanceView;
        if (enhanceView != null) {
            enhanceView.setAllowTouch(false);
        }
        HintView2 hintView3 = this.savedDualHint;
        if (hintView3 != null) {
            hintView3.hide(true);
        }
        Bulletin bulletin = Bulletin.visibleBulletin;
        if (bulletin != null) {
            bulletin.hide();
        }
        AnonymousClass8 anonymousClass17 = this.captionEdit;
        if (anonymousClass17 != null) {
            CaptionContainerView.AnonymousClass3 anonymousClass3 = anonymousClass17.editText;
            AndroidUtilities.hideKeyboard(anonymousClass3.editText);
            z2 = true;
            anonymousClass3.hidePopup(true);
            this.captionEdit.ignoreTouches = true;
        } else {
            z2 = true;
        }
        AnonymousClass7 anonymousClass7 = this.previewView;
        if (anonymousClass7 != null) {
            anonymousClass7.updatePauseReason(8, i2 != z2);
        }
        AnonymousClass24 anonymousClass24 = this.paintView;
        if (anonymousClass24 != null) {
            anonymousClass24.setCoverPreview(i2 != z2);
        }
        HintView2 hintView4 = this.removeCollageHint;
        if (hintView4 != null) {
            hintView4.hide(z2);
        }
        AnonymousClass6 anonymousClass18 = this.collageLayoutView;
        anonymousClass18.setPreview(i2 == z2 && anonymousClass18.hasLayout());
    }

    public final void onResumeInternal() {
        RenderView.CanvasInternal canvasInternal;
        boolean z = false;
        if (this.currentPage == 0) {
            ValueAnimator valueAnimator = this.openCloseAnimator;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                requestCameraPermission(false);
            } else {
                this.whenOpenDone = new StoryRecorder$$ExternalSyntheticLambda9(this, 0);
            }
        }
        AnonymousClass8 anonymousClass8 = this.captionEdit;
        if (anonymousClass8 != null) {
            anonymousClass8.editText.onResume();
        }
        RecordControl recordControl = this.recordControl;
        if (recordControl != null) {
            recordControl.updateGalleryImage();
        }
        PreviewHighlightView previewHighlightView = this.previewHighlight;
        if (previewHighlightView != null) {
            StoriesController storiesController = MessagesController.getInstance(previewHighlightView.currentAccount).getStoriesController();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.allStoriesMap.get(UserConfig.getInstance(storiesController.currentAccount).clientUserId);
            previewHighlightView.storiesCount = storiesController.uploadingStoriesByDialogId.size() + (peerStories != null ? peerStories.stories.size() : 0) + 1;
            previewHighlightView.top.invalidate();
        }
        AnonymousClass24 anonymousClass24 = this.paintView;
        if (anonymousClass24 != null && (canvasInternal = anonymousClass24.renderView.internal) != null) {
            canvasInternal.postRunnable(canvasInternal.drawRunnable);
        }
        AnonymousClass7 anonymousClass7 = this.previewView;
        if (anonymousClass7 != null) {
            anonymousClass7.updatePauseReason(0, false);
        }
        DraftsController draftsController = MessagesController.getInstance(this.currentAccount).getStoriesController().draftsController;
        if (draftsController.loaded || draftsController.loading) {
            return;
        }
        draftsController.loading = true;
        DraftsController$$ExternalSyntheticLambda1 draftsController$$ExternalSyntheticLambda1 = new DraftsController$$ExternalSyntheticLambda1(draftsController, 1);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(draftsController.currentAccount);
        messagesStorage.getStorageQueue().postRunnable(new EglRenderer$$ExternalSyntheticLambda8(messagesStorage, z, draftsController$$ExternalSyntheticLambda1, 7));
    }

    public final void onSwitchEditModeEnd(int i, int i2) {
        AnonymousClass24 anonymousClass24;
        AnonymousClass36 anonymousClass36;
        AnonymousClass37 anonymousClass37;
        AnonymousClass24 anonymousClass25;
        if (i2 == 0) {
            this.backButton.setVisibility(8);
        }
        if (i == 0 && (anonymousClass25 = this.paintView) != null) {
            anonymousClass25.setVisibility(8);
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
        boolean z = true;
        this.previewView.setAllowCropping(i2 == -1);
        if ((i2 == 0 || i == 0) && (anonymousClass24 = this.paintView) != null) {
            anonymousClass24.weightChooserView.setLayerType(0, null);
        }
        PhotoFilterView.EnhanceView enhanceView = this.photoFilterEnhanceView;
        if (enhanceView != null) {
            if (i2 != 1 && i2 != -1) {
                z = false;
            }
            enhanceView.setAllowTouch(z);
        }
        if (i2 == 3) {
            AnonymousClass36 anonymousClass38 = this.cropEditor;
            if (anonymousClass38 != null) {
                anonymousClass38.setAppearProgress(1.0f);
            }
        } else if (i == 3 && (anonymousClass36 = this.cropEditor) != null) {
            anonymousClass36.setVisibility(8);
            this.cropEditor.setAppearProgress(0.0f);
            AnonymousClass36 anonymousClass39 = this.cropEditor;
            anonymousClass39.entry = null;
            CropEditor.AnonymousClass1 anonymousClass1 = anonymousClass39.cropView;
            anonymousClass1.state = null;
            anonymousClass1.videoEditTextureView = null;
            anonymousClass1.isVisible = false;
            anonymousClass39.contentView.setVisibility(8);
            anonymousClass39.previewView.setCropEditorDrawing(null);
        }
        if (i2 == 4) {
            AnonymousClass37 anonymousClass310 = this.cropInlineEditor;
            if (anonymousClass310 != null) {
                anonymousClass310.setAppearProgress(1.0f);
                return;
            }
            return;
        }
        if (i != 4 || (anonymousClass37 = this.cropInlineEditor) == null) {
            return;
        }
        anonymousClass37.setVisibility(8);
        this.cropInlineEditor.setAppearProgress(0.0f);
        AnonymousClass37 anonymousClass311 = this.cropInlineEditor;
        anonymousClass311.photoView = null;
        CropInlineEditor.AnonymousClass1 anonymousClass2 = anonymousClass311.cropView;
        anonymousClass2.state = null;
        anonymousClass2.videoEditTextureView = null;
        anonymousClass2.isVisible = false;
        anonymousClass311.contentView.setVisibility(8);
        anonymousClass311.setVisibility(8);
    }

    public final void open(SourceView.AnonymousClass5 anonymousClass5) {
        StoriesController.StoryLimit storyLimitCheckStoryLimit;
        WindowView windowView;
        if (this.isShown) {
            return;
        }
        int i = this.currentAccount;
        if (MessagesController.getInstance(i).isFrozen()) {
            AccountFrozenAlert.show(i);
            return;
        }
        int i2 = 0;
        this.isReposting = false;
        this.prepareClosing = false;
        this.forceBackgroundVisible = false;
        this.videoTextureHolder.active = false;
        WindowManager windowManager = this.windowManager;
        if (windowManager != null && (windowView = this.windowView) != null && windowView.getParent() == null) {
            WindowView windowView2 = this.windowView;
            WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, windowView2, layoutParams);
            windowManager.addView(this.windowView, layoutParams);
            setupBackDispatcher();
        }
        this.collageLayoutView.setCameraThumb(getCameraThumb());
        if (this.botId == 0 && (storyLimitCheckStoryLimit = MessagesController.getInstance(i).getStoriesController().checkStoryLimit()) != null && storyLimitCheckStoryLimit.active(i, 1)) {
            showLimitReachedSheet(storyLimitCheckStoryLimit, true);
        }
        navigateTo(0, false);
        switchToEditMode(-1, false, false);
        RectF rectF = this.fromRect;
        if (anonymousClass5 != null) {
            this.fromSourceView = anonymousClass5;
            this.openType = anonymousClass5.type;
            rectF.set(anonymousClass5.screenRect);
            this.fromRounding = anonymousClass5.rounding;
            this.fromSourceView.hide();
        } else {
            this.openType = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.fromRounding = AndroidUtilities.dp(8.0f);
        }
        this.containerView.updateBackground();
        ThemePreviewActivity.AnonymousClass14 anonymousClass14 = this.previewContainer;
        int i3 = this.openType;
        if (i3 != 1 && i3 != 0) {
            i2 = -14737633;
        }
        anonymousClass14.setBackgroundColor(i2);
        this.containerView.setTranslationX(0.0f);
        this.containerView.setTranslationY(0.0f);
        this.containerView.setTranslationY2(0.0f);
        this.containerView.setScaleX(1.0f);
        this.containerView.setScaleY(1.0f);
        this.dismissProgress = 0.0f;
        AndroidUtilities.lockOrientation(this.activity, 1);
        animateOpenTo(1.0f, true, new StoryRecorder$$ExternalSyntheticLambda7(this, 10));
        addNotificationObservers();
        this.botId = 0L;
        this.botLang = "";
    }

    public final void openEdit(SourceView.AnonymousClass1 anonymousClass1, StoryEntry storyEntry, long j) {
        WindowView windowView;
        if (this.isShown) {
            return;
        }
        int i = this.currentAccount;
        if (MessagesController.getInstance(i).isFrozen()) {
            AccountFrozenAlert.show(i);
            return;
        }
        this.isReposting = false;
        this.prepareClosing = false;
        this.forceBackgroundVisible = false;
        WindowManager windowManager = this.windowManager;
        if (windowManager != null && (windowView = this.windowView) != null && windowView.getParent() == null) {
            WindowView windowView2 = this.windowView;
            WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, windowView2, layoutParams);
            windowManager.addView(this.windowView, layoutParams);
            setupBackDispatcher();
        }
        this.outputEntry = storyEntry;
        this.mode = storyEntry.isVideo ? 1 : 0;
        this.videoTextureHolder.active = false;
        RectF rectF = this.fromRect;
        if (anonymousClass1 != null) {
            this.fromSourceView = anonymousClass1;
            this.openType = anonymousClass1.type;
            rectF.set(anonymousClass1.screenRect);
            this.fromRounding = anonymousClass1.rounding;
            this.fromSourceView.hide();
        } else {
            this.openType = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.fromRounding = AndroidUtilities.dp(8.0f);
        }
        this.containerView.updateBackground();
        ThemePreviewActivity.AnonymousClass14 anonymousClass14 = this.previewContainer;
        int i2 = this.openType;
        anonymousClass14.setBackgroundColor((i2 == 1 || i2 == 0) ? 0 : -14737633);
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
        navigateToPreviewWithPlayerAwait(j, new StoryRecorder$$ExternalSyntheticLambda7(this, 3));
        navigateTo(this.outputEntry.isEditingCover ? 2 : 1, false);
        switchToEditMode(-1, false, false);
        this.previewButtons.appear(false, false);
        addNotificationObservers();
        this.botId = 0L;
        this.botLang = "";
    }

    public final void openPremium$1() {
        ItemOptions itemOptions;
        AnonymousClass7 anonymousClass7 = this.previewView;
        if (anonymousClass7 != null) {
            anonymousClass7.updatePauseReason(4, true);
        }
        AnonymousClass8 anonymousClass8 = this.captionEdit;
        if (anonymousClass8 != null && (itemOptions = anonymousClass8.periodPopup) != null) {
            itemOptions.dismiss();
            anonymousClass8.periodPopup = null;
        }
        AnonymousClass26 anonymousClass26 = new AnonymousClass26(this, 1);
        PremiumFeatureBottomSheet premiumFeatureBottomSheet = new PremiumFeatureBottomSheet(anonymousClass26, this.activity, anonymousClass26.getCurrentAccount(), false, 14, false, null);
        premiumFeatureBottomSheet.setOnDismissListener(new StoryRecorder$$ExternalSyntheticLambda62(this, 1));
        premiumFeatureBottomSheet.show();
    }

    public final void openRepost(SourceView.AnonymousClass1 anonymousClass1, StoryEntry storyEntry) {
        StoriesController.StoryLimit storyLimitCheckStoryLimit;
        WindowView windowView;
        if (this.isShown) {
            return;
        }
        int i = this.currentAccount;
        if (MessagesController.getInstance(i).isFrozen()) {
            AccountFrozenAlert.show(i);
            return;
        }
        this.isReposting = true;
        this.prepareClosing = false;
        this.forceBackgroundVisible = false;
        WindowManager windowManager = this.windowManager;
        if (windowManager != null && (windowView = this.windowView) != null && windowView.getParent() == null) {
            WindowView windowView2 = this.windowView;
            WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, windowView2, layoutParams);
            windowManager.addView(this.windowView, layoutParams);
            setupBackDispatcher();
        }
        this.outputEntry = storyEntry;
        StoryPrivacySelector.applySaved(i, storyEntry);
        StoryEntry storyEntry2 = this.outputEntry;
        int i2 = (storyEntry2 == null || !storyEntry2.isVideo) ? 0 : 1;
        this.mode = i2;
        this.videoTextureHolder.active = storyEntry2 != null && storyEntry2.isRepostMessage && i2 == 1;
        if (this.botId == 0 && (storyLimitCheckStoryLimit = MessagesController.getInstance(i).getStoriesController().checkStoryLimit()) != null && storyLimitCheckStoryLimit.active(i, 1)) {
            showLimitReachedSheet(storyLimitCheckStoryLimit, true);
        }
        RectF rectF = this.fromRect;
        if (anonymousClass1 != null) {
            this.fromSourceView = anonymousClass1;
            this.openType = anonymousClass1.type;
            rectF.set(anonymousClass1.screenRect);
            this.fromRounding = anonymousClass1.rounding;
            this.fromSourceView.hide();
        } else {
            this.openType = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.fromRounding = AndroidUtilities.dp(8.0f);
        }
        this.containerView.updateBackground();
        ThemePreviewActivity.AnonymousClass14 anonymousClass14 = this.previewContainer;
        int i3 = this.openType;
        anonymousClass14.setBackgroundColor((i3 == 1 || i3 == 0) ? 0 : -14737633);
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
        switchToEditMode(-1, false, false);
        animateOpenTo(1.0f, true, new StoryRecorder$$ExternalSyntheticLambda7(this, 10));
        addNotificationObservers();
        this.botId = 0L;
        this.botLang = "";
    }

    public final void orderPreviewViews() {
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
        CaptionStory.AnonymousClass1 anonymousClass1 = this.currentRoundRecorder;
        if (anonymousClass1 != null) {
            anonymousClass1.bringToFront();
        }
    }

    public final void prepareThumb(boolean z, StoryEntry storyEntry) {
        boolean z2;
        StoryEntry storyEntry2;
        if (storyEntry == null || this.previewView.getWidth() <= 0 || this.previewView.getHeight() <= 0) {
            return;
        }
        File file = z ? storyEntry.draftThumbFile : storyEntry.uploadThumbFile;
        if (file != null) {
            file.delete();
        }
        View view = this.collageLayoutView.hasLayout() ? this.collageLayoutView : this.previewView;
        float f = z ? 0.33333334f : 1.0f;
        int width = (int) (view.getWidth() * f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, (int) (view.getHeight() * f), Bitmap.Config.RGB_565);
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
        AnonymousClass24 anonymousClass24 = this.paintView;
        if (anonymousClass24 != null && anonymousClass24.entitiesView != null) {
            canvas.save();
            canvas.scale(f, f);
            AnonymousClass24 anonymousClass25 = this.paintView;
            anonymousClass25.drawForThemeToggle = true;
            PaintView.AnonymousClass7 anonymousClass7 = anonymousClass25.entitiesView;
            anonymousClass7.drawForThumb = true;
            anonymousClass7.draw(canvas);
            AnonymousClass24 anonymousClass26 = this.paintView;
            anonymousClass26.entitiesView.drawForThumb = false;
            anonymousClass26.drawForThemeToggle = false;
            canvas.restore();
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, 40, 22, true);
        File fileMakeCacheFile = StoryEntry.makeCacheFile(this.currentAccount, "jpg");
        if (z) {
            z2 = z;
            storyEntry2 = storyEntry;
            Utilities.searchQueue.postRunnable(new ChatActivity$$ExternalSyntheticLambda488(this, bitmapCreateBitmap, z2, fileMakeCacheFile, storyEntry2, 21));
        } else {
            z2 = z;
            storyEntry2 = storyEntry;
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
    }

    public final void processDone$11() {
        StoriesController.StoryLimit storyLimitCheckStoryLimit;
        ?? r15;
        char c;
        int i;
        AnonymousClass7 anonymousClass7 = this.previewView;
        AnonymousClass8 anonymousClass8 = this.captionEdit;
        StoryPrivacyBottomSheet storyPrivacyBottomSheet = this.privacySheet;
        BitmapDrawable bitmapDrawable = null;
        if (storyPrivacyBottomSheet != null) {
            storyPrivacyBottomSheet.lambda$showGiftOfferSheet$15();
            this.privacySheet = null;
        }
        if (this.videoError) {
            DownloadButton downloadButton = this.downloadButton;
            downloadButton.getClass();
            downloadButton.showToast(R.raw.error, LocaleController.getString("VideoConvertFail"));
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            PreviewButtons.ShareButtonView shareButtonView = this.previewButtons.shareButton;
            int i2 = -this.shiftDp;
            this.shiftDp = i2;
            AndroidUtilities.shakeViewSpring(shareButtonView, i2);
            return;
        }
        if (anonymousClass8 != null && anonymousClass8.getCodePointCount() > anonymousClass8.getCaptionLimit()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            AnimatedTextView animatedTextView = anonymousClass8.limitTextView;
            int i3 = -this.shiftDp;
            this.shiftDp = i3;
            AndroidUtilities.shakeViewSpring(animatedTextView, i3);
            anonymousClass8.captionLimitToast();
            return;
        }
        StoryEntry storyEntry = this.outputEntry;
        int i4 = this.currentAccount;
        if ((storyEntry == null || (!storyEntry.isEdit && storyEntry.botId == 0)) && (storyLimitCheckStoryLimit = MessagesController.getInstance(i4).storiesController.checkStoryLimit()) != null && storyLimitCheckStoryLimit.active(i4, getCount$1())) {
            showLimitReachedSheet(storyLimitCheckStoryLimit, false);
            return;
        }
        this.outputEntry.captionEntitiesAllowed = MessagesController.getInstance(i4).storyEntitiesAllowed();
        DarkThemeResourceProvider darkThemeResourceProvider = this.resourcesProvider;
        if (anonymousClass8 != null && !this.outputEntry.captionEntitiesAllowed) {
            CharSequence text = anonymousClass8.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((TextStyleSpan[]) spannable.getSpans(0, text.length(), TextStyleSpan.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new BulletinFactory(this.windowView, darkThemeResourceProvider).createSimpleBulletinWithIconSize(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), Theme.key_chat_messageLinkIn, 0, new StoryRecorder$$ExternalSyntheticLambda7(this, 25), darkThemeResourceProvider)).show(true);
                    int i5 = -this.shiftDp;
                    this.shiftDp = i5;
                    AndroidUtilities.shakeViewSpring(anonymousClass8, i5);
                    return;
                }
            }
        }
        StoryEntry storyEntry2 = this.outputEntry;
        if (storyEntry2.isEdit || storyEntry2.botId != 0) {
            storyEntry2.editedPrivacy = false;
            applyFilter(null);
            upload$1();
            return;
        }
        if (this.selectedDialogId != 0) {
            storyEntry2.peer = MessagesController.getInstance(i4).getInputPeer(this.selectedDialogId);
        }
        anonymousClass7.updatePauseReason(3, true);
        StoryPrivacyBottomSheet storyPrivacyBottomSheet2 = new StoryPrivacyBottomSheet(this.activity, this.outputEntry.period, darkThemeResourceProvider);
        storyPrivacyBottomSheet2.setValue(this.outputEntry.privacy);
        storyPrivacyBottomSheet2.setPeer(this.outputEntry.peer);
        storyPrivacyBottomSheet2.canChangePeer = this.canChangePeer;
        storyPrivacyBottomSheet2.onDismiss = new StoryRecorder$$ExternalSyntheticLambda19(this, 14);
        storyPrivacyBottomSheet2.allowCover(!this.collageLayoutView.hasLayout());
        ArrayList arrayList = this.selectedEntries;
        storyPrivacyBottomSheet2.setCount(arrayList == null ? this.outputEntry.getTotalCount() : arrayList.size());
        storyPrivacyBottomSheet2.isEdit(false);
        CharSequence text2 = anonymousClass8.getText();
        ArrayList arrayList2 = new ArrayList();
        if (text2 instanceof Spanned) {
            for (URLSpanUserMention uRLSpanUserMention : (URLSpanUserMention[]) ((Spanned) text2).getSpans(0, text2.length(), URLSpanUserMention.class)) {
                if (uRLSpanUserMention != null) {
                    try {
                        TLRPC.User user = MessagesController.getInstance(i4).getUser(Long.valueOf(Long.parseLong(uRLSpanUserMention.getURL())));
                        if (user != null && !UserObject.isUserSelf(user) && UserObject.getPublicUsername(user) != null && !arrayList2.contains(user)) {
                            arrayList2.add(UserObject.getPublicUsername(user));
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (text2 != null) {
            int i6 = -1;
            for (int i7 = 0; i7 < text2.length(); i7++) {
                char cCharAt = text2.charAt(i7);
                if (cCharAt == '@') {
                    i6 = i7 + 1;
                } else {
                    if (cCharAt == ' ') {
                        if (i6 != -1) {
                            String string = text2.subSequence(i6, i7).toString();
                            TLObject userOrChat = MessagesController.getInstance(i4).getUserOrChat(string);
                            if (userOrChat instanceof TLRPC.User) {
                                TLRPC.User user2 = (TLRPC.User) userOrChat;
                                if (!user2.bot && !UserObject.isUserSelf(user2)) {
                                    if (user2.id != 777000 && !UserObject.isReplyUser(user2) && !arrayList2.contains(string)) {
                                        arrayList2.add(string);
                                    }
                                }
                            }
                        }
                        i6 = -1;
                    }
                }
            }
            r15 = 0;
            r15 = 0;
            r15 = 0;
            r15 = 0;
            r15 = 0;
            r15 = 0;
            r15 = 0;
            r15 = 0;
            c = 1;
            if (i6 != -1) {
                String string2 = text2.subSequence(i6, text2.length()).toString();
                TLObject userOrChat2 = MessagesController.getInstance(i4).getUserOrChat(string2);
                if (userOrChat2 instanceof TLRPC.User) {
                    TLRPC.User user3 = (TLRPC.User) userOrChat2;
                    if (!user3.bot && !UserObject.isUserSelf(user3) && user3.id != 777000 && !UserObject.isReplyUser(user3) && !arrayList2.contains(string2)) {
                        arrayList2.add(string2);
                    }
                }
            }
        } else {
            r15 = 0;
            c = 1;
        }
        storyPrivacyBottomSheet2.warnUsers = arrayList2;
        storyPrivacyBottomSheet2.onSelectedPeer = new StoryRecorder$$ExternalSyntheticLambda19(this, 15);
        storyPrivacyBottomSheet2.onSelectedAlbums = new StoryRecorder$$ExternalSyntheticLambda19(this, 16);
        storyPrivacyBottomSheet2.onDone = new StoryRecorder$$ExternalSyntheticLambda12(this, 6);
        this.privacySheet = storyPrivacyBottomSheet2;
        StoryEntry storyEntry3 = this.outputEntry;
        if (storyEntry3.isVideo) {
            if (anonymousClass7 != null && !storyEntry3.coverSet && this.currentPage != 2) {
                storyEntry3.cover = anonymousClass7.getCurrentPosition();
                StoryRecorder$$ExternalSyntheticLambda19 storyRecorder$$ExternalSyntheticLambda19 = new StoryRecorder$$ExternalSyntheticLambda19(this, 17);
                RenderView renderView = this.paintViewRenderView;
                View view = this.paintViewEntitiesView;
                View[] viewArr = new View[3];
                viewArr[r15] = anonymousClass7;
                viewArr[c] = renderView;
                viewArr[2] = view;
                anonymousClass7.getCoverBitmap(storyRecorder$$ExternalSyntheticLambda19, viewArr);
            }
            StoryPrivacyBottomSheet storyPrivacyBottomSheet3 = this.privacySheet;
            Bitmap bitmap = this.outputEntry.coverBitmap;
            StoryRecorder$$ExternalSyntheticLambda7 storyRecorder$$ExternalSyntheticLambda7 = new StoryRecorder$$ExternalSyntheticLambda7(this, 19);
            if (bitmap != null) {
                storyPrivacyBottomSheet3.getClass();
                bitmapDrawable = new BitmapDrawable(bitmap);
            }
            storyPrivacyBottomSheet3.coverDrawable = bitmapDrawable;
            storyPrivacyBottomSheet3.whenCoverClicked = storyRecorder$$ExternalSyntheticLambda7;
            PollItemMenu.AnonymousClass3 anonymousClass3 = storyPrivacyBottomSheet3.viewPager;
            if (anonymousClass3 != null) {
                View[] viewPages = anonymousClass3.getViewPages();
                int i8 = 0;
                while (i8 < viewPages.length) {
                    View view2 = viewPages[i8];
                    if (view2 instanceof StoryPrivacyBottomSheet.Page) {
                        StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) view2;
                        i = 1;
                        page.updateItems(r15, true);
                        page.updateButton(r15);
                    } else {
                        i = 1;
                    }
                    i8 += i;
                }
            }
        }
        this.privacySheet.setOnDismissListener(new StoryRecorder$$ExternalSyntheticLambda62(this, r15));
        this.privacySheet.show();
    }

    public final void replaceSourceView(SourceView sourceView) {
        RectF rectF = this.fromRect;
        int i = 0;
        if (sourceView != null) {
            this.fromSourceView = sourceView;
            this.openType = sourceView.type;
            rectF.set(sourceView.screenRect);
            this.fromRounding = sourceView.rounding;
        } else {
            this.fromSourceView = null;
            this.openType = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.fromRounding = AndroidUtilities.dp(8.0f);
        }
        ThemePreviewActivity.AnonymousClass14 anonymousClass14 = this.previewContainer;
        int i2 = this.openType;
        if (i2 != 1 && i2 != 0) {
            i = -14737633;
        }
        anonymousClass14.setBackgroundColor(i);
    }

    public final void requestCameraPermission(boolean z) {
        Activity activity;
        if (!this.requestedCameraPermission || z) {
            this.noCameraPermission = false;
            if (Build.VERSION.SDK_INT >= 23 && (activity = this.activity) != null) {
                boolean z2 = activity.checkSelfPermission("android.permission.CAMERA") != 0;
                this.noCameraPermission = z2;
                if (z2) {
                    Drawable drawableMutate = activity.getResources().getDrawable(R.drawable.story_camera).mutate();
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(-14540254), drawableMutate);
                    int iDp = AndroidUtilities.dp(64.0f);
                    int iDp2 = AndroidUtilities.dp(64.0f);
                    combinedDrawable.iconWidth = iDp;
                    combinedDrawable.iconHeight = iDp2;
                    this.collageLayoutView.setCameraThumb(combinedDrawable);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, this.resourcesProvider);
                        builder.setTopAnimation(R.raw.permission_request_camera, 72, Theme.getColor(null, Theme.key_dialogTopBackground, false), null);
                        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint));
                        AlertDialog alertDialog = builder.alertDialog;
                        alertDialog.message = spannableStringBuilderReplaceTags;
                        builder.setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new StoryRecorder$$ExternalSyntheticLambda12(this, 12));
                        builder.setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        alertDialog.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.requestedCameraPermission = true;
                }
            }
            if (this.noCameraPermission) {
                return;
            }
            if (CameraController.getInstance().isCameraInitied()) {
                createCameraView();
            } else {
                CameraController.getInstance().initCamera(new StoryRecorder$$ExternalSyntheticLambda7(this, 6));
            }
        }
    }

    public final void saveLastCameraBitmap(Runnable runnable) {
        AnonymousClass25 anonymousClass25 = this.cameraView;
        if (anonymousClass25 == null || anonymousClass25.getTextureView() == null) {
            return;
        }
        try {
            Utilities.themeQueue.postRunnable(new TodoItemMenu$$ExternalSyntheticLambda8(this, this.cameraView.getTextureView().getBitmap(), runnable, 17));
        } catch (Throwable unused) {
        }
    }

    public final void setActionBarButtonVisible(View view, boolean z, boolean z2) {
        if (view == null) {
            return;
        }
        if (z2) {
            view.setVisibility(0);
            view.animate().alpha(z ? 1.0f : 0.0f).setUpdateListener(new AnonymousClass22(this, 1)).setListener(new ChatActivity.AnonymousClass63(this, z, view, 12)).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
        } else {
            view.animate().cancel();
            view.setVisibility(z ? 0 : 8);
            view.setAlpha(z ? 1.0f : 0.0f);
            updateActionBarButtonsOffsets();
        }
    }

    public final void setAwakeLock(boolean z) {
        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
        if (z) {
            layoutParams.flags |= 128;
        } else {
            layoutParams.flags &= -129;
        }
        try {
            this.windowManager.updateViewLayout(this.windowView, layoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void setCameraFlashModeIcon(String str) {
        byte b;
        int i;
        this.flashButton.clearAnimation();
        AnonymousClass25 anonymousClass25 = this.cameraView;
        if ((anonymousClass25 != null && anonymousClass25.isDual()) || this.animatedRecording) {
            str = null;
        }
        this.flashButtonMode = str;
        boolean z = false;
        if (str == null) {
            setActionBarButtonVisible(this.flashButton, false, true);
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
        } else if (b != 1) {
            i = R.drawable.media_photo_flash_off2;
            this.flashButton.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
        } else {
            i = R.drawable.media_photo_flash_auto2;
            this.flashButton.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashAuto));
        }
        this.flashButton.setIcon(i);
        ToggleButton2 toggleButton2 = this.flashButton;
        if (this.currentPage == 0 && !this.collageListView.visible && this.flashButtonMode != null && !inCheck()) {
            z = true;
        }
        setActionBarButtonVisible(toggleButton2, z, true);
    }

    public final void setIconMuted(boolean z, boolean z2) {
        if (this.muteButtonDrawable == null) {
            RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.media_mute_unmute, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.muteButtonDrawable = rLottieDrawable;
            rLottieDrawable.speedMultiply *= 1.5f;
        }
        this.muteButton.setAnimation(this.muteButtonDrawable);
        if (!z2) {
            this.muteButtonDrawable.setCurrentFrame(z ? 20 : 0, false, false);
            return;
        }
        if (z) {
            RLottieDrawable rLottieDrawable2 = this.muteButtonDrawable;
            if (rLottieDrawable2.currentFrame > 20) {
                rLottieDrawable2.setCurrentFrame(0, false, false);
            }
            this.muteButtonDrawable.setCustomEndFrame(20);
            this.muteButtonDrawable.start();
            return;
        }
        RLottieDrawable rLottieDrawable3 = this.muteButtonDrawable;
        int i = rLottieDrawable3.currentFrame;
        if (i == 0 || i >= 43) {
            return;
        }
        rLottieDrawable3.setCustomEndFrame(43);
        this.muteButtonDrawable.start();
    }

    public final void setupBackDispatcher() {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = this.windowView.findOnBackInvokedDispatcher()) != null) {
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new PhotoViewer$$ExternalSyntheticLambda69(this, 5));
        }
    }

    public final void showLimitReachedSheet(StoriesController.StoryLimit storyLimit, boolean z) {
        if (this.shownLimitReached) {
            return;
        }
        AnonymousClass27 anonymousClass27 = new AnonymousClass27(storyLimit.getLimitReachedType(), this.currentAccount, this.activity, new AnonymousClass26(this, 0), null);
        anonymousClass27.storiesCount = getCount$1();
        anonymousClass27.setOnDismissListener(new JoinGroupAlert$$ExternalSyntheticLambda12(2, this, z));
        this.previewView.updatePauseReason(7, true);
        this.shownLimitReached = true;
        anonymousClass27.show();
    }

    public final void showVideoTimer(boolean z, boolean z2) {
        if (this.videoTimerShown == z) {
            return;
        }
        this.videoTimerShown = z;
        if (z2) {
            this.videoTimerView.animate().alpha(z ? 1.0f : 0.0f).setDuration(350L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new StoryRecorder$$ExternalSyntheticLambda6(this, z, 1)).start();
            return;
        }
        this.videoTimerView.clearAnimation();
        this.videoTimerView.setAlpha(z ? 1.0f : 0.0f);
        if (z) {
            return;
        }
        this.videoTimerView.setRecording(false, false);
    }

    public final void showZoomControls$1(boolean z) {
        ZoomControlView zoomControlView = this.zoomControlView;
        if ((zoomControlView.getTag() != null && z) || (zoomControlView.getTag() == null && !z)) {
            if (z) {
                Runnable runnable = this.zoomControlHideRunnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                StoryRecorder$$ExternalSyntheticLambda7 storyRecorder$$ExternalSyntheticLambda7 = new StoryRecorder$$ExternalSyntheticLambda7(this, 26);
                this.zoomControlHideRunnable = storyRecorder$$ExternalSyntheticLambda7;
                AndroidUtilities.runOnUIThread(storyRecorder$$ExternalSyntheticLambda7, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.zoomControlAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        zoomControlView.setTag(z ? 1 : null);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.zoomControlAnimation = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z) {
            zoomControlView.setVisibility(0);
        }
        this.zoomControlAnimation.playTogether(ObjectAnimator.ofFloat(zoomControlView, (Property<ZoomControlView, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.zoomControlAnimation.addListener(new TodoItemMenu.AnonymousClass15(13, this, z));
        this.zoomControlAnimation.start();
        if (z) {
            StoryRecorder$$ExternalSyntheticLambda7 storyRecorder$$ExternalSyntheticLambda8 = new StoryRecorder$$ExternalSyntheticLambda7(this, 27);
            this.zoomControlHideRunnable = storyRecorder$$ExternalSyntheticLambda8;
            AndroidUtilities.runOnUIThread(storyRecorder$$ExternalSyntheticLambda8, 2000L);
        }
    }

    public final void startLive() {
        StoryPrivacyBottomSheet storyPrivacyBottomSheet = this.privacySheet;
        if (storyPrivacyBottomSheet != null) {
            storyPrivacyBottomSheet.lambda$showGiftOfferSheet$15();
            this.privacySheet = null;
        }
        StoryPrivacyBottomSheet storyPrivacyBottomSheet2 = new StoryPrivacyBottomSheet(this.activity, 86400, this.resourcesProvider);
        storyPrivacyBottomSheet2.isLive = true;
        View[] viewPages = storyPrivacyBottomSheet2.viewPager.getViewPages();
        View view = viewPages[0];
        if (view instanceof StoryPrivacyBottomSheet.Page) {
            StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) view;
            page.bind(page.pageType);
        }
        View view2 = viewPages[1];
        if (view2 instanceof StoryPrivacyBottomSheet.Page) {
            StoryPrivacyBottomSheet.Page page2 = (StoryPrivacyBottomSheet.Page) view2;
            page2.bind(page2.pageType);
        }
        storyPrivacyBottomSheet2.setValue(this.livePrivacy);
        TLRPC.InputPeer inputPeer = this.livePeer;
        if (inputPeer == null) {
            inputPeer = this.selectedDialogId != 0 ? MessagesController.getInstance(this.currentAccount).getInputPeer(this.selectedDialogId) : new TLRPC.TL_inputPeerSelf();
        }
        storyPrivacyBottomSheet2.setPeer(inputPeer);
        storyPrivacyBottomSheet2.canChangePeer = this.canChangePeer;
        storyPrivacyBottomSheet2.onDismiss = new StoryRecorder$$ExternalSyntheticLambda19(this, 18);
        storyPrivacyBottomSheet2.allowCover(false);
        storyPrivacyBottomSheet2.setCount(1);
        storyPrivacyBottomSheet2.isEdit(false);
        storyPrivacyBottomSheet2.onSelectedPeer = new StoryRecorder$$ExternalSyntheticLambda19(this, 19);
        storyPrivacyBottomSheet2.onDone = new StoryRecorder$$ExternalSyntheticLambda12(this, 11);
        this.privacySheet = storyPrivacyBottomSheet2;
        storyPrivacyBottomSheet2.show();
    }

    public final void switchToEditMode(int i, boolean z, boolean z2) {
        float f;
        float f2;
        int i2;
        StoryEntry storyEntry;
        float f3;
        ImageView imageView;
        int i3;
        ThemePreviewActivity.AnonymousClass14 anonymousClass14;
        int contentHeight;
        float f4;
        PhotoFilterCurvesControl photoFilterCurvesControl;
        PhotoFilterBlurControl photoFilterBlurControl;
        float f5;
        float f6;
        float fDp;
        int i4;
        float fDp2;
        Property property;
        float f7;
        float f8;
        float f9;
        float f10;
        ImageView imageView2;
        int i5;
        StoryEntry storyEntry2;
        boolean z3;
        float f11;
        float f12;
        StoryEntry storyEntry3;
        int i6;
        AnonymousClass24 anonymousClass24;
        AnonymousClass24 anonymousClass25;
        LinearLayout linearLayout = this.actionBarButtons;
        FrameLayout frameLayout = this.videoTimelineContainerView;
        AnonymousClass4 anonymousClass4 = this.captionContainer;
        SimpleTextView simpleTextView = this.titleTextView;
        TimelineView timelineView = this.timelineView;
        DownloadButton downloadButton = this.downloadButton;
        FlashViews.ImageViewInvertable imageViewInvertable = this.backButton;
        WindowView windowView = this.windowView;
        AnonymousClass7 anonymousClass7 = this.previewView;
        ChatActivity.AnonymousClass27 anonymousClass27 = this.playButton;
        RLottieImageView rLottieImageView = this.muteButton;
        AnonymousClass8 anonymousClass8 = this.captionEdit;
        ThemePreviewActivity.AnonymousClass14 anonymousClass15 = this.previewContainer;
        int i7 = this.currentEditMode;
        if (i7 != i || z) {
            if (i == -1 || anonymousClass8 == null || !anonymousClass8.recording) {
                this.currentEditMode = i;
                AnimatorSet animatorSet = this.editModeAnimator;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.editModeAnimator = null;
                }
                if (i7 != i) {
                    if (i == -1) {
                        imageViewInvertable.setVisibility(0);
                        anonymousClass8.setVisibility(0);
                        AnonymousClass24 anonymousClass26 = this.paintView;
                        if (anonymousClass26 != null) {
                            anonymousClass26.selectEntity$1(null, true);
                        }
                        i6 = 0;
                        downloadButton.setVisibility(0);
                        StoryEntry storyEntry4 = this.outputEntry;
                        if (storyEntry4 == null || !storyEntry4.isRepostMessage) {
                            ImageView imageView3 = this.themeButton;
                            if (imageView3 != null) {
                                imageView3.setVisibility(8);
                            }
                        } else {
                            getThemeButton().setVisibility(0);
                            updateThemeButtonDrawable(false);
                        }
                        simpleTextView.setVisibility(0);
                        if (this.mode == 1) {
                            rLottieImageView.setVisibility(0);
                            anonymousClass27.setVisibility(0);
                        } else {
                            StoryEntry storyEntry5 = this.outputEntry;
                            if (storyEntry5 != null && !TextUtils.isEmpty(storyEntry5.audioPath)) {
                                rLottieImageView.setVisibility(8);
                                anonymousClass27.setVisibility(0);
                            }
                        }
                        timelineView.setVisibility(0);
                    } else {
                        i6 = 0;
                    }
                    if (i == 0 && (anonymousClass25 = this.paintView) != null) {
                        anonymousClass25.setVisibility(i6);
                    }
                    if ((i == 0 || i7 == 0) && (anonymousClass24 = this.paintView) != null) {
                        anonymousClass24.weightChooserView.setLayerType(2, null);
                    }
                    AnonymousClass24 anonymousClass28 = this.paintView;
                    if (anonymousClass28 != null) {
                        anonymousClass28.keyboardNotifier.ignore(i != 0);
                    }
                    KeyboardNotifier keyboardNotifier = anonymousClass8.keyboardNotifier;
                    keyboardNotifier.ignoring = i != -1;
                    keyboardNotifier.update();
                    Bulletin bulletin = Bulletin.visibleBulletin;
                    if (bulletin != null) {
                        bulletin.hide();
                    }
                    if (this.photoFilterView != null && i7 == 1) {
                        applyFilter(null);
                    }
                    PhotoFilterView.EnhanceView enhanceView = this.photoFilterEnhanceView;
                    if (enhanceView != null) {
                        enhanceView.setAllowTouch(false);
                    }
                    this.muteHint.hide(true);
                    Activity activity = this.activity;
                    if (i == 3) {
                        if (this.cropEditor == null) {
                            AnonymousClass36 anonymousClass36 = new AnonymousClass36(activity, anonymousClass7);
                            this.cropEditor = anonymousClass36;
                            windowView.addView(anonymousClass36.contentView);
                            windowView.addView(this.cropEditor);
                        }
                        this.cropEditor.setVisibility(0);
                        StoryEntry storyEntry6 = this.outputEntry;
                        if (storyEntry6 != null) {
                            this.cropEditor.setEntry(storyEntry6);
                        }
                    } else if (i7 == 3) {
                        anonymousClass7.applyMatrix();
                        AnonymousClass36 anonymousClass37 = this.cropEditor;
                        if (anonymousClass37 != null) {
                            anonymousClass37.previewView.setCropEditorDrawing(anonymousClass37);
                            anonymousClass37.closing = true;
                        }
                    }
                    if (i == 4) {
                        if (this.cropInlineEditor == null) {
                            AnonymousClass37 anonymousClass38 = new AnonymousClass37(activity, anonymousClass7);
                            this.cropInlineEditor = anonymousClass38;
                            windowView.addView(anonymousClass38.contentView);
                            windowView.addView(this.cropInlineEditor);
                        }
                        this.cropInlineEditor.setVisibility(0);
                    } else if (i7 == 4) {
                        anonymousClass7.applyMatrix();
                        AnonymousClass37 anonymousClass39 = this.cropInlineEditor;
                        if (anonymousClass39 != null) {
                            anonymousClass39.closing = true;
                        }
                    }
                } else {
                    anonymousClass4 = anonymousClass4;
                    anonymousClass15 = anonymousClass15;
                }
                this.previewButtons.appear((i == -1 || i == 2) && this.openProgress > 0.0f, z2);
                ArrayList arrayList = new ArrayList();
                PhotoFilterView photoFilterView = this.photoFilterView;
                boolean z4 = photoFilterView == null && i == 1;
                float f13 = 1.0f;
                if (i == 1) {
                    createFilterPhotoView();
                    PhotoFilterView photoFilterView2 = this.photoFilterView;
                    this.previewTouchable = photoFilterView2;
                    FrameLayout toolsView = photoFilterView2 != null ? photoFilterView2.getToolsView() : null;
                    if (toolsView != null) {
                        toolsView.setAlpha(0.0f);
                        toolsView.setVisibility(0);
                        f = 0.0f;
                        arrayList.add(ObjectAnimator.ofFloat(toolsView, (Property<FrameLayout, Float>) View.TRANSLATION_Y, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(toolsView, (Property<FrameLayout, Float>) View.ALPHA, 1.0f));
                    } else {
                        f = 0.0f;
                    }
                } else {
                    f = 0.0f;
                    if (i7 == 1 && photoFilterView != null) {
                        this.previewTouchable = null;
                        arrayList.add(ObjectAnimator.ofFloat(photoFilterView.getToolsView(), (Property<FrameLayout, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(226.0f)));
                        arrayList.add(ObjectAnimator.ofFloat(this.photoFilterView.getToolsView(), (Property<FrameLayout, Float>) View.ALPHA, 0.0f));
                    }
                }
                if (i == 0) {
                    createPhotoPaintView();
                    this.previewTouchable = this.paintView;
                    Property property2 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(imageViewInvertable, (Property<FlashViews.ImageViewInvertable, Float>) property2, f));
                    arrayList.add(ObjectAnimator.ofFloat(this.paintView.getTopLayout(), (Property<View, Float>) property2, 0.0f, 1.0f));
                    View topLayout = this.paintView.getTopLayout();
                    Property property3 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout, (Property<View, Float>) property3, -AndroidUtilities.dp(16.0f), f));
                    arrayList.add(ObjectAnimator.ofFloat(this.paintView.getBottomLayout(), (Property<View, Float>) property2, 0.0f, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.paintView.getBottomLayout(), (Property<View, Float>) property3, AndroidUtilities.dp(48.0f), f));
                    arrayList.add(ObjectAnimator.ofFloat(this.paintView.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -AndroidUtilities.dp(32.0f), f));
                } else if (i7 == 0 && this.paintView != null) {
                    this.previewTouchable = null;
                    Property property4 = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(imageViewInvertable, (Property<FlashViews.ImageViewInvertable, Float>) property4, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(this.paintView.getTopLayout(), (Property<View, Float>) property4, f));
                    View topLayout2 = this.paintView.getTopLayout();
                    Property property5 = View.TRANSLATION_Y;
                    arrayList.add(ObjectAnimator.ofFloat(topLayout2, (Property<View, Float>) property5, -AndroidUtilities.dp(16.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.paintView.getBottomLayout(), (Property<View, Float>) property4, f));
                    arrayList.add(ObjectAnimator.ofFloat(this.paintView.getBottomLayout(), (Property<View, Float>) property5, AndroidUtilities.dp(48.0f)));
                    arrayList.add(ObjectAnimator.ofFloat(this.paintView.getWeightChooserView(), (Property<View, Float>) View.TRANSLATION_X, -AndroidUtilities.dp(32.0f)));
                }
                AnonymousClass36 anonymousClass310 = this.cropEditor;
                if (anonymousClass310 != null) {
                    CropRotationWheel cropRotationWheel = anonymousClass310.wheel;
                    if (i == 3) {
                        Property property6 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(cropRotationWheel, (Property<CropRotationWheel, Float>) property6, 0.0f, 1.0f));
                        CropRotationWheel cropRotationWheel2 = this.cropEditor.wheel;
                        Property property7 = View.TRANSLATION_Y;
                        f2 = 52.0f;
                        arrayList.add(ObjectAnimator.ofFloat(cropRotationWheel2, (Property<CropRotationWheel, Float>) property7, AndroidUtilities.dp(52.0f), f));
                        arrayList.add(ObjectAnimator.ofFloat(this.cropEditor.buttonsLayout, (Property<FrameLayout, Float>) property6, 0.0f, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.cropEditor.buttonsLayout, (Property<FrameLayout, Float>) property7, AndroidUtilities.dp(52.0f), f));
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.cropEditor.getAppearProgress(), 1.0f);
                        valueAnimatorOfFloat.addUpdateListener(new StoryRecorder$$ExternalSyntheticLambda68(this, 0));
                        arrayList.add(valueAnimatorOfFloat);
                    } else {
                        f2 = 52.0f;
                        if (i7 == 3) {
                            Property property8 = View.ALPHA;
                            arrayList.add(ObjectAnimator.ofFloat(cropRotationWheel, (Property<CropRotationWheel, Float>) property8, 1.0f, 0.0f));
                            CropRotationWheel cropRotationWheel3 = this.cropEditor.wheel;
                            Property property9 = View.TRANSLATION_Y;
                            arrayList.add(ObjectAnimator.ofFloat(cropRotationWheel3, (Property<CropRotationWheel, Float>) property9, f, AndroidUtilities.dp(52.0f)));
                            arrayList.add(ObjectAnimator.ofFloat(this.cropEditor.buttonsLayout, (Property<FrameLayout, Float>) property8, 1.0f, 0.0f));
                            arrayList.add(ObjectAnimator.ofFloat(this.cropEditor.buttonsLayout, (Property<FrameLayout, Float>) property9, f, AndroidUtilities.dp(52.0f)));
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.cropEditor.getAppearProgress(), f);
                            valueAnimatorOfFloat2.addUpdateListener(new StoryRecorder$$ExternalSyntheticLambda68(this, 1));
                            arrayList.add(valueAnimatorOfFloat2);
                        }
                    }
                } else {
                    f2 = 52.0f;
                }
                AnonymousClass37 anonymousClass311 = this.cropInlineEditor;
                if (anonymousClass311 != null) {
                    CropRotationWheel cropRotationWheel4 = anonymousClass311.wheel;
                    if (i == 4) {
                        Property property10 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(cropRotationWheel4, (Property<CropRotationWheel, Float>) property10, 0.0f, 1.0f));
                        CropRotationWheel cropRotationWheel5 = this.cropInlineEditor.wheel;
                        Property property11 = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(cropRotationWheel5, (Property<CropRotationWheel, Float>) property11, AndroidUtilities.dp(f2), f));
                        arrayList.add(ObjectAnimator.ofFloat(this.cropInlineEditor.buttonsLayout, (Property<FrameLayout, Float>) property10, 0.0f, 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.cropInlineEditor.buttonsLayout, (Property<FrameLayout, Float>) property11, AndroidUtilities.dp(f2), f));
                        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(this.cropInlineEditor.getAppearProgress(), 1.0f);
                        valueAnimatorOfFloat3.addUpdateListener(new StoryRecorder$$ExternalSyntheticLambda68(this, 2));
                        arrayList.add(valueAnimatorOfFloat3);
                    } else if (i7 == 4) {
                        Property property12 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(cropRotationWheel4, (Property<CropRotationWheel, Float>) property12, 1.0f, 0.0f));
                        CropRotationWheel cropRotationWheel6 = this.cropInlineEditor.wheel;
                        Property property13 = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(cropRotationWheel6, (Property<CropRotationWheel, Float>) property13, f, AndroidUtilities.dp(f2)));
                        arrayList.add(ObjectAnimator.ofFloat(this.cropInlineEditor.buttonsLayout, (Property<FrameLayout, Float>) property12, 1.0f, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(this.cropInlineEditor.buttonsLayout, (Property<FrameLayout, Float>) property13, f, AndroidUtilities.dp(f2)));
                        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(this.cropInlineEditor.getAppearProgress(), f);
                        valueAnimatorOfFloat4.addUpdateListener(new StoryRecorder$$ExternalSyntheticLambda68(this, 3));
                        arrayList.add(valueAnimatorOfFloat4);
                    }
                }
                Property property14 = View.ALPHA;
                if (i == -1 || i == 2) {
                    i2 = 1;
                    float f14 = this.mode == 1 ? 1.0f : 0.0f;
                    float[] fArr = new float[i2];
                    fArr[0] = f14;
                    arrayList.add(ObjectAnimator.ofFloat(rLottieImageView, (Property<RLottieImageView, Float>) property14, fArr));
                    arrayList.add(ObjectAnimator.ofFloat(anonymousClass27, (Property<ChatActivity.AnonymousClass27, Float>) property14, ((i != -1 || i == 2) && (this.mode == i2 || !((storyEntry = this.outputEntry) == null || TextUtils.isEmpty(storyEntry.audioPath)))) ? 1.0f : 0.0f));
                    if (i != -1 || i == 2) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(downloadButton, (Property<DownloadButton, Float>) property14, f3));
                    imageView = this.themeButton;
                    if (imageView != null) {
                        i3 = 1;
                        arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property14, ((i != -1 || i == 2) && (storyEntry3 = this.outputEntry) != null && storyEntry3.isRepostMessage) ? 1.0f : 0.0f));
                    } else {
                        i3 = 1;
                    }
                    int i8 = this.currentPage;
                    float[] fArr2 = new float[i3];
                    fArr2[0] = ((i8 != i3 || i8 == 2) && i == -1) ? 1.0f : 0.0f;
                    arrayList.add(ObjectAnimator.ofFloat(simpleTextView, (Property<SimpleTextView, Float>) property14, fArr2));
                    if (i == i3) {
                        anonymousClass14 = anonymousClass15;
                        anonymousClass14.setPivotY(anonymousClass15.getMeasuredHeight() * 0.2f);
                        contentHeight = AndroidUtilities.dp(164.0f);
                    } else {
                        anonymousClass14 = anonymousClass15;
                        if (i == 0) {
                            anonymousClass14.setPivotY(anonymousClass14.getMeasuredHeight() * 0.6f);
                            contentHeight = AndroidUtilities.dp(40.0f);
                        } else if (i == 2) {
                            anonymousClass14.setPivotY(0.0f);
                            contentHeight = timelineView.getContentHeight() + AndroidUtilities.dp(8.0f);
                        } else {
                            contentHeight = 0;
                        }
                    }
                    if (contentHeight > 0) {
                        int height = anonymousClass14.getHeight() - ((int) anonymousClass14.getPivotY());
                        f4 = (height - contentHeight) / height;
                    } else {
                        f4 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(anonymousClass14, (Property<ThemePreviewActivity.AnonymousClass14, Float>) View.SCALE_X, f4));
                    arrayList.add(ObjectAnimator.ofFloat(anonymousClass14, (Property<ThemePreviewActivity.AnonymousClass14, Float>) View.SCALE_Y, f4));
                    if (i == -1) {
                        arrayList.add(ObjectAnimator.ofFloat(anonymousClass14, (Property<ThemePreviewActivity.AnonymousClass14, Float>) View.TRANSLATION_Y, 0.0f));
                    }
                    photoFilterCurvesControl = this.photoFilterViewCurvesControl;
                    if (photoFilterCurvesControl != null) {
                        if (i == 1) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(photoFilterCurvesControl, (Property<PhotoFilterCurvesControl, Float>) property14, f12));
                    }
                    photoFilterBlurControl = this.photoFilterViewBlurControl;
                    if (photoFilterBlurControl != null) {
                        if (i == 1) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(photoFilterBlurControl, (Property<PhotoFilterBlurControl, Float>) property14, f11));
                    }
                    if (i == -1) {
                        f5 = 1.0f;
                    } else {
                        f5 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(anonymousClass8, (Property<AnonymousClass8, Float>) property14, f5));
                    if (i != -1 || i == 2) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    float[] fArr3 = {f6};
                    AnonymousClass4 anonymousClass5 = anonymousClass4;
                    arrayList.add(ObjectAnimator.ofFloat(anonymousClass5, (Property<AnonymousClass4, Float>) property14, fArr3));
                    Property property15 = View.TRANSLATION_Y;
                    if (i != -1 || i == 2) {
                        fDp = 0.0f;
                    } else {
                        fDp = AndroidUtilities.dp(120.0f);
                    }
                    arrayList.add(ObjectAnimator.ofFloat(anonymousClass5, (Property<AnonymousClass4, Float>) property15, fDp));
                    if (i != -1) {
                        i4 = 2;
                        if (i != 2) {
                            f13 = 0.0f;
                        }
                    } else {
                        i4 = 2;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property14, f13));
                    if (i == i4) {
                        fDp2 = AndroidUtilities.dp(68.0f);
                    } else {
                        fDp2 = AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + anonymousClass8.getEditTextHeight()));
                    }
                    arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property15, fDp2));
                    linearLayout.setPivotX(linearLayout.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                    property = View.ROTATION;
                    if (i == 2) {
                        f7 = -90.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, f7));
                    if (i == 2) {
                        f8 = 90.0f;
                    } else {
                        f8 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(anonymousClass27, (Property<ChatActivity.AnonymousClass27, Float>) property, f8));
                    if (i == 2) {
                        f9 = 90.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(rLottieImageView, (Property<RLottieImageView, Float>) property, f9));
                    if (i == 2) {
                        f10 = 90.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(downloadButton, (Property<DownloadButton, Float>) property, f10));
                    imageView2 = this.themeButton;
                    if (imageView2 != null) {
                        arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, i != 2 ? 0.0f : 90.0f));
                    }
                    if (this.blurManager.hasRenderNode()) {
                        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        i5 = 0;
                        valueAnimatorOfFloat5.addUpdateListener(new AnonymousClass22(this, i5));
                        arrayList.add(valueAnimatorOfFloat5);
                    } else {
                        i5 = 0;
                    }
                    if (timelineView != null) {
                        storyEntry2 = this.outputEntry;
                        if (storyEntry2 == null || !storyEntry2.isCollage()) {
                            z3 = true;
                            break;
                        }
                        StoryEntry storyEntry7 = this.outputEntry;
                        if (!storyEntry7.isCollage()) {
                            z3 = true;
                            break;
                        }
                        int i9 = 0;
                        while (true) {
                            if (i9 < storyEntry7.collageContent.size()) {
                                if (((StoryEntry) storyEntry7.collageContent.get(i9)).isVideo) {
                                    if (i != 2) {
                                        z3 = false;
                                        break;
                                    }
                                    break;
                                }
                                i9++;
                            }
                            z3 = true;
                            break;
                        }
                        if (timelineView.open == z3 || !z2) {
                            timelineView.open = z3;
                            if (!z2) {
                                timelineView.openT.set(z3, true);
                            }
                            timelineView.invalidate();
                        }
                    }
                    if (z2) {
                        while (i5 < arrayList.size()) {
                            Animator animator = (Animator) arrayList.get(i5);
                            animator.setDuration(1L);
                            animator.start();
                            i5++;
                        }
                        if (i7 != i) {
                            onSwitchEditModeEnd(i7, i);
                            return;
                        }
                        return;
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.editModeAnimator = animatorSet2;
                    animatorSet2.playTogether(arrayList);
                    this.editModeAnimator.setDuration(320L);
                    this.editModeAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    this.editModeAnimator.addListener(new AnonymousClass16(this, i7, i, 1));
                    if (z4) {
                        this.editModeAnimator.setStartDelay(120L);
                    }
                    this.editModeAnimator.start();
                }
                i2 = 1;
                float[] fArr4 = new float[i2];
                fArr4[0] = f14;
                arrayList.add(ObjectAnimator.ofFloat(rLottieImageView, (Property<RLottieImageView, Float>) property14, fArr4));
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass27, (Property<ChatActivity.AnonymousClass27, Float>) property14, ((i != -1 || i == 2) && (this.mode == i2 || !((storyEntry = this.outputEntry) == null || TextUtils.isEmpty(storyEntry.audioPath)))) ? 1.0f : 0.0f));
                if (i != -1) {
                    f3 = 1.0f;
                } else {
                    f3 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(downloadButton, (Property<DownloadButton, Float>) property14, f3));
                imageView = this.themeButton;
                if (imageView != null) {
                    i3 = 1;
                    arrayList.add(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property14, ((i != -1 || i == 2) && (storyEntry3 = this.outputEntry) != null && storyEntry3.isRepostMessage) ? 1.0f : 0.0f));
                } else {
                    i3 = 1;
                }
                int i10 = this.currentPage;
                float[] fArr5 = new float[i3];
                fArr5[0] = ((i10 != i3 || i10 == 2) && i == -1) ? 1.0f : 0.0f;
                arrayList.add(ObjectAnimator.ofFloat(simpleTextView, (Property<SimpleTextView, Float>) property14, fArr5));
                if (i == i3) {
                    anonymousClass14 = anonymousClass15;
                    anonymousClass14.setPivotY(anonymousClass15.getMeasuredHeight() * 0.2f);
                    contentHeight = AndroidUtilities.dp(164.0f);
                } else {
                    anonymousClass14 = anonymousClass15;
                    if (i == 0) {
                        anonymousClass14.setPivotY(anonymousClass14.getMeasuredHeight() * 0.6f);
                        contentHeight = AndroidUtilities.dp(40.0f);
                    } else if (i == 2) {
                        anonymousClass14.setPivotY(0.0f);
                        contentHeight = timelineView.getContentHeight() + AndroidUtilities.dp(8.0f);
                    } else {
                        contentHeight = 0;
                    }
                }
                if (contentHeight > 0) {
                    int height2 = anonymousClass14.getHeight() - ((int) anonymousClass14.getPivotY());
                    f4 = (height2 - contentHeight) / height2;
                } else {
                    f4 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass14, (Property<ThemePreviewActivity.AnonymousClass14, Float>) View.SCALE_X, f4));
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass14, (Property<ThemePreviewActivity.AnonymousClass14, Float>) View.SCALE_Y, f4));
                if (i == -1) {
                    arrayList.add(ObjectAnimator.ofFloat(anonymousClass14, (Property<ThemePreviewActivity.AnonymousClass14, Float>) View.TRANSLATION_Y, 0.0f));
                }
                photoFilterCurvesControl = this.photoFilterViewCurvesControl;
                if (photoFilterCurvesControl != null) {
                    if (i == 1) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(photoFilterCurvesControl, (Property<PhotoFilterCurvesControl, Float>) property14, f12));
                }
                photoFilterBlurControl = this.photoFilterViewBlurControl;
                if (photoFilterBlurControl != null) {
                    if (i == 1) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(photoFilterBlurControl, (Property<PhotoFilterBlurControl, Float>) property14, f11));
                }
                if (i == -1) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass8, (Property<AnonymousClass8, Float>) property14, f5));
                if (i != -1) {
                    f6 = 1.0f;
                } else {
                    f6 = 1.0f;
                }
                float[] fArr6 = {f6};
                AnonymousClass4 anonymousClass6 = anonymousClass4;
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass6, (Property<AnonymousClass4, Float>) property14, fArr6));
                Property property16 = View.TRANSLATION_Y;
                if (i != -1) {
                    fDp = 0.0f;
                } else {
                    fDp = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass6, (Property<AnonymousClass4, Float>) property16, fDp));
                if (i != -1) {
                    i4 = 2;
                    if (i != 2) {
                        f13 = 0.0f;
                    }
                } else {
                    i4 = 2;
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property14, f13));
                if (i == i4) {
                    fDp2 = AndroidUtilities.dp(68.0f);
                } else {
                    fDp2 = AndroidUtilities.dp(64.0f) + (-(AndroidUtilities.dp(12.0f) + anonymousClass8.getEditTextHeight()));
                }
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property16, fDp2));
                linearLayout.setPivotX(linearLayout.getMeasuredWidth() - AndroidUtilities.dp(23.0f));
                property = View.ROTATION;
                if (i == 2) {
                    f7 = -90.0f;
                } else {
                    f7 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, f7));
                if (i == 2) {
                    f8 = 90.0f;
                } else {
                    f8 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass27, (Property<ChatActivity.AnonymousClass27, Float>) property, f8));
                if (i == 2) {
                    f9 = 90.0f;
                } else {
                    f9 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(rLottieImageView, (Property<RLottieImageView, Float>) property, f9));
                if (i == 2) {
                    f10 = 90.0f;
                } else {
                    f10 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(downloadButton, (Property<DownloadButton, Float>) property, f10));
                imageView2 = this.themeButton;
                if (imageView2 != null) {
                    arrayList.add(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, i != 2 ? 0.0f : 90.0f));
                }
                if (this.blurManager.hasRenderNode()) {
                    ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    i5 = 0;
                    valueAnimatorOfFloat6.addUpdateListener(new AnonymousClass22(this, i5));
                    arrayList.add(valueAnimatorOfFloat6);
                } else {
                    i5 = 0;
                }
                if (timelineView != null) {
                    storyEntry2 = this.outputEntry;
                    if (storyEntry2 == null) {
                        z3 = true;
                        break;
                    } else {
                        z3 = true;
                        break;
                    }
                    if (timelineView.open == z3) {
                        timelineView.open = z3;
                        if (!z2) {
                            timelineView.openT.set(z3, true);
                        }
                        timelineView.invalidate();
                    } else {
                        timelineView.open = z3;
                        if (!z2) {
                            timelineView.openT.set(z3, true);
                        }
                        timelineView.invalidate();
                    }
                }
                if (z2) {
                    while (i5 < arrayList.size()) {
                        Animator animator2 = (Animator) arrayList.get(i5);
                        animator2.setDuration(1L);
                        animator2.start();
                        i5++;
                    }
                    if (i7 != i) {
                        onSwitchEditModeEnd(i7, i);
                        return;
                    }
                    return;
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                this.editModeAnimator = animatorSet3;
                animatorSet3.playTogether(arrayList);
                this.editModeAnimator.setDuration(320L);
                this.editModeAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.editModeAnimator.addListener(new AnonymousClass16(this, i7, i, 1));
                if (z4) {
                    this.editModeAnimator.setStartDelay(120L);
                }
                this.editModeAnimator.start();
            }
        }
    }

    public final void updateActionBarButtons(boolean z) {
        AnonymousClass25 anonymousClass25;
        boolean z2 = false;
        showVideoTimer(this.currentPage == 0 && this.mode == 1 && !this.collageListView.visible && !inCheck(), z);
        this.collageButton.setSelected(this.collageLayoutView.hasLayout());
        FlashViews.ImageViewInvertable imageViewInvertable = this.backButton;
        CollageLayoutButton.CollageLayoutListView collageLayoutListView = this.collageListView;
        setActionBarButtonVisible(imageViewInvertable, collageLayoutListView == null || !collageLayoutListView.visible, z);
        setActionBarButtonVisible(this.flashButton, (this.animatedRecording || this.mode == -1 || this.currentPage != 0 || this.flashButtonMode == null || this.collageListView.visible || inCheck()) ? false : true, z);
        setActionBarButtonVisible(this.dualButton, (this.animatedRecording || this.mode == -1 || this.currentPage != 0 || (anonymousClass25 = this.cameraView) == null || !anonymousClass25.dualAvailable || this.collageListView.visible || this.collageLayoutView.hasLayout()) ? false : true, z);
        setActionBarButtonVisible(this.collageButton, (this.animatedRecording || this.mode == -1 || this.currentPage != 0 || this.collageListView.visible) ? false : true, z);
        setActionBarButtonVisible(this.collageRemoveButton, this.collageListView.visible, z);
        this.recordControl.setCollageProgress(this.collageLayoutView.hasLayout() ? this.collageLayoutView.getFilledProgress() : 0.0f, z);
        HintView2 hintView2 = this.removeCollageHint;
        if (this.collageListView.visible) {
            hintView2.show();
        } else {
            hintView2.hide(true);
        }
        animateRecording(this.animatedRecording, z);
        AndroidUtilities.updateViewShow(this.liveSettingsButton, this.mode == -1 && this.currentPage == 0);
        FlashViews.ImageViewInvertable imageViewInvertable2 = this.rotateButton;
        if (this.mode == -1 && this.currentPage == 0) {
            z2 = true;
        }
        AndroidUtilities.updateViewShow(imageViewInvertable2, z2);
    }

    public final void updateActionBarButtonsOffsets() {
        this.collageRemoveButton.setTranslationX(-0.0f);
        float alpha = (this.collageRemoveButton.getAlpha() * AndroidUtilities.dp(46.0f)) + 0.0f;
        this.dualButton.setTranslationX(-alpha);
        float alpha2 = (this.dualButton.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha;
        this.collageButton.setTranslationX(-alpha2);
        float alpha3 = (this.collageButton.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha2;
        this.flashButton.setTranslationX(-alpha3);
        float alpha4 = (this.flashButton.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha3;
        this.backButton.setTranslationX(0.0f);
        float alpha5 = (this.backButton.getAlpha() * AndroidUtilities.dp(46.0f)) + 0.0f;
        CollageLayoutButton.CollageLayoutListView collageLayoutListView = this.collageListView;
        collageLayoutListView.listView.setPadding((int) (alpha5 + AndroidUtilities.dp(8.0f)), 0, (int) (alpha4 + AndroidUtilities.dp(8.0f)), 0);
        collageLayoutListView.listView.invalidate();
    }

    public final void updateThemeButtonDrawable(boolean z) {
        RLottieDrawable rLottieDrawable = this.themeButtonDrawable;
        if (rLottieDrawable != null) {
            int i = 0;
            int[] iArr = rLottieDrawable.metaData;
            if (!z) {
                StoryEntry storyEntry = this.outputEntry;
                int i2 = (storyEntry == null || !storyEntry.isDark) ? 0 : iArr[0] - 1;
                rLottieDrawable.setCurrentFrame(i2, false, true);
                this.themeButtonDrawable.setCustomEndFrame(i2);
                ImageView imageView = this.themeButton;
                if (imageView != null) {
                    imageView.invalidate();
                    return;
                }
                return;
            }
            StoryEntry storyEntry2 = this.outputEntry;
            if (storyEntry2 != null && storyEntry2.isDark) {
                i = iArr[0];
            }
            rLottieDrawable.setCustomEndFrame(i);
            RLottieDrawable rLottieDrawable2 = this.themeButtonDrawable;
            if (rLottieDrawable2 != null) {
                rLottieDrawable2.start();
            }
        }
    }

    public final void upload$1() {
        if (this.preparingUpload) {
            return;
        }
        this.preparingUpload = true;
        StoryRecorder$$ExternalSyntheticLambda7 storyRecorder$$ExternalSyntheticLambda7 = new StoryRecorder$$ExternalSyntheticLambda7(this, 2);
        AnonymousClass24 anonymousClass24 = this.paintView;
        StoryEntry storyEntry = this.outputEntry;
        if (anonymousClass24 == null || storyEntry == null) {
            storyRecorder$$ExternalSyntheticLambda7.run();
            return;
        }
        storyEntry.clearPaint();
        boolean zHasChanges = anonymousClass24.hasChanges();
        boolean z = anonymousClass24.renderView.getPainting().hasBlur;
        Utilities.searchQueue.postRunnable(new StoryRecorder$$ExternalSyntheticLambda113(this, anonymousClass24, storyEntry.resultWidth, storyEntry.resultHeight, storyEntry, z, zHasChanges, storyRecorder$$ExternalSyntheticLambda7, 1));
    }

    public final boolean useDisplayFlashlight() {
        AnonymousClass25 anonymousClass25;
        if ((!this.takingPhoto && !this.takingVideo) || (anonymousClass25 = this.cameraView) == null || !anonymousClass25.isFrontface()) {
            return false;
        }
        int i = this.frontfaceFlashMode;
        return i == 2 || (i == 1 && this.isDark);
    }
}
