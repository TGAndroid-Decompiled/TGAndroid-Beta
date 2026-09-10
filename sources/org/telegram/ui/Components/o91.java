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
public final class o91 extends ViewGroup implements q71, AudioManager.OnAudioFocusChangeListener {
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
    public final t71 f25715a;
    public final RadialProgressView f25716a0;
    public final h91 f25717b;
    public final ImageView f25718b0;
    public final gg0 f25719c;
    public final ImageView f25720c0;
    public final TextureView d;
    public final ImageView f25721d0;
    public final ImageView e;
    public AnimatorSet f25722e0;
    public final ViewGroup f25723f;
    public final k91 f25724f0;
    public int f25725g0;
    public Bitmap h;
    public int f25726h0;
    public final g91 f25727i0;
    public final t50 f25728j0;
    public final g91 f25729k0;
    public TextureView f25730n;
    public int f25731r;
    public boolean f25732s;
    public final l91 v;
    public boolean f25733w;
    public String f25734x;
    public String f25735y;
    public static final Pattern f25701l0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f25702n0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f25703o0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f25704p0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f25705q0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f25706r0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f25707s0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f25708t0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f25709u0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f25710v0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f25711w0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f25712x0 = Pattern.compile("var\\s");
    public static final Pattern f25713y0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f25714z0 = Pattern.compile("[()]");
    public static final Pattern A0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public o91(Context context, boolean z10, l91 l91Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.f25727i0 = new g91(this, 0);
        this.f25728j0 = new t50(this, 3);
        this.f25729k0 = new g91(this, 1);
        setWillNotDraw(false);
        this.v = l91Var;
        paint.setColor(-16777216);
        gg0 gg0Var = new gg0(this, context, 1);
        this.f25719c = gg0Var;
        addView(gg0Var, w7.a6.e(-1, -1, 17));
        h91 h91Var = new h91(context, context);
        this.f25717b = h91Var;
        final e91 e91Var = new e91(this);
        h91Var.addJavascriptInterface(new Object(e91Var) {
            public final e91 f21328a;

            {
                this.f21328a = e91Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                o91 o91Var = (o91) this.f21328a.f22632a;
                AsyncTask asyncTask = o91Var.R;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = o91Var.R;
                    if (asyncTask2 instanceof n91) {
                        n91 n91Var = (n91) asyncTask2;
                        String[] strArr = n91Var.f25477c;
                        String str2 = strArr[0];
                        String str3 = n91Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        n91Var.f25476b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = h91Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = l91Var.g();
        this.f25723f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            gg0Var.addView(textureView, w7.a6.e(-1, -1, 17));
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
        t71 t71Var = new t71();
        this.f25715a = t71Var;
        t71Var.J = this;
        t71Var.V(textureView);
        k91 k91Var = new k91(this, context);
        this.f25724f0 = k91Var;
        if (g10 != null) {
            g10.addView(k91Var);
        } else {
            addView(k91Var, w7.a6.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f25716a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, w7.a6.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f25718b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        k91Var.addView(imageView2, w7.a6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final o91 f22958b;

            {
                this.f22958b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        o91 o91Var = this.f22958b;
                        if (o91Var.f25733w && !o91Var.S && !o91Var.W && o91Var.M) {
                            o91Var.T = !o91Var.T;
                            o91Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        o91 o91Var2 = this.f22958b;
                        t71 t71Var2 = o91Var2.f25715a;
                        if (o91Var2.f25733w && o91Var2.f25734x != null) {
                            if (t71Var2.d == null) {
                                o91Var2.i();
                            }
                            if (t71Var2.y()) {
                                t71Var2.B();
                            } else {
                                o91Var2.V = false;
                                t71Var2.C();
                            }
                            o91Var2.n();
                            return;
                        }
                        return;
                    default:
                        o91 o91Var3 = this.f22958b;
                        ViewGroup viewGroup = o91Var3.f25723f;
                        boolean z11 = o91Var3.I;
                        l91 l91Var2 = o91Var3.v;
                        k91 k91Var2 = o91Var3.f25724f0;
                        gg0 gg0Var2 = o91Var3.f25719c;
                        TextureView textureView2 = o91Var3.d;
                        if (textureView2 != null && l91Var2.h() && !o91Var3.S && !o91Var3.W && o91Var3.M) {
                            o91Var3.W = true;
                            if (!o91Var3.U) {
                                o91Var3.T = false;
                                l91Var2.i(true, o91Var3.f25729k0, gg0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) gg0Var2.getParent();
                            if (viewGroup2 != o91Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(gg0Var2);
                                }
                                o91Var3.addView(gg0Var2, 0, w7.a6.e(-1, -1, 17));
                                gg0Var2.measure(View.MeasureSpec.makeMeasureSpec(o91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(o91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = o91Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                o91Var3.h = null;
                            }
                            o91Var3.S = true;
                            o91Var3.U = false;
                            o91Var3.n();
                            o91Var3.o();
                            o91Var3.k();
                            o91Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                gg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) k91Var2.getParent();
                            if (viewGroup3 != o91Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(k91Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(k91Var2);
                                } else {
                                    o91Var3.addView(k91Var2, 1);
                                }
                            }
                            k91Var2.d(false, false);
                            l91Var2.i(false, null, gg0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f25720c0 = imageView3;
        imageView3.setScaleType(scaleType);
        k91Var.addView(imageView3, w7.a6.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final o91 f22958b;

            {
                this.f22958b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        o91 o91Var = this.f22958b;
                        if (o91Var.f25733w && !o91Var.S && !o91Var.W && o91Var.M) {
                            o91Var.T = !o91Var.T;
                            o91Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        o91 o91Var2 = this.f22958b;
                        t71 t71Var2 = o91Var2.f25715a;
                        if (o91Var2.f25733w && o91Var2.f25734x != null) {
                            if (t71Var2.d == null) {
                                o91Var2.i();
                            }
                            if (t71Var2.y()) {
                                t71Var2.B();
                            } else {
                                o91Var2.V = false;
                                t71Var2.C();
                            }
                            o91Var2.n();
                            return;
                        }
                        return;
                    default:
                        o91 o91Var3 = this.f22958b;
                        ViewGroup viewGroup = o91Var3.f25723f;
                        boolean z11 = o91Var3.I;
                        l91 l91Var2 = o91Var3.v;
                        k91 k91Var2 = o91Var3.f25724f0;
                        gg0 gg0Var2 = o91Var3.f25719c;
                        TextureView textureView2 = o91Var3.d;
                        if (textureView2 != null && l91Var2.h() && !o91Var3.S && !o91Var3.W && o91Var3.M) {
                            o91Var3.W = true;
                            if (!o91Var3.U) {
                                o91Var3.T = false;
                                l91Var2.i(true, o91Var3.f25729k0, gg0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) gg0Var2.getParent();
                            if (viewGroup2 != o91Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(gg0Var2);
                                }
                                o91Var3.addView(gg0Var2, 0, w7.a6.e(-1, -1, 17));
                                gg0Var2.measure(View.MeasureSpec.makeMeasureSpec(o91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(o91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = o91Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                o91Var3.h = null;
                            }
                            o91Var3.S = true;
                            o91Var3.U = false;
                            o91Var3.n();
                            o91Var3.o();
                            o91Var3.k();
                            o91Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                gg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) k91Var2.getParent();
                            if (viewGroup3 != o91Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(k91Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(k91Var2);
                                } else {
                                    o91Var3.addView(k91Var2, 1);
                                }
                            }
                            k91Var2.d(false, false);
                            l91Var2.i(false, null, gg0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f25721d0 = imageView4;
            imageView4.setScaleType(scaleType);
            k91Var.addView(imageView4, w7.a6.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final o91 f22958b;

                {
                    this.f22958b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            o91 o91Var = this.f22958b;
                            if (o91Var.f25733w && !o91Var.S && !o91Var.W && o91Var.M) {
                                o91Var.T = !o91Var.T;
                                o91Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            o91 o91Var2 = this.f22958b;
                            t71 t71Var2 = o91Var2.f25715a;
                            if (o91Var2.f25733w && o91Var2.f25734x != null) {
                                if (t71Var2.d == null) {
                                    o91Var2.i();
                                }
                                if (t71Var2.y()) {
                                    t71Var2.B();
                                } else {
                                    o91Var2.V = false;
                                    t71Var2.C();
                                }
                                o91Var2.n();
                                return;
                            }
                            return;
                        default:
                            o91 o91Var3 = this.f22958b;
                            ViewGroup viewGroup = o91Var3.f25723f;
                            boolean z11 = o91Var3.I;
                            l91 l91Var2 = o91Var3.v;
                            k91 k91Var2 = o91Var3.f25724f0;
                            gg0 gg0Var2 = o91Var3.f25719c;
                            TextureView textureView2 = o91Var3.d;
                            if (textureView2 != null && l91Var2.h() && !o91Var3.S && !o91Var3.W && o91Var3.M) {
                                o91Var3.W = true;
                                if (!o91Var3.U) {
                                    o91Var3.T = false;
                                    l91Var2.i(true, o91Var3.f25729k0, gg0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) gg0Var2.getParent();
                                if (viewGroup2 != o91Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(gg0Var2);
                                    }
                                    o91Var3.addView(gg0Var2, 0, w7.a6.e(-1, -1, 17));
                                    gg0Var2.measure(View.MeasureSpec.makeMeasureSpec(o91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(o91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                }
                                Bitmap bitmap = o91Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    o91Var3.h = null;
                                }
                                o91Var3.S = true;
                                o91Var3.U = false;
                                o91Var3.n();
                                o91Var3.o();
                                o91Var3.k();
                                o91Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    gg0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) k91Var2.getParent();
                                if (viewGroup3 != o91Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(k91Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(k91Var2);
                                    } else {
                                        o91Var3.addView(k91Var2, 1);
                                    }
                                }
                                k91Var2.d(false, false);
                                l91Var2.i(false, null, gg0Var2.getAspectRatio(), z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o91.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o91.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f25702n0.matcher(str);
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
        Matcher matcher = f25701l0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f25724f0;
    }

    private View getProgressView() {
        return this.f25716a0;
    }

    public final void b() {
        this.f25715a.H();
        AsyncTask asyncTask = this.R;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.R = null;
        }
        this.f25717b.stopLoading();
    }

    public final boolean f() {
        if (!this.U && !this.W) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r27, org.telegram.tgnet.TLRPC.Photo r28, java.lang.Object r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o91.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f25719c;
    }

    public View getControlsView() {
        return this.f25724f0;
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
        k91 k91Var = this.f25724f0;
        if (k91Var.getParent() != this) {
            k91Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.f25734x;
        if (str != null) {
            String str2 = this.E;
            t71 t71Var = this.f25715a;
            if (str2 != null) {
                t71Var.G(Uri.parse(str), this.f25735y, Uri.parse(this.E), this.F);
            } else {
                t71Var.D(Uri.parse(str), this.f25735y);
            }
            t71Var.P(this.f25732s);
            long p5 = t71Var.p();
            k91 k91Var = this.f25724f0;
            if (p5 != -9223372036854775807L) {
                k91Var.b((int) (t71Var.p() / 1000));
            } else {
                k91Var.b(0);
            }
            k();
            o();
            m();
            k91Var.invalidate();
            int i10 = this.O;
            if (i10 != -1) {
                t71Var.L(i10 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f7 = 0.0f;
        RadialProgressView radialProgressView = this.f25716a0;
        if (z11) {
            AnimatorSet animatorSet = this.f25722e0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f25722e0 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f7));
            this.f25722e0.setDuration(150L);
            this.f25722e0.addListener(new zn0(this, 20));
            this.f25722e0.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        radialProgressView.setAlpha(f7);
    }

    public final void k() {
        i2.e0 e0Var = this.f25715a.d;
        ImageView imageView = this.f25718b0;
        if (e0Var != null && !this.U) {
            imageView.setVisibility(0);
            if (!this.T) {
                imageView.setImageResource(R.drawable.ic_gofullscreen);
                imageView.setLayoutParams(w7.a6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
                return;
            }
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(w7.a6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
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
        ViewGroup viewGroup2 = this.f25723f;
        gg0 gg0Var = this.f25719c;
        if (viewGroup2 == null) {
            this.S = true;
            if (!this.T) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    gg0Var.addView(textureView);
                }
            }
            boolean z11 = this.T;
            k91 k91Var = this.f25724f0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) k91Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(k91Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) k91Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(k91Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(k91Var);
                    } else {
                        addView(k91Var, 1);
                    }
                }
            }
            TextureView a2 = this.v.a(this.f25724f0, this.T, gg0Var.getAspectRatio(), gg0Var.getVideoRotation(), z10);
            this.f25730n = a2;
            a2.setVisibility(4);
            if (this.T && this.f25730n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i10 = k91.I;
            k91Var.a();
            return;
        }
        if (this.T) {
            ViewGroup viewGroup5 = (ViewGroup) gg0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(gg0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) gg0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(gg0Var);
                }
                addView(gg0Var, 0);
            }
        }
        this.v.a(this.f25724f0, this.T, gg0Var.getAspectRatio(), gg0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i10;
        int i11;
        ImageView imageView = this.f25721d0;
        if (imageView == null) {
            return;
        }
        if (this.U) {
            i10 = R.drawable.ic_goinline;
        } else {
            i10 = R.drawable.ic_outinline;
        }
        imageView.setImageResource(i10);
        if (this.f25715a.d != null) {
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
        k91 k91Var = this.f25724f0;
        int i13 = k91.I;
        k91Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.f25727i0);
        if (!this.f25715a.y()) {
            if (this.V) {
                ImageView imageView = this.f25720c0;
                if (this.U) {
                    i12 = R.drawable.ic_againinline;
                } else {
                    i12 = R.drawable.ic_again;
                }
                imageView.setImageResource(i12);
                return;
            }
            ImageView imageView2 = this.f25720c0;
            if (this.U) {
                i11 = R.drawable.ic_playinline;
            } else {
                i11 = R.drawable.ic_play;
            }
            imageView2.setImageResource(i11);
            return;
        }
        ImageView imageView3 = this.f25720c0;
        if (this.U) {
            i10 = R.drawable.ic_pauseinline;
        } else {
            i10 = R.drawable.ic_pause;
        }
        imageView3.setImageResource(i10);
        AndroidUtilities.runOnUIThread(this.f25727i0, 500L);
        if (!this.J) {
            this.J = true;
            ((AudioManager) ApplicationLoader.applicationContext.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new zd(this, i10, 12));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.Q);
    }

    @Override
    public final void onError(t71 t71Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        gg0 gg0Var = this.f25719c;
        int measuredWidth = (i14 - gg0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - gg0Var.getMeasuredHeight()) / 2;
        gg0Var.layout(measuredWidth, dp, gg0Var.getMeasuredWidth() + measuredWidth, gg0Var.getMeasuredHeight() + dp);
        k91 k91Var = this.f25724f0;
        if (k91Var.getParent() == this) {
            k91Var.layout(0, 0, k91Var.getMeasuredWidth(), k91Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f25716a0;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        k91Var.f24676a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f25719c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        k91 k91Var = this.f25724f0;
        if (k91Var.getParent() == this) {
            k91Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f25716a0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        k91 k91Var = this.f25724f0;
        t71 t71Var = this.f25715a;
        if (i10 != 2) {
            if (t71Var.p() != -9223372036854775807L) {
                k91Var.b((int) (t71Var.p() / 1000));
            } else {
                k91Var.b(0);
            }
        }
        l91 l91Var = this.v;
        if (i10 != 4 && i10 != 1 && t71Var.y()) {
            l91Var.e(this, true);
        } else {
            l91Var.e(this, false);
        }
        if (t71Var.y() && i10 != 4) {
            n();
        } else if (i10 == 4) {
            this.V = true;
            t71Var.B();
            t71Var.L(0L, false);
            n();
            k91Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.S) {
            this.S = false;
            if (this.T || this.U) {
                if (this.U) {
                    this.f25731r = 1;
                }
                this.f25730n.setSurfaceTexture(surfaceTexture);
                this.f25730n.setSurfaceTextureListener(this.f25728j0);
                this.f25730n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f25731r == 2) {
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
            int i10 = this.f25725g0;
            int i11 = this.f25726h0;
            this.f25719c.getVideoRotation();
            this.v.f(this.f25724f0, false, i10, i11, this.I);
            this.f25731r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        gg0 gg0Var = this.f25719c;
        if (gg0Var != null) {
            float f11 = i10 * f7;
            this.f25725g0 = (int) f11;
            this.f25726h0 = i11;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / i11;
            }
            gg0Var.a(f10, 0);
            if (this.T) {
                this.v.c(f10);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.M = true;
        this.L = System.currentTimeMillis();
        this.f25724f0.invalidate();
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
