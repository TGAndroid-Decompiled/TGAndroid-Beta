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
public final class m71 extends ViewGroup implements s51, AudioManager.OnAudioFocusChangeListener {
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
    public final u51 f37138a;
    public boolean f37139a0;
    public final f71 f37140b;
    public final RadialProgressView f37141b0;
    public final ie0 f37142c;
    public final ImageView f37143c0;
    public final TextureView d;
    public final ImageView f37144d0;
    public final ImageView f37145e;
    public final ImageView f37146e0;
    public final ViewGroup f37147f;
    public AnimatorSet f37148f0;
    public final i71 f37149g0;
    public Bitmap h;
    public int f37150h0;
    public int f37151i0;
    public final e71 f37152j0;
    public final z30 f37153k0;
    public final e71 f37154l0;
    public TextureView f37155n;
    public int f37156r;
    public boolean f37157s;
    public final j71 f37158w;
    public boolean f37159x;
    public String f37160y;
    public static final Pattern m0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern f37125n0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f37126o0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f37127p0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f37128q0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f37129r0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f37130s0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f37131t0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f37132u0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f37133v0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f37134w0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f37135x0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f37136y0 = Pattern.compile("var\\s");
    public static final Pattern f37137z0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern A0 = Pattern.compile("[()]");
    public static final Pattern B0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public m71(Context context, boolean z10, j71 j71Var) {
        super(context);
        this.J = true;
        Paint paint = new Paint();
        this.R = paint;
        this.f37152j0 = new e71(this, 0);
        this.f37153k0 = new z30(this, 2);
        this.f37154l0 = new e71(this, 1);
        setWillNotDraw(false);
        this.f37158w = j71Var;
        paint.setColor(-16777216);
        ie0 ie0Var = new ie0(1, context, this);
        this.f37142c = ie0Var;
        addView(ie0Var, c8.ja.e(-1, -1, 17));
        f71 f71Var = new f71(context, context);
        this.f37140b = f71Var;
        final gx gxVar = new gx(this, 28);
        f71Var.addJavascriptInterface(new Object(gxVar) {
            public final gx f32795a;

            {
                this.f32795a = gxVar;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                m71 m71Var = (m71) this.f32795a.f35079b;
                AsyncTask asyncTask = m71Var.S;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = m71Var.S;
                    if (asyncTask2 instanceof l71) {
                        l71 l71Var = (l71) asyncTask2;
                        String[] strArr = l71Var.f36723c;
                        String str2 = strArr[0];
                        String str3 = l71Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        l71Var.f36722b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = f71Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = j71Var.g();
        this.f37147f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            ie0Var.addView(textureView, c8.ja.e(-1, -1, 17));
        }
        if (g10 != null) {
            ImageView imageView = new ImageView(context);
            this.f37145e = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            g10.addView(imageView);
        }
        u51 u51Var = new u51();
        this.f37138a = u51Var;
        u51Var.K = this;
        u51Var.A0(textureView);
        i71 i71Var = new i71(this, context);
        this.f37149g0 = i71Var;
        if (g10 != null) {
            g10.addView(i71Var);
        } else {
            addView(i71Var, c8.ja.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f37141b0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, c8.ja.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f37143c0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        i71Var.addView(imageView2, c8.ja.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final m71 f33863b;

            {
                this.f33863b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m71 m71Var = this.f33863b;
                        if (m71Var.f37159x && !m71Var.T && !m71Var.f37139a0 && m71Var.N) {
                            m71Var.U = !m71Var.U;
                            m71Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        m71 m71Var2 = this.f33863b;
                        u51 u51Var2 = m71Var2.f37138a;
                        if (m71Var2.f37159x && m71Var2.f37160y != null) {
                            if (u51Var2.d == null) {
                                m71Var2.i();
                            }
                            if (u51Var2.d0()) {
                                u51Var2.g0();
                            } else {
                                m71Var2.W = false;
                                u51Var2.h0();
                            }
                            m71Var2.n();
                            return;
                        }
                        return;
                    default:
                        m71 m71Var3 = this.f33863b;
                        ViewGroup viewGroup = m71Var3.f37147f;
                        boolean z11 = m71Var3.J;
                        j71 j71Var2 = m71Var3.f37158w;
                        i71 i71Var2 = m71Var3.f37149g0;
                        ie0 ie0Var2 = m71Var3.f37142c;
                        TextureView textureView2 = m71Var3.d;
                        if (textureView2 != null && j71Var2.h() && !m71Var3.T && !m71Var3.f37139a0 && m71Var3.N) {
                            m71Var3.f37139a0 = true;
                            if (!m71Var3.V) {
                                m71Var3.U = false;
                                j71Var2.i(true, m71Var3.f37154l0, ie0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) ie0Var2.getParent();
                            if (viewGroup2 != m71Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(ie0Var2);
                                }
                                m71Var3.addView(ie0Var2, 0, c8.ja.e(-1, -1, 17));
                                ie0Var2.measure(View.MeasureSpec.makeMeasureSpec(m71Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(m71Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), 1073741824));
                            }
                            Bitmap bitmap = m71Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                m71Var3.h = null;
                            }
                            m71Var3.T = true;
                            m71Var3.V = false;
                            m71Var3.n();
                            m71Var3.o();
                            m71Var3.k();
                            m71Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                ie0Var2.addView(textureView2);
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
                            j71Var2.i(false, null, ie0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f37144d0 = imageView3;
        imageView3.setScaleType(scaleType);
        i71Var.addView(imageView3, c8.ja.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final m71 f33863b;

            {
                this.f33863b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        m71 m71Var = this.f33863b;
                        if (m71Var.f37159x && !m71Var.T && !m71Var.f37139a0 && m71Var.N) {
                            m71Var.U = !m71Var.U;
                            m71Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        m71 m71Var2 = this.f33863b;
                        u51 u51Var2 = m71Var2.f37138a;
                        if (m71Var2.f37159x && m71Var2.f37160y != null) {
                            if (u51Var2.d == null) {
                                m71Var2.i();
                            }
                            if (u51Var2.d0()) {
                                u51Var2.g0();
                            } else {
                                m71Var2.W = false;
                                u51Var2.h0();
                            }
                            m71Var2.n();
                            return;
                        }
                        return;
                    default:
                        m71 m71Var3 = this.f33863b;
                        ViewGroup viewGroup = m71Var3.f37147f;
                        boolean z11 = m71Var3.J;
                        j71 j71Var2 = m71Var3.f37158w;
                        i71 i71Var2 = m71Var3.f37149g0;
                        ie0 ie0Var2 = m71Var3.f37142c;
                        TextureView textureView2 = m71Var3.d;
                        if (textureView2 != null && j71Var2.h() && !m71Var3.T && !m71Var3.f37139a0 && m71Var3.N) {
                            m71Var3.f37139a0 = true;
                            if (!m71Var3.V) {
                                m71Var3.U = false;
                                j71Var2.i(true, m71Var3.f37154l0, ie0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) ie0Var2.getParent();
                            if (viewGroup2 != m71Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(ie0Var2);
                                }
                                m71Var3.addView(ie0Var2, 0, c8.ja.e(-1, -1, 17));
                                ie0Var2.measure(View.MeasureSpec.makeMeasureSpec(m71Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(m71Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), 1073741824));
                            }
                            Bitmap bitmap = m71Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                m71Var3.h = null;
                            }
                            m71Var3.T = true;
                            m71Var3.V = false;
                            m71Var3.n();
                            m71Var3.o();
                            m71Var3.k();
                            m71Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                ie0Var2.addView(textureView2);
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
                            j71Var2.i(false, null, ie0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f37146e0 = imageView4;
            imageView4.setScaleType(scaleType);
            i71Var.addView(imageView4, c8.ja.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final m71 f33863b;

                {
                    this.f33863b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            m71 m71Var = this.f33863b;
                            if (m71Var.f37159x && !m71Var.T && !m71Var.f37139a0 && m71Var.N) {
                                m71Var.U = !m71Var.U;
                                m71Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            m71 m71Var2 = this.f33863b;
                            u51 u51Var2 = m71Var2.f37138a;
                            if (m71Var2.f37159x && m71Var2.f37160y != null) {
                                if (u51Var2.d == null) {
                                    m71Var2.i();
                                }
                                if (u51Var2.d0()) {
                                    u51Var2.g0();
                                } else {
                                    m71Var2.W = false;
                                    u51Var2.h0();
                                }
                                m71Var2.n();
                                return;
                            }
                            return;
                        default:
                            m71 m71Var3 = this.f33863b;
                            ViewGroup viewGroup = m71Var3.f37147f;
                            boolean z11 = m71Var3.J;
                            j71 j71Var2 = m71Var3.f37158w;
                            i71 i71Var2 = m71Var3.f37149g0;
                            ie0 ie0Var2 = m71Var3.f37142c;
                            TextureView textureView2 = m71Var3.d;
                            if (textureView2 != null && j71Var2.h() && !m71Var3.T && !m71Var3.f37139a0 && m71Var3.N) {
                                m71Var3.f37139a0 = true;
                                if (!m71Var3.V) {
                                    m71Var3.U = false;
                                    j71Var2.i(true, m71Var3.f37154l0, ie0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) ie0Var2.getParent();
                                if (viewGroup2 != m71Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(ie0Var2);
                                    }
                                    m71Var3.addView(ie0Var2, 0, c8.ja.e(-1, -1, 17));
                                    ie0Var2.measure(View.MeasureSpec.makeMeasureSpec(m71Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(m71Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), 1073741824));
                                }
                                Bitmap bitmap = m71Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    m71Var3.h = null;
                                }
                                m71Var3.T = true;
                                m71Var3.V = false;
                                m71Var3.n();
                                m71Var3.o();
                                m71Var3.k();
                                m71Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    ie0Var2.addView(textureView2);
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
                                j71Var2.i(false, null, ie0Var2.getAspectRatio(), z11);
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
                Matcher matcher = f37126o0.matcher(str);
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
        return this.f37149g0;
    }

    private View getProgressView() {
        return this.f37141b0;
    }

    public final void b() {
        this.f37138a.m0();
        AsyncTask asyncTask = this.S;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.S = null;
        }
        this.f37140b.stopLoading();
    }

    public final boolean f() {
        if (!this.V && !this.f37139a0) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r28, org.telegram.tgnet.TLRPC.Photo r29, java.lang.Object r30, java.lang.String r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m71.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f37142c;
    }

    public View getControlsView() {
        return this.f37149g0;
    }

    public ImageView getTextureImageView() {
        return this.f37145e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.H;
    }

    public final void h() {
        i71 i71Var = this.f37149g0;
        if (i71Var.getParent() != this) {
            i71Var.setVisibility(8);
        }
        this.f37158w.d();
    }

    public final void i() {
        String str = this.f37160y;
        if (str != null) {
            String str2 = this.F;
            u51 u51Var = this.f37138a;
            if (str2 != null) {
                u51Var.l0(Uri.parse(str), this.E, Uri.parse(this.F), this.G);
            } else {
                u51Var.j0(Uri.parse(str), this.E);
            }
            u51Var.u0(this.f37157s);
            int i7 = (u51Var.U() > (-9223372036854775807L) ? 1 : (u51Var.U() == (-9223372036854775807L) ? 0 : -1));
            i71 i71Var = this.f37149g0;
            if (i7 != 0) {
                i71Var.b((int) (u51Var.U() / 1000));
            } else {
                i71Var.b(0);
            }
            k();
            o();
            m();
            i71Var.invalidate();
            int i10 = this.P;
            if (i10 != -1) {
                u51Var.q0(i10 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f10 = 0.0f;
        RadialProgressView radialProgressView = this.f37141b0;
        if (z11) {
            AnimatorSet animatorSet = this.f37148f0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f37148f0 = animatorSet2;
            if (z10) {
                f10 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f10));
            this.f37148f0.setDuration(150L);
            this.f37148f0.addListener(new i11(this, 7));
            this.f37148f0.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        radialProgressView.setAlpha(f10);
    }

    public final void k() {
        l2.f0 f0Var = this.f37138a.d;
        ImageView imageView = this.f37143c0;
        if (f0Var != null && !this.V) {
            imageView.setVisibility(0);
            if (!this.U) {
                imageView.setImageResource(2131231273);
                imageView.setLayoutParams(c8.ja.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
                return;
            }
            imageView.setImageResource(2131231450);
            imageView.setLayoutParams(c8.ja.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
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
        ViewGroup viewGroup2 = this.f37147f;
        ie0 ie0Var = this.f37142c;
        if (viewGroup2 == null) {
            this.T = true;
            if (!this.U) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    ie0Var.addView(textureView);
                }
            }
            boolean z11 = this.U;
            i71 i71Var = this.f37149g0;
            if (z11) {
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
            TextureView a10 = this.f37158w.a(this.f37149g0, this.U, ie0Var.getAspectRatio(), ie0Var.getVideoRotation(), z10);
            this.f37155n = a10;
            a10.setVisibility(4);
            if (this.U && this.f37155n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i7 = i71.J;
            i71Var.a();
            return;
        }
        if (this.U) {
            ViewGroup viewGroup5 = (ViewGroup) ie0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(ie0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) ie0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(ie0Var);
                }
                addView(ie0Var, 0);
            }
        }
        this.f37158w.a(this.f37149g0, this.U, ie0Var.getAspectRatio(), ie0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i7;
        int i10;
        ImageView imageView = this.f37146e0;
        if (imageView == null) {
            return;
        }
        if (this.V) {
            i7 = 2131231274;
        } else {
            i7 = 2131231451;
        }
        imageView.setImageResource(i7);
        if (this.f37138a.d != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        if (this.V) {
            imageView.setLayoutParams(c8.ja.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(c8.ja.e(56, 50, 53));
        }
    }

    public final void n() {
        int i7;
        int i10;
        int i11;
        i71 i71Var = this.f37149g0;
        int i12 = i71.J;
        i71Var.a();
        org.telegram.messenger.g0.r(this.f37152j0);
        if (!this.f37138a.d0()) {
            if (this.W) {
                ImageView imageView = this.f37144d0;
                if (this.V) {
                    i11 = 2131231252;
                } else {
                    i11 = 2131231251;
                }
                imageView.setImageResource(i11);
                return;
            }
            ImageView imageView2 = this.f37144d0;
            if (this.V) {
                i10 = 2131231456;
            } else {
                i10 = 2131231454;
            }
            imageView2.setImageResource(i10);
            return;
        }
        ImageView imageView3 = this.f37144d0;
        if (this.V) {
            i7 = 2131231453;
        } else {
            i7 = 2131231452;
        }
        imageView3.setImageResource(i7);
        org.telegram.messenger.g0.i3(this.f37152j0, 500L);
        if (!this.K) {
            this.K = true;
            ((AudioManager) org.telegram.messenger.t0.f26609b.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i7) {
        org.telegram.messenger.g0.h3(new a2(this, i7, 15));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), this.R);
    }

    @Override
    public final void onError(u51 u51Var, Exception exc) {
        org.telegram.messenger.a8.g(exc, true);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        ie0 ie0Var = this.f37142c;
        int measuredWidth = (i13 - ie0Var.getMeasuredWidth()) / 2;
        int i14 = i12 - i10;
        int L = ((i14 - org.telegram.messenger.g0.L(10.0f)) - ie0Var.getMeasuredHeight()) / 2;
        ie0Var.layout(measuredWidth, L, ie0Var.getMeasuredWidth() + measuredWidth, ie0Var.getMeasuredHeight() + L);
        i71 i71Var = this.f37149g0;
        if (i71Var.getParent() == this) {
            i71Var.layout(0, 0, i71Var.getMeasuredWidth(), i71Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f37141b0;
        int measuredWidth2 = (i13 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i14 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        i71Var.f35480a.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        this.f37142c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - org.telegram.messenger.g0.L(10.0f), 1073741824));
        i71 i71Var = this.f37149g0;
        if (i71Var.getParent() == this) {
            i71Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f37141b0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i7) {
        i71 i71Var = this.f37149g0;
        u51 u51Var = this.f37138a;
        if (i7 != 2) {
            if (u51Var.U() != -9223372036854775807L) {
                i71Var.b((int) (u51Var.U() / 1000));
            } else {
                i71Var.b(0);
            }
        }
        j71 j71Var = this.f37158w;
        if (i7 != 4 && i7 != 1 && u51Var.d0()) {
            j71Var.e(this, true);
        } else {
            j71Var.e(this, false);
        }
        if (u51Var.d0() && i7 != 4) {
            n();
        } else if (i7 == 4) {
            this.W = true;
            u51Var.g0();
            u51Var.q0(0L, false);
            n();
            i71Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.T) {
            this.T = false;
            if (this.U || this.V) {
                if (this.V) {
                    this.f37156r = 1;
                }
                this.f37155n.setSurfaceTexture(surfaceTexture);
                this.f37155n.setSurfaceTextureListener(this.f37153k0);
                this.f37155n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f37156r == 2) {
            ImageView imageView = this.f37145e;
            if (imageView != null) {
                imageView.setVisibility(4);
                imageView.setImageDrawable(null);
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.h = null;
                }
            }
            this.f37139a0 = false;
            int i7 = this.f37150h0;
            int i10 = this.f37151i0;
            this.f37142c.getVideoRotation();
            this.f37158w.f(this.f37149g0, false, i7, i10, this.J);
            this.f37156r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        float f11;
        ie0 ie0Var = this.f37142c;
        if (ie0Var != null) {
            float f12 = i7 * f10;
            this.f37150h0 = (int) f12;
            this.f37151i0 = i10;
            if (i10 == 0) {
                f11 = 1.0f;
            } else {
                f11 = f12 / i10;
            }
            ie0Var.a(f11, 0);
            if (this.U) {
                this.f37158w.c(f11);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.N = true;
        this.M = System.currentTimeMillis();
        this.f37149g0.invalidate();
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
