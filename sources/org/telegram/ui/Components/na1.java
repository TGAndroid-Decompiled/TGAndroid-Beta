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
public final class na1 extends ViewGroup implements q81, AudioManager.OnAudioFocusChangeListener {
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
    public final t81 f30807a;
    public final RadialProgressView f30808a0;
    public final ga1 f30809b;
    public final ImageView f30810b0;
    public final wg0 f30811c;
    public final ImageView f30812c0;
    public final TextureView d;
    public final ImageView f30813d0;
    public final ImageView e;
    public AnimatorSet f30814e0;
    public final ViewGroup f30815f;
    public final ja1 f30816f0;
    public int f30817g0;
    public Bitmap h;
    public int f30818h0;
    public final fa1 f30819i0;
    public final v50 f30820j0;
    public final fa1 f30821k0;
    public TextureView f30822n;
    public int f30823r;
    public boolean f30824s;
    public final ka1 v;
    public boolean f30825w;
    public String f30826x;
    public String f30827y;
    public static final Pattern f30793l0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f30794n0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f30795o0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f30796p0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f30797q0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f30798r0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f30799s0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f30800t0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f30801u0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f30802v0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f30803w0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f30804x0 = Pattern.compile("var\\s");
    public static final Pattern f30805y0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f30806z0 = Pattern.compile("[()]");
    public static final Pattern A0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public na1(Context context, boolean z10, ka1 ka1Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.f30819i0 = new fa1(this, 0);
        this.f30820j0 = new v50(this, 3);
        this.f30821k0 = new fa1(this, 1);
        setWillNotDraw(false);
        this.v = ka1Var;
        paint.setColor(-16777216);
        wg0 wg0Var = new wg0(this, context, 1);
        this.f30811c = wg0Var;
        addView(wg0Var, kb1.i(-1, -1, 17));
        ga1 ga1Var = new ga1(context, context);
        this.f30809b = ga1Var;
        final x81 x81Var = new x81(this);
        ga1Var.addJavascriptInterface(new Object(x81Var) {
            public final x81 f26368a;

            {
                this.f26368a = x81Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                na1 na1Var = (na1) this.f26368a.f34701a;
                AsyncTask asyncTask = na1Var.R;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = na1Var.R;
                    if (asyncTask2 instanceof ma1) {
                        ma1 ma1Var = (ma1) asyncTask2;
                        String[] strArr = ma1Var.f30490c;
                        String str2 = strArr[0];
                        String str3 = ma1Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        ma1Var.f30489b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = ga1Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g7 = ka1Var.g();
        this.f30815f = g7;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g7 != null) {
            g7.addView(textureView);
        } else {
            wg0Var.addView(textureView, kb1.i(-1, -1, 17));
        }
        if (g7 != null) {
            ImageView imageView = new ImageView(context);
            this.e = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            g7.addView(imageView);
        }
        t81 t81Var = new t81();
        this.f30807a = t81Var;
        t81Var.J = this;
        t81Var.V(textureView);
        ja1 ja1Var = new ja1(this, context);
        this.f30816f0 = ja1Var;
        if (g7 != null) {
            g7.addView(ja1Var);
        } else {
            addView(ja1Var, kb1.g(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f30808a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, kb1.i(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f30810b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ja1Var.addView(imageView2, kb1.h(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final na1 f27809b;

            {
                this.f27809b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        na1 na1Var = this.f27809b;
                        if (na1Var.f30825w && !na1Var.S && !na1Var.W && na1Var.M) {
                            na1Var.T = !na1Var.T;
                            na1Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        na1 na1Var2 = this.f27809b;
                        t81 t81Var2 = na1Var2.f30807a;
                        if (na1Var2.f30825w && na1Var2.f30826x != null) {
                            if (t81Var2.d == null) {
                                na1Var2.i();
                            }
                            if (t81Var2.y()) {
                                t81Var2.B();
                            } else {
                                na1Var2.V = false;
                                t81Var2.C();
                            }
                            na1Var2.n();
                            return;
                        }
                        return;
                    default:
                        na1 na1Var3 = this.f27809b;
                        ViewGroup viewGroup = na1Var3.f30815f;
                        boolean z11 = na1Var3.I;
                        ka1 ka1Var2 = na1Var3.v;
                        ja1 ja1Var2 = na1Var3.f30816f0;
                        wg0 wg0Var2 = na1Var3.f30811c;
                        TextureView textureView2 = na1Var3.d;
                        if (textureView2 != null && ka1Var2.h() && !na1Var3.S && !na1Var3.W && na1Var3.M) {
                            na1Var3.W = true;
                            if (!na1Var3.U) {
                                na1Var3.T = false;
                                ka1Var2.i(true, na1Var3.f30821k0, wg0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) wg0Var2.getParent();
                            if (viewGroup2 != na1Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(wg0Var2);
                                }
                                na1Var3.addView(wg0Var2, 0, kb1.i(-1, -1, 17));
                                wg0Var2.measure(View.MeasureSpec.makeMeasureSpec(na1Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(na1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = na1Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                na1Var3.h = null;
                            }
                            na1Var3.S = true;
                            na1Var3.U = false;
                            na1Var3.n();
                            na1Var3.o();
                            na1Var3.k();
                            na1Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                wg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) ja1Var2.getParent();
                            if (viewGroup3 != na1Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(ja1Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(ja1Var2);
                                } else {
                                    na1Var3.addView(ja1Var2, 1);
                                }
                            }
                            ja1Var2.d(false, false);
                            ka1Var2.i(false, null, wg0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f30812c0 = imageView3;
        imageView3.setScaleType(scaleType);
        ja1Var.addView(imageView3, kb1.i(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final na1 f27809b;

            {
                this.f27809b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        na1 na1Var = this.f27809b;
                        if (na1Var.f30825w && !na1Var.S && !na1Var.W && na1Var.M) {
                            na1Var.T = !na1Var.T;
                            na1Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        na1 na1Var2 = this.f27809b;
                        t81 t81Var2 = na1Var2.f30807a;
                        if (na1Var2.f30825w && na1Var2.f30826x != null) {
                            if (t81Var2.d == null) {
                                na1Var2.i();
                            }
                            if (t81Var2.y()) {
                                t81Var2.B();
                            } else {
                                na1Var2.V = false;
                                t81Var2.C();
                            }
                            na1Var2.n();
                            return;
                        }
                        return;
                    default:
                        na1 na1Var3 = this.f27809b;
                        ViewGroup viewGroup = na1Var3.f30815f;
                        boolean z11 = na1Var3.I;
                        ka1 ka1Var2 = na1Var3.v;
                        ja1 ja1Var2 = na1Var3.f30816f0;
                        wg0 wg0Var2 = na1Var3.f30811c;
                        TextureView textureView2 = na1Var3.d;
                        if (textureView2 != null && ka1Var2.h() && !na1Var3.S && !na1Var3.W && na1Var3.M) {
                            na1Var3.W = true;
                            if (!na1Var3.U) {
                                na1Var3.T = false;
                                ka1Var2.i(true, na1Var3.f30821k0, wg0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) wg0Var2.getParent();
                            if (viewGroup2 != na1Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(wg0Var2);
                                }
                                na1Var3.addView(wg0Var2, 0, kb1.i(-1, -1, 17));
                                wg0Var2.measure(View.MeasureSpec.makeMeasureSpec(na1Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(na1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = na1Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                na1Var3.h = null;
                            }
                            na1Var3.S = true;
                            na1Var3.U = false;
                            na1Var3.n();
                            na1Var3.o();
                            na1Var3.k();
                            na1Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                wg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) ja1Var2.getParent();
                            if (viewGroup3 != na1Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(ja1Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(ja1Var2);
                                } else {
                                    na1Var3.addView(ja1Var2, 1);
                                }
                            }
                            ja1Var2.d(false, false);
                            ka1Var2.i(false, null, wg0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f30813d0 = imageView4;
            imageView4.setScaleType(scaleType);
            ja1Var.addView(imageView4, kb1.i(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final na1 f27809b;

                {
                    this.f27809b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            na1 na1Var = this.f27809b;
                            if (na1Var.f30825w && !na1Var.S && !na1Var.W && na1Var.M) {
                                na1Var.T = !na1Var.T;
                                na1Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            na1 na1Var2 = this.f27809b;
                            t81 t81Var2 = na1Var2.f30807a;
                            if (na1Var2.f30825w && na1Var2.f30826x != null) {
                                if (t81Var2.d == null) {
                                    na1Var2.i();
                                }
                                if (t81Var2.y()) {
                                    t81Var2.B();
                                } else {
                                    na1Var2.V = false;
                                    t81Var2.C();
                                }
                                na1Var2.n();
                                return;
                            }
                            return;
                        default:
                            na1 na1Var3 = this.f27809b;
                            ViewGroup viewGroup = na1Var3.f30815f;
                            boolean z11 = na1Var3.I;
                            ka1 ka1Var2 = na1Var3.v;
                            ja1 ja1Var2 = na1Var3.f30816f0;
                            wg0 wg0Var2 = na1Var3.f30811c;
                            TextureView textureView2 = na1Var3.d;
                            if (textureView2 != null && ka1Var2.h() && !na1Var3.S && !na1Var3.W && na1Var3.M) {
                                na1Var3.W = true;
                                if (!na1Var3.U) {
                                    na1Var3.T = false;
                                    ka1Var2.i(true, na1Var3.f30821k0, wg0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) wg0Var2.getParent();
                                if (viewGroup2 != na1Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(wg0Var2);
                                    }
                                    na1Var3.addView(wg0Var2, 0, kb1.i(-1, -1, 17));
                                    wg0Var2.measure(View.MeasureSpec.makeMeasureSpec(na1Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(na1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                }
                                Bitmap bitmap = na1Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    na1Var3.h = null;
                                }
                                na1Var3.S = true;
                                na1Var3.U = false;
                                na1Var3.n();
                                na1Var3.o();
                                na1Var3.k();
                                na1Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    wg0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) ja1Var2.getParent();
                                if (viewGroup3 != na1Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(ja1Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(ja1Var2);
                                    } else {
                                        na1Var3.addView(ja1Var2, 1);
                                    }
                                }
                                ja1Var2.d(false, false);
                                ka1Var2.i(false, null, wg0Var2.getAspectRatio(), z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.na1.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.na1.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f30794n0.matcher(str);
                if (matcher.find()) {
                    str2 = matcher.group(1);
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    return str2;
                }
            } catch (Exception e) {
                FileLog.e(e);
                return null;
            }
        }
        return null;
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f30793l0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f30816f0;
    }

    private View getProgressView() {
        return this.f30808a0;
    }

    public final void b() {
        this.f30807a.H();
        AsyncTask asyncTask = this.R;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.R = null;
        }
        this.f30809b.stopLoading();
    }

    public final boolean f() {
        if (!this.U && !this.W) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r27, org.telegram.tgnet.TLRPC.Photo r28, java.lang.Object r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.na1.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f30811c;
    }

    public View getControlsView() {
        return this.f30816f0;
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
        ja1 ja1Var = this.f30816f0;
        if (ja1Var.getParent() != this) {
            ja1Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.f30826x;
        if (str != null) {
            String str2 = this.E;
            t81 t81Var = this.f30807a;
            if (str2 != null) {
                t81Var.G(Uri.parse(str), this.f30827y, Uri.parse(this.E), this.F);
            } else {
                t81Var.D(Uri.parse(str), this.f30827y);
            }
            t81Var.P(this.f30824s);
            int i10 = (t81Var.p() > (-9223372036854775807L) ? 1 : (t81Var.p() == (-9223372036854775807L) ? 0 : -1));
            ja1 ja1Var = this.f30816f0;
            if (i10 != 0) {
                ja1Var.b((int) (t81Var.p() / 1000));
            } else {
                ja1Var.b(0);
            }
            k();
            o();
            m();
            ja1Var.invalidate();
            int i11 = this.O;
            if (i11 != -1) {
                t81Var.L(i11 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f7 = 0.0f;
        RadialProgressView radialProgressView = this.f30808a0;
        if (z11) {
            AnimatorSet animatorSet = this.f30814e0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f30814e0 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f7));
            this.f30814e0.setDuration(150L);
            this.f30814e0.addListener(new i31(this, 8));
            this.f30814e0.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        radialProgressView.setAlpha(f7);
    }

    public final void k() {
        i2.j0 j0Var = this.f30807a.d;
        ImageView imageView = this.f30810b0;
        if (j0Var != null && !this.U) {
            imageView.setVisibility(0);
            if (!this.T) {
                imageView.setImageResource(R.drawable.ic_gofullscreen);
                imageView.setLayoutParams(kb1.h(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
                return;
            }
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(kb1.h(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
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
        ViewGroup viewGroup2 = this.f30815f;
        wg0 wg0Var = this.f30811c;
        if (viewGroup2 == null) {
            this.S = true;
            if (!this.T) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    wg0Var.addView(textureView);
                }
            }
            boolean z11 = this.T;
            ja1 ja1Var = this.f30816f0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) ja1Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(ja1Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) ja1Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(ja1Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(ja1Var);
                    } else {
                        addView(ja1Var, 1);
                    }
                }
            }
            TextureView a2 = this.v.a(this.f30816f0, this.T, wg0Var.getAspectRatio(), wg0Var.getVideoRotation(), z10);
            this.f30822n = a2;
            a2.setVisibility(4);
            if (this.T && this.f30822n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i10 = ja1.I;
            ja1Var.a();
            return;
        }
        if (this.T) {
            ViewGroup viewGroup5 = (ViewGroup) wg0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(wg0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) wg0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(wg0Var);
                }
                addView(wg0Var, 0);
            }
        }
        this.v.a(this.f30816f0, this.T, wg0Var.getAspectRatio(), wg0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i10;
        int i11;
        ImageView imageView = this.f30813d0;
        if (imageView == null) {
            return;
        }
        if (this.U) {
            i10 = R.drawable.ic_goinline;
        } else {
            i10 = R.drawable.ic_outinline;
        }
        imageView.setImageResource(i10);
        if (this.f30807a.d != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView.setVisibility(i11);
        if (this.U) {
            imageView.setLayoutParams(kb1.i(40, 40, 53));
        } else {
            imageView.setLayoutParams(kb1.i(56, 50, 53));
        }
    }

    public final void n() {
        int i10;
        int i11;
        int i12;
        ja1 ja1Var = this.f30816f0;
        int i13 = ja1.I;
        ja1Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.f30819i0);
        if (!this.f30807a.y()) {
            if (this.V) {
                ImageView imageView = this.f30812c0;
                if (this.U) {
                    i12 = R.drawable.ic_againinline;
                } else {
                    i12 = R.drawable.ic_again;
                }
                imageView.setImageResource(i12);
                return;
            }
            ImageView imageView2 = this.f30812c0;
            if (this.U) {
                i11 = R.drawable.ic_playinline;
            } else {
                i11 = R.drawable.ic_play;
            }
            imageView2.setImageResource(i11);
            return;
        }
        ImageView imageView3 = this.f30812c0;
        if (this.U) {
            i10 = R.drawable.ic_pauseinline;
        } else {
            i10 = R.drawable.ic_pause;
        }
        imageView3.setImageResource(i10);
        AndroidUtilities.runOnUIThread(this.f30819i0, 500L);
        if (!this.J) {
            this.J = true;
            ((AudioManager) ApplicationLoader.applicationContext.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new h2(this, i10, 13));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.Q);
    }

    @Override
    public final void onError(t81 t81Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        wg0 wg0Var = this.f30811c;
        int measuredWidth = (i14 - wg0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - wg0Var.getMeasuredHeight()) / 2;
        wg0Var.layout(measuredWidth, dp, wg0Var.getMeasuredWidth() + measuredWidth, wg0Var.getMeasuredHeight() + dp);
        ja1 ja1Var = this.f30816f0;
        if (ja1Var.getParent() == this) {
            ja1Var.layout(0, 0, ja1Var.getMeasuredWidth(), ja1Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f30808a0;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        ja1Var.f29602a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f30811c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        ja1 ja1Var = this.f30816f0;
        if (ja1Var.getParent() == this) {
            ja1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f30808a0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        ja1 ja1Var = this.f30816f0;
        t81 t81Var = this.f30807a;
        if (i10 != 2) {
            if (t81Var.p() != -9223372036854775807L) {
                ja1Var.b((int) (t81Var.p() / 1000));
            } else {
                ja1Var.b(0);
            }
        }
        ka1 ka1Var = this.v;
        if (i10 != 4 && i10 != 1 && t81Var.y()) {
            ka1Var.e(this, true);
        } else {
            ka1Var.e(this, false);
        }
        if (t81Var.y() && i10 != 4) {
            n();
        } else if (i10 == 4) {
            this.V = true;
            t81Var.B();
            t81Var.L(0L, false);
            n();
            ja1Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.S) {
            this.S = false;
            if (this.T || this.U) {
                if (this.U) {
                    this.f30823r = 1;
                }
                this.f30822n.setSurfaceTexture(surfaceTexture);
                this.f30822n.setSurfaceTextureListener(this.f30820j0);
                this.f30822n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f30823r == 2) {
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
            int i10 = this.f30817g0;
            int i11 = this.f30818h0;
            this.f30811c.getVideoRotation();
            this.v.f(this.f30816f0, false, i10, i11, this.I);
            this.f30823r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        wg0 wg0Var = this.f30811c;
        if (wg0Var != null) {
            float f11 = i10 * f7;
            this.f30817g0 = (int) f11;
            this.f30818h0 = i11;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / i11;
            }
            wg0Var.a(f10, 0);
            if (this.T) {
                this.v.c(f10);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.M = true;
        this.L = System.currentTimeMillis();
        this.f30816f0.invalidate();
    }

    public final void o() {
    }

    @Override
    public final void onSeekFinished(j2.a aVar) {
    }

    @Override
    public final void onSeekStarted(j2.a aVar) {
    }
}
