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
public final class d91 extends ViewGroup implements e71, AudioManager.OnAudioFocusChangeListener {
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
    public final h71 f23264a;
    public final RadialProgressView f23265a0;
    public final v81 f23266b;
    public final ImageView f23267b0;
    public final yf0 f23268c;
    public final ImageView f23269c0;
    public final TextureView d;
    public final ImageView f23270d0;
    public final ImageView e;
    public AnimatorSet f23271e0;
    public final ViewGroup f23272f;
    public final z81 f23273f0;
    public int f23274g0;
    public Bitmap h;
    public int f23275h0;
    public final u81 f23276i0;
    public final j50 f23277j0;
    public final u81 f23278k0;
    public TextureView f23279n;
    public int f23280r;
    public boolean f23281s;
    public final a91 v;
    public boolean f23282w;
    public String f23283x;
    public String f23284y;
    public static final Pattern f23250l0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f23251n0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f23252o0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f23253p0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f23254q0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f23255r0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f23256s0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f23257t0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f23258u0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f23259v0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f23260w0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f23261x0 = Pattern.compile("var\\s");
    public static final Pattern f23262y0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f23263z0 = Pattern.compile("[()]");
    public static final Pattern A0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public d91(Context context, boolean z10, a91 a91Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.f23276i0 = new u81(this, 0);
        this.f23277j0 = new j50(this, 3);
        this.f23278k0 = new u81(this, 1);
        setWillNotDraw(false);
        this.v = a91Var;
        paint.setColor(-16777216);
        yf0 yf0Var = new yf0(this, context, 1);
        this.f23268c = yf0Var;
        addView(yf0Var, w7.x5.e(-1, -1, 17));
        v81 v81Var = new v81(context, context);
        this.f23266b = v81Var;
        final s81 s81Var = new s81(this);
        v81Var.addJavascriptInterface(new Object(s81Var) {
            public final s81 f22253a;

            {
                this.f22253a = s81Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                d91 d91Var = (d91) this.f22253a.f27804a;
                AsyncTask asyncTask = d91Var.R;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = d91Var.R;
                    if (asyncTask2 instanceof c91) {
                        c91 c91Var = (c91) asyncTask2;
                        String[] strArr = c91Var.f22987c;
                        String str2 = strArr[0];
                        String str3 = c91Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        c91Var.f22986b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = v81Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = a91Var.g();
        this.f23272f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            yf0Var.addView(textureView, w7.x5.e(-1, -1, 17));
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
        h71 h71Var = new h71();
        this.f23264a = h71Var;
        h71Var.J = this;
        h71Var.V(textureView);
        z81 z81Var = new z81(this, context);
        this.f23273f0 = z81Var;
        if (g10 != null) {
            g10.addView(z81Var);
        } else {
            addView(z81Var, w7.x5.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f23265a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, w7.x5.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f23267b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        z81Var.addView(imageView2, w7.x5.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final d91 f28035b;

            {
                this.f28035b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        d91 d91Var = this.f28035b;
                        if (d91Var.f23282w && !d91Var.S && !d91Var.W && d91Var.M) {
                            d91Var.T = !d91Var.T;
                            d91Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        d91 d91Var2 = this.f28035b;
                        h71 h71Var2 = d91Var2.f23264a;
                        if (d91Var2.f23282w && d91Var2.f23283x != null) {
                            if (h71Var2.d == null) {
                                d91Var2.i();
                            }
                            if (h71Var2.y()) {
                                h71Var2.B();
                            } else {
                                d91Var2.V = false;
                                h71Var2.C();
                            }
                            d91Var2.n();
                            return;
                        }
                        return;
                    default:
                        d91 d91Var3 = this.f28035b;
                        ViewGroup viewGroup = d91Var3.f23272f;
                        boolean z11 = d91Var3.I;
                        a91 a91Var2 = d91Var3.v;
                        z81 z81Var2 = d91Var3.f23273f0;
                        yf0 yf0Var2 = d91Var3.f23268c;
                        TextureView textureView2 = d91Var3.d;
                        if (textureView2 != null && a91Var2.h() && !d91Var3.S && !d91Var3.W && d91Var3.M) {
                            d91Var3.W = true;
                            if (!d91Var3.U) {
                                d91Var3.T = false;
                                a91Var2.i(true, d91Var3.f23278k0, yf0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) yf0Var2.getParent();
                            if (viewGroup2 != d91Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(yf0Var2);
                                }
                                d91Var3.addView(yf0Var2, 0, w7.x5.e(-1, -1, 17));
                                yf0Var2.measure(View.MeasureSpec.makeMeasureSpec(d91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(d91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = d91Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                d91Var3.h = null;
                            }
                            d91Var3.S = true;
                            d91Var3.U = false;
                            d91Var3.n();
                            d91Var3.o();
                            d91Var3.k();
                            d91Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                yf0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) z81Var2.getParent();
                            if (viewGroup3 != d91Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(z81Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(z81Var2);
                                } else {
                                    d91Var3.addView(z81Var2, 1);
                                }
                            }
                            z81Var2.d(false, false);
                            a91Var2.i(false, null, yf0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f23269c0 = imageView3;
        imageView3.setScaleType(scaleType);
        z81Var.addView(imageView3, w7.x5.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final d91 f28035b;

            {
                this.f28035b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        d91 d91Var = this.f28035b;
                        if (d91Var.f23282w && !d91Var.S && !d91Var.W && d91Var.M) {
                            d91Var.T = !d91Var.T;
                            d91Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        d91 d91Var2 = this.f28035b;
                        h71 h71Var2 = d91Var2.f23264a;
                        if (d91Var2.f23282w && d91Var2.f23283x != null) {
                            if (h71Var2.d == null) {
                                d91Var2.i();
                            }
                            if (h71Var2.y()) {
                                h71Var2.B();
                            } else {
                                d91Var2.V = false;
                                h71Var2.C();
                            }
                            d91Var2.n();
                            return;
                        }
                        return;
                    default:
                        d91 d91Var3 = this.f28035b;
                        ViewGroup viewGroup = d91Var3.f23272f;
                        boolean z11 = d91Var3.I;
                        a91 a91Var2 = d91Var3.v;
                        z81 z81Var2 = d91Var3.f23273f0;
                        yf0 yf0Var2 = d91Var3.f23268c;
                        TextureView textureView2 = d91Var3.d;
                        if (textureView2 != null && a91Var2.h() && !d91Var3.S && !d91Var3.W && d91Var3.M) {
                            d91Var3.W = true;
                            if (!d91Var3.U) {
                                d91Var3.T = false;
                                a91Var2.i(true, d91Var3.f23278k0, yf0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) yf0Var2.getParent();
                            if (viewGroup2 != d91Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(yf0Var2);
                                }
                                d91Var3.addView(yf0Var2, 0, w7.x5.e(-1, -1, 17));
                                yf0Var2.measure(View.MeasureSpec.makeMeasureSpec(d91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(d91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = d91Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                d91Var3.h = null;
                            }
                            d91Var3.S = true;
                            d91Var3.U = false;
                            d91Var3.n();
                            d91Var3.o();
                            d91Var3.k();
                            d91Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                yf0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) z81Var2.getParent();
                            if (viewGroup3 != d91Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(z81Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(z81Var2);
                                } else {
                                    d91Var3.addView(z81Var2, 1);
                                }
                            }
                            z81Var2.d(false, false);
                            a91Var2.i(false, null, yf0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f23270d0 = imageView4;
            imageView4.setScaleType(scaleType);
            z81Var.addView(imageView4, w7.x5.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final d91 f28035b;

                {
                    this.f28035b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            d91 d91Var = this.f28035b;
                            if (d91Var.f23282w && !d91Var.S && !d91Var.W && d91Var.M) {
                                d91Var.T = !d91Var.T;
                                d91Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            d91 d91Var2 = this.f28035b;
                            h71 h71Var2 = d91Var2.f23264a;
                            if (d91Var2.f23282w && d91Var2.f23283x != null) {
                                if (h71Var2.d == null) {
                                    d91Var2.i();
                                }
                                if (h71Var2.y()) {
                                    h71Var2.B();
                                } else {
                                    d91Var2.V = false;
                                    h71Var2.C();
                                }
                                d91Var2.n();
                                return;
                            }
                            return;
                        default:
                            d91 d91Var3 = this.f28035b;
                            ViewGroup viewGroup = d91Var3.f23272f;
                            boolean z11 = d91Var3.I;
                            a91 a91Var2 = d91Var3.v;
                            z81 z81Var2 = d91Var3.f23273f0;
                            yf0 yf0Var2 = d91Var3.f23268c;
                            TextureView textureView2 = d91Var3.d;
                            if (textureView2 != null && a91Var2.h() && !d91Var3.S && !d91Var3.W && d91Var3.M) {
                                d91Var3.W = true;
                                if (!d91Var3.U) {
                                    d91Var3.T = false;
                                    a91Var2.i(true, d91Var3.f23278k0, yf0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) yf0Var2.getParent();
                                if (viewGroup2 != d91Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(yf0Var2);
                                    }
                                    d91Var3.addView(yf0Var2, 0, w7.x5.e(-1, -1, 17));
                                    yf0Var2.measure(View.MeasureSpec.makeMeasureSpec(d91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(d91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                }
                                Bitmap bitmap = d91Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    d91Var3.h = null;
                                }
                                d91Var3.S = true;
                                d91Var3.U = false;
                                d91Var3.n();
                                d91Var3.o();
                                d91Var3.k();
                                d91Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    yf0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) z81Var2.getParent();
                                if (viewGroup3 != d91Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(z81Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(z81Var2);
                                    } else {
                                        d91Var3.addView(z81Var2, 1);
                                    }
                                }
                                z81Var2.d(false, false);
                                a91Var2.i(false, null, yf0Var2.getAspectRatio(), z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d91.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d91.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f23251n0.matcher(str);
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
        Matcher matcher = f23250l0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f23273f0;
    }

    private View getProgressView() {
        return this.f23265a0;
    }

    public final void b() {
        this.f23264a.H();
        AsyncTask asyncTask = this.R;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.R = null;
        }
        this.f23266b.stopLoading();
    }

    public final boolean f() {
        if (!this.U && !this.W) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r27, org.telegram.tgnet.TLRPC.Photo r28, java.lang.Object r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d91.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f23268c;
    }

    public View getControlsView() {
        return this.f23273f0;
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
        z81 z81Var = this.f23273f0;
        if (z81Var.getParent() != this) {
            z81Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.f23283x;
        if (str != null) {
            String str2 = this.E;
            h71 h71Var = this.f23264a;
            if (str2 != null) {
                h71Var.G(Uri.parse(str), this.f23284y, Uri.parse(this.E), this.F);
            } else {
                h71Var.D(Uri.parse(str), this.f23284y);
            }
            h71Var.P(this.f23281s);
            long p5 = h71Var.p();
            z81 z81Var = this.f23273f0;
            if (p5 != -9223372036854775807L) {
                z81Var.b((int) (h71Var.p() / 1000));
            } else {
                z81Var.b(0);
            }
            k();
            o();
            m();
            z81Var.invalidate();
            int i10 = this.O;
            if (i10 != -1) {
                h71Var.L(i10 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f7 = 0.0f;
        RadialProgressView radialProgressView = this.f23265a0;
        if (z11) {
            AnimatorSet animatorSet = this.f23271e0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f23271e0 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f7));
            this.f23271e0.setDuration(150L);
            this.f23271e0.addListener(new w81(this, 0));
            this.f23271e0.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        radialProgressView.setAlpha(f7);
    }

    public final void k() {
        i2.e0 e0Var = this.f23264a.d;
        ImageView imageView = this.f23267b0;
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
        ViewGroup viewGroup2 = this.f23272f;
        yf0 yf0Var = this.f23268c;
        if (viewGroup2 == null) {
            this.S = true;
            if (!this.T) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    yf0Var.addView(textureView);
                }
            }
            boolean z11 = this.T;
            z81 z81Var = this.f23273f0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) z81Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(z81Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) z81Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(z81Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(z81Var);
                    } else {
                        addView(z81Var, 1);
                    }
                }
            }
            TextureView a2 = this.v.a(this.f23273f0, this.T, yf0Var.getAspectRatio(), yf0Var.getVideoRotation(), z10);
            this.f23279n = a2;
            a2.setVisibility(4);
            if (this.T && this.f23279n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i10 = z81.I;
            z81Var.a();
            return;
        }
        if (this.T) {
            ViewGroup viewGroup5 = (ViewGroup) yf0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(yf0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) yf0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(yf0Var);
                }
                addView(yf0Var, 0);
            }
        }
        this.v.a(this.f23273f0, this.T, yf0Var.getAspectRatio(), yf0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i10;
        int i11;
        ImageView imageView = this.f23270d0;
        if (imageView == null) {
            return;
        }
        if (this.U) {
            i10 = R.drawable.ic_goinline;
        } else {
            i10 = R.drawable.ic_outinline;
        }
        imageView.setImageResource(i10);
        if (this.f23264a.d != null) {
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
        z81 z81Var = this.f23273f0;
        int i13 = z81.I;
        z81Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.f23276i0);
        if (!this.f23264a.y()) {
            if (this.V) {
                ImageView imageView = this.f23269c0;
                if (this.U) {
                    i12 = R.drawable.ic_againinline;
                } else {
                    i12 = R.drawable.ic_again;
                }
                imageView.setImageResource(i12);
                return;
            }
            ImageView imageView2 = this.f23269c0;
            if (this.U) {
                i11 = R.drawable.ic_playinline;
            } else {
                i11 = R.drawable.ic_play;
            }
            imageView2.setImageResource(i11);
            return;
        }
        ImageView imageView3 = this.f23269c0;
        if (this.U) {
            i10 = R.drawable.ic_pauseinline;
        } else {
            i10 = R.drawable.ic_pause;
        }
        imageView3.setImageResource(i10);
        AndroidUtilities.runOnUIThread(this.f23276i0, 500L);
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
    public final void onError(h71 h71Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        yf0 yf0Var = this.f23268c;
        int measuredWidth = (i14 - yf0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - yf0Var.getMeasuredHeight()) / 2;
        yf0Var.layout(measuredWidth, dp, yf0Var.getMeasuredWidth() + measuredWidth, yf0Var.getMeasuredHeight() + dp);
        z81 z81Var = this.f23273f0;
        if (z81Var.getParent() == this) {
            z81Var.layout(0, 0, z81Var.getMeasuredWidth(), z81Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f23265a0;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        z81Var.f30417a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f23268c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        z81 z81Var = this.f23273f0;
        if (z81Var.getParent() == this) {
            z81Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f23265a0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        z81 z81Var = this.f23273f0;
        h71 h71Var = this.f23264a;
        if (i10 != 2) {
            if (h71Var.p() != -9223372036854775807L) {
                z81Var.b((int) (h71Var.p() / 1000));
            } else {
                z81Var.b(0);
            }
        }
        a91 a91Var = this.v;
        if (i10 != 4 && i10 != 1 && h71Var.y()) {
            a91Var.e(this, true);
        } else {
            a91Var.e(this, false);
        }
        if (h71Var.y() && i10 != 4) {
            n();
        } else if (i10 == 4) {
            this.V = true;
            h71Var.B();
            h71Var.L(0L, false);
            n();
            z81Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.S) {
            this.S = false;
            if (this.T || this.U) {
                if (this.U) {
                    this.f23280r = 1;
                }
                this.f23279n.setSurfaceTexture(surfaceTexture);
                this.f23279n.setSurfaceTextureListener(this.f23277j0);
                this.f23279n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f23280r == 2) {
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
            int i10 = this.f23274g0;
            int i11 = this.f23275h0;
            this.f23268c.getVideoRotation();
            this.v.f(this.f23273f0, false, i10, i11, this.I);
            this.f23280r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        yf0 yf0Var = this.f23268c;
        if (yf0Var != null) {
            float f11 = i10 * f7;
            this.f23274g0 = (int) f11;
            this.f23275h0 = i11;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / i11;
            }
            yf0Var.a(f10, 0);
            if (this.T) {
                this.v.c(f10);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.M = true;
        this.L = System.currentTimeMillis();
        this.f23273f0.invalidate();
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
