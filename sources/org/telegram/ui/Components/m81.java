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
public final class m81 extends ViewGroup implements s61, AudioManager.OnAudioFocusChangeListener {
    public String D;
    public String E;
    public String F;
    public String G;
    public boolean H;
    public final boolean I;
    public boolean J;
    public boolean K;
    public long L;
    public boolean M;
    public float N;
    public int O;
    public boolean P;
    public final Paint Q;
    public AsyncTask R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final u61 f28359a;
    public final RadialProgressView f28360a0;
    public final f81 f28361b;
    public final ImageView f28362b0;
    public final af0 f28363c;
    public final ImageView f28364c0;
    public final TextureView d;
    public final ImageView f28365d0;
    public final ImageView e;
    public AnimatorSet f28366e0;
    public final ViewGroup f28367f;
    public final i81 f28368f0;
    public int f28369g0;
    public Bitmap h;
    public int f28370h0;
    public final e81 f28371i0;
    public final li.e f28372j0;
    public final e81 f28373k0;
    public TextureView f28374n;
    public int f28375r;
    public boolean f28376s;
    public final j81 f28377w;
    public boolean f28378x;
    public String f28379y;
    public static final Pattern f28345l0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f28346n0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f28347o0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f28348p0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f28349q0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f28350r0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f28351s0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f28352t0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f28353u0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f28354v0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f28355w0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f28356x0 = Pattern.compile("var\\s");
    public static final Pattern f28357y0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f28358z0 = Pattern.compile("[()]");
    public static final Pattern A0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public m81(Context context, boolean z10, j81 j81Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.f28371i0 = new e81(this, 0);
        this.f28372j0 = new li.e(this, 5);
        this.f28373k0 = new e81(this, 1);
        setWillNotDraw(false);
        this.f28377w = j81Var;
        paint.setColor(-16777216);
        af0 af0Var = new af0(this, context, 1);
        this.f28363c = af0Var;
        addView(af0Var, w7.b6.e(-1, -1, 17));
        f81 f81Var = new f81(context, context);
        this.f28361b = f81Var;
        final px pxVar = new px(this, 28);
        f81Var.addJavascriptInterface(new Object(pxVar) {
            public final px f24256a;

            {
                this.f24256a = pxVar;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                m81 m81Var = (m81) this.f24256a.f29448b;
                AsyncTask asyncTask = m81Var.R;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = m81Var.R;
                    if (asyncTask2 instanceof l81) {
                        l81 l81Var = (l81) asyncTask2;
                        String[] strArr = l81Var.f28037c;
                        String str2 = strArr[0];
                        String str3 = l81Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        l81Var.f28036b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = f81Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = j81Var.g();
        this.f28367f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            af0Var.addView(textureView, w7.b6.e(-1, -1, 17));
        }
        if (g10 != null) {
            ImageView imageView = new ImageView(context);
            this.e = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            g10.addView(imageView);
        }
        u61 u61Var = new u61();
        this.f28359a = u61Var;
        u61Var.J = this;
        u61Var.A0(textureView);
        i81 i81Var = new i81(this, context);
        this.f28368f0 = i81Var;
        if (g10 != null) {
            g10.addView(i81Var);
        } else {
            addView(i81Var, w7.b6.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f28360a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, w7.b6.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f28362b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        i81Var.addView(imageView2, w7.b6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final m81 f25368b;

            {
                this.f25368b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m81 m81Var = this.f25368b;
                        if (m81Var.f28378x && !m81Var.S && !m81Var.W && m81Var.M) {
                            m81Var.T = !m81Var.T;
                            m81Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        m81 m81Var2 = this.f25368b;
                        u61 u61Var2 = m81Var2.f28359a;
                        if (m81Var2.f28378x && m81Var2.f28379y != null) {
                            if (u61Var2.d == null) {
                                m81Var2.i();
                            }
                            if (u61Var2.d0()) {
                                u61Var2.g0();
                            } else {
                                m81Var2.V = false;
                                u61Var2.h0();
                            }
                            m81Var2.n();
                            return;
                        }
                        return;
                    default:
                        m81 m81Var3 = this.f25368b;
                        ViewGroup viewGroup = m81Var3.f28367f;
                        boolean z11 = m81Var3.I;
                        j81 j81Var2 = m81Var3.f28377w;
                        i81 i81Var2 = m81Var3.f28368f0;
                        af0 af0Var2 = m81Var3.f28363c;
                        TextureView textureView2 = m81Var3.d;
                        if (textureView2 != null && j81Var2.h() && !m81Var3.S && !m81Var3.W && m81Var3.M) {
                            m81Var3.W = true;
                            if (!m81Var3.U) {
                                m81Var3.T = false;
                                j81Var2.i(true, m81Var3.f28373k0, af0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) af0Var2.getParent();
                            if (viewGroup2 != m81Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(af0Var2);
                                }
                                m81Var3.addView(af0Var2, 0, w7.b6.e(-1, -1, 17));
                                af0Var2.measure(View.MeasureSpec.makeMeasureSpec(m81Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(m81Var3.getMeasuredHeight() - org.telegram.messenger.i0.L(10.0f), 1073741824));
                            }
                            Bitmap bitmap = m81Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                m81Var3.h = null;
                            }
                            m81Var3.S = true;
                            m81Var3.U = false;
                            m81Var3.n();
                            m81Var3.o();
                            m81Var3.k();
                            m81Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                af0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) i81Var2.getParent();
                            if (viewGroup3 != m81Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(i81Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(i81Var2);
                                } else {
                                    m81Var3.addView(i81Var2, 1);
                                }
                            }
                            i81Var2.d(false, false);
                            j81Var2.i(false, null, af0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f28364c0 = imageView3;
        imageView3.setScaleType(scaleType);
        i81Var.addView(imageView3, w7.b6.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final m81 f25368b;

            {
                this.f25368b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m81 m81Var = this.f25368b;
                        if (m81Var.f28378x && !m81Var.S && !m81Var.W && m81Var.M) {
                            m81Var.T = !m81Var.T;
                            m81Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        m81 m81Var2 = this.f25368b;
                        u61 u61Var2 = m81Var2.f28359a;
                        if (m81Var2.f28378x && m81Var2.f28379y != null) {
                            if (u61Var2.d == null) {
                                m81Var2.i();
                            }
                            if (u61Var2.d0()) {
                                u61Var2.g0();
                            } else {
                                m81Var2.V = false;
                                u61Var2.h0();
                            }
                            m81Var2.n();
                            return;
                        }
                        return;
                    default:
                        m81 m81Var3 = this.f25368b;
                        ViewGroup viewGroup = m81Var3.f28367f;
                        boolean z11 = m81Var3.I;
                        j81 j81Var2 = m81Var3.f28377w;
                        i81 i81Var2 = m81Var3.f28368f0;
                        af0 af0Var2 = m81Var3.f28363c;
                        TextureView textureView2 = m81Var3.d;
                        if (textureView2 != null && j81Var2.h() && !m81Var3.S && !m81Var3.W && m81Var3.M) {
                            m81Var3.W = true;
                            if (!m81Var3.U) {
                                m81Var3.T = false;
                                j81Var2.i(true, m81Var3.f28373k0, af0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) af0Var2.getParent();
                            if (viewGroup2 != m81Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(af0Var2);
                                }
                                m81Var3.addView(af0Var2, 0, w7.b6.e(-1, -1, 17));
                                af0Var2.measure(View.MeasureSpec.makeMeasureSpec(m81Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(m81Var3.getMeasuredHeight() - org.telegram.messenger.i0.L(10.0f), 1073741824));
                            }
                            Bitmap bitmap = m81Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                m81Var3.h = null;
                            }
                            m81Var3.S = true;
                            m81Var3.U = false;
                            m81Var3.n();
                            m81Var3.o();
                            m81Var3.k();
                            m81Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                af0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) i81Var2.getParent();
                            if (viewGroup3 != m81Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(i81Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(i81Var2);
                                } else {
                                    m81Var3.addView(i81Var2, 1);
                                }
                            }
                            i81Var2.d(false, false);
                            j81Var2.i(false, null, af0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f28365d0 = imageView4;
            imageView4.setScaleType(scaleType);
            i81Var.addView(imageView4, w7.b6.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final m81 f25368b;

                {
                    this.f25368b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            m81 m81Var = this.f25368b;
                            if (m81Var.f28378x && !m81Var.S && !m81Var.W && m81Var.M) {
                                m81Var.T = !m81Var.T;
                                m81Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            m81 m81Var2 = this.f25368b;
                            u61 u61Var2 = m81Var2.f28359a;
                            if (m81Var2.f28378x && m81Var2.f28379y != null) {
                                if (u61Var2.d == null) {
                                    m81Var2.i();
                                }
                                if (u61Var2.d0()) {
                                    u61Var2.g0();
                                } else {
                                    m81Var2.V = false;
                                    u61Var2.h0();
                                }
                                m81Var2.n();
                                return;
                            }
                            return;
                        default:
                            m81 m81Var3 = this.f25368b;
                            ViewGroup viewGroup = m81Var3.f28367f;
                            boolean z11 = m81Var3.I;
                            j81 j81Var2 = m81Var3.f28377w;
                            i81 i81Var2 = m81Var3.f28368f0;
                            af0 af0Var2 = m81Var3.f28363c;
                            TextureView textureView2 = m81Var3.d;
                            if (textureView2 != null && j81Var2.h() && !m81Var3.S && !m81Var3.W && m81Var3.M) {
                                m81Var3.W = true;
                                if (!m81Var3.U) {
                                    m81Var3.T = false;
                                    j81Var2.i(true, m81Var3.f28373k0, af0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) af0Var2.getParent();
                                if (viewGroup2 != m81Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(af0Var2);
                                    }
                                    m81Var3.addView(af0Var2, 0, w7.b6.e(-1, -1, 17));
                                    af0Var2.measure(View.MeasureSpec.makeMeasureSpec(m81Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(m81Var3.getMeasuredHeight() - org.telegram.messenger.i0.L(10.0f), 1073741824));
                                }
                                Bitmap bitmap = m81Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    m81Var3.h = null;
                                }
                                m81Var3.S = true;
                                m81Var3.U = false;
                                m81Var3.n();
                                m81Var3.o();
                                m81Var3.k();
                                m81Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    af0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) i81Var2.getParent();
                                if (viewGroup3 != m81Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(i81Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(i81Var2);
                                    } else {
                                        m81Var3.addView(i81Var2, 1);
                                    }
                                }
                                i81Var2.d(false, false);
                                j81Var2.i(false, null, af0Var2.getAspectRatio(), z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m81.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m81.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f28346n0.matcher(str);
                if (matcher.find()) {
                    str2 = matcher.group(1);
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    return str2;
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return null;
            }
        }
        return null;
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f28345l0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f28368f0;
    }

    private View getProgressView() {
        return this.f28360a0;
    }

    public final void b() {
        this.f28359a.m0();
        AsyncTask asyncTask = this.R;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.R = null;
        }
        this.f28361b.stopLoading();
    }

    public final boolean f() {
        if (!this.U && !this.W) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r28, org.telegram.tgnet.TLRPC.Photo r29, java.lang.Object r30, java.lang.String r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m81.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f28363c;
    }

    public View getControlsView() {
        return this.f28368f0;
    }

    public ImageView getTextureImageView() {
        return this.e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.G;
    }

    public final void h() {
        i81 i81Var = this.f28368f0;
        if (i81Var.getParent() != this) {
            i81Var.setVisibility(8);
        }
        this.f28377w.d();
    }

    public final void i() {
        String str = this.f28379y;
        if (str != null) {
            String str2 = this.E;
            u61 u61Var = this.f28359a;
            if (str2 != null) {
                u61Var.l0(Uri.parse(str), this.D, Uri.parse(this.E), this.F);
            } else {
                u61Var.j0(Uri.parse(str), this.D);
            }
            u61Var.u0(this.f28376s);
            int i10 = (u61Var.U() > (-9223372036854775807L) ? 1 : (u61Var.U() == (-9223372036854775807L) ? 0 : -1));
            i81 i81Var = this.f28368f0;
            if (i10 != 0) {
                i81Var.b((int) (u61Var.U() / 1000));
            } else {
                i81Var.b(0);
            }
            k();
            o();
            m();
            i81Var.invalidate();
            int i11 = this.O;
            if (i11 != -1) {
                u61Var.q0(i11 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f7 = 0.0f;
        RadialProgressView radialProgressView = this.f28360a0;
        if (z11) {
            AnimatorSet animatorSet = this.f28366e0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f28366e0 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f7));
            this.f28366e0.setDuration(150L);
            this.f28366e0.addListener(new p11(this, 8));
            this.f28366e0.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        radialProgressView.setAlpha(f7);
    }

    public final void k() {
        i2.i0 i0Var = this.f28359a.d;
        ImageView imageView = this.f28362b0;
        if (i0Var != null && !this.U) {
            imageView.setVisibility(0);
            if (!this.T) {
                imageView.setImageResource(2131231274);
                imageView.setLayoutParams(w7.b6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
                return;
            }
            imageView.setImageResource(2131231451);
            imageView.setLayoutParams(w7.b6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
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
        ViewGroup viewGroup2 = this.f28367f;
        af0 af0Var = this.f28363c;
        if (viewGroup2 == null) {
            this.S = true;
            if (!this.T) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    af0Var.addView(textureView);
                }
            }
            boolean z11 = this.T;
            i81 i81Var = this.f28368f0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) i81Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(i81Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) i81Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(i81Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(i81Var);
                    } else {
                        addView(i81Var, 1);
                    }
                }
            }
            TextureView a2 = this.f28377w.a(this.f28368f0, this.T, af0Var.getAspectRatio(), af0Var.getVideoRotation(), z10);
            this.f28374n = a2;
            a2.setVisibility(4);
            if (this.T && this.f28374n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i10 = i81.I;
            i81Var.a();
            return;
        }
        if (this.T) {
            ViewGroup viewGroup5 = (ViewGroup) af0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(af0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) af0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(af0Var);
                }
                addView(af0Var, 0);
            }
        }
        this.f28377w.a(this.f28368f0, this.T, af0Var.getAspectRatio(), af0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i10;
        int i11;
        ImageView imageView = this.f28365d0;
        if (imageView == null) {
            return;
        }
        if (this.U) {
            i10 = 2131231275;
        } else {
            i10 = 2131231452;
        }
        imageView.setImageResource(i10);
        if (this.f28359a.d != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView.setVisibility(i11);
        if (this.U) {
            imageView.setLayoutParams(w7.b6.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(w7.b6.e(56, 50, 53));
        }
    }

    public final void n() {
        int i10;
        int i11;
        int i12;
        i81 i81Var = this.f28368f0;
        int i13 = i81.I;
        i81Var.a();
        org.telegram.messenger.i0.r(this.f28371i0);
        if (!this.f28359a.d0()) {
            if (this.V) {
                ImageView imageView = this.f28364c0;
                if (this.U) {
                    i12 = 2131231253;
                } else {
                    i12 = 2131231252;
                }
                imageView.setImageResource(i12);
                return;
            }
            ImageView imageView2 = this.f28364c0;
            if (this.U) {
                i11 = 2131231457;
            } else {
                i11 = 2131231455;
            }
            imageView2.setImageResource(i11);
            return;
        }
        ImageView imageView3 = this.f28364c0;
        if (this.U) {
            i10 = 2131231454;
        } else {
            i10 = 2131231453;
        }
        imageView3.setImageResource(i10);
        org.telegram.messenger.i0.h3(this.f28371i0, 500L);
        if (!this.J) {
            this.J = true;
            ((AudioManager) org.telegram.messenger.w0.f19025b.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        org.telegram.messenger.i0.g3(new qq(this, i10, 7));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.i0.L(10.0f), this.Q);
    }

    @Override
    public final void onError(u61 u61Var, Exception exc) {
        org.telegram.messenger.f8.g(exc, true);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        af0 af0Var = this.f28363c;
        int measuredWidth = (i14 - af0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int L = ((i15 - org.telegram.messenger.i0.L(10.0f)) - af0Var.getMeasuredHeight()) / 2;
        af0Var.layout(measuredWidth, L, af0Var.getMeasuredWidth() + measuredWidth, af0Var.getMeasuredHeight() + L);
        i81 i81Var = this.f28368f0;
        if (i81Var.getParent() == this) {
            i81Var.layout(0, 0, i81Var.getMeasuredWidth(), i81Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f28360a0;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        i81Var.f26904a.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.i0.L(10.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f28363c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - org.telegram.messenger.i0.L(10.0f), 1073741824));
        i81 i81Var = this.f28368f0;
        if (i81Var.getParent() == this) {
            i81Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f28360a0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        i81 i81Var = this.f28368f0;
        u61 u61Var = this.f28359a;
        if (i10 != 2) {
            if (u61Var.U() != -9223372036854775807L) {
                i81Var.b((int) (u61Var.U() / 1000));
            } else {
                i81Var.b(0);
            }
        }
        j81 j81Var = this.f28377w;
        if (i10 != 4 && i10 != 1 && u61Var.d0()) {
            j81Var.e(this, true);
        } else {
            j81Var.e(this, false);
        }
        if (u61Var.d0() && i10 != 4) {
            n();
        } else if (i10 == 4) {
            this.V = true;
            u61Var.g0();
            u61Var.q0(0L, false);
            n();
            i81Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.S) {
            this.S = false;
            if (this.T || this.U) {
                if (this.U) {
                    this.f28375r = 1;
                }
                this.f28374n.setSurfaceTexture(surfaceTexture);
                this.f28374n.setSurfaceTextureListener(this.f28372j0);
                this.f28374n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f28375r == 2) {
            ImageView imageView = this.e;
            if (imageView != null) {
                imageView.setVisibility(4);
                imageView.setImageDrawable(null);
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.h = null;
                }
            }
            this.W = false;
            int i10 = this.f28369g0;
            int i11 = this.f28370h0;
            this.f28363c.getVideoRotation();
            this.f28377w.f(this.f28368f0, false, i10, i11, this.I);
            this.f28375r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        af0 af0Var = this.f28363c;
        if (af0Var != null) {
            float f11 = i10 * f7;
            this.f28369g0 = (int) f11;
            this.f28370h0 = i11;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / i11;
            }
            af0Var.a(f10, 0);
            if (this.T) {
                this.f28377w.c(f10);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.M = true;
        this.L = System.currentTimeMillis();
        this.f28368f0.invalidate();
    }

    @Override
    public final void onSeekFinished(j2.a aVar) {
    }

    @Override
    public final void onSeekStarted(j2.a aVar) {
    }

    public final void o() {
    }
}
