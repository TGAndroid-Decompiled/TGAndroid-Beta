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
public final class b91 extends ViewGroup implements c71, AudioManager.OnAudioFocusChangeListener {
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
    public final f71 f22619a;
    public final RadialProgressView f22620a0;
    public final t81 f22621b;
    public final ImageView f22622b0;
    public final xf0 f22623c;
    public final ImageView f22624c0;
    public final TextureView d;
    public final ImageView f22625d0;
    public final ImageView e;
    public AnimatorSet f22626e0;
    public final ViewGroup f22627f;
    public final x81 f22628f0;
    public int f22629g0;
    public Bitmap h;
    public int f22630h0;
    public final s81 f22631i0;
    public final k50 f22632j0;
    public final s81 f22633k0;
    public TextureView f22634n;
    public int f22635r;
    public boolean f22636s;
    public final y81 v;
    public boolean f22637w;
    public String f22638x;
    public String f22639y;
    public static final Pattern f22605l0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f22606n0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f22607o0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f22608p0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f22609q0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f22610r0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f22611s0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f22612t0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f22613u0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f22614v0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f22615w0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f22616x0 = Pattern.compile("var\\s");
    public static final Pattern f22617y0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f22618z0 = Pattern.compile("[()]");
    public static final Pattern A0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public b91(Context context, boolean z10, y81 y81Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.f22631i0 = new s81(this, 0);
        this.f22632j0 = new k50(this, 3);
        this.f22633k0 = new s81(this, 1);
        setWillNotDraw(false);
        this.v = y81Var;
        paint.setColor(-16777216);
        xf0 xf0Var = new xf0(this, context, 1);
        this.f22623c = xf0Var;
        addView(xf0Var, w7.x5.e(-1, -1, 17));
        t81 t81Var = new t81(context, context);
        this.f22621b = t81Var;
        final q81 q81Var = new q81(this);
        t81Var.addJavascriptInterface(new Object(q81Var) {
            public final q81 f22214a;

            {
                this.f22214a = q81Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                b91 b91Var = (b91) this.f22214a.f27272a;
                AsyncTask asyncTask = b91Var.R;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = b91Var.R;
                    if (asyncTask2 instanceof a91) {
                        a91 a91Var = (a91) asyncTask2;
                        String[] strArr = a91Var.f22395c;
                        String str2 = strArr[0];
                        String str3 = a91Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        a91Var.f22394b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = t81Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = y81Var.g();
        this.f22627f = g10;
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
        f71 f71Var = new f71();
        this.f22619a = f71Var;
        f71Var.J = this;
        f71Var.V(textureView);
        x81 x81Var = new x81(this, context);
        this.f22628f0 = x81Var;
        if (g10 != null) {
            g10.addView(x81Var);
        } else {
            addView(x81Var, w7.x5.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f22620a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, w7.x5.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f22622b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        x81Var.addView(imageView2, w7.x5.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final b91 f27583b;

            {
                this.f27583b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b91 b91Var = this.f27583b;
                        if (b91Var.f22637w && !b91Var.S && !b91Var.W && b91Var.M) {
                            b91Var.T = !b91Var.T;
                            b91Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        b91 b91Var2 = this.f27583b;
                        f71 f71Var2 = b91Var2.f22619a;
                        if (b91Var2.f22637w && b91Var2.f22638x != null) {
                            if (f71Var2.d == null) {
                                b91Var2.i();
                            }
                            if (f71Var2.y()) {
                                f71Var2.B();
                            } else {
                                b91Var2.V = false;
                                f71Var2.C();
                            }
                            b91Var2.n();
                            return;
                        }
                        return;
                    default:
                        b91 b91Var3 = this.f27583b;
                        ViewGroup viewGroup = b91Var3.f22627f;
                        boolean z11 = b91Var3.I;
                        y81 y81Var2 = b91Var3.v;
                        x81 x81Var2 = b91Var3.f22628f0;
                        xf0 xf0Var2 = b91Var3.f22623c;
                        TextureView textureView2 = b91Var3.d;
                        if (textureView2 != null && y81Var2.h() && !b91Var3.S && !b91Var3.W && b91Var3.M) {
                            b91Var3.W = true;
                            if (!b91Var3.U) {
                                b91Var3.T = false;
                                y81Var2.i(true, b91Var3.f22633k0, xf0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) xf0Var2.getParent();
                            if (viewGroup2 != b91Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(xf0Var2);
                                }
                                b91Var3.addView(xf0Var2, 0, w7.x5.e(-1, -1, 17));
                                xf0Var2.measure(View.MeasureSpec.makeMeasureSpec(b91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(b91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = b91Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                b91Var3.h = null;
                            }
                            b91Var3.S = true;
                            b91Var3.U = false;
                            b91Var3.n();
                            b91Var3.o();
                            b91Var3.k();
                            b91Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                xf0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) x81Var2.getParent();
                            if (viewGroup3 != b91Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(x81Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(x81Var2);
                                } else {
                                    b91Var3.addView(x81Var2, 1);
                                }
                            }
                            x81Var2.d(false, false);
                            y81Var2.i(false, null, xf0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f22624c0 = imageView3;
        imageView3.setScaleType(scaleType);
        x81Var.addView(imageView3, w7.x5.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final b91 f27583b;

            {
                this.f27583b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        b91 b91Var = this.f27583b;
                        if (b91Var.f22637w && !b91Var.S && !b91Var.W && b91Var.M) {
                            b91Var.T = !b91Var.T;
                            b91Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        b91 b91Var2 = this.f27583b;
                        f71 f71Var2 = b91Var2.f22619a;
                        if (b91Var2.f22637w && b91Var2.f22638x != null) {
                            if (f71Var2.d == null) {
                                b91Var2.i();
                            }
                            if (f71Var2.y()) {
                                f71Var2.B();
                            } else {
                                b91Var2.V = false;
                                f71Var2.C();
                            }
                            b91Var2.n();
                            return;
                        }
                        return;
                    default:
                        b91 b91Var3 = this.f27583b;
                        ViewGroup viewGroup = b91Var3.f22627f;
                        boolean z11 = b91Var3.I;
                        y81 y81Var2 = b91Var3.v;
                        x81 x81Var2 = b91Var3.f22628f0;
                        xf0 xf0Var2 = b91Var3.f22623c;
                        TextureView textureView2 = b91Var3.d;
                        if (textureView2 != null && y81Var2.h() && !b91Var3.S && !b91Var3.W && b91Var3.M) {
                            b91Var3.W = true;
                            if (!b91Var3.U) {
                                b91Var3.T = false;
                                y81Var2.i(true, b91Var3.f22633k0, xf0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) xf0Var2.getParent();
                            if (viewGroup2 != b91Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(xf0Var2);
                                }
                                b91Var3.addView(xf0Var2, 0, w7.x5.e(-1, -1, 17));
                                xf0Var2.measure(View.MeasureSpec.makeMeasureSpec(b91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(b91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = b91Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                b91Var3.h = null;
                            }
                            b91Var3.S = true;
                            b91Var3.U = false;
                            b91Var3.n();
                            b91Var3.o();
                            b91Var3.k();
                            b91Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                xf0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) x81Var2.getParent();
                            if (viewGroup3 != b91Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(x81Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(x81Var2);
                                } else {
                                    b91Var3.addView(x81Var2, 1);
                                }
                            }
                            x81Var2.d(false, false);
                            y81Var2.i(false, null, xf0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f22625d0 = imageView4;
            imageView4.setScaleType(scaleType);
            x81Var.addView(imageView4, w7.x5.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final b91 f27583b;

                {
                    this.f27583b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            b91 b91Var = this.f27583b;
                            if (b91Var.f22637w && !b91Var.S && !b91Var.W && b91Var.M) {
                                b91Var.T = !b91Var.T;
                                b91Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            b91 b91Var2 = this.f27583b;
                            f71 f71Var2 = b91Var2.f22619a;
                            if (b91Var2.f22637w && b91Var2.f22638x != null) {
                                if (f71Var2.d == null) {
                                    b91Var2.i();
                                }
                                if (f71Var2.y()) {
                                    f71Var2.B();
                                } else {
                                    b91Var2.V = false;
                                    f71Var2.C();
                                }
                                b91Var2.n();
                                return;
                            }
                            return;
                        default:
                            b91 b91Var3 = this.f27583b;
                            ViewGroup viewGroup = b91Var3.f22627f;
                            boolean z11 = b91Var3.I;
                            y81 y81Var2 = b91Var3.v;
                            x81 x81Var2 = b91Var3.f22628f0;
                            xf0 xf0Var2 = b91Var3.f22623c;
                            TextureView textureView2 = b91Var3.d;
                            if (textureView2 != null && y81Var2.h() && !b91Var3.S && !b91Var3.W && b91Var3.M) {
                                b91Var3.W = true;
                                if (!b91Var3.U) {
                                    b91Var3.T = false;
                                    y81Var2.i(true, b91Var3.f22633k0, xf0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) xf0Var2.getParent();
                                if (viewGroup2 != b91Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(xf0Var2);
                                    }
                                    b91Var3.addView(xf0Var2, 0, w7.x5.e(-1, -1, 17));
                                    xf0Var2.measure(View.MeasureSpec.makeMeasureSpec(b91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(b91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                }
                                Bitmap bitmap = b91Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    b91Var3.h = null;
                                }
                                b91Var3.S = true;
                                b91Var3.U = false;
                                b91Var3.n();
                                b91Var3.o();
                                b91Var3.k();
                                b91Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    xf0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) x81Var2.getParent();
                                if (viewGroup3 != b91Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(x81Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(x81Var2);
                                    } else {
                                        b91Var3.addView(x81Var2, 1);
                                    }
                                }
                                x81Var2.d(false, false);
                                y81Var2.i(false, null, xf0Var2.getAspectRatio(), z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b91.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b91.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f22606n0.matcher(str);
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
        Matcher matcher = f22605l0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f22628f0;
    }

    private View getProgressView() {
        return this.f22620a0;
    }

    public final void b() {
        this.f22619a.H();
        AsyncTask asyncTask = this.R;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.R = null;
        }
        this.f22621b.stopLoading();
    }

    public final boolean f() {
        if (!this.U && !this.W) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r27, org.telegram.tgnet.TLRPC.Photo r28, java.lang.Object r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b91.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f22623c;
    }

    public View getControlsView() {
        return this.f22628f0;
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
        x81 x81Var = this.f22628f0;
        if (x81Var.getParent() != this) {
            x81Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.f22638x;
        if (str != null) {
            String str2 = this.E;
            f71 f71Var = this.f22619a;
            if (str2 != null) {
                f71Var.G(Uri.parse(str), this.f22639y, Uri.parse(this.E), this.F);
            } else {
                f71Var.D(Uri.parse(str), this.f22639y);
            }
            f71Var.P(this.f22636s);
            long p5 = f71Var.p();
            x81 x81Var = this.f22628f0;
            if (p5 != -9223372036854775807L) {
                x81Var.b((int) (f71Var.p() / 1000));
            } else {
                x81Var.b(0);
            }
            k();
            o();
            m();
            x81Var.invalidate();
            int i10 = this.O;
            if (i10 != -1) {
                f71Var.L(i10 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f7 = 0.0f;
        RadialProgressView radialProgressView = this.f22620a0;
        if (z11) {
            AnimatorSet animatorSet = this.f22626e0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f22626e0 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f7));
            this.f22626e0.setDuration(150L);
            this.f22626e0.addListener(new u81(this, 0));
            this.f22626e0.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        radialProgressView.setAlpha(f7);
    }

    public final void k() {
        i2.f0 f0Var = this.f22619a.d;
        ImageView imageView = this.f22622b0;
        if (f0Var != null && !this.U) {
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
        ViewGroup viewGroup2 = this.f22627f;
        xf0 xf0Var = this.f22623c;
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
            x81 x81Var = this.f22628f0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) x81Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(x81Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) x81Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(x81Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(x81Var);
                    } else {
                        addView(x81Var, 1);
                    }
                }
            }
            TextureView a2 = this.v.a(this.f22628f0, this.T, xf0Var.getAspectRatio(), xf0Var.getVideoRotation(), z10);
            this.f22634n = a2;
            a2.setVisibility(4);
            if (this.T && this.f22634n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i10 = x81.I;
            x81Var.a();
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
        this.v.a(this.f22628f0, this.T, xf0Var.getAspectRatio(), xf0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i10;
        int i11;
        ImageView imageView = this.f22625d0;
        if (imageView == null) {
            return;
        }
        if (this.U) {
            i10 = R.drawable.ic_goinline;
        } else {
            i10 = R.drawable.ic_outinline;
        }
        imageView.setImageResource(i10);
        if (this.f22619a.d != null) {
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
        x81 x81Var = this.f22628f0;
        int i13 = x81.I;
        x81Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.f22631i0);
        if (!this.f22619a.y()) {
            if (this.V) {
                ImageView imageView = this.f22624c0;
                if (this.U) {
                    i12 = R.drawable.ic_againinline;
                } else {
                    i12 = R.drawable.ic_again;
                }
                imageView.setImageResource(i12);
                return;
            }
            ImageView imageView2 = this.f22624c0;
            if (this.U) {
                i11 = R.drawable.ic_playinline;
            } else {
                i11 = R.drawable.ic_play;
            }
            imageView2.setImageResource(i11);
            return;
        }
        ImageView imageView3 = this.f22624c0;
        if (this.U) {
            i10 = R.drawable.ic_pauseinline;
        } else {
            i10 = R.drawable.ic_pause;
        }
        imageView3.setImageResource(i10);
        AndroidUtilities.runOnUIThread(this.f22631i0, 500L);
        if (!this.J) {
            this.J = true;
            ((AudioManager) ApplicationLoader.applicationContext.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new kd(this, i10, 13));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.Q);
    }

    @Override
    public final void onError(f71 f71Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        xf0 xf0Var = this.f22623c;
        int measuredWidth = (i14 - xf0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - xf0Var.getMeasuredHeight()) / 2;
        xf0Var.layout(measuredWidth, dp, xf0Var.getMeasuredWidth() + measuredWidth, xf0Var.getMeasuredHeight() + dp);
        x81 x81Var = this.f22628f0;
        if (x81Var.getParent() == this) {
            x81Var.layout(0, 0, x81Var.getMeasuredWidth(), x81Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f22620a0;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        x81Var.f29958a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f22623c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        x81 x81Var = this.f22628f0;
        if (x81Var.getParent() == this) {
            x81Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f22620a0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        x81 x81Var = this.f22628f0;
        f71 f71Var = this.f22619a;
        if (i10 != 2) {
            if (f71Var.p() != -9223372036854775807L) {
                x81Var.b((int) (f71Var.p() / 1000));
            } else {
                x81Var.b(0);
            }
        }
        y81 y81Var = this.v;
        if (i10 != 4 && i10 != 1 && f71Var.y()) {
            y81Var.e(this, true);
        } else {
            y81Var.e(this, false);
        }
        if (f71Var.y() && i10 != 4) {
            n();
        } else if (i10 == 4) {
            this.V = true;
            f71Var.B();
            f71Var.L(0L, false);
            n();
            x81Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.S) {
            this.S = false;
            if (this.T || this.U) {
                if (this.U) {
                    this.f22635r = 1;
                }
                this.f22634n.setSurfaceTexture(surfaceTexture);
                this.f22634n.setSurfaceTextureListener(this.f22632j0);
                this.f22634n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f22635r == 2) {
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
            int i10 = this.f22629g0;
            int i11 = this.f22630h0;
            this.f22623c.getVideoRotation();
            this.v.f(this.f22628f0, false, i10, i11, this.I);
            this.f22635r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        xf0 xf0Var = this.f22623c;
        if (xf0Var != null) {
            float f11 = i10 * f7;
            this.f22629g0 = (int) f11;
            this.f22630h0 = i11;
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
        this.f22628f0.invalidate();
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
