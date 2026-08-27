package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.widget.ImageView;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class i81 extends ViewGroup implements j61, AudioManager.OnAudioFocusChangeListener {

    public static final Pattern f29280h0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");

    public static final Pattern f29281i0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");

    public static final Pattern f29282j0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");

    public static final Pattern f29283k0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");

    public static final Pattern f29284l0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");

    public static final Pattern f29285n0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");

    public static final Pattern f29286o0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");

    public static final Pattern f29287p0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");

    public static final Pattern f29288q0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");

    public static final Pattern f29289r0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");

    public static final Pattern f29290s0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");

    public static final Pattern f29291t0 = Pattern.compile("var\\s");

    public static final Pattern f29292u0 = Pattern.compile("return(?:\\s+|$)");

    public static final Pattern f29293v0 = Pattern.compile("[()]");

    public static final Pattern f29294w0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");
    public String A;
    public String B;
    public String C;
    public boolean D;
    public final boolean E;
    public boolean F;
    public boolean G;
    public long H;
    public boolean I;
    public float J;
    public int K;
    public boolean L;
    public final Paint M;
    public AsyncTask N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final RadialProgressView T;
    public final ImageView U;
    public final ImageView V;
    public final ImageView W;

    public final m61 f29295a;

    public AnimatorSet f29296a0;

    public final b81 f29297b;

    public final e81 f29298b0;

    public final kf0 f29299c;

    public int f29300c0;
    public final TextureView d;

    public int f29301d0;

    public final ImageView f29302e;

    public final a81 f29303e0;

    public final ViewGroup f29304f;

    public final eh.h f29305f0;

    public final a81 f29306g0;
    public Bitmap h;

    public TextureView f29307n;

    public int f29308r;

    public boolean f29309s;
    public final f81 v;

    public boolean f29310w;

    public String f29311x;

    public String f29312y;

    public i81(Context context, boolean z10, f81 f81Var) {
        super(context);
        this.E = true;
        Paint paint = new Paint();
        this.M = paint;
        this.f29303e0 = new a81(this, 0);
        this.f29305f0 = new eh.h(this, 4);
        this.f29306g0 = new a81(this, 1);
        setWillNotDraw(false);
        this.v = f81Var;
        paint.setColor(-16777216);
        kf0 kf0Var = new kf0(this, context, 1);
        this.f29299c = kf0Var;
        addView(kf0Var, h7.z5.e(-1, -1, 17));
        b81 b81Var = new b81(context, context);
        this.f29297b = b81Var;
        final y71 y71Var = new y71(this);
        b81Var.addJavascriptInterface(new Object(y71Var) {

            public final y71 f26583a;

            {
                this.f26583a = y71Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                i81 i81Var = (i81) this.f26583a.f34844a;
                AsyncTask asyncTask = i81Var.N;
                if (asyncTask == null || asyncTask.isCancelled()) {
                    return;
                }
                AsyncTask asyncTask2 = i81Var.N;
                if (asyncTask2 instanceof h81) {
                    h81 h81Var = (h81) asyncTask2;
                    String[] strArr = h81Var.f28943c;
                    strArr[0] = strArr[0].replace(h81Var.d, "/signature/" + str);
                    h81Var.f28942b.countDown();
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = b81Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup viewGroupG = f81Var.g();
        this.f29304f = viewGroupG;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (viewGroupG != null) {
            viewGroupG.addView(textureView);
        } else {
            kf0Var.addView(textureView, h7.z5.e(-1, -1, 17));
        }
        if (viewGroupG != null) {
            ImageView imageView = new ImageView(context);
            this.f29302e = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            viewGroupG.addView(imageView);
        }
        m61 m61Var = new m61();
        this.f29295a = m61Var;
        m61Var.F = this;
        m61Var.W(textureView);
        e81 e81Var = new e81(this, context);
        this.f29298b0 = e81Var;
        if (viewGroupG != null) {
            viewGroupG.addView(e81Var);
        } else {
            addView(e81Var, h7.z5.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.T = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, h7.z5.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.U = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        e81Var.addView(imageView2, h7.z5.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        final int i10 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) {

            public final i81 f35188b;

            {
                this.f35188b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        i81 i81Var = this.f35188b;
                        if (i81Var.f29310w && !i81Var.O && !i81Var.S && i81Var.I) {
                            i81Var.P = !i81Var.P;
                            i81Var.l(true);
                            break;
                        }
                        break;
                    case 1:
                        i81 i81Var2 = this.f35188b;
                        m61 m61Var2 = i81Var2.f29295a;
                        if (i81Var2.f29310w && i81Var2.f29311x != null) {
                            if (m61Var2.d == null) {
                                i81Var2.i();
                            }
                            if (m61Var2.z()) {
                                m61Var2.C();
                            } else {
                                i81Var2.R = false;
                                m61Var2.D();
                            }
                            i81Var2.n();
                            break;
                        }
                        break;
                    default:
                        i81 i81Var3 = this.f35188b;
                        ViewGroup viewGroup = i81Var3.f29304f;
                        boolean z11 = i81Var3.E;
                        f81 f81Var2 = i81Var3.v;
                        e81 e81Var2 = i81Var3.f29298b0;
                        kf0 kf0Var2 = i81Var3.f29299c;
                        TextureView textureView2 = i81Var3.d;
                        if (textureView2 != null && f81Var2.h() && !i81Var3.O && !i81Var3.S && i81Var3.I) {
                            i81Var3.S = true;
                            if (!i81Var3.Q) {
                                i81Var3.P = false;
                                f81Var2.i(true, i81Var3.f29306g0, kf0Var2.getAspectRatio(), z11);
                            } else {
                                ViewGroup viewGroup2 = (ViewGroup) kf0Var2.getParent();
                                if (viewGroup2 != i81Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(kf0Var2);
                                    }
                                    i81Var3.addView(kf0Var2, 0, h7.z5.e(-1, -1, 17));
                                    kf0Var2.measure(View.MeasureSpec.makeMeasureSpec(i81Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i81Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                }
                                Bitmap bitmap = i81Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    i81Var3.h = null;
                                }
                                i81Var3.O = true;
                                i81Var3.Q = false;
                                i81Var3.n();
                                i81Var3.o();
                                i81Var3.k();
                                i81Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    kf0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) e81Var2.getParent();
                                if (viewGroup3 != i81Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(e81Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(e81Var2);
                                    } else {
                                        i81Var3.addView(e81Var2, 1);
                                    }
                                }
                                e81Var2.d(false, false);
                                f81Var2.i(false, null, kf0Var2.getAspectRatio(), z11);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.V = imageView3;
        imageView3.setScaleType(scaleType);
        e81Var.addView(imageView3, h7.z5.e(48, 48, 17));
        final int i11 = 1;
        imageView3.setOnClickListener(new View.OnClickListener(this) {

            public final i81 f35188b;

            {
                this.f35188b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        i81 i81Var = this.f35188b;
                        if (i81Var.f29310w && !i81Var.O && !i81Var.S && i81Var.I) {
                            i81Var.P = !i81Var.P;
                            i81Var.l(true);
                            break;
                        }
                        break;
                    case 1:
                        i81 i81Var2 = this.f35188b;
                        m61 m61Var2 = i81Var2.f29295a;
                        if (i81Var2.f29310w && i81Var2.f29311x != null) {
                            if (m61Var2.d == null) {
                                i81Var2.i();
                            }
                            if (m61Var2.z()) {
                                m61Var2.C();
                            } else {
                                i81Var2.R = false;
                                m61Var2.D();
                            }
                            i81Var2.n();
                            break;
                        }
                        break;
                    default:
                        i81 i81Var3 = this.f35188b;
                        ViewGroup viewGroup = i81Var3.f29304f;
                        boolean z11 = i81Var3.E;
                        f81 f81Var2 = i81Var3.v;
                        e81 e81Var2 = i81Var3.f29298b0;
                        kf0 kf0Var2 = i81Var3.f29299c;
                        TextureView textureView2 = i81Var3.d;
                        if (textureView2 != null && f81Var2.h() && !i81Var3.O && !i81Var3.S && i81Var3.I) {
                            i81Var3.S = true;
                            if (!i81Var3.Q) {
                                i81Var3.P = false;
                                f81Var2.i(true, i81Var3.f29306g0, kf0Var2.getAspectRatio(), z11);
                            } else {
                                ViewGroup viewGroup2 = (ViewGroup) kf0Var2.getParent();
                                if (viewGroup2 != i81Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(kf0Var2);
                                    }
                                    i81Var3.addView(kf0Var2, 0, h7.z5.e(-1, -1, 17));
                                    kf0Var2.measure(View.MeasureSpec.makeMeasureSpec(i81Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i81Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                }
                                Bitmap bitmap = i81Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    i81Var3.h = null;
                                }
                                i81Var3.O = true;
                                i81Var3.Q = false;
                                i81Var3.n();
                                i81Var3.o();
                                i81Var3.k();
                                i81Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    kf0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) e81Var2.getParent();
                                if (viewGroup3 != i81Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(e81Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(e81Var2);
                                    } else {
                                        i81Var3.addView(e81Var2, 1);
                                    }
                                }
                                e81Var2.d(false, false);
                                f81Var2.i(false, null, kf0Var2.getAspectRatio(), z11);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.W = imageView4;
            imageView4.setScaleType(scaleType);
            e81Var.addView(imageView4, h7.z5.e(56, 48, 53));
            final int i12 = 2;
            imageView4.setOnClickListener(new View.OnClickListener(this) {

                public final i81 f35188b;

                {
                    this.f35188b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            i81 i81Var = this.f35188b;
                            if (i81Var.f29310w && !i81Var.O && !i81Var.S && i81Var.I) {
                                i81Var.P = !i81Var.P;
                                i81Var.l(true);
                                break;
                            }
                            break;
                        case 1:
                            i81 i81Var2 = this.f35188b;
                            m61 m61Var2 = i81Var2.f29295a;
                            if (i81Var2.f29310w && i81Var2.f29311x != null) {
                                if (m61Var2.d == null) {
                                    i81Var2.i();
                                }
                                if (m61Var2.z()) {
                                    m61Var2.C();
                                } else {
                                    i81Var2.R = false;
                                    m61Var2.D();
                                }
                                i81Var2.n();
                                break;
                            }
                            break;
                        default:
                            i81 i81Var3 = this.f35188b;
                            ViewGroup viewGroup = i81Var3.f29304f;
                            boolean z11 = i81Var3.E;
                            f81 f81Var2 = i81Var3.v;
                            e81 e81Var2 = i81Var3.f29298b0;
                            kf0 kf0Var2 = i81Var3.f29299c;
                            TextureView textureView2 = i81Var3.d;
                            if (textureView2 != null && f81Var2.h() && !i81Var3.O && !i81Var3.S && i81Var3.I) {
                                i81Var3.S = true;
                                if (!i81Var3.Q) {
                                    i81Var3.P = false;
                                    f81Var2.i(true, i81Var3.f29306g0, kf0Var2.getAspectRatio(), z11);
                                } else {
                                    ViewGroup viewGroup2 = (ViewGroup) kf0Var2.getParent();
                                    if (viewGroup2 != i81Var3) {
                                        if (viewGroup2 != null) {
                                            viewGroup2.removeView(kf0Var2);
                                        }
                                        i81Var3.addView(kf0Var2, 0, h7.z5.e(-1, -1, 17));
                                        kf0Var2.measure(View.MeasureSpec.makeMeasureSpec(i81Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i81Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                    }
                                    Bitmap bitmap = i81Var3.h;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        i81Var3.h = null;
                                    }
                                    i81Var3.O = true;
                                    i81Var3.Q = false;
                                    i81Var3.n();
                                    i81Var3.o();
                                    i81Var3.k();
                                    i81Var3.m();
                                    textureView2.setVisibility(4);
                                    if (viewGroup != null) {
                                        viewGroup.addView(textureView2);
                                    } else {
                                        kf0Var2.addView(textureView2);
                                    }
                                    ViewGroup viewGroup3 = (ViewGroup) e81Var2.getParent();
                                    if (viewGroup3 != i81Var3) {
                                        if (viewGroup3 != null) {
                                            viewGroup3.removeView(e81Var2);
                                        }
                                        if (viewGroup != null) {
                                            viewGroup.addView(e81Var2);
                                        } else {
                                            i81Var3.addView(e81Var2, 1);
                                        }
                                    }
                                    e81Var2.d(false, false);
                                    f81Var2.i(false, null, kf0Var2.getAspectRatio(), z11);
                                }
                                break;
                            }
                            break;
                    }
                }
            });
        }
        n();
        k();
        m();
        o();
    }

    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        if (!str.endsWith(".mp4")) {
            try {
                Matcher matcher = f29280h0.matcher(str);
                if ((matcher.find() ? matcher.group(1) : null) == null) {
                    try {
                        Matcher matcher2 = f29281i0.matcher(str);
                        if ((matcher2.find() ? matcher2.group(3) : null) == null) {
                            try {
                                Matcher matcher3 = f29283k0.matcher(str);
                                if ((matcher3.find() ? matcher3.group(1) : null) == null) {
                                    try {
                                        Matcher matcher4 = f29284l0.matcher(str);
                                        if ((matcher4.find() ? matcher4.group(1) : null) == null) {
                                            try {
                                                Matcher matcher5 = m0.matcher(str);
                                                if ((matcher5.find() ? matcher5.group(1) : null) == null) {
                                                    try {
                                                        Matcher matcher6 = f29282j0.matcher(str);
                                                        if ((matcher6.find() ? matcher6.group(1) : null) == null) {
                                                            return false;
                                                        }
                                                    } catch (Exception e9) {
                                                        FileLog.e(e9);
                                                        return false;
                                                    }
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                            }
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                }
                            } catch (Exception e12) {
                                FileLog.e(e12);
                            }
                        }
                    } catch (Exception e13) {
                        FileLog.e(e13);
                    }
                }
            } catch (Exception e14) {
                FileLog.e(e14);
            }
        }
        return true;
    }

    public static String c(AsyncTask asyncTask, String str, HashMap map, boolean z10) {
        URLConnection uRLConnectionOpenConnection;
        boolean z11;
        InputStream inputStream;
        StringBuilder sb2;
        boolean z12;
        InputStream inputStream2;
        boolean z13 = true;
        try {
            URL url = new URL(str);
            uRLConnectionOpenConnection = url.openConnection();
            try {
                uRLConnectionOpenConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
                if (z10) {
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
                        if (z10) {
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
                if (z10) {
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
                z11 = true;
            } catch (Throwable th) {
                th = th;
                boolean z14 = !(th instanceof SocketTimeoutException) ? !(!(th instanceof UnknownHostException) && (!(th instanceof SocketException) ? (th instanceof FileNotFoundException) : !(th.getMessage() == null || !th.getMessage().contains("ECONNRESET")))) : ApplicationLoader.isNetworkOnline();
                FileLog.e(th);
                z11 = z14;
                inputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            uRLConnectionOpenConnection = null;
        }
        if (z11) {
            try {
                if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                    ((HttpURLConnection) uRLConnectionOpenConnection).getResponseCode();
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            if (inputStream != null) {
                try {
                    byte[] bArr = new byte[32768];
                    sb2 = null;
                    while (true) {
                        try {
                            if (!asyncTask.isCancelled()) {
                                try {
                                    int i10 = inputStream.read(bArr);
                                    if (i10 <= 0) {
                                        if (i10 == -1) {
                                            break;
                                        }
                                        break;
                                    }
                                    if (sb2 == null) {
                                        sb2 = new StringBuilder();
                                    }
                                    try {
                                        try {
                                            sb2.append(new String(bArr, 0, i10, "UTF-8"));
                                        } catch (Exception e10) {
                                            e = e10;
                                            FileLog.e(e);
                                            z13 = false;
                                            z12 = z13;
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Throwable th3) {
                                                    FileLog.e(th3);
                                                }
                                            }
                                            if (z12) {
                                                return sb2.toString();
                                            }
                                            return null;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        FileLog.e(th);
                                        z12 = false;
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        if (z12) {
                                            return sb2.toString();
                                        }
                                        return null;
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                }
                            }
                            z13 = false;
                            break;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                    z12 = z13;
                } catch (Throwable th6) {
                    th = th6;
                    sb2 = null;
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } else {
                sb2 = null;
            }
            z12 = false;
            if (inputStream != null) {
                inputStream.close();
            }
        } else {
            sb2 = null;
            z12 = false;
        }
        if (z12) {
            return sb2.toString();
        }
        return null;
    }

    public static String d(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f29282j0.matcher(str);
                String strGroup = matcher.find() ? matcher.group(1) : null;
                if (strGroup != null) {
                    return strGroup;
                }
            } catch (Exception e9) {
                FileLog.e(e9);
                return null;
            }
        }
        return null;
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f29280h0.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private View getControlView() {
        return this.f29298b0;
    }

    private View getProgressView() {
        return this.T;
    }

    public final void b() {
        this.f29295a.I();
        AsyncTask asyncTask = this.N;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.N = null;
        }
        this.f29297b.stopLoading();
    }

    public final boolean f() {
        return this.Q || this.S;
    }

    public final boolean g(String str, TLRPC.Photo photo, Object obj, String str2, boolean z10) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        AsyncTask asyncTask;
        e81 e81Var;
        AnimatorSet animatorSet;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        String strD = d(str);
        if (strD == null) {
            strD = d(str2);
        }
        this.K = -1;
        if (strD == null && str != null) {
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
                                    this.K = (Utilities.parseInt((CharSequence) strArrSplit[0]).intValue() * 60) + Utilities.parseInt((CharSequence) strArrSplit[1]).intValue();
                                } else {
                                    this.K = Utilities.parseInt((CharSequence) queryParameter).intValue();
                                }
                            }
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                    }
                    Matcher matcher = f29280h0.matcher(str);
                    String strGroup = matcher.find() ? matcher.group(1) : null;
                    if (strGroup == null) {
                        strGroup = null;
                    }
                    str4 = strGroup;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    str4 = null;
                }
                if (str4 == null) {
                    try {
                        Matcher matcher2 = f29281i0.matcher(str);
                        String strGroup2 = matcher2.find() ? matcher2.group(3) : null;
                        if (strGroup2 == null) {
                            strGroup2 = null;
                        }
                        str8 = strGroup2;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        str8 = null;
                    }
                } else {
                    str8 = null;
                }
                if (str8 == null) {
                    try {
                        Matcher matcher3 = f29283k0.matcher(str);
                        String strGroup3 = matcher3.find() ? matcher3.group(1) : null;
                        if (strGroup3 == null) {
                            strGroup3 = null;
                        }
                        str7 = strGroup3;
                    } catch (Exception e12) {
                        FileLog.e(e12);
                        str7 = null;
                    }
                } else {
                    str7 = null;
                }
                if (str7 == null) {
                    try {
                        Matcher matcher4 = f29284l0.matcher(str);
                        String strGroup4 = matcher4.find() ? matcher4.group(1) : null;
                        if (strGroup4 == null) {
                            strGroup4 = null;
                        }
                        str6 = strGroup4;
                    } catch (Exception e13) {
                        FileLog.e(e13);
                        str6 = null;
                    }
                } else {
                    str6 = null;
                }
                if (str6 == null) {
                    try {
                        Matcher matcher5 = m0.matcher(str);
                        String strGroup5 = matcher5.find() ? matcher5.group(1) : null;
                        if (strGroup5 == null) {
                            strGroup5 = null;
                        }
                        str5 = strGroup5;
                    } catch (Exception e14) {
                        FileLog.e(e14);
                        str5 = null;
                    }
                } else {
                    str5 = null;
                }
                if (str5 == null) {
                    try {
                        Matcher matcher6 = f29282j0.matcher(str);
                        String strGroup6 = matcher6.find() ? matcher6.group(1) : null;
                        if (strGroup6 != null) {
                            strD = strGroup6;
                        }
                    } catch (Exception e15) {
                        FileLog.e(e15);
                    }
                }
                str3 = null;
            }
            this.f29310w = false;
            this.R = false;
            this.f29309s = z10;
            this.f29311x = null;
            this.A = null;
            b();
            this.I = false;
            this.J = 1.0f;
            asyncTask = this.N;
            if (asyncTask != null) {
                asyncTask.cancel(true);
                this.N = null;
            }
            k();
            o();
            m();
            n();
            e81Var = this.f29298b0;
            if (photo != null) {
                closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 80, true);
                if (closestPhotoSizeWithSize != null) {
                    e81Var.f27973a.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "80_80_b", 0L, null, obj, 1);
                    this.L = true;
                }
            } else {
                this.L = false;
            }
            animatorSet = this.f29296a0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f29296a0 = null;
            }
            e81Var.c(0);
            if (str4 != null) {
                this.C = str4;
                str4 = null;
            }
            if (str3 != null) {
                this.f29310w = true;
                this.f29311x = str3;
                this.f29312y = "other";
                if (this.f29309s) {
                    i();
                }
                j(false, false);
                e81Var.d(true, true);
            } else {
                if (str4 != null) {
                    h81 h81Var = new h81(this, str4);
                    h81Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    this.N = h81Var;
                } else if (str8 != null) {
                    c81 c81Var = new c81(this, str8, 4);
                    c81Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    this.N = c81Var;
                } else if (strD != null) {
                    c81 c81Var2 = new c81(this, strD, 1);
                    c81Var2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    this.N = c81Var2;
                    this.D = true;
                } else if (str7 != null) {
                    c81 c81Var3 = new c81(this, str7, 0);
                    c81Var3.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    this.N = c81Var3;
                } else if (str6 != null) {
                    c81 c81Var4 = new c81(this, str, 2);
                    c81Var4.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    this.N = c81Var4;
                } else if (str5 != null) {
                    c81 c81Var5 = new c81(this, str5, 3);
                    c81Var5.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    this.N = c81Var5;
                    this.D = true;
                }
                e81Var.d(false, false);
                j(true, false);
            }
            if (str4 != null && str8 == null && strD == null && str7 == null && str3 == null && str6 == null && str5 == null) {
                e81Var.setVisibility(8);
                return false;
            }
            e81Var.setVisibility(0);
            return true;
        }
        str3 = null;
        str4 = null;
        str8 = str4;
        str7 = str8;
        str6 = str7;
        str5 = str6;
        this.f29310w = false;
        this.R = false;
        this.f29309s = z10;
        this.f29311x = null;
        this.A = null;
        b();
        this.I = false;
        this.J = 1.0f;
        asyncTask = this.N;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.N = null;
        }
        k();
        o();
        m();
        n();
        e81Var = this.f29298b0;
        if (photo != null) {
            closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 80, true);
            if (closestPhotoSizeWithSize != null) {
                e81Var.f27973a.setImage(null, null, ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "80_80_b", 0L, null, obj, 1);
                this.L = true;
            }
        } else {
            this.L = false;
        }
        animatorSet = this.f29296a0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f29296a0 = null;
        }
        e81Var.c(0);
        if (str4 != null) {
            this.C = str4;
            str4 = null;
        }
        if (str3 != null) {
            this.f29310w = true;
            this.f29311x = str3;
            this.f29312y = "other";
            if (this.f29309s) {
                i();
            }
            j(false, false);
            e81Var.d(true, true);
        } else {
            if (str4 != null) {
                h81 h81Var2 = new h81(this, str4);
                h81Var2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                this.N = h81Var2;
            } else if (str8 != null) {
                c81 c81Var6 = new c81(this, str8, 4);
                c81Var6.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                this.N = c81Var6;
            } else if (strD != null) {
                c81 c81Var7 = new c81(this, strD, 1);
                c81Var7.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                this.N = c81Var7;
                this.D = true;
            } else if (str7 != null) {
                c81 c81Var8 = new c81(this, str7, 0);
                c81Var8.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                this.N = c81Var8;
            } else if (str6 != null) {
                c81 c81Var9 = new c81(this, str, 2);
                c81Var9.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                this.N = c81Var9;
            } else if (str5 != null) {
                c81 c81Var10 = new c81(this, str5, 3);
                c81Var10.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                this.N = c81Var10;
                this.D = true;
            }
            e81Var.d(false, false);
            j(true, false);
        }
        if (str4 != null) {
        }
        e81Var.setVisibility(0);
        return true;
    }

    public View getAspectRatioView() {
        return this.f29299c;
    }

    public View getControlsView() {
        return this.f29298b0;
    }

    public ImageView getTextureImageView() {
        return this.f29302e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.C;
    }

    public final void h() {
        e81 e81Var = this.f29298b0;
        if (e81Var.getParent() != this) {
            e81Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.f29311x;
        if (str == null) {
            return;
        }
        String str2 = this.A;
        m61 m61Var = this.f29295a;
        if (str2 != null) {
            m61Var.H(Uri.parse(str), this.f29312y, Uri.parse(this.A), this.B);
        } else {
            m61Var.E(Uri.parse(str), this.f29312y);
        }
        m61Var.Q(this.f29309s);
        long jQ = m61Var.q();
        e81 e81Var = this.f29298b0;
        if (jQ != -9223372036854775807L) {
            e81Var.b((int) (m61Var.q() / 1000));
        } else {
            e81Var.b(0);
        }
        k();
        o();
        m();
        e81Var.invalidate();
        int i10 = this.K;
        if (i10 != -1) {
            m61Var.M(i10 * 1000, false);
        }
    }

    public final void j(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.T;
        if (!z11) {
            radialProgressView.setAlpha(z10 ? 1.0f : 0.0f);
            return;
        }
        AnimatorSet animatorSet = this.f29296a0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f29296a0 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", z10 ? 1.0f : 0.0f));
        this.f29296a0.setDuration(150L);
        this.f29296a0.addListener(new f11(this, 8));
        this.f29296a0.start();
    }

    public final void k() {
        h3.k0 k0Var = this.f29295a.d;
        ImageView imageView = this.U;
        if (k0Var == null || this.Q) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        if (this.P) {
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(h7.z5.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
        } else {
            imageView.setImageResource(R.drawable.ic_gofullscreen);
            imageView.setLayoutParams(h7.z5.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        }
    }

    public final void l(boolean z10) {
        ViewGroup viewGroup;
        TextureView textureView = this.d;
        if (textureView == null) {
            return;
        }
        k();
        ViewGroup viewGroup2 = this.f29304f;
        kf0 kf0Var = this.f29299c;
        if (viewGroup2 != null) {
            if (this.P) {
                ViewGroup viewGroup3 = (ViewGroup) kf0Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(kf0Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) kf0Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(kf0Var);
                    }
                    addView(kf0Var, 0);
                }
            }
            this.v.a(this.f29298b0, this.P, kf0Var.getAspectRatio(), kf0Var.getVideoRotation(), z10);
            return;
        }
        this.O = true;
        if (!this.P) {
            if (viewGroup2 != null) {
                viewGroup2.addView(textureView);
            } else {
                kf0Var.addView(textureView);
            }
        }
        boolean z11 = this.P;
        e81 e81Var = this.f29298b0;
        if (z11) {
            ViewGroup viewGroup5 = (ViewGroup) e81Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(e81Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) e81Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(e81Var);
                }
                if (viewGroup2 != null) {
                    viewGroup2.addView(e81Var);
                } else {
                    addView(e81Var, 1);
                }
            }
        }
        TextureView textureViewA = this.v.a(this.f29298b0, this.P, kf0Var.getAspectRatio(), kf0Var.getVideoRotation(), z10);
        this.f29307n = textureViewA;
        textureViewA.setVisibility(4);
        if (this.P && this.f29307n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(textureView);
        }
        int i10 = e81.E;
        e81Var.a();
    }

    public final void m() {
        ImageView imageView = this.W;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(this.Q ? R.drawable.ic_goinline : R.drawable.ic_outinline);
        imageView.setVisibility(this.f29295a.d != null ? 0 : 8);
        if (this.Q) {
            imageView.setLayoutParams(h7.z5.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(h7.z5.e(56, 50, 53));
        }
    }

    public final void n() {
        e81 e81Var = this.f29298b0;
        int i10 = e81.E;
        e81Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.f29303e0);
        if (!this.f29295a.z()) {
            if (this.R) {
                this.V.setImageResource(this.Q ? R.drawable.ic_againinline : R.drawable.ic_again);
                return;
            } else {
                this.V.setImageResource(this.Q ? R.drawable.ic_playinline : R.drawable.ic_play);
                return;
            }
        }
        this.V.setImageResource(this.Q ? R.drawable.ic_pauseinline : R.drawable.ic_pause);
        AndroidUtilities.runOnUIThread(this.f29303e0, 500L);
        if (this.F) {
            return;
        }
        AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
        this.F = true;
        audioManager.requestAudioFocus(this, 3, 1);
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new xl(this, i10, 11));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.M);
    }

    @Override
    public final void onError(m61 m61Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        kf0 kf0Var = this.f29299c;
        int measuredWidth = (i14 - kf0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int iDp = ((i15 - AndroidUtilities.dp(10.0f)) - kf0Var.getMeasuredHeight()) / 2;
        kf0Var.layout(measuredWidth, iDp, kf0Var.getMeasuredWidth() + measuredWidth, kf0Var.getMeasuredHeight() + iDp);
        e81 e81Var = this.f29298b0;
        if (e81Var.getParent() == this) {
            e81Var.layout(0, 0, e81Var.getMeasuredWidth(), e81Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.T;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        e81Var.f27973a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f29299c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        e81 e81Var = this.f29298b0;
        if (e81Var.getParent() == this) {
            e81Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.T.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        e81 e81Var = this.f29298b0;
        m61 m61Var = this.f29295a;
        if (i10 != 2) {
            if (m61Var.q() != -9223372036854775807L) {
                e81Var.b((int) (m61Var.q() / 1000));
            } else {
                e81Var.b(0);
            }
        }
        f81 f81Var = this.v;
        if (i10 == 4 || i10 == 1 || !m61Var.z()) {
            f81Var.e(this, false);
        } else {
            f81Var.e(this, true);
        }
        if (m61Var.z() && i10 != 4) {
            n();
            return;
        }
        if (i10 == 4) {
            this.R = true;
            m61Var.C();
            m61Var.M(0L, false);
            n();
            e81Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.O) {
            this.O = false;
            if (this.P || this.Q) {
                if (this.Q) {
                    this.f29308r = 1;
                }
                this.f29307n.setSurfaceTexture(surfaceTexture);
                this.f29307n.setSurfaceTextureListener(this.f29305f0);
                this.f29307n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f29308r == 2) {
            ImageView imageView = this.f29302e;
            if (imageView != null) {
                imageView.setVisibility(4);
                imageView.setImageDrawable(null);
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.h = null;
                }
            }
            this.S = false;
            int i10 = this.f29300c0;
            int i11 = this.f29301d0;
            this.f29299c.getVideoRotation();
            this.v.f(this.f29298b0, false, i10, i11, this.E);
            this.f29308r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        kf0 kf0Var = this.f29299c;
        if (kf0Var != null) {
            if (i12 == 90 || i12 == 270) {
                i11 = i10;
                i10 = i11;
            }
            float f11 = i10 * f10;
            this.f29300c0 = (int) f11;
            this.f29301d0 = i11;
            float f12 = i11 == 0 ? 1.0f : f11 / i11;
            kf0Var.a(f12, i12);
            if (this.P) {
                this.v.c(f12, i12);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.I = true;
        this.H = System.currentTimeMillis();
        this.f29298b0.invalidate();
    }

    public final void o() {
    }

    @Override
    public final void onSeekFinished(i3.a aVar) {
    }

    @Override
    public final void onSeekStarted(i3.a aVar) {
    }
}
