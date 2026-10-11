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
public final class ia1 extends ViewGroup implements j81, AudioManager.OnAudioFocusChangeListener {
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
    public final m81 f27246a;
    public final RadialProgressView f27247a0;
    public final ba1 f27248b;
    public final ImageView f27249b0;
    public final bh0 f27250c;
    public final ImageView f27251c0;
    public final TextureView d;
    public final ImageView f27252d0;
    public final ImageView f27253e;
    public AnimatorSet f27254e0;
    public final ViewGroup f27255f;
    public final ea1 f27256f0;
    public int f27257g0;
    public Bitmap h;
    public int f27258h0;
    public final aa1 f27259i0;
    public final ki.d f27260j0;
    public final aa1 f27261k0;
    public TextureView f27262n;
    public int f27263r;
    public boolean f27264s;
    public final fa1 v;
    public boolean f27265w;
    public String f27266x;
    public String f27267y;
    public static final Pattern f27232l0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f27233n0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f27234o0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f27235p0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f27236q0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f27237r0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f27238s0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f27239t0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f27240u0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f27241v0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f27242w0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f27243x0 = Pattern.compile("var\\s");
    public static final Pattern f27244y0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f27245z0 = Pattern.compile("[()]");
    public static final Pattern A0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public ia1(Context context, boolean z10, fa1 fa1Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.f27259i0 = new aa1(this, 0);
        this.f27260j0 = new ki.d(this, 4);
        this.f27261k0 = new aa1(this, 1);
        setWillNotDraw(false);
        this.v = fa1Var;
        paint.setColor(-16777216);
        bh0 bh0Var = new bh0(this, context, 1);
        this.f27250c = bh0Var;
        addView(bh0Var, w7.x5.e(-1, -1, 17));
        ba1 ba1Var = new ba1(context, context);
        this.f27248b = ba1Var;
        final r81 r81Var = new r81(this);
        ba1Var.addJavascriptInterface(new Object(r81Var) {
            public final r81 f24378a;

            {
                this.f24378a = r81Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                ia1 ia1Var = (ia1) this.f24378a.f30394a;
                AsyncTask asyncTask = ia1Var.R;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = ia1Var.R;
                    if (asyncTask2 instanceof ha1) {
                        ha1 ha1Var = (ha1) asyncTask2;
                        String[] strArr = ha1Var.f26962c;
                        String str2 = strArr[0];
                        String str3 = ha1Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        ha1Var.f26961b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = ba1Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = fa1Var.g();
        this.f27255f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            bh0Var.addView(textureView, w7.x5.e(-1, -1, 17));
        }
        if (g10 != null) {
            ImageView imageView = new ImageView(context);
            this.f27253e = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            g10.addView(imageView);
        }
        m81 m81Var = new m81();
        this.f27246a = m81Var;
        m81Var.J = this;
        m81Var.V(textureView);
        ea1 ea1Var = new ea1(this, context);
        this.f27256f0 = ea1Var;
        if (g10 != null) {
            g10.addView(ea1Var);
        } else {
            addView(ea1Var, w7.x5.d(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f27247a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, w7.x5.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f27249b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ea1Var.addView(imageView2, w7.x5.a(56.0f, 0.0f, 0.0f, 0.0f, 5.0f, 56, 85));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final ia1 f33474b;

            {
                this.f33474b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ia1 ia1Var = this.f33474b;
                        if (ia1Var.f27265w && !ia1Var.S && !ia1Var.W && ia1Var.M) {
                            ia1Var.T = !ia1Var.T;
                            ia1Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        ia1 ia1Var2 = this.f33474b;
                        m81 m81Var2 = ia1Var2.f27246a;
                        if (ia1Var2.f27265w && ia1Var2.f27266x != null) {
                            if (m81Var2.d == null) {
                                ia1Var2.i();
                            }
                            if (m81Var2.y()) {
                                m81Var2.B();
                            } else {
                                ia1Var2.V = false;
                                m81Var2.C();
                            }
                            ia1Var2.n();
                            return;
                        }
                        return;
                    default:
                        ia1 ia1Var3 = this.f33474b;
                        ViewGroup viewGroup = ia1Var3.f27255f;
                        boolean z11 = ia1Var3.I;
                        fa1 fa1Var2 = ia1Var3.v;
                        ea1 ea1Var2 = ia1Var3.f27256f0;
                        bh0 bh0Var2 = ia1Var3.f27250c;
                        TextureView textureView2 = ia1Var3.d;
                        if (textureView2 != null && fa1Var2.h() && !ia1Var3.S && !ia1Var3.W && ia1Var3.M) {
                            ia1Var3.W = true;
                            if (!ia1Var3.U) {
                                ia1Var3.T = false;
                                fa1Var2.i(true, ia1Var3.f27261k0, bh0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) bh0Var2.getParent();
                            if (viewGroup2 != ia1Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(bh0Var2);
                                }
                                ia1Var3.addView(bh0Var2, 0, w7.x5.e(-1, -1, 17));
                                bh0Var2.measure(View.MeasureSpec.makeMeasureSpec(ia1Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ia1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
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
                                bh0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) ea1Var2.getParent();
                            if (viewGroup3 != ia1Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(ea1Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(ea1Var2);
                                } else {
                                    ia1Var3.addView(ea1Var2, 1);
                                }
                            }
                            ea1Var2.d(false, false);
                            fa1Var2.i(false, null, bh0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f27251c0 = imageView3;
        imageView3.setScaleType(scaleType);
        ea1Var.addView(imageView3, w7.x5.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final ia1 f33474b;

            {
                this.f33474b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ia1 ia1Var = this.f33474b;
                        if (ia1Var.f27265w && !ia1Var.S && !ia1Var.W && ia1Var.M) {
                            ia1Var.T = !ia1Var.T;
                            ia1Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        ia1 ia1Var2 = this.f33474b;
                        m81 m81Var2 = ia1Var2.f27246a;
                        if (ia1Var2.f27265w && ia1Var2.f27266x != null) {
                            if (m81Var2.d == null) {
                                ia1Var2.i();
                            }
                            if (m81Var2.y()) {
                                m81Var2.B();
                            } else {
                                ia1Var2.V = false;
                                m81Var2.C();
                            }
                            ia1Var2.n();
                            return;
                        }
                        return;
                    default:
                        ia1 ia1Var3 = this.f33474b;
                        ViewGroup viewGroup = ia1Var3.f27255f;
                        boolean z11 = ia1Var3.I;
                        fa1 fa1Var2 = ia1Var3.v;
                        ea1 ea1Var2 = ia1Var3.f27256f0;
                        bh0 bh0Var2 = ia1Var3.f27250c;
                        TextureView textureView2 = ia1Var3.d;
                        if (textureView2 != null && fa1Var2.h() && !ia1Var3.S && !ia1Var3.W && ia1Var3.M) {
                            ia1Var3.W = true;
                            if (!ia1Var3.U) {
                                ia1Var3.T = false;
                                fa1Var2.i(true, ia1Var3.f27261k0, bh0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) bh0Var2.getParent();
                            if (viewGroup2 != ia1Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(bh0Var2);
                                }
                                ia1Var3.addView(bh0Var2, 0, w7.x5.e(-1, -1, 17));
                                bh0Var2.measure(View.MeasureSpec.makeMeasureSpec(ia1Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ia1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
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
                                bh0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) ea1Var2.getParent();
                            if (viewGroup3 != ia1Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(ea1Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(ea1Var2);
                                } else {
                                    ia1Var3.addView(ea1Var2, 1);
                                }
                            }
                            ea1Var2.d(false, false);
                            fa1Var2.i(false, null, bh0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f27252d0 = imageView4;
            imageView4.setScaleType(scaleType);
            ea1Var.addView(imageView4, w7.x5.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final ia1 f33474b;

                {
                    this.f33474b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            ia1 ia1Var = this.f33474b;
                            if (ia1Var.f27265w && !ia1Var.S && !ia1Var.W && ia1Var.M) {
                                ia1Var.T = !ia1Var.T;
                                ia1Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            ia1 ia1Var2 = this.f33474b;
                            m81 m81Var2 = ia1Var2.f27246a;
                            if (ia1Var2.f27265w && ia1Var2.f27266x != null) {
                                if (m81Var2.d == null) {
                                    ia1Var2.i();
                                }
                                if (m81Var2.y()) {
                                    m81Var2.B();
                                } else {
                                    ia1Var2.V = false;
                                    m81Var2.C();
                                }
                                ia1Var2.n();
                                return;
                            }
                            return;
                        default:
                            ia1 ia1Var3 = this.f33474b;
                            ViewGroup viewGroup = ia1Var3.f27255f;
                            boolean z11 = ia1Var3.I;
                            fa1 fa1Var2 = ia1Var3.v;
                            ea1 ea1Var2 = ia1Var3.f27256f0;
                            bh0 bh0Var2 = ia1Var3.f27250c;
                            TextureView textureView2 = ia1Var3.d;
                            if (textureView2 != null && fa1Var2.h() && !ia1Var3.S && !ia1Var3.W && ia1Var3.M) {
                                ia1Var3.W = true;
                                if (!ia1Var3.U) {
                                    ia1Var3.T = false;
                                    fa1Var2.i(true, ia1Var3.f27261k0, bh0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) bh0Var2.getParent();
                                if (viewGroup2 != ia1Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(bh0Var2);
                                    }
                                    ia1Var3.addView(bh0Var2, 0, w7.x5.e(-1, -1, 17));
                                    bh0Var2.measure(View.MeasureSpec.makeMeasureSpec(ia1Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ia1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
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
                                    bh0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) ea1Var2.getParent();
                                if (viewGroup3 != ia1Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(ea1Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(ea1Var2);
                                    } else {
                                        ia1Var3.addView(ea1Var2, 1);
                                    }
                                }
                                ea1Var2.d(false, false);
                                fa1Var2.i(false, null, bh0Var2.getAspectRatio(), z11);
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
                Matcher matcher = f27233n0.matcher(str);
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
        Matcher matcher = f27232l0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f27256f0;
    }

    private View getProgressView() {
        return this.f27247a0;
    }

    public final void b() {
        this.f27246a.H();
        AsyncTask asyncTask = this.R;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.R = null;
        }
        this.f27248b.stopLoading();
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
        return this.f27250c;
    }

    public View getControlsView() {
        return this.f27256f0;
    }

    public ImageView getTextureImageView() {
        return this.f27253e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.G;
    }

    public final void h() {
        ea1 ea1Var = this.f27256f0;
        if (ea1Var.getParent() != this) {
            ea1Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.f27266x;
        if (str != null) {
            String str2 = this.E;
            m81 m81Var = this.f27246a;
            if (str2 != null) {
                m81Var.G(Uri.parse(str), this.f27267y, Uri.parse(this.E), this.F);
            } else {
                m81Var.D(Uri.parse(str), this.f27267y);
            }
            m81Var.P(this.f27264s);
            int i10 = (m81Var.p() > (-9223372036854775807L) ? 1 : (m81Var.p() == (-9223372036854775807L) ? 0 : -1));
            ea1 ea1Var = this.f27256f0;
            if (i10 != 0) {
                ea1Var.b((int) (m81Var.p() / 1000));
            } else {
                ea1Var.b(0);
            }
            k();
            o();
            m();
            ea1Var.invalidate();
            int i11 = this.O;
            if (i11 != -1) {
                m81Var.L(i11 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f7 = 0.0f;
        RadialProgressView radialProgressView = this.f27247a0;
        if (z11) {
            AnimatorSet animatorSet = this.f27254e0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f27254e0 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f7));
            this.f27254e0.setDuration(150L);
            this.f27254e0.addListener(new k91(this, 1));
            this.f27254e0.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        radialProgressView.setAlpha(f7);
    }

    public final void k() {
        i2.f0 f0Var = this.f27246a.d;
        ImageView imageView = this.f27249b0;
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
        ViewGroup viewGroup2 = this.f27255f;
        bh0 bh0Var = this.f27250c;
        if (viewGroup2 == null) {
            this.S = true;
            if (!this.T) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    bh0Var.addView(textureView);
                }
            }
            boolean z11 = this.T;
            ea1 ea1Var = this.f27256f0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) ea1Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(ea1Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) ea1Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(ea1Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(ea1Var);
                    } else {
                        addView(ea1Var, 1);
                    }
                }
            }
            TextureView a2 = this.v.a(this.f27256f0, this.T, bh0Var.getAspectRatio(), bh0Var.getVideoRotation(), z10);
            this.f27262n = a2;
            a2.setVisibility(4);
            if (this.T && this.f27262n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i10 = ea1.I;
            ea1Var.a();
            return;
        }
        if (this.T) {
            ViewGroup viewGroup5 = (ViewGroup) bh0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(bh0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) bh0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(bh0Var);
                }
                addView(bh0Var, 0);
            }
        }
        this.v.a(this.f27256f0, this.T, bh0Var.getAspectRatio(), bh0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i10;
        int i11;
        ImageView imageView = this.f27252d0;
        if (imageView == null) {
            return;
        }
        if (this.U) {
            i10 = R.drawable.ic_goinline;
        } else {
            i10 = R.drawable.ic_outinline;
        }
        imageView.setImageResource(i10);
        if (this.f27246a.d != null) {
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
        ea1 ea1Var = this.f27256f0;
        int i13 = ea1.I;
        ea1Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.f27259i0);
        if (!this.f27246a.y()) {
            if (this.V) {
                ImageView imageView = this.f27251c0;
                if (this.U) {
                    i12 = R.drawable.ic_againinline;
                } else {
                    i12 = R.drawable.ic_again;
                }
                imageView.setImageResource(i12);
                return;
            }
            ImageView imageView2 = this.f27251c0;
            if (this.U) {
                i11 = R.drawable.ic_playinline;
            } else {
                i11 = R.drawable.ic_play;
            }
            imageView2.setImageResource(i11);
            return;
        }
        ImageView imageView3 = this.f27251c0;
        if (this.U) {
            i10 = R.drawable.ic_pauseinline;
        } else {
            i10 = R.drawable.ic_pause;
        }
        imageView3.setImageResource(i10);
        AndroidUtilities.runOnUIThread(this.f27259i0, 500L);
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
    public final void onError(m81 m81Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        bh0 bh0Var = this.f27250c;
        int measuredWidth = (i14 - bh0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - bh0Var.getMeasuredHeight()) / 2;
        bh0Var.layout(measuredWidth, dp, bh0Var.getMeasuredWidth() + measuredWidth, bh0Var.getMeasuredHeight() + dp);
        ea1 ea1Var = this.f27256f0;
        if (ea1Var.getParent() == this) {
            ea1Var.layout(0, 0, ea1Var.getMeasuredWidth(), ea1Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f27247a0;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        ea1Var.f25942a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f27250c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        ea1 ea1Var = this.f27256f0;
        if (ea1Var.getParent() == this) {
            ea1Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f27247a0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        ea1 ea1Var = this.f27256f0;
        m81 m81Var = this.f27246a;
        if (i10 != 2) {
            if (m81Var.p() != -9223372036854775807L) {
                ea1Var.b((int) (m81Var.p() / 1000));
            } else {
                ea1Var.b(0);
            }
        }
        fa1 fa1Var = this.v;
        if (i10 != 4 && i10 != 1 && m81Var.y()) {
            fa1Var.e(this, true);
        } else {
            fa1Var.e(this, false);
        }
        if (m81Var.y() && i10 != 4) {
            n();
        } else if (i10 == 4) {
            this.V = true;
            m81Var.B();
            m81Var.L(0L, false);
            n();
            ea1Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.S) {
            this.S = false;
            if (this.T || this.U) {
                if (this.U) {
                    this.f27263r = 1;
                }
                this.f27262n.setSurfaceTexture(surfaceTexture);
                this.f27262n.setSurfaceTextureListener(this.f27260j0);
                this.f27262n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f27263r == 2) {
            ImageView imageView = this.f27253e;
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
            int i10 = this.f27257g0;
            int i11 = this.f27258h0;
            this.f27250c.getVideoRotation();
            this.v.f(this.f27256f0, false, i10, i11, this.I);
            this.f27263r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        bh0 bh0Var = this.f27250c;
        if (bh0Var != null) {
            float f11 = i10 * f7;
            this.f27257g0 = (int) f11;
            this.f27258h0 = i11;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / i11;
            }
            bh0Var.a(f10, 0);
            if (this.T) {
                this.v.c(f10);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.M = true;
        this.L = System.currentTimeMillis();
        this.f27256f0.invalidate();
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
