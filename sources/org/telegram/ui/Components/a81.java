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
public final class a81 extends ViewGroup implements f61, AudioManager.OnAudioFocusChangeListener {
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
    public final h61 f33397a;
    public boolean f33398a0;
    public final t71 f33399b;
    public final RadialProgressView f33400b0;
    public final te0 f33401c;
    public final ImageView f33402c0;
    public final TextureView d;
    public final ImageView f33403d0;
    public final ImageView f33404e;
    public final ImageView f33405e0;
    public final ViewGroup f33406f;
    public AnimatorSet f33407f0;
    public final w71 f33408g0;
    public Bitmap h;
    public int f33409h0;
    public int f33410i0;
    public final s71 f33411j0;
    public final h40 f33412k0;
    public final s71 f33413l0;
    public TextureView f33414n;
    public int f33415r;
    public boolean f33416s;
    public final x71 f33417w;
    public boolean f33418x;
    public String f33419y;
    public static final Pattern m0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern f33384n0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f33385o0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f33386p0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f33387q0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f33388r0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f33389s0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f33390t0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f33391u0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f33392v0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f33393w0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f33394x0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f33395y0 = Pattern.compile("var\\s");
    public static final Pattern f33396z0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern A0 = Pattern.compile("[()]");
    public static final Pattern B0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public a81(Context context, boolean z10, x71 x71Var) {
        super(context);
        this.J = true;
        Paint paint = new Paint();
        this.R = paint;
        this.f33411j0 = new s71(this, 0);
        this.f33412k0 = new h40(this, 2);
        this.f33413l0 = new s71(this, 1);
        setWillNotDraw(false);
        this.f33417w = x71Var;
        paint.setColor(-16777216);
        te0 te0Var = new te0(1, context, this);
        this.f33401c = te0Var;
        addView(te0Var, c8.na.e(-1, -1, 17));
        t71 t71Var = new t71(context, context);
        this.f33399b = t71Var;
        final hy hyVar = new hy(this, 29);
        t71Var.addJavascriptInterface(new Object(hyVar) {
            public final hy f33292a;

            {
                this.f33292a = hyVar;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                a81 a81Var = (a81) this.f33292a.f35848b;
                AsyncTask asyncTask = a81Var.S;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = a81Var.S;
                    if (asyncTask2 instanceof z71) {
                        z71 z71Var = (z71) asyncTask2;
                        String[] strArr = z71Var.f42743c;
                        String str2 = strArr[0];
                        String str3 = z71Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        z71Var.f42742b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = t71Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = x71Var.g();
        this.f33406f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            te0Var.addView(textureView, c8.na.e(-1, -1, 17));
        }
        if (g10 != null) {
            ImageView imageView = new ImageView(context);
            this.f33404e = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            g10.addView(imageView);
        }
        h61 h61Var = new h61();
        this.f33397a = h61Var;
        h61Var.K = this;
        h61Var.A0(textureView);
        w71 w71Var = new w71(this, context);
        this.f33408g0 = w71Var;
        if (g10 != null) {
            g10.addView(w71Var);
        } else {
            addView(w71Var, c8.na.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f33400b0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, c8.na.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f33402c0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        w71Var.addView(imageView2, c8.na.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final a81 f39230b;

            {
                this.f39230b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        a81 a81Var = this.f39230b;
                        if (a81Var.f33418x && !a81Var.T && !a81Var.f33398a0 && a81Var.N) {
                            a81Var.U = !a81Var.U;
                            a81Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        a81 a81Var2 = this.f39230b;
                        h61 h61Var2 = a81Var2.f33397a;
                        if (a81Var2.f33418x && a81Var2.f33419y != null) {
                            if (h61Var2.d == null) {
                                a81Var2.i();
                            }
                            if (h61Var2.d0()) {
                                h61Var2.g0();
                            } else {
                                a81Var2.W = false;
                                h61Var2.h0();
                            }
                            a81Var2.n();
                            return;
                        }
                        return;
                    default:
                        a81 a81Var3 = this.f39230b;
                        ViewGroup viewGroup = a81Var3.f33406f;
                        boolean z11 = a81Var3.J;
                        x71 x71Var2 = a81Var3.f33417w;
                        w71 w71Var2 = a81Var3.f33408g0;
                        te0 te0Var2 = a81Var3.f33401c;
                        TextureView textureView2 = a81Var3.d;
                        if (textureView2 != null && x71Var2.h() && !a81Var3.T && !a81Var3.f33398a0 && a81Var3.N) {
                            a81Var3.f33398a0 = true;
                            if (!a81Var3.V) {
                                a81Var3.U = false;
                                x71Var2.i(true, a81Var3.f33413l0, te0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) te0Var2.getParent();
                            if (viewGroup2 != a81Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(te0Var2);
                                }
                                a81Var3.addView(te0Var2, 0, c8.na.e(-1, -1, 17));
                                te0Var2.measure(View.MeasureSpec.makeMeasureSpec(a81Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(a81Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), 1073741824));
                            }
                            Bitmap bitmap = a81Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                a81Var3.h = null;
                            }
                            a81Var3.T = true;
                            a81Var3.V = false;
                            a81Var3.n();
                            a81Var3.o();
                            a81Var3.k();
                            a81Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                te0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) w71Var2.getParent();
                            if (viewGroup3 != a81Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(w71Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(w71Var2);
                                } else {
                                    a81Var3.addView(w71Var2, 1);
                                }
                            }
                            w71Var2.d(false, false);
                            x71Var2.i(false, null, te0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f33403d0 = imageView3;
        imageView3.setScaleType(scaleType);
        w71Var.addView(imageView3, c8.na.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final a81 f39230b;

            {
                this.f39230b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        a81 a81Var = this.f39230b;
                        if (a81Var.f33418x && !a81Var.T && !a81Var.f33398a0 && a81Var.N) {
                            a81Var.U = !a81Var.U;
                            a81Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        a81 a81Var2 = this.f39230b;
                        h61 h61Var2 = a81Var2.f33397a;
                        if (a81Var2.f33418x && a81Var2.f33419y != null) {
                            if (h61Var2.d == null) {
                                a81Var2.i();
                            }
                            if (h61Var2.d0()) {
                                h61Var2.g0();
                            } else {
                                a81Var2.W = false;
                                h61Var2.h0();
                            }
                            a81Var2.n();
                            return;
                        }
                        return;
                    default:
                        a81 a81Var3 = this.f39230b;
                        ViewGroup viewGroup = a81Var3.f33406f;
                        boolean z11 = a81Var3.J;
                        x71 x71Var2 = a81Var3.f33417w;
                        w71 w71Var2 = a81Var3.f33408g0;
                        te0 te0Var2 = a81Var3.f33401c;
                        TextureView textureView2 = a81Var3.d;
                        if (textureView2 != null && x71Var2.h() && !a81Var3.T && !a81Var3.f33398a0 && a81Var3.N) {
                            a81Var3.f33398a0 = true;
                            if (!a81Var3.V) {
                                a81Var3.U = false;
                                x71Var2.i(true, a81Var3.f33413l0, te0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) te0Var2.getParent();
                            if (viewGroup2 != a81Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(te0Var2);
                                }
                                a81Var3.addView(te0Var2, 0, c8.na.e(-1, -1, 17));
                                te0Var2.measure(View.MeasureSpec.makeMeasureSpec(a81Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(a81Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), 1073741824));
                            }
                            Bitmap bitmap = a81Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                a81Var3.h = null;
                            }
                            a81Var3.T = true;
                            a81Var3.V = false;
                            a81Var3.n();
                            a81Var3.o();
                            a81Var3.k();
                            a81Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                te0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) w71Var2.getParent();
                            if (viewGroup3 != a81Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(w71Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(w71Var2);
                                } else {
                                    a81Var3.addView(w71Var2, 1);
                                }
                            }
                            w71Var2.d(false, false);
                            x71Var2.i(false, null, te0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f33405e0 = imageView4;
            imageView4.setScaleType(scaleType);
            w71Var.addView(imageView4, c8.na.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final a81 f39230b;

                {
                    this.f39230b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            a81 a81Var = this.f39230b;
                            if (a81Var.f33418x && !a81Var.T && !a81Var.f33398a0 && a81Var.N) {
                                a81Var.U = !a81Var.U;
                                a81Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            a81 a81Var2 = this.f39230b;
                            h61 h61Var2 = a81Var2.f33397a;
                            if (a81Var2.f33418x && a81Var2.f33419y != null) {
                                if (h61Var2.d == null) {
                                    a81Var2.i();
                                }
                                if (h61Var2.d0()) {
                                    h61Var2.g0();
                                } else {
                                    a81Var2.W = false;
                                    h61Var2.h0();
                                }
                                a81Var2.n();
                                return;
                            }
                            return;
                        default:
                            a81 a81Var3 = this.f39230b;
                            ViewGroup viewGroup = a81Var3.f33406f;
                            boolean z11 = a81Var3.J;
                            x71 x71Var2 = a81Var3.f33417w;
                            w71 w71Var2 = a81Var3.f33408g0;
                            te0 te0Var2 = a81Var3.f33401c;
                            TextureView textureView2 = a81Var3.d;
                            if (textureView2 != null && x71Var2.h() && !a81Var3.T && !a81Var3.f33398a0 && a81Var3.N) {
                                a81Var3.f33398a0 = true;
                                if (!a81Var3.V) {
                                    a81Var3.U = false;
                                    x71Var2.i(true, a81Var3.f33413l0, te0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) te0Var2.getParent();
                                if (viewGroup2 != a81Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(te0Var2);
                                    }
                                    a81Var3.addView(te0Var2, 0, c8.na.e(-1, -1, 17));
                                    te0Var2.measure(View.MeasureSpec.makeMeasureSpec(a81Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(a81Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), 1073741824));
                                }
                                Bitmap bitmap = a81Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    a81Var3.h = null;
                                }
                                a81Var3.T = true;
                                a81Var3.V = false;
                                a81Var3.n();
                                a81Var3.o();
                                a81Var3.k();
                                a81Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    te0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) w71Var2.getParent();
                                if (viewGroup3 != a81Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(w71Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(w71Var2);
                                    } else {
                                        a81Var3.addView(w71Var2, 1);
                                    }
                                }
                                w71Var2.d(false, false);
                                x71Var2.i(false, null, te0Var2.getAspectRatio(), z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a81.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a81.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f33385o0.matcher(str);
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
        return this.f33408g0;
    }

    private View getProgressView() {
        return this.f33400b0;
    }

    public final void b() {
        this.f33397a.m0();
        AsyncTask asyncTask = this.S;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.S = null;
        }
        this.f33399b.stopLoading();
    }

    public final boolean f() {
        if (!this.V && !this.f33398a0) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r28, org.telegram.tgnet.TLRPC.Photo r29, java.lang.Object r30, java.lang.String r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a81.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f33401c;
    }

    public View getControlsView() {
        return this.f33408g0;
    }

    public ImageView getTextureImageView() {
        return this.f33404e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.H;
    }

    public final void h() {
        w71 w71Var = this.f33408g0;
        if (w71Var.getParent() != this) {
            w71Var.setVisibility(8);
        }
        this.f33417w.d();
    }

    public final void i() {
        String str = this.f33419y;
        if (str != null) {
            String str2 = this.F;
            h61 h61Var = this.f33397a;
            if (str2 != null) {
                h61Var.l0(Uri.parse(str), this.E, Uri.parse(this.F), this.G);
            } else {
                h61Var.j0(Uri.parse(str), this.E);
            }
            h61Var.u0(this.f33416s);
            int i7 = (h61Var.U() > (-9223372036854775807L) ? 1 : (h61Var.U() == (-9223372036854775807L) ? 0 : -1));
            w71 w71Var = this.f33408g0;
            if (i7 != 0) {
                w71Var.b((int) (h61Var.U() / 1000));
            } else {
                w71Var.b(0);
            }
            k();
            o();
            m();
            w71Var.invalidate();
            int i10 = this.P;
            if (i10 != -1) {
                h61Var.q0(i10 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f10 = 0.0f;
        RadialProgressView radialProgressView = this.f33400b0;
        if (z11) {
            AnimatorSet animatorSet = this.f33407f0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f33407f0 = animatorSet2;
            if (z10) {
                f10 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f10));
            this.f33407f0.setDuration(150L);
            this.f33407f0.addListener(new s11(this, 7));
            this.f33407f0.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        radialProgressView.setAlpha(f10);
    }

    public final void k() {
        l2.g0 g0Var = this.f33397a.d;
        ImageView imageView = this.f33402c0;
        if (g0Var != null && !this.V) {
            imageView.setVisibility(0);
            if (!this.U) {
                imageView.setImageResource(2131231276);
                imageView.setLayoutParams(c8.na.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
                return;
            }
            imageView.setImageResource(2131231453);
            imageView.setLayoutParams(c8.na.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
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
        ViewGroup viewGroup2 = this.f33406f;
        te0 te0Var = this.f33401c;
        if (viewGroup2 == null) {
            this.T = true;
            if (!this.U) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    te0Var.addView(textureView);
                }
            }
            boolean z11 = this.U;
            w71 w71Var = this.f33408g0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) w71Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(w71Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) w71Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(w71Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(w71Var);
                    } else {
                        addView(w71Var, 1);
                    }
                }
            }
            TextureView a10 = this.f33417w.a(this.f33408g0, this.U, te0Var.getAspectRatio(), te0Var.getVideoRotation(), z10);
            this.f33414n = a10;
            a10.setVisibility(4);
            if (this.U && this.f33414n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i7 = w71.J;
            w71Var.a();
            return;
        }
        if (this.U) {
            ViewGroup viewGroup5 = (ViewGroup) te0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(te0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) te0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(te0Var);
                }
                addView(te0Var, 0);
            }
        }
        this.f33417w.a(this.f33408g0, this.U, te0Var.getAspectRatio(), te0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i7;
        int i10;
        ImageView imageView = this.f33405e0;
        if (imageView == null) {
            return;
        }
        if (this.V) {
            i7 = 2131231277;
        } else {
            i7 = 2131231454;
        }
        imageView.setImageResource(i7);
        if (this.f33397a.d != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        if (this.V) {
            imageView.setLayoutParams(c8.na.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(c8.na.e(56, 50, 53));
        }
    }

    public final void n() {
        int i7;
        int i10;
        int i11;
        w71 w71Var = this.f33408g0;
        int i12 = w71.J;
        w71Var.a();
        org.telegram.messenger.g0.r(this.f33411j0);
        if (!this.f33397a.d0()) {
            if (this.W) {
                ImageView imageView = this.f33403d0;
                if (this.V) {
                    i11 = 2131231255;
                } else {
                    i11 = 2131231254;
                }
                imageView.setImageResource(i11);
                return;
            }
            ImageView imageView2 = this.f33403d0;
            if (this.V) {
                i10 = 2131231459;
            } else {
                i10 = 2131231457;
            }
            imageView2.setImageResource(i10);
            return;
        }
        ImageView imageView3 = this.f33403d0;
        if (this.V) {
            i7 = 2131231456;
        } else {
            i7 = 2131231455;
        }
        imageView3.setImageResource(i7);
        org.telegram.messenger.g0.h3(this.f33411j0, 500L);
        if (!this.K) {
            this.K = true;
            ((AudioManager) org.telegram.messenger.t0.f27013b.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i7) {
        org.telegram.messenger.g0.g3(new org.telegram.ui.ii(this, i7, 20));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), this.R);
    }

    @Override
    public final void onError(h61 h61Var, Exception exc) {
        org.telegram.messenger.a8.g(exc, true);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        te0 te0Var = this.f33401c;
        int measuredWidth = (i13 - te0Var.getMeasuredWidth()) / 2;
        int i14 = i12 - i10;
        int L = ((i14 - org.telegram.messenger.g0.L(10.0f)) - te0Var.getMeasuredHeight()) / 2;
        te0Var.layout(measuredWidth, L, te0Var.getMeasuredWidth() + measuredWidth, te0Var.getMeasuredHeight() + L);
        w71 w71Var = this.f33408g0;
        if (w71Var.getParent() == this) {
            w71Var.layout(0, 0, w71Var.getMeasuredWidth(), w71Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f33400b0;
        int measuredWidth2 = (i13 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i14 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        w71Var.f41524a.z0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        this.f33401c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - org.telegram.messenger.g0.L(10.0f), 1073741824));
        w71 w71Var = this.f33408g0;
        if (w71Var.getParent() == this) {
            w71Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f33400b0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i7) {
        w71 w71Var = this.f33408g0;
        h61 h61Var = this.f33397a;
        if (i7 != 2) {
            if (h61Var.U() != -9223372036854775807L) {
                w71Var.b((int) (h61Var.U() / 1000));
            } else {
                w71Var.b(0);
            }
        }
        x71 x71Var = this.f33417w;
        if (i7 != 4 && i7 != 1 && h61Var.d0()) {
            x71Var.e(this, true);
        } else {
            x71Var.e(this, false);
        }
        if (h61Var.d0() && i7 != 4) {
            n();
        } else if (i7 == 4) {
            this.W = true;
            h61Var.g0();
            h61Var.q0(0L, false);
            n();
            w71Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.T) {
            this.T = false;
            if (this.U || this.V) {
                if (this.V) {
                    this.f33415r = 1;
                }
                this.f33414n.setSurfaceTexture(surfaceTexture);
                this.f33414n.setSurfaceTextureListener(this.f33412k0);
                this.f33414n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f33415r == 2) {
            ImageView imageView = this.f33404e;
            if (imageView != null) {
                imageView.setVisibility(4);
                imageView.setImageDrawable(null);
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.h = null;
                }
            }
            this.f33398a0 = false;
            int i7 = this.f33409h0;
            int i10 = this.f33410i0;
            this.f33401c.getVideoRotation();
            this.f33417w.f(this.f33408g0, false, i7, i10, this.J);
            this.f33415r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        float f11;
        te0 te0Var = this.f33401c;
        if (te0Var != null) {
            float f12 = i7 * f10;
            this.f33409h0 = (int) f12;
            this.f33410i0 = i10;
            if (i10 == 0) {
                f11 = 1.0f;
            } else {
                f11 = f12 / i10;
            }
            te0Var.a(f11, 0);
            if (this.U) {
                this.f33417w.c(f11);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.N = true;
        this.M = System.currentTimeMillis();
        this.f33408g0.invalidate();
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
