package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
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
import android.util.Base64;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_language_id_common.zzhp;
import com.google.android.gms.internal.mlkit_language_id_common.zzir;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
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
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public class WebPlayerView extends ViewGroup implements VideoPlayer.VideoPlayerDelegate, AudioManager.OnAudioFocusChangeListener {
    private static final int AUDIO_FOCUSED = 2;
    private static final int AUDIO_NO_FOCUS_CAN_DUCK = 1;
    private static final int AUDIO_NO_FOCUS_NO_DUCK = 0;
    private static final String exprName = "[a-zA-Z_$][a-zA-Z_$0-9]*";
    private static int lastContainerId = 4001;
    private boolean allowInlineAnimation;
    private AspectRatioFrameLayout aspectRatioFrameLayout;
    private int audioFocus;
    private Paint backgroundPaint;
    private TextureView changedTextureView;
    private boolean changingTextureView;
    private ControlsView controlsView;
    private float currentAlpha;
    private Bitmap currentBitmap;
    private AsyncTask currentTask;
    private String currentYoutubeId;
    private WebPlayerViewDelegate delegate;
    private boolean drawImage;
    private boolean firstFrameRendered;
    private int fragment_container_id;
    private ImageView fullscreenButton;
    private boolean hasAudioFocus;
    private boolean inFullscreen;
    private boolean initFailed;
    private boolean initied;
    private ImageView inlineButton;
    private String interfaceName;
    private boolean isAutoplay;
    private boolean isCompleted;
    private boolean isInline;
    private boolean isLoading;
    private boolean isStream;
    private long lastUpdateTime;
    private String playAudioType;
    private String playAudioUrl;
    private ImageView playButton;
    private String playVideoType;
    private String playVideoUrl;
    private AnimatorSet progressAnimation;
    private Runnable progressRunnable;
    private RadialProgressView progressView;
    private boolean resumeAudioOnFocusGain;
    private int seekToTime;
    private ImageView shareButton;
    private TextureView.SurfaceTextureListener surfaceTextureListener;
    private Runnable switchToInlineRunnable;
    private boolean switchingInlineMode;
    private ImageView textureImageView;
    private TextureView textureView;
    private ViewGroup textureViewContainer;
    private int videoHeight;
    private VideoPlayer videoPlayer;
    private int videoWidth;
    private int waitingForFirstTextureUpload;
    private WebView webView;
    private static final Pattern youtubeIdRegex = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    private static final Pattern vimeoIdRegex = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    private static final Pattern coubIdRegex = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    private static final Pattern aparatIdRegex = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    private static final Pattern twitchClipIdRegex = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    private static final Pattern twitchStreamIdRegex = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    private static final Pattern aparatFileListPattern = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    private static final Pattern twitchClipFilePattern = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    private static final Pattern stsPattern = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    private static final Pattern jsPattern = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    private static final Pattern sigPattern = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    private static final Pattern sigPattern2 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    private static final Pattern stmtVarPattern = Pattern.compile("var\\s");
    private static final Pattern stmtReturnPattern = Pattern.compile("return(?:\\s+|$)");
    private static final Pattern exprParensPattern = Pattern.compile("[()]");
    private static final Pattern playerIdPattern = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public class AparatVideoTask extends AsyncTask<Void, Void, String> {
        private boolean canRetry = true;
        private String[] results = new String[2];
        private String videoId;

        public AparatVideoTask(String str) {
            this.videoId = str;
        }

        @Override
        public String doInBackground(Void... voidArr) {
            WebPlayerView webPlayerView = WebPlayerView.this;
            Locale locale = Locale.US;
            String strDownloadUrlContent = webPlayerView.downloadUrlContent(this, "http://www.aparat.com/video/video/embed/vt/frame/showvideo/yes/videohash/" + this.videoId);
            if (isCancelled()) {
                return null;
            }
            try {
                Matcher matcher = WebPlayerView.aparatFileListPattern.matcher(strDownloadUrlContent);
                if (matcher.find()) {
                    JSONArray jSONArray = new JSONArray(matcher.group(1));
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                        if (jSONArray2.length() != 0) {
                            JSONObject jSONObject = jSONArray2.getJSONObject(0);
                            if (jSONObject.has("file")) {
                                this.results[0] = jSONObject.getString("file");
                                this.results[1] = "other";
                            }
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (isCancelled()) {
                return null;
            }
            return this.results[0];
        }

        @Override
        public void onPostExecute(String str) {
            if (str == null) {
                if (isCancelled()) {
                    return;
                }
                WebPlayerView.this.onInitFailed();
                return;
            }
            WebPlayerView.this.initied = true;
            WebPlayerView.this.playVideoUrl = str;
            WebPlayerView.this.playVideoType = this.results[1];
            if (WebPlayerView.this.isAutoplay) {
                WebPlayerView.this.preparePlayer();
            }
            WebPlayerView.this.showProgress(false, true);
            WebPlayerView.this.controlsView.show(true, true);
        }
    }

    public interface CallJavaResultInterface {
        void jsCallFinished(String str);
    }

    public class ControlsView extends FrameLayout {
        private int bufferedPosition;
        private AnimatorSet currentAnimation;
        private int currentProgressX;
        private int duration;
        private StaticLayout durationLayout;
        private int durationWidth;
        private Runnable hideRunnable;
        private ImageReceiver imageReceiver;
        private boolean isVisible;
        private int lastProgressX;
        private int progress;
        private Paint progressBufferedPaint;
        private Paint progressInnerPaint;
        private StaticLayout progressLayout;
        private Paint progressPaint;
        private boolean progressPressed;
        private TextPaint textPaint;

        public ControlsView(Context context) {
            super(context);
            this.isVisible = true;
            this.hideRunnable = new ShareAlert$23$$ExternalSyntheticLambda0(this, 14);
            setWillNotDraw(false);
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            textPaint.setColor(-1);
            this.textPaint.setTextSize(AndroidUtilities.dp(12.0f));
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

        public void checkNeedHide() {
            AndroidUtilities.cancelRunOnUIThread(this.hideRunnable);
            if (this.isVisible && WebPlayerView.this.videoPlayer.isPlaying()) {
                AndroidUtilities.runOnUIThread(this.hideRunnable, 3000L);
            }
        }

        public void lambda$new$0() {
            show(false, true);
        }

        @Override
        public void onDraw(Canvas canvas) {
            int iDp;
            int iDp2;
            int iDp3;
            int iDp4;
            int i;
            int i2;
            int i3;
            int i4;
            float f;
            int i5;
            Paint paint;
            if (WebPlayerView.this.drawImage) {
                if (WebPlayerView.this.firstFrameRendered && WebPlayerView.this.currentAlpha != 0.0f) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = jCurrentTimeMillis - WebPlayerView.this.lastUpdateTime;
                    WebPlayerView.this.lastUpdateTime = jCurrentTimeMillis;
                    WebPlayerView.access$4724(WebPlayerView.this, j / 150.0f);
                    if (WebPlayerView.this.currentAlpha < 0.0f) {
                        WebPlayerView.this.currentAlpha = 0.0f;
                    }
                    invalidate();
                }
                this.imageReceiver.setAlpha(WebPlayerView.this.currentAlpha);
                this.imageReceiver.draw(canvas);
            }
            if (!WebPlayerView.this.videoPlayer.isPlayerPrepared() || WebPlayerView.this.isStream) {
                return;
            }
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!WebPlayerView.this.isInline) {
                if (this.durationLayout != null) {
                    canvas.save();
                    canvas.translate((measuredWidth - AndroidUtilities.dp(58.0f)) - this.durationWidth, measuredHeight - AndroidUtilities.dp((WebPlayerView.this.inFullscreen ? 6 : 10) + 29));
                    this.durationLayout.draw(canvas);
                    canvas.restore();
                }
                if (this.progressLayout != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(18.0f), measuredHeight - AndroidUtilities.dp((WebPlayerView.this.inFullscreen ? 6 : 10) + 29));
                    this.progressLayout.draw(canvas);
                    canvas.restore();
                }
            }
            if (this.duration != 0) {
                if (!WebPlayerView.this.isInline) {
                    if (WebPlayerView.this.inFullscreen) {
                        int iDp5 = measuredHeight - AndroidUtilities.dp(29.0f);
                        int iDp6 = AndroidUtilities.dp(36.0f) + this.durationWidth;
                        iDp3 = (measuredWidth - AndroidUtilities.dp(76.0f)) - this.durationWidth;
                        iDp4 = measuredHeight - AndroidUtilities.dp(28.0f);
                        i = iDp5;
                        i2 = iDp6;
                    } else {
                        iDp = measuredHeight - AndroidUtilities.dp(13.0f);
                        iDp2 = AndroidUtilities.dp(12.0f);
                    }
                    if (WebPlayerView.this.inFullscreen) {
                        canvas.drawRect(i2, i, iDp3, AndroidUtilities.dp(3.0f) + i, this.progressInnerPaint);
                    }
                    if (this.progressPressed) {
                        i3 = this.currentProgressX;
                    } else {
                        i3 = ((int) ((this.progress / this.duration) * (iDp3 - i2))) + i2;
                    }
                    int i6 = i3;
                    i4 = this.bufferedPosition;
                    if (i4 != 0 && (i5 = this.duration) != 0) {
                        float f2 = i2;
                        float f3 = i;
                        float fM = zzir.m(i4, i5, iDp3 - i2, f2);
                        float fDp = AndroidUtilities.dp(3.0f) + i;
                        if (WebPlayerView.this.inFullscreen) {
                            paint = this.progressBufferedPaint;
                        } else {
                            paint = this.progressInnerPaint;
                        }
                        canvas.drawRect(f2, f3, fM, fDp, paint);
                    }
                    f = i6;
                    canvas.drawRect(i2, i, f, AndroidUtilities.dp(3.0f) + i, this.progressPaint);
                    if (WebPlayerView.this.isInline) {
                    }
                    canvas.drawCircle(f, iDp4, AndroidUtilities.dp(this.progressPressed ? 7.0f : 5.0f), this.progressPaint);
                }
                iDp = measuredHeight - AndroidUtilities.dp(3.0f);
                iDp2 = AndroidUtilities.dp(7.0f);
                iDp3 = measuredWidth;
                iDp4 = measuredHeight - iDp2;
                i = iDp;
                i2 = 0;
                if (WebPlayerView.this.inFullscreen) {
                    canvas.drawRect(i2, i, iDp3, AndroidUtilities.dp(3.0f) + i, this.progressInnerPaint);
                }
                if (this.progressPressed) {
                    i3 = this.currentProgressX;
                } else {
                    i3 = ((int) ((this.progress / this.duration) * (iDp3 - i2))) + i2;
                }
                int i7 = i3;
                i4 = this.bufferedPosition;
                if (i4 != 0) {
                    float f4 = i2;
                    float f5 = i;
                    float fM2 = zzir.m(i4, i5, iDp3 - i2, f4);
                    float fDp2 = AndroidUtilities.dp(3.0f) + i;
                    if (WebPlayerView.this.inFullscreen) {
                        paint = this.progressBufferedPaint;
                    } else {
                        paint = this.progressInnerPaint;
                    }
                    canvas.drawRect(f4, f5, fM2, fDp2, paint);
                }
                f = i7;
                canvas.drawRect(i2, i, f, AndroidUtilities.dp(3.0f) + i, this.progressPaint);
                if (WebPlayerView.this.isInline) {
                    canvas.drawCircle(f, iDp4, AndroidUtilities.dp(this.progressPressed ? 7.0f : 5.0f), this.progressPaint);
                }
            }
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
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
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int measuredWidth;
            int measuredHeight;
            int iDp;
            int i;
            if (WebPlayerView.this.inFullscreen) {
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
            if (motionEvent.getAction() == 0) {
                if (!this.isVisible || WebPlayerView.this.isInline || WebPlayerView.this.isStream) {
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
                AndroidUtilities.cancelRunOnUIThread(this.hideRunnable);
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (WebPlayerView.this.initied && WebPlayerView.this.videoPlayer.isPlaying()) {
                    AndroidUtilities.runOnUIThread(this.hideRunnable, 3000L);
                }
                if (this.progressPressed) {
                    this.progressPressed = false;
                    if (WebPlayerView.this.initied) {
                        this.progress = (int) (((this.currentProgressX - iDp) / (measuredWidth - iDp)) * this.duration);
                        WebPlayerView.this.videoPlayer.seekTo(((long) this.progress) * 1000);
                    }
                }
            } else if (motionEvent.getAction() == 2 && this.progressPressed) {
                int x2 = (int) motionEvent.getX();
                int i4 = this.currentProgressX - (this.lastProgressX - x2);
                this.currentProgressX = i4;
                this.lastProgressX = x2;
                if (i4 < iDp) {
                    this.currentProgressX = iDp;
                } else if (i4 > measuredWidth) {
                    this.currentProgressX = measuredWidth;
                }
                setProgress((int) (((this.currentProgressX - iDp) / (measuredWidth - iDp)) * this.duration * 1000));
                invalidate();
            }
            super.onTouchEvent(motionEvent);
            return true;
        }

        @Override
        public void requestDisallowInterceptTouchEvent(boolean z) {
            super.requestDisallowInterceptTouchEvent(z);
            checkNeedHide();
        }

        public void setBufferedProgress(int i) {
            this.bufferedPosition = i;
            invalidate();
        }

        public void setDuration(int i) {
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

        public void setProgress(int i) {
            if (this.progressPressed || i < 0 || WebPlayerView.this.isStream) {
                return;
            }
            this.progress = i;
            this.progressLayout = new StaticLayout(AndroidUtilities.formatShortDuration(this.progress), this.textPaint, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            invalidate();
        }

        public void show(boolean z, boolean z2) {
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
                    this.currentAnimation.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            ControlsView.this.currentAnimation = null;
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
                this.currentAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ControlsView.this.currentAnimation = null;
                    }
                });
                this.currentAnimation.start();
            } else {
                setAlpha(0.0f);
            }
            checkNeedHide();
        }
    }

    public class CoubVideoTask extends AsyncTask<Void, Void, String> {
        private boolean canRetry = true;
        private String[] results = new String[4];
        private String videoId;

        public CoubVideoTask(String str) {
            this.videoId = str;
        }

        private String decodeUrl(String str) {
            StringBuilder sb = new StringBuilder(str);
            for (int i = 0; i < sb.length(); i++) {
                char cCharAt = sb.charAt(i);
                char lowerCase = Character.toLowerCase(cCharAt);
                if (cCharAt == lowerCase) {
                    lowerCase = Character.toUpperCase(cCharAt);
                }
                sb.setCharAt(i, lowerCase);
            }
            try {
                return new String(Base64.decode(sb.toString(), 0), "UTF-8");
            } catch (Exception unused) {
                return null;
            }
        }

        @Override
        public String doInBackground(Void... voidArr) {
            WebPlayerView webPlayerView = WebPlayerView.this;
            Locale locale = Locale.US;
            String strDownloadUrlContent = webPlayerView.downloadUrlContent(this, "https://coub.com/api/v2/coubs/" + this.videoId + ".json");
            if (isCancelled()) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(strDownloadUrlContent).getJSONObject("file_versions").getJSONObject("mobile");
                String string = jSONObject.getString("video");
                String string2 = jSONObject.getJSONArray("audio").getString(0);
                if (string != null && string2 != null) {
                    String[] strArr = this.results;
                    strArr[0] = string;
                    strArr[1] = "other";
                    strArr[2] = string2;
                    strArr[3] = "other";
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (isCancelled()) {
                return null;
            }
            return this.results[0];
        }

        @Override
        public void onPostExecute(String str) {
            if (str == null) {
                if (isCancelled()) {
                    return;
                }
                WebPlayerView.this.onInitFailed();
                return;
            }
            WebPlayerView.this.initied = true;
            WebPlayerView.this.playVideoUrl = str;
            WebPlayerView.this.playVideoType = this.results[1];
            WebPlayerView.this.playAudioUrl = this.results[2];
            WebPlayerView.this.playAudioType = this.results[3];
            if (WebPlayerView.this.isAutoplay) {
                WebPlayerView.this.preparePlayer();
            }
            WebPlayerView.this.showProgress(false, true);
            WebPlayerView.this.controlsView.show(true, true);
        }
    }

    public static class JSExtractor {
        private String jsCode;
        ArrayList<String> codeLines = new ArrayList<>();
        private String[] operators = {"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        private String[] assign_operators = {"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};

        public JSExtractor(String str) {
            this.jsCode = str;
        }

        private void buildFunction(String[] strArr, String str) throws Exception {
            HashMap<String, String> map = new HashMap<>();
            for (String str2 : strArr) {
                map.put(str2, "");
            }
            String[] strArrSplit = str.split(";");
            boolean[] zArr = new boolean[1];
            for (String str3 : strArrSplit) {
                interpretStatement(str3, map, zArr, 100);
                if (zArr[0]) {
                    return;
                }
            }
        }

        public String extractFunction(String str) {
            try {
                String strQuote = Pattern.quote(str);
                Locale locale = Locale.US;
                Matcher matcher = Pattern.compile("(?x)(?:function\\s+" + strQuote + "|[{;,]\\s*" + strQuote + "\\s*=\\s*function|var\\s+" + strQuote + "\\s*=\\s*function)\\s*\\(([^)]*)\\)\\s*\\{([^}]+)\\}").matcher(this.jsCode);
                if (matcher.find()) {
                    String strGroup = matcher.group();
                    if (!this.codeLines.contains(strGroup)) {
                        this.codeLines.add(strGroup + ";");
                    }
                    buildFunction(matcher.group(1).split(","), matcher.group(2));
                }
            } catch (Exception e) {
                this.codeLines.clear();
                FileLog.e(e);
            }
            return TextUtils.join("", this.codeLines);
        }

        private HashMap<String, Object> extractObject(String str) {
            HashMap<String, Object> map = new HashMap<>();
            Locale locale = Locale.US;
            Matcher matcher = Pattern.compile("(?:var\\s+)?" + Pattern.quote(str) + "\\s*=\\s*\\{\\s*(((?:[a-zA-Z$0-9]+|\"[a-zA-Z$0-9]+\"|'[a-zA-Z$0-9]+')\\s*:\\s*function\\(.*?\\)\\s*\\{.*?\\}(?:,\\s*)?)*)\\}\\s*;").matcher(this.jsCode);
            String str2 = null;
            while (matcher.find()) {
                String strGroup = matcher.group();
                String strGroup2 = matcher.group(2);
                if (!TextUtils.isEmpty(strGroup2)) {
                    if (!this.codeLines.contains(strGroup)) {
                        this.codeLines.add(matcher.group());
                    }
                    str2 = strGroup2;
                    break;
                }
                str2 = strGroup2;
            }
            Matcher matcher2 = Pattern.compile("((?:[a-zA-Z$0-9]+|\"[a-zA-Z$0-9]+\"|'[a-zA-Z$0-9]+'))\\s*:\\s*function\\(([a-z,]+)\\)\\{([^}]+)\\}").matcher(str2);
            while (matcher2.find()) {
                buildFunction(matcher2.group(2).split(","), matcher2.group(3));
            }
            return map;
        }

        private void interpretExpression(String str, HashMap<String, String> map, int i) throws Exception {
            String strTrim = str.trim();
            if (TextUtils.isEmpty(strTrim)) {
                return;
            }
            if (strTrim.charAt(0) == '(') {
                Matcher matcher = WebPlayerView.exprParensPattern.matcher(strTrim);
                int i2 = 0;
                while (matcher.find()) {
                    if (matcher.group(0).indexOf(48) == 40) {
                        i2++;
                    } else {
                        i2--;
                        if (i2 == 0) {
                            interpretExpression(strTrim.substring(1, matcher.start()), map, i);
                            strTrim = strTrim.substring(matcher.end()).trim();
                            if (!TextUtils.isEmpty(strTrim)) {
                                break;
                            } else {
                                return;
                            }
                        }
                    }
                }
                if (i2 != 0) {
                    throw new Exception(Fragment$$ExternalSyntheticOutline0.m("Premature end of parens in ", strTrim));
                }
            }
            int i3 = 0;
            while (true) {
                String[] strArr = this.assign_operators;
                if (i3 < strArr.length) {
                    String str2 = strArr[i3];
                    Locale locale = Locale.US;
                    Matcher matcher2 = Pattern.compile("(?x)([a-zA-Z_$][a-zA-Z_$0-9]*)(?:\\[([^\\]]+?)\\])?\\s*" + Pattern.quote(str2) + "(.*)$").matcher(strTrim);
                    if (matcher2.find()) {
                        interpretExpression(matcher2.group(3), map, i - 1);
                        String strGroup = matcher2.group(2);
                        if (TextUtils.isEmpty(strGroup)) {
                            map.put(matcher2.group(1), "");
                            return;
                        } else {
                            interpretExpression(strGroup, map, i);
                            return;
                        }
                    }
                    i3++;
                } else {
                    try {
                        Integer.parseInt(strTrim);
                        return;
                    } catch (Exception unused) {
                        Locale locale2 = Locale.US;
                        if (Pattern.compile("(?!if|return|true|false)([a-zA-Z_$][a-zA-Z_$0-9]*)$").matcher(strTrim).find()) {
                            return;
                        }
                        if (strTrim.charAt(0) == '\"' && strTrim.charAt(strTrim.length() - 1) == '\"') {
                            return;
                        }
                        try {
                            new JSONObject(strTrim).toString();
                            return;
                        } catch (Exception unused2) {
                            Locale locale3 = Locale.US;
                            Matcher matcher3 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)\\[(.+)\\]$").matcher(strTrim);
                            if (matcher3.find()) {
                                matcher3.group(1);
                                interpretExpression(matcher3.group(2), map, i - 1);
                                return;
                            }
                            Matcher matcher4 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)(?:\\.([^(]+)|\\[([^]]+)\\])\\s*(?:\\(+([^()]*)\\))?$").matcher(strTrim);
                            if (matcher4.find()) {
                                String strGroup2 = matcher4.group(1);
                                String strGroup3 = matcher4.group(2);
                                String strGroup4 = matcher4.group(3);
                                if (TextUtils.isEmpty(strGroup3)) {
                                    strGroup3 = strGroup4;
                                }
                                strGroup3.replace("\"", "");
                                String strGroup5 = matcher4.group(4);
                                if (map.get(strGroup2) == null) {
                                    extractObject(strGroup2);
                                }
                                if (strGroup5 == null) {
                                    return;
                                }
                                if (strTrim.charAt(strTrim.length() - 1) != ')') {
                                    throw new Exception("last char not ')'");
                                }
                                if (strGroup5.length() != 0) {
                                    for (String str3 : strGroup5.split(",")) {
                                        interpretExpression(str3, map, i);
                                    }
                                    return;
                                }
                                return;
                            }
                            Matcher matcher5 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)\\[(.+)\\]$").matcher(strTrim);
                            if (matcher5.find()) {
                                map.get(matcher5.group(1));
                                interpretExpression(matcher5.group(2), map, i - 1);
                                return;
                            }
                            int i4 = 0;
                            while (true) {
                                String[] strArr2 = this.operators;
                                if (i4 >= strArr2.length) {
                                    Locale locale4 = Locale.US;
                                    Matcher matcher6 = Pattern.compile("^([a-zA-Z_$][a-zA-Z_$0-9]*)\\(([a-zA-Z0-9_$,]*)\\)$").matcher(strTrim);
                                    if (matcher6.find()) {
                                        extractFunction(matcher6.group(1));
                                    }
                                    throw new Exception("Unsupported JS expression ".concat(strTrim));
                                }
                                String str4 = strArr2[i4];
                                Locale locale5 = Locale.US;
                                Matcher matcher7 = Pattern.compile("(.+?)" + Pattern.quote(str4) + "(.+)").matcher(strTrim);
                                if (matcher7.find()) {
                                    boolean[] zArr = new boolean[1];
                                    int i5 = i - 1;
                                    interpretStatement(matcher7.group(1), map, zArr, i5);
                                    if (zArr[0]) {
                                        throw new Exception(Fragment$$ExternalSyntheticOutline0.m("Premature left-side return of ", str4, " in ", strTrim));
                                    }
                                    interpretStatement(matcher7.group(2), map, zArr, i5);
                                    if (zArr[0]) {
                                        throw new Exception(Fragment$$ExternalSyntheticOutline0.m("Premature right-side return of ", str4, " in ", strTrim));
                                    }
                                }
                                i4++;
                            }
                        }
                    }
                }
            }
        }

        private void interpretStatement(String str, HashMap<String, String> map, boolean[] zArr, int i) throws Exception {
            if (i < 0) {
                throw new Exception("recursion limit reached");
            }
            zArr[0] = false;
            String strTrim = str.trim();
            Matcher matcher = WebPlayerView.stmtVarPattern.matcher(strTrim);
            if (matcher.find()) {
                strTrim = strTrim.substring(matcher.group(0).length());
            } else {
                Matcher matcher2 = WebPlayerView.stmtReturnPattern.matcher(strTrim);
                if (matcher2.find()) {
                    strTrim = strTrim.substring(matcher2.group(0).length());
                    zArr[0] = true;
                }
            }
            interpretExpression(strTrim, map, i);
        }
    }

    public static class JavaScriptInterface {
        private final CallJavaResultInterface callJavaResultInterface;

        public JavaScriptInterface(CallJavaResultInterface callJavaResultInterface) {
            this.callJavaResultInterface = callJavaResultInterface;
        }

        @JavascriptInterface
        public void returnResultToJava(String str) {
            this.callJavaResultInterface.jsCallFinished(str);
        }
    }

    public class TwitchClipVideoTask extends AsyncTask<Void, Void, String> {
        private String currentUrl;
        private String videoId;
        private boolean canRetry = true;
        private String[] results = new String[2];

        public TwitchClipVideoTask(String str, String str2) {
            this.videoId = str2;
            this.currentUrl = str;
        }

        @Override
        public String doInBackground(Void... voidArr) {
            String strDownloadUrlContent = WebPlayerView.this.downloadUrlContent(this, this.currentUrl, null, false);
            if (isCancelled()) {
                return null;
            }
            try {
                Matcher matcher = WebPlayerView.twitchClipFilePattern.matcher(strDownloadUrlContent);
                if (matcher.find()) {
                    this.results[0] = new JSONObject(matcher.group(1)).getJSONArray("quality_options").getJSONObject(0).getString("source");
                    this.results[1] = "other";
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (isCancelled()) {
                return null;
            }
            return this.results[0];
        }

        @Override
        public void onPostExecute(String str) {
            if (str == null) {
                if (isCancelled()) {
                    return;
                }
                WebPlayerView.this.onInitFailed();
                return;
            }
            WebPlayerView.this.initied = true;
            WebPlayerView.this.playVideoUrl = str;
            WebPlayerView.this.playVideoType = this.results[1];
            if (WebPlayerView.this.isAutoplay) {
                WebPlayerView.this.preparePlayer();
            }
            WebPlayerView.this.showProgress(false, true);
            WebPlayerView.this.controlsView.show(true, true);
        }
    }

    public class TwitchStreamVideoTask extends AsyncTask<Void, Void, String> {
        private String currentUrl;
        private String videoId;
        private boolean canRetry = true;
        private String[] results = new String[2];

        public TwitchStreamVideoTask(String str, String str2) {
            this.videoId = str2;
            this.currentUrl = str;
        }

        @Override
        public String doInBackground(Void... voidArr) {
            HashMap<String, String> map = new HashMap<>();
            map.put("Client-ID", "jzkbprff40iqj646a697cyrvl0zt2m6");
            int iIndexOf = this.videoId.indexOf(38);
            if (iIndexOf > 0) {
                this.videoId = this.videoId.substring(0, iIndexOf);
            }
            WebPlayerView webPlayerView = WebPlayerView.this;
            Locale locale = Locale.US;
            String strDownloadUrlContent = webPlayerView.downloadUrlContent(this, Fragment$$ExternalSyntheticOutline0.m("https://api.twitch.tv/kraken/streams/", this.videoId, "?stream_type=all"), map, false);
            if (isCancelled()) {
                return null;
            }
            try {
                new JSONObject(strDownloadUrlContent).getJSONObject("stream");
                JSONObject jSONObject = new JSONObject(WebPlayerView.this.downloadUrlContent(this, "https://api.twitch.tv/api/channels/" + this.videoId + "/access_token", map, false));
                String strEncode = URLEncoder.encode(jSONObject.getString("sig"), "UTF-8");
                String strEncode2 = URLEncoder.encode(jSONObject.getString("token"), "UTF-8");
                URLEncoder.encode("https://youtube.googleapis.com/v/" + this.videoId, "UTF-8");
                String str = "allow_source=true&allow_audio_only=true&allow_spectre=true&player=twitchweb&segment_preference=4&p=" + ((int) (Math.random() * 1.0E7d)) + "&sig=" + strEncode + "&token=" + strEncode2;
                String str2 = "https://usher.ttvnw.net/api/channel/hls/" + this.videoId + ".m3u8?" + str;
                String[] strArr = this.results;
                strArr[0] = str2;
                strArr[1] = "hls";
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (isCancelled()) {
                return null;
            }
            return this.results[0];
        }

        @Override
        public void onPostExecute(String str) {
            if (str == null) {
                if (isCancelled()) {
                    return;
                }
                WebPlayerView.this.onInitFailed();
                return;
            }
            WebPlayerView.this.initied = true;
            WebPlayerView.this.playVideoUrl = str;
            WebPlayerView.this.playVideoType = this.results[1];
            if (WebPlayerView.this.isAutoplay) {
                WebPlayerView.this.preparePlayer();
            }
            WebPlayerView.this.showProgress(false, true);
            WebPlayerView.this.controlsView.show(true, true);
        }
    }

    public class VimeoVideoTask extends AsyncTask<Void, Void, String> {
        private boolean canRetry = true;
        private String[] results = new String[2];
        private String videoId;

        public VimeoVideoTask(String str) {
            this.videoId = str;
        }

        @Override
        public String doInBackground(Void... voidArr) {
            WebPlayerView webPlayerView = WebPlayerView.this;
            Locale locale = Locale.US;
            String strDownloadUrlContent = webPlayerView.downloadUrlContent(this, "https://player.vimeo.com/video/" + this.videoId + "/config");
            if (isCancelled()) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(strDownloadUrlContent).getJSONObject("request").getJSONObject("files");
                if (jSONObject.has("hls")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("hls");
                    try {
                        this.results[0] = jSONObject2.getString("url");
                    } catch (Exception unused) {
                        this.results[0] = jSONObject2.getJSONObject("cdns").getJSONObject(jSONObject2.getString("default_cdn")).getString("url");
                    }
                    this.results[1] = "hls";
                } else if (jSONObject.has("progressive")) {
                    this.results[1] = "other";
                    this.results[0] = jSONObject.getJSONArray("progressive").getJSONObject(0).getString("url");
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (isCancelled()) {
                return null;
            }
            return this.results[0];
        }

        @Override
        public void onPostExecute(String str) {
            if (str == null) {
                if (isCancelled()) {
                    return;
                }
                WebPlayerView.this.onInitFailed();
                return;
            }
            WebPlayerView.this.initied = true;
            WebPlayerView.this.playVideoUrl = str;
            WebPlayerView.this.playVideoType = this.results[1];
            if (WebPlayerView.this.isAutoplay) {
                WebPlayerView.this.preparePlayer();
            }
            WebPlayerView.this.showProgress(false, true);
            WebPlayerView.this.controlsView.show(true, true);
        }
    }

    public interface WebPlayerViewDelegate {
        boolean checkInlinePermissions();

        ViewGroup getTextureViewContainer();

        void onInitFailed();

        void onInlineSurfaceTextureReady();

        void onPlayStateChanged(WebPlayerView webPlayerView, boolean z);

        void onSharePressed();

        TextureView onSwitchInlineMode(View view, boolean z, int i, int i2, int i3, boolean z2);

        TextureView onSwitchToFullscreen(View view, boolean z, float f, int i, boolean z2);

        void onVideoSizeChanged(float f, int i);

        void prepareToSwitchInlineMode(boolean z, Runnable runnable, float f, boolean z2);
    }

    public class YoutubeVideoTask extends AsyncTask<Void, Void, String[]> {
        private boolean canRetry = true;
        private CountDownLatch countDownLatch = new CountDownLatch(1);
        private String[] result = new String[2];
        private String sig;
        private String videoId;

        public YoutubeVideoTask(String str) {
            this.videoId = str;
        }

        public void lambda$doInBackground$0(String str) {
            String[] strArr = this.result;
            strArr[0] = strArr[0].replace(this.sig, "/signature/" + str.substring(1, str.length() - 1));
            this.countDownLatch.countDown();
        }

        public void lambda$doInBackground$1(String str) {
            WebPlayerView.this.webView.evaluateJavascript(str, new ValueCallback() {
                @Override
                public final void onReceiveValue(Object obj) {
                    this.f$0.lambda$doInBackground$0((String) obj);
                }
            });
        }

        public void onInterfaceResult(String str) {
            String[] strArr = this.result;
            strArr[0] = strArr[0].replace(this.sig, "/signature/" + str);
            this.countDownLatch.countDown();
        }

        @Override
        public String[] doInBackground(Void... voidArr) {
            char c;
            String[] strArr;
            char c2;
            boolean z;
            int i;
            String str;
            char c3;
            char c4;
            String[] strArr2;
            String strConcat;
            String str2;
            String strGroup;
            String str3;
            String str4;
            boolean z2;
            boolean z3;
            String strDownloadUrlContent = WebPlayerView.this.downloadUrlContent(this, "https://www.youtube.com/embed/" + this.videoId);
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
                        c3 = 0;
                        c4 = 1;
                        break;
                    }
                    String strDownloadUrlContent2 = WebPlayerView.this.downloadUrlContent(this, "https://www.youtube.com/get_video_info?" + strM + strArr[i]);
                    if (isCancelled()) {
                        return null;
                    }
                    if (strDownloadUrlContent2 != null) {
                        String[] strArrSplit = strDownloadUrlContent2.split("&");
                        String str5 = str;
                        int i3 = 0;
                        String strDecode = null;
                        z2 = false;
                        z3 = false;
                        boolean z4 = z;
                        while (i3 < strArrSplit.length) {
                            if (strArrSplit[i3].startsWith("dashmpd")) {
                                String[] strArrSplit2 = strArrSplit[i3].split("=");
                                if (strArrSplit2.length == i2) {
                                    try {
                                        this.result[c2] = URLDecoder.decode(strArrSplit2[c], "UTF-8");
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                                z3 = true;
                            } else {
                                if (strArrSplit[i3].startsWith("url_encoded_fmt_stream_map")) {
                                    String[] strArrSplit3 = strArrSplit[i3].split("=");
                                    if (strArrSplit3.length == i2) {
                                        try {
                                            String[] strArrSplit4 = URLDecoder.decode(strArrSplit3[c], "UTF-8").split("[&,]");
                                            int i4 = 0;
                                            String strDecode2 = null;
                                            boolean z5 = false;
                                            while (true) {
                                                try {
                                                    if (i4 >= strArrSplit4.length) {
                                                        strM = strM;
                                                        break;
                                                    }
                                                    String[] strArrSplit5 = strArrSplit4[i4].split("=");
                                                    String[] strArr3 = strArrSplit4;
                                                    strM = strM;
                                                    try {
                                                        if (strArrSplit5[0].startsWith("type")) {
                                                            if (URLDecoder.decode(strArrSplit5[1], "UTF-8").contains("video/mp4")) {
                                                                z5 = true;
                                                            }
                                                        } else if (strArrSplit5[0].startsWith("url")) {
                                                            strDecode2 = URLDecoder.decode(strArrSplit5[1], "UTF-8");
                                                        } else if (strArrSplit5[0].startsWith("itag")) {
                                                            strDecode2 = null;
                                                            z5 = false;
                                                        }
                                                        if (z5 && strDecode2 != null) {
                                                            str5 = strDecode2;
                                                            break;
                                                        }
                                                        i4++;
                                                        strArrSplit4 = strArr3;
                                                        strM = strM;
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        FileLog.e(e);
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    strM = strM;
                                                }
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                            strM = strM;
                                        }
                                    }
                                } else {
                                    strM = strM;
                                    if (strArrSplit[i3].startsWith("use_cipher_signature")) {
                                        String[] strArrSplit6 = strArrSplit[i3].split("=");
                                        if (strArrSplit6.length == 2 && strArrSplit6[1].toLowerCase().equals("true")) {
                                            z4 = true;
                                        }
                                    } else if (strArrSplit[i3].startsWith("hlsvp")) {
                                        String[] strArrSplit7 = strArrSplit[i3].split("=");
                                        if (strArrSplit7.length == 2) {
                                            try {
                                                strDecode = URLDecoder.decode(strArrSplit7[1], "UTF-8");
                                            } catch (Exception e5) {
                                                FileLog.e(e5);
                                            }
                                        }
                                    } else if (strArrSplit[i3].startsWith("livestream")) {
                                        String[] strArrSplit8 = strArrSplit[i3].split("=");
                                        if (strArrSplit8.length == 2 && strArrSplit8[1].toLowerCase().equals("1")) {
                                            z2 = true;
                                        }
                                    }
                                }
                                i3++;
                                strM = strM;
                                c = 1;
                                c2 = 0;
                                i2 = 2;
                            }
                            i3++;
                            strM = strM;
                            c = 1;
                            c2 = 0;
                            i2 = 2;
                        }
                        str3 = strM;
                        z = z4;
                        str = str5;
                        str4 = strDecode;
                    } else {
                        str3 = strM;
                        str4 = null;
                        z2 = false;
                        z3 = false;
                    }
                    c3 = 0;
                    c4 = 1;
                    if (z2) {
                        if (str4 == null || z || str4.contains("/s/")) {
                            return null;
                        }
                        String[] strArr4 = this.result;
                        strArr4[0] = str4;
                        strArr4[1] = "hls";
                    }
                    if (z3) {
                        break;
                    }
                    i++;
                    strM = str3;
                    c = 1;
                    c2 = 0;
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            if (strDownloadUrlContent != null) {
                Matcher matcher = WebPlayerView.stsPattern.matcher(strDownloadUrlContent);
                if (matcher.find()) {
                    StringBuilder sbM = Log.m(strM, "&sts=");
                    sbM.append(strDownloadUrlContent.substring(matcher.start() + 6, matcher.end()));
                    strM = sbM.toString();
                } else {
                    strM = zzhp.m(strM, "&sts=");
                }
            }
            c = 1;
            this.result[1] = "dash";
            strArr = new String[]{"", "&el=leanback", "&el=embedded", "&el=detailpage", "&el=vevo"};
            c2 = 0;
            z = false;
            i = 0;
            str = null;
            String[] strArr5 = this.result;
            if (strArr5[c3] == null && str != null) {
                strArr5[c3] = str;
                strArr5[c4] = "other";
            }
            String str6 = strArr5[c3];
            if (str6 == null || (!(z || str6.contains("/s/")) || strDownloadUrlContent == null)) {
                strArr2 = null;
            } else {
                int iIndexOf = this.result[c3].indexOf("/s/");
                int iIndexOf2 = this.result[c3].indexOf(47, iIndexOf + 10);
                if (iIndexOf == -1) {
                    strArr2 = null;
                    z = true;
                } else {
                    if (iIndexOf2 == -1) {
                        iIndexOf2 = this.result[c3].length();
                    }
                    this.sig = this.result[c3].substring(iIndexOf, iIndexOf2);
                    Matcher matcher2 = WebPlayerView.jsPattern.matcher(strDownloadUrlContent);
                    if (matcher2.find()) {
                        try {
                            Object objNextValue = new JSONTokener(matcher2.group(1)).nextValue();
                            if (objNextValue instanceof String) {
                                strConcat = (String) objNextValue;
                            } else {
                                strConcat = null;
                            }
                        } catch (Exception e7) {
                            FileLog.e(e7);
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
                            String strDownloadUrlContent3 = WebPlayerView.this.downloadUrlContent(this, strConcat);
                            if (isCancelled()) {
                                return null;
                            }
                            strArr2 = null;
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
                                        strExtractFunction = new JSExtractor(strDownloadUrlContent3).extractFunction(strGroup);
                                        if (!TextUtils.isEmpty(strExtractFunction) && str2 != null) {
                                            sharedPreferences.edit().putString(str2, strExtractFunction).putString(str2 + "n", strGroup).commit();
                                        }
                                    } catch (Exception e8) {
                                        FileLog.e(e8);
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(strExtractFunction)) {
                                try {
                                    AndroidUtilities.runOnUIThread(new EmojiView$2$$ExternalSyntheticLambda0(24, this, strExtractFunction + strGroup + "('" + this.sig.substring(3) + "');"));
                                    this.countDownLatch.await();
                                    z = false;
                                } catch (Exception e9) {
                                    FileLog.e(e9);
                                    z = true;
                                }
                            }
                        } else {
                            strArr2 = null;
                        }
                        if (!TextUtils.isEmpty(strExtractFunction)) {
                            AndroidUtilities.runOnUIThread(new EmojiView$2$$ExternalSyntheticLambda0(24, this, strExtractFunction + strGroup + "('" + this.sig.substring(3) + "');"));
                            this.countDownLatch.await();
                            z = false;
                        }
                    } else {
                        strArr2 = null;
                    }
                    z = true;
                }
            }
            return (isCancelled() || z) ? strArr2 : this.result;
        }

        @Override
        public void onPostExecute(String[] strArr) {
            if (strArr[0] == null) {
                if (isCancelled()) {
                    return;
                }
                WebPlayerView.this.onInitFailed();
                return;
            }
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb = new StringBuilder("start play youtube video ");
                sb.append(strArr[1]);
                sb.append(" ");
                SQLitePreparedStatement$$ExternalSyntheticOutline0.m(strArr[0], sb);
            }
            WebPlayerView.this.initied = true;
            WebPlayerView.this.playVideoUrl = strArr[0];
            WebPlayerView.this.playVideoType = strArr[1];
            if (WebPlayerView.this.playVideoType.equals("hls")) {
                WebPlayerView.this.isStream = true;
            }
            if (WebPlayerView.this.isAutoplay) {
                WebPlayerView.this.preparePlayer();
            }
            WebPlayerView.this.showProgress(false, true);
            WebPlayerView.this.controlsView.show(true, true);
        }
    }

    public static abstract class function {
        private function() {
        }

        public abstract Object run(Object[] objArr);
    }

    public WebPlayerView(final Context context, boolean z, boolean z2, WebPlayerViewDelegate webPlayerViewDelegate) {
        super(context);
        int i = lastContainerId;
        lastContainerId = i + 1;
        this.fragment_container_id = i;
        this.allowInlineAnimation = true;
        this.backgroundPaint = new Paint();
        this.progressRunnable = new Runnable() {
            @Override
            public void run() {
                if (WebPlayerView.this.videoPlayer == null || !WebPlayerView.this.videoPlayer.isPlaying()) {
                    return;
                }
                WebPlayerView.this.controlsView.setProgress((int) (WebPlayerView.this.videoPlayer.getCurrentPosition() / 1000));
                WebPlayerView.this.controlsView.setBufferedProgress((int) (WebPlayerView.this.videoPlayer.getBufferedPosition() / 1000));
                AndroidUtilities.runOnUIThread(WebPlayerView.this.progressRunnable, 1000L);
            }
        };
        this.surfaceTextureListener = new TextureView.SurfaceTextureListener() {

            public class AnonymousClass1 implements ViewTreeObserver.OnPreDrawListener {
                public AnonymousClass1() {
                }

                public void lambda$onPreDraw$0() {
                    WebPlayerView.this.delegate.onInlineSurfaceTextureReady();
                }

                @Override
                public boolean onPreDraw() {
                    WebPlayerView.this.changedTextureView.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (WebPlayerView.this.textureImageView != null) {
                        WebPlayerView.this.textureImageView.setVisibility(4);
                        WebPlayerView.this.textureImageView.setImageDrawable(null);
                        if (WebPlayerView.this.currentBitmap != null) {
                            WebPlayerView.this.currentBitmap.recycle();
                            WebPlayerView.this.currentBitmap = null;
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ShareAlert$23$$ExternalSyntheticLambda0(this, 13));
                    WebPlayerView.this.waitingForFirstTextureUpload = 0;
                    return true;
                }
            }

            @Override
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
            }

            @Override
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                if (!WebPlayerView.this.changingTextureView) {
                    return true;
                }
                if (WebPlayerView.this.switchingInlineMode) {
                    WebPlayerView.this.waitingForFirstTextureUpload = 2;
                }
                WebPlayerView.this.textureView.setSurfaceTexture(surfaceTexture);
                WebPlayerView.this.textureView.setVisibility(0);
                WebPlayerView.this.changingTextureView = false;
                return false;
            }

            @Override
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
            }

            @Override
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (WebPlayerView.this.waitingForFirstTextureUpload == 1) {
                    WebPlayerView.this.changedTextureView.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass1());
                    WebPlayerView.this.changedTextureView.invalidate();
                }
            }
        };
        this.switchToInlineRunnable = new Runnable() {
            @Override
            public void run() {
                WebPlayerView.this.switchingInlineMode = false;
                if (WebPlayerView.this.currentBitmap != null) {
                    WebPlayerView.this.currentBitmap.recycle();
                    WebPlayerView.this.currentBitmap = null;
                }
                WebPlayerView.this.changingTextureView = true;
                if (WebPlayerView.this.textureImageView != null) {
                    try {
                        WebPlayerView webPlayerView = WebPlayerView.this;
                        webPlayerView.currentBitmap = Bitmaps.createBitmap(webPlayerView.textureView.getWidth(), WebPlayerView.this.textureView.getHeight(), Bitmap.Config.ARGB_8888);
                        WebPlayerView.this.textureView.getBitmap(WebPlayerView.this.currentBitmap);
                    } catch (Throwable th) {
                        if (WebPlayerView.this.currentBitmap != null) {
                            WebPlayerView.this.currentBitmap.recycle();
                            WebPlayerView.this.currentBitmap = null;
                        }
                        FileLog.e(th);
                    }
                    if (WebPlayerView.this.currentBitmap != null) {
                        WebPlayerView.this.textureImageView.setVisibility(0);
                        WebPlayerView.this.textureImageView.setImageBitmap(WebPlayerView.this.currentBitmap);
                    } else {
                        WebPlayerView.this.textureImageView.setImageDrawable(null);
                    }
                }
                WebPlayerView.this.isInline = true;
                WebPlayerView.this.updatePlayButton();
                WebPlayerView.this.updateShareButton();
                WebPlayerView.this.updateFullscreenButton();
                WebPlayerView.this.updateInlineButton();
                ViewGroup viewGroup = (ViewGroup) WebPlayerView.this.controlsView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(WebPlayerView.this.controlsView);
                }
                WebPlayerView webPlayerView2 = WebPlayerView.this;
                webPlayerView2.changedTextureView = webPlayerView2.delegate.onSwitchInlineMode(WebPlayerView.this.controlsView, WebPlayerView.this.isInline, WebPlayerView.this.videoWidth, WebPlayerView.this.videoHeight, WebPlayerView.this.aspectRatioFrameLayout.getVideoRotation(), WebPlayerView.this.allowInlineAnimation);
                WebPlayerView.this.changedTextureView.setVisibility(4);
                ViewGroup viewGroup2 = (ViewGroup) WebPlayerView.this.textureView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(WebPlayerView.this.textureView);
                }
                WebPlayerView.this.controlsView.show(false, false);
            }
        };
        setWillNotDraw(false);
        this.delegate = webPlayerViewDelegate;
        this.backgroundPaint.setColor(-16777216);
        AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(context) {
            @Override
            public void onMeasure(int i2, int i3) {
                super.onMeasure(i2, i3);
                if (WebPlayerView.this.textureViewContainer != null) {
                    ViewGroup.LayoutParams layoutParams = WebPlayerView.this.textureView.getLayoutParams();
                    layoutParams.width = getMeasuredWidth();
                    layoutParams.height = getMeasuredHeight();
                    if (WebPlayerView.this.textureImageView != null) {
                        ViewGroup.LayoutParams layoutParams2 = WebPlayerView.this.textureImageView.getLayoutParams();
                        layoutParams2.width = getMeasuredWidth();
                        layoutParams2.height = getMeasuredHeight();
                    }
                }
            }
        };
        this.aspectRatioFrameLayout = aspectRatioFrameLayout;
        addView(aspectRatioFrameLayout, LayoutHelper.createFrame(-1, -1, 17));
        this.interfaceName = "JavaScriptInterface";
        WebView webView = new WebView(context) {
            @Override
            public void onAttachedToWindow() {
                AndroidUtilities.checkAndroidTheme(context, true);
                super.onAttachedToWindow();
            }

            @Override
            public void onDetachedFromWindow() {
                AndroidUtilities.checkAndroidTheme(context, false);
                super.onDetachedFromWindow();
            }
        };
        this.webView = webView;
        webView.addJavascriptInterface(new JavaScriptInterface(new ColorPicker$$ExternalSyntheticLambda5(this, 25)), this.interfaceName);
        WebSettings settings = this.webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        this.textureViewContainer = this.delegate.getTextureViewContainer();
        TextureView textureView = new TextureView(context);
        this.textureView = textureView;
        textureView.setPivotX(0.0f);
        this.textureView.setPivotY(0.0f);
        ViewGroup viewGroup = this.textureViewContainer;
        if (viewGroup != null) {
            viewGroup.addView(this.textureView);
        } else {
            this.aspectRatioFrameLayout.addView(this.textureView, LayoutHelper.createFrame(-1, -1, 17));
        }
        if (this.allowInlineAnimation && this.textureViewContainer != null) {
            ImageView imageView = new ImageView(context);
            this.textureImageView = imageView;
            imageView.setBackgroundColor(-65536);
            this.textureImageView.setPivotX(0.0f);
            this.textureImageView.setPivotY(0.0f);
            this.textureImageView.setVisibility(4);
            this.textureViewContainer.addView(this.textureImageView);
        }
        VideoPlayer videoPlayer = new VideoPlayer();
        this.videoPlayer = videoPlayer;
        videoPlayer.setDelegate(this);
        this.videoPlayer.setTextureView(this.textureView);
        ControlsView controlsView = new ControlsView(context);
        this.controlsView = controlsView;
        ViewGroup viewGroup2 = this.textureViewContainer;
        if (viewGroup2 != null) {
            viewGroup2.addView(controlsView);
        } else {
            addView(controlsView, LayoutHelper.createFrame(-1, -1.0f));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context);
        this.progressView = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(this.progressView, LayoutHelper.createFrame(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.fullscreenButton = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        this.controlsView.addView(this.fullscreenButton, LayoutHelper.createFrame(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        final int i2 = 0;
        this.fullscreenButton.setOnClickListener(new View.OnClickListener(this) {
            public final WebPlayerView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$new$1(view);
                        break;
                    case 1:
                        this.f$0.lambda$new$2(view);
                        break;
                    case 2:
                        this.f$0.lambda$new$3(view);
                        break;
                    default:
                        this.f$0.lambda$new$4(view);
                        break;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.playButton = imageView3;
        imageView3.setScaleType(scaleType);
        this.controlsView.addView(this.playButton, LayoutHelper.createFrame(48, 48, 17));
        final int i3 = 1;
        this.playButton.setOnClickListener(new View.OnClickListener(this) {
            public final WebPlayerView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f$0.lambda$new$1(view);
                        break;
                    case 1:
                        this.f$0.lambda$new$2(view);
                        break;
                    case 2:
                        this.f$0.lambda$new$3(view);
                        break;
                    default:
                        this.f$0.lambda$new$4(view);
                        break;
                }
            }
        });
        if (z) {
            ImageView imageView4 = new ImageView(context);
            this.inlineButton = imageView4;
            imageView4.setScaleType(scaleType);
            this.controlsView.addView(this.inlineButton, LayoutHelper.createFrame(56, 48, 53));
            final int i4 = 2;
            this.inlineButton.setOnClickListener(new View.OnClickListener(this) {
                public final WebPlayerView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            this.f$0.lambda$new$1(view);
                            break;
                        case 1:
                            this.f$0.lambda$new$2(view);
                            break;
                        case 2:
                            this.f$0.lambda$new$3(view);
                            break;
                        default:
                            this.f$0.lambda$new$4(view);
                            break;
                    }
                }
            });
        }
        if (z2) {
            ImageView imageView5 = new ImageView(context);
            this.shareButton = imageView5;
            imageView5.setScaleType(scaleType);
            this.shareButton.setImageResource(R.drawable.ic_share_video);
            this.controlsView.addView(this.shareButton, LayoutHelper.createFrame(56, 48, 53));
            final int i5 = 3;
            this.shareButton.setOnClickListener(new View.OnClickListener(this) {
                public final WebPlayerView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i5) {
                        case 0:
                            this.f$0.lambda$new$1(view);
                            break;
                        case 1:
                            this.f$0.lambda$new$2(view);
                            break;
                        case 2:
                            this.f$0.lambda$new$3(view);
                            break;
                        default:
                            this.f$0.lambda$new$4(view);
                            break;
                    }
                }
            });
        }
        updatePlayButton();
        updateFullscreenButton();
        updateInlineButton();
        updateShareButton();
    }

    public static float access$4724(WebPlayerView webPlayerView, float f) {
        float f2 = webPlayerView.currentAlpha - f;
        webPlayerView.currentAlpha = f2;
        return f2;
    }

    private void checkAudioFocus() {
        if (this.hasAudioFocus) {
            return;
        }
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
        this.hasAudioFocus = true;
        if (audioManager.requestAudioFocus(this, 3, 1) == 1) {
            this.audioFocus = 2;
        }
    }

    private View getControlView() {
        return this.controlsView;
    }

    private View getProgressView() {
        return this.progressView;
    }

    public static String getYouTubeVideoId(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = youtubeIdRegex.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public void lambda$new$0(String str) {
        AsyncTask asyncTask = this.currentTask;
        if (asyncTask == null || asyncTask.isCancelled()) {
            return;
        }
        AsyncTask asyncTask2 = this.currentTask;
        if (asyncTask2 instanceof YoutubeVideoTask) {
            ((YoutubeVideoTask) asyncTask2).onInterfaceResult(str);
        }
    }

    public void lambda$new$1(View view) {
        if (!this.initied || this.changingTextureView || this.switchingInlineMode || !this.firstFrameRendered) {
            return;
        }
        this.inFullscreen = !this.inFullscreen;
        updateFullscreenState(true);
    }

    public void lambda$new$2(View view) {
        if (!this.initied || this.playVideoUrl == null) {
            return;
        }
        if (!this.videoPlayer.isPlayerPrepared()) {
            preparePlayer();
        }
        if (this.videoPlayer.isPlaying()) {
            this.videoPlayer.pause();
        } else {
            this.isCompleted = false;
            this.videoPlayer.play();
        }
        updatePlayButton();
    }

    public void lambda$new$3(View view) {
        if (this.textureView == null || !this.delegate.checkInlinePermissions() || this.changingTextureView || this.switchingInlineMode || !this.firstFrameRendered) {
            return;
        }
        this.switchingInlineMode = true;
        if (!this.isInline) {
            this.inFullscreen = false;
            this.delegate.prepareToSwitchInlineMode(true, this.switchToInlineRunnable, this.aspectRatioFrameLayout.getAspectRatio(), this.allowInlineAnimation);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.aspectRatioFrameLayout.getParent();
        if (viewGroup != this) {
            if (viewGroup != null) {
                viewGroup.removeView(this.aspectRatioFrameLayout);
            }
            addView(this.aspectRatioFrameLayout, 0, LayoutHelper.createFrame(-1, -1, 17));
            this.aspectRatioFrameLayout.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
        }
        Bitmap bitmap = this.currentBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.currentBitmap = null;
        }
        this.changingTextureView = true;
        this.isInline = false;
        updatePlayButton();
        updateShareButton();
        updateFullscreenButton();
        updateInlineButton();
        this.textureView.setVisibility(4);
        ViewGroup viewGroup2 = this.textureViewContainer;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.textureView);
        } else {
            this.aspectRatioFrameLayout.addView(this.textureView);
        }
        ViewGroup viewGroup3 = (ViewGroup) this.controlsView.getParent();
        if (viewGroup3 != this) {
            if (viewGroup3 != null) {
                viewGroup3.removeView(this.controlsView);
            }
            ViewGroup viewGroup4 = this.textureViewContainer;
            if (viewGroup4 != null) {
                viewGroup4.addView(this.controlsView);
            } else {
                addView(this.controlsView, 1);
            }
        }
        this.controlsView.show(false, false);
        this.delegate.prepareToSwitchInlineMode(false, null, this.aspectRatioFrameLayout.getAspectRatio(), this.allowInlineAnimation);
    }

    public void lambda$new$4(View view) {
        WebPlayerViewDelegate webPlayerViewDelegate = this.delegate;
        if (webPlayerViewDelegate != null) {
            webPlayerViewDelegate.onSharePressed();
        }
    }

    public void lambda$onAudioFocusChange$5(int i) {
        if (i == -1) {
            if (this.videoPlayer.isPlaying()) {
                this.videoPlayer.pause();
                updatePlayButton();
            }
            this.hasAudioFocus = false;
            this.audioFocus = 0;
            return;
        }
        if (i == 1) {
            this.audioFocus = 2;
            if (this.resumeAudioOnFocusGain) {
                this.resumeAudioOnFocusGain = false;
                this.videoPlayer.play();
                return;
            }
            return;
        }
        if (i == -3) {
            this.audioFocus = 1;
            return;
        }
        if (i == -2) {
            this.audioFocus = 0;
            if (this.videoPlayer.isPlaying()) {
                this.resumeAudioOnFocusGain = true;
                this.videoPlayer.pause();
                updatePlayButton();
            }
        }
    }

    public void onInitFailed() {
        if (this.controlsView.getParent() != this) {
            this.controlsView.setVisibility(8);
        }
        this.delegate.onInitFailed();
    }

    public void preparePlayer() {
        String str = this.playVideoUrl;
        if (str == null) {
            return;
        }
        if (this.playAudioUrl != null) {
            this.videoPlayer.preparePlayerLoop(Uri.parse(str), this.playVideoType, Uri.parse(this.playAudioUrl), this.playAudioType);
        } else {
            this.videoPlayer.preparePlayer(Uri.parse(str), this.playVideoType);
        }
        this.videoPlayer.setPlayWhenReady(this.isAutoplay);
        this.isLoading = false;
        if (this.videoPlayer.getDuration() != -9223372036854775807L) {
            this.controlsView.setDuration((int) (this.videoPlayer.getDuration() / 1000));
        } else {
            this.controlsView.setDuration(0);
        }
        updateFullscreenButton();
        updateShareButton();
        updateInlineButton();
        this.controlsView.invalidate();
        int i = this.seekToTime;
        if (i != -1) {
            this.videoPlayer.seekTo(i * 1000);
        }
    }

    public void showProgress(boolean z, boolean z2) {
        if (!z2) {
            this.progressView.setAlpha(z ? 1.0f : 0.0f);
            return;
        }
        AnimatorSet animatorSet = this.progressAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.progressAnimation = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.progressView, "alpha", z ? 1.0f : 0.0f));
        this.progressAnimation.setDuration(150L);
        this.progressAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                WebPlayerView.this.progressAnimation = null;
            }
        });
        this.progressAnimation.start();
    }

    public void updateFullscreenButton() {
        if (!this.videoPlayer.isPlayerPrepared() || this.isInline) {
            this.fullscreenButton.setVisibility(8);
            return;
        }
        this.fullscreenButton.setVisibility(0);
        if (this.inFullscreen) {
            this.fullscreenButton.setImageResource(R.drawable.ic_outfullscreen);
            this.fullscreenButton.setLayoutParams(LayoutHelper.createFrame(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
        } else {
            this.fullscreenButton.setImageResource(R.drawable.ic_gofullscreen);
            this.fullscreenButton.setLayoutParams(LayoutHelper.createFrame(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        }
    }

    private void updateFullscreenState(boolean z) {
        ViewGroup viewGroup;
        if (this.textureView == null) {
            return;
        }
        updateFullscreenButton();
        ViewGroup viewGroup2 = this.textureViewContainer;
        if (viewGroup2 != null) {
            if (this.inFullscreen) {
                ViewGroup viewGroup3 = (ViewGroup) this.aspectRatioFrameLayout.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.aspectRatioFrameLayout);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) this.aspectRatioFrameLayout.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(this.aspectRatioFrameLayout);
                    }
                    addView(this.aspectRatioFrameLayout, 0);
                }
            }
            this.delegate.onSwitchToFullscreen(this.controlsView, this.inFullscreen, this.aspectRatioFrameLayout.getAspectRatio(), this.aspectRatioFrameLayout.getVideoRotation(), z);
            return;
        }
        this.changingTextureView = true;
        if (!this.inFullscreen) {
            if (viewGroup2 != null) {
                viewGroup2.addView(this.textureView);
            } else {
                this.aspectRatioFrameLayout.addView(this.textureView);
            }
        }
        if (this.inFullscreen) {
            ViewGroup viewGroup5 = (ViewGroup) this.controlsView.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(this.controlsView);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) this.controlsView.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(this.controlsView);
                }
                ViewGroup viewGroup7 = this.textureViewContainer;
                if (viewGroup7 != null) {
                    viewGroup7.addView(this.controlsView);
                } else {
                    addView(this.controlsView, 1);
                }
            }
        }
        TextureView textureViewOnSwitchToFullscreen = this.delegate.onSwitchToFullscreen(this.controlsView, this.inFullscreen, this.aspectRatioFrameLayout.getAspectRatio(), this.aspectRatioFrameLayout.getVideoRotation(), z);
        this.changedTextureView = textureViewOnSwitchToFullscreen;
        textureViewOnSwitchToFullscreen.setVisibility(4);
        if (this.inFullscreen && this.changedTextureView != null && (viewGroup = (ViewGroup) this.textureView.getParent()) != null) {
            viewGroup.removeView(this.textureView);
        }
        this.controlsView.checkNeedHide();
    }

    public void updateInlineButton() {
        ImageView imageView = this.inlineButton;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(this.isInline ? R.drawable.ic_goinline : R.drawable.ic_outinline);
        this.inlineButton.setVisibility(this.videoPlayer.isPlayerPrepared() ? 0 : 8);
        if (this.isInline) {
            this.inlineButton.setLayoutParams(LayoutHelper.createFrame(40, 40, 53));
        } else {
            this.inlineButton.setLayoutParams(LayoutHelper.createFrame(56, 50, 53));
        }
    }

    public void updatePlayButton() {
        this.controlsView.checkNeedHide();
        AndroidUtilities.cancelRunOnUIThread(this.progressRunnable);
        if (this.videoPlayer.isPlaying()) {
            this.playButton.setImageResource(this.isInline ? R.drawable.ic_pauseinline : R.drawable.ic_pause);
            AndroidUtilities.runOnUIThread(this.progressRunnable, 500L);
            checkAudioFocus();
        } else if (this.isCompleted) {
            this.playButton.setImageResource(this.isInline ? R.drawable.ic_againinline : R.drawable.ic_again);
        } else {
            this.playButton.setImageResource(this.isInline ? R.drawable.ic_playinline : R.drawable.ic_play);
        }
    }

    public void updateShareButton() {
        ImageView imageView = this.shareButton;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility((this.isInline || !this.videoPlayer.isPlayerPrepared()) ? 8 : 0);
    }

    public boolean canHandleUrl(String str) {
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

    public void destroy() {
        this.videoPlayer.releasePlayer(false);
        AsyncTask asyncTask = this.currentTask;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.currentTask = null;
        }
        this.webView.stopLoading();
    }

    public String downloadUrlContent(AsyncTask asyncTask, String str) {
        return downloadUrlContent(asyncTask, str, null, true);
    }

    public void enterFullscreen() {
        if (this.inFullscreen) {
            return;
        }
        this.inFullscreen = true;
        updateInlineButton();
        updateFullscreenState(false);
    }

    public void exitFullscreen() {
        if (this.inFullscreen) {
            this.inFullscreen = false;
            updateInlineButton();
            updateFullscreenState(false);
        }
    }

    public View getAspectRatioView() {
        return this.aspectRatioFrameLayout;
    }

    public View getControlsView() {
        return this.controlsView;
    }

    public String getCoubId(String str) {
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

    public ImageView getTextureImageView() {
        return this.textureImageView;
    }

    public TextureView getTextureView() {
        return this.textureView;
    }

    public String getYoutubeId() {
        return this.currentYoutubeId;
    }

    public boolean isInFullscreen() {
        return this.inFullscreen;
    }

    public boolean isInitied() {
        return this.initied;
    }

    public boolean isInline() {
        return this.isInline || this.switchingInlineMode;
    }

    public boolean loadVideo(String str, TLRPC.Photo photo, Object obj, String str2, boolean z) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        AsyncTask asyncTask;
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
            updateShareButton();
            updateInlineButton();
            updatePlayButton();
            if (photo != null) {
                c = 2;
                closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 80, true);
                if (closestPhotoSizeWithSize != null) {
                    this.controlsView.imageReceiver.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "80_80_b", 0L, null, obj, 1);
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
            this.isLoading = true;
            this.controlsView.setProgress(0);
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
                this.controlsView.show(true, true);
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
                    VimeoVideoTask vimeoVideoTask = new VimeoVideoTask(str8);
                    Executor executor2 = AsyncTask.THREAD_POOL_EXECUTOR;
                    Void[] voidArr2 = new Void[3];
                    voidArr2[0] = null;
                    voidArr2[1] = null;
                    voidArr2[c] = null;
                    vimeoVideoTask.executeOnExecutor(executor2, voidArr2);
                    this.currentTask = vimeoVideoTask;
                } else if (coubId != null) {
                    CoubVideoTask coubVideoTask = new CoubVideoTask(coubId);
                    Executor executor3 = AsyncTask.THREAD_POOL_EXECUTOR;
                    Void[] voidArr3 = new Void[3];
                    voidArr3[0] = null;
                    voidArr3[1] = null;
                    voidArr3[c] = null;
                    coubVideoTask.executeOnExecutor(executor3, voidArr3);
                    this.currentTask = coubVideoTask;
                    this.isStream = true;
                } else if (str7 != null) {
                    AparatVideoTask aparatVideoTask = new AparatVideoTask(str7);
                    Executor executor4 = AsyncTask.THREAD_POOL_EXECUTOR;
                    Void[] voidArr4 = new Void[3];
                    voidArr4[0] = null;
                    voidArr4[1] = null;
                    voidArr4[c] = null;
                    aparatVideoTask.executeOnExecutor(executor4, voidArr4);
                    this.currentTask = aparatVideoTask;
                } else if (str6 != null) {
                    TwitchClipVideoTask twitchClipVideoTask = new TwitchClipVideoTask(str, str6);
                    Executor executor5 = AsyncTask.THREAD_POOL_EXECUTOR;
                    Void[] voidArr5 = new Void[3];
                    voidArr5[0] = null;
                    voidArr5[1] = null;
                    voidArr5[c] = null;
                    twitchClipVideoTask.executeOnExecutor(executor5, voidArr5);
                    this.currentTask = twitchClipVideoTask;
                } else if (str5 != null) {
                    TwitchStreamVideoTask twitchStreamVideoTask = new TwitchStreamVideoTask(str, str5);
                    Executor executor6 = AsyncTask.THREAD_POOL_EXECUTOR;
                    Void[] voidArr6 = new Void[3];
                    voidArr6[0] = null;
                    voidArr6[1] = null;
                    voidArr6[c] = null;
                    twitchStreamVideoTask.executeOnExecutor(executor6, voidArr6);
                    this.currentTask = twitchStreamVideoTask;
                    this.isStream = true;
                }
                this.controlsView.show(false, false);
                showProgress(true, false);
            }
            if (str4 != null && str8 == null && coubId == null && str7 == null && str3 == null && str6 == null && str5 == null) {
                this.controlsView.setVisibility(8);
                return false;
            }
            this.controlsView.setVisibility(0);
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
        updateShareButton();
        updateInlineButton();
        updatePlayButton();
        if (photo != null) {
            c = 2;
            closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 80, true);
            if (closestPhotoSizeWithSize != null) {
                this.controlsView.imageReceiver.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "80_80_b", 0L, null, obj, 1);
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
        this.isLoading = true;
        this.controlsView.setProgress(0);
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
            this.controlsView.show(true, true);
        } else {
            if (str4 != null) {
                YoutubeVideoTask youtubeVideoTask2 = new YoutubeVideoTask(str4);
                Executor executor7 = AsyncTask.THREAD_POOL_EXECUTOR;
                Void[] voidArr7 = new Void[3];
                voidArr7[0] = null;
                voidArr7[1] = null;
                voidArr7[c] = null;
                youtubeVideoTask2.executeOnExecutor(executor7, voidArr7);
                this.currentTask = youtubeVideoTask2;
            } else if (str8 != null) {
                VimeoVideoTask vimeoVideoTask2 = new VimeoVideoTask(str8);
                Executor executor8 = AsyncTask.THREAD_POOL_EXECUTOR;
                Void[] voidArr8 = new Void[3];
                voidArr8[0] = null;
                voidArr8[1] = null;
                voidArr8[c] = null;
                vimeoVideoTask2.executeOnExecutor(executor8, voidArr8);
                this.currentTask = vimeoVideoTask2;
            } else if (coubId != null) {
                CoubVideoTask coubVideoTask2 = new CoubVideoTask(coubId);
                Executor executor9 = AsyncTask.THREAD_POOL_EXECUTOR;
                Void[] voidArr9 = new Void[3];
                voidArr9[0] = null;
                voidArr9[1] = null;
                voidArr9[c] = null;
                coubVideoTask2.executeOnExecutor(executor9, voidArr9);
                this.currentTask = coubVideoTask2;
                this.isStream = true;
            } else if (str7 != null) {
                AparatVideoTask aparatVideoTask2 = new AparatVideoTask(str7);
                Executor executor10 = AsyncTask.THREAD_POOL_EXECUTOR;
                Void[] voidArr10 = new Void[3];
                voidArr10[0] = null;
                voidArr10[1] = null;
                voidArr10[c] = null;
                aparatVideoTask2.executeOnExecutor(executor10, voidArr10);
                this.currentTask = aparatVideoTask2;
            } else if (str6 != null) {
                TwitchClipVideoTask twitchClipVideoTask2 = new TwitchClipVideoTask(str, str6);
                Executor executor11 = AsyncTask.THREAD_POOL_EXECUTOR;
                Void[] voidArr11 = new Void[3];
                voidArr11[0] = null;
                voidArr11[1] = null;
                voidArr11[c] = null;
                twitchClipVideoTask2.executeOnExecutor(executor11, voidArr11);
                this.currentTask = twitchClipVideoTask2;
            } else if (str5 != null) {
                TwitchStreamVideoTask twitchStreamVideoTask2 = new TwitchStreamVideoTask(str, str5);
                Executor executor12 = AsyncTask.THREAD_POOL_EXECUTOR;
                Void[] voidArr12 = new Void[3];
                voidArr12[0] = null;
                voidArr12[1] = null;
                voidArr12[c] = null;
                twitchStreamVideoTask2.executeOnExecutor(executor12, voidArr12);
                this.currentTask = twitchStreamVideoTask2;
                this.isStream = true;
            }
            this.controlsView.show(false, false);
            showProgress(true, false);
        }
        if (str4 != null) {
        }
        this.controlsView.setVisibility(0);
        return true;
    }

    @Override
    public void onAudioFocusChange(int i) {
        AndroidUtilities.runOnUIThread(new EmojiView$$ExternalSyntheticLambda9(this, i, 18));
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.backgroundPaint);
    }

    @Override
    public void onError(VideoPlayer videoPlayer, Exception exc) {
        FileLog.e(exc);
        onInitFailed();
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int measuredWidth = (i5 - this.aspectRatioFrameLayout.getMeasuredWidth()) / 2;
        int i6 = i4 - i2;
        int iDp = ((i6 - AndroidUtilities.dp(10.0f)) - this.aspectRatioFrameLayout.getMeasuredHeight()) / 2;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.aspectRatioFrameLayout;
        aspectRatioFrameLayout.layout(measuredWidth, iDp, aspectRatioFrameLayout.getMeasuredWidth() + measuredWidth, this.aspectRatioFrameLayout.getMeasuredHeight() + iDp);
        if (this.controlsView.getParent() == this) {
            ControlsView controlsView = this.controlsView;
            controlsView.layout(0, 0, controlsView.getMeasuredWidth(), this.controlsView.getMeasuredHeight());
        }
        int measuredWidth2 = (i5 - this.progressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i6 - this.progressView.getMeasuredHeight()) / 2;
        RadialProgressView radialProgressView = this.progressView;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, this.progressView.getMeasuredHeight() + measuredHeight);
        this.controlsView.imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.aspectRatioFrameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        if (this.controlsView.getParent() == this) {
            this.controlsView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.progressView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime) {
        VideoPlayer.VideoPlayerDelegate.CC.$default$onRenderedFirstFrame(this, eventTime);
    }

    @Override
    public final void onSeekFinished(AnalyticsListener.EventTime eventTime) {
        VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekFinished(this, eventTime);
    }

    @Override
    public final void onSeekStarted(AnalyticsListener.EventTime eventTime) {
        VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekStarted(this, eventTime);
    }

    @Override
    public void onStateChanged(boolean z, int i) {
        if (i != 2) {
            if (this.videoPlayer.getDuration() != -9223372036854775807L) {
                this.controlsView.setDuration((int) (this.videoPlayer.getDuration() / 1000));
            } else {
                this.controlsView.setDuration(0);
            }
        }
        if (i == 4 || i == 1 || !this.videoPlayer.isPlaying()) {
            this.delegate.onPlayStateChanged(this, false);
        } else {
            this.delegate.onPlayStateChanged(this, true);
        }
        if (this.videoPlayer.isPlaying() && i != 4) {
            updatePlayButton();
            return;
        }
        if (i == 4) {
            this.isCompleted = true;
            this.videoPlayer.pause();
            this.videoPlayer.seekTo(0L);
            updatePlayButton();
            this.controlsView.show(true, true);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
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
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
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
            this.delegate.onSwitchInlineMode(this.controlsView, false, this.videoWidth, this.videoHeight, this.aspectRatioFrameLayout.getVideoRotation(), this.allowInlineAnimation);
            this.waitingForFirstTextureUpload = 0;
        }
    }

    @Override
    public void onVideoSizeChanged(int i, int i2, int i3, float f) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            if (i3 != 90 && i3 != 270) {
                i2 = i;
                i = i2;
            }
            float f2 = i2 * f;
            this.videoWidth = (int) f2;
            this.videoHeight = i;
            float f3 = i == 0 ? 1.0f : f2 / i;
            aspectRatioFrameLayout.setAspectRatio(f3, i3);
            if (this.inFullscreen) {
                this.delegate.onVideoSizeChanged(f3, i3);
            }
        }
    }

    public void pause() {
        this.videoPlayer.pause();
        updatePlayButton();
        this.controlsView.show(true, true);
    }

    public void updateTextureImageView() {
        if (this.textureImageView == null) {
            return;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmaps.createBitmap(this.textureView.getWidth(), this.textureView.getHeight(), Bitmap.Config.ARGB_8888);
            this.currentBitmap = bitmapCreateBitmap;
            this.changedTextureView.getBitmap(bitmapCreateBitmap);
        } catch (Throwable th) {
            Bitmap bitmap = this.currentBitmap;
            if (bitmap != null) {
                bitmap.recycle();
                this.currentBitmap = null;
            }
            FileLog.e(th);
        }
        if (this.currentBitmap == null) {
            this.textureImageView.setImageDrawable(null);
        } else {
            this.textureImageView.setVisibility(0);
            this.textureImageView.setImageBitmap(this.currentBitmap);
        }
    }

    public void willHandle() {
        this.controlsView.setVisibility(4);
        this.controlsView.show(false, false);
        showProgress(true, false);
    }

    public String downloadUrlContent(AsyncTask asyncTask, String str, HashMap<String, String> map, boolean z) {
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
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        uRLConnectionOpenConnection.addRequestProperty(entry.getKey(), entry.getValue());
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
                            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                                uRLConnectionOpenConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
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

    @Override
    public void onRenderedFirstFrame() {
        this.firstFrameRendered = true;
        this.lastUpdateTime = System.currentTimeMillis();
        this.controlsView.invalidate();
    }
}
