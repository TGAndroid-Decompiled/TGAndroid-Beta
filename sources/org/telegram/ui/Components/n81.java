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
public final class n81 extends ViewGroup implements t61, AudioManager.OnAudioFocusChangeListener {
    public String D;
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
    public final v61 f28725a;
    public final RadialProgressView f28726a0;
    public final g81 f28727b;
    public final ImageView f28728b0;
    public final af0 f28729c;
    public final ImageView f28730c0;
    public final TextureView d;
    public final ImageView f28731d0;
    public final ImageView e;
    public AnimatorSet f28732e0;
    public final ViewGroup f28733f;
    public final j81 f28734f0;
    public int f28735g0;
    public Bitmap h;
    public int f28736h0;
    public final f81 f28737i0;
    public final li.e f28738j0;
    public final f81 f28739k0;
    public TextureView f28740n;
    public int f28741r;
    public boolean f28742s;
    public final k81 f28743w;
    public boolean f28744x;
    public String f28745y;
    public static final Pattern f28711l0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f28712n0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f28713o0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f28714p0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f28715q0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f28716r0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f28717s0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f28718t0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f28719u0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f28720v0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f28721w0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f28722x0 = Pattern.compile("var\\s");
    public static final Pattern f28723y0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f28724z0 = Pattern.compile("[()]");
    public static final Pattern A0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public n81(Context context, boolean z10, k81 k81Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.f28737i0 = new f81(this, 0);
        this.f28738j0 = new li.e(this, 5);
        this.f28739k0 = new f81(this, 1);
        setWillNotDraw(false);
        this.f28743w = k81Var;
        paint.setColor(-16777216);
        af0 af0Var = new af0(this, context, 1);
        this.f28729c = af0Var;
        addView(af0Var, w7.b6.e(-1, -1, 17));
        g81 g81Var = new g81(context, context);
        this.f28727b = g81Var;
        final px pxVar = new px(this, 28);
        g81Var.addJavascriptInterface(new Object(pxVar) {
            public final px f24257a;

            {
                this.f24257a = pxVar;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                n81 n81Var = (n81) this.f24257a.f29561b;
                AsyncTask asyncTask = n81Var.R;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = n81Var.R;
                    if (asyncTask2 instanceof m81) {
                        m81 m81Var = (m81) asyncTask2;
                        String[] strArr = m81Var.f28416c;
                        String str2 = strArr[0];
                        String str3 = m81Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        m81Var.f28415b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = g81Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = k81Var.g();
        this.f28733f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            af0Var.addView(textureView, w7.b6.e(-1, -1, 17));
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
        v61 v61Var = new v61();
        this.f28725a = v61Var;
        v61Var.J = this;
        v61Var.A0(textureView);
        j81 j81Var = new j81(this, context);
        this.f28734f0 = j81Var;
        if (g10 != null) {
            g10.addView(j81Var);
        } else {
            addView(j81Var, w7.b6.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f28726a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, w7.b6.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f28728b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        j81Var.addView(imageView2, w7.b6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final n81 f25773b;

            {
                this.f25773b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        n81 n81Var = this.f25773b;
                        if (n81Var.f28744x && !n81Var.S && !n81Var.W && n81Var.M) {
                            n81Var.T = !n81Var.T;
                            n81Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        n81 n81Var2 = this.f25773b;
                        v61 v61Var2 = n81Var2.f28725a;
                        if (n81Var2.f28744x && n81Var2.f28745y != null) {
                            if (v61Var2.d == null) {
                                n81Var2.i();
                            }
                            if (v61Var2.d0()) {
                                v61Var2.g0();
                            } else {
                                n81Var2.V = false;
                                v61Var2.h0();
                            }
                            n81Var2.n();
                            return;
                        }
                        return;
                    default:
                        n81 n81Var3 = this.f25773b;
                        ViewGroup viewGroup = n81Var3.f28733f;
                        boolean z11 = n81Var3.I;
                        k81 k81Var2 = n81Var3.f28743w;
                        j81 j81Var2 = n81Var3.f28734f0;
                        af0 af0Var2 = n81Var3.f28729c;
                        TextureView textureView2 = n81Var3.d;
                        if (textureView2 != null && k81Var2.h() && !n81Var3.S && !n81Var3.W && n81Var3.M) {
                            n81Var3.W = true;
                            if (!n81Var3.U) {
                                n81Var3.T = false;
                                k81Var2.i(true, n81Var3.f28739k0, af0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) af0Var2.getParent();
                            if (viewGroup2 != n81Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(af0Var2);
                                }
                                n81Var3.addView(af0Var2, 0, w7.b6.e(-1, -1, 17));
                                af0Var2.measure(View.MeasureSpec.makeMeasureSpec(n81Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(n81Var3.getMeasuredHeight() - org.telegram.messenger.i0.L(10.0f), 1073741824));
                            }
                            Bitmap bitmap = n81Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                n81Var3.h = null;
                            }
                            n81Var3.S = true;
                            n81Var3.U = false;
                            n81Var3.n();
                            n81Var3.o();
                            n81Var3.k();
                            n81Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                af0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) j81Var2.getParent();
                            if (viewGroup3 != n81Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(j81Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(j81Var2);
                                } else {
                                    n81Var3.addView(j81Var2, 1);
                                }
                            }
                            j81Var2.d(false, false);
                            k81Var2.i(false, null, af0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f28730c0 = imageView3;
        imageView3.setScaleType(scaleType);
        j81Var.addView(imageView3, w7.b6.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final n81 f25773b;

            {
                this.f25773b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        n81 n81Var = this.f25773b;
                        if (n81Var.f28744x && !n81Var.S && !n81Var.W && n81Var.M) {
                            n81Var.T = !n81Var.T;
                            n81Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        n81 n81Var2 = this.f25773b;
                        v61 v61Var2 = n81Var2.f28725a;
                        if (n81Var2.f28744x && n81Var2.f28745y != null) {
                            if (v61Var2.d == null) {
                                n81Var2.i();
                            }
                            if (v61Var2.d0()) {
                                v61Var2.g0();
                            } else {
                                n81Var2.V = false;
                                v61Var2.h0();
                            }
                            n81Var2.n();
                            return;
                        }
                        return;
                    default:
                        n81 n81Var3 = this.f25773b;
                        ViewGroup viewGroup = n81Var3.f28733f;
                        boolean z11 = n81Var3.I;
                        k81 k81Var2 = n81Var3.f28743w;
                        j81 j81Var2 = n81Var3.f28734f0;
                        af0 af0Var2 = n81Var3.f28729c;
                        TextureView textureView2 = n81Var3.d;
                        if (textureView2 != null && k81Var2.h() && !n81Var3.S && !n81Var3.W && n81Var3.M) {
                            n81Var3.W = true;
                            if (!n81Var3.U) {
                                n81Var3.T = false;
                                k81Var2.i(true, n81Var3.f28739k0, af0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) af0Var2.getParent();
                            if (viewGroup2 != n81Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(af0Var2);
                                }
                                n81Var3.addView(af0Var2, 0, w7.b6.e(-1, -1, 17));
                                af0Var2.measure(View.MeasureSpec.makeMeasureSpec(n81Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(n81Var3.getMeasuredHeight() - org.telegram.messenger.i0.L(10.0f), 1073741824));
                            }
                            Bitmap bitmap = n81Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                n81Var3.h = null;
                            }
                            n81Var3.S = true;
                            n81Var3.U = false;
                            n81Var3.n();
                            n81Var3.o();
                            n81Var3.k();
                            n81Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                af0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) j81Var2.getParent();
                            if (viewGroup3 != n81Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(j81Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(j81Var2);
                                } else {
                                    n81Var3.addView(j81Var2, 1);
                                }
                            }
                            j81Var2.d(false, false);
                            k81Var2.i(false, null, af0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f28731d0 = imageView4;
            imageView4.setScaleType(scaleType);
            j81Var.addView(imageView4, w7.b6.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final n81 f25773b;

                {
                    this.f25773b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            n81 n81Var = this.f25773b;
                            if (n81Var.f28744x && !n81Var.S && !n81Var.W && n81Var.M) {
                                n81Var.T = !n81Var.T;
                                n81Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            n81 n81Var2 = this.f25773b;
                            v61 v61Var2 = n81Var2.f28725a;
                            if (n81Var2.f28744x && n81Var2.f28745y != null) {
                                if (v61Var2.d == null) {
                                    n81Var2.i();
                                }
                                if (v61Var2.d0()) {
                                    v61Var2.g0();
                                } else {
                                    n81Var2.V = false;
                                    v61Var2.h0();
                                }
                                n81Var2.n();
                                return;
                            }
                            return;
                        default:
                            n81 n81Var3 = this.f25773b;
                            ViewGroup viewGroup = n81Var3.f28733f;
                            boolean z11 = n81Var3.I;
                            k81 k81Var2 = n81Var3.f28743w;
                            j81 j81Var2 = n81Var3.f28734f0;
                            af0 af0Var2 = n81Var3.f28729c;
                            TextureView textureView2 = n81Var3.d;
                            if (textureView2 != null && k81Var2.h() && !n81Var3.S && !n81Var3.W && n81Var3.M) {
                                n81Var3.W = true;
                                if (!n81Var3.U) {
                                    n81Var3.T = false;
                                    k81Var2.i(true, n81Var3.f28739k0, af0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) af0Var2.getParent();
                                if (viewGroup2 != n81Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(af0Var2);
                                    }
                                    n81Var3.addView(af0Var2, 0, w7.b6.e(-1, -1, 17));
                                    af0Var2.measure(View.MeasureSpec.makeMeasureSpec(n81Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(n81Var3.getMeasuredHeight() - org.telegram.messenger.i0.L(10.0f), 1073741824));
                                }
                                Bitmap bitmap = n81Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    n81Var3.h = null;
                                }
                                n81Var3.S = true;
                                n81Var3.U = false;
                                n81Var3.n();
                                n81Var3.o();
                                n81Var3.k();
                                n81Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    af0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) j81Var2.getParent();
                                if (viewGroup3 != n81Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(j81Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(j81Var2);
                                    } else {
                                        n81Var3.addView(j81Var2, 1);
                                    }
                                }
                                j81Var2.d(false, false);
                                k81Var2.i(false, null, af0Var2.getAspectRatio(), z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n81.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n81.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f28712n0.matcher(str);
                if (matcher.find()) {
                    str2 = matcher.group(1);
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    return str2;
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return null;
            }
        }
        return null;
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f28711l0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f28734f0;
    }

    private View getProgressView() {
        return this.f28726a0;
    }

    public final void b() {
        this.f28725a.m0();
        AsyncTask asyncTask = this.R;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.R = null;
        }
        this.f28727b.stopLoading();
    }

    public final boolean f() {
        if (!this.U && !this.W) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r28, org.telegram.tgnet.TLRPC.Photo r29, java.lang.Object r30, java.lang.String r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n81.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f28729c;
    }

    public View getControlsView() {
        return this.f28734f0;
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
        j81 j81Var = this.f28734f0;
        if (j81Var.getParent() != this) {
            j81Var.setVisibility(8);
        }
        this.f28743w.d();
    }

    public final void i() {
        String str = this.f28745y;
        if (str != null) {
            String str2 = this.E;
            v61 v61Var = this.f28725a;
            if (str2 != null) {
                v61Var.l0(Uri.parse(str), this.D, Uri.parse(this.E), this.F);
            } else {
                v61Var.j0(Uri.parse(str), this.D);
            }
            v61Var.u0(this.f28742s);
            int i10 = (v61Var.U() > (-9223372036854775807L) ? 1 : (v61Var.U() == (-9223372036854775807L) ? 0 : -1));
            j81 j81Var = this.f28734f0;
            if (i10 != 0) {
                j81Var.b((int) (v61Var.U() / 1000));
            } else {
                j81Var.b(0);
            }
            k();
            o();
            m();
            j81Var.invalidate();
            int i11 = this.O;
            if (i11 != -1) {
                v61Var.q0(i11 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f7 = 0.0f;
        RadialProgressView radialProgressView = this.f28726a0;
        if (z11) {
            AnimatorSet animatorSet = this.f28732e0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f28732e0 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f7));
            this.f28732e0.setDuration(150L);
            this.f28732e0.addListener(new q11(this, 8));
            this.f28732e0.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        radialProgressView.setAlpha(f7);
    }

    public final void k() {
        i2.i0 i0Var = this.f28725a.d;
        ImageView imageView = this.f28728b0;
        if (i0Var != null && !this.U) {
            imageView.setVisibility(0);
            if (!this.T) {
                imageView.setImageResource(2131231274);
                imageView.setLayoutParams(w7.b6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
                return;
            }
            imageView.setImageResource(2131231451);
            imageView.setLayoutParams(w7.b6.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
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
        ViewGroup viewGroup2 = this.f28733f;
        af0 af0Var = this.f28729c;
        if (viewGroup2 == null) {
            this.S = true;
            if (!this.T) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    af0Var.addView(textureView);
                }
            }
            boolean z11 = this.T;
            j81 j81Var = this.f28734f0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) j81Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(j81Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) j81Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(j81Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(j81Var);
                    } else {
                        addView(j81Var, 1);
                    }
                }
            }
            TextureView a2 = this.f28743w.a(this.f28734f0, this.T, af0Var.getAspectRatio(), af0Var.getVideoRotation(), z10);
            this.f28740n = a2;
            a2.setVisibility(4);
            if (this.T && this.f28740n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i10 = j81.I;
            j81Var.a();
            return;
        }
        if (this.T) {
            ViewGroup viewGroup5 = (ViewGroup) af0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(af0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) af0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(af0Var);
                }
                addView(af0Var, 0);
            }
        }
        this.f28743w.a(this.f28734f0, this.T, af0Var.getAspectRatio(), af0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i10;
        int i11;
        ImageView imageView = this.f28731d0;
        if (imageView == null) {
            return;
        }
        if (this.U) {
            i10 = 2131231275;
        } else {
            i10 = 2131231452;
        }
        imageView.setImageResource(i10);
        if (this.f28725a.d != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView.setVisibility(i11);
        if (this.U) {
            imageView.setLayoutParams(w7.b6.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(w7.b6.e(56, 50, 53));
        }
    }

    public final void n() {
        int i10;
        int i11;
        int i12;
        j81 j81Var = this.f28734f0;
        int i13 = j81.I;
        j81Var.a();
        org.telegram.messenger.i0.r(this.f28737i0);
        if (!this.f28725a.d0()) {
            if (this.V) {
                ImageView imageView = this.f28730c0;
                if (this.U) {
                    i12 = 2131231253;
                } else {
                    i12 = 2131231252;
                }
                imageView.setImageResource(i12);
                return;
            }
            ImageView imageView2 = this.f28730c0;
            if (this.U) {
                i11 = 2131231457;
            } else {
                i11 = 2131231455;
            }
            imageView2.setImageResource(i11);
            return;
        }
        ImageView imageView3 = this.f28730c0;
        if (this.U) {
            i10 = 2131231454;
        } else {
            i10 = 2131231453;
        }
        imageView3.setImageResource(i10);
        org.telegram.messenger.i0.h3(this.f28737i0, 500L);
        if (!this.J) {
            this.J = true;
            ((AudioManager) org.telegram.messenger.w0.f18945b.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        org.telegram.messenger.i0.g3(new qq(this, i10, 7));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.i0.L(10.0f), this.Q);
    }

    @Override
    public final void onError(v61 v61Var, Exception exc) {
        org.telegram.messenger.f8.g(exc, true);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        af0 af0Var = this.f28729c;
        int measuredWidth = (i14 - af0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int L = ((i15 - org.telegram.messenger.i0.L(10.0f)) - af0Var.getMeasuredHeight()) / 2;
        af0Var.layout(measuredWidth, L, af0Var.getMeasuredWidth() + measuredWidth, af0Var.getMeasuredHeight() + L);
        j81 j81Var = this.f28734f0;
        if (j81Var.getParent() == this) {
            j81Var.layout(0, 0, j81Var.getMeasuredWidth(), j81Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f28726a0;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        j81Var.f27311a.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.i0.L(10.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f28729c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - org.telegram.messenger.i0.L(10.0f), 1073741824));
        j81 j81Var = this.f28734f0;
        if (j81Var.getParent() == this) {
            j81Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f28726a0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        j81 j81Var = this.f28734f0;
        v61 v61Var = this.f28725a;
        if (i10 != 2) {
            if (v61Var.U() != -9223372036854775807L) {
                j81Var.b((int) (v61Var.U() / 1000));
            } else {
                j81Var.b(0);
            }
        }
        k81 k81Var = this.f28743w;
        if (i10 != 4 && i10 != 1 && v61Var.d0()) {
            k81Var.e(this, true);
        } else {
            k81Var.e(this, false);
        }
        if (v61Var.d0() && i10 != 4) {
            n();
        } else if (i10 == 4) {
            this.V = true;
            v61Var.g0();
            v61Var.q0(0L, false);
            n();
            j81Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.S) {
            this.S = false;
            if (this.T || this.U) {
                if (this.U) {
                    this.f28741r = 1;
                }
                this.f28740n.setSurfaceTexture(surfaceTexture);
                this.f28740n.setSurfaceTextureListener(this.f28738j0);
                this.f28740n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f28741r == 2) {
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
            int i10 = this.f28735g0;
            int i11 = this.f28736h0;
            this.f28729c.getVideoRotation();
            this.f28743w.f(this.f28734f0, false, i10, i11, this.I);
            this.f28741r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        af0 af0Var = this.f28729c;
        if (af0Var != null) {
            float f11 = i10 * f7;
            this.f28735g0 = (int) f11;
            this.f28736h0 = i11;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / i11;
            }
            af0Var.a(f10, 0);
            if (this.T) {
                this.f28743w.c(f10);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.M = true;
        this.L = System.currentTimeMillis();
        this.f28734f0.invalidate();
    }

    @Override
    public final void onSeekFinished(j2.a aVar) {
    }

    @Override
    public final void onSeekStarted(j2.a aVar) {
    }

    public final void o() {
    }
}
