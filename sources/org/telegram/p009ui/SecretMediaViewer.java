package org.telegram.p009ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.Property;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.p004ui.AspectRatioFrameLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.p009ui.ActionBar.C1006ActionBar;
import org.telegram.p009ui.Components.AnimationProperties;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.Scroller;
import org.telegram.p009ui.Components.TimerParticles;
import org.telegram.p009ui.Components.VideoPlayer;
import org.telegram.p009ui.PhotoViewer;
import org.telegram.p009ui.SecretMediaViewer;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$Message;

public class SecretMediaViewer implements NotificationCenter.NotificationCenterDelegate, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    @SuppressLint({"StaticFieldLeak"})
    private static volatile SecretMediaViewer Instance;
    private C1006ActionBar actionBar;
    private int[] animateFromRadius;
    private float animateToClipBottom;
    private float animateToClipBottomOrigin;
    private float animateToClipHorizontal;
    private float animateToClipTop;
    private float animateToClipTopOrigin;
    private boolean animateToRadius;
    private float animateToScale;
    private float animateToX;
    private float animateToY;
    private long animationStartTime;
    private float animationValue;
    private AspectRatioFrameLayout aspectRatioFrameLayout;
    private float clipBottom;
    private float clipBottomOrigin;
    private float clipHorizontal;
    private float clipTop;
    private float clipTopOrigin;
    private boolean closeAfterAnimation;
    private long closeTime;
    private boolean closeVideoAfterWatch;
    private FrameLayoutDrawer containerView;
    private int currentAccount;
    private AnimatorSet currentActionBarAnimation;
    private long currentDialogId;
    private MessageObject currentMessageObject;
    private PhotoViewer.PhotoViewerProvider currentProvider;
    private float[] currentRadii;
    private ImageReceiver.BitmapHolder currentThumb;
    private boolean disableShowCheck;
    private boolean discardTap;
    private boolean doubleTap;
    private float dragY;
    private boolean draggingDown;
    private GestureDetector gestureDetector;
    private AnimatorSet imageMoveAnimation;
    private boolean invalidCoords;
    private boolean isPhotoVisible;
    private boolean isPlaying;
    private boolean isVideo;
    private boolean isVisible;
    private Object lastInsets;
    private float maxX;
    private float maxY;
    private float minX;
    private float minY;
    private float moveStartX;
    private float moveStartY;
    private boolean moving;
    private long openTime;
    private Activity parentActivity;
    private Runnable photoAnimationEndRunnable;
    private int photoAnimationInProgress;
    private long photoTransitionAnimationStartTime;
    private float pinchCenterX;
    private float pinchCenterY;
    private float pinchStartDistance;
    private float pinchStartX;
    private float pinchStartY;
    private int playerRetryPlayCount;
    private Scroller scroller;
    private SecretDeleteTimer secretDeleteTimer;
    private boolean textureUploaded;
    private float translationX;
    private float translationY;
    private boolean useOvershootForScale;
    private VelocityTracker velocityTracker;
    private float videoCrossfadeAlpha;
    private long videoCrossfadeAlphaLastTime;
    private boolean videoCrossfadeStarted;
    private VideoPlayer videoPlayer;
    private TextureView videoTextureView;
    private boolean videoWatchedOneTime;
    private boolean wasLightNavigationBar;
    private int wasNavigationBarColor;
    private WindowManager.LayoutParams windowLayoutParams;
    private FrameLayout windowView;
    private boolean zoomAnimation;
    private boolean zooming;
    private ImageReceiver centerImage = new ImageReceiver();
    private boolean isActionBarVisible = true;
    private PhotoBackgroundDrawable photoBackgroundDrawable = new PhotoBackgroundDrawable(-16777216);
    private Paint blackPaint = new Paint();
    private float scale = 1.0f;
    private DecelerateInterpolator interpolator = new DecelerateInterpolator(1.5f);
    private float pinchStartScale = 1.0f;
    private boolean canDragDown = true;
    private Path roundRectPath = new Path();

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
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

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    static int access$1110(SecretMediaViewer secretMediaViewer) {
        int i = secretMediaViewer.playerRetryPlayCount;
        secretMediaViewer.playerRetryPlayCount = i - 1;
        return i;
    }

    public class FrameLayoutDrawer extends FrameLayout {
        public FrameLayoutDrawer(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            SecretMediaViewer.this.processTouchEvent(motionEvent);
            return true;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            SecretMediaViewer.this.onDraw(canvas);
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            return view != SecretMediaViewer.this.aspectRatioFrameLayout && super.drawChild(canvas, view, j);
        }
    }

    public class SecretDeleteTimer extends FrameLayout {
        private Paint afterDeleteProgressPaint;
        private Paint circlePaint;
        private long destroyTime;
        private long destroyTtl;
        private Drawable drawable;
        private Paint particlePaint;
        private boolean useVideoProgress;
        private RectF deleteProgressRect = new RectF();
        private TimerParticles timerParticles = new TimerParticles();

        public SecretDeleteTimer(Context context) {
            super(context);
            setWillNotDraw(false);
            Paint paint = new Paint(1);
            this.particlePaint = paint;
            paint.setStrokeWidth(AndroidUtilities.m34dp(1.5f));
            this.particlePaint.setColor(-1644826);
            this.particlePaint.setStrokeCap(Paint.Cap.ROUND);
            this.particlePaint.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint(1);
            this.afterDeleteProgressPaint = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            this.afterDeleteProgressPaint.setStrokeCap(Paint.Cap.ROUND);
            this.afterDeleteProgressPaint.setColor(-1644826);
            this.afterDeleteProgressPaint.setStrokeWidth(AndroidUtilities.m34dp(2.0f));
            Paint paint3 = new Paint(1);
            this.circlePaint = paint3;
            paint3.setColor(2130706432);
            this.drawable = context.getResources().getDrawable(C0952R.C0953drawable.flame_small);
        }

        public void setDestroyTime(long j, long j2, boolean z) {
            this.destroyTime = j;
            this.destroyTtl = j2;
            this.useVideoProgress = z;
            invalidate();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int measuredHeight = (getMeasuredHeight() / 2) - (AndroidUtilities.m34dp(28.0f) / 2);
            this.deleteProgressRect.set(getMeasuredWidth() - AndroidUtilities.m34dp(49.0f), measuredHeight, getMeasuredWidth() - AndroidUtilities.m34dp(21.0f), measuredHeight + AndroidUtilities.m34dp(28.0f));
        }

        @Override
        @SuppressLint({"DrawAllocation"})
        protected void onDraw(Canvas canvas) {
            if (SecretMediaViewer.this.currentMessageObject != null && SecretMediaViewer.this.currentMessageObject.messageOwner.destroyTime != 0) {
                canvas.drawCircle(getMeasuredWidth() - AndroidUtilities.m34dp(35.0f), getMeasuredHeight() / 2, AndroidUtilities.m34dp(16.0f), this.circlePaint);
                float f = 1.0f;
                if (!this.useVideoProgress) {
                    f = ((float) Math.max(0L, this.destroyTime - (System.currentTimeMillis() + (ConnectionsManager.getInstance(SecretMediaViewer.this.currentAccount).getTimeDifference() * 1000)))) / (((float) this.destroyTtl) * 1000.0f);
                } else if (SecretMediaViewer.this.videoPlayer != null) {
                    long duration = SecretMediaViewer.this.videoPlayer.getDuration();
                    long currentPosition = SecretMediaViewer.this.videoPlayer.getCurrentPosition();
                    if (!(duration == -9223372036854775807L || currentPosition == -9223372036854775807L)) {
                        f = 1.0f - (((float) currentPosition) / ((float) duration));
                    }
                }
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.m34dp(40.0f);
                int measuredHeight = ((getMeasuredHeight() - AndroidUtilities.m34dp(14.0f)) / 2) - AndroidUtilities.m34dp(0.5f);
                this.drawable.setBounds(measuredWidth, measuredHeight, AndroidUtilities.m34dp(10.0f) + measuredWidth, AndroidUtilities.m34dp(14.0f) + measuredHeight);
                this.drawable.draw(canvas);
                float f2 = (-360.0f) * f;
                canvas.drawArc(this.deleteProgressRect, -90.0f, f2, false, this.afterDeleteProgressPaint);
                this.timerParticles.draw(canvas, this.particlePaint, this.deleteProgressRect, f2, 1.0f);
                invalidate();
            }
        }
    }

    public class PhotoBackgroundDrawable extends ColorDrawable {
        private Runnable drawRunnable;
        private int frame;

        public PhotoBackgroundDrawable(int i) {
            super(i);
        }

        @Override
        @Keep
        public void setAlpha(int i) {
            if (SecretMediaViewer.this.parentActivity instanceof LaunchActivity) {
                ((LaunchActivity) SecretMediaViewer.this.parentActivity).drawerLayoutContainer.setAllowDrawContent(!SecretMediaViewer.this.isPhotoVisible || i != 255);
            }
            super.setAlpha(i);
        }

        @Override
        public void draw(Canvas canvas) {
            Runnable runnable;
            super.draw(canvas);
            if (getAlpha() != 0) {
                if (this.frame != 2 || (runnable = this.drawRunnable) == null) {
                    invalidateSelf();
                } else {
                    runnable.run();
                    this.drawRunnable = null;
                }
                this.frame++;
            }
        }
    }

    public static SecretMediaViewer getInstance() {
        SecretMediaViewer secretMediaViewer = Instance;
        if (secretMediaViewer == null) {
            synchronized (PhotoViewer.class) {
                secretMediaViewer = Instance;
                if (secretMediaViewer == null) {
                    secretMediaViewer = new SecretMediaViewer();
                    Instance = secretMediaViewer;
                }
            }
        }
        return secretMediaViewer;
    }

    public static boolean hasInstance() {
        return Instance != null;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.messagesDeleted) {
            if (((Boolean) objArr[2]).booleanValue() || this.currentMessageObject == null || ((Long) objArr[1]).longValue() != 0 || !((ArrayList) objArr[0]).contains(Integer.valueOf(this.currentMessageObject.getId()))) {
                return;
            }
            if (this.isVideo && !this.videoWatchedOneTime) {
                this.closeVideoAfterWatch = true;
            } else if (!closePhoto(true, true)) {
                this.closeAfterAnimation = true;
            }
        } else if (i == NotificationCenter.didCreatedNewDeleteTask) {
            if (!(this.currentMessageObject == null || this.secretDeleteTimer == null || ((Long) objArr[0]).longValue() != this.currentDialogId)) {
                SparseArray sparseArray = (SparseArray) objArr[1];
                for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                    int keyAt = sparseArray.keyAt(i3);
                    ArrayList arrayList = (ArrayList) sparseArray.get(keyAt);
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        if (this.currentMessageObject.getId() == ((Integer) arrayList.get(i4)).intValue()) {
                            this.currentMessageObject.messageOwner.destroyTime = keyAt;
                            this.secretDeleteTimer.invalidate();
                            return;
                        }
                    }
                }
            }
        } else if (i == NotificationCenter.updateMessageMedia && this.currentMessageObject.getId() == ((TLRPC$Message) objArr[0]).f877id) {
            if (this.isVideo && !this.videoWatchedOneTime) {
                this.closeVideoAfterWatch = true;
            } else if (!closePhoto(true, true)) {
                this.closeAfterAnimation = true;
            }
        }
    }

    public void preparePlayer(File file) {
        if (this.parentActivity != null) {
            releasePlayer();
            if (this.videoTextureView == null) {
                AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(this.parentActivity);
                this.aspectRatioFrameLayout = aspectRatioFrameLayout;
                aspectRatioFrameLayout.setVisibility(4);
                this.containerView.addView(this.aspectRatioFrameLayout, 0, LayoutHelper.createFrame(-1, -1, 17));
                TextureView textureView = new TextureView(this.parentActivity);
                this.videoTextureView = textureView;
                textureView.setOpaque(false);
                this.aspectRatioFrameLayout.addView(this.videoTextureView, LayoutHelper.createFrame(-1, -1, 17));
            }
            this.textureUploaded = false;
            this.videoCrossfadeStarted = false;
            TextureView textureView2 = this.videoTextureView;
            this.videoCrossfadeAlpha = 0.0f;
            textureView2.setAlpha(0.0f);
            if (this.videoPlayer == null) {
                VideoPlayer videoPlayer = new VideoPlayer();
                this.videoPlayer = videoPlayer;
                videoPlayer.setTextureView(this.videoTextureView);
                this.videoPlayer.setDelegate(new C34771(file));
            }
            this.videoPlayer.preparePlayer(Uri.fromFile(file), "other");
            this.videoPlayer.setPlayWhenReady(true);
        }
    }

    public class C34771 implements VideoPlayer.VideoPlayerDelegate {
        final File val$file;

        @Override
        public void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onRenderedFirstFrame(this, eventTime);
        }

        @Override
        public void onSeekFinished(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekFinished(this, eventTime);
        }

        @Override
        public void onSeekStarted(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekStarted(this, eventTime);
        }

        @Override
        public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        C34771(File file) {
            this.val$file = file;
        }

        @Override
        public void onStateChanged(boolean z, int i) {
            if (SecretMediaViewer.this.videoPlayer != null && SecretMediaViewer.this.currentMessageObject != null) {
                if (i == 4 || i == 1) {
                    try {
                        SecretMediaViewer.this.parentActivity.getWindow().clearFlags(ConnectionsManager.RequestFlagNeedQuickAck);
                    } catch (Exception e) {
                        FileLog.m30e(e);
                    }
                } else {
                    try {
                        SecretMediaViewer.this.parentActivity.getWindow().addFlags(ConnectionsManager.RequestFlagNeedQuickAck);
                    } catch (Exception e2) {
                        FileLog.m30e(e2);
                    }
                }
                if (i == 3 && SecretMediaViewer.this.aspectRatioFrameLayout.getVisibility() != 0) {
                    SecretMediaViewer.this.aspectRatioFrameLayout.setVisibility(0);
                }
                if (!SecretMediaViewer.this.videoPlayer.isPlaying() || i == 4) {
                    if (SecretMediaViewer.this.isPlaying) {
                        SecretMediaViewer.this.isPlaying = false;
                        if (i == 4) {
                            SecretMediaViewer.this.videoWatchedOneTime = true;
                            if (SecretMediaViewer.this.closeVideoAfterWatch) {
                                SecretMediaViewer.this.closePhoto(true, true);
                                return;
                            }
                            SecretMediaViewer.this.videoPlayer.seekTo(0L);
                            SecretMediaViewer.this.videoPlayer.play();
                        }
                    }
                } else if (!SecretMediaViewer.this.isPlaying) {
                    SecretMediaViewer.this.isPlaying = true;
                }
            }
        }

        @Override
        public void onError(VideoPlayer videoPlayer, Exception exc) {
            if (SecretMediaViewer.this.playerRetryPlayCount > 0) {
                SecretMediaViewer.access$1110(SecretMediaViewer.this);
                final File file = this.val$file;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        SecretMediaViewer.C34771.this.lambda$onError$0(file);
                    }
                }, 100L);
                return;
            }
            FileLog.m30e(exc);
        }

        public void lambda$onError$0(File file) {
            SecretMediaViewer.this.preparePlayer(file);
        }

        @Override
        public void onVideoSizeChanged(int i, int i2, int i3, float f) {
            if (SecretMediaViewer.this.aspectRatioFrameLayout != null) {
                if (!(i3 == 90 || i3 == 270)) {
                    i2 = i;
                    i = i2;
                }
                SecretMediaViewer.this.aspectRatioFrameLayout.setAspectRatio(i == 0 ? 1.0f : (i2 * f) / i, i3);
            }
        }

        @Override
        public void onRenderedFirstFrame() {
            if (!SecretMediaViewer.this.textureUploaded) {
                SecretMediaViewer.this.textureUploaded = true;
                SecretMediaViewer.this.containerView.invalidate();
            }
        }
    }

    private void releasePlayer() {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            this.playerRetryPlayCount = 0;
            videoPlayer.releasePlayer(true);
            this.videoPlayer = null;
        }
        try {
            Activity activity = this.parentActivity;
            if (activity != null) {
                activity.getWindow().clearFlags(ConnectionsManager.RequestFlagNeedQuickAck);
            }
        } catch (Exception e) {
            FileLog.m30e(e);
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            this.containerView.removeView(aspectRatioFrameLayout);
            this.aspectRatioFrameLayout = null;
        }
        if (this.videoTextureView != null) {
            this.videoTextureView = null;
        }
        this.isPlaying = false;
    }

    public void setParentActivity(Activity activity) {
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.centerImage.setCurrentAccount(i);
        if (this.parentActivity != activity) {
            this.parentActivity = activity;
            this.scroller = new Scroller(activity);
            FrameLayout frameLayout = new FrameLayout(activity) {
                @Override
                protected void onMeasure(int i2, int i3) {
                    int size = View.MeasureSpec.getSize(i2);
                    int size2 = View.MeasureSpec.getSize(i3);
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 < 21 || SecretMediaViewer.this.lastInsets == null) {
                        int i5 = AndroidUtilities.displaySize.y;
                        if (size2 > i5) {
                            size2 = i5;
                        }
                    } else {
                        WindowInsets windowInsets = (WindowInsets) SecretMediaViewer.this.lastInsets;
                        if (AndroidUtilities.incorrectDisplaySizeFix) {
                            int i6 = AndroidUtilities.displaySize.y;
                            if (size2 > i6) {
                                size2 = i6;
                            }
                            size2 += AndroidUtilities.statusBarHeight;
                        }
                        size2 -= windowInsets.getSystemWindowInsetBottom();
                        size -= windowInsets.getSystemWindowInsetRight();
                    }
                    setMeasuredDimension(size, size2);
                    if (i4 >= 21 && SecretMediaViewer.this.lastInsets != null) {
                        size -= ((WindowInsets) SecretMediaViewer.this.lastInsets).getSystemWindowInsetLeft();
                    }
                    SecretMediaViewer.this.containerView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                }

                @Override
                protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                    int systemWindowInsetLeft = (Build.VERSION.SDK_INT < 21 || SecretMediaViewer.this.lastInsets == null) ? 0 : ((WindowInsets) SecretMediaViewer.this.lastInsets).getSystemWindowInsetLeft() + 0;
                    SecretMediaViewer.this.containerView.layout(systemWindowInsetLeft, 0, SecretMediaViewer.this.containerView.getMeasuredWidth() + systemWindowInsetLeft, SecretMediaViewer.this.containerView.getMeasuredHeight());
                    if (z) {
                        if (SecretMediaViewer.this.imageMoveAnimation == null) {
                            SecretMediaViewer.this.scale = 1.0f;
                            SecretMediaViewer.this.translationX = 0.0f;
                            SecretMediaViewer.this.translationY = 0.0f;
                        }
                        SecretMediaViewer secretMediaViewer = SecretMediaViewer.this;
                        secretMediaViewer.updateMinMax(secretMediaViewer.scale);
                    }
                }

                @Override
                protected void onDraw(Canvas canvas) {
                    if (Build.VERSION.SDK_INT >= 21 && SecretMediaViewer.this.isVisible && SecretMediaViewer.this.lastInsets != null) {
                        WindowInsets windowInsets = (WindowInsets) SecretMediaViewer.this.lastInsets;
                        if (SecretMediaViewer.this.photoAnimationInProgress != 0) {
                            SecretMediaViewer.this.blackPaint.setAlpha(SecretMediaViewer.this.photoBackgroundDrawable.getAlpha());
                        } else {
                            SecretMediaViewer.this.blackPaint.setAlpha(255);
                        }
                        canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() + windowInsets.getSystemWindowInsetBottom(), SecretMediaViewer.this.blackPaint);
                    }
                }
            };
            this.windowView = frameLayout;
            frameLayout.setBackgroundDrawable(this.photoBackgroundDrawable);
            this.windowView.setFocusable(true);
            this.windowView.setFocusableInTouchMode(true);
            FrameLayoutDrawer frameLayoutDrawer = new FrameLayoutDrawer(activity) {
                @Override
                protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                    super.onLayout(z, i2, i3, i4, i5);
                    if (SecretMediaViewer.this.secretDeleteTimer != null) {
                        int currentActionBarHeight = ((C1006ActionBar.getCurrentActionBarHeight() - SecretMediaViewer.this.secretDeleteTimer.getMeasuredHeight()) / 2) + (Build.VERSION.SDK_INT >= 21 ? AndroidUtilities.statusBarHeight : 0);
                        SecretMediaViewer.this.secretDeleteTimer.layout(SecretMediaViewer.this.secretDeleteTimer.getLeft(), currentActionBarHeight, SecretMediaViewer.this.secretDeleteTimer.getRight(), SecretMediaViewer.this.secretDeleteTimer.getMeasuredHeight() + currentActionBarHeight);
                    }
                }
            };
            this.containerView = frameLayoutDrawer;
            frameLayoutDrawer.setFocusable(false);
            this.windowView.addView(this.containerView);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.containerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            layoutParams.gravity = 51;
            this.containerView.setLayoutParams(layoutParams);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 21) {
                this.containerView.setFitsSystemWindows(true);
                this.containerView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                    @Override
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        WindowInsets lambda$setParentActivity$0;
                        lambda$setParentActivity$0 = SecretMediaViewer.this.lambda$setParentActivity$0(view, windowInsets);
                        return lambda$setParentActivity$0;
                    }
                });
                this.containerView.setSystemUiVisibility(1280);
            }
            GestureDetector gestureDetector = new GestureDetector(this.containerView.getContext(), this);
            this.gestureDetector = gestureDetector;
            gestureDetector.setOnDoubleTapListener(this);
            C1006ActionBar actionBar = new C1006ActionBar(activity);
            this.actionBar = actionBar;
            actionBar.setTitleColor(-1);
            this.actionBar.setSubtitleColor(-1);
            this.actionBar.setBackgroundColor(2130706432);
            this.actionBar.setOccupyStatusBar(i2 >= 21);
            this.actionBar.setItemsBackgroundColor(1090519039, false);
            this.actionBar.setBackButtonImage(C0952R.C0953drawable.ic_ab_back);
            this.actionBar.setTitleRightMargin(AndroidUtilities.m34dp(70.0f));
            this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f));
            this.actionBar.setActionBarMenuOnItemClick(new C1006ActionBar.ActionBarMenuOnItemClick() {
                @Override
                public void onItemClick(int i3) {
                    if (i3 == -1) {
                        SecretMediaViewer.this.closePhoto(true, false);
                    }
                }
            });
            SecretDeleteTimer secretDeleteTimer = new SecretDeleteTimer(activity);
            this.secretDeleteTimer = secretDeleteTimer;
            this.containerView.addView(secretDeleteTimer, LayoutHelper.createFrame(119, 48.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
            this.windowLayoutParams = layoutParams2;
            layoutParams2.height = -1;
            layoutParams2.format = -3;
            layoutParams2.width = -1;
            layoutParams2.gravity = 48;
            layoutParams2.type = 99;
            if (i2 >= 21) {
                layoutParams2.flags = -2147417848;
            } else {
                layoutParams2.flags = 8;
            }
            layoutParams2.flags |= 8192;
            this.centerImage.setParentView(this.containerView);
            this.centerImage.setForceCrossfade(true);
        }
    }

    public WindowInsets lambda$setParentActivity$0(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = (WindowInsets) this.lastInsets;
        this.lastInsets = windowInsets;
        if (windowInsets2 == null || !windowInsets2.toString().equals(windowInsets.toString())) {
            this.windowView.requestLayout();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public void openMedia(MessageObject messageObject, PhotoViewer.PhotoViewerProvider photoViewerProvider, final Runnable runnable) {
        final PhotoViewer.PlaceProviderObject placeForPhoto;
        int i;
        int i2;
        if (this.parentActivity != null && messageObject != null && messageObject.needDrawBluredPreview() && photoViewerProvider != null && (placeForPhoto = photoViewerProvider.getPlaceForPhoto(messageObject, null, 0, true)) != null) {
            this.currentProvider = photoViewerProvider;
            this.openTime = System.currentTimeMillis();
            this.closeTime = 0L;
            this.isActionBarVisible = true;
            this.isPhotoVisible = true;
            this.draggingDown = false;
            AspectRatioFrameLayout aspectRatioFrameLayout = this.aspectRatioFrameLayout;
            if (aspectRatioFrameLayout != null) {
                aspectRatioFrameLayout.setVisibility(4);
            }
            releasePlayer();
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
            this.doubleTap = false;
            this.invalidCoords = false;
            this.canDragDown = true;
            updateMinMax(this.scale);
            this.photoBackgroundDrawable.setAlpha(0);
            this.containerView.setAlpha(1.0f);
            this.containerView.setVisibility(0);
            this.secretDeleteTimer.setAlpha(1.0f);
            this.isVideo = false;
            this.videoWatchedOneTime = false;
            this.closeVideoAfterWatch = false;
            this.disableShowCheck = true;
            this.centerImage.setManualAlphaAnimator(false);
            RectF drawRegion = placeForPhoto.imageReceiver.getDrawRegion();
            float width = drawRegion.width();
            float height = drawRegion.height();
            Point point = AndroidUtilities.displaySize;
            int i3 = point.x;
            this.scale = Math.max(width / i3, height / (point.y + (Build.VERSION.SDK_INT >= 21 ? AndroidUtilities.statusBarHeight : 0)));
            int[] iArr = placeForPhoto.radius;
            if (iArr != null) {
                this.animateFromRadius = new int[iArr.length];
                int i4 = 0;
                while (true) {
                    int[] iArr2 = placeForPhoto.radius;
                    if (i4 >= iArr2.length) {
                        break;
                    }
                    this.animateFromRadius[i4] = iArr2[i4];
                    i4++;
                }
            } else {
                this.animateFromRadius = null;
            }
            float f = drawRegion.left;
            this.translationX = ((placeForPhoto.viewX + f) + (width / 2.0f)) - (i3 / 2);
            this.translationY = ((placeForPhoto.viewY + drawRegion.top) + (height / 2.0f)) - (i / 2);
            this.clipHorizontal = Math.abs(f - placeForPhoto.imageReceiver.getImageX());
            int abs = (int) Math.abs(drawRegion.top - placeForPhoto.imageReceiver.getImageY());
            int[] iArr3 = new int[2];
            placeForPhoto.parentView.getLocationInWindow(iArr3);
            int i5 = iArr3[1];
            int i6 = Build.VERSION.SDK_INT;
            float f2 = ((i5 - (i6 >= 21 ? 0 : AndroidUtilities.statusBarHeight)) - (placeForPhoto.viewY + drawRegion.top)) + placeForPhoto.clipTopAddition;
            this.clipTop = f2;
            float f3 = abs;
            this.clipTop = Math.max(0.0f, Math.max(f2, f3));
            float height2 = (((placeForPhoto.viewY + drawRegion.top) + ((int) height)) - ((iArr3[1] + placeForPhoto.parentView.getHeight()) - (i6 >= 21 ? 0 : AndroidUtilities.statusBarHeight))) + placeForPhoto.clipBottomAddition;
            this.clipBottom = height2;
            this.clipBottom = Math.max(0.0f, Math.max(height2, f3));
            this.clipTopOrigin = 0.0f;
            this.clipTopOrigin = Math.max(0.0f, Math.max(0.0f, f3));
            this.clipBottomOrigin = 0.0f;
            this.clipBottomOrigin = Math.max(0.0f, Math.max(0.0f, f3));
            this.animationStartTime = System.currentTimeMillis();
            this.animateToX = 0.0f;
            this.animateToY = 0.0f;
            this.animateToClipBottom = 0.0f;
            this.animateToClipBottomOrigin = 0.0f;
            this.animateToClipHorizontal = 0.0f;
            this.animateToClipTop = 0.0f;
            this.animateToClipTopOrigin = 0.0f;
            this.animateToScale = 1.0f;
            this.animateToRadius = true;
            this.zoomAnimation = true;
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.messagesDeleted);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateMessageMedia);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didCreatedNewDeleteTask);
            this.currentDialogId = MessageObject.getPeerId(messageObject.messageOwner.peer_id);
            toggleActionBar(true, false);
            this.currentMessageObject = messageObject;
            TLRPC$Document document = messageObject.getDocument();
            ImageReceiver.BitmapHolder bitmapHolder = this.currentThumb;
            if (bitmapHolder != null) {
                bitmapHolder.release();
                this.currentThumb = null;
            }
            this.currentThumb = placeForPhoto.imageReceiver.getThumbBitmapSafe();
            if (document == null) {
                i2 = 2;
                this.actionBar.setTitle(LocaleController.getString("DisappearingPhoto", C0952R.string.DisappearingPhoto));
                this.centerImage.setImage(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize()), messageObject.photoThumbsObject), (String) null, this.currentThumb != null ? new BitmapDrawable(this.currentThumb.bitmap) : null, -1, (String) null, messageObject, 2);
                SecretDeleteTimer secretDeleteTimer = this.secretDeleteTimer;
                TLRPC$Message tLRPC$Message = messageObject.messageOwner;
                secretDeleteTimer.setDestroyTime(tLRPC$Message.destroyTime * 1000, tLRPC$Message.ttl, false);
            } else if (MessageObject.isGifDocument(document)) {
                this.actionBar.setTitle(LocaleController.getString("DisappearingGif", C0952R.string.DisappearingGif));
                i2 = 2;
                this.centerImage.setImage(ImageLocation.getForDocument(document), (String) null, this.currentThumb != null ? new BitmapDrawable(this.currentThumb.bitmap) : null, -1, (String) null, messageObject, 1);
                SecretDeleteTimer secretDeleteTimer2 = this.secretDeleteTimer;
                TLRPC$Message tLRPC$Message2 = messageObject.messageOwner;
                secretDeleteTimer2.setDestroyTime(tLRPC$Message2.destroyTime * 1000, tLRPC$Message2.ttl, false);
            } else {
                i2 = 2;
                this.playerRetryPlayCount = 1;
                this.actionBar.setTitle(LocaleController.getString("DisappearingVideo", C0952R.string.DisappearingVideo));
                File file = new File(messageObject.messageOwner.attachPath);
                if (file.exists()) {
                    preparePlayer(file);
                } else {
                    File pathToMessage = FileLoader.getInstance(this.currentAccount).getPathToMessage(messageObject.messageOwner);
                    File file2 = new File(pathToMessage.getAbsolutePath() + ".enc");
                    if (file2.exists()) {
                        pathToMessage = file2;
                    }
                    preparePlayer(pathToMessage);
                }
                this.isVideo = true;
                this.centerImage.setImage((ImageLocation) null, (String) null, this.currentThumb != null ? new BitmapDrawable(this.currentThumb.bitmap) : null, -1, (String) null, messageObject, 2);
                if (messageObject.getDuration() * 1000 > (messageObject.messageOwner.destroyTime * 1000) - (System.currentTimeMillis() + (ConnectionsManager.getInstance(this.currentAccount).getTimeDifference() * 1000))) {
                    this.secretDeleteTimer.setDestroyTime(-1L, -1L, true);
                } else {
                    SecretDeleteTimer secretDeleteTimer3 = this.secretDeleteTimer;
                    TLRPC$Message tLRPC$Message3 = messageObject.messageOwner;
                    secretDeleteTimer3.setDestroyTime(tLRPC$Message3.destroyTime * 1000, tLRPC$Message3.ttl, false);
                }
            }
            try {
                if (this.windowView.getParent() != null) {
                    ((WindowManager) this.parentActivity.getSystemService("window")).removeView(this.windowView);
                }
            } catch (Exception e) {
                FileLog.m30e(e);
            }
            ((WindowManager) this.parentActivity.getSystemService("window")).addView(this.windowView, this.windowLayoutParams);
            this.secretDeleteTimer.invalidate();
            this.isVisible = true;
            Window window = this.parentActivity.getWindow();
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 21) {
                this.wasNavigationBarColor = window.getNavigationBarColor();
                this.wasLightNavigationBar = AndroidUtilities.getLightNavigationBar(window);
                AndroidUtilities.setLightNavigationBar(window, false);
                AndroidUtilities.setNavigationBarColor(window, -16777216);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            this.imageMoveAnimation = animatorSet;
            Animator[] animatorArr = new Animator[5];
            float[] fArr = new float[i2];
            
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
            animatorArr[0] = ObjectAnimator.ofFloat(this.actionBar, View.ALPHA, fArr);
            float[] fArr2 = new float[i2];
            
            fArr2[0] = 0.0f;
            fArr2[1] = 1.0f;
            animatorArr[1] = ObjectAnimator.ofFloat(this.secretDeleteTimer, View.ALPHA, fArr2);
            int[] iArr4 = new int[i2];
            
            iArr4[0] = 0;
            iArr4[1] = 255;
            animatorArr[i2] = ObjectAnimator.ofInt(this.photoBackgroundDrawable, (Property<PhotoBackgroundDrawable, Integer>) AnimationProperties.COLOR_DRAWABLE_ALPHA, iArr4);
            float[] fArr3 = new float[i2];
            
            fArr3[0] = 0.0f;
            fArr3[1] = 1.0f;
            animatorArr[3] = ObjectAnimator.ofFloat(this.secretDeleteTimer, View.ALPHA, fArr3);
            float[] fArr4 = new float[i2];
            
            fArr4[0] = 0.0f;
            fArr4[1] = 1.0f;
            animatorArr[4] = ObjectAnimator.ofFloat(this, "animationValue", fArr4);
            animatorSet.playTogether(animatorArr);
            this.photoAnimationInProgress = 3;
            this.photoAnimationEndRunnable = new Runnable() {
                @Override
                public final void run() {
                    SecretMediaViewer.this.lambda$openMedia$1(runnable);
                }
            };
            this.imageMoveAnimation.setDuration(250L);
            this.imageMoveAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (SecretMediaViewer.this.photoAnimationEndRunnable != null) {
                        SecretMediaViewer.this.photoAnimationEndRunnable.run();
                        SecretMediaViewer.this.photoAnimationEndRunnable = null;
                    }
                }
            });
            this.photoTransitionAnimationStartTime = System.currentTimeMillis();
            if (i7 >= 18) {
                this.containerView.setLayerType(i2, null);
            }
            this.imageMoveAnimation.setInterpolator(new DecelerateInterpolator());
            this.photoBackgroundDrawable.frame = 0;
            this.photoBackgroundDrawable.drawRunnable = new Runnable() {
                @Override
                public final void run() {
                    SecretMediaViewer.this.lambda$openMedia$2(placeForPhoto);
                }
            };
            this.imageMoveAnimation.start();
        }
    }

    public void lambda$openMedia$1(Runnable runnable) {
        this.photoAnimationInProgress = 0;
        this.imageMoveAnimation = null;
        if (runnable != null) {
            runnable.run();
        }
        FrameLayoutDrawer frameLayoutDrawer = this.containerView;
        if (frameLayoutDrawer != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                frameLayoutDrawer.setLayerType(0, null);
            }
            this.containerView.invalidate();
            if (this.closeAfterAnimation) {
                closePhoto(true, true);
            }
        }
    }

    public void lambda$openMedia$2(PhotoViewer.PlaceProviderObject placeProviderObject) {
        this.disableShowCheck = false;
        placeProviderObject.imageReceiver.setVisible(false, true);
    }

    public boolean isShowingImage(MessageObject messageObject) {
        MessageObject messageObject2;
        return this.isVisible && !this.disableShowCheck && messageObject != null && (messageObject2 = this.currentMessageObject) != null && messageObject2.getId() == messageObject.getId();
    }

    private void toggleActionBar(boolean z, boolean z2) {
        if (z) {
            this.actionBar.setVisibility(0);
        }
        this.actionBar.setEnabled(z);
        this.isActionBarVisible = z;
        float f = 1.0f;
        if (z2) {
            ArrayList arrayList = new ArrayList();
            C1006ActionBar actionBar = this.actionBar;
            Property property = View.ALPHA;
            float[] fArr = new float[1];
            if (!z) {
                f = 0.0f;
            }
            fArr[0] = f;
            arrayList.add(ObjectAnimator.ofFloat(actionBar, property, fArr));
            AnimatorSet animatorSet = new AnimatorSet();
            this.currentActionBarAnimation = animatorSet;
            animatorSet.playTogether(arrayList);
            if (!z) {
                this.currentActionBarAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (SecretMediaViewer.this.currentActionBarAnimation != null && SecretMediaViewer.this.currentActionBarAnimation.equals(animator)) {
                            SecretMediaViewer.this.actionBar.setVisibility(8);
                            SecretMediaViewer.this.currentActionBarAnimation = null;
                        }
                    }
                });
            }
            this.currentActionBarAnimation.setDuration(200L);
            this.currentActionBarAnimation.start();
            return;
        }
        C1006ActionBar actionBar2 = this.actionBar;
        if (!z) {
            f = 0.0f;
        }
        actionBar2.setAlpha(f);
        if (!z) {
            this.actionBar.setVisibility(8);
        }
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public void destroyPhotoViewer() {
        FrameLayout frameLayout;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.messagesDeleted);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateMessageMedia);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didCreatedNewDeleteTask);
        this.isVisible = false;
        this.currentProvider = null;
        ImageReceiver.BitmapHolder bitmapHolder = this.currentThumb;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.currentThumb = null;
        }
        releasePlayer();
        if (!(this.parentActivity == null || (frameLayout = this.windowView) == null)) {
            try {
                if (frameLayout.getParent() != null) {
                    ((WindowManager) this.parentActivity.getSystemService("window")).removeViewImmediate(this.windowView);
                }
                this.windowView = null;
            } catch (Exception e) {
                FileLog.m30e(e);
            }
        }
        Instance = null;
    }

    public void onDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.SecretMediaViewer.onDraw(android.graphics.Canvas):void");
    }

    @Keep
    public float getVideoCrossfadeAlpha() {
        return this.videoCrossfadeAlpha;
    }

    @Keep
    public void setVideoCrossfadeAlpha(float f) {
        this.videoCrossfadeAlpha = f;
        this.containerView.invalidate();
    }

    private boolean checkPhotoAnimation() {
        if (this.photoAnimationInProgress != 0 && Math.abs(this.photoTransitionAnimationStartTime - System.currentTimeMillis()) >= 500) {
            Runnable runnable = this.photoAnimationEndRunnable;
            if (runnable != null) {
                runnable.run();
                this.photoAnimationEndRunnable = null;
            }
            this.photoAnimationInProgress = 0;
        }
        return this.photoAnimationInProgress != 0;
    }

    public long getOpenTime() {
        return this.openTime;
    }

    public long getCloseTime() {
        return this.closeTime;
    }

    public MessageObject getCurrentMessageObject() {
        return this.currentMessageObject;
    }

    public boolean closePhoto(boolean r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.SecretMediaViewer.closePhoto(boolean, boolean):boolean");
    }

    public void lambda$closePhoto$3(PhotoViewer.PlaceProviderObject placeProviderObject) {
        this.imageMoveAnimation = null;
        this.photoAnimationInProgress = 0;
        if (Build.VERSION.SDK_INT >= 18) {
            this.containerView.setLayerType(0, null);
        }
        this.containerView.setVisibility(4);
        onPhotoClosed(placeProviderObject);
    }

    public class C34837 extends AnimatorListenerAdapter {
        final PhotoViewer.PlaceProviderObject val$object;

        C34837(PhotoViewer.PlaceProviderObject placeProviderObject) {
            this.val$object = placeProviderObject;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            PhotoViewer.PlaceProviderObject placeProviderObject = this.val$object;
            if (placeProviderObject != null) {
                placeProviderObject.imageReceiver.setVisible(true, true);
            }
            SecretMediaViewer.this.isVisible = false;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SecretMediaViewer.C34837.this.lambda$onAnimationEnd$0();
                }
            });
        }

        public void lambda$onAnimationEnd$0() {
            if (SecretMediaViewer.this.photoAnimationEndRunnable != null) {
                SecretMediaViewer.this.photoAnimationEndRunnable.run();
                SecretMediaViewer.this.photoAnimationEndRunnable = null;
            }
        }
    }

    public void lambda$closePhoto$4(PhotoViewer.PlaceProviderObject placeProviderObject) {
        FrameLayoutDrawer frameLayoutDrawer = this.containerView;
        if (frameLayoutDrawer != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                frameLayoutDrawer.setLayerType(0, null);
            }
            this.containerView.setVisibility(4);
            this.photoAnimationInProgress = 0;
            onPhotoClosed(placeProviderObject);
            this.containerView.setScaleX(1.0f);
            this.containerView.setScaleY(1.0f);
        }
    }

    private void onPhotoClosed(PhotoViewer.PlaceProviderObject placeProviderObject) {
        this.isVisible = false;
        this.currentProvider = null;
        this.disableShowCheck = false;
        releasePlayer();
        new ArrayList();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SecretMediaViewer.this.lambda$onPhotoClosed$5();
            }
        }, 50L);
    }

    public void lambda$onPhotoClosed$5() {
        ImageReceiver.BitmapHolder bitmapHolder = this.currentThumb;
        if (bitmapHolder != null) {
            bitmapHolder.release();
            this.currentThumb = null;
        }
        this.centerImage.setImageBitmap((Bitmap) null);
        try {
            if (this.windowView.getParent() != null) {
                ((WindowManager) this.parentActivity.getSystemService("window")).removeView(this.windowView);
            }
        } catch (Exception e) {
            FileLog.m30e(e);
        }
        this.isPhotoVisible = false;
    }

    public void updateMinMax(float f) {
        int imageWidth = ((int) ((this.centerImage.getImageWidth() * f) - getContainerViewWidth())) / 2;
        int imageHeight = ((int) ((this.centerImage.getImageHeight() * f) - getContainerViewHeight())) / 2;
        if (imageWidth > 0) {
            this.minX = -imageWidth;
            this.maxX = imageWidth;
        } else {
            this.maxX = 0.0f;
            this.minX = 0.0f;
        }
        if (imageHeight > 0) {
            this.minY = -imageHeight;
            this.maxY = imageHeight;
            return;
        }
        this.maxY = 0.0f;
        this.minY = 0.0f;
    }

    private int getContainerViewWidth() {
        return this.containerView.getWidth();
    }

    private int getContainerViewHeight() {
        return this.containerView.getHeight();
    }

    public boolean processTouchEvent(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.SecretMediaViewer.processTouchEvent(android.view.MotionEvent):boolean");
    }

    private void checkMinMax(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.SecretMediaViewer.checkMinMax(boolean):void");
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
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, "animationValue", 0.0f, 1.0f));
            this.imageMoveAnimation.setInterpolator(this.interpolator);
            this.imageMoveAnimation.setDuration(i);
            this.imageMoveAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    SecretMediaViewer.this.imageMoveAnimation = null;
                    SecretMediaViewer.this.containerView.invalidate();
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
        if (this.discardTap) {
            return false;
        }
        toggleActionBar(!this.isActionBarVisible, true);
        return true;
    }

    @Override
    public boolean onDoubleTap(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.SecretMediaViewer.onDoubleTap(android.view.MotionEvent):boolean");
    }
}
