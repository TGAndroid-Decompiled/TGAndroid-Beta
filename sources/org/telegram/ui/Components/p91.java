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
public final class p91 extends ViewGroup implements q71, AudioManager.OnAudioFocusChangeListener {
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
    public final t71 f27282a;
    public final RadialProgressView f27283a0;
    public final i91 f27284b;
    public final ImageView f27285b0;
    public final ig0 f27286c;
    public final ImageView f27287c0;
    public final TextureView d;
    public final ImageView f27288d0;
    public final ImageView e;
    public AnimatorSet f27289e0;
    public final ViewGroup f27290f;
    public final l91 f27291f0;
    public int f27292g0;
    public Bitmap h;
    public int f27293h0;
    public final h91 f27294i0;
    public final ki.d f27295j0;
    public final h91 f27296k0;
    public TextureView f27297n;
    public int f27298r;
    public boolean f27299s;
    public final m91 v;
    public boolean f27300w;
    public String f27301x;
    public String f27302y;
    public static final Pattern f27268l0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f27269n0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f27270o0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f27271p0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f27272q0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f27273r0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f27274s0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f27275t0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f27276u0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f27277v0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f27278w0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f27279x0 = Pattern.compile("var\\s");
    public static final Pattern f27280y0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f27281z0 = Pattern.compile("[()]");
    public static final Pattern A0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public p91(Context context, boolean z10, m91 m91Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.f27294i0 = new h91(this, 0);
        this.f27295j0 = new ki.d(this, 4);
        this.f27296k0 = new h91(this, 1);
        setWillNotDraw(false);
        this.v = m91Var;
        paint.setColor(-16777216);
        ig0 ig0Var = new ig0(this, context, 1);
        this.f27286c = ig0Var;
        addView(ig0Var, w7.y5.e(-1, -1, 17));
        i91 i91Var = new i91(context, context);
        this.f27284b = i91Var;
        final y71 y71Var = new y71(this);
        i91Var.addJavascriptInterface(new Object(y71Var) {
            public final y71 f22465a;

            {
                this.f22465a = y71Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                p91 p91Var = (p91) this.f22465a.f30581a;
                AsyncTask asyncTask = p91Var.R;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = p91Var.R;
                    if (asyncTask2 instanceof o91) {
                        o91 o91Var = (o91) asyncTask2;
                        String[] strArr = o91Var.f27011c;
                        String str2 = strArr[0];
                        String str3 = o91Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        o91Var.f27010b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = i91Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = m91Var.g();
        this.f27290f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            ig0Var.addView(textureView, w7.y5.e(-1, -1, 17));
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
        t71 t71Var = new t71();
        this.f27282a = t71Var;
        t71Var.J = this;
        t71Var.V(textureView);
        l91 l91Var = new l91(this, context);
        this.f27291f0 = l91Var;
        if (g10 != null) {
            g10.addView(l91Var);
        } else {
            addView(l91Var, w7.y5.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f27283a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, w7.y5.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f27285b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        l91Var.addView(imageView2, w7.y5.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final p91 f24440b;

            {
                this.f24440b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        p91 p91Var = this.f24440b;
                        if (p91Var.f27300w && !p91Var.S && !p91Var.W && p91Var.M) {
                            p91Var.T = !p91Var.T;
                            p91Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        p91 p91Var2 = this.f24440b;
                        t71 t71Var2 = p91Var2.f27282a;
                        if (p91Var2.f27300w && p91Var2.f27301x != null) {
                            if (t71Var2.d == null) {
                                p91Var2.i();
                            }
                            if (t71Var2.y()) {
                                t71Var2.B();
                            } else {
                                p91Var2.V = false;
                                t71Var2.C();
                            }
                            p91Var2.n();
                            return;
                        }
                        return;
                    default:
                        p91 p91Var3 = this.f24440b;
                        ViewGroup viewGroup = p91Var3.f27290f;
                        boolean z11 = p91Var3.I;
                        m91 m91Var2 = p91Var3.v;
                        l91 l91Var2 = p91Var3.f27291f0;
                        ig0 ig0Var2 = p91Var3.f27286c;
                        TextureView textureView2 = p91Var3.d;
                        if (textureView2 != null && m91Var2.h() && !p91Var3.S && !p91Var3.W && p91Var3.M) {
                            p91Var3.W = true;
                            if (!p91Var3.U) {
                                p91Var3.T = false;
                                m91Var2.i(true, p91Var3.f27296k0, ig0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) ig0Var2.getParent();
                            if (viewGroup2 != p91Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(ig0Var2);
                                }
                                p91Var3.addView(ig0Var2, 0, w7.y5.e(-1, -1, 17));
                                ig0Var2.measure(View.MeasureSpec.makeMeasureSpec(p91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(p91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = p91Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                p91Var3.h = null;
                            }
                            p91Var3.S = true;
                            p91Var3.U = false;
                            p91Var3.n();
                            p91Var3.o();
                            p91Var3.k();
                            p91Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                ig0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) l91Var2.getParent();
                            if (viewGroup3 != p91Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(l91Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(l91Var2);
                                } else {
                                    p91Var3.addView(l91Var2, 1);
                                }
                            }
                            l91Var2.d(false, false);
                            m91Var2.i(false, null, ig0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f27287c0 = imageView3;
        imageView3.setScaleType(scaleType);
        l91Var.addView(imageView3, w7.y5.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final p91 f24440b;

            {
                this.f24440b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        p91 p91Var = this.f24440b;
                        if (p91Var.f27300w && !p91Var.S && !p91Var.W && p91Var.M) {
                            p91Var.T = !p91Var.T;
                            p91Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        p91 p91Var2 = this.f24440b;
                        t71 t71Var2 = p91Var2.f27282a;
                        if (p91Var2.f27300w && p91Var2.f27301x != null) {
                            if (t71Var2.d == null) {
                                p91Var2.i();
                            }
                            if (t71Var2.y()) {
                                t71Var2.B();
                            } else {
                                p91Var2.V = false;
                                t71Var2.C();
                            }
                            p91Var2.n();
                            return;
                        }
                        return;
                    default:
                        p91 p91Var3 = this.f24440b;
                        ViewGroup viewGroup = p91Var3.f27290f;
                        boolean z11 = p91Var3.I;
                        m91 m91Var2 = p91Var3.v;
                        l91 l91Var2 = p91Var3.f27291f0;
                        ig0 ig0Var2 = p91Var3.f27286c;
                        TextureView textureView2 = p91Var3.d;
                        if (textureView2 != null && m91Var2.h() && !p91Var3.S && !p91Var3.W && p91Var3.M) {
                            p91Var3.W = true;
                            if (!p91Var3.U) {
                                p91Var3.T = false;
                                m91Var2.i(true, p91Var3.f27296k0, ig0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) ig0Var2.getParent();
                            if (viewGroup2 != p91Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(ig0Var2);
                                }
                                p91Var3.addView(ig0Var2, 0, w7.y5.e(-1, -1, 17));
                                ig0Var2.measure(View.MeasureSpec.makeMeasureSpec(p91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(p91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = p91Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                p91Var3.h = null;
                            }
                            p91Var3.S = true;
                            p91Var3.U = false;
                            p91Var3.n();
                            p91Var3.o();
                            p91Var3.k();
                            p91Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                ig0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) l91Var2.getParent();
                            if (viewGroup3 != p91Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(l91Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(l91Var2);
                                } else {
                                    p91Var3.addView(l91Var2, 1);
                                }
                            }
                            l91Var2.d(false, false);
                            m91Var2.i(false, null, ig0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f27288d0 = imageView4;
            imageView4.setScaleType(scaleType);
            l91Var.addView(imageView4, w7.y5.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final p91 f24440b;

                {
                    this.f24440b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            p91 p91Var = this.f24440b;
                            if (p91Var.f27300w && !p91Var.S && !p91Var.W && p91Var.M) {
                                p91Var.T = !p91Var.T;
                                p91Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            p91 p91Var2 = this.f24440b;
                            t71 t71Var2 = p91Var2.f27282a;
                            if (p91Var2.f27300w && p91Var2.f27301x != null) {
                                if (t71Var2.d == null) {
                                    p91Var2.i();
                                }
                                if (t71Var2.y()) {
                                    t71Var2.B();
                                } else {
                                    p91Var2.V = false;
                                    t71Var2.C();
                                }
                                p91Var2.n();
                                return;
                            }
                            return;
                        default:
                            p91 p91Var3 = this.f24440b;
                            ViewGroup viewGroup = p91Var3.f27290f;
                            boolean z11 = p91Var3.I;
                            m91 m91Var2 = p91Var3.v;
                            l91 l91Var2 = p91Var3.f27291f0;
                            ig0 ig0Var2 = p91Var3.f27286c;
                            TextureView textureView2 = p91Var3.d;
                            if (textureView2 != null && m91Var2.h() && !p91Var3.S && !p91Var3.W && p91Var3.M) {
                                p91Var3.W = true;
                                if (!p91Var3.U) {
                                    p91Var3.T = false;
                                    m91Var2.i(true, p91Var3.f27296k0, ig0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) ig0Var2.getParent();
                                if (viewGroup2 != p91Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(ig0Var2);
                                    }
                                    p91Var3.addView(ig0Var2, 0, w7.y5.e(-1, -1, 17));
                                    ig0Var2.measure(View.MeasureSpec.makeMeasureSpec(p91Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(p91Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                }
                                Bitmap bitmap = p91Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    p91Var3.h = null;
                                }
                                p91Var3.S = true;
                                p91Var3.U = false;
                                p91Var3.n();
                                p91Var3.o();
                                p91Var3.k();
                                p91Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    ig0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) l91Var2.getParent();
                                if (viewGroup3 != p91Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(l91Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(l91Var2);
                                    } else {
                                        p91Var3.addView(l91Var2, 1);
                                    }
                                }
                                l91Var2.d(false, false);
                                m91Var2.i(false, null, ig0Var2.getAspectRatio(), z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p91.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p91.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f27269n0.matcher(str);
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
        Matcher matcher = f27268l0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f27291f0;
    }

    private View getProgressView() {
        return this.f27283a0;
    }

    public final void b() {
        this.f27282a.H();
        AsyncTask asyncTask = this.R;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.R = null;
        }
        this.f27284b.stopLoading();
    }

    public final boolean f() {
        if (!this.U && !this.W) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r27, org.telegram.tgnet.TLRPC.Photo r28, java.lang.Object r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p91.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f27286c;
    }

    public View getControlsView() {
        return this.f27291f0;
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
        l91 l91Var = this.f27291f0;
        if (l91Var.getParent() != this) {
            l91Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.f27301x;
        if (str != null) {
            String str2 = this.E;
            t71 t71Var = this.f27282a;
            if (str2 != null) {
                t71Var.G(Uri.parse(str), this.f27302y, Uri.parse(this.E), this.F);
            } else {
                t71Var.D(Uri.parse(str), this.f27302y);
            }
            t71Var.P(this.f27299s);
            long p5 = t71Var.p();
            l91 l91Var = this.f27291f0;
            if (p5 != -9223372036854775807L) {
                l91Var.b((int) (t71Var.p() / 1000));
            } else {
                l91Var.b(0);
            }
            k();
            o();
            m();
            l91Var.invalidate();
            int i10 = this.O;
            if (i10 != -1) {
                t71Var.L(i10 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f7 = 0.0f;
        RadialProgressView radialProgressView = this.f27283a0;
        if (z11) {
            AnimatorSet animatorSet = this.f27289e0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f27289e0 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f7));
            this.f27289e0.setDuration(150L);
            this.f27289e0.addListener(new r81(this, 1));
            this.f27289e0.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        radialProgressView.setAlpha(f7);
    }

    public final void k() {
        i2.f0 f0Var = this.f27282a.d;
        ImageView imageView = this.f27285b0;
        if (f0Var != null && !this.U) {
            imageView.setVisibility(0);
            if (!this.T) {
                imageView.setImageResource(R.drawable.ic_gofullscreen);
                imageView.setLayoutParams(w7.y5.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
                return;
            }
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(w7.y5.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
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
        ViewGroup viewGroup2 = this.f27290f;
        ig0 ig0Var = this.f27286c;
        if (viewGroup2 == null) {
            this.S = true;
            if (!this.T) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    ig0Var.addView(textureView);
                }
            }
            boolean z11 = this.T;
            l91 l91Var = this.f27291f0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) l91Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(l91Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) l91Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(l91Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(l91Var);
                    } else {
                        addView(l91Var, 1);
                    }
                }
            }
            TextureView a2 = this.v.a(this.f27291f0, this.T, ig0Var.getAspectRatio(), ig0Var.getVideoRotation(), z10);
            this.f27297n = a2;
            a2.setVisibility(4);
            if (this.T && this.f27297n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i10 = l91.I;
            l91Var.a();
            return;
        }
        if (this.T) {
            ViewGroup viewGroup5 = (ViewGroup) ig0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(ig0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) ig0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(ig0Var);
                }
                addView(ig0Var, 0);
            }
        }
        this.v.a(this.f27291f0, this.T, ig0Var.getAspectRatio(), ig0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i10;
        int i11;
        ImageView imageView = this.f27288d0;
        if (imageView == null) {
            return;
        }
        if (this.U) {
            i10 = R.drawable.ic_goinline;
        } else {
            i10 = R.drawable.ic_outinline;
        }
        imageView.setImageResource(i10);
        if (this.f27282a.d != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView.setVisibility(i11);
        if (this.U) {
            imageView.setLayoutParams(w7.y5.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(w7.y5.e(56, 50, 53));
        }
    }

    public final void n() {
        int i10;
        int i11;
        int i12;
        l91 l91Var = this.f27291f0;
        int i13 = l91.I;
        l91Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.f27294i0);
        if (!this.f27282a.y()) {
            if (this.V) {
                ImageView imageView = this.f27287c0;
                if (this.U) {
                    i12 = R.drawable.ic_againinline;
                } else {
                    i12 = R.drawable.ic_again;
                }
                imageView.setImageResource(i12);
                return;
            }
            ImageView imageView2 = this.f27287c0;
            if (this.U) {
                i11 = R.drawable.ic_playinline;
            } else {
                i11 = R.drawable.ic_play;
            }
            imageView2.setImageResource(i11);
            return;
        }
        ImageView imageView3 = this.f27287c0;
        if (this.U) {
            i10 = R.drawable.ic_pauseinline;
        } else {
            i10 = R.drawable.ic_pause;
        }
        imageView3.setImageResource(i10);
        AndroidUtilities.runOnUIThread(this.f27294i0, 500L);
        if (!this.J) {
            this.J = true;
            ((AudioManager) ApplicationLoader.applicationContext.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new ld(this, i10, 13));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.Q);
    }

    @Override
    public final void onError(t71 t71Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        ig0 ig0Var = this.f27286c;
        int measuredWidth = (i14 - ig0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - ig0Var.getMeasuredHeight()) / 2;
        ig0Var.layout(measuredWidth, dp, ig0Var.getMeasuredWidth() + measuredWidth, ig0Var.getMeasuredHeight() + dp);
        l91 l91Var = this.f27291f0;
        if (l91Var.getParent() == this) {
            l91Var.layout(0, 0, l91Var.getMeasuredWidth(), l91Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f27283a0;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        l91Var.f26016a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f27286c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        l91 l91Var = this.f27291f0;
        if (l91Var.getParent() == this) {
            l91Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f27283a0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        l91 l91Var = this.f27291f0;
        t71 t71Var = this.f27282a;
        if (i10 != 2) {
            if (t71Var.p() != -9223372036854775807L) {
                l91Var.b((int) (t71Var.p() / 1000));
            } else {
                l91Var.b(0);
            }
        }
        m91 m91Var = this.v;
        if (i10 != 4 && i10 != 1 && t71Var.y()) {
            m91Var.e(this, true);
        } else {
            m91Var.e(this, false);
        }
        if (t71Var.y() && i10 != 4) {
            n();
        } else if (i10 == 4) {
            this.V = true;
            t71Var.B();
            t71Var.L(0L, false);
            n();
            l91Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.S) {
            this.S = false;
            if (this.T || this.U) {
                if (this.U) {
                    this.f27298r = 1;
                }
                this.f27297n.setSurfaceTexture(surfaceTexture);
                this.f27297n.setSurfaceTextureListener(this.f27295j0);
                this.f27297n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f27298r == 2) {
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
            int i10 = this.f27292g0;
            int i11 = this.f27293h0;
            this.f27286c.getVideoRotation();
            this.v.f(this.f27291f0, false, i10, i11, this.I);
            this.f27298r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        ig0 ig0Var = this.f27286c;
        if (ig0Var != null) {
            float f11 = i10 * f7;
            this.f27292g0 = (int) f11;
            this.f27293h0 = i11;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / i11;
            }
            ig0Var.a(f10, 0);
            if (this.T) {
                this.v.c(f10);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.M = true;
        this.L = System.currentTimeMillis();
        this.f27291f0.invalidate();
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
