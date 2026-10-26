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
public final class ma1 extends ViewGroup implements p81, AudioManager.OnAudioFocusChangeListener {
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
    public final s81 f30488a;
    public final RadialProgressView f30489a0;
    public final fa1 f30490b;
    public final ImageView f30491b0;
    public final vg0 f30492c;
    public final ImageView f30493c0;
    public final TextureView d;
    public final ImageView f30494d0;
    public final ImageView e;
    public AnimatorSet f30495e0;
    public final ViewGroup f30496f;
    public final ia1 f30497f0;
    public int f30498g0;
    public Bitmap h;
    public int f30499h0;
    public final ea1 f30500i0;
    public final v50 f30501j0;
    public final ea1 f30502k0;
    public TextureView f30503n;
    public int f30504r;
    public boolean f30505s;
    public final ja1 v;
    public boolean f30506w;
    public String f30507x;
    public String f30508y;
    public static final Pattern f30474l0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f30475n0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f30476o0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f30477p0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f30478q0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f30479r0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f30480s0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f30481t0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f30482u0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f30483v0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f30484w0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f30485x0 = Pattern.compile("var\\s");
    public static final Pattern f30486y0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f30487z0 = Pattern.compile("[()]");
    public static final Pattern A0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public ma1(Context context, boolean z10, ja1 ja1Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.f30500i0 = new ea1(this, 0);
        this.f30501j0 = new v50(this, 3);
        this.f30502k0 = new ea1(this, 1);
        setWillNotDraw(false);
        this.v = ja1Var;
        paint.setColor(-16777216);
        vg0 vg0Var = new vg0(this, context, 1);
        this.f30492c = vg0Var;
        addView(vg0Var, gb1.i(-1, -1, 17));
        fa1 fa1Var = new fa1(context, context);
        this.f30490b = fa1Var;
        final w81 w81Var = new w81(this);
        fa1Var.addJavascriptInterface(new Object(w81Var) {
            public final w81 f26366a;

            {
                this.f26366a = w81Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                ma1 ma1Var = (ma1) this.f26366a.f34390a;
                AsyncTask asyncTask = ma1Var.R;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = ma1Var.R;
                    if (asyncTask2 instanceof la1) {
                        la1 la1Var = (la1) asyncTask2;
                        String[] strArr = la1Var.f30152c;
                        String str2 = strArr[0];
                        String str3 = la1Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        la1Var.f30151b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = fa1Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g7 = ja1Var.g();
        this.f30496f = g7;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g7 != null) {
            g7.addView(textureView);
        } else {
            vg0Var.addView(textureView, gb1.i(-1, -1, 17));
        }
        if (g7 != null) {
            ImageView imageView = new ImageView(context);
            this.e = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            g7.addView(imageView);
        }
        s81 s81Var = new s81();
        this.f30488a = s81Var;
        s81Var.J = this;
        s81Var.V(textureView);
        ia1 ia1Var = new ia1(this, context);
        this.f30497f0 = ia1Var;
        if (g7 != null) {
            g7.addView(ia1Var);
        } else {
            addView(ia1Var, gb1.g(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f30489a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, gb1.i(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f30491b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ia1Var.addView(imageView2, gb1.h(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final ma1 f27484b;

            {
                this.f27484b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ma1 ma1Var = this.f27484b;
                        if (ma1Var.f30506w && !ma1Var.S && !ma1Var.W && ma1Var.M) {
                            ma1Var.T = !ma1Var.T;
                            ma1Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        ma1 ma1Var2 = this.f27484b;
                        s81 s81Var2 = ma1Var2.f30488a;
                        if (ma1Var2.f30506w && ma1Var2.f30507x != null) {
                            if (s81Var2.d == null) {
                                ma1Var2.i();
                            }
                            if (s81Var2.y()) {
                                s81Var2.B();
                            } else {
                                ma1Var2.V = false;
                                s81Var2.C();
                            }
                            ma1Var2.n();
                            return;
                        }
                        return;
                    default:
                        ma1 ma1Var3 = this.f27484b;
                        ViewGroup viewGroup = ma1Var3.f30496f;
                        boolean z11 = ma1Var3.I;
                        ja1 ja1Var2 = ma1Var3.v;
                        ia1 ia1Var2 = ma1Var3.f30497f0;
                        vg0 vg0Var2 = ma1Var3.f30492c;
                        TextureView textureView2 = ma1Var3.d;
                        if (textureView2 != null && ja1Var2.h() && !ma1Var3.S && !ma1Var3.W && ma1Var3.M) {
                            ma1Var3.W = true;
                            if (!ma1Var3.U) {
                                ma1Var3.T = false;
                                ja1Var2.i(true, ma1Var3.f30502k0, vg0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) vg0Var2.getParent();
                            if (viewGroup2 != ma1Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(vg0Var2);
                                }
                                ma1Var3.addView(vg0Var2, 0, gb1.i(-1, -1, 17));
                                vg0Var2.measure(View.MeasureSpec.makeMeasureSpec(ma1Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ma1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = ma1Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                ma1Var3.h = null;
                            }
                            ma1Var3.S = true;
                            ma1Var3.U = false;
                            ma1Var3.n();
                            ma1Var3.o();
                            ma1Var3.k();
                            ma1Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                vg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) ia1Var2.getParent();
                            if (viewGroup3 != ma1Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(ia1Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(ia1Var2);
                                } else {
                                    ma1Var3.addView(ia1Var2, 1);
                                }
                            }
                            ia1Var2.d(false, false);
                            ja1Var2.i(false, null, vg0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f30493c0 = imageView3;
        imageView3.setScaleType(scaleType);
        ia1Var.addView(imageView3, gb1.i(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ma1 f27484b;

            {
                this.f27484b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ma1 ma1Var = this.f27484b;
                        if (ma1Var.f30506w && !ma1Var.S && !ma1Var.W && ma1Var.M) {
                            ma1Var.T = !ma1Var.T;
                            ma1Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        ma1 ma1Var2 = this.f27484b;
                        s81 s81Var2 = ma1Var2.f30488a;
                        if (ma1Var2.f30506w && ma1Var2.f30507x != null) {
                            if (s81Var2.d == null) {
                                ma1Var2.i();
                            }
                            if (s81Var2.y()) {
                                s81Var2.B();
                            } else {
                                ma1Var2.V = false;
                                s81Var2.C();
                            }
                            ma1Var2.n();
                            return;
                        }
                        return;
                    default:
                        ma1 ma1Var3 = this.f27484b;
                        ViewGroup viewGroup = ma1Var3.f30496f;
                        boolean z11 = ma1Var3.I;
                        ja1 ja1Var2 = ma1Var3.v;
                        ia1 ia1Var2 = ma1Var3.f30497f0;
                        vg0 vg0Var2 = ma1Var3.f30492c;
                        TextureView textureView2 = ma1Var3.d;
                        if (textureView2 != null && ja1Var2.h() && !ma1Var3.S && !ma1Var3.W && ma1Var3.M) {
                            ma1Var3.W = true;
                            if (!ma1Var3.U) {
                                ma1Var3.T = false;
                                ja1Var2.i(true, ma1Var3.f30502k0, vg0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) vg0Var2.getParent();
                            if (viewGroup2 != ma1Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(vg0Var2);
                                }
                                ma1Var3.addView(vg0Var2, 0, gb1.i(-1, -1, 17));
                                vg0Var2.measure(View.MeasureSpec.makeMeasureSpec(ma1Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ma1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = ma1Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                ma1Var3.h = null;
                            }
                            ma1Var3.S = true;
                            ma1Var3.U = false;
                            ma1Var3.n();
                            ma1Var3.o();
                            ma1Var3.k();
                            ma1Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                vg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) ia1Var2.getParent();
                            if (viewGroup3 != ma1Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(ia1Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(ia1Var2);
                                } else {
                                    ma1Var3.addView(ia1Var2, 1);
                                }
                            }
                            ia1Var2.d(false, false);
                            ja1Var2.i(false, null, vg0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f30494d0 = imageView4;
            imageView4.setScaleType(scaleType);
            ia1Var.addView(imageView4, gb1.i(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final ma1 f27484b;

                {
                    this.f27484b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            ma1 ma1Var = this.f27484b;
                            if (ma1Var.f30506w && !ma1Var.S && !ma1Var.W && ma1Var.M) {
                                ma1Var.T = !ma1Var.T;
                                ma1Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            ma1 ma1Var2 = this.f27484b;
                            s81 s81Var2 = ma1Var2.f30488a;
                            if (ma1Var2.f30506w && ma1Var2.f30507x != null) {
                                if (s81Var2.d == null) {
                                    ma1Var2.i();
                                }
                                if (s81Var2.y()) {
                                    s81Var2.B();
                                } else {
                                    ma1Var2.V = false;
                                    s81Var2.C();
                                }
                                ma1Var2.n();
                                return;
                            }
                            return;
                        default:
                            ma1 ma1Var3 = this.f27484b;
                            ViewGroup viewGroup = ma1Var3.f30496f;
                            boolean z11 = ma1Var3.I;
                            ja1 ja1Var2 = ma1Var3.v;
                            ia1 ia1Var2 = ma1Var3.f30497f0;
                            vg0 vg0Var2 = ma1Var3.f30492c;
                            TextureView textureView2 = ma1Var3.d;
                            if (textureView2 != null && ja1Var2.h() && !ma1Var3.S && !ma1Var3.W && ma1Var3.M) {
                                ma1Var3.W = true;
                                if (!ma1Var3.U) {
                                    ma1Var3.T = false;
                                    ja1Var2.i(true, ma1Var3.f30502k0, vg0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) vg0Var2.getParent();
                                if (viewGroup2 != ma1Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(vg0Var2);
                                    }
                                    ma1Var3.addView(vg0Var2, 0, gb1.i(-1, -1, 17));
                                    vg0Var2.measure(View.MeasureSpec.makeMeasureSpec(ma1Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ma1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                }
                                Bitmap bitmap = ma1Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    ma1Var3.h = null;
                                }
                                ma1Var3.S = true;
                                ma1Var3.U = false;
                                ma1Var3.n();
                                ma1Var3.o();
                                ma1Var3.k();
                                ma1Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    vg0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) ia1Var2.getParent();
                                if (viewGroup3 != ma1Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(ia1Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(ia1Var2);
                                    } else {
                                        ma1Var3.addView(ia1Var2, 1);
                                    }
                                }
                                ia1Var2.d(false, false);
                                ja1Var2.i(false, null, vg0Var2.getAspectRatio(), z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ma1.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ma1.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f30475n0.matcher(str);
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
        Matcher matcher = f30474l0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f30497f0;
    }

    private View getProgressView() {
        return this.f30489a0;
    }

    public final void b() {
        this.f30488a.H();
        AsyncTask asyncTask = this.R;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.R = null;
        }
        this.f30490b.stopLoading();
    }

    public final boolean f() {
        if (!this.U && !this.W) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r27, org.telegram.tgnet.TLRPC.Photo r28, java.lang.Object r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ma1.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f30492c;
    }

    public View getControlsView() {
        return this.f30497f0;
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
        ia1 ia1Var = this.f30497f0;
        if (ia1Var.getParent() != this) {
            ia1Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.f30507x;
        if (str != null) {
            String str2 = this.E;
            s81 s81Var = this.f30488a;
            if (str2 != null) {
                s81Var.G(Uri.parse(str), this.f30508y, Uri.parse(this.E), this.F);
            } else {
                s81Var.D(Uri.parse(str), this.f30508y);
            }
            s81Var.P(this.f30505s);
            int i10 = (s81Var.p() > (-9223372036854775807L) ? 1 : (s81Var.p() == (-9223372036854775807L) ? 0 : -1));
            ia1 ia1Var = this.f30497f0;
            if (i10 != 0) {
                ia1Var.b((int) (s81Var.p() / 1000));
            } else {
                ia1Var.b(0);
            }
            k();
            o();
            m();
            ia1Var.invalidate();
            int i11 = this.O;
            if (i11 != -1) {
                s81Var.L(i11 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f7 = 0.0f;
        RadialProgressView radialProgressView = this.f30489a0;
        if (z11) {
            AnimatorSet animatorSet = this.f30495e0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f30495e0 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f7));
            this.f30495e0.setDuration(150L);
            this.f30495e0.addListener(new h31(this, 8));
            this.f30495e0.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        radialProgressView.setAlpha(f7);
    }

    public final void k() {
        i2.j0 j0Var = this.f30488a.d;
        ImageView imageView = this.f30491b0;
        if (j0Var != null && !this.U) {
            imageView.setVisibility(0);
            if (!this.T) {
                imageView.setImageResource(R.drawable.ic_gofullscreen);
                imageView.setLayoutParams(gb1.h(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
                return;
            }
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(gb1.h(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
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
        ViewGroup viewGroup2 = this.f30496f;
        vg0 vg0Var = this.f30492c;
        if (viewGroup2 == null) {
            this.S = true;
            if (!this.T) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    vg0Var.addView(textureView);
                }
            }
            boolean z11 = this.T;
            ia1 ia1Var = this.f30497f0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) ia1Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(ia1Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) ia1Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(ia1Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(ia1Var);
                    } else {
                        addView(ia1Var, 1);
                    }
                }
            }
            TextureView a2 = this.v.a(this.f30497f0, this.T, vg0Var.getAspectRatio(), vg0Var.getVideoRotation(), z10);
            this.f30503n = a2;
            a2.setVisibility(4);
            if (this.T && this.f30503n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i10 = ia1.I;
            ia1Var.a();
            return;
        }
        if (this.T) {
            ViewGroup viewGroup5 = (ViewGroup) vg0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(vg0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) vg0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(vg0Var);
                }
                addView(vg0Var, 0);
            }
        }
        this.v.a(this.f30497f0, this.T, vg0Var.getAspectRatio(), vg0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i10;
        int i11;
        ImageView imageView = this.f30494d0;
        if (imageView == null) {
            return;
        }
        if (this.U) {
            i10 = R.drawable.ic_goinline;
        } else {
            i10 = R.drawable.ic_outinline;
        }
        imageView.setImageResource(i10);
        if (this.f30488a.d != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView.setVisibility(i11);
        if (this.U) {
            imageView.setLayoutParams(gb1.i(40, 40, 53));
        } else {
            imageView.setLayoutParams(gb1.i(56, 50, 53));
        }
    }

    public final void n() {
        int i10;
        int i11;
        int i12;
        ia1 ia1Var = this.f30497f0;
        int i13 = ia1.I;
        ia1Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.f30500i0);
        if (!this.f30488a.y()) {
            if (this.V) {
                ImageView imageView = this.f30493c0;
                if (this.U) {
                    i12 = R.drawable.ic_againinline;
                } else {
                    i12 = R.drawable.ic_again;
                }
                imageView.setImageResource(i12);
                return;
            }
            ImageView imageView2 = this.f30493c0;
            if (this.U) {
                i11 = R.drawable.ic_playinline;
            } else {
                i11 = R.drawable.ic_play;
            }
            imageView2.setImageResource(i11);
            return;
        }
        ImageView imageView3 = this.f30493c0;
        if (this.U) {
            i10 = R.drawable.ic_pauseinline;
        } else {
            i10 = R.drawable.ic_pause;
        }
        imageView3.setImageResource(i10);
        AndroidUtilities.runOnUIThread(this.f30500i0, 500L);
        if (!this.J) {
            this.J = true;
            ((AudioManager) ApplicationLoader.applicationContext.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new h2(this, i10, 13));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.Q);
    }

    @Override
    public final void onError(s81 s81Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        vg0 vg0Var = this.f30492c;
        int measuredWidth = (i14 - vg0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - vg0Var.getMeasuredHeight()) / 2;
        vg0Var.layout(measuredWidth, dp, vg0Var.getMeasuredWidth() + measuredWidth, vg0Var.getMeasuredHeight() + dp);
        ia1 ia1Var = this.f30497f0;
        if (ia1Var.getParent() == this) {
            ia1Var.layout(0, 0, ia1Var.getMeasuredWidth(), ia1Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f30489a0;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        ia1Var.f29245a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f30492c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        ia1 ia1Var = this.f30497f0;
        if (ia1Var.getParent() == this) {
            ia1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f30489a0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        ia1 ia1Var = this.f30497f0;
        s81 s81Var = this.f30488a;
        if (i10 != 2) {
            if (s81Var.p() != -9223372036854775807L) {
                ia1Var.b((int) (s81Var.p() / 1000));
            } else {
                ia1Var.b(0);
            }
        }
        ja1 ja1Var = this.v;
        if (i10 != 4 && i10 != 1 && s81Var.y()) {
            ja1Var.e(this, true);
        } else {
            ja1Var.e(this, false);
        }
        if (s81Var.y() && i10 != 4) {
            n();
        } else if (i10 == 4) {
            this.V = true;
            s81Var.B();
            s81Var.L(0L, false);
            n();
            ia1Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.S) {
            this.S = false;
            if (this.T || this.U) {
                if (this.U) {
                    this.f30504r = 1;
                }
                this.f30503n.setSurfaceTexture(surfaceTexture);
                this.f30503n.setSurfaceTextureListener(this.f30501j0);
                this.f30503n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f30504r == 2) {
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
            int i10 = this.f30498g0;
            int i11 = this.f30499h0;
            this.f30492c.getVideoRotation();
            this.v.f(this.f30497f0, false, i10, i11, this.I);
            this.f30504r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        vg0 vg0Var = this.f30492c;
        if (vg0Var != null) {
            float f11 = i10 * f7;
            this.f30498g0 = (int) f11;
            this.f30499h0 = i11;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / i11;
            }
            vg0Var.a(f10, 0);
            if (this.T) {
                this.v.c(f10);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.M = true;
        this.L = System.currentTimeMillis();
        this.f30497f0.invalidate();
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
