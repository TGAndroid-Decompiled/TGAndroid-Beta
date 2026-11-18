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
public final class w71 extends ViewGroup implements d61, AudioManager.OnAudioFocusChangeListener {
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
    public final f61 f41592a;
    public boolean f41593a0;
    public final p71 f41594b;
    public final RadialProgressView f41595b0;
    public final se0 f41596c;
    public final ImageView f41597c0;
    public final TextureView d;
    public final ImageView f41598d0;
    public final ImageView f41599e;
    public final ImageView f41600e0;
    public final ViewGroup f41601f;
    public AnimatorSet f41602f0;
    public final s71 f41603g0;
    public Bitmap h;
    public int f41604h0;
    public int f41605i0;
    public final o71 f41606j0;
    public final h40 f41607k0;
    public final o71 f41608l0;
    public TextureView f41609n;
    public int f41610r;
    public boolean f41611s;
    public final t71 f41612w;
    public boolean f41613x;
    public String f41614y;
    public static final Pattern m0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern f41579n0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f41580o0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f41581p0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f41582q0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f41583r0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f41584s0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f41585t0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f41586u0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f41587v0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f41588w0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f41589x0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f41590y0 = Pattern.compile("var\\s");
    public static final Pattern f41591z0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern A0 = Pattern.compile("[()]");
    public static final Pattern B0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public w71(Context context, boolean z10, t71 t71Var) {
        super(context);
        this.J = true;
        Paint paint = new Paint();
        this.R = paint;
        this.f41606j0 = new o71(this, 0);
        this.f41607k0 = new h40(this, 2);
        this.f41608l0 = new o71(this, 1);
        setWillNotDraw(false);
        this.f41612w = t71Var;
        paint.setColor(-16777216);
        se0 se0Var = new se0(1, context, this);
        this.f41596c = se0Var;
        addView(se0Var, c8.ma.e(-1, -1, 17));
        p71 p71Var = new p71(context, context);
        this.f41594b = p71Var;
        final iy iyVar = new iy(this, 27);
        p71Var.addJavascriptInterface(new Object(iyVar) {
            public final iy f33192a;

            {
                this.f33192a = iyVar;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                w71 w71Var = (w71) this.f33192a.f36266b;
                AsyncTask asyncTask = w71Var.S;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = w71Var.S;
                    if (asyncTask2 instanceof v71) {
                        v71 v71Var = (v71) asyncTask2;
                        String[] strArr = v71Var.f40522c;
                        String str2 = strArr[0];
                        String str3 = v71Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        v71Var.f40521b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = p71Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = t71Var.g();
        this.f41601f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            se0Var.addView(textureView, c8.ma.e(-1, -1, 17));
        }
        if (g10 != null) {
            ImageView imageView = new ImageView(context);
            this.f41599e = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            g10.addView(imageView);
        }
        f61 f61Var = new f61();
        this.f41592a = f61Var;
        f61Var.K = this;
        f61Var.A0(textureView);
        s71 s71Var = new s71(this, context);
        this.f41603g0 = s71Var;
        if (g10 != null) {
            g10.addView(s71Var);
        } else {
            addView(s71Var, c8.ma.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f41595b0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, c8.ma.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f41597c0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        s71Var.addView(imageView2, c8.ma.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final w71 f37752b;

            {
                this.f37752b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w71 w71Var = this.f37752b;
                        if (w71Var.f41613x && !w71Var.T && !w71Var.f41593a0 && w71Var.N) {
                            w71Var.U = !w71Var.U;
                            w71Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        w71 w71Var2 = this.f37752b;
                        f61 f61Var2 = w71Var2.f41592a;
                        if (w71Var2.f41613x && w71Var2.f41614y != null) {
                            if (f61Var2.d == null) {
                                w71Var2.i();
                            }
                            if (f61Var2.d0()) {
                                f61Var2.g0();
                            } else {
                                w71Var2.W = false;
                                f61Var2.h0();
                            }
                            w71Var2.n();
                            return;
                        }
                        return;
                    default:
                        w71 w71Var3 = this.f37752b;
                        ViewGroup viewGroup = w71Var3.f41601f;
                        boolean z11 = w71Var3.J;
                        t71 t71Var2 = w71Var3.f41612w;
                        s71 s71Var2 = w71Var3.f41603g0;
                        se0 se0Var2 = w71Var3.f41596c;
                        TextureView textureView2 = w71Var3.d;
                        if (textureView2 != null && t71Var2.h() && !w71Var3.T && !w71Var3.f41593a0 && w71Var3.N) {
                            w71Var3.f41593a0 = true;
                            if (!w71Var3.V) {
                                w71Var3.U = false;
                                t71Var2.i(true, w71Var3.f41608l0, se0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) se0Var2.getParent();
                            if (viewGroup2 != w71Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(se0Var2);
                                }
                                w71Var3.addView(se0Var2, 0, c8.ma.e(-1, -1, 17));
                                se0Var2.measure(View.MeasureSpec.makeMeasureSpec(w71Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(w71Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), 1073741824));
                            }
                            Bitmap bitmap = w71Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                w71Var3.h = null;
                            }
                            w71Var3.T = true;
                            w71Var3.V = false;
                            w71Var3.n();
                            w71Var3.o();
                            w71Var3.k();
                            w71Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                se0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) s71Var2.getParent();
                            if (viewGroup3 != w71Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(s71Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(s71Var2);
                                } else {
                                    w71Var3.addView(s71Var2, 1);
                                }
                            }
                            s71Var2.d(false, false);
                            t71Var2.i(false, null, se0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f41598d0 = imageView3;
        imageView3.setScaleType(scaleType);
        s71Var.addView(imageView3, c8.ma.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final w71 f37752b;

            {
                this.f37752b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w71 w71Var = this.f37752b;
                        if (w71Var.f41613x && !w71Var.T && !w71Var.f41593a0 && w71Var.N) {
                            w71Var.U = !w71Var.U;
                            w71Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        w71 w71Var2 = this.f37752b;
                        f61 f61Var2 = w71Var2.f41592a;
                        if (w71Var2.f41613x && w71Var2.f41614y != null) {
                            if (f61Var2.d == null) {
                                w71Var2.i();
                            }
                            if (f61Var2.d0()) {
                                f61Var2.g0();
                            } else {
                                w71Var2.W = false;
                                f61Var2.h0();
                            }
                            w71Var2.n();
                            return;
                        }
                        return;
                    default:
                        w71 w71Var3 = this.f37752b;
                        ViewGroup viewGroup = w71Var3.f41601f;
                        boolean z11 = w71Var3.J;
                        t71 t71Var2 = w71Var3.f41612w;
                        s71 s71Var2 = w71Var3.f41603g0;
                        se0 se0Var2 = w71Var3.f41596c;
                        TextureView textureView2 = w71Var3.d;
                        if (textureView2 != null && t71Var2.h() && !w71Var3.T && !w71Var3.f41593a0 && w71Var3.N) {
                            w71Var3.f41593a0 = true;
                            if (!w71Var3.V) {
                                w71Var3.U = false;
                                t71Var2.i(true, w71Var3.f41608l0, se0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) se0Var2.getParent();
                            if (viewGroup2 != w71Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(se0Var2);
                                }
                                w71Var3.addView(se0Var2, 0, c8.ma.e(-1, -1, 17));
                                se0Var2.measure(View.MeasureSpec.makeMeasureSpec(w71Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(w71Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), 1073741824));
                            }
                            Bitmap bitmap = w71Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                w71Var3.h = null;
                            }
                            w71Var3.T = true;
                            w71Var3.V = false;
                            w71Var3.n();
                            w71Var3.o();
                            w71Var3.k();
                            w71Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                se0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) s71Var2.getParent();
                            if (viewGroup3 != w71Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(s71Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(s71Var2);
                                } else {
                                    w71Var3.addView(s71Var2, 1);
                                }
                            }
                            s71Var2.d(false, false);
                            t71Var2.i(false, null, se0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f41600e0 = imageView4;
            imageView4.setScaleType(scaleType);
            s71Var.addView(imageView4, c8.ma.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final w71 f37752b;

                {
                    this.f37752b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            w71 w71Var = this.f37752b;
                            if (w71Var.f41613x && !w71Var.T && !w71Var.f41593a0 && w71Var.N) {
                                w71Var.U = !w71Var.U;
                                w71Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            w71 w71Var2 = this.f37752b;
                            f61 f61Var2 = w71Var2.f41592a;
                            if (w71Var2.f41613x && w71Var2.f41614y != null) {
                                if (f61Var2.d == null) {
                                    w71Var2.i();
                                }
                                if (f61Var2.d0()) {
                                    f61Var2.g0();
                                } else {
                                    w71Var2.W = false;
                                    f61Var2.h0();
                                }
                                w71Var2.n();
                                return;
                            }
                            return;
                        default:
                            w71 w71Var3 = this.f37752b;
                            ViewGroup viewGroup = w71Var3.f41601f;
                            boolean z11 = w71Var3.J;
                            t71 t71Var2 = w71Var3.f41612w;
                            s71 s71Var2 = w71Var3.f41603g0;
                            se0 se0Var2 = w71Var3.f41596c;
                            TextureView textureView2 = w71Var3.d;
                            if (textureView2 != null && t71Var2.h() && !w71Var3.T && !w71Var3.f41593a0 && w71Var3.N) {
                                w71Var3.f41593a0 = true;
                                if (!w71Var3.V) {
                                    w71Var3.U = false;
                                    t71Var2.i(true, w71Var3.f41608l0, se0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) se0Var2.getParent();
                                if (viewGroup2 != w71Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(se0Var2);
                                    }
                                    w71Var3.addView(se0Var2, 0, c8.ma.e(-1, -1, 17));
                                    se0Var2.measure(View.MeasureSpec.makeMeasureSpec(w71Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(w71Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), 1073741824));
                                }
                                Bitmap bitmap = w71Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    w71Var3.h = null;
                                }
                                w71Var3.T = true;
                                w71Var3.V = false;
                                w71Var3.n();
                                w71Var3.o();
                                w71Var3.k();
                                w71Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    se0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) s71Var2.getParent();
                                if (viewGroup3 != w71Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(s71Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(s71Var2);
                                    } else {
                                        w71Var3.addView(s71Var2, 1);
                                    }
                                }
                                s71Var2.d(false, false);
                                t71Var2.i(false, null, se0Var2.getAspectRatio(), z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w71.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w71.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f41580o0.matcher(str);
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
        return this.f41603g0;
    }

    private View getProgressView() {
        return this.f41595b0;
    }

    public final void b() {
        this.f41592a.m0();
        AsyncTask asyncTask = this.S;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.S = null;
        }
        this.f41594b.stopLoading();
    }

    public final boolean f() {
        if (!this.V && !this.f41593a0) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r28, org.telegram.tgnet.TLRPC.Photo r29, java.lang.Object r30, java.lang.String r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w71.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f41596c;
    }

    public View getControlsView() {
        return this.f41603g0;
    }

    public ImageView getTextureImageView() {
        return this.f41599e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.H;
    }

    public final void h() {
        s71 s71Var = this.f41603g0;
        if (s71Var.getParent() != this) {
            s71Var.setVisibility(8);
        }
        this.f41612w.d();
    }

    public final void i() {
        String str = this.f41614y;
        if (str != null) {
            String str2 = this.F;
            f61 f61Var = this.f41592a;
            if (str2 != null) {
                f61Var.l0(Uri.parse(str), this.E, Uri.parse(this.F), this.G);
            } else {
                f61Var.j0(Uri.parse(str), this.E);
            }
            f61Var.u0(this.f41611s);
            int i7 = (f61Var.U() > (-9223372036854775807L) ? 1 : (f61Var.U() == (-9223372036854775807L) ? 0 : -1));
            s71 s71Var = this.f41603g0;
            if (i7 != 0) {
                s71Var.b((int) (f61Var.U() / 1000));
            } else {
                s71Var.b(0);
            }
            k();
            o();
            m();
            s71Var.invalidate();
            int i10 = this.P;
            if (i10 != -1) {
                f61Var.q0(i10 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f10 = 0.0f;
        RadialProgressView radialProgressView = this.f41595b0;
        if (z11) {
            AnimatorSet animatorSet = this.f41602f0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f41602f0 = animatorSet2;
            if (z10) {
                f10 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f10));
            this.f41602f0.setDuration(150L);
            this.f41602f0.addListener(new s11(this, 7));
            this.f41602f0.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        radialProgressView.setAlpha(f10);
    }

    public final void k() {
        l2.f0 f0Var = this.f41592a.d;
        ImageView imageView = this.f41597c0;
        if (f0Var != null && !this.V) {
            imageView.setVisibility(0);
            if (!this.U) {
                imageView.setImageResource(2131231273);
                imageView.setLayoutParams(c8.ma.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
                return;
            }
            imageView.setImageResource(2131231450);
            imageView.setLayoutParams(c8.ma.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
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
        ViewGroup viewGroup2 = this.f41601f;
        se0 se0Var = this.f41596c;
        if (viewGroup2 == null) {
            this.T = true;
            if (!this.U) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    se0Var.addView(textureView);
                }
            }
            boolean z11 = this.U;
            s71 s71Var = this.f41603g0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) s71Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(s71Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) s71Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(s71Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(s71Var);
                    } else {
                        addView(s71Var, 1);
                    }
                }
            }
            TextureView a10 = this.f41612w.a(this.f41603g0, this.U, se0Var.getAspectRatio(), se0Var.getVideoRotation(), z10);
            this.f41609n = a10;
            a10.setVisibility(4);
            if (this.U && this.f41609n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i7 = s71.J;
            s71Var.a();
            return;
        }
        if (this.U) {
            ViewGroup viewGroup5 = (ViewGroup) se0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(se0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) se0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(se0Var);
                }
                addView(se0Var, 0);
            }
        }
        this.f41612w.a(this.f41603g0, this.U, se0Var.getAspectRatio(), se0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i7;
        int i10;
        ImageView imageView = this.f41600e0;
        if (imageView == null) {
            return;
        }
        if (this.V) {
            i7 = 2131231274;
        } else {
            i7 = 2131231451;
        }
        imageView.setImageResource(i7);
        if (this.f41592a.d != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        if (this.V) {
            imageView.setLayoutParams(c8.ma.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(c8.ma.e(56, 50, 53));
        }
    }

    public final void n() {
        int i7;
        int i10;
        int i11;
        s71 s71Var = this.f41603g0;
        int i12 = s71.J;
        s71Var.a();
        org.telegram.messenger.g0.r(this.f41606j0);
        if (!this.f41592a.d0()) {
            if (this.W) {
                ImageView imageView = this.f41598d0;
                if (this.V) {
                    i11 = 2131231252;
                } else {
                    i11 = 2131231251;
                }
                imageView.setImageResource(i11);
                return;
            }
            ImageView imageView2 = this.f41598d0;
            if (this.V) {
                i10 = 2131231456;
            } else {
                i10 = 2131231454;
            }
            imageView2.setImageResource(i10);
            return;
        }
        ImageView imageView3 = this.f41598d0;
        if (this.V) {
            i7 = 2131231453;
        } else {
            i7 = 2131231452;
        }
        imageView3.setImageResource(i7);
        org.telegram.messenger.g0.h3(this.f41606j0, 500L);
        if (!this.K) {
            this.K = true;
            ((AudioManager) org.telegram.messenger.t0.f26915b.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i7) {
        org.telegram.messenger.g0.g3(new org.telegram.ui.ii(this, i7, 18));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), this.R);
    }

    @Override
    public final void onError(f61 f61Var, Exception exc) {
        org.telegram.messenger.a8.g(exc, true);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        se0 se0Var = this.f41596c;
        int measuredWidth = (i13 - se0Var.getMeasuredWidth()) / 2;
        int i14 = i12 - i10;
        int L = ((i14 - org.telegram.messenger.g0.L(10.0f)) - se0Var.getMeasuredHeight()) / 2;
        se0Var.layout(measuredWidth, L, se0Var.getMeasuredWidth() + measuredWidth, se0Var.getMeasuredHeight() + L);
        s71 s71Var = this.f41603g0;
        if (s71Var.getParent() == this) {
            s71Var.layout(0, 0, s71Var.getMeasuredWidth(), s71Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f41595b0;
        int measuredWidth2 = (i13 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i14 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        s71Var.f39508a.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        this.f41596c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - org.telegram.messenger.g0.L(10.0f), 1073741824));
        s71 s71Var = this.f41603g0;
        if (s71Var.getParent() == this) {
            s71Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f41595b0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i7) {
        s71 s71Var = this.f41603g0;
        f61 f61Var = this.f41592a;
        if (i7 != 2) {
            if (f61Var.U() != -9223372036854775807L) {
                s71Var.b((int) (f61Var.U() / 1000));
            } else {
                s71Var.b(0);
            }
        }
        t71 t71Var = this.f41612w;
        if (i7 != 4 && i7 != 1 && f61Var.d0()) {
            t71Var.e(this, true);
        } else {
            t71Var.e(this, false);
        }
        if (f61Var.d0() && i7 != 4) {
            n();
        } else if (i7 == 4) {
            this.W = true;
            f61Var.g0();
            f61Var.q0(0L, false);
            n();
            s71Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.T) {
            this.T = false;
            if (this.U || this.V) {
                if (this.V) {
                    this.f41610r = 1;
                }
                this.f41609n.setSurfaceTexture(surfaceTexture);
                this.f41609n.setSurfaceTextureListener(this.f41607k0);
                this.f41609n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f41610r == 2) {
            ImageView imageView = this.f41599e;
            if (imageView != null) {
                imageView.setVisibility(4);
                imageView.setImageDrawable(null);
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.h = null;
                }
            }
            this.f41593a0 = false;
            int i7 = this.f41604h0;
            int i10 = this.f41605i0;
            this.f41596c.getVideoRotation();
            this.f41612w.f(this.f41603g0, false, i7, i10, this.J);
            this.f41610r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        float f11;
        se0 se0Var = this.f41596c;
        if (se0Var != null) {
            float f12 = i7 * f10;
            this.f41604h0 = (int) f12;
            this.f41605i0 = i10;
            if (i10 == 0) {
                f11 = 1.0f;
            } else {
                f11 = f12 / i10;
            }
            se0Var.a(f11, 0);
            if (this.U) {
                this.f41612w.c(f11);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.N = true;
        this.M = System.currentTimeMillis();
        this.f41603g0.invalidate();
    }

    @Override
    public final void onSeekFinished(m2.a aVar) {
    }

    @Override
    public final void onSeekStarted(m2.a aVar) {
    }

    public final void o() {
    }
}
