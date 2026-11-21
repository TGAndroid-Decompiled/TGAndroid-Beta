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
public final class z71 extends ViewGroup implements g61, AudioManager.OnAudioFocusChangeListener {
    public String E;
    public String F;
    public String G;
    public String H;
    public boolean I;
    public final boolean J;
    public boolean K;
    public boolean L;
    public long M;
    public boolean N;
    public float O;
    public int P;
    public boolean Q;
    public final Paint R;
    public AsyncTask S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final i61 f42706a;
    public boolean f42707a0;
    public final s71 f42708b;
    public final RadialProgressView f42709b0;
    public final ue0 f42710c;
    public final ImageView f42711c0;
    public final TextureView d;
    public final ImageView f42712d0;
    public final ImageView f42713e;
    public final ImageView f42714e0;
    public final ViewGroup f42715f;
    public AnimatorSet f42716f0;
    public final v71 f42717g0;
    public Bitmap h;
    public int f42718h0;
    public int f42719i0;
    public final r71 f42720j0;
    public final k40 f42721k0;
    public final r71 f42722l0;
    public TextureView f42723n;
    public int f42724r;
    public boolean f42725s;
    public final w71 f42726w;
    public boolean f42727x;
    public String f42728y;
    public static final Pattern m0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern f42693n0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f42694o0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f42695p0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f42696q0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f42697r0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f42698s0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f42699t0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f42700u0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f42701v0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f42702w0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f42703x0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f42704y0 = Pattern.compile("var\\s");
    public static final Pattern f42705z0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern A0 = Pattern.compile("[()]");
    public static final Pattern B0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public z71(Context context, boolean z10, w71 w71Var) {
        super(context);
        this.J = true;
        Paint paint = new Paint();
        this.R = paint;
        this.f42720j0 = new r71(this, 0);
        this.f42721k0 = new k40(this, 2);
        this.f42722l0 = new r71(this, 1);
        setWillNotDraw(false);
        this.f42726w = w71Var;
        paint.setColor(-16777216);
        ue0 ue0Var = new ue0(1, context, this);
        this.f42710c = ue0Var;
        addView(ue0Var, c8.ma.e(-1, -1, 17));
        s71 s71Var = new s71(context, context);
        this.f42708b = s71Var;
        final ky kyVar = new ky(this, 27);
        s71Var.addJavascriptInterface(new Object(kyVar) {
            public final ky f33225a;

            {
                this.f33225a = kyVar;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                z71 z71Var = (z71) this.f33225a.f37035b;
                AsyncTask asyncTask = z71Var.S;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = z71Var.S;
                    if (asyncTask2 instanceof y71) {
                        y71 y71Var = (y71) asyncTask2;
                        String[] strArr = y71Var.f42346c;
                        String str2 = strArr[0];
                        String str3 = y71Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        y71Var.f42345b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = s71Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = w71Var.g();
        this.f42715f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            ue0Var.addView(textureView, c8.ma.e(-1, -1, 17));
        }
        if (g10 != null) {
            ImageView imageView = new ImageView(context);
            this.f42713e = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            g10.addView(imageView);
        }
        i61 i61Var = new i61();
        this.f42706a = i61Var;
        i61Var.K = this;
        i61Var.A0(textureView);
        v71 v71Var = new v71(this, context);
        this.f42717g0 = v71Var;
        if (g10 != null) {
            g10.addView(v71Var);
        } else {
            addView(v71Var, c8.ma.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f42709b0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, c8.ma.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f42711c0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        v71Var.addView(imageView2, c8.ma.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final z71 f38812b;

            {
                this.f38812b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        z71 z71Var = this.f38812b;
                        if (z71Var.f42727x && !z71Var.T && !z71Var.f42707a0 && z71Var.N) {
                            z71Var.U = !z71Var.U;
                            z71Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        z71 z71Var2 = this.f38812b;
                        i61 i61Var2 = z71Var2.f42706a;
                        if (z71Var2.f42727x && z71Var2.f42728y != null) {
                            if (i61Var2.d == null) {
                                z71Var2.i();
                            }
                            if (i61Var2.d0()) {
                                i61Var2.g0();
                            } else {
                                z71Var2.W = false;
                                i61Var2.h0();
                            }
                            z71Var2.n();
                            return;
                        }
                        return;
                    default:
                        z71 z71Var3 = this.f38812b;
                        ViewGroup viewGroup = z71Var3.f42715f;
                        boolean z11 = z71Var3.J;
                        w71 w71Var2 = z71Var3.f42726w;
                        v71 v71Var2 = z71Var3.f42717g0;
                        ue0 ue0Var2 = z71Var3.f42710c;
                        TextureView textureView2 = z71Var3.d;
                        if (textureView2 != null && w71Var2.h() && !z71Var3.T && !z71Var3.f42707a0 && z71Var3.N) {
                            z71Var3.f42707a0 = true;
                            if (!z71Var3.V) {
                                z71Var3.U = false;
                                w71Var2.i(true, z71Var3.f42722l0, ue0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) ue0Var2.getParent();
                            if (viewGroup2 != z71Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(ue0Var2);
                                }
                                z71Var3.addView(ue0Var2, 0, c8.ma.e(-1, -1, 17));
                                ue0Var2.measure(View.MeasureSpec.makeMeasureSpec(z71Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(z71Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), 1073741824));
                            }
                            Bitmap bitmap = z71Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                z71Var3.h = null;
                            }
                            z71Var3.T = true;
                            z71Var3.V = false;
                            z71Var3.n();
                            z71Var3.o();
                            z71Var3.k();
                            z71Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                ue0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) v71Var2.getParent();
                            if (viewGroup3 != z71Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(v71Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(v71Var2);
                                } else {
                                    z71Var3.addView(v71Var2, 1);
                                }
                            }
                            v71Var2.d(false, false);
                            w71Var2.i(false, null, ue0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f42712d0 = imageView3;
        imageView3.setScaleType(scaleType);
        v71Var.addView(imageView3, c8.ma.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final z71 f38812b;

            {
                this.f38812b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        z71 z71Var = this.f38812b;
                        if (z71Var.f42727x && !z71Var.T && !z71Var.f42707a0 && z71Var.N) {
                            z71Var.U = !z71Var.U;
                            z71Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        z71 z71Var2 = this.f38812b;
                        i61 i61Var2 = z71Var2.f42706a;
                        if (z71Var2.f42727x && z71Var2.f42728y != null) {
                            if (i61Var2.d == null) {
                                z71Var2.i();
                            }
                            if (i61Var2.d0()) {
                                i61Var2.g0();
                            } else {
                                z71Var2.W = false;
                                i61Var2.h0();
                            }
                            z71Var2.n();
                            return;
                        }
                        return;
                    default:
                        z71 z71Var3 = this.f38812b;
                        ViewGroup viewGroup = z71Var3.f42715f;
                        boolean z11 = z71Var3.J;
                        w71 w71Var2 = z71Var3.f42726w;
                        v71 v71Var2 = z71Var3.f42717g0;
                        ue0 ue0Var2 = z71Var3.f42710c;
                        TextureView textureView2 = z71Var3.d;
                        if (textureView2 != null && w71Var2.h() && !z71Var3.T && !z71Var3.f42707a0 && z71Var3.N) {
                            z71Var3.f42707a0 = true;
                            if (!z71Var3.V) {
                                z71Var3.U = false;
                                w71Var2.i(true, z71Var3.f42722l0, ue0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) ue0Var2.getParent();
                            if (viewGroup2 != z71Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(ue0Var2);
                                }
                                z71Var3.addView(ue0Var2, 0, c8.ma.e(-1, -1, 17));
                                ue0Var2.measure(View.MeasureSpec.makeMeasureSpec(z71Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(z71Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), 1073741824));
                            }
                            Bitmap bitmap = z71Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                z71Var3.h = null;
                            }
                            z71Var3.T = true;
                            z71Var3.V = false;
                            z71Var3.n();
                            z71Var3.o();
                            z71Var3.k();
                            z71Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                ue0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) v71Var2.getParent();
                            if (viewGroup3 != z71Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(v71Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(v71Var2);
                                } else {
                                    z71Var3.addView(v71Var2, 1);
                                }
                            }
                            v71Var2.d(false, false);
                            w71Var2.i(false, null, ue0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f42714e0 = imageView4;
            imageView4.setScaleType(scaleType);
            v71Var.addView(imageView4, c8.ma.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final z71 f38812b;

                {
                    this.f38812b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            z71 z71Var = this.f38812b;
                            if (z71Var.f42727x && !z71Var.T && !z71Var.f42707a0 && z71Var.N) {
                                z71Var.U = !z71Var.U;
                                z71Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            z71 z71Var2 = this.f38812b;
                            i61 i61Var2 = z71Var2.f42706a;
                            if (z71Var2.f42727x && z71Var2.f42728y != null) {
                                if (i61Var2.d == null) {
                                    z71Var2.i();
                                }
                                if (i61Var2.d0()) {
                                    i61Var2.g0();
                                } else {
                                    z71Var2.W = false;
                                    i61Var2.h0();
                                }
                                z71Var2.n();
                                return;
                            }
                            return;
                        default:
                            z71 z71Var3 = this.f38812b;
                            ViewGroup viewGroup = z71Var3.f42715f;
                            boolean z11 = z71Var3.J;
                            w71 w71Var2 = z71Var3.f42726w;
                            v71 v71Var2 = z71Var3.f42717g0;
                            ue0 ue0Var2 = z71Var3.f42710c;
                            TextureView textureView2 = z71Var3.d;
                            if (textureView2 != null && w71Var2.h() && !z71Var3.T && !z71Var3.f42707a0 && z71Var3.N) {
                                z71Var3.f42707a0 = true;
                                if (!z71Var3.V) {
                                    z71Var3.U = false;
                                    w71Var2.i(true, z71Var3.f42722l0, ue0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) ue0Var2.getParent();
                                if (viewGroup2 != z71Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(ue0Var2);
                                    }
                                    z71Var3.addView(ue0Var2, 0, c8.ma.e(-1, -1, 17));
                                    ue0Var2.measure(View.MeasureSpec.makeMeasureSpec(z71Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(z71Var3.getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), 1073741824));
                                }
                                Bitmap bitmap = z71Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    z71Var3.h = null;
                                }
                                z71Var3.T = true;
                                z71Var3.V = false;
                                z71Var3.n();
                                z71Var3.o();
                                z71Var3.k();
                                z71Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    ue0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) v71Var2.getParent();
                                if (viewGroup3 != z71Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(v71Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(v71Var2);
                                    } else {
                                        z71Var3.addView(v71Var2, 1);
                                    }
                                }
                                v71Var2.d(false, false);
                                w71Var2.i(false, null, ue0Var2.getAspectRatio(), z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z71.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z71.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f42694o0.matcher(str);
                if (matcher.find()) {
                    str2 = matcher.group(1);
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    return str2;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return null;
            }
        }
        return null;
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = m0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f42717g0;
    }

    private View getProgressView() {
        return this.f42709b0;
    }

    public final void b() {
        this.f42706a.m0();
        AsyncTask asyncTask = this.S;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.S = null;
        }
        this.f42708b.stopLoading();
    }

    public final boolean f() {
        if (!this.V && !this.f42707a0) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r28, org.telegram.tgnet.TLRPC.Photo r29, java.lang.Object r30, java.lang.String r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z71.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f42710c;
    }

    public View getControlsView() {
        return this.f42717g0;
    }

    public ImageView getTextureImageView() {
        return this.f42713e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.H;
    }

    public final void h() {
        v71 v71Var = this.f42717g0;
        if (v71Var.getParent() != this) {
            v71Var.setVisibility(8);
        }
        this.f42726w.d();
    }

    public final void i() {
        String str = this.f42728y;
        if (str != null) {
            String str2 = this.F;
            i61 i61Var = this.f42706a;
            if (str2 != null) {
                i61Var.l0(Uri.parse(str), this.E, Uri.parse(this.F), this.G);
            } else {
                i61Var.j0(Uri.parse(str), this.E);
            }
            i61Var.u0(this.f42725s);
            int i7 = (i61Var.U() > (-9223372036854775807L) ? 1 : (i61Var.U() == (-9223372036854775807L) ? 0 : -1));
            v71 v71Var = this.f42717g0;
            if (i7 != 0) {
                v71Var.b((int) (i61Var.U() / 1000));
            } else {
                v71Var.b(0);
            }
            k();
            o();
            m();
            v71Var.invalidate();
            int i10 = this.P;
            if (i10 != -1) {
                i61Var.q0(i10 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f10 = 0.0f;
        RadialProgressView radialProgressView = this.f42709b0;
        if (z11) {
            AnimatorSet animatorSet = this.f42716f0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f42716f0 = animatorSet2;
            if (z10) {
                f10 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f10));
            this.f42716f0.setDuration(150L);
            this.f42716f0.addListener(new u11(this, 7));
            this.f42716f0.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        radialProgressView.setAlpha(f10);
    }

    public final void k() {
        l2.f0 f0Var = this.f42706a.d;
        ImageView imageView = this.f42711c0;
        if (f0Var != null && !this.V) {
            imageView.setVisibility(0);
            if (!this.U) {
                imageView.setImageResource(2131231273);
                imageView.setLayoutParams(c8.ma.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
                return;
            }
            imageView.setImageResource(2131231450);
            imageView.setLayoutParams(c8.ma.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
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
        ViewGroup viewGroup2 = this.f42715f;
        ue0 ue0Var = this.f42710c;
        if (viewGroup2 == null) {
            this.T = true;
            if (!this.U) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    ue0Var.addView(textureView);
                }
            }
            boolean z11 = this.U;
            v71 v71Var = this.f42717g0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) v71Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(v71Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) v71Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(v71Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(v71Var);
                    } else {
                        addView(v71Var, 1);
                    }
                }
            }
            TextureView a10 = this.f42726w.a(this.f42717g0, this.U, ue0Var.getAspectRatio(), ue0Var.getVideoRotation(), z10);
            this.f42723n = a10;
            a10.setVisibility(4);
            if (this.U && this.f42723n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i7 = v71.J;
            v71Var.a();
            return;
        }
        if (this.U) {
            ViewGroup viewGroup5 = (ViewGroup) ue0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(ue0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) ue0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(ue0Var);
                }
                addView(ue0Var, 0);
            }
        }
        this.f42726w.a(this.f42717g0, this.U, ue0Var.getAspectRatio(), ue0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i7;
        int i10;
        ImageView imageView = this.f42714e0;
        if (imageView == null) {
            return;
        }
        if (this.V) {
            i7 = 2131231274;
        } else {
            i7 = 2131231451;
        }
        imageView.setImageResource(i7);
        if (this.f42706a.d != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        if (this.V) {
            imageView.setLayoutParams(c8.ma.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(c8.ma.e(56, 50, 53));
        }
    }

    public final void n() {
        int i7;
        int i10;
        int i11;
        v71 v71Var = this.f42717g0;
        int i12 = v71.J;
        v71Var.a();
        org.telegram.messenger.g0.r(this.f42720j0);
        if (!this.f42706a.d0()) {
            if (this.W) {
                ImageView imageView = this.f42712d0;
                if (this.V) {
                    i11 = 2131231252;
                } else {
                    i11 = 2131231251;
                }
                imageView.setImageResource(i11);
                return;
            }
            ImageView imageView2 = this.f42712d0;
            if (this.V) {
                i10 = 2131231456;
            } else {
                i10 = 2131231454;
            }
            imageView2.setImageResource(i10);
            return;
        }
        ImageView imageView3 = this.f42712d0;
        if (this.V) {
            i7 = 2131231453;
        } else {
            i7 = 2131231452;
        }
        imageView3.setImageResource(i7);
        org.telegram.messenger.g0.h3(this.f42720j0, 500L);
        if (!this.K) {
            this.K = true;
            ((AudioManager) org.telegram.messenger.t0.f26941b.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i7) {
        org.telegram.messenger.g0.g3(new org.telegram.ui.ii(this, i7, 18));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), this.R);
    }

    @Override
    public final void onError(i61 i61Var, Exception exc) {
        org.telegram.messenger.a8.g(exc, true);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        ue0 ue0Var = this.f42710c;
        int measuredWidth = (i13 - ue0Var.getMeasuredWidth()) / 2;
        int i14 = i12 - i10;
        int L = ((i14 - org.telegram.messenger.g0.L(10.0f)) - ue0Var.getMeasuredHeight()) / 2;
        ue0Var.layout(measuredWidth, L, ue0Var.getMeasuredWidth() + measuredWidth, ue0Var.getMeasuredHeight() + L);
        v71 v71Var = this.f42717g0;
        if (v71Var.getParent() == this) {
            v71Var.layout(0, 0, v71Var.getMeasuredWidth(), v71Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f42709b0;
        int measuredWidth2 = (i13 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i14 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        v71Var.f40706a.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        this.f42710c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - org.telegram.messenger.g0.L(10.0f), 1073741824));
        v71 v71Var = this.f42717g0;
        if (v71Var.getParent() == this) {
            v71Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f42709b0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i7) {
        v71 v71Var = this.f42717g0;
        i61 i61Var = this.f42706a;
        if (i7 != 2) {
            if (i61Var.U() != -9223372036854775807L) {
                v71Var.b((int) (i61Var.U() / 1000));
            } else {
                v71Var.b(0);
            }
        }
        w71 w71Var = this.f42726w;
        if (i7 != 4 && i7 != 1 && i61Var.d0()) {
            w71Var.e(this, true);
        } else {
            w71Var.e(this, false);
        }
        if (i61Var.d0() && i7 != 4) {
            n();
        } else if (i7 == 4) {
            this.W = true;
            i61Var.g0();
            i61Var.q0(0L, false);
            n();
            v71Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.T) {
            this.T = false;
            if (this.U || this.V) {
                if (this.V) {
                    this.f42724r = 1;
                }
                this.f42723n.setSurfaceTexture(surfaceTexture);
                this.f42723n.setSurfaceTextureListener(this.f42721k0);
                this.f42723n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f42724r == 2) {
            ImageView imageView = this.f42713e;
            if (imageView != null) {
                imageView.setVisibility(4);
                imageView.setImageDrawable(null);
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.h = null;
                }
            }
            this.f42707a0 = false;
            int i7 = this.f42718h0;
            int i10 = this.f42719i0;
            this.f42710c.getVideoRotation();
            this.f42726w.f(this.f42717g0, false, i7, i10, this.J);
            this.f42724r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        float f11;
        ue0 ue0Var = this.f42710c;
        if (ue0Var != null) {
            float f12 = i7 * f10;
            this.f42718h0 = (int) f12;
            this.f42719i0 = i10;
            if (i10 == 0) {
                f11 = 1.0f;
            } else {
                f11 = f12 / i10;
            }
            ue0Var.a(f11, 0);
            if (this.U) {
                this.f42726w.c(f11);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.N = true;
        this.M = System.currentTimeMillis();
        this.f42717g0.invalidate();
    }

    @Override
    public final void onSeekFinished(m2.a aVar) {
    }

    @Override
    public final void onSeekStarted(m2.a aVar) {
    }

    public final void o() {
    }
}
