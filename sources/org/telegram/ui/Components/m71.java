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
public final class m71 extends ViewGroup implements r51, AudioManager.OnAudioFocusChangeListener {
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
    public final u51 f35996a;
    public final RadialProgressView f35997a0;
    public final f71 f35998b;
    public final ImageView f35999b0;
    public final ge0 f36000c;
    public final ImageView f36001c0;
    public final TextureView d;
    public final ImageView f36002d0;
    public final ImageView f36003e;
    public AnimatorSet f36004e0;
    public final ViewGroup f36005f;
    public final i71 f36006f0;
    public int f36007g0;
    public Bitmap h;
    public int f36008h0;
    public final e71 f36009i0;
    public final x30 f36010j0;
    public final e71 f36011k0;
    public TextureView f36012n;
    public int f36013r;
    public boolean f36014s;
    public final j71 f36015w;
    public boolean f36016x;
    public String f36017y;
    public static final Pattern f35982l0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f35983n0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f35984o0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f35985p0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f35986q0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f35987r0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f35988s0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f35989t0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f35990u0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f35991v0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f35992w0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f35993x0 = Pattern.compile("var\\s");
    public static final Pattern f35994y0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f35995z0 = Pattern.compile("[()]");
    public static final Pattern A0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public m71(Context context, boolean z9, j71 j71Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.f36009i0 = new e71(this, 0);
        this.f36010j0 = new x30(this, 2);
        this.f36011k0 = new e71(this, 1);
        setWillNotDraw(false);
        this.f36015w = j71Var;
        paint.setColor(-16777216);
        ge0 ge0Var = new ge0(1, context, this);
        this.f36000c = ge0Var;
        addView(ge0Var, c8.ha.e(-1, -1, 17));
        f71 f71Var = new f71(context, context);
        this.f35998b = f71Var;
        final bx bxVar = new bx(this, 28);
        f71Var.addJavascriptInterface(new Object(bxVar) {
            public final bx f31621a;

            {
                this.f31621a = bxVar;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                m71 m71Var = (m71) this.f31621a.f32442b;
                AsyncTask asyncTask = m71Var.R;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = m71Var.R;
                    if (asyncTask2 instanceof l71) {
                        l71 l71Var = (l71) asyncTask2;
                        String[] strArr = l71Var.f35635c;
                        String str2 = strArr[0];
                        String str3 = l71Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        l71Var.f35634b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = f71Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = j71Var.g();
        this.f36005f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            ge0Var.addView(textureView, c8.ha.e(-1, -1, 17));
        }
        if (g10 != null) {
            ImageView imageView = new ImageView(context);
            this.f36003e = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            g10.addView(imageView);
        }
        u51 u51Var = new u51();
        this.f35996a = u51Var;
        u51Var.J = this;
        u51Var.A0(textureView);
        i71 i71Var = new i71(this, context);
        this.f36006f0 = i71Var;
        if (g10 != null) {
            g10.addView(i71Var);
        } else {
            addView(i71Var, c8.ha.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f35997a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, c8.ha.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f35999b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        i71Var.addView(imageView2, c8.ha.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final m71 f32884b;

            {
                this.f32884b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m71 m71Var = this.f32884b;
                        if (m71Var.f36016x && !m71Var.S && !m71Var.W && m71Var.M) {
                            m71Var.T = !m71Var.T;
                            m71Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        m71 m71Var2 = this.f32884b;
                        u51 u51Var2 = m71Var2.f35996a;
                        if (m71Var2.f36016x && m71Var2.f36017y != null) {
                            if (u51Var2.d == null) {
                                m71Var2.i();
                            }
                            if (u51Var2.d0()) {
                                u51Var2.g0();
                            } else {
                                m71Var2.V = false;
                                u51Var2.h0();
                            }
                            m71Var2.n();
                            return;
                        }
                        return;
                    default:
                        m71 m71Var3 = this.f32884b;
                        ViewGroup viewGroup = m71Var3.f36005f;
                        boolean z10 = m71Var3.I;
                        j71 j71Var2 = m71Var3.f36015w;
                        i71 i71Var2 = m71Var3.f36006f0;
                        ge0 ge0Var2 = m71Var3.f36000c;
                        TextureView textureView2 = m71Var3.d;
                        if (textureView2 != null && j71Var2.h() && !m71Var3.S && !m71Var3.W && m71Var3.M) {
                            m71Var3.W = true;
                            if (!m71Var3.U) {
                                m71Var3.T = false;
                                j71Var2.i(true, m71Var3.f36011k0, ge0Var2.getAspectRatio(), z10);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) ge0Var2.getParent();
                            if (viewGroup2 != m71Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(ge0Var2);
                                }
                                m71Var3.addView(ge0Var2, 0, c8.ha.e(-1, -1, 17));
                                ge0Var2.measure(View.MeasureSpec.makeMeasureSpec(m71Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(m71Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), 1073741824));
                            }
                            Bitmap bitmap = m71Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                m71Var3.h = null;
                            }
                            m71Var3.S = true;
                            m71Var3.U = false;
                            m71Var3.n();
                            m71Var3.o();
                            m71Var3.k();
                            m71Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                ge0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) i71Var2.getParent();
                            if (viewGroup3 != m71Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(i71Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(i71Var2);
                                } else {
                                    m71Var3.addView(i71Var2, 1);
                                }
                            }
                            i71Var2.d(false, false);
                            j71Var2.i(false, null, ge0Var2.getAspectRatio(), z10);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f36001c0 = imageView3;
        imageView3.setScaleType(scaleType);
        i71Var.addView(imageView3, c8.ha.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final m71 f32884b;

            {
                this.f32884b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m71 m71Var = this.f32884b;
                        if (m71Var.f36016x && !m71Var.S && !m71Var.W && m71Var.M) {
                            m71Var.T = !m71Var.T;
                            m71Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        m71 m71Var2 = this.f32884b;
                        u51 u51Var2 = m71Var2.f35996a;
                        if (m71Var2.f36016x && m71Var2.f36017y != null) {
                            if (u51Var2.d == null) {
                                m71Var2.i();
                            }
                            if (u51Var2.d0()) {
                                u51Var2.g0();
                            } else {
                                m71Var2.V = false;
                                u51Var2.h0();
                            }
                            m71Var2.n();
                            return;
                        }
                        return;
                    default:
                        m71 m71Var3 = this.f32884b;
                        ViewGroup viewGroup = m71Var3.f36005f;
                        boolean z10 = m71Var3.I;
                        j71 j71Var2 = m71Var3.f36015w;
                        i71 i71Var2 = m71Var3.f36006f0;
                        ge0 ge0Var2 = m71Var3.f36000c;
                        TextureView textureView2 = m71Var3.d;
                        if (textureView2 != null && j71Var2.h() && !m71Var3.S && !m71Var3.W && m71Var3.M) {
                            m71Var3.W = true;
                            if (!m71Var3.U) {
                                m71Var3.T = false;
                                j71Var2.i(true, m71Var3.f36011k0, ge0Var2.getAspectRatio(), z10);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) ge0Var2.getParent();
                            if (viewGroup2 != m71Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(ge0Var2);
                                }
                                m71Var3.addView(ge0Var2, 0, c8.ha.e(-1, -1, 17));
                                ge0Var2.measure(View.MeasureSpec.makeMeasureSpec(m71Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(m71Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), 1073741824));
                            }
                            Bitmap bitmap = m71Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                m71Var3.h = null;
                            }
                            m71Var3.S = true;
                            m71Var3.U = false;
                            m71Var3.n();
                            m71Var3.o();
                            m71Var3.k();
                            m71Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                ge0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) i71Var2.getParent();
                            if (viewGroup3 != m71Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(i71Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(i71Var2);
                                } else {
                                    m71Var3.addView(i71Var2, 1);
                                }
                            }
                            i71Var2.d(false, false);
                            j71Var2.i(false, null, ge0Var2.getAspectRatio(), z10);
                            return;
                        }
                        return;
                }
            }
        });
        if (z9) {
            ImageView imageView4 = new ImageView(context);
            this.f36002d0 = imageView4;
            imageView4.setScaleType(scaleType);
            i71Var.addView(imageView4, c8.ha.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final m71 f32884b;

                {
                    this.f32884b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            m71 m71Var = this.f32884b;
                            if (m71Var.f36016x && !m71Var.S && !m71Var.W && m71Var.M) {
                                m71Var.T = !m71Var.T;
                                m71Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            m71 m71Var2 = this.f32884b;
                            u51 u51Var2 = m71Var2.f35996a;
                            if (m71Var2.f36016x && m71Var2.f36017y != null) {
                                if (u51Var2.d == null) {
                                    m71Var2.i();
                                }
                                if (u51Var2.d0()) {
                                    u51Var2.g0();
                                } else {
                                    m71Var2.V = false;
                                    u51Var2.h0();
                                }
                                m71Var2.n();
                                return;
                            }
                            return;
                        default:
                            m71 m71Var3 = this.f32884b;
                            ViewGroup viewGroup = m71Var3.f36005f;
                            boolean z10 = m71Var3.I;
                            j71 j71Var2 = m71Var3.f36015w;
                            i71 i71Var2 = m71Var3.f36006f0;
                            ge0 ge0Var2 = m71Var3.f36000c;
                            TextureView textureView2 = m71Var3.d;
                            if (textureView2 != null && j71Var2.h() && !m71Var3.S && !m71Var3.W && m71Var3.M) {
                                m71Var3.W = true;
                                if (!m71Var3.U) {
                                    m71Var3.T = false;
                                    j71Var2.i(true, m71Var3.f36011k0, ge0Var2.getAspectRatio(), z10);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) ge0Var2.getParent();
                                if (viewGroup2 != m71Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(ge0Var2);
                                    }
                                    m71Var3.addView(ge0Var2, 0, c8.ha.e(-1, -1, 17));
                                    ge0Var2.measure(View.MeasureSpec.makeMeasureSpec(m71Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(m71Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), 1073741824));
                                }
                                Bitmap bitmap = m71Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    m71Var3.h = null;
                                }
                                m71Var3.S = true;
                                m71Var3.U = false;
                                m71Var3.n();
                                m71Var3.o();
                                m71Var3.k();
                                m71Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    ge0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) i71Var2.getParent();
                                if (viewGroup3 != m71Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(i71Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(i71Var2);
                                    } else {
                                        m71Var3.addView(i71Var2, 1);
                                    }
                                }
                                i71Var2.d(false, false);
                                j71Var2.i(false, null, ge0Var2.getAspectRatio(), z10);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m71.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m71.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f35983n0.matcher(str);
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
        Matcher matcher = f35982l0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f36006f0;
    }

    private View getProgressView() {
        return this.f35997a0;
    }

    public final void b() {
        this.f35996a.m0();
        AsyncTask asyncTask = this.R;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.R = null;
        }
        this.f35998b.stopLoading();
    }

    public final boolean f() {
        if (!this.U && !this.W) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r28, org.telegram.tgnet.TLRPC.Photo r29, java.lang.Object r30, java.lang.String r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m71.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f36000c;
    }

    public View getControlsView() {
        return this.f36006f0;
    }

    public ImageView getTextureImageView() {
        return this.f36003e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.G;
    }

    public final void h() {
        i71 i71Var = this.f36006f0;
        if (i71Var.getParent() != this) {
            i71Var.setVisibility(8);
        }
        this.f36015w.d();
    }

    public final void i() {
        String str = this.f36017y;
        if (str != null) {
            String str2 = this.E;
            u51 u51Var = this.f35996a;
            if (str2 != null) {
                u51Var.l0(Uri.parse(str), this.D, Uri.parse(this.E), this.F);
            } else {
                u51Var.j0(Uri.parse(str), this.D);
            }
            u51Var.u0(this.f36014s);
            int i7 = (u51Var.U() > (-9223372036854775807L) ? 1 : (u51Var.U() == (-9223372036854775807L) ? 0 : -1));
            i71 i71Var = this.f36006f0;
            if (i7 != 0) {
                i71Var.b((int) (u51Var.U() / 1000));
            } else {
                i71Var.b(0);
            }
            k();
            o();
            m();
            i71Var.invalidate();
            int i10 = this.O;
            if (i10 != -1) {
                u51Var.q0(i10 * 1000, false);
            }
        }
    }

    public final void j(boolean z9, boolean z10) {
        float f10 = 0.0f;
        RadialProgressView radialProgressView = this.f35997a0;
        if (z10) {
            AnimatorSet animatorSet = this.f36004e0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f36004e0 = animatorSet2;
            if (z9) {
                f10 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f10));
            this.f36004e0.setDuration(150L);
            this.f36004e0.addListener(new g11(this, 7));
            this.f36004e0.start();
            return;
        }
        if (z9) {
            f10 = 1.0f;
        }
        radialProgressView.setAlpha(f10);
    }

    public final void k() {
        l2.i0 i0Var = this.f35996a.d;
        ImageView imageView = this.f35999b0;
        if (i0Var != null && !this.U) {
            imageView.setVisibility(0);
            if (!this.T) {
                imageView.setImageResource(2131231273);
                imageView.setLayoutParams(c8.ha.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
                return;
            }
            imageView.setImageResource(2131231450);
            imageView.setLayoutParams(c8.ha.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
            return;
        }
        imageView.setVisibility(8);
    }

    public final void l(boolean z9) {
        ViewGroup viewGroup;
        TextureView textureView = this.d;
        if (textureView == null) {
            return;
        }
        k();
        ViewGroup viewGroup2 = this.f36005f;
        ge0 ge0Var = this.f36000c;
        if (viewGroup2 == null) {
            this.S = true;
            if (!this.T) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    ge0Var.addView(textureView);
                }
            }
            boolean z10 = this.T;
            i71 i71Var = this.f36006f0;
            if (z10) {
                ViewGroup viewGroup3 = (ViewGroup) i71Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(i71Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) i71Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(i71Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(i71Var);
                    } else {
                        addView(i71Var, 1);
                    }
                }
            }
            TextureView a10 = this.f36015w.a(this.f36006f0, this.T, ge0Var.getAspectRatio(), ge0Var.getVideoRotation(), z9);
            this.f36012n = a10;
            a10.setVisibility(4);
            if (this.T && this.f36012n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i7 = i71.I;
            i71Var.a();
            return;
        }
        if (this.T) {
            ViewGroup viewGroup5 = (ViewGroup) ge0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(ge0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) ge0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(ge0Var);
                }
                addView(ge0Var, 0);
            }
        }
        this.f36015w.a(this.f36006f0, this.T, ge0Var.getAspectRatio(), ge0Var.getVideoRotation(), z9);
    }

