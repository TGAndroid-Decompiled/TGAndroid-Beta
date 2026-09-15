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
public final class c91 extends ViewGroup implements d71, AudioManager.OnAudioFocusChangeListener {
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
    public final g71 f23017a;
    public final RadialProgressView f23018a0;
    public final u81 f23019b;
    public final ImageView f23020b0;
    public final xf0 f23021c;
    public final ImageView f23022c0;
    public final TextureView d;
    public final ImageView f23023d0;
    public final ImageView e;
    public AnimatorSet f23024e0;
    public final ViewGroup f23025f;
    public final y81 f23026f0;
    public int f23027g0;
    public Bitmap h;
    public int f23028h0;
    public final t81 f23029i0;
    public final j50 f23030j0;
    public final t81 f23031k0;
    public TextureView f23032n;
    public int f23033r;
    public boolean f23034s;
    public final z81 v;
    public boolean f23035w;
    public String f23036x;
    public String f23037y;
    public static final Pattern f23003l0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f23004n0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f23005o0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f23006p0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f23007q0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f23008r0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f23009s0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f23010t0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f23011u0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f23012v0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f23013w0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f23014x0 = Pattern.compile("var\\s");
    public static final Pattern f23015y0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f23016z0 = Pattern.compile("[()]");
    public static final Pattern A0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public c91(Context context, boolean z10, z81 z81Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.f23029i0 = new t81(this, 0);
        this.f23030j0 = new j50(this, 3);
        this.f23031k0 = new t81(this, 1);
        setWillNotDraw(false);
        this.v = z81Var;
        paint.setColor(-16777216);
        xf0 xf0Var = new xf0(this, context, 1);
        this.f23021c = xf0Var;
        addView(xf0Var, w7.x5.e(-1, -1, 17));
        u81 u81Var = new u81(context, context);
        this.f23019b = u81Var;
        final r81 r81Var = new r81(this);
        u81Var.addJavascriptInterface(new Object(r81Var) {
            public final r81 f22243a;

            {
                this.f22243a = r81Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                c91 c91Var = (c91) this.f22243a.f27607a;
                AsyncTask asyncTask = c91Var.R;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = c91Var.R;
                    if (asyncTask2 instanceof b91) {
                        b91 b91Var = (b91) asyncTask2;
                        String[] strArr = b91Var.f22723c;
                        String str2 = strArr[0];
                        String str3 = b91Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        b91Var.f22722b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = u81Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = z81Var.g();
        this.f23025f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            xf0Var.addView(textureView, w7.x5.e(-1, -1, 17));
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
        g71 g71Var = new g71();
        this.f23017a = g71Var;
        g71Var.J = this;
        g71Var.V(textureView);
        y81 y81Var = new y81(this, context);
        this.f23026f0 = y81Var;
        if (g10 != null) {
            g10.addView(y81Var);
        } else {
            addView(y81Var, w7.x5.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f23018a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, w7.x5.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f23020b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        y81Var.addView(imageView2, w7.x5.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final c91 f27800b;

            {
                this.f27800b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        c91 c91Var = this.f27800b;
                        if (c91Var.f23035w && !c91Var.S && !c91Var.W && c91Var.M) {
                            c91Var.T = !c91Var.T;
                            c91Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        c91 c91Var2 = this.f27800b;
                        g71 g71Var2 = c91Var2.f23017a;
                        if (c91Var2.f23035w && c91Var2.f23036x != null) {
                            if (g71Var2.d == null) {
                                c91Var2.i();
                            }
                            if (g71Var2.y()) {
                                g71Var2.B();
                            } else {
                                c91Var2.V = false;
                                g71Var2.C();
                            }
                            c91Var2.n();
                            return;
                        }
                        return;
                    default:
                        c91 c91Var3 = this.f27800b;
                        ViewGroup viewGroup = c91Var3.f23025f;
                        boolean z11 = c91Var3.I;
                        z81 z81Var2 = c91Var3.v;
                        y81 y81Var2 = c91Var3.f23026f0;
                        xf0 xf0Var2 = c91Var3.f23021c;
                        TextureView textureView2 = c91Var3.d;
                        if (textureView2 != null && z81Var2.h() && !c91Var3.S && !c91Var3.W && c91Var3.M) {
                            c91Var3.W = true;
                            if (!c91Var3.U) {
                                c91Var3.T = false;
                                z81Var2.i(true, c91Var3.f23031k0, xf0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) xf0Var2.getParent();
                            if (viewGroup2 != c91Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(xf0Var2);
                                }
                                c91Var3.addView(xf0Var2, 0, w7.x5.e(-1, -1, 17));
                                xf0Var2.measure(View.MeasureSpec.makeMeasureSpec(c91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = c91Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                c91Var3.h = null;
                            }
                            c91Var3.S = true;
                            c91Var3.U = false;
                            c91Var3.n();
                            c91Var3.o();
                            c91Var3.k();
                            c91Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                xf0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) y81Var2.getParent();
                            if (viewGroup3 != c91Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(y81Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(y81Var2);
                                } else {
                                    c91Var3.addView(y81Var2, 1);
                                }
                            }
                            y81Var2.d(false, false);
                            z81Var2.i(false, null, xf0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f23022c0 = imageView3;
        imageView3.setScaleType(scaleType);
        y81Var.addView(imageView3, w7.x5.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final c91 f27800b;

            {
                this.f27800b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        c91 c91Var = this.f27800b;
                        if (c91Var.f23035w && !c91Var.S && !c91Var.W && c91Var.M) {
                            c91Var.T = !c91Var.T;
                            c91Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        c91 c91Var2 = this.f27800b;
                        g71 g71Var2 = c91Var2.f23017a;
                        if (c91Var2.f23035w && c91Var2.f23036x != null) {
                            if (g71Var2.d == null) {
                                c91Var2.i();
                            }
                            if (g71Var2.y()) {
                                g71Var2.B();
                            } else {
                                c91Var2.V = false;
                                g71Var2.C();
                            }
                            c91Var2.n();
                            return;
                        }
                        return;
                    default:
                        c91 c91Var3 = this.f27800b;
                        ViewGroup viewGroup = c91Var3.f23025f;
                        boolean z11 = c91Var3.I;
                        z81 z81Var2 = c91Var3.v;
                        y81 y81Var2 = c91Var3.f23026f0;
                        xf0 xf0Var2 = c91Var3.f23021c;
                        TextureView textureView2 = c91Var3.d;
                        if (textureView2 != null && z81Var2.h() && !c91Var3.S && !c91Var3.W && c91Var3.M) {
                            c91Var3.W = true;
                            if (!c91Var3.U) {
                                c91Var3.T = false;
                                z81Var2.i(true, c91Var3.f23031k0, xf0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) xf0Var2.getParent();
                            if (viewGroup2 != c91Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(xf0Var2);
                                }
                                c91Var3.addView(xf0Var2, 0, w7.x5.e(-1, -1, 17));
                                xf0Var2.measure(View.MeasureSpec.makeMeasureSpec(c91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = c91Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                c91Var3.h = null;
                            }
                            c91Var3.S = true;
                            c91Var3.U = false;
                            c91Var3.n();
                            c91Var3.o();
                            c91Var3.k();
                            c91Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                xf0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) y81Var2.getParent();
                            if (viewGroup3 != c91Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(y81Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(y81Var2);
                                } else {
                                    c91Var3.addView(y81Var2, 1);
                                }
                            }
                            y81Var2.d(false, false);
                            z81Var2.i(false, null, xf0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f23023d0 = imageView4;
            imageView4.setScaleType(scaleType);
            y81Var.addView(imageView4, w7.x5.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final c91 f27800b;

                {
                    this.f27800b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            c91 c91Var = this.f27800b;
                            if (c91Var.f23035w && !c91Var.S && !c91Var.W && c91Var.M) {
                                c91Var.T = !c91Var.T;
                                c91Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            c91 c91Var2 = this.f27800b;
                            g71 g71Var2 = c91Var2.f23017a;
                            if (c91Var2.f23035w && c91Var2.f23036x != null) {
                                if (g71Var2.d == null) {
                                    c91Var2.i();
                                }
                                if (g71Var2.y()) {
                                    g71Var2.B();
                                } else {
                                    c91Var2.V = false;
                                    g71Var2.C();
                                }
                                c91Var2.n();
                                return;
                            }
                            return;
                        default:
                            c91 c91Var3 = this.f27800b;
                            ViewGroup viewGroup = c91Var3.f23025f;
                            boolean z11 = c91Var3.I;
                            z81 z81Var2 = c91Var3.v;
                            y81 y81Var2 = c91Var3.f23026f0;
                            xf0 xf0Var2 = c91Var3.f23021c;
                            TextureView textureView2 = c91Var3.d;
                            if (textureView2 != null && z81Var2.h() && !c91Var3.S && !c91Var3.W && c91Var3.M) {
                                c91Var3.W = true;
                                if (!c91Var3.U) {
                                    c91Var3.T = false;
                                    z81Var2.i(true, c91Var3.f23031k0, xf0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) xf0Var2.getParent();
                                if (viewGroup2 != c91Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(xf0Var2);
                                    }
                                    c91Var3.addView(xf0Var2, 0, w7.x5.e(-1, -1, 17));
                                    xf0Var2.measure(View.MeasureSpec.makeMeasureSpec(c91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                }
                                Bitmap bitmap = c91Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    c91Var3.h = null;
                                }
                                c91Var3.S = true;
                                c91Var3.U = false;
                                c91Var3.n();
                                c91Var3.o();
                                c91Var3.k();
                                c91Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    xf0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) y81Var2.getParent();
                                if (viewGroup3 != c91Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(y81Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(y81Var2);
                                    } else {
                                        c91Var3.addView(y81Var2, 1);
                                    }
                                }
                                y81Var2.d(false, false);
                                z81Var2.i(false, null, xf0Var2.getAspectRatio(), z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c91.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c91.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f23004n0.matcher(str);
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
        Matcher matcher = f23003l0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f23026f0;
    }

    private View getProgressView() {
        return this.f23018a0;
    }

    public final void b() {
        this.f23017a.H();
        AsyncTask asyncTask = this.R;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.R = null;
        }
        this.f23019b.stopLoading();
    }

    public final boolean f() {
        if (!this.U && !this.W) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r27, org.telegram.tgnet.TLRPC.Photo r28, java.lang.Object r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c91.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f23021c;
    }

    public View getControlsView() {
        return this.f23026f0;
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
        y81 y81Var = this.f23026f0;
        if (y81Var.getParent() != this) {
            y81Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.f23036x;
        if (str != null) {
            String str2 = this.E;
            g71 g71Var = this.f23017a;
            if (str2 != null) {
                g71Var.G(Uri.parse(str), this.f23037y, Uri.parse(this.E), this.F);
            } else {
                g71Var.D(Uri.parse(str), this.f23037y);
            }
            g71Var.P(this.f23034s);
            long p5 = g71Var.p();
            y81 y81Var = this.f23026f0;
            if (p5 != -9223372036854775807L) {
                y81Var.b((int) (g71Var.p() / 1000));
            } else {
                y81Var.b(0);
            }
            k();
            o();
            m();
            y81Var.invalidate();
            int i10 = this.O;
            if (i10 != -1) {
                g71Var.L(i10 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f7 = 0.0f;
        RadialProgressView radialProgressView = this.f23018a0;
        if (z11) {
            AnimatorSet animatorSet = this.f23024e0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f23024e0 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f7));
            this.f23024e0.setDuration(150L);
            this.f23024e0.addListener(new v81(this, 0));
            this.f23024e0.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        radialProgressView.setAlpha(f7);
    }

    public final void k() {
        i2.e0 e0Var = this.f23017a.d;
        ImageView imageView = this.f23020b0;
        if (e0Var != null && !this.U) {
            imageView.setVisibility(0);
            if (!this.T) {
                imageView.setImageResource(R.drawable.ic_gofullscreen);
                imageView.setLayoutParams(w7.x5.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
                return;
            }
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(w7.x5.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
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
        ViewGroup viewGroup2 = this.f23025f;
        xf0 xf0Var = this.f23021c;
        if (viewGroup2 == null) {
            this.S = true;
            if (!this.T) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    xf0Var.addView(textureView);
                }
            }
            boolean z11 = this.T;
            y81 y81Var = this.f23026f0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) y81Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(y81Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) y81Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(y81Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(y81Var);
                    } else {
                        addView(y81Var, 1);
                    }
                }
            }
            TextureView a2 = this.v.a(this.f23026f0, this.T, xf0Var.getAspectRatio(), xf0Var.getVideoRotation(), z10);
            this.f23032n = a2;
            a2.setVisibility(4);
            if (this.T && this.f23032n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i10 = y81.I;
            y81Var.a();
            return;
        }
        if (this.T) {
            ViewGroup viewGroup5 = (ViewGroup) xf0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(xf0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) xf0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(xf0Var);
                }
                addView(xf0Var, 0);
            }
        }
        this.v.a(this.f23026f0, this.T, xf0Var.getAspectRatio(), xf0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i10;
        int i11;
        ImageView imageView = this.f23023d0;
        if (imageView == null) {
            return;
        }
        if (this.U) {
            i10 = R.drawable.ic_goinline;
        } else {
            i10 = R.drawable.ic_outinline;
        }
        imageView.setImageResource(i10);
        if (this.f23017a.d != null) {
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
        y81 y81Var = this.f23026f0;
        int i13 = y81.I;
        y81Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.f23029i0);
        if (!this.f23017a.y()) {
            if (this.V) {
                ImageView imageView = this.f23022c0;
                if (this.U) {
                    i12 = R.drawable.ic_againinline;
                } else {
                    i12 = R.drawable.ic_again;
                }
                imageView.setImageResource(i12);
                return;
            }
            ImageView imageView2 = this.f23022c0;
            if (this.U) {
                i11 = R.drawable.ic_playinline;
            } else {
                i11 = R.drawable.ic_play;
            }
            imageView2.setImageResource(i11);
            return;
        }
        ImageView imageView3 = this.f23022c0;
        if (this.U) {
            i10 = R.drawable.ic_pauseinline;
        } else {
            i10 = R.drawable.ic_pause;
        }
        imageView3.setImageResource(i10);
        AndroidUtilities.runOnUIThread(this.f23029i0, 500L);
        if (!this.J) {
            this.J = true;
            ((AudioManager) ApplicationLoader.applicationContext.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new id(this, i10, 13));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.Q);
    }

    @Override
    public final void onError(g71 g71Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        xf0 xf0Var = this.f23021c;
        int measuredWidth = (i14 - xf0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - xf0Var.getMeasuredHeight()) / 2;
        xf0Var.layout(measuredWidth, dp, xf0Var.getMeasuredWidth() + measuredWidth, xf0Var.getMeasuredHeight() + dp);
        y81 y81Var = this.f23026f0;
        if (y81Var.getParent() == this) {
            y81Var.layout(0, 0, y81Var.getMeasuredWidth(), y81Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f23018a0;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        y81Var.f30180a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f23021c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        y81 y81Var = this.f23026f0;
        if (y81Var.getParent() == this) {
            y81Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f23018a0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        y81 y81Var = this.f23026f0;
        g71 g71Var = this.f23017a;
        if (i10 != 2) {
            if (g71Var.p() != -9223372036854775807L) {
                y81Var.b((int) (g71Var.p() / 1000));
            } else {
                y81Var.b(0);
            }
        }
        z81 z81Var = this.v;
        if (i10 != 4 && i10 != 1 && g71Var.y()) {
            z81Var.e(this, true);
        } else {
            z81Var.e(this, false);
        }
        if (g71Var.y() && i10 != 4) {
            n();
        } else if (i10 == 4) {
            this.V = true;
            g71Var.B();
            g71Var.L(0L, false);
            n();
            y81Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.S) {
            this.S = false;
            if (this.T || this.U) {
                if (this.U) {
                    this.f23033r = 1;
                }
                this.f23032n.setSurfaceTexture(surfaceTexture);
                this.f23032n.setSurfaceTextureListener(this.f23030j0);
                this.f23032n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f23033r == 2) {
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
            int i10 = this.f23027g0;
            int i11 = this.f23028h0;
            this.f23021c.getVideoRotation();
            this.v.f(this.f23026f0, false, i10, i11, this.I);
            this.f23033r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        xf0 xf0Var = this.f23021c;
        if (xf0Var != null) {
            float f11 = i10 * f7;
            this.f23027g0 = (int) f11;
            this.f23028h0 = i11;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / i11;
            }
            xf0Var.a(f10, 0);
            if (this.T) {
                this.v.c(f10);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.M = true;
        this.L = System.currentTimeMillis();
        this.f23026f0.invalidate();
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
