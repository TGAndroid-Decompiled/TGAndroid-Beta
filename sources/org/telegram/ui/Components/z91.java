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
public final class z91 extends ViewGroup implements a81, AudioManager.OnAudioFocusChangeListener {
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
    public final d81 f33439a;
    public final RadialProgressView f33440a0;
    public final s91 f33441b;
    public final ImageView f33442b0;
    public final kg0 f33443c;
    public final ImageView f33444c0;
    public final TextureView d;
    public final ImageView f33445d0;
    public final ImageView f33446e;
    public AnimatorSet f33447e0;
    public final ViewGroup f33448f;
    public final v91 f33449f0;
    public int f33450g0;
    public Bitmap h;
    public int f33451h0;
    public final r91 f33452i0;
    public final ki.d f33453j0;
    public final r91 f33454k0;
    public TextureView f33455n;
    public int f33456r;
    public boolean f33457s;
    public final w91 v;
    public boolean f33458w;
    public String f33459x;
    public String f33460y;
    public static final Pattern f33425l0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f33426n0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f33427o0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f33428p0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f33429q0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f33430r0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f33431s0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f33432t0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f33433u0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f33434v0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f33435w0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f33436x0 = Pattern.compile("var\\s");
    public static final Pattern f33437y0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f33438z0 = Pattern.compile("[()]");
    public static final Pattern A0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public z91(Context context, boolean z10, w91 w91Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.f33452i0 = new r91(this, 0);
        this.f33453j0 = new ki.d(this, 4);
        this.f33454k0 = new r91(this, 1);
        setWillNotDraw(false);
        this.v = w91Var;
        paint.setColor(-16777216);
        kg0 kg0Var = new kg0(this, context, 1);
        this.f33443c = kg0Var;
        addView(kg0Var, w7.z5.e(-1, -1, 17));
        s91 s91Var = new s91(context, context);
        this.f33441b = s91Var;
        final p91 p91Var = new p91(this);
        s91Var.addJavascriptInterface(new Object(p91Var) {
            public final p91 f24383a;

            {
                this.f24383a = p91Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                z91 z91Var = (z91) this.f24383a.f29575a;
                AsyncTask asyncTask = z91Var.R;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = z91Var.R;
                    if (asyncTask2 instanceof y91) {
                        y91 y91Var = (y91) asyncTask2;
                        String[] strArr = y91Var.f33123c;
                        String str2 = strArr[0];
                        String str3 = y91Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        y91Var.f33122b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = s91Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = w91Var.g();
        this.f33448f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            kg0Var.addView(textureView, w7.z5.e(-1, -1, 17));
        }
        if (g10 != null) {
            ImageView imageView = new ImageView(context);
            this.f33446e = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            g10.addView(imageView);
        }
        d81 d81Var = new d81();
        this.f33439a = d81Var;
        d81Var.J = this;
        d81Var.V(textureView);
        v91 v91Var = new v91(this, context);
        this.f33449f0 = v91Var;
        if (g10 != null) {
            g10.addView(v91Var);
        } else {
            addView(v91Var, w7.z5.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f33440a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, w7.z5.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f33442b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        v91Var.addView(imageView2, w7.z5.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final z91 f29970b;

            {
                this.f29970b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        z91 z91Var = this.f29970b;
                        if (z91Var.f33458w && !z91Var.S && !z91Var.W && z91Var.M) {
                            z91Var.T = !z91Var.T;
                            z91Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        z91 z91Var2 = this.f29970b;
                        d81 d81Var2 = z91Var2.f33439a;
                        if (z91Var2.f33458w && z91Var2.f33459x != null) {
                            if (d81Var2.d == null) {
                                z91Var2.i();
                            }
                            if (d81Var2.y()) {
                                d81Var2.B();
                            } else {
                                z91Var2.V = false;
                                d81Var2.C();
                            }
                            z91Var2.n();
                            return;
                        }
                        return;
                    default:
                        z91 z91Var3 = this.f29970b;
                        ViewGroup viewGroup = z91Var3.f33448f;
                        boolean z11 = z91Var3.I;
                        w91 w91Var2 = z91Var3.v;
                        v91 v91Var2 = z91Var3.f33449f0;
                        kg0 kg0Var2 = z91Var3.f33443c;
                        TextureView textureView2 = z91Var3.d;
                        if (textureView2 != null && w91Var2.h() && !z91Var3.S && !z91Var3.W && z91Var3.M) {
                            z91Var3.W = true;
                            if (!z91Var3.U) {
                                z91Var3.T = false;
                                w91Var2.i(true, z91Var3.f33454k0, kg0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) kg0Var2.getParent();
                            if (viewGroup2 != z91Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(kg0Var2);
                                }
                                z91Var3.addView(kg0Var2, 0, w7.z5.e(-1, -1, 17));
                                kg0Var2.measure(View.MeasureSpec.makeMeasureSpec(z91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(z91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = z91Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                z91Var3.h = null;
                            }
                            z91Var3.S = true;
                            z91Var3.U = false;
                            z91Var3.n();
                            z91Var3.o();
                            z91Var3.k();
                            z91Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                kg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) v91Var2.getParent();
                            if (viewGroup3 != z91Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(v91Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(v91Var2);
                                } else {
                                    z91Var3.addView(v91Var2, 1);
                                }
                            }
                            v91Var2.d(false, false);
                            w91Var2.i(false, null, kg0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f33444c0 = imageView3;
        imageView3.setScaleType(scaleType);
        v91Var.addView(imageView3, w7.z5.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final z91 f29970b;

            {
                this.f29970b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        z91 z91Var = this.f29970b;
                        if (z91Var.f33458w && !z91Var.S && !z91Var.W && z91Var.M) {
                            z91Var.T = !z91Var.T;
                            z91Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        z91 z91Var2 = this.f29970b;
                        d81 d81Var2 = z91Var2.f33439a;
                        if (z91Var2.f33458w && z91Var2.f33459x != null) {
                            if (d81Var2.d == null) {
                                z91Var2.i();
                            }
                            if (d81Var2.y()) {
                                d81Var2.B();
                            } else {
                                z91Var2.V = false;
                                d81Var2.C();
                            }
                            z91Var2.n();
                            return;
                        }
                        return;
                    default:
                        z91 z91Var3 = this.f29970b;
                        ViewGroup viewGroup = z91Var3.f33448f;
                        boolean z11 = z91Var3.I;
                        w91 w91Var2 = z91Var3.v;
                        v91 v91Var2 = z91Var3.f33449f0;
                        kg0 kg0Var2 = z91Var3.f33443c;
                        TextureView textureView2 = z91Var3.d;
                        if (textureView2 != null && w91Var2.h() && !z91Var3.S && !z91Var3.W && z91Var3.M) {
                            z91Var3.W = true;
                            if (!z91Var3.U) {
                                z91Var3.T = false;
                                w91Var2.i(true, z91Var3.f33454k0, kg0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) kg0Var2.getParent();
                            if (viewGroup2 != z91Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(kg0Var2);
                                }
                                z91Var3.addView(kg0Var2, 0, w7.z5.e(-1, -1, 17));
                                kg0Var2.measure(View.MeasureSpec.makeMeasureSpec(z91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(z91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = z91Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                z91Var3.h = null;
                            }
                            z91Var3.S = true;
                            z91Var3.U = false;
                            z91Var3.n();
                            z91Var3.o();
                            z91Var3.k();
                            z91Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                kg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) v91Var2.getParent();
                            if (viewGroup3 != z91Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(v91Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(v91Var2);
                                } else {
                                    z91Var3.addView(v91Var2, 1);
                                }
                            }
                            v91Var2.d(false, false);
                            w91Var2.i(false, null, kg0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f33445d0 = imageView4;
            imageView4.setScaleType(scaleType);
            v91Var.addView(imageView4, w7.z5.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final z91 f29970b;

                {
                    this.f29970b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            z91 z91Var = this.f29970b;
                            if (z91Var.f33458w && !z91Var.S && !z91Var.W && z91Var.M) {
                                z91Var.T = !z91Var.T;
                                z91Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            z91 z91Var2 = this.f29970b;
                            d81 d81Var2 = z91Var2.f33439a;
                            if (z91Var2.f33458w && z91Var2.f33459x != null) {
                                if (d81Var2.d == null) {
                                    z91Var2.i();
                                }
                                if (d81Var2.y()) {
                                    d81Var2.B();
                                } else {
                                    z91Var2.V = false;
                                    d81Var2.C();
                                }
                                z91Var2.n();
                                return;
                            }
                            return;
                        default:
                            z91 z91Var3 = this.f29970b;
                            ViewGroup viewGroup = z91Var3.f33448f;
                            boolean z11 = z91Var3.I;
                            w91 w91Var2 = z91Var3.v;
                            v91 v91Var2 = z91Var3.f33449f0;
                            kg0 kg0Var2 = z91Var3.f33443c;
                            TextureView textureView2 = z91Var3.d;
                            if (textureView2 != null && w91Var2.h() && !z91Var3.S && !z91Var3.W && z91Var3.M) {
                                z91Var3.W = true;
                                if (!z91Var3.U) {
                                    z91Var3.T = false;
                                    w91Var2.i(true, z91Var3.f33454k0, kg0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) kg0Var2.getParent();
                                if (viewGroup2 != z91Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(kg0Var2);
                                    }
                                    z91Var3.addView(kg0Var2, 0, w7.z5.e(-1, -1, 17));
                                    kg0Var2.measure(View.MeasureSpec.makeMeasureSpec(z91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(z91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                }
                                Bitmap bitmap = z91Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    z91Var3.h = null;
                                }
                                z91Var3.S = true;
                                z91Var3.U = false;
                                z91Var3.n();
                                z91Var3.o();
                                z91Var3.k();
                                z91Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    kg0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) v91Var2.getParent();
                                if (viewGroup3 != z91Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(v91Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(v91Var2);
                                    } else {
                                        z91Var3.addView(v91Var2, 1);
                                    }
                                }
                                v91Var2.d(false, false);
                                w91Var2.i(false, null, kg0Var2.getAspectRatio(), z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z91.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z91.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f33426n0.matcher(str);
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
        Matcher matcher = f33425l0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f33449f0;
    }

    private View getProgressView() {
        return this.f33440a0;
    }

    public final void b() {
        this.f33439a.H();
        AsyncTask asyncTask = this.R;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.R = null;
        }
        this.f33441b.stopLoading();
    }

    public final boolean f() {
        if (!this.U && !this.W) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r27, org.telegram.tgnet.TLRPC.Photo r28, java.lang.Object r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z91.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f33443c;
    }

    public View getControlsView() {
        return this.f33449f0;
    }

    public ImageView getTextureImageView() {
        return this.f33446e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.G;
    }

    public final void h() {
        v91 v91Var = this.f33449f0;
        if (v91Var.getParent() != this) {
            v91Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.f33459x;
        if (str != null) {
            String str2 = this.E;
            d81 d81Var = this.f33439a;
            if (str2 != null) {
                d81Var.G(Uri.parse(str), this.f33460y, Uri.parse(this.E), this.F);
            } else {
                d81Var.D(Uri.parse(str), this.f33460y);
            }
            d81Var.P(this.f33457s);
            long p5 = d81Var.p();
            v91 v91Var = this.f33449f0;
            if (p5 != -9223372036854775807L) {
                v91Var.b((int) (d81Var.p() / 1000));
            } else {
                v91Var.b(0);
            }
            k();
            o();
            m();
            v91Var.invalidate();
            int i10 = this.O;
            if (i10 != -1) {
                d81Var.L(i10 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f7 = 0.0f;
        RadialProgressView radialProgressView = this.f33440a0;
        if (z11) {
            AnimatorSet animatorSet = this.f33447e0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f33447e0 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f7));
            this.f33447e0.setDuration(150L);
            this.f33447e0.addListener(new a91(this, 1));
            this.f33447e0.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        radialProgressView.setAlpha(f7);
    }

    public final void k() {
        i2.f0 f0Var = this.f33439a.d;
        ImageView imageView = this.f33442b0;
        if (f0Var != null && !this.U) {
            imageView.setVisibility(0);
            if (!this.T) {
                imageView.setImageResource(R.drawable.ic_gofullscreen);
                imageView.setLayoutParams(w7.z5.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
                return;
            }
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(w7.z5.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
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
        ViewGroup viewGroup2 = this.f33448f;
        kg0 kg0Var = this.f33443c;
        if (viewGroup2 == null) {
            this.S = true;
            if (!this.T) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    kg0Var.addView(textureView);
                }
            }
            boolean z11 = this.T;
            v91 v91Var = this.f33449f0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) v91Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(v91Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) v91Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(v91Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(v91Var);
                    } else {
                        addView(v91Var, 1);
                    }
                }
            }
            TextureView a2 = this.v.a(this.f33449f0, this.T, kg0Var.getAspectRatio(), kg0Var.getVideoRotation(), z10);
            this.f33455n = a2;
            a2.setVisibility(4);
            if (this.T && this.f33455n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i10 = v91.I;
            v91Var.a();
            return;
        }
        if (this.T) {
            ViewGroup viewGroup5 = (ViewGroup) kg0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(kg0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) kg0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(kg0Var);
                }
                addView(kg0Var, 0);
            }
        }
        this.v.a(this.f33449f0, this.T, kg0Var.getAspectRatio(), kg0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i10;
        int i11;
        ImageView imageView = this.f33445d0;
        if (imageView == null) {
            return;
        }
        if (this.U) {
            i10 = R.drawable.ic_goinline;
        } else {
            i10 = R.drawable.ic_outinline;
        }
        imageView.setImageResource(i10);
        if (this.f33439a.d != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView.setVisibility(i11);
        if (this.U) {
            imageView.setLayoutParams(w7.z5.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(w7.z5.e(56, 50, 53));
        }
    }

    public final void n() {
        int i10;
        int i11;
        int i12;
        v91 v91Var = this.f33449f0;
        int i13 = v91.I;
        v91Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.f33452i0);
        if (!this.f33439a.y()) {
            if (this.V) {
                ImageView imageView = this.f33444c0;
                if (this.U) {
                    i12 = R.drawable.ic_againinline;
                } else {
                    i12 = R.drawable.ic_again;
                }
                imageView.setImageResource(i12);
                return;
            }
            ImageView imageView2 = this.f33444c0;
            if (this.U) {
                i11 = R.drawable.ic_playinline;
            } else {
                i11 = R.drawable.ic_play;
            }
            imageView2.setImageResource(i11);
            return;
        }
        ImageView imageView3 = this.f33444c0;
        if (this.U) {
            i10 = R.drawable.ic_pauseinline;
        } else {
            i10 = R.drawable.ic_pause;
        }
        imageView3.setImageResource(i10);
        AndroidUtilities.runOnUIThread(this.f33452i0, 500L);
        if (!this.J) {
            this.J = true;
            ((AudioManager) ApplicationLoader.applicationContext.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new ld(this, i10, 12));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.Q);
    }

    @Override
    public final void onError(d81 d81Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        kg0 kg0Var = this.f33443c;
        int measuredWidth = (i14 - kg0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - kg0Var.getMeasuredHeight()) / 2;
        kg0Var.layout(measuredWidth, dp, kg0Var.getMeasuredWidth() + measuredWidth, kg0Var.getMeasuredHeight() + dp);
        v91 v91Var = this.f33449f0;
        if (v91Var.getParent() == this) {
            v91Var.layout(0, 0, v91Var.getMeasuredWidth(), v91Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f33440a0;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        v91Var.f31614a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f33443c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        v91 v91Var = this.f33449f0;
        if (v91Var.getParent() == this) {
            v91Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f33440a0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        v91 v91Var = this.f33449f0;
        d81 d81Var = this.f33439a;
        if (i10 != 2) {
            if (d81Var.p() != -9223372036854775807L) {
                v91Var.b((int) (d81Var.p() / 1000));
            } else {
                v91Var.b(0);
            }
        }
        w91 w91Var = this.v;
        if (i10 != 4 && i10 != 1 && d81Var.y()) {
            w91Var.e(this, true);
        } else {
            w91Var.e(this, false);
        }
        if (d81Var.y() && i10 != 4) {
            n();
        } else if (i10 == 4) {
            this.V = true;
            d81Var.B();
            d81Var.L(0L, false);
            n();
            v91Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.S) {
            this.S = false;
            if (this.T || this.U) {
                if (this.U) {
                    this.f33456r = 1;
                }
                this.f33455n.setSurfaceTexture(surfaceTexture);
                this.f33455n.setSurfaceTextureListener(this.f33453j0);
                this.f33455n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f33456r == 2) {
            ImageView imageView = this.f33446e;
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
            int i10 = this.f33450g0;
            int i11 = this.f33451h0;
            this.f33443c.getVideoRotation();
            this.v.f(this.f33449f0, false, i10, i11, this.I);
            this.f33456r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        kg0 kg0Var = this.f33443c;
        if (kg0Var != null) {
            float f11 = i10 * f7;
            this.f33450g0 = (int) f11;
            this.f33451h0 = i11;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / i11;
            }
            kg0Var.a(f10, 0);
            if (this.T) {
                this.v.c(f10);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.M = true;
        this.L = System.currentTimeMillis();
        this.f33449f0.invalidate();
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
