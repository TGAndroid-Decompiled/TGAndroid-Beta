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
public final class v91 extends ViewGroup implements y71, AudioManager.OnAudioFocusChangeListener {
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
    public final b81 f31221a;
    public final RadialProgressView f31222a0;
    public final o91 f31223b;
    public final ImageView f31224b0;
    public final rg0 f31225c;
    public final ImageView f31226c0;
    public final TextureView d;
    public final ImageView f31227d0;
    public final ImageView e;
    public AnimatorSet f31228e0;
    public final ViewGroup f31229f;
    public final r91 f31230f0;
    public int f31231g0;
    public Bitmap h;
    public int f31232h0;
    public final n91 f31233i0;
    public final t50 f31234j0;
    public final n91 f31235k0;
    public TextureView f31236n;
    public int f31237r;
    public boolean f31238s;
    public final s91 v;
    public boolean f31239w;
    public String f31240x;
    public String f31241y;
    public static final Pattern f31207l0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f31208n0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f31209o0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f31210p0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f31211q0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f31212r0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f31213s0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f31214t0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f31215u0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f31216v0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f31217w0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f31218x0 = Pattern.compile("var\\s");
    public static final Pattern f31219y0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f31220z0 = Pattern.compile("[()]");
    public static final Pattern A0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public v91(Context context, boolean z10, s91 s91Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.f31233i0 = new n91(this, 0);
        this.f31234j0 = new t50(this, 3);
        this.f31235k0 = new n91(this, 1);
        setWillNotDraw(false);
        this.v = s91Var;
        paint.setColor(-16777216);
        rg0 rg0Var = new rg0(this, context, 1);
        this.f31225c = rg0Var;
        addView(rg0Var, w7.z5.e(-1, -1, 17));
        o91 o91Var = new o91(context, context);
        this.f31223b = o91Var;
        final f81 f81Var = new f81(this);
        o91Var.addJavascriptInterface(new Object(f81Var) {
            public final f81 f24420a;

            {
                this.f24420a = f81Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                v91 v91Var = (v91) this.f24420a.f26158a;
                AsyncTask asyncTask = v91Var.R;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = v91Var.R;
                    if (asyncTask2 instanceof u91) {
                        u91 u91Var = (u91) asyncTask2;
                        String[] strArr = u91Var.f30921c;
                        String str2 = strArr[0];
                        String str3 = u91Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        u91Var.f30920b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = o91Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = s91Var.g();
        this.f31229f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            rg0Var.addView(textureView, w7.z5.e(-1, -1, 17));
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
        b81 b81Var = new b81();
        this.f31221a = b81Var;
        b81Var.J = this;
        b81Var.V(textureView);
        r91 r91Var = new r91(this, context);
        this.f31230f0 = r91Var;
        if (g10 != null) {
            g10.addView(r91Var);
        } else {
            addView(r91Var, w7.z5.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f31222a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, w7.z5.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f31224b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        r91Var.addView(imageView2, w7.z5.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final v91 f28493b;

            {
                this.f28493b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        v91 v91Var = this.f28493b;
                        if (v91Var.f31239w && !v91Var.S && !v91Var.W && v91Var.M) {
                            v91Var.T = !v91Var.T;
                            v91Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        v91 v91Var2 = this.f28493b;
                        b81 b81Var2 = v91Var2.f31221a;
                        if (v91Var2.f31239w && v91Var2.f31240x != null) {
                            if (b81Var2.d == null) {
                                v91Var2.i();
                            }
                            if (b81Var2.y()) {
                                b81Var2.B();
                            } else {
                                v91Var2.V = false;
                                b81Var2.C();
                            }
                            v91Var2.n();
                            return;
                        }
                        return;
                    default:
                        v91 v91Var3 = this.f28493b;
                        ViewGroup viewGroup = v91Var3.f31229f;
                        boolean z11 = v91Var3.I;
                        s91 s91Var2 = v91Var3.v;
                        r91 r91Var2 = v91Var3.f31230f0;
                        rg0 rg0Var2 = v91Var3.f31225c;
                        TextureView textureView2 = v91Var3.d;
                        if (textureView2 != null && s91Var2.h() && !v91Var3.S && !v91Var3.W && v91Var3.M) {
                            v91Var3.W = true;
                            if (!v91Var3.U) {
                                v91Var3.T = false;
                                s91Var2.i(true, v91Var3.f31235k0, rg0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) rg0Var2.getParent();
                            if (viewGroup2 != v91Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(rg0Var2);
                                }
                                v91Var3.addView(rg0Var2, 0, w7.z5.e(-1, -1, 17));
                                rg0Var2.measure(View.MeasureSpec.makeMeasureSpec(v91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(v91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = v91Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                v91Var3.h = null;
                            }
                            v91Var3.S = true;
                            v91Var3.U = false;
                            v91Var3.n();
                            v91Var3.o();
                            v91Var3.k();
                            v91Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                rg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) r91Var2.getParent();
                            if (viewGroup3 != v91Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(r91Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(r91Var2);
                                } else {
                                    v91Var3.addView(r91Var2, 1);
                                }
                            }
                            r91Var2.d(false, false);
                            s91Var2.i(false, null, rg0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f31226c0 = imageView3;
        imageView3.setScaleType(scaleType);
        r91Var.addView(imageView3, w7.z5.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final v91 f28493b;

            {
                this.f28493b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        v91 v91Var = this.f28493b;
                        if (v91Var.f31239w && !v91Var.S && !v91Var.W && v91Var.M) {
                            v91Var.T = !v91Var.T;
                            v91Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        v91 v91Var2 = this.f28493b;
                        b81 b81Var2 = v91Var2.f31221a;
                        if (v91Var2.f31239w && v91Var2.f31240x != null) {
                            if (b81Var2.d == null) {
                                v91Var2.i();
                            }
                            if (b81Var2.y()) {
                                b81Var2.B();
                            } else {
                                v91Var2.V = false;
                                b81Var2.C();
                            }
                            v91Var2.n();
                            return;
                        }
                        return;
                    default:
                        v91 v91Var3 = this.f28493b;
                        ViewGroup viewGroup = v91Var3.f31229f;
                        boolean z11 = v91Var3.I;
                        s91 s91Var2 = v91Var3.v;
                        r91 r91Var2 = v91Var3.f31230f0;
                        rg0 rg0Var2 = v91Var3.f31225c;
                        TextureView textureView2 = v91Var3.d;
                        if (textureView2 != null && s91Var2.h() && !v91Var3.S && !v91Var3.W && v91Var3.M) {
                            v91Var3.W = true;
                            if (!v91Var3.U) {
                                v91Var3.T = false;
                                s91Var2.i(true, v91Var3.f31235k0, rg0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) rg0Var2.getParent();
                            if (viewGroup2 != v91Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(rg0Var2);
                                }
                                v91Var3.addView(rg0Var2, 0, w7.z5.e(-1, -1, 17));
                                rg0Var2.measure(View.MeasureSpec.makeMeasureSpec(v91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(v91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = v91Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                v91Var3.h = null;
                            }
                            v91Var3.S = true;
                            v91Var3.U = false;
                            v91Var3.n();
                            v91Var3.o();
                            v91Var3.k();
                            v91Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                rg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) r91Var2.getParent();
                            if (viewGroup3 != v91Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(r91Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(r91Var2);
                                } else {
                                    v91Var3.addView(r91Var2, 1);
                                }
                            }
                            r91Var2.d(false, false);
                            s91Var2.i(false, null, rg0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f31227d0 = imageView4;
            imageView4.setScaleType(scaleType);
            r91Var.addView(imageView4, w7.z5.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final v91 f28493b;

                {
                    this.f28493b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            v91 v91Var = this.f28493b;
                            if (v91Var.f31239w && !v91Var.S && !v91Var.W && v91Var.M) {
                                v91Var.T = !v91Var.T;
                                v91Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            v91 v91Var2 = this.f28493b;
                            b81 b81Var2 = v91Var2.f31221a;
                            if (v91Var2.f31239w && v91Var2.f31240x != null) {
                                if (b81Var2.d == null) {
                                    v91Var2.i();
                                }
                                if (b81Var2.y()) {
                                    b81Var2.B();
                                } else {
                                    v91Var2.V = false;
                                    b81Var2.C();
                                }
                                v91Var2.n();
                                return;
                            }
                            return;
                        default:
                            v91 v91Var3 = this.f28493b;
                            ViewGroup viewGroup = v91Var3.f31229f;
                            boolean z11 = v91Var3.I;
                            s91 s91Var2 = v91Var3.v;
                            r91 r91Var2 = v91Var3.f31230f0;
                            rg0 rg0Var2 = v91Var3.f31225c;
                            TextureView textureView2 = v91Var3.d;
                            if (textureView2 != null && s91Var2.h() && !v91Var3.S && !v91Var3.W && v91Var3.M) {
                                v91Var3.W = true;
                                if (!v91Var3.U) {
                                    v91Var3.T = false;
                                    s91Var2.i(true, v91Var3.f31235k0, rg0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) rg0Var2.getParent();
                                if (viewGroup2 != v91Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(rg0Var2);
                                    }
                                    v91Var3.addView(rg0Var2, 0, w7.z5.e(-1, -1, 17));
                                    rg0Var2.measure(View.MeasureSpec.makeMeasureSpec(v91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(v91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                }
                                Bitmap bitmap = v91Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    v91Var3.h = null;
                                }
                                v91Var3.S = true;
                                v91Var3.U = false;
                                v91Var3.n();
                                v91Var3.o();
                                v91Var3.k();
                                v91Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    rg0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) r91Var2.getParent();
                                if (viewGroup3 != v91Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(r91Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(r91Var2);
                                    } else {
                                        v91Var3.addView(r91Var2, 1);
                                    }
                                }
                                r91Var2.d(false, false);
                                s91Var2.i(false, null, rg0Var2.getAspectRatio(), z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v91.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v91.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f31208n0.matcher(str);
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
        Matcher matcher = f31207l0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f31230f0;
    }

    private View getProgressView() {
        return this.f31222a0;
    }

    public final void b() {
        this.f31221a.H();
        AsyncTask asyncTask = this.R;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.R = null;
        }
        this.f31223b.stopLoading();
    }

    public final boolean f() {
        if (!this.U && !this.W) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r27, org.telegram.tgnet.TLRPC.Photo r28, java.lang.Object r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v91.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f31225c;
    }

    public View getControlsView() {
        return this.f31230f0;
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
        r91 r91Var = this.f31230f0;
        if (r91Var.getParent() != this) {
            r91Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.f31240x;
        if (str != null) {
            String str2 = this.E;
            b81 b81Var = this.f31221a;
            if (str2 != null) {
                b81Var.G(Uri.parse(str), this.f31241y, Uri.parse(this.E), this.F);
            } else {
                b81Var.D(Uri.parse(str), this.f31241y);
            }
            b81Var.P(this.f31238s);
            int i10 = (b81Var.p() > (-9223372036854775807L) ? 1 : (b81Var.p() == (-9223372036854775807L) ? 0 : -1));
            r91 r91Var = this.f31230f0;
            if (i10 != 0) {
                r91Var.b((int) (b81Var.p() / 1000));
            } else {
                r91Var.b(0);
            }
            k();
            o();
            m();
            r91Var.invalidate();
            int i11 = this.O;
            if (i11 != -1) {
                b81Var.L(i11 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f7 = 0.0f;
        RadialProgressView radialProgressView = this.f31222a0;
        if (z11) {
            AnimatorSet animatorSet = this.f31228e0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f31228e0 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f7));
            this.f31228e0.setDuration(150L);
            this.f31228e0.addListener(new o31(this, 6));
            this.f31228e0.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        radialProgressView.setAlpha(f7);
    }

    public final void k() {
        i2.i0 i0Var = this.f31221a.d;
        ImageView imageView = this.f31224b0;
        if (i0Var != null && !this.U) {
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
        ViewGroup viewGroup2 = this.f31229f;
        rg0 rg0Var = this.f31225c;
        if (viewGroup2 == null) {
            this.S = true;
            if (!this.T) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    rg0Var.addView(textureView);
                }
            }
            boolean z11 = this.T;
            r91 r91Var = this.f31230f0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) r91Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(r91Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) r91Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(r91Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(r91Var);
                    } else {
                        addView(r91Var, 1);
                    }
                }
            }
            TextureView a2 = this.v.a(this.f31230f0, this.T, rg0Var.getAspectRatio(), rg0Var.getVideoRotation(), z10);
            this.f31236n = a2;
            a2.setVisibility(4);
            if (this.T && this.f31236n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i10 = r91.I;
            r91Var.a();
            return;
        }
        if (this.T) {
            ViewGroup viewGroup5 = (ViewGroup) rg0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(rg0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) rg0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(rg0Var);
                }
                addView(rg0Var, 0);
            }
        }
        this.v.a(this.f31230f0, this.T, rg0Var.getAspectRatio(), rg0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i10;
        int i11;
        ImageView imageView = this.f31227d0;
        if (imageView == null) {
            return;
        }
        if (this.U) {
            i10 = R.drawable.ic_goinline;
        } else {
            i10 = R.drawable.ic_outinline;
        }
        imageView.setImageResource(i10);
        if (this.f31221a.d != null) {
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
        r91 r91Var = this.f31230f0;
        int i13 = r91.I;
        r91Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.f31233i0);
        if (!this.f31221a.y()) {
            if (this.V) {
                ImageView imageView = this.f31226c0;
                if (this.U) {
                    i12 = R.drawable.ic_againinline;
                } else {
                    i12 = R.drawable.ic_again;
                }
                imageView.setImageResource(i12);
                return;
            }
            ImageView imageView2 = this.f31226c0;
            if (this.U) {
                i11 = R.drawable.ic_playinline;
            } else {
                i11 = R.drawable.ic_play;
            }
            imageView2.setImageResource(i11);
            return;
        }
        ImageView imageView3 = this.f31226c0;
        if (this.U) {
            i10 = R.drawable.ic_pauseinline;
        } else {
            i10 = R.drawable.ic_pause;
        }
        imageView3.setImageResource(i10);
        AndroidUtilities.runOnUIThread(this.f31233i0, 500L);
        if (!this.J) {
            this.J = true;
            ((AudioManager) ApplicationLoader.applicationContext.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new e2(this, i10, 15));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.Q);
    }

    @Override
    public final void onError(b81 b81Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        rg0 rg0Var = this.f31225c;
        int measuredWidth = (i14 - rg0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - rg0Var.getMeasuredHeight()) / 2;
        rg0Var.layout(measuredWidth, dp, rg0Var.getMeasuredWidth() + measuredWidth, rg0Var.getMeasuredHeight() + dp);
        r91 r91Var = this.f31230f0;
        if (r91Var.getParent() == this) {
            r91Var.layout(0, 0, r91Var.getMeasuredWidth(), r91Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f31222a0;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        r91Var.f29904a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f31225c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        r91 r91Var = this.f31230f0;
        if (r91Var.getParent() == this) {
            r91Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f31222a0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        r91 r91Var = this.f31230f0;
        b81 b81Var = this.f31221a;
        if (i10 != 2) {
            if (b81Var.p() != -9223372036854775807L) {
                r91Var.b((int) (b81Var.p() / 1000));
            } else {
                r91Var.b(0);
            }
        }
        s91 s91Var = this.v;
        if (i10 != 4 && i10 != 1 && b81Var.y()) {
            s91Var.e(this, true);
        } else {
            s91Var.e(this, false);
        }
        if (b81Var.y() && i10 != 4) {
            n();
        } else if (i10 == 4) {
            this.V = true;
            b81Var.B();
            b81Var.L(0L, false);
            n();
            r91Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.S) {
            this.S = false;
            if (this.T || this.U) {
                if (this.U) {
                    this.f31237r = 1;
                }
                this.f31236n.setSurfaceTexture(surfaceTexture);
                this.f31236n.setSurfaceTextureListener(this.f31234j0);
                this.f31236n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f31237r == 2) {
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
            int i10 = this.f31231g0;
            int i11 = this.f31232h0;
            this.f31225c.getVideoRotation();
            this.v.f(this.f31230f0, false, i10, i11, this.I);
            this.f31237r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        rg0 rg0Var = this.f31225c;
        if (rg0Var != null) {
            float f11 = i10 * f7;
            this.f31231g0 = (int) f11;
            this.f31232h0 = i11;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / i11;
            }
            rg0Var.a(f10, 0);
            if (this.T) {
                this.v.c(f10);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.M = true;
        this.L = System.currentTimeMillis();
        this.f31230f0.invalidate();
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
