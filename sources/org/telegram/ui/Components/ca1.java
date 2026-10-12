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
public final class ca1 extends ViewGroup implements e81, AudioManager.OnAudioFocusChangeListener {
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
    public final h81 f23990a;
    public final RadialProgressView f23991a0;
    public final v91 f23992b;
    public final ImageView f23993b0;
    public final xg0 f23994c;
    public final ImageView f23995c0;
    public final TextureView d;
    public final ImageView f23996d0;
    public final ImageView e;
    public AnimatorSet f23997e0;
    public final ViewGroup f23998f;
    public final y91 f23999f0;
    public int f24000g0;
    public Bitmap h;
    public int f24001h0;
    public final u91 f24002i0;
    public final li.e f24003j0;
    public final u91 f24004k0;
    public TextureView f24005n;
    public int f24006r;
    public boolean f24007s;
    public final z91 v;
    public boolean f24008w;
    public String f24009x;
    public String f24010y;
    public static final Pattern f23976l0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f23977n0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f23978o0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f23979p0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f23980q0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f23981r0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f23982s0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f23983t0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f23984u0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f23985v0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f23986w0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f23987x0 = Pattern.compile("var\\s");
    public static final Pattern f23988y0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f23989z0 = Pattern.compile("[()]");
    public static final Pattern A0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public ca1(Context context, boolean z10, z91 z91Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.f24002i0 = new u91(this, 0);
        this.f24003j0 = new li.e(this, 4);
        this.f24004k0 = new u91(this, 1);
        setWillNotDraw(false);
        this.v = z91Var;
        paint.setColor(-16777216);
        xg0 xg0Var = new xg0(this, context, 1);
        this.f23994c = xg0Var;
        addView(xg0Var, w7.a6.e(-1, -1, 17));
        v91 v91Var = new v91(context, context);
        this.f23992b = v91Var;
        final m81 m81Var = new m81(this);
        v91Var.addJavascriptInterface(new Object(m81Var) {
            public final m81 f23362a;

            {
                this.f23362a = m81Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                ca1 ca1Var = (ca1) this.f23362a.f27305a;
                AsyncTask asyncTask = ca1Var.R;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = ca1Var.R;
                    if (asyncTask2 instanceof ba1) {
                        ba1 ba1Var = (ba1) asyncTask2;
                        String[] strArr = ba1Var.f23733c;
                        String str2 = strArr[0];
                        String str3 = ba1Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        ba1Var.f23732b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = v91Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = z91Var.g();
        this.f23998f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            xg0Var.addView(textureView, w7.a6.e(-1, -1, 17));
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
        h81 h81Var = new h81();
        this.f23990a = h81Var;
        h81Var.J = this;
        h81Var.V(textureView);
        y91 y91Var = new y91(this, context);
        this.f23999f0 = y91Var;
        if (g10 != null) {
            g10.addView(y91Var);
        } else {
            addView(y91Var, w7.a6.d(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f23991a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, w7.a6.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f23993b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        y91Var.addView(imageView2, w7.a6.a(56.0f, 0.0f, 0.0f, 0.0f, 5.0f, 56, 85));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final ca1 f29316b;

            {
                this.f29316b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ca1 ca1Var = this.f29316b;
                        if (ca1Var.f24008w && !ca1Var.S && !ca1Var.W && ca1Var.M) {
                            ca1Var.T = !ca1Var.T;
                            ca1Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        ca1 ca1Var2 = this.f29316b;
                        h81 h81Var2 = ca1Var2.f23990a;
                        if (ca1Var2.f24008w && ca1Var2.f24009x != null) {
                            if (h81Var2.d == null) {
                                ca1Var2.i();
                            }
                            if (h81Var2.y()) {
                                h81Var2.B();
                            } else {
                                ca1Var2.V = false;
                                h81Var2.C();
                            }
                            ca1Var2.n();
                            return;
                        }
                        return;
                    default:
                        ca1 ca1Var3 = this.f29316b;
                        ViewGroup viewGroup = ca1Var3.f23998f;
                        boolean z11 = ca1Var3.I;
                        z91 z91Var2 = ca1Var3.v;
                        y91 y91Var2 = ca1Var3.f23999f0;
                        xg0 xg0Var2 = ca1Var3.f23994c;
                        TextureView textureView2 = ca1Var3.d;
                        if (textureView2 != null && z91Var2.h() && !ca1Var3.S && !ca1Var3.W && ca1Var3.M) {
                            ca1Var3.W = true;
                            if (!ca1Var3.U) {
                                ca1Var3.T = false;
                                z91Var2.i(true, ca1Var3.f24004k0, xg0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) xg0Var2.getParent();
                            if (viewGroup2 != ca1Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(xg0Var2);
                                }
                                ca1Var3.addView(xg0Var2, 0, w7.a6.e(-1, -1, 17));
                                xg0Var2.measure(View.MeasureSpec.makeMeasureSpec(ca1Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ca1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = ca1Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                ca1Var3.h = null;
                            }
                            ca1Var3.S = true;
                            ca1Var3.U = false;
                            ca1Var3.n();
                            ca1Var3.o();
                            ca1Var3.k();
                            ca1Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                xg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) y91Var2.getParent();
                            if (viewGroup3 != ca1Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(y91Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(y91Var2);
                                } else {
                                    ca1Var3.addView(y91Var2, 1);
                                }
                            }
                            y91Var2.d(false, false);
                            z91Var2.i(false, null, xg0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f23995c0 = imageView3;
        imageView3.setScaleType(scaleType);
        y91Var.addView(imageView3, w7.a6.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ca1 f29316b;

            {
                this.f29316b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ca1 ca1Var = this.f29316b;
                        if (ca1Var.f24008w && !ca1Var.S && !ca1Var.W && ca1Var.M) {
                            ca1Var.T = !ca1Var.T;
                            ca1Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        ca1 ca1Var2 = this.f29316b;
                        h81 h81Var2 = ca1Var2.f23990a;
                        if (ca1Var2.f24008w && ca1Var2.f24009x != null) {
                            if (h81Var2.d == null) {
                                ca1Var2.i();
                            }
                            if (h81Var2.y()) {
                                h81Var2.B();
                            } else {
                                ca1Var2.V = false;
                                h81Var2.C();
                            }
                            ca1Var2.n();
                            return;
                        }
                        return;
                    default:
                        ca1 ca1Var3 = this.f29316b;
                        ViewGroup viewGroup = ca1Var3.f23998f;
                        boolean z11 = ca1Var3.I;
                        z91 z91Var2 = ca1Var3.v;
                        y91 y91Var2 = ca1Var3.f23999f0;
                        xg0 xg0Var2 = ca1Var3.f23994c;
                        TextureView textureView2 = ca1Var3.d;
                        if (textureView2 != null && z91Var2.h() && !ca1Var3.S && !ca1Var3.W && ca1Var3.M) {
                            ca1Var3.W = true;
                            if (!ca1Var3.U) {
                                ca1Var3.T = false;
                                z91Var2.i(true, ca1Var3.f24004k0, xg0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) xg0Var2.getParent();
                            if (viewGroup2 != ca1Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(xg0Var2);
                                }
                                ca1Var3.addView(xg0Var2, 0, w7.a6.e(-1, -1, 17));
                                xg0Var2.measure(View.MeasureSpec.makeMeasureSpec(ca1Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ca1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = ca1Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                ca1Var3.h = null;
                            }
                            ca1Var3.S = true;
                            ca1Var3.U = false;
                            ca1Var3.n();
                            ca1Var3.o();
                            ca1Var3.k();
                            ca1Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                xg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) y91Var2.getParent();
                            if (viewGroup3 != ca1Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(y91Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(y91Var2);
                                } else {
                                    ca1Var3.addView(y91Var2, 1);
                                }
                            }
                            y91Var2.d(false, false);
                            z91Var2.i(false, null, xg0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f23996d0 = imageView4;
            imageView4.setScaleType(scaleType);
            y91Var.addView(imageView4, w7.a6.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final ca1 f29316b;

                {
                    this.f29316b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            ca1 ca1Var = this.f29316b;
                            if (ca1Var.f24008w && !ca1Var.S && !ca1Var.W && ca1Var.M) {
                                ca1Var.T = !ca1Var.T;
                                ca1Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            ca1 ca1Var2 = this.f29316b;
                            h81 h81Var2 = ca1Var2.f23990a;
                            if (ca1Var2.f24008w && ca1Var2.f24009x != null) {
                                if (h81Var2.d == null) {
                                    ca1Var2.i();
                                }
                                if (h81Var2.y()) {
                                    h81Var2.B();
                                } else {
                                    ca1Var2.V = false;
                                    h81Var2.C();
                                }
                                ca1Var2.n();
                                return;
                            }
                            return;
                        default:
                            ca1 ca1Var3 = this.f29316b;
                            ViewGroup viewGroup = ca1Var3.f23998f;
                            boolean z11 = ca1Var3.I;
                            z91 z91Var2 = ca1Var3.v;
                            y91 y91Var2 = ca1Var3.f23999f0;
                            xg0 xg0Var2 = ca1Var3.f23994c;
                            TextureView textureView2 = ca1Var3.d;
                            if (textureView2 != null && z91Var2.h() && !ca1Var3.S && !ca1Var3.W && ca1Var3.M) {
                                ca1Var3.W = true;
                                if (!ca1Var3.U) {
                                    ca1Var3.T = false;
                                    z91Var2.i(true, ca1Var3.f24004k0, xg0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) xg0Var2.getParent();
                                if (viewGroup2 != ca1Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(xg0Var2);
                                    }
                                    ca1Var3.addView(xg0Var2, 0, w7.a6.e(-1, -1, 17));
                                    xg0Var2.measure(View.MeasureSpec.makeMeasureSpec(ca1Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ca1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                }
                                Bitmap bitmap = ca1Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    ca1Var3.h = null;
                                }
                                ca1Var3.S = true;
                                ca1Var3.U = false;
                                ca1Var3.n();
                                ca1Var3.o();
                                ca1Var3.k();
                                ca1Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    xg0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) y91Var2.getParent();
                                if (viewGroup3 != ca1Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(y91Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(y91Var2);
                                    } else {
                                        ca1Var3.addView(y91Var2, 1);
                                    }
                                }
                                y91Var2.d(false, false);
                                z91Var2.i(false, null, xg0Var2.getAspectRatio(), z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ca1.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ca1.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f23977n0.matcher(str);
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
        Matcher matcher = f23976l0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f23999f0;
    }

    private View getProgressView() {
        return this.f23991a0;
    }

    public final void b() {
        this.f23990a.H();
        AsyncTask asyncTask = this.R;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.R = null;
        }
        this.f23992b.stopLoading();
    }

    public final boolean f() {
        if (!this.U && !this.W) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r27, org.telegram.tgnet.TLRPC.Photo r28, java.lang.Object r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ca1.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f23994c;
    }

    public View getControlsView() {
        return this.f23999f0;
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
        y91 y91Var = this.f23999f0;
        if (y91Var.getParent() != this) {
            y91Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.f24009x;
        if (str != null) {
            String str2 = this.E;
            h81 h81Var = this.f23990a;
            if (str2 != null) {
                h81Var.G(Uri.parse(str), this.f24010y, Uri.parse(this.E), this.F);
            } else {
                h81Var.D(Uri.parse(str), this.f24010y);
            }
            h81Var.P(this.f24007s);
            int i10 = (h81Var.p() > (-9223372036854775807L) ? 1 : (h81Var.p() == (-9223372036854775807L) ? 0 : -1));
            y91 y91Var = this.f23999f0;
            if (i10 != 0) {
                y91Var.b((int) (h81Var.p() / 1000));
            } else {
                y91Var.b(0);
            }
            k();
            o();
            m();
            y91Var.invalidate();
            int i11 = this.O;
            if (i11 != -1) {
                h81Var.L(i11 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f7 = 0.0f;
        RadialProgressView radialProgressView = this.f23991a0;
        if (z11) {
            AnimatorSet animatorSet = this.f23997e0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f23997e0 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f7));
            this.f23997e0.setDuration(150L);
            this.f23997e0.addListener(new u61(this, 4));
            this.f23997e0.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        radialProgressView.setAlpha(f7);
    }

    public final void k() {
        i2.h0 h0Var = this.f23990a.d;
        ImageView imageView = this.f23993b0;
        if (h0Var != null && !this.U) {
            imageView.setVisibility(0);
            if (!this.T) {
                imageView.setImageResource(R.drawable.ic_gofullscreen);
                imageView.setLayoutParams(w7.a6.a(56.0f, 0.0f, 0.0f, 0.0f, 5.0f, 56, 85));
                return;
            }
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(w7.a6.a(56.0f, 0.0f, 0.0f, 0.0f, 1.0f, 56, 85));
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
        ViewGroup viewGroup2 = this.f23998f;
        xg0 xg0Var = this.f23994c;
        if (viewGroup2 == null) {
            this.S = true;
            if (!this.T) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    xg0Var.addView(textureView);
                }
            }
            boolean z11 = this.T;
            y91 y91Var = this.f23999f0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) y91Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(y91Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) y91Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(y91Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(y91Var);
                    } else {
                        addView(y91Var, 1);
                    }
                }
            }
            TextureView a2 = this.v.a(this.f23999f0, this.T, xg0Var.getAspectRatio(), xg0Var.getVideoRotation(), z10);
            this.f24005n = a2;
            a2.setVisibility(4);
            if (this.T && this.f24005n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i10 = y91.I;
            y91Var.a();
            return;
        }
        if (this.T) {
            ViewGroup viewGroup5 = (ViewGroup) xg0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(xg0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) xg0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(xg0Var);
                }
                addView(xg0Var, 0);
            }
        }
        this.v.a(this.f23999f0, this.T, xg0Var.getAspectRatio(), xg0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i10;
        int i11;
        ImageView imageView = this.f23996d0;
        if (imageView == null) {
            return;
        }
        if (this.U) {
            i10 = R.drawable.ic_goinline;
        } else {
            i10 = R.drawable.ic_outinline;
        }
        imageView.setImageResource(i10);
        if (this.f23990a.d != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView.setVisibility(i11);
        if (this.U) {
            imageView.setLayoutParams(w7.a6.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(w7.a6.e(56, 50, 53));
        }
    }

    public final void n() {
        int i10;
        int i11;
        int i12;
        y91 y91Var = this.f23999f0;
        int i13 = y91.I;
        y91Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.f24002i0);
        if (!this.f23990a.y()) {
            if (this.V) {
                ImageView imageView = this.f23995c0;
                if (this.U) {
                    i12 = R.drawable.ic_againinline;
                } else {
                    i12 = R.drawable.ic_again;
                }
                imageView.setImageResource(i12);
                return;
            }
            ImageView imageView2 = this.f23995c0;
            if (this.U) {
                i11 = R.drawable.ic_playinline;
            } else {
                i11 = R.drawable.ic_play;
            }
            imageView2.setImageResource(i11);
            return;
        }
        ImageView imageView3 = this.f23995c0;
        if (this.U) {
            i10 = R.drawable.ic_pauseinline;
        } else {
            i10 = R.drawable.ic_pause;
        }
        imageView3.setImageResource(i10);
        AndroidUtilities.runOnUIThread(this.f24002i0, 500L);
        if (!this.J) {
            this.J = true;
            ((AudioManager) ApplicationLoader.applicationContext.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new o8(this, i10, 15));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.Q);
    }

    @Override
    public final void onError(h81 h81Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        xg0 xg0Var = this.f23994c;
        int measuredWidth = (i14 - xg0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - xg0Var.getMeasuredHeight()) / 2;
        xg0Var.layout(measuredWidth, dp, xg0Var.getMeasuredWidth() + measuredWidth, xg0Var.getMeasuredHeight() + dp);
        y91 y91Var = this.f23999f0;
        if (y91Var.getParent() == this) {
            y91Var.layout(0, 0, y91Var.getMeasuredWidth(), y91Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f23991a0;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        y91Var.f31519a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f23994c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        y91 y91Var = this.f23999f0;
        if (y91Var.getParent() == this) {
            y91Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f23991a0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        y91 y91Var = this.f23999f0;
        h81 h81Var = this.f23990a;
        if (i10 != 2) {
            if (h81Var.p() != -9223372036854775807L) {
                y91Var.b((int) (h81Var.p() / 1000));
            } else {
                y91Var.b(0);
            }
        }
        z91 z91Var = this.v;
        if (i10 != 4 && i10 != 1 && h81Var.y()) {
            z91Var.e(this, true);
        } else {
            z91Var.e(this, false);
        }
        if (h81Var.y() && i10 != 4) {
            n();
        } else if (i10 == 4) {
            this.V = true;
            h81Var.B();
            h81Var.L(0L, false);
            n();
            y91Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.S) {
            this.S = false;
            if (this.T || this.U) {
                if (this.U) {
                    this.f24006r = 1;
                }
                this.f24005n.setSurfaceTexture(surfaceTexture);
                this.f24005n.setSurfaceTextureListener(this.f24003j0);
                this.f24005n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f24006r == 2) {
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
            int i10 = this.f24000g0;
            int i11 = this.f24001h0;
            this.f23994c.getVideoRotation();
            this.v.f(this.f23999f0, false, i10, i11, this.I);
            this.f24006r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        xg0 xg0Var = this.f23994c;
        if (xg0Var != null) {
            float f11 = i10 * f7;
            this.f24000g0 = (int) f11;
            this.f24001h0 = i11;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / i11;
            }
            xg0Var.a(f10, 0);
            if (this.T) {
                this.v.c(f10);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.M = true;
        this.L = System.currentTimeMillis();
        this.f23999f0.invalidate();
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
