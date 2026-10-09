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
public final class ha1 extends ViewGroup implements h81, AudioManager.OnAudioFocusChangeListener {
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
    public final k81 f27012a;
    public final RadialProgressView f27013a0;
    public final z91 f27014b;
    public final ImageView f27015b0;
    public final zg0 f27016c;
    public final ImageView f27017c0;
    public final TextureView d;
    public final ImageView f27018d0;
    public final ImageView f27019e;
    public AnimatorSet f27020e0;
    public final ViewGroup f27021f;
    public final ca1 f27022f0;
    public int f27023g0;
    public Bitmap h;
    public int f27024h0;
    public final y91 f27025i0;
    public final ki.d f27026j0;
    public final y91 f27027k0;
    public TextureView f27028n;
    public int f27029r;
    public boolean f27030s;
    public final da1 v;
    public boolean f27031w;
    public String f27032x;
    public String f27033y;
    public static final Pattern f26998l0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f26999n0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f27000o0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f27001p0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f27002q0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f27003r0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f27004s0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f27005t0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f27006u0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f27007v0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f27008w0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f27009x0 = Pattern.compile("var\\s");
    public static final Pattern f27010y0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f27011z0 = Pattern.compile("[()]");
    public static final Pattern A0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public ha1(Context context, boolean z10, da1 da1Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.f27025i0 = new y91(this, 0);
        this.f27026j0 = new ki.d(this, 4);
        this.f27027k0 = new y91(this, 1);
        setWillNotDraw(false);
        this.v = da1Var;
        paint.setColor(-16777216);
        zg0 zg0Var = new zg0(this, context, 1);
        this.f27016c = zg0Var;
        addView(zg0Var, w7.x5.e(-1, -1, 17));
        z91 z91Var = new z91(context, context);
        this.f27014b = z91Var;
        final p81 p81Var = new p81(this);
        z91Var.addJavascriptInterface(new Object(p81Var) {
            public final p81 f24386a;

            {
                this.f24386a = p81Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                ha1 ha1Var = (ha1) this.f24386a.f29796a;
                AsyncTask asyncTask = ha1Var.R;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = ha1Var.R;
                    if (asyncTask2 instanceof ga1) {
                        ga1 ga1Var = (ga1) asyncTask2;
                        String[] strArr = ga1Var.f26655c;
                        String str2 = strArr[0];
                        String str3 = ga1Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        ga1Var.f26654b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = z91Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = da1Var.g();
        this.f27021f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            zg0Var.addView(textureView, w7.x5.e(-1, -1, 17));
        }
        if (g10 != null) {
            ImageView imageView = new ImageView(context);
            this.f27019e = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            g10.addView(imageView);
        }
        k81 k81Var = new k81();
        this.f27012a = k81Var;
        k81Var.J = this;
        k81Var.V(textureView);
        ca1 ca1Var = new ca1(this, context);
        this.f27022f0 = ca1Var;
        if (g10 != null) {
            g10.addView(ca1Var);
        } else {
            addView(ca1Var, w7.x5.d(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f27013a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, w7.x5.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f27015b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ca1Var.addView(imageView2, w7.x5.a(56.0f, 0.0f, 0.0f, 0.0f, 5.0f, 56, 85));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final ha1 f32792b;

            {
                this.f32792b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ha1 ha1Var = this.f32792b;
                        if (ha1Var.f27031w && !ha1Var.S && !ha1Var.W && ha1Var.M) {
                            ha1Var.T = !ha1Var.T;
                            ha1Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        ha1 ha1Var2 = this.f32792b;
                        k81 k81Var2 = ha1Var2.f27012a;
                        if (ha1Var2.f27031w && ha1Var2.f27032x != null) {
                            if (k81Var2.d == null) {
                                ha1Var2.i();
                            }
                            if (k81Var2.y()) {
                                k81Var2.B();
                            } else {
                                ha1Var2.V = false;
                                k81Var2.C();
                            }
                            ha1Var2.n();
                            return;
                        }
                        return;
                    default:
                        ha1 ha1Var3 = this.f32792b;
                        ViewGroup viewGroup = ha1Var3.f27021f;
                        boolean z11 = ha1Var3.I;
                        da1 da1Var2 = ha1Var3.v;
                        ca1 ca1Var2 = ha1Var3.f27022f0;
                        zg0 zg0Var2 = ha1Var3.f27016c;
                        TextureView textureView2 = ha1Var3.d;
                        if (textureView2 != null && da1Var2.h() && !ha1Var3.S && !ha1Var3.W && ha1Var3.M) {
                            ha1Var3.W = true;
                            if (!ha1Var3.U) {
                                ha1Var3.T = false;
                                da1Var2.i(true, ha1Var3.f27027k0, zg0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) zg0Var2.getParent();
                            if (viewGroup2 != ha1Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(zg0Var2);
                                }
                                ha1Var3.addView(zg0Var2, 0, w7.x5.e(-1, -1, 17));
                                zg0Var2.measure(View.MeasureSpec.makeMeasureSpec(ha1Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ha1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = ha1Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                ha1Var3.h = null;
                            }
                            ha1Var3.S = true;
                            ha1Var3.U = false;
                            ha1Var3.n();
                            ha1Var3.o();
                            ha1Var3.k();
                            ha1Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                zg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) ca1Var2.getParent();
                            if (viewGroup3 != ha1Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(ca1Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(ca1Var2);
                                } else {
                                    ha1Var3.addView(ca1Var2, 1);
                                }
                            }
                            ca1Var2.d(false, false);
                            da1Var2.i(false, null, zg0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f27017c0 = imageView3;
        imageView3.setScaleType(scaleType);
        ca1Var.addView(imageView3, w7.x5.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ha1 f32792b;

            {
                this.f32792b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ha1 ha1Var = this.f32792b;
                        if (ha1Var.f27031w && !ha1Var.S && !ha1Var.W && ha1Var.M) {
                            ha1Var.T = !ha1Var.T;
                            ha1Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        ha1 ha1Var2 = this.f32792b;
                        k81 k81Var2 = ha1Var2.f27012a;
                        if (ha1Var2.f27031w && ha1Var2.f27032x != null) {
                            if (k81Var2.d == null) {
                                ha1Var2.i();
                            }
                            if (k81Var2.y()) {
                                k81Var2.B();
                            } else {
                                ha1Var2.V = false;
                                k81Var2.C();
                            }
                            ha1Var2.n();
                            return;
                        }
                        return;
                    default:
                        ha1 ha1Var3 = this.f32792b;
                        ViewGroup viewGroup = ha1Var3.f27021f;
                        boolean z11 = ha1Var3.I;
                        da1 da1Var2 = ha1Var3.v;
                        ca1 ca1Var2 = ha1Var3.f27022f0;
                        zg0 zg0Var2 = ha1Var3.f27016c;
                        TextureView textureView2 = ha1Var3.d;
                        if (textureView2 != null && da1Var2.h() && !ha1Var3.S && !ha1Var3.W && ha1Var3.M) {
                            ha1Var3.W = true;
                            if (!ha1Var3.U) {
                                ha1Var3.T = false;
                                da1Var2.i(true, ha1Var3.f27027k0, zg0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) zg0Var2.getParent();
                            if (viewGroup2 != ha1Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(zg0Var2);
                                }
                                ha1Var3.addView(zg0Var2, 0, w7.x5.e(-1, -1, 17));
                                zg0Var2.measure(View.MeasureSpec.makeMeasureSpec(ha1Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ha1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = ha1Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                ha1Var3.h = null;
                            }
                            ha1Var3.S = true;
                            ha1Var3.U = false;
                            ha1Var3.n();
                            ha1Var3.o();
                            ha1Var3.k();
                            ha1Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                zg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) ca1Var2.getParent();
                            if (viewGroup3 != ha1Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(ca1Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(ca1Var2);
                                } else {
                                    ha1Var3.addView(ca1Var2, 1);
                                }
                            }
                            ca1Var2.d(false, false);
                            da1Var2.i(false, null, zg0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f27018d0 = imageView4;
            imageView4.setScaleType(scaleType);
            ca1Var.addView(imageView4, w7.x5.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final ha1 f32792b;

                {
                    this.f32792b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            ha1 ha1Var = this.f32792b;
                            if (ha1Var.f27031w && !ha1Var.S && !ha1Var.W && ha1Var.M) {
                                ha1Var.T = !ha1Var.T;
                                ha1Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            ha1 ha1Var2 = this.f32792b;
                            k81 k81Var2 = ha1Var2.f27012a;
                            if (ha1Var2.f27031w && ha1Var2.f27032x != null) {
                                if (k81Var2.d == null) {
                                    ha1Var2.i();
                                }
                                if (k81Var2.y()) {
                                    k81Var2.B();
                                } else {
                                    ha1Var2.V = false;
                                    k81Var2.C();
                                }
                                ha1Var2.n();
                                return;
                            }
                            return;
                        default:
                            ha1 ha1Var3 = this.f32792b;
                            ViewGroup viewGroup = ha1Var3.f27021f;
                            boolean z11 = ha1Var3.I;
                            da1 da1Var2 = ha1Var3.v;
                            ca1 ca1Var2 = ha1Var3.f27022f0;
                            zg0 zg0Var2 = ha1Var3.f27016c;
                            TextureView textureView2 = ha1Var3.d;
                            if (textureView2 != null && da1Var2.h() && !ha1Var3.S && !ha1Var3.W && ha1Var3.M) {
                                ha1Var3.W = true;
                                if (!ha1Var3.U) {
                                    ha1Var3.T = false;
                                    da1Var2.i(true, ha1Var3.f27027k0, zg0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) zg0Var2.getParent();
                                if (viewGroup2 != ha1Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(zg0Var2);
                                    }
                                    ha1Var3.addView(zg0Var2, 0, w7.x5.e(-1, -1, 17));
                                    zg0Var2.measure(View.MeasureSpec.makeMeasureSpec(ha1Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ha1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                }
                                Bitmap bitmap = ha1Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    ha1Var3.h = null;
                                }
                                ha1Var3.S = true;
                                ha1Var3.U = false;
                                ha1Var3.n();
                                ha1Var3.o();
                                ha1Var3.k();
                                ha1Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    zg0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) ca1Var2.getParent();
                                if (viewGroup3 != ha1Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(ca1Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(ca1Var2);
                                    } else {
                                        ha1Var3.addView(ca1Var2, 1);
                                    }
                                }
                                ca1Var2.d(false, false);
                                da1Var2.i(false, null, zg0Var2.getAspectRatio(), z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ha1.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ha1.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f26999n0.matcher(str);
                if (matcher.find()) {
                    str2 = matcher.group(1);
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    return str2;
                }
            } catch (Exception e7) {
                FileLog.e(e7);
                return null;
            }
        }
        return null;
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f26998l0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f27022f0;
    }

    private View getProgressView() {
        return this.f27013a0;
    }

    public final void b() {
        this.f27012a.H();
        AsyncTask asyncTask = this.R;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.R = null;
        }
        this.f27014b.stopLoading();
    }

    public final boolean f() {
        if (!this.U && !this.W) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r27, org.telegram.tgnet.TLRPC.Photo r28, java.lang.Object r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ha1.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f27016c;
    }

    public View getControlsView() {
        return this.f27022f0;
    }

    public ImageView getTextureImageView() {
        return this.f27019e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.G;
    }

    public final void h() {
        ca1 ca1Var = this.f27022f0;
        if (ca1Var.getParent() != this) {
            ca1Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.f27032x;
        if (str != null) {
            String str2 = this.E;
            k81 k81Var = this.f27012a;
            if (str2 != null) {
                k81Var.G(Uri.parse(str), this.f27033y, Uri.parse(this.E), this.F);
            } else {
                k81Var.D(Uri.parse(str), this.f27033y);
            }
            k81Var.P(this.f27030s);
            int i10 = (k81Var.p() > (-9223372036854775807L) ? 1 : (k81Var.p() == (-9223372036854775807L) ? 0 : -1));
            ca1 ca1Var = this.f27022f0;
            if (i10 != 0) {
                ca1Var.b((int) (k81Var.p() / 1000));
            } else {
                ca1Var.b(0);
            }
            k();
            o();
            m();
            ca1Var.invalidate();
            int i11 = this.O;
            if (i11 != -1) {
                k81Var.L(i11 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f7 = 0.0f;
        RadialProgressView radialProgressView = this.f27013a0;
        if (z11) {
            AnimatorSet animatorSet = this.f27020e0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f27020e0 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f7));
            this.f27020e0.setDuration(150L);
            this.f27020e0.addListener(new i91(this, 1));
            this.f27020e0.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        radialProgressView.setAlpha(f7);
    }

    public final void k() {
        i2.f0 f0Var = this.f27012a.d;
        ImageView imageView = this.f27015b0;
        if (f0Var != null && !this.U) {
            imageView.setVisibility(0);
            if (!this.T) {
                imageView.setImageResource(R.drawable.ic_gofullscreen);
                imageView.setLayoutParams(w7.x5.a(56.0f, 0.0f, 0.0f, 0.0f, 5.0f, 56, 85));
                return;
            }
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(w7.x5.a(56.0f, 0.0f, 0.0f, 0.0f, 1.0f, 56, 85));
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
        ViewGroup viewGroup2 = this.f27021f;
        zg0 zg0Var = this.f27016c;
        if (viewGroup2 == null) {
            this.S = true;
            if (!this.T) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    zg0Var.addView(textureView);
                }
            }
            boolean z11 = this.T;
            ca1 ca1Var = this.f27022f0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) ca1Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(ca1Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) ca1Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(ca1Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(ca1Var);
                    } else {
                        addView(ca1Var, 1);
                    }
                }
            }
            TextureView a2 = this.v.a(this.f27022f0, this.T, zg0Var.getAspectRatio(), zg0Var.getVideoRotation(), z10);
            this.f27028n = a2;
            a2.setVisibility(4);
            if (this.T && this.f27028n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i10 = ca1.I;
            ca1Var.a();
            return;
        }
        if (this.T) {
            ViewGroup viewGroup5 = (ViewGroup) zg0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(zg0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) zg0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(zg0Var);
                }
                addView(zg0Var, 0);
            }
        }
        this.v.a(this.f27022f0, this.T, zg0Var.getAspectRatio(), zg0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i10;
        int i11;
        ImageView imageView = this.f27018d0;
        if (imageView == null) {
            return;
        }
        if (this.U) {
            i10 = R.drawable.ic_goinline;
        } else {
            i10 = R.drawable.ic_outinline;
        }
        imageView.setImageResource(i10);
        if (this.f27012a.d != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView.setVisibility(i11);
        if (this.U) {
            imageView.setLayoutParams(w7.x5.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(w7.x5.e(56, 50, 53));
        }
    }

    public final void n() {
        int i10;
        int i11;
        int i12;
        ca1 ca1Var = this.f27022f0;
        int i13 = ca1.I;
        ca1Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.f27025i0);
        if (!this.f27012a.y()) {
            if (this.V) {
                ImageView imageView = this.f27017c0;
                if (this.U) {
                    i12 = R.drawable.ic_againinline;
                } else {
                    i12 = R.drawable.ic_again;
                }
                imageView.setImageResource(i12);
                return;
            }
            ImageView imageView2 = this.f27017c0;
            if (this.U) {
                i11 = R.drawable.ic_playinline;
            } else {
                i11 = R.drawable.ic_play;
            }
            imageView2.setImageResource(i11);
            return;
        }
        ImageView imageView3 = this.f27017c0;
        if (this.U) {
            i10 = R.drawable.ic_pauseinline;
        } else {
            i10 = R.drawable.ic_pause;
        }
        imageView3.setImageResource(i10);
        AndroidUtilities.runOnUIThread(this.f27025i0, 500L);
        if (!this.J) {
            this.J = true;
            ((AudioManager) ApplicationLoader.applicationContext.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new nd(this, i10, 13));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.Q);
    }

    @Override
    public final void onError(k81 k81Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        zg0 zg0Var = this.f27016c;
        int measuredWidth = (i14 - zg0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - zg0Var.getMeasuredHeight()) / 2;
        zg0Var.layout(measuredWidth, dp, zg0Var.getMeasuredWidth() + measuredWidth, zg0Var.getMeasuredHeight() + dp);
        ca1 ca1Var = this.f27022f0;
        if (ca1Var.getParent() == this) {
            ca1Var.layout(0, 0, ca1Var.getMeasuredWidth(), ca1Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f27013a0;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        ca1Var.f25307a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f27016c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        ca1 ca1Var = this.f27022f0;
        if (ca1Var.getParent() == this) {
            ca1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f27013a0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        ca1 ca1Var = this.f27022f0;
        k81 k81Var = this.f27012a;
        if (i10 != 2) {
            if (k81Var.p() != -9223372036854775807L) {
                ca1Var.b((int) (k81Var.p() / 1000));
            } else {
                ca1Var.b(0);
            }
        }
        da1 da1Var = this.v;
        if (i10 != 4 && i10 != 1 && k81Var.y()) {
            da1Var.e(this, true);
        } else {
            da1Var.e(this, false);
        }
        if (k81Var.y() && i10 != 4) {
            n();
        } else if (i10 == 4) {
            this.V = true;
            k81Var.B();
            k81Var.L(0L, false);
            n();
            ca1Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.S) {
            this.S = false;
            if (this.T || this.U) {
                if (this.U) {
                    this.f27029r = 1;
                }
                this.f27028n.setSurfaceTexture(surfaceTexture);
                this.f27028n.setSurfaceTextureListener(this.f27026j0);
                this.f27028n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f27029r == 2) {
            ImageView imageView = this.f27019e;
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
            int i10 = this.f27023g0;
            int i11 = this.f27024h0;
            this.f27016c.getVideoRotation();
            this.v.f(this.f27022f0, false, i10, i11, this.I);
            this.f27029r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        zg0 zg0Var = this.f27016c;
        if (zg0Var != null) {
            float f11 = i10 * f7;
            this.f27023g0 = (int) f11;
            this.f27024h0 = i11;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / i11;
            }
            zg0Var.a(f10, 0);
            if (this.T) {
                this.v.c(f10);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.M = true;
        this.L = System.currentTimeMillis();
        this.f27022f0.invalidate();
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
