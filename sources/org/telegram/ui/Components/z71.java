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
    public final i61 f42667a;
    public boolean f42668a0;
    public final s71 f42669b;
    public final RadialProgressView f42670b0;
    public final ue0 f42671c;
    public final ImageView f42672c0;
    public final TextureView d;
    public final ImageView f42673d0;
    public final ImageView f42674e;
    public final ImageView f42675e0;
    public final ViewGroup f42676f;
    public AnimatorSet f42677f0;
    public final v71 f42678g0;
    public Bitmap h;
    public int f42679h0;
    public int f42680i0;
    public final r71 f42681j0;
    public final k40 f42682k0;
    public final r71 f42683l0;
    public TextureView f42684n;
    public int f42685r;
    public boolean f42686s;
    public final w71 f42687w;
    public boolean f42688x;
    public String f42689y;
    public static final Pattern m0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern f42654n0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f42655o0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f42656p0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f42657q0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f42658r0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f42659s0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f42660t0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f42661u0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f42662v0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f42663w0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f42664x0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f42665y0 = Pattern.compile("var\\s");
    public static final Pattern f42666z0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern A0 = Pattern.compile("[()]");
    public static final Pattern B0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public z71(Context context, boolean z10, w71 w71Var) {
        super(context);
        this.J = true;
        Paint paint = new Paint();
        this.R = paint;
        this.f42681j0 = new r71(this, 0);
        this.f42682k0 = new k40(this, 2);
        this.f42683l0 = new r71(this, 1);
        setWillNotDraw(false);
        this.f42687w = w71Var;
        paint.setColor(-16777216);
        ue0 ue0Var = new ue0(1, context, this);
        this.f42671c = ue0Var;
        addView(ue0Var, c8.na.e(-1, -1, 17));
        s71 s71Var = new s71(context, context);
        this.f42669b = s71Var;
        final ky kyVar = new ky(this, 27);
        s71Var.addJavascriptInterface(new Object(kyVar) {
            public final ky f33194a;

            {
                this.f33194a = kyVar;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                z71 z71Var = (z71) this.f33194a.f36994b;
                AsyncTask asyncTask = z71Var.S;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = z71Var.S;
                    if (asyncTask2 instanceof y71) {
                        y71 y71Var = (y71) asyncTask2;
                        String[] strArr = y71Var.f42316c;
                        String str2 = strArr[0];
                        String str3 = y71Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        y71Var.f42315b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = s71Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = w71Var.g();
        this.f42676f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            ue0Var.addView(textureView, c8.na.e(-1, -1, 17));
        }
        if (g10 != null) {
            ImageView imageView = new ImageView(context);
            this.f42674e = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            g10.addView(imageView);
        }
        i61 i61Var = new i61();
        this.f42667a = i61Var;
        i61Var.K = this;
        i61Var.A0(textureView);
        v71 v71Var = new v71(this, context);
        this.f42678g0 = v71Var;
        if (g10 != null) {
            g10.addView(v71Var);
        } else {
            addView(v71Var, c8.na.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f42670b0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, c8.na.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f42672c0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        v71Var.addView(imageView2, c8.na.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final z71 f38759b;

            {
                this.f38759b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        z71 z71Var = this.f38759b;
                        if (z71Var.f42688x && !z71Var.T && !z71Var.f42668a0 && z71Var.N) {
                            z71Var.U = !z71Var.U;
                            z71Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        z71 z71Var2 = this.f38759b;
                        i61 i61Var2 = z71Var2.f42667a;
                        if (z71Var2.f42688x && z71Var2.f42689y != null) {
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
                        z71 z71Var3 = this.f38759b;
                        ViewGroup viewGroup = z71Var3.f42676f;
                        boolean z11 = z71Var3.J;
                        w71 w71Var2 = z71Var3.f42687w;
                        v71 v71Var2 = z71Var3.f42678g0;
                        ue0 ue0Var2 = z71Var3.f42671c;
                        TextureView textureView2 = z71Var3.d;
                        if (textureView2 != null && w71Var2.h() && !z71Var3.T && !z71Var3.f42668a0 && z71Var3.N) {
                            z71Var3.f42668a0 = true;
                            if (!z71Var3.V) {
                                z71Var3.U = false;
                                w71Var2.i(true, z71Var3.f42683l0, ue0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) ue0Var2.getParent();
                            if (viewGroup2 != z71Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(ue0Var2);
                                }
                                z71Var3.addView(ue0Var2, 0, c8.na.e(-1, -1, 17));
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
        this.f42673d0 = imageView3;
        imageView3.setScaleType(scaleType);
        v71Var.addView(imageView3, c8.na.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final z71 f38759b;

            {
                this.f38759b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        z71 z71Var = this.f38759b;
                        if (z71Var.f42688x && !z71Var.T && !z71Var.f42668a0 && z71Var.N) {
                            z71Var.U = !z71Var.U;
                            z71Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        z71 z71Var2 = this.f38759b;
                        i61 i61Var2 = z71Var2.f42667a;
                        if (z71Var2.f42688x && z71Var2.f42689y != null) {
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
                        z71 z71Var3 = this.f38759b;
                        ViewGroup viewGroup = z71Var3.f42676f;
                        boolean z11 = z71Var3.J;
                        w71 w71Var2 = z71Var3.f42687w;
                        v71 v71Var2 = z71Var3.f42678g0;
                        ue0 ue0Var2 = z71Var3.f42671c;
                        TextureView textureView2 = z71Var3.d;
                        if (textureView2 != null && w71Var2.h() && !z71Var3.T && !z71Var3.f42668a0 && z71Var3.N) {
                            z71Var3.f42668a0 = true;
                            if (!z71Var3.V) {
                                z71Var3.U = false;
                                w71Var2.i(true, z71Var3.f42683l0, ue0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) ue0Var2.getParent();
                            if (viewGroup2 != z71Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(ue0Var2);
                                }
                                z71Var3.addView(ue0Var2, 0, c8.na.e(-1, -1, 17));
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
            this.f42675e0 = imageView4;
            imageView4.setScaleType(scaleType);
            v71Var.addView(imageView4, c8.na.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final z71 f38759b;

                {
                    this.f38759b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            z71 z71Var = this.f38759b;
                            if (z71Var.f42688x && !z71Var.T && !z71Var.f42668a0 && z71Var.N) {
                                z71Var.U = !z71Var.U;
                                z71Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            z71 z71Var2 = this.f38759b;
                            i61 i61Var2 = z71Var2.f42667a;
                            if (z71Var2.f42688x && z71Var2.f42689y != null) {
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
                            z71 z71Var3 = this.f38759b;
                            ViewGroup viewGroup = z71Var3.f42676f;
                            boolean z11 = z71Var3.J;
                            w71 w71Var2 = z71Var3.f42687w;
                            v71 v71Var2 = z71Var3.f42678g0;
                            ue0 ue0Var2 = z71Var3.f42671c;
                            TextureView textureView2 = z71Var3.d;
                            if (textureView2 != null && w71Var2.h() && !z71Var3.T && !z71Var3.f42668a0 && z71Var3.N) {
                                z71Var3.f42668a0 = true;
                                if (!z71Var3.V) {
                                    z71Var3.U = false;
                                    w71Var2.i(true, z71Var3.f42683l0, ue0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) ue0Var2.getParent();
                                if (viewGroup2 != z71Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(ue0Var2);
                                    }
                                    z71Var3.addView(ue0Var2, 0, c8.na.e(-1, -1, 17));
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
                Matcher matcher = f42655o0.matcher(str);
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
        return this.f42678g0;
    }

    private View getProgressView() {
        return this.f42670b0;
    }

    public final void b() {
        this.f42667a.m0();
        AsyncTask asyncTask = this.S;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.S = null;
        }
        this.f42669b.stopLoading();
    }

    public final boolean f() {
        if (!this.V && !this.f42668a0) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r28, org.telegram.tgnet.TLRPC.Photo r29, java.lang.Object r30, java.lang.String r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z71.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f42671c;
    }

    public View getControlsView() {
        return this.f42678g0;
    }

    public ImageView getTextureImageView() {
        return this.f42674e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.H;
    }

    public final void h() {
        v71 v71Var = this.f42678g0;
        if (v71Var.getParent() != this) {
            v71Var.setVisibility(8);
        }
        this.f42687w.d();
    }

    public final void i() {
        String str = this.f42689y;
        if (str != null) {
            String str2 = this.F;
            i61 i61Var = this.f42667a;
            if (str2 != null) {
                i61Var.l0(Uri.parse(str), this.E, Uri.parse(this.F), this.G);
            } else {
                i61Var.j0(Uri.parse(str), this.E);
            }
            i61Var.u0(this.f42686s);
            int i7 = (i61Var.U() > (-9223372036854775807L) ? 1 : (i61Var.U() == (-9223372036854775807L) ? 0 : -1));
            v71 v71Var = this.f42678g0;
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
        RadialProgressView radialProgressView = this.f42670b0;
        if (z11) {
            AnimatorSet animatorSet = this.f42677f0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f42677f0 = animatorSet2;
            if (z10) {
                f10 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f10));
            this.f42677f0.setDuration(150L);
            this.f42677f0.addListener(new t11(this, 7));
            this.f42677f0.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        radialProgressView.setAlpha(f10);
    }

    public final void k() {
        l2.f0 f0Var = this.f42667a.d;
        ImageView imageView = this.f42672c0;
        if (f0Var != null && !this.V) {
            imageView.setVisibility(0);
            if (!this.U) {
                imageView.setImageResource(2131231273);
                imageView.setLayoutParams(c8.na.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
                return;
            }
            imageView.setImageResource(2131231450);
            imageView.setLayoutParams(c8.na.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
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
        ViewGroup viewGroup2 = this.f42676f;
        ue0 ue0Var = this.f42671c;
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
            v71 v71Var = this.f42678g0;
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
            TextureView a10 = this.f42687w.a(this.f42678g0, this.U, ue0Var.getAspectRatio(), ue0Var.getVideoRotation(), z10);
            this.f42684n = a10;
            a10.setVisibility(4);
            if (this.U && this.f42684n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
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
        this.f42687w.a(this.f42678g0, this.U, ue0Var.getAspectRatio(), ue0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i7;
        int i10;
        ImageView imageView = this.f42675e0;
        if (imageView == null) {
            return;
        }
        if (this.V) {
            i7 = 2131231274;
        } else {
            i7 = 2131231451;
        }
        imageView.setImageResource(i7);
        if (this.f42667a.d != null) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        if (this.V) {
            imageView.setLayoutParams(c8.na.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(c8.na.e(56, 50, 53));
        }
    }

    public final void n() {
        int i7;
        int i10;
        int i11;
        v71 v71Var = this.f42678g0;
        int i12 = v71.J;
        v71Var.a();
        org.telegram.messenger.g0.r(this.f42681j0);
        if (!this.f42667a.d0()) {
            if (this.W) {
                ImageView imageView = this.f42673d0;
                if (this.V) {
                    i11 = 2131231252;
                } else {
                    i11 = 2131231251;
                }
                imageView.setImageResource(i11);
                return;
            }
            ImageView imageView2 = this.f42673d0;
            if (this.V) {
                i10 = 2131231456;
            } else {
                i10 = 2131231454;
            }
            imageView2.setImageResource(i10);
            return;
        }
        ImageView imageView3 = this.f42673d0;
        if (this.V) {
            i7 = 2131231453;
        } else {
            i7 = 2131231452;
        }
        imageView3.setImageResource(i7);
        org.telegram.messenger.g0.h3(this.f42681j0, 500L);
        if (!this.K) {
            this.K = true;
            ((AudioManager) org.telegram.messenger.t0.f26895b.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i7) {
        org.telegram.messenger.g0.g3(new org.telegram.ui.ii(this, i7, 20));
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
        ue0 ue0Var = this.f42671c;
        int measuredWidth = (i13 - ue0Var.getMeasuredWidth()) / 2;
        int i14 = i12 - i10;
        int L = ((i14 - org.telegram.messenger.g0.L(10.0f)) - ue0Var.getMeasuredHeight()) / 2;
        ue0Var.layout(measuredWidth, L, ue0Var.getMeasuredWidth() + measuredWidth, ue0Var.getMeasuredHeight() + L);
        v71 v71Var = this.f42678g0;
        if (v71Var.getParent() == this) {
            v71Var.layout(0, 0, v71Var.getMeasuredWidth(), v71Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f42670b0;
        int measuredWidth2 = (i13 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i14 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        v71Var.f40659a.y0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        this.f42671c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - org.telegram.messenger.g0.L(10.0f), 1073741824));
        v71 v71Var = this.f42678g0;
        if (v71Var.getParent() == this) {
            v71Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f42670b0.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i7) {
        v71 v71Var = this.f42678g0;
        i61 i61Var = this.f42667a;
        if (i7 != 2) {
            if (i61Var.U() != -9223372036854775807L) {
                v71Var.b((int) (i61Var.U() / 1000));
            } else {
                v71Var.b(0);
            }
        }
        w71 w71Var = this.f42687w;
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
                    this.f42685r = 1;
                }
                this.f42684n.setSurfaceTexture(surfaceTexture);
                this.f42684n.setSurfaceTextureListener(this.f42682k0);
                this.f42684n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f42685r == 2) {
            ImageView imageView = this.f42674e;
            if (imageView != null) {
                imageView.setVisibility(4);
                imageView.setImageDrawable(null);
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.h = null;
                }
            }
            this.f42668a0 = false;
            int i7 = this.f42679h0;
            int i10 = this.f42680i0;
            this.f42671c.getVideoRotation();
            this.f42687w.f(this.f42678g0, false, i7, i10, this.J);
            this.f42685r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        float f11;
        ue0 ue0Var = this.f42671c;
        if (ue0Var != null) {
            float f12 = i7 * f10;
            this.f42679h0 = (int) f12;
            this.f42680i0 = i10;
            if (i10 == 0) {
                f11 = 1.0f;
            } else {
                f11 = f12 / i10;
            }
            ue0Var.a(f11, 0);
            if (this.U) {
                this.f42687w.c(f11);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.N = true;
        this.M = System.currentTimeMillis();
        this.f42678g0.invalidate();
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
