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
public final class u91 extends ViewGroup implements x71, AudioManager.OnAudioFocusChangeListener {
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
    public final a81 f30926a;
    public final RadialProgressView f30927a0;
    public final n91 f30928b;
    public final ImageView f30929b0;
    public final rg0 f30930c;
    public final ImageView f30931c0;
    public final TextureView d;
    public final ImageView f30932d0;
    public final ImageView e;
    public AnimatorSet f30933e0;
    public final ViewGroup f30934f;
    public final q91 f30935f0;
    public int f30936g0;
    public Bitmap h;
    public int f30937h0;
    public final m91 f30938i0;
    public final t50 f30939j0;
    public final m91 f30940k0;
    public TextureView f30941n;
    public int f30942r;
    public boolean f30943s;
    public final r91 v;
    public boolean f30944w;
    public String f30945x;
    public String f30946y;
    public static final Pattern f30912l0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f30913n0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f30914o0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f30915p0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f30916q0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f30917r0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f30918s0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f30919t0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f30920u0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f30921v0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f30922w0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f30923x0 = Pattern.compile("var\\s");
    public static final Pattern f30924y0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f30925z0 = Pattern.compile("[()]");
    public static final Pattern A0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public u91(Context context, boolean z10, r91 r91Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.f30938i0 = new m91(this, 0);
        this.f30939j0 = new t50(this, 3);
        this.f30940k0 = new m91(this, 1);
        setWillNotDraw(false);
        this.v = r91Var;
        paint.setColor(-16777216);
        rg0 rg0Var = new rg0(this, context, 1);
        this.f30930c = rg0Var;
        addView(rg0Var, w7.z5.e(-1, -1, 17));
        n91 n91Var = new n91(context, context);
        this.f30928b = n91Var;
        final e81 e81Var = new e81(this);
        n91Var.addJavascriptInterface(new Object(e81Var) {
            public final e81 f24417a;

            {
                this.f24417a = e81Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                u91 u91Var = (u91) this.f24417a.f25871a;
                AsyncTask asyncTask = u91Var.R;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = u91Var.R;
                    if (asyncTask2 instanceof t91) {
                        t91 t91Var = (t91) asyncTask2;
                        String[] strArr = t91Var.f30498c;
                        String str2 = strArr[0];
                        String str3 = t91Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        t91Var.f30497b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = n91Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = r91Var.g();
        this.f30934f = g10;
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
        a81 a81Var = new a81();
        this.f30926a = a81Var;
        a81Var.J = this;
        a81Var.V(textureView);
        q91 q91Var = new q91(this, context);
        this.f30935f0 = q91Var;
        if (g10 != null) {
            g10.addView(q91Var);
        } else {
            addView(q91Var, w7.z5.d(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f30927a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, w7.z5.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f30929b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        q91Var.addView(imageView2, w7.z5.a(56.0f, 0.0f, 0.0f, 0.0f, 5.0f, 56, 85));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final u91 f28183b;

            {
                this.f28183b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u91 u91Var = this.f28183b;
                        if (u91Var.f30944w && !u91Var.S && !u91Var.W && u91Var.M) {
                            u91Var.T = !u91Var.T;
                            u91Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        u91 u91Var2 = this.f28183b;
                        a81 a81Var2 = u91Var2.f30926a;
                        if (u91Var2.f30944w && u91Var2.f30945x != null) {
                            if (a81Var2.d == null) {
                                u91Var2.i();
                            }
                            if (a81Var2.y()) {
                                a81Var2.B();
                            } else {
                                u91Var2.V = false;
                                a81Var2.C();
                            }
                            u91Var2.n();
                            return;
                        }
                        return;
                    default:
                        u91 u91Var3 = this.f28183b;
                        ViewGroup viewGroup = u91Var3.f30934f;
                        boolean z11 = u91Var3.I;
                        r91 r91Var2 = u91Var3.v;
                        q91 q91Var2 = u91Var3.f30935f0;
                        rg0 rg0Var2 = u91Var3.f30930c;
                        TextureView textureView2 = u91Var3.d;
                        if (textureView2 != null && r91Var2.h() && !u91Var3.S && !u91Var3.W && u91Var3.M) {
                            u91Var3.W = true;
                            if (!u91Var3.U) {
                                u91Var3.T = false;
                                r91Var2.i(true, u91Var3.f30940k0, rg0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) rg0Var2.getParent();
                            if (viewGroup2 != u91Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(rg0Var2);
                                }
                                u91Var3.addView(rg0Var2, 0, w7.z5.e(-1, -1, 17));
                                rg0Var2.measure(View.MeasureSpec.makeMeasureSpec(u91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(u91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = u91Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                u91Var3.h = null;
                            }
                            u91Var3.S = true;
                            u91Var3.U = false;
                            u91Var3.n();
                            u91Var3.o();
                            u91Var3.k();
                            u91Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                rg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) q91Var2.getParent();
                            if (viewGroup3 != u91Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(q91Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(q91Var2);
                                } else {
                                    u91Var3.addView(q91Var2, 1);
                                }
                            }
                            q91Var2.d(false, false);
                            r91Var2.i(false, null, rg0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f30931c0 = imageView3;
        imageView3.setScaleType(scaleType);
        q91Var.addView(imageView3, w7.z5.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final u91 f28183b;

            {
                this.f28183b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u91 u91Var = this.f28183b;
                        if (u91Var.f30944w && !u91Var.S && !u91Var.W && u91Var.M) {
                            u91Var.T = !u91Var.T;
                            u91Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        u91 u91Var2 = this.f28183b;
                        a81 a81Var2 = u91Var2.f30926a;
                        if (u91Var2.f30944w && u91Var2.f30945x != null) {
                            if (a81Var2.d == null) {
                                u91Var2.i();
                            }
                            if (a81Var2.y()) {
                                a81Var2.B();
                            } else {
                                u91Var2.V = false;
                                a81Var2.C();
                            }
                            u91Var2.n();
                            return;
                        }
                        return;
                    default:
                        u91 u91Var3 = this.f28183b;
                        ViewGroup viewGroup = u91Var3.f30934f;
                        boolean z11 = u91Var3.I;
                        r91 r91Var2 = u91Var3.v;
                        q91 q91Var2 = u91Var3.f30935f0;
                        rg0 rg0Var2 = u91Var3.f30930c;
                        TextureView textureView2 = u91Var3.d;
                        if (textureView2 != null && r91Var2.h() && !u91Var3.S && !u91Var3.W && u91Var3.M) {
                            u91Var3.W = true;
                            if (!u91Var3.U) {
                                u91Var3.T = false;
                                r91Var2.i(true, u91Var3.f30940k0, rg0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) rg0Var2.getParent();
                            if (viewGroup2 != u91Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(rg0Var2);
                                }
                                u91Var3.addView(rg0Var2, 0, w7.z5.e(-1, -1, 17));
                                rg0Var2.measure(View.MeasureSpec.makeMeasureSpec(u91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(u91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = u91Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                u91Var3.h = null;
                            }
                            u91Var3.S = true;
                            u91Var3.U = false;
                            u91Var3.n();
                            u91Var3.o();
                            u91Var3.k();
                            u91Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                rg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) q91Var2.getParent();
                            if (viewGroup3 != u91Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(q91Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(q91Var2);
                                } else {
                                    u91Var3.addView(q91Var2, 1);
                                }
                            }
                            q91Var2.d(false, false);
                            r91Var2.i(false, null, rg0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f30932d0 = imageView4;
            imageView4.setScaleType(scaleType);
            q91Var.addView(imageView4, w7.z5.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final u91 f28183b;

                {
                    this.f28183b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            u91 u91Var = this.f28183b;
                            if (u91Var.f30944w && !u91Var.S && !u91Var.W && u91Var.M) {
                                u91Var.T = !u91Var.T;
                                u91Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            u91 u91Var2 = this.f28183b;
                            a81 a81Var2 = u91Var2.f30926a;
                            if (u91Var2.f30944w && u91Var2.f30945x != null) {
                                if (a81Var2.d == null) {
                                    u91Var2.i();
                                }
                                if (a81Var2.y()) {
                                    a81Var2.B();
                                } else {
                                    u91Var2.V = false;
                                    a81Var2.C();
                                }
                                u91Var2.n();
                                return;
                            }
                            return;
                        default:
                            u91 u91Var3 = this.f28183b;
                            ViewGroup viewGroup = u91Var3.f30934f;
                            boolean z11 = u91Var3.I;
                            r91 r91Var2 = u91Var3.v;
                            q91 q91Var2 = u91Var3.f30935f0;
                            rg0 rg0Var2 = u91Var3.f30930c;
                            TextureView textureView2 = u91Var3.d;
                            if (textureView2 != null && r91Var2.h() && !u91Var3.S && !u91Var3.W && u91Var3.M) {
                                u91Var3.W = true;
                                if (!u91Var3.U) {
                                    u91Var3.T = false;
                                    r91Var2.i(true, u91Var3.f30940k0, rg0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) rg0Var2.getParent();
                                if (viewGroup2 != u91Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(rg0Var2);
                                    }
                                    u91Var3.addView(rg0Var2, 0, w7.z5.e(-1, -1, 17));
                                    rg0Var2.measure(View.MeasureSpec.makeMeasureSpec(u91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(u91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                }
                                Bitmap bitmap = u91Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    u91Var3.h = null;
                                }
                                u91Var3.S = true;
                                u91Var3.U = false;
                                u91Var3.n();
                                u91Var3.o();
                                u91Var3.k();
                                u91Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    rg0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) q91Var2.getParent();
                                if (viewGroup3 != u91Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(q91Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(q91Var2);
                                    } else {
                                        u91Var3.addView(q91Var2, 1);
                                    }
                                }
                                q91Var2.d(false, false);
                                r91Var2.i(false, null, rg0Var2.getAspectRatio(), z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u91.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u91.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f30913n0.matcher(str);
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
        Matcher matcher = f30912l0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f30935f0;
    }

    private View getProgressView() {
        return this.f30927a0;
    }

    public final void b() {
        this.f30926a.H();
        AsyncTask asyncTask = this.R;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.R = null;
        }
        this.f30928b.stopLoading();
    }

    public final boolean f() {
        if (!this.U && !this.W) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r27, org.telegram.tgnet.TLRPC.Photo r28, java.lang.Object r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u91.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f30930c;
    }

    public View getControlsView() {
        return this.f30935f0;
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
        q91 q91Var = this.f30935f0;
        if (q91Var.getParent() != this) {
            q91Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.f30945x;
        if (str != null) {
            String str2 = this.E;
            a81 a81Var = this.f30926a;
            if (str2 != null) {
                a81Var.G(Uri.parse(str), this.f30946y, Uri.parse(this.E), this.F);
            } else {
                a81Var.D(Uri.parse(str), this.f30946y);
            }
            a81Var.P(this.f30943s);
            int i10 = (a81Var.p() > (-9223372036854775807L) ? 1 : (a81Var.p() == (-9223372036854775807L) ? 0 : -1));
            q91 q91Var = this.f30935f0;
            if (i10 != 0) {
                q91Var.b((int) (a81Var.p() / 1000));
            } else {
                q91Var.b(0);
            }
            k();
            o();
            m();
            q91Var.invalidate();
            int i11 = this.O;
            if (i11 != -1) {
                a81Var.L(i11 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f7 = 0.0f;
        RadialProgressView radialProgressView = this.f30927a0;
        if (z11) {
            AnimatorSet animatorSet = this.f30933e0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f30933e0 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f7));
            this.f30933e0.setDuration(150L);
            this.f30933e0.addListener(new n31(this, 6));
            this.f30933e0.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        radialProgressView.setAlpha(f7);
    }

    public final void k() {
        i2.g0 g0Var = this.f30926a.d;
        ImageView imageView = this.f30929b0;
        if (g0Var != null && !this.U) {
            imageView.setVisibility(0);
            if (!this.T) {
                imageView.setImageResource(R.drawable.ic_gofullscreen);
                imageView.setLayoutParams(w7.z5.a(56.0f, 0.0f, 0.0f, 0.0f, 5.0f, 56, 85));
                return;
            }
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(w7.z5.a(56.0f, 0.0f, 0.0f, 0.0f, 1.0f, 56, 85));
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
        ViewGroup viewGroup2 = this.f30934f;
        rg0 rg0Var = this.f30930c;
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
            q91 q91Var = this.f30935f0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) q91Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(q91Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) q91Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(q91Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(q91Var);
                    } else {
                        addView(q91Var, 1);
                    }
                }
            }
            TextureView a2 = this.v.a(this.f30935f0, this.T, rg0Var.getAspectRatio(), rg0Var.getVideoRotation(), z10);
            this.f30941n = a2;
            a2.setVisibility(4);
            if (this.T && this.f30941n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i10 = q91.I;
            q91Var.a();
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
        this.v.a(this.f30935f0, this.T, rg0Var.getAspectRatio(), rg0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i10;
        int i11;
        ImageView imageView = this.f30932d0;
        if (imageView == null) {
            return;
        }
        if (this.U) {
            i10 = R.drawable.ic_goinline;
        } else {
            i10 = R.drawable.ic_outinline;
        }
        imageView.setImageResource(i10);
        if (this.f30926a.d != null) {
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
        q91 q91Var = this.f30935f0;
        int i13 = q91.I;
        q91Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.f30938i0);
        if (!this.f30926a.y()) {
            if (this.V) {
                ImageView imageView = this.f30931c0;
                if (this.U) {
                    i12 = R.drawable.ic_againinline;
                } else {
                    i12 = R.drawable.ic_again;
                }
                imageView.setImageResource(i12);
                return;
            }
            ImageView imageView2 = this.f30931c0;
            if (this.U) {
                i11 = R.drawable.ic_playinline;
            } else {
                i11 = R.drawable.ic_play;
            }
            imageView2.setImageResource(i11);
            return;
        }
        ImageView imageView3 = this.f30931c0;
        if (this.U) {
            i10 = R.drawable.ic_pauseinline;
        } else {
            i10 = R.drawable.ic_pause;
        }
        imageView3.setImageResource(i10);
        AndroidUtilities.runOnUIThread(this.f30938i0, 500L);
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
    public final void onError(a81 a81Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        rg0 rg0Var = this.f30930c;
        int measuredWidth = (i14 - rg0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - rg0Var.getMeasuredHeight()) / 2;
        rg0Var.layout(measuredWidth, dp, rg0Var.getMeasuredWidth() + measuredWidth, rg0Var.getMeasuredHeight() + dp);
        q91 q91Var = this.f30935f0;
        if (q91Var.getParent() == this) {
            q91Var.layout(0, 0, q91Var.getMeasuredWidth(), q91Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f30927a0;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        q91Var.f29607a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f30930c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        q91 q91Var = this.f30935f0;
        if (q91Var.getParent() == this) {
            q91Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f30927a0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        q91 q91Var = this.f30935f0;
        a81 a81Var = this.f30926a;
        if (i10 != 2) {
            if (a81Var.p() != -9223372036854775807L) {
                q91Var.b((int) (a81Var.p() / 1000));
            } else {
                q91Var.b(0);
            }
        }
        r91 r91Var = this.v;
        if (i10 != 4 && i10 != 1 && a81Var.y()) {
            r91Var.e(this, true);
        } else {
            r91Var.e(this, false);
        }
        if (a81Var.y() && i10 != 4) {
            n();
        } else if (i10 == 4) {
            this.V = true;
            a81Var.B();
            a81Var.L(0L, false);
            n();
            q91Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.S) {
            this.S = false;
            if (this.T || this.U) {
                if (this.U) {
                    this.f30942r = 1;
                }
                this.f30941n.setSurfaceTexture(surfaceTexture);
                this.f30941n.setSurfaceTextureListener(this.f30939j0);
                this.f30941n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f30942r == 2) {
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
            int i10 = this.f30936g0;
            int i11 = this.f30937h0;
            this.f30930c.getVideoRotation();
            this.v.f(this.f30935f0, false, i10, i11, this.I);
            this.f30942r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        rg0 rg0Var = this.f30930c;
        if (rg0Var != null) {
            float f11 = i10 * f7;
            this.f30936g0 = (int) f11;
            this.f30937h0 = i11;
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
        this.f30935f0.invalidate();
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