    public final void m() {
        int i7;
        int i10;
        ImageView imageView = this.f36002d0;
        if (imageView == null) {
            return;
        }
        if (this.U) {
            i7 = 2131231274;
        } else {
            i7 = 2131231451;
        }
        imageView.setImageResource(i7);
        if (this.f35996a.d != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        if (this.U) {
            imageView.setLayoutParams(c8.ha.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(c8.ha.e(56, 50, 53));
        }
    }

    public final void n() {
        int i7;
        int i10;
        int i11;
        i71 i71Var = this.f36006f0;
        int i12 = i71.I;
        i71Var.a();
        org.telegram.messenger.g0.r(this.f36009i0);
        if (!this.f35996a.d0()) {
            if (this.V) {
                ImageView imageView = this.f36001c0;
                if (this.U) {
                    i11 = 2131231252;
                } else {
                    i11 = 2131231251;
                }
                imageView.setImageResource(i11);
                return;
            }
            ImageView imageView2 = this.f36001c0;
            if (this.U) {
                i10 = 2131231456;
            } else {
                i10 = 2131231454;
            }
            imageView2.setImageResource(i10);
            return;
        }
        ImageView imageView3 = this.f36001c0;
        if (this.U) {
            i7 = 2131231453;
        } else {
            i7 = 2131231452;
        }
        imageView3.setImageResource(i7);
        org.telegram.messenger.g0.i3(this.f36009i0, 500L);
        if (!this.J) {
            this.J = true;
            ((AudioManager) org.telegram.messenger.t0.f25566b.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i7) {
        org.telegram.messenger.g0.h3(new r2(this, i7, 12));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), this.Q);
    }

    @Override
    public final void onError(u51 u51Var, Exception exc) {
        org.telegram.messenger.a8.g(exc, true);
        h();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        ge0 ge0Var = this.f36000c;
        int measuredWidth = (i13 - ge0Var.getMeasuredWidth()) / 2;
        int i14 = i12 - i10;
        int L = ((i14 - org.telegram.messenger.g0.L(10.0f)) - ge0Var.getMeasuredHeight()) / 2;
        ge0Var.layout(measuredWidth, L, ge0Var.getMeasuredWidth() + measuredWidth, ge0Var.getMeasuredHeight() + L);
        i71 i71Var = this.f36006f0;
        if (i71Var.getParent() == this) {
            i71Var.layout(0, 0, i71Var.getMeasuredWidth(), i71Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f35997a0;
        int measuredWidth2 = (i13 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i14 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        i71Var.f34634a.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        this.f36000c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - org.telegram.messenger.g0.L(10.0f), 1073741824));
        i71 i71Var = this.f36006f0;
        if (i71Var.getParent() == this) {
            i71Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f35997a0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z9, int i7) {
        i71 i71Var = this.f36006f0;
        u51 u51Var = this.f35996a;
        if (i7 != 2) {
            if (u51Var.U() != -9223372036854775807L) {
                i71Var.b((int) (u51Var.U() / 1000));
            } else {
                i71Var.b(0);
            }
        }
        j71 j71Var = this.f36015w;
        if (i7 != 4 && i7 != 1 && u51Var.d0()) {
            j71Var.e(this, true);
        } else {
            j71Var.e(this, false);
        }
        if (u51Var.d0() && i7 != 4) {
            n();
        } else if (i7 == 4) {
            this.V = true;
            u51Var.g0();
            u51Var.q0(0L, false);
            n();
            i71Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.S) {
            this.S = false;
            if (this.T || this.U) {
                if (this.U) {
                    this.f36013r = 1;
                }
                this.f36012n.setSurfaceTexture(surfaceTexture);
                this.f36012n.setSurfaceTextureListener(this.f36010j0);
                this.f36012n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f36013r == 2) {
            ImageView imageView = this.f36003e;
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
            int i7 = this.f36007g0;
            int i10 = this.f36008h0;
            this.f36000c.getVideoRotation();
            this.f36015w.f(this.f36006f0, false, i7, i10, this.I);
            this.f36013r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        float f11;
        ge0 ge0Var = this.f36000c;
        if (ge0Var != null) {
            float f12 = i7 * f10;
            this.f36007g0 = (int) f12;
            this.f36008h0 = i10;
            if (i10 == 0) {
                f11 = 1.0f;
            } else {
                f11 = f12 / i10;
            }
            ge0Var.a(f11, 0);
            if (this.T) {
                this.f36015w.c(f11);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.M = true;
        this.L = System.currentTimeMillis();
        this.f36006f0.invalidate();
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
