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
public final class ia1 extends ViewGroup implements i81, AudioManager.OnAudioFocusChangeListener {
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
    public final l81 f27318a;
    public final RadialProgressView f27319a0;
    public final aa1 f27320b;
    public final ImageView f27321b0;
    public final ah0 f27322c;
    public final ImageView f27323c0;
    public final TextureView d;
    public final ImageView f27324d0;
    public final ImageView f27325e;
    public AnimatorSet f27326e0;
    public final ViewGroup f27327f;
    public final da1 f27328f0;
    public int f27329g0;
    public Bitmap h;
    public int f27330h0;
    public final z91 f27331i0;
    public final ki.d f27332j0;
    public final z91 f27333k0;
    public TextureView f27334n;
    public int f27335r;
    public boolean f27336s;
    public final ea1 v;
    public boolean f27337w;
    public String f27338x;
    public String f27339y;
    public static final Pattern f27304l0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f27305n0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f27306o0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f27307p0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f27308q0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f27309r0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f27310s0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f27311t0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f27312u0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f27313v0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f27314w0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f27315x0 = Pattern.compile("var\\s");
    public static final Pattern f27316y0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f27317z0 = Pattern.compile("[()]");
    public static final Pattern A0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public ia1(Context context, boolean z10, ea1 ea1Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.f27331i0 = new z91(this, 0);
        this.f27332j0 = new ki.d(this, 4);
        this.f27333k0 = new z91(this, 1);
        setWillNotDraw(false);
        this.v = ea1Var;
        paint.setColor(-16777216);
        ah0 ah0Var = new ah0(this, context, 1);
        this.f27322c = ah0Var;
        addView(ah0Var, w7.x5.e(-1, -1, 17));
        aa1 aa1Var = new aa1(context, context);
        this.f27320b = aa1Var;
        final q81 q81Var = new q81(this);
        aa1Var.addJavascriptInterface(new Object(q81Var) {
            public final q81 f24390a;

            {
                this.f24390a = q81Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                ia1 ia1Var = (ia1) this.f24390a.f30127a;
                AsyncTask asyncTask = ia1Var.R;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = ia1Var.R;
                    if (asyncTask2 instanceof ha1) {
                        ha1 ha1Var = (ha1) asyncTask2;
                        String[] strArr = ha1Var.f26981c;
                        String str2 = strArr[0];
                        String str3 = ha1Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        ha1Var.f26980b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = aa1Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = ea1Var.g();
        this.f27327f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            ah0Var.addView(textureView, w7.x5.e(-1, -1, 17));
        }
        if (g10 != null) {
            ImageView imageView = new ImageView(context);
            this.f27325e = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            g10.addView(imageView);
        }
        l81 l81Var = new l81();
        this.f27318a = l81Var;
        l81Var.J = this;
        l81Var.V(textureView);
        da1 da1Var = new da1(this, context);
        this.f27328f0 = da1Var;
        if (g10 != null) {
            g10.addView(da1Var);
        } else {
            addView(da1Var, w7.x5.d(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f27319a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, w7.x5.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f27321b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        da1Var.addView(imageView2, w7.x5.a(56.0f, 0.0f, 0.0f, 0.0f, 5.0f, 56, 85));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final ia1 f33158b;

            {
                this.f33158b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ia1 ia1Var = this.f33158b;
                        if (ia1Var.f27337w && !ia1Var.S && !ia1Var.W && ia1Var.M) {
                            ia1Var.T = !ia1Var.T;
                            ia1Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        ia1 ia1Var2 = this.f33158b;
                        l81 l81Var2 = ia1Var2.f27318a;
                        if (ia1Var2.f27337w && ia1Var2.f27338x != null) {
                            if (l81Var2.d == null) {
                                ia1Var2.i();
                            }
                            if (l81Var2.y()) {
                                l81Var2.B();
                            } else {
                                ia1Var2.V = false;
                                l81Var2.C();
                            }
                            ia1Var2.n();
                            return;
                        }
                        return;
                    default:
                        ia1 ia1Var3 = this.f33158b;
                        ViewGroup viewGroup = ia1Var3.f27327f;
                        boolean z11 = ia1Var3.I;
                        ea1 ea1Var2 = ia1Var3.v;
                        da1 da1Var2 = ia1Var3.f27328f0;
                        ah0 ah0Var2 = ia1Var3.f27322c;
                        TextureView textureView2 = ia1Var3.d;
                        if (textureView2 != null && ea1Var2.h() && !ia1Var3.S && !ia1Var3.W && ia1Var3.M) {
                            ia1Var3.W = true;
                            if (!ia1Var3.U) {
                                ia1Var3.T = false;
                                ea1Var2.i(true, ia1Var3.f27333k0, ah0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) ah0Var2.getParent();
                            if (viewGroup2 != ia1Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(ah0Var2);
                                }
                                ia1Var3.addView(ah0Var2, 0, w7.x5.e(-1, -1, 17));
                                ah0Var2.measure(View.MeasureSpec.makeMeasureSpec(ia1Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ia1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = ia1Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                ia1Var3.h = null;
                            }
                            ia1Var3.S = true;
                            ia1Var3.U = false;
                            ia1Var3.n();
                            ia1Var3.o();
                            ia1Var3.k();
                            ia1Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                ah0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) da1Var2.getParent();
                            if (viewGroup3 != ia1Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(da1Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(da1Var2);
                                } else {
                                    ia1Var3.addView(da1Var2, 1);
                                }
                            }
                            da1Var2.d(false, false);
                            ea1Var2.i(false, null, ah0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f27323c0 = imageView3;
        imageView3.setScaleType(scaleType);
        da1Var.addView(imageView3, w7.x5.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ia1 f33158b;

            {
                this.f33158b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ia1 ia1Var = this.f33158b;
                        if (ia1Var.f27337w && !ia1Var.S && !ia1Var.W && ia1Var.M) {
                            ia1Var.T = !ia1Var.T;
                            ia1Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        ia1 ia1Var2 = this.f33158b;
                        l81 l81Var2 = ia1Var2.f27318a;
                        if (ia1Var2.f27337w && ia1Var2.f27338x != null) {
                            if (l81Var2.d == null) {
                                ia1Var2.i();
                            }
                            if (l81Var2.y()) {
                                l81Var2.B();
                            } else {
                                ia1Var2.V = false;
                                l81Var2.C();
                            }
                            ia1Var2.n();
                            return;
                        }
                        return;
                    default:
                        ia1 ia1Var3 = this.f33158b;
                        ViewGroup viewGroup = ia1Var3.f27327f;
                        boolean z11 = ia1Var3.I;
                        ea1 ea1Var2 = ia1Var3.v;
                        da1 da1Var2 = ia1Var3.f27328f0;
                        ah0 ah0Var2 = ia1Var3.f27322c;
                        TextureView textureView2 = ia1Var3.d;
                        if (textureView2 != null && ea1Var2.h() && !ia1Var3.S && !ia1Var3.W && ia1Var3.M) {
                            ia1Var3.W = true;
                            if (!ia1Var3.U) {
                                ia1Var3.T = false;
                                ea1Var2.i(true, ia1Var3.f27333k0, ah0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) ah0Var2.getParent();
                            if (viewGroup2 != ia1Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(ah0Var2);
                                }
                                ia1Var3.addView(ah0Var2, 0, w7.x5.e(-1, -1, 17));
                                ah0Var2.measure(View.MeasureSpec.makeMeasureSpec(ia1Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ia1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = ia1Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                ia1Var3.h = null;
                            }
                            ia1Var3.S = true;
                            ia1Var3.U = false;
                            ia1Var3.n();
                            ia1Var3.o();
                            ia1Var3.k();
                            ia1Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                ah0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) da1Var2.getParent();
                            if (viewGroup3 != ia1Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(da1Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(da1Var2);
                                } else {
                                    ia1Var3.addView(da1Var2, 1);
                                }
                            }
                            da1Var2.d(false, false);
                            ea1Var2.i(false, null, ah0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f27324d0 = imageView4;
            imageView4.setScaleType(scaleType);
            da1Var.addView(imageView4, w7.x5.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final ia1 f33158b;

                {
                    this.f33158b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            ia1 ia1Var = this.f33158b;
                            if (ia1Var.f27337w && !ia1Var.S && !ia1Var.W && ia1Var.M) {
                                ia1Var.T = !ia1Var.T;
                                ia1Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            ia1 ia1Var2 = this.f33158b;
                            l81 l81Var2 = ia1Var2.f27318a;
                            if (ia1Var2.f27337w && ia1Var2.f27338x != null) {
                                if (l81Var2.d == null) {
                                    ia1Var2.i();
                                }
                                if (l81Var2.y()) {
                                    l81Var2.B();
                                } else {
                                    ia1Var2.V = false;
                                    l81Var2.C();
                                }
                                ia1Var2.n();
                                return;
                            }
                            return;
                        default:
                            ia1 ia1Var3 = this.f33158b;
                            ViewGroup viewGroup = ia1Var3.f27327f;
                            boolean z11 = ia1Var3.I;
                            ea1 ea1Var2 = ia1Var3.v;
                            da1 da1Var2 = ia1Var3.f27328f0;
                            ah0 ah0Var2 = ia1Var3.f27322c;
                            TextureView textureView2 = ia1Var3.d;
                            if (textureView2 != null && ea1Var2.h() && !ia1Var3.S && !ia1Var3.W && ia1Var3.M) {
                                ia1Var3.W = true;
                                if (!ia1Var3.U) {
                                    ia1Var3.T = false;
                                    ea1Var2.i(true, ia1Var3.f27333k0, ah0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) ah0Var2.getParent();
                                if (viewGroup2 != ia1Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(ah0Var2);
                                    }
                                    ia1Var3.addView(ah0Var2, 0, w7.x5.e(-1, -1, 17));
                                    ah0Var2.measure(View.MeasureSpec.makeMeasureSpec(ia1Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ia1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                }
                                Bitmap bitmap = ia1Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    ia1Var3.h = null;
                                }
                                ia1Var3.S = true;
                                ia1Var3.U = false;
                                ia1Var3.n();
                                ia1Var3.o();
                                ia1Var3.k();
                                ia1Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    ah0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) da1Var2.getParent();
                                if (viewGroup3 != ia1Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(da1Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(da1Var2);
                                    } else {
                                        ia1Var3.addView(da1Var2, 1);
                                    }
                                }
                                da1Var2.d(false, false);
                                ea1Var2.i(false, null, ah0Var2.getAspectRatio(), z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ia1.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ia1.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f27305n0.matcher(str);
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
        Matcher matcher = f27304l0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f27328f0;
    }

    private View getProgressView() {
        return this.f27319a0;
    }

    public final void b() {
        this.f27318a.H();
        AsyncTask asyncTask = this.R;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.R = null;
        }
        this.f27320b.stopLoading();
    }

    public final boolean f() {
        if (!this.U && !this.W) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r27, org.telegram.tgnet.TLRPC.Photo r28, java.lang.Object r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ia1.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f27322c;
    }

    public View getControlsView() {
        return this.f27328f0;
    }

    public ImageView getTextureImageView() {
        return this.f27325e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.G;
    }

    public final void h() {
        da1 da1Var = this.f27328f0;
        if (da1Var.getParent() != this) {
            da1Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.f27338x;
        if (str != null) {
            String str2 = this.E;
            l81 l81Var = this.f27318a;
            if (str2 != null) {
                l81Var.G(Uri.parse(str), this.f27339y, Uri.parse(this.E), this.F);
            } else {
                l81Var.D(Uri.parse(str), this.f27339y);
            }
            l81Var.P(this.f27336s);
            int i10 = (l81Var.p() > (-9223372036854775807L) ? 1 : (l81Var.p() == (-9223372036854775807L) ? 0 : -1));
            da1 da1Var = this.f27328f0;
            if (i10 != 0) {
                da1Var.b((int) (l81Var.p() / 1000));
            } else {
                da1Var.b(0);
            }
            k();
            o();
            m();
            da1Var.invalidate();
            int i11 = this.O;
            if (i11 != -1) {
                l81Var.L(i11 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f7 = 0.0f;
        RadialProgressView radialProgressView = this.f27319a0;
        if (z11) {
            AnimatorSet animatorSet = this.f27326e0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f27326e0 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f7));
            this.f27326e0.setDuration(150L);
            this.f27326e0.addListener(new j91(this, 1));
            this.f27326e0.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        radialProgressView.setAlpha(f7);
    }

    public final void k() {
        i2.f0 f0Var = this.f27318a.d;
        ImageView imageView = this.f27321b0;
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
        ViewGroup viewGroup2 = this.f27327f;
        ah0 ah0Var = this.f27322c;
        if (viewGroup2 == null) {
            this.S = true;
            if (!this.T) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    ah0Var.addView(textureView);
                }
            }
            boolean z11 = this.T;
            da1 da1Var = this.f27328f0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) da1Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(da1Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) da1Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(da1Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(da1Var);
                    } else {
                        addView(da1Var, 1);
                    }
                }
            }
            TextureView a2 = this.v.a(this.f27328f0, this.T, ah0Var.getAspectRatio(), ah0Var.getVideoRotation(), z10);
            this.f27334n = a2;
            a2.setVisibility(4);
            if (this.T && this.f27334n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i10 = da1.I;
            da1Var.a();
            return;
        }
        if (this.T) {
            ViewGroup viewGroup5 = (ViewGroup) ah0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(ah0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) ah0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(ah0Var);
                }
                addView(ah0Var, 0);
            }
        }
        this.v.a(this.f27328f0, this.T, ah0Var.getAspectRatio(), ah0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i10;
        int i11;
        ImageView imageView = this.f27324d0;
        if (imageView == null) {
            return;
        }
        if (this.U) {
            i10 = R.drawable.ic_goinline;
        } else {
            i10 = R.drawable.ic_outinline;
        }
        imageView.setImageResource(i10);
        if (this.f27318a.d != null) {
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
        da1 da1Var = this.f27328f0;
        int i13 = da1.I;
        da1Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.f27331i0);
        if (!this.f27318a.y()) {
            if (this.V) {
                ImageView imageView = this.f27323c0;
                if (this.U) {
                    i12 = R.drawable.ic_againinline;
                } else {
                    i12 = R.drawable.ic_again;
                }
                imageView.setImageResource(i12);
                return;
            }
            ImageView imageView2 = this.f27323c0;
            if (this.U) {
                i11 = R.drawable.ic_playinline;
            } else {
                i11 = R.drawable.ic_play;
            }
            imageView2.setImageResource(i11);
            return;
        }
        ImageView imageView3 = this.f27323c0;
        if (this.U) {
            i10 = R.drawable.ic_pauseinline;
        } else {
            i10 = R.drawable.ic_pause;
        }
        imageView3.setImageResource(i10);
        AndroidUtilities.runOnUIThread(this.f27331i0, 500L);
        if (!this.J) {
            this.J = true;
            ((AudioManager) ApplicationLoader.applicationContext.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new nd(this, i10, 14));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.Q);
    }

    @Override
    public final void onError(l81 l81Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        ah0 ah0Var = this.f27322c;
        int measuredWidth = (i14 - ah0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - ah0Var.getMeasuredHeight()) / 2;
        ah0Var.layout(measuredWidth, dp, ah0Var.getMeasuredWidth() + measuredWidth, ah0Var.getMeasuredHeight() + dp);
        da1 da1Var = this.f27328f0;
        if (da1Var.getParent() == this) {
            da1Var.layout(0, 0, da1Var.getMeasuredWidth(), da1Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f27319a0;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        da1Var.f25624a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f27322c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        da1 da1Var = this.f27328f0;
        if (da1Var.getParent() == this) {
            da1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f27319a0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        da1 da1Var = this.f27328f0;
        l81 l81Var = this.f27318a;
        if (i10 != 2) {
            if (l81Var.p() != -9223372036854775807L) {
                da1Var.b((int) (l81Var.p() / 1000));
            } else {
                da1Var.b(0);
            }
        }
        ea1 ea1Var = this.v;
        if (i10 != 4 && i10 != 1 && l81Var.y()) {
            ea1Var.e(this, true);
        } else {
            ea1Var.e(this, false);
        }
        if (l81Var.y() && i10 != 4) {
            n();
        } else if (i10 == 4) {
            this.V = true;
            l81Var.B();
            l81Var.L(0L, false);
            n();
            da1Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.S) {
            this.S = false;
            if (this.T || this.U) {
                if (this.U) {
                    this.f27335r = 1;
                }
                this.f27334n.setSurfaceTexture(surfaceTexture);
                this.f27334n.setSurfaceTextureListener(this.f27332j0);
                this.f27334n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f27335r == 2) {
            ImageView imageView = this.f27325e;
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
            int i10 = this.f27329g0;
            int i11 = this.f27330h0;
            this.f27322c.getVideoRotation();
            this.v.f(this.f27328f0, false, i10, i11, this.I);
            this.f27335r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        ah0 ah0Var = this.f27322c;
        if (ah0Var != null) {
            float f11 = i10 * f7;
            this.f27329g0 = (int) f11;
            this.f27330h0 = i11;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / i11;
            }
            ah0Var.a(f10, 0);
            if (this.T) {
                this.v.c(f10);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.M = true;
        this.L = System.currentTimeMillis();
        this.f27328f0.invalidate();
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
