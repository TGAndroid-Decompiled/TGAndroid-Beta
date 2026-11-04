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
public final class d71 extends ViewGroup implements k51, AudioManager.OnAudioFocusChangeListener {
    public String E;
    public String F;
    public String G;
    public String H;
    public boolean I;
    public final boolean J;
    public boolean K;
    public boolean L;
    public long M;
    public boolean N;
    public float O;
    public int P;
    public boolean Q;
    public final Paint R;
    public AsyncTask S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final m51 f32996a;
    public boolean f32997a0;
    public final w61 f32998b;
    public final RadialProgressView f32999b0;
    public final zd0 f33000c;
    public final ImageView f33001c0;
    public final TextureView d;
    public final ImageView f33002d0;
    public final ImageView f33003e;
    public final ImageView f33004e0;
    public final ViewGroup f33005f;
    public AnimatorSet f33006f0;
    public final z61 f33007g0;
    public Bitmap h;
    public int f33008h0;
    public int f33009i0;
    public final v61 f33010j0;
    public final s30 f33011k0;
    public final v61 f33012l0;
    public TextureView f33013n;
    public int f33014r;
    public boolean f33015s;
    public final a71 f33016w;
    public boolean f33017x;
    public String f33018y;
    public static final Pattern m0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern f32983n0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f32984o0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f32985p0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f32986q0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f32987r0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f32988s0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f32989t0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f32990u0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f32991v0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f32992w0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f32993x0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f32994y0 = Pattern.compile("var\\s");
    public static final Pattern f32995z0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern A0 = Pattern.compile("[()]");
    public static final Pattern B0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public d71(Context context, boolean z10, a71 a71Var) {
        super(context);
        this.J = true;
        Paint paint = new Paint();
        this.R = paint;
        this.f33010j0 = new v61(this, 0);
        this.f33011k0 = new s30(this, 3);
        this.f33012l0 = new v61(this, 1);
        setWillNotDraw(false);
        this.f33016w = a71Var;
        paint.setColor(-16777216);
        zd0 zd0Var = new zd0(1, context, this);
        this.f33000c = zd0Var;
        addView(zd0Var, b8.mf.e(-1, -1, 17));
        w61 w61Var = new w61(context, context);
        this.f32998b = w61Var;
        final zw zwVar = new zw(this, 28);
        w61Var.addJavascriptInterface(new Object(zwVar) {
            public final zw f31690a;

            {
                this.f31690a = zwVar;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                d71 d71Var = (d71) this.f31690a.f41140b;
                AsyncTask asyncTask = d71Var.S;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = d71Var.S;
                    if (asyncTask2 instanceof c71) {
                        c71 c71Var = (c71) asyncTask2;
                        String[] strArr = c71Var.f32588c;
                        String str2 = strArr[0];
                        String str3 = c71Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        c71Var.f32587b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = w61Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g7 = a71Var.g();
        this.f33005f = g7;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g7 != null) {
            g7.addView(textureView);
        } else {
            zd0Var.addView(textureView, b8.mf.e(-1, -1, 17));
        }
        if (g7 != null) {
            ImageView imageView = new ImageView(context);
            this.f33003e = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            g7.addView(imageView);
        }
        m51 m51Var = new m51();
        this.f32996a = m51Var;
        m51Var.K = this;
        m51Var.A0(textureView);
        z61 z61Var = new z61(this, context);
        this.f33007g0 = z61Var;
        if (g7 != null) {
            g7.addView(z61Var);
        } else {
            addView(z61Var, b8.mf.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f32999b0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, b8.mf.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f33001c0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        z61Var.addView(imageView2, b8.mf.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final d71 f38662b;

            {
                this.f38662b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        d71 d71Var = this.f38662b;
                        if (d71Var.f33017x && !d71Var.T && !d71Var.f32997a0 && d71Var.N) {
                            d71Var.U = !d71Var.U;
                            d71Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        d71 d71Var2 = this.f38662b;
                        m51 m51Var2 = d71Var2.f32996a;
                        if (d71Var2.f33017x && d71Var2.f33018y != null) {
                            if (m51Var2.d == null) {
                                d71Var2.i();
                            }
                            if (m51Var2.d0()) {
                                m51Var2.g0();
                            } else {
                                d71Var2.W = false;
                                m51Var2.h0();
                            }
                            d71Var2.n();
                            return;
                        }
                        return;
                    default:
                        d71 d71Var3 = this.f38662b;
                        ViewGroup viewGroup = d71Var3.f33005f;
                        boolean z11 = d71Var3.J;
                        a71 a71Var2 = d71Var3.f33016w;
                        z61 z61Var2 = d71Var3.f33007g0;
                        zd0 zd0Var2 = d71Var3.f33000c;
                        TextureView textureView2 = d71Var3.d;
                        if (textureView2 != null && a71Var2.h() && !d71Var3.T && !d71Var3.f32997a0 && d71Var3.N) {
                            d71Var3.f32997a0 = true;
                            if (!d71Var3.V) {
                                d71Var3.U = false;
                                a71Var2.i(true, d71Var3.f33012l0, zd0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) zd0Var2.getParent();
                            if (viewGroup2 != d71Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(zd0Var2);
                                }
                                d71Var3.addView(zd0Var2, 0, b8.mf.e(-1, -1, 17));
                                zd0Var2.measure(View.MeasureSpec.makeMeasureSpec(d71Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(d71Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), 1073741824));
                            }
                            Bitmap bitmap = d71Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                d71Var3.h = null;
                            }
                            d71Var3.T = true;
                            d71Var3.V = false;
                            d71Var3.n();
                            d71Var3.o();
                            d71Var3.k();
                            d71Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                zd0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) z61Var2.getParent();
                            if (viewGroup3 != d71Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(z61Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(z61Var2);
                                } else {
                                    d71Var3.addView(z61Var2, 1);
                                }
                            }
                            z61Var2.d(false, false);
                            a71Var2.i(false, null, zd0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f33002d0 = imageView3;
        imageView3.setScaleType(scaleType);
        z61Var.addView(imageView3, b8.mf.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final d71 f38662b;

            {
                this.f38662b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        d71 d71Var = this.f38662b;
                        if (d71Var.f33017x && !d71Var.T && !d71Var.f32997a0 && d71Var.N) {
                            d71Var.U = !d71Var.U;
                            d71Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        d71 d71Var2 = this.f38662b;
                        m51 m51Var2 = d71Var2.f32996a;
                        if (d71Var2.f33017x && d71Var2.f33018y != null) {
                            if (m51Var2.d == null) {
                                d71Var2.i();
                            }
                            if (m51Var2.d0()) {
                                m51Var2.g0();
                            } else {
                                d71Var2.W = false;
                                m51Var2.h0();
                            }
                            d71Var2.n();
                            return;
                        }
                        return;
                    default:
                        d71 d71Var3 = this.f38662b;
                        ViewGroup viewGroup = d71Var3.f33005f;
                        boolean z11 = d71Var3.J;
                        a71 a71Var2 = d71Var3.f33016w;
                        z61 z61Var2 = d71Var3.f33007g0;
                        zd0 zd0Var2 = d71Var3.f33000c;
                        TextureView textureView2 = d71Var3.d;
                        if (textureView2 != null && a71Var2.h() && !d71Var3.T && !d71Var3.f32997a0 && d71Var3.N) {
                            d71Var3.f32997a0 = true;
                            if (!d71Var3.V) {
                                d71Var3.U = false;
                                a71Var2.i(true, d71Var3.f33012l0, zd0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) zd0Var2.getParent();
                            if (viewGroup2 != d71Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(zd0Var2);
                                }
                                d71Var3.addView(zd0Var2, 0, b8.mf.e(-1, -1, 17));
                                zd0Var2.measure(View.MeasureSpec.makeMeasureSpec(d71Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(d71Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), 1073741824));
                            }
                            Bitmap bitmap = d71Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                d71Var3.h = null;
                            }
                            d71Var3.T = true;
                            d71Var3.V = false;
                            d71Var3.n();
                            d71Var3.o();
                            d71Var3.k();
                            d71Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                zd0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) z61Var2.getParent();
                            if (viewGroup3 != d71Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(z61Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(z61Var2);
                                } else {
                                    d71Var3.addView(z61Var2, 1);
                                }
                            }
                            z61Var2.d(false, false);
                            a71Var2.i(false, null, zd0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f33004e0 = imageView4;
            imageView4.setScaleType(scaleType);
            z61Var.addView(imageView4, b8.mf.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final d71 f38662b;

                {
                    this.f38662b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d71 d71Var = this.f38662b;
                            if (d71Var.f33017x && !d71Var.T && !d71Var.f32997a0 && d71Var.N) {
                                d71Var.U = !d71Var.U;
                                d71Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            d71 d71Var2 = this.f38662b;
                            m51 m51Var2 = d71Var2.f32996a;
                            if (d71Var2.f33017x && d71Var2.f33018y != null) {
                                if (m51Var2.d == null) {
                                    d71Var2.i();
                                }
                                if (m51Var2.d0()) {
                                    m51Var2.g0();
                                } else {
                                    d71Var2.W = false;
                                    m51Var2.h0();
                                }
                                d71Var2.n();
                                return;
                            }
                            return;
                        default:
                            d71 d71Var3 = this.f38662b;
                            ViewGroup viewGroup = d71Var3.f33005f;
                            boolean z11 = d71Var3.J;
                            a71 a71Var2 = d71Var3.f33016w;
                            z61 z61Var2 = d71Var3.f33007g0;
                            zd0 zd0Var2 = d71Var3.f33000c;
                            TextureView textureView2 = d71Var3.d;
                            if (textureView2 != null && a71Var2.h() && !d71Var3.T && !d71Var3.f32997a0 && d71Var3.N) {
                                d71Var3.f32997a0 = true;
                                if (!d71Var3.V) {
                                    d71Var3.U = false;
                                    a71Var2.i(true, d71Var3.f33012l0, zd0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) zd0Var2.getParent();
                                if (viewGroup2 != d71Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(zd0Var2);
                                    }
                                    d71Var3.addView(zd0Var2, 0, b8.mf.e(-1, -1, 17));
                                    zd0Var2.measure(View.MeasureSpec.makeMeasureSpec(d71Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(d71Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), 1073741824));
                                }
                                Bitmap bitmap = d71Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    d71Var3.h = null;
                                }
                                d71Var3.T = true;
                                d71Var3.V = false;
                                d71Var3.n();
                                d71Var3.o();
                                d71Var3.k();
                                d71Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    zd0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) z61Var2.getParent();
                                if (viewGroup3 != d71Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(z61Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(z61Var2);
                                    } else {
                                        d71Var3.addView(z61Var2, 1);
                                    }
                                }
                                z61Var2.d(false, false);
                                a71Var2.i(false, null, zd0Var2.getAspectRatio(), z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d71.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d71.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f32984o0.matcher(str);
                if (matcher.find()) {
                    str2 = matcher.group(1);
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    return str2;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return null;
            }
        }
        return null;
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = m0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f33007g0;
    }

    private View getProgressView() {
        return this.f32999b0;
    }

    public final void b() {
        this.f32996a.m0();
        AsyncTask asyncTask = this.S;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.S = null;
        }
        this.f32998b.stopLoading();
    }

    public final boolean f() {
        if (!this.V && !this.f32997a0) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r28, org.telegram.tgnet.TLRPC.Photo r29, java.lang.Object r30, java.lang.String r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d71.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f33000c;
    }

    public View getControlsView() {
        return this.f33007g0;
    }

    public ImageView getTextureImageView() {
        return this.f33003e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.H;
    }

    public final void h() {
        z61 z61Var = this.f33007g0;
        if (z61Var.getParent() != this) {
            z61Var.setVisibility(8);
        }
        this.f33016w.d();
    }

    public final void i() {
        String str = this.f33018y;
        if (str != null) {
            String str2 = this.F;
            m51 m51Var = this.f32996a;
            if (str2 != null) {
                m51Var.l0(Uri.parse(str), this.E, Uri.parse(this.F), this.G);
            } else {
                m51Var.j0(Uri.parse(str), this.E);
            }
            m51Var.u0(this.f33015s);
            int i3 = (m51Var.U() > (-9223372036854775807L) ? 1 : (m51Var.U() == (-9223372036854775807L) ? 0 : -1));
            z61 z61Var = this.f33007g0;
            if (i3 != 0) {
                z61Var.b((int) (m51Var.U() / 1000));
            } else {
                z61Var.b(0);
            }
            k();
            o();
            m();
            z61Var.invalidate();
            int i10 = this.P;
            if (i10 != -1) {
                m51Var.q0(i10 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f10 = 0.0f;
        RadialProgressView radialProgressView = this.f32999b0;
        if (z11) {
            AnimatorSet animatorSet = this.f33006f0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f33006f0 = animatorSet2;
            if (z10) {
                f10 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f10));
            this.f33006f0.setDuration(150L);
            this.f33006f0.addListener(new j01(this, 8));
            this.f33006f0.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        radialProgressView.setAlpha(f10);
    }

    public final void k() {
        k2.i0 i0Var = this.f32996a.d;
        ImageView imageView = this.f33001c0;
        if (i0Var != null && !this.V) {
            imageView.setVisibility(0);
            if (!this.U) {
                imageView.setImageResource(2131231273);
                imageView.setLayoutParams(b8.mf.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
                return;
            }
            imageView.setImageResource(2131231450);
            imageView.setLayoutParams(b8.mf.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
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
        ViewGroup viewGroup2 = this.f33005f;
        zd0 zd0Var = this.f33000c;
        if (viewGroup2 == null) {
            this.T = true;
            if (!this.U) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    zd0Var.addView(textureView);
                }
            }
            boolean z11 = this.U;
            z61 z61Var = this.f33007g0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) z61Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(z61Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) z61Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(z61Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(z61Var);
                    } else {
                        addView(z61Var, 1);
                    }
                }
            }
            TextureView a10 = this.f33016w.a(this.f33007g0, this.U, zd0Var.getAspectRatio(), zd0Var.getVideoRotation(), z10);
            this.f33013n = a10;
            a10.setVisibility(4);
            if (this.U && this.f33013n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i3 = z61.J;
            z61Var.a();
            return;
        }
        if (this.U) {
            ViewGroup viewGroup5 = (ViewGroup) zd0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(zd0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) zd0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(zd0Var);
                }
                addView(zd0Var, 0);
            }
        }
        this.f33016w.a(this.f33007g0, this.U, zd0Var.getAspectRatio(), zd0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i3;
        int i10;
        ImageView imageView = this.f33004e0;
        if (imageView == null) {
            return;
        }
        if (this.V) {
            i3 = 2131231274;
        } else {
            i3 = 2131231451;
        }
        imageView.setImageResource(i3);
        if (this.f32996a.d != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        if (this.V) {
            imageView.setLayoutParams(b8.mf.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(b8.mf.e(56, 50, 53));
        }
    }

    public final void n() {
        int i3;
        int i10;
        int i11;
        z61 z61Var = this.f33007g0;
        int i12 = z61.J;
        z61Var.a();
        org.telegram.messenger.g0.r(this.f33010j0);
        if (!this.f32996a.d0()) {
            if (this.W) {
                ImageView imageView = this.f33002d0;
                if (this.V) {
                    i11 = 2131231252;
                } else {
                    i11 = 2131231251;
                }
                imageView.setImageResource(i11);
                return;
            }
            ImageView imageView2 = this.f33002d0;
            if (this.V) {
                i10 = 2131231456;
            } else {
                i10 = 2131231454;
            }
            imageView2.setImageResource(i10);
            return;
        }
        ImageView imageView3 = this.f33002d0;
        if (this.V) {
            i3 = 2131231453;
        } else {
            i3 = 2131231452;
        }
        imageView3.setImageResource(i3);
        org.telegram.messenger.g0.i3(this.f33010j0, 500L);
        if (!this.K) {
            this.K = true;
            ((AudioManager) org.telegram.messenger.t0.f25457b.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i3) {
        org.telegram.messenger.g0.h3(new o2(this, i3, 12));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), this.R);
    }

    @Override
    public final void onError(m51 m51Var, Exception exc) {
        org.telegram.messenger.a8.g(exc, true);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13 = i11 - i3;
        zd0 zd0Var = this.f33000c;
        int measuredWidth = (i13 - zd0Var.getMeasuredWidth()) / 2;
        int i14 = i12 - i10;
        int L = ((i14 - org.telegram.messenger.g0.L(10.0f)) - zd0Var.getMeasuredHeight()) / 2;
        zd0Var.layout(measuredWidth, L, zd0Var.getMeasuredWidth() + measuredWidth, zd0Var.getMeasuredHeight() + L);
        z61 z61Var = this.f33007g0;
        if (z61Var.getParent() == this) {
            z61Var.layout(0, 0, z61Var.getMeasuredWidth(), z61Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f32999b0;
        int measuredWidth2 = (i13 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i14 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        z61Var.f40929a.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        this.f33000c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - org.telegram.messenger.g0.L(10.0f), 1073741824));
        z61 z61Var = this.f33007g0;
        if (z61Var.getParent() == this) {
            z61Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f32999b0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(l2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i3) {
        z61 z61Var = this.f33007g0;
        m51 m51Var = this.f32996a;
        if (i3 != 2) {
            if (m51Var.U() != -9223372036854775807L) {
                z61Var.b((int) (m51Var.U() / 1000));
            } else {
                z61Var.b(0);
            }
        }
        a71 a71Var = this.f33016w;
        if (i3 != 4 && i3 != 1 && m51Var.d0()) {
            a71Var.e(this, true);
        } else {
            a71Var.e(this, false);
        }
        if (m51Var.d0() && i3 != 4) {
            n();
        } else if (i3 == 4) {
            this.W = true;
            m51Var.g0();
            m51Var.q0(0L, false);
            n();
            z61Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.T) {
            this.T = false;
            if (this.U || this.V) {
                if (this.V) {
                    this.f33014r = 1;
                }
                this.f33013n.setSurfaceTexture(surfaceTexture);
                this.f33013n.setSurfaceTextureListener(this.f33011k0);
                this.f33013n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f33014r == 2) {
            ImageView imageView = this.f33003e;
            if (imageView != null) {
                imageView.setVisibility(4);
                imageView.setImageDrawable(null);
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.h = null;
                }
            }
            this.f32997a0 = false;
            int i3 = this.f33008h0;
            int i10 = this.f33009i0;
            this.f33000c.getVideoRotation();
            this.f33016w.f(this.f33007g0, false, i3, i10, this.J);
            this.f33014r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
        float f11;
        zd0 zd0Var = this.f33000c;
        if (zd0Var != null) {
            float f12 = i3 * f10;
            this.f33008h0 = (int) f12;
            this.f33009i0 = i10;
            if (i10 == 0) {
                f11 = 1.0f;
            } else {
                f11 = f12 / i10;
            }
            zd0Var.a(f11, 0);
            if (this.U) {
                this.f33016w.c(f11);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.N = true;
        this.M = System.currentTimeMillis();
        this.f33007g0.invalidate();
    }

    @Override
    public final void onSeekFinished(l2.a aVar) {
    }

    @Override
    public final void onSeekStarted(l2.a aVar) {
    }

    public final void o() {
    }
}
