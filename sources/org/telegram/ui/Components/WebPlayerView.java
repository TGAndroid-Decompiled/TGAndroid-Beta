package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.exoplayer2.ExoPlayerImpl;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import com.google.android.gms.internal.mlkit_language_id_common.zzjd;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.commonmark.parser.Parser;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.telegram.SQLite.SQLitePreparedStatement$$ExternalSyntheticOutline0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda17;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.PhotoViewer;

public final class WebPlayerView extends ViewGroup implements VideoPlayer.VideoPlayerDelegate, AudioManager.OnAudioFocusChangeListener {
    public final boolean allowInlineAnimation;
    public final AnonymousClass4 aspectRatioFrameLayout;
    public final Paint backgroundPaint;
    public TextureView changedTextureView;
    public boolean changingTextureView;
    public final ControlsView controlsView;
    public float currentAlpha;
    public Bitmap currentBitmap;
    public AsyncTask currentTask;
    public String currentYoutubeId;
    public final WebPlayerViewDelegate delegate;
    public boolean drawImage;
    public boolean firstFrameRendered;
    public final ImageView fullscreenButton;
    public boolean hasAudioFocus;
    public boolean inFullscreen;
    public boolean initied;
    public final ImageView inlineButton;
    public boolean isAutoplay;
    public boolean isCompleted;
    public boolean isInline;
    public boolean isStream;
    public long lastUpdateTime;
    public String playAudioType;
    public String playAudioUrl;
    public final ImageView playButton;
    public String playVideoType;
    public String playVideoUrl;
    public AnimatorSet progressAnimation;
    public final AnonymousClass1 progressRunnable;
    public final RadialProgressView progressView;
    public boolean resumeAudioOnFocusGain;
    public int seekToTime;
    public final PhotoViewer.AnonymousClass8 surfaceTextureListener;
    public final AnonymousClass1 switchToInlineRunnable;
    public boolean switchingInlineMode;
    public final ImageView textureImageView;
    public final TextureView textureView;
    public final ViewGroup textureViewContainer;
    public int videoHeight;
    public final VideoPlayer videoPlayer;
    public int videoWidth;
    public int waitingForFirstTextureUpload;
    public final PaymentFormActivity.AnonymousClass5 webView;
    public static final Pattern youtubeIdRegex = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern vimeoIdRegex = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern coubIdRegex = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern aparatIdRegex = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern twitchClipIdRegex = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern twitchStreamIdRegex = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern aparatFileListPattern = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern twitchClipFilePattern = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern stsPattern = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern jsPattern = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern sigPattern = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern sigPattern2 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern stmtVarPattern = Pattern.compile("var\\s");
    public static final Pattern stmtReturnPattern = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern exprParensPattern = Pattern.compile("[()]");
    public static final Pattern playerIdPattern = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public final class AnonymousClass1 implements Runnable {
        public final int $r8$classId;
        public final WebPlayerView this$0;

        public AnonymousClass1(WebPlayerView webPlayerView, int i) {
            this.$r8$classId = i;
            this.this$0 = webPlayerView;
        }

        @Override
        public final void run() {
            switch (this.$r8$classId) {
                case 0:
                    WebPlayerView webPlayerView = this.this$0;
                    VideoPlayer videoPlayer = webPlayerView.videoPlayer;
                    if (videoPlayer != null && videoPlayer.isPlaying()) {
                        webPlayerView.controlsView.setProgress((int) (webPlayerView.videoPlayer.getCurrentPosition() / 1000));
                        ControlsView controlsView = webPlayerView.controlsView;
                        VideoPlayer videoPlayer2 = webPlayerView.videoPlayer;
                        ExoPlayerImpl exoPlayerImpl = videoPlayer2.player;
                        controlsView.bufferedPosition = (int) ((exoPlayerImpl != null ? videoPlayer2.isStreaming ? exoPlayerImpl.getBufferedPosition() : exoPlayerImpl.getDuration() : 0L) / 1000);
                        controlsView.invalidate();
                        AndroidUtilities.runOnUIThread(webPlayerView.progressRunnable, 1000L);
                        break;
                    }
                    break;
                default:
                    WebPlayerView webPlayerView2 = this.this$0;
                    webPlayerView2.switchingInlineMode = false;
                    Bitmap bitmap = webPlayerView2.currentBitmap;
                    if (bitmap != null) {
                        bitmap.recycle();
                        webPlayerView2.currentBitmap = null;
                    }
                    webPlayerView2.changingTextureView = true;
                    ImageView imageView = webPlayerView2.textureImageView;
                    TextureView textureView = webPlayerView2.textureView;
                    if (imageView != null) {
                        try {
                            Bitmap bitmapCreateBitmap = Bitmaps.createBitmap(textureView.getWidth(), textureView.getHeight(), Bitmap.Config.ARGB_8888);
                            webPlayerView2.currentBitmap = bitmapCreateBitmap;
                            textureView.getBitmap(bitmapCreateBitmap);
                        } catch (Throwable th) {
                            Bitmap bitmap2 = webPlayerView2.currentBitmap;
                            if (bitmap2 != null) {
                                bitmap2.recycle();
                                webPlayerView2.currentBitmap = null;
                            }
                            FileLog.e(th);
                        }
                        if (webPlayerView2.currentBitmap != null) {
                            imageView.setVisibility(0);
                            imageView.setImageBitmap(webPlayerView2.currentBitmap);
                        } else {
                            imageView.setImageDrawable(null);
                        }
                    }
                    webPlayerView2.isInline = true;
                    webPlayerView2.updatePlayButton();
                    webPlayerView2.updateFullscreenButton();
                    webPlayerView2.updateInlineButton();
                    ControlsView controlsView2 = webPlayerView2.controlsView;
                    ViewGroup viewGroup = (ViewGroup) controlsView2.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(controlsView2);
                    }
                    boolean z = webPlayerView2.isInline;
                    int i = webPlayerView2.videoWidth;
                    int i2 = webPlayerView2.videoHeight;
                    webPlayerView2.aspectRatioFrameLayout.getVideoRotation();
                    TextureView textureViewOnSwitchInlineMode = webPlayerView2.delegate.onSwitchInlineMode(webPlayerView2.controlsView, z, i, i2, webPlayerView2.allowInlineAnimation);
                    webPlayerView2.changedTextureView = textureViewOnSwitchInlineMode;
                    textureViewOnSwitchInlineMode.setVisibility(4);
                    ViewGroup viewGroup2 = (ViewGroup) textureView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(textureView);
                    }
                    controlsView2.show(false, false);
                    break;
            }
        }
    }

    public final class AnonymousClass4 extends AspectRatioFrameLayout {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass4(Object obj, Activity activity, int i) {
            super(activity);
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            MessageObject playingMessageObject;
            switch (this.$r8$classId) {
                case 1:
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.this$0;
                    if (view == pipRoundVideoView.textureView && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
                        pipRoundVideoView.rect.set(AndroidUtilities.dpf2(1.5f), AndroidUtilities.dpf2(1.5f), getMeasuredWidth() - AndroidUtilities.dpf2(1.5f), getMeasuredHeight() - AndroidUtilities.dpf2(1.5f));
                        canvas.drawArc(pipRoundVideoView.rect, -90.0f, playingMessageObject.audioProgress * 360.0f, false, Theme.chat_radialProgressPaint);
                    }
                    return zDrawChild;
                default:
                    return super.drawChild(canvas, view, j);
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    super.onMeasure(i, i2);
                    WebPlayerView webPlayerView = (WebPlayerView) this.this$0;
                    if (webPlayerView.textureViewContainer != null) {
                        ViewGroup.LayoutParams layoutParams = webPlayerView.textureView.getLayoutParams();
                        layoutParams.width = getMeasuredWidth();
                        layoutParams.height = getMeasuredHeight();
                        ImageView imageView = webPlayerView.textureImageView;
                        if (imageView != null) {
                            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                            layoutParams2.width = getMeasuredWidth();
                            layoutParams2.height = getMeasuredHeight();
                        }
                    }
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }
    }

    public final class ControlsView extends FrameLayout {
        public static final int $r8$clinit = 0;
        public int bufferedPosition;
        public AnimatorSet currentAnimation;
        public int currentProgressX;
        public int duration;
        public StaticLayout durationLayout;
        public int durationWidth;
        public final Tooltip$$ExternalSyntheticLambda0 hideRunnable;
        public final ImageReceiver imageReceiver;
        public boolean isVisible;
        public int lastProgressX;
        public int progress;
        public final Paint progressBufferedPaint;
        public final Paint progressInnerPaint;
        public StaticLayout progressLayout;
        public final Paint progressPaint;
        public boolean progressPressed;
        public final TextPaint textPaint;

        public ControlsView(Activity activity) {
            super(activity);
            this.isVisible = true;
            this.hideRunnable = new Tooltip$$ExternalSyntheticLambda0(this, 16);
            setWillNotDraw(false);
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            textPaint.setColor(-1);
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            Paint paint = new Paint(1);
            this.progressPaint = paint;
            paint.setColor(-15095832);
            Paint paint2 = new Paint();
            this.progressInnerPaint = paint2;
            paint2.setColor(-6975081);
            Paint paint3 = new Paint(1);
            this.progressBufferedPaint = paint3;
            paint3.setColor(-1);
            this.imageReceiver = new ImageReceiver(this);
        }

        public final void checkNeedHide() {
            Tooltip$$ExternalSyntheticLambda0 tooltip$$ExternalSyntheticLambda0 = this.hideRunnable;
            AndroidUtilities.cancelRunOnUIThread(tooltip$$ExternalSyntheticLambda0);
            if (this.isVisible && WebPlayerView.this.videoPlayer.isPlaying()) {
                AndroidUtilities.runOnUIThread(tooltip$$ExternalSyntheticLambda0, 3000L);
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            int iDp;
            int iDp2;
            Canvas canvas2;
            int i;
            WebPlayerView webPlayerView = WebPlayerView.this;
            if (webPlayerView.drawImage) {
                if (webPlayerView.firstFrameRendered && webPlayerView.currentAlpha != 0.0f) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = jCurrentTimeMillis - webPlayerView.lastUpdateTime;
                    webPlayerView.lastUpdateTime = jCurrentTimeMillis;
                    float f = webPlayerView.currentAlpha - (j / 150.0f);
                    webPlayerView.currentAlpha = f;
                    if (f < 0.0f) {
                        webPlayerView.currentAlpha = 0.0f;
                    }
                    invalidate();
                }
                ImageReceiver imageReceiver = this.imageReceiver;
                imageReceiver.setAlpha(webPlayerView.currentAlpha);
                imageReceiver.draw(canvas);
            }
            if (webPlayerView.videoPlayer.player == null || webPlayerView.isStream) {
                return;
            }
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!webPlayerView.isInline) {
                if (this.durationLayout != null) {
                    canvas.save();
                    canvas.translate((measuredWidth - AndroidUtilities.dp(58.0f)) - this.durationWidth, measuredHeight - AndroidUtilities.dp((webPlayerView.inFullscreen ? 6 : 10) + 29));
                    this.durationLayout.draw(canvas);
                    canvas.restore();
                }
                if (this.progressLayout != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(18.0f), measuredHeight - AndroidUtilities.dp((webPlayerView.inFullscreen ? 6 : 10) + 29));
                    this.progressLayout.draw(canvas);
                    canvas.restore();
                }
            }
            if (this.duration != 0) {
                int iDp3 = 0;
                if (webPlayerView.isInline) {
                    iDp = measuredHeight - AndroidUtilities.dp(3.0f);
                    iDp2 = AndroidUtilities.dp(7.0f);
                } else if (webPlayerView.inFullscreen) {
                    iDp = measuredHeight - AndroidUtilities.dp(29.0f);
                    iDp3 = AndroidUtilities.dp(36.0f) + this.durationWidth;
                    measuredWidth = (measuredWidth - AndroidUtilities.dp(76.0f)) - this.durationWidth;
                    iDp2 = AndroidUtilities.dp(28.0f);
                } else {
                    iDp = measuredHeight - AndroidUtilities.dp(13.0f);
                    iDp2 = AndroidUtilities.dp(12.0f);
                }
                int i2 = measuredHeight - iDp2;
                boolean z = webPlayerView.inFullscreen;
                Paint paint = this.progressInnerPaint;
                if (z) {
                    canvas.drawRect(iDp3, iDp, measuredWidth, AndroidUtilities.dp(3.0f) + iDp, paint);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                }
                int i3 = this.progressPressed ? this.currentProgressX : ((int) ((this.progress / this.duration) * (measuredWidth - iDp3))) + iDp3;
                int i4 = this.bufferedPosition;
                if (i4 != 0 && (i = this.duration) != 0) {
                    float f2 = iDp3;
                    float f3 = iDp;
                    float fM = zzjd.m(i4, i, measuredWidth - iDp3, f2);
                    float fDp = AndroidUtilities.dp(3.0f) + iDp;
                    if (webPlayerView.inFullscreen) {
                        paint = this.progressBufferedPaint;
                    }
                    canvas2.drawRect(f2, f3, fM, fDp, paint);
                }
                float f4 = i3;
                float fDp2 = AndroidUtilities.dp(3.0f) + iDp;
                Paint paint2 = this.progressPaint;
                canvas2.drawRect(iDp3, iDp, f4, fDp2, paint2);
                if (webPlayerView.isInline) {
                    return;
                }
                canvas2.drawCircle(f4, i2, AndroidUtilities.dp(this.progressPressed ? 7.0f : 5.0f), paint2);
            }
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            if (this.isVisible) {
                onTouchEvent(motionEvent);
                return this.progressPressed;
            }
            show(true, true);
            return true;
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int measuredWidth;
            int measuredHeight;
            int iDp;
            int i;
            WebPlayerView webPlayerView = WebPlayerView.this;
            if (webPlayerView.inFullscreen) {
                iDp = AndroidUtilities.dp(36.0f) + this.durationWidth;
                measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(76.0f)) - this.durationWidth;
                measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(28.0f);
            } else {
                measuredWidth = getMeasuredWidth();
                measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
                iDp = 0;
            }
            int i2 = this.duration;
            if (i2 != 0) {
                i = (int) ((this.progress / i2) * (measuredWidth - iDp));
            } else {
                i = 0;
            }
            int i3 = i + iDp;
            int action = motionEvent.getAction();
            Tooltip$$ExternalSyntheticLambda0 tooltip$$ExternalSyntheticLambda0 = this.hideRunnable;
            if (action == 0) {
                if (!this.isVisible || webPlayerView.isInline || webPlayerView.isStream) {
                    show(true, true);
                } else if (this.duration != 0) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (x >= i3 - AndroidUtilities.dp(10.0f) && x <= AndroidUtilities.dp(10.0f) + i3 && y >= measuredHeight - AndroidUtilities.dp(10.0f) && y <= AndroidUtilities.dp(10.0f) + measuredHeight) {
                        this.progressPressed = true;
                        this.lastProgressX = x;
                        this.currentProgressX = i3;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        invalidate();
                    }
                }
                AndroidUtilities.cancelRunOnUIThread(tooltip$$ExternalSyntheticLambda0);
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                boolean z = webPlayerView.initied;
                VideoPlayer videoPlayer = webPlayerView.videoPlayer;
                if (z && videoPlayer.isPlaying()) {
                    AndroidUtilities.runOnUIThread(tooltip$$ExternalSyntheticLambda0, 3000L);
                }
                if (this.progressPressed) {
                    this.progressPressed = false;
                    if (webPlayerView.initied) {
                        int i4 = (int) (((this.currentProgressX - iDp) / (measuredWidth - iDp)) * this.duration);
                        this.progress = i4;
                        videoPlayer.seekTo(((long) i4) * 1000, false);
                    }
                }
            } else if (motionEvent.getAction() == 2 && this.progressPressed) {
                int x2 = (int) motionEvent.getX();
                int i5 = this.currentProgressX - (this.lastProgressX - x2);
                this.currentProgressX = i5;
                this.lastProgressX = x2;
                if (i5 < iDp) {
                    this.currentProgressX = iDp;
                } else if (i5 > measuredWidth) {
                    this.currentProgressX = measuredWidth;
                }
                setProgress((int) (((this.currentProgressX - iDp) / (measuredWidth - iDp)) * this.duration * 1000));
                invalidate();
            }
            super.onTouchEvent(motionEvent);
            return true;
        }

        @Override
        public final void requestDisallowInterceptTouchEvent(boolean z) {
            super.requestDisallowInterceptTouchEvent(z);
            checkNeedHide();
        }

        public final void setDuration(int i) {
            if (this.duration == i || i < 0 || WebPlayerView.this.isStream) {
                return;
            }
            this.duration = i;
            StaticLayout staticLayout = new StaticLayout(AndroidUtilities.formatShortDuration(this.duration), this.textPaint, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.durationLayout = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.durationWidth = (int) Math.ceil(this.durationLayout.getLineWidth(0));
            }
            invalidate();
        }

        public final void setProgress(int i) {
            if (this.progressPressed || i < 0 || WebPlayerView.this.isStream) {
                return;
            }
            this.progress = i;
            this.progressLayout = new StaticLayout(AndroidUtilities.formatShortDuration(this.progress), this.textPaint, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            invalidate();
        }

        public final void show(boolean z, boolean z2) {
            final int i = 0;
            final int i2 = 1;
            if (this.isVisible == z) {
                return;
            }
            this.isVisible = z;
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z3 = this.isVisible;
            Property property = View.ALPHA;
            if (z3) {
                if (z2) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.currentAnimation = animatorSet2;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<ControlsView, Float>) property, 1.0f));
                    this.currentAnimation.setDuration(150L);
                    this.currentAnimation.addListener(new AnimatorListenerAdapter(this) {
                        public final ControlsView this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override
                        public final void onAnimationEnd(Animator animator) {
                            switch (i) {
                                case 0:
                                    this.this$1.currentAnimation = null;
                                    break;
                                default:
                                    this.this$1.currentAnimation = null;
                                    break;
                            }
                        }
                    });
                    this.currentAnimation.start();
                } else {
                    setAlpha(1.0f);
                }
            } else if (z2) {
                AnimatorSet animatorSet3 = new AnimatorSet();
                this.currentAnimation = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(this, (Property<ControlsView, Float>) property, 0.0f));
                this.currentAnimation.setDuration(150L);
                this.currentAnimation.addListener(new AnimatorListenerAdapter(this) {
                    public final ControlsView this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override
                    public final void onAnimationEnd(Animator animator) {
                        switch (i2) {
                            case 0:
                                this.this$1.currentAnimation = null;
                                break;
                            default:
                                this.this$1.currentAnimation = null;
                                break;
                        }
                    }
                });
                this.currentAnimation.start();
            } else {
                setAlpha(0.0f);
            }
            checkNeedHide();
        }
    }

    public final class CoubVideoTask extends AsyncTask {
        public final int $r8$classId;
        public final String[] results;
        public final WebPlayerView this$0;
        public String videoId;

        public CoubVideoTask(WebPlayerView webPlayerView, String str, int i) {
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    this.this$0 = webPlayerView;
                    this.results = new String[2];
                    this.videoId = str;
                    break;
                case 2:
                    this.this$0 = webPlayerView;
                    this.results = new String[2];
                    this.videoId = str;
                    break;
                case 3:
                    this.this$0 = webPlayerView;
                    this.results = new String[2];
                    this.videoId = str;
                    break;
                case 4:
                    this.this$0 = webPlayerView;
                    this.results = new String[2];
                    this.videoId = str;
                    break;
                default:
                    this.this$0 = webPlayerView;
                    this.results = new String[4];
                    this.videoId = str;
                    break;
            }
        }

        @Override
        public final Object doInBackground(Object[] objArr) {
            switch (this.$r8$classId) {
                case 0:
                    String[] strArr = this.results;
                    Locale locale = Locale.US;
                    String str = "https://coub.com/api/v2/coubs/" + this.videoId + ".json";
                    this.this$0.getClass();
                    String strDownloadUrlContent = WebPlayerView.downloadUrlContent(this, str, null, true);
                    if (isCancelled()) {
                        return null;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(strDownloadUrlContent).getJSONObject("file_versions").getJSONObject("mobile");
                        String string = jSONObject.getString("video");
                        String string2 = jSONObject.getJSONArray("audio").getString(0);
                        if (string != null && string2 != null) {
                            strArr[0] = string;
                            strArr[1] = "other";
                            strArr[2] = string2;
                            strArr[3] = "other";
                        }
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    if (isCancelled()) {
                        return null;
                    }
                    return strArr[0];
                case 1:
                    String[] strArr2 = this.results;
                    Locale locale2 = Locale.US;
                    String str2 = "http://www.aparat.com/video/video/embed/vt/frame/showvideo/yes/videohash/" + this.videoId;
                    this.this$0.getClass();
                    String strDownloadUrlContent2 = WebPlayerView.downloadUrlContent(this, str2, null, true);
                    if (isCancelled()) {
                        return null;
                    }
                    try {
                        Matcher matcher = WebPlayerView.aparatFileListPattern.matcher(strDownloadUrlContent2);
                        if (matcher.find()) {
                            JSONArray jSONArray = new JSONArray(matcher.group(1));
                            for (int i = 0; i < jSONArray.length(); i++) {
                                JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                                if (jSONArray2.length() != 0) {
                                    JSONObject jSONObject2 = jSONArray2.getJSONObject(0);
                                    if (jSONObject2.has("file")) {
                                        strArr2[0] = jSONObject2.getString("file");
                                        strArr2[1] = "other";
                                    }
                                }
                            }
                        }
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                    if (isCancelled()) {
                        return null;
                    }
                    return strArr2[0];
                case 2:
                    String[] strArr3 = this.results;
                    this.this$0.getClass();
                    String strDownloadUrlContent3 = WebPlayerView.downloadUrlContent(this, this.videoId, null, false);
                    if (isCancelled()) {
                        return null;
                    }
                    try {
                        Matcher matcher2 = WebPlayerView.twitchClipFilePattern.matcher(strDownloadUrlContent3);
                        if (matcher2.find()) {
                            strArr3[0] = new JSONObject(matcher2.group(1)).getJSONArray("quality_options").getJSONObject(0).getString("source");
                            strArr3[1] = "other";
                        }
                        break;
                    } catch (Exception e3) {
                        FileLog.e(e3);
                    }
                    if (isCancelled()) {
                        return null;
                    }
                    return strArr3[0];
                case 3:
                    String[] strArr4 = this.results;
                    HashMap map = new HashMap();
                    map.put("Client-ID", "jzkbprff40iqj646a697cyrvl0zt2m6");
                    int iIndexOf = this.videoId.indexOf(38);
                    if (iIndexOf > 0) {
                        this.videoId = this.videoId.substring(0, iIndexOf);
                    }
                    Locale locale3 = Locale.US;
                    String str3 = "https://api.twitch.tv/kraken/streams/" + this.videoId + "?stream_type=all";
                    WebPlayerView webPlayerView = this.this$0;
                    webPlayerView.getClass();
                    String strDownloadUrlContent4 = WebPlayerView.downloadUrlContent(this, str3, map, false);
                    if (isCancelled()) {
                        return null;
                    }
                    try {
                        new JSONObject(strDownloadUrlContent4).getJSONObject("stream");
                        String str4 = "https://api.twitch.tv/api/channels/" + this.videoId + "/access_token";
                        webPlayerView.getClass();
                        JSONObject jSONObject3 = new JSONObject(WebPlayerView.downloadUrlContent(this, str4, map, false));
                        String strEncode = URLEncoder.encode(jSONObject3.getString("sig"), "UTF-8");
                        String strEncode2 = URLEncoder.encode(jSONObject3.getString("token"), "UTF-8");
                        URLEncoder.encode("https://youtube.googleapis.com/v/" + this.videoId, "UTF-8");
                        String str5 = "allow_source=true&allow_audio_only=true&allow_spectre=true&player=twitchweb&segment_preference=4&p=" + ((int) (Math.random() * 1.0E7d)) + "&sig=" + strEncode + "&token=" + strEncode2;
                        strArr4[0] = "https://usher.ttvnw.net/api/channel/hls/" + this.videoId + ".m3u8?" + str5;
                        strArr4[1] = "hls";
                        break;
                    } catch (Exception e4) {
                        FileLog.e(e4);
                    }
                    if (isCancelled()) {
                        return null;
                    }
                    return strArr4[0];
                default:
                    String[] strArr5 = this.results;
                    Locale locale4 = Locale.US;
                    String str6 = "https://player.vimeo.com/video/" + this.videoId + "/config";
                    this.this$0.getClass();
                    String strDownloadUrlContent5 = WebPlayerView.downloadUrlContent(this, str6, null, true);
                    if (isCancelled()) {
                        return null;
                    }
                    try {
                        JSONObject jSONObject4 = new JSONObject(strDownloadUrlContent5).getJSONObject("request").getJSONObject("files");
                        if (jSONObject4.has("hls")) {
                            JSONObject jSONObject5 = jSONObject4.getJSONObject("hls");
                            try {
                                strArr5[0] = jSONObject5.getString("url");
                            } catch (Exception unused) {
                                strArr5[0] = jSONObject5.getJSONObject("cdns").getJSONObject(jSONObject5.getString("default_cdn")).getString("url");
                            }
                            strArr5[1] = "hls";
                        } else if (jSONObject4.has("progressive")) {
                            strArr5[1] = "other";
                            strArr5[0] = jSONObject4.getJSONArray("progressive").getJSONObject(0).getString("url");
                        }
                        break;
                    } catch (Exception e5) {
                        FileLog.e(e5);
                    }
                    if (isCancelled()) {
                        return null;
                    }
                    return strArr5[0];
            }
        }

        @Override
        public final void onPostExecute(Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    String str = (String) obj;
                    WebPlayerView webPlayerView = this.this$0;
                    if (str != null) {
                        webPlayerView.initied = true;
                        webPlayerView.playVideoUrl = str;
                        String[] strArr = this.results;
                        webPlayerView.playVideoType = strArr[1];
                        webPlayerView.playAudioUrl = strArr[2];
                        webPlayerView.playAudioType = strArr[3];
                        if (webPlayerView.isAutoplay) {
                            webPlayerView.preparePlayer();
                        }
                        webPlayerView.showProgress(false, true);
                        webPlayerView.controlsView.show(true, true);
                    } else if (!isCancelled()) {
                        webPlayerView.onInitFailed();
                    }
                    break;
                case 1:
                    String str2 = (String) obj;
                    WebPlayerView webPlayerView2 = this.this$0;
                    if (str2 != null) {
                        webPlayerView2.initied = true;
                        webPlayerView2.playVideoUrl = str2;
                        webPlayerView2.playVideoType = this.results[1];
                        if (webPlayerView2.isAutoplay) {
                            webPlayerView2.preparePlayer();
                        }
                        webPlayerView2.showProgress(false, true);
                        webPlayerView2.controlsView.show(true, true);
                    } else if (!isCancelled()) {
                        webPlayerView2.onInitFailed();
                    }
                    break;
                case 2:
                    String str3 = (String) obj;
                    WebPlayerView webPlayerView3 = this.this$0;
                    if (str3 != null) {
                        webPlayerView3.initied = true;
                        webPlayerView3.playVideoUrl = str3;
                        webPlayerView3.playVideoType = this.results[1];
                        if (webPlayerView3.isAutoplay) {
                            webPlayerView3.preparePlayer();
                        }
                        webPlayerView3.showProgress(false, true);
                        webPlayerView3.controlsView.show(true, true);
                    } else if (!isCancelled()) {
                        webPlayerView3.onInitFailed();
                    }
                    break;
                case 3:
                    String str4 = (String) obj;
                    WebPlayerView webPlayerView4 = this.this$0;
                    if (str4 != null) {
                        webPlayerView4.initied = true;
                        webPlayerView4.playVideoUrl = str4;
                        webPlayerView4.playVideoType = this.results[1];
                        if (webPlayerView4.isAutoplay) {
                            webPlayerView4.preparePlayer();
                        }
                        webPlayerView4.showProgress(false, true);
                        webPlayerView4.controlsView.show(true, true);
                    } else if (!isCancelled()) {
                        webPlayerView4.onInitFailed();
                    }
                    break;
                default:
                    String str5 = (String) obj;
                    WebPlayerView webPlayerView5 = this.this$0;
                    if (str5 != null) {
                        webPlayerView5.initied = true;
                        webPlayerView5.playVideoUrl = str5;
                        webPlayerView5.playVideoType = this.results[1];
                        if (webPlayerView5.isAutoplay) {
                            webPlayerView5.preparePlayer();
                        }
                        webPlayerView5.showProgress(false, true);
                        webPlayerView5.controlsView.show(true, true);
                    } else if (!isCancelled()) {
                        webPlayerView5.onInitFailed();
                    }
                    break;
            }
        }
    }

    public final class JavaScriptInterface {
        public final VideoEditTextureView$$ExternalSyntheticLambda1 callJavaResultInterface;

        public JavaScriptInterface(VideoEditTextureView$$ExternalSyntheticLambda1 videoEditTextureView$$ExternalSyntheticLambda1) {
            this.callJavaResultInterface = videoEditTextureView$$ExternalSyntheticLambda1;
        }

        @JavascriptInterface
        public void returnResultToJava(String str) {
            WebPlayerView webPlayerView = (WebPlayerView) this.callJavaResultInterface.f$0;
            AsyncTask asyncTask = webPlayerView.currentTask;
            if (asyncTask == null || asyncTask.isCancelled()) {
                return;
            }
            AsyncTask asyncTask2 = webPlayerView.currentTask;
            if (asyncTask2 instanceof YoutubeVideoTask) {
                YoutubeVideoTask youtubeVideoTask = (YoutubeVideoTask) asyncTask2;
                String[] strArr = youtubeVideoTask.result;
                strArr[0] = strArr[0].replace(youtubeVideoTask.sig, "/signature/" + str);
                youtubeVideoTask.countDownLatch.countDown();
            }
        }
    }

    public interface WebPlayerViewDelegate {
        boolean checkInlinePermissions();

        ViewGroup getTextureViewContainer();

        void onInitFailed();

        void onInlineSurfaceTextureReady();

        void onPlayStateChanged(WebPlayerView webPlayerView, boolean z);

        TextureView onSwitchInlineMode(View view, boolean z, int i, int i2, boolean z2);

        TextureView onSwitchToFullscreen(View view, boolean z, float f, int i, boolean z2);

        void onVideoSizeChanged(float f, int i);

        void prepareToSwitchInlineMode(boolean z, AnonymousClass1 anonymousClass1, float f, boolean z2);
    }

    public final class YoutubeVideoTask extends AsyncTask {
        public final CountDownLatch countDownLatch = new CountDownLatch(1);
        public final String[] result = new String[2];
        public String sig;
        public final String videoId;

        public YoutubeVideoTask(String str) {
            this.videoId = str;
        }

        @Override
        public final Object doInBackground(Object[] objArr) {
            String[] strArr;
            char c;
            String str;
            boolean z;
            int i;
            char c2;
            char c3;
            Object obj;
            boolean z2;
            String strConcat;
            String str2;
            String strGroup;
            ?? r3;
            boolean z3;
            boolean z4;
            WebPlayerView webPlayerView = WebPlayerView.this;
            String str3 = "https://www.youtube.com/embed/" + this.videoId;
            webPlayerView.getClass();
            HashMap map = null;
            boolean z5 = true;
            String strDownloadUrlContent = WebPlayerView.downloadUrlContent(this, str3, null, true);
            if (isCancelled()) {
                return null;
            }
            String strM = MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder("video_id="), this.videoId, "&ps=default&gl=US&hl=en");
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(strM);
                sb.append("&eurl=");
                sb.append(URLEncoder.encode("https://youtube.googleapis.com/v/" + this.videoId, "UTF-8"));
                strM = sb.toString();
                while (true) {
                    int i2 = 2;
                    if (i >= 5) {
                        c2 = 0;
                        c3 = 1;
                        break;
                    }
                    WebPlayerView webPlayerView2 = WebPlayerView.this;
                    String str4 = "https://www.youtube.com/get_video_info?" + strM + strArr[i];
                    webPlayerView2.getClass();
                    String strDownloadUrlContent2 = WebPlayerView.downloadUrlContent(this, str4, map, z5);
                    if (isCancelled()) {
                        return map;
                    }
                    if (strDownloadUrlContent2 != null) {
                        String[] strArrSplit = strDownloadUrlContent2.split("&");
                        Object objDecode = map;
                        String str5 = str;
                        int i3 = 0;
                        z3 = false;
                        z4 = false;
                        boolean z6 = z;
                        ?? r5 = z5;
                        while (i3 < strArrSplit.length) {
                            if (strArrSplit[i3].startsWith("dashmpd")) {
                                String[] strArrSplit2 = strArrSplit[i3].split("=");
                                if (strArrSplit2.length == i2) {
                                    try {
                                        this.result[c] = URLDecoder.decode(strArrSplit2[r5], "UTF-8");
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                                z4 = true;
                            } else {
                                if (strArrSplit[i3].startsWith("url_encoded_fmt_stream_map")) {
                                    String[] strArrSplit3 = strArrSplit[i3].split("=");
                                    if (strArrSplit3.length == i2) {
                                        try {
                                            String[] strArrSplit4 = URLDecoder.decode(strArrSplit3[r5], "UTF-8").split("[&,]");
                                            int i4 = 0;
                                            String strDecode = null;
                                            boolean z7 = false;
                                            while (i4 < strArrSplit4.length) {
                                                try {
                                                    String[] strArrSplit5 = strArrSplit4[i4].split("=");
                                                    String[] strArr2 = strArrSplit4;
                                                    int i5 = i4;
                                                    if (strArrSplit5[0].startsWith("type")) {
                                                        if (URLDecoder.decode(strArrSplit5[1], "UTF-8").contains("video/mp4")) {
                                                            z7 = true;
                                                        }
                                                    } else if (strArrSplit5[0].startsWith("url")) {
                                                        strDecode = URLDecoder.decode(strArrSplit5[1], "UTF-8");
                                                    } else if (strArrSplit5[0].startsWith("itag")) {
                                                        strDecode = null;
                                                        z7 = false;
                                                    }
                                                    if (z7 && strDecode != null) {
                                                        str5 = strDecode;
                                                        break;
                                                    }
                                                    i4 = i5 + 1;
                                                    strArrSplit4 = strArr2;
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    FileLog.e(e);
                                                }
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                        }
                                    }
                                } else if (strArrSplit[i3].startsWith("use_cipher_signature")) {
                                    String[] strArrSplit6 = strArrSplit[i3].split("=");
                                    if (strArrSplit6.length == 2 && strArrSplit6[1].toLowerCase().equals("true")) {
                                        z6 = true;
                                    }
                                } else if (strArrSplit[i3].startsWith("hlsvp")) {
                                    String[] strArrSplit7 = strArrSplit[i3].split("=");
                                    if (strArrSplit7.length == 2) {
                                        try {
                                            objDecode = URLDecoder.decode(strArrSplit7[1], "UTF-8");
                                        } catch (Exception e4) {
                                            FileLog.e(e4);
                                        }
                                    }
                                } else if (strArrSplit[i3].startsWith("livestream")) {
                                    String[] strArrSplit8 = strArrSplit[i3].split("=");
                                    if (strArrSplit8.length == 2 && strArrSplit8[1].toLowerCase().equals("1")) {
                                        z3 = true;
                                    }
                                }
                                i3++;
                                r5 = 1;
                                c = 0;
                                i2 = 2;
                            }
                            i3++;
                            r5 = 1;
                            c = 0;
                            i2 = 2;
                        }
                        z = z6;
                        str = str5;
                        r3 = objDecode;
                    } else {
                        r3 = 0;
                        z3 = false;
                        z4 = false;
                    }
                    c2 = 0;
                    c3 = 1;
                    if (z3) {
                        if (r3 == 0 || z || r3.contains("/s/")) {
                            return null;
                        }
                        ?? r6 = this.result;
                        r6[0] = r3;
                        r6[1] = "hls";
                    }
                    if (z4) {
                        break;
                    }
                    i++;
                    map = null;
                    z5 = true;
                    c = 0;
                }
            } catch (Exception e5) {
                FileLog.e(e5);
            }
            if (strDownloadUrlContent != null) {
                Matcher matcher = WebPlayerView.stsPattern.matcher(strDownloadUrlContent);
                if (matcher.find()) {
                    StringBuilder sbM = Log.m(strM, "&sts=");
                    sbM.append(strDownloadUrlContent.substring(matcher.start() + 6, matcher.end()));
                    strM = sbM.toString();
                } else {
                    strM = zzhr.m(strM, "&sts=");
                }
            }
            this.result[1] = "dash";
            strArr = new String[]{"", "&el=leanback", "&el=embedded", "&el=detailpage", "&el=vevo"};
            c = 0;
            str = null;
            z = false;
            i = 0;
            String[] strArr3 = this.result;
            if (strArr3[c2] == null && str != null) {
                strArr3[c2] = str;
                strArr3[c3] = "other";
            }
            String str6 = strArr3[c2];
            if (str6 != null && ((z || str6.contains("/s/")) && strDownloadUrlContent != null)) {
                int iIndexOf = this.result[c2].indexOf("/s/");
                int iIndexOf2 = this.result[c2].indexOf(47, iIndexOf + 10);
                if (iIndexOf == -1) {
                    obj = null;
                    z2 = true;
                } else {
                    if (iIndexOf2 == -1) {
                        iIndexOf2 = this.result[c2].length();
                    }
                    this.sig = this.result[c2].substring(iIndexOf, iIndexOf2);
                    Matcher matcher2 = WebPlayerView.jsPattern.matcher(strDownloadUrlContent);
                    if (matcher2.find()) {
                        try {
                            Object objNextValue = new JSONTokener(matcher2.group(1)).nextValue();
                            if (objNextValue instanceof String) {
                                strConcat = (String) objNextValue;
                            } else {
                                strConcat = null;
                            }
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                    } else {
                        strConcat = null;
                    }
                    if (strConcat != null) {
                        Matcher matcher3 = WebPlayerView.playerIdPattern.matcher(strConcat);
                        if (matcher3.find()) {
                            str2 = matcher3.group(1) + matcher3.group(2);
                        } else {
                            str2 = null;
                        }
                        z2 = false;
                        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("youtubecode", 0);
                        String strExtractFunction = null;
                        if (str2 != null) {
                            String string = sharedPreferences.getString(str2, null);
                            strGroup = sharedPreferences.getString(str2.concat("n"), null);
                            strExtractFunction = string;
                        } else {
                            strGroup = null;
                        }
                        if (strExtractFunction == null) {
                            if (strConcat.startsWith("//")) {
                                strConcat = "https:".concat(strConcat);
                            } else if (strConcat.startsWith("/")) {
                                strConcat = "https://www.youtube.com".concat(strConcat);
                            }
                            WebPlayerView.this.getClass();
                            obj = null;
                            String strDownloadUrlContent3 = WebPlayerView.downloadUrlContent(this, strConcat, null, true);
                            if (!isCancelled()) {
                                if (strDownloadUrlContent3 != null) {
                                    Matcher matcher4 = WebPlayerView.sigPattern.matcher(strDownloadUrlContent3);
                                    if (matcher4.find()) {
                                        strGroup = matcher4.group(1);
                                    } else {
                                        Matcher matcher5 = WebPlayerView.sigPattern2.matcher(strDownloadUrlContent3);
                                        if (matcher5.find()) {
                                            strGroup = matcher5.group(1);
                                        }
                                    }
                                    if (strGroup != null) {
                                        try {
                                            strExtractFunction = new Parser(strDownloadUrlContent3).extractFunction(strGroup);
                                            if (!TextUtils.isEmpty(strExtractFunction) && str2 != null) {
                                                sharedPreferences.edit().putString(str2, strExtractFunction).putString(str2 + "n", strGroup).commit();
                                            }
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
                                        }
                                    }
                                }
                            }
                        } else {
                            obj = null;
                        }
                        if (!TextUtils.isEmpty(strExtractFunction)) {
                            try {
                                AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda8(8, this, strExtractFunction + strGroup + "('" + this.sig.substring(3) + "');"));
                                this.countDownLatch.await();
                            } catch (Exception e8) {
                                FileLog.e(e8);
                                z2 = true;
                            }
                        }
                    } else {
                        obj = null;
                    }
                    z2 = true;
                }
                return obj;
            }
            obj = null;
            z2 = z;
            if (!isCancelled() && !z2) {
                return this.result;
            }
            return obj;
        }

        @Override
        public final void onPostExecute(Object obj) {
            String[] strArr = (String[]) obj;
            String str = strArr[0];
            WebPlayerView webPlayerView = WebPlayerView.this;
            if (str == null) {
                if (isCancelled()) {
                    return;
                }
                webPlayerView.onInitFailed();
                return;
            }
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb = new StringBuilder("start play youtube video ");
                sb.append(strArr[1]);
                sb.append(" ");
                SQLitePreparedStatement$$ExternalSyntheticOutline0.m(strArr[0], sb);
            }
            webPlayerView.initied = true;
            webPlayerView.playVideoUrl = strArr[0];
            String str2 = strArr[1];
            webPlayerView.playVideoType = str2;
            if (str2.equals("hls")) {
                webPlayerView.isStream = true;
            }
            if (webPlayerView.isAutoplay) {
                webPlayerView.preparePlayer();
            }
            webPlayerView.showProgress(false, true);
            webPlayerView.controlsView.show(true, true);
        }
    }

    public WebPlayerView(Activity activity, boolean z, WebPlayerViewDelegate webPlayerViewDelegate) {
        super(activity);
        this.allowInlineAnimation = true;
        Paint paint = new Paint();
        this.backgroundPaint = paint;
        this.progressRunnable = new AnonymousClass1(this, 0);
        this.surfaceTextureListener = new PhotoViewer.AnonymousClass8(this, 4);
        this.switchToInlineRunnable = new AnonymousClass1(this, 1);
        setWillNotDraw(false);
        this.delegate = webPlayerViewDelegate;
        paint.setColor(-16777216);
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(this, activity, 0);
        this.aspectRatioFrameLayout = anonymousClass4;
        addView(anonymousClass4, LayoutHelper.createFrame(-1, -1, 17));
        PaymentFormActivity.AnonymousClass5 anonymousClass5 = new PaymentFormActivity.AnonymousClass5(activity, activity);
        this.webView = anonymousClass5;
        anonymousClass5.addJavascriptInterface(new JavaScriptInterface(new VideoEditTextureView$$ExternalSyntheticLambda1(this, 4)), "JavaScriptInterface");
        WebSettings settings = anonymousClass5.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup textureViewContainer = webPlayerViewDelegate.getTextureViewContainer();
        this.textureViewContainer = textureViewContainer;
        TextureView textureView = new TextureView(activity);
        this.textureView = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (textureViewContainer != null) {
            textureViewContainer.addView(textureView);
        } else {
            anonymousClass4.addView(textureView, LayoutHelper.createFrame(-1, -1, 17));
        }
        if (textureViewContainer != null) {
            ImageView imageView = new ImageView(activity);
            this.textureImageView = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            textureViewContainer.addView(imageView);
        }
        VideoPlayer videoPlayer = new VideoPlayer(true, false);
        this.videoPlayer = videoPlayer;
        videoPlayer.delegate = this;
        videoPlayer.setTextureView(textureView);
        ControlsView controlsView = new ControlsView(activity);
        this.controlsView = controlsView;
        if (textureViewContainer != null) {
            textureViewContainer.addView(controlsView);
        } else {
            addView(controlsView, LayoutHelper.createFrame(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(activity, null);
        this.progressView = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, LayoutHelper.createFrame(48, 48, 17));
        ImageView imageView2 = new ImageView(activity);
        this.fullscreenButton = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        controlsView.addView(imageView2, LayoutHelper.createFrame(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        final int i = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final WebPlayerView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        WebPlayerView webPlayerView = this.f$0;
                        if (webPlayerView.initied && !webPlayerView.changingTextureView && !webPlayerView.switchingInlineMode && webPlayerView.firstFrameRendered) {
                            webPlayerView.inFullscreen = !webPlayerView.inFullscreen;
                            webPlayerView.updateFullscreenState(true);
                            break;
                        }
                        break;
                    case 1:
                        WebPlayerView webPlayerView2 = this.f$0;
                        if (webPlayerView2.initied && webPlayerView2.playVideoUrl != null) {
                            VideoPlayer videoPlayer2 = webPlayerView2.videoPlayer;
                            if (videoPlayer2.player == null) {
                                webPlayerView2.preparePlayer();
                            }
                            if (videoPlayer2.isPlaying()) {
                                videoPlayer2.pause();
                            } else {
                                webPlayerView2.isCompleted = false;
                                videoPlayer2.play();
                            }
                            webPlayerView2.updatePlayButton();
                            break;
                        }
                        break;
                    default:
                        WebPlayerView webPlayerView3 = this.f$0;
                        TextureView textureView2 = webPlayerView3.textureView;
                        if (textureView2 != null) {
                            WebPlayerView.WebPlayerViewDelegate webPlayerViewDelegate2 = webPlayerView3.delegate;
                            if (webPlayerViewDelegate2.checkInlinePermissions() && !webPlayerView3.changingTextureView && !webPlayerView3.switchingInlineMode && webPlayerView3.firstFrameRendered) {
                                webPlayerView3.switchingInlineMode = true;
                                boolean z2 = webPlayerView3.isInline;
                                boolean z3 = webPlayerView3.allowInlineAnimation;
                                WebPlayerView.AnonymousClass4 anonymousClass6 = webPlayerView3.aspectRatioFrameLayout;
                                if (!z2) {
                                    webPlayerView3.inFullscreen = false;
                                    webPlayerViewDelegate2.prepareToSwitchInlineMode(true, webPlayerView3.switchToInlineRunnable, anonymousClass6.getAspectRatio(), z3);
                                } else {
                                    ViewGroup viewGroup = (ViewGroup) anonymousClass6.getParent();
                                    if (viewGroup != webPlayerView3) {
                                        if (viewGroup != null) {
                                            viewGroup.removeView(anonymousClass6);
                                        }
                                        webPlayerView3.addView(anonymousClass6, 0, LayoutHelper.createFrame(-1, -1, 17));
                                        anonymousClass6.measure(View.MeasureSpec.makeMeasureSpec(webPlayerView3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(webPlayerView3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                    }
                                    Bitmap bitmap = webPlayerView3.currentBitmap;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        webPlayerView3.currentBitmap = null;
                                    }
                                    webPlayerView3.changingTextureView = true;
                                    webPlayerView3.isInline = false;
                                    webPlayerView3.updatePlayButton();
                                    webPlayerView3.updateFullscreenButton();
                                    webPlayerView3.updateInlineButton();
                                    textureView2.setVisibility(4);
                                    ViewGroup viewGroup2 = webPlayerView3.textureViewContainer;
                                    if (viewGroup2 != null) {
                                        viewGroup2.addView(textureView2);
                                    } else {
                                        anonymousClass6.addView(textureView2);
                                    }
                                    WebPlayerView.ControlsView controlsView2 = webPlayerView3.controlsView;
                                    ViewGroup viewGroup3 = (ViewGroup) controlsView2.getParent();
                                    if (viewGroup3 != webPlayerView3) {
                                        if (viewGroup3 != null) {
                                            viewGroup3.removeView(controlsView2);
                                        }
                                        if (viewGroup2 != null) {
                                            viewGroup2.addView(controlsView2);
                                        } else {
                                            webPlayerView3.addView(controlsView2, 1);
                                        }
                                    }
                                    controlsView2.show(false, false);
                                    webPlayerViewDelegate2.prepareToSwitchInlineMode(false, null, anonymousClass6.getAspectRatio(), z3);
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ImageView imageView3 = new ImageView(activity);
        this.playButton = imageView3;
        imageView3.setScaleType(scaleType);
        controlsView.addView(imageView3, LayoutHelper.createFrame(48, 48, 17));
        final int i2 = 1;
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final WebPlayerView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        WebPlayerView webPlayerView = this.f$0;
                        if (webPlayerView.initied && !webPlayerView.changingTextureView && !webPlayerView.switchingInlineMode && webPlayerView.firstFrameRendered) {
                            webPlayerView.inFullscreen = !webPlayerView.inFullscreen;
                            webPlayerView.updateFullscreenState(true);
                            break;
                        }
                        break;
                    case 1:
                        WebPlayerView webPlayerView2 = this.f$0;
                        if (webPlayerView2.initied && webPlayerView2.playVideoUrl != null) {
                            VideoPlayer videoPlayer2 = webPlayerView2.videoPlayer;
                            if (videoPlayer2.player == null) {
                                webPlayerView2.preparePlayer();
                            }
                            if (videoPlayer2.isPlaying()) {
                                videoPlayer2.pause();
                            } else {
                                webPlayerView2.isCompleted = false;
                                videoPlayer2.play();
                            }
                            webPlayerView2.updatePlayButton();
                            break;
                        }
                        break;
                    default:
                        WebPlayerView webPlayerView3 = this.f$0;
                        TextureView textureView2 = webPlayerView3.textureView;
                        if (textureView2 != null) {
                            WebPlayerView.WebPlayerViewDelegate webPlayerViewDelegate2 = webPlayerView3.delegate;
                            if (webPlayerViewDelegate2.checkInlinePermissions() && !webPlayerView3.changingTextureView && !webPlayerView3.switchingInlineMode && webPlayerView3.firstFrameRendered) {
                                webPlayerView3.switchingInlineMode = true;
                                boolean z2 = webPlayerView3.isInline;
                                boolean z3 = webPlayerView3.allowInlineAnimation;
                                WebPlayerView.AnonymousClass4 anonymousClass6 = webPlayerView3.aspectRatioFrameLayout;
                                if (!z2) {
                                    webPlayerView3.inFullscreen = false;
                                    webPlayerViewDelegate2.prepareToSwitchInlineMode(true, webPlayerView3.switchToInlineRunnable, anonymousClass6.getAspectRatio(), z3);
                                } else {
                                    ViewGroup viewGroup = (ViewGroup) anonymousClass6.getParent();
                                    if (viewGroup != webPlayerView3) {
                                        if (viewGroup != null) {
                                            viewGroup.removeView(anonymousClass6);
                                        }
                                        webPlayerView3.addView(anonymousClass6, 0, LayoutHelper.createFrame(-1, -1, 17));
                                        anonymousClass6.measure(View.MeasureSpec.makeMeasureSpec(webPlayerView3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(webPlayerView3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                    }
                                    Bitmap bitmap = webPlayerView3.currentBitmap;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        webPlayerView3.currentBitmap = null;
                                    }
                                    webPlayerView3.changingTextureView = true;
                                    webPlayerView3.isInline = false;
                                    webPlayerView3.updatePlayButton();
                                    webPlayerView3.updateFullscreenButton();
                                    webPlayerView3.updateInlineButton();
                                    textureView2.setVisibility(4);
                                    ViewGroup viewGroup2 = webPlayerView3.textureViewContainer;
                                    if (viewGroup2 != null) {
                                        viewGroup2.addView(textureView2);
                                    } else {
                                        anonymousClass6.addView(textureView2);
                                    }
                                    WebPlayerView.ControlsView controlsView2 = webPlayerView3.controlsView;
                                    ViewGroup viewGroup3 = (ViewGroup) controlsView2.getParent();
                                    if (viewGroup3 != webPlayerView3) {
                                        if (viewGroup3 != null) {
                                            viewGroup3.removeView(controlsView2);
                                        }
                                        if (viewGroup2 != null) {
                                            viewGroup2.addView(controlsView2);
                                        } else {
                                            webPlayerView3.addView(controlsView2, 1);
                                        }
                                    }
                                    controlsView2.show(false, false);
                                    webPlayerViewDelegate2.prepareToSwitchInlineMode(false, null, anonymousClass6.getAspectRatio(), z3);
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        });
        if (z) {
            ImageView imageView4 = new ImageView(activity);
            this.inlineButton = imageView4;
            imageView4.setScaleType(scaleType);
            controlsView.addView(imageView4, LayoutHelper.createFrame(56, 48, 53));
            final int i3 = 2;
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final WebPlayerView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            WebPlayerView webPlayerView = this.f$0;
                            if (webPlayerView.initied && !webPlayerView.changingTextureView && !webPlayerView.switchingInlineMode && webPlayerView.firstFrameRendered) {
                                webPlayerView.inFullscreen = !webPlayerView.inFullscreen;
                                webPlayerView.updateFullscreenState(true);
                                break;
                            }
                            break;
                        case 1:
                            WebPlayerView webPlayerView2 = this.f$0;
                            if (webPlayerView2.initied && webPlayerView2.playVideoUrl != null) {
                                VideoPlayer videoPlayer2 = webPlayerView2.videoPlayer;
                                if (videoPlayer2.player == null) {
                                    webPlayerView2.preparePlayer();
                                }
                                if (videoPlayer2.isPlaying()) {
                                    videoPlayer2.pause();
                                } else {
                                    webPlayerView2.isCompleted = false;
                                    videoPlayer2.play();
                                }
                                webPlayerView2.updatePlayButton();
                                break;
                            }
                            break;
                        default:
                            WebPlayerView webPlayerView3 = this.f$0;
                            TextureView textureView2 = webPlayerView3.textureView;
                            if (textureView2 != null) {
                                WebPlayerView.WebPlayerViewDelegate webPlayerViewDelegate2 = webPlayerView3.delegate;
                                if (webPlayerViewDelegate2.checkInlinePermissions() && !webPlayerView3.changingTextureView && !webPlayerView3.switchingInlineMode && webPlayerView3.firstFrameRendered) {
                                    webPlayerView3.switchingInlineMode = true;
                                    boolean z2 = webPlayerView3.isInline;
                                    boolean z3 = webPlayerView3.allowInlineAnimation;
                                    WebPlayerView.AnonymousClass4 anonymousClass6 = webPlayerView3.aspectRatioFrameLayout;
                                    if (!z2) {
                                        webPlayerView3.inFullscreen = false;
                                        webPlayerViewDelegate2.prepareToSwitchInlineMode(true, webPlayerView3.switchToInlineRunnable, anonymousClass6.getAspectRatio(), z3);
                                    } else {
                                        ViewGroup viewGroup = (ViewGroup) anonymousClass6.getParent();
                                        if (viewGroup != webPlayerView3) {
                                            if (viewGroup != null) {
                                                viewGroup.removeView(anonymousClass6);
                                            }
                                            webPlayerView3.addView(anonymousClass6, 0, LayoutHelper.createFrame(-1, -1, 17));
                                            anonymousClass6.measure(View.MeasureSpec.makeMeasureSpec(webPlayerView3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(webPlayerView3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                        }
                                        Bitmap bitmap = webPlayerView3.currentBitmap;
                                        if (bitmap != null) {
                                            bitmap.recycle();
                                            webPlayerView3.currentBitmap = null;
                                        }
                                        webPlayerView3.changingTextureView = true;
                                        webPlayerView3.isInline = false;
                                        webPlayerView3.updatePlayButton();
                                        webPlayerView3.updateFullscreenButton();
                                        webPlayerView3.updateInlineButton();
                                        textureView2.setVisibility(4);
                                        ViewGroup viewGroup2 = webPlayerView3.textureViewContainer;
                                        if (viewGroup2 != null) {
                                            viewGroup2.addView(textureView2);
                                        } else {
                                            anonymousClass6.addView(textureView2);
                                        }
                                        WebPlayerView.ControlsView controlsView2 = webPlayerView3.controlsView;
                                        ViewGroup viewGroup3 = (ViewGroup) controlsView2.getParent();
                                        if (viewGroup3 != webPlayerView3) {
                                            if (viewGroup3 != null) {
                                                viewGroup3.removeView(controlsView2);
                                            }
                                            if (viewGroup2 != null) {
                                                viewGroup2.addView(controlsView2);
                                            } else {
                                                webPlayerView3.addView(controlsView2, 1);
                                            }
                                        }
                                        controlsView2.show(false, false);
                                        webPlayerViewDelegate2.prepareToSwitchInlineMode(false, null, anonymousClass6.getAspectRatio(), z3);
                                    }
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        updatePlayButton();
        updateFullscreenButton();
        updateInlineButton();
    }

    public static boolean canHandleUrl(String str) {
        if (str == null) {
            return false;
        }
        if (str.endsWith(".mp4")) {
            return true;
        }
        try {
            Matcher matcher = youtubeIdRegex.matcher(str);
            if ((matcher.find() ? matcher.group(1) : null) != null) {
                return true;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            Matcher matcher2 = vimeoIdRegex.matcher(str);
            if ((matcher2.find() ? matcher2.group(3) : null) != null) {
                return true;
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        try {
            Matcher matcher3 = aparatIdRegex.matcher(str);
            if ((matcher3.find() ? matcher3.group(1) : null) != null) {
                return true;
            }
        } catch (Exception e3) {
            FileLog.e(e3);
        }
        try {
            Matcher matcher4 = twitchClipIdRegex.matcher(str);
            if ((matcher4.find() ? matcher4.group(1) : null) != null) {
                return true;
            }
        } catch (Exception e4) {
            FileLog.e(e4);
        }
        try {
            Matcher matcher5 = twitchStreamIdRegex.matcher(str);
            if ((matcher5.find() ? matcher5.group(1) : null) != null) {
                return true;
            }
        } catch (Exception e5) {
            FileLog.e(e5);
        }
        try {
            Matcher matcher6 = coubIdRegex.matcher(str);
            return (matcher6.find() ? matcher6.group(1) : null) != null;
        } catch (Exception e6) {
            FileLog.e(e6);
            return false;
        }
    }

    public static String downloadUrlContent(AsyncTask asyncTask, String str, HashMap map, boolean z) {
        URLConnection uRLConnectionOpenConnection;
        boolean z2;
        InputStream inputStream;
        StringBuilder sb;
        boolean z3;
        InputStream inputStream2;
        boolean z4 = true;
        try {
            URL url = new URL(str);
            uRLConnectionOpenConnection = url.openConnection();
            try {
                uRLConnectionOpenConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
                if (z) {
                    uRLConnectionOpenConnection.addRequestProperty("Accept-Encoding", "gzip, deflate");
                }
                uRLConnectionOpenConnection.addRequestProperty("Accept-Language", "en-us,en;q=0.5");
                uRLConnectionOpenConnection.addRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
                uRLConnectionOpenConnection.addRequestProperty("Accept-Charset", "ISO-8859-1,utf-8;q=0.7,*;q=0.7");
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        uRLConnectionOpenConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                uRLConnectionOpenConnection.setConnectTimeout(5000);
                uRLConnectionOpenConnection.setReadTimeout(5000);
                if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setInstanceFollowRedirects(true);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 302 || responseCode == 301 || responseCode == 303) {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        String headerField2 = httpURLConnection.getHeaderField("Set-Cookie");
                        url = new URL(headerField);
                        uRLConnectionOpenConnection = url.openConnection();
                        uRLConnectionOpenConnection.setRequestProperty("Cookie", headerField2);
                        uRLConnectionOpenConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
                        if (z) {
                            uRLConnectionOpenConnection.addRequestProperty("Accept-Encoding", "gzip, deflate");
                        }
                        uRLConnectionOpenConnection.addRequestProperty("Accept-Language", "en-us,en;q=0.5");
                        uRLConnectionOpenConnection.addRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
                        uRLConnectionOpenConnection.addRequestProperty("Accept-Charset", "ISO-8859-1,utf-8;q=0.7,*;q=0.7");
                        if (map != null) {
                            for (Map.Entry entry2 : map.entrySet()) {
                                uRLConnectionOpenConnection.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                            }
                        }
                    }
                }
                uRLConnectionOpenConnection.connect();
                if (z) {
                    try {
                        inputStream2 = new GZIPInputStream(uRLConnectionOpenConnection.getInputStream());
                    } catch (Exception unused) {
                        uRLConnectionOpenConnection = url.openConnection();
                        uRLConnectionOpenConnection.connect();
                        inputStream2 = uRLConnectionOpenConnection.getInputStream();
                    }
                } else {
                    inputStream2 = uRLConnectionOpenConnection.getInputStream();
                }
                inputStream = inputStream2;
                z2 = true;
            } catch (Throwable th) {
                th = th;
                boolean z5 = !(th instanceof SocketTimeoutException) ? !(!(th instanceof UnknownHostException) && (!(th instanceof SocketException) ? (th instanceof FileNotFoundException) : !(th.getMessage() == null || !th.getMessage().contains("ECONNRESET")))) : ApplicationLoader.isNetworkOnline();
                FileLog.e(th);
                z2 = z5;
                inputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            uRLConnectionOpenConnection = null;
        }
        if (z2) {
            try {
                if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                    ((HttpURLConnection) uRLConnectionOpenConnection).getResponseCode();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (inputStream != null) {
                try {
                    byte[] bArr = new byte[32768];
                    sb = null;
                    while (true) {
                        try {
                            if (!asyncTask.isCancelled()) {
                                try {
                                    int i = inputStream.read(bArr);
                                    if (i <= 0) {
                                        if (i == -1) {
                                            break;
                                        }
                                        break;
                                    }
                                    if (sb == null) {
                                        sb = new StringBuilder();
                                    }
                                    try {
                                        try {
                                            sb.append(new String(bArr, 0, i, "UTF-8"));
                                        } catch (Exception e2) {
                                            e = e2;
                                            FileLog.e(e);
                                            z4 = false;
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Throwable th3) {
                                                    FileLog.e(th3);
                                                }
                                            }
                                            z3 = z4;
                                            if (z3) {
                                                return sb.toString();
                                            }
                                            return null;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        FileLog.e(th);
                                        z4 = false;
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        z3 = z4;
                                        if (z3) {
                                            return sb.toString();
                                        }
                                        return null;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    sb = null;
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                z3 = z4;
            } else {
                sb = null;
            }
            z4 = false;
            if (inputStream != null) {
                inputStream.close();
            }
            z3 = z4;
        } else {
            sb = null;
            z3 = false;
        }
        if (z3) {
            return sb.toString();
        }
        return null;
    }

    private View getControlView() {
        return this.controlsView;
    }

    public static String getCoubId(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Matcher matcher = coubIdRegex.matcher(str);
            String strGroup = matcher.find() ? matcher.group(1) : null;
            if (strGroup != null) {
                return strGroup;
            }
            return null;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private View getProgressView() {
        return this.progressView;
    }

    public final void destroy() {
        this.videoPlayer.releasePlayer();
        AsyncTask asyncTask = this.currentTask;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.currentTask = null;
        }
        this.webView.stopLoading();
    }

    public View getAspectRatioView() {
        return this.aspectRatioFrameLayout;
    }

    public View getControlsView() {
        return this.controlsView;
    }

    public ImageView getTextureImageView() {
        return this.textureImageView;
    }

    public TextureView getTextureView() {
        return this.textureView;
    }

    public String getYoutubeId() {
        return this.currentYoutubeId;
    }

    public final boolean loadVideo(String str, TLRPC.Photo photo, Object obj, String str2, boolean z) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        AsyncTask asyncTask;
        ControlsView controlsView;
        char c;
        AnimatorSet animatorSet;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        Matcher matcher;
        String strGroup;
        String coubId = getCoubId(str);
        if (coubId == null) {
            coubId = getCoubId(str2);
        }
        this.seekToTime = -1;
        if (coubId == null && str != null) {
            if (str.endsWith(".mp4")) {
                str3 = str;
                str4 = null;
            } else {
                try {
                    if (str2 != null) {
                        try {
                            Uri uri = Uri.parse(str2);
                            String queryParameter = uri.getQueryParameter("t");
                            if (queryParameter == null) {
                                queryParameter = uri.getQueryParameter("time_continue");
                            }
                            if (queryParameter != null) {
                                if (queryParameter.contains("m")) {
                                    String[] strArrSplit = queryParameter.split("m");
                                    this.seekToTime = (Utilities.parseInt((CharSequence) strArrSplit[0]).intValue() * 60) + Utilities.parseInt((CharSequence) strArrSplit[1]).intValue();
                                } else {
                                    this.seekToTime = Utilities.parseInt((CharSequence) queryParameter).intValue();
                                }
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        matcher = youtubeIdRegex.matcher(str);
                        if (matcher.find()) {
                            strGroup = matcher.group(1);
                        } else {
                            strGroup = null;
                        }
                        if (strGroup != null) {
                            str4 = strGroup;
                        } else {
                            str4 = null;
                        }
                    } else {
                        matcher = youtubeIdRegex.matcher(str);
                        if (matcher.find()) {
                            strGroup = matcher.group(1);
                        } else {
                            strGroup = null;
                        }
                        if (strGroup != null) {
                            str4 = strGroup;
                        } else {
                            str4 = null;
                        }
                    }
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                if (str4 == null) {
                    try {
                        Matcher matcher2 = vimeoIdRegex.matcher(str);
                        String strGroup2 = matcher2.find() ? matcher2.group(3) : null;
                        if (strGroup2 != null) {
                            str8 = strGroup2;
                        } else {
                            str8 = null;
                        }
                    } catch (Exception e3) {
                        FileLog.e(e3);
                    }
                } else {
                    str8 = null;
                }
                if (str8 == null) {
                    try {
                        Matcher matcher3 = aparatIdRegex.matcher(str);
                        String strGroup3 = matcher3.find() ? matcher3.group(1) : null;
                        if (strGroup3 != null) {
                            str7 = strGroup3;
                        } else {
                            str7 = null;
                        }
                    } catch (Exception e4) {
                        FileLog.e(e4);
                    }
                } else {
                    str7 = null;
                }
                if (str7 == null) {
                    try {
                        Matcher matcher4 = twitchClipIdRegex.matcher(str);
                        String strGroup4 = matcher4.find() ? matcher4.group(1) : null;
                        if (strGroup4 != null) {
                            str6 = strGroup4;
                        } else {
                            str6 = null;
                        }
                    } catch (Exception e5) {
                        FileLog.e(e5);
                    }
                } else {
                    str6 = null;
                }
                if (str6 == null) {
                    try {
                        Matcher matcher5 = twitchStreamIdRegex.matcher(str);
                        String strGroup5 = matcher5.find() ? matcher5.group(1) : null;
                        if (strGroup5 != null) {
                            str5 = strGroup5;
                        } else {
                            str5 = null;
                        }
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                } else {
                    str5 = null;
                }
                if (str5 == null) {
                    try {
                        Matcher matcher6 = coubIdRegex.matcher(str);
                        String strGroup6 = matcher6.find() ? matcher6.group(1) : null;
                        if (strGroup6 != null) {
                            coubId = strGroup6;
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                str3 = null;
            }
            this.initied = false;
            this.isCompleted = false;
            this.isAutoplay = z;
            this.playVideoUrl = null;
            this.playAudioUrl = null;
            destroy();
            this.firstFrameRendered = false;
            this.currentAlpha = 1.0f;
            asyncTask = this.currentTask;
            if (asyncTask != null) {
                asyncTask.cancel(true);
                this.currentTask = null;
            }
            updateFullscreenButton();
            updateInlineButton();
            updatePlayButton();
            controlsView = this.controlsView;
            if (photo != null) {
                c = 2;
                closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 80, true);
                if (closestPhotoSizeWithSize != null) {
                    controlsView.imageReceiver.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "80_80_b", 0L, null, obj, 1);
                    this.drawImage = true;
                }
            } else {
                c = 2;
                this.drawImage = false;
            }
            animatorSet = this.progressAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.progressAnimation = null;
            }
            controlsView.setProgress(0);
            if (str4 != null) {
                this.currentYoutubeId = str4;
                str4 = null;
            }
            if (str3 != null) {
                this.initied = true;
                this.playVideoUrl = str3;
                this.playVideoType = "other";
                if (this.isAutoplay) {
                    preparePlayer();
                }
                showProgress(false, false);
                controlsView.show(true, true);
            } else {
                if (str4 != null) {
                    YoutubeVideoTask youtubeVideoTask = new YoutubeVideoTask(str4);
                    Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
                    Void[] voidArr = new Void[3];
                    voidArr[0] = null;
                    voidArr[1] = null;
                    voidArr[c] = null;
                    youtubeVideoTask.executeOnExecutor(executor, voidArr);
                    this.currentTask = youtubeVideoTask;
                } else if (str8 != null) {
                    CoubVideoTask coubVideoTask = new CoubVideoTask(this, str8, 4);
                    Executor executor2 = AsyncTask.THREAD_POOL_EXECUTOR;
                    Void[] voidArr2 = new Void[3];
                    voidArr2[0] = null;
                    voidArr2[1] = null;
                    voidArr2[c] = null;
                    coubVideoTask.executeOnExecutor(executor2, voidArr2);
                    this.currentTask = coubVideoTask;
                } else if (coubId != null) {
                    CoubVideoTask coubVideoTask2 = new CoubVideoTask(this, coubId, 0);
                    Executor executor3 = AsyncTask.THREAD_POOL_EXECUTOR;
                    Void[] voidArr3 = new Void[3];
                    voidArr3[0] = null;
                    voidArr3[1] = null;
                    voidArr3[c] = null;
                    coubVideoTask2.executeOnExecutor(executor3, voidArr3);
                    this.currentTask = coubVideoTask2;
                    this.isStream = true;
                } else if (str7 != null) {
                    CoubVideoTask coubVideoTask3 = new CoubVideoTask(this, str7, 1);
                    Executor executor4 = AsyncTask.THREAD_POOL_EXECUTOR;
                    Void[] voidArr4 = new Void[3];
                    voidArr4[0] = null;
                    voidArr4[1] = null;
                    voidArr4[c] = null;
                    coubVideoTask3.executeOnExecutor(executor4, voidArr4);
                    this.currentTask = coubVideoTask3;
                } else if (str6 != null) {
                    CoubVideoTask coubVideoTask4 = new CoubVideoTask(this, str, 2);
                    coubVideoTask4.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    this.currentTask = coubVideoTask4;
                } else if (str5 != null) {
                    CoubVideoTask coubVideoTask5 = new CoubVideoTask(this, str5, 3);
                    coubVideoTask5.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    this.currentTask = coubVideoTask5;
                    this.isStream = true;
                }
                controlsView.show(false, false);
                showProgress(true, false);
            }
            if (str4 != null && str8 == null && coubId == null && str7 == null && str3 == null && str6 == null && str5 == null) {
                controlsView.setVisibility(8);
                return false;
            }
            controlsView.setVisibility(0);
            return true;
        }
        str3 = null;
        str4 = null;
        str8 = str4;
        str7 = str8;
        str6 = str7;
        str5 = str6;
        this.initied = false;
        this.isCompleted = false;
        this.isAutoplay = z;
        this.playVideoUrl = null;
        this.playAudioUrl = null;
        destroy();
        this.firstFrameRendered = false;
        this.currentAlpha = 1.0f;
        asyncTask = this.currentTask;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.currentTask = null;
        }
        updateFullscreenButton();
        updateInlineButton();
        updatePlayButton();
        controlsView = this.controlsView;
        if (photo != null) {
            c = 2;
            closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 80, true);
            if (closestPhotoSizeWithSize != null) {
                controlsView.imageReceiver.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "80_80_b", 0L, null, obj, 1);
                this.drawImage = true;
            }
        } else {
            c = 2;
            this.drawImage = false;
        }
        animatorSet = this.progressAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.progressAnimation = null;
        }
        controlsView.setProgress(0);
        if (str4 != null) {
            this.currentYoutubeId = str4;
            str4 = null;
        }
        if (str3 != null) {
            this.initied = true;
            this.playVideoUrl = str3;
            this.playVideoType = "other";
            if (this.isAutoplay) {
                preparePlayer();
            }
            showProgress(false, false);
            controlsView.show(true, true);
        } else {
            if (str4 != null) {
                YoutubeVideoTask youtubeVideoTask2 = new YoutubeVideoTask(str4);
                Executor executor5 = AsyncTask.THREAD_POOL_EXECUTOR;
                Void[] voidArr5 = new Void[3];
                voidArr5[0] = null;
                voidArr5[1] = null;
                voidArr5[c] = null;
                youtubeVideoTask2.executeOnExecutor(executor5, voidArr5);
                this.currentTask = youtubeVideoTask2;
            } else if (str8 != null) {
                CoubVideoTask coubVideoTask6 = new CoubVideoTask(this, str8, 4);
                Executor executor6 = AsyncTask.THREAD_POOL_EXECUTOR;
                Void[] voidArr6 = new Void[3];
                voidArr6[0] = null;
                voidArr6[1] = null;
                voidArr6[c] = null;
                coubVideoTask6.executeOnExecutor(executor6, voidArr6);
                this.currentTask = coubVideoTask6;
            } else if (coubId != null) {
                CoubVideoTask coubVideoTask7 = new CoubVideoTask(this, coubId, 0);
                Executor executor7 = AsyncTask.THREAD_POOL_EXECUTOR;
                Void[] voidArr7 = new Void[3];
                voidArr7[0] = null;
                voidArr7[1] = null;
                voidArr7[c] = null;
                coubVideoTask7.executeOnExecutor(executor7, voidArr7);
                this.currentTask = coubVideoTask7;
                this.isStream = true;
            } else if (str7 != null) {
                CoubVideoTask coubVideoTask8 = new CoubVideoTask(this, str7, 1);
                Executor executor8 = AsyncTask.THREAD_POOL_EXECUTOR;
                Void[] voidArr8 = new Void[3];
                voidArr8[0] = null;
                voidArr8[1] = null;
                voidArr8[c] = null;
                coubVideoTask8.executeOnExecutor(executor8, voidArr8);
                this.currentTask = coubVideoTask8;
            } else if (str6 != null) {
                CoubVideoTask coubVideoTask9 = new CoubVideoTask(this, str, 2);
                coubVideoTask9.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                this.currentTask = coubVideoTask9;
            } else if (str5 != null) {
                CoubVideoTask coubVideoTask10 = new CoubVideoTask(this, str5, 3);
                coubVideoTask10.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                this.currentTask = coubVideoTask10;
                this.isStream = true;
            }
            controlsView.show(false, false);
            showProgress(true, false);
        }
        if (str4 != null) {
        }
        controlsView.setVisibility(0);
        return true;
    }

    @Override
    public final void onAudioFocusChange(int i) {
        AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda17(this, i, 10));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.backgroundPaint);
    }

    @Override
    public final void onError(VideoPlayer videoPlayer, Exception exc) {
        FileLog.e(exc);
        onInitFailed();
    }

    public final void onInitFailed() {
        ControlsView controlsView = this.controlsView;
        if (controlsView.getParent() != this) {
            controlsView.setVisibility(8);
        }
        this.delegate.onInitFailed();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        AnonymousClass4 anonymousClass4 = this.aspectRatioFrameLayout;
        int measuredWidth = (i5 - anonymousClass4.getMeasuredWidth()) / 2;
        int i6 = i4 - i2;
        int iDp = ((i6 - AndroidUtilities.dp(10.0f)) - anonymousClass4.getMeasuredHeight()) / 2;
        anonymousClass4.layout(measuredWidth, iDp, anonymousClass4.getMeasuredWidth() + measuredWidth, anonymousClass4.getMeasuredHeight() + iDp);
        ControlsView controlsView = this.controlsView;
        if (controlsView.getParent() == this) {
            controlsView.layout(0, 0, controlsView.getMeasuredWidth(), controlsView.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.progressView;
        int measuredWidth2 = (i5 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i6 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        controlsView.imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.aspectRatioFrameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        ControlsView controlsView = this.controlsView;
        if (controlsView.getParent() == this) {
            controlsView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.progressView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime) {
    }

    @Override
    public final void onSeekFinished(AnalyticsListener.EventTime eventTime) {
    }

    @Override
    public final void onSeekStarted(AnalyticsListener.EventTime eventTime) {
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        ControlsView controlsView = this.controlsView;
        VideoPlayer videoPlayer = this.videoPlayer;
        if (i != 2) {
            if (videoPlayer.getDuration() != -9223372036854775807L) {
                controlsView.setDuration((int) (videoPlayer.getDuration() / 1000));
            } else {
                controlsView.setDuration(0);
            }
        }
        WebPlayerViewDelegate webPlayerViewDelegate = this.delegate;
        if (i == 4 || i == 1 || !videoPlayer.isPlaying()) {
            webPlayerViewDelegate.onPlayStateChanged(this, false);
        } else {
            webPlayerViewDelegate.onPlayStateChanged(this, true);
        }
        if (videoPlayer.isPlaying() && i != 4) {
            updatePlayButton();
            return;
        }
        if (i == 4) {
            this.isCompleted = true;
            videoPlayer.pause();
            videoPlayer.seekTo(0L, false);
            updatePlayButton();
            controlsView.show(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.changingTextureView) {
            this.changingTextureView = false;
            if (this.inFullscreen || this.isInline) {
                if (this.isInline) {
                    this.waitingForFirstTextureUpload = 1;
                }
                this.changedTextureView.setSurfaceTexture(surfaceTexture);
                this.changedTextureView.setSurfaceTextureListener(this.surfaceTextureListener);
                this.changedTextureView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.waitingForFirstTextureUpload == 2) {
            ImageView imageView = this.textureImageView;
            if (imageView != null) {
                imageView.setVisibility(4);
                imageView.setImageDrawable(null);
                Bitmap bitmap = this.currentBitmap;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.currentBitmap = null;
                }
            }
            this.switchingInlineMode = false;
            int i = this.videoWidth;
            int i2 = this.videoHeight;
            this.aspectRatioFrameLayout.getVideoRotation();
            this.delegate.onSwitchInlineMode(this.controlsView, false, i, i2, this.allowInlineAnimation);
            this.waitingForFirstTextureUpload = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        AnonymousClass4 anonymousClass4 = this.aspectRatioFrameLayout;
        if (anonymousClass4 != null) {
            if (i3 != 90 && i3 != 270) {
                i2 = i;
                i = i2;
            }
            float f2 = i2 * f;
            this.videoWidth = (int) f2;
            this.videoHeight = i;
            float f3 = i == 0 ? 1.0f : f2 / i;
            anonymousClass4.setAspectRatio(f3, i3);
            if (this.inFullscreen) {
                this.delegate.onVideoSizeChanged(f3, i3);
            }
        }
    }

    public final void preparePlayer() {
        String str = this.playVideoUrl;
        if (str == null) {
            return;
        }
        String str2 = this.playAudioUrl;
        VideoPlayer videoPlayer = this.videoPlayer;
        if (str2 != null) {
            videoPlayer.preparePlayerLoop(Uri.parse(str), this.playVideoType, Uri.parse(this.playAudioUrl), this.playAudioType);
        } else {
            videoPlayer.preparePlayer(Uri.parse(str), this.playVideoType, 0L);
        }
        videoPlayer.setPlayWhenReady(this.isAutoplay);
        long duration = videoPlayer.getDuration();
        ControlsView controlsView = this.controlsView;
        if (duration != -9223372036854775807L) {
            controlsView.setDuration((int) (videoPlayer.getDuration() / 1000));
        } else {
            controlsView.setDuration(0);
        }
        updateFullscreenButton();
        updateInlineButton();
        controlsView.invalidate();
        int i = this.seekToTime;
        if (i != -1) {
            videoPlayer.seekTo(i * 1000, false);
        }
    }

    public final void showProgress(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.progressView;
        if (!z2) {
            radialProgressView.setAlpha(z ? 1.0f : 0.0f);
            return;
        }
        AnimatorSet animatorSet = this.progressAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.progressAnimation = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", z ? 1.0f : 0.0f));
        this.progressAnimation.setDuration(150L);
        this.progressAnimation.addListener(new Tooltip.AnonymousClass1(this, 20));
        this.progressAnimation.start();
    }

    public final void updateFullscreenButton() {
        ExoPlayerImpl exoPlayerImpl = this.videoPlayer.player;
        ImageView imageView = this.fullscreenButton;
        if (exoPlayerImpl == null || this.isInline) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        if (this.inFullscreen) {
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(LayoutHelper.createFrame(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
        } else {
            imageView.setImageResource(R.drawable.ic_gofullscreen);
            imageView.setLayoutParams(LayoutHelper.createFrame(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        }
    }

    public final void updateFullscreenState(boolean z) {
        ViewGroup viewGroup;
        TextureView textureView = this.textureView;
        if (textureView == null) {
            return;
        }
        updateFullscreenButton();
        ViewGroup viewGroup2 = this.textureViewContainer;
        AnonymousClass4 anonymousClass4 = this.aspectRatioFrameLayout;
        if (viewGroup2 != null) {
            if (this.inFullscreen) {
                ViewGroup viewGroup3 = (ViewGroup) anonymousClass4.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(anonymousClass4);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) anonymousClass4.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(anonymousClass4);
                    }
                    addView(anonymousClass4, 0);
                }
            }
            this.delegate.onSwitchToFullscreen(this.controlsView, this.inFullscreen, anonymousClass4.getAspectRatio(), anonymousClass4.getVideoRotation(), z);
            return;
        }
        this.changingTextureView = true;
        if (!this.inFullscreen) {
            if (viewGroup2 != null) {
                viewGroup2.addView(textureView);
            } else {
                anonymousClass4.addView(textureView);
            }
        }
        boolean z2 = this.inFullscreen;
        ControlsView controlsView = this.controlsView;
        if (z2) {
            ViewGroup viewGroup5 = (ViewGroup) controlsView.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(controlsView);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) controlsView.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(controlsView);
                }
                if (viewGroup2 != null) {
                    viewGroup2.addView(controlsView);
                } else {
                    addView(controlsView, 1);
                }
            }
        }
        TextureView textureViewOnSwitchToFullscreen = this.delegate.onSwitchToFullscreen(this.controlsView, this.inFullscreen, anonymousClass4.getAspectRatio(), anonymousClass4.getVideoRotation(), z);
        this.changedTextureView = textureViewOnSwitchToFullscreen;
        textureViewOnSwitchToFullscreen.setVisibility(4);
        if (this.inFullscreen && this.changedTextureView != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(textureView);
        }
        int i = ControlsView.$r8$clinit;
        controlsView.checkNeedHide();
    }

    public final void updateInlineButton() {
        ImageView imageView = this.inlineButton;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(this.isInline ? R.drawable.ic_goinline : R.drawable.ic_outinline);
        imageView.setVisibility(this.videoPlayer.player != null ? 0 : 8);
        if (this.isInline) {
            imageView.setLayoutParams(LayoutHelper.createFrame(40, 40, 53));
        } else {
            imageView.setLayoutParams(LayoutHelper.createFrame(56, 50, 53));
        }
    }

    public final void updatePlayButton() {
        ControlsView controlsView = this.controlsView;
        int i = ControlsView.$r8$clinit;
        controlsView.checkNeedHide();
        AndroidUtilities.cancelRunOnUIThread(this.progressRunnable);
        if (!this.videoPlayer.isPlaying()) {
            if (this.isCompleted) {
                this.playButton.setImageResource(this.isInline ? R.drawable.ic_againinline : R.drawable.ic_again);
                return;
            } else {
                this.playButton.setImageResource(this.isInline ? R.drawable.ic_playinline : R.drawable.ic_play);
                return;
            }
        }
        this.playButton.setImageResource(this.isInline ? R.drawable.ic_pauseinline : R.drawable.ic_pause);
        AndroidUtilities.runOnUIThread(this.progressRunnable, 500L);
        if (this.hasAudioFocus) {
            return;
        }
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
        this.hasAudioFocus = true;
        audioManager.requestAudioFocus(this, 3, 1);
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.firstFrameRendered = true;
        this.lastUpdateTime = System.currentTimeMillis();
        this.controlsView.invalidate();
    }
}
