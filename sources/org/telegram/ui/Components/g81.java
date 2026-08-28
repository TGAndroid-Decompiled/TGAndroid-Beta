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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class g81 extends ViewGroup implements h61, AudioManager.OnAudioFocusChangeListener {
    public static final Pattern f28677h0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern f28678i0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f28679j0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f28680k0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f28681l0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f28682n0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f28683o0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f28684p0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f28685q0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f28686r0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f28687s0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f28688t0 = Pattern.compile("var\\s");
    public static final Pattern f28689u0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f28690v0 = Pattern.compile("[()]");
    public static final Pattern f28691w0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");
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
    public final k61 f28692a;
    public AnimatorSet f28693a0;
    public final z71 f28694b;
    public final c81 f28695b0;
    public final gf0 f28696c;
    public int f28697c0;
    public final TextureView d;
    public int f28698d0;
    public final ImageView f28699e;
    public final y71 f28700e0;
    public final ViewGroup f28701f;
    public final dh.i f28702f0;
    public final y71 f28703g0;
    public Bitmap h;
    public TextureView f28704n;
    public int f28705r;
    public boolean f28706s;
    public final d81 v;
    public boolean f28707w;
    public String f28708x;
    public String f28709y;

    public g81(Context context, boolean z10, d81 d81Var) {
        super(context);
        this.E = true;
        Paint paint = new Paint();
        this.M = paint;
        this.f28700e0 = new y71(this, 0);
        this.f28702f0 = new dh.i(this, 4);
        this.f28703g0 = new y71(this, 1);
        setWillNotDraw(false);
        this.v = d81Var;
        paint.setColor(-16777216);
        gf0 gf0Var = new gf0(this, context, 1);
        this.f28696c = gf0Var;
        addView(gf0Var, g7.e6.e(-1, -1, 17));
        z71 z71Var = new z71(context, context);
        this.f28694b = z71Var;
        final w71 w71Var = new w71(this);
        z71Var.addJavascriptInterface(new Object(w71Var) {
            public final w71 f26587a;

            {
                this.f26587a = w71Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                g81 g81Var = (g81) this.f26587a.f34137a;
                AsyncTask asyncTask = g81Var.N;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = g81Var.N;
                    if (asyncTask2 instanceof f81) {
                        f81 f81Var = (f81) asyncTask2;
                        String[] strArr = f81Var.f28343c;
                        String str2 = strArr[0];
                        String str3 = f81Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        f81Var.f28342b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = z71Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = d81Var.g();
        this.f28701f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            gf0Var.addView(textureView, g7.e6.e(-1, -1, 17));
        }
        if (g10 != null) {
            ImageView imageView = new ImageView(context);
            this.f28699e = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            g10.addView(imageView);
        }
        k61 k61Var = new k61();
        this.f28692a = k61Var;
        k61Var.F = this;
        k61Var.W(textureView);
        c81 c81Var = new c81(this, context);
        this.f28695b0 = c81Var;
        if (g10 != null) {
            g10.addView(c81Var);
        } else {
            addView(c81Var, g7.e6.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.T = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, g7.e6.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.U = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        c81Var.addView(imageView2, g7.e6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final g81 f34599b;

            {
                this.f34599b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g81 g81Var = this.f34599b;
                        if (g81Var.f28707w && !g81Var.O && !g81Var.S && g81Var.I) {
                            g81Var.P = !g81Var.P;
                            g81Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        g81 g81Var2 = this.f34599b;
                        k61 k61Var2 = g81Var2.f28692a;
                        if (g81Var2.f28707w && g81Var2.f28708x != null) {
                            if (k61Var2.d == null) {
                                g81Var2.i();
                            }
                            if (k61Var2.z()) {
                                k61Var2.C();
                            } else {
                                g81Var2.R = false;
                                k61Var2.D();
                            }
                            g81Var2.n();
                            return;
                        }
                        return;
                    default:
                        g81 g81Var3 = this.f34599b;
                        ViewGroup viewGroup = g81Var3.f28701f;
                        boolean z11 = g81Var3.E;
                        d81 d81Var2 = g81Var3.v;
                        c81 c81Var2 = g81Var3.f28695b0;
                        gf0 gf0Var2 = g81Var3.f28696c;
                        TextureView textureView2 = g81Var3.d;
                        if (textureView2 != null && d81Var2.h() && !g81Var3.O && !g81Var3.S && g81Var3.I) {
                            g81Var3.S = true;
                            if (!g81Var3.Q) {
                                g81Var3.P = false;
                                d81Var2.i(true, g81Var3.f28703g0, gf0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) gf0Var2.getParent();
                            if (viewGroup2 != g81Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(gf0Var2);
                                }
                                g81Var3.addView(gf0Var2, 0, g7.e6.e(-1, -1, 17));
                                gf0Var2.measure(View.MeasureSpec.makeMeasureSpec(g81Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(g81Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = g81Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                g81Var3.h = null;
                            }
                            g81Var3.O = true;
                            g81Var3.Q = false;
                            g81Var3.n();
                            g81Var3.o();
                            g81Var3.k();
                            g81Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                gf0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) c81Var2.getParent();
                            if (viewGroup3 != g81Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(c81Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(c81Var2);
                                } else {
                                    g81Var3.addView(c81Var2, 1);
                                }
                            }
                            c81Var2.d(false, false);
                            d81Var2.i(false, null, gf0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.V = imageView3;
        imageView3.setScaleType(scaleType);
        c81Var.addView(imageView3, g7.e6.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final g81 f34599b;

            {
                this.f34599b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g81 g81Var = this.f34599b;
                        if (g81Var.f28707w && !g81Var.O && !g81Var.S && g81Var.I) {
                            g81Var.P = !g81Var.P;
                            g81Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        g81 g81Var2 = this.f34599b;
                        k61 k61Var2 = g81Var2.f28692a;
                        if (g81Var2.f28707w && g81Var2.f28708x != null) {
                            if (k61Var2.d == null) {
                                g81Var2.i();
                            }
                            if (k61Var2.z()) {
                                k61Var2.C();
                            } else {
                                g81Var2.R = false;
                                k61Var2.D();
                            }
                            g81Var2.n();
                            return;
                        }
                        return;
                    default:
                        g81 g81Var3 = this.f34599b;
                        ViewGroup viewGroup = g81Var3.f28701f;
                        boolean z11 = g81Var3.E;
                        d81 d81Var2 = g81Var3.v;
                        c81 c81Var2 = g81Var3.f28695b0;
                        gf0 gf0Var2 = g81Var3.f28696c;
                        TextureView textureView2 = g81Var3.d;
                        if (textureView2 != null && d81Var2.h() && !g81Var3.O && !g81Var3.S && g81Var3.I) {
                            g81Var3.S = true;
                            if (!g81Var3.Q) {
                                g81Var3.P = false;
                                d81Var2.i(true, g81Var3.f28703g0, gf0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) gf0Var2.getParent();
                            if (viewGroup2 != g81Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(gf0Var2);
                                }
                                g81Var3.addView(gf0Var2, 0, g7.e6.e(-1, -1, 17));
                                gf0Var2.measure(View.MeasureSpec.makeMeasureSpec(g81Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(g81Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = g81Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                g81Var3.h = null;
                            }
                            g81Var3.O = true;
                            g81Var3.Q = false;
                            g81Var3.n();
                            g81Var3.o();
                            g81Var3.k();
                            g81Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                gf0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) c81Var2.getParent();
                            if (viewGroup3 != g81Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(c81Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(c81Var2);
                                } else {
                                    g81Var3.addView(c81Var2, 1);
                                }
                            }
                            c81Var2.d(false, false);
                            d81Var2.i(false, null, gf0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.W = imageView4;
            imageView4.setScaleType(scaleType);
            c81Var.addView(imageView4, g7.e6.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final g81 f34599b;

                {
                    this.f34599b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            g81 g81Var = this.f34599b;
                            if (g81Var.f28707w && !g81Var.O && !g81Var.S && g81Var.I) {
                                g81Var.P = !g81Var.P;
                                g81Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            g81 g81Var2 = this.f34599b;
                            k61 k61Var2 = g81Var2.f28692a;
                            if (g81Var2.f28707w && g81Var2.f28708x != null) {
                                if (k61Var2.d == null) {
                                    g81Var2.i();
                                }
                                if (k61Var2.z()) {
                                    k61Var2.C();
                                } else {
                                    g81Var2.R = false;
                                    k61Var2.D();
                                }
                                g81Var2.n();
                                return;
                            }
                            return;
                        default:
                            g81 g81Var3 = this.f34599b;
                            ViewGroup viewGroup = g81Var3.f28701f;
                            boolean z11 = g81Var3.E;
                            d81 d81Var2 = g81Var3.v;
                            c81 c81Var2 = g81Var3.f28695b0;
                            gf0 gf0Var2 = g81Var3.f28696c;
                            TextureView textureView2 = g81Var3.d;
                            if (textureView2 != null && d81Var2.h() && !g81Var3.O && !g81Var3.S && g81Var3.I) {
                                g81Var3.S = true;
                                if (!g81Var3.Q) {
                                    g81Var3.P = false;
                                    d81Var2.i(true, g81Var3.f28703g0, gf0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) gf0Var2.getParent();
                                if (viewGroup2 != g81Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(gf0Var2);
                                    }
                                    g81Var3.addView(gf0Var2, 0, g7.e6.e(-1, -1, 17));
                                    gf0Var2.measure(View.MeasureSpec.makeMeasureSpec(g81Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(g81Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                }
                                Bitmap bitmap = g81Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    g81Var3.h = null;
                                }
                                g81Var3.O = true;
                                g81Var3.Q = false;
                                g81Var3.n();
                                g81Var3.o();
                                g81Var3.k();
                                g81Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    gf0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) c81Var2.getParent();
                                if (viewGroup3 != g81Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(c81Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(c81Var2);
                                    } else {
                                        g81Var3.addView(c81Var2, 1);
                                    }
                                }
                                c81Var2.d(false, false);
                                d81Var2.i(false, null, gf0Var2.getAspectRatio(), z11);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        n();
        k();
        m();
        o();
    }

    public static boolean a(java.lang.String r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g81.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g81.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f28679j0.matcher(str);
                if (matcher.find()) {
                    str2 = matcher.group(1);
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    return str2;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                return null;
            }
        }
        return null;
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f28677h0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f28695b0;
    }

    private View getProgressView() {
        return this.T;
    }

    public final void b() {
        this.f28692a.I();
        AsyncTask asyncTask = this.N;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.N = null;
        }
        this.f28694b.stopLoading();
    }

    public final boolean f() {
        if (!this.Q && !this.S) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r27, org.telegram.tgnet.TLRPC.Photo r28, java.lang.Object r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g81.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f28696c;
    }

    public View getControlsView() {
        return this.f28695b0;
    }

    public ImageView getTextureImageView() {
        return this.f28699e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.C;
    }

    public final void h() {
        c81 c81Var = this.f28695b0;
        if (c81Var.getParent() != this) {
            c81Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.f28708x;
        if (str != null) {
            String str2 = this.A;
            k61 k61Var = this.f28692a;
            if (str2 != null) {
                k61Var.H(Uri.parse(str), this.f28709y, Uri.parse(this.A), this.B);
            } else {
                k61Var.E(Uri.parse(str), this.f28709y);
            }
            k61Var.Q(this.f28706s);
            long q10 = k61Var.q();
            c81 c81Var = this.f28695b0;
            if (q10 != -9223372036854775807L) {
                c81Var.b((int) (k61Var.q() / 1000));
            } else {
                c81Var.b(0);
            }
            k();
            o();
            m();
            c81Var.invalidate();
            int i9 = this.K;
            if (i9 != -1) {
                k61Var.M(i9 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f10 = 0.0f;
        RadialProgressView radialProgressView = this.T;
        if (z11) {
            AnimatorSet animatorSet = this.f28693a0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f28693a0 = animatorSet2;
            if (z10) {
                f10 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f10));
            this.f28693a0.setDuration(150L);
            this.f28693a0.addListener(new y11(this, 6));
            this.f28693a0.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        radialProgressView.setAlpha(f10);
    }

    public final void k() {
        h3.k0 k0Var = this.f28692a.d;
        ImageView imageView = this.U;
        if (k0Var != null && !this.Q) {
            imageView.setVisibility(0);
            if (!this.P) {
                imageView.setImageResource(R.drawable.ic_gofullscreen);
                imageView.setLayoutParams(g7.e6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
                return;
            }
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(g7.e6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
            return;
        }
        imageView.setVisibility(8);
    }

    public final void l(boolean z10) {
        ViewGroup viewGroup;
        TextureView textureView = this.d;
        if (textureView == null) {
            return;
        }
        k();
        ViewGroup viewGroup2 = this.f28701f;
        gf0 gf0Var = this.f28696c;
        if (viewGroup2 == null) {
            this.O = true;
            if (!this.P) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    gf0Var.addView(textureView);
                }
            }
            boolean z11 = this.P;
            c81 c81Var = this.f28695b0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) c81Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(c81Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) c81Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(c81Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(c81Var);
                    } else {
                        addView(c81Var, 1);
                    }
                }
            }
            TextureView a2 = this.v.a(this.f28695b0, this.P, gf0Var.getAspectRatio(), gf0Var.getVideoRotation(), z10);
            this.f28704n = a2;
            a2.setVisibility(4);
            if (this.P && this.f28704n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i9 = c81.E;
            c81Var.a();
            return;
        }
        if (this.P) {
            ViewGroup viewGroup5 = (ViewGroup) gf0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(gf0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) gf0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(gf0Var);
                }
                addView(gf0Var, 0);
            }
        }
        this.v.a(this.f28695b0, this.P, gf0Var.getAspectRatio(), gf0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i9;
        int i10;
        ImageView imageView = this.W;
        if (imageView == null) {
            return;
        }
        if (this.Q) {
            i9 = R.drawable.ic_goinline;
        } else {
            i9 = R.drawable.ic_outinline;
        }
        imageView.setImageResource(i9);
        if (this.f28692a.d != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        if (this.Q) {
            imageView.setLayoutParams(g7.e6.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(g7.e6.e(56, 50, 53));
        }
    }

    public final void n() {
        int i9;
        int i10;
        int i11;
        c81 c81Var = this.f28695b0;
        int i12 = c81.E;
        c81Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.f28700e0);
        if (!this.f28692a.z()) {
            if (this.R) {
                ImageView imageView = this.V;
                if (this.Q) {
                    i11 = R.drawable.ic_againinline;
                } else {
                    i11 = R.drawable.ic_again;
                }
                imageView.setImageResource(i11);
                return;
            }
            ImageView imageView2 = this.V;
            if (this.Q) {
                i10 = R.drawable.ic_playinline;
            } else {
                i10 = R.drawable.ic_play;
            }
            imageView2.setImageResource(i10);
            return;
        }
        ImageView imageView3 = this.V;
        if (this.Q) {
            i9 = R.drawable.ic_pauseinline;
        } else {
            i9 = R.drawable.ic_pause;
        }
        imageView3.setImageResource(i9);
        AndroidUtilities.runOnUIThread(this.f28700e0, 500L);
        if (!this.F) {
            this.F = true;
            ((AudioManager) ApplicationLoader.applicationContext.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i9) {
        AndroidUtilities.runOnUIThread(new qd(this, i9, 12));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.M);
    }

    @Override
    public final void onError(k61 k61Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13 = i11 - i9;
        gf0 gf0Var = this.f28696c;
        int measuredWidth = (i13 - gf0Var.getMeasuredWidth()) / 2;
        int i14 = i12 - i10;
        int dp = ((i14 - AndroidUtilities.dp(10.0f)) - gf0Var.getMeasuredHeight()) / 2;
        gf0Var.layout(measuredWidth, dp, gf0Var.getMeasuredWidth() + measuredWidth, gf0Var.getMeasuredHeight() + dp);
        c81 c81Var = this.f28695b0;
        if (c81Var.getParent() == this) {
            c81Var.layout(0, 0, c81Var.getMeasuredWidth(), c81Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.T;
        int measuredWidth2 = (i13 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i14 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        c81Var.f27414a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        this.f28696c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        c81 c81Var = this.f28695b0;
        if (c81Var.getParent() == this) {
            c81Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.T.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i9) {
        c81 c81Var = this.f28695b0;
        k61 k61Var = this.f28692a;
        if (i9 != 2) {
            if (k61Var.q() != -9223372036854775807L) {
                c81Var.b((int) (k61Var.q() / 1000));
            } else {
                c81Var.b(0);
            }
        }
        d81 d81Var = this.v;
        if (i9 != 4 && i9 != 1 && k61Var.z()) {
            d81Var.e(this, true);
        } else {
            d81Var.e(this, false);
        }
        if (k61Var.z() && i9 != 4) {
            n();
        } else if (i9 == 4) {
            this.R = true;
            k61Var.C();
            k61Var.M(0L, false);
            n();
            c81Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.O) {
            this.O = false;
            if (this.P || this.Q) {
                if (this.Q) {
                    this.f28705r = 1;
                }
                this.f28704n.setSurfaceTexture(surfaceTexture);
                this.f28704n.setSurfaceTextureListener(this.f28702f0);
                this.f28704n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f28705r == 2) {
            ImageView imageView = this.f28699e;
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
            int i9 = this.f28697c0;
            int i10 = this.f28698d0;
            this.f28696c.getVideoRotation();
            this.v.f(this.f28695b0, false, i9, i10, this.E);
            this.f28705r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i9, int i10, int i11, float f10) {
        float f11;
        gf0 gf0Var = this.f28696c;
        if (gf0Var != null) {
            if (i11 == 90 || i11 == 270) {
                i10 = i9;
                i9 = i10;
            }
            float f12 = i9 * f10;
            this.f28697c0 = (int) f12;
            this.f28698d0 = i10;
            if (i10 == 0) {
                f11 = 1.0f;
            } else {
                f11 = f12 / i10;
            }
            gf0Var.a(f11, i11);
            if (this.P) {
                this.v.c(f11, i11);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.I = true;
        this.H = System.currentTimeMillis();
        this.f28695b0.invalidate();
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
