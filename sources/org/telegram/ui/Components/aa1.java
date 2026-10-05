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
public final class aa1 extends ViewGroup implements b81, AudioManager.OnAudioFocusChangeListener {
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
    public final e81 f24554a;
    public final RadialProgressView f24555a0;
    public final t91 f24556b;
    public final ImageView f24557b0;
    public final kg0 f24558c;
    public final ImageView f24559c0;
    public final TextureView d;
    public final ImageView f24560d0;
    public final ImageView f24561e;
    public AnimatorSet f24562e0;
    public final ViewGroup f24563f;
    public final w91 f24564f0;
    public int f24565g0;
    public Bitmap h;
    public int f24566h0;
    public final s91 f24567i0;
    public final ki.d f24568j0;
    public final s91 f24569k0;
    public TextureView f24570n;
    public int f24571r;
    public boolean f24572s;
    public final x91 v;
    public boolean f24573w;
    public String f24574x;
    public String f24575y;
    public static final Pattern f24540l0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern m0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern f24541n0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern f24542o0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern f24543p0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern f24544q0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern f24545r0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern f24546s0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern f24547t0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern f24548u0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern f24549v0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern f24550w0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern f24551x0 = Pattern.compile("var\\s");
    public static final Pattern f24552y0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern f24553z0 = Pattern.compile("[()]");
    public static final Pattern A0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public aa1(Context context, boolean z10, x91 x91Var) {
        super(context);
        this.I = true;
        Paint paint = new Paint();
        this.Q = paint;
        this.f24567i0 = new s91(this, 0);
        this.f24568j0 = new ki.d(this, 4);
        this.f24569k0 = new s91(this, 1);
        setWillNotDraw(false);
        this.v = x91Var;
        paint.setColor(-16777216);
        kg0 kg0Var = new kg0(this, context, 1);
        this.f24558c = kg0Var;
        addView(kg0Var, w7.z5.e(-1, -1, 17));
        t91 t91Var = new t91(context, context);
        this.f24556b = t91Var;
        final q91 q91Var = new q91(this);
        t91Var.addJavascriptInterface(new Object(q91Var) {
            public final q91 f24391a;

            {
                this.f24391a = q91Var;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                aa1 aa1Var = (aa1) this.f24391a.f29998a;
                AsyncTask asyncTask = aa1Var.R;
                if (asyncTask != null && !asyncTask.isCancelled()) {
                    AsyncTask asyncTask2 = aa1Var.R;
                    if (asyncTask2 instanceof z91) {
                        z91 z91Var = (z91) asyncTask2;
                        String[] strArr = z91Var.f33474c;
                        String str2 = strArr[0];
                        String str3 = z91Var.d;
                        strArr[0] = str2.replace(str3, "/signature/" + str);
                        z91Var.f33473b.countDown();
                    }
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = t91Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup g10 = x91Var.g();
        this.f24563f = g10;
        TextureView textureView = new TextureView(context);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (g10 != null) {
            g10.addView(textureView);
        } else {
            kg0Var.addView(textureView, w7.z5.e(-1, -1, 17));
        }
        if (g10 != null) {
            ImageView imageView = new ImageView(context);
            this.f24561e = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            g10.addView(imageView);
        }
        e81 e81Var = new e81();
        this.f24554a = e81Var;
        e81Var.J = this;
        e81Var.V(textureView);
        w91 w91Var = new w91(this, context);
        this.f24564f0 = w91Var;
        if (g10 != null) {
            g10.addView(w91Var);
        } else {
            addView(w91Var, w7.z5.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f24555a0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, w7.z5.e(48, 48, 17));
        ImageView imageView2 = new ImageView(context);
        this.f24557b0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        w91Var.addView(imageView2, w7.z5.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final aa1 f30405b;

            {
                this.f30405b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        aa1 aa1Var = this.f30405b;
                        if (aa1Var.f24573w && !aa1Var.S && !aa1Var.W && aa1Var.M) {
                            aa1Var.T = !aa1Var.T;
                            aa1Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        aa1 aa1Var2 = this.f30405b;
                        e81 e81Var2 = aa1Var2.f24554a;
                        if (aa1Var2.f24573w && aa1Var2.f24574x != null) {
                            if (e81Var2.d == null) {
                                aa1Var2.i();
                            }
                            if (e81Var2.y()) {
                                e81Var2.B();
                            } else {
                                aa1Var2.V = false;
                                e81Var2.C();
                            }
                            aa1Var2.n();
                            return;
                        }
                        return;
                    default:
                        aa1 aa1Var3 = this.f30405b;
                        ViewGroup viewGroup = aa1Var3.f24563f;
                        boolean z11 = aa1Var3.I;
                        x91 x91Var2 = aa1Var3.v;
                        w91 w91Var2 = aa1Var3.f24564f0;
                        kg0 kg0Var2 = aa1Var3.f24558c;
                        TextureView textureView2 = aa1Var3.d;
                        if (textureView2 != null && x91Var2.h() && !aa1Var3.S && !aa1Var3.W && aa1Var3.M) {
                            aa1Var3.W = true;
                            if (!aa1Var3.U) {
                                aa1Var3.T = false;
                                x91Var2.i(true, aa1Var3.f24569k0, kg0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) kg0Var2.getParent();
                            if (viewGroup2 != aa1Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(kg0Var2);
                                }
                                aa1Var3.addView(kg0Var2, 0, w7.z5.e(-1, -1, 17));
                                kg0Var2.measure(View.MeasureSpec.makeMeasureSpec(aa1Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(aa1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = aa1Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                aa1Var3.h = null;
                            }
                            aa1Var3.S = true;
                            aa1Var3.U = false;
                            aa1Var3.n();
                            aa1Var3.o();
                            aa1Var3.k();
                            aa1Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                kg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) w91Var2.getParent();
                            if (viewGroup3 != aa1Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(w91Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(w91Var2);
                                } else {
                                    aa1Var3.addView(w91Var2, 1);
                                }
                            }
                            w91Var2.d(false, false);
                            x91Var2.i(false, null, kg0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.f24559c0 = imageView3;
        imageView3.setScaleType(scaleType);
        w91Var.addView(imageView3, w7.z5.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final aa1 f30405b;

            {
                this.f30405b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        aa1 aa1Var = this.f30405b;
                        if (aa1Var.f24573w && !aa1Var.S && !aa1Var.W && aa1Var.M) {
                            aa1Var.T = !aa1Var.T;
                            aa1Var.l(true);
                            return;
                        }
                        return;
                    case 1:
                        aa1 aa1Var2 = this.f30405b;
                        e81 e81Var2 = aa1Var2.f24554a;
                        if (aa1Var2.f24573w && aa1Var2.f24574x != null) {
                            if (e81Var2.d == null) {
                                aa1Var2.i();
                            }
                            if (e81Var2.y()) {
                                e81Var2.B();
                            } else {
                                aa1Var2.V = false;
                                e81Var2.C();
                            }
                            aa1Var2.n();
                            return;
                        }
                        return;
                    default:
                        aa1 aa1Var3 = this.f30405b;
                        ViewGroup viewGroup = aa1Var3.f24563f;
                        boolean z11 = aa1Var3.I;
                        x91 x91Var2 = aa1Var3.v;
                        w91 w91Var2 = aa1Var3.f24564f0;
                        kg0 kg0Var2 = aa1Var3.f24558c;
                        TextureView textureView2 = aa1Var3.d;
                        if (textureView2 != null && x91Var2.h() && !aa1Var3.S && !aa1Var3.W && aa1Var3.M) {
                            aa1Var3.W = true;
                            if (!aa1Var3.U) {
                                aa1Var3.T = false;
                                x91Var2.i(true, aa1Var3.f24569k0, kg0Var2.getAspectRatio(), z11);
                                return;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) kg0Var2.getParent();
                            if (viewGroup2 != aa1Var3) {
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(kg0Var2);
                                }
                                aa1Var3.addView(kg0Var2, 0, w7.z5.e(-1, -1, 17));
                                kg0Var2.measure(View.MeasureSpec.makeMeasureSpec(aa1Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(aa1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                            }
                            Bitmap bitmap = aa1Var3.h;
                            if (bitmap != null) {
                                bitmap.recycle();
                                aa1Var3.h = null;
                            }
                            aa1Var3.S = true;
                            aa1Var3.U = false;
                            aa1Var3.n();
                            aa1Var3.o();
                            aa1Var3.k();
                            aa1Var3.m();
                            textureView2.setVisibility(4);
                            if (viewGroup != null) {
                                viewGroup.addView(textureView2);
                            } else {
                                kg0Var2.addView(textureView2);
                            }
                            ViewGroup viewGroup3 = (ViewGroup) w91Var2.getParent();
                            if (viewGroup3 != aa1Var3) {
                                if (viewGroup3 != null) {
                                    viewGroup3.removeView(w91Var2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.addView(w91Var2);
                                } else {
                                    aa1Var3.addView(w91Var2, 1);
                                }
                            }
                            w91Var2.d(false, false);
                            x91Var2.i(false, null, kg0Var2.getAspectRatio(), z11);
                            return;
                        }
                        return;
                }
            }
        });
        if (z10) {
            ImageView imageView4 = new ImageView(context);
            this.f24560d0 = imageView4;
            imageView4.setScaleType(scaleType);
            w91Var.addView(imageView4, w7.z5.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) {
                public final aa1 f30405b;

                {
                    this.f30405b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            aa1 aa1Var = this.f30405b;
                            if (aa1Var.f24573w && !aa1Var.S && !aa1Var.W && aa1Var.M) {
                                aa1Var.T = !aa1Var.T;
                                aa1Var.l(true);
                                return;
                            }
                            return;
                        case 1:
                            aa1 aa1Var2 = this.f30405b;
                            e81 e81Var2 = aa1Var2.f24554a;
                            if (aa1Var2.f24573w && aa1Var2.f24574x != null) {
                                if (e81Var2.d == null) {
                                    aa1Var2.i();
                                }
                                if (e81Var2.y()) {
                                    e81Var2.B();
                                } else {
                                    aa1Var2.V = false;
                                    e81Var2.C();
                                }
                                aa1Var2.n();
                                return;
                            }
                            return;
                        default:
                            aa1 aa1Var3 = this.f30405b;
                            ViewGroup viewGroup = aa1Var3.f24563f;
                            boolean z11 = aa1Var3.I;
                            x91 x91Var2 = aa1Var3.v;
                            w91 w91Var2 = aa1Var3.f24564f0;
                            kg0 kg0Var2 = aa1Var3.f24558c;
                            TextureView textureView2 = aa1Var3.d;
                            if (textureView2 != null && x91Var2.h() && !aa1Var3.S && !aa1Var3.W && aa1Var3.M) {
                                aa1Var3.W = true;
                                if (!aa1Var3.U) {
                                    aa1Var3.T = false;
                                    x91Var2.i(true, aa1Var3.f24569k0, kg0Var2.getAspectRatio(), z11);
                                    return;
                                }
                                ViewGroup viewGroup2 = (ViewGroup) kg0Var2.getParent();
                                if (viewGroup2 != aa1Var3) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(kg0Var2);
                                    }
                                    aa1Var3.addView(kg0Var2, 0, w7.z5.e(-1, -1, 17));
                                    kg0Var2.measure(View.MeasureSpec.makeMeasureSpec(aa1Var3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(aa1Var3.getMeasuredHeight() - AndroidUtilities.dp(10.0f), 1073741824));
                                }
                                Bitmap bitmap = aa1Var3.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    aa1Var3.h = null;
                                }
                                aa1Var3.S = true;
                                aa1Var3.U = false;
                                aa1Var3.n();
                                aa1Var3.o();
                                aa1Var3.k();
                                aa1Var3.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    kg0Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) w91Var2.getParent();
                                if (viewGroup3 != aa1Var3) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(w91Var2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(w91Var2);
                                    } else {
                                        aa1Var3.addView(w91Var2, 1);
                                    }
                                }
                                w91Var2.d(false, false);
                                x91Var2.i(false, null, kg0Var2.getAspectRatio(), z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aa1.a(java.lang.String):boolean");
    }

    public static java.lang.String c(android.os.AsyncTask r18, java.lang.String r19, java.util.HashMap r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aa1.c(android.os.AsyncTask, java.lang.String, java.util.HashMap, boolean):java.lang.String");
    }

    public static String d(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = f24541n0.matcher(str);
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
        Matcher matcher = f24540l0.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.group(1);
    }

    private View getControlView() {
        return this.f24564f0;
    }

    private View getProgressView() {
        return this.f24555a0;
    }

    public final void b() {
        this.f24554a.H();
        AsyncTask asyncTask = this.R;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.R = null;
        }
        this.f24556b.stopLoading();
    }

    public final boolean f() {
        if (!this.U && !this.W) {
            return false;
        }
        return true;
    }

    public final boolean g(java.lang.String r27, org.telegram.tgnet.TLRPC.Photo r28, java.lang.Object r29, java.lang.String r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aa1.g(java.lang.String, org.telegram.tgnet.TLRPC$Photo, java.lang.Object, java.lang.String, boolean):boolean");
    }

    public View getAspectRatioView() {
        return this.f24558c;
    }

    public View getControlsView() {
        return this.f24564f0;
    }

    public ImageView getTextureImageView() {
        return this.f24561e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.G;
    }

    public final void h() {
        w91 w91Var = this.f24564f0;
        if (w91Var.getParent() != this) {
            w91Var.setVisibility(8);
        }
        this.v.d();
    }

    public final void i() {
        String str = this.f24574x;
        if (str != null) {
            String str2 = this.E;
            e81 e81Var = this.f24554a;
            if (str2 != null) {
                e81Var.G(Uri.parse(str), this.f24575y, Uri.parse(this.E), this.F);
            } else {
                e81Var.D(Uri.parse(str), this.f24575y);
            }
            e81Var.P(this.f24572s);
            long p5 = e81Var.p();
            w91 w91Var = this.f24564f0;
            if (p5 != -9223372036854775807L) {
                w91Var.b((int) (e81Var.p() / 1000));
            } else {
                w91Var.b(0);
            }
            k();
            o();
            m();
            w91Var.invalidate();
            int i10 = this.O;
            if (i10 != -1) {
                e81Var.L(i10 * 1000, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        float f7 = 0.0f;
        RadialProgressView radialProgressView = this.f24555a0;
        if (z11) {
            AnimatorSet animatorSet = this.f24562e0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f24562e0 = animatorSet2;
            if (z10) {
                f7 = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", f7));
            this.f24562e0.setDuration(150L);
            this.f24562e0.addListener(new b91(this, 1));
            this.f24562e0.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        radialProgressView.setAlpha(f7);
    }

    public final void k() {
        i2.f0 f0Var = this.f24554a.d;
        ImageView imageView = this.f24557b0;
        if (f0Var != null && !this.U) {
            imageView.setVisibility(0);
            if (!this.T) {
                imageView.setImageResource(R.drawable.ic_gofullscreen);
                imageView.setLayoutParams(w7.z5.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
                return;
            }
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(w7.z5.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
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
        ViewGroup viewGroup2 = this.f24563f;
        kg0 kg0Var = this.f24558c;
        if (viewGroup2 == null) {
            this.S = true;
            if (!this.T) {
                if (viewGroup2 != null) {
                    viewGroup2.addView(textureView);
                } else {
                    kg0Var.addView(textureView);
                }
            }
            boolean z11 = this.T;
            w91 w91Var = this.f24564f0;
            if (z11) {
                ViewGroup viewGroup3 = (ViewGroup) w91Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(w91Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) w91Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(w91Var);
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.addView(w91Var);
                    } else {
                        addView(w91Var, 1);
                    }
                }
            }
            TextureView a2 = this.v.a(this.f24564f0, this.T, kg0Var.getAspectRatio(), kg0Var.getVideoRotation(), z10);
            this.f24570n = a2;
            a2.setVisibility(4);
            if (this.T && this.f24570n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
                viewGroup.removeView(textureView);
            }
            int i10 = w91.I;
            w91Var.a();
            return;
        }
        if (this.T) {
            ViewGroup viewGroup5 = (ViewGroup) kg0Var.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(kg0Var);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) kg0Var.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(kg0Var);
                }
                addView(kg0Var, 0);
            }
        }
        this.v.a(this.f24564f0, this.T, kg0Var.getAspectRatio(), kg0Var.getVideoRotation(), z10);
    }

    public final void m() {
        int i10;
        int i11;
        ImageView imageView = this.f24560d0;
        if (imageView == null) {
            return;
        }
        if (this.U) {
            i10 = R.drawable.ic_goinline;
        } else {
            i10 = R.drawable.ic_outinline;
        }
        imageView.setImageResource(i10);
        if (this.f24554a.d != null) {
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
        w91 w91Var = this.f24564f0;
        int i13 = w91.I;
        w91Var.a();
        AndroidUtilities.cancelRunOnUIThread(this.f24567i0);
        if (!this.f24554a.y()) {
            if (this.V) {
                ImageView imageView = this.f24559c0;
                if (this.U) {
                    i12 = R.drawable.ic_againinline;
                } else {
                    i12 = R.drawable.ic_again;
                }
                imageView.setImageResource(i12);
                return;
            }
            ImageView imageView2 = this.f24559c0;
            if (this.U) {
                i11 = R.drawable.ic_playinline;
            } else {
                i11 = R.drawable.ic_play;
            }
            imageView2.setImageResource(i11);
            return;
        }
        ImageView imageView3 = this.f24559c0;
        if (this.U) {
            i10 = R.drawable.ic_pauseinline;
        } else {
            i10 = R.drawable.ic_pause;
        }
        imageView3.setImageResource(i10);
        AndroidUtilities.runOnUIThread(this.f24567i0, 500L);
        if (!this.J) {
            this.J = true;
            ((AudioManager) ApplicationLoader.applicationContext.getSystemService("audio")).requestAudioFocus(this, 3, 1);
        }
    }

    @Override
    public final void onAudioFocusChange(int i10) {
        AndroidUtilities.runOnUIThread(new ld(this, i10, 12));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f), this.Q);
    }

    @Override
    public final void onError(e81 e81Var, Exception exc) {
        FileLog.e(exc);
        h();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        kg0 kg0Var = this.f24558c;
        int measuredWidth = (i14 - kg0Var.getMeasuredWidth()) / 2;
        int i15 = i13 - i11;
        int dp = ((i15 - AndroidUtilities.dp(10.0f)) - kg0Var.getMeasuredHeight()) / 2;
        kg0Var.layout(measuredWidth, dp, kg0Var.getMeasuredWidth() + measuredWidth, kg0Var.getMeasuredHeight() + dp);
        w91 w91Var = this.f24564f0;
        if (w91Var.getParent() == this) {
            w91Var.layout(0, 0, w91Var.getMeasuredWidth(), w91Var.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.f24555a0;
        int measuredWidth2 = (i14 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i15 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        w91Var.f32583a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(10.0f));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f24558c.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - AndroidUtilities.dp(10.0f), 1073741824));
        w91 w91Var = this.f24564f0;
        if (w91Var.getParent() == this) {
            w91Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f24555a0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), 1073741824));
        setMeasuredDimension(size, size2);
    }

    @Override
    public final void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public final void onStateChanged(boolean z10, int i10) {
        w91 w91Var = this.f24564f0;
        e81 e81Var = this.f24554a;
        if (i10 != 2) {
            if (e81Var.p() != -9223372036854775807L) {
                w91Var.b((int) (e81Var.p() / 1000));
            } else {
                w91Var.b(0);
            }
        }
        x91 x91Var = this.v;
        if (i10 != 4 && i10 != 1 && e81Var.y()) {
            x91Var.e(this, true);
        } else {
            x91Var.e(this, false);
        }
        if (e81Var.y() && i10 != 4) {
            n();
        } else if (i10 == 4) {
            this.V = true;
            e81Var.B();
            e81Var.L(0L, false);
            n();
            w91Var.d(true, true);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.S) {
            this.S = false;
            if (this.T || this.U) {
                if (this.U) {
                    this.f24571r = 1;
                }
                this.f24570n.setSurfaceTexture(surfaceTexture);
                this.f24570n.setSurfaceTextureListener(this.f24568j0);
                this.f24570n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f24571r == 2) {
            ImageView imageView = this.f24561e;
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
            int i10 = this.f24565g0;
            int i11 = this.f24566h0;
            this.f24558c.getVideoRotation();
            this.v.f(this.f24564f0, false, i10, i11, this.I);
            this.f24571r = 0;
        }
    }

    @Override
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        float f10;
        kg0 kg0Var = this.f24558c;
        if (kg0Var != null) {
            float f11 = i10 * f7;
            this.f24565g0 = (int) f11;
            this.f24566h0 = i11;
            if (i11 == 0) {
                f10 = 1.0f;
            } else {
                f10 = f11 / i11;
            }
            kg0Var.a(f10, 0);
            if (this.T) {
                this.v.c(f10);
            }
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.M = true;
        this.L = System.currentTimeMillis();
        this.f24564f0.invalidate();
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
